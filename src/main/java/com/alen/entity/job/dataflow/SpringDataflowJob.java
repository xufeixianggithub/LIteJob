package com.alen.entity.job.dataflow;

import com.alen.factory.DataProcessFactory;
import com.alen.operation.DataProcess;
import com.dangdang.ddframe.job.api.ShardingContext;
import com.dangdang.ddframe.job.api.dataflow.DataflowJob;
import com.alen.entity.Foo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SpringDataflowJob implements DataflowJob {
    private DataProcess dataProcess = DataProcessFactory.getDataProcess();
    @Override
    public List fetchData(ShardingContext shardingContext) {
        List<Foo> result = new ArrayList<Foo>();
        result = dataProcess.getData(shardingContext.getShardingParameter(), shardingContext.getShardingTotalCount());
        System.out.println(String.format("------Thread ID: %s, Date: %s, Sharding Context: %s, Action: %s, Data: %s", Thread.currentThread().getId(), new Date(), shardingContext, "fetch data",result));
        return result;
    }

    @Override
    public void processData(ShardingContext shardingContext, List data) {
        System.out.println(String.format("------Thread ID: %s, Date: %s, Sharding Context: %s, Action: %s, Data: %s", Thread.currentThread().getId(), new Date(), shardingContext, "finish data",data));
        for(Object foo:data){
            Foo f=(Foo) foo;
            dataProcess.setData(f.getId());
        }
    }
}

package com.alen.factory;

import com.alen.operation.DataProcess;

public class DataProcessFactory {
      private static DataProcess dataProcess = new DataProcess();
         
        public static DataProcess getDataProcess() {
            return dataProcess;
        }
 
}
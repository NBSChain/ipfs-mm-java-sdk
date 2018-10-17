package net.nbsio.ipfs.helper;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import io.ipfs.api.JSONParser;
import net.nbsio.ipfs.beans.NodeBase;

import java.util.Map;

/**
 * Copyright © 2015-2020 NBSChain Holdings Limited.
 * All rights reserved.
 *
 * @project ipfs-mm
 * <p>
 * Author   : lanbery
 * Created  : 2018/10/17
 */
public class DataConvertHelper {
    
    private DataConvertHelper(){}
    
    private static class DataConvertHolder{
        public static DataConvertHelper instance = new DataConvertHelper();
    }
    
    public static DataConvertHelper getInstance(){
        return DataConvertHolder.instance;
    }
    
    /**
     * @author      : lanbery
     * @Datetime    : 2018/10/17
     * @Description  :
     * 
     */
    public NodeBase convertFromID(Map data){
        if(data==null)return null;
        String json = JSONParser.toString(data);
        return JSON.parseObject(json,new TypeReference<NodeBase>(){});
    }
}

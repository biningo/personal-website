package response;

import java.util.HashMap;
import java.util.Map;

/***
 *@Author icepan
 *@Date 2020/8/12 下午2:47
 *@Description 用于返回数据的统一封装 通用返回类
 *
 ***/


public class Result extends HashMap<String, Object> {

    public static final String CODE="code";
    public static final String MSG = "msg";
    public Result() {
    }

    public Result(Integer code, String msg) {
        put(CODE, code);
        put(MSG, msg);
    }

    public Result(Integer code,String msg,Map<String,Object> data){
        this(code,msg);
        for(Entry<String,Object> entry:data.entrySet()){
            put(entry.getKey(),entry.getValue());
        }
    }

    public static Result SUCCESS() {
        return new Result(ResultCode.SUCCESS, "success");
    }
    public static Result SUCCESS(String msg){
        return new Result(ResultCode.SUCCESS,msg);
    }
    public static Result SUCCESS(String msg,Map<String,Object> data){
        return new Result(200,msg,data);
    }




}

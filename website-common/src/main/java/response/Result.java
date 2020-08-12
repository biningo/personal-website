package response;

import java.util.HashMap;

/***
 *@Author icepan
 *@Date 2020/8/12 下午2:47
 *@Description 用于返回数据的统一封装 通用返回类
 *
 ***/


public class Result extends HashMap<String, Object> {


    public Result() {
    }

    public Result(Integer code, String msg) {
        put(ResultKey.CODE, code);
        put(ResultKey.MSG, msg);
    }

    public static Result OK() {
        return new Result(200, "OK");
    }


}

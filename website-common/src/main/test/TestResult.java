import response.Result;
import response.ResultCode;

/***
 *@Author icepan
 *@Date 2020/8/12 下午3:35
 *@Description
 *
 ***/


public class TestResult {
    public static void main(String[] args) {
        Result result = new Result(ResultCode.SUCCESS, "成功");
        System.out.println(result);
    }
}

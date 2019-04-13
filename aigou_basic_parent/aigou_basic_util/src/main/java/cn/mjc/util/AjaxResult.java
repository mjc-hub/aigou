package cn.mjc.util;

public class AjaxResult {
    private boolean success = true;
    private String msg;
    private Object object; //对象值:供我们在返回前台的时候，可以返回一个对象

    public static AjaxResult me() {
        return new AjaxResult();
    }

    public boolean isSuccess() {
        return success;
    }
    //链式编程
    public AjaxResult setSuccess(boolean success) {
        this.success = success;
        return  this;
    }

    public String getMsg() {
        return msg;
    }

    public AjaxResult setMsg(String msg) {
        this.msg = msg;
        return  this;
    }

    public Object getObject() {
        return object;
    }

    public AjaxResult setObject(Object object) {
        this.object = object;
        return  this;
    }

    @Override
    public String toString() {
        return "AjaxResult{" +
                "success=" + success +
                ", msg='" + msg + '\'' +
                ", object=" + object +
                '}';
    }
}

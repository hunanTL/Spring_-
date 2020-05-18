package com.tanlei;

/**
 * @author <a href="mailto:lei.tan@vtradex.net">谭磊/a>
 * @since 2020-05-18 15:25
 */
public class HelloWorld {

    private  String message;
    public void setMessage(String message){
       this.message=message;
    }

    public void  getMessage() {
        System.out.println("you Message : "+message);
    }
}

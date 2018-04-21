package i.krishnasony.aichat.Models;

/**
 * Created by Krishana Sony on 21-04-2018.
 */

public class SimsimiModel {
   public String response;
   public String msg;
   public String id;
  public   int result;

    public SimsimiModel(String response, String msg, String id, int result) {
        this.response = response;
        this.msg = msg;
        this.id = id;
        this.result = result;
    }

    public String getResponse() {
        return response;
    }

    public void setResponse(String response) {
        this.response = response;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }

    public SimsimiModel() {
    }
}

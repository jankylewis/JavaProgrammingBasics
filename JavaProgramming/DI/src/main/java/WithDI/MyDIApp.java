package WithDI;

public class MyDIApp implements IConsumer {

    private IMessageService iService;

    public MyDIApp(IMessageService _iService){
        this.iService = _iService;
    }

    @Override
    public void processMessages(String msg, String rec){

        //do some msg validation, manipulation logic etc
        this.iService.sendMessage(msg, rec);
    }
}

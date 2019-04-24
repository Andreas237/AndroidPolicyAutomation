// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.view;

import android.os.Message;
import android.view.LayoutInflater;

// Referenced classes of package android.support.v4.view:
//			AsyncLayoutInflater

class AsyncLayoutInflater$1
	implements android.os.Handler.Callback
{

	public boolean handleMessage(Message message)
	{
		message = ((Message) ((flateRequest)message.obj));
	//    0    0:aload_1         
	//    1    1:getfield        #26  <Field Object Message.obj>
	//    2    4:checkcast       #28  <Class AsyncLayoutInflater$InflateRequest>
	//    3    7:astore_1        
		if(((flateRequest) (message)).view == null)
	//*   4    8:aload_1         
	//*   5    9:getfield        #32  <Field android.view.View AsyncLayoutInflater$InflateRequest.view>
	//*   6   12:ifnonnull       38
			message.view = mInflater.inflate(((flateRequest) (message)).resid, ((flateRequest) (message)).parent, false);
	//    7   15:aload_1         
	//    8   16:aload_0         
	//    9   17:getfield        #14  <Field AsyncLayoutInflater this$0>
	//   10   20:getfield        #36  <Field LayoutInflater AsyncLayoutInflater.mInflater>
	//   11   23:aload_1         
	//   12   24:getfield        #40  <Field int AsyncLayoutInflater$InflateRequest.resid>
	//   13   27:aload_1         
	//   14   28:getfield        #44  <Field android.view.ViewGroup AsyncLayoutInflater$InflateRequest.parent>
	//   15   31:iconst_0        
	//   16   32:invokevirtual   #50  <Method android.view.View LayoutInflater.inflate(int, android.view.ViewGroup, boolean)>
	//   17   35:putfield        #32  <Field android.view.View AsyncLayoutInflater$InflateRequest.view>
		((flateRequest) (message)).callback.onInflateFinished(((flateRequest) (message)).view, ((flateRequest) (message)).resid, ((flateRequest) (message)).parent);
	//   18   38:aload_1         
	//   19   39:getfield        #54  <Field AsyncLayoutInflater$OnInflateFinishedListener AsyncLayoutInflater$InflateRequest.callback>
	//   20   42:aload_1         
	//   21   43:getfield        #32  <Field android.view.View AsyncLayoutInflater$InflateRequest.view>
	//   22   46:aload_1         
	//   23   47:getfield        #40  <Field int AsyncLayoutInflater$InflateRequest.resid>
	//   24   50:aload_1         
	//   25   51:getfield        #44  <Field android.view.ViewGroup AsyncLayoutInflater$InflateRequest.parent>
	//   26   54:invokeinterface #60  <Method void AsyncLayoutInflater$OnInflateFinishedListener.onInflateFinished(android.view.View, int, android.view.ViewGroup)>
		mInflateThread.releaseRequest(((flateRequest) (message)));
	//   27   59:aload_0         
	//   28   60:getfield        #14  <Field AsyncLayoutInflater this$0>
	//   29   63:getfield        #64  <Field AsyncLayoutInflater$InflateThread AsyncLayoutInflater.mInflateThread>
	//   30   66:aload_1         
	//   31   67:invokevirtual   #70  <Method void AsyncLayoutInflater$InflateThread.releaseRequest(AsyncLayoutInflater$InflateRequest)>
		return true;
	//   32   70:iconst_1        
	//   33   71:ireturn         
	}

	final AsyncLayoutInflater this$0;

	AsyncLayoutInflater$1()
	{
		this$0 = AsyncLayoutInflater.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #14  <Field AsyncLayoutInflater this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #17  <Method void Object()>
	//    5    9:return          
	}
}

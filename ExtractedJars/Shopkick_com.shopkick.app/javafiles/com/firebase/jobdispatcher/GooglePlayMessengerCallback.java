// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.firebase.jobdispatcher;

import android.os.*;

// Referenced classes of package com.firebase.jobdispatcher:
//			JobCallback

class GooglePlayMessengerCallback
	implements JobCallback
{

	GooglePlayMessengerCallback(Messenger messenger1, String s)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
		messenger = messenger1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #17  <Field Messenger messenger>
		tag = s;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #19  <Field String tag>
	//    8   14:return          
	}

	private Message createResultMessage(int i)
	{
		Message message = Message.obtain();
	//    0    0:invokestatic    #29  <Method Message Message.obtain()>
	//    1    3:astore_2        
		message.what = 3;
	//    2    4:aload_2         
	//    3    5:iconst_3        
	//    4    6:putfield        #33  <Field int Message.what>
		message.arg1 = i;
	//    5    9:aload_2         
	//    6   10:iload_1         
	//    7   11:putfield        #36  <Field int Message.arg1>
		Bundle bundle = new Bundle();
	//    8   14:new             #38  <Class Bundle>
	//    9   17:dup             
	//   10   18:invokespecial   #39  <Method void Bundle()>
	//   11   21:astore_3        
		bundle.putString("tag", tag);
	//   12   22:aload_3         
	//   13   23:ldc1            #40  <String "tag">
	//   14   25:aload_0         
	//   15   26:getfield        #19  <Field String tag>
	//   16   29:invokevirtual   #44  <Method void Bundle.putString(String, String)>
		message.setData(bundle);
	//   17   32:aload_2         
	//   18   33:aload_3         
	//   19   34:invokevirtual   #48  <Method void Message.setData(Bundle)>
		return message;
	//   20   37:aload_2         
	//   21   38:areturn         
	}

	public void jobFinished(int i)
	{
		try
		{
			messenger.send(createResultMessage(i));
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field Messenger messenger>
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:invokespecial   #55  <Method Message createResultMessage(int)>
	//    5    9:invokevirtual   #61  <Method void Messenger.send(Message)>
			return;
	//    6   12:return          
		}
		catch(RemoteException remoteexception)
	//*   7   13:astore_2        
		{
			throw new RuntimeException(((Throwable) (remoteexception)));
	//    8   14:new             #63  <Class RuntimeException>
	//    9   17:dup             
	//   10   18:aload_2         
	//   11   19:invokespecial   #66  <Method void RuntimeException(Throwable)>
	//   12   22:athrow          
		}
	}

	private final Messenger messenger;
	private final String tag;
}

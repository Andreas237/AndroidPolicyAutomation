// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.internal;

import android.content.*;
import android.os.*;

// Referenced classes of package com.facebook.internal:
//			NativeProtocol

public abstract class PlatformServiceClient
	implements ServiceConnection
{
	public static interface CompletedListener
	{

		public abstract void completed(Bundle bundle);
	}


	public PlatformServiceClient(Context context1, int i, int j, int k, String s)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #32  <Method void Object()>
		Context context2 = context1.getApplicationContext();
	//    2    4:aload_1         
	//    3    5:invokevirtual   #38  <Method Context Context.getApplicationContext()>
	//    4    8:astore          6
		if(context2 != null)
	//*   5   10:aload           6
	//*   6   12:ifnull          18
			context1 = context2;
	//    7   15:aload           6
	//    8   17:astore_1        
		context = context1;
	//    9   18:aload_0         
	//   10   19:aload_1         
	//   11   20:putfield        #40  <Field Context context>
		requestMessage = i;
	//   12   23:aload_0         
	//   13   24:iload_2         
	//   14   25:putfield        #42  <Field int requestMessage>
		replyMessage = j;
	//   15   28:aload_0         
	//   16   29:iload_3         
	//   17   30:putfield        #44  <Field int replyMessage>
		applicationId = s;
	//   18   33:aload_0         
	//   19   34:aload           5
	//   20   36:putfield        #46  <Field String applicationId>
		protocolVersion = k;
	//   21   39:aload_0         
	//   22   40:iload           4
	//   23   42:putfield        #48  <Field int protocolVersion>
	//   24   45:aload_0         
	//   25   46:new             #8   <Class PlatformServiceClient$1>
	//   26   49:dup             
	//   27   50:aload_0         
	//   28   51:invokespecial   #51  <Method void PlatformServiceClient$1(PlatformServiceClient)>
	//   29   54:putfield        #53  <Field Handler handler>
	//   30   57:return          
	}

	private void callback(Bundle bundle)
	{
		if(!running)
	//*   0    0:aload_0         
	//*   1    1:getfield        #58  <Field boolean running>
	//*   2    4:ifne            8
			return;
	//    3    7:return          
		running = false;
	//    4    8:aload_0         
	//    5    9:iconst_0        
	//    6   10:putfield        #58  <Field boolean running>
		CompletedListener completedlistener = listener;
	//    7   13:aload_0         
	//    8   14:getfield        #60  <Field PlatformServiceClient$CompletedListener listener>
	//    9   17:astore_2        
		if(completedlistener != null)
	//*  10   18:aload_2         
	//*  11   19:ifnull          29
			completedlistener.completed(bundle);
	//   12   22:aload_2         
	//   13   23:aload_1         
	//   14   24:invokeinterface #63  <Method void PlatformServiceClient$CompletedListener.completed(Bundle)>
	//   15   29:return          
	}

	private void sendMessage()
	{
		RemoteException remoteexception;
		Bundle bundle = new Bundle();
	//    0    0:new             #68  <Class Bundle>
	//    1    3:dup             
	//    2    4:invokespecial   #69  <Method void Bundle()>
	//    3    7:astore_1        
		bundle.putString("com.facebook.platform.extra.APPLICATION_ID", applicationId);
	//    4    8:aload_1         
	//    5    9:ldc1            #71  <String "com.facebook.platform.extra.APPLICATION_ID">
	//    6   11:aload_0         
	//    7   12:getfield        #46  <Field String applicationId>
	//    8   15:invokevirtual   #75  <Method void Bundle.putString(String, String)>
		populateRequestBundle(bundle);
	//    9   18:aload_0         
	//   10   19:aload_1         
	//   11   20:invokevirtual   #78  <Method void populateRequestBundle(Bundle)>
		Message message = Message.obtain(((Handler) (null)), requestMessage);
	//   12   23:aconst_null     
	//   13   24:aload_0         
	//   14   25:getfield        #42  <Field int requestMessage>
	//   15   28:invokestatic    #84  <Method Message Message.obtain(Handler, int)>
	//   16   31:astore_2        
		message.arg1 = protocolVersion;
	//   17   32:aload_2         
	//   18   33:aload_0         
	//   19   34:getfield        #48  <Field int protocolVersion>
	//   20   37:putfield        #87  <Field int Message.arg1>
		message.setData(bundle);
	//   21   40:aload_2         
	//   22   41:aload_1         
	//   23   42:invokevirtual   #90  <Method void Message.setData(Bundle)>
		message.replyTo = new Messenger(handler);
	//   24   45:aload_2         
	//   25   46:new             #92  <Class Messenger>
	//   26   49:dup             
	//   27   50:aload_0         
	//   28   51:getfield        #53  <Field Handler handler>
	//   29   54:invokespecial   #95  <Method void Messenger(Handler)>
	//   30   57:putfield        #98  <Field Messenger Message.replyTo>
		try
		{
			sender.send(message);
	//   31   60:aload_0         
	//   32   61:getfield        #100 <Field Messenger sender>
	//   33   64:aload_2         
	//   34   65:invokevirtual   #104 <Method void Messenger.send(Message)>
			return;
	//   35   68:return          
		}
	//*  36   69:aload_0         
	//*  37   70:aconst_null     
	//*  38   71:invokespecial   #106 <Method void callback(Bundle)>
	//*  39   74:return          
		// Misplaced declaration of an exception variable
		catch(RemoteException remoteexception)
		{
			callback(((Bundle) (null)));
		}
	//*  40   75:astore_1        
	//*  41   76:goto            69
	}

	public void cancel()
	{
		running = false;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #58  <Field boolean running>
	//    3    5:return          
	}

	protected Context getContext()
	{
		return context;
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field Context context>
	//    2    4:areturn         
	}

	protected void handleMessage(Message message)
	{
		if(message.what == replyMessage)
	//*   0    0:aload_1         
	//*   1    1:getfield        #112 <Field int Message.what>
	//*   2    4:aload_0         
	//*   3    5:getfield        #44  <Field int replyMessage>
	//*   4    8:icmpne          46
		{
			message = ((Message) (message.getData()));
	//    5   11:aload_1         
	//    6   12:invokevirtual   #116 <Method Bundle Message.getData()>
	//    7   15:astore_1        
			if(((Bundle) (message)).getString("com.facebook.platform.status.ERROR_TYPE") != null)
	//*   8   16:aload_1         
	//*   9   17:ldc1            #118 <String "com.facebook.platform.status.ERROR_TYPE">
	//*  10   19:invokevirtual   #122 <Method String Bundle.getString(String)>
	//*  11   22:ifnull          33
				callback(((Bundle) (null)));
	//   12   25:aload_0         
	//   13   26:aconst_null     
	//   14   27:invokespecial   #106 <Method void callback(Bundle)>
			else
	//*  15   30:goto            38
				callback(((Bundle) (message)));
	//   16   33:aload_0         
	//   17   34:aload_1         
	//   18   35:invokespecial   #106 <Method void callback(Bundle)>
			context.unbindService(((ServiceConnection) (this)));
	//   19   38:aload_0         
	//   20   39:getfield        #40  <Field Context context>
	//   21   42:aload_0         
	//   22   43:invokevirtual   #126 <Method void Context.unbindService(ServiceConnection)>
		}
	//   23   46:return          
	}

	public void onServiceConnected(ComponentName componentname, IBinder ibinder)
	{
		sender = new Messenger(ibinder);
	//    0    0:aload_0         
	//    1    1:new             #92  <Class Messenger>
	//    2    4:dup             
	//    3    5:aload_2         
	//    4    6:invokespecial   #131 <Method void Messenger(IBinder)>
	//    5    9:putfield        #100 <Field Messenger sender>
		sendMessage();
	//    6   12:aload_0         
	//    7   13:invokespecial   #133 <Method void sendMessage()>
	//    8   16:return          
	}

	public void onServiceDisconnected(ComponentName componentname)
	{
		sender = null;
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:putfield        #100 <Field Messenger sender>
		try
		{
			context.unbindService(((ServiceConnection) (this)));
	//    3    5:aload_0         
	//    4    6:getfield        #40  <Field Context context>
	//    5    9:aload_0         
	//    6   10:invokevirtual   #126 <Method void Context.unbindService(ServiceConnection)>
		}
	//*   7   13:aload_0         
	//*   8   14:aconst_null     
	//*   9   15:invokespecial   #106 <Method void callback(Bundle)>
	//*  10   18:return          
		// Misplaced declaration of an exception variable
		catch(ComponentName componentname) { }
	//   11   19:astore_1        
		callback(((Bundle) (null)));
	//*  12   20:goto            13
	}

	protected abstract void populateRequestBundle(Bundle bundle);

	public void setCompletedListener(CompletedListener completedlistener)
	{
		listener = completedlistener;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #60  <Field PlatformServiceClient$CompletedListener listener>
	//    3    5:return          
	}

	public boolean start()
	{
		if(running)
	//*   0    0:aload_0         
	//*   1    1:getfield        #58  <Field boolean running>
	//*   2    4:ifeq            9
			return false;
	//    3    7:iconst_0        
	//    4    8:ireturn         
		if(NativeProtocol.getLatestAvailableProtocolVersionForService(protocolVersion) == -1)
	//*   5    9:aload_0         
	//*   6   10:getfield        #48  <Field int protocolVersion>
	//*   7   13:invokestatic    #147 <Method int NativeProtocol.getLatestAvailableProtocolVersionForService(int)>
	//*   8   16:iconst_m1       
	//*   9   17:icmpne          22
			return false;
	//   10   20:iconst_0        
	//   11   21:ireturn         
		android.content.Intent intent = NativeProtocol.createPlatformServiceIntent(context);
	//   12   22:aload_0         
	//   13   23:getfield        #40  <Field Context context>
	//   14   26:invokestatic    #151 <Method android.content.Intent NativeProtocol.createPlatformServiceIntent(Context)>
	//   15   29:astore_1        
		if(intent == null)
	//*  16   30:aload_1         
	//*  17   31:ifnonnull       36
		{
			return false;
	//   18   34:iconst_0        
	//   19   35:ireturn         
		} else
		{
			running = true;
	//   20   36:aload_0         
	//   21   37:iconst_1        
	//   22   38:putfield        #58  <Field boolean running>
			context.bindService(intent, ((ServiceConnection) (this)), 1);
	//   23   41:aload_0         
	//   24   42:getfield        #40  <Field Context context>
	//   25   45:aload_1         
	//   26   46:aload_0         
	//   27   47:iconst_1        
	//   28   48:invokevirtual   #155 <Method boolean Context.bindService(android.content.Intent, ServiceConnection, int)>
	//   29   51:pop             
			return true;
	//   30   52:iconst_1        
	//   31   53:ireturn         
		}
	}

	private final String applicationId;
	private final Context context;
	private final Handler handler = new Handler() {

		public void handleMessage(Message message)
		{
			PlatformServiceClient.this.handleMessage(message);
		//    0    0:aload_0         
		//    1    1:getfield        #14  <Field PlatformServiceClient this$0>
		//    2    4:aload_1         
		//    3    5:invokevirtual   #22  <Method void PlatformServiceClient.handleMessage(Message)>
		//    4    8:return          
		}

		final PlatformServiceClient this$0;

			
			{
				this$0 = PlatformServiceClient.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #14  <Field PlatformServiceClient this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #17  <Method void Handler()>
			//    5    9:return          
			}
	}
;
	private CompletedListener listener;
	private final int protocolVersion;
	private int replyMessage;
	private int requestMessage;
	private boolean running;
	private Messenger sender;
}

// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.firebase.jobdispatcher;

import android.app.AppOpsManager;
import android.content.Context;
import android.os.*;
import android.util.Log;

// Referenced classes of package com.firebase.jobdispatcher:
//			GooglePlayMessengerCallback, GooglePlayReceiver, ExecutionDelegator, JobCoder

class GooglePlayMessageHandler extends Handler
{

	public GooglePlayMessageHandler(Looper looper, GooglePlayReceiver googleplayreceiver)
	{
		super(looper);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #23  <Method void Handler(Looper)>
		googlePlayReceiver = googleplayreceiver;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #25  <Field GooglePlayReceiver googlePlayReceiver>
	//    6   10:return          
	}

	private void handleStartMessage(Message message)
	{
		Bundle bundle = message.getData();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #34  <Method Bundle Message.getData()>
	//    2    4:astore_2        
		message = ((Message) (message.replyTo));
	//    3    5:aload_1         
	//    4    6:getfield        #38  <Field android.os.Messenger Message.replyTo>
	//    5    9:astore_1        
		String s = bundle.getString("tag");
	//    6   10:aload_2         
	//    7   11:ldc1            #40  <String "tag">
	//    8   13:invokevirtual   #46  <Method String Bundle.getString(String)>
	//    9   16:astore_3        
		if(message != null && s != null)
	//*  10   17:aload_1         
	//*  11   18:ifnull          60
	//*  12   21:aload_3         
	//*  13   22:ifnonnull       28
	//*  14   25:goto            60
		{
			message = ((Message) (new GooglePlayMessengerCallback(((android.os.Messenger) (message)), s)));
	//   15   28:new             #48  <Class GooglePlayMessengerCallback>
	//   16   31:dup             
	//   17   32:aload_1         
	//   18   33:aload_3         
	//   19   34:invokespecial   #51  <Method void GooglePlayMessengerCallback(android.os.Messenger, String)>
	//   20   37:astore_1        
			message = ((Message) (googlePlayReceiver.prepareJob(((JobCallback) (message)), bundle)));
	//   21   38:aload_0         
	//   22   39:getfield        #25  <Field GooglePlayReceiver googlePlayReceiver>
	//   23   42:aload_1         
	//   24   43:aload_2         
	//   25   44:invokevirtual   #57  <Method JobInvocation GooglePlayReceiver.prepareJob(JobCallback, Bundle)>
	//   26   47:astore_1        
			googlePlayReceiver.getExecutionDelegator().executeJob(((JobInvocation) (message)));
	//   27   48:aload_0         
	//   28   49:getfield        #25  <Field GooglePlayReceiver googlePlayReceiver>
	//   29   52:invokevirtual   #61  <Method ExecutionDelegator GooglePlayReceiver.getExecutionDelegator()>
	//   30   55:aload_1         
	//   31   56:invokevirtual   #67  <Method void ExecutionDelegator.executeJob(JobInvocation)>
			return;
	//   32   59:return          
		}
		if(Log.isLoggable("FJD.GooglePlayReceiver", 3))
	//*  33   60:ldc1            #69  <String "FJD.GooglePlayReceiver">
	//*  34   62:iconst_3        
	//*  35   63:invokestatic    #75  <Method boolean Log.isLoggable(String, int)>
	//*  36   66:ifeq            77
			Log.d("FJD.GooglePlayReceiver", "Invalid start execution message.");
	//   37   69:ldc1            #69  <String "FJD.GooglePlayReceiver">
	//   38   71:ldc1            #77  <String "Invalid start execution message.">
	//   39   73:invokestatic    #81  <Method int Log.d(String, String)>
	//   40   76:pop             
	//   41   77:return          
	}

	private void handleStopMessage(Message message)
	{
		message = ((Message) (GooglePlayReceiver.getJobCoder().decode(message.getData())));
	//    0    0:invokestatic    #86  <Method JobCoder GooglePlayReceiver.getJobCoder()>
	//    1    3:aload_1         
	//    2    4:invokevirtual   #34  <Method Bundle Message.getData()>
	//    3    7:invokevirtual   #92  <Method JobInvocation$Builder JobCoder.decode(Bundle)>
	//    4   10:astore_1        
		if(message == null)
	//*   5   11:aload_1         
	//*   6   12:ifnonnull       33
		{
			if(Log.isLoggable("FJD.GooglePlayReceiver", 3))
	//*   7   15:ldc1            #69  <String "FJD.GooglePlayReceiver">
	//*   8   17:iconst_3        
	//*   9   18:invokestatic    #75  <Method boolean Log.isLoggable(String, int)>
	//*  10   21:ifeq            32
				Log.d("FJD.GooglePlayReceiver", "Invalid stop execution message.");
	//   11   24:ldc1            #69  <String "FJD.GooglePlayReceiver">
	//   12   26:ldc1            #94  <String "Invalid stop execution message.">
	//   13   28:invokestatic    #81  <Method int Log.d(String, String)>
	//   14   31:pop             
			return;
	//   15   32:return          
		} else
		{
			ExecutionDelegator.stopJob(((JobInvocation.Builder) (message)).build(), true);
	//   16   33:aload_1         
	//   17   34:invokevirtual   #100 <Method JobInvocation JobInvocation$Builder.build()>
	//   18   37:iconst_1        
	//   19   38:invokestatic    #104 <Method void ExecutionDelegator.stopJob(JobInvocation, boolean)>
			return;
	//   20   41:return          
		}
	}

	public void handleMessage(Message message)
	{
		if(message == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       5
			return;
	//    2    4:return          
		AppOpsManager appopsmanager = (AppOpsManager)googlePlayReceiver.getApplicationContext().getSystemService("appops");
	//    3    5:aload_0         
	//    4    6:getfield        #25  <Field GooglePlayReceiver googlePlayReceiver>
	//    5    9:invokevirtual   #111 <Method Context GooglePlayReceiver.getApplicationContext()>
	//    6   12:ldc1            #113 <String "appops">
	//    7   14:invokevirtual   #119 <Method Object Context.getSystemService(String)>
	//    8   17:checkcast       #121 <Class AppOpsManager>
	//    9   20:astore_3        
		int i;
		try
		{
			appopsmanager.checkPackage(message.sendingUid, "com.google.android.gms");
	//   10   21:aload_3         
	//   11   22:aload_1         
	//   12   23:getfield        #124 <Field int Message.sendingUid>
	//   13   26:ldc1            #126 <String "com.google.android.gms">
	//   14   28:invokevirtual   #130 <Method void AppOpsManager.checkPackage(int, String)>
		}
	//*  15   31:aload_1         
	//*  16   32:getfield        #133 <Field int Message.what>
	//*  17   35:istore_2        
	//*  18   36:iload_2         
	//*  19   37:iconst_4        
	//*  20   38:icmpeq          107
	//*  21   41:iload_2         
	//*  22   42:tableswitch     1 2: default 64
	//	               1 102
	//	               2 96
	//*  23   64:new             #135 <Class StringBuilder>
	//*  24   67:dup             
	//*  25   68:invokespecial   #138 <Method void StringBuilder()>
	//*  26   71:astore_3        
	//*  27   72:aload_3         
	//*  28   73:ldc1            #140 <String "Unrecognized message received: ">
	//*  29   75:invokevirtual   #144 <Method StringBuilder StringBuilder.append(String)>
	//*  30   78:pop             
	//*  31   79:aload_3         
	//*  32   80:aload_1         
	//*  33   81:invokevirtual   #147 <Method StringBuilder StringBuilder.append(Object)>
	//*  34   84:pop             
	//*  35   85:ldc1            #69  <String "FJD.GooglePlayReceiver">
	//*  36   87:aload_3         
	//*  37   88:invokevirtual   #151 <Method String StringBuilder.toString()>
	//*  38   91:invokestatic    #154 <Method int Log.e(String, String)>
	//*  39   94:pop             
	//*  40   95:return          
	//*  41   96:aload_0         
	//*  42   97:aload_1         
	//*  43   98:invokespecial   #156 <Method void handleStopMessage(Message)>
	//*  44  101:return          
	//*  45  102:aload_0         
	//*  46  103:aload_1         
	//*  47  104:invokespecial   #158 <Method void handleStartMessage(Message)>
	//*  48  107:return          
	//*  49  108:ldc1            #69  <String "FJD.GooglePlayReceiver">
	//*  50  110:ldc1            #160 <String "Message was not sent from GCM.">
	//*  51  112:invokestatic    #154 <Method int Log.e(String, String)>
	//*  52  115:pop             
	//*  53  116:return          
		// Misplaced declaration of an exception variable
		catch(Message message)
		{
			Log.e("FJD.GooglePlayReceiver", "Message was not sent from GCM.");
			return;
		}
		i = message.what;
		if(i != 4)
			switch(i)
			{
			default:
				StringBuilder stringbuilder = new StringBuilder();
				stringbuilder.append("Unrecognized message received: ");
				stringbuilder.append(((Object) (message)));
				Log.e("FJD.GooglePlayReceiver", stringbuilder.toString());
				return;

			case 2: // '\002'
				handleStopMessage(message);
				return;

			case 1: // '\001'
				handleStartMessage(message);
				break;
			}
	//*  54  117:astore_1        
	//*  55  118:goto            108
	}

	private static final int MSG_INIT = 4;
	static final int MSG_RESULT = 3;
	static final int MSG_START_EXEC = 1;
	static final int MSG_STOP_EXEC = 2;
	private final GooglePlayReceiver googlePlayReceiver;
}

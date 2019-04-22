// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.firebase.client.android;

import android.content.Context;
import android.os.Handler;
import com.firebase.client.Firebase;
import com.firebase.client.utilities.DefaultRunLoop;
import com.firebase.client.utilities.LogWrapper;

// Referenced classes of package com.firebase.client.android:
//			AndroidPlatform

class AndroidPlatform$1$1
	implements Runnable
{

	public void run()
	{
		throw new RuntimeException(val$message, val$e);
	//    0    0:new             #32  <Class RuntimeException>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #23  <Field String val$message>
	//    4    8:aload_0         
	//    5    9:getfield        #25  <Field Throwable val$e>
	//    6   12:invokespecial   #35  <Method void RuntimeException(String, Throwable)>
	//    7   15:athrow          
	}

	final AndroidPlatform._cls1 this$1;
	final Throwable val$e;
	final String val$message;

	AndroidPlatform$1$1()
	{
		this$1 = final__pcls1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #21  <Field AndroidPlatform$1 this$1>
		val$message = s;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #23  <Field String val$message>
		val$e = Throwable.this;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #25  <Field Throwable val$e>
		super();
	//    9   15:aload_0         
	//   10   16:invokespecial   #28  <Method void Object()>
	//   11   19:return          
	}

	// Unreferenced inner class com/firebase/client/android/AndroidPlatform$1

/* anonymous class */
	class AndroidPlatform._cls1 extends DefaultRunLoop
	{

		public void handleException(Throwable throwable)
		{
			final String message = ((String) (new StringBuilder()));
		//    0    0:new             #29  <Class StringBuilder>
		//    1    3:dup             
		//    2    4:invokespecial   #30  <Method void StringBuilder()>
		//    3    7:astore_2        
			((StringBuilder) (message)).append("Uncaught exception in Firebase runloop (");
		//    4    8:aload_2         
		//    5    9:ldc1            #32  <String "Uncaught exception in Firebase runloop (">
		//    6   11:invokevirtual   #36  <Method StringBuilder StringBuilder.append(String)>
		//    7   14:pop             
			((StringBuilder) (message)).append(Firebase.getSdkVersion());
		//    8   15:aload_2         
		//    9   16:invokestatic    #42  <Method String Firebase.getSdkVersion()>
		//   10   19:invokevirtual   #36  <Method StringBuilder StringBuilder.append(String)>
		//   11   22:pop             
			((StringBuilder) (message)).append("). Please report to support@firebase.com");
		//   12   23:aload_2         
		//   13   24:ldc1            #44  <String "). Please report to support@firebase.com">
		//   14   26:invokevirtual   #36  <Method StringBuilder StringBuilder.append(String)>
		//   15   29:pop             
			message = ((StringBuilder) (message)).toString();
		//   16   30:aload_2         
		//   17   31:invokevirtual   #47  <Method String StringBuilder.toString()>
		//   18   34:astore_2        
			logger.error(message, throwable);
		//   19   35:aload_0         
		//   20   36:getfield        #21  <Field LogWrapper val$logger>
		//   21   39:aload_2         
		//   22   40:aload_1         
		//   23   41:invokevirtual   #53  <Method void LogWrapper.error(String, Throwable)>
			(new Handler(AndroidPlatform.access$000(AndroidPlatform.this).getMainLooper())).post(((Runnable) (((AndroidPlatform._cls1._cls1) (throwable)). new AndroidPlatform._cls1._cls1())));
		//   24   44:new             #55  <Class Handler>
		//   25   47:dup             
		//   26   48:aload_0         
		//   27   49:getfield        #19  <Field AndroidPlatform this$0>
		//   28   52:invokestatic    #59  <Method Context AndroidPlatform.access$000(AndroidPlatform)>
		//   29   55:invokevirtual   #65  <Method android.os.Looper Context.getMainLooper()>
		//   30   58:invokespecial   #68  <Method void Handler(android.os.Looper)>
		//   31   61:new             #11  <Class AndroidPlatform$1$1>
		//   32   64:dup             
		//   33   65:aload_0         
		//   34   66:aload_2         
		//   35   67:aload_1         
		//   36   68:invokespecial   #71  <Method void AndroidPlatform$1$1(AndroidPlatform$1, String, Throwable)>
		//   37   71:invokevirtual   #75  <Method boolean Handler.post(Runnable)>
		//   38   74:pop             
		//   39   75:return          
		}

		final AndroidPlatform this$0;
		final LogWrapper val$logger;

			
			{
				this$0 = final_androidplatform;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field AndroidPlatform this$0>
				logger = LogWrapper.this;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #21  <Field LogWrapper val$logger>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #24  <Method void DefaultRunLoop()>
			//    8   14:return          
			}
	}

}

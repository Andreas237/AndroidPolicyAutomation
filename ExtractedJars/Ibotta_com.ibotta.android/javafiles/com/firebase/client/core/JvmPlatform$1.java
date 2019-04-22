// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.firebase.client.core;

import com.firebase.client.Firebase;
import com.firebase.client.utilities.DefaultRunLoop;
import com.firebase.client.utilities.LogWrapper;

// Referenced classes of package com.firebase.client.core:
//			JvmPlatform

class JvmPlatform$1 extends DefaultRunLoop
{

	public void handleException(Throwable throwable)
	{
		LogWrapper logwrapper = val$logger;
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field LogWrapper val$logger>
	//    2    4:astore_2        
		StringBuilder stringbuilder = new StringBuilder();
	//    3    5:new             #27  <Class StringBuilder>
	//    4    8:dup             
	//    5    9:invokespecial   #28  <Method void StringBuilder()>
	//    6   12:astore_3        
		stringbuilder.append("Uncaught exception in Firebase runloop (");
	//    7   13:aload_3         
	//    8   14:ldc1            #30  <String "Uncaught exception in Firebase runloop (">
	//    9   16:invokevirtual   #34  <Method StringBuilder StringBuilder.append(String)>
	//   10   19:pop             
		stringbuilder.append(Firebase.getSdkVersion());
	//   11   20:aload_3         
	//   12   21:invokestatic    #40  <Method String Firebase.getSdkVersion()>
	//   13   24:invokevirtual   #34  <Method StringBuilder StringBuilder.append(String)>
	//   14   27:pop             
		stringbuilder.append("). Please report to support@firebase.com");
	//   15   28:aload_3         
	//   16   29:ldc1            #42  <String "). Please report to support@firebase.com">
	//   17   31:invokevirtual   #34  <Method StringBuilder StringBuilder.append(String)>
	//   18   34:pop             
		logwrapper.error(stringbuilder.toString(), throwable);
	//   19   35:aload_2         
	//   20   36:aload_3         
	//   21   37:invokevirtual   #45  <Method String StringBuilder.toString()>
	//   22   40:aload_1         
	//   23   41:invokevirtual   #51  <Method void LogWrapper.error(String, Throwable)>
	//   24   44:return          
	}

	final JvmPlatform this$0;
	final LogWrapper val$logger;

	JvmPlatform$1()
	{
		this$0 = final_jvmplatform;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field JvmPlatform this$0>
		val$logger = LogWrapper.this;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #19  <Field LogWrapper val$logger>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #22  <Method void DefaultRunLoop()>
	//    8   14:return          
	}
}

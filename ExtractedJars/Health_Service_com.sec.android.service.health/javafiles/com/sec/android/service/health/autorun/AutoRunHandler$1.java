// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.sec.android.service.health.autorun;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.sec.android.service.health.util.LOG;

// Referenced classes of package com.sec.android.service.health.autorun:
//			AutoRunHandler

class AutoRunHandler$1
	implements ServiceConnection
{

	public void onServiceConnected(ComponentName componentname, IBinder ibinder)
	{
		LOG.d(AutoRunHandler.access$000(), "onServiceConnected() : IAASA");
	//    0    0:invokestatic    #24  <Method Class AutoRunHandler.access$000()>
	//    1    3:ldc1            #26  <String "onServiceConnected() : IAASA">
	//    2    5:invokestatic    #32  <Method void LOG.d(Class, String)>
		AutoRunHandler.access$102(AutoRunHandler.this, com.samsung.aasaservice.IAASA.Stub.asInterface(ibinder));
	//    3    8:aload_0         
	//    4    9:getfield        #14  <Field AutoRunHandler this$0>
	//    5   12:aload_2         
	//    6   13:invokestatic    #38  <Method com.samsung.aasaservice.IAASA com.samsung.aasaservice.IAASA$Stub.asInterface(IBinder)>
	//    7   16:invokestatic    #42  <Method com.samsung.aasaservice.IAASA AutoRunHandler.access$102(AutoRunHandler, com.samsung.aasaservice.IAASA)>
	//    8   19:pop             
	//    9   20:return          
	}

	public void onServiceDisconnected(ComponentName componentname)
	{
		LOG.d(AutoRunHandler.access$000(), "onServiceConnected() : IAASA");
	//    0    0:invokestatic    #24  <Method Class AutoRunHandler.access$000()>
	//    1    3:ldc1            #26  <String "onServiceConnected() : IAASA">
	//    2    5:invokestatic    #32  <Method void LOG.d(Class, String)>
	//    3    8:return          
	}

	final AutoRunHandler this$0;

	AutoRunHandler$1()
	{
		this$0 = AutoRunHandler.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #14  <Field AutoRunHandler this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #17  <Method void Object()>
	//    5    9:return          
	}
}

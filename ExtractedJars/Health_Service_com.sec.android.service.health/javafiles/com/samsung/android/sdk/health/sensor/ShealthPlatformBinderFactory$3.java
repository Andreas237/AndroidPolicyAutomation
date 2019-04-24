// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.samsung.android.sdk.health.sensor;

import android.util.Log;

// Referenced classes of package com.samsung.android.sdk.health.sensor:
//			ShealthPlatformBinderFactory

class ShealthPlatformBinderFactory$3
	implements Runnable
{

	public void run()
	{
		if(val$btrueConneced)
	//*   0    0:aload_0         
	//*   1    1:getfield        #25  <Field boolean val$btrueConneced>
	//*   2    4:ifeq            59
		{
			Log.d(ShealthPlatformBinderFactory.access$000(), (new StringBuilder()).append(((Object) (val$u.mListener)).hashCode()).append("").toString());
	//    3    7:invokestatic    #38  <Method String ShealthPlatformBinderFactory.access$000()>
	//    4   10:new             #40  <Class StringBuilder>
	//    5   13:dup             
	//    6   14:invokespecial   #41  <Method void StringBuilder()>
	//    7   17:aload_0         
	//    8   18:getfield        #27  <Field ShealthPlatformBinderFactory$SensorObjectDetails val$u>
	//    9   21:getfield        #47  <Field ShealthPlatformDeviceFinder$ServiceConnectionListener ShealthPlatformBinderFactory$SensorObjectDetails.mListener>
	//   10   24:invokevirtual   #51  <Method int Object.hashCode()>
	//   11   27:invokevirtual   #55  <Method StringBuilder StringBuilder.append(int)>
	//   12   30:ldc1            #57  <String "">
	//   13   32:invokevirtual   #60  <Method StringBuilder StringBuilder.append(String)>
	//   14   35:invokevirtual   #63  <Method String StringBuilder.toString()>
	//   15   38:invokestatic    #69  <Method int Log.d(String, String)>
	//   16   41:pop             
			val$u.mListener.onServiceConnected(val$errorNumber);
	//   17   42:aload_0         
	//   18   43:getfield        #27  <Field ShealthPlatformBinderFactory$SensorObjectDetails val$u>
	//   19   46:getfield        #47  <Field ShealthPlatformDeviceFinder$ServiceConnectionListener ShealthPlatformBinderFactory$SensorObjectDetails.mListener>
	//   20   49:aload_0         
	//   21   50:getfield        #29  <Field int val$errorNumber>
	//   22   53:invokeinterface #75  <Method void ShealthPlatformDeviceFinder$ServiceConnectionListener.onServiceConnected(int)>
			return;
	//   23   58:return          
		} else
		{
			val$u.mListener.onServiceDisconnected(val$errorNumber);
	//   24   59:aload_0         
	//   25   60:getfield        #27  <Field ShealthPlatformBinderFactory$SensorObjectDetails val$u>
	//   26   63:getfield        #47  <Field ShealthPlatformDeviceFinder$ServiceConnectionListener ShealthPlatformBinderFactory$SensorObjectDetails.mListener>
	//   27   66:aload_0         
	//   28   67:getfield        #29  <Field int val$errorNumber>
	//   29   70:invokeinterface #78  <Method void ShealthPlatformDeviceFinder$ServiceConnectionListener.onServiceDisconnected(int)>
			return;
	//   30   75:return          
		}
	}

	final ShealthPlatformBinderFactory this$0;
	final boolean val$btrueConneced;
	final int val$errorNumber;
	final nsorObjectDetails val$u;

	ShealthPlatformBinderFactory$3()
	{
		this$0 = final_shealthplatformbinderfactory;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #23  <Field ShealthPlatformBinderFactory this$0>
		val$btrueConneced = flag;
	//    3    5:aload_0         
	//    4    6:iload_2         
	//    5    7:putfield        #25  <Field boolean val$btrueConneced>
		val$u = nsorobjectdetails;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #27  <Field ShealthPlatformBinderFactory$SensorObjectDetails val$u>
		val$errorNumber = I.this;
	//    9   15:aload_0         
	//   10   16:iload           4
	//   11   18:putfield        #29  <Field int val$errorNumber>
		super();
	//   12   21:aload_0         
	//   13   22:invokespecial   #32  <Method void Object()>
	//   14   25:return          
	}
}

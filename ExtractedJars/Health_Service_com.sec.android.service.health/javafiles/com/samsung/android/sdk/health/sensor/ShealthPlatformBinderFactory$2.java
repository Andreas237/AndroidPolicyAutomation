// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.samsung.android.sdk.health.sensor;


// Referenced classes of package com.samsung.android.sdk.health.sensor:
//			ShealthPlatformBinderFactory

class ShealthPlatformBinderFactory$2
	implements Runnable
{

	public void run()
	{
		if(val$btrueConneced)
	//*   0    0:aload_0         
	//*   1    1:getfield        #25  <Field boolean val$btrueConneced>
	//*   2    4:ifeq            24
		{
			val$u.mListener.onServiceConnected(val$errorNumber);
	//    3    7:aload_0         
	//    4    8:getfield        #27  <Field ShealthPlatformBinderFactory$SensorObjectDetails val$u>
	//    5   11:getfield        #40  <Field ShealthPlatformDeviceFinder$ServiceConnectionListener ShealthPlatformBinderFactory$SensorObjectDetails.mListener>
	//    6   14:aload_0         
	//    7   15:getfield        #29  <Field int val$errorNumber>
	//    8   18:invokeinterface #46  <Method void ShealthPlatformDeviceFinder$ServiceConnectionListener.onServiceConnected(int)>
			return;
	//    9   23:return          
		} else
		{
			val$u.mListener.onServiceDisconnected(val$errorNumber);
	//   10   24:aload_0         
	//   11   25:getfield        #27  <Field ShealthPlatformBinderFactory$SensorObjectDetails val$u>
	//   12   28:getfield        #40  <Field ShealthPlatformDeviceFinder$ServiceConnectionListener ShealthPlatformBinderFactory$SensorObjectDetails.mListener>
	//   13   31:aload_0         
	//   14   32:getfield        #29  <Field int val$errorNumber>
	//   15   35:invokeinterface #49  <Method void ShealthPlatformDeviceFinder$ServiceConnectionListener.onServiceDisconnected(int)>
			return;
	//   16   40:return          
		}
	}

	final ShealthPlatformBinderFactory this$0;
	final boolean val$btrueConneced;
	final int val$errorNumber;
	final nsorObjectDetails val$u;

	ShealthPlatformBinderFactory$2()
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

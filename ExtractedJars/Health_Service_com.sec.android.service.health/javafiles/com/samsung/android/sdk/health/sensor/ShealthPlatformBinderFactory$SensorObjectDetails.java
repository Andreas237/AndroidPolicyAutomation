// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.samsung.android.sdk.health.sensor;


// Referenced classes of package com.samsung.android.sdk.health.sensor:
//			ShealthPlatformBinderFactory

class ShealthPlatformBinderFactory$SensorObjectDetails
{

	ener mListener;
	long mObjId;
	int mObjType;
	final ShealthPlatformBinderFactory this$0;

	public ShealthPlatformBinderFactory$SensorObjectDetails(int i, long l, ener ener)
	{
		this$0 = ShealthPlatformBinderFactory.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field ShealthPlatformBinderFactory this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #22  <Method void Object()>
		mObjType = i;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #24  <Field int mObjType>
		mObjId = l;
	//    8   14:aload_0         
	//    9   15:lload_3         
	//   10   16:putfield        #26  <Field long mObjId>
		mListener = ener;
	//   11   19:aload_0         
	//   12   20:aload           5
	//   13   22:putfield        #28  <Field ShealthPlatformDeviceFinder$ServiceConnectionListener mListener>
	//   14   25:return          
	}
}

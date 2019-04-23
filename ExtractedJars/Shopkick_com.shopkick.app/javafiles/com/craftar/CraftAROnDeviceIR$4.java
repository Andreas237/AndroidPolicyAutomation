// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.craftar;


// Referenced classes of package com.craftar:
//			CraftAROnDeviceIR, CraftARQueryImage

class CraftAROnDeviceIR$4
	implements Runnable
{

	public void run()
	{
		CraftAROnDeviceIR.access$200(CraftAROnDeviceIR.this, val$image, val$requestCode);
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field CraftAROnDeviceIR this$0>
	//    2    4:aload_0         
	//    3    5:getfield        #23  <Field CraftARQueryImage val$image>
	//    4    8:aload_0         
	//    5    9:getfield        #25  <Field int val$requestCode>
	//    6   12:invokestatic    #33  <Method void CraftAROnDeviceIR.access$200(CraftAROnDeviceIR, CraftARQueryImage, int)>
	//    7   15:return          
	}

	final CraftAROnDeviceIR this$0;
	final CraftARQueryImage val$image;
	final int val$requestCode;

	CraftAROnDeviceIR$4()
	{
		this$0 = final_craftarondeviceir;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #21  <Field CraftAROnDeviceIR this$0>
		val$image = craftarqueryimage;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #23  <Field CraftARQueryImage val$image>
		val$requestCode = I.this;
	//    6   10:aload_0         
	//    7   11:iload_3         
	//    8   12:putfield        #25  <Field int val$requestCode>
		super();
	//    9   15:aload_0         
	//   10   16:invokespecial   #28  <Method void Object()>
	//   11   19:return          
	}
}

// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.craftar;


// Referenced classes of package com.craftar:
//			CraftAROnDeviceIR, CraftARQueryImage

class CraftAROnDeviceIR$5
	implements Runnable
{

	public void run()
	{
		CraftAROnDeviceIR.access$200(CraftAROnDeviceIR.this, val$image, -1);
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field CraftAROnDeviceIR this$0>
	//    2    4:aload_0         
	//    3    5:getfield        #21  <Field CraftARQueryImage val$image>
	//    4    8:iconst_m1       
	//    5    9:invokestatic    #30  <Method void CraftAROnDeviceIR.access$200(CraftAROnDeviceIR, CraftARQueryImage, int)>
		CraftAROnDeviceIR craftarondeviceir = CraftAROnDeviceIR.this;
	//    6   12:aload_0         
	//    7   13:getfield        #19  <Field CraftAROnDeviceIR this$0>
	//    8   16:astore_1        
		craftarondeviceir.queryIdentifier = craftarondeviceir.queryIdentifier + 1L;
	//    9   17:aload_1         
	//   10   18:aload_1         
	//   11   19:getfield        #34  <Field long CraftAROnDeviceIR.queryIdentifier>
	//   12   22:lconst_1        
	//   13   23:ladd            
	//   14   24:putfield        #34  <Field long CraftAROnDeviceIR.queryIdentifier>
	//   15   27:return          
	}

	final CraftAROnDeviceIR this$0;
	final CraftARQueryImage val$image;

	CraftAROnDeviceIR$5()
	{
		this$0 = final_craftarondeviceir;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field CraftAROnDeviceIR this$0>
		val$image = CraftARQueryImage.this;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #21  <Field CraftARQueryImage val$image>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #24  <Method void Object()>
	//    8   14:return          
	}
}

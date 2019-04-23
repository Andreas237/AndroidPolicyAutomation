// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.craftar;


// Referenced classes of package com.craftar:
//			CraftAROnDeviceIR

class CraftAROnDeviceIR$3
	implements Runnable
{

	public void run()
	{
		CraftAROnDeviceIR.access$100(CraftAROnDeviceIR.this, val$collectionUUID);
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field CraftAROnDeviceIR this$0>
	//    2    4:aload_0         
	//    3    5:getfield        #21  <Field String val$collectionUUID>
	//    4    8:invokestatic    #29  <Method void CraftAROnDeviceIR.access$100(CraftAROnDeviceIR, String)>
	//    5   11:return          
	}

	final CraftAROnDeviceIR this$0;
	final String val$collectionUUID;

	CraftAROnDeviceIR$3()
	{
		this$0 = final_craftarondeviceir;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field CraftAROnDeviceIR this$0>
		val$collectionUUID = String.this;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #21  <Field String val$collectionUUID>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #24  <Method void Object()>
	//    8   14:return          
	}
}

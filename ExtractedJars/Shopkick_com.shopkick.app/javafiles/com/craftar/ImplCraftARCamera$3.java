// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.craftar;


// Referenced classes of package com.craftar:
//			ImplCraftARCamera

class ImplCraftARCamera$3
	implements aramsTask
{

	public void onDone()
	{
	//    0    0:return          
	}

	public void updateCameraParams(android.hardware.Camera.Parameters parameters)
	{
		parameters.setFlashMode(val$mode);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #21  <Field String val$mode>
	//    3    5:invokevirtual   #33  <Method void android.hardware.Camera$Parameters.setFlashMode(String)>
	//    4    8:return          
	}

	final ImplCraftARCamera this$0;
	final String val$mode;

	ImplCraftARCamera$3()
	{
		this$0 = final_implcraftarcamera;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field ImplCraftARCamera this$0>
		val$mode = String.this;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #21  <Field String val$mode>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #24  <Method void Object()>
	//    8   14:return          
	}
}

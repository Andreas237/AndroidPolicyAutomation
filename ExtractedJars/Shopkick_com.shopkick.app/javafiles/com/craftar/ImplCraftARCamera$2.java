// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.craftar;


// Referenced classes of package com.craftar:
//			ImplCraftARCamera

class ImplCraftARCamera$2
	implements aramsTask
{

	public void onDone()
	{
	//    0    0:return          
	}

	public void updateCameraParams(android.hardware.Camera.Parameters parameters)
	{
		if(val$cameraSize.width == 320)
	//*   0    0:aload_0         
	//*   1    1:getfield        #21  <Field android.hardware.Camera$Size val$cameraSize>
	//*   2    4:getfield        #34  <Field int android.hardware.Camera$Size.width>
	//*   3    7:sipush          320
	//*   4   10:icmpne          22
			parameters.setJpegQuality(75);
	//    5   13:aload_1         
	//    6   14:bipush          75
	//    7   16:invokevirtual   #40  <Method void android.hardware.Camera$Parameters.setJpegQuality(int)>
		else
	//*   8   19:goto            28
			parameters.setJpegQuality(95);
	//    9   22:aload_1         
	//   10   23:bipush          95
	//   11   25:invokevirtual   #40  <Method void android.hardware.Camera$Parameters.setJpegQuality(int)>
		parameters.setPictureSize(val$cameraSize.width, val$cameraSize.height);
	//   12   28:aload_1         
	//   13   29:aload_0         
	//   14   30:getfield        #21  <Field android.hardware.Camera$Size val$cameraSize>
	//   15   33:getfield        #34  <Field int android.hardware.Camera$Size.width>
	//   16   36:aload_0         
	//   17   37:getfield        #21  <Field android.hardware.Camera$Size val$cameraSize>
	//   18   40:getfield        #43  <Field int android.hardware.Camera$Size.height>
	//   19   43:invokevirtual   #46  <Method void android.hardware.Camera$Parameters.setPictureSize(int, int)>
	//   20   46:return          
	}

	final ImplCraftARCamera this$0;
	final android.hardware.Camera.Size val$cameraSize;

	ImplCraftARCamera$2()
	{
		this$0 = final_implcraftarcamera;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field ImplCraftARCamera this$0>
		val$cameraSize = android.hardware.Camera.Size.this;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #21  <Field android.hardware.Camera$Size val$cameraSize>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #24  <Method void Object()>
	//    8   14:return          
	}
}

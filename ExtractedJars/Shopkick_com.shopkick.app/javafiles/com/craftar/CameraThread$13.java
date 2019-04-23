// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.craftar;

import android.hardware.Camera;

// Referenced classes of package com.craftar:
//			CameraThread, CLog, VideoCaptureConsumerHub

class CameraThread$13
	implements android.hardware.llback
{

	public void onPictureTaken(byte abyte0[], Camera camera)
	{
		CLog.d("Picture taken callback!");
	//    0    0:ldc1            #24  <String "Picture taken callback!">
	//    1    2:invokestatic    #30  <Method void CLog.d(String)>
		android.hardware.Camera.Size size = camera.getParameters().getPictureSize();
	//    2    5:aload_2         
	//    3    6:invokevirtual   #36  <Method android.hardware.Camera$Parameters Camera.getParameters()>
	//    4    9:invokevirtual   #42  <Method android.hardware.Camera$Size android.hardware.Camera$Parameters.getPictureSize()>
	//    5   12:astore          4
		int i = camera.getParameters().getPictureFormat();
	//    6   14:aload_2         
	//    7   15:invokevirtual   #36  <Method android.hardware.Camera$Parameters Camera.getParameters()>
	//    8   18:invokevirtual   #46  <Method int android.hardware.Camera$Parameters.getPictureFormat()>
	//    9   21:istore_3        
		CameraThread.access$300(CameraThread.this);
	//   10   22:aload_0         
	//   11   23:getfield        #17  <Field CameraThread this$0>
	//   12   26:invokestatic    #49  <Method void CameraThread.access$300(CameraThread)>
		CameraThread.access$1400(CameraThread.this).onPictureTaken(abyte0, size.width, size.height, i);
	//   13   29:aload_0         
	//   14   30:getfield        #17  <Field CameraThread this$0>
	//   15   33:invokestatic    #53  <Method VideoCaptureConsumerHub CameraThread.access$1400(CameraThread)>
	//   16   36:aload_1         
	//   17   37:aload           4
	//   18   39:getfield        #59  <Field int android.hardware.Camera$Size.width>
	//   19   42:aload           4
	//   20   44:getfield        #62  <Field int android.hardware.Camera$Size.height>
	//   21   47:iload_3         
	//   22   48:invokevirtual   #67  <Method void VideoCaptureConsumerHub.onPictureTaken(byte[], int, int, int)>
	//   23   51:return          
	}

	final CameraThread this$0;

	CameraThread$13()
	{
		this$0 = CameraThread.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field CameraThread this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #19  <Method void Object()>
	//    5    9:return          
	}
}

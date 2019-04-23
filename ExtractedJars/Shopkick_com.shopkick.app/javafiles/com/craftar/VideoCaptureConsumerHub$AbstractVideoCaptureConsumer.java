// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.craftar;


// Referenced classes of package com.craftar:
//			VideoCaptureConsumerHub

private static interface VideoCaptureConsumerHub$AbstractVideoCaptureConsumer
{

	public abstract void onCameraOpenFailed();

	public abstract void onPreviewStarted(int i, int j, int k);

	public abstract void onReadyToSetPreviewDisplay(int i, int j);
}

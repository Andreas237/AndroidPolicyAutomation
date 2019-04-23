// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.craftar;


// Referenced classes of package com.craftar:
//			VideoCaptureConsumerHub, CraftARError

static interface VideoCaptureConsumerHub$TakePictureConsumer
	extends Consumer
{

	public abstract void onPictureTaken(byte abyte0[], int i, int j, int k);

	public abstract void takePictureFailed(CraftARError craftarerror);
}

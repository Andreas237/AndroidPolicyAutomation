// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.craftar;


// Referenced classes of package com.craftar:
//			VideoCaptureConsumerHub

static interface VideoCaptureConsumerHub$RGBAVideoCaptureConsumer
	extends mer
{

	public abstract void onPreviewRGBAFrame(byte abyte0[]);

	public abstract void onProcessingDone();
}

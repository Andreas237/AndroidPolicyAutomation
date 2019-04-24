// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.video;

import android.hardware.display.DisplayManager;

// Referenced classes of package com.google.android.exoplayer2.video:
//			VideoFrameReleaseTimeHelper

private final class VideoFrameReleaseTimeHelper$DefaultDisplayListener
	implements android.hardware.display.DisplayManager.DisplayListener
{

	public void onDisplayAdded(int i)
	{
	//    0    0:return          
	}

	public void onDisplayChanged(int i)
	{
		if(i == 0)
	//*   0    0:iload_1         
	//*   1    1:ifne            11
			VideoFrameReleaseTimeHelper.access$000(VideoFrameReleaseTimeHelper.this);
	//    2    4:aload_0         
	//    3    5:getfield        #20  <Field VideoFrameReleaseTimeHelper this$0>
	//    4    8:invokestatic    #33  <Method void VideoFrameReleaseTimeHelper.access$000(VideoFrameReleaseTimeHelper)>
	//    5   11:return          
	}

	public void onDisplayRemoved(int i)
	{
	//    0    0:return          
	}

	public void register()
	{
		displayManager.registerDisplayListener(((android.hardware.display.DisplayManager.DisplayListener) (this)), ((android.os.Handler) (null)));
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field DisplayManager displayManager>
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:invokevirtual   #41  <Method void DisplayManager.registerDisplayListener(android.hardware.display.DisplayManager$DisplayListener, android.os.Handler)>
	//    5    9:return          
	}

	public void unregister()
	{
		displayManager.unregisterDisplayListener(((android.hardware.display.DisplayManager.DisplayListener) (this)));
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field DisplayManager displayManager>
	//    2    4:aload_0         
	//    3    5:invokevirtual   #46  <Method void DisplayManager.unregisterDisplayListener(android.hardware.display.DisplayManager$DisplayListener)>
	//    4    8:return          
	}

	private final DisplayManager displayManager;
	final VideoFrameReleaseTimeHelper this$0;

	public VideoFrameReleaseTimeHelper$DefaultDisplayListener(DisplayManager displaymanager)
	{
		this$0 = VideoFrameReleaseTimeHelper.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #20  <Field VideoFrameReleaseTimeHelper this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #23  <Method void Object()>
		displayManager = displaymanager;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #25  <Field DisplayManager displayManager>
	//    8   14:return          
	}
}

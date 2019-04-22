// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.ads.interactivemedia.v3.impl;

import com.google.ads.interactivemedia.v3.api.StreamDisplayContainer;
import com.google.ads.interactivemedia.v3.api.player.VideoStreamPlayer;

// Referenced classes of package com.google.ads.interactivemedia.v3.impl:
//			p

public class ah extends p
	implements StreamDisplayContainer
{

	public ah()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void p()>
	//    2    4:return          
	}

	public VideoStreamPlayer getVideoStreamPlayer()
	{
		return a;
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field VideoStreamPlayer a>
	//    2    4:areturn         
	}

	public void setVideoStreamPlayer(VideoStreamPlayer videostreamplayer)
	{
		a = videostreamplayer;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field VideoStreamPlayer a>
	//    3    5:return          
	}

	private VideoStreamPlayer a;
}

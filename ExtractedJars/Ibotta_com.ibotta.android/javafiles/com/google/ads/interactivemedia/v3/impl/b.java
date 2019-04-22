// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.ads.interactivemedia.v3.impl;

import com.google.ads.interactivemedia.v3.api.AdDisplayContainer;
import com.google.ads.interactivemedia.v3.api.player.VideoAdPlayer;

// Referenced classes of package com.google.ads.interactivemedia.v3.impl:
//			p

public class b extends p
	implements AdDisplayContainer
{

	public b()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void p()>
	//    2    4:return          
	}

	public VideoAdPlayer getPlayer()
	{
		return a;
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field VideoAdPlayer a>
	//    2    4:areturn         
	}

	public void setPlayer(VideoAdPlayer videoadplayer)
	{
		a = videoadplayer;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field VideoAdPlayer a>
	//    3    5:return          
	}

	private VideoAdPlayer a;
}

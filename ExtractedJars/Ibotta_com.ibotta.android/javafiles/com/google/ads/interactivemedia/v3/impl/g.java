// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.ads.interactivemedia.v3.impl;

import com.google.ads.interactivemedia.v3.api.player.AdProgressProvider;
import com.google.ads.interactivemedia.v3.api.player.VideoProgressUpdate;

// Referenced classes of package com.google.ads.interactivemedia.v3.impl:
//			af

public class g extends af
{

	public g(AdProgressProvider adprogressprovider, long l)
	{
		super(l);
	//    0    0:aload_0         
	//    1    1:lload_2         
	//    2    2:invokespecial   #11  <Method void af(long)>
		a = adprogressprovider;
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:putfield        #13  <Field AdProgressProvider a>
	//    6   10:return          
	}

	public VideoProgressUpdate a()
	{
		return a.getAdProgress();
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field AdProgressProvider a>
	//    2    4:invokeinterface #20  <Method VideoProgressUpdate AdProgressProvider.getAdProgress()>
	//    3    9:areturn         
	}

	protected final AdProgressProvider a;
}

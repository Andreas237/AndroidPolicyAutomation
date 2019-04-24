// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.autonavi.ae.gmap.gloverlay;


// Referenced classes of package com.autonavi.ae.gmap.gloverlay:
//			GLOverlayBundle

public static class GLOverlayBundle$GLAmapFocusHits
{

	public long mHitedIndex;
	public long mHitedTimes;
	public long mOverlayHashCode;

	public GLOverlayBundle$GLAmapFocusHits()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
		mOverlayHashCode = 0L;
	//    2    4:aload_0         
	//    3    5:lconst_0        
	//    4    6:putfield        #17  <Field long mOverlayHashCode>
		mHitedIndex = 0L;
	//    5    9:aload_0         
	//    6   10:lconst_0        
	//    7   11:putfield        #19  <Field long mHitedIndex>
		mHitedTimes = 1000L;
	//    8   14:aload_0         
	//    9   15:ldc2w           #20  <Long 1000L>
	//   10   18:putfield        #23  <Field long mHitedTimes>
	//   11   21:return          
	}
}

// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.source;

import com.google.android.exoplayer2.Timeline;

// Referenced classes of package com.google.android.exoplayer2.source:
//			ConcatenatingMediaSource

private static final class ConcatenatingMediaSource$DummyTimeline extends Timeline
{

	public int getIndexOfPeriod(Object obj)
	{
		return obj != null ? -1 : 0;
	//    0    0:aload_1         
	//    1    1:ifnonnull       6
	//    2    4:iconst_0        
	//    3    5:ireturn         
	//    4    6:iconst_m1       
	//    5    7:ireturn         
	}

	public com.google.android.exoplayer2.Timeline.Period getPeriod(int i, com.google.android.exoplayer2.Timeline.Period period, boolean flag)
	{
		return period.set(((Object) (null)), ((Object) (null)), 0, 0x1L, 0L);
	//    0    0:aload_2         
	//    1    1:aconst_null     
	//    2    2:aconst_null     
	//    3    3:iconst_0        
	//    4    4:ldc2w           #19  <Long 0x1L>
	//    5    7:lconst_0        
	//    6    8:invokevirtual   #26  <Method com.google.android.exoplayer2.Timeline$Period com.google.android.exoplayer2.Timeline$Period.set(Object, Object, int, long, long)>
	//    7   11:areturn         
	}

	public int getPeriodCount()
	{
		return 1;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	public com.google.android.exoplayer2.Timeline.Window getWindow(int i, com.google.android.exoplayer2.Timeline.Window window, boolean flag, long l)
	{
		long l1 = 0L;
	//    0    0:lconst_0        
	//    1    1:lstore          6
		if(l > 0L)
	//*   2    3:lload           4
	//*   3    5:lconst_0        
	//*   4    6:lcmp            
	//*   5    7:ifle            15
			l1 = 0x1L;
	//    6   10:ldc2w           #19  <Long 0x1L>
	//    7   13:lstore          6
		return window.set(((Object) (null)), 0x1L, 0x1L, false, true, l1, 0x1L, 0, 0, 0L);
	//    8   15:aload_2         
	//    9   16:aconst_null     
	//   10   17:ldc2w           #19  <Long 0x1L>
	//   11   20:ldc2w           #19  <Long 0x1L>
	//   12   23:iconst_0        
	//   13   24:iconst_1        
	//   14   25:lload           6
	//   15   27:ldc2w           #19  <Long 0x1L>
	//   16   30:iconst_0        
	//   17   31:iconst_0        
	//   18   32:lconst_0        
	//   19   33:invokevirtual   #35  <Method com.google.android.exoplayer2.Timeline$Window com.google.android.exoplayer2.Timeline$Window.set(Object, long, long, boolean, boolean, long, long, int, int, long)>
	//   20   36:areturn         
	}

	public int getWindowCount()
	{
		return 1;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	private ConcatenatingMediaSource$DummyTimeline()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Timeline()>
	//    2    4:return          
	}

	ConcatenatingMediaSource$DummyTimeline(ConcatenatingMediaSource._cls1 _pcls1)
	{
		this();
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void ConcatenatingMediaSource$DummyTimeline()>
	//    2    4:return          
	}
}

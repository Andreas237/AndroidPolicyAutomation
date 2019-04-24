// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.offline;

import com.google.android.exoplayer2.upstream.DataSpec;

// Referenced classes of package com.google.android.exoplayer2.offline:
//			SegmentDownloader

protected static class SegmentDownloader$Segment
	implements Comparable
{

	public int compareTo(SegmentDownloader$Segment segmentdownloader$segment)
	{
		long l = startTimeUs - segmentdownloader$segment.startTimeUs;
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field long startTimeUs>
	//    2    4:aload_1         
	//    3    5:getfield        #21  <Field long startTimeUs>
	//    4    8:lsub            
	//    5    9:lstore_2        
		if(l == 0L)
	//*   6   10:lload_2         
	//*   7   11:lconst_0        
	//*   8   12:lcmp            
	//*   9   13:ifne            18
			return 0;
	//   10   16:iconst_0        
	//   11   17:ireturn         
		return l >= 0L ? 1 : -1;
	//   12   18:lload_2         
	//   13   19:lconst_0        
	//   14   20:lcmp            
	//   15   21:ifge            26
	//   16   24:iconst_m1       
	//   17   25:ireturn         
	//   18   26:iconst_1        
	//   19   27:ireturn         
	}

	public volatile int compareTo(Object obj)
	{
		return compareTo((SegmentDownloader$Segment)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #2   <Class SegmentDownloader$Segment>
	//    3    5:invokevirtual   #31  <Method int compareTo(SegmentDownloader$Segment)>
	//    4    8:ireturn         
	}

	public final DataSpec dataSpec;
	public final long startTimeUs;

	public SegmentDownloader$Segment(long l, DataSpec dataspec)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void Object()>
		startTimeUs = l;
	//    2    4:aload_0         
	//    3    5:lload_1         
	//    4    6:putfield        #21  <Field long startTimeUs>
		dataSpec = dataspec;
	//    5    9:aload_0         
	//    6   10:aload_3         
	//    7   11:putfield        #23  <Field DataSpec dataSpec>
	//    8   14:return          
	}
}

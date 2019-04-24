// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.source.hls.playlist;


// Referenced classes of package com.google.android.exoplayer2.source.hls.playlist:
//			HlsMediaPlaylist

public static final class HlsMediaPlaylist$Segment
	implements Comparable
{

	public int compareTo(Long long1)
	{
		if(relativeStartTimeUs > long1.longValue())
	//*   0    0:aload_0         
	//*   1    1:getfield        #47  <Field long relativeStartTimeUs>
	//*   2    4:aload_1         
	//*   3    5:invokevirtual   #66  <Method long Long.longValue()>
	//*   4    8:lcmp            
	//*   5    9:ifle            14
			return 1;
	//    6   12:iconst_1        
	//    7   13:ireturn         
		return relativeStartTimeUs >= long1.longValue() ? 0 : -1;
	//    8   14:aload_0         
	//    9   15:getfield        #47  <Field long relativeStartTimeUs>
	//   10   18:aload_1         
	//   11   19:invokevirtual   #66  <Method long Long.longValue()>
	//   12   22:lcmp            
	//   13   23:ifge            28
	//   14   26:iconst_m1       
	//   15   27:ireturn         
	//   16   28:iconst_0        
	//   17   29:ireturn         
	}

	public volatile int compareTo(Object obj)
	{
		return compareTo((Long)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #62  <Class Long>
	//    3    5:invokevirtual   #70  <Method int compareTo(Long)>
	//    4    8:ireturn         
	}

	public final long byterangeLength;
	public final long byterangeOffset;
	public final long durationUs;
	public final String encryptionIV;
	public final String fullSegmentEncryptionKeyUri;
	public final boolean hasGapTag;
	public final HlsMediaPlaylist$Segment initializationSegment;
	public final int relativeDiscontinuitySequence;
	public final long relativeStartTimeUs;
	public final String url;

	public HlsMediaPlaylist$Segment(String s, long l, long l1)
	{
		this(s, ((HlsMediaPlaylist$Segment) (null)), 0L, -1, 0x1L, ((String) (null)), ((String) (null)), l, l1, false);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:lconst_0        
	//    4    4:iconst_m1       
	//    5    5:ldc2w           #29  <Long 0x1L>
	//    6    8:aconst_null     
	//    7    9:aconst_null     
	//    8   10:lload_2         
	//    9   11:lload           4
	//   10   13:iconst_0        
	//   11   14:invokespecial   #33  <Method void HlsMediaPlaylist$Segment(String, HlsMediaPlaylist$Segment, long, int, long, String, String, long, long, boolean)>
	//   12   17:return          
	}

	public HlsMediaPlaylist$Segment(String s, HlsMediaPlaylist$Segment hlsmediaplaylist$segment, long l, int i, long l1, 
			String s1, String s2, long l2, long l3, boolean flag)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #37  <Method void Object()>
		url = s;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #39  <Field String url>
		initializationSegment = hlsmediaplaylist$segment;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #41  <Field HlsMediaPlaylist$Segment initializationSegment>
		durationUs = l;
	//    8   14:aload_0         
	//    9   15:lload_3         
	//   10   16:putfield        #43  <Field long durationUs>
		relativeDiscontinuitySequence = i;
	//   11   19:aload_0         
	//   12   20:iload           5
	//   13   22:putfield        #45  <Field int relativeDiscontinuitySequence>
		relativeStartTimeUs = l1;
	//   14   25:aload_0         
	//   15   26:lload           6
	//   16   28:putfield        #47  <Field long relativeStartTimeUs>
		fullSegmentEncryptionKeyUri = s1;
	//   17   31:aload_0         
	//   18   32:aload           8
	//   19   34:putfield        #49  <Field String fullSegmentEncryptionKeyUri>
		encryptionIV = s2;
	//   20   37:aload_0         
	//   21   38:aload           9
	//   22   40:putfield        #51  <Field String encryptionIV>
		byterangeOffset = l2;
	//   23   43:aload_0         
	//   24   44:lload           10
	//   25   46:putfield        #53  <Field long byterangeOffset>
		byterangeLength = l3;
	//   26   49:aload_0         
	//   27   50:lload           12
	//   28   52:putfield        #55  <Field long byterangeLength>
		hasGapTag = flag;
	//   29   55:aload_0         
	//   30   56:iload           14
	//   31   58:putfield        #57  <Field boolean hasGapTag>
	//   32   61:return          
	}
}

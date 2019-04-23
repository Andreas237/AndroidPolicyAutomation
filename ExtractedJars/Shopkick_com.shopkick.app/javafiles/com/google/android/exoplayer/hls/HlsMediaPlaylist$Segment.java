// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer.hls;


// Referenced classes of package com.google.android.exoplayer.hls:
//			HlsMediaPlaylist

public static final class HlsMediaPlaylist$Segment
	implements Comparable
{

	public int compareTo(Long long1)
	{
		if(startTimeUs > long1.longValue())
	//*   0    0:aload_0         
	//*   1    1:getfield        #37  <Field long startTimeUs>
	//*   2    4:aload_1         
	//*   3    5:invokevirtual   #56  <Method long Long.longValue()>
	//*   4    8:lcmp            
	//*   5    9:ifle            14
			return 1;
	//    6   12:iconst_1        
	//    7   13:ireturn         
		return startTimeUs >= long1.longValue() ? 0 : -1;
	//    8   14:aload_0         
	//    9   15:getfield        #37  <Field long startTimeUs>
	//   10   18:aload_1         
	//   11   19:invokevirtual   #56  <Method long Long.longValue()>
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
	//    2    2:checkcast       #52  <Class Long>
	//    3    5:invokevirtual   #59  <Method int compareTo(Long)>
	//    4    8:ireturn         
	}

	public final long byterangeLength;
	public final long byterangeOffset;
	public final int discontinuitySequenceNumber;
	public final double durationSecs;
	public final String encryptionIV;
	public final String encryptionKeyUri;
	public final boolean isEncrypted;
	public final long startTimeUs;
	public final String url;

	public HlsMediaPlaylist$Segment(String s, double d, int i, long l, boolean flag, 
			String s1, String s2, long l1, long l2)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #29  <Method void Object()>
		url = s;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #31  <Field String url>
		durationSecs = d;
	//    5    9:aload_0         
	//    6   10:dload_2         
	//    7   11:putfield        #33  <Field double durationSecs>
		discontinuitySequenceNumber = i;
	//    8   14:aload_0         
	//    9   15:iload           4
	//   10   17:putfield        #35  <Field int discontinuitySequenceNumber>
		startTimeUs = l;
	//   11   20:aload_0         
	//   12   21:lload           5
	//   13   23:putfield        #37  <Field long startTimeUs>
		isEncrypted = flag;
	//   14   26:aload_0         
	//   15   27:iload           7
	//   16   29:putfield        #39  <Field boolean isEncrypted>
		encryptionKeyUri = s1;
	//   17   32:aload_0         
	//   18   33:aload           8
	//   19   35:putfield        #41  <Field String encryptionKeyUri>
		encryptionIV = s2;
	//   20   38:aload_0         
	//   21   39:aload           9
	//   22   41:putfield        #43  <Field String encryptionIV>
		byterangeOffset = l1;
	//   23   44:aload_0         
	//   24   45:lload           10
	//   25   47:putfield        #45  <Field long byterangeOffset>
		byterangeLength = l2;
	//   26   50:aload_0         
	//   27   51:lload           12
	//   28   53:putfield        #47  <Field long byterangeLength>
	//   29   56:return          
	}
}

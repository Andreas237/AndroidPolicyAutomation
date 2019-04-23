// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer.hls;

import java.util.List;

// Referenced classes of package com.google.android.exoplayer.hls:
//			HlsPlaylist

public final class HlsMediaPlaylist extends HlsPlaylist
{
	public static final class Segment
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

		public Segment(String s, double d, int i, long l, boolean flag, 
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


	public HlsMediaPlaylist(String s, int i, int j, int k, boolean flag, List list)
	{
		super(s, 1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_1        
	//    3    3:invokespecial   #30  <Method void HlsPlaylist(String, int)>
		mediaSequence = i;
	//    4    6:aload_0         
	//    5    7:iload_2         
	//    6    8:putfield        #32  <Field int mediaSequence>
		targetDurationSecs = j;
	//    7   11:aload_0         
	//    8   12:iload_3         
	//    9   13:putfield        #34  <Field int targetDurationSecs>
		version = k;
	//   10   16:aload_0         
	//   11   17:iload           4
	//   12   19:putfield        #36  <Field int version>
		live = flag;
	//   13   22:aload_0         
	//   14   23:iload           5
	//   15   25:putfield        #38  <Field boolean live>
		segments = list;
	//   16   28:aload_0         
	//   17   29:aload           6
	//   18   31:putfield        #40  <Field List segments>
		if(!list.isEmpty())
	//*  19   34:aload           6
	//*  20   36:invokeinterface #46  <Method boolean List.isEmpty()>
	//*  21   41:ifne            83
		{
			s = ((String) ((Segment)list.get(list.size() - 1)));
	//   22   44:aload           6
	//   23   46:aload           6
	//   24   48:invokeinterface #50  <Method int List.size()>
	//   25   53:iconst_1        
	//   26   54:isub            
	//   27   55:invokeinterface #54  <Method Object List.get(int)>
	//   28   60:checkcast       #6   <Class HlsMediaPlaylist$Segment>
	//   29   63:astore_1        
			durationUs = ((Segment) (s)).startTimeUs + (long)(((Segment) (s)).durationSecs * 1000000D);
	//   30   64:aload_0         
	//   31   65:aload_1         
	//   32   66:getfield        #57  <Field long HlsMediaPlaylist$Segment.startTimeUs>
	//   33   69:aload_1         
	//   34   70:getfield        #61  <Field double HlsMediaPlaylist$Segment.durationSecs>
	//   35   73:ldc2w           #62  <Double 1000000D>
	//   36   76:dmul            
	//   37   77:d2l             
	//   38   78:ladd            
	//   39   79:putfield        #65  <Field long durationUs>
			return;
	//   40   82:return          
		} else
		{
			durationUs = 0L;
	//   41   83:aload_0         
	//   42   84:lconst_0        
	//   43   85:putfield        #65  <Field long durationUs>
			return;
	//   44   88:return          
		}
	}

	public static final String ENCRYPTION_METHOD_AES_128 = "AES-128";
	public static final String ENCRYPTION_METHOD_NONE = "NONE";
	public final long durationUs;
	public final boolean live;
	public final int mediaSequence;
	public final List segments;
	public final int targetDurationSecs;
	public final int version;
}

// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.source.hls.playlist;

import com.google.android.exoplayer2.drm.DrmInitData;
import java.lang.annotation.Annotation;
import java.util.Collections;
import java.util.List;

// Referenced classes of package com.google.android.exoplayer2.source.hls.playlist:
//			HlsPlaylist

public final class HlsMediaPlaylist extends HlsPlaylist
{
	public static interface PlaylistType
		extends Annotation
	{
	}

	public static final class Segment
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
		public final Segment initializationSegment;
		public final int relativeDiscontinuitySequence;
		public final long relativeStartTimeUs;
		public final String url;

		public Segment(String s, long l, long l1)
		{
			this(s, ((Segment) (null)), 0L, -1, 0x1L, ((String) (null)), ((String) (null)), l, l1, false);
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

		public Segment(String s, Segment segment, long l, int i, long l1, 
				String s1, String s2, long l2, long l3, boolean flag)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #37  <Method void Object()>
			url = s;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #39  <Field String url>
			initializationSegment = segment;
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


	public HlsMediaPlaylist(int i, String s, List list, long l, long l1, 
			boolean flag, int j, long l2, int k, long l3, 
			boolean flag1, boolean flag2, boolean flag3, DrmInitData drminitdata, List list1)
	{
		super(s, list);
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:aload_3         
	//    3    3:invokespecial   #41  <Method void HlsPlaylist(String, List)>
		playlistType = i;
	//    4    6:aload_0         
	//    5    7:iload_1         
	//    6    8:putfield        #43  <Field int playlistType>
		startTimeUs = l1;
	//    7   11:aload_0         
	//    8   12:lload           6
	//    9   14:putfield        #45  <Field long startTimeUs>
		hasDiscontinuitySequence = flag;
	//   10   17:aload_0         
	//   11   18:iload           8
	//   12   20:putfield        #47  <Field boolean hasDiscontinuitySequence>
		discontinuitySequence = j;
	//   13   23:aload_0         
	//   14   24:iload           9
	//   15   26:putfield        #49  <Field int discontinuitySequence>
		mediaSequence = l2;
	//   16   29:aload_0         
	//   17   30:lload           10
	//   18   32:putfield        #51  <Field long mediaSequence>
		version = k;
	//   19   35:aload_0         
	//   20   36:iload           12
	//   21   38:putfield        #53  <Field int version>
		targetDurationUs = l3;
	//   22   41:aload_0         
	//   23   42:lload           13
	//   24   44:putfield        #55  <Field long targetDurationUs>
		hasIndependentSegmentsTag = flag1;
	//   25   47:aload_0         
	//   26   48:iload           15
	//   27   50:putfield        #57  <Field boolean hasIndependentSegmentsTag>
		hasEndTag = flag2;
	//   28   53:aload_0         
	//   29   54:iload           16
	//   30   56:putfield        #59  <Field boolean hasEndTag>
		hasProgramDateTime = flag3;
	//   31   59:aload_0         
	//   32   60:iload           17
	//   33   62:putfield        #61  <Field boolean hasProgramDateTime>
		drmInitData = drminitdata;
	//   34   65:aload_0         
	//   35   66:aload           18
	//   36   68:putfield        #63  <Field DrmInitData drmInitData>
		segments = Collections.unmodifiableList(list1);
	//   37   71:aload_0         
	//   38   72:aload           19
	//   39   74:invokestatic    #69  <Method List Collections.unmodifiableList(List)>
	//   40   77:putfield        #71  <Field List segments>
		if(!list1.isEmpty())
	//*  41   80:aload           19
	//*  42   82:invokeinterface #77  <Method boolean List.isEmpty()>
	//*  43   87:ifne            126
		{
			s = ((String) ((Segment)list1.get(list1.size() - 1)));
	//   44   90:aload           19
	//   45   92:aload           19
	//   46   94:invokeinterface #81  <Method int List.size()>
	//   47   99:iconst_1        
	//   48  100:isub            
	//   49  101:invokeinterface #85  <Method Object List.get(int)>
	//   50  106:checkcast       #9   <Class HlsMediaPlaylist$Segment>
	//   51  109:astore_2        
			durationUs = ((Segment) (s)).relativeStartTimeUs + ((Segment) (s)).durationUs;
	//   52  110:aload_0         
	//   53  111:aload_2         
	//   54  112:getfield        #88  <Field long HlsMediaPlaylist$Segment.relativeStartTimeUs>
	//   55  115:aload_2         
	//   56  116:getfield        #90  <Field long HlsMediaPlaylist$Segment.durationUs>
	//   57  119:ladd            
	//   58  120:putfield        #91  <Field long durationUs>
		} else
	//*  59  123:goto            131
		{
			durationUs = 0L;
	//   60  126:aload_0         
	//   61  127:lconst_0        
	//   62  128:putfield        #91  <Field long durationUs>
		}
		if(l == 0x1L)
	//*  63  131:lload           4
	//*  64  133:ldc2w           #92  <Long 0x1L>
	//*  65  136:lcmp            
	//*  66  137:ifne            148
			l = 0x1L;
	//   67  140:ldc2w           #92  <Long 0x1L>
	//   68  143:lstore          4
		else
	//*  69  145:goto            167
		if(l < 0L)
	//*  70  148:lload           4
	//*  71  150:lconst_0        
	//*  72  151:lcmp            
	//*  73  152:iflt            158
	//*  74  155:goto            167
			l = durationUs + l;
	//   75  158:aload_0         
	//   76  159:getfield        #91  <Field long durationUs>
	//   77  162:lload           4
	//   78  164:ladd            
	//   79  165:lstore          4
		startOffsetUs = l;
	//   80  167:aload_0         
	//   81  168:lload           4
	//   82  170:putfield        #95  <Field long startOffsetUs>
	//   83  173:return          
	}

	public HlsMediaPlaylist copy(List list)
	{
		return this;
	//    0    0:aload_0         
	//    1    1:areturn         
	}

	public volatile Object copy(List list)
	{
		return ((Object) (copy(list)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #104 <Method HlsMediaPlaylist copy(List)>
	//    3    5:areturn         
	}

	public HlsMediaPlaylist copyWith(long l, int i)
	{
		return new HlsMediaPlaylist(playlistType, baseUri, tags, startOffsetUs, l, true, i, mediaSequence, version, targetDurationUs, hasIndependentSegmentsTag, hasEndTag, hasProgramDateTime, drmInitData, segments);
	//    0    0:new             #2   <Class HlsMediaPlaylist>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #43  <Field int playlistType>
	//    4    8:aload_0         
	//    5    9:getfield        #110 <Field String baseUri>
	//    6   12:aload_0         
	//    7   13:getfield        #113 <Field List tags>
	//    8   16:aload_0         
	//    9   17:getfield        #95  <Field long startOffsetUs>
	//   10   20:lload_1         
	//   11   21:iconst_1        
	//   12   22:iload_3         
	//   13   23:aload_0         
	//   14   24:getfield        #51  <Field long mediaSequence>
	//   15   27:aload_0         
	//   16   28:getfield        #53  <Field int version>
	//   17   31:aload_0         
	//   18   32:getfield        #55  <Field long targetDurationUs>
	//   19   35:aload_0         
	//   20   36:getfield        #57  <Field boolean hasIndependentSegmentsTag>
	//   21   39:aload_0         
	//   22   40:getfield        #59  <Field boolean hasEndTag>
	//   23   43:aload_0         
	//   24   44:getfield        #61  <Field boolean hasProgramDateTime>
	//   25   47:aload_0         
	//   26   48:getfield        #63  <Field DrmInitData drmInitData>
	//   27   51:aload_0         
	//   28   52:getfield        #71  <Field List segments>
	//   29   55:invokespecial   #115 <Method void HlsMediaPlaylist(int, String, List, long, long, boolean, int, long, int, long, boolean, boolean, boolean, DrmInitData, List)>
	//   30   58:areturn         
	}

	public HlsMediaPlaylist copyWithEndTag()
	{
		if(hasEndTag)
	//*   0    0:aload_0         
	//*   1    1:getfield        #59  <Field boolean hasEndTag>
	//*   2    4:ifeq            9
			return this;
	//    3    7:aload_0         
	//    4    8:areturn         
		else
			return new HlsMediaPlaylist(playlistType, baseUri, tags, startOffsetUs, startTimeUs, hasDiscontinuitySequence, discontinuitySequence, mediaSequence, version, targetDurationUs, hasIndependentSegmentsTag, true, hasProgramDateTime, drmInitData, segments);
	//    5    9:new             #2   <Class HlsMediaPlaylist>
	//    6   12:dup             
	//    7   13:aload_0         
	//    8   14:getfield        #43  <Field int playlistType>
	//    9   17:aload_0         
	//   10   18:getfield        #110 <Field String baseUri>
	//   11   21:aload_0         
	//   12   22:getfield        #113 <Field List tags>
	//   13   25:aload_0         
	//   14   26:getfield        #95  <Field long startOffsetUs>
	//   15   29:aload_0         
	//   16   30:getfield        #45  <Field long startTimeUs>
	//   17   33:aload_0         
	//   18   34:getfield        #47  <Field boolean hasDiscontinuitySequence>
	//   19   37:aload_0         
	//   20   38:getfield        #49  <Field int discontinuitySequence>
	//   21   41:aload_0         
	//   22   42:getfield        #51  <Field long mediaSequence>
	//   23   45:aload_0         
	//   24   46:getfield        #53  <Field int version>
	//   25   49:aload_0         
	//   26   50:getfield        #55  <Field long targetDurationUs>
	//   27   53:aload_0         
	//   28   54:getfield        #57  <Field boolean hasIndependentSegmentsTag>
	//   29   57:iconst_1        
	//   30   58:aload_0         
	//   31   59:getfield        #61  <Field boolean hasProgramDateTime>
	//   32   62:aload_0         
	//   33   63:getfield        #63  <Field DrmInitData drmInitData>
	//   34   66:aload_0         
	//   35   67:getfield        #71  <Field List segments>
	//   36   70:invokespecial   #115 <Method void HlsMediaPlaylist(int, String, List, long, long, boolean, int, long, int, long, boolean, boolean, boolean, DrmInitData, List)>
	//   37   73:areturn         
	}

	public long getEndTimeUs()
	{
		return startTimeUs + durationUs;
	//    0    0:aload_0         
	//    1    1:getfield        #45  <Field long startTimeUs>
	//    2    4:aload_0         
	//    3    5:getfield        #91  <Field long durationUs>
	//    4    8:ladd            
	//    5    9:lreturn         
	}

	public boolean isNewerThan(HlsMediaPlaylist hlsmediaplaylist)
	{
		boolean flag = true;
	//    0    0:iconst_1        
	//    1    1:istore          4
		if(hlsmediaplaylist != null)
	//*   2    3:aload_1         
	//*   3    4:ifnull          87
		{
			if(mediaSequence > hlsmediaplaylist.mediaSequence)
	//*   4    7:aload_0         
	//*   5    8:getfield        #51  <Field long mediaSequence>
	//*   6   11:aload_1         
	//*   7   12:getfield        #51  <Field long mediaSequence>
	//*   8   15:lcmp            
	//*   9   16:ifle            21
				return true;
	//   10   19:iconst_1        
	//   11   20:ireturn         
			if(mediaSequence < hlsmediaplaylist.mediaSequence)
	//*  12   21:aload_0         
	//*  13   22:getfield        #51  <Field long mediaSequence>
	//*  14   25:aload_1         
	//*  15   26:getfield        #51  <Field long mediaSequence>
	//*  16   29:lcmp            
	//*  17   30:ifge            35
				return false;
	//   18   33:iconst_0        
	//   19   34:ireturn         
			int i = segments.size();
	//   20   35:aload_0         
	//   21   36:getfield        #71  <Field List segments>
	//   22   39:invokeinterface #81  <Method int List.size()>
	//   23   44:istore_2        
			int j = hlsmediaplaylist.segments.size();
	//   24   45:aload_1         
	//   25   46:getfield        #71  <Field List segments>
	//   26   49:invokeinterface #81  <Method int List.size()>
	//   27   54:istore_3        
			if(i <= j)
	//*  28   55:iload_2         
	//*  29   56:iload_3         
	//*  30   57:icmpgt          84
			{
				if(i == j && hasEndTag && !hlsmediaplaylist.hasEndTag)
	//*  31   60:iload_2         
	//*  32   61:iload_3         
	//*  33   62:icmpne          81
	//*  34   65:aload_0         
	//*  35   66:getfield        #59  <Field boolean hasEndTag>
	//*  36   69:ifeq            81
	//*  37   72:aload_1         
	//*  38   73:getfield        #59  <Field boolean hasEndTag>
	//*  39   76:ifne            81
					return true;
	//   40   79:iconst_1        
	//   41   80:ireturn         
				flag = false;
	//   42   81:iconst_0        
	//   43   82:istore          4
			}
			return flag;
	//   44   84:iload           4
	//   45   86:ireturn         
		} else
		{
			return true;
	//   46   87:iconst_1        
	//   47   88:ireturn         
		}
	}

	public static final int PLAYLIST_TYPE_EVENT = 2;
	public static final int PLAYLIST_TYPE_UNKNOWN = 0;
	public static final int PLAYLIST_TYPE_VOD = 1;
	public final int discontinuitySequence;
	public final DrmInitData drmInitData;
	public final long durationUs;
	public final boolean hasDiscontinuitySequence;
	public final boolean hasEndTag;
	public final boolean hasIndependentSegmentsTag;
	public final boolean hasProgramDateTime;
	public final long mediaSequence;
	public final int playlistType;
	public final List segments;
	public final long startOffsetUs;
	public final long startTimeUs;
	public final long targetDurationUs;
	public final int version;
}

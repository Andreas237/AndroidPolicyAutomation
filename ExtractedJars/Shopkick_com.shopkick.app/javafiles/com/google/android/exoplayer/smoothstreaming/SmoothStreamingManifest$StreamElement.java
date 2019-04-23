// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer.smoothstreaming;

import android.net.Uri;
import com.google.android.exoplayer.chunk.Format;
import com.google.android.exoplayer.util.*;
import java.util.List;

// Referenced classes of package com.google.android.exoplayer.smoothstreaming:
//			SmoothStreamingManifest

public static class SmoothStreamingManifest$StreamElement
{

	public Uri buildRequestUri(int i, int j)
	{
		SmoothStreamingManifest.TrackElement atrackelement[] = tracks;
	//    0    0:aload_0         
	//    1    1:getfield        #82  <Field SmoothStreamingManifest$TrackElement[] tracks>
	//    2    4:astore          5
		boolean flag1 = true;
	//    3    6:iconst_1        
	//    4    7:istore          4
		boolean flag;
		if(atrackelement != null)
	//*   5    9:aload           5
	//*   6   11:ifnull          19
			flag = true;
	//    7   14:iconst_1        
	//    8   15:istore_3        
		else
	//*   9   16:goto            21
			flag = false;
	//   10   19:iconst_0        
	//   11   20:istore_3        
		Assertions.checkState(flag);
	//   12   21:iload_3         
	//   13   22:invokestatic    #119 <Method void Assertions.checkState(boolean)>
		if(chunkStartTimes != null)
	//*  14   25:aload_0         
	//*  15   26:getfield        #92  <Field List chunkStartTimes>
	//*  16   29:ifnull          37
			flag = true;
	//   17   32:iconst_1        
	//   18   33:istore_3        
		else
	//*  19   34:goto            39
			flag = false;
	//   20   37:iconst_0        
	//   21   38:istore_3        
		Assertions.checkState(flag);
	//   22   39:iload_3         
	//   23   40:invokestatic    #119 <Method void Assertions.checkState(boolean)>
		if(j < chunkStartTimes.size())
	//*  24   43:iload_2         
	//*  25   44:aload_0         
	//*  26   45:getfield        #92  <Field List chunkStartTimes>
	//*  27   48:invokeinterface #88  <Method int List.size()>
	//*  28   53:icmpge          62
			flag = flag1;
	//   29   56:iload           4
	//   30   58:istore_3        
		else
	//*  31   59:goto            64
			flag = false;
	//   32   62:iconst_0        
	//   33   63:istore_3        
		Assertions.checkState(flag);
	//   34   64:iload_3         
	//   35   65:invokestatic    #119 <Method void Assertions.checkState(boolean)>
		String s = Integer.toString(tracks[i].format.bitrate);
	//   36   68:aload_0         
	//   37   69:getfield        #82  <Field SmoothStreamingManifest$TrackElement[] tracks>
	//   38   72:iload_1         
	//   39   73:aaload          
	//   40   74:getfield        #125 <Field Format SmoothStreamingManifest$TrackElement.format>
	//   41   77:getfield        #130 <Field int Format.bitrate>
	//   42   80:invokestatic    #136 <Method String Integer.toString(int)>
	//   43   83:astore          5
		String s1 = ((Long)chunkStartTimes.get(j)).toString();
	//   44   85:aload_0         
	//   45   86:getfield        #92  <Field List chunkStartTimes>
	//   46   89:iload_2         
	//   47   90:invokeinterface #140 <Method Object List.get(int)>
	//   48   95:checkcast       #142 <Class Long>
	//   49   98:invokevirtual   #145 <Method String Long.toString()>
	//   50  101:astore          6
		s = chunkTemplate.replace("{bitrate}", ((CharSequence) (s))).replace("{Bitrate}", ((CharSequence) (s))).replace("{start time}", ((CharSequence) (s1))).replace("{start_time}", ((CharSequence) (s1)));
	//   51  103:aload_0         
	//   52  104:getfield        #60  <Field String chunkTemplate>
	//   53  107:ldc1            #20  <String "{bitrate}">
	//   54  109:aload           5
	//   55  111:invokevirtual   #151 <Method String String.replace(CharSequence, CharSequence)>
	//   56  114:ldc1            #23  <String "{Bitrate}">
	//   57  116:aload           5
	//   58  118:invokevirtual   #151 <Method String String.replace(CharSequence, CharSequence)>
	//   59  121:ldc1            #26  <String "{start time}">
	//   60  123:aload           6
	//   61  125:invokevirtual   #151 <Method String String.replace(CharSequence, CharSequence)>
	//   62  128:ldc1            #29  <String "{start_time}">
	//   63  130:aload           6
	//   64  132:invokevirtual   #151 <Method String String.replace(CharSequence, CharSequence)>
	//   65  135:astore          5
		return UriUtil.resolveToUri(baseUri, s);
	//   66  137:aload_0         
	//   67  138:getfield        #58  <Field String baseUri>
	//   68  141:aload           5
	//   69  143:invokestatic    #157 <Method Uri UriUtil.resolveToUri(String, String)>
	//   70  146:areturn         
	}

	public long getChunkDurationUs(int i)
	{
		if(i == chunkCount - 1)
	//*   0    0:iload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #90  <Field int chunkCount>
	//*   3    5:iconst_1        
	//*   4    6:isub            
	//*   5    7:icmpne          15
		{
			return lastChunkDurationUs;
	//    6   10:aload_0         
	//    7   11:getfield        #102 <Field long lastChunkDurationUs>
	//    8   14:lreturn         
		} else
		{
			long al[] = chunkStartTimesUs;
	//    9   15:aload_0         
	//   10   16:getfield        #108 <Field long[] chunkStartTimesUs>
	//   11   19:astore_2        
			return al[i + 1] - al[i];
	//   12   20:aload_2         
	//   13   21:iload_1         
	//   14   22:iconst_1        
	//   15   23:iadd            
	//   16   24:laload          
	//   17   25:aload_2         
	//   18   26:iload_1         
	//   19   27:laload          
	//   20   28:lsub            
	//   21   29:lreturn         
		}
	}

	public int getChunkIndex(long l)
	{
		return Util.binarySearchFloor(chunkStartTimesUs, l, true, true);
	//    0    0:aload_0         
	//    1    1:getfield        #108 <Field long[] chunkStartTimesUs>
	//    2    4:lload_1         
	//    3    5:iconst_1        
	//    4    6:iconst_1        
	//    5    7:invokestatic    #165 <Method int Util.binarySearchFloor(long[], long, boolean, boolean)>
	//    6   10:ireturn         
	}

	public long getStartTimeUs(int i)
	{
		return chunkStartTimesUs[i];
	//    0    0:aload_0         
	//    1    1:getfield        #108 <Field long[] chunkStartTimesUs>
	//    2    4:iload_1         
	//    3    5:laload          
	//    4    6:lreturn         
	}

	public static final int TYPE_AUDIO = 0;
	public static final int TYPE_TEXT = 2;
	public static final int TYPE_UNKNOWN = -1;
	public static final int TYPE_VIDEO = 1;
	private static final String URL_PLACEHOLDER_BITRATE_1 = "{bitrate}";
	private static final String URL_PLACEHOLDER_BITRATE_2 = "{Bitrate}";
	private static final String URL_PLACEHOLDER_START_TIME_1 = "{start time}";
	private static final String URL_PLACEHOLDER_START_TIME_2 = "{start_time}";
	private final String baseUri;
	public final int chunkCount;
	private final List chunkStartTimes;
	private final long chunkStartTimesUs[];
	private final String chunkTemplate;
	public final int displayHeight;
	public final int displayWidth;
	public final String language;
	private final long lastChunkDurationUs;
	public final int maxHeight;
	public final int maxWidth;
	public final String name;
	public final int qualityLevels;
	public final String subType;
	public final long timescale;
	public final SmoothStreamingManifest.TrackElement tracks[];
	public final int type;

	public SmoothStreamingManifest$StreamElement(String s, String s1, int i, String s2, long l, String s3, 
			int j, int k, int i1, int j1, int k1, String s4, SmoothStreamingManifest.TrackElement atrackelement[], 
			List list, long l1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #56  <Method void Object()>
		baseUri = s;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #58  <Field String baseUri>
		chunkTemplate = s1;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #60  <Field String chunkTemplate>
		type = i;
	//    8   14:aload_0         
	//    9   15:iload_3         
	//   10   16:putfield        #62  <Field int type>
		subType = s2;
	//   11   19:aload_0         
	//   12   20:aload           4
	//   13   22:putfield        #64  <Field String subType>
		timescale = l;
	//   14   25:aload_0         
	//   15   26:lload           5
	//   16   28:putfield        #66  <Field long timescale>
		name = s3;
	//   17   31:aload_0         
	//   18   32:aload           7
	//   19   34:putfield        #68  <Field String name>
		qualityLevels = j;
	//   20   37:aload_0         
	//   21   38:iload           8
	//   22   40:putfield        #70  <Field int qualityLevels>
		maxWidth = k;
	//   23   43:aload_0         
	//   24   44:iload           9
	//   25   46:putfield        #72  <Field int maxWidth>
		maxHeight = i1;
	//   26   49:aload_0         
	//   27   50:iload           10
	//   28   52:putfield        #74  <Field int maxHeight>
		displayWidth = j1;
	//   29   55:aload_0         
	//   30   56:iload           11
	//   31   58:putfield        #76  <Field int displayWidth>
		displayHeight = k1;
	//   32   61:aload_0         
	//   33   62:iload           12
	//   34   64:putfield        #78  <Field int displayHeight>
		language = s4;
	//   35   67:aload_0         
	//   36   68:aload           13
	//   37   70:putfield        #80  <Field String language>
		tracks = atrackelement;
	//   38   73:aload_0         
	//   39   74:aload           14
	//   40   76:putfield        #82  <Field SmoothStreamingManifest$TrackElement[] tracks>
		chunkCount = list.size();
	//   41   79:aload_0         
	//   42   80:aload           15
	//   43   82:invokeinterface #88  <Method int List.size()>
	//   44   87:putfield        #90  <Field int chunkCount>
		chunkStartTimes = list;
	//   45   90:aload_0         
	//   46   91:aload           15
	//   47   93:putfield        #92  <Field List chunkStartTimes>
		lastChunkDurationUs = Util.scaleLargeTimestamp(l1, 0xf4240L, l);
	//   48   96:aload_0         
	//   49   97:lload           16
	//   50   99:ldc2w           #93  <Long 0xf4240L>
	//   51  102:lload           5
	//   52  104:invokestatic    #100 <Method long Util.scaleLargeTimestamp(long, long, long)>
	//   53  107:putfield        #102 <Field long lastChunkDurationUs>
		chunkStartTimesUs = Util.scaleLargeTimestamps(list, 0xf4240L, l);
	//   54  110:aload_0         
	//   55  111:aload           15
	//   56  113:ldc2w           #93  <Long 0xf4240L>
	//   57  116:lload           5
	//   58  118:invokestatic    #106 <Method long[] Util.scaleLargeTimestamps(List, long, long)>
	//   59  121:putfield        #108 <Field long[] chunkStartTimesUs>
	//   60  124:return          
	}
}

// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.source.smoothstreaming.manifest;

import android.net.Uri;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.offline.FilterableManifest;
import com.google.android.exoplayer2.util.*;
import java.util.*;

// Referenced classes of package com.google.android.exoplayer2.source.smoothstreaming.manifest:
//			StreamKey

public class SsManifest
	implements FilterableManifest
{
	public static class ProtectionElement
	{

		public final byte data[];
		public final UUID uuid;

		public ProtectionElement(UUID uuid1, byte abyte0[])
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #16  <Method void Object()>
			uuid = uuid1;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #18  <Field UUID uuid>
			data = abyte0;
		//    5    9:aload_0         
		//    6   10:aload_2         
		//    7   11:putfield        #20  <Field byte[] data>
		//    8   14:return          
		}
	}

	public static class StreamElement
	{

		public Uri buildRequestUri(int i, int j)
		{
			Format aformat[] = formats;
		//    0    0:aload_0         
		//    1    1:getfield        #89  <Field Format[] formats>
		//    2    4:astore          5
			boolean flag1 = false;
		//    3    6:iconst_0        
		//    4    7:istore          4
			boolean flag;
			if(aformat != null)
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
		//   13   22:invokestatic    #112 <Method void Assertions.checkState(boolean)>
			if(chunkStartTimes != null)
		//*  14   25:aload_0         
		//*  15   26:getfield        #91  <Field List chunkStartTimes>
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
		//   23   40:invokestatic    #112 <Method void Assertions.checkState(boolean)>
			flag = flag1;
		//   24   43:iload           4
		//   25   45:istore_3        
			if(j < chunkStartTimes.size())
		//*  26   46:iload_2         
		//*  27   47:aload_0         
		//*  28   48:getfield        #91  <Field List chunkStartTimes>
		//*  29   51:invokeinterface #101 <Method int List.size()>
		//*  30   56:icmpge          61
				flag = true;
		//   31   59:iconst_1        
		//   32   60:istore_3        
			Assertions.checkState(flag);
		//   33   61:iload_3         
		//   34   62:invokestatic    #112 <Method void Assertions.checkState(boolean)>
			String s = Integer.toString(formats[i].bitrate);
		//   35   65:aload_0         
		//   36   66:getfield        #89  <Field Format[] formats>
		//   37   69:iload_1         
		//   38   70:aaload          
		//   39   71:getfield        #117 <Field int Format.bitrate>
		//   40   74:invokestatic    #123 <Method String Integer.toString(int)>
		//   41   77:astore          5
			String s1 = ((Long)chunkStartTimes.get(j)).toString();
		//   42   79:aload_0         
		//   43   80:getfield        #91  <Field List chunkStartTimes>
		//   44   83:iload_2         
		//   45   84:invokeinterface #127 <Method Object List.get(int)>
		//   46   89:checkcast       #129 <Class Long>
		//   47   92:invokevirtual   #132 <Method String Long.toString()>
		//   48   95:astore          6
			s = chunkTemplate.replace("{bitrate}", ((CharSequence) (s))).replace("{Bitrate}", ((CharSequence) (s))).replace("{start time}", ((CharSequence) (s1))).replace("{start_time}", ((CharSequence) (s1)));
		//   49   97:aload_0         
		//   50   98:getfield        #69  <Field String chunkTemplate>
		//   51  101:ldc1            #11  <String "{bitrate}">
		//   52  103:aload           5
		//   53  105:invokevirtual   #138 <Method String String.replace(CharSequence, CharSequence)>
		//   54  108:ldc1            #14  <String "{Bitrate}">
		//   55  110:aload           5
		//   56  112:invokevirtual   #138 <Method String String.replace(CharSequence, CharSequence)>
		//   57  115:ldc1            #17  <String "{start time}">
		//   58  117:aload           6
		//   59  119:invokevirtual   #138 <Method String String.replace(CharSequence, CharSequence)>
		//   60  122:ldc1            #20  <String "{start_time}">
		//   61  124:aload           6
		//   62  126:invokevirtual   #138 <Method String String.replace(CharSequence, CharSequence)>
		//   63  129:astore          5
			return UriUtil.resolveToUri(baseUri, s);
		//   64  131:aload_0         
		//   65  132:getfield        #67  <Field String baseUri>
		//   66  135:aload           5
		//   67  137:invokestatic    #144 <Method Uri UriUtil.resolveToUri(String, String)>
		//   68  140:areturn         
		}

		public StreamElement copy(Format aformat[])
		{
			return new StreamElement(baseUri, chunkTemplate, type, subType, timescale, name, maxWidth, maxHeight, displayWidth, displayHeight, language, aformat, chunkStartTimes, chunkStartTimesUs, lastChunkDurationUs);
		//    0    0:new             #2   <Class SsManifest$StreamElement>
		//    1    3:dup             
		//    2    4:aload_0         
		//    3    5:getfield        #67  <Field String baseUri>
		//    4    8:aload_0         
		//    5    9:getfield        #69  <Field String chunkTemplate>
		//    6   12:aload_0         
		//    7   13:getfield        #71  <Field int type>
		//    8   16:aload_0         
		//    9   17:getfield        #73  <Field String subType>
		//   10   20:aload_0         
		//   11   21:getfield        #75  <Field long timescale>
		//   12   24:aload_0         
		//   13   25:getfield        #77  <Field String name>
		//   14   28:aload_0         
		//   15   29:getfield        #79  <Field int maxWidth>
		//   16   32:aload_0         
		//   17   33:getfield        #81  <Field int maxHeight>
		//   18   36:aload_0         
		//   19   37:getfield        #83  <Field int displayWidth>
		//   20   40:aload_0         
		//   21   41:getfield        #85  <Field int displayHeight>
		//   22   44:aload_0         
		//   23   45:getfield        #87  <Field String language>
		//   24   48:aload_1         
		//   25   49:aload_0         
		//   26   50:getfield        #91  <Field List chunkStartTimes>
		//   27   53:aload_0         
		//   28   54:getfield        #93  <Field long[] chunkStartTimesUs>
		//   29   57:aload_0         
		//   30   58:getfield        #95  <Field long lastChunkDurationUs>
		//   31   61:invokespecial   #59  <Method void SsManifest$StreamElement(String, String, int, String, long, String, int, int, int, int, String, Format[], List, long[], long)>
		//   32   64:areturn         
		}

		public long getChunkDurationUs(int i)
		{
			if(i == chunkCount - 1)
		//*   0    0:iload_1         
		//*   1    1:aload_0         
		//*   2    2:getfield        #103 <Field int chunkCount>
		//*   3    5:iconst_1        
		//*   4    6:isub            
		//*   5    7:icmpne          15
				return lastChunkDurationUs;
		//    6   10:aload_0         
		//    7   11:getfield        #95  <Field long lastChunkDurationUs>
		//    8   14:lreturn         
			else
				return chunkStartTimesUs[i + 1] - chunkStartTimesUs[i];
		//    9   15:aload_0         
		//   10   16:getfield        #93  <Field long[] chunkStartTimesUs>
		//   11   19:iload_1         
		//   12   20:iconst_1        
		//   13   21:iadd            
		//   14   22:laload          
		//   15   23:aload_0         
		//   16   24:getfield        #93  <Field long[] chunkStartTimesUs>
		//   17   27:iload_1         
		//   18   28:laload          
		//   19   29:lsub            
		//   20   30:lreturn         
		}

		public int getChunkIndex(long l)
		{
			return Util.binarySearchFloor(chunkStartTimesUs, l, true, true);
		//    0    0:aload_0         
		//    1    1:getfield        #93  <Field long[] chunkStartTimesUs>
		//    2    4:lload_1         
		//    3    5:iconst_1        
		//    4    6:iconst_1        
		//    5    7:invokestatic    #154 <Method int Util.binarySearchFloor(long[], long, boolean, boolean)>
		//    6   10:ireturn         
		}

		public long getStartTimeUs(int i)
		{
			return chunkStartTimesUs[i];
		//    0    0:aload_0         
		//    1    1:getfield        #93  <Field long[] chunkStartTimesUs>
		//    2    4:iload_1         
		//    3    5:laload          
		//    4    6:lreturn         
		}

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
		public final Format formats[];
		public final String language;
		private final long lastChunkDurationUs;
		public final int maxHeight;
		public final int maxWidth;
		public final String name;
		public final String subType;
		public final long timescale;
		public final int type;

		public StreamElement(String s, String s1, int i, String s2, long l, String s3, 
				int j, int k, int i1, int j1, String s4, Format aformat[], List list, 
				long l1)
		{
			this(s, s1, i, s2, l, s3, j, k, i1, j1, s4, aformat, list, Util.scaleLargeTimestamps(list, 0xf4240L, l), Util.scaleLargeTimestamp(l1, 0xf4240L, l));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:iload_3         
		//    4    4:aload           4
		//    5    6:lload           5
		//    6    8:aload           7
		//    7   10:iload           8
		//    8   12:iload           9
		//    9   14:iload           10
		//   10   16:iload           11
		//   11   18:aload           12
		//   12   20:aload           13
		//   13   22:aload           14
		//   14   24:aload           14
		//   15   26:ldc2w           #45  <Long 0xf4240L>
		//   16   29:lload           5
		//   17   31:invokestatic    #52  <Method long[] Util.scaleLargeTimestamps(List, long, long)>
		//   18   34:lload           15
		//   19   36:ldc2w           #45  <Long 0xf4240L>
		//   20   39:lload           5
		//   21   41:invokestatic    #56  <Method long Util.scaleLargeTimestamp(long, long, long)>
		//   22   44:invokespecial   #59  <Method void SsManifest$StreamElement(String, String, int, String, long, String, int, int, int, int, String, Format[], List, long[], long)>
		//   23   47:return          
		}

		private StreamElement(String s, String s1, int i, String s2, long l, String s3, 
				int j, int k, int i1, int j1, String s4, Format aformat[], List list, 
				long al[], long l1)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #65  <Method void Object()>
			baseUri = s;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #67  <Field String baseUri>
			chunkTemplate = s1;
		//    5    9:aload_0         
		//    6   10:aload_2         
		//    7   11:putfield        #69  <Field String chunkTemplate>
			type = i;
		//    8   14:aload_0         
		//    9   15:iload_3         
		//   10   16:putfield        #71  <Field int type>
			subType = s2;
		//   11   19:aload_0         
		//   12   20:aload           4
		//   13   22:putfield        #73  <Field String subType>
			timescale = l;
		//   14   25:aload_0         
		//   15   26:lload           5
		//   16   28:putfield        #75  <Field long timescale>
			name = s3;
		//   17   31:aload_0         
		//   18   32:aload           7
		//   19   34:putfield        #77  <Field String name>
			maxWidth = j;
		//   20   37:aload_0         
		//   21   38:iload           8
		//   22   40:putfield        #79  <Field int maxWidth>
			maxHeight = k;
		//   23   43:aload_0         
		//   24   44:iload           9
		//   25   46:putfield        #81  <Field int maxHeight>
			displayWidth = i1;
		//   26   49:aload_0         
		//   27   50:iload           10
		//   28   52:putfield        #83  <Field int displayWidth>
			displayHeight = j1;
		//   29   55:aload_0         
		//   30   56:iload           11
		//   31   58:putfield        #85  <Field int displayHeight>
			language = s4;
		//   32   61:aload_0         
		//   33   62:aload           12
		//   34   64:putfield        #87  <Field String language>
			formats = aformat;
		//   35   67:aload_0         
		//   36   68:aload           13
		//   37   70:putfield        #89  <Field Format[] formats>
			chunkStartTimes = list;
		//   38   73:aload_0         
		//   39   74:aload           14
		//   40   76:putfield        #91  <Field List chunkStartTimes>
			chunkStartTimesUs = al;
		//   41   79:aload_0         
		//   42   80:aload           15
		//   43   82:putfield        #93  <Field long[] chunkStartTimesUs>
			lastChunkDurationUs = l1;
		//   44   85:aload_0         
		//   45   86:lload           16
		//   46   88:putfield        #95  <Field long lastChunkDurationUs>
			chunkCount = list.size();
		//   47   91:aload_0         
		//   48   92:aload           14
		//   49   94:invokeinterface #101 <Method int List.size()>
		//   50   99:putfield        #103 <Field int chunkCount>
		//   51  102:return          
		}
	}


	private SsManifest(int i, int j, long l, long l1, int k, 
			boolean flag, ProtectionElement protectionelement, StreamElement astreamelement[])
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #33  <Method void Object()>
		majorVersion = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #35  <Field int majorVersion>
		minorVersion = j;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #37  <Field int minorVersion>
		durationUs = l;
	//    8   14:aload_0         
	//    9   15:lload_3         
	//   10   16:putfield        #39  <Field long durationUs>
		dvrWindowLengthUs = l1;
	//   11   19:aload_0         
	//   12   20:lload           5
	//   13   22:putfield        #41  <Field long dvrWindowLengthUs>
		lookAheadCount = k;
	//   14   25:aload_0         
	//   15   26:iload           7
	//   16   28:putfield        #43  <Field int lookAheadCount>
		isLive = flag;
	//   17   31:aload_0         
	//   18   32:iload           8
	//   19   34:putfield        #45  <Field boolean isLive>
		protectionElement = protectionelement;
	//   20   37:aload_0         
	//   21   38:aload           9
	//   22   40:putfield        #47  <Field SsManifest$ProtectionElement protectionElement>
		streamElements = astreamelement;
	//   23   43:aload_0         
	//   24   44:aload           10
	//   25   46:putfield        #49  <Field SsManifest$StreamElement[] streamElements>
	//   26   49:return          
	}

	public SsManifest(int i, int j, long l, long l1, long l2, int k, boolean flag, ProtectionElement protectionelement, StreamElement astreamelement[])
	{
		long l3 = 0x1L;
	//    0    0:ldc2w           #52  <Long 0x1L>
	//    1    3:lstore          13
		if(l1 == 0L)
	//*   2    5:lload           5
	//*   3    7:lconst_0        
	//*   4    8:lcmp            
	//*   5    9:ifne            20
			l1 = 0x1L;
	//    6   12:ldc2w           #52  <Long 0x1L>
	//    7   15:lstore          5
		else
	//*   8   17:goto            31
			l1 = Util.scaleLargeTimestamp(l1, 0xf4240L, l);
	//    9   20:lload           5
	//   10   22:ldc2w           #54  <Long 0xf4240L>
	//   11   25:lload_3         
	//   12   26:invokestatic    #61  <Method long Util.scaleLargeTimestamp(long, long, long)>
	//   13   29:lstore          5
		if(l2 == 0L)
	//*  14   31:lload           7
	//*  15   33:lconst_0        
	//*  16   34:lcmp            
	//*  17   35:ifne            44
			l = l3;
	//   18   38:lload           13
	//   19   40:lstore_3        
		else
	//*  20   41:goto            57
			l = Util.scaleLargeTimestamp(l2, 0xf4240L, l);
	//   21   44:lload           7
	//   22   46:ldc2w           #54  <Long 0xf4240L>
	//   23   49:lload_3         
	//   24   50:invokestatic    #61  <Method long Util.scaleLargeTimestamp(long, long, long)>
	//   25   53:lstore_3        
	//*  26   54:goto            41
		this(i, j, l1, l, k, flag, protectionelement, astreamelement);
	//   27   57:aload_0         
	//   28   58:iload_1         
	//   29   59:iload_2         
	//   30   60:lload           5
	//   31   62:lload_3         
	//   32   63:iload           9
	//   33   65:iload           10
	//   34   67:aload           11
	//   35   69:aload           12
	//   36   71:invokespecial   #63  <Method void SsManifest(int, int, long, long, int, boolean, SsManifest$ProtectionElement, SsManifest$StreamElement[])>
	//   37   74:return          
	}

	public final SsManifest copy(List list)
	{
		ArrayList arraylist = new ArrayList(((java.util.Collection) (list)));
	//    0    0:new             #67  <Class ArrayList>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:invokespecial   #70  <Method void ArrayList(java.util.Collection)>
	//    4    8:astore          4
		Collections.sort(((List) (arraylist)));
	//    5   10:aload           4
	//    6   12:invokestatic    #76  <Method void Collections.sort(List)>
		ArrayList arraylist1 = new ArrayList();
	//    7   15:new             #67  <Class ArrayList>
	//    8   18:dup             
	//    9   19:invokespecial   #77  <Method void ArrayList()>
	//   10   22:astore          5
		ArrayList arraylist2 = new ArrayList();
	//   11   24:new             #67  <Class ArrayList>
	//   12   27:dup             
	//   13   28:invokespecial   #77  <Method void ArrayList()>
	//   14   31:astore          6
		list = null;
	//   15   33:aconst_null     
	//   16   34:astore_1        
		for(int i = 0; i < arraylist.size();)
	//*  17   35:iconst_0        
	//*  18   36:istore_2        
	//*  19   37:iload_2         
	//*  20   38:aload           4
	//*  21   40:invokevirtual   #81  <Method int ArrayList.size()>
	//*  22   43:icmpge          137
		{
			StreamKey streamkey = (StreamKey)arraylist.get(i);
	//   23   46:aload           4
	//   24   48:iload_2         
	//   25   49:invokevirtual   #85  <Method Object ArrayList.get(int)>
	//   26   52:checkcast       #87  <Class StreamKey>
	//   27   55:astore          7
			StreamElement streamelement = streamElements[streamkey.streamElementIndex];
	//   28   57:aload_0         
	//   29   58:getfield        #49  <Field SsManifest$StreamElement[] streamElements>
	//   30   61:aload           7
	//   31   63:getfield        #90  <Field int StreamKey.streamElementIndex>
	//   32   66:aaload          
	//   33   67:astore_3        
			if(streamelement != list && list != null)
	//*  34   68:aload_3         
	//*  35   69:aload_1         
	//*  36   70:if_acmpeq       110
	//*  37   73:aload_1         
	//*  38   74:ifnull          110
			{
				((List) (arraylist1)).add(((Object) (((StreamElement) (list)).copy((Format[])((List) (arraylist2)).toArray(((Object []) (new Format[0])))))));
	//   39   77:aload           5
	//   40   79:aload_1         
	//   41   80:aload           6
	//   42   82:iconst_0        
	//   43   83:anewarray       Format[]
	//   44   86:invokeinterface #98  <Method Object[] List.toArray(Object[])>
	//   45   91:checkcast       #100 <Class Format[]>
	//   46   94:invokevirtual   #103 <Method SsManifest$StreamElement SsManifest$StreamElement.copy(Format[])>
	//   47   97:invokeinterface #107 <Method boolean List.add(Object)>
	//   48  102:pop             
				((List) (arraylist2)).clear();
	//   49  103:aload           6
	//   50  105:invokeinterface #110 <Method void List.clear()>
			}
			((List) (arraylist2)).add(((Object) (streamelement.formats[streamkey.trackIndex])));
	//   51  110:aload           6
	//   52  112:aload_3         
	//   53  113:getfield        #113 <Field Format[] SsManifest$StreamElement.formats>
	//   54  116:aload           7
	//   55  118:getfield        #116 <Field int StreamKey.trackIndex>
	//   56  121:aaload          
	//   57  122:invokeinterface #107 <Method boolean List.add(Object)>
	//   58  127:pop             
			i++;
	//   59  128:iload_2         
	//   60  129:iconst_1        
	//   61  130:iadd            
	//   62  131:istore_2        
			list = ((List) (streamelement));
	//   63  132:aload_3         
	//   64  133:astore_1        
		}

	//*  65  134:goto            37
		if(list != null)
	//*  66  137:aload_1         
	//*  67  138:ifnull          167
			((List) (arraylist1)).add(((Object) (((StreamElement) (list)).copy((Format[])((List) (arraylist2)).toArray(((Object []) (new Format[0])))))));
	//   68  141:aload           5
	//   69  143:aload_1         
	//   70  144:aload           6
	//   71  146:iconst_0        
	//   72  147:anewarray       Format[]
	//   73  150:invokeinterface #98  <Method Object[] List.toArray(Object[])>
	//   74  155:checkcast       #100 <Class Format[]>
	//   75  158:invokevirtual   #103 <Method SsManifest$StreamElement SsManifest$StreamElement.copy(Format[])>
	//   76  161:invokeinterface #107 <Method boolean List.add(Object)>
	//   77  166:pop             
		list = ((List) ((StreamElement[])((List) (arraylist1)).toArray(((Object []) (new StreamElement[0])))));
	//   78  167:aload           5
	//   79  169:iconst_0        
	//   80  170:anewarray       StreamElement[]
	//   81  173:invokeinterface #98  <Method Object[] List.toArray(Object[])>
	//   82  178:checkcast       #117 <Class SsManifest$StreamElement[]>
	//   83  181:astore_1        
		return new SsManifest(majorVersion, minorVersion, durationUs, dvrWindowLengthUs, lookAheadCount, isLive, protectionElement, ((StreamElement []) (list)));
	//   84  182:new             #2   <Class SsManifest>
	//   85  185:dup             
	//   86  186:aload_0         
	//   87  187:getfield        #35  <Field int majorVersion>
	//   88  190:aload_0         
	//   89  191:getfield        #37  <Field int minorVersion>
	//   90  194:aload_0         
	//   91  195:getfield        #39  <Field long durationUs>
	//   92  198:aload_0         
	//   93  199:getfield        #41  <Field long dvrWindowLengthUs>
	//   94  202:aload_0         
	//   95  203:getfield        #43  <Field int lookAheadCount>
	//   96  206:aload_0         
	//   97  207:getfield        #45  <Field boolean isLive>
	//   98  210:aload_0         
	//   99  211:getfield        #47  <Field SsManifest$ProtectionElement protectionElement>
	//  100  214:aload_1         
	//  101  215:invokespecial   #63  <Method void SsManifest(int, int, long, long, int, boolean, SsManifest$ProtectionElement, SsManifest$StreamElement[])>
	//  102  218:areturn         
	}

	public volatile Object copy(List list)
	{
		return ((Object) (copy(list)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #122 <Method SsManifest copy(List)>
	//    3    5:areturn         
	}

	public static final int UNSET_LOOKAHEAD = -1;
	public final long durationUs;
	public final long dvrWindowLengthUs;
	public final boolean isLive;
	public final int lookAheadCount;
	public final int majorVersion;
	public final int minorVersion;
	public final ProtectionElement protectionElement;
	public final StreamElement streamElements[];
}

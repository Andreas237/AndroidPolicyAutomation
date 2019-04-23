// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer.smoothstreaming;

import com.google.android.exoplayer.ParserException;
import java.util.*;
import org.xmlpull.v1.XmlPullParser;

// Referenced classes of package com.google.android.exoplayer.smoothstreaming:
//			SmoothStreamingManifestParser

private static class SmoothStreamingManifestParser$StreamElementParser extends SmoothStreamingManifestParser.ElementParser
{

	private void parseStreamElementStartTag(XmlPullParser xmlpullparser)
		throws ParserException
	{
		type = parseType(xmlpullparser);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:aload_1         
	//    3    3:invokespecial   #109 <Method int parseType(XmlPullParser)>
	//    4    6:putfield        #111 <Field int type>
		putNormalizedAttribute("Type", ((Object) (Integer.valueOf(type))));
	//    5    9:aload_0         
	//    6   10:ldc1            #47  <String "Type">
	//    7   12:aload_0         
	//    8   13:getfield        #111 <Field int type>
	//    9   16:invokestatic    #117 <Method Integer Integer.valueOf(int)>
	//   10   19:invokevirtual   #121 <Method void putNormalizedAttribute(String, Object)>
		if(type == 2)
	//*  11   22:aload_0         
	//*  12   23:getfield        #111 <Field int type>
	//*  13   26:iconst_2        
	//*  14   27:icmpne          44
			subType = parseRequiredString(xmlpullparser, "Subtype");
	//   15   30:aload_0         
	//   16   31:aload_0         
	//   17   32:aload_1         
	//   18   33:ldc1            #41  <String "Subtype">
	//   19   35:invokevirtual   #125 <Method String parseRequiredString(XmlPullParser, String)>
	//   20   38:putfield        #127 <Field String subType>
		else
	//*  21   41:goto            57
			subType = xmlpullparser.getAttributeValue(((String) (null)), "Subtype");
	//   22   44:aload_0         
	//   23   45:aload_1         
	//   24   46:aconst_null     
	//   25   47:ldc1            #41  <String "Subtype">
	//   26   49:invokeinterface #133 <Method String XmlPullParser.getAttributeValue(String, String)>
	//   27   54:putfield        #127 <Field String subType>
		name = xmlpullparser.getAttributeValue(((String) (null)), "Name");
	//   28   57:aload_0         
	//   29   58:aload_1         
	//   30   59:aconst_null     
	//   31   60:ldc1            #35  <String "Name">
	//   32   62:invokeinterface #133 <Method String XmlPullParser.getAttributeValue(String, String)>
	//   33   67:putfield        #135 <Field String name>
		qualityLevels = parseInt(xmlpullparser, "QualityLevels", -1);
	//   34   70:aload_0         
	//   35   71:aload_0         
	//   36   72:aload_1         
	//   37   73:ldc1            #38  <String "QualityLevels">
	//   38   75:iconst_m1       
	//   39   76:invokevirtual   #139 <Method int parseInt(XmlPullParser, String, int)>
	//   40   79:putfield        #141 <Field int qualityLevels>
		url = parseRequiredString(xmlpullparser, "Url");
	//   41   82:aload_0         
	//   42   83:aload_0         
	//   43   84:aload_1         
	//   44   85:ldc1            #59  <String "Url">
	//   45   87:invokevirtual   #125 <Method String parseRequiredString(XmlPullParser, String)>
	//   46   90:putfield        #143 <Field String url>
		maxWidth = parseInt(xmlpullparser, "MaxWidth", -1);
	//   47   93:aload_0         
	//   48   94:aload_0         
	//   49   95:aload_1         
	//   50   96:ldc1            #32  <String "MaxWidth">
	//   51   98:iconst_m1       
	//   52   99:invokevirtual   #139 <Method int parseInt(XmlPullParser, String, int)>
	//   53  102:putfield        #145 <Field int maxWidth>
		maxHeight = parseInt(xmlpullparser, "MaxHeight", -1);
	//   54  105:aload_0         
	//   55  106:aload_0         
	//   56  107:aload_1         
	//   57  108:ldc1            #29  <String "MaxHeight">
	//   58  110:iconst_m1       
	//   59  111:invokevirtual   #139 <Method int parseInt(XmlPullParser, String, int)>
	//   60  114:putfield        #147 <Field int maxHeight>
		displayWidth = parseInt(xmlpullparser, "DisplayWidth", -1);
	//   61  117:aload_0         
	//   62  118:aload_0         
	//   63  119:aload_1         
	//   64  120:ldc1            #14  <String "DisplayWidth">
	//   65  122:iconst_m1       
	//   66  123:invokevirtual   #139 <Method int parseInt(XmlPullParser, String, int)>
	//   67  126:putfield        #149 <Field int displayWidth>
		displayHeight = parseInt(xmlpullparser, "DisplayHeight", -1);
	//   68  129:aload_0         
	//   69  130:aload_0         
	//   70  131:aload_1         
	//   71  132:ldc1            #11  <String "DisplayHeight">
	//   72  134:iconst_m1       
	//   73  135:invokevirtual   #139 <Method int parseInt(XmlPullParser, String, int)>
	//   74  138:putfield        #151 <Field int displayHeight>
		language = xmlpullparser.getAttributeValue(((String) (null)), "Language");
	//   75  141:aload_0         
	//   76  142:aload_1         
	//   77  143:aconst_null     
	//   78  144:ldc1            #26  <String "Language">
	//   79  146:invokeinterface #133 <Method String XmlPullParser.getAttributeValue(String, String)>
	//   80  151:putfield        #153 <Field String language>
		putNormalizedAttribute("Language", ((Object) (language)));
	//   81  154:aload_0         
	//   82  155:ldc1            #26  <String "Language">
	//   83  157:aload_0         
	//   84  158:getfield        #153 <Field String language>
	//   85  161:invokevirtual   #121 <Method void putNormalizedAttribute(String, Object)>
		timescale = parseInt(xmlpullparser, "TimeScale", -1);
	//   86  164:aload_0         
	//   87  165:aload_0         
	//   88  166:aload_1         
	//   89  167:ldc1            #44  <String "TimeScale">
	//   90  169:iconst_m1       
	//   91  170:invokevirtual   #139 <Method int parseInt(XmlPullParser, String, int)>
	//   92  173:i2l             
	//   93  174:putfield        #155 <Field long timescale>
		if(timescale == -1L)
	//*  94  177:aload_0         
	//*  95  178:getfield        #155 <Field long timescale>
	//*  96  181:ldc2w           #156 <Long -1L>
	//*  97  184:lcmp            
	//*  98  185:ifne            204
			timescale = ((Long)getNormalizedAttribute("TimeScale")).longValue();
	//   99  188:aload_0         
	//  100  189:aload_0         
	//  101  190:ldc1            #44  <String "TimeScale">
	//  102  192:invokevirtual   #161 <Method Object getNormalizedAttribute(String)>
	//  103  195:checkcast       #163 <Class Long>
	//  104  198:invokevirtual   #167 <Method long Long.longValue()>
	//  105  201:putfield        #155 <Field long timescale>
		startTimes = new ArrayList();
	//  106  204:aload_0         
	//  107  205:new             #169 <Class ArrayList>
	//  108  208:dup             
	//  109  209:invokespecial   #170 <Method void ArrayList()>
	//  110  212:putfield        #172 <Field ArrayList startTimes>
	//  111  215:return          
	}

	private void parseStreamFragmentStartTag(XmlPullParser xmlpullparser)
		throws ParserException
	{
		int i = startTimes.size();
	//    0    0:aload_0         
	//    1    1:getfield        #172 <Field ArrayList startTimes>
	//    2    4:invokevirtual   #178 <Method int ArrayList.size()>
	//    3    7:istore_2        
		long l1 = parseLong(xmlpullparser, "t", -1L);
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:ldc1            #23  <String "t">
	//    7   12:ldc2w           #156 <Long -1L>
	//    8   15:invokevirtual   #182 <Method long parseLong(XmlPullParser, String, long)>
	//    9   18:lstore          6
		boolean flag = true;
	//   10   20:iconst_1        
	//   11   21:istore_3        
		long l = l1;
	//   12   22:lload           6
	//   13   24:lstore          4
		if(l1 == -1L)
	//*  14   26:lload           6
	//*  15   28:ldc2w           #156 <Long -1L>
	//*  16   31:lcmp            
	//*  17   32:ifne            96
			if(i == 0)
	//*  18   35:iload_2         
	//*  19   36:ifne            45
				l = 0L;
	//   20   39:lconst_0        
	//   21   40:lstore          4
			else
	//*  22   42:goto            96
			if(lastChunkDuration != -1L)
	//*  23   45:aload_0         
	//*  24   46:getfield        #184 <Field long lastChunkDuration>
	//*  25   49:ldc2w           #156 <Long -1L>
	//*  26   52:lcmp            
	//*  27   53:ifeq            86
			{
				l = ((Long)startTimes.get(i - 1)).longValue();
	//   28   56:aload_0         
	//   29   57:getfield        #172 <Field ArrayList startTimes>
	//   30   60:iload_2         
	//   31   61:iconst_1        
	//   32   62:isub            
	//   33   63:invokevirtual   #188 <Method Object ArrayList.get(int)>
	//   34   66:checkcast       #163 <Class Long>
	//   35   69:invokevirtual   #167 <Method long Long.longValue()>
	//   36   72:lstore          4
				l = lastChunkDuration + l;
	//   37   74:aload_0         
	//   38   75:getfield        #184 <Field long lastChunkDuration>
	//   39   78:lload           4
	//   40   80:ladd            
	//   41   81:lstore          4
			} else
	//*  42   83:goto            96
			{
				throw new ParserException("Unable to infer start time");
	//   43   86:new             #105 <Class ParserException>
	//   44   89:dup             
	//   45   90:ldc1            #190 <String "Unable to infer start time">
	//   46   92:invokespecial   #193 <Method void ParserException(String)>
	//   47   95:athrow          
			}
		startTimes.add(((Object) (Long.valueOf(l))));
	//   48   96:aload_0         
	//   49   97:getfield        #172 <Field ArrayList startTimes>
	//   50  100:lload           4
	//   51  102:invokestatic    #196 <Method Long Long.valueOf(long)>
	//   52  105:invokevirtual   #200 <Method boolean ArrayList.add(Object)>
	//   53  108:pop             
		lastChunkDuration = parseLong(xmlpullparser, "d", -1L);
	//   54  109:aload_0         
	//   55  110:aload_0         
	//   56  111:aload_1         
	//   57  112:ldc1            #17  <String "d">
	//   58  114:ldc2w           #156 <Long -1L>
	//   59  117:invokevirtual   #182 <Method long parseLong(XmlPullParser, String, long)>
	//   60  120:putfield        #184 <Field long lastChunkDuration>
		l1 = parseLong(xmlpullparser, "r", 1L);
	//   61  123:aload_0         
	//   62  124:aload_1         
	//   63  125:ldc1            #20  <String "r">
	//   64  127:lconst_1        
	//   65  128:invokevirtual   #182 <Method long parseLong(XmlPullParser, String, long)>
	//   66  131:lstore          6
		i = ((int) (flag));
	//   67  133:iload_3         
	//   68  134:istore_2        
		if(l1 > 1L)
	//*  69  135:lload           6
	//*  70  137:lconst_1        
	//*  71  138:lcmp            
	//*  72  139:ifle            168
			if(lastChunkDuration != -1L)
	//*  73  142:aload_0         
	//*  74  143:getfield        #184 <Field long lastChunkDuration>
	//*  75  146:ldc2w           #156 <Long -1L>
	//*  76  149:lcmp            
	//*  77  150:ifeq            158
				i = ((int) (flag));
	//   78  153:iload_3         
	//   79  154:istore_2        
			else
	//*  80  155:goto            168
				throw new ParserException("Repeated chunk with unspecified duration");
	//   81  158:new             #105 <Class ParserException>
	//   82  161:dup             
	//   83  162:ldc1            #202 <String "Repeated chunk with unspecified duration">
	//   84  164:invokespecial   #193 <Method void ParserException(String)>
	//   85  167:athrow          
		do
		{
			long l2 = i;
	//   86  168:iload_2         
	//   87  169:i2l             
	//   88  170:lstore          8
			if(l2 < l1)
	//*  89  172:lload           8
	//*  90  174:lload           6
	//*  91  176:lcmp            
	//*  92  177:ifge            208
			{
				startTimes.add(((Object) (Long.valueOf(lastChunkDuration * l2 + l))));
	//   93  180:aload_0         
	//   94  181:getfield        #172 <Field ArrayList startTimes>
	//   95  184:aload_0         
	//   96  185:getfield        #184 <Field long lastChunkDuration>
	//   97  188:lload           8
	//   98  190:lmul            
	//   99  191:lload           4
	//  100  193:ladd            
	//  101  194:invokestatic    #196 <Method Long Long.valueOf(long)>
	//  102  197:invokevirtual   #200 <Method boolean ArrayList.add(Object)>
	//  103  200:pop             
				i++;
	//  104  201:iload_2         
	//  105  202:iconst_1        
	//  106  203:iadd            
	//  107  204:istore_2        
			} else
	//* 108  205:goto            168
			{
				return;
	//  109  208:return          
			}
		} while(true);
	}

	private int parseType(XmlPullParser xmlpullparser)
		throws ParserException
	{
		xmlpullparser = ((XmlPullParser) (xmlpullparser.getAttributeValue(((String) (null)), "Type")));
	//    0    0:aload_1         
	//    1    1:aconst_null     
	//    2    2:ldc1            #47  <String "Type">
	//    3    4:invokeinterface #133 <Method String XmlPullParser.getAttributeValue(String, String)>
	//    4    9:astore_1        
		if(xmlpullparser != null)
	//*   5   10:aload_1         
	//*   6   11:ifnull          87
		{
			if("audio".equalsIgnoreCase(((String) (xmlpullparser))))
	//*   7   14:ldc1            #50  <String "audio">
	//*   8   16:aload_1         
	//*   9   17:invokevirtual   #208 <Method boolean String.equalsIgnoreCase(String)>
	//*  10   20:ifeq            25
				return 0;
	//   11   23:iconst_0        
	//   12   24:ireturn         
			if("video".equalsIgnoreCase(((String) (xmlpullparser))))
	//*  13   25:ldc1            #56  <String "video">
	//*  14   27:aload_1         
	//*  15   28:invokevirtual   #208 <Method boolean String.equalsIgnoreCase(String)>
	//*  16   31:ifeq            36
				return 1;
	//   17   34:iconst_1        
	//   18   35:ireturn         
			if("text".equalsIgnoreCase(((String) (xmlpullparser))))
	//*  19   36:ldc1            #53  <String "text">
	//*  20   38:aload_1         
	//*  21   39:invokevirtual   #208 <Method boolean String.equalsIgnoreCase(String)>
	//*  22   42:ifeq            47
			{
				return 2;
	//   23   45:iconst_2        
	//   24   46:ireturn         
			} else
			{
				StringBuilder stringbuilder = new StringBuilder();
	//   25   47:new             #210 <Class StringBuilder>
	//   26   50:dup             
	//   27   51:invokespecial   #211 <Method void StringBuilder()>
	//   28   54:astore_2        
				stringbuilder.append("Invalid key value[");
	//   29   55:aload_2         
	//   30   56:ldc1            #213 <String "Invalid key value[">
	//   31   58:invokevirtual   #217 <Method StringBuilder StringBuilder.append(String)>
	//   32   61:pop             
				stringbuilder.append(((String) (xmlpullparser)));
	//   33   62:aload_2         
	//   34   63:aload_1         
	//   35   64:invokevirtual   #217 <Method StringBuilder StringBuilder.append(String)>
	//   36   67:pop             
				stringbuilder.append("]");
	//   37   68:aload_2         
	//   38   69:ldc1            #219 <String "]">
	//   39   71:invokevirtual   #217 <Method StringBuilder StringBuilder.append(String)>
	//   40   74:pop             
				throw new ParserException(stringbuilder.toString());
	//   41   75:new             #105 <Class ParserException>
	//   42   78:dup             
	//   43   79:aload_2         
	//   44   80:invokevirtual   #223 <Method String StringBuilder.toString()>
	//   45   83:invokespecial   #193 <Method void ParserException(String)>
	//   46   86:athrow          
			}
		} else
		{
			throw new n("Type");
	//   47   87:new             #225 <Class SmoothStreamingManifestParser$MissingFieldException>
	//   48   90:dup             
	//   49   91:ldc1            #47  <String "Type">
	//   50   93:invokespecial   #226 <Method void SmoothStreamingManifestParser$MissingFieldException(String)>
	//   51   96:athrow          
		}
	}

	public void addChild(Object obj)
	{
		if(obj instanceof SmoothStreamingManifest.TrackElement)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #230 <Class SmoothStreamingManifest$TrackElement>
	//*   2    4:ifeq            21
			tracks.add(((Object) ((SmoothStreamingManifest.TrackElement)obj)));
	//    3    7:aload_0         
	//    4    8:getfield        #100 <Field List tracks>
	//    5   11:aload_1         
	//    6   12:checkcast       #230 <Class SmoothStreamingManifest$TrackElement>
	//    7   15:invokeinterface #233 <Method boolean List.add(Object)>
	//    8   20:pop             
	//    9   21:return          
	}

	public Object build()
	{
		SmoothStreamingManifest.TrackElement atrackelement[] = new SmoothStreamingManifest.TrackElement[tracks.size()];
	//    0    0:aload_0         
	//    1    1:getfield        #100 <Field List tracks>
	//    2    4:invokeinterface #236 <Method int List.size()>
	//    3    9:anewarray       SmoothStreamingManifest.TrackElement[]
	//    4   12:astore_1        
		tracks.toArray(((Object []) (atrackelement)));
	//    5   13:aload_0         
	//    6   14:getfield        #100 <Field List tracks>
	//    7   17:aload_1         
	//    8   18:invokeinterface #240 <Method Object[] List.toArray(Object[])>
	//    9   23:pop             
		return ((Object) (new SmoothStreamingManifest.StreamElement(baseUri, url, type, subType, timescale, name, qualityLevels, maxWidth, maxHeight, displayWidth, displayHeight, language, atrackelement, ((List) (startTimes)), lastChunkDuration)));
	//   10   24:new             #242 <Class SmoothStreamingManifest$StreamElement>
	//   11   27:dup             
	//   12   28:aload_0         
	//   13   29:getfield        #93  <Field String baseUri>
	//   14   32:aload_0         
	//   15   33:getfield        #143 <Field String url>
	//   16   36:aload_0         
	//   17   37:getfield        #111 <Field int type>
	//   18   40:aload_0         
	//   19   41:getfield        #127 <Field String subType>
	//   20   44:aload_0         
	//   21   45:getfield        #155 <Field long timescale>
	//   22   48:aload_0         
	//   23   49:getfield        #135 <Field String name>
	//   24   52:aload_0         
	//   25   53:getfield        #141 <Field int qualityLevels>
	//   26   56:aload_0         
	//   27   57:getfield        #145 <Field int maxWidth>
	//   28   60:aload_0         
	//   29   61:getfield        #147 <Field int maxHeight>
	//   30   64:aload_0         
	//   31   65:getfield        #149 <Field int displayWidth>
	//   32   68:aload_0         
	//   33   69:getfield        #151 <Field int displayHeight>
	//   34   72:aload_0         
	//   35   73:getfield        #153 <Field String language>
	//   36   76:aload_1         
	//   37   77:aload_0         
	//   38   78:getfield        #172 <Field ArrayList startTimes>
	//   39   81:aload_0         
	//   40   82:getfield        #184 <Field long lastChunkDuration>
	//   41   85:invokespecial   #245 <Method void SmoothStreamingManifest$StreamElement(String, String, int, String, long, String, int, int, int, int, int, String, SmoothStreamingManifest$TrackElement[], List, long)>
	//   42   88:areturn         
	}

	public boolean handleChildInline(String s)
	{
		return "c".equals(((Object) (s)));
	//    0    0:ldc1            #65  <String "c">
	//    1    2:aload_1         
	//    2    3:invokevirtual   #249 <Method boolean String.equals(Object)>
	//    3    6:ireturn         
	}

	public void parseStartTag(XmlPullParser xmlpullparser)
		throws ParserException
	{
		if("c".equals(((Object) (xmlpullparser.getName()))))
	//*   0    0:ldc1            #65  <String "c">
	//*   1    2:aload_1         
	//*   2    3:invokeinterface #253 <Method String XmlPullParser.getName()>
	//*   3    8:invokevirtual   #249 <Method boolean String.equals(Object)>
	//*   4   11:ifeq            20
		{
			parseStreamFragmentStartTag(xmlpullparser);
	//    5   14:aload_0         
	//    6   15:aload_1         
	//    7   16:invokespecial   #255 <Method void parseStreamFragmentStartTag(XmlPullParser)>
			return;
	//    8   19:return          
		} else
		{
			parseStreamElementStartTag(xmlpullparser);
	//    9   20:aload_0         
	//   10   21:aload_1         
	//   11   22:invokespecial   #257 <Method void parseStreamElementStartTag(XmlPullParser)>
			return;
	//   12   25:return          
		}
	}

	private static final String KEY_DISPLAY_HEIGHT = "DisplayHeight";
	private static final String KEY_DISPLAY_WIDTH = "DisplayWidth";
	private static final String KEY_FRAGMENT_DURATION = "d";
	private static final String KEY_FRAGMENT_REPEAT_COUNT = "r";
	private static final String KEY_FRAGMENT_START_TIME = "t";
	private static final String KEY_LANGUAGE = "Language";
	private static final String KEY_MAX_HEIGHT = "MaxHeight";
	private static final String KEY_MAX_WIDTH = "MaxWidth";
	private static final String KEY_NAME = "Name";
	private static final String KEY_QUALITY_LEVELS = "QualityLevels";
	private static final String KEY_SUB_TYPE = "Subtype";
	private static final String KEY_TIME_SCALE = "TimeScale";
	private static final String KEY_TYPE = "Type";
	private static final String KEY_TYPE_AUDIO = "audio";
	private static final String KEY_TYPE_TEXT = "text";
	private static final String KEY_TYPE_VIDEO = "video";
	private static final String KEY_URL = "Url";
	public static final String TAG = "StreamIndex";
	private static final String TAG_STREAM_FRAGMENT = "c";
	private final String baseUri;
	private int displayHeight;
	private int displayWidth;
	private String language;
	private long lastChunkDuration;
	private int maxHeight;
	private int maxWidth;
	private String name;
	private int qualityLevels;
	private ArrayList startTimes;
	private String subType;
	private long timescale;
	private final List tracks = new LinkedList();
	private int type;
	private String url;

	public SmoothStreamingManifestParser$StreamElementParser(SmoothStreamingManifestParser.ElementParser elementparser, String s)
	{
		super(elementparser, s, "StreamIndex");
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:ldc1            #62  <String "StreamIndex">
	//    4    5:invokespecial   #91  <Method void SmoothStreamingManifestParser$ElementParser(SmoothStreamingManifestParser$ElementParser, String, String)>
		baseUri = s;
	//    5    8:aload_0         
	//    6    9:aload_2         
	//    7   10:putfield        #93  <Field String baseUri>
	//    8   13:aload_0         
	//    9   14:new             #95  <Class LinkedList>
	//   10   17:dup             
	//   11   18:invokespecial   #98  <Method void LinkedList()>
	//   12   21:putfield        #100 <Field List tracks>
	//   13   24:return          
	}
}

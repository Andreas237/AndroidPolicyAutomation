// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.source.smoothstreaming.manifest;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.ParserException;
import java.util.*;
import org.xmlpull.v1.XmlPullParser;

// Referenced classes of package com.google.android.exoplayer2.source.smoothstreaming.manifest:
//			SsManifestParser

private static class SsManifestParser$StreamIndexParser extends SsManifestParser.ElementParser
{

	private void parseStreamElementStartTag(XmlPullParser xmlpullparser)
		throws ParserException
	{
		type = parseType(xmlpullparser);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:aload_1         
	//    3    3:invokespecial   #105 <Method int parseType(XmlPullParser)>
	//    4    6:putfield        #107 <Field int type>
		putNormalizedAttribute("Type", ((Object) (Integer.valueOf(type))));
	//    5    9:aload_0         
	//    6   10:ldc1            #44  <String "Type">
	//    7   12:aload_0         
	//    8   13:getfield        #107 <Field int type>
	//    9   16:invokestatic    #113 <Method Integer Integer.valueOf(int)>
	//   10   19:invokevirtual   #117 <Method void putNormalizedAttribute(String, Object)>
		if(type == 3)
	//*  11   22:aload_0         
	//*  12   23:getfield        #107 <Field int type>
	//*  13   26:iconst_3        
	//*  14   27:icmpne          44
			subType = parseRequiredString(xmlpullparser, "Subtype");
	//   15   30:aload_0         
	//   16   31:aload_0         
	//   17   32:aload_1         
	//   18   33:ldc1            #38  <String "Subtype">
	//   19   35:invokevirtual   #121 <Method String parseRequiredString(XmlPullParser, String)>
	//   20   38:putfield        #123 <Field String subType>
		else
	//*  21   41:goto            57
			subType = xmlpullparser.getAttributeValue(((String) (null)), "Subtype");
	//   22   44:aload_0         
	//   23   45:aload_1         
	//   24   46:aconst_null     
	//   25   47:ldc1            #38  <String "Subtype">
	//   26   49:invokeinterface #129 <Method String XmlPullParser.getAttributeValue(String, String)>
	//   27   54:putfield        #123 <Field String subType>
		name = xmlpullparser.getAttributeValue(((String) (null)), "Name");
	//   28   57:aload_0         
	//   29   58:aload_1         
	//   30   59:aconst_null     
	//   31   60:ldc1            #35  <String "Name">
	//   32   62:invokeinterface #129 <Method String XmlPullParser.getAttributeValue(String, String)>
	//   33   67:putfield        #131 <Field String name>
		url = parseRequiredString(xmlpullparser, "Url");
	//   34   70:aload_0         
	//   35   71:aload_0         
	//   36   72:aload_1         
	//   37   73:ldc1            #56  <String "Url">
	//   38   75:invokevirtual   #121 <Method String parseRequiredString(XmlPullParser, String)>
	//   39   78:putfield        #133 <Field String url>
		maxWidth = parseInt(xmlpullparser, "MaxWidth", -1);
	//   40   81:aload_0         
	//   41   82:aload_0         
	//   42   83:aload_1         
	//   43   84:ldc1            #32  <String "MaxWidth">
	//   44   86:iconst_m1       
	//   45   87:invokevirtual   #137 <Method int parseInt(XmlPullParser, String, int)>
	//   46   90:putfield        #139 <Field int maxWidth>
		maxHeight = parseInt(xmlpullparser, "MaxHeight", -1);
	//   47   93:aload_0         
	//   48   94:aload_0         
	//   49   95:aload_1         
	//   50   96:ldc1            #29  <String "MaxHeight">
	//   51   98:iconst_m1       
	//   52   99:invokevirtual   #137 <Method int parseInt(XmlPullParser, String, int)>
	//   53  102:putfield        #141 <Field int maxHeight>
		displayWidth = parseInt(xmlpullparser, "DisplayWidth", -1);
	//   54  105:aload_0         
	//   55  106:aload_0         
	//   56  107:aload_1         
	//   57  108:ldc1            #14  <String "DisplayWidth">
	//   58  110:iconst_m1       
	//   59  111:invokevirtual   #137 <Method int parseInt(XmlPullParser, String, int)>
	//   60  114:putfield        #143 <Field int displayWidth>
		displayHeight = parseInt(xmlpullparser, "DisplayHeight", -1);
	//   61  117:aload_0         
	//   62  118:aload_0         
	//   63  119:aload_1         
	//   64  120:ldc1            #11  <String "DisplayHeight">
	//   65  122:iconst_m1       
	//   66  123:invokevirtual   #137 <Method int parseInt(XmlPullParser, String, int)>
	//   67  126:putfield        #145 <Field int displayHeight>
		language = xmlpullparser.getAttributeValue(((String) (null)), "Language");
	//   68  129:aload_0         
	//   69  130:aload_1         
	//   70  131:aconst_null     
	//   71  132:ldc1            #26  <String "Language">
	//   72  134:invokeinterface #129 <Method String XmlPullParser.getAttributeValue(String, String)>
	//   73  139:putfield        #147 <Field String language>
		putNormalizedAttribute("Language", ((Object) (language)));
	//   74  142:aload_0         
	//   75  143:ldc1            #26  <String "Language">
	//   76  145:aload_0         
	//   77  146:getfield        #147 <Field String language>
	//   78  149:invokevirtual   #117 <Method void putNormalizedAttribute(String, Object)>
		timescale = parseInt(xmlpullparser, "TimeScale", -1);
	//   79  152:aload_0         
	//   80  153:aload_0         
	//   81  154:aload_1         
	//   82  155:ldc1            #41  <String "TimeScale">
	//   83  157:iconst_m1       
	//   84  158:invokevirtual   #137 <Method int parseInt(XmlPullParser, String, int)>
	//   85  161:i2l             
	//   86  162:putfield        #149 <Field long timescale>
		if(timescale == -1L)
	//*  87  165:aload_0         
	//*  88  166:getfield        #149 <Field long timescale>
	//*  89  169:ldc2w           #150 <Long -1L>
	//*  90  172:lcmp            
	//*  91  173:ifne            192
			timescale = ((Long)getNormalizedAttribute("TimeScale")).longValue();
	//   92  176:aload_0         
	//   93  177:aload_0         
	//   94  178:ldc1            #41  <String "TimeScale">
	//   95  180:invokevirtual   #155 <Method Object getNormalizedAttribute(String)>
	//   96  183:checkcast       #157 <Class Long>
	//   97  186:invokevirtual   #161 <Method long Long.longValue()>
	//   98  189:putfield        #149 <Field long timescale>
		startTimes = new ArrayList();
	//   99  192:aload_0         
	//  100  193:new             #163 <Class ArrayList>
	//  101  196:dup             
	//  102  197:invokespecial   #164 <Method void ArrayList()>
	//  103  200:putfield        #166 <Field ArrayList startTimes>
	//  104  203:return          
	}

	private void parseStreamFragmentStartTag(XmlPullParser xmlpullparser)
		throws ParserException
	{
		int i = startTimes.size();
	//    0    0:aload_0         
	//    1    1:getfield        #166 <Field ArrayList startTimes>
	//    2    4:invokevirtual   #172 <Method int ArrayList.size()>
	//    3    7:istore_2        
		long l1 = parseLong(xmlpullparser, "t", 0x1L);
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:ldc1            #23  <String "t">
	//    7   12:ldc2w           #173 <Long 0x1L>
	//    8   15:invokevirtual   #178 <Method long parseLong(XmlPullParser, String, long)>
	//    9   18:lstore          6
		boolean flag = true;
	//   10   20:iconst_1        
	//   11   21:istore_3        
		long l = l1;
	//   12   22:lload           6
	//   13   24:lstore          4
		if(l1 == 0x1L)
	//*  14   26:lload           6
	//*  15   28:ldc2w           #173 <Long 0x1L>
	//*  16   31:lcmp            
	//*  17   32:ifne            92
			if(i == 0)
	//*  18   35:iload_2         
	//*  19   36:ifne            45
				l = 0L;
	//   20   39:lconst_0        
	//   21   40:lstore          4
			else
	//*  22   42:goto            92
			if(lastChunkDuration != -1L)
	//*  23   45:aload_0         
	//*  24   46:getfield        #180 <Field long lastChunkDuration>
	//*  25   49:ldc2w           #150 <Long -1L>
	//*  26   52:lcmp            
	//*  27   53:ifeq            82
				l = ((Long)startTimes.get(i - 1)).longValue() + lastChunkDuration;
	//   28   56:aload_0         
	//   29   57:getfield        #166 <Field ArrayList startTimes>
	//   30   60:iload_2         
	//   31   61:iconst_1        
	//   32   62:isub            
	//   33   63:invokevirtual   #184 <Method Object ArrayList.get(int)>
	//   34   66:checkcast       #157 <Class Long>
	//   35   69:invokevirtual   #161 <Method long Long.longValue()>
	//   36   72:aload_0         
	//   37   73:getfield        #180 <Field long lastChunkDuration>
	//   38   76:ladd            
	//   39   77:lstore          4
			else
	//*  40   79:goto            92
				throw new ParserException("Unable to infer start time");
	//   41   82:new             #101 <Class ParserException>
	//   42   85:dup             
	//   43   86:ldc1            #186 <String "Unable to infer start time">
	//   44   88:invokespecial   #189 <Method void ParserException(String)>
	//   45   91:athrow          
		startTimes.add(((Object) (Long.valueOf(l))));
	//   46   92:aload_0         
	//   47   93:getfield        #166 <Field ArrayList startTimes>
	//   48   96:lload           4
	//   49   98:invokestatic    #192 <Method Long Long.valueOf(long)>
	//   50  101:invokevirtual   #196 <Method boolean ArrayList.add(Object)>
	//   51  104:pop             
		lastChunkDuration = parseLong(xmlpullparser, "d", 0x1L);
	//   52  105:aload_0         
	//   53  106:aload_0         
	//   54  107:aload_1         
	//   55  108:ldc1            #17  <String "d">
	//   56  110:ldc2w           #173 <Long 0x1L>
	//   57  113:invokevirtual   #178 <Method long parseLong(XmlPullParser, String, long)>
	//   58  116:putfield        #180 <Field long lastChunkDuration>
		l1 = parseLong(xmlpullparser, "r", 1L);
	//   59  119:aload_0         
	//   60  120:aload_1         
	//   61  121:ldc1            #20  <String "r">
	//   62  123:lconst_1        
	//   63  124:invokevirtual   #178 <Method long parseLong(XmlPullParser, String, long)>
	//   64  127:lstore          6
		i = ((int) (flag));
	//   65  129:iload_3         
	//   66  130:istore_2        
		if(l1 > 1L)
	//*  67  131:lload           6
	//*  68  133:lconst_1        
	//*  69  134:lcmp            
	//*  70  135:ifle            161
		{
			i = ((int) (flag));
	//   71  138:iload_3         
	//   72  139:istore_2        
			if(lastChunkDuration == 0x1L)
	//*  73  140:aload_0         
	//*  74  141:getfield        #180 <Field long lastChunkDuration>
	//*  75  144:ldc2w           #173 <Long 0x1L>
	//*  76  147:lcmp            
	//*  77  148:ifne            161
				throw new ParserException("Repeated chunk with unspecified duration");
	//   78  151:new             #101 <Class ParserException>
	//   79  154:dup             
	//   80  155:ldc1            #198 <String "Repeated chunk with unspecified duration">
	//   81  157:invokespecial   #189 <Method void ParserException(String)>
	//   82  160:athrow          
		}
		do
		{
			long l2 = i;
	//   83  161:iload_2         
	//   84  162:i2l             
	//   85  163:lstore          8
			if(l2 < l1)
	//*  86  165:lload           8
	//*  87  167:lload           6
	//*  88  169:lcmp            
	//*  89  170:ifge            201
			{
				startTimes.add(((Object) (Long.valueOf(l + lastChunkDuration * l2))));
	//   90  173:aload_0         
	//   91  174:getfield        #166 <Field ArrayList startTimes>
	//   92  177:lload           4
	//   93  179:aload_0         
	//   94  180:getfield        #180 <Field long lastChunkDuration>
	//   95  183:lload           8
	//   96  185:lmul            
	//   97  186:ladd            
	//   98  187:invokestatic    #192 <Method Long Long.valueOf(long)>
	//   99  190:invokevirtual   #196 <Method boolean ArrayList.add(Object)>
	//  100  193:pop             
				i++;
	//  101  194:iload_2         
	//  102  195:iconst_1        
	//  103  196:iadd            
	//  104  197:istore_2        
			} else
	//* 105  198:goto            161
			{
				return;
	//  106  201:return          
			}
		} while(true);
	}

	private int parseType(XmlPullParser xmlpullparser)
		throws ParserException
	{
		xmlpullparser = ((XmlPullParser) (xmlpullparser.getAttributeValue(((String) (null)), "Type")));
	//    0    0:aload_1         
	//    1    1:aconst_null     
	//    2    2:ldc1            #44  <String "Type">
	//    3    4:invokeinterface #129 <Method String XmlPullParser.getAttributeValue(String, String)>
	//    4    9:astore_1        
		if(xmlpullparser != null)
	//*   5   10:aload_1         
	//*   6   11:ifnull          87
		{
			if("audio".equalsIgnoreCase(((String) (xmlpullparser))))
	//*   7   14:ldc1            #47  <String "audio">
	//*   8   16:aload_1         
	//*   9   17:invokevirtual   #204 <Method boolean String.equalsIgnoreCase(String)>
	//*  10   20:ifeq            25
				return 1;
	//   11   23:iconst_1        
	//   12   24:ireturn         
			if("video".equalsIgnoreCase(((String) (xmlpullparser))))
	//*  13   25:ldc1            #53  <String "video">
	//*  14   27:aload_1         
	//*  15   28:invokevirtual   #204 <Method boolean String.equalsIgnoreCase(String)>
	//*  16   31:ifeq            36
				return 2;
	//   17   34:iconst_2        
	//   18   35:ireturn         
			if("text".equalsIgnoreCase(((String) (xmlpullparser))))
	//*  19   36:ldc1            #50  <String "text">
	//*  20   38:aload_1         
	//*  21   39:invokevirtual   #204 <Method boolean String.equalsIgnoreCase(String)>
	//*  22   42:ifeq            47
			{
				return 3;
	//   23   45:iconst_3        
	//   24   46:ireturn         
			} else
			{
				StringBuilder stringbuilder = new StringBuilder();
	//   25   47:new             #206 <Class StringBuilder>
	//   26   50:dup             
	//   27   51:invokespecial   #207 <Method void StringBuilder()>
	//   28   54:astore_2        
				stringbuilder.append("Invalid key value[");
	//   29   55:aload_2         
	//   30   56:ldc1            #209 <String "Invalid key value[">
	//   31   58:invokevirtual   #213 <Method StringBuilder StringBuilder.append(String)>
	//   32   61:pop             
				stringbuilder.append(((String) (xmlpullparser)));
	//   33   62:aload_2         
	//   34   63:aload_1         
	//   35   64:invokevirtual   #213 <Method StringBuilder StringBuilder.append(String)>
	//   36   67:pop             
				stringbuilder.append("]");
	//   37   68:aload_2         
	//   38   69:ldc1            #215 <String "]">
	//   39   71:invokevirtual   #213 <Method StringBuilder StringBuilder.append(String)>
	//   40   74:pop             
				throw new ParserException(stringbuilder.toString());
	//   41   75:new             #101 <Class ParserException>
	//   42   78:dup             
	//   43   79:aload_2         
	//   44   80:invokevirtual   #219 <Method String StringBuilder.toString()>
	//   45   83:invokespecial   #189 <Method void ParserException(String)>
	//   46   86:athrow          
			}
		} else
		{
			throw new ion("Type");
	//   47   87:new             #221 <Class SsManifestParser$MissingFieldException>
	//   48   90:dup             
	//   49   91:ldc1            #44  <String "Type">
	//   50   93:invokespecial   #222 <Method void SsManifestParser$MissingFieldException(String)>
	//   51   96:athrow          
		}
	}

	public void addChild(Object obj)
	{
		if(obj instanceof Format)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #226 <Class Format>
	//*   2    4:ifeq            21
			formats.add(((Object) ((Format)obj)));
	//    3    7:aload_0         
	//    4    8:getfield        #96  <Field List formats>
	//    5   11:aload_1         
	//    6   12:checkcast       #226 <Class Format>
	//    7   15:invokeinterface #229 <Method boolean List.add(Object)>
	//    8   20:pop             
	//    9   21:return          
	}

	public Object build()
	{
		Format aformat[] = new Format[formats.size()];
	//    0    0:aload_0         
	//    1    1:getfield        #96  <Field List formats>
	//    2    4:invokeinterface #232 <Method int List.size()>
	//    3    9:anewarray       Format[]
	//    4   12:astore_1        
		formats.toArray(((Object []) (aformat)));
	//    5   13:aload_0         
	//    6   14:getfield        #96  <Field List formats>
	//    7   17:aload_1         
	//    8   18:invokeinterface #236 <Method Object[] List.toArray(Object[])>
	//    9   23:pop             
		return ((Object) (new SsManifest.StreamElement(baseUri, url, type, subType, timescale, name, maxWidth, maxHeight, displayWidth, displayHeight, language, aformat, ((List) (startTimes)), lastChunkDuration)));
	//   10   24:new             #238 <Class SsManifest$StreamElement>
	//   11   27:dup             
	//   12   28:aload_0         
	//   13   29:getfield        #89  <Field String baseUri>
	//   14   32:aload_0         
	//   15   33:getfield        #133 <Field String url>
	//   16   36:aload_0         
	//   17   37:getfield        #107 <Field int type>
	//   18   40:aload_0         
	//   19   41:getfield        #123 <Field String subType>
	//   20   44:aload_0         
	//   21   45:getfield        #149 <Field long timescale>
	//   22   48:aload_0         
	//   23   49:getfield        #131 <Field String name>
	//   24   52:aload_0         
	//   25   53:getfield        #139 <Field int maxWidth>
	//   26   56:aload_0         
	//   27   57:getfield        #141 <Field int maxHeight>
	//   28   60:aload_0         
	//   29   61:getfield        #143 <Field int displayWidth>
	//   30   64:aload_0         
	//   31   65:getfield        #145 <Field int displayHeight>
	//   32   68:aload_0         
	//   33   69:getfield        #147 <Field String language>
	//   34   72:aload_1         
	//   35   73:aload_0         
	//   36   74:getfield        #166 <Field ArrayList startTimes>
	//   37   77:aload_0         
	//   38   78:getfield        #180 <Field long lastChunkDuration>
	//   39   81:invokespecial   #241 <Method void SsManifest$StreamElement(String, String, int, String, long, String, int, int, int, int, String, Format[], List, long)>
	//   40   84:areturn         
	}

	public boolean handleChildInline(String s)
	{
		return "c".equals(((Object) (s)));
	//    0    0:ldc1            #62  <String "c">
	//    1    2:aload_1         
	//    2    3:invokevirtual   #245 <Method boolean String.equals(Object)>
	//    3    6:ireturn         
	}

	public void parseStartTag(XmlPullParser xmlpullparser)
		throws ParserException
	{
		if("c".equals(((Object) (xmlpullparser.getName()))))
	//*   0    0:ldc1            #62  <String "c">
	//*   1    2:aload_1         
	//*   2    3:invokeinterface #249 <Method String XmlPullParser.getName()>
	//*   3    8:invokevirtual   #245 <Method boolean String.equals(Object)>
	//*   4   11:ifeq            20
		{
			parseStreamFragmentStartTag(xmlpullparser);
	//    5   14:aload_0         
	//    6   15:aload_1         
	//    7   16:invokespecial   #251 <Method void parseStreamFragmentStartTag(XmlPullParser)>
			return;
	//    8   19:return          
		} else
		{
			parseStreamElementStartTag(xmlpullparser);
	//    9   20:aload_0         
	//   10   21:aload_1         
	//   11   22:invokespecial   #253 <Method void parseStreamElementStartTag(XmlPullParser)>
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
	private final List formats = new LinkedList();
	private String language;
	private long lastChunkDuration;
	private int maxHeight;
	private int maxWidth;
	private String name;
	private ArrayList startTimes;
	private String subType;
	private long timescale;
	private int type;
	private String url;

	public SsManifestParser$StreamIndexParser(SsManifestParser.ElementParser elementparser, String s)
	{
		super(elementparser, s, "StreamIndex");
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:ldc1            #59  <String "StreamIndex">
	//    4    5:invokespecial   #87  <Method void SsManifestParser$ElementParser(SsManifestParser$ElementParser, String, String)>
		baseUri = s;
	//    5    8:aload_0         
	//    6    9:aload_2         
	//    7   10:putfield        #89  <Field String baseUri>
	//    8   13:aload_0         
	//    9   14:new             #91  <Class LinkedList>
	//   10   17:dup             
	//   11   18:invokespecial   #94  <Method void LinkedList()>
	//   12   21:putfield        #96  <Field List formats>
	//   13   24:return          
	}
}

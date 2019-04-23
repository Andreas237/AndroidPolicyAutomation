// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer.text.ttml;

import android.util.Log;
import android.util.Pair;
import com.google.android.exoplayer.ParserException;
import com.google.android.exoplayer.text.Subtitle;
import com.google.android.exoplayer.text.SubtitleParser;
import com.google.android.exoplayer.util.ParserUtil;
import com.google.android.exoplayer.util.Util;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.xmlpull.v1.*;

// Referenced classes of package com.google.android.exoplayer.text.ttml:
//			TtmlStyle, TtmlNode, TtmlRegion, TtmlColorParser, 
//			TtmlSubtitle

public final class TtmlParser
	implements SubtitleParser
{
	private static final class FrameAndTickRate
	{

		final float effectiveFrameRate;
		final int subFrameRate;
		final int tickRate;

		FrameAndTickRate(float f, int i, int j)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #17  <Method void Object()>
			effectiveFrameRate = f;
		//    2    4:aload_0         
		//    3    5:fload_1         
		//    4    6:putfield        #19  <Field float effectiveFrameRate>
			subFrameRate = i;
		//    5    9:aload_0         
		//    6   10:iload_2         
		//    7   11:putfield        #21  <Field int subFrameRate>
			tickRate = j;
		//    8   14:aload_0         
		//    9   15:iload_3         
		//   10   16:putfield        #23  <Field int tickRate>
		//   11   19:return          
		}
	}


	public TtmlParser()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #79  <Method void Object()>
		try
		{
			xmlParserFactory = XmlPullParserFactory.newInstance();
	//    2    4:aload_0         
	//    3    5:invokestatic    #85  <Method XmlPullParserFactory XmlPullParserFactory.newInstance()>
	//    4    8:putfield        #87  <Field XmlPullParserFactory xmlParserFactory>
			xmlParserFactory.setNamespaceAware(true);
	//    5   11:aload_0         
	//    6   12:getfield        #87  <Field XmlPullParserFactory xmlParserFactory>
	//    7   15:iconst_1        
	//    8   16:invokevirtual   #91  <Method void XmlPullParserFactory.setNamespaceAware(boolean)>
			return;
	//    9   19:return          
		}
		catch(XmlPullParserException xmlpullparserexception)
	//*  10   20:astore_1        
		{
			throw new RuntimeException("Couldn't create XmlPullParserFactory instance", ((Throwable) (xmlpullparserexception)));
	//   11   21:new             #93  <Class RuntimeException>
	//   12   24:dup             
	//   13   25:ldc1            #95  <String "Couldn't create XmlPullParserFactory instance">
	//   14   27:aload_1         
	//   15   28:invokespecial   #98  <Method void RuntimeException(String, Throwable)>
	//   16   31:athrow          
		}
	}

	private TtmlStyle createIfNull(TtmlStyle ttmlstyle)
	{
		TtmlStyle ttmlstyle1 = ttmlstyle;
	//    0    0:aload_1         
	//    1    1:astore_2        
		if(ttmlstyle == null)
	//*   2    2:aload_1         
	//*   3    3:ifnonnull       14
			ttmlstyle1 = new TtmlStyle();
	//    4    6:new             #102 <Class TtmlStyle>
	//    5    9:dup             
	//    6   10:invokespecial   #103 <Method void TtmlStyle()>
	//    7   13:astore_2        
		return ttmlstyle1;
	//    8   14:aload_2         
	//    9   15:areturn         
	}

	private static boolean isSupportedTag(String s)
	{
		return s.equals("tt") || s.equals("head") || s.equals("body") || s.equals("div") || s.equals("p") || s.equals("span") || s.equals("br") || s.equals("style") || s.equals("styling") || s.equals("layout") || s.equals("region") || s.equals("metadata") || s.equals("smpte:image") || s.equals("smpte:data") || s.equals("smpte:information");
	//    0    0:aload_0         
	//    1    1:ldc1            #107 <String "tt">
	//    2    3:invokevirtual   #113 <Method boolean String.equals(Object)>
	//    3    6:ifne            140
	//    4    9:aload_0         
	//    5   10:ldc1            #115 <String "head">
	//    6   12:invokevirtual   #113 <Method boolean String.equals(Object)>
	//    7   15:ifne            140
	//    8   18:aload_0         
	//    9   19:ldc1            #117 <String "body">
	//   10   21:invokevirtual   #113 <Method boolean String.equals(Object)>
	//   11   24:ifne            140
	//   12   27:aload_0         
	//   13   28:ldc1            #119 <String "div">
	//   14   30:invokevirtual   #113 <Method boolean String.equals(Object)>
	//   15   33:ifne            140
	//   16   36:aload_0         
	//   17   37:ldc1            #121 <String "p">
	//   18   39:invokevirtual   #113 <Method boolean String.equals(Object)>
	//   19   42:ifne            140
	//   20   45:aload_0         
	//   21   46:ldc1            #123 <String "span">
	//   22   48:invokevirtual   #113 <Method boolean String.equals(Object)>
	//   23   51:ifne            140
	//   24   54:aload_0         
	//   25   55:ldc1            #125 <String "br">
	//   26   57:invokevirtual   #113 <Method boolean String.equals(Object)>
	//   27   60:ifne            140
	//   28   63:aload_0         
	//   29   64:ldc1            #25  <String "style">
	//   30   66:invokevirtual   #113 <Method boolean String.equals(Object)>
	//   31   69:ifne            140
	//   32   72:aload_0         
	//   33   73:ldc1            #127 <String "styling">
	//   34   75:invokevirtual   #113 <Method boolean String.equals(Object)>
	//   35   78:ifne            140
	//   36   81:aload_0         
	//   37   82:ldc1            #129 <String "layout">
	//   38   84:invokevirtual   #113 <Method boolean String.equals(Object)>
	//   39   87:ifne            140
	//   40   90:aload_0         
	//   41   91:ldc1            #22  <String "region">
	//   42   93:invokevirtual   #113 <Method boolean String.equals(Object)>
	//   43   96:ifne            140
	//   44   99:aload_0         
	//   45  100:ldc1            #131 <String "metadata">
	//   46  102:invokevirtual   #113 <Method boolean String.equals(Object)>
	//   47  105:ifne            140
	//   48  108:aload_0         
	//   49  109:ldc1            #133 <String "smpte:image">
	//   50  111:invokevirtual   #113 <Method boolean String.equals(Object)>
	//   51  114:ifne            140
	//   52  117:aload_0         
	//   53  118:ldc1            #135 <String "smpte:data">
	//   54  120:invokevirtual   #113 <Method boolean String.equals(Object)>
	//   55  123:ifne            140
	//   56  126:aload_0         
	//   57  127:ldc1            #137 <String "smpte:information">
	//   58  129:invokevirtual   #113 <Method boolean String.equals(Object)>
	//   59  132:ifeq            138
	//   60  135:goto            140
	//   61  138:iconst_0        
	//   62  139:ireturn         
	//   63  140:iconst_1        
	//   64  141:ireturn         
	}

	private static void parseFontSize(String s, TtmlStyle ttmlstyle)
		throws ParserException
	{
		Object obj;
label0:
		{
			obj = ((Object) (s.split("\\s+")));
	//    0    0:aload_0         
	//    1    1:ldc1            #143 <String "\\s+">
	//    2    3:invokevirtual   #147 <Method String[] String.split(String)>
	//    3    6:astore          4
			if(obj.length == 1)
	//*   4    8:aload           4
	//*   5   10:arraylength     
	//*   6   11:iconst_1        
	//*   7   12:icmpne          27
			{
				obj = ((Object) (FONT_SIZE.matcher(((CharSequence) (s)))));
	//    8   15:getstatic       #63  <Field Pattern FONT_SIZE>
	//    9   18:aload_0         
	//   10   19:invokevirtual   #151 <Method Matcher Pattern.matcher(CharSequence)>
	//   11   22:astore          4
			} else
	//*  12   24:goto            54
			{
				if(obj.length != 2)
					break label0;
	//   13   27:aload           4
	//   14   29:arraylength     
	//   15   30:iconst_2        
	//   16   31:icmpne          286
				obj = ((Object) (FONT_SIZE.matcher(((CharSequence) (obj[1])))));
	//   17   34:getstatic       #63  <Field Pattern FONT_SIZE>
	//   18   37:aload           4
	//   19   39:iconst_1        
	//   20   40:aaload          
	//   21   41:invokevirtual   #151 <Method Matcher Pattern.matcher(CharSequence)>
	//   22   44:astore          4
				Log.w("TtmlParser", "Multiple values in fontSize attribute. Picking the second value for vertical font size and ignoring the first.");
	//   23   46:ldc1            #38  <String "TtmlParser">
	//   24   48:ldc1            #153 <String "Multiple values in fontSize attribute. Picking the second value for vertical font size and ignoring the first.">
	//   25   50:invokestatic    #159 <Method int Log.w(String, String)>
	//   26   53:pop             
			}
			if(((Matcher) (obj)).matches())
	//*  27   54:aload           4
	//*  28   56:invokevirtual   #165 <Method boolean Matcher.matches()>
	//*  29   59:ifeq            246
			{
				s = ((Matcher) (obj)).group(3);
	//   30   62:aload           4
	//   31   64:iconst_3        
	//   32   65:invokevirtual   #169 <Method String Matcher.group(int)>
	//   33   68:astore_0        
				byte byte0 = -1;
	//   34   69:iconst_m1       
	//   35   70:istore_2        
				int i = s.hashCode();
	//   36   71:aload_0         
	//   37   72:invokevirtual   #173 <Method int String.hashCode()>
	//   38   75:istore_3        
				if(i != 37)
	//*  39   76:iload_3         
	//*  40   77:bipush          37
	//*  41   79:icmpeq          127
				{
					if(i != 3240)
	//*  42   82:iload_3         
	//*  43   83:sipush          3240
	//*  44   86:icmpeq          113
					{
						if(i == 3592 && s.equals("px"))
	//*  45   89:iload_3         
	//*  46   90:sipush          3592
	//*  47   93:icmpeq          99
	//*  48   96:goto            138
	//*  49   99:aload_0         
	//*  50  100:ldc1            #175 <String "px">
	//*  51  102:invokevirtual   #113 <Method boolean String.equals(Object)>
	//*  52  105:ifeq            138
							byte0 = 0;
	//   53  108:iconst_0        
	//   54  109:istore_2        
					} else
	//*  55  110:goto            138
					if(s.equals("em"))
	//*  56  113:aload_0         
	//*  57  114:ldc1            #177 <String "em">
	//*  58  116:invokevirtual   #113 <Method boolean String.equals(Object)>
	//*  59  119:ifeq            138
						byte0 = 1;
	//   60  122:iconst_1        
	//   61  123:istore_2        
				} else
	//*  62  124:goto            138
				if(s.equals("%"))
	//*  63  127:aload_0         
	//*  64  128:ldc1            #179 <String "%">
	//*  65  130:invokevirtual   #113 <Method boolean String.equals(Object)>
	//*  66  133:ifeq            138
					byte0 = 2;
	//   67  136:iconst_2        
	//   68  137:istore_2        
				switch(byte0)
	//*  69  138:iload_2         
				{
	//*  70  139:tableswitch     0 2: default 164
	//	               0 222
	//	               1 213
	//	               2 204
				default:
					ttmlstyle = ((TtmlStyle) (new StringBuilder()));
	//   71  164:new             #181 <Class StringBuilder>
	//   72  167:dup             
	//   73  168:invokespecial   #182 <Method void StringBuilder()>
	//   74  171:astore_1        
					((StringBuilder) (ttmlstyle)).append("Invalid unit for fontSize: '");
	//   75  172:aload_1         
	//   76  173:ldc1            #184 <String "Invalid unit for fontSize: '">
	//   77  175:invokevirtual   #188 <Method StringBuilder StringBuilder.append(String)>
	//   78  178:pop             
					((StringBuilder) (ttmlstyle)).append(s);
	//   79  179:aload_1         
	//   80  180:aload_0         
	//   81  181:invokevirtual   #188 <Method StringBuilder StringBuilder.append(String)>
	//   82  184:pop             
					((StringBuilder) (ttmlstyle)).append("'.");
	//   83  185:aload_1         
	//   84  186:ldc1            #190 <String "'.">
	//   85  188:invokevirtual   #188 <Method StringBuilder StringBuilder.append(String)>
	//   86  191:pop             
					throw new ParserException(((StringBuilder) (ttmlstyle)).toString());
	//   87  192:new             #141 <Class ParserException>
	//   88  195:dup             
	//   89  196:aload_1         
	//   90  197:invokevirtual   #194 <Method String StringBuilder.toString()>
	//   91  200:invokespecial   #197 <Method void ParserException(String)>
	//   92  203:athrow          

				case 2: // '\002'
					ttmlstyle.setFontSizeUnit(3);
	//   93  204:aload_1         
	//   94  205:iconst_3        
	//   95  206:invokevirtual   #201 <Method TtmlStyle TtmlStyle.setFontSizeUnit(int)>
	//   96  209:pop             
					break;

	//*  97  210:goto            228
				case 1: // '\001'
					ttmlstyle.setFontSizeUnit(2);
	//   98  213:aload_1         
	//   99  214:iconst_2        
	//  100  215:invokevirtual   #201 <Method TtmlStyle TtmlStyle.setFontSizeUnit(int)>
	//  101  218:pop             
					break;

	//* 102  219:goto            228
				case 0: // '\0'
					ttmlstyle.setFontSizeUnit(1);
	//  103  222:aload_1         
	//  104  223:iconst_1        
	//  105  224:invokevirtual   #201 <Method TtmlStyle TtmlStyle.setFontSizeUnit(int)>
	//  106  227:pop             
					break;
				}
				ttmlstyle.setFontSize(Float.valueOf(((Matcher) (obj)).group(1)).floatValue());
	//  107  228:aload_1         
	//  108  229:aload           4
	//  109  231:iconst_1        
	//  110  232:invokevirtual   #169 <Method String Matcher.group(int)>
	//  111  235:invokestatic    #207 <Method Float Float.valueOf(String)>
	//  112  238:invokevirtual   #211 <Method float Float.floatValue()>
	//  113  241:invokevirtual   #215 <Method TtmlStyle TtmlStyle.setFontSize(float)>
	//  114  244:pop             
				return;
	//  115  245:return          
			} else
			{
				ttmlstyle = ((TtmlStyle) (new StringBuilder()));
	//  116  246:new             #181 <Class StringBuilder>
	//  117  249:dup             
	//  118  250:invokespecial   #182 <Method void StringBuilder()>
	//  119  253:astore_1        
				((StringBuilder) (ttmlstyle)).append("Invalid expression for fontSize: '");
	//  120  254:aload_1         
	//  121  255:ldc1            #217 <String "Invalid expression for fontSize: '">
	//  122  257:invokevirtual   #188 <Method StringBuilder StringBuilder.append(String)>
	//  123  260:pop             
				((StringBuilder) (ttmlstyle)).append(s);
	//  124  261:aload_1         
	//  125  262:aload_0         
	//  126  263:invokevirtual   #188 <Method StringBuilder StringBuilder.append(String)>
	//  127  266:pop             
				((StringBuilder) (ttmlstyle)).append("'.");
	//  128  267:aload_1         
	//  129  268:ldc1            #190 <String "'.">
	//  130  270:invokevirtual   #188 <Method StringBuilder StringBuilder.append(String)>
	//  131  273:pop             
				throw new ParserException(((StringBuilder) (ttmlstyle)).toString());
	//  132  274:new             #141 <Class ParserException>
	//  133  277:dup             
	//  134  278:aload_1         
	//  135  279:invokevirtual   #194 <Method String StringBuilder.toString()>
	//  136  282:invokespecial   #197 <Method void ParserException(String)>
	//  137  285:athrow          
			}
		}
		s = ((String) (new StringBuilder()));
	//  138  286:new             #181 <Class StringBuilder>
	//  139  289:dup             
	//  140  290:invokespecial   #182 <Method void StringBuilder()>
	//  141  293:astore_0        
		((StringBuilder) (s)).append("Invalid number of entries for fontSize: ");
	//  142  294:aload_0         
	//  143  295:ldc1            #219 <String "Invalid number of entries for fontSize: ">
	//  144  297:invokevirtual   #188 <Method StringBuilder StringBuilder.append(String)>
	//  145  300:pop             
		((StringBuilder) (s)).append(obj.length);
	//  146  301:aload_0         
	//  147  302:aload           4
	//  148  304:arraylength     
	//  149  305:invokevirtual   #222 <Method StringBuilder StringBuilder.append(int)>
	//  150  308:pop             
		((StringBuilder) (s)).append(".");
	//  151  309:aload_0         
	//  152  310:ldc1            #224 <String ".">
	//  153  312:invokevirtual   #188 <Method StringBuilder StringBuilder.append(String)>
	//  154  315:pop             
		throw new ParserException(((StringBuilder) (s)).toString());
	//  155  316:new             #141 <Class ParserException>
	//  156  319:dup             
	//  157  320:aload_0         
	//  158  321:invokevirtual   #194 <Method String StringBuilder.toString()>
	//  159  324:invokespecial   #197 <Method void ParserException(String)>
	//  160  327:athrow          
	}

	private FrameAndTickRate parseFrameAndTickRates(XmlPullParser xmlpullparser)
		throws ParserException
	{
		String s = xmlpullparser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRate");
	//    0    0:aload_1         
	//    1    1:ldc1            #41  <String "http://www.w3.org/ns/ttml#parameter">
	//    2    3:ldc1            #229 <String "frameRate">
	//    3    5:invokeinterface #235 <Method String XmlPullParser.getAttributeValue(String, String)>
	//    4   10:astore          6
		int i;
		if(s != null)
	//*   5   12:aload           6
	//*   6   14:ifnull          26
			i = Integer.parseInt(s);
	//    7   17:aload           6
	//    8   19:invokestatic    #241 <Method int Integer.parseInt(String)>
	//    9   22:istore_3        
		else
	//*  10   23:goto            29
			i = 30;
	//   11   26:bipush          30
	//   12   28:istore_3        
		float f = 1.0F;
	//   13   29:fconst_1        
	//   14   30:fstore_2        
		s = xmlpullparser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRateMultiplier");
	//   15   31:aload_1         
	//   16   32:ldc1            #41  <String "http://www.w3.org/ns/ttml#parameter">
	//   17   34:ldc1            #243 <String "frameRateMultiplier">
	//   18   36:invokeinterface #235 <Method String XmlPullParser.getAttributeValue(String, String)>
	//   19   41:astore          6
		if(s != null)
	//*  20   43:aload           6
	//*  21   45:ifnull          95
		{
			String as[] = s.split(" ");
	//   22   48:aload           6
	//   23   50:ldc1            #245 <String " ">
	//   24   52:invokevirtual   #147 <Method String[] String.split(String)>
	//   25   55:astore          6
			if(as.length == 2)
	//*  26   57:aload           6
	//*  27   59:arraylength     
	//*  28   60:iconst_2        
	//*  29   61:icmpne          85
				f = (float)Integer.parseInt(as[0]) / (float)Integer.parseInt(as[1]);
	//   30   64:aload           6
	//   31   66:iconst_0        
	//   32   67:aaload          
	//   33   68:invokestatic    #241 <Method int Integer.parseInt(String)>
	//   34   71:i2f             
	//   35   72:aload           6
	//   36   74:iconst_1        
	//   37   75:aaload          
	//   38   76:invokestatic    #241 <Method int Integer.parseInt(String)>
	//   39   79:i2f             
	//   40   80:fdiv            
	//   41   81:fstore_2        
			else
	//*  42   82:goto            95
				throw new ParserException("frameRateMultiplier doesn't have 2 parts");
	//   43   85:new             #141 <Class ParserException>
	//   44   88:dup             
	//   45   89:ldc1            #247 <String "frameRateMultiplier doesn't have 2 parts">
	//   46   91:invokespecial   #197 <Method void ParserException(String)>
	//   47   94:athrow          
		}
		int j = DEFAULT_FRAME_AND_TICK_RATE.subFrameRate;
	//   48   95:getstatic       #74  <Field TtmlParser$FrameAndTickRate DEFAULT_FRAME_AND_TICK_RATE>
	//   49   98:getfield        #250 <Field int TtmlParser$FrameAndTickRate.subFrameRate>
	//   50  101:istore          4
		as = ((String []) (xmlpullparser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "subFrameRate")));
	//   51  103:aload_1         
	//   52  104:ldc1            #41  <String "http://www.w3.org/ns/ttml#parameter">
	//   53  106:ldc1            #251 <String "subFrameRate">
	//   54  108:invokeinterface #235 <Method String XmlPullParser.getAttributeValue(String, String)>
	//   55  113:astore          6
		if(as != null)
	//*  56  115:aload           6
	//*  57  117:ifnull          127
			j = Integer.parseInt(((String) (as)));
	//   58  120:aload           6
	//   59  122:invokestatic    #241 <Method int Integer.parseInt(String)>
	//   60  125:istore          4
		int k = DEFAULT_FRAME_AND_TICK_RATE.tickRate;
	//   61  127:getstatic       #74  <Field TtmlParser$FrameAndTickRate DEFAULT_FRAME_AND_TICK_RATE>
	//   62  130:getfield        #254 <Field int TtmlParser$FrameAndTickRate.tickRate>
	//   63  133:istore          5
		xmlpullparser = ((XmlPullParser) (xmlpullparser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "tickRate")));
	//   64  135:aload_1         
	//   65  136:ldc1            #41  <String "http://www.w3.org/ns/ttml#parameter">
	//   66  138:ldc1            #255 <String "tickRate">
	//   67  140:invokeinterface #235 <Method String XmlPullParser.getAttributeValue(String, String)>
	//   68  145:astore_1        
		if(xmlpullparser != null)
	//*  69  146:aload_1         
	//*  70  147:ifnull          156
			k = Integer.parseInt(((String) (xmlpullparser)));
	//   71  150:aload_1         
	//   72  151:invokestatic    #241 <Method int Integer.parseInt(String)>
	//   73  154:istore          5
		return new FrameAndTickRate((float)i * f, j, k);
	//   74  156:new             #8   <Class TtmlParser$FrameAndTickRate>
	//   75  159:dup             
	//   76  160:iload_3         
	//   77  161:i2f             
	//   78  162:fload_2         
	//   79  163:fmul            
	//   80  164:iload           4
	//   81  166:iload           5
	//   82  168:invokespecial   #72  <Method void TtmlParser$FrameAndTickRate(float, int, int)>
	//   83  171:areturn         
	}

	private Map parseHeader(XmlPullParser xmlpullparser, Map map, Map map1)
		throws IOException, XmlPullParserException
	{
		do
		{
			xmlpullparser.next();
	//    0    0:aload_1         
	//    1    1:invokeinterface #262 <Method int XmlPullParser.next()>
	//    2    6:pop             
			if(ParserUtil.isStartTag(xmlpullparser, "style"))
	//*   3    7:aload_1         
	//*   4    8:ldc1            #25  <String "style">
	//*   5   10:invokestatic    #268 <Method boolean ParserUtil.isStartTag(XmlPullParser, String)>
	//*   6   13:ifeq            116
			{
				String s = ParserUtil.getAttributeValue(xmlpullparser, "style");
	//    7   16:aload_1         
	//    8   17:ldc1            #25  <String "style">
	//    9   19:invokestatic    #271 <Method String ParserUtil.getAttributeValue(XmlPullParser, String)>
	//   10   22:astore          6
				TtmlStyle ttmlstyle = parseStyleAttributes(xmlpullparser, new TtmlStyle());
	//   11   24:aload_0         
	//   12   25:aload_1         
	//   13   26:new             #102 <Class TtmlStyle>
	//   14   29:dup             
	//   15   30:invokespecial   #103 <Method void TtmlStyle()>
	//   16   33:invokespecial   #275 <Method TtmlStyle parseStyleAttributes(XmlPullParser, TtmlStyle)>
	//   17   36:astore          5
				if(s != null)
	//*  18   38:aload           6
	//*  19   40:ifnull          91
				{
					String as[] = parseStyleIds(s);
	//   20   43:aload_0         
	//   21   44:aload           6
	//   22   46:invokespecial   #278 <Method String[] parseStyleIds(String)>
	//   23   49:astore          6
					for(int i = 0; i < as.length; i++)
	//*  24   51:iconst_0        
	//*  25   52:istore          4
	//*  26   54:iload           4
	//*  27   56:aload           6
	//*  28   58:arraylength     
	//*  29   59:icmpge          91
						ttmlstyle.chain((TtmlStyle)map.get(((Object) (as[i]))));
	//   30   62:aload           5
	//   31   64:aload_2         
	//   32   65:aload           6
	//   33   67:iload           4
	//   34   69:aaload          
	//   35   70:invokeinterface #284 <Method Object Map.get(Object)>
	//   36   75:checkcast       #102 <Class TtmlStyle>
	//   37   78:invokevirtual   #287 <Method TtmlStyle TtmlStyle.chain(TtmlStyle)>
	//   38   81:pop             

	//   39   82:iload           4
	//   40   84:iconst_1        
	//   41   85:iadd            
	//   42   86:istore          4
				}
	//*  43   88:goto            54
				if(ttmlstyle.getId() != null)
	//*  44   91:aload           5
	//*  45   93:invokevirtual   #290 <Method String TtmlStyle.getId()>
	//*  46   96:ifnull          154
					map.put(((Object) (ttmlstyle.getId())), ((Object) (ttmlstyle)));
	//   47   99:aload_2         
	//   48  100:aload           5
	//   49  102:invokevirtual   #290 <Method String TtmlStyle.getId()>
	//   50  105:aload           5
	//   51  107:invokeinterface #294 <Method Object Map.put(Object, Object)>
	//   52  112:pop             
			} else
	//*  53  113:goto            154
			if(ParserUtil.isStartTag(xmlpullparser, "region"))
	//*  54  116:aload_1         
	//*  55  117:ldc1            #22  <String "region">
	//*  56  119:invokestatic    #268 <Method boolean ParserUtil.isStartTag(XmlPullParser, String)>
	//*  57  122:ifeq            154
			{
				Pair pair = parseRegionAttributes(xmlpullparser);
	//   58  125:aload_0         
	//   59  126:aload_1         
	//   60  127:invokespecial   #298 <Method Pair parseRegionAttributes(XmlPullParser)>
	//   61  130:astore          5
				if(pair != null)
	//*  62  132:aload           5
	//*  63  134:ifnull          154
					map1.put(pair.first, pair.second);
	//   64  137:aload_3         
	//   65  138:aload           5
	//   66  140:getfield        #304 <Field Object Pair.first>
	//   67  143:aload           5
	//   68  145:getfield        #307 <Field Object Pair.second>
	//   69  148:invokeinterface #294 <Method Object Map.put(Object, Object)>
	//   70  153:pop             
			}
		} while(!ParserUtil.isEndTag(xmlpullparser, "head"));
	//   71  154:aload_1         
	//   72  155:ldc1            #115 <String "head">
	//   73  157:invokestatic    #310 <Method boolean ParserUtil.isEndTag(XmlPullParser, String)>
	//   74  160:ifeq            0
		return map;
	//   75  163:aload_2         
	//   76  164:areturn         
	}

	private TtmlNode parseNode(XmlPullParser xmlpullparser, TtmlNode ttmlnode, Map map, FrameAndTickRate frameandtickrate)
		throws ParserException
	{
		int i;
		int j;
		long l;
		long l1;
		long l6;
		String as[];
		Object obj1;
		TtmlStyle ttmlstyle;
		obj1 = "";
	//    0    0:ldc2            #316 <String "">
	//    1    3:astore          21
		j = xmlpullparser.getAttributeCount();
	//    2    5:aload_1         
	//    3    6:invokeinterface #319 <Method int XmlPullParser.getAttributeCount()>
	//    4   11:istore          6
		as = null;
	//    5   13:aconst_null     
	//    6   14:astore          19
		ttmlstyle = parseStyleAttributes(xmlpullparser, ((TtmlStyle) (null)));
	//    7   16:aload_0         
	//    8   17:aload_1         
	//    9   18:aconst_null     
	//   10   19:invokespecial   #275 <Method TtmlStyle parseStyleAttributes(XmlPullParser, TtmlStyle)>
	//   11   22:astore          23
		i = 0;
	//   12   24:iconst_0        
	//   13   25:istore          5
		l = -1L;
	//   14   27:ldc2w           #320 <Long -1L>
	//   15   30:lstore          7
		l1 = -1L;
	//   16   32:ldc2w           #320 <Long -1L>
	//   17   35:lstore          9
		l6 = 0L;
	//   18   37:lconst_0        
	//   19   38:lstore          15
_L7:
		if(i >= j) goto _L2; else goto _L1
	//   20   40:iload           5
	//   21   42:iload           6
	//   22   44:icmpge          302
_L1:
		long l2;
		long l4;
		long l7;
		Object obj;
		Object obj2;
		String s;
		s = xmlpullparser.getAttributeName(i);
	//   23   47:aload_1         
	//   24   48:iload           5
	//   25   50:invokeinterface #324 <Method String XmlPullParser.getAttributeName(int)>
	//   26   55:astore          24
		obj2 = ((Object) (xmlpullparser.getAttributeValue(i)));
	//   27   57:aload_1         
	//   28   58:iload           5
	//   29   60:invokeinterface #326 <Method String XmlPullParser.getAttributeValue(int)>
	//   30   65:astore          22
		if("begin".equals(((Object) (s))))
	//*  31   67:ldc1            #13  <String "begin">
	//*  32   69:aload           24
	//*  33   71:invokevirtual   #113 <Method boolean String.equals(Object)>
	//*  34   74:ifeq            101
		{
			l2 = parseTimeExpression(((String) (obj2)), frameandtickrate);
	//   35   77:aload           22
	//   36   79:aload           4
	//   37   81:invokestatic    #330 <Method long parseTimeExpression(String, TtmlParser$FrameAndTickRate)>
	//   38   84:lstore          11
			obj = ((Object) (as));
	//   39   86:aload           19
	//   40   88:astore          20
			l4 = l1;
	//   41   90:lload           9
	//   42   92:lstore          13
			l7 = l6;
	//   43   94:lload           15
	//   44   96:lstore          17
			break MISSING_BLOCK_LABEL_277;
	//   45   98:goto            277
		}
		if("end".equals(((Object) (s))))
	//*  46  101:ldc1            #19  <String "end">
	//*  47  103:aload           24
	//*  48  105:invokevirtual   #113 <Method boolean String.equals(Object)>
	//*  49  108:ifeq            135
		{
			l4 = parseTimeExpression(((String) (obj2)), frameandtickrate);
	//   50  111:aload           22
	//   51  113:aload           4
	//   52  115:invokestatic    #330 <Method long parseTimeExpression(String, TtmlParser$FrameAndTickRate)>
	//   53  118:lstore          13
			obj = ((Object) (as));
	//   54  120:aload           19
	//   55  122:astore          20
			l2 = l;
	//   56  124:lload           7
	//   57  126:lstore          11
			l7 = l6;
	//   58  128:lload           15
	//   59  130:lstore          17
			break MISSING_BLOCK_LABEL_277;
	//   60  132:goto            277
		}
		if("dur".equals(((Object) (s))))
	//*  61  135:ldc1            #16  <String "dur">
	//*  62  137:aload           24
	//*  63  139:invokevirtual   #113 <Method boolean String.equals(Object)>
	//*  64  142:ifeq            169
		{
			l7 = parseTimeExpression(((String) (obj2)), frameandtickrate);
	//   65  145:aload           22
	//   66  147:aload           4
	//   67  149:invokestatic    #330 <Method long parseTimeExpression(String, TtmlParser$FrameAndTickRate)>
	//   68  152:lstore          17
			obj = ((Object) (as));
	//   69  154:aload           19
	//   70  156:astore          20
			l2 = l;
	//   71  158:lload           7
	//   72  160:lstore          11
			l4 = l1;
	//   73  162:lload           9
	//   74  164:lstore          13
			break MISSING_BLOCK_LABEL_277;
	//   75  166:goto            277
		}
		if(!"style".equals(((Object) (s)))) goto _L4; else goto _L3
	//   76  169:ldc1            #25  <String "style">
	//   77  171:aload           24
	//   78  173:invokevirtual   #113 <Method boolean String.equals(Object)>
	//   79  176:ifeq            216
_L3:
		obj2 = ((Object) (parseStyleIds(((String) (obj2)))));
	//   80  179:aload_0         
	//   81  180:aload           22
	//   82  182:invokespecial   #278 <Method String[] parseStyleIds(String)>
	//   83  185:astore          22
		obj = ((Object) (as));
	//   84  187:aload           19
	//   85  189:astore          20
		if(obj2.length > 0)
	//*  86  191:aload           22
	//*  87  193:arraylength     
	//*  88  194:ifle            201
			obj = obj2;
	//   89  197:aload           22
	//   90  199:astore          20
_L6:
		l2 = l;
	//   91  201:lload           7
	//   92  203:lstore          11
		l4 = l1;
	//   93  205:lload           9
	//   94  207:lstore          13
		l7 = l6;
	//   95  209:lload           15
	//   96  211:lstore          17
		break MISSING_BLOCK_LABEL_277;
	//   97  213:goto            277
_L4:
		obj = ((Object) (as));
	//   98  216:aload           19
	//   99  218:astore          20
		if(!"region".equals(((Object) (s)))) goto _L6; else goto _L5
	//  100  220:ldc1            #22  <String "region">
	//  101  222:aload           24
	//  102  224:invokevirtual   #113 <Method boolean String.equals(Object)>
	//  103  227:ifeq            201
_L5:
		obj = ((Object) (as));
	//  104  230:aload           19
	//  105  232:astore          20
		l2 = l;
	//  106  234:lload           7
	//  107  236:lstore          11
		l4 = l1;
	//  108  238:lload           9
	//  109  240:lstore          13
		l7 = l6;
	//  110  242:lload           15
	//  111  244:lstore          17
		if(map.containsKey(obj2))
	//* 112  246:aload_3         
	//* 113  247:aload           22
	//* 114  249:invokeinterface #333 <Method boolean Map.containsKey(Object)>
	//* 115  254:ifeq            277
		{
			obj1 = obj2;
	//  116  257:aload           22
	//  117  259:astore          21
			l7 = l6;
	//  118  261:lload           15
	//  119  263:lstore          17
			l4 = l1;
	//  120  265:lload           9
	//  121  267:lstore          13
			l2 = l;
	//  122  269:lload           7
	//  123  271:lstore          11
			obj = ((Object) (as));
	//  124  273:aload           19
	//  125  275:astore          20
		}
		i++;
	//  126  277:iload           5
	//  127  279:iconst_1        
	//  128  280:iadd            
	//  129  281:istore          5
		as = ((String []) (obj));
	//  130  283:aload           20
	//  131  285:astore          19
		l = l2;
	//  132  287:lload           11
	//  133  289:lstore          7
		l1 = l4;
	//  134  291:lload           13
	//  135  293:lstore          9
		l6 = l7;
	//  136  295:lload           17
	//  137  297:lstore          15
		  goto _L7
	//* 138  299:goto            40
_L2:
		long l8;
label0:
		{
			long l5;
			if(ttmlnode != null)
	//* 139  302:aload_2         
	//* 140  303:ifnull          380
			{
				l8 = l;
	//  141  306:lload           7
	//  142  308:lstore          17
				l5 = l1;
	//  143  310:lload           9
	//  144  312:lstore          13
				if(ttmlnode.startTimeUs != -1L)
	//* 145  314:aload_2         
	//* 146  315:getfield        #339 <Field long TtmlNode.startTimeUs>
	//* 147  318:ldc2w           #320 <Long -1L>
	//* 148  321:lcmp            
	//* 149  322:ifeq            388
				{
					long l3 = l;
	//  150  325:lload           7
	//  151  327:lstore          11
					if(l != -1L)
	//* 152  329:lload           7
	//* 153  331:ldc2w           #320 <Long -1L>
	//* 154  334:lcmp            
	//* 155  335:ifeq            347
						l3 = l + ttmlnode.startTimeUs;
	//  156  338:lload           7
	//  157  340:aload_2         
	//  158  341:getfield        #339 <Field long TtmlNode.startTimeUs>
	//  159  344:ladd            
	//  160  345:lstore          11
					l8 = l3;
	//  161  347:lload           11
	//  162  349:lstore          17
					l5 = l1;
	//  163  351:lload           9
	//  164  353:lstore          13
					if(l1 != -1L)
	//* 165  355:lload           9
	//* 166  357:ldc2w           #320 <Long -1L>
	//* 167  360:lcmp            
	//* 168  361:ifeq            388
					{
						l5 = l1 + ttmlnode.startTimeUs;
	//  169  364:lload           9
	//  170  366:aload_2         
	//  171  367:getfield        #339 <Field long TtmlNode.startTimeUs>
	//  172  370:ladd            
	//  173  371:lstore          13
						l8 = l3;
	//  174  373:lload           11
	//  175  375:lstore          17
					}
				}
			} else
	//* 176  377:goto            388
			{
				l5 = l1;
	//  177  380:lload           9
	//  178  382:lstore          13
				l8 = l;
	//  179  384:lload           7
	//  180  386:lstore          17
			}
			if(l5 == -1L)
	//* 181  388:lload           13
	//* 182  390:ldc2w           #320 <Long -1L>
	//* 183  393:lcmp            
	//* 184  394:ifne            438
			{
				if(l6 > 0L)
	//* 185  397:lload           15
	//* 186  399:lconst_0        
	//* 187  400:lcmp            
	//* 188  401:ifle            414
				{
					l = l8 + l6;
	//  189  404:lload           17
	//  190  406:lload           15
	//  191  408:ladd            
	//  192  409:lstore          7
					break label0;
	//  193  411:goto            442
				}
				if(ttmlnode != null && ttmlnode.endTimeUs != -1L)
	//* 194  414:aload_2         
	//* 195  415:ifnull          438
	//* 196  418:aload_2         
	//* 197  419:getfield        #342 <Field long TtmlNode.endTimeUs>
	//* 198  422:ldc2w           #320 <Long -1L>
	//* 199  425:lcmp            
	//* 200  426:ifeq            438
				{
					l = ttmlnode.endTimeUs;
	//  201  429:aload_2         
	//  202  430:getfield        #342 <Field long TtmlNode.endTimeUs>
	//  203  433:lstore          7
					break label0;
	//  204  435:goto            442
				}
			}
			l = l5;
	//  205  438:lload           13
	//  206  440:lstore          7
		}
		return TtmlNode.buildNode(xmlpullparser.getName(), l8, l, ttmlstyle, as, ((String) (obj1)));
	//  207  442:aload_1         
	//  208  443:invokeinterface #345 <Method String XmlPullParser.getName()>
	//  209  448:lload           17
	//  210  450:lload           7
	//  211  452:aload           23
	//  212  454:aload           19
	//  213  456:aload           21
	//  214  458:invokestatic    #349 <Method TtmlNode TtmlNode.buildNode(String, long, long, TtmlStyle, String[], String)>
	//  215  461:areturn         
	}

	private Pair parseRegionAttributes(XmlPullParser xmlpullparser)
	{
		float f;
		float f1;
		String s;
		String s1;
		Matcher matcher;
label0:
		{
			s = ParserUtil.getAttributeValue(xmlpullparser, "id");
	//    0    0:aload_1         
	//    1    1:ldc2            #354 <String "id">
	//    2    4:invokestatic    #271 <Method String ParserUtil.getAttributeValue(XmlPullParser, String)>
	//    3    7:astore          5
			String s2 = ParserUtil.getAttributeValue(xmlpullparser, "origin");
	//    4    9:aload_1         
	//    5   10:ldc2            #356 <String "origin">
	//    6   13:invokestatic    #271 <Method String ParserUtil.getAttributeValue(XmlPullParser, String)>
	//    7   16:astore          7
			s1 = ParserUtil.getAttributeValue(xmlpullparser, "extent");
	//    8   18:aload_1         
	//    9   19:ldc2            #358 <String "extent">
	//   10   22:invokestatic    #271 <Method String ParserUtil.getAttributeValue(XmlPullParser, String)>
	//   11   25:astore          6
			xmlpullparser = null;
	//   12   27:aconst_null     
	//   13   28:astore_1        
			if(s2 == null)
				break MISSING_BLOCK_LABEL_289;
	//   14   29:aload           7
	//   15   31:ifnull          289
			if(s == null)
	//*  16   34:aload           5
	//*  17   36:ifnonnull       41
				return null;
	//   18   39:aconst_null     
	//   19   40:areturn         
			Matcher matcher1 = PERCENTAGE_COORDINATES.matcher(((CharSequence) (s2)));
	//   20   41:getstatic       #67  <Field Pattern PERCENTAGE_COORDINATES>
	//   21   44:aload           7
	//   22   46:invokevirtual   #151 <Method Matcher Pattern.matcher(CharSequence)>
	//   23   49:astore          8
			if(matcher1.matches())
	//*  24   51:aload           8
	//*  25   53:invokevirtual   #165 <Method boolean Matcher.matches()>
	//*  26   56:ifeq            151
			{
				try
				{
					f1 = Float.parseFloat(matcher1.group(1)) / 100F;
	//   27   59:aload           8
	//   28   61:iconst_1        
	//   29   62:invokevirtual   #169 <Method String Matcher.group(int)>
	//   30   65:invokestatic    #362 <Method float Float.parseFloat(String)>
	//   31   68:ldc2            #363 <Float 100F>
	//   32   71:fdiv            
	//   33   72:fstore_3        
					f = Float.parseFloat(matcher1.group(2));
	//   34   73:aload           8
	//   35   75:iconst_2        
	//   36   76:invokevirtual   #169 <Method String Matcher.group(int)>
	//   37   79:invokestatic    #362 <Method float Float.parseFloat(String)>
	//   38   82:fstore_2        
				}
	//*  39   83:fload_2         
	//*  40   84:ldc2            #363 <Float 100F>
	//*  41   87:fdiv            
	//*  42   88:fstore_2        
	//*  43   89:goto            157
				catch(NumberFormatException numberformatexception1)
	//*  44   92:astore          8
				{
					StringBuilder stringbuilder1 = new StringBuilder();
	//   45   94:new             #181 <Class StringBuilder>
	//   46   97:dup             
	//   47   98:invokespecial   #182 <Method void StringBuilder()>
	//   48  101:astore          9
					stringbuilder1.append("Ignoring region with malformed origin: '");
	//   49  103:aload           9
	//   50  105:ldc2            #365 <String "Ignoring region with malformed origin: '">
	//   51  108:invokevirtual   #188 <Method StringBuilder StringBuilder.append(String)>
	//   52  111:pop             
					stringbuilder1.append(s2);
	//   53  112:aload           9
	//   54  114:aload           7
	//   55  116:invokevirtual   #188 <Method StringBuilder StringBuilder.append(String)>
	//   56  119:pop             
					stringbuilder1.append("'");
	//   57  120:aload           9
	//   58  122:ldc2            #367 <String "'">
	//   59  125:invokevirtual   #188 <Method StringBuilder StringBuilder.append(String)>
	//   60  128:pop             
					Log.w("TtmlParser", stringbuilder1.toString(), ((Throwable) (numberformatexception1)));
	//   61  129:ldc1            #38  <String "TtmlParser">
	//   62  131:aload           9
	//   63  133:invokevirtual   #194 <Method String StringBuilder.toString()>
	//   64  136:aload           8
	//   65  138:invokestatic    #370 <Method int Log.w(String, String, Throwable)>
	//   66  141:pop             
					f = 1.401298E-45F;
	//   67  142:ldc2            #371 <Float 1.401298E-45F>
	//   68  145:fstore_2        
					f1 = f;
	//   69  146:fload_2         
	//   70  147:fstore_3        
					break label0;
	//   71  148:goto            157
				}
				f /= 100F;
				break label0;
			}
			f = 1.401298E-45F;
	//   72  151:ldc2            #371 <Float 1.401298E-45F>
	//   73  154:fstore_2        
			f1 = f;
	//   74  155:fload_2         
	//   75  156:fstore_3        
		}
		if(s1 == null)
			break MISSING_BLOCK_LABEL_252;
	//   76  157:aload           6
	//   77  159:ifnull          252
		matcher = PERCENTAGE_COORDINATES.matcher(((CharSequence) (s1)));
	//   78  162:getstatic       #67  <Field Pattern PERCENTAGE_COORDINATES>
	//   79  165:aload           6
	//   80  167:invokevirtual   #151 <Method Matcher Pattern.matcher(CharSequence)>
	//   81  170:astore          7
		if(!matcher.matches())
			break MISSING_BLOCK_LABEL_252;
	//   82  172:aload           7
	//   83  174:invokevirtual   #165 <Method boolean Matcher.matches()>
	//   84  177:ifeq            252
		float f2 = Float.parseFloat(matcher.group(1));
	//   85  180:aload           7
	//   86  182:iconst_1        
	//   87  183:invokevirtual   #169 <Method String Matcher.group(int)>
	//   88  186:invokestatic    #362 <Method float Float.parseFloat(String)>
	//   89  189:fstore          4
		f2 /= 100F;
	//   90  191:fload           4
	//   91  193:ldc2            #363 <Float 100F>
	//   92  196:fdiv            
	//   93  197:fstore          4
		break MISSING_BLOCK_LABEL_257;
	//   94  199:goto            257
		NumberFormatException numberformatexception;
		numberformatexception;
	//   95  202:astore          7
		StringBuilder stringbuilder = new StringBuilder();
	//   96  204:new             #181 <Class StringBuilder>
	//   97  207:dup             
	//   98  208:invokespecial   #182 <Method void StringBuilder()>
	//   99  211:astore          8
		stringbuilder.append("Ignoring malformed region extent: '");
	//  100  213:aload           8
	//  101  215:ldc2            #373 <String "Ignoring malformed region extent: '">
	//  102  218:invokevirtual   #188 <Method StringBuilder StringBuilder.append(String)>
	//  103  221:pop             
		stringbuilder.append(s1);
	//  104  222:aload           8
	//  105  224:aload           6
	//  106  226:invokevirtual   #188 <Method StringBuilder StringBuilder.append(String)>
	//  107  229:pop             
		stringbuilder.append("'");
	//  108  230:aload           8
	//  109  232:ldc2            #367 <String "'">
	//  110  235:invokevirtual   #188 <Method StringBuilder StringBuilder.append(String)>
	//  111  238:pop             
		Log.w("TtmlParser", stringbuilder.toString(), ((Throwable) (numberformatexception)));
	//  112  239:ldc1            #38  <String "TtmlParser">
	//  113  241:aload           8
	//  114  243:invokevirtual   #194 <Method String StringBuilder.toString()>
	//  115  246:aload           7
	//  116  248:invokestatic    #370 <Method int Log.w(String, String, Throwable)>
	//  117  251:pop             
		f2 = 1.401298E-45F;
	//  118  252:ldc2            #371 <Float 1.401298E-45F>
	//  119  255:fstore          4
		if(f1 != 1.401298E-45F)
	//* 120  257:fload_3         
	//* 121  258:ldc2            #371 <Float 1.401298E-45F>
	//* 122  261:fcmpl           
	//* 123  262:ifeq            287
			xmlpullparser = ((XmlPullParser) (new Pair(((Object) (s)), ((Object) (new TtmlRegion(f1, f, 0, f2))))));
	//  124  265:new             #300 <Class Pair>
	//  125  268:dup             
	//  126  269:aload           5
	//  127  271:new             #375 <Class TtmlRegion>
	//  128  274:dup             
	//  129  275:fload_3         
	//  130  276:fload_2         
	//  131  277:iconst_0        
	//  132  278:fload           4
	//  133  280:invokespecial   #378 <Method void TtmlRegion(float, float, int, float)>
	//  134  283:invokespecial   #381 <Method void Pair(Object, Object)>
	//  135  286:astore_1        
		return ((Pair) (xmlpullparser));
	//  136  287:aload_1         
	//  137  288:areturn         
		return null;
	//  138  289:aconst_null     
	//  139  290:areturn         
	}

	private TtmlStyle parseStyleAttributes(XmlPullParser xmlpullparser, TtmlStyle ttmlstyle)
	{
		int k;
		int l;
		Object obj;
		l = xmlpullparser.getAttributeCount();
	//    0    0:aload_1         
	//    1    1:invokeinterface #319 <Method int XmlPullParser.getAttributeCount()>
	//    2    6:istore          7
		k = 0;
	//    3    8:iconst_0        
	//    4    9:istore          4
		obj = ((Object) (ttmlstyle));
	//    5   11:aload_2         
	//    6   12:astore          8
_L12:
		int i;
		byte byte1;
		byte byte2;
		String s;
label0:
		{
			if(k >= l)
				break; /* Loop/switch isn't completed */
	//    7   14:iload           4
	//    8   16:iload           7
	//    9   18:icmpge          1114
			s = xmlpullparser.getAttributeValue(k);
	//   10   21:aload_1         
	//   11   22:iload           4
	//   12   24:invokeinterface #326 <Method String XmlPullParser.getAttributeValue(int)>
	//   13   29:astore          9
			ttmlstyle = ((TtmlStyle) (xmlpullparser.getAttributeName(k)));
	//   14   31:aload_1         
	//   15   32:iload           4
	//   16   34:invokeinterface #324 <Method String XmlPullParser.getAttributeName(int)>
	//   17   39:astore_2        
			i = ((String) (ttmlstyle)).hashCode();
	//   18   40:aload_2         
	//   19   41:invokevirtual   #173 <Method int String.hashCode()>
	//   20   44:istore_3        
			byte2 = 4;
	//   21   45:iconst_4        
	//   22   46:istore          6
			byte1 = 2;
	//   23   48:iconst_2        
	//   24   49:istore          5
			switch(i)
	//*  25   51:iload_3         
			{
			default:
				break;

	//*  26   52:lookupswitch    9: default 136
	//	               -1550943582: 261
	//	               -1224696685: 246
	//	               -1065511464: 230
	//	               -879295043: 214
	//	               -734428249: 199
	//	               3355: 184
	//	               94842723: 169
	//	               365601008: 154
	//	               1287124693: 139
	//*  27  136:goto            277
			case 1287124693: 
				if(((String) (ttmlstyle)).equals("backgroundColor"))
	//*  28  139:aload_2         
	//*  29  140:ldc2            #386 <String "backgroundColor">
	//*  30  143:invokevirtual   #113 <Method boolean String.equals(Object)>
	//*  31  146:ifeq            277
				{
					i = 1;
	//   32  149:iconst_1        
	//   33  150:istore_3        
					break label0;
	//   34  151:goto            279
				}
				break;

			case 365601008: 
				if(!((String) (ttmlstyle)).equals("fontSize"))
					break;
	//   35  154:aload_2         
	//   36  155:ldc2            #388 <String "fontSize">
	//   37  158:invokevirtual   #113 <Method boolean String.equals(Object)>
	//   38  161:ifeq            277
				i = 4;
	//   39  164:iconst_4        
	//   40  165:istore_3        
				break label0;
	//   41  166:goto            279

			case 94842723: 
				if(!((String) (ttmlstyle)).equals("color"))
					break;
	//   42  169:aload_2         
	//   43  170:ldc2            #390 <String "color">
	//   44  173:invokevirtual   #113 <Method boolean String.equals(Object)>
	//   45  176:ifeq            277
				i = 2;
	//   46  179:iconst_2        
	//   47  180:istore_3        
				break label0;
	//   48  181:goto            279

			case 3355: 
				if(!((String) (ttmlstyle)).equals("id"))
					break;
	//   49  184:aload_2         
	//   50  185:ldc2            #354 <String "id">
	//   51  188:invokevirtual   #113 <Method boolean String.equals(Object)>
	//   52  191:ifeq            277
				i = 0;
	//   53  194:iconst_0        
	//   54  195:istore_3        
				break label0;
	//   55  196:goto            279

			case -734428249: 
				if(!((String) (ttmlstyle)).equals("fontWeight"))
					break;
	//   56  199:aload_2         
	//   57  200:ldc2            #392 <String "fontWeight">
	//   58  203:invokevirtual   #113 <Method boolean String.equals(Object)>
	//   59  206:ifeq            277
				i = 5;
	//   60  209:iconst_5        
	//   61  210:istore_3        
				break label0;
	//   62  211:goto            279

			case -879295043: 
				if(!((String) (ttmlstyle)).equals("textDecoration"))
					break;
	//   63  214:aload_2         
	//   64  215:ldc2            #394 <String "textDecoration">
	//   65  218:invokevirtual   #113 <Method boolean String.equals(Object)>
	//   66  221:ifeq            277
				i = 8;
	//   67  224:bipush          8
	//   68  226:istore_3        
				break label0;
	//   69  227:goto            279

			case -1065511464: 
				if(!((String) (ttmlstyle)).equals("textAlign"))
					break;
	//   70  230:aload_2         
	//   71  231:ldc2            #396 <String "textAlign">
	//   72  234:invokevirtual   #113 <Method boolean String.equals(Object)>
	//   73  237:ifeq            277
				i = 7;
	//   74  240:bipush          7
	//   75  242:istore_3        
				break label0;
	//   76  243:goto            279

			case -1224696685: 
				if(!((String) (ttmlstyle)).equals("fontFamily"))
					break;
	//   77  246:aload_2         
	//   78  247:ldc2            #398 <String "fontFamily">
	//   79  250:invokevirtual   #113 <Method boolean String.equals(Object)>
	//   80  253:ifeq            277
				i = 3;
	//   81  256:iconst_3        
	//   82  257:istore_3        
				break label0;
	//   83  258:goto            279

			case -1550943582: 
				if(!((String) (ttmlstyle)).equals("fontStyle"))
					break;
	//   84  261:aload_2         
	//   85  262:ldc2            #400 <String "fontStyle">
	//   86  265:invokevirtual   #113 <Method boolean String.equals(Object)>
	//   87  268:ifeq            277
				i = 6;
	//   88  271:bipush          6
	//   89  273:istore_3        
				break label0;
	//   90  274:goto            279
			}
			i = -1;
	//   91  277:iconst_m1       
	//   92  278:istore_3        
		}
		i;
	//   93  279:iload_3         
		JVM INSTR tableswitch 0 8: default 332
	//	               0 1073
	//	               1 1004
	//	               2 935
	//	               3 920
	//	               4 844
	//	               5 823
	//	               6 802
	//	               7 538
	//	               8 338;
	//   94  280:tableswitch     0 8: default 332
	//	               0 1073
	//	               1 1004
	//	               2 935
	//	               3 920
	//	               4 844
	//	               5 823
	//	               6 802
	//	               7 538
	//	               8 338
		   goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10
_L1:
		ttmlstyle = ((TtmlStyle) (obj));
	//   95  332:aload           8
	//   96  334:astore_2        
		break; /* Loop/switch isn't completed */
	//   97  335:goto            1102
_L10:
		int j;
label1:
		{
			ttmlstyle = ((TtmlStyle) (Util.toLowerInvariant(s)));
	//   98  338:aload           9
	//   99  340:invokestatic    #406 <Method String Util.toLowerInvariant(String)>
	//  100  343:astore_2        
			j = ((String) (ttmlstyle)).hashCode();
	//  101  344:aload_2         
	//  102  345:invokevirtual   #173 <Method int String.hashCode()>
	//  103  348:istore_3        
			if(j != 0xa8e6a22b)
	//* 104  349:iload_3         
	//* 105  350:ldc2            #407 <Int 0xa8e6a22b>
	//* 106  353:icmpeq          426
			{
				if(j != 0xc2c9c6cc)
	//* 107  356:iload_3         
	//* 108  357:ldc2            #408 <Int 0xc2c9c6cc>
	//* 109  360:icmpeq          410
				{
					if(j != 0x36723ff0)
	//* 110  363:iload_3         
	//* 111  364:ldc2            #409 <Int 0x36723ff0>
	//* 112  367:icmpeq          395
					{
						if(j == 0x641ec051 && ((String) (ttmlstyle)).equals("linethrough"))
	//* 113  370:iload_3         
	//* 114  371:ldc2            #410 <Int 0x641ec051>
	//* 115  374:icmpeq          380
	//* 116  377:goto            441
	//* 117  380:aload_2         
	//* 118  381:ldc2            #412 <String "linethrough">
	//* 119  384:invokevirtual   #113 <Method boolean String.equals(Object)>
	//* 120  387:ifeq            441
						{
							j = 0;
	//  121  390:iconst_0        
	//  122  391:istore_3        
							break label1;
	//  123  392:goto            443
						}
					} else
					if(((String) (ttmlstyle)).equals("nolinethrough"))
	//* 124  395:aload_2         
	//* 125  396:ldc2            #414 <String "nolinethrough">
	//* 126  399:invokevirtual   #113 <Method boolean String.equals(Object)>
	//* 127  402:ifeq            441
					{
						j = 1;
	//  128  405:iconst_1        
	//  129  406:istore_3        
						break label1;
	//  130  407:goto            443
					}
				} else
				if(((String) (ttmlstyle)).equals("underline"))
	//* 131  410:aload_2         
	//* 132  411:ldc2            #416 <String "underline">
	//* 133  414:invokevirtual   #113 <Method boolean String.equals(Object)>
	//* 134  417:ifeq            441
				{
					j = ((int) (byte1));
	//  135  420:iload           5
	//  136  422:istore_3        
					break label1;
	//  137  423:goto            443
				}
			} else
			if(((String) (ttmlstyle)).equals("nounderline"))
	//* 138  426:aload_2         
	//* 139  427:ldc2            #418 <String "nounderline">
	//* 140  430:invokevirtual   #113 <Method boolean String.equals(Object)>
	//* 141  433:ifeq            441
			{
				j = 3;
	//  142  436:iconst_3        
	//  143  437:istore_3        
				break label1;
	//  144  438:goto            443
			}
			j = -1;
	//  145  441:iconst_m1       
	//  146  442:istore_3        
		}
		switch(j)
	//* 147  443:iload_3         
		{
	//* 148  444:tableswitch     0 3: default 476
	//	               0 524
	//	               1 510
	//	               2 496
	//	               3 482
		default:
			ttmlstyle = ((TtmlStyle) (obj));
	//  149  476:aload           8
	//  150  478:astore_2        
			break;

	//* 151  479:goto            1102
		case 3: // '\003'
			ttmlstyle = createIfNull(((TtmlStyle) (obj))).setUnderline(false);
	//  152  482:aload_0         
	//  153  483:aload           8
	//  154  485:invokespecial   #420 <Method TtmlStyle createIfNull(TtmlStyle)>
	//  155  488:iconst_0        
	//  156  489:invokevirtual   #424 <Method TtmlStyle TtmlStyle.setUnderline(boolean)>
	//  157  492:astore_2        
			break;

	//* 158  493:goto            1102
		case 2: // '\002'
			ttmlstyle = createIfNull(((TtmlStyle) (obj))).setUnderline(true);
	//  159  496:aload_0         
	//  160  497:aload           8
	//  161  499:invokespecial   #420 <Method TtmlStyle createIfNull(TtmlStyle)>
	//  162  502:iconst_1        
	//  163  503:invokevirtual   #424 <Method TtmlStyle TtmlStyle.setUnderline(boolean)>
	//  164  506:astore_2        
			break;

	//* 165  507:goto            1102
		case 1: // '\001'
			ttmlstyle = createIfNull(((TtmlStyle) (obj))).setLinethrough(false);
	//  166  510:aload_0         
	//  167  511:aload           8
	//  168  513:invokespecial   #420 <Method TtmlStyle createIfNull(TtmlStyle)>
	//  169  516:iconst_0        
	//  170  517:invokevirtual   #427 <Method TtmlStyle TtmlStyle.setLinethrough(boolean)>
	//  171  520:astore_2        
			break;

	//* 172  521:goto            1102
		case 0: // '\0'
			ttmlstyle = createIfNull(((TtmlStyle) (obj))).setLinethrough(true);
	//  173  524:aload_0         
	//  174  525:aload           8
	//  175  527:invokespecial   #420 <Method TtmlStyle createIfNull(TtmlStyle)>
	//  176  530:iconst_1        
	//  177  531:invokevirtual   #427 <Method TtmlStyle TtmlStyle.setLinethrough(boolean)>
	//  178  534:astore_2        
			break;
		}
		break; /* Loop/switch isn't completed */
	//  179  535:goto            1102
_L9:
		byte byte0;
label2:
		{
			ttmlstyle = ((TtmlStyle) (Util.toLowerInvariant(s)));
	//  180  538:aload           9
	//  181  540:invokestatic    #406 <Method String Util.toLowerInvariant(String)>
	//  182  543:astore_2        
			switch(((String) (ttmlstyle)).hashCode())
	//* 183  544:aload_2         
	//* 184  545:invokevirtual   #173 <Method int String.hashCode()>
			{
			default:
				break;

	//* 185  548:lookupswitch    5: default 600
	//	               -1364013995: 662
	//	               100571: 648
	//	               3317767: 633
	//	               108511772: 618
	//	               109757538: 603
	//* 186  600:goto            678
			case 109757538: 
				if(((String) (ttmlstyle)).equals("start"))
	//* 187  603:aload_2         
	//* 188  604:ldc2            #429 <String "start">
	//* 189  607:invokevirtual   #113 <Method boolean String.equals(Object)>
	//* 190  610:ifeq            678
				{
					byte0 = 1;
	//  191  613:iconst_1        
	//  192  614:istore_3        
					break label2;
	//  193  615:goto            680
				}
				break;

			case 108511772: 
				if(!((String) (ttmlstyle)).equals("right"))
					break;
	//  194  618:aload_2         
	//  195  619:ldc2            #431 <String "right">
	//  196  622:invokevirtual   #113 <Method boolean String.equals(Object)>
	//  197  625:ifeq            678
				byte0 = 2;
	//  198  628:iconst_2        
	//  199  629:istore_3        
				break label2;
	//  200  630:goto            680

			case 3317767: 
				if(!((String) (ttmlstyle)).equals("left"))
					break;
	//  201  633:aload_2         
	//  202  634:ldc2            #433 <String "left">
	//  203  637:invokevirtual   #113 <Method boolean String.equals(Object)>
	//  204  640:ifeq            678
				byte0 = 0;
	//  205  643:iconst_0        
	//  206  644:istore_3        
				break label2;
	//  207  645:goto            680

			case 100571: 
				if(!((String) (ttmlstyle)).equals("end"))
					break;
	//  208  648:aload_2         
	//  209  649:ldc1            #19  <String "end">
	//  210  651:invokevirtual   #113 <Method boolean String.equals(Object)>
	//  211  654:ifeq            678
				byte0 = 3;
	//  212  657:iconst_3        
	//  213  658:istore_3        
				break label2;
	//  214  659:goto            680

			case -1364013995: 
				if(!((String) (ttmlstyle)).equals("center"))
					break;
	//  215  662:aload_2         
	//  216  663:ldc2            #435 <String "center">
	//  217  666:invokevirtual   #113 <Method boolean String.equals(Object)>
	//  218  669:ifeq            678
				byte0 = byte2;
	//  219  672:iload           6
	//  220  674:istore_3        
				break label2;
	//  221  675:goto            680
			}
			byte0 = -1;
	//  222  678:iconst_m1       
	//  223  679:istore_3        
		}
		switch(byte0)
	//* 224  680:iload_3         
		{
	//* 225  681:tableswitch     0 4: default 716
	//	               0 786
	//	               1 770
	//	               2 754
	//	               3 738
	//	               4 722
		default:
			ttmlstyle = ((TtmlStyle) (obj));
	//  226  716:aload           8
	//  227  718:astore_2        
			break;

	//* 228  719:goto            1102
		case 4: // '\004'
			ttmlstyle = createIfNull(((TtmlStyle) (obj))).setTextAlign(android.text.Layout.Alignment.ALIGN_CENTER);
	//  229  722:aload_0         
	//  230  723:aload           8
	//  231  725:invokespecial   #420 <Method TtmlStyle createIfNull(TtmlStyle)>
	//  232  728:getstatic       #441 <Field android.text.Layout$Alignment android.text.Layout$Alignment.ALIGN_CENTER>
	//  233  731:invokevirtual   #445 <Method TtmlStyle TtmlStyle.setTextAlign(android.text.Layout$Alignment)>
	//  234  734:astore_2        
			break;

	//* 235  735:goto            1102
		case 3: // '\003'
			ttmlstyle = createIfNull(((TtmlStyle) (obj))).setTextAlign(android.text.Layout.Alignment.ALIGN_OPPOSITE);
	//  236  738:aload_0         
	//  237  739:aload           8
	//  238  741:invokespecial   #420 <Method TtmlStyle createIfNull(TtmlStyle)>
	//  239  744:getstatic       #448 <Field android.text.Layout$Alignment android.text.Layout$Alignment.ALIGN_OPPOSITE>
	//  240  747:invokevirtual   #445 <Method TtmlStyle TtmlStyle.setTextAlign(android.text.Layout$Alignment)>
	//  241  750:astore_2        
			break;

	//* 242  751:goto            1102
		case 2: // '\002'
			ttmlstyle = createIfNull(((TtmlStyle) (obj))).setTextAlign(android.text.Layout.Alignment.ALIGN_OPPOSITE);
	//  243  754:aload_0         
	//  244  755:aload           8
	//  245  757:invokespecial   #420 <Method TtmlStyle createIfNull(TtmlStyle)>
	//  246  760:getstatic       #448 <Field android.text.Layout$Alignment android.text.Layout$Alignment.ALIGN_OPPOSITE>
	//  247  763:invokevirtual   #445 <Method TtmlStyle TtmlStyle.setTextAlign(android.text.Layout$Alignment)>
	//  248  766:astore_2        
			break;

	//* 249  767:goto            1102
		case 1: // '\001'
			ttmlstyle = createIfNull(((TtmlStyle) (obj))).setTextAlign(android.text.Layout.Alignment.ALIGN_NORMAL);
	//  250  770:aload_0         
	//  251  771:aload           8
	//  252  773:invokespecial   #420 <Method TtmlStyle createIfNull(TtmlStyle)>
	//  253  776:getstatic       #451 <Field android.text.Layout$Alignment android.text.Layout$Alignment.ALIGN_NORMAL>
	//  254  779:invokevirtual   #445 <Method TtmlStyle TtmlStyle.setTextAlign(android.text.Layout$Alignment)>
	//  255  782:astore_2        
			break;

	//* 256  783:goto            1102
		case 0: // '\0'
			ttmlstyle = createIfNull(((TtmlStyle) (obj))).setTextAlign(android.text.Layout.Alignment.ALIGN_NORMAL);
	//  257  786:aload_0         
	//  258  787:aload           8
	//  259  789:invokespecial   #420 <Method TtmlStyle createIfNull(TtmlStyle)>
	//  260  792:getstatic       #451 <Field android.text.Layout$Alignment android.text.Layout$Alignment.ALIGN_NORMAL>
	//  261  795:invokevirtual   #445 <Method TtmlStyle TtmlStyle.setTextAlign(android.text.Layout$Alignment)>
	//  262  798:astore_2        
			break;
		}
		break; /* Loop/switch isn't completed */
	//  263  799:goto            1102
_L8:
		ttmlstyle = createIfNull(((TtmlStyle) (obj))).setItalic("italic".equalsIgnoreCase(s));
	//  264  802:aload_0         
	//  265  803:aload           8
	//  266  805:invokespecial   #420 <Method TtmlStyle createIfNull(TtmlStyle)>
	//  267  808:ldc2            #453 <String "italic">
	//  268  811:aload           9
	//  269  813:invokevirtual   #456 <Method boolean String.equalsIgnoreCase(String)>
	//  270  816:invokevirtual   #459 <Method TtmlStyle TtmlStyle.setItalic(boolean)>
	//  271  819:astore_2        
		break; /* Loop/switch isn't completed */
	//  272  820:goto            1102
_L7:
		ttmlstyle = createIfNull(((TtmlStyle) (obj))).setBold("bold".equalsIgnoreCase(s));
	//  273  823:aload_0         
	//  274  824:aload           8
	//  275  826:invokespecial   #420 <Method TtmlStyle createIfNull(TtmlStyle)>
	//  276  829:ldc2            #461 <String "bold">
	//  277  832:aload           9
	//  278  834:invokevirtual   #456 <Method boolean String.equalsIgnoreCase(String)>
	//  279  837:invokevirtual   #464 <Method TtmlStyle TtmlStyle.setBold(boolean)>
	//  280  840:astore_2        
		break; /* Loop/switch isn't completed */
	//  281  841:goto            1102
_L6:
		ttmlstyle = ((TtmlStyle) (obj));
	//  282  844:aload           8
	//  283  846:astore_2        
		try
		{
			obj = ((Object) (createIfNull(((TtmlStyle) (obj)))));
	//  284  847:aload_0         
	//  285  848:aload           8
	//  286  850:invokespecial   #420 <Method TtmlStyle createIfNull(TtmlStyle)>
	//  287  853:astore          8
		}
	//* 288  855:aload           8
	//* 289  857:astore_2        
	//* 290  858:aload           9
	//* 291  860:aload           8
	//* 292  862:invokestatic    #466 <Method void parseFontSize(String, TtmlStyle)>
	//* 293  865:aload           8
	//* 294  867:astore_2        
	//* 295  868:goto            1102
	//* 296  871:new             #181 <Class StringBuilder>
	//* 297  874:dup             
	//* 298  875:invokespecial   #182 <Method void StringBuilder()>
	//* 299  878:astore          8
	//* 300  880:aload           8
	//* 301  882:ldc2            #468 <String "failed parsing fontSize value: '">
	//* 302  885:invokevirtual   #188 <Method StringBuilder StringBuilder.append(String)>
	//* 303  888:pop             
	//* 304  889:aload           8
	//* 305  891:aload           9
	//* 306  893:invokevirtual   #188 <Method StringBuilder StringBuilder.append(String)>
	//* 307  896:pop             
	//* 308  897:aload           8
	//* 309  899:ldc2            #367 <String "'">
	//* 310  902:invokevirtual   #188 <Method StringBuilder StringBuilder.append(String)>
	//* 311  905:pop             
	//* 312  906:ldc1            #38  <String "TtmlParser">
	//* 313  908:aload           8
	//* 314  910:invokevirtual   #194 <Method String StringBuilder.toString()>
	//* 315  913:invokestatic    #159 <Method int Log.w(String, String)>
	//* 316  916:pop             
	//* 317  917:goto            1102
	//* 318  920:aload_0         
	//* 319  921:aload           8
	//* 320  923:invokespecial   #420 <Method TtmlStyle createIfNull(TtmlStyle)>
	//* 321  926:aload           9
	//* 322  928:invokevirtual   #472 <Method TtmlStyle TtmlStyle.setFontFamily(String)>
	//* 323  931:astore_2        
	//* 324  932:goto            1102
	//* 325  935:aload_0         
	//* 326  936:aload           8
	//* 327  938:invokespecial   #420 <Method TtmlStyle createIfNull(TtmlStyle)>
	//* 328  941:astore_2        
	//* 329  942:aload_2         
	//* 330  943:aload           9
	//* 331  945:invokestatic    #477 <Method int TtmlColorParser.parseColor(String)>
	//* 332  948:invokevirtual   #480 <Method TtmlStyle TtmlStyle.setFontColor(int)>
	//* 333  951:pop             
	//* 334  952:goto            1102
	//* 335  955:new             #181 <Class StringBuilder>
	//* 336  958:dup             
	//* 337  959:invokespecial   #182 <Method void StringBuilder()>
	//* 338  962:astore          8
	//* 339  964:aload           8
	//* 340  966:ldc2            #482 <String "failed parsing color value: '">
	//* 341  969:invokevirtual   #188 <Method StringBuilder StringBuilder.append(String)>
	//* 342  972:pop             
	//* 343  973:aload           8
	//* 344  975:aload           9
	//* 345  977:invokevirtual   #188 <Method StringBuilder StringBuilder.append(String)>
	//* 346  980:pop             
	//* 347  981:aload           8
	//* 348  983:ldc2            #367 <String "'">
	//* 349  986:invokevirtual   #188 <Method StringBuilder StringBuilder.append(String)>
	//* 350  989:pop             
	//* 351  990:ldc1            #38  <String "TtmlParser">
	//* 352  992:aload           8
	//* 353  994:invokevirtual   #194 <Method String StringBuilder.toString()>
	//* 354  997:invokestatic    #159 <Method int Log.w(String, String)>
	//* 355 1000:pop             
	//* 356 1001:goto            1102
	//* 357 1004:aload_0         
	//* 358 1005:aload           8
	//* 359 1007:invokespecial   #420 <Method TtmlStyle createIfNull(TtmlStyle)>
	//* 360 1010:astore_2        
	//* 361 1011:aload_2         
	//* 362 1012:aload           9
	//* 363 1014:invokestatic    #477 <Method int TtmlColorParser.parseColor(String)>
	//* 364 1017:invokevirtual   #485 <Method TtmlStyle TtmlStyle.setBackgroundColor(int)>
	//* 365 1020:pop             
	//* 366 1021:goto            1102
	//* 367 1024:new             #181 <Class StringBuilder>
	//* 368 1027:dup             
	//* 369 1028:invokespecial   #182 <Method void StringBuilder()>
	//* 370 1031:astore          8
	//* 371 1033:aload           8
	//* 372 1035:ldc2            #487 <String "failed parsing background value: '">
	//* 373 1038:invokevirtual   #188 <Method StringBuilder StringBuilder.append(String)>
	//* 374 1041:pop             
	//* 375 1042:aload           8
	//* 376 1044:aload           9
	//* 377 1046:invokevirtual   #188 <Method StringBuilder StringBuilder.append(String)>
	//* 378 1049:pop             
	//* 379 1050:aload           8
	//* 380 1052:ldc2            #367 <String "'">
	//* 381 1055:invokevirtual   #188 <Method StringBuilder StringBuilder.append(String)>
	//* 382 1058:pop             
	//* 383 1059:ldc1            #38  <String "TtmlParser">
	//* 384 1061:aload           8
	//* 385 1063:invokevirtual   #194 <Method String StringBuilder.toString()>
	//* 386 1066:invokestatic    #159 <Method int Log.w(String, String)>
	//* 387 1069:pop             
	//* 388 1070:goto            1102
	//* 389 1073:aload           8
	//* 390 1075:astore_2        
	//* 391 1076:ldc1            #25  <String "style">
	//* 392 1078:aload_1         
	//* 393 1079:invokeinterface #345 <Method String XmlPullParser.getName()>
	//* 394 1084:invokevirtual   #113 <Method boolean String.equals(Object)>
	//* 395 1087:ifeq            1102
	//* 396 1090:aload_0         
	//* 397 1091:aload           8
	//* 398 1093:invokespecial   #420 <Method TtmlStyle createIfNull(TtmlStyle)>
	//* 399 1096:aload           9
	//* 400 1098:invokevirtual   #490 <Method TtmlStyle TtmlStyle.setId(String)>
	//* 401 1101:astore_2        
	//* 402 1102:iload           4
	//* 403 1104:iconst_1        
	//* 404 1105:iadd            
	//* 405 1106:istore          4
	//* 406 1108:aload_2         
	//* 407 1109:astore          8
	//* 408 1111:goto            14
	//* 409 1114:aload           8
	//* 410 1116:areturn         
		// Misplaced declaration of an exception variable
		catch(Object obj1)
		{
			obj = ((Object) (new StringBuilder()));
			((StringBuilder) (obj)).append("failed parsing fontSize value: '");
			((StringBuilder) (obj)).append(s);
			((StringBuilder) (obj)).append("'");
			Log.w("TtmlParser", ((StringBuilder) (obj)).toString());
			break; /* Loop/switch isn't completed */
		}
		ttmlstyle = ((TtmlStyle) (obj));
		parseFontSize(s, ((TtmlStyle) (obj)));
		ttmlstyle = ((TtmlStyle) (obj));
		break; /* Loop/switch isn't completed */
_L5:
		ttmlstyle = createIfNull(((TtmlStyle) (obj))).setFontFamily(s);
		break; /* Loop/switch isn't completed */
_L4:
		ttmlstyle = createIfNull(((TtmlStyle) (obj)));
		try
		{
			ttmlstyle.setFontColor(TtmlColorParser.parseColor(s));
			break; /* Loop/switch isn't completed */
		}
	//* 411 1117:astore          8
	//* 412 1119:goto            871
		// Misplaced declaration of an exception variable
		catch(Object obj1)
		{
			obj = ((Object) (new StringBuilder()));
		}
		((StringBuilder) (obj)).append("failed parsing color value: '");
		((StringBuilder) (obj)).append(s);
		((StringBuilder) (obj)).append("'");
		Log.w("TtmlParser", ((StringBuilder) (obj)).toString());
		break; /* Loop/switch isn't completed */
_L3:
		ttmlstyle = createIfNull(((TtmlStyle) (obj)));
		try
		{
			ttmlstyle.setBackgroundColor(TtmlColorParser.parseColor(s));
			break; /* Loop/switch isn't completed */
		}
	//* 413 1122:astore          8
	//* 414 1124:goto            955
		// Misplaced declaration of an exception variable
		catch(Object obj1)
		{
			obj = ((Object) (new StringBuilder()));
		}
		((StringBuilder) (obj)).append("failed parsing background value: '");
		((StringBuilder) (obj)).append(s);
		((StringBuilder) (obj)).append("'");
		Log.w("TtmlParser", ((StringBuilder) (obj)).toString());
		break; /* Loop/switch isn't completed */
_L2:
		ttmlstyle = ((TtmlStyle) (obj));
		if("style".equals(((Object) (xmlpullparser.getName()))))
			ttmlstyle = createIfNull(((TtmlStyle) (obj))).setId(s);
		k++;
		obj = ((Object) (ttmlstyle));
		if(true) goto _L12; else goto _L11
_L11:
		Object obj1;
		return ((TtmlStyle) (obj));
	//* 415 1127:astore          8
	//* 416 1129:goto            1024
	}

	private String[] parseStyleIds(String s)
	{
		return s.split("\\s+");
	//    0    0:aload_1         
	//    1    1:ldc1            #143 <String "\\s+">
	//    2    3:invokevirtual   #147 <Method String[] String.split(String)>
	//    3    6:areturn         
	}

	private static long parseTimeExpression(String s, FrameAndTickRate frameandtickrate)
		throws ParserException
	{
		Matcher matcher = CLOCK_TIME.matcher(((CharSequence) (s)));
	//    0    0:getstatic       #55  <Field Pattern CLOCK_TIME>
	//    1    3:aload_0         
	//    2    4:invokevirtual   #151 <Method Matcher Pattern.matcher(CharSequence)>
	//    3    7:astore          14
		if(matcher.matches())
	//*   4    9:aload           14
	//*   5   11:invokevirtual   #165 <Method boolean Matcher.matches()>
	//*   6   14:ifeq            168
		{
			double d5 = Long.parseLong(matcher.group(1)) * 3600L;
	//    7   17:aload           14
	//    8   19:iconst_1        
	//    9   20:invokevirtual   #169 <Method String Matcher.group(int)>
	//   10   23:invokestatic    #496 <Method long Long.parseLong(String)>
	//   11   26:ldc2w           #497 <Long 3600L>
	//   12   29:lmul            
	//   13   30:l2d             
	//   14   31:dstore          8
			double d6 = Long.parseLong(matcher.group(2)) * 60L;
	//   15   33:aload           14
	//   16   35:iconst_2        
	//   17   36:invokevirtual   #169 <Method String Matcher.group(int)>
	//   18   39:invokestatic    #496 <Method long Long.parseLong(String)>
	//   19   42:ldc2w           #499 <Long 60L>
	//   20   45:lmul            
	//   21   46:l2d             
	//   22   47:dstore          10
			double d7 = Long.parseLong(matcher.group(3));
	//   23   49:aload           14
	//   24   51:iconst_3        
	//   25   52:invokevirtual   #169 <Method String Matcher.group(int)>
	//   26   55:invokestatic    #496 <Method long Long.parseLong(String)>
	//   27   58:l2d             
	//   28   59:dstore          12
			s = matcher.group(4);
	//   29   61:aload           14
	//   30   63:iconst_4        
	//   31   64:invokevirtual   #169 <Method String Matcher.group(int)>
	//   32   67:astore_0        
			double d4 = 0.0D;
	//   33   68:dconst_0        
	//   34   69:dstore          6
			double d;
			if(s != null)
	//*  35   71:aload_0         
	//*  36   72:ifnull          83
				d = Double.parseDouble(s);
	//   37   75:aload_0         
	//   38   76:invokestatic    #506 <Method double Double.parseDouble(String)>
	//   39   79:dstore_2        
			else
	//*  40   80:goto            85
				d = 0.0D;
	//   41   83:dconst_0        
	//   42   84:dstore_2        
			s = matcher.group(5);
	//   43   85:aload           14
	//   44   87:iconst_5        
	//   45   88:invokevirtual   #169 <Method String Matcher.group(int)>
	//   46   91:astore_0        
			double d2;
			if(s != null)
	//*  47   92:aload_0         
	//*  48   93:ifnull          112
				d2 = (float)Long.parseLong(s) / frameandtickrate.effectiveFrameRate;
	//   49   96:aload_0         
	//   50   97:invokestatic    #496 <Method long Long.parseLong(String)>
	//   51  100:l2f             
	//   52  101:aload_1         
	//   53  102:getfield        #510 <Field float TtmlParser$FrameAndTickRate.effectiveFrameRate>
	//   54  105:fdiv            
	//   55  106:f2d             
	//   56  107:dstore          4
			else
	//*  57  109:goto            115
				d2 = 0.0D;
	//   58  112:dconst_0        
	//   59  113:dstore          4
			s = matcher.group(6);
	//   60  115:aload           14
	//   61  117:bipush          6
	//   62  119:invokevirtual   #169 <Method String Matcher.group(int)>
	//   63  122:astore_0        
			if(s != null)
	//*  64  123:aload_0         
	//*  65  124:ifnull          146
				d4 = (double)Long.parseLong(s) / (double)frameandtickrate.subFrameRate / (double)frameandtickrate.effectiveFrameRate;
	//   66  127:aload_0         
	//   67  128:invokestatic    #496 <Method long Long.parseLong(String)>
	//   68  131:l2d             
	//   69  132:aload_1         
	//   70  133:getfield        #250 <Field int TtmlParser$FrameAndTickRate.subFrameRate>
	//   71  136:i2d             
	//   72  137:ddiv            
	//   73  138:aload_1         
	//   74  139:getfield        #510 <Field float TtmlParser$FrameAndTickRate.effectiveFrameRate>
	//   75  142:f2d             
	//   76  143:ddiv            
	//   77  144:dstore          6
			return (long)((d5 + d6 + d7 + d + d2 + d4) * 1000000D);
	//   78  146:dload           8
	//   79  148:dload           10
	//   80  150:dadd            
	//   81  151:dload           12
	//   82  153:dadd            
	//   83  154:dload_2         
	//   84  155:dadd            
	//   85  156:dload           4
	//   86  158:dadd            
	//   87  159:dload           6
	//   88  161:dadd            
	//   89  162:ldc2w           #511 <Double 1000000D>
	//   90  165:dmul            
	//   91  166:d2l             
	//   92  167:lreturn         
		}
		matcher = OFFSET_TIME.matcher(((CharSequence) (s)));
	//   93  168:getstatic       #59  <Field Pattern OFFSET_TIME>
	//   94  171:aload_0         
	//   95  172:invokevirtual   #151 <Method Matcher Pattern.matcher(CharSequence)>
	//   96  175:astore          14
		if(matcher.matches())
	//*  97  177:aload           14
	//*  98  179:invokevirtual   #165 <Method boolean Matcher.matches()>
	//*  99  182:ifeq            330
		{
			double d3 = Double.parseDouble(matcher.group(1));
	//  100  185:aload           14
	//  101  187:iconst_1        
	//  102  188:invokevirtual   #169 <Method String Matcher.group(int)>
	//  103  191:invokestatic    #506 <Method double Double.parseDouble(String)>
	//  104  194:dstore          4
			s = matcher.group(2);
	//  105  196:aload           14
	//  106  198:iconst_2        
	//  107  199:invokevirtual   #169 <Method String Matcher.group(int)>
	//  108  202:astore_0        
			double d1;
			if(s.equals("h"))
	//* 109  203:aload_0         
	//* 110  204:ldc2            #514 <String "h">
	//* 111  207:invokevirtual   #113 <Method boolean String.equals(Object)>
	//* 112  210:ifeq            223
				d1 = d3 * 3600D;
	//  113  213:dload           4
	//  114  215:ldc2w           #515 <Double 3600D>
	//  115  218:dmul            
	//  116  219:dstore_2        
			else
	//* 117  220:goto            323
			if(s.equals("m"))
	//* 118  223:aload_0         
	//* 119  224:ldc2            #518 <String "m">
	//* 120  227:invokevirtual   #113 <Method boolean String.equals(Object)>
	//* 121  230:ifeq            243
				d1 = d3 * 60D;
	//  122  233:dload           4
	//  123  235:ldc2w           #519 <Double 60D>
	//  124  238:dmul            
	//  125  239:dstore_2        
			else
	//* 126  240:goto            323
			if(s.equals("s"))
	//* 127  243:aload_0         
	//* 128  244:ldc2            #522 <String "s">
	//* 129  247:invokevirtual   #113 <Method boolean String.equals(Object)>
	//* 130  250:ifeq            259
				d1 = d3;
	//  131  253:dload           4
	//  132  255:dstore_2        
			else
	//* 133  256:goto            323
			if(s.equals("ms"))
	//* 134  259:aload_0         
	//* 135  260:ldc2            #524 <String "ms">
	//* 136  263:invokevirtual   #113 <Method boolean String.equals(Object)>
	//* 137  266:ifeq            279
				d1 = d3 / 1000D;
	//  138  269:dload           4
	//  139  271:ldc2w           #525 <Double 1000D>
	//  140  274:ddiv            
	//  141  275:dstore_2        
			else
	//* 142  276:goto            323
			if(s.equals("f"))
	//* 143  279:aload_0         
	//* 144  280:ldc2            #528 <String "f">
	//* 145  283:invokevirtual   #113 <Method boolean String.equals(Object)>
	//* 146  286:ifeq            301
			{
				d1 = d3 / (double)frameandtickrate.effectiveFrameRate;
	//  147  289:dload           4
	//  148  291:aload_1         
	//  149  292:getfield        #510 <Field float TtmlParser$FrameAndTickRate.effectiveFrameRate>
	//  150  295:f2d             
	//  151  296:ddiv            
	//  152  297:dstore_2        
			} else
	//* 153  298:goto            323
			{
				d1 = d3;
	//  154  301:dload           4
	//  155  303:dstore_2        
				if(s.equals("t"))
	//* 156  304:aload_0         
	//* 157  305:ldc2            #530 <String "t">
	//* 158  308:invokevirtual   #113 <Method boolean String.equals(Object)>
	//* 159  311:ifeq            323
					d1 = d3 / (double)frameandtickrate.tickRate;
	//  160  314:dload           4
	//  161  316:aload_1         
	//  162  317:getfield        #254 <Field int TtmlParser$FrameAndTickRate.tickRate>
	//  163  320:i2d             
	//  164  321:ddiv            
	//  165  322:dstore_2        
			}
			return (long)(d1 * 1000000D);
	//  166  323:dload_2         
	//  167  324:ldc2w           #511 <Double 1000000D>
	//  168  327:dmul            
	//  169  328:d2l             
	//  170  329:lreturn         
		} else
		{
			frameandtickrate = ((FrameAndTickRate) (new StringBuilder()));
	//  171  330:new             #181 <Class StringBuilder>
	//  172  333:dup             
	//  173  334:invokespecial   #182 <Method void StringBuilder()>
	//  174  337:astore_1        
			((StringBuilder) (frameandtickrate)).append("Malformed time expression: ");
	//  175  338:aload_1         
	//  176  339:ldc2            #532 <String "Malformed time expression: ">
	//  177  342:invokevirtual   #188 <Method StringBuilder StringBuilder.append(String)>
	//  178  345:pop             
			((StringBuilder) (frameandtickrate)).append(s);
	//  179  346:aload_1         
	//  180  347:aload_0         
	//  181  348:invokevirtual   #188 <Method StringBuilder StringBuilder.append(String)>
	//  182  351:pop             
			throw new ParserException(((StringBuilder) (frameandtickrate)).toString());
	//  183  352:new             #141 <Class ParserException>
	//  184  355:dup             
	//  185  356:aload_1         
	//  186  357:invokevirtual   #194 <Method String StringBuilder.toString()>
	//  187  360:invokespecial   #197 <Method void ParserException(String)>
	//  188  363:athrow          
		}
	}

	public boolean canParse(String s)
	{
		return "application/ttml+xml".equals(((Object) (s)));
	//    0    0:ldc2            #535 <String "application/ttml+xml">
	//    1    3:aload_1         
	//    2    4:invokevirtual   #113 <Method boolean String.equals(Object)>
	//    3    7:ireturn         
	}

	public volatile Subtitle parse(byte abyte0[], int i, int j)
		throws ParserException
	{
		return ((Subtitle) (parse(abyte0, i, j)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:iload_3         
	//    4    4:invokevirtual   #540 <Method TtmlSubtitle parse(byte[], int, int)>
	//    5    7:areturn         
	}

	public TtmlSubtitle parse(byte abyte0[], int i, int j)
		throws ParserException
	{
		int k;
		Object obj;
		Object obj1;
		byte abyte1[];
		XmlPullParser xmlpullparser;
		HashMap hashmap;
		HashMap hashmap1;
		LinkedList linkedlist;
		TtmlNode ttmlnode;
		TtmlNode ttmlnode1;
		try
		{
			xmlpullparser = xmlParserFactory.newPullParser();
	//    0    0:aload_0         
	//    1    1:getfield        #87  <Field XmlPullParserFactory xmlParserFactory>
	//    2    4:invokevirtual   #544 <Method XmlPullParser XmlPullParserFactory.newPullParser()>
	//    3    7:astore          8
			hashmap = new HashMap();
	//    4    9:new             #546 <Class HashMap>
	//    5   12:dup             
	//    6   13:invokespecial   #547 <Method void HashMap()>
	//    7   16:astore          9
			hashmap1 = new HashMap();
	//    8   18:new             #546 <Class HashMap>
	//    9   21:dup             
	//   10   22:invokespecial   #547 <Method void HashMap()>
	//   11   25:astore          10
			((Map) (hashmap1)).put("", ((Object) (new TtmlRegion())));
	//   12   27:aload           10
	//   13   29:ldc2            #316 <String "">
	//   14   32:new             #375 <Class TtmlRegion>
	//   15   35:dup             
	//   16   36:invokespecial   #548 <Method void TtmlRegion()>
	//   17   39:invokeinterface #294 <Method Object Map.put(Object, Object)>
	//   18   44:pop             
			obj = ((Object) (new ByteArrayInputStream(abyte0, i, j)));
	//   19   45:new             #550 <Class ByteArrayInputStream>
	//   20   48:dup             
	//   21   49:aload_1         
	//   22   50:iload_2         
	//   23   51:iload_3         
	//   24   52:invokespecial   #553 <Method void ByteArrayInputStream(byte[], int, int)>
	//   25   55:astore          5
		}
	//*  26   57:aconst_null     
	//*  27   58:astore_1        
	//*  28   59:aload           8
	//*  29   61:aload           5
	//*  30   63:aconst_null     
	//*  31   64:invokeinterface #557 <Method void XmlPullParser.setInput(java.io.InputStream, String)>
	//*  32   69:new             #559 <Class LinkedList>
	//*  33   72:dup             
	//*  34   73:invokespecial   #560 <Method void LinkedList()>
	//*  35   76:astore          11
	//*  36   78:iconst_0        
	//*  37   79:istore_3        
	//*  38   80:aload           8
	//*  39   82:invokeinterface #563 <Method int XmlPullParser.getEventType()>
	//*  40   87:istore          4
	//*  41   89:getstatic       #74  <Field TtmlParser$FrameAndTickRate DEFAULT_FRAME_AND_TICK_RATE>
	//*  42   92:astore          5
	//*  43   94:iload           4
	//*  44   96:iconst_1        
	//*  45   97:icmpeq          455
	//*  46  100:aload           11
	//*  47  102:invokevirtual   #567 <Method Object LinkedList.peekLast()>
	//*  48  105:checkcast       #335 <Class TtmlNode>
	//*  49  108:astore          12
	//*  50  110:iload_3         
	//*  51  111:ifne            483
	//*  52  114:aload           8
	//*  53  116:invokeinterface #345 <Method String XmlPullParser.getName()>
	//*  54  121:astore          6
	//*  55  123:iload           4
	//*  56  125:iconst_2        
	//*  57  126:icmpne          325
	//*  58  129:ldc1            #107 <String "tt">
	//*  59  131:aload           6
	//*  60  133:invokevirtual   #113 <Method boolean String.equals(Object)>
	//*  61  136:ifeq            147
	//*  62  139:aload_0         
	//*  63  140:aload           8
	//*  64  142:invokespecial   #569 <Method TtmlParser$FrameAndTickRate parseFrameAndTickRates(XmlPullParser)>
	//*  65  145:astore          5
	//*  66  147:aload           6
	//*  67  149:invokestatic    #571 <Method boolean isSupportedTag(String)>
	//*  68  152:ifne            211
	//*  69  155:new             #181 <Class StringBuilder>
	//*  70  158:dup             
	//*  71  159:invokespecial   #182 <Method void StringBuilder()>
	//*  72  162:astore          6
	//*  73  164:aload           6
	//*  74  166:ldc2            #573 <String "Ignoring unsupported tag: ">
	//*  75  169:invokevirtual   #188 <Method StringBuilder StringBuilder.append(String)>
	//*  76  172:pop             
	//*  77  173:aload           6
	//*  78  175:aload           8
	//*  79  177:invokeinterface #345 <Method String XmlPullParser.getName()>
	//*  80  182:invokevirtual   #188 <Method StringBuilder StringBuilder.append(String)>
	//*  81  185:pop             
	//*  82  186:ldc1            #38  <String "TtmlParser">
	//*  83  188:aload           6
	//*  84  190:invokevirtual   #194 <Method String StringBuilder.toString()>
	//*  85  193:invokestatic    #576 <Method int Log.i(String, String)>
	//*  86  196:pop             
	//*  87  197:iload_3         
	//*  88  198:iconst_1        
	//*  89  199:iadd            
	//*  90  200:istore_2        
	//*  91  201:aload           5
	//*  92  203:astore          6
	//*  93  205:aload_1         
	//*  94  206:astore          7
	//*  95  208:goto            426
	//*  96  211:ldc1            #115 <String "head">
	//*  97  213:aload           6
	//*  98  215:invokevirtual   #113 <Method boolean String.equals(Object)>
	//*  99  218:ifeq            244
	//* 100  221:aload_0         
	//* 101  222:aload           8
	//* 102  224:aload           9
	//* 103  226:aload           10
	//* 104  228:invokespecial   #578 <Method Map parseHeader(XmlPullParser, Map, Map)>
	//* 105  231:pop             
	//* 106  232:aload           5
	//* 107  234:astore          6
	//* 108  236:aload_1         
	//* 109  237:astore          7
	//* 110  239:iload_3         
	//* 111  240:istore_2        
	//* 112  241:goto            426
	//* 113  244:aload_0         
	//* 114  245:aload           8
	//* 115  247:aload           12
	//* 116  249:aload           10
	//* 117  251:aload           5
	//* 118  253:invokespecial   #580 <Method TtmlNode parseNode(XmlPullParser, TtmlNode, Map, TtmlParser$FrameAndTickRate)>
	//* 119  256:astore          13
	//* 120  258:aload           11
	//* 121  260:aload           13
	//* 122  262:invokevirtual   #584 <Method void LinkedList.addLast(Object)>
	//* 123  265:aload           5
	//* 124  267:astore          6
	//* 125  269:aload_1         
	//* 126  270:astore          7
	//* 127  272:iload_3         
	//* 128  273:istore_2        
	//* 129  274:aload           12
	//* 130  276:ifnull          426
	//* 131  279:aload           12
	//* 132  281:aload           13
	//* 133  283:invokevirtual   #588 <Method void TtmlNode.addChild(TtmlNode)>
	//* 134  286:aload           5
	//* 135  288:astore          6
	//* 136  290:aload_1         
	//* 137  291:astore          7
	//* 138  293:iload_3         
	//* 139  294:istore_2        
	//* 140  295:goto            426
	//* 141  298:astore          6
	//* 142  300:ldc1            #38  <String "TtmlParser">
	//* 143  302:ldc2            #590 <String "Suppressing parser error">
	//* 144  305:aload           6
	//* 145  307:invokestatic    #370 <Method int Log.w(String, String, Throwable)>
	//* 146  310:pop             
	//* 147  311:iload_3         
	//* 148  312:iconst_1        
	//* 149  313:iadd            
	//* 150  314:istore_2        
	//* 151  315:aload           5
	//* 152  317:astore          6
	//* 153  319:aload_1         
	//* 154  320:astore          7
	//* 155  322:goto            426
	//* 156  325:iload           4
	//* 157  327:iconst_4        
	//* 158  328:icmpne          358
	//* 159  331:aload           12
	//* 160  333:aload           8
	//* 161  335:invokeinterface #593 <Method String XmlPullParser.getText()>
	//* 162  340:invokestatic    #597 <Method TtmlNode TtmlNode.buildTextNode(String)>
	//* 163  343:invokevirtual   #588 <Method void TtmlNode.addChild(TtmlNode)>
	//* 164  346:aload           5
	//* 165  348:astore          6
	//* 166  350:aload_1         
	//* 167  351:astore          7
	//* 168  353:iload_3         
	//* 169  354:istore_2        
	//* 170  355:goto            426
	//* 171  358:aload           5
	//* 172  360:astore          6
	//* 173  362:aload_1         
	//* 174  363:astore          7
	//* 175  365:iload_3         
	//* 176  366:istore_2        
	//* 177  367:iload           4
	//* 178  369:iconst_3        
	//* 179  370:icmpne          426
	//* 180  373:aload           8
	//* 181  375:invokeinterface #345 <Method String XmlPullParser.getName()>
	//* 182  380:ldc1            #107 <String "tt">
	//* 183  382:invokevirtual   #113 <Method boolean String.equals(Object)>
	//* 184  385:ifeq            408
	//* 185  388:new             #599 <Class TtmlSubtitle>
	//* 186  391:dup             
	//* 187  392:aload           11
	//* 188  394:invokevirtual   #602 <Method Object LinkedList.getLast()>
	//* 189  397:checkcast       #335 <Class TtmlNode>
	//* 190  400:aload           9
	//* 191  402:aload           10
	//* 192  404:invokespecial   #605 <Method void TtmlSubtitle(TtmlNode, Map, Map)>
	//* 193  407:astore_1        
	//* 194  408:aload           11
	//* 195  410:invokevirtual   #608 <Method Object LinkedList.removeLast()>
	//* 196  413:pop             
	//* 197  414:aload           5
	//* 198  416:astore          6
	//* 199  418:aload_1         
	//* 200  419:astore          7
	//* 201  421:iload_3         
	//* 202  422:istore_2        
	//* 203  423:goto            426
	//* 204  426:aload           8
	//* 205  428:invokeinterface #262 <Method int XmlPullParser.next()>
	//* 206  433:pop             
	//* 207  434:aload           8
	//* 208  436:invokeinterface #563 <Method int XmlPullParser.getEventType()>
	//* 209  441:istore          4
	//* 210  443:aload           6
	//* 211  445:astore          5
	//* 212  447:aload           7
	//* 213  449:astore_1        
	//* 214  450:iload_2         
	//* 215  451:istore_3        
	//* 216  452:goto            94
	//* 217  455:aload_1         
	//* 218  456:areturn         
	//* 219  457:astore_1        
	//* 220  458:new             #610 <Class IllegalStateException>
	//* 221  461:dup             
	//* 222  462:ldc2            #612 <String "Unexpected error when reading input.">
	//* 223  465:aload_1         
	//* 224  466:invokespecial   #613 <Method void IllegalStateException(String, Throwable)>
	//* 225  469:athrow          
		// Misplaced declaration of an exception variable
		catch(byte abyte0[])
	//* 226  470:astore_1        
		{
			throw new ParserException("Unable to parse source", ((Throwable) (abyte0)));
	//  227  471:new             #141 <Class ParserException>
	//  228  474:dup             
	//  229  475:ldc2            #615 <String "Unable to parse source">
	//  230  478:aload_1         
	//  231  479:invokespecial   #616 <Method void ParserException(String, Throwable)>
	//  232  482:athrow          
		}
		// Misplaced declaration of an exception variable
		catch(byte abyte0[])
		{
			throw new IllegalStateException("Unexpected error when reading input.", ((Throwable) (abyte0)));
		}
		abyte0 = null;
		xmlpullparser.setInput(((java.io.InputStream) (obj)), ((String) (null)));
		linkedlist = new LinkedList();
		j = 0;
		k = xmlpullparser.getEventType();
		obj = ((Object) (DEFAULT_FRAME_AND_TICK_RATE));
_L3:
		if(k == 1) goto _L2; else goto _L1
_L1:
		ttmlnode = (TtmlNode)linkedlist.peekLast();
		if(j != 0)
			break MISSING_BLOCK_LABEL_483;
		obj1 = ((Object) (xmlpullparser.getName()));
		if(k != 2)
			break MISSING_BLOCK_LABEL_325;
		if("tt".equals(obj1))
			obj = ((Object) (parseFrameAndTickRates(xmlpullparser)));
		if(isSupportedTag(((String) (obj1))))
			break MISSING_BLOCK_LABEL_211;
		obj1 = ((Object) (new StringBuilder()));
		((StringBuilder) (obj1)).append("Ignoring unsupported tag: ");
		((StringBuilder) (obj1)).append(xmlpullparser.getName());
		Log.i("TtmlParser", ((StringBuilder) (obj1)).toString());
		i = j + 1;
		obj1 = obj;
		abyte1 = abyte0;
		break MISSING_BLOCK_LABEL_426;
		if(!"head".equals(obj1))
			break MISSING_BLOCK_LABEL_244;
		parseHeader(xmlpullparser, ((Map) (hashmap)), ((Map) (hashmap1)));
		obj1 = obj;
		abyte1 = abyte0;
		i = j;
		break MISSING_BLOCK_LABEL_426;
		ttmlnode1 = parseNode(xmlpullparser, ttmlnode, ((Map) (hashmap1)), ((FrameAndTickRate) (obj)));
		linkedlist.addLast(((Object) (ttmlnode1)));
		obj1 = obj;
		abyte1 = abyte0;
		i = j;
		if(ttmlnode == null)
			break MISSING_BLOCK_LABEL_426;
		ttmlnode.addChild(ttmlnode1);
		obj1 = obj;
		abyte1 = abyte0;
		i = j;
		break MISSING_BLOCK_LABEL_426;
		obj1;
		Log.w("TtmlParser", "Suppressing parser error", ((Throwable) (obj1)));
		i = j + 1;
		obj1 = obj;
		abyte1 = abyte0;
		break MISSING_BLOCK_LABEL_426;
		if(k != 4)
			break MISSING_BLOCK_LABEL_358;
		ttmlnode.addChild(TtmlNode.buildTextNode(xmlpullparser.getText()));
		obj1 = obj;
		abyte1 = abyte0;
		i = j;
		break MISSING_BLOCK_LABEL_426;
		obj1 = obj;
		abyte1 = abyte0;
		i = j;
		if(k != 3)
			break MISSING_BLOCK_LABEL_426;
		if(xmlpullparser.getName().equals("tt"))
			abyte0 = ((byte []) (new TtmlSubtitle((TtmlNode)linkedlist.getLast(), ((Map) (hashmap)), ((Map) (hashmap1)))));
		linkedlist.removeLast();
		obj1 = obj;
		abyte1 = abyte0;
		i = j;
_L4:
		xmlpullparser.next();
		k = xmlpullparser.getEventType();
		obj = obj1;
		abyte0 = abyte1;
		j = i;
		  goto _L3
_L2:
		return ((TtmlSubtitle) (abyte0));
		if(k == 2)
	//* 233  483:iload           4
	//* 234  485:iconst_2        
	//* 235  486:icmpne          503
		{
			i = j + 1;
	//  236  489:iload_3         
	//  237  490:iconst_1        
	//  238  491:iadd            
	//  239  492:istore_2        
			obj1 = obj;
	//  240  493:aload           5
	//  241  495:astore          6
			abyte1 = abyte0;
	//  242  497:aload_1         
	//  243  498:astore          7
		} else
	//* 244  500:goto            426
		{
			obj1 = obj;
	//  245  503:aload           5
	//  246  505:astore          6
			abyte1 = abyte0;
	//  247  507:aload_1         
	//  248  508:astore          7
			i = j;
	//  249  510:iload_3         
	//  250  511:istore_2        
			if(k == 3)
	//* 251  512:iload           4
	//* 252  514:iconst_3        
	//* 253  515:icmpne          426
			{
				i = j - 1;
	//  254  518:iload_3         
	//  255  519:iconst_1        
	//  256  520:isub            
	//  257  521:istore_2        
				obj1 = obj;
	//  258  522:aload           5
	//  259  524:astore          6
				abyte1 = abyte0;
	//  260  526:aload_1         
	//  261  527:astore          7
			}
		}
		  goto _L4
	//* 262  529:goto            426
	}

	private static final String ATTR_BEGIN = "begin";
	private static final String ATTR_DURATION = "dur";
	private static final String ATTR_END = "end";
	private static final String ATTR_REGION = "region";
	private static final String ATTR_STYLE = "style";
	private static final Pattern CLOCK_TIME = Pattern.compile("^([0-9][0-9]+):([0-9][0-9]):([0-9][0-9])(?:(\\.[0-9]+)|:([0-9][0-9])(?:\\.([0-9]+))?)?$");
	private static final FrameAndTickRate DEFAULT_FRAME_AND_TICK_RATE = new FrameAndTickRate(30F, 1, 1);
	private static final int DEFAULT_FRAME_RATE = 30;
	private static final Pattern FONT_SIZE = Pattern.compile("^(([0-9]*.)?[0-9]+)(px|em|%)$");
	private static final Pattern OFFSET_TIME = Pattern.compile("^([0-9]+(?:\\.[0-9]+)?)(h|m|s|ms|f|t)$");
	private static final Pattern PERCENTAGE_COORDINATES = Pattern.compile("^(\\d+\\.?\\d*?)% (\\d+\\.?\\d*?)%$");
	private static final String TAG = "TtmlParser";
	private static final String TTP = "http://www.w3.org/ns/ttml#parameter";
	private final XmlPullParserFactory xmlParserFactory;

	static 
	{
	//    0    0:ldc1            #47  <String "^([0-9][0-9]+):([0-9][0-9]):([0-9][0-9])(?:(\\.[0-9]+)|:([0-9][0-9])(?:\\.([0-9]+))?)?$">
	//    1    2:invokestatic    #53  <Method Pattern Pattern.compile(String)>
	//    2    5:putstatic       #55  <Field Pattern CLOCK_TIME>
	//    3    8:ldc1            #57  <String "^([0-9]+(?:\\.[0-9]+)?)(h|m|s|ms|f|t)$">
	//    4   10:invokestatic    #53  <Method Pattern Pattern.compile(String)>
	//    5   13:putstatic       #59  <Field Pattern OFFSET_TIME>
	//    6   16:ldc1            #61  <String "^(([0-9]*.)?[0-9]+)(px|em|%)$">
	//    7   18:invokestatic    #53  <Method Pattern Pattern.compile(String)>
	//    8   21:putstatic       #63  <Field Pattern FONT_SIZE>
	//    9   24:ldc1            #65  <String "^(\\d+\\.?\\d*?)% (\\d+\\.?\\d*?)%$">
	//   10   26:invokestatic    #53  <Method Pattern Pattern.compile(String)>
	//   11   29:putstatic       #67  <Field Pattern PERCENTAGE_COORDINATES>
	//   12   32:new             #8   <Class TtmlParser$FrameAndTickRate>
	//   13   35:dup             
	//   14   36:ldc1            #68  <Float 30F>
	//   15   38:iconst_1        
	//   16   39:iconst_1        
	//   17   40:invokespecial   #72  <Method void TtmlParser$FrameAndTickRate(float, int, int)>
	//   18   43:putstatic       #74  <Field TtmlParser$FrameAndTickRate DEFAULT_FRAME_AND_TICK_RATE>
	//*  19   46:return          
	}
}

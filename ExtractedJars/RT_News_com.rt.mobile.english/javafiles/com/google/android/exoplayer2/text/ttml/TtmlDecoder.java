// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.text.ttml;

import android.util.Log;
import com.google.android.exoplayer2.text.*;
import com.google.android.exoplayer2.util.*;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.xmlpull.v1.*;

// Referenced classes of package com.google.android.exoplayer2.text.ttml:
//			TtmlStyle, TtmlRegion, TtmlNode, TtmlSubtitle

public final class TtmlDecoder extends SimpleSubtitleDecoder
{
	private static final class CellResolution
	{

		final int columns;
		final int rows;

		CellResolution(int i, int j)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #15  <Method void Object()>
			columns = i;
		//    2    4:aload_0         
		//    3    5:iload_1         
		//    4    6:putfield        #17  <Field int columns>
			rows = j;
		//    5    9:aload_0         
		//    6   10:iload_2         
		//    7   11:putfield        #19  <Field int rows>
		//    8   14:return          
		}
	}

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


	public TtmlDecoder()
	{
		super("TtmlDecoder");
	//    0    0:aload_0         
	//    1    1:ldc1            #42  <String "TtmlDecoder">
	//    2    3:invokespecial   #93  <Method void SimpleSubtitleDecoder(String)>
		try
		{
			xmlParserFactory = XmlPullParserFactory.newInstance();
	//    3    6:aload_0         
	//    4    7:invokestatic    #99  <Method XmlPullParserFactory XmlPullParserFactory.newInstance()>
	//    5   10:putfield        #101 <Field XmlPullParserFactory xmlParserFactory>
			xmlParserFactory.setNamespaceAware(true);
	//    6   13:aload_0         
	//    7   14:getfield        #101 <Field XmlPullParserFactory xmlParserFactory>
	//    8   17:iconst_1        
	//    9   18:invokevirtual   #105 <Method void XmlPullParserFactory.setNamespaceAware(boolean)>
			return;
	//   10   21:return          
		}
		catch(XmlPullParserException xmlpullparserexception)
	//*  11   22:astore_1        
		{
			throw new RuntimeException("Couldn't create XmlPullParserFactory instance", ((Throwable) (xmlpullparserexception)));
	//   12   23:new             #107 <Class RuntimeException>
	//   13   26:dup             
	//   14   27:ldc1            #109 <String "Couldn't create XmlPullParserFactory instance">
	//   15   29:aload_1         
	//   16   30:invokespecial   #112 <Method void RuntimeException(String, Throwable)>
	//   17   33:athrow          
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
	//    4    6:new             #116 <Class TtmlStyle>
	//    5    9:dup             
	//    6   10:invokespecial   #118 <Method void TtmlStyle()>
	//    7   13:astore_2        
		return ttmlstyle1;
	//    8   14:aload_2         
	//    9   15:areturn         
	}

	private static boolean isSupportedTag(String s)
	{
		return s.equals("tt") || s.equals("head") || s.equals("body") || s.equals("div") || s.equals("p") || s.equals("span") || s.equals("br") || s.equals("style") || s.equals("styling") || s.equals("layout") || s.equals("region") || s.equals("metadata") || s.equals("smpte:image") || s.equals("smpte:data") || s.equals("smpte:information");
	//    0    0:aload_0         
	//    1    1:ldc1            #122 <String "tt">
	//    2    3:invokevirtual   #128 <Method boolean String.equals(Object)>
	//    3    6:ifne            140
	//    4    9:aload_0         
	//    5   10:ldc1            #130 <String "head">
	//    6   12:invokevirtual   #128 <Method boolean String.equals(Object)>
	//    7   15:ifne            140
	//    8   18:aload_0         
	//    9   19:ldc1            #132 <String "body">
	//   10   21:invokevirtual   #128 <Method boolean String.equals(Object)>
	//   11   24:ifne            140
	//   12   27:aload_0         
	//   13   28:ldc1            #134 <String "div">
	//   14   30:invokevirtual   #128 <Method boolean String.equals(Object)>
	//   15   33:ifne            140
	//   16   36:aload_0         
	//   17   37:ldc1            #136 <String "p">
	//   18   39:invokevirtual   #128 <Method boolean String.equals(Object)>
	//   19   42:ifne            140
	//   20   45:aload_0         
	//   21   46:ldc1            #138 <String "span">
	//   22   48:invokevirtual   #128 <Method boolean String.equals(Object)>
	//   23   51:ifne            140
	//   24   54:aload_0         
	//   25   55:ldc1            #140 <String "br">
	//   26   57:invokevirtual   #128 <Method boolean String.equals(Object)>
	//   27   60:ifne            140
	//   28   63:aload_0         
	//   29   64:ldc1            #26  <String "style">
	//   30   66:invokevirtual   #128 <Method boolean String.equals(Object)>
	//   31   69:ifne            140
	//   32   72:aload_0         
	//   33   73:ldc1            #142 <String "styling">
	//   34   75:invokevirtual   #128 <Method boolean String.equals(Object)>
	//   35   78:ifne            140
	//   36   81:aload_0         
	//   37   82:ldc1            #144 <String "layout">
	//   38   84:invokevirtual   #128 <Method boolean String.equals(Object)>
	//   39   87:ifne            140
	//   40   90:aload_0         
	//   41   91:ldc1            #23  <String "region">
	//   42   93:invokevirtual   #128 <Method boolean String.equals(Object)>
	//   43   96:ifne            140
	//   44   99:aload_0         
	//   45  100:ldc1            #146 <String "metadata">
	//   46  102:invokevirtual   #128 <Method boolean String.equals(Object)>
	//   47  105:ifne            140
	//   48  108:aload_0         
	//   49  109:ldc1            #148 <String "smpte:image">
	//   50  111:invokevirtual   #128 <Method boolean String.equals(Object)>
	//   51  114:ifne            140
	//   52  117:aload_0         
	//   53  118:ldc1            #150 <String "smpte:data">
	//   54  120:invokevirtual   #128 <Method boolean String.equals(Object)>
	//   55  123:ifne            140
	//   56  126:aload_0         
	//   57  127:ldc1            #152 <String "smpte:information">
	//   58  129:invokevirtual   #128 <Method boolean String.equals(Object)>
	//   59  132:ifeq            138
	//   60  135:goto            140
	//   61  138:iconst_0        
	//   62  139:ireturn         
	//   63  140:iconst_1        
	//   64  141:ireturn         
	}

	private CellResolution parseCellResolution(XmlPullParser xmlpullparser, CellResolution cellresolution)
		throws SubtitleDecoderException
	{
		xmlpullparser = ((XmlPullParser) (xmlpullparser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "cellResolution")));
	//    0    0:aload_1         
	//    1    1:ldc1            #45  <String "http://www.w3.org/ns/ttml#parameter">
	//    2    3:ldc1            #160 <String "cellResolution">
	//    3    5:invokeinterface #166 <Method String XmlPullParser.getAttributeValue(String, String)>
	//    4   10:astore_1        
		if(xmlpullparser == null)
	//*   5   11:aload_1         
	//*   6   12:ifnonnull       17
			return cellresolution;
	//    7   15:aload_2         
	//    8   16:areturn         
		Object obj = ((Object) (CELL_RESOLUTION.matcher(((CharSequence) (xmlpullparser)))));
	//    9   17:getstatic       #75  <Field Pattern CELL_RESOLUTION>
	//   10   20:aload_1         
	//   11   21:invokevirtual   #170 <Method Matcher Pattern.matcher(CharSequence)>
	//   12   24:astore          5
		if(!((Matcher) (obj)).matches())
	//*  13   26:aload           5
	//*  14   28:invokevirtual   #176 <Method boolean Matcher.matches()>
	//*  15   31:ifne            71
		{
			obj = ((Object) (new StringBuilder()));
	//   16   34:new             #178 <Class StringBuilder>
	//   17   37:dup             
	//   18   38:invokespecial   #179 <Method void StringBuilder()>
	//   19   41:astore          5
			((StringBuilder) (obj)).append("Ignoring malformed cell resolution: ");
	//   20   43:aload           5
	//   21   45:ldc1            #181 <String "Ignoring malformed cell resolution: ">
	//   22   47:invokevirtual   #185 <Method StringBuilder StringBuilder.append(String)>
	//   23   50:pop             
			((StringBuilder) (obj)).append(((String) (xmlpullparser)));
	//   24   51:aload           5
	//   25   53:aload_1         
	//   26   54:invokevirtual   #185 <Method StringBuilder StringBuilder.append(String)>
	//   27   57:pop             
			Log.w("TtmlDecoder", ((StringBuilder) (obj)).toString());
	//   28   58:ldc1            #42  <String "TtmlDecoder">
	//   29   60:aload           5
	//   30   62:invokevirtual   #189 <Method String StringBuilder.toString()>
	//   31   65:invokestatic    #195 <Method int Log.w(String, String)>
	//   32   68:pop             
			return cellresolution;
	//   33   69:aload_2         
	//   34   70:areturn         
		}
		int i;
		int j;
		try
		{
			i = Integer.parseInt(((Matcher) (obj)).group(1));
	//   35   71:aload           5
	//   36   73:iconst_1        
	//   37   74:invokevirtual   #199 <Method String Matcher.group(int)>
	//   38   77:invokestatic    #205 <Method int Integer.parseInt(String)>
	//   39   80:istore_3        
			j = Integer.parseInt(((Matcher) (obj)).group(2));
	//   40   81:aload           5
	//   41   83:iconst_2        
	//   42   84:invokevirtual   #199 <Method String Matcher.group(int)>
	//   43   87:invokestatic    #205 <Method int Integer.parseInt(String)>
	//   44   90:istore          4
		}
	//*  45   92:iload_3         
	//*  46   93:ifeq            115
	//*  47   96:iload           4
	//*  48   98:ifne            104
	//*  49  101:goto            115
	//*  50  104:new             #6   <Class TtmlDecoder$CellResolution>
	//*  51  107:dup             
	//*  52  108:iload_3         
	//*  53  109:iload           4
	//*  54  111:invokespecial   #85  <Method void TtmlDecoder$CellResolution(int, int)>
	//*  55  114:areturn         
	//*  56  115:new             #178 <Class StringBuilder>
	//*  57  118:dup             
	//*  58  119:invokespecial   #179 <Method void StringBuilder()>
	//*  59  122:astore          5
	//*  60  124:aload           5
	//*  61  126:ldc1            #207 <String "Invalid cell resolution ">
	//*  62  128:invokevirtual   #185 <Method StringBuilder StringBuilder.append(String)>
	//*  63  131:pop             
	//*  64  132:aload           5
	//*  65  134:iload_3         
	//*  66  135:invokevirtual   #210 <Method StringBuilder StringBuilder.append(int)>
	//*  67  138:pop             
	//*  68  139:aload           5
	//*  69  141:ldc1            #212 <String " ">
	//*  70  143:invokevirtual   #185 <Method StringBuilder StringBuilder.append(String)>
	//*  71  146:pop             
	//*  72  147:aload           5
	//*  73  149:iload           4
	//*  74  151:invokevirtual   #210 <Method StringBuilder StringBuilder.append(int)>
	//*  75  154:pop             
	//*  76  155:new             #156 <Class SubtitleDecoderException>
	//*  77  158:dup             
	//*  78  159:aload           5
	//*  79  161:invokevirtual   #189 <Method String StringBuilder.toString()>
	//*  80  164:invokespecial   #213 <Method void SubtitleDecoderException(String)>
	//*  81  167:athrow          
	//*  82  168:new             #178 <Class StringBuilder>
	//*  83  171:dup             
	//*  84  172:invokespecial   #179 <Method void StringBuilder()>
	//*  85  175:astore          5
	//*  86  177:aload           5
	//*  87  179:ldc1            #181 <String "Ignoring malformed cell resolution: ">
	//*  88  181:invokevirtual   #185 <Method StringBuilder StringBuilder.append(String)>
	//*  89  184:pop             
	//*  90  185:aload           5
	//*  91  187:aload_1         
	//*  92  188:invokevirtual   #185 <Method StringBuilder StringBuilder.append(String)>
	//*  93  191:pop             
	//*  94  192:ldc1            #42  <String "TtmlDecoder">
	//*  95  194:aload           5
	//*  96  196:invokevirtual   #189 <Method String StringBuilder.toString()>
	//*  97  199:invokestatic    #195 <Method int Log.w(String, String)>
	//*  98  202:pop             
	//*  99  203:aload_2         
	//* 100  204:areturn         
		// Misplaced declaration of an exception variable
		catch(NumberFormatException numberformatexception)
		{
			obj = ((Object) (new StringBuilder()));
			((StringBuilder) (obj)).append("Ignoring malformed cell resolution: ");
			((StringBuilder) (obj)).append(((String) (xmlpullparser)));
			Log.w("TtmlDecoder", ((StringBuilder) (obj)).toString());
			return cellresolution;
		}
		if(i == 0 || j == 0)
			break MISSING_BLOCK_LABEL_115;
		return new CellResolution(i, j);
		NumberFormatException numberformatexception;
		obj = ((Object) (new StringBuilder()));
		((StringBuilder) (obj)).append("Invalid cell resolution ");
		((StringBuilder) (obj)).append(i);
		((StringBuilder) (obj)).append(" ");
		((StringBuilder) (obj)).append(j);
		throw new SubtitleDecoderException(((StringBuilder) (obj)).toString());
	//* 101  205:astore          5
	//* 102  207:goto            168
	}

	private static void parseFontSize(String s, TtmlStyle ttmlstyle)
		throws SubtitleDecoderException
	{
		Object obj;
label0:
		{
			obj = ((Object) (Util.split(s, "\\s+")));
	//    0    0:aload_0         
	//    1    1:ldc1            #218 <String "\\s+">
	//    2    3:invokestatic    #224 <Method String[] Util.split(String, String)>
	//    3    6:astore          4
			if(obj.length == 1)
	//*   4    8:aload           4
	//*   5   10:arraylength     
	//*   6   11:iconst_1        
	//*   7   12:icmpne          27
			{
				obj = ((Object) (FONT_SIZE.matcher(((CharSequence) (s)))));
	//    8   15:getstatic       #67  <Field Pattern FONT_SIZE>
	//    9   18:aload_0         
	//   10   19:invokevirtual   #170 <Method Matcher Pattern.matcher(CharSequence)>
	//   11   22:astore          4
			} else
	//*  12   24:goto            54
			{
				if(obj.length != 2)
					break label0;
	//   13   27:aload           4
	//   14   29:arraylength     
	//   15   30:iconst_2        
	//   16   31:icmpne          287
				obj = ((Object) (FONT_SIZE.matcher(((CharSequence) (obj[1])))));
	//   17   34:getstatic       #67  <Field Pattern FONT_SIZE>
	//   18   37:aload           4
	//   19   39:iconst_1        
	//   20   40:aaload          
	//   21   41:invokevirtual   #170 <Method Matcher Pattern.matcher(CharSequence)>
	//   22   44:astore          4
				Log.w("TtmlDecoder", "Multiple values in fontSize attribute. Picking the second value for vertical font size and ignoring the first.");
	//   23   46:ldc1            #42  <String "TtmlDecoder">
	//   24   48:ldc1            #226 <String "Multiple values in fontSize attribute. Picking the second value for vertical font size and ignoring the first.">
	//   25   50:invokestatic    #195 <Method int Log.w(String, String)>
	//   26   53:pop             
			}
			if(((Matcher) (obj)).matches())
	//*  27   54:aload           4
	//*  28   56:invokevirtual   #176 <Method boolean Matcher.matches()>
	//*  29   59:ifeq            246
			{
				s = ((Matcher) (obj)).group(3);
	//   30   62:aload           4
	//   31   64:iconst_3        
	//   32   65:invokevirtual   #199 <Method String Matcher.group(int)>
	//   33   68:astore_0        
				byte byte0 = -1;
	//   34   69:iconst_m1       
	//   35   70:istore_2        
				int i = s.hashCode();
	//   36   71:aload_0         
	//   37   72:invokevirtual   #230 <Method int String.hashCode()>
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
	//*  50  100:ldc1            #232 <String "px">
	//*  51  102:invokevirtual   #128 <Method boolean String.equals(Object)>
	//*  52  105:ifeq            138
							byte0 = 0;
	//   53  108:iconst_0        
	//   54  109:istore_2        
					} else
	//*  55  110:goto            138
					if(s.equals("em"))
	//*  56  113:aload_0         
	//*  57  114:ldc1            #234 <String "em">
	//*  58  116:invokevirtual   #128 <Method boolean String.equals(Object)>
	//*  59  119:ifeq            138
						byte0 = 1;
	//   60  122:iconst_1        
	//   61  123:istore_2        
				} else
	//*  62  124:goto            138
				if(s.equals("%"))
	//*  63  127:aload_0         
	//*  64  128:ldc1            #236 <String "%">
	//*  65  130:invokevirtual   #128 <Method boolean String.equals(Object)>
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
	//   71  164:new             #178 <Class StringBuilder>
	//   72  167:dup             
	//   73  168:invokespecial   #179 <Method void StringBuilder()>
	//   74  171:astore_1        
					((StringBuilder) (ttmlstyle)).append("Invalid unit for fontSize: '");
	//   75  172:aload_1         
	//   76  173:ldc1            #238 <String "Invalid unit for fontSize: '">
	//   77  175:invokevirtual   #185 <Method StringBuilder StringBuilder.append(String)>
	//   78  178:pop             
					((StringBuilder) (ttmlstyle)).append(s);
	//   79  179:aload_1         
	//   80  180:aload_0         
	//   81  181:invokevirtual   #185 <Method StringBuilder StringBuilder.append(String)>
	//   82  184:pop             
					((StringBuilder) (ttmlstyle)).append("'.");
	//   83  185:aload_1         
	//   84  186:ldc1            #240 <String "'.">
	//   85  188:invokevirtual   #185 <Method StringBuilder StringBuilder.append(String)>
	//   86  191:pop             
					throw new SubtitleDecoderException(((StringBuilder) (ttmlstyle)).toString());
	//   87  192:new             #156 <Class SubtitleDecoderException>
	//   88  195:dup             
	//   89  196:aload_1         
	//   90  197:invokevirtual   #189 <Method String StringBuilder.toString()>
	//   91  200:invokespecial   #213 <Method void SubtitleDecoderException(String)>
	//   92  203:athrow          

				case 2: // '\002'
					ttmlstyle.setFontSizeUnit(3);
	//   93  204:aload_1         
	//   94  205:iconst_3        
	//   95  206:invokevirtual   #244 <Method TtmlStyle TtmlStyle.setFontSizeUnit(int)>
	//   96  209:pop             
					break;

	//*  97  210:goto            228
				case 1: // '\001'
					ttmlstyle.setFontSizeUnit(2);
	//   98  213:aload_1         
	//   99  214:iconst_2        
	//  100  215:invokevirtual   #244 <Method TtmlStyle TtmlStyle.setFontSizeUnit(int)>
	//  101  218:pop             
					break;

	//* 102  219:goto            228
				case 0: // '\0'
					ttmlstyle.setFontSizeUnit(1);
	//  103  222:aload_1         
	//  104  223:iconst_1        
	//  105  224:invokevirtual   #244 <Method TtmlStyle TtmlStyle.setFontSizeUnit(int)>
	//  106  227:pop             
					break;
				}
				ttmlstyle.setFontSize(Float.valueOf(((Matcher) (obj)).group(1)).floatValue());
	//  107  228:aload_1         
	//  108  229:aload           4
	//  109  231:iconst_1        
	//  110  232:invokevirtual   #199 <Method String Matcher.group(int)>
	//  111  235:invokestatic    #250 <Method Float Float.valueOf(String)>
	//  112  238:invokevirtual   #254 <Method float Float.floatValue()>
	//  113  241:invokevirtual   #258 <Method TtmlStyle TtmlStyle.setFontSize(float)>
	//  114  244:pop             
				return;
	//  115  245:return          
			} else
			{
				ttmlstyle = ((TtmlStyle) (new StringBuilder()));
	//  116  246:new             #178 <Class StringBuilder>
	//  117  249:dup             
	//  118  250:invokespecial   #179 <Method void StringBuilder()>
	//  119  253:astore_1        
				((StringBuilder) (ttmlstyle)).append("Invalid expression for fontSize: '");
	//  120  254:aload_1         
	//  121  255:ldc2            #260 <String "Invalid expression for fontSize: '">
	//  122  258:invokevirtual   #185 <Method StringBuilder StringBuilder.append(String)>
	//  123  261:pop             
				((StringBuilder) (ttmlstyle)).append(s);
	//  124  262:aload_1         
	//  125  263:aload_0         
	//  126  264:invokevirtual   #185 <Method StringBuilder StringBuilder.append(String)>
	//  127  267:pop             
				((StringBuilder) (ttmlstyle)).append("'.");
	//  128  268:aload_1         
	//  129  269:ldc1            #240 <String "'.">
	//  130  271:invokevirtual   #185 <Method StringBuilder StringBuilder.append(String)>
	//  131  274:pop             
				throw new SubtitleDecoderException(((StringBuilder) (ttmlstyle)).toString());
	//  132  275:new             #156 <Class SubtitleDecoderException>
	//  133  278:dup             
	//  134  279:aload_1         
	//  135  280:invokevirtual   #189 <Method String StringBuilder.toString()>
	//  136  283:invokespecial   #213 <Method void SubtitleDecoderException(String)>
	//  137  286:athrow          
			}
		}
		s = ((String) (new StringBuilder()));
	//  138  287:new             #178 <Class StringBuilder>
	//  139  290:dup             
	//  140  291:invokespecial   #179 <Method void StringBuilder()>
	//  141  294:astore_0        
		((StringBuilder) (s)).append("Invalid number of entries for fontSize: ");
	//  142  295:aload_0         
	//  143  296:ldc2            #262 <String "Invalid number of entries for fontSize: ">
	//  144  299:invokevirtual   #185 <Method StringBuilder StringBuilder.append(String)>
	//  145  302:pop             
		((StringBuilder) (s)).append(obj.length);
	//  146  303:aload_0         
	//  147  304:aload           4
	//  148  306:arraylength     
	//  149  307:invokevirtual   #210 <Method StringBuilder StringBuilder.append(int)>
	//  150  310:pop             
		((StringBuilder) (s)).append(".");
	//  151  311:aload_0         
	//  152  312:ldc2            #264 <String ".">
	//  153  315:invokevirtual   #185 <Method StringBuilder StringBuilder.append(String)>
	//  154  318:pop             
		throw new SubtitleDecoderException(((StringBuilder) (s)).toString());
	//  155  319:new             #156 <Class SubtitleDecoderException>
	//  156  322:dup             
	//  157  323:aload_0         
	//  158  324:invokevirtual   #189 <Method String StringBuilder.toString()>
	//  159  327:invokespecial   #213 <Method void SubtitleDecoderException(String)>
	//  160  330:athrow          
	}

	private FrameAndTickRate parseFrameAndTickRates(XmlPullParser xmlpullparser)
		throws SubtitleDecoderException
	{
		String s = xmlpullparser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRate");
	//    0    0:aload_1         
	//    1    1:ldc1            #45  <String "http://www.w3.org/ns/ttml#parameter">
	//    2    3:ldc2            #268 <String "frameRate">
	//    3    6:invokeinterface #166 <Method String XmlPullParser.getAttributeValue(String, String)>
	//    4   11:astore          6
		int i;
		if(s != null)
	//*   5   13:aload           6
	//*   6   15:ifnull          27
			i = Integer.parseInt(s);
	//    7   18:aload           6
	//    8   20:invokestatic    #205 <Method int Integer.parseInt(String)>
	//    9   23:istore_3        
		else
	//*  10   24:goto            30
			i = 30;
	//   11   27:bipush          30
	//   12   29:istore_3        
		float f = 1.0F;
	//   13   30:fconst_1        
	//   14   31:fstore_2        
		s = xmlpullparser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRateMultiplier");
	//   15   32:aload_1         
	//   16   33:ldc1            #45  <String "http://www.w3.org/ns/ttml#parameter">
	//   17   35:ldc2            #270 <String "frameRateMultiplier">
	//   18   38:invokeinterface #166 <Method String XmlPullParser.getAttributeValue(String, String)>
	//   19   43:astore          6
		if(s != null)
	//*  20   45:aload           6
	//*  21   47:ifnull          95
		{
			String as[] = Util.split(s, " ");
	//   22   50:aload           6
	//   23   52:ldc1            #212 <String " ">
	//   24   54:invokestatic    #224 <Method String[] Util.split(String, String)>
	//   25   57:astore          6
			if(as.length != 2)
	//*  26   59:aload           6
	//*  27   61:arraylength     
	//*  28   62:iconst_2        
	//*  29   63:icmpeq          77
				throw new SubtitleDecoderException("frameRateMultiplier doesn't have 2 parts");
	//   30   66:new             #156 <Class SubtitleDecoderException>
	//   31   69:dup             
	//   32   70:ldc2            #272 <String "frameRateMultiplier doesn't have 2 parts">
	//   33   73:invokespecial   #213 <Method void SubtitleDecoderException(String)>
	//   34   76:athrow          
			f = (float)Integer.parseInt(as[0]) / (float)Integer.parseInt(as[1]);
	//   35   77:aload           6
	//   36   79:iconst_0        
	//   37   80:aaload          
	//   38   81:invokestatic    #205 <Method int Integer.parseInt(String)>
	//   39   84:i2f             
	//   40   85:aload           6
	//   41   87:iconst_1        
	//   42   88:aaload          
	//   43   89:invokestatic    #205 <Method int Integer.parseInt(String)>
	//   44   92:i2f             
	//   45   93:fdiv            
	//   46   94:fstore_2        
		}
		int j = DEFAULT_FRAME_AND_TICK_RATE.subFrameRate;
	//   47   95:getstatic       #82  <Field TtmlDecoder$FrameAndTickRate DEFAULT_FRAME_AND_TICK_RATE>
	//   48   98:getfield        #275 <Field int TtmlDecoder$FrameAndTickRate.subFrameRate>
	//   49  101:istore          4
		as = ((String []) (xmlpullparser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "subFrameRate")));
	//   50  103:aload_1         
	//   51  104:ldc1            #45  <String "http://www.w3.org/ns/ttml#parameter">
	//   52  106:ldc2            #276 <String "subFrameRate">
	//   53  109:invokeinterface #166 <Method String XmlPullParser.getAttributeValue(String, String)>
	//   54  114:astore          6
		if(as != null)
	//*  55  116:aload           6
	//*  56  118:ifnull          128
			j = Integer.parseInt(((String) (as)));
	//   57  121:aload           6
	//   58  123:invokestatic    #205 <Method int Integer.parseInt(String)>
	//   59  126:istore          4
		int k = DEFAULT_FRAME_AND_TICK_RATE.tickRate;
	//   60  128:getstatic       #82  <Field TtmlDecoder$FrameAndTickRate DEFAULT_FRAME_AND_TICK_RATE>
	//   61  131:getfield        #279 <Field int TtmlDecoder$FrameAndTickRate.tickRate>
	//   62  134:istore          5
		xmlpullparser = ((XmlPullParser) (xmlpullparser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "tickRate")));
	//   63  136:aload_1         
	//   64  137:ldc1            #45  <String "http://www.w3.org/ns/ttml#parameter">
	//   65  139:ldc2            #280 <String "tickRate">
	//   66  142:invokeinterface #166 <Method String XmlPullParser.getAttributeValue(String, String)>
	//   67  147:astore_1        
		if(xmlpullparser != null)
	//*  68  148:aload_1         
	//*  69  149:ifnull          158
			k = Integer.parseInt(((String) (xmlpullparser)));
	//   70  152:aload_1         
	//   71  153:invokestatic    #205 <Method int Integer.parseInt(String)>
	//   72  156:istore          5
		return new FrameAndTickRate((float)i * f, j, k);
	//   73  158:new             #9   <Class TtmlDecoder$FrameAndTickRate>
	//   74  161:dup             
	//   75  162:iload_3         
	//   76  163:i2f             
	//   77  164:fload_2         
	//   78  165:fmul            
	//   79  166:iload           4
	//   80  168:iload           5
	//   81  170:invokespecial   #80  <Method void TtmlDecoder$FrameAndTickRate(float, int, int)>
	//   82  173:areturn         
	}

	private Map parseHeader(XmlPullParser xmlpullparser, Map map, Map map1, CellResolution cellresolution)
		throws IOException, XmlPullParserException
	{
		do
		{
			xmlpullparser.next();
	//    0    0:aload_1         
	//    1    1:invokeinterface #287 <Method int XmlPullParser.next()>
	//    2    6:pop             
			if(XmlPullParserUtil.isStartTag(xmlpullparser, "style"))
	//*   3    7:aload_1         
	//*   4    8:ldc1            #26  <String "style">
	//*   5   10:invokestatic    #293 <Method boolean XmlPullParserUtil.isStartTag(XmlPullParser, String)>
	//*   6   13:ifeq            120
			{
				String s = XmlPullParserUtil.getAttributeValue(xmlpullparser, "style");
	//    7   16:aload_1         
	//    8   17:ldc1            #26  <String "style">
	//    9   19:invokestatic    #296 <Method String XmlPullParserUtil.getAttributeValue(XmlPullParser, String)>
	//   10   22:astore          8
				TtmlStyle ttmlstyle = parseStyleAttributes(xmlpullparser, new TtmlStyle());
	//   11   24:aload_0         
	//   12   25:aload_1         
	//   13   26:new             #116 <Class TtmlStyle>
	//   14   29:dup             
	//   15   30:invokespecial   #118 <Method void TtmlStyle()>
	//   16   33:invokespecial   #300 <Method TtmlStyle parseStyleAttributes(XmlPullParser, TtmlStyle)>
	//   17   36:astore          7
				if(s != null)
	//*  18   38:aload           8
	//*  19   40:ifnull          95
				{
					String as[] = parseStyleIds(s);
	//   20   43:aload_0         
	//   21   44:aload           8
	//   22   46:invokespecial   #304 <Method String[] parseStyleIds(String)>
	//   23   49:astore          8
					int j = as.length;
	//   24   51:aload           8
	//   25   53:arraylength     
	//   26   54:istore          6
					for(int i = 0; i < j; i++)
	//*  27   56:iconst_0        
	//*  28   57:istore          5
	//*  29   59:iload           5
	//*  30   61:iload           6
	//*  31   63:icmpge          95
						ttmlstyle.chain((TtmlStyle)map.get(((Object) (as[i]))));
	//   32   66:aload           7
	//   33   68:aload_2         
	//   34   69:aload           8
	//   35   71:iload           5
	//   36   73:aaload          
	//   37   74:invokeinterface #310 <Method Object Map.get(Object)>
	//   38   79:checkcast       #116 <Class TtmlStyle>
	//   39   82:invokevirtual   #313 <Method TtmlStyle TtmlStyle.chain(TtmlStyle)>
	//   40   85:pop             

	//   41   86:iload           5
	//   42   88:iconst_1        
	//   43   89:iadd            
	//   44   90:istore          5
				}
	//*  45   92:goto            59
				if(ttmlstyle.getId() != null)
	//*  46   95:aload           7
	//*  47   97:invokevirtual   #316 <Method String TtmlStyle.getId()>
	//*  48  100:ifnull          157
					map.put(((Object) (ttmlstyle.getId())), ((Object) (ttmlstyle)));
	//   49  103:aload_2         
	//   50  104:aload           7
	//   51  106:invokevirtual   #316 <Method String TtmlStyle.getId()>
	//   52  109:aload           7
	//   53  111:invokeinterface #320 <Method Object Map.put(Object, Object)>
	//   54  116:pop             
			} else
	//*  55  117:goto            157
			if(XmlPullParserUtil.isStartTag(xmlpullparser, "region"))
	//*  56  120:aload_1         
	//*  57  121:ldc1            #23  <String "region">
	//*  58  123:invokestatic    #293 <Method boolean XmlPullParserUtil.isStartTag(XmlPullParser, String)>
	//*  59  126:ifeq            157
			{
				TtmlRegion ttmlregion = parseRegionAttributes(xmlpullparser, cellresolution);
	//   60  129:aload_0         
	//   61  130:aload_1         
	//   62  131:aload           4
	//   63  133:invokespecial   #324 <Method TtmlRegion parseRegionAttributes(XmlPullParser, TtmlDecoder$CellResolution)>
	//   64  136:astore          7
				if(ttmlregion != null)
	//*  65  138:aload           7
	//*  66  140:ifnull          157
					map1.put(((Object) (ttmlregion.id)), ((Object) (ttmlregion)));
	//   67  143:aload_3         
	//   68  144:aload           7
	//   69  146:getfield        #329 <Field String TtmlRegion.id>
	//   70  149:aload           7
	//   71  151:invokeinterface #320 <Method Object Map.put(Object, Object)>
	//   72  156:pop             
			}
		} while(!XmlPullParserUtil.isEndTag(xmlpullparser, "head"));
	//   73  157:aload_1         
	//   74  158:ldc1            #130 <String "head">
	//   75  160:invokestatic    #332 <Method boolean XmlPullParserUtil.isEndTag(XmlPullParser, String)>
	//   76  163:ifeq            0
		return map;
	//   77  166:aload_2         
	//   78  167:areturn         
	}

	private TtmlNode parseNode(XmlPullParser xmlpullparser, TtmlNode ttmlnode, Map map, FrameAndTickRate frameandtickrate)
		throws SubtitleDecoderException
	{
		int j = xmlpullparser.getAttributeCount();
	//    0    0:aload_1         
	//    1    1:invokeinterface #339 <Method int XmlPullParser.getAttributeCount()>
	//    2    6:istore          7
		TtmlStyle ttmlstyle = parseStyleAttributes(xmlpullparser, ((TtmlStyle) (null)));
	//    3    8:aload_0         
	//    4    9:aload_1         
	//    5   10:aconst_null     
	//    6   11:invokespecial   #300 <Method TtmlStyle parseStyleAttributes(XmlPullParser, TtmlStyle)>
	//    7   14:astore          25
		String as[] = null;
	//    8   16:aconst_null     
	//    9   17:astore          20
		long l = 0x1L;
	//   10   19:ldc2w           #340 <Long 0x1L>
	//   11   22:lstore          8
		long l1 = 0x1L;
	//   12   24:ldc2w           #340 <Long 0x1L>
	//   13   27:lstore          10
		long l6 = 0x1L;
	//   14   29:ldc2w           #340 <Long 0x1L>
	//   15   32:lstore          16
		Object obj = "";
	//   16   34:ldc2            #343 <String "">
	//   17   37:astore          21
		for(int i = 0; i < j;)
	//*  18   39:iconst_0        
	//*  19   40:istore          6
	//*  20   42:iload           6
	//*  21   44:iload           7
	//*  22   46:icmpge          492
		{
			byte byte0;
			Object obj3;
label0:
			{
				String s = xmlpullparser.getAttributeName(i);
	//   23   49:aload_1         
	//   24   50:iload           6
	//   25   52:invokeinterface #346 <Method String XmlPullParser.getAttributeName(int)>
	//   26   57:astore          22
				obj3 = ((Object) (xmlpullparser.getAttributeValue(i)));
	//   27   59:aload_1         
	//   28   60:iload           6
	//   29   62:invokeinterface #348 <Method String XmlPullParser.getAttributeValue(int)>
	//   30   67:astore          24
				switch(s.hashCode())
	//*  31   69:aload           22
	//*  32   71:invokevirtual   #230 <Method int String.hashCode()>
				{
				default:
					break;

	//*  33   74:lookupswitch    5: default 124
	//	               -934795532: 191
	//	               99841: 175
	//	               100571: 159
	//	               93616297: 143
	//	               109780401: 127
	//*  34  124:goto            207
				case 109780401: 
					if(s.equals("style"))
	//*  35  127:aload           22
	//*  36  129:ldc1            #26  <String "style">
	//*  37  131:invokevirtual   #128 <Method boolean String.equals(Object)>
	//*  38  134:ifeq            207
					{
						byte0 = 3;
	//   39  137:iconst_3        
	//   40  138:istore          5
						break label0;
	//   41  140:goto            210
					}
					break;

				case 93616297: 
					if(!s.equals("begin"))
						break;
	//   42  143:aload           22
	//   43  145:ldc1            #14  <String "begin">
	//   44  147:invokevirtual   #128 <Method boolean String.equals(Object)>
	//   45  150:ifeq            207
					byte0 = 0;
	//   46  153:iconst_0        
	//   47  154:istore          5
					break label0;
	//   48  156:goto            210

				case 100571: 
					if(!s.equals("end"))
						break;
	//   49  159:aload           22
	//   50  161:ldc1            #20  <String "end">
	//   51  163:invokevirtual   #128 <Method boolean String.equals(Object)>
	//   52  166:ifeq            207
					byte0 = 1;
	//   53  169:iconst_1        
	//   54  170:istore          5
					break label0;
	//   55  172:goto            210

				case 99841: 
					if(!s.equals("dur"))
						break;
	//   56  175:aload           22
	//   57  177:ldc1            #17  <String "dur">
	//   58  179:invokevirtual   #128 <Method boolean String.equals(Object)>
	//   59  182:ifeq            207
					byte0 = 2;
	//   60  185:iconst_2        
	//   61  186:istore          5
					break label0;
	//   62  188:goto            210

				case -934795532: 
					if(!s.equals("region"))
						break;
	//   63  191:aload           22
	//   64  193:ldc1            #23  <String "region">
	//   65  195:invokevirtual   #128 <Method boolean String.equals(Object)>
	//   66  198:ifeq            207
					byte0 = 4;
	//   67  201:iconst_4        
	//   68  202:istore          5
					break label0;
	//   69  204:goto            210
				}
				byte0 = -1;
	//   70  207:iconst_m1       
	//   71  208:istore          5
			}
			long l2;
			long l4;
			long l7;
			Object obj1;
			Object obj2;
			switch(byte0)
	//*  72  210:iload           5
			{
	//*  73  212:tableswitch     0 4: default 248
	//	               0 438
	//	               1 410
	//	               2 382
	//	               3 325
	//	               4 271
			default:
				obj1 = obj;
	//   74  248:aload           21
	//   75  250:astore          22
				l2 = l;
	//   76  252:lload           8
	//   77  254:lstore          12
				l4 = l1;
	//   78  256:lload           10
	//   79  258:lstore          14
				l7 = l6;
	//   80  260:lload           16
	//   81  262:lstore          18
				obj2 = ((Object) (as));
	//   82  264:aload           20
	//   83  266:astore          23
				break;
	//   84  268:goto            463

			case 4: // '\004'
				obj1 = obj;
	//   85  271:aload           21
	//   86  273:astore          22
				l2 = l;
	//   87  275:lload           8
	//   88  277:lstore          12
				l4 = l1;
	//   89  279:lload           10
	//   90  281:lstore          14
				l7 = l6;
	//   91  283:lload           16
	//   92  285:lstore          18
				obj2 = ((Object) (as));
	//   93  287:aload           20
	//   94  289:astore          23
				if(map.containsKey(obj3))
	//*  95  291:aload_3         
	//*  96  292:aload           24
	//*  97  294:invokeinterface #351 <Method boolean Map.containsKey(Object)>
	//*  98  299:ifeq            463
				{
					obj1 = obj3;
	//   99  302:aload           24
	//  100  304:astore          22
					l2 = l;
	//  101  306:lload           8
	//  102  308:lstore          12
					l4 = l1;
	//  103  310:lload           10
	//  104  312:lstore          14
					l7 = l6;
	//  105  314:lload           16
	//  106  316:lstore          18
					obj2 = ((Object) (as));
	//  107  318:aload           20
	//  108  320:astore          23
				}
				break;
	//  109  322:goto            463

			case 3: // '\003'
				obj3 = ((Object) (parseStyleIds(((String) (obj3)))));
	//  110  325:aload_0         
	//  111  326:aload           24
	//  112  328:invokespecial   #304 <Method String[] parseStyleIds(String)>
	//  113  331:astore          24
				obj1 = obj;
	//  114  333:aload           21
	//  115  335:astore          22
				l2 = l;
	//  116  337:lload           8
	//  117  339:lstore          12
				l4 = l1;
	//  118  341:lload           10
	//  119  343:lstore          14
				l7 = l6;
	//  120  345:lload           16
	//  121  347:lstore          18
				obj2 = ((Object) (as));
	//  122  349:aload           20
	//  123  351:astore          23
				if(obj3.length > 0)
	//* 124  353:aload           24
	//* 125  355:arraylength     
	//* 126  356:ifle            463
				{
					obj2 = obj3;
	//  127  359:aload           24
	//  128  361:astore          23
					obj1 = obj;
	//  129  363:aload           21
	//  130  365:astore          22
					l2 = l;
	//  131  367:lload           8
	//  132  369:lstore          12
					l4 = l1;
	//  133  371:lload           10
	//  134  373:lstore          14
					l7 = l6;
	//  135  375:lload           16
	//  136  377:lstore          18
				}
				break;

	//* 137  379:goto            463
			case 2: // '\002'
				l7 = parseTimeExpression(((String) (obj3)), frameandtickrate);
	//  138  382:aload           24
	//  139  384:aload           4
	//  140  386:invokestatic    #355 <Method long parseTimeExpression(String, TtmlDecoder$FrameAndTickRate)>
	//  141  389:lstore          18
				obj1 = obj;
	//  142  391:aload           21
	//  143  393:astore          22
				l2 = l;
	//  144  395:lload           8
	//  145  397:lstore          12
				l4 = l1;
	//  146  399:lload           10
	//  147  401:lstore          14
				obj2 = ((Object) (as));
	//  148  403:aload           20
	//  149  405:astore          23
				break;

	//* 150  407:goto            463
			case 1: // '\001'
				l4 = parseTimeExpression(((String) (obj3)), frameandtickrate);
	//  151  410:aload           24
	//  152  412:aload           4
	//  153  414:invokestatic    #355 <Method long parseTimeExpression(String, TtmlDecoder$FrameAndTickRate)>
	//  154  417:lstore          14
				obj1 = obj;
	//  155  419:aload           21
	//  156  421:astore          22
				l2 = l;
	//  157  423:lload           8
	//  158  425:lstore          12
				l7 = l6;
	//  159  427:lload           16
	//  160  429:lstore          18
				obj2 = ((Object) (as));
	//  161  431:aload           20
	//  162  433:astore          23
				break;

	//* 163  435:goto            463
			case 0: // '\0'
				l2 = parseTimeExpression(((String) (obj3)), frameandtickrate);
	//  164  438:aload           24
	//  165  440:aload           4
	//  166  442:invokestatic    #355 <Method long parseTimeExpression(String, TtmlDecoder$FrameAndTickRate)>
	//  167  445:lstore          12
				obj2 = ((Object) (as));
	//  168  447:aload           20
	//  169  449:astore          23
				l7 = l6;
	//  170  451:lload           16
	//  171  453:lstore          18
				l4 = l1;
	//  172  455:lload           10
	//  173  457:lstore          14
				obj1 = obj;
	//  174  459:aload           21
	//  175  461:astore          22
				break;
			}
			i++;
	//  176  463:iload           6
	//  177  465:iconst_1        
	//  178  466:iadd            
	//  179  467:istore          6
			obj = obj1;
	//  180  469:aload           22
	//  181  471:astore          21
			l = l2;
	//  182  473:lload           12
	//  183  475:lstore          8
			l1 = l4;
	//  184  477:lload           14
	//  185  479:lstore          10
			l6 = l7;
	//  186  481:lload           18
	//  187  483:lstore          16
			as = ((String []) (obj2));
	//  188  485:aload           23
	//  189  487:astore          20
		}

	//* 190  489:goto            42
		long l8;
label1:
		{
			long l5;
			if(ttmlnode != null)
	//* 191  492:aload_2         
	//* 192  493:ifnull          570
			{
				l8 = l;
	//  193  496:lload           8
	//  194  498:lstore          18
				l5 = l1;
	//  195  500:lload           10
	//  196  502:lstore          14
				if(ttmlnode.startTimeUs != 0x1L)
	//* 197  504:aload_2         
	//* 198  505:getfield        #361 <Field long TtmlNode.startTimeUs>
	//* 199  508:ldc2w           #340 <Long 0x1L>
	//* 200  511:lcmp            
	//* 201  512:ifeq            578
				{
					long l3 = l;
	//  202  515:lload           8
	//  203  517:lstore          12
					if(l != 0x1L)
	//* 204  519:lload           8
	//* 205  521:ldc2w           #340 <Long 0x1L>
	//* 206  524:lcmp            
	//* 207  525:ifeq            537
						l3 = l + ttmlnode.startTimeUs;
	//  208  528:lload           8
	//  209  530:aload_2         
	//  210  531:getfield        #361 <Field long TtmlNode.startTimeUs>
	//  211  534:ladd            
	//  212  535:lstore          12
					l8 = l3;
	//  213  537:lload           12
	//  214  539:lstore          18
					l5 = l1;
	//  215  541:lload           10
	//  216  543:lstore          14
					if(l1 != 0x1L)
	//* 217  545:lload           10
	//* 218  547:ldc2w           #340 <Long 0x1L>
	//* 219  550:lcmp            
	//* 220  551:ifeq            578
					{
						l5 = l1 + ttmlnode.startTimeUs;
	//  221  554:lload           10
	//  222  556:aload_2         
	//  223  557:getfield        #361 <Field long TtmlNode.startTimeUs>
	//  224  560:ladd            
	//  225  561:lstore          14
						l8 = l3;
	//  226  563:lload           12
	//  227  565:lstore          18
					}
				}
			} else
	//* 228  567:goto            578
			{
				l5 = l1;
	//  229  570:lload           10
	//  230  572:lstore          14
				l8 = l;
	//  231  574:lload           8
	//  232  576:lstore          18
			}
			if(l5 == 0x1L)
	//* 233  578:lload           14
	//* 234  580:ldc2w           #340 <Long 0x1L>
	//* 235  583:lcmp            
	//* 236  584:ifne            630
			{
				if(l6 != 0x1L)
	//* 237  587:lload           16
	//* 238  589:ldc2w           #340 <Long 0x1L>
	//* 239  592:lcmp            
	//* 240  593:ifeq            606
				{
					l = l8 + l6;
	//  241  596:lload           18
	//  242  598:lload           16
	//  243  600:ladd            
	//  244  601:lstore          8
					break label1;
	//  245  603:goto            634
				}
				if(ttmlnode != null && ttmlnode.endTimeUs != 0x1L)
	//* 246  606:aload_2         
	//* 247  607:ifnull          630
	//* 248  610:aload_2         
	//* 249  611:getfield        #364 <Field long TtmlNode.endTimeUs>
	//* 250  614:ldc2w           #340 <Long 0x1L>
	//* 251  617:lcmp            
	//* 252  618:ifeq            630
				{
					l = ttmlnode.endTimeUs;
	//  253  621:aload_2         
	//  254  622:getfield        #364 <Field long TtmlNode.endTimeUs>
	//  255  625:lstore          8
					break label1;
	//  256  627:goto            634
				}
			}
			l = l5;
	//  257  630:lload           14
	//  258  632:lstore          8
		}
		return TtmlNode.buildNode(xmlpullparser.getName(), l8, l, ttmlstyle, as, ((String) (obj)));
	//  259  634:aload_1         
	//  260  635:invokeinterface #367 <Method String XmlPullParser.getName()>
	//  261  640:lload           18
	//  262  642:lload           8
	//  263  644:aload           25
	//  264  646:aload           20
	//  265  648:aload           21
	//  266  650:invokestatic    #371 <Method TtmlNode TtmlNode.buildNode(String, long, long, TtmlStyle, String[], String)>
	//  267  653:areturn         
	}

	private TtmlRegion parseRegionAttributes(XmlPullParser xmlpullparser, CellResolution cellresolution)
	{
		String s;
		String s1 = XmlPullParserUtil.getAttributeValue(xmlpullparser, "id");
	//    0    0:aload_1         
	//    1    1:ldc2            #373 <String "id">
	//    2    4:invokestatic    #296 <Method String XmlPullParserUtil.getAttributeValue(XmlPullParser, String)>
	//    3    7:astore          10
		if(s1 == null)
	//*   4    9:aload           10
	//*   5   11:ifnonnull       16
			return null;
	//    6   14:aconst_null     
	//    7   15:areturn         
		s = XmlPullParserUtil.getAttributeValue(xmlpullparser, "origin");
	//    8   16:aload_1         
	//    9   17:ldc2            #375 <String "origin">
	//   10   20:invokestatic    #296 <Method String XmlPullParserUtil.getAttributeValue(XmlPullParser, String)>
	//   11   23:astore          9
		if(s == null)
			break MISSING_BLOCK_LABEL_451;
	//   12   25:aload           9
	//   13   27:ifnull          451
		Object obj = ((Object) (PERCENTAGE_COORDINATES.matcher(((CharSequence) (s)))));
	//   14   30:getstatic       #71  <Field Pattern PERCENTAGE_COORDINATES>
	//   15   33:aload           9
	//   16   35:invokevirtual   #170 <Method Matcher Pattern.matcher(CharSequence)>
	//   17   38:astore          11
		if(!((Matcher) (obj)).matches())
			break MISSING_BLOCK_LABEL_416;
	//   18   40:aload           11
	//   19   42:invokevirtual   #176 <Method boolean Matcher.matches()>
	//   20   45:ifeq            416
		float f;
		float f1;
		float f2;
		float f3;
		byte byte0;
		int i;
		try
		{
			f1 = Float.parseFloat(((Matcher) (obj)).group(1)) / 100F;
	//   21   48:aload           11
	//   22   50:iconst_1        
	//   23   51:invokevirtual   #199 <Method String Matcher.group(int)>
	//   24   54:invokestatic    #379 <Method float Float.parseFloat(String)>
	//   25   57:ldc2            #380 <Float 100F>
	//   26   60:fdiv            
	//   27   61:fstore          4
			f = Float.parseFloat(((Matcher) (obj)).group(2));
	//   28   63:aload           11
	//   29   65:iconst_2        
	//   30   66:invokevirtual   #199 <Method String Matcher.group(int)>
	//   31   69:invokestatic    #379 <Method float Float.parseFloat(String)>
	//   32   72:fstore_3        
		}
	//*  33   73:fload_3         
	//*  34   74:ldc2            #380 <Float 100F>
	//*  35   77:fdiv            
	//*  36   78:fstore_3        
	//*  37   79:aload_1         
	//*  38   80:ldc2            #382 <String "extent">
	//*  39   83:invokestatic    #296 <Method String XmlPullParserUtil.getAttributeValue(XmlPullParser, String)>
	//*  40   86:astore          11
	//*  41   88:aload           11
	//*  42   90:ifnull          370
	//*  43   93:getstatic       #71  <Field Pattern PERCENTAGE_COORDINATES>
	//*  44   96:aload           11
	//*  45   98:invokevirtual   #170 <Method Matcher Pattern.matcher(CharSequence)>
	//*  46  101:astore          11
	//*  47  103:aload           11
	//*  48  105:invokevirtual   #176 <Method boolean Matcher.matches()>
	//*  49  108:ifeq            335
	//*  50  111:aload           11
	//*  51  113:iconst_1        
	//*  52  114:invokevirtual   #199 <Method String Matcher.group(int)>
	//*  53  117:invokestatic    #379 <Method float Float.parseFloat(String)>
	//*  54  120:ldc2            #380 <Float 100F>
	//*  55  123:fdiv            
	//*  56  124:fstore          5
	//*  57  126:aload           11
	//*  58  128:iconst_2        
	//*  59  129:invokevirtual   #199 <Method String Matcher.group(int)>
	//*  60  132:invokestatic    #379 <Method float Float.parseFloat(String)>
	//*  61  135:fstore          6
	//*  62  137:fload           6
	//*  63  139:ldc2            #380 <Float 100F>
	//*  64  142:fdiv            
	//*  65  143:fstore          6
	//*  66  145:aload_1         
	//*  67  146:ldc2            #384 <String "displayAlign">
	//*  68  149:invokestatic    #296 <Method String XmlPullParserUtil.getAttributeValue(XmlPullParser, String)>
	//*  69  152:astore_1        
	//*  70  153:aload_1         
	//*  71  154:ifnull          271
	//*  72  157:aload_1         
	//*  73  158:invokestatic    #388 <Method String Util.toLowerInvariant(String)>
	//*  74  161:astore_1        
	//*  75  162:iconst_m1       
	//*  76  163:istore          7
	//*  77  165:aload_1         
	//*  78  166:invokevirtual   #230 <Method int String.hashCode()>
	//*  79  169:istore          8
	//*  80  171:iload           8
	//*  81  173:ldc2            #389 <Int 0xaeb2cc55>
	//*  82  176:icmpeq          206
	//*  83  179:iload           8
	//*  84  181:ldc2            #390 <Int 0x58705dc>
	//*  85  184:icmpeq          190
	//*  86  187:goto            219
	//*  87  190:aload_1         
	//*  88  191:ldc2            #392 <String "after">
	//*  89  194:invokevirtual   #128 <Method boolean String.equals(Object)>
	//*  90  197:ifeq            219
	//*  91  200:iconst_1        
	//*  92  201:istore          7
	//*  93  203:goto            219
	//*  94  206:aload_1         
	//*  95  207:ldc2            #394 <String "center">
	//*  96  210:invokevirtual   #128 <Method boolean String.equals(Object)>
	//*  97  213:ifeq            219
	//*  98  216:iconst_0        
	//*  99  217:istore          7
	//* 100  219:iload           7
	//* 101  221:tableswitch     0 1: default 244
	//	               0 258
	//	               1 247
	//* 102  244:goto            271
	//* 103  247:fload_3         
	//* 104  248:fload           6
	//* 105  250:fadd            
	//* 106  251:fstore_3        
	//* 107  252:iconst_2        
	//* 108  253:istore          7
	//* 109  255:goto            274
	//* 110  258:fload_3         
	//* 111  259:fload           6
	//* 112  261:fconst_2        
	//* 113  262:fdiv            
	//* 114  263:fadd            
	//* 115  264:fstore_3        
	//* 116  265:iconst_1        
	//* 117  266:istore          7
	//* 118  268:goto            274
	//* 119  271:iconst_0        
	//* 120  272:istore          7
	//* 121  274:new             #326 <Class TtmlRegion>
	//* 122  277:dup             
	//* 123  278:aload           10
	//* 124  280:fload           4
	//* 125  282:fload_3         
	//* 126  283:iconst_0        
	//* 127  284:iload           7
	//* 128  286:fload           5
	//* 129  288:iconst_1        
	//* 130  289:fconst_1        
	//* 131  290:aload_2         
	//* 132  291:getfield        #397 <Field int TtmlDecoder$CellResolution.rows>
	//* 133  294:i2f             
	//* 134  295:fdiv            
	//* 135  296:invokespecial   #400 <Method void TtmlRegion(String, float, float, int, int, float, int, float)>
	//* 136  299:areturn         
	//* 137  300:new             #178 <Class StringBuilder>
	//* 138  303:dup             
	//* 139  304:invokespecial   #179 <Method void StringBuilder()>
	//* 140  307:astore_1        
	//* 141  308:aload_1         
	//* 142  309:ldc2            #402 <String "Ignoring region with malformed extent: ">
	//* 143  312:invokevirtual   #185 <Method StringBuilder StringBuilder.append(String)>
	//* 144  315:pop             
	//* 145  316:aload_1         
	//* 146  317:aload           9
	//* 147  319:invokevirtual   #185 <Method StringBuilder StringBuilder.append(String)>
	//* 148  322:pop             
	//* 149  323:ldc1            #42  <String "TtmlDecoder">
	//* 150  325:aload_1         
	//* 151  326:invokevirtual   #189 <Method String StringBuilder.toString()>
	//* 152  329:invokestatic    #195 <Method int Log.w(String, String)>
	//* 153  332:pop             
	//* 154  333:aconst_null     
	//* 155  334:areturn         
	//* 156  335:new             #178 <Class StringBuilder>
	//* 157  338:dup             
	//* 158  339:invokespecial   #179 <Method void StringBuilder()>
	//* 159  342:astore_1        
	//* 160  343:aload_1         
	//* 161  344:ldc2            #404 <String "Ignoring region with unsupported extent: ">
	//* 162  347:invokevirtual   #185 <Method StringBuilder StringBuilder.append(String)>
	//* 163  350:pop             
	//* 164  351:aload_1         
	//* 165  352:aload           9
	//* 166  354:invokevirtual   #185 <Method StringBuilder StringBuilder.append(String)>
	//* 167  357:pop             
	//* 168  358:ldc1            #42  <String "TtmlDecoder">
	//* 169  360:aload_1         
	//* 170  361:invokevirtual   #189 <Method String StringBuilder.toString()>
	//* 171  364:invokestatic    #195 <Method int Log.w(String, String)>
	//* 172  367:pop             
	//* 173  368:aconst_null     
	//* 174  369:areturn         
	//* 175  370:ldc1            #42  <String "TtmlDecoder">
	//* 176  372:ldc2            #406 <String "Ignoring region without an extent">
	//* 177  375:invokestatic    #195 <Method int Log.w(String, String)>
	//* 178  378:pop             
	//* 179  379:aconst_null     
	//* 180  380:areturn         
	//* 181  381:new             #178 <Class StringBuilder>
	//* 182  384:dup             
	//* 183  385:invokespecial   #179 <Method void StringBuilder()>
	//* 184  388:astore_1        
	//* 185  389:aload_1         
	//* 186  390:ldc2            #408 <String "Ignoring region with malformed origin: ">
	//* 187  393:invokevirtual   #185 <Method StringBuilder StringBuilder.append(String)>
	//* 188  396:pop             
	//* 189  397:aload_1         
	//* 190  398:aload           9
	//* 191  400:invokevirtual   #185 <Method StringBuilder StringBuilder.append(String)>
	//* 192  403:pop             
	//* 193  404:ldc1            #42  <String "TtmlDecoder">
	//* 194  406:aload_1         
	//* 195  407:invokevirtual   #189 <Method String StringBuilder.toString()>
	//* 196  410:invokestatic    #195 <Method int Log.w(String, String)>
	//* 197  413:pop             
	//* 198  414:aconst_null     
	//* 199  415:areturn         
	//* 200  416:new             #178 <Class StringBuilder>
	//* 201  419:dup             
	//* 202  420:invokespecial   #179 <Method void StringBuilder()>
	//* 203  423:astore_1        
	//* 204  424:aload_1         
	//* 205  425:ldc2            #410 <String "Ignoring region with unsupported origin: ">
	//* 206  428:invokevirtual   #185 <Method StringBuilder StringBuilder.append(String)>
	//* 207  431:pop             
	//* 208  432:aload_1         
	//* 209  433:aload           9
	//* 210  435:invokevirtual   #185 <Method StringBuilder StringBuilder.append(String)>
	//* 211  438:pop             
	//* 212  439:ldc1            #42  <String "TtmlDecoder">
	//* 213  441:aload_1         
	//* 214  442:invokevirtual   #189 <Method String StringBuilder.toString()>
	//* 215  445:invokestatic    #195 <Method int Log.w(String, String)>
	//* 216  448:pop             
	//* 217  449:aconst_null     
	//* 218  450:areturn         
	//* 219  451:ldc1            #42  <String "TtmlDecoder">
	//* 220  453:ldc2            #412 <String "Ignoring region without an origin">
	//* 221  456:invokestatic    #195 <Method int Log.w(String, String)>
	//* 222  459:pop             
	//* 223  460:aconst_null     
	//* 224  461:areturn         
		// Misplaced declaration of an exception variable
		catch(XmlPullParser xmlpullparser)
		{
			xmlpullparser = ((XmlPullParser) (new StringBuilder()));
			((StringBuilder) (xmlpullparser)).append("Ignoring region with malformed origin: ");
			((StringBuilder) (xmlpullparser)).append(s);
			Log.w("TtmlDecoder", ((StringBuilder) (xmlpullparser)).toString());
			return null;
		}
		f /= 100F;
		obj = ((Object) (XmlPullParserUtil.getAttributeValue(xmlpullparser, "extent")));
		if(obj == null)
			break MISSING_BLOCK_LABEL_370;
		obj = ((Object) (PERCENTAGE_COORDINATES.matcher(((CharSequence) (obj)))));
		if(!((Matcher) (obj)).matches())
			break MISSING_BLOCK_LABEL_335;
		try
		{
			f2 = Float.parseFloat(((Matcher) (obj)).group(1)) / 100F;
			f3 = Float.parseFloat(((Matcher) (obj)).group(2));
		}
	//* 225  462:astore_1        
	//* 226  463:goto            381
		// Misplaced declaration of an exception variable
		catch(XmlPullParser xmlpullparser)
		{
			xmlpullparser = ((XmlPullParser) (new StringBuilder()));
			((StringBuilder) (xmlpullparser)).append("Ignoring region with malformed extent: ");
			((StringBuilder) (xmlpullparser)).append(s);
			Log.w("TtmlDecoder", ((StringBuilder) (xmlpullparser)).toString());
			return null;
		}
		f3 /= 100F;
		xmlpullparser = ((XmlPullParser) (XmlPullParserUtil.getAttributeValue(xmlpullparser, "displayAlign")));
		if(xmlpullparser == null) goto _L2; else goto _L1
_L1:
		xmlpullparser = ((XmlPullParser) (Util.toLowerInvariant(((String) (xmlpullparser)))));
		byte0 = -1;
		i = ((String) (xmlpullparser)).hashCode();
		if(i != 0xaeb2cc55)
		{
			if(i == 0x58705dc && ((String) (xmlpullparser)).equals("after"))
				byte0 = 1;
		} else
		if(((String) (xmlpullparser)).equals("center"))
			byte0 = 0;
		byte0;
		JVM INSTR tableswitch 0 1: default 244
	//	               0 258
	//	               1 247;
		   goto _L2 _L3 _L4
_L4:
		f += f3;
		byte0 = 2;
		break; /* Loop/switch isn't completed */
_L3:
		f += f3 / 2.0F;
		byte0 = 1;
		break; /* Loop/switch isn't completed */
_L2:
		byte0 = 0;
		return new TtmlRegion(s1, f1, f, 0, ((int) (byte0)), f2, 1, 1.0F / (float)cellresolution.rows);
		xmlpullparser = ((XmlPullParser) (new StringBuilder()));
		((StringBuilder) (xmlpullparser)).append("Ignoring region with unsupported extent: ");
		((StringBuilder) (xmlpullparser)).append(s);
		Log.w("TtmlDecoder", ((StringBuilder) (xmlpullparser)).toString());
		return null;
		Log.w("TtmlDecoder", "Ignoring region without an extent");
		return null;
		xmlpullparser = ((XmlPullParser) (new StringBuilder()));
		((StringBuilder) (xmlpullparser)).append("Ignoring region with unsupported origin: ");
		((StringBuilder) (xmlpullparser)).append(s);
		Log.w("TtmlDecoder", ((StringBuilder) (xmlpullparser)).toString());
		return null;
		Log.w("TtmlDecoder", "Ignoring region without an origin");
		return null;
	//* 227  466:astore_1        
	//* 228  467:goto            300
	}

	private TtmlStyle parseStyleAttributes(XmlPullParser xmlpullparser, TtmlStyle ttmlstyle)
	{
		int k;
		int l;
		Object obj;
		l = xmlpullparser.getAttributeCount();
	//    0    0:aload_1         
	//    1    1:invokeinterface #339 <Method int XmlPullParser.getAttributeCount()>
	//    2    6:istore          7
		k = 0;
	//    3    8:iconst_0        
	//    4    9:istore          4
		obj = ((Object) (ttmlstyle));
	//    5   11:aload_2         
	//    6   12:astore          8
_L13:
		if(k >= l) goto _L2; else goto _L1
	//    7   14:iload           4
	//    8   16:iload           7
	//    9   18:icmpge          1076
_L1:
		int i;
		byte byte1;
		byte byte2;
		String s;
label0:
		{
			s = xmlpullparser.getAttributeValue(k);
	//   10   21:aload_1         
	//   11   22:iload           4
	//   12   24:invokeinterface #348 <Method String XmlPullParser.getAttributeValue(int)>
	//   13   29:astore          9
			ttmlstyle = ((TtmlStyle) (xmlpullparser.getAttributeName(k)));
	//   14   31:aload_1         
	//   15   32:iload           4
	//   16   34:invokeinterface #346 <Method String XmlPullParser.getAttributeName(int)>
	//   17   39:astore_2        
			i = ((String) (ttmlstyle)).hashCode();
	//   18   40:aload_2         
	//   19   41:invokevirtual   #230 <Method int String.hashCode()>
	//   20   44:istore_3        
			byte2 = 4;
	//   21   45:iconst_4        
	//   22   46:istore          6
			byte1 = 3;
	//   23   48:iconst_3        
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
	//*  29  140:ldc2            #416 <String "backgroundColor">
	//*  30  143:invokevirtual   #128 <Method boolean String.equals(Object)>
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
	//   36  155:ldc2            #418 <String "fontSize">
	//   37  158:invokevirtual   #128 <Method boolean String.equals(Object)>
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
	//   43  170:ldc2            #420 <String "color">
	//   44  173:invokevirtual   #128 <Method boolean String.equals(Object)>
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
	//   50  185:ldc2            #373 <String "id">
	//   51  188:invokevirtual   #128 <Method boolean String.equals(Object)>
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
	//   57  200:ldc2            #422 <String "fontWeight">
	//   58  203:invokevirtual   #128 <Method boolean String.equals(Object)>
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
	//   64  215:ldc2            #424 <String "textDecoration">
	//   65  218:invokevirtual   #128 <Method boolean String.equals(Object)>
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
	//   71  231:ldc2            #426 <String "textAlign">
	//   72  234:invokevirtual   #128 <Method boolean String.equals(Object)>
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
	//   78  247:ldc2            #428 <String "fontFamily">
	//   79  250:invokevirtual   #128 <Method boolean String.equals(Object)>
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
	//   85  262:ldc2            #430 <String "fontStyle">
	//   86  265:invokevirtual   #128 <Method boolean String.equals(Object)>
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
	//	               0 1035
	//	               1 975
	//	               2 915
	//	               3 900
	//	               4 844
	//	               5 823
	//	               6 802
	//	               7 538
	//	               8 338;
	//   94  280:tableswitch     0 8: default 332
	//	               0 1035
	//	               1 975
	//	               2 915
	//	               3 900
	//	               4 844
	//	               5 823
	//	               6 802
	//	               7 538
	//	               8 338
		   goto _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12
_L3:
		ttmlstyle = ((TtmlStyle) (obj));
	//   95  332:aload           8
	//   96  334:astore_2        
		break; /* Loop/switch isn't completed */
	//   97  335:goto            1064
_L12:
		int j;
label1:
		{
			ttmlstyle = ((TtmlStyle) (Util.toLowerInvariant(s)));
	//   98  338:aload           9
	//   99  340:invokestatic    #388 <Method String Util.toLowerInvariant(String)>
	//  100  343:astore_2        
			j = ((String) (ttmlstyle)).hashCode();
	//  101  344:aload_2         
	//  102  345:invokevirtual   #230 <Method int String.hashCode()>
	//  103  348:istore_3        
			if(j != 0xa8e6a22b)
	//* 104  349:iload_3         
	//* 105  350:ldc2            #431 <Int 0xa8e6a22b>
	//* 106  353:icmpeq          425
			{
				if(j != 0xc2c9c6cc)
	//* 107  356:iload_3         
	//* 108  357:ldc2            #432 <Int 0xc2c9c6cc>
	//* 109  360:icmpeq          410
				{
					if(j != 0x36723ff0)
	//* 110  363:iload_3         
	//* 111  364:ldc2            #433 <Int 0x36723ff0>
	//* 112  367:icmpeq          395
					{
						if(j == 0x641ec051 && ((String) (ttmlstyle)).equals("linethrough"))
	//* 113  370:iload_3         
	//* 114  371:ldc2            #434 <Int 0x641ec051>
	//* 115  374:icmpeq          380
	//* 116  377:goto            441
	//* 117  380:aload_2         
	//* 118  381:ldc2            #436 <String "linethrough">
	//* 119  384:invokevirtual   #128 <Method boolean String.equals(Object)>
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
	//* 125  396:ldc2            #438 <String "nolinethrough">
	//* 126  399:invokevirtual   #128 <Method boolean String.equals(Object)>
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
	//* 132  411:ldc2            #440 <String "underline">
	//* 133  414:invokevirtual   #128 <Method boolean String.equals(Object)>
	//* 134  417:ifeq            441
				{
					j = 2;
	//  135  420:iconst_2        
	//  136  421:istore_3        
					break label1;
	//  137  422:goto            443
				}
			} else
			if(((String) (ttmlstyle)).equals("nounderline"))
	//* 138  425:aload_2         
	//* 139  426:ldc2            #442 <String "nounderline">
	//* 140  429:invokevirtual   #128 <Method boolean String.equals(Object)>
	//* 141  432:ifeq            441
			{
				j = ((int) (byte1));
	//  142  435:iload           5
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

	//* 151  479:goto            1064
		case 3: // '\003'
			ttmlstyle = createIfNull(((TtmlStyle) (obj))).setUnderline(false);
	//  152  482:aload_0         
	//  153  483:aload           8
	//  154  485:invokespecial   #444 <Method TtmlStyle createIfNull(TtmlStyle)>
	//  155  488:iconst_0        
	//  156  489:invokevirtual   #448 <Method TtmlStyle TtmlStyle.setUnderline(boolean)>
	//  157  492:astore_2        
			break;

	//* 158  493:goto            1064
		case 2: // '\002'
			ttmlstyle = createIfNull(((TtmlStyle) (obj))).setUnderline(true);
	//  159  496:aload_0         
	//  160  497:aload           8
	//  161  499:invokespecial   #444 <Method TtmlStyle createIfNull(TtmlStyle)>
	//  162  502:iconst_1        
	//  163  503:invokevirtual   #448 <Method TtmlStyle TtmlStyle.setUnderline(boolean)>
	//  164  506:astore_2        
			break;

	//* 165  507:goto            1064
		case 1: // '\001'
			ttmlstyle = createIfNull(((TtmlStyle) (obj))).setLinethrough(false);
	//  166  510:aload_0         
	//  167  511:aload           8
	//  168  513:invokespecial   #444 <Method TtmlStyle createIfNull(TtmlStyle)>
	//  169  516:iconst_0        
	//  170  517:invokevirtual   #451 <Method TtmlStyle TtmlStyle.setLinethrough(boolean)>
	//  171  520:astore_2        
			break;

	//* 172  521:goto            1064
		case 0: // '\0'
			ttmlstyle = createIfNull(((TtmlStyle) (obj))).setLinethrough(true);
	//  173  524:aload_0         
	//  174  525:aload           8
	//  175  527:invokespecial   #444 <Method TtmlStyle createIfNull(TtmlStyle)>
	//  176  530:iconst_1        
	//  177  531:invokevirtual   #451 <Method TtmlStyle TtmlStyle.setLinethrough(boolean)>
	//  178  534:astore_2        
			break;
		}
		break; /* Loop/switch isn't completed */
	//  179  535:goto            1064
_L11:
		byte byte0;
label2:
		{
			ttmlstyle = ((TtmlStyle) (Util.toLowerInvariant(s)));
	//  180  538:aload           9
	//  181  540:invokestatic    #388 <Method String Util.toLowerInvariant(String)>
	//  182  543:astore_2        
			switch(((String) (ttmlstyle)).hashCode())
	//* 183  544:aload_2         
	//* 184  545:invokevirtual   #230 <Method int String.hashCode()>
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
	//* 188  604:ldc2            #453 <String "start">
	//* 189  607:invokevirtual   #128 <Method boolean String.equals(Object)>
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
	//  195  619:ldc2            #455 <String "right">
	//  196  622:invokevirtual   #128 <Method boolean String.equals(Object)>
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
	//  202  634:ldc2            #457 <String "left">
	//  203  637:invokevirtual   #128 <Method boolean String.equals(Object)>
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
	//  209  649:ldc1            #20  <String "end">
	//  210  651:invokevirtual   #128 <Method boolean String.equals(Object)>
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
	//  216  663:ldc2            #394 <String "center">
	//  217  666:invokevirtual   #128 <Method boolean String.equals(Object)>
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

	//* 228  719:goto            1064
		case 4: // '\004'
			ttmlstyle = createIfNull(((TtmlStyle) (obj))).setTextAlign(android.text.Layout.Alignment.ALIGN_CENTER);
	//  229  722:aload_0         
	//  230  723:aload           8
	//  231  725:invokespecial   #444 <Method TtmlStyle createIfNull(TtmlStyle)>
	//  232  728:getstatic       #463 <Field android.text.Layout$Alignment android.text.Layout$Alignment.ALIGN_CENTER>
	//  233  731:invokevirtual   #467 <Method TtmlStyle TtmlStyle.setTextAlign(android.text.Layout$Alignment)>
	//  234  734:astore_2        
			break;

	//* 235  735:goto            1064
		case 3: // '\003'
			ttmlstyle = createIfNull(((TtmlStyle) (obj))).setTextAlign(android.text.Layout.Alignment.ALIGN_OPPOSITE);
	//  236  738:aload_0         
	//  237  739:aload           8
	//  238  741:invokespecial   #444 <Method TtmlStyle createIfNull(TtmlStyle)>
	//  239  744:getstatic       #470 <Field android.text.Layout$Alignment android.text.Layout$Alignment.ALIGN_OPPOSITE>
	//  240  747:invokevirtual   #467 <Method TtmlStyle TtmlStyle.setTextAlign(android.text.Layout$Alignment)>
	//  241  750:astore_2        
			break;

	//* 242  751:goto            1064
		case 2: // '\002'
			ttmlstyle = createIfNull(((TtmlStyle) (obj))).setTextAlign(android.text.Layout.Alignment.ALIGN_OPPOSITE);
	//  243  754:aload_0         
	//  244  755:aload           8
	//  245  757:invokespecial   #444 <Method TtmlStyle createIfNull(TtmlStyle)>
	//  246  760:getstatic       #470 <Field android.text.Layout$Alignment android.text.Layout$Alignment.ALIGN_OPPOSITE>
	//  247  763:invokevirtual   #467 <Method TtmlStyle TtmlStyle.setTextAlign(android.text.Layout$Alignment)>
	//  248  766:astore_2        
			break;

	//* 249  767:goto            1064
		case 1: // '\001'
			ttmlstyle = createIfNull(((TtmlStyle) (obj))).setTextAlign(android.text.Layout.Alignment.ALIGN_NORMAL);
	//  250  770:aload_0         
	//  251  771:aload           8
	//  252  773:invokespecial   #444 <Method TtmlStyle createIfNull(TtmlStyle)>
	//  253  776:getstatic       #473 <Field android.text.Layout$Alignment android.text.Layout$Alignment.ALIGN_NORMAL>
	//  254  779:invokevirtual   #467 <Method TtmlStyle TtmlStyle.setTextAlign(android.text.Layout$Alignment)>
	//  255  782:astore_2        
			break;

	//* 256  783:goto            1064
		case 0: // '\0'
			ttmlstyle = createIfNull(((TtmlStyle) (obj))).setTextAlign(android.text.Layout.Alignment.ALIGN_NORMAL);
	//  257  786:aload_0         
	//  258  787:aload           8
	//  259  789:invokespecial   #444 <Method TtmlStyle createIfNull(TtmlStyle)>
	//  260  792:getstatic       #473 <Field android.text.Layout$Alignment android.text.Layout$Alignment.ALIGN_NORMAL>
	//  261  795:invokevirtual   #467 <Method TtmlStyle TtmlStyle.setTextAlign(android.text.Layout$Alignment)>
	//  262  798:astore_2        
			break;
		}
		break; /* Loop/switch isn't completed */
	//  263  799:goto            1064
_L10:
		ttmlstyle = createIfNull(((TtmlStyle) (obj))).setItalic("italic".equalsIgnoreCase(s));
	//  264  802:aload_0         
	//  265  803:aload           8
	//  266  805:invokespecial   #444 <Method TtmlStyle createIfNull(TtmlStyle)>
	//  267  808:ldc2            #475 <String "italic">
	//  268  811:aload           9
	//  269  813:invokevirtual   #478 <Method boolean String.equalsIgnoreCase(String)>
	//  270  816:invokevirtual   #481 <Method TtmlStyle TtmlStyle.setItalic(boolean)>
	//  271  819:astore_2        
		break; /* Loop/switch isn't completed */
	//  272  820:goto            1064
_L9:
		ttmlstyle = createIfNull(((TtmlStyle) (obj))).setBold("bold".equalsIgnoreCase(s));
	//  273  823:aload_0         
	//  274  824:aload           8
	//  275  826:invokespecial   #444 <Method TtmlStyle createIfNull(TtmlStyle)>
	//  276  829:ldc2            #483 <String "bold">
	//  277  832:aload           9
	//  278  834:invokevirtual   #478 <Method boolean String.equalsIgnoreCase(String)>
	//  279  837:invokevirtual   #486 <Method TtmlStyle TtmlStyle.setBold(boolean)>
	//  280  840:astore_2        
		break; /* Loop/switch isn't completed */
	//  281  841:goto            1064
_L8:
		ttmlstyle = createIfNull(((TtmlStyle) (obj)));
	//  282  844:aload_0         
	//  283  845:aload           8
	//  284  847:invokespecial   #444 <Method TtmlStyle createIfNull(TtmlStyle)>
	//  285  850:astore_2        
		try
		{
			parseFontSize(s, ttmlstyle);
	//  286  851:aload           9
	//  287  853:aload_2         
	//  288  854:invokestatic    #488 <Method void parseFontSize(String, TtmlStyle)>
			break; /* Loop/switch isn't completed */
	//  289  857:goto            1064
		}
	//* 290  860:new             #178 <Class StringBuilder>
	//* 291  863:dup             
	//* 292  864:invokespecial   #179 <Method void StringBuilder()>
	//* 293  867:astore          8
	//* 294  869:aload           8
	//* 295  871:ldc2            #490 <String "Failed parsing fontSize value: ">
	//* 296  874:invokevirtual   #185 <Method StringBuilder StringBuilder.append(String)>
	//* 297  877:pop             
	//* 298  878:aload           8
	//* 299  880:aload           9
	//* 300  882:invokevirtual   #185 <Method StringBuilder StringBuilder.append(String)>
	//* 301  885:pop             
	//* 302  886:ldc1            #42  <String "TtmlDecoder">
	//* 303  888:aload           8
	//* 304  890:invokevirtual   #189 <Method String StringBuilder.toString()>
	//* 305  893:invokestatic    #195 <Method int Log.w(String, String)>
	//* 306  896:pop             
	//* 307  897:goto            1064
	//* 308  900:aload_0         
	//* 309  901:aload           8
	//* 310  903:invokespecial   #444 <Method TtmlStyle createIfNull(TtmlStyle)>
	//* 311  906:aload           9
	//* 312  908:invokevirtual   #494 <Method TtmlStyle TtmlStyle.setFontFamily(String)>
	//* 313  911:astore_2        
	//* 314  912:goto            1064
	//* 315  915:aload_0         
	//* 316  916:aload           8
	//* 317  918:invokespecial   #444 <Method TtmlStyle createIfNull(TtmlStyle)>
	//* 318  921:astore_2        
	//* 319  922:aload_2         
	//* 320  923:aload           9
	//* 321  925:invokestatic    #499 <Method int ColorParser.parseTtmlColor(String)>
	//* 322  928:invokevirtual   #502 <Method TtmlStyle TtmlStyle.setFontColor(int)>
	//* 323  931:pop             
	//* 324  932:goto            1064
	//* 325  935:new             #178 <Class StringBuilder>
	//* 326  938:dup             
	//* 327  939:invokespecial   #179 <Method void StringBuilder()>
	//* 328  942:astore          8
	//* 329  944:aload           8
	//* 330  946:ldc2            #504 <String "Failed parsing color value: ">
	//* 331  949:invokevirtual   #185 <Method StringBuilder StringBuilder.append(String)>
	//* 332  952:pop             
	//* 333  953:aload           8
	//* 334  955:aload           9
	//* 335  957:invokevirtual   #185 <Method StringBuilder StringBuilder.append(String)>
	//* 336  960:pop             
	//* 337  961:ldc1            #42  <String "TtmlDecoder">
	//* 338  963:aload           8
	//* 339  965:invokevirtual   #189 <Method String StringBuilder.toString()>
	//* 340  968:invokestatic    #195 <Method int Log.w(String, String)>
	//* 341  971:pop             
	//* 342  972:goto            1064
	//* 343  975:aload_0         
	//* 344  976:aload           8
	//* 345  978:invokespecial   #444 <Method TtmlStyle createIfNull(TtmlStyle)>
	//* 346  981:astore_2        
	//* 347  982:aload_2         
	//* 348  983:aload           9
	//* 349  985:invokestatic    #499 <Method int ColorParser.parseTtmlColor(String)>
	//* 350  988:invokevirtual   #507 <Method TtmlStyle TtmlStyle.setBackgroundColor(int)>
	//* 351  991:pop             
	//* 352  992:goto            1064
	//* 353  995:new             #178 <Class StringBuilder>
	//* 354  998:dup             
	//* 355  999:invokespecial   #179 <Method void StringBuilder()>
	//* 356 1002:astore          8
	//* 357 1004:aload           8
	//* 358 1006:ldc2            #509 <String "Failed parsing background value: ">
	//* 359 1009:invokevirtual   #185 <Method StringBuilder StringBuilder.append(String)>
	//* 360 1012:pop             
	//* 361 1013:aload           8
	//* 362 1015:aload           9
	//* 363 1017:invokevirtual   #185 <Method StringBuilder StringBuilder.append(String)>
	//* 364 1020:pop             
	//* 365 1021:ldc1            #42  <String "TtmlDecoder">
	//* 366 1023:aload           8
	//* 367 1025:invokevirtual   #189 <Method String StringBuilder.toString()>
	//* 368 1028:invokestatic    #195 <Method int Log.w(String, String)>
	//* 369 1031:pop             
	//* 370 1032:goto            1064
	//* 371 1035:aload           8
	//* 372 1037:astore_2        
	//* 373 1038:ldc1            #26  <String "style">
	//* 374 1040:aload_1         
	//* 375 1041:invokeinterface #367 <Method String XmlPullParser.getName()>
	//* 376 1046:invokevirtual   #128 <Method boolean String.equals(Object)>
	//* 377 1049:ifeq            1064
	//* 378 1052:aload_0         
	//* 379 1053:aload           8
	//* 380 1055:invokespecial   #444 <Method TtmlStyle createIfNull(TtmlStyle)>
	//* 381 1058:aload           9
	//* 382 1060:invokevirtual   #512 <Method TtmlStyle TtmlStyle.setId(String)>
	//* 383 1063:astore_2        
	//* 384 1064:iload           4
	//* 385 1066:iconst_1        
	//* 386 1067:iadd            
	//* 387 1068:istore          4
	//* 388 1070:aload_2         
	//* 389 1071:astore          8
	//* 390 1073:goto            14
	//* 391 1076:aload           8
	//* 392 1078:areturn         
	//* 393 1079:astore_2        
	//* 394 1080:aload           8
	//* 395 1082:astore_2        
	//* 396 1083:goto            860
		catch(SubtitleDecoderException subtitledecoderexception) { }
	//  397 1086:astore          8
_L14:
		obj = ((Object) (new StringBuilder()));
		((StringBuilder) (obj)).append("Failed parsing fontSize value: ");
		((StringBuilder) (obj)).append(s);
		Log.w("TtmlDecoder", ((StringBuilder) (obj)).toString());
		break; /* Loop/switch isn't completed */
_L7:
		ttmlstyle = createIfNull(((TtmlStyle) (obj))).setFontFamily(s);
		break; /* Loop/switch isn't completed */
_L6:
		ttmlstyle = createIfNull(((TtmlStyle) (obj)));
		try
		{
			ttmlstyle.setFontColor(ColorParser.parseTtmlColor(s));
			break; /* Loop/switch isn't completed */
		}
	//* 398 1088:goto            860
		// Misplaced declaration of an exception variable
		catch(IllegalArgumentException illegalargumentexception)
		{
			obj = ((Object) (new StringBuilder()));
		}
		((StringBuilder) (obj)).append("Failed parsing color value: ");
		((StringBuilder) (obj)).append(s);
		Log.w("TtmlDecoder", ((StringBuilder) (obj)).toString());
		break; /* Loop/switch isn't completed */
_L5:
		ttmlstyle = createIfNull(((TtmlStyle) (obj)));
		try
		{
			ttmlstyle.setBackgroundColor(ColorParser.parseTtmlColor(s));
			break; /* Loop/switch isn't completed */
		}
	//* 399 1091:astore          8
	//* 400 1093:goto            935
		// Misplaced declaration of an exception variable
		catch(IllegalArgumentException illegalargumentexception)
		{
			obj = ((Object) (new StringBuilder()));
		}
		((StringBuilder) (obj)).append("Failed parsing background value: ");
		((StringBuilder) (obj)).append(s);
		Log.w("TtmlDecoder", ((StringBuilder) (obj)).toString());
		break; /* Loop/switch isn't completed */
_L4:
		ttmlstyle = ((TtmlStyle) (obj));
		if("style".equals(((Object) (xmlpullparser.getName()))))
			ttmlstyle = createIfNull(((TtmlStyle) (obj))).setId(s);
		k++;
		obj = ((Object) (ttmlstyle));
		  goto _L13
_L2:
		return ((TtmlStyle) (obj));
		ttmlstyle;
		IllegalArgumentException illegalargumentexception;
		ttmlstyle = ((TtmlStyle) (obj));
		  goto _L14
	//* 401 1096:astore          8
	//* 402 1098:goto            995
	}

	private String[] parseStyleIds(String s)
	{
		s = s.trim();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #515 <Method String String.trim()>
	//    2    4:astore_1        
		if(s.isEmpty())
	//*   3    5:aload_1         
	//*   4    6:invokevirtual   #518 <Method boolean String.isEmpty()>
	//*   5    9:ifeq            17
			return new String[0];
	//    6   12:iconst_0        
	//    7   13:anewarray       String[]
	//    8   16:areturn         
		else
			return Util.split(s, "\\s+");
	//    9   17:aload_1         
	//   10   18:ldc1            #218 <String "\\s+">
	//   11   20:invokestatic    #224 <Method String[] Util.split(String, String)>
	//   12   23:areturn         
	}

	private static long parseTimeExpression(String s, FrameAndTickRate frameandtickrate)
		throws SubtitleDecoderException
	{
		Matcher matcher = CLOCK_TIME.matcher(((CharSequence) (s)));
	//    0    0:getstatic       #59  <Field Pattern CLOCK_TIME>
	//    1    3:aload_0         
	//    2    4:invokevirtual   #170 <Method Matcher Pattern.matcher(CharSequence)>
	//    3    7:astore          17
		boolean flag = matcher.matches();
	//    4    9:aload           17
	//    5   11:invokevirtual   #176 <Method boolean Matcher.matches()>
	//    6   14:istore          16
		byte byte0 = 5;
	//    7   16:iconst_5        
	//    8   17:istore          14
		if(flag)
	//*   9   19:iload           16
	//*  10   21:ifeq            175
		{
			double d5 = Long.parseLong(matcher.group(1)) * 3600L;
	//   11   24:aload           17
	//   12   26:iconst_1        
	//   13   27:invokevirtual   #199 <Method String Matcher.group(int)>
	//   14   30:invokestatic    #524 <Method long Long.parseLong(String)>
	//   15   33:ldc2w           #525 <Long 3600L>
	//   16   36:lmul            
	//   17   37:l2d             
	//   18   38:dstore          8
			double d6 = Long.parseLong(matcher.group(2)) * 60L;
	//   19   40:aload           17
	//   20   42:iconst_2        
	//   21   43:invokevirtual   #199 <Method String Matcher.group(int)>
	//   22   46:invokestatic    #524 <Method long Long.parseLong(String)>
	//   23   49:ldc2w           #527 <Long 60L>
	//   24   52:lmul            
	//   25   53:l2d             
	//   26   54:dstore          10
			double d7 = Long.parseLong(matcher.group(3));
	//   27   56:aload           17
	//   28   58:iconst_3        
	//   29   59:invokevirtual   #199 <Method String Matcher.group(int)>
	//   30   62:invokestatic    #524 <Method long Long.parseLong(String)>
	//   31   65:l2d             
	//   32   66:dstore          12
			s = matcher.group(4);
	//   33   68:aload           17
	//   34   70:iconst_4        
	//   35   71:invokevirtual   #199 <Method String Matcher.group(int)>
	//   36   74:astore_0        
			double d4 = 0.0D;
	//   37   75:dconst_0        
	//   38   76:dstore          6
			double d;
			if(s != null)
	//*  39   78:aload_0         
	//*  40   79:ifnull          90
				d = Double.parseDouble(s);
	//   41   82:aload_0         
	//   42   83:invokestatic    #534 <Method double Double.parseDouble(String)>
	//   43   86:dstore_2        
			else
	//*  44   87:goto            92
				d = 0.0D;
	//   45   90:dconst_0        
	//   46   91:dstore_2        
			s = matcher.group(5);
	//   47   92:aload           17
	//   48   94:iconst_5        
	//   49   95:invokevirtual   #199 <Method String Matcher.group(int)>
	//   50   98:astore_0        
			double d2;
			if(s != null)
	//*  51   99:aload_0         
	//*  52  100:ifnull          119
				d2 = (float)Long.parseLong(s) / frameandtickrate.effectiveFrameRate;
	//   53  103:aload_0         
	//   54  104:invokestatic    #524 <Method long Long.parseLong(String)>
	//   55  107:l2f             
	//   56  108:aload_1         
	//   57  109:getfield        #538 <Field float TtmlDecoder$FrameAndTickRate.effectiveFrameRate>
	//   58  112:fdiv            
	//   59  113:f2d             
	//   60  114:dstore          4
			else
	//*  61  116:goto            122
				d2 = 0.0D;
	//   62  119:dconst_0        
	//   63  120:dstore          4
			s = matcher.group(6);
	//   64  122:aload           17
	//   65  124:bipush          6
	//   66  126:invokevirtual   #199 <Method String Matcher.group(int)>
	//   67  129:astore_0        
			if(s != null)
	//*  68  130:aload_0         
	//*  69  131:ifnull          153
				d4 = (double)Long.parseLong(s) / (double)frameandtickrate.subFrameRate / (double)frameandtickrate.effectiveFrameRate;
	//   70  134:aload_0         
	//   71  135:invokestatic    #524 <Method long Long.parseLong(String)>
	//   72  138:l2d             
	//   73  139:aload_1         
	//   74  140:getfield        #275 <Field int TtmlDecoder$FrameAndTickRate.subFrameRate>
	//   75  143:i2d             
	//   76  144:ddiv            
	//   77  145:aload_1         
	//   78  146:getfield        #538 <Field float TtmlDecoder$FrameAndTickRate.effectiveFrameRate>
	//   79  149:f2d             
	//   80  150:ddiv            
	//   81  151:dstore          6
			return (long)((d5 + d6 + d7 + d + d2 + d4) * 1000000D);
	//   82  153:dload           8
	//   83  155:dload           10
	//   84  157:dadd            
	//   85  158:dload           12
	//   86  160:dadd            
	//   87  161:dload_2         
	//   88  162:dadd            
	//   89  163:dload           4
	//   90  165:dadd            
	//   91  166:dload           6
	//   92  168:dadd            
	//   93  169:ldc2w           #539 <Double 1000000D>
	//   94  172:dmul            
	//   95  173:d2l             
	//   96  174:lreturn         
		}
		matcher = OFFSET_TIME.matcher(((CharSequence) (s)));
	//   97  175:getstatic       #63  <Field Pattern OFFSET_TIME>
	//   98  178:aload_0         
	//   99  179:invokevirtual   #170 <Method Matcher Pattern.matcher(CharSequence)>
	//  100  182:astore          17
		if(matcher.matches())
	//* 101  184:aload           17
	//* 102  186:invokevirtual   #176 <Method boolean Matcher.matches()>
	//* 103  189:ifeq            476
		{
			double d3;
label0:
			{
				d3 = Double.parseDouble(matcher.group(1));
	//  104  192:aload           17
	//  105  194:iconst_1        
	//  106  195:invokevirtual   #199 <Method String Matcher.group(int)>
	//  107  198:invokestatic    #534 <Method double Double.parseDouble(String)>
	//  108  201:dstore          4
				s = matcher.group(2);
	//  109  203:aload           17
	//  110  205:iconst_2        
	//  111  206:invokevirtual   #199 <Method String Matcher.group(int)>
	//  112  209:astore_0        
				int i = s.hashCode();
	//  113  210:aload_0         
	//  114  211:invokevirtual   #230 <Method int String.hashCode()>
	//  115  214:istore          15
				if(i != 102)
	//* 116  216:iload           15
	//* 117  218:bipush          102
	//* 118  220:icmpeq          348
				{
					if(i != 104)
	//* 119  223:iload           15
	//* 120  225:bipush          104
	//* 121  227:icmpeq          332
					{
						if(i != 109)
	//* 122  230:iload           15
	//* 123  232:bipush          109
	//* 124  234:icmpeq          316
						{
							if(i != 3494)
	//* 125  237:iload           15
	//* 126  239:sipush          3494
	//* 127  242:icmpeq          300
								switch(i)
	//* 128  245:iload           15
								{
	//* 129  247:tableswitch     115 116: default 268
	//	               115 284
	//	               116 271
	//* 130  268:goto            364
								case 116: // 't'
									if(s.equals("t"))
	//* 131  271:aload_0         
	//* 132  272:ldc2            #542 <String "t">
	//* 133  275:invokevirtual   #128 <Method boolean String.equals(Object)>
	//* 134  278:ifeq            364
										break label0;
	//  135  281:goto            367
									break;

								case 115: // 's'
									if(s.equals("s"))
	//* 136  284:aload_0         
	//* 137  285:ldc2            #544 <String "s">
	//* 138  288:invokevirtual   #128 <Method boolean String.equals(Object)>
	//* 139  291:ifeq            364
									{
										byte0 = 2;
	//  140  294:iconst_2        
	//  141  295:istore          14
										break label0;
	//  142  297:goto            367
									}
									break;
								}
							else
							if(s.equals("ms"))
	//* 143  300:aload_0         
	//* 144  301:ldc2            #546 <String "ms">
	//* 145  304:invokevirtual   #128 <Method boolean String.equals(Object)>
	//* 146  307:ifeq            364
							{
								byte0 = 3;
	//  147  310:iconst_3        
	//  148  311:istore          14
								break label0;
	//  149  313:goto            367
							}
						} else
						if(s.equals("m"))
	//* 150  316:aload_0         
	//* 151  317:ldc2            #548 <String "m">
	//* 152  320:invokevirtual   #128 <Method boolean String.equals(Object)>
	//* 153  323:ifeq            364
						{
							byte0 = 1;
	//  154  326:iconst_1        
	//  155  327:istore          14
							break label0;
	//  156  329:goto            367
						}
					} else
					if(s.equals("h"))
	//* 157  332:aload_0         
	//* 158  333:ldc2            #550 <String "h">
	//* 159  336:invokevirtual   #128 <Method boolean String.equals(Object)>
	//* 160  339:ifeq            364
					{
						byte0 = 0;
	//  161  342:iconst_0        
	//  162  343:istore          14
						break label0;
	//  163  345:goto            367
					}
				} else
				if(s.equals("f"))
	//* 164  348:aload_0         
	//* 165  349:ldc2            #552 <String "f">
	//* 166  352:invokevirtual   #128 <Method boolean String.equals(Object)>
	//* 167  355:ifeq            364
				{
					byte0 = 4;
	//  168  358:iconst_4        
	//  169  359:istore          14
					break label0;
	//  170  361:goto            367
				}
				byte0 = -1;
	//  171  364:iconst_m1       
	//  172  365:istore          14
			}
			double d1 = d3;
	//  173  367:dload           4
	//  174  369:dstore_2        
			switch(byte0)
	//* 175  370:iload           14
			{
	//* 176  372:tableswitch     0 5: default 412
	//	               0 462
	//	               1 452
	//	               2 469
	//	               3 442
	//	               4 430
	//	               5 418
			default:
				d1 = d3;
	//  177  412:dload           4
	//  178  414:dstore_2        
				break;

	//* 179  415:goto            469
			case 5: // '\005'
				d1 = d3 / (double)frameandtickrate.tickRate;
	//  180  418:dload           4
	//  181  420:aload_1         
	//  182  421:getfield        #279 <Field int TtmlDecoder$FrameAndTickRate.tickRate>
	//  183  424:i2d             
	//  184  425:ddiv            
	//  185  426:dstore_2        
				break;

	//* 186  427:goto            469
			case 4: // '\004'
				d1 = d3 / (double)frameandtickrate.effectiveFrameRate;
	//  187  430:dload           4
	//  188  432:aload_1         
	//  189  433:getfield        #538 <Field float TtmlDecoder$FrameAndTickRate.effectiveFrameRate>
	//  190  436:f2d             
	//  191  437:ddiv            
	//  192  438:dstore_2        
				break;

	//* 193  439:goto            469
			case 3: // '\003'
				d1 = d3 / 1000D;
	//  194  442:dload           4
	//  195  444:ldc2w           #553 <Double 1000D>
	//  196  447:ddiv            
	//  197  448:dstore_2        
				break;

	//* 198  449:goto            469
			case 1: // '\001'
				d1 = d3 * 60D;
	//  199  452:dload           4
	//  200  454:ldc2w           #555 <Double 60D>
	//  201  457:dmul            
	//  202  458:dstore_2        
				break;

	//* 203  459:goto            469
			case 0: // '\0'
				d1 = d3 * 3600D;
	//  204  462:dload           4
	//  205  464:ldc2w           #557 <Double 3600D>
	//  206  467:dmul            
	//  207  468:dstore_2        
				break;

			case 2: // '\002'
				break;
			}
			return (long)(d1 * 1000000D);
	//  208  469:dload_2         
	//  209  470:ldc2w           #539 <Double 1000000D>
	//  210  473:dmul            
	//  211  474:d2l             
	//  212  475:lreturn         
		} else
		{
			frameandtickrate = ((FrameAndTickRate) (new StringBuilder()));
	//  213  476:new             #178 <Class StringBuilder>
	//  214  479:dup             
	//  215  480:invokespecial   #179 <Method void StringBuilder()>
	//  216  483:astore_1        
			((StringBuilder) (frameandtickrate)).append("Malformed time expression: ");
	//  217  484:aload_1         
	//  218  485:ldc2            #560 <String "Malformed time expression: ">
	//  219  488:invokevirtual   #185 <Method StringBuilder StringBuilder.append(String)>
	//  220  491:pop             
			((StringBuilder) (frameandtickrate)).append(s);
	//  221  492:aload_1         
	//  222  493:aload_0         
	//  223  494:invokevirtual   #185 <Method StringBuilder StringBuilder.append(String)>
	//  224  497:pop             
			throw new SubtitleDecoderException(((StringBuilder) (frameandtickrate)).toString());
	//  225  498:new             #156 <Class SubtitleDecoderException>
	//  226  501:dup             
	//  227  502:aload_1         
	//  228  503:invokevirtual   #189 <Method String StringBuilder.toString()>
	//  229  506:invokespecial   #213 <Method void SubtitleDecoderException(String)>
	//  230  509:athrow          
		}
	}

	protected volatile Subtitle decode(byte abyte0[], int i, boolean flag)
		throws SubtitleDecoderException
	{
		return ((Subtitle) (decode(abyte0, i, flag)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:iload_3         
	//    4    4:invokevirtual   #565 <Method TtmlSubtitle decode(byte[], int, boolean)>
	//    5    7:areturn         
	}

	protected TtmlSubtitle decode(byte abyte0[], int i, boolean flag)
		throws SubtitleDecoderException
	{
		int j;
		int k;
		CellResolution cellresolution;
		Object obj;
		Object obj1;
		byte abyte1[];
		CellResolution cellresolution1;
		XmlPullParser xmlpullparser;
		HashMap hashmap;
		HashMap hashmap1;
		ArrayDeque arraydeque;
		TtmlNode ttmlnode;
		TtmlNode ttmlnode1;
		try
		{
			xmlpullparser = xmlParserFactory.newPullParser();
	//    0    0:aload_0         
	//    1    1:getfield        #101 <Field XmlPullParserFactory xmlParserFactory>
	//    2    4:invokevirtual   #569 <Method XmlPullParser XmlPullParserFactory.newPullParser()>
	//    3    7:astore          11
			hashmap = new HashMap();
	//    4    9:new             #571 <Class HashMap>
	//    5   12:dup             
	//    6   13:invokespecial   #572 <Method void HashMap()>
	//    7   16:astore          12
			hashmap1 = new HashMap();
	//    8   18:new             #571 <Class HashMap>
	//    9   21:dup             
	//   10   22:invokespecial   #572 <Method void HashMap()>
	//   11   25:astore          13
		}
	//*  12   27:aconst_null     
	//*  13   28:astore          7
	//*  14   30:aload           13
	//*  15   32:ldc2            #343 <String "">
	//*  16   35:new             #326 <Class TtmlRegion>
	//*  17   38:dup             
	//*  18   39:aconst_null     
	//*  19   40:invokespecial   #573 <Method void TtmlRegion(String)>
	//*  20   43:invokeinterface #320 <Method Object Map.put(Object, Object)>
	//*  21   48:pop             
	//*  22   49:iconst_0        
	//*  23   50:istore          4
	//*  24   52:aload           11
	//*  25   54:new             #575 <Class ByteArrayInputStream>
	//*  26   57:dup             
	//*  27   58:aload_1         
	//*  28   59:iconst_0        
	//*  29   60:iload_2         
	//*  30   61:invokespecial   #578 <Method void ByteArrayInputStream(byte[], int, int)>
	//*  31   64:aconst_null     
	//*  32   65:invokeinterface #582 <Method void XmlPullParser.setInput(java.io.InputStream, String)>
	//*  33   70:new             #584 <Class ArrayDeque>
	//*  34   73:dup             
	//*  35   74:invokespecial   #585 <Method void ArrayDeque()>
	//*  36   77:astore          14
	//*  37   79:aload           11
	//*  38   81:invokeinterface #588 <Method int XmlPullParser.getEventType()>
	//*  39   86:istore          5
	//*  40   88:getstatic       #82  <Field TtmlDecoder$FrameAndTickRate DEFAULT_FRAME_AND_TICK_RATE>
	//*  41   91:astore          8
	//*  42   93:getstatic       #87  <Field TtmlDecoder$CellResolution DEFAULT_CELL_RESOLUTION>
	//*  43   96:astore          6
	//*  44   98:aload           7
	//*  45  100:astore_1        
	//*  46  101:aload           8
	//*  47  103:astore          7
	//*  48  105:iload           5
	//*  49  107:iconst_1        
	//*  50  108:icmpeq          525
	//*  51  111:aload           14
	//*  52  113:invokevirtual   #592 <Method Object ArrayDeque.peek()>
	//*  53  116:checkcast       #357 <Class TtmlNode>
	//*  54  119:astore          15
	//*  55  121:iload           4
	//*  56  123:ifne            553
	//*  57  126:aload           11
	//*  58  128:invokeinterface #367 <Method String XmlPullParser.getName()>
	//*  59  133:astore          8
	//*  60  135:iload           5
	//*  61  137:iconst_2        
	//*  62  138:icmpne          375
	//*  63  141:ldc1            #122 <String "tt">
	//*  64  143:aload           8
	//*  65  145:invokevirtual   #128 <Method boolean String.equals(Object)>
	//*  66  148:ifeq            170
	//*  67  151:aload_0         
	//*  68  152:aload           11
	//*  69  154:invokespecial   #594 <Method TtmlDecoder$FrameAndTickRate parseFrameAndTickRates(XmlPullParser)>
	//*  70  157:astore          7
	//*  71  159:aload_0         
	//*  72  160:aload           11
	//*  73  162:getstatic       #87  <Field TtmlDecoder$CellResolution DEFAULT_CELL_RESOLUTION>
	//*  74  165:invokespecial   #596 <Method TtmlDecoder$CellResolution parseCellResolution(XmlPullParser, TtmlDecoder$CellResolution)>
	//*  75  168:astore          6
	//*  76  170:aload           8
	//*  77  172:invokestatic    #598 <Method boolean isSupportedTag(String)>
	//*  78  175:ifne            239
	//*  79  178:new             #178 <Class StringBuilder>
	//*  80  181:dup             
	//*  81  182:invokespecial   #179 <Method void StringBuilder()>
	//*  82  185:astore          8
	//*  83  187:aload           8
	//*  84  189:ldc2            #600 <String "Ignoring unsupported tag: ">
	//*  85  192:invokevirtual   #185 <Method StringBuilder StringBuilder.append(String)>
	//*  86  195:pop             
	//*  87  196:aload           8
	//*  88  198:aload           11
	//*  89  200:invokeinterface #367 <Method String XmlPullParser.getName()>
	//*  90  205:invokevirtual   #185 <Method StringBuilder StringBuilder.append(String)>
	//*  91  208:pop             
	//*  92  209:ldc1            #42  <String "TtmlDecoder">
	//*  93  211:aload           8
	//*  94  213:invokevirtual   #189 <Method String StringBuilder.toString()>
	//*  95  216:invokestatic    #603 <Method int Log.i(String, String)>
	//*  96  219:pop             
	//*  97  220:iload           4
	//*  98  222:iconst_1        
	//*  99  223:iadd            
	//* 100  224:istore_2        
	//* 101  225:aload           7
	//* 102  227:astore          8
	//* 103  229:aload_1         
	//* 104  230:astore          9
	//* 105  232:aload           6
	//* 106  234:astore          10
	//* 107  236:goto            491
	//* 108  239:ldc1            #130 <String "head">
	//* 109  241:aload           8
	//* 110  243:invokevirtual   #128 <Method boolean String.equals(Object)>
	//* 111  246:ifeq            279
	//* 112  249:aload_0         
	//* 113  250:aload           11
	//* 114  252:aload           12
	//* 115  254:aload           13
	//* 116  256:aload           6
	//* 117  258:invokespecial   #605 <Method Map parseHeader(XmlPullParser, Map, Map, TtmlDecoder$CellResolution)>
	//* 118  261:pop             
	//* 119  262:aload           7
	//* 120  264:astore          8
	//* 121  266:iload           4
	//* 122  268:istore_2        
	//* 123  269:aload_1         
	//* 124  270:astore          9
	//* 125  272:aload           6
	//* 126  274:astore          10
	//* 127  276:goto            491
	//* 128  279:aload_0         
	//* 129  280:aload           11
	//* 130  282:aload           15
	//* 131  284:aload           13
	//* 132  286:aload           7
	//* 133  288:invokespecial   #607 <Method TtmlNode parseNode(XmlPullParser, TtmlNode, Map, TtmlDecoder$FrameAndTickRate)>
	//* 134  291:astore          16
	//* 135  293:aload           14
	//* 136  295:aload           16
	//* 137  297:invokevirtual   #611 <Method void ArrayDeque.push(Object)>
	//* 138  300:aload           7
	//* 139  302:astore          8
	//* 140  304:iload           4
	//* 141  306:istore_2        
	//* 142  307:aload_1         
	//* 143  308:astore          9
	//* 144  310:aload           6
	//* 145  312:astore          10
	//* 146  314:aload           15
	//* 147  316:ifnull          491
	//* 148  319:aload           15
	//* 149  321:aload           16
	//* 150  323:invokevirtual   #615 <Method void TtmlNode.addChild(TtmlNode)>
	//* 151  326:aload           7
	//* 152  328:astore          8
	//* 153  330:iload           4
	//* 154  332:istore_2        
	//* 155  333:aload_1         
	//* 156  334:astore          9
	//* 157  336:aload           6
	//* 158  338:astore          10
	//* 159  340:goto            491
	//* 160  343:astore          8
	//* 161  345:ldc1            #42  <String "TtmlDecoder">
	//* 162  347:ldc2            #617 <String "Suppressing parser error">
	//* 163  350:aload           8
	//* 164  352:invokestatic    #620 <Method int Log.w(String, String, Throwable)>
	//* 165  355:pop             
	//* 166  356:iload           4
	//* 167  358:iconst_1        
	//* 168  359:iadd            
	//* 169  360:istore_2        
	//* 170  361:aload           7
	//* 171  363:astore          8
	//* 172  365:aload_1         
	//* 173  366:astore          9
	//* 174  368:aload           6
	//* 175  370:astore          10
	//* 176  372:goto            491
	//* 177  375:iload           5
	//* 178  377:iconst_4        
	//* 179  378:icmpne          413
	//* 180  381:aload           15
	//* 181  383:aload           11
	//* 182  385:invokeinterface #623 <Method String XmlPullParser.getText()>
	//* 183  390:invokestatic    #627 <Method TtmlNode TtmlNode.buildTextNode(String)>
	//* 184  393:invokevirtual   #615 <Method void TtmlNode.addChild(TtmlNode)>
	//* 185  396:aload           7
	//* 186  398:astore          8
	//* 187  400:iload           4
	//* 188  402:istore_2        
	//* 189  403:aload_1         
	//* 190  404:astore          9
	//* 191  406:aload           6
	//* 192  408:astore          10
	//* 193  410:goto            491
	//* 194  413:aload           7
	//* 195  415:astore          8
	//* 196  417:iload           4
	//* 197  419:istore_2        
	//* 198  420:aload_1         
	//* 199  421:astore          9
	//* 200  423:aload           6
	//* 201  425:astore          10
	//* 202  427:iload           5
	//* 203  429:iconst_3        
	//* 204  430:icmpne          491
	//* 205  433:aload           11
	//* 206  435:invokeinterface #367 <Method String XmlPullParser.getName()>
	//* 207  440:ldc1            #122 <String "tt">
	//* 208  442:invokevirtual   #128 <Method boolean String.equals(Object)>
	//* 209  445:ifeq            468
	//* 210  448:new             #629 <Class TtmlSubtitle>
	//* 211  451:dup             
	//* 212  452:aload           14
	//* 213  454:invokevirtual   #592 <Method Object ArrayDeque.peek()>
	//* 214  457:checkcast       #357 <Class TtmlNode>
	//* 215  460:aload           12
	//* 216  462:aload           13
	//* 217  464:invokespecial   #632 <Method void TtmlSubtitle(TtmlNode, Map, Map)>
	//* 218  467:astore_1        
	//* 219  468:aload           14
	//* 220  470:invokevirtual   #635 <Method Object ArrayDeque.pop()>
	//* 221  473:pop             
	//* 222  474:aload           7
	//* 223  476:astore          8
	//* 224  478:iload           4
	//* 225  480:istore_2        
	//* 226  481:aload_1         
	//* 227  482:astore          9
	//* 228  484:aload           6
	//* 229  486:astore          10
	//* 230  488:goto            491
	//* 231  491:aload           11
	//* 232  493:invokeinterface #287 <Method int XmlPullParser.next()>
	//* 233  498:pop             
	//* 234  499:aload           11
	//* 235  501:invokeinterface #588 <Method int XmlPullParser.getEventType()>
	//* 236  506:istore          5
	//* 237  508:aload           8
	//* 238  510:astore          7
	//* 239  512:iload_2         
	//* 240  513:istore          4
	//* 241  515:aload           9
	//* 242  517:astore_1        
	//* 243  518:aload           10
	//* 244  520:astore          6
	//* 245  522:goto            105
	//* 246  525:aload_1         
	//* 247  526:areturn         
	//* 248  527:astore_1        
	//* 249  528:new             #637 <Class IllegalStateException>
	//* 250  531:dup             
	//* 251  532:ldc2            #639 <String "Unexpected error when reading input.">
	//* 252  535:aload_1         
	//* 253  536:invokespecial   #640 <Method void IllegalStateException(String, Throwable)>
	//* 254  539:athrow          
		// Misplaced declaration of an exception variable
		catch(byte abyte0[])
	//* 255  540:astore_1        
		{
			throw new SubtitleDecoderException("Unable to decode source", ((Throwable) (abyte0)));
	//  256  541:new             #156 <Class SubtitleDecoderException>
	//  257  544:dup             
	//  258  545:ldc2            #642 <String "Unable to decode source">
	//  259  548:aload_1         
	//  260  549:invokespecial   #643 <Method void SubtitleDecoderException(String, Throwable)>
	//  261  552:athrow          
		}
		// Misplaced declaration of an exception variable
		catch(byte abyte0[])
		{
			throw new IllegalStateException("Unexpected error when reading input.", ((Throwable) (abyte0)));
		}
		obj = null;
		((Map) (hashmap1)).put("", ((Object) (new TtmlRegion(((String) (null))))));
		j = 0;
		xmlpullparser.setInput(((java.io.InputStream) (new ByteArrayInputStream(abyte0, 0, i))), ((String) (null)));
		arraydeque = new ArrayDeque();
		k = xmlpullparser.getEventType();
		obj1 = ((Object) (DEFAULT_FRAME_AND_TICK_RATE));
		cellresolution = DEFAULT_CELL_RESOLUTION;
		abyte0 = ((byte []) (obj));
		obj = obj1;
_L3:
		if(k == 1) goto _L2; else goto _L1
_L1:
		ttmlnode = (TtmlNode)arraydeque.peek();
		if(j != 0)
			break MISSING_BLOCK_LABEL_553;
		obj1 = ((Object) (xmlpullparser.getName()));
		if(k != 2)
			break MISSING_BLOCK_LABEL_375;
		if("tt".equals(obj1))
		{
			obj = ((Object) (parseFrameAndTickRates(xmlpullparser)));
			cellresolution = parseCellResolution(xmlpullparser, DEFAULT_CELL_RESOLUTION);
		}
		if(isSupportedTag(((String) (obj1))))
			break MISSING_BLOCK_LABEL_239;
		obj1 = ((Object) (new StringBuilder()));
		((StringBuilder) (obj1)).append("Ignoring unsupported tag: ");
		((StringBuilder) (obj1)).append(xmlpullparser.getName());
		Log.i("TtmlDecoder", ((StringBuilder) (obj1)).toString());
		i = j + 1;
		obj1 = obj;
		abyte1 = abyte0;
		cellresolution1 = cellresolution;
		break MISSING_BLOCK_LABEL_491;
		if(!"head".equals(obj1))
			break MISSING_BLOCK_LABEL_279;
		parseHeader(xmlpullparser, ((Map) (hashmap)), ((Map) (hashmap1)), cellresolution);
		obj1 = obj;
		i = j;
		abyte1 = abyte0;
		cellresolution1 = cellresolution;
		break MISSING_BLOCK_LABEL_491;
		ttmlnode1 = parseNode(xmlpullparser, ttmlnode, ((Map) (hashmap1)), ((FrameAndTickRate) (obj)));
		arraydeque.push(((Object) (ttmlnode1)));
		obj1 = obj;
		i = j;
		abyte1 = abyte0;
		cellresolution1 = cellresolution;
		if(ttmlnode == null)
			break MISSING_BLOCK_LABEL_491;
		ttmlnode.addChild(ttmlnode1);
		obj1 = obj;
		i = j;
		abyte1 = abyte0;
		cellresolution1 = cellresolution;
		break MISSING_BLOCK_LABEL_491;
		obj1;
		Log.w("TtmlDecoder", "Suppressing parser error", ((Throwable) (obj1)));
		i = j + 1;
		obj1 = obj;
		abyte1 = abyte0;
		cellresolution1 = cellresolution;
		break MISSING_BLOCK_LABEL_491;
		if(k != 4)
			break MISSING_BLOCK_LABEL_413;
		ttmlnode.addChild(TtmlNode.buildTextNode(xmlpullparser.getText()));
		obj1 = obj;
		i = j;
		abyte1 = abyte0;
		cellresolution1 = cellresolution;
		break MISSING_BLOCK_LABEL_491;
		obj1 = obj;
		i = j;
		abyte1 = abyte0;
		cellresolution1 = cellresolution;
		if(k != 3)
			break MISSING_BLOCK_LABEL_491;
		if(xmlpullparser.getName().equals("tt"))
			abyte0 = ((byte []) (new TtmlSubtitle((TtmlNode)arraydeque.peek(), ((Map) (hashmap)), ((Map) (hashmap1)))));
		arraydeque.pop();
		obj1 = obj;
		i = j;
		abyte1 = abyte0;
		cellresolution1 = cellresolution;
_L4:
		xmlpullparser.next();
		k = xmlpullparser.getEventType();
		obj = obj1;
		j = i;
		abyte0 = abyte1;
		cellresolution = cellresolution1;
		  goto _L3
_L2:
		return ((TtmlSubtitle) (abyte0));
		if(k == 2)
	//* 262  553:iload           5
	//* 263  555:iconst_2        
	//* 264  556:icmpne          578
		{
			i = j + 1;
	//  265  559:iload           4
	//  266  561:iconst_1        
	//  267  562:iadd            
	//  268  563:istore_2        
			obj1 = obj;
	//  269  564:aload           7
	//  270  566:astore          8
			abyte1 = abyte0;
	//  271  568:aload_1         
	//  272  569:astore          9
			cellresolution1 = cellresolution;
	//  273  571:aload           6
	//  274  573:astore          10
		} else
	//* 275  575:goto            491
		{
			obj1 = obj;
	//  276  578:aload           7
	//  277  580:astore          8
			i = j;
	//  278  582:iload           4
	//  279  584:istore_2        
			abyte1 = abyte0;
	//  280  585:aload_1         
	//  281  586:astore          9
			cellresolution1 = cellresolution;
	//  282  588:aload           6
	//  283  590:astore          10
			if(k == 3)
	//* 284  592:iload           5
	//* 285  594:iconst_3        
	//* 286  595:icmpne          491
			{
				i = j - 1;
	//  287  598:iload           4
	//  288  600:iconst_1        
	//  289  601:isub            
	//  290  602:istore_2        
				obj1 = obj;
	//  291  603:aload           7
	//  292  605:astore          8
				abyte1 = abyte0;
	//  293  607:aload_1         
	//  294  608:astore          9
				cellresolution1 = cellresolution;
	//  295  610:aload           6
	//  296  612:astore          10
			}
		}
		  goto _L4
	//* 297  614:goto            491
	}

	private static final String ATTR_BEGIN = "begin";
	private static final String ATTR_DURATION = "dur";
	private static final String ATTR_END = "end";
	private static final String ATTR_REGION = "region";
	private static final String ATTR_STYLE = "style";
	private static final Pattern CELL_RESOLUTION = Pattern.compile("^(\\d+) (\\d+)$");
	private static final Pattern CLOCK_TIME = Pattern.compile("^([0-9][0-9]+):([0-9][0-9]):([0-9][0-9])(?:(\\.[0-9]+)|:([0-9][0-9])(?:\\.([0-9]+))?)?$");
	private static final CellResolution DEFAULT_CELL_RESOLUTION = new CellResolution(32, 15);
	private static final FrameAndTickRate DEFAULT_FRAME_AND_TICK_RATE = new FrameAndTickRate(30F, 1, 1);
	private static final int DEFAULT_FRAME_RATE = 30;
	private static final Pattern FONT_SIZE = Pattern.compile("^(([0-9]*.)?[0-9]+)(px|em|%)$");
	private static final Pattern OFFSET_TIME = Pattern.compile("^([0-9]+(?:\\.[0-9]+)?)(h|m|s|ms|f|t)$");
	private static final Pattern PERCENTAGE_COORDINATES = Pattern.compile("^(\\d+\\.?\\d*?)% (\\d+\\.?\\d*?)%$");
	private static final String TAG = "TtmlDecoder";
	private static final String TTP = "http://www.w3.org/ns/ttml#parameter";
	private final XmlPullParserFactory xmlParserFactory;

	static 
	{
	//    0    0:ldc1            #51  <String "^([0-9][0-9]+):([0-9][0-9]):([0-9][0-9])(?:(\\.[0-9]+)|:([0-9][0-9])(?:\\.([0-9]+))?)?$">
	//    1    2:invokestatic    #57  <Method Pattern Pattern.compile(String)>
	//    2    5:putstatic       #59  <Field Pattern CLOCK_TIME>
	//    3    8:ldc1            #61  <String "^([0-9]+(?:\\.[0-9]+)?)(h|m|s|ms|f|t)$">
	//    4   10:invokestatic    #57  <Method Pattern Pattern.compile(String)>
	//    5   13:putstatic       #63  <Field Pattern OFFSET_TIME>
	//    6   16:ldc1            #65  <String "^(([0-9]*.)?[0-9]+)(px|em|%)$">
	//    7   18:invokestatic    #57  <Method Pattern Pattern.compile(String)>
	//    8   21:putstatic       #67  <Field Pattern FONT_SIZE>
	//    9   24:ldc1            #69  <String "^(\\d+\\.?\\d*?)% (\\d+\\.?\\d*?)%$">
	//   10   26:invokestatic    #57  <Method Pattern Pattern.compile(String)>
	//   11   29:putstatic       #71  <Field Pattern PERCENTAGE_COORDINATES>
	//   12   32:ldc1            #73  <String "^(\\d+) (\\d+)$">
	//   13   34:invokestatic    #57  <Method Pattern Pattern.compile(String)>
	//   14   37:putstatic       #75  <Field Pattern CELL_RESOLUTION>
	//   15   40:new             #9   <Class TtmlDecoder$FrameAndTickRate>
	//   16   43:dup             
	//   17   44:ldc1            #76  <Float 30F>
	//   18   46:iconst_1        
	//   19   47:iconst_1        
	//   20   48:invokespecial   #80  <Method void TtmlDecoder$FrameAndTickRate(float, int, int)>
	//   21   51:putstatic       #82  <Field TtmlDecoder$FrameAndTickRate DEFAULT_FRAME_AND_TICK_RATE>
	//   22   54:new             #6   <Class TtmlDecoder$CellResolution>
	//   23   57:dup             
	//   24   58:bipush          32
	//   25   60:bipush          15
	//   26   62:invokespecial   #85  <Method void TtmlDecoder$CellResolution(int, int)>
	//   27   65:putstatic       #87  <Field TtmlDecoder$CellResolution DEFAULT_CELL_RESOLUTION>
	//*  28   68:return          
	}
}

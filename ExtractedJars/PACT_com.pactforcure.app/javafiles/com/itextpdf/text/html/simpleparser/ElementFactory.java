// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.html.simpleparser;

import com.itextpdf.text.*;
import com.itextpdf.text.html.HtmlUtilities;
import com.itextpdf.text.pdf.HyphenationAuto;
import com.itextpdf.text.pdf.HyphenationEvent;
import com.itextpdf.text.pdf.draw.LineSeparator;
import java.io.File;
import java.io.IOException;
import java.util.*;

// Referenced classes of package com.itextpdf.text.html.simpleparser:
//			ChainedProperties, ImageProvider

public class ElementFactory
{

	public ElementFactory()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
		provider = ((FontProvider) (FontFactory.getFontImp()));
	//    2    4:aload_0         
	//    3    5:invokestatic    #17  <Method com.itextpdf.text.FontFactoryImp FontFactory.getFontImp()>
	//    4    8:putfield        #19  <Field FontProvider provider>
	//    5   11:return          
	}

	protected static void setParagraphLeading(Paragraph paragraph, String s)
	{
		float f;
		if(s == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       12
		{
			paragraph.setLeading(0.0F, 1.5F);
	//    2    4:aload_0         
	//    3    5:fconst_0        
	//    4    6:ldc1            #25  <Float 1.5F>
	//    5    8:invokevirtual   #31  <Method void Paragraph.setLeading(float, float)>
			return;
	//    6   11:return          
		}
		try
		{
			s = ((String) (new StringTokenizer(s, " ,")));
	//    7   12:new             #33  <Class StringTokenizer>
	//    8   15:dup             
	//    9   16:aload_1         
	//   10   17:ldc1            #35  <String " ,">
	//   11   19:invokespecial   #38  <Method void StringTokenizer(String, String)>
	//   12   22:astore_1        
			f = Float.parseFloat(((StringTokenizer) (s)).nextToken());
	//   13   23:aload_1         
	//   14   24:invokevirtual   #42  <Method String StringTokenizer.nextToken()>
	//   15   27:invokestatic    #48  <Method float Float.parseFloat(String)>
	//   16   30:fstore_2        
			if(!((StringTokenizer) (s)).hasMoreTokens())
	//*  17   31:aload_1         
	//*  18   32:invokevirtual   #52  <Method boolean StringTokenizer.hasMoreTokens()>
	//*  19   35:ifne            54
			{
				paragraph.setLeading(f, 0.0F);
	//   20   38:aload_0         
	//   21   39:fload_2         
	//   22   40:fconst_0        
	//   23   41:invokevirtual   #31  <Method void Paragraph.setLeading(float, float)>
				return;
	//   24   44:return          
			}
		}
		// Misplaced declaration of an exception variable
		catch(String s)
	//*  25   45:astore_1        
		{
			paragraph.setLeading(0.0F, 1.5F);
	//   26   46:aload_0         
	//   27   47:fconst_0        
	//   28   48:ldc1            #25  <Float 1.5F>
	//   29   50:invokevirtual   #31  <Method void Paragraph.setLeading(float, float)>
			return;
	//   30   53:return          
		}
		paragraph.setLeading(f, Float.parseFloat(((StringTokenizer) (s)).nextToken()));
	//   31   54:aload_0         
	//   32   55:fload_2         
	//   33   56:aload_1         
	//   34   57:invokevirtual   #42  <Method String StringTokenizer.nextToken()>
	//   35   60:invokestatic    #48  <Method float Float.parseFloat(String)>
	//   36   63:invokevirtual   #31  <Method void Paragraph.setLeading(float, float)>
		return;
	//   37   66:return          
	}

	public Chunk createChunk(String s, ChainedProperties chainedproperties)
	{
		Font font;
		font = getFont(chainedproperties);
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:invokevirtual   #58  <Method Font getFont(ChainedProperties)>
	//    3    5:astore_3        
		s = ((String) (new Chunk(s, font)));
	//    4    6:new             #60  <Class Chunk>
	//    5    9:dup             
	//    6   10:aload_1         
	//    7   11:aload_3         
	//    8   12:invokespecial   #63  <Method void Chunk(String, Font)>
	//    9   15:astore_1        
		if(!chainedproperties.hasProperty("sub")) goto _L2; else goto _L1
	//   10   16:aload_2         
	//   11   17:ldc1            #65  <String "sub">
	//   12   19:invokevirtual   #71  <Method boolean ChainedProperties.hasProperty(String)>
	//   13   22:ifeq            49
_L1:
		((Chunk) (s)).setTextRise(-font.getSize() / 2.0F);
	//   14   25:aload_1         
	//   15   26:aload_3         
	//   16   27:invokevirtual   #77  <Method float Font.getSize()>
	//   17   30:fneg            
	//   18   31:fconst_2        
	//   19   32:fdiv            
	//   20   33:invokevirtual   #81  <Method Chunk Chunk.setTextRise(float)>
	//   21   36:pop             
_L4:
		((Chunk) (s)).setHyphenation(getHyphenation(chainedproperties));
	//   22   37:aload_1         
	//   23   38:aload_0         
	//   24   39:aload_2         
	//   25   40:invokevirtual   #85  <Method HyphenationEvent getHyphenation(ChainedProperties)>
	//   26   43:invokevirtual   #89  <Method Chunk Chunk.setHyphenation(HyphenationEvent)>
	//   27   46:pop             
		return ((Chunk) (s));
	//   28   47:aload_1         
	//   29   48:areturn         
_L2:
		if(chainedproperties.hasProperty("sup"))
	//*  30   49:aload_2         
	//*  31   50:ldc1            #91  <String "sup">
	//*  32   52:invokevirtual   #71  <Method boolean ChainedProperties.hasProperty(String)>
	//*  33   55:ifeq            37
			((Chunk) (s)).setTextRise(font.getSize() / 2.0F);
	//   34   58:aload_1         
	//   35   59:aload_3         
	//   36   60:invokevirtual   #77  <Method float Font.getSize()>
	//   37   63:fconst_2        
	//   38   64:fdiv            
	//   39   65:invokevirtual   #81  <Method Chunk Chunk.setTextRise(float)>
	//   40   68:pop             
		if(true) goto _L4; else goto _L3
	//   41   69:goto            37
_L3:
	}

	public Image createImage(String s, Map map, ChainedProperties chainedproperties, DocListener doclistener, ImageProvider imageprovider, HashMap hashmap, String s1)
		throws DocumentException, IOException
	{
		Image image = null;
	//    0    0:aconst_null     
	//    1    1:astore          10
		if(imageprovider != null)
	//*   2    3:aload           5
	//*   3    5:ifnull          22
			image = imageprovider.getImage(s, map, chainedproperties, doclistener);
	//    4    8:aload           5
	//    5   10:aload_1         
	//    6   11:aload_2         
	//    7   12:aload_3         
	//    8   13:aload           4
	//    9   15:invokeinterface #103 <Method Image ImageProvider.getImage(String, Map, ChainedProperties, DocListener)>
	//   10   20:astore          10
		imageprovider = ((ImageProvider) (image));
	//   11   22:aload           10
	//   12   24:astore          5
		if(image == null)
	//*  13   26:aload           10
	//*  14   28:ifnonnull       67
		{
			imageprovider = ((ImageProvider) (image));
	//   15   31:aload           10
	//   16   33:astore          5
			if(hashmap != null)
	//*  17   35:aload           6
	//*  18   37:ifnull          67
			{
				doclistener = ((DocListener) ((Image)hashmap.get(((Object) (s)))));
	//   19   40:aload           6
	//   20   42:aload_1         
	//   21   43:invokevirtual   #109 <Method Object HashMap.get(Object)>
	//   22   46:checkcast       #111 <Class Image>
	//   23   49:astore          4
				imageprovider = ((ImageProvider) (image));
	//   24   51:aload           10
	//   25   53:astore          5
				if(doclistener != null)
	//*  26   55:aload           4
	//*  27   57:ifnull          67
					imageprovider = ((ImageProvider) (Image.getInstance(((Image) (doclistener)))));
	//   28   60:aload           4
	//   29   62:invokestatic    #115 <Method Image Image.getInstance(Image)>
	//   30   65:astore          5
			}
		}
		if(imageprovider != null)
	//*  31   67:aload           5
	//*  32   69:ifnull          75
			return ((Image) (imageprovider));
	//   33   72:aload           5
	//   34   74:areturn         
		if(s.startsWith("http") || s1 == null) goto _L2; else goto _L1
	//   35   75:aload_1         
	//   36   76:ldc1            #117 <String "http">
	//   37   78:invokevirtual   #122 <Method boolean String.startsWith(String)>
	//   38   81:ifne            122
	//   39   84:aload           7
	//   40   86:ifnull          122
_L1:
		doclistener = ((DocListener) ((new StringBuilder()).append(s1).append(s).toString()));
	//   41   89:new             #124 <Class StringBuilder>
	//   42   92:dup             
	//   43   93:invokespecial   #125 <Method void StringBuilder()>
	//   44   96:aload           7
	//   45   98:invokevirtual   #129 <Method StringBuilder StringBuilder.append(String)>
	//   46  101:aload_1         
	//   47  102:invokevirtual   #129 <Method StringBuilder StringBuilder.append(String)>
	//   48  105:invokevirtual   #132 <Method String StringBuilder.toString()>
	//   49  108:astore          4
_L4:
		s = ((String) (Image.getInstance(((String) (doclistener)))));
	//   50  110:aload           4
	//   51  112:invokestatic    #135 <Method Image Image.getInstance(String)>
	//   52  115:astore_1        
		if(s == null)
	//*  53  116:aload_1         
	//*  54  117:ifnonnull       181
			return null;
	//   55  120:aconst_null     
	//   56  121:areturn         
		break; /* Loop/switch isn't completed */
_L2:
		doclistener = ((DocListener) (s));
	//   57  122:aload_1         
	//   58  123:astore          4
		if(imageprovider == null)
	//*  59  125:aload           5
	//*  60  127:ifnonnull       110
		{
			doclistener = ((DocListener) (s));
	//   61  130:aload_1         
	//   62  131:astore          4
			if(!s.startsWith("http"))
	//*  63  133:aload_1         
	//*  64  134:ldc1            #117 <String "http">
	//*  65  136:invokevirtual   #122 <Method boolean String.startsWith(String)>
	//*  66  139:ifne            110
			{
				imageprovider = ((ImageProvider) (chainedproperties.getProperty("image_path")));
	//   67  142:aload_3         
	//   68  143:ldc1            #137 <String "image_path">
	//   69  145:invokevirtual   #141 <Method String ChainedProperties.getProperty(String)>
	//   70  148:astore          5
				doclistener = ((DocListener) (imageprovider));
	//   71  150:aload           5
	//   72  152:astore          4
				if(imageprovider == null)
	//*  73  154:aload           5
	//*  74  156:ifnonnull       163
					doclistener = "";
	//   75  159:ldc1            #143 <String "">
	//   76  161:astore          4
				doclistener = ((DocListener) ((new File(((String) (doclistener)), s)).getPath()));
	//   77  163:new             #145 <Class File>
	//   78  166:dup             
	//   79  167:aload           4
	//   80  169:aload_1         
	//   81  170:invokespecial   #146 <Method void File(String, String)>
	//   82  173:invokevirtual   #149 <Method String File.getPath()>
	//   83  176:astore          4
			}
		}
		if(true) goto _L4; else goto _L3
	//   84  178:goto            110
_L3:
		float f;
		float f1;
		f1 = HtmlUtilities.parseLength(chainedproperties.getProperty("size"), 12F);
	//   85  181:aload_3         
	//   86  182:ldc1            #151 <String "size">
	//   87  184:invokevirtual   #141 <Method String ChainedProperties.getProperty(String)>
	//   88  187:ldc1            #152 <Float 12F>
	//   89  189:invokestatic    #158 <Method float HtmlUtilities.parseLength(String, float)>
	//   90  192:fstore          9
		f = f1;
	//   91  194:fload           9
	//   92  196:fstore          8
		if(f1 <= 0.0F)
	//*  93  198:fload           9
	//*  94  200:fconst_0        
	//*  95  201:fcmpg           
	//*  96  202:ifgt            209
			f = 12F;
	//   97  205:ldc1            #152 <Float 12F>
	//   98  207:fstore          8
		f1 = HtmlUtilities.parseLength((String)map.get("width"), f);
	//   99  209:aload_2         
	//  100  210:ldc1            #160 <String "width">
	//  101  212:invokeinterface #163 <Method Object Map.get(Object)>
	//  102  217:checkcast       #119 <Class String>
	//  103  220:fload           8
	//  104  222:invokestatic    #158 <Method float HtmlUtilities.parseLength(String, float)>
	//  105  225:fstore          9
		f = HtmlUtilities.parseLength((String)map.get("height"), f);
	//  106  227:aload_2         
	//  107  228:ldc1            #165 <String "height">
	//  108  230:invokeinterface #163 <Method Object Map.get(Object)>
	//  109  235:checkcast       #119 <Class String>
	//  110  238:fload           8
	//  111  240:invokestatic    #158 <Method float HtmlUtilities.parseLength(String, float)>
	//  112  243:fstore          8
		if(f1 <= 0.0F || f <= 0.0F) goto _L6; else goto _L5
	//  113  245:fload           9
	//  114  247:fconst_0        
	//  115  248:fcmpl           
	//  116  249:ifle            312
	//  117  252:fload           8
	//  118  254:fconst_0        
	//  119  255:fcmpl           
	//  120  256:ifle            312
_L5:
		((Image) (s)).scaleAbsolute(f1, f);
	//  121  259:aload_1         
	//  122  260:fload           9
	//  123  262:fload           8
	//  124  264:invokevirtual   #168 <Method void Image.scaleAbsolute(float, float)>
_L8:
		map = ((Map) (chainedproperties.getProperty("before")));
	//  125  267:aload_3         
	//  126  268:ldc1            #170 <String "before">
	//  127  270:invokevirtual   #141 <Method String ChainedProperties.getProperty(String)>
	//  128  273:astore_2        
		if(map != null)
	//* 129  274:aload_2         
	//* 130  275:ifnull          286
			((Image) (s)).setSpacingBefore(Float.parseFloat(((String) (map))));
	//  131  278:aload_1         
	//  132  279:aload_2         
	//  133  280:invokestatic    #48  <Method float Float.parseFloat(String)>
	//  134  283:invokevirtual   #174 <Method void Image.setSpacingBefore(float)>
		map = ((Map) (chainedproperties.getProperty("after")));
	//  135  286:aload_3         
	//  136  287:ldc1            #176 <String "after">
	//  137  289:invokevirtual   #141 <Method String ChainedProperties.getProperty(String)>
	//  138  292:astore_2        
		if(map != null)
	//* 139  293:aload_2         
	//* 140  294:ifnull          305
			((Image) (s)).setSpacingAfter(Float.parseFloat(((String) (map))));
	//  141  297:aload_1         
	//  142  298:aload_2         
	//  143  299:invokestatic    #48  <Method float Float.parseFloat(String)>
	//  144  302:invokevirtual   #179 <Method void Image.setSpacingAfter(float)>
		((Image) (s)).setWidthPercentage(0.0F);
	//  145  305:aload_1         
	//  146  306:fconst_0        
	//  147  307:invokevirtual   #182 <Method void Image.setWidthPercentage(float)>
		return ((Image) (s));
	//  148  310:aload_1         
	//  149  311:areturn         
_L6:
		if(f1 > 0.0F)
	//* 150  312:fload           9
	//* 151  314:fconst_0        
	//* 152  315:fcmpl           
	//* 153  316:ifle            340
			((Image) (s)).scaleAbsolute(f1, (((Image) (s)).getHeight() * f1) / ((Image) (s)).getWidth());
	//  154  319:aload_1         
	//  155  320:fload           9
	//  156  322:aload_1         
	//  157  323:invokevirtual   #185 <Method float Image.getHeight()>
	//  158  326:fload           9
	//  159  328:fmul            
	//  160  329:aload_1         
	//  161  330:invokevirtual   #188 <Method float Image.getWidth()>
	//  162  333:fdiv            
	//  163  334:invokevirtual   #168 <Method void Image.scaleAbsolute(float, float)>
		else
	//* 164  337:goto            267
		if(f > 0.0F)
	//* 165  340:fload           8
	//* 166  342:fconst_0        
	//* 167  343:fcmpl           
	//* 168  344:ifle            267
			((Image) (s)).scaleAbsolute((((Image) (s)).getWidth() * f) / ((Image) (s)).getHeight(), f);
	//  169  347:aload_1         
	//  170  348:aload_1         
	//  171  349:invokevirtual   #188 <Method float Image.getWidth()>
	//  172  352:fload           8
	//  173  354:fmul            
	//  174  355:aload_1         
	//  175  356:invokevirtual   #185 <Method float Image.getHeight()>
	//  176  359:fdiv            
	//  177  360:fload           8
	//  178  362:invokevirtual   #168 <Method void Image.scaleAbsolute(float, float)>
		if(true) goto _L8; else goto _L7
	//  179  365:goto            267
_L7:
	}

	public LineSeparator createLineSeparator(Map map, float f)
	{
		float f1 = 1.0F;
	//    0    0:fconst_1        
	//    1    1:fstore_3        
		String s = (String)map.get("size");
	//    2    2:aload_1         
	//    3    3:ldc1            #151 <String "size">
	//    4    5:invokeinterface #163 <Method Object Map.get(Object)>
	//    5   10:checkcast       #119 <Class String>
	//    6   13:astore          7
		float f2 = f1;
	//    7   15:fload_3         
	//    8   16:fstore          4
		if(s != null)
	//*   9   18:aload           7
	//*  10   20:ifnull          46
		{
			float f3 = HtmlUtilities.parseLength(s, 12F);
	//   11   23:aload           7
	//   12   25:ldc1            #152 <Float 12F>
	//   13   27:invokestatic    #158 <Method float HtmlUtilities.parseLength(String, float)>
	//   14   30:fstore          5
			f2 = f1;
	//   15   32:fload_3         
	//   16   33:fstore          4
			if(f3 > 0.0F)
	//*  17   35:fload           5
	//*  18   37:fconst_0        
	//*  19   38:fcmpl           
	//*  20   39:ifle            46
				f2 = f3;
	//   21   42:fload           5
	//   22   44:fstore          4
		}
		s = (String)map.get("width");
	//   23   46:aload_1         
	//   24   47:ldc1            #160 <String "width">
	//   25   49:invokeinterface #163 <Method Object Map.get(Object)>
	//   26   54:checkcast       #119 <Class String>
	//   27   57:astore          7
		float f4 = 100F;
	//   28   59:ldc1            #194 <Float 100F>
	//   29   61:fstore          5
		f1 = f4;
	//   30   63:fload           5
	//   31   65:fstore_3        
		if(s != null)
	//*  32   66:aload           7
	//*  33   68:ifnull          106
		{
			float f5 = HtmlUtilities.parseLength(s, 12F);
	//   34   71:aload           7
	//   35   73:ldc1            #152 <Float 12F>
	//   36   75:invokestatic    #158 <Method float HtmlUtilities.parseLength(String, float)>
	//   37   78:fstore          6
			f1 = f4;
	//   38   80:fload           5
	//   39   82:fstore_3        
			if(f5 > 0.0F)
	//*  40   83:fload           6
	//*  41   85:fconst_0        
	//*  42   86:fcmpl           
	//*  43   87:ifle            93
				f1 = f5;
	//   44   90:fload           6
	//   45   92:fstore_3        
			if(!s.endsWith("%"))
	//*  46   93:aload           7
	//*  47   95:ldc1            #196 <String "%">
	//*  48   97:invokevirtual   #199 <Method boolean String.endsWith(String)>
	//*  49  100:ifne            106
				f1 = 100F;
	//   50  103:ldc1            #194 <Float 100F>
	//   51  105:fstore_3        
		}
		return new LineSeparator(f2, f1, ((com.itextpdf.text.BaseColor) (null)), HtmlUtilities.alignmentValue((String)map.get("align")), f);
	//   52  106:new             #201 <Class LineSeparator>
	//   53  109:dup             
	//   54  110:fload           4
	//   55  112:fload_3         
	//   56  113:aconst_null     
	//   57  114:aload_1         
	//   58  115:ldc1            #203 <String "align">
	//   59  117:invokeinterface #163 <Method Object Map.get(Object)>
	//   60  122:checkcast       #119 <Class String>
	//   61  125:invokestatic    #207 <Method int HtmlUtilities.alignmentValue(String)>
	//   62  128:fload_2         
	//   63  129:invokespecial   #210 <Method void LineSeparator(float, float, com.itextpdf.text.BaseColor, int, float)>
	//   64  132:areturn         
	}

	public List createList(String s, ChainedProperties chainedproperties)
	{
		if("ul".equalsIgnoreCase(s))
	//*   0    0:ldc1            #215 <String "ul">
	//*   1    2:aload_1         
	//*   2    3:invokevirtual   #218 <Method boolean String.equalsIgnoreCase(String)>
	//*   3    6:ifeq            46
		{
			s = ((String) (new List(false)));
	//    4    9:new             #220 <Class List>
	//    5   12:dup             
	//    6   13:iconst_0        
	//    7   14:invokespecial   #223 <Method void List(boolean)>
	//    8   17:astore_1        
			((List) (s)).setListSymbol("\u2022 ");
	//    9   18:aload_1         
	//   10   19:ldc1            #225 <String "\u2022 ">
	//   11   21:invokevirtual   #229 <Method void List.setListSymbol(String)>
		} else
	//*  12   24:aload_1         
	//*  13   25:new             #44  <Class Float>
	//*  14   28:dup             
	//*  15   29:aload_2         
	//*  16   30:ldc1            #231 <String "indent">
	//*  17   32:invokevirtual   #141 <Method String ChainedProperties.getProperty(String)>
	//*  18   35:invokespecial   #233 <Method void Float(String)>
	//*  19   38:invokevirtual   #236 <Method float Float.floatValue()>
	//*  20   41:invokevirtual   #239 <Method void List.setIndentationLeft(float)>
	//*  21   44:aload_1         
	//*  22   45:areturn         
		{
			s = ((String) (new List(true)));
	//   23   46:new             #220 <Class List>
	//   24   49:dup             
	//   25   50:iconst_1        
	//   26   51:invokespecial   #223 <Method void List(boolean)>
	//   27   54:astore_1        
		}
		try
		{
			((List) (s)).setIndentationLeft((new Float(chainedproperties.getProperty("indent"))).floatValue());
		}
	//*  28   55:goto            24
		// Misplaced declaration of an exception variable
		catch(ChainedProperties chainedproperties)
	//*  29   58:astore_2        
		{
			((List) (s)).setAutoindent(true);
	//   30   59:aload_1         
	//   31   60:iconst_1        
	//   32   61:invokevirtual   #242 <Method void List.setAutoindent(boolean)>
			return ((List) (s));
	//   33   64:aload_1         
	//   34   65:areturn         
		}
		return ((List) (s));
	}

	public ListItem createListItem(ChainedProperties chainedproperties)
	{
		ListItem listitem = new ListItem();
	//    0    0:new             #246 <Class ListItem>
	//    1    3:dup             
	//    2    4:invokespecial   #247 <Method void ListItem()>
	//    3    7:astore_2        
		updateElement(((Paragraph) (listitem)), chainedproperties);
	//    4    8:aload_0         
	//    5    9:aload_2         
	//    6   10:aload_1         
	//    7   11:invokevirtual   #251 <Method void updateElement(Paragraph, ChainedProperties)>
		return listitem;
	//    8   14:aload_2         
	//    9   15:areturn         
	}

	public Paragraph createParagraph(ChainedProperties chainedproperties)
	{
		Paragraph paragraph = new Paragraph();
	//    0    0:new             #27  <Class Paragraph>
	//    1    3:dup             
	//    2    4:invokespecial   #254 <Method void Paragraph()>
	//    3    7:astore_2        
		updateElement(paragraph, chainedproperties);
	//    4    8:aload_0         
	//    5    9:aload_2         
	//    6   10:aload_1         
	//    7   11:invokevirtual   #251 <Method void updateElement(Paragraph, ChainedProperties)>
		return paragraph;
	//    8   14:aload_2         
	//    9   15:areturn         
	}

	public Font getFont(ChainedProperties chainedproperties)
	{
		float f;
		int i;
		int j;
		String s;
		String s2;
		String s3;
label0:
		{
			String s1 = chainedproperties.getProperty("face");
	//    0    0:aload_1         
	//    1    1:ldc2            #256 <String "face">
	//    2    4:invokevirtual   #141 <Method String ChainedProperties.getProperty(String)>
	//    3    7:astore          6
			if(s1 != null)
	//*   4    9:aload           6
	//*   5   11:ifnull          29
			{
				s = s1;
	//    6   14:aload           6
	//    7   16:astore          5
				if(s1.trim().length() != 0)
					break label0;
	//    8   18:aload           6
	//    9   20:invokevirtual   #259 <Method String String.trim()>
	//   10   23:invokevirtual   #263 <Method int String.length()>
	//   11   26:ifne            38
			}
			s = chainedproperties.getProperty("font-family");
	//   12   29:aload_1         
	//   13   30:ldc2            #265 <String "font-family">
	//   14   33:invokevirtual   #141 <Method String ChainedProperties.getProperty(String)>
	//   15   36:astore          5
		}
label1:
		{
			s2 = s;
	//   16   38:aload           5
	//   17   40:astore          6
			if(s == null)
				break label1;
	//   18   42:aload           5
	//   19   44:ifnull          158
			StringTokenizer stringtokenizer = new StringTokenizer(s, ",");
	//   20   47:new             #33  <Class StringTokenizer>
	//   21   50:dup             
	//   22   51:aload           5
	//   23   53:ldc2            #267 <String ",">
	//   24   56:invokespecial   #38  <Method void StringTokenizer(String, String)>
	//   25   59:astore          7
			s2 = s;
	//   26   61:aload           5
	//   27   63:astore          6
			do
			{
				if(!stringtokenizer.hasMoreTokens())
					break label1;
	//   28   65:aload           7
	//   29   67:invokevirtual   #52  <Method boolean StringTokenizer.hasMoreTokens()>
	//   30   70:ifeq            158
				s = stringtokenizer.nextToken().trim();
	//   31   73:aload           7
	//   32   75:invokevirtual   #42  <Method String StringTokenizer.nextToken()>
	//   33   78:invokevirtual   #259 <Method String String.trim()>
	//   34   81:astore          5
				s2 = s;
	//   35   83:aload           5
	//   36   85:astore          6
				if(s.startsWith("\""))
	//*  37   87:aload           5
	//*  38   89:ldc2            #269 <String "\"">
	//*  39   92:invokevirtual   #122 <Method boolean String.startsWith(String)>
	//*  40   95:ifeq            106
					s2 = s.substring(1);
	//   41   98:aload           5
	//   42  100:iconst_1        
	//   43  101:invokevirtual   #273 <Method String String.substring(int)>
	//   44  104:astore          6
				s = s2;
	//   45  106:aload           6
	//   46  108:astore          5
				if(s2.endsWith("\""))
	//*  47  110:aload           6
	//*  48  112:ldc2            #269 <String "\"">
	//*  49  115:invokevirtual   #199 <Method boolean String.endsWith(String)>
	//*  50  118:ifeq            136
					s = s2.substring(0, s2.length() - 1);
	//   51  121:aload           6
	//   52  123:iconst_0        
	//   53  124:aload           6
	//   54  126:invokevirtual   #263 <Method int String.length()>
	//   55  129:iconst_1        
	//   56  130:isub            
	//   57  131:invokevirtual   #276 <Method String String.substring(int, int)>
	//   58  134:astore          5
				s2 = s;
	//   59  136:aload           5
	//   60  138:astore          6
			} while(!provider.isRegistered(s));
	//   61  140:aload_0         
	//   62  141:getfield        #19  <Field FontProvider provider>
	//   63  144:aload           5
	//   64  146:invokeinterface #281 <Method boolean FontProvider.isRegistered(String)>
	//   65  151:ifeq            65
			s2 = s;
	//   66  154:aload           5
	//   67  156:astore          6
		}
		s3 = chainedproperties.getProperty("encoding");
	//   68  158:aload_1         
	//   69  159:ldc2            #283 <String "encoding">
	//   70  162:invokevirtual   #141 <Method String ChainedProperties.getProperty(String)>
	//   71  165:astore          7
		s = s3;
	//   72  167:aload           7
	//   73  169:astore          5
		if(s3 == null)
	//*  74  171:aload           7
	//*  75  173:ifnonnull       181
			s = "Cp1252";
	//   76  176:ldc2            #285 <String "Cp1252">
	//   77  179:astore          5
		s3 = chainedproperties.getProperty("size");
	//   78  181:aload_1         
	//   79  182:ldc1            #151 <String "size">
	//   80  184:invokevirtual   #141 <Method String ChainedProperties.getProperty(String)>
	//   81  187:astore          7
		f = 12F;
	//   82  189:ldc1            #152 <Float 12F>
	//   83  191:fstore_2        
		if(s3 != null)
	//*  84  192:aload           7
	//*  85  194:ifnull          203
			f = Float.parseFloat(s3);
	//   86  197:aload           7
	//   87  199:invokestatic    #48  <Method float Float.parseFloat(String)>
	//   88  202:fstore_2        
		j = 0;
	//   89  203:iconst_0        
	//   90  204:istore          4
		s3 = chainedproperties.getProperty("text-decoration");
	//   91  206:aload_1         
	//   92  207:ldc2            #287 <String "text-decoration">
	//   93  210:invokevirtual   #141 <Method String ChainedProperties.getProperty(String)>
	//   94  213:astore          7
		i = j;
	//   95  215:iload           4
	//   96  217:istore_3        
		if(s3 == null) goto _L2; else goto _L1
	//   97  218:aload           7
	//   98  220:ifnull          252
_L1:
		i = j;
	//   99  223:iload           4
	//  100  225:istore_3        
		if(s3.trim().length() == 0) goto _L2; else goto _L3
	//  101  226:aload           7
	//  102  228:invokevirtual   #259 <Method String String.trim()>
	//  103  231:invokevirtual   #263 <Method int String.length()>
	//  104  234:ifeq            252
_L3:
		if(!"underline".equals(((Object) (s3)))) goto _L5; else goto _L4
	//  105  237:ldc2            #289 <String "underline">
	//  106  240:aload           7
	//  107  242:invokevirtual   #293 <Method boolean String.equals(Object)>
	//  108  245:ifeq            354
_L4:
		i = 0 | 4;
	//  109  248:iconst_0        
	//  110  249:iconst_4        
	//  111  250:ior             
	//  112  251:istore_3        
_L2:
		j = i;
	//  113  252:iload_3         
	//  114  253:istore          4
		if(chainedproperties.hasProperty("i"))
	//* 115  255:aload_1         
	//* 116  256:ldc2            #295 <String "i">
	//* 117  259:invokevirtual   #71  <Method boolean ChainedProperties.hasProperty(String)>
	//* 118  262:ifeq            270
			j = i | 2;
	//  119  265:iload_3         
	//  120  266:iconst_2        
	//  121  267:ior             
	//  122  268:istore          4
		i = j;
	//  123  270:iload           4
	//  124  272:istore_3        
		if(chainedproperties.hasProperty("b"))
	//* 125  273:aload_1         
	//* 126  274:ldc2            #297 <String "b">
	//* 127  277:invokevirtual   #71  <Method boolean ChainedProperties.hasProperty(String)>
	//* 128  280:ifeq            288
			i = j | 1;
	//  129  283:iload           4
	//  130  285:iconst_1        
	//  131  286:ior             
	//  132  287:istore_3        
		j = i;
	//  133  288:iload_3         
	//  134  289:istore          4
		if(chainedproperties.hasProperty("u"))
	//* 135  291:aload_1         
	//* 136  292:ldc2            #299 <String "u">
	//* 137  295:invokevirtual   #71  <Method boolean ChainedProperties.hasProperty(String)>
	//* 138  298:ifeq            306
			j = i | 4;
	//  139  301:iload_3         
	//  140  302:iconst_4        
	//  141  303:ior             
	//  142  304:istore          4
		i = j;
	//  143  306:iload           4
	//  144  308:istore_3        
		if(chainedproperties.hasProperty("s"))
	//* 145  309:aload_1         
	//* 146  310:ldc2            #301 <String "s">
	//* 147  313:invokevirtual   #71  <Method boolean ChainedProperties.hasProperty(String)>
	//* 148  316:ifeq            325
			i = j | 8;
	//  149  319:iload           4
	//  150  321:bipush          8
	//  151  323:ior             
	//  152  324:istore_3        
		chainedproperties = ((ChainedProperties) (HtmlUtilities.decodeColor(chainedproperties.getProperty("color"))));
	//  153  325:aload_1         
	//  154  326:ldc2            #303 <String "color">
	//  155  329:invokevirtual   #141 <Method String ChainedProperties.getProperty(String)>
	//  156  332:invokestatic    #307 <Method com.itextpdf.text.BaseColor HtmlUtilities.decodeColor(String)>
	//  157  335:astore_1        
		return provider.getFont(s2, s, true, f, i, ((com.itextpdf.text.BaseColor) (chainedproperties)));
	//  158  336:aload_0         
	//  159  337:getfield        #19  <Field FontProvider provider>
	//  160  340:aload           6
	//  161  342:aload           5
	//  162  344:iconst_1        
	//  163  345:fload_2         
	//  164  346:iload_3         
	//  165  347:aload_1         
	//  166  348:invokeinterface #310 <Method Font FontProvider.getFont(String, String, boolean, float, int, com.itextpdf.text.BaseColor)>
	//  167  353:areturn         
_L5:
		i = j;
	//  168  354:iload           4
	//  169  356:istore_3        
		if("line-through".equals(((Object) (s3))))
	//* 170  357:ldc2            #312 <String "line-through">
	//* 171  360:aload           7
	//* 172  362:invokevirtual   #293 <Method boolean String.equals(Object)>
	//* 173  365:ifeq            252
			i = 0 | 8;
	//  174  368:iconst_0        
	//  175  369:bipush          8
	//  176  371:ior             
	//  177  372:istore_3        
		if(true) goto _L2; else goto _L6
	//  178  373:goto            252
_L6:
	}

	public FontProvider getFontProvider()
	{
		return provider;
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field FontProvider provider>
	//    2    4:areturn         
	}

	public HyphenationEvent getHyphenation(ChainedProperties chainedproperties)
	{
		String s = chainedproperties.getProperty("hyphenation");
	//    0    0:aload_1         
	//    1    1:ldc2            #316 <String "hyphenation">
	//    2    4:invokevirtual   #141 <Method String ChainedProperties.getProperty(String)>
	//    3    7:astore          5
		if(s == null || s.length() == 0)
	//*   4    9:aload           5
	//*   5   11:ifnull          22
	//*   6   14:aload           5
	//*   7   16:invokevirtual   #263 <Method int String.length()>
	//*   8   19:ifne            24
			return null;
	//    9   22:aconst_null     
	//   10   23:areturn         
		int i = s.indexOf('_');
	//   11   24:aload           5
	//   12   26:bipush          95
	//   13   28:invokevirtual   #320 <Method int String.indexOf(int)>
	//   14   31:istore_2        
		if(i == -1)
	//*  15   32:iload_2         
	//*  16   33:iconst_m1       
	//*  17   34:icmpne          50
			return ((HyphenationEvent) (new HyphenationAuto(s, ((String) (null)), 2, 2)));
	//   18   37:new             #322 <Class HyphenationAuto>
	//   19   40:dup             
	//   20   41:aload           5
	//   21   43:aconst_null     
	//   22   44:iconst_2        
	//   23   45:iconst_2        
	//   24   46:invokespecial   #325 <Method void HyphenationAuto(String, String, int, int)>
	//   25   49:areturn         
		chainedproperties = ((ChainedProperties) (s.substring(0, i)));
	//   26   50:aload           5
	//   27   52:iconst_0        
	//   28   53:iload_2         
	//   29   54:invokevirtual   #276 <Method String String.substring(int, int)>
	//   30   57:astore_1        
		String s1 = s.substring(i + 1);
	//   31   58:aload           5
	//   32   60:iload_2         
	//   33   61:iconst_1        
	//   34   62:iadd            
	//   35   63:invokevirtual   #273 <Method String String.substring(int)>
	//   36   66:astore          6
		i = s1.indexOf(',');
	//   37   68:aload           6
	//   38   70:bipush          44
	//   39   72:invokevirtual   #320 <Method int String.indexOf(int)>
	//   40   75:istore_2        
		if(i == -1)
	//*  41   76:iload_2         
	//*  42   77:iconst_m1       
	//*  43   78:icmpne          94
			return ((HyphenationEvent) (new HyphenationAuto(((String) (chainedproperties)), s1, 2, 2)));
	//   44   81:new             #322 <Class HyphenationAuto>
	//   45   84:dup             
	//   46   85:aload_1         
	//   47   86:aload           6
	//   48   88:iconst_2        
	//   49   89:iconst_2        
	//   50   90:invokespecial   #325 <Method void HyphenationAuto(String, String, int, int)>
	//   51   93:areturn         
		int j = 2;
	//   52   94:iconst_2        
	//   53   95:istore_3        
		s = s1.substring(i + 1);
	//   54   96:aload           6
	//   55   98:iload_2         
	//   56   99:iconst_1        
	//   57  100:iadd            
	//   58  101:invokevirtual   #273 <Method String String.substring(int)>
	//   59  104:astore          5
		s1 = s1.substring(0, i);
	//   60  106:aload           6
	//   61  108:iconst_0        
	//   62  109:iload_2         
	//   63  110:invokevirtual   #276 <Method String String.substring(int, int)>
	//   64  113:astore          6
		int k = s.indexOf(',');
	//   65  115:aload           5
	//   66  117:bipush          44
	//   67  119:invokevirtual   #320 <Method int String.indexOf(int)>
	//   68  122:istore          4
		if(k == -1)
	//*  69  124:iload           4
	//*  70  126:iconst_m1       
	//*  71  127:icmpne          149
		{
			i = Integer.parseInt(s);
	//   72  130:aload           5
	//   73  132:invokestatic    #330 <Method int Integer.parseInt(String)>
	//   74  135:istore_2        
		} else
	//*  75  136:new             #322 <Class HyphenationAuto>
	//*  76  139:dup             
	//*  77  140:aload_1         
	//*  78  141:aload           6
	//*  79  143:iload_2         
	//*  80  144:iload_3         
	//*  81  145:invokespecial   #325 <Method void HyphenationAuto(String, String, int, int)>
	//*  82  148:areturn         
		{
			i = Integer.parseInt(s.substring(0, k));
	//   83  149:aload           5
	//   84  151:iconst_0        
	//   85  152:iload           4
	//   86  154:invokevirtual   #276 <Method String String.substring(int, int)>
	//   87  157:invokestatic    #330 <Method int Integer.parseInt(String)>
	//   88  160:istore_2        
			j = Integer.parseInt(s.substring(k + 1));
	//   89  161:aload           5
	//   90  163:iload           4
	//   91  165:iconst_1        
	//   92  166:iadd            
	//   93  167:invokevirtual   #273 <Method String String.substring(int)>
	//   94  170:invokestatic    #330 <Method int Integer.parseInt(String)>
	//   95  173:istore_3        
		}
		return ((HyphenationEvent) (new HyphenationAuto(((String) (chainedproperties)), s1, i, j)));
	//*  96  174:goto            136
	}

	public void setFontProvider(FontProvider fontprovider)
	{
		provider = fontprovider;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field FontProvider provider>
	//    3    5:return          
	}

	protected void updateElement(Paragraph paragraph, ChainedProperties chainedproperties)
	{
		paragraph.setAlignment(HtmlUtilities.alignmentValue(chainedproperties.getProperty("align")));
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:ldc1            #203 <String "align">
	//    3    4:invokevirtual   #141 <Method String ChainedProperties.getProperty(String)>
	//    4    7:invokestatic    #207 <Method int HtmlUtilities.alignmentValue(String)>
	//    5   10:invokevirtual   #336 <Method void Paragraph.setAlignment(int)>
		paragraph.setHyphenation(getHyphenation(chainedproperties));
	//    6   13:aload_1         
	//    7   14:aload_0         
	//    8   15:aload_2         
	//    9   16:invokevirtual   #85  <Method HyphenationEvent getHyphenation(ChainedProperties)>
	//   10   19:invokevirtual   #339 <Method void Paragraph.setHyphenation(HyphenationEvent)>
		setParagraphLeading(paragraph, chainedproperties.getProperty("leading"));
	//   11   22:aload_1         
	//   12   23:aload_2         
	//   13   24:ldc2            #341 <String "leading">
	//   14   27:invokevirtual   #141 <Method String ChainedProperties.getProperty(String)>
	//   15   30:invokestatic    #343 <Method void setParagraphLeading(Paragraph, String)>
		String s = chainedproperties.getProperty("after");
	//   16   33:aload_2         
	//   17   34:ldc1            #176 <String "after">
	//   18   36:invokevirtual   #141 <Method String ChainedProperties.getProperty(String)>
	//   19   39:astore_3        
		if(s != null)
	//*  20   40:aload_3         
	//*  21   41:ifnull          52
			try
			{
				paragraph.setSpacingBefore(Float.parseFloat(s));
	//   22   44:aload_1         
	//   23   45:aload_3         
	//   24   46:invokestatic    #48  <Method float Float.parseFloat(String)>
	//   25   49:invokevirtual   #344 <Method void Paragraph.setSpacingBefore(float)>
			}
	//*  26   52:aload_2         
	//*  27   53:ldc1            #176 <String "after">
	//*  28   55:invokevirtual   #141 <Method String ChainedProperties.getProperty(String)>
	//*  29   58:astore_3        
	//*  30   59:aload_3         
	//*  31   60:ifnull          71
	//*  32   63:aload_1         
	//*  33   64:aload_3         
	//*  34   65:invokestatic    #48  <Method float Float.parseFloat(String)>
	//*  35   68:invokevirtual   #345 <Method void Paragraph.setSpacingAfter(float)>
	//*  36   71:aload_2         
	//*  37   72:ldc2            #347 <String "extraparaspace">
	//*  38   75:invokevirtual   #141 <Method String ChainedProperties.getProperty(String)>
	//*  39   78:astore_3        
	//*  40   79:aload_3         
	//*  41   80:ifnull          91
	//*  42   83:aload_1         
	//*  43   84:aload_3         
	//*  44   85:invokestatic    #48  <Method float Float.parseFloat(String)>
	//*  45   88:invokevirtual   #350 <Method void Paragraph.setExtraParagraphSpace(float)>
	//*  46   91:aload_2         
	//*  47   92:ldc1            #231 <String "indent">
	//*  48   94:invokevirtual   #141 <Method String ChainedProperties.getProperty(String)>
	//*  49   97:astore_2        
	//*  50   98:aload_2         
	//*  51   99:ifnull          110
	//*  52  102:aload_1         
	//*  53  103:aload_2         
	//*  54  104:invokestatic    #48  <Method float Float.parseFloat(String)>
	//*  55  107:invokevirtual   #351 <Method void Paragraph.setIndentationLeft(float)>
	//*  56  110:return          
	//*  57  111:astore_1        
	//*  58  112:return          
	//*  59  113:astore_3        
	//*  60  114:goto            91
	//*  61  117:astore_3        
	//*  62  118:goto            71
			catch(Exception exception2) { }
	//   63  121:astore_3        
		s = chainedproperties.getProperty("after");
		if(s != null)
			try
			{
				paragraph.setSpacingAfter(Float.parseFloat(s));
			}
			catch(Exception exception1) { }
		s = chainedproperties.getProperty("extraparaspace");
		if(s != null)
			try
			{
				paragraph.setExtraParagraphSpace(Float.parseFloat(s));
			}
			catch(Exception exception) { }
		chainedproperties = ((ChainedProperties) (chainedproperties.getProperty("indent")));
		if(chainedproperties == null)
			break MISSING_BLOCK_LABEL_110;
		paragraph.setIndentationLeft(Float.parseFloat(((String) (chainedproperties))));
		return;
		paragraph;
	//*  64  122:goto            52
	}

	private FontProvider provider;
}

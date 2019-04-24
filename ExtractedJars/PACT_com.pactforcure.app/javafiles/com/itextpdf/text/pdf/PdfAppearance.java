// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf;

import com.itextpdf.text.Rectangle;
import java.util.HashMap;

// Referenced classes of package com.itextpdf.text.pdf:
//			PdfTemplate, PdfName, PdfWriter, PdfArray, 
//			BaseFont, FontDetails, DocumentFont, PageResources, 
//			ByteBuffer, PdfIndirectReference, PdfContentByte

public class PdfAppearance extends PdfTemplate
{

	PdfAppearance()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #122 <Method void PdfTemplate()>
		separator = 32;
	//    2    4:aload_0         
	//    3    5:bipush          32
	//    4    7:putfield        #126 <Field int separator>
	//    5   10:return          
	}

	PdfAppearance(PdfIndirectReference pdfindirectreference)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #122 <Method void PdfTemplate()>
		thisReference = pdfindirectreference;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #131 <Field PdfIndirectReference thisReference>
	//    5    9:return          
	}

	PdfAppearance(PdfWriter pdfwriter)
	{
		super(pdfwriter);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #134 <Method void PdfTemplate(PdfWriter)>
		separator = 32;
	//    3    5:aload_0         
	//    4    6:bipush          32
	//    5    8:putfield        #126 <Field int separator>
	//    6   11:return          
	}

	public static PdfAppearance createAppearance(PdfWriter pdfwriter, float f, float f1)
	{
		return createAppearance(pdfwriter, f, f1, ((PdfName) (null)));
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:fload_2         
	//    3    3:aconst_null     
	//    4    4:invokestatic    #139 <Method PdfAppearance createAppearance(PdfWriter, float, float, PdfName)>
	//    5    7:areturn         
	}

	static PdfAppearance createAppearance(PdfWriter pdfwriter, float f, float f1, PdfName pdfname)
	{
		PdfAppearance pdfappearance = new PdfAppearance(pdfwriter);
	//    0    0:new             #2   <Class PdfAppearance>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #140 <Method void PdfAppearance(PdfWriter)>
	//    4    8:astore          4
		pdfappearance.setWidth(f);
	//    5   10:aload           4
	//    6   12:fload_1         
	//    7   13:invokevirtual   #144 <Method void setWidth(float)>
		pdfappearance.setHeight(f1);
	//    8   16:aload           4
	//    9   18:fload_2         
	//   10   19:invokevirtual   #147 <Method void setHeight(float)>
		pdfwriter.addDirectTemplateSimple(((PdfTemplate) (pdfappearance)), pdfname);
	//   11   22:aload_0         
	//   12   23:aload           4
	//   13   25:aload_3         
	//   14   26:invokevirtual   #153 <Method PdfName PdfWriter.addDirectTemplateSimple(PdfTemplate, PdfName)>
	//   15   29:pop             
		return pdfappearance;
	//   16   30:aload           4
	//   17   32:areturn         
	}

	public PdfContentByte getDuplicate()
	{
		PdfAppearance pdfappearance = new PdfAppearance();
	//    0    0:new             #2   <Class PdfAppearance>
	//    1    3:dup             
	//    2    4:invokespecial   #156 <Method void PdfAppearance()>
	//    3    7:astore_1        
		pdfappearance.writer = writer;
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:getfield        #160 <Field PdfWriter writer>
	//    7   13:putfield        #160 <Field PdfWriter writer>
		pdfappearance.pdf = pdf;
	//    8   16:aload_1         
	//    9   17:aload_0         
	//   10   18:getfield        #164 <Field PdfDocument pdf>
	//   11   21:putfield        #164 <Field PdfDocument pdf>
		pdfappearance.thisReference = thisReference;
	//   12   24:aload_1         
	//   13   25:aload_0         
	//   14   26:getfield        #131 <Field PdfIndirectReference thisReference>
	//   15   29:putfield        #131 <Field PdfIndirectReference thisReference>
		pdfappearance.pageResources = pageResources;
	//   16   32:aload_1         
	//   17   33:aload_0         
	//   18   34:getfield        #168 <Field PageResources pageResources>
	//   19   37:putfield        #168 <Field PageResources pageResources>
		pdfappearance.bBox = new Rectangle(bBox);
	//   20   40:aload_1         
	//   21   41:new             #170 <Class Rectangle>
	//   22   44:dup             
	//   23   45:aload_0         
	//   24   46:getfield        #174 <Field Rectangle bBox>
	//   25   49:invokespecial   #177 <Method void Rectangle(Rectangle)>
	//   26   52:putfield        #174 <Field Rectangle bBox>
		pdfappearance.group = group;
	//   27   55:aload_1         
	//   28   56:aload_0         
	//   29   57:getfield        #181 <Field PdfTransparencyGroup group>
	//   30   60:putfield        #181 <Field PdfTransparencyGroup group>
		pdfappearance.layer = layer;
	//   31   63:aload_1         
	//   32   64:aload_0         
	//   33   65:getfield        #185 <Field PdfOCG layer>
	//   34   68:putfield        #185 <Field PdfOCG layer>
		if(matrix != null)
	//*  35   71:aload_0         
	//*  36   72:getfield        #189 <Field PdfArray matrix>
	//*  37   75:ifnull          93
			pdfappearance.matrix = new PdfArray(matrix);
	//   38   78:aload_1         
	//   39   79:new             #191 <Class PdfArray>
	//   40   82:dup             
	//   41   83:aload_0         
	//   42   84:getfield        #189 <Field PdfArray matrix>
	//   43   87:invokespecial   #194 <Method void PdfArray(PdfArray)>
	//   44   90:putfield        #189 <Field PdfArray matrix>
		pdfappearance.separator = separator;
	//   45   93:aload_1         
	//   46   94:aload_0         
	//   47   95:getfield        #126 <Field int separator>
	//   48   98:putfield        #126 <Field int separator>
		return ((PdfContentByte) (pdfappearance));
	//   49  101:aload_1         
	//   50  102:areturn         
	}

	public void setFontAndSize(BaseFont basefont, float f)
	{
		checkWriter();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #199 <Method void checkWriter()>
		state.size = f;
	//    2    4:aload_0         
	//    3    5:getfield        #203 <Field PdfContentByte$GraphicState state>
	//    4    8:fload_2         
	//    5    9:putfield        #209 <Field float PdfContentByte$GraphicState.size>
		PdfName pdfname;
		PdfName pdfname1;
		if(basefont.getFontType() == 4)
	//*   6   12:aload_1         
	//*   7   13:invokevirtual   #215 <Method int BaseFont.getFontType()>
	//*   8   16:iconst_4        
	//*   9   17:icmpne          146
			state.fontDetails = new FontDetails(((PdfName) (null)), ((DocumentFont)basefont).getIndirectReference(), basefont);
	//   10   20:aload_0         
	//   11   21:getfield        #203 <Field PdfContentByte$GraphicState state>
	//   12   24:new             #217 <Class FontDetails>
	//   13   27:dup             
	//   14   28:aconst_null     
	//   15   29:aload_1         
	//   16   30:checkcast       #219 <Class DocumentFont>
	//   17   33:invokevirtual   #223 <Method PdfIndirectReference DocumentFont.getIndirectReference()>
	//   18   36:aload_1         
	//   19   37:invokespecial   #226 <Method void FontDetails(PdfName, PdfIndirectReference, BaseFont)>
	//   20   40:putfield        #230 <Field FontDetails PdfContentByte$GraphicState.fontDetails>
		else
	//*  21   43:getstatic       #16  <Field HashMap stdFieldFontNames>
	//*  22   46:aload_1         
	//*  23   47:invokevirtual   #234 <Method String BaseFont.getPostscriptFontName()>
	//*  24   50:invokevirtual   #238 <Method Object HashMap.get(Object)>
	//*  25   53:checkcast       #20  <Class PdfName>
	//*  26   56:astore          4
	//*  27   58:aload           4
	//*  28   60:astore_3        
	//*  29   61:aload           4
	//*  30   63:ifnonnull       92
	//*  31   66:aload_1         
	//*  32   67:invokevirtual   #242 <Method boolean BaseFont.isSubset()>
	//*  33   70:ifeq            164
	//*  34   73:aload_1         
	//*  35   74:invokevirtual   #215 <Method int BaseFont.getFontType()>
	//*  36   77:iconst_3        
	//*  37   78:icmpne          164
	//*  38   81:aload_0         
	//*  39   82:getfield        #203 <Field PdfContentByte$GraphicState state>
	//*  40   85:getfield        #230 <Field FontDetails PdfContentByte$GraphicState.fontDetails>
	//*  41   88:invokevirtual   #246 <Method PdfName FontDetails.getFontName()>
	//*  42   91:astore_3        
	//*  43   92:aload_0         
	//*  44   93:invokevirtual   #250 <Method PageResources getPageResources()>
	//*  45   96:aload_3         
	//*  46   97:aload_0         
	//*  47   98:getfield        #203 <Field PdfContentByte$GraphicState state>
	//*  48  101:getfield        #230 <Field FontDetails PdfContentByte$GraphicState.fontDetails>
	//*  49  104:invokevirtual   #251 <Method PdfIndirectReference FontDetails.getIndirectReference()>
	//*  50  107:invokevirtual   #257 <Method PdfName PageResources.addFont(PdfName, PdfIndirectReference)>
	//*  51  110:pop             
	//*  52  111:aload_0         
	//*  53  112:getfield        #261 <Field ByteBuffer content>
	//*  54  115:aload_3         
	//*  55  116:invokevirtual   #265 <Method byte[] PdfName.getBytes()>
	//*  56  119:invokevirtual   #271 <Method ByteBuffer ByteBuffer.append(byte[])>
	//*  57  122:bipush          32
	//*  58  124:invokevirtual   #274 <Method ByteBuffer ByteBuffer.append(char)>
	//*  59  127:fload_2         
	//*  60  128:invokevirtual   #277 <Method ByteBuffer ByteBuffer.append(float)>
	//*  61  131:ldc2            #279 <String " Tf">
	//*  62  134:invokevirtual   #282 <Method ByteBuffer ByteBuffer.append(String)>
	//*  63  137:aload_0         
	//*  64  138:getfield        #126 <Field int separator>
	//*  65  141:invokevirtual   #286 <Method ByteBuffer ByteBuffer.append_i(int)>
	//*  66  144:pop             
	//*  67  145:return          
			state.fontDetails = writer.addSimple(basefont);
	//   68  146:aload_0         
	//   69  147:getfield        #203 <Field PdfContentByte$GraphicState state>
	//   70  150:aload_0         
	//   71  151:getfield        #160 <Field PdfWriter writer>
	//   72  154:aload_1         
	//   73  155:invokevirtual   #290 <Method FontDetails PdfWriter.addSimple(BaseFont)>
	//   74  158:putfield        #230 <Field FontDetails PdfContentByte$GraphicState.fontDetails>
		pdfname1 = (PdfName)stdFieldFontNames.get(((Object) (basefont.getPostscriptFontName())));
		pdfname = pdfname1;
		if(pdfname1 == null)
			if(basefont.isSubset() && basefont.getFontType() == 3)
			{
				pdfname = state.fontDetails.getFontName();
			} else
	//*  75  161:goto            43
			{
				pdfname = new PdfName(basefont.getPostscriptFontName());
	//   76  164:new             #20  <Class PdfName>
	//   77  167:dup             
	//   78  168:aload_1         
	//   79  169:invokevirtual   #234 <Method String BaseFont.getPostscriptFontName()>
	//   80  172:invokespecial   #25  <Method void PdfName(String)>
	//   81  175:astore_3        
				state.fontDetails.setSubset(false);
	//   82  176:aload_0         
	//   83  177:getfield        #203 <Field PdfContentByte$GraphicState state>
	//   84  180:getfield        #230 <Field FontDetails PdfContentByte$GraphicState.fontDetails>
	//   85  183:iconst_0        
	//   86  184:invokevirtual   #294 <Method void FontDetails.setSubset(boolean)>
			}
		getPageResources().addFont(pdfname, state.fontDetails.getIndirectReference());
		content.append(pdfname.getBytes()).append(' ').append(f).append(" Tf").append_i(separator);
	//*  87  187:goto            92
	}

	public static final HashMap stdFieldFontNames;

	static 
	{
		stdFieldFontNames = new HashMap();
	//    0    0:new             #11  <Class HashMap>
	//    1    3:dup             
	//    2    4:invokespecial   #14  <Method void HashMap()>
	//    3    7:putstatic       #16  <Field HashMap stdFieldFontNames>
		stdFieldFontNames.put("Courier-BoldOblique", ((Object) (new PdfName("CoBO"))));
	//    4   10:getstatic       #16  <Field HashMap stdFieldFontNames>
	//    5   13:ldc1            #18  <String "Courier-BoldOblique">
	//    6   15:new             #20  <Class PdfName>
	//    7   18:dup             
	//    8   19:ldc1            #22  <String "CoBO">
	//    9   21:invokespecial   #25  <Method void PdfName(String)>
	//   10   24:invokevirtual   #29  <Method Object HashMap.put(Object, Object)>
	//   11   27:pop             
		stdFieldFontNames.put("Courier-Bold", ((Object) (new PdfName("CoBo"))));
	//   12   28:getstatic       #16  <Field HashMap stdFieldFontNames>
	//   13   31:ldc1            #31  <String "Courier-Bold">
	//   14   33:new             #20  <Class PdfName>
	//   15   36:dup             
	//   16   37:ldc1            #33  <String "CoBo">
	//   17   39:invokespecial   #25  <Method void PdfName(String)>
	//   18   42:invokevirtual   #29  <Method Object HashMap.put(Object, Object)>
	//   19   45:pop             
		stdFieldFontNames.put("Courier-Oblique", ((Object) (new PdfName("CoOb"))));
	//   20   46:getstatic       #16  <Field HashMap stdFieldFontNames>
	//   21   49:ldc1            #35  <String "Courier-Oblique">
	//   22   51:new             #20  <Class PdfName>
	//   23   54:dup             
	//   24   55:ldc1            #37  <String "CoOb">
	//   25   57:invokespecial   #25  <Method void PdfName(String)>
	//   26   60:invokevirtual   #29  <Method Object HashMap.put(Object, Object)>
	//   27   63:pop             
		stdFieldFontNames.put("Courier", ((Object) (new PdfName("Cour"))));
	//   28   64:getstatic       #16  <Field HashMap stdFieldFontNames>
	//   29   67:ldc1            #39  <String "Courier">
	//   30   69:new             #20  <Class PdfName>
	//   31   72:dup             
	//   32   73:ldc1            #41  <String "Cour">
	//   33   75:invokespecial   #25  <Method void PdfName(String)>
	//   34   78:invokevirtual   #29  <Method Object HashMap.put(Object, Object)>
	//   35   81:pop             
		stdFieldFontNames.put("Helvetica-BoldOblique", ((Object) (new PdfName("HeBO"))));
	//   36   82:getstatic       #16  <Field HashMap stdFieldFontNames>
	//   37   85:ldc1            #43  <String "Helvetica-BoldOblique">
	//   38   87:new             #20  <Class PdfName>
	//   39   90:dup             
	//   40   91:ldc1            #45  <String "HeBO">
	//   41   93:invokespecial   #25  <Method void PdfName(String)>
	//   42   96:invokevirtual   #29  <Method Object HashMap.put(Object, Object)>
	//   43   99:pop             
		stdFieldFontNames.put("Helvetica-Bold", ((Object) (new PdfName("HeBo"))));
	//   44  100:getstatic       #16  <Field HashMap stdFieldFontNames>
	//   45  103:ldc1            #47  <String "Helvetica-Bold">
	//   46  105:new             #20  <Class PdfName>
	//   47  108:dup             
	//   48  109:ldc1            #49  <String "HeBo">
	//   49  111:invokespecial   #25  <Method void PdfName(String)>
	//   50  114:invokevirtual   #29  <Method Object HashMap.put(Object, Object)>
	//   51  117:pop             
		stdFieldFontNames.put("Helvetica-Oblique", ((Object) (new PdfName("HeOb"))));
	//   52  118:getstatic       #16  <Field HashMap stdFieldFontNames>
	//   53  121:ldc1            #51  <String "Helvetica-Oblique">
	//   54  123:new             #20  <Class PdfName>
	//   55  126:dup             
	//   56  127:ldc1            #53  <String "HeOb">
	//   57  129:invokespecial   #25  <Method void PdfName(String)>
	//   58  132:invokevirtual   #29  <Method Object HashMap.put(Object, Object)>
	//   59  135:pop             
		stdFieldFontNames.put("Helvetica", ((Object) (PdfName.HELV)));
	//   60  136:getstatic       #16  <Field HashMap stdFieldFontNames>
	//   61  139:ldc1            #55  <String "Helvetica">
	//   62  141:getstatic       #59  <Field PdfName PdfName.HELV>
	//   63  144:invokevirtual   #29  <Method Object HashMap.put(Object, Object)>
	//   64  147:pop             
		stdFieldFontNames.put("Symbol", ((Object) (new PdfName("Symb"))));
	//   65  148:getstatic       #16  <Field HashMap stdFieldFontNames>
	//   66  151:ldc1            #61  <String "Symbol">
	//   67  153:new             #20  <Class PdfName>
	//   68  156:dup             
	//   69  157:ldc1            #63  <String "Symb">
	//   70  159:invokespecial   #25  <Method void PdfName(String)>
	//   71  162:invokevirtual   #29  <Method Object HashMap.put(Object, Object)>
	//   72  165:pop             
		stdFieldFontNames.put("Times-BoldItalic", ((Object) (new PdfName("TiBI"))));
	//   73  166:getstatic       #16  <Field HashMap stdFieldFontNames>
	//   74  169:ldc1            #65  <String "Times-BoldItalic">
	//   75  171:new             #20  <Class PdfName>
	//   76  174:dup             
	//   77  175:ldc1            #67  <String "TiBI">
	//   78  177:invokespecial   #25  <Method void PdfName(String)>
	//   79  180:invokevirtual   #29  <Method Object HashMap.put(Object, Object)>
	//   80  183:pop             
		stdFieldFontNames.put("Times-Bold", ((Object) (new PdfName("TiBo"))));
	//   81  184:getstatic       #16  <Field HashMap stdFieldFontNames>
	//   82  187:ldc1            #69  <String "Times-Bold">
	//   83  189:new             #20  <Class PdfName>
	//   84  192:dup             
	//   85  193:ldc1            #71  <String "TiBo">
	//   86  195:invokespecial   #25  <Method void PdfName(String)>
	//   87  198:invokevirtual   #29  <Method Object HashMap.put(Object, Object)>
	//   88  201:pop             
		stdFieldFontNames.put("Times-Italic", ((Object) (new PdfName("TiIt"))));
	//   89  202:getstatic       #16  <Field HashMap stdFieldFontNames>
	//   90  205:ldc1            #73  <String "Times-Italic">
	//   91  207:new             #20  <Class PdfName>
	//   92  210:dup             
	//   93  211:ldc1            #75  <String "TiIt">
	//   94  213:invokespecial   #25  <Method void PdfName(String)>
	//   95  216:invokevirtual   #29  <Method Object HashMap.put(Object, Object)>
	//   96  219:pop             
		stdFieldFontNames.put("Times-Roman", ((Object) (new PdfName("TiRo"))));
	//   97  220:getstatic       #16  <Field HashMap stdFieldFontNames>
	//   98  223:ldc1            #77  <String "Times-Roman">
	//   99  225:new             #20  <Class PdfName>
	//  100  228:dup             
	//  101  229:ldc1            #79  <String "TiRo">
	//  102  231:invokespecial   #25  <Method void PdfName(String)>
	//  103  234:invokevirtual   #29  <Method Object HashMap.put(Object, Object)>
	//  104  237:pop             
		stdFieldFontNames.put("ZapfDingbats", ((Object) (PdfName.ZADB)));
	//  105  238:getstatic       #16  <Field HashMap stdFieldFontNames>
	//  106  241:ldc1            #81  <String "ZapfDingbats">
	//  107  243:getstatic       #84  <Field PdfName PdfName.ZADB>
	//  108  246:invokevirtual   #29  <Method Object HashMap.put(Object, Object)>
	//  109  249:pop             
		stdFieldFontNames.put("HYSMyeongJo-Medium", ((Object) (new PdfName("HySm"))));
	//  110  250:getstatic       #16  <Field HashMap stdFieldFontNames>
	//  111  253:ldc1            #86  <String "HYSMyeongJo-Medium">
	//  112  255:new             #20  <Class PdfName>
	//  113  258:dup             
	//  114  259:ldc1            #88  <String "HySm">
	//  115  261:invokespecial   #25  <Method void PdfName(String)>
	//  116  264:invokevirtual   #29  <Method Object HashMap.put(Object, Object)>
	//  117  267:pop             
		stdFieldFontNames.put("HYGoThic-Medium", ((Object) (new PdfName("HyGo"))));
	//  118  268:getstatic       #16  <Field HashMap stdFieldFontNames>
	//  119  271:ldc1            #90  <String "HYGoThic-Medium">
	//  120  273:new             #20  <Class PdfName>
	//  121  276:dup             
	//  122  277:ldc1            #92  <String "HyGo">
	//  123  279:invokespecial   #25  <Method void PdfName(String)>
	//  124  282:invokevirtual   #29  <Method Object HashMap.put(Object, Object)>
	//  125  285:pop             
		stdFieldFontNames.put("HeiseiKakuGo-W5", ((Object) (new PdfName("KaGo"))));
	//  126  286:getstatic       #16  <Field HashMap stdFieldFontNames>
	//  127  289:ldc1            #94  <String "HeiseiKakuGo-W5">
	//  128  291:new             #20  <Class PdfName>
	//  129  294:dup             
	//  130  295:ldc1            #96  <String "KaGo">
	//  131  297:invokespecial   #25  <Method void PdfName(String)>
	//  132  300:invokevirtual   #29  <Method Object HashMap.put(Object, Object)>
	//  133  303:pop             
		stdFieldFontNames.put("HeiseiMin-W3", ((Object) (new PdfName("KaMi"))));
	//  134  304:getstatic       #16  <Field HashMap stdFieldFontNames>
	//  135  307:ldc1            #98  <String "HeiseiMin-W3">
	//  136  309:new             #20  <Class PdfName>
	//  137  312:dup             
	//  138  313:ldc1            #100 <String "KaMi">
	//  139  315:invokespecial   #25  <Method void PdfName(String)>
	//  140  318:invokevirtual   #29  <Method Object HashMap.put(Object, Object)>
	//  141  321:pop             
		stdFieldFontNames.put("MHei-Medium", ((Object) (new PdfName("MHei"))));
	//  142  322:getstatic       #16  <Field HashMap stdFieldFontNames>
	//  143  325:ldc1            #102 <String "MHei-Medium">
	//  144  327:new             #20  <Class PdfName>
	//  145  330:dup             
	//  146  331:ldc1            #104 <String "MHei">
	//  147  333:invokespecial   #25  <Method void PdfName(String)>
	//  148  336:invokevirtual   #29  <Method Object HashMap.put(Object, Object)>
	//  149  339:pop             
		stdFieldFontNames.put("MSung-Light", ((Object) (new PdfName("MSun"))));
	//  150  340:getstatic       #16  <Field HashMap stdFieldFontNames>
	//  151  343:ldc1            #106 <String "MSung-Light">
	//  152  345:new             #20  <Class PdfName>
	//  153  348:dup             
	//  154  349:ldc1            #108 <String "MSun">
	//  155  351:invokespecial   #25  <Method void PdfName(String)>
	//  156  354:invokevirtual   #29  <Method Object HashMap.put(Object, Object)>
	//  157  357:pop             
		stdFieldFontNames.put("STSong-Light", ((Object) (new PdfName("STSo"))));
	//  158  358:getstatic       #16  <Field HashMap stdFieldFontNames>
	//  159  361:ldc1            #110 <String "STSong-Light">
	//  160  363:new             #20  <Class PdfName>
	//  161  366:dup             
	//  162  367:ldc1            #112 <String "STSo">
	//  163  369:invokespecial   #25  <Method void PdfName(String)>
	//  164  372:invokevirtual   #29  <Method Object HashMap.put(Object, Object)>
	//  165  375:pop             
		stdFieldFontNames.put("MSungStd-Light", ((Object) (new PdfName("MSun"))));
	//  166  376:getstatic       #16  <Field HashMap stdFieldFontNames>
	//  167  379:ldc1            #114 <String "MSungStd-Light">
	//  168  381:new             #20  <Class PdfName>
	//  169  384:dup             
	//  170  385:ldc1            #108 <String "MSun">
	//  171  387:invokespecial   #25  <Method void PdfName(String)>
	//  172  390:invokevirtual   #29  <Method Object HashMap.put(Object, Object)>
	//  173  393:pop             
		stdFieldFontNames.put("STSongStd-Light", ((Object) (new PdfName("STSo"))));
	//  174  394:getstatic       #16  <Field HashMap stdFieldFontNames>
	//  175  397:ldc1            #116 <String "STSongStd-Light">
	//  176  399:new             #20  <Class PdfName>
	//  177  402:dup             
	//  178  403:ldc1            #112 <String "STSo">
	//  179  405:invokespecial   #25  <Method void PdfName(String)>
	//  180  408:invokevirtual   #29  <Method Object HashMap.put(Object, Object)>
	//  181  411:pop             
		stdFieldFontNames.put("HYSMyeongJoStd-Medium", ((Object) (new PdfName("HySm"))));
	//  182  412:getstatic       #16  <Field HashMap stdFieldFontNames>
	//  183  415:ldc1            #118 <String "HYSMyeongJoStd-Medium">
	//  184  417:new             #20  <Class PdfName>
	//  185  420:dup             
	//  186  421:ldc1            #88  <String "HySm">
	//  187  423:invokespecial   #25  <Method void PdfName(String)>
	//  188  426:invokevirtual   #29  <Method Object HashMap.put(Object, Object)>
	//  189  429:pop             
		stdFieldFontNames.put("KozMinPro-Regular", ((Object) (new PdfName("KaMi"))));
	//  190  430:getstatic       #16  <Field HashMap stdFieldFontNames>
	//  191  433:ldc1            #120 <String "KozMinPro-Regular">
	//  192  435:new             #20  <Class PdfName>
	//  193  438:dup             
	//  194  439:ldc1            #100 <String "KaMi">
	//  195  441:invokespecial   #25  <Method void PdfName(String)>
	//  196  444:invokevirtual   #29  <Method Object HashMap.put(Object, Object)>
	//  197  447:pop             
	//* 198  448:return          
	}
}

// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.error_messages.MessageLocalization;

// Referenced classes of package com.itextpdf.text.pdf:
//			ICachedColorSpace, IPdfSpecialColorSpace, PdfName, ExtendedColor, 
//			LabColor, PdfWriter, ColorDetails, PdfArray, 
//			GrayColor, PdfFunction, CMYKColor, PdfLabColor, 
//			PdfObject

public class PdfSpotColor
	implements ICachedColorSpace, IPdfSpecialColorSpace
{

	public PdfSpotColor(String s, BaseColor basecolor)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void Object()>
		name = new PdfName(s);
	//    2    4:aload_0         
	//    3    5:new             #21  <Class PdfName>
	//    4    8:dup             
	//    5    9:aload_1         
	//    6   10:invokespecial   #24  <Method void PdfName(String)>
	//    7   13:putfield        #26  <Field PdfName name>
		altcs = basecolor;
	//    8   16:aload_0         
	//    9   17:aload_2         
	//   10   18:putfield        #28  <Field BaseColor altcs>
	//   11   21:return          
	}

	public boolean equals(Object obj)
	{
		if(this != obj)
	//*   0    0:aload_0         
	//*   1    1:aload_1         
	//*   2    2:if_acmpne       7
	//*   3    5:iconst_1        
	//*   4    6:ireturn         
		{
			if(!(obj instanceof PdfSpotColor))
	//*   5    7:aload_1         
	//*   6    8:instanceof      #2   <Class PdfSpotColor>
	//*   7   11:ifne            16
				return false;
	//    8   14:iconst_0        
	//    9   15:ireturn         
			obj = ((Object) ((PdfSpotColor)obj));
	//   10   16:aload_1         
	//   11   17:checkcast       #2   <Class PdfSpotColor>
	//   12   20:astore_1        
			if(!altcs.equals(((Object) (((PdfSpotColor) (obj)).altcs))))
	//*  13   21:aload_0         
	//*  14   22:getfield        #28  <Field BaseColor altcs>
	//*  15   25:aload_1         
	//*  16   26:getfield        #28  <Field BaseColor altcs>
	//*  17   29:invokevirtual   #35  <Method boolean BaseColor.equals(Object)>
	//*  18   32:ifne            37
				return false;
	//   19   35:iconst_0        
	//   20   36:ireturn         
			if(!name.equals(((Object) (((PdfSpotColor) (obj)).name))))
	//*  21   37:aload_0         
	//*  22   38:getfield        #26  <Field PdfName name>
	//*  23   41:aload_1         
	//*  24   42:getfield        #26  <Field PdfName name>
	//*  25   45:invokevirtual   #36  <Method boolean PdfName.equals(Object)>
	//*  26   48:ifne            5
				return false;
	//   27   51:iconst_0        
	//   28   52:ireturn         
		}
		return true;
	}

	public BaseColor getAlternativeCS()
	{
		return altcs;
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field BaseColor altcs>
	//    2    4:areturn         
	}

	public ColorDetails[] getColorantDetails(PdfWriter pdfwriter)
	{
		if(altColorDetails == null && (altcs instanceof ExtendedColor) && ((ExtendedColor)altcs).getType() == 7)
	//*   0    0:aload_0         
	//*   1    1:getfield        #42  <Field ColorDetails altColorDetails>
	//*   2    4:ifnonnull       50
	//*   3    7:aload_0         
	//*   4    8:getfield        #28  <Field BaseColor altcs>
	//*   5   11:instanceof      #44  <Class ExtendedColor>
	//*   6   14:ifeq            50
	//*   7   17:aload_0         
	//*   8   18:getfield        #28  <Field BaseColor altcs>
	//*   9   21:checkcast       #44  <Class ExtendedColor>
	//*  10   24:invokevirtual   #48  <Method int ExtendedColor.getType()>
	//*  11   27:bipush          7
	//*  12   29:icmpne          50
			altColorDetails = pdfwriter.addSimple(((ICachedColorSpace) (((LabColor)altcs).getLabColorSpace())));
	//   13   32:aload_0         
	//   14   33:aload_1         
	//   15   34:aload_0         
	//   16   35:getfield        #28  <Field BaseColor altcs>
	//   17   38:checkcast       #50  <Class LabColor>
	//   18   41:invokevirtual   #54  <Method PdfLabColor LabColor.getLabColorSpace()>
	//   19   44:invokevirtual   #60  <Method ColorDetails PdfWriter.addSimple(ICachedColorSpace)>
	//   20   47:putfield        #42  <Field ColorDetails altColorDetails>
		return (new ColorDetails[] {
			altColorDetails
		});
	//   21   50:iconst_1        
	//   22   51:anewarray       ColorDetails[]
	//   23   54:dup             
	//   24   55:iconst_0        
	//   25   56:aload_0         
	//   26   57:getfield        #42  <Field ColorDetails altColorDetails>
	//   27   60:aastore         
	//   28   61:areturn         
	}

	public PdfName getName()
	{
		return name;
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field PdfName name>
	//    2    4:areturn         
	}

	public PdfObject getPdfObject(PdfWriter pdfwriter)
	{
		PdfArray pdfarray;
		pdfarray = new PdfArray(((PdfObject) (PdfName.SEPARATION)));
	//    0    0:new             #68  <Class PdfArray>
	//    1    3:dup             
	//    2    4:getstatic       #71  <Field PdfName PdfName.SEPARATION>
	//    3    7:invokespecial   #74  <Method void PdfArray(PdfObject)>
	//    4   10:astore          6
		pdfarray.add(((PdfObject) (name)));
	//    5   12:aload           6
	//    6   14:aload_0         
	//    7   15:getfield        #26  <Field PdfName name>
	//    8   18:invokevirtual   #78  <Method boolean PdfArray.add(PdfObject)>
	//    9   21:pop             
		if(!(altcs instanceof ExtendedColor)) goto _L2; else goto _L1
	//   10   22:aload_0         
	//   11   23:getfield        #28  <Field BaseColor altcs>
	//   12   26:instanceof      #44  <Class ExtendedColor>
	//   13   29:ifeq            382
_L1:
		((ExtendedColor)altcs).type;
	//   14   32:aload_0         
	//   15   33:getfield        #28  <Field BaseColor altcs>
	//   16   36:checkcast       #44  <Class ExtendedColor>
	//   17   39:getfield        #82  <Field int ExtendedColor.type>
		JVM INSTR lookupswitch 3: default 76
	//	               1: 93
	//	               2: 158
	//	               7: 263;
	//   18   42:lookupswitch    3: default 76
	//	               1: 93
	//	               2: 158
	//	               7: 263
		   goto _L3 _L4 _L5 _L6
_L3:
		throw new RuntimeException(MessageLocalization.getComposedMessage("only.rgb.gray.and.cmyk.are.supported.as.alternative.color.spaces", new Object[0]));
	//   19   76:new             #84  <Class RuntimeException>
	//   20   79:dup             
	//   21   80:ldc1            #86  <String "only.rgb.gray.and.cmyk.are.supported.as.alternative.color.spaces">
	//   22   82:iconst_0        
	//   23   83:anewarray       Object[]
	//   24   86:invokestatic    #92  <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//   25   89:invokespecial   #93  <Method void RuntimeException(String)>
	//   26   92:athrow          
_L4:
		pdfarray.add(((PdfObject) (PdfName.DEVICEGRAY)));
	//   27   93:aload           6
	//   28   95:getstatic       #96  <Field PdfName PdfName.DEVICEGRAY>
	//   29   98:invokevirtual   #78  <Method boolean PdfArray.add(PdfObject)>
	//   30  101:pop             
		float f = ((GrayColor)altcs).getGray();
	//   31  102:aload_0         
	//   32  103:getfield        #28  <Field BaseColor altcs>
	//   33  106:checkcast       #98  <Class GrayColor>
	//   34  109:invokevirtual   #102 <Method float GrayColor.getGray()>
	//   35  112:fstore_2        
		pdfwriter = ((PdfWriter) (PdfFunction.type2(pdfwriter, new float[] {
			0.0F, 1.0F
		}, ((float []) (null)), new float[] {
			1.0F
		}, new float[] {
			f
		}, 1.0F)));
	//   36  113:aload_1         
	//   37  114:iconst_2        
	//   38  115:newarray        float[]
	//   39  117:dup             
	//   40  118:iconst_0        
	//   41  119:fconst_0        
	//   42  120:fastore         
	//   43  121:dup             
	//   44  122:iconst_1        
	//   45  123:fconst_1        
	//   46  124:fastore         
	//   47  125:aconst_null     
	//   48  126:iconst_1        
	//   49  127:newarray        float[]
	//   50  129:dup             
	//   51  130:iconst_0        
	//   52  131:fconst_1        
	//   53  132:fastore         
	//   54  133:iconst_1        
	//   55  134:newarray        float[]
	//   56  136:dup             
	//   57  137:iconst_0        
	//   58  138:fload_2         
	//   59  139:fastore         
	//   60  140:fconst_1        
	//   61  141:invokestatic    #108 <Method PdfFunction PdfFunction.type2(PdfWriter, float[], float[], float[], float[], float)>
	//   62  144:astore_1        
_L8:
		pdfarray.add(((PdfObject) (((PdfFunction) (pdfwriter)).getReference())));
	//   63  145:aload           6
	//   64  147:aload_1         
	//   65  148:invokevirtual   #112 <Method PdfIndirectReference PdfFunction.getReference()>
	//   66  151:invokevirtual   #78  <Method boolean PdfArray.add(PdfObject)>
	//   67  154:pop             
		return ((PdfObject) (pdfarray));
	//   68  155:aload           6
	//   69  157:areturn         
_L5:
		pdfarray.add(((PdfObject) (PdfName.DEVICECMYK)));
	//   70  158:aload           6
	//   71  160:getstatic       #115 <Field PdfName PdfName.DEVICECMYK>
	//   72  163:invokevirtual   #78  <Method boolean PdfArray.add(PdfObject)>
	//   73  166:pop             
		CMYKColor cmykcolor = (CMYKColor)altcs;
	//   74  167:aload_0         
	//   75  168:getfield        #28  <Field BaseColor altcs>
	//   76  171:checkcast       #117 <Class CMYKColor>
	//   77  174:astore          7
		float f1 = cmykcolor.getCyan();
	//   78  176:aload           7
	//   79  178:invokevirtual   #120 <Method float CMYKColor.getCyan()>
	//   80  181:fstore_2        
		float f4 = cmykcolor.getMagenta();
	//   81  182:aload           7
	//   82  184:invokevirtual   #123 <Method float CMYKColor.getMagenta()>
	//   83  187:fstore_3        
		float f7 = cmykcolor.getYellow();
	//   84  188:aload           7
	//   85  190:invokevirtual   #126 <Method float CMYKColor.getYellow()>
	//   86  193:fstore          4
		float f10 = cmykcolor.getBlack();
	//   87  195:aload           7
	//   88  197:invokevirtual   #129 <Method float CMYKColor.getBlack()>
	//   89  200:fstore          5
		pdfwriter = ((PdfWriter) (PdfFunction.type2(pdfwriter, new float[] {
			0.0F, 1.0F
		}, ((float []) (null)), new float[] {
			0.0F, 0.0F, 0.0F, 0.0F
		}, new float[] {
			f1, f4, f7, f10
		}, 1.0F)));
	//   90  202:aload_1         
	//   91  203:iconst_2        
	//   92  204:newarray        float[]
	//   93  206:dup             
	//   94  207:iconst_0        
	//   95  208:fconst_0        
	//   96  209:fastore         
	//   97  210:dup             
	//   98  211:iconst_1        
	//   99  212:fconst_1        
	//  100  213:fastore         
	//  101  214:aconst_null     
	//  102  215:iconst_4        
	//  103  216:newarray        float[]
	//  104  218:dup             
	//  105  219:iconst_0        
	//  106  220:fconst_0        
	//  107  221:fastore         
	//  108  222:dup             
	//  109  223:iconst_1        
	//  110  224:fconst_0        
	//  111  225:fastore         
	//  112  226:dup             
	//  113  227:iconst_2        
	//  114  228:fconst_0        
	//  115  229:fastore         
	//  116  230:dup             
	//  117  231:iconst_3        
	//  118  232:fconst_0        
	//  119  233:fastore         
	//  120  234:iconst_4        
	//  121  235:newarray        float[]
	//  122  237:dup             
	//  123  238:iconst_0        
	//  124  239:fload_2         
	//  125  240:fastore         
	//  126  241:dup             
	//  127  242:iconst_1        
	//  128  243:fload_3         
	//  129  244:fastore         
	//  130  245:dup             
	//  131  246:iconst_2        
	//  132  247:fload           4
	//  133  249:fastore         
	//  134  250:dup             
	//  135  251:iconst_3        
	//  136  252:fload           5
	//  137  254:fastore         
	//  138  255:fconst_1        
	//  139  256:invokestatic    #108 <Method PdfFunction PdfFunction.type2(PdfWriter, float[], float[], float[], float[], float)>
	//  140  259:astore_1        
		continue; /* Loop/switch isn't completed */
	//  141  260:goto            145
_L6:
		LabColor labcolor = (LabColor)altcs;
	//  142  263:aload_0         
	//  143  264:getfield        #28  <Field BaseColor altcs>
	//  144  267:checkcast       #50  <Class LabColor>
	//  145  270:astore          7
		float f2;
		float f5;
		float f8;
		if(altColorDetails != null)
	//* 146  272:aload_0         
	//* 147  273:getfield        #42  <Field ColorDetails altColorDetails>
	//* 148  276:ifnull          364
			pdfarray.add(((PdfObject) (altColorDetails.getIndirectReference())));
	//  149  279:aload           6
	//  150  281:aload_0         
	//  151  282:getfield        #42  <Field ColorDetails altColorDetails>
	//  152  285:invokevirtual   #132 <Method PdfIndirectReference ColorDetails.getIndirectReference()>
	//  153  288:invokevirtual   #78  <Method boolean PdfArray.add(PdfObject)>
	//  154  291:pop             
		else
	//* 155  292:aload           7
	//* 156  294:invokevirtual   #135 <Method float LabColor.getL()>
	//* 157  297:fstore_2        
	//* 158  298:aload           7
	//* 159  300:invokevirtual   #138 <Method float LabColor.getA()>
	//* 160  303:fstore_3        
	//* 161  304:aload           7
	//* 162  306:invokevirtual   #141 <Method float LabColor.getB()>
	//* 163  309:fstore          4
	//* 164  311:aload_1         
	//* 165  312:iconst_2        
	//* 166  313:newarray        float[]
	//* 167  315:dup             
	//* 168  316:iconst_0        
	//* 169  317:fconst_0        
	//* 170  318:fastore         
	//* 171  319:dup             
	//* 172  320:iconst_1        
	//* 173  321:fconst_1        
	//* 174  322:fastore         
	//* 175  323:aconst_null     
	//* 176  324:iconst_3        
	//* 177  325:newarray        float[]
	//* 178  327:dup             
	//* 179  328:iconst_0        
	//* 180  329:ldc1            #142 <Float 100F>
	//* 181  331:fastore         
	//* 182  332:dup             
	//* 183  333:iconst_1        
	//* 184  334:fconst_0        
	//* 185  335:fastore         
	//* 186  336:dup             
	//* 187  337:iconst_2        
	//* 188  338:fconst_0        
	//* 189  339:fastore         
	//* 190  340:iconst_3        
	//* 191  341:newarray        float[]
	//* 192  343:dup             
	//* 193  344:iconst_0        
	//* 194  345:fload_2         
	//* 195  346:fastore         
	//* 196  347:dup             
	//* 197  348:iconst_1        
	//* 198  349:fload_3         
	//* 199  350:fastore         
	//* 200  351:dup             
	//* 201  352:iconst_2        
	//* 202  353:fload           4
	//* 203  355:fastore         
	//* 204  356:fconst_1        
	//* 205  357:invokestatic    #108 <Method PdfFunction PdfFunction.type2(PdfWriter, float[], float[], float[], float[], float)>
	//* 206  360:astore_1        
	//* 207  361:goto            145
			pdfarray.add(labcolor.getLabColorSpace().getPdfObject(pdfwriter));
	//  208  364:aload           6
	//  209  366:aload           7
	//  210  368:invokevirtual   #54  <Method PdfLabColor LabColor.getLabColorSpace()>
	//  211  371:aload_1         
	//  212  372:invokevirtual   #146 <Method PdfObject PdfLabColor.getPdfObject(PdfWriter)>
	//  213  375:invokevirtual   #78  <Method boolean PdfArray.add(PdfObject)>
	//  214  378:pop             
		f2 = labcolor.getL();
		f5 = labcolor.getA();
		f8 = labcolor.getB();
		pdfwriter = ((PdfWriter) (PdfFunction.type2(pdfwriter, new float[] {
			0.0F, 1.0F
		}, ((float []) (null)), new float[] {
			100F, 0.0F, 0.0F
		}, new float[] {
			f2, f5, f8
		}, 1.0F)));
		continue; /* Loop/switch isn't completed */
	//  215  379:goto            292
_L2:
		pdfarray.add(((PdfObject) (PdfName.DEVICERGB)));
	//  216  382:aload           6
	//  217  384:getstatic       #149 <Field PdfName PdfName.DEVICERGB>
	//  218  387:invokevirtual   #78  <Method boolean PdfArray.add(PdfObject)>
	//  219  390:pop             
		float f3 = (float)altcs.getRed() / 255F;
	//  220  391:aload_0         
	//  221  392:getfield        #28  <Field BaseColor altcs>
	//  222  395:invokevirtual   #152 <Method int BaseColor.getRed()>
	//  223  398:i2f             
	//  224  399:ldc1            #153 <Float 255F>
	//  225  401:fdiv            
	//  226  402:fstore_2        
		float f6 = (float)altcs.getGreen() / 255F;
	//  227  403:aload_0         
	//  228  404:getfield        #28  <Field BaseColor altcs>
	//  229  407:invokevirtual   #156 <Method int BaseColor.getGreen()>
	//  230  410:i2f             
	//  231  411:ldc1            #153 <Float 255F>
	//  232  413:fdiv            
	//  233  414:fstore_3        
		float f9 = (float)altcs.getBlue() / 255F;
	//  234  415:aload_0         
	//  235  416:getfield        #28  <Field BaseColor altcs>
	//  236  419:invokevirtual   #159 <Method int BaseColor.getBlue()>
	//  237  422:i2f             
	//  238  423:ldc1            #153 <Float 255F>
	//  239  425:fdiv            
	//  240  426:fstore          4
		pdfwriter = ((PdfWriter) (PdfFunction.type2(pdfwriter, new float[] {
			0.0F, 1.0F
		}, ((float []) (null)), new float[] {
			1.0F, 1.0F, 1.0F
		}, new float[] {
			f3, f6, f9
		}, 1.0F)));
	//  241  428:aload_1         
	//  242  429:iconst_2        
	//  243  430:newarray        float[]
	//  244  432:dup             
	//  245  433:iconst_0        
	//  246  434:fconst_0        
	//  247  435:fastore         
	//  248  436:dup             
	//  249  437:iconst_1        
	//  250  438:fconst_1        
	//  251  439:fastore         
	//  252  440:aconst_null     
	//  253  441:iconst_3        
	//  254  442:newarray        float[]
	//  255  444:dup             
	//  256  445:iconst_0        
	//  257  446:fconst_1        
	//  258  447:fastore         
	//  259  448:dup             
	//  260  449:iconst_1        
	//  261  450:fconst_1        
	//  262  451:fastore         
	//  263  452:dup             
	//  264  453:iconst_2        
	//  265  454:fconst_1        
	//  266  455:fastore         
	//  267  456:iconst_3        
	//  268  457:newarray        float[]
	//  269  459:dup             
	//  270  460:iconst_0        
	//  271  461:fload_2         
	//  272  462:fastore         
	//  273  463:dup             
	//  274  464:iconst_1        
	//  275  465:fload_3         
	//  276  466:fastore         
	//  277  467:dup             
	//  278  468:iconst_2        
	//  279  469:fload           4
	//  280  471:fastore         
	//  281  472:fconst_1        
	//  282  473:invokestatic    #108 <Method PdfFunction PdfFunction.type2(PdfWriter, float[], float[], float[], float[], float)>
	//  283  476:astore_1        
		if(true) goto _L8; else goto _L7
	//  284  477:goto            145
_L7:
	}

	protected PdfObject getSpotObject(PdfWriter pdfwriter)
	{
		return getPdfObject(pdfwriter);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #162 <Method PdfObject getPdfObject(PdfWriter)>
	//    3    5:areturn         
	}

	public int hashCode()
	{
		return name.hashCode() * 31 + altcs.hashCode();
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field PdfName name>
	//    2    4:invokevirtual   #166 <Method int PdfName.hashCode()>
	//    3    7:bipush          31
	//    4    9:imul            
	//    5   10:aload_0         
	//    6   11:getfield        #28  <Field BaseColor altcs>
	//    7   14:invokevirtual   #167 <Method int BaseColor.hashCode()>
	//    8   17:iadd            
	//    9   18:ireturn         
	}

	public ColorDetails altColorDetails;
	public BaseColor altcs;
	public PdfName name;
}

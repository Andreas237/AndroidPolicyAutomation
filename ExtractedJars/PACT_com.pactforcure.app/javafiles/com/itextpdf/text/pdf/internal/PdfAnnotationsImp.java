// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf.internal;

import com.itextpdf.text.*;
import com.itextpdf.text.pdf.*;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;

public class PdfAnnotationsImp
{

	public PdfAnnotationsImp(PdfWriter pdfwriter)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
		annotations = new ArrayList();
	//    2    4:aload_0         
	//    3    5:new             #17  <Class ArrayList>
	//    4    8:dup             
	//    5    9:invokespecial   #18  <Method void ArrayList()>
	//    6   12:putfield        #20  <Field ArrayList annotations>
		delayedAnnotations = new ArrayList();
	//    7   15:aload_0         
	//    8   16:new             #17  <Class ArrayList>
	//    9   19:dup             
	//   10   20:invokespecial   #18  <Method void ArrayList()>
	//   11   23:putfield        #22  <Field ArrayList delayedAnnotations>
		acroForm = new PdfAcroForm(pdfwriter);
	//   12   26:aload_0         
	//   13   27:new             #24  <Class PdfAcroForm>
	//   14   30:dup             
	//   15   31:aload_1         
	//   16   32:invokespecial   #26  <Method void PdfAcroForm(PdfWriter)>
	//   17   35:putfield        #28  <Field PdfAcroForm acroForm>
	//   18   38:return          
	}

	public static PdfAnnotation convertAnnotation(PdfWriter pdfwriter, Annotation annotation, Rectangle rectangle)
		throws IOException
	{
		switch(annotation.annotationType())
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #39  <Method int Annotation.annotationType()>
		{
	//*   2    4:tableswitch     1 7: default 48
	//	               1 96
	//	               2 137
	//	               3 178
	//	               4 337
	//	               5 393
	//	               6 437
	//	               7 231
		default:
			return pdfwriter.createAnnotation(rectangle.getLeft(), rectangle.getBottom(), rectangle.getRight(), rectangle.getTop(), new PdfString(annotation.title(), "UnicodeBig"), new PdfString(annotation.content(), "UnicodeBig"), ((PdfName) (null)));
	//    3   48:aload_0         
	//    4   49:aload_2         
	//    5   50:invokevirtual   #45  <Method float Rectangle.getLeft()>
	//    6   53:aload_2         
	//    7   54:invokevirtual   #48  <Method float Rectangle.getBottom()>
	//    8   57:aload_2         
	//    9   58:invokevirtual   #51  <Method float Rectangle.getRight()>
	//   10   61:aload_2         
	//   11   62:invokevirtual   #54  <Method float Rectangle.getTop()>
	//   12   65:new             #56  <Class PdfString>
	//   13   68:dup             
	//   14   69:aload_1         
	//   15   70:invokevirtual   #60  <Method String Annotation.title()>
	//   16   73:ldc1            #62  <String "UnicodeBig">
	//   17   75:invokespecial   #65  <Method void PdfString(String, String)>
	//   18   78:new             #56  <Class PdfString>
	//   19   81:dup             
	//   20   82:aload_1         
	//   21   83:invokevirtual   #68  <Method String Annotation.content()>
	//   22   86:ldc1            #62  <String "UnicodeBig">
	//   23   88:invokespecial   #65  <Method void PdfString(String, String)>
	//   24   91:aconst_null     
	//   25   92:invokevirtual   #74  <Method PdfAnnotation PdfWriter.createAnnotation(float, float, float, float, PdfString, PdfString, PdfName)>
	//   26   95:areturn         

		case 1: // '\001'
			return pdfwriter.createAnnotation(annotation.llx(), annotation.lly(), annotation.urx(), annotation.ury(), new PdfAction((URL)annotation.attributes().get("url")), ((PdfName) (null)));
	//   27   96:aload_0         
	//   28   97:aload_1         
	//   29   98:invokevirtual   #77  <Method float Annotation.llx()>
	//   30  101:aload_1         
	//   31  102:invokevirtual   #80  <Method float Annotation.lly()>
	//   32  105:aload_1         
	//   33  106:invokevirtual   #83  <Method float Annotation.urx()>
	//   34  109:aload_1         
	//   35  110:invokevirtual   #86  <Method float Annotation.ury()>
	//   36  113:new             #88  <Class PdfAction>
	//   37  116:dup             
	//   38  117:aload_1         
	//   39  118:invokevirtual   #92  <Method HashMap Annotation.attributes()>
	//   40  121:ldc1            #94  <String "url">
	//   41  123:invokevirtual   #100 <Method Object HashMap.get(Object)>
	//   42  126:checkcast       #102 <Class URL>
	//   43  129:invokespecial   #105 <Method void PdfAction(URL)>
	//   44  132:aconst_null     
	//   45  133:invokevirtual   #108 <Method PdfAnnotation PdfWriter.createAnnotation(float, float, float, float, PdfAction, PdfName)>
	//   46  136:areturn         

		case 2: // '\002'
			return pdfwriter.createAnnotation(annotation.llx(), annotation.lly(), annotation.urx(), annotation.ury(), new PdfAction((String)annotation.attributes().get("file")), ((PdfName) (null)));
	//   47  137:aload_0         
	//   48  138:aload_1         
	//   49  139:invokevirtual   #77  <Method float Annotation.llx()>
	//   50  142:aload_1         
	//   51  143:invokevirtual   #80  <Method float Annotation.lly()>
	//   52  146:aload_1         
	//   53  147:invokevirtual   #83  <Method float Annotation.urx()>
	//   54  150:aload_1         
	//   55  151:invokevirtual   #86  <Method float Annotation.ury()>
	//   56  154:new             #88  <Class PdfAction>
	//   57  157:dup             
	//   58  158:aload_1         
	//   59  159:invokevirtual   #92  <Method HashMap Annotation.attributes()>
	//   60  162:ldc1            #110 <String "file">
	//   61  164:invokevirtual   #100 <Method Object HashMap.get(Object)>
	//   62  167:checkcast       #112 <Class String>
	//   63  170:invokespecial   #115 <Method void PdfAction(String)>
	//   64  173:aconst_null     
	//   65  174:invokevirtual   #108 <Method PdfAnnotation PdfWriter.createAnnotation(float, float, float, float, PdfAction, PdfName)>
	//   66  177:areturn         

		case 3: // '\003'
			return pdfwriter.createAnnotation(annotation.llx(), annotation.lly(), annotation.urx(), annotation.ury(), new PdfAction((String)annotation.attributes().get("file"), (String)annotation.attributes().get("destination")), ((PdfName) (null)));
	//   67  178:aload_0         
	//   68  179:aload_1         
	//   69  180:invokevirtual   #77  <Method float Annotation.llx()>
	//   70  183:aload_1         
	//   71  184:invokevirtual   #80  <Method float Annotation.lly()>
	//   72  187:aload_1         
	//   73  188:invokevirtual   #83  <Method float Annotation.urx()>
	//   74  191:aload_1         
	//   75  192:invokevirtual   #86  <Method float Annotation.ury()>
	//   76  195:new             #88  <Class PdfAction>
	//   77  198:dup             
	//   78  199:aload_1         
	//   79  200:invokevirtual   #92  <Method HashMap Annotation.attributes()>
	//   80  203:ldc1            #110 <String "file">
	//   81  205:invokevirtual   #100 <Method Object HashMap.get(Object)>
	//   82  208:checkcast       #112 <Class String>
	//   83  211:aload_1         
	//   84  212:invokevirtual   #92  <Method HashMap Annotation.attributes()>
	//   85  215:ldc1            #117 <String "destination">
	//   86  217:invokevirtual   #100 <Method Object HashMap.get(Object)>
	//   87  220:checkcast       #112 <Class String>
	//   88  223:invokespecial   #118 <Method void PdfAction(String, String)>
	//   89  226:aconst_null     
	//   90  227:invokevirtual   #108 <Method PdfAnnotation PdfWriter.createAnnotation(float, float, float, float, PdfAction, PdfName)>
	//   91  230:areturn         

		case 7: // '\007'
			boolean aflag[] = (boolean[])(boolean[])annotation.attributes().get("parameters");
	//   92  231:aload_1         
	//   93  232:invokevirtual   #92  <Method HashMap Annotation.attributes()>
	//   94  235:ldc1            #120 <String "parameters">
	//   95  237:invokevirtual   #100 <Method Object HashMap.get(Object)>
	//   96  240:checkcast       #122 <Class boolean[]>
	//   97  243:checkcast       #122 <Class boolean[]>
	//   98  246:astore_3        
			String s = (String)annotation.attributes().get("file");
	//   99  247:aload_1         
	//  100  248:invokevirtual   #92  <Method HashMap Annotation.attributes()>
	//  101  251:ldc1            #110 <String "file">
	//  102  253:invokevirtual   #100 <Method Object HashMap.get(Object)>
	//  103  256:checkcast       #112 <Class String>
	//  104  259:astore          4
			String s1 = (String)annotation.attributes().get("mime");
	//  105  261:aload_1         
	//  106  262:invokevirtual   #92  <Method HashMap Annotation.attributes()>
	//  107  265:ldc1            #124 <String "mime">
	//  108  267:invokevirtual   #100 <Method Object HashMap.get(Object)>
	//  109  270:checkcast       #112 <Class String>
	//  110  273:astore          5
			if(aflag[0])
	//* 111  275:aload_3         
	//* 112  276:iconst_0        
	//* 113  277:baload          
	//* 114  278:ifeq            327
				rectangle = ((Rectangle) (PdfFileSpecification.fileEmbedded(pdfwriter, s, s, ((byte []) (null)))));
	//  115  281:aload_0         
	//  116  282:aload           4
	//  117  284:aload           4
	//  118  286:aconst_null     
	//  119  287:invokestatic    #130 <Method PdfFileSpecification PdfFileSpecification.fileEmbedded(PdfWriter, String, String, byte[])>
	//  120  290:astore_2        
			else
	//* 121  291:aload_0         
	//* 122  292:new             #41  <Class Rectangle>
	//* 123  295:dup             
	//* 124  296:aload_1         
	//* 125  297:invokevirtual   #77  <Method float Annotation.llx()>
	//* 126  300:aload_1         
	//* 127  301:invokevirtual   #80  <Method float Annotation.lly()>
	//* 128  304:aload_1         
	//* 129  305:invokevirtual   #83  <Method float Annotation.urx()>
	//* 130  308:aload_1         
	//* 131  309:invokevirtual   #86  <Method float Annotation.ury()>
	//* 132  312:invokespecial   #133 <Method void Rectangle(float, float, float, float)>
	//* 133  315:aload           4
	//* 134  317:aload_2         
	//* 135  318:aload           5
	//* 136  320:aload_3         
	//* 137  321:iconst_1        
	//* 138  322:baload          
	//* 139  323:invokestatic    #139 <Method PdfAnnotation PdfAnnotation.createScreen(PdfWriter, Rectangle, String, PdfFileSpecification, String, boolean)>
	//* 140  326:areturn         
				rectangle = ((Rectangle) (PdfFileSpecification.fileExtern(pdfwriter, s)));
	//  141  327:aload_0         
	//  142  328:aload           4
	//  143  330:invokestatic    #143 <Method PdfFileSpecification PdfFileSpecification.fileExtern(PdfWriter, String)>
	//  144  333:astore_2        
			return PdfAnnotation.createScreen(pdfwriter, new Rectangle(annotation.llx(), annotation.lly(), annotation.urx(), annotation.ury()), s, ((PdfFileSpecification) (rectangle)), s1, aflag[1]);

	//* 145  334:goto            291
		case 4: // '\004'
			return pdfwriter.createAnnotation(annotation.llx(), annotation.lly(), annotation.urx(), annotation.ury(), new PdfAction((String)annotation.attributes().get("file"), ((Integer)annotation.attributes().get("page")).intValue()), ((PdfName) (null)));
	//  146  337:aload_0         
	//  147  338:aload_1         
	//  148  339:invokevirtual   #77  <Method float Annotation.llx()>
	//  149  342:aload_1         
	//  150  343:invokevirtual   #80  <Method float Annotation.lly()>
	//  151  346:aload_1         
	//  152  347:invokevirtual   #83  <Method float Annotation.urx()>
	//  153  350:aload_1         
	//  154  351:invokevirtual   #86  <Method float Annotation.ury()>
	//  155  354:new             #88  <Class PdfAction>
	//  156  357:dup             
	//  157  358:aload_1         
	//  158  359:invokevirtual   #92  <Method HashMap Annotation.attributes()>
	//  159  362:ldc1            #110 <String "file">
	//  160  364:invokevirtual   #100 <Method Object HashMap.get(Object)>
	//  161  367:checkcast       #112 <Class String>
	//  162  370:aload_1         
	//  163  371:invokevirtual   #92  <Method HashMap Annotation.attributes()>
	//  164  374:ldc1            #145 <String "page">
	//  165  376:invokevirtual   #100 <Method Object HashMap.get(Object)>
	//  166  379:checkcast       #147 <Class Integer>
	//  167  382:invokevirtual   #150 <Method int Integer.intValue()>
	//  168  385:invokespecial   #153 <Method void PdfAction(String, int)>
	//  169  388:aconst_null     
	//  170  389:invokevirtual   #108 <Method PdfAnnotation PdfWriter.createAnnotation(float, float, float, float, PdfAction, PdfName)>
	//  171  392:areturn         

		case 5: // '\005'
			return pdfwriter.createAnnotation(annotation.llx(), annotation.lly(), annotation.urx(), annotation.ury(), new PdfAction(((Integer)annotation.attributes().get("named")).intValue()), ((PdfName) (null)));
	//  172  393:aload_0         
	//  173  394:aload_1         
	//  174  395:invokevirtual   #77  <Method float Annotation.llx()>
	//  175  398:aload_1         
	//  176  399:invokevirtual   #80  <Method float Annotation.lly()>
	//  177  402:aload_1         
	//  178  403:invokevirtual   #83  <Method float Annotation.urx()>
	//  179  406:aload_1         
	//  180  407:invokevirtual   #86  <Method float Annotation.ury()>
	//  181  410:new             #88  <Class PdfAction>
	//  182  413:dup             
	//  183  414:aload_1         
	//  184  415:invokevirtual   #92  <Method HashMap Annotation.attributes()>
	//  185  418:ldc1            #155 <String "named">
	//  186  420:invokevirtual   #100 <Method Object HashMap.get(Object)>
	//  187  423:checkcast       #147 <Class Integer>
	//  188  426:invokevirtual   #150 <Method int Integer.intValue()>
	//  189  429:invokespecial   #158 <Method void PdfAction(int)>
	//  190  432:aconst_null     
	//  191  433:invokevirtual   #108 <Method PdfAnnotation PdfWriter.createAnnotation(float, float, float, float, PdfAction, PdfName)>
	//  192  436:areturn         

		case 6: // '\006'
			return pdfwriter.createAnnotation(annotation.llx(), annotation.lly(), annotation.urx(), annotation.ury(), new PdfAction((String)annotation.attributes().get("application"), (String)annotation.attributes().get("parameters"), (String)annotation.attributes().get("operation"), (String)annotation.attributes().get("defaultdir")), ((PdfName) (null)));
	//  193  437:aload_0         
	//  194  438:aload_1         
	//  195  439:invokevirtual   #77  <Method float Annotation.llx()>
	//  196  442:aload_1         
	//  197  443:invokevirtual   #80  <Method float Annotation.lly()>
	//  198  446:aload_1         
	//  199  447:invokevirtual   #83  <Method float Annotation.urx()>
	//  200  450:aload_1         
	//  201  451:invokevirtual   #86  <Method float Annotation.ury()>
	//  202  454:new             #88  <Class PdfAction>
	//  203  457:dup             
	//  204  458:aload_1         
	//  205  459:invokevirtual   #92  <Method HashMap Annotation.attributes()>
	//  206  462:ldc1            #160 <String "application">
	//  207  464:invokevirtual   #100 <Method Object HashMap.get(Object)>
	//  208  467:checkcast       #112 <Class String>
	//  209  470:aload_1         
	//  210  471:invokevirtual   #92  <Method HashMap Annotation.attributes()>
	//  211  474:ldc1            #120 <String "parameters">
	//  212  476:invokevirtual   #100 <Method Object HashMap.get(Object)>
	//  213  479:checkcast       #112 <Class String>
	//  214  482:aload_1         
	//  215  483:invokevirtual   #92  <Method HashMap Annotation.attributes()>
	//  216  486:ldc1            #162 <String "operation">
	//  217  488:invokevirtual   #100 <Method Object HashMap.get(Object)>
	//  218  491:checkcast       #112 <Class String>
	//  219  494:aload_1         
	//  220  495:invokevirtual   #92  <Method HashMap Annotation.attributes()>
	//  221  498:ldc1            #164 <String "defaultdir">
	//  222  500:invokevirtual   #100 <Method Object HashMap.get(Object)>
	//  223  503:checkcast       #112 <Class String>
	//  224  506:invokespecial   #167 <Method void PdfAction(String, String, String, String)>
	//  225  509:aconst_null     
	//  226  510:invokevirtual   #108 <Method PdfAnnotation PdfWriter.createAnnotation(float, float, float, float, PdfAction, PdfName)>
	//  227  513:areturn         
		}
	}

	public void addAnnotation(PdfAnnotation pdfannotation)
	{
		if(pdfannotation.isForm())
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #174 <Method boolean PdfAnnotation.isForm()>
	//*   2    4:ifeq            25
		{
			pdfannotation = ((PdfAnnotation) ((PdfFormField)pdfannotation));
	//    3    7:aload_1         
	//    4    8:checkcast       #176 <Class PdfFormField>
	//    5   11:astore_1        
			if(((PdfFormField) (pdfannotation)).getParent() == null)
	//*   6   12:aload_1         
	//*   7   13:invokevirtual   #180 <Method PdfFormField PdfFormField.getParent()>
	//*   8   16:ifnonnull       24
				addFormFieldRaw(((PdfFormField) (pdfannotation)));
	//    9   19:aload_0         
	//   10   20:aload_1         
	//   11   21:invokevirtual   #184 <Method void addFormFieldRaw(PdfFormField)>
			return;
	//   12   24:return          
		} else
		{
			annotations.add(((Object) (pdfannotation)));
	//   13   25:aload_0         
	//   14   26:getfield        #20  <Field ArrayList annotations>
	//   15   29:aload_1         
	//   16   30:invokevirtual   #188 <Method boolean ArrayList.add(Object)>
	//   17   33:pop             
			return;
	//   18   34:return          
		}
	}

	public void addCalculationOrder(PdfFormField pdfformfield)
	{
		acroForm.addCalculationOrder(pdfformfield);
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field PdfAcroForm acroForm>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #191 <Method void PdfAcroForm.addCalculationOrder(PdfFormField)>
	//    4    8:return          
	}

	void addFormFieldRaw(PdfFormField pdfformfield)
	{
		annotations.add(((Object) (pdfformfield)));
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field ArrayList annotations>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #188 <Method boolean ArrayList.add(Object)>
	//    4    8:pop             
		pdfformfield = ((PdfFormField) (pdfformfield.getKids()));
	//    5    9:aload_1         
	//    6   10:invokevirtual   #195 <Method ArrayList PdfFormField.getKids()>
	//    7   13:astore_1        
		if(pdfformfield != null)
	//*   8   14:aload_1         
	//*   9   15:ifnull          56
		{
			for(int i = 0; i < ((ArrayList) (pdfformfield)).size(); i++)
	//*  10   18:iconst_0        
	//*  11   19:istore_2        
	//*  12   20:iload_2         
	//*  13   21:aload_1         
	//*  14   22:invokevirtual   #198 <Method int ArrayList.size()>
	//*  15   25:icmpge          56
			{
				PdfFormField pdfformfield1 = (PdfFormField)((ArrayList) (pdfformfield)).get(i);
	//   16   28:aload_1         
	//   17   29:iload_2         
	//   18   30:invokevirtual   #201 <Method Object ArrayList.get(int)>
	//   19   33:checkcast       #176 <Class PdfFormField>
	//   20   36:astore_3        
				if(!pdfformfield1.isUsed())
	//*  21   37:aload_3         
	//*  22   38:invokevirtual   #204 <Method boolean PdfFormField.isUsed()>
	//*  23   41:ifne            49
					addFormFieldRaw(pdfformfield1);
	//   24   44:aload_0         
	//   25   45:aload_3         
	//   26   46:invokevirtual   #184 <Method void addFormFieldRaw(PdfFormField)>
			}

	//   27   49:iload_2         
	//   28   50:iconst_1        
	//   29   51:iadd            
	//   30   52:istore_2        
		}
	//*  31   53:goto            20
	//   32   56:return          
	}

	public void addPlainAnnotation(PdfAnnotation pdfannotation)
	{
		annotations.add(((Object) (pdfannotation)));
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field ArrayList annotations>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #188 <Method boolean ArrayList.add(Object)>
	//    4    8:pop             
	//    5    9:return          
	}

	public PdfAcroForm getAcroForm()
	{
		return acroForm;
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field PdfAcroForm acroForm>
	//    2    4:areturn         
	}

	public boolean hasUnusedAnnotations()
	{
		return !annotations.isEmpty();
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field ArrayList annotations>
	//    2    4:invokevirtual   #211 <Method boolean ArrayList.isEmpty()>
	//    3    7:ifne            12
	//    4   10:iconst_1        
	//    5   11:ireturn         
	//    6   12:iconst_0        
	//    7   13:ireturn         
	}

	public boolean hasValidAcroForm()
	{
		return acroForm.isValid();
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field PdfAcroForm acroForm>
	//    2    4:invokevirtual   #215 <Method boolean PdfAcroForm.isValid()>
	//    3    7:ireturn         
	}

	public void resetAnnotations()
	{
		annotations = delayedAnnotations;
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #22  <Field ArrayList delayedAnnotations>
	//    3    5:putfield        #20  <Field ArrayList annotations>
		delayedAnnotations = new ArrayList();
	//    4    8:aload_0         
	//    5    9:new             #17  <Class ArrayList>
	//    6   12:dup             
	//    7   13:invokespecial   #18  <Method void ArrayList()>
	//    8   16:putfield        #22  <Field ArrayList delayedAnnotations>
	//    9   19:return          
	}

	public PdfArray rotateAnnotations(PdfWriter pdfwriter, Rectangle rectangle)
	{
		int i;
		int j;
		int k;
		PdfArray pdfarray;
		pdfarray = new PdfArray();
	//    0    0:new             #220 <Class PdfArray>
	//    1    3:dup             
	//    2    4:invokespecial   #221 <Method void PdfArray()>
	//    3    7:astore          7
		j = rectangle.getRotation();
	//    4    9:aload_2         
	//    5   10:invokevirtual   #224 <Method int Rectangle.getRotation()>
	//    6   13:istore          4
		k = pdfwriter.getCurrentPageNumber();
	//    7   15:aload_1         
	//    8   16:invokevirtual   #227 <Method int PdfWriter.getCurrentPageNumber()>
	//    9   19:istore          5
		i = 0;
	//   10   21:iconst_0        
	//   11   22:istore_3        
_L2:
		PdfAnnotation pdfannotation;
		if(i >= annotations.size())
			break MISSING_BLOCK_LABEL_490;
	//   12   23:iload_3         
	//   13   24:aload_0         
	//   14   25:getfield        #20  <Field ArrayList annotations>
	//   15   28:invokevirtual   #198 <Method int ArrayList.size()>
	//   16   31:icmpge          490
		pdfannotation = (PdfAnnotation)annotations.get(i);
	//   17   34:aload_0         
	//   18   35:getfield        #20  <Field ArrayList annotations>
	//   19   38:iload_3         
	//   20   39:invokevirtual   #201 <Method Object ArrayList.get(int)>
	//   21   42:checkcast       #135 <Class PdfAnnotation>
	//   22   45:astore          8
		if(pdfannotation.getPlaceInPage() <= k)
			break; /* Loop/switch isn't completed */
	//   23   47:aload           8
	//   24   49:invokevirtual   #230 <Method int PdfAnnotation.getPlaceInPage()>
	//   25   52:iload           5
	//   26   54:icmple          74
		delayedAnnotations.add(((Object) (pdfannotation)));
	//   27   57:aload_0         
	//   28   58:getfield        #22  <Field ArrayList delayedAnnotations>
	//   29   61:aload           8
	//   30   63:invokevirtual   #188 <Method boolean ArrayList.add(Object)>
	//   31   66:pop             
_L10:
		i++;
	//   32   67:iload_3         
	//   33   68:iconst_1        
	//   34   69:iadd            
	//   35   70:istore_3        
		if(true) goto _L2; else goto _L1
	//   36   71:goto            23
_L1:
		if(pdfannotation.isForm())
	//*  37   74:aload           8
	//*  38   76:invokevirtual   #174 <Method boolean PdfAnnotation.isForm()>
	//*  39   79:ifeq            138
		{
			if(!pdfannotation.isUsed())
	//*  40   82:aload           8
	//*  41   84:invokevirtual   #231 <Method boolean PdfAnnotation.isUsed()>
	//*  42   87:ifne            111
			{
				java.util.HashSet hashset = pdfannotation.getTemplates();
	//   43   90:aload           8
	//   44   92:invokevirtual   #235 <Method java.util.HashSet PdfAnnotation.getTemplates()>
	//   45   95:astore          6
				if(hashset != null)
	//*  46   97:aload           6
	//*  47   99:ifnull          111
					acroForm.addFieldTemplates(hashset);
	//   48  102:aload_0         
	//   49  103:getfield        #28  <Field PdfAcroForm acroForm>
	//   50  106:aload           6
	//   51  108:invokevirtual   #239 <Method void PdfAcroForm.addFieldTemplates(java.util.HashSet)>
			}
			PdfFormField pdfformfield = (PdfFormField)pdfannotation;
	//   52  111:aload           8
	//   53  113:checkcast       #176 <Class PdfFormField>
	//   54  116:astore          6
			if(pdfformfield.getParent() == null)
	//*  55  118:aload           6
	//*  56  120:invokevirtual   #180 <Method PdfFormField PdfFormField.getParent()>
	//*  57  123:ifnonnull       138
				acroForm.addDocumentField(pdfformfield.getIndirectReference());
	//   58  126:aload_0         
	//   59  127:getfield        #28  <Field PdfAcroForm acroForm>
	//   60  130:aload           6
	//   61  132:invokevirtual   #243 <Method com.itextpdf.text.pdf.PdfIndirectReference PdfFormField.getIndirectReference()>
	//   62  135:invokevirtual   #247 <Method void PdfAcroForm.addDocumentField(com.itextpdf.text.pdf.PdfIndirectReference)>
		}
		if(!pdfannotation.isAnnotation()) goto _L4; else goto _L3
	//   63  138:aload           8
	//   64  140:invokevirtual   #250 <Method boolean PdfAnnotation.isAnnotation()>
	//   65  143:ifeq            268
_L3:
		pdfarray.add(((com.itextpdf.text.pdf.PdfObject) (pdfannotation.getIndirectReference())));
	//   66  146:aload           7
	//   67  148:aload           8
	//   68  150:invokevirtual   #251 <Method com.itextpdf.text.pdf.PdfIndirectReference PdfAnnotation.getIndirectReference()>
	//   69  153:invokevirtual   #254 <Method boolean PdfArray.add(com.itextpdf.text.pdf.PdfObject)>
	//   70  156:pop             
		if(pdfannotation.isUsed()) goto _L4; else goto _L5
	//   71  157:aload           8
	//   72  159:invokevirtual   #231 <Method boolean PdfAnnotation.isUsed()>
	//   73  162:ifne            268
_L5:
		Object obj;
		obj = ((Object) (pdfannotation.getAsArray(PdfName.RECT)));
	//   74  165:aload           8
	//   75  167:getstatic       #260 <Field PdfName PdfName.RECT>
	//   76  170:invokevirtual   #264 <Method PdfArray PdfAnnotation.getAsArray(PdfName)>
	//   77  173:astore          6
		if(((PdfArray) (obj)).size() == 4)
	//*  78  175:aload           6
	//*  79  177:invokevirtual   #265 <Method int PdfArray.size()>
	//*  80  180:iconst_4        
	//*  81  181:icmpne          306
			obj = ((Object) (new PdfRectangle(((PdfArray) (obj)).getAsNumber(0).floatValue(), ((PdfArray) (obj)).getAsNumber(1).floatValue(), ((PdfArray) (obj)).getAsNumber(2).floatValue(), ((PdfArray) (obj)).getAsNumber(3).floatValue())));
	//   82  184:new             #267 <Class PdfRectangle>
	//   83  187:dup             
	//   84  188:aload           6
	//   85  190:iconst_0        
	//   86  191:invokevirtual   #271 <Method PdfNumber PdfArray.getAsNumber(int)>
	//   87  194:invokevirtual   #276 <Method float PdfNumber.floatValue()>
	//   88  197:aload           6
	//   89  199:iconst_1        
	//   90  200:invokevirtual   #271 <Method PdfNumber PdfArray.getAsNumber(int)>
	//   91  203:invokevirtual   #276 <Method float PdfNumber.floatValue()>
	//   92  206:aload           6
	//   93  208:iconst_2        
	//   94  209:invokevirtual   #271 <Method PdfNumber PdfArray.getAsNumber(int)>
	//   95  212:invokevirtual   #276 <Method float PdfNumber.floatValue()>
	//   96  215:aload           6
	//   97  217:iconst_3        
	//   98  218:invokevirtual   #271 <Method PdfNumber PdfArray.getAsNumber(int)>
	//   99  221:invokevirtual   #276 <Method float PdfNumber.floatValue()>
	//  100  224:invokespecial   #277 <Method void PdfRectangle(float, float, float, float)>
	//  101  227:astore          6
		else
	//* 102  229:iload           4
	//* 103  231:sipush          360
	//* 104  234:irem            
	//* 105  235:lookupswitch    3: default 268
	//	               90: 336
	//	               180: 384
	//	               270: 442
	//* 106  268:aload           8
	//* 107  270:invokevirtual   #231 <Method boolean PdfAnnotation.isUsed()>
	//* 108  273:ifne            67
	//* 109  276:aload           8
	//* 110  278:invokevirtual   #280 <Method void PdfAnnotation.setUsed()>
	//* 111  281:aload_1         
	//* 112  282:aload           8
	//* 113  284:aload           8
	//* 114  286:invokevirtual   #251 <Method com.itextpdf.text.pdf.PdfIndirectReference PdfAnnotation.getIndirectReference()>
	//* 115  289:invokevirtual   #284 <Method com.itextpdf.text.pdf.PdfIndirectObject PdfWriter.addToBody(com.itextpdf.text.pdf.PdfObject, com.itextpdf.text.pdf.PdfIndirectReference)>
	//* 116  292:pop             
	//* 117  293:goto            67
	//* 118  296:astore_1        
	//* 119  297:new             #286 <Class ExceptionConverter>
	//* 120  300:dup             
	//* 121  301:aload_1         
	//* 122  302:invokespecial   #289 <Method void ExceptionConverter(Exception)>
	//* 123  305:athrow          
			obj = ((Object) (new PdfRectangle(((PdfArray) (obj)).getAsNumber(0).floatValue(), ((PdfArray) (obj)).getAsNumber(1).floatValue())));
	//  124  306:new             #267 <Class PdfRectangle>
	//  125  309:dup             
	//  126  310:aload           6
	//  127  312:iconst_0        
	//  128  313:invokevirtual   #271 <Method PdfNumber PdfArray.getAsNumber(int)>
	//  129  316:invokevirtual   #276 <Method float PdfNumber.floatValue()>
	//  130  319:aload           6
	//  131  321:iconst_1        
	//  132  322:invokevirtual   #271 <Method PdfNumber PdfArray.getAsNumber(int)>
	//  133  325:invokevirtual   #276 <Method float PdfNumber.floatValue()>
	//  134  328:invokespecial   #292 <Method void PdfRectangle(float, float)>
	//  135  331:astore          6
		j % 360;
		JVM INSTR lookupswitch 3: default 268
	//	               90: 336
	//	               180: 384
	//	               270: 442;
		   goto _L6 _L7 _L8 _L9
_L6:
		break; /* Loop/switch isn't completed */
_L9:
		break MISSING_BLOCK_LABEL_442;
_L4:
		if(!pdfannotation.isUsed())
		{
			pdfannotation.setUsed();
			try
			{
				pdfwriter.addToBody(((com.itextpdf.text.pdf.PdfObject) (pdfannotation)), pdfannotation.getIndirectReference());
			}
			// Misplaced declaration of an exception variable
			catch(PdfWriter pdfwriter)
			{
				throw new ExceptionConverter(((Exception) (pdfwriter)));
			}
		}
		  goto _L10
	//* 136  333:goto            229
_L7:
		pdfannotation.put(PdfName.RECT, ((com.itextpdf.text.pdf.PdfObject) (new PdfRectangle(rectangle.getTop() - ((PdfRectangle) (obj)).bottom(), ((PdfRectangle) (obj)).left(), rectangle.getTop() - ((PdfRectangle) (obj)).top(), ((PdfRectangle) (obj)).right()))));
	//  137  336:aload           8
	//  138  338:getstatic       #260 <Field PdfName PdfName.RECT>
	//  139  341:new             #267 <Class PdfRectangle>
	//  140  344:dup             
	//  141  345:aload_2         
	//  142  346:invokevirtual   #54  <Method float Rectangle.getTop()>
	//  143  349:aload           6
	//  144  351:invokevirtual   #295 <Method float PdfRectangle.bottom()>
	//  145  354:fsub            
	//  146  355:aload           6
	//  147  357:invokevirtual   #298 <Method float PdfRectangle.left()>
	//  148  360:aload_2         
	//  149  361:invokevirtual   #54  <Method float Rectangle.getTop()>
	//  150  364:aload           6
	//  151  366:invokevirtual   #301 <Method float PdfRectangle.top()>
	//  152  369:fsub            
	//  153  370:aload           6
	//  154  372:invokevirtual   #304 <Method float PdfRectangle.right()>
	//  155  375:invokespecial   #277 <Method void PdfRectangle(float, float, float, float)>
	//  156  378:invokevirtual   #308 <Method void PdfAnnotation.put(PdfName, com.itextpdf.text.pdf.PdfObject)>
		  goto _L4
	//* 157  381:goto            268
_L8:
		pdfannotation.put(PdfName.RECT, ((com.itextpdf.text.pdf.PdfObject) (new PdfRectangle(rectangle.getRight() - ((PdfRectangle) (obj)).left(), rectangle.getTop() - ((PdfRectangle) (obj)).bottom(), rectangle.getRight() - ((PdfRectangle) (obj)).right(), rectangle.getTop() - ((PdfRectangle) (obj)).top()))));
	//  158  384:aload           8
	//  159  386:getstatic       #260 <Field PdfName PdfName.RECT>
	//  160  389:new             #267 <Class PdfRectangle>
	//  161  392:dup             
	//  162  393:aload_2         
	//  163  394:invokevirtual   #51  <Method float Rectangle.getRight()>
	//  164  397:aload           6
	//  165  399:invokevirtual   #298 <Method float PdfRectangle.left()>
	//  166  402:fsub            
	//  167  403:aload_2         
	//  168  404:invokevirtual   #54  <Method float Rectangle.getTop()>
	//  169  407:aload           6
	//  170  409:invokevirtual   #295 <Method float PdfRectangle.bottom()>
	//  171  412:fsub            
	//  172  413:aload_2         
	//  173  414:invokevirtual   #51  <Method float Rectangle.getRight()>
	//  174  417:aload           6
	//  175  419:invokevirtual   #304 <Method float PdfRectangle.right()>
	//  176  422:fsub            
	//  177  423:aload_2         
	//  178  424:invokevirtual   #54  <Method float Rectangle.getTop()>
	//  179  427:aload           6
	//  180  429:invokevirtual   #301 <Method float PdfRectangle.top()>
	//  181  432:fsub            
	//  182  433:invokespecial   #277 <Method void PdfRectangle(float, float, float, float)>
	//  183  436:invokevirtual   #308 <Method void PdfAnnotation.put(PdfName, com.itextpdf.text.pdf.PdfObject)>
		  goto _L4
	//* 184  439:goto            268
		pdfannotation.put(PdfName.RECT, ((com.itextpdf.text.pdf.PdfObject) (new PdfRectangle(((PdfRectangle) (obj)).bottom(), rectangle.getRight() - ((PdfRectangle) (obj)).left(), ((PdfRectangle) (obj)).top(), rectangle.getRight() - ((PdfRectangle) (obj)).right()))));
	//  185  442:aload           8
	//  186  444:getstatic       #260 <Field PdfName PdfName.RECT>
	//  187  447:new             #267 <Class PdfRectangle>
	//  188  450:dup             
	//  189  451:aload           6
	//  190  453:invokevirtual   #295 <Method float PdfRectangle.bottom()>
	//  191  456:aload_2         
	//  192  457:invokevirtual   #51  <Method float Rectangle.getRight()>
	//  193  460:aload           6
	//  194  462:invokevirtual   #298 <Method float PdfRectangle.left()>
	//  195  465:fsub            
	//  196  466:aload           6
	//  197  468:invokevirtual   #301 <Method float PdfRectangle.top()>
	//  198  471:aload_2         
	//  199  472:invokevirtual   #51  <Method float Rectangle.getRight()>
	//  200  475:aload           6
	//  201  477:invokevirtual   #304 <Method float PdfRectangle.right()>
	//  202  480:fsub            
	//  203  481:invokespecial   #277 <Method void PdfRectangle(float, float, float, float)>
	//  204  484:invokevirtual   #308 <Method void PdfAnnotation.put(PdfName, com.itextpdf.text.pdf.PdfObject)>
		  goto _L4
	//* 205  487:goto            268
		return pdfarray;
	//  206  490:aload           7
	//  207  492:areturn         
		  goto _L10
	}

	public void setSigFlags(int i)
	{
		acroForm.setSigFlags(i);
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field PdfAcroForm acroForm>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #311 <Method void PdfAcroForm.setSigFlags(int)>
	//    4    8:return          
	}

	protected PdfAcroForm acroForm;
	protected ArrayList annotations;
	protected ArrayList delayedAnnotations;
}

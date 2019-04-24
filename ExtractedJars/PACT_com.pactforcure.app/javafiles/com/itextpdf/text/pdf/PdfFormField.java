// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf;

import com.itextpdf.text.Rectangle;
import java.util.*;

// Referenced classes of package com.itextpdf.text.pdf:
//			PdfAnnotation, PdfName, PdfNumber, PdfDictionary, 
//			PdfReader, PdfStamperImp, PdfArray, PdfString, 
//			PdfWriter, PdfTemplate, PdfRectangle, PdfAction, 
//			PdfSignature

public class PdfFormField extends PdfAnnotation
{

	protected PdfFormField(PdfWriter pdfwriter)
	{
		super(pdfwriter, ((Rectangle) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:invokespecial   #122 <Method void PdfAnnotation(PdfWriter, Rectangle)>
		form = true;
	//    4    6:aload_0         
	//    5    7:iconst_1        
	//    6    8:putfield        #125 <Field boolean form>
		annotation = false;
	//    7   11:aload_0         
	//    8   12:iconst_0        
	//    9   13:putfield        #128 <Field boolean annotation>
		role = PdfName.FORM;
	//   10   16:aload_0         
	//   11   17:getstatic       #131 <Field PdfName PdfName.FORM>
	//   12   20:putfield        #134 <Field PdfName role>
	//   13   23:return          
	}

	public PdfFormField(PdfWriter pdfwriter, float f, float f1, float f2, float f3, PdfAction pdfaction)
	{
		super(pdfwriter, f, f1, f2, f3, pdfaction);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:fload_2         
	//    3    3:fload_3         
	//    4    4:fload           4
	//    5    6:fload           5
	//    6    8:aload           6
	//    7   10:invokespecial   #137 <Method void PdfAnnotation(PdfWriter, float, float, float, float, PdfAction)>
		put(PdfName.TYPE, ((PdfObject) (PdfName.ANNOT)));
	//    8   13:aload_0         
	//    9   14:getstatic       #140 <Field PdfName PdfName.TYPE>
	//   10   17:getstatic       #143 <Field PdfName PdfName.ANNOT>
	//   11   20:invokevirtual   #147 <Method void put(PdfName, PdfObject)>
		put(PdfName.SUBTYPE, ((PdfObject) (PdfName.WIDGET)));
	//   12   23:aload_0         
	//   13   24:getstatic       #150 <Field PdfName PdfName.SUBTYPE>
	//   14   27:getstatic       #153 <Field PdfName PdfName.WIDGET>
	//   15   30:invokevirtual   #147 <Method void put(PdfName, PdfObject)>
		annotation = true;
	//   16   33:aload_0         
	//   17   34:iconst_1        
	//   18   35:putfield        #128 <Field boolean annotation>
	//   19   38:return          
	}

	protected static PdfFormField createButton(PdfWriter pdfwriter, int i)
	{
		pdfwriter = ((PdfWriter) (new PdfFormField(pdfwriter)));
	//    0    0:new             #2   <Class PdfFormField>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #157 <Method void PdfFormField(PdfWriter)>
	//    4    8:astore_0        
		((PdfFormField) (pdfwriter)).setButton(i);
	//    5    9:aload_0         
	//    6   10:iload_1         
	//    7   11:invokevirtual   #161 <Method void setButton(int)>
		return ((PdfFormField) (pdfwriter));
	//    8   14:aload_0         
	//    9   15:areturn         
	}

	public static PdfFormField createCheckBox(PdfWriter pdfwriter)
	{
		return createButton(pdfwriter, 0);
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:invokestatic    #165 <Method PdfFormField createButton(PdfWriter, int)>
	//    3    5:areturn         
	}

	protected static PdfFormField createChoice(PdfWriter pdfwriter, int i, PdfArray pdfarray, int j)
	{
		pdfwriter = ((PdfWriter) (new PdfFormField(pdfwriter)));
	//    0    0:new             #2   <Class PdfFormField>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #157 <Method void PdfFormField(PdfWriter)>
	//    4    8:astore_0        
		((PdfFormField) (pdfwriter)).put(PdfName.FT, ((PdfObject) (PdfName.CH)));
	//    5    9:aload_0         
	//    6   10:getstatic       #170 <Field PdfName PdfName.FT>
	//    7   13:getstatic       #173 <Field PdfName PdfName.CH>
	//    8   16:invokevirtual   #147 <Method void put(PdfName, PdfObject)>
		((PdfFormField) (pdfwriter)).put(PdfName.FF, ((PdfObject) (new PdfNumber(i))));
	//    9   19:aload_0         
	//   10   20:getstatic       #176 <Field PdfName PdfName.FF>
	//   11   23:new             #178 <Class PdfNumber>
	//   12   26:dup             
	//   13   27:iload_1         
	//   14   28:invokespecial   #180 <Method void PdfNumber(int)>
	//   15   31:invokevirtual   #147 <Method void put(PdfName, PdfObject)>
		((PdfFormField) (pdfwriter)).put(PdfName.OPT, ((PdfObject) (pdfarray)));
	//   16   34:aload_0         
	//   17   35:getstatic       #183 <Field PdfName PdfName.OPT>
	//   18   38:aload_2         
	//   19   39:invokevirtual   #147 <Method void put(PdfName, PdfObject)>
		if(j > 0)
	//*  20   42:iload_3         
	//*  21   43:ifle            61
			((PdfFormField) (pdfwriter)).put(PdfName.TI, ((PdfObject) (new PdfNumber(j))));
	//   22   46:aload_0         
	//   23   47:getstatic       #186 <Field PdfName PdfName.TI>
	//   24   50:new             #178 <Class PdfNumber>
	//   25   53:dup             
	//   26   54:iload_3         
	//   27   55:invokespecial   #180 <Method void PdfNumber(int)>
	//   28   58:invokevirtual   #147 <Method void put(PdfName, PdfObject)>
		return ((PdfFormField) (pdfwriter));
	//   29   61:aload_0         
	//   30   62:areturn         
	}

	public static PdfFormField createCombo(PdfWriter pdfwriter, boolean flag, String as[], int i)
	{
		int j;
		if(flag)
	//*   0    0:iload_1         
	//*   1    1:ifeq            23
			j = 0x40000;
	//    2    4:ldc1            #15  <Int 0x40000>
	//    3    6:istore          4
		else
	//*   4    8:aload_0         
	//*   5    9:iload           4
	//*   6   11:ldc1            #9   <Int 0x20000>
	//*   7   13:iadd            
	//*   8   14:aload_2         
	//*   9   15:invokestatic    #192 <Method PdfArray processOptions(String[])>
	//*  10   18:iload_3         
	//*  11   19:invokestatic    #194 <Method PdfFormField createChoice(PdfWriter, int, PdfArray, int)>
	//*  12   22:areturn         
			j = 0;
	//   13   23:iconst_0        
	//   14   24:istore          4
		return createChoice(pdfwriter, j + 0x20000, processOptions(as), i);
	//*  15   26:goto            8
	}

	public static PdfFormField createCombo(PdfWriter pdfwriter, boolean flag, String as[][], int i)
	{
		int j;
		if(flag)
	//*   0    0:iload_1         
	//*   1    1:ifeq            23
			j = 0x40000;
	//    2    4:ldc1            #15  <Int 0x40000>
	//    3    6:istore          4
		else
	//*   4    8:aload_0         
	//*   5    9:iload           4
	//*   6   11:ldc1            #9   <Int 0x20000>
	//*   7   13:iadd            
	//*   8   14:aload_2         
	//*   9   15:invokestatic    #198 <Method PdfArray processOptions(String[][])>
	//*  10   18:iload_3         
	//*  11   19:invokestatic    #194 <Method PdfFormField createChoice(PdfWriter, int, PdfArray, int)>
	//*  12   22:areturn         
			j = 0;
	//   13   23:iconst_0        
	//   14   24:istore          4
		return createChoice(pdfwriter, j + 0x20000, processOptions(as), i);
	//*  15   26:goto            8
	}

	public static PdfFormField createEmpty(PdfWriter pdfwriter)
	{
		return new PdfFormField(pdfwriter);
	//    0    0:new             #2   <Class PdfFormField>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #157 <Method void PdfFormField(PdfWriter)>
	//    4    8:areturn         
	}

	public static PdfFormField createList(PdfWriter pdfwriter, String as[], int i)
	{
		return createChoice(pdfwriter, 0, processOptions(as), i);
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:aload_1         
	//    3    3:invokestatic    #192 <Method PdfArray processOptions(String[])>
	//    4    6:iload_2         
	//    5    7:invokestatic    #194 <Method PdfFormField createChoice(PdfWriter, int, PdfArray, int)>
	//    6   10:areturn         
	}

	public static PdfFormField createList(PdfWriter pdfwriter, String as[][], int i)
	{
		return createChoice(pdfwriter, 0, processOptions(as), i);
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:aload_1         
	//    3    3:invokestatic    #198 <Method PdfArray processOptions(String[][])>
	//    4    6:iload_2         
	//    5    7:invokestatic    #194 <Method PdfFormField createChoice(PdfWriter, int, PdfArray, int)>
	//    6   10:areturn         
	}

	public static PdfFormField createPushButton(PdfWriter pdfwriter)
	{
		return createButton(pdfwriter, 0x10000);
	//    0    0:aload_0         
	//    1    1:ldc1            #29  <Int 0x10000>
	//    2    3:invokestatic    #165 <Method PdfFormField createButton(PdfWriter, int)>
	//    3    6:areturn         
	}

	public static PdfFormField createRadioButton(PdfWriter pdfwriter, boolean flag)
	{
		char c;
		if(flag)
	//*   0    0:iload_1         
	//*   1    1:ifeq            17
			c = '\u4000';
	//    2    4:sipush          16384
	//    3    7:istore_2        
		else
	//*   4    8:aload_0         
	//*   5    9:iload_2         
	//*   6   10:ldc1            #31  <Int 32768>
	//*   7   12:iadd            
	//*   8   13:invokestatic    #165 <Method PdfFormField createButton(PdfWriter, int)>
	//*   9   16:areturn         
			c = '\0';
	//   10   17:iconst_0        
	//   11   18:istore_2        
		return createButton(pdfwriter, c + 32768);
	//*  12   19:goto            8
	}

	public static PdfFormField createSignature(PdfWriter pdfwriter)
	{
		pdfwriter = ((PdfWriter) (new PdfFormField(pdfwriter)));
	//    0    0:new             #2   <Class PdfFormField>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #157 <Method void PdfFormField(PdfWriter)>
	//    4    8:astore_0        
		((PdfFormField) (pdfwriter)).put(PdfName.FT, ((PdfObject) (PdfName.SIG)));
	//    5    9:aload_0         
	//    6   10:getstatic       #170 <Field PdfName PdfName.FT>
	//    7   13:getstatic       #209 <Field PdfName PdfName.SIG>
	//    8   16:invokevirtual   #147 <Method void put(PdfName, PdfObject)>
		return ((PdfFormField) (pdfwriter));
	//    9   19:aload_0         
	//   10   20:areturn         
	}

	public static PdfFormField createTextField(PdfWriter pdfwriter, boolean flag, boolean flag1, int i)
	{
		char c1 = '\0';
	//    0    0:iconst_0        
	//    1    1:istore          5
		pdfwriter = ((PdfWriter) (new PdfFormField(pdfwriter)));
	//    2    3:new             #2   <Class PdfFormField>
	//    3    6:dup             
	//    4    7:aload_0         
	//    5    8:invokespecial   #157 <Method void PdfFormField(PdfWriter)>
	//    6   11:astore_0        
		((PdfFormField) (pdfwriter)).put(PdfName.FT, ((PdfObject) (PdfName.TX)));
	//    7   12:aload_0         
	//    8   13:getstatic       #170 <Field PdfName PdfName.FT>
	//    9   16:getstatic       #214 <Field PdfName PdfName.TX>
	//   10   19:invokevirtual   #147 <Method void put(PdfName, PdfObject)>
		char c;
		if(flag)
	//*  11   22:iload_1         
	//*  12   23:ifeq            80
			c = '\u1000';
	//   13   26:sipush          4096
	//   14   29:istore          4
		else
	//*  15   31:iload_2         
	//*  16   32:ifeq            40
	//*  17   35:sipush          8192
	//*  18   38:istore          5
	//*  19   40:aload_0         
	//*  20   41:getstatic       #176 <Field PdfName PdfName.FF>
	//*  21   44:new             #178 <Class PdfNumber>
	//*  22   47:dup             
	//*  23   48:iload           4
	//*  24   50:iload           5
	//*  25   52:iadd            
	//*  26   53:invokespecial   #180 <Method void PdfNumber(int)>
	//*  27   56:invokevirtual   #147 <Method void put(PdfName, PdfObject)>
	//*  28   59:iload_3         
	//*  29   60:ifle            78
	//*  30   63:aload_0         
	//*  31   64:getstatic       #217 <Field PdfName PdfName.MAXLEN>
	//*  32   67:new             #178 <Class PdfNumber>
	//*  33   70:dup             
	//*  34   71:iload_3         
	//*  35   72:invokespecial   #180 <Method void PdfNumber(int)>
	//*  36   75:invokevirtual   #147 <Method void put(PdfName, PdfObject)>
	//*  37   78:aload_0         
	//*  38   79:areturn         
			c = '\0';
	//   39   80:iconst_0        
	//   40   81:istore          4
		if(flag1)
			c1 = '\u2000';
		((PdfFormField) (pdfwriter)).put(PdfName.FF, ((PdfObject) (new PdfNumber(c + c1))));
		if(i > 0)
			((PdfFormField) (pdfwriter)).put(PdfName.MAXLEN, ((PdfObject) (new PdfNumber(i))));
		return ((PdfFormField) (pdfwriter));
	//*  41   83:goto            31
	}

	static void mergeResources(PdfDictionary pdfdictionary, PdfDictionary pdfdictionary1)
	{
		mergeResources(pdfdictionary, pdfdictionary1, ((PdfStamperImp) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:invokestatic    #222 <Method void mergeResources(PdfDictionary, PdfDictionary, PdfStamperImp)>
	//    4    6:return          
	}

	static void mergeResources(PdfDictionary pdfdictionary, PdfDictionary pdfdictionary1, PdfStamperImp pdfstamperimp)
	{
		for(int i = 0; i < mergeTarget.length; i++)
	//*   0    0:iconst_0        
	//*   1    1:istore_3        
	//*   2    2:iload_3         
	//*   3    3:getstatic       #116 <Field PdfName[] mergeTarget>
	//*   4    6:arraylength     
	//*   5    7:icmpge          95
		{
			PdfName pdfname = mergeTarget[i];
	//    6   10:getstatic       #116 <Field PdfName[] mergeTarget>
	//    7   13:iload_3         
	//    8   14:aaload          
	//    9   15:astore          6
			PdfDictionary pdfdictionary4 = pdfdictionary1.getAsDict(pdfname);
	//   10   17:aload_1         
	//   11   18:aload           6
	//   12   20:invokevirtual   #228 <Method PdfDictionary PdfDictionary.getAsDict(PdfName)>
	//   13   23:astore          7
			if(pdfdictionary4 == null)
				continue;
	//   14   25:aload           7
	//   15   27:ifnull          88
			PdfDictionary pdfdictionary3 = (PdfDictionary)PdfReader.getPdfObject(pdfdictionary.get(pdfname), ((PdfObject) (pdfdictionary)));
	//   16   30:aload_0         
	//   17   31:aload           6
	//   18   33:invokevirtual   #232 <Method PdfObject PdfDictionary.get(PdfName)>
	//   19   36:aload_0         
	//   20   37:invokestatic    #238 <Method PdfObject PdfReader.getPdfObject(PdfObject, PdfObject)>
	//   21   40:checkcast       #224 <Class PdfDictionary>
	//   22   43:astore          5
			PdfDictionary pdfdictionary2 = pdfdictionary3;
	//   23   45:aload           5
	//   24   47:astore          4
			if(pdfdictionary3 == null)
	//*  25   49:aload           5
	//*  26   51:ifnonnull       63
				pdfdictionary2 = new PdfDictionary();
	//   27   54:new             #224 <Class PdfDictionary>
	//   28   57:dup             
	//   29   58:invokespecial   #240 <Method void PdfDictionary()>
	//   30   61:astore          4
			pdfdictionary2.mergeDifferent(pdfdictionary4);
	//   31   63:aload           4
	//   32   65:aload           7
	//   33   67:invokevirtual   #244 <Method void PdfDictionary.mergeDifferent(PdfDictionary)>
			pdfdictionary.put(pdfname, ((PdfObject) (pdfdictionary2)));
	//   34   70:aload_0         
	//   35   71:aload           6
	//   36   73:aload           4
	//   37   75:invokevirtual   #245 <Method void PdfDictionary.put(PdfName, PdfObject)>
			if(pdfstamperimp != null)
	//*  38   78:aload_2         
	//*  39   79:ifnull          88
				pdfstamperimp.markUsed(((PdfObject) (pdfdictionary2)));
	//   40   82:aload_2         
	//   41   83:aload           4
	//   42   85:invokevirtual   #251 <Method void PdfStamperImp.markUsed(PdfObject)>
		}

	//   43   88:iload_3         
	//   44   89:iconst_1        
	//   45   90:iadd            
	//   46   91:istore_3        
	//*  47   92:goto            2
	//   48   95:return          
	}

	protected static PdfArray processOptions(String as[])
	{
		PdfArray pdfarray = new PdfArray();
	//    0    0:new             #253 <Class PdfArray>
	//    1    3:dup             
	//    2    4:invokespecial   #254 <Method void PdfArray()>
	//    3    7:astore_2        
		for(int i = 0; i < as.length; i++)
	//*   4    8:iconst_0        
	//*   5    9:istore_1        
	//*   6   10:iload_1         
	//*   7   11:aload_0         
	//*   8   12:arraylength     
	//*   9   13:icmpge          41
			pdfarray.add(((PdfObject) (new PdfString(as[i], "UnicodeBig"))));
	//   10   16:aload_2         
	//   11   17:new             #256 <Class PdfString>
	//   12   20:dup             
	//   13   21:aload_0         
	//   14   22:iload_1         
	//   15   23:aaload          
	//   16   24:ldc2            #258 <String "UnicodeBig">
	//   17   27:invokespecial   #261 <Method void PdfString(String, String)>
	//   18   30:invokevirtual   #265 <Method boolean PdfArray.add(PdfObject)>
	//   19   33:pop             

	//   20   34:iload_1         
	//   21   35:iconst_1        
	//   22   36:iadd            
	//   23   37:istore_1        
	//*  24   38:goto            10
		return pdfarray;
	//   25   41:aload_2         
	//   26   42:areturn         
	}

	protected static PdfArray processOptions(String as[][])
	{
		PdfArray pdfarray = new PdfArray();
	//    0    0:new             #253 <Class PdfArray>
	//    1    3:dup             
	//    2    4:invokespecial   #254 <Method void PdfArray()>
	//    3    7:astore_2        
		for(int i = 0; i < as.length; i++)
	//*   4    8:iconst_0        
	//*   5    9:istore_1        
	//*   6   10:iload_1         
	//*   7   11:aload_0         
	//*   8   12:arraylength     
	//*   9   13:icmpge          75
		{
			String as1[] = as[i];
	//   10   16:aload_0         
	//   11   17:iload_1         
	//   12   18:aaload          
	//   13   19:astore_3        
			PdfArray pdfarray1 = new PdfArray(((PdfObject) (new PdfString(as1[0], "UnicodeBig"))));
	//   14   20:new             #253 <Class PdfArray>
	//   15   23:dup             
	//   16   24:new             #256 <Class PdfString>
	//   17   27:dup             
	//   18   28:aload_3         
	//   19   29:iconst_0        
	//   20   30:aaload          
	//   21   31:ldc2            #258 <String "UnicodeBig">
	//   22   34:invokespecial   #261 <Method void PdfString(String, String)>
	//   23   37:invokespecial   #267 <Method void PdfArray(PdfObject)>
	//   24   40:astore          4
			pdfarray1.add(((PdfObject) (new PdfString(as1[1], "UnicodeBig"))));
	//   25   42:aload           4
	//   26   44:new             #256 <Class PdfString>
	//   27   47:dup             
	//   28   48:aload_3         
	//   29   49:iconst_1        
	//   30   50:aaload          
	//   31   51:ldc2            #258 <String "UnicodeBig">
	//   32   54:invokespecial   #261 <Method void PdfString(String, String)>
	//   33   57:invokevirtual   #265 <Method boolean PdfArray.add(PdfObject)>
	//   34   60:pop             
			pdfarray.add(((PdfObject) (pdfarray1)));
	//   35   61:aload_2         
	//   36   62:aload           4
	//   37   64:invokevirtual   #265 <Method boolean PdfArray.add(PdfObject)>
	//   38   67:pop             
		}

	//   39   68:iload_1         
	//   40   69:iconst_1        
	//   41   70:iadd            
	//   42   71:istore_1        
	//*  43   72:goto            10
		return pdfarray;
	//   44   75:aload_2         
	//   45   76:areturn         
	}

	public static PdfAnnotation shallowDuplicate(PdfAnnotation pdfannotation)
	{
		Object obj;
		if(pdfannotation.isForm())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #273 <Method boolean PdfAnnotation.isForm()>
	//*   2    4:ifeq            76
		{
			obj = ((Object) (new PdfFormField(pdfannotation.writer)));
	//    3    7:new             #2   <Class PdfFormField>
	//    4   10:dup             
	//    5   11:aload_0         
	//    6   12:getfield        #277 <Field PdfWriter PdfAnnotation.writer>
	//    7   15:invokespecial   #157 <Method void PdfFormField(PdfWriter)>
	//    8   18:astore_1        
			PdfFormField pdfformfield = (PdfFormField)obj;
	//    9   19:aload_1         
	//   10   20:checkcast       #2   <Class PdfFormField>
	//   11   23:astore_2        
			PdfFormField pdfformfield1 = (PdfFormField)pdfannotation;
	//   12   24:aload_0         
	//   13   25:checkcast       #2   <Class PdfFormField>
	//   14   28:astore_3        
			pdfformfield.parent = pdfformfield1.parent;
	//   15   29:aload_2         
	//   16   30:aload_3         
	//   17   31:getfield        #279 <Field PdfFormField parent>
	//   18   34:putfield        #279 <Field PdfFormField parent>
			pdfformfield.kids = pdfformfield1.kids;
	//   19   37:aload_2         
	//   20   38:aload_3         
	//   21   39:getfield        #281 <Field ArrayList kids>
	//   22   42:putfield        #281 <Field ArrayList kids>
		} else
	//*  23   45:aload_1         
	//*  24   46:aload_0         
	//*  25   47:invokevirtual   #284 <Method void PdfAnnotation.merge(PdfDictionary)>
	//*  26   50:aload_1         
	//*  27   51:aload_0         
	//*  28   52:getfield        #285 <Field boolean PdfAnnotation.form>
	//*  29   55:putfield        #285 <Field boolean PdfAnnotation.form>
	//*  30   58:aload_1         
	//*  31   59:aload_0         
	//*  32   60:getfield        #286 <Field boolean PdfAnnotation.annotation>
	//*  33   63:putfield        #286 <Field boolean PdfAnnotation.annotation>
	//*  34   66:aload_1         
	//*  35   67:aload_0         
	//*  36   68:getfield        #290 <Field HashSet PdfAnnotation.templates>
	//*  37   71:putfield        #290 <Field HashSet PdfAnnotation.templates>
	//*  38   74:aload_1         
	//*  39   75:areturn         
		{
			obj = ((Object) (pdfannotation.writer.createAnnotation(((Rectangle) (null)), (PdfName)pdfannotation.get(PdfName.SUBTYPE))));
	//   40   76:aload_0         
	//   41   77:getfield        #277 <Field PdfWriter PdfAnnotation.writer>
	//   42   80:aconst_null     
	//   43   81:aload_0         
	//   44   82:getstatic       #150 <Field PdfName PdfName.SUBTYPE>
	//   45   85:invokevirtual   #291 <Method PdfObject PdfAnnotation.get(PdfName)>
	//   46   88:checkcast       #75  <Class PdfName>
	//   47   91:invokevirtual   #297 <Method PdfAnnotation PdfWriter.createAnnotation(Rectangle, PdfName)>
	//   48   94:astore_1        
		}
		((PdfAnnotation) (obj)).merge(((PdfDictionary) (pdfannotation)));
		obj.form = pdfannotation.form;
		obj.annotation = pdfannotation.annotation;
		obj.templates = pdfannotation.templates;
		return ((PdfAnnotation) (obj));
	//*  49   95:goto            45
	}

	public void addKid(PdfFormField pdfformfield)
	{
		pdfformfield.parent = this;
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:putfield        #279 <Field PdfFormField parent>
		if(kids == null)
	//*   3    5:aload_0         
	//*   4    6:getfield        #281 <Field ArrayList kids>
	//*   5    9:ifnonnull       23
			kids = new ArrayList();
	//    6   12:aload_0         
	//    7   13:new             #301 <Class ArrayList>
	//    8   16:dup             
	//    9   17:invokespecial   #302 <Method void ArrayList()>
	//   10   20:putfield        #281 <Field ArrayList kids>
		kids.add(((Object) (pdfformfield)));
	//   11   23:aload_0         
	//   12   24:getfield        #281 <Field ArrayList kids>
	//   13   27:aload_1         
	//   14   28:invokevirtual   #305 <Method boolean ArrayList.add(Object)>
	//   15   31:pop             
	//   16   32:return          
	}

	public ArrayList getKids()
	{
		return kids;
	//    0    0:aload_0         
	//    1    1:getfield        #281 <Field ArrayList kids>
	//    2    4:areturn         
	}

	public PdfFormField getParent()
	{
		return parent;
	//    0    0:aload_0         
	//    1    1:getfield        #279 <Field PdfFormField parent>
	//    2    4:areturn         
	}

	public void setButton(int i)
	{
		put(PdfName.FT, ((PdfObject) (PdfName.BTN)));
	//    0    0:aload_0         
	//    1    1:getstatic       #170 <Field PdfName PdfName.FT>
	//    2    4:getstatic       #314 <Field PdfName PdfName.BTN>
	//    3    7:invokevirtual   #147 <Method void put(PdfName, PdfObject)>
		if(i != 0)
	//*   4   10:iload_1         
	//*   5   11:ifeq            29
			put(PdfName.FF, ((PdfObject) (new PdfNumber(i))));
	//    6   14:aload_0         
	//    7   15:getstatic       #176 <Field PdfName PdfName.FF>
	//    8   18:new             #178 <Class PdfNumber>
	//    9   21:dup             
	//   10   22:iload_1         
	//   11   23:invokespecial   #180 <Method void PdfNumber(int)>
	//   12   26:invokevirtual   #147 <Method void put(PdfName, PdfObject)>
	//   13   29:return          
	}

	public void setDefaultValueAsName(String s)
	{
		put(PdfName.DV, ((PdfObject) (new PdfName(s))));
	//    0    0:aload_0         
	//    1    1:getstatic       #319 <Field PdfName PdfName.DV>
	//    2    4:new             #75  <Class PdfName>
	//    3    7:dup             
	//    4    8:aload_1         
	//    5    9:invokespecial   #321 <Method void PdfName(String)>
	//    6   12:invokevirtual   #147 <Method void put(PdfName, PdfObject)>
	//    7   15:return          
	}

	public void setDefaultValueAsString(String s)
	{
		put(PdfName.DV, ((PdfObject) (new PdfString(s, "UnicodeBig"))));
	//    0    0:aload_0         
	//    1    1:getstatic       #319 <Field PdfName PdfName.DV>
	//    2    4:new             #256 <Class PdfString>
	//    3    7:dup             
	//    4    8:aload_1         
	//    5    9:ldc2            #258 <String "UnicodeBig">
	//    6   12:invokespecial   #261 <Method void PdfString(String, String)>
	//    7   15:invokevirtual   #147 <Method void put(PdfName, PdfObject)>
	//    8   18:return          
	}

	public int setFieldFlags(int i)
	{
		PdfNumber pdfnumber = (PdfNumber)get(PdfName.FF);
	//    0    0:aload_0         
	//    1    1:getstatic       #176 <Field PdfName PdfName.FF>
	//    2    4:invokevirtual   #325 <Method PdfObject get(PdfName)>
	//    3    7:checkcast       #178 <Class PdfNumber>
	//    4   10:astore_3        
		int j;
		if(pdfnumber == null)
	//*   5   11:aload_3         
	//*   6   12:ifnonnull       36
			j = 0;
	//    7   15:iconst_0        
	//    8   16:istore_2        
		else
	//*   9   17:aload_0         
	//*  10   18:getstatic       #176 <Field PdfName PdfName.FF>
	//*  11   21:new             #178 <Class PdfNumber>
	//*  12   24:dup             
	//*  13   25:iload_2         
	//*  14   26:iload_1         
	//*  15   27:ior             
	//*  16   28:invokespecial   #180 <Method void PdfNumber(int)>
	//*  17   31:invokevirtual   #147 <Method void put(PdfName, PdfObject)>
	//*  18   34:iload_2         
	//*  19   35:ireturn         
			j = pdfnumber.intValue();
	//   20   36:aload_3         
	//   21   37:invokevirtual   #329 <Method int PdfNumber.intValue()>
	//   22   40:istore_2        
		put(PdfName.FF, ((PdfObject) (new PdfNumber(j | i))));
		return j;
	//*  23   41:goto            17
	}

	public void setFieldName(String s)
	{
		if(s != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          22
			put(PdfName.T, ((PdfObject) (new PdfString(s, "UnicodeBig"))));
	//    2    4:aload_0         
	//    3    5:getstatic       #333 <Field PdfName PdfName.T>
	//    4    8:new             #256 <Class PdfString>
	//    5   11:dup             
	//    6   12:aload_1         
	//    7   13:ldc2            #258 <String "UnicodeBig">
	//    8   16:invokespecial   #261 <Method void PdfString(String, String)>
	//    9   19:invokevirtual   #147 <Method void put(PdfName, PdfObject)>
	//   10   22:return          
	}

	public void setMappingName(String s)
	{
		put(PdfName.TM, ((PdfObject) (new PdfString(s, "UnicodeBig"))));
	//    0    0:aload_0         
	//    1    1:getstatic       #337 <Field PdfName PdfName.TM>
	//    2    4:new             #256 <Class PdfString>
	//    3    7:dup             
	//    4    8:aload_1         
	//    5    9:ldc2            #258 <String "UnicodeBig">
	//    6   12:invokespecial   #261 <Method void PdfString(String, String)>
	//    7   15:invokevirtual   #147 <Method void put(PdfName, PdfObject)>
	//    8   18:return          
	}

	public void setQuadding(int i)
	{
		put(PdfName.Q, ((PdfObject) (new PdfNumber(i))));
	//    0    0:aload_0         
	//    1    1:getstatic       #341 <Field PdfName PdfName.Q>
	//    2    4:new             #178 <Class PdfNumber>
	//    3    7:dup             
	//    4    8:iload_1         
	//    5    9:invokespecial   #180 <Method void PdfNumber(int)>
	//    6   12:invokevirtual   #147 <Method void put(PdfName, PdfObject)>
	//    7   15:return          
	}

	public void setRichValue(String s)
	{
		put(PdfName.RV, ((PdfObject) (new PdfString(s))));
	//    0    0:aload_0         
	//    1    1:getstatic       #345 <Field PdfName PdfName.RV>
	//    2    4:new             #256 <Class PdfString>
	//    3    7:dup             
	//    4    8:aload_1         
	//    5    9:invokespecial   #346 <Method void PdfString(String)>
	//    6   12:invokevirtual   #147 <Method void put(PdfName, PdfObject)>
	//    7   15:return          
	}

	public void setUsed()
	{
		used = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #350 <Field boolean used>
		if(parent != null)
	//*   3    5:aload_0         
	//*   4    6:getfield        #279 <Field PdfFormField parent>
	//*   5    9:ifnull          26
			put(PdfName.PARENT, ((PdfObject) (parent.getIndirectReference())));
	//    6   12:aload_0         
	//    7   13:getstatic       #353 <Field PdfName PdfName.PARENT>
	//    8   16:aload_0         
	//    9   17:getfield        #279 <Field PdfFormField parent>
	//   10   20:invokevirtual   #357 <Method PdfIndirectReference getIndirectReference()>
	//   11   23:invokevirtual   #147 <Method void put(PdfName, PdfObject)>
		if(kids != null)
	//*  12   26:aload_0         
	//*  13   27:getfield        #281 <Field ArrayList kids>
	//*  14   30:ifnull          88
		{
			PdfArray pdfarray = new PdfArray();
	//   15   33:new             #253 <Class PdfArray>
	//   16   36:dup             
	//   17   37:invokespecial   #254 <Method void PdfArray()>
	//   18   40:astore_2        
			for(int i = 0; i < kids.size(); i++)
	//*  19   41:iconst_0        
	//*  20   42:istore_1        
	//*  21   43:iload_1         
	//*  22   44:aload_0         
	//*  23   45:getfield        #281 <Field ArrayList kids>
	//*  24   48:invokevirtual   #360 <Method int ArrayList.size()>
	//*  25   51:icmpge          80
				pdfarray.add(((PdfObject) (((PdfFormField)kids.get(i)).getIndirectReference())));
	//   26   54:aload_2         
	//   27   55:aload_0         
	//   28   56:getfield        #281 <Field ArrayList kids>
	//   29   59:iload_1         
	//   30   60:invokevirtual   #363 <Method Object ArrayList.get(int)>
	//   31   63:checkcast       #2   <Class PdfFormField>
	//   32   66:invokevirtual   #357 <Method PdfIndirectReference getIndirectReference()>
	//   33   69:invokevirtual   #265 <Method boolean PdfArray.add(PdfObject)>
	//   34   72:pop             

	//   35   73:iload_1         
	//   36   74:iconst_1        
	//   37   75:iadd            
	//   38   76:istore_1        
	//*  39   77:goto            43
			put(PdfName.KIDS, ((PdfObject) (pdfarray)));
	//   40   80:aload_0         
	//   41   81:getstatic       #366 <Field PdfName PdfName.KIDS>
	//   42   84:aload_2         
	//   43   85:invokevirtual   #147 <Method void put(PdfName, PdfObject)>
		}
		if(templates == null)
	//*  44   88:aload_0         
	//*  45   89:getfield        #367 <Field HashSet templates>
	//*  46   92:ifnonnull       96
			return;
	//   47   95:return          
		PdfDictionary pdfdictionary = new PdfDictionary();
	//   48   96:new             #224 <Class PdfDictionary>
	//   49   99:dup             
	//   50  100:invokespecial   #240 <Method void PdfDictionary()>
	//   51  103:astore_2        
		for(Iterator iterator = templates.iterator(); iterator.hasNext(); mergeResources(pdfdictionary, (PdfDictionary)((PdfTemplate)iterator.next()).getResources()));
	//   52  104:aload_0         
	//   53  105:getfield        #367 <Field HashSet templates>
	//   54  108:invokevirtual   #373 <Method Iterator HashSet.iterator()>
	//   55  111:astore_3        
	//   56  112:aload_3         
	//   57  113:invokeinterface #378 <Method boolean Iterator.hasNext()>
	//   58  118:ifeq            143
	//   59  121:aload_2         
	//   60  122:aload_3         
	//   61  123:invokeinterface #382 <Method Object Iterator.next()>
	//   62  128:checkcast       #384 <Class PdfTemplate>
	//   63  131:invokevirtual   #388 <Method PdfObject PdfTemplate.getResources()>
	//   64  134:checkcast       #224 <Class PdfDictionary>
	//   65  137:invokestatic    #390 <Method void mergeResources(PdfDictionary, PdfDictionary)>
	//*  66  140:goto            112
		put(PdfName.DR, ((PdfObject) (pdfdictionary)));
	//   67  143:aload_0         
	//   68  144:getstatic       #393 <Field PdfName PdfName.DR>
	//   69  147:aload_2         
	//   70  148:invokevirtual   #147 <Method void put(PdfName, PdfObject)>
	//   71  151:return          
	}

	public void setUserName(String s)
	{
		put(PdfName.TU, ((PdfObject) (new PdfString(s, "UnicodeBig"))));
	//    0    0:aload_0         
	//    1    1:getstatic       #397 <Field PdfName PdfName.TU>
	//    2    4:new             #256 <Class PdfString>
	//    3    7:dup             
	//    4    8:aload_1         
	//    5    9:ldc2            #258 <String "UnicodeBig">
	//    6   12:invokespecial   #261 <Method void PdfString(String, String)>
	//    7   15:invokevirtual   #147 <Method void put(PdfName, PdfObject)>
	//    8   18:return          
	}

	public void setValue(PdfSignature pdfsignature)
	{
		put(PdfName.V, ((PdfObject) (pdfsignature)));
	//    0    0:aload_0         
	//    1    1:getstatic       #402 <Field PdfName PdfName.V>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #147 <Method void put(PdfName, PdfObject)>
	//    4    8:return          
	}

	public void setValueAsName(String s)
	{
		put(PdfName.V, ((PdfObject) (new PdfName(s))));
	//    0    0:aload_0         
	//    1    1:getstatic       #402 <Field PdfName PdfName.V>
	//    2    4:new             #75  <Class PdfName>
	//    3    7:dup             
	//    4    8:aload_1         
	//    5    9:invokespecial   #321 <Method void PdfName(String)>
	//    6   12:invokevirtual   #147 <Method void put(PdfName, PdfObject)>
	//    7   15:return          
	}

	public void setValueAsString(String s)
	{
		put(PdfName.V, ((PdfObject) (new PdfString(s, "UnicodeBig"))));
	//    0    0:aload_0         
	//    1    1:getstatic       #402 <Field PdfName PdfName.V>
	//    2    4:new             #256 <Class PdfString>
	//    3    7:dup             
	//    4    8:aload_1         
	//    5    9:ldc2            #258 <String "UnicodeBig">
	//    6   12:invokespecial   #261 <Method void PdfString(String, String)>
	//    7   15:invokevirtual   #147 <Method void put(PdfName, PdfObject)>
	//    8   18:return          
	}

	public void setWidget(Rectangle rectangle, PdfName pdfname)
	{
		put(PdfName.TYPE, ((PdfObject) (PdfName.ANNOT)));
	//    0    0:aload_0         
	//    1    1:getstatic       #140 <Field PdfName PdfName.TYPE>
	//    2    4:getstatic       #143 <Field PdfName PdfName.ANNOT>
	//    3    7:invokevirtual   #147 <Method void put(PdfName, PdfObject)>
		put(PdfName.SUBTYPE, ((PdfObject) (PdfName.WIDGET)));
	//    4   10:aload_0         
	//    5   11:getstatic       #150 <Field PdfName PdfName.SUBTYPE>
	//    6   14:getstatic       #153 <Field PdfName PdfName.WIDGET>
	//    7   17:invokevirtual   #147 <Method void put(PdfName, PdfObject)>
		put(PdfName.RECT, ((PdfObject) (new PdfRectangle(rectangle))));
	//    8   20:aload_0         
	//    9   21:getstatic       #409 <Field PdfName PdfName.RECT>
	//   10   24:new             #411 <Class PdfRectangle>
	//   11   27:dup             
	//   12   28:aload_1         
	//   13   29:invokespecial   #414 <Method void PdfRectangle(Rectangle)>
	//   14   32:invokevirtual   #147 <Method void put(PdfName, PdfObject)>
		annotation = true;
	//   15   35:aload_0         
	//   16   36:iconst_1        
	//   17   37:putfield        #128 <Field boolean annotation>
		if(pdfname != null && !pdfname.equals(((Object) (HIGHLIGHT_INVERT))))
	//*  18   40:aload_2         
	//*  19   41:ifnull          62
	//*  20   44:aload_2         
	//*  21   45:getstatic       #417 <Field PdfName HIGHLIGHT_INVERT>
	//*  22   48:invokevirtual   #420 <Method boolean PdfName.equals(Object)>
	//*  23   51:ifne            62
			put(PdfName.H, ((PdfObject) (pdfname)));
	//   24   54:aload_0         
	//   25   55:getstatic       #423 <Field PdfName PdfName.H>
	//   26   58:aload_2         
	//   27   59:invokevirtual   #147 <Method void put(PdfName, PdfObject)>
	//   28   62:return          
	}

	public static final int FF_COMB = 0x1000000;
	public static final int FF_COMBO = 0x20000;
	public static final int FF_DONOTSCROLL = 0x800000;
	public static final int FF_DONOTSPELLCHECK = 0x400000;
	public static final int FF_EDIT = 0x40000;
	public static final int FF_FILESELECT = 0x100000;
	public static final int FF_MULTILINE = 4096;
	public static final int FF_MULTISELECT = 0x200000;
	public static final int FF_NO_EXPORT = 4;
	public static final int FF_NO_TOGGLE_TO_OFF = 16384;
	public static final int FF_PASSWORD = 8192;
	public static final int FF_PUSHBUTTON = 0x10000;
	public static final int FF_RADIO = 32768;
	public static final int FF_RADIOSINUNISON = 0x2000000;
	public static final int FF_READ_ONLY = 1;
	public static final int FF_REQUIRED = 2;
	public static final int FF_RICHTEXT = 0x2000000;
	public static final PdfName IF_SCALE_ALWAYS;
	public static final PdfName IF_SCALE_ANAMORPHIC;
	public static final PdfName IF_SCALE_BIGGER;
	public static final PdfName IF_SCALE_NEVER;
	public static final PdfName IF_SCALE_PROPORTIONAL;
	public static final PdfName IF_SCALE_SMALLER;
	public static final int MK_CAPTION_ABOVE = 3;
	public static final int MK_CAPTION_BELOW = 2;
	public static final int MK_CAPTION_LEFT = 5;
	public static final int MK_CAPTION_OVERLAID = 6;
	public static final int MK_CAPTION_RIGHT = 4;
	public static final int MK_NO_CAPTION = 1;
	public static final int MK_NO_ICON = 0;
	public static final boolean MULTILINE = true;
	public static final boolean PASSWORD = true;
	public static final boolean PLAINTEXT = false;
	public static final int Q_CENTER = 1;
	public static final int Q_LEFT = 0;
	public static final int Q_RIGHT = 2;
	public static final boolean SINGLELINE = false;
	static PdfName mergeTarget[];
	protected ArrayList kids;
	protected PdfFormField parent;

	static 
	{
		IF_SCALE_ALWAYS = PdfName.A;
	//    0    0:getstatic       #78  <Field PdfName PdfName.A>
	//    1    3:putstatic       #80  <Field PdfName IF_SCALE_ALWAYS>
		IF_SCALE_BIGGER = PdfName.B;
	//    2    6:getstatic       #83  <Field PdfName PdfName.B>
	//    3    9:putstatic       #85  <Field PdfName IF_SCALE_BIGGER>
		IF_SCALE_SMALLER = PdfName.S;
	//    4   12:getstatic       #88  <Field PdfName PdfName.S>
	//    5   15:putstatic       #90  <Field PdfName IF_SCALE_SMALLER>
		IF_SCALE_NEVER = PdfName.N;
	//    6   18:getstatic       #93  <Field PdfName PdfName.N>
	//    7   21:putstatic       #95  <Field PdfName IF_SCALE_NEVER>
		IF_SCALE_ANAMORPHIC = PdfName.A;
	//    8   24:getstatic       #78  <Field PdfName PdfName.A>
	//    9   27:putstatic       #97  <Field PdfName IF_SCALE_ANAMORPHIC>
		IF_SCALE_PROPORTIONAL = PdfName.P;
	//   10   30:getstatic       #100 <Field PdfName PdfName.P>
	//   11   33:putstatic       #102 <Field PdfName IF_SCALE_PROPORTIONAL>
		mergeTarget = (new PdfName[] {
			PdfName.FONT, PdfName.XOBJECT, PdfName.COLORSPACE, PdfName.PATTERN
		});
	//   12   36:iconst_4        
	//   13   37:anewarray       PdfName[]
	//   14   40:dup             
	//   15   41:iconst_0        
	//   16   42:getstatic       #105 <Field PdfName PdfName.FONT>
	//   17   45:aastore         
	//   18   46:dup             
	//   19   47:iconst_1        
	//   20   48:getstatic       #108 <Field PdfName PdfName.XOBJECT>
	//   21   51:aastore         
	//   22   52:dup             
	//   23   53:iconst_2        
	//   24   54:getstatic       #111 <Field PdfName PdfName.COLORSPACE>
	//   25   57:aastore         
	//   26   58:dup             
	//   27   59:iconst_3        
	//   28   60:getstatic       #114 <Field PdfName PdfName.PATTERN>
	//   29   63:aastore         
	//   30   64:putstatic       #116 <Field PdfName[] mergeTarget>
	//*  31   67:return          
	}
}

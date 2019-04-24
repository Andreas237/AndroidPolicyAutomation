// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf;

import com.itextpdf.text.*;
import java.io.IOException;
import java.io.OutputStream;
import java.util.*;

// Referenced classes of package com.itextpdf.text.pdf:
//			PdfDictionary, PdfArray, PdfFormField, PdfWriter, 
//			PdfAction, PdfAppearance, PdfAnnotation, PdfName, 
//			BaseFont, PdfNumber, PdfTemplate, PdfString, 
//			PdfBorderDictionary, PdfBoolean, PdfIndirectReference, PdfContentByte

public class PdfAcroForm extends PdfDictionary
{

	public PdfAcroForm(PdfWriter pdfwriter)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void PdfDictionary()>
		fieldTemplates = new HashSet();
	//    2    4:aload_0         
	//    3    5:new             #21  <Class HashSet>
	//    4    8:dup             
	//    5    9:invokespecial   #22  <Method void HashSet()>
	//    6   12:putfield        #24  <Field HashSet fieldTemplates>
		documentFields = new PdfArray();
	//    7   15:aload_0         
	//    8   16:new             #26  <Class PdfArray>
	//    9   19:dup             
	//   10   20:invokespecial   #27  <Method void PdfArray()>
	//   11   23:putfield        #29  <Field PdfArray documentFields>
		calculationOrder = new PdfArray();
	//   12   26:aload_0         
	//   13   27:new             #26  <Class PdfArray>
	//   14   30:dup             
	//   15   31:invokespecial   #27  <Method void PdfArray()>
	//   16   34:putfield        #31  <Field PdfArray calculationOrder>
		sigFlags = 0;
	//   17   37:aload_0         
	//   18   38:iconst_0        
	//   19   39:putfield        #33  <Field int sigFlags>
		writer = pdfwriter;
	//   20   42:aload_0         
	//   21   43:aload_1         
	//   22   44:putfield        #35  <Field PdfWriter writer>
	//   23   47:return          
	}

	public void addCalculationOrder(PdfFormField pdfformfield)
	{
		calculationOrder.add(((PdfObject) (pdfformfield.getIndirectReference())));
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field PdfArray calculationOrder>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #44  <Method PdfIndirectReference PdfFormField.getIndirectReference()>
	//    4    8:invokevirtual   #48  <Method boolean PdfArray.add(PdfObject)>
	//    5   11:pop             
	//    6   12:return          
	}

	public PdfFormField addCheckBox(String s, String s1, boolean flag, float f, float f1, float f2, float f3)
	{
		PdfFormField pdfformfield = PdfFormField.createCheckBox(writer);
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field PdfWriter writer>
	//    2    4:invokestatic    #54  <Method PdfFormField PdfFormField.createCheckBox(PdfWriter)>
	//    3    7:astore          8
		setCheckBoxParams(pdfformfield, s, s1, flag, f, f1, f2, f3);
	//    4    9:aload_0         
	//    5   10:aload           8
	//    6   12:aload_1         
	//    7   13:aload_2         
	//    8   14:iload_3         
	//    9   15:fload           4
	//   10   17:fload           5
	//   11   19:fload           6
	//   12   21:fload           7
	//   13   23:invokevirtual   #58  <Method void setCheckBoxParams(PdfFormField, String, String, boolean, float, float, float, float)>
		drawCheckBoxAppearences(pdfformfield, s1, f, f1, f2, f3);
	//   14   26:aload_0         
	//   15   27:aload           8
	//   16   29:aload_2         
	//   17   30:fload           4
	//   18   32:fload           5
	//   19   34:fload           6
	//   20   36:fload           7
	//   21   38:invokevirtual   #62  <Method void drawCheckBoxAppearences(PdfFormField, String, float, float, float, float)>
		addFormField(pdfformfield);
	//   22   41:aload_0         
	//   23   42:aload           8
	//   24   44:invokevirtual   #65  <Method void addFormField(PdfFormField)>
		return pdfformfield;
	//   25   47:aload           8
	//   26   49:areturn         
	}

	public PdfFormField addComboBox(String s, String as[], String s1, boolean flag, BaseFont basefont, float f, float f1, 
			float f2, float f3, float f4)
	{
		PdfFormField pdfformfield = PdfFormField.createCombo(writer, flag, as, 0);
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field PdfWriter writer>
	//    2    4:iload           4
	//    3    6:aload_2         
	//    4    7:iconst_0        
	//    5    8:invokestatic    #71  <Method PdfFormField PdfFormField.createCombo(PdfWriter, boolean, String[], int)>
	//    6   11:astore          11
		setChoiceParams(pdfformfield, s, s1, f1, f2, f3, f4);
	//    7   13:aload_0         
	//    8   14:aload           11
	//    9   16:aload_1         
	//   10   17:aload_3         
	//   11   18:fload           7
	//   12   20:fload           8
	//   13   22:fload           9
	//   14   24:fload           10
	//   15   26:invokevirtual   #75  <Method void setChoiceParams(PdfFormField, String, String, float, float, float, float)>
		s = s1;
	//   16   29:aload_3         
	//   17   30:astore_1        
		if(s1 == null)
	//*  18   31:aload_3         
	//*  19   32:ifnonnull       39
			s = as[0];
	//   20   35:aload_2         
	//   21   36:iconst_0        
	//   22   37:aaload          
	//   23   38:astore_1        
		drawSingleLineOfText(pdfformfield, s, basefont, f, f1, f2, f3, f4);
	//   24   39:aload_0         
	//   25   40:aload           11
	//   26   42:aload_1         
	//   27   43:aload           5
	//   28   45:fload           6
	//   29   47:fload           7
	//   30   49:fload           8
	//   31   51:fload           9
	//   32   53:fload           10
	//   33   55:invokevirtual   #79  <Method void drawSingleLineOfText(PdfFormField, String, BaseFont, float, float, float, float, float)>
		addFormField(pdfformfield);
	//   34   58:aload_0         
	//   35   59:aload           11
	//   36   61:invokevirtual   #65  <Method void addFormField(PdfFormField)>
		return pdfformfield;
	//   37   64:aload           11
	//   38   66:areturn         
	}

	public PdfFormField addComboBox(String s, String as[][], String s1, boolean flag, BaseFont basefont, float f, float f1, 
			float f2, float f3, float f4)
	{
		PdfFormField pdfformfield = PdfFormField.createCombo(writer, flag, as, 0);
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field PdfWriter writer>
	//    2    4:iload           4
	//    3    6:aload_2         
	//    4    7:iconst_0        
	//    5    8:invokestatic    #83  <Method PdfFormField PdfFormField.createCombo(PdfWriter, boolean, String[][], int)>
	//    6   11:astore          14
		setChoiceParams(pdfformfield, s, s1, f1, f2, f3, f4);
	//    7   13:aload_0         
	//    8   14:aload           14
	//    9   16:aload_1         
	//   10   17:aload_3         
	//   11   18:fload           7
	//   12   20:fload           8
	//   13   22:fload           9
	//   14   24:fload           10
	//   15   26:invokevirtual   #75  <Method void setChoiceParams(PdfFormField, String, String, float, float, float, float)>
		Object obj = null;
	//   16   29:aconst_null     
	//   17   30:astore          13
		int j = as.length;
	//   18   32:aload_2         
	//   19   33:arraylength     
	//   20   34:istore          12
		int i = 0;
	//   21   36:iconst_0        
	//   22   37:istore          11
		do
		{
label0:
			{
				s = ((String) (obj));
	//   23   39:aload           13
	//   24   41:astore_1        
				if(i < j)
	//*  25   42:iload           11
	//*  26   44:iload           12
	//*  27   46:icmpge          68
				{
					s = ((String) (as[i]));
	//   28   49:aload_2         
	//   29   50:iload           11
	//   30   52:aaload          
	//   31   53:astore_1        
					if(!((String) (s[0])).equals(((Object) (s1))))
						break label0;
	//   32   54:aload_1         
	//   33   55:iconst_0        
	//   34   56:aaload          
	//   35   57:aload_3         
	//   36   58:invokevirtual   #89  <Method boolean String.equals(Object)>
	//   37   61:ifeq            108
					s = ((String) (s[1]));
	//   38   64:aload_1         
	//   39   65:iconst_1        
	//   40   66:aaload          
	//   41   67:astore_1        
				}
				s1 = s;
	//   42   68:aload_1         
	//   43   69:astore_3        
				if(s == null)
	//*  44   70:aload_1         
	//*  45   71:ifnonnull       80
					s1 = as[0][1];
	//   46   74:aload_2         
	//   47   75:iconst_0        
	//   48   76:aaload          
	//   49   77:iconst_1        
	//   50   78:aaload          
	//   51   79:astore_3        
				drawSingleLineOfText(pdfformfield, s1, basefont, f, f1, f2, f3, f4);
	//   52   80:aload_0         
	//   53   81:aload           14
	//   54   83:aload_3         
	//   55   84:aload           5
	//   56   86:fload           6
	//   57   88:fload           7
	//   58   90:fload           8
	//   59   92:fload           9
	//   60   94:fload           10
	//   61   96:invokevirtual   #79  <Method void drawSingleLineOfText(PdfFormField, String, BaseFont, float, float, float, float, float)>
				addFormField(pdfformfield);
	//   62   99:aload_0         
	//   63  100:aload           14
	//   64  102:invokevirtual   #65  <Method void addFormField(PdfFormField)>
				return pdfformfield;
	//   65  105:aload           14
	//   66  107:areturn         
			}
			i++;
	//   67  108:iload           11
	//   68  110:iconst_1        
	//   69  111:iadd            
	//   70  112:istore          11
		} while(true);
	//   71  114:goto            39
	}

	public void addDocumentField(PdfIndirectReference pdfindirectreference)
	{
		documentFields.add(((PdfObject) (pdfindirectreference)));
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field PdfArray documentFields>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #48  <Method boolean PdfArray.add(PdfObject)>
	//    4    8:pop             
	//    5    9:return          
	}

	public void addFieldTemplates(HashSet hashset)
	{
		fieldTemplates.addAll(((java.util.Collection) (hashset)));
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field HashSet fieldTemplates>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #97  <Method boolean HashSet.addAll(java.util.Collection)>
	//    4    8:pop             
	//    5    9:return          
	}

	public void addFormField(PdfFormField pdfformfield)
	{
		writer.addAnnotation(((PdfAnnotation) (pdfformfield)));
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field PdfWriter writer>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #105 <Method void PdfWriter.addAnnotation(PdfAnnotation)>
	//    4    8:return          
	}

	public PdfFormField addHiddenField(String s, String s1)
	{
		PdfFormField pdfformfield = PdfFormField.createEmpty(writer);
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field PdfWriter writer>
	//    2    4:invokestatic    #110 <Method PdfFormField PdfFormField.createEmpty(PdfWriter)>
	//    3    7:astore_3        
		pdfformfield.setFieldName(s);
	//    4    8:aload_3         
	//    5    9:aload_1         
	//    6   10:invokevirtual   #114 <Method void PdfFormField.setFieldName(String)>
		pdfformfield.setValueAsName(s1);
	//    7   13:aload_3         
	//    8   14:aload_2         
	//    9   15:invokevirtual   #117 <Method void PdfFormField.setValueAsName(String)>
		addFormField(pdfformfield);
	//   10   18:aload_0         
	//   11   19:aload_3         
	//   12   20:invokevirtual   #65  <Method void addFormField(PdfFormField)>
		return pdfformfield;
	//   13   23:aload_3         
	//   14   24:areturn         
	}

	public PdfFormField addHtmlPostButton(String s, String s1, String s2, String s3, BaseFont basefont, float f, float f1, 
			float f2, float f3, float f4)
	{
		s3 = ((String) (PdfAction.createSubmitForm(s3, ((Object []) (null)), 4)));
	//    0    0:aload           4
	//    1    2:aconst_null     
	//    2    3:iconst_4        
	//    3    4:invokestatic    #125 <Method PdfAction PdfAction.createSubmitForm(String, Object[], int)>
	//    4    7:astore          4
		s3 = ((String) (new PdfFormField(writer, f1, f2, f3, f4, ((PdfAction) (s3)))));
	//    5    9:new             #40  <Class PdfFormField>
	//    6   12:dup             
	//    7   13:aload_0         
	//    8   14:getfield        #35  <Field PdfWriter writer>
	//    9   17:fload           7
	//   10   19:fload           8
	//   11   21:fload           9
	//   12   23:fload           10
	//   13   25:aload           4
	//   14   27:invokespecial   #128 <Method void PdfFormField(PdfWriter, float, float, float, float, PdfAction)>
	//   15   30:astore          4
		setButtonParams(((PdfFormField) (s3)), 0x10000, s, s2);
	//   16   32:aload_0         
	//   17   33:aload           4
	//   18   35:ldc1            #129 <Int 0x10000>
	//   19   37:aload_1         
	//   20   38:aload_3         
	//   21   39:invokevirtual   #133 <Method void setButtonParams(PdfFormField, int, String, String)>
		drawButton(((PdfFormField) (s3)), s1, basefont, f, f1, f2, f3, f4);
	//   22   42:aload_0         
	//   23   43:aload           4
	//   24   45:aload_2         
	//   25   46:aload           5
	//   26   48:fload           6
	//   27   50:fload           7
	//   28   52:fload           8
	//   29   54:fload           9
	//   30   56:fload           10
	//   31   58:invokevirtual   #136 <Method void drawButton(PdfFormField, String, BaseFont, float, float, float, float, float)>
		addFormField(((PdfFormField) (s3)));
	//   32   61:aload_0         
	//   33   62:aload           4
	//   34   64:invokevirtual   #65  <Method void addFormField(PdfFormField)>
		return ((PdfFormField) (s3));
	//   35   67:aload           4
	//   36   69:areturn         
	}

	public PdfFormField addMap(String s, String s1, String s2, PdfContentByte pdfcontentbyte, float f, float f1, float f2, 
			float f3)
	{
		s1 = ((String) (PdfAction.createSubmitForm(s2, ((Object []) (null)), 20)));
	//    0    0:aload_3         
	//    1    1:aconst_null     
	//    2    2:bipush          20
	//    3    4:invokestatic    #125 <Method PdfAction PdfAction.createSubmitForm(String, Object[], int)>
	//    4    7:astore_2        
		s1 = ((String) (new PdfFormField(writer, f, f1, f2, f3, ((PdfAction) (s1)))));
	//    5    8:new             #40  <Class PdfFormField>
	//    6   11:dup             
	//    7   12:aload_0         
	//    8   13:getfield        #35  <Field PdfWriter writer>
	//    9   16:fload           5
	//   10   18:fload           6
	//   11   20:fload           7
	//   12   22:fload           8
	//   13   24:aload_2         
	//   14   25:invokespecial   #128 <Method void PdfFormField(PdfWriter, float, float, float, float, PdfAction)>
	//   15   28:astore_2        
		setButtonParams(((PdfFormField) (s1)), 0x10000, s, ((String) (null)));
	//   16   29:aload_0         
	//   17   30:aload_2         
	//   18   31:ldc1            #129 <Int 0x10000>
	//   19   33:aload_1         
	//   20   34:aconst_null     
	//   21   35:invokevirtual   #133 <Method void setButtonParams(PdfFormField, int, String, String)>
		s = ((String) (PdfAppearance.createAppearance(writer, f2 - f, f3 - f1)));
	//   22   38:aload_0         
	//   23   39:getfield        #35  <Field PdfWriter writer>
	//   24   42:fload           7
	//   25   44:fload           5
	//   26   46:fsub            
	//   27   47:fload           8
	//   28   49:fload           6
	//   29   51:fsub            
	//   30   52:invokestatic    #144 <Method PdfAppearance PdfAppearance.createAppearance(PdfWriter, float, float)>
	//   31   55:astore_1        
		((PdfAppearance) (s)).add(pdfcontentbyte);
	//   32   56:aload_1         
	//   33   57:aload           4
	//   34   59:invokevirtual   #147 <Method void PdfAppearance.add(PdfContentByte)>
		((PdfFormField) (s1)).setAppearance(PdfAnnotation.APPEARANCE_NORMAL, ((PdfTemplate) (s)));
	//   35   62:aload_2         
	//   36   63:getstatic       #153 <Field PdfName PdfAnnotation.APPEARANCE_NORMAL>
	//   37   66:aload_1         
	//   38   67:invokevirtual   #157 <Method void PdfFormField.setAppearance(PdfName, PdfTemplate)>
		addFormField(((PdfFormField) (s1)));
	//   39   70:aload_0         
	//   40   71:aload_2         
	//   41   72:invokevirtual   #65  <Method void addFormField(PdfFormField)>
		return ((PdfFormField) (s1));
	//   42   75:aload_2         
	//   43   76:areturn         
	}

	public PdfFormField addMultiLineTextField(String s, String s1, BaseFont basefont, float f, float f1, float f2, float f3, 
			float f4)
	{
		PdfFormField pdfformfield = PdfFormField.createTextField(writer, true, false, 0);
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field PdfWriter writer>
	//    2    4:iconst_1        
	//    3    5:iconst_0        
	//    4    6:iconst_0        
	//    5    7:invokestatic    #163 <Method PdfFormField PdfFormField.createTextField(PdfWriter, boolean, boolean, int)>
	//    6   10:astore          9
		setTextFieldParams(pdfformfield, s1, s, f1, f2, f3, f4);
	//    7   12:aload_0         
	//    8   13:aload           9
	//    9   15:aload_2         
	//   10   16:aload_1         
	//   11   17:fload           5
	//   12   19:fload           6
	//   13   21:fload           7
	//   14   23:fload           8
	//   15   25:invokevirtual   #166 <Method void setTextFieldParams(PdfFormField, String, String, float, float, float, float)>
		drawMultiLineOfText(pdfformfield, s1, basefont, f, f1, f2, f3, f4);
	//   16   28:aload_0         
	//   17   29:aload           9
	//   18   31:aload_2         
	//   19   32:aload_3         
	//   20   33:fload           4
	//   21   35:fload           5
	//   22   37:fload           6
	//   23   39:fload           7
	//   24   41:fload           8
	//   25   43:invokevirtual   #169 <Method void drawMultiLineOfText(PdfFormField, String, BaseFont, float, float, float, float, float)>
		addFormField(pdfformfield);
	//   26   46:aload_0         
	//   27   47:aload           9
	//   28   49:invokevirtual   #65  <Method void addFormField(PdfFormField)>
		return pdfformfield;
	//   29   52:aload           9
	//   30   54:areturn         
	}

	public PdfFormField addRadioButton(PdfFormField pdfformfield, String s, float f, float f1, float f2, float f3)
	{
		PdfFormField pdfformfield1 = PdfFormField.createEmpty(writer);
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field PdfWriter writer>
	//    2    4:invokestatic    #110 <Method PdfFormField PdfFormField.createEmpty(PdfWriter)>
	//    3    7:astore          7
		pdfformfield1.setWidget(new Rectangle(f, f1, f2, f3), PdfAnnotation.HIGHLIGHT_TOGGLE);
	//    4    9:aload           7
	//    5   11:new             #173 <Class Rectangle>
	//    6   14:dup             
	//    7   15:fload_3         
	//    8   16:fload           4
	//    9   18:fload           5
	//   10   20:fload           6
	//   11   22:invokespecial   #176 <Method void Rectangle(float, float, float, float)>
	//   12   25:getstatic       #179 <Field PdfName PdfAnnotation.HIGHLIGHT_TOGGLE>
	//   13   28:invokevirtual   #183 <Method void PdfFormField.setWidget(Rectangle, PdfName)>
		if(((PdfName)pdfformfield.get(PdfName.V)).toString().substring(1).equals(((Object) (s))))
	//*  14   31:aload_1         
	//*  15   32:getstatic       #188 <Field PdfName PdfName.V>
	//*  16   35:invokevirtual   #192 <Method PdfObject PdfFormField.get(PdfName)>
	//*  17   38:checkcast       #185 <Class PdfName>
	//*  18   41:invokevirtual   #196 <Method String PdfName.toString()>
	//*  19   44:iconst_1        
	//*  20   45:invokevirtual   #200 <Method String String.substring(int)>
	//*  21   48:aload_2         
	//*  22   49:invokevirtual   #89  <Method boolean String.equals(Object)>
	//*  23   52:ifeq            84
			pdfformfield1.setAppearanceState(s);
	//   24   55:aload           7
	//   25   57:aload_2         
	//   26   58:invokevirtual   #203 <Method void PdfFormField.setAppearanceState(String)>
		else
	//*  27   61:aload_0         
	//*  28   62:aload           7
	//*  29   64:aload_2         
	//*  30   65:fload_3         
	//*  31   66:fload           4
	//*  32   68:fload           5
	//*  33   70:fload           6
	//*  34   72:invokevirtual   #206 <Method void drawRadioAppearences(PdfFormField, String, float, float, float, float)>
	//*  35   75:aload_1         
	//*  36   76:aload           7
	//*  37   78:invokevirtual   #209 <Method void PdfFormField.addKid(PdfFormField)>
	//*  38   81:aload           7
	//*  39   83:areturn         
			pdfformfield1.setAppearanceState("Off");
	//   40   84:aload           7
	//   41   86:ldc1            #211 <String "Off">
	//   42   88:invokevirtual   #203 <Method void PdfFormField.setAppearanceState(String)>
		drawRadioAppearences(pdfformfield1, s, f, f1, f2, f3);
		pdfformfield.addKid(pdfformfield1);
		return pdfformfield1;
	//*  43   91:goto            61
	}

	public void addRadioGroup(PdfFormField pdfformfield)
	{
		addFormField(pdfformfield);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #65  <Method void addFormField(PdfFormField)>
	//    3    5:return          
	}

	public PdfFormField addResetButton(String s, String s1, String s2, BaseFont basefont, float f, float f1, float f2, 
			float f3, float f4)
	{
		Object obj = ((Object) (PdfAction.createResetForm(((Object []) (null)), 0)));
	//    0    0:aconst_null     
	//    1    1:iconst_0        
	//    2    2:invokestatic    #218 <Method PdfAction PdfAction.createResetForm(Object[], int)>
	//    3    5:astore          10
		obj = ((Object) (new PdfFormField(writer, f1, f2, f3, f4, ((PdfAction) (obj)))));
	//    4    7:new             #40  <Class PdfFormField>
	//    5   10:dup             
	//    6   11:aload_0         
	//    7   12:getfield        #35  <Field PdfWriter writer>
	//    8   15:fload           6
	//    9   17:fload           7
	//   10   19:fload           8
	//   11   21:fload           9
	//   12   23:aload           10
	//   13   25:invokespecial   #128 <Method void PdfFormField(PdfWriter, float, float, float, float, PdfAction)>
	//   14   28:astore          10
		setButtonParams(((PdfFormField) (obj)), 0x10000, s, s2);
	//   15   30:aload_0         
	//   16   31:aload           10
	//   17   33:ldc1            #129 <Int 0x10000>
	//   18   35:aload_1         
	//   19   36:aload_3         
	//   20   37:invokevirtual   #133 <Method void setButtonParams(PdfFormField, int, String, String)>
		drawButton(((PdfFormField) (obj)), s1, basefont, f, f1, f2, f3, f4);
	//   21   40:aload_0         
	//   22   41:aload           10
	//   23   43:aload_2         
	//   24   44:aload           4
	//   25   46:fload           5
	//   26   48:fload           6
	//   27   50:fload           7
	//   28   52:fload           8
	//   29   54:fload           9
	//   30   56:invokevirtual   #136 <Method void drawButton(PdfFormField, String, BaseFont, float, float, float, float, float)>
		addFormField(((PdfFormField) (obj)));
	//   31   59:aload_0         
	//   32   60:aload           10
	//   33   62:invokevirtual   #65  <Method void addFormField(PdfFormField)>
		return ((PdfFormField) (obj));
	//   34   65:aload           10
	//   35   67:areturn         
	}

	public PdfFormField addSelectList(String s, String as[], String s1, BaseFont basefont, float f, float f1, float f2, 
			float f3, float f4)
	{
		PdfFormField pdfformfield = PdfFormField.createList(writer, as, 0);
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field PdfWriter writer>
	//    2    4:aload_2         
	//    3    5:iconst_0        
	//    4    6:invokestatic    #224 <Method PdfFormField PdfFormField.createList(PdfWriter, String[], int)>
	//    5    9:astore          12
		setChoiceParams(pdfformfield, s, s1, f1, f2, f3, f4);
	//    6   11:aload_0         
	//    7   12:aload           12
	//    8   14:aload_1         
	//    9   15:aload_3         
	//   10   16:fload           6
	//   11   18:fload           7
	//   12   20:fload           8
	//   13   22:fload           9
	//   14   24:invokevirtual   #75  <Method void setChoiceParams(PdfFormField, String, String, float, float, float, float)>
		s = ((String) (new StringBuffer()));
	//   15   27:new             #226 <Class StringBuffer>
	//   16   30:dup             
	//   17   31:invokespecial   #227 <Method void StringBuffer()>
	//   18   34:astore_1        
		int j = as.length;
	//   19   35:aload_2         
	//   20   36:arraylength     
	//   21   37:istore          11
		for(int i = 0; i < j; i++)
	//*  22   39:iconst_0        
	//*  23   40:istore          10
	//*  24   42:iload           10
	//*  25   44:iload           11
	//*  26   46:icmpge          72
			((StringBuffer) (s)).append(as[i]).append('\n');
	//   27   49:aload_1         
	//   28   50:aload_2         
	//   29   51:iload           10
	//   30   53:aaload          
	//   31   54:invokevirtual   #231 <Method StringBuffer StringBuffer.append(String)>
	//   32   57:bipush          10
	//   33   59:invokevirtual   #234 <Method StringBuffer StringBuffer.append(char)>
	//   34   62:pop             

	//   35   63:iload           10
	//   36   65:iconst_1        
	//   37   66:iadd            
	//   38   67:istore          10
	//*  39   69:goto            42
		drawMultiLineOfText(pdfformfield, ((StringBuffer) (s)).toString(), basefont, f, f1, f2, f3, f4);
	//   40   72:aload_0         
	//   41   73:aload           12
	//   42   75:aload_1         
	//   43   76:invokevirtual   #235 <Method String StringBuffer.toString()>
	//   44   79:aload           4
	//   45   81:fload           5
	//   46   83:fload           6
	//   47   85:fload           7
	//   48   87:fload           8
	//   49   89:fload           9
	//   50   91:invokevirtual   #169 <Method void drawMultiLineOfText(PdfFormField, String, BaseFont, float, float, float, float, float)>
		addFormField(pdfformfield);
	//   51   94:aload_0         
	//   52   95:aload           12
	//   53   97:invokevirtual   #65  <Method void addFormField(PdfFormField)>
		return pdfformfield;
	//   54  100:aload           12
	//   55  102:areturn         
	}

	public PdfFormField addSelectList(String s, String as[][], String s1, BaseFont basefont, float f, float f1, float f2, 
			float f3, float f4)
	{
		PdfFormField pdfformfield = PdfFormField.createList(writer, as, 0);
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field PdfWriter writer>
	//    2    4:aload_2         
	//    3    5:iconst_0        
	//    4    6:invokestatic    #239 <Method PdfFormField PdfFormField.createList(PdfWriter, String[][], int)>
	//    5    9:astore          12
		setChoiceParams(pdfformfield, s, s1, f1, f2, f3, f4);
	//    6   11:aload_0         
	//    7   12:aload           12
	//    8   14:aload_1         
	//    9   15:aload_3         
	//   10   16:fload           6
	//   11   18:fload           7
	//   12   20:fload           8
	//   13   22:fload           9
	//   14   24:invokevirtual   #75  <Method void setChoiceParams(PdfFormField, String, String, float, float, float, float)>
		s = ((String) (new StringBuffer()));
	//   15   27:new             #226 <Class StringBuffer>
	//   16   30:dup             
	//   17   31:invokespecial   #227 <Method void StringBuffer()>
	//   18   34:astore_1        
		int j = as.length;
	//   19   35:aload_2         
	//   20   36:arraylength     
	//   21   37:istore          11
		for(int i = 0; i < j; i++)
	//*  22   39:iconst_0        
	//*  23   40:istore          10
	//*  24   42:iload           10
	//*  25   44:iload           11
	//*  26   46:icmpge          74
			((StringBuffer) (s)).append(as[i][1]).append('\n');
	//   27   49:aload_1         
	//   28   50:aload_2         
	//   29   51:iload           10
	//   30   53:aaload          
	//   31   54:iconst_1        
	//   32   55:aaload          
	//   33   56:invokevirtual   #231 <Method StringBuffer StringBuffer.append(String)>
	//   34   59:bipush          10
	//   35   61:invokevirtual   #234 <Method StringBuffer StringBuffer.append(char)>
	//   36   64:pop             

	//   37   65:iload           10
	//   38   67:iconst_1        
	//   39   68:iadd            
	//   40   69:istore          10
	//*  41   71:goto            42
		drawMultiLineOfText(pdfformfield, ((StringBuffer) (s)).toString(), basefont, f, f1, f2, f3, f4);
	//   42   74:aload_0         
	//   43   75:aload           12
	//   44   77:aload_1         
	//   45   78:invokevirtual   #235 <Method String StringBuffer.toString()>
	//   46   81:aload           4
	//   47   83:fload           5
	//   48   85:fload           6
	//   49   87:fload           7
	//   50   89:fload           8
	//   51   91:fload           9
	//   52   93:invokevirtual   #169 <Method void drawMultiLineOfText(PdfFormField, String, BaseFont, float, float, float, float, float)>
		addFormField(pdfformfield);
	//   53   96:aload_0         
	//   54   97:aload           12
	//   55   99:invokevirtual   #65  <Method void addFormField(PdfFormField)>
		return pdfformfield;
	//   56  102:aload           12
	//   57  104:areturn         
	}

	public PdfFormField addSignature(String s, float f, float f1, float f2, float f3)
	{
		PdfFormField pdfformfield = PdfFormField.createSignature(writer);
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field PdfWriter writer>
	//    2    4:invokestatic    #244 <Method PdfFormField PdfFormField.createSignature(PdfWriter)>
	//    3    7:astore          6
		setSignatureParams(pdfformfield, s, f, f1, f2, f3);
	//    4    9:aload_0         
	//    5   10:aload           6
	//    6   12:aload_1         
	//    7   13:fload_2         
	//    8   14:fload_3         
	//    9   15:fload           4
	//   10   17:fload           5
	//   11   19:invokevirtual   #247 <Method void setSignatureParams(PdfFormField, String, float, float, float, float)>
		drawSignatureAppearences(pdfformfield, f, f1, f2, f3);
	//   12   22:aload_0         
	//   13   23:aload           6
	//   14   25:fload_2         
	//   15   26:fload_3         
	//   16   27:fload           4
	//   17   29:fload           5
	//   18   31:invokevirtual   #251 <Method void drawSignatureAppearences(PdfFormField, float, float, float, float)>
		addFormField(pdfformfield);
	//   19   34:aload_0         
	//   20   35:aload           6
	//   21   37:invokevirtual   #65  <Method void addFormField(PdfFormField)>
		return pdfformfield;
	//   22   40:aload           6
	//   23   42:areturn         
	}

	public PdfFormField addSingleLinePasswordField(String s, String s1, BaseFont basefont, float f, float f1, float f2, float f3, 
			float f4)
	{
		PdfFormField pdfformfield = PdfFormField.createTextField(writer, false, true, 0);
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field PdfWriter writer>
	//    2    4:iconst_0        
	//    3    5:iconst_1        
	//    4    6:iconst_0        
	//    5    7:invokestatic    #163 <Method PdfFormField PdfFormField.createTextField(PdfWriter, boolean, boolean, int)>
	//    6   10:astore          9
		setTextFieldParams(pdfformfield, s1, s, f1, f2, f3, f4);
	//    7   12:aload_0         
	//    8   13:aload           9
	//    9   15:aload_2         
	//   10   16:aload_1         
	//   11   17:fload           5
	//   12   19:fload           6
	//   13   21:fload           7
	//   14   23:fload           8
	//   15   25:invokevirtual   #166 <Method void setTextFieldParams(PdfFormField, String, String, float, float, float, float)>
		drawSingleLineOfText(pdfformfield, s1, basefont, f, f1, f2, f3, f4);
	//   16   28:aload_0         
	//   17   29:aload           9
	//   18   31:aload_2         
	//   19   32:aload_3         
	//   20   33:fload           4
	//   21   35:fload           5
	//   22   37:fload           6
	//   23   39:fload           7
	//   24   41:fload           8
	//   25   43:invokevirtual   #79  <Method void drawSingleLineOfText(PdfFormField, String, BaseFont, float, float, float, float, float)>
		addFormField(pdfformfield);
	//   26   46:aload_0         
	//   27   47:aload           9
	//   28   49:invokevirtual   #65  <Method void addFormField(PdfFormField)>
		return pdfformfield;
	//   29   52:aload           9
	//   30   54:areturn         
	}

	public PdfFormField addSingleLineTextField(String s, String s1, BaseFont basefont, float f, float f1, float f2, float f3, 
			float f4)
	{
		PdfFormField pdfformfield = PdfFormField.createTextField(writer, false, false, 0);
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field PdfWriter writer>
	//    2    4:iconst_0        
	//    3    5:iconst_0        
	//    4    6:iconst_0        
	//    5    7:invokestatic    #163 <Method PdfFormField PdfFormField.createTextField(PdfWriter, boolean, boolean, int)>
	//    6   10:astore          9
		setTextFieldParams(pdfformfield, s1, s, f1, f2, f3, f4);
	//    7   12:aload_0         
	//    8   13:aload           9
	//    9   15:aload_2         
	//   10   16:aload_1         
	//   11   17:fload           5
	//   12   19:fload           6
	//   13   21:fload           7
	//   14   23:fload           8
	//   15   25:invokevirtual   #166 <Method void setTextFieldParams(PdfFormField, String, String, float, float, float, float)>
		drawSingleLineOfText(pdfformfield, s1, basefont, f, f1, f2, f3, f4);
	//   16   28:aload_0         
	//   17   29:aload           9
	//   18   31:aload_2         
	//   19   32:aload_3         
	//   20   33:fload           4
	//   21   35:fload           5
	//   22   37:fload           6
	//   23   39:fload           7
	//   24   41:fload           8
	//   25   43:invokevirtual   #79  <Method void drawSingleLineOfText(PdfFormField, String, BaseFont, float, float, float, float, float)>
		addFormField(pdfformfield);
	//   26   46:aload_0         
	//   27   47:aload           9
	//   28   49:invokevirtual   #65  <Method void addFormField(PdfFormField)>
		return pdfformfield;
	//   29   52:aload           9
	//   30   54:areturn         
	}

	public void drawButton(PdfFormField pdfformfield, String s, BaseFont basefont, float f, float f1, float f2, float f3, 
			float f4)
	{
		PdfAppearance pdfappearance = PdfAppearance.createAppearance(writer, f3 - f1, f4 - f2);
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field PdfWriter writer>
	//    2    4:fload           7
	//    3    6:fload           5
	//    4    8:fsub            
	//    5    9:fload           8
	//    6   11:fload           6
	//    7   13:fsub            
	//    8   14:invokestatic    #144 <Method PdfAppearance PdfAppearance.createAppearance(PdfWriter, float, float)>
	//    9   17:astore          9
		pdfappearance.drawButton(0.0F, 0.0F, f3 - f1, f4 - f2, s, basefont, f);
	//   10   19:aload           9
	//   11   21:fconst_0        
	//   12   22:fconst_0        
	//   13   23:fload           7
	//   14   25:fload           5
	//   15   27:fsub            
	//   16   28:fload           8
	//   17   30:fload           6
	//   18   32:fsub            
	//   19   33:aload_2         
	//   20   34:aload_3         
	//   21   35:fload           4
	//   22   37:invokevirtual   #256 <Method void PdfAppearance.drawButton(float, float, float, float, String, BaseFont, float)>
		pdfformfield.setAppearance(PdfAnnotation.APPEARANCE_NORMAL, ((PdfTemplate) (pdfappearance)));
	//   23   40:aload_1         
	//   24   41:getstatic       #153 <Field PdfName PdfAnnotation.APPEARANCE_NORMAL>
	//   25   44:aload           9
	//   26   46:invokevirtual   #157 <Method void PdfFormField.setAppearance(PdfName, PdfTemplate)>
	//   27   49:return          
	}

	public void drawCheckBoxAppearences(PdfFormField pdfformfield, String s, float f, float f1, float f2, float f3)
	{
		float f4;
		BaseFont basefont;
		PdfAppearance pdfappearance;
		PdfAppearance pdfappearance1;
		try
		{
			basefont = BaseFont.createFont("ZapfDingbats", "Cp1252", false);
	//    0    0:ldc2            #260 <String "ZapfDingbats">
	//    1    3:ldc2            #262 <String "Cp1252">
	//    2    6:iconst_0        
	//    3    7:invokestatic    #268 <Method BaseFont BaseFont.createFont(String, String, boolean)>
	//    4   10:astore          8
		}
	//*   5   12:fload           6
	//*   6   14:fload           4
	//*   7   16:fsub            
	//*   8   17:fstore          7
	//*   9   19:aload_0         
	//*  10   20:getfield        #35  <Field PdfWriter writer>
	//*  11   23:fload           5
	//*  12   25:fload_3         
	//*  13   26:fsub            
	//*  14   27:fload           6
	//*  15   29:fload           4
	//*  16   31:fsub            
	//*  17   32:invokestatic    #144 <Method PdfAppearance PdfAppearance.createAppearance(PdfWriter, float, float)>
	//*  18   35:astore          9
	//*  19   37:aload           9
	//*  20   39:invokevirtual   #272 <Method PdfContentByte PdfAppearance.getDuplicate()>
	//*  21   42:checkcast       #140 <Class PdfAppearance>
	//*  22   45:astore          10
	//*  23   47:aload           10
	//*  24   49:aload           8
	//*  25   51:fload           7
	//*  26   53:invokevirtual   #276 <Method void PdfAppearance.setFontAndSize(BaseFont, float)>
	//*  27   56:aload           10
	//*  28   58:invokevirtual   #279 <Method void PdfAppearance.resetRGBColorFill()>
	//*  29   61:aload_1         
	//*  30   62:aload           10
	//*  31   64:invokevirtual   #282 <Method void PdfFormField.setDefaultAppearanceString(PdfContentByte)>
	//*  32   67:aload           9
	//*  33   69:fconst_0        
	//*  34   70:fconst_0        
	//*  35   71:fload           5
	//*  36   73:fload_3         
	//*  37   74:fsub            
	//*  38   75:fload           6
	//*  39   77:fload           4
	//*  40   79:fsub            
	//*  41   80:invokevirtual   #285 <Method void PdfAppearance.drawTextField(float, float, float, float)>
	//*  42   83:aload           9
	//*  43   85:invokevirtual   #288 <Method void PdfAppearance.saveState()>
	//*  44   88:aload           9
	//*  45   90:invokevirtual   #279 <Method void PdfAppearance.resetRGBColorFill()>
	//*  46   93:aload           9
	//*  47   95:invokevirtual   #291 <Method void PdfAppearance.beginText()>
	//*  48   98:aload           9
	//*  49  100:aload           8
	//*  50  102:fload           7
	//*  51  104:invokevirtual   #276 <Method void PdfAppearance.setFontAndSize(BaseFont, float)>
	//*  52  107:aload           9
	//*  53  109:iconst_1        
	//*  54  110:ldc2            #293 <String "4">
	//*  55  113:fload           5
	//*  56  115:fload_3         
	//*  57  116:fsub            
	//*  58  117:fconst_2        
	//*  59  118:fdiv            
	//*  60  119:fload           6
	//*  61  121:fload           4
	//*  62  123:fsub            
	//*  63  124:fconst_2        
	//*  64  125:fdiv            
	//*  65  126:ldc2            #294 <Float 0.3F>
	//*  66  129:fload           7
	//*  67  131:fmul            
	//*  68  132:fsub            
	//*  69  133:fconst_0        
	//*  70  134:invokevirtual   #298 <Method void PdfAppearance.showTextAligned(int, String, float, float, float)>
	//*  71  137:aload           9
	//*  72  139:invokevirtual   #301 <Method void PdfAppearance.endText()>
	//*  73  142:aload           9
	//*  74  144:invokevirtual   #304 <Method void PdfAppearance.restoreState()>
	//*  75  147:aload_1         
	//*  76  148:getstatic       #153 <Field PdfName PdfAnnotation.APPEARANCE_NORMAL>
	//*  77  151:aload_2         
	//*  78  152:aload           9
	//*  79  154:invokevirtual   #307 <Method void PdfFormField.setAppearance(PdfName, String, PdfTemplate)>
	//*  80  157:aload_0         
	//*  81  158:getfield        #35  <Field PdfWriter writer>
	//*  82  161:fload           5
	//*  83  163:fload_3         
	//*  84  164:fsub            
	//*  85  165:fload           6
	//*  86  167:fload           4
	//*  87  169:fsub            
	//*  88  170:invokestatic    #144 <Method PdfAppearance PdfAppearance.createAppearance(PdfWriter, float, float)>
	//*  89  173:astore_2        
	//*  90  174:aload_2         
	//*  91  175:fconst_0        
	//*  92  176:fconst_0        
	//*  93  177:fload           5
	//*  94  179:fload_3         
	//*  95  180:fsub            
	//*  96  181:fload           6
	//*  97  183:fload           4
	//*  98  185:fsub            
	//*  99  186:invokevirtual   #285 <Method void PdfAppearance.drawTextField(float, float, float, float)>
	//* 100  189:aload_1         
	//* 101  190:getstatic       #153 <Field PdfName PdfAnnotation.APPEARANCE_NORMAL>
	//* 102  193:ldc1            #211 <String "Off">
	//* 103  195:aload_2         
	//* 104  196:invokevirtual   #307 <Method void PdfFormField.setAppearance(PdfName, String, PdfTemplate)>
	//* 105  199:return          
		// Misplaced declaration of an exception variable
		catch(PdfFormField pdfformfield)
	//* 106  200:astore_1        
		{
			throw new ExceptionConverter(((Exception) (pdfformfield)));
	//  107  201:new             #309 <Class ExceptionConverter>
	//  108  204:dup             
	//  109  205:aload_1         
	//  110  206:invokespecial   #312 <Method void ExceptionConverter(Exception)>
	//  111  209:athrow          
		}
		f4 = f3 - f1;
		pdfappearance = PdfAppearance.createAppearance(writer, f2 - f, f3 - f1);
		pdfappearance1 = (PdfAppearance)pdfappearance.getDuplicate();
		pdfappearance1.setFontAndSize(basefont, f4);
		pdfappearance1.resetRGBColorFill();
		pdfformfield.setDefaultAppearanceString(((PdfContentByte) (pdfappearance1)));
		pdfappearance.drawTextField(0.0F, 0.0F, f2 - f, f3 - f1);
		pdfappearance.saveState();
		pdfappearance.resetRGBColorFill();
		pdfappearance.beginText();
		pdfappearance.setFontAndSize(basefont, f4);
		pdfappearance.showTextAligned(1, "4", (f2 - f) / 2.0F, (f3 - f1) / 2.0F - 0.3F * f4, 0.0F);
		pdfappearance.endText();
		pdfappearance.restoreState();
		pdfformfield.setAppearance(PdfAnnotation.APPEARANCE_NORMAL, s, ((PdfTemplate) (pdfappearance)));
		s = ((String) (PdfAppearance.createAppearance(writer, f2 - f, f3 - f1)));
		((PdfAppearance) (s)).drawTextField(0.0F, 0.0F, f2 - f, f3 - f1);
		pdfformfield.setAppearance(PdfAnnotation.APPEARANCE_NORMAL, "Off", ((PdfTemplate) (s)));
	}

	public void drawMultiLineOfText(PdfFormField pdfformfield, String s, BaseFont basefont, float f, float f1, float f2, float f3, 
			float f4)
	{
		PdfAppearance pdfappearance = PdfAppearance.createAppearance(writer, f3 - f1, f4 - f2);
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field PdfWriter writer>
	//    2    4:fload           7
	//    3    6:fload           5
	//    4    8:fsub            
	//    5    9:fload           8
	//    6   11:fload           6
	//    7   13:fsub            
	//    8   14:invokestatic    #144 <Method PdfAppearance PdfAppearance.createAppearance(PdfWriter, float, float)>
	//    9   17:astore          9
		PdfAppearance pdfappearance1 = (PdfAppearance)pdfappearance.getDuplicate();
	//   10   19:aload           9
	//   11   21:invokevirtual   #272 <Method PdfContentByte PdfAppearance.getDuplicate()>
	//   12   24:checkcast       #140 <Class PdfAppearance>
	//   13   27:astore          10
		pdfappearance1.setFontAndSize(basefont, f);
	//   14   29:aload           10
	//   15   31:aload_3         
	//   16   32:fload           4
	//   17   34:invokevirtual   #276 <Method void PdfAppearance.setFontAndSize(BaseFont, float)>
		pdfappearance1.resetRGBColorFill();
	//   18   37:aload           10
	//   19   39:invokevirtual   #279 <Method void PdfAppearance.resetRGBColorFill()>
		pdfformfield.setDefaultAppearanceString(((PdfContentByte) (pdfappearance1)));
	//   20   42:aload_1         
	//   21   43:aload           10
	//   22   45:invokevirtual   #282 <Method void PdfFormField.setDefaultAppearanceString(PdfContentByte)>
		pdfappearance.drawTextField(0.0F, 0.0F, f3 - f1, f4 - f2);
	//   23   48:aload           9
	//   24   50:fconst_0        
	//   25   51:fconst_0        
	//   26   52:fload           7
	//   27   54:fload           5
	//   28   56:fsub            
	//   29   57:fload           8
	//   30   59:fload           6
	//   31   61:fsub            
	//   32   62:invokevirtual   #285 <Method void PdfAppearance.drawTextField(float, float, float, float)>
		pdfappearance.beginVariableText();
	//   33   65:aload           9
	//   34   67:invokevirtual   #315 <Method void PdfAppearance.beginVariableText()>
		pdfappearance.saveState();
	//   35   70:aload           9
	//   36   72:invokevirtual   #288 <Method void PdfAppearance.saveState()>
		pdfappearance.rectangle(3F, 3F, f3 - f1 - 6F, f4 - f2 - 6F);
	//   37   75:aload           9
	//   38   77:ldc2            #316 <Float 3F>
	//   39   80:ldc2            #316 <Float 3F>
	//   40   83:fload           7
	//   41   85:fload           5
	//   42   87:fsub            
	//   43   88:ldc2            #317 <Float 6F>
	//   44   91:fsub            
	//   45   92:fload           8
	//   46   94:fload           6
	//   47   96:fsub            
	//   48   97:ldc2            #317 <Float 6F>
	//   49  100:fsub            
	//   50  101:invokevirtual   #320 <Method void PdfAppearance.rectangle(float, float, float, float)>
		pdfappearance.clip();
	//   51  104:aload           9
	//   52  106:invokevirtual   #323 <Method void PdfAppearance.clip()>
		pdfappearance.newPath();
	//   53  109:aload           9
	//   54  111:invokevirtual   #326 <Method void PdfAppearance.newPath()>
		pdfappearance.beginText();
	//   55  114:aload           9
	//   56  116:invokevirtual   #291 <Method void PdfAppearance.beginText()>
		pdfappearance.setFontAndSize(basefont, f);
	//   57  119:aload           9
	//   58  121:aload_3         
	//   59  122:fload           4
	//   60  124:invokevirtual   #276 <Method void PdfAppearance.setFontAndSize(BaseFont, float)>
		pdfappearance.resetRGBColorFill();
	//   61  127:aload           9
	//   62  129:invokevirtual   #279 <Method void PdfAppearance.resetRGBColorFill()>
		pdfappearance.setTextMatrix(4F, 5F);
	//   63  132:aload           9
	//   64  134:ldc2            #327 <Float 4F>
	//   65  137:ldc2            #328 <Float 5F>
	//   66  140:invokevirtual   #332 <Method void PdfAppearance.setTextMatrix(float, float)>
		s = ((String) (new StringTokenizer(s, "\n")));
	//   67  143:new             #334 <Class StringTokenizer>
	//   68  146:dup             
	//   69  147:aload_2         
	//   70  148:ldc2            #336 <String "\n">
	//   71  151:invokespecial   #339 <Method void StringTokenizer(String, String)>
	//   72  154:astore_2        
		f1 = f4 - f2;
	//   73  155:fload           8
	//   74  157:fload           6
	//   75  159:fsub            
	//   76  160:fstore          5
		for(; ((StringTokenizer) (s)).hasMoreTokens(); pdfappearance.showTextAligned(0, ((StringTokenizer) (s)).nextToken(), 3F, f1, 0.0F))
	//*  77  162:aload_2         
	//*  78  163:invokevirtual   #343 <Method boolean StringTokenizer.hasMoreTokens()>
	//*  79  166:ifeq            199
			f1 -= 1.2F * f;
	//   80  169:fload           5
	//   81  171:ldc2            #344 <Float 1.2F>
	//   82  174:fload           4
	//   83  176:fmul            
	//   84  177:fsub            
	//   85  178:fstore          5

	//   86  180:aload           9
	//   87  182:iconst_0        
	//   88  183:aload_2         
	//   89  184:invokevirtual   #347 <Method String StringTokenizer.nextToken()>
	//   90  187:ldc2            #316 <Float 3F>
	//   91  190:fload           5
	//   92  192:fconst_0        
	//   93  193:invokevirtual   #298 <Method void PdfAppearance.showTextAligned(int, String, float, float, float)>
	//*  94  196:goto            162
		pdfappearance.endText();
	//   95  199:aload           9
	//   96  201:invokevirtual   #301 <Method void PdfAppearance.endText()>
		pdfappearance.restoreState();
	//   97  204:aload           9
	//   98  206:invokevirtual   #304 <Method void PdfAppearance.restoreState()>
		pdfappearance.endVariableText();
	//   99  209:aload           9
	//  100  211:invokevirtual   #350 <Method void PdfAppearance.endVariableText()>
		pdfformfield.setAppearance(PdfAnnotation.APPEARANCE_NORMAL, ((PdfTemplate) (pdfappearance)));
	//  101  214:aload_1         
	//  102  215:getstatic       #153 <Field PdfName PdfAnnotation.APPEARANCE_NORMAL>
	//  103  218:aload           9
	//  104  220:invokevirtual   #157 <Method void PdfFormField.setAppearance(PdfName, PdfTemplate)>
	//  105  223:return          
	}

	public void drawRadioAppearences(PdfFormField pdfformfield, String s, float f, float f1, float f2, float f3)
	{
		PdfAppearance pdfappearance = PdfAppearance.createAppearance(writer, f2 - f, f3 - f1);
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field PdfWriter writer>
	//    2    4:fload           5
	//    3    6:fload_3         
	//    4    7:fsub            
	//    5    8:fload           6
	//    6   10:fload           4
	//    7   12:fsub            
	//    8   13:invokestatic    #144 <Method PdfAppearance PdfAppearance.createAppearance(PdfWriter, float, float)>
	//    9   16:astore          7
		pdfappearance.drawRadioField(0.0F, 0.0F, f2 - f, f3 - f1, true);
	//   10   18:aload           7
	//   11   20:fconst_0        
	//   12   21:fconst_0        
	//   13   22:fload           5
	//   14   24:fload_3         
	//   15   25:fsub            
	//   16   26:fload           6
	//   17   28:fload           4
	//   18   30:fsub            
	//   19   31:iconst_1        
	//   20   32:invokevirtual   #354 <Method void PdfAppearance.drawRadioField(float, float, float, float, boolean)>
		pdfformfield.setAppearance(PdfAnnotation.APPEARANCE_NORMAL, s, ((PdfTemplate) (pdfappearance)));
	//   21   35:aload_1         
	//   22   36:getstatic       #153 <Field PdfName PdfAnnotation.APPEARANCE_NORMAL>
	//   23   39:aload_2         
	//   24   40:aload           7
	//   25   42:invokevirtual   #307 <Method void PdfFormField.setAppearance(PdfName, String, PdfTemplate)>
		s = ((String) (PdfAppearance.createAppearance(writer, f2 - f, f3 - f1)));
	//   26   45:aload_0         
	//   27   46:getfield        #35  <Field PdfWriter writer>
	//   28   49:fload           5
	//   29   51:fload_3         
	//   30   52:fsub            
	//   31   53:fload           6
	//   32   55:fload           4
	//   33   57:fsub            
	//   34   58:invokestatic    #144 <Method PdfAppearance PdfAppearance.createAppearance(PdfWriter, float, float)>
	//   35   61:astore_2        
		((PdfAppearance) (s)).drawRadioField(0.0F, 0.0F, f2 - f, f3 - f1, false);
	//   36   62:aload_2         
	//   37   63:fconst_0        
	//   38   64:fconst_0        
	//   39   65:fload           5
	//   40   67:fload_3         
	//   41   68:fsub            
	//   42   69:fload           6
	//   43   71:fload           4
	//   44   73:fsub            
	//   45   74:iconst_0        
	//   46   75:invokevirtual   #354 <Method void PdfAppearance.drawRadioField(float, float, float, float, boolean)>
		pdfformfield.setAppearance(PdfAnnotation.APPEARANCE_NORMAL, "Off", ((PdfTemplate) (s)));
	//   47   78:aload_1         
	//   48   79:getstatic       #153 <Field PdfName PdfAnnotation.APPEARANCE_NORMAL>
	//   49   82:ldc1            #211 <String "Off">
	//   50   84:aload_2         
	//   51   85:invokevirtual   #307 <Method void PdfFormField.setAppearance(PdfName, String, PdfTemplate)>
	//   52   88:return          
	}

	public void drawSignatureAppearences(PdfFormField pdfformfield, float f, float f1, float f2, float f3)
	{
		PdfAppearance pdfappearance = PdfAppearance.createAppearance(writer, f2 - f, f3 - f1);
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field PdfWriter writer>
	//    2    4:fload           4
	//    3    6:fload_2         
	//    4    7:fsub            
	//    5    8:fload           5
	//    6   10:fload_3         
	//    7   11:fsub            
	//    8   12:invokestatic    #144 <Method PdfAppearance PdfAppearance.createAppearance(PdfWriter, float, float)>
	//    9   15:astore          6
		pdfappearance.setGrayFill(1.0F);
	//   10   17:aload           6
	//   11   19:fconst_1        
	//   12   20:invokevirtual   #358 <Method void PdfAppearance.setGrayFill(float)>
		pdfappearance.rectangle(0.0F, 0.0F, f2 - f, f3 - f1);
	//   13   23:aload           6
	//   14   25:fconst_0        
	//   15   26:fconst_0        
	//   16   27:fload           4
	//   17   29:fload_2         
	//   18   30:fsub            
	//   19   31:fload           5
	//   20   33:fload_3         
	//   21   34:fsub            
	//   22   35:invokevirtual   #320 <Method void PdfAppearance.rectangle(float, float, float, float)>
		pdfappearance.fill();
	//   23   38:aload           6
	//   24   40:invokevirtual   #361 <Method void PdfAppearance.fill()>
		pdfappearance.setGrayStroke(0.0F);
	//   25   43:aload           6
	//   26   45:fconst_0        
	//   27   46:invokevirtual   #364 <Method void PdfAppearance.setGrayStroke(float)>
		pdfappearance.setLineWidth(1.0F);
	//   28   49:aload           6
	//   29   51:fconst_1        
	//   30   52:invokevirtual   #367 <Method void PdfAppearance.setLineWidth(float)>
		pdfappearance.rectangle(0.5F, 0.5F, f2 - f - 0.5F, f3 - f1 - 0.5F);
	//   31   55:aload           6
	//   32   57:ldc2            #368 <Float 0.5F>
	//   33   60:ldc2            #368 <Float 0.5F>
	//   34   63:fload           4
	//   35   65:fload_2         
	//   36   66:fsub            
	//   37   67:ldc2            #368 <Float 0.5F>
	//   38   70:fsub            
	//   39   71:fload           5
	//   40   73:fload_3         
	//   41   74:fsub            
	//   42   75:ldc2            #368 <Float 0.5F>
	//   43   78:fsub            
	//   44   79:invokevirtual   #320 <Method void PdfAppearance.rectangle(float, float, float, float)>
		pdfappearance.closePathStroke();
	//   45   82:aload           6
	//   46   84:invokevirtual   #371 <Method void PdfAppearance.closePathStroke()>
		pdfappearance.saveState();
	//   47   87:aload           6
	//   48   89:invokevirtual   #288 <Method void PdfAppearance.saveState()>
		pdfappearance.rectangle(1.0F, 1.0F, f2 - f - 2.0F, f3 - f1 - 2.0F);
	//   49   92:aload           6
	//   50   94:fconst_1        
	//   51   95:fconst_1        
	//   52   96:fload           4
	//   53   98:fload_2         
	//   54   99:fsub            
	//   55  100:fconst_2        
	//   56  101:fsub            
	//   57  102:fload           5
	//   58  104:fload_3         
	//   59  105:fsub            
	//   60  106:fconst_2        
	//   61  107:fsub            
	//   62  108:invokevirtual   #320 <Method void PdfAppearance.rectangle(float, float, float, float)>
		pdfappearance.clip();
	//   63  111:aload           6
	//   64  113:invokevirtual   #323 <Method void PdfAppearance.clip()>
		pdfappearance.newPath();
	//   65  116:aload           6
	//   66  118:invokevirtual   #326 <Method void PdfAppearance.newPath()>
		pdfappearance.restoreState();
	//   67  121:aload           6
	//   68  123:invokevirtual   #304 <Method void PdfAppearance.restoreState()>
		pdfformfield.setAppearance(PdfAnnotation.APPEARANCE_NORMAL, ((PdfTemplate) (pdfappearance)));
	//   69  126:aload_1         
	//   70  127:getstatic       #153 <Field PdfName PdfAnnotation.APPEARANCE_NORMAL>
	//   71  130:aload           6
	//   72  132:invokevirtual   #157 <Method void PdfFormField.setAppearance(PdfName, PdfTemplate)>
	//   73  135:return          
	}

	public void drawSingleLineOfText(PdfFormField pdfformfield, String s, BaseFont basefont, float f, float f1, float f2, float f3, 
			float f4)
	{
		PdfAppearance pdfappearance = PdfAppearance.createAppearance(writer, f3 - f1, f4 - f2);
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field PdfWriter writer>
	//    2    4:fload           7
	//    3    6:fload           5
	//    4    8:fsub            
	//    5    9:fload           8
	//    6   11:fload           6
	//    7   13:fsub            
	//    8   14:invokestatic    #144 <Method PdfAppearance PdfAppearance.createAppearance(PdfWriter, float, float)>
	//    9   17:astore          9
		PdfAppearance pdfappearance1 = (PdfAppearance)pdfappearance.getDuplicate();
	//   10   19:aload           9
	//   11   21:invokevirtual   #272 <Method PdfContentByte PdfAppearance.getDuplicate()>
	//   12   24:checkcast       #140 <Class PdfAppearance>
	//   13   27:astore          10
		pdfappearance1.setFontAndSize(basefont, f);
	//   14   29:aload           10
	//   15   31:aload_3         
	//   16   32:fload           4
	//   17   34:invokevirtual   #276 <Method void PdfAppearance.setFontAndSize(BaseFont, float)>
		pdfappearance1.resetRGBColorFill();
	//   18   37:aload           10
	//   19   39:invokevirtual   #279 <Method void PdfAppearance.resetRGBColorFill()>
		pdfformfield.setDefaultAppearanceString(((PdfContentByte) (pdfappearance1)));
	//   20   42:aload_1         
	//   21   43:aload           10
	//   22   45:invokevirtual   #282 <Method void PdfFormField.setDefaultAppearanceString(PdfContentByte)>
		pdfappearance.drawTextField(0.0F, 0.0F, f3 - f1, f4 - f2);
	//   23   48:aload           9
	//   24   50:fconst_0        
	//   25   51:fconst_0        
	//   26   52:fload           7
	//   27   54:fload           5
	//   28   56:fsub            
	//   29   57:fload           8
	//   30   59:fload           6
	//   31   61:fsub            
	//   32   62:invokevirtual   #285 <Method void PdfAppearance.drawTextField(float, float, float, float)>
		pdfappearance.beginVariableText();
	//   33   65:aload           9
	//   34   67:invokevirtual   #315 <Method void PdfAppearance.beginVariableText()>
		pdfappearance.saveState();
	//   35   70:aload           9
	//   36   72:invokevirtual   #288 <Method void PdfAppearance.saveState()>
		pdfappearance.rectangle(3F, 3F, f3 - f1 - 6F, f4 - f2 - 6F);
	//   37   75:aload           9
	//   38   77:ldc2            #316 <Float 3F>
	//   39   80:ldc2            #316 <Float 3F>
	//   40   83:fload           7
	//   41   85:fload           5
	//   42   87:fsub            
	//   43   88:ldc2            #317 <Float 6F>
	//   44   91:fsub            
	//   45   92:fload           8
	//   46   94:fload           6
	//   47   96:fsub            
	//   48   97:ldc2            #317 <Float 6F>
	//   49  100:fsub            
	//   50  101:invokevirtual   #320 <Method void PdfAppearance.rectangle(float, float, float, float)>
		pdfappearance.clip();
	//   51  104:aload           9
	//   52  106:invokevirtual   #323 <Method void PdfAppearance.clip()>
		pdfappearance.newPath();
	//   53  109:aload           9
	//   54  111:invokevirtual   #326 <Method void PdfAppearance.newPath()>
		pdfappearance.beginText();
	//   55  114:aload           9
	//   56  116:invokevirtual   #291 <Method void PdfAppearance.beginText()>
		pdfappearance.setFontAndSize(basefont, f);
	//   57  119:aload           9
	//   58  121:aload_3         
	//   59  122:fload           4
	//   60  124:invokevirtual   #276 <Method void PdfAppearance.setFontAndSize(BaseFont, float)>
		pdfappearance.resetRGBColorFill();
	//   61  127:aload           9
	//   62  129:invokevirtual   #279 <Method void PdfAppearance.resetRGBColorFill()>
		pdfappearance.setTextMatrix(4F, (f4 - f2) / 2.0F - 0.3F * f);
	//   63  132:aload           9
	//   64  134:ldc2            #327 <Float 4F>
	//   65  137:fload           8
	//   66  139:fload           6
	//   67  141:fsub            
	//   68  142:fconst_2        
	//   69  143:fdiv            
	//   70  144:ldc2            #294 <Float 0.3F>
	//   71  147:fload           4
	//   72  149:fmul            
	//   73  150:fsub            
	//   74  151:invokevirtual   #332 <Method void PdfAppearance.setTextMatrix(float, float)>
		pdfappearance.showText(s);
	//   75  154:aload           9
	//   76  156:aload_2         
	//   77  157:invokevirtual   #374 <Method void PdfAppearance.showText(String)>
		pdfappearance.endText();
	//   78  160:aload           9
	//   79  162:invokevirtual   #301 <Method void PdfAppearance.endText()>
		pdfappearance.restoreState();
	//   80  165:aload           9
	//   81  167:invokevirtual   #304 <Method void PdfAppearance.restoreState()>
		pdfappearance.endVariableText();
	//   82  170:aload           9
	//   83  172:invokevirtual   #350 <Method void PdfAppearance.endVariableText()>
		pdfformfield.setAppearance(PdfAnnotation.APPEARANCE_NORMAL, ((PdfTemplate) (pdfappearance)));
	//   84  175:aload_1         
	//   85  176:getstatic       #153 <Field PdfName PdfAnnotation.APPEARANCE_NORMAL>
	//   86  179:aload           9
	//   87  181:invokevirtual   #157 <Method void PdfFormField.setAppearance(PdfName, PdfTemplate)>
	//   88  184:return          
	}

	public PdfFormField getRadioGroup(String s, String s1, boolean flag)
	{
		PdfFormField pdfformfield = PdfFormField.createRadioButton(writer, flag);
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field PdfWriter writer>
	//    2    4:iload_3         
	//    3    5:invokestatic    #380 <Method PdfFormField PdfFormField.createRadioButton(PdfWriter, boolean)>
	//    4    8:astore          4
		pdfformfield.setFieldName(s);
	//    5   10:aload           4
	//    6   12:aload_1         
	//    7   13:invokevirtual   #114 <Method void PdfFormField.setFieldName(String)>
		pdfformfield.setValueAsName(s1);
	//    8   16:aload           4
	//    9   18:aload_2         
	//   10   19:invokevirtual   #117 <Method void PdfFormField.setValueAsName(String)>
		return pdfformfield;
	//   11   22:aload           4
	//   12   24:areturn         
	}

	public boolean isValid()
	{
		if(documentFields.size() == 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #29  <Field PdfArray documentFields>
	//*   2    4:invokevirtual   #385 <Method int PdfArray.size()>
	//*   3    7:ifne            12
			return false;
	//    4   10:iconst_0        
	//    5   11:ireturn         
		put(PdfName.FIELDS, ((PdfObject) (documentFields)));
	//    6   12:aload_0         
	//    7   13:getstatic       #388 <Field PdfName PdfName.FIELDS>
	//    8   16:aload_0         
	//    9   17:getfield        #29  <Field PdfArray documentFields>
	//   10   20:invokevirtual   #392 <Method void put(PdfName, PdfObject)>
		if(sigFlags != 0)
	//*  11   23:aload_0         
	//*  12   24:getfield        #33  <Field int sigFlags>
	//*  13   27:ifeq            48
			put(PdfName.SIGFLAGS, ((PdfObject) (new PdfNumber(sigFlags))));
	//   14   30:aload_0         
	//   15   31:getstatic       #395 <Field PdfName PdfName.SIGFLAGS>
	//   16   34:new             #397 <Class PdfNumber>
	//   17   37:dup             
	//   18   38:aload_0         
	//   19   39:getfield        #33  <Field int sigFlags>
	//   20   42:invokespecial   #400 <Method void PdfNumber(int)>
	//   21   45:invokevirtual   #392 <Method void put(PdfName, PdfObject)>
		if(calculationOrder.size() > 0)
	//*  22   48:aload_0         
	//*  23   49:getfield        #31  <Field PdfArray calculationOrder>
	//*  24   52:invokevirtual   #385 <Method int PdfArray.size()>
	//*  25   55:ifle            69
			put(PdfName.CO, ((PdfObject) (calculationOrder)));
	//   26   58:aload_0         
	//   27   59:getstatic       #403 <Field PdfName PdfName.CO>
	//   28   62:aload_0         
	//   29   63:getfield        #31  <Field PdfArray calculationOrder>
	//   30   66:invokevirtual   #392 <Method void put(PdfName, PdfObject)>
		if(fieldTemplates.isEmpty())
	//*  31   69:aload_0         
	//*  32   70:getfield        #24  <Field HashSet fieldTemplates>
	//*  33   73:invokevirtual   #406 <Method boolean HashSet.isEmpty()>
	//*  34   76:ifeq            81
			return true;
	//   35   79:iconst_1        
	//   36   80:ireturn         
		PdfDictionary pdfdictionary = new PdfDictionary();
	//   37   81:new             #4   <Class PdfDictionary>
	//   38   84:dup             
	//   39   85:invokespecial   #19  <Method void PdfDictionary()>
	//   40   88:astore_1        
		for(Iterator iterator = fieldTemplates.iterator(); iterator.hasNext(); PdfFormField.mergeResources(pdfdictionary, (PdfDictionary)((PdfTemplate)iterator.next()).getResources()));
	//   41   89:aload_0         
	//   42   90:getfield        #24  <Field HashSet fieldTemplates>
	//   43   93:invokevirtual   #410 <Method Iterator HashSet.iterator()>
	//   44   96:astore_2        
	//   45   97:aload_2         
	//   46   98:invokeinterface #415 <Method boolean Iterator.hasNext()>
	//   47  103:ifeq            128
	//   48  106:aload_1         
	//   49  107:aload_2         
	//   50  108:invokeinterface #419 <Method Object Iterator.next()>
	//   51  113:checkcast       #421 <Class PdfTemplate>
	//   52  116:invokevirtual   #425 <Method PdfObject PdfTemplate.getResources()>
	//   53  119:checkcast       #4   <Class PdfDictionary>
	//   54  122:invokestatic    #429 <Method void PdfFormField.mergeResources(PdfDictionary, PdfDictionary)>
	//*  55  125:goto            97
		put(PdfName.DR, ((PdfObject) (pdfdictionary)));
	//   56  128:aload_0         
	//   57  129:getstatic       #432 <Field PdfName PdfName.DR>
	//   58  132:aload_1         
	//   59  133:invokevirtual   #392 <Method void put(PdfName, PdfObject)>
		put(PdfName.DA, ((PdfObject) (new PdfString("/Helv 0 Tf 0 g "))));
	//   60  136:aload_0         
	//   61  137:getstatic       #435 <Field PdfName PdfName.DA>
	//   62  140:new             #437 <Class PdfString>
	//   63  143:dup             
	//   64  144:ldc2            #439 <String "/Helv 0 Tf 0 g ">
	//   65  147:invokespecial   #441 <Method void PdfString(String)>
	//   66  150:invokevirtual   #392 <Method void put(PdfName, PdfObject)>
		pdfdictionary = (PdfDictionary)pdfdictionary.get(PdfName.FONT);
	//   67  153:aload_1         
	//   68  154:getstatic       #444 <Field PdfName PdfName.FONT>
	//   69  157:invokevirtual   #445 <Method PdfObject PdfDictionary.get(PdfName)>
	//   70  160:checkcast       #4   <Class PdfDictionary>
	//   71  163:astore_1        
		if(pdfdictionary != null)
	//*  72  164:aload_1         
	//*  73  165:ifnull          176
			writer.eliminateFontSubset(pdfdictionary);
	//   74  168:aload_0         
	//   75  169:getfield        #35  <Field PdfWriter writer>
	//   76  172:aload_1         
	//   77  173:invokevirtual   #449 <Method void PdfWriter.eliminateFontSubset(PdfDictionary)>
		return true;
	//   78  176:iconst_1        
	//   79  177:ireturn         
	}

	public void setButtonParams(PdfFormField pdfformfield, int i, String s, String s1)
	{
		pdfformfield.setButton(i);
	//    0    0:aload_1         
	//    1    1:iload_2         
	//    2    2:invokevirtual   #452 <Method void PdfFormField.setButton(int)>
		pdfformfield.setFlags(4);
	//    3    5:aload_1         
	//    4    6:iconst_4        
	//    5    7:invokevirtual   #455 <Method void PdfFormField.setFlags(int)>
		pdfformfield.setPage();
	//    6   10:aload_1         
	//    7   11:invokevirtual   #458 <Method void PdfFormField.setPage()>
		pdfformfield.setFieldName(s);
	//    8   14:aload_1         
	//    9   15:aload_3         
	//   10   16:invokevirtual   #114 <Method void PdfFormField.setFieldName(String)>
		if(s1 != null)
	//*  11   19:aload           4
	//*  12   21:ifnull          30
			pdfformfield.setValueAsString(s1);
	//   13   24:aload_1         
	//   14   25:aload           4
	//   15   27:invokevirtual   #461 <Method void PdfFormField.setValueAsString(String)>
	//   16   30:return          
	}

	public void setCheckBoxParams(PdfFormField pdfformfield, String s, String s1, boolean flag, float f, float f1, float f2, 
			float f3)
	{
		pdfformfield.setWidget(new Rectangle(f, f1, f2, f3), PdfAnnotation.HIGHLIGHT_TOGGLE);
	//    0    0:aload_1         
	//    1    1:new             #173 <Class Rectangle>
	//    2    4:dup             
	//    3    5:fload           5
	//    4    7:fload           6
	//    5    9:fload           7
	//    6   11:fload           8
	//    7   13:invokespecial   #176 <Method void Rectangle(float, float, float, float)>
	//    8   16:getstatic       #179 <Field PdfName PdfAnnotation.HIGHLIGHT_TOGGLE>
	//    9   19:invokevirtual   #183 <Method void PdfFormField.setWidget(Rectangle, PdfName)>
		pdfformfield.setFieldName(s);
	//   10   22:aload_1         
	//   11   23:aload_2         
	//   12   24:invokevirtual   #114 <Method void PdfFormField.setFieldName(String)>
		if(flag)
	//*  13   27:iload           4
	//*  14   29:ifeq            65
		{
			pdfformfield.setValueAsName(s1);
	//   15   32:aload_1         
	//   16   33:aload_3         
	//   17   34:invokevirtual   #117 <Method void PdfFormField.setValueAsName(String)>
			pdfformfield.setAppearanceState(s1);
	//   18   37:aload_1         
	//   19   38:aload_3         
	//   20   39:invokevirtual   #203 <Method void PdfFormField.setAppearanceState(String)>
		} else
	//*  21   42:aload_1         
	//*  22   43:iconst_4        
	//*  23   44:invokevirtual   #455 <Method void PdfFormField.setFlags(int)>
	//*  24   47:aload_1         
	//*  25   48:invokevirtual   #458 <Method void PdfFormField.setPage()>
	//*  26   51:aload_1         
	//*  27   52:new             #463 <Class PdfBorderDictionary>
	//*  28   55:dup             
	//*  29   56:fconst_1        
	//*  30   57:iconst_0        
	//*  31   58:invokespecial   #466 <Method void PdfBorderDictionary(float, int)>
	//*  32   61:invokevirtual   #470 <Method void PdfFormField.setBorderStyle(PdfBorderDictionary)>
	//*  33   64:return          
		{
			pdfformfield.setValueAsName("Off");
	//   34   65:aload_1         
	//   35   66:ldc1            #211 <String "Off">
	//   36   68:invokevirtual   #117 <Method void PdfFormField.setValueAsName(String)>
			pdfformfield.setAppearanceState("Off");
	//   37   71:aload_1         
	//   38   72:ldc1            #211 <String "Off">
	//   39   74:invokevirtual   #203 <Method void PdfFormField.setAppearanceState(String)>
		}
		pdfformfield.setFlags(4);
		pdfformfield.setPage();
		pdfformfield.setBorderStyle(new PdfBorderDictionary(1.0F, 0));
	//*  40   77:goto            42
	}

	public void setChoiceParams(PdfFormField pdfformfield, String s, String s1, float f, float f1, float f2, float f3)
	{
		pdfformfield.setWidget(new Rectangle(f, f1, f2, f3), PdfAnnotation.HIGHLIGHT_INVERT);
	//    0    0:aload_1         
	//    1    1:new             #173 <Class Rectangle>
	//    2    4:dup             
	//    3    5:fload           4
	//    4    7:fload           5
	//    5    9:fload           6
	//    6   11:fload           7
	//    7   13:invokespecial   #176 <Method void Rectangle(float, float, float, float)>
	//    8   16:getstatic       #473 <Field PdfName PdfAnnotation.HIGHLIGHT_INVERT>
	//    9   19:invokevirtual   #183 <Method void PdfFormField.setWidget(Rectangle, PdfName)>
		if(s1 != null)
	//*  10   22:aload_3         
	//*  11   23:ifnull          36
		{
			pdfformfield.setValueAsString(s1);
	//   12   26:aload_1         
	//   13   27:aload_3         
	//   14   28:invokevirtual   #461 <Method void PdfFormField.setValueAsString(String)>
			pdfformfield.setDefaultValueAsString(s1);
	//   15   31:aload_1         
	//   16   32:aload_3         
	//   17   33:invokevirtual   #476 <Method void PdfFormField.setDefaultValueAsString(String)>
		}
		pdfformfield.setFieldName(s);
	//   18   36:aload_1         
	//   19   37:aload_2         
	//   20   38:invokevirtual   #114 <Method void PdfFormField.setFieldName(String)>
		pdfformfield.setFlags(4);
	//   21   41:aload_1         
	//   22   42:iconst_4        
	//   23   43:invokevirtual   #455 <Method void PdfFormField.setFlags(int)>
		pdfformfield.setPage();
	//   24   46:aload_1         
	//   25   47:invokevirtual   #458 <Method void PdfFormField.setPage()>
		pdfformfield.setBorderStyle(new PdfBorderDictionary(2.0F, 0));
	//   26   50:aload_1         
	//   27   51:new             #463 <Class PdfBorderDictionary>
	//   28   54:dup             
	//   29   55:fconst_2        
	//   30   56:iconst_0        
	//   31   57:invokespecial   #466 <Method void PdfBorderDictionary(float, int)>
	//   32   60:invokevirtual   #470 <Method void PdfFormField.setBorderStyle(PdfBorderDictionary)>
	//   33   63:return          
	}

	public void setNeedAppearances(boolean flag)
	{
		put(PdfName.NEEDAPPEARANCES, ((PdfObject) (new PdfBoolean(flag))));
	//    0    0:aload_0         
	//    1    1:getstatic       #481 <Field PdfName PdfName.NEEDAPPEARANCES>
	//    2    4:new             #483 <Class PdfBoolean>
	//    3    7:dup             
	//    4    8:iload_1         
	//    5    9:invokespecial   #485 <Method void PdfBoolean(boolean)>
	//    6   12:invokevirtual   #392 <Method void put(PdfName, PdfObject)>
	//    7   15:return          
	}

	public void setSigFlags(int i)
	{
		sigFlags = sigFlags | i;
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #33  <Field int sigFlags>
	//    3    5:iload_1         
	//    4    6:ior             
	//    5    7:putfield        #33  <Field int sigFlags>
	//    6   10:return          
	}

	public void setSignatureParams(PdfFormField pdfformfield, String s, float f, float f1, float f2, float f3)
	{
		pdfformfield.setWidget(new Rectangle(f, f1, f2, f3), PdfAnnotation.HIGHLIGHT_INVERT);
	//    0    0:aload_1         
	//    1    1:new             #173 <Class Rectangle>
	//    2    4:dup             
	//    3    5:fload_3         
	//    4    6:fload           4
	//    5    8:fload           5
	//    6   10:fload           6
	//    7   12:invokespecial   #176 <Method void Rectangle(float, float, float, float)>
	//    8   15:getstatic       #473 <Field PdfName PdfAnnotation.HIGHLIGHT_INVERT>
	//    9   18:invokevirtual   #183 <Method void PdfFormField.setWidget(Rectangle, PdfName)>
		pdfformfield.setFieldName(s);
	//   10   21:aload_1         
	//   11   22:aload_2         
	//   12   23:invokevirtual   #114 <Method void PdfFormField.setFieldName(String)>
		pdfformfield.setFlags(4);
	//   13   26:aload_1         
	//   14   27:iconst_4        
	//   15   28:invokevirtual   #455 <Method void PdfFormField.setFlags(int)>
		pdfformfield.setPage();
	//   16   31:aload_1         
	//   17   32:invokevirtual   #458 <Method void PdfFormField.setPage()>
		pdfformfield.setMKBorderColor(BaseColor.BLACK);
	//   18   35:aload_1         
	//   19   36:getstatic       #492 <Field BaseColor BaseColor.BLACK>
	//   20   39:invokevirtual   #496 <Method void PdfFormField.setMKBorderColor(BaseColor)>
		pdfformfield.setMKBackgroundColor(BaseColor.WHITE);
	//   21   42:aload_1         
	//   22   43:getstatic       #499 <Field BaseColor BaseColor.WHITE>
	//   23   46:invokevirtual   #502 <Method void PdfFormField.setMKBackgroundColor(BaseColor)>
	//   24   49:return          
	}

	public void setTextFieldParams(PdfFormField pdfformfield, String s, String s1, float f, float f1, float f2, float f3)
	{
		pdfformfield.setWidget(new Rectangle(f, f1, f2, f3), PdfAnnotation.HIGHLIGHT_INVERT);
	//    0    0:aload_1         
	//    1    1:new             #173 <Class Rectangle>
	//    2    4:dup             
	//    3    5:fload           4
	//    4    7:fload           5
	//    5    9:fload           6
	//    6   11:fload           7
	//    7   13:invokespecial   #176 <Method void Rectangle(float, float, float, float)>
	//    8   16:getstatic       #473 <Field PdfName PdfAnnotation.HIGHLIGHT_INVERT>
	//    9   19:invokevirtual   #183 <Method void PdfFormField.setWidget(Rectangle, PdfName)>
		pdfformfield.setValueAsString(s);
	//   10   22:aload_1         
	//   11   23:aload_2         
	//   12   24:invokevirtual   #461 <Method void PdfFormField.setValueAsString(String)>
		pdfformfield.setDefaultValueAsString(s);
	//   13   27:aload_1         
	//   14   28:aload_2         
	//   15   29:invokevirtual   #476 <Method void PdfFormField.setDefaultValueAsString(String)>
		pdfformfield.setFieldName(s1);
	//   16   32:aload_1         
	//   17   33:aload_3         
	//   18   34:invokevirtual   #114 <Method void PdfFormField.setFieldName(String)>
		pdfformfield.setFlags(4);
	//   19   37:aload_1         
	//   20   38:iconst_4        
	//   21   39:invokevirtual   #455 <Method void PdfFormField.setFlags(int)>
		pdfformfield.setPage();
	//   22   42:aload_1         
	//   23   43:invokevirtual   #458 <Method void PdfFormField.setPage()>
	//   24   46:return          
	}

	public void toPdf(PdfWriter pdfwriter, OutputStream outputstream)
		throws IOException
	{
		PdfWriter.checkPdfIsoConformance(pdfwriter, 15, ((Object) (this)));
	//    0    0:aload_1         
	//    1    1:bipush          15
	//    2    3:aload_0         
	//    3    4:invokestatic    #510 <Method void PdfWriter.checkPdfIsoConformance(PdfWriter, int, Object)>
		super.toPdf(pdfwriter, outputstream);
	//    4    7:aload_0         
	//    5    8:aload_1         
	//    6    9:aload_2         
	//    7   10:invokespecial   #512 <Method void PdfDictionary.toPdf(PdfWriter, OutputStream)>
	//    8   13:return          
	}

	private PdfArray calculationOrder;
	private PdfArray documentFields;
	private HashSet fieldTemplates;
	private int sigFlags;
	private PdfWriter writer;
}

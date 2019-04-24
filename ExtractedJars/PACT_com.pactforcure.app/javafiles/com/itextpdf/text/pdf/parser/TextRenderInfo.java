// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf.parser;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.pdf.*;
import java.io.UnsupportedEncodingException;
import java.util.*;

// Referenced classes of package com.itextpdf.text.pdf.parser:
//			GraphicsState, Matrix, LineSegment, Vector, 
//			MarkedContentInfo

public class TextRenderInfo
{

	TextRenderInfo(PdfString pdfstring, GraphicsState graphicsstate, Matrix matrix, Collection collection)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #24  <Method void Object()>
		text = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #26  <Field String text>
		unscaledWidth = null;
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:putfield        #28  <Field Float unscaledWidth>
		fontMatrix = null;
	//    8   14:aload_0         
	//    9   15:aconst_null     
	//   10   16:putfield        #30  <Field double[] fontMatrix>
		string = pdfstring;
	//   11   19:aload_0         
	//   12   20:aload_1         
	//   13   21:putfield        #32  <Field PdfString string>
		textToUserSpaceTransformMatrix = matrix.multiply(graphicsstate.ctm);
	//   14   24:aload_0         
	//   15   25:aload_3         
	//   16   26:aload_2         
	//   17   27:getfield        #37  <Field Matrix GraphicsState.ctm>
	//   18   30:invokevirtual   #43  <Method Matrix Matrix.multiply(Matrix)>
	//   19   33:putfield        #45  <Field Matrix textToUserSpaceTransformMatrix>
		gs = graphicsstate;
	//   20   36:aload_0         
	//   21   37:aload_2         
	//   22   38:putfield        #47  <Field GraphicsState gs>
		markedContentInfos = ((Collection) (new ArrayList(collection)));
	//   23   41:aload_0         
	//   24   42:new             #49  <Class ArrayList>
	//   25   45:dup             
	//   26   46:aload           4
	//   27   48:invokespecial   #52  <Method void ArrayList(Collection)>
	//   28   51:putfield        #54  <Field Collection markedContentInfos>
		fontMatrix = graphicsstate.font.getFontMatrix();
	//   29   54:aload_0         
	//   30   55:aload_2         
	//   31   56:getfield        #58  <Field CMapAwareDocumentFont GraphicsState.font>
	//   32   59:invokevirtual   #64  <Method double[] CMapAwareDocumentFont.getFontMatrix()>
	//   33   62:putfield        #30  <Field double[] fontMatrix>
	//   34   65:return          
	}

	private TextRenderInfo(TextRenderInfo textrenderinfo, PdfString pdfstring, float f)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #24  <Method void Object()>
		text = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #26  <Field String text>
		unscaledWidth = null;
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:putfield        #28  <Field Float unscaledWidth>
		fontMatrix = null;
	//    8   14:aload_0         
	//    9   15:aconst_null     
	//   10   16:putfield        #30  <Field double[] fontMatrix>
		string = pdfstring;
	//   11   19:aload_0         
	//   12   20:aload_2         
	//   13   21:putfield        #32  <Field PdfString string>
		textToUserSpaceTransformMatrix = (new Matrix(f, 0.0F)).multiply(textrenderinfo.textToUserSpaceTransformMatrix);
	//   14   24:aload_0         
	//   15   25:new             #39  <Class Matrix>
	//   16   28:dup             
	//   17   29:fload_3         
	//   18   30:fconst_0        
	//   19   31:invokespecial   #71  <Method void Matrix(float, float)>
	//   20   34:aload_1         
	//   21   35:getfield        #45  <Field Matrix textToUserSpaceTransformMatrix>
	//   22   38:invokevirtual   #43  <Method Matrix Matrix.multiply(Matrix)>
	//   23   41:putfield        #45  <Field Matrix textToUserSpaceTransformMatrix>
		gs = textrenderinfo.gs;
	//   24   44:aload_0         
	//   25   45:aload_1         
	//   26   46:getfield        #47  <Field GraphicsState gs>
	//   27   49:putfield        #47  <Field GraphicsState gs>
		markedContentInfos = textrenderinfo.markedContentInfos;
	//   28   52:aload_0         
	//   29   53:aload_1         
	//   30   54:getfield        #54  <Field Collection markedContentInfos>
	//   31   57:putfield        #54  <Field Collection markedContentInfos>
		fontMatrix = gs.font.getFontMatrix();
	//   32   60:aload_0         
	//   33   61:aload_0         
	//   34   62:getfield        #47  <Field GraphicsState gs>
	//   35   65:getfield        #58  <Field CMapAwareDocumentFont GraphicsState.font>
	//   36   68:invokevirtual   #64  <Method double[] CMapAwareDocumentFont.getFontMatrix()>
	//   37   71:putfield        #30  <Field double[] fontMatrix>
	//   38   74:return          
	}

	private float convertHeightFromTextSpaceToUserSpace(float f)
	{
		return (new LineSegment(new Vector(0.0F, 0.0F, 1.0F), new Vector(0.0F, f, 1.0F))).transformBy(textToUserSpaceTransformMatrix).getLength();
	//    0    0:new             #75  <Class LineSegment>
	//    1    3:dup             
	//    2    4:new             #77  <Class Vector>
	//    3    7:dup             
	//    4    8:fconst_0        
	//    5    9:fconst_0        
	//    6   10:fconst_1        
	//    7   11:invokespecial   #80  <Method void Vector(float, float, float)>
	//    8   14:new             #77  <Class Vector>
	//    9   17:dup             
	//   10   18:fconst_0        
	//   11   19:fload_1         
	//   12   20:fconst_1        
	//   13   21:invokespecial   #80  <Method void Vector(float, float, float)>
	//   14   24:invokespecial   #83  <Method void LineSegment(Vector, Vector)>
	//   15   27:aload_0         
	//   16   28:getfield        #45  <Field Matrix textToUserSpaceTransformMatrix>
	//   17   31:invokevirtual   #87  <Method LineSegment LineSegment.transformBy(Matrix)>
	//   18   34:invokevirtual   #91  <Method float LineSegment.getLength()>
	//   19   37:freturn         
	}

	private float convertWidthFromTextSpaceToUserSpace(float f)
	{
		return (new LineSegment(new Vector(0.0F, 0.0F, 1.0F), new Vector(f, 0.0F, 1.0F))).transformBy(textToUserSpaceTransformMatrix).getLength();
	//    0    0:new             #75  <Class LineSegment>
	//    1    3:dup             
	//    2    4:new             #77  <Class Vector>
	//    3    7:dup             
	//    4    8:fconst_0        
	//    5    9:fconst_0        
	//    6   10:fconst_1        
	//    7   11:invokespecial   #80  <Method void Vector(float, float, float)>
	//    8   14:new             #77  <Class Vector>
	//    9   17:dup             
	//   10   18:fload_1         
	//   11   19:fconst_0        
	//   12   20:fconst_1        
	//   13   21:invokespecial   #80  <Method void Vector(float, float, float)>
	//   14   24:invokespecial   #83  <Method void LineSegment(Vector, Vector)>
	//   15   27:aload_0         
	//   16   28:getfield        #45  <Field Matrix textToUserSpaceTransformMatrix>
	//   17   31:invokevirtual   #87  <Method LineSegment LineSegment.transformBy(Matrix)>
	//   18   34:invokevirtual   #91  <Method float LineSegment.getLength()>
	//   19   37:freturn         
	}

	private String decode(PdfString pdfstring)
	{
		pdfstring = ((PdfString) (pdfstring.getBytes()));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #100 <Method byte[] PdfString.getBytes()>
	//    2    4:astore_1        
		return gs.font.decode(((byte []) (pdfstring)), 0, pdfstring.length);
	//    3    5:aload_0         
	//    4    6:getfield        #47  <Field GraphicsState gs>
	//    5    9:getfield        #58  <Field CMapAwareDocumentFont GraphicsState.font>
	//    6   12:aload_1         
	//    7   13:iconst_0        
	//    8   14:aload_1         
	//    9   15:arraylength     
	//   10   16:invokevirtual   #103 <Method String CMapAwareDocumentFont.decode(byte[], int, int)>
	//   11   19:areturn         
	}

	private int getCharCode(String s)
	{
		int i;
		int j;
		try
		{
			s = ((String) (s.getBytes("UTF-16BE")));
	//    0    0:aload_1         
	//    1    1:ldc1            #109 <String "UTF-16BE">
	//    2    3:invokevirtual   #114 <Method byte[] String.getBytes(String)>
	//    3    6:astore_1        
		}
	//*   4    7:iconst_0        
	//*   5    8:istore_2        
	//*   6    9:iconst_0        
	//*   7   10:istore_3        
	//*   8   11:iload_3         
	//*   9   12:aload_1         
	//*  10   13:arraylength     
	//*  11   14:iconst_1        
	//*  12   15:isub            
	//*  13   16:icmpge          39
	//*  14   19:iload_2         
	//*  15   20:aload_1         
	//*  16   21:iload_3         
	//*  17   22:baload          
	//*  18   23:sipush          255
	//*  19   26:iand            
	//*  20   27:iadd            
	//*  21   28:bipush          8
	//*  22   30:ishl            
	//*  23   31:istore_2        
	//*  24   32:iload_3         
	//*  25   33:iconst_1        
	//*  26   34:iadd            
	//*  27   35:istore_3        
	//*  28   36:goto            11
	//*  29   39:iload_2         
	//*  30   40:istore_3        
	//*  31   41:aload_1         
	//*  32   42:arraylength     
	//*  33   43:ifle            61
	//*  34   46:aload_1         
	//*  35   47:aload_1         
	//*  36   48:arraylength     
	//*  37   49:iconst_1        
	//*  38   50:isub            
	//*  39   51:baload          
	//*  40   52:istore_3        
	//*  41   53:iload_2         
	//*  42   54:iload_3         
	//*  43   55:sipush          255
	//*  44   58:iand            
	//*  45   59:iadd            
	//*  46   60:istore_3        
	//*  47   61:iload_3         
	//*  48   62:ireturn         
		// Misplaced declaration of an exception variable
		catch(String s)
	//*  49   63:astore_1        
		{
			return 0;
	//   50   64:iconst_0        
	//   51   65:ireturn         
		}
		i = 0;
		j = 0;
		while(j < s.length - 1) 
		{
			i = i + (s[j] & 0xff) << 8;
			j++;
		}
		j = i;
		if(s.length <= 0)
			break MISSING_BLOCK_LABEL_61;
		j = ((int) (s[s.length - 1]));
		j = i + (j & 0xff);
		return j;
	}

	private float getPdfStringWidth(PdfString pdfstring, boolean flag)
	{
		int i = 0;
	//    0    0:iconst_0        
	//    1    1:istore          5
		if(!flag) goto _L2; else goto _L1
	//    2    3:iload_2         
	//    3    4:ifeq            50
_L1:
		float f1;
		pdfstring = ((PdfString) (getWidthAndWordSpacing(pdfstring, flag)));
	//    4    7:aload_0         
	//    5    8:aload_1         
	//    6    9:iload_2         
	//    7   10:invokespecial   #120 <Method float[] getWidthAndWordSpacing(PdfString, boolean)>
	//    8   13:astore_1        
		f1 = (pdfstring[0] * gs.fontSize + gs.characterSpacing + pdfstring[1]) * gs.horizontalScaling;
	//    9   14:aload_1         
	//   10   15:iconst_0        
	//   11   16:faload          
	//   12   17:aload_0         
	//   13   18:getfield        #47  <Field GraphicsState gs>
	//   14   21:getfield        #124 <Field float GraphicsState.fontSize>
	//   15   24:fmul            
	//   16   25:aload_0         
	//   17   26:getfield        #47  <Field GraphicsState gs>
	//   18   29:getfield        #127 <Field float GraphicsState.characterSpacing>
	//   19   32:fadd            
	//   20   33:aload_1         
	//   21   34:iconst_1        
	//   22   35:faload          
	//   23   36:fadd            
	//   24   37:aload_0         
	//   25   38:getfield        #47  <Field GraphicsState gs>
	//   26   41:getfield        #130 <Field float GraphicsState.horizontalScaling>
	//   27   44:fmul            
	//   28   45:fstore          4
_L4:
		return f1;
	//   29   47:fload           4
	//   30   49:freturn         
_L2:
		float f = 0.0F;
	//   31   50:fconst_0        
	//   32   51:fstore_3        
		pdfstring = ((PdfString) (splitString(pdfstring)));
	//   33   52:aload_0         
	//   34   53:aload_1         
	//   35   54:invokespecial   #134 <Method PdfString[] splitString(PdfString)>
	//   36   57:astore_1        
		int j = pdfstring.length;
	//   37   58:aload_1         
	//   38   59:arraylength     
	//   39   60:istore          6
		do
		{
			f1 = f;
	//   40   62:fload_3         
	//   41   63:fstore          4
			if(i >= j)
				continue;
	//   42   65:iload           5
	//   43   67:iload           6
	//   44   69:icmpge          47
			f += getPdfStringWidth(((PdfString) (pdfstring[i])), true);
	//   45   72:fload_3         
	//   46   73:aload_0         
	//   47   74:aload_1         
	//   48   75:iload           5
	//   49   77:aaload          
	//   50   78:iconst_1        
	//   51   79:invokespecial   #136 <Method float getPdfStringWidth(PdfString, boolean)>
	//   52   82:fadd            
	//   53   83:fstore_3        
			i++;
	//   54   84:iload           5
	//   55   86:iconst_1        
	//   56   87:iadd            
	//   57   88:istore          5
		} while(true);
	//   58   90:goto            62
		if(true) goto _L4; else goto _L3
_L3:
	}

	private float getStringWidth(String s)
	{
		float f = 0.0F;
	//    0    0:fconst_0        
	//    1    1:fstore_2        
		int i = 0;
	//    2    2:iconst_0        
	//    3    3:istore          5
		while(i < s.length()) 
	//*   4    5:iload           5
	//*   5    7:aload_1         
	//*   6    8:invokevirtual   #142 <Method int String.length()>
	//*   7   11:icmpge          100
		{
			char c = s.charAt(i);
	//    8   14:aload_1         
	//    9   15:iload           5
	//   10   17:invokevirtual   #146 <Method char String.charAt(int)>
	//   11   20:istore          6
			float f2 = (float)gs.font.getWidth(((int) (c))) / 1000F;
	//   12   22:aload_0         
	//   13   23:getfield        #47  <Field GraphicsState gs>
	//   14   26:getfield        #58  <Field CMapAwareDocumentFont GraphicsState.font>
	//   15   29:iload           6
	//   16   31:invokevirtual   #150 <Method int CMapAwareDocumentFont.getWidth(int)>
	//   17   34:i2f             
	//   18   35:ldc1            #151 <Float 1000F>
	//   19   37:fdiv            
	//   20   38:fstore          4
			float f1;
			if(c == ' ')
	//*  21   40:iload           6
	//*  22   42:bipush          32
	//*  23   44:icmpne          95
				f1 = gs.wordSpacing;
	//   24   47:aload_0         
	//   25   48:getfield        #47  <Field GraphicsState gs>
	//   26   51:getfield        #154 <Field float GraphicsState.wordSpacing>
	//   27   54:fstore_3        
			else
	//*  28   55:fload_2         
	//*  29   56:aload_0         
	//*  30   57:getfield        #47  <Field GraphicsState gs>
	//*  31   60:getfield        #124 <Field float GraphicsState.fontSize>
	//*  32   63:fload           4
	//*  33   65:fmul            
	//*  34   66:aload_0         
	//*  35   67:getfield        #47  <Field GraphicsState gs>
	//*  36   70:getfield        #127 <Field float GraphicsState.characterSpacing>
	//*  37   73:fadd            
	//*  38   74:fload_3         
	//*  39   75:fadd            
	//*  40   76:aload_0         
	//*  41   77:getfield        #47  <Field GraphicsState gs>
	//*  42   80:getfield        #130 <Field float GraphicsState.horizontalScaling>
	//*  43   83:fmul            
	//*  44   84:fadd            
	//*  45   85:fstore_2        
	//*  46   86:iload           5
	//*  47   88:iconst_1        
	//*  48   89:iadd            
	//*  49   90:istore          5
	//*  50   92:goto            5
				f1 = 0.0F;
	//   51   95:fconst_0        
	//   52   96:fstore_3        
			f += (gs.fontSize * f2 + gs.characterSpacing + f1) * gs.horizontalScaling;
			i++;
		}
	//*  53   97:goto            55
		return f;
	//   54  100:fload_2         
	//   55  101:freturn         
	}

	private LineSegment getUnscaledBaselineWithOffset(float f)
	{
		String s = string.toUnicodeString();
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field PdfString string>
	//    2    4:invokevirtual   #160 <Method String PdfString.toUnicodeString()>
	//    3    7:astore          6
		float f2 = getUnscaledWidth();
	//    4    9:aload_0         
	//    5   10:invokevirtual   #163 <Method float getUnscaledWidth()>
	//    6   13:fstore_3        
		float f3 = gs.characterSpacing;
	//    7   14:aload_0         
	//    8   15:getfield        #47  <Field GraphicsState gs>
	//    9   18:getfield        #127 <Field float GraphicsState.characterSpacing>
	//   10   21:fstore          4
		float f1;
		float f4;
		if(s.length() > 0 && s.charAt(s.length() - 1) == ' ')
	//*  11   23:aload           6
	//*  12   25:invokevirtual   #142 <Method int String.length()>
	//*  13   28:ifle            101
	//*  14   31:aload           6
	//*  15   33:aload           6
	//*  16   35:invokevirtual   #142 <Method int String.length()>
	//*  17   38:iconst_1        
	//*  18   39:isub            
	//*  19   40:invokevirtual   #146 <Method char String.charAt(int)>
	//*  20   43:bipush          32
	//*  21   45:icmpne          101
			f1 = gs.wordSpacing;
	//   22   48:aload_0         
	//   23   49:getfield        #47  <Field GraphicsState gs>
	//   24   52:getfield        #154 <Field float GraphicsState.wordSpacing>
	//   25   55:fstore_2        
		else
	//*  26   56:aload_0         
	//*  27   57:getfield        #47  <Field GraphicsState gs>
	//*  28   60:getfield        #130 <Field float GraphicsState.horizontalScaling>
	//*  29   63:fstore          5
	//*  30   65:new             #75  <Class LineSegment>
	//*  31   68:dup             
	//*  32   69:new             #77  <Class Vector>
	//*  33   72:dup             
	//*  34   73:fconst_0        
	//*  35   74:fload_1         
	//*  36   75:fconst_1        
	//*  37   76:invokespecial   #80  <Method void Vector(float, float, float)>
	//*  38   79:new             #77  <Class Vector>
	//*  39   82:dup             
	//*  40   83:fload_3         
	//*  41   84:fload_2         
	//*  42   85:fload           4
	//*  43   87:fadd            
	//*  44   88:fload           5
	//*  45   90:fmul            
	//*  46   91:fsub            
	//*  47   92:fload_1         
	//*  48   93:fconst_1        
	//*  49   94:invokespecial   #80  <Method void Vector(float, float, float)>
	//*  50   97:invokespecial   #83  <Method void LineSegment(Vector, Vector)>
	//*  51  100:areturn         
			f1 = 0.0F;
	//   52  101:fconst_0        
	//   53  102:fstore_2        
		f4 = gs.horizontalScaling;
		return new LineSegment(new Vector(0.0F, f, 1.0F), new Vector(f2 - (f1 + f3) * f4, f, 1.0F));
	//*  54  103:goto            56
	}

	private float getUnscaledFontSpaceWidth()
	{
		char c = ' ';
	//    0    0:bipush          32
	//    1    2:istore_1        
		if(gs.font.getWidth(32) == 0)
	//*   2    3:aload_0         
	//*   3    4:getfield        #47  <Field GraphicsState gs>
	//*   4    7:getfield        #58  <Field CMapAwareDocumentFont GraphicsState.font>
	//*   5   10:bipush          32
	//*   6   12:invokevirtual   #150 <Method int CMapAwareDocumentFont.getWidth(int)>
	//*   7   15:ifne            22
			c = '\240';
	//    8   18:sipush          160
	//    9   21:istore_1        
		return getStringWidth(String.valueOf(c));
	//   10   22:aload_0         
	//   11   23:iload_1         
	//   12   24:invokestatic    #168 <Method String String.valueOf(char)>
	//   13   27:invokespecial   #170 <Method float getStringWidth(String)>
	//   14   30:freturn         
	}

	private float[] getWidthAndWordSpacing(PdfString pdfstring, boolean flag)
	{
		if(!flag)
	//*   0    0:iload_2         
	//*   1    1:ifne            12
			throw new UnsupportedOperationException();
	//    2    4:new             #172 <Class UnsupportedOperationException>
	//    3    7:dup             
	//    4    8:invokespecial   #173 <Method void UnsupportedOperationException()>
	//    5   11:athrow          
		pdfstring = ((PdfString) (decode(pdfstring)));
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:invokespecial   #175 <Method String decode(PdfString)>
	//    9   17:astore_1        
		float f1 = (float)((double)gs.font.getWidth(getCharCode(((String) (pdfstring)))) * fontMatrix[0]);
	//   10   18:aload_0         
	//   11   19:getfield        #47  <Field GraphicsState gs>
	//   12   22:getfield        #58  <Field CMapAwareDocumentFont GraphicsState.font>
	//   13   25:aload_0         
	//   14   26:aload_1         
	//   15   27:invokespecial   #177 <Method int getCharCode(String)>
	//   16   30:invokevirtual   #150 <Method int CMapAwareDocumentFont.getWidth(int)>
	//   17   33:i2d             
	//   18   34:aload_0         
	//   19   35:getfield        #30  <Field double[] fontMatrix>
	//   20   38:iconst_0        
	//   21   39:daload          
	//   22   40:dmul            
	//   23   41:d2f             
	//   24   42:fstore          4
		float f;
		if(((String) (pdfstring)).equals(" "))
	//*  25   44:aload_1         
	//*  26   45:ldc1            #179 <String " ">
	//*  27   47:invokevirtual   #183 <Method boolean String.equals(Object)>
	//*  28   50:ifeq            74
			f = gs.wordSpacing;
	//   29   53:aload_0         
	//   30   54:getfield        #47  <Field GraphicsState gs>
	//   31   57:getfield        #154 <Field float GraphicsState.wordSpacing>
	//   32   60:fstore_3        
		else
	//*  33   61:iconst_2        
	//*  34   62:newarray        float[]
	//*  35   64:dup             
	//*  36   65:iconst_0        
	//*  37   66:fload           4
	//*  38   68:fastore         
	//*  39   69:dup             
	//*  40   70:iconst_1        
	//*  41   71:fload_3         
	//*  42   72:fastore         
	//*  43   73:areturn         
			f = 0.0F;
	//   44   74:fconst_0        
	//   45   75:fstore_3        
		return (new float[] {
			f1, f
		});
	//*  46   76:goto            61
	}

	private PdfString[] splitString(PdfString pdfstring)
	{
		ArrayList arraylist = new ArrayList();
	//    0    0:new             #49  <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #184 <Method void ArrayList()>
	//    3    7:astore          6
		String s = pdfstring.toString();
	//    4    9:aload_1         
	//    5   10:invokevirtual   #187 <Method String PdfString.toString()>
	//    6   13:astore          7
		int j;
		for(int i = 0; i < s.length(); i = j + 1)
	//*   7   15:iconst_0        
	//*   8   16:istore_2        
	//*   9   17:iload_2         
	//*  10   18:aload           7
	//*  11   20:invokevirtual   #142 <Method int String.length()>
	//*  12   23:icmpge          126
		{
			PdfString pdfstring2 = new PdfString(s.substring(i, i + 1), pdfstring.getEncoding());
	//   13   26:new             #96  <Class PdfString>
	//   14   29:dup             
	//   15   30:aload           7
	//   16   32:iload_2         
	//   17   33:iload_2         
	//   18   34:iconst_1        
	//   19   35:iadd            
	//   20   36:invokevirtual   #191 <Method String String.substring(int, int)>
	//   21   39:aload_1         
	//   22   40:invokevirtual   #194 <Method String PdfString.getEncoding()>
	//   23   43:invokespecial   #197 <Method void PdfString(String, String)>
	//   24   46:astore          5
			j = i;
	//   25   48:iload_2         
	//   26   49:istore_3        
			PdfString pdfstring1 = pdfstring2;
	//   27   50:aload           5
	//   28   52:astore          4
			if(decode(pdfstring2).length() == 0)
	//*  29   54:aload_0         
	//*  30   55:aload           5
	//*  31   57:invokespecial   #175 <Method String decode(PdfString)>
	//*  32   60:invokevirtual   #142 <Method int String.length()>
	//*  33   63:ifne            109
			{
				j = i;
	//   34   66:iload_2         
	//   35   67:istore_3        
				pdfstring1 = pdfstring2;
	//   36   68:aload           5
	//   37   70:astore          4
				if(i < s.length() - 1)
	//*  38   72:iload_2         
	//*  39   73:aload           7
	//*  40   75:invokevirtual   #142 <Method int String.length()>
	//*  41   78:iconst_1        
	//*  42   79:isub            
	//*  43   80:icmpge          109
				{
					pdfstring1 = new PdfString(s.substring(i, i + 2), pdfstring.getEncoding());
	//   44   83:new             #96  <Class PdfString>
	//   45   86:dup             
	//   46   87:aload           7
	//   47   89:iload_2         
	//   48   90:iload_2         
	//   49   91:iconst_2        
	//   50   92:iadd            
	//   51   93:invokevirtual   #191 <Method String String.substring(int, int)>
	//   52   96:aload_1         
	//   53   97:invokevirtual   #194 <Method String PdfString.getEncoding()>
	//   54  100:invokespecial   #197 <Method void PdfString(String, String)>
	//   55  103:astore          4
					j = i + 1;
	//   56  105:iload_2         
	//   57  106:iconst_1        
	//   58  107:iadd            
	//   59  108:istore_3        
				}
			}
			((List) (arraylist)).add(((Object) (pdfstring1)));
	//   60  109:aload           6
	//   61  111:aload           4
	//   62  113:invokeinterface #202 <Method boolean List.add(Object)>
	//   63  118:pop             
		}

	//   64  119:iload_3         
	//   65  120:iconst_1        
	//   66  121:iadd            
	//   67  122:istore_2        
	//*  68  123:goto            17
		return (PdfString[])((List) (arraylist)).toArray(((Object []) (new PdfString[((List) (arraylist)).size()])));
	//   69  126:aload           6
	//   70  128:aload           6
	//   71  130:invokeinterface #205 <Method int List.size()>
	//   72  135:anewarray       PdfString[]
	//   73  138:invokeinterface #209 <Method Object[] List.toArray(Object[])>
	//   74  143:checkcast       #211 <Class PdfString[]>
	//   75  146:areturn         
	}

	public LineSegment getAscentLine()
	{
		float f = gs.getFont().getFontDescriptor(1, gs.getFontSize());
	//    0    0:aload_0         
	//    1    1:getfield        #47  <Field GraphicsState gs>
	//    2    4:invokevirtual   #217 <Method CMapAwareDocumentFont GraphicsState.getFont()>
	//    3    7:iconst_1        
	//    4    8:aload_0         
	//    5    9:getfield        #47  <Field GraphicsState gs>
	//    6   12:invokevirtual   #220 <Method float GraphicsState.getFontSize()>
	//    7   15:invokevirtual   #224 <Method float CMapAwareDocumentFont.getFontDescriptor(int, float)>
	//    8   18:fstore_1        
		return getUnscaledBaselineWithOffset(gs.rise + f).transformBy(textToUserSpaceTransformMatrix);
	//    9   19:aload_0         
	//   10   20:aload_0         
	//   11   21:getfield        #47  <Field GraphicsState gs>
	//   12   24:getfield        #227 <Field float GraphicsState.rise>
	//   13   27:fload_1         
	//   14   28:fadd            
	//   15   29:invokespecial   #229 <Method LineSegment getUnscaledBaselineWithOffset(float)>
	//   16   32:aload_0         
	//   17   33:getfield        #45  <Field Matrix textToUserSpaceTransformMatrix>
	//   18   36:invokevirtual   #87  <Method LineSegment LineSegment.transformBy(Matrix)>
	//   19   39:areturn         
	}

	public LineSegment getBaseline()
	{
		return getUnscaledBaselineWithOffset(0.0F + gs.rise).transformBy(textToUserSpaceTransformMatrix);
	//    0    0:aload_0         
	//    1    1:fconst_0        
	//    2    2:aload_0         
	//    3    3:getfield        #47  <Field GraphicsState gs>
	//    4    6:getfield        #227 <Field float GraphicsState.rise>
	//    5    9:fadd            
	//    6   10:invokespecial   #229 <Method LineSegment getUnscaledBaselineWithOffset(float)>
	//    7   13:aload_0         
	//    8   14:getfield        #45  <Field Matrix textToUserSpaceTransformMatrix>
	//    9   17:invokevirtual   #87  <Method LineSegment LineSegment.transformBy(Matrix)>
	//   10   20:areturn         
	}

	public List getCharacterRenderInfos()
	{
		ArrayList arraylist = new ArrayList(string.length());
	//    0    0:new             #49  <Class ArrayList>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #32  <Field PdfString string>
	//    4    8:invokevirtual   #233 <Method int PdfString.length()>
	//    5   11:invokespecial   #236 <Method void ArrayList(int)>
	//    6   14:astore_3        
		PdfString apdfstring[] = splitString(string);
	//    7   15:aload_0         
	//    8   16:aload_0         
	//    9   17:getfield        #32  <Field PdfString string>
	//   10   20:invokespecial   #134 <Method PdfString[] splitString(PdfString)>
	//   11   23:astore          4
		float f = 0.0F;
	//   12   25:fconst_0        
	//   13   26:fstore_1        
		for(int i = 0; i < apdfstring.length; i++)
	//*  14   27:iconst_0        
	//*  15   28:istore_2        
	//*  16   29:iload_2         
	//*  17   30:aload           4
	//*  18   32:arraylength     
	//*  19   33:icmpge          110
		{
			float af[] = getWidthAndWordSpacing(apdfstring[i], true);
	//   20   36:aload_0         
	//   21   37:aload           4
	//   22   39:iload_2         
	//   23   40:aaload          
	//   24   41:iconst_1        
	//   25   42:invokespecial   #120 <Method float[] getWidthAndWordSpacing(PdfString, boolean)>
	//   26   45:astore          5
			((List) (arraylist)).add(((Object) (new TextRenderInfo(this, apdfstring[i], f))));
	//   27   47:aload_3         
	//   28   48:new             #2   <Class TextRenderInfo>
	//   29   51:dup             
	//   30   52:aload_0         
	//   31   53:aload           4
	//   32   55:iload_2         
	//   33   56:aaload          
	//   34   57:fload_1         
	//   35   58:invokespecial   #238 <Method void TextRenderInfo(TextRenderInfo, PdfString, float)>
	//   36   61:invokeinterface #202 <Method boolean List.add(Object)>
	//   37   66:pop             
			f += (af[0] * gs.fontSize + gs.characterSpacing + af[1]) * gs.horizontalScaling;
	//   38   67:fload_1         
	//   39   68:aload           5
	//   40   70:iconst_0        
	//   41   71:faload          
	//   42   72:aload_0         
	//   43   73:getfield        #47  <Field GraphicsState gs>
	//   44   76:getfield        #124 <Field float GraphicsState.fontSize>
	//   45   79:fmul            
	//   46   80:aload_0         
	//   47   81:getfield        #47  <Field GraphicsState gs>
	//   48   84:getfield        #127 <Field float GraphicsState.characterSpacing>
	//   49   87:fadd            
	//   50   88:aload           5
	//   51   90:iconst_1        
	//   52   91:faload          
	//   53   92:fadd            
	//   54   93:aload_0         
	//   55   94:getfield        #47  <Field GraphicsState gs>
	//   56   97:getfield        #130 <Field float GraphicsState.horizontalScaling>
	//   57  100:fmul            
	//   58  101:fadd            
	//   59  102:fstore_1        
		}

	//   60  103:iload_2         
	//   61  104:iconst_1        
	//   62  105:iadd            
	//   63  106:istore_2        
	//*  64  107:goto            29
		for(Iterator iterator = ((List) (arraylist)).iterator(); iterator.hasNext(); ((TextRenderInfo)iterator.next()).getUnscaledWidth());
	//   65  110:aload_3         
	//   66  111:invokeinterface #242 <Method Iterator List.iterator()>
	//   67  116:astore          4
	//   68  118:aload           4
	//   69  120:invokeinterface #248 <Method boolean Iterator.hasNext()>
	//   70  125:ifeq            145
	//   71  128:aload           4
	//   72  130:invokeinterface #252 <Method Object Iterator.next()>
	//   73  135:checkcast       #2   <Class TextRenderInfo>
	//   74  138:invokevirtual   #163 <Method float getUnscaledWidth()>
	//   75  141:pop             
	//*  76  142:goto            118
		return ((List) (arraylist));
	//   77  145:aload_3         
	//   78  146:areturn         
	}

	public LineSegment getDescentLine()
	{
		float f = gs.getFont().getFontDescriptor(3, gs.getFontSize());
	//    0    0:aload_0         
	//    1    1:getfield        #47  <Field GraphicsState gs>
	//    2    4:invokevirtual   #217 <Method CMapAwareDocumentFont GraphicsState.getFont()>
	//    3    7:iconst_3        
	//    4    8:aload_0         
	//    5    9:getfield        #47  <Field GraphicsState gs>
	//    6   12:invokevirtual   #220 <Method float GraphicsState.getFontSize()>
	//    7   15:invokevirtual   #224 <Method float CMapAwareDocumentFont.getFontDescriptor(int, float)>
	//    8   18:fstore_1        
		return getUnscaledBaselineWithOffset(gs.rise + f).transformBy(textToUserSpaceTransformMatrix);
	//    9   19:aload_0         
	//   10   20:aload_0         
	//   11   21:getfield        #47  <Field GraphicsState gs>
	//   12   24:getfield        #227 <Field float GraphicsState.rise>
	//   13   27:fload_1         
	//   14   28:fadd            
	//   15   29:invokespecial   #229 <Method LineSegment getUnscaledBaselineWithOffset(float)>
	//   16   32:aload_0         
	//   17   33:getfield        #45  <Field Matrix textToUserSpaceTransformMatrix>
	//   18   36:invokevirtual   #87  <Method LineSegment LineSegment.transformBy(Matrix)>
	//   19   39:areturn         
	}

	public BaseColor getFillColor()
	{
		return gs.fillColor;
	//    0    0:aload_0         
	//    1    1:getfield        #47  <Field GraphicsState gs>
	//    2    4:getfield        #260 <Field BaseColor GraphicsState.fillColor>
	//    3    7:areturn         
	}

	public DocumentFont getFont()
	{
		return ((DocumentFont) (gs.getFont()));
	//    0    0:aload_0         
	//    1    1:getfield        #47  <Field GraphicsState gs>
	//    2    4:invokevirtual   #217 <Method CMapAwareDocumentFont GraphicsState.getFont()>
	//    3    7:areturn         
	}

	public Integer getMcid()
	{
		if(markedContentInfos instanceof ArrayList)
	//*   0    0:aload_0         
	//*   1    1:getfield        #54  <Field Collection markedContentInfos>
	//*   2    4:instanceof      #49  <Class ArrayList>
	//*   3    7:ifeq            65
		{
			Object obj = ((Object) ((ArrayList)markedContentInfos));
	//    4   10:aload_0         
	//    5   11:getfield        #54  <Field Collection markedContentInfos>
	//    6   14:checkcast       #49  <Class ArrayList>
	//    7   17:astore_1        
			if(((ArrayList) (obj)).size() > 0)
	//*   8   18:aload_1         
	//*   9   19:invokevirtual   #264 <Method int ArrayList.size()>
	//*  10   22:ifle            58
				obj = ((Object) ((MarkedContentInfo)((ArrayList) (obj)).get(((ArrayList) (obj)).size() - 1)));
	//   11   25:aload_1         
	//   12   26:aload_1         
	//   13   27:invokevirtual   #264 <Method int ArrayList.size()>
	//   14   30:iconst_1        
	//   15   31:isub            
	//   16   32:invokevirtual   #268 <Method Object ArrayList.get(int)>
	//   17   35:checkcast       #270 <Class MarkedContentInfo>
	//   18   38:astore_1        
			else
	//*  19   39:aload_1         
	//*  20   40:ifnull          63
	//*  21   43:aload_1         
	//*  22   44:invokevirtual   #273 <Method boolean MarkedContentInfo.hasMcid()>
	//*  23   47:ifeq            63
	//*  24   50:aload_1         
	//*  25   51:invokevirtual   #275 <Method int MarkedContentInfo.getMcid()>
	//*  26   54:invokestatic    #280 <Method Integer Integer.valueOf(int)>
	//*  27   57:areturn         
				obj = null;
	//   28   58:aconst_null     
	//   29   59:astore_1        
			if(obj != null && ((MarkedContentInfo) (obj)).hasMcid())
				return Integer.valueOf(((MarkedContentInfo) (obj)).getMcid());
			else
	//*  30   60:goto            39
				return null;
	//   31   63:aconst_null     
	//   32   64:areturn         
		} else
		{
			return null;
	//   33   65:aconst_null     
	//   34   66:areturn         
		}
	}

	public PdfString getPdfString()
	{
		return string;
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field PdfString string>
	//    2    4:areturn         
	}

	public float getRise()
	{
		if(gs.rise == 0.0F)
	//*   0    0:aload_0         
	//*   1    1:getfield        #47  <Field GraphicsState gs>
	//*   2    4:getfield        #227 <Field float GraphicsState.rise>
	//*   3    7:fconst_0        
	//*   4    8:fcmpl           
	//*   5    9:ifne            14
			return 0.0F;
	//    6   12:fconst_0        
	//    7   13:freturn         
		else
			return convertHeightFromTextSpaceToUserSpace(gs.rise);
	//    8   14:aload_0         
	//    9   15:aload_0         
	//   10   16:getfield        #47  <Field GraphicsState gs>
	//   11   19:getfield        #227 <Field float GraphicsState.rise>
	//   12   22:invokespecial   #285 <Method float convertHeightFromTextSpaceToUserSpace(float)>
	//   13   25:freturn         
	}

	public float getSingleSpaceWidth()
	{
		return convertWidthFromTextSpaceToUserSpace(getUnscaledFontSpaceWidth());
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokespecial   #288 <Method float getUnscaledFontSpaceWidth()>
	//    3    5:invokespecial   #290 <Method float convertWidthFromTextSpaceToUserSpace(float)>
	//    4    8:freturn         
	}

	public BaseColor getStrokeColor()
	{
		return gs.strokeColor;
	//    0    0:aload_0         
	//    1    1:getfield        #47  <Field GraphicsState gs>
	//    2    4:getfield        #294 <Field BaseColor GraphicsState.strokeColor>
	//    3    7:areturn         
	}

	public String getText()
	{
		if(text == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #26  <Field String text>
	//*   2    4:ifnonnull       19
			text = decode(string);
	//    3    7:aload_0         
	//    4    8:aload_0         
	//    5    9:aload_0         
	//    6   10:getfield        #32  <Field PdfString string>
	//    7   13:invokespecial   #175 <Method String decode(PdfString)>
	//    8   16:putfield        #26  <Field String text>
		return text;
	//    9   19:aload_0         
	//   10   20:getfield        #26  <Field String text>
	//   11   23:areturn         
	}

	public int getTextRenderMode()
	{
		return gs.renderMode;
	//    0    0:aload_0         
	//    1    1:getfield        #47  <Field GraphicsState gs>
	//    2    4:getfield        #300 <Field int GraphicsState.renderMode>
	//    3    7:ireturn         
	}

	public LineSegment getUnscaledBaseline()
	{
		return getUnscaledBaselineWithOffset(0.0F + gs.rise);
	//    0    0:aload_0         
	//    1    1:fconst_0        
	//    2    2:aload_0         
	//    3    3:getfield        #47  <Field GraphicsState gs>
	//    4    6:getfield        #227 <Field float GraphicsState.rise>
	//    5    9:fadd            
	//    6   10:invokespecial   #229 <Method LineSegment getUnscaledBaselineWithOffset(float)>
	//    7   13:areturn         
	}

	float getUnscaledWidth()
	{
		if(unscaledWidth == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #28  <Field Float unscaledWidth>
	//*   2    4:ifnonnull       23
			unscaledWidth = Float.valueOf(getPdfStringWidth(string, false));
	//    3    7:aload_0         
	//    4    8:aload_0         
	//    5    9:aload_0         
	//    6   10:getfield        #32  <Field PdfString string>
	//    7   13:iconst_0        
	//    8   14:invokespecial   #136 <Method float getPdfStringWidth(PdfString, boolean)>
	//    9   17:invokestatic    #306 <Method Float Float.valueOf(float)>
	//   10   20:putfield        #28  <Field Float unscaledWidth>
		return unscaledWidth.floatValue();
	//   11   23:aload_0         
	//   12   24:getfield        #28  <Field Float unscaledWidth>
	//   13   27:invokevirtual   #309 <Method float Float.floatValue()>
	//   14   30:freturn         
	}

	public boolean hasMcid(int i)
	{
		return hasMcid(i, false);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iconst_0        
	//    3    3:invokevirtual   #313 <Method boolean hasMcid(int, boolean)>
	//    4    6:ireturn         
	}

	public boolean hasMcid(int i, boolean flag)
	{
label0:
		{
			if(flag)
	//*   0    0:iload_2         
	//*   1    1:ifeq            37
			{
				if(markedContentInfos instanceof ArrayList)
	//*   2    4:aload_0         
	//*   3    5:getfield        #54  <Field Collection markedContentInfos>
	//*   4    8:instanceof      #49  <Class ArrayList>
	//*   5   11:ifeq            86
				{
					Integer integer = getMcid();
	//    6   14:aload_0         
	//    7   15:invokevirtual   #315 <Method Integer getMcid()>
	//    8   18:astore_3        
					if(integer != null)
	//*   9   19:aload_3         
	//*  10   20:ifnull          35
						return integer.intValue() == i;
	//   11   23:aload_3         
	//   12   24:invokevirtual   #318 <Method int Integer.intValue()>
	//   13   27:iload_1         
	//   14   28:icmpne          33
	//   15   31:iconst_1        
	//   16   32:ireturn         
	//   17   33:iconst_0        
	//   18   34:ireturn         
					else
						return false;
	//   19   35:iconst_0        
	//   20   36:ireturn         
				}
				break label0;
			}
			Iterator iterator = markedContentInfos.iterator();
	//   21   37:aload_0         
	//   22   38:getfield        #54  <Field Collection markedContentInfos>
	//   23   41:invokeinterface #321 <Method Iterator Collection.iterator()>
	//   24   46:astore_3        
			MarkedContentInfo markedcontentinfo;
			do
			{
				if(!iterator.hasNext())
					break label0;
	//   25   47:aload_3         
	//   26   48:invokeinterface #248 <Method boolean Iterator.hasNext()>
	//   27   53:ifeq            86
				markedcontentinfo = (MarkedContentInfo)iterator.next();
	//   28   56:aload_3         
	//   29   57:invokeinterface #252 <Method Object Iterator.next()>
	//   30   62:checkcast       #270 <Class MarkedContentInfo>
	//   31   65:astore          4
			} while(!markedcontentinfo.hasMcid() || markedcontentinfo.getMcid() != i);
	//   32   67:aload           4
	//   33   69:invokevirtual   #273 <Method boolean MarkedContentInfo.hasMcid()>
	//   34   72:ifeq            47
	//   35   75:aload           4
	//   36   77:invokevirtual   #275 <Method int MarkedContentInfo.getMcid()>
	//   37   80:iload_1         
	//   38   81:icmpne          47
			return true;
	//   39   84:iconst_1        
	//   40   85:ireturn         
		}
		return false;
	//   41   86:iconst_0        
	//   42   87:ireturn         
	}

	private double fontMatrix[];
	private final GraphicsState gs;
	private final Collection markedContentInfos;
	private final PdfString string;
	private String text;
	private final Matrix textToUserSpaceTransformMatrix;
	private Float unscaledWidth;
}

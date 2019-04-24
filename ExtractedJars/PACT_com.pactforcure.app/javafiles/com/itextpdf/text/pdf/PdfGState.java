// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf;

import java.io.IOException;
import java.io.OutputStream;

// Referenced classes of package com.itextpdf.text.pdf:
//			PdfDictionary, PdfName, PdfBoolean, PdfNumber, 
//			PdfWriter

public class PdfGState extends PdfDictionary
{

	public PdfGState()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #81  <Method void PdfDictionary()>
	//    2    4:return          
	}

	public void setAlphaIsShape(boolean flag)
	{
		PdfName pdfname = PdfName.AIS;
	//    0    0:getstatic       #86  <Field PdfName PdfName.AIS>
	//    1    3:astore_3        
		PdfBoolean pdfboolean;
		if(flag)
	//*   2    4:iload_1         
	//*   3    5:ifeq            19
			pdfboolean = PdfBoolean.PDFTRUE;
	//    4    8:getstatic       #92  <Field PdfBoolean PdfBoolean.PDFTRUE>
	//    5   11:astore_2        
		else
	//*   6   12:aload_0         
	//*   7   13:aload_3         
	//*   8   14:aload_2         
	//*   9   15:invokevirtual   #96  <Method void put(PdfName, PdfObject)>
	//*  10   18:return          
			pdfboolean = PdfBoolean.PDFFALSE;
	//   11   19:getstatic       #99  <Field PdfBoolean PdfBoolean.PDFFALSE>
	//   12   22:astore_2        
		put(pdfname, ((PdfObject) (pdfboolean)));
	//*  13   23:goto            12
	}

	public void setBlendMode(PdfName pdfname)
	{
		put(PdfName.BM, ((PdfObject) (pdfname)));
	//    0    0:aload_0         
	//    1    1:getstatic       #104 <Field PdfName PdfName.BM>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #96  <Method void put(PdfName, PdfObject)>
	//    4    8:return          
	}

	public void setFillOpacity(float f)
	{
		put(PdfName.ca, ((PdfObject) (new PdfNumber(f))));
	//    0    0:aload_0         
	//    1    1:getstatic       #109 <Field PdfName PdfName.ca>
	//    2    4:new             #111 <Class PdfNumber>
	//    3    7:dup             
	//    4    8:fload_1         
	//    5    9:invokespecial   #113 <Method void PdfNumber(float)>
	//    6   12:invokevirtual   #96  <Method void put(PdfName, PdfObject)>
	//    7   15:return          
	}

	public void setOverPrintMode(int i)
	{
		PdfName pdfname = PdfName.OPM;
	//    0    0:getstatic       #118 <Field PdfName PdfName.OPM>
	//    1    3:astore_2        
		if(i == 0)
	//*   2    4:iload_1         
	//*   3    5:ifne            24
			i = 0;
	//    4    8:iconst_0        
	//    5    9:istore_1        
		else
	//*   6   10:aload_0         
	//*   7   11:aload_2         
	//*   8   12:new             #111 <Class PdfNumber>
	//*   9   15:dup             
	//*  10   16:iload_1         
	//*  11   17:invokespecial   #120 <Method void PdfNumber(int)>
	//*  12   20:invokevirtual   #96  <Method void put(PdfName, PdfObject)>
	//*  13   23:return          
			i = 1;
	//   14   24:iconst_1        
	//   15   25:istore_1        
		put(pdfname, ((PdfObject) (new PdfNumber(i))));
	//*  16   26:goto            10
	}

	public void setOverPrintNonStroking(boolean flag)
	{
		PdfName pdfname = PdfName.op;
	//    0    0:getstatic       #124 <Field PdfName PdfName.op>
	//    1    3:astore_3        
		PdfBoolean pdfboolean;
		if(flag)
	//*   2    4:iload_1         
	//*   3    5:ifeq            19
			pdfboolean = PdfBoolean.PDFTRUE;
	//    4    8:getstatic       #92  <Field PdfBoolean PdfBoolean.PDFTRUE>
	//    5   11:astore_2        
		else
	//*   6   12:aload_0         
	//*   7   13:aload_3         
	//*   8   14:aload_2         
	//*   9   15:invokevirtual   #96  <Method void put(PdfName, PdfObject)>
	//*  10   18:return          
			pdfboolean = PdfBoolean.PDFFALSE;
	//   11   19:getstatic       #99  <Field PdfBoolean PdfBoolean.PDFFALSE>
	//   12   22:astore_2        
		put(pdfname, ((PdfObject) (pdfboolean)));
	//*  13   23:goto            12
	}

	public void setOverPrintStroking(boolean flag)
	{
		PdfName pdfname = PdfName.OP;
	//    0    0:getstatic       #128 <Field PdfName PdfName.OP>
	//    1    3:astore_3        
		PdfBoolean pdfboolean;
		if(flag)
	//*   2    4:iload_1         
	//*   3    5:ifeq            19
			pdfboolean = PdfBoolean.PDFTRUE;
	//    4    8:getstatic       #92  <Field PdfBoolean PdfBoolean.PDFTRUE>
	//    5   11:astore_2        
		else
	//*   6   12:aload_0         
	//*   7   13:aload_3         
	//*   8   14:aload_2         
	//*   9   15:invokevirtual   #96  <Method void put(PdfName, PdfObject)>
	//*  10   18:return          
			pdfboolean = PdfBoolean.PDFFALSE;
	//   11   19:getstatic       #99  <Field PdfBoolean PdfBoolean.PDFFALSE>
	//   12   22:astore_2        
		put(pdfname, ((PdfObject) (pdfboolean)));
	//*  13   23:goto            12
	}

	public void setRenderingIntent(PdfName pdfname)
	{
		put(PdfName.RI, ((PdfObject) (pdfname)));
	//    0    0:aload_0         
	//    1    1:getstatic       #132 <Field PdfName PdfName.RI>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #96  <Method void put(PdfName, PdfObject)>
	//    4    8:return          
	}

	public void setStrokeOpacity(float f)
	{
		put(PdfName.CA, ((PdfObject) (new PdfNumber(f))));
	//    0    0:aload_0         
	//    1    1:getstatic       #136 <Field PdfName PdfName.CA>
	//    2    4:new             #111 <Class PdfNumber>
	//    3    7:dup             
	//    4    8:fload_1         
	//    5    9:invokespecial   #113 <Method void PdfNumber(float)>
	//    6   12:invokevirtual   #96  <Method void put(PdfName, PdfObject)>
	//    7   15:return          
	}

	public void setTextKnockout(boolean flag)
	{
		PdfName pdfname = PdfName.TK;
	//    0    0:getstatic       #140 <Field PdfName PdfName.TK>
	//    1    3:astore_3        
		PdfBoolean pdfboolean;
		if(flag)
	//*   2    4:iload_1         
	//*   3    5:ifeq            19
			pdfboolean = PdfBoolean.PDFTRUE;
	//    4    8:getstatic       #92  <Field PdfBoolean PdfBoolean.PDFTRUE>
	//    5   11:astore_2        
		else
	//*   6   12:aload_0         
	//*   7   13:aload_3         
	//*   8   14:aload_2         
	//*   9   15:invokevirtual   #96  <Method void put(PdfName, PdfObject)>
	//*  10   18:return          
			pdfboolean = PdfBoolean.PDFFALSE;
	//   11   19:getstatic       #99  <Field PdfBoolean PdfBoolean.PDFFALSE>
	//   12   22:astore_2        
		put(pdfname, ((PdfObject) (pdfboolean)));
	//*  13   23:goto            12
	}

	public void toPdf(PdfWriter pdfwriter, OutputStream outputstream)
		throws IOException
	{
		PdfWriter.checkPdfIsoConformance(pdfwriter, 6, ((Object) (this)));
	//    0    0:aload_1         
	//    1    1:bipush          6
	//    2    3:aload_0         
	//    3    4:invokestatic    #150 <Method void PdfWriter.checkPdfIsoConformance(PdfWriter, int, Object)>
		super.toPdf(pdfwriter, outputstream);
	//    4    7:aload_0         
	//    5    8:aload_1         
	//    6    9:aload_2         
	//    7   10:invokespecial   #152 <Method void PdfDictionary.toPdf(PdfWriter, OutputStream)>
	//    8   13:return          
	}

	public static final PdfName BM_COLORBURN = new PdfName("ColorBurn");
	public static final PdfName BM_COLORDODGE = new PdfName("ColorDodge");
	public static final PdfName BM_COMPATIBLE = new PdfName("Compatible");
	public static final PdfName BM_DARKEN = new PdfName("Darken");
	public static final PdfName BM_DIFFERENCE = new PdfName("Difference");
	public static final PdfName BM_EXCLUSION = new PdfName("Exclusion");
	public static final PdfName BM_HARDLIGHT = new PdfName("HardLight");
	public static final PdfName BM_LIGHTEN = new PdfName("Lighten");
	public static final PdfName BM_MULTIPLY = new PdfName("Multiply");
	public static final PdfName BM_NORMAL = new PdfName("Normal");
	public static final PdfName BM_OVERLAY = new PdfName("Overlay");
	public static final PdfName BM_SCREEN = new PdfName("Screen");
	public static final PdfName BM_SOFTLIGHT = new PdfName("SoftLight");

	static 
	{
	//    0    0:new             #22  <Class PdfName>
	//    1    3:dup             
	//    2    4:ldc1            #24  <String "Normal">
	//    3    6:invokespecial   #28  <Method void PdfName(String)>
	//    4    9:putstatic       #30  <Field PdfName BM_NORMAL>
	//    5   12:new             #22  <Class PdfName>
	//    6   15:dup             
	//    7   16:ldc1            #32  <String "Compatible">
	//    8   18:invokespecial   #28  <Method void PdfName(String)>
	//    9   21:putstatic       #34  <Field PdfName BM_COMPATIBLE>
	//   10   24:new             #22  <Class PdfName>
	//   11   27:dup             
	//   12   28:ldc1            #36  <String "Multiply">
	//   13   30:invokespecial   #28  <Method void PdfName(String)>
	//   14   33:putstatic       #38  <Field PdfName BM_MULTIPLY>
	//   15   36:new             #22  <Class PdfName>
	//   16   39:dup             
	//   17   40:ldc1            #40  <String "Screen">
	//   18   42:invokespecial   #28  <Method void PdfName(String)>
	//   19   45:putstatic       #42  <Field PdfName BM_SCREEN>
	//   20   48:new             #22  <Class PdfName>
	//   21   51:dup             
	//   22   52:ldc1            #44  <String "Overlay">
	//   23   54:invokespecial   #28  <Method void PdfName(String)>
	//   24   57:putstatic       #46  <Field PdfName BM_OVERLAY>
	//   25   60:new             #22  <Class PdfName>
	//   26   63:dup             
	//   27   64:ldc1            #48  <String "Darken">
	//   28   66:invokespecial   #28  <Method void PdfName(String)>
	//   29   69:putstatic       #50  <Field PdfName BM_DARKEN>
	//   30   72:new             #22  <Class PdfName>
	//   31   75:dup             
	//   32   76:ldc1            #52  <String "Lighten">
	//   33   78:invokespecial   #28  <Method void PdfName(String)>
	//   34   81:putstatic       #54  <Field PdfName BM_LIGHTEN>
	//   35   84:new             #22  <Class PdfName>
	//   36   87:dup             
	//   37   88:ldc1            #56  <String "ColorDodge">
	//   38   90:invokespecial   #28  <Method void PdfName(String)>
	//   39   93:putstatic       #58  <Field PdfName BM_COLORDODGE>
	//   40   96:new             #22  <Class PdfName>
	//   41   99:dup             
	//   42  100:ldc1            #60  <String "ColorBurn">
	//   43  102:invokespecial   #28  <Method void PdfName(String)>
	//   44  105:putstatic       #62  <Field PdfName BM_COLORBURN>
	//   45  108:new             #22  <Class PdfName>
	//   46  111:dup             
	//   47  112:ldc1            #64  <String "HardLight">
	//   48  114:invokespecial   #28  <Method void PdfName(String)>
	//   49  117:putstatic       #66  <Field PdfName BM_HARDLIGHT>
	//   50  120:new             #22  <Class PdfName>
	//   51  123:dup             
	//   52  124:ldc1            #68  <String "SoftLight">
	//   53  126:invokespecial   #28  <Method void PdfName(String)>
	//   54  129:putstatic       #70  <Field PdfName BM_SOFTLIGHT>
	//   55  132:new             #22  <Class PdfName>
	//   56  135:dup             
	//   57  136:ldc1            #72  <String "Difference">
	//   58  138:invokespecial   #28  <Method void PdfName(String)>
	//   59  141:putstatic       #74  <Field PdfName BM_DIFFERENCE>
	//   60  144:new             #22  <Class PdfName>
	//   61  147:dup             
	//   62  148:ldc1            #76  <String "Exclusion">
	//   63  150:invokespecial   #28  <Method void PdfName(String)>
	//   64  153:putstatic       #78  <Field PdfName BM_EXCLUSION>
	//*  65  156:return          
	}
}

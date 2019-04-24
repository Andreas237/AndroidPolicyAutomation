// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf;

import com.itextpdf.awt.geom.AffineTransform;
import com.itextpdf.text.BaseColor;

// Referenced classes of package com.itextpdf.text.pdf:
//			PdfContentByte, GrayColor, ColorDetails, PdfObject, 
//			FontDetails

public static class PdfContentByte$GraphicState
{

	void copyParameters(PdfContentByte$GraphicState pdfcontentbyte$graphicstate)
	{
		fontDetails = pdfcontentbyte$graphicstate.fontDetails;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:getfield        #85  <Field FontDetails fontDetails>
	//    3    5:putfield        #85  <Field FontDetails fontDetails>
		colorDetails = pdfcontentbyte$graphicstate.colorDetails;
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:getfield        #87  <Field ColorDetails colorDetails>
	//    7   13:putfield        #87  <Field ColorDetails colorDetails>
		size = pdfcontentbyte$graphicstate.size;
	//    8   16:aload_0         
	//    9   17:aload_1         
	//   10   18:getfield        #89  <Field float size>
	//   11   21:putfield        #89  <Field float size>
		xTLM = pdfcontentbyte$graphicstate.xTLM;
	//   12   24:aload_0         
	//   13   25:aload_1         
	//   14   26:getfield        #39  <Field float xTLM>
	//   15   29:putfield        #39  <Field float xTLM>
		yTLM = pdfcontentbyte$graphicstate.yTLM;
	//   16   32:aload_0         
	//   17   33:aload_1         
	//   18   34:getfield        #41  <Field float yTLM>
	//   19   37:putfield        #41  <Field float yTLM>
		aTLM = pdfcontentbyte$graphicstate.aTLM;
	//   20   40:aload_0         
	//   21   41:aload_1         
	//   22   42:getfield        #43  <Field float aTLM>
	//   23   45:putfield        #43  <Field float aTLM>
		bTLM = pdfcontentbyte$graphicstate.bTLM;
	//   24   48:aload_0         
	//   25   49:aload_1         
	//   26   50:getfield        #45  <Field float bTLM>
	//   27   53:putfield        #45  <Field float bTLM>
		cTLM = pdfcontentbyte$graphicstate.cTLM;
	//   28   56:aload_0         
	//   29   57:aload_1         
	//   30   58:getfield        #47  <Field float cTLM>
	//   31   61:putfield        #47  <Field float cTLM>
		dTLM = pdfcontentbyte$graphicstate.dTLM;
	//   32   64:aload_0         
	//   33   65:aload_1         
	//   34   66:getfield        #49  <Field float dTLM>
	//   35   69:putfield        #49  <Field float dTLM>
		tx = pdfcontentbyte$graphicstate.tx;
	//   36   72:aload_0         
	//   37   73:aload_1         
	//   38   74:getfield        #51  <Field float tx>
	//   39   77:putfield        #51  <Field float tx>
		leading = pdfcontentbyte$graphicstate.leading;
	//   40   80:aload_0         
	//   41   81:aload_1         
	//   42   82:getfield        #53  <Field float leading>
	//   43   85:putfield        #53  <Field float leading>
		scale = pdfcontentbyte$graphicstate.scale;
	//   44   88:aload_0         
	//   45   89:aload_1         
	//   46   90:getfield        #56  <Field float scale>
	//   47   93:putfield        #56  <Field float scale>
		charSpace = pdfcontentbyte$graphicstate.charSpace;
	//   48   96:aload_0         
	//   49   97:aload_1         
	//   50   98:getfield        #58  <Field float charSpace>
	//   51  101:putfield        #58  <Field float charSpace>
		wordSpace = pdfcontentbyte$graphicstate.wordSpace;
	//   52  104:aload_0         
	//   53  105:aload_1         
	//   54  106:getfield        #60  <Field float wordSpace>
	//   55  109:putfield        #60  <Field float wordSpace>
		colorFill = pdfcontentbyte$graphicstate.colorFill;
	//   56  112:aload_0         
	//   57  113:aload_1         
	//   58  114:getfield        #67  <Field BaseColor colorFill>
	//   59  117:putfield        #67  <Field BaseColor colorFill>
		colorStroke = pdfcontentbyte$graphicstate.colorStroke;
	//   60  120:aload_0         
	//   61  121:aload_1         
	//   62  122:getfield        #69  <Field BaseColor colorStroke>
	//   63  125:putfield        #69  <Field BaseColor colorStroke>
		CTM = new AffineTransform(pdfcontentbyte$graphicstate.CTM);
	//   64  128:aload_0         
	//   65  129:new             #73  <Class AffineTransform>
	//   66  132:dup             
	//   67  133:aload_1         
	//   68  134:getfield        #76  <Field AffineTransform CTM>
	//   69  137:invokespecial   #92  <Method void AffineTransform(AffineTransform)>
	//   70  140:putfield        #76  <Field AffineTransform CTM>
		textRenderMode = pdfcontentbyte$graphicstate.textRenderMode;
	//   71  143:aload_0         
	//   72  144:aload_1         
	//   73  145:getfield        #71  <Field int textRenderMode>
	//   74  148:putfield        #71  <Field int textRenderMode>
		extGState = pdfcontentbyte$graphicstate.extGState;
	//   75  151:aload_0         
	//   76  152:aload_1         
	//   77  153:getfield        #78  <Field PdfObject extGState>
	//   78  156:putfield        #78  <Field PdfObject extGState>
	//   79  159:return          
	}

	void restore(PdfContentByte$GraphicState pdfcontentbyte$graphicstate)
	{
		copyParameters(pdfcontentbyte$graphicstate);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #83  <Method void copyParameters(PdfContentByte$GraphicState)>
	//    3    5:return          
	}

	protected AffineTransform CTM;
	protected float aTLM;
	protected float bTLM;
	protected float cTLM;
	protected float charSpace;
	ColorDetails colorDetails;
	protected BaseColor colorFill;
	protected BaseColor colorStroke;
	protected float dTLM;
	protected PdfObject extGState;
	FontDetails fontDetails;
	protected float leading;
	protected float scale;
	float size;
	protected int textRenderMode;
	protected float tx;
	protected float wordSpace;
	protected float xTLM;
	protected float yTLM;

	PdfContentByte$GraphicState()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #37  <Method void Object()>
		xTLM = 0.0F;
	//    2    4:aload_0         
	//    3    5:fconst_0        
	//    4    6:putfield        #39  <Field float xTLM>
		yTLM = 0.0F;
	//    5    9:aload_0         
	//    6   10:fconst_0        
	//    7   11:putfield        #41  <Field float yTLM>
		aTLM = 1.0F;
	//    8   14:aload_0         
	//    9   15:fconst_1        
	//   10   16:putfield        #43  <Field float aTLM>
		bTLM = 0.0F;
	//   11   19:aload_0         
	//   12   20:fconst_0        
	//   13   21:putfield        #45  <Field float bTLM>
		cTLM = 0.0F;
	//   14   24:aload_0         
	//   15   25:fconst_0        
	//   16   26:putfield        #47  <Field float cTLM>
		dTLM = 1.0F;
	//   17   29:aload_0         
	//   18   30:fconst_1        
	//   19   31:putfield        #49  <Field float dTLM>
		tx = 0.0F;
	//   20   34:aload_0         
	//   21   35:fconst_0        
	//   22   36:putfield        #51  <Field float tx>
		leading = 0.0F;
	//   23   39:aload_0         
	//   24   40:fconst_0        
	//   25   41:putfield        #53  <Field float leading>
		scale = 100F;
	//   26   44:aload_0         
	//   27   45:ldc1            #54  <Float 100F>
	//   28   47:putfield        #56  <Field float scale>
		charSpace = 0.0F;
	//   29   50:aload_0         
	//   30   51:fconst_0        
	//   31   52:putfield        #58  <Field float charSpace>
		wordSpace = 0.0F;
	//   32   55:aload_0         
	//   33   56:fconst_0        
	//   34   57:putfield        #60  <Field float wordSpace>
		colorFill = ((BaseColor) (new GrayColor(0)));
	//   35   60:aload_0         
	//   36   61:new             #62  <Class GrayColor>
	//   37   64:dup             
	//   38   65:iconst_0        
	//   39   66:invokespecial   #65  <Method void GrayColor(int)>
	//   40   69:putfield        #67  <Field BaseColor colorFill>
		colorStroke = ((BaseColor) (new GrayColor(0)));
	//   41   72:aload_0         
	//   42   73:new             #62  <Class GrayColor>
	//   43   76:dup             
	//   44   77:iconst_0        
	//   45   78:invokespecial   #65  <Method void GrayColor(int)>
	//   46   81:putfield        #69  <Field BaseColor colorStroke>
		textRenderMode = 0;
	//   47   84:aload_0         
	//   48   85:iconst_0        
	//   49   86:putfield        #71  <Field int textRenderMode>
		CTM = new AffineTransform();
	//   50   89:aload_0         
	//   51   90:new             #73  <Class AffineTransform>
	//   52   93:dup             
	//   53   94:invokespecial   #74  <Method void AffineTransform()>
	//   54   97:putfield        #76  <Field AffineTransform CTM>
		extGState = null;
	//   55  100:aload_0         
	//   56  101:aconst_null     
	//   57  102:putfield        #78  <Field PdfObject extGState>
	//   58  105:return          
	}

	PdfContentByte$GraphicState(PdfContentByte$GraphicState pdfcontentbyte$graphicstate)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #37  <Method void Object()>
		xTLM = 0.0F;
	//    2    4:aload_0         
	//    3    5:fconst_0        
	//    4    6:putfield        #39  <Field float xTLM>
		yTLM = 0.0F;
	//    5    9:aload_0         
	//    6   10:fconst_0        
	//    7   11:putfield        #41  <Field float yTLM>
		aTLM = 1.0F;
	//    8   14:aload_0         
	//    9   15:fconst_1        
	//   10   16:putfield        #43  <Field float aTLM>
		bTLM = 0.0F;
	//   11   19:aload_0         
	//   12   20:fconst_0        
	//   13   21:putfield        #45  <Field float bTLM>
		cTLM = 0.0F;
	//   14   24:aload_0         
	//   15   25:fconst_0        
	//   16   26:putfield        #47  <Field float cTLM>
		dTLM = 1.0F;
	//   17   29:aload_0         
	//   18   30:fconst_1        
	//   19   31:putfield        #49  <Field float dTLM>
		tx = 0.0F;
	//   20   34:aload_0         
	//   21   35:fconst_0        
	//   22   36:putfield        #51  <Field float tx>
		leading = 0.0F;
	//   23   39:aload_0         
	//   24   40:fconst_0        
	//   25   41:putfield        #53  <Field float leading>
		scale = 100F;
	//   26   44:aload_0         
	//   27   45:ldc1            #54  <Float 100F>
	//   28   47:putfield        #56  <Field float scale>
		charSpace = 0.0F;
	//   29   50:aload_0         
	//   30   51:fconst_0        
	//   31   52:putfield        #58  <Field float charSpace>
		wordSpace = 0.0F;
	//   32   55:aload_0         
	//   33   56:fconst_0        
	//   34   57:putfield        #60  <Field float wordSpace>
		colorFill = ((BaseColor) (new GrayColor(0)));
	//   35   60:aload_0         
	//   36   61:new             #62  <Class GrayColor>
	//   37   64:dup             
	//   38   65:iconst_0        
	//   39   66:invokespecial   #65  <Method void GrayColor(int)>
	//   40   69:putfield        #67  <Field BaseColor colorFill>
		colorStroke = ((BaseColor) (new GrayColor(0)));
	//   41   72:aload_0         
	//   42   73:new             #62  <Class GrayColor>
	//   43   76:dup             
	//   44   77:iconst_0        
	//   45   78:invokespecial   #65  <Method void GrayColor(int)>
	//   46   81:putfield        #69  <Field BaseColor colorStroke>
		textRenderMode = 0;
	//   47   84:aload_0         
	//   48   85:iconst_0        
	//   49   86:putfield        #71  <Field int textRenderMode>
		CTM = new AffineTransform();
	//   50   89:aload_0         
	//   51   90:new             #73  <Class AffineTransform>
	//   52   93:dup             
	//   53   94:invokespecial   #74  <Method void AffineTransform()>
	//   54   97:putfield        #76  <Field AffineTransform CTM>
		extGState = null;
	//   55  100:aload_0         
	//   56  101:aconst_null     
	//   57  102:putfield        #78  <Field PdfObject extGState>
		copyParameters(pdfcontentbyte$graphicstate);
	//   58  105:aload_0         
	//   59  106:aload_1         
	//   60  107:invokevirtual   #83  <Method void copyParameters(PdfContentByte$GraphicState)>
	//   61  110:return          
	}
}

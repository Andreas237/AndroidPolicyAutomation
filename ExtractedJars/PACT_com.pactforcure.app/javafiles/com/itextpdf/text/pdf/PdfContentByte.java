// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf;

import com.itextpdf.awt.geom.AffineTransform;
import com.itextpdf.awt.geom.Point2D;
import com.itextpdf.text.*;
import com.itextpdf.text.error_messages.MessageLocalization;
import com.itextpdf.text.exceptions.IllegalPdfSyntaxException;
import com.itextpdf.text.pdf.interfaces.IAccessibleElement;
import com.itextpdf.text.pdf.internal.PdfAnnotationsImp;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.net.URL;
import java.util.*;

// Referenced classes of package com.itextpdf.text.pdf:
//			PdfName, ByteBuffer, PdfWriter, PdfTemplate, 
//			PageResources, PdfOCG, PdfStructureElement, PdfDocument, 
//			PdfObject, PdfArray, PdfDictionary, PdfNumber, 
//			ExtendedColor, FontDetails, BaseFont, PdfTextArray, 
//			StringUtils, PdfAnnotation, PdfFormField, PdfStructureTreeRoot, 
//			PdfIndirectObject, PdfArtifact, PdfImage, PdfPSXObject, 
//			PdfLayer, PdfLayerMembership, PdfIndirectReference, PdfAppearance, 
//			PdfPatternPainter, GrayColor, CMYKColor, PdfShading, 
//			ColorDetails, PdfShadingPattern, PdfGState, SpotColor, 
//			PatternColor, ShadingColor, DeviceNColor, LabColor, 
//			PdfStream, PdfOutline, PdfDestination, PdfAction, 
//			PdfDeviceNColor, PdfLabColor, PdfSpotColor

public class PdfContentByte
{
	public static class GraphicState
	{

		void copyParameters(GraphicState graphicstate)
		{
			fontDetails = graphicstate.fontDetails;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:getfield        #85  <Field FontDetails fontDetails>
		//    3    5:putfield        #85  <Field FontDetails fontDetails>
			colorDetails = graphicstate.colorDetails;
		//    4    8:aload_0         
		//    5    9:aload_1         
		//    6   10:getfield        #87  <Field ColorDetails colorDetails>
		//    7   13:putfield        #87  <Field ColorDetails colorDetails>
			size = graphicstate.size;
		//    8   16:aload_0         
		//    9   17:aload_1         
		//   10   18:getfield        #89  <Field float size>
		//   11   21:putfield        #89  <Field float size>
			xTLM = graphicstate.xTLM;
		//   12   24:aload_0         
		//   13   25:aload_1         
		//   14   26:getfield        #39  <Field float xTLM>
		//   15   29:putfield        #39  <Field float xTLM>
			yTLM = graphicstate.yTLM;
		//   16   32:aload_0         
		//   17   33:aload_1         
		//   18   34:getfield        #41  <Field float yTLM>
		//   19   37:putfield        #41  <Field float yTLM>
			aTLM = graphicstate.aTLM;
		//   20   40:aload_0         
		//   21   41:aload_1         
		//   22   42:getfield        #43  <Field float aTLM>
		//   23   45:putfield        #43  <Field float aTLM>
			bTLM = graphicstate.bTLM;
		//   24   48:aload_0         
		//   25   49:aload_1         
		//   26   50:getfield        #45  <Field float bTLM>
		//   27   53:putfield        #45  <Field float bTLM>
			cTLM = graphicstate.cTLM;
		//   28   56:aload_0         
		//   29   57:aload_1         
		//   30   58:getfield        #47  <Field float cTLM>
		//   31   61:putfield        #47  <Field float cTLM>
			dTLM = graphicstate.dTLM;
		//   32   64:aload_0         
		//   33   65:aload_1         
		//   34   66:getfield        #49  <Field float dTLM>
		//   35   69:putfield        #49  <Field float dTLM>
			tx = graphicstate.tx;
		//   36   72:aload_0         
		//   37   73:aload_1         
		//   38   74:getfield        #51  <Field float tx>
		//   39   77:putfield        #51  <Field float tx>
			leading = graphicstate.leading;
		//   40   80:aload_0         
		//   41   81:aload_1         
		//   42   82:getfield        #53  <Field float leading>
		//   43   85:putfield        #53  <Field float leading>
			scale = graphicstate.scale;
		//   44   88:aload_0         
		//   45   89:aload_1         
		//   46   90:getfield        #56  <Field float scale>
		//   47   93:putfield        #56  <Field float scale>
			charSpace = graphicstate.charSpace;
		//   48   96:aload_0         
		//   49   97:aload_1         
		//   50   98:getfield        #58  <Field float charSpace>
		//   51  101:putfield        #58  <Field float charSpace>
			wordSpace = graphicstate.wordSpace;
		//   52  104:aload_0         
		//   53  105:aload_1         
		//   54  106:getfield        #60  <Field float wordSpace>
		//   55  109:putfield        #60  <Field float wordSpace>
			colorFill = graphicstate.colorFill;
		//   56  112:aload_0         
		//   57  113:aload_1         
		//   58  114:getfield        #67  <Field BaseColor colorFill>
		//   59  117:putfield        #67  <Field BaseColor colorFill>
			colorStroke = graphicstate.colorStroke;
		//   60  120:aload_0         
		//   61  121:aload_1         
		//   62  122:getfield        #69  <Field BaseColor colorStroke>
		//   63  125:putfield        #69  <Field BaseColor colorStroke>
			CTM = new AffineTransform(graphicstate.CTM);
		//   64  128:aload_0         
		//   65  129:new             #73  <Class AffineTransform>
		//   66  132:dup             
		//   67  133:aload_1         
		//   68  134:getfield        #76  <Field AffineTransform CTM>
		//   69  137:invokespecial   #92  <Method void AffineTransform(AffineTransform)>
		//   70  140:putfield        #76  <Field AffineTransform CTM>
			textRenderMode = graphicstate.textRenderMode;
		//   71  143:aload_0         
		//   72  144:aload_1         
		//   73  145:getfield        #71  <Field int textRenderMode>
		//   74  148:putfield        #71  <Field int textRenderMode>
			extGState = graphicstate.extGState;
		//   75  151:aload_0         
		//   76  152:aload_1         
		//   77  153:getfield        #78  <Field PdfObject extGState>
		//   78  156:putfield        #78  <Field PdfObject extGState>
		//   79  159:return          
		}

		void restore(GraphicState graphicstate)
		{
			copyParameters(graphicstate);
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

		GraphicState()
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

		GraphicState(GraphicState graphicstate)
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
			copyParameters(graphicstate);
		//   58  105:aload_0         
		//   59  106:aload_1         
		//   60  107:invokevirtual   #83  <Method void copyParameters(PdfContentByte$GraphicState)>
		//   61  110:return          
		}
	}

	static class UncoloredPattern extends PatternColor
	{

		public boolean equals(Object obj)
		{
			return (obj instanceof UncoloredPattern) && ((Object) (((UncoloredPattern)obj).painter)).equals(((Object) (painter))) && ((UncoloredPattern)obj).color.equals(((Object) (color))) && ((UncoloredPattern)obj).tint == tint;
		//    0    0:aload_1         
		//    1    1:instanceof      #2   <Class PdfContentByte$UncoloredPattern>
		//    2    4:ifeq            58
		//    3    7:aload_1         
		//    4    8:checkcast       #2   <Class PdfContentByte$UncoloredPattern>
		//    5   11:getfield        #27  <Field PdfPatternPainter painter>
		//    6   14:aload_0         
		//    7   15:getfield        #27  <Field PdfPatternPainter painter>
		//    8   18:invokevirtual   #31  <Method boolean Object.equals(Object)>
		//    9   21:ifeq            58
		//   10   24:aload_1         
		//   11   25:checkcast       #2   <Class PdfContentByte$UncoloredPattern>
		//   12   28:getfield        #18  <Field BaseColor color>
		//   13   31:aload_0         
		//   14   32:getfield        #18  <Field BaseColor color>
		//   15   35:invokevirtual   #34  <Method boolean BaseColor.equals(Object)>
		//   16   38:ifeq            58
		//   17   41:aload_1         
		//   18   42:checkcast       #2   <Class PdfContentByte$UncoloredPattern>
		//   19   45:getfield        #20  <Field float tint>
		//   20   48:aload_0         
		//   21   49:getfield        #20  <Field float tint>
		//   22   52:fcmpl           
		//   23   53:ifne            58
		//   24   56:iconst_1        
		//   25   57:ireturn         
		//   26   58:iconst_0        
		//   27   59:ireturn         
		}

		protected BaseColor color;
		protected float tint;

		protected UncoloredPattern(PdfPatternPainter pdfpatternpainter, BaseColor basecolor, float f)
		{
			super(pdfpatternpainter);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #16  <Method void PatternColor(PdfPatternPainter)>
			color = basecolor;
		//    3    5:aload_0         
		//    4    6:aload_2         
		//    5    7:putfield        #18  <Field BaseColor color>
			tint = f;
		//    6   10:aload_0         
		//    7   11:fload_3         
		//    8   12:putfield        #20  <Field float tint>
		//    9   15:return          
		}
	}


	public PdfContentByte(PdfWriter pdfwriter)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #135 <Method void Object()>
		content = new ByteBuffer();
	//    2    4:aload_0         
	//    3    5:new             #137 <Class ByteBuffer>
	//    4    8:dup             
	//    5    9:invokespecial   #138 <Method void ByteBuffer()>
	//    6   12:putfield        #140 <Field ByteBuffer content>
		markedContentSize = 0;
	//    7   15:aload_0         
	//    8   16:iconst_0        
	//    9   17:putfield        #142 <Field int markedContentSize>
		state = new GraphicState();
	//   10   20:aload_0         
	//   11   21:new             #6   <Class PdfContentByte$GraphicState>
	//   12   24:dup             
	//   13   25:invokespecial   #143 <Method void PdfContentByte$GraphicState()>
	//   14   28:putfield        #145 <Field PdfContentByte$GraphicState state>
		stateList = new ArrayList();
	//   15   31:aload_0         
	//   16   32:new             #147 <Class ArrayList>
	//   17   35:dup             
	//   18   36:invokespecial   #148 <Method void ArrayList()>
	//   19   39:putfield        #150 <Field ArrayList stateList>
		separator = 10;
	//   20   42:aload_0         
	//   21   43:bipush          10
	//   22   45:putfield        #152 <Field int separator>
		mcDepth = 0;
	//   23   48:aload_0         
	//   24   49:iconst_0        
	//   25   50:putfield        #154 <Field int mcDepth>
		inText = false;
	//   26   53:aload_0         
	//   27   54:iconst_0        
	//   28   55:putfield        #156 <Field boolean inText>
		suppressTagging = false;
	//   29   58:aload_0         
	//   30   59:iconst_0        
	//   31   60:putfield        #158 <Field boolean suppressTagging>
		mcElements = new ArrayList();
	//   32   63:aload_0         
	//   33   64:new             #147 <Class ArrayList>
	//   34   67:dup             
	//   35   68:invokespecial   #148 <Method void ArrayList()>
	//   36   71:putfield        #160 <Field ArrayList mcElements>
		duplicatedFrom = null;
	//   37   74:aload_0         
	//   38   75:aconst_null     
	//   39   76:putfield        #162 <Field PdfContentByte duplicatedFrom>
		if(pdfwriter != null)
	//*  40   79:aload_1         
	//*  41   80:ifnull          99
		{
			writer = pdfwriter;
	//   42   83:aload_0         
	//   43   84:aload_1         
	//   44   85:putfield        #164 <Field PdfWriter writer>
			pdf = writer.getPdfDocument();
	//   45   88:aload_0         
	//   46   89:aload_0         
	//   47   90:getfield        #164 <Field PdfWriter writer>
	//   48   93:invokevirtual   #170 <Method PdfDocument PdfWriter.getPdfDocument()>
	//   49   96:putfield        #172 <Field PdfDocument pdf>
		}
	//   50   99:return          
	}

	private void HelperCMYK(float f, float f1, float f2, float f3)
	{
		float f4;
		if(f < 0.0F)
	//*   0    0:fload_1         
	//*   1    1:fconst_0        
	//*   2    2:fcmpg           
	//*   3    3:ifge            72
		{
			f4 = 0.0F;
	//    4    6:fconst_0        
	//    5    7:fstore          5
		} else
	//*   6    9:fload_2         
	//*   7   10:fconst_0        
	//*   8   11:fcmpg           
	//*   9   12:ifge            87
	//*  10   15:fconst_0        
	//*  11   16:fstore_1        
	//*  12   17:fload_3         
	//*  13   18:fconst_0        
	//*  14   19:fcmpg           
	//*  15   20:ifge            100
	//*  16   23:fconst_0        
	//*  17   24:fstore_2        
	//*  18   25:fload           4
	//*  19   27:fconst_0        
	//*  20   28:fcmpg           
	//*  21   29:ifge            113
	//*  22   32:fconst_0        
	//*  23   33:fstore_3        
	//*  24   34:aload_0         
	//*  25   35:getfield        #140 <Field ByteBuffer content>
	//*  26   38:fload           5
	//*  27   40:invokevirtual   #178 <Method ByteBuffer ByteBuffer.append(float)>
	//*  28   43:bipush          32
	//*  29   45:invokevirtual   #181 <Method ByteBuffer ByteBuffer.append(char)>
	//*  30   48:fload_1         
	//*  31   49:invokevirtual   #178 <Method ByteBuffer ByteBuffer.append(float)>
	//*  32   52:bipush          32
	//*  33   54:invokevirtual   #181 <Method ByteBuffer ByteBuffer.append(char)>
	//*  34   57:fload_2         
	//*  35   58:invokevirtual   #178 <Method ByteBuffer ByteBuffer.append(float)>
	//*  36   61:bipush          32
	//*  37   63:invokevirtual   #181 <Method ByteBuffer ByteBuffer.append(char)>
	//*  38   66:fload_3         
	//*  39   67:invokevirtual   #178 <Method ByteBuffer ByteBuffer.append(float)>
	//*  40   70:pop             
	//*  41   71:return          
		{
			f4 = f;
	//   42   72:fload_1         
	//   43   73:fstore          5
			if(f > 1.0F)
	//*  44   75:fload_1         
	//*  45   76:fconst_1        
	//*  46   77:fcmpl           
	//*  47   78:ifle            9
				f4 = 1.0F;
	//   48   81:fconst_1        
	//   49   82:fstore          5
		}
		if(f1 < 0.0F)
		{
			f = 0.0F;
		} else
	//*  50   84:goto            9
		{
			f = f1;
	//   51   87:fload_2         
	//   52   88:fstore_1        
			if(f1 > 1.0F)
	//*  53   89:fload_2         
	//*  54   90:fconst_1        
	//*  55   91:fcmpl           
	//*  56   92:ifle            17
				f = 1.0F;
	//   57   95:fconst_1        
	//   58   96:fstore_1        
		}
		if(f2 < 0.0F)
		{
			f1 = 0.0F;
		} else
	//*  59   97:goto            17
		{
			f1 = f2;
	//   60  100:fload_3         
	//   61  101:fstore_2        
			if(f2 > 1.0F)
	//*  62  102:fload_3         
	//*  63  103:fconst_1        
	//*  64  104:fcmpl           
	//*  65  105:ifle            25
				f1 = 1.0F;
	//   66  108:fconst_1        
	//   67  109:fstore_2        
		}
		if(f3 < 0.0F)
		{
			f2 = 0.0F;
		} else
	//*  68  110:goto            25
		{
			f2 = f3;
	//   69  113:fload           4
	//   70  115:fstore_3        
			if(f3 > 1.0F)
	//*  71  116:fload           4
	//*  72  118:fconst_1        
	//*  73  119:fcmpl           
	//*  74  120:ifle            34
				f2 = 1.0F;
	//   75  123:fconst_1        
	//   76  124:fstore_3        
		}
		content.append(f4).append(' ').append(f).append(' ').append(f1).append(' ').append(f2);
	//*  77  125:goto            34
	}

	private void HelperRGB(float f, float f1, float f2)
	{
		float f3;
		if(f < 0.0F)
	//*   0    0:fload_1         
	//*   1    1:fconst_0        
	//*   2    2:fcmpg           
	//*   3    3:ifge            54
		{
			f3 = 0.0F;
	//    4    6:fconst_0        
	//    5    7:fstore          4
		} else
	//*   6    9:fload_2         
	//*   7   10:fconst_0        
	//*   8   11:fcmpg           
	//*   9   12:ifge            69
	//*  10   15:fconst_0        
	//*  11   16:fstore_1        
	//*  12   17:fload_3         
	//*  13   18:fconst_0        
	//*  14   19:fcmpg           
	//*  15   20:ifge            82
	//*  16   23:fconst_0        
	//*  17   24:fstore_2        
	//*  18   25:aload_0         
	//*  19   26:getfield        #140 <Field ByteBuffer content>
	//*  20   29:fload           4
	//*  21   31:invokevirtual   #178 <Method ByteBuffer ByteBuffer.append(float)>
	//*  22   34:bipush          32
	//*  23   36:invokevirtual   #181 <Method ByteBuffer ByteBuffer.append(char)>
	//*  24   39:fload_1         
	//*  25   40:invokevirtual   #178 <Method ByteBuffer ByteBuffer.append(float)>
	//*  26   43:bipush          32
	//*  27   45:invokevirtual   #181 <Method ByteBuffer ByteBuffer.append(char)>
	//*  28   48:fload_2         
	//*  29   49:invokevirtual   #178 <Method ByteBuffer ByteBuffer.append(float)>
	//*  30   52:pop             
	//*  31   53:return          
		{
			f3 = f;
	//   32   54:fload_1         
	//   33   55:fstore          4
			if(f > 1.0F)
	//*  34   57:fload_1         
	//*  35   58:fconst_1        
	//*  36   59:fcmpl           
	//*  37   60:ifle            9
				f3 = 1.0F;
	//   38   63:fconst_1        
	//   39   64:fstore          4
		}
		if(f1 < 0.0F)
		{
			f = 0.0F;
		} else
	//*  40   66:goto            9
		{
			f = f1;
	//   41   69:fload_2         
	//   42   70:fstore_1        
			if(f1 > 1.0F)
	//*  43   71:fload_2         
	//*  44   72:fconst_1        
	//*  45   73:fcmpl           
	//*  46   74:ifle            17
				f = 1.0F;
	//   47   77:fconst_1        
	//   48   78:fstore_1        
		}
		if(f2 < 0.0F)
		{
			f1 = 0.0F;
		} else
	//*  49   79:goto            17
		{
			f1 = f2;
	//   50   82:fload_3         
	//   51   83:fstore_2        
			if(f2 > 1.0F)
	//*  52   84:fload_3         
	//*  53   85:fconst_1        
	//*  54   86:fcmpl           
	//*  55   87:ifle            25
				f1 = 1.0F;
	//   56   90:fconst_1        
	//   57   91:fstore_2        
		}
		content.append(f3).append(' ').append(f).append(' ').append(f1);
	//*  58   92:goto            25
	}

	private void addTemplate(PdfTemplate pdftemplate, double d, double d1, double d2, 
			double d3, double d4, double d5, boolean flag, 
			boolean flag1)
	{
		checkWriter();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #188 <Method void checkWriter()>
		checkNoPattern(pdftemplate);
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokevirtual   #192 <Method void checkNoPattern(PdfTemplate)>
		PdfWriter.checkPdfIsoConformance(writer, 20, ((Object) (pdftemplate)));
	//    5    9:aload_0         
	//    6   10:getfield        #164 <Field PdfWriter writer>
	//    7   13:bipush          20
	//    8   15:aload_1         
	//    9   16:invokestatic    #196 <Method void PdfWriter.checkPdfIsoConformance(PdfWriter, int, Object)>
		PdfName pdfname = writer.addDirectTemplateSimple(pdftemplate, ((PdfName) (null)));
	//   10   19:aload_0         
	//   11   20:getfield        #164 <Field PdfWriter writer>
	//   12   23:aload_1         
	//   13   24:aconst_null     
	//   14   25:invokevirtual   #200 <Method PdfName PdfWriter.addDirectTemplateSimple(PdfTemplate, PdfName)>
	//   15   28:astore          16
		pdfname = getPageResources().addXObject(pdfname, pdftemplate.getIndirectReference());
	//   16   30:aload_0         
	//   17   31:invokevirtual   #204 <Method PageResources getPageResources()>
	//   18   34:aload           16
	//   19   36:aload_1         
	//   20   37:invokevirtual   #210 <Method PdfIndirectReference PdfTemplate.getIndirectReference()>
	//   21   40:invokevirtual   #216 <Method PdfName PageResources.addXObject(PdfName, PdfIndirectReference)>
	//   22   43:astore          16
		if(isTagged() && flag)
	//*  23   45:aload_0         
	//*  24   46:invokevirtual   #220 <Method boolean isTagged()>
	//*  25   49:ifeq            168
	//*  26   52:iload           14
	//*  27   54:ifeq            168
		{
			if(inText)
	//*  28   57:aload_0         
	//*  29   58:getfield        #156 <Field boolean inText>
	//*  30   61:ifeq            68
				endText();
	//   31   64:aload_0         
	//   32   65:invokevirtual   #223 <Method void endText()>
			if(pdftemplate.isContentTagged() || pdftemplate.getPageReference() != null && flag1)
	//*  33   68:aload_1         
	//*  34   69:invokevirtual   #226 <Method boolean PdfTemplate.isContentTagged()>
	//*  35   72:ifne            87
	//*  36   75:aload_1         
	//*  37   76:invokevirtual   #229 <Method PdfIndirectReference PdfTemplate.getPageReference()>
	//*  38   79:ifnull          104
	//*  39   82:iload           15
	//*  40   84:ifeq            104
				throw new RuntimeException(MessageLocalization.getComposedMessage("template.with.tagged.could.not.be.used.more.than.once", new Object[0]));
	//   41   87:new             #231 <Class RuntimeException>
	//   42   90:dup             
	//   43   91:ldc1            #233 <String "template.with.tagged.could.not.be.used.more.than.once">
	//   44   93:iconst_0        
	//   45   94:anewarray       Object[]
	//   46   97:invokestatic    #239 <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//   47  100:invokespecial   #242 <Method void RuntimeException(String)>
	//   48  103:athrow          
			pdftemplate.setPageReference(writer.getCurrentPage());
	//   49  104:aload_1         
	//   50  105:aload_0         
	//   51  106:getfield        #164 <Field PdfWriter writer>
	//   52  109:invokevirtual   #245 <Method PdfIndirectReference PdfWriter.getCurrentPage()>
	//   53  112:invokevirtual   #249 <Method void PdfTemplate.setPageReference(PdfIndirectReference)>
			if(flag1)
	//*  54  115:iload           15
	//*  55  117:ifeq            323
			{
				pdftemplate.setContentTagged(true);
	//   56  120:aload_1         
	//   57  121:iconst_1        
	//   58  122:invokevirtual   #253 <Method void PdfTemplate.setContentTagged(boolean)>
				ensureDocumentTagIsOpen();
	//   59  125:aload_0         
	//   60  126:invokespecial   #256 <Method void ensureDocumentTagIsOpen()>
				ArrayList arraylist = getMcElements();
	//   61  129:aload_0         
	//   62  130:invokevirtual   #260 <Method ArrayList getMcElements()>
	//   63  133:astore          17
				if(arraylist != null && arraylist.size() > 0)
	//*  64  135:aload           17
	//*  65  137:ifnull          168
	//*  66  140:aload           17
	//*  67  142:invokevirtual   #264 <Method int ArrayList.size()>
	//*  68  145:ifle            168
					pdftemplate.getMcElements().add(arraylist.get(arraylist.size() - 1));
	//   69  148:aload_1         
	//   70  149:invokevirtual   #265 <Method ArrayList PdfTemplate.getMcElements()>
	//   71  152:aload           17
	//   72  154:aload           17
	//   73  156:invokevirtual   #264 <Method int ArrayList.size()>
	//   74  159:iconst_1        
	//   75  160:isub            
	//   76  161:invokevirtual   #269 <Method Object ArrayList.get(int)>
	//   77  164:invokevirtual   #273 <Method boolean ArrayList.add(Object)>
	//   78  167:pop             
			} else
	//*  79  168:aload_0         
	//*  80  169:getfield        #140 <Field ByteBuffer content>
	//*  81  172:ldc2            #275 <String "q ">
	//*  82  175:invokevirtual   #278 <Method ByteBuffer ByteBuffer.append(String)>
	//*  83  178:pop             
	//*  84  179:aload_0         
	//*  85  180:getfield        #140 <Field ByteBuffer content>
	//*  86  183:dload_2         
	//*  87  184:invokevirtual   #281 <Method ByteBuffer ByteBuffer.append(double)>
	//*  88  187:bipush          32
	//*  89  189:invokevirtual   #181 <Method ByteBuffer ByteBuffer.append(char)>
	//*  90  192:pop             
	//*  91  193:aload_0         
	//*  92  194:getfield        #140 <Field ByteBuffer content>
	//*  93  197:dload           4
	//*  94  199:invokevirtual   #281 <Method ByteBuffer ByteBuffer.append(double)>
	//*  95  202:bipush          32
	//*  96  204:invokevirtual   #181 <Method ByteBuffer ByteBuffer.append(char)>
	//*  97  207:pop             
	//*  98  208:aload_0         
	//*  99  209:getfield        #140 <Field ByteBuffer content>
	//* 100  212:dload           6
	//* 101  214:invokevirtual   #281 <Method ByteBuffer ByteBuffer.append(double)>
	//* 102  217:bipush          32
	//* 103  219:invokevirtual   #181 <Method ByteBuffer ByteBuffer.append(char)>
	//* 104  222:pop             
	//* 105  223:aload_0         
	//* 106  224:getfield        #140 <Field ByteBuffer content>
	//* 107  227:dload           8
	//* 108  229:invokevirtual   #281 <Method ByteBuffer ByteBuffer.append(double)>
	//* 109  232:bipush          32
	//* 110  234:invokevirtual   #181 <Method ByteBuffer ByteBuffer.append(char)>
	//* 111  237:pop             
	//* 112  238:aload_0         
	//* 113  239:getfield        #140 <Field ByteBuffer content>
	//* 114  242:dload           10
	//* 115  244:invokevirtual   #281 <Method ByteBuffer ByteBuffer.append(double)>
	//* 116  247:bipush          32
	//* 117  249:invokevirtual   #181 <Method ByteBuffer ByteBuffer.append(char)>
	//* 118  252:pop             
	//* 119  253:aload_0         
	//* 120  254:getfield        #140 <Field ByteBuffer content>
	//* 121  257:dload           12
	//* 122  259:invokevirtual   #281 <Method ByteBuffer ByteBuffer.append(double)>
	//* 123  262:ldc2            #283 <String " cm ">
	//* 124  265:invokevirtual   #278 <Method ByteBuffer ByteBuffer.append(String)>
	//* 125  268:pop             
	//* 126  269:aload_0         
	//* 127  270:getfield        #140 <Field ByteBuffer content>
	//* 128  273:aload           16
	//* 129  275:invokevirtual   #287 <Method byte[] PdfName.getBytes()>
	//* 130  278:invokevirtual   #290 <Method ByteBuffer ByteBuffer.append(byte[])>
	//* 131  281:ldc2            #292 <String " Do Q">
	//* 132  284:invokevirtual   #278 <Method ByteBuffer ByteBuffer.append(String)>
	//* 133  287:aload_0         
	//* 134  288:getfield        #152 <Field int separator>
	//* 135  291:invokevirtual   #296 <Method ByteBuffer ByteBuffer.append_i(int)>
	//* 136  294:pop             
	//* 137  295:aload_0         
	//* 138  296:invokevirtual   #220 <Method boolean isTagged()>
	//* 139  299:ifeq            322
	//* 140  302:iload           14
	//* 141  304:ifeq            322
	//* 142  307:iload           15
	//* 143  309:ifne            322
	//* 144  312:aload_0         
	//* 145  313:aload_1         
	//* 146  314:invokevirtual   #300 <Method void closeMCBlock(IAccessibleElement)>
	//* 147  317:aload_1         
	//* 148  318:aconst_null     
	//* 149  319:invokevirtual   #304 <Method void PdfTemplate.setId(com.itextpdf.text.AccessibleElementId)>
	//* 150  322:return          
			{
				openMCBlock(((IAccessibleElement) (pdftemplate)));
	//  151  323:aload_0         
	//  152  324:aload_1         
	//  153  325:invokevirtual   #307 <Method void openMCBlock(IAccessibleElement)>
			}
		}
		content.append("q ");
		content.append(d).append(' ');
		content.append(d1).append(' ');
		content.append(d2).append(' ');
		content.append(d3).append(' ');
		content.append(d4).append(' ');
		content.append(d5).append(" cm ");
		content.append(pdfname.getBytes()).append(" Do Q").append_i(separator);
		if(isTagged() && flag && !flag1)
		{
			closeMCBlock(((IAccessibleElement) (pdftemplate)));
			pdftemplate.setId(((com.itextpdf.text.AccessibleElementId) (null)));
		}
	//* 154  328:goto            168
	}

	private void beginLayer2(PdfOCG pdfocg)
	{
		PdfName pdfname = (PdfName)writer.addSimpleProperty(((Object) (pdfocg)), pdfocg.getRef())[0];
	//    0    0:aload_0         
	//    1    1:getfield        #164 <Field PdfWriter writer>
	//    2    4:aload_1         
	//    3    5:aload_1         
	//    4    6:invokeinterface #314 <Method PdfIndirectReference PdfOCG.getRef()>
	//    5   11:invokevirtual   #318 <Method PdfObject[] PdfWriter.addSimpleProperty(Object, PdfIndirectReference)>
	//    6   14:iconst_0        
	//    7   15:aaload          
	//    8   16:checkcast       #77  <Class PdfName>
	//    9   19:astore_2        
		pdfocg = ((PdfOCG) (getPageResources().addProperty(pdfname, pdfocg.getRef())));
	//   10   20:aload_0         
	//   11   21:invokevirtual   #204 <Method PageResources getPageResources()>
	//   12   24:aload_2         
	//   13   25:aload_1         
	//   14   26:invokeinterface #314 <Method PdfIndirectReference PdfOCG.getRef()>
	//   15   31:invokevirtual   #321 <Method PdfName PageResources.addProperty(PdfName, PdfIndirectReference)>
	//   16   34:astore_1        
		content.append("/OC ").append(((PdfName) (pdfocg)).getBytes()).append(" BDC").append_i(separator);
	//   17   35:aload_0         
	//   18   36:getfield        #140 <Field ByteBuffer content>
	//   19   39:ldc2            #323 <String "/OC ">
	//   20   42:invokevirtual   #278 <Method ByteBuffer ByteBuffer.append(String)>
	//   21   45:aload_1         
	//   22   46:invokevirtual   #287 <Method byte[] PdfName.getBytes()>
	//   23   49:invokevirtual   #290 <Method ByteBuffer ByteBuffer.append(byte[])>
	//   24   52:ldc2            #325 <String " BDC">
	//   25   55:invokevirtual   #278 <Method ByteBuffer ByteBuffer.append(String)>
	//   26   58:aload_0         
	//   27   59:getfield        #152 <Field int separator>
	//   28   62:invokevirtual   #296 <Method ByteBuffer ByteBuffer.append_i(int)>
	//   29   65:pop             
	//   30   66:return          
	}

	private void beginMarkedContentSequence(PdfStructureElement pdfstructureelement, String s)
	{
		Object obj = ((Object) (pdfstructureelement.get(PdfName.K)));
	//    0    0:aload_1         
	//    1    1:getstatic       #330 <Field PdfName PdfName.K>
	//    2    4:invokevirtual   #335 <Method PdfObject PdfStructureElement.get(PdfName)>
	//    3    7:astore          6
		int ai[] = pdf.getStructParentIndexAndNextMarkPoint(((Object) (getCurrentPage())));
	//    4    9:aload_0         
	//    5   10:getfield        #172 <Field PdfDocument pdf>
	//    6   13:aload_0         
	//    7   14:invokevirtual   #336 <Method PdfIndirectReference getCurrentPage()>
	//    8   17:invokevirtual   #342 <Method int[] PdfDocument.getStructParentIndexAndNextMarkPoint(Object)>
	//    9   20:astore          5
		int j = ai[0];
	//   10   22:aload           5
	//   11   24:iconst_0        
	//   12   25:iaload          
	//   13   26:istore          4
		int i = ai[1];
	//   14   28:aload           5
	//   15   30:iconst_1        
	//   16   31:iaload          
	//   17   32:istore_3        
		if(obj != null)
	//*  18   33:aload           6
	//*  19   35:ifnull          302
		{
			PdfArray pdfarray;
			if(((PdfObject) (obj)).isNumber())
	//*  20   38:aload           6
	//*  21   40:invokevirtual   #347 <Method boolean PdfObject.isNumber()>
	//*  22   43:ifeq            255
			{
				pdfarray = new PdfArray();
	//   23   46:new             #349 <Class PdfArray>
	//   24   49:dup             
	//   25   50:invokespecial   #350 <Method void PdfArray()>
	//   26   53:astore          5
				pdfarray.add(((PdfObject) (obj)));
	//   27   55:aload           5
	//   28   57:aload           6
	//   29   59:invokevirtual   #353 <Method boolean PdfArray.add(PdfObject)>
	//   30   62:pop             
				pdfstructureelement.put(PdfName.K, ((PdfObject) (pdfarray)));
	//   31   63:aload_1         
	//   32   64:getstatic       #330 <Field PdfName PdfName.K>
	//   33   67:aload           5
	//   34   69:invokevirtual   #356 <Method void PdfStructureElement.put(PdfName, PdfObject)>
			} else
	//*  35   72:aload           5
	//*  36   74:iconst_0        
	//*  37   75:invokevirtual   #360 <Method PdfNumber PdfArray.getAsNumber(int)>
	//*  38   78:ifnull          129
	//*  39   81:new             #362 <Class PdfDictionary>
	//*  40   84:dup             
	//*  41   85:getstatic       #365 <Field PdfName PdfName.MCR>
	//*  42   88:invokespecial   #368 <Method void PdfDictionary(PdfName)>
	//*  43   91:astore          6
	//*  44   93:aload           6
	//*  45   95:getstatic       #371 <Field PdfName PdfName.PG>
	//*  46   98:aload_0         
	//*  47   99:invokevirtual   #336 <Method PdfIndirectReference getCurrentPage()>
	//*  48  102:invokevirtual   #372 <Method void PdfDictionary.put(PdfName, PdfObject)>
	//*  49  105:aload           6
	//*  50  107:getstatic       #375 <Field PdfName PdfName.MCID>
	//*  51  110:new             #377 <Class PdfNumber>
	//*  52  113:dup             
	//*  53  114:iload_3         
	//*  54  115:invokespecial   #380 <Method void PdfNumber(int)>
	//*  55  118:invokevirtual   #372 <Method void PdfDictionary.put(PdfName, PdfObject)>
	//*  56  121:aload           5
	//*  57  123:aload           6
	//*  58  125:invokevirtual   #353 <Method boolean PdfArray.add(PdfObject)>
	//*  59  128:pop             
	//*  60  129:aload_1         
	//*  61  130:aload_0         
	//*  62  131:getfield        #172 <Field PdfDocument pdf>
	//*  63  134:aload_0         
	//*  64  135:invokevirtual   #336 <Method PdfIndirectReference getCurrentPage()>
	//*  65  138:invokevirtual   #384 <Method int PdfDocument.getStructParentIndex(Object)>
	//*  66  141:iconst_m1       
	//*  67  142:invokevirtual   #388 <Method void PdfStructureElement.setPageMark(int, int)>
	//*  68  145:aload_0         
	//*  69  146:aload_0         
	//*  70  147:invokevirtual   #391 <Method int getMcDepth()>
	//*  71  150:iconst_1        
	//*  72  151:iadd            
	//*  73  152:invokevirtual   #394 <Method void setMcDepth(int)>
	//*  74  155:aload_0         
	//*  75  156:getfield        #140 <Field ByteBuffer content>
	//*  76  159:invokevirtual   #395 <Method int ByteBuffer.size()>
	//*  77  162:istore          4
	//*  78  164:aload_0         
	//*  79  165:getfield        #140 <Field ByteBuffer content>
	//*  80  168:aload_1         
	//*  81  169:getstatic       #398 <Field PdfName PdfName.S>
	//*  82  172:invokevirtual   #335 <Method PdfObject PdfStructureElement.get(PdfName)>
	//*  83  175:invokevirtual   #399 <Method byte[] PdfObject.getBytes()>
	//*  84  178:invokevirtual   #290 <Method ByteBuffer ByteBuffer.append(byte[])>
	//*  85  181:ldc2            #401 <String " <</MCID ">
	//*  86  184:invokevirtual   #278 <Method ByteBuffer ByteBuffer.append(String)>
	//*  87  187:iload_3         
	//*  88  188:invokevirtual   #403 <Method ByteBuffer ByteBuffer.append(int)>
	//*  89  191:pop             
	//*  90  192:aload_2         
	//*  91  193:ifnull          217
	//*  92  196:aload_0         
	//*  93  197:getfield        #140 <Field ByteBuffer content>
	//*  94  200:ldc2            #405 <String "/E (">
	//*  95  203:invokevirtual   #278 <Method ByteBuffer ByteBuffer.append(String)>
	//*  96  206:aload_2         
	//*  97  207:invokevirtual   #278 <Method ByteBuffer ByteBuffer.append(String)>
	//*  98  210:ldc2            #407 <String ")">
	//*  99  213:invokevirtual   #278 <Method ByteBuffer ByteBuffer.append(String)>
	//* 100  216:pop             
	//* 101  217:aload_0         
	//* 102  218:getfield        #140 <Field ByteBuffer content>
	//* 103  221:ldc2            #409 <String ">> BDC">
	//* 104  224:invokevirtual   #278 <Method ByteBuffer ByteBuffer.append(String)>
	//* 105  227:aload_0         
	//* 106  228:getfield        #152 <Field int separator>
	//* 107  231:invokevirtual   #296 <Method ByteBuffer ByteBuffer.append_i(int)>
	//* 108  234:pop             
	//* 109  235:aload_0         
	//* 110  236:aload_0         
	//* 111  237:getfield        #142 <Field int markedContentSize>
	//* 112  240:aload_0         
	//* 113  241:getfield        #140 <Field ByteBuffer content>
	//* 114  244:invokevirtual   #395 <Method int ByteBuffer.size()>
	//* 115  247:iload           4
	//* 116  249:isub            
	//* 117  250:iadd            
	//* 118  251:putfield        #142 <Field int markedContentSize>
	//* 119  254:return          
			if(((PdfObject) (obj)).isArray())
	//* 120  255:aload           6
	//* 121  257:invokevirtual   #412 <Method boolean PdfObject.isArray()>
	//* 122  260:ifeq            273
				pdfarray = (PdfArray)obj;
	//  123  263:aload           6
	//  124  265:checkcast       #349 <Class PdfArray>
	//  125  268:astore          5
			else
	//* 126  270:goto            72
				throw new IllegalArgumentException(MessageLocalization.getComposedMessage("unknown.object.at.k.1", new Object[] {
					obj.getClass().toString()
				}));
	//  127  273:new             #414 <Class IllegalArgumentException>
	//  128  276:dup             
	//  129  277:ldc2            #416 <String "unknown.object.at.k.1">
	//  130  280:iconst_1        
	//  131  281:anewarray       Object[]
	//  132  284:dup             
	//  133  285:iconst_0        
	//  134  286:aload           6
	//  135  288:invokevirtual   #420 <Method Class Object.getClass()>
	//  136  291:invokevirtual   #426 <Method String Class.toString()>
	//  137  294:aastore         
	//  138  295:invokestatic    #239 <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//  139  298:invokespecial   #427 <Method void IllegalArgumentException(String)>
	//  140  301:athrow          
			if(pdfarray.getAsNumber(0) != null)
			{
				obj = ((Object) (new PdfDictionary(PdfName.MCR)));
				((PdfDictionary) (obj)).put(PdfName.PG, ((PdfObject) (getCurrentPage())));
				((PdfDictionary) (obj)).put(PdfName.MCID, ((PdfObject) (new PdfNumber(i))));
				pdfarray.add(((PdfObject) (obj)));
			}
			pdfstructureelement.setPageMark(pdf.getStructParentIndex(((Object) (getCurrentPage()))), -1);
		} else
		{
			pdfstructureelement.setPageMark(j, i);
	//  141  302:aload_1         
	//  142  303:iload           4
	//  143  305:iload_3         
	//  144  306:invokevirtual   #388 <Method void PdfStructureElement.setPageMark(int, int)>
			pdfstructureelement.put(PdfName.PG, ((PdfObject) (getCurrentPage())));
	//  145  309:aload_1         
	//  146  310:getstatic       #371 <Field PdfName PdfName.PG>
	//  147  313:aload_0         
	//  148  314:invokevirtual   #336 <Method PdfIndirectReference getCurrentPage()>
	//  149  317:invokevirtual   #356 <Method void PdfStructureElement.put(PdfName, PdfObject)>
		}
		setMcDepth(getMcDepth() + 1);
		j = content.size();
		content.append(pdfstructureelement.get(PdfName.S).getBytes()).append(" <</MCID ").append(i);
		if(s != null)
			content.append("/E (").append(s).append(")");
		content.append(">> BDC").append_i(separator);
		markedContentSize = markedContentSize + (content.size() - j);
	//* 150  320:goto            145
	}

	public static ArrayList bezierArc(double d, double d1, double d2, double d3, 
			double d4, double d5)
	{
		double d7 = d;
	//    0    0:dload_0         
	//    1    1:dstore          14
		double d6 = d2;
	//    2    3:dload           4
	//    3    5:dstore          12
		if(d > d2)
	//*   4    7:dload_0         
	//*   5    8:dload           4
	//*   6   10:dcmpl           
	//*   7   11:ifle            21
		{
			d6 = d;
	//    8   14:dload_0         
	//    9   15:dstore          12
			d7 = d2;
	//   10   17:dload           4
	//   11   19:dstore          14
		}
		double d9 = d1;
	//   12   21:dload_2         
	//   13   22:dstore          16
		d2 = d3;
	//   14   24:dload           6
	//   15   26:dstore          4
		if(d3 > d1)
	//*  16   28:dload           6
	//*  17   30:dload_2         
	//*  18   31:dcmpl           
	//*  19   32:ifle            42
		{
			d2 = d1;
	//   20   35:dload_2         
	//   21   36:dstore          4
			d9 = d3;
	//   22   38:dload           6
	//   23   40:dstore          16
		}
		int i;
		int j;
		ArrayList arraylist;
		if(Math.abs(d5) <= 90D)
	//*  24   42:dload           10
	//*  25   44:invokestatic    #435 <Method double Math.abs(double)>
	//*  26   47:ldc2w           #436 <Double 90D>
	//*  27   50:dcmpg           
	//*  28   51:ifgt            356
		{
			d = d5;
	//   29   54:dload           10
	//   30   56:dstore_0        
			i = 1;
	//   31   57:iconst_1        
	//   32   58:istore          22
		} else
	//*  33   60:dload           14
	//*  34   62:dload           12
	//*  35   64:dadd            
	//*  36   65:ldc2w           #438 <Double 2D>
	//*  37   68:ddiv            
	//*  38   69:dstore_2        
	//*  39   70:dload           16
	//*  40   72:dload           4
	//*  41   74:dadd            
	//*  42   75:ldc2w           #438 <Double 2D>
	//*  43   78:ddiv            
	//*  44   79:dstore          6
	//*  45   81:dload           12
	//*  46   83:dload           14
	//*  47   85:dsub            
	//*  48   86:ldc2w           #438 <Double 2D>
	//*  49   89:ddiv            
	//*  50   90:dstore          10
	//*  51   92:dload           4
	//*  52   94:dload           16
	//*  53   96:dsub            
	//*  54   97:ldc2w           #438 <Double 2D>
	//*  55  100:ddiv            
	//*  56  101:dstore          4
	//*  57  103:ldc2w           #440 <Double 3.1415926535897931D>
	//*  58  106:dload_0         
	//*  59  107:dmul            
	//*  60  108:ldc2w           #442 <Double 360D>
	//*  61  111:ddiv            
	//*  62  112:dstore          12
	//*  63  114:ldc2w           #444 <Double 1.3333333333333333D>
	//*  64  117:dconst_1        
	//*  65  118:dload           12
	//*  66  120:invokestatic    #448 <Method double Math.cos(double)>
	//*  67  123:dsub            
	//*  68  124:dmul            
	//*  69  125:dload           12
	//*  70  127:invokestatic    #451 <Method double Math.sin(double)>
	//*  71  130:ddiv            
	//*  72  131:invokestatic    #435 <Method double Math.abs(double)>
	//*  73  134:dstore          12
	//*  74  136:new             #147 <Class ArrayList>
	//*  75  139:dup             
	//*  76  140:invokespecial   #148 <Method void ArrayList()>
	//*  77  143:astore          24
	//*  78  145:iconst_0        
	//*  79  146:istore          23
	//*  80  148:iload           23
	//*  81  150:iload           22
	//*  82  152:icmpge          504
	//*  83  155:iload           23
	//*  84  157:i2d             
	//*  85  158:dload_0         
	//*  86  159:dmul            
	//*  87  160:dload           8
	//*  88  162:dadd            
	//*  89  163:ldc2w           #440 <Double 3.1415926535897931D>
	//*  90  166:dmul            
	//*  91  167:ldc2w           #452 <Double 180D>
	//*  92  170:ddiv            
	//*  93  171:dstore          20
	//*  94  173:iload           23
	//*  95  175:iconst_1        
	//*  96  176:iadd            
	//*  97  177:i2d             
	//*  98  178:dload_0         
	//*  99  179:dmul            
	//* 100  180:dload           8
	//* 101  182:dadd            
	//* 102  183:ldc2w           #440 <Double 3.1415926535897931D>
	//* 103  186:dmul            
	//* 104  187:ldc2w           #452 <Double 180D>
	//* 105  190:ddiv            
	//* 106  191:dstore          18
	//* 107  193:dload           20
	//* 108  195:invokestatic    #448 <Method double Math.cos(double)>
	//* 109  198:dstore          14
	//* 110  200:dload           18
	//* 111  202:invokestatic    #448 <Method double Math.cos(double)>
	//* 112  205:dstore          16
	//* 113  207:dload           20
	//* 114  209:invokestatic    #451 <Method double Math.sin(double)>
	//* 115  212:dstore          20
	//* 116  214:dload           18
	//* 117  216:invokestatic    #451 <Method double Math.sin(double)>
	//* 118  219:dstore          18
	//* 119  221:dload_0         
	//* 120  222:dconst_0        
	//* 121  223:dcmpl           
	//* 122  224:ifle            381
	//* 123  227:aload           24
	//* 124  229:bipush          8
	//* 125  231:newarray        double[]
	//* 126  233:dup             
	//* 127  234:iconst_0        
	//* 128  235:dload           10
	//* 129  237:dload           14
	//* 130  239:dmul            
	//* 131  240:dload_2         
	//* 132  241:dadd            
	//* 133  242:dastore         
	//* 134  243:dup             
	//* 135  244:iconst_1        
	//* 136  245:dload           6
	//* 137  247:dload           4
	//* 138  249:dload           20
	//* 139  251:dmul            
	//* 140  252:dsub            
	//* 141  253:dastore         
	//* 142  254:dup             
	//* 143  255:iconst_2        
	//* 144  256:dload           14
	//* 145  258:dload           12
	//* 146  260:dload           20
	//* 147  262:dmul            
	//* 148  263:dsub            
	//* 149  264:dload           10
	//* 150  266:dmul            
	//* 151  267:dload_2         
	//* 152  268:dadd            
	//* 153  269:dastore         
	//* 154  270:dup             
	//* 155  271:iconst_3        
	//* 156  272:dload           6
	//* 157  274:dload           12
	//* 158  276:dload           14
	//* 159  278:dmul            
	//* 160  279:dload           20
	//* 161  281:dadd            
	//* 162  282:dload           4
	//* 163  284:dmul            
	//* 164  285:dsub            
	//* 165  286:dastore         
	//* 166  287:dup             
	//* 167  288:iconst_4        
	//* 168  289:dload           12
	//* 169  291:dload           18
	//* 170  293:dmul            
	//* 171  294:dload           16
	//* 172  296:dadd            
	//* 173  297:dload           10
	//* 174  299:dmul            
	//* 175  300:dload_2         
	//* 176  301:dadd            
	//* 177  302:dastore         
	//* 178  303:dup             
	//* 179  304:iconst_5        
	//* 180  305:dload           6
	//* 181  307:dload           18
	//* 182  309:dload           12
	//* 183  311:dload           16
	//* 184  313:dmul            
	//* 185  314:dsub            
	//* 186  315:dload           4
	//* 187  317:dmul            
	//* 188  318:dsub            
	//* 189  319:dastore         
	//* 190  320:dup             
	//* 191  321:bipush          6
	//* 192  323:dload           10
	//* 193  325:dload           16
	//* 194  327:dmul            
	//* 195  328:dload_2         
	//* 196  329:dadd            
	//* 197  330:dastore         
	//* 198  331:dup             
	//* 199  332:bipush          7
	//* 200  334:dload           6
	//* 201  336:dload           4
	//* 202  338:dload           18
	//* 203  340:dmul            
	//* 204  341:dsub            
	//* 205  342:dastore         
	//* 206  343:invokevirtual   #273 <Method boolean ArrayList.add(Object)>
	//* 207  346:pop             
	//* 208  347:iload           23
	//* 209  349:iconst_1        
	//* 210  350:iadd            
	//* 211  351:istore          23
	//* 212  353:goto            148
		{
			i = (int)Math.ceil(Math.abs(d5) / 90D);
	//  213  356:dload           10
	//  214  358:invokestatic    #435 <Method double Math.abs(double)>
	//  215  361:ldc2w           #436 <Double 90D>
	//  216  364:ddiv            
	//  217  365:invokestatic    #456 <Method double Math.ceil(double)>
	//  218  368:d2i             
	//  219  369:istore          22
			d = d5 / (double)i;
	//  220  371:dload           10
	//  221  373:iload           22
	//  222  375:i2d             
	//  223  376:ddiv            
	//  224  377:dstore_0        
		}
		d1 = (d7 + d6) / 2D;
		d3 = (d9 + d2) / 2D;
		d5 = (d6 - d7) / 2D;
		d2 = (d2 - d9) / 2D;
		d6 = (3.1415926535897931D * d) / 360D;
		d6 = Math.abs((1.3333333333333333D * (1.0D - Math.cos(d6))) / Math.sin(d6));
		arraylist = new ArrayList();
		j = 0;
		while(j < i) 
		{
			double d12 = (((double)j * d + d4) * 3.1415926535897931D) / 180D;
			double d11 = (((double)(j + 1) * d + d4) * 3.1415926535897931D) / 180D;
			double d8 = Math.cos(d12);
			double d10 = Math.cos(d11);
			d12 = Math.sin(d12);
			d11 = Math.sin(d11);
			if(d > 0.0D)
				arraylist.add(((Object) (new double[] {
					d5 * d8 + d1, d3 - d2 * d12, (d8 - d6 * d12) * d5 + d1, d3 - (d6 * d8 + d12) * d2, (d6 * d11 + d10) * d5 + d1, d3 - (d11 - d6 * d10) * d2, d5 * d10 + d1, d3 - d2 * d11
				})));
			else
	//* 225  378:goto            60
				arraylist.add(((Object) (new double[] {
					d5 * d8 + d1, d3 - d2 * d12, (d6 * d12 + d8) * d5 + d1, d3 - (d12 - d6 * d8) * d2, (d10 - d6 * d11) * d5 + d1, d3 - (d6 * d10 + d11) * d2, d5 * d10 + d1, d3 - d2 * d11
				})));
	//  226  381:aload           24
	//  227  383:bipush          8
	//  228  385:newarray        double[]
	//  229  387:dup             
	//  230  388:iconst_0        
	//  231  389:dload           10
	//  232  391:dload           14
	//  233  393:dmul            
	//  234  394:dload_2         
	//  235  395:dadd            
	//  236  396:dastore         
	//  237  397:dup             
	//  238  398:iconst_1        
	//  239  399:dload           6
	//  240  401:dload           4
	//  241  403:dload           20
	//  242  405:dmul            
	//  243  406:dsub            
	//  244  407:dastore         
	//  245  408:dup             
	//  246  409:iconst_2        
	//  247  410:dload           12
	//  248  412:dload           20
	//  249  414:dmul            
	//  250  415:dload           14
	//  251  417:dadd            
	//  252  418:dload           10
	//  253  420:dmul            
	//  254  421:dload_2         
	//  255  422:dadd            
	//  256  423:dastore         
	//  257  424:dup             
	//  258  425:iconst_3        
	//  259  426:dload           6
	//  260  428:dload           20
	//  261  430:dload           12
	//  262  432:dload           14
	//  263  434:dmul            
	//  264  435:dsub            
	//  265  436:dload           4
	//  266  438:dmul            
	//  267  439:dsub            
	//  268  440:dastore         
	//  269  441:dup             
	//  270  442:iconst_4        
	//  271  443:dload           16
	//  272  445:dload           12
	//  273  447:dload           18
	//  274  449:dmul            
	//  275  450:dsub            
	//  276  451:dload           10
	//  277  453:dmul            
	//  278  454:dload_2         
	//  279  455:dadd            
	//  280  456:dastore         
	//  281  457:dup             
	//  282  458:iconst_5        
	//  283  459:dload           6
	//  284  461:dload           12
	//  285  463:dload           16
	//  286  465:dmul            
	//  287  466:dload           18
	//  288  468:dadd            
	//  289  469:dload           4
	//  290  471:dmul            
	//  291  472:dsub            
	//  292  473:dastore         
	//  293  474:dup             
	//  294  475:bipush          6
	//  295  477:dload           10
	//  296  479:dload           16
	//  297  481:dmul            
	//  298  482:dload_2         
	//  299  483:dadd            
	//  300  484:dastore         
	//  301  485:dup             
	//  302  486:bipush          7
	//  303  488:dload           6
	//  304  490:dload           4
	//  305  492:dload           18
	//  306  494:dmul            
	//  307  495:dsub            
	//  308  496:dastore         
	//  309  497:invokevirtual   #273 <Method boolean ArrayList.add(Object)>
	//  310  500:pop             
			j++;
		}
	//* 311  501:goto            347
		return arraylist;
	//  312  504:aload           24
	//  313  506:areturn         
	}

	public static ArrayList bezierArc(float f, float f1, float f2, float f3, float f4, float f5)
	{
		return bezierArc(f, f1, f2, f3, f4, f5);
	//    0    0:fload_0         
	//    1    1:f2d             
	//    2    2:fload_1         
	//    3    3:f2d             
	//    4    4:fload_2         
	//    5    5:f2d             
	//    6    6:fload_3         
	//    7    7:f2d             
	//    8    8:fload           4
	//    9   10:f2d             
	//   10   11:fload           5
	//   11   13:f2d             
	//   12   14:invokestatic    #461 <Method ArrayList bezierArc(double, double, double, double, double, double)>
	//   13   17:areturn         
	}

	private void closeMCBlockInt(IAccessibleElement iaccessibleelement)
	{
		if(isTagged() && iaccessibleelement.getRole() != null)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #220 <Method boolean isTagged()>
	//*   2    4:ifeq            79
	//*   3    7:aload_1         
	//*   4    8:invokeinterface #469 <Method PdfName IAccessibleElement.getRole()>
	//*   5   13:ifnull          79
		{
			PdfStructureElement pdfstructureelement = pdf.getStructElement(iaccessibleelement.getId());
	//    6   16:aload_0         
	//    7   17:getfield        #172 <Field PdfDocument pdf>
	//    8   20:aload_1         
	//    9   21:invokeinterface #473 <Method com.itextpdf.text.AccessibleElementId IAccessibleElement.getId()>
	//   10   26:invokevirtual   #477 <Method PdfStructureElement PdfDocument.getStructElement(com.itextpdf.text.AccessibleElementId)>
	//   11   29:astore_3        
			if(pdfstructureelement != null)
	//*  12   30:aload_3         
	//*  13   31:ifnull          39
				pdfstructureelement.writeAttributes(iaccessibleelement);
	//   14   34:aload_3         
	//   15   35:aload_1         
	//   16   36:invokevirtual   #480 <Method void PdfStructureElement.writeAttributes(IAccessibleElement)>
			if(writer.needToBeMarkedInContent(iaccessibleelement))
	//*  17   39:aload_0         
	//*  18   40:getfield        #164 <Field PdfWriter writer>
	//*  19   43:aload_1         
	//*  20   44:invokevirtual   #484 <Method boolean PdfWriter.needToBeMarkedInContent(IAccessibleElement)>
	//*  21   47:ifeq            79
			{
				boolean flag = inText;
	//   22   50:aload_0         
	//   23   51:getfield        #156 <Field boolean inText>
	//   24   54:istore_2        
				if(inText)
	//*  25   55:aload_0         
	//*  26   56:getfield        #156 <Field boolean inText>
	//*  27   59:ifeq            66
					endText();
	//   28   62:aload_0         
	//   29   63:invokevirtual   #223 <Method void endText()>
				endMarkedContentSequence();
	//   30   66:aload_0         
	//   31   67:invokevirtual   #487 <Method void endMarkedContentSequence()>
				if(flag)
	//*  32   70:iload_2         
	//*  33   71:ifeq            79
					beginText(true);
	//   34   74:aload_0         
	//   35   75:iconst_1        
	//   36   76:invokevirtual   #490 <Method void beginText(boolean)>
			}
		}
	//   37   79:return          
	}

	private boolean compareColors(BaseColor basecolor, BaseColor basecolor1)
	{
		if(basecolor == null && basecolor1 == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       10
	//*   2    4:aload_2         
	//*   3    5:ifnonnull       10
			return true;
	//    4    8:iconst_1        
	//    5    9:ireturn         
		if(basecolor == null || basecolor1 == null)
	//*   6   10:aload_1         
	//*   7   11:ifnull          18
	//*   8   14:aload_2         
	//*   9   15:ifnonnull       20
			return false;
	//   10   18:iconst_0        
	//   11   19:ireturn         
		if(basecolor instanceof ExtendedColor)
	//*  12   20:aload_1         
	//*  13   21:instanceof      #494 <Class ExtendedColor>
	//*  14   24:ifeq            33
			return basecolor.equals(((Object) (basecolor1)));
	//   15   27:aload_1         
	//   16   28:aload_2         
	//   17   29:invokevirtual   #499 <Method boolean BaseColor.equals(Object)>
	//   18   32:ireturn         
		else
			return basecolor1.equals(((Object) (basecolor)));
	//   19   33:aload_2         
	//   20   34:aload_1         
	//   21   35:invokevirtual   #499 <Method boolean BaseColor.equals(Object)>
	//   22   38:ireturn         
	}

	private void ensureDocumentTagIsOpen()
	{
		if(pdf.openMCDocument)
	//*   0    0:aload_0         
	//*   1    1:getfield        #172 <Field PdfDocument pdf>
	//*   2    4:getfield        #502 <Field boolean PdfDocument.openMCDocument>
	//*   3    7:ifeq            32
		{
			pdf.openMCDocument = false;
	//    4   10:aload_0         
	//    5   11:getfield        #172 <Field PdfDocument pdf>
	//    6   14:iconst_0        
	//    7   15:putfield        #502 <Field boolean PdfDocument.openMCDocument>
			writer.getDirectContentUnder().openMCBlock(((IAccessibleElement) (pdf)));
	//    8   18:aload_0         
	//    9   19:getfield        #164 <Field PdfWriter writer>
	//   10   22:invokevirtual   #506 <Method PdfContentByte PdfWriter.getDirectContentUnder()>
	//   11   25:aload_0         
	//   12   26:getfield        #172 <Field PdfDocument pdf>
	//   13   29:invokevirtual   #307 <Method void openMCBlock(IAccessibleElement)>
		}
	//   14   32:return          
	}

	private float getEffectiveStringWidth(String s, boolean flag, float f)
	{
		BaseFont basefont = state.fontDetails.getBaseFont();
	//    0    0:aload_0         
	//    1    1:getfield        #145 <Field PdfContentByte$GraphicState state>
	//    2    4:getfield        #512 <Field FontDetails PdfContentByte$GraphicState.fontDetails>
	//    3    7:invokevirtual   #518 <Method BaseFont FontDetails.getBaseFont()>
	//    4   10:astore          7
		float f1;
		float f2;
		if(flag)
	//*   5   12:iload_2         
	//*   6   13:ifeq            160
			f2 = basefont.getWidthPointKerned(s, state.size);
	//    7   16:aload           7
	//    8   18:aload_1         
	//    9   19:aload_0         
	//   10   20:getfield        #145 <Field PdfContentByte$GraphicState state>
	//   11   23:getfield        #521 <Field float PdfContentByte$GraphicState.size>
	//   12   26:invokevirtual   #527 <Method float BaseFont.getWidthPointKerned(String, float)>
	//   13   29:fstore          5
		else
	//*  14   31:fload           5
	//*  15   33:fstore          4
	//*  16   35:aload_0         
	//*  17   36:getfield        #145 <Field PdfContentByte$GraphicState state>
	//*  18   39:getfield        #530 <Field float PdfContentByte$GraphicState.charSpace>
	//*  19   42:fconst_0        
	//*  20   43:fcmpl           
	//*  21   44:ifeq            76
	//*  22   47:fload           5
	//*  23   49:fstore          4
	//*  24   51:aload_1         
	//*  25   52:invokevirtual   #535 <Method int String.length()>
	//*  26   55:ifle            76
	//*  27   58:fload           5
	//*  28   60:aload_0         
	//*  29   61:getfield        #145 <Field PdfContentByte$GraphicState state>
	//*  30   64:getfield        #530 <Field float PdfContentByte$GraphicState.charSpace>
	//*  31   67:aload_1         
	//*  32   68:invokevirtual   #535 <Method int String.length()>
	//*  33   71:i2f             
	//*  34   72:fmul            
	//*  35   73:fadd            
	//*  36   74:fstore          4
	//*  37   76:fload           4
	//*  38   78:fstore          5
	//*  39   80:aload_0         
	//*  40   81:getfield        #145 <Field PdfContentByte$GraphicState state>
	//*  41   84:getfield        #538 <Field float PdfContentByte$GraphicState.wordSpace>
	//*  42   87:fconst_0        
	//*  43   88:fcmpl           
	//*  44   89:ifeq            178
	//*  45   92:fload           4
	//*  46   94:fstore          5
	//*  47   96:aload           7
	//*  48   98:invokevirtual   #541 <Method boolean BaseFont.isVertical()>
	//*  49  101:ifne            178
	//*  50  104:iconst_0        
	//*  51  105:istore          6
	//*  52  107:fload           4
	//*  53  109:fstore          5
	//*  54  111:iload           6
	//*  55  113:aload_1         
	//*  56  114:invokevirtual   #535 <Method int String.length()>
	//*  57  117:icmpge          178
	//*  58  120:fload           4
	//*  59  122:fstore          5
	//*  60  124:aload_1         
	//*  61  125:iload           6
	//*  62  127:invokevirtual   #545 <Method char String.charAt(int)>
	//*  63  130:bipush          32
	//*  64  132:icmpne          147
	//*  65  135:fload           4
	//*  66  137:aload_0         
	//*  67  138:getfield        #145 <Field PdfContentByte$GraphicState state>
	//*  68  141:getfield        #538 <Field float PdfContentByte$GraphicState.wordSpace>
	//*  69  144:fadd            
	//*  70  145:fstore          5
	//*  71  147:iload           6
	//*  72  149:iconst_1        
	//*  73  150:iadd            
	//*  74  151:istore          6
	//*  75  153:fload           5
	//*  76  155:fstore          4
	//*  77  157:goto            107
			f2 = basefont.getWidthPoint(s, state.size);
	//   78  160:aload           7
	//   79  162:aload_1         
	//   80  163:aload_0         
	//   81  164:getfield        #145 <Field PdfContentByte$GraphicState state>
	//   82  167:getfield        #521 <Field float PdfContentByte$GraphicState.size>
	//   83  170:invokevirtual   #548 <Method float BaseFont.getWidthPoint(String, float)>
	//   84  173:fstore          5
		f1 = f2;
		if(state.charSpace != 0.0F)
		{
			f1 = f2;
			if(s.length() > 0)
				f1 = f2 + state.charSpace * (float)s.length();
		}
		f2 = f1;
		if(state.wordSpace != 0.0F)
		{
			f2 = f1;
			if(!basefont.isVertical())
			{
				int i = 0;
				do
				{
					f2 = f1;
					if(i >= s.length())
						break;
					f2 = f1;
					if(s.charAt(i) == ' ')
						f2 = f1 + state.wordSpace;
					i++;
					f1 = f2;
				} while(true);
			}
		}
	//*  85  175:goto            31
		f1 = f2 - (f / 1000F) * state.size;
	//   86  178:fload           5
	//   87  180:fload_3         
	//   88  181:ldc2            #549 <Float 1000F>
	//   89  184:fdiv            
	//   90  185:aload_0         
	//   91  186:getfield        #145 <Field PdfContentByte$GraphicState state>
	//   92  189:getfield        #521 <Field float PdfContentByte$GraphicState.size>
	//   93  192:fmul            
	//   94  193:fsub            
	//   95  194:fstore          4
		f = f1;
	//   96  196:fload           4
	//   97  198:fstore_3        
		if((double)state.scale != 100D)
	//*  98  199:aload_0         
	//*  99  200:getfield        #145 <Field PdfContentByte$GraphicState state>
	//* 100  203:getfield        #552 <Field float PdfContentByte$GraphicState.scale>
	//* 101  206:f2d             
	//* 102  207:ldc2w           #553 <Double 100D>
	//* 103  210:dcmpl           
	//* 104  211:ifeq            229
			f = (state.scale * f1) / 100F;
	//  105  214:aload_0         
	//  106  215:getfield        #145 <Field PdfContentByte$GraphicState state>
	//  107  218:getfield        #552 <Field float PdfContentByte$GraphicState.scale>
	//  108  221:fload           4
	//  109  223:fmul            
	//  110  224:ldc2            #555 <Float 100F>
	//  111  227:fdiv            
	//  112  228:fstore_3        
		return f;
	//  113  229:fload_3         
	//  114  230:freturn         
	}

	public static PdfTextArray getKernArray(String s, BaseFont basefont)
	{
		PdfTextArray pdftextarray = new PdfTextArray();
	//    0    0:new             #559 <Class PdfTextArray>
	//    1    3:dup             
	//    2    4:invokespecial   #560 <Method void PdfTextArray()>
	//    3    7:astore          6
		StringBuffer stringbuffer = new StringBuffer();
	//    4    9:new             #562 <Class StringBuffer>
	//    5   12:dup             
	//    6   13:invokespecial   #563 <Method void StringBuffer()>
	//    7   16:astore          7
		int j = s.length() - 1;
	//    8   18:aload_0         
	//    9   19:invokevirtual   #535 <Method int String.length()>
	//   10   22:iconst_1        
	//   11   23:isub            
	//   12   24:istore          4
		s = ((String) (s.toCharArray()));
	//   13   26:aload_0         
	//   14   27:invokevirtual   #567 <Method char[] String.toCharArray()>
	//   15   30:astore_0        
		if(j >= 0)
	//*  16   31:iload           4
	//*  17   33:iflt            45
			stringbuffer.append(((char []) (s)), 0, 1);
	//   18   36:aload           7
	//   19   38:aload_0         
	//   20   39:iconst_0        
	//   21   40:iconst_1        
	//   22   41:invokevirtual   #570 <Method StringBuffer StringBuffer.append(char[], int, int)>
	//   23   44:pop             
		int i = 0;
	//   24   45:iconst_0        
	//   25   46:istore_3        
		while(i < j) 
	//*  26   47:iload_3         
	//*  27   48:iload           4
	//*  28   50:icmpge          127
		{
			char c = s[i + 1];
	//   29   53:aload_0         
	//   30   54:iload_3         
	//   31   55:iconst_1        
	//   32   56:iadd            
	//   33   57:caload          
	//   34   58:istore_2        
			int k = basefont.getKerning(((int) (s[i])), ((int) (c)));
	//   35   59:aload_1         
	//   36   60:aload_0         
	//   37   61:iload_3         
	//   38   62:caload          
	//   39   63:iload_2         
	//   40   64:invokevirtual   #574 <Method int BaseFont.getKerning(int, int)>
	//   41   67:istore          5
			if(k == 0)
	//*  42   69:iload           5
	//*  43   71:ifne            88
			{
				stringbuffer.append(c);
	//   44   74:aload           7
	//   45   76:iload_2         
	//   46   77:invokevirtual   #577 <Method StringBuffer StringBuffer.append(char)>
	//   47   80:pop             
			} else
	//*  48   81:iload_3         
	//*  49   82:iconst_1        
	//*  50   83:iadd            
	//*  51   84:istore_3        
	//*  52   85:goto            47
			{
				pdftextarray.add(stringbuffer.toString());
	//   53   88:aload           6
	//   54   90:aload           7
	//   55   92:invokevirtual   #578 <Method String StringBuffer.toString()>
	//   56   95:invokevirtual   #580 <Method void PdfTextArray.add(String)>
				stringbuffer.setLength(0);
	//   57   98:aload           7
	//   58  100:iconst_0        
	//   59  101:invokevirtual   #583 <Method void StringBuffer.setLength(int)>
				stringbuffer.append(((char []) (s)), i + 1, 1);
	//   60  104:aload           7
	//   61  106:aload_0         
	//   62  107:iload_3         
	//   63  108:iconst_1        
	//   64  109:iadd            
	//   65  110:iconst_1        
	//   66  111:invokevirtual   #570 <Method StringBuffer StringBuffer.append(char[], int, int)>
	//   67  114:pop             
				pdftextarray.add(-k);
	//   68  115:aload           6
	//   69  117:iload           5
	//   70  119:ineg            
	//   71  120:i2f             
	//   72  121:invokevirtual   #586 <Method void PdfTextArray.add(float)>
			}
			i++;
		}
	//*  73  124:goto            81
		pdftextarray.add(stringbuffer.toString());
	//   74  127:aload           6
	//   75  129:aload           7
	//   76  131:invokevirtual   #578 <Method String StringBuffer.toString()>
	//   77  134:invokevirtual   #580 <Method void PdfTextArray.add(String)>
		return pdftextarray;
	//   78  137:aload           6
	//   79  139:areturn         
	}

	private PdfDictionary getParentStructureElement()
	{
		PdfStructureElement pdfstructureelement = null;
	//    0    0:aconst_null     
	//    1    1:astore_1        
		if(getMcElements().size() > 0)
	//*   2    2:aload_0         
	//*   3    3:invokevirtual   #260 <Method ArrayList getMcElements()>
	//*   4    6:invokevirtual   #264 <Method int ArrayList.size()>
	//*   5    9:ifle            44
			pdfstructureelement = pdf.getStructElement(((IAccessibleElement)getMcElements().get(getMcElements().size() - 1)).getId());
	//    6   12:aload_0         
	//    7   13:getfield        #172 <Field PdfDocument pdf>
	//    8   16:aload_0         
	//    9   17:invokevirtual   #260 <Method ArrayList getMcElements()>
	//   10   20:aload_0         
	//   11   21:invokevirtual   #260 <Method ArrayList getMcElements()>
	//   12   24:invokevirtual   #264 <Method int ArrayList.size()>
	//   13   27:iconst_1        
	//   14   28:isub            
	//   15   29:invokevirtual   #269 <Method Object ArrayList.get(int)>
	//   16   32:checkcast       #465 <Class IAccessibleElement>
	//   17   35:invokeinterface #473 <Method com.itextpdf.text.AccessibleElementId IAccessibleElement.getId()>
	//   18   40:invokevirtual   #477 <Method PdfStructureElement PdfDocument.getStructElement(com.itextpdf.text.AccessibleElementId)>
	//   19   43:astore_1        
		Object obj = ((Object) (pdfstructureelement));
	//   20   44:aload_1         
	//   21   45:astore_2        
		if(pdfstructureelement == null)
	//*  22   46:aload_1         
	//*  23   47:ifnonnull       58
			obj = ((Object) (writer.getStructureTreeRoot()));
	//   24   50:aload_0         
	//   25   51:getfield        #164 <Field PdfWriter writer>
	//   26   54:invokevirtual   #592 <Method PdfStructureTreeRoot PdfWriter.getStructureTreeRoot()>
	//   27   57:astore_2        
		return ((PdfDictionary) (obj));
	//   28   58:aload_2         
	//   29   59:areturn         
	}

	private PdfStructureElement openMCBlockInt(IAccessibleElement iaccessibleelement)
	{
		Object obj4 = null;
	//    0    0:aconst_null     
	//    1    1:astore          6
		Object obj2 = null;
	//    2    3:aconst_null     
	//    3    4:astore          5
		Object obj1 = ((Object) (obj4));
	//    4    6:aload           6
	//    5    8:astore          4
		if(isTagged())
	//*   6   10:aload_0         
	//*   7   11:invokevirtual   #220 <Method boolean isTagged()>
	//*   8   14:ifeq            302
		{
			IAccessibleElement iaccessibleelement1 = null;
	//    9   17:aconst_null     
	//   10   18:astore_3        
			if(getMcElements().size() > 0)
	//*  11   19:aload_0         
	//*  12   20:invokevirtual   #260 <Method ArrayList getMcElements()>
	//*  13   23:invokevirtual   #264 <Method int ArrayList.size()>
	//*  14   26:ifle            49
				iaccessibleelement1 = (IAccessibleElement)getMcElements().get(getMcElements().size() - 1);
	//   15   29:aload_0         
	//   16   30:invokevirtual   #260 <Method ArrayList getMcElements()>
	//   17   33:aload_0         
	//   18   34:invokevirtual   #260 <Method ArrayList getMcElements()>
	//   19   37:invokevirtual   #264 <Method int ArrayList.size()>
	//   20   40:iconst_1        
	//   21   41:isub            
	//   22   42:invokevirtual   #269 <Method Object ArrayList.get(int)>
	//   23   45:checkcast       #465 <Class IAccessibleElement>
	//   24   48:astore_3        
			writer.checkElementRole(iaccessibleelement, iaccessibleelement1);
	//   25   49:aload_0         
	//   26   50:getfield        #164 <Field PdfWriter writer>
	//   27   53:aload_1         
	//   28   54:aload_3         
	//   29   55:invokevirtual   #598 <Method void PdfWriter.checkElementRole(IAccessibleElement, IAccessibleElement)>
			obj1 = ((Object) (obj4));
	//   30   58:aload           6
	//   31   60:astore          4
			if(iaccessibleelement.getRole() != null)
	//*  32   62:aload_1         
	//*  33   63:invokeinterface #469 <Method PdfName IAccessibleElement.getRole()>
	//*  34   68:ifnull          302
			{
				Object obj = ((Object) (obj2));
	//   35   71:aload           5
	//   36   73:astore_3        
				if(!PdfName.ARTIFACT.equals(((Object) (iaccessibleelement.getRole()))))
	//*  37   74:getstatic       #601 <Field PdfName PdfName.ARTIFACT>
	//*  38   77:aload_1         
	//*  39   78:invokeinterface #469 <Method PdfName IAccessibleElement.getRole()>
	//*  40   83:invokevirtual   #602 <Method boolean PdfName.equals(Object)>
	//*  41   86:ifne            136
				{
					obj1 = ((Object) (pdf.getStructElement(iaccessibleelement.getId())));
	//   42   89:aload_0         
	//   43   90:getfield        #172 <Field PdfDocument pdf>
	//   44   93:aload_1         
	//   45   94:invokeinterface #473 <Method com.itextpdf.text.AccessibleElementId IAccessibleElement.getId()>
	//   46   99:invokevirtual   #477 <Method PdfStructureElement PdfDocument.getStructElement(com.itextpdf.text.AccessibleElementId)>
	//   47  102:astore          4
					obj = obj1;
	//   48  104:aload           4
	//   49  106:astore_3        
					if(obj1 == null)
	//*  50  107:aload           4
	//*  51  109:ifnonnull       136
						obj = ((Object) (new PdfStructureElement(getParentStructureElement(), iaccessibleelement.getRole(), iaccessibleelement.getId())));
	//   52  112:new             #332 <Class PdfStructureElement>
	//   53  115:dup             
	//   54  116:aload_0         
	//   55  117:invokespecial   #604 <Method PdfDictionary getParentStructureElement()>
	//   56  120:aload_1         
	//   57  121:invokeinterface #469 <Method PdfName IAccessibleElement.getRole()>
	//   58  126:aload_1         
	//   59  127:invokeinterface #473 <Method com.itextpdf.text.AccessibleElementId IAccessibleElement.getId()>
	//   60  132:invokespecial   #607 <Method void PdfStructureElement(PdfDictionary, PdfName, com.itextpdf.text.AccessibleElementId)>
	//   61  135:astore_3        
				}
				if(PdfName.ARTIFACT.equals(((Object) (iaccessibleelement.getRole()))))
	//*  62  136:getstatic       #601 <Field PdfName PdfName.ARTIFACT>
	//*  63  139:aload_1         
	//*  64  140:invokeinterface #469 <Method PdfName IAccessibleElement.getRole()>
	//*  65  145:invokevirtual   #602 <Method boolean PdfName.equals(Object)>
	//*  66  148:ifeq            305
				{
					Object obj5 = ((Object) (iaccessibleelement.getAccessibleAttributes()));
	//   67  151:aload_1         
	//   68  152:invokeinterface #611 <Method HashMap IAccessibleElement.getAccessibleAttributes()>
	//   69  157:astore          6
					Object obj3 = null;
	//   70  159:aconst_null     
	//   71  160:astore          5
					obj1 = ((Object) (obj3));
	//   72  162:aload           5
	//   73  164:astore          4
					if(obj5 != null)
	//*  74  166:aload           6
	//*  75  168:ifnull          258
					{
						obj1 = ((Object) (obj3));
	//   76  171:aload           5
	//   77  173:astore          4
						if(!((HashMap) (obj5)).isEmpty())
	//*  78  175:aload           6
	//*  79  177:invokevirtual   #614 <Method boolean HashMap.isEmpty()>
	//*  80  180:ifne            258
						{
							PdfDictionary pdfdictionary = new PdfDictionary();
	//   81  183:new             #362 <Class PdfDictionary>
	//   82  186:dup             
	//   83  187:invokespecial   #615 <Method void PdfDictionary()>
	//   84  190:astore          5
							obj5 = ((Object) (((HashMap) (obj5)).entrySet().iterator()));
	//   85  192:aload           6
	//   86  194:invokevirtual   #619 <Method Set HashMap.entrySet()>
	//   87  197:invokeinterface #625 <Method Iterator Set.iterator()>
	//   88  202:astore          6
							do
							{
								obj1 = ((Object) (pdfdictionary));
	//   89  204:aload           5
	//   90  206:astore          4
								if(!((Iterator) (obj5)).hasNext())
									break;
	//   91  208:aload           6
	//   92  210:invokeinterface #630 <Method boolean Iterator.hasNext()>
	//   93  215:ifeq            258
								obj1 = ((Object) ((java.util.Map.Entry)((Iterator) (obj5)).next()));
	//   94  218:aload           6
	//   95  220:invokeinterface #634 <Method Object Iterator.next()>
	//   96  225:checkcast       #636 <Class java.util.Map$Entry>
	//   97  228:astore          4
								pdfdictionary.put((PdfName)((java.util.Map.Entry) (obj1)).getKey(), (PdfObject)((java.util.Map.Entry) (obj1)).getValue());
	//   98  230:aload           5
	//   99  232:aload           4
	//  100  234:invokeinterface #639 <Method Object java.util.Map$Entry.getKey()>
	//  101  239:checkcast       #77  <Class PdfName>
	//  102  242:aload           4
	//  103  244:invokeinterface #642 <Method Object java.util.Map$Entry.getValue()>
	//  104  249:checkcast       #344 <Class PdfObject>
	//  105  252:invokevirtual   #372 <Method void PdfDictionary.put(PdfName, PdfObject)>
							} while(true);
	//  106  255:goto            204
						}
					}
					boolean flag = inText;
	//  107  258:aload_0         
	//  108  259:getfield        #156 <Field boolean inText>
	//  109  262:istore_2        
					if(inText)
	//* 110  263:aload_0         
	//* 111  264:getfield        #156 <Field boolean inText>
	//* 112  267:ifeq            274
						endText();
	//  113  270:aload_0         
	//  114  271:invokevirtual   #223 <Method void endText()>
					beginMarkedContentSequence(iaccessibleelement.getRole(), ((PdfDictionary) (obj1)), true);
	//  115  274:aload_0         
	//  116  275:aload_1         
	//  117  276:invokeinterface #469 <Method PdfName IAccessibleElement.getRole()>
	//  118  281:aload           4
	//  119  283:iconst_1        
	//  120  284:invokevirtual   #645 <Method void beginMarkedContentSequence(PdfName, PdfDictionary, boolean)>
					obj1 = obj;
	//  121  287:aload_3         
	//  122  288:astore          4
					if(flag)
	//* 123  290:iload_2         
	//* 124  291:ifeq            302
					{
						beginText(true);
	//  125  294:aload_0         
	//  126  295:iconst_1        
	//  127  296:invokevirtual   #490 <Method void beginText(boolean)>
						obj1 = obj;
	//  128  299:aload_3         
	//  129  300:astore          4
					}
				} else
	//* 130  302:aload           4
	//* 131  304:areturn         
				{
					obj1 = obj;
	//  132  305:aload_3         
	//  133  306:astore          4
					if(writer.needToBeMarkedInContent(iaccessibleelement))
	//* 134  308:aload_0         
	//* 135  309:getfield        #164 <Field PdfWriter writer>
	//* 136  312:aload_1         
	//* 137  313:invokevirtual   #484 <Method boolean PdfWriter.needToBeMarkedInContent(IAccessibleElement)>
	//* 138  316:ifeq            302
					{
						boolean flag1 = inText;
	//  139  319:aload_0         
	//  140  320:getfield        #156 <Field boolean inText>
	//  141  323:istore_2        
						if(inText)
	//* 142  324:aload_0         
	//* 143  325:getfield        #156 <Field boolean inText>
	//* 144  328:ifeq            335
							endText();
	//  145  331:aload_0         
	//  146  332:invokevirtual   #223 <Method void endText()>
						if(iaccessibleelement.getAccessibleAttributes() != null && iaccessibleelement.getAccessibleAttribute(PdfName.E) != null)
	//* 147  335:aload_1         
	//* 148  336:invokeinterface #611 <Method HashMap IAccessibleElement.getAccessibleAttributes()>
	//* 149  341:ifnull          397
	//* 150  344:aload_1         
	//* 151  345:getstatic       #648 <Field PdfName PdfName.E>
	//* 152  348:invokeinterface #651 <Method PdfObject IAccessibleElement.getAccessibleAttribute(PdfName)>
	//* 153  353:ifnull          397
						{
							beginMarkedContentSequence(((PdfStructureElement) (obj)), iaccessibleelement.getAccessibleAttribute(PdfName.E).toString());
	//  154  356:aload_0         
	//  155  357:aload_3         
	//  156  358:aload_1         
	//  157  359:getstatic       #648 <Field PdfName PdfName.E>
	//  158  362:invokeinterface #651 <Method PdfObject IAccessibleElement.getAccessibleAttribute(PdfName)>
	//  159  367:invokevirtual   #652 <Method String PdfObject.toString()>
	//  160  370:invokespecial   #654 <Method void beginMarkedContentSequence(PdfStructureElement, String)>
							iaccessibleelement.setAccessibleAttribute(PdfName.E, ((PdfObject) (null)));
	//  161  373:aload_1         
	//  162  374:getstatic       #648 <Field PdfName PdfName.E>
	//  163  377:aconst_null     
	//  164  378:invokeinterface #657 <Method void IAccessibleElement.setAccessibleAttribute(PdfName, PdfObject)>
						} else
	//* 165  383:aload_3         
	//* 166  384:astore          4
	//* 167  386:iload_2         
	//* 168  387:ifeq            302
	//* 169  390:aload_0         
	//* 170  391:iconst_1        
	//* 171  392:invokevirtual   #490 <Method void beginText(boolean)>
	//* 172  395:aload_3         
	//* 173  396:areturn         
						{
							beginMarkedContentSequence(((PdfStructureElement) (obj)));
	//  174  397:aload_0         
	//  175  398:aload_3         
	//  176  399:invokevirtual   #660 <Method void beginMarkedContentSequence(PdfStructureElement)>
						}
						obj1 = obj;
						if(flag1)
						{
							beginText(true);
							return ((PdfStructureElement) (obj));
						}
					}
				}
			}
		}
		return ((PdfStructureElement) (obj1));
	//* 177  402:goto            383
	}

	private void saveColor(BaseColor basecolor, boolean flag)
	{
		if(flag)
	//*   0    0:iload_2         
	//*   1    1:ifeq            13
		{
			state.colorFill = basecolor;
	//    2    4:aload_0         
	//    3    5:getfield        #145 <Field PdfContentByte$GraphicState state>
	//    4    8:aload_1         
	//    5    9:putfield        #666 <Field BaseColor PdfContentByte$GraphicState.colorFill>
			return;
	//    6   12:return          
		} else
		{
			state.colorStroke = basecolor;
	//    7   13:aload_0         
	//    8   14:getfield        #145 <Field PdfContentByte$GraphicState state>
	//    9   17:aload_1         
	//   10   18:putfield        #669 <Field BaseColor PdfContentByte$GraphicState.colorStroke>
			return;
	//   11   21:return          
		}
	}

	private void showText2(String s)
	{
		if(state.fontDetails == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #145 <Field PdfContentByte$GraphicState state>
	//*   2    4:getfield        #512 <Field FontDetails PdfContentByte$GraphicState.fontDetails>
	//*   3    7:ifnonnull       28
		{
			throw new NullPointerException(MessageLocalization.getComposedMessage("font.and.size.must.be.set.before.writing.any.text", new Object[0]));
	//    4   10:new             #672 <Class NullPointerException>
	//    5   13:dup             
	//    6   14:ldc2            #674 <String "font.and.size.must.be.set.before.writing.any.text">
	//    7   17:iconst_0        
	//    8   18:anewarray       Object[]
	//    9   21:invokestatic    #239 <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//   10   24:invokespecial   #675 <Method void NullPointerException(String)>
	//   11   27:athrow          
		} else
		{
			StringUtils.escapeString(state.fontDetails.convertToBytes(s), content);
	//   12   28:aload_0         
	//   13   29:getfield        #145 <Field PdfContentByte$GraphicState state>
	//   14   32:getfield        #512 <Field FontDetails PdfContentByte$GraphicState.fontDetails>
	//   15   35:aload_1         
	//   16   36:invokevirtual   #679 <Method byte[] FontDetails.convertToBytes(String)>
	//   17   39:aload_0         
	//   18   40:getfield        #140 <Field ByteBuffer content>
	//   19   43:invokestatic    #685 <Method void StringUtils.escapeString(byte[], ByteBuffer)>
			return;
	//   20   46:return          
		}
	}

	private void showTextAligned(int i, String s, float f, float f1, float f2, boolean flag)
	{
		if(state.fontDetails == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #145 <Field PdfContentByte$GraphicState state>
	//*   2    4:getfield        #512 <Field FontDetails PdfContentByte$GraphicState.fontDetails>
	//*   3    7:ifnonnull       28
			throw new NullPointerException(MessageLocalization.getComposedMessage("font.and.size.must.be.set.before.writing.any.text", new Object[0]));
	//    4   10:new             #672 <Class NullPointerException>
	//    5   13:dup             
	//    6   14:ldc2            #674 <String "font.and.size.must.be.set.before.writing.any.text">
	//    7   17:iconst_0        
	//    8   18:anewarray       Object[]
	//    9   21:invokestatic    #239 <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//   10   24:invokespecial   #675 <Method void NullPointerException(String)>
	//   11   27:athrow          
		if(f2 != 0.0F)
			break MISSING_BLOCK_LABEL_112;
	//   12   28:fload           5
	//   13   30:fconst_0        
	//   14   31:fcmpl           
	//   15   32:ifne            112
		i;
	//   16   35:iload_1         
		JVM INSTR tableswitch 1 2: default 60
	//	               1 78
	//	               2 93;
	//   17   36:tableswitch     1 2: default 60
	//	               1 78
	//	               2 93
		   goto _L1 _L2 _L3
_L1:
		break; /* Loop/switch isn't completed */
_L3:
		break MISSING_BLOCK_LABEL_93;
_L4:
		setTextMatrix(f, f1);
	//   18   60:aload_0         
	//   19   61:fload_3         
	//   20   62:fload           4
	//   21   64:invokevirtual   #691 <Method void setTextMatrix(float, float)>
		if(flag)
	//*  22   67:iload           6
	//*  23   69:ifeq            106
		{
			showTextKerned(s);
	//   24   72:aload_0         
	//   25   73:aload_2         
	//   26   74:invokevirtual   #694 <Method void showTextKerned(String)>
			return;
	//   27   77:return          
		} else
	//*  28   78:fload_3         
	//*  29   79:aload_0         
	//*  30   80:aload_2         
	//*  31   81:iload           6
	//*  32   83:invokevirtual   #697 <Method float getEffectiveStringWidth(String, boolean)>
	//*  33   86:fconst_2        
	//*  34   87:fdiv            
	//*  35   88:fsub            
	//*  36   89:fstore_3        
	//*  37   90:goto            60
	//*  38   93:fload_3         
	//*  39   94:aload_0         
	//*  40   95:aload_2         
	//*  41   96:iload           6
	//*  42   98:invokevirtual   #697 <Method float getEffectiveStringWidth(String, boolean)>
	//*  43  101:fsub            
	//*  44  102:fstore_3        
	//*  45  103:goto            60
		{
			showText(s);
	//   46  106:aload_0         
	//   47  107:aload_2         
	//   48  108:invokevirtual   #700 <Method void showText(String)>
			return;
	//   49  111:return          
		}
_L2:
		f -= getEffectiveStringWidth(s, flag) / 2.0F;
		  goto _L4
		f -= getEffectiveStringWidth(s, flag);
		  goto _L4
		float f3;
		double d = ((double)f2 * 3.1415926535897931D) / 180D;
	//   50  112:fload           5
	//   51  114:f2d             
	//   52  115:ldc2w           #440 <Double 3.1415926535897931D>
	//   53  118:dmul            
	//   54  119:ldc2w           #452 <Double 180D>
	//   55  122:ddiv            
	//   56  123:dstore          7
		f2 = (float)Math.cos(d);
	//   57  125:dload           7
	//   58  127:invokestatic    #448 <Method double Math.cos(double)>
	//   59  130:d2f             
	//   60  131:fstore          5
		f3 = (float)Math.sin(d);
	//   61  133:dload           7
	//   62  135:invokestatic    #451 <Method double Math.sin(double)>
	//   63  138:d2f             
	//   64  139:fstore          9
		i;
	//   65  141:iload_1         
		JVM INSTR tableswitch 1 2: default 164
	//	               1 197
	//	               2 229;
	//   66  142:tableswitch     1 2: default 164
	//	               1 197
	//	               2 229
		   goto _L5 _L6 _L7
_L5:
		break; /* Loop/switch isn't completed */
_L7:
		break MISSING_BLOCK_LABEL_229;
_L8:
		setTextMatrix(f2, f3, -f3, f2, f, f1);
	//   67  164:aload_0         
	//   68  165:fload           5
	//   69  167:fload           9
	//   70  169:fload           9
	//   71  171:fneg            
	//   72  172:fload           5
	//   73  174:fload_3         
	//   74  175:fload           4
	//   75  177:invokevirtual   #703 <Method void setTextMatrix(float, float, float, float, float, float)>
		float f4;
		if(flag)
	//*  76  180:iload           6
	//*  77  182:ifeq            259
			showTextKerned(s);
	//   78  185:aload_0         
	//   79  186:aload_2         
	//   80  187:invokevirtual   #694 <Method void showTextKerned(String)>
		else
	//*  81  190:aload_0         
	//*  82  191:fconst_0        
	//*  83  192:fconst_0        
	//*  84  193:invokevirtual   #691 <Method void setTextMatrix(float, float)>
	//*  85  196:return          
	//*  86  197:aload_0         
	//*  87  198:aload_2         
	//*  88  199:iload           6
	//*  89  201:invokevirtual   #697 <Method float getEffectiveStringWidth(String, boolean)>
	//*  90  204:fconst_2        
	//*  91  205:fdiv            
	//*  92  206:fstore          10
	//*  93  208:fload_3         
	//*  94  209:fload           10
	//*  95  211:fload           5
	//*  96  213:fmul            
	//*  97  214:fsub            
	//*  98  215:fstore_3        
	//*  99  216:fload           4
	//* 100  218:fload           10
	//* 101  220:fload           9
	//* 102  222:fmul            
	//* 103  223:fsub            
	//* 104  224:fstore          4
	//* 105  226:goto            164
	//* 106  229:aload_0         
	//* 107  230:aload_2         
	//* 108  231:iload           6
	//* 109  233:invokevirtual   #697 <Method float getEffectiveStringWidth(String, boolean)>
	//* 110  236:fstore          10
	//* 111  238:fload_3         
	//* 112  239:fload           10
	//* 113  241:fload           5
	//* 114  243:fmul            
	//* 115  244:fsub            
	//* 116  245:fstore_3        
	//* 117  246:fload           4
	//* 118  248:fload           10
	//* 119  250:fload           9
	//* 120  252:fmul            
	//* 121  253:fsub            
	//* 122  254:fstore          4
	//* 123  256:goto            164
			showText(s);
	//  124  259:aload_0         
	//  125  260:aload_2         
	//  126  261:invokevirtual   #700 <Method void showText(String)>
		setTextMatrix(0.0F, 0.0F);
		return;
_L6:
		f4 = getEffectiveStringWidth(s, flag) / 2.0F;
		f -= f4 * f2;
		f1 -= f4 * f3;
		  goto _L8
		f4 = getEffectiveStringWidth(s, flag);
		f -= f4 * f2;
		f1 -= f4 * f3;
		  goto _L8
	//* 127  264:goto            190
	}

	public void add(PdfContentByte pdfcontentbyte)
	{
		if(pdfcontentbyte.writer != null && writer != pdfcontentbyte.writer)
	//*   0    0:aload_1         
	//*   1    1:getfield        #164 <Field PdfWriter writer>
	//*   2    4:ifnull          36
	//*   3    7:aload_0         
	//*   4    8:getfield        #164 <Field PdfWriter writer>
	//*   5   11:aload_1         
	//*   6   12:getfield        #164 <Field PdfWriter writer>
	//*   7   15:if_acmpeq       36
		{
			throw new RuntimeException(MessageLocalization.getComposedMessage("inconsistent.writers.are.you.mixing.two.documents", new Object[0]));
	//    8   18:new             #231 <Class RuntimeException>
	//    9   21:dup             
	//   10   22:ldc2            #706 <String "inconsistent.writers.are.you.mixing.two.documents">
	//   11   25:iconst_0        
	//   12   26:anewarray       Object[]
	//   13   29:invokestatic    #239 <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//   14   32:invokespecial   #242 <Method void RuntimeException(String)>
	//   15   35:athrow          
		} else
		{
			content.append(pdfcontentbyte.content);
	//   16   36:aload_0         
	//   17   37:getfield        #140 <Field ByteBuffer content>
	//   18   40:aload_1         
	//   19   41:getfield        #140 <Field ByteBuffer content>
	//   20   44:invokevirtual   #709 <Method ByteBuffer ByteBuffer.append(ByteBuffer)>
	//   21   47:pop             
			markedContentSize = markedContentSize + pdfcontentbyte.markedContentSize;
	//   22   48:aload_0         
	//   23   49:aload_0         
	//   24   50:getfield        #142 <Field int markedContentSize>
	//   25   53:aload_1         
	//   26   54:getfield        #142 <Field int markedContentSize>
	//   27   57:iadd            
	//   28   58:putfield        #142 <Field int markedContentSize>
			return;
	//   29   61:return          
		}
	}

	void addAnnotation(PdfAnnotation pdfannotation)
	{
		int i;
		if(isTagged() && pdfannotation.getRole() != null && (!(pdfannotation instanceof PdfFormField) || ((PdfFormField)pdfannotation).getKids() == null))
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #220 <Method boolean isTagged()>
	//*   2    4:ifeq            124
	//*   3    7:aload_1         
	//*   4    8:invokevirtual   #714 <Method PdfName PdfAnnotation.getRole()>
	//*   5   11:ifnull          124
	//*   6   14:aload_1         
	//*   7   15:instanceof      #716 <Class PdfFormField>
	//*   8   18:ifeq            31
	//*   9   21:aload_1         
	//*  10   22:checkcast       #716 <Class PdfFormField>
	//*  11   25:invokevirtual   #719 <Method ArrayList PdfFormField.getKids()>
	//*  12   28:ifnonnull       124
			i = 1;
	//   13   31:iconst_1        
	//   14   32:istore_2        
		else
	//*  15   33:iload_2         
	//*  16   34:ifeq            42
	//*  17   37:aload_0         
	//*  18   38:aload_1         
	//*  19   39:invokevirtual   #307 <Method void openMCBlock(IAccessibleElement)>
	//*  20   42:aload_0         
	//*  21   43:getfield        #164 <Field PdfWriter writer>
	//*  22   46:aload_1         
	//*  23   47:invokevirtual   #721 <Method void PdfWriter.addAnnotation(PdfAnnotation)>
	//*  24   50:iload_2         
	//*  25   51:ifeq            123
	//*  26   54:aload_0         
	//*  27   55:getfield        #172 <Field PdfDocument pdf>
	//*  28   58:aload_1         
	//*  29   59:invokevirtual   #722 <Method com.itextpdf.text.AccessibleElementId PdfAnnotation.getId()>
	//*  30   62:invokevirtual   #477 <Method PdfStructureElement PdfDocument.getStructElement(com.itextpdf.text.AccessibleElementId)>
	//*  31   65:astore_3        
	//*  32   66:aload_3         
	//*  33   67:ifnull          118
	//*  34   70:aload_0         
	//*  35   71:getfield        #172 <Field PdfDocument pdf>
	//*  36   74:aload_1         
	//*  37   75:invokevirtual   #384 <Method int PdfDocument.getStructParentIndex(Object)>
	//*  38   78:istore_2        
	//*  39   79:aload_1         
	//*  40   80:getstatic       #725 <Field PdfName PdfName.STRUCTPARENT>
	//*  41   83:new             #377 <Class PdfNumber>
	//*  42   86:dup             
	//*  43   87:iload_2         
	//*  44   88:invokespecial   #380 <Method void PdfNumber(int)>
	//*  45   91:invokevirtual   #726 <Method void PdfAnnotation.put(PdfName, PdfObject)>
	//*  46   94:aload_3         
	//*  47   95:aload_1         
	//*  48   96:aload_0         
	//*  49   97:invokevirtual   #336 <Method PdfIndirectReference getCurrentPage()>
	//*  50  100:invokevirtual   #730 <Method void PdfStructureElement.setAnnotation(PdfAnnotation, PdfIndirectReference)>
	//*  51  103:aload_0         
	//*  52  104:getfield        #164 <Field PdfWriter writer>
	//*  53  107:invokevirtual   #592 <Method PdfStructureTreeRoot PdfWriter.getStructureTreeRoot()>
	//*  54  110:iload_2         
	//*  55  111:aload_3         
	//*  56  112:invokevirtual   #733 <Method PdfIndirectReference PdfStructureElement.getReference()>
	//*  57  115:invokevirtual   #739 <Method void PdfStructureTreeRoot.setAnnotationMark(int, PdfIndirectReference)>
	//*  58  118:aload_0         
	//*  59  119:aload_1         
	//*  60  120:invokevirtual   #300 <Method void closeMCBlock(IAccessibleElement)>
	//*  61  123:return          
			i = 0;
	//   62  124:iconst_0        
	//   63  125:istore_2        
		if(i != 0)
			openMCBlock(((IAccessibleElement) (pdfannotation)));
		writer.addAnnotation(pdfannotation);
		if(i != 0)
		{
			PdfStructureElement pdfstructureelement = pdf.getStructElement(pdfannotation.getId());
			if(pdfstructureelement != null)
			{
				i = pdf.getStructParentIndex(((Object) (pdfannotation)));
				pdfannotation.put(PdfName.STRUCTPARENT, ((PdfObject) (new PdfNumber(i))));
				pdfstructureelement.setAnnotation(pdfannotation, getCurrentPage());
				writer.getStructureTreeRoot().setAnnotationMark(i, pdfstructureelement.getReference());
			}
			closeMCBlock(((IAccessibleElement) (pdfannotation)));
		}
	//*  64  126:goto            33
	}

	public void addAnnotation(PdfAnnotation pdfannotation, boolean flag)
	{
		if(flag && state.CTM.getType() != 0)
	//*   0    0:iload_2         
	//*   1    1:ifeq            28
	//*   2    4:aload_0         
	//*   3    5:getfield        #145 <Field PdfContentByte$GraphicState state>
	//*   4    8:getfield        #744 <Field AffineTransform PdfContentByte$GraphicState.CTM>
	//*   5   11:invokevirtual   #749 <Method int AffineTransform.getType()>
	//*   6   14:ifeq            28
			pdfannotation.applyCTM(state.CTM);
	//    7   17:aload_1         
	//    8   18:aload_0         
	//    9   19:getfield        #145 <Field PdfContentByte$GraphicState state>
	//   10   22:getfield        #744 <Field AffineTransform PdfContentByte$GraphicState.CTM>
	//   11   25:invokevirtual   #753 <Method void PdfAnnotation.applyCTM(AffineTransform)>
		addAnnotation(pdfannotation);
	//   12   28:aload_0         
	//   13   29:aload_1         
	//   14   30:invokevirtual   #754 <Method void addAnnotation(PdfAnnotation)>
	//   15   33:return          
	}

	public PdfName addFormXObj(PdfStream pdfstream, PdfName pdfname, double d, double d1, double d2, double d3, double d4, double d5)
		throws IOException
	{
		checkWriter();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #188 <Method void checkWriter()>
		PdfWriter.checkPdfIsoConformance(writer, 9, ((Object) (pdfstream)));
	//    2    4:aload_0         
	//    3    5:getfield        #164 <Field PdfWriter writer>
	//    4    8:bipush          9
	//    5   10:aload_1         
	//    6   11:invokestatic    #196 <Method void PdfWriter.checkPdfIsoConformance(PdfWriter, int, Object)>
		pdfname = getPageResources().addXObject(pdfname, writer.addToBody(((PdfObject) (pdfstream))).getIndirectReference());
	//    7   14:aload_0         
	//    8   15:invokevirtual   #204 <Method PageResources getPageResources()>
	//    9   18:aload_2         
	//   10   19:aload_0         
	//   11   20:getfield        #164 <Field PdfWriter writer>
	//   12   23:aload_1         
	//   13   24:invokevirtual   #762 <Method PdfIndirectObject PdfWriter.addToBody(PdfObject)>
	//   14   27:invokevirtual   #765 <Method PdfIndirectReference PdfIndirectObject.getIndirectReference()>
	//   15   30:invokevirtual   #216 <Method PdfName PageResources.addXObject(PdfName, PdfIndirectReference)>
	//   16   33:astore_2        
		pdfstream = null;
	//   17   34:aconst_null     
	//   18   35:astore_1        
		if(isTagged())
	//*  19   36:aload_0         
	//*  20   37:invokevirtual   #220 <Method boolean isTagged()>
	//*  21   40:ifeq            67
		{
			if(inText)
	//*  22   43:aload_0         
	//*  23   44:getfield        #156 <Field boolean inText>
	//*  24   47:ifeq            54
				endText();
	//   25   50:aload_0         
	//   26   51:invokevirtual   #223 <Method void endText()>
			pdfstream = ((PdfStream) (new PdfArtifact()));
	//   27   54:new             #767 <Class PdfArtifact>
	//   28   57:dup             
	//   29   58:invokespecial   #768 <Method void PdfArtifact()>
	//   30   61:astore_1        
			openMCBlock(((IAccessibleElement) (pdfstream)));
	//   31   62:aload_0         
	//   32   63:aload_1         
	//   33   64:invokevirtual   #307 <Method void openMCBlock(IAccessibleElement)>
		}
		content.append("q ");
	//   34   67:aload_0         
	//   35   68:getfield        #140 <Field ByteBuffer content>
	//   36   71:ldc2            #275 <String "q ">
	//   37   74:invokevirtual   #278 <Method ByteBuffer ByteBuffer.append(String)>
	//   38   77:pop             
		content.append(d).append(' ');
	//   39   78:aload_0         
	//   40   79:getfield        #140 <Field ByteBuffer content>
	//   41   82:dload_3         
	//   42   83:invokevirtual   #281 <Method ByteBuffer ByteBuffer.append(double)>
	//   43   86:bipush          32
	//   44   88:invokevirtual   #181 <Method ByteBuffer ByteBuffer.append(char)>
	//   45   91:pop             
		content.append(d1).append(' ');
	//   46   92:aload_0         
	//   47   93:getfield        #140 <Field ByteBuffer content>
	//   48   96:dload           5
	//   49   98:invokevirtual   #281 <Method ByteBuffer ByteBuffer.append(double)>
	//   50  101:bipush          32
	//   51  103:invokevirtual   #181 <Method ByteBuffer ByteBuffer.append(char)>
	//   52  106:pop             
		content.append(d2).append(' ');
	//   53  107:aload_0         
	//   54  108:getfield        #140 <Field ByteBuffer content>
	//   55  111:dload           7
	//   56  113:invokevirtual   #281 <Method ByteBuffer ByteBuffer.append(double)>
	//   57  116:bipush          32
	//   58  118:invokevirtual   #181 <Method ByteBuffer ByteBuffer.append(char)>
	//   59  121:pop             
		content.append(d3).append(' ');
	//   60  122:aload_0         
	//   61  123:getfield        #140 <Field ByteBuffer content>
	//   62  126:dload           9
	//   63  128:invokevirtual   #281 <Method ByteBuffer ByteBuffer.append(double)>
	//   64  131:bipush          32
	//   65  133:invokevirtual   #181 <Method ByteBuffer ByteBuffer.append(char)>
	//   66  136:pop             
		content.append(d4).append(' ');
	//   67  137:aload_0         
	//   68  138:getfield        #140 <Field ByteBuffer content>
	//   69  141:dload           11
	//   70  143:invokevirtual   #281 <Method ByteBuffer ByteBuffer.append(double)>
	//   71  146:bipush          32
	//   72  148:invokevirtual   #181 <Method ByteBuffer ByteBuffer.append(char)>
	//   73  151:pop             
		content.append(d5).append(" cm ");
	//   74  152:aload_0         
	//   75  153:getfield        #140 <Field ByteBuffer content>
	//   76  156:dload           13
	//   77  158:invokevirtual   #281 <Method ByteBuffer ByteBuffer.append(double)>
	//   78  161:ldc2            #283 <String " cm ">
	//   79  164:invokevirtual   #278 <Method ByteBuffer ByteBuffer.append(String)>
	//   80  167:pop             
		content.append(pdfname.getBytes()).append(" Do Q").append_i(separator);
	//   81  168:aload_0         
	//   82  169:getfield        #140 <Field ByteBuffer content>
	//   83  172:aload_2         
	//   84  173:invokevirtual   #287 <Method byte[] PdfName.getBytes()>
	//   85  176:invokevirtual   #290 <Method ByteBuffer ByteBuffer.append(byte[])>
	//   86  179:ldc2            #292 <String " Do Q">
	//   87  182:invokevirtual   #278 <Method ByteBuffer ByteBuffer.append(String)>
	//   88  185:aload_0         
	//   89  186:getfield        #152 <Field int separator>
	//   90  189:invokevirtual   #296 <Method ByteBuffer ByteBuffer.append_i(int)>
	//   91  192:pop             
		if(isTagged())
	//*  92  193:aload_0         
	//*  93  194:invokevirtual   #220 <Method boolean isTagged()>
	//*  94  197:ifeq            205
			closeMCBlock(((IAccessibleElement) (pdfstream)));
	//   95  200:aload_0         
	//   96  201:aload_1         
	//   97  202:invokevirtual   #300 <Method void closeMCBlock(IAccessibleElement)>
		return pdfname;
	//   98  205:aload_2         
	//   99  206:areturn         
	}

	public PdfName addFormXObj(PdfStream pdfstream, PdfName pdfname, float f, float f1, float f2, float f3, float f4, 
			float f5)
		throws IOException
	{
		return addFormXObj(pdfstream, pdfname, f, f1, f2, f3, f4, f5);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:fload_3         
	//    4    4:f2d             
	//    5    5:fload           4
	//    6    7:f2d             
	//    7    8:fload           5
	//    8   10:f2d             
	//    9   11:fload           6
	//   10   13:f2d             
	//   11   14:fload           7
	//   12   16:f2d             
	//   13   17:fload           8
	//   14   19:f2d             
	//   15   20:invokevirtual   #772 <Method PdfName addFormXObj(PdfStream, PdfName, double, double, double, double, double, double)>
	//   16   23:areturn         
	}

	public void addImage(Image image)
		throws DocumentException
	{
		addImage(image, false);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_0        
	//    3    3:invokevirtual   #779 <Method void addImage(Image, boolean)>
	//    4    6:return          
	}

	public void addImage(Image image, double d, double d1, double d2, 
			double d3, double d4, double d5)
		throws DocumentException
	{
		addImage(image, d, d1, d2, d3, d4, d5, false);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:dload_2         
	//    3    3:dload           4
	//    4    5:dload           6
	//    5    7:dload           8
	//    6    9:dload           10
	//    7   11:dload           12
	//    8   13:iconst_0        
	//    9   14:invokevirtual   #783 <Method void addImage(Image, double, double, double, double, double, double, boolean)>
	//   10   17:return          
	}

	public void addImage(Image image, double d, double d1, double d2, 
			double d3, double d4, double d5, boolean flag)
		throws DocumentException
	{
		addImage(image, d, d1, d2, d3, d4, d5, flag, false);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:dload_2         
	//    3    3:dload           4
	//    4    5:dload           6
	//    5    7:dload           8
	//    6    9:dload           10
	//    7   11:dload           12
	//    8   13:iload           14
	//    9   15:iconst_0        
	//   10   16:invokevirtual   #786 <Method void addImage(Image, double, double, double, double, double, double, boolean, boolean)>
	//   11   19:return          
	}

	protected void addImage(Image image, double d, double d1, double d2, 
			double d3, double d4, double d5, boolean flag, 
			boolean flag1)
		throws DocumentException
	{
		Object obj;
		obj = ((Object) (new AffineTransform(d, d1, d2, d3, d4, d5)));
	//    0    0:new             #746 <Class AffineTransform>
	//    1    3:dup             
	//    2    4:dload_2         
	//    3    5:dload           4
	//    4    7:dload           6
	//    5    9:dload           8
	//    6   11:dload           10
	//    7   13:dload           12
	//    8   15:invokespecial   #789 <Method void AffineTransform(double, double, double, double, double, double)>
	//    9   18:astore          25
		if(image.getLayer() != null)
	//*  10   20:aload_1         
	//*  11   21:invokevirtual   #795 <Method PdfOCG Image.getLayer()>
	//*  12   24:ifnull          35
			beginLayer(image.getLayer());
	//   13   27:aload_0         
	//   14   28:aload_1         
	//   15   29:invokevirtual   #795 <Method PdfOCG Image.getLayer()>
	//   16   32:invokevirtual   #798 <Method void beginLayer(PdfOCG)>
		if(!isTagged()) goto _L2; else goto _L1
	//   17   35:aload_0         
	//   18   36:invokevirtual   #220 <Method boolean isTagged()>
	//   19   39:ifeq            326
_L1:
		com.itextpdf.awt.geom.Point2D.Float afloat[];
		if(inText)
	//*  20   42:aload_0         
	//*  21   43:getfield        #156 <Field boolean inText>
	//*  22   46:ifeq            53
			endText();
	//   23   49:aload_0         
	//   24   50:invokevirtual   #223 <Method void endText()>
		com.itextpdf.awt.geom.Point2D.Float float1 = new com.itextpdf.awt.geom.Point2D.Float(0.0F, 0.0F);
	//   25   53:new             #800 <Class com.itextpdf.awt.geom.Point2D$Float>
	//   26   56:dup             
	//   27   57:fconst_0        
	//   28   58:fconst_0        
	//   29   59:invokespecial   #802 <Method void com.itextpdf.awt.geom.Point2D$Float(float, float)>
	//   30   62:astore          26
		com.itextpdf.awt.geom.Point2D.Float float2 = new com.itextpdf.awt.geom.Point2D.Float(1.0F, 0.0F);
	//   31   64:new             #800 <Class com.itextpdf.awt.geom.Point2D$Float>
	//   32   67:dup             
	//   33   68:fconst_1        
	//   34   69:fconst_0        
	//   35   70:invokespecial   #802 <Method void com.itextpdf.awt.geom.Point2D$Float(float, float)>
	//   36   73:astore          27
		com.itextpdf.awt.geom.Point2D.Float float3 = new com.itextpdf.awt.geom.Point2D.Float(1.0F, 1.0F);
	//   37   75:new             #800 <Class com.itextpdf.awt.geom.Point2D$Float>
	//   38   78:dup             
	//   39   79:fconst_1        
	//   40   80:fconst_1        
	//   41   81:invokespecial   #802 <Method void com.itextpdf.awt.geom.Point2D$Float(float, float)>
	//   42   84:astore          28
		com.itextpdf.awt.geom.Point2D.Float float4 = new com.itextpdf.awt.geom.Point2D.Float(0.0F, 1.0F);
	//   43   86:new             #800 <Class com.itextpdf.awt.geom.Point2D$Float>
	//   44   89:dup             
	//   45   90:fconst_0        
	//   46   91:fconst_1        
	//   47   92:invokespecial   #802 <Method void com.itextpdf.awt.geom.Point2D$Float(float, float)>
	//   48   95:astore          29
		afloat = new com.itextpdf.awt.geom.Point2D.Float[4];
	//   49   97:iconst_4        
	//   50   98:anewarray       com.itextpdf.awt.geom.Point2D.Float[]
	//   51  101:astore          30
		((AffineTransform) (obj)).transform(((Point2D []) (new com.itextpdf.awt.geom.Point2D.Float[] {
			float1, float2, float3, float4
		})), 0, ((Point2D []) (afloat)), 0, 4);
	//   52  103:aload           25
	//   53  105:iconst_4        
	//   54  106:anewarray       com.itextpdf.awt.geom.Point2D.Float[]
	//   55  109:dup             
	//   56  110:iconst_0        
	//   57  111:aload           26
	//   58  113:aastore         
	//   59  114:dup             
	//   60  115:iconst_1        
	//   61  116:aload           27
	//   62  118:aastore         
	//   63  119:dup             
	//   64  120:iconst_2        
	//   65  121:aload           28
	//   66  123:aastore         
	//   67  124:dup             
	//   68  125:iconst_3        
	//   69  126:aload           29
	//   70  128:aastore         
	//   71  129:iconst_0        
	//   72  130:aload           30
	//   73  132:iconst_0        
	//   74  133:iconst_4        
	//   75  134:invokevirtual   #806 <Method void AffineTransform.transform(Point2D[], int, Point2D[], int, int)>
		float f;
		float f2;
		float f3;
		float f5;
		int i;
		f5 = 3.402823E+38F;
	//   76  137:ldc2            #807 <Float 3.402823E+38F>
	//   77  140:fstore          21
		f3 = -3.402823E+38F;
	//   78  142:ldc2            #808 <Float -3.402823E+38F>
	//   79  145:fstore          19
		f2 = 3.402823E+38F;
	//   80  147:ldc2            #807 <Float 3.402823E+38F>
	//   81  150:fstore          18
		f = -3.402823E+38F;
	//   82  152:ldc2            #808 <Float -3.402823E+38F>
	//   83  155:fstore          16
		i = 0;
	//   84  157:iconst_0        
	//   85  158:istore          23
_L14:
		if(i >= 4) goto _L4; else goto _L3
	//   86  160:iload           23
	//   87  162:iconst_4        
	//   88  163:icmpge          289
_L3:
		float f1;
		float f4;
		float f6;
		double ad[];
		f1 = f5;
	//   89  166:fload           21
	//   90  168:fstore          17
		Iterator iterator;
		PdfName pdfname;
		try
		{
			if(((Point2D) (afloat[i])).getX() < (double)f5)
	//*  91  170:aload           30
	//*  92  172:iload           23
	//*  93  174:aaload          
	//*  94  175:invokevirtual   #814 <Method double Point2D.getX()>
	//*  95  178:fload           21
	//*  96  180:f2d             
	//*  97  181:dcmpg           
	//*  98  182:ifge            196
				f1 = (float)((Point2D) (afloat[i])).getX();
	//   99  185:aload           30
	//  100  187:iload           23
	//  101  189:aaload          
	//  102  190:invokevirtual   #814 <Method double Point2D.getX()>
	//  103  193:d2f             
	//  104  194:fstore          17
		}
	//* 105  196:fload           19
	//* 106  198:fstore          20
	//* 107  200:aload           30
	//* 108  202:iload           23
	//* 109  204:aaload          
	//* 110  205:invokevirtual   #814 <Method double Point2D.getX()>
	//* 111  208:fload           19
	//* 112  210:f2d             
	//* 113  211:dcmpl           
	//* 114  212:ifle            226
	//* 115  215:aload           30
	//* 116  217:iload           23
	//* 117  219:aaload          
	//* 118  220:invokevirtual   #814 <Method double Point2D.getX()>
	//* 119  223:d2f             
	//* 120  224:fstore          20
	//* 121  226:fload           18
	//* 122  228:fstore          19
	//* 123  230:aload           30
	//* 124  232:iload           23
	//* 125  234:aaload          
	//* 126  235:invokevirtual   #817 <Method double Point2D.getY()>
	//* 127  238:fload           18
	//* 128  240:f2d             
	//* 129  241:dcmpg           
	//* 130  242:ifge            256
	//* 131  245:aload           30
	//* 132  247:iload           23
	//* 133  249:aaload          
	//* 134  250:invokevirtual   #817 <Method double Point2D.getY()>
	//* 135  253:d2f             
	//* 136  254:fstore          19
	//* 137  256:fload           16
	//* 138  258:fstore          22
	//* 139  260:aload           30
	//* 140  262:iload           23
	//* 141  264:aaload          
	//* 142  265:invokevirtual   #817 <Method double Point2D.getY()>
	//* 143  268:fload           16
	//* 144  270:f2d             
	//* 145  271:dcmpl           
	//* 146  272:ifle            1523
	//* 147  275:aload           30
	//* 148  277:iload           23
	//* 149  279:aaload          
	//* 150  280:invokevirtual   #817 <Method double Point2D.getY()>
	//* 151  283:d2f             
	//* 152  284:fstore          22
	//* 153  286:goto            1523
	//* 154  289:aload_1         
	//* 155  290:getstatic       #820 <Field PdfName PdfName.BBOX>
	//* 156  293:new             #349 <Class PdfArray>
	//* 157  296:dup             
	//* 158  297:iconst_4        
	//* 159  298:newarray        float[]
	//* 160  300:dup             
	//* 161  301:iconst_0        
	//* 162  302:fload           21
	//* 163  304:fastore         
	//* 164  305:dup             
	//* 165  306:iconst_1        
	//* 166  307:fload           18
	//* 167  309:fastore         
	//* 168  310:dup             
	//* 169  311:iconst_2        
	//* 170  312:fload           19
	//* 171  314:fastore         
	//* 172  315:dup             
	//* 173  316:iconst_3        
	//* 174  317:fload           16
	//* 175  319:fastore         
	//* 176  320:invokespecial   #823 <Method void PdfArray(float[])>
	//* 177  323:invokevirtual   #824 <Method void Image.setAccessibleAttribute(PdfName, PdfObject)>
	//* 178  326:aload_0         
	//* 179  327:getfield        #164 <Field PdfWriter writer>
	//* 180  330:ifnull          594
	//* 181  333:aload_1         
	//* 182  334:invokevirtual   #827 <Method boolean Image.isImgTemplate()>
	//* 183  337:ifeq            594
	//* 184  340:aload_0         
	//* 185  341:getfield        #164 <Field PdfWriter writer>
	//* 186  344:aload_1         
	//* 187  345:invokevirtual   #831 <Method PdfName PdfWriter.addDirectImageSimple(Image)>
	//* 188  348:pop             
	//* 189  349:aload_1         
	//* 190  350:invokevirtual   #835 <Method PdfTemplate Image.getTemplateData()>
	//* 191  353:astore          25
	//* 192  355:aload_1         
	//* 193  356:invokevirtual   #836 <Method HashMap Image.getAccessibleAttributes()>
	//* 194  359:ifnull          459
	//* 195  362:aload_1         
	//* 196  363:invokevirtual   #836 <Method HashMap Image.getAccessibleAttributes()>
	//* 197  366:invokevirtual   #839 <Method Set HashMap.keySet()>
	//* 198  369:invokeinterface #625 <Method Iterator Set.iterator()>
	//* 199  374:astore          26
	//* 200  376:aload           26
	//* 201  378:invokeinterface #630 <Method boolean Iterator.hasNext()>
	//* 202  383:ifeq            459
	//* 203  386:aload           26
	//* 204  388:invokeinterface #634 <Method Object Iterator.next()>
	//* 205  393:checkcast       #77  <Class PdfName>
	//* 206  396:astore          27
	//* 207  398:aload           25
	//* 208  400:aload           27
	//* 209  402:aload_1         
	//* 210  403:aload           27
	//* 211  405:invokevirtual   #840 <Method PdfObject Image.getAccessibleAttribute(PdfName)>
	//* 212  408:invokevirtual   #841 <Method void PdfTemplate.setAccessibleAttribute(PdfName, PdfObject)>
	//* 213  411:goto            376
		// Misplaced declaration of an exception variable
		catch(Object obj)
	//* 214  414:astore          25
		{
			boolean flag2;
			Object obj1;
			PdfImage pdfimage;
			Iterator iterator1;
			PdfName pdfname1;
			if(image != null && image.getUrl() != null)
	//* 215  416:aload_1         
	//* 216  417:ifnull          1509
	//* 217  420:aload_1         
	//* 218  421:invokevirtual   #845 <Method URL Image.getUrl()>
	//* 219  424:ifnull          1509
				image = ((Image) (image.getUrl().getPath()));
	//  220  427:aload_1         
	//  221  428:invokevirtual   #845 <Method URL Image.getUrl()>
	//  222  431:invokevirtual   #850 <Method String URL.getPath()>
	//  223  434:astore_1        
			else
	//* 224  435:new             #776 <Class DocumentException>
	//* 225  438:dup             
	//* 226  439:ldc2            #852 <String "add.image.exception">
	//* 227  442:iconst_1        
	//* 228  443:anewarray       Object[]
	//* 229  446:dup             
	//* 230  447:iconst_0        
	//* 231  448:aload_1         
	//* 232  449:aastore         
	//* 233  450:invokestatic    #239 <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//* 234  453:aload           25
	//* 235  455:invokespecial   #855 <Method void DocumentException(String, Exception)>
	//* 236  458:athrow          
	//* 237  459:aload           25
	//* 238  461:invokevirtual   #859 <Method float PdfTemplate.getWidth()>
	//* 239  464:fstore          16
	//* 240  466:aload           25
	//* 241  468:invokevirtual   #862 <Method float PdfTemplate.getHeight()>
	//* 242  471:fstore          17
	//* 243  473:aload_0         
	//* 244  474:aload           25
	//* 245  476:dload_2         
	//* 246  477:fload           16
	//* 247  479:f2d             
	//* 248  480:ddiv            
	//* 249  481:dload           4
	//* 250  483:fload           16
	//* 251  485:f2d             
	//* 252  486:ddiv            
	//* 253  487:dload           6
	//* 254  489:fload           17
	//* 255  491:f2d             
	//* 256  492:ddiv            
	//* 257  493:dload           8
	//* 258  495:fload           17
	//* 259  497:f2d             
	//* 260  498:ddiv            
	//* 261  499:dload           10
	//* 262  501:dload           12
	//* 263  503:iconst_0        
	//* 264  504:iconst_0        
	//* 265  505:invokespecial   #864 <Method void addTemplate(PdfTemplate, double, double, double, double, double, double, boolean, boolean)>
	//* 266  508:aload_1         
	//* 267  509:invokevirtual   #867 <Method boolean Image.hasBorders()>
	//* 268  512:ifeq            571
	//* 269  515:aload_0         
	//* 270  516:invokevirtual   #870 <Method void saveState()>
	//* 271  519:aload_1         
	//* 272  520:invokevirtual   #871 <Method float Image.getWidth()>
	//* 273  523:fstore          16
	//* 274  525:aload_1         
	//* 275  526:invokevirtual   #872 <Method float Image.getHeight()>
	//* 276  529:fstore          17
	//* 277  531:aload_0         
	//* 278  532:dload_2         
	//* 279  533:fload           16
	//* 280  535:f2d             
	//* 281  536:ddiv            
	//* 282  537:dload           4
	//* 283  539:fload           16
	//* 284  541:f2d             
	//* 285  542:ddiv            
	//* 286  543:dload           6
	//* 287  545:fload           17
	//* 288  547:f2d             
	//* 289  548:ddiv            
	//* 290  549:dload           8
	//* 291  551:fload           17
	//* 292  553:f2d             
	//* 293  554:ddiv            
	//* 294  555:dload           10
	//* 295  557:dload           12
	//* 296  559:invokevirtual   #875 <Method void concatCTM(double, double, double, double, double, double)>
	//* 297  562:aload_0         
	//* 298  563:aload_1         
	//* 299  564:invokevirtual   #879 <Method void rectangle(Rectangle)>
	//* 300  567:aload_0         
	//* 301  568:invokevirtual   #882 <Method void restoreState()>
	//* 302  571:aload_1         
	//* 303  572:invokevirtual   #795 <Method PdfOCG Image.getLayer()>
	//* 304  575:ifnull          582
	//* 305  578:aload_0         
	//* 306  579:invokevirtual   #885 <Method void endLayer()>
	//* 307  582:aload_1         
	//* 308  583:invokevirtual   #889 <Method Annotation Image.getAnnotation()>
	//* 309  586:astore          25
	//* 310  588:aload           25
	//* 311  590:ifnonnull       1281
	//* 312  593:return          
	//* 313  594:aload_0         
	//* 314  595:getfield        #140 <Field ByteBuffer content>
	//* 315  598:ldc2            #275 <String "q ">
	//* 316  601:invokevirtual   #278 <Method ByteBuffer ByteBuffer.append(String)>
	//* 317  604:pop             
	//* 318  605:aload           25
	//* 319  607:invokevirtual   #892 <Method boolean AffineTransform.isIdentity()>
	//* 320  610:ifne            703
	//* 321  613:aload_0         
	//* 322  614:getfield        #140 <Field ByteBuffer content>
	//* 323  617:dload_2         
	//* 324  618:invokevirtual   #281 <Method ByteBuffer ByteBuffer.append(double)>
	//* 325  621:bipush          32
	//* 326  623:invokevirtual   #181 <Method ByteBuffer ByteBuffer.append(char)>
	//* 327  626:pop             
	//* 328  627:aload_0         
	//* 329  628:getfield        #140 <Field ByteBuffer content>
	//* 330  631:dload           4
	//* 331  633:invokevirtual   #281 <Method ByteBuffer ByteBuffer.append(double)>
	//* 332  636:bipush          32
	//* 333  638:invokevirtual   #181 <Method ByteBuffer ByteBuffer.append(char)>
	//* 334  641:pop             
	//* 335  642:aload_0         
	//* 336  643:getfield        #140 <Field ByteBuffer content>
	//* 337  646:dload           6
	//* 338  648:invokevirtual   #281 <Method ByteBuffer ByteBuffer.append(double)>
	//* 339  651:bipush          32
	//* 340  653:invokevirtual   #181 <Method ByteBuffer ByteBuffer.append(char)>
	//* 341  656:pop             
	//* 342  657:aload_0         
	//* 343  658:getfield        #140 <Field ByteBuffer content>
	//* 344  661:dload           8
	//* 345  663:invokevirtual   #281 <Method ByteBuffer ByteBuffer.append(double)>
	//* 346  666:bipush          32
	//* 347  668:invokevirtual   #181 <Method ByteBuffer ByteBuffer.append(char)>
	//* 348  671:pop             
	//* 349  672:aload_0         
	//* 350  673:getfield        #140 <Field ByteBuffer content>
	//* 351  676:dload           10
	//* 352  678:invokevirtual   #281 <Method ByteBuffer ByteBuffer.append(double)>
	//* 353  681:bipush          32
	//* 354  683:invokevirtual   #181 <Method ByteBuffer ByteBuffer.append(char)>
	//* 355  686:pop             
	//* 356  687:aload_0         
	//* 357  688:getfield        #140 <Field ByteBuffer content>
	//* 358  691:dload           12
	//* 359  693:invokevirtual   #281 <Method ByteBuffer ByteBuffer.append(double)>
	//* 360  696:ldc2            #894 <String " cm">
	//* 361  699:invokevirtual   #278 <Method ByteBuffer ByteBuffer.append(String)>
	//* 362  702:pop             
	//* 363  703:iload           14
	//* 364  705:ifeq            1174
	//* 365  708:aload_0         
	//* 366  709:getfield        #140 <Field ByteBuffer content>
	//* 367  712:ldc2            #896 <String "\nBI\n">
	//* 368  715:invokevirtual   #278 <Method ByteBuffer ByteBuffer.append(String)>
	//* 369  718:pop             
	//* 370  719:new             #898 <Class PdfImage>
	//* 371  722:dup             
	//* 372  723:aload_1         
	//* 373  724:ldc2            #900 <String "">
	//* 374  727:aconst_null     
	//* 375  728:invokespecial   #903 <Method void PdfImage(Image, String, PdfIndirectReference)>
	//* 376  731:astore          27
	//* 377  733:aload_1         
	//* 378  734:instanceof      #905 <Class ImgJBIG2>
	//* 379  737:ifeq            790
	//* 380  740:aload_1         
	//* 381  741:checkcast       #905 <Class ImgJBIG2>
	//* 382  744:invokevirtual   #908 <Method byte[] ImgJBIG2.getGlobalBytes()>
	//* 383  747:astore          25
	//* 384  749:aload           25
	//* 385  751:ifnull          790
	//* 386  754:new             #362 <Class PdfDictionary>
	//* 387  757:dup             
	//* 388  758:invokespecial   #615 <Method void PdfDictionary()>
	//* 389  761:astore          26
	//* 390  763:aload           26
	//* 391  765:getstatic       #911 <Field PdfName PdfName.JBIG2GLOBALS>
	//* 392  768:aload_0         
	//* 393  769:getfield        #164 <Field PdfWriter writer>
	//* 394  772:aload           25
	//* 395  774:invokevirtual   #915 <Method PdfIndirectReference PdfWriter.getReferenceJBIG2Globals(byte[])>
	//* 396  777:invokevirtual   #372 <Method void PdfDictionary.put(PdfName, PdfObject)>
	//* 397  780:aload           27
	//* 398  782:getstatic       #100 <Field PdfName PdfName.DECODEPARMS>
	//* 399  785:aload           26
	//* 400  787:invokevirtual   #916 <Method void PdfImage.put(PdfName, PdfObject)>
	//* 401  790:aload_0         
	//* 402  791:getfield        #164 <Field PdfWriter writer>
	//* 403  794:bipush          17
	//* 404  796:aload           27
	//* 405  798:invokestatic    #196 <Method void PdfWriter.checkPdfIsoConformance(PdfWriter, int, Object)>
	//* 406  801:aload           27
	//* 407  803:invokevirtual   #919 <Method Set PdfImage.getKeys()>
	//* 408  806:invokeinterface #625 <Method Iterator Set.iterator()>
	//* 409  811:astore          28
	//* 410  813:aload           28
	//* 411  815:invokeinterface #630 <Method boolean Iterator.hasNext()>
	//* 412  820:ifeq            1082
	//* 413  823:aload           28
	//* 414  825:invokeinterface #634 <Method Object Iterator.next()>
	//* 415  830:checkcast       #77  <Class PdfName>
	//* 416  833:astore          29
	//* 417  835:aload           27
	//* 418  837:aload           29
	//* 419  839:invokevirtual   #920 <Method PdfObject PdfImage.get(PdfName)>
	//* 420  842:astore          26
	//* 421  844:getstatic       #75  <Field HashMap abrev>
	//* 422  847:aload           29
	//* 423  849:invokevirtual   #923 <Method Object HashMap.get(Object)>
	//* 424  852:checkcast       #532 <Class String>
	//* 425  855:astore          25
	//* 426  857:aload           25
	//* 427  859:ifnull          813
	//* 428  862:aload_0         
	//* 429  863:getfield        #140 <Field ByteBuffer content>
	//* 430  866:aload           25
	//* 431  868:invokevirtual   #278 <Method ByteBuffer ByteBuffer.append(String)>
	//* 432  871:pop             
	//* 433  872:iconst_1        
	//* 434  873:istore          24
	//* 435  875:iload           24
	//* 436  877:istore          23
	//* 437  879:aload           29
	//* 438  881:getstatic       #90  <Field PdfName PdfName.COLORSPACE>
	//* 439  884:invokevirtual   #602 <Method boolean PdfName.equals(Object)>
	//* 440  887:ifeq            992
	//* 441  890:iload           24
	//* 442  892:istore          23
	//* 443  894:aload           26
	//* 444  896:invokevirtual   #412 <Method boolean PdfObject.isArray()>
	//* 445  899:ifeq            992
	//* 446  902:aload           26
	//* 447  904:checkcast       #349 <Class PdfArray>
	//* 448  907:astore          25
	//* 449  909:iload           24
	//* 450  911:istore          23
	//* 451  913:aload           25
	//* 452  915:invokevirtual   #924 <Method int PdfArray.size()>
	//* 453  918:iconst_4        
	//* 454  919:icmpne          992
	//* 455  922:iload           24
	//* 456  924:istore          23
	//* 457  926:getstatic       #927 <Field PdfName PdfName.INDEXED>
	//* 458  929:aload           25
	//* 459  931:iconst_0        
	//* 460  932:invokevirtual   #931 <Method PdfName PdfArray.getAsName(int)>
	//* 461  935:invokevirtual   #602 <Method boolean PdfName.equals(Object)>
	//* 462  938:ifeq            992
	//* 463  941:iload           24
	//* 464  943:istore          23
	//* 465  945:aload           25
	//* 466  947:iconst_1        
	//* 467  948:invokevirtual   #935 <Method PdfObject PdfArray.getPdfObject(int)>
	//* 468  951:invokevirtual   #938 <Method boolean PdfObject.isName()>
	//* 469  954:ifeq            992
	//* 470  957:iload           24
	//* 471  959:istore          23
	//* 472  961:aload           25
	//* 473  963:iconst_2        
	//* 474  964:invokevirtual   #935 <Method PdfObject PdfArray.getPdfObject(int)>
	//* 475  967:invokevirtual   #347 <Method boolean PdfObject.isNumber()>
	//* 476  970:ifeq            992
	//* 477  973:iload           24
	//* 478  975:istore          23
	//* 479  977:aload           25
	//* 480  979:iconst_3        
	//* 481  980:invokevirtual   #935 <Method PdfObject PdfArray.getPdfObject(int)>
	//* 482  983:invokevirtual   #941 <Method boolean PdfObject.isString()>
	//* 483  986:ifeq            992
	//* 484  989:iconst_0        
	//* 485  990:istore          23
	//* 486  992:aload           26
	//* 487  994:astore          25
	//* 488  996:iload           23
	//* 489  998:ifeq            1059
	//* 490 1001:aload           26
	//* 491 1003:astore          25
	//* 492 1005:aload           29
	//* 493 1007:getstatic       #90  <Field PdfName PdfName.COLORSPACE>
	//* 494 1010:invokevirtual   #602 <Method boolean PdfName.equals(Object)>
	//* 495 1013:ifeq            1059
	//* 496 1016:aload           26
	//* 497 1018:astore          25
	//* 498 1020:aload           26
	//* 499 1022:invokevirtual   #938 <Method boolean PdfObject.isName()>
	//* 500 1025:ifne            1059
	//* 501 1028:aload_0         
	//* 502 1029:getfield        #164 <Field PdfWriter writer>
	//* 503 1032:invokevirtual   #944 <Method PdfName PdfWriter.getColorspaceName()>
	//* 504 1035:astore          25
	//* 505 1037:aload_0         
	//* 506 1038:invokevirtual   #204 <Method PageResources getPageResources()>
	//* 507 1041:aload           25
	//* 508 1043:aload_0         
	//* 509 1044:getfield        #164 <Field PdfWriter writer>
	//* 510 1047:aload           26
	//* 511 1049:invokevirtual   #762 <Method PdfIndirectObject PdfWriter.addToBody(PdfObject)>
	//* 512 1052:invokevirtual   #765 <Method PdfIndirectReference PdfIndirectObject.getIndirectReference()>
	//* 513 1055:invokevirtual   #947 <Method PdfName PageResources.addColor(PdfName, PdfIndirectReference)>
	//* 514 1058:pop             
	//* 515 1059:aload           25
	//* 516 1061:aconst_null     
	//* 517 1062:aload_0         
	//* 518 1063:getfield        #140 <Field ByteBuffer content>
	//* 519 1066:invokevirtual   #951 <Method void PdfObject.toPdf(PdfWriter, java.io.OutputStream)>
	//* 520 1069:aload_0         
	//* 521 1070:getfield        #140 <Field ByteBuffer content>
	//* 522 1073:bipush          10
	//* 523 1075:invokevirtual   #181 <Method ByteBuffer ByteBuffer.append(char)>
	//* 524 1078:pop             
	//* 525 1079:goto            813
	//* 526 1082:new             #953 <Class ByteArrayOutputStream>
	//* 527 1085:dup             
	//* 528 1086:invokespecial   #954 <Method void ByteArrayOutputStream()>
	//* 529 1089:astore          25
	//* 530 1091:aload           27
	//* 531 1093:aload           25
	//* 532 1095:invokevirtual   #958 <Method void PdfImage.writeContent(java.io.OutputStream)>
	//* 533 1098:aload           25
	//* 534 1100:invokevirtual   #961 <Method byte[] ByteArrayOutputStream.toByteArray()>
	//* 535 1103:astore          25
	//* 536 1105:aload_0         
	//* 537 1106:getfield        #140 <Field ByteBuffer content>
	//* 538 1109:ldc2            #963 <String "/L %s\n">
	//* 539 1112:iconst_1        
	//* 540 1113:anewarray       Object[]
	//* 541 1116:dup             
	//* 542 1117:iconst_0        
	//* 543 1118:aload           25
	//* 544 1120:arraylength     
	//* 545 1121:invokestatic    #969 <Method Integer Integer.valueOf(int)>
	//* 546 1124:aastore         
	//* 547 1125:invokestatic    #972 <Method String String.format(String, Object[])>
	//* 548 1128:invokevirtual   #278 <Method ByteBuffer ByteBuffer.append(String)>
	//* 549 1131:pop             
	//* 550 1132:aload_0         
	//* 551 1133:getfield        #140 <Field ByteBuffer content>
	//* 552 1136:ldc2            #974 <String "ID\n">
	//* 553 1139:invokevirtual   #278 <Method ByteBuffer ByteBuffer.append(String)>
	//* 554 1142:pop             
	//* 555 1143:aload_0         
	//* 556 1144:getfield        #140 <Field ByteBuffer content>
	//* 557 1147:aload           25
	//* 558 1149:invokevirtual   #290 <Method ByteBuffer ByteBuffer.append(byte[])>
	//* 559 1152:pop             
	//* 560 1153:aload_0         
	//* 561 1154:getfield        #140 <Field ByteBuffer content>
	//* 562 1157:ldc2            #976 <String "\nEI\nQ">
	//* 563 1160:invokevirtual   #278 <Method ByteBuffer ByteBuffer.append(String)>
	//* 564 1163:aload_0         
	//* 565 1164:getfield        #152 <Field int separator>
	//* 566 1167:invokevirtual   #296 <Method ByteBuffer ByteBuffer.append_i(int)>
	//* 567 1170:pop             
	//* 568 1171:goto            508
	//* 569 1174:aload_0         
	//* 570 1175:invokevirtual   #204 <Method PageResources getPageResources()>
	//* 571 1178:astore          25
	//* 572 1180:aload_1         
	//* 573 1181:invokevirtual   #980 <Method Image Image.getImageMask()>
	//* 574 1184:astore          26
	//* 575 1186:aload           26
	//* 576 1188:ifnull          1219
	//* 577 1191:aload_0         
	//* 578 1192:getfield        #164 <Field PdfWriter writer>
	//* 579 1195:aload           26
	//* 580 1197:invokevirtual   #831 <Method PdfName PdfWriter.addDirectImageSimple(Image)>
	//* 581 1200:astore          26
	//* 582 1202:aload           25
	//* 583 1204:aload           26
	//* 584 1206:aload_0         
	//* 585 1207:getfield        #164 <Field PdfWriter writer>
	//* 586 1210:aload           26
	//* 587 1212:invokevirtual   #984 <Method PdfIndirectReference PdfWriter.getImageReference(PdfName)>
	//* 588 1215:invokevirtual   #216 <Method PdfName PageResources.addXObject(PdfName, PdfIndirectReference)>
	//* 589 1218:pop             
	//* 590 1219:aload_0         
	//* 591 1220:getfield        #164 <Field PdfWriter writer>
	//* 592 1223:aload_1         
	//* 593 1224:invokevirtual   #831 <Method PdfName PdfWriter.addDirectImageSimple(Image)>
	//* 594 1227:astore          26
	//* 595 1229:aload           25
	//* 596 1231:aload           26
	//* 597 1233:aload_0         
	//* 598 1234:getfield        #164 <Field PdfWriter writer>
	//* 599 1237:aload           26
	//* 600 1239:invokevirtual   #984 <Method PdfIndirectReference PdfWriter.getImageReference(PdfName)>
	//* 601 1242:invokevirtual   #216 <Method PdfName PageResources.addXObject(PdfName, PdfIndirectReference)>
	//* 602 1245:astore          25
	//* 603 1247:aload_0         
	//* 604 1248:getfield        #140 <Field ByteBuffer content>
	//* 605 1251:bipush          32
	//* 606 1253:invokevirtual   #181 <Method ByteBuffer ByteBuffer.append(char)>
	//* 607 1256:aload           25
	//* 608 1258:invokevirtual   #287 <Method byte[] PdfName.getBytes()>
	//* 609 1261:invokevirtual   #290 <Method ByteBuffer ByteBuffer.append(byte[])>
	//* 610 1264:ldc2            #292 <String " Do Q">
	//* 611 1267:invokevirtual   #278 <Method ByteBuffer ByteBuffer.append(String)>
	//* 612 1270:aload_0         
	//* 613 1271:getfield        #152 <Field int separator>
	//* 614 1274:invokevirtual   #296 <Method ByteBuffer ByteBuffer.append_i(int)>
	//* 615 1277:pop             
	//* 616 1278:goto            508
	//* 617 1281:getstatic       #68  <Field float[] unitRect>
	//* 618 1284:arraylength     
	//* 619 1285:newarray        double[]
	//* 620 1287:astore          26
	//* 621 1289:iconst_0        
	//* 622 1290:istore          23
	//* 623 1292:iload           23
	//* 624 1294:getstatic       #68  <Field float[] unitRect>
	//* 625 1297:arraylength     
	//* 626 1298:icmpge          1548
	//* 627 1301:aload           26
	//* 628 1303:iload           23
	//* 629 1305:getstatic       #68  <Field float[] unitRect>
	//* 630 1308:iload           23
	//* 631 1310:faload          
	//* 632 1311:f2d             
	//* 633 1312:dload_2         
	//* 634 1313:dmul            
	//* 635 1314:getstatic       #68  <Field float[] unitRect>
	//* 636 1317:iload           23
	//* 637 1319:iconst_1        
	//* 638 1320:iadd            
	//* 639 1321:faload          
	//* 640 1322:f2d             
	//* 641 1323:dload           6
	//* 642 1325:dmul            
	//* 643 1326:dadd            
	//* 644 1327:dload           10
	//* 645 1329:dadd            
	//* 646 1330:dastore         
	//* 647 1331:aload           26
	//* 648 1333:iload           23
	//* 649 1335:iconst_1        
	//* 650 1336:iadd            
	//* 651 1337:getstatic       #68  <Field float[] unitRect>
	//* 652 1340:iload           23
	//* 653 1342:faload          
	//* 654 1343:f2d             
	//* 655 1344:dload           4
	//* 656 1346:dmul            
	//* 657 1347:getstatic       #68  <Field float[] unitRect>
	//* 658 1350:iload           23
	//* 659 1352:iconst_1        
	//* 660 1353:iadd            
	//* 661 1354:faload          
	//* 662 1355:f2d             
	//* 663 1356:dload           8
	//* 664 1358:dmul            
	//* 665 1359:dadd            
	//* 666 1360:dload           12
	//* 667 1362:dadd            
	//* 668 1363:dastore         
	//* 669 1364:iload           23
	//* 670 1366:iconst_2        
	//* 671 1367:iadd            
	//* 672 1368:istore          23
	//* 673 1370:goto            1292
	//* 674 1373:iload           23
	//* 675 1375:aload           26
	//* 676 1377:arraylength     
	//* 677 1378:icmpge          1440
	//* 678 1381:dload_2         
	//* 679 1382:aload           26
	//* 680 1384:iload           23
	//* 681 1386:daload          
	//* 682 1387:invokestatic    #988 <Method double Math.min(double, double)>
	//* 683 1390:dstore_2        
	//* 684 1391:dload           4
	//* 685 1393:aload           26
	//* 686 1395:iload           23
	//* 687 1397:iconst_1        
	//* 688 1398:iadd            
	//* 689 1399:daload          
	//* 690 1400:invokestatic    #988 <Method double Math.min(double, double)>
	//* 691 1403:dstore          4
	//* 692 1405:dload           6
	//* 693 1407:aload           26
	//* 694 1409:iload           23
	//* 695 1411:daload          
	//* 696 1412:invokestatic    #991 <Method double Math.max(double, double)>
	//* 697 1415:dstore          6
	//* 698 1417:dload           8
	//* 699 1419:aload           26
	//* 700 1421:iload           23
	//* 701 1423:iconst_1        
	//* 702 1424:iadd            
	//* 703 1425:daload          
	//* 704 1426:invokestatic    #991 <Method double Math.max(double, double)>
	//* 705 1429:dstore          8
	//* 706 1431:iload           23
	//* 707 1433:iconst_2        
	//* 708 1434:iadd            
	//* 709 1435:istore          23
	//* 710 1437:goto            1373
	//* 711 1440:new             #993 <Class Annotation>
	//* 712 1443:dup             
	//* 713 1444:aload           25
	//* 714 1446:invokespecial   #996 <Method void Annotation(Annotation)>
	//* 715 1449:astore          25
	//* 716 1451:aload           25
	//* 717 1453:dload_2         
	//* 718 1454:d2f             
	//* 719 1455:dload           4
	//* 720 1457:d2f             
	//* 721 1458:dload           6
	//* 722 1460:d2f             
	//* 723 1461:dload           8
	//* 724 1463:d2f             
	//* 725 1464:invokevirtual   #999 <Method void Annotation.setDimensions(float, float, float, float)>
	//* 726 1467:aload_0         
	//* 727 1468:getfield        #164 <Field PdfWriter writer>
	//* 728 1471:aload           25
	//* 729 1473:new             #1001 <Class Rectangle>
	//* 730 1476:dup             
	//* 731 1477:dload_2         
	//* 732 1478:d2f             
	//* 733 1479:dload           4
	//* 734 1481:d2f             
	//* 735 1482:dload           6
	//* 736 1484:d2f             
	//* 737 1485:dload           8
	//* 738 1487:d2f             
	//* 739 1488:invokespecial   #1003 <Method void Rectangle(float, float, float, float)>
	//* 740 1491:invokestatic    #1009 <Method PdfAnnotation PdfAnnotationsImp.convertAnnotation(PdfWriter, Annotation, Rectangle)>
	//* 741 1494:astore          25
	//* 742 1496:aload           25
	//* 743 1498:ifnonnull       1502
	//* 744 1501:return          
	//* 745 1502:aload_0         
	//* 746 1503:aload           25
	//* 747 1505:invokevirtual   #754 <Method void addAnnotation(PdfAnnotation)>
	//* 748 1508:return          
				image = ((Image) (MessageLocalization.getComposedMessage("unknown", new Object[0])));
	//  749 1509:ldc2            #1011 <String "unknown">
	//  750 1512:iconst_0        
	//  751 1513:anewarray       Object[]
	//  752 1516:invokestatic    #239 <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//  753 1519:astore_1        
			throw new DocumentException(MessageLocalization.getComposedMessage("add.image.exception", new Object[] {
				image
			}), ((Exception) (obj)));
		}
		f4 = f3;
		if(((Point2D) (afloat[i])).getX() > (double)f3)
			f4 = (float)((Point2D) (afloat[i])).getX();
		f3 = f2;
		if(((Point2D) (afloat[i])).getY() < (double)f2)
			f3 = (float)((Point2D) (afloat[i])).getY();
		f6 = f;
		if(((Point2D) (afloat[i])).getY() > (double)f)
			f6 = (float)((Point2D) (afloat[i])).getY();
		  goto _L5
_L4:
		image.setAccessibleAttribute(PdfName.BBOX, ((PdfObject) (new PdfArray(new float[] {
			f5, f2, f3, f
		}))));
_L2:
		if(writer == null || !image.isImgTemplate()) goto _L7; else goto _L6
_L6:
		writer.addDirectImageSimple(image);
		obj = ((Object) (image.getTemplateData()));
		if(image.getAccessibleAttributes() != null)
			for(iterator = image.getAccessibleAttributes().keySet().iterator(); iterator.hasNext(); ((PdfTemplate) (obj)).setAccessibleAttribute(pdfname, image.getAccessibleAttribute(pdfname)))
				pdfname = (PdfName)iterator.next();

		f = ((PdfTemplate) (obj)).getWidth();
		f1 = ((PdfTemplate) (obj)).getHeight();
		addTemplate(((PdfTemplate) (obj)), d / (double)f, d1 / (double)f, d2 / (double)f1, d3 / (double)f1, d4, d5, false, false);
_L10:
		if(image.hasBorders())
		{
			saveState();
			f = image.getWidth();
			f1 = image.getHeight();
			concatCTM(d / (double)f, d1 / (double)f, d2 / (double)f1, d3 / (double)f1, d4, d5);
			rectangle(((Rectangle) (image)));
			restoreState();
		}
		if(image.getLayer() != null)
			endLayer();
		obj = ((Object) (image.getAnnotation()));
		if(obj == null)
			return;
		  goto _L8
_L7:
		content.append("q ");
		if(!((AffineTransform) (obj)).isIdentity())
		{
			content.append(d).append(' ');
			content.append(d1).append(' ');
			content.append(d2).append(' ');
			content.append(d3).append(' ');
			content.append(d4).append(' ');
			content.append(d5).append(" cm");
		}
		if(!flag)
			break MISSING_BLOCK_LABEL_1174;
		content.append("\nBI\n");
		pdfimage = new PdfImage(image, "", ((PdfIndirectReference) (null)));
		if(!(image instanceof ImgJBIG2))
			break MISSING_BLOCK_LABEL_790;
		obj = ((Object) (((ImgJBIG2)image).getGlobalBytes()));
		if(obj == null)
			break MISSING_BLOCK_LABEL_790;
		obj1 = ((Object) (new PdfDictionary()));
		((PdfDictionary) (obj1)).put(PdfName.JBIG2GLOBALS, ((PdfObject) (writer.getReferenceJBIG2Globals(((byte []) (obj))))));
		pdfimage.put(PdfName.DECODEPARMS, ((PdfObject) (obj1)));
		PdfWriter.checkPdfIsoConformance(writer, 17, ((Object) (pdfimage)));
		iterator1 = pdfimage.getKeys().iterator();
_L9:
		do
		{
			if(!iterator1.hasNext())
				break MISSING_BLOCK_LABEL_1082;
			pdfname1 = (PdfName)iterator1.next();
			obj1 = ((Object) (pdfimage.get(pdfname1)));
			obj = ((Object) ((String)abrev.get(((Object) (pdfname1)))));
		} while(obj == null);
		content.append(((String) (obj)));
		flag2 = true;
		i = ((int) (flag2));
		if(!pdfname1.equals(((Object) (PdfName.COLORSPACE))))
			break MISSING_BLOCK_LABEL_992;
		i = ((int) (flag2));
		if(!((PdfObject) (obj1)).isArray())
			break MISSING_BLOCK_LABEL_992;
		obj = ((Object) ((PdfArray)obj1));
		i = ((int) (flag2));
		if(((PdfArray) (obj)).size() != 4)
			break MISSING_BLOCK_LABEL_992;
		i = ((int) (flag2));
		if(!PdfName.INDEXED.equals(((Object) (((PdfArray) (obj)).getAsName(0)))))
			break MISSING_BLOCK_LABEL_992;
		i = ((int) (flag2));
		if(!((PdfArray) (obj)).getPdfObject(1).isName())
			break MISSING_BLOCK_LABEL_992;
		i = ((int) (flag2));
		if(!((PdfArray) (obj)).getPdfObject(2).isNumber())
			break MISSING_BLOCK_LABEL_992;
		i = ((int) (flag2));
		if(((PdfArray) (obj)).getPdfObject(3).isString())
			i = 0;
		obj = obj1;
		if(i == 0)
			break MISSING_BLOCK_LABEL_1059;
		obj = obj1;
		if(!pdfname1.equals(((Object) (PdfName.COLORSPACE))))
			break MISSING_BLOCK_LABEL_1059;
		obj = obj1;
		if(!((PdfObject) (obj1)).isName())
		{
			obj = ((Object) (writer.getColorspaceName()));
			getPageResources().addColor(((PdfName) (obj)), writer.addToBody(((PdfObject) (obj1))).getIndirectReference());
		}
		((PdfObject) (obj)).toPdf(((PdfWriter) (null)), ((java.io.OutputStream) (content)));
		content.append('\n');
		  goto _L9
		obj = ((Object) (new ByteArrayOutputStream()));
		pdfimage.writeContent(((java.io.OutputStream) (obj)));
		obj = ((Object) (((ByteArrayOutputStream) (obj)).toByteArray()));
		content.append(String.format("/L %s\n", new Object[] {
			Integer.valueOf(obj.length)
		}));
		content.append("ID\n");
		content.append(((byte []) (obj)));
		content.append("\nEI\nQ").append_i(separator);
		  goto _L10
		obj = ((Object) (getPageResources()));
		obj1 = ((Object) (image.getImageMask()));
		if(obj1 == null)
			break MISSING_BLOCK_LABEL_1219;
		obj1 = ((Object) (writer.addDirectImageSimple(((Image) (obj1)))));
		((PageResources) (obj)).addXObject(((PdfName) (obj1)), writer.getImageReference(((PdfName) (obj1))));
		obj1 = ((Object) (writer.addDirectImageSimple(image)));
		obj = ((Object) (((PageResources) (obj)).addXObject(((PdfName) (obj1)), writer.getImageReference(((PdfName) (obj1))))));
		content.append(' ').append(((PdfName) (obj)).getBytes()).append(" Do Q").append_i(separator);
		  goto _L10
_L8:
		ad = new double[unitRect.length];
		i = 0;
_L12:
		if(i >= unitRect.length)
			break; /* Loop/switch isn't completed */
		ad[i] = (double)unitRect[i] * d + (double)unitRect[i + 1] * d2 + d4;
		ad[i + 1] = (double)unitRect[i] * d1 + (double)unitRect[i + 1] * d3 + d5;
		i += 2;
		if(true) goto _L12; else goto _L11
_L13:
		if(i >= ad.length)
			break MISSING_BLOCK_LABEL_1440;
		d = Math.min(d, ad[i]);
		d1 = Math.min(d1, ad[i + 1]);
		d2 = Math.max(d2, ad[i]);
		d3 = Math.max(d3, ad[i + 1]);
		i += 2;
		  goto _L13
		obj = ((Object) (new Annotation(((Annotation) (obj)))));
		((Annotation) (obj)).setDimensions((float)d, (float)d1, (float)d2, (float)d3);
		obj = ((Object) (PdfAnnotationsImp.convertAnnotation(writer, ((Annotation) (obj)), new Rectangle((float)d, (float)d1, (float)d2, (float)d3))));
		if(obj == null)
			return;
		addAnnotation(((PdfAnnotation) (obj)));
		return;
	//* 754 1520:goto            435
_L5:
		i++;
	//  755 1523:iload           23
	//  756 1525:iconst_1        
	//  757 1526:iadd            
	//  758 1527:istore          23
		f2 = f3;
	//  759 1529:fload           19
	//  760 1531:fstore          18
		f5 = f1;
	//  761 1533:fload           17
	//  762 1535:fstore          21
		f3 = f4;
	//  763 1537:fload           20
	//  764 1539:fstore          19
		f = f6;
	//  765 1541:fload           22
	//  766 1543:fstore          16
		  goto _L14
	//* 767 1545:goto            160
_L11:
		d = ad[0];
	//  768 1548:aload           26
	//  769 1550:iconst_0        
	//  770 1551:daload          
	//  771 1552:dstore_2        
		d1 = ad[1];
	//  772 1553:aload           26
	//  773 1555:iconst_1        
	//  774 1556:daload          
	//  775 1557:dstore          4
		d2 = d;
	//  776 1559:dload_2         
	//  777 1560:dstore          6
		d3 = d1;
	//  778 1562:dload           4
	//  779 1564:dstore          8
		i = 2;
	//  780 1566:iconst_2        
	//  781 1567:istore          23
		  goto _L13
	//* 782 1569:goto            1373
	}

	public void addImage(Image image, float f, float f1, float f2, float f3, float f4, float f5)
		throws DocumentException
	{
		addImage(image, f, f1, f2, f3, f4, f5, false);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:fload_2         
	//    3    3:fload_3         
	//    4    4:fload           4
	//    5    6:fload           5
	//    6    8:fload           6
	//    7   10:fload           7
	//    8   12:iconst_0        
	//    9   13:invokevirtual   #1015 <Method void addImage(Image, float, float, float, float, float, float, boolean)>
	//   10   16:return          
	}

	public void addImage(Image image, float f, float f1, float f2, float f3, float f4, float f5, 
			boolean flag)
		throws DocumentException
	{
		addImage(image, f, f1, f2, f3, f4, f5, flag);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:fload_2         
	//    3    3:f2d             
	//    4    4:fload_3         
	//    5    5:f2d             
	//    6    6:fload           4
	//    7    8:f2d             
	//    8    9:fload           5
	//    9   11:f2d             
	//   10   12:fload           6
	//   11   14:f2d             
	//   12   15:fload           7
	//   13   17:f2d             
	//   14   18:iload           8
	//   15   20:invokevirtual   #783 <Method void addImage(Image, double, double, double, double, double, double, boolean)>
	//   16   23:return          
	}

	public void addImage(Image image, AffineTransform affinetransform)
		throws DocumentException
	{
		double ad[] = new double[6];
	//    0    0:bipush          6
	//    1    2:newarray        double[]
	//    2    4:astore_3        
		affinetransform.getMatrix(ad);
	//    3    5:aload_2         
	//    4    6:aload_3         
	//    5    7:invokevirtual   #1020 <Method void AffineTransform.getMatrix(double[])>
		addImage(image, ad[0], ad[1], ad[2], ad[3], ad[4], ad[5], false);
	//    6   10:aload_0         
	//    7   11:aload_1         
	//    8   12:aload_3         
	//    9   13:iconst_0        
	//   10   14:daload          
	//   11   15:aload_3         
	//   12   16:iconst_1        
	//   13   17:daload          
	//   14   18:aload_3         
	//   15   19:iconst_2        
	//   16   20:daload          
	//   17   21:aload_3         
	//   18   22:iconst_3        
	//   19   23:daload          
	//   20   24:aload_3         
	//   21   25:iconst_4        
	//   22   26:daload          
	//   23   27:aload_3         
	//   24   28:iconst_5        
	//   25   29:daload          
	//   26   30:iconst_0        
	//   27   31:invokevirtual   #783 <Method void addImage(Image, double, double, double, double, double, double, boolean)>
	//   28   34:return          
	}

	public void addImage(Image image, boolean flag)
		throws DocumentException
	{
		if(!image.hasAbsoluteY())
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #1023 <Method boolean Image.hasAbsoluteY()>
	//*   2    4:ifne            25
		{
			throw new DocumentException(MessageLocalization.getComposedMessage("the.image.must.have.absolute.positioning", new Object[0]));
	//    3    7:new             #776 <Class DocumentException>
	//    4   10:dup             
	//    5   11:ldc2            #1025 <String "the.image.must.have.absolute.positioning">
	//    6   14:iconst_0        
	//    7   15:anewarray       Object[]
	//    8   18:invokestatic    #239 <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//    9   21:invokespecial   #1026 <Method void DocumentException(String)>
	//   10   24:athrow          
		} else
		{
			float af[] = image.matrix();
	//   11   25:aload_1         
	//   12   26:invokevirtual   #1030 <Method float[] Image.matrix()>
	//   13   29:astore_3        
			af[4] = image.getAbsoluteX() - af[4];
	//   14   30:aload_3         
	//   15   31:iconst_4        
	//   16   32:aload_1         
	//   17   33:invokevirtual   #1033 <Method float Image.getAbsoluteX()>
	//   18   36:aload_3         
	//   19   37:iconst_4        
	//   20   38:faload          
	//   21   39:fsub            
	//   22   40:fastore         
			af[5] = image.getAbsoluteY() - af[5];
	//   23   41:aload_3         
	//   24   42:iconst_5        
	//   25   43:aload_1         
	//   26   44:invokevirtual   #1036 <Method float Image.getAbsoluteY()>
	//   27   47:aload_3         
	//   28   48:iconst_5        
	//   29   49:faload          
	//   30   50:fsub            
	//   31   51:fastore         
			addImage(image, af[0], af[1], af[2], af[3], af[4], af[5], flag);
	//   32   52:aload_0         
	//   33   53:aload_1         
	//   34   54:aload_3         
	//   35   55:iconst_0        
	//   36   56:faload          
	//   37   57:aload_3         
	//   38   58:iconst_1        
	//   39   59:faload          
	//   40   60:aload_3         
	//   41   61:iconst_2        
	//   42   62:faload          
	//   43   63:aload_3         
	//   44   64:iconst_3        
	//   45   65:faload          
	//   46   66:aload_3         
	//   47   67:iconst_4        
	//   48   68:faload          
	//   49   69:aload_3         
	//   50   70:iconst_5        
	//   51   71:faload          
	//   52   72:iload_2         
	//   53   73:invokevirtual   #1015 <Method void addImage(Image, float, float, float, float, float, float, boolean)>
			return;
	//   54   76:return          
		}
	}

	public void addOutline(PdfOutline pdfoutline, String s)
	{
		checkWriter();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #188 <Method void checkWriter()>
		pdf.addOutline(pdfoutline, s);
	//    2    4:aload_0         
	//    3    5:getfield        #172 <Field PdfDocument pdf>
	//    4    8:aload_1         
	//    5    9:aload_2         
	//    6   10:invokevirtual   #1040 <Method void PdfDocument.addOutline(PdfOutline, String)>
	//    7   13:return          
	}

	public void addPSXObject(PdfPSXObject pdfpsxobject)
	{
		if(inText && isTagged())
	//*   0    0:aload_0         
	//*   1    1:getfield        #156 <Field boolean inText>
	//*   2    4:ifeq            18
	//*   3    7:aload_0         
	//*   4    8:invokevirtual   #220 <Method boolean isTagged()>
	//*   5   11:ifeq            18
			endText();
	//    6   14:aload_0         
	//    7   15:invokevirtual   #223 <Method void endText()>
		checkWriter();
	//    8   18:aload_0         
	//    9   19:invokevirtual   #188 <Method void checkWriter()>
		PdfName pdfname = writer.addDirectTemplateSimple(((PdfTemplate) (pdfpsxobject)), ((PdfName) (null)));
	//   10   22:aload_0         
	//   11   23:getfield        #164 <Field PdfWriter writer>
	//   12   26:aload_1         
	//   13   27:aconst_null     
	//   14   28:invokevirtual   #200 <Method PdfName PdfWriter.addDirectTemplateSimple(PdfTemplate, PdfName)>
	//   15   31:astore_2        
		pdfpsxobject = ((PdfPSXObject) (getPageResources().addXObject(pdfname, pdfpsxobject.getIndirectReference())));
	//   16   32:aload_0         
	//   17   33:invokevirtual   #204 <Method PageResources getPageResources()>
	//   18   36:aload_2         
	//   19   37:aload_1         
	//   20   38:invokevirtual   #1045 <Method PdfIndirectReference PdfPSXObject.getIndirectReference()>
	//   21   41:invokevirtual   #216 <Method PdfName PageResources.addXObject(PdfName, PdfIndirectReference)>
	//   22   44:astore_1        
		content.append(((PdfName) (pdfpsxobject)).getBytes()).append(" Do").append_i(separator);
	//   23   45:aload_0         
	//   24   46:getfield        #140 <Field ByteBuffer content>
	//   25   49:aload_1         
	//   26   50:invokevirtual   #287 <Method byte[] PdfName.getBytes()>
	//   27   53:invokevirtual   #290 <Method ByteBuffer ByteBuffer.append(byte[])>
	//   28   56:ldc2            #1047 <String " Do">
	//   29   59:invokevirtual   #278 <Method ByteBuffer ByteBuffer.append(String)>
	//   30   62:aload_0         
	//   31   63:getfield        #152 <Field int separator>
	//   32   66:invokevirtual   #296 <Method ByteBuffer ByteBuffer.append_i(int)>
	//   33   69:pop             
	//   34   70:return          
	}

	public void addTemplate(PdfTemplate pdftemplate, double d, double d1)
	{
		addTemplate(pdftemplate, 1.0D, 0.0D, 0.0D, 1.0D, d, d1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:dconst_1        
	//    3    3:dconst_0        
	//    4    4:dconst_0        
	//    5    5:dconst_1        
	//    6    6:dload_2         
	//    7    7:dload           4
	//    8    9:invokevirtual   #1051 <Method void addTemplate(PdfTemplate, double, double, double, double, double, double)>
	//    9   12:return          
	}

	public void addTemplate(PdfTemplate pdftemplate, double d, double d1, double d2, 
			double d3, double d4, double d5)
	{
		addTemplate(pdftemplate, d, d1, d2, d3, d4, d5, false);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:dload_2         
	//    3    3:dload           4
	//    4    5:dload           6
	//    5    7:dload           8
	//    6    9:dload           10
	//    7   11:dload           12
	//    8   13:iconst_0        
	//    9   14:invokevirtual   #1054 <Method void addTemplate(PdfTemplate, double, double, double, double, double, double, boolean)>
	//   10   17:return          
	}

	public void addTemplate(PdfTemplate pdftemplate, double d, double d1, double d2, 
			double d3, double d4, double d5, boolean flag)
	{
		addTemplate(pdftemplate, d, d1, d2, d3, d4, d5, true, flag);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:dload_2         
	//    3    3:dload           4
	//    4    5:dload           6
	//    5    7:dload           8
	//    6    9:dload           10
	//    7   11:dload           12
	//    8   13:iconst_1        
	//    9   14:iload           14
	//   10   16:invokespecial   #864 <Method void addTemplate(PdfTemplate, double, double, double, double, double, double, boolean, boolean)>
	//   11   19:return          
	}

	public void addTemplate(PdfTemplate pdftemplate, double d, double d1, boolean flag)
	{
		addTemplate(pdftemplate, 1.0D, 0.0D, 0.0D, 1.0D, d, d1, flag);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:dconst_1        
	//    3    3:dconst_0        
	//    4    4:dconst_0        
	//    5    5:dconst_1        
	//    6    6:dload_2         
	//    7    7:dload           4
	//    8    9:iload           6
	//    9   11:invokevirtual   #1054 <Method void addTemplate(PdfTemplate, double, double, double, double, double, double, boolean)>
	//   10   14:return          
	}

	public void addTemplate(PdfTemplate pdftemplate, float f, float f1)
	{
		addTemplate(pdftemplate, 1.0F, 0.0F, 0.0F, 1.0F, f, f1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:fconst_1        
	//    3    3:fconst_0        
	//    4    4:fconst_0        
	//    5    5:fconst_1        
	//    6    6:fload_2         
	//    7    7:fload_3         
	//    8    8:invokevirtual   #1059 <Method void addTemplate(PdfTemplate, float, float, float, float, float, float)>
	//    9   11:return          
	}

	public void addTemplate(PdfTemplate pdftemplate, float f, float f1, float f2, float f3, float f4, float f5)
	{
		addTemplate(pdftemplate, f, f1, f2, f3, f4, f5, false);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:fload_2         
	//    3    3:fload_3         
	//    4    4:fload           4
	//    5    6:fload           5
	//    6    8:fload           6
	//    7   10:fload           7
	//    8   12:iconst_0        
	//    9   13:invokevirtual   #1062 <Method void addTemplate(PdfTemplate, float, float, float, float, float, float, boolean)>
	//   10   16:return          
	}

	public void addTemplate(PdfTemplate pdftemplate, float f, float f1, float f2, float f3, float f4, float f5, 
			boolean flag)
	{
		addTemplate(pdftemplate, f, f1, f2, f3, f4, f5, flag);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:fload_2         
	//    3    3:f2d             
	//    4    4:fload_3         
	//    5    5:f2d             
	//    6    6:fload           4
	//    7    8:f2d             
	//    8    9:fload           5
	//    9   11:f2d             
	//   10   12:fload           6
	//   11   14:f2d             
	//   12   15:fload           7
	//   13   17:f2d             
	//   14   18:iload           8
	//   15   20:invokevirtual   #1054 <Method void addTemplate(PdfTemplate, double, double, double, double, double, double, boolean)>
	//   16   23:return          
	}

	public void addTemplate(PdfTemplate pdftemplate, float f, float f1, boolean flag)
	{
		addTemplate(pdftemplate, 1.0F, 0.0F, 0.0F, 1.0F, f, f1, flag);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:fconst_1        
	//    3    3:fconst_0        
	//    4    4:fconst_0        
	//    5    5:fconst_1        
	//    6    6:fload_2         
	//    7    7:fload_3         
	//    8    8:iload           4
	//    9   10:invokevirtual   #1062 <Method void addTemplate(PdfTemplate, float, float, float, float, float, float, boolean)>
	//   10   13:return          
	}

	public void addTemplate(PdfTemplate pdftemplate, AffineTransform affinetransform)
	{
		addTemplate(pdftemplate, affinetransform, false);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iconst_0        
	//    4    4:invokevirtual   #1067 <Method void addTemplate(PdfTemplate, AffineTransform, boolean)>
	//    5    7:return          
	}

	public void addTemplate(PdfTemplate pdftemplate, AffineTransform affinetransform, boolean flag)
	{
		double ad[] = new double[6];
	//    0    0:bipush          6
	//    1    2:newarray        double[]
	//    2    4:astore          4
		affinetransform.getMatrix(ad);
	//    3    6:aload_2         
	//    4    7:aload           4
	//    5    9:invokevirtual   #1020 <Method void AffineTransform.getMatrix(double[])>
		addTemplate(pdftemplate, ad[0], ad[1], ad[2], ad[3], ad[4], ad[5], flag);
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:aload           4
	//    9   16:iconst_0        
	//   10   17:daload          
	//   11   18:aload           4
	//   12   20:iconst_1        
	//   13   21:daload          
	//   14   22:aload           4
	//   15   24:iconst_2        
	//   16   25:daload          
	//   17   26:aload           4
	//   18   28:iconst_3        
	//   19   29:daload          
	//   20   30:aload           4
	//   21   32:iconst_4        
	//   22   33:daload          
	//   23   34:aload           4
	//   24   36:iconst_5        
	//   25   37:daload          
	//   26   38:iload_3         
	//   27   39:invokevirtual   #1054 <Method void addTemplate(PdfTemplate, double, double, double, double, double, double, boolean)>
	//   28   42:return          
	}

	void addTemplateReference(PdfIndirectReference pdfindirectreference, PdfName pdfname, double d, double d1, double d2, double d3, double d4, double d5)
	{
		if(inText && isTagged())
	//*   0    0:aload_0         
	//*   1    1:getfield        #156 <Field boolean inText>
	//*   2    4:ifeq            18
	//*   3    7:aload_0         
	//*   4    8:invokevirtual   #220 <Method boolean isTagged()>
	//*   5   11:ifeq            18
			endText();
	//    6   14:aload_0         
	//    7   15:invokevirtual   #223 <Method void endText()>
		checkWriter();
	//    8   18:aload_0         
	//    9   19:invokevirtual   #188 <Method void checkWriter()>
		pdfindirectreference = ((PdfIndirectReference) (getPageResources().addXObject(pdfname, pdfindirectreference)));
	//   10   22:aload_0         
	//   11   23:invokevirtual   #204 <Method PageResources getPageResources()>
	//   12   26:aload_2         
	//   13   27:aload_1         
	//   14   28:invokevirtual   #216 <Method PdfName PageResources.addXObject(PdfName, PdfIndirectReference)>
	//   15   31:astore_1        
		content.append("q ");
	//   16   32:aload_0         
	//   17   33:getfield        #140 <Field ByteBuffer content>
	//   18   36:ldc2            #275 <String "q ">
	//   19   39:invokevirtual   #278 <Method ByteBuffer ByteBuffer.append(String)>
	//   20   42:pop             
		content.append(d).append(' ');
	//   21   43:aload_0         
	//   22   44:getfield        #140 <Field ByteBuffer content>
	//   23   47:dload_3         
	//   24   48:invokevirtual   #281 <Method ByteBuffer ByteBuffer.append(double)>
	//   25   51:bipush          32
	//   26   53:invokevirtual   #181 <Method ByteBuffer ByteBuffer.append(char)>
	//   27   56:pop             
		content.append(d1).append(' ');
	//   28   57:aload_0         
	//   29   58:getfield        #140 <Field ByteBuffer content>
	//   30   61:dload           5
	//   31   63:invokevirtual   #281 <Method ByteBuffer ByteBuffer.append(double)>
	//   32   66:bipush          32
	//   33   68:invokevirtual   #181 <Method ByteBuffer ByteBuffer.append(char)>
	//   34   71:pop             
		content.append(d2).append(' ');
	//   35   72:aload_0         
	//   36   73:getfield        #140 <Field ByteBuffer content>
	//   37   76:dload           7
	//   38   78:invokevirtual   #281 <Method ByteBuffer ByteBuffer.append(double)>
	//   39   81:bipush          32
	//   40   83:invokevirtual   #181 <Method ByteBuffer ByteBuffer.append(char)>
	//   41   86:pop             
		content.append(d3).append(' ');
	//   42   87:aload_0         
	//   43   88:getfield        #140 <Field ByteBuffer content>
	//   44   91:dload           9
	//   45   93:invokevirtual   #281 <Method ByteBuffer ByteBuffer.append(double)>
	//   46   96:bipush          32
	//   47   98:invokevirtual   #181 <Method ByteBuffer ByteBuffer.append(char)>
	//   48  101:pop             
		content.append(d4).append(' ');
	//   49  102:aload_0         
	//   50  103:getfield        #140 <Field ByteBuffer content>
	//   51  106:dload           11
	//   52  108:invokevirtual   #281 <Method ByteBuffer ByteBuffer.append(double)>
	//   53  111:bipush          32
	//   54  113:invokevirtual   #181 <Method ByteBuffer ByteBuffer.append(char)>
	//   55  116:pop             
		content.append(d5).append(" cm ");
	//   56  117:aload_0         
	//   57  118:getfield        #140 <Field ByteBuffer content>
	//   58  121:dload           13
	//   59  123:invokevirtual   #281 <Method ByteBuffer ByteBuffer.append(double)>
	//   60  126:ldc2            #283 <String " cm ">
	//   61  129:invokevirtual   #278 <Method ByteBuffer ByteBuffer.append(String)>
	//   62  132:pop             
		content.append(((PdfName) (pdfindirectreference)).getBytes()).append(" Do Q").append_i(separator);
	//   63  133:aload_0         
	//   64  134:getfield        #140 <Field ByteBuffer content>
	//   65  137:aload_1         
	//   66  138:invokevirtual   #287 <Method byte[] PdfName.getBytes()>
	//   67  141:invokevirtual   #290 <Method ByteBuffer ByteBuffer.append(byte[])>
	//   68  144:ldc2            #292 <String " Do Q">
	//   69  147:invokevirtual   #278 <Method ByteBuffer ByteBuffer.append(String)>
	//   70  150:aload_0         
	//   71  151:getfield        #152 <Field int separator>
	//   72  154:invokevirtual   #296 <Method ByteBuffer ByteBuffer.append_i(int)>
	//   73  157:pop             
	//   74  158:return          
	}

	void addTemplateReference(PdfIndirectReference pdfindirectreference, PdfName pdfname, float f, float f1, float f2, float f3, float f4, 
			float f5)
	{
		addTemplateReference(pdfindirectreference, pdfname, f, f1, f2, f3, f4, f5);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:fload_3         
	//    4    4:f2d             
	//    5    5:fload           4
	//    6    7:f2d             
	//    7    8:fload           5
	//    8   10:f2d             
	//    9   11:fload           6
	//   10   13:f2d             
	//   11   14:fload           7
	//   12   16:f2d             
	//   13   17:fload           8
	//   14   19:f2d             
	//   15   20:invokevirtual   #1072 <Method void addTemplateReference(PdfIndirectReference, PdfName, double, double, double, double, double, double)>
	//   16   23:return          
	}

	public void arc(double d, double d1, double d2, double d3, double d4, double d5)
	{
		ArrayList arraylist = bezierArc(d, d1, d2, d3, d4, d5);
	//    0    0:dload_1         
	//    1    1:dload_3         
	//    2    2:dload           5
	//    3    4:dload           7
	//    4    6:dload           9
	//    5    8:dload           11
	//    6   10:invokestatic    #461 <Method ArrayList bezierArc(double, double, double, double, double, double)>
	//    7   13:astore          14
		if(!arraylist.isEmpty())
	//*   8   15:aload           14
	//*   9   17:invokevirtual   #1074 <Method boolean ArrayList.isEmpty()>
	//*  10   20:ifeq            24
	//*  11   23:return          
		{
			double ad[] = (double[])arraylist.get(0);
	//   12   24:aload           14
	//   13   26:iconst_0        
	//   14   27:invokevirtual   #269 <Method Object ArrayList.get(int)>
	//   15   30:checkcast       #1076 <Class double[]>
	//   16   33:astore          15
			moveTo(ad[0], ad[1]);
	//   17   35:aload_0         
	//   18   36:aload           15
	//   19   38:iconst_0        
	//   20   39:daload          
	//   21   40:aload           15
	//   22   42:iconst_1        
	//   23   43:daload          
	//   24   44:invokevirtual   #1080 <Method void moveTo(double, double)>
			int i = 0;
	//   25   47:iconst_0        
	//   26   48:istore          13
			while(i < arraylist.size()) 
	//*  27   50:iload           13
	//*  28   52:aload           14
	//*  29   54:invokevirtual   #264 <Method int ArrayList.size()>
	//*  30   57:icmpge          23
			{
				double ad1[] = (double[])arraylist.get(i);
	//   31   60:aload           14
	//   32   62:iload           13
	//   33   64:invokevirtual   #269 <Method Object ArrayList.get(int)>
	//   34   67:checkcast       #1076 <Class double[]>
	//   35   70:astore          15
				curveTo(ad1[2], ad1[3], ad1[4], ad1[5], ad1[6], ad1[7]);
	//   36   72:aload_0         
	//   37   73:aload           15
	//   38   75:iconst_2        
	//   39   76:daload          
	//   40   77:aload           15
	//   41   79:iconst_3        
	//   42   80:daload          
	//   43   81:aload           15
	//   44   83:iconst_4        
	//   45   84:daload          
	//   46   85:aload           15
	//   47   87:iconst_5        
	//   48   88:daload          
	//   49   89:aload           15
	//   50   91:bipush          6
	//   51   93:daload          
	//   52   94:aload           15
	//   53   96:bipush          7
	//   54   98:daload          
	//   55   99:invokevirtual   #1083 <Method void curveTo(double, double, double, double, double, double)>
				i++;
	//   56  102:iload           13
	//   57  104:iconst_1        
	//   58  105:iadd            
	//   59  106:istore          13
			}
		}
	//*  60  108:goto            50
	}

	public void arc(float f, float f1, float f2, float f3, float f4, float f5)
	{
		arc(f, f1, f2, f3, f4, f5);
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:f2d             
	//    3    3:fload_2         
	//    4    4:f2d             
	//    5    5:fload_3         
	//    6    6:f2d             
	//    7    7:fload           4
	//    8    9:f2d             
	//    9   10:fload           5
	//   10   12:f2d             
	//   11   13:fload           6
	//   12   15:f2d             
	//   13   16:invokevirtual   #1085 <Method void arc(double, double, double, double, double, double)>
	//   14   19:return          
	}

	public void beginLayer(PdfOCG pdfocg)
	{
		if((pdfocg instanceof PdfLayer) && ((PdfLayer)pdfocg).getTitle() != null)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #1087 <Class PdfLayer>
	//*   2    4:ifeq            35
	//*   3    7:aload_1         
	//*   4    8:checkcast       #1087 <Class PdfLayer>
	//*   5   11:invokevirtual   #1090 <Method String PdfLayer.getTitle()>
	//*   6   14:ifnull          35
			throw new IllegalArgumentException(MessageLocalization.getComposedMessage("a.title.is.not.a.layer", new Object[0]));
	//    7   17:new             #414 <Class IllegalArgumentException>
	//    8   20:dup             
	//    9   21:ldc2            #1092 <String "a.title.is.not.a.layer">
	//   10   24:iconst_0        
	//   11   25:anewarray       Object[]
	//   12   28:invokestatic    #239 <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//   13   31:invokespecial   #427 <Method void IllegalArgumentException(String)>
	//   14   34:athrow          
		if(layerDepth == null)
	//*  15   35:aload_0         
	//*  16   36:getfield        #1094 <Field ArrayList layerDepth>
	//*  17   39:ifnonnull       53
			layerDepth = new ArrayList();
	//   18   42:aload_0         
	//   19   43:new             #147 <Class ArrayList>
	//   20   46:dup             
	//   21   47:invokespecial   #148 <Method void ArrayList()>
	//   22   50:putfield        #1094 <Field ArrayList layerDepth>
		if(pdfocg instanceof PdfLayerMembership)
	//*  23   53:aload_1         
	//*  24   54:instanceof      #1096 <Class PdfLayerMembership>
	//*  25   57:ifeq            78
		{
			layerDepth.add(((Object) (Integer.valueOf(1))));
	//   26   60:aload_0         
	//   27   61:getfield        #1094 <Field ArrayList layerDepth>
	//   28   64:iconst_1        
	//   29   65:invokestatic    #969 <Method Integer Integer.valueOf(int)>
	//   30   68:invokevirtual   #273 <Method boolean ArrayList.add(Object)>
	//   31   71:pop             
			beginLayer2(pdfocg);
	//   32   72:aload_0         
	//   33   73:aload_1         
	//   34   74:invokespecial   #1098 <Method void beginLayer2(PdfOCG)>
			return;
	//   35   77:return          
		}
		int i = 0;
	//   36   78:iconst_0        
	//   37   79:istore_2        
		for(pdfocg = ((PdfOCG) ((PdfLayer)pdfocg)); pdfocg != null;)
	//*  38   80:aload_1         
	//*  39   81:checkcast       #1087 <Class PdfLayer>
	//*  40   84:astore_1        
	//*  41   85:aload_1         
	//*  42   86:ifnull          117
		{
			int j = i;
	//   43   89:iload_2         
	//   44   90:istore_3        
			if(((PdfLayer) (pdfocg)).getTitle() == null)
	//*  45   91:aload_1         
	//*  46   92:invokevirtual   #1090 <Method String PdfLayer.getTitle()>
	//*  47   95:ifnonnull       107
			{
				beginLayer2(pdfocg);
	//   48   98:aload_0         
	//   49   99:aload_1         
	//   50  100:invokespecial   #1098 <Method void beginLayer2(PdfOCG)>
				j = i + 1;
	//   51  103:iload_2         
	//   52  104:iconst_1        
	//   53  105:iadd            
	//   54  106:istore_3        
			}
			pdfocg = ((PdfOCG) (((PdfLayer) (pdfocg)).getParent()));
	//   55  107:aload_1         
	//   56  108:invokevirtual   #1102 <Method PdfLayer PdfLayer.getParent()>
	//   57  111:astore_1        
			i = j;
	//   58  112:iload_3         
	//   59  113:istore_2        
		}

	//*  60  114:goto            85
		layerDepth.add(((Object) (Integer.valueOf(i))));
	//   61  117:aload_0         
	//   62  118:getfield        #1094 <Field ArrayList layerDepth>
	//   63  121:iload_2         
	//   64  122:invokestatic    #969 <Method Integer Integer.valueOf(int)>
	//   65  125:invokevirtual   #273 <Method boolean ArrayList.add(Object)>
	//   66  128:pop             
	//   67  129:return          
	}

	public void beginMarkedContentSequence(PdfName pdfname)
	{
		beginMarkedContentSequence(pdfname, ((PdfDictionary) (null)), false);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:iconst_0        
	//    4    4:invokevirtual   #645 <Method void beginMarkedContentSequence(PdfName, PdfDictionary, boolean)>
	//    5    7:return          
	}

	public void beginMarkedContentSequence(PdfName pdfname, PdfDictionary pdfdictionary, boolean flag)
	{
		int i = content.size();
	//    0    0:aload_0         
	//    1    1:getfield        #140 <Field ByteBuffer content>
	//    2    4:invokevirtual   #395 <Method int ByteBuffer.size()>
	//    3    7:istore          4
		if(pdfdictionary != null) goto _L2; else goto _L1
	//    4    9:aload_2         
	//    5   10:ifnonnull       68
_L1:
		content.append(pdfname.getBytes()).append(" BMC").append_i(separator);
	//    6   13:aload_0         
	//    7   14:getfield        #140 <Field ByteBuffer content>
	//    8   17:aload_1         
	//    9   18:invokevirtual   #287 <Method byte[] PdfName.getBytes()>
	//   10   21:invokevirtual   #290 <Method ByteBuffer ByteBuffer.append(byte[])>
	//   11   24:ldc2            #1106 <String " BMC">
	//   12   27:invokevirtual   #278 <Method ByteBuffer ByteBuffer.append(String)>
	//   13   30:aload_0         
	//   14   31:getfield        #152 <Field int separator>
	//   15   34:invokevirtual   #296 <Method ByteBuffer ByteBuffer.append_i(int)>
	//   16   37:pop             
		setMcDepth(getMcDepth() + 1);
	//   17   38:aload_0         
	//   18   39:aload_0         
	//   19   40:invokevirtual   #391 <Method int getMcDepth()>
	//   20   43:iconst_1        
	//   21   44:iadd            
	//   22   45:invokevirtual   #394 <Method void setMcDepth(int)>
_L4:
		markedContentSize = markedContentSize + (content.size() - i);
	//   23   48:aload_0         
	//   24   49:aload_0         
	//   25   50:getfield        #142 <Field int markedContentSize>
	//   26   53:aload_0         
	//   27   54:getfield        #140 <Field ByteBuffer content>
	//   28   57:invokevirtual   #395 <Method int ByteBuffer.size()>
	//   29   60:iload           4
	//   30   62:isub            
	//   31   63:iadd            
	//   32   64:putfield        #142 <Field int markedContentSize>
		return;
	//   33   67:return          
_L2:
		content.append(pdfname.getBytes()).append(' ');
	//   34   68:aload_0         
	//   35   69:getfield        #140 <Field ByteBuffer content>
	//   36   72:aload_1         
	//   37   73:invokevirtual   #287 <Method byte[] PdfName.getBytes()>
	//   38   76:invokevirtual   #290 <Method ByteBuffer ByteBuffer.append(byte[])>
	//   39   79:bipush          32
	//   40   81:invokevirtual   #181 <Method ByteBuffer ByteBuffer.append(char)>
	//   41   84:pop             
		if(!flag)
			break; /* Loop/switch isn't completed */
	//   42   85:iload_3         
	//   43   86:ifeq            142
		try
		{
			pdfdictionary.toPdf(writer, ((java.io.OutputStream) (content)));
	//   44   89:aload_2         
	//   45   90:aload_0         
	//   46   91:getfield        #164 <Field PdfWriter writer>
	//   47   94:aload_0         
	//   48   95:getfield        #140 <Field ByteBuffer content>
	//   49   98:invokevirtual   #1107 <Method void PdfDictionary.toPdf(PdfWriter, java.io.OutputStream)>
		}
	//*  50  101:aload_0         
	//*  51  102:getfield        #140 <Field ByteBuffer content>
	//*  52  105:ldc2            #325 <String " BDC">
	//*  53  108:invokevirtual   #278 <Method ByteBuffer ByteBuffer.append(String)>
	//*  54  111:aload_0         
	//*  55  112:getfield        #152 <Field int separator>
	//*  56  115:invokevirtual   #296 <Method ByteBuffer ByteBuffer.append_i(int)>
	//*  57  118:pop             
	//*  58  119:aload_0         
	//*  59  120:aload_0         
	//*  60  121:invokevirtual   #391 <Method int getMcDepth()>
	//*  61  124:iconst_1        
	//*  62  125:iadd            
	//*  63  126:invokevirtual   #394 <Method void setMcDepth(int)>
	//*  64  129:goto            48
		// Misplaced declaration of an exception variable
		catch(PdfName pdfname)
	//*  65  132:astore_1        
		{
			throw new ExceptionConverter(((Exception) (pdfname)));
	//   66  133:new             #1109 <Class ExceptionConverter>
	//   67  136:dup             
	//   68  137:aload_1         
	//   69  138:invokespecial   #1112 <Method void ExceptionConverter(Exception)>
	//   70  141:athrow          
		}
_L5:
		content.append(" BDC").append_i(separator);
		setMcDepth(getMcDepth() + 1);
		if(true) goto _L4; else goto _L3
_L3:
		if(writer.propertyExists(((Object) (pdfdictionary))))
	//*  71  142:aload_0         
	//*  72  143:getfield        #164 <Field PdfWriter writer>
	//*  73  146:aload_2         
	//*  74  147:invokevirtual   #1115 <Method boolean PdfWriter.propertyExists(Object)>
	//*  75  150:ifeq            200
			pdfname = ((PdfName) (writer.addSimpleProperty(((Object) (pdfdictionary)), ((PdfIndirectReference) (null)))));
	//   76  153:aload_0         
	//   77  154:getfield        #164 <Field PdfWriter writer>
	//   78  157:aload_2         
	//   79  158:aconst_null     
	//   80  159:invokevirtual   #318 <Method PdfObject[] PdfWriter.addSimpleProperty(Object, PdfIndirectReference)>
	//   81  162:astore_1        
		else
	//*  82  163:aload_1         
	//*  83  164:iconst_0        
	//*  84  165:aaload          
	//*  85  166:checkcast       #77  <Class PdfName>
	//*  86  169:astore_2        
	//*  87  170:aload_0         
	//*  88  171:invokevirtual   #204 <Method PageResources getPageResources()>
	//*  89  174:aload_2         
	//*  90  175:aload_1         
	//*  91  176:iconst_1        
	//*  92  177:aaload          
	//*  93  178:checkcast       #1117 <Class PdfIndirectReference>
	//*  94  181:invokevirtual   #321 <Method PdfName PageResources.addProperty(PdfName, PdfIndirectReference)>
	//*  95  184:astore_1        
	//*  96  185:aload_0         
	//*  97  186:getfield        #140 <Field ByteBuffer content>
	//*  98  189:aload_1         
	//*  99  190:invokevirtual   #287 <Method byte[] PdfName.getBytes()>
	//* 100  193:invokevirtual   #290 <Method ByteBuffer ByteBuffer.append(byte[])>
	//* 101  196:pop             
	//* 102  197:goto            101
			pdfname = ((PdfName) (writer.addSimpleProperty(((Object) (pdfdictionary)), writer.getPdfIndirectReference())));
	//  103  200:aload_0         
	//  104  201:getfield        #164 <Field PdfWriter writer>
	//  105  204:aload_2         
	//  106  205:aload_0         
	//  107  206:getfield        #164 <Field PdfWriter writer>
	//  108  209:invokevirtual   #1120 <Method PdfIndirectReference PdfWriter.getPdfIndirectReference()>
	//  109  212:invokevirtual   #318 <Method PdfObject[] PdfWriter.addSimpleProperty(Object, PdfIndirectReference)>
	//  110  215:astore_1        
		pdfdictionary = ((PdfDictionary) ((PdfName)pdfname[0]));
		pdfname = getPageResources().addProperty(((PdfName) (pdfdictionary)), (PdfIndirectReference)pdfname[1]);
		content.append(pdfname.getBytes());
		  goto _L5
		if(true) goto _L4; else goto _L6
_L6:
	//* 111  216:goto            163
	}

	public void beginMarkedContentSequence(PdfStructureElement pdfstructureelement)
	{
		beginMarkedContentSequence(pdfstructureelement, ((String) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:invokespecial   #654 <Method void beginMarkedContentSequence(PdfStructureElement, String)>
	//    4    6:return          
	}

	public void beginText()
	{
		beginText(false);
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:invokevirtual   #490 <Method void beginText(boolean)>
	//    3    5:return          
	}

	protected void beginText(boolean flag)
	{
		if(inText)
	//*   0    0:aload_0         
	//*   1    1:getfield        #156 <Field boolean inText>
	//*   2    4:ifeq            33
			if(isTagged())
	//*   3    7:aload_0         
	//*   4    8:invokevirtual   #220 <Method boolean isTagged()>
	//*   5   11:ifeq            15
				return;
	//    6   14:return          
			else
				throw new IllegalPdfSyntaxException(MessageLocalization.getComposedMessage("unbalanced.begin.end.text.operators", new Object[0]));
	//    7   15:new             #1122 <Class IllegalPdfSyntaxException>
	//    8   18:dup             
	//    9   19:ldc2            #1124 <String "unbalanced.begin.end.text.operators">
	//   10   22:iconst_0        
	//   11   23:anewarray       Object[]
	//   12   26:invokestatic    #239 <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//   13   29:invokespecial   #1125 <Method void IllegalPdfSyntaxException(String)>
	//   14   32:athrow          
		inText = true;
	//   15   33:aload_0         
	//   16   34:iconst_1        
	//   17   35:putfield        #156 <Field boolean inText>
		content.append("BT").append_i(separator);
	//   18   38:aload_0         
	//   19   39:getfield        #140 <Field ByteBuffer content>
	//   20   42:ldc2            #1127 <String "BT">
	//   21   45:invokevirtual   #278 <Method ByteBuffer ByteBuffer.append(String)>
	//   22   48:aload_0         
	//   23   49:getfield        #152 <Field int separator>
	//   24   52:invokevirtual   #296 <Method ByteBuffer ByteBuffer.append_i(int)>
	//   25   55:pop             
		if(flag)
	//*  26   56:iload_1         
	//*  27   57:ifeq            139
		{
			float f = state.xTLM;
	//   28   60:aload_0         
	//   29   61:getfield        #145 <Field PdfContentByte$GraphicState state>
	//   30   64:getfield        #1130 <Field float PdfContentByte$GraphicState.xTLM>
	//   31   67:fstore_2        
			float f1 = state.tx;
	//   32   68:aload_0         
	//   33   69:getfield        #145 <Field PdfContentByte$GraphicState state>
	//   34   72:getfield        #1133 <Field float PdfContentByte$GraphicState.tx>
	//   35   75:fstore_3        
			setTextMatrix(state.aTLM, state.bTLM, state.cTLM, state.dTLM, state.tx, state.yTLM);
	//   36   76:aload_0         
	//   37   77:aload_0         
	//   38   78:getfield        #145 <Field PdfContentByte$GraphicState state>
	//   39   81:getfield        #1136 <Field float PdfContentByte$GraphicState.aTLM>
	//   40   84:aload_0         
	//   41   85:getfield        #145 <Field PdfContentByte$GraphicState state>
	//   42   88:getfield        #1139 <Field float PdfContentByte$GraphicState.bTLM>
	//   43   91:aload_0         
	//   44   92:getfield        #145 <Field PdfContentByte$GraphicState state>
	//   45   95:getfield        #1142 <Field float PdfContentByte$GraphicState.cTLM>
	//   46   98:aload_0         
	//   47   99:getfield        #145 <Field PdfContentByte$GraphicState state>
	//   48  102:getfield        #1145 <Field float PdfContentByte$GraphicState.dTLM>
	//   49  105:aload_0         
	//   50  106:getfield        #145 <Field PdfContentByte$GraphicState state>
	//   51  109:getfield        #1133 <Field float PdfContentByte$GraphicState.tx>
	//   52  112:aload_0         
	//   53  113:getfield        #145 <Field PdfContentByte$GraphicState state>
	//   54  116:getfield        #1148 <Field float PdfContentByte$GraphicState.yTLM>
	//   55  119:invokevirtual   #703 <Method void setTextMatrix(float, float, float, float, float, float)>
			state.xTLM = f;
	//   56  122:aload_0         
	//   57  123:getfield        #145 <Field PdfContentByte$GraphicState state>
	//   58  126:fload_2         
	//   59  127:putfield        #1130 <Field float PdfContentByte$GraphicState.xTLM>
			state.tx = f1;
	//   60  130:aload_0         
	//   61  131:getfield        #145 <Field PdfContentByte$GraphicState state>
	//   62  134:fload_3         
	//   63  135:putfield        #1133 <Field float PdfContentByte$GraphicState.tx>
			return;
	//   64  138:return          
		} else
		{
			state.xTLM = 0.0F;
	//   65  139:aload_0         
	//   66  140:getfield        #145 <Field PdfContentByte$GraphicState state>
	//   67  143:fconst_0        
	//   68  144:putfield        #1130 <Field float PdfContentByte$GraphicState.xTLM>
			state.yTLM = 0.0F;
	//   69  147:aload_0         
	//   70  148:getfield        #145 <Field PdfContentByte$GraphicState state>
	//   71  151:fconst_0        
	//   72  152:putfield        #1148 <Field float PdfContentByte$GraphicState.yTLM>
			state.tx = 0.0F;
	//   73  155:aload_0         
	//   74  156:getfield        #145 <Field PdfContentByte$GraphicState state>
	//   75  159:fconst_0        
	//   76  160:putfield        #1133 <Field float PdfContentByte$GraphicState.tx>
			return;
	//   77  163:return          
		}
	}

	void checkNoPattern(PdfTemplate pdftemplate)
	{
		if(pdftemplate.getType() == 3)
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #1149 <Method int PdfTemplate.getType()>
	//*   2    4:iconst_3        
	//*   3    5:icmpne          26
			throw new RuntimeException(MessageLocalization.getComposedMessage("invalid.use.of.a.pattern.a.template.was.expected", new Object[0]));
	//    4    8:new             #231 <Class RuntimeException>
	//    5   11:dup             
	//    6   12:ldc2            #1151 <String "invalid.use.of.a.pattern.a.template.was.expected">
	//    7   15:iconst_0        
	//    8   16:anewarray       Object[]
	//    9   19:invokestatic    #239 <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//   10   22:invokespecial   #242 <Method void RuntimeException(String)>
	//   11   25:athrow          
		else
			return;
	//   12   26:return          
	}

	protected void checkState()
	{
		boolean flag;
		boolean flag1;
		flag1 = false;
	//    0    0:iconst_0        
	//    1    1:istore_2        
		flag = false;
	//    2    2:iconst_0        
	//    3    3:istore_1        
		if(state.textRenderMode != 0) goto _L2; else goto _L1
	//    4    4:aload_0         
	//    5    5:getfield        #145 <Field PdfContentByte$GraphicState state>
	//    6    8:getfield        #1155 <Field int PdfContentByte$GraphicState.textRenderMode>
	//    7   11:ifne            71
_L1:
		flag = true;
	//    8   14:iconst_1        
	//    9   15:istore_1        
_L4:
		if(flag)
	//*  10   16:iload_1         
	//*  11   17:ifeq            35
			PdfWriter.checkPdfIsoConformance(writer, 1, ((Object) (state.colorFill)));
	//   12   20:aload_0         
	//   13   21:getfield        #164 <Field PdfWriter writer>
	//   14   24:iconst_1        
	//   15   25:aload_0         
	//   16   26:getfield        #145 <Field PdfContentByte$GraphicState state>
	//   17   29:getfield        #666 <Field BaseColor PdfContentByte$GraphicState.colorFill>
	//   18   32:invokestatic    #196 <Method void PdfWriter.checkPdfIsoConformance(PdfWriter, int, Object)>
		if(flag1)
	//*  19   35:iload_2         
	//*  20   36:ifeq            54
			PdfWriter.checkPdfIsoConformance(writer, 1, ((Object) (state.colorStroke)));
	//   21   39:aload_0         
	//   22   40:getfield        #164 <Field PdfWriter writer>
	//   23   43:iconst_1        
	//   24   44:aload_0         
	//   25   45:getfield        #145 <Field PdfContentByte$GraphicState state>
	//   26   48:getfield        #669 <Field BaseColor PdfContentByte$GraphicState.colorStroke>
	//   27   51:invokestatic    #196 <Method void PdfWriter.checkPdfIsoConformance(PdfWriter, int, Object)>
		PdfWriter.checkPdfIsoConformance(writer, 6, ((Object) (state.extGState)));
	//   28   54:aload_0         
	//   29   55:getfield        #164 <Field PdfWriter writer>
	//   30   58:bipush          6
	//   31   60:aload_0         
	//   32   61:getfield        #145 <Field PdfContentByte$GraphicState state>
	//   33   64:getfield        #1159 <Field PdfObject PdfContentByte$GraphicState.extGState>
	//   34   67:invokestatic    #196 <Method void PdfWriter.checkPdfIsoConformance(PdfWriter, int, Object)>
		return;
	//   35   70:return          
_L2:
		if(state.textRenderMode == 1)
	//*  36   71:aload_0         
	//*  37   72:getfield        #145 <Field PdfContentByte$GraphicState state>
	//*  38   75:getfield        #1155 <Field int PdfContentByte$GraphicState.textRenderMode>
	//*  39   78:iconst_1        
	//*  40   79:icmpne          87
			flag1 = true;
	//   41   82:iconst_1        
	//   42   83:istore_2        
		else
	//*  43   84:goto            16
		if(state.textRenderMode == 2)
	//*  44   87:aload_0         
	//*  45   88:getfield        #145 <Field PdfContentByte$GraphicState state>
	//*  46   91:getfield        #1155 <Field int PdfContentByte$GraphicState.textRenderMode>
	//*  47   94:iconst_2        
	//*  48   95:icmpne          16
		{
			flag = true;
	//   49   98:iconst_1        
	//   50   99:istore_1        
			flag1 = true;
	//   51  100:iconst_1        
	//   52  101:istore_2        
		}
		if(true) goto _L4; else goto _L3
	//   53  102:goto            16
_L3:
	}

	protected void checkWriter()
	{
		if(writer == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #164 <Field PdfWriter writer>
	//*   2    4:ifnonnull       25
			throw new NullPointerException(MessageLocalization.getComposedMessage("the.writer.in.pdfcontentbyte.is.null", new Object[0]));
	//    3    7:new             #672 <Class NullPointerException>
	//    4   10:dup             
	//    5   11:ldc2            #1161 <String "the.writer.in.pdfcontentbyte.is.null">
	//    6   14:iconst_0        
	//    7   15:anewarray       Object[]
	//    8   18:invokestatic    #239 <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//    9   21:invokespecial   #675 <Method void NullPointerException(String)>
	//   10   24:athrow          
		else
			return;
	//   11   25:return          
	}

	public void circle(double d, double d1, double d2)
	{
		moveTo(d + d2, d1);
	//    0    0:aload_0         
	//    1    1:dload_1         
	//    2    2:dload           5
	//    3    4:dadd            
	//    4    5:dload_3         
	//    5    6:invokevirtual   #1080 <Method void moveTo(double, double)>
		curveTo(d + d2, (double)0.5523F * d2 + d1, (double)0.5523F * d2 + d, d1 + d2, d, d1 + d2);
	//    6    9:aload_0         
	//    7   10:dload_1         
	//    8   11:dload           5
	//    9   13:dadd            
	//   10   14:ldc2            #1164 <Float 0.5523F>
	//   11   17:f2d             
	//   12   18:dload           5
	//   13   20:dmul            
	//   14   21:dload_3         
	//   15   22:dadd            
	//   16   23:ldc2            #1164 <Float 0.5523F>
	//   17   26:f2d             
	//   18   27:dload           5
	//   19   29:dmul            
	//   20   30:dload_1         
	//   21   31:dadd            
	//   22   32:dload_3         
	//   23   33:dload           5
	//   24   35:dadd            
	//   25   36:dload_1         
	//   26   37:dload_3         
	//   27   38:dload           5
	//   28   40:dadd            
	//   29   41:invokevirtual   #1083 <Method void curveTo(double, double, double, double, double, double)>
		curveTo(d - (double)0.5523F * d2, d1 + d2, d - d2, (double)0.5523F * d2 + d1, d - d2, d1);
	//   30   44:aload_0         
	//   31   45:dload_1         
	//   32   46:ldc2            #1164 <Float 0.5523F>
	//   33   49:f2d             
	//   34   50:dload           5
	//   35   52:dmul            
	//   36   53:dsub            
	//   37   54:dload_3         
	//   38   55:dload           5
	//   39   57:dadd            
	//   40   58:dload_1         
	//   41   59:dload           5
	//   42   61:dsub            
	//   43   62:ldc2            #1164 <Float 0.5523F>
	//   44   65:f2d             
	//   45   66:dload           5
	//   46   68:dmul            
	//   47   69:dload_3         
	//   48   70:dadd            
	//   49   71:dload_1         
	//   50   72:dload           5
	//   51   74:dsub            
	//   52   75:dload_3         
	//   53   76:invokevirtual   #1083 <Method void curveTo(double, double, double, double, double, double)>
		curveTo(d - d2, d1 - (double)0.5523F * d2, d - (double)0.5523F * d2, d1 - d2, d, d1 - d2);
	//   54   79:aload_0         
	//   55   80:dload_1         
	//   56   81:dload           5
	//   57   83:dsub            
	//   58   84:dload_3         
	//   59   85:ldc2            #1164 <Float 0.5523F>
	//   60   88:f2d             
	//   61   89:dload           5
	//   62   91:dmul            
	//   63   92:dsub            
	//   64   93:dload_1         
	//   65   94:ldc2            #1164 <Float 0.5523F>
	//   66   97:f2d             
	//   67   98:dload           5
	//   68  100:dmul            
	//   69  101:dsub            
	//   70  102:dload_3         
	//   71  103:dload           5
	//   72  105:dsub            
	//   73  106:dload_1         
	//   74  107:dload_3         
	//   75  108:dload           5
	//   76  110:dsub            
	//   77  111:invokevirtual   #1083 <Method void curveTo(double, double, double, double, double, double)>
		curveTo((double)0.5523F * d2 + d, d1 - d2, d + d2, d1 - (double)0.5523F * d2, d + d2, d1);
	//   78  114:aload_0         
	//   79  115:ldc2            #1164 <Float 0.5523F>
	//   80  118:f2d             
	//   81  119:dload           5
	//   82  121:dmul            
	//   83  122:dload_1         
	//   84  123:dadd            
	//   85  124:dload_3         
	//   86  125:dload           5
	//   87  127:dsub            
	//   88  128:dload_1         
	//   89  129:dload           5
	//   90  131:dadd            
	//   91  132:dload_3         
	//   92  133:ldc2            #1164 <Float 0.5523F>
	//   93  136:f2d             
	//   94  137:dload           5
	//   95  139:dmul            
	//   96  140:dsub            
	//   97  141:dload_1         
	//   98  142:dload           5
	//   99  144:dadd            
	//  100  145:dload_3         
	//  101  146:invokevirtual   #1083 <Method void curveTo(double, double, double, double, double, double)>
	//  102  149:return          
	}

	public void circle(float f, float f1, float f2)
	{
		circle(f, f1, f2);
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:f2d             
	//    3    3:fload_2         
	//    4    4:f2d             
	//    5    5:fload_3         
	//    6    6:f2d             
	//    7    7:invokevirtual   #1166 <Method void circle(double, double, double)>
	//    8   10:return          
	}

	public void clip()
	{
		if(inText && isTagged())
	//*   0    0:aload_0         
	//*   1    1:getfield        #156 <Field boolean inText>
	//*   2    4:ifeq            18
	//*   3    7:aload_0         
	//*   4    8:invokevirtual   #220 <Method boolean isTagged()>
	//*   5   11:ifeq            18
			endText();
	//    6   14:aload_0         
	//    7   15:invokevirtual   #223 <Method void endText()>
		content.append("W").append_i(separator);
	//    8   18:aload_0         
	//    9   19:getfield        #140 <Field ByteBuffer content>
	//   10   22:ldc2            #1169 <String "W">
	//   11   25:invokevirtual   #278 <Method ByteBuffer ByteBuffer.append(String)>
	//   12   28:aload_0         
	//   13   29:getfield        #152 <Field int separator>
	//   14   32:invokevirtual   #296 <Method ByteBuffer ByteBuffer.append_i(int)>
	//   15   35:pop             
	//   16   36:return          
	}

	public void closeMCBlock(IAccessibleElement iaccessibleelement)
	{
		if(isTagged() && iaccessibleelement != null && getMcElements().contains(((Object) (iaccessibleelement))))
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #220 <Method boolean isTagged()>
	//*   2    4:ifeq            36
	//*   3    7:aload_1         
	//*   4    8:ifnull          36
	//*   5   11:aload_0         
	//*   6   12:invokevirtual   #260 <Method ArrayList getMcElements()>
	//*   7   15:aload_1         
	//*   8   16:invokevirtual   #1172 <Method boolean ArrayList.contains(Object)>
	//*   9   19:ifeq            36
		{
			closeMCBlockInt(iaccessibleelement);
	//   10   22:aload_0         
	//   11   23:aload_1         
	//   12   24:invokespecial   #1174 <Method void closeMCBlockInt(IAccessibleElement)>
			getMcElements().remove(((Object) (iaccessibleelement)));
	//   13   27:aload_0         
	//   14   28:invokevirtual   #260 <Method ArrayList getMcElements()>
	//   15   31:aload_1         
	//   16   32:invokevirtual   #1177 <Method boolean ArrayList.remove(Object)>
	//   17   35:pop             
		}
	//   18   36:return          
	}

	public void closePath()
	{
label0:
		{
			if(inText)
	//*   0    0:aload_0         
	//*   1    1:getfield        #156 <Field boolean inText>
	//*   2    4:ifeq            18
			{
				if(!isTagged())
					break label0;
	//    3    7:aload_0         
	//    4    8:invokevirtual   #220 <Method boolean isTagged()>
	//    5   11:ifeq            37
				endText();
	//    6   14:aload_0         
	//    7   15:invokevirtual   #223 <Method void endText()>
			}
			content.append("h").append_i(separator);
	//    8   18:aload_0         
	//    9   19:getfield        #140 <Field ByteBuffer content>
	//   10   22:ldc2            #1180 <String "h">
	//   11   25:invokevirtual   #278 <Method ByteBuffer ByteBuffer.append(String)>
	//   12   28:aload_0         
	//   13   29:getfield        #152 <Field int separator>
	//   14   32:invokevirtual   #296 <Method ByteBuffer ByteBuffer.append_i(int)>
	//   15   35:pop             
			return;
	//   16   36:return          
		}
		throw new IllegalPdfSyntaxException(MessageLocalization.getComposedMessage("path.construction.operator.inside.text.object", new Object[0]));
	//   17   37:new             #1122 <Class IllegalPdfSyntaxException>
	//   18   40:dup             
	//   19   41:ldc2            #1182 <String "path.construction.operator.inside.text.object">
	//   20   44:iconst_0        
	//   21   45:anewarray       Object[]
	//   22   48:invokestatic    #239 <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//   23   51:invokespecial   #1125 <Method void IllegalPdfSyntaxException(String)>
	//   24   54:athrow          
	}

	public void closePathEoFillStroke()
	{
label0:
		{
			if(inText)
	//*   0    0:aload_0         
	//*   1    1:getfield        #156 <Field boolean inText>
	//*   2    4:ifeq            18
			{
				if(!isTagged())
					break label0;
	//    3    7:aload_0         
	//    4    8:invokevirtual   #220 <Method boolean isTagged()>
	//    5   11:ifeq            83
				endText();
	//    6   14:aload_0         
	//    7   15:invokevirtual   #223 <Method void endText()>
			}
			PdfWriter.checkPdfIsoConformance(writer, 1, ((Object) (state.colorFill)));
	//    8   18:aload_0         
	//    9   19:getfield        #164 <Field PdfWriter writer>
	//   10   22:iconst_1        
	//   11   23:aload_0         
	//   12   24:getfield        #145 <Field PdfContentByte$GraphicState state>
	//   13   27:getfield        #666 <Field BaseColor PdfContentByte$GraphicState.colorFill>
	//   14   30:invokestatic    #196 <Method void PdfWriter.checkPdfIsoConformance(PdfWriter, int, Object)>
			PdfWriter.checkPdfIsoConformance(writer, 1, ((Object) (state.colorStroke)));
	//   15   33:aload_0         
	//   16   34:getfield        #164 <Field PdfWriter writer>
	//   17   37:iconst_1        
	//   18   38:aload_0         
	//   19   39:getfield        #145 <Field PdfContentByte$GraphicState state>
	//   20   42:getfield        #669 <Field BaseColor PdfContentByte$GraphicState.colorStroke>
	//   21   45:invokestatic    #196 <Method void PdfWriter.checkPdfIsoConformance(PdfWriter, int, Object)>
			PdfWriter.checkPdfIsoConformance(writer, 6, ((Object) (state.extGState)));
	//   22   48:aload_0         
	//   23   49:getfield        #164 <Field PdfWriter writer>
	//   24   52:bipush          6
	//   25   54:aload_0         
	//   26   55:getfield        #145 <Field PdfContentByte$GraphicState state>
	//   27   58:getfield        #1159 <Field PdfObject PdfContentByte$GraphicState.extGState>
	//   28   61:invokestatic    #196 <Method void PdfWriter.checkPdfIsoConformance(PdfWriter, int, Object)>
			content.append("b*").append_i(separator);
	//   29   64:aload_0         
	//   30   65:getfield        #140 <Field ByteBuffer content>
	//   31   68:ldc2            #1185 <String "b*">
	//   32   71:invokevirtual   #278 <Method ByteBuffer ByteBuffer.append(String)>
	//   33   74:aload_0         
	//   34   75:getfield        #152 <Field int separator>
	//   35   78:invokevirtual   #296 <Method ByteBuffer ByteBuffer.append_i(int)>
	//   36   81:pop             
			return;
	//   37   82:return          
		}
		throw new IllegalPdfSyntaxException(MessageLocalization.getComposedMessage("path.construction.operator.inside.text.object", new Object[0]));
	//   38   83:new             #1122 <Class IllegalPdfSyntaxException>
	//   39   86:dup             
	//   40   87:ldc2            #1182 <String "path.construction.operator.inside.text.object">
	//   41   90:iconst_0        
	//   42   91:anewarray       Object[]
	//   43   94:invokestatic    #239 <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//   44   97:invokespecial   #1125 <Method void IllegalPdfSyntaxException(String)>
	//   45  100:athrow          
	}

	public void closePathFillStroke()
	{
label0:
		{
			if(inText)
	//*   0    0:aload_0         
	//*   1    1:getfield        #156 <Field boolean inText>
	//*   2    4:ifeq            18
			{
				if(!isTagged())
					break label0;
	//    3    7:aload_0         
	//    4    8:invokevirtual   #220 <Method boolean isTagged()>
	//    5   11:ifeq            83
				endText();
	//    6   14:aload_0         
	//    7   15:invokevirtual   #223 <Method void endText()>
			}
			PdfWriter.checkPdfIsoConformance(writer, 1, ((Object) (state.colorFill)));
	//    8   18:aload_0         
	//    9   19:getfield        #164 <Field PdfWriter writer>
	//   10   22:iconst_1        
	//   11   23:aload_0         
	//   12   24:getfield        #145 <Field PdfContentByte$GraphicState state>
	//   13   27:getfield        #666 <Field BaseColor PdfContentByte$GraphicState.colorFill>
	//   14   30:invokestatic    #196 <Method void PdfWriter.checkPdfIsoConformance(PdfWriter, int, Object)>
			PdfWriter.checkPdfIsoConformance(writer, 1, ((Object) (state.colorStroke)));
	//   15   33:aload_0         
	//   16   34:getfield        #164 <Field PdfWriter writer>
	//   17   37:iconst_1        
	//   18   38:aload_0         
	//   19   39:getfield        #145 <Field PdfContentByte$GraphicState state>
	//   20   42:getfield        #669 <Field BaseColor PdfContentByte$GraphicState.colorStroke>
	//   21   45:invokestatic    #196 <Method void PdfWriter.checkPdfIsoConformance(PdfWriter, int, Object)>
			PdfWriter.checkPdfIsoConformance(writer, 6, ((Object) (state.extGState)));
	//   22   48:aload_0         
	//   23   49:getfield        #164 <Field PdfWriter writer>
	//   24   52:bipush          6
	//   25   54:aload_0         
	//   26   55:getfield        #145 <Field PdfContentByte$GraphicState state>
	//   27   58:getfield        #1159 <Field PdfObject PdfContentByte$GraphicState.extGState>
	//   28   61:invokestatic    #196 <Method void PdfWriter.checkPdfIsoConformance(PdfWriter, int, Object)>
			content.append("b").append_i(separator);
	//   29   64:aload_0         
	//   30   65:getfield        #140 <Field ByteBuffer content>
	//   31   68:ldc2            #1188 <String "b">
	//   32   71:invokevirtual   #278 <Method ByteBuffer ByteBuffer.append(String)>
	//   33   74:aload_0         
	//   34   75:getfield        #152 <Field int separator>
	//   35   78:invokevirtual   #296 <Method ByteBuffer ByteBuffer.append_i(int)>
	//   36   81:pop             
			return;
	//   37   82:return          
		}
		throw new IllegalPdfSyntaxException(MessageLocalization.getComposedMessage("path.construction.operator.inside.text.object", new Object[0]));
	//   38   83:new             #1122 <Class IllegalPdfSyntaxException>
	//   39   86:dup             
	//   40   87:ldc2            #1182 <String "path.construction.operator.inside.text.object">
	//   41   90:iconst_0        
	//   42   91:anewarray       Object[]
	//   43   94:invokestatic    #239 <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//   44   97:invokespecial   #1125 <Method void IllegalPdfSyntaxException(String)>
	//   45  100:athrow          
	}

	public void closePathStroke()
	{
label0:
		{
			if(inText)
	//*   0    0:aload_0         
	//*   1    1:getfield        #156 <Field boolean inText>
	//*   2    4:ifeq            18
			{
				if(!isTagged())
					break label0;
	//    3    7:aload_0         
	//    4    8:invokevirtual   #220 <Method boolean isTagged()>
	//    5   11:ifeq            68
				endText();
	//    6   14:aload_0         
	//    7   15:invokevirtual   #223 <Method void endText()>
			}
			PdfWriter.checkPdfIsoConformance(writer, 1, ((Object) (state.colorStroke)));
	//    8   18:aload_0         
	//    9   19:getfield        #164 <Field PdfWriter writer>
	//   10   22:iconst_1        
	//   11   23:aload_0         
	//   12   24:getfield        #145 <Field PdfContentByte$GraphicState state>
	//   13   27:getfield        #669 <Field BaseColor PdfContentByte$GraphicState.colorStroke>
	//   14   30:invokestatic    #196 <Method void PdfWriter.checkPdfIsoConformance(PdfWriter, int, Object)>
			PdfWriter.checkPdfIsoConformance(writer, 6, ((Object) (state.extGState)));
	//   15   33:aload_0         
	//   16   34:getfield        #164 <Field PdfWriter writer>
	//   17   37:bipush          6
	//   18   39:aload_0         
	//   19   40:getfield        #145 <Field PdfContentByte$GraphicState state>
	//   20   43:getfield        #1159 <Field PdfObject PdfContentByte$GraphicState.extGState>
	//   21   46:invokestatic    #196 <Method void PdfWriter.checkPdfIsoConformance(PdfWriter, int, Object)>
			content.append("s").append_i(separator);
	//   22   49:aload_0         
	//   23   50:getfield        #140 <Field ByteBuffer content>
	//   24   53:ldc2            #1191 <String "s">
	//   25   56:invokevirtual   #278 <Method ByteBuffer ByteBuffer.append(String)>
	//   26   59:aload_0         
	//   27   60:getfield        #152 <Field int separator>
	//   28   63:invokevirtual   #296 <Method ByteBuffer ByteBuffer.append_i(int)>
	//   29   66:pop             
			return;
	//   30   67:return          
		}
		throw new IllegalPdfSyntaxException(MessageLocalization.getComposedMessage("path.construction.operator.inside.text.object", new Object[0]));
	//   31   68:new             #1122 <Class IllegalPdfSyntaxException>
	//   32   71:dup             
	//   33   72:ldc2            #1182 <String "path.construction.operator.inside.text.object">
	//   34   75:iconst_0        
	//   35   76:anewarray       Object[]
	//   36   79:invokestatic    #239 <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//   37   82:invokespecial   #1125 <Method void IllegalPdfSyntaxException(String)>
	//   38   85:athrow          
	}

	public void concatCTM(double d, double d1, double d2, double d3, double d4, double d5)
	{
		if(inText && isTagged())
	//*   0    0:aload_0         
	//*   1    1:getfield        #156 <Field boolean inText>
	//*   2    4:ifeq            18
	//*   3    7:aload_0         
	//*   4    8:invokevirtual   #220 <Method boolean isTagged()>
	//*   5   11:ifeq            18
			endText();
	//    6   14:aload_0         
	//    7   15:invokevirtual   #223 <Method void endText()>
		state.CTM.concatenate(new AffineTransform(d, d1, d2, d3, d4, d5));
	//    8   18:aload_0         
	//    9   19:getfield        #145 <Field PdfContentByte$GraphicState state>
	//   10   22:getfield        #744 <Field AffineTransform PdfContentByte$GraphicState.CTM>
	//   11   25:new             #746 <Class AffineTransform>
	//   12   28:dup             
	//   13   29:dload_1         
	//   14   30:dload_3         
	//   15   31:dload           5
	//   16   33:dload           7
	//   17   35:dload           9
	//   18   37:dload           11
	//   19   39:invokespecial   #789 <Method void AffineTransform(double, double, double, double, double, double)>
	//   20   42:invokevirtual   #1194 <Method void AffineTransform.concatenate(AffineTransform)>
		content.append(d).append(' ').append(d1).append(' ').append(d2).append(' ');
	//   21   45:aload_0         
	//   22   46:getfield        #140 <Field ByteBuffer content>
	//   23   49:dload_1         
	//   24   50:invokevirtual   #281 <Method ByteBuffer ByteBuffer.append(double)>
	//   25   53:bipush          32
	//   26   55:invokevirtual   #181 <Method ByteBuffer ByteBuffer.append(char)>
	//   27   58:dload_3         
	//   28   59:invokevirtual   #281 <Method ByteBuffer ByteBuffer.append(double)>
	//   29   62:bipush          32
	//   30   64:invokevirtual   #181 <Method ByteBuffer ByteBuffer.append(char)>
	//   31   67:dload           5
	//   32   69:invokevirtual   #281 <Method ByteBuffer ByteBuffer.append(double)>
	//   33   72:bipush          32
	//   34   74:invokevirtual   #181 <Method ByteBuffer ByteBuffer.append(char)>
	//   35   77:pop             
		content.append(d3).append(' ').append(d4).append(' ').append(d5).append(" cm").append_i(separator);
	//   36   78:aload_0         
	//   37   79:getfield        #140 <Field ByteBuffer content>
	//   38   82:dload           7
	//   39   84:invokevirtual   #281 <Method ByteBuffer ByteBuffer.append(double)>
	//   40   87:bipush          32
	//   41   89:invokevirtual   #181 <Method ByteBuffer ByteBuffer.append(char)>
	//   42   92:dload           9
	//   43   94:invokevirtual   #281 <Method ByteBuffer ByteBuffer.append(double)>
	//   44   97:bipush          32
	//   45   99:invokevirtual   #181 <Method ByteBuffer ByteBuffer.append(char)>
	//   46  102:dload           11
	//   47  104:invokevirtual   #281 <Method ByteBuffer ByteBuffer.append(double)>
	//   48  107:ldc2            #894 <String " cm">
	//   49  110:invokevirtual   #278 <Method ByteBuffer ByteBuffer.append(String)>
	//   50  113:aload_0         
	//   51  114:getfield        #152 <Field int separator>
	//   52  117:invokevirtual   #296 <Method ByteBuffer ByteBuffer.append_i(int)>
	//   53  120:pop             
	//   54  121:return          
	}

	public void concatCTM(float f, float f1, float f2, float f3, float f4, float f5)
	{
		concatCTM(f, f1, f2, f3, f4, f5);
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:f2d             
	//    3    3:fload_2         
	//    4    4:f2d             
	//    5    5:fload_3         
	//    6    6:f2d             
	//    7    7:fload           4
	//    8    9:f2d             
	//    9   10:fload           5
	//   10   12:f2d             
	//   11   13:fload           6
	//   12   15:f2d             
	//   13   16:invokevirtual   #875 <Method void concatCTM(double, double, double, double, double, double)>
	//   14   19:return          
	}

	public void concatCTM(AffineTransform affinetransform)
	{
		double ad[] = new double[6];
	//    0    0:bipush          6
	//    1    2:newarray        double[]
	//    2    4:astore_2        
		affinetransform.getMatrix(ad);
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:invokevirtual   #1020 <Method void AffineTransform.getMatrix(double[])>
		concatCTM(ad[0], ad[1], ad[2], ad[3], ad[4], ad[5]);
	//    6   10:aload_0         
	//    7   11:aload_2         
	//    8   12:iconst_0        
	//    9   13:daload          
	//   10   14:aload_2         
	//   11   15:iconst_1        
	//   12   16:daload          
	//   13   17:aload_2         
	//   14   18:iconst_2        
	//   15   19:daload          
	//   16   20:aload_2         
	//   17   21:iconst_3        
	//   18   22:daload          
	//   19   23:aload_2         
	//   20   24:iconst_4        
	//   21   25:daload          
	//   22   26:aload_2         
	//   23   27:iconst_5        
	//   24   28:daload          
	//   25   29:invokevirtual   #875 <Method void concatCTM(double, double, double, double, double, double)>
	//   26   32:return          
	}

	public PdfAppearance createAppearance(float f, float f1)
	{
		return createAppearance(f, f1, ((PdfName) (null)));
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:fload_2         
	//    3    3:aconst_null     
	//    4    4:invokevirtual   #1199 <Method PdfAppearance createAppearance(float, float, PdfName)>
	//    5    7:areturn         
	}

	PdfAppearance createAppearance(float f, float f1, PdfName pdfname)
	{
		checkWriter();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #188 <Method void checkWriter()>
		PdfAppearance pdfappearance = new PdfAppearance(writer);
	//    2    4:new             #1201 <Class PdfAppearance>
	//    3    7:dup             
	//    4    8:aload_0         
	//    5    9:getfield        #164 <Field PdfWriter writer>
	//    6   12:invokespecial   #1203 <Method void PdfAppearance(PdfWriter)>
	//    7   15:astore          4
		pdfappearance.setWidth(f);
	//    8   17:aload           4
	//    9   19:fload_1         
	//   10   20:invokevirtual   #1206 <Method void PdfAppearance.setWidth(float)>
		pdfappearance.setHeight(f1);
	//   11   23:aload           4
	//   12   25:fload_2         
	//   13   26:invokevirtual   #1209 <Method void PdfAppearance.setHeight(float)>
		writer.addDirectTemplateSimple(((PdfTemplate) (pdfappearance)), pdfname);
	//   14   29:aload_0         
	//   15   30:getfield        #164 <Field PdfWriter writer>
	//   16   33:aload           4
	//   17   35:aload_3         
	//   18   36:invokevirtual   #200 <Method PdfName PdfWriter.addDirectTemplateSimple(PdfTemplate, PdfName)>
	//   19   39:pop             
		return pdfappearance;
	//   20   40:aload           4
	//   21   42:areturn         
	}

	public PdfPatternPainter createPattern(float f, float f1)
	{
		return createPattern(f, f1, f, f1);
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:fload_2         
	//    3    3:fload_1         
	//    4    4:fload_2         
	//    5    5:invokevirtual   #1214 <Method PdfPatternPainter createPattern(float, float, float, float)>
	//    6    8:areturn         
	}

	public PdfPatternPainter createPattern(float f, float f1, float f2, float f3)
	{
		checkWriter();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #188 <Method void checkWriter()>
		if(f2 == 0.0F || f3 == 0.0F)
	//*   2    4:fload_3         
	//*   3    5:fconst_0        
	//*   4    6:fcmpl           
	//*   5    7:ifeq            17
	//*   6   10:fload           4
	//*   7   12:fconst_0        
	//*   8   13:fcmpl           
	//*   9   14:ifne            35
		{
			throw new RuntimeException(MessageLocalization.getComposedMessage("xstep.or.ystep.can.not.be.zero", new Object[0]));
	//   10   17:new             #231 <Class RuntimeException>
	//   11   20:dup             
	//   12   21:ldc2            #1216 <String "xstep.or.ystep.can.not.be.zero">
	//   13   24:iconst_0        
	//   14   25:anewarray       Object[]
	//   15   28:invokestatic    #239 <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//   16   31:invokespecial   #242 <Method void RuntimeException(String)>
	//   17   34:athrow          
		} else
		{
			PdfPatternPainter pdfpatternpainter = new PdfPatternPainter(writer);
	//   18   35:new             #1218 <Class PdfPatternPainter>
	//   19   38:dup             
	//   20   39:aload_0         
	//   21   40:getfield        #164 <Field PdfWriter writer>
	//   22   43:invokespecial   #1219 <Method void PdfPatternPainter(PdfWriter)>
	//   23   46:astore          5
			pdfpatternpainter.setWidth(f);
	//   24   48:aload           5
	//   25   50:fload_1         
	//   26   51:invokevirtual   #1220 <Method void PdfPatternPainter.setWidth(float)>
			pdfpatternpainter.setHeight(f1);
	//   27   54:aload           5
	//   28   56:fload_2         
	//   29   57:invokevirtual   #1221 <Method void PdfPatternPainter.setHeight(float)>
			pdfpatternpainter.setXStep(f2);
	//   30   60:aload           5
	//   31   62:fload_3         
	//   32   63:invokevirtual   #1224 <Method void PdfPatternPainter.setXStep(float)>
			pdfpatternpainter.setYStep(f3);
	//   33   66:aload           5
	//   34   68:fload           4
	//   35   70:invokevirtual   #1227 <Method void PdfPatternPainter.setYStep(float)>
			writer.addSimplePattern(pdfpatternpainter);
	//   36   73:aload_0         
	//   37   74:getfield        #164 <Field PdfWriter writer>
	//   38   77:aload           5
	//   39   79:invokevirtual   #1231 <Method PdfName PdfWriter.addSimplePattern(PdfPatternPainter)>
	//   40   82:pop             
			return pdfpatternpainter;
	//   41   83:aload           5
	//   42   85:areturn         
		}
	}

	public PdfPatternPainter createPattern(float f, float f1, float f2, float f3, BaseColor basecolor)
	{
		checkWriter();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #188 <Method void checkWriter()>
		if(f2 == 0.0F || f3 == 0.0F)
	//*   2    4:fload_3         
	//*   3    5:fconst_0        
	//*   4    6:fcmpl           
	//*   5    7:ifeq            17
	//*   6   10:fload           4
	//*   7   12:fconst_0        
	//*   8   13:fcmpl           
	//*   9   14:ifne            35
		{
			throw new RuntimeException(MessageLocalization.getComposedMessage("xstep.or.ystep.can.not.be.zero", new Object[0]));
	//   10   17:new             #231 <Class RuntimeException>
	//   11   20:dup             
	//   12   21:ldc2            #1216 <String "xstep.or.ystep.can.not.be.zero">
	//   13   24:iconst_0        
	//   14   25:anewarray       Object[]
	//   15   28:invokestatic    #239 <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//   16   31:invokespecial   #242 <Method void RuntimeException(String)>
	//   17   34:athrow          
		} else
		{
			basecolor = ((BaseColor) (new PdfPatternPainter(writer, basecolor)));
	//   18   35:new             #1218 <Class PdfPatternPainter>
	//   19   38:dup             
	//   20   39:aload_0         
	//   21   40:getfield        #164 <Field PdfWriter writer>
	//   22   43:aload           5
	//   23   45:invokespecial   #1235 <Method void PdfPatternPainter(PdfWriter, BaseColor)>
	//   24   48:astore          5
			((PdfPatternPainter) (basecolor)).setWidth(f);
	//   25   50:aload           5
	//   26   52:fload_1         
	//   27   53:invokevirtual   #1220 <Method void PdfPatternPainter.setWidth(float)>
			((PdfPatternPainter) (basecolor)).setHeight(f1);
	//   28   56:aload           5
	//   29   58:fload_2         
	//   30   59:invokevirtual   #1221 <Method void PdfPatternPainter.setHeight(float)>
			((PdfPatternPainter) (basecolor)).setXStep(f2);
	//   31   62:aload           5
	//   32   64:fload_3         
	//   33   65:invokevirtual   #1224 <Method void PdfPatternPainter.setXStep(float)>
			((PdfPatternPainter) (basecolor)).setYStep(f3);
	//   34   68:aload           5
	//   35   70:fload           4
	//   36   72:invokevirtual   #1227 <Method void PdfPatternPainter.setYStep(float)>
			writer.addSimplePattern(((PdfPatternPainter) (basecolor)));
	//   37   75:aload_0         
	//   38   76:getfield        #164 <Field PdfWriter writer>
	//   39   79:aload           5
	//   40   81:invokevirtual   #1231 <Method PdfName PdfWriter.addSimplePattern(PdfPatternPainter)>
	//   41   84:pop             
			return ((PdfPatternPainter) (basecolor));
	//   42   85:aload           5
	//   43   87:areturn         
		}
	}

	public PdfPatternPainter createPattern(float f, float f1, BaseColor basecolor)
	{
		return createPattern(f, f1, f, f1, basecolor);
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:fload_2         
	//    3    3:fload_1         
	//    4    4:fload_2         
	//    5    5:aload_3         
	//    6    6:invokevirtual   #1238 <Method PdfPatternPainter createPattern(float, float, float, float, BaseColor)>
	//    7    9:areturn         
	}

	public PdfTemplate createTemplate(float f, float f1)
	{
		return createTemplate(f, f1, ((PdfName) (null)));
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:fload_2         
	//    3    3:aconst_null     
	//    4    4:invokevirtual   #1243 <Method PdfTemplate createTemplate(float, float, PdfName)>
	//    5    7:areturn         
	}

	PdfTemplate createTemplate(float f, float f1, PdfName pdfname)
	{
		checkWriter();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #188 <Method void checkWriter()>
		PdfTemplate pdftemplate = new PdfTemplate(writer);
	//    2    4:new             #206 <Class PdfTemplate>
	//    3    7:dup             
	//    4    8:aload_0         
	//    5    9:getfield        #164 <Field PdfWriter writer>
	//    6   12:invokespecial   #1244 <Method void PdfTemplate(PdfWriter)>
	//    7   15:astore          4
		pdftemplate.setWidth(f);
	//    8   17:aload           4
	//    9   19:fload_1         
	//   10   20:invokevirtual   #1245 <Method void PdfTemplate.setWidth(float)>
		pdftemplate.setHeight(f1);
	//   11   23:aload           4
	//   12   25:fload_2         
	//   13   26:invokevirtual   #1246 <Method void PdfTemplate.setHeight(float)>
		writer.addDirectTemplateSimple(pdftemplate, pdfname);
	//   14   29:aload_0         
	//   15   30:getfield        #164 <Field PdfWriter writer>
	//   16   33:aload           4
	//   17   35:aload_3         
	//   18   36:invokevirtual   #200 <Method PdfName PdfWriter.addDirectTemplateSimple(PdfTemplate, PdfName)>
	//   19   39:pop             
		return pdftemplate;
	//   20   40:aload           4
	//   21   42:areturn         
	}

	public void curveFromTo(double d, double d1, double d2, double d3)
	{
label0:
		{
			if(inText)
	//*   0    0:aload_0         
	//*   1    1:getfield        #156 <Field boolean inText>
	//*   2    4:ifeq            18
			{
				if(!isTagged())
					break label0;
	//    3    7:aload_0         
	//    4    8:invokevirtual   #220 <Method boolean isTagged()>
	//    5   11:ifeq            70
				endText();
	//    6   14:aload_0         
	//    7   15:invokevirtual   #223 <Method void endText()>
			}
			content.append(d).append(' ').append(d1).append(' ').append(d2).append(' ').append(d3).append(" y").append_i(separator);
	//    8   18:aload_0         
	//    9   19:getfield        #140 <Field ByteBuffer content>
	//   10   22:dload_1         
	//   11   23:invokevirtual   #281 <Method ByteBuffer ByteBuffer.append(double)>
	//   12   26:bipush          32
	//   13   28:invokevirtual   #181 <Method ByteBuffer ByteBuffer.append(char)>
	//   14   31:dload_3         
	//   15   32:invokevirtual   #281 <Method ByteBuffer ByteBuffer.append(double)>
	//   16   35:bipush          32
	//   17   37:invokevirtual   #181 <Method ByteBuffer ByteBuffer.append(char)>
	//   18   40:dload           5
	//   19   42:invokevirtual   #281 <Method ByteBuffer ByteBuffer.append(double)>
	//   20   45:bipush          32
	//   21   47:invokevirtual   #181 <Method ByteBuffer ByteBuffer.append(char)>
	//   22   50:dload           7
	//   23   52:invokevirtual   #281 <Method ByteBuffer ByteBuffer.append(double)>
	//   24   55:ldc2            #1250 <String " y">
	//   25   58:invokevirtual   #278 <Method ByteBuffer ByteBuffer.append(String)>
	//   26   61:aload_0         
	//   27   62:getfield        #152 <Field int separator>
	//   28   65:invokevirtual   #296 <Method ByteBuffer ByteBuffer.append_i(int)>
	//   29   68:pop             
			return;
	//   30   69:return          
		}
		throw new IllegalPdfSyntaxException(MessageLocalization.getComposedMessage("path.construction.operator.inside.text.object", new Object[0]));
	//   31   70:new             #1122 <Class IllegalPdfSyntaxException>
	//   32   73:dup             
	//   33   74:ldc2            #1182 <String "path.construction.operator.inside.text.object">
	//   34   77:iconst_0        
	//   35   78:anewarray       Object[]
	//   36   81:invokestatic    #239 <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//   37   84:invokespecial   #1125 <Method void IllegalPdfSyntaxException(String)>
	//   38   87:athrow          
	}

	public void curveFromTo(float f, float f1, float f2, float f3)
	{
		curveFromTo(f, f1, f2, f3);
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:f2d             
	//    3    3:fload_2         
	//    4    4:f2d             
	//    5    5:fload_3         
	//    6    6:f2d             
	//    7    7:fload           4
	//    8    9:f2d             
	//    9   10:invokevirtual   #1252 <Method void curveFromTo(double, double, double, double)>
	//   10   13:return          
	}

	public void curveTo(double d, double d1, double d2, double d3)
	{
label0:
		{
			if(inText)
	//*   0    0:aload_0         
	//*   1    1:getfield        #156 <Field boolean inText>
	//*   2    4:ifeq            18
			{
				if(!isTagged())
					break label0;
	//    3    7:aload_0         
	//    4    8:invokevirtual   #220 <Method boolean isTagged()>
	//    5   11:ifeq            70
				endText();
	//    6   14:aload_0         
	//    7   15:invokevirtual   #223 <Method void endText()>
			}
			content.append(d).append(' ').append(d1).append(' ').append(d2).append(' ').append(d3).append(" v").append_i(separator);
	//    8   18:aload_0         
	//    9   19:getfield        #140 <Field ByteBuffer content>
	//   10   22:dload_1         
	//   11   23:invokevirtual   #281 <Method ByteBuffer ByteBuffer.append(double)>
	//   12   26:bipush          32
	//   13   28:invokevirtual   #181 <Method ByteBuffer ByteBuffer.append(char)>
	//   14   31:dload_3         
	//   15   32:invokevirtual   #281 <Method ByteBuffer ByteBuffer.append(double)>
	//   16   35:bipush          32
	//   17   37:invokevirtual   #181 <Method ByteBuffer ByteBuffer.append(char)>
	//   18   40:dload           5
	//   19   42:invokevirtual   #281 <Method ByteBuffer ByteBuffer.append(double)>
	//   20   45:bipush          32
	//   21   47:invokevirtual   #181 <Method ByteBuffer ByteBuffer.append(char)>
	//   22   50:dload           7
	//   23   52:invokevirtual   #281 <Method ByteBuffer ByteBuffer.append(double)>
	//   24   55:ldc2            #1254 <String " v">
	//   25   58:invokevirtual   #278 <Method ByteBuffer ByteBuffer.append(String)>
	//   26   61:aload_0         
	//   27   62:getfield        #152 <Field int separator>
	//   28   65:invokevirtual   #296 <Method ByteBuffer ByteBuffer.append_i(int)>
	//   29   68:pop             
			return;
	//   30   69:return          
		}
		throw new IllegalPdfSyntaxException(MessageLocalization.getComposedMessage("path.construction.operator.inside.text.object", new Object[0]));
	//   31   70:new             #1122 <Class IllegalPdfSyntaxException>
	//   32   73:dup             
	//   33   74:ldc2            #1182 <String "path.construction.operator.inside.text.object">
	//   34   77:iconst_0        
	//   35   78:anewarray       Object[]
	//   36   81:invokestatic    #239 <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//   37   84:invokespecial   #1125 <Method void IllegalPdfSyntaxException(String)>
	//   38   87:athrow          
	}

	public void curveTo(double d, double d1, double d2, double d3, double d4, double d5)
	{
label0:
		{
			if(inText)
	//*   0    0:aload_0         
	//*   1    1:getfield        #156 <Field boolean inText>
	//*   2    4:ifeq            18
			{
				if(!isTagged())
					break label0;
	//    3    7:aload_0         
	//    4    8:invokevirtual   #220 <Method boolean isTagged()>
	//    5   11:ifeq            90
				endText();
	//    6   14:aload_0         
	//    7   15:invokevirtual   #223 <Method void endText()>
			}
			content.append(d).append(' ').append(d1).append(' ').append(d2).append(' ').append(d3).append(' ').append(d4).append(' ').append(d5).append(" c").append_i(separator);
	//    8   18:aload_0         
	//    9   19:getfield        #140 <Field ByteBuffer content>
	//   10   22:dload_1         
	//   11   23:invokevirtual   #281 <Method ByteBuffer ByteBuffer.append(double)>
	//   12   26:bipush          32
	//   13   28:invokevirtual   #181 <Method ByteBuffer ByteBuffer.append(char)>
	//   14   31:dload_3         
	//   15   32:invokevirtual   #281 <Method ByteBuffer ByteBuffer.append(double)>
	//   16   35:bipush          32
	//   17   37:invokevirtual   #181 <Method ByteBuffer ByteBuffer.append(char)>
	//   18   40:dload           5
	//   19   42:invokevirtual   #281 <Method ByteBuffer ByteBuffer.append(double)>
	//   20   45:bipush          32
	//   21   47:invokevirtual   #181 <Method ByteBuffer ByteBuffer.append(char)>
	//   22   50:dload           7
	//   23   52:invokevirtual   #281 <Method ByteBuffer ByteBuffer.append(double)>
	//   24   55:bipush          32
	//   25   57:invokevirtual   #181 <Method ByteBuffer ByteBuffer.append(char)>
	//   26   60:dload           9
	//   27   62:invokevirtual   #281 <Method ByteBuffer ByteBuffer.append(double)>
	//   28   65:bipush          32
	//   29   67:invokevirtual   #181 <Method ByteBuffer ByteBuffer.append(char)>
	//   30   70:dload           11
	//   31   72:invokevirtual   #281 <Method ByteBuffer ByteBuffer.append(double)>
	//   32   75:ldc2            #1256 <String " c">
	//   33   78:invokevirtual   #278 <Method ByteBuffer ByteBuffer.append(String)>
	//   34   81:aload_0         
	//   35   82:getfield        #152 <Field int separator>
	//   36   85:invokevirtual   #296 <Method ByteBuffer ByteBuffer.append_i(int)>
	//   37   88:pop             
			return;
	//   38   89:return          
		}
		throw new IllegalPdfSyntaxException(MessageLocalization.getComposedMessage("path.construction.operator.inside.text.object", new Object[0]));
	//   39   90:new             #1122 <Class IllegalPdfSyntaxException>
	//   40   93:dup             
	//   41   94:ldc2            #1182 <String "path.construction.operator.inside.text.object">
	//   42   97:iconst_0        
	//   43   98:anewarray       Object[]
	//   44  101:invokestatic    #239 <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//   45  104:invokespecial   #1125 <Method void IllegalPdfSyntaxException(String)>
	//   46  107:athrow          
	}

	public void curveTo(float f, float f1, float f2, float f3)
	{
		curveTo(f, f1, f2, f3);
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:f2d             
	//    3    3:fload_2         
	//    4    4:f2d             
	//    5    5:fload_3         
	//    6    6:f2d             
	//    7    7:fload           4
	//    8    9:f2d             
	//    9   10:invokevirtual   #1258 <Method void curveTo(double, double, double, double)>
	//   10   13:return          
	}

	public void curveTo(float f, float f1, float f2, float f3, float f4, float f5)
	{
		curveTo(f, f1, f2, f3, f4, f5);
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:f2d             
	//    3    3:fload_2         
	//    4    4:f2d             
	//    5    5:fload_3         
	//    6    6:f2d             
	//    7    7:fload           4
	//    8    9:f2d             
	//    9   10:fload           5
	//   10   12:f2d             
	//   11   13:fload           6
	//   12   15:f2d             
	//   13   16:invokevirtual   #1083 <Method void curveTo(double, double, double, double, double, double)>
	//   14   19:return          
	}

	public void drawButton(double d, double d1, double d2, double d3, String s, BaseFont basefont, float f)
	{
		double d5 = d;
	//    0    0:dload_1         
	//    1    1:dstore          14
		double d4 = d2;
	//    2    3:dload           5
	//    3    5:dstore          12
		if(d > d2)
	//*   4    7:dload_1         
	//*   5    8:dload           5
	//*   6   10:dcmpl           
	//*   7   11:ifle            21
		{
			d4 = d;
	//    8   14:dload_1         
	//    9   15:dstore          12
			d5 = d2;
	//   10   17:dload           5
	//   11   19:dstore          14
		}
		d2 = d1;
	//   12   21:dload_3         
	//   13   22:dstore          5
		d = d3;
	//   14   24:dload           7
	//   15   26:dstore_1        
		if(d1 > d3)
	//*  16   27:dload_3         
	//*  17   28:dload           7
	//*  18   30:dcmpl           
	//*  19   31:ifle            40
		{
			d = d1;
	//   20   34:dload_3         
	//   21   35:dstore_1        
			d2 = d3;
	//   22   36:dload           7
	//   23   38:dstore          5
		}
		saveState();
	//   24   40:aload_0         
	//   25   41:invokevirtual   #870 <Method void saveState()>
		setColorStroke(new BaseColor(0, 0, 0));
	//   26   44:aload_0         
	//   27   45:new             #496 <Class BaseColor>
	//   28   48:dup             
	//   29   49:iconst_0        
	//   30   50:iconst_0        
	//   31   51:iconst_0        
	//   32   52:invokespecial   #1263 <Method void BaseColor(int, int, int)>
	//   33   55:invokevirtual   #1267 <Method void setColorStroke(BaseColor)>
		setLineWidth(1.0F);
	//   34   58:aload_0         
	//   35   59:fconst_1        
	//   36   60:invokevirtual   #1270 <Method void setLineWidth(float)>
		setLineCap(0);
	//   37   63:aload_0         
	//   38   64:iconst_0        
	//   39   65:invokevirtual   #1273 <Method void setLineCap(int)>
		rectangle(d5, d2, d4 - d5, d - d2);
	//   40   68:aload_0         
	//   41   69:dload           14
	//   42   71:dload           5
	//   43   73:dload           12
	//   44   75:dload           14
	//   45   77:dsub            
	//   46   78:dload_1         
	//   47   79:dload           5
	//   48   81:dsub            
	//   49   82:invokevirtual   #1275 <Method void rectangle(double, double, double, double)>
		stroke();
	//   50   85:aload_0         
	//   51   86:invokevirtual   #1278 <Method void stroke()>
		setLineWidth(1.0F);
	//   52   89:aload_0         
	//   53   90:fconst_1        
	//   54   91:invokevirtual   #1270 <Method void setLineWidth(float)>
		setLineCap(0);
	//   55   94:aload_0         
	//   56   95:iconst_0        
	//   57   96:invokevirtual   #1273 <Method void setLineCap(int)>
		setColorFill(new BaseColor(192, 192, 192));
	//   58   99:aload_0         
	//   59  100:new             #496 <Class BaseColor>
	//   60  103:dup             
	//   61  104:sipush          192
	//   62  107:sipush          192
	//   63  110:sipush          192
	//   64  113:invokespecial   #1263 <Method void BaseColor(int, int, int)>
	//   65  116:invokevirtual   #1281 <Method void setColorFill(BaseColor)>
		rectangle(d5 + 0.5D, d2 + 0.5D, d4 - d5 - 1.0D, d - d2 - 1.0D);
	//   66  119:aload_0         
	//   67  120:dload           14
	//   68  122:ldc2w           #1282 <Double 0.5D>
	//   69  125:dadd            
	//   70  126:dload           5
	//   71  128:ldc2w           #1282 <Double 0.5D>
	//   72  131:dadd            
	//   73  132:dload           12
	//   74  134:dload           14
	//   75  136:dsub            
	//   76  137:dconst_1        
	//   77  138:dsub            
	//   78  139:dload_1         
	//   79  140:dload           5
	//   80  142:dsub            
	//   81  143:dconst_1        
	//   82  144:dsub            
	//   83  145:invokevirtual   #1275 <Method void rectangle(double, double, double, double)>
		fill();
	//   84  148:aload_0         
	//   85  149:invokevirtual   #1286 <Method void fill()>
		setColorStroke(new BaseColor(255, 255, 255));
	//   86  152:aload_0         
	//   87  153:new             #496 <Class BaseColor>
	//   88  156:dup             
	//   89  157:sipush          255
	//   90  160:sipush          255
	//   91  163:sipush          255
	//   92  166:invokespecial   #1263 <Method void BaseColor(int, int, int)>
	//   93  169:invokevirtual   #1267 <Method void setColorStroke(BaseColor)>
		setLineWidth(1.0F);
	//   94  172:aload_0         
	//   95  173:fconst_1        
	//   96  174:invokevirtual   #1270 <Method void setLineWidth(float)>
		setLineCap(0);
	//   97  177:aload_0         
	//   98  178:iconst_0        
	//   99  179:invokevirtual   #1273 <Method void setLineCap(int)>
		moveTo(1.0D + d5, 1.0D + d2);
	//  100  182:aload_0         
	//  101  183:dconst_1        
	//  102  184:dload           14
	//  103  186:dadd            
	//  104  187:dconst_1        
	//  105  188:dload           5
	//  106  190:dadd            
	//  107  191:invokevirtual   #1080 <Method void moveTo(double, double)>
		lineTo(1.0D + d5, d - 1.0D);
	//  108  194:aload_0         
	//  109  195:dconst_1        
	//  110  196:dload           14
	//  111  198:dadd            
	//  112  199:dload_1         
	//  113  200:dconst_1        
	//  114  201:dsub            
	//  115  202:invokevirtual   #1289 <Method void lineTo(double, double)>
		lineTo(d4 - 1.0D, d - 1.0D);
	//  116  205:aload_0         
	//  117  206:dload           12
	//  118  208:dconst_1        
	//  119  209:dsub            
	//  120  210:dload_1         
	//  121  211:dconst_1        
	//  122  212:dsub            
	//  123  213:invokevirtual   #1289 <Method void lineTo(double, double)>
		stroke();
	//  124  216:aload_0         
	//  125  217:invokevirtual   #1278 <Method void stroke()>
		setColorStroke(new BaseColor(160, 160, 160));
	//  126  220:aload_0         
	//  127  221:new             #496 <Class BaseColor>
	//  128  224:dup             
	//  129  225:sipush          160
	//  130  228:sipush          160
	//  131  231:sipush          160
	//  132  234:invokespecial   #1263 <Method void BaseColor(int, int, int)>
	//  133  237:invokevirtual   #1267 <Method void setColorStroke(BaseColor)>
		setLineWidth(1.0F);
	//  134  240:aload_0         
	//  135  241:fconst_1        
	//  136  242:invokevirtual   #1270 <Method void setLineWidth(float)>
		setLineCap(0);
	//  137  245:aload_0         
	//  138  246:iconst_0        
	//  139  247:invokevirtual   #1273 <Method void setLineCap(int)>
		moveTo(1.0D + d5, 1.0D + d2);
	//  140  250:aload_0         
	//  141  251:dconst_1        
	//  142  252:dload           14
	//  143  254:dadd            
	//  144  255:dconst_1        
	//  145  256:dload           5
	//  146  258:dadd            
	//  147  259:invokevirtual   #1080 <Method void moveTo(double, double)>
		lineTo(d4 - 1.0D, 1.0D + d2);
	//  148  262:aload_0         
	//  149  263:dload           12
	//  150  265:dconst_1        
	//  151  266:dsub            
	//  152  267:dconst_1        
	//  153  268:dload           5
	//  154  270:dadd            
	//  155  271:invokevirtual   #1289 <Method void lineTo(double, double)>
		lineTo(d4 - 1.0D, d - 1.0D);
	//  156  274:aload_0         
	//  157  275:dload           12
	//  158  277:dconst_1        
	//  159  278:dsub            
	//  160  279:dload_1         
	//  161  280:dconst_1        
	//  162  281:dsub            
	//  163  282:invokevirtual   #1289 <Method void lineTo(double, double)>
		stroke();
	//  164  285:aload_0         
	//  165  286:invokevirtual   #1278 <Method void stroke()>
		resetRGBColorFill();
	//  166  289:aload_0         
	//  167  290:invokevirtual   #1292 <Method void resetRGBColorFill()>
		beginText();
	//  168  293:aload_0         
	//  169  294:invokevirtual   #1294 <Method void beginText()>
		setFontAndSize(basefont, f);
	//  170  297:aload_0         
	//  171  298:aload           10
	//  172  300:fload           11
	//  173  302:invokevirtual   #1298 <Method void setFontAndSize(BaseFont, float)>
		showTextAligned(1, s, (float)((d4 - d5) / 2D + d5), (float)((d - d2 - (double)f) / 2D + d2), 0.0F);
	//  174  305:aload_0         
	//  175  306:iconst_1        
	//  176  307:aload           9
	//  177  309:dload           12
	//  178  311:dload           14
	//  179  313:dsub            
	//  180  314:ldc2w           #438 <Double 2D>
	//  181  317:ddiv            
	//  182  318:dload           14
	//  183  320:dadd            
	//  184  321:d2f             
	//  185  322:dload_1         
	//  186  323:dload           5
	//  187  325:dsub            
	//  188  326:fload           11
	//  189  328:f2d             
	//  190  329:dsub            
	//  191  330:ldc2w           #438 <Double 2D>
	//  192  333:ddiv            
	//  193  334:dload           5
	//  194  336:dadd            
	//  195  337:d2f             
	//  196  338:fconst_0        
	//  197  339:invokevirtual   #1301 <Method void showTextAligned(int, String, float, float, float)>
		endText();
	//  198  342:aload_0         
	//  199  343:invokevirtual   #223 <Method void endText()>
		restoreState();
	//  200  346:aload_0         
	//  201  347:invokevirtual   #882 <Method void restoreState()>
	//  202  350:return          
	}

	public void drawButton(float f, float f1, float f2, float f3, String s, BaseFont basefont, float f4)
	{
		drawButton(f, f1, f2, f3, s, basefont, f4);
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:f2d             
	//    3    3:fload_2         
	//    4    4:f2d             
	//    5    5:fload_3         
	//    6    6:f2d             
	//    7    7:fload           4
	//    8    9:f2d             
	//    9   10:aload           5
	//   10   12:aload           6
	//   11   14:fload           7
	//   12   16:invokevirtual   #1304 <Method void drawButton(double, double, double, double, String, BaseFont, float)>
	//   13   19:return          
	}

	public void drawRadioField(double d, double d1, double d2, double d3, boolean flag)
	{
		double d5 = d;
	//    0    0:dload_1         
	//    1    1:dstore          12
		double d4 = d2;
	//    2    3:dload           5
	//    3    5:dstore          10
		if(d > d2)
	//*   4    7:dload_1         
	//*   5    8:dload           5
	//*   6   10:dcmpl           
	//*   7   11:ifle            21
		{
			d4 = d;
	//    8   14:dload_1         
	//    9   15:dstore          10
			d5 = d2;
	//   10   17:dload           5
	//   11   19:dstore          12
		}
		d2 = d1;
	//   12   21:dload_3         
	//   13   22:dstore          5
		d = d3;
	//   14   24:dload           7
	//   15   26:dstore_1        
		if(d1 > d3)
	//*  16   27:dload_3         
	//*  17   28:dload           7
	//*  18   30:dcmpl           
	//*  19   31:ifle            40
		{
			d = d1;
	//   20   34:dload_3         
	//   21   35:dstore_1        
			d2 = d3;
	//   22   36:dload           7
	//   23   38:dstore          5
		}
		saveState();
	//   24   40:aload_0         
	//   25   41:invokevirtual   #870 <Method void saveState()>
		setLineWidth(1.0F);
	//   26   44:aload_0         
	//   27   45:fconst_1        
	//   28   46:invokevirtual   #1270 <Method void setLineWidth(float)>
		setLineCap(1);
	//   29   49:aload_0         
	//   30   50:iconst_1        
	//   31   51:invokevirtual   #1273 <Method void setLineCap(int)>
		setColorStroke(new BaseColor(192, 192, 192));
	//   32   54:aload_0         
	//   33   55:new             #496 <Class BaseColor>
	//   34   58:dup             
	//   35   59:sipush          192
	//   36   62:sipush          192
	//   37   65:sipush          192
	//   38   68:invokespecial   #1263 <Method void BaseColor(int, int, int)>
	//   39   71:invokevirtual   #1267 <Method void setColorStroke(BaseColor)>
		arc(d5 + 1.0D, d2 + 1.0D, d4 - 1.0D, d - 1.0D, 0.0D, 360D);
	//   40   74:aload_0         
	//   41   75:dload           12
	//   42   77:dconst_1        
	//   43   78:dadd            
	//   44   79:dload           5
	//   45   81:dconst_1        
	//   46   82:dadd            
	//   47   83:dload           10
	//   48   85:dconst_1        
	//   49   86:dsub            
	//   50   87:dload_1         
	//   51   88:dconst_1        
	//   52   89:dsub            
	//   53   90:dconst_0        
	//   54   91:ldc2w           #442 <Double 360D>
	//   55   94:invokevirtual   #1085 <Method void arc(double, double, double, double, double, double)>
		stroke();
	//   56   97:aload_0         
	//   57   98:invokevirtual   #1278 <Method void stroke()>
		setLineWidth(1.0F);
	//   58  101:aload_0         
	//   59  102:fconst_1        
	//   60  103:invokevirtual   #1270 <Method void setLineWidth(float)>
		setLineCap(1);
	//   61  106:aload_0         
	//   62  107:iconst_1        
	//   63  108:invokevirtual   #1273 <Method void setLineCap(int)>
		setColorStroke(new BaseColor(160, 160, 160));
	//   64  111:aload_0         
	//   65  112:new             #496 <Class BaseColor>
	//   66  115:dup             
	//   67  116:sipush          160
	//   68  119:sipush          160
	//   69  122:sipush          160
	//   70  125:invokespecial   #1263 <Method void BaseColor(int, int, int)>
	//   71  128:invokevirtual   #1267 <Method void setColorStroke(BaseColor)>
		arc(d5 + 0.5D, d2 + 0.5D, d4 - 0.5D, d - 0.5D, 45D, 180D);
	//   72  131:aload_0         
	//   73  132:dload           12
	//   74  134:ldc2w           #1282 <Double 0.5D>
	//   75  137:dadd            
	//   76  138:dload           5
	//   77  140:ldc2w           #1282 <Double 0.5D>
	//   78  143:dadd            
	//   79  144:dload           10
	//   80  146:ldc2w           #1282 <Double 0.5D>
	//   81  149:dsub            
	//   82  150:dload_1         
	//   83  151:ldc2w           #1282 <Double 0.5D>
	//   84  154:dsub            
	//   85  155:ldc2w           #1307 <Double 45D>
	//   86  158:ldc2w           #452 <Double 180D>
	//   87  161:invokevirtual   #1085 <Method void arc(double, double, double, double, double, double)>
		stroke();
	//   88  164:aload_0         
	//   89  165:invokevirtual   #1278 <Method void stroke()>
		setLineWidth(1.0F);
	//   90  168:aload_0         
	//   91  169:fconst_1        
	//   92  170:invokevirtual   #1270 <Method void setLineWidth(float)>
		setLineCap(1);
	//   93  173:aload_0         
	//   94  174:iconst_1        
	//   95  175:invokevirtual   #1273 <Method void setLineCap(int)>
		setColorStroke(new BaseColor(0, 0, 0));
	//   96  178:aload_0         
	//   97  179:new             #496 <Class BaseColor>
	//   98  182:dup             
	//   99  183:iconst_0        
	//  100  184:iconst_0        
	//  101  185:iconst_0        
	//  102  186:invokespecial   #1263 <Method void BaseColor(int, int, int)>
	//  103  189:invokevirtual   #1267 <Method void setColorStroke(BaseColor)>
		arc(d5 + 1.5D, d2 + 1.5D, d4 - 1.5D, d - 1.5D, 45D, 180D);
	//  104  192:aload_0         
	//  105  193:dload           12
	//  106  195:ldc2w           #1309 <Double 1.5D>
	//  107  198:dadd            
	//  108  199:dload           5
	//  109  201:ldc2w           #1309 <Double 1.5D>
	//  110  204:dadd            
	//  111  205:dload           10
	//  112  207:ldc2w           #1309 <Double 1.5D>
	//  113  210:dsub            
	//  114  211:dload_1         
	//  115  212:ldc2w           #1309 <Double 1.5D>
	//  116  215:dsub            
	//  117  216:ldc2w           #1307 <Double 45D>
	//  118  219:ldc2w           #452 <Double 180D>
	//  119  222:invokevirtual   #1085 <Method void arc(double, double, double, double, double, double)>
		stroke();
	//  120  225:aload_0         
	//  121  226:invokevirtual   #1278 <Method void stroke()>
		if(flag)
	//* 122  229:iload           9
	//* 123  231:ifeq            293
		{
			setLineWidth(1.0F);
	//  124  234:aload_0         
	//  125  235:fconst_1        
	//  126  236:invokevirtual   #1270 <Method void setLineWidth(float)>
			setLineCap(1);
	//  127  239:aload_0         
	//  128  240:iconst_1        
	//  129  241:invokevirtual   #1273 <Method void setLineCap(int)>
			setColorFill(new BaseColor(0, 0, 0));
	//  130  244:aload_0         
	//  131  245:new             #496 <Class BaseColor>
	//  132  248:dup             
	//  133  249:iconst_0        
	//  134  250:iconst_0        
	//  135  251:iconst_0        
	//  136  252:invokespecial   #1263 <Method void BaseColor(int, int, int)>
	//  137  255:invokevirtual   #1281 <Method void setColorFill(BaseColor)>
			arc(d5 + 4D, d2 + 4D, d4 - 4D, d - 4D, 0.0D, 360D);
	//  138  258:aload_0         
	//  139  259:dload           12
	//  140  261:ldc2w           #1311 <Double 4D>
	//  141  264:dadd            
	//  142  265:dload           5
	//  143  267:ldc2w           #1311 <Double 4D>
	//  144  270:dadd            
	//  145  271:dload           10
	//  146  273:ldc2w           #1311 <Double 4D>
	//  147  276:dsub            
	//  148  277:dload_1         
	//  149  278:ldc2w           #1311 <Double 4D>
	//  150  281:dsub            
	//  151  282:dconst_0        
	//  152  283:ldc2w           #442 <Double 360D>
	//  153  286:invokevirtual   #1085 <Method void arc(double, double, double, double, double, double)>
			fill();
	//  154  289:aload_0         
	//  155  290:invokevirtual   #1286 <Method void fill()>
		}
		restoreState();
	//  156  293:aload_0         
	//  157  294:invokevirtual   #882 <Method void restoreState()>
	//  158  297:return          
	}

	public void drawRadioField(float f, float f1, float f2, float f3, boolean flag)
	{
		drawRadioField(f, f1, f2, f3, flag);
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:f2d             
	//    3    3:fload_2         
	//    4    4:f2d             
	//    5    5:fload_3         
	//    6    6:f2d             
	//    7    7:fload           4
	//    8    9:f2d             
	//    9   10:iload           5
	//   10   12:invokevirtual   #1315 <Method void drawRadioField(double, double, double, double, boolean)>
	//   11   15:return          
	}

	public void drawTextField(double d, double d1, double d2, double d3)
	{
		double d5 = d;
	//    0    0:dload_1         
	//    1    1:dstore          11
		double d4 = d2;
	//    2    3:dload           5
	//    3    5:dstore          9
		if(d > d2)
	//*   4    7:dload_1         
	//*   5    8:dload           5
	//*   6   10:dcmpl           
	//*   7   11:ifle            21
		{
			d4 = d;
	//    8   14:dload_1         
	//    9   15:dstore          9
			d5 = d2;
	//   10   17:dload           5
	//   11   19:dstore          11
		}
		d2 = d1;
	//   12   21:dload_3         
	//   13   22:dstore          5
		d = d3;
	//   14   24:dload           7
	//   15   26:dstore_1        
		if(d1 > d3)
	//*  16   27:dload_3         
	//*  17   28:dload           7
	//*  18   30:dcmpl           
	//*  19   31:ifle            40
		{
			d = d1;
	//   20   34:dload_3         
	//   21   35:dstore_1        
			d2 = d3;
	//   22   36:dload           7
	//   23   38:dstore          5
		}
		saveState();
	//   24   40:aload_0         
	//   25   41:invokevirtual   #870 <Method void saveState()>
		setColorStroke(new BaseColor(192, 192, 192));
	//   26   44:aload_0         
	//   27   45:new             #496 <Class BaseColor>
	//   28   48:dup             
	//   29   49:sipush          192
	//   30   52:sipush          192
	//   31   55:sipush          192
	//   32   58:invokespecial   #1263 <Method void BaseColor(int, int, int)>
	//   33   61:invokevirtual   #1267 <Method void setColorStroke(BaseColor)>
		setLineWidth(1.0F);
	//   34   64:aload_0         
	//   35   65:fconst_1        
	//   36   66:invokevirtual   #1270 <Method void setLineWidth(float)>
		setLineCap(0);
	//   37   69:aload_0         
	//   38   70:iconst_0        
	//   39   71:invokevirtual   #1273 <Method void setLineCap(int)>
		rectangle(d5, d2, d4 - d5, d - d2);
	//   40   74:aload_0         
	//   41   75:dload           11
	//   42   77:dload           5
	//   43   79:dload           9
	//   44   81:dload           11
	//   45   83:dsub            
	//   46   84:dload_1         
	//   47   85:dload           5
	//   48   87:dsub            
	//   49   88:invokevirtual   #1275 <Method void rectangle(double, double, double, double)>
		stroke();
	//   50   91:aload_0         
	//   51   92:invokevirtual   #1278 <Method void stroke()>
		setLineWidth(1.0F);
	//   52   95:aload_0         
	//   53   96:fconst_1        
	//   54   97:invokevirtual   #1270 <Method void setLineWidth(float)>
		setLineCap(0);
	//   55  100:aload_0         
	//   56  101:iconst_0        
	//   57  102:invokevirtual   #1273 <Method void setLineCap(int)>
		setColorFill(new BaseColor(255, 255, 255));
	//   58  105:aload_0         
	//   59  106:new             #496 <Class BaseColor>
	//   60  109:dup             
	//   61  110:sipush          255
	//   62  113:sipush          255
	//   63  116:sipush          255
	//   64  119:invokespecial   #1263 <Method void BaseColor(int, int, int)>
	//   65  122:invokevirtual   #1281 <Method void setColorFill(BaseColor)>
		rectangle(d5 + 0.5D, d2 + 0.5D, d4 - d5 - 1.0D, d - d2 - 1.0D);
	//   66  125:aload_0         
	//   67  126:dload           11
	//   68  128:ldc2w           #1282 <Double 0.5D>
	//   69  131:dadd            
	//   70  132:dload           5
	//   71  134:ldc2w           #1282 <Double 0.5D>
	//   72  137:dadd            
	//   73  138:dload           9
	//   74  140:dload           11
	//   75  142:dsub            
	//   76  143:dconst_1        
	//   77  144:dsub            
	//   78  145:dload_1         
	//   79  146:dload           5
	//   80  148:dsub            
	//   81  149:dconst_1        
	//   82  150:dsub            
	//   83  151:invokevirtual   #1275 <Method void rectangle(double, double, double, double)>
		fill();
	//   84  154:aload_0         
	//   85  155:invokevirtual   #1286 <Method void fill()>
		setColorStroke(new BaseColor(192, 192, 192));
	//   86  158:aload_0         
	//   87  159:new             #496 <Class BaseColor>
	//   88  162:dup             
	//   89  163:sipush          192
	//   90  166:sipush          192
	//   91  169:sipush          192
	//   92  172:invokespecial   #1263 <Method void BaseColor(int, int, int)>
	//   93  175:invokevirtual   #1267 <Method void setColorStroke(BaseColor)>
		setLineWidth(1.0F);
	//   94  178:aload_0         
	//   95  179:fconst_1        
	//   96  180:invokevirtual   #1270 <Method void setLineWidth(float)>
		setLineCap(0);
	//   97  183:aload_0         
	//   98  184:iconst_0        
	//   99  185:invokevirtual   #1273 <Method void setLineCap(int)>
		moveTo(1.0D + d5, 1.5D + d2);
	//  100  188:aload_0         
	//  101  189:dconst_1        
	//  102  190:dload           11
	//  103  192:dadd            
	//  104  193:ldc2w           #1309 <Double 1.5D>
	//  105  196:dload           5
	//  106  198:dadd            
	//  107  199:invokevirtual   #1080 <Method void moveTo(double, double)>
		lineTo(d4 - 1.5D, 1.5D + d2);
	//  108  202:aload_0         
	//  109  203:dload           9
	//  110  205:ldc2w           #1309 <Double 1.5D>
	//  111  208:dsub            
	//  112  209:ldc2w           #1309 <Double 1.5D>
	//  113  212:dload           5
	//  114  214:dadd            
	//  115  215:invokevirtual   #1289 <Method void lineTo(double, double)>
		lineTo(d4 - 1.5D, d - 1.0D);
	//  116  218:aload_0         
	//  117  219:dload           9
	//  118  221:ldc2w           #1309 <Double 1.5D>
	//  119  224:dsub            
	//  120  225:dload_1         
	//  121  226:dconst_1        
	//  122  227:dsub            
	//  123  228:invokevirtual   #1289 <Method void lineTo(double, double)>
		stroke();
	//  124  231:aload_0         
	//  125  232:invokevirtual   #1278 <Method void stroke()>
		setColorStroke(new BaseColor(160, 160, 160));
	//  126  235:aload_0         
	//  127  236:new             #496 <Class BaseColor>
	//  128  239:dup             
	//  129  240:sipush          160
	//  130  243:sipush          160
	//  131  246:sipush          160
	//  132  249:invokespecial   #1263 <Method void BaseColor(int, int, int)>
	//  133  252:invokevirtual   #1267 <Method void setColorStroke(BaseColor)>
		setLineWidth(1.0F);
	//  134  255:aload_0         
	//  135  256:fconst_1        
	//  136  257:invokevirtual   #1270 <Method void setLineWidth(float)>
		setLineCap(0);
	//  137  260:aload_0         
	//  138  261:iconst_0        
	//  139  262:invokevirtual   #1273 <Method void setLineCap(int)>
		moveTo(1.0D + d5, 1.0D + d2);
	//  140  265:aload_0         
	//  141  266:dconst_1        
	//  142  267:dload           11
	//  143  269:dadd            
	//  144  270:dconst_1        
	//  145  271:dload           5
	//  146  273:dadd            
	//  147  274:invokevirtual   #1080 <Method void moveTo(double, double)>
		lineTo(1.0D + d5, d - 1.0D);
	//  148  277:aload_0         
	//  149  278:dconst_1        
	//  150  279:dload           11
	//  151  281:dadd            
	//  152  282:dload_1         
	//  153  283:dconst_1        
	//  154  284:dsub            
	//  155  285:invokevirtual   #1289 <Method void lineTo(double, double)>
		lineTo(d4 - 1.0D, d - 1.0D);
	//  156  288:aload_0         
	//  157  289:dload           9
	//  158  291:dconst_1        
	//  159  292:dsub            
	//  160  293:dload_1         
	//  161  294:dconst_1        
	//  162  295:dsub            
	//  163  296:invokevirtual   #1289 <Method void lineTo(double, double)>
		stroke();
	//  164  299:aload_0         
	//  165  300:invokevirtual   #1278 <Method void stroke()>
		setColorStroke(new BaseColor(0, 0, 0));
	//  166  303:aload_0         
	//  167  304:new             #496 <Class BaseColor>
	//  168  307:dup             
	//  169  308:iconst_0        
	//  170  309:iconst_0        
	//  171  310:iconst_0        
	//  172  311:invokespecial   #1263 <Method void BaseColor(int, int, int)>
	//  173  314:invokevirtual   #1267 <Method void setColorStroke(BaseColor)>
		setLineWidth(1.0F);
	//  174  317:aload_0         
	//  175  318:fconst_1        
	//  176  319:invokevirtual   #1270 <Method void setLineWidth(float)>
		setLineCap(0);
	//  177  322:aload_0         
	//  178  323:iconst_0        
	//  179  324:invokevirtual   #1273 <Method void setLineCap(int)>
		moveTo(2D + d5, 2D + d2);
	//  180  327:aload_0         
	//  181  328:ldc2w           #438 <Double 2D>
	//  182  331:dload           11
	//  183  333:dadd            
	//  184  334:ldc2w           #438 <Double 2D>
	//  185  337:dload           5
	//  186  339:dadd            
	//  187  340:invokevirtual   #1080 <Method void moveTo(double, double)>
		lineTo(2D + d5, d - 2D);
	//  188  343:aload_0         
	//  189  344:ldc2w           #438 <Double 2D>
	//  190  347:dload           11
	//  191  349:dadd            
	//  192  350:dload_1         
	//  193  351:ldc2w           #438 <Double 2D>
	//  194  354:dsub            
	//  195  355:invokevirtual   #1289 <Method void lineTo(double, double)>
		lineTo(d4 - 2D, d - 2D);
	//  196  358:aload_0         
	//  197  359:dload           9
	//  198  361:ldc2w           #438 <Double 2D>
	//  199  364:dsub            
	//  200  365:dload_1         
	//  201  366:ldc2w           #438 <Double 2D>
	//  202  369:dsub            
	//  203  370:invokevirtual   #1289 <Method void lineTo(double, double)>
		stroke();
	//  204  373:aload_0         
	//  205  374:invokevirtual   #1278 <Method void stroke()>
		restoreState();
	//  206  377:aload_0         
	//  207  378:invokevirtual   #882 <Method void restoreState()>
	//  208  381:return          
	}

	public void drawTextField(float f, float f1, float f2, float f3)
	{
		drawTextField(f, f1, f2, f3);
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:f2d             
	//    3    3:fload_2         
	//    4    4:f2d             
	//    5    5:fload_3         
	//    6    6:f2d             
	//    7    7:fload           4
	//    8    9:f2d             
	//    9   10:invokevirtual   #1318 <Method void drawTextField(double, double, double, double)>
	//   10   13:return          
	}

	public void ellipse(double d, double d1, double d2, double d3)
	{
		arc(d, d1, d2, d3, 0.0D, 360D);
	//    0    0:aload_0         
	//    1    1:dload_1         
	//    2    2:dload_3         
	//    3    3:dload           5
	//    4    5:dload           7
	//    5    7:dconst_0        
	//    6    8:ldc2w           #442 <Double 360D>
	//    7   11:invokevirtual   #1085 <Method void arc(double, double, double, double, double, double)>
	//    8   14:return          
	}

	public void ellipse(float f, float f1, float f2, float f3)
	{
		ellipse(f, f1, f2, f3);
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:f2d             
	//    3    3:fload_2         
	//    4    4:f2d             
	//    5    5:fload_3         
	//    6    6:f2d             
	//    7    7:fload           4
	//    8    9:f2d             
	//    9   10:invokevirtual   #1321 <Method void ellipse(double, double, double, double)>
	//   10   13:return          
	}

	public void endLayer()
	{
		if(layerDepth != null && !layerDepth.isEmpty())
	//*   0    0:aload_0         
	//*   1    1:getfield        #1094 <Field ArrayList layerDepth>
	//*   2    4:ifnull          86
	//*   3    7:aload_0         
	//*   4    8:getfield        #1094 <Field ArrayList layerDepth>
	//*   5   11:invokevirtual   #1074 <Method boolean ArrayList.isEmpty()>
	//*   6   14:ifne            86
		{
			int i = ((Integer)layerDepth.get(layerDepth.size() - 1)).intValue();
	//    7   17:aload_0         
	//    8   18:getfield        #1094 <Field ArrayList layerDepth>
	//    9   21:aload_0         
	//   10   22:getfield        #1094 <Field ArrayList layerDepth>
	//   11   25:invokevirtual   #264 <Method int ArrayList.size()>
	//   12   28:iconst_1        
	//   13   29:isub            
	//   14   30:invokevirtual   #269 <Method Object ArrayList.get(int)>
	//   15   33:checkcast       #965 <Class Integer>
	//   16   36:invokevirtual   #1324 <Method int Integer.intValue()>
	//   17   39:istore_1        
			layerDepth.remove(layerDepth.size() - 1);
	//   18   40:aload_0         
	//   19   41:getfield        #1094 <Field ArrayList layerDepth>
	//   20   44:aload_0         
	//   21   45:getfield        #1094 <Field ArrayList layerDepth>
	//   22   48:invokevirtual   #264 <Method int ArrayList.size()>
	//   23   51:iconst_1        
	//   24   52:isub            
	//   25   53:invokevirtual   #1326 <Method Object ArrayList.remove(int)>
	//   26   56:pop             
			for(; i > 0; i--)
	//*  27   57:iload_1         
	//*  28   58:ifle            104
				content.append("EMC").append_i(separator);
	//   29   61:aload_0         
	//   30   62:getfield        #140 <Field ByteBuffer content>
	//   31   65:ldc2            #1328 <String "EMC">
	//   32   68:invokevirtual   #278 <Method ByteBuffer ByteBuffer.append(String)>
	//   33   71:aload_0         
	//   34   72:getfield        #152 <Field int separator>
	//   35   75:invokevirtual   #296 <Method ByteBuffer ByteBuffer.append_i(int)>
	//   36   78:pop             

	//   37   79:iload_1         
	//   38   80:iconst_1        
	//   39   81:isub            
	//   40   82:istore_1        
		} else
	//*  41   83:goto            57
		{
			throw new IllegalPdfSyntaxException(MessageLocalization.getComposedMessage("unbalanced.layer.operators", new Object[0]));
	//   42   86:new             #1122 <Class IllegalPdfSyntaxException>
	//   43   89:dup             
	//   44   90:ldc2            #1330 <String "unbalanced.layer.operators">
	//   45   93:iconst_0        
	//   46   94:anewarray       Object[]
	//   47   97:invokestatic    #239 <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//   48  100:invokespecial   #1125 <Method void IllegalPdfSyntaxException(String)>
	//   49  103:athrow          
		}
	//   50  104:return          
	}

	public void endMarkedContentSequence()
	{
		if(getMcDepth() == 0)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #391 <Method int getMcDepth()>
	//*   2    4:ifne            25
		{
			throw new IllegalPdfSyntaxException(MessageLocalization.getComposedMessage("unbalanced.begin.end.marked.content.operators", new Object[0]));
	//    3    7:new             #1122 <Class IllegalPdfSyntaxException>
	//    4   10:dup             
	//    5   11:ldc2            #1332 <String "unbalanced.begin.end.marked.content.operators">
	//    6   14:iconst_0        
	//    7   15:anewarray       Object[]
	//    8   18:invokestatic    #239 <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//    9   21:invokespecial   #1125 <Method void IllegalPdfSyntaxException(String)>
	//   10   24:athrow          
		} else
		{
			int i = content.size();
	//   11   25:aload_0         
	//   12   26:getfield        #140 <Field ByteBuffer content>
	//   13   29:invokevirtual   #395 <Method int ByteBuffer.size()>
	//   14   32:istore_1        
			setMcDepth(getMcDepth() - 1);
	//   15   33:aload_0         
	//   16   34:aload_0         
	//   17   35:invokevirtual   #391 <Method int getMcDepth()>
	//   18   38:iconst_1        
	//   19   39:isub            
	//   20   40:invokevirtual   #394 <Method void setMcDepth(int)>
			content.append("EMC").append_i(separator);
	//   21   43:aload_0         
	//   22   44:getfield        #140 <Field ByteBuffer content>
	//   23   47:ldc2            #1328 <String "EMC">
	//   24   50:invokevirtual   #278 <Method ByteBuffer ByteBuffer.append(String)>
	//   25   53:aload_0         
	//   26   54:getfield        #152 <Field int separator>
	//   27   57:invokevirtual   #296 <Method ByteBuffer ByteBuffer.append_i(int)>
	//   28   60:pop             
			markedContentSize = markedContentSize + (content.size() - i);
	//   29   61:aload_0         
	//   30   62:aload_0         
	//   31   63:getfield        #142 <Field int markedContentSize>
	//   32   66:aload_0         
	//   33   67:getfield        #140 <Field ByteBuffer content>
	//   34   70:invokevirtual   #395 <Method int ByteBuffer.size()>
	//   35   73:iload_1         
	//   36   74:isub            
	//   37   75:iadd            
	//   38   76:putfield        #142 <Field int markedContentSize>
			return;
	//   39   79:return          
		}
	}

	public void endText()
	{
		if(!inText)
	//*   0    0:aload_0         
	//*   1    1:getfield        #156 <Field boolean inText>
	//*   2    4:ifne            33
		{
			if(isTagged())
	//*   3    7:aload_0         
	//*   4    8:invokevirtual   #220 <Method boolean isTagged()>
	//*   5   11:ifeq            15
				return;
	//    6   14:return          
			else
				throw new IllegalPdfSyntaxException(MessageLocalization.getComposedMessage("unbalanced.begin.end.text.operators", new Object[0]));
	//    7   15:new             #1122 <Class IllegalPdfSyntaxException>
	//    8   18:dup             
	//    9   19:ldc2            #1124 <String "unbalanced.begin.end.text.operators">
	//   10   22:iconst_0        
	//   11   23:anewarray       Object[]
	//   12   26:invokestatic    #239 <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//   13   29:invokespecial   #1125 <Method void IllegalPdfSyntaxException(String)>
	//   14   32:athrow          
		} else
		{
			inText = false;
	//   15   33:aload_0         
	//   16   34:iconst_0        
	//   17   35:putfield        #156 <Field boolean inText>
			content.append("ET").append_i(separator);
	//   18   38:aload_0         
	//   19   39:getfield        #140 <Field ByteBuffer content>
	//   20   42:ldc2            #1334 <String "ET">
	//   21   45:invokevirtual   #278 <Method ByteBuffer ByteBuffer.append(String)>
	//   22   48:aload_0         
	//   23   49:getfield        #152 <Field int separator>
	//   24   52:invokevirtual   #296 <Method ByteBuffer ByteBuffer.append_i(int)>
	//   25   55:pop             
			return;
	//   26   56:return          
		}
	}

	public void eoClip()
	{
		if(inText && isTagged())
	//*   0    0:aload_0         
	//*   1    1:getfield        #156 <Field boolean inText>
	//*   2    4:ifeq            18
	//*   3    7:aload_0         
	//*   4    8:invokevirtual   #220 <Method boolean isTagged()>
	//*   5   11:ifeq            18
			endText();
	//    6   14:aload_0         
	//    7   15:invokevirtual   #223 <Method void endText()>
		content.append("W*").append_i(separator);
	//    8   18:aload_0         
	//    9   19:getfield        #140 <Field ByteBuffer content>
	//   10   22:ldc2            #1337 <String "W*">
	//   11   25:invokevirtual   #278 <Method ByteBuffer ByteBuffer.append(String)>
	//   12   28:aload_0         
	//   13   29:getfield        #152 <Field int separator>
	//   14   32:invokevirtual   #296 <Method ByteBuffer ByteBuffer.append_i(int)>
	//   15   35:pop             
	//   16   36:return          
	}

	public void eoFill()
	{
label0:
		{
			if(inText)
	//*   0    0:aload_0         
	//*   1    1:getfield        #156 <Field boolean inText>
	//*   2    4:ifeq            18
			{
				if(!isTagged())
					break label0;
	//    3    7:aload_0         
	//    4    8:invokevirtual   #220 <Method boolean isTagged()>
	//    5   11:ifeq            68
				endText();
	//    6   14:aload_0         
	//    7   15:invokevirtual   #223 <Method void endText()>
			}
			PdfWriter.checkPdfIsoConformance(writer, 1, ((Object) (state.colorFill)));
	//    8   18:aload_0         
	//    9   19:getfield        #164 <Field PdfWriter writer>
	//   10   22:iconst_1        
	//   11   23:aload_0         
	//   12   24:getfield        #145 <Field PdfContentByte$GraphicState state>
	//   13   27:getfield        #666 <Field BaseColor PdfContentByte$GraphicState.colorFill>
	//   14   30:invokestatic    #196 <Method void PdfWriter.checkPdfIsoConformance(PdfWriter, int, Object)>
			PdfWriter.checkPdfIsoConformance(writer, 6, ((Object) (state.extGState)));
	//   15   33:aload_0         
	//   16   34:getfield        #164 <Field PdfWriter writer>
	//   17   37:bipush          6
	//   18   39:aload_0         
	//   19   40:getfield        #145 <Field PdfContentByte$GraphicState state>
	//   20   43:getfield        #1159 <Field PdfObject PdfContentByte$GraphicState.extGState>
	//   21   46:invokestatic    #196 <Method void PdfWriter.checkPdfIsoConformance(PdfWriter, int, Object)>
			content.append("f*").append_i(separator);
	//   22   49:aload_0         
	//   23   50:getfield        #140 <Field ByteBuffer content>
	//   24   53:ldc2            #1340 <String "f*">
	//   25   56:invokevirtual   #278 <Method ByteBuffer ByteBuffer.append(String)>
	//   26   59:aload_0         
	//   27   60:getfield        #152 <Field int separator>
	//   28   63:invokevirtual   #296 <Method ByteBuffer ByteBuffer.append_i(int)>
	//   29   66:pop             
			return;
	//   30   67:return          
		}
		throw new IllegalPdfSyntaxException(MessageLocalization.getComposedMessage("path.construction.operator.inside.text.object", new Object[0]));
	//   31   68:new             #1122 <Class IllegalPdfSyntaxException>
	//   32   71:dup             
	//   33   72:ldc2            #1182 <String "path.construction.operator.inside.text.object">
	//   34   75:iconst_0        
	//   35   76:anewarray       Object[]
	//   36   79:invokestatic    #239 <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//   37   82:invokespecial   #1125 <Method void IllegalPdfSyntaxException(String)>
	//   38   85:athrow          
	}

	public void eoFillStroke()
	{
label0:
		{
			if(inText)
	//*   0    0:aload_0         
	//*   1    1:getfield        #156 <Field boolean inText>
	//*   2    4:ifeq            18
			{
				if(!isTagged())
					break label0;
	//    3    7:aload_0         
	//    4    8:invokevirtual   #220 <Method boolean isTagged()>
	//    5   11:ifeq            83
				endText();
	//    6   14:aload_0         
	//    7   15:invokevirtual   #223 <Method void endText()>
			}
			PdfWriter.checkPdfIsoConformance(writer, 1, ((Object) (state.colorFill)));
	//    8   18:aload_0         
	//    9   19:getfield        #164 <Field PdfWriter writer>
	//   10   22:iconst_1        
	//   11   23:aload_0         
	//   12   24:getfield        #145 <Field PdfContentByte$GraphicState state>
	//   13   27:getfield        #666 <Field BaseColor PdfContentByte$GraphicState.colorFill>
	//   14   30:invokestatic    #196 <Method void PdfWriter.checkPdfIsoConformance(PdfWriter, int, Object)>
			PdfWriter.checkPdfIsoConformance(writer, 1, ((Object) (state.colorStroke)));
	//   15   33:aload_0         
	//   16   34:getfield        #164 <Field PdfWriter writer>
	//   17   37:iconst_1        
	//   18   38:aload_0         
	//   19   39:getfield        #145 <Field PdfContentByte$GraphicState state>
	//   20   42:getfield        #669 <Field BaseColor PdfContentByte$GraphicState.colorStroke>
	//   21   45:invokestatic    #196 <Method void PdfWriter.checkPdfIsoConformance(PdfWriter, int, Object)>
			PdfWriter.checkPdfIsoConformance(writer, 6, ((Object) (state.extGState)));
	//   22   48:aload_0         
	//   23   49:getfield        #164 <Field PdfWriter writer>
	//   24   52:bipush          6
	//   25   54:aload_0         
	//   26   55:getfield        #145 <Field PdfContentByte$GraphicState state>
	//   27   58:getfield        #1159 <Field PdfObject PdfContentByte$GraphicState.extGState>
	//   28   61:invokestatic    #196 <Method void PdfWriter.checkPdfIsoConformance(PdfWriter, int, Object)>
			content.append("B*").append_i(separator);
	//   29   64:aload_0         
	//   30   65:getfield        #140 <Field ByteBuffer content>
	//   31   68:ldc2            #1343 <String "B*">
	//   32   71:invokevirtual   #278 <Method ByteBuffer ByteBuffer.append(String)>
	//   33   74:aload_0         
	//   34   75:getfield        #152 <Field int separator>
	//   35   78:invokevirtual   #296 <Method ByteBuffer ByteBuffer.append_i(int)>
	//   36   81:pop             
			return;
	//   37   82:return          
		}
		throw new IllegalPdfSyntaxException(MessageLocalization.getComposedMessage("path.construction.operator.inside.text.object", new Object[0]));
	//   38   83:new             #1122 <Class IllegalPdfSyntaxException>
	//   39   86:dup             
	//   40   87:ldc2            #1182 <String "path.construction.operator.inside.text.object">
	//   41   90:iconst_0        
	//   42   91:anewarray       Object[]
	//   43   94:invokestatic    #239 <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//   44   97:invokespecial   #1125 <Method void IllegalPdfSyntaxException(String)>
	//   45  100:athrow          
	}

	public void fill()
	{
label0:
		{
			if(inText)
	//*   0    0:aload_0         
	//*   1    1:getfield        #156 <Field boolean inText>
	//*   2    4:ifeq            18
			{
				if(!isTagged())
					break label0;
	//    3    7:aload_0         
	//    4    8:invokevirtual   #220 <Method boolean isTagged()>
	//    5   11:ifeq            68
				endText();
	//    6   14:aload_0         
	//    7   15:invokevirtual   #223 <Method void endText()>
			}
			PdfWriter.checkPdfIsoConformance(writer, 1, ((Object) (state.colorFill)));
	//    8   18:aload_0         
	//    9   19:getfield        #164 <Field PdfWriter writer>
	//   10   22:iconst_1        
	//   11   23:aload_0         
	//   12   24:getfield        #145 <Field PdfContentByte$GraphicState state>
	//   13   27:getfield        #666 <Field BaseColor PdfContentByte$GraphicState.colorFill>
	//   14   30:invokestatic    #196 <Method void PdfWriter.checkPdfIsoConformance(PdfWriter, int, Object)>
			PdfWriter.checkPdfIsoConformance(writer, 6, ((Object) (state.extGState)));
	//   15   33:aload_0         
	//   16   34:getfield        #164 <Field PdfWriter writer>
	//   17   37:bipush          6
	//   18   39:aload_0         
	//   19   40:getfield        #145 <Field PdfContentByte$GraphicState state>
	//   20   43:getfield        #1159 <Field PdfObject PdfContentByte$GraphicState.extGState>
	//   21   46:invokestatic    #196 <Method void PdfWriter.checkPdfIsoConformance(PdfWriter, int, Object)>
			content.append("f").append_i(separator);
	//   22   49:aload_0         
	//   23   50:getfield        #140 <Field ByteBuffer content>
	//   24   53:ldc2            #1345 <String "f">
	//   25   56:invokevirtual   #278 <Method ByteBuffer ByteBuffer.append(String)>
	//   26   59:aload_0         
	//   27   60:getfield        #152 <Field int separator>
	//   28   63:invokevirtual   #296 <Method ByteBuffer ByteBuffer.append_i(int)>
	//   29   66:pop             
			return;
	//   30   67:return          
		}
		throw new IllegalPdfSyntaxException(MessageLocalization.getComposedMessage("path.construction.operator.inside.text.object", new Object[0]));
	//   31   68:new             #1122 <Class IllegalPdfSyntaxException>
	//   32   71:dup             
	//   33   72:ldc2            #1182 <String "path.construction.operator.inside.text.object">
	//   34   75:iconst_0        
	//   35   76:anewarray       Object[]
	//   36   79:invokestatic    #239 <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//   37   82:invokespecial   #1125 <Method void IllegalPdfSyntaxException(String)>
	//   38   85:athrow          
	}

	public void fillStroke()
	{
label0:
		{
			if(inText)
	//*   0    0:aload_0         
	//*   1    1:getfield        #156 <Field boolean inText>
	//*   2    4:ifeq            18
			{
				if(!isTagged())
					break label0;
	//    3    7:aload_0         
	//    4    8:invokevirtual   #220 <Method boolean isTagged()>
	//    5   11:ifeq            83
				endText();
	//    6   14:aload_0         
	//    7   15:invokevirtual   #223 <Method void endText()>
			}
			PdfWriter.checkPdfIsoConformance(writer, 1, ((Object) (state.colorFill)));
	//    8   18:aload_0         
	//    9   19:getfield        #164 <Field PdfWriter writer>
	//   10   22:iconst_1        
	//   11   23:aload_0         
	//   12   24:getfield        #145 <Field PdfContentByte$GraphicState state>
	//   13   27:getfield        #666 <Field BaseColor PdfContentByte$GraphicState.colorFill>
	//   14   30:invokestatic    #196 <Method void PdfWriter.checkPdfIsoConformance(PdfWriter, int, Object)>
			PdfWriter.checkPdfIsoConformance(writer, 1, ((Object) (state.colorStroke)));
	//   15   33:aload_0         
	//   16   34:getfield        #164 <Field PdfWriter writer>
	//   17   37:iconst_1        
	//   18   38:aload_0         
	//   19   39:getfield        #145 <Field PdfContentByte$GraphicState state>
	//   20   42:getfield        #669 <Field BaseColor PdfContentByte$GraphicState.colorStroke>
	//   21   45:invokestatic    #196 <Method void PdfWriter.checkPdfIsoConformance(PdfWriter, int, Object)>
			PdfWriter.checkPdfIsoConformance(writer, 6, ((Object) (state.extGState)));
	//   22   48:aload_0         
	//   23   49:getfield        #164 <Field PdfWriter writer>
	//   24   52:bipush          6
	//   25   54:aload_0         
	//   26   55:getfield        #145 <Field PdfContentByte$GraphicState state>
	//   27   58:getfield        #1159 <Field PdfObject PdfContentByte$GraphicState.extGState>
	//   28   61:invokestatic    #196 <Method void PdfWriter.checkPdfIsoConformance(PdfWriter, int, Object)>
			content.append("B").append_i(separator);
	//   29   64:aload_0         
	//   30   65:getfield        #140 <Field ByteBuffer content>
	//   31   68:ldc2            #1348 <String "B">
	//   32   71:invokevirtual   #278 <Method ByteBuffer ByteBuffer.append(String)>
	//   33   74:aload_0         
	//   34   75:getfield        #152 <Field int separator>
	//   35   78:invokevirtual   #296 <Method ByteBuffer ByteBuffer.append_i(int)>
	//   36   81:pop             
			return;
	//   37   82:return          
		}
		throw new IllegalPdfSyntaxException(MessageLocalization.getComposedMessage("path.construction.operator.inside.text.object", new Object[0]));
	//   38   83:new             #1122 <Class IllegalPdfSyntaxException>
	//   39   86:dup             
	//   40   87:ldc2            #1182 <String "path.construction.operator.inside.text.object">
	//   41   90:iconst_0        
	//   42   91:anewarray       Object[]
	//   43   94:invokestatic    #239 <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//   44   97:invokespecial   #1125 <Method void IllegalPdfSyntaxException(String)>
	//   45  100:athrow          
	}

	public float getCharacterSpacing()
	{
		return state.charSpace;
	//    0    0:aload_0         
	//    1    1:getfield        #145 <Field PdfContentByte$GraphicState state>
	//    2    4:getfield        #530 <Field float PdfContentByte$GraphicState.charSpace>
	//    3    7:freturn         
	}

	protected PdfIndirectReference getCurrentPage()
	{
		return writer.getCurrentPage();
	//    0    0:aload_0         
	//    1    1:getfield        #164 <Field PdfWriter writer>
	//    2    4:invokevirtual   #245 <Method PdfIndirectReference PdfWriter.getCurrentPage()>
	//    3    7:areturn         
	}

	public PdfContentByte getDuplicate()
	{
		PdfContentByte pdfcontentbyte = new PdfContentByte(writer);
	//    0    0:new             #2   <Class PdfContentByte>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #164 <Field PdfWriter writer>
	//    4    8:invokespecial   #1351 <Method void PdfContentByte(PdfWriter)>
	//    5   11:astore_1        
		pdfcontentbyte.duplicatedFrom = this;
	//    6   12:aload_1         
	//    7   13:aload_0         
	//    8   14:putfield        #162 <Field PdfContentByte duplicatedFrom>
		return pdfcontentbyte;
	//    9   17:aload_1         
	//   10   18:areturn         
	}

	public PdfContentByte getDuplicate(boolean flag)
	{
		PdfContentByte pdfcontentbyte = getDuplicate();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #1354 <Method PdfContentByte getDuplicate()>
	//    2    4:astore_2        
		if(flag)
	//*   3    5:iload_1         
	//*   4    6:ifeq            25
		{
			pdfcontentbyte.state = state;
	//    5    9:aload_2         
	//    6   10:aload_0         
	//    7   11:getfield        #145 <Field PdfContentByte$GraphicState state>
	//    8   14:putfield        #145 <Field PdfContentByte$GraphicState state>
			pdfcontentbyte.stateList = stateList;
	//    9   17:aload_2         
	//   10   18:aload_0         
	//   11   19:getfield        #150 <Field ArrayList stateList>
	//   12   22:putfield        #150 <Field ArrayList stateList>
		}
		return pdfcontentbyte;
	//   13   25:aload_2         
	//   14   26:areturn         
	}

	public float getEffectiveStringWidth(String s, boolean flag)
	{
		BaseFont basefont = state.fontDetails.getBaseFont();
	//    0    0:aload_0         
	//    1    1:getfield        #145 <Field PdfContentByte$GraphicState state>
	//    2    4:getfield        #512 <Field FontDetails PdfContentByte$GraphicState.fontDetails>
	//    3    7:invokevirtual   #518 <Method BaseFont FontDetails.getBaseFont()>
	//    4   10:astore          6
		float f;
		float f1;
		if(flag)
	//*   5   12:iload_2         
	//*   6   13:ifeq            156
			f1 = basefont.getWidthPointKerned(s, state.size);
	//    7   16:aload           6
	//    8   18:aload_1         
	//    9   19:aload_0         
	//   10   20:getfield        #145 <Field PdfContentByte$GraphicState state>
	//   11   23:getfield        #521 <Field float PdfContentByte$GraphicState.size>
	//   12   26:invokevirtual   #527 <Method float BaseFont.getWidthPointKerned(String, float)>
	//   13   29:fstore          4
		else
	//*  14   31:fload           4
	//*  15   33:fstore_3        
	//*  16   34:aload_0         
	//*  17   35:getfield        #145 <Field PdfContentByte$GraphicState state>
	//*  18   38:getfield        #530 <Field float PdfContentByte$GraphicState.charSpace>
	//*  19   41:fconst_0        
	//*  20   42:fcmpl           
	//*  21   43:ifeq            76
	//*  22   46:fload           4
	//*  23   48:fstore_3        
	//*  24   49:aload_1         
	//*  25   50:invokevirtual   #535 <Method int String.length()>
	//*  26   53:iconst_1        
	//*  27   54:icmple          76
	//*  28   57:fload           4
	//*  29   59:aload_0         
	//*  30   60:getfield        #145 <Field PdfContentByte$GraphicState state>
	//*  31   63:getfield        #530 <Field float PdfContentByte$GraphicState.charSpace>
	//*  32   66:aload_1         
	//*  33   67:invokevirtual   #535 <Method int String.length()>
	//*  34   70:iconst_1        
	//*  35   71:isub            
	//*  36   72:i2f             
	//*  37   73:fmul            
	//*  38   74:fadd            
	//*  39   75:fstore_3        
	//*  40   76:fload_3         
	//*  41   77:fstore          4
	//*  42   79:aload_0         
	//*  43   80:getfield        #145 <Field PdfContentByte$GraphicState state>
	//*  44   83:getfield        #538 <Field float PdfContentByte$GraphicState.wordSpace>
	//*  45   86:fconst_0        
	//*  46   87:fcmpl           
	//*  47   88:ifeq            174
	//*  48   91:fload_3         
	//*  49   92:fstore          4
	//*  50   94:aload           6
	//*  51   96:invokevirtual   #541 <Method boolean BaseFont.isVertical()>
	//*  52   99:ifne            174
	//*  53  102:iconst_0        
	//*  54  103:istore          5
	//*  55  105:fload_3         
	//*  56  106:fstore          4
	//*  57  108:iload           5
	//*  58  110:aload_1         
	//*  59  111:invokevirtual   #535 <Method int String.length()>
	//*  60  114:iconst_1        
	//*  61  115:isub            
	//*  62  116:icmpge          174
	//*  63  119:fload_3         
	//*  64  120:fstore          4
	//*  65  122:aload_1         
	//*  66  123:iload           5
	//*  67  125:invokevirtual   #545 <Method char String.charAt(int)>
	//*  68  128:bipush          32
	//*  69  130:icmpne          144
	//*  70  133:fload_3         
	//*  71  134:aload_0         
	//*  72  135:getfield        #145 <Field PdfContentByte$GraphicState state>
	//*  73  138:getfield        #538 <Field float PdfContentByte$GraphicState.wordSpace>
	//*  74  141:fadd            
	//*  75  142:fstore          4
	//*  76  144:iload           5
	//*  77  146:iconst_1        
	//*  78  147:iadd            
	//*  79  148:istore          5
	//*  80  150:fload           4
	//*  81  152:fstore_3        
	//*  82  153:goto            105
			f1 = basefont.getWidthPoint(s, state.size);
	//   83  156:aload           6
	//   84  158:aload_1         
	//   85  159:aload_0         
	//   86  160:getfield        #145 <Field PdfContentByte$GraphicState state>
	//   87  163:getfield        #521 <Field float PdfContentByte$GraphicState.size>
	//   88  166:invokevirtual   #548 <Method float BaseFont.getWidthPoint(String, float)>
	//   89  169:fstore          4
		f = f1;
		if(state.charSpace != 0.0F)
		{
			f = f1;
			if(s.length() > 1)
				f = f1 + state.charSpace * (float)(s.length() - 1);
		}
		f1 = f;
		if(state.wordSpace != 0.0F)
		{
			f1 = f;
			if(!basefont.isVertical())
			{
				int i = 0;
				do
				{
					f1 = f;
					if(i >= s.length() - 1)
						break;
					f1 = f;
					if(s.charAt(i) == ' ')
						f1 = f + state.wordSpace;
					i++;
					f = f1;
				} while(true);
			}
		}
	//*  90  171:goto            31
		f = f1;
	//   91  174:fload           4
	//   92  176:fstore_3        
		if((double)state.scale != 100D)
	//*  93  177:aload_0         
	//*  94  178:getfield        #145 <Field PdfContentByte$GraphicState state>
	//*  95  181:getfield        #552 <Field float PdfContentByte$GraphicState.scale>
	//*  96  184:f2d             
	//*  97  185:ldc2w           #553 <Double 100D>
	//*  98  188:dcmpl           
	//*  99  189:ifeq            207
			f = (state.scale * f1) / 100F;
	//  100  192:aload_0         
	//  101  193:getfield        #145 <Field PdfContentByte$GraphicState state>
	//  102  196:getfield        #552 <Field float PdfContentByte$GraphicState.scale>
	//  103  199:fload           4
	//  104  201:fmul            
	//  105  202:ldc2            #555 <Float 100F>
	//  106  205:fdiv            
	//  107  206:fstore_3        
		return f;
	//  108  207:fload_3         
	//  109  208:freturn         
	}

	public float getHorizontalScaling()
	{
		return state.scale;
	//    0    0:aload_0         
	//    1    1:getfield        #145 <Field PdfContentByte$GraphicState state>
	//    2    4:getfield        #552 <Field float PdfContentByte$GraphicState.scale>
	//    3    7:freturn         
	}

	protected boolean getInText()
	{
		return inText;
	//    0    0:aload_0         
	//    1    1:getfield        #156 <Field boolean inText>
	//    2    4:ireturn         
	}

	public ByteBuffer getInternalBuffer()
	{
		return content;
	//    0    0:aload_0         
	//    1    1:getfield        #140 <Field ByteBuffer content>
	//    2    4:areturn         
	}

	public float getLeading()
	{
		return state.leading;
	//    0    0:aload_0         
	//    1    1:getfield        #145 <Field PdfContentByte$GraphicState state>
	//    2    4:getfield        #1362 <Field float PdfContentByte$GraphicState.leading>
	//    3    7:freturn         
	}

	protected int getMcDepth()
	{
		if(duplicatedFrom != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #162 <Field PdfContentByte duplicatedFrom>
	//*   2    4:ifnull          15
			return duplicatedFrom.getMcDepth();
	//    3    7:aload_0         
	//    4    8:getfield        #162 <Field PdfContentByte duplicatedFrom>
	//    5   11:invokevirtual   #391 <Method int getMcDepth()>
	//    6   14:ireturn         
		else
			return mcDepth;
	//    7   15:aload_0         
	//    8   16:getfield        #154 <Field int mcDepth>
	//    9   19:ireturn         
	}

	protected ArrayList getMcElements()
	{
		if(duplicatedFrom != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #162 <Field PdfContentByte duplicatedFrom>
	//*   2    4:ifnull          15
			return duplicatedFrom.getMcElements();
	//    3    7:aload_0         
	//    4    8:getfield        #162 <Field PdfContentByte duplicatedFrom>
	//    5   11:invokevirtual   #260 <Method ArrayList getMcElements()>
	//    6   14:areturn         
		else
			return mcElements;
	//    7   15:aload_0         
	//    8   16:getfield        #160 <Field ArrayList mcElements>
	//    9   19:areturn         
	}

	PageResources getPageResources()
	{
		return pdf.getPageResources();
	//    0    0:aload_0         
	//    1    1:getfield        #172 <Field PdfDocument pdf>
	//    2    4:invokevirtual   #1364 <Method PageResources PdfDocument.getPageResources()>
	//    3    7:areturn         
	}

	public PdfDocument getPdfDocument()
	{
		return pdf;
	//    0    0:aload_0         
	//    1    1:getfield        #172 <Field PdfDocument pdf>
	//    2    4:areturn         
	}

	public PdfWriter getPdfWriter()
	{
		return writer;
	//    0    0:aload_0         
	//    1    1:getfield        #164 <Field PdfWriter writer>
	//    2    4:areturn         
	}

	public PdfOutline getRootOutline()
	{
		checkWriter();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #188 <Method void checkWriter()>
		return pdf.getRootOutline();
	//    2    4:aload_0         
	//    3    5:getfield        #172 <Field PdfDocument pdf>
	//    4    8:invokevirtual   #1370 <Method PdfOutline PdfDocument.getRootOutline()>
	//    5   11:areturn         
	}

	public float getWordSpacing()
	{
		return state.wordSpace;
	//    0    0:aload_0         
	//    1    1:getfield        #145 <Field PdfContentByte$GraphicState state>
	//    2    4:getfield        #538 <Field float PdfContentByte$GraphicState.wordSpace>
	//    3    7:freturn         
	}

	public float getXTLM()
	{
		return state.xTLM;
	//    0    0:aload_0         
	//    1    1:getfield        #145 <Field PdfContentByte$GraphicState state>
	//    2    4:getfield        #1130 <Field float PdfContentByte$GraphicState.xTLM>
	//    3    7:freturn         
	}

	public float getYTLM()
	{
		return state.yTLM;
	//    0    0:aload_0         
	//    1    1:getfield        #145 <Field PdfContentByte$GraphicState state>
	//    2    4:getfield        #1148 <Field float PdfContentByte$GraphicState.yTLM>
	//    3    7:freturn         
	}

	public void inheritGraphicState(PdfContentByte pdfcontentbyte)
	{
		state = pdfcontentbyte.state;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:getfield        #145 <Field PdfContentByte$GraphicState state>
	//    3    5:putfield        #145 <Field PdfContentByte$GraphicState state>
		stateList = pdfcontentbyte.stateList;
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:getfield        #150 <Field ArrayList stateList>
	//    7   13:putfield        #150 <Field ArrayList stateList>
	//    8   16:return          
	}

	public boolean isTagged()
	{
		return writer != null && writer.isTagged() && !isTaggingSuppressed();
	//    0    0:aload_0         
	//    1    1:getfield        #164 <Field PdfWriter writer>
	//    2    4:ifnull          26
	//    3    7:aload_0         
	//    4    8:getfield        #164 <Field PdfWriter writer>
	//    5   11:invokevirtual   #1375 <Method boolean PdfWriter.isTagged()>
	//    6   14:ifeq            26
	//    7   17:aload_0         
	//    8   18:invokevirtual   #1378 <Method boolean isTaggingSuppressed()>
	//    9   21:ifne            26
	//   10   24:iconst_1        
	//   11   25:ireturn         
	//   12   26:iconst_0        
	//   13   27:ireturn         
	}

	public boolean isTaggingSuppressed()
	{
		return suppressTagging;
	//    0    0:aload_0         
	//    1    1:getfield        #158 <Field boolean suppressTagging>
	//    2    4:ireturn         
	}

	public void lineTo(double d, double d1)
	{
label0:
		{
			if(inText)
	//*   0    0:aload_0         
	//*   1    1:getfield        #156 <Field boolean inText>
	//*   2    4:ifeq            18
			{
				if(!isTagged())
					break label0;
	//    3    7:aload_0         
	//    4    8:invokevirtual   #220 <Method boolean isTagged()>
	//    5   11:ifeq            50
				endText();
	//    6   14:aload_0         
	//    7   15:invokevirtual   #223 <Method void endText()>
			}
			content.append(d).append(' ').append(d1).append(" l").append_i(separator);
	//    8   18:aload_0         
	//    9   19:getfield        #140 <Field ByteBuffer content>
	//   10   22:dload_1         
	//   11   23:invokevirtual   #281 <Method ByteBuffer ByteBuffer.append(double)>
	//   12   26:bipush          32
	//   13   28:invokevirtual   #181 <Method ByteBuffer ByteBuffer.append(char)>
	//   14   31:dload_3         
	//   15   32:invokevirtual   #281 <Method ByteBuffer ByteBuffer.append(double)>
	//   16   35:ldc2            #1380 <String " l">
	//   17   38:invokevirtual   #278 <Method ByteBuffer ByteBuffer.append(String)>
	//   18   41:aload_0         
	//   19   42:getfield        #152 <Field int separator>
	//   20   45:invokevirtual   #296 <Method ByteBuffer ByteBuffer.append_i(int)>
	//   21   48:pop             
			return;
	//   22   49:return          
		}
		throw new IllegalPdfSyntaxException(MessageLocalization.getComposedMessage("path.construction.operator.inside.text.object", new Object[0]));
	//   23   50:new             #1122 <Class IllegalPdfSyntaxException>
	//   24   53:dup             
	//   25   54:ldc2            #1182 <String "path.construction.operator.inside.text.object">
	//   26   57:iconst_0        
	//   27   58:anewarray       Object[]
	//   28   61:invokestatic    #239 <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//   29   64:invokespecial   #1125 <Method void IllegalPdfSyntaxException(String)>
	//   30   67:athrow          
	}

	public void lineTo(float f, float f1)
	{
		lineTo(f, f1);
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:f2d             
	//    3    3:fload_2         
	//    4    4:f2d             
	//    5    5:invokevirtual   #1289 <Method void lineTo(double, double)>
	//    6    8:return          
	}

	public boolean localDestination(String s, PdfDestination pdfdestination)
	{
		return pdf.localDestination(s, pdfdestination);
	//    0    0:aload_0         
	//    1    1:getfield        #172 <Field PdfDocument pdf>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #1384 <Method boolean PdfDocument.localDestination(String, PdfDestination)>
	//    5    9:ireturn         
	}

	public void localGoto(String s, float f, float f1, float f2, float f3)
	{
		pdf.localGoto(s, f, f1, f2, f3);
	//    0    0:aload_0         
	//    1    1:getfield        #172 <Field PdfDocument pdf>
	//    2    4:aload_1         
	//    3    5:fload_2         
	//    4    6:fload_3         
	//    5    7:fload           4
	//    6    9:fload           5
	//    7   11:invokevirtual   #1388 <Method void PdfDocument.localGoto(String, float, float, float, float)>
	//    8   14:return          
	}

	public void moveText(float f, float f1)
	{
		if(!inText && isTagged())
	//*   0    0:aload_0         
	//*   1    1:getfield        #156 <Field boolean inText>
	//*   2    4:ifne            19
	//*   3    7:aload_0         
	//*   4    8:invokevirtual   #220 <Method boolean isTagged()>
	//*   5   11:ifeq            19
			beginText(true);
	//    6   14:aload_0         
	//    7   15:iconst_1        
	//    8   16:invokevirtual   #490 <Method void beginText(boolean)>
		GraphicState graphicstate = state;
	//    9   19:aload_0         
	//   10   20:getfield        #145 <Field PdfContentByte$GraphicState state>
	//   11   23:astore_3        
		graphicstate.xTLM = graphicstate.xTLM + f;
	//   12   24:aload_3         
	//   13   25:aload_3         
	//   14   26:getfield        #1130 <Field float PdfContentByte$GraphicState.xTLM>
	//   15   29:fload_1         
	//   16   30:fadd            
	//   17   31:putfield        #1130 <Field float PdfContentByte$GraphicState.xTLM>
		graphicstate = state;
	//   18   34:aload_0         
	//   19   35:getfield        #145 <Field PdfContentByte$GraphicState state>
	//   20   38:astore_3        
		graphicstate.yTLM = graphicstate.yTLM + f1;
	//   21   39:aload_3         
	//   22   40:aload_3         
	//   23   41:getfield        #1148 <Field float PdfContentByte$GraphicState.yTLM>
	//   24   44:fload_2         
	//   25   45:fadd            
	//   26   46:putfield        #1148 <Field float PdfContentByte$GraphicState.yTLM>
		if(isTagged() && state.xTLM != state.tx)
	//*  27   49:aload_0         
	//*  28   50:invokevirtual   #220 <Method boolean isTagged()>
	//*  29   53:ifeq            121
	//*  30   56:aload_0         
	//*  31   57:getfield        #145 <Field PdfContentByte$GraphicState state>
	//*  32   60:getfield        #1130 <Field float PdfContentByte$GraphicState.xTLM>
	//*  33   63:aload_0         
	//*  34   64:getfield        #145 <Field PdfContentByte$GraphicState state>
	//*  35   67:getfield        #1133 <Field float PdfContentByte$GraphicState.tx>
	//*  36   70:fcmpl           
	//*  37   71:ifeq            121
		{
			setTextMatrix(state.aTLM, state.bTLM, state.cTLM, state.dTLM, state.xTLM, state.yTLM);
	//   38   74:aload_0         
	//   39   75:aload_0         
	//   40   76:getfield        #145 <Field PdfContentByte$GraphicState state>
	//   41   79:getfield        #1136 <Field float PdfContentByte$GraphicState.aTLM>
	//   42   82:aload_0         
	//   43   83:getfield        #145 <Field PdfContentByte$GraphicState state>
	//   44   86:getfield        #1139 <Field float PdfContentByte$GraphicState.bTLM>
	//   45   89:aload_0         
	//   46   90:getfield        #145 <Field PdfContentByte$GraphicState state>
	//   47   93:getfield        #1142 <Field float PdfContentByte$GraphicState.cTLM>
	//   48   96:aload_0         
	//   49   97:getfield        #145 <Field PdfContentByte$GraphicState state>
	//   50  100:getfield        #1145 <Field float PdfContentByte$GraphicState.dTLM>
	//   51  103:aload_0         
	//   52  104:getfield        #145 <Field PdfContentByte$GraphicState state>
	//   53  107:getfield        #1130 <Field float PdfContentByte$GraphicState.xTLM>
	//   54  110:aload_0         
	//   55  111:getfield        #145 <Field PdfContentByte$GraphicState state>
	//   56  114:getfield        #1148 <Field float PdfContentByte$GraphicState.yTLM>
	//   57  117:invokevirtual   #703 <Method void setTextMatrix(float, float, float, float, float, float)>
			return;
	//   58  120:return          
		} else
		{
			content.append(f).append(' ').append(f1).append(" Td").append_i(separator);
	//   59  121:aload_0         
	//   60  122:getfield        #140 <Field ByteBuffer content>
	//   61  125:fload_1         
	//   62  126:invokevirtual   #178 <Method ByteBuffer ByteBuffer.append(float)>
	//   63  129:bipush          32
	//   64  131:invokevirtual   #181 <Method ByteBuffer ByteBuffer.append(char)>
	//   65  134:fload_2         
	//   66  135:invokevirtual   #178 <Method ByteBuffer ByteBuffer.append(float)>
	//   67  138:ldc2            #1391 <String " Td">
	//   68  141:invokevirtual   #278 <Method ByteBuffer ByteBuffer.append(String)>
	//   69  144:aload_0         
	//   70  145:getfield        #152 <Field int separator>
	//   71  148:invokevirtual   #296 <Method ByteBuffer ByteBuffer.append_i(int)>
	//   72  151:pop             
			return;
	//   73  152:return          
		}
	}

	public void moveTextWithLeading(float f, float f1)
	{
		if(!inText && isTagged())
	//*   0    0:aload_0         
	//*   1    1:getfield        #156 <Field boolean inText>
	//*   2    4:ifne            19
	//*   3    7:aload_0         
	//*   4    8:invokevirtual   #220 <Method boolean isTagged()>
	//*   5   11:ifeq            19
			beginText(true);
	//    6   14:aload_0         
	//    7   15:iconst_1        
	//    8   16:invokevirtual   #490 <Method void beginText(boolean)>
		GraphicState graphicstate = state;
	//    9   19:aload_0         
	//   10   20:getfield        #145 <Field PdfContentByte$GraphicState state>
	//   11   23:astore_3        
		graphicstate.xTLM = graphicstate.xTLM + f;
	//   12   24:aload_3         
	//   13   25:aload_3         
	//   14   26:getfield        #1130 <Field float PdfContentByte$GraphicState.xTLM>
	//   15   29:fload_1         
	//   16   30:fadd            
	//   17   31:putfield        #1130 <Field float PdfContentByte$GraphicState.xTLM>
		graphicstate = state;
	//   18   34:aload_0         
	//   19   35:getfield        #145 <Field PdfContentByte$GraphicState state>
	//   20   38:astore_3        
		graphicstate.yTLM = graphicstate.yTLM + f1;
	//   21   39:aload_3         
	//   22   40:aload_3         
	//   23   41:getfield        #1148 <Field float PdfContentByte$GraphicState.yTLM>
	//   24   44:fload_2         
	//   25   45:fadd            
	//   26   46:putfield        #1148 <Field float PdfContentByte$GraphicState.yTLM>
		state.leading = -f1;
	//   27   49:aload_0         
	//   28   50:getfield        #145 <Field PdfContentByte$GraphicState state>
	//   29   53:fload_2         
	//   30   54:fneg            
	//   31   55:putfield        #1362 <Field float PdfContentByte$GraphicState.leading>
		if(isTagged() && state.xTLM != state.tx)
	//*  32   58:aload_0         
	//*  33   59:invokevirtual   #220 <Method boolean isTagged()>
	//*  34   62:ifeq            130
	//*  35   65:aload_0         
	//*  36   66:getfield        #145 <Field PdfContentByte$GraphicState state>
	//*  37   69:getfield        #1130 <Field float PdfContentByte$GraphicState.xTLM>
	//*  38   72:aload_0         
	//*  39   73:getfield        #145 <Field PdfContentByte$GraphicState state>
	//*  40   76:getfield        #1133 <Field float PdfContentByte$GraphicState.tx>
	//*  41   79:fcmpl           
	//*  42   80:ifeq            130
		{
			setTextMatrix(state.aTLM, state.bTLM, state.cTLM, state.dTLM, state.xTLM, state.yTLM);
	//   43   83:aload_0         
	//   44   84:aload_0         
	//   45   85:getfield        #145 <Field PdfContentByte$GraphicState state>
	//   46   88:getfield        #1136 <Field float PdfContentByte$GraphicState.aTLM>
	//   47   91:aload_0         
	//   48   92:getfield        #145 <Field PdfContentByte$GraphicState state>
	//   49   95:getfield        #1139 <Field float PdfContentByte$GraphicState.bTLM>
	//   50   98:aload_0         
	//   51   99:getfield        #145 <Field PdfContentByte$GraphicState state>
	//   52  102:getfield        #1142 <Field float PdfContentByte$GraphicState.cTLM>
	//   53  105:aload_0         
	//   54  106:getfield        #145 <Field PdfContentByte$GraphicState state>
	//   55  109:getfield        #1145 <Field float PdfContentByte$GraphicState.dTLM>
	//   56  112:aload_0         
	//   57  113:getfield        #145 <Field PdfContentByte$GraphicState state>
	//   58  116:getfield        #1130 <Field float PdfContentByte$GraphicState.xTLM>
	//   59  119:aload_0         
	//   60  120:getfield        #145 <Field PdfContentByte$GraphicState state>
	//   61  123:getfield        #1148 <Field float PdfContentByte$GraphicState.yTLM>
	//   62  126:invokevirtual   #703 <Method void setTextMatrix(float, float, float, float, float, float)>
			return;
	//   63  129:return          
		} else
		{
			content.append(f).append(' ').append(f1).append(" TD").append_i(separator);
	//   64  130:aload_0         
	//   65  131:getfield        #140 <Field ByteBuffer content>
	//   66  134:fload_1         
	//   67  135:invokevirtual   #178 <Method ByteBuffer ByteBuffer.append(float)>
	//   68  138:bipush          32
	//   69  140:invokevirtual   #181 <Method ByteBuffer ByteBuffer.append(char)>
	//   70  143:fload_2         
	//   71  144:invokevirtual   #178 <Method ByteBuffer ByteBuffer.append(float)>
	//   72  147:ldc2            #1394 <String " TD">
	//   73  150:invokevirtual   #278 <Method ByteBuffer ByteBuffer.append(String)>
	//   74  153:aload_0         
	//   75  154:getfield        #152 <Field int separator>
	//   76  157:invokevirtual   #296 <Method ByteBuffer ByteBuffer.append_i(int)>
	//   77  160:pop             
			return;
	//   78  161:return          
		}
	}

	public void moveTo(double d, double d1)
	{
label0:
		{
			if(inText)
	//*   0    0:aload_0         
	//*   1    1:getfield        #156 <Field boolean inText>
	//*   2    4:ifeq            18
			{
				if(!isTagged())
					break label0;
	//    3    7:aload_0         
	//    4    8:invokevirtual   #220 <Method boolean isTagged()>
	//    5   11:ifeq            50
				endText();
	//    6   14:aload_0         
	//    7   15:invokevirtual   #223 <Method void endText()>
			}
			content.append(d).append(' ').append(d1).append(" m").append_i(separator);
	//    8   18:aload_0         
	//    9   19:getfield        #140 <Field ByteBuffer content>
	//   10   22:dload_1         
	//   11   23:invokevirtual   #281 <Method ByteBuffer ByteBuffer.append(double)>
	//   12   26:bipush          32
	//   13   28:invokevirtual   #181 <Method ByteBuffer ByteBuffer.append(char)>
	//   14   31:dload_3         
	//   15   32:invokevirtual   #281 <Method ByteBuffer ByteBuffer.append(double)>
	//   16   35:ldc2            #1396 <String " m">
	//   17   38:invokevirtual   #278 <Method ByteBuffer ByteBuffer.append(String)>
	//   18   41:aload_0         
	//   19   42:getfield        #152 <Field int separator>
	//   20   45:invokevirtual   #296 <Method ByteBuffer ByteBuffer.append_i(int)>
	//   21   48:pop             
			return;
	//   22   49:return          
		}
		throw new IllegalPdfSyntaxException(MessageLocalization.getComposedMessage("path.construction.operator.inside.text.object", new Object[0]));
	//   23   50:new             #1122 <Class IllegalPdfSyntaxException>
	//   24   53:dup             
	//   25   54:ldc2            #1182 <String "path.construction.operator.inside.text.object">
	//   26   57:iconst_0        
	//   27   58:anewarray       Object[]
	//   28   61:invokestatic    #239 <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//   29   64:invokespecial   #1125 <Method void IllegalPdfSyntaxException(String)>
	//   30   67:athrow          
	}

	public void moveTo(float f, float f1)
	{
		moveTo(f, f1);
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:f2d             
	//    3    3:fload_2         
	//    4    4:f2d             
	//    5    5:invokevirtual   #1080 <Method void moveTo(double, double)>
	//    6    8:return          
	}

	public void newPath()
	{
label0:
		{
			if(inText)
	//*   0    0:aload_0         
	//*   1    1:getfield        #156 <Field boolean inText>
	//*   2    4:ifeq            18
			{
				if(!isTagged())
					break label0;
	//    3    7:aload_0         
	//    4    8:invokevirtual   #220 <Method boolean isTagged()>
	//    5   11:ifeq            37
				endText();
	//    6   14:aload_0         
	//    7   15:invokevirtual   #223 <Method void endText()>
			}
			content.append("n").append_i(separator);
	//    8   18:aload_0         
	//    9   19:getfield        #140 <Field ByteBuffer content>
	//   10   22:ldc2            #1399 <String "n">
	//   11   25:invokevirtual   #278 <Method ByteBuffer ByteBuffer.append(String)>
	//   12   28:aload_0         
	//   13   29:getfield        #152 <Field int separator>
	//   14   32:invokevirtual   #296 <Method ByteBuffer ByteBuffer.append_i(int)>
	//   15   35:pop             
			return;
	//   16   36:return          
		}
		throw new IllegalPdfSyntaxException(MessageLocalization.getComposedMessage("path.construction.operator.inside.text.object", new Object[0]));
	//   17   37:new             #1122 <Class IllegalPdfSyntaxException>
	//   18   40:dup             
	//   19   41:ldc2            #1182 <String "path.construction.operator.inside.text.object">
	//   20   44:iconst_0        
	//   21   45:anewarray       Object[]
	//   22   48:invokestatic    #239 <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//   23   51:invokespecial   #1125 <Method void IllegalPdfSyntaxException(String)>
	//   24   54:athrow          
	}

	public void newlineShowText(float f, float f1, String s)
	{
		checkState();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #1403 <Method void checkState()>
		if(!inText && isTagged())
	//*   2    4:aload_0         
	//*   3    5:getfield        #156 <Field boolean inText>
	//*   4    8:ifne            23
	//*   5   11:aload_0         
	//*   6   12:invokevirtual   #220 <Method boolean isTagged()>
	//*   7   15:ifeq            23
			beginText(true);
	//    8   18:aload_0         
	//    9   19:iconst_1        
	//   10   20:invokevirtual   #490 <Method void beginText(boolean)>
		GraphicState graphicstate = state;
	//   11   23:aload_0         
	//   12   24:getfield        #145 <Field PdfContentByte$GraphicState state>
	//   13   27:astore          4
		graphicstate.yTLM = graphicstate.yTLM - state.leading;
	//   14   29:aload           4
	//   15   31:aload           4
	//   16   33:getfield        #1148 <Field float PdfContentByte$GraphicState.yTLM>
	//   17   36:aload_0         
	//   18   37:getfield        #145 <Field PdfContentByte$GraphicState state>
	//   19   40:getfield        #1362 <Field float PdfContentByte$GraphicState.leading>
	//   20   43:fsub            
	//   21   44:putfield        #1148 <Field float PdfContentByte$GraphicState.yTLM>
		content.append(f).append(' ').append(f1);
	//   22   47:aload_0         
	//   23   48:getfield        #140 <Field ByteBuffer content>
	//   24   51:fload_1         
	//   25   52:invokevirtual   #178 <Method ByteBuffer ByteBuffer.append(float)>
	//   26   55:bipush          32
	//   27   57:invokevirtual   #181 <Method ByteBuffer ByteBuffer.append(char)>
	//   28   60:fload_2         
	//   29   61:invokevirtual   #178 <Method ByteBuffer ByteBuffer.append(float)>
	//   30   64:pop             
		showText2(s);
	//   31   65:aload_0         
	//   32   66:aload_3         
	//   33   67:invokespecial   #1405 <Method void showText2(String)>
		content.append("\"").append_i(separator);
	//   34   70:aload_0         
	//   35   71:getfield        #140 <Field ByteBuffer content>
	//   36   74:ldc2            #1407 <String "\"">
	//   37   77:invokevirtual   #278 <Method ByteBuffer ByteBuffer.append(String)>
	//   38   80:aload_0         
	//   39   81:getfield        #152 <Field int separator>
	//   40   84:invokevirtual   #296 <Method ByteBuffer ByteBuffer.append_i(int)>
	//   41   87:pop             
		state.charSpace = f1;
	//   42   88:aload_0         
	//   43   89:getfield        #145 <Field PdfContentByte$GraphicState state>
	//   44   92:fload_2         
	//   45   93:putfield        #530 <Field float PdfContentByte$GraphicState.charSpace>
		state.wordSpace = f;
	//   46   96:aload_0         
	//   47   97:getfield        #145 <Field PdfContentByte$GraphicState state>
	//   48  100:fload_1         
	//   49  101:putfield        #538 <Field float PdfContentByte$GraphicState.wordSpace>
		state.tx = state.xTLM;
	//   50  104:aload_0         
	//   51  105:getfield        #145 <Field PdfContentByte$GraphicState state>
	//   52  108:aload_0         
	//   53  109:getfield        #145 <Field PdfContentByte$GraphicState state>
	//   54  112:getfield        #1130 <Field float PdfContentByte$GraphicState.xTLM>
	//   55  115:putfield        #1133 <Field float PdfContentByte$GraphicState.tx>
		updateTx(s, 0.0F);
	//   56  118:aload_0         
	//   57  119:aload_3         
	//   58  120:fconst_0        
	//   59  121:invokevirtual   #1411 <Method void updateTx(String, float)>
	//   60  124:return          
	}

	public void newlineShowText(String s)
	{
		checkState();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #1403 <Method void checkState()>
		if(!inText && isTagged())
	//*   2    4:aload_0         
	//*   3    5:getfield        #156 <Field boolean inText>
	//*   4    8:ifne            23
	//*   5   11:aload_0         
	//*   6   12:invokevirtual   #220 <Method boolean isTagged()>
	//*   7   15:ifeq            23
			beginText(true);
	//    8   18:aload_0         
	//    9   19:iconst_1        
	//   10   20:invokevirtual   #490 <Method void beginText(boolean)>
		GraphicState graphicstate = state;
	//   11   23:aload_0         
	//   12   24:getfield        #145 <Field PdfContentByte$GraphicState state>
	//   13   27:astore_2        
		graphicstate.yTLM = graphicstate.yTLM - state.leading;
	//   14   28:aload_2         
	//   15   29:aload_2         
	//   16   30:getfield        #1148 <Field float PdfContentByte$GraphicState.yTLM>
	//   17   33:aload_0         
	//   18   34:getfield        #145 <Field PdfContentByte$GraphicState state>
	//   19   37:getfield        #1362 <Field float PdfContentByte$GraphicState.leading>
	//   20   40:fsub            
	//   21   41:putfield        #1148 <Field float PdfContentByte$GraphicState.yTLM>
		showText2(s);
	//   22   44:aload_0         
	//   23   45:aload_1         
	//   24   46:invokespecial   #1405 <Method void showText2(String)>
		content.append("'").append_i(separator);
	//   25   49:aload_0         
	//   26   50:getfield        #140 <Field ByteBuffer content>
	//   27   53:ldc2            #1413 <String "'">
	//   28   56:invokevirtual   #278 <Method ByteBuffer ByteBuffer.append(String)>
	//   29   59:aload_0         
	//   30   60:getfield        #152 <Field int separator>
	//   31   63:invokevirtual   #296 <Method ByteBuffer ByteBuffer.append_i(int)>
	//   32   66:pop             
		state.tx = state.xTLM;
	//   33   67:aload_0         
	//   34   68:getfield        #145 <Field PdfContentByte$GraphicState state>
	//   35   71:aload_0         
	//   36   72:getfield        #145 <Field PdfContentByte$GraphicState state>
	//   37   75:getfield        #1130 <Field float PdfContentByte$GraphicState.xTLM>
	//   38   78:putfield        #1133 <Field float PdfContentByte$GraphicState.tx>
		updateTx(s, 0.0F);
	//   39   81:aload_0         
	//   40   82:aload_1         
	//   41   83:fconst_0        
	//   42   84:invokevirtual   #1411 <Method void updateTx(String, float)>
	//   43   87:return          
	}

	public void newlineText()
	{
		if(!inText && isTagged())
	//*   0    0:aload_0         
	//*   1    1:getfield        #156 <Field boolean inText>
	//*   2    4:ifne            19
	//*   3    7:aload_0         
	//*   4    8:invokevirtual   #220 <Method boolean isTagged()>
	//*   5   11:ifeq            19
			beginText(true);
	//    6   14:aload_0         
	//    7   15:iconst_1        
	//    8   16:invokevirtual   #490 <Method void beginText(boolean)>
		if(isTagged() && state.xTLM != state.tx)
	//*   9   19:aload_0         
	//*  10   20:invokevirtual   #220 <Method boolean isTagged()>
	//*  11   23:ifeq            90
	//*  12   26:aload_0         
	//*  13   27:getfield        #145 <Field PdfContentByte$GraphicState state>
	//*  14   30:getfield        #1130 <Field float PdfContentByte$GraphicState.xTLM>
	//*  15   33:aload_0         
	//*  16   34:getfield        #145 <Field PdfContentByte$GraphicState state>
	//*  17   37:getfield        #1133 <Field float PdfContentByte$GraphicState.tx>
	//*  18   40:fcmpl           
	//*  19   41:ifeq            90
			setTextMatrix(state.aTLM, state.bTLM, state.cTLM, state.dTLM, state.xTLM, state.yTLM);
	//   20   44:aload_0         
	//   21   45:aload_0         
	//   22   46:getfield        #145 <Field PdfContentByte$GraphicState state>
	//   23   49:getfield        #1136 <Field float PdfContentByte$GraphicState.aTLM>
	//   24   52:aload_0         
	//   25   53:getfield        #145 <Field PdfContentByte$GraphicState state>
	//   26   56:getfield        #1139 <Field float PdfContentByte$GraphicState.bTLM>
	//   27   59:aload_0         
	//   28   60:getfield        #145 <Field PdfContentByte$GraphicState state>
	//   29   63:getfield        #1142 <Field float PdfContentByte$GraphicState.cTLM>
	//   30   66:aload_0         
	//   31   67:getfield        #145 <Field PdfContentByte$GraphicState state>
	//   32   70:getfield        #1145 <Field float PdfContentByte$GraphicState.dTLM>
	//   33   73:aload_0         
	//   34   74:getfield        #145 <Field PdfContentByte$GraphicState state>
	//   35   77:getfield        #1130 <Field float PdfContentByte$GraphicState.xTLM>
	//   36   80:aload_0         
	//   37   81:getfield        #145 <Field PdfContentByte$GraphicState state>
	//   38   84:getfield        #1148 <Field float PdfContentByte$GraphicState.yTLM>
	//   39   87:invokevirtual   #703 <Method void setTextMatrix(float, float, float, float, float, float)>
		GraphicState graphicstate = state;
	//   40   90:aload_0         
	//   41   91:getfield        #145 <Field PdfContentByte$GraphicState state>
	//   42   94:astore_1        
		graphicstate.yTLM = graphicstate.yTLM - state.leading;
	//   43   95:aload_1         
	//   44   96:aload_1         
	//   45   97:getfield        #1148 <Field float PdfContentByte$GraphicState.yTLM>
	//   46  100:aload_0         
	//   47  101:getfield        #145 <Field PdfContentByte$GraphicState state>
	//   48  104:getfield        #1362 <Field float PdfContentByte$GraphicState.leading>
	//   49  107:fsub            
	//   50  108:putfield        #1148 <Field float PdfContentByte$GraphicState.yTLM>
		content.append("T*").append_i(separator);
	//   51  111:aload_0         
	//   52  112:getfield        #140 <Field ByteBuffer content>
	//   53  115:ldc2            #1416 <String "T*">
	//   54  118:invokevirtual   #278 <Method ByteBuffer ByteBuffer.append(String)>
	//   55  121:aload_0         
	//   56  122:getfield        #152 <Field int separator>
	//   57  125:invokevirtual   #296 <Method ByteBuffer ByteBuffer.append_i(int)>
	//   58  128:pop             
	//   59  129:return          
	}

	public void openMCBlock(IAccessibleElement iaccessibleelement)
	{
		if(isTagged())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #220 <Method boolean isTagged()>
	//*   2    4:ifeq            59
		{
			ensureDocumentTagIsOpen();
	//    3    7:aload_0         
	//    4    8:invokespecial   #256 <Method void ensureDocumentTagIsOpen()>
			if(iaccessibleelement != null && !getMcElements().contains(((Object) (iaccessibleelement))))
	//*   5   11:aload_1         
	//*   6   12:ifnull          59
	//*   7   15:aload_0         
	//*   8   16:invokevirtual   #260 <Method ArrayList getMcElements()>
	//*   9   19:aload_1         
	//*  10   20:invokevirtual   #1172 <Method boolean ArrayList.contains(Object)>
	//*  11   23:ifne            59
			{
				PdfStructureElement pdfstructureelement = openMCBlockInt(iaccessibleelement);
	//   12   26:aload_0         
	//   13   27:aload_1         
	//   14   28:invokespecial   #1418 <Method PdfStructureElement openMCBlockInt(IAccessibleElement)>
	//   15   31:astore_2        
				getMcElements().add(((Object) (iaccessibleelement)));
	//   16   32:aload_0         
	//   17   33:invokevirtual   #260 <Method ArrayList getMcElements()>
	//   18   36:aload_1         
	//   19   37:invokevirtual   #273 <Method boolean ArrayList.add(Object)>
	//   20   40:pop             
				if(pdfstructureelement != null)
	//*  21   41:aload_2         
	//*  22   42:ifnull          59
					pdf.saveStructElement(iaccessibleelement.getId(), pdfstructureelement);
	//   23   45:aload_0         
	//   24   46:getfield        #172 <Field PdfDocument pdf>
	//   25   49:aload_1         
	//   26   50:invokeinterface #473 <Method com.itextpdf.text.AccessibleElementId IAccessibleElement.getId()>
	//   27   55:aload_2         
	//   28   56:invokevirtual   #1422 <Method void PdfDocument.saveStructElement(com.itextpdf.text.AccessibleElementId, PdfStructureElement)>
			}
		}
	//   29   59:return          
	}

	void outputColorNumbers(BaseColor basecolor, float f)
	{
		PdfWriter.checkPdfIsoConformance(writer, 1, ((Object) (basecolor)));
	//    0    0:aload_0         
	//    1    1:getfield        #164 <Field PdfWriter writer>
	//    2    4:iconst_1        
	//    3    5:aload_1         
	//    4    6:invokestatic    #196 <Method void PdfWriter.checkPdfIsoConformance(PdfWriter, int, Object)>
		switch(ExtendedColor.getType(basecolor))
	//*   5    9:aload_1         
	//*   6   10:invokestatic    #1427 <Method int ExtendedColor.getType(BaseColor)>
		{
	//*   7   13:tableswitch     0 3: default 44
	//	               0 62
	//	               1 134
	//	               2 150
	//	               3 209
		default:
			throw new RuntimeException(MessageLocalization.getComposedMessage("invalid.color.type", new Object[0]));
	//    8   44:new             #231 <Class RuntimeException>
	//    9   47:dup             
	//   10   48:ldc2            #1429 <String "invalid.color.type">
	//   11   51:iconst_0        
	//   12   52:anewarray       Object[]
	//   13   55:invokestatic    #239 <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//   14   58:invokespecial   #242 <Method void RuntimeException(String)>
	//   15   61:athrow          

		case 0: // '\0'
			content.append((float)basecolor.getRed() / 255F);
	//   16   62:aload_0         
	//   17   63:getfield        #140 <Field ByteBuffer content>
	//   18   66:aload_1         
	//   19   67:invokevirtual   #1432 <Method int BaseColor.getRed()>
	//   20   70:i2f             
	//   21   71:ldc2            #1433 <Float 255F>
	//   22   74:fdiv            
	//   23   75:invokevirtual   #178 <Method ByteBuffer ByteBuffer.append(float)>
	//   24   78:pop             
			content.append(' ');
	//   25   79:aload_0         
	//   26   80:getfield        #140 <Field ByteBuffer content>
	//   27   83:bipush          32
	//   28   85:invokevirtual   #181 <Method ByteBuffer ByteBuffer.append(char)>
	//   29   88:pop             
			content.append((float)basecolor.getGreen() / 255F);
	//   30   89:aload_0         
	//   31   90:getfield        #140 <Field ByteBuffer content>
	//   32   93:aload_1         
	//   33   94:invokevirtual   #1436 <Method int BaseColor.getGreen()>
	//   34   97:i2f             
	//   35   98:ldc2            #1433 <Float 255F>
	//   36  101:fdiv            
	//   37  102:invokevirtual   #178 <Method ByteBuffer ByteBuffer.append(float)>
	//   38  105:pop             
			content.append(' ');
	//   39  106:aload_0         
	//   40  107:getfield        #140 <Field ByteBuffer content>
	//   41  110:bipush          32
	//   42  112:invokevirtual   #181 <Method ByteBuffer ByteBuffer.append(char)>
	//   43  115:pop             
			content.append((float)basecolor.getBlue() / 255F);
	//   44  116:aload_0         
	//   45  117:getfield        #140 <Field ByteBuffer content>
	//   46  120:aload_1         
	//   47  121:invokevirtual   #1439 <Method int BaseColor.getBlue()>
	//   48  124:i2f             
	//   49  125:ldc2            #1433 <Float 255F>
	//   50  128:fdiv            
	//   51  129:invokevirtual   #178 <Method ByteBuffer ByteBuffer.append(float)>
	//   52  132:pop             
			return;
	//   53  133:return          

		case 1: // '\001'
			content.append(((GrayColor)basecolor).getGray());
	//   54  134:aload_0         
	//   55  135:getfield        #140 <Field ByteBuffer content>
	//   56  138:aload_1         
	//   57  139:checkcast       #1441 <Class GrayColor>
	//   58  142:invokevirtual   #1444 <Method float GrayColor.getGray()>
	//   59  145:invokevirtual   #178 <Method ByteBuffer ByteBuffer.append(float)>
	//   60  148:pop             
			return;
	//   61  149:return          

		case 2: // '\002'
			basecolor = ((BaseColor) ((CMYKColor)basecolor));
	//   62  150:aload_1         
	//   63  151:checkcast       #1446 <Class CMYKColor>
	//   64  154:astore_1        
			content.append(((CMYKColor) (basecolor)).getCyan()).append(' ').append(((CMYKColor) (basecolor)).getMagenta());
	//   65  155:aload_0         
	//   66  156:getfield        #140 <Field ByteBuffer content>
	//   67  159:aload_1         
	//   68  160:invokevirtual   #1449 <Method float CMYKColor.getCyan()>
	//   69  163:invokevirtual   #178 <Method ByteBuffer ByteBuffer.append(float)>
	//   70  166:bipush          32
	//   71  168:invokevirtual   #181 <Method ByteBuffer ByteBuffer.append(char)>
	//   72  171:aload_1         
	//   73  172:invokevirtual   #1452 <Method float CMYKColor.getMagenta()>
	//   74  175:invokevirtual   #178 <Method ByteBuffer ByteBuffer.append(float)>
	//   75  178:pop             
			content.append(' ').append(((CMYKColor) (basecolor)).getYellow()).append(' ').append(((CMYKColor) (basecolor)).getBlack());
	//   76  179:aload_0         
	//   77  180:getfield        #140 <Field ByteBuffer content>
	//   78  183:bipush          32
	//   79  185:invokevirtual   #181 <Method ByteBuffer ByteBuffer.append(char)>
	//   80  188:aload_1         
	//   81  189:invokevirtual   #1455 <Method float CMYKColor.getYellow()>
	//   82  192:invokevirtual   #178 <Method ByteBuffer ByteBuffer.append(float)>
	//   83  195:bipush          32
	//   84  197:invokevirtual   #181 <Method ByteBuffer ByteBuffer.append(char)>
	//   85  200:aload_1         
	//   86  201:invokevirtual   #1458 <Method float CMYKColor.getBlack()>
	//   87  204:invokevirtual   #178 <Method ByteBuffer ByteBuffer.append(float)>
	//   88  207:pop             
			return;
	//   89  208:return          

		case 3: // '\003'
			content.append(f);
	//   90  209:aload_0         
	//   91  210:getfield        #140 <Field ByteBuffer content>
	//   92  213:fload_2         
	//   93  214:invokevirtual   #178 <Method ByteBuffer ByteBuffer.append(float)>
	//   94  217:pop             
			break;
		}
	//   95  218:return          
	}

	public void paintShading(PdfShading pdfshading)
	{
		writer.addSimpleShading(pdfshading);
	//    0    0:aload_0         
	//    1    1:getfield        #164 <Field PdfWriter writer>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #1463 <Method void PdfWriter.addSimpleShading(PdfShading)>
		PageResources pageresources = getPageResources();
	//    4    8:aload_0         
	//    5    9:invokevirtual   #204 <Method PageResources getPageResources()>
	//    6   12:astore_2        
		PdfName pdfname = pageresources.addShading(pdfshading.getShadingName(), pdfshading.getShadingReference());
	//    7   13:aload_2         
	//    8   14:aload_1         
	//    9   15:invokevirtual   #1468 <Method PdfName PdfShading.getShadingName()>
	//   10   18:aload_1         
	//   11   19:invokevirtual   #1471 <Method PdfIndirectReference PdfShading.getShadingReference()>
	//   12   22:invokevirtual   #1474 <Method PdfName PageResources.addShading(PdfName, PdfIndirectReference)>
	//   13   25:astore_3        
		content.append(pdfname.getBytes()).append(" sh").append_i(separator);
	//   14   26:aload_0         
	//   15   27:getfield        #140 <Field ByteBuffer content>
	//   16   30:aload_3         
	//   17   31:invokevirtual   #287 <Method byte[] PdfName.getBytes()>
	//   18   34:invokevirtual   #290 <Method ByteBuffer ByteBuffer.append(byte[])>
	//   19   37:ldc2            #1476 <String " sh">
	//   20   40:invokevirtual   #278 <Method ByteBuffer ByteBuffer.append(String)>
	//   21   43:aload_0         
	//   22   44:getfield        #152 <Field int separator>
	//   23   47:invokevirtual   #296 <Method ByteBuffer ByteBuffer.append_i(int)>
	//   24   50:pop             
		pdfshading = ((PdfShading) (pdfshading.getColorDetails()));
	//   25   51:aload_1         
	//   26   52:invokevirtual   #1480 <Method ColorDetails PdfShading.getColorDetails()>
	//   27   55:astore_1        
		if(pdfshading != null)
	//*  28   56:aload_1         
	//*  29   57:ifnull          73
			pageresources.addColor(((ColorDetails) (pdfshading)).getColorSpaceName(), ((ColorDetails) (pdfshading)).getIndirectReference());
	//   30   60:aload_2         
	//   31   61:aload_1         
	//   32   62:invokevirtual   #1485 <Method PdfName ColorDetails.getColorSpaceName()>
	//   33   65:aload_1         
	//   34   66:invokevirtual   #1486 <Method PdfIndirectReference ColorDetails.getIndirectReference()>
	//   35   69:invokevirtual   #947 <Method PdfName PageResources.addColor(PdfName, PdfIndirectReference)>
	//   36   72:pop             
	//   37   73:return          
	}

	public void paintShading(PdfShadingPattern pdfshadingpattern)
	{
		paintShading(pdfshadingpattern.getShading());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #1493 <Method PdfShading PdfShadingPattern.getShading()>
	//    3    5:invokevirtual   #1495 <Method void paintShading(PdfShading)>
	//    4    8:return          
	}

	public void rectangle(double d, double d1, double d2, double d3)
	{
label0:
		{
			if(inText)
	//*   0    0:aload_0         
	//*   1    1:getfield        #156 <Field boolean inText>
	//*   2    4:ifeq            18
			{
				if(!isTagged())
					break label0;
	//    3    7:aload_0         
	//    4    8:invokevirtual   #220 <Method boolean isTagged()>
	//    5   11:ifeq            70
				endText();
	//    6   14:aload_0         
	//    7   15:invokevirtual   #223 <Method void endText()>
			}
			content.append(d).append(' ').append(d1).append(' ').append(d2).append(' ').append(d3).append(" re").append_i(separator);
	//    8   18:aload_0         
	//    9   19:getfield        #140 <Field ByteBuffer content>
	//   10   22:dload_1         
	//   11   23:invokevirtual   #281 <Method ByteBuffer ByteBuffer.append(double)>
	//   12   26:bipush          32
	//   13   28:invokevirtual   #181 <Method ByteBuffer ByteBuffer.append(char)>
	//   14   31:dload_3         
	//   15   32:invokevirtual   #281 <Method ByteBuffer ByteBuffer.append(double)>
	//   16   35:bipush          32
	//   17   37:invokevirtual   #181 <Method ByteBuffer ByteBuffer.append(char)>
	//   18   40:dload           5
	//   19   42:invokevirtual   #281 <Method ByteBuffer ByteBuffer.append(double)>
	//   20   45:bipush          32
	//   21   47:invokevirtual   #181 <Method ByteBuffer ByteBuffer.append(char)>
	//   22   50:dload           7
	//   23   52:invokevirtual   #281 <Method ByteBuffer ByteBuffer.append(double)>
	//   24   55:ldc2            #1497 <String " re">
	//   25   58:invokevirtual   #278 <Method ByteBuffer ByteBuffer.append(String)>
	//   26   61:aload_0         
	//   27   62:getfield        #152 <Field int separator>
	//   28   65:invokevirtual   #296 <Method ByteBuffer ByteBuffer.append_i(int)>
	//   29   68:pop             
			return;
	//   30   69:return          
		}
		throw new IllegalPdfSyntaxException(MessageLocalization.getComposedMessage("path.construction.operator.inside.text.object", new Object[0]));
	//   31   70:new             #1122 <Class IllegalPdfSyntaxException>
	//   32   73:dup             
	//   33   74:ldc2            #1182 <String "path.construction.operator.inside.text.object">
	//   34   77:iconst_0        
	//   35   78:anewarray       Object[]
	//   36   81:invokestatic    #239 <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//   37   84:invokespecial   #1125 <Method void IllegalPdfSyntaxException(String)>
	//   38   87:athrow          
	}

	public void rectangle(float f, float f1, float f2, float f3)
	{
		rectangle(f, f1, f2, f3);
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:f2d             
	//    3    3:fload_2         
	//    4    4:f2d             
	//    5    5:fload_3         
	//    6    6:f2d             
	//    7    7:fload           4
	//    8    9:f2d             
	//    9   10:invokevirtual   #1275 <Method void rectangle(double, double, double, double)>
	//   10   13:return          
	}

	public void rectangle(Rectangle rectangle1)
	{
		float f;
		float f1;
		float f2;
		float f3;
		f = rectangle1.getLeft();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #1500 <Method float Rectangle.getLeft()>
	//    2    4:fstore_2        
		f1 = rectangle1.getBottom();
	//    3    5:aload_1         
	//    4    6:invokevirtual   #1503 <Method float Rectangle.getBottom()>
	//    5    9:fstore_3        
		f2 = rectangle1.getRight();
	//    6   10:aload_1         
	//    7   11:invokevirtual   #1506 <Method float Rectangle.getRight()>
	//    8   14:fstore          4
		f3 = rectangle1.getTop();
	//    9   16:aload_1         
	//   10   17:invokevirtual   #1509 <Method float Rectangle.getTop()>
	//   11   20:fstore          5
		BaseColor basecolor = rectangle1.getBackgroundColor();
	//   12   22:aload_1         
	//   13   23:invokevirtual   #1513 <Method BaseColor Rectangle.getBackgroundColor()>
	//   14   26:astore          6
		if(basecolor != null)
	//*  15   28:aload           6
	//*  16   30:ifnull          65
		{
			saveState();
	//   17   33:aload_0         
	//   18   34:invokevirtual   #870 <Method void saveState()>
			setColorFill(basecolor);
	//   19   37:aload_0         
	//   20   38:aload           6
	//   21   40:invokevirtual   #1281 <Method void setColorFill(BaseColor)>
			rectangle(f, f1, f2 - f, f3 - f1);
	//   22   43:aload_0         
	//   23   44:fload_2         
	//   24   45:fload_3         
	//   25   46:fload           4
	//   26   48:fload_2         
	//   27   49:fsub            
	//   28   50:fload           5
	//   29   52:fload_3         
	//   30   53:fsub            
	//   31   54:invokevirtual   #1515 <Method void rectangle(float, float, float, float)>
			fill();
	//   32   57:aload_0         
	//   33   58:invokevirtual   #1286 <Method void fill()>
			restoreState();
	//   34   61:aload_0         
	//   35   62:invokevirtual   #882 <Method void restoreState()>
		}
		if(rectangle1.hasBorders()) goto _L2; else goto _L1
	//   36   65:aload_1         
	//   37   66:invokevirtual   #1516 <Method boolean Rectangle.hasBorders()>
	//   38   69:ifne            73
_L1:
		return;
	//   39   72:return          
_L2:
		BaseColor basecolor1;
		if(rectangle1.isUseVariableBorders())
	//*  40   73:aload_1         
	//*  41   74:invokevirtual   #1519 <Method boolean Rectangle.isUseVariableBorders()>
	//*  42   77:ifeq            86
		{
			variableRectangle(rectangle1);
	//   43   80:aload_0         
	//   44   81:aload_1         
	//   45   82:invokevirtual   #1522 <Method void variableRectangle(Rectangle)>
			return;
	//   46   85:return          
		}
		if(rectangle1.getBorderWidth() != -1F)
	//*  47   86:aload_1         
	//*  48   87:invokevirtual   #1525 <Method float Rectangle.getBorderWidth()>
	//*  49   90:ldc2            #1526 <Float -1F>
	//*  50   93:fcmpl           
	//*  51   94:ifeq            105
			setLineWidth(rectangle1.getBorderWidth());
	//   52   97:aload_0         
	//   53   98:aload_1         
	//   54   99:invokevirtual   #1525 <Method float Rectangle.getBorderWidth()>
	//   55  102:invokevirtual   #1270 <Method void setLineWidth(float)>
		basecolor1 = rectangle1.getBorderColor();
	//   56  105:aload_1         
	//   57  106:invokevirtual   #1529 <Method BaseColor Rectangle.getBorderColor()>
	//   58  109:astore          6
		if(basecolor1 != null)
	//*  59  111:aload           6
	//*  60  113:ifnull          122
			setColorStroke(basecolor1);
	//   61  116:aload_0         
	//   62  117:aload           6
	//   63  119:invokevirtual   #1267 <Method void setColorStroke(BaseColor)>
		if(!rectangle1.hasBorder(15))
			break; /* Loop/switch isn't completed */
	//   64  122:aload_1         
	//   65  123:bipush          15
	//   66  125:invokevirtual   #1533 <Method boolean Rectangle.hasBorder(int)>
	//   67  128:ifeq            159
		rectangle(f, f1, f2 - f, f3 - f1);
	//   68  131:aload_0         
	//   69  132:fload_2         
	//   70  133:fload_3         
	//   71  134:fload           4
	//   72  136:fload_2         
	//   73  137:fsub            
	//   74  138:fload           5
	//   75  140:fload_3         
	//   76  141:fsub            
	//   77  142:invokevirtual   #1515 <Method void rectangle(float, float, float, float)>
_L4:
		stroke();
	//   78  145:aload_0         
	//   79  146:invokevirtual   #1278 <Method void stroke()>
		if(basecolor1 != null)
	//*  80  149:aload           6
	//*  81  151:ifnull          72
		{
			resetRGBColorStroke();
	//   82  154:aload_0         
	//   83  155:invokevirtual   #1536 <Method void resetRGBColorStroke()>
			return;
	//   84  158:return          
		}
		if(true) goto _L1; else goto _L3
_L3:
		if(rectangle1.hasBorder(8))
	//*  85  159:aload_1         
	//*  86  160:bipush          8
	//*  87  162:invokevirtual   #1533 <Method boolean Rectangle.hasBorder(int)>
	//*  88  165:ifeq            183
		{
			moveTo(f2, f1);
	//   89  168:aload_0         
	//   90  169:fload           4
	//   91  171:fload_3         
	//   92  172:invokevirtual   #1538 <Method void moveTo(float, float)>
			lineTo(f2, f3);
	//   93  175:aload_0         
	//   94  176:fload           4
	//   95  178:fload           5
	//   96  180:invokevirtual   #1540 <Method void lineTo(float, float)>
		}
		if(rectangle1.hasBorder(4))
	//*  97  183:aload_1         
	//*  98  184:iconst_4        
	//*  99  185:invokevirtual   #1533 <Method boolean Rectangle.hasBorder(int)>
	//* 100  188:ifeq            204
		{
			moveTo(f, f1);
	//  101  191:aload_0         
	//  102  192:fload_2         
	//  103  193:fload_3         
	//  104  194:invokevirtual   #1538 <Method void moveTo(float, float)>
			lineTo(f, f3);
	//  105  197:aload_0         
	//  106  198:fload_2         
	//  107  199:fload           5
	//  108  201:invokevirtual   #1540 <Method void lineTo(float, float)>
		}
		if(rectangle1.hasBorder(2))
	//* 109  204:aload_1         
	//* 110  205:iconst_2        
	//* 111  206:invokevirtual   #1533 <Method boolean Rectangle.hasBorder(int)>
	//* 112  209:ifeq            225
		{
			moveTo(f, f1);
	//  113  212:aload_0         
	//  114  213:fload_2         
	//  115  214:fload_3         
	//  116  215:invokevirtual   #1538 <Method void moveTo(float, float)>
			lineTo(f2, f1);
	//  117  218:aload_0         
	//  118  219:fload           4
	//  119  221:fload_3         
	//  120  222:invokevirtual   #1540 <Method void lineTo(float, float)>
		}
		if(rectangle1.hasBorder(1))
	//* 121  225:aload_1         
	//* 122  226:iconst_1        
	//* 123  227:invokevirtual   #1533 <Method boolean Rectangle.hasBorder(int)>
	//* 124  230:ifeq            145
		{
			moveTo(f, f3);
	//  125  233:aload_0         
	//  126  234:fload_2         
	//  127  235:fload           5
	//  128  237:invokevirtual   #1538 <Method void moveTo(float, float)>
			lineTo(f2, f3);
	//  129  240:aload_0         
	//  130  241:fload           4
	//  131  243:fload           5
	//  132  245:invokevirtual   #1540 <Method void lineTo(float, float)>
		}
		  goto _L4
		if(true) goto _L1; else goto _L5
_L5:
	//* 133  248:goto            145
	}

	public void remoteGoto(String s, int i, float f, float f1, float f2, float f3)
	{
		pdf.remoteGoto(s, i, f, f1, f2, f3);
	//    0    0:aload_0         
	//    1    1:getfield        #172 <Field PdfDocument pdf>
	//    2    4:aload_1         
	//    3    5:iload_2         
	//    4    6:fload_3         
	//    5    7:fload           4
	//    6    9:fload           5
	//    7   11:fload           6
	//    8   13:invokevirtual   #1544 <Method void PdfDocument.remoteGoto(String, int, float, float, float, float)>
	//    9   16:return          
	}

	public void remoteGoto(String s, String s1, float f, float f1, float f2, float f3)
	{
		pdf.remoteGoto(s, s1, f, f1, f2, f3);
	//    0    0:aload_0         
	//    1    1:getfield        #172 <Field PdfDocument pdf>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:fload_3         
	//    5    7:fload           4
	//    6    9:fload           5
	//    7   11:fload           6
	//    8   13:invokevirtual   #1547 <Method void PdfDocument.remoteGoto(String, String, float, float, float, float)>
	//    9   16:return          
	}

	public void reset()
	{
		reset(true);
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:invokevirtual   #1550 <Method void reset(boolean)>
	//    3    5:return          
	}

	public void reset(boolean flag)
	{
		content.reset();
	//    0    0:aload_0         
	//    1    1:getfield        #140 <Field ByteBuffer content>
	//    2    4:invokevirtual   #1552 <Method void ByteBuffer.reset()>
		markedContentSize = 0;
	//    3    7:aload_0         
	//    4    8:iconst_0        
	//    5    9:putfield        #142 <Field int markedContentSize>
		if(flag)
	//*   6   12:iload_1         
	//*   7   13:ifeq            20
			sanityCheck();
	//    8   16:aload_0         
	//    9   17:invokevirtual   #1555 <Method void sanityCheck()>
		state = new GraphicState();
	//   10   20:aload_0         
	//   11   21:new             #6   <Class PdfContentByte$GraphicState>
	//   12   24:dup             
	//   13   25:invokespecial   #143 <Method void PdfContentByte$GraphicState()>
	//   14   28:putfield        #145 <Field PdfContentByte$GraphicState state>
		stateList = new ArrayList();
	//   15   31:aload_0         
	//   16   32:new             #147 <Class ArrayList>
	//   17   35:dup             
	//   18   36:invokespecial   #148 <Method void ArrayList()>
	//   19   39:putfield        #150 <Field ArrayList stateList>
	//   20   42:return          
	}

	public void resetCMYKColorFill()
	{
		saveColor(((BaseColor) (new CMYKColor(0, 0, 0, 1))), true);
	//    0    0:aload_0         
	//    1    1:new             #1446 <Class CMYKColor>
	//    2    4:dup             
	//    3    5:iconst_0        
	//    4    6:iconst_0        
	//    5    7:iconst_0        
	//    6    8:iconst_1        
	//    7    9:invokespecial   #1559 <Method void CMYKColor(int, int, int, int)>
	//    8   12:iconst_1        
	//    9   13:invokespecial   #1561 <Method void saveColor(BaseColor, boolean)>
		content.append("0 0 0 1 k").append_i(separator);
	//   10   16:aload_0         
	//   11   17:getfield        #140 <Field ByteBuffer content>
	//   12   20:ldc2            #1563 <String "0 0 0 1 k">
	//   13   23:invokevirtual   #278 <Method ByteBuffer ByteBuffer.append(String)>
	//   14   26:aload_0         
	//   15   27:getfield        #152 <Field int separator>
	//   16   30:invokevirtual   #296 <Method ByteBuffer ByteBuffer.append_i(int)>
	//   17   33:pop             
	//   18   34:return          
	}

	public void resetCMYKColorStroke()
	{
		saveColor(((BaseColor) (new CMYKColor(0, 0, 0, 1))), false);
	//    0    0:aload_0         
	//    1    1:new             #1446 <Class CMYKColor>
	//    2    4:dup             
	//    3    5:iconst_0        
	//    4    6:iconst_0        
	//    5    7:iconst_0        
	//    6    8:iconst_1        
	//    7    9:invokespecial   #1559 <Method void CMYKColor(int, int, int, int)>
	//    8   12:iconst_0        
	//    9   13:invokespecial   #1561 <Method void saveColor(BaseColor, boolean)>
		content.append("0 0 0 1 K").append_i(separator);
	//   10   16:aload_0         
	//   11   17:getfield        #140 <Field ByteBuffer content>
	//   12   20:ldc2            #1566 <String "0 0 0 1 K">
	//   13   23:invokevirtual   #278 <Method ByteBuffer ByteBuffer.append(String)>
	//   14   26:aload_0         
	//   15   27:getfield        #152 <Field int separator>
	//   16   30:invokevirtual   #296 <Method ByteBuffer ByteBuffer.append_i(int)>
	//   17   33:pop             
	//   18   34:return          
	}

	public void resetGrayFill()
	{
		saveColor(((BaseColor) (new GrayColor(0))), true);
	//    0    0:aload_0         
	//    1    1:new             #1441 <Class GrayColor>
	//    2    4:dup             
	//    3    5:iconst_0        
	//    4    6:invokespecial   #1568 <Method void GrayColor(int)>
	//    5    9:iconst_1        
	//    6   10:invokespecial   #1561 <Method void saveColor(BaseColor, boolean)>
		content.append("0 g").append_i(separator);
	//    7   13:aload_0         
	//    8   14:getfield        #140 <Field ByteBuffer content>
	//    9   17:ldc2            #1570 <String "0 g">
	//   10   20:invokevirtual   #278 <Method ByteBuffer ByteBuffer.append(String)>
	//   11   23:aload_0         
	//   12   24:getfield        #152 <Field int separator>
	//   13   27:invokevirtual   #296 <Method ByteBuffer ByteBuffer.append_i(int)>
	//   14   30:pop             
	//   15   31:return          
	}

	public void resetGrayStroke()
	{
		saveColor(((BaseColor) (new GrayColor(0))), false);
	//    0    0:aload_0         
	//    1    1:new             #1441 <Class GrayColor>
	//    2    4:dup             
	//    3    5:iconst_0        
	//    4    6:invokespecial   #1568 <Method void GrayColor(int)>
	//    5    9:iconst_0        
	//    6   10:invokespecial   #1561 <Method void saveColor(BaseColor, boolean)>
		content.append("0 G").append_i(separator);
	//    7   13:aload_0         
	//    8   14:getfield        #140 <Field ByteBuffer content>
	//    9   17:ldc2            #1573 <String "0 G">
	//   10   20:invokevirtual   #278 <Method ByteBuffer ByteBuffer.append(String)>
	//   11   23:aload_0         
	//   12   24:getfield        #152 <Field int separator>
	//   13   27:invokevirtual   #296 <Method ByteBuffer ByteBuffer.append_i(int)>
	//   14   30:pop             
	//   15   31:return          
	}

	public void resetRGBColorFill()
	{
		resetGrayFill();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #1575 <Method void resetGrayFill()>
	//    2    4:return          
	}

	public void resetRGBColorStroke()
	{
		resetGrayStroke();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #1577 <Method void resetGrayStroke()>
	//    2    4:return          
	}

	protected void restoreMCBlocks(ArrayList arraylist)
	{
		if(isTagged() && arraylist != null)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #220 <Method boolean isTagged()>
	//*   2    4:ifeq            52
	//*   3    7:aload_1         
	//*   4    8:ifnull          52
		{
			setMcElements(arraylist);
	//    5   11:aload_0         
	//    6   12:aload_1         
	//    7   13:invokevirtual   #1582 <Method void setMcElements(ArrayList)>
			for(int i = 0; i < getMcElements().size(); i++)
	//*   8   16:iconst_0        
	//*   9   17:istore_2        
	//*  10   18:iload_2         
	//*  11   19:aload_0         
	//*  12   20:invokevirtual   #260 <Method ArrayList getMcElements()>
	//*  13   23:invokevirtual   #264 <Method int ArrayList.size()>
	//*  14   26:icmpge          52
				openMCBlockInt((IAccessibleElement)getMcElements().get(i));
	//   15   29:aload_0         
	//   16   30:aload_0         
	//   17   31:invokevirtual   #260 <Method ArrayList getMcElements()>
	//   18   34:iload_2         
	//   19   35:invokevirtual   #269 <Method Object ArrayList.get(int)>
	//   20   38:checkcast       #465 <Class IAccessibleElement>
	//   21   41:invokespecial   #1418 <Method PdfStructureElement openMCBlockInt(IAccessibleElement)>
	//   22   44:pop             

	//   23   45:iload_2         
	//   24   46:iconst_1        
	//   25   47:iadd            
	//   26   48:istore_2        
		}
	//*  27   49:goto            18
	//   28   52:return          
	}

	public void restoreState()
	{
		PdfWriter.checkPdfIsoConformance(writer, 12, "Q");
	//    0    0:aload_0         
	//    1    1:getfield        #164 <Field PdfWriter writer>
	//    2    4:bipush          12
	//    3    6:ldc2            #1585 <String "Q">
	//    4    9:invokestatic    #196 <Method void PdfWriter.checkPdfIsoConformance(PdfWriter, int, Object)>
		if(inText && isTagged())
	//*   5   12:aload_0         
	//*   6   13:getfield        #156 <Field boolean inText>
	//*   7   16:ifeq            30
	//*   8   19:aload_0         
	//*   9   20:invokevirtual   #220 <Method boolean isTagged()>
	//*  10   23:ifeq            30
			endText();
	//   11   26:aload_0         
	//   12   27:invokevirtual   #223 <Method void endText()>
		content.append("Q").append_i(separator);
	//   13   30:aload_0         
	//   14   31:getfield        #140 <Field ByteBuffer content>
	//   15   34:ldc2            #1585 <String "Q">
	//   16   37:invokevirtual   #278 <Method ByteBuffer ByteBuffer.append(String)>
	//   17   40:aload_0         
	//   18   41:getfield        #152 <Field int separator>
	//   19   44:invokevirtual   #296 <Method ByteBuffer ByteBuffer.append_i(int)>
	//   20   47:pop             
		int i = stateList.size() - 1;
	//   21   48:aload_0         
	//   22   49:getfield        #150 <Field ArrayList stateList>
	//   23   52:invokevirtual   #264 <Method int ArrayList.size()>
	//   24   55:iconst_1        
	//   25   56:isub            
	//   26   57:istore_1        
		if(i < 0)
	//*  27   58:iload_1         
	//*  28   59:ifge            80
		{
			throw new IllegalPdfSyntaxException(MessageLocalization.getComposedMessage("unbalanced.save.restore.state.operators", new Object[0]));
	//   29   62:new             #1122 <Class IllegalPdfSyntaxException>
	//   30   65:dup             
	//   31   66:ldc2            #1587 <String "unbalanced.save.restore.state.operators">
	//   32   69:iconst_0        
	//   33   70:anewarray       Object[]
	//   34   73:invokestatic    #239 <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//   35   76:invokespecial   #1125 <Method void IllegalPdfSyntaxException(String)>
	//   36   79:athrow          
		} else
		{
			state.restore((GraphicState)stateList.get(i));
	//   37   80:aload_0         
	//   38   81:getfield        #145 <Field PdfContentByte$GraphicState state>
	//   39   84:aload_0         
	//   40   85:getfield        #150 <Field ArrayList stateList>
	//   41   88:iload_1         
	//   42   89:invokevirtual   #269 <Method Object ArrayList.get(int)>
	//   43   92:checkcast       #6   <Class PdfContentByte$GraphicState>
	//   44   95:invokevirtual   #1591 <Method void PdfContentByte$GraphicState.restore(PdfContentByte$GraphicState)>
			stateList.remove(i);
	//   45   98:aload_0         
	//   46   99:getfield        #150 <Field ArrayList stateList>
	//   47  102:iload_1         
	//   48  103:invokevirtual   #1326 <Method Object ArrayList.remove(int)>
	//   49  106:pop             
			return;
	//   50  107:return          
		}
	}

	public void roundRectangle(double d, double d1, double d2, double d3, double d4)
	{
		double d6 = d;
	//    0    0:dload_1         
	//    1    1:dstore          13
		double d5 = d2;
	//    2    3:dload           5
	//    3    5:dstore          11
		if(d2 < 0.0D)
	//*   4    7:dload           5
	//*   5    9:dconst_0        
	//*   6   10:dcmpg           
	//*   7   11:ifge            25
		{
			d6 = d + d2;
	//    8   14:dload_1         
	//    9   15:dload           5
	//   10   17:dadd            
	//   11   18:dstore          13
			d5 = -d2;
	//   12   20:dload           5
	//   13   22:dneg            
	//   14   23:dstore          11
		}
		d2 = d1;
	//   15   25:dload_3         
	//   16   26:dstore          5
		d = d3;
	//   17   28:dload           7
	//   18   30:dstore_1        
		if(d3 < 0.0D)
	//*  19   31:dload           7
	//*  20   33:dconst_0        
	//*  21   34:dcmpg           
	//*  22   35:ifge            48
		{
			d2 = d1 + d3;
	//   23   38:dload_3         
	//   24   39:dload           7
	//   25   41:dadd            
	//   26   42:dstore          5
			d = -d3;
	//   27   44:dload           7
	//   28   46:dneg            
	//   29   47:dstore_1        
		}
		d1 = d4;
	//   30   48:dload           9
	//   31   50:dstore_3        
		if(d4 < 0.0D)
	//*  32   51:dload           9
	//*  33   53:dconst_0        
	//*  34   54:dcmpg           
	//*  35   55:ifge            62
			d1 = -d4;
	//   36   58:dload           9
	//   37   60:dneg            
	//   38   61:dstore_3        
		moveTo(d6 + d1, d2);
	//   39   62:aload_0         
	//   40   63:dload           13
	//   41   65:dload_3         
	//   42   66:dadd            
	//   43   67:dload           5
	//   44   69:invokevirtual   #1080 <Method void moveTo(double, double)>
		lineTo((d6 + d5) - d1, d2);
	//   45   72:aload_0         
	//   46   73:dload           13
	//   47   75:dload           11
	//   48   77:dadd            
	//   49   78:dload_3         
	//   50   79:dsub            
	//   51   80:dload           5
	//   52   82:invokevirtual   #1289 <Method void lineTo(double, double)>
		curveTo((d6 + d5) - (double)0.4477F * d1, d2, d6 + d5, d2 + (double)0.4477F * d1, d6 + d5, d2 + d1);
	//   53   85:aload_0         
	//   54   86:dload           13
	//   55   88:dload           11
	//   56   90:dadd            
	//   57   91:ldc2            #1594 <Float 0.4477F>
	//   58   94:f2d             
	//   59   95:dload_3         
	//   60   96:dmul            
	//   61   97:dsub            
	//   62   98:dload           5
	//   63  100:dload           13
	//   64  102:dload           11
	//   65  104:dadd            
	//   66  105:dload           5
	//   67  107:ldc2            #1594 <Float 0.4477F>
	//   68  110:f2d             
	//   69  111:dload_3         
	//   70  112:dmul            
	//   71  113:dadd            
	//   72  114:dload           13
	//   73  116:dload           11
	//   74  118:dadd            
	//   75  119:dload           5
	//   76  121:dload_3         
	//   77  122:dadd            
	//   78  123:invokevirtual   #1083 <Method void curveTo(double, double, double, double, double, double)>
		lineTo(d6 + d5, (d2 + d) - d1);
	//   79  126:aload_0         
	//   80  127:dload           13
	//   81  129:dload           11
	//   82  131:dadd            
	//   83  132:dload           5
	//   84  134:dload_1         
	//   85  135:dadd            
	//   86  136:dload_3         
	//   87  137:dsub            
	//   88  138:invokevirtual   #1289 <Method void lineTo(double, double)>
		curveTo(d6 + d5, (d2 + d) - (double)0.4477F * d1, (d6 + d5) - (double)0.4477F * d1, d2 + d, (d6 + d5) - d1, d2 + d);
	//   89  141:aload_0         
	//   90  142:dload           13
	//   91  144:dload           11
	//   92  146:dadd            
	//   93  147:dload           5
	//   94  149:dload_1         
	//   95  150:dadd            
	//   96  151:ldc2            #1594 <Float 0.4477F>
	//   97  154:f2d             
	//   98  155:dload_3         
	//   99  156:dmul            
	//  100  157:dsub            
	//  101  158:dload           13
	//  102  160:dload           11
	//  103  162:dadd            
	//  104  163:ldc2            #1594 <Float 0.4477F>
	//  105  166:f2d             
	//  106  167:dload_3         
	//  107  168:dmul            
	//  108  169:dsub            
	//  109  170:dload           5
	//  110  172:dload_1         
	//  111  173:dadd            
	//  112  174:dload           13
	//  113  176:dload           11
	//  114  178:dadd            
	//  115  179:dload_3         
	//  116  180:dsub            
	//  117  181:dload           5
	//  118  183:dload_1         
	//  119  184:dadd            
	//  120  185:invokevirtual   #1083 <Method void curveTo(double, double, double, double, double, double)>
		lineTo(d6 + d1, d2 + d);
	//  121  188:aload_0         
	//  122  189:dload           13
	//  123  191:dload_3         
	//  124  192:dadd            
	//  125  193:dload           5
	//  126  195:dload_1         
	//  127  196:dadd            
	//  128  197:invokevirtual   #1289 <Method void lineTo(double, double)>
		curveTo((double)0.4477F * d1 + d6, d2 + d, d6, (d2 + d) - (double)0.4477F * d1, d6, (d2 + d) - d1);
	//  129  200:aload_0         
	//  130  201:ldc2            #1594 <Float 0.4477F>
	//  131  204:f2d             
	//  132  205:dload_3         
	//  133  206:dmul            
	//  134  207:dload           13
	//  135  209:dadd            
	//  136  210:dload           5
	//  137  212:dload_1         
	//  138  213:dadd            
	//  139  214:dload           13
	//  140  216:dload           5
	//  141  218:dload_1         
	//  142  219:dadd            
	//  143  220:ldc2            #1594 <Float 0.4477F>
	//  144  223:f2d             
	//  145  224:dload_3         
	//  146  225:dmul            
	//  147  226:dsub            
	//  148  227:dload           13
	//  149  229:dload           5
	//  150  231:dload_1         
	//  151  232:dadd            
	//  152  233:dload_3         
	//  153  234:dsub            
	//  154  235:invokevirtual   #1083 <Method void curveTo(double, double, double, double, double, double)>
		lineTo(d6, d2 + d1);
	//  155  238:aload_0         
	//  156  239:dload           13
	//  157  241:dload           5
	//  158  243:dload_3         
	//  159  244:dadd            
	//  160  245:invokevirtual   #1289 <Method void lineTo(double, double)>
		curveTo(d6, d2 + (double)0.4477F * d1, d6 + (double)0.4477F * d1, d2, d6 + d1, d2);
	//  161  248:aload_0         
	//  162  249:dload           13
	//  163  251:dload           5
	//  164  253:ldc2            #1594 <Float 0.4477F>
	//  165  256:f2d             
	//  166  257:dload_3         
	//  167  258:dmul            
	//  168  259:dadd            
	//  169  260:dload           13
	//  170  262:ldc2            #1594 <Float 0.4477F>
	//  171  265:f2d             
	//  172  266:dload_3         
	//  173  267:dmul            
	//  174  268:dadd            
	//  175  269:dload           5
	//  176  271:dload           13
	//  177  273:dload_3         
	//  178  274:dadd            
	//  179  275:dload           5
	//  180  277:invokevirtual   #1083 <Method void curveTo(double, double, double, double, double, double)>
	//  181  280:return          
	}

	public void roundRectangle(float f, float f1, float f2, float f3, float f4)
	{
		roundRectangle(f, f1, f2, f3, f4);
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:f2d             
	//    3    3:fload_2         
	//    4    4:f2d             
	//    5    5:fload_3         
	//    6    6:f2d             
	//    7    7:fload           4
	//    8    9:f2d             
	//    9   10:fload           5
	//   10   12:f2d             
	//   11   13:invokevirtual   #1597 <Method void roundRectangle(double, double, double, double, double)>
	//   12   16:return          
	}

	public void sanityCheck()
	{
label0:
		{
label1:
			{
				if(getMcDepth() != 0)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #391 <Method int getMcDepth()>
	//*   2    4:ifeq            25
					throw new IllegalPdfSyntaxException(MessageLocalization.getComposedMessage("unbalanced.marked.content.operators", new Object[0]));
	//    3    7:new             #1122 <Class IllegalPdfSyntaxException>
	//    4   10:dup             
	//    5   11:ldc2            #1599 <String "unbalanced.marked.content.operators">
	//    6   14:iconst_0        
	//    7   15:anewarray       Object[]
	//    8   18:invokestatic    #239 <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//    9   21:invokespecial   #1125 <Method void IllegalPdfSyntaxException(String)>
	//   10   24:athrow          
				if(inText)
	//*  11   25:aload_0         
	//*  12   26:getfield        #156 <Field boolean inText>
	//*  13   29:ifeq            43
				{
					if(!isTagged())
						break label1;
	//   14   32:aload_0         
	//   15   33:invokevirtual   #220 <Method boolean isTagged()>
	//   16   36:ifeq            78
					endText();
	//   17   39:aload_0         
	//   18   40:invokevirtual   #223 <Method void endText()>
				}
				if(layerDepth != null && !layerDepth.isEmpty())
	//*  19   43:aload_0         
	//*  20   44:getfield        #1094 <Field ArrayList layerDepth>
	//*  21   47:ifnull          96
	//*  22   50:aload_0         
	//*  23   51:getfield        #1094 <Field ArrayList layerDepth>
	//*  24   54:invokevirtual   #1074 <Method boolean ArrayList.isEmpty()>
	//*  25   57:ifne            96
					throw new IllegalPdfSyntaxException(MessageLocalization.getComposedMessage("unbalanced.layer.operators", new Object[0]));
	//   26   60:new             #1122 <Class IllegalPdfSyntaxException>
	//   27   63:dup             
	//   28   64:ldc2            #1330 <String "unbalanced.layer.operators">
	//   29   67:iconst_0        
	//   30   68:anewarray       Object[]
	//   31   71:invokestatic    #239 <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//   32   74:invokespecial   #1125 <Method void IllegalPdfSyntaxException(String)>
	//   33   77:athrow          
				break label0;
			}
			throw new IllegalPdfSyntaxException(MessageLocalization.getComposedMessage("unbalanced.begin.end.text.operators", new Object[0]));
	//   34   78:new             #1122 <Class IllegalPdfSyntaxException>
	//   35   81:dup             
	//   36   82:ldc2            #1124 <String "unbalanced.begin.end.text.operators">
	//   37   85:iconst_0        
	//   38   86:anewarray       Object[]
	//   39   89:invokestatic    #239 <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//   40   92:invokespecial   #1125 <Method void IllegalPdfSyntaxException(String)>
	//   41   95:athrow          
		}
		if(!stateList.isEmpty())
	//*  42   96:aload_0         
	//*  43   97:getfield        #150 <Field ArrayList stateList>
	//*  44  100:invokevirtual   #1074 <Method boolean ArrayList.isEmpty()>
	//*  45  103:ifne            124
			throw new IllegalPdfSyntaxException(MessageLocalization.getComposedMessage("unbalanced.save.restore.state.operators", new Object[0]));
	//   46  106:new             #1122 <Class IllegalPdfSyntaxException>
	//   47  109:dup             
	//   48  110:ldc2            #1587 <String "unbalanced.save.restore.state.operators">
	//   49  113:iconst_0        
	//   50  114:anewarray       Object[]
	//   51  117:invokestatic    #239 <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//   52  120:invokespecial   #1125 <Method void IllegalPdfSyntaxException(String)>
	//   53  123:athrow          
		else
			return;
	//   54  124:return          
	}

	protected ArrayList saveMCBlocks()
	{
		ArrayList arraylist = new ArrayList();
	//    0    0:new             #147 <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #148 <Method void ArrayList()>
	//    3    7:astore_2        
		if(isTagged())
	//*   4    8:aload_0         
	//*   5    9:invokevirtual   #220 <Method boolean isTagged()>
	//*   6   12:ifeq            60
		{
			arraylist = getMcElements();
	//    7   15:aload_0         
	//    8   16:invokevirtual   #260 <Method ArrayList getMcElements()>
	//    9   19:astore_2        
			for(int i = 0; i < arraylist.size(); i++)
	//*  10   20:iconst_0        
	//*  11   21:istore_1        
	//*  12   22:iload_1         
	//*  13   23:aload_2         
	//*  14   24:invokevirtual   #264 <Method int ArrayList.size()>
	//*  15   27:icmpge          49
				closeMCBlockInt((IAccessibleElement)arraylist.get(i));
	//   16   30:aload_0         
	//   17   31:aload_2         
	//   18   32:iload_1         
	//   19   33:invokevirtual   #269 <Method Object ArrayList.get(int)>
	//   20   36:checkcast       #465 <Class IAccessibleElement>
	//   21   39:invokespecial   #1174 <Method void closeMCBlockInt(IAccessibleElement)>

	//   22   42:iload_1         
	//   23   43:iconst_1        
	//   24   44:iadd            
	//   25   45:istore_1        
	//*  26   46:goto            22
			setMcElements(new ArrayList());
	//   27   49:aload_0         
	//   28   50:new             #147 <Class ArrayList>
	//   29   53:dup             
	//   30   54:invokespecial   #148 <Method void ArrayList()>
	//   31   57:invokevirtual   #1582 <Method void setMcElements(ArrayList)>
		}
		return arraylist;
	//   32   60:aload_2         
	//   33   61:areturn         
	}

	public void saveState()
	{
		PdfWriter.checkPdfIsoConformance(writer, 12, "q");
	//    0    0:aload_0         
	//    1    1:getfield        #164 <Field PdfWriter writer>
	//    2    4:bipush          12
	//    3    6:ldc2            #1602 <String "q">
	//    4    9:invokestatic    #196 <Method void PdfWriter.checkPdfIsoConformance(PdfWriter, int, Object)>
		if(inText && isTagged())
	//*   5   12:aload_0         
	//*   6   13:getfield        #156 <Field boolean inText>
	//*   7   16:ifeq            30
	//*   8   19:aload_0         
	//*   9   20:invokevirtual   #220 <Method boolean isTagged()>
	//*  10   23:ifeq            30
			endText();
	//   11   26:aload_0         
	//   12   27:invokevirtual   #223 <Method void endText()>
		content.append("q").append_i(separator);
	//   13   30:aload_0         
	//   14   31:getfield        #140 <Field ByteBuffer content>
	//   15   34:ldc2            #1602 <String "q">
	//   16   37:invokevirtual   #278 <Method ByteBuffer ByteBuffer.append(String)>
	//   17   40:aload_0         
	//   18   41:getfield        #152 <Field int separator>
	//   19   44:invokevirtual   #296 <Method ByteBuffer ByteBuffer.append_i(int)>
	//   20   47:pop             
		stateList.add(((Object) (new GraphicState(state))));
	//   21   48:aload_0         
	//   22   49:getfield        #150 <Field ArrayList stateList>
	//   23   52:new             #6   <Class PdfContentByte$GraphicState>
	//   24   55:dup             
	//   25   56:aload_0         
	//   26   57:getfield        #145 <Field PdfContentByte$GraphicState state>
	//   27   60:invokespecial   #1604 <Method void PdfContentByte$GraphicState(PdfContentByte$GraphicState)>
	//   28   63:invokevirtual   #273 <Method boolean ArrayList.add(Object)>
	//   29   66:pop             
	//   30   67:return          
	}

	public void setAction(PdfAction pdfaction, float f, float f1, float f2, float f3)
	{
		pdf.setAction(pdfaction, f, f1, f2, f3);
	//    0    0:aload_0         
	//    1    1:getfield        #172 <Field PdfDocument pdf>
	//    2    4:aload_1         
	//    3    5:fload_2         
	//    4    6:fload_3         
	//    5    7:fload           4
	//    6    9:fload           5
	//    7   11:invokevirtual   #1608 <Method void PdfDocument.setAction(PdfAction, float, float, float, float)>
	//    8   14:return          
	}

	public void setCMYKColorFill(int i, int j, int k, int l)
	{
		saveColor(((BaseColor) (new CMYKColor(i, j, k, l))), true);
	//    0    0:aload_0         
	//    1    1:new             #1446 <Class CMYKColor>
	//    2    4:dup             
	//    3    5:iload_1         
	//    4    6:iload_2         
	//    5    7:iload_3         
	//    6    8:iload           4
	//    7   10:invokespecial   #1559 <Method void CMYKColor(int, int, int, int)>
	//    8   13:iconst_1        
	//    9   14:invokespecial   #1561 <Method void saveColor(BaseColor, boolean)>
		content.append((float)(i & 0xff) / 255F);
	//   10   17:aload_0         
	//   11   18:getfield        #140 <Field ByteBuffer content>
	//   12   21:iload_1         
	//   13   22:sipush          255
	//   14   25:iand            
	//   15   26:i2f             
	//   16   27:ldc2            #1433 <Float 255F>
	//   17   30:fdiv            
	//   18   31:invokevirtual   #178 <Method ByteBuffer ByteBuffer.append(float)>
	//   19   34:pop             
		content.append(' ');
	//   20   35:aload_0         
	//   21   36:getfield        #140 <Field ByteBuffer content>
	//   22   39:bipush          32
	//   23   41:invokevirtual   #181 <Method ByteBuffer ByteBuffer.append(char)>
	//   24   44:pop             
		content.append((float)(j & 0xff) / 255F);
	//   25   45:aload_0         
	//   26   46:getfield        #140 <Field ByteBuffer content>
	//   27   49:iload_2         
	//   28   50:sipush          255
	//   29   53:iand            
	//   30   54:i2f             
	//   31   55:ldc2            #1433 <Float 255F>
	//   32   58:fdiv            
	//   33   59:invokevirtual   #178 <Method ByteBuffer ByteBuffer.append(float)>
	//   34   62:pop             
		content.append(' ');
	//   35   63:aload_0         
	//   36   64:getfield        #140 <Field ByteBuffer content>
	//   37   67:bipush          32
	//   38   69:invokevirtual   #181 <Method ByteBuffer ByteBuffer.append(char)>
	//   39   72:pop             
		content.append((float)(k & 0xff) / 255F);
	//   40   73:aload_0         
	//   41   74:getfield        #140 <Field ByteBuffer content>
	//   42   77:iload_3         
	//   43   78:sipush          255
	//   44   81:iand            
	//   45   82:i2f             
	//   46   83:ldc2            #1433 <Float 255F>
	//   47   86:fdiv            
	//   48   87:invokevirtual   #178 <Method ByteBuffer ByteBuffer.append(float)>
	//   49   90:pop             
		content.append(' ');
	//   50   91:aload_0         
	//   51   92:getfield        #140 <Field ByteBuffer content>
	//   52   95:bipush          32
	//   53   97:invokevirtual   #181 <Method ByteBuffer ByteBuffer.append(char)>
	//   54  100:pop             
		content.append((float)(l & 0xff) / 255F);
	//   55  101:aload_0         
	//   56  102:getfield        #140 <Field ByteBuffer content>
	//   57  105:iload           4
	//   58  107:sipush          255
	//   59  110:iand            
	//   60  111:i2f             
	//   61  112:ldc2            #1433 <Float 255F>
	//   62  115:fdiv            
	//   63  116:invokevirtual   #178 <Method ByteBuffer ByteBuffer.append(float)>
	//   64  119:pop             
		content.append(" k").append_i(separator);
	//   65  120:aload_0         
	//   66  121:getfield        #140 <Field ByteBuffer content>
	//   67  124:ldc2            #1611 <String " k">
	//   68  127:invokevirtual   #278 <Method ByteBuffer ByteBuffer.append(String)>
	//   69  130:aload_0         
	//   70  131:getfield        #152 <Field int separator>
	//   71  134:invokevirtual   #296 <Method ByteBuffer ByteBuffer.append_i(int)>
	//   72  137:pop             
	//   73  138:return          
	}

	public void setCMYKColorFillF(float f, float f1, float f2, float f3)
	{
		saveColor(((BaseColor) (new CMYKColor(f, f1, f2, f3))), true);
	//    0    0:aload_0         
	//    1    1:new             #1446 <Class CMYKColor>
	//    2    4:dup             
	//    3    5:fload_1         
	//    4    6:fload_2         
	//    5    7:fload_3         
	//    6    8:fload           4
	//    7   10:invokespecial   #1613 <Method void CMYKColor(float, float, float, float)>
	//    8   13:iconst_1        
	//    9   14:invokespecial   #1561 <Method void saveColor(BaseColor, boolean)>
		HelperCMYK(f, f1, f2, f3);
	//   10   17:aload_0         
	//   11   18:fload_1         
	//   12   19:fload_2         
	//   13   20:fload_3         
	//   14   21:fload           4
	//   15   23:invokespecial   #1615 <Method void HelperCMYK(float, float, float, float)>
		content.append(" k").append_i(separator);
	//   16   26:aload_0         
	//   17   27:getfield        #140 <Field ByteBuffer content>
	//   18   30:ldc2            #1611 <String " k">
	//   19   33:invokevirtual   #278 <Method ByteBuffer ByteBuffer.append(String)>
	//   20   36:aload_0         
	//   21   37:getfield        #152 <Field int separator>
	//   22   40:invokevirtual   #296 <Method ByteBuffer ByteBuffer.append_i(int)>
	//   23   43:pop             
	//   24   44:return          
	}

	public void setCMYKColorStroke(int i, int j, int k, int l)
	{
		saveColor(((BaseColor) (new CMYKColor(i, j, k, l))), false);
	//    0    0:aload_0         
	//    1    1:new             #1446 <Class CMYKColor>
	//    2    4:dup             
	//    3    5:iload_1         
	//    4    6:iload_2         
	//    5    7:iload_3         
	//    6    8:iload           4
	//    7   10:invokespecial   #1559 <Method void CMYKColor(int, int, int, int)>
	//    8   13:iconst_0        
	//    9   14:invokespecial   #1561 <Method void saveColor(BaseColor, boolean)>
		content.append((float)(i & 0xff) / 255F);
	//   10   17:aload_0         
	//   11   18:getfield        #140 <Field ByteBuffer content>
	//   12   21:iload_1         
	//   13   22:sipush          255
	//   14   25:iand            
	//   15   26:i2f             
	//   16   27:ldc2            #1433 <Float 255F>
	//   17   30:fdiv            
	//   18   31:invokevirtual   #178 <Method ByteBuffer ByteBuffer.append(float)>
	//   19   34:pop             
		content.append(' ');
	//   20   35:aload_0         
	//   21   36:getfield        #140 <Field ByteBuffer content>
	//   22   39:bipush          32
	//   23   41:invokevirtual   #181 <Method ByteBuffer ByteBuffer.append(char)>
	//   24   44:pop             
		content.append((float)(j & 0xff) / 255F);
	//   25   45:aload_0         
	//   26   46:getfield        #140 <Field ByteBuffer content>
	//   27   49:iload_2         
	//   28   50:sipush          255
	//   29   53:iand            
	//   30   54:i2f             
	//   31   55:ldc2            #1433 <Float 255F>
	//   32   58:fdiv            
	//   33   59:invokevirtual   #178 <Method ByteBuffer ByteBuffer.append(float)>
	//   34   62:pop             
		content.append(' ');
	//   35   63:aload_0         
	//   36   64:getfield        #140 <Field ByteBuffer content>
	//   37   67:bipush          32
	//   38   69:invokevirtual   #181 <Method ByteBuffer ByteBuffer.append(char)>
	//   39   72:pop             
		content.append((float)(k & 0xff) / 255F);
	//   40   73:aload_0         
	//   41   74:getfield        #140 <Field ByteBuffer content>
	//   42   77:iload_3         
	//   43   78:sipush          255
	//   44   81:iand            
	//   45   82:i2f             
	//   46   83:ldc2            #1433 <Float 255F>
	//   47   86:fdiv            
	//   48   87:invokevirtual   #178 <Method ByteBuffer ByteBuffer.append(float)>
	//   49   90:pop             
		content.append(' ');
	//   50   91:aload_0         
	//   51   92:getfield        #140 <Field ByteBuffer content>
	//   52   95:bipush          32
	//   53   97:invokevirtual   #181 <Method ByteBuffer ByteBuffer.append(char)>
	//   54  100:pop             
		content.append((float)(l & 0xff) / 255F);
	//   55  101:aload_0         
	//   56  102:getfield        #140 <Field ByteBuffer content>
	//   57  105:iload           4
	//   58  107:sipush          255
	//   59  110:iand            
	//   60  111:i2f             
	//   61  112:ldc2            #1433 <Float 255F>
	//   62  115:fdiv            
	//   63  116:invokevirtual   #178 <Method ByteBuffer ByteBuffer.append(float)>
	//   64  119:pop             
		content.append(" K").append_i(separator);
	//   65  120:aload_0         
	//   66  121:getfield        #140 <Field ByteBuffer content>
	//   67  124:ldc2            #1618 <String " K">
	//   68  127:invokevirtual   #278 <Method ByteBuffer ByteBuffer.append(String)>
	//   69  130:aload_0         
	//   70  131:getfield        #152 <Field int separator>
	//   71  134:invokevirtual   #296 <Method ByteBuffer ByteBuffer.append_i(int)>
	//   72  137:pop             
	//   73  138:return          
	}

	public void setCMYKColorStrokeF(float f, float f1, float f2, float f3)
	{
		saveColor(((BaseColor) (new CMYKColor(f, f1, f2, f3))), false);
	//    0    0:aload_0         
	//    1    1:new             #1446 <Class CMYKColor>
	//    2    4:dup             
	//    3    5:fload_1         
	//    4    6:fload_2         
	//    5    7:fload_3         
	//    6    8:fload           4
	//    7   10:invokespecial   #1613 <Method void CMYKColor(float, float, float, float)>
	//    8   13:iconst_0        
	//    9   14:invokespecial   #1561 <Method void saveColor(BaseColor, boolean)>
		HelperCMYK(f, f1, f2, f3);
	//   10   17:aload_0         
	//   11   18:fload_1         
	//   12   19:fload_2         
	//   13   20:fload_3         
	//   14   21:fload           4
	//   15   23:invokespecial   #1615 <Method void HelperCMYK(float, float, float, float)>
		content.append(" K").append_i(separator);
	//   16   26:aload_0         
	//   17   27:getfield        #140 <Field ByteBuffer content>
	//   18   30:ldc2            #1618 <String " K">
	//   19   33:invokevirtual   #278 <Method ByteBuffer ByteBuffer.append(String)>
	//   20   36:aload_0         
	//   21   37:getfield        #152 <Field int separator>
	//   22   40:invokevirtual   #296 <Method ByteBuffer ByteBuffer.append_i(int)>
	//   23   43:pop             
	//   24   44:return          
	}

	public void setCharacterSpacing(float f)
	{
		if(!inText && isTagged())
	//*   0    0:aload_0         
	//*   1    1:getfield        #156 <Field boolean inText>
	//*   2    4:ifne            19
	//*   3    7:aload_0         
	//*   4    8:invokevirtual   #220 <Method boolean isTagged()>
	//*   5   11:ifeq            19
			beginText(true);
	//    6   14:aload_0         
	//    7   15:iconst_1        
	//    8   16:invokevirtual   #490 <Method void beginText(boolean)>
		state.charSpace = f;
	//    9   19:aload_0         
	//   10   20:getfield        #145 <Field PdfContentByte$GraphicState state>
	//   11   23:fload_1         
	//   12   24:putfield        #530 <Field float PdfContentByte$GraphicState.charSpace>
		content.append(f).append(" Tc").append_i(separator);
	//   13   27:aload_0         
	//   14   28:getfield        #140 <Field ByteBuffer content>
	//   15   31:fload_1         
	//   16   32:invokevirtual   #178 <Method ByteBuffer ByteBuffer.append(float)>
	//   17   35:ldc2            #1622 <String " Tc">
	//   18   38:invokevirtual   #278 <Method ByteBuffer ByteBuffer.append(String)>
	//   19   41:aload_0         
	//   20   42:getfield        #152 <Field int separator>
	//   21   45:invokevirtual   #296 <Method ByteBuffer ByteBuffer.append_i(int)>
	//   22   48:pop             
	//   23   49:return          
	}

	public void setColorFill(BaseColor basecolor)
	{
		ExtendedColor.getType(basecolor);
	//    0    0:aload_1         
	//    1    1:invokestatic    #1427 <Method int ExtendedColor.getType(BaseColor)>
		JVM INSTR tableswitch 1 7: default 48
	//	               1 100
	//	               2 114
	//	               3 142
	//	               4 162
	//	               5 176
	//	               6 190
	//	               7 210;
	//    2    4:tableswitch     1 7: default 48
	//	               1 100
	//	               2 114
	//	               3 142
	//	               4 162
	//	               5 176
	//	               6 190
	//	               7 210
		   goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8
_L1:
		setRGBColorFill(basecolor.getRed(), basecolor.getGreen(), basecolor.getBlue());
	//    3   48:aload_0         
	//    4   49:aload_1         
	//    5   50:invokevirtual   #1432 <Method int BaseColor.getRed()>
	//    6   53:aload_1         
	//    7   54:invokevirtual   #1436 <Method int BaseColor.getGreen()>
	//    8   57:aload_1         
	//    9   58:invokevirtual   #1439 <Method int BaseColor.getBlue()>
	//   10   61:invokevirtual   #1625 <Method void setRGBColorFill(int, int, int)>
_L10:
		int i = basecolor.getAlpha();
	//   11   64:aload_1         
	//   12   65:invokevirtual   #1628 <Method int BaseColor.getAlpha()>
	//   13   68:istore_2        
		if(i < 255)
	//*  14   69:iload_2         
	//*  15   70:sipush          255
	//*  16   73:icmpge          99
		{
			basecolor = ((BaseColor) (new PdfGState()));
	//   17   76:new             #1630 <Class PdfGState>
	//   18   79:dup             
	//   19   80:invokespecial   #1631 <Method void PdfGState()>
	//   20   83:astore_1        
			((PdfGState) (basecolor)).setFillOpacity((float)i / 255F);
	//   21   84:aload_1         
	//   22   85:iload_2         
	//   23   86:i2f             
	//   24   87:ldc2            #1433 <Float 255F>
	//   25   90:fdiv            
	//   26   91:invokevirtual   #1634 <Method void PdfGState.setFillOpacity(float)>
			setGState(((PdfGState) (basecolor)));
	//   27   94:aload_0         
	//   28   95:aload_1         
	//   29   96:invokevirtual   #1638 <Method void setGState(PdfGState)>
		}
		return;
	//   30   99:return          
_L2:
		setGrayFill(((GrayColor)basecolor).getGray());
	//   31  100:aload_0         
	//   32  101:aload_1         
	//   33  102:checkcast       #1441 <Class GrayColor>
	//   34  105:invokevirtual   #1444 <Method float GrayColor.getGray()>
	//   35  108:invokevirtual   #1641 <Method void setGrayFill(float)>
		continue; /* Loop/switch isn't completed */
	//   36  111:goto            64
_L3:
		CMYKColor cmykcolor = (CMYKColor)basecolor;
	//   37  114:aload_1         
	//   38  115:checkcast       #1446 <Class CMYKColor>
	//   39  118:astore_3        
		setCMYKColorFillF(cmykcolor.getCyan(), cmykcolor.getMagenta(), cmykcolor.getYellow(), cmykcolor.getBlack());
	//   40  119:aload_0         
	//   41  120:aload_3         
	//   42  121:invokevirtual   #1449 <Method float CMYKColor.getCyan()>
	//   43  124:aload_3         
	//   44  125:invokevirtual   #1452 <Method float CMYKColor.getMagenta()>
	//   45  128:aload_3         
	//   46  129:invokevirtual   #1455 <Method float CMYKColor.getYellow()>
	//   47  132:aload_3         
	//   48  133:invokevirtual   #1458 <Method float CMYKColor.getBlack()>
	//   49  136:invokevirtual   #1643 <Method void setCMYKColorFillF(float, float, float, float)>
		continue; /* Loop/switch isn't completed */
	//   50  139:goto            64
_L4:
		SpotColor spotcolor = (SpotColor)basecolor;
	//   51  142:aload_1         
	//   52  143:checkcast       #1645 <Class SpotColor>
	//   53  146:astore_3        
		setColorFill(spotcolor.getPdfSpotColor(), spotcolor.getTint());
	//   54  147:aload_0         
	//   55  148:aload_3         
	//   56  149:invokevirtual   #1649 <Method PdfSpotColor SpotColor.getPdfSpotColor()>
	//   57  152:aload_3         
	//   58  153:invokevirtual   #1652 <Method float SpotColor.getTint()>
	//   59  156:invokevirtual   #1655 <Method void setColorFill(PdfSpotColor, float)>
		continue; /* Loop/switch isn't completed */
	//   60  159:goto            64
_L5:
		setPatternFill(((PatternColor)basecolor).getPainter());
	//   61  162:aload_0         
	//   62  163:aload_1         
	//   63  164:checkcast       #1657 <Class PatternColor>
	//   64  167:invokevirtual   #1661 <Method PdfPatternPainter PatternColor.getPainter()>
	//   65  170:invokevirtual   #1665 <Method void setPatternFill(PdfPatternPainter)>
		continue; /* Loop/switch isn't completed */
	//   66  173:goto            64
_L6:
		setShadingFill(((ShadingColor)basecolor).getPdfShadingPattern());
	//   67  176:aload_0         
	//   68  177:aload_1         
	//   69  178:checkcast       #1667 <Class ShadingColor>
	//   70  181:invokevirtual   #1671 <Method PdfShadingPattern ShadingColor.getPdfShadingPattern()>
	//   71  184:invokevirtual   #1674 <Method void setShadingFill(PdfShadingPattern)>
		continue; /* Loop/switch isn't completed */
	//   72  187:goto            64
_L7:
		DeviceNColor devicencolor = (DeviceNColor)basecolor;
	//   73  190:aload_1         
	//   74  191:checkcast       #1676 <Class DeviceNColor>
	//   75  194:astore_3        
		setColorFill(devicencolor.getPdfDeviceNColor(), devicencolor.getTints());
	//   76  195:aload_0         
	//   77  196:aload_3         
	//   78  197:invokevirtual   #1680 <Method PdfDeviceNColor DeviceNColor.getPdfDeviceNColor()>
	//   79  200:aload_3         
	//   80  201:invokevirtual   #1683 <Method float[] DeviceNColor.getTints()>
	//   81  204:invokevirtual   #1686 <Method void setColorFill(PdfDeviceNColor, float[])>
		continue; /* Loop/switch isn't completed */
	//   82  207:goto            64
_L8:
		LabColor labcolor = (LabColor)basecolor;
	//   83  210:aload_1         
	//   84  211:checkcast       #1688 <Class LabColor>
	//   85  214:astore_3        
		setColorFill(labcolor.getLabColorSpace(), labcolor.getL(), labcolor.getA(), labcolor.getB());
	//   86  215:aload_0         
	//   87  216:aload_3         
	//   88  217:invokevirtual   #1692 <Method PdfLabColor LabColor.getLabColorSpace()>
	//   89  220:aload_3         
	//   90  221:invokevirtual   #1695 <Method float LabColor.getL()>
	//   91  224:aload_3         
	//   92  225:invokevirtual   #1698 <Method float LabColor.getA()>
	//   93  228:aload_3         
	//   94  229:invokevirtual   #1701 <Method float LabColor.getB()>
	//   95  232:invokevirtual   #1704 <Method void setColorFill(PdfLabColor, float, float, float)>
		if(true) goto _L10; else goto _L9
	//   96  235:goto            64
_L9:
	}

	public void setColorFill(PdfDeviceNColor pdfdevicencolor, float af[])
	{
		checkWriter();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #188 <Method void checkWriter()>
		state.colorDetails = writer.addSimple(((ICachedColorSpace) (pdfdevicencolor)));
	//    2    4:aload_0         
	//    3    5:getfield        #145 <Field PdfContentByte$GraphicState state>
	//    4    8:aload_0         
	//    5    9:getfield        #164 <Field PdfWriter writer>
	//    6   12:aload_1         
	//    7   13:invokevirtual   #1708 <Method ColorDetails PdfWriter.addSimple(ICachedColorSpace)>
	//    8   16:putfield        #1712 <Field ColorDetails PdfContentByte$GraphicState.colorDetails>
		PdfName pdfname = getPageResources().addColor(state.colorDetails.getColorSpaceName(), state.colorDetails.getIndirectReference());
	//    9   19:aload_0         
	//   10   20:invokevirtual   #204 <Method PageResources getPageResources()>
	//   11   23:aload_0         
	//   12   24:getfield        #145 <Field PdfContentByte$GraphicState state>
	//   13   27:getfield        #1712 <Field ColorDetails PdfContentByte$GraphicState.colorDetails>
	//   14   30:invokevirtual   #1485 <Method PdfName ColorDetails.getColorSpaceName()>
	//   15   33:aload_0         
	//   16   34:getfield        #145 <Field PdfContentByte$GraphicState state>
	//   17   37:getfield        #1712 <Field ColorDetails PdfContentByte$GraphicState.colorDetails>
	//   18   40:invokevirtual   #1486 <Method PdfIndirectReference ColorDetails.getIndirectReference()>
	//   19   43:invokevirtual   #947 <Method PdfName PageResources.addColor(PdfName, PdfIndirectReference)>
	//   20   46:astore          6
		saveColor(((BaseColor) (new DeviceNColor(pdfdevicencolor, af))), true);
	//   21   48:aload_0         
	//   22   49:new             #1676 <Class DeviceNColor>
	//   23   52:dup             
	//   24   53:aload_1         
	//   25   54:aload_2         
	//   26   55:invokespecial   #1714 <Method void DeviceNColor(PdfDeviceNColor, float[])>
	//   27   58:iconst_1        
	//   28   59:invokespecial   #1561 <Method void saveColor(BaseColor, boolean)>
		content.append(pdfname.getBytes()).append(" cs ");
	//   29   62:aload_0         
	//   30   63:getfield        #140 <Field ByteBuffer content>
	//   31   66:aload           6
	//   32   68:invokevirtual   #287 <Method byte[] PdfName.getBytes()>
	//   33   71:invokevirtual   #290 <Method ByteBuffer ByteBuffer.append(byte[])>
	//   34   74:ldc2            #1716 <String " cs ">
	//   35   77:invokevirtual   #278 <Method ByteBuffer ByteBuffer.append(String)>
	//   36   80:pop             
		int j = af.length;
	//   37   81:aload_2         
	//   38   82:arraylength     
	//   39   83:istore          5
		for(int i = 0; i < j; i++)
	//*  40   85:iconst_0        
	//*  41   86:istore          4
	//*  42   88:iload           4
	//*  43   90:iload           5
	//*  44   92:icmpge          137
		{
			float f = af[i];
	//   45   95:aload_2         
	//   46   96:iload           4
	//   47   98:faload          
	//   48   99:fstore_3        
			content.append((new StringBuilder()).append(f).append(" ").toString());
	//   49  100:aload_0         
	//   50  101:getfield        #140 <Field ByteBuffer content>
	//   51  104:new             #1718 <Class StringBuilder>
	//   52  107:dup             
	//   53  108:invokespecial   #1719 <Method void StringBuilder()>
	//   54  111:fload_3         
	//   55  112:invokevirtual   #1722 <Method StringBuilder StringBuilder.append(float)>
	//   56  115:ldc2            #1724 <String " ">
	//   57  118:invokevirtual   #1727 <Method StringBuilder StringBuilder.append(String)>
	//   58  121:invokevirtual   #1728 <Method String StringBuilder.toString()>
	//   59  124:invokevirtual   #278 <Method ByteBuffer ByteBuffer.append(String)>
	//   60  127:pop             
		}

	//   61  128:iload           4
	//   62  130:iconst_1        
	//   63  131:iadd            
	//   64  132:istore          4
	//*  65  134:goto            88
		content.append("scn").append_i(separator);
	//   66  137:aload_0         
	//   67  138:getfield        #140 <Field ByteBuffer content>
	//   68  141:ldc2            #1730 <String "scn">
	//   69  144:invokevirtual   #278 <Method ByteBuffer ByteBuffer.append(String)>
	//   70  147:aload_0         
	//   71  148:getfield        #152 <Field int separator>
	//   72  151:invokevirtual   #296 <Method ByteBuffer ByteBuffer.append_i(int)>
	//   73  154:pop             
	//   74  155:return          
	}

	public void setColorFill(PdfLabColor pdflabcolor, float f, float f1, float f2)
	{
		checkWriter();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #188 <Method void checkWriter()>
		state.colorDetails = writer.addSimple(((ICachedColorSpace) (pdflabcolor)));
	//    2    4:aload_0         
	//    3    5:getfield        #145 <Field PdfContentByte$GraphicState state>
	//    4    8:aload_0         
	//    5    9:getfield        #164 <Field PdfWriter writer>
	//    6   12:aload_1         
	//    7   13:invokevirtual   #1708 <Method ColorDetails PdfWriter.addSimple(ICachedColorSpace)>
	//    8   16:putfield        #1712 <Field ColorDetails PdfContentByte$GraphicState.colorDetails>
		PdfName pdfname = getPageResources().addColor(state.colorDetails.getColorSpaceName(), state.colorDetails.getIndirectReference());
	//    9   19:aload_0         
	//   10   20:invokevirtual   #204 <Method PageResources getPageResources()>
	//   11   23:aload_0         
	//   12   24:getfield        #145 <Field PdfContentByte$GraphicState state>
	//   13   27:getfield        #1712 <Field ColorDetails PdfContentByte$GraphicState.colorDetails>
	//   14   30:invokevirtual   #1485 <Method PdfName ColorDetails.getColorSpaceName()>
	//   15   33:aload_0         
	//   16   34:getfield        #145 <Field PdfContentByte$GraphicState state>
	//   17   37:getfield        #1712 <Field ColorDetails PdfContentByte$GraphicState.colorDetails>
	//   18   40:invokevirtual   #1486 <Method PdfIndirectReference ColorDetails.getIndirectReference()>
	//   19   43:invokevirtual   #947 <Method PdfName PageResources.addColor(PdfName, PdfIndirectReference)>
	//   20   46:astore          5
		saveColor(((BaseColor) (new LabColor(pdflabcolor, f, f1, f2))), true);
	//   21   48:aload_0         
	//   22   49:new             #1688 <Class LabColor>
	//   23   52:dup             
	//   24   53:aload_1         
	//   25   54:fload_2         
	//   26   55:fload_3         
	//   27   56:fload           4
	//   28   58:invokespecial   #1732 <Method void LabColor(PdfLabColor, float, float, float)>
	//   29   61:iconst_1        
	//   30   62:invokespecial   #1561 <Method void saveColor(BaseColor, boolean)>
		content.append(pdfname.getBytes()).append(" cs ");
	//   31   65:aload_0         
	//   32   66:getfield        #140 <Field ByteBuffer content>
	//   33   69:aload           5
	//   34   71:invokevirtual   #287 <Method byte[] PdfName.getBytes()>
	//   35   74:invokevirtual   #290 <Method ByteBuffer ByteBuffer.append(byte[])>
	//   36   77:ldc2            #1716 <String " cs ">
	//   37   80:invokevirtual   #278 <Method ByteBuffer ByteBuffer.append(String)>
	//   38   83:pop             
		content.append((new StringBuilder()).append(f).append(" ").append(f1).append(" ").append(f2).append(" ").toString());
	//   39   84:aload_0         
	//   40   85:getfield        #140 <Field ByteBuffer content>
	//   41   88:new             #1718 <Class StringBuilder>
	//   42   91:dup             
	//   43   92:invokespecial   #1719 <Method void StringBuilder()>
	//   44   95:fload_2         
	//   45   96:invokevirtual   #1722 <Method StringBuilder StringBuilder.append(float)>
	//   46   99:ldc2            #1724 <String " ">
	//   47  102:invokevirtual   #1727 <Method StringBuilder StringBuilder.append(String)>
	//   48  105:fload_3         
	//   49  106:invokevirtual   #1722 <Method StringBuilder StringBuilder.append(float)>
	//   50  109:ldc2            #1724 <String " ">
	//   51  112:invokevirtual   #1727 <Method StringBuilder StringBuilder.append(String)>
	//   52  115:fload           4
	//   53  117:invokevirtual   #1722 <Method StringBuilder StringBuilder.append(float)>
	//   54  120:ldc2            #1724 <String " ">
	//   55  123:invokevirtual   #1727 <Method StringBuilder StringBuilder.append(String)>
	//   56  126:invokevirtual   #1728 <Method String StringBuilder.toString()>
	//   57  129:invokevirtual   #278 <Method ByteBuffer ByteBuffer.append(String)>
	//   58  132:pop             
		content.append("scn").append_i(separator);
	//   59  133:aload_0         
	//   60  134:getfield        #140 <Field ByteBuffer content>
	//   61  137:ldc2            #1730 <String "scn">
	//   62  140:invokevirtual   #278 <Method ByteBuffer ByteBuffer.append(String)>
	//   63  143:aload_0         
	//   64  144:getfield        #152 <Field int separator>
	//   65  147:invokevirtual   #296 <Method ByteBuffer ByteBuffer.append_i(int)>
	//   66  150:pop             
	//   67  151:return          
	}

	public void setColorFill(PdfSpotColor pdfspotcolor, float f)
	{
		checkWriter();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #188 <Method void checkWriter()>
		state.colorDetails = writer.addSimple(((ICachedColorSpace) (pdfspotcolor)));
	//    2    4:aload_0         
	//    3    5:getfield        #145 <Field PdfContentByte$GraphicState state>
	//    4    8:aload_0         
	//    5    9:getfield        #164 <Field PdfWriter writer>
	//    6   12:aload_1         
	//    7   13:invokevirtual   #1708 <Method ColorDetails PdfWriter.addSimple(ICachedColorSpace)>
	//    8   16:putfield        #1712 <Field ColorDetails PdfContentByte$GraphicState.colorDetails>
		PdfName pdfname = getPageResources().addColor(state.colorDetails.getColorSpaceName(), state.colorDetails.getIndirectReference());
	//    9   19:aload_0         
	//   10   20:invokevirtual   #204 <Method PageResources getPageResources()>
	//   11   23:aload_0         
	//   12   24:getfield        #145 <Field PdfContentByte$GraphicState state>
	//   13   27:getfield        #1712 <Field ColorDetails PdfContentByte$GraphicState.colorDetails>
	//   14   30:invokevirtual   #1485 <Method PdfName ColorDetails.getColorSpaceName()>
	//   15   33:aload_0         
	//   16   34:getfield        #145 <Field PdfContentByte$GraphicState state>
	//   17   37:getfield        #1712 <Field ColorDetails PdfContentByte$GraphicState.colorDetails>
	//   18   40:invokevirtual   #1486 <Method PdfIndirectReference ColorDetails.getIndirectReference()>
	//   19   43:invokevirtual   #947 <Method PdfName PageResources.addColor(PdfName, PdfIndirectReference)>
	//   20   46:astore_3        
		saveColor(((BaseColor) (new SpotColor(pdfspotcolor, f))), true);
	//   21   47:aload_0         
	//   22   48:new             #1645 <Class SpotColor>
	//   23   51:dup             
	//   24   52:aload_1         
	//   25   53:fload_2         
	//   26   54:invokespecial   #1734 <Method void SpotColor(PdfSpotColor, float)>
	//   27   57:iconst_1        
	//   28   58:invokespecial   #1561 <Method void saveColor(BaseColor, boolean)>
		content.append(pdfname.getBytes()).append(" cs ").append(f).append(" scn").append_i(separator);
	//   29   61:aload_0         
	//   30   62:getfield        #140 <Field ByteBuffer content>
	//   31   65:aload_3         
	//   32   66:invokevirtual   #287 <Method byte[] PdfName.getBytes()>
	//   33   69:invokevirtual   #290 <Method ByteBuffer ByteBuffer.append(byte[])>
	//   34   72:ldc2            #1716 <String " cs ">
	//   35   75:invokevirtual   #278 <Method ByteBuffer ByteBuffer.append(String)>
	//   36   78:fload_2         
	//   37   79:invokevirtual   #178 <Method ByteBuffer ByteBuffer.append(float)>
	//   38   82:ldc2            #1736 <String " scn">
	//   39   85:invokevirtual   #278 <Method ByteBuffer ByteBuffer.append(String)>
	//   40   88:aload_0         
	//   41   89:getfield        #152 <Field int separator>
	//   42   92:invokevirtual   #296 <Method ByteBuffer ByteBuffer.append_i(int)>
	//   43   95:pop             
	//   44   96:return          
	}

	public void setColorStroke(BaseColor basecolor)
	{
		ExtendedColor.getType(basecolor);
	//    0    0:aload_1         
	//    1    1:invokestatic    #1427 <Method int ExtendedColor.getType(BaseColor)>
		JVM INSTR tableswitch 1 7: default 48
	//	               1 100
	//	               2 114
	//	               3 142
	//	               4 162
	//	               5 176
	//	               6 190
	//	               7 210;
	//    2    4:tableswitch     1 7: default 48
	//	               1 100
	//	               2 114
	//	               3 142
	//	               4 162
	//	               5 176
	//	               6 190
	//	               7 210
		   goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8
_L1:
		setRGBColorStroke(basecolor.getRed(), basecolor.getGreen(), basecolor.getBlue());
	//    3   48:aload_0         
	//    4   49:aload_1         
	//    5   50:invokevirtual   #1432 <Method int BaseColor.getRed()>
	//    6   53:aload_1         
	//    7   54:invokevirtual   #1436 <Method int BaseColor.getGreen()>
	//    8   57:aload_1         
	//    9   58:invokevirtual   #1439 <Method int BaseColor.getBlue()>
	//   10   61:invokevirtual   #1739 <Method void setRGBColorStroke(int, int, int)>
_L10:
		int i = basecolor.getAlpha();
	//   11   64:aload_1         
	//   12   65:invokevirtual   #1628 <Method int BaseColor.getAlpha()>
	//   13   68:istore_2        
		if(i < 255)
	//*  14   69:iload_2         
	//*  15   70:sipush          255
	//*  16   73:icmpge          99
		{
			basecolor = ((BaseColor) (new PdfGState()));
	//   17   76:new             #1630 <Class PdfGState>
	//   18   79:dup             
	//   19   80:invokespecial   #1631 <Method void PdfGState()>
	//   20   83:astore_1        
			((PdfGState) (basecolor)).setStrokeOpacity((float)i / 255F);
	//   21   84:aload_1         
	//   22   85:iload_2         
	//   23   86:i2f             
	//   24   87:ldc2            #1433 <Float 255F>
	//   25   90:fdiv            
	//   26   91:invokevirtual   #1742 <Method void PdfGState.setStrokeOpacity(float)>
			setGState(((PdfGState) (basecolor)));
	//   27   94:aload_0         
	//   28   95:aload_1         
	//   29   96:invokevirtual   #1638 <Method void setGState(PdfGState)>
		}
		return;
	//   30   99:return          
_L2:
		setGrayStroke(((GrayColor)basecolor).getGray());
	//   31  100:aload_0         
	//   32  101:aload_1         
	//   33  102:checkcast       #1441 <Class GrayColor>
	//   34  105:invokevirtual   #1444 <Method float GrayColor.getGray()>
	//   35  108:invokevirtual   #1745 <Method void setGrayStroke(float)>
		continue; /* Loop/switch isn't completed */
	//   36  111:goto            64
_L3:
		CMYKColor cmykcolor = (CMYKColor)basecolor;
	//   37  114:aload_1         
	//   38  115:checkcast       #1446 <Class CMYKColor>
	//   39  118:astore_3        
		setCMYKColorStrokeF(cmykcolor.getCyan(), cmykcolor.getMagenta(), cmykcolor.getYellow(), cmykcolor.getBlack());
	//   40  119:aload_0         
	//   41  120:aload_3         
	//   42  121:invokevirtual   #1449 <Method float CMYKColor.getCyan()>
	//   43  124:aload_3         
	//   44  125:invokevirtual   #1452 <Method float CMYKColor.getMagenta()>
	//   45  128:aload_3         
	//   46  129:invokevirtual   #1455 <Method float CMYKColor.getYellow()>
	//   47  132:aload_3         
	//   48  133:invokevirtual   #1458 <Method float CMYKColor.getBlack()>
	//   49  136:invokevirtual   #1747 <Method void setCMYKColorStrokeF(float, float, float, float)>
		continue; /* Loop/switch isn't completed */
	//   50  139:goto            64
_L4:
		SpotColor spotcolor = (SpotColor)basecolor;
	//   51  142:aload_1         
	//   52  143:checkcast       #1645 <Class SpotColor>
	//   53  146:astore_3        
		setColorStroke(spotcolor.getPdfSpotColor(), spotcolor.getTint());
	//   54  147:aload_0         
	//   55  148:aload_3         
	//   56  149:invokevirtual   #1649 <Method PdfSpotColor SpotColor.getPdfSpotColor()>
	//   57  152:aload_3         
	//   58  153:invokevirtual   #1652 <Method float SpotColor.getTint()>
	//   59  156:invokevirtual   #1749 <Method void setColorStroke(PdfSpotColor, float)>
		continue; /* Loop/switch isn't completed */
	//   60  159:goto            64
_L5:
		setPatternStroke(((PatternColor)basecolor).getPainter());
	//   61  162:aload_0         
	//   62  163:aload_1         
	//   63  164:checkcast       #1657 <Class PatternColor>
	//   64  167:invokevirtual   #1661 <Method PdfPatternPainter PatternColor.getPainter()>
	//   65  170:invokevirtual   #1752 <Method void setPatternStroke(PdfPatternPainter)>
		continue; /* Loop/switch isn't completed */
	//   66  173:goto            64
_L6:
		setShadingStroke(((ShadingColor)basecolor).getPdfShadingPattern());
	//   67  176:aload_0         
	//   68  177:aload_1         
	//   69  178:checkcast       #1667 <Class ShadingColor>
	//   70  181:invokevirtual   #1671 <Method PdfShadingPattern ShadingColor.getPdfShadingPattern()>
	//   71  184:invokevirtual   #1755 <Method void setShadingStroke(PdfShadingPattern)>
		continue; /* Loop/switch isn't completed */
	//   72  187:goto            64
_L7:
		DeviceNColor devicencolor = (DeviceNColor)basecolor;
	//   73  190:aload_1         
	//   74  191:checkcast       #1676 <Class DeviceNColor>
	//   75  194:astore_3        
		setColorStroke(devicencolor.getPdfDeviceNColor(), devicencolor.getTints());
	//   76  195:aload_0         
	//   77  196:aload_3         
	//   78  197:invokevirtual   #1680 <Method PdfDeviceNColor DeviceNColor.getPdfDeviceNColor()>
	//   79  200:aload_3         
	//   80  201:invokevirtual   #1683 <Method float[] DeviceNColor.getTints()>
	//   81  204:invokevirtual   #1757 <Method void setColorStroke(PdfDeviceNColor, float[])>
		continue; /* Loop/switch isn't completed */
	//   82  207:goto            64
_L8:
		LabColor labcolor = (LabColor)basecolor;
	//   83  210:aload_1         
	//   84  211:checkcast       #1688 <Class LabColor>
	//   85  214:astore_3        
		setColorStroke(labcolor.getLabColorSpace(), labcolor.getL(), labcolor.getA(), labcolor.getB());
	//   86  215:aload_0         
	//   87  216:aload_3         
	//   88  217:invokevirtual   #1692 <Method PdfLabColor LabColor.getLabColorSpace()>
	//   89  220:aload_3         
	//   90  221:invokevirtual   #1695 <Method float LabColor.getL()>
	//   91  224:aload_3         
	//   92  225:invokevirtual   #1698 <Method float LabColor.getA()>
	//   93  228:aload_3         
	//   94  229:invokevirtual   #1701 <Method float LabColor.getB()>
	//   95  232:invokevirtual   #1759 <Method void setColorStroke(PdfLabColor, float, float, float)>
		if(true) goto _L10; else goto _L9
	//   96  235:goto            64
_L9:
	}

	public void setColorStroke(PdfDeviceNColor pdfdevicencolor, float af[])
	{
		checkWriter();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #188 <Method void checkWriter()>
		state.colorDetails = writer.addSimple(((ICachedColorSpace) (pdfdevicencolor)));
	//    2    4:aload_0         
	//    3    5:getfield        #145 <Field PdfContentByte$GraphicState state>
	//    4    8:aload_0         
	//    5    9:getfield        #164 <Field PdfWriter writer>
	//    6   12:aload_1         
	//    7   13:invokevirtual   #1708 <Method ColorDetails PdfWriter.addSimple(ICachedColorSpace)>
	//    8   16:putfield        #1712 <Field ColorDetails PdfContentByte$GraphicState.colorDetails>
		PdfName pdfname = getPageResources().addColor(state.colorDetails.getColorSpaceName(), state.colorDetails.getIndirectReference());
	//    9   19:aload_0         
	//   10   20:invokevirtual   #204 <Method PageResources getPageResources()>
	//   11   23:aload_0         
	//   12   24:getfield        #145 <Field PdfContentByte$GraphicState state>
	//   13   27:getfield        #1712 <Field ColorDetails PdfContentByte$GraphicState.colorDetails>
	//   14   30:invokevirtual   #1485 <Method PdfName ColorDetails.getColorSpaceName()>
	//   15   33:aload_0         
	//   16   34:getfield        #145 <Field PdfContentByte$GraphicState state>
	//   17   37:getfield        #1712 <Field ColorDetails PdfContentByte$GraphicState.colorDetails>
	//   18   40:invokevirtual   #1486 <Method PdfIndirectReference ColorDetails.getIndirectReference()>
	//   19   43:invokevirtual   #947 <Method PdfName PageResources.addColor(PdfName, PdfIndirectReference)>
	//   20   46:astore          6
		saveColor(((BaseColor) (new DeviceNColor(pdfdevicencolor, af))), true);
	//   21   48:aload_0         
	//   22   49:new             #1676 <Class DeviceNColor>
	//   23   52:dup             
	//   24   53:aload_1         
	//   25   54:aload_2         
	//   26   55:invokespecial   #1714 <Method void DeviceNColor(PdfDeviceNColor, float[])>
	//   27   58:iconst_1        
	//   28   59:invokespecial   #1561 <Method void saveColor(BaseColor, boolean)>
		content.append(pdfname.getBytes()).append(" CS ");
	//   29   62:aload_0         
	//   30   63:getfield        #140 <Field ByteBuffer content>
	//   31   66:aload           6
	//   32   68:invokevirtual   #287 <Method byte[] PdfName.getBytes()>
	//   33   71:invokevirtual   #290 <Method ByteBuffer ByteBuffer.append(byte[])>
	//   34   74:ldc2            #1761 <String " CS ">
	//   35   77:invokevirtual   #278 <Method ByteBuffer ByteBuffer.append(String)>
	//   36   80:pop             
		int j = af.length;
	//   37   81:aload_2         
	//   38   82:arraylength     
	//   39   83:istore          5
		for(int i = 0; i < j; i++)
	//*  40   85:iconst_0        
	//*  41   86:istore          4
	//*  42   88:iload           4
	//*  43   90:iload           5
	//*  44   92:icmpge          137
		{
			float f = af[i];
	//   45   95:aload_2         
	//   46   96:iload           4
	//   47   98:faload          
	//   48   99:fstore_3        
			content.append((new StringBuilder()).append(f).append(" ").toString());
	//   49  100:aload_0         
	//   50  101:getfield        #140 <Field ByteBuffer content>
	//   51  104:new             #1718 <Class StringBuilder>
	//   52  107:dup             
	//   53  108:invokespecial   #1719 <Method void StringBuilder()>
	//   54  111:fload_3         
	//   55  112:invokevirtual   #1722 <Method StringBuilder StringBuilder.append(float)>
	//   56  115:ldc2            #1724 <String " ">
	//   57  118:invokevirtual   #1727 <Method StringBuilder StringBuilder.append(String)>
	//   58  121:invokevirtual   #1728 <Method String StringBuilder.toString()>
	//   59  124:invokevirtual   #278 <Method ByteBuffer ByteBuffer.append(String)>
	//   60  127:pop             
		}

	//   61  128:iload           4
	//   62  130:iconst_1        
	//   63  131:iadd            
	//   64  132:istore          4
	//*  65  134:goto            88
		content.append("SCN").append_i(separator);
	//   66  137:aload_0         
	//   67  138:getfield        #140 <Field ByteBuffer content>
	//   68  141:ldc2            #1763 <String "SCN">
	//   69  144:invokevirtual   #278 <Method ByteBuffer ByteBuffer.append(String)>
	//   70  147:aload_0         
	//   71  148:getfield        #152 <Field int separator>
	//   72  151:invokevirtual   #296 <Method ByteBuffer ByteBuffer.append_i(int)>
	//   73  154:pop             
	//   74  155:return          
	}

	public void setColorStroke(PdfLabColor pdflabcolor, float f, float f1, float f2)
	{
		checkWriter();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #188 <Method void checkWriter()>
		state.colorDetails = writer.addSimple(((ICachedColorSpace) (pdflabcolor)));
	//    2    4:aload_0         
	//    3    5:getfield        #145 <Field PdfContentByte$GraphicState state>
	//    4    8:aload_0         
	//    5    9:getfield        #164 <Field PdfWriter writer>
	//    6   12:aload_1         
	//    7   13:invokevirtual   #1708 <Method ColorDetails PdfWriter.addSimple(ICachedColorSpace)>
	//    8   16:putfield        #1712 <Field ColorDetails PdfContentByte$GraphicState.colorDetails>
		PdfName pdfname = getPageResources().addColor(state.colorDetails.getColorSpaceName(), state.colorDetails.getIndirectReference());
	//    9   19:aload_0         
	//   10   20:invokevirtual   #204 <Method PageResources getPageResources()>
	//   11   23:aload_0         
	//   12   24:getfield        #145 <Field PdfContentByte$GraphicState state>
	//   13   27:getfield        #1712 <Field ColorDetails PdfContentByte$GraphicState.colorDetails>
	//   14   30:invokevirtual   #1485 <Method PdfName ColorDetails.getColorSpaceName()>
	//   15   33:aload_0         
	//   16   34:getfield        #145 <Field PdfContentByte$GraphicState state>
	//   17   37:getfield        #1712 <Field ColorDetails PdfContentByte$GraphicState.colorDetails>
	//   18   40:invokevirtual   #1486 <Method PdfIndirectReference ColorDetails.getIndirectReference()>
	//   19   43:invokevirtual   #947 <Method PdfName PageResources.addColor(PdfName, PdfIndirectReference)>
	//   20   46:astore          5
		saveColor(((BaseColor) (new LabColor(pdflabcolor, f, f1, f2))), true);
	//   21   48:aload_0         
	//   22   49:new             #1688 <Class LabColor>
	//   23   52:dup             
	//   24   53:aload_1         
	//   25   54:fload_2         
	//   26   55:fload_3         
	//   27   56:fload           4
	//   28   58:invokespecial   #1732 <Method void LabColor(PdfLabColor, float, float, float)>
	//   29   61:iconst_1        
	//   30   62:invokespecial   #1561 <Method void saveColor(BaseColor, boolean)>
		content.append(pdfname.getBytes()).append(" CS ");
	//   31   65:aload_0         
	//   32   66:getfield        #140 <Field ByteBuffer content>
	//   33   69:aload           5
	//   34   71:invokevirtual   #287 <Method byte[] PdfName.getBytes()>
	//   35   74:invokevirtual   #290 <Method ByteBuffer ByteBuffer.append(byte[])>
	//   36   77:ldc2            #1761 <String " CS ">
	//   37   80:invokevirtual   #278 <Method ByteBuffer ByteBuffer.append(String)>
	//   38   83:pop             
		content.append((new StringBuilder()).append(f).append(" ").append(f1).append(" ").append(f2).append(" ").toString());
	//   39   84:aload_0         
	//   40   85:getfield        #140 <Field ByteBuffer content>
	//   41   88:new             #1718 <Class StringBuilder>
	//   42   91:dup             
	//   43   92:invokespecial   #1719 <Method void StringBuilder()>
	//   44   95:fload_2         
	//   45   96:invokevirtual   #1722 <Method StringBuilder StringBuilder.append(float)>
	//   46   99:ldc2            #1724 <String " ">
	//   47  102:invokevirtual   #1727 <Method StringBuilder StringBuilder.append(String)>
	//   48  105:fload_3         
	//   49  106:invokevirtual   #1722 <Method StringBuilder StringBuilder.append(float)>
	//   50  109:ldc2            #1724 <String " ">
	//   51  112:invokevirtual   #1727 <Method StringBuilder StringBuilder.append(String)>
	//   52  115:fload           4
	//   53  117:invokevirtual   #1722 <Method StringBuilder StringBuilder.append(float)>
	//   54  120:ldc2            #1724 <String " ">
	//   55  123:invokevirtual   #1727 <Method StringBuilder StringBuilder.append(String)>
	//   56  126:invokevirtual   #1728 <Method String StringBuilder.toString()>
	//   57  129:invokevirtual   #278 <Method ByteBuffer ByteBuffer.append(String)>
	//   58  132:pop             
		content.append("SCN").append_i(separator);
	//   59  133:aload_0         
	//   60  134:getfield        #140 <Field ByteBuffer content>
	//   61  137:ldc2            #1763 <String "SCN">
	//   62  140:invokevirtual   #278 <Method ByteBuffer ByteBuffer.append(String)>
	//   63  143:aload_0         
	//   64  144:getfield        #152 <Field int separator>
	//   65  147:invokevirtual   #296 <Method ByteBuffer ByteBuffer.append_i(int)>
	//   66  150:pop             
	//   67  151:return          
	}

	public void setColorStroke(PdfSpotColor pdfspotcolor, float f)
	{
		checkWriter();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #188 <Method void checkWriter()>
		state.colorDetails = writer.addSimple(((ICachedColorSpace) (pdfspotcolor)));
	//    2    4:aload_0         
	//    3    5:getfield        #145 <Field PdfContentByte$GraphicState state>
	//    4    8:aload_0         
	//    5    9:getfield        #164 <Field PdfWriter writer>
	//    6   12:aload_1         
	//    7   13:invokevirtual   #1708 <Method ColorDetails PdfWriter.addSimple(ICachedColorSpace)>
	//    8   16:putfield        #1712 <Field ColorDetails PdfContentByte$GraphicState.colorDetails>
		PdfName pdfname = getPageResources().addColor(state.colorDetails.getColorSpaceName(), state.colorDetails.getIndirectReference());
	//    9   19:aload_0         
	//   10   20:invokevirtual   #204 <Method PageResources getPageResources()>
	//   11   23:aload_0         
	//   12   24:getfield        #145 <Field PdfContentByte$GraphicState state>
	//   13   27:getfield        #1712 <Field ColorDetails PdfContentByte$GraphicState.colorDetails>
	//   14   30:invokevirtual   #1485 <Method PdfName ColorDetails.getColorSpaceName()>
	//   15   33:aload_0         
	//   16   34:getfield        #145 <Field PdfContentByte$GraphicState state>
	//   17   37:getfield        #1712 <Field ColorDetails PdfContentByte$GraphicState.colorDetails>
	//   18   40:invokevirtual   #1486 <Method PdfIndirectReference ColorDetails.getIndirectReference()>
	//   19   43:invokevirtual   #947 <Method PdfName PageResources.addColor(PdfName, PdfIndirectReference)>
	//   20   46:astore_3        
		saveColor(((BaseColor) (new SpotColor(pdfspotcolor, f))), false);
	//   21   47:aload_0         
	//   22   48:new             #1645 <Class SpotColor>
	//   23   51:dup             
	//   24   52:aload_1         
	//   25   53:fload_2         
	//   26   54:invokespecial   #1734 <Method void SpotColor(PdfSpotColor, float)>
	//   27   57:iconst_0        
	//   28   58:invokespecial   #1561 <Method void saveColor(BaseColor, boolean)>
		content.append(pdfname.getBytes()).append(" CS ").append(f).append(" SCN").append_i(separator);
	//   29   61:aload_0         
	//   30   62:getfield        #140 <Field ByteBuffer content>
	//   31   65:aload_3         
	//   32   66:invokevirtual   #287 <Method byte[] PdfName.getBytes()>
	//   33   69:invokevirtual   #290 <Method ByteBuffer ByteBuffer.append(byte[])>
	//   34   72:ldc2            #1761 <String " CS ">
	//   35   75:invokevirtual   #278 <Method ByteBuffer ByteBuffer.append(String)>
	//   36   78:fload_2         
	//   37   79:invokevirtual   #178 <Method ByteBuffer ByteBuffer.append(float)>
	//   38   82:ldc2            #1765 <String " SCN">
	//   39   85:invokevirtual   #278 <Method ByteBuffer ByteBuffer.append(String)>
	//   40   88:aload_0         
	//   41   89:getfield        #152 <Field int separator>
	//   42   92:invokevirtual   #296 <Method ByteBuffer ByteBuffer.append_i(int)>
	//   43   95:pop             
	//   44   96:return          
	}

	public void setDefaultColorspace(PdfName pdfname, PdfObject pdfobject)
	{
		getPageResources().addDefaultColor(pdfname, pdfobject);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #204 <Method PageResources getPageResources()>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #1769 <Method void PageResources.addDefaultColor(PdfName, PdfObject)>
	//    5    9:return          
	}

	public void setFlatness(double d)
	{
		if(d >= 0.0D && d <= 100D)
	//*   0    0:dload_1         
	//*   1    1:dconst_0        
	//*   2    2:dcmpl           
	//*   3    3:iflt            36
	//*   4    6:dload_1         
	//*   5    7:ldc2w           #553 <Double 100D>
	//*   6   10:dcmpg           
	//*   7   11:ifgt            36
			content.append(d).append(" i").append_i(separator);
	//    8   14:aload_0         
	//    9   15:getfield        #140 <Field ByteBuffer content>
	//   10   18:dload_1         
	//   11   19:invokevirtual   #281 <Method ByteBuffer ByteBuffer.append(double)>
	//   12   22:ldc2            #1773 <String " i">
	//   13   25:invokevirtual   #278 <Method ByteBuffer ByteBuffer.append(String)>
	//   14   28:aload_0         
	//   15   29:getfield        #152 <Field int separator>
	//   16   32:invokevirtual   #296 <Method ByteBuffer ByteBuffer.append_i(int)>
	//   17   35:pop             
	//   18   36:return          
	}

	public void setFlatness(float f)
	{
		setFlatness(f);
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:f2d             
	//    3    3:invokevirtual   #1775 <Method void setFlatness(double)>
	//    4    6:return          
	}

	public void setFontAndSize(BaseFont basefont, float f)
	{
		if(!inText && isTagged())
	//*   0    0:aload_0         
	//*   1    1:getfield        #156 <Field boolean inText>
	//*   2    4:ifne            19
	//*   3    7:aload_0         
	//*   4    8:invokevirtual   #220 <Method boolean isTagged()>
	//*   5   11:ifeq            19
			beginText(true);
	//    6   14:aload_0         
	//    7   15:iconst_1        
	//    8   16:invokevirtual   #490 <Method void beginText(boolean)>
		checkWriter();
	//    9   19:aload_0         
	//   10   20:invokevirtual   #188 <Method void checkWriter()>
		if(f < 0.0001F && f > -0.0001F)
	//*  11   23:fload_2         
	//*  12   24:ldc2            #1776 <Float 0.0001F>
	//*  13   27:fcmpg           
	//*  14   28:ifge            64
	//*  15   31:fload_2         
	//*  16   32:ldc2            #1777 <Float -0.0001F>
	//*  17   35:fcmpl           
	//*  18   36:ifle            64
		{
			throw new IllegalArgumentException(MessageLocalization.getComposedMessage("font.size.too.small.1", new Object[] {
				String.valueOf(f)
			}));
	//   19   39:new             #414 <Class IllegalArgumentException>
	//   20   42:dup             
	//   21   43:ldc2            #1779 <String "font.size.too.small.1">
	//   22   46:iconst_1        
	//   23   47:anewarray       Object[]
	//   24   50:dup             
	//   25   51:iconst_0        
	//   26   52:fload_2         
	//   27   53:invokestatic    #1782 <Method String String.valueOf(float)>
	//   28   56:aastore         
	//   29   57:invokestatic    #239 <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//   30   60:invokespecial   #427 <Method void IllegalArgumentException(String)>
	//   31   63:athrow          
		} else
		{
			state.size = f;
	//   32   64:aload_0         
	//   33   65:getfield        #145 <Field PdfContentByte$GraphicState state>
	//   34   68:fload_2         
	//   35   69:putfield        #521 <Field float PdfContentByte$GraphicState.size>
			state.fontDetails = writer.addSimple(basefont);
	//   36   72:aload_0         
	//   37   73:getfield        #145 <Field PdfContentByte$GraphicState state>
	//   38   76:aload_0         
	//   39   77:getfield        #164 <Field PdfWriter writer>
	//   40   80:aload_1         
	//   41   81:invokevirtual   #1785 <Method FontDetails PdfWriter.addSimple(BaseFont)>
	//   42   84:putfield        #512 <Field FontDetails PdfContentByte$GraphicState.fontDetails>
			basefont = ((BaseFont) (getPageResources().addFont(state.fontDetails.getFontName(), state.fontDetails.getIndirectReference())));
	//   43   87:aload_0         
	//   44   88:invokevirtual   #204 <Method PageResources getPageResources()>
	//   45   91:aload_0         
	//   46   92:getfield        #145 <Field PdfContentByte$GraphicState state>
	//   47   95:getfield        #512 <Field FontDetails PdfContentByte$GraphicState.fontDetails>
	//   48   98:invokevirtual   #1788 <Method PdfName FontDetails.getFontName()>
	//   49  101:aload_0         
	//   50  102:getfield        #145 <Field PdfContentByte$GraphicState state>
	//   51  105:getfield        #512 <Field FontDetails PdfContentByte$GraphicState.fontDetails>
	//   52  108:invokevirtual   #1789 <Method PdfIndirectReference FontDetails.getIndirectReference()>
	//   53  111:invokevirtual   #1792 <Method PdfName PageResources.addFont(PdfName, PdfIndirectReference)>
	//   54  114:astore_1        
			content.append(((PdfName) (basefont)).getBytes()).append(' ').append(f).append(" Tf").append_i(separator);
	//   55  115:aload_0         
	//   56  116:getfield        #140 <Field ByteBuffer content>
	//   57  119:aload_1         
	//   58  120:invokevirtual   #287 <Method byte[] PdfName.getBytes()>
	//   59  123:invokevirtual   #290 <Method ByteBuffer ByteBuffer.append(byte[])>
	//   60  126:bipush          32
	//   61  128:invokevirtual   #181 <Method ByteBuffer ByteBuffer.append(char)>
	//   62  131:fload_2         
	//   63  132:invokevirtual   #178 <Method ByteBuffer ByteBuffer.append(float)>
	//   64  135:ldc2            #1794 <String " Tf">
	//   65  138:invokevirtual   #278 <Method ByteBuffer ByteBuffer.append(String)>
	//   66  141:aload_0         
	//   67  142:getfield        #152 <Field int separator>
	//   68  145:invokevirtual   #296 <Method ByteBuffer ByteBuffer.append_i(int)>
	//   69  148:pop             
			return;
	//   70  149:return          
		}
	}

	public void setGState(PdfGState pdfgstate)
	{
		PdfObject apdfobject[] = writer.addSimpleExtGState(((PdfDictionary) (pdfgstate)));
	//    0    0:aload_0         
	//    1    1:getfield        #164 <Field PdfWriter writer>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #1798 <Method PdfObject[] PdfWriter.addSimpleExtGState(PdfDictionary)>
	//    4    8:astore_2        
		PdfName pdfname = getPageResources().addExtGState((PdfName)apdfobject[0], (PdfIndirectReference)apdfobject[1]);
	//    5    9:aload_0         
	//    6   10:invokevirtual   #204 <Method PageResources getPageResources()>
	//    7   13:aload_2         
	//    8   14:iconst_0        
	//    9   15:aaload          
	//   10   16:checkcast       #77  <Class PdfName>
	//   11   19:aload_2         
	//   12   20:iconst_1        
	//   13   21:aaload          
	//   14   22:checkcast       #1117 <Class PdfIndirectReference>
	//   15   25:invokevirtual   #1801 <Method PdfName PageResources.addExtGState(PdfName, PdfIndirectReference)>
	//   16   28:astore_2        
		state.extGState = ((PdfObject) (pdfgstate));
	//   17   29:aload_0         
	//   18   30:getfield        #145 <Field PdfContentByte$GraphicState state>
	//   19   33:aload_1         
	//   20   34:putfield        #1159 <Field PdfObject PdfContentByte$GraphicState.extGState>
		content.append(pdfname.getBytes()).append(" gs").append_i(separator);
	//   21   37:aload_0         
	//   22   38:getfield        #140 <Field ByteBuffer content>
	//   23   41:aload_2         
	//   24   42:invokevirtual   #287 <Method byte[] PdfName.getBytes()>
	//   25   45:invokevirtual   #290 <Method ByteBuffer ByteBuffer.append(byte[])>
	//   26   48:ldc2            #1803 <String " gs">
	//   27   51:invokevirtual   #278 <Method ByteBuffer ByteBuffer.append(String)>
	//   28   54:aload_0         
	//   29   55:getfield        #152 <Field int separator>
	//   30   58:invokevirtual   #296 <Method ByteBuffer ByteBuffer.append_i(int)>
	//   31   61:pop             
	//   32   62:return          
	}

	public void setGrayFill(float f)
	{
		saveColor(((BaseColor) (new GrayColor(f))), true);
	//    0    0:aload_0         
	//    1    1:new             #1441 <Class GrayColor>
	//    2    4:dup             
	//    3    5:fload_1         
	//    4    6:invokespecial   #1805 <Method void GrayColor(float)>
	//    5    9:iconst_1        
	//    6   10:invokespecial   #1561 <Method void saveColor(BaseColor, boolean)>
		content.append(f).append(" g").append_i(separator);
	//    7   13:aload_0         
	//    8   14:getfield        #140 <Field ByteBuffer content>
	//    9   17:fload_1         
	//   10   18:invokevirtual   #178 <Method ByteBuffer ByteBuffer.append(float)>
	//   11   21:ldc2            #1807 <String " g">
	//   12   24:invokevirtual   #278 <Method ByteBuffer ByteBuffer.append(String)>
	//   13   27:aload_0         
	//   14   28:getfield        #152 <Field int separator>
	//   15   31:invokevirtual   #296 <Method ByteBuffer ByteBuffer.append_i(int)>
	//   16   34:pop             
	//   17   35:return          
	}

	public void setGrayStroke(float f)
	{
		saveColor(((BaseColor) (new GrayColor(f))), false);
	//    0    0:aload_0         
	//    1    1:new             #1441 <Class GrayColor>
	//    2    4:dup             
	//    3    5:fload_1         
	//    4    6:invokespecial   #1805 <Method void GrayColor(float)>
	//    5    9:iconst_0        
	//    6   10:invokespecial   #1561 <Method void saveColor(BaseColor, boolean)>
		content.append(f).append(" G").append_i(separator);
	//    7   13:aload_0         
	//    8   14:getfield        #140 <Field ByteBuffer content>
	//    9   17:fload_1         
	//   10   18:invokevirtual   #178 <Method ByteBuffer ByteBuffer.append(float)>
	//   11   21:ldc2            #1809 <String " G">
	//   12   24:invokevirtual   #278 <Method ByteBuffer ByteBuffer.append(String)>
	//   13   27:aload_0         
	//   14   28:getfield        #152 <Field int separator>
	//   15   31:invokevirtual   #296 <Method ByteBuffer ByteBuffer.append_i(int)>
	//   16   34:pop             
	//   17   35:return          
	}

	public void setHorizontalScaling(float f)
	{
		if(!inText && isTagged())
	//*   0    0:aload_0         
	//*   1    1:getfield        #156 <Field boolean inText>
	//*   2    4:ifne            19
	//*   3    7:aload_0         
	//*   4    8:invokevirtual   #220 <Method boolean isTagged()>
	//*   5   11:ifeq            19
			beginText(true);
	//    6   14:aload_0         
	//    7   15:iconst_1        
	//    8   16:invokevirtual   #490 <Method void beginText(boolean)>
		state.scale = f;
	//    9   19:aload_0         
	//   10   20:getfield        #145 <Field PdfContentByte$GraphicState state>
	//   11   23:fload_1         
	//   12   24:putfield        #552 <Field float PdfContentByte$GraphicState.scale>
		content.append(f).append(" Tz").append_i(separator);
	//   13   27:aload_0         
	//   14   28:getfield        #140 <Field ByteBuffer content>
	//   15   31:fload_1         
	//   16   32:invokevirtual   #178 <Method ByteBuffer ByteBuffer.append(float)>
	//   17   35:ldc2            #1812 <String " Tz">
	//   18   38:invokevirtual   #278 <Method ByteBuffer ByteBuffer.append(String)>
	//   19   41:aload_0         
	//   20   42:getfield        #152 <Field int separator>
	//   21   45:invokevirtual   #296 <Method ByteBuffer ByteBuffer.append_i(int)>
	//   22   48:pop             
	//   23   49:return          
	}

	public void setLeading(float f)
	{
		if(!inText && isTagged())
	//*   0    0:aload_0         
	//*   1    1:getfield        #156 <Field boolean inText>
	//*   2    4:ifne            19
	//*   3    7:aload_0         
	//*   4    8:invokevirtual   #220 <Method boolean isTagged()>
	//*   5   11:ifeq            19
			beginText(true);
	//    6   14:aload_0         
	//    7   15:iconst_1        
	//    8   16:invokevirtual   #490 <Method void beginText(boolean)>
		state.leading = f;
	//    9   19:aload_0         
	//   10   20:getfield        #145 <Field PdfContentByte$GraphicState state>
	//   11   23:fload_1         
	//   12   24:putfield        #1362 <Field float PdfContentByte$GraphicState.leading>
		content.append(f).append(" TL").append_i(separator);
	//   13   27:aload_0         
	//   14   28:getfield        #140 <Field ByteBuffer content>
	//   15   31:fload_1         
	//   16   32:invokevirtual   #178 <Method ByteBuffer ByteBuffer.append(float)>
	//   17   35:ldc2            #1815 <String " TL">
	//   18   38:invokevirtual   #278 <Method ByteBuffer ByteBuffer.append(String)>
	//   19   41:aload_0         
	//   20   42:getfield        #152 <Field int separator>
	//   21   45:invokevirtual   #296 <Method ByteBuffer ByteBuffer.append_i(int)>
	//   22   48:pop             
	//   23   49:return          
	}

	public void setLineCap(int i)
	{
		if(i >= 0 && i <= 2)
	//*   0    0:iload_1         
	//*   1    1:iflt            31
	//*   2    4:iload_1         
	//*   3    5:iconst_2        
	//*   4    6:icmpgt          31
			content.append(i).append(" J").append_i(separator);
	//    5    9:aload_0         
	//    6   10:getfield        #140 <Field ByteBuffer content>
	//    7   13:iload_1         
	//    8   14:invokevirtual   #403 <Method ByteBuffer ByteBuffer.append(int)>
	//    9   17:ldc2            #1817 <String " J">
	//   10   20:invokevirtual   #278 <Method ByteBuffer ByteBuffer.append(String)>
	//   11   23:aload_0         
	//   12   24:getfield        #152 <Field int separator>
	//   13   27:invokevirtual   #296 <Method ByteBuffer ByteBuffer.append_i(int)>
	//   14   30:pop             
	//   15   31:return          
	}

	public void setLineDash(double d)
	{
		content.append("[] ").append(d).append(" d").append_i(separator);
	//    0    0:aload_0         
	//    1    1:getfield        #140 <Field ByteBuffer content>
	//    2    4:ldc2            #1820 <String "[] ">
	//    3    7:invokevirtual   #278 <Method ByteBuffer ByteBuffer.append(String)>
	//    4   10:dload_1         
	//    5   11:invokevirtual   #281 <Method ByteBuffer ByteBuffer.append(double)>
	//    6   14:ldc2            #1822 <String " d">
	//    7   17:invokevirtual   #278 <Method ByteBuffer ByteBuffer.append(String)>
	//    8   20:aload_0         
	//    9   21:getfield        #152 <Field int separator>
	//   10   24:invokevirtual   #296 <Method ByteBuffer ByteBuffer.append_i(int)>
	//   11   27:pop             
	//   12   28:return          
	}

	public void setLineDash(double d, double d1)
	{
		content.append("[").append(d).append("] ").append(d1).append(" d").append_i(separator);
	//    0    0:aload_0         
	//    1    1:getfield        #140 <Field ByteBuffer content>
	//    2    4:ldc2            #1824 <String "[">
	//    3    7:invokevirtual   #278 <Method ByteBuffer ByteBuffer.append(String)>
	//    4   10:dload_1         
	//    5   11:invokevirtual   #281 <Method ByteBuffer ByteBuffer.append(double)>
	//    6   14:ldc2            #1826 <String "] ">
	//    7   17:invokevirtual   #278 <Method ByteBuffer ByteBuffer.append(String)>
	//    8   20:dload_3         
	//    9   21:invokevirtual   #281 <Method ByteBuffer ByteBuffer.append(double)>
	//   10   24:ldc2            #1822 <String " d">
	//   11   27:invokevirtual   #278 <Method ByteBuffer ByteBuffer.append(String)>
	//   12   30:aload_0         
	//   13   31:getfield        #152 <Field int separator>
	//   14   34:invokevirtual   #296 <Method ByteBuffer ByteBuffer.append_i(int)>
	//   15   37:pop             
	//   16   38:return          
	}

	public void setLineDash(double d, double d1, double d2)
	{
		content.append("[").append(d).append(' ').append(d1).append("] ").append(d2).append(" d").append_i(separator);
	//    0    0:aload_0         
	//    1    1:getfield        #140 <Field ByteBuffer content>
	//    2    4:ldc2            #1824 <String "[">
	//    3    7:invokevirtual   #278 <Method ByteBuffer ByteBuffer.append(String)>
	//    4   10:dload_1         
	//    5   11:invokevirtual   #281 <Method ByteBuffer ByteBuffer.append(double)>
	//    6   14:bipush          32
	//    7   16:invokevirtual   #181 <Method ByteBuffer ByteBuffer.append(char)>
	//    8   19:dload_3         
	//    9   20:invokevirtual   #281 <Method ByteBuffer ByteBuffer.append(double)>
	//   10   23:ldc2            #1826 <String "] ">
	//   11   26:invokevirtual   #278 <Method ByteBuffer ByteBuffer.append(String)>
	//   12   29:dload           5
	//   13   31:invokevirtual   #281 <Method ByteBuffer ByteBuffer.append(double)>
	//   14   34:ldc2            #1822 <String " d">
	//   15   37:invokevirtual   #278 <Method ByteBuffer ByteBuffer.append(String)>
	//   16   40:aload_0         
	//   17   41:getfield        #152 <Field int separator>
	//   18   44:invokevirtual   #296 <Method ByteBuffer ByteBuffer.append_i(int)>
	//   19   47:pop             
	//   20   48:return          
	}

	public void setLineDash(float f)
	{
		setLineDash(f);
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:f2d             
	//    3    3:invokevirtual   #1828 <Method void setLineDash(double)>
	//    4    6:return          
	}

	public void setLineDash(float f, float f1)
	{
		setLineDash(f, f1);
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:f2d             
	//    3    3:fload_2         
	//    4    4:f2d             
	//    5    5:invokevirtual   #1830 <Method void setLineDash(double, double)>
	//    6    8:return          
	}

	public void setLineDash(float f, float f1, float f2)
	{
		setLineDash(f, f1, f2);
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:f2d             
	//    3    3:fload_2         
	//    4    4:f2d             
	//    5    5:fload_3         
	//    6    6:f2d             
	//    7    7:invokevirtual   #1832 <Method void setLineDash(double, double, double)>
	//    8   10:return          
	}

	public final void setLineDash(double ad[], double d)
	{
		content.append("[");
	//    0    0:aload_0         
	//    1    1:getfield        #140 <Field ByteBuffer content>
	//    2    4:ldc2            #1824 <String "[">
	//    3    7:invokevirtual   #278 <Method ByteBuffer ByteBuffer.append(String)>
	//    4   10:pop             
		for(int i = 0; i < ad.length; i++)
	//*   5   11:iconst_0        
	//*   6   12:istore          4
	//*   7   14:iload           4
	//*   8   16:aload_1         
	//*   9   17:arraylength     
	//*  10   18:icmpge          61
		{
			content.append(ad[i]);
	//   11   21:aload_0         
	//   12   22:getfield        #140 <Field ByteBuffer content>
	//   13   25:aload_1         
	//   14   26:iload           4
	//   15   28:daload          
	//   16   29:invokevirtual   #281 <Method ByteBuffer ByteBuffer.append(double)>
	//   17   32:pop             
			if(i < ad.length - 1)
	//*  18   33:iload           4
	//*  19   35:aload_1         
	//*  20   36:arraylength     
	//*  21   37:iconst_1        
	//*  22   38:isub            
	//*  23   39:icmpge          52
				content.append(' ');
	//   24   42:aload_0         
	//   25   43:getfield        #140 <Field ByteBuffer content>
	//   26   46:bipush          32
	//   27   48:invokevirtual   #181 <Method ByteBuffer ByteBuffer.append(char)>
	//   28   51:pop             
		}

	//   29   52:iload           4
	//   30   54:iconst_1        
	//   31   55:iadd            
	//   32   56:istore          4
	//*  33   58:goto            14
		content.append("] ").append(d).append(" d").append_i(separator);
	//   34   61:aload_0         
	//   35   62:getfield        #140 <Field ByteBuffer content>
	//   36   65:ldc2            #1826 <String "] ">
	//   37   68:invokevirtual   #278 <Method ByteBuffer ByteBuffer.append(String)>
	//   38   71:dload_2         
	//   39   72:invokevirtual   #281 <Method ByteBuffer ByteBuffer.append(double)>
	//   40   75:ldc2            #1822 <String " d">
	//   41   78:invokevirtual   #278 <Method ByteBuffer ByteBuffer.append(String)>
	//   42   81:aload_0         
	//   43   82:getfield        #152 <Field int separator>
	//   44   85:invokevirtual   #296 <Method ByteBuffer ByteBuffer.append_i(int)>
	//   45   88:pop             
	//   46   89:return          
	}

	public final void setLineDash(float af[], float f)
	{
		content.append("[");
	//    0    0:aload_0         
	//    1    1:getfield        #140 <Field ByteBuffer content>
	//    2    4:ldc2            #1824 <String "[">
	//    3    7:invokevirtual   #278 <Method ByteBuffer ByteBuffer.append(String)>
	//    4   10:pop             
		for(int i = 0; i < af.length; i++)
	//*   5   11:iconst_0        
	//*   6   12:istore_3        
	//*   7   13:iload_3         
	//*   8   14:aload_1         
	//*   9   15:arraylength     
	//*  10   16:icmpge          55
		{
			content.append(af[i]);
	//   11   19:aload_0         
	//   12   20:getfield        #140 <Field ByteBuffer content>
	//   13   23:aload_1         
	//   14   24:iload_3         
	//   15   25:faload          
	//   16   26:invokevirtual   #178 <Method ByteBuffer ByteBuffer.append(float)>
	//   17   29:pop             
			if(i < af.length - 1)
	//*  18   30:iload_3         
	//*  19   31:aload_1         
	//*  20   32:arraylength     
	//*  21   33:iconst_1        
	//*  22   34:isub            
	//*  23   35:icmpge          48
				content.append(' ');
	//   24   38:aload_0         
	//   25   39:getfield        #140 <Field ByteBuffer content>
	//   26   42:bipush          32
	//   27   44:invokevirtual   #181 <Method ByteBuffer ByteBuffer.append(char)>
	//   28   47:pop             
		}

	//   29   48:iload_3         
	//   30   49:iconst_1        
	//   31   50:iadd            
	//   32   51:istore_3        
	//*  33   52:goto            13
		content.append("] ").append(f).append(" d").append_i(separator);
	//   34   55:aload_0         
	//   35   56:getfield        #140 <Field ByteBuffer content>
	//   36   59:ldc2            #1826 <String "] ">
	//   37   62:invokevirtual   #278 <Method ByteBuffer ByteBuffer.append(String)>
	//   38   65:fload_2         
	//   39   66:invokevirtual   #178 <Method ByteBuffer ByteBuffer.append(float)>
	//   40   69:ldc2            #1822 <String " d">
	//   41   72:invokevirtual   #278 <Method ByteBuffer ByteBuffer.append(String)>
	//   42   75:aload_0         
	//   43   76:getfield        #152 <Field int separator>
	//   44   79:invokevirtual   #296 <Method ByteBuffer ByteBuffer.append_i(int)>
	//   45   82:pop             
	//   46   83:return          
	}

	public void setLineJoin(int i)
	{
		if(i >= 0 && i <= 2)
	//*   0    0:iload_1         
	//*   1    1:iflt            31
	//*   2    4:iload_1         
	//*   3    5:iconst_2        
	//*   4    6:icmpgt          31
			content.append(i).append(" j").append_i(separator);
	//    5    9:aload_0         
	//    6   10:getfield        #140 <Field ByteBuffer content>
	//    7   13:iload_1         
	//    8   14:invokevirtual   #403 <Method ByteBuffer ByteBuffer.append(int)>
	//    9   17:ldc2            #1837 <String " j">
	//   10   20:invokevirtual   #278 <Method ByteBuffer ByteBuffer.append(String)>
	//   11   23:aload_0         
	//   12   24:getfield        #152 <Field int separator>
	//   13   27:invokevirtual   #296 <Method ByteBuffer ByteBuffer.append_i(int)>
	//   14   30:pop             
	//   15   31:return          
	}

	public void setLineWidth(double d)
	{
		content.append(d).append(" w").append_i(separator);
	//    0    0:aload_0         
	//    1    1:getfield        #140 <Field ByteBuffer content>
	//    2    4:dload_1         
	//    3    5:invokevirtual   #281 <Method ByteBuffer ByteBuffer.append(double)>
	//    4    8:ldc2            #1839 <String " w">
	//    5   11:invokevirtual   #278 <Method ByteBuffer ByteBuffer.append(String)>
	//    6   14:aload_0         
	//    7   15:getfield        #152 <Field int separator>
	//    8   18:invokevirtual   #296 <Method ByteBuffer ByteBuffer.append_i(int)>
	//    9   21:pop             
	//   10   22:return          
	}

	public void setLineWidth(float f)
	{
		setLineWidth(f);
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:f2d             
	//    3    3:invokevirtual   #1841 <Method void setLineWidth(double)>
	//    4    6:return          
	}

	public void setLiteral(char c)
	{
		content.append(c);
	//    0    0:aload_0         
	//    1    1:getfield        #140 <Field ByteBuffer content>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #181 <Method ByteBuffer ByteBuffer.append(char)>
	//    4    8:pop             
	//    5    9:return          
	}

	public void setLiteral(float f)
	{
		content.append(f);
	//    0    0:aload_0         
	//    1    1:getfield        #140 <Field ByteBuffer content>
	//    2    4:fload_1         
	//    3    5:invokevirtual   #178 <Method ByteBuffer ByteBuffer.append(float)>
	//    4    8:pop             
	//    5    9:return          
	}

	public void setLiteral(String s)
	{
		content.append(s);
	//    0    0:aload_0         
	//    1    1:getfield        #140 <Field ByteBuffer content>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #278 <Method ByteBuffer ByteBuffer.append(String)>
	//    4    8:pop             
	//    5    9:return          
	}

	protected void setMcDepth(int i)
	{
		if(duplicatedFrom != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #162 <Field PdfContentByte duplicatedFrom>
	//*   2    4:ifnull          16
		{
			duplicatedFrom.setMcDepth(i);
	//    3    7:aload_0         
	//    4    8:getfield        #162 <Field PdfContentByte duplicatedFrom>
	//    5   11:iload_1         
	//    6   12:invokevirtual   #394 <Method void setMcDepth(int)>
			return;
	//    7   15:return          
		} else
		{
			mcDepth = i;
	//    8   16:aload_0         
	//    9   17:iload_1         
	//   10   18:putfield        #154 <Field int mcDepth>
			return;
	//   11   21:return          
		}
	}

	protected void setMcElements(ArrayList arraylist)
	{
		if(duplicatedFrom != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #162 <Field PdfContentByte duplicatedFrom>
	//*   2    4:ifnull          16
		{
			duplicatedFrom.setMcElements(arraylist);
	//    3    7:aload_0         
	//    4    8:getfield        #162 <Field PdfContentByte duplicatedFrom>
	//    5   11:aload_1         
	//    6   12:invokevirtual   #1582 <Method void setMcElements(ArrayList)>
			return;
	//    7   15:return          
		} else
		{
			mcElements = arraylist;
	//    8   16:aload_0         
	//    9   17:aload_1         
	//   10   18:putfield        #160 <Field ArrayList mcElements>
			return;
	//   11   21:return          
		}
	}

	public void setMiterLimit(double d)
	{
		if(d > 1.0D)
	//*   0    0:dload_1         
	//*   1    1:dconst_1        
	//*   2    2:dcmpl           
	//*   3    3:ifle            28
			content.append(d).append(" M").append_i(separator);
	//    4    6:aload_0         
	//    5    7:getfield        #140 <Field ByteBuffer content>
	//    6   10:dload_1         
	//    7   11:invokevirtual   #281 <Method ByteBuffer ByteBuffer.append(double)>
	//    8   14:ldc2            #1846 <String " M">
	//    9   17:invokevirtual   #278 <Method ByteBuffer ByteBuffer.append(String)>
	//   10   20:aload_0         
	//   11   21:getfield        #152 <Field int separator>
	//   12   24:invokevirtual   #296 <Method ByteBuffer ByteBuffer.append_i(int)>
	//   13   27:pop             
	//   14   28:return          
	}

	public void setMiterLimit(float f)
	{
		setMiterLimit(f);
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:f2d             
	//    3    3:invokevirtual   #1848 <Method void setMiterLimit(double)>
	//    4    6:return          
	}

	public void setPatternFill(PdfPatternPainter pdfpatternpainter)
	{
		if(pdfpatternpainter.isStencil())
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #1851 <Method boolean PdfPatternPainter.isStencil()>
	//*   2    4:ifeq            17
		{
			setPatternFill(pdfpatternpainter, pdfpatternpainter.getDefaultColor());
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:aload_1         
	//    6   10:invokevirtual   #1854 <Method BaseColor PdfPatternPainter.getDefaultColor()>
	//    7   13:invokevirtual   #1857 <Method void setPatternFill(PdfPatternPainter, BaseColor)>
			return;
	//    8   16:return          
		} else
		{
			checkWriter();
	//    9   17:aload_0         
	//   10   18:invokevirtual   #188 <Method void checkWriter()>
			PdfName pdfname = getPageResources().addPattern(writer.addSimplePattern(pdfpatternpainter), pdfpatternpainter.getIndirectReference());
	//   11   21:aload_0         
	//   12   22:invokevirtual   #204 <Method PageResources getPageResources()>
	//   13   25:aload_0         
	//   14   26:getfield        #164 <Field PdfWriter writer>
	//   15   29:aload_1         
	//   16   30:invokevirtual   #1231 <Method PdfName PdfWriter.addSimplePattern(PdfPatternPainter)>
	//   17   33:aload_1         
	//   18   34:invokevirtual   #1858 <Method PdfIndirectReference PdfPatternPainter.getIndirectReference()>
	//   19   37:invokevirtual   #1861 <Method PdfName PageResources.addPattern(PdfName, PdfIndirectReference)>
	//   20   40:astore_2        
			saveColor(((BaseColor) (new PatternColor(pdfpatternpainter))), true);
	//   21   41:aload_0         
	//   22   42:new             #1657 <Class PatternColor>
	//   23   45:dup             
	//   24   46:aload_1         
	//   25   47:invokespecial   #1863 <Method void PatternColor(PdfPatternPainter)>
	//   26   50:iconst_1        
	//   27   51:invokespecial   #1561 <Method void saveColor(BaseColor, boolean)>
			content.append(PdfName.PATTERN.getBytes()).append(" cs ").append(pdfname.getBytes()).append(" scn").append_i(separator);
	//   28   54:aload_0         
	//   29   55:getfield        #140 <Field ByteBuffer content>
	//   30   58:getstatic       #1866 <Field PdfName PdfName.PATTERN>
	//   31   61:invokevirtual   #287 <Method byte[] PdfName.getBytes()>
	//   32   64:invokevirtual   #290 <Method ByteBuffer ByteBuffer.append(byte[])>
	//   33   67:ldc2            #1716 <String " cs ">
	//   34   70:invokevirtual   #278 <Method ByteBuffer ByteBuffer.append(String)>
	//   35   73:aload_2         
	//   36   74:invokevirtual   #287 <Method byte[] PdfName.getBytes()>
	//   37   77:invokevirtual   #290 <Method ByteBuffer ByteBuffer.append(byte[])>
	//   38   80:ldc2            #1736 <String " scn">
	//   39   83:invokevirtual   #278 <Method ByteBuffer ByteBuffer.append(String)>
	//   40   86:aload_0         
	//   41   87:getfield        #152 <Field int separator>
	//   42   90:invokevirtual   #296 <Method ByteBuffer ByteBuffer.append_i(int)>
	//   43   93:pop             
			return;
	//   44   94:return          
		}
	}

	public void setPatternFill(PdfPatternPainter pdfpatternpainter, BaseColor basecolor)
	{
		if(ExtendedColor.getType(basecolor) == 3)
	//*   0    0:aload_2         
	//*   1    1:invokestatic    #1427 <Method int ExtendedColor.getType(BaseColor)>
	//*   2    4:iconst_3        
	//*   3    5:icmpne          22
		{
			setPatternFill(pdfpatternpainter, basecolor, ((SpotColor)basecolor).getTint());
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:aload_2         
	//    7   11:aload_2         
	//    8   12:checkcast       #1645 <Class SpotColor>
	//    9   15:invokevirtual   #1652 <Method float SpotColor.getTint()>
	//   10   18:invokevirtual   #1869 <Method void setPatternFill(PdfPatternPainter, BaseColor, float)>
			return;
	//   11   21:return          
		} else
		{
			setPatternFill(pdfpatternpainter, basecolor, 0.0F);
	//   12   22:aload_0         
	//   13   23:aload_1         
	//   14   24:aload_2         
	//   15   25:fconst_0        
	//   16   26:invokevirtual   #1869 <Method void setPatternFill(PdfPatternPainter, BaseColor, float)>
			return;
	//   17   29:return          
		}
	}

	public void setPatternFill(PdfPatternPainter pdfpatternpainter, BaseColor basecolor, float f)
	{
		checkWriter();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #188 <Method void checkWriter()>
		if(!pdfpatternpainter.isStencil())
	//*   2    4:aload_1         
	//*   3    5:invokevirtual   #1851 <Method boolean PdfPatternPainter.isStencil()>
	//*   4    8:ifne            29
		{
			throw new RuntimeException(MessageLocalization.getComposedMessage("an.uncolored.pattern.was.expected", new Object[0]));
	//    5   11:new             #231 <Class RuntimeException>
	//    6   14:dup             
	//    7   15:ldc2            #1871 <String "an.uncolored.pattern.was.expected">
	//    8   18:iconst_0        
	//    9   19:anewarray       Object[]
	//   10   22:invokestatic    #239 <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//   11   25:invokespecial   #242 <Method void RuntimeException(String)>
	//   12   28:athrow          
		} else
		{
			Object obj = ((Object) (getPageResources()));
	//   13   29:aload_0         
	//   14   30:invokevirtual   #204 <Method PageResources getPageResources()>
	//   15   33:astore          5
			PdfName pdfname = ((PageResources) (obj)).addPattern(writer.addSimplePattern(pdfpatternpainter), pdfpatternpainter.getIndirectReference());
	//   16   35:aload           5
	//   17   37:aload_0         
	//   18   38:getfield        #164 <Field PdfWriter writer>
	//   19   41:aload_1         
	//   20   42:invokevirtual   #1231 <Method PdfName PdfWriter.addSimplePattern(PdfPatternPainter)>
	//   21   45:aload_1         
	//   22   46:invokevirtual   #1858 <Method PdfIndirectReference PdfPatternPainter.getIndirectReference()>
	//   23   49:invokevirtual   #1861 <Method PdfName PageResources.addPattern(PdfName, PdfIndirectReference)>
	//   24   52:astore          4
			ColorDetails colordetails = writer.addSimplePatternColorspace(basecolor);
	//   25   54:aload_0         
	//   26   55:getfield        #164 <Field PdfWriter writer>
	//   27   58:aload_2         
	//   28   59:invokevirtual   #1875 <Method ColorDetails PdfWriter.addSimplePatternColorspace(BaseColor)>
	//   29   62:astore          6
			obj = ((Object) (((PageResources) (obj)).addColor(colordetails.getColorSpaceName(), colordetails.getIndirectReference())));
	//   30   64:aload           5
	//   31   66:aload           6
	//   32   68:invokevirtual   #1485 <Method PdfName ColorDetails.getColorSpaceName()>
	//   33   71:aload           6
	//   34   73:invokevirtual   #1486 <Method PdfIndirectReference ColorDetails.getIndirectReference()>
	//   35   76:invokevirtual   #947 <Method PdfName PageResources.addColor(PdfName, PdfIndirectReference)>
	//   36   79:astore          5
			saveColor(((BaseColor) (new UncoloredPattern(pdfpatternpainter, basecolor, f))), true);
	//   37   81:aload_0         
	//   38   82:new             #9   <Class PdfContentByte$UncoloredPattern>
	//   39   85:dup             
	//   40   86:aload_1         
	//   41   87:aload_2         
	//   42   88:fload_3         
	//   43   89:invokespecial   #1877 <Method void PdfContentByte$UncoloredPattern(PdfPatternPainter, BaseColor, float)>
	//   44   92:iconst_1        
	//   45   93:invokespecial   #1561 <Method void saveColor(BaseColor, boolean)>
			content.append(((PdfName) (obj)).getBytes()).append(" cs").append_i(separator);
	//   46   96:aload_0         
	//   47   97:getfield        #140 <Field ByteBuffer content>
	//   48  100:aload           5
	//   49  102:invokevirtual   #287 <Method byte[] PdfName.getBytes()>
	//   50  105:invokevirtual   #290 <Method ByteBuffer ByteBuffer.append(byte[])>
	//   51  108:ldc2            #1879 <String " cs">
	//   52  111:invokevirtual   #278 <Method ByteBuffer ByteBuffer.append(String)>
	//   53  114:aload_0         
	//   54  115:getfield        #152 <Field int separator>
	//   55  118:invokevirtual   #296 <Method ByteBuffer ByteBuffer.append_i(int)>
	//   56  121:pop             
			outputColorNumbers(basecolor, f);
	//   57  122:aload_0         
	//   58  123:aload_2         
	//   59  124:fload_3         
	//   60  125:invokevirtual   #1881 <Method void outputColorNumbers(BaseColor, float)>
			content.append(' ').append(pdfname.getBytes()).append(" scn").append_i(separator);
	//   61  128:aload_0         
	//   62  129:getfield        #140 <Field ByteBuffer content>
	//   63  132:bipush          32
	//   64  134:invokevirtual   #181 <Method ByteBuffer ByteBuffer.append(char)>
	//   65  137:aload           4
	//   66  139:invokevirtual   #287 <Method byte[] PdfName.getBytes()>
	//   67  142:invokevirtual   #290 <Method ByteBuffer ByteBuffer.append(byte[])>
	//   68  145:ldc2            #1736 <String " scn">
	//   69  148:invokevirtual   #278 <Method ByteBuffer ByteBuffer.append(String)>
	//   70  151:aload_0         
	//   71  152:getfield        #152 <Field int separator>
	//   72  155:invokevirtual   #296 <Method ByteBuffer ByteBuffer.append_i(int)>
	//   73  158:pop             
			return;
	//   74  159:return          
		}
	}

	public void setPatternStroke(PdfPatternPainter pdfpatternpainter)
	{
		if(pdfpatternpainter.isStencil())
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #1851 <Method boolean PdfPatternPainter.isStencil()>
	//*   2    4:ifeq            17
		{
			setPatternStroke(pdfpatternpainter, pdfpatternpainter.getDefaultColor());
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:aload_1         
	//    6   10:invokevirtual   #1854 <Method BaseColor PdfPatternPainter.getDefaultColor()>
	//    7   13:invokevirtual   #1883 <Method void setPatternStroke(PdfPatternPainter, BaseColor)>
			return;
	//    8   16:return          
		} else
		{
			checkWriter();
	//    9   17:aload_0         
	//   10   18:invokevirtual   #188 <Method void checkWriter()>
			PdfName pdfname = getPageResources().addPattern(writer.addSimplePattern(pdfpatternpainter), pdfpatternpainter.getIndirectReference());
	//   11   21:aload_0         
	//   12   22:invokevirtual   #204 <Method PageResources getPageResources()>
	//   13   25:aload_0         
	//   14   26:getfield        #164 <Field PdfWriter writer>
	//   15   29:aload_1         
	//   16   30:invokevirtual   #1231 <Method PdfName PdfWriter.addSimplePattern(PdfPatternPainter)>
	//   17   33:aload_1         
	//   18   34:invokevirtual   #1858 <Method PdfIndirectReference PdfPatternPainter.getIndirectReference()>
	//   19   37:invokevirtual   #1861 <Method PdfName PageResources.addPattern(PdfName, PdfIndirectReference)>
	//   20   40:astore_2        
			saveColor(((BaseColor) (new PatternColor(pdfpatternpainter))), false);
	//   21   41:aload_0         
	//   22   42:new             #1657 <Class PatternColor>
	//   23   45:dup             
	//   24   46:aload_1         
	//   25   47:invokespecial   #1863 <Method void PatternColor(PdfPatternPainter)>
	//   26   50:iconst_0        
	//   27   51:invokespecial   #1561 <Method void saveColor(BaseColor, boolean)>
			content.append(PdfName.PATTERN.getBytes()).append(" CS ").append(pdfname.getBytes()).append(" SCN").append_i(separator);
	//   28   54:aload_0         
	//   29   55:getfield        #140 <Field ByteBuffer content>
	//   30   58:getstatic       #1866 <Field PdfName PdfName.PATTERN>
	//   31   61:invokevirtual   #287 <Method byte[] PdfName.getBytes()>
	//   32   64:invokevirtual   #290 <Method ByteBuffer ByteBuffer.append(byte[])>
	//   33   67:ldc2            #1761 <String " CS ">
	//   34   70:invokevirtual   #278 <Method ByteBuffer ByteBuffer.append(String)>
	//   35   73:aload_2         
	//   36   74:invokevirtual   #287 <Method byte[] PdfName.getBytes()>
	//   37   77:invokevirtual   #290 <Method ByteBuffer ByteBuffer.append(byte[])>
	//   38   80:ldc2            #1765 <String " SCN">
	//   39   83:invokevirtual   #278 <Method ByteBuffer ByteBuffer.append(String)>
	//   40   86:aload_0         
	//   41   87:getfield        #152 <Field int separator>
	//   42   90:invokevirtual   #296 <Method ByteBuffer ByteBuffer.append_i(int)>
	//   43   93:pop             
			return;
	//   44   94:return          
		}
	}

	public void setPatternStroke(PdfPatternPainter pdfpatternpainter, BaseColor basecolor)
	{
		if(ExtendedColor.getType(basecolor) == 3)
	//*   0    0:aload_2         
	//*   1    1:invokestatic    #1427 <Method int ExtendedColor.getType(BaseColor)>
	//*   2    4:iconst_3        
	//*   3    5:icmpne          22
		{
			setPatternStroke(pdfpatternpainter, basecolor, ((SpotColor)basecolor).getTint());
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:aload_2         
	//    7   11:aload_2         
	//    8   12:checkcast       #1645 <Class SpotColor>
	//    9   15:invokevirtual   #1652 <Method float SpotColor.getTint()>
	//   10   18:invokevirtual   #1885 <Method void setPatternStroke(PdfPatternPainter, BaseColor, float)>
			return;
	//   11   21:return          
		} else
		{
			setPatternStroke(pdfpatternpainter, basecolor, 0.0F);
	//   12   22:aload_0         
	//   13   23:aload_1         
	//   14   24:aload_2         
	//   15   25:fconst_0        
	//   16   26:invokevirtual   #1885 <Method void setPatternStroke(PdfPatternPainter, BaseColor, float)>
			return;
	//   17   29:return          
		}
	}

	public void setPatternStroke(PdfPatternPainter pdfpatternpainter, BaseColor basecolor, float f)
	{
		checkWriter();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #188 <Method void checkWriter()>
		if(!pdfpatternpainter.isStencil())
	//*   2    4:aload_1         
	//*   3    5:invokevirtual   #1851 <Method boolean PdfPatternPainter.isStencil()>
	//*   4    8:ifne            29
		{
			throw new RuntimeException(MessageLocalization.getComposedMessage("an.uncolored.pattern.was.expected", new Object[0]));
	//    5   11:new             #231 <Class RuntimeException>
	//    6   14:dup             
	//    7   15:ldc2            #1871 <String "an.uncolored.pattern.was.expected">
	//    8   18:iconst_0        
	//    9   19:anewarray       Object[]
	//   10   22:invokestatic    #239 <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//   11   25:invokespecial   #242 <Method void RuntimeException(String)>
	//   12   28:athrow          
		} else
		{
			Object obj = ((Object) (getPageResources()));
	//   13   29:aload_0         
	//   14   30:invokevirtual   #204 <Method PageResources getPageResources()>
	//   15   33:astore          5
			PdfName pdfname = ((PageResources) (obj)).addPattern(writer.addSimplePattern(pdfpatternpainter), pdfpatternpainter.getIndirectReference());
	//   16   35:aload           5
	//   17   37:aload_0         
	//   18   38:getfield        #164 <Field PdfWriter writer>
	//   19   41:aload_1         
	//   20   42:invokevirtual   #1231 <Method PdfName PdfWriter.addSimplePattern(PdfPatternPainter)>
	//   21   45:aload_1         
	//   22   46:invokevirtual   #1858 <Method PdfIndirectReference PdfPatternPainter.getIndirectReference()>
	//   23   49:invokevirtual   #1861 <Method PdfName PageResources.addPattern(PdfName, PdfIndirectReference)>
	//   24   52:astore          4
			ColorDetails colordetails = writer.addSimplePatternColorspace(basecolor);
	//   25   54:aload_0         
	//   26   55:getfield        #164 <Field PdfWriter writer>
	//   27   58:aload_2         
	//   28   59:invokevirtual   #1875 <Method ColorDetails PdfWriter.addSimplePatternColorspace(BaseColor)>
	//   29   62:astore          6
			obj = ((Object) (((PageResources) (obj)).addColor(colordetails.getColorSpaceName(), colordetails.getIndirectReference())));
	//   30   64:aload           5
	//   31   66:aload           6
	//   32   68:invokevirtual   #1485 <Method PdfName ColorDetails.getColorSpaceName()>
	//   33   71:aload           6
	//   34   73:invokevirtual   #1486 <Method PdfIndirectReference ColorDetails.getIndirectReference()>
	//   35   76:invokevirtual   #947 <Method PdfName PageResources.addColor(PdfName, PdfIndirectReference)>
	//   36   79:astore          5
			saveColor(((BaseColor) (new UncoloredPattern(pdfpatternpainter, basecolor, f))), false);
	//   37   81:aload_0         
	//   38   82:new             #9   <Class PdfContentByte$UncoloredPattern>
	//   39   85:dup             
	//   40   86:aload_1         
	//   41   87:aload_2         
	//   42   88:fload_3         
	//   43   89:invokespecial   #1877 <Method void PdfContentByte$UncoloredPattern(PdfPatternPainter, BaseColor, float)>
	//   44   92:iconst_0        
	//   45   93:invokespecial   #1561 <Method void saveColor(BaseColor, boolean)>
			content.append(((PdfName) (obj)).getBytes()).append(" CS").append_i(separator);
	//   46   96:aload_0         
	//   47   97:getfield        #140 <Field ByteBuffer content>
	//   48  100:aload           5
	//   49  102:invokevirtual   #287 <Method byte[] PdfName.getBytes()>
	//   50  105:invokevirtual   #290 <Method ByteBuffer ByteBuffer.append(byte[])>
	//   51  108:ldc2            #1887 <String " CS">
	//   52  111:invokevirtual   #278 <Method ByteBuffer ByteBuffer.append(String)>
	//   53  114:aload_0         
	//   54  115:getfield        #152 <Field int separator>
	//   55  118:invokevirtual   #296 <Method ByteBuffer ByteBuffer.append_i(int)>
	//   56  121:pop             
			outputColorNumbers(basecolor, f);
	//   57  122:aload_0         
	//   58  123:aload_2         
	//   59  124:fload_3         
	//   60  125:invokevirtual   #1881 <Method void outputColorNumbers(BaseColor, float)>
			content.append(' ').append(pdfname.getBytes()).append(" SCN").append_i(separator);
	//   61  128:aload_0         
	//   62  129:getfield        #140 <Field ByteBuffer content>
	//   63  132:bipush          32
	//   64  134:invokevirtual   #181 <Method ByteBuffer ByteBuffer.append(char)>
	//   65  137:aload           4
	//   66  139:invokevirtual   #287 <Method byte[] PdfName.getBytes()>
	//   67  142:invokevirtual   #290 <Method ByteBuffer ByteBuffer.append(byte[])>
	//   68  145:ldc2            #1765 <String " SCN">
	//   69  148:invokevirtual   #278 <Method ByteBuffer ByteBuffer.append(String)>
	//   70  151:aload_0         
	//   71  152:getfield        #152 <Field int separator>
	//   72  155:invokevirtual   #296 <Method ByteBuffer ByteBuffer.append_i(int)>
	//   73  158:pop             
			return;
	//   74  159:return          
		}
	}

	public void setRGBColorFill(int i, int j, int k)
	{
		saveColor(new BaseColor(i, j, k), true);
	//    0    0:aload_0         
	//    1    1:new             #496 <Class BaseColor>
	//    2    4:dup             
	//    3    5:iload_1         
	//    4    6:iload_2         
	//    5    7:iload_3         
	//    6    8:invokespecial   #1263 <Method void BaseColor(int, int, int)>
	//    7   11:iconst_1        
	//    8   12:invokespecial   #1561 <Method void saveColor(BaseColor, boolean)>
		HelperRGB((float)(i & 0xff) / 255F, (float)(j & 0xff) / 255F, (float)(k & 0xff) / 255F);
	//    9   15:aload_0         
	//   10   16:iload_1         
	//   11   17:sipush          255
	//   12   20:iand            
	//   13   21:i2f             
	//   14   22:ldc2            #1433 <Float 255F>
	//   15   25:fdiv            
	//   16   26:iload_2         
	//   17   27:sipush          255
	//   18   30:iand            
	//   19   31:i2f             
	//   20   32:ldc2            #1433 <Float 255F>
	//   21   35:fdiv            
	//   22   36:iload_3         
	//   23   37:sipush          255
	//   24   40:iand            
	//   25   41:i2f             
	//   26   42:ldc2            #1433 <Float 255F>
	//   27   45:fdiv            
	//   28   46:invokespecial   #1889 <Method void HelperRGB(float, float, float)>
		content.append(" rg").append_i(separator);
	//   29   49:aload_0         
	//   30   50:getfield        #140 <Field ByteBuffer content>
	//   31   53:ldc2            #1891 <String " rg">
	//   32   56:invokevirtual   #278 <Method ByteBuffer ByteBuffer.append(String)>
	//   33   59:aload_0         
	//   34   60:getfield        #152 <Field int separator>
	//   35   63:invokevirtual   #296 <Method ByteBuffer ByteBuffer.append_i(int)>
	//   36   66:pop             
	//   37   67:return          
	}

	public void setRGBColorFillF(float f, float f1, float f2)
	{
		saveColor(new BaseColor(f, f1, f2), true);
	//    0    0:aload_0         
	//    1    1:new             #496 <Class BaseColor>
	//    2    4:dup             
	//    3    5:fload_1         
	//    4    6:fload_2         
	//    5    7:fload_3         
	//    6    8:invokespecial   #1894 <Method void BaseColor(float, float, float)>
	//    7   11:iconst_1        
	//    8   12:invokespecial   #1561 <Method void saveColor(BaseColor, boolean)>
		HelperRGB(f, f1, f2);
	//    9   15:aload_0         
	//   10   16:fload_1         
	//   11   17:fload_2         
	//   12   18:fload_3         
	//   13   19:invokespecial   #1889 <Method void HelperRGB(float, float, float)>
		content.append(" rg").append_i(separator);
	//   14   22:aload_0         
	//   15   23:getfield        #140 <Field ByteBuffer content>
	//   16   26:ldc2            #1891 <String " rg">
	//   17   29:invokevirtual   #278 <Method ByteBuffer ByteBuffer.append(String)>
	//   18   32:aload_0         
	//   19   33:getfield        #152 <Field int separator>
	//   20   36:invokevirtual   #296 <Method ByteBuffer ByteBuffer.append_i(int)>
	//   21   39:pop             
	//   22   40:return          
	}

	public void setRGBColorStroke(int i, int j, int k)
	{
		saveColor(new BaseColor(i, j, k), false);
	//    0    0:aload_0         
	//    1    1:new             #496 <Class BaseColor>
	//    2    4:dup             
	//    3    5:iload_1         
	//    4    6:iload_2         
	//    5    7:iload_3         
	//    6    8:invokespecial   #1263 <Method void BaseColor(int, int, int)>
	//    7   11:iconst_0        
	//    8   12:invokespecial   #1561 <Method void saveColor(BaseColor, boolean)>
		HelperRGB((float)(i & 0xff) / 255F, (float)(j & 0xff) / 255F, (float)(k & 0xff) / 255F);
	//    9   15:aload_0         
	//   10   16:iload_1         
	//   11   17:sipush          255
	//   12   20:iand            
	//   13   21:i2f             
	//   14   22:ldc2            #1433 <Float 255F>
	//   15   25:fdiv            
	//   16   26:iload_2         
	//   17   27:sipush          255
	//   18   30:iand            
	//   19   31:i2f             
	//   20   32:ldc2            #1433 <Float 255F>
	//   21   35:fdiv            
	//   22   36:iload_3         
	//   23   37:sipush          255
	//   24   40:iand            
	//   25   41:i2f             
	//   26   42:ldc2            #1433 <Float 255F>
	//   27   45:fdiv            
	//   28   46:invokespecial   #1889 <Method void HelperRGB(float, float, float)>
		content.append(" RG").append_i(separator);
	//   29   49:aload_0         
	//   30   50:getfield        #140 <Field ByteBuffer content>
	//   31   53:ldc2            #1896 <String " RG">
	//   32   56:invokevirtual   #278 <Method ByteBuffer ByteBuffer.append(String)>
	//   33   59:aload_0         
	//   34   60:getfield        #152 <Field int separator>
	//   35   63:invokevirtual   #296 <Method ByteBuffer ByteBuffer.append_i(int)>
	//   36   66:pop             
	//   37   67:return          
	}

	public void setRGBColorStrokeF(float f, float f1, float f2)
	{
		saveColor(new BaseColor(f, f1, f2), false);
	//    0    0:aload_0         
	//    1    1:new             #496 <Class BaseColor>
	//    2    4:dup             
	//    3    5:fload_1         
	//    4    6:fload_2         
	//    5    7:fload_3         
	//    6    8:invokespecial   #1894 <Method void BaseColor(float, float, float)>
	//    7   11:iconst_0        
	//    8   12:invokespecial   #1561 <Method void saveColor(BaseColor, boolean)>
		HelperRGB(f, f1, f2);
	//    9   15:aload_0         
	//   10   16:fload_1         
	//   11   17:fload_2         
	//   12   18:fload_3         
	//   13   19:invokespecial   #1889 <Method void HelperRGB(float, float, float)>
		content.append(" RG").append_i(separator);
	//   14   22:aload_0         
	//   15   23:getfield        #140 <Field ByteBuffer content>
	//   16   26:ldc2            #1896 <String " RG">
	//   17   29:invokevirtual   #278 <Method ByteBuffer ByteBuffer.append(String)>
	//   18   32:aload_0         
	//   19   33:getfield        #152 <Field int separator>
	//   20   36:invokevirtual   #296 <Method ByteBuffer ByteBuffer.append_i(int)>
	//   21   39:pop             
	//   22   40:return          
	}

	public void setRenderingIntent(PdfName pdfname)
	{
		content.append(pdfname.getBytes()).append(" ri").append_i(separator);
	//    0    0:aload_0         
	//    1    1:getfield        #140 <Field ByteBuffer content>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #287 <Method byte[] PdfName.getBytes()>
	//    4    8:invokevirtual   #290 <Method ByteBuffer ByteBuffer.append(byte[])>
	//    5   11:ldc2            #1900 <String " ri">
	//    6   14:invokevirtual   #278 <Method ByteBuffer ByteBuffer.append(String)>
	//    7   17:aload_0         
	//    8   18:getfield        #152 <Field int separator>
	//    9   21:invokevirtual   #296 <Method ByteBuffer ByteBuffer.append_i(int)>
	//   10   24:pop             
	//   11   25:return          
	}

	public void setShadingFill(PdfShadingPattern pdfshadingpattern)
	{
		writer.addSimpleShadingPattern(pdfshadingpattern);
	//    0    0:aload_0         
	//    1    1:getfield        #164 <Field PdfWriter writer>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #1903 <Method void PdfWriter.addSimpleShadingPattern(PdfShadingPattern)>
		PageResources pageresources = getPageResources();
	//    4    8:aload_0         
	//    5    9:invokevirtual   #204 <Method PageResources getPageResources()>
	//    6   12:astore_2        
		PdfName pdfname = pageresources.addPattern(pdfshadingpattern.getPatternName(), pdfshadingpattern.getPatternReference());
	//    7   13:aload_2         
	//    8   14:aload_1         
	//    9   15:invokevirtual   #1906 <Method PdfName PdfShadingPattern.getPatternName()>
	//   10   18:aload_1         
	//   11   19:invokevirtual   #1909 <Method PdfIndirectReference PdfShadingPattern.getPatternReference()>
	//   12   22:invokevirtual   #1861 <Method PdfName PageResources.addPattern(PdfName, PdfIndirectReference)>
	//   13   25:astore_3        
		saveColor(((BaseColor) (new ShadingColor(pdfshadingpattern))), true);
	//   14   26:aload_0         
	//   15   27:new             #1667 <Class ShadingColor>
	//   16   30:dup             
	//   17   31:aload_1         
	//   18   32:invokespecial   #1911 <Method void ShadingColor(PdfShadingPattern)>
	//   19   35:iconst_1        
	//   20   36:invokespecial   #1561 <Method void saveColor(BaseColor, boolean)>
		content.append(PdfName.PATTERN.getBytes()).append(" cs ").append(pdfname.getBytes()).append(" scn").append_i(separator);
	//   21   39:aload_0         
	//   22   40:getfield        #140 <Field ByteBuffer content>
	//   23   43:getstatic       #1866 <Field PdfName PdfName.PATTERN>
	//   24   46:invokevirtual   #287 <Method byte[] PdfName.getBytes()>
	//   25   49:invokevirtual   #290 <Method ByteBuffer ByteBuffer.append(byte[])>
	//   26   52:ldc2            #1716 <String " cs ">
	//   27   55:invokevirtual   #278 <Method ByteBuffer ByteBuffer.append(String)>
	//   28   58:aload_3         
	//   29   59:invokevirtual   #287 <Method byte[] PdfName.getBytes()>
	//   30   62:invokevirtual   #290 <Method ByteBuffer ByteBuffer.append(byte[])>
	//   31   65:ldc2            #1736 <String " scn">
	//   32   68:invokevirtual   #278 <Method ByteBuffer ByteBuffer.append(String)>
	//   33   71:aload_0         
	//   34   72:getfield        #152 <Field int separator>
	//   35   75:invokevirtual   #296 <Method ByteBuffer ByteBuffer.append_i(int)>
	//   36   78:pop             
		pdfshadingpattern = ((PdfShadingPattern) (pdfshadingpattern.getColorDetails()));
	//   37   79:aload_1         
	//   38   80:invokevirtual   #1912 <Method ColorDetails PdfShadingPattern.getColorDetails()>
	//   39   83:astore_1        
		if(pdfshadingpattern != null)
	//*  40   84:aload_1         
	//*  41   85:ifnull          101
			pageresources.addColor(((ColorDetails) (pdfshadingpattern)).getColorSpaceName(), ((ColorDetails) (pdfshadingpattern)).getIndirectReference());
	//   42   88:aload_2         
	//   43   89:aload_1         
	//   44   90:invokevirtual   #1485 <Method PdfName ColorDetails.getColorSpaceName()>
	//   45   93:aload_1         
	//   46   94:invokevirtual   #1486 <Method PdfIndirectReference ColorDetails.getIndirectReference()>
	//   47   97:invokevirtual   #947 <Method PdfName PageResources.addColor(PdfName, PdfIndirectReference)>
	//   48  100:pop             
	//   49  101:return          
	}

	public void setShadingStroke(PdfShadingPattern pdfshadingpattern)
	{
		writer.addSimpleShadingPattern(pdfshadingpattern);
	//    0    0:aload_0         
	//    1    1:getfield        #164 <Field PdfWriter writer>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #1903 <Method void PdfWriter.addSimpleShadingPattern(PdfShadingPattern)>
		PageResources pageresources = getPageResources();
	//    4    8:aload_0         
	//    5    9:invokevirtual   #204 <Method PageResources getPageResources()>
	//    6   12:astore_2        
		PdfName pdfname = pageresources.addPattern(pdfshadingpattern.getPatternName(), pdfshadingpattern.getPatternReference());
	//    7   13:aload_2         
	//    8   14:aload_1         
	//    9   15:invokevirtual   #1906 <Method PdfName PdfShadingPattern.getPatternName()>
	//   10   18:aload_1         
	//   11   19:invokevirtual   #1909 <Method PdfIndirectReference PdfShadingPattern.getPatternReference()>
	//   12   22:invokevirtual   #1861 <Method PdfName PageResources.addPattern(PdfName, PdfIndirectReference)>
	//   13   25:astore_3        
		saveColor(((BaseColor) (new ShadingColor(pdfshadingpattern))), false);
	//   14   26:aload_0         
	//   15   27:new             #1667 <Class ShadingColor>
	//   16   30:dup             
	//   17   31:aload_1         
	//   18   32:invokespecial   #1911 <Method void ShadingColor(PdfShadingPattern)>
	//   19   35:iconst_0        
	//   20   36:invokespecial   #1561 <Method void saveColor(BaseColor, boolean)>
		content.append(PdfName.PATTERN.getBytes()).append(" CS ").append(pdfname.getBytes()).append(" SCN").append_i(separator);
	//   21   39:aload_0         
	//   22   40:getfield        #140 <Field ByteBuffer content>
	//   23   43:getstatic       #1866 <Field PdfName PdfName.PATTERN>
	//   24   46:invokevirtual   #287 <Method byte[] PdfName.getBytes()>
	//   25   49:invokevirtual   #290 <Method ByteBuffer ByteBuffer.append(byte[])>
	//   26   52:ldc2            #1761 <String " CS ">
	//   27   55:invokevirtual   #278 <Method ByteBuffer ByteBuffer.append(String)>
	//   28   58:aload_3         
	//   29   59:invokevirtual   #287 <Method byte[] PdfName.getBytes()>
	//   30   62:invokevirtual   #290 <Method ByteBuffer ByteBuffer.append(byte[])>
	//   31   65:ldc2            #1765 <String " SCN">
	//   32   68:invokevirtual   #278 <Method ByteBuffer ByteBuffer.append(String)>
	//   33   71:aload_0         
	//   34   72:getfield        #152 <Field int separator>
	//   35   75:invokevirtual   #296 <Method ByteBuffer ByteBuffer.append_i(int)>
	//   36   78:pop             
		pdfshadingpattern = ((PdfShadingPattern) (pdfshadingpattern.getColorDetails()));
	//   37   79:aload_1         
	//   38   80:invokevirtual   #1912 <Method ColorDetails PdfShadingPattern.getColorDetails()>
	//   39   83:astore_1        
		if(pdfshadingpattern != null)
	//*  40   84:aload_1         
	//*  41   85:ifnull          101
			pageresources.addColor(((ColorDetails) (pdfshadingpattern)).getColorSpaceName(), ((ColorDetails) (pdfshadingpattern)).getIndirectReference());
	//   42   88:aload_2         
	//   43   89:aload_1         
	//   44   90:invokevirtual   #1485 <Method PdfName ColorDetails.getColorSpaceName()>
	//   45   93:aload_1         
	//   46   94:invokevirtual   #1486 <Method PdfIndirectReference ColorDetails.getIndirectReference()>
	//   47   97:invokevirtual   #947 <Method PdfName PageResources.addColor(PdfName, PdfIndirectReference)>
	//   48  100:pop             
	//   49  101:return          
	}

	public PdfContentByte setSuppressTagging(boolean flag)
	{
		suppressTagging = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #158 <Field boolean suppressTagging>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public void setTextMatrix(float f, float f1)
	{
		setTextMatrix(1.0F, 0.0F, 0.0F, 1.0F, f, f1);
	//    0    0:aload_0         
	//    1    1:fconst_1        
	//    2    2:fconst_0        
	//    3    3:fconst_0        
	//    4    4:fconst_1        
	//    5    5:fload_1         
	//    6    6:fload_2         
	//    7    7:invokevirtual   #703 <Method void setTextMatrix(float, float, float, float, float, float)>
	//    8   10:return          
	}

	public void setTextMatrix(float f, float f1, float f2, float f3, float f4, float f5)
	{
		if(!inText && isTagged())
	//*   0    0:aload_0         
	//*   1    1:getfield        #156 <Field boolean inText>
	//*   2    4:ifne            19
	//*   3    7:aload_0         
	//*   4    8:invokevirtual   #220 <Method boolean isTagged()>
	//*   5   11:ifeq            19
			beginText(true);
	//    6   14:aload_0         
	//    7   15:iconst_1        
	//    8   16:invokevirtual   #490 <Method void beginText(boolean)>
		state.xTLM = f4;
	//    9   19:aload_0         
	//   10   20:getfield        #145 <Field PdfContentByte$GraphicState state>
	//   11   23:fload           5
	//   12   25:putfield        #1130 <Field float PdfContentByte$GraphicState.xTLM>
		state.yTLM = f5;
	//   13   28:aload_0         
	//   14   29:getfield        #145 <Field PdfContentByte$GraphicState state>
	//   15   32:fload           6
	//   16   34:putfield        #1148 <Field float PdfContentByte$GraphicState.yTLM>
		state.aTLM = f;
	//   17   37:aload_0         
	//   18   38:getfield        #145 <Field PdfContentByte$GraphicState state>
	//   19   41:fload_1         
	//   20   42:putfield        #1136 <Field float PdfContentByte$GraphicState.aTLM>
		state.bTLM = f1;
	//   21   45:aload_0         
	//   22   46:getfield        #145 <Field PdfContentByte$GraphicState state>
	//   23   49:fload_2         
	//   24   50:putfield        #1139 <Field float PdfContentByte$GraphicState.bTLM>
		state.cTLM = f2;
	//   25   53:aload_0         
	//   26   54:getfield        #145 <Field PdfContentByte$GraphicState state>
	//   27   57:fload_3         
	//   28   58:putfield        #1142 <Field float PdfContentByte$GraphicState.cTLM>
		state.dTLM = f3;
	//   29   61:aload_0         
	//   30   62:getfield        #145 <Field PdfContentByte$GraphicState state>
	//   31   65:fload           4
	//   32   67:putfield        #1145 <Field float PdfContentByte$GraphicState.dTLM>
		state.tx = state.xTLM;
	//   33   70:aload_0         
	//   34   71:getfield        #145 <Field PdfContentByte$GraphicState state>
	//   35   74:aload_0         
	//   36   75:getfield        #145 <Field PdfContentByte$GraphicState state>
	//   37   78:getfield        #1130 <Field float PdfContentByte$GraphicState.xTLM>
	//   38   81:putfield        #1133 <Field float PdfContentByte$GraphicState.tx>
		content.append(f).append(' ').append(f1).append_i(32).append(f2).append_i(32).append(f3).append_i(32).append(f4).append_i(32).append(f5).append(" Tm").append_i(separator);
	//   39   84:aload_0         
	//   40   85:getfield        #140 <Field ByteBuffer content>
	//   41   88:fload_1         
	//   42   89:invokevirtual   #178 <Method ByteBuffer ByteBuffer.append(float)>
	//   43   92:bipush          32
	//   44   94:invokevirtual   #181 <Method ByteBuffer ByteBuffer.append(char)>
	//   45   97:fload_2         
	//   46   98:invokevirtual   #178 <Method ByteBuffer ByteBuffer.append(float)>
	//   47  101:bipush          32
	//   48  103:invokevirtual   #296 <Method ByteBuffer ByteBuffer.append_i(int)>
	//   49  106:fload_3         
	//   50  107:invokevirtual   #178 <Method ByteBuffer ByteBuffer.append(float)>
	//   51  110:bipush          32
	//   52  112:invokevirtual   #296 <Method ByteBuffer ByteBuffer.append_i(int)>
	//   53  115:fload           4
	//   54  117:invokevirtual   #178 <Method ByteBuffer ByteBuffer.append(float)>
	//   55  120:bipush          32
	//   56  122:invokevirtual   #296 <Method ByteBuffer ByteBuffer.append_i(int)>
	//   57  125:fload           5
	//   58  127:invokevirtual   #178 <Method ByteBuffer ByteBuffer.append(float)>
	//   59  130:bipush          32
	//   60  132:invokevirtual   #296 <Method ByteBuffer ByteBuffer.append_i(int)>
	//   61  135:fload           6
	//   62  137:invokevirtual   #178 <Method ByteBuffer ByteBuffer.append(float)>
	//   63  140:ldc2            #1915 <String " Tm">
	//   64  143:invokevirtual   #278 <Method ByteBuffer ByteBuffer.append(String)>
	//   65  146:aload_0         
	//   66  147:getfield        #152 <Field int separator>
	//   67  150:invokevirtual   #296 <Method ByteBuffer ByteBuffer.append_i(int)>
	//   68  153:pop             
	//   69  154:return          
	}

	public void setTextMatrix(AffineTransform affinetransform)
	{
		double ad[] = new double[6];
	//    0    0:bipush          6
	//    1    2:newarray        double[]
	//    2    4:astore_2        
		affinetransform.getMatrix(ad);
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:invokevirtual   #1020 <Method void AffineTransform.getMatrix(double[])>
		setTextMatrix((float)ad[0], (float)ad[1], (float)ad[2], (float)ad[3], (float)ad[4], (float)ad[5]);
	//    6   10:aload_0         
	//    7   11:aload_2         
	//    8   12:iconst_0        
	//    9   13:daload          
	//   10   14:d2f             
	//   11   15:aload_2         
	//   12   16:iconst_1        
	//   13   17:daload          
	//   14   18:d2f             
	//   15   19:aload_2         
	//   16   20:iconst_2        
	//   17   21:daload          
	//   18   22:d2f             
	//   19   23:aload_2         
	//   20   24:iconst_3        
	//   21   25:daload          
	//   22   26:d2f             
	//   23   27:aload_2         
	//   24   28:iconst_4        
	//   25   29:daload          
	//   26   30:d2f             
	//   27   31:aload_2         
	//   28   32:iconst_5        
	//   29   33:daload          
	//   30   34:d2f             
	//   31   35:invokevirtual   #703 <Method void setTextMatrix(float, float, float, float, float, float)>
	//   32   38:return          
	}

	public void setTextRenderingMode(int i)
	{
		if(!inText && isTagged())
	//*   0    0:aload_0         
	//*   1    1:getfield        #156 <Field boolean inText>
	//*   2    4:ifne            19
	//*   3    7:aload_0         
	//*   4    8:invokevirtual   #220 <Method boolean isTagged()>
	//*   5   11:ifeq            19
			beginText(true);
	//    6   14:aload_0         
	//    7   15:iconst_1        
	//    8   16:invokevirtual   #490 <Method void beginText(boolean)>
		state.textRenderMode = i;
	//    9   19:aload_0         
	//   10   20:getfield        #145 <Field PdfContentByte$GraphicState state>
	//   11   23:iload_1         
	//   12   24:putfield        #1155 <Field int PdfContentByte$GraphicState.textRenderMode>
		content.append(i).append(" Tr").append_i(separator);
	//   13   27:aload_0         
	//   14   28:getfield        #140 <Field ByteBuffer content>
	//   15   31:iload_1         
	//   16   32:invokevirtual   #403 <Method ByteBuffer ByteBuffer.append(int)>
	//   17   35:ldc2            #1918 <String " Tr">
	//   18   38:invokevirtual   #278 <Method ByteBuffer ByteBuffer.append(String)>
	//   19   41:aload_0         
	//   20   42:getfield        #152 <Field int separator>
	//   21   45:invokevirtual   #296 <Method ByteBuffer ByteBuffer.append_i(int)>
	//   22   48:pop             
	//   23   49:return          
	}

	public void setTextRise(double d)
	{
		if(!inText && isTagged())
	//*   0    0:aload_0         
	//*   1    1:getfield        #156 <Field boolean inText>
	//*   2    4:ifne            19
	//*   3    7:aload_0         
	//*   4    8:invokevirtual   #220 <Method boolean isTagged()>
	//*   5   11:ifeq            19
			beginText(true);
	//    6   14:aload_0         
	//    7   15:iconst_1        
	//    8   16:invokevirtual   #490 <Method void beginText(boolean)>
		content.append(d).append(" Ts").append_i(separator);
	//    9   19:aload_0         
	//   10   20:getfield        #140 <Field ByteBuffer content>
	//   11   23:dload_1         
	//   12   24:invokevirtual   #281 <Method ByteBuffer ByteBuffer.append(double)>
	//   13   27:ldc2            #1921 <String " Ts">
	//   14   30:invokevirtual   #278 <Method ByteBuffer ByteBuffer.append(String)>
	//   15   33:aload_0         
	//   16   34:getfield        #152 <Field int separator>
	//   17   37:invokevirtual   #296 <Method ByteBuffer ByteBuffer.append_i(int)>
	//   18   40:pop             
	//   19   41:return          
	}

	public void setTextRise(float f)
	{
		setTextRise(f);
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:f2d             
	//    3    3:invokevirtual   #1923 <Method void setTextRise(double)>
	//    4    6:return          
	}

	public void setWordSpacing(float f)
	{
		if(!inText && isTagged())
	//*   0    0:aload_0         
	//*   1    1:getfield        #156 <Field boolean inText>
	//*   2    4:ifne            19
	//*   3    7:aload_0         
	//*   4    8:invokevirtual   #220 <Method boolean isTagged()>
	//*   5   11:ifeq            19
			beginText(true);
	//    6   14:aload_0         
	//    7   15:iconst_1        
	//    8   16:invokevirtual   #490 <Method void beginText(boolean)>
		state.wordSpace = f;
	//    9   19:aload_0         
	//   10   20:getfield        #145 <Field PdfContentByte$GraphicState state>
	//   11   23:fload_1         
	//   12   24:putfield        #538 <Field float PdfContentByte$GraphicState.wordSpace>
		content.append(f).append(" Tw").append_i(separator);
	//   13   27:aload_0         
	//   14   28:getfield        #140 <Field ByteBuffer content>
	//   15   31:fload_1         
	//   16   32:invokevirtual   #178 <Method ByteBuffer ByteBuffer.append(float)>
	//   17   35:ldc2            #1926 <String " Tw">
	//   18   38:invokevirtual   #278 <Method ByteBuffer ByteBuffer.append(String)>
	//   19   41:aload_0         
	//   20   42:getfield        #152 <Field int separator>
	//   21   45:invokevirtual   #296 <Method ByteBuffer ByteBuffer.append_i(int)>
	//   22   48:pop             
	//   23   49:return          
	}

	public void showText(PdfTextArray pdftextarray)
	{
		checkState();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #1403 <Method void checkState()>
		if(!inText && isTagged())
	//*   2    4:aload_0         
	//*   3    5:getfield        #156 <Field boolean inText>
	//*   4    8:ifne            23
	//*   5   11:aload_0         
	//*   6   12:invokevirtual   #220 <Method boolean isTagged()>
	//*   7   15:ifeq            23
			beginText(true);
	//    8   18:aload_0         
	//    9   19:iconst_1        
	//   10   20:invokevirtual   #490 <Method void beginText(boolean)>
		if(state.fontDetails == null)
	//*  11   23:aload_0         
	//*  12   24:getfield        #145 <Field PdfContentByte$GraphicState state>
	//*  13   27:getfield        #512 <Field FontDetails PdfContentByte$GraphicState.fontDetails>
	//*  14   30:ifnonnull       51
			throw new NullPointerException(MessageLocalization.getComposedMessage("font.and.size.must.be.set.before.writing.any.text", new Object[0]));
	//   15   33:new             #672 <Class NullPointerException>
	//   16   36:dup             
	//   17   37:ldc2            #674 <String "font.and.size.must.be.set.before.writing.any.text">
	//   18   40:iconst_0        
	//   19   41:anewarray       Object[]
	//   20   44:invokestatic    #239 <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//   21   47:invokespecial   #675 <Method void NullPointerException(String)>
	//   22   50:athrow          
		content.append("[");
	//   23   51:aload_0         
	//   24   52:getfield        #140 <Field ByteBuffer content>
	//   25   55:ldc2            #1824 <String "[">
	//   26   58:invokevirtual   #278 <Method ByteBuffer ByteBuffer.append(String)>
	//   27   61:pop             
		pdftextarray = ((PdfTextArray) (pdftextarray.getArrayList()));
	//   28   62:aload_1         
	//   29   63:invokevirtual   #1930 <Method ArrayList PdfTextArray.getArrayList()>
	//   30   66:astore_1        
		boolean flag = false;
	//   31   67:iconst_0        
	//   32   68:istore_2        
		do
		{
			for(pdftextarray = ((PdfTextArray) (((ArrayList) (pdftextarray)).iterator())); ((Iterator) (pdftextarray)).hasNext();)
	//*  33   69:aload_1         
	//*  34   70:invokevirtual   #1931 <Method Iterator ArrayList.iterator()>
	//*  35   73:astore_1        
	//*  36   74:aload_1         
	//*  37   75:invokeinterface #630 <Method boolean Iterator.hasNext()>
	//*  38   80:ifeq            170
			{
				Object obj = ((Iterator) (pdftextarray)).next();
	//   39   83:aload_1         
	//   40   84:invokeinterface #634 <Method Object Iterator.next()>
	//   41   89:astore_3        
				if(obj instanceof String)
	//*  42   90:aload_3         
	//*  43   91:instanceof      #532 <Class String>
	//*  44   94:ifeq            119
				{
					showText2((String)obj);
	//   45   97:aload_0         
	//   46   98:aload_3         
	//   47   99:checkcast       #532 <Class String>
	//   48  102:invokespecial   #1405 <Method void showText2(String)>
					updateTx((String)obj, 0.0F);
	//   49  105:aload_0         
	//   50  106:aload_3         
	//   51  107:checkcast       #532 <Class String>
	//   52  110:fconst_0        
	//   53  111:invokevirtual   #1411 <Method void updateTx(String, float)>
					flag = false;
	//   54  114:iconst_0        
	//   55  115:istore_2        
				} else
	//*  56  116:goto            74
				{
					if(flag)
	//*  57  119:iload_2         
	//*  58  120:ifeq            165
						content.append(' ');
	//   59  123:aload_0         
	//   60  124:getfield        #140 <Field ByteBuffer content>
	//   61  127:bipush          32
	//   62  129:invokevirtual   #181 <Method ByteBuffer ByteBuffer.append(char)>
	//   63  132:pop             
					else
	//*  64  133:aload_0         
	//*  65  134:getfield        #140 <Field ByteBuffer content>
	//*  66  137:aload_3         
	//*  67  138:checkcast       #1933 <Class Float>
	//*  68  141:invokevirtual   #1936 <Method float Float.floatValue()>
	//*  69  144:invokevirtual   #178 <Method ByteBuffer ByteBuffer.append(float)>
	//*  70  147:pop             
	//*  71  148:aload_0         
	//*  72  149:ldc2            #900 <String "">
	//*  73  152:aload_3         
	//*  74  153:checkcast       #1933 <Class Float>
	//*  75  156:invokevirtual   #1936 <Method float Float.floatValue()>
	//*  76  159:invokevirtual   #1411 <Method void updateTx(String, float)>
	//*  77  162:goto            74
						flag = true;
	//   78  165:iconst_1        
	//   79  166:istore_2        
					content.append(((Float)obj).floatValue());
					updateTx("", ((Float)obj).floatValue());
				}
			}

	//*  80  167:goto            133
			content.append("]TJ").append_i(separator);
	//   81  170:aload_0         
	//   82  171:getfield        #140 <Field ByteBuffer content>
	//   83  174:ldc2            #1938 <String "]TJ">
	//   84  177:invokevirtual   #278 <Method ByteBuffer ByteBuffer.append(String)>
	//   85  180:aload_0         
	//   86  181:getfield        #152 <Field int separator>
	//   87  184:invokevirtual   #296 <Method ByteBuffer ByteBuffer.append_i(int)>
	//   88  187:pop             
			return;
	//   89  188:return          
		} while(true);
	}

	public void showText(String s)
	{
		checkState();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #1403 <Method void checkState()>
		if(!inText && isTagged())
	//*   2    4:aload_0         
	//*   3    5:getfield        #156 <Field boolean inText>
	//*   4    8:ifne            23
	//*   5   11:aload_0         
	//*   6   12:invokevirtual   #220 <Method boolean isTagged()>
	//*   7   15:ifeq            23
			beginText(true);
	//    8   18:aload_0         
	//    9   19:iconst_1        
	//   10   20:invokevirtual   #490 <Method void beginText(boolean)>
		showText2(s);
	//   11   23:aload_0         
	//   12   24:aload_1         
	//   13   25:invokespecial   #1405 <Method void showText2(String)>
		updateTx(s, 0.0F);
	//   14   28:aload_0         
	//   15   29:aload_1         
	//   16   30:fconst_0        
	//   17   31:invokevirtual   #1411 <Method void updateTx(String, float)>
		content.append("Tj").append_i(separator);
	//   18   34:aload_0         
	//   19   35:getfield        #140 <Field ByteBuffer content>
	//   20   38:ldc2            #1940 <String "Tj">
	//   21   41:invokevirtual   #278 <Method ByteBuffer ByteBuffer.append(String)>
	//   22   44:aload_0         
	//   23   45:getfield        #152 <Field int separator>
	//   24   48:invokevirtual   #296 <Method ByteBuffer ByteBuffer.append_i(int)>
	//   25   51:pop             
	//   26   52:return          
	}

	public void showTextAligned(int i, String s, float f, float f1, float f2)
	{
		showTextAligned(i, s, f, f1, f2, false);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:aload_2         
	//    3    3:fload_3         
	//    4    4:fload           4
	//    5    6:fload           5
	//    6    8:iconst_0        
	//    7    9:invokespecial   #1942 <Method void showTextAligned(int, String, float, float, float, boolean)>
	//    8   12:return          
	}

	public void showTextAlignedKerned(int i, String s, float f, float f1, float f2)
	{
		showTextAligned(i, s, f, f1, f2, true);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:aload_2         
	//    3    3:fload_3         
	//    4    4:fload           4
	//    5    6:fload           5
	//    6    8:iconst_1        
	//    7    9:invokespecial   #1942 <Method void showTextAligned(int, String, float, float, float, boolean)>
	//    8   12:return          
	}

	public void showTextGid(String s)
	{
		checkState();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #1403 <Method void checkState()>
		if(!inText && isTagged())
	//*   2    4:aload_0         
	//*   3    5:getfield        #156 <Field boolean inText>
	//*   4    8:ifne            23
	//*   5   11:aload_0         
	//*   6   12:invokevirtual   #220 <Method boolean isTagged()>
	//*   7   15:ifeq            23
			beginText(true);
	//    8   18:aload_0         
	//    9   19:iconst_1        
	//   10   20:invokevirtual   #490 <Method void beginText(boolean)>
		if(state.fontDetails == null)
	//*  11   23:aload_0         
	//*  12   24:getfield        #145 <Field PdfContentByte$GraphicState state>
	//*  13   27:getfield        #512 <Field FontDetails PdfContentByte$GraphicState.fontDetails>
	//*  14   30:ifnonnull       51
		{
			throw new NullPointerException(MessageLocalization.getComposedMessage("font.and.size.must.be.set.before.writing.any.text", new Object[0]));
	//   15   33:new             #672 <Class NullPointerException>
	//   16   36:dup             
	//   17   37:ldc2            #674 <String "font.and.size.must.be.set.before.writing.any.text">
	//   18   40:iconst_0        
	//   19   41:anewarray       Object[]
	//   20   44:invokestatic    #239 <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//   21   47:invokespecial   #675 <Method void NullPointerException(String)>
	//   22   50:athrow          
		} else
		{
			s = ((String) (state.fontDetails.convertToBytesGid(s)));
	//   23   51:aload_0         
	//   24   52:getfield        #145 <Field PdfContentByte$GraphicState state>
	//   25   55:getfield        #512 <Field FontDetails PdfContentByte$GraphicState.fontDetails>
	//   26   58:aload_1         
	//   27   59:invokevirtual   #1948 <Method Object[] FontDetails.convertToBytesGid(String)>
	//   28   62:astore_1        
			StringUtils.escapeString((byte[])(byte[])s[0], content);
	//   29   63:aload_1         
	//   30   64:iconst_0        
	//   31   65:aaload          
	//   32   66:checkcast       #1950 <Class byte[]>
	//   33   69:checkcast       #1950 <Class byte[]>
	//   34   72:aload_0         
	//   35   73:getfield        #140 <Field ByteBuffer content>
	//   36   76:invokestatic    #685 <Method void StringUtils.escapeString(byte[], ByteBuffer)>
			GraphicState graphicstate = state;
	//   37   79:aload_0         
	//   38   80:getfield        #145 <Field PdfContentByte$GraphicState state>
	//   39   83:astore_3        
			float f = graphicstate.tx;
	//   40   84:aload_3         
	//   41   85:getfield        #1133 <Field float PdfContentByte$GraphicState.tx>
	//   42   88:fstore_2        
			graphicstate.tx = (float)((Integer)s[2]).intValue() * 0.001F * state.size + f;
	//   43   89:aload_3         
	//   44   90:aload_1         
	//   45   91:iconst_2        
	//   46   92:aaload          
	//   47   93:checkcast       #965 <Class Integer>
	//   48   96:invokevirtual   #1324 <Method int Integer.intValue()>
	//   49   99:i2f             
	//   50  100:ldc2            #1951 <Float 0.001F>
	//   51  103:fmul            
	//   52  104:aload_0         
	//   53  105:getfield        #145 <Field PdfContentByte$GraphicState state>
	//   54  108:getfield        #521 <Field float PdfContentByte$GraphicState.size>
	//   55  111:fmul            
	//   56  112:fload_2         
	//   57  113:fadd            
	//   58  114:putfield        #1133 <Field float PdfContentByte$GraphicState.tx>
			content.append("Tj").append_i(separator);
	//   59  117:aload_0         
	//   60  118:getfield        #140 <Field ByteBuffer content>
	//   61  121:ldc2            #1940 <String "Tj">
	//   62  124:invokevirtual   #278 <Method ByteBuffer ByteBuffer.append(String)>
	//   63  127:aload_0         
	//   64  128:getfield        #152 <Field int separator>
	//   65  131:invokevirtual   #296 <Method ByteBuffer ByteBuffer.append_i(int)>
	//   66  134:pop             
			return;
	//   67  135:return          
		}
	}

	public void showTextKerned(String s)
	{
		if(state.fontDetails == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #145 <Field PdfContentByte$GraphicState state>
	//*   2    4:getfield        #512 <Field FontDetails PdfContentByte$GraphicState.fontDetails>
	//*   3    7:ifnonnull       28
			throw new NullPointerException(MessageLocalization.getComposedMessage("font.and.size.must.be.set.before.writing.any.text", new Object[0]));
	//    4   10:new             #672 <Class NullPointerException>
	//    5   13:dup             
	//    6   14:ldc2            #674 <String "font.and.size.must.be.set.before.writing.any.text">
	//    7   17:iconst_0        
	//    8   18:anewarray       Object[]
	//    9   21:invokestatic    #239 <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//   10   24:invokespecial   #675 <Method void NullPointerException(String)>
	//   11   27:athrow          
		BaseFont basefont = state.fontDetails.getBaseFont();
	//   12   28:aload_0         
	//   13   29:getfield        #145 <Field PdfContentByte$GraphicState state>
	//   14   32:getfield        #512 <Field FontDetails PdfContentByte$GraphicState.fontDetails>
	//   15   35:invokevirtual   #518 <Method BaseFont FontDetails.getBaseFont()>
	//   16   38:astore_2        
		if(basefont.hasKernPairs())
	//*  17   39:aload_2         
	//*  18   40:invokevirtual   #1954 <Method boolean BaseFont.hasKernPairs()>
	//*  19   43:ifeq            56
		{
			showText(getKernArray(s, basefont));
	//   20   46:aload_0         
	//   21   47:aload_1         
	//   22   48:aload_2         
	//   23   49:invokestatic    #1956 <Method PdfTextArray getKernArray(String, BaseFont)>
	//   24   52:invokevirtual   #1958 <Method void showText(PdfTextArray)>
			return;
	//   25   55:return          
		} else
		{
			showText(s);
	//   26   56:aload_0         
	//   27   57:aload_1         
	//   28   58:invokevirtual   #700 <Method void showText(String)>
			return;
	//   29   61:return          
		}
	}

	int size()
	{
		return size(true);
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:invokevirtual   #1961 <Method int size(boolean)>
	//    3    5:ireturn         
	}

	int size(boolean flag)
	{
		if(flag)
	//*   0    0:iload_1         
	//*   1    1:ifeq            12
			return content.size();
	//    2    4:aload_0         
	//    3    5:getfield        #140 <Field ByteBuffer content>
	//    4    8:invokevirtual   #395 <Method int ByteBuffer.size()>
	//    5   11:ireturn         
		else
			return content.size() - markedContentSize;
	//    6   12:aload_0         
	//    7   13:getfield        #140 <Field ByteBuffer content>
	//    8   16:invokevirtual   #395 <Method int ByteBuffer.size()>
	//    9   19:aload_0         
	//   10   20:getfield        #142 <Field int markedContentSize>
	//   11   23:isub            
	//   12   24:ireturn         
	}

	public void stroke()
	{
label0:
		{
			if(inText)
	//*   0    0:aload_0         
	//*   1    1:getfield        #156 <Field boolean inText>
	//*   2    4:ifeq            18
			{
				if(!isTagged())
					break label0;
	//    3    7:aload_0         
	//    4    8:invokevirtual   #220 <Method boolean isTagged()>
	//    5   11:ifeq            68
				endText();
	//    6   14:aload_0         
	//    7   15:invokevirtual   #223 <Method void endText()>
			}
			PdfWriter.checkPdfIsoConformance(writer, 1, ((Object) (state.colorStroke)));
	//    8   18:aload_0         
	//    9   19:getfield        #164 <Field PdfWriter writer>
	//   10   22:iconst_1        
	//   11   23:aload_0         
	//   12   24:getfield        #145 <Field PdfContentByte$GraphicState state>
	//   13   27:getfield        #669 <Field BaseColor PdfContentByte$GraphicState.colorStroke>
	//   14   30:invokestatic    #196 <Method void PdfWriter.checkPdfIsoConformance(PdfWriter, int, Object)>
			PdfWriter.checkPdfIsoConformance(writer, 6, ((Object) (state.extGState)));
	//   15   33:aload_0         
	//   16   34:getfield        #164 <Field PdfWriter writer>
	//   17   37:bipush          6
	//   18   39:aload_0         
	//   19   40:getfield        #145 <Field PdfContentByte$GraphicState state>
	//   20   43:getfield        #1159 <Field PdfObject PdfContentByte$GraphicState.extGState>
	//   21   46:invokestatic    #196 <Method void PdfWriter.checkPdfIsoConformance(PdfWriter, int, Object)>
			content.append("S").append_i(separator);
	//   22   49:aload_0         
	//   23   50:getfield        #140 <Field ByteBuffer content>
	//   24   53:ldc2            #1962 <String "S">
	//   25   56:invokevirtual   #278 <Method ByteBuffer ByteBuffer.append(String)>
	//   26   59:aload_0         
	//   27   60:getfield        #152 <Field int separator>
	//   28   63:invokevirtual   #296 <Method ByteBuffer ByteBuffer.append_i(int)>
	//   29   66:pop             
			return;
	//   30   67:return          
		}
		throw new IllegalPdfSyntaxException(MessageLocalization.getComposedMessage("path.construction.operator.inside.text.object", new Object[0]));
	//   31   68:new             #1122 <Class IllegalPdfSyntaxException>
	//   32   71:dup             
	//   33   72:ldc2            #1182 <String "path.construction.operator.inside.text.object">
	//   34   75:iconst_0        
	//   35   76:anewarray       Object[]
	//   36   79:invokestatic    #239 <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//   37   82:invokespecial   #1125 <Method void IllegalPdfSyntaxException(String)>
	//   38   85:athrow          
	}

	public byte[] toPdf(PdfWriter pdfwriter)
	{
		sanityCheck();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #1555 <Method void sanityCheck()>
		return content.toByteArray();
	//    2    4:aload_0         
	//    3    5:getfield        #140 <Field ByteBuffer content>
	//    4    8:invokevirtual   #1964 <Method byte[] ByteBuffer.toByteArray()>
	//    5   11:areturn         
	}

	public String toString()
	{
		return content.toString();
	//    0    0:aload_0         
	//    1    1:getfield        #140 <Field ByteBuffer content>
	//    2    4:invokevirtual   #1965 <Method String ByteBuffer.toString()>
	//    3    7:areturn         
	}

	public void transform(AffineTransform affinetransform)
	{
		if(inText && isTagged())
	//*   0    0:aload_0         
	//*   1    1:getfield        #156 <Field boolean inText>
	//*   2    4:ifeq            18
	//*   3    7:aload_0         
	//*   4    8:invokevirtual   #220 <Method boolean isTagged()>
	//*   5   11:ifeq            18
			endText();
	//    6   14:aload_0         
	//    7   15:invokevirtual   #223 <Method void endText()>
		double ad[] = new double[6];
	//    8   18:bipush          6
	//    9   20:newarray        double[]
	//   10   22:astore_2        
		affinetransform.getMatrix(ad);
	//   11   23:aload_1         
	//   12   24:aload_2         
	//   13   25:invokevirtual   #1020 <Method void AffineTransform.getMatrix(double[])>
		state.CTM.concatenate(affinetransform);
	//   14   28:aload_0         
	//   15   29:getfield        #145 <Field PdfContentByte$GraphicState state>
	//   16   32:getfield        #744 <Field AffineTransform PdfContentByte$GraphicState.CTM>
	//   17   35:aload_1         
	//   18   36:invokevirtual   #1194 <Method void AffineTransform.concatenate(AffineTransform)>
		content.append(ad[0]).append(' ').append(ad[1]).append(' ').append(ad[2]).append(' ');
	//   19   39:aload_0         
	//   20   40:getfield        #140 <Field ByteBuffer content>
	//   21   43:aload_2         
	//   22   44:iconst_0        
	//   23   45:daload          
	//   24   46:invokevirtual   #281 <Method ByteBuffer ByteBuffer.append(double)>
	//   25   49:bipush          32
	//   26   51:invokevirtual   #181 <Method ByteBuffer ByteBuffer.append(char)>
	//   27   54:aload_2         
	//   28   55:iconst_1        
	//   29   56:daload          
	//   30   57:invokevirtual   #281 <Method ByteBuffer ByteBuffer.append(double)>
	//   31   60:bipush          32
	//   32   62:invokevirtual   #181 <Method ByteBuffer ByteBuffer.append(char)>
	//   33   65:aload_2         
	//   34   66:iconst_2        
	//   35   67:daload          
	//   36   68:invokevirtual   #281 <Method ByteBuffer ByteBuffer.append(double)>
	//   37   71:bipush          32
	//   38   73:invokevirtual   #181 <Method ByteBuffer ByteBuffer.append(char)>
	//   39   76:pop             
		content.append(ad[3]).append(' ').append(ad[4]).append(' ').append(ad[5]).append(" cm").append_i(separator);
	//   40   77:aload_0         
	//   41   78:getfield        #140 <Field ByteBuffer content>
	//   42   81:aload_2         
	//   43   82:iconst_3        
	//   44   83:daload          
	//   45   84:invokevirtual   #281 <Method ByteBuffer ByteBuffer.append(double)>
	//   46   87:bipush          32
	//   47   89:invokevirtual   #181 <Method ByteBuffer ByteBuffer.append(char)>
	//   48   92:aload_2         
	//   49   93:iconst_4        
	//   50   94:daload          
	//   51   95:invokevirtual   #281 <Method ByteBuffer ByteBuffer.append(double)>
	//   52   98:bipush          32
	//   53  100:invokevirtual   #181 <Method ByteBuffer ByteBuffer.append(char)>
	//   54  103:aload_2         
	//   55  104:iconst_5        
	//   56  105:daload          
	//   57  106:invokevirtual   #281 <Method ByteBuffer ByteBuffer.append(double)>
	//   58  109:ldc2            #894 <String " cm">
	//   59  112:invokevirtual   #278 <Method ByteBuffer ByteBuffer.append(String)>
	//   60  115:aload_0         
	//   61  116:getfield        #152 <Field int separator>
	//   62  119:invokevirtual   #296 <Method ByteBuffer ByteBuffer.append_i(int)>
	//   63  122:pop             
	//   64  123:return          
	}

	protected void updateTx(String s, float f)
	{
		GraphicState graphicstate = state;
	//    0    0:aload_0         
	//    1    1:getfield        #145 <Field PdfContentByte$GraphicState state>
	//    2    4:astore_3        
		graphicstate.tx = graphicstate.tx + getEffectiveStringWidth(s, false, f);
	//    3    5:aload_3         
	//    4    6:aload_3         
	//    5    7:getfield        #1133 <Field float PdfContentByte$GraphicState.tx>
	//    6   10:aload_0         
	//    7   11:aload_1         
	//    8   12:iconst_0        
	//    9   13:fload_2         
	//   10   14:invokespecial   #1967 <Method float getEffectiveStringWidth(String, boolean, float)>
	//   11   17:fadd            
	//   12   18:putfield        #1133 <Field float PdfContentByte$GraphicState.tx>
	//   13   21:return          
	}

	public void variableRectangle(Rectangle rectangle1)
	{
		float f;
		float f2;
		float f3;
		float f5;
		float f6;
		BaseColor basecolor;
		BaseColor basecolor4;
label0:
		{
label1:
			{
				f2 = rectangle1.getTop();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #1509 <Method float Rectangle.getTop()>
	//    2    4:fstore          4
				f3 = rectangle1.getBottom();
	//    3    6:aload_1         
	//    4    7:invokevirtual   #1503 <Method float Rectangle.getBottom()>
	//    5   10:fstore          5
				float f10 = rectangle1.getRight();
	//    6   12:aload_1         
	//    7   13:invokevirtual   #1506 <Method float Rectangle.getRight()>
	//    8   16:fstore          12
				float f8 = rectangle1.getLeft();
	//    9   18:aload_1         
	//   10   19:invokevirtual   #1500 <Method float Rectangle.getLeft()>
	//   11   22:fstore          10
				f5 = rectangle1.getBorderWidthTop();
	//   12   24:aload_1         
	//   13   25:invokevirtual   #1970 <Method float Rectangle.getBorderWidthTop()>
	//   14   28:fstore          7
				f6 = rectangle1.getBorderWidthBottom();
	//   15   30:aload_1         
	//   16   31:invokevirtual   #1973 <Method float Rectangle.getBorderWidthBottom()>
	//   17   34:fstore          8
				float f7 = rectangle1.getBorderWidthRight();
	//   18   36:aload_1         
	//   19   37:invokevirtual   #1976 <Method float Rectangle.getBorderWidthRight()>
	//   20   40:fstore          9
				float f9 = rectangle1.getBorderWidthLeft();
	//   21   42:aload_1         
	//   22   43:invokevirtual   #1979 <Method float Rectangle.getBorderWidthLeft()>
	//   23   46:fstore          11
				BaseColor basecolor2 = rectangle1.getBorderColorTop();
	//   24   48:aload_1         
	//   25   49:invokevirtual   #1982 <Method BaseColor Rectangle.getBorderColorTop()>
	//   26   52:astore          23
				BaseColor basecolor3 = rectangle1.getBorderColorBottom();
	//   27   54:aload_1         
	//   28   55:invokevirtual   #1985 <Method BaseColor Rectangle.getBorderColorBottom()>
	//   29   58:astore          24
				basecolor = rectangle1.getBorderColorRight();
	//   30   60:aload_1         
	//   31   61:invokevirtual   #1988 <Method BaseColor Rectangle.getBorderColorRight()>
	//   32   64:astore          20
				basecolor4 = rectangle1.getBorderColorLeft();
	//   33   66:aload_1         
	//   34   67:invokevirtual   #1991 <Method BaseColor Rectangle.getBorderColorLeft()>
	//   35   70:astore          26
				saveState();
	//   36   72:aload_0         
	//   37   73:invokevirtual   #870 <Method void saveState()>
				setLineCap(0);
	//   38   76:aload_0         
	//   39   77:iconst_0        
	//   40   78:invokevirtual   #1273 <Method void setLineCap(int)>
				setLineJoin(0);
	//   41   81:aload_0         
	//   42   82:iconst_0        
	//   43   83:invokevirtual   #1993 <Method void setLineJoin(int)>
				float f1 = 0.0F;
	//   44   86:fconst_0        
	//   45   87:fstore_3        
				boolean flag1 = false;
	//   46   88:iconst_0        
	//   47   89:istore          14
				Object obj = null;
	//   48   91:aconst_null     
	//   49   92:astore          19
				boolean flag3 = false;
	//   50   94:iconst_0        
	//   51   95:istore          16
				Object obj2 = null;
	//   52   97:aconst_null     
	//   53   98:astore          25
				if(f5 > 0.0F)
	//*  54  100:fload           7
	//*  55  102:fconst_0        
	//*  56  103:fcmpl           
	//*  57  104:ifle            162
				{
					f1 = f5;
	//   58  107:fload           7
	//   59  109:fstore_3        
					setLineWidth(f5);
	//   60  110:aload_0         
	//   61  111:fload           7
	//   62  113:invokevirtual   #1270 <Method void setLineWidth(float)>
					flag1 = true;
	//   63  116:iconst_1        
	//   64  117:istore          14
					float f4;
					boolean flag;
					boolean flag2;
					boolean flag4;
					boolean flag5;
					Object obj1;
					BaseColor basecolor1;
					if(basecolor2 == null)
	//*  65  119:aload           23
	//*  66  121:ifnonnull       814
						resetRGBColorStroke();
	//   67  124:aload_0         
	//   68  125:invokevirtual   #1536 <Method void resetRGBColorStroke()>
					else
	//*  69  128:aload           23
	//*  70  130:astore          19
	//*  71  132:aload_0         
	//*  72  133:fload           10
	//*  73  135:fload           4
	//*  74  137:fload           7
	//*  75  139:fconst_2        
	//*  76  140:fdiv            
	//*  77  141:fsub            
	//*  78  142:invokevirtual   #1538 <Method void moveTo(float, float)>
	//*  79  145:aload_0         
	//*  80  146:fload           12
	//*  81  148:fload           4
	//*  82  150:fload           7
	//*  83  152:fconst_2        
	//*  84  153:fdiv            
	//*  85  154:fsub            
	//*  86  155:invokevirtual   #1540 <Method void lineTo(float, float)>
	//*  87  158:aload_0         
	//*  88  159:invokevirtual   #1278 <Method void stroke()>
	//*  89  162:aload           19
	//*  90  164:astore_1        
	//*  91  165:iload           14
	//*  92  167:istore          13
	//*  93  169:fload_3         
	//*  94  170:fstore_2        
	//*  95  171:fload           8
	//*  96  173:fconst_0        
	//*  97  174:fcmpl           
	//*  98  175:ifle            264
	//*  99  178:fload_3         
	//* 100  179:fstore_2        
	//* 101  180:fload           8
	//* 102  182:fload_3         
	//* 103  183:fcmpl           
	//* 104  184:ifeq            196
	//* 105  187:fload           8
	//* 106  189:fstore_2        
	//* 107  190:aload_0         
	//* 108  191:fload           8
	//* 109  193:invokevirtual   #1270 <Method void setLineWidth(float)>
	//* 110  196:iload           14
	//* 111  198:ifeq            219
	//* 112  201:aload           19
	//* 113  203:astore_1        
	//* 114  204:iload           14
	//* 115  206:istore          13
	//* 116  208:aload_0         
	//* 117  209:aload           19
	//* 118  211:aload           24
	//* 119  213:invokespecial   #1995 <Method boolean compareColors(BaseColor, BaseColor)>
	//* 120  216:ifne            234
	//* 121  219:iconst_1        
	//* 122  220:istore          13
	//* 123  222:aload           24
	//* 124  224:ifnonnull       823
	//* 125  227:aload_0         
	//* 126  228:invokevirtual   #1536 <Method void resetRGBColorStroke()>
	//* 127  231:aload           24
	//* 128  233:astore_1        
	//* 129  234:aload_0         
	//* 130  235:fload           12
	//* 131  237:fload           8
	//* 132  239:fconst_2        
	//* 133  240:fdiv            
	//* 134  241:fload           5
	//* 135  243:fadd            
	//* 136  244:invokevirtual   #1538 <Method void moveTo(float, float)>
	//* 137  247:aload_0         
	//* 138  248:fload           10
	//* 139  250:fload           8
	//* 140  252:fconst_2        
	//* 141  253:fdiv            
	//* 142  254:fload           5
	//* 143  256:fadd            
	//* 144  257:invokevirtual   #1540 <Method void lineTo(float, float)>
	//* 145  260:aload_0         
	//* 146  261:invokevirtual   #1278 <Method void stroke()>
	//* 147  264:aload_1         
	//* 148  265:astore          21
	//* 149  267:iload           13
	//* 150  269:istore          14
	//* 151  271:iload           16
	//* 152  273:istore          15
	//* 153  275:aload           25
	//* 154  277:astore          22
	//* 155  279:fload_2         
	//* 156  280:fstore          6
	//* 157  282:fload           9
	//* 158  284:fconst_0        
	//* 159  285:fcmpl           
	//* 160  286:ifle            576
	//* 161  289:fload_2         
	//* 162  290:fstore_3        
	//* 163  291:fload           9
	//* 164  293:fload_2         
	//* 165  294:fcmpl           
	//* 166  295:ifeq            307
	//* 167  298:fload           9
	//* 168  300:fstore_3        
	//* 169  301:aload_0         
	//* 170  302:fload           9
	//* 171  304:invokevirtual   #1270 <Method void setLineWidth(float)>
	//* 172  307:iload           13
	//* 173  309:ifeq            325
	//* 174  312:aload_1         
	//* 175  313:astore          19
	//* 176  315:aload_0         
	//* 177  316:aload_1         
	//* 178  317:aload           20
	//* 179  319:invokespecial   #1995 <Method boolean compareColors(BaseColor, BaseColor)>
	//* 180  322:ifne            341
	//* 181  325:iconst_1        
	//* 182  326:istore          13
	//* 183  328:aload           20
	//* 184  330:ifnonnull       832
	//* 185  333:aload_0         
	//* 186  334:invokevirtual   #1536 <Method void resetRGBColorStroke()>
	//* 187  337:aload           20
	//* 188  339:astore          19
	//* 189  341:aload_0         
	//* 190  342:aload           23
	//* 191  344:aload           20
	//* 192  346:invokespecial   #1995 <Method boolean compareColors(BaseColor, BaseColor)>
	//* 193  349:istore          17
	//* 194  351:aload_0         
	//* 195  352:aload           24
	//* 196  354:aload           20
	//* 197  356:invokespecial   #1995 <Method boolean compareColors(BaseColor, BaseColor)>
	//* 198  359:istore          18
	//* 199  361:fload           9
	//* 200  363:fconst_2        
	//* 201  364:fdiv            
	//* 202  365:fstore          6
	//* 203  367:iload           17
	//* 204  369:ifeq            841
	//* 205  372:fload           4
	//* 206  374:fstore_2        
	//* 207  375:aload_0         
	//* 208  376:fload           12
	//* 209  378:fload           6
	//* 210  380:fsub            
	//* 211  381:fload_2         
	//* 212  382:invokevirtual   #1538 <Method void moveTo(float, float)>
	//* 213  385:fload           9
	//* 214  387:fconst_2        
	//* 215  388:fdiv            
	//* 216  389:fstore          6
	//* 217  391:iload           18
	//* 218  393:ifeq            850
	//* 219  396:fload           5
	//* 220  398:fstore_2        
	//* 221  399:aload_0         
	//* 222  400:fload           12
	//* 223  402:fload           6
	//* 224  404:fsub            
	//* 225  405:fload_2         
	//* 226  406:invokevirtual   #1540 <Method void lineTo(float, float)>
	//* 227  409:aload_0         
	//* 228  410:invokevirtual   #1278 <Method void stroke()>
	//* 229  413:iload           17
	//* 230  415:ifeq            442
	//* 231  418:aload           19
	//* 232  420:astore          21
	//* 233  422:iload           13
	//* 234  424:istore          14
	//* 235  426:iload           16
	//* 236  428:istore          15
	//* 237  430:aload           25
	//* 238  432:astore          22
	//* 239  434:fload_3         
	//* 240  435:fstore          6
	//* 241  437:iload           18
	//* 242  439:ifne            576
	//* 243  442:iconst_1        
	//* 244  443:istore          16
	//* 245  445:aload           20
	//* 246  447:ifnonnull       859
	//* 247  450:aload_0         
	//* 248  451:invokevirtual   #1292 <Method void resetRGBColorFill()>
	//* 249  454:iload           17
	//* 250  456:ifne            496
	//* 251  459:aload_0         
	//* 252  460:fload           12
	//* 253  462:fload           4
	//* 254  464:invokevirtual   #1538 <Method void moveTo(float, float)>
	//* 255  467:aload_0         
	//* 256  468:fload           12
	//* 257  470:fload           4
	//* 258  472:fload           7
	//* 259  474:fsub            
	//* 260  475:invokevirtual   #1540 <Method void lineTo(float, float)>
	//* 261  478:aload_0         
	//* 262  479:fload           12
	//* 263  481:fload           9
	//* 264  483:fsub            
	//* 265  484:fload           4
	//* 266  486:fload           7
	//* 267  488:fsub            
	//* 268  489:invokevirtual   #1540 <Method void lineTo(float, float)>
	//* 269  492:aload_0         
	//* 270  493:invokevirtual   #1286 <Method void fill()>
	//* 271  496:aload           19
	//* 272  498:astore          21
	//* 273  500:iload           13
	//* 274  502:istore          14
	//* 275  504:iload           16
	//* 276  506:istore          15
	//* 277  508:aload           20
	//* 278  510:astore          22
	//* 279  512:fload_3         
	//* 280  513:fstore          6
	//* 281  515:iload           18
	//* 282  517:ifne            576
	//* 283  520:aload_0         
	//* 284  521:fload           12
	//* 285  523:fload           5
	//* 286  525:invokevirtual   #1538 <Method void moveTo(float, float)>
	//* 287  528:aload_0         
	//* 288  529:fload           12
	//* 289  531:fload           5
	//* 290  533:fload           8
	//* 291  535:fadd            
	//* 292  536:invokevirtual   #1540 <Method void lineTo(float, float)>
	//* 293  539:aload_0         
	//* 294  540:fload           12
	//* 295  542:fload           9
	//* 296  544:fsub            
	//* 297  545:fload           5
	//* 298  547:fload           8
	//* 299  549:fadd            
	//* 300  550:invokevirtual   #1540 <Method void lineTo(float, float)>
	//* 301  553:aload_0         
	//* 302  554:invokevirtual   #1286 <Method void fill()>
	//* 303  557:fload_3         
	//* 304  558:fstore          6
	//* 305  560:aload           20
	//* 306  562:astore          22
	//* 307  564:iload           16
	//* 308  566:istore          15
	//* 309  568:iload           13
	//* 310  570:istore          14
	//* 311  572:aload           19
	//* 312  574:astore          21
	//* 313  576:fload           11
	//* 314  578:fconst_0        
	//* 315  579:fcmpl           
	//* 316  580:ifle            809
	//* 317  583:fload           11
	//* 318  585:fload           6
	//* 319  587:fcmpl           
	//* 320  588:ifeq            597
	//* 321  591:aload_0         
	//* 322  592:fload           11
	//* 323  594:invokevirtual   #1270 <Method void setLineWidth(float)>
	//* 324  597:iload           14
	//* 325  599:ifeq            613
	//* 326  602:aload_0         
	//* 327  603:aload           21
	//* 328  605:aload           26
	//* 329  607:invokespecial   #1995 <Method boolean compareColors(BaseColor, BaseColor)>
	//* 330  610:ifne            622
	//* 331  613:aload           26
	//* 332  615:ifnonnull       868
	//* 333  618:aload_0         
	//* 334  619:invokevirtual   #1536 <Method void resetRGBColorStroke()>
	//* 335  622:aload_0         
	//* 336  623:aload           23
	//* 337  625:aload           26
	//* 338  627:invokespecial   #1995 <Method boolean compareColors(BaseColor, BaseColor)>
	//* 339  630:istore          17
	//* 340  632:aload_0         
	//* 341  633:aload           24
	//* 342  635:aload           26
	//* 343  637:invokespecial   #1995 <Method boolean compareColors(BaseColor, BaseColor)>
	//* 344  640:istore          18
	//* 345  642:fload           11
	//* 346  644:fconst_2        
	//* 347  645:fdiv            
	//* 348  646:fstore_3        
	//* 349  647:iload           17
	//* 350  649:ifeq            877
	//* 351  652:fload           4
	//* 352  654:fstore_2        
	//* 353  655:aload_0         
	//* 354  656:fload           10
	//* 355  658:fload_3         
	//* 356  659:fadd            
	//* 357  660:fload_2         
	//* 358  661:invokevirtual   #1538 <Method void moveTo(float, float)>
	//* 359  664:fload           11
	//* 360  666:fconst_2        
	//* 361  667:fdiv            
	//* 362  668:fstore_3        
	//* 363  669:iload           18
	//* 364  671:ifeq            886
	//* 365  674:fload           5
	//* 366  676:fstore_2        
	//* 367  677:aload_0         
	//* 368  678:fload           10
	//* 369  680:fload_3         
	//* 370  681:fadd            
	//* 371  682:fload_2         
	//* 372  683:invokevirtual   #1540 <Method void lineTo(float, float)>
	//* 373  686:aload_0         
	//* 374  687:invokevirtual   #1278 <Method void stroke()>
	//* 375  690:iload           17
	//* 376  692:ifeq            700
	//* 377  695:iload           18
	//* 378  697:ifne            809
	//* 379  700:iload           15
	//* 380  702:ifeq            716
	//* 381  705:aload_0         
	//* 382  706:aload           22
	//* 383  708:aload           26
	//* 384  710:invokespecial   #1995 <Method boolean compareColors(BaseColor, BaseColor)>
	//* 385  713:ifne            725
	//* 386  716:aload           26
	//* 387  718:ifnonnull       895
	//* 388  721:aload_0         
	//* 389  722:invokevirtual   #1292 <Method void resetRGBColorFill()>
	//* 390  725:iload           17
	//* 391  727:ifne            767
	//* 392  730:aload_0         
	//* 393  731:fload           10
	//* 394  733:fload           4
	//* 395  735:invokevirtual   #1538 <Method void moveTo(float, float)>
	//* 396  738:aload_0         
	//* 397  739:fload           10
	//* 398  741:fload           4
	//* 399  743:fload           7
	//* 400  745:fsub            
	//* 401  746:invokevirtual   #1540 <Method void lineTo(float, float)>
	//* 402  749:aload_0         
	//* 403  750:fload           10
	//* 404  752:fload           11
	//* 405  754:fadd            
	//* 406  755:fload           4
	//* 407  757:fload           7
	//* 408  759:fsub            
	//* 409  760:invokevirtual   #1540 <Method void lineTo(float, float)>
	//* 410  763:aload_0         
	//* 411  764:invokevirtual   #1286 <Method void fill()>
	//* 412  767:iload           18
	//* 413  769:ifne            809
	//* 414  772:aload_0         
	//* 415  773:fload           10
	//* 416  775:fload           5
	//* 417  777:invokevirtual   #1538 <Method void moveTo(float, float)>
	//* 418  780:aload_0         
	//* 419  781:fload           10
	//* 420  783:fload           5
	//* 421  785:fload           8
	//* 422  787:fadd            
	//* 423  788:invokevirtual   #1540 <Method void lineTo(float, float)>
	//* 424  791:aload_0         
	//* 425  792:fload           10
	//* 426  794:fload           11
	//* 427  796:fadd            
	//* 428  797:fload           5
	//* 429  799:fload           8
	//* 430  801:fadd            
	//* 431  802:invokevirtual   #1540 <Method void lineTo(float, float)>
	//* 432  805:aload_0         
	//* 433  806:invokevirtual   #1286 <Method void fill()>
	//* 434  809:aload_0         
	//* 435  810:invokevirtual   #882 <Method void restoreState()>
	//* 436  813:return          
						setColorStroke(basecolor2);
	//  437  814:aload_0         
	//  438  815:aload           23
	//  439  817:invokevirtual   #1267 <Method void setColorStroke(BaseColor)>
					obj = ((Object) (basecolor2));
					moveTo(f8, f2 - f5 / 2.0F);
					lineTo(f10, f2 - f5 / 2.0F);
					stroke();
				}
				rectangle1 = ((Rectangle) (obj));
				flag = flag1;
				f = f1;
				if(f6 <= 0.0F)
					break label0;
				f = f1;
				if(f6 != f1)
				{
					f = f6;
					setLineWidth(f6);
				}
				if(flag1)
				{
					rectangle1 = ((Rectangle) (obj));
					flag = flag1;
					if(compareColors(((BaseColor) (obj)), basecolor3))
						break label1;
				}
				flag = true;
				if(basecolor3 == null)
					resetRGBColorStroke();
				else
	//* 440  820:goto            128
					setColorStroke(basecolor3);
	//  441  823:aload_0         
	//  442  824:aload           24
	//  443  826:invokevirtual   #1267 <Method void setColorStroke(BaseColor)>
				rectangle1 = ((Rectangle) (basecolor3));
			}
			moveTo(f10, f6 / 2.0F + f3);
			lineTo(f8, f6 / 2.0F + f3);
			stroke();
		}
label2:
		{
label3:
			{
				obj1 = ((Object) (rectangle1));
				flag1 = flag;
				flag2 = flag3;
				basecolor1 = ((BaseColor) (obj2));
				f4 = f;
				if(f7 <= 0.0F)
					break label2;
				f1 = f;
				if(f7 != f)
				{
					f1 = f7;
					setLineWidth(f7);
				}
				if(flag)
				{
					obj = ((Object) (rectangle1));
					if(compareColors(((BaseColor) (rectangle1)), basecolor))
						break label3;
				}
				flag = true;
				if(basecolor == null)
					resetRGBColorStroke();
				else
	//* 444  829:goto            231
					setColorStroke(basecolor);
	//  445  832:aload_0         
	//  446  833:aload           20
	//  447  835:invokevirtual   #1267 <Method void setColorStroke(BaseColor)>
				obj = ((Object) (basecolor));
			}
			flag4 = compareColors(basecolor2, basecolor);
			flag5 = compareColors(basecolor3, basecolor);
			f4 = f7 / 2.0F;
			if(flag4)
				f = f2;
			else
	//* 448  838:goto            337
				f = f2 - f5;
	//  449  841:fload           4
	//  450  843:fload           7
	//  451  845:fsub            
	//  452  846:fstore_2        
			moveTo(f10 - f4, f);
			f4 = f7 / 2.0F;
			if(flag5)
				f = f3;
			else
	//* 453  847:goto            375
				f = f3 + f6;
	//  454  850:fload           5
	//  455  852:fload           8
	//  456  854:fadd            
	//  457  855:fstore_2        
			lineTo(f10 - f4, f);
			stroke();
			if(flag4)
			{
				obj1 = obj;
				flag1 = flag;
				flag2 = flag3;
				basecolor1 = ((BaseColor) (obj2));
				f4 = f1;
				if(flag5)
					break label2;
			}
			flag3 = true;
			if(basecolor == null)
				resetRGBColorFill();
			else
	//* 458  856:goto            399
				setColorFill(basecolor);
	//  459  859:aload_0         
	//  460  860:aload           20
	//  461  862:invokevirtual   #1281 <Method void setColorFill(BaseColor)>
			if(!flag4)
			{
				moveTo(f10, f2);
				lineTo(f10, f2 - f5);
				lineTo(f10 - f7, f2 - f5);
				fill();
			}
			obj1 = obj;
			flag1 = flag;
			flag2 = flag3;
			basecolor1 = basecolor;
			f4 = f1;
			if(!flag5)
			{
				moveTo(f10, f3);
				lineTo(f10, f3 + f6);
				lineTo(f10 - f7, f3 + f6);
				fill();
				f4 = f1;
				basecolor1 = basecolor;
				flag2 = flag3;
				flag1 = flag;
				obj1 = obj;
			}
		}
		if(f9 > 0.0F)
		{
			if(f9 != f4)
				setLineWidth(f9);
			if(!flag1 || !compareColors(((BaseColor) (obj1)), basecolor4))
				if(basecolor4 == null)
					resetRGBColorStroke();
				else
	//* 462  865:goto            454
					setColorStroke(basecolor4);
	//  463  868:aload_0         
	//  464  869:aload           26
	//  465  871:invokevirtual   #1267 <Method void setColorStroke(BaseColor)>
			flag4 = compareColors(basecolor2, basecolor4);
			flag5 = compareColors(basecolor3, basecolor4);
			f1 = f9 / 2.0F;
			if(flag4)
				f = f2;
			else
	//* 466  874:goto            622
				f = f2 - f5;
	//  467  877:fload           4
	//  468  879:fload           7
	//  469  881:fsub            
	//  470  882:fstore_2        
			moveTo(f8 + f1, f);
			f1 = f9 / 2.0F;
			if(flag5)
				f = f3;
			else
	//* 471  883:goto            655
				f = f3 + f6;
	//  472  886:fload           5
	//  473  888:fload           8
	//  474  890:fadd            
	//  475  891:fstore_2        
			lineTo(f8 + f1, f);
			stroke();
			if(!flag4 || !flag5)
			{
				if(!flag2 || !compareColors(basecolor1, basecolor4))
					if(basecolor4 == null)
						resetRGBColorFill();
					else
	//* 476  892:goto            677
						setColorFill(basecolor4);
	//  477  895:aload_0         
	//  478  896:aload           26
	//  479  898:invokevirtual   #1281 <Method void setColorFill(BaseColor)>
				if(!flag4)
				{
					moveTo(f8, f2);
					lineTo(f8, f2 - f5);
					lineTo(f8 + f9, f2 - f5);
					fill();
				}
				if(!flag5)
				{
					moveTo(f8, f3);
					lineTo(f8, f3 + f6);
					lineTo(f8 + f9, f3 + f6);
					fill();
				}
			}
		}
		restoreState();
	//* 480  901:goto            725
	}

	public static final int ALIGN_CENTER = 1;
	public static final int ALIGN_LEFT = 0;
	public static final int ALIGN_RIGHT = 2;
	public static final int LINE_CAP_BUTT = 0;
	public static final int LINE_CAP_PROJECTING_SQUARE = 2;
	public static final int LINE_CAP_ROUND = 1;
	public static final int LINE_JOIN_BEVEL = 2;
	public static final int LINE_JOIN_MITER = 0;
	public static final int LINE_JOIN_ROUND = 1;
	public static final int TEXT_RENDER_MODE_CLIP = 7;
	public static final int TEXT_RENDER_MODE_FILL = 0;
	public static final int TEXT_RENDER_MODE_FILL_CLIP = 4;
	public static final int TEXT_RENDER_MODE_FILL_STROKE = 2;
	public static final int TEXT_RENDER_MODE_FILL_STROKE_CLIP = 6;
	public static final int TEXT_RENDER_MODE_INVISIBLE = 3;
	public static final int TEXT_RENDER_MODE_STROKE = 1;
	public static final int TEXT_RENDER_MODE_STROKE_CLIP = 5;
	private static HashMap abrev;
	private static final float unitRect[] = {
		0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 0.0F, 1.0F, 1.0F
	};
	protected ByteBuffer content;
	protected PdfContentByte duplicatedFrom;
	private boolean inText;
	protected ArrayList layerDepth;
	protected int markedContentSize;
	private int mcDepth;
	private ArrayList mcElements;
	protected PdfDocument pdf;
	protected int separator;
	protected GraphicState state;
	protected ArrayList stateList;
	private boolean suppressTagging;
	protected PdfWriter writer;

	static 
	{
	//    0    0:bipush          8
	//    1    2:newarray        float[]
	//    2    4:dup             
	//    3    5:iconst_0        
	//    4    6:fconst_0        
	//    5    7:fastore         
	//    6    8:dup             
	//    7    9:iconst_1        
	//    8   10:fconst_0        
	//    9   11:fastore         
	//   10   12:dup             
	//   11   13:iconst_2        
	//   12   14:fconst_0        
	//   13   15:fastore         
	//   14   16:dup             
	//   15   17:iconst_3        
	//   16   18:fconst_1        
	//   17   19:fastore         
	//   18   20:dup             
	//   19   21:iconst_4        
	//   20   22:fconst_1        
	//   21   23:fastore         
	//   22   24:dup             
	//   23   25:iconst_5        
	//   24   26:fconst_0        
	//   25   27:fastore         
	//   26   28:dup             
	//   27   29:bipush          6
	//   28   31:fconst_1        
	//   29   32:fastore         
	//   30   33:dup             
	//   31   34:bipush          7
	//   32   36:fconst_1        
	//   33   37:fastore         
	//   34   38:putstatic       #68  <Field float[] unitRect>
		abrev = new HashMap();
	//   35   41:new             #70  <Class HashMap>
	//   36   44:dup             
	//   37   45:invokespecial   #73  <Method void HashMap()>
	//   38   48:putstatic       #75  <Field HashMap abrev>
		abrev.put(((Object) (PdfName.BITSPERCOMPONENT)), "/BPC ");
	//   39   51:getstatic       #75  <Field HashMap abrev>
	//   40   54:getstatic       #81  <Field PdfName PdfName.BITSPERCOMPONENT>
	//   41   57:ldc1            #83  <String "/BPC ">
	//   42   59:invokevirtual   #87  <Method Object HashMap.put(Object, Object)>
	//   43   62:pop             
		abrev.put(((Object) (PdfName.COLORSPACE)), "/CS ");
	//   44   63:getstatic       #75  <Field HashMap abrev>
	//   45   66:getstatic       #90  <Field PdfName PdfName.COLORSPACE>
	//   46   69:ldc1            #92  <String "/CS ">
	//   47   71:invokevirtual   #87  <Method Object HashMap.put(Object, Object)>
	//   48   74:pop             
		abrev.put(((Object) (PdfName.DECODE)), "/D ");
	//   49   75:getstatic       #75  <Field HashMap abrev>
	//   50   78:getstatic       #95  <Field PdfName PdfName.DECODE>
	//   51   81:ldc1            #97  <String "/D ">
	//   52   83:invokevirtual   #87  <Method Object HashMap.put(Object, Object)>
	//   53   86:pop             
		abrev.put(((Object) (PdfName.DECODEPARMS)), "/DP ");
	//   54   87:getstatic       #75  <Field HashMap abrev>
	//   55   90:getstatic       #100 <Field PdfName PdfName.DECODEPARMS>
	//   56   93:ldc1            #102 <String "/DP ">
	//   57   95:invokevirtual   #87  <Method Object HashMap.put(Object, Object)>
	//   58   98:pop             
		abrev.put(((Object) (PdfName.FILTER)), "/F ");
	//   59   99:getstatic       #75  <Field HashMap abrev>
	//   60  102:getstatic       #105 <Field PdfName PdfName.FILTER>
	//   61  105:ldc1            #107 <String "/F ">
	//   62  107:invokevirtual   #87  <Method Object HashMap.put(Object, Object)>
	//   63  110:pop             
		abrev.put(((Object) (PdfName.HEIGHT)), "/H ");
	//   64  111:getstatic       #75  <Field HashMap abrev>
	//   65  114:getstatic       #110 <Field PdfName PdfName.HEIGHT>
	//   66  117:ldc1            #112 <String "/H ">
	//   67  119:invokevirtual   #87  <Method Object HashMap.put(Object, Object)>
	//   68  122:pop             
		abrev.put(((Object) (PdfName.IMAGEMASK)), "/IM ");
	//   69  123:getstatic       #75  <Field HashMap abrev>
	//   70  126:getstatic       #115 <Field PdfName PdfName.IMAGEMASK>
	//   71  129:ldc1            #117 <String "/IM ">
	//   72  131:invokevirtual   #87  <Method Object HashMap.put(Object, Object)>
	//   73  134:pop             
		abrev.put(((Object) (PdfName.INTENT)), "/Intent ");
	//   74  135:getstatic       #75  <Field HashMap abrev>
	//   75  138:getstatic       #120 <Field PdfName PdfName.INTENT>
	//   76  141:ldc1            #122 <String "/Intent ">
	//   77  143:invokevirtual   #87  <Method Object HashMap.put(Object, Object)>
	//   78  146:pop             
		abrev.put(((Object) (PdfName.INTERPOLATE)), "/I ");
	//   79  147:getstatic       #75  <Field HashMap abrev>
	//   80  150:getstatic       #125 <Field PdfName PdfName.INTERPOLATE>
	//   81  153:ldc1            #127 <String "/I ">
	//   82  155:invokevirtual   #87  <Method Object HashMap.put(Object, Object)>
	//   83  158:pop             
		abrev.put(((Object) (PdfName.WIDTH)), "/W ");
	//   84  159:getstatic       #75  <Field HashMap abrev>
	//   85  162:getstatic       #130 <Field PdfName PdfName.WIDTH>
	//   86  165:ldc1            #132 <String "/W ">
	//   87  167:invokevirtual   #87  <Method Object HashMap.put(Object, Object)>
	//   88  170:pop             
	//*  89  171:return          
	}
}

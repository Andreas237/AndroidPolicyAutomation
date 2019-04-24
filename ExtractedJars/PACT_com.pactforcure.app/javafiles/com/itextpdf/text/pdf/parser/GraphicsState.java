// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf.parser;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.pdf.CMapAwareDocumentFont;
import com.itextpdf.text.pdf.PdfName;

// Referenced classes of package com.itextpdf.text.pdf.parser:
//			Matrix, LineDashPattern

public class GraphicsState
{

	public GraphicsState()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #35  <Method void Object()>
		fillColor = BaseColor.BLACK;
	//    2    4:aload_0         
	//    3    5:getstatic       #40  <Field BaseColor BaseColor.BLACK>
	//    4    8:putfield        #42  <Field BaseColor fillColor>
		strokeColor = BaseColor.BLACK;
	//    5   11:aload_0         
	//    6   12:getstatic       #40  <Field BaseColor BaseColor.BLACK>
	//    7   15:putfield        #44  <Field BaseColor strokeColor>
		ctm = new Matrix();
	//    8   18:aload_0         
	//    9   19:new             #46  <Class Matrix>
	//   10   22:dup             
	//   11   23:invokespecial   #47  <Method void Matrix()>
	//   12   26:putfield        #49  <Field Matrix ctm>
		characterSpacing = 0.0F;
	//   13   29:aload_0         
	//   14   30:fconst_0        
	//   15   31:putfield        #51  <Field float characterSpacing>
		wordSpacing = 0.0F;
	//   16   34:aload_0         
	//   17   35:fconst_0        
	//   18   36:putfield        #53  <Field float wordSpacing>
		horizontalScaling = 1.0F;
	//   19   39:aload_0         
	//   20   40:fconst_1        
	//   21   41:putfield        #55  <Field float horizontalScaling>
		leading = 0.0F;
	//   22   44:aload_0         
	//   23   45:fconst_0        
	//   24   46:putfield        #57  <Field float leading>
		font = null;
	//   25   49:aload_0         
	//   26   50:aconst_null     
	//   27   51:putfield        #59  <Field CMapAwareDocumentFont font>
		fontSize = 0.0F;
	//   28   54:aload_0         
	//   29   55:fconst_0        
	//   30   56:putfield        #61  <Field float fontSize>
		renderMode = 0;
	//   31   59:aload_0         
	//   32   60:iconst_0        
	//   33   61:putfield        #63  <Field int renderMode>
		rise = 0.0F;
	//   34   64:aload_0         
	//   35   65:fconst_0        
	//   36   66:putfield        #65  <Field float rise>
		knockout = true;
	//   37   69:aload_0         
	//   38   70:iconst_1        
	//   39   71:putfield        #67  <Field boolean knockout>
		colorSpaceFill = null;
	//   40   74:aload_0         
	//   41   75:aconst_null     
	//   42   76:putfield        #69  <Field PdfName colorSpaceFill>
		colorSpaceStroke = null;
	//   43   79:aload_0         
	//   44   80:aconst_null     
	//   45   81:putfield        #71  <Field PdfName colorSpaceStroke>
		fillColor = null;
	//   46   84:aload_0         
	//   47   85:aconst_null     
	//   48   86:putfield        #42  <Field BaseColor fillColor>
		strokeColor = null;
	//   49   89:aload_0         
	//   50   90:aconst_null     
	//   51   91:putfield        #44  <Field BaseColor strokeColor>
		lineWidth = 1.0F;
	//   52   94:aload_0         
	//   53   95:fconst_1        
	//   54   96:putfield        #73  <Field float lineWidth>
		lineCapStyle = 0;
	//   55   99:aload_0         
	//   56  100:iconst_0        
	//   57  101:putfield        #75  <Field int lineCapStyle>
		lineJoinStyle = 0;
	//   58  104:aload_0         
	//   59  105:iconst_0        
	//   60  106:putfield        #77  <Field int lineJoinStyle>
		miterLimit = 10F;
	//   61  109:aload_0         
	//   62  110:ldc1            #78  <Float 10F>
	//   63  112:putfield        #80  <Field float miterLimit>
	//   64  115:return          
	}

	public GraphicsState(GraphicsState graphicsstate)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #35  <Method void Object()>
		fillColor = BaseColor.BLACK;
	//    2    4:aload_0         
	//    3    5:getstatic       #40  <Field BaseColor BaseColor.BLACK>
	//    4    8:putfield        #42  <Field BaseColor fillColor>
		strokeColor = BaseColor.BLACK;
	//    5   11:aload_0         
	//    6   12:getstatic       #40  <Field BaseColor BaseColor.BLACK>
	//    7   15:putfield        #44  <Field BaseColor strokeColor>
		ctm = graphicsstate.ctm;
	//    8   18:aload_0         
	//    9   19:aload_1         
	//   10   20:getfield        #49  <Field Matrix ctm>
	//   11   23:putfield        #49  <Field Matrix ctm>
		characterSpacing = graphicsstate.characterSpacing;
	//   12   26:aload_0         
	//   13   27:aload_1         
	//   14   28:getfield        #51  <Field float characterSpacing>
	//   15   31:putfield        #51  <Field float characterSpacing>
		wordSpacing = graphicsstate.wordSpacing;
	//   16   34:aload_0         
	//   17   35:aload_1         
	//   18   36:getfield        #53  <Field float wordSpacing>
	//   19   39:putfield        #53  <Field float wordSpacing>
		horizontalScaling = graphicsstate.horizontalScaling;
	//   20   42:aload_0         
	//   21   43:aload_1         
	//   22   44:getfield        #55  <Field float horizontalScaling>
	//   23   47:putfield        #55  <Field float horizontalScaling>
		leading = graphicsstate.leading;
	//   24   50:aload_0         
	//   25   51:aload_1         
	//   26   52:getfield        #57  <Field float leading>
	//   27   55:putfield        #57  <Field float leading>
		font = graphicsstate.font;
	//   28   58:aload_0         
	//   29   59:aload_1         
	//   30   60:getfield        #59  <Field CMapAwareDocumentFont font>
	//   31   63:putfield        #59  <Field CMapAwareDocumentFont font>
		fontSize = graphicsstate.fontSize;
	//   32   66:aload_0         
	//   33   67:aload_1         
	//   34   68:getfield        #61  <Field float fontSize>
	//   35   71:putfield        #61  <Field float fontSize>
		renderMode = graphicsstate.renderMode;
	//   36   74:aload_0         
	//   37   75:aload_1         
	//   38   76:getfield        #63  <Field int renderMode>
	//   39   79:putfield        #63  <Field int renderMode>
		rise = graphicsstate.rise;
	//   40   82:aload_0         
	//   41   83:aload_1         
	//   42   84:getfield        #65  <Field float rise>
	//   43   87:putfield        #65  <Field float rise>
		knockout = graphicsstate.knockout;
	//   44   90:aload_0         
	//   45   91:aload_1         
	//   46   92:getfield        #67  <Field boolean knockout>
	//   47   95:putfield        #67  <Field boolean knockout>
		colorSpaceFill = graphicsstate.colorSpaceFill;
	//   48   98:aload_0         
	//   49   99:aload_1         
	//   50  100:getfield        #69  <Field PdfName colorSpaceFill>
	//   51  103:putfield        #69  <Field PdfName colorSpaceFill>
		colorSpaceStroke = graphicsstate.colorSpaceStroke;
	//   52  106:aload_0         
	//   53  107:aload_1         
	//   54  108:getfield        #71  <Field PdfName colorSpaceStroke>
	//   55  111:putfield        #71  <Field PdfName colorSpaceStroke>
		fillColor = graphicsstate.fillColor;
	//   56  114:aload_0         
	//   57  115:aload_1         
	//   58  116:getfield        #42  <Field BaseColor fillColor>
	//   59  119:putfield        #42  <Field BaseColor fillColor>
		strokeColor = graphicsstate.strokeColor;
	//   60  122:aload_0         
	//   61  123:aload_1         
	//   62  124:getfield        #44  <Field BaseColor strokeColor>
	//   63  127:putfield        #44  <Field BaseColor strokeColor>
		lineWidth = graphicsstate.lineWidth;
	//   64  130:aload_0         
	//   65  131:aload_1         
	//   66  132:getfield        #73  <Field float lineWidth>
	//   67  135:putfield        #73  <Field float lineWidth>
		lineCapStyle = graphicsstate.lineCapStyle;
	//   68  138:aload_0         
	//   69  139:aload_1         
	//   70  140:getfield        #75  <Field int lineCapStyle>
	//   71  143:putfield        #75  <Field int lineCapStyle>
		lineJoinStyle = graphicsstate.lineJoinStyle;
	//   72  146:aload_0         
	//   73  147:aload_1         
	//   74  148:getfield        #77  <Field int lineJoinStyle>
	//   75  151:putfield        #77  <Field int lineJoinStyle>
		miterLimit = graphicsstate.miterLimit;
	//   76  154:aload_0         
	//   77  155:aload_1         
	//   78  156:getfield        #80  <Field float miterLimit>
	//   79  159:putfield        #80  <Field float miterLimit>
		if(graphicsstate.lineDashPattern != null)
	//*  80  162:aload_1         
	//*  81  163:getfield        #84  <Field LineDashPattern lineDashPattern>
	//*  82  166:ifnull          194
			lineDashPattern = new LineDashPattern(graphicsstate.lineDashPattern.getDashArray(), graphicsstate.lineDashPattern.getDashPhase());
	//   83  169:aload_0         
	//   84  170:new             #86  <Class LineDashPattern>
	//   85  173:dup             
	//   86  174:aload_1         
	//   87  175:getfield        #84  <Field LineDashPattern lineDashPattern>
	//   88  178:invokevirtual   #90  <Method com.itextpdf.text.pdf.PdfArray LineDashPattern.getDashArray()>
	//   89  181:aload_1         
	//   90  182:getfield        #84  <Field LineDashPattern lineDashPattern>
	//   91  185:invokevirtual   #94  <Method float LineDashPattern.getDashPhase()>
	//   92  188:invokespecial   #97  <Method void LineDashPattern(com.itextpdf.text.pdf.PdfArray, float)>
	//   93  191:putfield        #84  <Field LineDashPattern lineDashPattern>
	//   94  194:return          
	}

	public float getCharacterSpacing()
	{
		return characterSpacing;
	//    0    0:aload_0         
	//    1    1:getfield        #51  <Field float characterSpacing>
	//    2    4:freturn         
	}

	public PdfName getColorSpaceFill()
	{
		return colorSpaceFill;
	//    0    0:aload_0         
	//    1    1:getfield        #69  <Field PdfName colorSpaceFill>
	//    2    4:areturn         
	}

	public PdfName getColorSpaceStroke()
	{
		return colorSpaceStroke;
	//    0    0:aload_0         
	//    1    1:getfield        #71  <Field PdfName colorSpaceStroke>
	//    2    4:areturn         
	}

	public Matrix getCtm()
	{
		return ctm;
	//    0    0:aload_0         
	//    1    1:getfield        #49  <Field Matrix ctm>
	//    2    4:areturn         
	}

	public BaseColor getFillColor()
	{
		return fillColor;
	//    0    0:aload_0         
	//    1    1:getfield        #42  <Field BaseColor fillColor>
	//    2    4:areturn         
	}

	public CMapAwareDocumentFont getFont()
	{
		return font;
	//    0    0:aload_0         
	//    1    1:getfield        #59  <Field CMapAwareDocumentFont font>
	//    2    4:areturn         
	}

	public float getFontSize()
	{
		return fontSize;
	//    0    0:aload_0         
	//    1    1:getfield        #61  <Field float fontSize>
	//    2    4:freturn         
	}

	public float getHorizontalScaling()
	{
		return horizontalScaling;
	//    0    0:aload_0         
	//    1    1:getfield        #55  <Field float horizontalScaling>
	//    2    4:freturn         
	}

	public float getLeading()
	{
		return leading;
	//    0    0:aload_0         
	//    1    1:getfield        #57  <Field float leading>
	//    2    4:freturn         
	}

	public int getLineCapStyle()
	{
		return lineCapStyle;
	//    0    0:aload_0         
	//    1    1:getfield        #75  <Field int lineCapStyle>
	//    2    4:ireturn         
	}

	public LineDashPattern getLineDashPattern()
	{
		return lineDashPattern;
	//    0    0:aload_0         
	//    1    1:getfield        #84  <Field LineDashPattern lineDashPattern>
	//    2    4:areturn         
	}

	public int getLineJoinStyle()
	{
		return lineJoinStyle;
	//    0    0:aload_0         
	//    1    1:getfield        #77  <Field int lineJoinStyle>
	//    2    4:ireturn         
	}

	public float getLineWidth()
	{
		return lineWidth;
	//    0    0:aload_0         
	//    1    1:getfield        #73  <Field float lineWidth>
	//    2    4:freturn         
	}

	public float getMiterLimit()
	{
		return miterLimit;
	//    0    0:aload_0         
	//    1    1:getfield        #80  <Field float miterLimit>
	//    2    4:freturn         
	}

	public int getRenderMode()
	{
		return renderMode;
	//    0    0:aload_0         
	//    1    1:getfield        #63  <Field int renderMode>
	//    2    4:ireturn         
	}

	public float getRise()
	{
		return rise;
	//    0    0:aload_0         
	//    1    1:getfield        #65  <Field float rise>
	//    2    4:freturn         
	}

	public BaseColor getStrokeColor()
	{
		return strokeColor;
	//    0    0:aload_0         
	//    1    1:getfield        #44  <Field BaseColor strokeColor>
	//    2    4:areturn         
	}

	public float getWordSpacing()
	{
		return wordSpacing;
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field float wordSpacing>
	//    2    4:freturn         
	}

	public boolean isKnockout()
	{
		return knockout;
	//    0    0:aload_0         
	//    1    1:getfield        #67  <Field boolean knockout>
	//    2    4:ireturn         
	}

	public void setLineCapStyle(int i)
	{
		lineCapStyle = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #75  <Field int lineCapStyle>
	//    3    5:return          
	}

	public void setLineDashPattern(LineDashPattern linedashpattern)
	{
		lineDashPattern = new LineDashPattern(linedashpattern.getDashArray(), linedashpattern.getDashPhase());
	//    0    0:aload_0         
	//    1    1:new             #86  <Class LineDashPattern>
	//    2    4:dup             
	//    3    5:aload_1         
	//    4    6:invokevirtual   #90  <Method com.itextpdf.text.pdf.PdfArray LineDashPattern.getDashArray()>
	//    5    9:aload_1         
	//    6   10:invokevirtual   #94  <Method float LineDashPattern.getDashPhase()>
	//    7   13:invokespecial   #97  <Method void LineDashPattern(com.itextpdf.text.pdf.PdfArray, float)>
	//    8   16:putfield        #84  <Field LineDashPattern lineDashPattern>
	//    9   19:return          
	}

	public void setLineJoinStyle(int i)
	{
		lineJoinStyle = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #77  <Field int lineJoinStyle>
	//    3    5:return          
	}

	public void setLineWidth(float f)
	{
		lineWidth = f;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:putfield        #73  <Field float lineWidth>
	//    3    5:return          
	}

	public void setMiterLimit(float f)
	{
		miterLimit = f;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:putfield        #80  <Field float miterLimit>
	//    3    5:return          
	}

	float characterSpacing;
	PdfName colorSpaceFill;
	PdfName colorSpaceStroke;
	Matrix ctm;
	BaseColor fillColor;
	CMapAwareDocumentFont font;
	float fontSize;
	float horizontalScaling;
	boolean knockout;
	float leading;
	private int lineCapStyle;
	private LineDashPattern lineDashPattern;
	private int lineJoinStyle;
	private float lineWidth;
	private float miterLimit;
	int renderMode;
	float rise;
	BaseColor strokeColor;
	float wordSpacing;
}

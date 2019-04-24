// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf.parser;


// Referenced classes of package com.itextpdf.text.pdf.parser:
//			GlyphRenderListener, TextExtractionStrategy

public class GlyphTextRenderListener extends GlyphRenderListener
	implements TextExtractionStrategy
{

	public GlyphTextRenderListener(TextExtractionStrategy textextractionstrategy)
	{
		super(((RenderListener) (textextractionstrategy)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #13  <Method void GlyphRenderListener(RenderListener)>
		_flddelegate = textextractionstrategy;
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:putfield        #15  <Field TextExtractionStrategy _flddelegate>
	//    6   10:return          
	}

	public String getResultantText()
	{
		return _flddelegate.getResultantText();
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field TextExtractionStrategy _flddelegate>
	//    2    4:invokeinterface #20  <Method String TextExtractionStrategy.getResultantText()>
	//    3    9:areturn         
	}

	private final TextExtractionStrategy _flddelegate;
}

// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf.parser;


// Referenced classes of package com.itextpdf.text.pdf.parser:
//			FilteredRenderListener, TextExtractionStrategy, RenderFilter

public class FilteredTextRenderListener extends FilteredRenderListener
	implements TextExtractionStrategy
{

	public transient FilteredTextRenderListener(TextExtractionStrategy textextractionstrategy, RenderFilter arenderfilter[])
	{
		super(((RenderListener) (textextractionstrategy)), arenderfilter);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #13  <Method void FilteredRenderListener(RenderListener, RenderFilter[])>
		_flddelegate = textextractionstrategy;
	//    4    6:aload_0         
	//    5    7:aload_1         
	//    6    8:putfield        #15  <Field TextExtractionStrategy _flddelegate>
	//    7   11:return          
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

// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf.parser;


// Referenced classes of package com.itextpdf.text.pdf.parser:
//			RenderListener

public interface TextExtractionStrategy
	extends RenderListener
{

	public abstract String getResultantText();
}

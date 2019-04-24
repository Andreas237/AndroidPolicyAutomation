// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf.parser;


// Referenced classes of package com.itextpdf.text.pdf.parser:
//			ImageRenderInfo, TextRenderInfo

public interface RenderListener
{

	public abstract void beginTextBlock();

	public abstract void endTextBlock();

	public abstract void renderImage(ImageRenderInfo imagerenderinfo);

	public abstract void renderText(TextRenderInfo textrenderinfo);
}

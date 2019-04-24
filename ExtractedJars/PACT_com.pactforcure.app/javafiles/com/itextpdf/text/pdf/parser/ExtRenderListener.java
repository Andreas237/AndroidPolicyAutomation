// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf.parser;


// Referenced classes of package com.itextpdf.text.pdf.parser:
//			RenderListener, PathConstructionRenderInfo, PathPaintingRenderInfo, Path

public interface ExtRenderListener
	extends RenderListener
{

	public abstract void clipPath(int i);

	public abstract void modifyPath(PathConstructionRenderInfo pathconstructionrenderinfo);

	public abstract Path renderPath(PathPaintingRenderInfo pathpaintingrenderinfo);
}

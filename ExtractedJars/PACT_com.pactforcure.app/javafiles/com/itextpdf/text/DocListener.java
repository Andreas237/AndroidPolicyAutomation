// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text;


// Referenced classes of package com.itextpdf.text:
//			ElementListener, Rectangle

public interface DocListener
	extends ElementListener
{

	public abstract void close();

	public abstract boolean newPage();

	public abstract void open();

	public abstract void resetPageCount();

	public abstract boolean setMarginMirroring(boolean flag);

	public abstract boolean setMarginMirroringTopBottom(boolean flag);

	public abstract boolean setMargins(float f, float f1, float f2, float f3);

	public abstract void setPageCount(int i);

	public abstract boolean setPageSize(Rectangle rectangle);
}

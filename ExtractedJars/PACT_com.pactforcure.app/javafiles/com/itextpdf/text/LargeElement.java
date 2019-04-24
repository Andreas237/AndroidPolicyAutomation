// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text;


// Referenced classes of package com.itextpdf.text:
//			Element

public interface LargeElement
	extends Element
{

	public abstract void flushContent();

	public abstract boolean isComplete();

	public abstract void setComplete(boolean flag);
}

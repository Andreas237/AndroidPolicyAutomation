// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf;


// Referenced classes of package com.itextpdf.text.pdf:
//			BaseFont

public interface HyphenationEvent
{

	public abstract String getHyphenSymbol();

	public abstract String getHyphenatedWordPost();

	public abstract String getHyphenatedWordPre(String s, BaseFont basefont, float f, float f1);
}

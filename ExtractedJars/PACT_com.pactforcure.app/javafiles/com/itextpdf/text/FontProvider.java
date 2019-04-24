// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text;


// Referenced classes of package com.itextpdf.text:
//			BaseColor, Font

public interface FontProvider
{

	public abstract Font getFont(String s, String s1, boolean flag, float f, int i, BaseColor basecolor);

	public abstract boolean isRegistered(String s);
}

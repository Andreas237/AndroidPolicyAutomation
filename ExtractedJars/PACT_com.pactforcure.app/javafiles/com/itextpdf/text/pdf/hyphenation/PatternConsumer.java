// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf.hyphenation;

import java.util.ArrayList;

public interface PatternConsumer
{

	public abstract void addClass(String s);

	public abstract void addException(String s, ArrayList arraylist);

	public abstract void addPattern(String s, String s1);
}

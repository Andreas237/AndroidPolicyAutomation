// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text;

import com.itextpdf.text.pdf.PdfChunk;

public interface SplitCharacter
{

	public abstract boolean isSplitCharacter(int i, int j, int k, char ac[], PdfChunk apdfchunk[]);
}

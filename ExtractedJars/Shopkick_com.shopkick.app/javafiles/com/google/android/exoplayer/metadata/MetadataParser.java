// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer.metadata;

import com.google.android.exoplayer.ParserException;

public interface MetadataParser
{

	public abstract boolean canParse(String s);

	public abstract Object parse(byte abyte0[], int i)
		throws ParserException;
}

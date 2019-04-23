// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer.text;

import com.google.android.exoplayer.ParserException;

// Referenced classes of package com.google.android.exoplayer.text:
//			Subtitle

public interface SubtitleParser
{

	public abstract boolean canParse(String s);

	public abstract Subtitle parse(byte abyte0[], int i, int j)
		throws ParserException;
}

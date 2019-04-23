// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer.upstream;

import com.google.android.exoplayer.ParserException;
import java.io.IOException;
import java.io.InputStream;

// Referenced classes of package com.google.android.exoplayer.upstream:
//			UriLoadable

public static interface UriLoadable$Parser
{

	public abstract Object parse(String s, InputStream inputstream)
		throws ParserException, IOException;
}

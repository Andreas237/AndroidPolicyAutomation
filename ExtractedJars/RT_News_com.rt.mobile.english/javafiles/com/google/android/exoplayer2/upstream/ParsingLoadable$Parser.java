// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.upstream;

import android.net.Uri;
import java.io.IOException;
import java.io.InputStream;

// Referenced classes of package com.google.android.exoplayer2.upstream:
//			ParsingLoadable

public static interface ParsingLoadable$Parser
{

	public abstract Object parse(Uri uri, InputStream inputstream)
		throws IOException;
}

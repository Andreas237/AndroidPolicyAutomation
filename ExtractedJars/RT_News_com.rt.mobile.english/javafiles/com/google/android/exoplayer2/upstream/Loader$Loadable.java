// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.upstream;

import java.io.IOException;

// Referenced classes of package com.google.android.exoplayer2.upstream:
//			Loader

public static interface Loader$Loadable
{

	public abstract void cancelLoad();

	public abstract void load()
		throws IOException, InterruptedException;
}

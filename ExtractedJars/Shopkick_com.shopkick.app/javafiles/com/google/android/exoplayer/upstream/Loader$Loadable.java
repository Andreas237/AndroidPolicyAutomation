// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer.upstream;

import java.io.IOException;

// Referenced classes of package com.google.android.exoplayer.upstream:
//			Loader

public static interface Loader$Loadable
{

	public abstract void cancelLoad();

	public abstract boolean isLoadCanceled();

	public abstract void load()
		throws IOException, InterruptedException;
}

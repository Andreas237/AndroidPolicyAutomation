// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer.upstream;

import java.io.IOException;

// Referenced classes of package com.google.android.exoplayer.upstream:
//			Loader

public static interface Loader$Callback
{

	public abstract void onLoadCanceled(Loader$Loadable loader$loadable);

	public abstract void onLoadCompleted(Loader$Loadable loader$loadable);

	public abstract void onLoadError(Loader$Loadable loader$loadable, IOException ioexception);
}

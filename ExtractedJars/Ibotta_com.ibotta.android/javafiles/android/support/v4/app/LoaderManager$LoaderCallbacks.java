// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.app;

import android.os.Bundle;
import android.support.v4.content.Loader;

// Referenced classes of package android.support.v4.app:
//			LoaderManager

public static interface LoaderManager$LoaderCallbacks
{

	public abstract Loader onCreateLoader(int i, Bundle bundle);

	public abstract void onLoadFinished(Loader loader, Object obj);

	public abstract void onLoaderReset(Loader loader);
}

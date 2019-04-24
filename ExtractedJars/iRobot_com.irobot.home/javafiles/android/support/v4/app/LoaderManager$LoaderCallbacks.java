// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.app;

import android.os.Bundle;
import android.support.v4.content.b;

// Referenced classes of package android.support.v4.app:
//			LoaderManager

public static interface LoaderManager$LoaderCallbacks
{

	public abstract b onCreateLoader(int i, Bundle bundle);

	public abstract void onLoadFinished(b b, Object obj);

	public abstract void onLoaderReset(b b);
}

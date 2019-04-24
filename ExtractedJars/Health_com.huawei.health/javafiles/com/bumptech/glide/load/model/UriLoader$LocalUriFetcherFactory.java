// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.load.model;

import android.net.Uri;
import com.bumptech.glide.load.data.DataFetcher;

// Referenced classes of package com.bumptech.glide.load.model:
//			UriLoader

public static interface UriLoader$LocalUriFetcherFactory
{

	public abstract DataFetcher build(Uri uri);
}

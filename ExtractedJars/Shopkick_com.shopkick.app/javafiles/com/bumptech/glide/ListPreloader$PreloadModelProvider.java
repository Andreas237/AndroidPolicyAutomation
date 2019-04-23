// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide;

import java.util.List;

// Referenced classes of package com.bumptech.glide:
//			ListPreloader, RequestBuilder

public static interface ListPreloader$PreloadModelProvider
{

	public abstract List getPreloadItems(int i);

	public abstract RequestBuilder getPreloadRequestBuilder(Object obj);
}

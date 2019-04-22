// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.ibotta.android.mvp.base.loading.pagination;

import java.util.Set;

public interface PaginationLoaderListener
{

	public abstract void onLoadFailed(Set set);

	public abstract void onLoading(Set set, boolean flag);

	public abstract void onStoppedLoading(Set set);
}

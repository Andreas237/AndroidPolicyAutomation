// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.ibotta.android.mvp.base.loading.pagination;

import java.util.Set;

// Referenced classes of package com.ibotta.android.mvp.base.loading.pagination:
//			PaginationLoaderListener

public interface PaginationLoader
{

	public abstract boolean isLoading();

	public abstract void loadMore();

	public abstract void onDetach();

	public abstract void onStart();

	public abstract void onStop();

	public abstract void reload();

	public abstract void setFilters(Set set);

	public abstract void setListener(PaginationLoaderListener paginationloaderlistener);
}

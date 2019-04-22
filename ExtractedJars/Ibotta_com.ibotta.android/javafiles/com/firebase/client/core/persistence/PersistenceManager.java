// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.firebase.client.core.persistence;

import com.firebase.client.core.CompoundWrite;
import com.firebase.client.core.Path;
import com.firebase.client.core.view.CacheNode;
import com.firebase.client.core.view.QuerySpec;
import com.firebase.client.snapshot.Node;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;

public interface PersistenceManager
{

	public abstract void applyUserWriteToServerCache(Path path, CompoundWrite compoundwrite);

	public abstract void applyUserWriteToServerCache(Path path, Node node);

	public abstract List loadUserWrites();

	public abstract void removeAllUserWrites();

	public abstract void removeUserWrite(long l);

	public abstract Object runInTransaction(Callable callable);

	public abstract void saveUserMerge(Path path, CompoundWrite compoundwrite, long l);

	public abstract void saveUserOverwrite(Path path, Node node, long l);

	public abstract CacheNode serverCache(QuerySpec queryspec);

	public abstract void setQueryActive(QuerySpec queryspec);

	public abstract void setQueryComplete(QuerySpec queryspec);

	public abstract void setQueryInactive(QuerySpec queryspec);

	public abstract void setTrackedQueryKeys(QuerySpec queryspec, Set set);

	public abstract void updateServerCache(Path path, CompoundWrite compoundwrite);

	public abstract void updateServerCache(QuerySpec queryspec, Node node);

	public abstract void updateTrackedQueryKeys(QuerySpec queryspec, Set set, Set set1);
}

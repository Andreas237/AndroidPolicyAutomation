// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.firebase.client.core.persistence;

import com.firebase.client.core.CompoundWrite;
import com.firebase.client.core.Path;
import com.firebase.client.snapshot.Node;
import java.util.List;
import java.util.Set;

// Referenced classes of package com.firebase.client.core.persistence:
//			PruneForest, TrackedQuery

public interface PersistenceStorageEngine
{

	public abstract void beginTransaction();

	public abstract void deleteTrackedQuery(long l);

	public abstract void endTransaction();

	public abstract List loadTrackedQueries();

	public abstract Set loadTrackedQueryKeys(long l);

	public abstract Set loadTrackedQueryKeys(Set set);

	public abstract List loadUserWrites();

	public abstract void mergeIntoServerCache(Path path, CompoundWrite compoundwrite);

	public abstract void mergeIntoServerCache(Path path, Node node);

	public abstract void overwriteServerCache(Path path, Node node);

	public abstract void pruneCache(Path path, PruneForest pruneforest);

	public abstract void removeAllUserWrites();

	public abstract void removeUserWrite(long l);

	public abstract void resetPreviouslyActiveTrackedQueries(long l);

	public abstract void saveTrackedQuery(TrackedQuery trackedquery);

	public abstract void saveTrackedQueryKeys(long l, Set set);

	public abstract void saveUserMerge(Path path, CompoundWrite compoundwrite, long l);

	public abstract void saveUserOverwrite(Path path, Node node, long l);

	public abstract Node serverCache(Path path);

	public abstract long serverCacheEstimatedSizeInBytes();

	public abstract void setTransactionSuccessful();

	public abstract void updateTrackedQueryKeys(long l, Set set, Set set1);
}

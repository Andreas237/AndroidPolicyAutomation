// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package androidx.work.impl.model;

import java.util.List;

// Referenced classes of package androidx.work.impl.model:
//			WorkTag

public interface WorkTagDao
{

	public abstract List getTagsForWorkSpecId(String s);

	public abstract List getWorkSpecIdsWithTag(String s);

	public abstract void insert(WorkTag worktag);
}

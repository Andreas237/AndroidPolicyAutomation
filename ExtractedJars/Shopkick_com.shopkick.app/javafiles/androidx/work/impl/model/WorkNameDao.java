// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package androidx.work.impl.model;

import java.util.List;

// Referenced classes of package androidx.work.impl.model:
//			WorkName

public interface WorkNameDao
{

	public abstract List getWorkSpecIdsWithName(String s);

	public abstract void insert(WorkName workname);
}

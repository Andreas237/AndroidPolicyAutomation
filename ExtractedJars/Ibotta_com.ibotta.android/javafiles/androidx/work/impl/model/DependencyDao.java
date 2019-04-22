// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package androidx.work.impl.model;

import java.util.List;

// Referenced classes of package androidx.work.impl.model:
//			Dependency

public interface DependencyDao
{

	public abstract List getDependentWorkIds(String s);

	public abstract List getPrerequisites(String s);

	public abstract boolean hasCompletedAllPrerequisites(String s);

	public abstract boolean hasDependents(String s);

	public abstract void insertDependency(Dependency dependency);
}

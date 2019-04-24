// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package io.fabric.sdk.android.services.concurrency;

import java.util.Collection;

public interface Dependency
{

	public abstract void addDependency(Object obj);

	public abstract boolean areDependenciesMet();

	public abstract Collection getDependencies();
}

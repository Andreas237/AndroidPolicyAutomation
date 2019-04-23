// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package io.radar.shadow.dagger.releasablereferences;


public interface ReleasableReferenceManager
{

	public abstract void releaseStrongReferences();

	public abstract void restoreStrongReferences();

	public abstract Class scope();
}

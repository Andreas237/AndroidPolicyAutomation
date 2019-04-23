// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package androidx.work.impl.constraints;

import java.util.List;

public interface WorkConstraintsCallback
{

	public abstract void onAllConstraintsMet(List list);

	public abstract void onAllConstraintsNotMet(List list);
}

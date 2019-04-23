// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package androidx.work.impl.constraints.controllers;

import java.util.List;

// Referenced classes of package androidx.work.impl.constraints.controllers:
//			ConstraintController

public static interface ConstraintController$OnConstraintUpdatedCallback
{

	public abstract void onConstraintMet(List list);

	public abstract void onConstraintNotMet(List list);
}

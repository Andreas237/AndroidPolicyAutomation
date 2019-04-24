// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.raizlabs.android.dbflow.annotation;

import java.lang.annotation.Annotation;

// Referenced classes of package com.raizlabs.android.dbflow.annotation:
//			ConflictAction

public interface Unique
	extends Annotation
{

	public abstract ConflictAction onUniqueConflict();

	public abstract boolean unique();

	public abstract int[] uniqueGroups();
}

// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.raizlabs.android.dbflow.annotation;

import java.lang.annotation.Annotation;

// Referenced classes of package com.raizlabs.android.dbflow.annotation:
//			ForeignKeyAction, ForeignKeyReference

public interface ForeignKey
	extends Annotation
{

	public abstract boolean deleteForeignKeyModel();

	public abstract ForeignKeyAction onDelete();

	public abstract ForeignKeyAction onUpdate();

	public abstract ForeignKeyReference[] references();

	public abstract boolean saveForeignKeyModel();

	public abstract boolean stubbedRelationship();

	public abstract Class tableClass();
}

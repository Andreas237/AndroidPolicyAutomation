// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.raizlabs.android.dbflow.annotation;

import java.lang.annotation.Annotation;

// Referenced classes of package com.raizlabs.android.dbflow.annotation:
//			IndexGroup, InheritedColumn, InheritedPrimaryKey, ConflictAction, 
//			UniqueGroup

public interface Table
	extends Annotation
{

	public abstract boolean allFields();

	public abstract boolean assignDefaultValuesFromCursor();

	public abstract int cacheSize();

	public abstract boolean cachingEnabled();

	public abstract Class database();

	public abstract IndexGroup[] indexGroups();

	public abstract InheritedColumn[] inheritedColumns();

	public abstract InheritedPrimaryKey[] inheritedPrimaryKeys();

	public abstract ConflictAction insertConflict();

	public abstract String name();

	public abstract boolean orderedCursorLookUp();

	public abstract ConflictAction primaryKeyConflict();

	public abstract UniqueGroup[] uniqueColumnGroups();

	public abstract ConflictAction updateConflict();

	public abstract boolean useBooleanGetterSetters();

	public static final int DEFAULT_CACHE_SIZE = 25;
}

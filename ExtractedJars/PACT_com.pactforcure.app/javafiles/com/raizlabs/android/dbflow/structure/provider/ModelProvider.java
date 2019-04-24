// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.raizlabs.android.dbflow.structure.provider;

import android.net.Uri;
import com.raizlabs.android.dbflow.sql.language.ConditionGroup;

public interface ModelProvider
{

	public abstract Uri getDeleteUri();

	public abstract Uri getInsertUri();

	public abstract Uri getQueryUri();

	public abstract Uri getUpdateUri();

	public abstract void load();

	public transient abstract void load(ConditionGroup conditiongroup, String s, String as[]);
}

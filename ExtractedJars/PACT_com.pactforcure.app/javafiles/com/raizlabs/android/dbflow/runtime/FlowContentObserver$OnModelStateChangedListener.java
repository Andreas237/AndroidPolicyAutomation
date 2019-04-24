// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.raizlabs.android.dbflow.runtime;

import com.raizlabs.android.dbflow.sql.language.SQLCondition;

// Referenced classes of package com.raizlabs.android.dbflow.runtime:
//			FlowContentObserver

public static interface FlowContentObserver$OnModelStateChangedListener
{

	public abstract void onModelStateChanged(Class class1, com.raizlabs.android.dbflow.structure.BaseModel.Action action, SQLCondition asqlcondition[]);
}

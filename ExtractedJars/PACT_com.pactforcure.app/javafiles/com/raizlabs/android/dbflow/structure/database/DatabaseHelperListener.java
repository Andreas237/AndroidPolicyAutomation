// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.raizlabs.android.dbflow.structure.database;


// Referenced classes of package com.raizlabs.android.dbflow.structure.database:
//			DatabaseWrapper

public interface DatabaseHelperListener
{

	public abstract void onCreate(DatabaseWrapper databasewrapper);

	public abstract void onOpen(DatabaseWrapper databasewrapper);

	public abstract void onUpgrade(DatabaseWrapper databasewrapper, int i, int j);
}

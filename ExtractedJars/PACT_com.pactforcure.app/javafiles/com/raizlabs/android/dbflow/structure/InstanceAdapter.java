// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.raizlabs.android.dbflow.structure;

import com.raizlabs.android.dbflow.config.DatabaseDefinition;

// Referenced classes of package com.raizlabs.android.dbflow.structure:
//			RetrievalAdapter

public abstract class InstanceAdapter extends RetrievalAdapter
{

	public InstanceAdapter(DatabaseDefinition databasedefinition)
	{
		super(databasedefinition);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #9   <Method void RetrievalAdapter(DatabaseDefinition)>
	//    3    5:return          
	}

	public abstract Object newInstance();
}

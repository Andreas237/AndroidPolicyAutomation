// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.raizlabs.android.dbflow.structure;

import android.database.Cursor;
import com.raizlabs.android.dbflow.config.DatabaseDefinition;

// Referenced classes of package com.raizlabs.android.dbflow.structure:
//			InstanceAdapter, BaseModelView

public abstract class ModelViewAdapter extends InstanceAdapter
{

	public ModelViewAdapter(DatabaseDefinition databasedefinition)
	{
		super(databasedefinition);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #9   <Method void InstanceAdapter(DatabaseDefinition)>
	//    3    5:return          
	}

	public abstract String getCreationQuery();

	public abstract String getViewName();

	public BaseModelView loadFromCursor(Cursor cursor)
	{
		BaseModelView basemodelview = (BaseModelView)newInstance();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #19  <Method Object newInstance()>
	//    2    4:checkcast       #21  <Class BaseModelView>
	//    3    7:astore_2        
		loadFromCursor(cursor, ((Object) (basemodelview)));
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:aload_2         
	//    7   11:invokevirtual   #24  <Method void loadFromCursor(Cursor, Object)>
		return basemodelview;
	//    8   14:aload_2         
	//    9   15:areturn         
	}
}

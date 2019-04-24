// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.raizlabs.android.dbflow.sql.queriable;

import android.database.Cursor;
import com.raizlabs.android.dbflow.config.DatabaseDefinition;
import com.raizlabs.android.dbflow.config.FlowManager;
import com.raizlabs.android.dbflow.structure.InstanceAdapter;
import com.raizlabs.android.dbflow.structure.database.DatabaseWrapper;

public abstract class ModelLoader
{

	public ModelLoader(Class class1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
		modelClass = class1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #19  <Field Class modelClass>
	//    5    9:return          
	}

	public abstract Object convertToData(Cursor cursor, Object obj);

	public DatabaseDefinition getDatabaseDefinition()
	{
		if(databaseDefinition == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #30  <Field DatabaseDefinition databaseDefinition>
	//*   2    4:ifnonnull       18
			databaseDefinition = FlowManager.getDatabaseForTable(modelClass);
	//    3    7:aload_0         
	//    4    8:aload_0         
	//    5    9:getfield        #19  <Field Class modelClass>
	//    6   12:invokestatic    #36  <Method DatabaseDefinition FlowManager.getDatabaseForTable(Class)>
	//    7   15:putfield        #30  <Field DatabaseDefinition databaseDefinition>
		return databaseDefinition;
	//    8   18:aload_0         
	//    9   19:getfield        #30  <Field DatabaseDefinition databaseDefinition>
	//   10   22:areturn         
	}

	public InstanceAdapter getInstanceAdapter()
	{
		if(instanceAdapter == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #41  <Field InstanceAdapter instanceAdapter>
	//*   2    4:ifnonnull       18
			instanceAdapter = FlowManager.getInstanceAdapter(modelClass);
	//    3    7:aload_0         
	//    4    8:aload_0         
	//    5    9:getfield        #19  <Field Class modelClass>
	//    6   12:invokestatic    #44  <Method InstanceAdapter FlowManager.getInstanceAdapter(Class)>
	//    7   15:putfield        #41  <Field InstanceAdapter instanceAdapter>
		return instanceAdapter;
	//    8   18:aload_0         
	//    9   19:getfield        #41  <Field InstanceAdapter instanceAdapter>
	//   10   22:areturn         
	}

	public Class getModelClass()
	{
		return modelClass;
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field Class modelClass>
	//    2    4:areturn         
	}

	public Object load(Cursor cursor)
	{
		return load(cursor, ((Object) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:invokevirtual   #51  <Method Object load(Cursor, Object)>
	//    4    6:areturn         
	}

	public Object load(Cursor cursor, Object obj)
	{
		Object obj1;
		obj1 = obj;
	//    0    0:aload_2         
	//    1    1:astore_3        
		if(cursor == null)
			break MISSING_BLOCK_LABEL_19;
	//    2    2:aload_1         
	//    3    3:ifnull          19
		obj1 = convertToData(cursor, obj);
	//    4    6:aload_0         
	//    5    7:aload_1         
	//    6    8:aload_2         
	//    7    9:invokevirtual   #55  <Method Object convertToData(Cursor, Object)>
	//    8   12:astore_3        
		cursor.close();
	//    9   13:aload_1         
	//   10   14:invokeinterface #60  <Method void Cursor.close()>
		return obj1;
	//   11   19:aload_3         
	//   12   20:areturn         
		obj;
	//   13   21:astore_2        
		cursor.close();
	//   14   22:aload_1         
	//   15   23:invokeinterface #60  <Method void Cursor.close()>
		throw obj;
	//   16   28:aload_2         
	//   17   29:athrow          
	}

	public Object load(DatabaseWrapper databasewrapper, String s)
	{
		return load(databasewrapper, s, ((Object) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aconst_null     
	//    4    4:invokevirtual   #65  <Method Object load(DatabaseWrapper, String, Object)>
	//    5    7:areturn         
	}

	public Object load(DatabaseWrapper databasewrapper, String s, Object obj)
	{
		return load(databasewrapper.rawQuery(s, ((String []) (null))), obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aconst_null     
	//    4    4:invokeinterface #72  <Method Cursor DatabaseWrapper.rawQuery(String, String[])>
	//    5    9:aload_3         
	//    6   10:invokevirtual   #51  <Method Object load(Cursor, Object)>
	//    7   13:areturn         
	}

	public Object load(String s)
	{
		return load(getDatabaseDefinition().getWritableDatabase(), s);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #76  <Method DatabaseDefinition getDatabaseDefinition()>
	//    3    5:invokevirtual   #82  <Method DatabaseWrapper DatabaseDefinition.getWritableDatabase()>
	//    4    8:aload_1         
	//    5    9:invokevirtual   #84  <Method Object load(DatabaseWrapper, String)>
	//    6   12:areturn         
	}

	public Object load(String s, Object obj)
	{
		return load(getDatabaseDefinition().getWritableDatabase(), s, obj);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #76  <Method DatabaseDefinition getDatabaseDefinition()>
	//    3    5:invokevirtual   #82  <Method DatabaseWrapper DatabaseDefinition.getWritableDatabase()>
	//    4    8:aload_1         
	//    5    9:aload_2         
	//    6   10:invokevirtual   #65  <Method Object load(DatabaseWrapper, String, Object)>
	//    7   13:areturn         
	}

	private DatabaseDefinition databaseDefinition;
	private InstanceAdapter instanceAdapter;
	private final Class modelClass;
}

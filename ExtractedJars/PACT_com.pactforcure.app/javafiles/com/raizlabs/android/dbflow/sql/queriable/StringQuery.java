// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.raizlabs.android.dbflow.sql.queriable;

import android.database.Cursor;
import com.raizlabs.android.dbflow.config.DatabaseDefinition;
import com.raizlabs.android.dbflow.config.FlowManager;
import com.raizlabs.android.dbflow.sql.Query;
import com.raizlabs.android.dbflow.sql.language.BaseModelQueriable;
import com.raizlabs.android.dbflow.structure.database.DatabaseWrapper;

// Referenced classes of package com.raizlabs.android.dbflow.sql.queriable:
//			ModelQueriable

public class StringQuery extends BaseModelQueriable
	implements Query, ModelQueriable
{

	public StringQuery(Class class1, String s)
	{
		super(class1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #18  <Method void BaseModelQueriable(Class)>
		query = s;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #20  <Field String query>
	//    6   10:return          
	}

	public String getQuery()
	{
		return query;
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field String query>
	//    2    4:areturn         
	}

	public Cursor query()
	{
		return query(FlowManager.getDatabaseForTable(getTable()).getWritableDatabase());
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #30  <Method Class getTable()>
	//    3    5:invokestatic    #36  <Method DatabaseDefinition FlowManager.getDatabaseForTable(Class)>
	//    4    8:invokevirtual   #42  <Method DatabaseWrapper DatabaseDefinition.getWritableDatabase()>
	//    5   11:invokevirtual   #45  <Method Cursor query(DatabaseWrapper)>
	//    6   14:areturn         
	}

	public Cursor query(DatabaseWrapper databasewrapper)
	{
		return databasewrapper.rawQuery(query, args);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #20  <Field String query>
	//    3    5:aload_0         
	//    4    6:getfield        #47  <Field String[] args>
	//    5    9:invokeinterface #53  <Method Cursor DatabaseWrapper.rawQuery(String, String[])>
	//    6   14:areturn         
	}

	public StringQuery setSelectionArgs(String as[])
	{
		args = as;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #47  <Field String[] args>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	private String args[];
	private final String query;
}

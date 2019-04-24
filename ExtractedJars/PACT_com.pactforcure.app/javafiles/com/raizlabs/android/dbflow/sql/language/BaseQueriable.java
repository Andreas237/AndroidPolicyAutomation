// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.raizlabs.android.dbflow.sql.language;

import android.database.Cursor;
import android.database.sqlite.SQLiteDoneException;
import com.raizlabs.android.dbflow.config.*;
import com.raizlabs.android.dbflow.sql.SqlUtils;
import com.raizlabs.android.dbflow.sql.queriable.Queriable;
import com.raizlabs.android.dbflow.structure.database.DatabaseStatement;
import com.raizlabs.android.dbflow.structure.database.DatabaseWrapper;

public abstract class BaseQueriable
	implements Queriable
{

	protected BaseQueriable(Class class1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
		table = class1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #17  <Field Class table>
	//    5    9:return          
	}

	public DatabaseStatement compileStatement()
	{
		return compileStatement(FlowManager.getDatabaseForTable(table).getWritableDatabase());
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #17  <Field Class table>
	//    3    5:invokestatic    #28  <Method DatabaseDefinition FlowManager.getDatabaseForTable(Class)>
	//    4    8:invokevirtual   #34  <Method DatabaseWrapper DatabaseDefinition.getWritableDatabase()>
	//    5   11:invokevirtual   #37  <Method DatabaseStatement compileStatement(DatabaseWrapper)>
	//    6   14:areturn         
	}

	public DatabaseStatement compileStatement(DatabaseWrapper databasewrapper)
	{
		String s = getQuery();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #41  <Method String getQuery()>
	//    2    4:astore_2        
		FlowLog.log(com.raizlabs.android.dbflow.config.FlowLog.Level.V, (new StringBuilder()).append("Compiling Query Into Statement: ").append(s).toString());
	//    3    5:getstatic       #47  <Field com.raizlabs.android.dbflow.config.FlowLog$Level com.raizlabs.android.dbflow.config.FlowLog$Level.V>
	//    4    8:new             #49  <Class StringBuilder>
	//    5   11:dup             
	//    6   12:invokespecial   #50  <Method void StringBuilder()>
	//    7   15:ldc1            #52  <String "Compiling Query Into Statement: ">
	//    8   17:invokevirtual   #56  <Method StringBuilder StringBuilder.append(String)>
	//    9   20:aload_2         
	//   10   21:invokevirtual   #56  <Method StringBuilder StringBuilder.append(String)>
	//   11   24:invokevirtual   #59  <Method String StringBuilder.toString()>
	//   12   27:invokestatic    #65  <Method void FlowLog.log(com.raizlabs.android.dbflow.config.FlowLog$Level, String)>
		return databasewrapper.compileStatement(s);
	//   13   30:aload_1         
	//   14   31:aload_2         
	//   15   32:invokeinterface #70  <Method DatabaseStatement DatabaseWrapper.compileStatement(String)>
	//   16   37:areturn         
	}

	public long count()
	{
		return count(FlowManager.getDatabaseForTable(getTable()).getWritableDatabase());
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #76  <Method Class getTable()>
	//    3    5:invokestatic    #28  <Method DatabaseDefinition FlowManager.getDatabaseForTable(Class)>
	//    4    8:invokevirtual   #34  <Method DatabaseWrapper DatabaseDefinition.getWritableDatabase()>
	//    5   11:invokevirtual   #79  <Method long count(DatabaseWrapper)>
	//    6   14:lreturn         
	}

	public long count(DatabaseWrapper databasewrapper)
	{
		long l;
		try
		{
			String s = getQuery();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #41  <Method String getQuery()>
	//    2    4:astore          4
			FlowLog.log(com.raizlabs.android.dbflow.config.FlowLog.Level.V, (new StringBuilder()).append("Executing query: ").append(s).toString());
	//    3    6:getstatic       #47  <Field com.raizlabs.android.dbflow.config.FlowLog$Level com.raizlabs.android.dbflow.config.FlowLog$Level.V>
	//    4    9:new             #49  <Class StringBuilder>
	//    5   12:dup             
	//    6   13:invokespecial   #50  <Method void StringBuilder()>
	//    7   16:ldc1            #83  <String "Executing query: ">
	//    8   18:invokevirtual   #56  <Method StringBuilder StringBuilder.append(String)>
	//    9   21:aload           4
	//   10   23:invokevirtual   #56  <Method StringBuilder StringBuilder.append(String)>
	//   11   26:invokevirtual   #59  <Method String StringBuilder.toString()>
	//   12   29:invokestatic    #65  <Method void FlowLog.log(com.raizlabs.android.dbflow.config.FlowLog$Level, String)>
			l = SqlUtils.longForQuery(databasewrapper, s);
	//   13   32:aload_1         
	//   14   33:aload           4
	//   15   35:invokestatic    #89  <Method long SqlUtils.longForQuery(DatabaseWrapper, String)>
	//   16   38:lstore_2        
		}
	//*  17   39:lload_2         
	//*  18   40:lreturn         
		// Misplaced declaration of an exception variable
		catch(DatabaseWrapper databasewrapper)
	//*  19   41:astore_1        
		{
			FlowLog.log(com.raizlabs.android.dbflow.config.FlowLog.Level.E, ((Throwable) (databasewrapper)));
	//   20   42:getstatic       #92  <Field com.raizlabs.android.dbflow.config.FlowLog$Level com.raizlabs.android.dbflow.config.FlowLog$Level.E>
	//   21   45:aload_1         
	//   22   46:invokestatic    #95  <Method void FlowLog.log(com.raizlabs.android.dbflow.config.FlowLog$Level, Throwable)>
			return 0L;
	//   23   49:lconst_0        
	//   24   50:lreturn         
		}
		return l;
	}

	public void execute()
	{
		Cursor cursor = query();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #100 <Method Cursor query()>
	//    2    4:astore_1        
		if(cursor != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          15
			cursor.close();
	//    5    9:aload_1         
	//    6   10:invokeinterface #105 <Method void Cursor.close()>
	//    7   15:return          
	}

	public void execute(DatabaseWrapper databasewrapper)
	{
		databasewrapper = ((DatabaseWrapper) (query(databasewrapper)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #109 <Method Cursor query(DatabaseWrapper)>
	//    3    5:astore_1        
		if(databasewrapper != null)
	//*   4    6:aload_1         
	//*   5    7:ifnull          16
			((Cursor) (databasewrapper)).close();
	//    6   10:aload_1         
	//    7   11:invokeinterface #105 <Method void Cursor.close()>
	//    8   16:return          
	}

	public Class getTable()
	{
		return table;
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field Class table>
	//    2    4:areturn         
	}

	public boolean hasData()
	{
		return count() > 0L;
	//    0    0:aload_0         
	//    1    1:invokevirtual   #114 <Method long count()>
	//    2    4:lconst_0        
	//    3    5:lcmp            
	//    4    6:ifle            11
	//    5    9:iconst_1        
	//    6   10:ireturn         
	//    7   11:iconst_0        
	//    8   12:ireturn         
	}

	public boolean hasData(DatabaseWrapper databasewrapper)
	{
		return count(databasewrapper) > 0L;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #79  <Method long count(DatabaseWrapper)>
	//    3    5:lconst_0        
	//    4    6:lcmp            
	//    5    7:ifle            12
	//    6   10:iconst_1        
	//    7   11:ireturn         
	//    8   12:iconst_0        
	//    9   13:ireturn         
	}

	public Cursor query()
	{
		query(FlowManager.getDatabaseForTable(table).getWritableDatabase());
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #17  <Field Class table>
	//    3    5:invokestatic    #28  <Method DatabaseDefinition FlowManager.getDatabaseForTable(Class)>
	//    4    8:invokevirtual   #34  <Method DatabaseWrapper DatabaseDefinition.getWritableDatabase()>
	//    5   11:invokevirtual   #109 <Method Cursor query(DatabaseWrapper)>
	//    6   14:pop             
		return null;
	//    7   15:aconst_null     
	//    8   16:areturn         
	}

	public Cursor query(DatabaseWrapper databasewrapper)
	{
		String s = getQuery();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #41  <Method String getQuery()>
	//    2    4:astore_2        
		FlowLog.log(com.raizlabs.android.dbflow.config.FlowLog.Level.V, (new StringBuilder()).append("Executing query: ").append(s).toString());
	//    3    5:getstatic       #47  <Field com.raizlabs.android.dbflow.config.FlowLog$Level com.raizlabs.android.dbflow.config.FlowLog$Level.V>
	//    4    8:new             #49  <Class StringBuilder>
	//    5   11:dup             
	//    6   12:invokespecial   #50  <Method void StringBuilder()>
	//    7   15:ldc1            #83  <String "Executing query: ">
	//    8   17:invokevirtual   #56  <Method StringBuilder StringBuilder.append(String)>
	//    9   20:aload_2         
	//   10   21:invokevirtual   #56  <Method StringBuilder StringBuilder.append(String)>
	//   11   24:invokevirtual   #59  <Method String StringBuilder.toString()>
	//   12   27:invokestatic    #65  <Method void FlowLog.log(com.raizlabs.android.dbflow.config.FlowLog$Level, String)>
		databasewrapper.execSQL(s);
	//   13   30:aload_1         
	//   14   31:aload_2         
	//   15   32:invokeinterface #119 <Method void DatabaseWrapper.execSQL(String)>
		return null;
	//   16   37:aconst_null     
	//   17   38:areturn         
	}

	public String toString()
	{
		return getQuery();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #41  <Method String getQuery()>
	//    2    4:areturn         
	}

	private final Class table;
}

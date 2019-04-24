// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.stetho.inspector.protocol.module;

import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import java.util.Arrays;

// Referenced classes of package com.facebook.stetho.inspector.protocol.module:
//			Database

class Database$1
	implements com.facebook.stetho.inspector.database.rManager.ExecuteResultHandler
{

	public ecuteSQLResponse handleResult(Cursor cursor)
		throws SQLiteException
	{
		ecuteSQLResponse ecutesqlresponse = new ecuteSQLResponse(((Database$1) (null)));
	//    0    0:new             #28  <Class Database$ExecuteSQLResponse>
	//    1    3:dup             
	//    2    4:aconst_null     
	//    3    5:invokespecial   #31  <Method void Database$ExecuteSQLResponse(Database$1)>
	//    4    8:astore_2        
		ecutesqlresponse.columnNames = Arrays.asList(((Object []) (cursor.getColumnNames())));
	//    5    9:aload_2         
	//    6   10:aload_1         
	//    7   11:invokeinterface #37  <Method String[] Cursor.getColumnNames()>
	//    8   16:invokestatic    #43  <Method java.util.List Arrays.asList(Object[])>
	//    9   19:putfield        #47  <Field java.util.List Database$ExecuteSQLResponse.columnNames>
		ecutesqlresponse.values = Database.access$200(Database.this, cursor, 250);
	//   10   22:aload_2         
	//   11   23:aload_0         
	//   12   24:getfield        #18  <Field Database this$0>
	//   13   27:aload_1         
	//   14   28:sipush          250
	//   15   31:invokestatic    #51  <Method java.util.List Database.access$200(Database, Cursor, int)>
	//   16   34:putfield        #54  <Field java.util.List Database$ExecuteSQLResponse.values>
		return ecutesqlresponse;
	//   17   37:aload_2         
	//   18   38:areturn         
	}

	public volatile Object handleResult(Cursor cursor)
		throws SQLiteException
	{
		return ((Object) (handleResult(cursor)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #58  <Method Database$ExecuteSQLResponse handleResult(Cursor)>
	//    3    5:areturn         
	}

	final Database this$0;

	Database$1()
	{
		this$0 = Database.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #18  <Field Database this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #21  <Method void Object()>
	//    5    9:return          
	}
}

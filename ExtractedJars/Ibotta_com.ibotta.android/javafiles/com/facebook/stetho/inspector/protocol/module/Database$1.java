// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.stetho.inspector.protocol.module;

import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import java.util.Arrays;
import java.util.Collections;

// Referenced classes of package com.facebook.stetho.inspector.protocol.module:
//			Database

class Database$1
	implements tabaseDriver.ExecuteResultHandler
{

	public ecuteSQLResponse handleInsert(long l)
		throws SQLiteException
	{
		ecuteSQLResponse ecutesqlresponse = new ecuteSQLResponse();
	//    0    0:new             #28  <Class Database$ExecuteSQLResponse>
	//    1    3:dup             
	//    2    4:invokespecial   #29  <Method void Database$ExecuteSQLResponse()>
	//    3    7:astore_3        
		ecutesqlresponse.columnNames = Collections.singletonList("ID of last inserted row");
	//    4    8:aload_3         
	//    5    9:ldc1            #31  <String "ID of last inserted row">
	//    6   11:invokestatic    #37  <Method java.util.List Collections.singletonList(Object)>
	//    7   14:putfield        #41  <Field java.util.List Database$ExecuteSQLResponse.columnNames>
		ecutesqlresponse.values = Collections.singletonList(((Object) (String.valueOf(l))));
	//    8   17:aload_3         
	//    9   18:lload_1         
	//   10   19:invokestatic    #47  <Method String String.valueOf(long)>
	//   11   22:invokestatic    #37  <Method java.util.List Collections.singletonList(Object)>
	//   12   25:putfield        #50  <Field java.util.List Database$ExecuteSQLResponse.values>
		return ecutesqlresponse;
	//   13   28:aload_3         
	//   14   29:areturn         
	}

	public volatile Object handleInsert(long l)
		throws SQLiteException
	{
		return ((Object) (handleInsert(l)));
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:invokevirtual   #54  <Method Database$ExecuteSQLResponse handleInsert(long)>
	//    3    5:areturn         
	}

	public ecuteSQLResponse handleRawQuery()
		throws SQLiteException
	{
		ecuteSQLResponse ecutesqlresponse = new ecuteSQLResponse();
	//    0    0:new             #28  <Class Database$ExecuteSQLResponse>
	//    1    3:dup             
	//    2    4:invokespecial   #29  <Method void Database$ExecuteSQLResponse()>
	//    3    7:astore_1        
		ecutesqlresponse.columnNames = Collections.singletonList("success");
	//    4    8:aload_1         
	//    5    9:ldc1            #58  <String "success">
	//    6   11:invokestatic    #37  <Method java.util.List Collections.singletonList(Object)>
	//    7   14:putfield        #41  <Field java.util.List Database$ExecuteSQLResponse.columnNames>
		ecutesqlresponse.values = Collections.singletonList("true");
	//    8   17:aload_1         
	//    9   18:ldc1            #60  <String "true">
	//   10   20:invokestatic    #37  <Method java.util.List Collections.singletonList(Object)>
	//   11   23:putfield        #50  <Field java.util.List Database$ExecuteSQLResponse.values>
		return ecutesqlresponse;
	//   12   26:aload_1         
	//   13   27:areturn         
	}

	public volatile Object handleRawQuery()
		throws SQLiteException
	{
		return ((Object) (handleRawQuery()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #63  <Method Database$ExecuteSQLResponse handleRawQuery()>
	//    2    4:areturn         
	}

	public ecuteSQLResponse handleSelect(Cursor cursor)
		throws SQLiteException
	{
		ecuteSQLResponse ecutesqlresponse = new ecuteSQLResponse();
	//    0    0:new             #28  <Class Database$ExecuteSQLResponse>
	//    1    3:dup             
	//    2    4:invokespecial   #29  <Method void Database$ExecuteSQLResponse()>
	//    3    7:astore_2        
		ecutesqlresponse.columnNames = Arrays.asList(((Object []) (cursor.getColumnNames())));
	//    4    8:aload_2         
	//    5    9:aload_1         
	//    6   10:invokeinterface #71  <Method String[] Cursor.getColumnNames()>
	//    7   15:invokestatic    #77  <Method java.util.List Arrays.asList(Object[])>
	//    8   18:putfield        #41  <Field java.util.List Database$ExecuteSQLResponse.columnNames>
		ecutesqlresponse.values = ((java.util.List) (Database.access$200(cursor, 250)));
	//    9   21:aload_2         
	//   10   22:aload_1         
	//   11   23:sipush          250
	//   12   26:invokestatic    #81  <Method java.util.ArrayList Database.access$200(Cursor, int)>
	//   13   29:putfield        #50  <Field java.util.List Database$ExecuteSQLResponse.values>
		return ecutesqlresponse;
	//   14   32:aload_2         
	//   15   33:areturn         
	}

	public volatile Object handleSelect(Cursor cursor)
		throws SQLiteException
	{
		return ((Object) (handleSelect(cursor)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #84  <Method Database$ExecuteSQLResponse handleSelect(Cursor)>
	//    3    5:areturn         
	}

	public ecuteSQLResponse handleUpdateDelete(int i)
		throws SQLiteException
	{
		ecuteSQLResponse ecutesqlresponse = new ecuteSQLResponse();
	//    0    0:new             #28  <Class Database$ExecuteSQLResponse>
	//    1    3:dup             
	//    2    4:invokespecial   #29  <Method void Database$ExecuteSQLResponse()>
	//    3    7:astore_2        
		ecutesqlresponse.columnNames = Collections.singletonList("Modified rows");
	//    4    8:aload_2         
	//    5    9:ldc1            #88  <String "Modified rows">
	//    6   11:invokestatic    #37  <Method java.util.List Collections.singletonList(Object)>
	//    7   14:putfield        #41  <Field java.util.List Database$ExecuteSQLResponse.columnNames>
		ecutesqlresponse.values = Collections.singletonList(((Object) (String.valueOf(i))));
	//    8   17:aload_2         
	//    9   18:iload_1         
	//   10   19:invokestatic    #91  <Method String String.valueOf(int)>
	//   11   22:invokestatic    #37  <Method java.util.List Collections.singletonList(Object)>
	//   12   25:putfield        #50  <Field java.util.List Database$ExecuteSQLResponse.values>
		return ecutesqlresponse;
	//   13   28:aload_2         
	//   14   29:areturn         
	}

	public volatile Object handleUpdateDelete(int i)
		throws SQLiteException
	{
		return ((Object) (handleUpdateDelete(i)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #94  <Method Database$ExecuteSQLResponse handleUpdateDelete(int)>
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

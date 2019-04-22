// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.stetho.inspector.database;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import java.util.*;

// Referenced classes of package com.facebook.stetho.inspector.database:
//			ContentProviderSchema

public class ContentProviderDatabaseDriver extends com.facebook.stetho.inspector.protocol.module.Database.DatabaseDriver
{

	public transient ContentProviderDatabaseDriver(Context context, ContentProviderSchema acontentproviderschema[])
	{
		super(context);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #20  <Method void com.facebook.stetho.inspector.protocol.module.Database$DatabaseDriver(Context)>
		mContentProviderSchemas = acontentproviderschema;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #22  <Field ContentProviderSchema[] mContentProviderSchemas>
	//    6   10:return          
	}

	private String fetchTableName(String s)
	{
		for(Iterator iterator = mTableNames.iterator(); iterator.hasNext();)
	//*   0    0:aload_0         
	//*   1    1:getfield        #27  <Field List mTableNames>
	//*   2    4:invokeinterface #33  <Method Iterator List.iterator()>
	//*   3    9:astore_2        
	//*   4   10:aload_2         
	//*   5   11:invokeinterface #39  <Method boolean Iterator.hasNext()>
	//*   6   16:ifeq            39
		{
			String s1 = (String)iterator.next();
	//    7   19:aload_2         
	//    8   20:invokeinterface #43  <Method Object Iterator.next()>
	//    9   25:checkcast       #45  <Class String>
	//   10   28:astore_3        
			if(s.contains(((CharSequence) (s1))))
	//*  11   29:aload_1         
	//*  12   30:aload_3         
	//*  13   31:invokevirtual   #49  <Method boolean String.contains(CharSequence)>
	//*  14   34:ifeq            10
				return s1;
	//   15   37:aload_3         
	//   16   38:areturn         
		}

		return "";
	//   17   39:ldc1            #51  <String "">
	//   18   41:areturn         
	}

	public com.facebook.stetho.inspector.protocol.module.Database.ExecuteSQLResponse executeSQL(String s, String s1, com.facebook.stetho.inspector.protocol.module.Database.DatabaseDriver.ExecuteResultHandler executeresulthandler)
		throws SQLiteException
	{
		s = fetchTableName(s1);
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:invokespecial   #57  <Method String fetchTableName(String)>
	//    3    5:astore_1        
		int i = mTableNames.indexOf(((Object) (s)));
	//    4    6:aload_0         
	//    5    7:getfield        #27  <Field List mTableNames>
	//    6   10:aload_1         
	//    7   11:invokeinterface #61  <Method int List.indexOf(Object)>
	//    8   16:istore          4
		s = ((String) (mContentProviderSchemas[i]));
	//    9   18:aload_0         
	//   10   19:getfield        #22  <Field ContentProviderSchema[] mContentProviderSchemas>
	//   11   22:iload           4
	//   12   24:aaload          
	//   13   25:astore_1        
		s = ((String) (mContext.getContentResolver().query(((ContentProviderSchema) (s)).getUri(), ((ContentProviderSchema) (s)).getProjection(), ((String) (null)), ((String []) (null)), ((String) (null)))));
	//   14   26:aload_0         
	//   15   27:getfield        #65  <Field Context mContext>
	//   16   30:invokevirtual   #71  <Method ContentResolver Context.getContentResolver()>
	//   17   33:aload_1         
	//   18   34:invokevirtual   #77  <Method android.net.Uri ContentProviderSchema.getUri()>
	//   19   37:aload_1         
	//   20   38:invokevirtual   #81  <Method String[] ContentProviderSchema.getProjection()>
	//   21   41:aconst_null     
	//   22   42:aconst_null     
	//   23   43:aconst_null     
	//   24   44:invokevirtual   #87  <Method Cursor ContentResolver.query(android.net.Uri, String[], String, String[], String)>
	//   25   47:astore_1        
		s1 = ((String) ((com.facebook.stetho.inspector.protocol.module.Database.ExecuteSQLResponse)executeresulthandler.handleSelect(((Cursor) (s)))));
	//   26   48:aload_3         
	//   27   49:aload_1         
	//   28   50:invokeinterface #93  <Method Object com.facebook.stetho.inspector.protocol.module.Database$DatabaseDriver$ExecuteResultHandler.handleSelect(Cursor)>
	//   29   55:checkcast       #95  <Class com.facebook.stetho.inspector.protocol.module.Database$ExecuteSQLResponse>
	//   30   58:astore_2        
		((Cursor) (s)).close();
	//   31   59:aload_1         
	//   32   60:invokeinterface #101 <Method void Cursor.close()>
		return ((com.facebook.stetho.inspector.protocol.module.Database.ExecuteSQLResponse) (s1));
	//   33   65:aload_2         
	//   34   66:areturn         
		s1;
	//   35   67:astore_2        
		((Cursor) (s)).close();
	//   36   68:aload_1         
	//   37   69:invokeinterface #101 <Method void Cursor.close()>
		throw s1;
	//   38   74:aload_2         
	//   39   75:athrow          
	}

	public List getDatabaseNames()
	{
		if(mDatabaseNames == null && mContentProviderSchemas != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #108 <Field List mDatabaseNames>
	//*   2    4:ifnonnull       37
	//*   3    7:aload_0         
	//*   4    8:getfield        #22  <Field ContentProviderSchema[] mContentProviderSchemas>
	//*   5   11:ifnull          37
		{
			mDatabaseNames = ((List) (new ArrayList()));
	//    6   14:aload_0         
	//    7   15:new             #110 <Class ArrayList>
	//    8   18:dup             
	//    9   19:invokespecial   #112 <Method void ArrayList()>
	//   10   22:putfield        #108 <Field List mDatabaseNames>
			mDatabaseNames.add("content-providers");
	//   11   25:aload_0         
	//   12   26:getfield        #108 <Field List mDatabaseNames>
	//   13   29:ldc1            #9   <String "content-providers">
	//   14   31:invokeinterface #116 <Method boolean List.add(Object)>
	//   15   36:pop             
		}
		return mDatabaseNames;
	//   16   37:aload_0         
	//   17   38:getfield        #108 <Field List mDatabaseNames>
	//   18   41:areturn         
	}

	public List getTableNames(String s)
	{
		if(mTableNames == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #27  <Field List mTableNames>
	//*   2    4:ifnonnull       60
		{
			mTableNames = ((List) (new ArrayList()));
	//    3    7:aload_0         
	//    4    8:new             #110 <Class ArrayList>
	//    5   11:dup             
	//    6   12:invokespecial   #112 <Method void ArrayList()>
	//    7   15:putfield        #27  <Field List mTableNames>
			s = ((String) (mContentProviderSchemas));
	//    8   18:aload_0         
	//    9   19:getfield        #22  <Field ContentProviderSchema[] mContentProviderSchemas>
	//   10   22:astore_1        
			int j = s.length;
	//   11   23:aload_1         
	//   12   24:arraylength     
	//   13   25:istore_3        
			for(int i = 0; i < j; i++)
	//*  14   26:iconst_0        
	//*  15   27:istore_2        
	//*  16   28:iload_2         
	//*  17   29:iload_3         
	//*  18   30:icmpge          60
			{
				ContentProviderSchema contentproviderschema = ((ContentProviderSchema) (s[i]));
	//   19   33:aload_1         
	//   20   34:iload_2         
	//   21   35:aaload          
	//   22   36:astore          4
				mTableNames.add(((Object) (contentproviderschema.getTableName())));
	//   23   38:aload_0         
	//   24   39:getfield        #27  <Field List mTableNames>
	//   25   42:aload           4
	//   26   44:invokevirtual   #123 <Method String ContentProviderSchema.getTableName()>
	//   27   47:invokeinterface #116 <Method boolean List.add(Object)>
	//   28   52:pop             
			}

	//   29   53:iload_2         
	//   30   54:iconst_1        
	//   31   55:iadd            
	//   32   56:istore_2        
		}
	//*  33   57:goto            28
		return mTableNames;
	//   34   60:aload_0         
	//   35   61:getfield        #27  <Field List mTableNames>
	//   36   64:areturn         
	}

	private static final String sDatabaseName = "content-providers";
	private final ContentProviderSchema mContentProviderSchemas[];
	private List mDatabaseNames;
	private List mTableNames;
}

// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.raizlabs.android.dbflow.sql;

import android.content.*;
import android.net.Uri;
import com.raizlabs.android.dbflow.StringUtils;
import com.raizlabs.android.dbflow.config.DatabaseDefinition;
import com.raizlabs.android.dbflow.config.FlowManager;
import com.raizlabs.android.dbflow.runtime.FlowContentObserver;
import com.raizlabs.android.dbflow.sql.language.Condition;
import com.raizlabs.android.dbflow.sql.language.ConditionGroup;
import com.raizlabs.android.dbflow.sql.language.SQLCondition;
import com.raizlabs.android.dbflow.structure.ModelAdapter;
import com.raizlabs.android.dbflow.structure.database.DatabaseStatement;
import com.raizlabs.android.dbflow.structure.database.DatabaseWrapper;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.raizlabs.android.dbflow.sql:
//			QueryBuilder

public class SqlUtils
{

	public SqlUtils()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #22  <Method void Object()>
	//    2    4:return          
	}

	public static void addContentValues(ContentValues contentvalues, ConditionGroup conditiongroup)
	{
		String s;
		for(Iterator iterator = contentvalues.valueSet().iterator(); iterator.hasNext(); conditiongroup.and(((SQLCondition) (Condition.column((new com.raizlabs.android.dbflow.sql.language.NameAlias.Builder(s)).build()).is(contentvalues.get(s))))))
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #31  <Method Set ContentValues.valueSet()>
	//*   2    4:invokeinterface #37  <Method Iterator Set.iterator()>
	//*   3    9:astore_2        
	//*   4   10:aload_2         
	//*   5   11:invokeinterface #43  <Method boolean Iterator.hasNext()>
	//*   6   16:ifeq            67
			s = (String)((java.util.Map.Entry)iterator.next()).getKey();
	//    7   19:aload_2         
	//    8   20:invokeinterface #47  <Method Object Iterator.next()>
	//    9   25:checkcast       #49  <Class java.util.Map$Entry>
	//   10   28:invokeinterface #52  <Method Object java.util.Map$Entry.getKey()>
	//   11   33:checkcast       #12  <Class String>
	//   12   36:astore_3        

	//   13   37:aload_1         
	//   14   38:new             #54  <Class com.raizlabs.android.dbflow.sql.language.NameAlias$Builder>
	//   15   41:dup             
	//   16   42:aload_3         
	//   17   43:invokespecial   #57  <Method void com.raizlabs.android.dbflow.sql.language.NameAlias$Builder(String)>
	//   18   46:invokevirtual   #61  <Method com.raizlabs.android.dbflow.sql.language.NameAlias com.raizlabs.android.dbflow.sql.language.NameAlias$Builder.build()>
	//   19   49:invokestatic    #67  <Method Condition Condition.column(com.raizlabs.android.dbflow.sql.language.NameAlias)>
	//   20   52:aload_0         
	//   21   53:aload_3         
	//   22   54:invokevirtual   #71  <Method Object ContentValues.get(String)>
	//   23   57:invokevirtual   #75  <Method Condition Condition.is(Object)>
	//   24   60:invokevirtual   #81  <Method ConditionGroup ConditionGroup.and(SQLCondition)>
	//   25   63:pop             
	//*  26   64:goto            10
	//   27   67:return          
	}

	public static String byteArrayToHexString(byte abyte0[])
	{
		char ac[] = new char[abyte0.length * 2];
	//    0    0:aload_0         
	//    1    1:arraylength     
	//    2    2:iconst_2        
	//    3    3:imul            
	//    4    4:newarray        char[]
	//    5    6:astore_3        
		for(int i = 0; i < abyte0.length; i++)
	//*   6    7:iconst_0        
	//*   7    8:istore_1        
	//*   8    9:iload_1         
	//*   9   10:aload_0         
	//*  10   11:arraylength     
	//*  11   12:icmpge          57
		{
			int j = abyte0[i] & 0xff;
	//   12   15:aload_0         
	//   13   16:iload_1         
	//   14   17:baload          
	//   15   18:sipush          255
	//   16   21:iand            
	//   17   22:istore_2        
			ac[i * 2] = hexArray[j >>> 4];
	//   18   23:aload_3         
	//   19   24:iload_1         
	//   20   25:iconst_2        
	//   21   26:imul            
	//   22   27:getstatic       #18  <Field char[] hexArray>
	//   23   30:iload_2         
	//   24   31:iconst_4        
	//   25   32:iushr           
	//   26   33:caload          
	//   27   34:castore         
			ac[i * 2 + 1] = hexArray[j & 0xf];
	//   28   35:aload_3         
	//   29   36:iload_1         
	//   30   37:iconst_2        
	//   31   38:imul            
	//   32   39:iconst_1        
	//   33   40:iadd            
	//   34   41:getstatic       #18  <Field char[] hexArray>
	//   35   44:iload_2         
	//   36   45:bipush          15
	//   37   47:iand            
	//   38   48:caload          
	//   39   49:castore         
		}

	//   40   50:iload_1         
	//   41   51:iconst_1        
	//   42   52:iadd            
	//   43   53:istore_1        
	//*  44   54:goto            9
		return new String(ac);
	//   45   57:new             #12  <Class String>
	//   46   60:dup             
	//   47   61:aload_3         
	//   48   62:invokespecial   #87  <Method void String(char[])>
	//   49   65:areturn         
	}

	public static void dropIndex(DatabaseWrapper databasewrapper, String s)
	{
		databasewrapper.execSQL((new QueryBuilder("DROP INDEX IF EXISTS ")).append(((Object) (QueryBuilder.quoteIfNeeded(s)))).getQuery());
	//    0    0:aload_0         
	//    1    1:new             #91  <Class QueryBuilder>
	//    2    4:dup             
	//    3    5:ldc1            #93  <String "DROP INDEX IF EXISTS ">
	//    4    7:invokespecial   #96  <Method void QueryBuilder(Object)>
	//    5   10:aload_1         
	//    6   11:invokestatic    #100 <Method String QueryBuilder.quoteIfNeeded(String)>
	//    7   14:invokevirtual   #104 <Method QueryBuilder QueryBuilder.append(Object)>
	//    8   17:invokevirtual   #108 <Method String QueryBuilder.getQuery()>
	//    9   20:invokeinterface #113 <Method void DatabaseWrapper.execSQL(String)>
	//   10   25:return          
	}

	public static void dropIndex(Class class1, String s)
	{
		dropIndex(FlowManager.getDatabaseForTable(class1).getWritableDatabase(), s);
	//    0    0:aload_0         
	//    1    1:invokestatic    #120 <Method DatabaseDefinition FlowManager.getDatabaseForTable(Class)>
	//    2    4:invokevirtual   #126 <Method DatabaseWrapper DatabaseDefinition.getWritableDatabase()>
	//    3    7:aload_1         
	//    4    8:invokestatic    #128 <Method void dropIndex(DatabaseWrapper, String)>
	//    5   11:return          
	}

	public static void dropTrigger(Class class1, String s)
	{
		s = ((String) ((new QueryBuilder("DROP TRIGGER IF EXISTS ")).append(((Object) (s)))));
	//    0    0:new             #91  <Class QueryBuilder>
	//    1    3:dup             
	//    2    4:ldc1            #133 <String "DROP TRIGGER IF EXISTS ">
	//    3    6:invokespecial   #96  <Method void QueryBuilder(Object)>
	//    4    9:aload_1         
	//    5   10:invokevirtual   #104 <Method QueryBuilder QueryBuilder.append(Object)>
	//    6   13:astore_1        
		FlowManager.getDatabaseForTable(class1).getWritableDatabase().execSQL(((QueryBuilder) (s)).getQuery());
	//    7   14:aload_0         
	//    8   15:invokestatic    #120 <Method DatabaseDefinition FlowManager.getDatabaseForTable(Class)>
	//    9   18:invokevirtual   #126 <Method DatabaseWrapper DatabaseDefinition.getWritableDatabase()>
	//   10   21:aload_1         
	//   11   22:invokevirtual   #108 <Method String QueryBuilder.getQuery()>
	//   12   25:invokeinterface #113 <Method void DatabaseWrapper.execSQL(String)>
	//   13   30:return          
	}

	public static String getContentValuesKey(ContentValues contentvalues, String s)
	{
		String s1 = QueryBuilder.quoteIfNeeded(s);
	//    0    0:aload_1         
	//    1    1:invokestatic    #100 <Method String QueryBuilder.quoteIfNeeded(String)>
	//    2    4:astore_2        
		if(contentvalues.containsKey(s1))
	//*   3    5:aload_0         
	//*   4    6:aload_2         
	//*   5    7:invokevirtual   #139 <Method boolean ContentValues.containsKey(String)>
	//*   6   10:ifeq            15
			return s1;
	//    7   13:aload_2         
	//    8   14:areturn         
		s = QueryBuilder.stripQuotes(s);
	//    9   15:aload_1         
	//   10   16:invokestatic    #142 <Method String QueryBuilder.stripQuotes(String)>
	//   11   19:astore_1        
		if(contentvalues.containsKey(s))
	//*  12   20:aload_0         
	//*  13   21:aload_1         
	//*  14   22:invokevirtual   #139 <Method boolean ContentValues.containsKey(String)>
	//*  15   25:ifeq            30
			return s;
	//   16   28:aload_1         
	//   17   29:areturn         
		else
			throw new IllegalArgumentException("Could not find the specified key in the Content Values object.");
	//   18   30:new             #144 <Class IllegalArgumentException>
	//   19   33:dup             
	//   20   34:ldc1            #146 <String "Could not find the specified key in the Content Values object.">
	//   21   36:invokespecial   #147 <Method void IllegalArgumentException(String)>
	//   22   39:athrow          
	}

	public static Uri getNotificationUri(Class class1, com.raizlabs.android.dbflow.structure.BaseModel.Action action)
	{
		return getNotificationUri(class1, action, ((String) (null)), ((Object) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:aconst_null     
	//    4    4:invokestatic    #152 <Method Uri getNotificationUri(Class, com.raizlabs.android.dbflow.structure.BaseModel$Action, String, Object)>
	//    5    7:areturn         
	}

	public static Uri getNotificationUri(Class class1, com.raizlabs.android.dbflow.structure.BaseModel.Action action, Iterable iterable)
	{
		class1 = ((Class) ((new android.net.Uri.Builder()).scheme("dbflow").authority(FlowManager.getTableName(class1))));
	//    0    0:new             #156 <Class android.net.Uri$Builder>
	//    1    3:dup             
	//    2    4:invokespecial   #157 <Method void android.net.Uri$Builder()>
	//    3    7:ldc1            #159 <String "dbflow">
	//    4    9:invokevirtual   #163 <Method android.net.Uri$Builder android.net.Uri$Builder.scheme(String)>
	//    5   12:aload_0         
	//    6   13:invokestatic    #167 <Method String FlowManager.getTableName(Class)>
	//    7   16:invokevirtual   #170 <Method android.net.Uri$Builder android.net.Uri$Builder.authority(String)>
	//    8   19:astore_0        
		if(action != null)
	//*   9   20:aload_1         
	//*  10   21:ifnull          33
			((android.net.Uri.Builder) (class1)).fragment(action.name());
	//   11   24:aload_0         
	//   12   25:aload_1         
	//   13   26:invokevirtual   #175 <Method String com.raizlabs.android.dbflow.structure.BaseModel$Action.name()>
	//   14   29:invokevirtual   #178 <Method android.net.Uri$Builder android.net.Uri$Builder.fragment(String)>
	//   15   32:pop             
		if(iterable != null)
	//*  16   33:aload_2         
	//*  17   34:ifnull          92
			for(action = ((com.raizlabs.android.dbflow.structure.BaseModel.Action) (iterable.iterator())); ((Iterator) (action)).hasNext(); ((android.net.Uri.Builder) (class1)).appendQueryParameter(Uri.encode(((SQLCondition) (iterable)).columnName()), Uri.encode(String.valueOf(((SQLCondition) (iterable)).value()))))
	//*  18   37:aload_2         
	//*  19   38:invokeinterface #181 <Method Iterator Iterable.iterator()>
	//*  20   43:astore_1        
	//*  21   44:aload_1         
	//*  22   45:invokeinterface #43  <Method boolean Iterator.hasNext()>
	//*  23   50:ifeq            92
				iterable = ((Iterable) ((SQLCondition)((Iterator) (action)).next()));
	//   24   53:aload_1         
	//   25   54:invokeinterface #47  <Method Object Iterator.next()>
	//   26   59:checkcast       #183 <Class SQLCondition>
	//   27   62:astore_2        

	//   28   63:aload_0         
	//   29   64:aload_2         
	//   30   65:invokeinterface #186 <Method String SQLCondition.columnName()>
	//   31   70:invokestatic    #191 <Method String Uri.encode(String)>
	//   32   73:aload_2         
	//   33   74:invokeinterface #194 <Method Object SQLCondition.value()>
	//   34   79:invokestatic    #198 <Method String String.valueOf(Object)>
	//   35   82:invokestatic    #191 <Method String Uri.encode(String)>
	//   36   85:invokevirtual   #202 <Method android.net.Uri$Builder android.net.Uri$Builder.appendQueryParameter(String, String)>
	//   37   88:pop             
	//*  38   89:goto            44
		return ((android.net.Uri.Builder) (class1)).build();
	//   39   92:aload_0         
	//   40   93:invokevirtual   #205 <Method Uri android.net.Uri$Builder.build()>
	//   41   96:areturn         
	}

	public static Uri getNotificationUri(Class class1, com.raizlabs.android.dbflow.structure.BaseModel.Action action, String s, Object obj)
	{
		Condition condition = null;
	//    0    0:aconst_null     
	//    1    1:astore          4
		if(StringUtils.isNotNullOrEmpty(s))
	//*   2    3:aload_2         
	//*   3    4:invokestatic    #211 <Method boolean StringUtils.isNotNullOrEmpty(String)>
	//*   4    7:ifeq            30
			condition = Condition.column((new com.raizlabs.android.dbflow.sql.language.NameAlias.Builder(s)).build()).value(obj);
	//    5   10:new             #54  <Class com.raizlabs.android.dbflow.sql.language.NameAlias$Builder>
	//    6   13:dup             
	//    7   14:aload_2         
	//    8   15:invokespecial   #57  <Method void com.raizlabs.android.dbflow.sql.language.NameAlias$Builder(String)>
	//    9   18:invokevirtual   #61  <Method com.raizlabs.android.dbflow.sql.language.NameAlias com.raizlabs.android.dbflow.sql.language.NameAlias$Builder.build()>
	//   10   21:invokestatic    #67  <Method Condition Condition.column(com.raizlabs.android.dbflow.sql.language.NameAlias)>
	//   11   24:aload_3         
	//   12   25:invokevirtual   #213 <Method Condition Condition.value(Object)>
	//   13   28:astore          4
		return getNotificationUri(class1, action, new SQLCondition[] {
			condition
		});
	//   14   30:aload_0         
	//   15   31:aload_1         
	//   16   32:iconst_1        
	//   17   33:anewarray       SQLCondition[]
	//   18   36:dup             
	//   19   37:iconst_0        
	//   20   38:aload           4
	//   21   40:aastore         
	//   22   41:invokestatic    #216 <Method Uri getNotificationUri(Class, com.raizlabs.android.dbflow.structure.BaseModel$Action, SQLCondition[])>
	//   23   44:areturn         
	}

	public static Uri getNotificationUri(Class class1, com.raizlabs.android.dbflow.structure.BaseModel.Action action, SQLCondition asqlcondition[])
	{
		class1 = ((Class) ((new android.net.Uri.Builder()).scheme("dbflow").authority(FlowManager.getTableName(class1))));
	//    0    0:new             #156 <Class android.net.Uri$Builder>
	//    1    3:dup             
	//    2    4:invokespecial   #157 <Method void android.net.Uri$Builder()>
	//    3    7:ldc1            #159 <String "dbflow">
	//    4    9:invokevirtual   #163 <Method android.net.Uri$Builder android.net.Uri$Builder.scheme(String)>
	//    5   12:aload_0         
	//    6   13:invokestatic    #167 <Method String FlowManager.getTableName(Class)>
	//    7   16:invokevirtual   #170 <Method android.net.Uri$Builder android.net.Uri$Builder.authority(String)>
	//    8   19:astore_0        
		if(action != null)
	//*   9   20:aload_1         
	//*  10   21:ifnull          33
			((android.net.Uri.Builder) (class1)).fragment(action.name());
	//   11   24:aload_0         
	//   12   25:aload_1         
	//   13   26:invokevirtual   #175 <Method String com.raizlabs.android.dbflow.structure.BaseModel$Action.name()>
	//   14   29:invokevirtual   #178 <Method android.net.Uri$Builder android.net.Uri$Builder.fragment(String)>
	//   15   32:pop             
		if(asqlcondition != null && asqlcondition.length > 0)
	//*  16   33:aload_2         
	//*  17   34:ifnull          95
	//*  18   37:aload_2         
	//*  19   38:arraylength     
	//*  20   39:ifle            95
		{
			int j = asqlcondition.length;
	//   21   42:aload_2         
	//   22   43:arraylength     
	//   23   44:istore          4
			for(int i = 0; i < j; i++)
	//*  24   46:iconst_0        
	//*  25   47:istore_3        
	//*  26   48:iload_3         
	//*  27   49:iload           4
	//*  28   51:icmpge          95
			{
				action = ((com.raizlabs.android.dbflow.structure.BaseModel.Action) (asqlcondition[i]));
	//   29   54:aload_2         
	//   30   55:iload_3         
	//   31   56:aaload          
	//   32   57:astore_1        
				if(action != null)
	//*  33   58:aload_1         
	//*  34   59:ifnull          88
					((android.net.Uri.Builder) (class1)).appendQueryParameter(Uri.encode(((SQLCondition) (action)).columnName()), Uri.encode(String.valueOf(((SQLCondition) (action)).value())));
	//   35   62:aload_0         
	//   36   63:aload_1         
	//   37   64:invokeinterface #186 <Method String SQLCondition.columnName()>
	//   38   69:invokestatic    #191 <Method String Uri.encode(String)>
	//   39   72:aload_1         
	//   40   73:invokeinterface #194 <Method Object SQLCondition.value()>
	//   41   78:invokestatic    #198 <Method String String.valueOf(Object)>
	//   42   81:invokestatic    #191 <Method String Uri.encode(String)>
	//   43   84:invokevirtual   #202 <Method android.net.Uri$Builder android.net.Uri$Builder.appendQueryParameter(String, String)>
	//   44   87:pop             
			}

	//   45   88:iload_3         
	//   46   89:iconst_1        
	//   47   90:iadd            
	//   48   91:istore_3        
		}
	//*  49   92:goto            48
		return ((android.net.Uri.Builder) (class1)).build();
	//   50   95:aload_0         
	//   51   96:invokevirtual   #205 <Method Uri android.net.Uri$Builder.build()>
	//   52   99:areturn         
	}

	public static long longForQuery(DatabaseWrapper databasewrapper, String s)
	{
		databasewrapper = ((DatabaseWrapper) (databasewrapper.compileStatement(s)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokeinterface #224 <Method DatabaseStatement DatabaseWrapper.compileStatement(String)>
	//    3    7:astore_0        
		long l = ((DatabaseStatement) (databasewrapper)).simpleQueryForLong();
	//    4    8:aload_0         
	//    5    9:invokeinterface #230 <Method long DatabaseStatement.simpleQueryForLong()>
	//    6   14:lstore_2        
		((DatabaseStatement) (databasewrapper)).close();
	//    7   15:aload_0         
	//    8   16:invokeinterface #233 <Method void DatabaseStatement.close()>
		return l;
	//    9   21:lload_2         
	//   10   22:lreturn         
		s;
	//   11   23:astore_1        
		((DatabaseStatement) (databasewrapper)).close();
	//   12   24:aload_0         
	//   13   25:invokeinterface #233 <Method void DatabaseStatement.close()>
		throw s;
	//   14   30:aload_1         
	//   15   31:athrow          
	}

	public static void notifyModelChanged(Class class1, com.raizlabs.android.dbflow.structure.BaseModel.Action action, Iterable iterable)
	{
		FlowManager.getContext().getContentResolver().notifyChange(getNotificationUri(class1, action, iterable), ((android.database.ContentObserver) (null)), true);
	//    0    0:invokestatic    #239 <Method Context FlowManager.getContext()>
	//    1    3:invokevirtual   #245 <Method ContentResolver Context.getContentResolver()>
	//    2    6:aload_0         
	//    3    7:aload_1         
	//    4    8:aload_2         
	//    5    9:invokestatic    #247 <Method Uri getNotificationUri(Class, com.raizlabs.android.dbflow.structure.BaseModel$Action, Iterable)>
	//    6   12:aconst_null     
	//    7   13:iconst_1        
	//    8   14:invokevirtual   #253 <Method void ContentResolver.notifyChange(Uri, android.database.ContentObserver, boolean)>
	//    9   17:return          
	}

	public static void notifyModelChanged(Object obj, ModelAdapter modeladapter, com.raizlabs.android.dbflow.structure.BaseModel.Action action)
	{
		if(FlowContentObserver.shouldNotify())
	//*   0    0:invokestatic    #260 <Method boolean FlowContentObserver.shouldNotify()>
	//*   1    3:ifeq            22
			notifyModelChanged(modeladapter.getModelClass(), action, ((Iterable) (modeladapter.getPrimaryConditionClause(obj).getConditions())));
	//    2    6:aload_1         
	//    3    7:invokevirtual   #266 <Method Class ModelAdapter.getModelClass()>
	//    4   10:aload_2         
	//    5   11:aload_1         
	//    6   12:aload_0         
	//    7   13:invokevirtual   #270 <Method ConditionGroup ModelAdapter.getPrimaryConditionClause(Object)>
	//    8   16:invokevirtual   #274 <Method java.util.List ConditionGroup.getConditions()>
	//    9   19:invokestatic    #276 <Method void notifyModelChanged(Class, com.raizlabs.android.dbflow.structure.BaseModel$Action, Iterable)>
	//   10   22:return          
	}

	private static final char hexArray[] = "0123456789ABCDEF".toCharArray();

	static 
	{
	//    0    0:ldc1            #10  <String "0123456789ABCDEF">
	//    1    2:invokevirtual   #16  <Method char[] String.toCharArray()>
	//    2    5:putstatic       #18  <Field char[] hexArray>
	//*   3    8:return          
	}
}

// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.raizlabs.android.dbflow.config;

import android.content.Context;
import com.raizlabs.android.dbflow.converter.TypeConverter;
import com.raizlabs.android.dbflow.structure.*;
import com.raizlabs.android.dbflow.structure.database.DatabaseWrapper;
import com.raizlabs.android.dbflow.structure.database.OpenHelper;
import java.util.*;

// Referenced classes of package com.raizlabs.android.dbflow.config:
//			DatabaseDefinition, FlowConfig, FlowLog, DatabaseHolder

public class FlowManager
{
	private static class GlobalDatabaseHolder extends DatabaseHolder
	{

		public void add(DatabaseHolder databaseholder)
		{
			databaseDefinitionMap.putAll(databaseholder.databaseDefinitionMap);
		//    0    0:aload_0         
		//    1    1:getfield        #20  <Field Map databaseDefinitionMap>
		//    2    4:aload_1         
		//    3    5:getfield        #21  <Field Map DatabaseHolder.databaseDefinitionMap>
		//    4    8:invokeinterface #27  <Method void Map.putAll(Map)>
			databaseNameMap.putAll(databaseholder.databaseNameMap);
		//    5   13:aload_0         
		//    6   14:getfield        #30  <Field Map databaseNameMap>
		//    7   17:aload_1         
		//    8   18:getfield        #31  <Field Map DatabaseHolder.databaseNameMap>
		//    9   21:invokeinterface #27  <Method void Map.putAll(Map)>
			typeConverters.putAll(databaseholder.typeConverters);
		//   10   26:aload_0         
		//   11   27:getfield        #34  <Field Map typeConverters>
		//   12   30:aload_1         
		//   13   31:getfield        #35  <Field Map DatabaseHolder.typeConverters>
		//   14   34:invokeinterface #27  <Method void Map.putAll(Map)>
			databaseClassLookupMap.putAll(databaseholder.databaseClassLookupMap);
		//   15   39:aload_0         
		//   16   40:getfield        #38  <Field Map databaseClassLookupMap>
		//   17   43:aload_1         
		//   18   44:getfield        #39  <Field Map DatabaseHolder.databaseClassLookupMap>
		//   19   47:invokeinterface #27  <Method void Map.putAll(Map)>
		//   20   52:return          
		}

		private GlobalDatabaseHolder()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #11  <Method void DatabaseHolder()>
		//    2    4:return          
		}

	}

	public static class ModuleNotFoundException extends RuntimeException
	{

		public ModuleNotFoundException()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #11  <Method void RuntimeException()>
		//    2    4:return          
		}

		public ModuleNotFoundException(String s)
		{
			super(s);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #15  <Method void RuntimeException(String)>
		//    3    5:return          
		}

		public ModuleNotFoundException(String s, Throwable throwable)
		{
			super(s, throwable);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokespecial   #18  <Method void RuntimeException(String, Throwable)>
		//    4    6:return          
		}

		public ModuleNotFoundException(Throwable throwable)
		{
			super(throwable);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #21  <Method void RuntimeException(Throwable)>
		//    3    5:return          
		}
	}


	public FlowManager()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #69  <Method void Object()>
	//    2    4:return          
	}

	public static void destroy()
	{
		com/raizlabs/android/dbflow/config/FlowManager;
	//    0    0:ldc1            #2   <Class FlowManager>
		JVM INSTR monitorenter ;
	//    1    2:monitorenter    
		for(Iterator iterator = globalDatabaseHolder.databaseClassLookupMap.entrySet().iterator(); iterator.hasNext(); ((DatabaseDefinition)((java.util.Map.Entry)iterator.next()).getValue()).destroy(getContext()));
	//    2    3:getstatic       #33  <Field FlowManager$GlobalDatabaseHolder globalDatabaseHolder>
	//    3    6:getfield        #74  <Field Map FlowManager$GlobalDatabaseHolder.databaseClassLookupMap>
	//    4    9:invokeinterface #80  <Method Set Map.entrySet()>
	//    5   14:invokeinterface #86  <Method Iterator Set.iterator()>
	//    6   19:astore_0        
	//    7   20:aload_0         
	//    8   21:invokeinterface #92  <Method boolean Iterator.hasNext()>
	//    9   26:ifeq            61
	//   10   29:aload_0         
	//   11   30:invokeinterface #96  <Method Object Iterator.next()>
	//   12   35:checkcast       #98  <Class java.util.Map$Entry>
	//   13   38:invokeinterface #101 <Method Object java.util.Map$Entry.getValue()>
	//   14   43:checkcast       #103 <Class DatabaseDefinition>
	//   15   46:invokestatic    #107 <Method Context getContext()>
	//   16   49:invokevirtual   #110 <Method void DatabaseDefinition.destroy(Context)>
		break MISSING_BLOCK_LABEL_61;
	//   17   52:goto            20
		Exception exception;
		exception;
	//   18   55:astore_0        
	//*  19   56:ldc1            #2   <Class FlowManager>
		throw exception;
	//   20   58:monitorexit     
	//   21   59:aload_0         
	//   22   60:athrow          
		config = null;
	//   23   61:aconst_null     
	//   24   62:putstatic       #112 <Field FlowConfig config>
		globalDatabaseHolder = new GlobalDatabaseHolder();
	//   25   65:new             #8   <Class FlowManager$GlobalDatabaseHolder>
	//   26   68:dup             
	//   27   69:aconst_null     
	//   28   70:invokespecial   #31  <Method void FlowManager$GlobalDatabaseHolder(FlowManager$1)>
	//   29   73:putstatic       #33  <Field FlowManager$GlobalDatabaseHolder globalDatabaseHolder>
		loadedModules.clear();
	//   30   76:getstatic       #39  <Field HashSet loadedModules>
	//   31   79:invokevirtual   #115 <Method void HashSet.clear()>
		com/raizlabs/android/dbflow/config/FlowManager;
	//   32   82:ldc1            #2   <Class FlowManager>
		JVM INSTR monitorexit ;
	//   33   84:monitorexit     
	//   34   85:return          
	}

	public static FlowConfig getConfig()
	{
		if(config == null)
	//*   0    0:getstatic       #112 <Field FlowConfig config>
	//*   1    3:ifnonnull       16
			throw new IllegalStateException("Configuration is not initialized. Please call init(FlowConfig) in your application class.");
	//    2    6:new             #119 <Class IllegalStateException>
	//    3    9:dup             
	//    4   10:ldc1            #121 <String "Configuration is not initialized. Please call init(FlowConfig) in your application class.">
	//    5   12:invokespecial   #124 <Method void IllegalStateException(String)>
	//    6   15:athrow          
		else
			return config;
	//    7   16:getstatic       #112 <Field FlowConfig config>
	//    8   19:areturn         
	}

	public static Context getContext()
	{
		if(config == null)
	//*   0    0:getstatic       #112 <Field FlowConfig config>
	//*   1    3:ifnonnull       16
			throw new IllegalStateException("You must provide a valid FlowConfig instance. We recommend calling init() in your application class.");
	//    2    6:new             #119 <Class IllegalStateException>
	//    3    9:dup             
	//    4   10:ldc1            #127 <String "You must provide a valid FlowConfig instance. We recommend calling init() in your application class.">
	//    5   12:invokespecial   #124 <Method void IllegalStateException(String)>
	//    6   15:athrow          
		else
			return config.getContext();
	//    7   16:getstatic       #112 <Field FlowConfig config>
	//    8   19:invokevirtual   #130 <Method Context FlowConfig.getContext()>
	//    9   22:areturn         
	}

	public static DatabaseDefinition getDatabase(Class class1)
	{
		DatabaseDefinition databasedefinition = globalDatabaseHolder.getDatabase(class1);
	//    0    0:getstatic       #33  <Field FlowManager$GlobalDatabaseHolder globalDatabaseHolder>
	//    1    3:aload_0         
	//    2    4:invokevirtual   #135 <Method DatabaseDefinition FlowManager$GlobalDatabaseHolder.getDatabase(Class)>
	//    3    7:astore_1        
		if(databasedefinition == null)
	//*   4    8:aload_1         
	//*   5    9:ifnonnull       47
			throw new InvalidDBConfiguration((new StringBuilder()).append("Database: ").append(class1.getName()).append(" is not a registered Database. Did you forget the @Database annotation?").toString());
	//    6   12:new             #137 <Class InvalidDBConfiguration>
	//    7   15:dup             
	//    8   16:new             #55  <Class StringBuilder>
	//    9   19:dup             
	//   10   20:invokespecial   #56  <Method void StringBuilder()>
	//   11   23:ldc1            #139 <String "Database: ">
	//   12   25:invokevirtual   #60  <Method StringBuilder StringBuilder.append(String)>
	//   13   28:aload_0         
	//   14   29:invokevirtual   #140 <Method String Class.getName()>
	//   15   32:invokevirtual   #60  <Method StringBuilder StringBuilder.append(String)>
	//   16   35:ldc1            #142 <String " is not a registered Database. Did you forget the @Database annotation?">
	//   17   37:invokevirtual   #60  <Method StringBuilder StringBuilder.append(String)>
	//   18   40:invokevirtual   #65  <Method String StringBuilder.toString()>
	//   19   43:invokespecial   #143 <Method void InvalidDBConfiguration(String)>
	//   20   46:athrow          
		else
			return databasedefinition;
	//   21   47:aload_1         
	//   22   48:areturn         
	}

	public static DatabaseDefinition getDatabase(String s)
	{
		DatabaseDefinition databasedefinition = globalDatabaseHolder.getDatabase(s);
	//    0    0:getstatic       #33  <Field FlowManager$GlobalDatabaseHolder globalDatabaseHolder>
	//    1    3:aload_0         
	//    2    4:invokevirtual   #148 <Method DatabaseDefinition FlowManager$GlobalDatabaseHolder.getDatabase(String)>
	//    3    7:astore_1        
		if(databasedefinition != null)
	//*   4    8:aload_1         
	//*   5    9:ifnull          14
			return databasedefinition;
	//    6   12:aload_1         
	//    7   13:areturn         
		else
			throw new InvalidDBConfiguration((new StringBuilder()).append("The specified database").append(s).append(" was not found. Did you forget the @Database annotation?").toString());
	//    8   14:new             #137 <Class InvalidDBConfiguration>
	//    9   17:dup             
	//   10   18:new             #55  <Class StringBuilder>
	//   11   21:dup             
	//   12   22:invokespecial   #56  <Method void StringBuilder()>
	//   13   25:ldc1            #150 <String "The specified database">
	//   14   27:invokevirtual   #60  <Method StringBuilder StringBuilder.append(String)>
	//   15   30:aload_0         
	//   16   31:invokevirtual   #60  <Method StringBuilder StringBuilder.append(String)>
	//   17   34:ldc1            #152 <String " was not found. Did you forget the @Database annotation?">
	//   18   36:invokevirtual   #60  <Method StringBuilder StringBuilder.append(String)>
	//   19   39:invokevirtual   #65  <Method String StringBuilder.toString()>
	//   20   42:invokespecial   #143 <Method void InvalidDBConfiguration(String)>
	//   21   45:athrow          
	}

	public static DatabaseDefinition getDatabaseForTable(Class class1)
	{
		DatabaseDefinition databasedefinition = globalDatabaseHolder.getDatabaseForTable(class1);
	//    0    0:getstatic       #33  <Field FlowManager$GlobalDatabaseHolder globalDatabaseHolder>
	//    1    3:aload_0         
	//    2    4:invokevirtual   #155 <Method DatabaseDefinition FlowManager$GlobalDatabaseHolder.getDatabaseForTable(Class)>
	//    3    7:astore_1        
		if(databasedefinition == null)
	//*   4    8:aload_1         
	//*   5    9:ifnonnull       47
			throw new InvalidDBConfiguration((new StringBuilder()).append("Model object: ").append(class1.getName()).append(" is not registered with a Database. Did you forget an annotation?").toString());
	//    6   12:new             #137 <Class InvalidDBConfiguration>
	//    7   15:dup             
	//    8   16:new             #55  <Class StringBuilder>
	//    9   19:dup             
	//   10   20:invokespecial   #56  <Method void StringBuilder()>
	//   11   23:ldc1            #157 <String "Model object: ">
	//   12   25:invokevirtual   #60  <Method StringBuilder StringBuilder.append(String)>
	//   13   28:aload_0         
	//   14   29:invokevirtual   #140 <Method String Class.getName()>
	//   15   32:invokevirtual   #60  <Method StringBuilder StringBuilder.append(String)>
	//   16   35:ldc1            #159 <String " is not registered with a Database. Did you forget an annotation?">
	//   17   37:invokevirtual   #60  <Method StringBuilder StringBuilder.append(String)>
	//   18   40:invokevirtual   #65  <Method String StringBuilder.toString()>
	//   19   43:invokespecial   #143 <Method void InvalidDBConfiguration(String)>
	//   20   46:athrow          
		else
			return databasedefinition;
	//   21   47:aload_1         
	//   22   48:areturn         
	}

	public static InstanceAdapter getInstanceAdapter(Class class1)
	{
		ModelAdapter modeladapter = getModelAdapter(class1);
	//    0    0:aload_0         
	//    1    1:invokestatic    #165 <Method ModelAdapter getModelAdapter(Class)>
	//    2    4:astore_2        
		Object obj = ((Object) (modeladapter));
	//    3    5:aload_2         
	//    4    6:astore_1        
		if(modeladapter == null)
	//*   5    7:aload_2         
	//*   6    8:ifnonnull       25
			if(((Class) (com/raizlabs/android/dbflow/structure/BaseModelView)).isAssignableFrom(class1))
	//*   7   11:ldc1            #167 <Class BaseModelView>
	//*   8   13:aload_0         
	//*   9   14:invokevirtual   #171 <Method boolean Class.isAssignableFrom(Class)>
	//*  10   17:ifeq            27
			{
				obj = ((Object) (getModelViewAdapter(class1)));
	//   11   20:aload_0         
	//   12   21:invokestatic    #175 <Method ModelViewAdapter getModelViewAdapter(Class)>
	//   13   24:astore_1        
			} else
	//*  14   25:aload_1         
	//*  15   26:areturn         
			{
				obj = ((Object) (modeladapter));
	//   16   27:aload_2         
	//   17   28:astore_1        
				if(((Class) (com/raizlabs/android/dbflow/structure/BaseQueryModel)).isAssignableFrom(class1))
	//*  18   29:ldc1            #177 <Class BaseQueryModel>
	//*  19   31:aload_0         
	//*  20   32:invokevirtual   #171 <Method boolean Class.isAssignableFrom(Class)>
	//*  21   35:ifeq            25
					return ((InstanceAdapter) (getQueryModelAdapter(class1)));
	//   22   38:aload_0         
	//   23   39:invokestatic    #181 <Method QueryModelAdapter getQueryModelAdapter(Class)>
	//   24   42:areturn         
			}
		return ((InstanceAdapter) (obj));
	}

	static Map getMigrations(String s)
	{
		return getDatabase(s).getMigrations();
	//    0    0:aload_0         
	//    1    1:invokestatic    #185 <Method DatabaseDefinition getDatabase(String)>
	//    2    4:invokevirtual   #188 <Method Map DatabaseDefinition.getMigrations()>
	//    3    7:areturn         
	}

	public static ModelAdapter getModelAdapter(Class class1)
	{
		return getDatabaseForTable(class1).getModelAdapterForTable(class1);
	//    0    0:aload_0         
	//    1    1:invokestatic    #190 <Method DatabaseDefinition getDatabaseForTable(Class)>
	//    2    4:aload_0         
	//    3    5:invokevirtual   #193 <Method ModelAdapter DatabaseDefinition.getModelAdapterForTable(Class)>
	//    4    8:areturn         
	}

	public static ModelViewAdapter getModelViewAdapter(Class class1)
	{
		return getDatabaseForTable(class1).getModelViewAdapterForTable(class1);
	//    0    0:aload_0         
	//    1    1:invokestatic    #190 <Method DatabaseDefinition getDatabaseForTable(Class)>
	//    2    4:aload_0         
	//    3    5:invokevirtual   #197 <Method ModelViewAdapter DatabaseDefinition.getModelViewAdapterForTable(Class)>
	//    4    8:areturn         
	}

	public static QueryModelAdapter getQueryModelAdapter(Class class1)
	{
		return getDatabaseForTable(class1).getQueryModelAdapterForQueryClass(class1);
	//    0    0:aload_0         
	//    1    1:invokestatic    #190 <Method DatabaseDefinition getDatabaseForTable(Class)>
	//    2    4:aload_0         
	//    3    5:invokevirtual   #201 <Method QueryModelAdapter DatabaseDefinition.getQueryModelAdapterForQueryClass(Class)>
	//    4    8:areturn         
	}

	public static Class getTableClassForName(String s, String s1)
	{
		Object obj = ((Object) (getDatabase(s)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #185 <Method DatabaseDefinition getDatabase(String)>
	//    2    4:astore_2        
		if(obj == null)
	//*   3    5:aload_2         
	//*   4    6:ifnonnull       30
			throw new IllegalArgumentException(String.format("The specified database %1s was not found. Did you forget to add the @Database?", new Object[] {
				s
			}));
	//    5    9:new             #206 <Class IllegalArgumentException>
	//    6   12:dup             
	//    7   13:ldc1            #208 <String "The specified database %1s was not found. Did you forget to add the @Database?">
	//    8   15:iconst_1        
	//    9   16:anewarray       Object[]
	//   10   19:dup             
	//   11   20:iconst_0        
	//   12   21:aload_0         
	//   13   22:aastore         
	//   14   23:invokestatic    #214 <Method String String.format(String, Object[])>
	//   15   26:invokespecial   #215 <Method void IllegalArgumentException(String)>
	//   16   29:athrow          
		obj = ((Object) (((DatabaseDefinition) (obj)).getModelClassForName(s1)));
	//   17   30:aload_2         
	//   18   31:aload_1         
	//   19   32:invokevirtual   #219 <Method Class DatabaseDefinition.getModelClassForName(String)>
	//   20   35:astore_2        
		if(obj == null)
	//*  21   36:aload_2         
	//*  22   37:ifnonnull       65
			throw new IllegalArgumentException(String.format("The specified table %1s was not found. Did you forget to add the @Table annotation and point it to %1s?", new Object[] {
				s1, s
			}));
	//   23   40:new             #206 <Class IllegalArgumentException>
	//   24   43:dup             
	//   25   44:ldc1            #221 <String "The specified table %1s was not found. Did you forget to add the @Table annotation and point it to %1s?">
	//   26   46:iconst_2        
	//   27   47:anewarray       Object[]
	//   28   50:dup             
	//   29   51:iconst_0        
	//   30   52:aload_1         
	//   31   53:aastore         
	//   32   54:dup             
	//   33   55:iconst_1        
	//   34   56:aload_0         
	//   35   57:aastore         
	//   36   58:invokestatic    #214 <Method String String.format(String, Object[])>
	//   37   61:invokespecial   #215 <Method void IllegalArgumentException(String)>
	//   38   64:athrow          
		else
			return ((Class) (obj));
	//   39   65:aload_2         
	//   40   66:areturn         
	}

	public static String getTableName(Class class1)
	{
		Object obj1 = ((Object) (getModelAdapter(class1)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #165 <Method ModelAdapter getModelAdapter(Class)>
	//    2    4:astore_2        
		Object obj = null;
	//    3    5:aconst_null     
	//    4    6:astore_1        
		if(obj1 == null)
	//*   5    7:aload_2         
	//*   6    8:ifnonnull       33
		{
			obj1 = ((Object) (getDatabaseForTable(class1).getModelViewAdapterForTable(class1)));
	//    7   11:aload_0         
	//    8   12:invokestatic    #190 <Method DatabaseDefinition getDatabaseForTable(Class)>
	//    9   15:aload_0         
	//   10   16:invokevirtual   #197 <Method ModelViewAdapter DatabaseDefinition.getModelViewAdapterForTable(Class)>
	//   11   19:astore_2        
			class1 = ((Class) (obj));
	//   12   20:aload_1         
	//   13   21:astore_0        
			if(obj1 != null)
	//*  14   22:aload_2         
	//*  15   23:ifnull          31
				class1 = ((Class) (((ModelViewAdapter) (obj1)).getViewName()));
	//   16   26:aload_2         
	//   17   27:invokevirtual   #229 <Method String ModelViewAdapter.getViewName()>
	//   18   30:astore_0        
			return ((String) (class1));
	//   19   31:aload_0         
	//   20   32:areturn         
		} else
		{
			return ((ModelAdapter) (obj1)).getTableName();
	//   21   33:aload_2         
	//   22   34:invokevirtual   #233 <Method String ModelAdapter.getTableName()>
	//   23   37:areturn         
		}
	}

	public static TypeConverter getTypeConverterForClass(Class class1)
	{
		return globalDatabaseHolder.getTypeConverterForClass(class1);
	//    0    0:getstatic       #33  <Field FlowManager$GlobalDatabaseHolder globalDatabaseHolder>
	//    1    3:aload_0         
	//    2    4:invokevirtual   #238 <Method TypeConverter FlowManager$GlobalDatabaseHolder.getTypeConverterForClass(Class)>
	//    3    7:areturn         
	}

	public static DatabaseWrapper getWritableDatabase(Class class1)
	{
		return getDatabase(class1).getWritableDatabase();
	//    0    0:aload_0         
	//    1    1:invokestatic    #242 <Method DatabaseDefinition getDatabase(Class)>
	//    2    4:invokevirtual   #245 <Method DatabaseWrapper DatabaseDefinition.getWritableDatabase()>
	//    3    7:areturn         
	}

	public static DatabaseWrapper getWritableDatabase(String s)
	{
		return getDatabase(s).getWritableDatabase();
	//    0    0:aload_0         
	//    1    1:invokestatic    #185 <Method DatabaseDefinition getDatabase(String)>
	//    2    4:invokevirtual   #245 <Method DatabaseWrapper DatabaseDefinition.getWritableDatabase()>
	//    3    7:areturn         
	}

	public static DatabaseWrapper getWritableDatabaseForTable(Class class1)
	{
		return getDatabaseForTable(class1).getWritableDatabase();
	//    0    0:aload_0         
	//    1    1:invokestatic    #190 <Method DatabaseDefinition getDatabaseForTable(Class)>
	//    2    4:invokevirtual   #245 <Method DatabaseWrapper DatabaseDefinition.getWritableDatabase()>
	//    3    7:areturn         
	}

	public static void init(Context context)
	{
		init((new FlowConfig.Builder(context)).build());
	//    0    0:new             #251 <Class FlowConfig$Builder>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #253 <Method void FlowConfig$Builder(Context)>
	//    4    8:invokevirtual   #256 <Method FlowConfig FlowConfig$Builder.build()>
	//    5   11:invokestatic    #259 <Method void init(FlowConfig)>
	//    6   14:return          
	}

	public static void init(FlowConfig flowconfig)
	{
		config = flowconfig;
	//    0    0:aload_0         
	//    1    1:putstatic       #112 <Field FlowConfig config>
		try
		{
			loadDatabaseHolder(Class.forName(DEFAULT_DATABASE_HOLDER_CLASSNAME));
	//    2    4:getstatic       #67  <Field String DEFAULT_DATABASE_HOLDER_CLASSNAME>
	//    3    7:invokestatic    #265 <Method Class Class.forName(String)>
	//    4   10:invokestatic    #269 <Method void loadDatabaseHolder(Class)>
		}
	//*   5   13:aload_0         
	//*   6   14:invokevirtual   #272 <Method Set FlowConfig.databaseHolders()>
	//*   7   17:ifnull          93
	//*   8   20:aload_0         
	//*   9   21:invokevirtual   #272 <Method Set FlowConfig.databaseHolders()>
	//*  10   24:invokeinterface #275 <Method boolean Set.isEmpty()>
	//*  11   29:ifne            93
	//*  12   32:aload_0         
	//*  13   33:invokevirtual   #272 <Method Set FlowConfig.databaseHolders()>
	//*  14   36:invokeinterface #86  <Method Iterator Set.iterator()>
	//*  15   41:astore_1        
	//*  16   42:aload_1         
	//*  17   43:invokeinterface #92  <Method boolean Iterator.hasNext()>
	//*  18   48:ifeq            93
	//*  19   51:aload_1         
	//*  20   52:invokeinterface #96  <Method Object Iterator.next()>
	//*  21   57:checkcast       #41  <Class Class>
	//*  22   60:invokestatic    #269 <Method void loadDatabaseHolder(Class)>
	//*  23   63:goto            42
		catch(ModuleNotFoundException modulenotfoundexception)
	//*  24   66:astore_1        
		{
			FlowLog.log(FlowLog.Level.W, modulenotfoundexception.getMessage());
	//   25   67:getstatic       #281 <Field FlowLog$Level FlowLog$Level.W>
	//   26   70:aload_1         
	//   27   71:invokevirtual   #284 <Method String FlowManager$ModuleNotFoundException.getMessage()>
	//   28   74:invokestatic    #290 <Method void FlowLog.log(FlowLog$Level, String)>
		}
	//*  29   77:goto            13
		catch(ClassNotFoundException classnotfoundexception)
	//*  30   80:astore_1        
		{
			FlowLog.log(FlowLog.Level.W, "Could not find the default GeneratedDatabaseHolder");
	//   31   81:getstatic       #281 <Field FlowLog$Level FlowLog$Level.W>
	//   32   84:ldc2            #292 <String "Could not find the default GeneratedDatabaseHolder">
	//   33   87:invokestatic    #290 <Method void FlowLog.log(FlowLog$Level, String)>
		}
		if(flowconfig.databaseHolders() != null && !flowconfig.databaseHolders().isEmpty())
		{
			for(Iterator iterator = flowconfig.databaseHolders().iterator(); iterator.hasNext(); loadDatabaseHolder((Class)iterator.next()));
		}
	//*  34   90:goto            13
		if(flowconfig.openDatabasesOnInit())
	//*  35   93:aload_0         
	//*  36   94:invokevirtual   #295 <Method boolean FlowConfig.openDatabasesOnInit()>
	//*  37   97:ifeq            137
			for(flowconfig = ((FlowConfig) (globalDatabaseHolder.getDatabaseDefinitions().iterator())); ((Iterator) (flowconfig)).hasNext(); ((DatabaseDefinition)((Iterator) (flowconfig)).next()).getWritableDatabase());
	//   38  100:getstatic       #33  <Field FlowManager$GlobalDatabaseHolder globalDatabaseHolder>
	//   39  103:invokevirtual   #299 <Method List FlowManager$GlobalDatabaseHolder.getDatabaseDefinitions()>
	//   40  106:invokeinterface #302 <Method Iterator List.iterator()>
	//   41  111:astore_0        
	//   42  112:aload_0         
	//   43  113:invokeinterface #92  <Method boolean Iterator.hasNext()>
	//   44  118:ifeq            137
	//   45  121:aload_0         
	//   46  122:invokeinterface #96  <Method Object Iterator.next()>
	//   47  127:checkcast       #103 <Class DatabaseDefinition>
	//   48  130:invokevirtual   #245 <Method DatabaseWrapper DatabaseDefinition.getWritableDatabase()>
	//   49  133:pop             
	//*  50  134:goto            112
	//   51  137:return          
	}

	public static void initModule(Class class1)
	{
		loadDatabaseHolder(class1);
	//    0    0:aload_0         
	//    1    1:invokestatic    #269 <Method void loadDatabaseHolder(Class)>
	//    2    4:return          
	}

	public static boolean isDatabaseIntegrityOk(String s)
	{
		return getDatabase(s).getHelper().isDatabaseIntegrityOk();
	//    0    0:aload_0         
	//    1    1:invokestatic    #185 <Method DatabaseDefinition getDatabase(String)>
	//    2    4:invokevirtual   #310 <Method OpenHelper DatabaseDefinition.getHelper()>
	//    3    7:invokeinterface #314 <Method boolean OpenHelper.isDatabaseIntegrityOk()>
	//    4   12:ireturn         
	}

	protected static void loadDatabaseHolder(Class class1)
	{
		if(!loadedModules.contains(((Object) (class1)))) goto _L2; else goto _L1
	//    0    0:getstatic       #39  <Field HashSet loadedModules>
	//    1    3:aload_0         
	//    2    4:invokevirtual   #320 <Method boolean HashSet.contains(Object)>
	//    3    7:ifeq            11
_L1:
		DatabaseHolder databaseholder;
		return;
	//    4   10:return          
	//*   5   11:aload_0         
	//*   6   12:invokevirtual   #323 <Method Object Class.newInstance()>
	//*   7   15:checkcast       #325 <Class DatabaseHolder>
	//*   8   18:astore_1        
_L2:
		if((databaseholder = (DatabaseHolder)class1.newInstance()) == null) goto _L1; else goto _L3
	//    9   19:aload_1         
	//   10   20:ifnull          10
_L3:
		try
		{
			globalDatabaseHolder.add(databaseholder);
	//   11   23:getstatic       #33  <Field FlowManager$GlobalDatabaseHolder globalDatabaseHolder>
	//   12   26:aload_1         
	//   13   27:invokevirtual   #329 <Method void FlowManager$GlobalDatabaseHolder.add(DatabaseHolder)>
			loadedModules.add(((Object) (class1)));
	//   14   30:getstatic       #39  <Field HashSet loadedModules>
	//   15   33:aload_0         
	//   16   34:invokevirtual   #331 <Method boolean HashSet.add(Object)>
	//   17   37:pop             
			return;
	//   18   38:return          
		}
		catch(Throwable throwable)
	//*  19   39:astore_1        
		{
			throwable.printStackTrace();
	//   20   40:aload_1         
	//   21   41:invokevirtual   #334 <Method void Throwable.printStackTrace()>
			throw new ModuleNotFoundException((new StringBuilder()).append("Cannot load ").append(((Object) (class1))).toString(), throwable);
	//   22   44:new             #11  <Class FlowManager$ModuleNotFoundException>
	//   23   47:dup             
	//   24   48:new             #55  <Class StringBuilder>
	//   25   51:dup             
	//   26   52:invokespecial   #56  <Method void StringBuilder()>
	//   27   55:ldc2            #336 <String "Cannot load ">
	//   28   58:invokevirtual   #60  <Method StringBuilder StringBuilder.append(String)>
	//   29   61:aload_0         
	//   30   62:invokevirtual   #339 <Method StringBuilder StringBuilder.append(Object)>
	//   31   65:invokevirtual   #65  <Method String StringBuilder.toString()>
	//   32   68:aload_1         
	//   33   69:invokespecial   #342 <Method void FlowManager$ModuleNotFoundException(String, Throwable)>
	//   34   72:athrow          
		}
	}

	public static void reset()
	{
		for(Iterator iterator = globalDatabaseHolder.databaseClassLookupMap.entrySet().iterator(); iterator.hasNext(); ((DatabaseDefinition)((java.util.Map.Entry)iterator.next()).getValue()).reset(getContext()));
	//    0    0:getstatic       #33  <Field FlowManager$GlobalDatabaseHolder globalDatabaseHolder>
	//    1    3:getfield        #74  <Field Map FlowManager$GlobalDatabaseHolder.databaseClassLookupMap>
	//    2    6:invokeinterface #80  <Method Set Map.entrySet()>
	//    3   11:invokeinterface #86  <Method Iterator Set.iterator()>
	//    4   16:astore_0        
	//    5   17:aload_0         
	//    6   18:invokeinterface #92  <Method boolean Iterator.hasNext()>
	//    7   23:ifeq            52
	//    8   26:aload_0         
	//    9   27:invokeinterface #96  <Method Object Iterator.next()>
	//   10   32:checkcast       #98  <Class java.util.Map$Entry>
	//   11   35:invokeinterface #101 <Method Object java.util.Map$Entry.getValue()>
	//   12   40:checkcast       #103 <Class DatabaseDefinition>
	//   13   43:invokestatic    #107 <Method Context getContext()>
	//   14   46:invokevirtual   #345 <Method void DatabaseDefinition.reset(Context)>
	//*  15   49:goto            17
		globalDatabaseHolder.reset();
	//   16   52:getstatic       #33  <Field FlowManager$GlobalDatabaseHolder globalDatabaseHolder>
	//   17   55:invokevirtual   #347 <Method void FlowManager$GlobalDatabaseHolder.reset()>
		loadedModules.clear();
	//   18   58:getstatic       #39  <Field HashSet loadedModules>
	//   19   61:invokevirtual   #115 <Method void HashSet.clear()>
	//   20   64:return          
	}

	private static final String DEFAULT_DATABASE_HOLDER_CLASSNAME = (new StringBuilder()).append(DEFAULT_DATABASE_HOLDER_PACKAGE_NAME).append(".").append("GeneratedDatabaseHolder").toString();
	private static final String DEFAULT_DATABASE_HOLDER_NAME = "GeneratedDatabaseHolder";
	private static final String DEFAULT_DATABASE_HOLDER_PACKAGE_NAME = ((Class) (com/raizlabs/android/dbflow/config/FlowManager)).getPackage().getName();
	static FlowConfig config;
	private static GlobalDatabaseHolder globalDatabaseHolder = new GlobalDatabaseHolder();
	private static HashSet loadedModules = new HashSet();

	static 
	{
	//    0    0:new             #8   <Class FlowManager$GlobalDatabaseHolder>
	//    1    3:dup             
	//    2    4:aconst_null     
	//    3    5:invokespecial   #31  <Method void FlowManager$GlobalDatabaseHolder(FlowManager$1)>
	//    4    8:putstatic       #33  <Field FlowManager$GlobalDatabaseHolder globalDatabaseHolder>
	//    5   11:new             #35  <Class HashSet>
	//    6   14:dup             
	//    7   15:invokespecial   #37  <Method void HashSet()>
	//    8   18:putstatic       #39  <Field HashSet loadedModules>
	//    9   21:ldc1            #2   <Class FlowManager>
	//   10   23:invokevirtual   #45  <Method Package Class.getPackage()>
	//   11   26:invokevirtual   #51  <Method String Package.getName()>
	//   12   29:putstatic       #53  <Field String DEFAULT_DATABASE_HOLDER_PACKAGE_NAME>
	//   13   32:new             #55  <Class StringBuilder>
	//   14   35:dup             
	//   15   36:invokespecial   #56  <Method void StringBuilder()>
	//   16   39:getstatic       #53  <Field String DEFAULT_DATABASE_HOLDER_PACKAGE_NAME>
	//   17   42:invokevirtual   #60  <Method StringBuilder StringBuilder.append(String)>
	//   18   45:ldc1            #62  <String ".">
	//   19   47:invokevirtual   #60  <Method StringBuilder StringBuilder.append(String)>
	//   20   50:ldc1            #17  <String "GeneratedDatabaseHolder">
	//   21   52:invokevirtual   #60  <Method StringBuilder StringBuilder.append(String)>
	//   22   55:invokevirtual   #65  <Method String StringBuilder.toString()>
	//   23   58:putstatic       #67  <Field String DEFAULT_DATABASE_HOLDER_CLASSNAME>
	//*  24   61:return          
	}
}

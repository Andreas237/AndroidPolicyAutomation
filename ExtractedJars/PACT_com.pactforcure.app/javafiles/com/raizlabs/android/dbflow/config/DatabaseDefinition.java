// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.raizlabs.android.dbflow.config;

import android.content.Context;
import com.raizlabs.android.dbflow.runtime.BaseTransactionManager;
import com.raizlabs.android.dbflow.structure.*;
import com.raizlabs.android.dbflow.structure.database.*;
import com.raizlabs.android.dbflow.structure.database.transaction.DefaultTransactionManager;
import com.raizlabs.android.dbflow.structure.database.transaction.ITransaction;
import java.util.*;

// Referenced classes of package com.raizlabs.android.dbflow.config:
//			FlowManager, FlowConfig, DatabaseConfig, TableConfig

public abstract class DatabaseDefinition
{

	public DatabaseDefinition()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #34  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #36  <Class HashMap>
	//    4    8:dup             
	//    5    9:invokespecial   #37  <Method void HashMap()>
	//    6   12:putfield        #39  <Field Map migrationMap>
	//    7   15:aload_0         
	//    8   16:new             #41  <Class ArrayList>
	//    9   19:dup             
	//   10   20:invokespecial   #42  <Method void ArrayList()>
	//   11   23:putfield        #44  <Field List models>
	//   12   26:aload_0         
	//   13   27:new             #36  <Class HashMap>
	//   14   30:dup             
	//   15   31:invokespecial   #37  <Method void HashMap()>
	//   16   34:putfield        #46  <Field Map modelAdapters>
	//   17   37:aload_0         
	//   18   38:new             #36  <Class HashMap>
	//   19   41:dup             
	//   20   42:invokespecial   #37  <Method void HashMap()>
	//   21   45:putfield        #48  <Field Map modelTableNames>
	//   22   48:aload_0         
	//   23   49:new             #41  <Class ArrayList>
	//   24   52:dup             
	//   25   53:invokespecial   #42  <Method void ArrayList()>
	//   26   56:putfield        #50  <Field List modelViews>
	//   27   59:aload_0         
	//   28   60:new             #52  <Class LinkedHashMap>
	//   29   63:dup             
	//   30   64:invokespecial   #53  <Method void LinkedHashMap()>
	//   31   67:putfield        #55  <Field Map modelViewAdapterMap>
	//   32   70:aload_0         
	//   33   71:new             #52  <Class LinkedHashMap>
	//   34   74:dup             
	//   35   75:invokespecial   #53  <Method void LinkedHashMap()>
	//   36   78:putfield        #57  <Field Map queryModelAdapterMap>
		isResetting = false;
	//   37   81:aload_0         
	//   38   82:iconst_0        
	//   39   83:putfield        #59  <Field boolean isResetting>
		databaseConfig = (DatabaseConfig)FlowManager.getConfig().databaseConfigMap().get(((Object) (getAssociatedDatabaseClassFile())));
	//   40   86:aload_0         
	//   41   87:invokestatic    #65  <Method FlowConfig FlowManager.getConfig()>
	//   42   90:invokevirtual   #71  <Method Map FlowConfig.databaseConfigMap()>
	//   43   93:aload_0         
	//   44   94:invokevirtual   #75  <Method Class getAssociatedDatabaseClassFile()>
	//   45   97:invokeinterface #81  <Method Object Map.get(Object)>
	//   46  102:checkcast       #83  <Class DatabaseConfig>
	//   47  105:putfield        #85  <Field DatabaseConfig databaseConfig>
		if(databaseConfig != null)
	//*  48  108:aload_0         
	//*  49  109:getfield        #85  <Field DatabaseConfig databaseConfig>
	//*  50  112:ifnull          232
		{
			Iterator iterator = databaseConfig.tableConfigMap().values().iterator();
	//   51  115:aload_0         
	//   52  116:getfield        #85  <Field DatabaseConfig databaseConfig>
	//   53  119:invokevirtual   #88  <Method Map DatabaseConfig.tableConfigMap()>
	//   54  122:invokeinterface #92  <Method Collection Map.values()>
	//   55  127:invokeinterface #98  <Method Iterator Collection.iterator()>
	//   56  132:astore_1        
			do
			{
				if(!iterator.hasNext())
					break;
	//   57  133:aload_1         
	//   58  134:invokeinterface #104 <Method boolean Iterator.hasNext()>
	//   59  139:ifeq            221
				TableConfig tableconfig = (TableConfig)iterator.next();
	//   60  142:aload_1         
	//   61  143:invokeinterface #108 <Method Object Iterator.next()>
	//   62  148:checkcast       #110 <Class TableConfig>
	//   63  151:astore_2        
				ModelAdapter modeladapter = (ModelAdapter)modelAdapters.get(((Object) (tableconfig.tableClass())));
	//   64  152:aload_0         
	//   65  153:getfield        #46  <Field Map modelAdapters>
	//   66  156:aload_2         
	//   67  157:invokevirtual   #113 <Method Class TableConfig.tableClass()>
	//   68  160:invokeinterface #81  <Method Object Map.get(Object)>
	//   69  165:checkcast       #115 <Class ModelAdapter>
	//   70  168:astore_3        
				if(modeladapter != null)
	//*  71  169:aload_3         
	//*  72  170:ifnull          133
				{
					if(tableconfig.listModelLoader() != null)
	//*  73  173:aload_2         
	//*  74  174:invokevirtual   #119 <Method com.raizlabs.android.dbflow.sql.queriable.ListModelLoader TableConfig.listModelLoader()>
	//*  75  177:ifnull          188
						modeladapter.setListModelLoader(tableconfig.listModelLoader());
	//   76  180:aload_3         
	//   77  181:aload_2         
	//   78  182:invokevirtual   #119 <Method com.raizlabs.android.dbflow.sql.queriable.ListModelLoader TableConfig.listModelLoader()>
	//   79  185:invokevirtual   #123 <Method void ModelAdapter.setListModelLoader(com.raizlabs.android.dbflow.sql.queriable.ListModelLoader)>
					if(tableconfig.singleModelLoader() != null)
	//*  80  188:aload_2         
	//*  81  189:invokevirtual   #127 <Method com.raizlabs.android.dbflow.sql.queriable.SingleModelLoader TableConfig.singleModelLoader()>
	//*  82  192:ifnull          203
						modeladapter.setSingleModelLoader(tableconfig.singleModelLoader());
	//   83  195:aload_3         
	//   84  196:aload_2         
	//   85  197:invokevirtual   #127 <Method com.raizlabs.android.dbflow.sql.queriable.SingleModelLoader TableConfig.singleModelLoader()>
	//   86  200:invokevirtual   #131 <Method void ModelAdapter.setSingleModelLoader(com.raizlabs.android.dbflow.sql.queriable.SingleModelLoader)>
					if(tableconfig.modelSaver() != null)
	//*  87  203:aload_2         
	//*  88  204:invokevirtual   #135 <Method com.raizlabs.android.dbflow.sql.saveable.ModelSaver TableConfig.modelSaver()>
	//*  89  207:ifnull          133
						modeladapter.setModelSaver(tableconfig.modelSaver());
	//   90  210:aload_3         
	//   91  211:aload_2         
	//   92  212:invokevirtual   #135 <Method com.raizlabs.android.dbflow.sql.saveable.ModelSaver TableConfig.modelSaver()>
	//   93  215:invokevirtual   #139 <Method void ModelAdapter.setModelSaver(com.raizlabs.android.dbflow.sql.saveable.ModelSaver)>
				}
			} while(true);
	//   94  218:goto            133
			helperListener = databaseConfig.helperListener();
	//   95  221:aload_0         
	//   96  222:aload_0         
	//   97  223:getfield        #85  <Field DatabaseConfig databaseConfig>
	//   98  226:invokevirtual   #142 <Method DatabaseHelperListener DatabaseConfig.helperListener()>
	//   99  229:putfield        #144 <Field DatabaseHelperListener helperListener>
		}
		if(databaseConfig == null || databaseConfig.transactionManagerCreator() == null)
	//* 100  232:aload_0         
	//* 101  233:getfield        #85  <Field DatabaseConfig databaseConfig>
	//* 102  236:ifnull          249
	//* 103  239:aload_0         
	//* 104  240:getfield        #85  <Field DatabaseConfig databaseConfig>
	//* 105  243:invokevirtual   #148 <Method DatabaseConfig$TransactionManagerCreator DatabaseConfig.transactionManagerCreator()>
	//* 106  246:ifnonnull       262
		{
			transactionManager = ((BaseTransactionManager) (new DefaultTransactionManager(this)));
	//  107  249:aload_0         
	//  108  250:new             #150 <Class DefaultTransactionManager>
	//  109  253:dup             
	//  110  254:aload_0         
	//  111  255:invokespecial   #153 <Method void DefaultTransactionManager(DatabaseDefinition)>
	//  112  258:putfield        #155 <Field BaseTransactionManager transactionManager>
			return;
	//  113  261:return          
		} else
		{
			transactionManager = databaseConfig.transactionManagerCreator().createManager(this);
	//  114  262:aload_0         
	//  115  263:aload_0         
	//  116  264:getfield        #85  <Field DatabaseConfig databaseConfig>
	//  117  267:invokevirtual   #148 <Method DatabaseConfig$TransactionManagerCreator DatabaseConfig.transactionManagerCreator()>
	//  118  270:aload_0         
	//  119  271:invokeinterface #161 <Method BaseTransactionManager DatabaseConfig$TransactionManagerCreator.createManager(DatabaseDefinition)>
	//  120  276:putfield        #155 <Field BaseTransactionManager transactionManager>
			return;
	//  121  279:return          
		}
	}

	public abstract boolean areConsistencyChecksEnabled();

	public void backupDatabase()
	{
		getHelper().backupDB();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #168 <Method OpenHelper getHelper()>
	//    2    4:invokeinterface #173 <Method void OpenHelper.backupDB()>
	//    3    9:return          
	}

	public abstract boolean backupEnabled();

	public com.raizlabs.android.dbflow.structure.database.transaction.Transaction.Builder beginTransactionAsync(ITransaction itransaction)
	{
		return new com.raizlabs.android.dbflow.structure.database.transaction.Transaction.Builder(itransaction, this);
	//    0    0:new             #178 <Class com.raizlabs.android.dbflow.structure.database.transaction.Transaction$Builder>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:aload_0         
	//    4    6:invokespecial   #181 <Method void com.raizlabs.android.dbflow.structure.database.transaction.Transaction$Builder(ITransaction, DatabaseDefinition)>
	//    5    9:areturn         
	}

	public void destroy(Context context)
	{
		if(!isResetting)
	//*   0    0:aload_0         
	//*   1    1:getfield        #59  <Field boolean isResetting>
	//*   2    4:ifne            47
		{
			isResetting = true;
	//    3    7:aload_0         
	//    4    8:iconst_1        
	//    5    9:putfield        #59  <Field boolean isResetting>
			getTransactionManager().stopQueue();
	//    6   12:aload_0         
	//    7   13:invokevirtual   #187 <Method BaseTransactionManager getTransactionManager()>
	//    8   16:invokevirtual   #192 <Method void BaseTransactionManager.stopQueue()>
			getHelper().closeDB();
	//    9   19:aload_0         
	//   10   20:invokevirtual   #168 <Method OpenHelper getHelper()>
	//   11   23:invokeinterface #195 <Method void OpenHelper.closeDB()>
			context.deleteDatabase(getDatabaseFileName());
	//   12   28:aload_1         
	//   13   29:aload_0         
	//   14   30:invokevirtual   #199 <Method String getDatabaseFileName()>
	//   15   33:invokevirtual   #205 <Method boolean Context.deleteDatabase(String)>
	//   16   36:pop             
			openHelper = null;
	//   17   37:aload_0         
	//   18   38:aconst_null     
	//   19   39:putfield        #207 <Field OpenHelper openHelper>
			isResetting = false;
	//   20   42:aload_0         
	//   21   43:iconst_0        
	//   22   44:putfield        #59  <Field boolean isResetting>
		}
	//   23   47:return          
	}

	public void executeTransaction(ITransaction itransaction)
	{
		DatabaseWrapper databasewrapper = getWritableDatabase();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #213 <Method DatabaseWrapper getWritableDatabase()>
	//    2    4:astore_2        
		databasewrapper.beginTransaction();
	//    3    5:aload_2         
	//    4    6:invokeinterface #218 <Method void DatabaseWrapper.beginTransaction()>
		itransaction.execute(databasewrapper);
	//    5   11:aload_1         
	//    6   12:aload_2         
	//    7   13:invokeinterface #224 <Method void ITransaction.execute(DatabaseWrapper)>
		databasewrapper.setTransactionSuccessful();
	//    8   18:aload_2         
	//    9   19:invokeinterface #227 <Method void DatabaseWrapper.setTransactionSuccessful()>
		databasewrapper.endTransaction();
	//   10   24:aload_2         
	//   11   25:invokeinterface #230 <Method void DatabaseWrapper.endTransaction()>
		return;
	//   12   30:return          
		itransaction;
	//   13   31:astore_1        
		databasewrapper.endTransaction();
	//   14   32:aload_2         
	//   15   33:invokeinterface #230 <Method void DatabaseWrapper.endTransaction()>
		throw itransaction;
	//   16   38:aload_1         
	//   17   39:athrow          
	}

	public abstract Class getAssociatedDatabaseClassFile();

	public String getDatabaseFileName()
	{
		return (new StringBuilder()).append(getDatabaseName()).append(".db").toString();
	//    0    0:new             #232 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #233 <Method void StringBuilder()>
	//    3    7:aload_0         
	//    4    8:invokevirtual   #236 <Method String getDatabaseName()>
	//    5   11:invokevirtual   #240 <Method StringBuilder StringBuilder.append(String)>
	//    6   14:ldc1            #242 <String ".db">
	//    7   16:invokevirtual   #240 <Method StringBuilder StringBuilder.append(String)>
	//    8   19:invokevirtual   #245 <Method String StringBuilder.toString()>
	//    9   22:areturn         
	}

	public abstract String getDatabaseName();

	public abstract int getDatabaseVersion();

	public OpenHelper getHelper()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		if(openHelper != null) goto _L2; else goto _L1
	//    2    2:aload_0         
	//    3    3:getfield        #207 <Field OpenHelper openHelper>
	//    4    6:ifnonnull       64
_L1:
		Object obj = ((Object) ((DatabaseConfig)FlowManager.getConfig().databaseConfigMap().get(((Object) (getAssociatedDatabaseClassFile())))));
	//    5    9:invokestatic    #65  <Method FlowConfig FlowManager.getConfig()>
	//    6   12:invokevirtual   #71  <Method Map FlowConfig.databaseConfigMap()>
	//    7   15:aload_0         
	//    8   16:invokevirtual   #75  <Method Class getAssociatedDatabaseClassFile()>
	//    9   19:invokeinterface #81  <Method Object Map.get(Object)>
	//   10   24:checkcast       #83  <Class DatabaseConfig>
	//   11   27:astore_1        
		if(obj == null)
			break MISSING_BLOCK_LABEL_39;
	//   12   28:aload_1         
	//   13   29:ifnull          39
		if(((DatabaseConfig) (obj)).helperCreator() != null)
			break MISSING_BLOCK_LABEL_73;
	//   14   32:aload_1         
	//   15   33:invokevirtual   #251 <Method DatabaseConfig$OpenHelperCreator DatabaseConfig.helperCreator()>
	//   16   36:ifnonnull       73
		openHelper = ((OpenHelper) (new FlowSQLiteOpenHelper(this, helperListener)));
	//   17   39:aload_0         
	//   18   40:new             #253 <Class FlowSQLiteOpenHelper>
	//   19   43:dup             
	//   20   44:aload_0         
	//   21   45:aload_0         
	//   22   46:getfield        #144 <Field DatabaseHelperListener helperListener>
	//   23   49:invokespecial   #256 <Method void FlowSQLiteOpenHelper(DatabaseDefinition, DatabaseHelperListener)>
	//   24   52:putfield        #207 <Field OpenHelper openHelper>
_L3:
		openHelper.performRestoreFromBackup();
	//   25   55:aload_0         
	//   26   56:getfield        #207 <Field OpenHelper openHelper>
	//   27   59:invokeinterface #259 <Method void OpenHelper.performRestoreFromBackup()>
_L2:
		obj = ((Object) (openHelper));
	//   28   64:aload_0         
	//   29   65:getfield        #207 <Field OpenHelper openHelper>
	//   30   68:astore_1        
		this;
	//   31   69:aload_0         
		JVM INSTR monitorexit ;
	//   32   70:monitorexit     
		return ((OpenHelper) (obj));
	//   33   71:aload_1         
	//   34   72:areturn         
		openHelper = ((DatabaseConfig) (obj)).helperCreator().createHelper(this, helperListener);
	//   35   73:aload_0         
	//   36   74:aload_1         
	//   37   75:invokevirtual   #251 <Method DatabaseConfig$OpenHelperCreator DatabaseConfig.helperCreator()>
	//   38   78:aload_0         
	//   39   79:aload_0         
	//   40   80:getfield        #144 <Field DatabaseHelperListener helperListener>
	//   41   83:invokeinterface #265 <Method OpenHelper DatabaseConfig$OpenHelperCreator.createHelper(DatabaseDefinition, DatabaseHelperListener)>
	//   42   88:putfield        #207 <Field OpenHelper openHelper>
		  goto _L3
	//*  43   91:goto            55
		Exception exception;
		exception;
	//   44   94:astore_1        
	//*  45   95:aload_0         
		throw exception;
	//   46   96:monitorexit     
	//   47   97:aload_1         
	//   48   98:athrow          
	}

	public Map getMigrations()
	{
		return migrationMap;
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field Map migrationMap>
	//    2    4:areturn         
	}

	public ModelAdapter getModelAdapterForTable(Class class1)
	{
		return (ModelAdapter)modelAdapters.get(((Object) (class1)));
	//    0    0:aload_0         
	//    1    1:getfield        #46  <Field Map modelAdapters>
	//    2    4:aload_1         
	//    3    5:invokeinterface #81  <Method Object Map.get(Object)>
	//    4   10:checkcast       #115 <Class ModelAdapter>
	//    5   13:areturn         
	}

	public List getModelAdapters()
	{
		return ((List) (new ArrayList(modelAdapters.values())));
	//    0    0:new             #41  <Class ArrayList>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #46  <Field Map modelAdapters>
	//    4    8:invokeinterface #92  <Method Collection Map.values()>
	//    5   13:invokespecial   #276 <Method void ArrayList(Collection)>
	//    6   16:areturn         
	}

	public Class getModelClassForName(String s)
	{
		return (Class)modelTableNames.get(((Object) (s)));
	//    0    0:aload_0         
	//    1    1:getfield        #48  <Field Map modelTableNames>
	//    2    4:aload_1         
	//    3    5:invokeinterface #81  <Method Object Map.get(Object)>
	//    4   10:checkcast       #281 <Class Class>
	//    5   13:areturn         
	}

	public List getModelClasses()
	{
		return models;
	//    0    0:aload_0         
	//    1    1:getfield        #44  <Field List models>
	//    2    4:areturn         
	}

	public List getModelQueryAdapters()
	{
		return ((List) (new ArrayList(queryModelAdapterMap.values())));
	//    0    0:new             #41  <Class ArrayList>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #57  <Field Map queryModelAdapterMap>
	//    4    8:invokeinterface #92  <Method Collection Map.values()>
	//    5   13:invokespecial   #276 <Method void ArrayList(Collection)>
	//    6   16:areturn         
	}

	public ModelViewAdapter getModelViewAdapterForTable(Class class1)
	{
		return (ModelViewAdapter)modelViewAdapterMap.get(((Object) (class1)));
	//    0    0:aload_0         
	//    1    1:getfield        #55  <Field Map modelViewAdapterMap>
	//    2    4:aload_1         
	//    3    5:invokeinterface #81  <Method Object Map.get(Object)>
	//    4   10:checkcast       #290 <Class ModelViewAdapter>
	//    5   13:areturn         
	}

	public List getModelViewAdapters()
	{
		return ((List) (new ArrayList(modelViewAdapterMap.values())));
	//    0    0:new             #41  <Class ArrayList>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #55  <Field Map modelViewAdapterMap>
	//    4    8:invokeinterface #92  <Method Collection Map.values()>
	//    5   13:invokespecial   #276 <Method void ArrayList(Collection)>
	//    6   16:areturn         
	}

	public List getModelViews()
	{
		return modelViews;
	//    0    0:aload_0         
	//    1    1:getfield        #50  <Field List modelViews>
	//    2    4:areturn         
	}

	public QueryModelAdapter getQueryModelAdapterForQueryClass(Class class1)
	{
		return (QueryModelAdapter)queryModelAdapterMap.get(((Object) (class1)));
	//    0    0:aload_0         
	//    1    1:getfield        #57  <Field Map queryModelAdapterMap>
	//    2    4:aload_1         
	//    3    5:invokeinterface #81  <Method Object Map.get(Object)>
	//    4   10:checkcast       #299 <Class QueryModelAdapter>
	//    5   13:areturn         
	}

	public BaseTransactionManager getTransactionManager()
	{
		return transactionManager;
	//    0    0:aload_0         
	//    1    1:getfield        #155 <Field BaseTransactionManager transactionManager>
	//    2    4:areturn         
	}

	public DatabaseWrapper getWritableDatabase()
	{
		return getHelper().getDatabase();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #168 <Method OpenHelper getHelper()>
	//    2    4:invokeinterface #303 <Method DatabaseWrapper OpenHelper.getDatabase()>
	//    3    9:areturn         
	}

	public boolean isDatabaseIntegrityOk()
	{
		return getHelper().isDatabaseIntegrityOk();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #168 <Method OpenHelper getHelper()>
	//    2    4:invokeinterface #306 <Method boolean OpenHelper.isDatabaseIntegrityOk()>
	//    3    9:ireturn         
	}

	public abstract boolean isForeignKeysSupported();

	public abstract boolean isInMemory();

	public void reset(Context context)
	{
		if(!isResetting)
	//*   0    0:aload_0         
	//*   1    1:getfield        #59  <Field boolean isResetting>
	//*   2    4:ifne            86
		{
			isResetting = true;
	//    3    7:aload_0         
	//    4    8:iconst_1        
	//    5    9:putfield        #59  <Field boolean isResetting>
			getTransactionManager().stopQueue();
	//    6   12:aload_0         
	//    7   13:invokevirtual   #187 <Method BaseTransactionManager getTransactionManager()>
	//    8   16:invokevirtual   #192 <Method void BaseTransactionManager.stopQueue()>
			getHelper().closeDB();
	//    9   19:aload_0         
	//   10   20:invokevirtual   #168 <Method OpenHelper getHelper()>
	//   11   23:invokeinterface #195 <Method void OpenHelper.closeDB()>
			context.deleteDatabase(getDatabaseFileName());
	//   12   28:aload_1         
	//   13   29:aload_0         
	//   14   30:invokevirtual   #199 <Method String getDatabaseFileName()>
	//   15   33:invokevirtual   #205 <Method boolean Context.deleteDatabase(String)>
	//   16   36:pop             
			if(databaseConfig == null || databaseConfig.transactionManagerCreator() == null)
	//*  17   37:aload_0         
	//*  18   38:getfield        #85  <Field DatabaseConfig databaseConfig>
	//*  19   41:ifnull          54
	//*  20   44:aload_0         
	//*  21   45:getfield        #85  <Field DatabaseConfig databaseConfig>
	//*  22   48:invokevirtual   #148 <Method DatabaseConfig$TransactionManagerCreator DatabaseConfig.transactionManagerCreator()>
	//*  23   51:ifnonnull       87
				transactionManager = ((BaseTransactionManager) (new DefaultTransactionManager(this)));
	//   24   54:aload_0         
	//   25   55:new             #150 <Class DefaultTransactionManager>
	//   26   58:dup             
	//   27   59:aload_0         
	//   28   60:invokespecial   #153 <Method void DefaultTransactionManager(DatabaseDefinition)>
	//   29   63:putfield        #155 <Field BaseTransactionManager transactionManager>
			else
	//*  30   66:aload_0         
	//*  31   67:aconst_null     
	//*  32   68:putfield        #207 <Field OpenHelper openHelper>
	//*  33   71:aload_0         
	//*  34   72:iconst_0        
	//*  35   73:putfield        #59  <Field boolean isResetting>
	//*  36   76:aload_0         
	//*  37   77:invokevirtual   #168 <Method OpenHelper getHelper()>
	//*  38   80:invokeinterface #303 <Method DatabaseWrapper OpenHelper.getDatabase()>
	//*  39   85:pop             
	//*  40   86:return          
				transactionManager = databaseConfig.transactionManagerCreator().createManager(this);
	//   41   87:aload_0         
	//   42   88:aload_0         
	//   43   89:getfield        #85  <Field DatabaseConfig databaseConfig>
	//   44   92:invokevirtual   #148 <Method DatabaseConfig$TransactionManagerCreator DatabaseConfig.transactionManagerCreator()>
	//   45   95:aload_0         
	//   46   96:invokeinterface #161 <Method BaseTransactionManager DatabaseConfig$TransactionManagerCreator.createManager(DatabaseDefinition)>
	//   47  101:putfield        #155 <Field BaseTransactionManager transactionManager>
			openHelper = null;
			isResetting = false;
			getHelper().getDatabase();
		}
	//*  48  104:goto            66
	}

	private DatabaseConfig databaseConfig;
	private DatabaseHelperListener helperListener;
	private boolean isResetting;
	final Map migrationMap = new HashMap();
	final Map modelAdapters = new HashMap();
	final Map modelTableNames = new HashMap();
	final Map modelViewAdapterMap = new LinkedHashMap();
	final List modelViews = new ArrayList();
	final List models = new ArrayList();
	private OpenHelper openHelper;
	final Map queryModelAdapterMap = new LinkedHashMap();
	private BaseTransactionManager transactionManager;
}

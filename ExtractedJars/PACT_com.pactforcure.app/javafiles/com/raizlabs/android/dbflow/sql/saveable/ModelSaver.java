// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.raizlabs.android.dbflow.sql.saveable;

import android.content.ContentValues;
import com.raizlabs.android.dbflow.annotation.ConflictAction;
import com.raizlabs.android.dbflow.config.DatabaseDefinition;
import com.raizlabs.android.dbflow.config.FlowManager;
import com.raizlabs.android.dbflow.sql.SqlUtils;
import com.raizlabs.android.dbflow.sql.language.*;
import com.raizlabs.android.dbflow.structure.ModelAdapter;
import com.raizlabs.android.dbflow.structure.database.DatabaseStatement;
import com.raizlabs.android.dbflow.structure.database.DatabaseWrapper;

public class ModelSaver
{

	public ModelSaver()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
	//    2    4:return          
	}

	public boolean delete(Object obj)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		boolean flag = delete(obj, getWritableDatabase());
	//    2    2:aload_0         
	//    3    3:aload_1         
	//    4    4:aload_0         
	//    5    5:invokevirtual   #23  <Method DatabaseWrapper getWritableDatabase()>
	//    6    8:invokevirtual   #26  <Method boolean delete(Object, DatabaseWrapper)>
	//    7   11:istore_2        
		this;
	//    8   12:aload_0         
		JVM INSTR monitorexit ;
	//    9   13:monitorexit     
		return flag;
	//   10   14:iload_2         
	//   11   15:ireturn         
		obj;
	//   12   16:astore_1        
	//*  13   17:aload_0         
		throw obj;
	//   14   18:monitorexit     
	//   15   19:aload_1         
	//   16   20:athrow          
	}

	public boolean delete(Object obj, DatabaseWrapper databasewrapper)
	{
		boolean flag = true;
	//    0    0:iconst_1        
	//    1    1:istore_3        
		this;
	//    2    2:aload_0         
		JVM INSTR monitorenter ;
	//    3    3:monitorenter    
		modelAdapter.deleteForeignKeys(obj, databasewrapper);
	//    4    4:aload_0         
	//    5    5:getfield        #31  <Field ModelAdapter modelAdapter>
	//    6    8:aload_1         
	//    7    9:aload_2         
	//    8   10:invokevirtual   #37  <Method void ModelAdapter.deleteForeignKeys(Object, DatabaseWrapper)>
		if(SQLite.delete(modelAdapter.getModelClass()).where(new SQLCondition[] {
	modelAdapter.getPrimaryConditionClause(obj)
}).executeUpdateDelete(databasewrapper) == 0L)
	//*   9   13:aload_0         
	//*  10   14:getfield        #31  <Field ModelAdapter modelAdapter>
	//*  11   17:invokevirtual   #41  <Method Class ModelAdapter.getModelClass()>
	//*  12   20:invokestatic    #46  <Method From SQLite.delete(Class)>
	//*  13   23:iconst_1        
	//*  14   24:anewarray       SQLCondition[]
	//*  15   27:dup             
	//*  16   28:iconst_0        
	//*  17   29:aload_0         
	//*  18   30:getfield        #31  <Field ModelAdapter modelAdapter>
	//*  19   33:aload_1         
	//*  20   34:invokevirtual   #52  <Method ConditionGroup ModelAdapter.getPrimaryConditionClause(Object)>
	//*  21   37:aastore         
	//*  22   38:invokevirtual   #58  <Method Where From.where(SQLCondition[])>
	//*  23   41:aload_2         
	//*  24   42:invokevirtual   #64  <Method long Where.executeUpdateDelete(DatabaseWrapper)>
	//*  25   45:lconst_0        
	//*  26   46:lcmp            
	//*  27   47:ifeq            81
	//*  28   50:iload_3         
	//*  29   51:ifeq            65
	//*  30   54:aload_1         
	//*  31   55:aload_0         
	//*  32   56:getfield        #31  <Field ModelAdapter modelAdapter>
	//*  33   59:getstatic       #70  <Field com.raizlabs.android.dbflow.structure.BaseModel$Action com.raizlabs.android.dbflow.structure.BaseModel$Action.DELETE>
	//*  34   62:invokestatic    #76  <Method void SqlUtils.notifyModelChanged(Object, ModelAdapter, com.raizlabs.android.dbflow.structure.BaseModel$Action)>
	//*  35   65:aload_0         
	//*  36   66:getfield        #31  <Field ModelAdapter modelAdapter>
	//*  37   69:aload_1         
	//*  38   70:iconst_0        
	//*  39   71:invokestatic    #82  <Method Integer Integer.valueOf(int)>
	//*  40   74:invokevirtual   #86  <Method void ModelAdapter.updateAutoIncrement(Object, Number)>
	//*  41   77:aload_0         
	//*  42   78:monitorexit     
	//*  43   79:iload_3         
	//*  44   80:ireturn         
			flag = false;
	//   45   81:iconst_0        
	//   46   82:istore_3        
		if(!flag)
			break MISSING_BLOCK_LABEL_65;
		SqlUtils.notifyModelChanged(obj, modelAdapter, com.raizlabs.android.dbflow.structure.BaseModel.Action.DELETE);
		modelAdapter.updateAutoIncrement(obj, ((Number) (Integer.valueOf(0))));
		this;
		JVM INSTR monitorexit ;
		return flag;
	//*  47   83:goto            50
		obj;
	//   48   86:astore_1        
	//*  49   87:aload_0         
		throw obj;
	//   50   88:monitorexit     
	//   51   89:aload_1         
	//   52   90:athrow          
	}

	public ModelAdapter getModelAdapter()
	{
		return modelAdapter;
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field ModelAdapter modelAdapter>
	//    2    4:areturn         
	}

	protected DatabaseWrapper getWritableDatabase()
	{
		return FlowManager.getDatabaseForTable(modelAdapter.getModelClass()).getWritableDatabase();
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field ModelAdapter modelAdapter>
	//    2    4:invokevirtual   #41  <Method Class ModelAdapter.getModelClass()>
	//    3    7:invokestatic    #96  <Method DatabaseDefinition FlowManager.getDatabaseForTable(Class)>
	//    4   10:invokevirtual   #99  <Method DatabaseWrapper DatabaseDefinition.getWritableDatabase()>
	//    5   13:areturn         
	}

	public long insert(Object obj)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		long l = insert(obj, modelAdapter.getInsertStatement(), getWritableDatabase());
	//    2    2:aload_0         
	//    3    3:aload_1         
	//    4    4:aload_0         
	//    5    5:getfield        #31  <Field ModelAdapter modelAdapter>
	//    6    8:invokevirtual   #105 <Method DatabaseStatement ModelAdapter.getInsertStatement()>
	//    7   11:aload_0         
	//    8   12:invokevirtual   #23  <Method DatabaseWrapper getWritableDatabase()>
	//    9   15:invokevirtual   #108 <Method long insert(Object, DatabaseStatement, DatabaseWrapper)>
	//   10   18:lstore_2        
		this;
	//   11   19:aload_0         
		JVM INSTR monitorexit ;
	//   12   20:monitorexit     
		return l;
	//   13   21:lload_2         
	//   14   22:lreturn         
		obj;
	//   15   23:astore_1        
	//*  16   24:aload_0         
		throw obj;
	//   17   25:monitorexit     
	//   18   26:aload_1         
	//   19   27:athrow          
	}

	public long insert(Object obj, DatabaseStatement databasestatement, DatabaseWrapper databasewrapper)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		long l;
		modelAdapter.saveForeignKeys(obj, databasewrapper);
	//    2    2:aload_0         
	//    3    3:getfield        #31  <Field ModelAdapter modelAdapter>
	//    4    6:aload_1         
	//    5    7:aload_3         
	//    6    8:invokevirtual   #112 <Method void ModelAdapter.saveForeignKeys(Object, DatabaseWrapper)>
		modelAdapter.bindToInsertStatement(databasestatement, obj);
	//    7   11:aload_0         
	//    8   12:getfield        #31  <Field ModelAdapter modelAdapter>
	//    9   15:aload_2         
	//   10   16:aload_1         
	//   11   17:invokevirtual   #116 <Method void ModelAdapter.bindToInsertStatement(DatabaseStatement, Object)>
		l = databasestatement.executeInsert();
	//   12   20:aload_2         
	//   13   21:invokeinterface #122 <Method long DatabaseStatement.executeInsert()>
	//   14   26:lstore          4
		if(l <= -1L)
			break MISSING_BLOCK_LABEL_61;
	//   15   28:lload           4
	//   16   30:ldc2w           #123 <Long -1L>
	//   17   33:lcmp            
	//   18   34:ifle            61
		modelAdapter.updateAutoIncrement(obj, ((Number) (Long.valueOf(l))));
	//   19   37:aload_0         
	//   20   38:getfield        #31  <Field ModelAdapter modelAdapter>
	//   21   41:aload_1         
	//   22   42:lload           4
	//   23   44:invokestatic    #129 <Method Long Long.valueOf(long)>
	//   24   47:invokevirtual   #86  <Method void ModelAdapter.updateAutoIncrement(Object, Number)>
		SqlUtils.notifyModelChanged(obj, modelAdapter, com.raizlabs.android.dbflow.structure.BaseModel.Action.INSERT);
	//   25   50:aload_1         
	//   26   51:aload_0         
	//   27   52:getfield        #31  <Field ModelAdapter modelAdapter>
	//   28   55:getstatic       #132 <Field com.raizlabs.android.dbflow.structure.BaseModel$Action com.raizlabs.android.dbflow.structure.BaseModel$Action.INSERT>
	//   29   58:invokestatic    #76  <Method void SqlUtils.notifyModelChanged(Object, ModelAdapter, com.raizlabs.android.dbflow.structure.BaseModel$Action)>
		this;
	//   30   61:aload_0         
		JVM INSTR monitorexit ;
	//   31   62:monitorexit     
		return l;
	//   32   63:lload           4
	//   33   65:lreturn         
		obj;
	//   34   66:astore_1        
	//*  35   67:aload_0         
		throw obj;
	//   36   68:monitorexit     
	//   37   69:aload_1         
	//   38   70:athrow          
	}

	public long insert(Object obj, DatabaseWrapper databasewrapper)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		DatabaseStatement databasestatement = modelAdapter.getInsertStatement(databasewrapper);
	//    2    2:aload_0         
	//    3    3:getfield        #31  <Field ModelAdapter modelAdapter>
	//    4    6:aload_2         
	//    5    7:invokevirtual   #137 <Method DatabaseStatement ModelAdapter.getInsertStatement(DatabaseWrapper)>
	//    6   10:astore          5
		long l = insert(obj, databasestatement, databasewrapper);
	//    7   12:aload_0         
	//    8   13:aload_1         
	//    9   14:aload           5
	//   10   16:aload_2         
	//   11   17:invokevirtual   #108 <Method long insert(Object, DatabaseStatement, DatabaseWrapper)>
	//   12   20:lstore_3        
		databasestatement.close();
	//   13   21:aload           5
	//   14   23:invokeinterface #140 <Method void DatabaseStatement.close()>
		this;
	//   15   28:aload_0         
		JVM INSTR monitorexit ;
	//   16   29:monitorexit     
		return l;
	//   17   30:lload_3         
	//   18   31:lreturn         
		obj;
	//   19   32:astore_1        
		databasestatement.close();
	//   20   33:aload           5
	//   21   35:invokeinterface #140 <Method void DatabaseStatement.close()>
		throw obj;
	//   22   40:aload_1         
	//   23   41:athrow          
		obj;
	//   24   42:astore_1        
		this;
	//   25   43:aload_0         
		JVM INSTR monitorexit ;
	//   26   44:monitorexit     
		throw obj;
	//   27   45:aload_1         
	//   28   46:athrow          
	}

	public boolean save(Object obj)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		boolean flag = save(obj, getWritableDatabase(), modelAdapter.getInsertStatement(), new ContentValues());
	//    2    2:aload_0         
	//    3    3:aload_1         
	//    4    4:aload_0         
	//    5    5:invokevirtual   #23  <Method DatabaseWrapper getWritableDatabase()>
	//    6    8:aload_0         
	//    7    9:getfield        #31  <Field ModelAdapter modelAdapter>
	//    8   12:invokevirtual   #105 <Method DatabaseStatement ModelAdapter.getInsertStatement()>
	//    9   15:new             #144 <Class ContentValues>
	//   10   18:dup             
	//   11   19:invokespecial   #145 <Method void ContentValues()>
	//   12   22:invokevirtual   #148 <Method boolean save(Object, DatabaseWrapper, DatabaseStatement, ContentValues)>
	//   13   25:istore_2        
		this;
	//   14   26:aload_0         
		JVM INSTR monitorexit ;
	//   15   27:monitorexit     
		return flag;
	//   16   28:iload_2         
	//   17   29:ireturn         
		obj;
	//   18   30:astore_1        
	//*  19   31:aload_0         
		throw obj;
	//   20   32:monitorexit     
	//   21   33:aload_1         
	//   22   34:athrow          
	}

	public boolean save(Object obj, DatabaseWrapper databasewrapper)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		boolean flag = save(obj, databasewrapper, modelAdapter.getInsertStatement(databasewrapper), new ContentValues());
	//    2    2:aload_0         
	//    3    3:aload_1         
	//    4    4:aload_2         
	//    5    5:aload_0         
	//    6    6:getfield        #31  <Field ModelAdapter modelAdapter>
	//    7    9:aload_2         
	//    8   10:invokevirtual   #137 <Method DatabaseStatement ModelAdapter.getInsertStatement(DatabaseWrapper)>
	//    9   13:new             #144 <Class ContentValues>
	//   10   16:dup             
	//   11   17:invokespecial   #145 <Method void ContentValues()>
	//   12   20:invokevirtual   #148 <Method boolean save(Object, DatabaseWrapper, DatabaseStatement, ContentValues)>
	//   13   23:istore_3        
		this;
	//   14   24:aload_0         
		JVM INSTR monitorexit ;
	//   15   25:monitorexit     
		return flag;
	//   16   26:iload_3         
	//   17   27:ireturn         
		obj;
	//   18   28:astore_1        
	//*  19   29:aload_0         
		throw obj;
	//   20   30:monitorexit     
	//   21   31:aload_1         
	//   22   32:athrow          
	}

	public boolean save(Object obj, DatabaseWrapper databasewrapper, DatabaseStatement databasestatement, ContentValues contentvalues)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		boolean flag1 = modelAdapter.exists(obj, databasewrapper);
	//    2    2:aload_0         
	//    3    3:getfield        #31  <Field ModelAdapter modelAdapter>
	//    4    6:aload_1         
	//    5    7:aload_2         
	//    6    8:invokevirtual   #151 <Method boolean ModelAdapter.exists(Object, DatabaseWrapper)>
	//    7   11:istore          6
		boolean flag;
		flag = flag1;
	//    8   13:iload           6
	//    9   15:istore          5
		if(!flag1)
			break MISSING_BLOCK_LABEL_32;
	//   10   17:iload           6
	//   11   19:ifeq            32
		flag = update(obj, databasewrapper, contentvalues);
	//   12   22:aload_0         
	//   13   23:aload_1         
	//   14   24:aload_2         
	//   15   25:aload           4
	//   16   27:invokevirtual   #155 <Method boolean update(Object, DatabaseWrapper, ContentValues)>
	//   17   30:istore          5
		flag1 = flag;
	//   18   32:iload           5
	//   19   34:istore          6
		if(flag)
			break MISSING_BLOCK_LABEL_58;
	//   20   36:iload           5
	//   21   38:ifne            58
		if(insert(obj, databasestatement, databasewrapper) > -1L)
	//*  22   41:aload_0         
	//*  23   42:aload_1         
	//*  24   43:aload_3         
	//*  25   44:aload_2         
	//*  26   45:invokevirtual   #108 <Method long insert(Object, DatabaseStatement, DatabaseWrapper)>
	//*  27   48:ldc2w           #123 <Long -1L>
	//*  28   51:lcmp            
	//*  29   52:ifle            79
			flag1 = true;
	//   30   55:iconst_1        
	//   31   56:istore          6
		else
	//*  32   58:iload           6
	//*  33   60:ifeq            74
	//*  34   63:aload_1         
	//*  35   64:aload_0         
	//*  36   65:getfield        #31  <Field ModelAdapter modelAdapter>
	//*  37   68:getstatic       #158 <Field com.raizlabs.android.dbflow.structure.BaseModel$Action com.raizlabs.android.dbflow.structure.BaseModel$Action.SAVE>
	//*  38   71:invokestatic    #76  <Method void SqlUtils.notifyModelChanged(Object, ModelAdapter, com.raizlabs.android.dbflow.structure.BaseModel$Action)>
	//*  39   74:aload_0         
	//*  40   75:monitorexit     
	//*  41   76:iload           6
	//*  42   78:ireturn         
			flag1 = false;
	//   43   79:iconst_0        
	//   44   80:istore          6
		if(!flag1)
			break MISSING_BLOCK_LABEL_74;
		SqlUtils.notifyModelChanged(obj, modelAdapter, com.raizlabs.android.dbflow.structure.BaseModel.Action.SAVE);
		this;
		JVM INSTR monitorexit ;
		return flag1;
	//*  45   82:goto            58
		obj;
	//   46   85:astore_1        
	//*  47   86:aload_0         
		throw obj;
	//   48   87:monitorexit     
	//   49   88:aload_1         
	//   50   89:athrow          
	}

	public void setModelAdapter(ModelAdapter modeladapter)
	{
		modelAdapter = modeladapter;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #31  <Field ModelAdapter modelAdapter>
	//    3    5:return          
	}

	public boolean update(Object obj)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		boolean flag = update(obj, getWritableDatabase(), new ContentValues());
	//    2    2:aload_0         
	//    3    3:aload_1         
	//    4    4:aload_0         
	//    5    5:invokevirtual   #23  <Method DatabaseWrapper getWritableDatabase()>
	//    6    8:new             #144 <Class ContentValues>
	//    7   11:dup             
	//    8   12:invokespecial   #145 <Method void ContentValues()>
	//    9   15:invokevirtual   #155 <Method boolean update(Object, DatabaseWrapper, ContentValues)>
	//   10   18:istore_2        
		this;
	//   11   19:aload_0         
		JVM INSTR monitorexit ;
	//   12   20:monitorexit     
		return flag;
	//   13   21:iload_2         
	//   14   22:ireturn         
		obj;
	//   15   23:astore_1        
	//*  16   24:aload_0         
		throw obj;
	//   17   25:monitorexit     
	//   18   26:aload_1         
	//   19   27:athrow          
	}

	public boolean update(Object obj, DatabaseWrapper databasewrapper)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		boolean flag = update(obj, databasewrapper, new ContentValues());
	//    2    2:aload_0         
	//    3    3:aload_1         
	//    4    4:aload_2         
	//    5    5:new             #144 <Class ContentValues>
	//    6    8:dup             
	//    7    9:invokespecial   #145 <Method void ContentValues()>
	//    8   12:invokevirtual   #155 <Method boolean update(Object, DatabaseWrapper, ContentValues)>
	//    9   15:istore_3        
		this;
	//   10   16:aload_0         
		JVM INSTR monitorexit ;
	//   11   17:monitorexit     
		return flag;
	//   12   18:iload_3         
	//   13   19:ireturn         
		obj;
	//   14   20:astore_1        
	//*  15   21:aload_0         
		throw obj;
	//   16   22:monitorexit     
	//   17   23:aload_1         
	//   18   24:athrow          
	}

	public boolean update(Object obj, DatabaseWrapper databasewrapper, ContentValues contentvalues)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		modelAdapter.saveForeignKeys(obj, databasewrapper);
	//    2    2:aload_0         
	//    3    3:getfield        #31  <Field ModelAdapter modelAdapter>
	//    4    6:aload_1         
	//    5    7:aload_2         
	//    6    8:invokevirtual   #112 <Method void ModelAdapter.saveForeignKeys(Object, DatabaseWrapper)>
		modelAdapter.bindToContentValues(contentvalues, obj);
	//    7   11:aload_0         
	//    8   12:getfield        #31  <Field ModelAdapter modelAdapter>
	//    9   15:aload_3         
	//   10   16:aload_1         
	//   11   17:invokevirtual   #166 <Method void ModelAdapter.bindToContentValues(ContentValues, Object)>
		boolean flag;
		if(databasewrapper.updateWithOnConflict(modelAdapter.getTableName(), contentvalues, modelAdapter.getPrimaryConditionClause(obj).getQuery(), ((String []) (null)), ConflictAction.getSQLiteDatabaseAlgorithmInt(modelAdapter.getUpdateOnConflictAction())) != 0L)
	//*  12   20:aload_2         
	//*  13   21:aload_0         
	//*  14   22:getfield        #31  <Field ModelAdapter modelAdapter>
	//*  15   25:invokevirtual   #170 <Method String ModelAdapter.getTableName()>
	//*  16   28:aload_3         
	//*  17   29:aload_0         
	//*  18   30:getfield        #31  <Field ModelAdapter modelAdapter>
	//*  19   33:aload_1         
	//*  20   34:invokevirtual   #52  <Method ConditionGroup ModelAdapter.getPrimaryConditionClause(Object)>
	//*  21   37:invokevirtual   #175 <Method String ConditionGroup.getQuery()>
	//*  22   40:aconst_null     
	//*  23   41:aload_0         
	//*  24   42:getfield        #31  <Field ModelAdapter modelAdapter>
	//*  25   45:invokevirtual   #179 <Method ConflictAction ModelAdapter.getUpdateOnConflictAction()>
	//*  26   48:invokestatic    #185 <Method int ConflictAction.getSQLiteDatabaseAlgorithmInt(ConflictAction)>
	//*  27   51:invokeinterface #191 <Method long DatabaseWrapper.updateWithOnConflict(String, ContentValues, String, String[], int)>
	//*  28   56:lconst_0        
	//*  29   57:lcmp            
	//*  30   58:ifeq            85
			flag = true;
	//   31   61:iconst_1        
	//   32   62:istore          4
		else
	//*  33   64:iload           4
	//*  34   66:ifeq            80
	//*  35   69:aload_1         
	//*  36   70:aload_0         
	//*  37   71:getfield        #31  <Field ModelAdapter modelAdapter>
	//*  38   74:getstatic       #194 <Field com.raizlabs.android.dbflow.structure.BaseModel$Action com.raizlabs.android.dbflow.structure.BaseModel$Action.UPDATE>
	//*  39   77:invokestatic    #76  <Method void SqlUtils.notifyModelChanged(Object, ModelAdapter, com.raizlabs.android.dbflow.structure.BaseModel$Action)>
	//*  40   80:aload_0         
	//*  41   81:monitorexit     
	//*  42   82:iload           4
	//*  43   84:ireturn         
			flag = false;
	//   44   85:iconst_0        
	//   45   86:istore          4
		if(!flag)
			break MISSING_BLOCK_LABEL_80;
		SqlUtils.notifyModelChanged(obj, modelAdapter, com.raizlabs.android.dbflow.structure.BaseModel.Action.UPDATE);
		this;
		JVM INSTR monitorexit ;
		return flag;
	//*  46   88:goto            64
		obj;
	//   47   91:astore_1        
	//*  48   92:aload_0         
		throw obj;
	//   49   93:monitorexit     
	//   50   94:aload_1         
	//   51   95:athrow          
	}

	private static final int INSERT_FAILED = -1;
	private ModelAdapter modelAdapter;
}

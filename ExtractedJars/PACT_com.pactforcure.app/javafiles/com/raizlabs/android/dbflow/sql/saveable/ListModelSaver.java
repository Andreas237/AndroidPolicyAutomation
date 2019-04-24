// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.raizlabs.android.dbflow.sql.saveable;

import android.content.ContentValues;
import com.raizlabs.android.dbflow.structure.ModelAdapter;
import com.raizlabs.android.dbflow.structure.database.DatabaseStatement;
import com.raizlabs.android.dbflow.structure.database.DatabaseWrapper;
import java.util.Collection;
import java.util.Iterator;

// Referenced classes of package com.raizlabs.android.dbflow.sql.saveable:
//			ModelSaver

public class ListModelSaver
{

	public ListModelSaver(ModelSaver modelsaver)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
		modelSaver = modelsaver;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #15  <Field ModelSaver modelSaver>
	//    5    9:return          
	}

	public void deleteAll(Collection collection)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		deleteAll(collection, modelSaver.getWritableDatabase());
	//    2    2:aload_0         
	//    3    3:aload_1         
	//    4    4:aload_0         
	//    5    5:getfield        #15  <Field ModelSaver modelSaver>
	//    6    8:invokevirtual   #27  <Method DatabaseWrapper ModelSaver.getWritableDatabase()>
	//    7   11:invokevirtual   #30  <Method void deleteAll(Collection, DatabaseWrapper)>
		this;
	//    8   14:aload_0         
		JVM INSTR monitorexit ;
	//    9   15:monitorexit     
		return;
	//   10   16:return          
		collection;
	//   11   17:astore_1        
	//*  12   18:aload_0         
		throw collection;
	//   13   19:monitorexit     
	//   14   20:aload_1         
	//   15   21:athrow          
	}

	public void deleteAll(Collection collection, DatabaseWrapper databasewrapper)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		boolean flag = collection.isEmpty();
	//    2    2:aload_1         
	//    3    3:invokeinterface #38  <Method boolean Collection.isEmpty()>
	//    4    8:istore_3        
		if(!flag) goto _L2; else goto _L1
	//    5    9:iload_3         
	//    6   10:ifeq            16
_L1:
		this;
	//    7   13:aload_0         
		JVM INSTR monitorexit ;
	//    8   14:monitorexit     
		return;
	//    9   15:return          
_L2:
		collection = ((Collection) (collection.iterator()));
	//   10   16:aload_1         
	//   11   17:invokeinterface #42  <Method Iterator Collection.iterator()>
	//   12   22:astore_1        
		while(((Iterator) (collection)).hasNext()) 
	//*  13   23:aload_1         
	//*  14   24:invokeinterface #47  <Method boolean Iterator.hasNext()>
	//*  15   29:ifeq            13
		{
			Object obj = ((Iterator) (collection)).next();
	//   16   32:aload_1         
	//   17   33:invokeinterface #51  <Method Object Iterator.next()>
	//   18   38:astore          4
			modelSaver.delete(obj, databasewrapper);
	//   19   40:aload_0         
	//   20   41:getfield        #15  <Field ModelSaver modelSaver>
	//   21   44:aload           4
	//   22   46:aload_2         
	//   23   47:invokevirtual   #55  <Method boolean ModelSaver.delete(Object, DatabaseWrapper)>
	//   24   50:pop             
		}
		if(true) goto _L1; else goto _L3
	//   25   51:goto            23
_L3:
		collection;
	//   26   54:astore_1        
	//*  27   55:aload_0         
		throw collection;
	//   28   56:monitorexit     
	//   29   57:aload_1         
	//   30   58:athrow          
	}

	public ModelSaver getModelSaver()
	{
		return modelSaver;
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field ModelSaver modelSaver>
	//    2    4:areturn         
	}

	public void insertAll(Collection collection)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		insertAll(collection, modelSaver.getWritableDatabase());
	//    2    2:aload_0         
	//    3    3:aload_1         
	//    4    4:aload_0         
	//    5    5:getfield        #15  <Field ModelSaver modelSaver>
	//    6    8:invokevirtual   #27  <Method DatabaseWrapper ModelSaver.getWritableDatabase()>
	//    7   11:invokevirtual   #62  <Method void insertAll(Collection, DatabaseWrapper)>
		this;
	//    8   14:aload_0         
		JVM INSTR monitorexit ;
	//    9   15:monitorexit     
		return;
	//   10   16:return          
		collection;
	//   11   17:astore_1        
	//*  12   18:aload_0         
		throw collection;
	//   13   19:monitorexit     
	//   14   20:aload_1         
	//   15   21:athrow          
	}

	public void insertAll(Collection collection, DatabaseWrapper databasewrapper)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		boolean flag = collection.isEmpty();
	//    2    2:aload_1         
	//    3    3:invokeinterface #38  <Method boolean Collection.isEmpty()>
	//    4    8:istore_3        
		if(!flag) goto _L2; else goto _L1
	//    5    9:iload_3         
	//    6   10:ifeq            16
_L1:
		this;
	//    7   13:aload_0         
		JVM INSTR monitorexit ;
	//    8   14:monitorexit     
		return;
	//    9   15:return          
_L2:
		DatabaseStatement databasestatement = modelSaver.getModelAdapter().getInsertStatement(databasewrapper);
	//   10   16:aload_0         
	//   11   17:getfield        #15  <Field ModelSaver modelSaver>
	//   12   20:invokevirtual   #66  <Method ModelAdapter ModelSaver.getModelAdapter()>
	//   13   23:aload_2         
	//   14   24:invokevirtual   #72  <Method DatabaseStatement ModelAdapter.getInsertStatement(DatabaseWrapper)>
	//   15   27:astore          4
		Object obj;
		for(collection = ((Collection) (collection.iterator())); ((Iterator) (collection)).hasNext(); modelSaver.insert(obj, databasestatement, databasewrapper))
	//*  16   29:aload_1         
	//*  17   30:invokeinterface #42  <Method Iterator Collection.iterator()>
	//*  18   35:astore_1        
	//*  19   36:aload_1         
	//*  20   37:invokeinterface #47  <Method boolean Iterator.hasNext()>
	//*  21   42:ifeq            84
			obj = ((Iterator) (collection)).next();
	//   22   45:aload_1         
	//   23   46:invokeinterface #51  <Method Object Iterator.next()>
	//   24   51:astore          5

	//   25   53:aload_0         
	//   26   54:getfield        #15  <Field ModelSaver modelSaver>
	//   27   57:aload           5
	//   28   59:aload           4
	//   29   61:aload_2         
	//   30   62:invokevirtual   #76  <Method long ModelSaver.insert(Object, DatabaseStatement, DatabaseWrapper)>
	//   31   65:pop2            
		break MISSING_BLOCK_LABEL_84;
	//   32   66:goto            36
		collection;
	//   33   69:astore_1        
		databasestatement.close();
	//   34   70:aload           4
	//   35   72:invokeinterface #81  <Method void DatabaseStatement.close()>
		throw collection;
	//   36   77:aload_1         
	//   37   78:athrow          
		collection;
	//   38   79:astore_1        
		this;
	//   39   80:aload_0         
		JVM INSTR monitorexit ;
	//   40   81:monitorexit     
		throw collection;
	//   41   82:aload_1         
	//   42   83:athrow          
		databasestatement.close();
	//   43   84:aload           4
	//   44   86:invokeinterface #81  <Method void DatabaseStatement.close()>
		  goto _L1
	//*  45   91:goto            13
	}

	public void saveAll(Collection collection)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		saveAll(collection, modelSaver.getWritableDatabase());
	//    2    2:aload_0         
	//    3    3:aload_1         
	//    4    4:aload_0         
	//    5    5:getfield        #15  <Field ModelSaver modelSaver>
	//    6    8:invokevirtual   #27  <Method DatabaseWrapper ModelSaver.getWritableDatabase()>
	//    7   11:invokevirtual   #84  <Method void saveAll(Collection, DatabaseWrapper)>
		this;
	//    8   14:aload_0         
		JVM INSTR monitorexit ;
	//    9   15:monitorexit     
		return;
	//   10   16:return          
		collection;
	//   11   17:astore_1        
	//*  12   18:aload_0         
		throw collection;
	//   13   19:monitorexit     
	//   14   20:aload_1         
	//   15   21:athrow          
	}

	public void saveAll(Collection collection, DatabaseWrapper databasewrapper)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		boolean flag = collection.isEmpty();
	//    2    2:aload_1         
	//    3    3:invokeinterface #38  <Method boolean Collection.isEmpty()>
	//    4    8:istore_3        
		if(!flag) goto _L2; else goto _L1
	//    5    9:iload_3         
	//    6   10:ifeq            16
_L1:
		this;
	//    7   13:aload_0         
		JVM INSTR monitorexit ;
	//    8   14:monitorexit     
		return;
	//    9   15:return          
_L2:
		DatabaseStatement databasestatement;
		ContentValues contentvalues;
		databasestatement = modelSaver.getModelAdapter().getInsertStatement(databasewrapper);
	//   10   16:aload_0         
	//   11   17:getfield        #15  <Field ModelSaver modelSaver>
	//   12   20:invokevirtual   #66  <Method ModelAdapter ModelSaver.getModelAdapter()>
	//   13   23:aload_2         
	//   14   24:invokevirtual   #72  <Method DatabaseStatement ModelAdapter.getInsertStatement(DatabaseWrapper)>
	//   15   27:astore          4
		contentvalues = new ContentValues();
	//   16   29:new             #86  <Class ContentValues>
	//   17   32:dup             
	//   18   33:invokespecial   #87  <Method void ContentValues()>
	//   19   36:astore          5
		Object obj;
		for(collection = ((Collection) (collection.iterator())); ((Iterator) (collection)).hasNext(); modelSaver.save(obj, databasewrapper, databasestatement, contentvalues))
	//*  20   38:aload_1         
	//*  21   39:invokeinterface #42  <Method Iterator Collection.iterator()>
	//*  22   44:astore_1        
	//*  23   45:aload_1         
	//*  24   46:invokeinterface #47  <Method boolean Iterator.hasNext()>
	//*  25   51:ifeq            95
			obj = ((Iterator) (collection)).next();
	//   26   54:aload_1         
	//   27   55:invokeinterface #51  <Method Object Iterator.next()>
	//   28   60:astore          6

	//   29   62:aload_0         
	//   30   63:getfield        #15  <Field ModelSaver modelSaver>
	//   31   66:aload           6
	//   32   68:aload_2         
	//   33   69:aload           4
	//   34   71:aload           5
	//   35   73:invokevirtual   #91  <Method boolean ModelSaver.save(Object, DatabaseWrapper, DatabaseStatement, ContentValues)>
	//   36   76:pop             
		break MISSING_BLOCK_LABEL_95;
	//   37   77:goto            45
		collection;
	//   38   80:astore_1        
		databasestatement.close();
	//   39   81:aload           4
	//   40   83:invokeinterface #81  <Method void DatabaseStatement.close()>
		throw collection;
	//   41   88:aload_1         
	//   42   89:athrow          
		collection;
	//   43   90:astore_1        
		this;
	//   44   91:aload_0         
		JVM INSTR monitorexit ;
	//   45   92:monitorexit     
		throw collection;
	//   46   93:aload_1         
	//   47   94:athrow          
		databasestatement.close();
	//   48   95:aload           4
	//   49   97:invokeinterface #81  <Method void DatabaseStatement.close()>
		  goto _L1
	//*  50  102:goto            13
	}

	public void updateAll(Collection collection)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		saveAll(collection, modelSaver.getWritableDatabase());
	//    2    2:aload_0         
	//    3    3:aload_1         
	//    4    4:aload_0         
	//    5    5:getfield        #15  <Field ModelSaver modelSaver>
	//    6    8:invokevirtual   #27  <Method DatabaseWrapper ModelSaver.getWritableDatabase()>
	//    7   11:invokevirtual   #84  <Method void saveAll(Collection, DatabaseWrapper)>
		this;
	//    8   14:aload_0         
		JVM INSTR monitorexit ;
	//    9   15:monitorexit     
		return;
	//   10   16:return          
		collection;
	//   11   17:astore_1        
	//*  12   18:aload_0         
		throw collection;
	//   13   19:monitorexit     
	//   14   20:aload_1         
	//   15   21:athrow          
	}

	public void updateAll(Collection collection, DatabaseWrapper databasewrapper)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		boolean flag = collection.isEmpty();
	//    2    2:aload_1         
	//    3    3:invokeinterface #38  <Method boolean Collection.isEmpty()>
	//    4    8:istore_3        
		if(!flag) goto _L2; else goto _L1
	//    5    9:iload_3         
	//    6   10:ifeq            16
_L1:
		this;
	//    7   13:aload_0         
		JVM INSTR monitorexit ;
	//    8   14:monitorexit     
		return;
	//    9   15:return          
_L2:
		ContentValues contentvalues = new ContentValues();
	//   10   16:new             #86  <Class ContentValues>
	//   11   19:dup             
	//   12   20:invokespecial   #87  <Method void ContentValues()>
	//   13   23:astore          4
		collection = ((Collection) (collection.iterator()));
	//   14   25:aload_1         
	//   15   26:invokeinterface #42  <Method Iterator Collection.iterator()>
	//   16   31:astore_1        
		while(((Iterator) (collection)).hasNext()) 
	//*  17   32:aload_1         
	//*  18   33:invokeinterface #47  <Method boolean Iterator.hasNext()>
	//*  19   38:ifeq            13
		{
			Object obj = ((Iterator) (collection)).next();
	//   20   41:aload_1         
	//   21   42:invokeinterface #51  <Method Object Iterator.next()>
	//   22   47:astore          5
			modelSaver.update(obj, databasewrapper, contentvalues);
	//   23   49:aload_0         
	//   24   50:getfield        #15  <Field ModelSaver modelSaver>
	//   25   53:aload           5
	//   26   55:aload_2         
	//   27   56:aload           4
	//   28   58:invokevirtual   #96  <Method boolean ModelSaver.update(Object, DatabaseWrapper, ContentValues)>
	//   29   61:pop             
		}
		if(true) goto _L1; else goto _L3
	//   30   62:goto            32
_L3:
		collection;
	//   31   65:astore_1        
	//*  32   66:aload_0         
		throw collection;
	//   33   67:monitorexit     
	//   34   68:aload_1         
	//   35   69:athrow          
	}

	private final ModelSaver modelSaver;
}

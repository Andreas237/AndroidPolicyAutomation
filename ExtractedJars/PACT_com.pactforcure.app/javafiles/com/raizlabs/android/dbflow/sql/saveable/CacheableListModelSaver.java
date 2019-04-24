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
//			ListModelSaver, ModelSaver

public class CacheableListModelSaver extends ListModelSaver
{

	public CacheableListModelSaver(ModelSaver modelsaver)
	{
		super(modelsaver);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #9   <Method void ListModelSaver(ModelSaver)>
	//    3    5:return          
	}

	public void insertAll(Collection collection, DatabaseWrapper databasewrapper)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		boolean flag = collection.isEmpty();
	//    2    2:aload_1         
	//    3    3:invokeinterface #21  <Method boolean Collection.isEmpty()>
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
		DatabaseStatement databasestatement = getModelSaver().getModelAdapter().getInsertStatement(databasewrapper);
	//   10   16:aload_0         
	//   11   17:invokevirtual   #25  <Method ModelSaver getModelSaver()>
	//   12   20:invokevirtual   #31  <Method ModelAdapter ModelSaver.getModelAdapter()>
	//   13   23:aload_2         
	//   14   24:invokevirtual   #37  <Method DatabaseStatement ModelAdapter.getInsertStatement(DatabaseWrapper)>
	//   15   27:astore          4
		collection = ((Collection) (collection.iterator()));
	//   16   29:aload_1         
	//   17   30:invokeinterface #41  <Method Iterator Collection.iterator()>
	//   18   35:astore_1        
		do
		{
			if(!((Iterator) (collection)).hasNext())
				break;
	//   19   36:aload_1         
	//   20   37:invokeinterface #46  <Method boolean Iterator.hasNext()>
	//   21   42:ifeq            100
			Object obj = ((Iterator) (collection)).next();
	//   22   45:aload_1         
	//   23   46:invokeinterface #50  <Method Object Iterator.next()>
	//   24   51:astore          5
			if(getModelSaver().insert(obj, databasestatement, databasewrapper) > 0L)
	//*  25   53:aload_0         
	//*  26   54:invokevirtual   #25  <Method ModelSaver getModelSaver()>
	//*  27   57:aload           5
	//*  28   59:aload           4
	//*  29   61:aload_2         
	//*  30   62:invokevirtual   #54  <Method long ModelSaver.insert(Object, DatabaseStatement, DatabaseWrapper)>
	//*  31   65:lconst_0        
	//*  32   66:lcmp            
	//*  33   67:ifle            36
				getModelSaver().getModelAdapter().storeModelInCache(obj);
	//   34   70:aload_0         
	//   35   71:invokevirtual   #25  <Method ModelSaver getModelSaver()>
	//   36   74:invokevirtual   #31  <Method ModelAdapter ModelSaver.getModelAdapter()>
	//   37   77:aload           5
	//   38   79:invokevirtual   #58  <Method void ModelAdapter.storeModelInCache(Object)>
		} while(true);
	//   39   82:goto            36
		break MISSING_BLOCK_LABEL_100;
		collection;
	//   40   85:astore_1        
		databasestatement.close();
	//   41   86:aload           4
	//   42   88:invokeinterface #64  <Method void DatabaseStatement.close()>
		throw collection;
	//   43   93:aload_1         
	//   44   94:athrow          
		collection;
	//   45   95:astore_1        
		this;
	//   46   96:aload_0         
		JVM INSTR monitorexit ;
	//   47   97:monitorexit     
		throw collection;
	//   48   98:aload_1         
	//   49   99:athrow          
		databasestatement.close();
	//   50  100:aload           4
	//   51  102:invokeinterface #64  <Method void DatabaseStatement.close()>
		  goto _L1
	//*  52  107:goto            13
	}

	public void saveAll(Collection collection, DatabaseWrapper databasewrapper)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		boolean flag = collection.isEmpty();
	//    2    2:aload_1         
	//    3    3:invokeinterface #21  <Method boolean Collection.isEmpty()>
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
		databasestatement = getModelSaver().getModelAdapter().getInsertStatement(databasewrapper);
	//   10   16:aload_0         
	//   11   17:invokevirtual   #25  <Method ModelSaver getModelSaver()>
	//   12   20:invokevirtual   #31  <Method ModelAdapter ModelSaver.getModelAdapter()>
	//   13   23:aload_2         
	//   14   24:invokevirtual   #37  <Method DatabaseStatement ModelAdapter.getInsertStatement(DatabaseWrapper)>
	//   15   27:astore          4
		contentvalues = new ContentValues();
	//   16   29:new             #69  <Class ContentValues>
	//   17   32:dup             
	//   18   33:invokespecial   #71  <Method void ContentValues()>
	//   19   36:astore          5
		collection = ((Collection) (collection.iterator()));
	//   20   38:aload_1         
	//   21   39:invokeinterface #41  <Method Iterator Collection.iterator()>
	//   22   44:astore_1        
		do
		{
			if(!((Iterator) (collection)).hasNext())
				break;
	//   23   45:aload_1         
	//   24   46:invokeinterface #46  <Method boolean Iterator.hasNext()>
	//   25   51:ifeq            109
			Object obj = ((Iterator) (collection)).next();
	//   26   54:aload_1         
	//   27   55:invokeinterface #50  <Method Object Iterator.next()>
	//   28   60:astore          6
			if(getModelSaver().save(obj, databasewrapper, databasestatement, contentvalues))
	//*  29   62:aload_0         
	//*  30   63:invokevirtual   #25  <Method ModelSaver getModelSaver()>
	//*  31   66:aload           6
	//*  32   68:aload_2         
	//*  33   69:aload           4
	//*  34   71:aload           5
	//*  35   73:invokevirtual   #75  <Method boolean ModelSaver.save(Object, DatabaseWrapper, DatabaseStatement, ContentValues)>
	//*  36   76:ifeq            45
				getModelSaver().getModelAdapter().storeModelInCache(obj);
	//   37   79:aload_0         
	//   38   80:invokevirtual   #25  <Method ModelSaver getModelSaver()>
	//   39   83:invokevirtual   #31  <Method ModelAdapter ModelSaver.getModelAdapter()>
	//   40   86:aload           6
	//   41   88:invokevirtual   #58  <Method void ModelAdapter.storeModelInCache(Object)>
		} while(true);
	//   42   91:goto            45
		break MISSING_BLOCK_LABEL_109;
		collection;
	//   43   94:astore_1        
		databasestatement.close();
	//   44   95:aload           4
	//   45   97:invokeinterface #64  <Method void DatabaseStatement.close()>
		throw collection;
	//   46  102:aload_1         
	//   47  103:athrow          
		collection;
	//   48  104:astore_1        
		this;
	//   49  105:aload_0         
		JVM INSTR monitorexit ;
	//   50  106:monitorexit     
		throw collection;
	//   51  107:aload_1         
	//   52  108:athrow          
		databasestatement.close();
	//   53  109:aload           4
	//   54  111:invokeinterface #64  <Method void DatabaseStatement.close()>
		  goto _L1
	//*  55  116:goto            13
	}

	public void updateAll(Collection collection, DatabaseWrapper databasewrapper)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		boolean flag = collection.isEmpty();
	//    2    2:aload_1         
	//    3    3:invokeinterface #21  <Method boolean Collection.isEmpty()>
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
	//   10   16:new             #69  <Class ContentValues>
	//   11   19:dup             
	//   12   20:invokespecial   #71  <Method void ContentValues()>
	//   13   23:astore          4
		collection = ((Collection) (collection.iterator()));
	//   14   25:aload_1         
	//   15   26:invokeinterface #41  <Method Iterator Collection.iterator()>
	//   16   31:astore_1        
		while(((Iterator) (collection)).hasNext()) 
	//*  17   32:aload_1         
	//*  18   33:invokeinterface #46  <Method boolean Iterator.hasNext()>
	//*  19   38:ifeq            13
		{
			Object obj = ((Iterator) (collection)).next();
	//   20   41:aload_1         
	//   21   42:invokeinterface #50  <Method Object Iterator.next()>
	//   22   47:astore          5
			if(getModelSaver().update(obj, databasewrapper, contentvalues))
	//*  23   49:aload_0         
	//*  24   50:invokevirtual   #25  <Method ModelSaver getModelSaver()>
	//*  25   53:aload           5
	//*  26   55:aload_2         
	//*  27   56:aload           4
	//*  28   58:invokevirtual   #80  <Method boolean ModelSaver.update(Object, DatabaseWrapper, ContentValues)>
	//*  29   61:ifeq            32
				getModelSaver().getModelAdapter().storeModelInCache(obj);
	//   30   64:aload_0         
	//   31   65:invokevirtual   #25  <Method ModelSaver getModelSaver()>
	//   32   68:invokevirtual   #31  <Method ModelAdapter ModelSaver.getModelAdapter()>
	//   33   71:aload           5
	//   34   73:invokevirtual   #58  <Method void ModelAdapter.storeModelInCache(Object)>
		}
		if(true) goto _L1; else goto _L3
	//   35   76:goto            32
_L3:
		collection;
	//   36   79:astore_1        
	//*  37   80:aload_0         
		throw collection;
	//   38   81:monitorexit     
	//   39   82:aload_1         
	//   40   83:athrow          
	}
}

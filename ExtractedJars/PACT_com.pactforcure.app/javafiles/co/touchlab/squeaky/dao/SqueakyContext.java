// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package co.touchlab.squeaky.dao;

import co.touchlab.squeaky.db.SQLiteDatabase;
import co.touchlab.squeaky.db.SQLiteOpenHelper;
import co.touchlab.squeaky.field.FieldType;
import co.touchlab.squeaky.table.GeneratedTableMapper;
import co.touchlab.squeaky.table.TableInfo;
import java.sql.SQLException;
import java.util.*;

// Referenced classes of package co.touchlab.squeaky.dao:
//			Dao, ModelDao

public class SqueakyContext
{

	public SqueakyContext(SQLiteOpenHelper sqliteopenhelper)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #18  <Class HashMap>
	//    4    8:dup             
	//    5    9:invokespecial   #19  <Method void HashMap()>
	//    6   12:putfield        #21  <Field Map daoMap>
	//    7   15:aload_0         
	//    8   16:new             #18  <Class HashMap>
	//    9   19:dup             
	//   10   20:invokespecial   #19  <Method void HashMap()>
	//   11   23:putfield        #23  <Field Map generatedTableMapperMap>
		helper = sqliteopenhelper;
	//   12   26:aload_0         
	//   13   27:aload_1         
	//   14   28:putfield        #25  <Field SQLiteOpenHelper helper>
	//   15   31:return          
	}

	public static GeneratedTableMapper loadGeneratedTableMapper(Class class1)
	{
		try
		{
			class1 = ((Class) ((GeneratedTableMapper)Class.forName((new StringBuilder()).append(class1.getName()).append("$$Configuration").toString()).newInstance()));
	//    0    0:new             #32  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #33  <Method void StringBuilder()>
	//    3    7:aload_0         
	//    4    8:invokevirtual   #39  <Method String Class.getName()>
	//    5   11:invokevirtual   #43  <Method StringBuilder StringBuilder.append(String)>
	//    6   14:ldc1            #45  <String "$$Configuration">
	//    7   16:invokevirtual   #43  <Method StringBuilder StringBuilder.append(String)>
	//    8   19:invokevirtual   #48  <Method String StringBuilder.toString()>
	//    9   22:invokestatic    #52  <Method Class Class.forName(String)>
	//   10   25:invokevirtual   #56  <Method Object Class.newInstance()>
	//   11   28:checkcast       #58  <Class GeneratedTableMapper>
	//   12   31:astore_0        
		}
	//*  13   32:aload_0         
	//*  14   33:areturn         
		// Misplaced declaration of an exception variable
		catch(Class class1)
	//*  15   34:astore_0        
		{
			throw new RuntimeException(((Throwable) (class1)));
	//   16   35:new             #60  <Class RuntimeException>
	//   17   38:dup             
	//   18   39:aload_0         
	//   19   40:invokespecial   #63  <Method void RuntimeException(Throwable)>
	//   20   43:athrow          
		}
		return ((GeneratedTableMapper) (class1));
	}

	public void close()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		for(Iterator iterator = daoMap.values().iterator(); iterator.hasNext(); ((ModelDao)(Dao)iterator.next()).cleanUp());
	//    2    2:aload_0         
	//    3    3:getfield        #21  <Field Map daoMap>
	//    4    6:invokeinterface #70  <Method Collection Map.values()>
	//    5   11:invokeinterface #76  <Method Iterator Collection.iterator()>
	//    6   16:astore_1        
	//    7   17:aload_1         
	//    8   18:invokeinterface #82  <Method boolean Iterator.hasNext()>
	//    9   23:ifeq            49
	//   10   26:aload_1         
	//   11   27:invokeinterface #85  <Method Object Iterator.next()>
	//   12   32:checkcast       #87  <Class Dao>
	//   13   35:checkcast       #89  <Class ModelDao>
	//   14   38:invokevirtual   #92  <Method void ModelDao.cleanUp()>
		break MISSING_BLOCK_LABEL_49;
	//   15   41:goto            17
		Exception exception;
		exception;
	//   16   44:astore_1        
	//*  17   45:aload_0         
		throw exception;
	//   18   46:monitorexit     
	//   19   47:aload_1         
	//   20   48:athrow          
		daoMap.clear();
	//   21   49:aload_0         
	//   22   50:getfield        #21  <Field Map daoMap>
	//   23   53:invokeinterface #95  <Method void Map.clear()>
		this;
	//   24   58:aload_0         
		JVM INSTR monitorexit ;
	//   25   59:monitorexit     
	//   26   60:return          
	}

	public FieldType findFieldType(Class class1, String s)
		throws SQLException
	{
		class1 = ((Class) (getGeneratedTableMapper(class1).getTableConfig().getFieldTypes()));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #102 <Method GeneratedTableMapper getGeneratedTableMapper(Class)>
	//    3    5:invokeinterface #106 <Method TableInfo GeneratedTableMapper.getTableConfig()>
	//    4   10:invokevirtual   #112 <Method FieldType[] TableInfo.getFieldTypes()>
	//    5   13:astore_1        
		int j = class1.length;
	//    6   14:aload_1         
	//    7   15:arraylength     
	//    8   16:istore          4
		for(int i = 0; i < j; i++)
	//*   9   18:iconst_0        
	//*  10   19:istore_3        
	//*  11   20:iload_3         
	//*  12   21:iload           4
	//*  13   23:icmpge          65
		{
			FieldType fieldtype = ((FieldType) (class1[i]));
	//   14   26:aload_1         
	//   15   27:iload_3         
	//   16   28:aaload          
	//   17   29:astore          5
			if(fieldtype.getFieldName().equalsIgnoreCase(s) || fieldtype.getColumnName().equalsIgnoreCase(s))
	//*  18   31:aload           5
	//*  19   33:invokevirtual   #117 <Method String FieldType.getFieldName()>
	//*  20   36:aload_2         
	//*  21   37:invokevirtual   #123 <Method boolean String.equalsIgnoreCase(String)>
	//*  22   40:ifne            55
	//*  23   43:aload           5
	//*  24   45:invokevirtual   #126 <Method String FieldType.getColumnName()>
	//*  25   48:aload_2         
	//*  26   49:invokevirtual   #123 <Method boolean String.equalsIgnoreCase(String)>
	//*  27   52:ifeq            58
				return fieldtype;
	//   28   55:aload           5
	//   29   57:areturn         
		}

	//   30   58:iload_3         
	//   31   59:iconst_1        
	//   32   60:iadd            
	//   33   61:istore_3        
	//*  34   62:goto            20
		throw new SQLException((new StringBuilder()).append("No field type found for ").append(s).toString());
	//   35   65:new             #99  <Class SQLException>
	//   36   68:dup             
	//   37   69:new             #32  <Class StringBuilder>
	//   38   72:dup             
	//   39   73:invokespecial   #33  <Method void StringBuilder()>
	//   40   76:ldc1            #128 <String "No field type found for ">
	//   41   78:invokevirtual   #43  <Method StringBuilder StringBuilder.append(String)>
	//   42   81:aload_2         
	//   43   82:invokevirtual   #43  <Method StringBuilder StringBuilder.append(String)>
	//   44   85:invokevirtual   #48  <Method String StringBuilder.toString()>
	//   45   88:invokespecial   #131 <Method void SQLException(String)>
	//   46   91:athrow          
	}

	public Dao getDao(Class class1)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		ModelDao modeldao1 = (ModelDao)daoMap.get(((Object) (class1)));
	//    2    2:aload_0         
	//    3    3:getfield        #21  <Field Map daoMap>
	//    4    6:aload_1         
	//    5    7:invokeinterface #138 <Method Object Map.get(Object)>
	//    6   12:checkcast       #89  <Class ModelDao>
	//    7   15:astore_3        
		ModelDao modeldao;
		modeldao = modeldao1;
	//    8   16:aload_3         
	//    9   17:astore_2        
		if(modeldao1 != null)
			break MISSING_BLOCK_LABEL_49;
	//   10   18:aload_3         
	//   11   19:ifnonnull       49
		modeldao = new ModelDao(this, class1, getGeneratedTableMapper(class1));
	//   12   22:new             #89  <Class ModelDao>
	//   13   25:dup             
	//   14   26:aload_0         
	//   15   27:aload_1         
	//   16   28:aload_0         
	//   17   29:aload_1         
	//   18   30:invokevirtual   #102 <Method GeneratedTableMapper getGeneratedTableMapper(Class)>
	//   19   33:invokespecial   #141 <Method void ModelDao(SqueakyContext, Class, GeneratedTableMapper)>
	//   20   36:astore_2        
		daoMap.put(((Object) (class1)), ((Object) (modeldao)));
	//   21   37:aload_0         
	//   22   38:getfield        #21  <Field Map daoMap>
	//   23   41:aload_1         
	//   24   42:aload_2         
	//   25   43:invokeinterface #145 <Method Object Map.put(Object, Object)>
	//   26   48:pop             
		this;
	//   27   49:aload_0         
		JVM INSTR monitorexit ;
	//   28   50:monitorexit     
		return ((Dao) (modeldao));
	//   29   51:aload_2         
	//   30   52:areturn         
		class1;
	//   31   53:astore_1        
	//*  32   54:aload_0         
		throw class1;
	//   33   55:monitorexit     
	//   34   56:aload_1         
	//   35   57:athrow          
	}

	public SQLiteDatabase getDatabase()
	{
		return helper.getWrappedDatabase();
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field SQLiteOpenHelper helper>
	//    2    4:invokeinterface #152 <Method SQLiteDatabase SQLiteOpenHelper.getWrappedDatabase()>
	//    3    9:areturn         
	}

	public GeneratedTableMapper getGeneratedTableMapper(Class class1)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		GeneratedTableMapper generatedtablemapper1 = (GeneratedTableMapper)generatedTableMapperMap.get(((Object) (class1)));
	//    2    2:aload_0         
	//    3    3:getfield        #23  <Field Map generatedTableMapperMap>
	//    4    6:aload_1         
	//    5    7:invokeinterface #138 <Method Object Map.get(Object)>
	//    6   12:checkcast       #58  <Class GeneratedTableMapper>
	//    7   15:astore_3        
		GeneratedTableMapper generatedtablemapper;
		generatedtablemapper = generatedtablemapper1;
	//    8   16:aload_3         
	//    9   17:astore_2        
		if(generatedtablemapper1 != null)
			break MISSING_BLOCK_LABEL_39;
	//   10   18:aload_3         
	//   11   19:ifnonnull       39
		generatedtablemapper = loadGeneratedTableMapper(class1);
	//   12   22:aload_1         
	//   13   23:invokestatic    #154 <Method GeneratedTableMapper loadGeneratedTableMapper(Class)>
	//   14   26:astore_2        
		generatedTableMapperMap.put(((Object) (class1)), ((Object) (generatedtablemapper)));
	//   15   27:aload_0         
	//   16   28:getfield        #23  <Field Map generatedTableMapperMap>
	//   17   31:aload_1         
	//   18   32:aload_2         
	//   19   33:invokeinterface #145 <Method Object Map.put(Object, Object)>
	//   20   38:pop             
		this;
	//   21   39:aload_0         
		JVM INSTR monitorexit ;
	//   22   40:monitorexit     
		return generatedtablemapper;
	//   23   41:aload_2         
	//   24   42:areturn         
		class1;
	//   25   43:astore_1        
	//*  26   44:aload_0         
		throw class1;
	//   27   45:monitorexit     
	//   28   46:aload_1         
	//   29   47:athrow          
	}

	private final Map daoMap = new HashMap();
	private final Map generatedTableMapperMap = new HashMap();
	private final SQLiteOpenHelper helper;
}

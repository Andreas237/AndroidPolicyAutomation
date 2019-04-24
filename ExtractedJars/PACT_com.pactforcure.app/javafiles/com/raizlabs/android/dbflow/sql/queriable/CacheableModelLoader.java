// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.raizlabs.android.dbflow.sql.queriable;

import android.database.Cursor;
import com.raizlabs.android.dbflow.structure.ModelAdapter;
import com.raizlabs.android.dbflow.structure.cache.ModelCache;

// Referenced classes of package com.raizlabs.android.dbflow.sql.queriable:
//			SingleModelLoader

public class CacheableModelLoader extends SingleModelLoader
{

	public CacheableModelLoader(Class class1)
	{
		super(class1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #15  <Method void SingleModelLoader(Class)>
	//    3    5:return          
	}

	public Object convertToData(Cursor cursor, Object obj, boolean flag)
	{
		if(!flag || cursor.moveToFirst())
	//*   0    0:iload_3         
	//*   1    1:ifeq            13
	//*   2    4:aload_1         
	//*   3    5:invokeinterface #28  <Method boolean Cursor.moveToFirst()>
	//*   4   10:ifeq            113
		{
			Object aobj[] = getModelAdapter().getCachingColumnValuesFromCursor(new Object[getModelAdapter().getCachingColumns().length], cursor);
	//    5   13:aload_0         
	//    6   14:invokevirtual   #32  <Method ModelAdapter getModelAdapter()>
	//    7   17:aload_0         
	//    8   18:invokevirtual   #32  <Method ModelAdapter getModelAdapter()>
	//    9   21:invokevirtual   #38  <Method String[] ModelAdapter.getCachingColumns()>
	//   10   24:arraylength     
	//   11   25:anewarray       Object[]
	//   12   28:aload_1         
	//   13   29:invokevirtual   #44  <Method Object[] ModelAdapter.getCachingColumnValuesFromCursor(Object[], Cursor)>
	//   14   32:astore          4
			Object obj1 = getModelCache().get(getModelAdapter().getCachingId(aobj));
	//   15   34:aload_0         
	//   16   35:invokevirtual   #48  <Method ModelCache getModelCache()>
	//   17   38:aload_0         
	//   18   39:invokevirtual   #32  <Method ModelAdapter getModelAdapter()>
	//   19   42:aload           4
	//   20   44:invokevirtual   #52  <Method Object ModelAdapter.getCachingId(Object[])>
	//   21   47:invokevirtual   #58  <Method Object ModelCache.get(Object)>
	//   22   50:astore          5
			if(obj1 == null)
	//*  23   52:aload           5
	//*  24   54:ifnonnull       100
			{
				if(obj == null)
	//*  25   57:aload_2         
	//*  26   58:ifnonnull       97
					obj = getModelAdapter().newInstance();
	//   27   61:aload_0         
	//   28   62:invokevirtual   #32  <Method ModelAdapter getModelAdapter()>
	//   29   65:invokevirtual   #62  <Method Object ModelAdapter.newInstance()>
	//   30   68:astore_2        
				getModelAdapter().loadFromCursor(cursor, obj);
	//   31   69:aload_0         
	//   32   70:invokevirtual   #32  <Method ModelAdapter getModelAdapter()>
	//   33   73:aload_1         
	//   34   74:aload_2         
	//   35   75:invokevirtual   #66  <Method void ModelAdapter.loadFromCursor(Cursor, Object)>
				getModelCache().addModel(getModelAdapter().getCachingId(aobj), obj);
	//   36   78:aload_0         
	//   37   79:invokevirtual   #48  <Method ModelCache getModelCache()>
	//   38   82:aload_0         
	//   39   83:invokevirtual   #32  <Method ModelAdapter getModelAdapter()>
	//   40   86:aload           4
	//   41   88:invokevirtual   #52  <Method Object ModelAdapter.getCachingId(Object[])>
	//   42   91:aload_2         
	//   43   92:invokevirtual   #70  <Method void ModelCache.addModel(Object, Object)>
				return obj;
	//   44   95:aload_2         
	//   45   96:areturn         
			} else
	//*  46   97:goto            69
			{
				getModelAdapter().reloadRelationships(obj1, cursor);
	//   47  100:aload_0         
	//   48  101:invokevirtual   #32  <Method ModelAdapter getModelAdapter()>
	//   49  104:aload           5
	//   50  106:aload_1         
	//   51  107:invokevirtual   #74  <Method void ModelAdapter.reloadRelationships(Object, Cursor)>
				return obj1;
	//   52  110:aload           5
	//   53  112:areturn         
			}
		} else
		{
			return ((Object) (null));
	//   54  113:aconst_null     
	//   55  114:areturn         
		}
	}

	public ModelAdapter getModelAdapter()
	{
		if(modelAdapter == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #79  <Field ModelAdapter modelAdapter>
	//*   2    4:ifnonnull       58
		{
			if(!(getInstanceAdapter() instanceof ModelAdapter))
	//*   3    7:aload_0         
	//*   4    8:invokevirtual   #83  <Method com.raizlabs.android.dbflow.structure.InstanceAdapter getInstanceAdapter()>
	//*   5   11:instanceof      #34  <Class ModelAdapter>
	//*   6   14:ifne            27
				throw new IllegalArgumentException("A non-Table type was used.");
	//    7   17:new             #85  <Class IllegalArgumentException>
	//    8   20:dup             
	//    9   21:ldc1            #87  <String "A non-Table type was used.">
	//   10   23:invokespecial   #90  <Method void IllegalArgumentException(String)>
	//   11   26:athrow          
			modelAdapter = (ModelAdapter)getInstanceAdapter();
	//   12   27:aload_0         
	//   13   28:aload_0         
	//   14   29:invokevirtual   #83  <Method com.raizlabs.android.dbflow.structure.InstanceAdapter getInstanceAdapter()>
	//   15   32:checkcast       #34  <Class ModelAdapter>
	//   16   35:putfield        #79  <Field ModelAdapter modelAdapter>
			if(!modelAdapter.cachingEnabled())
	//*  17   38:aload_0         
	//*  18   39:getfield        #79  <Field ModelAdapter modelAdapter>
	//*  19   42:invokevirtual   #93  <Method boolean ModelAdapter.cachingEnabled()>
	//*  20   45:ifne            58
				throw new IllegalArgumentException("You cannot call this method for a table that has no caching id. Eitheruse one Primary Key or use the MultiCacheKeyConverter");
	//   21   48:new             #85  <Class IllegalArgumentException>
	//   22   51:dup             
	//   23   52:ldc1            #95  <String "You cannot call this method for a table that has no caching id. Eitheruse one Primary Key or use the MultiCacheKeyConverter">
	//   24   54:invokespecial   #90  <Method void IllegalArgumentException(String)>
	//   25   57:athrow          
		}
		return modelAdapter;
	//   26   58:aload_0         
	//   27   59:getfield        #79  <Field ModelAdapter modelAdapter>
	//   28   62:areturn         
	}

	public ModelCache getModelCache()
	{
		if(modelCache == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #98  <Field ModelCache modelCache>
	//*   2    4:ifnonnull       18
			modelCache = getModelAdapter().getModelCache();
	//    3    7:aload_0         
	//    4    8:aload_0         
	//    5    9:invokevirtual   #32  <Method ModelAdapter getModelAdapter()>
	//    6   12:invokevirtual   #99  <Method ModelCache ModelAdapter.getModelCache()>
	//    7   15:putfield        #98  <Field ModelCache modelCache>
		return modelCache;
	//    8   18:aload_0         
	//    9   19:getfield        #98  <Field ModelCache modelCache>
	//   10   22:areturn         
	}

	private ModelAdapter modelAdapter;
	private ModelCache modelCache;
}

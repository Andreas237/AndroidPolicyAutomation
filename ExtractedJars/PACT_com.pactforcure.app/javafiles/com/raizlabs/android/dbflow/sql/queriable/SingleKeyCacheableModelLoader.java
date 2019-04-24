// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.raizlabs.android.dbflow.sql.queriable;

import android.database.Cursor;
import com.raizlabs.android.dbflow.structure.ModelAdapter;
import com.raizlabs.android.dbflow.structure.cache.ModelCache;

// Referenced classes of package com.raizlabs.android.dbflow.sql.queriable:
//			CacheableModelLoader

public class SingleKeyCacheableModelLoader extends CacheableModelLoader
{

	public SingleKeyCacheableModelLoader(Class class1)
	{
		super(class1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #9   <Method void CacheableModelLoader(Class)>
	//    3    5:return          
	}

	public Object convertToData(Cursor cursor, Object obj, boolean flag)
	{
		if(!flag || cursor.moveToFirst())
	//*   0    0:iload_3         
	//*   1    1:ifeq            13
	//*   2    4:aload_1         
	//*   3    5:invokeinterface #22  <Method boolean Cursor.moveToFirst()>
	//*   4   10:ifeq            88
		{
			Object obj1 = getModelAdapter().getCachingColumnValueFromCursor(cursor);
	//    5   13:aload_0         
	//    6   14:invokevirtual   #26  <Method ModelAdapter getModelAdapter()>
	//    7   17:aload_1         
	//    8   18:invokevirtual   #32  <Method Object ModelAdapter.getCachingColumnValueFromCursor(Cursor)>
	//    9   21:astore          4
			Object obj2 = getModelCache().get(obj1);
	//   10   23:aload_0         
	//   11   24:invokevirtual   #36  <Method ModelCache getModelCache()>
	//   12   27:aload           4
	//   13   29:invokevirtual   #42  <Method Object ModelCache.get(Object)>
	//   14   32:astore          5
			if(obj2 == null)
	//*  15   34:aload           5
	//*  16   36:ifnonnull       75
			{
				if(obj == null)
	//*  17   39:aload_2         
	//*  18   40:ifnonnull       72
					obj = getModelAdapter().newInstance();
	//   19   43:aload_0         
	//   20   44:invokevirtual   #26  <Method ModelAdapter getModelAdapter()>
	//   21   47:invokevirtual   #46  <Method Object ModelAdapter.newInstance()>
	//   22   50:astore_2        
				getModelAdapter().loadFromCursor(cursor, obj);
	//   23   51:aload_0         
	//   24   52:invokevirtual   #26  <Method ModelAdapter getModelAdapter()>
	//   25   55:aload_1         
	//   26   56:aload_2         
	//   27   57:invokevirtual   #50  <Method void ModelAdapter.loadFromCursor(Cursor, Object)>
				getModelCache().addModel(obj1, obj);
	//   28   60:aload_0         
	//   29   61:invokevirtual   #36  <Method ModelCache getModelCache()>
	//   30   64:aload           4
	//   31   66:aload_2         
	//   32   67:invokevirtual   #54  <Method void ModelCache.addModel(Object, Object)>
				return obj;
	//   33   70:aload_2         
	//   34   71:areturn         
			} else
	//*  35   72:goto            51
			{
				getModelAdapter().reloadRelationships(obj2, cursor);
	//   36   75:aload_0         
	//   37   76:invokevirtual   #26  <Method ModelAdapter getModelAdapter()>
	//   38   79:aload           5
	//   39   81:aload_1         
	//   40   82:invokevirtual   #58  <Method void ModelAdapter.reloadRelationships(Object, Cursor)>
				return obj2;
	//   41   85:aload           5
	//   42   87:areturn         
			}
		} else
		{
			return ((Object) (null));
	//   43   88:aconst_null     
	//   44   89:areturn         
		}
	}
}

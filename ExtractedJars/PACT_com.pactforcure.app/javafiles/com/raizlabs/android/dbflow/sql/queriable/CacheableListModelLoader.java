// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.raizlabs.android.dbflow.sql.queriable;

import android.database.Cursor;
import com.raizlabs.android.dbflow.structure.ModelAdapter;
import com.raizlabs.android.dbflow.structure.cache.ModelCache;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.raizlabs.android.dbflow.sql.queriable:
//			ListModelLoader

public class CacheableListModelLoader extends ListModelLoader
{

	public CacheableListModelLoader(Class class1)
	{
		super(class1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #15  <Method void ListModelLoader(Class)>
	//    3    5:return          
	}

	public volatile Object convertToData(Cursor cursor, Object obj)
	{
		return ((Object) (convertToData(cursor, (List)obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:checkcast       #24  <Class List>
	//    4    6:invokevirtual   #27  <Method List convertToData(Cursor, List)>
	//    5    9:areturn         
	}

	public List convertToData(Cursor cursor, List list)
	{
		Object obj = ((Object) (list));
	//    0    0:aload_2         
	//    1    1:astore_3        
		if(list == null)
	//*   2    2:aload_2         
	//*   3    3:ifnonnull       14
			obj = ((Object) (new ArrayList()));
	//    4    6:new             #30  <Class ArrayList>
	//    5    9:dup             
	//    6   10:invokespecial   #33  <Method void ArrayList()>
	//    7   13:astore_3        
		list = ((List) (new Object[getModelAdapter().getCachingColumns().length]));
	//    8   14:aload_0         
	//    9   15:invokevirtual   #37  <Method ModelAdapter getModelAdapter()>
	//   10   18:invokevirtual   #43  <Method String[] ModelAdapter.getCachingColumns()>
	//   11   21:arraylength     
	//   12   22:anewarray       Object[]
	//   13   25:astore_2        
		if(cursor.moveToFirst())
	//*  14   26:aload_1         
	//*  15   27:invokeinterface #51  <Method boolean Cursor.moveToFirst()>
	//*  16   32:ifeq            97
			do
			{
				Object aobj[] = getModelAdapter().getCachingColumnValuesFromCursor(((Object []) (list)), cursor);
	//   17   35:aload_0         
	//   18   36:invokevirtual   #37  <Method ModelAdapter getModelAdapter()>
	//   19   39:aload_2         
	//   20   40:aload_1         
	//   21   41:invokevirtual   #55  <Method Object[] ModelAdapter.getCachingColumnValuesFromCursor(Object[], Cursor)>
	//   22   44:astore          4
				Object obj1 = getModelCache().get(getModelAdapter().getCachingId(aobj));
	//   23   46:aload_0         
	//   24   47:invokevirtual   #59  <Method ModelCache getModelCache()>
	//   25   50:aload_0         
	//   26   51:invokevirtual   #37  <Method ModelAdapter getModelAdapter()>
	//   27   54:aload           4
	//   28   56:invokevirtual   #63  <Method Object ModelAdapter.getCachingId(Object[])>
	//   29   59:invokevirtual   #69  <Method Object ModelCache.get(Object)>
	//   30   62:astore          5
				if(obj1 != null)
	//*  31   64:aload           5
	//*  32   66:ifnull          99
				{
					getModelAdapter().reloadRelationships(obj1, cursor);
	//   33   69:aload_0         
	//   34   70:invokevirtual   #37  <Method ModelAdapter getModelAdapter()>
	//   35   73:aload           5
	//   36   75:aload_1         
	//   37   76:invokevirtual   #73  <Method void ModelAdapter.reloadRelationships(Object, Cursor)>
					((List) (obj)).add(obj1);
	//   38   79:aload_3         
	//   39   80:aload           5
	//   40   82:invokeinterface #77  <Method boolean List.add(Object)>
	//   41   87:pop             
				} else
	//*  42   88:aload_1         
	//*  43   89:invokeinterface #80  <Method boolean Cursor.moveToNext()>
	//*  44   94:ifne            35
	//*  45   97:aload_3         
	//*  46   98:areturn         
				{
					Object obj2 = getModelAdapter().newInstance();
	//   47   99:aload_0         
	//   48  100:invokevirtual   #37  <Method ModelAdapter getModelAdapter()>
	//   49  103:invokevirtual   #84  <Method Object ModelAdapter.newInstance()>
	//   50  106:astore          5
					getModelAdapter().loadFromCursor(cursor, obj2);
	//   51  108:aload_0         
	//   52  109:invokevirtual   #37  <Method ModelAdapter getModelAdapter()>
	//   53  112:aload_1         
	//   54  113:aload           5
	//   55  115:invokevirtual   #88  <Method void ModelAdapter.loadFromCursor(Cursor, Object)>
					getModelCache().addModel(getModelAdapter().getCachingId(aobj), obj2);
	//   56  118:aload_0         
	//   57  119:invokevirtual   #59  <Method ModelCache getModelCache()>
	//   58  122:aload_0         
	//   59  123:invokevirtual   #37  <Method ModelAdapter getModelAdapter()>
	//   60  126:aload           4
	//   61  128:invokevirtual   #63  <Method Object ModelAdapter.getCachingId(Object[])>
	//   62  131:aload           5
	//   63  133:invokevirtual   #92  <Method void ModelCache.addModel(Object, Object)>
					((List) (obj)).add(obj2);
	//   64  136:aload_3         
	//   65  137:aload           5
	//   66  139:invokeinterface #77  <Method boolean List.add(Object)>
	//   67  144:pop             
				}
			} while(cursor.moveToNext());
		return ((List) (obj));
	//*  68  145:goto            88
	}

	public ModelAdapter getModelAdapter()
	{
		if(modelAdapter == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #95  <Field ModelAdapter modelAdapter>
	//*   2    4:ifnonnull       58
		{
			if(!(getInstanceAdapter() instanceof ModelAdapter))
	//*   3    7:aload_0         
	//*   4    8:invokevirtual   #99  <Method com.raizlabs.android.dbflow.structure.InstanceAdapter getInstanceAdapter()>
	//*   5   11:instanceof      #39  <Class ModelAdapter>
	//*   6   14:ifne            27
				throw new IllegalArgumentException("A non-Table type was used.");
	//    7   17:new             #101 <Class IllegalArgumentException>
	//    8   20:dup             
	//    9   21:ldc1            #103 <String "A non-Table type was used.">
	//   10   23:invokespecial   #106 <Method void IllegalArgumentException(String)>
	//   11   26:athrow          
			modelAdapter = (ModelAdapter)getInstanceAdapter();
	//   12   27:aload_0         
	//   13   28:aload_0         
	//   14   29:invokevirtual   #99  <Method com.raizlabs.android.dbflow.structure.InstanceAdapter getInstanceAdapter()>
	//   15   32:checkcast       #39  <Class ModelAdapter>
	//   16   35:putfield        #95  <Field ModelAdapter modelAdapter>
			if(!modelAdapter.cachingEnabled())
	//*  17   38:aload_0         
	//*  18   39:getfield        #95  <Field ModelAdapter modelAdapter>
	//*  19   42:invokevirtual   #109 <Method boolean ModelAdapter.cachingEnabled()>
	//*  20   45:ifne            58
				throw new IllegalArgumentException("You cannot call this method for a table that has no caching id. Eitheruse one Primary Key or use the MultiCacheKeyConverter");
	//   21   48:new             #101 <Class IllegalArgumentException>
	//   22   51:dup             
	//   23   52:ldc1            #111 <String "You cannot call this method for a table that has no caching id. Eitheruse one Primary Key or use the MultiCacheKeyConverter">
	//   24   54:invokespecial   #106 <Method void IllegalArgumentException(String)>
	//   25   57:athrow          
		}
		return modelAdapter;
	//   26   58:aload_0         
	//   27   59:getfield        #95  <Field ModelAdapter modelAdapter>
	//   28   62:areturn         
	}

	public ModelCache getModelCache()
	{
		if(modelCache == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #114 <Field ModelCache modelCache>
	//*   2    4:ifnonnull       35
		{
			modelCache = modelAdapter.getModelCache();
	//    3    7:aload_0         
	//    4    8:aload_0         
	//    5    9:getfield        #95  <Field ModelAdapter modelAdapter>
	//    6   12:invokevirtual   #115 <Method ModelCache ModelAdapter.getModelCache()>
	//    7   15:putfield        #114 <Field ModelCache modelCache>
			if(modelCache == null)
	//*   8   18:aload_0         
	//*   9   19:getfield        #114 <Field ModelCache modelCache>
	//*  10   22:ifnonnull       35
				throw new IllegalArgumentException("ModelCache specified in convertToCacheableList() must not be null.");
	//   11   25:new             #101 <Class IllegalArgumentException>
	//   12   28:dup             
	//   13   29:ldc1            #117 <String "ModelCache specified in convertToCacheableList() must not be null.">
	//   14   31:invokespecial   #106 <Method void IllegalArgumentException(String)>
	//   15   34:athrow          
		}
		return modelCache;
	//   16   35:aload_0         
	//   17   36:getfield        #114 <Field ModelCache modelCache>
	//   18   39:areturn         
	}

	private ModelAdapter modelAdapter;
	private ModelCache modelCache;
}

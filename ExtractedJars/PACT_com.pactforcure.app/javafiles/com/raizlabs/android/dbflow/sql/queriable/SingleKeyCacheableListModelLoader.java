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
//			CacheableListModelLoader

public class SingleKeyCacheableListModelLoader extends CacheableListModelLoader
{

	public SingleKeyCacheableListModelLoader(Class class1)
	{
		super(class1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #9   <Method void CacheableListModelLoader(Class)>
	//    3    5:return          
	}

	public volatile Object convertToData(Cursor cursor, Object obj)
	{
		return ((Object) (convertToData(cursor, (List)obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:checkcast       #18  <Class List>
	//    4    6:invokevirtual   #21  <Method List convertToData(Cursor, List)>
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
	//    4    6:new             #24  <Class ArrayList>
	//    5    9:dup             
	//    6   10:invokespecial   #27  <Method void ArrayList()>
	//    7   13:astore_3        
		if(cursor.moveToFirst())
	//*   8   14:aload_1         
	//*   9   15:invokeinterface #33  <Method boolean Cursor.moveToFirst()>
	//*  10   20:ifeq            75
			do
			{
				list = ((List) (getModelAdapter().getCachingColumnValueFromCursor(cursor)));
	//   11   23:aload_0         
	//   12   24:invokevirtual   #37  <Method ModelAdapter getModelAdapter()>
	//   13   27:aload_1         
	//   14   28:invokevirtual   #43  <Method Object ModelAdapter.getCachingColumnValueFromCursor(Cursor)>
	//   15   31:astore_2        
				Object obj1 = getModelCache().get(((Object) (list)));
	//   16   32:aload_0         
	//   17   33:invokevirtual   #47  <Method ModelCache getModelCache()>
	//   18   36:aload_2         
	//   19   37:invokevirtual   #53  <Method Object ModelCache.get(Object)>
	//   20   40:astore          4
				if(obj1 != null)
	//*  21   42:aload           4
	//*  22   44:ifnull          77
				{
					getModelAdapter().reloadRelationships(obj1, cursor);
	//   23   47:aload_0         
	//   24   48:invokevirtual   #37  <Method ModelAdapter getModelAdapter()>
	//   25   51:aload           4
	//   26   53:aload_1         
	//   27   54:invokevirtual   #57  <Method void ModelAdapter.reloadRelationships(Object, Cursor)>
					((List) (obj)).add(obj1);
	//   28   57:aload_3         
	//   29   58:aload           4
	//   30   60:invokeinterface #61  <Method boolean List.add(Object)>
	//   31   65:pop             
				} else
	//*  32   66:aload_1         
	//*  33   67:invokeinterface #64  <Method boolean Cursor.moveToNext()>
	//*  34   72:ifne            23
	//*  35   75:aload_3         
	//*  36   76:areturn         
				{
					Object obj2 = getModelAdapter().newInstance();
	//   37   77:aload_0         
	//   38   78:invokevirtual   #37  <Method ModelAdapter getModelAdapter()>
	//   39   81:invokevirtual   #68  <Method Object ModelAdapter.newInstance()>
	//   40   84:astore          4
					getModelAdapter().loadFromCursor(cursor, obj2);
	//   41   86:aload_0         
	//   42   87:invokevirtual   #37  <Method ModelAdapter getModelAdapter()>
	//   43   90:aload_1         
	//   44   91:aload           4
	//   45   93:invokevirtual   #72  <Method void ModelAdapter.loadFromCursor(Cursor, Object)>
					getModelCache().addModel(((Object) (list)), obj2);
	//   46   96:aload_0         
	//   47   97:invokevirtual   #47  <Method ModelCache getModelCache()>
	//   48  100:aload_2         
	//   49  101:aload           4
	//   50  103:invokevirtual   #76  <Method void ModelCache.addModel(Object, Object)>
					((List) (obj)).add(obj2);
	//   51  106:aload_3         
	//   52  107:aload           4
	//   53  109:invokeinterface #61  <Method boolean List.add(Object)>
	//   54  114:pop             
				}
			} while(cursor.moveToNext());
		return ((List) (obj));
	//*  55  115:goto            66
	}
}

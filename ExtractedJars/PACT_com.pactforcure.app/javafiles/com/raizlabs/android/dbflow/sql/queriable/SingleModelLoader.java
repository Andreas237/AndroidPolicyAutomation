// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.raizlabs.android.dbflow.sql.queriable;

import android.database.Cursor;
import com.raizlabs.android.dbflow.structure.InstanceAdapter;

// Referenced classes of package com.raizlabs.android.dbflow.sql.queriable:
//			ModelLoader

public class SingleModelLoader extends ModelLoader
{

	public SingleModelLoader(Class class1)
	{
		super(class1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #9   <Method void ModelLoader(Class)>
	//    3    5:return          
	}

	public Object convertToData(Cursor cursor, Object obj)
	{
		return convertToData(cursor, obj, true);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iconst_1        
	//    4    4:invokevirtual   #19  <Method Object convertToData(Cursor, Object, boolean)>
	//    5    7:areturn         
	}

	public Object convertToData(Cursor cursor, Object obj, boolean flag)
	{
		Object obj1;
label0:
		{
			if(flag)
	//*   0    0:iload_3         
	//*   1    1:ifeq            16
			{
				obj1 = obj;
	//    2    4:aload_2         
	//    3    5:astore          4
				if(!cursor.moveToFirst())
					break label0;
	//    4    7:aload_1         
	//    5    8:invokeinterface #27  <Method boolean Cursor.moveToFirst()>
	//    6   13:ifeq            42
			}
			obj1 = obj;
	//    7   16:aload_2         
	//    8   17:astore          4
			if(obj == null)
	//*   9   19:aload_2         
	//*  10   20:ifnonnull       32
				obj1 = getInstanceAdapter().newInstance();
	//   11   23:aload_0         
	//   12   24:invokevirtual   #31  <Method InstanceAdapter getInstanceAdapter()>
	//   13   27:invokevirtual   #37  <Method Object InstanceAdapter.newInstance()>
	//   14   30:astore          4
			getInstanceAdapter().loadFromCursor(cursor, obj1);
	//   15   32:aload_0         
	//   16   33:invokevirtual   #31  <Method InstanceAdapter getInstanceAdapter()>
	//   17   36:aload_1         
	//   18   37:aload           4
	//   19   39:invokevirtual   #41  <Method void InstanceAdapter.loadFromCursor(Cursor, Object)>
		}
		return obj1;
	//   20   42:aload           4
	//   21   44:areturn         
	}
}

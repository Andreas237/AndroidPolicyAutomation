// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.raizlabs.android.dbflow.sql.queriable;

import android.database.Cursor;
import com.raizlabs.android.dbflow.structure.InstanceAdapter;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.raizlabs.android.dbflow.sql.queriable:
//			ModelLoader

public class ListModelLoader extends ModelLoader
{

	public ListModelLoader(Class class1)
	{
		super(class1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #9   <Method void ModelLoader(Class)>
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
		if(list == null)
	//*   0    0:aload_2         
	//*   1    1:ifnonnull       57
			list = ((List) (new ArrayList()));
	//    2    4:new             #24  <Class ArrayList>
	//    3    7:dup             
	//    4    8:invokespecial   #27  <Method void ArrayList()>
	//    5   11:astore_2        
		else
	//*   6   12:aload_1         
	//*   7   13:invokeinterface #33  <Method boolean Cursor.moveToFirst()>
	//*   8   18:ifeq            55
	//*   9   21:aload_0         
	//*  10   22:invokevirtual   #37  <Method InstanceAdapter getInstanceAdapter()>
	//*  11   25:invokevirtual   #43  <Method Object InstanceAdapter.newInstance()>
	//*  12   28:astore_3        
	//*  13   29:aload_0         
	//*  14   30:invokevirtual   #37  <Method InstanceAdapter getInstanceAdapter()>
	//*  15   33:aload_1         
	//*  16   34:aload_3         
	//*  17   35:invokevirtual   #47  <Method void InstanceAdapter.loadFromCursor(Cursor, Object)>
	//*  18   38:aload_2         
	//*  19   39:aload_3         
	//*  20   40:invokeinterface #51  <Method boolean List.add(Object)>
	//*  21   45:pop             
	//*  22   46:aload_1         
	//*  23   47:invokeinterface #54  <Method boolean Cursor.moveToNext()>
	//*  24   52:ifne            21
	//*  25   55:aload_2         
	//*  26   56:areturn         
			list.clear();
	//   27   57:aload_2         
	//   28   58:invokeinterface #57  <Method void List.clear()>
		if(cursor.moveToFirst())
			do
			{
				Object obj = getInstanceAdapter().newInstance();
				getInstanceAdapter().loadFromCursor(cursor, obj);
				list.add(obj);
			} while(cursor.moveToNext());
		return list;
	//*  29   63:goto            12
	}
}

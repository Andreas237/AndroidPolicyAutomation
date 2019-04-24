// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.raizlabs.android.dbflow.sql.language;

import android.database.Cursor;
import com.raizlabs.android.dbflow.config.FlowManager;
import com.raizlabs.android.dbflow.sql.queriable.ListModelLoader;
import com.raizlabs.android.dbflow.sql.queriable.SingleModelLoader;
import com.raizlabs.android.dbflow.structure.InstanceAdapter;
import com.raizlabs.android.dbflow.structure.QueryModelAdapter;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.List;

public class CursorResult
	implements Closeable
{

	CursorResult(Class class1, Cursor cursor1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void Object()>
		cursor = cursor1;
	//    2    4:aload_0         
	//    3    5:aload_2         
	//    4    6:putfield        #20  <Field Cursor cursor>
		retrievalAdapter = FlowManager.getInstanceAdapter(class1);
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:invokestatic    #26  <Method InstanceAdapter FlowManager.getInstanceAdapter(Class)>
	//    8   14:putfield        #28  <Field InstanceAdapter retrievalAdapter>
	//    9   17:return          
	}

	public void close()
	{
		if(cursor != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #20  <Field Cursor cursor>
	//*   2    4:ifnull          16
			cursor.close();
	//    3    7:aload_0         
	//    4    8:getfield        #20  <Field Cursor cursor>
	//    5   11:invokeinterface #37  <Method void Cursor.close()>
	//    6   16:return          
	}

	public long count()
	{
		if(cursor == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #20  <Field Cursor cursor>
	//*   2    4:ifnonnull       9
			return 0L;
	//    3    7:lconst_0        
	//    4    8:lreturn         
		else
			return (long)cursor.getCount();
	//    5    9:aload_0         
	//    6   10:getfield        #20  <Field Cursor cursor>
	//    7   13:invokeinterface #43  <Method int Cursor.getCount()>
	//    8   18:i2l             
	//    9   19:lreturn         
	}

	public Cursor getCursor()
	{
		return cursor;
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field Cursor cursor>
	//    2    4:areturn         
	}

	public void swapCursor(Cursor cursor1)
	{
		if(cursor != null && !cursor.isClosed())
	//*   0    0:aload_0         
	//*   1    1:getfield        #20  <Field Cursor cursor>
	//*   2    4:ifnull          28
	//*   3    7:aload_0         
	//*   4    8:getfield        #20  <Field Cursor cursor>
	//*   5   11:invokeinterface #52  <Method boolean Cursor.isClosed()>
	//*   6   16:ifne            28
			cursor.close();
	//    7   19:aload_0         
	//    8   20:getfield        #20  <Field Cursor cursor>
	//    9   23:invokeinterface #37  <Method void Cursor.close()>
		cursor = cursor1;
	//   10   28:aload_0         
	//   11   29:aload_1         
	//   12   30:putfield        #20  <Field Cursor cursor>
	//   13   33:return          
	}

	public List toCustomList(Class class1)
	{
		if(cursor != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #20  <Field Cursor cursor>
	//*   2    4:ifnull          37
		{
			class1 = ((Class) (FlowManager.getQueryModelAdapter(class1).getListModelLoader().convertToData(cursor, ((List) (null)))));
	//    3    7:aload_1         
	//    4    8:invokestatic    #59  <Method QueryModelAdapter FlowManager.getQueryModelAdapter(Class)>
	//    5   11:invokevirtual   #65  <Method ListModelLoader QueryModelAdapter.getListModelLoader()>
	//    6   14:aload_0         
	//    7   15:getfield        #20  <Field Cursor cursor>
	//    8   18:aconst_null     
	//    9   19:invokevirtual   #71  <Method List ListModelLoader.convertToData(Cursor, List)>
	//   10   22:astore_1        
			if(class1 != null)
	//*  11   23:aload_1         
	//*  12   24:ifnull          29
				return ((List) (class1));
	//   13   27:aload_1         
	//   14   28:areturn         
			else
				return ((List) (new ArrayList()));
	//   15   29:new             #73  <Class ArrayList>
	//   16   32:dup             
	//   17   33:invokespecial   #74  <Method void ArrayList()>
	//   18   36:areturn         
		} else
		{
			return ((List) (new ArrayList()));
	//   19   37:new             #73  <Class ArrayList>
	//   20   40:dup             
	//   21   41:invokespecial   #74  <Method void ArrayList()>
	//   22   44:areturn         
		}
	}

	public List toCustomListClose(Class class1)
	{
		if(cursor != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #20  <Field Cursor cursor>
	//*   2    4:ifnull          39
		{
			class1 = ((Class) ((List)FlowManager.getQueryModelAdapter(class1).getListModelLoader().load(cursor)));
	//    3    7:aload_1         
	//    4    8:invokestatic    #59  <Method QueryModelAdapter FlowManager.getQueryModelAdapter(Class)>
	//    5   11:invokevirtual   #65  <Method ListModelLoader QueryModelAdapter.getListModelLoader()>
	//    6   14:aload_0         
	//    7   15:getfield        #20  <Field Cursor cursor>
	//    8   18:invokevirtual   #80  <Method Object ListModelLoader.load(Cursor)>
	//    9   21:checkcast       #82  <Class List>
	//   10   24:astore_1        
			if(class1 != null)
	//*  11   25:aload_1         
	//*  12   26:ifnull          31
				return ((List) (class1));
	//   13   29:aload_1         
	//   14   30:areturn         
			else
				return ((List) (new ArrayList()));
	//   15   31:new             #73  <Class ArrayList>
	//   16   34:dup             
	//   17   35:invokespecial   #74  <Method void ArrayList()>
	//   18   38:areturn         
		} else
		{
			return ((List) (new ArrayList()));
	//   19   39:new             #73  <Class ArrayList>
	//   20   42:dup             
	//   21   43:invokespecial   #74  <Method void ArrayList()>
	//   22   46:areturn         
		}
	}

	public List toList()
	{
		if(cursor != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #20  <Field Cursor cursor>
	//*   2    4:ifnull          37
		{
			List list = retrievalAdapter.getListModelLoader().convertToData(cursor, ((List) (null)));
	//    3    7:aload_0         
	//    4    8:getfield        #28  <Field InstanceAdapter retrievalAdapter>
	//    5   11:invokevirtual   #87  <Method ListModelLoader InstanceAdapter.getListModelLoader()>
	//    6   14:aload_0         
	//    7   15:getfield        #20  <Field Cursor cursor>
	//    8   18:aconst_null     
	//    9   19:invokevirtual   #71  <Method List ListModelLoader.convertToData(Cursor, List)>
	//   10   22:astore_1        
			if(list != null)
	//*  11   23:aload_1         
	//*  12   24:ifnull          29
				return list;
	//   13   27:aload_1         
	//   14   28:areturn         
			else
				return ((List) (new ArrayList()));
	//   15   29:new             #73  <Class ArrayList>
	//   16   32:dup             
	//   17   33:invokespecial   #74  <Method void ArrayList()>
	//   18   36:areturn         
		} else
		{
			return ((List) (new ArrayList()));
	//   19   37:new             #73  <Class ArrayList>
	//   20   40:dup             
	//   21   41:invokespecial   #74  <Method void ArrayList()>
	//   22   44:areturn         
		}
	}

	public List toListClose()
	{
		if(cursor != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #20  <Field Cursor cursor>
	//*   2    4:ifnull          39
		{
			List list = (List)retrievalAdapter.getListModelLoader().load(cursor);
	//    3    7:aload_0         
	//    4    8:getfield        #28  <Field InstanceAdapter retrievalAdapter>
	//    5   11:invokevirtual   #87  <Method ListModelLoader InstanceAdapter.getListModelLoader()>
	//    6   14:aload_0         
	//    7   15:getfield        #20  <Field Cursor cursor>
	//    8   18:invokevirtual   #80  <Method Object ListModelLoader.load(Cursor)>
	//    9   21:checkcast       #82  <Class List>
	//   10   24:astore_1        
			if(list != null)
	//*  11   25:aload_1         
	//*  12   26:ifnull          31
				return list;
	//   13   29:aload_1         
	//   14   30:areturn         
			else
				return ((List) (new ArrayList()));
	//   15   31:new             #73  <Class ArrayList>
	//   16   34:dup             
	//   17   35:invokespecial   #74  <Method void ArrayList()>
	//   18   38:areturn         
		} else
		{
			return ((List) (new ArrayList()));
	//   19   39:new             #73  <Class ArrayList>
	//   20   42:dup             
	//   21   43:invokespecial   #74  <Method void ArrayList()>
	//   22   46:areturn         
		}
	}

	public Object toModel()
	{
		Object obj = null;
	//    0    0:aconst_null     
	//    1    1:astore_1        
		if(cursor != null)
	//*   2    2:aload_0         
	//*   3    3:getfield        #20  <Field Cursor cursor>
	//*   4    6:ifnull          25
			obj = retrievalAdapter.getSingleModelLoader().convertToData(cursor, ((Object) (null)));
	//    5    9:aload_0         
	//    6   10:getfield        #28  <Field InstanceAdapter retrievalAdapter>
	//    7   13:invokevirtual   #95  <Method SingleModelLoader InstanceAdapter.getSingleModelLoader()>
	//    8   16:aload_0         
	//    9   17:getfield        #20  <Field Cursor cursor>
	//   10   20:aconst_null     
	//   11   21:invokevirtual   #100 <Method Object SingleModelLoader.convertToData(Cursor, Object)>
	//   12   24:astore_1        
		return obj;
	//   13   25:aload_1         
	//   14   26:areturn         
	}

	public Object toModelClose()
	{
		if(cursor != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #20  <Field Cursor cursor>
	//*   2    4:ifnull          22
			return retrievalAdapter.getSingleModelLoader().load(cursor);
	//    3    7:aload_0         
	//    4    8:getfield        #28  <Field InstanceAdapter retrievalAdapter>
	//    5   11:invokevirtual   #95  <Method SingleModelLoader InstanceAdapter.getSingleModelLoader()>
	//    6   14:aload_0         
	//    7   15:getfield        #20  <Field Cursor cursor>
	//    8   18:invokevirtual   #103 <Method Object SingleModelLoader.load(Cursor)>
	//    9   21:areturn         
		else
			return ((Object) (null));
	//   10   22:aconst_null     
	//   11   23:areturn         
	}

	private Cursor cursor;
	private final InstanceAdapter retrievalAdapter;
}

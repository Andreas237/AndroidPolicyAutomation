// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.raizlabs.android.dbflow.structure.provider;

import android.content.Context;
import android.database.Cursor;
import com.raizlabs.android.dbflow.config.FlowManager;
import com.raizlabs.android.dbflow.sql.language.ConditionGroup;
import com.raizlabs.android.dbflow.structure.BaseModel;
import com.raizlabs.android.dbflow.structure.ModelAdapter;

// Referenced classes of package com.raizlabs.android.dbflow.structure.provider:
//			ModelProvider, ContentUtils

public abstract class BaseProviderModel extends BaseModel
	implements ModelProvider
{

	public BaseProviderModel()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void BaseModel()>
	//    2    4:return          
	}

	public void delete()
	{
		ContentUtils.delete(getDeleteUri(), ((Object) (this)));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #17  <Method android.net.Uri getDeleteUri()>
	//    2    4:aload_0         
	//    3    5:invokestatic    #22  <Method int ContentUtils.delete(android.net.Uri, Object)>
	//    4    8:pop             
	//    5    9:return          
	}

	public boolean exists()
	{
		boolean flag1 = false;
	//    0    0:iconst_0        
	//    1    1:istore_2        
		Cursor cursor = ContentUtils.query(FlowManager.getContext().getContentResolver(), getQueryUri(), getModelAdapter().getPrimaryConditionClause(((Object) (this))), "", new String[0]);
	//    2    2:invokestatic    #30  <Method Context FlowManager.getContext()>
	//    3    5:invokevirtual   #36  <Method android.content.ContentResolver Context.getContentResolver()>
	//    4    8:aload_0         
	//    5    9:invokevirtual   #39  <Method android.net.Uri getQueryUri()>
	//    6   12:aload_0         
	//    7   13:invokevirtual   #43  <Method ModelAdapter getModelAdapter()>
	//    8   16:aload_0         
	//    9   17:invokevirtual   #49  <Method ConditionGroup ModelAdapter.getPrimaryConditionClause(Object)>
	//   10   20:ldc1            #51  <String "">
	//   11   22:iconst_0        
	//   12   23:anewarray       String[]
	//   13   26:invokestatic    #57  <Method Cursor ContentUtils.query(android.content.ContentResolver, android.net.Uri, ConditionGroup, String, String[])>
	//   14   29:astore_3        
		boolean flag = flag1;
	//   15   30:iload_2         
	//   16   31:istore_1        
		if(cursor != null)
	//*  17   32:aload_3         
	//*  18   33:ifnull          49
		{
			flag = flag1;
	//   19   36:iload_2         
	//   20   37:istore_1        
			if(cursor.getCount() > 0)
	//*  21   38:aload_3         
	//*  22   39:invokeinterface #63  <Method int Cursor.getCount()>
	//*  23   44:ifle            49
				flag = true;
	//   24   47:iconst_1        
	//   25   48:istore_1        
		}
		if(cursor != null)
	//*  26   49:aload_3         
	//*  27   50:ifnull          59
			cursor.close();
	//   28   53:aload_3         
	//   29   54:invokeinterface #66  <Method void Cursor.close()>
		return flag;
	//   30   59:iload_1         
	//   31   60:ireturn         
	}

	public long insert()
	{
		ContentUtils.insert(getInsertUri(), ((Object) (this)));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #71  <Method android.net.Uri getInsertUri()>
	//    2    4:aload_0         
	//    3    5:invokestatic    #74  <Method android.net.Uri ContentUtils.insert(android.net.Uri, Object)>
	//    4    8:pop             
		return 0L;
	//    5    9:lconst_0        
	//    6   10:lreturn         
	}

	public void load()
	{
		load(getModelAdapter().getPrimaryConditionClause(((Object) (this))), "", new String[0]);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #43  <Method ModelAdapter getModelAdapter()>
	//    3    5:aload_0         
	//    4    6:invokevirtual   #49  <Method ConditionGroup ModelAdapter.getPrimaryConditionClause(Object)>
	//    5    9:ldc1            #51  <String "">
	//    6   11:iconst_0        
	//    7   12:anewarray       String[]
	//    8   15:invokevirtual   #78  <Method void load(ConditionGroup, String, String[])>
	//    9   18:return          
	}

	public transient void load(ConditionGroup conditiongroup, String s, String as[])
	{
		conditiongroup = ((ConditionGroup) (ContentUtils.query(FlowManager.getContext().getContentResolver(), getQueryUri(), conditiongroup, s, as)));
	//    0    0:invokestatic    #30  <Method Context FlowManager.getContext()>
	//    1    3:invokevirtual   #36  <Method android.content.ContentResolver Context.getContentResolver()>
	//    2    6:aload_0         
	//    3    7:invokevirtual   #39  <Method android.net.Uri getQueryUri()>
	//    4   10:aload_1         
	//    5   11:aload_2         
	//    6   12:aload_3         
	//    7   13:invokestatic    #57  <Method Cursor ContentUtils.query(android.content.ContentResolver, android.net.Uri, ConditionGroup, String, String[])>
	//    8   16:astore_1        
		if(conditiongroup != null && ((Cursor) (conditiongroup)).moveToFirst())
	//*   9   17:aload_1         
	//*  10   18:ifnull          45
	//*  11   21:aload_1         
	//*  12   22:invokeinterface #81  <Method boolean Cursor.moveToFirst()>
	//*  13   27:ifeq            45
		{
			getModelAdapter().loadFromCursor(((Cursor) (conditiongroup)), ((Object) (this)));
	//   14   30:aload_0         
	//   15   31:invokevirtual   #43  <Method ModelAdapter getModelAdapter()>
	//   16   34:aload_1         
	//   17   35:aload_0         
	//   18   36:invokevirtual   #85  <Method void ModelAdapter.loadFromCursor(Cursor, Object)>
			((Cursor) (conditiongroup)).close();
	//   19   39:aload_1         
	//   20   40:invokeinterface #66  <Method void Cursor.close()>
		}
	//   21   45:return          
	}

	public void save()
	{
		if(ContentUtils.update(getUpdateUri(), ((Object) (this))) == 0)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #89  <Method android.net.Uri getUpdateUri()>
	//*   2    4:aload_0         
	//*   3    5:invokestatic    #92  <Method int ContentUtils.update(android.net.Uri, Object)>
	//*   4    8:ifne            20
			ContentUtils.insert(getInsertUri(), ((Object) (this)));
	//    5   11:aload_0         
	//    6   12:invokevirtual   #71  <Method android.net.Uri getInsertUri()>
	//    7   15:aload_0         
	//    8   16:invokestatic    #74  <Method android.net.Uri ContentUtils.insert(android.net.Uri, Object)>
	//    9   19:pop             
	//   10   20:return          
	}

	public void update()
	{
		ContentUtils.update(getUpdateUri(), ((Object) (this)));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #89  <Method android.net.Uri getUpdateUri()>
	//    2    4:aload_0         
	//    3    5:invokestatic    #92  <Method int ContentUtils.update(android.net.Uri, Object)>
	//    4    8:pop             
	//    5    9:return          
	}
}

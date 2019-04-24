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

public abstract class BaseSyncableProviderModel extends BaseModel
	implements ModelProvider
{

	public BaseSyncableProviderModel()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #10  <Method void BaseModel()>
	//    2    4:return          
	}

	public void delete()
	{
		super.delete();
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void BaseModel.delete()>
		ContentUtils.delete(getDeleteUri(), ((Object) (this)));
	//    2    4:aload_0         
	//    3    5:invokevirtual   #18  <Method android.net.Uri getDeleteUri()>
	//    4    8:aload_0         
	//    5    9:invokestatic    #23  <Method int ContentUtils.delete(android.net.Uri, Object)>
	//    6   12:pop             
	//    7   13:return          
	}

	public long insert()
	{
		long l = super.insert();
	//    0    0:aload_0         
	//    1    1:invokespecial   #27  <Method long BaseModel.insert()>
	//    2    4:lstore_1        
		ContentUtils.insert(getInsertUri(), ((Object) (this)));
	//    3    5:aload_0         
	//    4    6:invokevirtual   #30  <Method android.net.Uri getInsertUri()>
	//    5    9:aload_0         
	//    6   10:invokestatic    #33  <Method android.net.Uri ContentUtils.insert(android.net.Uri, Object)>
	//    7   13:pop             
		return l;
	//    8   14:lload_1         
	//    9   15:lreturn         
	}

	public void load()
	{
		load(getModelAdapter().getPrimaryConditionClause(((Object) (this))), "", new String[0]);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #38  <Method ModelAdapter getModelAdapter()>
	//    3    5:aload_0         
	//    4    6:invokevirtual   #44  <Method ConditionGroup ModelAdapter.getPrimaryConditionClause(Object)>
	//    5    9:ldc1            #46  <String "">
	//    6   11:iconst_0        
	//    7   12:anewarray       String[]
	//    8   15:invokevirtual   #51  <Method void load(ConditionGroup, String, String[])>
	//    9   18:return          
	}

	public transient void load(ConditionGroup conditiongroup, String s, String as[])
	{
		conditiongroup = ((ConditionGroup) (ContentUtils.query(FlowManager.getContext().getContentResolver(), getQueryUri(), conditiongroup, s, as)));
	//    0    0:invokestatic    #57  <Method Context FlowManager.getContext()>
	//    1    3:invokevirtual   #63  <Method android.content.ContentResolver Context.getContentResolver()>
	//    2    6:aload_0         
	//    3    7:invokevirtual   #66  <Method android.net.Uri getQueryUri()>
	//    4   10:aload_1         
	//    5   11:aload_2         
	//    6   12:aload_3         
	//    7   13:invokestatic    #70  <Method Cursor ContentUtils.query(android.content.ContentResolver, android.net.Uri, ConditionGroup, String, String[])>
	//    8   16:astore_1        
		if(conditiongroup != null && ((Cursor) (conditiongroup)).moveToFirst())
	//*   9   17:aload_1         
	//*  10   18:ifnull          45
	//*  11   21:aload_1         
	//*  12   22:invokeinterface #76  <Method boolean Cursor.moveToFirst()>
	//*  13   27:ifeq            45
		{
			getModelAdapter().loadFromCursor(((Cursor) (conditiongroup)), ((Object) (this)));
	//   14   30:aload_0         
	//   15   31:invokevirtual   #38  <Method ModelAdapter getModelAdapter()>
	//   16   34:aload_1         
	//   17   35:aload_0         
	//   18   36:invokevirtual   #80  <Method void ModelAdapter.loadFromCursor(Cursor, Object)>
			((Cursor) (conditiongroup)).close();
	//   19   39:aload_1         
	//   20   40:invokeinterface #83  <Method void Cursor.close()>
		}
	//   21   45:return          
	}

	public void save()
	{
		super.save();
	//    0    0:aload_0         
	//    1    1:invokespecial   #86  <Method void BaseModel.save()>
		if(exists())
	//*   2    4:aload_0         
	//*   3    5:invokevirtual   #89  <Method boolean exists()>
	//*   4    8:ifeq            21
		{
			ContentUtils.update(getUpdateUri(), ((Object) (this)));
	//    5   11:aload_0         
	//    6   12:invokevirtual   #92  <Method android.net.Uri getUpdateUri()>
	//    7   15:aload_0         
	//    8   16:invokestatic    #95  <Method int ContentUtils.update(android.net.Uri, Object)>
	//    9   19:pop             
			return;
	//   10   20:return          
		} else
		{
			ContentUtils.insert(getInsertUri(), ((Object) (this)));
	//   11   21:aload_0         
	//   12   22:invokevirtual   #30  <Method android.net.Uri getInsertUri()>
	//   13   25:aload_0         
	//   14   26:invokestatic    #33  <Method android.net.Uri ContentUtils.insert(android.net.Uri, Object)>
	//   15   29:pop             
			return;
	//   16   30:return          
		}
	}

	public void update()
	{
		super.update();
	//    0    0:aload_0         
	//    1    1:invokespecial   #97  <Method void BaseModel.update()>
		ContentUtils.update(getUpdateUri(), ((Object) (this)));
	//    2    4:aload_0         
	//    3    5:invokevirtual   #92  <Method android.net.Uri getUpdateUri()>
	//    4    8:aload_0         
	//    5    9:invokestatic    #95  <Method int ContentUtils.update(android.net.Uri, Object)>
	//    6   12:pop             
	//    7   13:return          
	}
}

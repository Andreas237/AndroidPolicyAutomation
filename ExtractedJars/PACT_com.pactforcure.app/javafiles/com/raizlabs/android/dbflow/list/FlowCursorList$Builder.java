// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.raizlabs.android.dbflow.list;

import android.database.Cursor;
import com.raizlabs.android.dbflow.sql.queriable.ModelQueriable;
import com.raizlabs.android.dbflow.structure.cache.ModelCache;

// Referenced classes of package com.raizlabs.android.dbflow.list:
//			FlowCursorList

public static class FlowCursorList$Builder
{

	public FlowCursorList build()
	{
		return new FlowCursorList(this, ((FlowCursorList._cls1) (null)));
	//    0    0:new             #7   <Class FlowCursorList>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:invokespecial   #73  <Method void FlowCursorList(FlowCursorList$Builder, FlowCursorList$1)>
	//    5    9:areturn         
	}

	public FlowCursorList$Builder cacheModels(boolean flag)
	{
		cacheModels = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #31  <Field boolean cacheModels>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public FlowCursorList$Builder cacheSize(int i)
	{
		cacheSize = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #64  <Field int cacheSize>
		cacheModels(true);
	//    3    5:aload_0         
	//    4    6:iconst_1        
	//    5    7:invokevirtual   #79  <Method FlowCursorList$Builder cacheModels(boolean)>
	//    6   10:pop             
		return this;
	//    7   11:aload_0         
	//    8   12:areturn         
	}

	public FlowCursorList$Builder cursor(Cursor cursor1)
	{
		cursor = cursor1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #58  <Field Cursor cursor>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public FlowCursorList$Builder modelCache(ModelCache modelcache)
	{
		modelCache = modelcache;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #68  <Field ModelCache modelCache>
		cacheModels(true);
	//    3    5:aload_0         
	//    4    6:iconst_1        
	//    5    7:invokevirtual   #79  <Method FlowCursorList$Builder cacheModels(boolean)>
	//    6   10:pop             
		return this;
	//    7   11:aload_0         
	//    8   12:areturn         
	}

	public FlowCursorList$Builder modelQueriable(ModelQueriable modelqueriable)
	{
		modelQueriable = modelqueriable;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #54  <Field ModelQueriable modelQueriable>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	private boolean cacheModels;
	private int cacheSize;
	private Cursor cursor;
	private ModelCache modelCache;
	private final Class modelClass;
	private ModelQueriable modelQueriable;


/*
	static Class access$000(FlowCursorList$Builder flowcursorlist$builder)
	{
		return flowcursorlist$builder.modelClass;
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field Class modelClass>
	//    2    4:areturn         
	}

*/


/*
	static ModelQueriable access$100(FlowCursorList$Builder flowcursorlist$builder)
	{
		return flowcursorlist$builder.modelQueriable;
	//    0    0:aload_0         
	//    1    1:getfield        #54  <Field ModelQueriable modelQueriable>
	//    2    4:areturn         
	}

*/


/*
	static Cursor access$200(FlowCursorList$Builder flowcursorlist$builder)
	{
		return flowcursorlist$builder.cursor;
	//    0    0:aload_0         
	//    1    1:getfield        #58  <Field Cursor cursor>
	//    2    4:areturn         
	}

*/


/*
	static boolean access$300(FlowCursorList$Builder flowcursorlist$builder)
	{
		return flowcursorlist$builder.cacheModels;
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field boolean cacheModels>
	//    2    4:ireturn         
	}

*/


/*
	static int access$400(FlowCursorList$Builder flowcursorlist$builder)
	{
		return flowcursorlist$builder.cacheSize;
	//    0    0:aload_0         
	//    1    1:getfield        #64  <Field int cacheSize>
	//    2    4:ireturn         
	}

*/


/*
	static ModelCache access$500(FlowCursorList$Builder flowcursorlist$builder)
	{
		return flowcursorlist$builder.modelCache;
	//    0    0:aload_0         
	//    1    1:getfield        #68  <Field ModelCache modelCache>
	//    2    4:areturn         
	}

*/

	public FlowCursorList$Builder(ModelQueriable modelqueriable)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #29  <Method void Object()>
		cacheModels = true;
	//    2    4:aload_0         
	//    3    5:iconst_1        
	//    4    6:putfield        #31  <Field boolean cacheModels>
		modelClass = modelqueriable.getTable();
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:invokeinterface #37  <Method Class ModelQueriable.getTable()>
	//    8   16:putfield        #39  <Field Class modelClass>
		modelQueriable(modelqueriable);
	//    9   19:aload_0         
	//   10   20:aload_1         
	//   11   21:invokevirtual   #42  <Method FlowCursorList$Builder modelQueriable(ModelQueriable)>
	//   12   24:pop             
	//   13   25:return          
	}

	public FlowCursorList$Builder(Class class1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #29  <Method void Object()>
		cacheModels = true;
	//    2    4:aload_0         
	//    3    5:iconst_1        
	//    4    6:putfield        #31  <Field boolean cacheModels>
		modelClass = class1;
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:putfield        #39  <Field Class modelClass>
	//    8   14:return          
	}
}

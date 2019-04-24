// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.raizlabs.android.dbflow.list;

import android.database.Cursor;
import com.raizlabs.android.dbflow.config.FlowLog;
import com.raizlabs.android.dbflow.config.FlowManager;
import com.raizlabs.android.dbflow.sql.language.SQLite;
import com.raizlabs.android.dbflow.sql.language.Select;
import com.raizlabs.android.dbflow.sql.language.property.IProperty;
import com.raizlabs.android.dbflow.sql.queriable.*;
import com.raizlabs.android.dbflow.structure.InstanceAdapter;
import com.raizlabs.android.dbflow.structure.ModelAdapter;
import com.raizlabs.android.dbflow.structure.cache.ModelCache;
import com.raizlabs.android.dbflow.structure.cache.ModelLruCache;
import java.io.Closeable;
import java.util.*;

// Referenced classes of package com.raizlabs.android.dbflow.list:
//			IFlowCursorIterator, FlowCursorIterator

public class FlowCursorList
	implements Iterable, Closeable, IFlowCursorIterator
{
	public static class Builder
	{

		public FlowCursorList build()
		{
			return new FlowCursorList(this);
		//    0    0:new             #7   <Class FlowCursorList>
		//    1    3:dup             
		//    2    4:aload_0         
		//    3    5:aconst_null     
		//    4    6:invokespecial   #73  <Method void FlowCursorList(FlowCursorList$Builder, FlowCursorList$1)>
		//    5    9:areturn         
		}

		public Builder cacheModels(boolean flag)
		{
			cacheModels = flag;
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:putfield        #31  <Field boolean cacheModels>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public Builder cacheSize(int i)
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

		public Builder cursor(Cursor cursor1)
		{
			cursor = cursor1;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #58  <Field Cursor cursor>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public Builder modelCache(ModelCache modelcache)
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

		public Builder modelQueriable(ModelQueriable modelqueriable)
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
		static Class access$000(Builder builder)
		{
			return builder.modelClass;
		//    0    0:aload_0         
		//    1    1:getfield        #39  <Field Class modelClass>
		//    2    4:areturn         
		}

*/


/*
		static ModelQueriable access$100(Builder builder)
		{
			return builder.modelQueriable;
		//    0    0:aload_0         
		//    1    1:getfield        #54  <Field ModelQueriable modelQueriable>
		//    2    4:areturn         
		}

*/


/*
		static Cursor access$200(Builder builder)
		{
			return builder.cursor;
		//    0    0:aload_0         
		//    1    1:getfield        #58  <Field Cursor cursor>
		//    2    4:areturn         
		}

*/


/*
		static boolean access$300(Builder builder)
		{
			return builder.cacheModels;
		//    0    0:aload_0         
		//    1    1:getfield        #31  <Field boolean cacheModels>
		//    2    4:ireturn         
		}

*/


/*
		static int access$400(Builder builder)
		{
			return builder.cacheSize;
		//    0    0:aload_0         
		//    1    1:getfield        #64  <Field int cacheSize>
		//    2    4:ireturn         
		}

*/


/*
		static ModelCache access$500(Builder builder)
		{
			return builder.modelCache;
		//    0    0:aload_0         
		//    1    1:getfield        #68  <Field ModelCache modelCache>
		//    2    4:areturn         
		}

*/

		public Builder(ModelQueriable modelqueriable)
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

		public Builder(Class class1)
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

	public static interface OnCursorRefreshListener
	{

		public abstract void onCursorRefreshed(FlowCursorList flowcursorlist);
	}


	private FlowCursorList(Builder builder)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #50  <Method void Object()>
		cursorRefreshListenerSet = ((Set) (new HashSet()));
	//    2    4:aload_0         
	//    3    5:new             #52  <Class HashSet>
	//    4    8:dup             
	//    5    9:invokespecial   #53  <Method void HashSet()>
	//    6   12:putfield        #55  <Field Set cursorRefreshListenerSet>
		table = builder.modelClass;
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:invokestatic    #59  <Method Class FlowCursorList$Builder.access$000(FlowCursorList$Builder)>
	//   10   20:putfield        #61  <Field Class table>
		modelQueriable = builder.modelQueriable;
	//   11   23:aload_0         
	//   12   24:aload_1         
	//   13   25:invokestatic    #65  <Method ModelQueriable FlowCursorList$Builder.access$100(FlowCursorList$Builder)>
	//   14   28:putfield        #67  <Field ModelQueriable modelQueriable>
		if(builder.modelQueriable == null)
	//*  15   31:aload_1         
	//*  16   32:invokestatic    #65  <Method ModelQueriable FlowCursorList$Builder.access$100(FlowCursorList$Builder)>
	//*  17   35:ifnonnull       150
		{
			cursor = builder.cursor;
	//   18   38:aload_0         
	//   19   39:aload_1         
	//   20   40:invokestatic    #71  <Method Cursor FlowCursorList$Builder.access$200(FlowCursorList$Builder)>
	//   21   43:putfield        #73  <Field Cursor cursor>
			if(cursor == null)
	//*  22   46:aload_0         
	//*  23   47:getfield        #73  <Field Cursor cursor>
	//*  24   50:ifnonnull       84
			{
				modelQueriable = ((ModelQueriable) (SQLite.select(new IProperty[0]).from(table)));
	//   25   53:aload_0         
	//   26   54:iconst_0        
	//   27   55:anewarray       IProperty[]
	//   28   58:invokestatic    #81  <Method Select SQLite.select(IProperty[])>
	//   29   61:aload_0         
	//   30   62:getfield        #61  <Field Class table>
	//   31   65:invokevirtual   #87  <Method com.raizlabs.android.dbflow.sql.language.From Select.from(Class)>
	//   32   68:putfield        #67  <Field ModelQueriable modelQueriable>
				cursor = modelQueriable.query();
	//   33   71:aload_0         
	//   34   72:aload_0         
	//   35   73:getfield        #67  <Field ModelQueriable modelQueriable>
	//   36   76:invokeinterface #93  <Method Cursor ModelQueriable.query()>
	//   37   81:putfield        #73  <Field Cursor cursor>
			}
		} else
	//*  38   84:aload_0         
	//*  39   85:aload_1         
	//*  40   86:invokestatic    #97  <Method boolean FlowCursorList$Builder.access$300(FlowCursorList$Builder)>
	//*  41   89:putfield        #99  <Field boolean cacheModels>
	//*  42   92:aload_0         
	//*  43   93:getfield        #99  <Field boolean cacheModels>
	//*  44   96:ifeq            130
	//*  45   99:aload_0         
	//*  46  100:aload_1         
	//*  47  101:invokestatic    #103 <Method int FlowCursorList$Builder.access$400(FlowCursorList$Builder)>
	//*  48  104:putfield        #105 <Field int cacheSize>
	//*  49  107:aload_0         
	//*  50  108:aload_1         
	//*  51  109:invokestatic    #109 <Method ModelCache FlowCursorList$Builder.access$500(FlowCursorList$Builder)>
	//*  52  112:putfield        #111 <Field ModelCache modelCache>
	//*  53  115:aload_0         
	//*  54  116:getfield        #111 <Field ModelCache modelCache>
	//*  55  119:ifnonnull       130
	//*  56  122:aload_0         
	//*  57  123:iconst_0        
	//*  58  124:invokestatic    #117 <Method ModelLruCache ModelLruCache.newInstance(int)>
	//*  59  127:putfield        #111 <Field ModelCache modelCache>
	//*  60  130:aload_0         
	//*  61  131:aload_1         
	//*  62  132:invokestatic    #59  <Method Class FlowCursorList$Builder.access$000(FlowCursorList$Builder)>
	//*  63  135:invokestatic    #123 <Method InstanceAdapter FlowManager.getInstanceAdapter(Class)>
	//*  64  138:putfield        #125 <Field InstanceAdapter instanceAdapter>
	//*  65  141:aload_0         
	//*  66  142:aload_0         
	//*  67  143:getfield        #99  <Field boolean cacheModels>
	//*  68  146:invokevirtual   #129 <Method void setCacheModels(boolean)>
	//*  69  149:return          
		{
			cursor = builder.modelQueriable.query();
	//   70  150:aload_0         
	//   71  151:aload_1         
	//   72  152:invokestatic    #65  <Method ModelQueriable FlowCursorList$Builder.access$100(FlowCursorList$Builder)>
	//   73  155:invokeinterface #93  <Method Cursor ModelQueriable.query()>
	//   74  160:putfield        #73  <Field Cursor cursor>
		}
		cacheModels = builder.cacheModels;
		if(cacheModels)
		{
			cacheSize = builder.cacheSize;
			modelCache = builder.modelCache;
			if(modelCache == null)
				modelCache = ((ModelCache) (ModelLruCache.newInstance(0)));
		}
		instanceAdapter = FlowManager.getInstanceAdapter(builder.modelClass);
		setCacheModels(cacheModels);
	//*  75  163:goto            84
	}


	private void throwIfCursorClosed()
	{
		if(cursor != null && cursor.isClosed())
	//*   0    0:aload_0         
	//*   1    1:getfield        #73  <Field Cursor cursor>
	//*   2    4:ifnull          29
	//*   3    7:aload_0         
	//*   4    8:getfield        #73  <Field Cursor cursor>
	//*   5   11:invokeinterface #142 <Method boolean Cursor.isClosed()>
	//*   6   16:ifeq            29
			throw new IllegalStateException("Cursor has been closed for FlowCursorList");
	//    7   19:new             #144 <Class IllegalStateException>
	//    8   22:dup             
	//    9   23:ldc1            #146 <String "Cursor has been closed for FlowCursorList">
	//   10   25:invokespecial   #149 <Method void IllegalStateException(String)>
	//   11   28:athrow          
		else
			return;
	//   12   29:return          
	}

	private void warnEmptyCursor()
	{
		if(cursor == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #73  <Field Cursor cursor>
	//*   2    4:ifnonnull       15
			FlowLog.log(com.raizlabs.android.dbflow.config.FlowLog.Level.W, "Cursor was null for FlowCursorList");
	//    3    7:getstatic       #156 <Field com.raizlabs.android.dbflow.config.FlowLog$Level com.raizlabs.android.dbflow.config.FlowLog$Level.W>
	//    4   10:ldc1            #158 <String "Cursor was null for FlowCursorList">
	//    5   12:invokestatic    #164 <Method void FlowLog.log(com.raizlabs.android.dbflow.config.FlowLog$Level, String)>
	//    6   15:return          
	}

	public void addOnCursorRefreshListener(OnCursorRefreshListener oncursorrefreshlistener)
	{
		synchronized(cursorRefreshListenerSet)
	//*   0    0:aload_0         
	//*   1    1:getfield        #55  <Field Set cursorRefreshListenerSet>
	//*   2    4:astore_2        
	//*   3    5:aload_2         
	//*   4    6:monitorenter    
		{
			cursorRefreshListenerSet.add(((Object) (oncursorrefreshlistener)));
	//    5    7:aload_0         
	//    6    8:getfield        #55  <Field Set cursorRefreshListenerSet>
	//    7   11:aload_1         
	//    8   12:invokeinterface #172 <Method boolean Set.add(Object)>
	//    9   17:pop             
		}
	//   10   18:aload_2         
	//   11   19:monitorexit     
		return;
	//   12   20:return          
		oncursorrefreshlistener;
	//   13   21:astore_1        
		set;
	//   14   22:aload_2         
		JVM INSTR monitorexit ;
	//   15   23:monitorexit     
		throw oncursorrefreshlistener;
	//   16   24:aload_1         
	//   17   25:athrow          
	}

	public int cacheSize()
	{
		return cacheSize;
	//    0    0:aload_0         
	//    1    1:getfield        #105 <Field int cacheSize>
	//    2    4:ireturn         
	}

	public boolean cachingEnabled()
	{
		return cacheModels;
	//    0    0:aload_0         
	//    1    1:getfield        #99  <Field boolean cacheModels>
	//    2    4:ireturn         
	}

	public void clearCache()
	{
		if(cacheModels)
	//*   0    0:aload_0         
	//*   1    1:getfield        #99  <Field boolean cacheModels>
	//*   2    4:ifeq            14
			modelCache.clear();
	//    3    7:aload_0         
	//    4    8:getfield        #111 <Field ModelCache modelCache>
	//    5   11:invokevirtual   #181 <Method void ModelCache.clear()>
	//    6   14:return          
	}

	public void close()
	{
		warnEmptyCursor();
	//    0    0:aload_0         
	//    1    1:invokespecial   #184 <Method void warnEmptyCursor()>
		if(cursor != null)
	//*   2    4:aload_0         
	//*   3    5:getfield        #73  <Field Cursor cursor>
	//*   4    8:ifnull          20
			cursor.close();
	//    5   11:aload_0         
	//    6   12:getfield        #73  <Field Cursor cursor>
	//    7   15:invokeinterface #186 <Method void Cursor.close()>
		cursor = null;
	//    8   20:aload_0         
	//    9   21:aconst_null     
	//   10   22:putfield        #73  <Field Cursor cursor>
	//   11   25:return          
	}

	public Cursor cursor()
	{
		throwIfCursorClosed();
	//    0    0:aload_0         
	//    1    1:invokespecial   #188 <Method void throwIfCursorClosed()>
		warnEmptyCursor();
	//    2    4:aload_0         
	//    3    5:invokespecial   #184 <Method void warnEmptyCursor()>
		return cursor;
	//    4    8:aload_0         
	//    5    9:getfield        #73  <Field Cursor cursor>
	//    6   12:areturn         
	}

	public List getAll()
	{
		throwIfCursorClosed();
	//    0    0:aload_0         
	//    1    1:invokespecial   #188 <Method void throwIfCursorClosed()>
		warnEmptyCursor();
	//    2    4:aload_0         
	//    3    5:invokespecial   #184 <Method void warnEmptyCursor()>
		if(cursor == null)
	//*   4    8:aload_0         
	//*   5    9:getfield        #73  <Field Cursor cursor>
	//*   6   12:ifnonnull       23
			return ((List) (new ArrayList()));
	//    7   15:new             #193 <Class ArrayList>
	//    8   18:dup             
	//    9   19:invokespecial   #194 <Method void ArrayList()>
	//   10   22:areturn         
		else
			return FlowManager.getModelAdapter(table).getListModelLoader().convertToData(cursor, ((List) (null)));
	//   11   23:aload_0         
	//   12   24:getfield        #61  <Field Class table>
	//   13   27:invokestatic    #198 <Method ModelAdapter FlowManager.getModelAdapter(Class)>
	//   14   30:invokevirtual   #204 <Method ListModelLoader ModelAdapter.getListModelLoader()>
	//   15   33:aload_0         
	//   16   34:getfield        #73  <Field Cursor cursor>
	//   17   37:aconst_null     
	//   18   38:invokevirtual   #210 <Method List ListModelLoader.convertToData(Cursor, List)>
	//   19   41:areturn         
	}

	public int getCount()
	{
		throwIfCursorClosed();
	//    0    0:aload_0         
	//    1    1:invokespecial   #188 <Method void throwIfCursorClosed()>
		warnEmptyCursor();
	//    2    4:aload_0         
	//    3    5:invokespecial   #184 <Method void warnEmptyCursor()>
		if(cursor != null)
	//*   4    8:aload_0         
	//*   5    9:getfield        #73  <Field Cursor cursor>
	//*   6   12:ifnull          25
			return cursor.getCount();
	//    7   15:aload_0         
	//    8   16:getfield        #73  <Field Cursor cursor>
	//    9   19:invokeinterface #214 <Method int Cursor.getCount()>
	//   10   24:ireturn         
		else
			return 0;
	//   11   25:iconst_0        
	//   12   26:ireturn         
	}

	InstanceAdapter getInstanceAdapter()
	{
		return instanceAdapter;
	//    0    0:aload_0         
	//    1    1:getfield        #125 <Field InstanceAdapter instanceAdapter>
	//    2    4:areturn         
	}

	public Object getItem(long l)
	{
		throwIfCursorClosed();
	//    0    0:aload_0         
	//    1    1:invokespecial   #188 <Method void throwIfCursorClosed()>
		warnEmptyCursor();
	//    2    4:aload_0         
	//    3    5:invokespecial   #184 <Method void warnEmptyCursor()>
		Object obj1 = null;
	//    4    8:aconst_null     
	//    5    9:astore          4
		Object obj;
		if(cacheModels)
	//*   6   11:aload_0         
	//*   7   12:getfield        #99  <Field boolean cacheModels>
	//*   8   15:ifeq            97
		{
			obj1 = modelCache.get(((Object) (Long.valueOf(l))));
	//    9   18:aload_0         
	//   10   19:getfield        #111 <Field ModelCache modelCache>
	//   11   22:lload_1         
	//   12   23:invokestatic    #224 <Method Long Long.valueOf(long)>
	//   13   26:invokevirtual   #228 <Method Object ModelCache.get(Object)>
	//   14   29:astore          4
			obj = obj1;
	//   15   31:aload           4
	//   16   33:astore_3        
			if(obj1 == null)
	//*  17   34:aload           4
	//*  18   36:ifnonnull       95
			{
				obj = obj1;
	//   19   39:aload           4
	//   20   41:astore_3        
				if(cursor != null)
	//*  21   42:aload_0         
	//*  22   43:getfield        #73  <Field Cursor cursor>
	//*  23   46:ifnull          95
				{
					obj = obj1;
	//   24   49:aload           4
	//   25   51:astore_3        
					if(cursor.moveToPosition((int)l))
	//*  26   52:aload_0         
	//*  27   53:getfield        #73  <Field Cursor cursor>
	//*  28   56:lload_1         
	//*  29   57:l2i             
	//*  30   58:invokeinterface #232 <Method boolean Cursor.moveToPosition(int)>
	//*  31   63:ifeq            95
					{
						obj = instanceAdapter.getSingleModelLoader().convertToData(cursor, ((Object) (null)), false);
	//   32   66:aload_0         
	//   33   67:getfield        #125 <Field InstanceAdapter instanceAdapter>
	//   34   70:invokevirtual   #238 <Method SingleModelLoader InstanceAdapter.getSingleModelLoader()>
	//   35   73:aload_0         
	//   36   74:getfield        #73  <Field Cursor cursor>
	//   37   77:aconst_null     
	//   38   78:iconst_0        
	//   39   79:invokevirtual   #243 <Method Object SingleModelLoader.convertToData(Cursor, Object, boolean)>
	//   40   82:astore_3        
						modelCache.addModel(((Object) (Long.valueOf(l))), obj);
	//   41   83:aload_0         
	//   42   84:getfield        #111 <Field ModelCache modelCache>
	//   43   87:lload_1         
	//   44   88:invokestatic    #224 <Method Long Long.valueOf(long)>
	//   45   91:aload_3         
	//   46   92:invokevirtual   #247 <Method void ModelCache.addModel(Object, Object)>
					}
				}
			}
		} else
	//*  47   95:aload_3         
	//*  48   96:areturn         
		{
			obj = obj1;
	//   49   97:aload           4
	//   50   99:astore_3        
			if(cursor != null)
	//*  51  100:aload_0         
	//*  52  101:getfield        #73  <Field Cursor cursor>
	//*  53  104:ifnull          95
			{
				obj = obj1;
	//   54  107:aload           4
	//   55  109:astore_3        
				if(cursor.moveToPosition((int)l))
	//*  56  110:aload_0         
	//*  57  111:getfield        #73  <Field Cursor cursor>
	//*  58  114:lload_1         
	//*  59  115:l2i             
	//*  60  116:invokeinterface #232 <Method boolean Cursor.moveToPosition(int)>
	//*  61  121:ifeq            95
					return instanceAdapter.getSingleModelLoader().convertToData(cursor, ((Object) (null)), false);
	//   62  124:aload_0         
	//   63  125:getfield        #125 <Field InstanceAdapter instanceAdapter>
	//   64  128:invokevirtual   #238 <Method SingleModelLoader InstanceAdapter.getSingleModelLoader()>
	//   65  131:aload_0         
	//   66  132:getfield        #73  <Field Cursor cursor>
	//   67  135:aconst_null     
	//   68  136:iconst_0        
	//   69  137:invokevirtual   #243 <Method Object SingleModelLoader.convertToData(Cursor, Object, boolean)>
	//   70  140:areturn         
			}
		}
		return obj;
	}

	ModelAdapter getModelAdapter()
	{
		return (ModelAdapter)instanceAdapter;
	//    0    0:aload_0         
	//    1    1:getfield        #125 <Field InstanceAdapter instanceAdapter>
	//    2    4:checkcast       #200 <Class ModelAdapter>
	//    3    7:areturn         
	}

	public boolean isEmpty()
	{
		throwIfCursorClosed();
	//    0    0:aload_0         
	//    1    1:invokespecial   #188 <Method void throwIfCursorClosed()>
		warnEmptyCursor();
	//    2    4:aload_0         
	//    3    5:invokespecial   #184 <Method void warnEmptyCursor()>
		return getCount() == 0;
	//    4    8:aload_0         
	//    5    9:invokevirtual   #252 <Method int getCount()>
	//    6   12:ifne            17
	//    7   15:iconst_1        
	//    8   16:ireturn         
	//    9   17:iconst_0        
	//   10   18:ireturn         
	}

	public Iterator iterator()
	{
		return ((Iterator) (new FlowCursorIterator(((IFlowCursorIterator) (this)))));
	//    0    0:new             #256 <Class FlowCursorIterator>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #259 <Method void FlowCursorIterator(IFlowCursorIterator)>
	//    4    8:areturn         
	}

	public ModelCache modelCache()
	{
		return modelCache;
	//    0    0:aload_0         
	//    1    1:getfield        #111 <Field ModelCache modelCache>
	//    2    4:areturn         
	}

	public ModelQueriable modelQueriable()
	{
		return modelQueriable;
	//    0    0:aload_0         
	//    1    1:getfield        #67  <Field ModelQueriable modelQueriable>
	//    2    4:areturn         
	}

	public Builder newBuilder()
	{
		return (new Builder(table)).modelQueriable(modelQueriable).cursor(cursor).cacheSize(cacheSize).cacheModels(cacheModels).modelCache(modelCache);
	//    0    0:new             #15  <Class FlowCursorList$Builder>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #61  <Field Class table>
	//    4    8:invokespecial   #269 <Method void FlowCursorList$Builder(Class)>
	//    5   11:aload_0         
	//    6   12:getfield        #67  <Field ModelQueriable modelQueriable>
	//    7   15:invokevirtual   #272 <Method FlowCursorList$Builder FlowCursorList$Builder.modelQueriable(ModelQueriable)>
	//    8   18:aload_0         
	//    9   19:getfield        #73  <Field Cursor cursor>
	//   10   22:invokevirtual   #275 <Method FlowCursorList$Builder FlowCursorList$Builder.cursor(Cursor)>
	//   11   25:aload_0         
	//   12   26:getfield        #105 <Field int cacheSize>
	//   13   29:invokevirtual   #278 <Method FlowCursorList$Builder FlowCursorList$Builder.cacheSize(int)>
	//   14   32:aload_0         
	//   15   33:getfield        #99  <Field boolean cacheModels>
	//   16   36:invokevirtual   #281 <Method FlowCursorList$Builder FlowCursorList$Builder.cacheModels(boolean)>
	//   17   39:aload_0         
	//   18   40:getfield        #111 <Field ModelCache modelCache>
	//   19   43:invokevirtual   #284 <Method FlowCursorList$Builder FlowCursorList$Builder.modelCache(ModelCache)>
	//   20   46:areturn         
	}

	public void refresh()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		warnEmptyCursor();
	//    2    2:aload_0         
	//    3    3:invokespecial   #184 <Method void warnEmptyCursor()>
		if(cursor != null)
	//*   4    6:aload_0         
	//*   5    7:getfield        #73  <Field Cursor cursor>
	//*   6   10:ifnull          22
			cursor.close();
	//    7   13:aload_0         
	//    8   14:getfield        #73  <Field Cursor cursor>
	//    9   17:invokeinterface #186 <Method void Cursor.close()>
		if(modelQueriable == null)
	//*  10   22:aload_0         
	//*  11   23:getfield        #67  <Field ModelQueriable modelQueriable>
	//*  12   26:ifnonnull       45
			throw new IllegalStateException("Cannot refresh this FlowCursorList. This list was instantiated from a Cursor. Once closed, we cannot reopen it. Construct a new instance and swap with this instance.");
	//   13   29:new             #144 <Class IllegalStateException>
	//   14   32:dup             
	//   15   33:ldc2            #288 <String "Cannot refresh this FlowCursorList. This list was instantiated from a Cursor. Once closed, we cannot reopen it. Construct a new instance and swap with this instance.">
	//   16   36:invokespecial   #149 <Method void IllegalStateException(String)>
	//   17   39:athrow          
		break MISSING_BLOCK_LABEL_45;
		Exception exception;
		exception;
	//   18   40:astore_2        
		this;
	//   19   41:aload_0         
		JVM INSTR monitorexit ;
	//   20   42:monitorexit     
		throw exception;
	//   21   43:aload_2         
	//   22   44:athrow          
		cursor = modelQueriable.query();
	//   23   45:aload_0         
	//   24   46:aload_0         
	//   25   47:getfield        #67  <Field ModelQueriable modelQueriable>
	//   26   50:invokeinterface #93  <Method Cursor ModelQueriable.query()>
	//   27   55:putfield        #73  <Field Cursor cursor>
		if(!cacheModels) goto _L2; else goto _L1
	//   28   58:aload_0         
	//   29   59:getfield        #99  <Field boolean cacheModels>
	//   30   62:ifeq            87
_L1:
		modelCache.clear();
	//   31   65:aload_0         
	//   32   66:getfield        #111 <Field ModelCache modelCache>
	//   33   69:invokevirtual   #181 <Method void ModelCache.clear()>
		if(cursor != null)
			break MISSING_BLOCK_LABEL_136;
	//   34   72:aload_0         
	//   35   73:getfield        #73  <Field Cursor cursor>
	//   36   76:ifnonnull       136
		int i = 0;
	//   37   79:iconst_0        
	//   38   80:istore_1        
_L3:
		setCacheModels(true, i);
	//   39   81:aload_0         
	//   40   82:iconst_1        
	//   41   83:iload_1         
	//   42   84:invokevirtual   #291 <Method void setCacheModels(boolean, int)>
_L2:
		Set set = cursorRefreshListenerSet;
	//   43   87:aload_0         
	//   44   88:getfield        #55  <Field Set cursorRefreshListenerSet>
	//   45   91:astore_2        
		set;
	//   46   92:aload_2         
		JVM INSTR monitorenter ;
	//   47   93:monitorenter    
		for(Iterator iterator1 = cursorRefreshListenerSet.iterator(); iterator1.hasNext(); ((OnCursorRefreshListener)iterator1.next()).onCursorRefreshed(this));
	//   48   94:aload_0         
	//   49   95:getfield        #55  <Field Set cursorRefreshListenerSet>
	//   50   98:invokeinterface #293 <Method Iterator Set.iterator()>
	//   51  103:astore_3        
	//   52  104:aload_3         
	//   53  105:invokeinterface #298 <Method boolean Iterator.hasNext()>
	//   54  110:ifeq            149
	//   55  113:aload_3         
	//   56  114:invokeinterface #302 <Method Object Iterator.next()>
	//   57  119:checkcast       #18  <Class FlowCursorList$OnCursorRefreshListener>
	//   58  122:aload_0         
	//   59  123:invokeinterface #306 <Method void FlowCursorList$OnCursorRefreshListener.onCursorRefreshed(FlowCursorList)>
		break MISSING_BLOCK_LABEL_149;
	//   60  128:goto            104
		Exception exception1;
		exception1;
	//   61  131:astore_3        
		set;
	//   62  132:aload_2         
		JVM INSTR monitorexit ;
	//   63  133:monitorexit     
		throw exception1;
	//   64  134:aload_3         
	//   65  135:athrow          
		i = cursor.getCount();
	//   66  136:aload_0         
	//   67  137:getfield        #73  <Field Cursor cursor>
	//   68  140:invokeinterface #214 <Method int Cursor.getCount()>
	//   69  145:istore_1        
		  goto _L3
	//*  70  146:goto            81
		set;
	//   71  149:aload_2         
		JVM INSTR monitorexit ;
	//   72  150:monitorexit     
		this;
	//   73  151:aload_0         
		JVM INSTR monitorexit ;
	//   74  152:monitorexit     
	//   75  153:return          
	}

	public void removeOnCursorRefreshListener(OnCursorRefreshListener oncursorrefreshlistener)
	{
		synchronized(cursorRefreshListenerSet)
	//*   0    0:aload_0         
	//*   1    1:getfield        #55  <Field Set cursorRefreshListenerSet>
	//*   2    4:astore_2        
	//*   3    5:aload_2         
	//*   4    6:monitorenter    
		{
			cursorRefreshListenerSet.remove(((Object) (oncursorrefreshlistener)));
	//    5    7:aload_0         
	//    6    8:getfield        #55  <Field Set cursorRefreshListenerSet>
	//    7   11:aload_1         
	//    8   12:invokeinterface #310 <Method boolean Set.remove(Object)>
	//    9   17:pop             
		}
	//   10   18:aload_2         
	//   11   19:monitorexit     
		return;
	//   12   20:return          
		oncursorrefreshlistener;
	//   13   21:astore_1        
		set;
	//   14   22:aload_2         
		JVM INSTR monitorexit ;
	//   15   23:monitorexit     
		throw oncursorrefreshlistener;
	//   16   24:aload_1         
	//   17   25:athrow          
	}

	void setCacheModels(boolean flag)
	{
		int i = 0;
	//    0    0:iconst_0        
	//    1    1:istore_2        
		if(flag)
	//*   2    2:iload_1         
	//*   3    3:ifeq            37
		{
			throwIfCursorClosed();
	//    4    6:aload_0         
	//    5    7:invokespecial   #188 <Method void throwIfCursorClosed()>
			if(cursor != null)
	//*   6   10:aload_0         
	//*   7   11:getfield        #73  <Field Cursor cursor>
	//*   8   14:ifnonnull       24
	//*   9   17:aload_0         
	//*  10   18:iconst_1        
	//*  11   19:iload_2         
	//*  12   20:invokevirtual   #291 <Method void setCacheModels(boolean, int)>
	//*  13   23:return          
				i = cursor.getCount();
	//   14   24:aload_0         
	//   15   25:getfield        #73  <Field Cursor cursor>
	//   16   28:invokeinterface #214 <Method int Cursor.getCount()>
	//   17   33:istore_2        
			setCacheModels(true, i);
			return;
		}
	//*  18   34:goto            17
		if(cursor == null)
	//*  19   37:aload_0         
	//*  20   38:getfield        #73  <Field Cursor cursor>
	//*  21   41:ifnonnull       53
			i = 0;
	//   22   44:iconst_0        
	//   23   45:istore_2        
		else
	//*  24   46:aload_0         
	//*  25   47:iconst_0        
	//*  26   48:iload_2         
	//*  27   49:invokevirtual   #291 <Method void setCacheModels(boolean, int)>
	//*  28   52:return          
			i = cursor.getCount();
	//   29   53:aload_0         
	//   30   54:getfield        #73  <Field Cursor cursor>
	//   31   57:invokeinterface #214 <Method int Cursor.getCount()>
	//   32   62:istore_2        
		setCacheModels(false, i);
	//*  33   63:goto            46
	}

	void setCacheModels(boolean flag, int i)
	{
		cacheModels = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #99  <Field boolean cacheModels>
		if(!flag)
	//*   3    5:iload_1         
	//*   4    6:ifne            14
		{
			clearCache();
	//    5    9:aload_0         
	//    6   10:invokevirtual   #312 <Method void clearCache()>
			return;
	//    7   13:return          
		}
		throwIfCursorClosed();
	//    8   14:aload_0         
	//    9   15:invokespecial   #188 <Method void throwIfCursorClosed()>
		int j = i;
	//   10   18:iload_2         
	//   11   19:istore_3        
		if(i <= 20)
	//*  12   20:iload_2         
	//*  13   21:bipush          20
	//*  14   23:icmpgt          33
			if(i == 0)
	//*  15   26:iload_2         
	//*  16   27:ifne            39
				j = 50;
	//   17   30:bipush          50
	//   18   32:istore_3        
			else
	//*  19   33:aload_0         
	//*  20   34:iload_3         
	//*  21   35:putfield        #105 <Field int cacheSize>
	//*  22   38:return          
				j = 20;
	//   23   39:bipush          20
	//   24   41:istore_3        
		cacheSize = j;
	//*  25   42:goto            33
	}

	public Class table()
	{
		return table;
	//    0    0:aload_0         
	//    1    1:getfield        #61  <Field Class table>
	//    2    4:areturn         
	}

	public static final int DEFAULT_CACHE_SIZE = 50;
	public static final int MIN_CACHE_SIZE = 20;
	private boolean cacheModels;
	private int cacheSize;
	private Cursor cursor;
	private final Set cursorRefreshListenerSet;
	private InstanceAdapter instanceAdapter;
	private ModelCache modelCache;
	private ModelQueriable modelQueriable;
	private Class table;
}

// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.stetho.inspector.helper;

import android.util.SparseArray;
import java.util.IdentityHashMap;
import java.util.Map;

public class ObjectIdMapper
{

	public ObjectIdMapper()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #20  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #4   <Class Object>
	//    4    8:dup             
	//    5    9:invokespecial   #20  <Method void Object()>
	//    6   12:putfield        #22  <Field Object mSync>
		mNextId = 1;
	//    7   15:aload_0         
	//    8   16:iconst_1        
	//    9   17:putfield        #24  <Field int mNextId>
	//   10   20:aload_0         
	//   11   21:new             #26  <Class IdentityHashMap>
	//   12   24:dup             
	//   13   25:invokespecial   #27  <Method void IdentityHashMap()>
	//   14   28:putfield        #29  <Field Map mObjectToIdMap>
		mIdToObjectMap = new SparseArray();
	//   15   31:aload_0         
	//   16   32:new             #31  <Class SparseArray>
	//   17   35:dup             
	//   18   36:invokespecial   #32  <Method void SparseArray()>
	//   19   39:putfield        #34  <Field SparseArray mIdToObjectMap>
	//   20   42:return          
	}

	public void clear()
	{
		SparseArray sparsearray;
		synchronized(mSync)
	//*   0    0:aload_0         
	//*   1    1:getfield        #22  <Field Object mSync>
	//*   2    4:astore          4
	//*   3    6:aload           4
	//*   4    8:monitorenter    
		{
			sparsearray = mIdToObjectMap;
	//    5    9:aload_0         
	//    6   10:getfield        #34  <Field SparseArray mIdToObjectMap>
	//    7   13:astore          5
			mObjectToIdMap.clear();
	//    8   15:aload_0         
	//    9   16:getfield        #29  <Field Map mObjectToIdMap>
	//   10   19:invokeinterface #40  <Method void Map.clear()>
			mIdToObjectMap = new SparseArray();
	//   11   24:aload_0         
	//   12   25:new             #31  <Class SparseArray>
	//   13   28:dup             
	//   14   29:invokespecial   #32  <Method void SparseArray()>
	//   15   32:putfield        #34  <Field SparseArray mIdToObjectMap>
		}
	//   16   35:aload           4
	//   17   37:monitorexit     
		int j = sparsearray.size();
	//   18   38:aload           5
	//   19   40:invokevirtual   #44  <Method int SparseArray.size()>
	//   20   43:istore_2        
		for(int i = 0; i < j; i++)
	//*  21   44:iconst_0        
	//*  22   45:istore_1        
	//*  23   46:iload_1         
	//*  24   47:iload_2         
	//*  25   48:icmpge          76
		{
			int k = sparsearray.keyAt(i);
	//   26   51:aload           5
	//   27   53:iload_1         
	//   28   54:invokevirtual   #48  <Method int SparseArray.keyAt(int)>
	//   29   57:istore_3        
			onUnmapped(sparsearray.valueAt(i), k);
	//   30   58:aload_0         
	//   31   59:aload           5
	//   32   61:iload_1         
	//   33   62:invokevirtual   #52  <Method Object SparseArray.valueAt(int)>
	//   34   65:iload_3         
	//   35   66:invokevirtual   #56  <Method void onUnmapped(Object, int)>
		}

	//   36   69:iload_1         
	//   37   70:iconst_1        
	//   38   71:iadd            
	//   39   72:istore_1        
	//*  40   73:goto            46
		return;
	//   41   76:return          
		exception;
	//   42   77:astore          5
		obj;
	//   43   79:aload           4
		JVM INSTR monitorexit ;
	//   44   81:monitorexit     
		throw exception;
	//   45   82:aload           5
	//   46   84:athrow          
	}

	public boolean containsId(int i)
	{
		Object obj = mSync;
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field Object mSync>
	//    2    4:astore_3        
		obj;
	//    3    5:aload_3         
		JVM INSTR monitorenter ;
	//    4    6:monitorenter    
		boolean flag;
		Exception exception;
		if(mIdToObjectMap.get(i) != null)
	//*   5    7:aload_0         
	//*   6    8:getfield        #34  <Field SparseArray mIdToObjectMap>
	//*   7   11:iload_1         
	//*   8   12:invokevirtual   #61  <Method Object SparseArray.get(int)>
	//*   9   15:ifnull          34
			flag = true;
	//   10   18:iconst_1        
	//   11   19:istore_2        
		else
	//*  12   20:goto            23
	//*  13   23:aload_3         
	//*  14   24:monitorexit     
	//*  15   25:iload_2         
	//*  16   26:ireturn         
	//*  17   27:astore          4
	//*  18   29:aload_3         
	//*  19   30:monitorexit     
	//*  20   31:aload           4
	//*  21   33:athrow          
			flag = false;
	//   22   34:iconst_0        
	//   23   35:istore_2        
		obj;
		JVM INSTR monitorexit ;
		return flag;
		exception;
		obj;
		JVM INSTR monitorexit ;
		throw exception;
	//*  24   36:goto            23
	}

	public boolean containsObject(Object obj)
	{
		boolean flag;
		synchronized(mSync)
	//*   0    0:aload_0         
	//*   1    1:getfield        #22  <Field Object mSync>
	//*   2    4:astore_3        
	//*   3    5:aload_3         
	//*   4    6:monitorenter    
		{
			flag = mObjectToIdMap.containsKey(obj);
	//    5    7:aload_0         
	//    6    8:getfield        #29  <Field Map mObjectToIdMap>
	//    7   11:aload_1         
	//    8   12:invokeinterface #66  <Method boolean Map.containsKey(Object)>
	//    9   17:istore_2        
		}
	//   10   18:aload_3         
	//   11   19:monitorexit     
		return flag;
	//   12   20:iload_2         
	//   13   21:ireturn         
		obj;
	//   14   22:astore_1        
		obj1;
	//   15   23:aload_3         
		JVM INSTR monitorexit ;
	//   16   24:monitorexit     
		throw obj;
	//   17   25:aload_1         
	//   18   26:athrow          
	}

	public Integer getIdForObject(Object obj)
	{
		synchronized(mSync)
	//*   0    0:aload_0         
	//*   1    1:getfield        #22  <Field Object mSync>
	//*   2    4:astore_2        
	//*   3    5:aload_2         
	//*   4    6:monitorenter    
		{
			obj = ((Object) ((Integer)mObjectToIdMap.get(obj)));
	//    5    7:aload_0         
	//    6    8:getfield        #29  <Field Map mObjectToIdMap>
	//    7   11:aload_1         
	//    8   12:invokeinterface #72  <Method Object Map.get(Object)>
	//    9   17:checkcast       #74  <Class Integer>
	//   10   20:astore_1        
		}
	//   11   21:aload_2         
	//   12   22:monitorexit     
		return ((Integer) (obj));
	//   13   23:aload_1         
	//   14   24:areturn         
		obj;
	//   15   25:astore_1        
		obj1;
	//   16   26:aload_2         
		JVM INSTR monitorexit ;
	//   17   27:monitorexit     
		throw obj;
	//   18   28:aload_1         
	//   19   29:athrow          
	}

	public Object getObjectForId(int i)
	{
		Object obj1;
		synchronized(mSync)
	//*   0    0:aload_0         
	//*   1    1:getfield        #22  <Field Object mSync>
	//*   2    4:astore_2        
	//*   3    5:aload_2         
	//*   4    6:monitorenter    
		{
			obj1 = mIdToObjectMap.get(i);
	//    5    7:aload_0         
	//    6    8:getfield        #34  <Field SparseArray mIdToObjectMap>
	//    7   11:iload_1         
	//    8   12:invokevirtual   #61  <Method Object SparseArray.get(int)>
	//    9   15:astore_3        
		}
	//   10   16:aload_2         
	//   11   17:monitorexit     
		return obj1;
	//   12   18:aload_3         
	//   13   19:areturn         
		exception;
	//   14   20:astore_3        
		obj;
	//   15   21:aload_2         
		JVM INSTR monitorexit ;
	//   16   22:monitorexit     
		throw exception;
	//   17   23:aload_3         
	//   18   24:athrow          
	}

	protected void onMapped(Object obj, int i)
	{
	//    0    0:return          
	}

	protected void onUnmapped(Object obj, int i)
	{
	//    0    0:return          
	}

	public int putObject(Object obj)
	{
		Object obj1 = mSync;
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field Object mSync>
	//    2    4:astore_3        
		obj1;
	//    3    5:aload_3         
		JVM INSTR monitorenter ;
	//    4    6:monitorenter    
		Integer integer = (Integer)mObjectToIdMap.get(obj);
	//    5    7:aload_0         
	//    6    8:getfield        #29  <Field Map mObjectToIdMap>
	//    7   11:aload_1         
	//    8   12:invokeinterface #72  <Method Object Map.get(Object)>
	//    9   17:checkcast       #74  <Class Integer>
	//   10   20:astore          4
		if(integer == null)
			break MISSING_BLOCK_LABEL_37;
	//   11   22:aload           4
	//   12   24:ifnull          37
		int i = integer.intValue();
	//   13   27:aload           4
	//   14   29:invokevirtual   #82  <Method int Integer.intValue()>
	//   15   32:istore_2        
		obj1;
	//   16   33:aload_3         
		JVM INSTR monitorexit ;
	//   17   34:monitorexit     
		return i;
	//   18   35:iload_2         
	//   19   36:ireturn         
		int j = mNextId;
	//   20   37:aload_0         
	//   21   38:getfield        #24  <Field int mNextId>
	//   22   41:istore_2        
		mNextId = j + 1;
	//   23   42:aload_0         
	//   24   43:iload_2         
	//   25   44:iconst_1        
	//   26   45:iadd            
	//   27   46:putfield        #24  <Field int mNextId>
		integer = Integer.valueOf(j);
	//   28   49:iload_2         
	//   29   50:invokestatic    #86  <Method Integer Integer.valueOf(int)>
	//   30   53:astore          4
		mObjectToIdMap.put(obj, ((Object) (integer)));
	//   31   55:aload_0         
	//   32   56:getfield        #29  <Field Map mObjectToIdMap>
	//   33   59:aload_1         
	//   34   60:aload           4
	//   35   62:invokeinterface #90  <Method Object Map.put(Object, Object)>
	//   36   67:pop             
		mIdToObjectMap.put(integer.intValue(), obj);
	//   37   68:aload_0         
	//   38   69:getfield        #34  <Field SparseArray mIdToObjectMap>
	//   39   72:aload           4
	//   40   74:invokevirtual   #82  <Method int Integer.intValue()>
	//   41   77:aload_1         
	//   42   78:invokevirtual   #93  <Method void SparseArray.put(int, Object)>
		obj1;
	//   43   81:aload_3         
		JVM INSTR monitorexit ;
	//   44   82:monitorexit     
		onMapped(obj, integer.intValue());
	//   45   83:aload_0         
	//   46   84:aload_1         
	//   47   85:aload           4
	//   48   87:invokevirtual   #82  <Method int Integer.intValue()>
	//   49   90:invokevirtual   #95  <Method void onMapped(Object, int)>
		return integer.intValue();
	//   50   93:aload           4
	//   51   95:invokevirtual   #82  <Method int Integer.intValue()>
	//   52   98:ireturn         
		obj;
	//   53   99:astore_1        
		obj1;
	//   54  100:aload_3         
		JVM INSTR monitorexit ;
	//   55  101:monitorexit     
		throw obj;
	//   56  102:aload_1         
	//   57  103:athrow          
	}

	public Integer removeObject(Object obj)
	{
		Object obj1 = mSync;
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field Object mSync>
	//    2    4:astore_2        
		obj1;
	//    3    5:aload_2         
		JVM INSTR monitorenter ;
	//    4    6:monitorenter    
		Integer integer = (Integer)mObjectToIdMap.remove(obj);
	//    5    7:aload_0         
	//    6    8:getfield        #29  <Field Map mObjectToIdMap>
	//    7   11:aload_1         
	//    8   12:invokeinterface #99  <Method Object Map.remove(Object)>
	//    9   17:checkcast       #74  <Class Integer>
	//   10   20:astore_3        
		if(integer != null)
			break MISSING_BLOCK_LABEL_29;
	//   11   21:aload_3         
	//   12   22:ifnonnull       29
		obj1;
	//   13   25:aload_2         
		JVM INSTR monitorexit ;
	//   14   26:monitorexit     
		return null;
	//   15   27:aconst_null     
	//   16   28:areturn         
		mIdToObjectMap.remove(integer.intValue());
	//   17   29:aload_0         
	//   18   30:getfield        #34  <Field SparseArray mIdToObjectMap>
	//   19   33:aload_3         
	//   20   34:invokevirtual   #82  <Method int Integer.intValue()>
	//   21   37:invokevirtual   #102 <Method void SparseArray.remove(int)>
		obj1;
	//   22   40:aload_2         
		JVM INSTR monitorexit ;
	//   23   41:monitorexit     
		onUnmapped(obj, integer.intValue());
	//   24   42:aload_0         
	//   25   43:aload_1         
	//   26   44:aload_3         
	//   27   45:invokevirtual   #82  <Method int Integer.intValue()>
	//   28   48:invokevirtual   #56  <Method void onUnmapped(Object, int)>
		return integer;
	//   29   51:aload_3         
	//   30   52:areturn         
		obj;
	//   31   53:astore_1        
		obj1;
	//   32   54:aload_2         
		JVM INSTR monitorexit ;
	//   33   55:monitorexit     
		throw obj;
	//   34   56:aload_1         
	//   35   57:athrow          
	}

	public Object removeObjectById(int i)
	{
		Object obj = mSync;
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field Object mSync>
	//    2    4:astore_2        
		obj;
	//    3    5:aload_2         
		JVM INSTR monitorenter ;
	//    4    6:monitorenter    
		Object obj1 = mIdToObjectMap.get(i);
	//    5    7:aload_0         
	//    6    8:getfield        #34  <Field SparseArray mIdToObjectMap>
	//    7   11:iload_1         
	//    8   12:invokevirtual   #61  <Method Object SparseArray.get(int)>
	//    9   15:astore_3        
		if(obj1 != null)
			break MISSING_BLOCK_LABEL_24;
	//   10   16:aload_3         
	//   11   17:ifnonnull       24
		obj;
	//   12   20:aload_2         
		JVM INSTR monitorexit ;
	//   13   21:monitorexit     
		return ((Object) (null));
	//   14   22:aconst_null     
	//   15   23:areturn         
		mIdToObjectMap.remove(i);
	//   16   24:aload_0         
	//   17   25:getfield        #34  <Field SparseArray mIdToObjectMap>
	//   18   28:iload_1         
	//   19   29:invokevirtual   #102 <Method void SparseArray.remove(int)>
		mObjectToIdMap.remove(obj1);
	//   20   32:aload_0         
	//   21   33:getfield        #29  <Field Map mObjectToIdMap>
	//   22   36:aload_3         
	//   23   37:invokeinterface #99  <Method Object Map.remove(Object)>
	//   24   42:pop             
		obj;
	//   25   43:aload_2         
		JVM INSTR monitorexit ;
	//   26   44:monitorexit     
		onUnmapped(obj1, i);
	//   27   45:aload_0         
	//   28   46:aload_3         
	//   29   47:iload_1         
	//   30   48:invokevirtual   #56  <Method void onUnmapped(Object, int)>
		return obj1;
	//   31   51:aload_3         
	//   32   52:areturn         
		Exception exception;
		exception;
	//   33   53:astore_3        
		obj;
	//   34   54:aload_2         
		JVM INSTR monitorexit ;
	//   35   55:monitorexit     
		throw exception;
	//   36   56:aload_3         
	//   37   57:athrow          
	}

	public int size()
	{
		int i;
		synchronized(mSync)
	//*   0    0:aload_0         
	//*   1    1:getfield        #22  <Field Object mSync>
	//*   2    4:astore_2        
	//*   3    5:aload_2         
	//*   4    6:monitorenter    
		{
			i = mObjectToIdMap.size();
	//    5    7:aload_0         
	//    6    8:getfield        #29  <Field Map mObjectToIdMap>
	//    7   11:invokeinterface #104 <Method int Map.size()>
	//    8   16:istore_1        
		}
	//    9   17:aload_2         
	//   10   18:monitorexit     
		return i;
	//   11   19:iload_1         
	//   12   20:ireturn         
		exception;
	//   13   21:astore_3        
		obj;
	//   14   22:aload_2         
		JVM INSTR monitorexit ;
	//   15   23:monitorexit     
		throw exception;
	//   16   24:aload_3         
	//   17   25:athrow          
	}

	private SparseArray mIdToObjectMap;
	private int mNextId;
	private final Map mObjectToIdMap = new IdentityHashMap();
	protected final Object mSync = new Object();
}

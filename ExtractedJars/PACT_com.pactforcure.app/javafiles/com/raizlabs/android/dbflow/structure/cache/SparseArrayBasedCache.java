// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.raizlabs.android.dbflow.structure.cache;

import android.util.SparseArray;
import com.raizlabs.android.dbflow.config.FlowLog;

// Referenced classes of package com.raizlabs.android.dbflow.structure.cache:
//			ModelCache

public class SparseArrayBasedCache extends ModelCache
{

	public SparseArrayBasedCache()
	{
		super(((Object) (new SparseArray())));
	//    0    0:aload_0         
	//    1    1:new             #9   <Class SparseArray>
	//    2    4:dup             
	//    3    5:invokespecial   #11  <Method void SparseArray()>
	//    4    8:invokespecial   #14  <Method void ModelCache(Object)>
	//    5   11:return          
	}

	public SparseArrayBasedCache(int i)
	{
		super(((Object) (new SparseArray(i))));
	//    0    0:aload_0         
	//    1    1:new             #9   <Class SparseArray>
	//    2    4:dup             
	//    3    5:iload_1         
	//    4    6:invokespecial   #18  <Method void SparseArray(int)>
	//    5    9:invokespecial   #14  <Method void ModelCache(Object)>
	//    6   12:return          
	}

	public SparseArrayBasedCache(SparseArray sparsearray)
	{
		super(((Object) (sparsearray)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #14  <Method void ModelCache(Object)>
	//    3    5:return          
	}

	public void addModel(Object obj, Object obj1)
	{
		if(obj instanceof Number)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #25  <Class Number>
	//*   2    4:ifeq            43
		{
			synchronized((SparseArray)getCache())
	//*   3    7:aload_0         
	//*   4    8:invokevirtual   #29  <Method Object getCache()>
	//*   5   11:checkcast       #9   <Class SparseArray>
	//*   6   14:astore_3        
	//*   7   15:aload_3         
	//*   8   16:monitorenter    
			{
				((SparseArray)getCache()).put(((Number)obj).intValue(), obj1);
	//    9   17:aload_0         
	//   10   18:invokevirtual   #29  <Method Object getCache()>
	//   11   21:checkcast       #9   <Class SparseArray>
	//   12   24:aload_1         
	//   13   25:checkcast       #25  <Class Number>
	//   14   28:invokevirtual   #33  <Method int Number.intValue()>
	//   15   31:aload_2         
	//   16   32:invokevirtual   #37  <Method void SparseArray.put(int, Object)>
			}
	//   17   35:aload_3         
	//   18   36:monitorexit     
			return;
	//   19   37:return          
		} else
	//*  20   38:astore_1        
	//*  21   39:aload_3         
	//*  22   40:monitorexit     
	//*  23   41:aload_1         
	//*  24   42:athrow          
		{
			throw new IllegalArgumentException("A SparseArrayBasedCache must use an id that can cast to a Number to convert it into a int");
	//   25   43:new             #39  <Class IllegalArgumentException>
	//   26   46:dup             
	//   27   47:ldc1            #41  <String "A SparseArrayBasedCache must use an id that can cast to a Number to convert it into a int">
	//   28   49:invokespecial   #44  <Method void IllegalArgumentException(String)>
	//   29   52:athrow          
		}
		obj;
		sparsearray;
		JVM INSTR monitorexit ;
		throw obj;
	}

	public void clear()
	{
		synchronized((SparseArray)getCache())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #29  <Method Object getCache()>
	//*   2    4:checkcast       #9   <Class SparseArray>
	//*   3    7:astore_1        
	//*   4    8:aload_1         
	//*   5    9:monitorenter    
		{
			((SparseArray)getCache()).clear();
	//    6   10:aload_0         
	//    7   11:invokevirtual   #29  <Method Object getCache()>
	//    8   14:checkcast       #9   <Class SparseArray>
	//    9   17:invokevirtual   #48  <Method void SparseArray.clear()>
		}
	//   10   20:aload_1         
	//   11   21:monitorexit     
		return;
	//   12   22:return          
		exception;
	//   13   23:astore_2        
		sparsearray;
	//   14   24:aload_1         
		JVM INSTR monitorexit ;
	//   15   25:monitorexit     
		throw exception;
	//   16   26:aload_2         
	//   17   27:athrow          
	}

	public Object get(Object obj)
	{
		if(obj instanceof Number)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #25  <Class Number>
	//*   2    4:ifeq            25
			return ((SparseArray)getCache()).get(((Number)obj).intValue());
	//    3    7:aload_0         
	//    4    8:invokevirtual   #29  <Method Object getCache()>
	//    5   11:checkcast       #9   <Class SparseArray>
	//    6   14:aload_1         
	//    7   15:checkcast       #25  <Class Number>
	//    8   18:invokevirtual   #33  <Method int Number.intValue()>
	//    9   21:invokevirtual   #53  <Method Object SparseArray.get(int)>
	//   10   24:areturn         
		else
			throw new IllegalArgumentException("A SparseArrayBasedCache uses an id that can cast to a Number to convert it into a int");
	//   11   25:new             #39  <Class IllegalArgumentException>
	//   12   28:dup             
	//   13   29:ldc1            #55  <String "A SparseArrayBasedCache uses an id that can cast to a Number to convert it into a int">
	//   14   31:invokespecial   #44  <Method void IllegalArgumentException(String)>
	//   15   34:athrow          
	}

	public Object removeModel(Object obj)
	{
		Object obj1 = get(obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #59  <Method Object get(Object)>
	//    3    5:astore_3        
		synchronized((SparseArray)getCache())
	//*   4    6:aload_0         
	//*   5    7:invokevirtual   #29  <Method Object getCache()>
	//*   6   10:checkcast       #9   <Class SparseArray>
	//*   7   13:astore_2        
	//*   8   14:aload_2         
	//*   9   15:monitorenter    
		{
			((SparseArray)getCache()).remove(((Number)obj).intValue());
	//   10   16:aload_0         
	//   11   17:invokevirtual   #29  <Method Object getCache()>
	//   12   20:checkcast       #9   <Class SparseArray>
	//   13   23:aload_1         
	//   14   24:checkcast       #25  <Class Number>
	//   15   27:invokevirtual   #33  <Method int Number.intValue()>
	//   16   30:invokevirtual   #62  <Method void SparseArray.remove(int)>
		}
	//   17   33:aload_2         
	//   18   34:monitorexit     
		return obj1;
	//   19   35:aload_3         
	//   20   36:areturn         
		obj;
	//   21   37:astore_1        
		sparsearray;
	//   22   38:aload_2         
		JVM INSTR monitorexit ;
	//   23   39:monitorexit     
		throw obj;
	//   24   40:aload_1         
	//   25   41:athrow          
	}

	public void setCacheSize(int i)
	{
		FlowLog.log(com.raizlabs.android.dbflow.config.FlowLog.Level.I, (new StringBuilder()).append("The cache size for ").append(((Class) (com/raizlabs/android/dbflow/structure/cache/SparseArrayBasedCache)).getSimpleName()).append(" is not re-configurable.").toString());
	//    0    0:getstatic       #69  <Field com.raizlabs.android.dbflow.config.FlowLog$Level com.raizlabs.android.dbflow.config.FlowLog$Level.I>
	//    1    3:new             #71  <Class StringBuilder>
	//    2    6:dup             
	//    3    7:invokespecial   #72  <Method void StringBuilder()>
	//    4   10:ldc1            #74  <String "The cache size for ">
	//    5   12:invokevirtual   #78  <Method StringBuilder StringBuilder.append(String)>
	//    6   15:ldc1            #2   <Class SparseArrayBasedCache>
	//    7   17:invokevirtual   #84  <Method String Class.getSimpleName()>
	//    8   20:invokevirtual   #78  <Method StringBuilder StringBuilder.append(String)>
	//    9   23:ldc1            #86  <String " is not re-configurable.">
	//   10   25:invokevirtual   #78  <Method StringBuilder StringBuilder.append(String)>
	//   11   28:invokevirtual   #89  <Method String StringBuilder.toString()>
	//   12   31:invokestatic    #95  <Method void FlowLog.log(com.raizlabs.android.dbflow.config.FlowLog$Level, String)>
	//   13   34:return          
	}
}

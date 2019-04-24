// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.nostra13.universalimageloader.cache.memory.impl;

import android.graphics.Bitmap;
import com.nostra13.universalimageloader.cache.memory.LimitedMemoryCache;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.*;

public class UsingFreqLimitedMemoryCache extends LimitedMemoryCache
{

	public UsingFreqLimitedMemoryCache(int i)
	{
		super(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #11  <Method void LimitedMemoryCache(int)>
	//    3    5:aload_0         
	//    4    6:new             #13  <Class HashMap>
	//    5    9:dup             
	//    6   10:invokespecial   #16  <Method void HashMap()>
	//    7   13:invokestatic    #22  <Method Map Collections.synchronizedMap(Map)>
	//    8   16:putfield        #24  <Field Map usingCounts>
	//    9   19:return          
	}

	public void clear()
	{
		usingCounts.clear();
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field Map usingCounts>
	//    2    4:invokeinterface #30  <Method void Map.clear()>
		super.clear();
	//    3    9:aload_0         
	//    4   10:invokespecial   #31  <Method void LimitedMemoryCache.clear()>
	//    5   13:return          
	}

	protected Reference createReference(Bitmap bitmap)
	{
		return ((Reference) (new WeakReference(((Object) (bitmap)))));
	//    0    0:new             #35  <Class WeakReference>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:invokespecial   #38  <Method void WeakReference(Object)>
	//    4    8:areturn         
	}

	public Bitmap get(String s)
	{
		s = ((String) (super.get(s)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #44  <Method Bitmap LimitedMemoryCache.get(String)>
	//    3    5:astore_1        
		if(s != null)
	//*   4    6:aload_1         
	//*   5    7:ifnull          48
		{
			Integer integer = (Integer)usingCounts.get(((Object) (s)));
	//    6   10:aload_0         
	//    7   11:getfield        #24  <Field Map usingCounts>
	//    8   14:aload_1         
	//    9   15:invokeinterface #47  <Method Object Map.get(Object)>
	//   10   20:checkcast       #49  <Class Integer>
	//   11   23:astore_2        
			if(integer != null)
	//*  12   24:aload_2         
	//*  13   25:ifnull          48
				usingCounts.put(((Object) (s)), ((Object) (Integer.valueOf(integer.intValue() + 1))));
	//   14   28:aload_0         
	//   15   29:getfield        #24  <Field Map usingCounts>
	//   16   32:aload_1         
	//   17   33:aload_2         
	//   18   34:invokevirtual   #53  <Method int Integer.intValue()>
	//   19   37:iconst_1        
	//   20   38:iadd            
	//   21   39:invokestatic    #57  <Method Integer Integer.valueOf(int)>
	//   22   42:invokeinterface #61  <Method Object Map.put(Object, Object)>
	//   23   47:pop             
		}
		return ((Bitmap) (s));
	//   24   48:aload_1         
	//   25   49:areturn         
	}

	protected int getSize(Bitmap bitmap)
	{
		return bitmap.getRowBytes() * bitmap.getHeight();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #68  <Method int Bitmap.getRowBytes()>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #71  <Method int Bitmap.getHeight()>
	//    4    8:imul            
	//    5    9:ireturn         
	}

	public boolean put(String s, Bitmap bitmap)
	{
		if(super.put(s, bitmap))
	//*   0    0:aload_0         
	//*   1    1:aload_1         
	//*   2    2:aload_2         
	//*   3    3:invokespecial   #74  <Method boolean LimitedMemoryCache.put(String, Bitmap)>
	//*   4    6:ifeq            26
		{
			usingCounts.put(((Object) (bitmap)), ((Object) (Integer.valueOf(0))));
	//    5    9:aload_0         
	//    6   10:getfield        #24  <Field Map usingCounts>
	//    7   13:aload_2         
	//    8   14:iconst_0        
	//    9   15:invokestatic    #57  <Method Integer Integer.valueOf(int)>
	//   10   18:invokeinterface #61  <Method Object Map.put(Object, Object)>
	//   11   23:pop             
			return true;
	//   12   24:iconst_1        
	//   13   25:ireturn         
		} else
		{
			return false;
	//   14   26:iconst_0        
	//   15   27:ireturn         
		}
	}

	public Bitmap remove(String s)
	{
		Bitmap bitmap = super.get(s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #44  <Method Bitmap LimitedMemoryCache.get(String)>
	//    3    5:astore_2        
		if(bitmap != null)
	//*   4    6:aload_2         
	//*   5    7:ifnull          21
			usingCounts.remove(((Object) (bitmap)));
	//    6   10:aload_0         
	//    7   11:getfield        #24  <Field Map usingCounts>
	//    8   14:aload_2         
	//    9   15:invokeinterface #77  <Method Object Map.remove(Object)>
	//   10   20:pop             
		return super.remove(s);
	//   11   21:aload_0         
	//   12   22:aload_1         
	//   13   23:invokespecial   #79  <Method Bitmap LimitedMemoryCache.remove(String)>
	//   14   26:areturn         
	}

	protected Bitmap removeNext()
	{
		Object obj = ((Object) (usingCounts.entrySet()));
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field Map usingCounts>
	//    2    4:invokeinterface #85  <Method Set Map.entrySet()>
	//    3    9:astore_1        
		Map map = usingCounts;
	//    4   10:aload_0         
	//    5   11:getfield        #24  <Field Map usingCounts>
	//    6   14:astore          4
		map;
	//    7   16:aload           4
		JVM INSTR monitorenter ;
	//    8   18:monitorenter    
		Iterator iterator = ((Set) (obj)).iterator();
	//    9   19:aload_1         
	//   10   20:invokeinterface #91  <Method Iterator Set.iterator()>
	//   11   25:astore          5
		Integer integer;
		obj = null;
	//   12   27:aconst_null     
	//   13   28:astore_1        
		integer = null;
	//   14   29:aconst_null     
	//   15   30:astore_2        
_L2:
		java.util.Map.Entry entry;
		if(!iterator.hasNext())
			break; /* Loop/switch isn't completed */
	//   16   31:aload           5
	//   17   33:invokeinterface #97  <Method boolean Iterator.hasNext()>
	//   18   38:ifeq            120
		entry = (java.util.Map.Entry)iterator.next();
	//   19   41:aload           5
	//   20   43:invokeinterface #101 <Method Object Iterator.next()>
	//   21   48:checkcast       #103 <Class java.util.Map$Entry>
	//   22   51:astore          6
		if(obj != null)
			break MISSING_BLOCK_LABEL_82;
	//   23   53:aload_1         
	//   24   54:ifnonnull       82
		obj = ((Object) ((Bitmap)entry.getKey()));
	//   25   57:aload           6
	//   26   59:invokeinterface #106 <Method Object java.util.Map$Entry.getKey()>
	//   27   64:checkcast       #65  <Class Bitmap>
	//   28   67:astore_1        
		integer = (Integer)entry.getValue();
	//   29   68:aload           6
	//   30   70:invokeinterface #109 <Method Object java.util.Map$Entry.getValue()>
	//   31   75:checkcast       #49  <Class Integer>
	//   32   78:astore_2        
		continue; /* Loop/switch isn't completed */
	//   33   79:goto            31
		Integer integer1;
		integer1 = (Integer)entry.getValue();
	//   34   82:aload           6
	//   35   84:invokeinterface #109 <Method Object java.util.Map$Entry.getValue()>
	//   36   89:checkcast       #49  <Class Integer>
	//   37   92:astore_3        
		if(integer1.intValue() >= integer.intValue())
			continue; /* Loop/switch isn't completed */
	//   38   93:aload_3         
	//   39   94:invokevirtual   #53  <Method int Integer.intValue()>
	//   40   97:aload_2         
	//   41   98:invokevirtual   #53  <Method int Integer.intValue()>
	//   42  101:icmpge          31
		obj = ((Object) ((Bitmap)entry.getKey()));
	//   43  104:aload           6
	//   44  106:invokeinterface #106 <Method Object java.util.Map$Entry.getKey()>
	//   45  111:checkcast       #65  <Class Bitmap>
	//   46  114:astore_1        
		integer = integer1;
	//   47  115:aload_3         
	//   48  116:astore_2        
		if(true) goto _L2; else goto _L1
	//   49  117:goto            31
_L1:
		map;
	//   50  120:aload           4
		JVM INSTR monitorexit ;
	//   51  122:monitorexit     
		usingCounts.remove(obj);
	//   52  123:aload_0         
	//   53  124:getfield        #24  <Field Map usingCounts>
	//   54  127:aload_1         
	//   55  128:invokeinterface #77  <Method Object Map.remove(Object)>
	//   56  133:pop             
		return ((Bitmap) (obj));
	//   57  134:aload_1         
	//   58  135:areturn         
		Exception exception;
		exception;
	//   59  136:astore_1        
		map;
	//   60  137:aload           4
		JVM INSTR monitorexit ;
	//   61  139:monitorexit     
		throw exception;
	//   62  140:aload_1         
	//   63  141:athrow          
	}

	private final Map usingCounts = Collections.synchronizedMap(((Map) (new HashMap())));
}

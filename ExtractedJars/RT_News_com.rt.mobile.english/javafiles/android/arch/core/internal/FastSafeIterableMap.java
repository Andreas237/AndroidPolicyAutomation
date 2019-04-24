// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.arch.core.internal;

import java.util.HashMap;

// Referenced classes of package android.arch.core.internal:
//			SafeIterableMap

public class FastSafeIterableMap extends SafeIterableMap
{

	public FastSafeIterableMap()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void SafeIterableMap()>
		mHashMap = new HashMap();
	//    2    4:aload_0         
	//    3    5:new             #18  <Class HashMap>
	//    4    8:dup             
	//    5    9:invokespecial   #19  <Method void HashMap()>
	//    6   12:putfield        #21  <Field HashMap mHashMap>
	//    7   15:return          
	}

	public java.util.Map.Entry ceil(Object obj)
	{
		if(contains(obj))
	//*   0    0:aload_0         
	//*   1    1:aload_1         
	//*   2    2:invokevirtual   #28  <Method boolean contains(Object)>
	//*   3    5:ifeq            23
			return ((java.util.Map.Entry) (((SafeIterableMap.Entry)mHashMap.get(obj)).mPrevious));
	//    4    8:aload_0         
	//    5    9:getfield        #21  <Field HashMap mHashMap>
	//    6   12:aload_1         
	//    7   13:invokevirtual   #32  <Method Object HashMap.get(Object)>
	//    8   16:checkcast       #34  <Class SafeIterableMap$Entry>
	//    9   19:getfield        #38  <Field SafeIterableMap$Entry SafeIterableMap$Entry.mPrevious>
	//   10   22:areturn         
		else
			return null;
	//   11   23:aconst_null     
	//   12   24:areturn         
	}

	public boolean contains(Object obj)
	{
		return mHashMap.containsKey(obj);
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field HashMap mHashMap>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #43  <Method boolean HashMap.containsKey(Object)>
	//    4    8:ireturn         
	}

	protected SafeIterableMap.Entry get(Object obj)
	{
		return (SafeIterableMap.Entry)mHashMap.get(obj);
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field HashMap mHashMap>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #32  <Method Object HashMap.get(Object)>
	//    4    8:checkcast       #34  <Class SafeIterableMap$Entry>
	//    5   11:areturn         
	}

	public Object putIfAbsent(Object obj, Object obj1)
	{
		SafeIterableMap.Entry entry = get(obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #51  <Method SafeIterableMap$Entry get(Object)>
	//    3    5:astore_3        
		if(entry != null)
	//*   4    6:aload_3         
	//*   5    7:ifnull          15
		{
			return entry.mValue;
	//    6   10:aload_3         
	//    7   11:getfield        #55  <Field Object SafeIterableMap$Entry.mValue>
	//    8   14:areturn         
		} else
		{
			mHashMap.put(obj, ((Object) (put(obj, obj1))));
	//    9   15:aload_0         
	//   10   16:getfield        #21  <Field HashMap mHashMap>
	//   11   19:aload_1         
	//   12   20:aload_0         
	//   13   21:aload_1         
	//   14   22:aload_2         
	//   15   23:invokevirtual   #59  <Method SafeIterableMap$Entry put(Object, Object)>
	//   16   26:invokevirtual   #61  <Method Object HashMap.put(Object, Object)>
	//   17   29:pop             
			return ((Object) (null));
	//   18   30:aconst_null     
	//   19   31:areturn         
		}
	}

	public Object remove(Object obj)
	{
		Object obj1 = super.remove(obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #66  <Method Object SafeIterableMap.remove(Object)>
	//    3    5:astore_2        
		mHashMap.remove(obj);
	//    4    6:aload_0         
	//    5    7:getfield        #21  <Field HashMap mHashMap>
	//    6   10:aload_1         
	//    7   11:invokevirtual   #67  <Method Object HashMap.remove(Object)>
	//    8   14:pop             
		return obj1;
	//    9   15:aload_2         
	//   10   16:areturn         
	}

	private HashMap mHashMap;
}

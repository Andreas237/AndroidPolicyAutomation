// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.load;

import android.support.v4.util.ArrayMap;
import java.security.MessageDigest;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.bumptech.glide.load:
//			Key, Option

public final class Options
	implements Key
{

	public Options()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #15  <Class ArrayMap>
	//    4    8:dup             
	//    5    9:invokespecial   #16  <Method void ArrayMap()>
	//    6   12:putfield        #18  <Field ArrayMap values>
	//    7   15:return          
	}

	private static void updateDiskCacheKey(Option option, Object obj, MessageDigest messagedigest)
	{
		option.update(obj, messagedigest);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #27  <Method void Option.update(Object, MessageDigest)>
	//    4    6:return          
	}

	public boolean equals(Object obj)
	{
		if(obj instanceof Options)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #2   <Class Options>
	//*   2    4:ifeq            24
		{
			obj = ((Object) ((Options)obj));
	//    3    7:aload_1         
	//    4    8:checkcast       #2   <Class Options>
	//    5   11:astore_1        
			return values.equals(((Object) (((Options) (obj)).values)));
	//    6   12:aload_0         
	//    7   13:getfield        #18  <Field ArrayMap values>
	//    8   16:aload_1         
	//    9   17:getfield        #18  <Field ArrayMap values>
	//   10   20:invokevirtual   #33  <Method boolean ArrayMap.equals(Object)>
	//   11   23:ireturn         
		} else
		{
			return false;
	//   12   24:iconst_0        
	//   13   25:ireturn         
		}
	}

	public Object get(Option option)
	{
		if(values.containsKey(((Object) (option))))
	//*   0    0:aload_0         
	//*   1    1:getfield        #18  <Field ArrayMap values>
	//*   2    4:aload_1         
	//*   3    5:invokevirtual   #38  <Method boolean ArrayMap.containsKey(Object)>
	//*   4    8:ifeq            20
			return values.get(((Object) (option)));
	//    5   11:aload_0         
	//    6   12:getfield        #18  <Field ArrayMap values>
	//    7   15:aload_1         
	//    8   16:invokevirtual   #41  <Method Object ArrayMap.get(Object)>
	//    9   19:areturn         
		else
			return option.getDefaultValue();
	//   10   20:aload_1         
	//   11   21:invokevirtual   #45  <Method Object Option.getDefaultValue()>
	//   12   24:areturn         
	}

	public int hashCode()
	{
		return values.hashCode();
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field ArrayMap values>
	//    2    4:invokevirtual   #50  <Method int ArrayMap.hashCode()>
	//    3    7:ireturn         
	}

	public void putAll(Options options)
	{
		values.putAll(((android.support.v4.util.SimpleArrayMap) (options.values)));
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field ArrayMap values>
	//    2    4:aload_1         
	//    3    5:getfield        #18  <Field ArrayMap values>
	//    4    8:invokevirtual   #55  <Method void ArrayMap.putAll(android.support.v4.util.SimpleArrayMap)>
	//    5   11:return          
	}

	public Options set(Option option, Object obj)
	{
		values.put(((Object) (option)), obj);
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field ArrayMap values>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #61  <Method Object ArrayMap.put(Object, Object)>
	//    5    9:pop             
		return this;
	//    6   10:aload_0         
	//    7   11:areturn         
	}

	public String toString()
	{
		return (new StringBuilder()).append("Options{values=").append(((Object) (values))).append('}').toString();
	//    0    0:new             #66  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #67  <Method void StringBuilder()>
	//    3    7:ldc1            #69  <String "Options{values=">
	//    4    9:invokevirtual   #73  <Method StringBuilder StringBuilder.append(String)>
	//    5   12:aload_0         
	//    6   13:getfield        #18  <Field ArrayMap values>
	//    7   16:invokevirtual   #76  <Method StringBuilder StringBuilder.append(Object)>
	//    8   19:bipush          125
	//    9   21:invokevirtual   #79  <Method StringBuilder StringBuilder.append(char)>
	//   10   24:invokevirtual   #81  <Method String StringBuilder.toString()>
	//   11   27:areturn         
	}

	public void updateDiskCacheKey(MessageDigest messagedigest)
	{
		java.util.Map.Entry entry;
		for(Iterator iterator = values.entrySet().iterator(); iterator.hasNext(); updateDiskCacheKey((Option)entry.getKey(), entry.getValue(), messagedigest))
	//*   0    0:aload_0         
	//*   1    1:getfield        #18  <Field ArrayMap values>
	//*   2    4:invokevirtual   #86  <Method Set ArrayMap.entrySet()>
	//*   3    7:invokeinterface #92  <Method Iterator Set.iterator()>
	//*   4   12:astore_2        
	//*   5   13:aload_2         
	//*   6   14:invokeinterface #98  <Method boolean Iterator.hasNext()>
	//*   7   19:ifeq            54
			entry = (java.util.Map.Entry)iterator.next();
	//    8   22:aload_2         
	//    9   23:invokeinterface #101 <Method Object Iterator.next()>
	//   10   28:checkcast       #103 <Class java.util.Map$Entry>
	//   11   31:astore_3        

	//   12   32:aload_3         
	//   13   33:invokeinterface #106 <Method Object java.util.Map$Entry.getKey()>
	//   14   38:checkcast       #23  <Class Option>
	//   15   41:aload_3         
	//   16   42:invokeinterface #109 <Method Object java.util.Map$Entry.getValue()>
	//   17   47:aload_1         
	//   18   48:invokestatic    #111 <Method void updateDiskCacheKey(Option, Object, MessageDigest)>
	//*  19   51:goto            13
	//   20   54:return          
	}

	private final ArrayMap values = new ArrayMap();
}

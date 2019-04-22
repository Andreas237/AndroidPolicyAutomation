// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.load;

import android.support.v4.util.ArrayMap;
import com.bumptech.glide.util.CachedHashCodeArrayMap;
import java.security.MessageDigest;

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
	//    3    5:new             #15  <Class CachedHashCodeArrayMap>
	//    4    8:dup             
	//    5    9:invokespecial   #16  <Method void CachedHashCodeArrayMap()>
	//    6   12:putfield        #18  <Field ArrayMap values>
	//    7   15:return          
	}

	private static void updateDiskCacheKey(Option option, Object obj, MessageDigest messagedigest)
	{
		option.update(obj, messagedigest);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #28  <Method void Option.update(Object, MessageDigest)>
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
	//   10   20:invokevirtual   #37  <Method boolean ArrayMap.equals(Object)>
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
	//*   3    5:invokevirtual   #43  <Method boolean ArrayMap.containsKey(Object)>
	//*   4    8:ifeq            20
			return values.get(((Object) (option)));
	//    5   11:aload_0         
	//    6   12:getfield        #18  <Field ArrayMap values>
	//    7   15:aload_1         
	//    8   16:invokevirtual   #46  <Method Object ArrayMap.get(Object)>
	//    9   19:areturn         
		else
			return option.getDefaultValue();
	//   10   20:aload_1         
	//   11   21:invokevirtual   #50  <Method Object Option.getDefaultValue()>
	//   12   24:areturn         
	}

	public int hashCode()
	{
		return values.hashCode();
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field ArrayMap values>
	//    2    4:invokevirtual   #56  <Method int ArrayMap.hashCode()>
	//    3    7:ireturn         
	}

	public void putAll(Options options)
	{
		values.putAll(((android.support.v4.util.SimpleArrayMap) (options.values)));
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field ArrayMap values>
	//    2    4:aload_1         
	//    3    5:getfield        #18  <Field ArrayMap values>
	//    4    8:invokevirtual   #61  <Method void ArrayMap.putAll(android.support.v4.util.SimpleArrayMap)>
	//    5   11:return          
	}

	public Options set(Option option, Object obj)
	{
		values.put(((Object) (option)), obj);
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field ArrayMap values>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #67  <Method Object ArrayMap.put(Object, Object)>
	//    5    9:pop             
		return this;
	//    6   10:aload_0         
	//    7   11:areturn         
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #72  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #73  <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append("Options{values=");
	//    4    8:aload_1         
	//    5    9:ldc1            #75  <String "Options{values=">
	//    6   11:invokevirtual   #79  <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		stringbuilder.append(((Object) (values)));
	//    8   15:aload_1         
	//    9   16:aload_0         
	//   10   17:getfield        #18  <Field ArrayMap values>
	//   11   20:invokevirtual   #82  <Method StringBuilder StringBuilder.append(Object)>
	//   12   23:pop             
		stringbuilder.append('}');
	//   13   24:aload_1         
	//   14   25:bipush          125
	//   15   27:invokevirtual   #85  <Method StringBuilder StringBuilder.append(char)>
	//   16   30:pop             
		return stringbuilder.toString();
	//   17   31:aload_1         
	//   18   32:invokevirtual   #87  <Method String StringBuilder.toString()>
	//   19   35:areturn         
	}

	public void updateDiskCacheKey(MessageDigest messagedigest)
	{
		for(int i = 0; i < values.size(); i++)
	//*   0    0:iconst_0        
	//*   1    1:istore_2        
	//*   2    2:iload_2         
	//*   3    3:aload_0         
	//*   4    4:getfield        #18  <Field ArrayMap values>
	//*   5    7:invokevirtual   #91  <Method int ArrayMap.size()>
	//*   6   10:icmpge          43
			updateDiskCacheKey((Option)values.keyAt(i), values.valueAt(i), messagedigest);
	//    7   13:aload_0         
	//    8   14:getfield        #18  <Field ArrayMap values>
	//    9   17:iload_2         
	//   10   18:invokevirtual   #95  <Method Object ArrayMap.keyAt(int)>
	//   11   21:checkcast       #24  <Class Option>
	//   12   24:aload_0         
	//   13   25:getfield        #18  <Field ArrayMap values>
	//   14   28:iload_2         
	//   15   29:invokevirtual   #98  <Method Object ArrayMap.valueAt(int)>
	//   16   32:aload_1         
	//   17   33:invokestatic    #100 <Method void updateDiskCacheKey(Option, Object, MessageDigest)>

	//   18   36:iload_2         
	//   19   37:iconst_1        
	//   20   38:iadd            
	//   21   39:istore_2        
	//*  22   40:goto            2
	//   23   43:return          
	}

	private final ArrayMap values = new CachedHashCodeArrayMap();
}

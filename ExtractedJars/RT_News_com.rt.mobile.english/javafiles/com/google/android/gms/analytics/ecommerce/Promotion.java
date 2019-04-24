// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.analytics.ecommerce;

import com.google.android.gms.analytics.zzi;
import com.google.android.gms.common.internal.Preconditions;
import java.util.*;

public class Promotion
{

	public Promotion()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void Object()>
		zzuy = ((Map) (new HashMap()));
	//    2    4:aload_0         
	//    3    5:new             #21  <Class HashMap>
	//    4    8:dup             
	//    5    9:invokespecial   #22  <Method void HashMap()>
	//    6   12:putfield        #24  <Field Map zzuy>
	//    7   15:return          
	}

	private final void put(String s, String s1)
	{
		Preconditions.checkNotNull(((Object) (s)), "Name should be non-null");
	//    0    0:aload_1         
	//    1    1:ldc1            #29  <String "Name should be non-null">
	//    2    3:invokestatic    #35  <Method Object Preconditions.checkNotNull(Object, Object)>
	//    3    6:pop             
		zzuy.put(((Object) (s)), ((Object) (s1)));
	//    4    7:aload_0         
	//    5    8:getfield        #24  <Field Map zzuy>
	//    6   11:aload_1         
	//    7   12:aload_2         
	//    8   13:invokeinterface #39  <Method Object Map.put(Object, Object)>
	//    9   18:pop             
	//   10   19:return          
	}

	public Promotion setCreative(String s)
	{
		put("cr", s);
	//    0    0:aload_0         
	//    1    1:ldc1            #43  <String "cr">
	//    2    3:aload_1         
	//    3    4:invokespecial   #45  <Method void put(String, String)>
		return this;
	//    4    7:aload_0         
	//    5    8:areturn         
	}

	public Promotion setId(String s)
	{
		put("id", s);
	//    0    0:aload_0         
	//    1    1:ldc1            #48  <String "id">
	//    2    3:aload_1         
	//    3    4:invokespecial   #45  <Method void put(String, String)>
		return this;
	//    4    7:aload_0         
	//    5    8:areturn         
	}

	public Promotion setName(String s)
	{
		put("nm", s);
	//    0    0:aload_0         
	//    1    1:ldc1            #51  <String "nm">
	//    2    3:aload_1         
	//    3    4:invokespecial   #45  <Method void put(String, String)>
		return this;
	//    4    7:aload_0         
	//    5    8:areturn         
	}

	public Promotion setPosition(String s)
	{
		put("ps", s);
	//    0    0:aload_0         
	//    1    1:ldc1            #54  <String "ps">
	//    2    3:aload_1         
	//    3    4:invokespecial   #45  <Method void put(String, String)>
		return this;
	//    4    7:aload_0         
	//    5    8:areturn         
	}

	public String toString()
	{
		return zzi.zza(zzuy);
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field Map zzuy>
	//    2    4:invokestatic    #62  <Method String zzi.zza(Map)>
	//    3    7:areturn         
	}

	public final Map zzm(String s)
	{
		HashMap hashmap = new HashMap();
	//    0    0:new             #21  <Class HashMap>
	//    1    3:dup             
	//    2    4:invokespecial   #22  <Method void HashMap()>
	//    3    7:astore_3        
		String s1;
		java.util.Map.Entry entry;
		for(Iterator iterator = zzuy.entrySet().iterator(); iterator.hasNext(); ((Map) (hashmap)).put(((Object) (s1)), ((Object) ((String)entry.getValue()))))
	//*   4    8:aload_0         
	//*   5    9:getfield        #24  <Field Map zzuy>
	//*   6   12:invokeinterface #68  <Method Set Map.entrySet()>
	//*   7   17:invokeinterface #74  <Method Iterator Set.iterator()>
	//*   8   22:astore          4
	//*   9   24:aload           4
	//*  10   26:invokeinterface #80  <Method boolean Iterator.hasNext()>
	//*  11   31:ifeq            114
		{
			entry = (java.util.Map.Entry)iterator.next();
	//   12   34:aload           4
	//   13   36:invokeinterface #84  <Method Object Iterator.next()>
	//   14   41:checkcast       #86  <Class java.util.Map$Entry>
	//   15   44:astore          5
			s1 = String.valueOf(((Object) (s)));
	//   16   46:aload_1         
	//   17   47:invokestatic    #92  <Method String String.valueOf(Object)>
	//   18   50:astore_2        
			String s2 = String.valueOf(((Object) ((String)entry.getKey())));
	//   19   51:aload           5
	//   20   53:invokeinterface #95  <Method Object java.util.Map$Entry.getKey()>
	//   21   58:checkcast       #88  <Class String>
	//   22   61:invokestatic    #92  <Method String String.valueOf(Object)>
	//   23   64:astore          6
			if(s2.length() != 0)
	//*  24   66:aload           6
	//*  25   68:invokevirtual   #99  <Method int String.length()>
	//*  26   71:ifeq            84
				s1 = s1.concat(s2);
	//   27   74:aload_2         
	//   28   75:aload           6
	//   29   77:invokevirtual   #103 <Method String String.concat(String)>
	//   30   80:astore_2        
			else
	//*  31   81:goto            93
				s1 = new String(s1);
	//   32   84:new             #88  <Class String>
	//   33   87:dup             
	//   34   88:aload_2         
	//   35   89:invokespecial   #106 <Method void String(String)>
	//   36   92:astore_2        
		}

	//   37   93:aload_3         
	//   38   94:aload_2         
	//   39   95:aload           5
	//   40   97:invokeinterface #109 <Method Object java.util.Map$Entry.getValue()>
	//   41  102:checkcast       #88  <Class String>
	//   42  105:invokeinterface #39  <Method Object Map.put(Object, Object)>
	//   43  110:pop             
	//*  44  111:goto            24
		return ((Map) (hashmap));
	//   45  114:aload_3         
	//   46  115:areturn         
	}

	public static final String ACTION_CLICK = "click";
	public static final String ACTION_VIEW = "view";
	private Map zzuy;
}

// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.analytics.ecommerce;

import com.google.android.gms.analytics.zzd;
import com.google.android.gms.analytics.zzi;
import com.google.android.gms.common.internal.Preconditions;
import java.util.*;

public class Product
{

	public Product()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void Object()>
		zzuy = ((Map) (new HashMap()));
	//    2    4:aload_0         
	//    3    5:new             #14  <Class HashMap>
	//    4    8:dup             
	//    5    9:invokespecial   #15  <Method void HashMap()>
	//    6   12:putfield        #17  <Field Map zzuy>
	//    7   15:return          
	}

	private final void put(String s, String s1)
	{
		Preconditions.checkNotNull(((Object) (s)), "Name should be non-null");
	//    0    0:aload_1         
	//    1    1:ldc1            #22  <String "Name should be non-null">
	//    2    3:invokestatic    #28  <Method Object Preconditions.checkNotNull(Object, Object)>
	//    3    6:pop             
		zzuy.put(((Object) (s)), ((Object) (s1)));
	//    4    7:aload_0         
	//    5    8:getfield        #17  <Field Map zzuy>
	//    6   11:aload_1         
	//    7   12:aload_2         
	//    8   13:invokeinterface #32  <Method Object Map.put(Object, Object)>
	//    9   18:pop             
	//   10   19:return          
	}

	public Product setBrand(String s)
	{
		put("br", s);
	//    0    0:aload_0         
	//    1    1:ldc1            #36  <String "br">
	//    2    3:aload_1         
	//    3    4:invokespecial   #38  <Method void put(String, String)>
		return this;
	//    4    7:aload_0         
	//    5    8:areturn         
	}

	public Product setCategory(String s)
	{
		put("ca", s);
	//    0    0:aload_0         
	//    1    1:ldc1            #41  <String "ca">
	//    2    3:aload_1         
	//    3    4:invokespecial   #38  <Method void put(String, String)>
		return this;
	//    4    7:aload_0         
	//    5    8:areturn         
	}

	public Product setCouponCode(String s)
	{
		put("cc", s);
	//    0    0:aload_0         
	//    1    1:ldc1            #44  <String "cc">
	//    2    3:aload_1         
	//    3    4:invokespecial   #38  <Method void put(String, String)>
		return this;
	//    4    7:aload_0         
	//    5    8:areturn         
	}

	public Product setCustomDimension(int i, String s)
	{
		put(zzd.zzm(i), s);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokestatic    #52  <Method String zzd.zzm(int)>
	//    3    5:aload_2         
	//    4    6:invokespecial   #38  <Method void put(String, String)>
		return this;
	//    5    9:aload_0         
	//    6   10:areturn         
	}

	public Product setCustomMetric(int i, int j)
	{
		put(zzd.zzn(i), Integer.toString(j));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokestatic    #57  <Method String zzd.zzn(int)>
	//    3    5:iload_2         
	//    4    6:invokestatic    #62  <Method String Integer.toString(int)>
	//    5    9:invokespecial   #38  <Method void put(String, String)>
		return this;
	//    6   12:aload_0         
	//    7   13:areturn         
	}

	public Product setId(String s)
	{
		put("id", s);
	//    0    0:aload_0         
	//    1    1:ldc1            #65  <String "id">
	//    2    3:aload_1         
	//    3    4:invokespecial   #38  <Method void put(String, String)>
		return this;
	//    4    7:aload_0         
	//    5    8:areturn         
	}

	public Product setName(String s)
	{
		put("nm", s);
	//    0    0:aload_0         
	//    1    1:ldc1            #68  <String "nm">
	//    2    3:aload_1         
	//    3    4:invokespecial   #38  <Method void put(String, String)>
		return this;
	//    4    7:aload_0         
	//    5    8:areturn         
	}

	public Product setPosition(int i)
	{
		put("ps", Integer.toString(i));
	//    0    0:aload_0         
	//    1    1:ldc1            #72  <String "ps">
	//    2    3:iload_1         
	//    3    4:invokestatic    #62  <Method String Integer.toString(int)>
	//    4    7:invokespecial   #38  <Method void put(String, String)>
		return this;
	//    5   10:aload_0         
	//    6   11:areturn         
	}

	public Product setPrice(double d)
	{
		put("pr", Double.toString(d));
	//    0    0:aload_0         
	//    1    1:ldc1            #76  <String "pr">
	//    2    3:dload_1         
	//    3    4:invokestatic    #81  <Method String Double.toString(double)>
	//    4    7:invokespecial   #38  <Method void put(String, String)>
		return this;
	//    5   10:aload_0         
	//    6   11:areturn         
	}

	public Product setQuantity(int i)
	{
		put("qt", Integer.toString(i));
	//    0    0:aload_0         
	//    1    1:ldc1            #84  <String "qt">
	//    2    3:iload_1         
	//    3    4:invokestatic    #62  <Method String Integer.toString(int)>
	//    4    7:invokespecial   #38  <Method void put(String, String)>
		return this;
	//    5   10:aload_0         
	//    6   11:areturn         
	}

	public Product setVariant(String s)
	{
		put("va", s);
	//    0    0:aload_0         
	//    1    1:ldc1            #87  <String "va">
	//    2    3:aload_1         
	//    3    4:invokespecial   #38  <Method void put(String, String)>
		return this;
	//    4    7:aload_0         
	//    5    8:areturn         
	}

	public String toString()
	{
		return zzi.zza(zzuy);
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field Map zzuy>
	//    2    4:invokestatic    #94  <Method String zzi.zza(Map)>
	//    3    7:areturn         
	}

	public final Map zzn(String s)
	{
		HashMap hashmap = new HashMap();
	//    0    0:new             #14  <Class HashMap>
	//    1    3:dup             
	//    2    4:invokespecial   #15  <Method void HashMap()>
	//    3    7:astore_3        
		String s1;
		java.util.Map.Entry entry;
		for(Iterator iterator = zzuy.entrySet().iterator(); iterator.hasNext(); ((Map) (hashmap)).put(((Object) (s1)), ((Object) ((String)entry.getValue()))))
	//*   4    8:aload_0         
	//*   5    9:getfield        #17  <Field Map zzuy>
	//*   6   12:invokeinterface #99  <Method Set Map.entrySet()>
	//*   7   17:invokeinterface #105 <Method Iterator Set.iterator()>
	//*   8   22:astore          4
	//*   9   24:aload           4
	//*  10   26:invokeinterface #111 <Method boolean Iterator.hasNext()>
	//*  11   31:ifeq            114
		{
			entry = (java.util.Map.Entry)iterator.next();
	//   12   34:aload           4
	//   13   36:invokeinterface #115 <Method Object Iterator.next()>
	//   14   41:checkcast       #117 <Class java.util.Map$Entry>
	//   15   44:astore          5
			s1 = String.valueOf(((Object) (s)));
	//   16   46:aload_1         
	//   17   47:invokestatic    #123 <Method String String.valueOf(Object)>
	//   18   50:astore_2        
			String s2 = String.valueOf(((Object) ((String)entry.getKey())));
	//   19   51:aload           5
	//   20   53:invokeinterface #126 <Method Object java.util.Map$Entry.getKey()>
	//   21   58:checkcast       #119 <Class String>
	//   22   61:invokestatic    #123 <Method String String.valueOf(Object)>
	//   23   64:astore          6
			if(s2.length() != 0)
	//*  24   66:aload           6
	//*  25   68:invokevirtual   #130 <Method int String.length()>
	//*  26   71:ifeq            84
				s1 = s1.concat(s2);
	//   27   74:aload_2         
	//   28   75:aload           6
	//   29   77:invokevirtual   #134 <Method String String.concat(String)>
	//   30   80:astore_2        
			else
	//*  31   81:goto            93
				s1 = new String(s1);
	//   32   84:new             #119 <Class String>
	//   33   87:dup             
	//   34   88:aload_2         
	//   35   89:invokespecial   #137 <Method void String(String)>
	//   36   92:astore_2        
		}

	//   37   93:aload_3         
	//   38   94:aload_2         
	//   39   95:aload           5
	//   40   97:invokeinterface #140 <Method Object java.util.Map$Entry.getValue()>
	//   41  102:checkcast       #119 <Class String>
	//   42  105:invokeinterface #32  <Method Object Map.put(Object, Object)>
	//   43  110:pop             
	//*  44  111:goto            24
		return ((Map) (hashmap));
	//   45  114:aload_3         
	//   46  115:areturn         
	}

	private Map zzuy;
}

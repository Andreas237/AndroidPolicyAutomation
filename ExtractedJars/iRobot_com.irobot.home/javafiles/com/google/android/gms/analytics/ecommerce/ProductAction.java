// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.analytics.ecommerce;

import com.google.android.gms.analytics.zzi;
import com.google.android.gms.common.internal.Preconditions;
import java.util.*;

public class ProductAction
{

	public ProductAction(String s)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #42  <Method void Object()>
		zzvj = ((Map) (new HashMap()));
	//    2    4:aload_0         
	//    3    5:new             #44  <Class HashMap>
	//    4    8:dup             
	//    5    9:invokespecial   #45  <Method void HashMap()>
	//    6   12:putfield        #47  <Field Map zzvj>
		put("&pa", s);
	//    7   15:aload_0         
	//    8   16:ldc1            #49  <String "&pa">
	//    9   18:aload_1         
	//   10   19:invokespecial   #53  <Method void put(String, String)>
	//   11   22:return          
	}

	private final void put(String s, String s1)
	{
		Preconditions.checkNotNull(((Object) (s)), "Name should be non-null");
	//    0    0:aload_1         
	//    1    1:ldc1            #56  <String "Name should be non-null">
	//    2    3:invokestatic    #62  <Method Object Preconditions.checkNotNull(Object, Object)>
	//    3    6:pop             
		zzvj.put(((Object) (s)), ((Object) (s1)));
	//    4    7:aload_0         
	//    5    8:getfield        #47  <Field Map zzvj>
	//    6   11:aload_1         
	//    7   12:aload_2         
	//    8   13:invokeinterface #66  <Method Object Map.put(Object, Object)>
	//    9   18:pop             
	//   10   19:return          
	}

	public final Map build()
	{
		return ((Map) (new HashMap(zzvj)));
	//    0    0:new             #44  <Class HashMap>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #47  <Field Map zzvj>
	//    4    8:invokespecial   #71  <Method void HashMap(Map)>
	//    5   11:areturn         
	}

	public ProductAction setCheckoutOptions(String s)
	{
		put("&col", s);
	//    0    0:aload_0         
	//    1    1:ldc1            #78  <String "&col">
	//    2    3:aload_1         
	//    3    4:invokespecial   #53  <Method void put(String, String)>
		return this;
	//    4    7:aload_0         
	//    5    8:areturn         
	}

	public ProductAction setCheckoutStep(int i)
	{
		put("&cos", Integer.toString(i));
	//    0    0:aload_0         
	//    1    1:ldc1            #82  <String "&cos">
	//    2    3:iload_1         
	//    3    4:invokestatic    #88  <Method String Integer.toString(int)>
	//    4    7:invokespecial   #53  <Method void put(String, String)>
		return this;
	//    5   10:aload_0         
	//    6   11:areturn         
	}

	public ProductAction setProductActionList(String s)
	{
		put("&pal", s);
	//    0    0:aload_0         
	//    1    1:ldc1            #91  <String "&pal">
	//    2    3:aload_1         
	//    3    4:invokespecial   #53  <Method void put(String, String)>
		return this;
	//    4    7:aload_0         
	//    5    8:areturn         
	}

	public ProductAction setProductListSource(String s)
	{
		put("&pls", s);
	//    0    0:aload_0         
	//    1    1:ldc1            #94  <String "&pls">
	//    2    3:aload_1         
	//    3    4:invokespecial   #53  <Method void put(String, String)>
		return this;
	//    4    7:aload_0         
	//    5    8:areturn         
	}

	public ProductAction setTransactionAffiliation(String s)
	{
		put("&ta", s);
	//    0    0:aload_0         
	//    1    1:ldc1            #97  <String "&ta">
	//    2    3:aload_1         
	//    3    4:invokespecial   #53  <Method void put(String, String)>
		return this;
	//    4    7:aload_0         
	//    5    8:areturn         
	}

	public ProductAction setTransactionCouponCode(String s)
	{
		put("&tcc", s);
	//    0    0:aload_0         
	//    1    1:ldc1            #100 <String "&tcc">
	//    2    3:aload_1         
	//    3    4:invokespecial   #53  <Method void put(String, String)>
		return this;
	//    4    7:aload_0         
	//    5    8:areturn         
	}

	public ProductAction setTransactionId(String s)
	{
		put("&ti", s);
	//    0    0:aload_0         
	//    1    1:ldc1            #103 <String "&ti">
	//    2    3:aload_1         
	//    3    4:invokespecial   #53  <Method void put(String, String)>
		return this;
	//    4    7:aload_0         
	//    5    8:areturn         
	}

	public ProductAction setTransactionRevenue(double d)
	{
		put("&tr", Double.toString(d));
	//    0    0:aload_0         
	//    1    1:ldc1            #107 <String "&tr">
	//    2    3:dload_1         
	//    3    4:invokestatic    #112 <Method String Double.toString(double)>
	//    4    7:invokespecial   #53  <Method void put(String, String)>
		return this;
	//    5   10:aload_0         
	//    6   11:areturn         
	}

	public ProductAction setTransactionShipping(double d)
	{
		put("&ts", Double.toString(d));
	//    0    0:aload_0         
	//    1    1:ldc1            #115 <String "&ts">
	//    2    3:dload_1         
	//    3    4:invokestatic    #112 <Method String Double.toString(double)>
	//    4    7:invokespecial   #53  <Method void put(String, String)>
		return this;
	//    5   10:aload_0         
	//    6   11:areturn         
	}

	public ProductAction setTransactionTax(double d)
	{
		put("&tt", Double.toString(d));
	//    0    0:aload_0         
	//    1    1:ldc1            #118 <String "&tt">
	//    2    3:dload_1         
	//    3    4:invokestatic    #112 <Method String Double.toString(double)>
	//    4    7:invokespecial   #53  <Method void put(String, String)>
		return this;
	//    5   10:aload_0         
	//    6   11:areturn         
	}

	public String toString()
	{
		HashMap hashmap = new HashMap();
	//    0    0:new             #44  <Class HashMap>
	//    1    3:dup             
	//    2    4:invokespecial   #45  <Method void HashMap()>
	//    3    7:astore_2        
		Iterator iterator = zzvj.entrySet().iterator();
	//    4    8:aload_0         
	//    5    9:getfield        #47  <Field Map zzvj>
	//    6   12:invokeinterface #123 <Method Set Map.entrySet()>
	//    7   17:invokeinterface #129 <Method Iterator Set.iterator()>
	//    8   22:astore_3        
		while(iterator.hasNext()) 
	//*   9   23:aload_3         
	//*  10   24:invokeinterface #135 <Method boolean Iterator.hasNext()>
	//*  11   29:ifeq            111
		{
			java.util.Map.Entry entry = (java.util.Map.Entry)iterator.next();
	//   12   32:aload_3         
	//   13   33:invokeinterface #139 <Method Object Iterator.next()>
	//   14   38:checkcast       #141 <Class java.util.Map$Entry>
	//   15   41:astore          4
			String s;
			if(((String)entry.getKey()).startsWith("&"))
	//*  16   43:aload           4
	//*  17   45:invokeinterface #144 <Method Object java.util.Map$Entry.getKey()>
	//*  18   50:checkcast       #146 <Class String>
	//*  19   53:ldc1            #148 <String "&">
	//*  20   55:invokevirtual   #152 <Method boolean String.startsWith(String)>
	//*  21   58:ifeq            97
				s = ((String)entry.getKey()).substring(1);
	//   22   61:aload           4
	//   23   63:invokeinterface #144 <Method Object java.util.Map$Entry.getKey()>
	//   24   68:checkcast       #146 <Class String>
	//   25   71:iconst_1        
	//   26   72:invokevirtual   #155 <Method String String.substring(int)>
	//   27   75:astore_1        
			else
	//*  28   76:aload_2         
	//*  29   77:aload_1         
	//*  30   78:aload           4
	//*  31   80:invokeinterface #158 <Method Object java.util.Map$Entry.getValue()>
	//*  32   85:checkcast       #146 <Class String>
	//*  33   88:invokeinterface #66  <Method Object Map.put(Object, Object)>
	//*  34   93:pop             
	//*  35   94:goto            23
				s = (String)entry.getKey();
	//   36   97:aload           4
	//   37   99:invokeinterface #144 <Method Object java.util.Map$Entry.getKey()>
	//   38  104:checkcast       #146 <Class String>
	//   39  107:astore_1        
			((Map) (hashmap)).put(((Object) (s)), ((Object) ((String)entry.getValue())));
		}
	//*  40  108:goto            76
		return zzi.zza(((Map) (hashmap)));
	//   41  111:aload_2         
	//   42  112:invokestatic    #164 <Method String zzi.zza(Map)>
	//   43  115:areturn         
	}

	public static final String ACTION_ADD = "add";
	public static final String ACTION_CHECKOUT = "checkout";
	public static final String ACTION_CHECKOUT_OPTION = "checkout_option";
	public static final String ACTION_CHECKOUT_OPTIONS = "checkout_options";
	public static final String ACTION_CLICK = "click";
	public static final String ACTION_DETAIL = "detail";
	public static final String ACTION_PURCHASE = "purchase";
	public static final String ACTION_REFUND = "refund";
	public static final String ACTION_REMOVE = "remove";
	private Map zzvj;
}

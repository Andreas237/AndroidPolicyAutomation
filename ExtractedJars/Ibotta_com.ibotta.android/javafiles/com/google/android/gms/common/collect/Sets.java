// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.collect;

import com.google.android.gms.common.internal.Preconditions;
import java.util.*;

public class Sets
{

	public Sets()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void Object()>
	//    2    4:return          
	}

	public static Set difference(Set set, Set set1)
	{
		Preconditions.checkNotNull(((Object) (set)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #17  <Method Object Preconditions.checkNotNull(Object)>
	//    2    4:pop             
		Preconditions.checkNotNull(((Object) (set1)));
	//    3    5:aload_1         
	//    4    6:invokestatic    #17  <Method Object Preconditions.checkNotNull(Object)>
	//    5    9:pop             
		HashSet hashset = new HashSet();
	//    6   10:new             #19  <Class HashSet>
	//    7   13:dup             
	//    8   14:invokespecial   #20  <Method void HashSet()>
	//    9   17:astore_2        
		set = ((Set) (set.iterator()));
	//   10   18:aload_0         
	//   11   19:invokeinterface #26  <Method Iterator Set.iterator()>
	//   12   24:astore_0        
		do
		{
			if(!((Iterator) (set)).hasNext())
				break;
	//   13   25:aload_0         
	//   14   26:invokeinterface #32  <Method boolean Iterator.hasNext()>
	//   15   31:ifeq            62
			Object obj = ((Iterator) (set)).next();
	//   16   34:aload_0         
	//   17   35:invokeinterface #36  <Method Object Iterator.next()>
	//   18   40:astore_3        
			if(!set1.contains(obj))
	//*  19   41:aload_1         
	//*  20   42:aload_3         
	//*  21   43:invokeinterface #40  <Method boolean Set.contains(Object)>
	//*  22   48:ifne            25
				((Set) (hashset)).add(obj);
	//   23   51:aload_2         
	//   24   52:aload_3         
	//   25   53:invokeinterface #43  <Method boolean Set.add(Object)>
	//   26   58:pop             
		} while(true);
	//   27   59:goto            25
		return ((Set) (hashset));
	//   28   62:aload_2         
	//   29   63:areturn         
	}

	public static Set union(Iterable iterable)
	{
		Preconditions.checkNotNull(((Object) (iterable)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #17  <Method Object Preconditions.checkNotNull(Object)>
	//    2    4:pop             
		HashSet hashset = new HashSet();
	//    3    5:new             #19  <Class HashSet>
	//    4    8:dup             
	//    5    9:invokespecial   #20  <Method void HashSet()>
	//    6   12:astore_1        
		for(iterable = ((Iterable) (iterable.iterator())); ((Iterator) (iterable)).hasNext(); ((Set) (hashset)).addAll(((java.util.Collection) ((Set)((Iterator) (iterable)).next()))));
	//    7   13:aload_0         
	//    8   14:invokeinterface #50  <Method Iterator Iterable.iterator()>
	//    9   19:astore_0        
	//   10   20:aload_0         
	//   11   21:invokeinterface #32  <Method boolean Iterator.hasNext()>
	//   12   26:ifeq            48
	//   13   29:aload_1         
	//   14   30:aload_0         
	//   15   31:invokeinterface #36  <Method Object Iterator.next()>
	//   16   36:checkcast       #22  <Class Set>
	//   17   39:invokeinterface #54  <Method boolean Set.addAll(java.util.Collection)>
	//   18   44:pop             
	//*  19   45:goto            20
		return ((Set) (hashset));
	//   20   48:aload_1         
	//   21   49:areturn         
	}

	public static Set union(Set set, Set set1)
	{
		Preconditions.checkNotNull(((Object) (set)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #17  <Method Object Preconditions.checkNotNull(Object)>
	//    2    4:pop             
		Preconditions.checkNotNull(((Object) (set1)));
	//    3    5:aload_1         
	//    4    6:invokestatic    #17  <Method Object Preconditions.checkNotNull(Object)>
	//    5    9:pop             
		set = ((Set) (new HashSet(((java.util.Collection) (set)))));
	//    6   10:new             #19  <Class HashSet>
	//    7   13:dup             
	//    8   14:aload_0         
	//    9   15:invokespecial   #58  <Method void HashSet(java.util.Collection)>
	//   10   18:astore_0        
		set.addAll(((java.util.Collection) (set1)));
	//   11   19:aload_0         
	//   12   20:aload_1         
	//   13   21:invokeinterface #54  <Method boolean Set.addAll(java.util.Collection)>
	//   14   26:pop             
		return set;
	//   15   27:aload_0         
	//   16   28:areturn         
	}
}

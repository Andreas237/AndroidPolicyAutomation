// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package io.radar.shadow.dagger.internal;

import java.util.*;

public final class DaggerCollections
{

	private DaggerCollections()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
	//    2    4:return          
	}

	private static int calculateInitialCapacity(int i)
	{
		if(i < 3)
	//*   0    0:iload_0         
	//*   1    1:iconst_3        
	//*   2    2:icmpge          9
			return i + 1;
	//    3    5:iload_0         
	//    4    6:iconst_1        
	//    5    7:iadd            
	//    6    8:ireturn         
		if(i < 0x40000000)
	//*   7    9:iload_0         
	//*   8   10:ldc1            #7   <Int 0x40000000>
	//*   9   12:icmpge          24
			return (int)((float)i / 0.75F + 1.0F);
	//   10   15:iload_0         
	//   11   16:i2f             
	//   12   17:ldc1            #15  <Float 0.75F>
	//   13   19:fdiv            
	//   14   20:fconst_1        
	//   15   21:fadd            
	//   16   22:f2i             
	//   17   23:ireturn         
		else
			return 0x7fffffff;
	//   18   24:ldc1            #16  <Int 0x7fffffff>
	//   19   26:ireturn         
	}

	public static boolean hasDuplicates(List list)
	{
		int i = list.size();
	//    0    0:aload_0         
	//    1    1:invokeinterface #24  <Method int List.size()>
	//    2    6:istore_1        
		boolean flag = false;
	//    3    7:iconst_0        
	//    4    8:istore_2        
		if(i < 2)
	//*   5    9:iload_1         
	//*   6   10:iconst_2        
	//*   7   11:icmpge          16
			return false;
	//    8   14:iconst_0        
	//    9   15:ireturn         
		HashSet hashset = new HashSet(((java.util.Collection) (list)));
	//   10   16:new             #26  <Class HashSet>
	//   11   19:dup             
	//   12   20:aload_0         
	//   13   21:invokespecial   #29  <Method void HashSet(java.util.Collection)>
	//   14   24:astore_3        
		if(list.size() != ((Set) (hashset)).size())
	//*  15   25:aload_0         
	//*  16   26:invokeinterface #24  <Method int List.size()>
	//*  17   31:aload_3         
	//*  18   32:invokeinterface #32  <Method int Set.size()>
	//*  19   37:icmpeq          42
			flag = true;
	//   20   40:iconst_1        
	//   21   41:istore_2        
		return flag;
	//   22   42:iload_2         
	//   23   43:ireturn         
	}

	static HashSet newHashSetWithExpectedSize(int i)
	{
		return new HashSet(calculateInitialCapacity(i));
	//    0    0:new             #26  <Class HashSet>
	//    1    3:dup             
	//    2    4:iload_0         
	//    3    5:invokestatic    #38  <Method int calculateInitialCapacity(int)>
	//    4    8:invokespecial   #41  <Method void HashSet(int)>
	//    5   11:areturn         
	}

	public static LinkedHashMap newLinkedHashMapWithExpectedSize(int i)
	{
		return new LinkedHashMap(calculateInitialCapacity(i));
	//    0    0:new             #46  <Class LinkedHashMap>
	//    1    3:dup             
	//    2    4:iload_0         
	//    3    5:invokestatic    #38  <Method int calculateInitialCapacity(int)>
	//    4    8:invokespecial   #47  <Method void LinkedHashMap(int)>
	//    5   11:areturn         
	}

	public static List presizedList(int i)
	{
		if(i == 0)
	//*   0    0:iload_0         
	//*   1    1:ifne            8
			return Collections.emptyList();
	//    2    4:invokestatic    #56  <Method List Collections.emptyList()>
	//    3    7:areturn         
		else
			return ((List) (new ArrayList(i)));
	//    4    8:new             #58  <Class ArrayList>
	//    5   11:dup             
	//    6   12:iload_0         
	//    7   13:invokespecial   #59  <Method void ArrayList(int)>
	//    8   16:areturn         
	}

	private static final int MAX_POWER_OF_TWO = 0x40000000;
}

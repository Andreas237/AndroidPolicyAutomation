// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.data;

import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package com.google.android.gms.common.data:
//			Freezable

public final class FreezableUtils
{

	public FreezableUtils()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void Object()>
	//    2    4:return          
	}

	public static ArrayList freeze(ArrayList arraylist)
	{
		ArrayList arraylist1 = new ArrayList(arraylist.size());
	//    0    0:new             #13  <Class ArrayList>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokevirtual   #17  <Method int ArrayList.size()>
	//    4    8:invokespecial   #20  <Method void ArrayList(int)>
	//    5   11:astore_3        
		int j = arraylist.size();
	//    6   12:aload_0         
	//    7   13:invokevirtual   #17  <Method int ArrayList.size()>
	//    8   16:istore_2        
		for(int i = 0; i < j; i++)
	//*   9   17:iconst_0        
	//*  10   18:istore_1        
	//*  11   19:iload_1         
	//*  12   20:iload_2         
	//*  13   21:icmpge          49
			arraylist1.add(((Freezable)arraylist.get(i)).freeze());
	//   14   24:aload_3         
	//   15   25:aload_0         
	//   16   26:iload_1         
	//   17   27:invokevirtual   #24  <Method Object ArrayList.get(int)>
	//   18   30:checkcast       #26  <Class Freezable>
	//   19   33:invokeinterface #29  <Method Object Freezable.freeze()>
	//   20   38:invokevirtual   #33  <Method boolean ArrayList.add(Object)>
	//   21   41:pop             

	//   22   42:iload_1         
	//   23   43:iconst_1        
	//   24   44:iadd            
	//   25   45:istore_1        
	//*  26   46:goto            19
		return arraylist1;
	//   27   49:aload_3         
	//   28   50:areturn         
	}

	public static ArrayList freeze(Freezable afreezable[])
	{
		ArrayList arraylist = new ArrayList(afreezable.length);
	//    0    0:new             #13  <Class ArrayList>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:arraylength     
	//    4    6:invokespecial   #20  <Method void ArrayList(int)>
	//    5    9:astore_2        
		for(int i = 0; i < afreezable.length; i++)
	//*   6   10:iconst_0        
	//*   7   11:istore_1        
	//*   8   12:iload_1         
	//*   9   13:aload_0         
	//*  10   14:arraylength     
	//*  11   15:icmpge          38
			arraylist.add(afreezable[i].freeze());
	//   12   18:aload_2         
	//   13   19:aload_0         
	//   14   20:iload_1         
	//   15   21:aaload          
	//   16   22:invokeinterface #29  <Method Object Freezable.freeze()>
	//   17   27:invokevirtual   #33  <Method boolean ArrayList.add(Object)>
	//   18   30:pop             

	//   19   31:iload_1         
	//   20   32:iconst_1        
	//   21   33:iadd            
	//   22   34:istore_1        
	//*  23   35:goto            12
		return arraylist;
	//   24   38:aload_2         
	//   25   39:areturn         
	}

	public static ArrayList freezeIterable(Iterable iterable)
	{
		ArrayList arraylist = new ArrayList();
	//    0    0:new             #13  <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #40  <Method void ArrayList()>
	//    3    7:astore_1        
		for(iterable = ((Iterable) (iterable.iterator())); ((Iterator) (iterable)).hasNext(); arraylist.add(((Freezable)((Iterator) (iterable)).next()).freeze()));
	//    4    8:aload_0         
	//    5    9:invokeinterface #46  <Method Iterator Iterable.iterator()>
	//    6   14:astore_0        
	//    7   15:aload_0         
	//    8   16:invokeinterface #52  <Method boolean Iterator.hasNext()>
	//    9   21:ifeq            46
	//   10   24:aload_1         
	//   11   25:aload_0         
	//   12   26:invokeinterface #55  <Method Object Iterator.next()>
	//   13   31:checkcast       #26  <Class Freezable>
	//   14   34:invokeinterface #29  <Method Object Freezable.freeze()>
	//   15   39:invokevirtual   #33  <Method boolean ArrayList.add(Object)>
	//   16   42:pop             
	//*  17   43:goto            15
		return arraylist;
	//   18   46:aload_1         
	//   19   47:areturn         
	}
}

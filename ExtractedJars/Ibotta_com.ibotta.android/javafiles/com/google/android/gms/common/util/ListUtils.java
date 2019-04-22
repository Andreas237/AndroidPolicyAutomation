// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.util;

import com.google.android.gms.common.internal.Preconditions;
import java.util.*;

public final class ListUtils
{

	private ListUtils()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void Object()>
	//    2    4:return          
	}

	public static ArrayList copyAndRemoveElementFromListIfPresent(List list, Object obj)
	{
		int j = list.size();
	//    0    0:aload_0         
	//    1    1:invokeinterface #17  <Method int List.size()>
	//    2    6:istore_3        
		ArrayList arraylist = new ArrayList(j);
	//    3    7:new             #19  <Class ArrayList>
	//    4   10:dup             
	//    5   11:iload_3         
	//    6   12:invokespecial   #22  <Method void ArrayList(int)>
	//    7   15:astore          4
		for(int i = 0; i < j; i++)
	//*   8   17:iconst_0        
	//*   9   18:istore_2        
	//*  10   19:iload_2         
	//*  11   20:iload_3         
	//*  12   21:icmpge          61
		{
			Object obj1 = list.get(i);
	//   13   24:aload_0         
	//   14   25:iload_2         
	//   15   26:invokeinterface #26  <Method Object List.get(int)>
	//   16   31:astore          5
			if(obj == null || !obj.equals(obj1))
	//*  17   33:aload_1         
	//*  18   34:ifnull          46
	//*  19   37:aload_1         
	//*  20   38:aload           5
	//*  21   40:invokevirtual   #30  <Method boolean Object.equals(Object)>
	//*  22   43:ifne            54
				arraylist.add(obj1);
	//   23   46:aload           4
	//   24   48:aload           5
	//   25   50:invokevirtual   #33  <Method boolean ArrayList.add(Object)>
	//   26   53:pop             
		}

	//   27   54:iload_2         
	//   28   55:iconst_1        
	//   29   56:iadd            
	//   30   57:istore_2        
	//*  31   58:goto            19
		return arraylist;
	//   32   61:aload           4
	//   33   63:areturn         
	}

	public static ArrayList copyAndRemoveElementsFromListIfPresent(List list, Collection collection)
	{
		Preconditions.checkNotNull(((Object) (collection)));
	//    0    0:aload_1         
	//    1    1:invokestatic    #43  <Method Object Preconditions.checkNotNull(Object)>
	//    2    4:pop             
		ArrayList arraylist = new ArrayList(list.size());
	//    3    5:new             #19  <Class ArrayList>
	//    4    8:dup             
	//    5    9:aload_0         
	//    6   10:invokeinterface #17  <Method int List.size()>
	//    7   15:invokespecial   #22  <Method void ArrayList(int)>
	//    8   18:astore_2        
		list = ((List) (list.iterator()));
	//    9   19:aload_0         
	//   10   20:invokeinterface #47  <Method Iterator List.iterator()>
	//   11   25:astore_0        
		do
		{
			if(!((Iterator) (list)).hasNext())
				break;
	//   12   26:aload_0         
	//   13   27:invokeinterface #53  <Method boolean Iterator.hasNext()>
	//   14   32:ifeq            61
			Object obj = ((Iterator) (list)).next();
	//   15   35:aload_0         
	//   16   36:invokeinterface #57  <Method Object Iterator.next()>
	//   17   41:astore_3        
			if(!collection.contains(obj))
	//*  18   42:aload_1         
	//*  19   43:aload_3         
	//*  20   44:invokeinterface #62  <Method boolean Collection.contains(Object)>
	//*  21   49:ifne            26
				arraylist.add(obj);
	//   22   52:aload_2         
	//   23   53:aload_3         
	//   24   54:invokevirtual   #33  <Method boolean ArrayList.add(Object)>
	//   25   57:pop             
		} while(true);
	//   26   58:goto            26
		return arraylist;
	//   27   61:aload_2         
	//   28   62:areturn         
	}
}

// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.mixpanel.android.b;

import android.view.View;
import java.util.*;

// Referenced classes of package com.mixpanel.android.b:
//			o

private static class o$c
{

	private boolean a(TreeMap treemap, View view, List list)
	{
		if(list.contains(((Object) (view))))
	//*   0    0:aload_3         
	//*   1    1:aload_2         
	//*   2    2:invokeinterface #22  <Method boolean List.contains(Object)>
	//*   3    7:ifeq            12
			return false;
	//    4   10:iconst_0        
	//    5   11:ireturn         
		if(treemap.containsKey(((Object) (view))))
	//*   6   12:aload_1         
	//*   7   13:aload_2         
	//*   8   14:invokevirtual   #27  <Method boolean TreeMap.containsKey(Object)>
	//*   9   17:ifeq            97
		{
			List list1 = (List)treemap.remove(((Object) (view)));
	//   10   20:aload_1         
	//   11   21:aload_2         
	//   12   22:invokevirtual   #31  <Method Object TreeMap.remove(Object)>
	//   13   25:checkcast       #18  <Class List>
	//   14   28:astore          6
			list.add(((Object) (view)));
	//   15   30:aload_3         
	//   16   31:aload_2         
	//   17   32:invokeinterface #34  <Method boolean List.add(Object)>
	//   18   37:pop             
			int j = list1.size();
	//   19   38:aload           6
	//   20   40:invokeinterface #38  <Method int List.size()>
	//   21   45:istore          5
			for(int i = 0; i < j; i++)
	//*  22   47:iconst_0        
	//*  23   48:istore          4
	//*  24   50:iload           4
	//*  25   52:iload           5
	//*  26   54:icmpge          89
				if(!a(treemap, (View)list1.get(i), list))
	//*  27   57:aload_0         
	//*  28   58:aload_1         
	//*  29   59:aload           6
	//*  30   61:iload           4
	//*  31   63:invokeinterface #42  <Method Object List.get(int)>
	//*  32   68:checkcast       #44  <Class View>
	//*  33   71:aload_3         
	//*  34   72:invokespecial   #46  <Method boolean a(TreeMap, View, List)>
	//*  35   75:ifne            80
					return false;
	//   36   78:iconst_0        
	//   37   79:ireturn         

	//   38   80:iload           4
	//   39   82:iconst_1        
	//   40   83:iadd            
	//   41   84:istore          4
	//*  42   86:goto            50
			list.remove(((Object) (view)));
	//   43   89:aload_3         
	//   44   90:aload_2         
	//   45   91:invokeinterface #48  <Method boolean List.remove(Object)>
	//   46   96:pop             
		}
		return true;
	//   47   97:iconst_1        
	//   48   98:ireturn         
	}

	public boolean a(TreeMap treemap)
	{
		ArrayList arraylist = new ArrayList();
	//    0    0:new             #53  <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #54  <Method void ArrayList()>
	//    3    7:astore_2        
		while(!treemap.isEmpty()) 
	//*   4    8:aload_1         
	//*   5    9:invokevirtual   #58  <Method boolean TreeMap.isEmpty()>
	//*   6   12:ifne            33
			if(!a(treemap, (View)treemap.firstKey(), ((List) (arraylist))))
	//*   7   15:aload_0         
	//*   8   16:aload_1         
	//*   9   17:aload_1         
	//*  10   18:invokevirtual   #62  <Method Object TreeMap.firstKey()>
	//*  11   21:checkcast       #44  <Class View>
	//*  12   24:aload_2         
	//*  13   25:invokespecial   #46  <Method boolean a(TreeMap, View, List)>
	//*  14   28:ifne            8
				return false;
	//   15   31:iconst_0        
	//   16   32:ireturn         
		return true;
	//   17   33:iconst_1        
	//   18   34:ireturn         
	}

	private o$c()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
	//    2    4:return          
	}

	o$c(o$1 o$1)
	{
		this();
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void o$c()>
	//    2    4:return          
	}
}

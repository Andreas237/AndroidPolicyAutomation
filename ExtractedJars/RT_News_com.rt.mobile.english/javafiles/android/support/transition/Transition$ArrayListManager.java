// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.transition;

import java.util.ArrayList;

// Referenced classes of package android.support.transition:
//			Transition

private static class Transition$ArrayListManager
{

	static ArrayList add(ArrayList arraylist, Object obj)
	{
		ArrayList arraylist1 = arraylist;
	//    0    0:aload_0         
	//    1    1:astore_2        
		if(arraylist == null)
	//*   2    2:aload_0         
	//*   3    3:ifnonnull       14
			arraylist1 = new ArrayList();
	//    4    6:new             #16  <Class ArrayList>
	//    5    9:dup             
	//    6   10:invokespecial   #17  <Method void ArrayList()>
	//    7   13:astore_2        
		if(!arraylist1.contains(obj))
	//*   8   14:aload_2         
	//*   9   15:aload_1         
	//*  10   16:invokevirtual   #21  <Method boolean ArrayList.contains(Object)>
	//*  11   19:ifne            28
			arraylist1.add(obj);
	//   12   22:aload_2         
	//   13   23:aload_1         
	//   14   24:invokevirtual   #23  <Method boolean ArrayList.add(Object)>
	//   15   27:pop             
		return arraylist1;
	//   16   28:aload_2         
	//   17   29:areturn         
	}

	static ArrayList remove(ArrayList arraylist, Object obj)
	{
		ArrayList arraylist1 = arraylist;
	//    0    0:aload_0         
	//    1    1:astore_2        
		if(arraylist != null)
	//*   2    2:aload_0         
	//*   3    3:ifnull          23
		{
			arraylist.remove(obj);
	//    4    6:aload_0         
	//    5    7:aload_1         
	//    6    8:invokevirtual   #28  <Method boolean ArrayList.remove(Object)>
	//    7   11:pop             
			arraylist1 = arraylist;
	//    8   12:aload_0         
	//    9   13:astore_2        
			if(arraylist.isEmpty())
	//*  10   14:aload_0         
	//*  11   15:invokevirtual   #32  <Method boolean ArrayList.isEmpty()>
	//*  12   18:ifeq            23
				arraylist1 = null;
	//   13   21:aconst_null     
	//   14   22:astore_2        
		}
		return arraylist1;
	//   15   23:aload_2         
	//   16   24:areturn         
	}

	private Transition$ArrayListManager()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
	//    2    4:return          
	}
}

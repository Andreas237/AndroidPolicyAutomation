// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package bo.app;

import java.util.*;

// Referenced classes of package bo.app:
//			er, fl

public class gi
{

	public gi(List list)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #16  <Class PriorityQueue>
	//    4    8:dup             
	//    5    9:bipush          16
	//    6   11:invokestatic    #20  <Method Comparator b()>
	//    7   14:invokespecial   #23  <Method void PriorityQueue(int, Comparator)>
	//    8   17:putfield        #25  <Field PriorityQueue a>
		a.addAll(((java.util.Collection) (list)));
	//    9   20:aload_0         
	//   10   21:getfield        #25  <Field PriorityQueue a>
	//   11   24:aload_1         
	//   12   25:invokevirtual   #29  <Method boolean PriorityQueue.addAll(java.util.Collection)>
	//   13   28:pop             
	//   14   29:return          
	}

	private static Comparator b()
	{
		return new Comparator() {

			public int a(er er1, er er2)
			{
				int i = er1.c().c();
			//    0    0:aload_1         
			//    1    1:invokeinterface #25  <Method fl er.c()>
			//    2    6:invokeinterface #30  <Method int fl.c()>
			//    3   11:istore_3        
				int j = er2.c().c();
			//    4   12:aload_2         
			//    5   13:invokeinterface #25  <Method fl er.c()>
			//    6   18:invokeinterface #30  <Method int fl.c()>
			//    7   23:istore          4
				if(i > j)
			//*   8   25:iload_3         
			//*   9   26:iload           4
			//*  10   28:icmple          33
					return -1;
			//   11   31:iconst_m1       
			//   12   32:ireturn         
				if(i < j)
			//*  13   33:iload_3         
			//*  14   34:iload           4
			//*  15   36:icmpge          41
					return 1;
			//   16   39:iconst_1        
			//   17   40:ireturn         
				else
					return er1.b().compareTo(er2.b());
			//   18   41:aload_1         
			//   19   42:invokeinterface #33  <Method String er.b()>
			//   20   47:aload_2         
			//   21   48:invokeinterface #33  <Method String er.b()>
			//   22   53:invokevirtual   #39  <Method int String.compareTo(String)>
			//   23   56:ireturn         
			}

			public int compare(Object obj, Object obj1)
			{
				return a((er)obj, (er)obj1);
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:checkcast       #21  <Class er>
			//    3    5:aload_2         
			//    4    6:checkcast       #21  <Class er>
			//    5    9:invokevirtual   #43  <Method int a(er, er)>
			//    6   12:ireturn         
			}

		}
;
	//    0    0:new             #6   <Class gi$1>
	//    1    3:dup             
	//    2    4:invokespecial   #34  <Method void gi$1()>
	//    3    7:areturn         
	}

	public er a()
	{
		return (er)a.poll();
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field PriorityQueue a>
	//    2    4:invokevirtual   #42  <Method Object PriorityQueue.poll()>
	//    3    7:checkcast       #44  <Class er>
	//    4   10:areturn         
	}

	private final PriorityQueue a = new PriorityQueue(16, b());
}

// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package bo.app;

import java.util.Comparator;

// Referenced classes of package bo.app:
//			gi, er, fl

static final class gi$1
	implements Comparator
{

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

	gi$1()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
	//    2    4:return          
	}
}

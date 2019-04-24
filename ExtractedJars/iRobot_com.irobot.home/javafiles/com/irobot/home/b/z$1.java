// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.b;

import com.irobot.home.util.o;

// Referenced classes of package com.irobot.home.b:
//			z

class z$1
	implements z$a
{

	public void a(int i)
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #21  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #22  <Method void StringBuilder()>
	//    3    7:astore_2        
		stringbuilder.append("item selected at index: ");
	//    4    8:aload_2         
	//    5    9:ldc1            #24  <String "item selected at index: ">
	//    6   11:invokevirtual   #28  <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		stringbuilder.append(i);
	//    8   15:aload_2         
	//    9   16:iload_1         
	//   10   17:invokevirtual   #31  <Method StringBuilder StringBuilder.append(int)>
	//   11   20:pop             
		stringbuilder.append(" but not handled.");
	//   12   21:aload_2         
	//   13   22:ldc1            #33  <String " but not handled.">
	//   14   24:invokevirtual   #28  <Method StringBuilder StringBuilder.append(String)>
	//   15   27:pop             
		o.b("PScheduleAdapter", stringbuilder.toString());
	//   16   28:ldc1            #35  <String "PScheduleAdapter">
	//   17   30:aload_2         
	//   18   31:invokevirtual   #39  <Method String StringBuilder.toString()>
	//   19   34:invokestatic    #45  <Method void o.b(String, String)>
	//   20   37:return          
	}

	public void a(int i, boolean flag)
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #21  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #22  <Method void StringBuilder()>
	//    3    7:astore_3        
		stringbuilder.append("item switched at index: ");
	//    4    8:aload_3         
	//    5    9:ldc1            #48  <String "item switched at index: ">
	//    6   11:invokevirtual   #28  <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		stringbuilder.append(i);
	//    8   15:aload_3         
	//    9   16:iload_1         
	//   10   17:invokevirtual   #31  <Method StringBuilder StringBuilder.append(int)>
	//   11   20:pop             
		stringbuilder.append(" to ");
	//   12   21:aload_3         
	//   13   22:ldc1            #50  <String " to ">
	//   14   24:invokevirtual   #28  <Method StringBuilder StringBuilder.append(String)>
	//   15   27:pop             
		stringbuilder.append(flag);
	//   16   28:aload_3         
	//   17   29:iload_2         
	//   18   30:invokevirtual   #53  <Method StringBuilder StringBuilder.append(boolean)>
	//   19   33:pop             
		stringbuilder.append(" but not handled.");
	//   20   34:aload_3         
	//   21   35:ldc1            #33  <String " but not handled.">
	//   22   37:invokevirtual   #28  <Method StringBuilder StringBuilder.append(String)>
	//   23   40:pop             
		o.b("PScheduleAdapter", stringbuilder.toString());
	//   24   41:ldc1            #35  <String "PScheduleAdapter">
	//   25   43:aload_3         
	//   26   44:invokevirtual   #39  <Method String StringBuilder.toString()>
	//   27   47:invokestatic    #45  <Method void o.b(String, String)>
	//   28   50:return          
	}

	final z a;

	z$1(z z1)
	{
		a = z1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #14  <Field z a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #17  <Method void Object()>
	//    5    9:return          
	}
}

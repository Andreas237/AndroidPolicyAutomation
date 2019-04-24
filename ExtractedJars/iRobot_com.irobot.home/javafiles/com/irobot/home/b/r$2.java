// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.b;

import com.irobot.home.util.o;

// Referenced classes of package com.irobot.home.b:
//			r

class r$2
	implements r$a
{

	public void f(int i)
	{
		String s = r.b();
	//    0    0:invokestatic    #24  <Method String r.b()>
	//    1    3:astore_2        
		StringBuilder stringbuilder = new StringBuilder();
	//    2    4:new             #26  <Class StringBuilder>
	//    3    7:dup             
	//    4    8:invokespecial   #27  <Method void StringBuilder()>
	//    5   11:astore_3        
		stringbuilder.append("Clicked on mission history item with index: ");
	//    6   12:aload_3         
	//    7   13:ldc1            #29  <String "Clicked on mission history item with index: ">
	//    8   15:invokevirtual   #33  <Method StringBuilder StringBuilder.append(String)>
	//    9   18:pop             
		stringbuilder.append(i);
	//   10   19:aload_3         
	//   11   20:iload_1         
	//   12   21:invokevirtual   #36  <Method StringBuilder StringBuilder.append(int)>
	//   13   24:pop             
		o.b(s, stringbuilder.toString());
	//   14   25:aload_2         
	//   15   26:aload_3         
	//   16   27:invokevirtual   #39  <Method String StringBuilder.toString()>
	//   17   30:invokestatic    #44  <Method void o.b(String, String)>
	//   18   33:return          
	}

	final r a;

	r$2(r r1)
	{
		a = r1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #14  <Field r a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #17  <Method void Object()>
	//    5    9:return          
	}
}

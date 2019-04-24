// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.fragments;

import com.irobot.core.OnDemandOTAHandler;
import com.irobot.core.OnDemandOTAStatus;
import com.irobot.home.util.o;

// Referenced classes of package com.irobot.home.fragments:
//			bi

class bi$1 extends OnDemandOTAHandler
{

	public void updateStatus(OnDemandOTAStatus ondemandotastatus)
	{
		String s = bi.b();
	//    0    0:invokestatic    #22  <Method String bi.b()>
	//    1    3:astore_2        
		StringBuilder stringbuilder = new StringBuilder();
	//    2    4:new             #24  <Class StringBuilder>
	//    3    7:dup             
	//    4    8:invokespecial   #25  <Method void StringBuilder()>
	//    5   11:astore_3        
		stringbuilder.append("updateStatus: ");
	//    6   12:aload_3         
	//    7   13:ldc1            #27  <String "updateStatus: ">
	//    8   15:invokevirtual   #31  <Method StringBuilder StringBuilder.append(String)>
	//    9   18:pop             
		stringbuilder.append(((Object) (ondemandotastatus)));
	//   10   19:aload_3         
	//   11   20:aload_1         
	//   12   21:invokevirtual   #34  <Method StringBuilder StringBuilder.append(Object)>
	//   13   24:pop             
		o.b(s, stringbuilder.toString());
	//   14   25:aload_2         
	//   15   26:aload_3         
	//   16   27:invokevirtual   #37  <Method String StringBuilder.toString()>
	//   17   30:invokestatic    #42  <Method void o.b(String, String)>
		bi.a(a).a(ondemandotastatus);
	//   18   33:aload_0         
	//   19   34:getfield        #12  <Field bi a>
	//   20   37:invokestatic    #45  <Method bi$a bi.a(bi)>
	//   21   40:aload_1         
	//   22   41:invokeinterface #49  <Method void bi$a.a(OnDemandOTAStatus)>
	//   23   46:return          
	}

	final bi a;

	bi$1(bi bi1)
	{
		a = bi1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #12  <Field bi a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #15  <Method void OnDemandOTAHandler()>
	//    5    9:return          
	}
}

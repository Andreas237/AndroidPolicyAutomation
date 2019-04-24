// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import com.irobot.home.util.o;
import org.androidannotations.a.a.a.b;

// Referenced classes of package com.irobot.home:
//			AboutDockListActivity

class AboutDockListActivity$2
	implements b
{

	public void onRestClientExceptionThrown(org.c.b.b b1)
	{
		String s = AboutDockListActivity.a(a);
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field AboutDockListActivity a>
	//    2    4:invokestatic    #25  <Method String AboutDockListActivity.a(AboutDockListActivity)>
	//    3    7:astore_2        
		StringBuilder stringbuilder = new StringBuilder();
	//    4    8:new             #27  <Class StringBuilder>
	//    5   11:dup             
	//    6   12:invokespecial   #28  <Method void StringBuilder()>
	//    7   15:astore_3        
		stringbuilder.append("Customer care rest client exception: ");
	//    8   16:aload_3         
	//    9   17:ldc1            #30  <String "Customer care rest client exception: ">
	//   10   19:invokevirtual   #34  <Method StringBuilder StringBuilder.append(String)>
	//   11   22:pop             
		stringbuilder.append(b1.getLocalizedMessage());
	//   12   23:aload_3         
	//   13   24:aload_1         
	//   14   25:invokevirtual   #40  <Method String org.c.b.b.getLocalizedMessage()>
	//   15   28:invokevirtual   #34  <Method StringBuilder StringBuilder.append(String)>
	//   16   31:pop             
		o.e(s, stringbuilder.toString());
	//   17   32:aload_2         
	//   18   33:aload_3         
	//   19   34:invokevirtual   #43  <Method String StringBuilder.toString()>
	//   20   37:invokestatic    #48  <Method void o.e(String, String)>
	//   21   40:return          
	}

	final AboutDockListActivity a;

	AboutDockListActivity$2(AboutDockListActivity aboutdocklistactivity)
	{
		a = aboutdocklistactivity;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field AboutDockListActivity a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #19  <Method void Object()>
	//    5    9:return          
	}
}

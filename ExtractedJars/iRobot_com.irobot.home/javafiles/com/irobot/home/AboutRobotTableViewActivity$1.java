// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import com.irobot.home.util.o;
import org.androidannotations.a.a.a.b;

// Referenced classes of package com.irobot.home:
//			AboutRobotTableViewActivity

class AboutRobotTableViewActivity$1
	implements b
{

	public void onRestClientExceptionThrown(org.c.b.b b1)
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #24  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #25  <Method void StringBuilder()>
	//    3    7:astore_2        
		stringbuilder.append("Rest client exception: ");
	//    4    8:aload_2         
	//    5    9:ldc1            #27  <String "Rest client exception: ">
	//    6   11:invokevirtual   #31  <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		stringbuilder.append(b1.getMessage());
	//    8   15:aload_2         
	//    9   16:aload_1         
	//   10   17:invokevirtual   #37  <Method String org.c.b.b.getMessage()>
	//   11   20:invokevirtual   #31  <Method StringBuilder StringBuilder.append(String)>
	//   12   23:pop             
		o.e("AboutRobot", stringbuilder.toString());
	//   13   24:ldc1            #39  <String "AboutRobot">
	//   14   26:aload_2         
	//   15   27:invokevirtual   #42  <Method String StringBuilder.toString()>
	//   16   30:invokestatic    #48  <Method void o.e(String, String)>
	//   17   33:return          
	}

	final AboutRobotTableViewActivity a;

	AboutRobotTableViewActivity$1(AboutRobotTableViewActivity aboutrobottableviewactivity)
	{
		a = aboutrobottableviewactivity;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field AboutRobotTableViewActivity a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #19  <Method void Object()>
	//    5    9:return          
	}
}

// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import android.widget.TextView;
import com.irobot.core.NetworkDiagnosticEvent;

// Referenced classes of package com.irobot.home:
//			DeveloperActivity

class DeveloperActivity$4
	implements Runnable
{

	public void run()
	{
		if(DeveloperActivity.a(b) != null && a.executionId() == DeveloperActivity.c(b))
	//*   0    0:aload_0         
	//*   1    1:getfield        #19  <Field DeveloperActivity b>
	//*   2    4:invokestatic    #29  <Method TextView DeveloperActivity.a(DeveloperActivity)>
	//*   3    7:ifnull          70
	//*   4   10:aload_0         
	//*   5   11:getfield        #21  <Field NetworkDiagnosticEvent a>
	//*   6   14:invokevirtual   #35  <Method int NetworkDiagnosticEvent.executionId()>
	//*   7   17:aload_0         
	//*   8   18:getfield        #19  <Field DeveloperActivity b>
	//*   9   21:invokestatic    #39  <Method int DeveloperActivity.c(DeveloperActivity)>
	//*  10   24:icmpne          70
		{
			TextView textview = DeveloperActivity.a(b);
	//   11   27:aload_0         
	//   12   28:getfield        #19  <Field DeveloperActivity b>
	//   13   31:invokestatic    #29  <Method TextView DeveloperActivity.a(DeveloperActivity)>
	//   14   34:astore_1        
			StringBuilder stringbuilder = new StringBuilder();
	//   15   35:new             #41  <Class StringBuilder>
	//   16   38:dup             
	//   17   39:invokespecial   #42  <Method void StringBuilder()>
	//   18   42:astore_2        
			stringbuilder.append(a.progress());
	//   19   43:aload_2         
	//   20   44:aload_0         
	//   21   45:getfield        #21  <Field NetworkDiagnosticEvent a>
	//   22   48:invokevirtual   #46  <Method String NetworkDiagnosticEvent.progress()>
	//   23   51:invokevirtual   #50  <Method StringBuilder StringBuilder.append(String)>
	//   24   54:pop             
			stringbuilder.append("\n");
	//   25   55:aload_2         
	//   26   56:ldc1            #52  <String "\n">
	//   27   58:invokevirtual   #50  <Method StringBuilder StringBuilder.append(String)>
	//   28   61:pop             
			textview.append(((CharSequence) (stringbuilder.toString())));
	//   29   62:aload_1         
	//   30   63:aload_2         
	//   31   64:invokevirtual   #55  <Method String StringBuilder.toString()>
	//   32   67:invokevirtual   #60  <Method void TextView.append(CharSequence)>
		}
	//   33   70:return          
	}

	final NetworkDiagnosticEvent a;
	final DeveloperActivity b;

	DeveloperActivity$4(DeveloperActivity developeractivity, NetworkDiagnosticEvent networkdiagnosticevent)
	{
		b = developeractivity;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field DeveloperActivity b>
		a = networkdiagnosticevent;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #21  <Field NetworkDiagnosticEvent a>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #24  <Method void Object()>
	//    8   14:return          
	}
}

// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import android.view.View;
import android.widget.TextView;
import com.irobot.core.NetworkDiagnostics;

// Referenced classes of package com.irobot.home:
//			DeveloperActivity

class DeveloperActivity$13
	implements android.view.View$OnClickListener
{

	public void onClick(View view)
	{
		DeveloperActivity.a(b).setText("");
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field DeveloperActivity b>
	//    2    4:invokestatic    #29  <Method TextView DeveloperActivity.a(DeveloperActivity)>
	//    3    7:ldc1            #31  <String "">
	//    4    9:invokevirtual   #37  <Method void TextView.setText(CharSequence)>
		DeveloperActivity.a(b).scrollTo(0, 0);
	//    5   12:aload_0         
	//    6   13:getfield        #19  <Field DeveloperActivity b>
	//    7   16:invokestatic    #29  <Method TextView DeveloperActivity.a(DeveloperActivity)>
	//    8   19:iconst_0        
	//    9   20:iconst_0        
	//   10   21:invokevirtual   #41  <Method void TextView.scrollTo(int, int)>
		DeveloperActivity.a(b, a.checkDiscovery());
	//   11   24:aload_0         
	//   12   25:getfield        #19  <Field DeveloperActivity b>
	//   13   28:aload_0         
	//   14   29:getfield        #21  <Field NetworkDiagnostics a>
	//   15   32:invokevirtual   #47  <Method int NetworkDiagnostics.checkDiscovery()>
	//   16   35:invokestatic    #50  <Method int DeveloperActivity.a(DeveloperActivity, int)>
	//   17   38:pop             
	//   18   39:return          
	}

	final NetworkDiagnostics a;
	final DeveloperActivity b;

	DeveloperActivity$13(DeveloperActivity developeractivity, NetworkDiagnostics networkdiagnostics)
	{
		b = developeractivity;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field DeveloperActivity b>
		a = networkdiagnostics;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #21  <Field NetworkDiagnostics a>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #23  <Method void Object()>
	//    8   14:return          
	}
}

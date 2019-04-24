// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.fragments;

import android.widget.*;
import com.irobot.home.RobotSoftwareUpdateActivity_;

// Referenced classes of package com.irobot.home.fragments:
//			j

public class as extends j
{

	public as()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void j()>
		b = false;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #20  <Field boolean b>
	//    5    9:return          
	}

	protected void a()
	{
		if(b)
	//*   0    0:aload_0         
	//*   1    1:getfield        #20  <Field boolean b>
	//*   2    4:ifeq            33
		{
			e.setVisibility(0);
	//    3    7:aload_0         
	//    4    8:getfield        #23  <Field LinearLayout e>
	//    5   11:iconst_0        
	//    6   12:invokevirtual   #29  <Method void LinearLayout.setVisibility(int)>
			d.setImageResource(0x7f080151);
	//    7   15:aload_0         
	//    8   16:getfield        #31  <Field ImageView d>
	//    9   19:ldc1            #32  <Int 0x7f080151>
	//   10   21:invokevirtual   #37  <Method void ImageView.setImageResource(int)>
			c.setVisibility(8);
	//   11   24:aload_0         
	//   12   25:getfield        #39  <Field TextView c>
	//   13   28:bipush          8
	//   14   30:invokevirtual   #42  <Method void TextView.setVisibility(int)>
		}
	//   15   33:return          
	}

	protected void b()
	{
		RobotSoftwareUpdateActivity_.a(((android.support.v4.app.Fragment) (this))).a(a).a();
	//    0    0:aload_0         
	//    1    1:invokestatic    #47  <Method com.irobot.home.RobotSoftwareUpdateActivity_$a RobotSoftwareUpdateActivity_.a(android.support.v4.app.Fragment)>
	//    2    4:aload_0         
	//    3    5:getfield        #49  <Field String a>
	//    4    8:invokevirtual   #54  <Method com.irobot.home.RobotSoftwareUpdateActivity_$a com.irobot.home.RobotSoftwareUpdateActivity_$a.a(String)>
	//    5   11:invokevirtual   #57  <Method org.androidannotations.api.a.e com.irobot.home.RobotSoftwareUpdateActivity_$a.a()>
	//    6   14:pop             
	//    7   15:return          
	}

	protected String a;
	protected boolean b;
	TextView c;
	ImageView d;
	LinearLayout e;
}

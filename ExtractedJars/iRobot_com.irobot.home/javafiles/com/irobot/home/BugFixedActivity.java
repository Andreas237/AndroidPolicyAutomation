// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import com.irobot.core.AnalyticsSubsystem;
import com.irobot.home.util.j;
import com.irobot.home.util.o;

// Referenced classes of package com.irobot.home:
//			BaseFragmentActivity, SelectRobotTypeActivity_

public class BugFixedActivity extends BaseFragmentActivity
{

	public BugFixedActivity()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #30  <Method void BaseFragmentActivity()>
	//    2    4:return          
	}

	protected void e()
	{
		o.b(b, "Showing BugFixedActivity");
	//    0    0:getstatic       #26  <Field String b>
	//    1    3:ldc1            #33  <String "Showing BugFixedActivity">
	//    2    5:invokestatic    #38  <Method void o.b(String, String)>
		AnalyticsSubsystem.getInstance().trackRobotHealedMessageViewed();
	//    3    8:invokestatic    #44  <Method AnalyticsSubsystem AnalyticsSubsystem.getInstance()>
	//    4   11:invokevirtual   #47  <Method void AnalyticsSubsystem.trackRobotHealedMessageViewed()>
		e(getString(0x7f0f0796));
	//    5   14:aload_0         
	//    6   15:aload_0         
	//    7   16:ldc1            #48  <Int 0x7f0f0796>
	//    8   18:invokevirtual   #52  <Method String getString(int)>
	//    9   21:invokevirtual   #55  <Method void e(String)>
		a.setOnClickListener(new android.view.View.OnClickListener() {

			public void onClick(View view)
			{
				AnalyticsSubsystem.getInstance().trackReAddRobotPressedAfterBlidHealing();
			//    0    0:invokestatic    #28  <Method AnalyticsSubsystem AnalyticsSubsystem.getInstance()>
			//    1    3:invokevirtual   #31  <Method void AnalyticsSubsystem.trackReAddRobotPressedAfterBlidHealing()>
				view = ((View) (new Intent(((android.content.Context) (a)), com/irobot/home/SelectRobotTypeActivity_)));
			//    2    6:new             #33  <Class Intent>
			//    3    9:dup             
			//    4   10:aload_0         
			//    5   11:getfield        #17  <Field BugFixedActivity a>
			//    6   14:ldc1            #35  <Class SelectRobotTypeActivity_>
			//    7   16:invokespecial   #38  <Method void Intent(android.content.Context, Class)>
			//    8   19:astore_1        
				j.a(((android.app.Activity) (a)), ((Intent) (view)));
			//    9   20:aload_0         
			//   10   21:getfield        #17  <Field BugFixedActivity a>
			//   11   24:aload_1         
			//   12   25:invokestatic    #43  <Method void j.a(android.app.Activity, Intent)>
			//   13   28:return          
			}

			final BugFixedActivity a;

			
			{
				a = BugFixedActivity.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field BugFixedActivity a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
		}
);
	//   10   24:aload_0         
	//   11   25:getfield        #57  <Field Button a>
	//   12   28:new             #6   <Class BugFixedActivity$1>
	//   13   31:dup             
	//   14   32:aload_0         
	//   15   33:invokespecial   #60  <Method void BugFixedActivity$1(BugFixedActivity)>
	//   16   36:invokevirtual   #66  <Method void Button.setOnClickListener(android.view.View$OnClickListener)>
	//   17   39:return          
	}

	private static final String b = j.r(((Class) (com/irobot/home/BugFixedActivity)).getSimpleName());
	Button a;

	static 
	{
	//    0    0:ldc1            #2   <Class BugFixedActivity>
	//    1    2:invokevirtual   #18  <Method String Class.getSimpleName()>
	//    2    5:invokestatic    #24  <Method String j.r(String)>
	//    3    8:putstatic       #26  <Field String b>
	//*   4   11:return          
	}
}

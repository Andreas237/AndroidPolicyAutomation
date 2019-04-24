// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.widget.LinearLayout;

// Referenced classes of package com.irobot.home:
//			RobotCleanActivity

class RobotCleanActivity$12
	implements Runnable
{

	public void run()
	{
		if(RobotCleanActivity.f(b) != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #19  <Field RobotCleanActivity b>
	//*   2    4:invokestatic    #30  <Method com.irobot.home.fragments.bi RobotCleanActivity.f(RobotCleanActivity)>
	//*   3    7:ifnull          97
		{
			FragmentManager fragmentmanager = b.getFragmentManager();
	//    4   10:aload_0         
	//    5   11:getfield        #19  <Field RobotCleanActivity b>
	//    6   14:invokevirtual   #34  <Method FragmentManager RobotCleanActivity.getFragmentManager()>
	//    7   17:astore_1        
			FragmentTransaction fragmenttransaction = fragmentmanager.beginTransaction();
	//    8   18:aload_1         
	//    9   19:invokevirtual   #40  <Method FragmentTransaction FragmentManager.beginTransaction()>
	//   10   22:astore_2        
			if(a)
	//*  11   23:aload_0         
	//*  12   24:getfield        #21  <Field boolean a>
	//*  13   27:ifeq            56
			{
				b.g.setVisibility(4);
	//   14   30:aload_0         
	//   15   31:getfield        #19  <Field RobotCleanActivity b>
	//   16   34:getfield        #44  <Field LinearLayout RobotCleanActivity.g>
	//   17   37:iconst_4        
	//   18   38:invokevirtual   #50  <Method void LinearLayout.setVisibility(int)>
				fragmenttransaction.show(((android.app.Fragment) (RobotCleanActivity.f(b))));
	//   19   41:aload_2         
	//   20   42:aload_0         
	//   21   43:getfield        #19  <Field RobotCleanActivity b>
	//   22   46:invokestatic    #30  <Method com.irobot.home.fragments.bi RobotCleanActivity.f(RobotCleanActivity)>
	//   23   49:invokevirtual   #56  <Method FragmentTransaction FragmentTransaction.show(android.app.Fragment)>
	//   24   52:pop             
			} else
	//*  25   53:goto            87
			{
				b.g.setVisibility(0);
	//   26   56:aload_0         
	//   27   57:getfield        #19  <Field RobotCleanActivity b>
	//   28   60:getfield        #44  <Field LinearLayout RobotCleanActivity.g>
	//   29   63:iconst_0        
	//   30   64:invokevirtual   #50  <Method void LinearLayout.setVisibility(int)>
				fragmenttransaction.setCustomAnimations(0, 0x7f020003);
	//   31   67:aload_2         
	//   32   68:iconst_0        
	//   33   69:ldc1            #57  <Int 0x7f020003>
	//   34   71:invokevirtual   #61  <Method FragmentTransaction FragmentTransaction.setCustomAnimations(int, int)>
	//   35   74:pop             
				fragmenttransaction.hide(((android.app.Fragment) (RobotCleanActivity.f(b))));
	//   36   75:aload_2         
	//   37   76:aload_0         
	//   38   77:getfield        #19  <Field RobotCleanActivity b>
	//   39   80:invokestatic    #30  <Method com.irobot.home.fragments.bi RobotCleanActivity.f(RobotCleanActivity)>
	//   40   83:invokevirtual   #64  <Method FragmentTransaction FragmentTransaction.hide(android.app.Fragment)>
	//   41   86:pop             
			}
			fragmenttransaction.commit();
	//   42   87:aload_2         
	//   43   88:invokevirtual   #68  <Method int FragmentTransaction.commit()>
	//   44   91:pop             
			fragmentmanager.executePendingTransactions();
	//   45   92:aload_1         
	//   46   93:invokevirtual   #72  <Method boolean FragmentManager.executePendingTransactions()>
	//   47   96:pop             
		}
	//   48   97:return          
	}

	final boolean a;
	final RobotCleanActivity b;

	RobotCleanActivity$12(RobotCleanActivity robotcleanactivity, boolean flag)
	{
		b = robotcleanactivity;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field RobotCleanActivity b>
		a = flag;
	//    3    5:aload_0         
	//    4    6:iload_2         
	//    5    7:putfield        #21  <Field boolean a>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #24  <Method void Object()>
	//    8   14:return          
	}
}

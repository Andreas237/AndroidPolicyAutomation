// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.widget.LinearLayout;
import com.irobot.core.NetworkDiagnosticRoutines;
import com.irobot.home.fragments.bd;

// Referenced classes of package com.irobot.home:
//			RobotCleanActivity

class RobotCleanActivity$2
	implements Runnable
{

	public void run()
	{
		int i = RobotCleanActivity$4.b[RobotCleanActivity.g(a).ordinal()];
	//    0    0:getstatic       #27  <Field int[] RobotCleanActivity$4.b>
	//    1    3:aload_0         
	//    2    4:getfield        #17  <Field RobotCleanActivity a>
	//    3    7:invokestatic    #31  <Method NetworkDiagnosticRoutines RobotCleanActivity.g(RobotCleanActivity)>
	//    4   10:invokevirtual   #37  <Method int NetworkDiagnosticRoutines.ordinal()>
	//    5   13:iaload          
	//    6   14:istore_1        
		boolean flag = false;
	//    7   15:iconst_0        
	//    8   16:istore_2        
		Object obj;
		switch(i)
	//*   9   17:iload_1         
		{
	//*  10   18:tableswitch     1 2: default 40
	//	               1 61
	//	               2 46
		default:
			obj = "";
	//   11   40:ldc1            #39  <String "">
	//   12   42:astore_3        
			break;

	//*  13   43:goto            71
		case 2: // '\002'
			obj = ((Object) (a.getString(0x7f0f0307)));
	//   14   46:aload_0         
	//   15   47:getfield        #17  <Field RobotCleanActivity a>
	//   16   50:ldc1            #40  <Int 0x7f0f0307>
	//   17   52:invokevirtual   #44  <Method String RobotCleanActivity.getString(int)>
	//   18   55:astore_3        
			flag = true;
	//   19   56:iconst_1        
	//   20   57:istore_2        
			break;

	//*  21   58:goto            71
		case 1: // '\001'
			obj = ((Object) (a.getString(0x7f0f07b6)));
	//   22   61:aload_0         
	//   23   62:getfield        #17  <Field RobotCleanActivity a>
	//   24   65:ldc1            #45  <Int 0x7f0f07b6>
	//   25   67:invokevirtual   #44  <Method String RobotCleanActivity.getString(int)>
	//   26   70:astore_3        
			break;
		}
		Object obj1 = ((Object) (a.getString(0x7f0f073f)));
	//   27   71:aload_0         
	//   28   72:getfield        #17  <Field RobotCleanActivity a>
	//   29   75:ldc1            #46  <Int 0x7f0f073f>
	//   30   77:invokevirtual   #44  <Method String RobotCleanActivity.getString(int)>
	//   31   80:astore          4
		RobotCleanActivity robotcleanactivity = a;
	//   32   82:aload_0         
	//   33   83:getfield        #17  <Field RobotCleanActivity a>
	//   34   86:astore          5
		new bd();
	//   35   88:new             #48  <Class bd>
	//   36   91:dup             
	//   37   92:invokespecial   #49  <Method void bd()>
	//   38   95:pop             
		RobotCleanActivity.a(robotcleanactivity, bd.e().a(((String) (obj))).b(((String) (obj1))).a(flag).a());
	//   39   96:aload           5
	//   40   98:invokestatic    #53  <Method com.irobot.home.fragments.bd$a bd.e()>
	//   41  101:aload_3         
	//   42  102:invokevirtual   #58  <Method com.irobot.home.fragments.bd$a com.irobot.home.fragments.bd$a.a(String)>
	//   43  105:aload           4
	//   44  107:invokevirtual   #60  <Method com.irobot.home.fragments.bd$a com.irobot.home.fragments.bd$a.b(String)>
	//   45  110:iload_2         
	//   46  111:invokevirtual   #63  <Method com.irobot.home.fragments.bd$a com.irobot.home.fragments.bd$a.a(boolean)>
	//   47  114:invokevirtual   #66  <Method com.irobot.home.fragments.bc com.irobot.home.fragments.bd$a.a()>
	//   48  117:invokestatic    #69  <Method com.irobot.home.fragments.bc RobotCleanActivity.a(RobotCleanActivity, com.irobot.home.fragments.bc)>
	//   49  120:pop             
		obj = ((Object) (a.getFragmentManager()));
	//   50  121:aload_0         
	//   51  122:getfield        #17  <Field RobotCleanActivity a>
	//   52  125:invokevirtual   #73  <Method FragmentManager RobotCleanActivity.getFragmentManager()>
	//   53  128:astore_3        
		obj1 = ((Object) (((FragmentManager) (obj)).beginTransaction()));
	//   54  129:aload_3         
	//   55  130:invokevirtual   #79  <Method FragmentTransaction FragmentManager.beginTransaction()>
	//   56  133:astore          4
		((FragmentTransaction) (obj1)).add(0x7f090116, ((android.app.Fragment) (RobotCleanActivity.h(a))));
	//   57  135:aload           4
	//   58  137:ldc1            #80  <Int 0x7f090116>
	//   59  139:aload_0         
	//   60  140:getfield        #17  <Field RobotCleanActivity a>
	//   61  143:invokestatic    #84  <Method com.irobot.home.fragments.bc RobotCleanActivity.h(RobotCleanActivity)>
	//   62  146:invokevirtual   #90  <Method FragmentTransaction FragmentTransaction.add(int, android.app.Fragment)>
	//   63  149:pop             
		((FragmentTransaction) (obj1)).commit();
	//   64  150:aload           4
	//   65  152:invokevirtual   #93  <Method int FragmentTransaction.commit()>
	//   66  155:pop             
		((FragmentManager) (obj)).executePendingTransactions();
	//   67  156:aload_3         
	//   68  157:invokevirtual   #97  <Method boolean FragmentManager.executePendingTransactions()>
	//   69  160:pop             
		a.g.setVisibility(8);
	//   70  161:aload_0         
	//   71  162:getfield        #17  <Field RobotCleanActivity a>
	//   72  165:getfield        #100 <Field LinearLayout RobotCleanActivity.g>
	//   73  168:bipush          8
	//   74  170:invokevirtual   #106 <Method void LinearLayout.setVisibility(int)>
	//   75  173:return          
	}

	final RobotCleanActivity a;

	RobotCleanActivity$2(RobotCleanActivity robotcleanactivity)
	{
		a = robotcleanactivity;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field RobotCleanActivity a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #19  <Method void Object()>
	//    5    9:return          
	}
}

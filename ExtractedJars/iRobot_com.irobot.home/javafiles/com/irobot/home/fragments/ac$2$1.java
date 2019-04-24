// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.fragments;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import com.irobot.core.NotificationCenterDataItem;
import com.irobot.core.NotificationCenterServiceCommand;
import com.irobot.home.b.v;
import java.util.ArrayList;

// Referenced classes of package com.irobot.home.fragments:
//			ac

class ac$2$1
	implements com.irobot.home.view.bleView.b
{

	public void a(int i)
	{
		if(ac.a(a.a) != null && ac.b(a.a) != null && i >= 0 && i < ac.a(a.a).size())
	//*   0    0:aload_0         
	//*   1    1:getfield        #16  <Field ac$2 a>
	//*   2    4:getfield        #24  <Field ac ac$2.a>
	//*   3    7:invokestatic    #29  <Method ArrayList ac.a(ac)>
	//*   4   10:ifnull          146
	//*   5   13:aload_0         
	//*   6   14:getfield        #16  <Field ac$2 a>
	//*   7   17:getfield        #24  <Field ac ac$2.a>
	//*   8   20:invokestatic    #33  <Method ac$a ac.b(ac)>
	//*   9   23:ifnull          146
	//*  10   26:iload_1         
	//*  11   27:iflt            146
	//*  12   30:iload_1         
	//*  13   31:aload_0         
	//*  14   32:getfield        #16  <Field ac$2 a>
	//*  15   35:getfield        #24  <Field ac ac$2.a>
	//*  16   38:invokestatic    #29  <Method ArrayList ac.a(ac)>
	//*  17   41:invokevirtual   #39  <Method int ArrayList.size()>
	//*  18   44:icmpge          146
		{
			NotificationCenterDataItem notificationcenterdataitem = (NotificationCenterDataItem)ac.a(a.a).get(i);
	//   19   47:aload_0         
	//   20   48:getfield        #16  <Field ac$2 a>
	//   21   51:getfield        #24  <Field ac ac$2.a>
	//   22   54:invokestatic    #29  <Method ArrayList ac.a(ac)>
	//   23   57:iload_1         
	//   24   58:invokevirtual   #43  <Method Object ArrayList.get(int)>
	//   25   61:checkcast       #45  <Class NotificationCenterDataItem>
	//   26   64:astore_2        
			ac.a(a.a, ac.c(a.a), notificationcenterdataitem, NotificationCenterServiceCommand.DismissNotification);
	//   27   65:aload_0         
	//   28   66:getfield        #16  <Field ac$2 a>
	//   29   69:getfield        #24  <Field ac ac$2.a>
	//   30   72:aload_0         
	//   31   73:getfield        #16  <Field ac$2 a>
	//   32   76:getfield        #24  <Field ac ac$2.a>
	//   33   79:invokestatic    #49  <Method com.irobot.core.NotificationCenterUIService ac.c(ac)>
	//   34   82:aload_2         
	//   35   83:getstatic       #55  <Field NotificationCenterServiceCommand NotificationCenterServiceCommand.DismissNotification>
	//   36   86:invokestatic    #58  <Method void ac.a(ac, com.irobot.core.NotificationCenterUIService, NotificationCenterDataItem, NotificationCenterServiceCommand)>
			if(ac.a(a.a).remove(((Object) (notificationcenterdataitem))))
	//*  37   89:aload_0         
	//*  38   90:getfield        #16  <Field ac$2 a>
	//*  39   93:getfield        #24  <Field ac ac$2.a>
	//*  40   96:invokestatic    #29  <Method ArrayList ac.a(ac)>
	//*  41   99:aload_2         
	//*  42  100:invokevirtual   #62  <Method boolean ArrayList.remove(Object)>
	//*  43  103:ifeq            146
			{
				ac.b(a.a).d(i);
	//   44  106:aload_0         
	//   45  107:getfield        #16  <Field ac$2 a>
	//   46  110:getfield        #24  <Field ac ac$2.a>
	//   47  113:invokestatic    #33  <Method ac$a ac.b(ac)>
	//   48  116:iload_1         
	//   49  117:invokevirtual   #67  <Method void ac$a.d(int)>
				if(ac.a(a.a).size() == 0)
	//*  50  120:aload_0         
	//*  51  121:getfield        #16  <Field ac$2 a>
	//*  52  124:getfield        #24  <Field ac ac$2.a>
	//*  53  127:invokestatic    #29  <Method ArrayList ac.a(ac)>
	//*  54  130:invokevirtual   #39  <Method int ArrayList.size()>
	//*  55  133:ifne            146
					a.a.b();
	//   56  136:aload_0         
	//   57  137:getfield        #16  <Field ac$2 a>
	//   58  140:getfield        #24  <Field ac ac$2.a>
	//   59  143:invokevirtual   #69  <Method void ac.b()>
			}
		}
	//   60  146:return          
	}

	final ac._cls2 a;

	ac$2$1(ac._cls2 _pcls2)
	{
		a = _pcls2;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #16  <Field ac$2 a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #19  <Method void Object()>
	//    5    9:return          
	}

	// Unreferenced inner class com/irobot/home/fragments/ac$2

/* anonymous class */
	class ac._cls2 extends v
	{

		public void a(android.support.v7.widget.RecyclerView.u u, ArrayList arraylist)
		{
			arraylist.add(((Object) ((new com.irobot.home.view.RevealableView.a(((Context) (a.getActivity())))).a(0x7f0600a1).b(0x7f08012c).a(((com.irobot.home.view.RevealableView.b) (new ac._cls2._cls1(this)))).a())));
		//    0    0:aload_2         
		//    1    1:new             #23  <Class com.irobot.home.view.RevealableView$a>
		//    2    4:dup             
		//    3    5:aload_0         
		//    4    6:getfield        #16  <Field ac a>
		//    5    9:invokevirtual   #27  <Method android.app.Activity ac.getActivity()>
		//    6   12:invokespecial   #30  <Method void com.irobot.home.view.RevealableView$a(Context)>
		//    7   15:ldc1            #31  <Int 0x7f0600a1>
		//    8   17:invokevirtual   #34  <Method com.irobot.home.view.RevealableView$a com.irobot.home.view.RevealableView$a.a(int)>
		//    9   20:ldc1            #35  <Int 0x7f08012c>
		//   10   22:invokevirtual   #38  <Method com.irobot.home.view.RevealableView$a com.irobot.home.view.RevealableView$a.b(int)>
		//   11   25:new             #11  <Class ac$2$1>
		//   12   28:dup             
		//   13   29:aload_0         
		//   14   30:invokespecial   #41  <Method void ac$2$1(ac$2)>
		//   15   33:invokevirtual   #44  <Method com.irobot.home.view.RevealableView$a com.irobot.home.view.RevealableView$a.a(com.irobot.home.view.RevealableView$b)>
		//   16   36:invokevirtual   #47  <Method com.irobot.home.view.RevealableView com.irobot.home.view.RevealableView$a.a()>
		//   17   39:invokevirtual   #53  <Method boolean ArrayList.add(Object)>
		//   18   42:pop             
		//   19   43:return          
		}

		final ac a;

			
			{
				a = ac1;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field ac a>
				super(context, recyclerview);
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:aload_3         
			//    6    8:invokespecial   #19  <Method void v(Context, RecyclerView)>
			//    7   11:return          
			}
	}

}

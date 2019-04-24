// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.fragments;

import android.os.Handler;
import com.irobot.home.model.Robot;
import com.irobot.home.model.RobotPreferences;
import com.irobot.home.util.j;

// Referenced classes of package com.irobot.home.fragments:
//			bk

class bk$1
	implements Runnable
{

	public void run()
	{
		Robot robot = j.c(j.k());
	//    0    0:invokestatic    #25  <Method com.irobot.core.AssetId j.k()>
	//    1    3:invokestatic    #29  <Method Robot j.c(com.irobot.core.AssetId)>
	//    2    6:astore_1        
		if(robot != null && bk.a(a))
	//*   3    7:aload_1         
	//*   4    8:ifnull          121
	//*   5   11:aload_0         
	//*   6   12:getfield        #14  <Field bk a>
	//*   7   15:invokestatic    #32  <Method boolean bk.a(bk)>
	//*   8   18:ifeq            121
		{
			if(!a.isVisible())
	//*   9   21:aload_0         
	//*  10   22:getfield        #14  <Field bk a>
	//*  11   25:invokevirtual   #36  <Method boolean bk.isVisible()>
	//*  12   28:ifne            32
				return;
	//   13   31:return          
			if(bk.b(a))
	//*  14   32:aload_0         
	//*  15   33:getfield        #14  <Field bk a>
	//*  16   36:invokestatic    #39  <Method boolean bk.b(bk)>
	//*  17   39:ifeq            106
			{
				bk.c(a);
	//   18   42:aload_0         
	//   19   43:getfield        #14  <Field bk a>
	//   20   46:invokestatic    #41  <Method void bk.c(bk)>
				if(bk.d(a) == 0)
	//*  21   49:aload_0         
	//*  22   50:getfield        #14  <Field bk a>
	//*  23   53:invokestatic    #45  <Method int bk.d(bk)>
	//*  24   56:ifne            106
					if(a.f && (!a.c || !robot.a().f()))
	//*  25   59:aload_0         
	//*  26   60:getfield        #14  <Field bk a>
	//*  27   63:getfield        #49  <Field boolean bk.f>
	//*  28   66:ifeq            99
	//*  29   69:aload_0         
	//*  30   70:getfield        #14  <Field bk a>
	//*  31   73:getfield        #51  <Field boolean bk.c>
	//*  32   76:ifeq            89
	//*  33   79:aload_1         
	//*  34   80:invokevirtual   #56  <Method RobotPreferences Robot.a()>
	//*  35   83:invokevirtual   #60  <Method boolean RobotPreferences.f()>
	//*  36   86:ifne            99
						a.c();
	//   37   89:aload_0         
	//   38   90:getfield        #14  <Field bk a>
	//   39   93:invokevirtual   #62  <Method void bk.c()>
					else
	//*  40   96:goto            106
						bk.e(a);
	//   41   99:aload_0         
	//   42  100:getfield        #14  <Field bk a>
	//   43  103:invokestatic    #65  <Method void bk.e(bk)>
			}
			bk.f(a).postDelayed(((Runnable) (this)), 1000L);
	//   44  106:aload_0         
	//   45  107:getfield        #14  <Field bk a>
	//   46  110:invokestatic    #68  <Method Handler bk.f(bk)>
	//   47  113:aload_0         
	//   48  114:ldc2w           #69  <Long 1000L>
	//   49  117:invokevirtual   #76  <Method boolean Handler.postDelayed(Runnable, long)>
	//   50  120:pop             
		}
	//   51  121:return          
	}

	final bk a;

	bk$1(bk bk1)
	{
		a = bk1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #14  <Field bk a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #17  <Method void Object()>
	//    5    9:return          
	}
}

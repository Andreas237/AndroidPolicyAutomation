// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import android.os.Handler;
import com.irobot.core.AccountService;
import com.irobot.core.Assembler;
import com.irobot.home.util.j;

// Referenced classes of package com.irobot.home:
//			SplashActivity, IRobotApplication

class SplashActivity$2
	implements Runnable
{

	public void run()
	{
		if(SplashActivity.a(a))
	//*   0    0:aload_0         
	//*   1    1:getfield        #14  <Field SplashActivity a>
	//*   2    4:invokestatic    #22  <Method boolean SplashActivity.a(SplashActivity)>
	//*   3    7:ifeq            123
		{
			AccountService accountservice = Assembler.getInstance().getAccountService();
	//    4   10:invokestatic    #28  <Method Assembler Assembler.getInstance()>
	//    5   13:invokevirtual   #32  <Method AccountService Assembler.getAccountService()>
	//    6   16:astore_2        
			boolean flag;
			if(accountservice.isAccountProviderInitialized() && a.a.c() == .a.False)
	//*   7   17:aload_2         
	//*   8   18:invokevirtual   #38  <Method boolean AccountService.isAccountProviderInitialized()>
	//*   9   21:ifeq            45
	//*  10   24:aload_0         
	//*  11   25:getfield        #14  <Field SplashActivity a>
	//*  12   28:getfield        #41  <Field IRobotApplication SplashActivity.a>
	//*  13   31:invokevirtual   #47  <Method IRobotApplication$a IRobotApplication.c()>
	//*  14   34:getstatic       #53  <Field IRobotApplication$a IRobotApplication$a.False>
	//*  15   37:if_acmpne       45
				flag = true;
	//   16   40:iconst_1        
	//   17   41:istore_1        
			else
	//*  18   42:goto            47
				flag = false;
	//   19   45:iconst_0        
	//   20   46:istore_1        
			if(accountservice.hasLoggedInBefore() && !flag)
	//*  21   47:aload_2         
	//*  22   48:invokevirtual   #56  <Method boolean AccountService.hasLoggedInBefore()>
	//*  23   51:ifeq            115
	//*  24   54:iload_1         
	//*  25   55:ifeq            61
	//*  26   58:goto            115
			{
				if(!j.a())
	//*  27   61:invokestatic    #60  <Method boolean j.a()>
	//*  28   64:ifne            83
					a.a(0x7f0f04db, 0x7f0f0761, ((android.content.nClickListener) (null)), false);
	//   29   67:aload_0         
	//   30   68:getfield        #14  <Field SplashActivity a>
	//   31   71:ldc1            #61  <Int 0x7f0f04db>
	//   32   73:ldc1            #62  <Int 0x7f0f0761>
	//   33   75:aconst_null     
	//   34   76:iconst_0        
	//   35   77:invokevirtual   #65  <Method void SplashActivity.a(int, int, android.content.DialogInterface$OnClickListener, boolean)>
				else
	//*  36   80:goto            123
				if(a.a.c() == .a.True)
	//*  37   83:aload_0         
	//*  38   84:getfield        #14  <Field SplashActivity a>
	//*  39   87:getfield        #41  <Field IRobotApplication SplashActivity.a>
	//*  40   90:invokevirtual   #47  <Method IRobotApplication$a IRobotApplication.c()>
	//*  41   93:getstatic       #68  <Field IRobotApplication$a IRobotApplication$a.True>
	//*  42   96:if_acmpne       123
					a.a(0x7f0f0430, 0x7f0f0761, ((android.content.nClickListener) (null)), true);
	//   43   99:aload_0         
	//   44  100:getfield        #14  <Field SplashActivity a>
	//   45  103:ldc1            #69  <Int 0x7f0f0430>
	//   46  105:ldc1            #62  <Int 0x7f0f0761>
	//   47  107:aconst_null     
	//   48  108:iconst_1        
	//   49  109:invokevirtual   #65  <Method void SplashActivity.a(int, int, android.content.DialogInterface$OnClickListener, boolean)>
			} else
	//*  50  112:goto            123
			{
				a.e();
	//   51  115:aload_0         
	//   52  116:getfield        #14  <Field SplashActivity a>
	//   53  119:invokevirtual   #72  <Method void SplashActivity.e()>
				return;
	//   54  122:return          
			}
		}
		SplashActivity.b(a).postDelayed(a.e, 2000L);
	//   55  123:aload_0         
	//   56  124:getfield        #14  <Field SplashActivity a>
	//   57  127:invokestatic    #76  <Method Handler SplashActivity.b(SplashActivity)>
	//   58  130:aload_0         
	//   59  131:getfield        #14  <Field SplashActivity a>
	//   60  134:getfield        #79  <Field Runnable SplashActivity.e>
	//   61  137:ldc2w           #80  <Long 2000L>
	//   62  140:invokevirtual   #87  <Method boolean Handler.postDelayed(Runnable, long)>
	//   63  143:pop             
	//   64  144:return          
	}

	final SplashActivity a;

	SplashActivity$2(SplashActivity splashactivity)
	{
		a = splashactivity;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #14  <Field SplashActivity a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #17  <Method void Object()>
	//    5    9:return          
	}
}

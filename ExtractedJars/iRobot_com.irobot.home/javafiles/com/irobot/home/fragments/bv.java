// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.fragments;

import android.net.wifi.WifiInfo;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.irobot.home.IRobotApplication_;
import com.irobot.home.model.WifiConfig;
import com.irobot.home.view.CustomVideoView;
import org.androidannotations.api.c.a;
import org.androidannotations.api.c.b;
import org.androidannotations.api.c.c;

// Referenced classes of package com.irobot.home.fragments:
//			bu

public final class bv extends bu
	implements org.androidannotations.api.c.a, b
{
	public static class a extends org.androidannotations.api.a.c
	{

		public bu a()
		{
			bv bv1 = new bv();
		//    0    0:new             #7   <Class bv>
		//    1    3:dup             
		//    2    4:invokespecial   #15  <Method void bv()>
		//    3    7:astore_1        
			bv1.setArguments(a);
		//    4    8:aload_1         
		//    5    9:aload_0         
		//    6   10:getfield        #18  <Field Bundle a>
		//    7   13:invokevirtual   #22  <Method void bv.setArguments(Bundle)>
			return ((bu) (bv1));
		//    8   16:aload_1         
		//    9   17:areturn         
		}

		public a a(WifiInfo wifiinfo)
		{
			a.putParcelable("currentWifiInfo", ((android.os.Parcelable) (wifiinfo)));
		//    0    0:aload_0         
		//    1    1:getfield        #18  <Field Bundle a>
		//    2    4:ldc1            #25  <String "currentWifiInfo">
		//    3    6:aload_1         
		//    4    7:invokevirtual   #31  <Method void Bundle.putParcelable(String, android.os.Parcelable)>
			return this;
		//    5   10:aload_0         
		//    6   11:areturn         
		}

		public a a(WifiConfig wificonfig)
		{
			a.putParcelable("wifiSettings", ((android.os.Parcelable) (wificonfig)));
		//    0    0:aload_0         
		//    1    1:getfield        #18  <Field Bundle a>
		//    2    4:ldc1            #34  <String "wifiSettings">
		//    3    6:aload_1         
		//    4    7:invokevirtual   #31  <Method void Bundle.putParcelable(String, android.os.Parcelable)>
			return this;
		//    5   10:aload_0         
		//    6   11:areturn         
		}

		public a a(String s)
		{
			a.putString("robotBlid", s);
		//    0    0:aload_0         
		//    1    1:getfield        #18  <Field Bundle a>
		//    2    4:ldc1            #37  <String "robotBlid">
		//    3    6:aload_1         
		//    4    7:invokevirtual   #41  <Method void Bundle.putString(String, String)>
			return this;
		//    5   10:aload_0         
		//    6   11:areturn         
		}

		public a a(boolean flag)
		{
			a.putBoolean("isProvisioningFirstPass", flag);
		//    0    0:aload_0         
		//    1    1:getfield        #18  <Field Bundle a>
		//    2    4:ldc1            #44  <String "isProvisioningFirstPass">
		//    3    6:iload_1         
		//    4    7:invokevirtual   #48  <Method void Bundle.putBoolean(String, boolean)>
			return this;
		//    5   10:aload_0         
		//    6   11:areturn         
		}

		public a b(boolean flag)
		{
			a.putBoolean("checkWifiStatus", flag);
		//    0    0:aload_0         
		//    1    1:getfield        #18  <Field Bundle a>
		//    2    4:ldc1            #51  <String "checkWifiStatus">
		//    3    6:iload_1         
		//    4    7:invokevirtual   #48  <Method void Bundle.putBoolean(String, boolean)>
			return this;
		//    5   10:aload_0         
		//    6   11:areturn         
		}

		public a c(boolean flag)
		{
			a.putBoolean("resumeNetworkSetup", flag);
		//    0    0:aload_0         
		//    1    1:getfield        #18  <Field Bundle a>
		//    2    4:ldc1            #54  <String "resumeNetworkSetup">
		//    3    6:iload_1         
		//    4    7:invokevirtual   #48  <Method void Bundle.putBoolean(String, boolean)>
			return this;
		//    5   10:aload_0         
		//    6   11:areturn         
		}

		public a d(boolean flag)
		{
			a.putBoolean("newRobotConfig", flag);
		//    0    0:aload_0         
		//    1    1:getfield        #18  <Field Bundle a>
		//    2    4:ldc1            #57  <String "newRobotConfig">
		//    3    6:iload_1         
		//    4    7:invokevirtual   #48  <Method void Bundle.putBoolean(String, boolean)>
			return this;
		//    5   10:aload_0         
		//    6   11:areturn         
		}

		public a()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #12  <Method void org.androidannotations.api.a.c()>
		//    2    4:return          
		}
	}


	public bv()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #41  <Method void bu()>
	//    2    4:aload_0         
	//    3    5:new             #43  <Class c>
	//    4    8:dup             
	//    5    9:invokespecial   #44  <Method void c()>
	//    6   12:putfield        #46  <Field c l>
	//    7   15:return          
	}

	private void a(Bundle bundle)
	{
		org.androidannotations.api.c.c.a(((b) (this)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #51  <Method void c.a(b)>
		j();
	//    2    4:aload_0         
	//    3    5:invokespecial   #54  <Method void j()>
		b = IRobotApplication_.r();
	//    4    8:aload_0         
	//    5    9:invokestatic    #60  <Method com.irobot.home.IRobotApplication IRobotApplication_.r()>
	//    6   12:putfield        #64  <Field com.irobot.home.IRobotApplication b>
	//    7   15:return          
	}

	static void a(bv bv1)
	{
		((bu) (bv1)).bu.g();
	//    0    0:aload_0         
	//    1    1:invokespecial   #68  <Method void bu.g()>
	//    2    4:return          
	}

	static void a(bv bv1, int k)
	{
		((bu) (bv1)).com.irobot.home.fragments.bu.b(k);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #72  <Method void com.irobot.home.fragments.bu.b(int)>
	//    3    5:return          
	}

	static void a(bv bv1, int k, String s)
	{
		((bu) (bv1)).com.irobot.home.fragments.bu.a(k, s);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #76  <Method void com.irobot.home.fragments.bu.a(int, String)>
	//    4    6:return          
	}

	static void a(bv bv1, WifiConfig wificonfig)
	{
		((bu) (bv1)).com.irobot.home.fragments.bu.a(wificonfig);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #80  <Method void com.irobot.home.fragments.bu.a(WifiConfig)>
	//    3    5:return          
	}

	static void a(bv bv1, String s)
	{
		((bu) (bv1)).com.irobot.home.fragments.bu.a(s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #84  <Method void com.irobot.home.fragments.bu.a(String)>
	//    3    5:return          
	}

	static void a(bv bv1, boolean flag)
	{
		((bu) (bv1)).com.irobot.home.fragments.bu.a(flag);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #88  <Method void com.irobot.home.fragments.bu.a(boolean)>
	//    3    5:return          
	}

	static void b(bv bv1)
	{
		((bu) (bv1)).com.irobot.home.fragments.bu.c();
	//    0    0:aload_0         
	//    1    1:invokespecial   #91  <Method void com.irobot.home.fragments.bu.c()>
	//    2    4:return          
	}

	static void b(bv bv1, int k)
	{
		((bu) (bv1)).bu.d(k);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #94  <Method void bu.d(int)>
	//    3    5:return          
	}

	static void b(bv bv1, WifiConfig wificonfig)
	{
		((bu) (bv1)).com.irobot.home.fragments.bu.b(wificonfig);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #96  <Method void com.irobot.home.fragments.bu.b(WifiConfig)>
	//    3    5:return          
	}

	static void c(bv bv1)
	{
		((bu) (bv1)).bu.e();
	//    0    0:aload_0         
	//    1    1:invokespecial   #99  <Method void bu.e()>
	//    2    4:return          
	}

	static void c(bv bv1, WifiConfig wificonfig)
	{
		((bu) (bv1)).com.irobot.home.fragments.bu.c(wificonfig);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #101 <Method void com.irobot.home.fragments.bu.c(WifiConfig)>
	//    3    5:return          
	}

	public static a i()
	{
		return new a();
	//    0    0:new             #32  <Class bv$a>
	//    1    3:dup             
	//    2    4:invokespecial   #104 <Method void bv$a()>
	//    3    7:areturn         
	}

	private void j()
	{
		Bundle bundle = getArguments();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #108 <Method Bundle getArguments()>
	//    2    4:astore_1        
		if(bundle != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          148
		{
			if(bundle.containsKey("robotBlid"))
	//*   5    9:aload_1         
	//*   6   10:ldc1            #110 <String "robotBlid">
	//*   7   12:invokevirtual   #116 <Method boolean Bundle.containsKey(String)>
	//*   8   15:ifeq            28
				c = bundle.getString("robotBlid");
	//    9   18:aload_0         
	//   10   19:aload_1         
	//   11   20:ldc1            #110 <String "robotBlid">
	//   12   22:invokevirtual   #120 <Method String Bundle.getString(String)>
	//   13   25:putfield        #123 <Field String c>
			if(bundle.containsKey("currentWifiInfo"))
	//*  14   28:aload_1         
	//*  15   29:ldc1            #125 <String "currentWifiInfo">
	//*  16   31:invokevirtual   #116 <Method boolean Bundle.containsKey(String)>
	//*  17   34:ifeq            50
				d = (WifiInfo)bundle.getParcelable("currentWifiInfo");
	//   18   37:aload_0         
	//   19   38:aload_1         
	//   20   39:ldc1            #125 <String "currentWifiInfo">
	//   21   41:invokevirtual   #129 <Method android.os.Parcelable Bundle.getParcelable(String)>
	//   22   44:checkcast       #131 <Class WifiInfo>
	//   23   47:putfield        #134 <Field WifiInfo d>
			if(bundle.containsKey("wifiSettings"))
	//*  24   50:aload_1         
	//*  25   51:ldc1            #136 <String "wifiSettings">
	//*  26   53:invokevirtual   #116 <Method boolean Bundle.containsKey(String)>
	//*  27   56:ifeq            72
				e = (WifiConfig)bundle.getParcelable("wifiSettings");
	//   28   59:aload_0         
	//   29   60:aload_1         
	//   30   61:ldc1            #136 <String "wifiSettings">
	//   31   63:invokevirtual   #129 <Method android.os.Parcelable Bundle.getParcelable(String)>
	//   32   66:checkcast       #138 <Class WifiConfig>
	//   33   69:putfield        #141 <Field WifiConfig e>
			if(bundle.containsKey("isProvisioningFirstPass"))
	//*  34   72:aload_1         
	//*  35   73:ldc1            #143 <String "isProvisioningFirstPass">
	//*  36   75:invokevirtual   #116 <Method boolean Bundle.containsKey(String)>
	//*  37   78:ifeq            91
				f = bundle.getBoolean("isProvisioningFirstPass");
	//   38   81:aload_0         
	//   39   82:aload_1         
	//   40   83:ldc1            #143 <String "isProvisioningFirstPass">
	//   41   85:invokevirtual   #146 <Method boolean Bundle.getBoolean(String)>
	//   42   88:putfield        #150 <Field boolean f>
			if(bundle.containsKey("checkWifiStatus"))
	//*  43   91:aload_1         
	//*  44   92:ldc1            #152 <String "checkWifiStatus">
	//*  45   94:invokevirtual   #116 <Method boolean Bundle.containsKey(String)>
	//*  46   97:ifeq            110
				g = bundle.getBoolean("checkWifiStatus");
	//   47  100:aload_0         
	//   48  101:aload_1         
	//   49  102:ldc1            #152 <String "checkWifiStatus">
	//   50  104:invokevirtual   #146 <Method boolean Bundle.getBoolean(String)>
	//   51  107:putfield        #154 <Field boolean g>
			if(bundle.containsKey("resumeNetworkSetup"))
	//*  52  110:aload_1         
	//*  53  111:ldc1            #156 <String "resumeNetworkSetup">
	//*  54  113:invokevirtual   #116 <Method boolean Bundle.containsKey(String)>
	//*  55  116:ifeq            129
				h = bundle.getBoolean("resumeNetworkSetup");
	//   56  119:aload_0         
	//   57  120:aload_1         
	//   58  121:ldc1            #156 <String "resumeNetworkSetup">
	//   59  123:invokevirtual   #146 <Method boolean Bundle.getBoolean(String)>
	//   60  126:putfield        #159 <Field boolean h>
			if(bundle.containsKey("newRobotConfig"))
	//*  61  129:aload_1         
	//*  62  130:ldc1            #161 <String "newRobotConfig">
	//*  63  132:invokevirtual   #116 <Method boolean Bundle.containsKey(String)>
	//*  64  135:ifeq            148
				i = bundle.getBoolean("newRobotConfig");
	//   65  138:aload_0         
	//   66  139:aload_1         
	//   67  140:ldc1            #161 <String "newRobotConfig">
	//   68  142:invokevirtual   #146 <Method boolean Bundle.getBoolean(String)>
	//   69  145:putfield        #163 <Field boolean i>
		}
	//   70  148:return          
	}

	public View a(int k)
	{
		if(n == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #166 <Field View n>
	//*   2    4:ifnonnull       9
			return null;
	//    3    7:aconst_null     
	//    4    8:areturn         
		else
			return n.findViewById(k);
	//    5    9:aload_0         
	//    6   10:getfield        #166 <Field View n>
	//    7   13:iload_1         
	//    8   14:invokevirtual   #171 <Method View View.findViewById(int)>
	//    9   17:areturn         
	}

	public void a(int k, String s)
	{
		org.androidannotations.api.b.a("", new Runnable(k, s) {

			public void run()
			{
				com.irobot.home.fragments.bv.a(c, a, b);
			//    0    0:aload_0         
			//    1    1:getfield        #20  <Field bv c>
			//    2    4:aload_0         
			//    3    5:getfield        #22  <Field int a>
			//    4    8:aload_0         
			//    5    9:getfield        #24  <Field String b>
			//    6   12:invokestatic    #31  <Method void com.irobot.home.fragments.bv.a(bv, int, String)>
			//    7   15:return          
			}

			final int a;
			final String b;
			final bv c;

			
			{
				c = bv.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #20  <Field bv c>
				a = k;
			//    3    5:aload_0         
			//    4    6:iload_2         
			//    5    7:putfield        #22  <Field int a>
				b = s;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #24  <Field String b>
				super();
			//    9   15:aload_0         
			//   10   16:invokespecial   #27  <Method void Object()>
			//   11   19:return          
			}
		}
, 0L);
	//    0    0:ldc1            #175 <String "">
	//    1    2:new             #20  <Class bv$4>
	//    2    5:dup             
	//    3    6:aload_0         
	//    4    7:iload_1         
	//    5    8:aload_2         
	//    6    9:invokespecial   #177 <Method void bv$4(bv, int, String)>
	//    7   12:lconst_0        
	//    8   13:invokestatic    #182 <Method void org.androidannotations.api.b.a(String, Runnable, long)>
	//    9   16:return          
	}

	public void a(WifiConfig wificonfig)
	{
		org.androidannotations.api.a.a(((org.androidannotations.api.a.a) (new org.androidannotations.api.a.a("tryHailMaryRunning", 0L, "", wificonfig) {

			public void a()
			{
				try
				{
					com.irobot.home.fragments.bv.a(b, a);
			//    0    0:aload_0         
			//    1    1:getfield        #16  <Field bv b>
			//    2    4:aload_0         
			//    3    5:getfield        #18  <Field WifiConfig a>
			//    4    8:invokestatic    #28  <Method void com.irobot.home.fragments.bv.a(bv, WifiConfig)>
					return;
			//    5   11:return          
				}
				catch(Throwable throwable)
			//*   6   12:astore_1        
				{
					Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), throwable);
			//    7   13:invokestatic    #34  <Method Thread$UncaughtExceptionHandler Thread.getDefaultUncaughtExceptionHandler()>
			//    8   16:invokestatic    #38  <Method Thread Thread.currentThread()>
			//    9   19:aload_1         
			//   10   20:invokeinterface #44  <Method void Thread$UncaughtExceptionHandler.uncaughtException(Thread, Throwable)>
				}
			//   11   25:return          
			}

			final WifiConfig a;
			final bv b;

			
			{
				b = bv.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field bv b>
				a = wificonfig;
			//    3    5:aload_0         
			//    4    6:aload           6
			//    5    8:putfield        #18  <Field WifiConfig a>
				super(s, l1, s1);
			//    6   11:aload_0         
			//    7   12:aload_2         
			//    8   13:lload_3         
			//    9   14:aload           5
			//   10   16:invokespecial   #21  <Method void org.androidannotations.api.a$a(String, long, String)>
			//   11   19:return          
			}
		}
)));
	//    0    0:new             #28  <Class bv$8>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:ldc1            #184 <String "tryHailMaryRunning">
	//    4    7:lconst_0        
	//    5    8:ldc1            #175 <String "">
	//    6   10:aload_1         
	//    7   11:invokespecial   #187 <Method void bv$8(bv, String, long, String, WifiConfig)>
	//    8   14:invokestatic    #192 <Method void org.androidannotations.api.a.a(org.androidannotations.api.a$a)>
	//    9   17:return          
	}

	protected void a(String s)
	{
		org.androidannotations.api.b.a("", new Runnable(s) {

			public void run()
			{
				com.irobot.home.fragments.bv.a(b, a);
			//    0    0:aload_0         
			//    1    1:getfield        #18  <Field bv b>
			//    2    4:aload_0         
			//    3    5:getfield        #20  <Field String a>
			//    4    8:invokestatic    #27  <Method void com.irobot.home.fragments.bv.a(bv, String)>
			//    5   11:return          
			}

			final String a;
			final bv b;

			
			{
				b = bv.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #18  <Field bv b>
				a = s;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #20  <Field String a>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #23  <Method void Object()>
			//    8   14:return          
			}
		}
, 0L);
	//    0    0:ldc1            #175 <String "">
	//    1    2:new             #22  <Class bv$5>
	//    2    5:dup             
	//    3    6:aload_0         
	//    4    7:aload_1         
	//    5    8:invokespecial   #194 <Method void bv$5(bv, String)>
	//    6   11:lconst_0        
	//    7   12:invokestatic    #182 <Method void org.androidannotations.api.b.a(String, Runnable, long)>
	//    8   15:return          
	}

	public void a(org.androidannotations.api.c.a a1)
	{
		j = (CustomVideoView)a1.a(0x7f09012c);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc1            #196 <Int 0x7f09012c>
	//    3    4:invokeinterface #198 <Method View a.a(int)>
	//    4    9:checkcast       #200 <Class CustomVideoView>
	//    5   12:putfield        #203 <Field CustomVideoView j>
		a();
	//    6   15:aload_0         
	//    7   16:invokevirtual   #205 <Method void a()>
	//    8   19:return          
	}

	public void a(boolean flag)
	{
		org.androidannotations.api.a.a(((org.androidannotations.api.a.a) (new org.androidannotations.api.a.a("establishRobotCommsRunning", 0L, "", flag) {

			public void a()
			{
				try
				{
					com.irobot.home.fragments.bv.a(b, a);
			//    0    0:aload_0         
			//    1    1:getfield        #16  <Field bv b>
			//    2    4:aload_0         
			//    3    5:getfield        #18  <Field boolean a>
			//    4    8:invokestatic    #28  <Method void com.irobot.home.fragments.bv.a(bv, boolean)>
					return;
			//    5   11:return          
				}
				catch(Throwable throwable)
			//*   6   12:astore_1        
				{
					Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), throwable);
			//    7   13:invokestatic    #34  <Method Thread$UncaughtExceptionHandler Thread.getDefaultUncaughtExceptionHandler()>
			//    8   16:invokestatic    #38  <Method Thread Thread.currentThread()>
			//    9   19:aload_1         
			//   10   20:invokeinterface #44  <Method void Thread$UncaughtExceptionHandler.uncaughtException(Thread, Throwable)>
				}
			//   11   25:return          
			}

			final boolean a;
			final bv b;

			
			{
				b = bv.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field bv b>
				a = flag;
			//    3    5:aload_0         
			//    4    6:iload           6
			//    5    8:putfield        #18  <Field boolean a>
				super(s, l1, s1);
			//    6   11:aload_0         
			//    7   12:aload_2         
			//    8   13:lload_3         
			//    9   14:aload           5
			//   10   16:invokespecial   #21  <Method void org.androidannotations.api.a$a(String, long, String)>
			//   11   19:return          
			}
		}
)));
	//    0    0:new             #12  <Class bv$10>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:ldc1            #207 <String "establishRobotCommsRunning">
	//    4    7:lconst_0        
	//    5    8:ldc1            #175 <String "">
	//    6   10:iload_1         
	//    7   11:invokespecial   #210 <Method void bv$10(bv, String, long, String, boolean)>
	//    8   14:invokestatic    #192 <Method void org.androidannotations.api.a.a(org.androidannotations.api.a$a)>
	//    9   17:return          
	}

	public void b(int k)
	{
		org.androidannotations.api.b.a("", new Runnable(k) {

			public void run()
			{
				com.irobot.home.fragments.bv.a(b, a);
			//    0    0:aload_0         
			//    1    1:getfield        #18  <Field bv b>
			//    2    4:aload_0         
			//    3    5:getfield        #20  <Field int a>
			//    4    8:invokestatic    #27  <Method void com.irobot.home.fragments.bv.a(bv, int)>
			//    5   11:return          
			}

			final int a;
			final bv b;

			
			{
				b = bv.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #18  <Field bv b>
				a = k;
			//    3    5:aload_0         
			//    4    6:iload_2         
			//    5    7:putfield        #20  <Field int a>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #23  <Method void Object()>
			//    8   14:return          
			}
		}
, 0L);
	//    0    0:ldc1            #175 <String "">
	//    1    2:new             #10  <Class bv$1>
	//    2    5:dup             
	//    3    6:aload_0         
	//    4    7:iload_1         
	//    5    8:invokespecial   #212 <Method void bv$1(bv, int)>
	//    6   11:lconst_0        
	//    7   12:invokestatic    #182 <Method void org.androidannotations.api.b.a(String, Runnable, long)>
	//    8   15:return          
	}

	public void b(WifiConfig wificonfig)
	{
		org.androidannotations.api.a.a(((org.androidannotations.api.a.a) (new org.androidannotations.api.a.a("tryDefaultWifiConfigRunning", 0L, "", wificonfig) {

			public void a()
			{
				try
				{
					com.irobot.home.fragments.bv.b(b, a);
			//    0    0:aload_0         
			//    1    1:getfield        #16  <Field bv b>
			//    2    4:aload_0         
			//    3    5:getfield        #18  <Field WifiConfig a>
			//    4    8:invokestatic    #28  <Method void com.irobot.home.fragments.bv.b(bv, WifiConfig)>
					return;
			//    5   11:return          
				}
				catch(Throwable throwable)
			//*   6   12:astore_1        
				{
					Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), throwable);
			//    7   13:invokestatic    #34  <Method Thread$UncaughtExceptionHandler Thread.getDefaultUncaughtExceptionHandler()>
			//    8   16:invokestatic    #38  <Method Thread Thread.currentThread()>
			//    9   19:aload_1         
			//   10   20:invokeinterface #44  <Method void Thread$UncaughtExceptionHandler.uncaughtException(Thread, Throwable)>
				}
			//   11   25:return          
			}

			final WifiConfig a;
			final bv b;

			
			{
				b = bv.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field bv b>
				a = wificonfig;
			//    3    5:aload_0         
			//    4    6:aload           6
			//    5    8:putfield        #18  <Field WifiConfig a>
				super(s, l1, s1);
			//    6   11:aload_0         
			//    7   12:aload_2         
			//    8   13:lload_3         
			//    9   14:aload           5
			//   10   16:invokespecial   #21  <Method void org.androidannotations.api.a$a(String, long, String)>
			//   11   19:return          
			}
		}
)));
	//    0    0:new             #14  <Class bv$11>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:ldc1            #214 <String "tryDefaultWifiConfigRunning">
	//    4    7:lconst_0        
	//    5    8:ldc1            #175 <String "">
	//    6   10:aload_1         
	//    7   11:invokespecial   #215 <Method void bv$11(bv, String, long, String, WifiConfig)>
	//    8   14:invokestatic    #192 <Method void org.androidannotations.api.a.a(org.androidannotations.api.a$a)>
	//    9   17:return          
	}

	void c()
	{
		org.androidannotations.api.a.a(((org.androidannotations.api.a.a) (new org.androidannotations.api.a.a("", 0L, "") {

			public void a()
			{
				try
				{
					com.irobot.home.fragments.bv.b(a);
			//    0    0:aload_0         
			//    1    1:getfield        #15  <Field bv a>
			//    2    4:invokestatic    #25  <Method void com.irobot.home.fragments.bv.b(bv)>
					return;
			//    3    7:return          
				}
				catch(Throwable throwable)
			//*   4    8:astore_1        
				{
					Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), throwable);
			//    5    9:invokestatic    #31  <Method Thread$UncaughtExceptionHandler Thread.getDefaultUncaughtExceptionHandler()>
			//    6   12:invokestatic    #35  <Method Thread Thread.currentThread()>
			//    7   15:aload_1         
			//    8   16:invokeinterface #41  <Method void Thread$UncaughtExceptionHandler.uncaughtException(Thread, Throwable)>
				}
			//    9   21:return          
			}

			final bv a;

			
			{
				a = bv.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #15  <Field bv a>
				super(s, l1, s1);
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:lload_3         
			//    6    8:aload           5
			//    7   10:invokespecial   #18  <Method void org.androidannotations.api.a$a(String, long, String)>
			//    8   13:return          
			}
		}
)));
	//    0    0:new             #26  <Class bv$7>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:ldc1            #175 <String "">
	//    4    7:lconst_0        
	//    5    8:ldc1            #175 <String "">
	//    6   10:invokespecial   #218 <Method void bv$7(bv, String, long, String)>
	//    7   13:invokestatic    #192 <Method void org.androidannotations.api.a.a(org.androidannotations.api.a$a)>
	//    8   16:return          
	}

	void c(WifiConfig wificonfig)
	{
		org.androidannotations.api.a.a(((org.androidannotations.api.a.a) (new org.androidannotations.api.a.a("", 0L, "", wificonfig) {

			public void a()
			{
				try
				{
					com.irobot.home.fragments.bv.c(b, a);
			//    0    0:aload_0         
			//    1    1:getfield        #17  <Field bv b>
			//    2    4:aload_0         
			//    3    5:getfield        #19  <Field WifiConfig a>
			//    4    8:invokestatic    #29  <Method void com.irobot.home.fragments.bv.c(bv, WifiConfig)>
					return;
			//    5   11:return          
				}
				catch(Throwable throwable)
			//*   6   12:astore_1        
				{
					Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), throwable);
			//    7   13:invokestatic    #35  <Method Thread$UncaughtExceptionHandler Thread.getDefaultUncaughtExceptionHandler()>
			//    8   16:invokestatic    #39  <Method Thread Thread.currentThread()>
			//    9   19:aload_1         
			//   10   20:invokeinterface #45  <Method void Thread$UncaughtExceptionHandler.uncaughtException(Thread, Throwable)>
				}
			//   11   25:return          
			}

			final WifiConfig a;
			final bv b;

			
			{
				b = bv.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field bv b>
				a = wificonfig;
			//    3    5:aload_0         
			//    4    6:aload           6
			//    5    8:putfield        #19  <Field WifiConfig a>
				super(s, l1, s1);
			//    6   11:aload_0         
			//    7   12:aload_2         
			//    8   13:lload_3         
			//    9   14:aload           5
			//   10   16:invokespecial   #22  <Method void org.androidannotations.api.a$a(String, long, String)>
			//   11   19:return          
			}
		}
)));
	//    0    0:new             #16  <Class bv$2>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:ldc1            #175 <String "">
	//    4    7:lconst_0        
	//    5    8:ldc1            #175 <String "">
	//    6   10:aload_1         
	//    7   11:invokespecial   #219 <Method void bv$2(bv, String, long, String, WifiConfig)>
	//    8   14:invokestatic    #192 <Method void org.androidannotations.api.a.a(org.androidannotations.api.a$a)>
	//    9   17:return          
	}

	void d(int k)
	{
		org.androidannotations.api.a.a(((org.androidannotations.api.a.a) (new org.androidannotations.api.a.a("", 0L, "", k) {

			public void a()
			{
				try
				{
					com.irobot.home.fragments.bv.b(b, a);
			//    0    0:aload_0         
			//    1    1:getfield        #17  <Field bv b>
			//    2    4:aload_0         
			//    3    5:getfield        #19  <Field int a>
			//    4    8:invokestatic    #29  <Method void com.irobot.home.fragments.bv.b(bv, int)>
					return;
			//    5   11:return          
				}
				catch(Throwable throwable)
			//*   6   12:astore_1        
				{
					Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), throwable);
			//    7   13:invokestatic    #35  <Method Thread$UncaughtExceptionHandler Thread.getDefaultUncaughtExceptionHandler()>
			//    8   16:invokestatic    #39  <Method Thread Thread.currentThread()>
			//    9   19:aload_1         
			//   10   20:invokeinterface #45  <Method void Thread$UncaughtExceptionHandler.uncaughtException(Thread, Throwable)>
				}
			//   11   25:return          
			}

			final int a;
			final bv b;

			
			{
				b = bv.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field bv b>
				a = k;
			//    3    5:aload_0         
			//    4    6:iload           6
			//    5    8:putfield        #19  <Field int a>
				super(s, l1, s1);
			//    6   11:aload_0         
			//    7   12:aload_2         
			//    8   13:lload_3         
			//    9   14:aload           5
			//   10   16:invokespecial   #22  <Method void org.androidannotations.api.a$a(String, long, String)>
			//   11   19:return          
			}
		}
)));
	//    0    0:new             #18  <Class bv$3>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:ldc1            #175 <String "">
	//    4    7:lconst_0        
	//    5    8:ldc1            #175 <String "">
	//    6   10:iload_1         
	//    7   11:invokespecial   #222 <Method void bv$3(bv, String, long, String, int)>
	//    8   14:invokestatic    #192 <Method void org.androidannotations.api.a.a(org.androidannotations.api.a$a)>
	//    9   17:return          
	}

	public void e()
	{
		org.androidannotations.api.a.a(((org.androidannotations.api.a.a) (new org.androidannotations.api.a.a("continueHailMaryRunning", 0L, "") {

			public void a()
			{
				try
				{
					com.irobot.home.fragments.bv.c(a);
			//    0    0:aload_0         
			//    1    1:getfield        #15  <Field bv a>
			//    2    4:invokestatic    #25  <Method void com.irobot.home.fragments.bv.c(bv)>
					return;
			//    3    7:return          
				}
				catch(Throwable throwable)
			//*   4    8:astore_1        
				{
					Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), throwable);
			//    5    9:invokestatic    #31  <Method Thread$UncaughtExceptionHandler Thread.getDefaultUncaughtExceptionHandler()>
			//    6   12:invokestatic    #35  <Method Thread Thread.currentThread()>
			//    7   15:aload_1         
			//    8   16:invokeinterface #41  <Method void Thread$UncaughtExceptionHandler.uncaughtException(Thread, Throwable)>
				}
			//    9   21:return          
			}

			final bv a;

			
			{
				a = bv.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #15  <Field bv a>
				super(s, l1, s1);
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:lload_3         
			//    6    8:aload           5
			//    7   10:invokespecial   #18  <Method void org.androidannotations.api.a$a(String, long, String)>
			//    8   13:return          
			}
		}
)));
	//    0    0:new             #30  <Class bv$9>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:ldc1            #224 <String "continueHailMaryRunning">
	//    4    7:lconst_0        
	//    5    8:ldc1            #175 <String "">
	//    6   10:invokespecial   #225 <Method void bv$9(bv, String, long, String)>
	//    7   13:invokestatic    #192 <Method void org.androidannotations.api.a.a(org.androidannotations.api.a$a)>
	//    8   16:return          
	}

	void g()
	{
		org.androidannotations.api.b.a("", new Runnable() {

			public void run()
			{
				com.irobot.home.fragments.bv.a(a);
			//    0    0:aload_0         
			//    1    1:getfield        #17  <Field bv a>
			//    2    4:invokestatic    #23  <Method void com.irobot.home.fragments.bv.a(bv)>
			//    3    7:return          
			}

			final bv a;

			
			{
				a = bv.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field bv a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
		}
, 0L);
	//    0    0:ldc1            #175 <String "">
	//    1    2:new             #24  <Class bv$6>
	//    2    5:dup             
	//    3    6:aload_0         
	//    4    7:invokespecial   #227 <Method void bv$6(bv)>
	//    5   10:lconst_0        
	//    6   11:invokestatic    #182 <Method void org.androidannotations.api.b.a(String, Runnable, long)>
	//    7   14:return          
	}

	public void onCreate(Bundle bundle)
	{
		c c1 = org.androidannotations.api.c.c.a(l);
	//    0    0:aload_0         
	//    1    1:getfield        #46  <Field c l>
	//    2    4:invokestatic    #231 <Method c c.a(c)>
	//    3    7:astore_2        
		a(bundle);
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokespecial   #233 <Method void a(Bundle)>
		super.onCreate(bundle);
	//    7   13:aload_0         
	//    8   14:aload_1         
	//    9   15:invokespecial   #235 <Method void bu.onCreate(Bundle)>
		org.androidannotations.api.c.c.a(c1);
	//   10   18:aload_2         
	//   11   19:invokestatic    #231 <Method c c.a(c)>
	//   12   22:pop             
	//   13   23:return          
	}

	public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
	{
		n = super.onCreateView(layoutinflater, viewgroup, bundle);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:aload_1         
	//    3    3:aload_2         
	//    4    4:aload_3         
	//    5    5:invokespecial   #239 <Method View bu.onCreateView(LayoutInflater, ViewGroup, Bundle)>
	//    6    8:putfield        #166 <Field View n>
		if(n == null)
	//*   7   11:aload_0         
	//*   8   12:getfield        #166 <Field View n>
	//*   9   15:ifnonnull       30
			n = layoutinflater.inflate(0x7f0b00c8, viewgroup, false);
	//   10   18:aload_0         
	//   11   19:aload_1         
	//   12   20:ldc1            #240 <Int 0x7f0b00c8>
	//   13   22:aload_2         
	//   14   23:iconst_0        
	//   15   24:invokevirtual   #246 <Method View LayoutInflater.inflate(int, ViewGroup, boolean)>
	//   16   27:putfield        #166 <Field View n>
		return n;
	//   17   30:aload_0         
	//   18   31:getfield        #166 <Field View n>
	//   19   34:areturn         
	}

	public void onDestroyView()
	{
		super.onDestroyView();
	//    0    0:aload_0         
	//    1    1:invokespecial   #249 <Method void bu.onDestroyView()>
		n = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #166 <Field View n>
		j = null;
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:putfield        #203 <Field CustomVideoView j>
	//    8   14:return          
	}

	public void onViewCreated(View view, Bundle bundle)
	{
		super.onViewCreated(view, bundle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #253 <Method void bu.onViewCreated(View, Bundle)>
		l.a(((org.androidannotations.api.c.a) (this)));
	//    4    6:aload_0         
	//    5    7:getfield        #46  <Field c l>
	//    6   10:aload_0         
	//    7   11:invokevirtual   #255 <Method void c.a(a)>
	//    8   14:return          
	}

	private final c l = new c();
	private View n;
}

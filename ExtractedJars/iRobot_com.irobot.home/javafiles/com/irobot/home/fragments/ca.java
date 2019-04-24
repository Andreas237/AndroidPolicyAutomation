// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.fragments;

import android.accounts.NetworkErrorException;
import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.DhcpInfo;
import android.net.NetworkInfo;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Handler;
import android.os.Parcelable;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.irobot.core.NetworkAddress;
import com.irobot.home.BaseFragmentActivity;
import com.irobot.home.IRobotApplication;
import com.irobot.home.i;
import com.irobot.home.j.b;
import com.irobot.home.model.IRobotModel;
import com.irobot.home.model.NetworkSettings;
import com.irobot.home.model.Robot;
import com.irobot.home.model.WifiConfig;
import com.irobot.home.o.a;
import com.irobot.home.util.j;
import com.irobot.home.util.o;
import javax.net.ssl.SSLException;
import org.json.JSONException;

// Referenced classes of package com.irobot.home.fragments:
//			g

public class ca extends g
	implements com.irobot.home.h.i.a, com.irobot.home.i.b
{
	public static interface a
	{

		public abstract void a();

		public abstract void a(a a1);

		public abstract void b();
	}

	public static final class a.a extends Enum
	{

		public static a.a valueOf(String s)
		{
			return (a.a)Enum.valueOf(com/irobot/home/fragments/ca$a$a, s);
		//    0    0:ldc1            #2   <Class ca$a$a>
		//    1    2:aload_0         
		//    2    3:invokestatic    #45  <Method Enum Enum.valueOf(Class, String)>
		//    3    6:checkcast       #2   <Class ca$a$a>
		//    4    9:areturn         
		}

		public static a.a[] values()
		{
			return (a.a[])((a.a []) ($VALUES)).clone();
		//    0    0:getstatic       #37  <Field ca$a$a[] $VALUES>
		//    1    3:invokevirtual   #52  <Method Object _5B_Lcom.irobot.home.fragments.ca$a$a_3B_.clone()>
		//    2    6:checkcast       #48  <Class ca$a$a[]>
		//    3    9:areturn         
		}

		private static final a.a $VALUES[];
		public static final a.a ROBOT_NOT_CONNECTED;
		public static final a.a ROBOT_NOT_DOCKED;
		public static final a.a ROBOT_NOT_READY;
		public static final a.a UPDATE_INTERRUPTED;

		static 
		{
			ROBOT_NOT_CONNECTED = new a.a("ROBOT_NOT_CONNECTED", 0);
		//    0    0:new             #2   <Class ca$a$a>
		//    1    3:dup             
		//    2    4:ldc1            #20  <String "ROBOT_NOT_CONNECTED">
		//    3    6:iconst_0        
		//    4    7:invokespecial   #24  <Method void ca$a$a(String, int)>
		//    5   10:putstatic       #26  <Field ca$a$a ROBOT_NOT_CONNECTED>
			ROBOT_NOT_DOCKED = new a.a("ROBOT_NOT_DOCKED", 1);
		//    6   13:new             #2   <Class ca$a$a>
		//    7   16:dup             
		//    8   17:ldc1            #27  <String "ROBOT_NOT_DOCKED">
		//    9   19:iconst_1        
		//   10   20:invokespecial   #24  <Method void ca$a$a(String, int)>
		//   11   23:putstatic       #29  <Field ca$a$a ROBOT_NOT_DOCKED>
			ROBOT_NOT_READY = new a.a("ROBOT_NOT_READY", 2);
		//   12   26:new             #2   <Class ca$a$a>
		//   13   29:dup             
		//   14   30:ldc1            #30  <String "ROBOT_NOT_READY">
		//   15   32:iconst_2        
		//   16   33:invokespecial   #24  <Method void ca$a$a(String, int)>
		//   17   36:putstatic       #32  <Field ca$a$a ROBOT_NOT_READY>
			UPDATE_INTERRUPTED = new a.a("UPDATE_INTERRUPTED", 3);
		//   18   39:new             #2   <Class ca$a$a>
		//   19   42:dup             
		//   20   43:ldc1            #33  <String "UPDATE_INTERRUPTED">
		//   21   45:iconst_3        
		//   22   46:invokespecial   #24  <Method void ca$a$a(String, int)>
		//   23   49:putstatic       #35  <Field ca$a$a UPDATE_INTERRUPTED>
			$VALUES = (new a.a[] {
				ROBOT_NOT_CONNECTED, ROBOT_NOT_DOCKED, ROBOT_NOT_READY, UPDATE_INTERRUPTED
			});
		//   24   52:iconst_4        
		//   25   53:anewarray       a.a[]
		//   26   56:dup             
		//   27   57:iconst_0        
		//   28   58:getstatic       #26  <Field ca$a$a ROBOT_NOT_CONNECTED>
		//   29   61:aastore         
		//   30   62:dup             
		//   31   63:iconst_1        
		//   32   64:getstatic       #29  <Field ca$a$a ROBOT_NOT_DOCKED>
		//   33   67:aastore         
		//   34   68:dup             
		//   35   69:iconst_2        
		//   36   70:getstatic       #32  <Field ca$a$a ROBOT_NOT_READY>
		//   37   73:aastore         
		//   38   74:dup             
		//   39   75:iconst_3        
		//   40   76:getstatic       #35  <Field ca$a$a UPDATE_INTERRUPTED>
		//   41   79:aastore         
		//   42   80:putstatic       #37  <Field ca$a$a[] $VALUES>
		//*  43   83:return          
		}

		private a.a(String s, int i1)
		{
			super(s, i1);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #39  <Method void Enum(String, int)>
		//    4    6:return          
		}
	}

	class b extends BroadcastReceiver
	{

		public void onReceive(Context context, Intent intent)
		{
			if(!a.isAdded())
		//*   0    0:aload_0         
		//*   1    1:getfield        #13  <Field ca a>
		//*   2    4:invokevirtual   #23  <Method boolean ca.isAdded()>
		//*   3    7:ifne            11
				return;
		//    4   10:return          
			if(intent.getAction().equals("android.net.wifi.STATE_CHANGE"))
		//*   5   11:aload_2         
		//*   6   12:invokevirtual   #29  <Method String Intent.getAction()>
		//*   7   15:ldc1            #31  <String "android.net.wifi.STATE_CHANGE">
		//*   8   17:invokevirtual   #37  <Method boolean String.equals(Object)>
		//*   9   20:ifeq            92
			{
				context = ((Context) ((NetworkInfo)intent.getParcelableExtra("networkInfo")));
		//   10   23:aload_2         
		//   11   24:ldc1            #39  <String "networkInfo">
		//   12   26:invokevirtual   #43  <Method Parcelable Intent.getParcelableExtra(String)>
		//   13   29:checkcast       #45  <Class NetworkInfo>
		//   14   32:astore_1        
				intent = ((Intent) (new StringBuilder()));
		//   15   33:new             #47  <Class StringBuilder>
		//   16   36:dup             
		//   17   37:invokespecial   #48  <Method void StringBuilder()>
		//   18   40:astore_2        
				((StringBuilder) (intent)).append("WifiReceiver: ");
		//   19   41:aload_2         
		//   20   42:ldc1            #50  <String "WifiReceiver: ">
		//   21   44:invokevirtual   #54  <Method StringBuilder StringBuilder.append(String)>
		//   22   47:pop             
				((StringBuilder) (intent)).append(((NetworkInfo) (context)).getState().name());
		//   23   48:aload_2         
		//   24   49:aload_1         
		//   25   50:invokevirtual   #58  <Method android.net.NetworkInfo$State NetworkInfo.getState()>
		//   26   53:invokevirtual   #63  <Method String android.net.NetworkInfo$State.name()>
		//   27   56:invokevirtual   #54  <Method StringBuilder StringBuilder.append(String)>
		//   28   59:pop             
				com.irobot.home.util.o.b("UpdatingRobot", ((StringBuilder) (intent)).toString());
		//   29   60:ldc1            #65  <String "UpdatingRobot">
		//   30   62:aload_2         
		//   31   63:invokevirtual   #68  <Method String StringBuilder.toString()>
		//   32   66:invokestatic    #73  <Method void o.b(String, String)>
				static class _cls3
				{

					static final int a[];
					static final int b[];

					static 
					{
						b = new int[a.a.values().length];
					//    0    0:invokestatic    #19  <Method ca$a$a[] ca$a$a.values()>
					//    1    3:arraylength     
					//    2    4:newarray        int[]
					//    3    6:putstatic       #21  <Field int[] b>
						try
						{
							b[a.a.ROBOT_NOT_DOCKED.ordinal()] = 1;
					//    4    9:getstatic       #21  <Field int[] b>
					//    5   12:getstatic       #25  <Field ca$a$a ca$a$a.ROBOT_NOT_DOCKED>
					//    6   15:invokevirtual   #29  <Method int ca$a$a.ordinal()>
					//    7   18:iconst_1        
					//    8   19:iastore         
						}
					//*   9   20:getstatic       #21  <Field int[] b>
					//*  10   23:getstatic       #32  <Field ca$a$a ca$a$a.ROBOT_NOT_READY>
					//*  11   26:invokevirtual   #29  <Method int ca$a$a.ordinal()>
					//*  12   29:iconst_2        
					//*  13   30:iastore         
					//*  14   31:getstatic       #21  <Field int[] b>
					//*  15   34:getstatic       #35  <Field ca$a$a ca$a$a.ROBOT_NOT_CONNECTED>
					//*  16   37:invokevirtual   #29  <Method int ca$a$a.ordinal()>
					//*  17   40:iconst_3        
					//*  18   41:iastore         
					//*  19   42:getstatic       #21  <Field int[] b>
					//*  20   45:getstatic       #38  <Field ca$a$a ca$a$a.UPDATE_INTERRUPTED>
					//*  21   48:invokevirtual   #29  <Method int ca$a$a.ordinal()>
					//*  22   51:iconst_4        
					//*  23   52:iastore         
					//*  24   53:invokestatic    #43  <Method android.net.NetworkInfo$State[] android.net.NetworkInfo$State.values()>
					//*  25   56:arraylength     
					//*  26   57:newarray        int[]
					//*  27   59:putstatic       #45  <Field int[] a>
					//*  28   62:getstatic       #45  <Field int[] a>
					//*  29   65:getstatic       #49  <Field android.net.NetworkInfo$State android.net.NetworkInfo$State.CONNECTED>
					//*  30   68:invokevirtual   #50  <Method int android.net.NetworkInfo$State.ordinal()>
					//*  31   71:iconst_1        
					//*  32   72:iastore         
					//*  33   73:return          
						catch(NoSuchFieldError nosuchfielderror) { }
					//   34   74:astore_0        
						try
						{
							b[a.a.ROBOT_NOT_READY.ordinal()] = 2;
						}
					//*  35   75:goto            20
						catch(NoSuchFieldError nosuchfielderror1) { }
					//   36   78:astore_0        
						try
						{
							b[a.a.ROBOT_NOT_CONNECTED.ordinal()] = 3;
						}
					//*  37   79:goto            31
						catch(NoSuchFieldError nosuchfielderror2) { }
					//   38   82:astore_0        
						try
						{
							b[a.a.UPDATE_INTERRUPTED.ordinal()] = 4;
						}
					//*  39   83:goto            42
						catch(NoSuchFieldError nosuchfielderror3) { }
					//   40   86:astore_0        
						a = new int[android.net.NetworkInfo.State.values().length];
						try
						{
							a[android.net.NetworkInfo.State.CONNECTED.ordinal()] = 1;
						}
					//*  41   87:goto            53
						catch(NoSuchFieldError nosuchfielderror4) { }
					//   42   90:astore_0        
					//*  43   91:return          
					}
				}

				if(com.irobot.home.fragments._cls3.a[((NetworkInfo) (context)).getState().ordinal()] != 1)
		//*  33   69:getstatic       #78  <Field int[] com.irobot.home.fragments.ca$3.a>
		//*  34   72:aload_1         
		//*  35   73:invokevirtual   #58  <Method android.net.NetworkInfo$State NetworkInfo.getState()>
		//*  36   76:invokevirtual   #82  <Method int android.net.NetworkInfo$State.ordinal()>
		//*  37   79:iaload          
		//*  38   80:iconst_1        
		//*  39   81:icmpeq          85
					return;
		//   40   84:return          
				a.c();
		//   41   85:aload_0         
		//   42   86:getfield        #13  <Field ca a>
		//   43   89:invokevirtual   #85  <Method void ca.c()>
			}
		//   44   92:return          
		}

		final ca a;

		b()
		{
			a = ca.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #13  <Field ca a>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #16  <Method void BroadcastReceiver()>
		//    5    9:return          
		}
	}


	public ca()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #52  <Method void g()>
		n = false;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #54  <Field boolean n>
	//    5    9:aload_0         
	//    6   10:new             #56  <Class Handler>
	//    7   13:dup             
	//    8   14:invokespecial   #57  <Method void Handler()>
	//    9   17:putfield        #59  <Field Handler o>
	//   10   20:aload_0         
	//   11   21:new             #10  <Class ca$1>
	//   12   24:dup             
	//   13   25:aload_0         
	//   14   26:invokespecial   #62  <Method void ca$1(ca)>
	//   15   29:putfield        #64  <Field Runnable p>
	//   16   32:return          
	}

	static Handler a(ca ca1)
	{
		return ca1.o;
	//    0    0:aload_0         
	//    1    1:getfield        #59  <Field Handler o>
	//    2    4:areturn         
	}

	private void i()
	{
		if(isAdded() && k != null && !n)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #70  <Method boolean isAdded()>
	//*   2    4:ifeq            42
	//*   3    7:aload_0         
	//*   4    8:getfield        #72  <Field ca$b k>
	//*   5   11:ifnull          42
	//*   6   14:aload_0         
	//*   7   15:getfield        #54  <Field boolean n>
	//*   8   18:ifne            42
			getActivity().registerReceiver(((BroadcastReceiver) (k)), new IntentFilter("android.net.wifi.STATE_CHANGE"));
	//    9   21:aload_0         
	//   10   22:invokevirtual   #76  <Method Activity getActivity()>
	//   11   25:aload_0         
	//   12   26:getfield        #72  <Field ca$b k>
	//   13   29:new             #78  <Class IntentFilter>
	//   14   32:dup             
	//   15   33:ldc1            #80  <String "android.net.wifi.STATE_CHANGE">
	//   16   35:invokespecial   #83  <Method void IntentFilter(String)>
	//   17   38:invokevirtual   #89  <Method Intent Activity.registerReceiver(BroadcastReceiver, IntentFilter)>
	//   18   41:pop             
	//   19   42:return          
	}

	private void j()
	{
		if(isAdded() && k != null)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #70  <Method boolean isAdded()>
	//*   2    4:ifeq            60
	//*   3    7:aload_0         
	//*   4    8:getfield        #72  <Field ca$b k>
	//*   5   11:ifnull          60
			try
			{
				getActivity().unregisterReceiver(((BroadcastReceiver) (k)));
	//    6   14:aload_0         
	//    7   15:invokevirtual   #76  <Method Activity getActivity()>
	//    8   18:aload_0         
	//    9   19:getfield        #72  <Field ca$b k>
	//   10   22:invokevirtual   #95  <Method void Activity.unregisterReceiver(BroadcastReceiver)>
				return;
	//   11   25:return          
			}
			catch(IllegalArgumentException illegalargumentexception)
	//*  12   26:astore_1        
			{
				StringBuilder stringbuilder = new StringBuilder();
	//   13   27:new             #97  <Class StringBuilder>
	//   14   30:dup             
	//   15   31:invokespecial   #98  <Method void StringBuilder()>
	//   16   34:astore_2        
				stringbuilder.append("Failed to unregister receiver: ");
	//   17   35:aload_2         
	//   18   36:ldc1            #100 <String "Failed to unregister receiver: ">
	//   19   38:invokevirtual   #104 <Method StringBuilder StringBuilder.append(String)>
	//   20   41:pop             
				stringbuilder.append(illegalargumentexception.getMessage());
	//   21   42:aload_2         
	//   22   43:aload_1         
	//   23   44:invokevirtual   #108 <Method String IllegalArgumentException.getMessage()>
	//   24   47:invokevirtual   #104 <Method StringBuilder StringBuilder.append(String)>
	//   25   50:pop             
				com.irobot.home.util.o.e("UpdatingRobot", stringbuilder.toString());
	//   26   51:ldc1            #110 <String "UpdatingRobot">
	//   27   53:aload_2         
	//   28   54:invokevirtual   #113 <Method String StringBuilder.toString()>
	//   29   57:invokestatic    #118 <Method void o.e(String, String)>
			}
	//   30   60:return          
	}

	public void A()
	{
	//    0    0:return          
	}

	void a()
	{
		((BaseFragmentActivity)getActivity()).b(0x7f0f094a);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #76  <Method Activity getActivity()>
	//    2    4:checkcast       #121 <Class BaseFragmentActivity>
	//    3    7:ldc1            #122 <Int 0x7f0f094a>
	//    4    9:invokevirtual   #125 <Method void BaseFragmentActivity.b(int)>
		j = a.e(c);
	//    5   12:aload_0         
	//    6   13:aload_0         
	//    7   14:getfield        #127 <Field IRobotApplication a>
	//    8   17:aload_0         
	//    9   18:getfield        #129 <Field String c>
	//   10   21:invokevirtual   #134 <Method i IRobotApplication.e(String)>
	//   11   24:putfield        #136 <Field i j>
		j.a(((com.irobot.home.i.b) (this)));
	//   12   27:aload_0         
	//   13   28:getfield        #136 <Field i j>
	//   14   31:aload_0         
	//   15   32:invokevirtual   #141 <Method void i.a(com.irobot.home.i$b)>
		h.setMax(90);
	//   16   35:aload_0         
	//   17   36:getfield        #143 <Field ProgressBar h>
	//   18   39:bipush          90
	//   19   41:invokevirtual   #148 <Method void ProgressBar.setMax(int)>
		o.postDelayed(p, 1000L);
	//   20   44:aload_0         
	//   21   45:getfield        #59  <Field Handler o>
	//   22   48:aload_0         
	//   23   49:getfield        #64  <Field Runnable p>
	//   24   52:ldc2w           #149 <Long 1000L>
	//   25   55:invokevirtual   #154 <Method boolean Handler.postDelayed(Runnable, long)>
	//   26   58:pop             
		b();
	//   27   59:aload_0         
	//   28   60:invokevirtual   #156 <Method void b()>
	//   29   63:return          
	}

	public void a(Parcelable parcelable)
	{
		if(!isAdded())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #70  <Method boolean isAdded()>
	//*   2    4:ifne            8
		{
			return;
	//    3    7:return          
		} else
		{
			a(getString(0x7f0f0436));
	//    4    8:aload_0         
	//    5    9:aload_0         
	//    6   10:ldc1            #158 <Int 0x7f0f0436>
	//    7   12:invokevirtual   #162 <Method String getString(int)>
	//    8   15:invokevirtual   #164 <Method void a(String)>
			b(900);
	//    9   18:aload_0         
	//   10   19:sipush          900
	//   11   22:invokevirtual   #165 <Method void b(int)>
			return;
	//   12   25:return          
		}
	}

	void a(a.a a1)
	{
		if(!isAdded())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #70  <Method boolean isAdded()>
	//*   2    4:ifne            15
		{
			com.irobot.home.util.o.e("UpdatingRobot", "Not attached to activity. Not showing alert.");
	//    3    7:ldc1            #110 <String "UpdatingRobot">
	//    4    9:ldc1            #168 <String "Not attached to activity. Not showing alert.">
	//    5   11:invokestatic    #118 <Method void o.e(String, String)>
			return;
	//    6   14:return          
		}
		o.removeCallbacks(p);
	//    7   15:aload_0         
	//    8   16:getfield        #59  <Field Handler o>
	//    9   19:aload_0         
	//   10   20:getfield        #64  <Field Runnable p>
	//   11   23:invokevirtual   #172 <Method void Handler.removeCallbacks(Runnable)>
		int i1;
		switch(com.irobot.home.fragments._cls3.b[a1.ordinal()])
	//*  12   26:getstatic       #175 <Field int[] com.irobot.home.fragments.ca$3.b>
	//*  13   29:aload_1         
	//*  14   30:invokevirtual   #179 <Method int ca$a$a.ordinal()>
	//*  15   33:iaload          
		{
	//*  16   34:tableswitch     1 4: default 64
	//	               1 77
	//	               2 71
	//	               3 65
	//	               4 65
		default:
			return;
	//   17   64:return          

		case 3: // '\003'
		case 4: // '\004'
			i1 = 0x7f0f043e;
	//   18   65:ldc1            #180 <Int 0x7f0f043e>
	//   19   67:istore_2        
			break;

	//*  20   68:goto            80
		case 2: // '\002'
			i1 = 0x7f0f0440;
	//   21   71:ldc1            #181 <Int 0x7f0f0440>
	//   22   73:istore_2        
			break;

	//*  23   74:goto            80
		case 1: // '\001'
			i1 = 0x7f0f043f;
	//   24   77:ldc1            #182 <Int 0x7f0f043f>
	//   25   79:istore_2        
			break;
		}
		a(getString(i1), a1);
	//   26   80:aload_0         
	//   27   81:aload_0         
	//   28   82:iload_2         
	//   29   83:invokevirtual   #162 <Method String getString(int)>
	//   30   86:aload_1         
	//   31   87:invokevirtual   #185 <Method void a(String, ca$a$a)>
	//   32   90:return          
	}

	public void a(a a1)
	{
		i = a1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #188 <Field ca$a i>
	//    3    5:return          
	}

	void a(String s)
	{
		g.setText(((CharSequence) (s)));
	//    0    0:aload_0         
	//    1    1:getfield        #190 <Field TextView g>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #196 <Method void TextView.setText(CharSequence)>
	//    4    8:return          
	}

	void a(String s, a.a a1)
	{
		if(!isAdded())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #70  <Method boolean isAdded()>
	//*   2    4:ifne            8
		{
			return;
	//    3    7:return          
		} else
		{
			(new android.app.AlertDialog.Builder(((Context) (getActivity())))).setMessage(((CharSequence) (s))).setPositiveButton(0x7f0f05bb, new android.content.DialogInterface.OnClickListener(a1) {

				public void onClick(DialogInterface dialoginterface, int i1)
				{
					b.i.a(a);
				//    0    0:aload_0         
				//    1    1:getfield        #18  <Field ca b>
				//    2    4:getfield        #30  <Field ca$a com.irobot.home.fragments.ca.i>
				//    3    7:aload_0         
				//    4    8:getfield        #20  <Field ca$a$a a>
				//    5   11:invokeinterface #35  <Method void com.irobot.home.fragments.ca$a.a(ca$a$a)>
				//    6   16:return          
				}

				final a.a a;
				final ca b;

			
			{
				b = ca.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #18  <Field ca b>
				a = a1;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #20  <Field ca$a$a a>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #23  <Method void Object()>
			//    8   14:return          
			}
			}
).show();
	//    4    8:new             #198 <Class android.app.AlertDialog$Builder>
	//    5   11:dup             
	//    6   12:aload_0         
	//    7   13:invokevirtual   #76  <Method Activity getActivity()>
	//    8   16:invokespecial   #201 <Method void android.app.AlertDialog$Builder(Context)>
	//    9   19:aload_1         
	//   10   20:invokevirtual   #205 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setMessage(CharSequence)>
	//   11   23:ldc1            #206 <Int 0x7f0f05bb>
	//   12   25:new             #12  <Class ca$2>
	//   13   28:dup             
	//   14   29:aload_0         
	//   15   30:aload_2         
	//   16   31:invokespecial   #209 <Method void ca$2(ca, ca$a$a)>
	//   17   34:invokevirtual   #213 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setPositiveButton(int, android.content.DialogInterface$OnClickListener)>
	//   18   37:invokevirtual   #217 <Method android.app.AlertDialog android.app.AlertDialog$Builder.show()>
	//   19   40:pop             
			return;
	//   20   41:return          
		}
	}

	void b()
	{
		if(!isAdded())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #70  <Method boolean isAdded()>
	//*   2    4:ifne            8
			return;
	//    3    7:return          
		WifiManager wifimanager = (WifiManager)a.getApplicationContext().getSystemService("wifi");
	//    4    8:aload_0         
	//    5    9:getfield        #127 <Field IRobotApplication a>
	//    6   12:invokevirtual   #223 <Method Context IRobotApplication.getApplicationContext()>
	//    7   15:ldc1            #225 <String "wifi">
	//    8   17:invokevirtual   #231 <Method Object Context.getSystemService(String)>
	//    9   20:checkcast       #233 <Class WifiManager>
	//   10   23:astore          4
		boolean flag = false;
	//   11   25:iconst_0        
	//   12   26:istore_1        
		int i1 = 0;
	//   13   27:iconst_0        
	//   14   28:istore_2        
		do
		{
			int j1;
			Object obj;
			do
			{
				j1 = i1;
	//   15   29:iload_2         
	//   16   30:istore_3        
				if(flag)
	//*  17   31:iload_1         
	//*  18   32:ifeq            65
					if(i1 < 10)
	//*  19   35:iload_2         
	//*  20   36:bipush          10
	//*  21   38:icmpge          48
						j1 = i1 + 1;
	//   22   41:iload_2         
	//   23   42:iconst_1        
	//   24   43:iadd            
	//   25   44:istore_3        
					else
	//*  26   45:goto            65
					if(flag)
	//*  27   48:iload_1         
	//*  28   49:ifeq            57
					{
						d();
	//   29   52:aload_0         
	//   30   53:invokevirtual   #235 <Method void d()>
						return;
	//   31   56:return          
					} else
					{
						a(a.a.ROBOT_NOT_CONNECTED);
	//   32   57:aload_0         
	//   33   58:getstatic       #239 <Field ca$a$a ca$a$a.ROBOT_NOT_CONNECTED>
	//   34   61:invokevirtual   #241 <Method void a(ca$a$a)>
						return;
	//   35   64:return          
					}
				obj = ((Object) (wifimanager.getDhcpInfo()));
	//   36   65:aload           4
	//   37   67:invokevirtual   #245 <Method DhcpInfo WifiManager.getDhcpInfo()>
	//   38   70:astore          5
				i1 = j1;
	//   39   72:iload_3         
	//   40   73:istore_2        
			} while(obj == null);
	//   41   74:aload           5
	//   42   76:ifnull          29
			if(((DhcpInfo) (obj)).gateway == 0)
	//*  43   79:aload           5
	//*  44   81:getfield        #251 <Field int DhcpInfo.gateway>
	//*  45   84:ifne            144
			{
				try
				{
					Thread.sleep(3000L);
	//   46   87:ldc2w           #252 <Long 3000L>
	//   47   90:invokestatic    #259 <Method void Thread.sleep(long)>
				}
	//*  48   93:iload_3         
	//*  49   94:istore_2        
	//*  50   95:goto            29
				// Misplaced declaration of an exception variable
				catch(Object obj)
	//*  51   98:astore          5
				{
					StringBuilder stringbuilder = new StringBuilder();
	//   52  100:new             #97  <Class StringBuilder>
	//   53  103:dup             
	//   54  104:invokespecial   #98  <Method void StringBuilder()>
	//   55  107:astore          6
					stringbuilder.append("Sleep interrupted in checkRobotConnection: ");
	//   56  109:aload           6
	//   57  111:ldc2            #261 <String "Sleep interrupted in checkRobotConnection: ">
	//   58  114:invokevirtual   #104 <Method StringBuilder StringBuilder.append(String)>
	//   59  117:pop             
					stringbuilder.append(((InterruptedException) (obj)).getMessage());
	//   60  118:aload           6
	//   61  120:aload           5
	//   62  122:invokevirtual   #262 <Method String InterruptedException.getMessage()>
	//   63  125:invokevirtual   #104 <Method StringBuilder StringBuilder.append(String)>
	//   64  128:pop             
					com.irobot.home.util.o.e("UpdatingRobot", stringbuilder.toString());
	//   65  129:ldc1            #110 <String "UpdatingRobot">
	//   66  131:aload           6
	//   67  133:invokevirtual   #113 <Method String StringBuilder.toString()>
	//   68  136:invokestatic    #118 <Method void o.e(String, String)>
					i1 = j1;
	//   69  139:iload_3         
	//   70  140:istore_2        
					continue;
	//   71  141:goto            29
				}
				i1 = j1;
				continue;
			}
			if(b.a())
	//*  72  144:aload_0         
	//*  73  145:getfield        #264 <Field WifiConfig b>
	//*  74  148:invokevirtual   #268 <Method boolean WifiConfig.a()>
	//*  75  151:ifeq            214
			{
				b.b(((DhcpInfo) (obj)).ipAddress);
	//   76  154:aload_0         
	//   77  155:getfield        #264 <Field WifiConfig b>
	//   78  158:aload           5
	//   79  160:getfield        #271 <Field int DhcpInfo.ipAddress>
	//   80  163:invokevirtual   #272 <Method void WifiConfig.b(int)>
				b.c(((DhcpInfo) (obj)).netmask);
	//   81  166:aload_0         
	//   82  167:getfield        #264 <Field WifiConfig b>
	//   83  170:aload           5
	//   84  172:getfield        #275 <Field int DhcpInfo.netmask>
	//   85  175:invokevirtual   #277 <Method void WifiConfig.c(int)>
				b.d(((DhcpInfo) (obj)).gateway);
	//   86  178:aload_0         
	//   87  179:getfield        #264 <Field WifiConfig b>
	//   88  182:aload           5
	//   89  184:getfield        #251 <Field int DhcpInfo.gateway>
	//   90  187:invokevirtual   #279 <Method void WifiConfig.d(int)>
				b.e(((DhcpInfo) (obj)).dns1);
	//   91  190:aload_0         
	//   92  191:getfield        #264 <Field WifiConfig b>
	//   93  194:aload           5
	//   94  196:getfield        #282 <Field int DhcpInfo.dns1>
	//   95  199:invokevirtual   #284 <Method void WifiConfig.e(int)>
				b.f(((DhcpInfo) (obj)).dns2);
	//   96  202:aload_0         
	//   97  203:getfield        #264 <Field WifiConfig b>
	//   98  206:aload           5
	//   99  208:getfield        #287 <Field int DhcpInfo.dns2>
	//  100  211:invokevirtual   #289 <Method void WifiConfig.f(int)>
			}
			flag = true;
	//  101  214:iconst_1        
	//  102  215:istore_1        
			i1 = j1;
	//  103  216:iload_3         
	//  104  217:istore_2        
		} while(true);
	//  105  218:goto            29
	}

	void b(int i1)
	{
		h.setProgress(0);
	//    0    0:aload_0         
	//    1    1:getfield        #143 <Field ProgressBar h>
	//    2    4:iconst_0        
	//    3    5:invokevirtual   #292 <Method void ProgressBar.setProgress(int)>
		h.setMax(i1);
	//    4    8:aload_0         
	//    5    9:getfield        #143 <Field ProgressBar h>
	//    6   12:iload_1         
	//    7   13:invokevirtual   #148 <Method void ProgressBar.setMax(int)>
	//    8   16:return          
	}

	public void b(Parcelable parcelable)
	{
		a(a.a.UPDATE_INTERRUPTED);
	//    0    0:aload_0         
	//    1    1:getstatic       #295 <Field ca$a$a ca$a$a.UPDATE_INTERRUPTED>
	//    2    4:invokevirtual   #241 <Method void a(ca$a$a)>
	//    3    7:return          
	}

	public void c()
	{
		if(!isAdded())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #70  <Method boolean isAdded()>
	//*   2    4:ifne            8
			return;
	//    3    7:return          
		WifiInfo wifiinfo = ((WifiManager)a.getApplicationContext().getSystemService("wifi")).getConnectionInfo();
	//    4    8:aload_0         
	//    5    9:getfield        #127 <Field IRobotApplication a>
	//    6   12:invokevirtual   #223 <Method Context IRobotApplication.getApplicationContext()>
	//    7   15:ldc1            #225 <String "wifi">
	//    8   17:invokevirtual   #231 <Method Object Context.getSystemService(String)>
	//    9   20:checkcast       #233 <Class WifiManager>
	//   10   23:invokevirtual   #299 <Method WifiInfo WifiManager.getConnectionInfo()>
	//   11   26:astore_1        
		if(wifiinfo != null)
	//*  12   27:aload_1         
	//*  13   28:ifnull          105
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   14   31:new             #97  <Class StringBuilder>
	//   15   34:dup             
	//   16   35:invokespecial   #98  <Method void StringBuilder()>
	//   17   38:astore_2        
			stringbuilder.append("Connected to ");
	//   18   39:aload_2         
	//   19   40:ldc2            #301 <String "Connected to ">
	//   20   43:invokevirtual   #104 <Method StringBuilder StringBuilder.append(String)>
	//   21   46:pop             
			stringbuilder.append(wifiinfo.getSSID());
	//   22   47:aload_2         
	//   23   48:aload_1         
	//   24   49:invokevirtual   #306 <Method String WifiInfo.getSSID()>
	//   25   52:invokevirtual   #104 <Method StringBuilder StringBuilder.append(String)>
	//   26   55:pop             
			com.irobot.home.util.o.b("UpdatingRobot", stringbuilder.toString());
	//   27   56:ldc1            #110 <String "UpdatingRobot">
	//   28   58:aload_2         
	//   29   59:invokevirtual   #113 <Method String StringBuilder.toString()>
	//   30   62:invokestatic    #308 <Method void o.b(String, String)>
			n = com.irobot.home.util.j.e(wifiinfo.getSSID()).equals(((Object) (com.irobot.home.util.j.e(f.getSSID()))));
	//   31   65:aload_0         
	//   32   66:aload_1         
	//   33   67:invokevirtual   #306 <Method String WifiInfo.getSSID()>
	//   34   70:invokestatic    #313 <Method String j.e(String)>
	//   35   73:aload_0         
	//   36   74:getfield        #315 <Field WifiInfo f>
	//   37   77:invokevirtual   #306 <Method String WifiInfo.getSSID()>
	//   38   80:invokestatic    #313 <Method String j.e(String)>
	//   39   83:invokevirtual   #321 <Method boolean String.equals(Object)>
	//   40   86:putfield        #54  <Field boolean n>
			if(n)
	//*  41   89:aload_0         
	//*  42   90:getfield        #54  <Field boolean n>
	//*  43   93:ifeq            105
			{
				j();
	//   44   96:aload_0         
	//   45   97:invokespecial   #323 <Method void j()>
				k = null;
	//   46  100:aload_0         
	//   47  101:aconst_null     
	//   48  102:putfield        #72  <Field ca$b k>
			}
		}
	//   49  105:return          
	}

	public void c(Parcelable parcelable)
	{
		if(!isAdded())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #70  <Method boolean isAdded()>
	//*   2    4:ifne            8
		{
			return;
	//    3    7:return          
		} else
		{
			e();
	//    4    8:aload_0         
	//    5    9:invokevirtual   #325 <Method void e()>
			return;
	//    6   12:return          
		}
	}

	void d()
	{
		Object obj;
		Robot robot;
		obj = ((Object) (com.irobot.home.o.a.a(c)));
	//    0    0:aload_0         
	//    1    1:getfield        #129 <Field String c>
	//    2    4:invokestatic    #338 <Method a a.a(String)>
	//    3    7:astore_1        
		if(obj == null)
	//*   4    8:aload_1         
	//*   5    9:ifnonnull       47
		{
			obj = ((Object) (new StringBuilder()));
	//    6   12:new             #97  <Class StringBuilder>
	//    7   15:dup             
	//    8   16:invokespecial   #98  <Method void StringBuilder()>
	//    9   19:astore_1        
			((StringBuilder) (obj)).append("Null robot client encountered in background task ");
	//   10   20:aload_1         
	//   11   21:ldc2            #340 <String "Null robot client encountered in background task ">
	//   12   24:invokevirtual   #104 <Method StringBuilder StringBuilder.append(String)>
	//   13   27:pop             
			((StringBuilder) (obj)).append(c);
	//   14   28:aload_1         
	//   15   29:aload_0         
	//   16   30:getfield        #129 <Field String c>
	//   17   33:invokevirtual   #104 <Method StringBuilder StringBuilder.append(String)>
	//   18   36:pop             
			com.irobot.home.util.o.e("UpdatingRobot", ((StringBuilder) (obj)).toString());
	//   19   37:ldc1            #110 <String "UpdatingRobot">
	//   20   39:aload_1         
	//   21   40:invokevirtual   #113 <Method String StringBuilder.toString()>
	//   22   43:invokestatic    #118 <Method void o.e(String, String)>
			return;
	//   23   46:return          
		}
		robot = com.irobot.home.util.j.o(c);
	//   24   47:aload_0         
	//   25   48:getfield        #129 <Field String c>
	//   26   51:invokestatic    #343 <Method Robot j.o(String)>
	//   27   54:astore_2        
		robot.d().a(NetworkAddress.httpsNetworkAddressForDefaultGateway());
	//   28   55:aload_2         
	//   29   56:invokevirtual   #348 <Method NetworkSettings Robot.d()>
	//   30   59:invokestatic    #354 <Method NetworkAddress NetworkAddress.httpsNetworkAddressForDefaultGateway()>
	//   31   62:invokevirtual   #359 <Method void NetworkSettings.a(NetworkAddress)>
		((com.irobot.home.o.a) (obj)).a(true);
	//   32   65:aload_1         
	//   33   66:iconst_1        
	//   34   67:invokevirtual   #362 <Method void a.a(boolean)>
		if(!d && !com.irobot.home.util.j.i(robot.q()))
	//*  35   70:aload_0         
	//*  36   71:getfield        #364 <Field boolean d>
	//*  37   74:ifne            91
	//*  38   77:aload_2         
	//*  39   78:invokevirtual   #367 <Method String Robot.q()>
	//*  40   81:invokestatic    #370 <Method boolean j.i(String)>
	//*  41   84:ifne            91
			((com.irobot.home.o.a) (obj)).e();
	//   42   87:aload_1         
	//   43   88:invokevirtual   #371 <Method void a.e()>
		robot.a(((com.irobot.home.o.a) (obj)).a());
	//   44   91:aload_2         
	//   45   92:aload_1         
	//   46   93:invokevirtual   #374 <Method com.irobot.home.model.MissionStatus a.a()>
	//   47   96:invokevirtual   #377 <Method void Robot.a(com.irobot.home.model.MissionStatus)>
		((com.irobot.home.o.a) (obj)).a(false);
	//   48   99:aload_1         
	//   49  100:iconst_0        
	//   50  101:invokevirtual   #362 <Method void a.a(boolean)>
		if(robot.e() && !robot.g())
	//*  51  104:aload_2         
	//*  52  105:invokevirtual   #379 <Method boolean Robot.e()>
	//*  53  108:ifeq            127
	//*  54  111:aload_2         
	//*  55  112:invokevirtual   #381 <Method boolean Robot.g()>
	//*  56  115:ifne            127
		{
			j.a(0);
	//   57  118:aload_0         
	//   58  119:getfield        #136 <Field i j>
	//   59  122:iconst_0        
	//   60  123:invokevirtual   #383 <Method void i.a(int)>
			return;
	//   61  126:return          
		}
		try
		{
			a(a.a.ROBOT_NOT_DOCKED);
	//   62  127:aload_0         
	//   63  128:getstatic       #386 <Field ca$a$a ca$a$a.ROBOT_NOT_DOCKED>
	//   64  131:invokevirtual   #241 <Method void a(ca$a$a)>
			return;
	//   65  134:return          
		}
		catch(Object obj1)
	//*  66  135:astore_1        
		{
			com.irobot.home.util.o.e("UpdatingRobot", ((Exception) (obj1)).getMessage());
	//   67  136:ldc1            #110 <String "UpdatingRobot">
	//   68  138:aload_1         
	//   69  139:invokevirtual   #389 <Method String Exception.getMessage()>
	//   70  142:invokestatic    #118 <Method void o.e(String, String)>
		}
		a(a.a.ROBOT_NOT_READY);
	//   71  145:aload_0         
	//   72  146:getstatic       #392 <Field ca$a$a ca$a$a.ROBOT_NOT_READY>
	//   73  149:invokevirtual   #241 <Method void a(ca$a$a)>
		return;
	//   74  152:return          
	}

	public void d(Parcelable parcelable)
	{
		a(a.a.UPDATE_INTERRUPTED);
	//    0    0:aload_0         
	//    1    1:getstatic       #295 <Field ca$a$a ca$a$a.UPDATE_INTERRUPTED>
	//    2    4:invokevirtual   #241 <Method void a(ca$a$a)>
	//    3    7:return          
	}

	void e()
	{
		if(d)
	//*   0    0:aload_0         
	//*   1    1:getfield        #364 <Field boolean d>
	//*   2    4:ifeq            36
		{
			a(getString(0x7f0f0437));
	//    3    7:aload_0         
	//    4    8:aload_0         
	//    5    9:ldc2            #393 <Int 0x7f0f0437>
	//    6   12:invokevirtual   #162 <Method String getString(int)>
	//    7   15:invokevirtual   #164 <Method void a(String)>
			b(300);
	//    8   18:aload_0         
	//    9   19:sipush          300
	//   10   22:invokevirtual   #165 <Method void b(int)>
			f();
	//   11   25:aload_0         
	//   12   26:invokevirtual   #395 <Method void f()>
			g();
	//   13   29:aload_0         
	//   14   30:invokevirtual   #397 <Method void g()>
		} else
	//*  15   33:goto            66
		{
			o.removeCallbacks(p);
	//   16   36:aload_0         
	//   17   37:getfield        #59  <Field Handler o>
	//   18   40:aload_0         
	//   19   41:getfield        #64  <Field Runnable p>
	//   20   44:invokevirtual   #172 <Method void Handler.removeCallbacks(Runnable)>
			h.setVisibility(8);
	//   21   47:aload_0         
	//   22   48:getfield        #143 <Field ProgressBar h>
	//   23   51:bipush          8
	//   24   53:invokevirtual   #400 <Method void ProgressBar.setVisibility(int)>
			g.setText(0x7f0f0438);
	//   25   56:aload_0         
	//   26   57:getfield        #190 <Field TextView g>
	//   27   60:ldc2            #401 <Int 0x7f0f0438>
	//   28   63:invokevirtual   #403 <Method void TextView.setText(int)>
		}
		i.a();
	//   29   66:aload_0         
	//   30   67:getfield        #188 <Field ca$a i>
	//   31   70:invokeinterface #405 <Method void com.irobot.home.fragments.ca$a.a()>
	//   32   75:return          
	}

	public void f()
	{
		if(isAdded())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #70  <Method boolean isAdded()>
	//*   2    4:ifeq            67
		{
			WifiManager wifimanager = (WifiManager)a.getApplicationContext().getSystemService("wifi");
	//    3    7:aload_0         
	//    4    8:getfield        #127 <Field IRobotApplication a>
	//    5   11:invokevirtual   #223 <Method Context IRobotApplication.getApplicationContext()>
	//    6   14:ldc1            #225 <String "wifi">
	//    7   16:invokevirtual   #231 <Method Object Context.getSystemService(String)>
	//    8   19:checkcast       #233 <Class WifiManager>
	//    9   22:astore_1        
			if(com.irobot.home.util.j.j(wifimanager.getConnectionInfo().getSSID()) && wifimanager.disconnect())
	//*  10   23:aload_1         
	//*  11   24:invokevirtual   #299 <Method WifiInfo WifiManager.getConnectionInfo()>
	//*  12   27:invokevirtual   #306 <Method String WifiInfo.getSSID()>
	//*  13   30:invokestatic    #407 <Method boolean j.j(String)>
	//*  14   33:ifeq            67
	//*  15   36:aload_1         
	//*  16   37:invokevirtual   #410 <Method boolean WifiManager.disconnect()>
	//*  17   40:ifeq            67
			{
				k = new b();
	//   18   43:aload_0         
	//   19   44:new             #21  <Class ca$b>
	//   20   47:dup             
	//   21   48:aload_0         
	//   22   49:invokespecial   #411 <Method void ca$b(ca)>
	//   23   52:putfield        #72  <Field ca$b k>
				i();
	//   24   55:aload_0         
	//   25   56:invokespecial   #413 <Method void i()>
				com.irobot.home.util.j.a(wifimanager, f);
	//   26   59:aload_1         
	//   27   60:aload_0         
	//   28   61:getfield        #315 <Field WifiInfo f>
	//   29   64:invokestatic    #416 <Method void j.a(WifiManager, WifiInfo)>
			}
		}
	//   30   67:return          
	}

	public void g()
	{
		if(!d)
	//*   0    0:aload_0         
	//*   1    1:getfield        #364 <Field boolean d>
	//*   2    4:ifne            8
			return;
	//    3    7:return          
		try
		{
			Thread.sleep(30000L);
	//    4    8:ldc2w           #417 <Long 30000L>
	//    5   11:invokestatic    #259 <Method void Thread.sleep(long)>
		}
	//*   6   14:goto            27
		catch(InterruptedException interruptedexception)
	//*   7   17:astore_1        
		{
			com.irobot.home.util.o.e("UpdatingRobot", interruptedexception.getMessage());
	//    8   18:ldc1            #110 <String "UpdatingRobot">
	//    9   20:aload_1         
	//   10   21:invokevirtual   #262 <Method String InterruptedException.getMessage()>
	//   11   24:invokestatic    #118 <Method void o.e(String, String)>
		}
		if(n)
	//*  12   27:aload_0         
	//*  13   28:getfield        #54  <Field boolean n>
	//*  14   31:ifeq            60
		{
			l = new com.irobot.home.h.i(((com.irobot.home.h.i.a) (this)), c, 0x41eb0);
	//   15   34:aload_0         
	//   16   35:new             #420 <Class com.irobot.home.h.i>
	//   17   38:dup             
	//   18   39:aload_0         
	//   19   40:aload_0         
	//   20   41:getfield        #129 <Field String c>
	//   21   44:ldc2            #421 <Int 0x41eb0>
	//   22   47:invokespecial   #424 <Method void com.irobot.home.h.i(com.irobot.home.h.i$a, String, int)>
	//   23   50:putfield        #426 <Field com.irobot.home.h.i l>
			l.b();
	//   24   53:aload_0         
	//   25   54:getfield        #426 <Field com.irobot.home.h.i l>
	//   26   57:invokevirtual   #427 <Method void com.irobot.home.h.i.b()>
		}
		h();
	//   27   60:aload_0         
	//   28   61:invokevirtual   #429 <Method void h()>
		i.b();
	//   29   64:aload_0         
	//   30   65:getfield        #188 <Field ca$a i>
	//   31   68:invokeinterface #430 <Method void com.irobot.home.fragments.ca$a.b()>
	//   32   73:return          
	}

	void h()
	{
		com.irobot.home.util.j.a(((Context) (getActivity())), 0x7f0f03f1, getString(0x7f0f0435));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #76  <Method Activity getActivity()>
	//    2    4:ldc2            #431 <Int 0x7f0f03f1>
	//    3    7:aload_0         
	//    4    8:ldc2            #432 <Int 0x7f0f0435>
	//    5   11:invokevirtual   #162 <Method String getString(int)>
	//    6   14:invokestatic    #435 <Method void j.a(Context, int, String)>
	//    7   17:return          
	}

	public void onDestroy()
	{
		org.androidannotations.api.a.a("waitForInstall", true);
	//    0    0:ldc2            #438 <String "waitForInstall">
	//    1    3:iconst_1        
	//    2    4:invokestatic    #443 <Method void org.androidannotations.api.a.a(String, boolean)>
		o.removeCallbacks(p);
	//    3    7:aload_0         
	//    4    8:getfield        #59  <Field Handler o>
	//    5   11:aload_0         
	//    6   12:getfield        #64  <Field Runnable p>
	//    7   15:invokevirtual   #172 <Method void Handler.removeCallbacks(Runnable)>
		super.onDestroy();
	//    8   18:aload_0         
	//    9   19:invokespecial   #445 <Method void g.onDestroy()>
	//   10   22:return          
	}

	public void onPause()
	{
		j();
	//    0    0:aload_0         
	//    1    1:invokespecial   #323 <Method void j()>
		super.onPause();
	//    2    4:aload_0         
	//    3    5:invokespecial   #448 <Method void g.onPause()>
	//    4    8:return          
	}

	public void onResume()
	{
		i();
	//    0    0:aload_0         
	//    1    1:invokespecial   #413 <Method void i()>
		super.onResume();
	//    2    4:aload_0         
	//    3    5:invokespecial   #451 <Method void g.onResume()>
	//    4    8:return          
	}

	public void z()
	{
		a.h().d(com.irobot.home.util.j.a(c));
	//    0    0:aload_0         
	//    1    1:getfield        #127 <Field IRobotApplication a>
	//    2    4:invokevirtual   #455 <Method IRobotModel IRobotApplication.h()>
	//    3    7:aload_0         
	//    4    8:getfield        #129 <Field String c>
	//    5   11:invokestatic    #458 <Method com.irobot.home.model.a j.a(String)>
	//    6   14:invokevirtual   #463 <Method void IRobotModel.d(com.irobot.home.model.a)>
	//    7   17:return          
	}

	IRobotApplication a;
	WifiConfig b;
	String c;
	boolean d;
	String e;
	WifiInfo f;
	TextView g;
	ProgressBar h;
	a i;
	private i j;
	private b k;
	private com.irobot.home.h.i l;
	private boolean n;
	private final Handler o = new Handler();
	private final Runnable p = new Runnable() {

		public void run()
		{
			int i1 = a.h.getProgress();
		//    0    0:aload_0         
		//    1    1:getfield        #14  <Field ca a>
		//    2    4:getfield        #23  <Field ProgressBar ca.h>
		//    3    7:invokevirtual   #29  <Method int ProgressBar.getProgress()>
		//    4   10:istore_1        
			if(i1 < a.h.getMax())
		//*   5   11:iload_1         
		//*   6   12:aload_0         
		//*   7   13:getfield        #14  <Field ca a>
		//*   8   16:getfield        #23  <Field ProgressBar ca.h>
		//*   9   19:invokevirtual   #32  <Method int ProgressBar.getMax()>
		//*  10   22:icmpge          54
			{
				a.h.setProgress(i1 + 1);
		//   11   25:aload_0         
		//   12   26:getfield        #14  <Field ca a>
		//   13   29:getfield        #23  <Field ProgressBar ca.h>
		//   14   32:iload_1         
		//   15   33:iconst_1        
		//   16   34:iadd            
		//   17   35:invokevirtual   #36  <Method void ProgressBar.setProgress(int)>
				com.irobot.home.fragments.ca.a(a).postDelayed(((Runnable) (this)), 1000L);
		//   18   38:aload_0         
		//   19   39:getfield        #14  <Field ca a>
		//   20   42:invokestatic    #39  <Method Handler com.irobot.home.fragments.ca.a(ca)>
		//   21   45:aload_0         
		//   22   46:ldc2w           #40  <Long 1000L>
		//   23   49:invokevirtual   #47  <Method boolean Handler.postDelayed(Runnable, long)>
		//   24   52:pop             
				return;
		//   25   53:return          
			} else
			{
				a.a(a.a.UPDATE_INTERRUPTED);
		//   26   54:aload_0         
		//   27   55:getfield        #14  <Field ca a>
		//   28   58:getstatic       #53  <Field ca$a$a ca$a$a.UPDATE_INTERRUPTED>
		//   29   61:invokevirtual   #56  <Method void com.irobot.home.fragments.ca.a(ca$a$a)>
				return;
		//   30   64:return          
			}
		}

		final ca a;

			
			{
				a = ca.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #14  <Field ca a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #17  <Method void Object()>
			//    5    9:return          
			}
	}
;
}

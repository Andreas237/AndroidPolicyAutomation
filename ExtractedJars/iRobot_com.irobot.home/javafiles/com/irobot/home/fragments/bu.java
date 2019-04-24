// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.fragments;

import android.accounts.NetworkErrorException;
import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.DhcpInfo;
import android.net.NetworkInfo;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.CountDownTimer;
import android.text.TextUtils;
import android.text.format.Formatter;
import com.irobot.core.AssetId;
import com.irobot.core.AssetInfo;
import com.irobot.core.NetworkAddress;
import com.irobot.home.BroadcastSetupActivity;
import com.irobot.home.IRobotApplication;
import com.irobot.home.j.b;
import com.irobot.home.model.CloudConfig;
import com.irobot.home.model.IRobotModel;
import com.irobot.home.model.NetworkSettings;
import com.irobot.home.model.Robot;
import com.irobot.home.model.RobotSystem;
import com.irobot.home.model.WifiConfig;
import com.irobot.home.model.ac;
import com.irobot.home.model.i;
import com.irobot.home.o.a;
import com.irobot.home.util.j;
import com.irobot.home.util.o;
import com.irobot.home.view.CustomVideoView;
import java.util.Locale;
import javax.net.ssl.SSLException;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.irobot.home.fragments:
//			g

public class bu extends g
	implements com.irobot.home.h.i.a
{
	class a extends CountDownTimer
	{

		public void onFinish()
		{
			if(!a.isAdded())
		//*   0    0:aload_0         
		//*   1    1:getfield        #12  <Field bu a>
		//*   2    4:invokevirtual   #22  <Method boolean bu.isAdded()>
		//*   3    7:ifne            11
			{
				return;
		//    4   10:return          
			} else
			{
				a.k.a(true);
		//    5   11:aload_0         
		//    6   12:getfield        #12  <Field bu a>
		//    7   15:getfield        #26  <Field bu$b bu.k>
		//    8   18:iconst_1        
		//    9   19:invokeinterface #31  <Method void com.irobot.home.fragments.bu$b.a(boolean)>
				return;
		//   10   24:return          
			}
		}

		public void onTick(long l1)
		{
		//    0    0:return          
		}

		final bu a;

		public a(long l1, long l2)
		{
			a = bu.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #12  <Field bu a>
			super(l1, l2);
		//    3    5:aload_0         
		//    4    6:lload_2         
		//    5    7:lload           4
		//    6    9:invokespecial   #15  <Method void CountDownTimer(long, long)>
		//    7   12:return          
		}
	}

	public static interface b
	{

		public abstract void a();

		public abstract void a(int i1);

		public abstract void a(String s);

		public abstract void a(boolean flag);

		public abstract void b();

		public abstract void b(String s);
	}

	class c extends BroadcastReceiver
	{

		public void onReceive(Context context, Intent intent)
		{
			if(!a.isAdded())
		//*   0    0:aload_0         
		//*   1    1:getfield        #13  <Field bu a>
		//*   2    4:invokevirtual   #23  <Method boolean bu.isAdded()>
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
		//   12   26:invokevirtual   #43  <Method android.os.Parcelable Intent.getParcelableExtra(String)>
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
				com.irobot.home.util.o.b("SetupNetworkFragment", ((StringBuilder) (intent)).toString());
		//   29   60:ldc1            #65  <String "SetupNetworkFragment">
		//   30   62:aload_2         
		//   31   63:invokevirtual   #68  <Method String StringBuilder.toString()>
		//   32   66:invokestatic    #74  <Method void o.b(String, String)>
				static class _cls2
				{

					static final int a[];

					static 
					{
						a = new int[android.net.NetworkInfo.State.values().length];
					//    0    0:invokestatic    #18  <Method android.net.NetworkInfo$State[] android.net.NetworkInfo$State.values()>
					//    1    3:arraylength     
					//    2    4:newarray        int[]
					//    3    6:putstatic       #20  <Field int[] a>
						try
						{
							a[android.net.NetworkInfo.State.CONNECTED.ordinal()] = 1;
					//    4    9:getstatic       #20  <Field int[] a>
					//    5   12:getstatic       #24  <Field android.net.NetworkInfo$State android.net.NetworkInfo$State.CONNECTED>
					//    6   15:invokevirtual   #28  <Method int android.net.NetworkInfo$State.ordinal()>
					//    7   18:iconst_1        
					//    8   19:iastore         
					//    9   20:return          
						}
						catch(NoSuchFieldError nosuchfielderror) { }
					//   10   21:astore_0        
					//*  11   22:return          
					}
				}

				if(com.irobot.home.fragments._cls2.a[((NetworkInfo) (context)).getState().ordinal()] != 1)
		//*  33   69:getstatic       #79  <Field int[] com.irobot.home.fragments.bu$2.a>
		//*  34   72:aload_1         
		//*  35   73:invokevirtual   #58  <Method android.net.NetworkInfo$State NetworkInfo.getState()>
		//*  36   76:invokevirtual   #83  <Method int android.net.NetworkInfo$State.ordinal()>
		//*  37   79:iaload          
		//*  38   80:iconst_1        
		//*  39   81:icmpeq          85
					return;
		//   40   84:return          
				a.h();
		//   41   85:aload_0         
		//   42   86:getfield        #13  <Field bu a>
		//   43   89:invokevirtual   #86  <Method void bu.h()>
			}
		//   44   92:return          
		}

		final bu a;

		c()
		{
			a = bu.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #13  <Field bu a>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #16  <Method void BroadcastReceiver()>
		//    5    9:return          
		}
	}


	public bu()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #47  <Method void g()>
		n = false;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #49  <Field boolean n>
		o = false;
	//    5    9:aload_0         
	//    6   10:iconst_0        
	//    7   11:putfield        #51  <Field boolean o>
		r = false;
	//    8   14:aload_0         
	//    9   15:iconst_0        
	//   10   16:putfield        #53  <Field boolean r>
		k = new b() {

			public void a()
			{
			//    0    0:return          
			}

			public void a(int i1)
			{
			//    0    0:return          
			}

			public void a(String s)
			{
			//    0    0:return          
			}

			public void a(boolean flag)
			{
			//    0    0:return          
			}

			public void b()
			{
			//    0    0:return          
			}

			public void b(String s)
			{
			//    0    0:return          
			}

			final bu a;

			
			{
				a = bu.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #14  <Field bu a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #17  <Method void Object()>
			//    5    9:return          
			}
		}
;
	//   11   19:aload_0         
	//   12   20:new             #8   <Class bu$1>
	//   13   23:dup             
	//   14   24:aload_0         
	//   15   25:invokespecial   #56  <Method void bu$1(bu)>
	//   16   28:putfield        #58  <Field bu$b k>
	//   17   31:return          
	}

	private JSONObject a(com.irobot.home.o.a a1)
	{
		com.irobot.home.util.o.c("*** PROVISIONING ***", "UMI: get_wlstat");
	//    0    0:ldc1            #62  <String "*** PROVISIONING ***">
	//    1    2:ldc1            #64  <String "UMI: get_wlstat">
	//    2    4:invokestatic    #69  <Method void o.c(String, String)>
		a1 = ((com.irobot.home.o.a) (a1.b("wlstat")));
	//    3    7:aload_1         
	//    4    8:ldc1            #71  <String "wlstat">
	//    5   10:invokevirtual   #76  <Method JSONObject a.b(String)>
	//    6   13:astore_1        
		if(((JSONObject) (a1)).has("ok"))
	//*   7   14:aload_1         
	//*   8   15:ldc1            #78  <String "ok">
	//*   9   17:invokevirtual   #84  <Method boolean JSONObject.has(String)>
	//*  10   20:ifeq            30
			return ((JSONObject) (a1)).getJSONObject("ok");
	//   11   23:aload_1         
	//   12   24:ldc1            #78  <String "ok">
	//   13   26:invokevirtual   #87  <Method JSONObject JSONObject.getJSONObject(String)>
	//   14   29:areturn         
		else
			return null;
	//   15   30:aconst_null     
	//   16   31:areturn         
	}

	private void a(Exception exception)
	{
		exception.printStackTrace();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #93  <Method void Exception.printStackTrace()>
		d(15);
	//    2    4:aload_0         
	//    3    5:bipush          15
	//    4    7:invokevirtual   #96  <Method void d(int)>
	//    5   10:return          
	}

	private boolean a(long l1)
	{
		if((float)(System.currentTimeMillis() - l1) / 1000F > 120F)
	//*   0    0:invokestatic    #103 <Method long System.currentTimeMillis()>
	//*   1    3:lload_1         
	//*   2    4:lsub            
	//*   3    5:l2f             
	//*   4    6:ldc1            #104 <Float 1000F>
	//*   5    8:fdiv            
	//*   6    9:ldc1            #105 <Float 120F>
	//*   7   11:fcmpl           
	//*   8   12:ifle            24
		{
			com.irobot.home.util.o.e("SetupNetworkFragment", "WLSTAT Query timed out.");
	//    9   15:ldc1            #107 <String "SetupNetworkFragment">
	//   10   17:ldc1            #109 <String "WLSTAT Query timed out.">
	//   11   19:invokestatic    #111 <Method void o.e(String, String)>
			return true;
	//   12   22:iconst_1        
	//   13   23:ireturn         
		} else
		{
			Thread.sleep(1500L);
	//   14   24:ldc2w           #112 <Long 1500L>
	//   15   27:invokestatic    #119 <Method void Thread.sleep(long)>
			return false;
	//   16   30:iconst_0        
	//   17   31:ireturn         
		}
	}

	private void i()
	{
		if(isAdded() && l != null && f && !n)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #123 <Method boolean isAdded()>
	//*   2    4:ifeq            49
	//*   3    7:aload_0         
	//*   4    8:getfield        #125 <Field bu$c l>
	//*   5   11:ifnull          49
	//*   6   14:aload_0         
	//*   7   15:getfield        #127 <Field boolean f>
	//*   8   18:ifeq            49
	//*   9   21:aload_0         
	//*  10   22:getfield        #49  <Field boolean n>
	//*  11   25:ifne            49
			getActivity().registerReceiver(((BroadcastReceiver) (l)), new IntentFilter("android.net.wifi.STATE_CHANGE"));
	//   12   28:aload_0         
	//   13   29:invokevirtual   #131 <Method Activity getActivity()>
	//   14   32:aload_0         
	//   15   33:getfield        #125 <Field bu$c l>
	//   16   36:new             #133 <Class IntentFilter>
	//   17   39:dup             
	//   18   40:ldc1            #135 <String "android.net.wifi.STATE_CHANGE">
	//   19   42:invokespecial   #138 <Method void IntentFilter(String)>
	//   20   45:invokevirtual   #144 <Method Intent Activity.registerReceiver(BroadcastReceiver, IntentFilter)>
	//   21   48:pop             
	//   22   49:return          
	}

	private void j()
	{
		if(isAdded() && l != null)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #123 <Method boolean isAdded()>
	//*   2    4:ifeq            60
	//*   3    7:aload_0         
	//*   4    8:getfield        #125 <Field bu$c l>
	//*   5   11:ifnull          60
			try
			{
				getActivity().unregisterReceiver(((BroadcastReceiver) (l)));
	//    6   14:aload_0         
	//    7   15:invokevirtual   #131 <Method Activity getActivity()>
	//    8   18:aload_0         
	//    9   19:getfield        #125 <Field bu$c l>
	//   10   22:invokevirtual   #150 <Method void Activity.unregisterReceiver(BroadcastReceiver)>
				return;
	//   11   25:return          
			}
			catch(IllegalArgumentException illegalargumentexception)
	//*  12   26:astore_1        
			{
				StringBuilder stringbuilder = new StringBuilder();
	//   13   27:new             #152 <Class StringBuilder>
	//   14   30:dup             
	//   15   31:invokespecial   #153 <Method void StringBuilder()>
	//   16   34:astore_2        
				stringbuilder.append("Failed to unregister receiver: ");
	//   17   35:aload_2         
	//   18   36:ldc1            #155 <String "Failed to unregister receiver: ">
	//   19   38:invokevirtual   #159 <Method StringBuilder StringBuilder.append(String)>
	//   20   41:pop             
				stringbuilder.append(illegalargumentexception.getMessage());
	//   21   42:aload_2         
	//   22   43:aload_1         
	//   23   44:invokevirtual   #163 <Method String IllegalArgumentException.getMessage()>
	//   24   47:invokevirtual   #159 <Method StringBuilder StringBuilder.append(String)>
	//   25   50:pop             
				com.irobot.home.util.o.e("SetupNetworkFragment", stringbuilder.toString());
	//   26   51:ldc1            #107 <String "SetupNetworkFragment">
	//   27   53:aload_2         
	//   28   54:invokevirtual   #166 <Method String StringBuilder.toString()>
	//   29   57:invokestatic    #111 <Method void o.e(String, String)>
			}
	//   30   60:return          
	}

	private String k()
	{
		return com.irobot.home.util.j.e(d.getSSID());
	//    0    0:aload_0         
	//    1    1:getfield        #168 <Field WifiInfo d>
	//    2    4:invokevirtual   #173 <Method String WifiInfo.getSSID()>
	//    3    7:invokestatic    #178 <Method String j.e(String)>
	//    4   10:areturn         
	}

	public void A()
	{
		r = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #53  <Field boolean r>
	//    3    5:return          
	}

	void a()
	{
		com.irobot.home.util.o.c("*** PROVISIONING ***", String.format(Locale.US, getString(0x7f0f04ae), new Object[0]));
	//    0    0:ldc1            #62  <String "*** PROVISIONING ***">
	//    1    2:getstatic       #185 <Field Locale Locale.US>
	//    2    5:aload_0         
	//    3    6:ldc1            #186 <Int 0x7f0f04ae>
	//    4    8:invokevirtual   #190 <Method String getString(int)>
	//    5   11:iconst_0        
	//    6   12:anewarray       Object[]
	//    7   15:invokestatic    #198 <Method String String.format(Locale, String, Object[])>
	//    8   18:invokestatic    #69  <Method void o.c(String, String)>
		android.net.Uri uri = com.irobot.home.util.j.a(((Context) (getActivity())), 0x7f0e01ff);
	//    9   21:aload_0         
	//   10   22:invokevirtual   #131 <Method Activity getActivity()>
	//   11   25:ldc1            #199 <Int 0x7f0e01ff>
	//   12   27:invokestatic    #202 <Method android.net.Uri j.a(Context, int)>
	//   13   30:astore_1        
		j.setSource(uri);
	//   14   31:aload_0         
	//   15   32:getfield        #204 <Field CustomVideoView j>
	//   16   35:aload_1         
	//   17   36:invokevirtual   #210 <Method void CustomVideoView.setSource(android.net.Uri)>
		j.setLayoutParams(((android.view.ViewGroup.LayoutParams) (new android.widget.LinearLayout.LayoutParams(-1, com.irobot.home.util.j.a(getActivity(), uri)))));
	//   18   39:aload_0         
	//   19   40:getfield        #204 <Field CustomVideoView j>
	//   20   43:new             #212 <Class android.widget.LinearLayout$LayoutParams>
	//   21   46:dup             
	//   22   47:iconst_m1       
	//   23   48:aload_0         
	//   24   49:invokevirtual   #131 <Method Activity getActivity()>
	//   25   52:aload_1         
	//   26   53:invokestatic    #215 <Method int j.a(Activity, android.net.Uri)>
	//   27   56:invokespecial   #218 <Method void android.widget.LinearLayout$LayoutParams(int, int)>
	//   28   59:invokevirtual   #222 <Method void CustomVideoView.setLayoutParams(android.view.ViewGroup$LayoutParams)>
		j.setLooping(true);
	//   29   62:aload_0         
	//   30   63:getfield        #204 <Field CustomVideoView j>
	//   31   66:iconst_1        
	//   32   67:invokevirtual   #226 <Method void CustomVideoView.setLooping(boolean)>
		j.a();
	//   33   70:aload_0         
	//   34   71:getfield        #204 <Field CustomVideoView j>
	//   35   74:invokevirtual   #228 <Method void CustomVideoView.a()>
		b(0x7f0f04b9);
	//   36   77:aload_0         
	//   37   78:ldc1            #229 <Int 0x7f0f04b9>
	//   38   80:invokevirtual   #231 <Method void b(int)>
		k.a(false);
	//   39   83:aload_0         
	//   40   84:getfield        #58  <Field bu$b k>
	//   41   87:iconst_0        
	//   42   88:invokeinterface #233 <Method void com.irobot.home.fragments.bu$b.a(boolean)>
		a = new a(0x124f8L, 0x124f8L);
	//   43   93:aload_0         
	//   44   94:new             #12  <Class bu$a>
	//   45   97:dup             
	//   46   98:aload_0         
	//   47   99:ldc2w           #234 <Long 0x124f8L>
	//   48  102:ldc2w           #234 <Long 0x124f8L>
	//   49  105:invokespecial   #238 <Method void bu$a(bu, long, long)>
	//   50  108:putfield        #240 <Field bu$a a>
		if(f && h)
	//*  51  111:aload_0         
	//*  52  112:getfield        #127 <Field boolean f>
	//*  53  115:ifeq            130
	//*  54  118:aload_0         
	//*  55  119:getfield        #242 <Field boolean h>
	//*  56  122:ifeq            130
		{
			e();
	//   57  125:aload_0         
	//   58  126:invokevirtual   #244 <Method void e()>
			return;
	//   59  129:return          
		} else
		{
			c();
	//   60  130:aload_0         
	//   61  131:invokevirtual   #246 <Method void c()>
			return;
	//   62  134:return          
		}
	}

	public void a(int i1, String s)
	{
		if(!isAdded())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #123 <Method boolean isAdded()>
	//*   2    4:ifne            8
		{
			return;
	//    3    7:return          
		} else
		{
			s = getString(i1, new Object[] {
				s
			});
	//    4    8:aload_0         
	//    5    9:iload_1         
	//    6   10:iconst_1        
	//    7   11:anewarray       Object[]
	//    8   14:dup             
	//    9   15:iconst_0        
	//   10   16:aload_2         
	//   11   17:aastore         
	//   12   18:invokevirtual   #250 <Method String getString(int, Object[])>
	//   13   21:astore_2        
			k.b(s);
	//   14   22:aload_0         
	//   15   23:getfield        #58  <Field bu$b k>
	//   16   26:aload_2         
	//   17   27:invokeinterface #252 <Method void com.irobot.home.fragments.bu$b.b(String)>
			a(s);
	//   18   32:aload_0         
	//   19   33:aload_2         
	//   20   34:invokevirtual   #254 <Method void a(String)>
			com.irobot.home.util.o.c("*** PROVISIONING ***", String.format(Locale.US, s, new Object[0]));
	//   21   37:ldc1            #62  <String "*** PROVISIONING ***">
	//   22   39:getstatic       #185 <Field Locale Locale.US>
	//   23   42:aload_2         
	//   24   43:iconst_0        
	//   25   44:anewarray       Object[]
	//   26   47:invokestatic    #198 <Method String String.format(Locale, String, Object[])>
	//   27   50:invokestatic    #69  <Method void o.c(String, String)>
			return;
	//   28   53:return          
		}
	}

	public void a(b b1)
	{
		k = b1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #58  <Field bu$b k>
	//    3    5:return          
	}

	public void a(WifiConfig wificonfig)
	{
		com.irobot.home.o.a a1 = com.irobot.home.o.a.a(c);
	//    0    0:aload_0         
	//    1    1:getfield        #266 <Field String c>
	//    2    4:invokestatic    #269 <Method a a.a(String)>
	//    3    7:astore_3        
		byte byte0;
		try
		{
			b(0x7f0f04bb);
	//    4    8:aload_0         
	//    5    9:ldc2            #270 <Int 0x7f0f04bb>
	//    6   12:invokevirtual   #231 <Method void b(int)>
			com.irobot.home.util.o.c("*** PROVISIONING ***", "UMI: set_wlcfg");
	//    7   15:ldc1            #62  <String "*** PROVISIONING ***">
	//    8   17:ldc2            #272 <String "UMI: set_wlcfg">
	//    9   20:invokestatic    #69  <Method void o.c(String, String)>
			a1.a(wificonfig);
	//   10   23:aload_3         
	//   11   24:aload_1         
	//   12   25:invokevirtual   #274 <Method void a.a(WifiConfig)>
			b(0x7f0f04bc);
	//   13   28:aload_0         
	//   14   29:ldc2            #275 <Int 0x7f0f04bc>
	//   15   32:invokevirtual   #231 <Method void b(int)>
			com.irobot.home.util.o.c("*** PROVISIONING ***", "UMI: cmd wlapoff");
	//   16   35:ldc1            #62  <String "*** PROVISIONING ***">
	//   17   37:ldc2            #277 <String "UMI: cmd wlapoff">
	//   18   40:invokestatic    #69  <Method void o.c(String, String)>
			a1.a(i.WLAPOFF);
	//   19   43:aload_3         
	//   20   44:getstatic       #283 <Field i i.WLAPOFF>
	//   21   47:invokevirtual   #286 <Method void a.a(i)>
			a.start();
	//   22   50:aload_0         
	//   23   51:getfield        #240 <Field bu$a a>
	//   24   54:invokevirtual   #290 <Method CountDownTimer bu$a.start()>
	//   25   57:pop             
			e();
	//   26   58:aload_0         
	//   27   59:invokevirtual   #244 <Method void e()>
			return;
	//   28   62:return          
		}
	//*  29   63:bipush          9
	//*  30   65:istore_2        
	//*  31   66:goto            72
	//*  32   69:bipush          7
	//*  33   71:istore_2        
	//*  34   72:aload_0         
	//*  35   73:iload_2         
	//*  36   74:invokevirtual   #96  <Method void d(int)>
	//*  37   77:return          
		// Misplaced declaration of an exception variable
		catch(WifiConfig wificonfig)
	//*  38   78:astore_1        
		{
			a(((Exception) (wificonfig)));
	//   39   79:aload_0         
	//   40   80:aload_1         
	//   41   81:invokespecial   #292 <Method void a(Exception)>
			return;
	//   42   84:return          
		}
		// Misplaced declaration of an exception variable
		catch(WifiConfig wificonfig)
		{
			byte0 = 7;
		}
	//*  43   85:astore_1        
	//*  44   86:goto            69
		// Misplaced declaration of an exception variable
		catch(WifiConfig wificonfig)
		{
			byte0 = 9;
		}
		d(((int) (byte0)));
		return;
	//*  45   89:astore_1        
	//*  46   90:goto            63
	}

	protected void a(String s)
	{
		if(!isAdded())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #123 <Method boolean isAdded()>
	//*   2    4:ifne            8
		{
			return;
	//    3    7:return          
		} else
		{
			((BroadcastSetupActivity)getActivity()).a(s);
	//    4    8:aload_0         
	//    5    9:invokevirtual   #131 <Method Activity getActivity()>
	//    6   12:checkcast       #294 <Class BroadcastSetupActivity>
	//    7   15:aload_1         
	//    8   16:invokevirtual   #295 <Method void BroadcastSetupActivity.a(String)>
			return;
	//    9   19:return          
		}
	}

	public void a(boolean flag)
	{
		com.irobot.home.o.a a1 = com.irobot.home.o.a.a(c);
	//    0    0:aload_0         
	//    1    1:getfield        #266 <Field String c>
	//    2    4:invokestatic    #269 <Method a a.a(String)>
	//    3    7:astore          7
		long l1 = System.currentTimeMillis();
	//    4    9:invokestatic    #103 <Method long System.currentTimeMillis()>
	//    5   12:lstore          5
		boolean flag1 = false;
	//    6   14:iconst_0        
	//    7   15:istore_2        
_L6:
		boolean flag2 = false;
	//    8   16:iconst_0        
	//    9   17:istore_3        
_L7:
		if(flag1 || flag2) goto _L2; else goto _L1
	//   10   18:iload_2         
	//   11   19:ifne            108
	//   12   22:iload_3         
	//   13   23:ifne            108
_L1:
		RobotSystem robotsystem = a1.c();
	//   14   26:aload           7
	//   15   28:invokevirtual   #300 <Method RobotSystem a.c()>
	//   16   31:astore          8
		com.irobot.home.util.j.o(c).a.a(robotsystem);
	//   17   33:aload_0         
	//   18   34:getfield        #266 <Field String c>
	//   19   37:invokestatic    #303 <Method Robot j.o(String)>
	//   20   40:getfield        #308 <Field RobotSystem Robot.a>
	//   21   43:aload           8
	//   22   45:invokevirtual   #313 <Method void RobotSystem.a(RobotSystem)>
		flag2 = true;
	//   23   48:iconst_1        
	//   24   49:istore_3        
		  goto _L3
	//*  25   50:goto            82
		Object obj2;
		obj2;
	//   26   53:astore          8
		flag2 = flag1;
	//   27   55:iload_2         
	//   28   56:istore_3        
		if(flag) goto _L3; else goto _L4
	//   29   57:iload_1         
	//   30   58:ifne            82
_L4:
		throw new NetworkErrorException(((NetworkErrorException) (obj2)).getMessage());
	//   31   61:new             #258 <Class NetworkErrorException>
	//   32   64:dup             
	//   33   65:aload           8
	//   34   67:invokevirtual   #314 <Method String NetworkErrorException.getMessage()>
	//   35   70:invokespecial   #315 <Method void NetworkErrorException(String)>
	//   36   73:athrow          
_L8:
		Thread.sleep(3000L);
	//   37   74:ldc2w           #316 <Long 3000L>
	//   38   77:invokestatic    #119 <Method void Thread.sleep(long)>
		flag2 = flag1;
	//   39   80:iload_2         
	//   40   81:istore_3        
_L3:
		flag1 = flag2;
	//   41   82:iload_3         
	//   42   83:istore_2        
		if(System.currentTimeMillis() - l1 <= 30000L) goto _L6; else goto _L5
	//   43   84:invokestatic    #103 <Method long System.currentTimeMillis()>
	//   44   87:lload           5
	//   45   89:lsub            
	//   46   90:ldc2w           #318 <Long 30000L>
	//   47   93:lcmp            
	//   48   94:ifle            16
_L5:
		boolean flag3 = true;
	//   49   97:iconst_1        
	//   50   98:istore          4
		flag1 = flag2;
	//   51  100:iload_3         
	//   52  101:istore_2        
		flag2 = flag3;
	//   53  102:iload           4
	//   54  104:istore_3        
		  goto _L7
	//*  55  105:goto            18
_L2:
		if(!flag1)
			break MISSING_BLOCK_LABEL_226;
	//   56  108:iload_2         
	//   57  109:ifeq            226
		try
		{
			com.irobot.home.util.o.c("*** PROVISIONING ***", "Robot comms successful");
	//   58  112:ldc1            #62  <String "*** PROVISIONING ***">
	//   59  114:ldc2            #321 <String "Robot comms successful">
	//   60  117:invokestatic    #69  <Method void o.c(String, String)>
			k.a(false);
	//   61  120:aload_0         
	//   62  121:getfield        #58  <Field bu$b k>
	//   63  124:iconst_0        
	//   64  125:invokeinterface #233 <Method void com.irobot.home.fragments.bu$b.a(boolean)>
			b(0x7f0f04be);
	//   65  130:aload_0         
	//   66  131:ldc2            #322 <Int 0x7f0f04be>
	//   67  134:invokevirtual   #231 <Method void b(int)>
			if(i)
	//*  68  137:aload_0         
	//*  69  138:getfield        #324 <Field boolean i>
	//*  70  141:ifeq            210
			{
				f();
	//   71  144:aload_0         
	//   72  145:invokevirtual   #326 <Method void f()>
				com.irobot.home.util.o.c("*** PROVISIONING ***", "UMI: cmd ipdone");
	//   73  148:ldc1            #62  <String "*** PROVISIONING ***">
	//   74  150:ldc2            #328 <String "UMI: cmd ipdone">
	//   75  153:invokestatic    #69  <Method void o.c(String, String)>
				a1.a(i.IPDONE);
	//   76  156:aload           7
	//   77  158:getstatic       #331 <Field i i.IPDONE>
	//   78  161:invokevirtual   #286 <Method void a.a(i)>
				k.b();
	//   79  164:aload_0         
	//   80  165:getfield        #58  <Field bu$b k>
	//   81  168:invokeinterface #333 <Method void com.irobot.home.fragments.bu$b.b()>
				com.irobot.home.util.j.a(c, true);
	//   82  173:aload_0         
	//   83  174:getfield        #266 <Field String c>
	//   84  177:iconst_1        
	//   85  178:invokestatic    #336 <Method void j.a(String, boolean)>
				com.irobot.home.util.o.c("*** PROVISIONING ***", "********* UMI: Sending RESET Command");
	//   86  181:ldc1            #62  <String "*** PROVISIONING ***">
	//   87  183:ldc2            #338 <String "********* UMI: Sending RESET Command">
	//   88  186:invokestatic    #69  <Method void o.c(String, String)>
				b(0x7f0f04b5);
	//   89  189:aload_0         
	//   90  190:ldc2            #339 <Int 0x7f0f04b5>
	//   91  193:invokevirtual   #231 <Method void b(int)>
				a1.a(i.RESET);
	//   92  196:aload           7
	//   93  198:getstatic       #342 <Field i i.RESET>
	//   94  201:invokevirtual   #286 <Method void a.a(i)>
				Thread.sleep(15000L);
	//   95  204:ldc2w           #343 <Long 15000L>
	//   96  207:invokestatic    #119 <Method void Thread.sleep(long)>
			}
			m.c(c);
	//   97  210:aload_0         
	//   98  211:getfield        #348 <Field com.irobot.home.q.b m>
	//   99  214:aload_0         
	//  100  215:getfield        #266 <Field String c>
	//  101  218:invokevirtual   #352 <Method void com.irobot.home.q.b.c(String)>
			g();
	//  102  221:aload_0         
	//  103  222:invokevirtual   #354 <Method void g()>
			return;
	//  104  225:return          
		}
	//* 105  226:aload_0         
	//* 106  227:bipush          9
	//* 107  229:invokevirtual   #96  <Method void d(int)>
	//* 108  232:return          
	//* 109  233:aload_0         
	//* 110  234:bipush          9
	//* 111  236:invokevirtual   #96  <Method void d(int)>
	//* 112  239:return          
	//* 113  240:aload_0         
	//* 114  241:bipush          7
	//* 115  243:invokevirtual   #96  <Method void d(int)>
	//* 116  246:return          
		catch(Object obj)
	//* 117  247:astore          7
		{
			a(((Exception) (obj)));
	//  118  249:aload_0         
	//  119  250:aload           7
	//  120  252:invokespecial   #292 <Method void a(Exception)>
		}
	//* 121  255:return          
		// Misplaced declaration of an exception variable
		catch(Object obj1)
		{
			d(7);
			return;
		}
	//* 122  256:astore          7
	//* 123  258:goto            240
		// Misplaced declaration of an exception variable
		catch(Object obj1)
		{
			d(9);
			return;
		}
		break MISSING_BLOCK_LABEL_255;
		d(9);
		return;
		Object obj1;
		return;
	//* 124  261:astore          7
	//* 125  263:goto            233
		obj2;
	//  126  266:astore          8
		  goto _L8
	//* 127  268:goto            74
	}

	public void b()
	{
		j();
	//    0    0:aload_0         
	//    1    1:invokespecial   #356 <Method void j()>
		k.a();
	//    2    4:aload_0         
	//    3    5:getfield        #58  <Field bu$b k>
	//    4    8:invokeinterface #357 <Method void com.irobot.home.fragments.bu$b.a()>
	//    5   13:return          
	}

	public void b(int i1)
	{
		if(!isAdded())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #123 <Method boolean isAdded()>
	//*   2    4:ifne            8
		{
			return;
	//    3    7:return          
		} else
		{
			String s = getString(i1);
	//    4    8:aload_0         
	//    5    9:iload_1         
	//    6   10:invokevirtual   #190 <Method String getString(int)>
	//    7   13:astore_2        
			k.b(s);
	//    8   14:aload_0         
	//    9   15:getfield        #58  <Field bu$b k>
	//   10   18:aload_2         
	//   11   19:invokeinterface #252 <Method void com.irobot.home.fragments.bu$b.b(String)>
			a(s);
	//   12   24:aload_0         
	//   13   25:aload_2         
	//   14   26:invokevirtual   #254 <Method void a(String)>
			com.irobot.home.util.o.c("*** PROVISIONING ***", String.format(Locale.US, s, new Object[0]));
	//   15   29:ldc1            #62  <String "*** PROVISIONING ***">
	//   16   31:getstatic       #185 <Field Locale Locale.US>
	//   17   34:aload_2         
	//   18   35:iconst_0        
	//   19   36:anewarray       Object[]
	//   20   39:invokestatic    #198 <Method String String.format(Locale, String, Object[])>
	//   21   42:invokestatic    #69  <Method void o.c(String, String)>
			return;
	//   22   45:return          
		}
	}

	public void b(WifiConfig wificonfig)
	{
		int k1;
		int l1;
		int i2;
		int j2;
		Object obj;
		Robot robot;
		Object obj6;
		robot = com.irobot.home.util.j.o(c);
	//    0    0:aload_0         
	//    1    1:getfield        #266 <Field String c>
	//    2    4:invokestatic    #303 <Method Robot j.o(String)>
	//    3    7:astore          18
		obj6 = ((Object) (com.irobot.home.o.a.a(c)));
	//    4    9:aload_0         
	//    5   10:getfield        #266 <Field String c>
	//    6   13:invokestatic    #269 <Method a a.a(String)>
	//    7   16:astore          19
		obj = "";
	//    8   18:ldc2            #359 <String "">
	//    9   21:astore          13
		j2 = -1;
	//   10   23:iconst_m1       
	//   11   24:istore          7
		k1 = j2;
	//   12   26:iload           7
	//   13   28:istore          4
		l1 = j2;
	//   14   30:iload           7
	//   15   32:istore          5
		i2 = j2;
	//   16   34:iload           7
	//   17   36:istore          6
		com.irobot.home.util.o.c("*** PROVISIONING ***", "UMI: cmd wlstoff");
	//   18   38:ldc1            #62  <String "*** PROVISIONING ***">
	//   19   40:ldc2            #361 <String "UMI: cmd wlstoff">
	//   20   43:invokestatic    #69  <Method void o.c(String, String)>
		k1 = j2;
	//   21   46:iload           7
	//   22   48:istore          4
		l1 = j2;
	//   23   50:iload           7
	//   24   52:istore          5
		i2 = j2;
	//   25   54:iload           7
	//   26   56:istore          6
		((com.irobot.home.o.a) (obj6)).a(i.WLSTOFF);
	//   27   58:aload           19
	//   28   60:getstatic       #364 <Field i i.WLSTOFF>
	//   29   63:invokevirtual   #286 <Method void a.a(i)>
		k1 = j2;
	//   30   66:iload           7
	//   31   68:istore          4
		l1 = j2;
	//   32   70:iload           7
	//   33   72:istore          5
		i2 = j2;
	//   34   74:iload           7
	//   35   76:istore          6
		Thread.sleep(3000L);
	//   36   78:ldc2w           #316 <Long 3000L>
	//   37   81:invokestatic    #119 <Method void Thread.sleep(long)>
		k1 = j2;
	//   38   84:iload           7
	//   39   86:istore          4
		l1 = j2;
	//   40   88:iload           7
	//   41   90:istore          5
		i2 = j2;
	//   42   92:iload           7
	//   43   94:istore          6
		long l2 = System.currentTimeMillis();
	//   44   96:invokestatic    #103 <Method long System.currentTimeMillis()>
	//   45   99:lstore          10
_L8:
		int j1;
		Object obj2;
		k1 = j2;
	//   46  101:iload           7
	//   47  103:istore          4
		obj2 = obj;
	//   48  105:aload           13
	//   49  107:astore          14
		j1 = j2;
	//   50  109:iload           7
	//   51  111:istore_3        
		l1 = j2;
	//   52  112:iload           7
	//   53  114:istore          5
		i2 = j2;
	//   54  116:iload           7
	//   55  118:istore          6
		Object obj3 = ((Object) (a(((com.irobot.home.o.a) (obj6)))));
	//   56  120:aload_0         
	//   57  121:aload           19
	//   58  123:invokespecial   #366 <Method JSONObject a(a)>
	//   59  126:astore          15
		int i1 = j2;
	//   60  128:iload           7
	//   61  130:istore_2        
		if(obj3 == null) goto _L2; else goto _L1
	//   62  131:aload           15
	//   63  133:ifnull          245
_L1:
		k1 = j2;
	//   64  136:iload           7
	//   65  138:istore          4
		obj2 = obj;
	//   66  140:aload           13
	//   67  142:astore          14
		j1 = j2;
	//   68  144:iload           7
	//   69  146:istore_3        
		l1 = j2;
	//   70  147:iload           7
	//   71  149:istore          5
		i2 = j2;
	//   72  151:iload           7
	//   73  153:istore          6
		i1 = ((JSONObject) (obj3)).getInt("station");
	//   74  155:aload           15
	//   75  157:ldc2            #368 <String "station">
	//   76  160:invokevirtual   #372 <Method int JSONObject.getInt(String)>
	//   77  163:istore_2        
		Object obj4;
		Object obj5;
		obj3 = obj;
	//   78  164:aload           13
	//   79  166:astore          15
		j1 = i1;
	//   80  168:iload_2         
	//   81  169:istore_3        
		obj2 = obj;
	//   82  170:aload           13
	//   83  172:astore          14
		k1 = i1;
	//   84  174:iload_2         
	//   85  175:istore          4
		obj4 = obj;
	//   86  177:aload           13
	//   87  179:astore          16
		l1 = i1;
	//   88  181:iload_2         
	//   89  182:istore          5
		obj5 = obj;
	//   90  184:aload           13
	//   91  186:astore          17
		i2 = i1;
	//   92  188:iload_2         
	//   93  189:istore          6
		j2 = ac.IDLE.ordinal();
	//   94  191:getstatic       #378 <Field ac ac.IDLE>
	//   95  194:invokevirtual   #382 <Method int ac.ordinal()>
	//   96  197:istore          7
		if(i1 == j2)
	//*  97  199:iload_2         
	//*  98  200:iload           7
	//*  99  202:icmpne          208
			break; /* Loop/switch isn't completed */
	//  100  205:goto            272
		  goto _L2
	//* 101  208:goto            245
		wificonfig;
	//  102  211:astore_1        
		obj = obj3;
	//  103  212:aload           15
	//  104  214:astore          13
		i1 = j1;
	//  105  216:iload_3         
	//  106  217:istore_2        
		  goto _L3
	//* 107  218:goto            1195
_L14:
		j1 = i1;
	//  108  221:iload_2         
	//  109  222:istore_3        
		  goto _L4
	//* 110  223:goto            1062
_L15:
		j1 = i1;
	//  111  226:iload_2         
	//  112  227:istore_3        
		  goto _L5
	//* 113  228:goto            1083
		wificonfig;
	//  114  231:astore_1        
		i1 = k1;
	//  115  232:iload           4
	//  116  234:istore_2        
		obj = obj2;
	//  117  235:aload           14
	//  118  237:astore          13
_L16:
		k1 = i1;
	//  119  239:iload_2         
	//  120  240:istore          4
		  goto _L6
	//* 121  242:goto            1123
_L2:
		j2 = i1;
	//  122  245:iload_2         
	//  123  246:istore          7
		k1 = i1;
	//  124  248:iload_2         
	//  125  249:istore          4
		obj2 = obj;
	//  126  251:aload           13
	//  127  253:astore          14
		j1 = i1;
	//  128  255:iload_2         
	//  129  256:istore_3        
		l1 = i1;
	//  130  257:iload_2         
	//  131  258:istore          5
		i2 = i1;
	//  132  260:iload_2         
	//  133  261:istore          6
		if(!a(l2)) goto _L8; else goto _L7
	//  134  263:aload_0         
	//  135  264:lload           10
	//  136  266:invokespecial   #384 <Method boolean a(long)>
	//  137  269:ifeq            101
_L7:
		k1 = i1;
	//  138  272:iload_2         
	//  139  273:istore          4
		obj2 = obj;
	//  140  275:aload           13
	//  141  277:astore          14
		j1 = i1;
	//  142  279:iload_2         
	//  143  280:istore_3        
		l1 = i1;
	//  144  281:iload_2         
	//  145  282:istore          5
		i2 = i1;
	//  146  284:iload_2         
	//  147  285:istore          6
		b(0x7f0f04bb);
	//  148  287:aload_0         
	//  149  288:ldc2            #270 <Int 0x7f0f04bb>
	//  150  291:invokevirtual   #231 <Method void b(int)>
		k1 = i1;
	//  151  294:iload_2         
	//  152  295:istore          4
		obj2 = obj;
	//  153  297:aload           13
	//  154  299:astore          14
		j1 = i1;
	//  155  301:iload_2         
	//  156  302:istore_3        
		l1 = i1;
	//  157  303:iload_2         
	//  158  304:istore          5
		i2 = i1;
	//  159  306:iload_2         
	//  160  307:istore          6
		com.irobot.home.util.o.c("*** PROVISIONING ***", "UMI: set_wlcfg");
	//  161  309:ldc1            #62  <String "*** PROVISIONING ***">
	//  162  311:ldc2            #272 <String "UMI: set_wlcfg">
	//  163  314:invokestatic    #69  <Method void o.c(String, String)>
		k1 = i1;
	//  164  317:iload_2         
	//  165  318:istore          4
		obj2 = obj;
	//  166  320:aload           13
	//  167  322:astore          14
		j1 = i1;
	//  168  324:iload_2         
	//  169  325:istore_3        
		l1 = i1;
	//  170  326:iload_2         
	//  171  327:istore          5
		i2 = i1;
	//  172  329:iload_2         
	//  173  330:istore          6
		((com.irobot.home.o.a) (obj6)).a(wificonfig);
	//  174  332:aload           19
	//  175  334:aload_1         
	//  176  335:invokevirtual   #274 <Method void a.a(WifiConfig)>
		k1 = i1;
	//  177  338:iload_2         
	//  178  339:istore          4
		obj2 = obj;
	//  179  341:aload           13
	//  180  343:astore          14
		j1 = i1;
	//  181  345:iload_2         
	//  182  346:istore_3        
		l1 = i1;
	//  183  347:iload_2         
	//  184  348:istore          5
		i2 = i1;
	//  185  350:iload_2         
	//  186  351:istore          6
		b(0x7f0f04bc);
	//  187  353:aload_0         
	//  188  354:ldc2            #275 <Int 0x7f0f04bc>
	//  189  357:invokevirtual   #231 <Method void b(int)>
		k1 = i1;
	//  190  360:iload_2         
	//  191  361:istore          4
		obj2 = obj;
	//  192  363:aload           13
	//  193  365:astore          14
		j1 = i1;
	//  194  367:iload_2         
	//  195  368:istore_3        
		l1 = i1;
	//  196  369:iload_2         
	//  197  370:istore          5
		i2 = i1;
	//  198  372:iload_2         
	//  199  373:istore          6
		com.irobot.home.util.o.c("*** PROVISIONING ***", "UMI: cmd wlston");
	//  200  375:ldc1            #62  <String "*** PROVISIONING ***">
	//  201  377:ldc2            #386 <String "UMI: cmd wlston">
	//  202  380:invokestatic    #69  <Method void o.c(String, String)>
		k1 = i1;
	//  203  383:iload_2         
	//  204  384:istore          4
		obj2 = obj;
	//  205  386:aload           13
	//  206  388:astore          14
		j1 = i1;
	//  207  390:iload_2         
	//  208  391:istore_3        
		l1 = i1;
	//  209  392:iload_2         
	//  210  393:istore          5
		i2 = i1;
	//  211  395:iload_2         
	//  212  396:istore          6
		((com.irobot.home.o.a) (obj6)).a(i.WLSTON);
	//  213  398:aload           19
	//  214  400:getstatic       #389 <Field i i.WLSTON>
	//  215  403:invokevirtual   #286 <Method void a.a(i)>
		k1 = i1;
	//  216  406:iload_2         
	//  217  407:istore          4
		obj2 = obj;
	//  218  409:aload           13
	//  219  411:astore          14
		j1 = i1;
	//  220  413:iload_2         
	//  221  414:istore_3        
		l1 = i1;
	//  222  415:iload_2         
	//  223  416:istore          5
		i2 = i1;
	//  224  418:iload_2         
	//  225  419:istore          6
		Thread.sleep(10000L);
	//  226  421:ldc2w           #390 <Long 10000L>
	//  227  424:invokestatic    #119 <Method void Thread.sleep(long)>
		k1 = i1;
	//  228  427:iload_2         
	//  229  428:istore          4
		obj2 = obj;
	//  230  430:aload           13
	//  231  432:astore          14
		j1 = i1;
	//  232  434:iload_2         
	//  233  435:istore_3        
		l1 = i1;
	//  234  436:iload_2         
	//  235  437:istore          5
		i2 = i1;
	//  236  439:iload_2         
	//  237  440:istore          6
		l2 = System.currentTimeMillis();
	//  238  442:invokestatic    #103 <Method long System.currentTimeMillis()>
	//  239  445:lstore          10
		k1 = i1;
	//  240  447:iload_2         
	//  241  448:istore          4
		obj2 = obj;
	//  242  450:aload           13
	//  243  452:astore          14
		j1 = i1;
	//  244  454:iload_2         
	//  245  455:istore_3        
		l1 = i1;
	//  246  456:iload_2         
	//  247  457:istore          5
		i2 = i1;
	//  248  459:iload_2         
	//  249  460:istore          6
		a(0x7f0f04bd, k());
	//  250  462:aload_0         
	//  251  463:ldc2            #392 <Int 0x7f0f04bd>
	//  252  466:aload_0         
	//  253  467:invokespecial   #394 <Method String k()>
	//  254  470:invokevirtual   #396 <Method void a(int, String)>
		boolean flag1;
		flag1 = false;
	//  255  473:iconst_0        
	//  256  474:istore          9
		j2 = i1;
	//  257  476:iload_2         
	//  258  477:istore          7
_L19:
		k1 = j2;
	//  259  479:iload           7
	//  260  481:istore          4
		obj2 = obj;
	//  261  483:aload           13
	//  262  485:astore          14
		j1 = j2;
	//  263  487:iload           7
	//  264  489:istore_3        
		l1 = j2;
	//  265  490:iload           7
	//  266  492:istore          5
		i2 = j2;
	//  267  494:iload           7
	//  268  496:istore          6
		wificonfig = ((WifiConfig) (a(((com.irobot.home.o.a) (obj6)))));
	//  269  498:aload_0         
	//  270  499:aload           19
	//  271  501:invokespecial   #366 <Method JSONObject a(a)>
	//  272  504:astore_1        
		boolean flag;
		i1 = j2;
	//  273  505:iload           7
	//  274  507:istore_2        
		flag = flag1;
	//  275  508:iload           9
	//  276  510:istore          8
		if(wificonfig == null) goto _L10; else goto _L9
	//  277  512:aload_1         
	//  278  513:ifnull          805
_L9:
		k1 = j2;
	//  279  516:iload           7
	//  280  518:istore          4
		obj2 = obj;
	//  281  520:aload           13
	//  282  522:astore          14
		j1 = j2;
	//  283  524:iload           7
	//  284  526:istore_3        
		l1 = j2;
	//  285  527:iload           7
	//  286  529:istore          5
		i2 = j2;
	//  287  531:iload           7
	//  288  533:istore          6
		i1 = ((JSONObject) (wificonfig)).getInt("station");
	//  289  535:aload_1         
	//  290  536:ldc2            #368 <String "station">
	//  291  539:invokevirtual   #372 <Method int JSONObject.getInt(String)>
	//  292  542:istore_2        
		obj3 = obj;
	//  293  543:aload           13
	//  294  545:astore          15
		j1 = i1;
	//  295  547:iload_2         
	//  296  548:istore_3        
		obj2 = obj;
	//  297  549:aload           13
	//  298  551:astore          14
		k1 = i1;
	//  299  553:iload_2         
	//  300  554:istore          4
		obj4 = obj;
	//  301  556:aload           13
	//  302  558:astore          16
		l1 = i1;
	//  303  560:iload_2         
	//  304  561:istore          5
		obj5 = obj;
	//  305  563:aload           13
	//  306  565:astore          17
		i2 = i1;
	//  307  567:iload_2         
	//  308  568:istore          6
		if(i1 == ac.IDLE.ordinal())
			break MISSING_BLOCK_LABEL_1281;
	//  309  570:iload_2         
	//  310  571:getstatic       #378 <Field ac ac.IDLE>
	//  311  574:invokevirtual   #382 <Method int ac.ordinal()>
	//  312  577:icmpeq          1281
		obj3 = obj;
	//  313  580:aload           13
	//  314  582:astore          15
		j1 = i1;
	//  315  584:iload_2         
	//  316  585:istore_3        
		obj2 = obj;
	//  317  586:aload           13
	//  318  588:astore          14
		k1 = i1;
	//  319  590:iload_2         
	//  320  591:istore          4
		obj4 = obj;
	//  321  593:aload           13
	//  322  595:astore          16
		l1 = i1;
	//  323  597:iload_2         
	//  324  598:istore          5
		obj5 = obj;
	//  325  600:aload           13
	//  326  602:astore          17
		i2 = i1;
	//  327  604:iload_2         
	//  328  605:istore          6
		if(i1 == ac.OK.ordinal())
			break MISSING_BLOCK_LABEL_1281;
	//  329  607:iload_2         
	//  330  608:getstatic       #399 <Field ac ac.OK>
	//  331  611:invokevirtual   #382 <Method int ac.ordinal()>
	//  332  614:icmpeq          1281
		j2 = 1;
	//  333  617:iconst_1        
	//  334  618:istore          7
	//* 335  620:goto            623
_L26:
		obj3 = obj;
	//  336  623:aload           13
	//  337  625:astore          15
		j1 = i1;
	//  338  627:iload_2         
	//  339  628:istore_3        
		obj2 = obj;
	//  340  629:aload           13
	//  341  631:astore          14
		k1 = i1;
	//  342  633:iload_2         
	//  343  634:istore          4
		obj4 = obj;
	//  344  636:aload           13
	//  345  638:astore          16
		l1 = i1;
	//  346  640:iload_2         
	//  347  641:istore          5
		obj5 = obj;
	//  348  643:aload           13
	//  349  645:astore          17
		i2 = i1;
	//  350  647:iload_2         
	//  351  648:istore          6
		if(i1 != ac.OK.ordinal()) goto _L12; else goto _L11
	//  352  650:iload_2         
	//  353  651:getstatic       #399 <Field ac ac.OK>
	//  354  654:invokevirtual   #382 <Method int ac.ordinal()>
	//  355  657:icmpne          793
_L11:
		obj3 = obj;
	//  356  660:aload           13
	//  357  662:astore          15
		j1 = i1;
	//  358  664:iload_2         
	//  359  665:istore_3        
		obj2 = obj;
	//  360  666:aload           13
	//  361  668:astore          14
		k1 = i1;
	//  362  670:iload_2         
	//  363  671:istore          4
		obj4 = obj;
	//  364  673:aload           13
	//  365  675:astore          16
		l1 = i1;
	//  366  677:iload_2         
	//  367  678:istore          5
		obj5 = obj;
	//  368  680:aload           13
	//  369  682:astore          17
		i2 = i1;
	//  370  684:iload_2         
	//  371  685:istore          6
		wificonfig = ((WifiConfig) (Formatter.formatIpAddress(((JSONObject) (wificonfig)).getInt("addr"))));
	//  372  687:aload_1         
	//  373  688:ldc2            #401 <String "addr">
	//  374  691:invokevirtual   #372 <Method int JSONObject.getInt(String)>
	//  375  694:invokestatic    #406 <Method String Formatter.formatIpAddress(int)>
	//  376  697:astore_1        
		obj = ((Object) (new StringBuilder()));
	//  377  698:new             #152 <Class StringBuilder>
	//  378  701:dup             
	//  379  702:invokespecial   #153 <Method void StringBuilder()>
	//  380  705:astore          13
		((StringBuilder) (obj)).append(" new ip = ");
	//  381  707:aload           13
	//  382  709:ldc2            #408 <String " new ip = ">
	//  383  712:invokevirtual   #159 <Method StringBuilder StringBuilder.append(String)>
	//  384  715:pop             
		((StringBuilder) (obj)).append(((String) (wificonfig)));
	//  385  716:aload           13
	//  386  718:aload_1         
	//  387  719:invokevirtual   #159 <Method StringBuilder StringBuilder.append(String)>
	//  388  722:pop             
		com.irobot.home.util.o.b("SetupNetworkFragment", ((StringBuilder) (obj)).toString());
	//  389  723:ldc1            #107 <String "SetupNetworkFragment">
	//  390  725:aload           13
	//  391  727:invokevirtual   #166 <Method String StringBuilder.toString()>
	//  392  730:invokestatic    #410 <Method void o.b(String, String)>
		com.irobot.home.util.o.c("*** PROVISIONING ***", "UMI: cmd wlapoff");
	//  393  733:ldc1            #62  <String "*** PROVISIONING ***">
	//  394  735:ldc2            #277 <String "UMI: cmd wlapoff">
	//  395  738:invokestatic    #69  <Method void o.c(String, String)>
		((com.irobot.home.o.a) (obj6)).a(i.WLAPOFF);
	//  396  741:aload           19
	//  397  743:getstatic       #283 <Field i i.WLAPOFF>
	//  398  746:invokevirtual   #286 <Method void a.a(i)>
		d();
	//  399  749:aload_0         
	//  400  750:invokevirtual   #412 <Method void d()>
		obj = ((Object) (wificonfig));
	//  401  753:aload_1         
	//  402  754:astore          13
		  goto _L13
	//* 403  756:goto            844
		obj2;
	//  404  759:astore          14
		obj = ((Object) (wificonfig));
	//  405  761:aload_1         
	//  406  762:astore          13
		wificonfig = ((WifiConfig) (obj2));
	//  407  764:aload           14
	//  408  766:astore_1        
		  goto _L3
	//* 409  767:goto            1195
_L25:
		obj = ((Object) (wificonfig));
	//  410  770:aload_1         
	//  411  771:astore          13
		  goto _L14
	//* 412  773:goto            221
_L24:
		obj = ((Object) (wificonfig));
	//  413  776:aload_1         
	//  414  777:astore          13
		  goto _L15
	//* 415  779:goto            226
		obj2;
	//  416  782:astore          14
		obj = ((Object) (wificonfig));
	//  417  784:aload_1         
	//  418  785:astore          13
		wificonfig = ((WifiConfig) (obj2));
	//  419  787:aload           14
	//  420  789:astore_1        
		  goto _L16
	//* 421  790:goto            239
_L12:
		if(j2 == 0) goto _L17; else goto _L13
	//  422  793:iload           7
	//  423  795:ifeq            801
	//* 424  798:goto            844
_L17:
		flag = ((boolean) (j2));
	//  425  801:iload           7
	//  426  803:istore          8
_L10:
		k1 = i1;
	//  427  805:iload_2         
	//  428  806:istore          4
		obj2 = obj;
	//  429  808:aload           13
	//  430  810:astore          14
		j1 = i1;
	//  431  812:iload_2         
	//  432  813:istore_3        
		l1 = i1;
	//  433  814:iload_2         
	//  434  815:istore          5
		i2 = i1;
	//  435  817:iload_2         
	//  436  818:istore          6
		boolean flag2 = a(l2);
	//  437  820:aload_0         
	//  438  821:lload           10
	//  439  823:invokespecial   #384 <Method boolean a(long)>
	//  440  826:istore          12
		j2 = i1;
	//  441  828:iload_2         
	//  442  829:istore          7
		flag1 = flag;
	//  443  831:iload           8
	//  444  833:istore          9
		if(!flag2) goto _L19; else goto _L18
	//  445  835:iload           12
	//  446  837:ifeq            479
_L18:
		j2 = ((int) (flag));
	//  447  840:iload           8
	//  448  842:istore          7
_L13:
		if(j2 == 0)
			break MISSING_BLOCK_LABEL_1039;
	//  449  844:iload           7
	//  450  846:ifeq            1039
		obj3 = obj;
	//  451  849:aload           13
	//  452  851:astore          15
		j1 = i1;
	//  453  853:iload_2         
	//  454  854:istore_3        
		obj2 = obj;
	//  455  855:aload           13
	//  456  857:astore          14
		k1 = i1;
	//  457  859:iload_2         
	//  458  860:istore          4
		obj4 = obj;
	//  459  862:aload           13
	//  460  864:astore          16
		l1 = i1;
	//  461  866:iload_2         
	//  462  867:istore          5
		obj5 = obj;
	//  463  869:aload           13
	//  464  871:astore          17
		i2 = i1;
	//  465  873:iload_2         
	//  466  874:istore          6
		wificonfig = ((WifiConfig) (((com.irobot.home.o.a) (obj6)).b("wldiag").getJSONObject("ok").getString("msg")));
	//  467  876:aload           19
	//  468  878:ldc2            #414 <String "wldiag">
	//  469  881:invokevirtual   #76  <Method JSONObject a.b(String)>
	//  470  884:ldc1            #78  <String "ok">
	//  471  886:invokevirtual   #87  <Method JSONObject JSONObject.getJSONObject(String)>
	//  472  889:ldc2            #416 <String "msg">
	//  473  892:invokevirtual   #418 <Method String JSONObject.getString(String)>
	//  474  895:astore_1        
		obj3 = obj;
	//  475  896:aload           13
	//  476  898:astore          15
		j1 = i1;
	//  477  900:iload_2         
	//  478  901:istore_3        
		obj2 = obj;
	//  479  902:aload           13
	//  480  904:astore          14
		k1 = i1;
	//  481  906:iload_2         
	//  482  907:istore          4
		obj4 = obj;
	//  483  909:aload           13
	//  484  911:astore          16
		l1 = i1;
	//  485  913:iload_2         
	//  486  914:istore          5
		obj5 = obj;
	//  487  916:aload           13
	//  488  918:astore          17
		i2 = i1;
	//  489  920:iload_2         
	//  490  921:istore          6
		obj6 = ((Object) (new StringBuilder()));
	//  491  923:new             #152 <Class StringBuilder>
	//  492  926:dup             
	//  493  927:invokespecial   #153 <Method void StringBuilder()>
	//  494  930:astore          19
		obj3 = obj;
	//  495  932:aload           13
	//  496  934:astore          15
		j1 = i1;
	//  497  936:iload_2         
	//  498  937:istore_3        
		obj2 = obj;
	//  499  938:aload           13
	//  500  940:astore          14
		k1 = i1;
	//  501  942:iload_2         
	//  502  943:istore          4
		obj4 = obj;
	//  503  945:aload           13
	//  504  947:astore          16
		l1 = i1;
	//  505  949:iload_2         
	//  506  950:istore          5
		obj5 = obj;
	//  507  952:aload           13
	//  508  954:astore          17
		i2 = i1;
	//  509  956:iload_2         
	//  510  957:istore          6
		((StringBuilder) (obj6)).append("Provisioning error: wldiag: ");
	//  511  959:aload           19
	//  512  961:ldc2            #420 <String "Provisioning error: wldiag: ">
	//  513  964:invokevirtual   #159 <Method StringBuilder StringBuilder.append(String)>
	//  514  967:pop             
		obj3 = obj;
	//  515  968:aload           13
	//  516  970:astore          15
		j1 = i1;
	//  517  972:iload_2         
	//  518  973:istore_3        
		obj2 = obj;
	//  519  974:aload           13
	//  520  976:astore          14
		k1 = i1;
	//  521  978:iload_2         
	//  522  979:istore          4
		obj4 = obj;
	//  523  981:aload           13
	//  524  983:astore          16
		l1 = i1;
	//  525  985:iload_2         
	//  526  986:istore          5
		obj5 = obj;
	//  527  988:aload           13
	//  528  990:astore          17
		i2 = i1;
	//  529  992:iload_2         
	//  530  993:istore          6
		((StringBuilder) (obj6)).append(((String) (wificonfig)));
	//  531  995:aload           19
	//  532  997:aload_1         
	//  533  998:invokevirtual   #159 <Method StringBuilder StringBuilder.append(String)>
	//  534 1001:pop             
		obj3 = obj;
	//  535 1002:aload           13
	//  536 1004:astore          15
		j1 = i1;
	//  537 1006:iload_2         
	//  538 1007:istore_3        
		obj2 = obj;
	//  539 1008:aload           13
	//  540 1010:astore          14
		k1 = i1;
	//  541 1012:iload_2         
	//  542 1013:istore          4
		obj4 = obj;
	//  543 1015:aload           13
	//  544 1017:astore          16
		l1 = i1;
	//  545 1019:iload_2         
	//  546 1020:istore          5
		obj5 = obj;
	//  547 1022:aload           13
	//  548 1024:astore          17
		i2 = i1;
	//  549 1026:iload_2         
	//  550 1027:istore          6
		com.irobot.home.util.o.e("SetupNetworkFragment", ((StringBuilder) (obj6)).toString());
	//  551 1029:ldc1            #107 <String "SetupNetworkFragment">
	//  552 1031:aload           19
	//  553 1033:invokevirtual   #166 <Method String StringBuilder.toString()>
	//  554 1036:invokestatic    #111 <Method void o.e(String, String)>
		if(TextUtils.isEmpty(((CharSequence) (obj))))
	//* 555 1039:aload           13
	//* 556 1041:invokestatic    #426 <Method boolean TextUtils.isEmpty(CharSequence)>
	//* 557 1044:ifne            1050
	//* 558 1047:goto            1101
		{
			d(i1);
	//  559 1050:aload_0         
	//  560 1051:iload_2         
	//  561 1052:invokevirtual   #96  <Method void d(int)>
			return;
	//  562 1055:return          
		}
		  goto _L20
		wificonfig;
	//  563 1056:astore_1        
		i1 = -1;
	//  564 1057:iconst_m1       
	//  565 1058:istore_2        
		  goto _L3
	//* 566 1059:goto            1195
_L4:
		obj2 = obj;
	//  567 1062:aload           13
	//  568 1064:astore          14
		d(9);
	//  569 1066:aload_0         
	//  570 1067:bipush          9
	//  571 1069:invokevirtual   #96  <Method void d(int)>
		if(TextUtils.isEmpty(((CharSequence) (obj)))) goto _L21; else goto _L20
	//  572 1072:aload           13
	//  573 1074:invokestatic    #426 <Method boolean TextUtils.isEmpty(CharSequence)>
	//  574 1077:ifne            1187
	//* 575 1080:goto            1101
_L5:
		obj2 = obj;
	//  576 1083:aload           13
	//  577 1085:astore          14
		d(7);
	//  578 1087:aload_0         
	//  579 1088:bipush          7
	//  580 1090:invokevirtual   #96  <Method void d(int)>
		if(TextUtils.isEmpty(((CharSequence) (obj)))) goto _L21; else goto _L20
	//  581 1093:aload           13
	//  582 1095:invokestatic    #426 <Method boolean TextUtils.isEmpty(CharSequence)>
	//  583 1098:ifne            1187
_L20:
		wificonfig = ((WifiConfig) (NetworkAddress.httpsNetworkAddressForHost(((String) (obj)))));
	//  584 1101:aload           13
	//  585 1103:invokestatic    #432 <Method NetworkAddress NetworkAddress.httpsNetworkAddressForHost(String)>
	//  586 1106:astore_1        
		robot.d().a(((NetworkAddress) (wificonfig)));
	//  587 1107:aload           18
	//  588 1109:invokevirtual   #435 <Method NetworkSettings Robot.d()>
	//  589 1112:aload_1         
	//  590 1113:invokevirtual   #440 <Method void NetworkSettings.a(NetworkAddress)>
		a(true);
	//  591 1116:aload_0         
	//  592 1117:iconst_1        
	//  593 1118:invokevirtual   #441 <Method void a(boolean)>
		return;
	//  594 1121:return          
		wificonfig;
	//  595 1122:astore_1        
_L6:
		obj2 = obj;
	//  596 1123:aload           13
	//  597 1125:astore          14
		j1 = k1;
	//  598 1127:iload           4
	//  599 1129:istore_3        
		h();
	//  600 1130:aload_0         
	//  601 1131:invokevirtual   #443 <Method void h()>
		obj2 = obj;
	//  602 1134:aload           13
	//  603 1136:astore          14
		j1 = k1;
	//  604 1138:iload           4
	//  605 1140:istore_3        
		if(p)
			break MISSING_BLOCK_LABEL_1164;
	//  606 1141:aload_0         
	//  607 1142:getfield        #445 <Field boolean p>
	//  608 1145:ifne            1164
		obj2 = obj;
	//  609 1148:aload           13
	//  610 1150:astore          14
		j1 = k1;
	//  611 1152:iload           4
	//  612 1154:istore_3        
		d(10);
	//  613 1155:aload_0         
	//  614 1156:bipush          10
	//  615 1158:invokevirtual   #96  <Method void d(int)>
		continue; /* Loop/switch isn't completed */
	//  616 1161:goto            1176
		obj2 = obj;
	//  617 1164:aload           13
	//  618 1166:astore          14
		j1 = k1;
	//  619 1168:iload           4
	//  620 1170:istore_3        
		a(((Exception) (wificonfig)));
	//  621 1171:aload_0         
	//  622 1172:aload_1         
	//  623 1173:invokespecial   #292 <Method void a(Exception)>
		if(TextUtils.isEmpty(((CharSequence) (obj)))) goto _L21; else goto _L20
	//  624 1176:aload           13
	//  625 1178:invokestatic    #426 <Method boolean TextUtils.isEmpty(CharSequence)>
	//  626 1181:ifne            1187
	//* 627 1184:goto            1101
_L21:
		return;
	//  628 1187:return          
		wificonfig;
	//  629 1188:astore_1        
		i1 = j1;
	//  630 1189:iload_3         
	//  631 1190:istore_2        
		obj = obj2;
	//  632 1191:aload           14
	//  633 1193:astore          13
_L3:
		if(!TextUtils.isEmpty(((CharSequence) (obj))))
	//* 634 1195:aload           13
	//* 635 1197:invokestatic    #426 <Method boolean TextUtils.isEmpty(CharSequence)>
	//* 636 1200:ifne            1228
		{
			obj = ((Object) (NetworkAddress.httpsNetworkAddressForHost(((String) (obj)))));
	//  637 1203:aload           13
	//  638 1205:invokestatic    #432 <Method NetworkAddress NetworkAddress.httpsNetworkAddressForHost(String)>
	//  639 1208:astore          13
			robot.d().a(((NetworkAddress) (obj)));
	//  640 1210:aload           18
	//  641 1212:invokevirtual   #435 <Method NetworkSettings Robot.d()>
	//  642 1215:aload           13
	//  643 1217:invokevirtual   #440 <Method void NetworkSettings.a(NetworkAddress)>
			a(true);
	//  644 1220:aload_0         
	//  645 1221:iconst_1        
	//  646 1222:invokevirtual   #441 <Method void a(boolean)>
		} else
	//* 647 1225:goto            1233
		{
			d(i1);
	//  648 1228:aload_0         
	//  649 1229:iload_2         
	//  650 1230:invokevirtual   #96  <Method void d(int)>
		}
		throw wificonfig;
	//  651 1233:aload_1         
	//  652 1234:athrow          
		wificonfig;
	//  653 1235:astore_1        
		j1 = l1;
	//  654 1236:iload           5
	//  655 1238:istore_3        
		if(true) goto _L5; else goto _L22
	//  656 1239:goto            1083
_L22:
		wificonfig;
	//  657 1242:astore_1        
		j1 = i2;
	//  658 1243:iload           6
	//  659 1245:istore_3        
		if(true) goto _L4; else goto _L23
	//  660 1246:goto            1062
_L23:
		wificonfig;
	//  661 1249:astore_1        
		obj = obj4;
	//  662 1250:aload           16
	//  663 1252:astore          13
		i1 = l1;
	//  664 1254:iload           5
	//  665 1256:istore_2        
		  goto _L15
	//* 666 1257:goto            226
		wificonfig;
	//  667 1260:astore_1        
		obj = obj5;
	//  668 1261:aload           17
	//  669 1263:astore          13
		i1 = i2;
	//  670 1265:iload           6
	//  671 1267:istore_2        
		  goto _L14
	//* 672 1268:goto            221
		Object obj1;
		obj1;
	//  673 1271:astore          13
		  goto _L24
	//* 674 1273:goto            776
		obj1;
	//  675 1276:astore          13
		  goto _L25
	//* 676 1278:goto            770
		j2 = 0;
	//  677 1281:iconst_0        
	//  678 1282:istore          7
		  goto _L26
	//* 679 1284:goto            623
	}

	void c()
	{
		Object obj2 = ((Object) (com.irobot.home.util.j.o(c)));
	//    0    0:aload_0         
	//    1    1:getfield        #266 <Field String c>
	//    2    4:invokestatic    #303 <Method Robot j.o(String)>
	//    3    7:astore          4
		if(obj2 == null || !isAdded()) goto _L2; else goto _L1
	//    4    9:aload           4
	//    5   11:ifnull          607
	//    6   14:aload_0         
	//    7   15:invokevirtual   #123 <Method boolean isAdded()>
	//    8   18:ifeq            607
_L1:
		int i1;
		boolean flag;
		Object obj;
		if(getActivity() == null)
	//*   9   21:aload_0         
	//*  10   22:invokevirtual   #131 <Method Activity getActivity()>
	//*  11   25:ifnonnull       29
			return;
	//   12   28:return          
		Object obj3 = ((Object) ((WifiManager)b.getApplicationContext().getSystemService("wifi")));
	//   13   29:aload_0         
	//   14   30:getfield        #447 <Field IRobotApplication b>
	//   15   33:invokevirtual   #453 <Method Context IRobotApplication.getApplicationContext()>
	//   16   36:ldc2            #455 <String "wifi">
	//   17   39:invokevirtual   #461 <Method Object Context.getSystemService(String)>
	//   18   42:checkcast       #463 <Class WifiManager>
	//   19   45:astore          5
		obj = ((Object) (com.irobot.home.o.a.a(c)));
	//   20   47:aload_0         
	//   21   48:getfield        #266 <Field String c>
	//   22   51:invokestatic    #269 <Method a a.a(String)>
	//   23   54:astore_3        
		i1 = 1;
	//   24   55:iconst_1        
	//   25   56:istore_1        
		((com.irobot.home.o.a) (obj)).a(true);
	//   26   57:aload_3         
	//   27   58:iconst_1        
	//   28   59:invokevirtual   #464 <Method void a.a(boolean)>
		if(obj == null)
	//*  29   62:aload_3         
	//*  30   63:ifnonnull       101
		{
			obj = ((Object) (new StringBuilder()));
	//   31   66:new             #152 <Class StringBuilder>
	//   32   69:dup             
	//   33   70:invokespecial   #153 <Method void StringBuilder()>
	//   34   73:astore_3        
			((StringBuilder) (obj)).append("Null robot client encountered in background task ");
	//   35   74:aload_3         
	//   36   75:ldc2            #466 <String "Null robot client encountered in background task ">
	//   37   78:invokevirtual   #159 <Method StringBuilder StringBuilder.append(String)>
	//   38   81:pop             
			((StringBuilder) (obj)).append(c);
	//   39   82:aload_3         
	//   40   83:aload_0         
	//   41   84:getfield        #266 <Field String c>
	//   42   87:invokevirtual   #159 <Method StringBuilder StringBuilder.append(String)>
	//   43   90:pop             
			com.irobot.home.util.o.e("SetupNetworkFragment", ((StringBuilder) (obj)).toString());
	//   44   91:ldc1            #107 <String "SetupNetworkFragment">
	//   45   93:aload_3         
	//   46   94:invokevirtual   #166 <Method String StringBuilder.toString()>
	//   47   97:invokestatic    #111 <Method void o.e(String, String)>
			return;
	//   48  100:return          
		}
		obj3 = ((Object) (((WifiManager) (obj3)).getDhcpInfo()));
	//   49  101:aload           5
	//   50  103:invokevirtual   #470 <Method DhcpInfo WifiManager.getDhcpInfo()>
	//   51  106:astore          5
		if(obj3 != null && e.a())
	//*  52  108:aload           5
	//*  53  110:ifnull          183
	//*  54  113:aload_0         
	//*  55  114:getfield        #472 <Field WifiConfig e>
	//*  56  117:invokevirtual   #476 <Method boolean WifiConfig.a()>
	//*  57  120:ifeq            183
		{
			e.b(((DhcpInfo) (obj3)).ipAddress);
	//   58  123:aload_0         
	//   59  124:getfield        #472 <Field WifiConfig e>
	//   60  127:aload           5
	//   61  129:getfield        #482 <Field int DhcpInfo.ipAddress>
	//   62  132:invokevirtual   #483 <Method void WifiConfig.b(int)>
			e.c(((DhcpInfo) (obj3)).netmask);
	//   63  135:aload_0         
	//   64  136:getfield        #472 <Field WifiConfig e>
	//   65  139:aload           5
	//   66  141:getfield        #486 <Field int DhcpInfo.netmask>
	//   67  144:invokevirtual   #488 <Method void WifiConfig.c(int)>
			e.d(((DhcpInfo) (obj3)).gateway);
	//   68  147:aload_0         
	//   69  148:getfield        #472 <Field WifiConfig e>
	//   70  151:aload           5
	//   71  153:getfield        #491 <Field int DhcpInfo.gateway>
	//   72  156:invokevirtual   #492 <Method void WifiConfig.d(int)>
			e.e(((DhcpInfo) (obj3)).dns1);
	//   73  159:aload_0         
	//   74  160:getfield        #472 <Field WifiConfig e>
	//   75  163:aload           5
	//   76  165:getfield        #495 <Field int DhcpInfo.dns1>
	//   77  168:invokevirtual   #497 <Method void WifiConfig.e(int)>
			e.f(((DhcpInfo) (obj3)).dns2);
	//   78  171:aload_0         
	//   79  172:getfield        #472 <Field WifiConfig e>
	//   80  175:aload           5
	//   81  177:getfield        #500 <Field int DhcpInfo.dns2>
	//   82  180:invokevirtual   #502 <Method void WifiConfig.f(int)>
		}
		((Robot) (obj2)).d().a(NetworkAddress.httpsNetworkAddressForDefaultGateway());
	//   83  183:aload           4
	//   84  185:invokevirtual   #435 <Method NetworkSettings Robot.d()>
	//   85  188:invokestatic    #506 <Method NetworkAddress NetworkAddress.httpsNetworkAddressForDefaultGateway()>
	//   86  191:invokevirtual   #440 <Method void NetworkSettings.a(NetworkAddress)>
		flag = false;
	//   87  194:iconst_0        
	//   88  195:istore_2        
		if(!f) goto _L4; else goto _L3
	//   89  196:aload_0         
	//   90  197:getfield        #127 <Field boolean f>
	//   91  200:ifeq            480
_L3:
		Object obj4;
		Object obj5;
		com.irobot.home.util.o.c("*** PROVISIONING ***", "Start: Option B");
	//   92  203:ldc1            #62  <String "*** PROVISIONING ***">
	//   93  205:ldc2            #508 <String "Start: Option B">
	//   94  208:invokestatic    #69  <Method void o.c(String, String)>
		b(0x7f0f04ba);
	//   95  211:aload_0         
	//   96  212:ldc2            #509 <Int 0x7f0f04ba>
	//   97  215:invokevirtual   #231 <Method void b(int)>
		com.irobot.home.util.o.c("*** PROVISIONING ***", "UMI: get_sys");
	//   98  218:ldc1            #62  <String "*** PROVISIONING ***">
	//   99  220:ldc2            #511 <String "UMI: get_sys">
	//  100  223:invokestatic    #69  <Method void o.c(String, String)>
		obj4 = ((Object) (((com.irobot.home.o.a) (obj)).c()));
	//  101  226:aload_3         
	//  102  227:invokevirtual   #300 <Method RobotSystem a.c()>
	//  103  230:astore          5
		obj5 = ((Object) (b.h().c()));
	//  104  232:aload_0         
	//  105  233:getfield        #447 <Field IRobotApplication b>
	//  106  236:invokevirtual   #514 <Method IRobotModel IRobotApplication.h()>
	//  107  239:invokevirtual   #519 <Method com.irobot.home.model.a IRobotModel.c()>
	//  108  242:astore          6
		if(obj5 != null) goto _L6; else goto _L5
	//  109  244:aload           6
	//  110  246:ifnonnull       268
_L5:
		com.irobot.home.util.o.e("SetupNetworkFragment", "checkConnection: Not connected to a robot SoftAP!");
	//  111  249:ldc1            #107 <String "SetupNetworkFragment">
	//  112  251:ldc2            #521 <String "checkConnection: Not connected to a robot SoftAP!">
	//  113  254:invokestatic    #111 <Method void o.e(String, String)>
		d(10);
	//  114  257:aload_0         
	//  115  258:bipush          10
	//  116  260:invokevirtual   #96  <Method void d(int)>
		i1 = 0;
	//  117  263:iconst_0        
	//  118  264:istore_1        
		  goto _L7
	//* 119  265:goto            616
_L6:
		obj5 = ((Object) (((com.irobot.home.model.a) (obj5)).b().getId().toUpperCase(Locale.US)));
	//  120  268:aload           6
	//  121  270:invokevirtual   #526 <Method AssetId com.irobot.home.model.a.b()>
	//  122  273:invokevirtual   #531 <Method String AssetId.getId()>
	//  123  276:getstatic       #185 <Field Locale Locale.US>
	//  124  279:invokevirtual   #535 <Method String String.toUpperCase(Locale)>
	//  125  282:astore          6
		if(!((String) (obj5)).equals(((Object) (((RobotSystem) (obj4)).a()))))
	//* 126  284:aload           6
	//* 127  286:aload           5
	//* 128  288:invokevirtual   #537 <Method String RobotSystem.a()>
	//* 129  291:invokevirtual   #541 <Method boolean String.equals(Object)>
	//* 130  294:ifne            380
		{
			com.irobot.home.util.o.e("SetupNetworkFragment", "Robot BLID from SoftAP SSID does not match BLID returned by get_sys!");
	//  131  297:ldc1            #107 <String "SetupNetworkFragment">
	//  132  299:ldc2            #543 <String "Robot BLID from SoftAP SSID does not match BLID returned by get_sys!">
	//  133  302:invokestatic    #111 <Method void o.e(String, String)>
			StringBuilder stringbuilder = new StringBuilder();
	//  134  305:new             #152 <Class StringBuilder>
	//  135  308:dup             
	//  136  309:invokespecial   #153 <Method void StringBuilder()>
	//  137  312:astore          7
			stringbuilder.append("SSID BLID: ");
	//  138  314:aload           7
	//  139  316:ldc2            #545 <String "SSID BLID: ">
	//  140  319:invokevirtual   #159 <Method StringBuilder StringBuilder.append(String)>
	//  141  322:pop             
			stringbuilder.append(((String) (obj5)));
	//  142  323:aload           7
	//  143  325:aload           6
	//  144  327:invokevirtual   #159 <Method StringBuilder StringBuilder.append(String)>
	//  145  330:pop             
			com.irobot.home.util.o.e("SetupNetworkFragment", stringbuilder.toString());
	//  146  331:ldc1            #107 <String "SetupNetworkFragment">
	//  147  333:aload           7
	//  148  335:invokevirtual   #166 <Method String StringBuilder.toString()>
	//  149  338:invokestatic    #111 <Method void o.e(String, String)>
			obj5 = ((Object) (new StringBuilder()));
	//  150  341:new             #152 <Class StringBuilder>
	//  151  344:dup             
	//  152  345:invokespecial   #153 <Method void StringBuilder()>
	//  153  348:astore          6
			((StringBuilder) (obj5)).append("get_sys BLID: ");
	//  154  350:aload           6
	//  155  352:ldc2            #547 <String "get_sys BLID: ">
	//  156  355:invokevirtual   #159 <Method StringBuilder StringBuilder.append(String)>
	//  157  358:pop             
			((StringBuilder) (obj5)).append(((RobotSystem) (obj4)).a());
	//  158  359:aload           6
	//  159  361:aload           5
	//  160  363:invokevirtual   #537 <Method String RobotSystem.a()>
	//  161  366:invokevirtual   #159 <Method StringBuilder StringBuilder.append(String)>
	//  162  369:pop             
			com.irobot.home.util.o.e("SetupNetworkFragment", ((StringBuilder) (obj5)).toString());
	//  163  370:ldc1            #107 <String "SetupNetworkFragment">
	//  164  372:aload           6
	//  165  374:invokevirtual   #166 <Method String StringBuilder.toString()>
	//  166  377:invokestatic    #111 <Method void o.e(String, String)>
		}
		((Robot) (obj2)).a.a(((RobotSystem) (obj4)));
	//  167  380:aload           4
	//  168  382:getfield        #308 <Field RobotSystem Robot.a>
	//  169  385:aload           5
	//  170  387:invokevirtual   #313 <Method void RobotSystem.a(RobotSystem)>
		com.irobot.home.util.o.c("*** PROVISIONING ***", "UMI: set_passwd");
	//  171  390:ldc1            #62  <String "*** PROVISIONING ***">
	//  172  392:ldc2            #549 <String "UMI: set_passwd">
	//  173  395:invokestatic    #69  <Method void o.c(String, String)>
		((com.irobot.home.o.a) (obj)).e();
	//  174  398:aload_3         
	//  175  399:invokevirtual   #550 <Method void a.e()>
		com.irobot.home.util.o.c("*** PROVISIONING ***", "********* UMI: set_cloudcfg");
	//  176  402:ldc1            #62  <String "*** PROVISIONING ***">
	//  177  404:ldc2            #552 <String "********* UMI: set_cloudcfg">
	//  178  407:invokestatic    #69  <Method void o.c(String, String)>
		obj2 = ((Object) (new CloudConfig()));
	//  179  410:new             #554 <Class CloudConfig>
	//  180  413:dup             
	//  181  414:invokespecial   #555 <Method void CloudConfig()>
	//  182  417:astore          4
		((CloudConfig) (obj2)).a(com.irobot.home.util.j.p());
	//  183  419:aload           4
	//  184  421:invokestatic    #557 <Method String j.p()>
	//  185  424:invokevirtual   #558 <Method void CloudConfig.a(String)>
		obj4 = ((Object) (new StringBuilder()));
	//  186  427:new             #152 <Class StringBuilder>
	//  187  430:dup             
	//  188  431:invokespecial   #153 <Method void StringBuilder()>
	//  189  434:astore          5
		((StringBuilder) (obj4)).append(((CloudConfig) (obj2)).a());
	//  190  436:aload           5
	//  191  438:aload           4
	//  192  440:invokevirtual   #559 <Method String CloudConfig.a()>
	//  193  443:invokevirtual   #159 <Method StringBuilder StringBuilder.append(String)>
	//  194  446:pop             
		((StringBuilder) (obj4)).append("/ammp/");
	//  195  447:aload           5
	//  196  449:ldc2            #561 <String "/ammp/">
	//  197  452:invokevirtual   #159 <Method StringBuilder StringBuilder.append(String)>
	//  198  455:pop             
		((com.irobot.home.o.a) (obj)).c(((StringBuilder) (obj4)).toString());
	//  199  456:aload_3         
	//  200  457:aload           5
	//  201  459:invokevirtual   #166 <Method String StringBuilder.toString()>
	//  202  462:invokevirtual   #562 <Method void a.c(String)>
		com.irobot.home.util.o.c("*** PROVISIONING ***", "UMI: get_prefs");
	//  203  465:ldc1            #62  <String "*** PROVISIONING ***">
	//  204  467:ldc2            #564 <String "UMI: get_prefs">
	//  205  470:invokestatic    #69  <Method void o.c(String, String)>
		((com.irobot.home.o.a) (obj)).f();
	//  206  473:aload_3         
	//  207  474:invokevirtual   #565 <Method void a.f()>
		  goto _L7
	//* 208  477:goto            616
_L4:
		if(!g) goto _L9; else goto _L8
	//  209  480:aload_0         
	//  210  481:getfield        #567 <Field boolean g>
	//  211  484:ifeq            563
_L8:
		com.irobot.home.util.o.c("*** PROVISIONING ***", "Start: Option A+");
	//  212  487:ldc1            #62  <String "*** PROVISIONING ***">
	//  213  489:ldc2            #569 <String "Start: Option A+">
	//  214  492:invokestatic    #69  <Method void o.c(String, String)>
		com.irobot.home.util.o.c("*** PROVISIONING ***", "UMI: get_wllaststat");
	//  215  495:ldc1            #62  <String "*** PROVISIONING ***">
	//  216  497:ldc2            #571 <String "UMI: get_wllaststat">
	//  217  500:invokestatic    #69  <Method void o.c(String, String)>
		obj = ((Object) (((com.irobot.home.o.a) (obj)).b("wllaststat")));
	//  218  503:aload_3         
	//  219  504:ldc2            #573 <String "wllaststat">
	//  220  507:invokevirtual   #76  <Method JSONObject a.b(String)>
	//  221  510:astore_3        
		if(!((JSONObject) (obj)).has("ok")) goto _L9; else goto _L10
	//  222  511:aload_3         
	//  223  512:ldc1            #78  <String "ok">
	//  224  514:invokevirtual   #84  <Method boolean JSONObject.has(String)>
	//  225  517:ifeq            563
_L10:
		i1 = ((JSONObject) (obj)).getJSONObject("ok").getInt("station");
	//  226  520:aload_3         
	//  227  521:ldc1            #78  <String "ok">
	//  228  523:invokevirtual   #87  <Method JSONObject JSONObject.getJSONObject(String)>
	//  229  526:ldc2            #368 <String "station">
	//  230  529:invokevirtual   #372 <Method int JSONObject.getInt(String)>
	//  231  532:istore_1        
		if(i1 == ac.IDLE.ordinal() || i1 == ac.OK.ordinal()) goto _L9; else goto _L11
	//  232  533:iload_1         
	//  233  534:getstatic       #378 <Field ac ac.IDLE>
	//  234  537:invokevirtual   #382 <Method int ac.ordinal()>
	//  235  540:icmpeq          563
	//  236  543:iload_1         
	//  237  544:getstatic       #399 <Field ac ac.OK>
	//  238  547:invokevirtual   #382 <Method int ac.ordinal()>
	//  239  550:icmpeq          563
_L11:
		c(i1);
	//  240  553:aload_0         
	//  241  554:iload_1         
	//  242  555:invokevirtual   #574 <Method void c(int)>
		i1 = ((int) (flag));
	//  243  558:iload_2         
	//  244  559:istore_1        
		  goto _L7
	//* 245  560:goto            595
_L9:
		i1 = 1;
	//  246  563:iconst_1        
	//  247  564:istore_1        
		  goto _L7
	//* 248  565:goto            595
_L16:
		i1 = 9;
	//  249  568:bipush          9
	//  250  570:istore_1        
		  goto _L12
	//* 251  571:goto            577
_L14:
		i1 = 7;
	//  252  574:bipush          7
	//  253  576:istore_1        
_L12:
		d(i1);
	//  254  577:aload_0         
	//  255  578:iload_1         
	//  256  579:invokevirtual   #96  <Method void d(int)>
		i1 = ((int) (flag));
	//  257  582:iload_2         
	//  258  583:istore_1        
		  goto _L7
	//* 259  584:goto            595
		Object obj1;
		obj1;
	//  260  587:astore_3        
		a(((Exception) (obj1)));
	//  261  588:aload_0         
	//  262  589:aload_3         
	//  263  590:invokespecial   #292 <Method void a(Exception)>
		i1 = ((int) (flag));
	//  264  593:iload_2         
	//  265  594:istore_1        
_L7:
		if(i1 != 0)
	//* 266  595:iload_1         
	//* 267  596:ifeq            607
			c(e);
	//  268  599:aload_0         
	//  269  600:aload_0         
	//  270  601:getfield        #472 <Field WifiConfig e>
	//  271  604:invokevirtual   #576 <Method void c(WifiConfig)>
_L2:
		return;
	//  272  607:return          
		obj1;
	//  273  608:astore_3        
		if(true) goto _L14; else goto _L13
	//  274  609:goto            574
_L13:
		obj1;
	//  275  612:astore_3        
		if(true) goto _L16; else goto _L15
_L15:
	//* 276  613:goto            568
	//* 277  616:goto            595
	}

	void c(int i1)
	{
		if(i1 == ac.ERR_AUTH.ordinal())
	//*   0    0:iload_1         
	//*   1    1:getstatic       #579 <Field ac ac.ERR_AUTH>
	//*   2    4:invokevirtual   #382 <Method int ac.ordinal()>
	//*   3    7:icmpne          18
			i1 = 3;
	//    4   10:iconst_3        
	//    5   11:istore_1        
		else
	//*   6   12:aload_0         
	//*   7   13:iload_1         
	//*   8   14:invokevirtual   #96  <Method void d(int)>
	//*   9   17:return          
		if(i1 == ac.ERR_NETWORK.ordinal())
	//*  10   18:iload_1         
	//*  11   19:getstatic       #582 <Field ac ac.ERR_NETWORK>
	//*  12   22:invokevirtual   #382 <Method int ac.ordinal()>
	//*  13   25:icmpne          34
			i1 = 12;
	//   14   28:bipush          12
	//   15   30:istore_1        
		else
	//*  16   31:goto            12
		if(i1 == ac.ERR_DHCP.ordinal())
	//*  17   34:iload_1         
	//*  18   35:getstatic       #585 <Field ac ac.ERR_DHCP>
	//*  19   38:invokevirtual   #382 <Method int ac.ordinal()>
	//*  20   41:icmpne          49
			i1 = 4;
	//   21   44:iconst_4        
	//   22   45:istore_1        
		else
	//*  23   46:goto            12
		if(i1 == ac.ERR_LINK.ordinal())
	//*  24   49:iload_1         
	//*  25   50:getstatic       #588 <Field ac ac.ERR_LINK>
	//*  26   53:invokevirtual   #382 <Method int ac.ordinal()>
	//*  27   56:icmpne          65
			i1 = 13;
	//   28   59:bipush          13
	//   29   61:istore_1        
		else
	//*  30   62:goto            12
			i1 = 15;
	//   31   65:bipush          15
	//   32   67:istore_1        
		d(i1);
	//*  33   68:goto            12
	}

	void c(WifiConfig wificonfig)
	{
		if(!isAdded())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #123 <Method boolean isAdded()>
	//*   2    4:ifne            8
			return;
	//    3    7:return          
		if(f)
	//*   4    8:aload_0         
	//*   5    9:getfield        #127 <Field boolean f>
	//*   6   12:ifeq            21
		{
			a(wificonfig);
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:invokevirtual   #589 <Method void a(WifiConfig)>
			return;
	//   10   20:return          
		} else
		{
			b(wificonfig);
	//   11   21:aload_0         
	//   12   22:aload_1         
	//   13   23:invokevirtual   #591 <Method void b(WifiConfig)>
			return;
	//   14   26:return          
		}
	}

	public void d()
	{
		if(!isAdded())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #123 <Method boolean isAdded()>
	//*   2    4:ifne            8
		{
			return;
	//    3    7:return          
		} else
		{
			com.irobot.home.util.j.a((WifiManager)b.getApplicationContext().getSystemService("wifi"), d);
	//    4    8:aload_0         
	//    5    9:getfield        #447 <Field IRobotApplication b>
	//    6   12:invokevirtual   #453 <Method Context IRobotApplication.getApplicationContext()>
	//    7   15:ldc2            #455 <String "wifi">
	//    8   18:invokevirtual   #461 <Method Object Context.getSystemService(String)>
	//    9   21:checkcast       #463 <Class WifiManager>
	//   10   24:aload_0         
	//   11   25:getfield        #168 <Field WifiInfo d>
	//   12   28:invokestatic    #594 <Method void j.a(WifiManager, WifiInfo)>
			return;
	//   13   31:return          
		}
	}

	void d(int i1)
	{
		if(!isAdded())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #123 <Method boolean isAdded()>
	//*   2    4:ifne            16
		{
			com.irobot.home.util.o.e("SetupNetworkFragment", "Not attached to activity. Not showing alert.");
	//    3    7:ldc1            #107 <String "SetupNetworkFragment">
	//    4    9:ldc2            #596 <String "Not attached to activity. Not showing alert.">
	//    5   12:invokestatic    #111 <Method void o.e(String, String)>
			return;
	//    6   15:return          
		} else
		{
			k.a(i1);
	//    7   16:aload_0         
	//    8   17:getfield        #58  <Field bu$b k>
	//    9   20:iload_1         
	//   10   21:invokeinterface #598 <Method void com.irobot.home.fragments.bu$b.a(int)>
			return;
	//   11   26:return          
		}
	}

	public void e()
	{
		com.irobot.home.util.o.c("*** PROVISIONING ***", "Continue: Option B");
	//    0    0:ldc1            #62  <String "*** PROVISIONING ***">
	//    1    2:ldc2            #600 <String "Continue: Option B">
	//    2    5:invokestatic    #69  <Method void o.c(String, String)>
		l = new c();
	//    3    8:aload_0         
	//    4    9:new             #18  <Class bu$c>
	//    5   12:dup             
	//    6   13:aload_0         
	//    7   14:invokespecial   #601 <Method void bu$c(bu)>
	//    8   17:putfield        #125 <Field bu$c l>
		i();
	//    9   20:aload_0         
	//   10   21:invokespecial   #603 <Method void i()>
		if(!h) goto _L2; else goto _L1
	//   11   24:aload_0         
	//   12   25:getfield        #242 <Field boolean h>
	//   13   28:ifeq            45
_L1:
		b(0x7f0f04bc);
	//   14   31:aload_0         
	//   15   32:ldc2            #275 <Int 0x7f0f04bc>
	//   16   35:invokevirtual   #231 <Method void b(int)>
		h();
	//   17   38:aload_0         
	//   18   39:invokevirtual   #443 <Method void h()>
		  goto _L3
	//*  19   42:goto            222
_L2:
		d();
	//   20   45:aload_0         
	//   21   46:invokevirtual   #412 <Method void d()>
		  goto _L3
	//*  22   49:goto            222
_L7:
		int i1;
		if(n || i1 >= 10)
			break MISSING_BLOCK_LABEL_89;
	//   23   52:aload_0         
	//   24   53:getfield        #49  <Field boolean n>
	//   25   56:ifne            89
	//   26   59:iload_1         
	//   27   60:bipush          10
	//   28   62:icmpge          89
		a(0x7f0f04bd, k());
	//   29   65:aload_0         
	//   30   66:ldc2            #392 <Int 0x7f0f04bd>
	//   31   69:aload_0         
	//   32   70:invokespecial   #394 <Method String k()>
	//   33   73:invokevirtual   #396 <Method void a(int, String)>
		Thread.sleep(3000L);
	//   34   76:ldc2w           #316 <Long 3000L>
	//   35   79:invokestatic    #119 <Method void Thread.sleep(long)>
		i1++;
	//   36   82:iload_1         
	//   37   83:iconst_1        
	//   38   84:iadd            
	//   39   85:istore_1        
		continue; /* Loop/switch isn't completed */
	//   40   86:goto            52
		j();
	//   41   89:aload_0         
	//   42   90:invokespecial   #356 <Method void j()>
		if(!n)
			break MISSING_BLOCK_LABEL_208;
	//   43   93:aload_0         
	//   44   94:getfield        #49  <Field boolean n>
	//   45   97:ifeq            208
		com.irobot.home.util.o.c("*** PROVISIONING ***", "Connected to provisioning network");
	//   46  100:ldc1            #62  <String "*** PROVISIONING ***">
	//   47  102:ldc2            #605 <String "Connected to provisioning network">
	//   48  105:invokestatic    #69  <Method void o.c(String, String)>
		q = new com.irobot.home.h.i(((com.irobot.home.h.i.a) (this)), c, 30000);
	//   49  108:aload_0         
	//   50  109:new             #607 <Class com.irobot.home.h.i>
	//   51  112:dup             
	//   52  113:aload_0         
	//   53  114:aload_0         
	//   54  115:getfield        #266 <Field String c>
	//   55  118:sipush          30000
	//   56  121:invokespecial   #610 <Method void com.irobot.home.h.i(com.irobot.home.h.i$a, String, int)>
	//   57  124:putfield        #612 <Field com.irobot.home.h.i q>
		q.a();
	//   58  127:aload_0         
	//   59  128:getfield        #612 <Field com.irobot.home.h.i q>
	//   60  131:invokevirtual   #613 <Method void com.irobot.home.h.i.a()>
		i1 = 0;
	//   61  134:iconst_0        
	//   62  135:istore_1        
_L5:
		if(o || i1 >= 10)
			break; /* Loop/switch isn't completed */
	//   63  136:aload_0         
	//   64  137:getfield        #51  <Field boolean o>
	//   65  140:ifne            180
	//   66  143:iload_1         
	//   67  144:bipush          10
	//   68  146:icmpge          180
		if(r)
			break; /* Loop/switch isn't completed */
	//   69  149:aload_0         
	//   70  150:getfield        #53  <Field boolean r>
	//   71  153:ifne            180
		a(0x7f0f04bd, k());
	//   72  156:aload_0         
	//   73  157:ldc2            #392 <Int 0x7f0f04bd>
	//   74  160:aload_0         
	//   75  161:invokespecial   #394 <Method String k()>
	//   76  164:invokevirtual   #396 <Method void a(int, String)>
		Thread.sleep(3000L);
	//   77  167:ldc2w           #316 <Long 3000L>
	//   78  170:invokestatic    #119 <Method void Thread.sleep(long)>
		i1++;
	//   79  173:iload_1         
	//   80  174:iconst_1        
	//   81  175:iadd            
	//   82  176:istore_1        
		if(true) goto _L5; else goto _L4
	//   83  177:goto            136
_L4:
		if(o)
	//*  84  180:aload_0         
	//*  85  181:getfield        #51  <Field boolean o>
	//*  86  184:ifeq            201
		{
			com.irobot.home.util.o.c("*** PROVISIONING ***", "Provisioning robot found");
	//   87  187:ldc1            #62  <String "*** PROVISIONING ***">
	//   88  189:ldc2            #615 <String "Provisioning robot found">
	//   89  192:invokestatic    #69  <Method void o.c(String, String)>
			a(false);
	//   90  195:aload_0         
	//   91  196:iconst_0        
	//   92  197:invokevirtual   #441 <Method void a(boolean)>
			return;
	//   93  200:return          
		}
		try
		{
			d(14);
	//   94  201:aload_0         
	//   95  202:bipush          14
	//   96  204:invokevirtual   #96  <Method void d(int)>
			return;
	//   97  207:return          
		}
	//*  98  208:aload_0         
	//*  99  209:bipush          11
	//* 100  211:invokevirtual   #96  <Method void d(int)>
	//* 101  214:return          
		catch(InterruptedException interruptedexception)
	//* 102  215:astore_2        
		{
			a(((Exception) (interruptedexception)));
	//  103  216:aload_0         
	//  104  217:aload_2         
	//  105  218:invokespecial   #292 <Method void a(Exception)>
		}
		break MISSING_BLOCK_LABEL_221;
		d(11);
		return;
		return;
	//  106  221:return          
_L3:
		i1 = 0;
	//  107  222:iconst_0        
	//  108  223:istore_1        
		if(true) goto _L7; else goto _L6
	//  109  224:goto            52
_L6:
	}

	public void f()
	{
		Object obj = ((Object) (com.irobot.home.o.a.a(c)));
	//    0    0:aload_0         
	//    1    1:getfield        #266 <Field String c>
	//    2    4:invokestatic    #269 <Method a a.a(String)>
	//    3    7:astore_1        
		try
		{
			Object obj1 = ((Object) (((com.irobot.home.o.a) (obj)).b()));
	//    4    8:aload_1         
	//    5    9:invokevirtual   #618 <Method CloudConfig a.b()>
	//    6   12:astore_2        
			com.irobot.home.util.o.c("*** PROVISIONING ***", "UMI: get_cloudcfg");
	//    7   13:ldc1            #62  <String "*** PROVISIONING ***">
	//    8   15:ldc2            #620 <String "UMI: get_cloudcfg">
	//    9   18:invokestatic    #69  <Method void o.c(String, String)>
			obj = ((Object) (com.irobot.home.util.j.o(c)));
	//   10   21:aload_0         
	//   11   22:getfield        #266 <Field String c>
	//   12   25:invokestatic    #303 <Method Robot j.o(String)>
	//   13   28:astore_1        
			((Robot) (obj)).p().a(((CloudConfig) (obj1)));
	//   14   29:aload_1         
	//   15   30:invokevirtual   #622 <Method CloudConfig Robot.p()>
	//   16   33:aload_2         
	//   17   34:invokevirtual   #625 <Method void CloudConfig.a(CloudConfig)>
			obj1 = ((Object) (new StringBuilder()));
	//   18   37:new             #152 <Class StringBuilder>
	//   19   40:dup             
	//   20   41:invokespecial   #153 <Method void StringBuilder()>
	//   21   44:astore_2        
			((StringBuilder) (obj1)).append("Cloud URL: ");
	//   22   45:aload_2         
	//   23   46:ldc2            #627 <String "Cloud URL: ">
	//   24   49:invokevirtual   #159 <Method StringBuilder StringBuilder.append(String)>
	//   25   52:pop             
			((StringBuilder) (obj1)).append(((Robot) (obj)).p().a());
	//   26   53:aload_2         
	//   27   54:aload_1         
	//   28   55:invokevirtual   #622 <Method CloudConfig Robot.p()>
	//   29   58:invokevirtual   #559 <Method String CloudConfig.a()>
	//   30   61:invokevirtual   #159 <Method StringBuilder StringBuilder.append(String)>
	//   31   64:pop             
			com.irobot.home.util.o.b("SetupNetworkFragment", ((StringBuilder) (obj1)).toString());
	//   32   65:ldc1            #107 <String "SetupNetworkFragment">
	//   33   67:aload_2         
	//   34   68:invokevirtual   #166 <Method String StringBuilder.toString()>
	//   35   71:invokestatic    #410 <Method void o.b(String, String)>
			return;
	//   36   74:return          
		}
		catch(Exception exception)
	//*  37   75:astore_1        
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   38   76:new             #152 <Class StringBuilder>
	//   39   79:dup             
	//   40   80:invokespecial   #153 <Method void StringBuilder()>
	//   41   83:astore_2        
			stringbuilder.append("Failed to get cloud URL from the robot. ");
	//   42   84:aload_2         
	//   43   85:ldc2            #629 <String "Failed to get cloud URL from the robot. ">
	//   44   88:invokevirtual   #159 <Method StringBuilder StringBuilder.append(String)>
	//   45   91:pop             
			stringbuilder.append(exception.getMessage());
	//   46   92:aload_2         
	//   47   93:aload_1         
	//   48   94:invokevirtual   #630 <Method String Exception.getMessage()>
	//   49   97:invokevirtual   #159 <Method StringBuilder StringBuilder.append(String)>
	//   50  100:pop             
			com.irobot.home.util.o.e("SetupNetworkFragment", stringbuilder.toString());
	//   51  101:ldc1            #107 <String "SetupNetworkFragment">
	//   52  103:aload_2         
	//   53  104:invokevirtual   #166 <Method String StringBuilder.toString()>
	//   54  107:invokestatic    #111 <Method void o.e(String, String)>
			return;
	//   55  110:return          
		}
	}

	void g()
	{
		com.irobot.home.util.o.b("SetupNetworkFragment", "Provisioning finished : done");
	//    0    0:ldc1            #107 <String "SetupNetworkFragment">
	//    1    2:ldc2            #632 <String "Provisioning finished : done">
	//    2    5:invokestatic    #410 <Method void o.b(String, String)>
		Object obj = ((Object) (b.h().d(c)));
	//    3    8:aload_0         
	//    4    9:getfield        #447 <Field IRobotApplication b>
	//    5   12:invokevirtual   #514 <Method IRobotModel IRobotApplication.h()>
	//    6   15:aload_0         
	//    7   16:getfield        #266 <Field String c>
	//    8   19:invokevirtual   #635 <Method com.irobot.home.model.a IRobotModel.d(String)>
	//    9   22:astore_1        
		b b1 = k;
	//   10   23:aload_0         
	//   11   24:getfield        #58  <Field bu$b k>
	//   12   27:astore_2        
		if(obj != null)
	//*  13   28:aload_1         
	//*  14   29:ifnull          43
			obj = ((Object) (((com.irobot.home.model.a) (obj)).a().getSku()));
	//   15   32:aload_1         
	//   16   33:invokevirtual   #638 <Method AssetInfo com.irobot.home.model.a.a()>
	//   17   36:invokevirtual   #643 <Method String AssetInfo.getSku()>
	//   18   39:astore_1        
		else
	//*  19   40:goto            47
			obj = "";
	//   20   43:ldc2            #359 <String "">
	//   21   46:astore_1        
		b1.a(((String) (obj)));
	//   22   47:aload_2         
	//   23   48:aload_1         
	//   24   49:invokeinterface #644 <Method void com.irobot.home.fragments.bu$b.a(String)>
	//   25   54:return          
	}

	public void h()
	{
		if(!isAdded())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #123 <Method boolean isAdded()>
	//*   2    4:ifne            8
			return;
	//    3    7:return          
		Object obj = ((Object) (((WifiManager)b.getApplicationContext().getSystemService("wifi")).getConnectionInfo()));
	//    4    8:aload_0         
	//    5    9:getfield        #447 <Field IRobotApplication b>
	//    6   12:invokevirtual   #453 <Method Context IRobotApplication.getApplicationContext()>
	//    7   15:ldc2            #455 <String "wifi">
	//    8   18:invokevirtual   #461 <Method Object Context.getSystemService(String)>
	//    9   21:checkcast       #463 <Class WifiManager>
	//   10   24:invokevirtual   #648 <Method WifiInfo WifiManager.getConnectionInfo()>
	//   11   27:astore_1        
		if(obj != null)
	//*  12   28:aload_1         
	//*  13   29:ifnull          114
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   14   32:new             #152 <Class StringBuilder>
	//   15   35:dup             
	//   16   36:invokespecial   #153 <Method void StringBuilder()>
	//   17   39:astore_2        
			stringbuilder.append("Connected to ");
	//   18   40:aload_2         
	//   19   41:ldc2            #650 <String "Connected to ">
	//   20   44:invokevirtual   #159 <Method StringBuilder StringBuilder.append(String)>
	//   21   47:pop             
			stringbuilder.append(((WifiInfo) (obj)).getSSID());
	//   22   48:aload_2         
	//   23   49:aload_1         
	//   24   50:invokevirtual   #173 <Method String WifiInfo.getSSID()>
	//   25   53:invokevirtual   #159 <Method StringBuilder StringBuilder.append(String)>
	//   26   56:pop             
			com.irobot.home.util.o.b("SetupNetworkFragment", stringbuilder.toString());
	//   27   57:ldc1            #107 <String "SetupNetworkFragment">
	//   28   59:aload_2         
	//   29   60:invokevirtual   #166 <Method String StringBuilder.toString()>
	//   30   63:invokestatic    #410 <Method void o.b(String, String)>
			obj = ((Object) (com.irobot.home.util.j.e(((WifiInfo) (obj)).getSSID())));
	//   31   66:aload_1         
	//   32   67:invokevirtual   #173 <Method String WifiInfo.getSSID()>
	//   33   70:invokestatic    #178 <Method String j.e(String)>
	//   34   73:astore_1        
			p = ((String) (obj)).contains(((CharSequence) (c)));
	//   35   74:aload_0         
	//   36   75:aload_1         
	//   37   76:aload_0         
	//   38   77:getfield        #266 <Field String c>
	//   39   80:invokevirtual   #653 <Method boolean String.contains(CharSequence)>
	//   40   83:putfield        #445 <Field boolean p>
			n = ((String) (obj)).equals(((Object) (k())));
	//   41   86:aload_0         
	//   42   87:aload_1         
	//   43   88:aload_0         
	//   44   89:invokespecial   #394 <Method String k()>
	//   45   92:invokevirtual   #541 <Method boolean String.equals(Object)>
	//   46   95:putfield        #49  <Field boolean n>
			if(n)
	//*  47   98:aload_0         
	//*  48   99:getfield        #49  <Field boolean n>
	//*  49  102:ifeq            114
			{
				j();
	//   50  105:aload_0         
	//   51  106:invokespecial   #356 <Method void j()>
				l = null;
	//   52  109:aload_0         
	//   53  110:aconst_null     
	//   54  111:putfield        #125 <Field bu$c l>
			}
		}
	//   55  114:return          
	}

	public void onDestroy()
	{
		com.irobot.home.util.o.b("SetupNetworkFragment", "Fragment destroyed.");
	//    0    0:ldc1            #107 <String "SetupNetworkFragment">
	//    1    2:ldc2            #656 <String "Fragment destroyed.">
	//    2    5:invokestatic    #410 <Method void o.b(String, String)>
		org.androidannotations.api.a.a("tryHailMaryRunning", true);
	//    3    8:ldc2            #658 <String "tryHailMaryRunning">
	//    4   11:iconst_1        
	//    5   12:invokestatic    #661 <Method void org.androidannotations.api.a.a(String, boolean)>
		org.androidannotations.api.a.a("continueHailMaryRunning", true);
	//    6   15:ldc2            #663 <String "continueHailMaryRunning">
	//    7   18:iconst_1        
	//    8   19:invokestatic    #661 <Method void org.androidannotations.api.a.a(String, boolean)>
		org.androidannotations.api.a.a("establishRobotCommsRunning", true);
	//    9   22:ldc2            #665 <String "establishRobotCommsRunning">
	//   10   25:iconst_1        
	//   11   26:invokestatic    #661 <Method void org.androidannotations.api.a.a(String, boolean)>
		org.androidannotations.api.a.a("tryDefaultWifiConfigRunning", true);
	//   12   29:ldc2            #667 <String "tryDefaultWifiConfigRunning">
	//   13   32:iconst_1        
	//   14   33:invokestatic    #661 <Method void org.androidannotations.api.a.a(String, boolean)>
		super.onDestroy();
	//   15   36:aload_0         
	//   16   37:invokespecial   #669 <Method void g.onDestroy()>
	//   17   40:return          
	}

	public void onPause()
	{
		j();
	//    0    0:aload_0         
	//    1    1:invokespecial   #356 <Method void j()>
		super.onPause();
	//    2    4:aload_0         
	//    3    5:invokespecial   #672 <Method void g.onPause()>
	//    4    8:return          
	}

	public void onResume()
	{
		super.onResume();
	//    0    0:aload_0         
	//    1    1:invokespecial   #675 <Method void g.onResume()>
		i();
	//    2    4:aload_0         
	//    3    5:invokespecial   #603 <Method void i()>
	//    4    8:return          
	}

	public void z()
	{
		o = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #51  <Field boolean o>
		b.h().d(com.irobot.home.util.j.a(c));
	//    3    5:aload_0         
	//    4    6:getfield        #447 <Field IRobotApplication b>
	//    5    9:invokevirtual   #514 <Method IRobotModel IRobotApplication.h()>
	//    6   12:aload_0         
	//    7   13:getfield        #266 <Field String c>
	//    8   16:invokestatic    #678 <Method com.irobot.home.model.a j.a(String)>
	//    9   19:invokevirtual   #681 <Method void IRobotModel.d(com.irobot.home.model.a)>
	//   10   22:return          
	}

	a a;
	IRobotApplication b;
	String c;
	WifiInfo d;
	WifiConfig e;
	boolean f;
	boolean g;
	boolean h;
	boolean i;
	CustomVideoView j;
	b k;
	private c l;
	private boolean n;
	private boolean o;
	private boolean p;
	private com.irobot.home.h.i q;
	private boolean r;
}

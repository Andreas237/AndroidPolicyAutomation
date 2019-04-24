// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.fragments;

import android.os.Bundle;
import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.irobot.core.NtpTimeCallback;
import com.irobot.home.model.WifiConfig;
import java.net.InetAddress;
import java.util.Date;
import org.androidannotations.api.c.a;
import org.androidannotations.api.c.b;
import org.androidannotations.api.c.c;

// Referenced classes of package com.irobot.home.fragments:
//			z, aa, y, o, 
//			RecyclerView

public final class aa extends z
	implements org.androidannotations.api.c.a, b
{
	public static class a extends org.androidannotations.api.a.c
	{

		public a a(WifiConfig wificonfig)
		{
			a.putParcelable("wifiSettings", ((android.os.Parcelable) (wificonfig)));
		//    0    0:aload_0         
		//    1    1:getfield        #17  <Field Bundle a>
		//    2    4:ldc1            #19  <String "wifiSettings">
		//    3    6:aload_1         
		//    4    7:invokevirtual   #25  <Method void Bundle.putParcelable(String, android.os.Parcelable)>
			return this;
		//    5   10:aload_0         
		//    6   11:areturn         
		}

		public a a(boolean flag)
		{
			a.putBoolean("isProvisioningFirstPass", flag);
		//    0    0:aload_0         
		//    1    1:getfield        #17  <Field Bundle a>
		//    2    4:ldc1            #28  <String "isProvisioningFirstPass">
		//    3    6:iload_1         
		//    4    7:invokevirtual   #32  <Method void Bundle.putBoolean(String, boolean)>
			return this;
		//    5   10:aload_0         
		//    6   11:areturn         
		}

		public z a()
		{
			aa aa1 = new aa();
		//    0    0:new             #7   <Class aa>
		//    1    3:dup             
		//    2    4:invokespecial   #34  <Method void aa()>
		//    3    7:astore_1        
			aa1.setArguments(a);
		//    4    8:aload_1         
		//    5    9:aload_0         
		//    6   10:getfield        #17  <Field Bundle a>
		//    7   13:invokevirtual   #38  <Method void aa.setArguments(Bundle)>
			return ((z) (aa1));
		//    8   16:aload_1         
		//    9   17:areturn         
		}

		public a b(boolean flag)
		{
			a.putBoolean("invalidPassword", flag);
		//    0    0:aload_0         
		//    1    1:getfield        #17  <Field Bundle a>
		//    2    4:ldc1            #41  <String "invalidPassword">
		//    3    6:iload_1         
		//    4    7:invokevirtual   #32  <Method void Bundle.putBoolean(String, boolean)>
			return this;
		//    5   10:aload_0         
		//    6   11:areturn         
		}

		public a c(boolean flag)
		{
			a.putBoolean("isNotPasswordProtected", flag);
		//    0    0:aload_0         
		//    1    1:getfield        #17  <Field Bundle a>
		//    2    4:ldc1            #44  <String "isNotPasswordProtected">
		//    3    6:iload_1         
		//    4    7:invokevirtual   #32  <Method void Bundle.putBoolean(String, boolean)>
			return this;
		//    5   10:aload_0         
		//    6   11:areturn         
		}

		public a d(boolean flag)
		{
			a.putBoolean("isNetworkSettingClickable", flag);
		//    0    0:aload_0         
		//    1    1:getfield        #17  <Field Bundle a>
		//    2    4:ldc1            #47  <String "isNetworkSettingClickable">
		//    3    6:iload_1         
		//    4    7:invokevirtual   #32  <Method void Bundle.putBoolean(String, boolean)>
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


	public aa()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #23  <Method void z()>
	//    2    4:aload_0         
	//    3    5:new             #25  <Class c>
	//    4    8:dup             
	//    5    9:invokespecial   #26  <Method void c()>
	//    6   12:putfield        #28  <Field c p>
	//    7   15:return          
	}

	private void a(Bundle bundle)
	{
		c.a(((b) (this)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #33  <Method void c.a(b)>
		g();
	//    2    4:aload_0         
	//    3    5:invokespecial   #36  <Method void g()>
	//    4    8:return          
	}

	public static a f()
	{
		return new a();
	//    0    0:new             #14  <Class aa$a>
	//    1    3:dup             
	//    2    4:invokespecial   #39  <Method void aa$a()>
	//    3    7:areturn         
	}

	private void g()
	{
		Bundle bundle = getArguments();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #43  <Method Bundle getArguments()>
	//    2    4:astore_1        
		if(bundle != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          107
		{
			if(bundle.containsKey("wifiSettings"))
	//*   5    9:aload_1         
	//*   6   10:ldc1            #45  <String "wifiSettings">
	//*   7   12:invokevirtual   #51  <Method boolean Bundle.containsKey(String)>
	//*   8   15:ifeq            31
				j = (WifiConfig)bundle.getParcelable("wifiSettings");
	//    9   18:aload_0         
	//   10   19:aload_1         
	//   11   20:ldc1            #45  <String "wifiSettings">
	//   12   22:invokevirtual   #55  <Method android.os.Parcelable Bundle.getParcelable(String)>
	//   13   25:checkcast       #57  <Class WifiConfig>
	//   14   28:putfield        #61  <Field WifiConfig j>
			if(bundle.containsKey("isProvisioningFirstPass"))
	//*  15   31:aload_1         
	//*  16   32:ldc1            #63  <String "isProvisioningFirstPass">
	//*  17   34:invokevirtual   #51  <Method boolean Bundle.containsKey(String)>
	//*  18   37:ifeq            50
				k = bundle.getBoolean("isProvisioningFirstPass");
	//   19   40:aload_0         
	//   20   41:aload_1         
	//   21   42:ldc1            #63  <String "isProvisioningFirstPass">
	//   22   44:invokevirtual   #66  <Method boolean Bundle.getBoolean(String)>
	//   23   47:putfield        #70  <Field boolean k>
			if(bundle.containsKey("invalidPassword"))
	//*  24   50:aload_1         
	//*  25   51:ldc1            #72  <String "invalidPassword">
	//*  26   53:invokevirtual   #51  <Method boolean Bundle.containsKey(String)>
	//*  27   56:ifeq            69
				l = bundle.getBoolean("invalidPassword");
	//   28   59:aload_0         
	//   29   60:aload_1         
	//   30   61:ldc1            #72  <String "invalidPassword">
	//   31   63:invokevirtual   #66  <Method boolean Bundle.getBoolean(String)>
	//   32   66:putfield        #75  <Field boolean l>
			if(bundle.containsKey("isNotPasswordProtected"))
	//*  33   69:aload_1         
	//*  34   70:ldc1            #77  <String "isNotPasswordProtected">
	//*  35   72:invokevirtual   #51  <Method boolean Bundle.containsKey(String)>
	//*  36   75:ifeq            88
				n = bundle.getBoolean("isNotPasswordProtected");
	//   37   78:aload_0         
	//   38   79:aload_1         
	//   39   80:ldc1            #77  <String "isNotPasswordProtected">
	//   40   82:invokevirtual   #66  <Method boolean Bundle.getBoolean(String)>
	//   41   85:putfield        #80  <Field boolean n>
			if(bundle.containsKey("isNetworkSettingClickable"))
	//*  42   88:aload_1         
	//*  43   89:ldc1            #82  <String "isNetworkSettingClickable">
	//*  44   91:invokevirtual   #51  <Method boolean Bundle.containsKey(String)>
	//*  45   94:ifeq            107
				o = bundle.getBoolean("isNetworkSettingClickable");
	//   46   97:aload_0         
	//   47   98:aload_1         
	//   48   99:ldc1            #82  <String "isNetworkSettingClickable">
	//   49  101:invokevirtual   #66  <Method boolean Bundle.getBoolean(String)>
	//   50  104:putfield        #85  <Field boolean o>
		}
	//   51  107:return          
	}

	public View a(int i)
	{
		if(q == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #88  <Field View q>
	//*   2    4:ifnonnull       9
			return null;
	//    3    7:aconst_null     
	//    4    8:areturn         
		else
			return q.findViewById(i);
	//    5    9:aload_0         
	//    6   10:getfield        #88  <Field View q>
	//    7   13:iload_1         
	//    8   14:invokevirtual   #93  <Method View View.findViewById(int)>
	//    9   17:areturn         
	}

	public void a(org.androidannotations.api.c.a a1)
	{
		b = (TextView)a1.a(0x7f090311);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc1            #97  <Int 0x7f090311>
	//    3    4:invokeinterface #99  <Method View a.a(int)>
	//    4    9:checkcast       #101 <Class TextView>
	//    5   12:putfield        #105 <Field TextView b>
		c = (TextView)a1.a(0x7f0902ee);
	//    6   15:aload_0         
	//    7   16:aload_1         
	//    8   17:ldc1            #106 <Int 0x7f0902ee>
	//    9   19:invokeinterface #99  <Method View a.a(int)>
	//   10   24:checkcast       #101 <Class TextView>
	//   11   27:putfield        #109 <Field TextView c>
		d = (TextView)a1.a(0x7f0902ef);
	//   12   30:aload_0         
	//   13   31:aload_1         
	//   14   32:ldc1            #110 <Int 0x7f0902ef>
	//   15   34:invokeinterface #99  <Method View a.a(int)>
	//   16   39:checkcast       #101 <Class TextView>
	//   17   42:putfield        #113 <Field TextView d>
		e = (TextView)a1.a(0x7f0901e9);
	//   18   45:aload_0         
	//   19   46:aload_1         
	//   20   47:ldc1            #114 <Int 0x7f0901e9>
	//   21   49:invokeinterface #99  <Method View a.a(int)>
	//   22   54:checkcast       #101 <Class TextView>
	//   23   57:putfield        #117 <Field TextView e>
		f = (TextView)a1.a(0x7f09028b);
	//   24   60:aload_0         
	//   25   61:aload_1         
	//   26   62:ldc1            #118 <Int 0x7f09028b>
	//   27   64:invokeinterface #99  <Method View a.a(int)>
	//   28   69:checkcast       #101 <Class TextView>
	//   29   72:putfield        #120 <Field TextView f>
		g = (CheckBox)a1.a(0x7f090289);
	//   30   75:aload_0         
	//   31   76:aload_1         
	//   32   77:ldc1            #121 <Int 0x7f090289>
	//   33   79:invokeinterface #99  <Method View a.a(int)>
	//   34   84:checkcast       #123 <Class CheckBox>
	//   35   87:putfield        #126 <Field CheckBox g>
		h = (LinearLayout)a1.a(0x7f09022f);
	//   36   90:aload_0         
	//   37   91:aload_1         
	//   38   92:ldc1            #127 <Int 0x7f09022f>
	//   39   94:invokeinterface #99  <Method View a.a(int)>
	//   40   99:checkcast       #129 <Class LinearLayout>
	//   41  102:putfield        #133 <Field LinearLayout h>
		i = (RelativeLayout)a1.a(0x7f09028a);
	//   42  105:aload_0         
	//   43  106:aload_1         
	//   44  107:ldc1            #134 <Int 0x7f09028a>
	//   45  109:invokeinterface #99  <Method View a.a(int)>
	//   46  114:checkcast       #136 <Class RelativeLayout>
	//   47  117:putfield        #140 <Field RelativeLayout i>
		a1 = ((org.androidannotations.api.c.a) (a1.a(0x7f090048)));
	//   48  120:aload_1         
	//   49  121:ldc1            #141 <Int 0x7f090048>
	//   50  123:invokeinterface #99  <Method View a.a(int)>
	//   51  128:astore_1        
		if(a1 != null)
	//*  52  129:aload_1         
	//*  53  130:ifnull          145
			((View) (a1)).setOnClickListener(((android.view.View.OnClickListener) (new Runnable(this) {

				public void run()
				{
					Exception exception;
					String s;
					StringBuilder stringbuilder;
					try
					{
						InetAddress inetaddress = InetAddress.getByName(a);
				//    0    0:aload_0         
				//    1    1:getfield        #26  <Field String a>
				//    2    4:invokestatic    #45  <Method InetAddress InetAddress.getByName(String)>
				//    3    7:astore_2        
						if(com.irobot.home.util.aa.a(e).a(inetaddress, b, c))
				//*   4    8:aload_0         
				//*   5    9:getfield        #24  <Field aa e>
				//*   6   12:invokestatic    #48  <Method y com.irobot.home.util.aa.a(aa)>
				//*   7   15:aload_2         
				//*   8   16:aload_0         
				//*   9   17:getfield        #28  <Field int b>
				//*  10   20:aload_0         
				//*  11   21:getfield        #30  <Field int c>
				//*  12   24:invokevirtual   #53  <Method boolean com.irobot.home.util.y.a(InetAddress, int, int)>
				//*  13   27:ifeq            136
						{
							Date date = new Date((com.irobot.home.util.aa.a(e).a() + SystemClock.elapsedRealtime()) - com.irobot.home.util.aa.a(e).b());
				//   14   30:new             #55  <Class Date>
				//   15   33:dup             
				//   16   34:aload_0         
				//   17   35:getfield        #24  <Field aa e>
				//   18   38:invokestatic    #48  <Method y com.irobot.home.util.aa.a(aa)>
				//   19   41:invokevirtual   #58  <Method long com.irobot.home.util.y.a()>
				//   20   44:invokestatic    #63  <Method long SystemClock.elapsedRealtime()>
				//   21   47:ladd            
				//   22   48:aload_0         
				//   23   49:getfield        #24  <Field aa e>
				//   24   52:invokestatic    #48  <Method y com.irobot.home.util.aa.a(aa)>
				//   25   55:invokevirtual   #65  <Method long com.irobot.home.util.y.b()>
				//   26   58:lsub            
				//   27   59:invokespecial   #68  <Method void Date(long)>
				//   28   62:astore_2        
							d.onNtpTimeReceived(date);
				//   29   63:aload_0         
				//   30   64:getfield        #32  <Field NtpTimeCallback d>
				//   31   67:aload_2         
				//   32   68:invokevirtual   #74  <Method void NtpTimeCallback.onNtpTimeReceived(Date)>
							int i = (int)(((new Date()).getTime() - date.getTime()) / 1000L);
				//   33   71:new             #55  <Class Date>
				//   34   74:dup             
				//   35   75:invokespecial   #75  <Method void Date()>
				//   36   78:invokevirtual   #78  <Method long Date.getTime()>
				//   37   81:aload_2         
				//   38   82:invokevirtual   #78  <Method long Date.getTime()>
				//   39   85:lsub            
				//   40   86:ldc2w           #79  <Long 1000L>
				//   41   89:ldiv            
				//   42   90:l2i             
				//   43   91:istore_1        
							com.irobot.awsservices.c.c.a().a(i);
				//   44   92:invokestatic    #85  <Method com.irobot.awsservices.c.c com.irobot.awsservices.c.c.a()>
				//   45   95:iload_1         
				//   46   96:invokevirtual   #88  <Method void com.irobot.awsservices.c.c.a(int)>
							return;
				//   47   99:return          
						}
					}
				//*  48  100:invokestatic    #91  <Method String com.irobot.home.util.aa.a()>
				//*  49  103:astore_2        
				//*  50  104:new             #93  <Class StringBuilder>
				//*  51  107:dup             
				//*  52  108:invokespecial   #94  <Method void StringBuilder()>
				//*  53  111:astore_3        
				//*  54  112:aload_3         
				//*  55  113:ldc1            #96  <String "Failed to get InetAddress for ">
				//*  56  115:invokevirtual   #100 <Method StringBuilder StringBuilder.append(String)>
				//*  57  118:pop             
				//*  58  119:aload_3         
				//*  59  120:aload_0         
				//*  60  121:getfield        #26  <Field String a>
				//*  61  124:invokevirtual   #100 <Method StringBuilder StringBuilder.append(String)>
				//*  62  127:pop             
				//*  63  128:aload_2         
				//*  64  129:aload_3         
				//*  65  130:invokevirtual   #103 <Method String StringBuilder.toString()>
				//*  66  133:invokestatic    #108 <Method void o.e(String, String)>
				//*  67  136:aload_0         
				//*  68  137:getfield        #32  <Field NtpTimeCallback d>
				//*  69  140:invokevirtual   #111 <Method void NtpTimeCallback.onNtpTimeError()>
				//*  70  143:return          
					// Misplaced declaration of an exception variable
					catch(Exception exception)
					{
						s = com.irobot.home.util.aa.a();
						stringbuilder = new StringBuilder();
						stringbuilder.append("Failed to get InetAddress for ");
						stringbuilder.append(a);
						o.e(s, stringbuilder.toString());
					}
					d.onNtpTimeError();
				//*  71  144:astore_2        
				//*  72  145:goto            100
				}

				final String a;
				final int b;
				final int c;
				final NtpTimeCallback d;
				final aa e;

			
			{
				e = aa1;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #24  <Field aa e>
				a = s;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #26  <Field String a>
				b = i;
			//    6   10:aload_0         
			//    7   11:iload_3         
			//    8   12:putfield        #28  <Field int b>
				c = j;
			//    9   15:aload_0         
			//   10   16:iload           4
			//   11   18:putfield        #30  <Field int c>
				d = ntptimecallback;
			//   12   21:aload_0         
			//   13   22:aload           5
			//   14   24:putfield        #32  <Field NtpTimeCallback d>
				super();
			//   15   27:aload_0         
			//   16   28:invokespecial   #35  <Method void Object()>
			//   17   31:return          
			}
			}
)));
	//   54  133:aload_1         
	//   55  134:new             #10  <Class aa$1>
	//   56  137:dup             
	//   57  138:aload_0         
	//   58  139:invokespecial   #144 <Method void aa$1(aa)>
	//   59  142:invokevirtual   #148 <Method void View.setOnClickListener(android.view.View$OnClickListener)>
		if(i != null)
	//*  60  145:aload_0         
	//*  61  146:getfield        #140 <Field RelativeLayout i>
	//*  62  149:ifnull          167
			i.setOnClickListener(((android.view.View.OnClickListener) (new RecyclerView.l(this) {

				public void a(RecyclerView recyclerview, int i, int j)
				{
					a.a(recyclerview.computeHorizontalScrollOffset(), recyclerview.computeVerticalScrollOffset());
				//    0    0:aload_0         
				//    1    1:getfield        #12  <Field aa a>
				//    2    4:aload_1         
				//    3    5:invokevirtual   #23  <Method int RecyclerView.computeHorizontalScrollOffset()>
				//    4    8:aload_1         
				//    5    9:invokevirtual   #26  <Method int RecyclerView.computeVerticalScrollOffset()>
				//    6   12:invokevirtual   #29  <Method void android.support.v7.widget.aa.a(int, int)>
				//    7   15:return          
				}

				final aa a;

			
			{
				a = aa1;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #12  <Field aa a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #15  <Method void RecyclerView$l()>
			//    5    9:return          
			}
			}
)));
	//   63  152:aload_0         
	//   64  153:getfield        #140 <Field RelativeLayout i>
	//   65  156:new             #12  <Class aa$2>
	//   66  159:dup             
	//   67  160:aload_0         
	//   68  161:invokespecial   #149 <Method void aa$2(aa)>
	//   69  164:invokevirtual   #150 <Method void RelativeLayout.setOnClickListener(android.view.View$OnClickListener)>
		a();
	//   70  167:aload_0         
	//   71  168:invokevirtual   #152 <Method void a()>
	//   72  171:return          
	}

	public void onCreate(Bundle bundle)
	{
		c c1 = c.a(p);
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field c p>
	//    2    4:invokestatic    #156 <Method c c.a(c)>
	//    3    7:astore_2        
		a(bundle);
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokespecial   #158 <Method void a(Bundle)>
		super.onCreate(bundle);
	//    7   13:aload_0         
	//    8   14:aload_1         
	//    9   15:invokespecial   #160 <Method void z.onCreate(Bundle)>
		c.a(c1);
	//   10   18:aload_2         
	//   11   19:invokestatic    #156 <Method c c.a(c)>
	//   12   22:pop             
	//   13   23:return          
	}

	public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
	{
		q = super.onCreateView(layoutinflater, viewgroup, bundle);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:aload_1         
	//    3    3:aload_2         
	//    4    4:aload_3         
	//    5    5:invokespecial   #164 <Method View z.onCreateView(LayoutInflater, ViewGroup, Bundle)>
	//    6    8:putfield        #88  <Field View q>
		if(q == null)
	//*   7   11:aload_0         
	//*   8   12:getfield        #88  <Field View q>
	//*   9   15:ifnonnull       30
			q = layoutinflater.inflate(0x7f0b00b4, viewgroup, false);
	//   10   18:aload_0         
	//   11   19:aload_1         
	//   12   20:ldc1            #165 <Int 0x7f0b00b4>
	//   13   22:aload_2         
	//   14   23:iconst_0        
	//   15   24:invokevirtual   #171 <Method View LayoutInflater.inflate(int, ViewGroup, boolean)>
	//   16   27:putfield        #88  <Field View q>
		return q;
	//   17   30:aload_0         
	//   18   31:getfield        #88  <Field View q>
	//   19   34:areturn         
	}

	public void onDestroyView()
	{
		super.onDestroyView();
	//    0    0:aload_0         
	//    1    1:invokespecial   #174 <Method void z.onDestroyView()>
		q = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #88  <Field View q>
		b = null;
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:putfield        #105 <Field TextView b>
		c = null;
	//    8   14:aload_0         
	//    9   15:aconst_null     
	//   10   16:putfield        #109 <Field TextView c>
		d = null;
	//   11   19:aload_0         
	//   12   20:aconst_null     
	//   13   21:putfield        #113 <Field TextView d>
		e = null;
	//   14   24:aload_0         
	//   15   25:aconst_null     
	//   16   26:putfield        #117 <Field TextView e>
		f = null;
	//   17   29:aload_0         
	//   18   30:aconst_null     
	//   19   31:putfield        #120 <Field TextView f>
		g = null;
	//   20   34:aload_0         
	//   21   35:aconst_null     
	//   22   36:putfield        #126 <Field CheckBox g>
		h = null;
	//   23   39:aload_0         
	//   24   40:aconst_null     
	//   25   41:putfield        #133 <Field LinearLayout h>
		i = null;
	//   26   44:aload_0         
	//   27   45:aconst_null     
	//   28   46:putfield        #140 <Field RelativeLayout i>
	//   29   49:return          
	}

	public void onViewCreated(View view, Bundle bundle)
	{
		super.onViewCreated(view, bundle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #178 <Method void z.onViewCreated(View, Bundle)>
		p.a(((org.androidannotations.api.c.a) (this)));
	//    4    6:aload_0         
	//    5    7:getfield        #28  <Field c p>
	//    6   10:aload_0         
	//    7   11:invokevirtual   #180 <Method void c.a(a)>
	//    8   14:return          
	}

	private final c p = new c();
	private View q;
}

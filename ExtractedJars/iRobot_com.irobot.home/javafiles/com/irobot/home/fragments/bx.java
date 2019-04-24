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
//			bw

public final class bx extends bw
	implements org.androidannotations.api.c.a, b
{
	public static class a extends org.androidannotations.api.a.c
	{

		public bw a()
		{
			bx bx1 = new bx();
		//    0    0:new             #7   <Class bx>
		//    1    3:dup             
		//    2    4:invokespecial   #15  <Method void bx()>
		//    3    7:astore_1        
			bx1.setArguments(a);
		//    4    8:aload_1         
		//    5    9:aload_0         
		//    6   10:getfield        #18  <Field Bundle a>
		//    7   13:invokevirtual   #22  <Method void bx.setArguments(Bundle)>
			return ((bw) (bx1));
		//    8   16:aload_1         
		//    9   17:areturn         
		}

		public a a(WifiInfo wifiinfo)
		{
			a.putParcelable("homeWifiInfo", ((android.os.Parcelable) (wifiinfo)));
		//    0    0:aload_0         
		//    1    1:getfield        #18  <Field Bundle a>
		//    2    4:ldc1            #25  <String "homeWifiInfo">
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
			a.putString("assetInfoJson", s);
		//    0    0:aload_0         
		//    1    1:getfield        #18  <Field Bundle a>
		//    2    4:ldc1            #37  <String "assetInfoJson">
		//    3    6:aload_1         
		//    4    7:invokevirtual   #41  <Method void Bundle.putString(String, String)>
			return this;
		//    5   10:aload_0         
		//    6   11:areturn         
		}

		public a b(WifiInfo wifiinfo)
		{
			a.putParcelable("robotWifiInfo", ((android.os.Parcelable) (wifiinfo)));
		//    0    0:aload_0         
		//    1    1:getfield        #18  <Field Bundle a>
		//    2    4:ldc1            #44  <String "robotWifiInfo">
		//    3    6:aload_1         
		//    4    7:invokevirtual   #31  <Method void Bundle.putParcelable(String, android.os.Parcelable)>
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


	public bx()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #25  <Method void bw()>
	//    2    4:aload_0         
	//    3    5:new             #27  <Class c>
	//    4    8:dup             
	//    5    9:invokespecial   #28  <Method void c()>
	//    6   12:putfield        #30  <Field c g>
	//    7   15:return          
	}

	private void a(Bundle bundle)
	{
		org.androidannotations.api.c.c.a(((b) (this)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #35  <Method void c.a(b)>
		d();
	//    2    4:aload_0         
	//    3    5:invokespecial   #38  <Method void d()>
		a = IRobotApplication_.r();
	//    4    8:aload_0         
	//    5    9:invokestatic    #44  <Method com.irobot.home.IRobotApplication IRobotApplication_.r()>
	//    6   12:putfield        #47  <Field com.irobot.home.IRobotApplication a>
	//    7   15:return          
	}

	static void a(bx bx1)
	{
		((bw) (bx1)).com.irobot.home.fragments.bw.b();
	//    0    0:aload_0         
	//    1    1:invokespecial   #51  <Method void com.irobot.home.fragments.bw.b()>
	//    2    4:return          
	}

	static void a(bx bx1, String s)
	{
		((bw) (bx1)).com.irobot.home.fragments.bw.a(s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #55  <Method void com.irobot.home.fragments.bw.a(String)>
	//    3    5:return          
	}

	static void b(bx bx1, String s)
	{
		((bw) (bx1)).com.irobot.home.fragments.bw.b(s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #57  <Method void com.irobot.home.fragments.bw.b(String)>
	//    3    5:return          
	}

	public static a c()
	{
		return new a();
	//    0    0:new             #16  <Class bx$a>
	//    1    3:dup             
	//    2    4:invokespecial   #60  <Method void bx$a()>
	//    3    7:areturn         
	}

	private void d()
	{
		Bundle bundle = getArguments();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #64  <Method Bundle getArguments()>
	//    2    4:astore_1        
		if(bundle != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          94
		{
			if(bundle.containsKey("assetInfoJson"))
	//*   5    9:aload_1         
	//*   6   10:ldc1            #66  <String "assetInfoJson">
	//*   7   12:invokevirtual   #72  <Method boolean Bundle.containsKey(String)>
	//*   8   15:ifeq            28
				b = bundle.getString("assetInfoJson");
	//    9   18:aload_0         
	//   10   19:aload_1         
	//   11   20:ldc1            #66  <String "assetInfoJson">
	//   12   22:invokevirtual   #76  <Method String Bundle.getString(String)>
	//   13   25:putfield        #79  <Field String b>
			if(bundle.containsKey("homeWifiInfo"))
	//*  14   28:aload_1         
	//*  15   29:ldc1            #81  <String "homeWifiInfo">
	//*  16   31:invokevirtual   #72  <Method boolean Bundle.containsKey(String)>
	//*  17   34:ifeq            50
				c = (WifiInfo)bundle.getParcelable("homeWifiInfo");
	//   18   37:aload_0         
	//   19   38:aload_1         
	//   20   39:ldc1            #81  <String "homeWifiInfo">
	//   21   41:invokevirtual   #85  <Method android.os.Parcelable Bundle.getParcelable(String)>
	//   22   44:checkcast       #87  <Class WifiInfo>
	//   23   47:putfield        #90  <Field WifiInfo c>
			if(bundle.containsKey("robotWifiInfo"))
	//*  24   50:aload_1         
	//*  25   51:ldc1            #92  <String "robotWifiInfo">
	//*  26   53:invokevirtual   #72  <Method boolean Bundle.containsKey(String)>
	//*  27   56:ifeq            72
				d = (WifiInfo)bundle.getParcelable("robotWifiInfo");
	//   28   59:aload_0         
	//   29   60:aload_1         
	//   30   61:ldc1            #92  <String "robotWifiInfo">
	//   31   63:invokevirtual   #85  <Method android.os.Parcelable Bundle.getParcelable(String)>
	//   32   66:checkcast       #87  <Class WifiInfo>
	//   33   69:putfield        #94  <Field WifiInfo d>
			if(bundle.containsKey("wifiSettings"))
	//*  34   72:aload_1         
	//*  35   73:ldc1            #96  <String "wifiSettings">
	//*  36   75:invokevirtual   #72  <Method boolean Bundle.containsKey(String)>
	//*  37   78:ifeq            94
				e = (WifiConfig)bundle.getParcelable("wifiSettings");
	//   38   81:aload_0         
	//   39   82:aload_1         
	//   40   83:ldc1            #96  <String "wifiSettings">
	//   41   85:invokevirtual   #85  <Method android.os.Parcelable Bundle.getParcelable(String)>
	//   42   88:checkcast       #98  <Class WifiConfig>
	//   43   91:putfield        #102 <Field WifiConfig e>
		}
	//   44   94:return          
	}

	public View a(int i)
	{
		if(h == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #105 <Field View h>
	//*   2    4:ifnonnull       9
			return null;
	//    3    7:aconst_null     
	//    4    8:areturn         
		else
			return h.findViewById(i);
	//    5    9:aload_0         
	//    6   10:getfield        #105 <Field View h>
	//    7   13:iload_1         
	//    8   14:invokevirtual   #110 <Method View View.findViewById(int)>
	//    9   17:areturn         
	}

	protected void a(String s)
	{
		org.androidannotations.api.b.a("", new Runnable(s) {

			public void run()
			{
				com.irobot.home.fragments.bx.a(b, a);
			//    0    0:aload_0         
			//    1    1:getfield        #18  <Field bx b>
			//    2    4:aload_0         
			//    3    5:getfield        #20  <Field String a>
			//    4    8:invokestatic    #27  <Method void com.irobot.home.fragments.bx.a(bx, String)>
			//    5   11:return          
			}

			final String a;
			final bx b;

			
			{
				b = bx.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #18  <Field bx b>
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
	//    0    0:ldc1            #114 <String "">
	//    1    2:new             #10  <Class bx$1>
	//    2    5:dup             
	//    3    6:aload_0         
	//    4    7:aload_1         
	//    5    8:invokespecial   #116 <Method void bx$1(bx, String)>
	//    6   11:lconst_0        
	//    7   12:invokestatic    #121 <Method void org.androidannotations.api.b.a(String, Runnable, long)>
	//    8   15:return          
	}

	public void a(org.androidannotations.api.c.a a1)
	{
		f = (CustomVideoView)a1.a(0x7f09012c);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc1            #123 <Int 0x7f09012c>
	//    3    4:invokeinterface #125 <Method View a.a(int)>
	//    4    9:checkcast       #127 <Class CustomVideoView>
	//    5   12:putfield        #131 <Field CustomVideoView f>
		a();
	//    6   15:aload_0         
	//    7   16:invokevirtual   #133 <Method void a()>
	//    8   19:return          
	}

	void b()
	{
		org.androidannotations.api.b.a("", new Runnable() {

			public void run()
			{
				com.irobot.home.fragments.bx.a(a);
			//    0    0:aload_0         
			//    1    1:getfield        #17  <Field bx a>
			//    2    4:invokestatic    #23  <Method void com.irobot.home.fragments.bx.a(bx)>
			//    3    7:return          
			}

			final bx a;

			
			{
				a = bx.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field bx a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
		}
, 0L);
	//    0    0:ldc1            #114 <String "">
	//    1    2:new             #12  <Class bx$2>
	//    2    5:dup             
	//    3    6:aload_0         
	//    4    7:invokespecial   #135 <Method void bx$2(bx)>
	//    5   10:lconst_0        
	//    6   11:invokestatic    #121 <Method void org.androidannotations.api.b.a(String, Runnable, long)>
	//    7   14:return          
	}

	public void b(String s)
	{
		org.androidannotations.api.b.a("", new Runnable(s) {

			public void run()
			{
				com.irobot.home.fragments.bx.b(b, a);
			//    0    0:aload_0         
			//    1    1:getfield        #18  <Field bx b>
			//    2    4:aload_0         
			//    3    5:getfield        #20  <Field String a>
			//    4    8:invokestatic    #27  <Method void com.irobot.home.fragments.bx.b(bx, String)>
			//    5   11:return          
			}

			final String a;
			final bx b;

			
			{
				b = bx.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #18  <Field bx b>
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
	//    0    0:ldc1            #114 <String "">
	//    1    2:new             #14  <Class bx$3>
	//    2    5:dup             
	//    3    6:aload_0         
	//    4    7:aload_1         
	//    5    8:invokespecial   #136 <Method void bx$3(bx, String)>
	//    6   11:lconst_0        
	//    7   12:invokestatic    #121 <Method void org.androidannotations.api.b.a(String, Runnable, long)>
	//    8   15:return          
	}

	public void onCreate(Bundle bundle)
	{
		c c1 = org.androidannotations.api.c.c.a(g);
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field c g>
	//    2    4:invokestatic    #140 <Method c c.a(c)>
	//    3    7:astore_2        
		a(bundle);
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokespecial   #142 <Method void a(Bundle)>
		super.onCreate(bundle);
	//    7   13:aload_0         
	//    8   14:aload_1         
	//    9   15:invokespecial   #144 <Method void bw.onCreate(Bundle)>
		org.androidannotations.api.c.c.a(c1);
	//   10   18:aload_2         
	//   11   19:invokestatic    #140 <Method c c.a(c)>
	//   12   22:pop             
	//   13   23:return          
	}

	public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
	{
		h = super.onCreateView(layoutinflater, viewgroup, bundle);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:aload_1         
	//    3    3:aload_2         
	//    4    4:aload_3         
	//    5    5:invokespecial   #148 <Method View bw.onCreateView(LayoutInflater, ViewGroup, Bundle)>
	//    6    8:putfield        #105 <Field View h>
		if(h == null)
	//*   7   11:aload_0         
	//*   8   12:getfield        #105 <Field View h>
	//*   9   15:ifnonnull       30
			h = layoutinflater.inflate(0x7f0b00c8, viewgroup, false);
	//   10   18:aload_0         
	//   11   19:aload_1         
	//   12   20:ldc1            #149 <Int 0x7f0b00c8>
	//   13   22:aload_2         
	//   14   23:iconst_0        
	//   15   24:invokevirtual   #155 <Method View LayoutInflater.inflate(int, ViewGroup, boolean)>
	//   16   27:putfield        #105 <Field View h>
		return h;
	//   17   30:aload_0         
	//   18   31:getfield        #105 <Field View h>
	//   19   34:areturn         
	}

	public void onDestroyView()
	{
		super.onDestroyView();
	//    0    0:aload_0         
	//    1    1:invokespecial   #158 <Method void bw.onDestroyView()>
		h = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #105 <Field View h>
		f = null;
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:putfield        #131 <Field CustomVideoView f>
	//    8   14:return          
	}

	public void onViewCreated(View view, Bundle bundle)
	{
		super.onViewCreated(view, bundle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #162 <Method void bw.onViewCreated(View, Bundle)>
		g.a(((org.androidannotations.api.c.a) (this)));
	//    4    6:aload_0         
	//    5    7:getfield        #30  <Field c g>
	//    6   10:aload_0         
	//    7   11:invokevirtual   #164 <Method void c.a(a)>
	//    8   14:return          
	}

	private final c g = new c();
	private View h;
}

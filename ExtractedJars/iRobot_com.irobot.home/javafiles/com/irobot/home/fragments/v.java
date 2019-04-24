// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import java.util.HashMap;
import org.androidannotations.api.c.a;
import org.androidannotations.api.c.b;
import org.androidannotations.api.c.c;

// Referenced classes of package com.irobot.home.fragments:
//			u

public final class v extends u
	implements org.androidannotations.api.c.a, b
{
	public static class a extends org.androidannotations.api.a.c
	{

		public u a()
		{
			v v1 = new v();
		//    0    0:new             #7   <Class v>
		//    1    3:dup             
		//    2    4:invokespecial   #15  <Method void v()>
		//    3    7:astore_1        
			v1.setArguments(a);
		//    4    8:aload_1         
		//    5    9:aload_0         
		//    6   10:getfield        #18  <Field Bundle a>
		//    7   13:invokevirtual   #22  <Method void v.setArguments(Bundle)>
			return ((u) (v1));
		//    8   16:aload_1         
		//    9   17:areturn         
		}

		public a a(String s)
		{
			a.putString("assetID", s);
		//    0    0:aload_0         
		//    1    1:getfield        #18  <Field Bundle a>
		//    2    4:ldc1            #25  <String "assetID">
		//    3    6:aload_1         
		//    4    7:invokevirtual   #31  <Method void Bundle.putString(String, String)>
			return this;
		//    5   10:aload_0         
		//    6   11:areturn         
		}

		public a a(HashMap hashmap)
		{
			a.putSerializable("settingsMap", ((java.io.Serializable) (hashmap)));
		//    0    0:aload_0         
		//    1    1:getfield        #18  <Field Bundle a>
		//    2    4:ldc1            #34  <String "settingsMap">
		//    3    6:aload_1         
		//    4    7:invokevirtual   #38  <Method void Bundle.putSerializable(String, java.io.Serializable)>
			return this;
		//    5   10:aload_0         
		//    6   11:areturn         
		}

		public a a(boolean flag)
		{
			a.putBoolean("isPresetsSupported", flag);
		//    0    0:aload_0         
		//    1    1:getfield        #18  <Field Bundle a>
		//    2    4:ldc1            #43  <String "isPresetsSupported">
		//    3    6:iload_1         
		//    4    7:invokevirtual   #47  <Method void Bundle.putBoolean(String, boolean)>
			return this;
		//    5   10:aload_0         
		//    6   11:areturn         
		}

		public a b(boolean flag)
		{
			a.putBoolean("shouldShowHeader", flag);
		//    0    0:aload_0         
		//    1    1:getfield        #18  <Field Bundle a>
		//    2    4:ldc1            #50  <String "shouldShowHeader">
		//    3    6:iload_1         
		//    4    7:invokevirtual   #47  <Method void Bundle.putBoolean(String, boolean)>
			return this;
		//    5   10:aload_0         
		//    6   11:areturn         
		}

		public a c(boolean flag)
		{
			a.putBoolean("isCreatingSchedule", flag);
		//    0    0:aload_0         
		//    1    1:getfield        #18  <Field Bundle a>
		//    2    4:ldc1            #53  <String "isCreatingSchedule">
		//    3    6:iload_1         
		//    4    7:invokevirtual   #47  <Method void Bundle.putBoolean(String, boolean)>
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


	public v()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #25  <Method void u()>
	//    2    4:aload_0         
	//    3    5:new             #27  <Class c>
	//    4    8:dup             
	//    5    9:invokespecial   #28  <Method void c()>
	//    6   12:putfield        #30  <Field c q>
	//    7   15:return          
	}

	private void a(Bundle bundle)
	{
		org.androidannotations.api.c.c.a(((b) (this)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #35  <Method void c.a(b)>
		g();
	//    2    4:aload_0         
	//    3    5:invokespecial   #38  <Method void g()>
	//    4    8:return          
	}

	static void a(v v1)
	{
		((u) (v1)).com.irobot.home.fragments.u.c();
	//    0    0:aload_0         
	//    1    1:invokespecial   #42  <Method void com.irobot.home.fragments.u.c()>
	//    2    4:return          
	}

	static void a(v v1, int i)
	{
		((u) (v1)).com.irobot.home.fragments.u.c(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #46  <Method void com.irobot.home.fragments.u.c(int)>
	//    3    5:return          
	}

	public static a f()
	{
		return new a();
	//    0    0:new             #16  <Class v$a>
	//    1    3:dup             
	//    2    4:invokespecial   #49  <Method void v$a()>
	//    3    7:areturn         
	}

	private void g()
	{
		Bundle bundle = getArguments();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #53  <Method Bundle getArguments()>
	//    2    4:astore_1        
		if(bundle != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          107
		{
			if(bundle.containsKey("assetID"))
	//*   5    9:aload_1         
	//*   6   10:ldc1            #55  <String "assetID">
	//*   7   12:invokevirtual   #61  <Method boolean Bundle.containsKey(String)>
	//*   8   15:ifeq            28
				a = bundle.getString("assetID");
	//    9   18:aload_0         
	//   10   19:aload_1         
	//   11   20:ldc1            #55  <String "assetID">
	//   12   22:invokevirtual   #65  <Method String Bundle.getString(String)>
	//   13   25:putfield        #68  <Field String a>
			if(bundle.containsKey("settingsMap"))
	//*  14   28:aload_1         
	//*  15   29:ldc1            #70  <String "settingsMap">
	//*  16   31:invokevirtual   #61  <Method boolean Bundle.containsKey(String)>
	//*  17   34:ifeq            50
				m = (HashMap)bundle.getSerializable("settingsMap");
	//   18   37:aload_0         
	//   19   38:aload_1         
	//   20   39:ldc1            #70  <String "settingsMap">
	//   21   41:invokevirtual   #74  <Method java.io.Serializable Bundle.getSerializable(String)>
	//   22   44:checkcast       #76  <Class HashMap>
	//   23   47:putfield        #80  <Field HashMap m>
			if(bundle.containsKey("isPresetsSupported"))
	//*  24   50:aload_1         
	//*  25   51:ldc1            #82  <String "isPresetsSupported">
	//*  26   53:invokevirtual   #61  <Method boolean Bundle.containsKey(String)>
	//*  27   56:ifeq            69
				n = bundle.getBoolean("isPresetsSupported");
	//   28   59:aload_0         
	//   29   60:aload_1         
	//   30   61:ldc1            #82  <String "isPresetsSupported">
	//   31   63:invokevirtual   #85  <Method boolean Bundle.getBoolean(String)>
	//   32   66:putfield        #89  <Field boolean n>
			if(bundle.containsKey("shouldShowHeader"))
	//*  33   69:aload_1         
	//*  34   70:ldc1            #91  <String "shouldShowHeader">
	//*  35   72:invokevirtual   #61  <Method boolean Bundle.containsKey(String)>
	//*  36   75:ifeq            88
				o = bundle.getBoolean("shouldShowHeader");
	//   37   78:aload_0         
	//   38   79:aload_1         
	//   39   80:ldc1            #91  <String "shouldShowHeader">
	//   40   82:invokevirtual   #85  <Method boolean Bundle.getBoolean(String)>
	//   41   85:putfield        #94  <Field boolean o>
			if(bundle.containsKey("isCreatingSchedule"))
	//*  42   88:aload_1         
	//*  43   89:ldc1            #96  <String "isCreatingSchedule">
	//*  44   91:invokevirtual   #61  <Method boolean Bundle.containsKey(String)>
	//*  45   94:ifeq            107
				p = bundle.getBoolean("isCreatingSchedule");
	//   46   97:aload_0         
	//   47   98:aload_1         
	//   48   99:ldc1            #96  <String "isCreatingSchedule">
	//   49  101:invokevirtual   #85  <Method boolean Bundle.getBoolean(String)>
	//   50  104:putfield        #99  <Field boolean p>
		}
	//   51  107:return          
	}

	public View a(int i)
	{
		if(r == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #102 <Field View r>
	//*   2    4:ifnonnull       9
			return null;
	//    3    7:aconst_null     
	//    4    8:areturn         
		else
			return r.findViewById(i);
	//    5    9:aload_0         
	//    6   10:getfield        #102 <Field View r>
	//    7   13:iload_1         
	//    8   14:invokevirtual   #107 <Method View View.findViewById(int)>
	//    9   17:areturn         
	}

	public void a(org.androidannotations.api.c.a a1)
	{
		c = (RelativeLayout)a1.a(0x7f090147);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc1            #111 <Int 0x7f090147>
	//    3    4:invokeinterface #113 <Method View a.a(int)>
	//    4    9:checkcast       #115 <Class RelativeLayout>
	//    5   12:putfield        #118 <Field RelativeLayout c>
		d = (RelativeLayout)a1.a(0x7f090313);
	//    6   15:aload_0         
	//    7   16:aload_1         
	//    8   17:ldc1            #119 <Int 0x7f090313>
	//    9   19:invokeinterface #113 <Method View a.a(int)>
	//   10   24:checkcast       #115 <Class RelativeLayout>
	//   11   27:putfield        #122 <Field RelativeLayout d>
		e = (RelativeLayout)a1.a(0x7f090128);
	//   12   30:aload_0         
	//   13   31:aload_1         
	//   14   32:ldc1            #123 <Int 0x7f090128>
	//   15   34:invokeinterface #113 <Method View a.a(int)>
	//   16   39:checkcast       #115 <Class RelativeLayout>
	//   17   42:putfield        #126 <Field RelativeLayout e>
		f = (RelativeLayout)a1.a(0x7f0900ed);
	//   18   45:aload_0         
	//   19   46:aload_1         
	//   20   47:ldc1            #127 <Int 0x7f0900ed>
	//   21   49:invokeinterface #113 <Method View a.a(int)>
	//   22   54:checkcast       #115 <Class RelativeLayout>
	//   23   57:putfield        #129 <Field RelativeLayout f>
		i = (RelativeLayout)a1.a(0x7f0900e8);
	//   24   60:aload_0         
	//   25   61:aload_1         
	//   26   62:ldc1            #130 <Int 0x7f0900e8>
	//   27   64:invokeinterface #113 <Method View a.a(int)>
	//   28   69:checkcast       #115 <Class RelativeLayout>
	//   29   72:putfield        #133 <Field RelativeLayout i>
		j = (ViewStub)a1.a(0x7f0900ec);
	//   30   75:aload_0         
	//   31   76:aload_1         
	//   32   77:ldc1            #134 <Int 0x7f0900ec>
	//   33   79:invokeinterface #113 <Method View a.a(int)>
	//   34   84:checkcast       #136 <Class ViewStub>
	//   35   87:putfield        #140 <Field ViewStub j>
		k = (LinearLayout)a1.a(0x7f0900f3);
	//   36   90:aload_0         
	//   37   91:aload_1         
	//   38   92:ldc1            #141 <Int 0x7f0900f3>
	//   39   94:invokeinterface #113 <Method View a.a(int)>
	//   40   99:checkcast       #143 <Class LinearLayout>
	//   41  102:putfield        #147 <Field LinearLayout k>
		l = (LinearLayout)a1.a(0x7f0900ef);
	//   42  105:aload_0         
	//   43  106:aload_1         
	//   44  107:ldc1            #148 <Int 0x7f0900ef>
	//   45  109:invokeinterface #113 <Method View a.a(int)>
	//   46  114:checkcast       #143 <Class LinearLayout>
	//   47  117:putfield        #151 <Field LinearLayout l>
		if(i != null)
	//*  48  120:aload_0         
	//*  49  121:getfield        #133 <Field RelativeLayout i>
	//*  50  124:ifnull          142
			i.setOnClickListener(new android.view.View.OnClickListener() {

				public void onClick(View view)
				{
					a.e();
				//    0    0:aload_0         
				//    1    1:getfield        #16  <Field v a>
				//    2    4:invokevirtual   #25  <Method void v.e()>
				//    3    7:return          
				}

				final v a;

			
			{
				a = v.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field v a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
			}
);
	//   51  127:aload_0         
	//   52  128:getfield        #133 <Field RelativeLayout i>
	//   53  131:new             #10  <Class v$1>
	//   54  134:dup             
	//   55  135:aload_0         
	//   56  136:invokespecial   #153 <Method void v$1(v)>
	//   57  139:invokevirtual   #157 <Method void RelativeLayout.setOnClickListener(android.view.View$OnClickListener)>
		b();
	//   58  142:aload_0         
	//   59  143:invokevirtual   #160 <Method void b()>
	//   60  146:return          
	}

	protected void c()
	{
		org.androidannotations.api.b.a("", new Runnable() {

			public void run()
			{
				com.irobot.home.fragments.v.a(a);
			//    0    0:aload_0         
			//    1    1:getfield        #17  <Field v a>
			//    2    4:invokestatic    #23  <Method void com.irobot.home.fragments.v.a(v)>
			//    3    7:return          
			}

			final v a;

			
			{
				a = v.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field v a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
		}
, 0L);
	//    0    0:ldc1            #162 <String "">
	//    1    2:new             #12  <Class v$2>
	//    2    5:dup             
	//    3    6:aload_0         
	//    4    7:invokespecial   #163 <Method void v$2(v)>
	//    5   10:lconst_0        
	//    6   11:invokestatic    #168 <Method void org.androidannotations.api.b.a(String, Runnable, long)>
	//    7   14:return          
	}

	protected void c(int i)
	{
		org.androidannotations.api.b.a("", new Runnable(i) {

			public void run()
			{
				com.irobot.home.fragments.v.a(b, a);
			//    0    0:aload_0         
			//    1    1:getfield        #19  <Field v b>
			//    2    4:aload_0         
			//    3    5:getfield        #21  <Field int a>
			//    4    8:invokestatic    #28  <Method void com.irobot.home.fragments.v.a(v, int)>
			//    5   11:return          
			}

			final int a;
			final v b;

			
			{
				b = v.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field v b>
				a = i;
			//    3    5:aload_0         
			//    4    6:iload_2         
			//    5    7:putfield        #21  <Field int a>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #24  <Method void Object()>
			//    8   14:return          
			}
		}
, 0L);
	//    0    0:ldc1            #162 <String "">
	//    1    2:new             #14  <Class v$3>
	//    2    5:dup             
	//    3    6:aload_0         
	//    4    7:iload_1         
	//    5    8:invokespecial   #170 <Method void v$3(v, int)>
	//    6   11:lconst_0        
	//    7   12:invokestatic    #168 <Method void org.androidannotations.api.b.a(String, Runnable, long)>
	//    8   15:return          
	}

	public void onCreate(Bundle bundle)
	{
		c c1 = org.androidannotations.api.c.c.a(q);
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field c q>
	//    2    4:invokestatic    #174 <Method c c.a(c)>
	//    3    7:astore_2        
		a(bundle);
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokespecial   #176 <Method void a(Bundle)>
		super.onCreate(bundle);
	//    7   13:aload_0         
	//    8   14:aload_1         
	//    9   15:invokespecial   #178 <Method void u.onCreate(Bundle)>
		org.androidannotations.api.c.c.a(c1);
	//   10   18:aload_2         
	//   11   19:invokestatic    #174 <Method c c.a(c)>
	//   12   22:pop             
	//   13   23:return          
	}

	public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
	{
		r = super.onCreateView(layoutinflater, viewgroup, bundle);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:aload_1         
	//    3    3:aload_2         
	//    4    4:aload_3         
	//    5    5:invokespecial   #182 <Method View u.onCreateView(LayoutInflater, ViewGroup, Bundle)>
	//    6    8:putfield        #102 <Field View r>
		if(r == null)
	//*   7   11:aload_0         
	//*   8   12:getfield        #102 <Field View r>
	//*   9   15:ifnonnull       30
			r = layoutinflater.inflate(0x7f0b00b2, viewgroup, false);
	//   10   18:aload_0         
	//   11   19:aload_1         
	//   12   20:ldc1            #183 <Int 0x7f0b00b2>
	//   13   22:aload_2         
	//   14   23:iconst_0        
	//   15   24:invokevirtual   #189 <Method View LayoutInflater.inflate(int, ViewGroup, boolean)>
	//   16   27:putfield        #102 <Field View r>
		return r;
	//   17   30:aload_0         
	//   18   31:getfield        #102 <Field View r>
	//   19   34:areturn         
	}

	public void onDestroyView()
	{
		super.onDestroyView();
	//    0    0:aload_0         
	//    1    1:invokespecial   #192 <Method void u.onDestroyView()>
		r = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #102 <Field View r>
		c = null;
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:putfield        #118 <Field RelativeLayout c>
		d = null;
	//    8   14:aload_0         
	//    9   15:aconst_null     
	//   10   16:putfield        #122 <Field RelativeLayout d>
		e = null;
	//   11   19:aload_0         
	//   12   20:aconst_null     
	//   13   21:putfield        #126 <Field RelativeLayout e>
		f = null;
	//   14   24:aload_0         
	//   15   25:aconst_null     
	//   16   26:putfield        #129 <Field RelativeLayout f>
		i = null;
	//   17   29:aload_0         
	//   18   30:aconst_null     
	//   19   31:putfield        #133 <Field RelativeLayout i>
		j = null;
	//   20   34:aload_0         
	//   21   35:aconst_null     
	//   22   36:putfield        #140 <Field ViewStub j>
		k = null;
	//   23   39:aload_0         
	//   24   40:aconst_null     
	//   25   41:putfield        #147 <Field LinearLayout k>
		l = null;
	//   26   44:aload_0         
	//   27   45:aconst_null     
	//   28   46:putfield        #151 <Field LinearLayout l>
	//   29   49:return          
	}

	public void onViewCreated(View view, Bundle bundle)
	{
		super.onViewCreated(view, bundle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #196 <Method void u.onViewCreated(View, Bundle)>
		q.a(((org.androidannotations.api.c.a) (this)));
	//    4    6:aload_0         
	//    5    7:getfield        #30  <Field c q>
	//    6   10:aload_0         
	//    7   11:invokevirtual   #198 <Method void c.a(a)>
	//    8   14:return          
	}

	private final c q = new c();
	private View r;
}

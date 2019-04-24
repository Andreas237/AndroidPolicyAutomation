// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.irobot.core.OnDemandOTAEntryType;
import com.irobot.core.OnDemandOTAPathType;
import com.irobot.home.view.CustomVideoView;
import org.androidannotations.api.c.a;
import org.androidannotations.api.c.b;
import org.androidannotations.api.c.c;

// Referenced classes of package com.irobot.home.fragments:
//			ch

public final class ci extends ch
	implements org.androidannotations.api.c.a, b
{
	public static class a extends org.androidannotations.api.a.c
	{

		public ch a()
		{
			ci ci1 = new ci();
		//    0    0:new             #7   <Class ci>
		//    1    3:dup             
		//    2    4:invokespecial   #15  <Method void ci()>
		//    3    7:astore_1        
			ci1.setArguments(a);
		//    4    8:aload_1         
		//    5    9:aload_0         
		//    6   10:getfield        #18  <Field Bundle a>
		//    7   13:invokevirtual   #22  <Method void ci.setArguments(Bundle)>
			return ((ch) (ci1));
		//    8   16:aload_1         
		//    9   17:areturn         
		}

		public a a(OnDemandOTAEntryType ondemandotaentrytype)
		{
			a.putSerializable("entryType", ((java.io.Serializable) (ondemandotaentrytype)));
		//    0    0:aload_0         
		//    1    1:getfield        #18  <Field Bundle a>
		//    2    4:ldc1            #25  <String "entryType">
		//    3    6:aload_1         
		//    4    7:invokevirtual   #31  <Method void Bundle.putSerializable(String, java.io.Serializable)>
			return this;
		//    5   10:aload_0         
		//    6   11:areturn         
		}

		public a a(OnDemandOTAPathType ondemandotapathtype)
		{
			a.putSerializable("pathType", ((java.io.Serializable) (ondemandotapathtype)));
		//    0    0:aload_0         
		//    1    1:getfield        #18  <Field Bundle a>
		//    2    4:ldc1            #34  <String "pathType">
		//    3    6:aload_1         
		//    4    7:invokevirtual   #31  <Method void Bundle.putSerializable(String, java.io.Serializable)>
			return this;
		//    5   10:aload_0         
		//    6   11:areturn         
		}

		public a a(String s1)
		{
			a.putString("assetId", s1);
		//    0    0:aload_0         
		//    1    1:getfield        #18  <Field Bundle a>
		//    2    4:ldc1            #37  <String "assetId">
		//    3    6:aload_1         
		//    4    7:invokevirtual   #41  <Method void Bundle.putString(String, String)>
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


	public ci()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #25  <Method void ch()>
	//    2    4:aload_0         
	//    3    5:new             #27  <Class c>
	//    4    8:dup             
	//    5    9:invokespecial   #28  <Method void c()>
	//    6   12:putfield        #30  <Field c r>
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

	static void a(ci ci1)
	{
		((ch) (ci1)).com.irobot.home.fragments.ch.b();
	//    0    0:aload_0         
	//    1    1:invokespecial   #42  <Method void com.irobot.home.fragments.ch.b()>
	//    2    4:return          
	}

	static void b(ci ci1)
	{
		((ch) (ci1)).com.irobot.home.fragments.ch.c();
	//    0    0:aload_0         
	//    1    1:invokespecial   #45  <Method void com.irobot.home.fragments.ch.c()>
	//    2    4:return          
	}

	static void c(ci ci1)
	{
		((ch) (ci1)).ch.d();
	//    0    0:aload_0         
	//    1    1:invokespecial   #48  <Method void ch.d()>
	//    2    4:return          
	}

	public static a f()
	{
		return new a();
	//    0    0:new             #16  <Class ci$a>
	//    1    3:dup             
	//    2    4:invokespecial   #51  <Method void ci$a()>
	//    3    7:areturn         
	}

	private void g()
	{
		Bundle bundle = getArguments();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #55  <Method Bundle getArguments()>
	//    2    4:astore_1        
		if(bundle != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          72
		{
			if(bundle.containsKey("assetId"))
	//*   5    9:aload_1         
	//*   6   10:ldc1            #57  <String "assetId">
	//*   7   12:invokevirtual   #63  <Method boolean Bundle.containsKey(String)>
	//*   8   15:ifeq            28
				a = bundle.getString("assetId");
	//    9   18:aload_0         
	//   10   19:aload_1         
	//   11   20:ldc1            #57  <String "assetId">
	//   12   22:invokevirtual   #67  <Method String Bundle.getString(String)>
	//   13   25:putfield        #70  <Field String a>
			if(bundle.containsKey("entryType"))
	//*  14   28:aload_1         
	//*  15   29:ldc1            #72  <String "entryType">
	//*  16   31:invokevirtual   #63  <Method boolean Bundle.containsKey(String)>
	//*  17   34:ifeq            50
				b = (OnDemandOTAEntryType)bundle.getSerializable("entryType");
	//   18   37:aload_0         
	//   19   38:aload_1         
	//   20   39:ldc1            #72  <String "entryType">
	//   21   41:invokevirtual   #76  <Method java.io.Serializable Bundle.getSerializable(String)>
	//   22   44:checkcast       #78  <Class OnDemandOTAEntryType>
	//   23   47:putfield        #81  <Field OnDemandOTAEntryType b>
			if(bundle.containsKey("pathType"))
	//*  24   50:aload_1         
	//*  25   51:ldc1            #83  <String "pathType">
	//*  26   53:invokevirtual   #63  <Method boolean Bundle.containsKey(String)>
	//*  27   56:ifeq            72
				c = (OnDemandOTAPathType)bundle.getSerializable("pathType");
	//   28   59:aload_0         
	//   29   60:aload_1         
	//   30   61:ldc1            #83  <String "pathType">
	//   31   63:invokevirtual   #76  <Method java.io.Serializable Bundle.getSerializable(String)>
	//   32   66:checkcast       #85  <Class OnDemandOTAPathType>
	//   33   69:putfield        #88  <Field OnDemandOTAPathType c>
		}
	//   34   72:return          
	}

	public View a(int i)
	{
		if(s == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #91  <Field View s>
	//*   2    4:ifnonnull       9
			return null;
	//    3    7:aconst_null     
	//    4    8:areturn         
		else
			return s.findViewById(i);
	//    5    9:aload_0         
	//    6   10:getfield        #91  <Field View s>
	//    7   13:iload_1         
	//    8   14:invokevirtual   #96  <Method View View.findViewById(int)>
	//    9   17:areturn         
	}

	public void a(org.androidannotations.api.c.a a1)
	{
		d = (ProgressBar)a1.a(0x7f090306);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc1            #100 <Int 0x7f090306>
	//    3    4:invokeinterface #102 <Method View a.a(int)>
	//    4    9:checkcast       #104 <Class ProgressBar>
	//    5   12:putfield        #107 <Field ProgressBar d>
		e = (TextView)a1.a(0x7f090474);
	//    6   15:aload_0         
	//    7   16:aload_1         
	//    8   17:ldc1            #108 <Int 0x7f090474>
	//    9   19:invokeinterface #102 <Method View a.a(int)>
	//   10   24:checkcast       #110 <Class TextView>
	//   11   27:putfield        #114 <Field TextView e>
		f = (CustomVideoView)a1.a(0x7f09012c);
	//   12   30:aload_0         
	//   13   31:aload_1         
	//   14   32:ldc1            #115 <Int 0x7f09012c>
	//   15   34:invokeinterface #102 <Method View a.a(int)>
	//   16   39:checkcast       #117 <Class CustomVideoView>
	//   17   42:putfield        #120 <Field CustomVideoView f>
		a();
	//   18   45:aload_0         
	//   19   46:invokevirtual   #122 <Method void a()>
	//   20   49:return          
	}

	protected void b()
	{
		org.androidannotations.api.b.a("", new Runnable() {

			public void run()
			{
				com.irobot.home.fragments.ci.a(a);
			//    0    0:aload_0         
			//    1    1:getfield        #17  <Field ci a>
			//    2    4:invokestatic    #23  <Method void com.irobot.home.fragments.ci.a(ci)>
			//    3    7:return          
			}

			final ci a;

			
			{
				a = ci.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field ci a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
		}
, 0L);
	//    0    0:ldc1            #124 <String "">
	//    1    2:new             #10  <Class ci$1>
	//    2    5:dup             
	//    3    6:aload_0         
	//    4    7:invokespecial   #126 <Method void ci$1(ci)>
	//    5   10:lconst_0        
	//    6   11:invokestatic    #131 <Method void org.androidannotations.api.b.a(String, Runnable, long)>
	//    7   14:return          
	}

	protected void c()
	{
		org.androidannotations.api.b.a("", new Runnable() {

			public void run()
			{
				com.irobot.home.fragments.ci.b(a);
			//    0    0:aload_0         
			//    1    1:getfield        #17  <Field ci a>
			//    2    4:invokestatic    #24  <Method void com.irobot.home.fragments.ci.b(ci)>
			//    3    7:return          
			}

			final ci a;

			
			{
				a = ci.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field ci a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
		}
, 0L);
	//    0    0:ldc1            #124 <String "">
	//    1    2:new             #12  <Class ci$2>
	//    2    5:dup             
	//    3    6:aload_0         
	//    4    7:invokespecial   #132 <Method void ci$2(ci)>
	//    5   10:lconst_0        
	//    6   11:invokestatic    #131 <Method void org.androidannotations.api.b.a(String, Runnable, long)>
	//    7   14:return          
	}

	protected void d()
	{
		org.androidannotations.api.b.a("", new Runnable() {

			public void run()
			{
				com.irobot.home.fragments.ci.c(a);
			//    0    0:aload_0         
			//    1    1:getfield        #17  <Field ci a>
			//    2    4:invokestatic    #24  <Method void com.irobot.home.fragments.ci.c(ci)>
			//    3    7:return          
			}

			final ci a;

			
			{
				a = ci.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field ci a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
		}
, 0L);
	//    0    0:ldc1            #124 <String "">
	//    1    2:new             #14  <Class ci$3>
	//    2    5:dup             
	//    3    6:aload_0         
	//    4    7:invokespecial   #133 <Method void ci$3(ci)>
	//    5   10:lconst_0        
	//    6   11:invokestatic    #131 <Method void org.androidannotations.api.b.a(String, Runnable, long)>
	//    7   14:return          
	}

	public void onCreate(Bundle bundle)
	{
		c c1 = org.androidannotations.api.c.c.a(r);
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field c r>
	//    2    4:invokestatic    #137 <Method c c.a(c)>
	//    3    7:astore_2        
		a(bundle);
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokespecial   #139 <Method void a(Bundle)>
		super.onCreate(bundle);
	//    7   13:aload_0         
	//    8   14:aload_1         
	//    9   15:invokespecial   #141 <Method void ch.onCreate(Bundle)>
		org.androidannotations.api.c.c.a(c1);
	//   10   18:aload_2         
	//   11   19:invokestatic    #137 <Method c c.a(c)>
	//   12   22:pop             
	//   13   23:return          
	}

	public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
	{
		s = super.onCreateView(layoutinflater, viewgroup, bundle);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:aload_1         
	//    3    3:aload_2         
	//    4    4:aload_3         
	//    5    5:invokespecial   #145 <Method View ch.onCreateView(LayoutInflater, ViewGroup, Bundle)>
	//    6    8:putfield        #91  <Field View s>
		if(s == null)
	//*   7   11:aload_0         
	//*   8   12:getfield        #91  <Field View s>
	//*   9   15:ifnonnull       30
			s = layoutinflater.inflate(0x7f0b00df, viewgroup, false);
	//   10   18:aload_0         
	//   11   19:aload_1         
	//   12   20:ldc1            #146 <Int 0x7f0b00df>
	//   13   22:aload_2         
	//   14   23:iconst_0        
	//   15   24:invokevirtual   #152 <Method View LayoutInflater.inflate(int, ViewGroup, boolean)>
	//   16   27:putfield        #91  <Field View s>
		return s;
	//   17   30:aload_0         
	//   18   31:getfield        #91  <Field View s>
	//   19   34:areturn         
	}

	public void onDestroyView()
	{
		super.onDestroyView();
	//    0    0:aload_0         
	//    1    1:invokespecial   #155 <Method void ch.onDestroyView()>
		s = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #91  <Field View s>
		d = null;
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:putfield        #107 <Field ProgressBar d>
		e = null;
	//    8   14:aload_0         
	//    9   15:aconst_null     
	//   10   16:putfield        #114 <Field TextView e>
		f = null;
	//   11   19:aload_0         
	//   12   20:aconst_null     
	//   13   21:putfield        #120 <Field CustomVideoView f>
	//   14   24:return          
	}

	public void onViewCreated(View view, Bundle bundle)
	{
		super.onViewCreated(view, bundle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #159 <Method void ch.onViewCreated(View, Bundle)>
		r.a(((org.androidannotations.api.c.a) (this)));
	//    4    6:aload_0         
	//    5    7:getfield        #30  <Field c r>
	//    6   10:aload_0         
	//    7   11:invokevirtual   #161 <Method void c.a(a)>
	//    8   14:return          
	}

	private final c r = new c();
	private View s;
}

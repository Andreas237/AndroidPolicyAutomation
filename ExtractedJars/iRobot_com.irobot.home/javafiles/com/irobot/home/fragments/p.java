// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.fragments;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Spinner;
import android.widget.TextView;
import com.irobot.core.FloorPlanListItem;
import com.irobot.home.IRobotApplication_;
import java.security.KeyStore;
import java.util.HashMap;
import org.androidannotations.api.c.a;
import org.androidannotations.api.c.b;
import org.androidannotations.api.c.c;

// Referenced classes of package com.irobot.home.fragments:
//			o, p, g, l

public final class p extends o
	implements org.androidannotations.api.c.a, b
{
	public static class a extends p
	{

		protected Class a()
		{
			return android/R$drawable;
		//    0    0:ldc1            #21  <Class android.R$drawable>
		//    1    2:areturn         
		}

		protected String a(Context context)
		{
			context = ((Context) (new StringBuilder()));
		//    0    0:new             #26  <Class StringBuilder>
		//    1    3:dup             
		//    2    4:invokespecial   #28  <Method void StringBuilder()>
		//    3    7:astore_1        
			((StringBuilder) (context)).append(a);
		//    4    8:aload_1         
		//    5    9:aload_0         
		//    6   10:getfield        #13  <Field String a>
		//    7   13:invokevirtual   #32  <Method StringBuilder StringBuilder.append(String)>
		//    8   16:pop             
			((StringBuilder) (context)).append(".R$drawable");
		//    9   17:aload_1         
		//   10   18:ldc1            #34  <String ".R$drawable">
		//   11   20:invokevirtual   #32  <Method StringBuilder StringBuilder.append(String)>
		//   12   23:pop             
			return ((StringBuilder) (context)).toString();
		//   13   24:aload_1         
		//   14   25:invokevirtual   #38  <Method String StringBuilder.toString()>
		//   15   28:areturn         
		}

		private final String a;

		protected a(String s, Context context)
		{
			super(context);
		//    0    0:aload_0         
		//    1    1:aload_2         
		//    2    2:invokespecial   #11  <Method void p(Context)>
			a = s;
		//    3    5:aload_0         
		//    4    6:aload_1         
		//    5    7:putfield        #13  <Field String a>
			b();
		//    6   10:aload_0         
		//    7   11:invokevirtual   #17  <Method void b()>
		//    8   14:return          
		}
	}


	public p()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #21  <Method void o()>
	//    2    4:aload_0         
	//    3    5:new             #23  <Class c>
	//    4    8:dup             
	//    5    9:invokespecial   #24  <Method void c()>
	//    6   12:putfield        #26  <Field c n>
	//    7   15:return          
	}

	private void a(Bundle bundle)
	{
		c.a(((b) (this)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #31  <Method void c.a(b)>
		l();
	//    2    4:aload_0         
	//    3    5:invokespecial   #34  <Method void l()>
		a = IRobotApplication_.r();
	//    4    8:aload_0         
	//    5    9:invokestatic    #40  <Method com.irobot.home.IRobotApplication IRobotApplication_.r()>
	//    6   12:putfield        #43  <Field com.irobot.home.IRobotApplication a>
	//    7   15:return          
	}

	static void a(p p1, FloorPlanListItem floorplanlistitem, int i)
	{
		((o) (p1)).com.irobot.home.fragments.o.b(floorplanlistitem, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #48  <Method void com.irobot.home.fragments.o.b(FloorPlanListItem, int)>
	//    4    6:return          
	}

	public static a k()
	{
		return new a();
	//    0    0:new             #12  <Class p$a>
	//    1    3:dup             
	//    2    4:invokespecial   #51  <Method void p$a()>
	//    3    7:areturn         
	}

	private void l()
	{
		Bundle bundle = getArguments();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #55  <Method Bundle getArguments()>
	//    2    4:astore_1        
		if(bundle != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          85
		{
			if(bundle.containsKey("selectedRegionIds"))
	//*   5    9:aload_1         
	//*   6   10:ldc1            #57  <String "selectedRegionIds">
	//*   7   12:invokevirtual   #63  <Method boolean Bundle.containsKey(String)>
	//*   8   15:ifeq            28
				j = bundle.getStringArrayList("selectedRegionIds");
	//    9   18:aload_0         
	//   10   19:aload_1         
	//   11   20:ldc1            #57  <String "selectedRegionIds">
	//   12   22:invokevirtual   #67  <Method java.util.ArrayList Bundle.getStringArrayList(String)>
	//   13   25:putfield        #71  <Field java.util.ArrayList j>
			if(bundle.containsKey("selectedMapId"))
	//*  14   28:aload_1         
	//*  15   29:ldc1            #73  <String "selectedMapId">
	//*  16   31:invokevirtual   #63  <Method boolean Bundle.containsKey(String)>
	//*  17   34:ifeq            47
				k = bundle.getString("selectedMapId");
	//   18   37:aload_0         
	//   19   38:aload_1         
	//   20   39:ldc1            #73  <String "selectedMapId">
	//   21   41:invokevirtual   #77  <Method String Bundle.getString(String)>
	//   22   44:putfield        #80  <Field String k>
			if(bundle.containsKey("incomingIsOrdered"))
	//*  23   47:aload_1         
	//*  24   48:ldc1            #82  <String "incomingIsOrdered">
	//*  25   50:invokevirtual   #63  <Method boolean Bundle.containsKey(String)>
	//*  26   53:ifeq            66
				l = bundle.getBoolean("incomingIsOrdered");
	//   27   56:aload_0         
	//   28   57:aload_1         
	//   29   58:ldc1            #82  <String "incomingIsOrdered">
	//   30   60:invokevirtual   #85  <Method boolean Bundle.getBoolean(String)>
	//   31   63:putfield        #88  <Field boolean l>
			if(bundle.containsKey("shouldShowSingleFloorName"))
	//*  32   66:aload_1         
	//*  33   67:ldc1            #90  <String "shouldShowSingleFloorName">
	//*  34   69:invokevirtual   #63  <Method boolean Bundle.containsKey(String)>
	//*  35   72:ifeq            85
				m = bundle.getBoolean("shouldShowSingleFloorName");
	//   36   75:aload_0         
	//   37   76:aload_1         
	//   38   77:ldc1            #90  <String "shouldShowSingleFloorName">
	//   39   79:invokevirtual   #85  <Method boolean Bundle.getBoolean(String)>
	//   40   82:putfield        #93  <Field boolean m>
		}
	//   41   85:return          
	}

	public View a(int i)
	{
		if(o == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #96  <Field View o>
	//*   2    4:ifnonnull       9
			return null;
	//    3    7:aconst_null     
	//    4    8:areturn         
		else
			return o.findViewById(i);
	//    5    9:aload_0         
	//    6   10:getfield        #96  <Field View o>
	//    7   13:iload_1         
	//    8   14:invokevirtual   #101 <Method View View.findViewById(int)>
	//    9   17:areturn         
	}

	public void a(org.androidannotations.api.c.a a1)
	{
		b = (Spinner)a1.a(0x7f090196);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc1            #105 <Int 0x7f090196>
	//    3    4:invokeinterface #107 <Method View a.a(int)>
	//    4    9:checkcast       #109 <Class Spinner>
	//    5   12:putfield        #112 <Field Spinner b>
		c = a1.a(0x7f090198);
	//    6   15:aload_0         
	//    7   16:aload_1         
	//    8   17:ldc1            #113 <Int 0x7f090198>
	//    9   19:invokeinterface #107 <Method View a.a(int)>
	//   10   24:putfield        #116 <Field View c>
		d = (TextView)a1.a(0x7f090194);
	//   11   27:aload_0         
	//   12   28:aload_1         
	//   13   29:ldc1            #117 <Int 0x7f090194>
	//   14   31:invokeinterface #107 <Method View a.a(int)>
	//   15   36:checkcast       #119 <Class TextView>
	//   16   39:putfield        #123 <Field TextView d>
		e = (TextView)a1.a(0x7f09036f);
	//   17   42:aload_0         
	//   18   43:aload_1         
	//   19   44:ldc1            #124 <Int 0x7f09036f>
	//   20   46:invokeinterface #107 <Method View a.a(int)>
	//   21   51:checkcast       #119 <Class TextView>
	//   22   54:putfield        #127 <Field TextView e>
		f = a1.a(0x7f090197);
	//   23   57:aload_0         
	//   24   58:aload_1         
	//   25   59:ldc1            #128 <Int 0x7f090197>
	//   26   61:invokeinterface #107 <Method View a.a(int)>
	//   27   66:putfield        #131 <Field View f>
		i = (RecyclerView)a1.a(0x7f09032a);
	//   28   69:aload_0         
	//   29   70:aload_1         
	//   30   71:ldc1            #132 <Int 0x7f09032a>
	//   31   73:invokeinterface #107 <Method View a.a(int)>
	//   32   78:checkcast       #134 <Class RecyclerView>
	//   33   81:putfield        #138 <Field RecyclerView i>
		b();
	//   34   84:aload_0         
	//   35   85:invokevirtual   #140 <Method void b()>
	//   36   88:return          
	}

	protected void b(FloorPlanListItem floorplanlistitem, int i)
	{
		org.androidannotations.api.b.a("", ((Runnable) (new a(this, floorplanlistitem, i) {

			public l a(HashMap hashmap, KeyStore keystore)
			{
				return ((l) (new g(hashmap, keystore)));
			//    0    0:new             #17  <Class g>
			//    1    3:dup             
			//    2    4:aload_1         
			//    3    5:aload_2         
			//    4    6:invokespecial   #20  <Method void g(HashMap, KeyStore)>
			//    5    9:areturn         
			}

		}
)), 0L);
	//    0    0:ldc1            #142 <String "">
	//    1    2:new             #10  <Class p$1>
	//    2    5:dup             
	//    3    6:aload_0         
	//    4    7:aload_1         
	//    5    8:iload_2         
	//    6    9:invokespecial   #144 <Method void p$1(p, FloorPlanListItem, int)>
	//    7   12:lconst_0        
	//    8   13:invokestatic    #149 <Method void org.androidannotations.api.b.a(String, Runnable, long)>
	//    9   16:return          
	}

	public void onCreate(Bundle bundle)
	{
		c c1 = c.a(n);
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field c n>
	//    2    4:invokestatic    #153 <Method c c.a(c)>
	//    3    7:astore_2        
		a(bundle);
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokespecial   #155 <Method void a(Bundle)>
		super.onCreate(bundle);
	//    7   13:aload_0         
	//    8   14:aload_1         
	//    9   15:invokespecial   #157 <Method void o.onCreate(Bundle)>
		c.a(c1);
	//   10   18:aload_2         
	//   11   19:invokestatic    #153 <Method c c.a(c)>
	//   12   22:pop             
	//   13   23:return          
	}

	public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
	{
		o = super.onCreateView(layoutinflater, viewgroup, bundle);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:aload_1         
	//    3    3:aload_2         
	//    4    4:aload_3         
	//    5    5:invokespecial   #161 <Method View o.onCreateView(LayoutInflater, ViewGroup, Bundle)>
	//    6    8:putfield        #96  <Field View o>
		if(o == null)
	//*   7   11:aload_0         
	//*   8   12:getfield        #96  <Field View o>
	//*   9   15:ifnonnull       30
			o = layoutinflater.inflate(0x7f0b0086, viewgroup, false);
	//   10   18:aload_0         
	//   11   19:aload_1         
	//   12   20:ldc1            #162 <Int 0x7f0b0086>
	//   13   22:aload_2         
	//   14   23:iconst_0        
	//   15   24:invokevirtual   #168 <Method View LayoutInflater.inflate(int, ViewGroup, boolean)>
	//   16   27:putfield        #96  <Field View o>
		return o;
	//   17   30:aload_0         
	//   18   31:getfield        #96  <Field View o>
	//   19   34:areturn         
	}

	public void onDestroyView()
	{
		super.onDestroyView();
	//    0    0:aload_0         
	//    1    1:invokespecial   #171 <Method void o.onDestroyView()>
		o = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #96  <Field View o>
		b = null;
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:putfield        #112 <Field Spinner b>
		c = null;
	//    8   14:aload_0         
	//    9   15:aconst_null     
	//   10   16:putfield        #116 <Field View c>
		d = null;
	//   11   19:aload_0         
	//   12   20:aconst_null     
	//   13   21:putfield        #123 <Field TextView d>
		e = null;
	//   14   24:aload_0         
	//   15   25:aconst_null     
	//   16   26:putfield        #127 <Field TextView e>
		f = null;
	//   17   29:aload_0         
	//   18   30:aconst_null     
	//   19   31:putfield        #131 <Field View f>
		i = null;
	//   20   34:aload_0         
	//   21   35:aconst_null     
	//   22   36:putfield        #138 <Field RecyclerView i>
	//   23   39:return          
	}

	public void onViewCreated(View view, Bundle bundle)
	{
		super.onViewCreated(view, bundle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #175 <Method void o.onViewCreated(View, Bundle)>
		n.a(((org.androidannotations.api.c.a) (this)));
	//    4    6:aload_0         
	//    5    7:getfield        #26  <Field c n>
	//    6   10:aload_0         
	//    7   11:invokevirtual   #177 <Method void c.a(a)>
	//    8   14:return          
	}

	private final c n = new c();
	private View o;
}

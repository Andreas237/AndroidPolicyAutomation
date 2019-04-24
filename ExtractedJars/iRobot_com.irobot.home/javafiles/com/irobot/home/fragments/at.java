// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.androidannotations.api.c.a;
import org.androidannotations.api.c.b;
import org.androidannotations.api.c.c;

// Referenced classes of package com.irobot.home.fragments:
//			as

public final class at extends as
	implements org.androidannotations.api.c.a, b
{
	public static class a extends org.androidannotations.api.a.c
	{

		public as a()
		{
			at at1 = new at();
		//    0    0:new             #7   <Class at>
		//    1    3:dup             
		//    2    4:invokespecial   #15  <Method void at()>
		//    3    7:astore_1        
			at1.setArguments(a);
		//    4    8:aload_1         
		//    5    9:aload_0         
		//    6   10:getfield        #18  <Field Bundle a>
		//    7   13:invokevirtual   #22  <Method void at.setArguments(Bundle)>
			return ((as) (at1));
		//    8   16:aload_1         
		//    9   17:areturn         
		}

		public a a(String s)
		{
			a.putString("assetId", s);
		//    0    0:aload_0         
		//    1    1:getfield        #18  <Field Bundle a>
		//    2    4:ldc1            #25  <String "assetId">
		//    3    6:aload_1         
		//    4    7:invokevirtual   #31  <Method void Bundle.putString(String, String)>
			return this;
		//    5   10:aload_0         
		//    6   11:areturn         
		}

		public a a(boolean flag)
		{
			a.putBoolean("promptForRobotSwUpdate", flag);
		//    0    0:aload_0         
		//    1    1:getfield        #18  <Field Bundle a>
		//    2    4:ldc1            #34  <String "promptForRobotSwUpdate">
		//    3    6:iload_1         
		//    4    7:invokevirtual   #38  <Method void Bundle.putBoolean(String, boolean)>
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


	public at()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #21  <Method void as()>
	//    2    4:aload_0         
	//    3    5:new             #23  <Class c>
	//    4    8:dup             
	//    5    9:invokespecial   #24  <Method void c()>
	//    6   12:putfield        #26  <Field c f>
	//    7   15:return          
	}

	private void a(Bundle bundle)
	{
		org.androidannotations.api.c.c.a(((b) (this)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #31  <Method void c.a(b)>
		d();
	//    2    4:aload_0         
	//    3    5:invokespecial   #34  <Method void d()>
	//    4    8:return          
	}

	public static a c()
	{
		return new a();
	//    0    0:new             #12  <Class at$a>
	//    1    3:dup             
	//    2    4:invokespecial   #37  <Method void at$a()>
	//    3    7:areturn         
	}

	private void d()
	{
		Bundle bundle = getArguments();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #41  <Method Bundle getArguments()>
	//    2    4:astore_1        
		if(bundle != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          47
		{
			if(bundle.containsKey("assetId"))
	//*   5    9:aload_1         
	//*   6   10:ldc1            #43  <String "assetId">
	//*   7   12:invokevirtual   #49  <Method boolean Bundle.containsKey(String)>
	//*   8   15:ifeq            28
				a = bundle.getString("assetId");
	//    9   18:aload_0         
	//   10   19:aload_1         
	//   11   20:ldc1            #43  <String "assetId">
	//   12   22:invokevirtual   #53  <Method String Bundle.getString(String)>
	//   13   25:putfield        #56  <Field String a>
			if(bundle.containsKey("promptForRobotSwUpdate"))
	//*  14   28:aload_1         
	//*  15   29:ldc1            #58  <String "promptForRobotSwUpdate">
	//*  16   31:invokevirtual   #49  <Method boolean Bundle.containsKey(String)>
	//*  17   34:ifeq            47
				b = bundle.getBoolean("promptForRobotSwUpdate");
	//   18   37:aload_0         
	//   19   38:aload_1         
	//   20   39:ldc1            #58  <String "promptForRobotSwUpdate">
	//   21   41:invokevirtual   #61  <Method boolean Bundle.getBoolean(String)>
	//   22   44:putfield        #65  <Field boolean b>
		}
	//   23   47:return          
	}

	public View a(int j)
	{
		if(i == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #68  <Field View i>
	//*   2    4:ifnonnull       9
			return null;
	//    3    7:aconst_null     
	//    4    8:areturn         
		else
			return i.findViewById(j);
	//    5    9:aload_0         
	//    6   10:getfield        #68  <Field View i>
	//    7   13:iload_1         
	//    8   14:invokevirtual   #73  <Method View View.findViewById(int)>
	//    9   17:areturn         
	}

	public void a(org.androidannotations.api.c.a a1)
	{
		c = (TextView)a1.a(0x7f090268);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc1            #77  <Int 0x7f090268>
	//    3    4:invokeinterface #79  <Method View a.a(int)>
	//    4    9:checkcast       #81  <Class TextView>
	//    5   12:putfield        #84  <Field TextView c>
		d = (ImageView)a1.a(0x7f090267);
	//    6   15:aload_0         
	//    7   16:aload_1         
	//    8   17:ldc1            #85  <Int 0x7f090267>
	//    9   19:invokeinterface #79  <Method View a.a(int)>
	//   10   24:checkcast       #87  <Class ImageView>
	//   11   27:putfield        #90  <Field ImageView d>
		e = (LinearLayout)a1.a(0x7f090368);
	//   12   30:aload_0         
	//   13   31:aload_1         
	//   14   32:ldc1            #91  <Int 0x7f090368>
	//   15   34:invokeinterface #79  <Method View a.a(int)>
	//   16   39:checkcast       #93  <Class LinearLayout>
	//   17   42:putfield        #97  <Field LinearLayout e>
		a1 = ((org.androidannotations.api.c.a) (a1.a(0x7f090367)));
	//   18   45:aload_1         
	//   19   46:ldc1            #98  <Int 0x7f090367>
	//   20   48:invokeinterface #79  <Method View a.a(int)>
	//   21   53:astore_1        
		if(a1 != null)
	//*  22   54:aload_1         
	//*  23   55:ifnull          70
			((View) (a1)).setOnClickListener(new android.view.View.OnClickListener() {

				public void onClick(View view)
				{
					a.b();
				//    0    0:aload_0         
				//    1    1:getfield        #16  <Field at a>
				//    2    4:invokevirtual   #25  <Method void com.irobot.home.fragments.at.b()>
				//    3    7:return          
				}

				final at a;

			
			{
				a = at.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field at a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
			}
);
	//   24   58:aload_1         
	//   25   59:new             #10  <Class at$1>
	//   26   62:dup             
	//   27   63:aload_0         
	//   28   64:invokespecial   #101 <Method void at$1(at)>
	//   29   67:invokevirtual   #105 <Method void View.setOnClickListener(android.view.View$OnClickListener)>
		a();
	//   30   70:aload_0         
	//   31   71:invokevirtual   #107 <Method void a()>
	//   32   74:return          
	}

	public void onCreate(Bundle bundle)
	{
		c c1 = org.androidannotations.api.c.c.a(f);
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field c f>
	//    2    4:invokestatic    #111 <Method c c.a(c)>
	//    3    7:astore_2        
		a(bundle);
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokespecial   #113 <Method void a(Bundle)>
		super.onCreate(bundle);
	//    7   13:aload_0         
	//    8   14:aload_1         
	//    9   15:invokespecial   #115 <Method void as.onCreate(Bundle)>
		org.androidannotations.api.c.c.a(c1);
	//   10   18:aload_2         
	//   11   19:invokestatic    #111 <Method c c.a(c)>
	//   12   22:pop             
	//   13   23:return          
	}

	public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
	{
		i = super.onCreateView(layoutinflater, viewgroup, bundle);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:aload_1         
	//    3    3:aload_2         
	//    4    4:aload_3         
	//    5    5:invokespecial   #119 <Method View as.onCreateView(LayoutInflater, ViewGroup, Bundle)>
	//    6    8:putfield        #68  <Field View i>
		if(i == null)
	//*   7   11:aload_0         
	//*   8   12:getfield        #68  <Field View i>
	//*   9   15:ifnonnull       30
			i = layoutinflater.inflate(0x7f0b00c2, viewgroup, false);
	//   10   18:aload_0         
	//   11   19:aload_1         
	//   12   20:ldc1            #120 <Int 0x7f0b00c2>
	//   13   22:aload_2         
	//   14   23:iconst_0        
	//   15   24:invokevirtual   #126 <Method View LayoutInflater.inflate(int, ViewGroup, boolean)>
	//   16   27:putfield        #68  <Field View i>
		return i;
	//   17   30:aload_0         
	//   18   31:getfield        #68  <Field View i>
	//   19   34:areturn         
	}

	public void onDestroyView()
	{
		super.onDestroyView();
	//    0    0:aload_0         
	//    1    1:invokespecial   #129 <Method void as.onDestroyView()>
		i = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #68  <Field View i>
		c = null;
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:putfield        #84  <Field TextView c>
		d = null;
	//    8   14:aload_0         
	//    9   15:aconst_null     
	//   10   16:putfield        #90  <Field ImageView d>
		e = null;
	//   11   19:aload_0         
	//   12   20:aconst_null     
	//   13   21:putfield        #97  <Field LinearLayout e>
	//   14   24:return          
	}

	public void onViewCreated(View view, Bundle bundle)
	{
		super.onViewCreated(view, bundle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #133 <Method void as.onViewCreated(View, Bundle)>
		f.a(((org.androidannotations.api.c.a) (this)));
	//    4    6:aload_0         
	//    5    7:getfield        #26  <Field c f>
	//    6   10:aload_0         
	//    7   11:invokevirtual   #135 <Method void c.a(a)>
	//    8   14:return          
	}

	private final c f = new c();
	private View i;
}

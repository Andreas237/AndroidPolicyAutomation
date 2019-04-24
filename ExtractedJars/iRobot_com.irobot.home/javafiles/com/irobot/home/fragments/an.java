// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import org.androidannotations.api.c.a;
import org.androidannotations.api.c.b;
import org.androidannotations.api.c.c;

// Referenced classes of package com.irobot.home.fragments:
//			am

public final class an extends am
	implements org.androidannotations.api.c.a, b
{
	public static class a extends org.androidannotations.api.a.c
	{

		public am a()
		{
			an an1 = new an();
		//    0    0:new             #7   <Class an>
		//    1    3:dup             
		//    2    4:invokespecial   #15  <Method void an()>
		//    3    7:astore_1        
			an1.setArguments(a);
		//    4    8:aload_1         
		//    5    9:aload_0         
		//    6   10:getfield        #18  <Field Bundle a>
		//    7   13:invokevirtual   #22  <Method void an.setArguments(Bundle)>
			return ((am) (an1));
		//    8   16:aload_1         
		//    9   17:areturn         
		}

		public a a(int i)
		{
			a.putInt("missionId", i);
		//    0    0:aload_0         
		//    1    1:getfield        #18  <Field Bundle a>
		//    2    4:ldc1            #25  <String "missionId">
		//    3    6:iload_1         
		//    4    7:invokevirtual   #31  <Method void Bundle.putInt(String, int)>
			return this;
		//    5   10:aload_0         
		//    6   11:areturn         
		}

		public a a(String s)
		{
			a.putString("assetId", s);
		//    0    0:aload_0         
		//    1    1:getfield        #18  <Field Bundle a>
		//    2    4:ldc1            #34  <String "assetId">
		//    3    6:aload_1         
		//    4    7:invokevirtual   #38  <Method void Bundle.putString(String, String)>
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


	public an()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #21  <Method void am()>
	//    2    4:aload_0         
	//    3    5:new             #23  <Class c>
	//    4    8:dup             
	//    5    9:invokespecial   #24  <Method void c()>
	//    6   12:putfield        #26  <Field c j>
	//    7   15:return          
	}

	private void a(Bundle bundle)
	{
		c.a(((b) (this)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #31  <Method void c.a(b)>
		e();
	//    2    4:aload_0         
	//    3    5:invokespecial   #34  <Method void e()>
	//    4    8:return          
	}

	public static a d()
	{
		return new a();
	//    0    0:new             #12  <Class an$a>
	//    1    3:dup             
	//    2    4:invokespecial   #37  <Method void an$a()>
	//    3    7:areturn         
	}

	private void e()
	{
		Bundle bundle = getArguments();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #41  <Method Bundle getArguments()>
	//    2    4:astore_1        
		if(bundle != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          47
		{
			if(bundle.containsKey("missionId"))
	//*   5    9:aload_1         
	//*   6   10:ldc1            #43  <String "missionId">
	//*   7   12:invokevirtual   #49  <Method boolean Bundle.containsKey(String)>
	//*   8   15:ifeq            28
				a = bundle.getInt("missionId");
	//    9   18:aload_0         
	//   10   19:aload_1         
	//   11   20:ldc1            #43  <String "missionId">
	//   12   22:invokevirtual   #53  <Method int Bundle.getInt(String)>
	//   13   25:putfield        #56  <Field int a>
			if(bundle.containsKey("assetId"))
	//*  14   28:aload_1         
	//*  15   29:ldc1            #58  <String "assetId">
	//*  16   31:invokevirtual   #49  <Method boolean Bundle.containsKey(String)>
	//*  17   34:ifeq            47
				b = bundle.getString("assetId");
	//   18   37:aload_0         
	//   19   38:aload_1         
	//   20   39:ldc1            #58  <String "assetId">
	//   21   41:invokevirtual   #62  <Method String Bundle.getString(String)>
	//   22   44:putfield        #66  <Field String b>
		}
	//   23   47:return          
	}

	public View a(int i)
	{
		if(k == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #69  <Field View k>
	//*   2    4:ifnonnull       9
			return null;
	//    3    7:aconst_null     
	//    4    8:areturn         
		else
			return k.findViewById(i);
	//    5    9:aload_0         
	//    6   10:getfield        #69  <Field View k>
	//    7   13:iload_1         
	//    8   14:invokevirtual   #74  <Method View View.findViewById(int)>
	//    9   17:areturn         
	}

	public void a(org.androidannotations.api.c.a a1)
	{
		c = (TextView)a1.a(0x7f090130);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc1            #78  <Int 0x7f090130>
	//    3    4:invokeinterface #80  <Method View a.a(int)>
	//    4    9:checkcast       #82  <Class TextView>
	//    5   12:putfield        #86  <Field TextView c>
		d = (RelativeLayout)a1.a(0x7f09015f);
	//    6   15:aload_0         
	//    7   16:aload_1         
	//    8   17:ldc1            #87  <Int 0x7f09015f>
	//    9   19:invokeinterface #80  <Method View a.a(int)>
	//   10   24:checkcast       #89  <Class RelativeLayout>
	//   11   27:putfield        #92  <Field RelativeLayout d>
		e = (RelativeLayout)a1.a(0x7f090409);
	//   12   30:aload_0         
	//   13   31:aload_1         
	//   14   32:ldc1            #93  <Int 0x7f090409>
	//   15   34:invokeinterface #80  <Method View a.a(int)>
	//   16   39:checkcast       #89  <Class RelativeLayout>
	//   17   42:putfield        #95  <Field RelativeLayout e>
		f = (RelativeLayout)a1.a(0x7f090410);
	//   18   45:aload_0         
	//   19   46:aload_1         
	//   20   47:ldc1            #96  <Int 0x7f090410>
	//   21   49:invokeinterface #80  <Method View a.a(int)>
	//   22   54:checkcast       #89  <Class RelativeLayout>
	//   23   57:putfield        #99  <Field RelativeLayout f>
		i = (RelativeLayout)a1.a(0x7f090150);
	//   24   60:aload_0         
	//   25   61:aload_1         
	//   26   62:ldc1            #100 <Int 0x7f090150>
	//   27   64:invokeinterface #80  <Method View a.a(int)>
	//   28   69:checkcast       #89  <Class RelativeLayout>
	//   29   72:putfield        #103 <Field RelativeLayout i>
		a1 = ((org.androidannotations.api.c.a) (a1.a(0x7f0901c4)));
	//   30   75:aload_1         
	//   31   76:ldc1            #104 <Int 0x7f0901c4>
	//   32   78:invokeinterface #80  <Method View a.a(int)>
	//   33   83:astore_1        
		if(a1 != null)
	//*  34   84:aload_1         
	//*  35   85:ifnull          100
			((View) (a1)).setOnClickListener(new android.view.View.OnClickListener() {

				public void onClick(View view)
				{
					a.b();
				//    0    0:aload_0         
				//    1    1:getfield        #16  <Field an a>
				//    2    4:invokevirtual   #25  <Method void com.irobot.home.fragments.an.b()>
				//    3    7:return          
				}

				final an a;

			
			{
				a = an.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field an a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
			}
);
	//   36   88:aload_1         
	//   37   89:new             #10  <Class an$1>
	//   38   92:dup             
	//   39   93:aload_0         
	//   40   94:invokespecial   #107 <Method void an$1(an)>
	//   41   97:invokevirtual   #111 <Method void View.setOnClickListener(android.view.View$OnClickListener)>
		a();
	//   42  100:aload_0         
	//   43  101:invokevirtual   #113 <Method void a()>
	//   44  104:return          
	}

	public void onCreate(Bundle bundle)
	{
		c c1 = c.a(j);
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field c j>
	//    2    4:invokestatic    #117 <Method c c.a(c)>
	//    3    7:astore_2        
		a(bundle);
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokespecial   #119 <Method void a(Bundle)>
		super.onCreate(bundle);
	//    7   13:aload_0         
	//    8   14:aload_1         
	//    9   15:invokespecial   #121 <Method void am.onCreate(Bundle)>
		c.a(c1);
	//   10   18:aload_2         
	//   11   19:invokestatic    #117 <Method c c.a(c)>
	//   12   22:pop             
	//   13   23:return          
	}

	public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
	{
		k = super.onCreateView(layoutinflater, viewgroup, bundle);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:aload_1         
	//    3    3:aload_2         
	//    4    4:aload_3         
	//    5    5:invokespecial   #125 <Method View am.onCreateView(LayoutInflater, ViewGroup, Bundle)>
	//    6    8:putfield        #69  <Field View k>
		if(k == null)
	//*   7   11:aload_0         
	//*   8   12:getfield        #69  <Field View k>
	//*   9   15:ifnonnull       30
			k = layoutinflater.inflate(0x7f0b00be, viewgroup, false);
	//   10   18:aload_0         
	//   11   19:aload_1         
	//   12   20:ldc1            #126 <Int 0x7f0b00be>
	//   13   22:aload_2         
	//   14   23:iconst_0        
	//   15   24:invokevirtual   #132 <Method View LayoutInflater.inflate(int, ViewGroup, boolean)>
	//   16   27:putfield        #69  <Field View k>
		return k;
	//   17   30:aload_0         
	//   18   31:getfield        #69  <Field View k>
	//   19   34:areturn         
	}

	public void onDestroyView()
	{
		super.onDestroyView();
	//    0    0:aload_0         
	//    1    1:invokespecial   #135 <Method void am.onDestroyView()>
		k = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #69  <Field View k>
		c = null;
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:putfield        #86  <Field TextView c>
		d = null;
	//    8   14:aload_0         
	//    9   15:aconst_null     
	//   10   16:putfield        #92  <Field RelativeLayout d>
		e = null;
	//   11   19:aload_0         
	//   12   20:aconst_null     
	//   13   21:putfield        #95  <Field RelativeLayout e>
		f = null;
	//   14   24:aload_0         
	//   15   25:aconst_null     
	//   16   26:putfield        #99  <Field RelativeLayout f>
		i = null;
	//   17   29:aload_0         
	//   18   30:aconst_null     
	//   19   31:putfield        #103 <Field RelativeLayout i>
	//   20   34:return          
	}

	public void onViewCreated(View view, Bundle bundle)
	{
		super.onViewCreated(view, bundle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #139 <Method void am.onViewCreated(View, Bundle)>
		j.a(((org.androidannotations.api.c.a) (this)));
	//    4    6:aload_0         
	//    5    7:getfield        #26  <Field c j>
	//    6   10:aload_0         
	//    7   11:invokevirtual   #141 <Method void c.a(a)>
	//    8   14:return          
	}

	private final c j = new c();
	private View k;
}

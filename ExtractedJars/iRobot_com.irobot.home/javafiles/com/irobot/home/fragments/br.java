// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.irobot.home.IRobotApplication_;
import com.irobot.home.util.AssetSoftwareUpdateUtils_;
import org.androidannotations.api.c.a;
import org.androidannotations.api.c.b;
import org.androidannotations.api.c.c;

// Referenced classes of package com.irobot.home.fragments:
//			bq

public final class br extends bq
	implements org.androidannotations.api.c.a, b
{
	public static class a extends org.androidannotations.api.a.c
	{

		public bq a()
		{
			br br1 = new br();
		//    0    0:new             #7   <Class br>
		//    1    3:dup             
		//    2    4:invokespecial   #15  <Method void br()>
		//    3    7:astore_1        
			br1.setArguments(a);
		//    4    8:aload_1         
		//    5    9:aload_0         
		//    6   10:getfield        #18  <Field Bundle a>
		//    7   13:invokevirtual   #22  <Method void br.setArguments(Bundle)>
			return ((bq) (br1));
		//    8   16:aload_1         
		//    9   17:areturn         
		}

		public a()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #12  <Method void org.androidannotations.api.a.c()>
		//    2    4:return          
		}
	}


	public br()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #23  <Method void bq()>
	//    2    4:aload_0         
	//    3    5:new             #25  <Class c>
	//    4    8:dup             
	//    5    9:invokespecial   #26  <Method void c()>
	//    6   12:putfield        #28  <Field c h>
	//    7   15:return          
	}

	private void a(Bundle bundle)
	{
		c.a(((b) (this)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #33  <Method void c.a(b)>
		a = IRobotApplication_.r();
	//    2    4:aload_0         
	//    3    5:invokestatic    #39  <Method com.irobot.home.IRobotApplication IRobotApplication_.r()>
	//    4    8:putfield        #42  <Field com.irobot.home.IRobotApplication a>
		b = ((com.irobot.home.util.AssetSoftwareUpdateUtils) (AssetSoftwareUpdateUtils_.a(((android.content.Context) (getActivity())))));
	//    5   11:aload_0         
	//    6   12:aload_0         
	//    7   13:invokevirtual   #46  <Method android.app.Activity getActivity()>
	//    8   16:invokestatic    #51  <Method AssetSoftwareUpdateUtils_ AssetSoftwareUpdateUtils_.a(android.content.Context)>
	//    9   19:putfield        #55  <Field com.irobot.home.util.AssetSoftwareUpdateUtils b>
	//   10   22:return          
	}

	static void a(br br1)
	{
		((bq) (br1)).com.irobot.home.fragments.bq.b();
	//    0    0:aload_0         
	//    1    1:invokespecial   #58  <Method void com.irobot.home.fragments.bq.b()>
	//    2    4:return          
	}

	public static a d()
	{
		return new a();
	//    0    0:new             #14  <Class br$a>
	//    1    3:dup             
	//    2    4:invokespecial   #61  <Method void br$a()>
	//    3    7:areturn         
	}

	public View a(int j)
	{
		if(i == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #64  <Field View i>
	//*   2    4:ifnonnull       9
			return null;
	//    3    7:aconst_null     
	//    4    8:areturn         
		else
			return i.findViewById(j);
	//    5    9:aload_0         
	//    6   10:getfield        #64  <Field View i>
	//    7   13:iload_1         
	//    8   14:invokevirtual   #69  <Method View View.findViewById(int)>
	//    9   17:areturn         
	}

	public void a(org.androidannotations.api.c.a a1)
	{
		d = (FrameLayout)a1.a(0x7f090223);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc1            #73  <Int 0x7f090223>
	//    3    4:invokeinterface #75  <Method View a.a(int)>
	//    4    9:checkcast       #77  <Class FrameLayout>
	//    5   12:putfield        #80  <Field FrameLayout d>
		e = (LinearLayout)a1.a(0x7f0903bb);
	//    6   15:aload_0         
	//    7   16:aload_1         
	//    8   17:ldc1            #81  <Int 0x7f0903bb>
	//    9   19:invokeinterface #75  <Method View a.a(int)>
	//   10   24:checkcast       #83  <Class LinearLayout>
	//   11   27:putfield        #87  <Field LinearLayout e>
		a1 = ((org.androidannotations.api.c.a) (a1.a(0x7f090324)));
	//   12   30:aload_1         
	//   13   31:ldc1            #88  <Int 0x7f090324>
	//   14   33:invokeinterface #75  <Method View a.a(int)>
	//   15   38:astore_1        
		if(a1 != null)
	//*  16   39:aload_1         
	//*  17   40:ifnull          55
			((View) (a1)).setOnClickListener(new android.view.View.OnClickListener() {

				public void onClick(View view)
				{
					a.c();
				//    0    0:aload_0         
				//    1    1:getfield        #16  <Field br a>
				//    2    4:invokevirtual   #25  <Method void com.irobot.home.fragments.br.c()>
				//    3    7:return          
				}

				final br a;

			
			{
				a = br.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field br a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
			}
);
	//   18   43:aload_1         
	//   19   44:new             #10  <Class br$1>
	//   20   47:dup             
	//   21   48:aload_0         
	//   22   49:invokespecial   #90  <Method void br$1(br)>
	//   23   52:invokevirtual   #94  <Method void View.setOnClickListener(android.view.View$OnClickListener)>
		a();
	//   24   55:aload_0         
	//   25   56:invokevirtual   #96  <Method void a()>
	//   26   59:return          
	}

	public void b()
	{
		org.androidannotations.api.b.a("", new Runnable() {

			public void run()
			{
				com.irobot.home.fragments.br.a(a);
			//    0    0:aload_0         
			//    1    1:getfield        #17  <Field br a>
			//    2    4:invokestatic    #23  <Method void com.irobot.home.fragments.br.a(br)>
			//    3    7:return          
			}

			final br a;

			
			{
				a = br.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field br a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
		}
, 0L);
	//    0    0:ldc1            #98  <String "">
	//    1    2:new             #12  <Class br$2>
	//    2    5:dup             
	//    3    6:aload_0         
	//    4    7:invokespecial   #99  <Method void br$2(br)>
	//    5   10:lconst_0        
	//    6   11:invokestatic    #104 <Method void org.androidannotations.api.b.a(String, Runnable, long)>
	//    7   14:return          
	}

	public void onCreate(Bundle bundle)
	{
		c c1 = c.a(h);
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field c h>
	//    2    4:invokestatic    #108 <Method c c.a(c)>
	//    3    7:astore_2        
		a(bundle);
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokespecial   #110 <Method void a(Bundle)>
		super.onCreate(bundle);
	//    7   13:aload_0         
	//    8   14:aload_1         
	//    9   15:invokespecial   #112 <Method void bq.onCreate(Bundle)>
		c.a(c1);
	//   10   18:aload_2         
	//   11   19:invokestatic    #108 <Method c c.a(c)>
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
	//    5    5:invokespecial   #116 <Method View bq.onCreateView(LayoutInflater, ViewGroup, Bundle)>
	//    6    8:putfield        #64  <Field View i>
		if(i == null)
	//*   7   11:aload_0         
	//*   8   12:getfield        #64  <Field View i>
	//*   9   15:ifnonnull       30
			i = layoutinflater.inflate(0x7f0b00c6, viewgroup, false);
	//   10   18:aload_0         
	//   11   19:aload_1         
	//   12   20:ldc1            #117 <Int 0x7f0b00c6>
	//   13   22:aload_2         
	//   14   23:iconst_0        
	//   15   24:invokevirtual   #123 <Method View LayoutInflater.inflate(int, ViewGroup, boolean)>
	//   16   27:putfield        #64  <Field View i>
		return i;
	//   17   30:aload_0         
	//   18   31:getfield        #64  <Field View i>
	//   19   34:areturn         
	}

	public void onDestroyView()
	{
		super.onDestroyView();
	//    0    0:aload_0         
	//    1    1:invokespecial   #126 <Method void bq.onDestroyView()>
		i = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #64  <Field View i>
		d = null;
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:putfield        #80  <Field FrameLayout d>
		e = null;
	//    8   14:aload_0         
	//    9   15:aconst_null     
	//   10   16:putfield        #87  <Field LinearLayout e>
	//   11   19:return          
	}

	public void onViewCreated(View view, Bundle bundle)
	{
		super.onViewCreated(view, bundle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #130 <Method void bq.onViewCreated(View, Bundle)>
		h.a(((org.androidannotations.api.c.a) (this)));
	//    4    6:aload_0         
	//    5    7:getfield        #28  <Field c h>
	//    6   10:aload_0         
	//    7   11:invokevirtual   #132 <Method void c.a(a)>
	//    8   14:return          
	}

	private final c h = new c();
	private View i;
}

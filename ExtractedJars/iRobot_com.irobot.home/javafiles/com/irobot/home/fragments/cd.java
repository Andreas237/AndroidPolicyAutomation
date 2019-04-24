// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.androidannotations.api.c.a;
import org.androidannotations.api.c.b;
import org.androidannotations.api.c.c;

// Referenced classes of package com.irobot.home.fragments:
//			cc

public final class cd extends cc
	implements org.androidannotations.api.c.a, b
{
	public static class a extends org.androidannotations.api.a.c
	{

		public cc a()
		{
			cd cd1 = new cd();
		//    0    0:new             #7   <Class cd>
		//    1    3:dup             
		//    2    4:invokespecial   #15  <Method void cd()>
		//    3    7:astore_1        
			cd1.setArguments(a);
		//    4    8:aload_1         
		//    5    9:aload_0         
		//    6   10:getfield        #18  <Field Bundle a>
		//    7   13:invokevirtual   #22  <Method void cd.setArguments(Bundle)>
			return ((cc) (cd1));
		//    8   16:aload_1         
		//    9   17:areturn         
		}

		public a a(int i)
		{
			a.putInt("resId", i);
		//    0    0:aload_0         
		//    1    1:getfield        #18  <Field Bundle a>
		//    2    4:ldc1            #25  <String "resId">
		//    3    6:iload_1         
		//    4    7:invokevirtual   #31  <Method void Bundle.putInt(String, int)>
			return this;
		//    5   10:aload_0         
		//    6   11:areturn         
		}

		public a b(int i)
		{
			a.putInt("subtitleResId", i);
		//    0    0:aload_0         
		//    1    1:getfield        #18  <Field Bundle a>
		//    2    4:ldc1            #34  <String "subtitleResId">
		//    3    6:iload_1         
		//    4    7:invokevirtual   #31  <Method void Bundle.putInt(String, int)>
			return this;
		//    5   10:aload_0         
		//    6   11:areturn         
		}

		public a c(int i)
		{
			a.putInt("descriptionResId", i);
		//    0    0:aload_0         
		//    1    1:getfield        #18  <Field Bundle a>
		//    2    4:ldc1            #37  <String "descriptionResId">
		//    3    6:iload_1         
		//    4    7:invokevirtual   #31  <Method void Bundle.putInt(String, int)>
			return this;
		//    5   10:aload_0         
		//    6   11:areturn         
		}

		public a d(int i)
		{
			a.putInt("welcomeScreenId", i);
		//    0    0:aload_0         
		//    1    1:getfield        #18  <Field Bundle a>
		//    2    4:ldc1            #40  <String "welcomeScreenId">
		//    3    6:iload_1         
		//    4    7:invokevirtual   #31  <Method void Bundle.putInt(String, int)>
			return this;
		//    5   10:aload_0         
		//    6   11:areturn         
		}

		public a e(int i)
		{
			a.putInt("replayButtonResId", i);
		//    0    0:aload_0         
		//    1    1:getfield        #18  <Field Bundle a>
		//    2    4:ldc1            #43  <String "replayButtonResId">
		//    3    6:iload_1         
		//    4    7:invokevirtual   #31  <Method void Bundle.putInt(String, int)>
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


	public cd()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #21  <Method void cc()>
	//    2    4:aload_0         
	//    3    5:new             #23  <Class c>
	//    4    8:dup             
	//    5    9:invokespecial   #24  <Method void c()>
	//    6   12:putfield        #26  <Field c l>
	//    7   15:return          
	}

	private void a(Bundle bundle)
	{
		c.a(((b) (this)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #31  <Method void c.a(b)>
		f();
	//    2    4:aload_0         
	//    3    5:invokespecial   #34  <Method void f()>
	//    4    8:return          
	}

	public static a e()
	{
		return new a();
	//    0    0:new             #12  <Class cd$a>
	//    1    3:dup             
	//    2    4:invokespecial   #37  <Method void cd$a()>
	//    3    7:areturn         
	}

	private void f()
	{
		Bundle bundle = getArguments();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #41  <Method Bundle getArguments()>
	//    2    4:astore_1        
		if(bundle != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          123
		{
			if(bundle.containsKey("resId"))
	//*   5    9:aload_1         
	//*   6   10:ldc1            #43  <String "resId">
	//*   7   12:invokevirtual   #49  <Method boolean Bundle.containsKey(String)>
	//*   8   15:ifeq            28
				f = bundle.getInt("resId");
	//    9   18:aload_0         
	//   10   19:aload_1         
	//   11   20:ldc1            #43  <String "resId">
	//   12   22:invokevirtual   #53  <Method int Bundle.getInt(String)>
	//   13   25:putfield        #56  <Field int f>
			if(bundle.containsKey("subtitleResId"))
	//*  14   28:aload_1         
	//*  15   29:ldc1            #58  <String "subtitleResId">
	//*  16   31:invokevirtual   #49  <Method boolean Bundle.containsKey(String)>
	//*  17   34:ifeq            47
				g = bundle.getInt("subtitleResId");
	//   18   37:aload_0         
	//   19   38:aload_1         
	//   20   39:ldc1            #58  <String "subtitleResId">
	//   21   41:invokevirtual   #53  <Method int Bundle.getInt(String)>
	//   22   44:putfield        #61  <Field int g>
			if(bundle.containsKey("descriptionResId"))
	//*  23   47:aload_1         
	//*  24   48:ldc1            #63  <String "descriptionResId">
	//*  25   50:invokevirtual   #49  <Method boolean Bundle.containsKey(String)>
	//*  26   53:ifeq            66
				h = bundle.getInt("descriptionResId");
	//   27   56:aload_0         
	//   28   57:aload_1         
	//   29   58:ldc1            #63  <String "descriptionResId">
	//   30   60:invokevirtual   #53  <Method int Bundle.getInt(String)>
	//   31   63:putfield        #66  <Field int h>
			if(bundle.containsKey("welcomeScreenId"))
	//*  32   66:aload_1         
	//*  33   67:ldc1            #68  <String "welcomeScreenId">
	//*  34   69:invokevirtual   #49  <Method boolean Bundle.containsKey(String)>
	//*  35   72:ifeq            85
				i = bundle.getInt("welcomeScreenId");
	//   36   75:aload_0         
	//   37   76:aload_1         
	//   38   77:ldc1            #68  <String "welcomeScreenId">
	//   39   79:invokevirtual   #53  <Method int Bundle.getInt(String)>
	//   40   82:putfield        #71  <Field int i>
			if(bundle.containsKey("replayButtonResId"))
	//*  41   85:aload_1         
	//*  42   86:ldc1            #73  <String "replayButtonResId">
	//*  43   88:invokevirtual   #49  <Method boolean Bundle.containsKey(String)>
	//*  44   91:ifeq            104
				j = bundle.getInt("replayButtonResId");
	//   45   94:aload_0         
	//   46   95:aload_1         
	//   47   96:ldc1            #73  <String "replayButtonResId">
	//   48   98:invokevirtual   #53  <Method int Bundle.getInt(String)>
	//   49  101:putfield        #76  <Field int j>
			if(bundle.containsKey("isImageRes"))
	//*  50  104:aload_1         
	//*  51  105:ldc1            #78  <String "isImageRes">
	//*  52  107:invokevirtual   #49  <Method boolean Bundle.containsKey(String)>
	//*  53  110:ifeq            123
				k = bundle.getBoolean("isImageRes");
	//   54  113:aload_0         
	//   55  114:aload_1         
	//   56  115:ldc1            #78  <String "isImageRes">
	//   57  117:invokevirtual   #81  <Method boolean Bundle.getBoolean(String)>
	//   58  120:putfield        #85  <Field boolean k>
		}
	//   59  123:return          
	}

	public View a(int i)
	{
		if(n == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #88  <Field View n>
	//*   2    4:ifnonnull       9
			return null;
	//    3    7:aconst_null     
	//    4    8:areturn         
		else
			return n.findViewById(i);
	//    5    9:aload_0         
	//    6   10:getfield        #88  <Field View n>
	//    7   13:iload_1         
	//    8   14:invokevirtual   #93  <Method View View.findViewById(int)>
	//    9   17:areturn         
	}

	public void a(org.androidannotations.api.c.a a1)
	{
		a = (FrameLayout)a1.a(0x7f0903d0);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc1            #97  <Int 0x7f0903d0>
	//    3    4:invokeinterface #99  <Method View a.a(int)>
	//    4    9:checkcast       #101 <Class FrameLayout>
	//    5   12:putfield        #104 <Field FrameLayout a>
		b = (TextView)a1.a(0x7f0903d1);
	//    6   15:aload_0         
	//    7   16:aload_1         
	//    8   17:ldc1            #105 <Int 0x7f0903d1>
	//    9   19:invokeinterface #99  <Method View a.a(int)>
	//   10   24:checkcast       #107 <Class TextView>
	//   11   27:putfield        #111 <Field TextView b>
		c = (TextView)a1.a(0x7f0903cc);
	//   12   30:aload_0         
	//   13   31:aload_1         
	//   14   32:ldc1            #112 <Int 0x7f0903cc>
	//   15   34:invokeinterface #99  <Method View a.a(int)>
	//   16   39:checkcast       #107 <Class TextView>
	//   17   42:putfield        #115 <Field TextView c>
		d = (LinearLayout)a1.a(0x7f090434);
	//   18   45:aload_0         
	//   19   46:aload_1         
	//   20   47:ldc1            #116 <Int 0x7f090434>
	//   21   49:invokeinterface #99  <Method View a.a(int)>
	//   22   54:checkcast       #118 <Class LinearLayout>
	//   23   57:putfield        #122 <Field LinearLayout d>
		e = (ImageButton)a1.a(0x7f090335);
	//   24   60:aload_0         
	//   25   61:aload_1         
	//   26   62:ldc1            #123 <Int 0x7f090335>
	//   27   64:invokeinterface #99  <Method View a.a(int)>
	//   28   69:checkcast       #125 <Class ImageButton>
	//   29   72:putfield        #128 <Field ImageButton e>
		if(e != null)
	//*  30   75:aload_0         
	//*  31   76:getfield        #128 <Field ImageButton e>
	//*  32   79:ifnull          97
			e.setOnClickListener(new android.view.View.OnClickListener() {

				public void onClick(View view)
				{
					a.c();
				//    0    0:aload_0         
				//    1    1:getfield        #16  <Field cd a>
				//    2    4:invokevirtual   #25  <Method void com.irobot.home.fragments.cd.c()>
				//    3    7:return          
				}

				final cd a;

			
			{
				a = cd.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field cd a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
			}
);
	//   33   82:aload_0         
	//   34   83:getfield        #128 <Field ImageButton e>
	//   35   86:new             #10  <Class cd$1>
	//   36   89:dup             
	//   37   90:aload_0         
	//   38   91:invokespecial   #131 <Method void cd$1(cd)>
	//   39   94:invokevirtual   #135 <Method void ImageButton.setOnClickListener(android.view.View$OnClickListener)>
		b();
	//   40   97:aload_0         
	//   41   98:invokevirtual   #137 <Method void b()>
	//   42  101:return          
	}

	public void onCreate(Bundle bundle)
	{
		c c1 = c.a(l);
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field c l>
	//    2    4:invokestatic    #141 <Method c c.a(c)>
	//    3    7:astore_2        
		a(bundle);
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokespecial   #143 <Method void a(Bundle)>
		super.onCreate(bundle);
	//    7   13:aload_0         
	//    8   14:aload_1         
	//    9   15:invokespecial   #145 <Method void cc.onCreate(Bundle)>
		c.a(c1);
	//   10   18:aload_2         
	//   11   19:invokestatic    #141 <Method c c.a(c)>
	//   12   22:pop             
	//   13   23:return          
	}

	public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
	{
		n = super.onCreateView(layoutinflater, viewgroup, bundle);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:aload_1         
	//    3    3:aload_2         
	//    4    4:aload_3         
	//    5    5:invokespecial   #149 <Method View cc.onCreateView(LayoutInflater, ViewGroup, Bundle)>
	//    6    8:putfield        #88  <Field View n>
		if(n == null)
	//*   7   11:aload_0         
	//*   8   12:getfield        #88  <Field View n>
	//*   9   15:ifnonnull       30
			n = layoutinflater.inflate(0x7f0b00db, viewgroup, false);
	//   10   18:aload_0         
	//   11   19:aload_1         
	//   12   20:ldc1            #150 <Int 0x7f0b00db>
	//   13   22:aload_2         
	//   14   23:iconst_0        
	//   15   24:invokevirtual   #156 <Method View LayoutInflater.inflate(int, ViewGroup, boolean)>
	//   16   27:putfield        #88  <Field View n>
		return n;
	//   17   30:aload_0         
	//   18   31:getfield        #88  <Field View n>
	//   19   34:areturn         
	}

	public void onDestroyView()
	{
		super.onDestroyView();
	//    0    0:aload_0         
	//    1    1:invokespecial   #159 <Method void cc.onDestroyView()>
		n = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #88  <Field View n>
		a = null;
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:putfield        #104 <Field FrameLayout a>
		b = null;
	//    8   14:aload_0         
	//    9   15:aconst_null     
	//   10   16:putfield        #111 <Field TextView b>
		c = null;
	//   11   19:aload_0         
	//   12   20:aconst_null     
	//   13   21:putfield        #115 <Field TextView c>
		d = null;
	//   14   24:aload_0         
	//   15   25:aconst_null     
	//   16   26:putfield        #122 <Field LinearLayout d>
		e = null;
	//   17   29:aload_0         
	//   18   30:aconst_null     
	//   19   31:putfield        #128 <Field ImageButton e>
	//   20   34:return          
	}

	public void onViewCreated(View view, Bundle bundle)
	{
		super.onViewCreated(view, bundle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #163 <Method void cc.onViewCreated(View, Bundle)>
		l.a(((org.androidannotations.api.c.a) (this)));
	//    4    6:aload_0         
	//    5    7:getfield        #26  <Field c l>
	//    6   10:aload_0         
	//    7   11:invokevirtual   #165 <Method void c.a(a)>
	//    8   14:return          
	}

	private final c l = new c();
	private View n;
}

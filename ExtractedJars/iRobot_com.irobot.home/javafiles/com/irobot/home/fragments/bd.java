// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import org.androidannotations.api.c.a;
import org.androidannotations.api.c.b;
import org.androidannotations.api.c.c;

// Referenced classes of package com.irobot.home.fragments:
//			bc

public final class bd extends bc
	implements org.androidannotations.api.c.a, b
{
	public static class a extends org.androidannotations.api.a.c
	{

		public bc a()
		{
			bd bd1 = new bd();
		//    0    0:new             #7   <Class bd>
		//    1    3:dup             
		//    2    4:invokespecial   #15  <Method void bd()>
		//    3    7:astore_1        
			bd1.setArguments(a);
		//    4    8:aload_1         
		//    5    9:aload_0         
		//    6   10:getfield        #18  <Field Bundle a>
		//    7   13:invokevirtual   #22  <Method void bd.setArguments(Bundle)>
			return ((bc) (bd1));
		//    8   16:aload_1         
		//    9   17:areturn         
		}

		public a a(String s)
		{
			a.putString("errorTitle", s);
		//    0    0:aload_0         
		//    1    1:getfield        #18  <Field Bundle a>
		//    2    4:ldc1            #25  <String "errorTitle">
		//    3    6:aload_1         
		//    4    7:invokevirtual   #31  <Method void Bundle.putString(String, String)>
			return this;
		//    5   10:aload_0         
		//    6   11:areturn         
		}

		public a a(boolean flag)
		{
			a.putBoolean("showHelp", flag);
		//    0    0:aload_0         
		//    1    1:getfield        #18  <Field Bundle a>
		//    2    4:ldc1            #34  <String "showHelp">
		//    3    6:iload_1         
		//    4    7:invokevirtual   #38  <Method void Bundle.putBoolean(String, boolean)>
			return this;
		//    5   10:aload_0         
		//    6   11:areturn         
		}

		public a b(String s)
		{
			a.putString("errorDescription", s);
		//    0    0:aload_0         
		//    1    1:getfield        #18  <Field Bundle a>
		//    2    4:ldc1            #41  <String "errorDescription">
		//    3    6:aload_1         
		//    4    7:invokevirtual   #31  <Method void Bundle.putString(String, String)>
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


	public bd()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #27  <Method void bc()>
	//    2    4:aload_0         
	//    3    5:new             #29  <Class c>
	//    4    8:dup             
	//    5    9:invokespecial   #30  <Method void c()>
	//    6   12:putfield        #32  <Field c i>
	//    7   15:return          
	}

	private void a(Bundle bundle)
	{
		c.a(((b) (this)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #37  <Method void c.a(b)>
		f();
	//    2    4:aload_0         
	//    3    5:invokespecial   #40  <Method void f()>
	//    4    8:return          
	}

	static void a(bd bd1)
	{
		((bc) (bd1)).bc.d();
	//    0    0:aload_0         
	//    1    1:invokespecial   #44  <Method void bc.d()>
	//    2    4:return          
	}

	static void a(bd bd1, boolean flag)
	{
		((bc) (bd1)).com.irobot.home.fragments.bc.a(flag);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #48  <Method void com.irobot.home.fragments.bc.a(boolean)>
	//    3    5:return          
	}

	public static a e()
	{
		return new a();
	//    0    0:new             #18  <Class bd$a>
	//    1    3:dup             
	//    2    4:invokespecial   #51  <Method void bd$a()>
	//    3    7:areturn         
	}

	private void f()
	{
		Bundle bundle = getArguments();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #55  <Method Bundle getArguments()>
	//    2    4:astore_1        
		if(bundle != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          66
		{
			if(bundle.containsKey("errorTitle"))
	//*   5    9:aload_1         
	//*   6   10:ldc1            #57  <String "errorTitle">
	//*   7   12:invokevirtual   #63  <Method boolean Bundle.containsKey(String)>
	//*   8   15:ifeq            28
				f = bundle.getString("errorTitle");
	//    9   18:aload_0         
	//   10   19:aload_1         
	//   11   20:ldc1            #57  <String "errorTitle">
	//   12   22:invokevirtual   #67  <Method String Bundle.getString(String)>
	//   13   25:putfield        #70  <Field String f>
			if(bundle.containsKey("errorDescription"))
	//*  14   28:aload_1         
	//*  15   29:ldc1            #72  <String "errorDescription">
	//*  16   31:invokevirtual   #63  <Method boolean Bundle.containsKey(String)>
	//*  17   34:ifeq            47
				g = bundle.getString("errorDescription");
	//   18   37:aload_0         
	//   19   38:aload_1         
	//   20   39:ldc1            #72  <String "errorDescription">
	//   21   41:invokevirtual   #67  <Method String Bundle.getString(String)>
	//   22   44:putfield        #75  <Field String g>
			if(bundle.containsKey("showHelp"))
	//*  23   47:aload_1         
	//*  24   48:ldc1            #77  <String "showHelp">
	//*  25   50:invokevirtual   #63  <Method boolean Bundle.containsKey(String)>
	//*  26   53:ifeq            66
				h = bundle.getBoolean("showHelp");
	//   27   56:aload_0         
	//   28   57:aload_1         
	//   29   58:ldc1            #77  <String "showHelp">
	//   30   60:invokevirtual   #80  <Method boolean Bundle.getBoolean(String)>
	//   31   63:putfield        #84  <Field boolean h>
		}
	//   32   66:return          
	}

	public View a(int k)
	{
		if(j == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #87  <Field View j>
	//*   2    4:ifnonnull       9
			return null;
	//    3    7:aconst_null     
	//    4    8:areturn         
		else
			return j.findViewById(k);
	//    5    9:aload_0         
	//    6   10:getfield        #87  <Field View j>
	//    7   13:iload_1         
	//    8   14:invokevirtual   #92  <Method View View.findViewById(int)>
	//    9   17:areturn         
	}

	public void a(org.androidannotations.api.c.a a1)
	{
		a = (TextView)a1.a(0x7f0901b7);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc1            #96  <Int 0x7f0901b7>
	//    3    4:invokeinterface #98  <Method View a.a(int)>
	//    4    9:checkcast       #100 <Class TextView>
	//    5   12:putfield        #103 <Field TextView a>
		b = (ImageButton)a1.a(0x7f0901ae);
	//    6   15:aload_0         
	//    7   16:aload_1         
	//    8   17:ldc1            #104 <Int 0x7f0901ae>
	//    9   19:invokeinterface #98  <Method View a.a(int)>
	//   10   24:checkcast       #106 <Class ImageButton>
	//   11   27:putfield        #110 <Field ImageButton b>
		c = (TextView)a1.a(0x7f09017a);
	//   12   30:aload_0         
	//   13   31:aload_1         
	//   14   32:ldc1            #111 <Int 0x7f09017a>
	//   15   34:invokeinterface #98  <Method View a.a(int)>
	//   16   39:checkcast       #100 <Class TextView>
	//   17   42:putfield        #114 <Field TextView c>
		d = (TextView)a1.a(0x7f090178);
	//   18   45:aload_0         
	//   19   46:aload_1         
	//   20   47:ldc1            #115 <Int 0x7f090178>
	//   21   49:invokeinterface #98  <Method View a.a(int)>
	//   22   54:checkcast       #100 <Class TextView>
	//   23   57:putfield        #117 <Field TextView d>
		e = (Button)a1.a(0x7f0901bd);
	//   24   60:aload_0         
	//   25   61:aload_1         
	//   26   62:ldc1            #118 <Int 0x7f0901bd>
	//   27   64:invokeinterface #98  <Method View a.a(int)>
	//   28   69:checkcast       #120 <Class Button>
	//   29   72:putfield        #123 <Field Button e>
		if(b != null)
	//*  30   75:aload_0         
	//*  31   76:getfield        #110 <Field ImageButton b>
	//*  32   79:ifnull          97
			b.setOnClickListener(new android.view.View.OnClickListener() {

				public void onClick(View view)
				{
					a.b();
				//    0    0:aload_0         
				//    1    1:getfield        #16  <Field bd a>
				//    2    4:invokevirtual   #25  <Method void com.irobot.home.fragments.bd.b()>
				//    3    7:return          
				}

				final bd a;

			
			{
				a = bd.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field bd a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
			}
);
	//   33   82:aload_0         
	//   34   83:getfield        #110 <Field ImageButton b>
	//   35   86:new             #10  <Class bd$1>
	//   36   89:dup             
	//   37   90:aload_0         
	//   38   91:invokespecial   #125 <Method void bd$1(bd)>
	//   39   94:invokevirtual   #129 <Method void ImageButton.setOnClickListener(android.view.View$OnClickListener)>
		if(e != null)
	//*  40   97:aload_0         
	//*  41   98:getfield        #123 <Field Button e>
	//*  42  101:ifnull          119
			e.setOnClickListener(new android.view.View.OnClickListener() {

				public void onClick(View view)
				{
					a.c();
				//    0    0:aload_0         
				//    1    1:getfield        #16  <Field bd a>
				//    2    4:invokevirtual   #25  <Method void com.irobot.home.fragments.bd.c()>
				//    3    7:return          
				}

				final bd a;

			
			{
				a = bd.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field bd a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
			}
);
	//   43  104:aload_0         
	//   44  105:getfield        #123 <Field Button e>
	//   45  108:new             #12  <Class bd$2>
	//   46  111:dup             
	//   47  112:aload_0         
	//   48  113:invokespecial   #130 <Method void bd$2(bd)>
	//   49  116:invokevirtual   #131 <Method void Button.setOnClickListener(android.view.View$OnClickListener)>
		a();
	//   50  119:aload_0         
	//   51  120:invokevirtual   #133 <Method void a()>
	//   52  123:return          
	}

	protected void a(boolean flag)
	{
		org.androidannotations.api.b.a("", new Runnable(flag) {

			public void run()
			{
				com.irobot.home.fragments.bd.a(b, a);
			//    0    0:aload_0         
			//    1    1:getfield        #18  <Field bd b>
			//    2    4:aload_0         
			//    3    5:getfield        #20  <Field boolean a>
			//    4    8:invokestatic    #27  <Method void com.irobot.home.fragments.bd.a(bd, boolean)>
			//    5   11:return          
			}

			final boolean a;
			final bd b;

			
			{
				b = bd.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #18  <Field bd b>
				a = flag;
			//    3    5:aload_0         
			//    4    6:iload_2         
			//    5    7:putfield        #20  <Field boolean a>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #23  <Method void Object()>
			//    8   14:return          
			}
		}
, 0L);
	//    0    0:ldc1            #135 <String "">
	//    1    2:new             #14  <Class bd$3>
	//    2    5:dup             
	//    3    6:aload_0         
	//    4    7:iload_1         
	//    5    8:invokespecial   #137 <Method void bd$3(bd, boolean)>
	//    6   11:lconst_0        
	//    7   12:invokestatic    #142 <Method void org.androidannotations.api.b.a(String, Runnable, long)>
	//    8   15:return          
	}

	protected void d()
	{
		org.androidannotations.api.a.a(((org.androidannotations.api.a.a) (new org.androidannotations.api.a.a("", 0L, "") {

			public void a()
			{
				try
				{
					com.irobot.home.fragments.bd.a(a);
			//    0    0:aload_0         
			//    1    1:getfield        #15  <Field bd a>
			//    2    4:invokestatic    #24  <Method void com.irobot.home.fragments.bd.a(bd)>
					return;
			//    3    7:return          
				}
				catch(Throwable throwable)
			//*   4    8:astore_1        
				{
					Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), throwable);
			//    5    9:invokestatic    #30  <Method Thread$UncaughtExceptionHandler Thread.getDefaultUncaughtExceptionHandler()>
			//    6   12:invokestatic    #34  <Method Thread Thread.currentThread()>
			//    7   15:aload_1         
			//    8   16:invokeinterface #40  <Method void Thread$UncaughtExceptionHandler.uncaughtException(Thread, Throwable)>
				}
			//    9   21:return          
			}

			final bd a;

			
			{
				a = bd.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #15  <Field bd a>
				super(s, l, s1);
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:lload_3         
			//    6    8:aload           5
			//    7   10:invokespecial   #18  <Method void org.androidannotations.api.a$a(String, long, String)>
			//    8   13:return          
			}
		}
)));
	//    0    0:new             #16  <Class bd$4>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:ldc1            #135 <String "">
	//    4    7:lconst_0        
	//    5    8:ldc1            #135 <String "">
	//    6   10:invokespecial   #145 <Method void bd$4(bd, String, long, String)>
	//    7   13:invokestatic    #150 <Method void org.androidannotations.api.a.a(org.androidannotations.api.a$a)>
	//    8   16:return          
	}

	public void onCreate(Bundle bundle)
	{
		c c1 = c.a(i);
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field c i>
	//    2    4:invokestatic    #154 <Method c c.a(c)>
	//    3    7:astore_2        
		a(bundle);
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokespecial   #156 <Method void a(Bundle)>
		super.onCreate(bundle);
	//    7   13:aload_0         
	//    8   14:aload_1         
	//    9   15:invokespecial   #158 <Method void bc.onCreate(Bundle)>
		c.a(c1);
	//   10   18:aload_2         
	//   11   19:invokestatic    #154 <Method c c.a(c)>
	//   12   22:pop             
	//   13   23:return          
	}

	public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
	{
		j = super.onCreateView(layoutinflater, viewgroup, bundle);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:aload_1         
	//    3    3:aload_2         
	//    4    4:aload_3         
	//    5    5:invokespecial   #162 <Method View bc.onCreateView(LayoutInflater, ViewGroup, Bundle)>
	//    6    8:putfield        #87  <Field View j>
		if(j == null)
	//*   7   11:aload_0         
	//*   8   12:getfield        #87  <Field View j>
	//*   9   15:ifnonnull       30
			j = layoutinflater.inflate(0x7f0b00c9, viewgroup, false);
	//   10   18:aload_0         
	//   11   19:aload_1         
	//   12   20:ldc1            #163 <Int 0x7f0b00c9>
	//   13   22:aload_2         
	//   14   23:iconst_0        
	//   15   24:invokevirtual   #169 <Method View LayoutInflater.inflate(int, ViewGroup, boolean)>
	//   16   27:putfield        #87  <Field View j>
		return j;
	//   17   30:aload_0         
	//   18   31:getfield        #87  <Field View j>
	//   19   34:areturn         
	}

	public void onDestroyView()
	{
		super.onDestroyView();
	//    0    0:aload_0         
	//    1    1:invokespecial   #172 <Method void bc.onDestroyView()>
		j = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #87  <Field View j>
		a = null;
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:putfield        #103 <Field TextView a>
		b = null;
	//    8   14:aload_0         
	//    9   15:aconst_null     
	//   10   16:putfield        #110 <Field ImageButton b>
		c = null;
	//   11   19:aload_0         
	//   12   20:aconst_null     
	//   13   21:putfield        #114 <Field TextView c>
		d = null;
	//   14   24:aload_0         
	//   15   25:aconst_null     
	//   16   26:putfield        #117 <Field TextView d>
		e = null;
	//   17   29:aload_0         
	//   18   30:aconst_null     
	//   19   31:putfield        #123 <Field Button e>
	//   20   34:return          
	}

	public void onViewCreated(View view, Bundle bundle)
	{
		super.onViewCreated(view, bundle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #176 <Method void bc.onViewCreated(View, Bundle)>
		i.a(((org.androidannotations.api.c.a) (this)));
	//    4    6:aload_0         
	//    5    7:getfield        #32  <Field c i>
	//    6   10:aload_0         
	//    7   11:invokevirtual   #178 <Method void c.a(a)>
	//    8   14:return          
	}

	private final c i = new c();
	private View j;
}

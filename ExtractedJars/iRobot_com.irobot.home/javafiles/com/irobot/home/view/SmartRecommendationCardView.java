// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.*;
import android.widget.*;
import com.irobot.home.n.b;
import com.irobot.home.util.j;
import com.irobot.home.util.o;

// Referenced classes of package com.irobot.home.view:
//			CustomTextView, CustomButton

public class SmartRecommendationCardView extends LinearLayout
	implements android.view.View.OnClickListener, com.irobot.home.n.b
{
	public static class a
	{

		public a a(int i1)
		{
			a.c = i1;
		//    0    0:aload_0         
		//    1    1:getfield        #23  <Field SmartRecommendationCardView$b a>
		//    2    4:iload_1         
		//    3    5:putfield        #29  <Field int SmartRecommendationCardView$b.c>
			return this;
		//    4    8:aload_0         
		//    5    9:areturn         
		}

		public a a(com.irobot.home.n.b.a a1)
		{
			a.i = a1;
		//    0    0:aload_0         
		//    1    1:getfield        #23  <Field SmartRecommendationCardView$b a>
		//    2    4:aload_1         
		//    3    5:putfield        #34  <Field com.irobot.home.n.b$a SmartRecommendationCardView$b.i>
			return this;
		//    4    8:aload_0         
		//    5    9:areturn         
		}

		public a a(com.irobot.home.n.b.c c1)
		{
			a.k = c1;
		//    0    0:aload_0         
		//    1    1:getfield        #23  <Field SmartRecommendationCardView$b a>
		//    2    4:aload_1         
		//    3    5:putfield        #39  <Field com.irobot.home.n.b$c SmartRecommendationCardView$b.k>
			return this;
		//    4    8:aload_0         
		//    5    9:areturn         
		}

		public a a(String s)
		{
			a.e = s;
		//    0    0:aload_0         
		//    1    1:getfield        #23  <Field SmartRecommendationCardView$b a>
		//    2    4:aload_1         
		//    3    5:putfield        #44  <Field String SmartRecommendationCardView$b.e>
			return this;
		//    4    8:aload_0         
		//    5    9:areturn         
		}

		public SmartRecommendationCardView a()
		{
			SmartRecommendationCardView smartrecommendationcardview = new SmartRecommendationCardView(b);
		//    0    0:new             #6   <Class SmartRecommendationCardView>
		//    1    3:dup             
		//    2    4:aload_0         
		//    3    5:getfield        #17  <Field Context b>
		//    4    8:invokespecial   #46  <Method void SmartRecommendationCardView(Context)>
		//    5   11:astore_1        
			SmartRecommendationCardView.a(smartrecommendationcardview, a);
		//    6   12:aload_1         
		//    7   13:aload_0         
		//    8   14:getfield        #23  <Field SmartRecommendationCardView$b a>
		//    9   17:invokestatic    #49  <Method void SmartRecommendationCardView.a(SmartRecommendationCardView, SmartRecommendationCardView$b)>
			return smartrecommendationcardview;
		//   10   20:aload_1         
		//   11   21:areturn         
		}

		public a b(int i1)
		{
			a.d = i1;
		//    0    0:aload_0         
		//    1    1:getfield        #23  <Field SmartRecommendationCardView$b a>
		//    2    4:iload_1         
		//    3    5:putfield        #52  <Field int SmartRecommendationCardView$b.d>
			return this;
		//    4    8:aload_0         
		//    5    9:areturn         
		}

		public a b(com.irobot.home.n.b.a a1)
		{
			a.j = a1;
		//    0    0:aload_0         
		//    1    1:getfield        #23  <Field SmartRecommendationCardView$b a>
		//    2    4:aload_1         
		//    3    5:putfield        #55  <Field com.irobot.home.n.b$a com.irobot.home.view.SmartRecommendationCardView$b.j>
			return this;
		//    4    8:aload_0         
		//    5    9:areturn         
		}

		public a b(String s)
		{
			a.f = s;
		//    0    0:aload_0         
		//    1    1:getfield        #23  <Field SmartRecommendationCardView$b a>
		//    2    4:aload_1         
		//    3    5:putfield        #58  <Field String SmartRecommendationCardView$b.f>
			return this;
		//    4    8:aload_0         
		//    5    9:areturn         
		}

		public a c(int i1)
		{
			a.h = b.getString(i1);
		//    0    0:aload_0         
		//    1    1:getfield        #23  <Field SmartRecommendationCardView$b a>
		//    2    4:aload_0         
		//    3    5:getfield        #17  <Field Context b>
		//    4    8:iload_1         
		//    5    9:invokevirtual   #64  <Method String Context.getString(int)>
		//    6   12:putfield        #67  <Field String SmartRecommendationCardView$b.h>
			return this;
		//    7   15:aload_0         
		//    8   16:areturn         
		}

		public a c(String s)
		{
			a.g = s;
		//    0    0:aload_0         
		//    1    1:getfield        #23  <Field SmartRecommendationCardView$b a>
		//    2    4:aload_1         
		//    3    5:putfield        #70  <Field String SmartRecommendationCardView$b.g>
			return this;
		//    4    8:aload_0         
		//    5    9:areturn         
		}

		private final b a;
		private final Context b;

		public a(Context context)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #15  <Method void Object()>
			b = context;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #17  <Field Context b>
			a = new b(context);
		//    5    9:aload_0         
		//    6   10:new             #19  <Class SmartRecommendationCardView$b>
		//    7   13:dup             
		//    8   14:aload_1         
		//    9   15:invokespecial   #21  <Method void SmartRecommendationCardView$b(Context)>
		//   10   18:putfield        #23  <Field SmartRecommendationCardView$b a>
		//   11   21:return          
		}
	}

	private static class b
	{

		public int a()
		{
			return c;
		//    0    0:aload_0         
		//    1    1:getfield        #48  <Field int c>
		//    2    4:ireturn         
		}

		public String b()
		{
			return f;
		//    0    0:aload_0         
		//    1    1:getfield        #51  <Field String f>
		//    2    4:areturn         
		}

		public String c()
		{
			return g;
		//    0    0:aload_0         
		//    1    1:getfield        #53  <Field String g>
		//    2    4:areturn         
		}

		public String d()
		{
			return h;
		//    0    0:aload_0         
		//    1    1:getfield        #55  <Field String h>
		//    2    4:areturn         
		}

		public String e()
		{
			return e;
		//    0    0:aload_0         
		//    1    1:getfield        #57  <Field String e>
		//    2    4:areturn         
		}

		public int f()
		{
			return d;
		//    0    0:aload_0         
		//    1    1:getfield        #59  <Field int d>
		//    2    4:ireturn         
		}

		public com.irobot.home.n.b.a g()
		{
			return i;
		//    0    0:aload_0         
		//    1    1:getfield        #62  <Field com.irobot.home.n.b$a i>
		//    2    4:areturn         
		}

		public com.irobot.home.n.b.a h()
		{
			return j;
		//    0    0:aload_0         
		//    1    1:getfield        #64  <Field com.irobot.home.n.b$a j>
		//    2    4:areturn         
		}

		public com.irobot.home.n.b.c i()
		{
			return k;
		//    0    0:aload_0         
		//    1    1:getfield        #67  <Field com.irobot.home.n.b$c k>
		//    2    4:areturn         
		}

		public com.irobot.home.n.b.b j()
		{
			return l;
		//    0    0:aload_0         
		//    1    1:getfield        #70  <Field com.irobot.home.n.b$b l>
		//    2    4:areturn         
		}

		final Context a;
		final LayoutInflater b;
		int c;
		int d;
		String e;
		String f;
		String g;
		String h;
		com.irobot.home.n.b.a i;
		com.irobot.home.n.b.a j;
		com.irobot.home.n.b.c k;
		com.irobot.home.n.b.b l;

		b(Context context)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #30  <Method void Object()>
			a = context;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #32  <Field Context a>
			b = (LayoutInflater)context.getSystemService("layout_inflater");
		//    5    9:aload_0         
		//    6   10:aload_1         
		//    7   11:ldc1            #34  <String "layout_inflater">
		//    8   13:invokevirtual   #40  <Method Object Context.getSystemService(String)>
		//    9   16:checkcast       #42  <Class LayoutInflater>
		//   10   19:putfield        #44  <Field LayoutInflater b>
		//   11   22:return          
		}
	}


	protected SmartRecommendationCardView(Context context)
	{
		super(context);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #51  <Method void LinearLayout(Context)>
		a = com.irobot.home.util.j.r(((Class) (com/irobot/home/view/SmartRecommendationCardView)).getSimpleName());
	//    3    5:aload_0         
	//    4    6:ldc1            #2   <Class SmartRecommendationCardView>
	//    5    8:invokevirtual   #57  <Method String Class.getSimpleName()>
	//    6   11:invokestatic    #63  <Method String j.r(String)>
	//    7   14:putfield        #65  <Field String a>
		k = null;
	//    8   17:aload_0         
	//    9   18:aconst_null     
	//   10   19:putfield        #67  <Field CharSequence[] k>
		l = false;
	//   11   22:aload_0         
	//   12   23:iconst_0        
	//   13   24:putfield        #69  <Field boolean l>
		m = false;
	//   14   27:aload_0         
	//   15   28:iconst_0        
	//   16   29:putfield        #71  <Field boolean m>
		a(context, ((AttributeSet) (null)));
	//   17   32:aload_0         
	//   18   33:aload_1         
	//   19   34:aconst_null     
	//   20   35:invokespecial   #74  <Method void a(Context, AttributeSet)>
	//   21   38:return          
	}

	protected SmartRecommendationCardView(Context context, AttributeSet attributeset)
	{
		super(context, attributeset);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #77  <Method void LinearLayout(Context, AttributeSet)>
		a = com.irobot.home.util.j.r(((Class) (com/irobot/home/view/SmartRecommendationCardView)).getSimpleName());
	//    4    6:aload_0         
	//    5    7:ldc1            #2   <Class SmartRecommendationCardView>
	//    6    9:invokevirtual   #57  <Method String Class.getSimpleName()>
	//    7   12:invokestatic    #63  <Method String j.r(String)>
	//    8   15:putfield        #65  <Field String a>
		k = null;
	//    9   18:aload_0         
	//   10   19:aconst_null     
	//   11   20:putfield        #67  <Field CharSequence[] k>
		l = false;
	//   12   23:aload_0         
	//   13   24:iconst_0        
	//   14   25:putfield        #69  <Field boolean l>
		m = false;
	//   15   28:aload_0         
	//   16   29:iconst_0        
	//   17   30:putfield        #71  <Field boolean m>
		a(context, attributeset);
	//   18   33:aload_0         
	//   19   34:aload_1         
	//   20   35:aload_2         
	//   21   36:invokespecial   #74  <Method void a(Context, AttributeSet)>
	//   22   39:return          
	}

	protected SmartRecommendationCardView(Context context, AttributeSet attributeset, int i1)
	{
		super(context, attributeset, i1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:invokespecial   #80  <Method void LinearLayout(Context, AttributeSet, int)>
		a = com.irobot.home.util.j.r(((Class) (com/irobot/home/view/SmartRecommendationCardView)).getSimpleName());
	//    5    7:aload_0         
	//    6    8:ldc1            #2   <Class SmartRecommendationCardView>
	//    7   10:invokevirtual   #57  <Method String Class.getSimpleName()>
	//    8   13:invokestatic    #63  <Method String j.r(String)>
	//    9   16:putfield        #65  <Field String a>
		k = null;
	//   10   19:aload_0         
	//   11   20:aconst_null     
	//   12   21:putfield        #67  <Field CharSequence[] k>
		l = false;
	//   13   24:aload_0         
	//   14   25:iconst_0        
	//   15   26:putfield        #69  <Field boolean l>
		m = false;
	//   16   29:aload_0         
	//   17   30:iconst_0        
	//   18   31:putfield        #71  <Field boolean m>
		a(context, attributeset);
	//   19   34:aload_0         
	//   20   35:aload_1         
	//   21   36:aload_2         
	//   22   37:invokespecial   #74  <Method void a(Context, AttributeSet)>
	//   23   40:return          
	}

	static com.irobot.home.n.b.b a(SmartRecommendationCardView smartrecommendationcardview)
	{
		return smartrecommendationcardview.p;
	//    0    0:aload_0         
	//    1    1:getfield        #83  <Field com.irobot.home.n.b$b p>
	//    2    4:areturn         
	}

	private void a(Context context, AttributeSet attributeset)
	{
		((LayoutInflater)context.getSystemService("layout_inflater")).inflate(0x7f0b0100, ((android.view.ViewGroup) (this)));
	//    0    0:aload_1         
	//    1    1:ldc1            #85  <String "layout_inflater">
	//    2    3:invokevirtual   #91  <Method Object Context.getSystemService(String)>
	//    3    6:checkcast       #93  <Class LayoutInflater>
	//    4    9:ldc1            #94  <Int 0x7f0b0100>
	//    5   11:aload_0         
	//    6   12:invokevirtual   #98  <Method View LayoutInflater.inflate(int, android.view.ViewGroup)>
	//    7   15:pop             
		b = (ImageView)findViewById(0x7f090298);
	//    8   16:aload_0         
	//    9   17:aload_0         
	//   10   18:ldc1            #99  <Int 0x7f090298>
	//   11   20:invokevirtual   #103 <Method View findViewById(int)>
	//   12   23:checkcast       #105 <Class ImageView>
	//   13   26:putfield        #107 <Field ImageView b>
		c = (CustomTextView)findViewById(0x7f09029e);
	//   14   29:aload_0         
	//   15   30:aload_0         
	//   16   31:ldc1            #108 <Int 0x7f09029e>
	//   17   33:invokevirtual   #103 <Method View findViewById(int)>
	//   18   36:checkcast       #110 <Class CustomTextView>
	//   19   39:putfield        #112 <Field CustomTextView c>
		d = (CustomTextView)findViewById(0x7f09029b);
	//   20   42:aload_0         
	//   21   43:aload_0         
	//   22   44:ldc1            #113 <Int 0x7f09029b>
	//   23   46:invokevirtual   #103 <Method View findViewById(int)>
	//   24   49:checkcast       #110 <Class CustomTextView>
	//   25   52:putfield        #115 <Field CustomTextView d>
		f = (CustomTextView)findViewById(0x7f0903e9);
	//   26   55:aload_0         
	//   27   56:aload_0         
	//   28   57:ldc1            #116 <Int 0x7f0903e9>
	//   29   59:invokevirtual   #103 <Method View findViewById(int)>
	//   30   62:checkcast       #110 <Class CustomTextView>
	//   31   65:putfield        #118 <Field CustomTextView f>
		g = (CustomTextView)findViewById(0x7f0903ea);
	//   32   68:aload_0         
	//   33   69:aload_0         
	//   34   70:ldc1            #119 <Int 0x7f0903ea>
	//   35   72:invokevirtual   #103 <Method View findViewById(int)>
	//   36   75:checkcast       #110 <Class CustomTextView>
	//   37   78:putfield        #121 <Field CustomTextView g>
		e = (ImageButton)findViewById(0x7f090136);
	//   38   81:aload_0         
	//   39   82:aload_0         
	//   40   83:ldc1            #122 <Int 0x7f090136>
	//   41   85:invokevirtual   #103 <Method View findViewById(int)>
	//   42   88:checkcast       #124 <Class ImageButton>
	//   43   91:putfield        #126 <Field ImageButton e>
		h = (CustomButton)findViewById(0x7f090017);
	//   44   94:aload_0         
	//   45   95:aload_0         
	//   46   96:ldc1            #127 <Int 0x7f090017>
	//   47   98:invokevirtual   #103 <Method View findViewById(int)>
	//   48  101:checkcast       #129 <Class CustomButton>
	//   49  104:putfield        #131 <Field CustomButton h>
		h.setOnClickListener(((android.view.View.OnClickListener) (this)));
	//   50  107:aload_0         
	//   51  108:getfield        #131 <Field CustomButton h>
	//   52  111:aload_0         
	//   53  112:invokevirtual   #135 <Method void CustomButton.setOnClickListener(android.view.View$OnClickListener)>
		e.setOnClickListener(((android.view.View.OnClickListener) (this)));
	//   54  115:aload_0         
	//   55  116:getfield        #126 <Field ImageButton e>
	//   56  119:aload_0         
	//   57  120:invokevirtual   #136 <Method void ImageButton.setOnClickListener(android.view.View$OnClickListener)>
		if(attributeset != null)
	//*  58  123:aload_2         
	//*  59  124:ifnull          133
			b(context, attributeset);
	//   60  127:aload_0         
	//   61  128:aload_1         
	//   62  129:aload_2         
	//   63  130:invokespecial   #138 <Method void b(Context, AttributeSet)>
	//   64  133:return          
	}

	private void a(b b1)
	{
		if(b1 == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       14
		{
			com.irobot.home.util.o.e(a, "Unexpected NULL for CardParams when init smart card. NEED ATTENTION!!");
	//    2    4:aload_0         
	//    3    5:getfield        #65  <Field String a>
	//    4    8:ldc1            #141 <String "Unexpected NULL for CardParams when init smart card. NEED ATTENTION!!">
	//    5   10:invokestatic    #146 <Method void o.e(String, String)>
			return;
	//    6   13:return          
		}
		i = b1;
	//    7   14:aload_0         
	//    8   15:aload_1         
	//    9   16:putfield        #148 <Field SmartRecommendationCardView$b i>
		j = b1.f();
	//   10   19:aload_0         
	//   11   20:aload_1         
	//   12   21:invokevirtual   #151 <Method int SmartRecommendationCardView$b.f()>
	//   13   24:putfield        #153 <Field int j>
		if(j != 1)
	//*  14   27:aload_0         
	//*  15   28:getfield        #153 <Field int j>
	//*  16   31:iconst_1        
	//*  17   32:icmpeq          47
			com.irobot.home.util.o.e(a, "Unsupported smart recommendation type!");
	//   18   35:aload_0         
	//   19   36:getfield        #65  <Field String a>
	//   20   39:ldc1            #155 <String "Unsupported smart recommendation type!">
	//   21   41:invokestatic    #146 <Method void o.e(String, String)>
		else
	//*  22   44:goto            52
			b(b1);
	//   23   47:aload_0         
	//   24   48:aload_1         
	//   25   49:invokespecial   #157 <Method void b(SmartRecommendationCardView$b)>
		n = b1.g();
	//   26   52:aload_0         
	//   27   53:aload_1         
	//   28   54:invokevirtual   #160 <Method com.irobot.home.n.b$a SmartRecommendationCardView$b.g()>
	//   29   57:putfield        #162 <Field com.irobot.home.n.b$a n>
		o = b1.h();
	//   30   60:aload_0         
	//   31   61:aload_1         
	//   32   62:invokevirtual   #164 <Method com.irobot.home.n.b$a SmartRecommendationCardView$b.h()>
	//   33   65:putfield        #166 <Field com.irobot.home.n.b$a o>
		p = b1.j();
	//   34   68:aload_0         
	//   35   69:aload_1         
	//   36   70:invokevirtual   #169 <Method com.irobot.home.n.b$b com.irobot.home.view.SmartRecommendationCardView$b.j()>
	//   37   73:putfield        #83  <Field com.irobot.home.n.b$b p>
		q = b1.i();
	//   38   76:aload_0         
	//   39   77:aload_1         
	//   40   78:invokevirtual   #172 <Method com.irobot.home.n.b$c SmartRecommendationCardView$b.i()>
	//   41   81:putfield        #174 <Field com.irobot.home.n.b$c q>
		d();
	//   42   84:aload_0         
	//   43   85:invokevirtual   #177 <Method void d()>
	//   44   88:return          
	}

	static void a(SmartRecommendationCardView smartrecommendationcardview, b b1)
	{
		smartrecommendationcardview.a(b1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #180 <Method void a(SmartRecommendationCardView$b)>
	//    3    5:return          
	}

	static boolean a(SmartRecommendationCardView smartrecommendationcardview, boolean flag)
	{
		smartrecommendationcardview.m = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #71  <Field boolean m>
		return flag;
	//    3    5:iload_1         
	//    4    6:ireturn         
	}

	static SmartRecommendationCardView b(SmartRecommendationCardView smartrecommendationcardview)
	{
		return smartrecommendationcardview.getInstance();
	//    0    0:aload_0         
	//    1    1:invokespecial   #186 <Method SmartRecommendationCardView getInstance()>
	//    2    4:areturn         
	}

	private void b(Context context, AttributeSet attributeset)
	{
		context = ((Context) (context.obtainStyledAttributes(attributeset, com.irobot.home.g.a.SmartCard)));
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:getstatic       #195 <Field int[] com.irobot.home.g$a.SmartCard>
	//    3    5:invokevirtual   #199 <Method TypedArray Context.obtainStyledAttributes(AttributeSet, int[])>
	//    4    8:astore_1        
		j = ((TypedArray) (context)).getInt(3, 1);
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:iconst_3        
	//    8   12:iconst_1        
	//    9   13:invokevirtual   #205 <Method int TypedArray.getInt(int, int)>
	//   10   16:putfield        #153 <Field int j>
		d();
	//   11   19:aload_0         
	//   12   20:invokevirtual   #177 <Method void d()>
		((TypedArray) (context)).recycle();
	//   13   23:aload_1         
	//   14   24:invokevirtual   #208 <Method void TypedArray.recycle()>
	//   15   27:return          
	}

	private void b(b b1)
	{
		b.setImageDrawable(getContext().getDrawable(b1.a()));
	//    0    0:aload_0         
	//    1    1:getfield        #107 <Field ImageView b>
	//    2    4:aload_0         
	//    3    5:invokevirtual   #213 <Method Context getContext()>
	//    4    8:aload_1         
	//    5    9:invokevirtual   #215 <Method int SmartRecommendationCardView$b.a()>
	//    6   12:invokevirtual   #219 <Method android.graphics.drawable.Drawable Context.getDrawable(int)>
	//    7   15:invokevirtual   #223 <Method void ImageView.setImageDrawable(android.graphics.drawable.Drawable)>
		c.setText(((CharSequence) (b1.e())));
	//    8   18:aload_0         
	//    9   19:getfield        #112 <Field CustomTextView c>
	//   10   22:aload_1         
	//   11   23:invokevirtual   #225 <Method String SmartRecommendationCardView$b.e()>
	//   12   26:invokevirtual   #229 <Method void CustomTextView.setText(CharSequence)>
		h.setText(((CharSequence) (b1.d())));
	//   13   29:aload_0         
	//   14   30:getfield        #131 <Field CustomButton h>
	//   15   33:aload_1         
	//   16   34:invokevirtual   #231 <Method String SmartRecommendationCardView$b.d()>
	//   17   37:invokevirtual   #232 <Method void CustomButton.setText(CharSequence)>
		f.setText(((CharSequence) (b1.b())));
	//   18   40:aload_0         
	//   19   41:getfield        #118 <Field CustomTextView f>
	//   20   44:aload_1         
	//   21   45:invokevirtual   #234 <Method String com.irobot.home.view.SmartRecommendationCardView$b.b()>
	//   22   48:invokevirtual   #229 <Method void CustomTextView.setText(CharSequence)>
		g.setText(((CharSequence) (b1.c())));
	//   23   51:aload_0         
	//   24   52:getfield        #121 <Field CustomTextView g>
	//   25   55:aload_1         
	//   26   56:invokevirtual   #236 <Method String SmartRecommendationCardView$b.c()>
	//   27   59:invokevirtual   #229 <Method void CustomTextView.setText(CharSequence)>
	//   28   62:return          
	}

	static boolean b(SmartRecommendationCardView smartrecommendationcardview, boolean flag)
	{
		smartrecommendationcardview.l = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #69  <Field boolean l>
		return flag;
	//    3    5:iload_1         
	//    4    6:ireturn         
	}

	static com.irobot.home.n.b.c c(SmartRecommendationCardView smartrecommendationcardview)
	{
		return smartrecommendationcardview.q;
	//    0    0:aload_0         
	//    1    1:getfield        #174 <Field com.irobot.home.n.b$c q>
	//    2    4:areturn         
	}

	private SmartRecommendationCardView getInstance()
	{
		return this;
	//    0    0:aload_0         
	//    1    1:areturn         
	}

	public void a()
	{
		if(m)
	//*   0    0:aload_0         
	//*   1    1:getfield        #71  <Field boolean m>
	//*   2    4:ifeq            17
		{
			com.irobot.home.util.o.b(a, "SmartCard is animation! Cannot start collapse now!");
	//    3    7:aload_0         
	//    4    8:getfield        #65  <Field String a>
	//    5   11:ldc1            #239 <String "SmartCard is animation! Cannot start collapse now!">
	//    6   13:invokestatic    #241 <Method void o.b(String, String)>
			return;
	//    7   16:return          
		} else
		{
			Animation animation = new Animation(getMeasuredHeight()) {

				protected void applyTransformation(float f1, Transformation transformation)
				{
					transformation = ((Transformation) (b));
				//    0    0:aload_0         
				//    1    1:getfield        #16  <Field SmartRecommendationCardView b>
				//    2    4:astore_2        
					int i1 = f1 != 1.0F;
				//    3    5:fload_1         
				//    4    6:fconst_1        
				//    5    7:fcmpl           
				//    6    8:istore_3        
					boolean flag;
					if(i1 != 0)
				//*   7    9:iload_3         
				//*   8   10:ifeq            19
						flag = true;
				//    9   13:iconst_1        
				//   10   14:istore          4
					else
				//*  11   16:goto            22
						flag = false;
				//   12   19:iconst_0        
				//   13   20:istore          4
					SmartRecommendationCardView.a(((SmartRecommendationCardView) (transformation)), flag);
				//   14   22:aload_2         
				//   15   23:iload           4
				//   16   25:invokestatic    #26  <Method boolean SmartRecommendationCardView.a(SmartRecommendationCardView, boolean)>
				//   17   28:pop             
					if(i1 == 0)
				//*  18   29:iload_3         
				//*  19   30:ifne            45
					{
						b.setVisibility(8);
				//   20   33:aload_0         
				//   21   34:getfield        #16  <Field SmartRecommendationCardView b>
				//   22   37:bipush          8
				//   23   39:invokevirtual   #30  <Method void SmartRecommendationCardView.setVisibility(int)>
					} else
				//*  24   42:goto            78
					{
						((android.widget.RelativeLayout.LayoutParams)b.getLayoutParams()).height = a - (int)((float)a * f1);
				//   25   45:aload_0         
				//   26   46:getfield        #16  <Field SmartRecommendationCardView b>
				//   27   49:invokevirtual   #34  <Method android.view.ViewGroup$LayoutParams SmartRecommendationCardView.getLayoutParams()>
				//   28   52:checkcast       #36  <Class android.widget.RelativeLayout$LayoutParams>
				//   29   55:aload_0         
				//   30   56:getfield        #18  <Field int a>
				//   31   59:aload_0         
				//   32   60:getfield        #18  <Field int a>
				//   33   63:i2f             
				//   34   64:fload_1         
				//   35   65:fmul            
				//   36   66:f2i             
				//   37   67:isub            
				//   38   68:putfield        #39  <Field int android.widget.RelativeLayout$LayoutParams.height>
						b.requestLayout();
				//   39   71:aload_0         
				//   40   72:getfield        #16  <Field SmartRecommendationCardView b>
				//   41   75:invokevirtual   #42  <Method void SmartRecommendationCardView.requestLayout()>
					}
					if(i1 != 0 && SmartRecommendationCardView.a(b) != null)
				//*  42   78:iload_3         
				//*  43   79:ifeq            112
				//*  44   82:aload_0         
				//*  45   83:getfield        #16  <Field SmartRecommendationCardView b>
				//*  46   86:invokestatic    #45  <Method com.irobot.home.n.b$b SmartRecommendationCardView.a(SmartRecommendationCardView)>
				//*  47   89:ifnull          112
					{
						SmartRecommendationCardView.a(b).b(com.irobot.home.view.SmartRecommendationCardView.b(b));
				//   48   92:aload_0         
				//   49   93:getfield        #16  <Field SmartRecommendationCardView b>
				//   50   96:invokestatic    #45  <Method com.irobot.home.n.b$b SmartRecommendationCardView.a(SmartRecommendationCardView)>
				//   51   99:aload_0         
				//   52  100:getfield        #16  <Field SmartRecommendationCardView b>
				//   53  103:invokestatic    #48  <Method SmartRecommendationCardView com.irobot.home.view.SmartRecommendationCardView.b(SmartRecommendationCardView)>
				//   54  106:invokeinterface #53  <Method void com.irobot.home.n.b$b.b(SmartRecommendationCardView)>
						return;
				//   55  111:return          
					}
					if(SmartRecommendationCardView.a(b) != null)
				//*  56  112:aload_0         
				//*  57  113:getfield        #16  <Field SmartRecommendationCardView b>
				//*  58  116:invokestatic    #45  <Method com.irobot.home.n.b$b SmartRecommendationCardView.a(SmartRecommendationCardView)>
				//*  59  119:ifnull          141
						SmartRecommendationCardView.a(b).a(com.irobot.home.view.SmartRecommendationCardView.b(b));
				//   60  122:aload_0         
				//   61  123:getfield        #16  <Field SmartRecommendationCardView b>
				//   62  126:invokestatic    #45  <Method com.irobot.home.n.b$b SmartRecommendationCardView.a(SmartRecommendationCardView)>
				//   63  129:aload_0         
				//   64  130:getfield        #16  <Field SmartRecommendationCardView b>
				//   65  133:invokestatic    #48  <Method SmartRecommendationCardView com.irobot.home.view.SmartRecommendationCardView.b(SmartRecommendationCardView)>
				//   66  136:invokeinterface #55  <Method void com.irobot.home.n.b$b.a(SmartRecommendationCardView)>
				//   67  141:return          
				}

				public boolean willChangeBounds()
				{
					return true;
				//    0    0:iconst_1        
				//    1    1:ireturn         
				}

				final int a;
				final SmartRecommendationCardView b;

			
			{
				b = SmartRecommendationCardView.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field SmartRecommendationCardView b>
				a = i1;
			//    3    5:aload_0         
			//    4    6:iload_2         
			//    5    7:putfield        #18  <Field int a>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #20  <Method void Animation()>
			//    8   14:return          
			}
			}
;
	//    8   17:new             #10  <Class SmartRecommendationCardView$1>
	//    9   20:dup             
	//   10   21:aload_0         
	//   11   22:aload_0         
	//   12   23:invokevirtual   #244 <Method int getMeasuredHeight()>
	//   13   26:invokespecial   #247 <Method void SmartRecommendationCardView$1(SmartRecommendationCardView, int)>
	//   14   29:astore_1        
			((Animation) (animation)).setInterpolator(((android.view.animation.Interpolator) (new AccelerateDecelerateInterpolator())));
	//   15   30:aload_1         
	//   16   31:new             #249 <Class AccelerateDecelerateInterpolator>
	//   17   34:dup             
	//   18   35:invokespecial   #251 <Method void AccelerateDecelerateInterpolator()>
	//   19   38:invokevirtual   #257 <Method void Animation.setInterpolator(android.view.animation.Interpolator)>
			((Animation) (animation)).setDuration(200L);
	//   20   41:aload_1         
	//   21   42:ldc2w           #258 <Long 200L>
	//   22   45:invokevirtual   #263 <Method void Animation.setDuration(long)>
			startAnimation(((Animation) (animation)));
	//   23   48:aload_0         
	//   24   49:aload_1         
	//   25   50:invokevirtual   #267 <Method void startAnimation(Animation)>
			return;
	//   26   53:return          
		}
	}

	public void b()
	{
		if(m)
	//*   0    0:aload_0         
	//*   1    1:getfield        #71  <Field boolean m>
	//*   2    4:ifeq            18
		{
			com.irobot.home.util.o.b(a, "SmartCard is animation! Cannot start collapseWithDelay now!");
	//    3    7:aload_0         
	//    4    8:getfield        #65  <Field String a>
	//    5   11:ldc2            #269 <String "SmartCard is animation! Cannot start collapseWithDelay now!">
	//    6   14:invokestatic    #241 <Method void o.b(String, String)>
			return;
	//    7   17:return          
		} else
		{
			postDelayed(new Runnable() {

				public void run()
				{
					a.a();
				//    0    0:aload_0         
				//    1    1:getfield        #17  <Field SmartRecommendationCardView a>
				//    2    4:invokevirtual   #23  <Method void SmartRecommendationCardView.a()>
				//    3    7:return          
				}

				final SmartRecommendationCardView a;

			
			{
				a = SmartRecommendationCardView.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field SmartRecommendationCardView a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
			}
, 300L);
	//    8   18:aload_0         
	//    9   19:new             #12  <Class SmartRecommendationCardView$2>
	//   10   22:dup             
	//   11   23:aload_0         
	//   12   24:invokespecial   #272 <Method void SmartRecommendationCardView$2(SmartRecommendationCardView)>
	//   13   27:ldc2w           #273 <Long 300L>
	//   14   30:invokevirtual   #278 <Method boolean postDelayed(Runnable, long)>
	//   15   33:pop             
			return;
	//   16   34:return          
		}
	}

	public void c()
	{
		if(m)
	//*   0    0:aload_0         
	//*   1    1:getfield        #71  <Field boolean m>
	//*   2    4:ifeq            18
		{
			com.irobot.home.util.o.b(a, "SmartCard is animation! Cannot start expanding now!");
	//    3    7:aload_0         
	//    4    8:getfield        #65  <Field String a>
	//    5   11:ldc2            #280 <String "SmartCard is animation! Cannot start expanding now!">
	//    6   14:invokestatic    #241 <Method void o.b(String, String)>
			return;
	//    7   17:return          
		} else
		{
			measure(-1, -2);
	//    8   18:aload_0         
	//    9   19:iconst_m1       
	//   10   20:bipush          -2
	//   11   22:invokevirtual   #284 <Method void measure(int, int)>
			int i1 = getMeasuredHeight();
	//   12   25:aload_0         
	//   13   26:invokevirtual   #244 <Method int getMeasuredHeight()>
	//   14   29:istore_1        
			getLayoutParams().height = 1;
	//   15   30:aload_0         
	//   16   31:invokevirtual   #288 <Method android.view.ViewGroup$LayoutParams getLayoutParams()>
	//   17   34:iconst_1        
	//   18   35:putfield        #293 <Field int android.view.ViewGroup$LayoutParams.height>
			setVisibility(0);
	//   19   38:aload_0         
	//   20   39:iconst_0        
	//   21   40:invokevirtual   #297 <Method void setVisibility(int)>
			Animation animation = new Animation(i1) {

				protected void applyTransformation(float f1, Transformation transformation)
				{
					transformation = ((Transformation) (b.getLayoutParams()));
				//    0    0:aload_0         
				//    1    1:getfield        #17  <Field SmartRecommendationCardView b>
				//    2    4:invokevirtual   #28  <Method android.view.ViewGroup$LayoutParams SmartRecommendationCardView.getLayoutParams()>
				//    3    7:astore_2        
					int k1 = f1 != 1.0F;
				//    4    8:fload_1         
				//    5    9:fconst_1        
				//    6   10:fcmpl           
				//    7   11:istore          4
					int j1;
					if(k1 == 0)
				//*   8   13:iload           4
				//*   9   15:ifne            24
						j1 = -2;
				//   10   18:bipush          -2
				//   11   20:istore_3        
					else
				//*  12   21:goto            33
						j1 = (int)((float)a * f1);
				//   13   24:aload_0         
				//   14   25:getfield        #19  <Field int a>
				//   15   28:i2f             
				//   16   29:fload_1         
				//   17   30:fmul            
				//   18   31:f2i             
				//   19   32:istore_3        
					transformation.height = j1;
				//   20   33:aload_2         
				//   21   34:iload_3         
				//   22   35:putfield        #33  <Field int android.view.ViewGroup$LayoutParams.height>
					transformation = ((Transformation) (b));
				//   23   38:aload_0         
				//   24   39:getfield        #17  <Field SmartRecommendationCardView b>
				//   25   42:astore_2        
					boolean flag1 = false;
				//   26   43:iconst_0        
				//   27   44:istore          6
					boolean flag;
					if(k1 != 0)
				//*  28   46:iload           4
				//*  29   48:ifeq            57
						flag = true;
				//   30   51:iconst_1        
				//   31   52:istore          5
					else
				//*  32   54:goto            60
						flag = false;
				//   33   57:iconst_0        
				//   34   58:istore          5
					SmartRecommendationCardView.a(((SmartRecommendationCardView) (transformation)), flag);
				//   35   60:aload_2         
				//   36   61:iload           5
				//   37   63:invokestatic    #36  <Method boolean SmartRecommendationCardView.a(SmartRecommendationCardView, boolean)>
				//   38   66:pop             
					transformation = ((Transformation) (b));
				//   39   67:aload_0         
				//   40   68:getfield        #17  <Field SmartRecommendationCardView b>
				//   41   71:astore_2        
					flag = flag1;
				//   42   72:iload           6
				//   43   74:istore          5
					if(k1 != 0)
				//*  44   76:iload           4
				//*  45   78:ifeq            84
						flag = true;
				//   46   81:iconst_1        
				//   47   82:istore          5
					com.irobot.home.view.SmartRecommendationCardView.b(((SmartRecommendationCardView) (transformation)), flag);
				//   48   84:aload_2         
				//   49   85:iload           5
				//   50   87:invokestatic    #38  <Method boolean com.irobot.home.view.SmartRecommendationCardView.b(SmartRecommendationCardView, boolean)>
				//   51   90:pop             
					if(k1 != 0 && SmartRecommendationCardView.c(b) != null)
				//*  52   91:iload           4
				//*  53   93:ifeq            128
				//*  54   96:aload_0         
				//*  55   97:getfield        #17  <Field SmartRecommendationCardView b>
				//*  56  100:invokestatic    #41  <Method com.irobot.home.n.b$c SmartRecommendationCardView.c(SmartRecommendationCardView)>
				//*  57  103:ifnull          128
						SmartRecommendationCardView.c(b).b(com.irobot.home.view.SmartRecommendationCardView.b(b));
				//   58  106:aload_0         
				//   59  107:getfield        #17  <Field SmartRecommendationCardView b>
				//   60  110:invokestatic    #41  <Method com.irobot.home.n.b$c SmartRecommendationCardView.c(SmartRecommendationCardView)>
				//   61  113:aload_0         
				//   62  114:getfield        #17  <Field SmartRecommendationCardView b>
				//   63  117:invokestatic    #44  <Method SmartRecommendationCardView com.irobot.home.view.SmartRecommendationCardView.b(SmartRecommendationCardView)>
				//   64  120:invokeinterface #49  <Method void com.irobot.home.n.b$c.b(SmartRecommendationCardView)>
					else
				//*  65  125:goto            157
					if(SmartRecommendationCardView.c(b) != null)
				//*  66  128:aload_0         
				//*  67  129:getfield        #17  <Field SmartRecommendationCardView b>
				//*  68  132:invokestatic    #41  <Method com.irobot.home.n.b$c SmartRecommendationCardView.c(SmartRecommendationCardView)>
				//*  69  135:ifnull          157
						SmartRecommendationCardView.c(b).a(com.irobot.home.view.SmartRecommendationCardView.b(b));
				//   70  138:aload_0         
				//   71  139:getfield        #17  <Field SmartRecommendationCardView b>
				//   72  142:invokestatic    #41  <Method com.irobot.home.n.b$c SmartRecommendationCardView.c(SmartRecommendationCardView)>
				//   73  145:aload_0         
				//   74  146:getfield        #17  <Field SmartRecommendationCardView b>
				//   75  149:invokestatic    #44  <Method SmartRecommendationCardView com.irobot.home.view.SmartRecommendationCardView.b(SmartRecommendationCardView)>
				//   76  152:invokeinterface #51  <Method void com.irobot.home.n.b$c.a(SmartRecommendationCardView)>
					b.requestLayout();
				//   77  157:aload_0         
				//   78  158:getfield        #17  <Field SmartRecommendationCardView b>
				//   79  161:invokevirtual   #54  <Method void SmartRecommendationCardView.requestLayout()>
				//   80  164:return          
				}

				public boolean willChangeBounds()
				{
					return true;
				//    0    0:iconst_1        
				//    1    1:ireturn         
				}

				final int a;
				final SmartRecommendationCardView b;

			
			{
				b = SmartRecommendationCardView.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field SmartRecommendationCardView b>
				a = i1;
			//    3    5:aload_0         
			//    4    6:iload_2         
			//    5    7:putfield        #19  <Field int a>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #21  <Method void Animation()>
			//    8   14:return          
			}
			}
;
	//   22   43:new             #14  <Class SmartRecommendationCardView$3>
	//   23   46:dup             
	//   24   47:aload_0         
	//   25   48:iload_1         
	//   26   49:invokespecial   #298 <Method void SmartRecommendationCardView$3(SmartRecommendationCardView, int)>
	//   27   52:astore_2        
			((Animation) (animation)).setInterpolator(((android.view.animation.Interpolator) (new AccelerateDecelerateInterpolator())));
	//   28   53:aload_2         
	//   29   54:new             #249 <Class AccelerateDecelerateInterpolator>
	//   30   57:dup             
	//   31   58:invokespecial   #251 <Method void AccelerateDecelerateInterpolator()>
	//   32   61:invokevirtual   #257 <Method void Animation.setInterpolator(android.view.animation.Interpolator)>
			((Animation) (animation)).setDuration(300L);
	//   33   64:aload_2         
	//   34   65:ldc2w           #273 <Long 300L>
	//   35   68:invokevirtual   #263 <Method void Animation.setDuration(long)>
			startAnimation(((Animation) (animation)));
	//   36   71:aload_0         
	//   37   72:aload_2         
	//   38   73:invokevirtual   #267 <Method void startAnimation(Animation)>
			return;
	//   39   76:return          
		}
	}

	void d()
	{
		if(j != 1)
	//*   0    0:aload_0         
	//*   1    1:getfield        #153 <Field int j>
	//*   2    4:iconst_1        
	//*   3    5:icmpeq          9
		{
			return;
	//    4    8:return          
		} else
		{
			d.setVisibility(8);
	//    5    9:aload_0         
	//    6   10:getfield        #115 <Field CustomTextView d>
	//    7   13:bipush          8
	//    8   15:invokevirtual   #299 <Method void CustomTextView.setVisibility(int)>
			e.setVisibility(0);
	//    9   18:aload_0         
	//   10   19:getfield        #126 <Field ImageButton e>
	//   11   22:iconst_0        
	//   12   23:invokevirtual   #300 <Method void ImageButton.setVisibility(int)>
			requestLayout();
	//   13   26:aload_0         
	//   14   27:invokevirtual   #303 <Method void requestLayout()>
			return;
	//   15   30:return          
		}
	}

	public boolean e()
	{
		return m;
	//    0    0:aload_0         
	//    1    1:getfield        #71  <Field boolean m>
	//    2    4:ireturn         
	}

	public int getSmartCardType()
	{
		return j;
	//    0    0:aload_0         
	//    1    1:getfield        #153 <Field int j>
	//    2    4:ireturn         
	}

	public boolean isShown()
	{
		return super.isShown() && !l;
	//    0    0:aload_0         
	//    1    1:invokespecial   #308 <Method boolean LinearLayout.isShown()>
	//    2    4:ifeq            16
	//    3    7:aload_0         
	//    4    8:getfield        #69  <Field boolean l>
	//    5   11:ifne            16
	//    6   14:iconst_1        
	//    7   15:ireturn         
	//    8   16:iconst_0        
	//    9   17:ireturn         
	}

	public void onClick(View view)
	{
		int i1 = view.getId();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #315 <Method int View.getId()>
	//    2    4:istore_2        
		if(i1 != 0x7f090017)
	//*   3    5:iload_2         
	//*   4    6:ldc1            #127 <Int 0x7f090017>
	//*   5    8:icmpeq          41
		{
			if(i1 != 0x7f090136)
	//*   6   11:iload_2         
	//*   7   12:ldc1            #122 <Int 0x7f090136>
	//*   8   14:icmpeq          18
				return;
	//    9   17:return          
			if(o != null)
	//*  10   18:aload_0         
	//*  11   19:getfield        #166 <Field com.irobot.home.n.b$a o>
	//*  12   22:ifnull          63
			{
				o.a(this, 2);
	//   13   25:aload_0         
	//   14   26:getfield        #166 <Field com.irobot.home.n.b$a o>
	//   15   29:aload_0         
	//   16   30:iconst_2        
	//   17   31:invokeinterface #319 <Method void com.irobot.home.n.b$a.a(SmartRecommendationCardView, int)>
				a();
	//   18   36:aload_0         
	//   19   37:invokevirtual   #321 <Method void a()>
				return;
	//   20   40:return          
			}
		} else
		if(n != null)
	//*  21   41:aload_0         
	//*  22   42:getfield        #162 <Field com.irobot.home.n.b$a n>
	//*  23   45:ifnull          63
		{
			n.a(this, 1);
	//   24   48:aload_0         
	//   25   49:getfield        #162 <Field com.irobot.home.n.b$a n>
	//   26   52:aload_0         
	//   27   53:iconst_1        
	//   28   54:invokeinterface #319 <Method void com.irobot.home.n.b$a.a(SmartRecommendationCardView, int)>
			b();
	//   29   59:aload_0         
	//   30   60:invokevirtual   #323 <Method void b()>
		}
	//   31   63:return          
	}

	private final String a;
	private ImageView b;
	private CustomTextView c;
	private CustomTextView d;
	private ImageButton e;
	private CustomTextView f;
	private CustomTextView g;
	private CustomButton h;
	private b i;
	private int j;
	private CharSequence k[];
	private boolean l;
	private boolean m;
	private com.irobot.home.n.b.a n;
	private com.irobot.home.n.b.a o;
	private com.irobot.home.n.b.b p;
	private com.irobot.home.n.b.c q;
}

// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Transformation;
import android.widget.LinearLayout;
import com.irobot.home.util.o;

public class ExpandablePanel extends LinearLayout
{
	private class a
		implements c
	{

		public void a(View view, View view1)
		{
		//    0    0:return          
		}

		public void b(View view, View view1)
		{
		//    0    0:return          
		}

		final ExpandablePanel a;

		private a()
		{
			a = ExpandablePanel.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #14  <Field ExpandablePanel a>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #17  <Method void Object()>
		//    5    9:return          
		}

	}

	private class b extends Animation
	{

		protected void applyTransformation(float f1, Transformation transformation)
		{
			transformation = ((Transformation) (ExpandablePanel.e(a).getLayoutParams()));
		//    0    0:aload_0         
		//    1    1:getfield        #15  <Field ExpandablePanel a>
		//    2    4:invokestatic    #29  <Method View ExpandablePanel.e(ExpandablePanel)>
		//    3    7:invokevirtual   #35  <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
		//    4   10:astore_2        
			transformation.height = (int)((float)b + (float)c * f1);
		//    5   11:aload_2         
		//    6   12:aload_0         
		//    7   13:getfield        #20  <Field int b>
		//    8   16:i2f             
		//    9   17:aload_0         
		//   10   18:getfield        #22  <Field int c>
		//   11   21:i2f             
		//   12   22:fload_1         
		//   13   23:fmul            
		//   14   24:fadd            
		//   15   25:f2i             
		//   16   26:putfield        #40  <Field int android.view.ViewGroup$LayoutParams.height>
			ExpandablePanel.e(a).setLayoutParams(((android.view.ViewGroup.LayoutParams) (transformation)));
		//   17   29:aload_0         
		//   18   30:getfield        #15  <Field ExpandablePanel a>
		//   19   33:invokestatic    #29  <Method View ExpandablePanel.e(ExpandablePanel)>
		//   20   36:aload_2         
		//   21   37:invokevirtual   #44  <Method void View.setLayoutParams(android.view.ViewGroup$LayoutParams)>
			ExpandablePanel.e(a).requestLayout();
		//   22   40:aload_0         
		//   23   41:getfield        #15  <Field ExpandablePanel a>
		//   24   44:invokestatic    #29  <Method View ExpandablePanel.e(ExpandablePanel)>
		//   25   47:invokevirtual   #47  <Method void View.requestLayout()>
		//   26   50:return          
		}

		public boolean willChangeBounds()
		{
			return true;
		//    0    0:iconst_1        
		//    1    1:ireturn         
		}

		final ExpandablePanel a;
		private final int b;
		private final int c;

		public b(int j, int k)
		{
			a = ExpandablePanel.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #15  <Field ExpandablePanel a>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #18  <Method void Animation()>
			b = j;
		//    5    9:aload_0         
		//    6   10:iload_2         
		//    7   11:putfield        #20  <Field int b>
			c = k - j;
		//    8   14:aload_0         
		//    9   15:iload_3         
		//   10   16:iload_2         
		//   11   17:isub            
		//   12   18:putfield        #22  <Field int c>
		//   13   21:return          
		}
	}

	public static interface c
	{

		public abstract void a(View view, View view1);

		public abstract void b(View view, View view1);
	}

	private class d
		implements android.view.View.OnClickListener
	{

		public void onClick(View view)
		{
			if(ExpandablePanel.a(a))
		//*   0    0:aload_0         
		//*   1    1:getfield        #15  <Field ExpandablePanel a>
		//*   2    4:invokestatic    #27  <Method boolean ExpandablePanel.a(ExpandablePanel)>
		//*   3    7:ifeq            120
			{
				view = ((View) (new StringBuilder()));
		//    4   10:new             #29  <Class StringBuilder>
		//    5   13:dup             
		//    6   14:invokespecial   #30  <Method void StringBuilder()>
		//    7   17:astore_1        
				((StringBuilder) (view)).append("Collapsefrom ");
		//    8   18:aload_1         
		//    9   19:ldc1            #32  <String "Collapsefrom ">
		//   10   21:invokevirtual   #36  <Method StringBuilder StringBuilder.append(String)>
		//   11   24:pop             
				((StringBuilder) (view)).append(ExpandablePanel.b(a));
		//   12   25:aload_1         
		//   13   26:aload_0         
		//   14   27:getfield        #15  <Field ExpandablePanel a>
		//   15   30:invokestatic    #40  <Method int ExpandablePanel.b(ExpandablePanel)>
		//   16   33:invokevirtual   #43  <Method StringBuilder StringBuilder.append(int)>
		//   17   36:pop             
				((StringBuilder) (view)).append(" to ");
		//   18   37:aload_1         
		//   19   38:ldc1            #45  <String " to ">
		//   20   40:invokevirtual   #36  <Method StringBuilder StringBuilder.append(String)>
		//   21   43:pop             
				((StringBuilder) (view)).append(ExpandablePanel.c(a));
		//   22   44:aload_1         
		//   23   45:aload_0         
		//   24   46:getfield        #15  <Field ExpandablePanel a>
		//   25   49:invokestatic    #48  <Method int ExpandablePanel.c(ExpandablePanel)>
		//   26   52:invokevirtual   #43  <Method StringBuilder StringBuilder.append(int)>
		//   27   55:pop             
				o.b("ExpandablePanel", ((StringBuilder) (view)).toString());
		//   28   56:ldc1            #50  <String "ExpandablePanel">
		//   29   58:aload_1         
		//   30   59:invokevirtual   #54  <Method String StringBuilder.toString()>
		//   31   62:invokestatic    #59  <Method void o.b(String, String)>
				view = ((View) (((b) (a)). new b(ExpandablePanel.b(a), ExpandablePanel.c(a))));
		//   32   65:new             #61  <Class ExpandablePanel$b>
		//   33   68:dup             
		//   34   69:aload_0         
		//   35   70:getfield        #15  <Field ExpandablePanel a>
		//   36   73:aload_0         
		//   37   74:getfield        #15  <Field ExpandablePanel a>
		//   38   77:invokestatic    #40  <Method int ExpandablePanel.b(ExpandablePanel)>
		//   39   80:aload_0         
		//   40   81:getfield        #15  <Field ExpandablePanel a>
		//   41   84:invokestatic    #48  <Method int ExpandablePanel.c(ExpandablePanel)>
		//   42   87:invokespecial   #64  <Method void ExpandablePanel$b(ExpandablePanel, int, int)>
		//   43   90:astore_1        
				ExpandablePanel.f(a).a(ExpandablePanel.d(a), ExpandablePanel.e(a));
		//   44   91:aload_0         
		//   45   92:getfield        #15  <Field ExpandablePanel a>
		//   46   95:invokestatic    #68  <Method ExpandablePanel$c ExpandablePanel.f(ExpandablePanel)>
		//   47   98:aload_0         
		//   48   99:getfield        #15  <Field ExpandablePanel a>
		//   49  102:invokestatic    #71  <Method View ExpandablePanel.d(ExpandablePanel)>
		//   50  105:aload_0         
		//   51  106:getfield        #15  <Field ExpandablePanel a>
		//   52  109:invokestatic    #74  <Method View ExpandablePanel.e(ExpandablePanel)>
		//   53  112:invokeinterface #79  <Method void ExpandablePanel$c.a(View, View)>
			} else
		//*  54  117:goto            227
			{
				view = ((View) (new StringBuilder()));
		//   55  120:new             #29  <Class StringBuilder>
		//   56  123:dup             
		//   57  124:invokespecial   #30  <Method void StringBuilder()>
		//   58  127:astore_1        
				((StringBuilder) (view)).append("Expand from ");
		//   59  128:aload_1         
		//   60  129:ldc1            #81  <String "Expand from ">
		//   61  131:invokevirtual   #36  <Method StringBuilder StringBuilder.append(String)>
		//   62  134:pop             
				((StringBuilder) (view)).append(ExpandablePanel.c(a));
		//   63  135:aload_1         
		//   64  136:aload_0         
		//   65  137:getfield        #15  <Field ExpandablePanel a>
		//   66  140:invokestatic    #48  <Method int ExpandablePanel.c(ExpandablePanel)>
		//   67  143:invokevirtual   #43  <Method StringBuilder StringBuilder.append(int)>
		//   68  146:pop             
				((StringBuilder) (view)).append(" to ");
		//   69  147:aload_1         
		//   70  148:ldc1            #45  <String " to ">
		//   71  150:invokevirtual   #36  <Method StringBuilder StringBuilder.append(String)>
		//   72  153:pop             
				((StringBuilder) (view)).append(ExpandablePanel.b(a));
		//   73  154:aload_1         
		//   74  155:aload_0         
		//   75  156:getfield        #15  <Field ExpandablePanel a>
		//   76  159:invokestatic    #40  <Method int ExpandablePanel.b(ExpandablePanel)>
		//   77  162:invokevirtual   #43  <Method StringBuilder StringBuilder.append(int)>
		//   78  165:pop             
				o.b("ExpandablePanel", ((StringBuilder) (view)).toString());
		//   79  166:ldc1            #50  <String "ExpandablePanel">
		//   80  168:aload_1         
		//   81  169:invokevirtual   #54  <Method String StringBuilder.toString()>
		//   82  172:invokestatic    #59  <Method void o.b(String, String)>
				view = ((View) (((b) (a)). new b(ExpandablePanel.c(a), ExpandablePanel.b(a))));
		//   83  175:new             #61  <Class ExpandablePanel$b>
		//   84  178:dup             
		//   85  179:aload_0         
		//   86  180:getfield        #15  <Field ExpandablePanel a>
		//   87  183:aload_0         
		//   88  184:getfield        #15  <Field ExpandablePanel a>
		//   89  187:invokestatic    #48  <Method int ExpandablePanel.c(ExpandablePanel)>
		//   90  190:aload_0         
		//   91  191:getfield        #15  <Field ExpandablePanel a>
		//   92  194:invokestatic    #40  <Method int ExpandablePanel.b(ExpandablePanel)>
		//   93  197:invokespecial   #64  <Method void ExpandablePanel$b(ExpandablePanel, int, int)>
		//   94  200:astore_1        
				ExpandablePanel.f(a).b(ExpandablePanel.d(a), ExpandablePanel.e(a));
		//   95  201:aload_0         
		//   96  202:getfield        #15  <Field ExpandablePanel a>
		//   97  205:invokestatic    #68  <Method ExpandablePanel$c ExpandablePanel.f(ExpandablePanel)>
		//   98  208:aload_0         
		//   99  209:getfield        #15  <Field ExpandablePanel a>
		//  100  212:invokestatic    #71  <Method View ExpandablePanel.d(ExpandablePanel)>
		//  101  215:aload_0         
		//  102  216:getfield        #15  <Field ExpandablePanel a>
		//  103  219:invokestatic    #74  <Method View ExpandablePanel.e(ExpandablePanel)>
		//  104  222:invokeinterface #83  <Method void ExpandablePanel$c.b(View, View)>
			}
			StringBuilder stringbuilder = new StringBuilder();
		//  105  227:new             #29  <Class StringBuilder>
		//  106  230:dup             
		//  107  231:invokespecial   #30  <Method void StringBuilder()>
		//  108  234:astore_2        
			stringbuilder.append("Anim duration = ");
		//  109  235:aload_2         
		//  110  236:ldc1            #85  <String "Anim duration = ">
		//  111  238:invokevirtual   #36  <Method StringBuilder StringBuilder.append(String)>
		//  112  241:pop             
			stringbuilder.append(ExpandablePanel.g(a));
		//  113  242:aload_2         
		//  114  243:aload_0         
		//  115  244:getfield        #15  <Field ExpandablePanel a>
		//  116  247:invokestatic    #88  <Method int ExpandablePanel.g(ExpandablePanel)>
		//  117  250:invokevirtual   #43  <Method StringBuilder StringBuilder.append(int)>
		//  118  253:pop             
			o.b("ExpandablePanel", stringbuilder.toString());
		//  119  254:ldc1            #50  <String "ExpandablePanel">
		//  120  256:aload_2         
		//  121  257:invokevirtual   #54  <Method String StringBuilder.toString()>
		//  122  260:invokestatic    #59  <Method void o.b(String, String)>
			((Animation) (view)).setDuration(ExpandablePanel.g(a));
		//  123  263:aload_1         
		//  124  264:aload_0         
		//  125  265:getfield        #15  <Field ExpandablePanel a>
		//  126  268:invokestatic    #88  <Method int ExpandablePanel.g(ExpandablePanel)>
		//  127  271:i2l             
		//  128  272:invokevirtual   #94  <Method void Animation.setDuration(long)>
			ExpandablePanel.e(a).startAnimation(((Animation) (view)));
		//  129  275:aload_0         
		//  130  276:getfield        #15  <Field ExpandablePanel a>
		//  131  279:invokestatic    #74  <Method View ExpandablePanel.e(ExpandablePanel)>
		//  132  282:aload_1         
		//  133  283:invokevirtual   #100 <Method void View.startAnimation(Animation)>
			ExpandablePanel.e(a).getAnimation().reset();
		//  134  286:aload_0         
		//  135  287:getfield        #15  <Field ExpandablePanel a>
		//  136  290:invokestatic    #74  <Method View ExpandablePanel.e(ExpandablePanel)>
		//  137  293:invokevirtual   #104 <Method Animation View.getAnimation()>
		//  138  296:invokevirtual   #107 <Method void Animation.reset()>
			ExpandablePanel.e(a).getAnimation().start();
		//  139  299:aload_0         
		//  140  300:getfield        #15  <Field ExpandablePanel a>
		//  141  303:invokestatic    #74  <Method View ExpandablePanel.e(ExpandablePanel)>
		//  142  306:invokevirtual   #104 <Method Animation View.getAnimation()>
		//  143  309:invokevirtual   #110 <Method void Animation.start()>
			ExpandablePanel.e(a).requestLayout();
		//  144  312:aload_0         
		//  145  313:getfield        #15  <Field ExpandablePanel a>
		//  146  316:invokestatic    #74  <Method View ExpandablePanel.e(ExpandablePanel)>
		//  147  319:invokevirtual   #113 <Method void View.requestLayout()>
			ExpandablePanel.a(a, ExpandablePanel.a(a) ^ true);
		//  148  322:aload_0         
		//  149  323:getfield        #15  <Field ExpandablePanel a>
		//  150  326:aload_0         
		//  151  327:getfield        #15  <Field ExpandablePanel a>
		//  152  330:invokestatic    #27  <Method boolean ExpandablePanel.a(ExpandablePanel)>
		//  153  333:iconst_1        
		//  154  334:ixor            
		//  155  335:invokestatic    #116 <Method boolean ExpandablePanel.a(ExpandablePanel, boolean)>
		//  156  338:pop             
		//  157  339:return          
		}

		final ExpandablePanel a;

		private d()
		{
			a = ExpandablePanel.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #15  <Field ExpandablePanel a>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #18  <Method void Object()>
		//    5    9:return          
		}

	}


	public ExpandablePanel(Context context)
	{
		this(context, ((AttributeSet) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:invokespecial   #32  <Method void ExpandablePanel(Context, AttributeSet)>
	//    4    6:return          
	}

	public ExpandablePanel(Context context, AttributeSet attributeset)
	{
		super(context, attributeset);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #34  <Method void LinearLayout(Context, AttributeSet)>
		e = false;
	//    4    6:aload_0         
	//    5    7:iconst_0        
	//    6    8:putfield        #36  <Field boolean e>
		f = 0;
	//    7   11:aload_0         
	//    8   12:iconst_0        
	//    9   13:putfield        #38  <Field int f>
		g = 0;
	//   10   16:aload_0         
	//   11   17:iconst_0        
	//   12   18:putfield        #40  <Field int g>
		h = 0;
	//   13   21:aload_0         
	//   14   22:iconst_0        
	//   15   23:putfield        #42  <Field int h>
		setOrientation(1);
	//   16   26:aload_0         
	//   17   27:iconst_1        
	//   18   28:invokevirtual   #46  <Method void setOrientation(int)>
		i = ((c) (new a()));
	//   19   31:aload_0         
	//   20   32:new             #8   <Class ExpandablePanel$a>
	//   21   35:dup             
	//   22   36:aload_0         
	//   23   37:aconst_null     
	//   24   38:invokespecial   #49  <Method void ExpandablePanel$a(ExpandablePanel, ExpandablePanel$1)>
	//   25   41:putfield        #51  <Field ExpandablePanel$c i>
		context = ((Context) (context.obtainStyledAttributes(attributeset, com.irobot.home.g.a.ExpandablePanel, 0, 0)));
	//   26   44:aload_1         
	//   27   45:aload_2         
	//   28   46:getstatic       #57  <Field int[] com.irobot.home.g$a.ExpandablePanel>
	//   29   49:iconst_0        
	//   30   50:iconst_0        
	//   31   51:invokevirtual   #63  <Method TypedArray Context.obtainStyledAttributes(AttributeSet, int[], int, int)>
	//   32   54:astore_1        
		f = (int)((TypedArray) (context)).getDimension(1, 0.0F);
	//   33   55:aload_0         
	//   34   56:aload_1         
	//   35   57:iconst_1        
	//   36   58:fconst_0        
	//   37   59:invokevirtual   #69  <Method float TypedArray.getDimension(int, float)>
	//   38   62:f2i             
	//   39   63:putfield        #38  <Field int f>
		h = ((TypedArray) (context)).getInteger(0, 500);
	//   40   66:aload_0         
	//   41   67:aload_1         
	//   42   68:iconst_0        
	//   43   69:sipush          500
	//   44   72:invokevirtual   #73  <Method int TypedArray.getInteger(int, int)>
	//   45   75:putfield        #42  <Field int h>
		int j = ((TypedArray) (context)).getResourceId(3, 0);
	//   46   78:aload_1         
	//   47   79:iconst_3        
	//   48   80:iconst_0        
	//   49   81:invokevirtual   #76  <Method int TypedArray.getResourceId(int, int)>
	//   50   84:istore_3        
		if(j == 0)
	//*  51   85:iload_3         
	//*  52   86:ifne            99
			throw new IllegalArgumentException("The handle attribute is required and must refer to a valid child.");
	//   53   89:new             #78  <Class IllegalArgumentException>
	//   54   92:dup             
	//   55   93:ldc1            #80  <String "The handle attribute is required and must refer to a valid child.">
	//   56   95:invokespecial   #83  <Method void IllegalArgumentException(String)>
	//   57   98:athrow          
		int k = ((TypedArray) (context)).getResourceId(2, 0);
	//   58   99:aload_1         
	//   59  100:iconst_2        
	//   60  101:iconst_0        
	//   61  102:invokevirtual   #76  <Method int TypedArray.getResourceId(int, int)>
	//   62  105:istore          4
		if(k == 0)
	//*  63  107:iload           4
	//*  64  109:ifne            122
		{
			throw new IllegalArgumentException("The content attribute is required and must refer to a valid child.");
	//   65  112:new             #78  <Class IllegalArgumentException>
	//   66  115:dup             
	//   67  116:ldc1            #85  <String "The content attribute is required and must refer to a valid child.">
	//   68  118:invokespecial   #83  <Method void IllegalArgumentException(String)>
	//   69  121:athrow          
		} else
		{
			a = j;
	//   70  122:aload_0         
	//   71  123:iload_3         
	//   72  124:putfield        #87  <Field int a>
			b = k;
	//   73  127:aload_0         
	//   74  128:iload           4
	//   75  130:putfield        #89  <Field int b>
			((TypedArray) (context)).recycle();
	//   76  133:aload_1         
	//   77  134:invokevirtual   #93  <Method void TypedArray.recycle()>
			return;
	//   78  137:return          
		}
	}

	static boolean a(ExpandablePanel expandablepanel)
	{
		return expandablepanel.e;
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field boolean e>
	//    2    4:ireturn         
	}

	static boolean a(ExpandablePanel expandablepanel, boolean flag)
	{
		expandablepanel.e = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #36  <Field boolean e>
		return flag;
	//    3    5:iload_1         
	//    4    6:ireturn         
	}

	static int b(ExpandablePanel expandablepanel)
	{
		return expandablepanel.g;
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field int g>
	//    2    4:ireturn         
	}

	static int c(ExpandablePanel expandablepanel)
	{
		return expandablepanel.f;
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field int f>
	//    2    4:ireturn         
	}

	static View d(ExpandablePanel expandablepanel)
	{
		return expandablepanel.c;
	//    0    0:aload_0         
	//    1    1:getfield        #99  <Field View c>
	//    2    4:areturn         
	}

	static View e(ExpandablePanel expandablepanel)
	{
		return expandablepanel.d;
	//    0    0:aload_0         
	//    1    1:getfield        #101 <Field View d>
	//    2    4:areturn         
	}

	static c f(ExpandablePanel expandablepanel)
	{
		return expandablepanel.i;
	//    0    0:aload_0         
	//    1    1:getfield        #51  <Field ExpandablePanel$c i>
	//    2    4:areturn         
	}

	static int g(ExpandablePanel expandablepanel)
	{
		return expandablepanel.h;
	//    0    0:aload_0         
	//    1    1:getfield        #42  <Field int h>
	//    2    4:ireturn         
	}

	protected void onFinishInflate()
	{
		super.onFinishInflate();
	//    0    0:aload_0         
	//    1    1:invokespecial   #105 <Method void LinearLayout.onFinishInflate()>
		c = findViewById(a);
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:aload_0         
	//    5    7:getfield        #87  <Field int a>
	//    6   10:invokevirtual   #109 <Method View findViewById(int)>
	//    7   13:putfield        #99  <Field View c>
		if(c == null)
	//*   8   16:aload_0         
	//*   9   17:getfield        #99  <Field View c>
	//*  10   20:ifnonnull       33
			throw new IllegalArgumentException("The handle attribute is must refer to an existing child.");
	//   11   23:new             #78  <Class IllegalArgumentException>
	//   12   26:dup             
	//   13   27:ldc1            #111 <String "The handle attribute is must refer to an existing child.">
	//   14   29:invokespecial   #83  <Method void IllegalArgumentException(String)>
	//   15   32:athrow          
		d = findViewById(b);
	//   16   33:aload_0         
	//   17   34:aload_0         
	//   18   35:aload_0         
	//   19   36:getfield        #89  <Field int b>
	//   20   39:invokevirtual   #109 <Method View findViewById(int)>
	//   21   42:putfield        #101 <Field View d>
		if(d == null)
	//*  22   45:aload_0         
	//*  23   46:getfield        #101 <Field View d>
	//*  24   49:ifnonnull       62
		{
			throw new IllegalArgumentException("The content attribute must refer to an existing child.");
	//   25   52:new             #78  <Class IllegalArgumentException>
	//   26   55:dup             
	//   27   56:ldc1            #113 <String "The content attribute must refer to an existing child.">
	//   28   58:invokespecial   #83  <Method void IllegalArgumentException(String)>
	//   29   61:athrow          
		} else
		{
			android.view.ViewGroup.LayoutParams layoutparams = d.getLayoutParams();
	//   30   62:aload_0         
	//   31   63:getfield        #101 <Field View d>
	//   32   66:invokevirtual   #119 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   33   69:astore_1        
			layoutparams.height = f;
	//   34   70:aload_1         
	//   35   71:aload_0         
	//   36   72:getfield        #38  <Field int f>
	//   37   75:putfield        #124 <Field int android.view.ViewGroup$LayoutParams.height>
			d.setLayoutParams(layoutparams);
	//   38   78:aload_0         
	//   39   79:getfield        #101 <Field View d>
	//   40   82:aload_1         
	//   41   83:invokevirtual   #128 <Method void View.setLayoutParams(android.view.ViewGroup$LayoutParams)>
			c.setOnClickListener(((android.view.View.OnClickListener) (new d())));
	//   42   86:aload_0         
	//   43   87:getfield        #99  <Field View c>
	//   44   90:new             #17  <Class ExpandablePanel$d>
	//   45   93:dup             
	//   46   94:aload_0         
	//   47   95:aconst_null     
	//   48   96:invokespecial   #129 <Method void ExpandablePanel$d(ExpandablePanel, ExpandablePanel$1)>
	//   49   99:invokevirtual   #133 <Method void View.setOnClickListener(android.view.View$OnClickListener)>
			return;
	//   50  102:return          
		}
	}

	protected void onMeasure(int j, int k)
	{
		View view = d;
	//    0    0:aload_0         
	//    1    1:getfield        #101 <Field View d>
	//    2    4:astore          4
		byte byte0 = 0;
	//    3    6:iconst_0        
	//    4    7:istore_3        
		view.measure(j, 0);
	//    5    8:aload           4
	//    6   10:iload_1         
	//    7   11:iconst_0        
	//    8   12:invokevirtual   #138 <Method void View.measure(int, int)>
		g = d.getMeasuredHeight();
	//    9   15:aload_0         
	//   10   16:aload_0         
	//   11   17:getfield        #101 <Field View d>
	//   12   20:invokevirtual   #142 <Method int View.getMeasuredHeight()>
	//   13   23:putfield        #40  <Field int g>
		if(g < f)
	//*  14   26:aload_0         
	//*  15   27:getfield        #40  <Field int g>
	//*  16   30:aload_0         
	//*  17   31:getfield        #38  <Field int f>
	//*  18   34:icmpge          55
		{
			view = c;
	//   19   37:aload_0         
	//   20   38:getfield        #99  <Field View c>
	//   21   41:astore          4
			byte0 = 8;
	//   22   43:bipush          8
	//   23   45:istore_3        
		} else
	//*  24   46:aload           4
	//*  25   48:iload_3         
	//*  26   49:invokevirtual   #145 <Method void View.setVisibility(int)>
	//*  27   52:goto            64
		{
			view = c;
	//   28   55:aload_0         
	//   29   56:getfield        #99  <Field View c>
	//   30   59:astore          4
		}
		view.setVisibility(((int) (byte0)));
	//*  31   61:goto            46
		super.onMeasure(j, k);
	//   32   64:aload_0         
	//   33   65:iload_1         
	//   34   66:iload_2         
	//   35   67:invokespecial   #147 <Method void LinearLayout.onMeasure(int, int)>
	//   36   70:return          
	}

	public void setAnimationDuration(int j)
	{
		h = j;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #42  <Field int h>
	//    3    5:return          
	}

	public void setCollapsedHeight(int j)
	{
		f = j;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #38  <Field int f>
	//    3    5:return          
	}

	public void setOnExpandListener(c c1)
	{
		i = c1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #51  <Field ExpandablePanel$c i>
	//    3    5:return          
	}

	private final int a;
	private final int b;
	private View c;
	private View d;
	private boolean e;
	private int f;
	private int g;
	private int h;
	private c i;
}

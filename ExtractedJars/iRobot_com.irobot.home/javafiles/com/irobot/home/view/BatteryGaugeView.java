// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.view;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.support.v4.content.a;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.*;
import com.irobot.home.util.j;
import com.irobot.home.util.o;
import java.util.Locale;

// Referenced classes of package com.irobot.home.view:
//			CustomTextView

public class BatteryGaugeView extends LinearLayout
{
	public static final class a extends Enum
	{

		public static a valueOf(String s)
		{
			return (a)Enum.valueOf(com/irobot/home/view/BatteryGaugeView$a, s);
		//    0    0:ldc1            #2   <Class BatteryGaugeView$a>
		//    1    2:aload_0         
		//    2    3:invokestatic    #35  <Method Enum Enum.valueOf(Class, String)>
		//    3    6:checkcast       #2   <Class BatteryGaugeView$a>
		//    4    9:areturn         
		}

		public static a[] values()
		{
			return (a[])((a []) ($VALUES)).clone();
		//    0    0:getstatic       #27  <Field BatteryGaugeView$a[] $VALUES>
		//    1    3:invokevirtual   #42  <Method Object _5B_Lcom.irobot.home.view.BatteryGaugeView$a_3B_.clone()>
		//    2    6:checkcast       #38  <Class BatteryGaugeView$a[]>
		//    3    9:areturn         
		}

		private static final a $VALUES[];
		public static final a COLORFUL;
		public static final a SIMPLE;

		static 
		{
			COLORFUL = new a("COLORFUL", 0);
		//    0    0:new             #2   <Class BatteryGaugeView$a>
		//    1    3:dup             
		//    2    4:ldc1            #16  <String "COLORFUL">
		//    3    6:iconst_0        
		//    4    7:invokespecial   #20  <Method void BatteryGaugeView$a(String, int)>
		//    5   10:putstatic       #22  <Field BatteryGaugeView$a COLORFUL>
			SIMPLE = new a("SIMPLE", 1);
		//    6   13:new             #2   <Class BatteryGaugeView$a>
		//    7   16:dup             
		//    8   17:ldc1            #23  <String "SIMPLE">
		//    9   19:iconst_1        
		//   10   20:invokespecial   #20  <Method void BatteryGaugeView$a(String, int)>
		//   11   23:putstatic       #25  <Field BatteryGaugeView$a SIMPLE>
			$VALUES = (new a[] {
				COLORFUL, SIMPLE
			});
		//   12   26:iconst_2        
		//   13   27:anewarray       a[]
		//   14   30:dup             
		//   15   31:iconst_0        
		//   16   32:getstatic       #22  <Field BatteryGaugeView$a COLORFUL>
		//   17   35:aastore         
		//   18   36:dup             
		//   19   37:iconst_1        
		//   20   38:getstatic       #25  <Field BatteryGaugeView$a SIMPLE>
		//   21   41:aastore         
		//   22   42:putstatic       #27  <Field BatteryGaugeView$a[] $VALUES>
		//*  23   45:return          
		}

		private a(String s, int i1)
		{
			super(s, i1);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #29  <Method void Enum(String, int)>
		//    4    6:return          
		}
	}


	public BatteryGaugeView(Context context)
	{
		this(context, ((AttributeSet) (null)), 0);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:iconst_0        
	//    4    4:invokespecial   #42  <Method void BatteryGaugeView(Context, AttributeSet, int)>
	//    5    7:return          
	}

	public BatteryGaugeView(Context context, AttributeSet attributeset)
	{
		this(context, attributeset, 0);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iconst_0        
	//    4    4:invokespecial   #42  <Method void BatteryGaugeView(Context, AttributeSet, int)>
	//    5    7:return          
	}

	public BatteryGaugeView(Context context, AttributeSet attributeset, int i1)
	{
		super(context, attributeset, i1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:invokespecial   #44  <Method void LinearLayout(Context, AttributeSet, int)>
		b = a.COLORFUL;
	//    5    7:aload_0         
	//    6    8:getstatic       #47  <Field BatteryGaugeView$a BatteryGaugeView$a.COLORFUL>
	//    7   11:putfield        #49  <Field BatteryGaugeView$a b>
		c = -1F;
	//    8   14:aload_0         
	//    9   15:ldc1            #50  <Float -1F>
	//   10   17:putfield        #52  <Field float c>
		l = 13F;
	//   11   20:aload_0         
	//   12   21:ldc1            #53  <Float 13F>
	//   13   23:putfield        #55  <Field float l>
		a(context, attributeset, i1);
	//   14   26:aload_0         
	//   15   27:aload_1         
	//   16   28:aload_2         
	//   17   29:iload_3         
	//   18   30:invokevirtual   #57  <Method void a(Context, AttributeSet, int)>
	//   19   33:return          
	}

	static int a(BatteryGaugeView batterygaugeview, int i1)
	{
		batterygaugeview.e = i1;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #60  <Field int e>
		return i1;
	//    3    5:iload_1         
	//    4    6:ireturn         
	}

	static View a(BatteryGaugeView batterygaugeview)
	{
		return batterygaugeview.i;
	//    0    0:aload_0         
	//    1    1:getfield        #63  <Field View i>
	//    2    4:areturn         
	}

	static String a()
	{
		return a;
	//    0    0:getstatic       #66  <Field String a>
	//    1    3:areturn         
	}

	static int b(BatteryGaugeView batterygaugeview, int i1)
	{
		batterygaugeview.f = i1;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #68  <Field int f>
		return i1;
	//    3    5:iload_1         
	//    4    6:ireturn         
	}

	private void b()
	{
		int i1 = TextUtils.getLayoutDirectionFromLocale(Locale.getDefault());
	//    0    0:invokestatic    #74  <Method Locale Locale.getDefault()>
	//    1    3:invokestatic    #80  <Method int TextUtils.getLayoutDirectionFromLocale(Locale)>
	//    2    6:istore_2        
		boolean flag = true;
	//    3    7:iconst_1        
	//    4    8:istore_1        
		if(i1 != 1)
	//*   5    9:iload_2         
	//*   6   10:iconst_1        
	//*   7   11:icmpne          17
	//*   8   14:goto            19
			flag = false;
	//    9   17:iconst_0        
	//   10   18:istore_1        
		if(flag)
	//*  11   19:iload_1         
	//*  12   20:ifeq            45
		{
			j.setRotation(180F);
	//   13   23:aload_0         
	//   14   24:getfield        #82  <Field FrameLayout j>
	//   15   27:ldc1            #83  <Float 180F>
	//   16   29:invokevirtual   #89  <Method void FrameLayout.setRotation(float)>
			h.setRotationX(180F);
	//   17   32:aload_0         
	//   18   33:getfield        #91  <Field ImageView h>
	//   19   36:ldc1            #83  <Float 180F>
	//   20   38:invokevirtual   #96  <Method void ImageView.setRotationX(float)>
			requestLayout();
	//   21   41:aload_0         
	//   22   42:invokevirtual   #99  <Method void requestLayout()>
		}
	//   23   45:return          
	}

	static void b(BatteryGaugeView batterygaugeview)
	{
		batterygaugeview.e();
	//    0    0:aload_0         
	//    1    1:invokespecial   #102 <Method void e()>
	//    2    4:return          
	}

	private void c()
	{
		GradientDrawable gradientdrawable = (GradientDrawable)i.getBackground().mutate();
	//    0    0:aload_0         
	//    1    1:getfield        #63  <Field View i>
	//    2    4:invokevirtual   #108 <Method Drawable View.getBackground()>
	//    3    7:invokevirtual   #113 <Method Drawable Drawable.mutate()>
	//    4   10:checkcast       #115 <Class GradientDrawable>
	//    5   13:astore_3        
		a a1 = b;
	//    6   14:aload_0         
	//    7   15:getfield        #49  <Field BatteryGaugeView$a b>
	//    8   18:astore          4
		a a2 = a.COLORFUL;
	//    9   20:getstatic       #47  <Field BatteryGaugeView$a BatteryGaugeView$a.COLORFUL>
	//   10   23:astore          5
		int i1 = 0x7f0600b2;
	//   11   25:ldc1            #116 <Int 0x7f0600b2>
	//   12   27:istore_1        
		int j1;
		if(a1 == a2)
	//*  13   28:aload           4
	//*  14   30:aload           5
	//*  15   32:if_acmpne       73
		{
			if(c <= l)
	//*  16   35:aload_0         
	//*  17   36:getfield        #52  <Field float c>
	//*  18   39:aload_0         
	//*  19   40:getfield        #55  <Field float l>
	//*  20   43:fcmpg           
	//*  21   44:ifgt            52
				i1 = 1;
	//   22   47:iconst_1        
	//   23   48:istore_1        
			else
	//*  24   49:goto            54
				i1 = 0;
	//   25   52:iconst_0        
	//   26   53:istore_1        
			if(i1 != 0)
	//*  27   54:iload_1         
	//*  28   55:ifeq            64
				i1 = 0x7f060020;
	//   29   58:ldc1            #117 <Int 0x7f060020>
	//   30   60:istore_1        
			else
	//*  31   61:goto            67
				i1 = 0x7f06001f;
	//   32   64:ldc1            #118 <Int 0x7f06001f>
	//   33   66:istore_1        
			j1 = 0x7f06005a;
	//   34   67:ldc1            #119 <Int 0x7f06005a>
	//   35   69:istore_2        
		} else
	//*  36   70:goto            76
		{
			j1 = 0x7f0600b2;
	//   37   73:ldc1            #116 <Int 0x7f0600b2>
	//   38   75:istore_2        
		}
		gradientdrawable.setColor(getContext().getResources().getColor(i1));
	//   39   76:aload_3         
	//   40   77:aload_0         
	//   41   78:invokevirtual   #123 <Method Context getContext()>
	//   42   81:invokevirtual   #129 <Method Resources Context.getResources()>
	//   43   84:iload_1         
	//   44   85:invokevirtual   #135 <Method int Resources.getColor(int)>
	//   45   88:invokevirtual   #139 <Method void GradientDrawable.setColor(int)>
		k.setTextColor(getResources().getColor(j1));
	//   46   91:aload_0         
	//   47   92:getfield        #141 <Field CustomTextView k>
	//   48   95:aload_0         
	//   49   96:invokevirtual   #142 <Method Resources getResources()>
	//   50   99:iload_2         
	//   51  100:invokevirtual   #135 <Method int Resources.getColor(int)>
	//   52  103:invokevirtual   #147 <Method void CustomTextView.setTextColor(int)>
	//   53  106:return          
	}

	static void c(BatteryGaugeView batterygaugeview)
	{
		batterygaugeview.g();
	//    0    0:aload_0         
	//    1    1:invokespecial   #149 <Method void g()>
	//    2    4:return          
	}

	private void d()
	{
		getViewTreeObserver().addOnGlobalLayoutListener(new android.view.ViewTreeObserver.OnGlobalLayoutListener() {

			public void onGlobalLayout()
			{
				IllegalStateException illegalstateexception;
				com.irobot.home.view.BatteryGaugeView.a(a, BatteryGaugeView.e(a).getWidth());
			//    0    0:aload_0         
			//    1    1:getfield        #17  <Field BatteryGaugeView a>
			//    2    4:aload_0         
			//    3    5:getfield        #17  <Field BatteryGaugeView a>
			//    4    8:invokestatic    #27  <Method ImageView BatteryGaugeView.e(BatteryGaugeView)>
			//    5   11:invokevirtual   #33  <Method int ImageView.getWidth()>
			//    6   14:invokestatic    #36  <Method int com.irobot.home.view.BatteryGaugeView.a(BatteryGaugeView, int)>
			//    7   17:pop             
				BatteryGaugeView.b(a, BatteryGaugeView.e(a).getHeight());
			//    8   18:aload_0         
			//    9   19:getfield        #17  <Field BatteryGaugeView a>
			//   10   22:aload_0         
			//   11   23:getfield        #17  <Field BatteryGaugeView a>
			//   12   26:invokestatic    #27  <Method ImageView BatteryGaugeView.e(BatteryGaugeView)>
			//   13   29:invokevirtual   #39  <Method int ImageView.getHeight()>
			//   14   32:invokestatic    #42  <Method int BatteryGaugeView.b(BatteryGaugeView, int)>
			//   15   35:pop             
				try
				{
					if(BatteryGaugeView.f(a) > 0)
			//*  16   36:aload_0         
			//*  17   37:getfield        #17  <Field BatteryGaugeView a>
			//*  18   40:invokestatic    #46  <Method int BatteryGaugeView.f(BatteryGaugeView)>
			//*  19   43:ifle            97
					{
						a.getViewTreeObserver().removeOnGlobalLayoutListener(((android.view.ViewTreeObserver.OnGlobalLayoutListener) (this)));
			//   20   46:aload_0         
			//   21   47:getfield        #17  <Field BatteryGaugeView a>
			//   22   50:invokevirtual   #50  <Method ViewTreeObserver BatteryGaugeView.getViewTreeObserver()>
			//   23   53:aload_0         
			//   24   54:invokevirtual   #56  <Method void ViewTreeObserver.removeOnGlobalLayoutListener(android.view.ViewTreeObserver$OnGlobalLayoutListener)>
						a.post(BatteryGaugeView.g(a));
			//   25   57:aload_0         
			//   26   58:getfield        #17  <Field BatteryGaugeView a>
			//   27   61:aload_0         
			//   28   62:getfield        #17  <Field BatteryGaugeView a>
			//   29   65:invokestatic    #60  <Method Runnable BatteryGaugeView.g(BatteryGaugeView)>
			//   30   68:invokevirtual   #64  <Method boolean BatteryGaugeView.post(Runnable)>
			//   31   71:pop             
						return;
			//   32   72:return          
					}
				}
			//*  33   73:invokestatic    #67  <Method String com.irobot.home.view.BatteryGaugeView.a()>
			//*  34   76:getstatic       #73  <Field Locale Locale.US>
			//*  35   79:ldc1            #75  <String "%s tried to remove an expired tree observer">
			//*  36   81:iconst_1        
			//*  37   82:anewarray       Object[]
			//*  38   85:dup             
			//*  39   86:iconst_0        
			//*  40   87:invokestatic    #67  <Method String com.irobot.home.view.BatteryGaugeView.a()>
			//*  41   90:aastore         
			//*  42   91:invokestatic    #81  <Method String String.format(Locale, String, Object[])>
			//*  43   94:invokestatic    #86  <Method void o.d(String, String)>
			//*  44   97:return          
				// Misplaced declaration of an exception variable
				catch(IllegalStateException illegalstateexception)
				{
					o.d(com.irobot.home.view.BatteryGaugeView.a(), String.format(Locale.US, "%s tried to remove an expired tree observer", new Object[] {
						com.irobot.home.view.BatteryGaugeView.a()
					}));
				}
			//*  45   98:astore_1        
			//*  46   99:goto            73
			}

			final BatteryGaugeView a;

			
			{
				a = BatteryGaugeView.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field BatteryGaugeView a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
		}
);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #153 <Method ViewTreeObserver getViewTreeObserver()>
	//    2    4:new             #8   <Class BatteryGaugeView$2>
	//    3    7:dup             
	//    4    8:aload_0         
	//    5    9:invokespecial   #155 <Method void BatteryGaugeView$2(BatteryGaugeView)>
	//    6   12:invokevirtual   #161 <Method void ViewTreeObserver.addOnGlobalLayoutListener(android.view.ViewTreeObserver$OnGlobalLayoutListener)>
	//    7   15:return          
	}

	static void d(BatteryGaugeView batterygaugeview)
	{
		batterygaugeview.c();
	//    0    0:aload_0         
	//    1    1:invokespecial   #163 <Method void c()>
	//    2    4:return          
	}

	static ImageView e(BatteryGaugeView batterygaugeview)
	{
		return batterygaugeview.h;
	//    0    0:aload_0         
	//    1    1:getfield        #91  <Field ImageView h>
	//    2    4:areturn         
	}

	private void e()
	{
		i = new View(getContext());
	//    0    0:aload_0         
	//    1    1:new             #104 <Class View>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:invokevirtual   #123 <Method Context getContext()>
	//    5    9:invokespecial   #166 <Method void View(Context)>
	//    6   12:putfield        #63  <Field View i>
		i.setBackground(android.support.v4.content.a.getDrawable(getContext(), 0x7f0801b0));
	//    7   15:aload_0         
	//    8   16:getfield        #63  <Field View i>
	//    9   19:aload_0         
	//   10   20:invokevirtual   #123 <Method Context getContext()>
	//   11   23:ldc1            #167 <Int 0x7f0801b0>
	//   12   25:invokestatic    #173 <Method Drawable a.getDrawable(Context, int)>
	//   13   28:invokevirtual   #177 <Method void View.setBackground(Drawable)>
		i.setId(View.generateViewId());
	//   14   31:aload_0         
	//   15   32:getfield        #63  <Field View i>
	//   16   35:invokestatic    #181 <Method int View.generateViewId()>
	//   17   38:invokevirtual   #184 <Method void View.setId(int)>
		i.setVisibility(4);
	//   18   41:aload_0         
	//   19   42:getfield        #63  <Field View i>
	//   20   45:iconst_4        
	//   21   46:invokevirtual   #187 <Method void View.setVisibility(int)>
		j.addView(i, ((android.view.ViewGroup.LayoutParams) (new android.widget.FrameLayout.LayoutParams(getComputedIndicatorWidth(), f))));
	//   22   49:aload_0         
	//   23   50:getfield        #82  <Field FrameLayout j>
	//   24   53:aload_0         
	//   25   54:getfield        #63  <Field View i>
	//   26   57:new             #189 <Class android.widget.FrameLayout$LayoutParams>
	//   27   60:dup             
	//   28   61:aload_0         
	//   29   62:invokespecial   #192 <Method int getComputedIndicatorWidth()>
	//   30   65:aload_0         
	//   31   66:getfield        #68  <Field int f>
	//   32   69:invokespecial   #195 <Method void android.widget.FrameLayout$LayoutParams(int, int)>
	//   33   72:invokevirtual   #199 <Method void FrameLayout.addView(View, android.view.ViewGroup$LayoutParams)>
		g();
	//   34   75:aload_0         
	//   35   76:invokespecial   #149 <Method void g()>
		f();
	//   36   79:aload_0         
	//   37   80:invokespecial   #201 <Method void f()>
	//   38   83:return          
	}

	static int f(BatteryGaugeView batterygaugeview)
	{
		return batterygaugeview.e;
	//    0    0:aload_0         
	//    1    1:getfield        #60  <Field int e>
	//    2    4:ireturn         
	}

	private void f()
	{
		k.setTextSize(0, getResources().getDimension(0x7f070054));
	//    0    0:aload_0         
	//    1    1:getfield        #141 <Field CustomTextView k>
	//    2    4:iconst_0        
	//    3    5:aload_0         
	//    4    6:invokevirtual   #142 <Method Resources getResources()>
	//    5    9:ldc1            #203 <Int 0x7f070054>
	//    6   11:invokevirtual   #207 <Method float Resources.getDimension(int)>
	//    7   14:invokevirtual   #211 <Method void CustomTextView.setTextSize(int, float)>
		android.widget.LinearLayout.LayoutParams layoutparams = new android.widget.LinearLayout.LayoutParams(-2, -2);
	//    8   17:new             #213 <Class android.widget.LinearLayout$LayoutParams>
	//    9   20:dup             
	//   10   21:bipush          -2
	//   11   23:bipush          -2
	//   12   25:invokespecial   #214 <Method void android.widget.LinearLayout$LayoutParams(int, int)>
	//   13   28:astore_1        
		layoutparams.topMargin = getInsetMargin() * -1;
	//   14   29:aload_1         
	//   15   30:aload_0         
	//   16   31:invokespecial   #217 <Method int getInsetMargin()>
	//   17   34:iconst_m1       
	//   18   35:imul            
	//   19   36:putfield        #220 <Field int android.widget.LinearLayout$LayoutParams.topMargin>
		layoutparams.setMarginStart(getInsetMargin());
	//   20   39:aload_1         
	//   21   40:aload_0         
	//   22   41:invokespecial   #217 <Method int getInsetMargin()>
	//   23   44:invokevirtual   #223 <Method void android.widget.LinearLayout$LayoutParams.setMarginStart(int)>
		layoutparams.gravity = 1;
	//   24   47:aload_1         
	//   25   48:iconst_1        
	//   26   49:putfield        #226 <Field int android.widget.LinearLayout$LayoutParams.gravity>
		addView(((View) (k)), ((android.view.ViewGroup.LayoutParams) (layoutparams)));
	//   27   52:aload_0         
	//   28   53:aload_0         
	//   29   54:getfield        #141 <Field CustomTextView k>
	//   30   57:aload_1         
	//   31   58:invokevirtual   #227 <Method void addView(View, android.view.ViewGroup$LayoutParams)>
	//   32   61:return          
	}

	static Runnable g(BatteryGaugeView batterygaugeview)
	{
		return batterygaugeview.g;
	//    0    0:aload_0         
	//    1    1:getfield        #230 <Field Runnable g>
	//    2    4:areturn         
	}

	private void g()
	{
		android.widget.FrameLayout.LayoutParams layoutparams = (android.widget.FrameLayout.LayoutParams)i.getLayoutParams();
	//    0    0:aload_0         
	//    1    1:getfield        #63  <Field View i>
	//    2    4:invokevirtual   #234 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//    3    7:checkcast       #189 <Class android.widget.FrameLayout$LayoutParams>
	//    4   10:astore_1        
		layoutparams.width = getComputedIndicatorWidth();
	//    5   11:aload_1         
	//    6   12:aload_0         
	//    7   13:invokespecial   #192 <Method int getComputedIndicatorWidth()>
	//    8   16:putfield        #237 <Field int android.widget.FrameLayout$LayoutParams.width>
		layoutparams.height = getComputedIndicatorHeight();
	//    9   19:aload_1         
	//   10   20:aload_0         
	//   11   21:invokespecial   #240 <Method int getComputedIndicatorHeight()>
	//   12   24:putfield        #243 <Field int android.widget.FrameLayout$LayoutParams.height>
		layoutparams.gravity = 16;
	//   13   27:aload_1         
	//   14   28:bipush          16
	//   15   30:putfield        #244 <Field int android.widget.FrameLayout$LayoutParams.gravity>
		layoutparams.leftMargin = getInsetMargin();
	//   16   33:aload_1         
	//   17   34:aload_0         
	//   18   35:invokespecial   #217 <Method int getInsetMargin()>
	//   19   38:putfield        #247 <Field int android.widget.FrameLayout$LayoutParams.leftMargin>
		i.setLayoutParams(((android.view.ViewGroup.LayoutParams) (layoutparams)));
	//   20   41:aload_0         
	//   21   42:getfield        #63  <Field View i>
	//   22   45:aload_1         
	//   23   46:invokevirtual   #251 <Method void View.setLayoutParams(android.view.ViewGroup$LayoutParams)>
		i.setVisibility(0);
	//   24   49:aload_0         
	//   25   50:getfield        #63  <Field View i>
	//   26   53:iconst_0        
	//   27   54:invokevirtual   #187 <Method void View.setVisibility(int)>
	//   28   57:return          
	}

	private int getComputedIndicatorHeight()
	{
		return f - getInsetPadding() * 2 - getContext().getResources().getDimensionPixelOffset(0x7f07004f) * 2;
	//    0    0:aload_0         
	//    1    1:getfield        #68  <Field int f>
	//    2    4:aload_0         
	//    3    5:invokespecial   #254 <Method int getInsetPadding()>
	//    4    8:iconst_2        
	//    5    9:imul            
	//    6   10:isub            
	//    7   11:aload_0         
	//    8   12:invokevirtual   #123 <Method Context getContext()>
	//    9   15:invokevirtual   #129 <Method Resources Context.getResources()>
	//   10   18:ldc1            #255 <Int 0x7f07004f>
	//   11   20:invokevirtual   #258 <Method int Resources.getDimensionPixelOffset(int)>
	//   12   23:iconst_2        
	//   13   24:imul            
	//   14   25:isub            
	//   15   26:ireturn         
	}

	private int getComputedIndicatorWidth()
	{
		int i1 = e;
	//    0    0:aload_0         
	//    1    1:getfield        #60  <Field int e>
	//    2    4:istore_1        
		int j1 = getInsetMargin();
	//    3    5:aload_0         
	//    4    6:invokespecial   #217 <Method int getInsetMargin()>
	//    5    9:istore_2        
		return (int)((c / 100F) * (float)(i1 - j1 * 2));
	//    6   10:aload_0         
	//    7   11:getfield        #52  <Field float c>
	//    8   14:ldc2            #259 <Float 100F>
	//    9   17:fdiv            
	//   10   18:iload_1         
	//   11   19:iload_2         
	//   12   20:iconst_2        
	//   13   21:imul            
	//   14   22:isub            
	//   15   23:i2f             
	//   16   24:fmul            
	//   17   25:f2i             
	//   18   26:ireturn         
	}

	private int getInsetMargin()
	{
		return getContext().getResources().getDimensionPixelOffset(0x7f070053);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #123 <Method Context getContext()>
	//    2    4:invokevirtual   #129 <Method Resources Context.getResources()>
	//    3    7:ldc2            #260 <Int 0x7f070053>
	//    4   10:invokevirtual   #258 <Method int Resources.getDimensionPixelOffset(int)>
	//    5   13:ireturn         
	}

	private int getInsetPadding()
	{
		return getResources().getDimensionPixelSize(0x7f070051);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #142 <Method Resources getResources()>
	//    2    4:ldc2            #261 <Int 0x7f070051>
	//    3    7:invokevirtual   #264 <Method int Resources.getDimensionPixelSize(int)>
	//    4   10:ireturn         
	}

	private Drawable getStateSpecificFrameDrawable()
	{
		int i1;
		if(b == a.SIMPLE)
	//*   0    0:aload_0         
	//*   1    1:getfield        #49  <Field BatteryGaugeView$a b>
	//*   2    4:getstatic       #268 <Field BatteryGaugeView$a BatteryGaugeView$a.SIMPLE>
	//*   3    7:if_acmpne       28
		{
			i1 = 0x7f080126;
	//    4   10:ldc2            #269 <Int 0x7f080126>
	//    5   13:istore_1        
			if(d)
	//*   6   14:aload_0         
	//*   7   15:getfield        #271 <Field boolean d>
	//*   8   18:ifeq            43
				i1 = 0x7f080127;
	//    9   21:ldc2            #272 <Int 0x7f080127>
	//   10   24:istore_1        
		} else
	//*  11   25:goto            43
		{
			i1 = 0x7f080124;
	//   12   28:ldc2            #273 <Int 0x7f080124>
	//   13   31:istore_1        
			if(d)
	//*  14   32:aload_0         
	//*  15   33:getfield        #271 <Field boolean d>
	//*  16   36:ifeq            43
				i1 = 0x7f080125;
	//   17   39:ldc2            #274 <Int 0x7f080125>
	//   18   42:istore_1        
		}
		return android.support.v4.content.a.getDrawable(getContext(), i1);
	//   19   43:aload_0         
	//   20   44:invokevirtual   #123 <Method Context getContext()>
	//   21   47:iload_1         
	//   22   48:invokestatic    #173 <Method Drawable a.getDrawable(Context, int)>
	//   23   51:areturn         
	}

	public void a(float f1, boolean flag)
	{
		if(c == f1 && d == flag)
	//*   0    0:aload_0         
	//*   1    1:getfield        #52  <Field float c>
	//*   2    4:fload_1         
	//*   3    5:fcmpl           
	//*   4    6:ifne            30
	//*   5    9:aload_0         
	//*   6   10:getfield        #271 <Field boolean d>
	//*   7   13:iload_2         
	//*   8   14:icmpne          30
		{
			j.setVisibility(0);
	//    9   17:aload_0         
	//   10   18:getfield        #82  <Field FrameLayout j>
	//   11   21:iconst_0        
	//   12   22:invokevirtual   #276 <Method void FrameLayout.setVisibility(int)>
			invalidate();
	//   13   25:aload_0         
	//   14   26:invokevirtual   #279 <Method void invalidate()>
			return;
	//   15   29:return          
		}
		boolean flag1;
		if(d == flag && e != 0)
	//*  16   30:aload_0         
	//*  17   31:getfield        #271 <Field boolean d>
	//*  18   34:iload_2         
	//*  19   35:icmpne          54
	//*  20   38:aload_0         
	//*  21   39:getfield        #60  <Field int e>
	//*  22   42:ifne            48
	//*  23   45:goto            54
			flag1 = false;
	//   24   48:iconst_0        
	//   25   49:istore          4
		else
	//*  26   51:goto            57
			flag1 = true;
	//   27   54:iconst_1        
	//   28   55:istore          4
		float f2 = 100F;
	//   29   57:ldc2            #259 <Float 100F>
	//   30   60:fstore_3        
		if(f1 > 100F)
	//*  31   61:fload_1         
	//*  32   62:ldc2            #259 <Float 100F>
	//*  33   65:fcmpl           
	//*  34   66:ifle            143
		{
			Object obj = ((Object) (new StringBuilder()));
	//   35   69:new             #281 <Class StringBuilder>
	//   36   72:dup             
	//   37   73:invokespecial   #283 <Method void StringBuilder()>
	//   38   76:astore          5
			((StringBuilder) (obj)).append("Battery level reported at: ");
	//   39   78:aload           5
	//   40   80:ldc2            #285 <String "Battery level reported at: ">
	//   41   83:invokevirtual   #289 <Method StringBuilder StringBuilder.append(String)>
	//   42   86:pop             
			((StringBuilder) (obj)).append(f1);
	//   43   87:aload           5
	//   44   89:fload_1         
	//   45   90:invokevirtual   #292 <Method StringBuilder StringBuilder.append(float)>
	//   46   93:pop             
			((StringBuilder) (obj)).append("%. It should not exceed ");
	//   47   94:aload           5
	//   48   96:ldc2            #294 <String "%. It should not exceed ">
	//   49   99:invokevirtual   #289 <Method StringBuilder StringBuilder.append(String)>
	//   50  102:pop             
			((StringBuilder) (obj)).append(100F);
	//   51  103:aload           5
	//   52  105:ldc2            #259 <Float 100F>
	//   53  108:invokevirtual   #292 <Method StringBuilder StringBuilder.append(float)>
	//   54  111:pop             
			((StringBuilder) (obj)).append(" percent.");
	//   55  112:aload           5
	//   56  114:ldc2            #296 <String " percent.">
	//   57  117:invokevirtual   #289 <Method StringBuilder StringBuilder.append(String)>
	//   58  120:pop             
			obj = ((Object) (((StringBuilder) (obj)).toString()));
	//   59  121:aload           5
	//   60  123:invokevirtual   #299 <Method String StringBuilder.toString()>
	//   61  126:astore          5
			o.e(a, ((String) (obj)));
	//   62  128:getstatic       #66  <Field String a>
	//   63  131:aload           5
	//   64  133:invokestatic    #304 <Method void o.e(String, String)>
			com.irobot.home.util.j.a(6, ((String) (obj)));
	//   65  136:bipush          6
	//   66  138:aload           5
	//   67  140:invokestatic    #309 <Method void j.a(int, String)>
		}
		if(f1 < 100F)
	//*  68  143:fload_1         
	//*  69  144:ldc2            #259 <Float 100F>
	//*  70  147:fcmpg           
	//*  71  148:ifge            153
			f2 = f1;
	//   72  151:fload_1         
	//   73  152:fstore_3        
		c = f2;
	//   74  153:aload_0         
	//   75  154:fload_3         
	//   76  155:putfield        #52  <Field float c>
		d = flag;
	//   77  158:aload_0         
	//   78  159:iload_2         
	//   79  160:putfield        #271 <Field boolean d>
		k.setText(((CharSequence) (String.format("%d%%", new Object[] {
			Integer.valueOf((int)f1)
		}))));
	//   80  163:aload_0         
	//   81  164:getfield        #141 <Field CustomTextView k>
	//   82  167:ldc2            #311 <String "%d%%">
	//   83  170:iconst_1        
	//   84  171:anewarray       Object[]
	//   85  174:dup             
	//   86  175:iconst_0        
	//   87  176:fload_1         
	//   88  177:f2i             
	//   89  178:invokestatic    #319 <Method Integer Integer.valueOf(int)>
	//   90  181:aastore         
	//   91  182:invokestatic    #325 <Method String String.format(String, Object[])>
	//   92  185:invokevirtual   #329 <Method void CustomTextView.setText(CharSequence)>
		h.setBackground(getStateSpecificFrameDrawable());
	//   93  188:aload_0         
	//   94  189:getfield        #91  <Field ImageView h>
	//   95  192:aload_0         
	//   96  193:invokespecial   #331 <Method Drawable getStateSpecificFrameDrawable()>
	//   97  196:invokevirtual   #332 <Method void ImageView.setBackground(Drawable)>
		if(flag1)
	//*  98  199:iload           4
	//*  99  201:ifeq            208
			d();
	//  100  204:aload_0         
	//  101  205:invokespecial   #334 <Method void d()>
		post(g);
	//  102  208:aload_0         
	//  103  209:aload_0         
	//  104  210:getfield        #230 <Field Runnable g>
	//  105  213:invokevirtual   #338 <Method boolean post(Runnable)>
	//  106  216:pop             
	//  107  217:return          
	}

	protected void a(Context context, AttributeSet attributeset, int i1)
	{
		g = new Runnable() {

			public void run()
			{
				if(com.irobot.home.view.BatteryGaugeView.a(a) == null)
			//*   0    0:aload_0         
			//*   1    1:getfield        #16  <Field BatteryGaugeView a>
			//*   2    4:invokestatic    #24  <Method View com.irobot.home.view.BatteryGaugeView.a(BatteryGaugeView)>
			//*   3    7:ifnonnull       17
					BatteryGaugeView.b(a);
			//    4   10:aload_0         
			//    5   11:getfield        #16  <Field BatteryGaugeView a>
			//    6   14:invokestatic    #27  <Method void BatteryGaugeView.b(BatteryGaugeView)>
				BatteryGaugeView.c(a);
			//    7   17:aload_0         
			//    8   18:getfield        #16  <Field BatteryGaugeView a>
			//    9   21:invokestatic    #30  <Method void BatteryGaugeView.c(BatteryGaugeView)>
				BatteryGaugeView.d(a);
			//   10   24:aload_0         
			//   11   25:getfield        #16  <Field BatteryGaugeView a>
			//   12   28:invokestatic    #33  <Method void BatteryGaugeView.d(BatteryGaugeView)>
				a.requestLayout();
			//   13   31:aload_0         
			//   14   32:getfield        #16  <Field BatteryGaugeView a>
			//   15   35:invokevirtual   #36  <Method void BatteryGaugeView.requestLayout()>
				a.invalidate();
			//   16   38:aload_0         
			//   17   39:getfield        #16  <Field BatteryGaugeView a>
			//   18   42:invokevirtual   #39  <Method void BatteryGaugeView.invalidate()>
			//   19   45:return          
			}

			final BatteryGaugeView a;

			
			{
				a = BatteryGaugeView.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field BatteryGaugeView a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
		}
;
	//    0    0:aload_0         
	//    1    1:new             #6   <Class BatteryGaugeView$1>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:invokespecial   #339 <Method void BatteryGaugeView$1(BatteryGaugeView)>
	//    5    9:putfield        #230 <Field Runnable g>
		k = new CustomTextView(context, attributeset);
	//    6   12:aload_0         
	//    7   13:new             #144 <Class CustomTextView>
	//    8   16:dup             
	//    9   17:aload_1         
	//   10   18:aload_2         
	//   11   19:invokespecial   #341 <Method void CustomTextView(Context, AttributeSet)>
	//   12   22:putfield        #141 <Field CustomTextView k>
		k.setVisibility(8);
	//   13   25:aload_0         
	//   14   26:getfield        #141 <Field CustomTextView k>
	//   15   29:bipush          8
	//   16   31:invokevirtual   #342 <Method void CustomTextView.setVisibility(int)>
		h = new ImageView(context, attributeset, i1);
	//   17   34:aload_0         
	//   18   35:new             #93  <Class ImageView>
	//   19   38:dup             
	//   20   39:aload_1         
	//   21   40:aload_2         
	//   22   41:iload_3         
	//   23   42:invokespecial   #343 <Method void ImageView(Context, AttributeSet, int)>
	//   24   45:putfield        #91  <Field ImageView h>
		h.setId(View.generateViewId());
	//   25   48:aload_0         
	//   26   49:getfield        #91  <Field ImageView h>
	//   27   52:invokestatic    #181 <Method int View.generateViewId()>
	//   28   55:invokevirtual   #344 <Method void ImageView.setId(int)>
		h.setAdjustViewBounds(true);
	//   29   58:aload_0         
	//   30   59:getfield        #91  <Field ImageView h>
	//   31   62:iconst_1        
	//   32   63:invokevirtual   #348 <Method void ImageView.setAdjustViewBounds(boolean)>
		attributeset = ((AttributeSet) (new android.widget.LinearLayout.LayoutParams(-2, -2)));
	//   33   66:new             #213 <Class android.widget.LinearLayout$LayoutParams>
	//   34   69:dup             
	//   35   70:bipush          -2
	//   36   72:bipush          -2
	//   37   74:invokespecial   #214 <Method void android.widget.LinearLayout$LayoutParams(int, int)>
	//   38   77:astore_2        
		j = new FrameLayout(context);
	//   39   78:aload_0         
	//   40   79:new             #85  <Class FrameLayout>
	//   41   82:dup             
	//   42   83:aload_1         
	//   43   84:invokespecial   #349 <Method void FrameLayout(Context)>
	//   44   87:putfield        #82  <Field FrameLayout j>
		j.setId(View.generateViewId());
	//   45   90:aload_0         
	//   46   91:getfield        #82  <Field FrameLayout j>
	//   47   94:invokestatic    #181 <Method int View.generateViewId()>
	//   48   97:invokevirtual   #350 <Method void FrameLayout.setId(int)>
		j.addView(((View) (h)), ((android.view.ViewGroup.LayoutParams) (attributeset)));
	//   49  100:aload_0         
	//   50  101:getfield        #82  <Field FrameLayout j>
	//   51  104:aload_0         
	//   52  105:getfield        #91  <Field ImageView h>
	//   53  108:aload_2         
	//   54  109:invokevirtual   #199 <Method void FrameLayout.addView(View, android.view.ViewGroup$LayoutParams)>
		context = ((Context) (new android.widget.FrameLayout.LayoutParams(-2, -2)));
	//   55  112:new             #189 <Class android.widget.FrameLayout$LayoutParams>
	//   56  115:dup             
	//   57  116:bipush          -2
	//   58  118:bipush          -2
	//   59  120:invokespecial   #195 <Method void android.widget.FrameLayout$LayoutParams(int, int)>
	//   60  123:astore_1        
		context.gravity = 1;
	//   61  124:aload_1         
	//   62  125:iconst_1        
	//   63  126:putfield        #244 <Field int android.widget.FrameLayout$LayoutParams.gravity>
		addView(((View) (j)), ((android.view.ViewGroup.LayoutParams) (context)));
	//   64  129:aload_0         
	//   65  130:aload_0         
	//   66  131:getfield        #82  <Field FrameLayout j>
	//   67  134:aload_1         
	//   68  135:invokevirtual   #227 <Method void addView(View, android.view.ViewGroup$LayoutParams)>
		b();
	//   69  138:aload_0         
	//   70  139:invokespecial   #352 <Method void b()>
	//   71  142:return          
	}

	public void a(a a1)
	{
		if(b != a1)
	//*   0    0:aload_0         
	//*   1    1:getfield        #49  <Field BatteryGaugeView$a b>
	//*   2    4:aload_1         
	//*   3    5:if_acmpeq       22
		{
			b = a1;
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:putfield        #49  <Field BatteryGaugeView$a b>
			post(g);
	//    7   13:aload_0         
	//    8   14:aload_0         
	//    9   15:getfield        #230 <Field Runnable g>
	//   10   18:invokevirtual   #338 <Method boolean post(Runnable)>
	//   11   21:pop             
		}
	//   12   22:return          
	}

	public void setBatteryLevelLowThreshold(float f1)
	{
		l = f1;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:putfield        #55  <Field float l>
	//    3    5:return          
	}

	private static final String a = "BatteryGaugeView";
	private a b;
	private float c;
	private boolean d;
	private int e;
	private int f;
	private Runnable g;
	private ImageView h;
	private View i;
	private FrameLayout j;
	private CustomTextView k;
	private float l;

	static 
	{
	//    0    0:return          
	}
}

// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.support.v4.view.ViewPager;
import android.support.v4.view.p;
import android.support.v4.view.q;
import android.support.v4.view.s;
import android.support.v4.widget.m;
import android.support.v7.widget.ax;
import android.text.Layout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package android.support.design.widget:
//			n, TabItem, a

public class TabLayout extends HorizontalScrollView
{
	private class a
		implements android.support.v4.view.ViewPager.d
	{

		public void a(ViewPager viewpager, p p1, p p2)
		{
			if(a.m == viewpager)
		//*   0    0:aload_0         
		//*   1    1:getfield        #16  <Field TabLayout a>
		//*   2    4:getfield        #25  <Field ViewPager android.support.design.widget.TabLayout.m>
		//*   3    7:aload_1         
		//*   4    8:if_acmpne       23
				a.a(p2, b);
		//    5   11:aload_0         
		//    6   12:getfield        #16  <Field TabLayout a>
		//    7   15:aload_3         
		//    8   16:aload_0         
		//    9   17:getfield        #27  <Field boolean b>
		//   10   20:invokevirtual   #30  <Method void TabLayout.a(p, boolean)>
		//   11   23:return          
		}

		void a(boolean flag)
		{
			b = flag;
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:putfield        #27  <Field boolean b>
		//    3    5:return          
		}

		final TabLayout a;
		private boolean b;

		a()
		{
			a = TabLayout.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #16  <Field TabLayout a>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #19  <Method void Object()>
		//    5    9:return          
		}
	}

	public static interface b
	{

		public abstract void a(e e1);

		public abstract void b(e e1);

		public abstract void c(e e1);
	}

	private class c extends DataSetObserver
	{

		public void onChanged()
		{
			a.c();
		//    0    0:aload_0         
		//    1    1:getfield        #13  <Field TabLayout a>
		//    2    4:invokevirtual   #20  <Method void TabLayout.c()>
		//    3    7:return          
		}

		public void onInvalidated()
		{
			a.c();
		//    0    0:aload_0         
		//    1    1:getfield        #13  <Field TabLayout a>
		//    2    4:invokevirtual   #20  <Method void TabLayout.c()>
		//    3    7:return          
		}

		final TabLayout a;

		c()
		{
			a = TabLayout.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #13  <Field TabLayout a>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #16  <Method void DataSetObserver()>
		//    5    9:return          
		}
	}

	private class d extends LinearLayout
	{

		private void c()
		{
			View view = getChildAt(a);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #33  <Field int a>
		//    3    5:invokevirtual   #55  <Method View getChildAt(int)>
		//    4    8:astore          5
			int i1;
			int j1;
			if(view != null && view.getWidth() > 0)
		//*   5   10:aload           5
		//*   6   12:ifnull          130
		//*   7   15:aload           5
		//*   8   17:invokevirtual   #61  <Method int View.getWidth()>
		//*   9   20:ifle            130
			{
				int l1 = view.getLeft();
		//   10   23:aload           5
		//   11   25:invokevirtual   #64  <Method int View.getLeft()>
		//   12   28:istore          4
				int k1 = view.getRight();
		//   13   30:aload           5
		//   14   32:invokevirtual   #67  <Method int View.getRight()>
		//   15   35:istore_3        
				i1 = k1;
		//   16   36:iload_3         
		//   17   37:istore_1        
				j1 = l1;
		//   18   38:iload           4
		//   19   40:istore_2        
				if(b > 0.0F)
		//*  20   41:aload_0         
		//*  21   42:getfield        #69  <Field float b>
		//*  22   45:fconst_0        
		//*  23   46:fcmpl           
		//*  24   47:ifle            134
				{
					i1 = k1;
		//   25   50:iload_3         
		//   26   51:istore_1        
					j1 = l1;
		//   27   52:iload           4
		//   28   54:istore_2        
					if(a < getChildCount() - 1)
		//*  29   55:aload_0         
		//*  30   56:getfield        #33  <Field int a>
		//*  31   59:aload_0         
		//*  32   60:invokevirtual   #72  <Method int getChildCount()>
		//*  33   63:iconst_1        
		//*  34   64:isub            
		//*  35   65:icmpge          134
					{
						View view1 = getChildAt(a + 1);
		//   36   68:aload_0         
		//   37   69:aload_0         
		//   38   70:getfield        #33  <Field int a>
		//   39   73:iconst_1        
		//   40   74:iadd            
		//   41   75:invokevirtual   #55  <Method View getChildAt(int)>
		//   42   78:astore          5
						j1 = (int)(b * (float)view1.getLeft() + (1.0F - b) * (float)l1);
		//   43   80:aload_0         
		//   44   81:getfield        #69  <Field float b>
		//   45   84:aload           5
		//   46   86:invokevirtual   #64  <Method int View.getLeft()>
		//   47   89:i2f             
		//   48   90:fmul            
		//   49   91:fconst_1        
		//   50   92:aload_0         
		//   51   93:getfield        #69  <Field float b>
		//   52   96:fsub            
		//   53   97:iload           4
		//   54   99:i2f             
		//   55  100:fmul            
		//   56  101:fadd            
		//   57  102:f2i             
		//   58  103:istore_2        
						i1 = (int)(b * (float)view1.getRight() + (1.0F - b) * (float)k1);
		//   59  104:aload_0         
		//   60  105:getfield        #69  <Field float b>
		//   61  108:aload           5
		//   62  110:invokevirtual   #67  <Method int View.getRight()>
		//   63  113:i2f             
		//   64  114:fmul            
		//   65  115:fconst_1        
		//   66  116:aload_0         
		//   67  117:getfield        #69  <Field float b>
		//   68  120:fsub            
		//   69  121:iload_3         
		//   70  122:i2f             
		//   71  123:fmul            
		//   72  124:fadd            
		//   73  125:f2i             
		//   74  126:istore_1        
					}
				}
			} else
		//*  75  127:goto            134
			{
				j1 = -1;
		//   76  130:iconst_m1       
		//   77  131:istore_2        
				i1 = -1;
		//   78  132:iconst_m1       
		//   79  133:istore_1        
			}
			a(j1, i1);
		//   80  134:aload_0         
		//   81  135:iload_2         
		//   82  136:iload_1         
		//   83  137:invokevirtual   #75  <Method void a(int, int)>
		//   84  140:return          
		}

		void a(int i1)
		{
			if(e.getColor() != i1)
		//*   0    0:aload_0         
		//*   1    1:getfield        #50  <Field Paint e>
		//*   2    4:invokevirtual   #79  <Method int Paint.getColor()>
		//*   3    7:iload_1         
		//*   4    8:icmpeq          23
			{
				e.setColor(i1);
		//    5   11:aload_0         
		//    6   12:getfield        #50  <Field Paint e>
		//    7   15:iload_1         
		//    8   16:invokevirtual   #82  <Method void Paint.setColor(int)>
				android.support.v4.view.s.c(((View) (this)));
		//    9   19:aload_0         
		//   10   20:invokestatic    #87  <Method void s.c(View)>
			}
		//   11   23:return          
		}

		void a(int i1, float f1)
		{
			if(i != null && i.isRunning())
		//*   0    0:aload_0         
		//*   1    1:getfield        #90  <Field ValueAnimator i>
		//*   2    4:ifnull          24
		//*   3    7:aload_0         
		//*   4    8:getfield        #90  <Field ValueAnimator i>
		//*   5   11:invokevirtual   #96  <Method boolean ValueAnimator.isRunning()>
		//*   6   14:ifeq            24
				i.cancel();
		//    7   17:aload_0         
		//    8   18:getfield        #90  <Field ValueAnimator i>
		//    9   21:invokevirtual   #99  <Method void ValueAnimator.cancel()>
			a = i1;
		//   10   24:aload_0         
		//   11   25:iload_1         
		//   12   26:putfield        #33  <Field int a>
			b = f1;
		//   13   29:aload_0         
		//   14   30:fload_2         
		//   15   31:putfield        #69  <Field float b>
			c();
		//   16   34:aload_0         
		//   17   35:invokespecial   #101 <Method void c()>
		//   18   38:return          
		}

		void a(int i1, int j1)
		{
			if(i1 != g || j1 != h)
		//*   0    0:iload_1         
		//*   1    1:aload_0         
		//*   2    2:getfield        #37  <Field int g>
		//*   3    5:icmpne          16
		//*   4    8:iload_2         
		//*   5    9:aload_0         
		//*   6   10:getfield        #39  <Field int h>
		//*   7   13:icmpeq          30
			{
				g = i1;
		//    8   16:aload_0         
		//    9   17:iload_1         
		//   10   18:putfield        #37  <Field int g>
				h = j1;
		//   11   21:aload_0         
		//   12   22:iload_2         
		//   13   23:putfield        #39  <Field int h>
				android.support.v4.view.s.c(((View) (this)));
		//   14   26:aload_0         
		//   15   27:invokestatic    #87  <Method void s.c(View)>
			}
		//   16   30:return          
		}

		boolean a()
		{
			int j1 = getChildCount();
		//    0    0:aload_0         
		//    1    1:invokevirtual   #72  <Method int getChildCount()>
		//    2    4:istore_2        
			for(int i1 = 0; i1 < j1; i1++)
		//*   3    5:iconst_0        
		//*   4    6:istore_1        
		//*   5    7:iload_1         
		//*   6    8:iload_2         
		//*   7    9:icmpge          32
				if(getChildAt(i1).getWidth() <= 0)
		//*   8   12:aload_0         
		//*   9   13:iload_1         
		//*  10   14:invokevirtual   #55  <Method View getChildAt(int)>
		//*  11   17:invokevirtual   #61  <Method int View.getWidth()>
		//*  12   20:ifgt            25
					return true;
		//   13   23:iconst_1        
		//   14   24:ireturn         

		//   15   25:iload_1         
		//   16   26:iconst_1        
		//   17   27:iadd            
		//   18   28:istore_1        
		//*  19   29:goto            7
			return false;
		//   20   32:iconst_0        
		//   21   33:ireturn         
		}

		float b()
		{
			return (float)a + b;
		//    0    0:aload_0         
		//    1    1:getfield        #33  <Field int a>
		//    2    4:i2f             
		//    3    5:aload_0         
		//    4    6:getfield        #69  <Field float b>
		//    5    9:fadd            
		//    6   10:freturn         
		}

		void b(int i1)
		{
			if(d != i1)
		//*   0    0:aload_0         
		//*   1    1:getfield        #104 <Field int d>
		//*   2    4:iload_1         
		//*   3    5:icmpeq          17
			{
				d = i1;
		//    4    8:aload_0         
		//    5    9:iload_1         
		//    6   10:putfield        #104 <Field int d>
				android.support.v4.view.s.c(((View) (this)));
		//    7   13:aload_0         
		//    8   14:invokestatic    #87  <Method void s.c(View)>
			}
		//    9   17:return          
		}

		void b(int i1, int j1)
		{
			if(i != null && i.isRunning())
		//*   0    0:aload_0         
		//*   1    1:getfield        #90  <Field ValueAnimator i>
		//*   2    4:ifnull          24
		//*   3    7:aload_0         
		//*   4    8:getfield        #90  <Field ValueAnimator i>
		//*   5   11:invokevirtual   #96  <Method boolean ValueAnimator.isRunning()>
		//*   6   14:ifeq            24
				i.cancel();
		//    7   17:aload_0         
		//    8   18:getfield        #90  <Field ValueAnimator i>
		//    9   21:invokevirtual   #99  <Method void ValueAnimator.cancel()>
			int k1;
			if(android.support.v4.view.s.e(((View) (this))) == 1)
		//*  10   24:aload_0         
		//*  11   25:invokestatic    #107 <Method int s.e(View)>
		//*  12   28:iconst_1        
		//*  13   29:icmpne          37
				k1 = 1;
		//   14   32:iconst_1        
		//   15   33:istore_3        
			else
		//*  16   34:goto            39
				k1 = 0;
		//   17   37:iconst_0        
		//   18   38:istore_3        
			View view = getChildAt(i1);
		//   19   39:aload_0         
		//   20   40:iload_1         
		//   21   41:invokevirtual   #55  <Method View getChildAt(int)>
		//   22   44:astore          7
			if(view == null)
		//*  23   46:aload           7
		//*  24   48:ifnonnull       56
			{
				c();
		//   25   51:aload_0         
		//   26   52:invokespecial   #101 <Method void c()>
				return;
		//   27   55:return          
			}
			int i2 = view.getLeft();
		//   28   56:aload           7
		//   29   58:invokevirtual   #64  <Method int View.getLeft()>
		//   30   61:istore          5
			int j2 = view.getRight();
		//   31   63:aload           7
		//   32   65:invokevirtual   #67  <Method int View.getRight()>
		//   33   68:istore          6
			int l1;
			if(Math.abs(i1 - a) <= 1)
		//*  34   70:iload_1         
		//*  35   71:aload_0         
		//*  36   72:getfield        #33  <Field int a>
		//*  37   75:isub            
		//*  38   76:invokestatic    #113 <Method int Math.abs(int)>
		//*  39   79:iconst_1        
		//*  40   80:icmpgt          97
			{
				k1 = g;
		//   41   83:aload_0         
		//   42   84:getfield        #37  <Field int g>
		//   43   87:istore_3        
				l1 = h;
		//   44   88:aload_0         
		//   45   89:getfield        #39  <Field int h>
		//   46   92:istore          4
			} else
		//*  47   94:goto            148
			{
				l1 = c.b(24);
		//   48   97:aload_0         
		//   49   98:getfield        #28  <Field TabLayout c>
		//   50  101:bipush          24
		//   51  103:invokevirtual   #115 <Method int TabLayout.b(int)>
		//   52  106:istore          4
				if(i1 >= a ? k1 == 0 : k1 != 0)
		//*  53  108:iload_1         
		//*  54  109:aload_0         
		//*  55  110:getfield        #33  <Field int a>
		//*  56  113:icmpge          141
		//*  57  116:iload_3         
		//*  58  117:ifeq            132
					k1 = i2 - l1;
		//   59  120:iload           5
		//   60  122:iload           4
		//   61  124:isub            
		//   62  125:istore_3        
				else
		//*  63  126:iload_3         
		//*  64  127:istore          4
		//*  65  129:goto            148
					k1 = l1 + j2;
		//   66  132:iload           4
		//   67  134:iload           6
		//   68  136:iadd            
		//   69  137:istore_3        
		//   70  138:goto            126
		//   71  141:iload_3         
		//   72  142:ifeq            120
				l1 = k1;
			}
		//*  73  145:goto            132
			if(k1 != i2 || l1 != j2)
		//*  74  148:iload_3         
		//*  75  149:iload           5
		//*  76  151:icmpne          161
		//*  77  154:iload           4
		//*  78  156:iload           6
		//*  79  158:icmpeq          247
			{
				ValueAnimator valueanimator = new ValueAnimator();
		//   80  161:new             #92  <Class ValueAnimator>
		//   81  164:dup             
		//   82  165:invokespecial   #116 <Method void ValueAnimator()>
		//   83  168:astore          7
				i = valueanimator;
		//   84  170:aload_0         
		//   85  171:aload           7
		//   86  173:putfield        #90  <Field ValueAnimator i>
				valueanimator.setInterpolator(((android.animation.TimeInterpolator) (android.support.design.widget.a.b)));
		//   87  176:aload           7
		//   88  178:getstatic       #121 <Field android.view.animation.Interpolator a.b>
		//   89  181:invokevirtual   #125 <Method void ValueAnimator.setInterpolator(android.animation.TimeInterpolator)>
				valueanimator.setDuration(j1);
		//   90  184:aload           7
		//   91  186:iload_2         
		//   92  187:i2l             
		//   93  188:invokevirtual   #129 <Method ValueAnimator ValueAnimator.setDuration(long)>
		//   94  191:pop             
				valueanimator.setFloatValues(new float[] {
					0.0F, 1.0F
				});
		//   95  192:aload           7
		//   96  194:iconst_2        
		//   97  195:newarray        float[]
		//   98  197:dup             
		//   99  198:iconst_0        
		//  100  199:fconst_0        
		//  101  200:fastore         
		//  102  201:dup             
		//  103  202:iconst_1        
		//  104  203:fconst_1        
		//  105  204:fastore         
		//  106  205:invokevirtual   #133 <Method void ValueAnimator.setFloatValues(float[])>
				valueanimator.addUpdateListener(new android.animation.ValueAnimator.AnimatorUpdateListener(this, k1, i2, l1, j2) {

					public void onAnimationUpdate(ValueAnimator valueanimator)
					{
						float f1 = valueanimator.getAnimatedFraction();
					//    0    0:aload_1         
					//    1    1:invokevirtual   #43  <Method float ValueAnimator.getAnimatedFraction()>
					//    2    4:fstore_2        
						e.a(android.support.design.widget.a.a(a, b, f1), android.support.design.widget.a.a(c, d, f1));
					//    3    5:aload_0         
					//    4    6:getfield        #23  <Field TabLayout$d e>
					//    5    9:aload_0         
					//    6   10:getfield        #25  <Field int a>
					//    7   13:aload_0         
					//    8   14:getfield        #27  <Field int b>
					//    9   17:fload_2         
					//   10   18:invokestatic    #48  <Method int a.a(int, int, float)>
					//   11   21:aload_0         
					//   12   22:getfield        #29  <Field int c>
					//   13   25:aload_0         
					//   14   26:getfield        #31  <Field int d>
					//   15   29:fload_2         
					//   16   30:invokestatic    #48  <Method int a.a(int, int, float)>
					//   17   33:invokevirtual   #50  <Method void TabLayout$d.a(int, int)>
					//   18   36:return          
					}

					final int a;
					final int b;
					final int c;
					final int d;
					final d e;

			
			{
				e = d1;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #23  <Field TabLayout$d e>
				a = i1;
			//    3    5:aload_0         
			//    4    6:iload_2         
			//    5    7:putfield        #25  <Field int a>
				b = j1;
			//    6   10:aload_0         
			//    7   11:iload_3         
			//    8   12:putfield        #27  <Field int b>
				c = k1;
			//    9   15:aload_0         
			//   10   16:iload           4
			//   11   18:putfield        #29  <Field int c>
				d = l1;
			//   12   21:aload_0         
			//   13   22:iload           5
			//   14   24:putfield        #31  <Field int d>
				super();
			//   15   27:aload_0         
			//   16   28:invokespecial   #34  <Method void Object()>
			//   17   31:return          
			}
				}
);
		//  107  208:aload           7
		//  108  210:new             #9   <Class TabLayout$d$1>
		//  109  213:dup             
		//  110  214:aload_0         
		//  111  215:iload_3         
		//  112  216:iload           5
		//  113  218:iload           4
		//  114  220:iload           6
		//  115  222:invokespecial   #136 <Method void TabLayout$d$1(TabLayout$d, int, int, int, int)>
		//  116  225:invokevirtual   #140 <Method void ValueAnimator.addUpdateListener(android.animation.ValueAnimator$AnimatorUpdateListener)>
				valueanimator.addListener(((android.animation.Animator.AnimatorListener) (new AnimatorListenerAdapter(this, i1) {

					public void onAnimationEnd(Animator animator)
					{
						b.a = a;
					//    0    0:aload_0         
					//    1    1:getfield        #19  <Field TabLayout$d b>
					//    2    4:aload_0         
					//    3    5:getfield        #21  <Field int a>
					//    4    8:putfield        #28  <Field int TabLayout$d.a>
						b.b = 0.0F;
					//    5   11:aload_0         
					//    6   12:getfield        #19  <Field TabLayout$d b>
					//    7   15:fconst_0        
					//    8   16:putfield        #31  <Field float TabLayout$d.b>
					//    9   19:return          
					}

					final int a;
					final d b;

			
			{
				b = d1;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field TabLayout$d b>
				a = i1;
			//    3    5:aload_0         
			//    4    6:iload_2         
			//    5    7:putfield        #21  <Field int a>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #24  <Method void AnimatorListenerAdapter()>
			//    8   14:return          
			}
				}
)));
		//  117  228:aload           7
		//  118  230:new             #11  <Class TabLayout$d$2>
		//  119  233:dup             
		//  120  234:aload_0         
		//  121  235:iload_1         
		//  122  236:invokespecial   #143 <Method void TabLayout$d$2(TabLayout$d, int)>
		//  123  239:invokevirtual   #147 <Method void ValueAnimator.addListener(android.animation.Animator$AnimatorListener)>
				valueanimator.start();
		//  124  242:aload           7
		//  125  244:invokevirtual   #150 <Method void ValueAnimator.start()>
			}
		//  126  247:return          
		}

		public void draw(Canvas canvas)
		{
			super.draw(canvas);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #154 <Method void LinearLayout.draw(Canvas)>
			if(g >= 0 && h > g)
		//*   3    5:aload_0         
		//*   4    6:getfield        #37  <Field int g>
		//*   5    9:iflt            56
		//*   6   12:aload_0         
		//*   7   13:getfield        #39  <Field int h>
		//*   8   16:aload_0         
		//*   9   17:getfield        #37  <Field int g>
		//*  10   20:icmple          56
				canvas.drawRect(g, getHeight() - d, h, getHeight(), e);
		//   11   23:aload_1         
		//   12   24:aload_0         
		//   13   25:getfield        #37  <Field int g>
		//   14   28:i2f             
		//   15   29:aload_0         
		//   16   30:invokevirtual   #157 <Method int getHeight()>
		//   17   33:aload_0         
		//   18   34:getfield        #104 <Field int d>
		//   19   37:isub            
		//   20   38:i2f             
		//   21   39:aload_0         
		//   22   40:getfield        #39  <Field int h>
		//   23   43:i2f             
		//   24   44:aload_0         
		//   25   45:invokevirtual   #157 <Method int getHeight()>
		//   26   48:i2f             
		//   27   49:aload_0         
		//   28   50:getfield        #50  <Field Paint e>
		//   29   53:invokevirtual   #163 <Method void Canvas.drawRect(float, float, float, float, Paint)>
		//   30   56:return          
		}

		protected void onLayout(boolean flag, int i1, int j1, int k1, int l1)
		{
			super.onLayout(flag, i1, j1, k1, l1);
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:iload_2         
		//    3    3:iload_3         
		//    4    4:iload           4
		//    5    6:iload           5
		//    6    8:invokespecial   #167 <Method void LinearLayout.onLayout(boolean, int, int, int, int)>
			if(i != null && i.isRunning())
		//*   7   11:aload_0         
		//*   8   12:getfield        #90  <Field ValueAnimator i>
		//*   9   15:ifnull          69
		//*  10   18:aload_0         
		//*  11   19:getfield        #90  <Field ValueAnimator i>
		//*  12   22:invokevirtual   #96  <Method boolean ValueAnimator.isRunning()>
		//*  13   25:ifeq            69
			{
				i.cancel();
		//   14   28:aload_0         
		//   15   29:getfield        #90  <Field ValueAnimator i>
		//   16   32:invokevirtual   #99  <Method void ValueAnimator.cancel()>
				long l2 = i.getDuration();
		//   17   35:aload_0         
		//   18   36:getfield        #90  <Field ValueAnimator i>
		//   19   39:invokevirtual   #171 <Method long ValueAnimator.getDuration()>
		//   20   42:lstore          6
				b(a, Math.round((1.0F - i.getAnimatedFraction()) * (float)l2));
		//   21   44:aload_0         
		//   22   45:aload_0         
		//   23   46:getfield        #33  <Field int a>
		//   24   49:fconst_1        
		//   25   50:aload_0         
		//   26   51:getfield        #90  <Field ValueAnimator i>
		//   27   54:invokevirtual   #174 <Method float ValueAnimator.getAnimatedFraction()>
		//   28   57:fsub            
		//   29   58:lload           6
		//   30   60:l2f             
		//   31   61:fmul            
		//   32   62:invokestatic    #178 <Method int Math.round(float)>
		//   33   65:invokevirtual   #180 <Method void b(int, int)>
				return;
		//   34   68:return          
			} else
			{
				c();
		//   35   69:aload_0         
		//   36   70:invokespecial   #101 <Method void c()>
				return;
		//   37   73:return          
			}
		}

		protected void onMeasure(int i1, int j1)
		{
			super.onMeasure(i1, j1);
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #183 <Method void LinearLayout.onMeasure(int, int)>
			if(android.view.View.MeasureSpec.getMode(i1) != 0x40000000)
		//*   4    6:iload_1         
		//*   5    7:invokestatic    #188 <Method int android.view.View$MeasureSpec.getMode(int)>
		//*   6   10:ldc1            #189 <Int 0x40000000>
		//*   7   12:icmpeq          16
				return;
		//    8   15:return          
			int k1 = c.l;
		//    9   16:aload_0         
		//   10   17:getfield        #28  <Field TabLayout c>
		//   11   20:getfield        #192 <Field int TabLayout.l>
		//   12   23:istore_3        
			boolean flag2 = true;
		//   13   24:iconst_1        
		//   14   25:istore          7
			if(k1 == 1 && c.k == 1)
		//*  15   27:iload_3         
		//*  16   28:iconst_1        
		//*  17   29:icmpne          240
		//*  18   32:aload_0         
		//*  19   33:getfield        #28  <Field TabLayout c>
		//*  20   36:getfield        #195 <Field int TabLayout.k>
		//*  21   39:iconst_1        
		//*  22   40:icmpne          240
			{
				int l2 = getChildCount();
		//   23   43:aload_0         
		//   24   44:invokevirtual   #72  <Method int getChildCount()>
		//   25   47:istore          8
				boolean flag1 = false;
		//   26   49:iconst_0        
		//   27   50:istore          6
				int l1 = 0;
		//   28   52:iconst_0        
		//   29   53:istore_3        
				int i2;
				int j2;
				for(i2 = 0; l1 < l2; i2 = j2)
		//*  30   54:iconst_0        
		//*  31   55:istore          4
		//*  32   57:iload_3         
		//*  33   58:iload           8
		//*  34   60:icmpge          105
				{
					View view = getChildAt(l1);
		//   35   63:aload_0         
		//   36   64:iload_3         
		//   37   65:invokevirtual   #55  <Method View getChildAt(int)>
		//   38   68:astore          9
					j2 = i2;
		//   39   70:iload           4
		//   40   72:istore          5
					if(view.getVisibility() == 0)
		//*  41   74:aload           9
		//*  42   76:invokevirtual   #198 <Method int View.getVisibility()>
		//*  43   79:ifne            94
						j2 = Math.max(i2, view.getMeasuredWidth());
		//   44   82:iload           4
		//   45   84:aload           9
		//   46   86:invokevirtual   #201 <Method int View.getMeasuredWidth()>
		//   47   89:invokestatic    #205 <Method int Math.max(int, int)>
		//   48   92:istore          5
					l1++;
		//   49   94:iload_3         
		//   50   95:iconst_1        
		//   51   96:iadd            
		//   52   97:istore_3        
				}

		//   53   98:iload           5
		//   54  100:istore          4
		//*  55  102:goto            57
				if(i2 <= 0)
		//*  56  105:iload           4
		//*  57  107:ifgt            111
					return;
		//   58  110:return          
				l1 = c.b(16);
		//   59  111:aload_0         
		//   60  112:getfield        #28  <Field TabLayout c>
		//   61  115:bipush          16
		//   62  117:invokevirtual   #115 <Method int TabLayout.b(int)>
		//   63  120:istore_3        
				boolean flag;
				if(i2 * l2 <= getMeasuredWidth() - l1 * 2)
		//*  64  121:iload           4
		//*  65  123:iload           8
		//*  66  125:imul            
		//*  67  126:aload_0         
		//*  68  127:invokevirtual   #206 <Method int getMeasuredWidth()>
		//*  69  130:iload_3         
		//*  70  131:iconst_2        
		//*  71  132:imul            
		//*  72  133:isub            
		//*  73  134:icmpgt          211
				{
					flag = false;
		//   74  137:iconst_0        
		//   75  138:istore_3        
					for(int k2 = ((int) (flag1)); k2 < l2; k2++)
		//*  76  139:iload           6
		//*  77  141:istore          5
		//*  78  143:iload           5
		//*  79  145:iload           8
		//*  80  147:icmpge          208
					{
						android.widget.LinearLayout.LayoutParams layoutparams = (android.widget.LinearLayout.LayoutParams)getChildAt(k2).getLayoutParams();
		//   81  150:aload_0         
		//   82  151:iload           5
		//   83  153:invokevirtual   #55  <Method View getChildAt(int)>
		//   84  156:invokevirtual   #210 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
		//   85  159:checkcast       #212 <Class android.widget.LinearLayout$LayoutParams>
		//   86  162:astore          9
						if(layoutparams.width != i2 || layoutparams.weight != 0.0F)
		//*  87  164:aload           9
		//*  88  166:getfield        #215 <Field int android.widget.LinearLayout$LayoutParams.width>
		//*  89  169:iload           4
		//*  90  171:icmpne          184
		//*  91  174:aload           9
		//*  92  176:getfield        #218 <Field float android.widget.LinearLayout$LayoutParams.weight>
		//*  93  179:fconst_0        
		//*  94  180:fcmpl           
		//*  95  181:ifeq            199
						{
							layoutparams.width = i2;
		//   96  184:aload           9
		//   97  186:iload           4
		//   98  188:putfield        #215 <Field int android.widget.LinearLayout$LayoutParams.width>
							layoutparams.weight = 0.0F;
		//   99  191:aload           9
		//  100  193:fconst_0        
		//  101  194:putfield        #218 <Field float android.widget.LinearLayout$LayoutParams.weight>
							flag = true;
		//  102  197:iconst_1        
		//  103  198:istore_3        
						}
					}

		//  104  199:iload           5
		//  105  201:iconst_1        
		//  106  202:iadd            
		//  107  203:istore          5
				} else
		//* 108  205:goto            143
		//* 109  208:goto            230
				{
					c.k = 0;
		//  110  211:aload_0         
		//  111  212:getfield        #28  <Field TabLayout c>
		//  112  215:iconst_0        
		//  113  216:putfield        #195 <Field int TabLayout.k>
					c.a(false);
		//  114  219:aload_0         
		//  115  220:getfield        #28  <Field TabLayout c>
		//  116  223:iconst_0        
		//  117  224:invokevirtual   #220 <Method void TabLayout.a(boolean)>
					flag = flag2;
		//  118  227:iload           7
		//  119  229:istore_3        
				}
				if(flag)
		//* 120  230:iload_3         
		//* 121  231:ifeq            240
					super.onMeasure(i1, j1);
		//  122  234:aload_0         
		//  123  235:iload_1         
		//  124  236:iload_2         
		//  125  237:invokespecial   #183 <Method void LinearLayout.onMeasure(int, int)>
			}
		//  126  240:return          
		}

		public void onRtlPropertiesChanged(int i1)
		{
			super.onRtlPropertiesChanged(i1);
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:invokespecial   #223 <Method void LinearLayout.onRtlPropertiesChanged(int)>
			if(android.os.Build.VERSION.SDK_INT < 23 && f != i1)
		//*   3    5:getstatic       #228 <Field int android.os.Build$VERSION.SDK_INT>
		//*   4    8:bipush          23
		//*   5   10:icmpge          30
		//*   6   13:aload_0         
		//*   7   14:getfield        #35  <Field int f>
		//*   8   17:iload_1         
		//*   9   18:icmpeq          30
			{
				requestLayout();
		//   10   21:aload_0         
		//   11   22:invokevirtual   #231 <Method void requestLayout()>
				f = i1;
		//   12   25:aload_0         
		//   13   26:iload_1         
		//   14   27:putfield        #35  <Field int f>
			}
		//   15   30:return          
		}

		int a;
		float b;
		final TabLayout c;
		private int d;
		private final Paint e = new Paint();
		private int f;
		private int g;
		private int h;
		private ValueAnimator i;

		d(Context context)
		{
			c = TabLayout.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #28  <Field TabLayout c>
			super(context);
		//    3    5:aload_0         
		//    4    6:aload_2         
		//    5    7:invokespecial   #31  <Method void LinearLayout(Context)>
			a = -1;
		//    6   10:aload_0         
		//    7   11:iconst_m1       
		//    8   12:putfield        #33  <Field int a>
			f = -1;
		//    9   15:aload_0         
		//   10   16:iconst_m1       
		//   11   17:putfield        #35  <Field int f>
			g = -1;
		//   12   20:aload_0         
		//   13   21:iconst_m1       
		//   14   22:putfield        #37  <Field int g>
			h = -1;
		//   15   25:aload_0         
		//   16   26:iconst_m1       
		//   17   27:putfield        #39  <Field int h>
			setWillNotDraw(false);
		//   18   30:aload_0         
		//   19   31:iconst_0        
		//   20   32:invokevirtual   #43  <Method void setWillNotDraw(boolean)>
		//   21   35:aload_0         
		//   22   36:new             #45  <Class Paint>
		//   23   39:dup             
		//   24   40:invokespecial   #48  <Method void Paint()>
		//   25   43:putfield        #50  <Field Paint e>
		//   26   46:return          
		}
	}

	public static final class e
	{

		public e a(int i1)
		{
			return a(LayoutInflater.from(b.getContext()).inflate(i1, ((ViewGroup) (b)), false));
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #31  <Field TabLayout$g b>
		//    3    5:invokevirtual   #37  <Method Context TabLayout$g.getContext()>
		//    4    8:invokestatic    #43  <Method LayoutInflater LayoutInflater.from(Context)>
		//    5   11:iload_1         
		//    6   12:aload_0         
		//    7   13:getfield        #31  <Field TabLayout$g b>
		//    8   16:iconst_0        
		//    9   17:invokevirtual   #47  <Method View LayoutInflater.inflate(int, ViewGroup, boolean)>
		//   10   20:invokevirtual   #50  <Method TabLayout$e a(View)>
		//   11   23:areturn         
		}

		public e a(Drawable drawable)
		{
			d = drawable;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #53  <Field Drawable d>
			h();
		//    3    5:aload_0         
		//    4    6:invokevirtual   #55  <Method void h()>
			return this;
		//    5    9:aload_0         
		//    6   10:areturn         
		}

		public e a(View view)
		{
			h = view;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #57  <Field View h>
			h();
		//    3    5:aload_0         
		//    4    6:invokevirtual   #55  <Method void h()>
			return this;
		//    5    9:aload_0         
		//    6   10:areturn         
		}

		public e a(CharSequence charsequence)
		{
			e = charsequence;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #60  <Field CharSequence e>
			h();
		//    3    5:aload_0         
		//    4    6:invokevirtual   #55  <Method void h()>
			return this;
		//    5    9:aload_0         
		//    6   10:areturn         
		}

		public View a()
		{
			return h;
		//    0    0:aload_0         
		//    1    1:getfield        #57  <Field View h>
		//    2    4:areturn         
		}

		public Drawable b()
		{
			return d;
		//    0    0:aload_0         
		//    1    1:getfield        #53  <Field Drawable d>
		//    2    4:areturn         
		}

		public e b(CharSequence charsequence)
		{
			f = charsequence;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #64  <Field CharSequence f>
			h();
		//    3    5:aload_0         
		//    4    6:invokevirtual   #55  <Method void h()>
			return this;
		//    5    9:aload_0         
		//    6   10:areturn         
		}

		void b(int i1)
		{
			g = i1;
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:putfield        #27  <Field int g>
		//    3    5:return          
		}

		public int c()
		{
			return g;
		//    0    0:aload_0         
		//    1    1:getfield        #27  <Field int g>
		//    2    4:ireturn         
		}

		public CharSequence d()
		{
			return e;
		//    0    0:aload_0         
		//    1    1:getfield        #60  <Field CharSequence e>
		//    2    4:areturn         
		}

		public void e()
		{
			if(a == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #69  <Field TabLayout a>
		//*   2    4:ifnonnull       17
			{
				throw new IllegalArgumentException("Tab not attached to a TabLayout");
		//    3    7:new             #71  <Class IllegalArgumentException>
		//    4   10:dup             
		//    5   11:ldc1            #73  <String "Tab not attached to a TabLayout">
		//    6   13:invokespecial   #76  <Method void IllegalArgumentException(String)>
		//    7   16:athrow          
			} else
			{
				a.b(this);
		//    8   17:aload_0         
		//    9   18:getfield        #69  <Field TabLayout a>
		//   10   21:aload_0         
		//   11   22:invokevirtual   #79  <Method void TabLayout.b(TabLayout$e)>
				return;
		//   12   25:return          
			}
		}

		public boolean f()
		{
			if(a == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #69  <Field TabLayout a>
		//*   2    4:ifnonnull       17
				throw new IllegalArgumentException("Tab not attached to a TabLayout");
		//    3    7:new             #71  <Class IllegalArgumentException>
		//    4   10:dup             
		//    5   11:ldc1            #73  <String "Tab not attached to a TabLayout">
		//    6   13:invokespecial   #76  <Method void IllegalArgumentException(String)>
		//    7   16:athrow          
			return a.getSelectedTabPosition() == g;
		//    8   17:aload_0         
		//    9   18:getfield        #69  <Field TabLayout a>
		//   10   21:invokevirtual   #83  <Method int TabLayout.getSelectedTabPosition()>
		//   11   24:aload_0         
		//   12   25:getfield        #27  <Field int g>
		//   13   28:icmpne          33
		//   14   31:iconst_1        
		//   15   32:ireturn         
		//   16   33:iconst_0        
		//   17   34:ireturn         
		}

		public CharSequence g()
		{
			return f;
		//    0    0:aload_0         
		//    1    1:getfield        #64  <Field CharSequence f>
		//    2    4:areturn         
		}

		void h()
		{
			if(b != null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #31  <Field TabLayout$g b>
		//*   2    4:ifnull          14
				b.b();
		//    3    7:aload_0         
		//    4    8:getfield        #31  <Field TabLayout$g b>
		//    5   11:invokevirtual   #85  <Method void TabLayout$g.b()>
		//    6   14:return          
		}

		void i()
		{
			a = null;
		//    0    0:aload_0         
		//    1    1:aconst_null     
		//    2    2:putfield        #69  <Field TabLayout a>
			b = null;
		//    3    5:aload_0         
		//    4    6:aconst_null     
		//    5    7:putfield        #31  <Field TabLayout$g b>
			c = null;
		//    6   10:aload_0         
		//    7   11:aconst_null     
		//    8   12:putfield        #88  <Field Object c>
			d = null;
		//    9   15:aload_0         
		//   10   16:aconst_null     
		//   11   17:putfield        #53  <Field Drawable d>
			e = null;
		//   12   20:aload_0         
		//   13   21:aconst_null     
		//   14   22:putfield        #60  <Field CharSequence e>
			f = null;
		//   15   25:aload_0         
		//   16   26:aconst_null     
		//   17   27:putfield        #64  <Field CharSequence f>
			g = -1;
		//   18   30:aload_0         
		//   19   31:iconst_m1       
		//   20   32:putfield        #27  <Field int g>
			h = null;
		//   21   35:aload_0         
		//   22   36:aconst_null     
		//   23   37:putfield        #57  <Field View h>
		//   24   40:return          
		}

		TabLayout a;
		g b;
		private Object c;
		private Drawable d;
		private CharSequence e;
		private CharSequence f;
		private int g;
		private View h;

		e()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #25  <Method void Object()>
			g = -1;
		//    2    4:aload_0         
		//    3    5:iconst_m1       
		//    4    6:putfield        #27  <Field int g>
		//    5    9:return          
		}
	}

	public static class f
		implements android.support.v4.view.ViewPager.e
	{

		void a()
		{
			c = 0;
		//    0    0:aload_0         
		//    1    1:iconst_0        
		//    2    2:putfield        #30  <Field int c>
			b = 0;
		//    3    5:aload_0         
		//    4    6:iconst_0        
		//    5    7:putfield        #32  <Field int b>
		//    6   10:return          
		}

		public void a(int i1)
		{
			b = c;
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #30  <Field int c>
		//    3    5:putfield        #32  <Field int b>
			c = i1;
		//    4    8:aload_0         
		//    5    9:iload_1         
		//    6   10:putfield        #30  <Field int c>
		//    7   13:return          
		}

		public void a(int i1, float f1, int j1)
		{
			TabLayout tablayout = (TabLayout)a.get();
		//    0    0:aload_0         
		//    1    1:getfield        #27  <Field WeakReference a>
		//    2    4:invokevirtual   #38  <Method Object WeakReference.get()>
		//    3    7:checkcast       #8   <Class TabLayout>
		//    4   10:astore          6
			if(tablayout != null)
		//*   5   12:aload           6
		//*   6   14:ifnull          79
			{
				j1 = c;
		//    7   17:aload_0         
		//    8   18:getfield        #30  <Field int c>
		//    9   21:istore_3        
				boolean flag1 = false;
		//   10   22:iconst_0        
		//   11   23:istore          5
				boolean flag;
				if(j1 == 2 && b != 1)
		//*  12   25:iload_3         
		//*  13   26:iconst_2        
		//*  14   27:icmpne          47
		//*  15   30:aload_0         
		//*  16   31:getfield        #32  <Field int b>
		//*  17   34:iconst_1        
		//*  18   35:icmpne          41
		//*  19   38:goto            47
					flag = false;
		//   20   41:iconst_0        
		//   21   42:istore          4
				else
		//*  22   44:goto            50
					flag = true;
		//   23   47:iconst_1        
		//   24   48:istore          4
				if(c != 2 || b != 0)
		//*  25   50:aload_0         
		//*  26   51:getfield        #30  <Field int c>
		//*  27   54:iconst_2        
		//*  28   55:icmpne          65
		//*  29   58:aload_0         
		//*  30   59:getfield        #32  <Field int b>
		//*  31   62:ifeq            68
					flag1 = true;
		//   32   65:iconst_1        
		//   33   66:istore          5
				tablayout.a(i1, f1, flag, flag1);
		//   34   68:aload           6
		//   35   70:iload_1         
		//   36   71:fload_2         
		//   37   72:iload           4
		//   38   74:iload           5
		//   39   76:invokevirtual   #41  <Method void TabLayout.a(int, float, boolean, boolean)>
			}
		//   40   79:return          
		}

		public void b(int i1)
		{
			TabLayout tablayout = (TabLayout)a.get();
		//    0    0:aload_0         
		//    1    1:getfield        #27  <Field WeakReference a>
		//    2    4:invokevirtual   #38  <Method Object WeakReference.get()>
		//    3    7:checkcast       #8   <Class TabLayout>
		//    4   10:astore_3        
			if(tablayout != null && tablayout.getSelectedTabPosition() != i1 && i1 < tablayout.getTabCount())
		//*   5   11:aload_3         
		//*   6   12:ifnull          73
		//*   7   15:aload_3         
		//*   8   16:invokevirtual   #45  <Method int TabLayout.getSelectedTabPosition()>
		//*   9   19:iload_1         
		//*  10   20:icmpeq          73
		//*  11   23:iload_1         
		//*  12   24:aload_3         
		//*  13   25:invokevirtual   #48  <Method int TabLayout.getTabCount()>
		//*  14   28:icmpge          73
			{
				boolean flag;
				if(c != 0 && (c != 2 || b != 0))
		//*  15   31:aload_0         
		//*  16   32:getfield        #30  <Field int c>
		//*  17   35:ifeq            61
		//*  18   38:aload_0         
		//*  19   39:getfield        #30  <Field int c>
		//*  20   42:iconst_2        
		//*  21   43:icmpne          56
		//*  22   46:aload_0         
		//*  23   47:getfield        #32  <Field int b>
		//*  24   50:ifne            56
		//*  25   53:goto            61
					flag = false;
		//   26   56:iconst_0        
		//   27   57:istore_2        
				else
		//*  28   58:goto            63
					flag = true;
		//   29   61:iconst_1        
		//   30   62:istore_2        
				tablayout.b(tablayout.a(i1), flag);
		//   31   63:aload_3         
		//   32   64:aload_3         
		//   33   65:iload_1         
		//   34   66:invokevirtual   #51  <Method TabLayout$e TabLayout.a(int)>
		//   35   69:iload_2         
		//   36   70:invokevirtual   #54  <Method void TabLayout.b(TabLayout$e, boolean)>
			}
		//   37   73:return          
		}

		private final WeakReference a;
		private int b;
		private int c;

		public f(TabLayout tablayout)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #20  <Method void Object()>
			a = new WeakReference(((Object) (tablayout)));
		//    2    4:aload_0         
		//    3    5:new             #22  <Class WeakReference>
		//    4    8:dup             
		//    5    9:aload_1         
		//    6   10:invokespecial   #25  <Method void WeakReference(Object)>
		//    7   13:putfield        #27  <Field WeakReference a>
		//    8   16:return          
		}
	}

	class g extends LinearLayout
	{

		private float a(Layout layout, int i1, float f1)
		{
			return layout.getLineWidth(i1) * (f1 / layout.getPaint().getTextSize());
		//    0    0:aload_1         
		//    1    1:iload_2         
		//    2    2:invokevirtual   #84  <Method float Layout.getLineWidth(int)>
		//    3    5:fload_3         
		//    4    6:aload_1         
		//    5    7:invokevirtual   #88  <Method TextPaint Layout.getPaint()>
		//    6   10:invokevirtual   #94  <Method float TextPaint.getTextSize()>
		//    7   13:fdiv            
		//    8   14:fmul            
		//    9   15:freturn         
		}

		private void a(TextView textview, ImageView imageview)
		{
			Object obj = ((Object) (b));
		//    0    0:aload_0         
		//    1    1:getfield        #97  <Field TabLayout$e b>
		//    2    4:astore          6
			Object obj1 = null;
		//    3    6:aconst_null     
		//    4    7:astore          9
			Drawable drawable;
			if(obj != null)
		//*   5    9:aload           6
		//*   6   11:ifnull          26
				drawable = b.b();
		//    7   14:aload_0         
		//    8   15:getfield        #97  <Field TabLayout$e b>
		//    9   18:invokevirtual   #102 <Method Drawable TabLayout$e.b()>
		//   10   21:astore          7
			else
		//*  11   23:goto            29
				drawable = null;
		//   12   26:aconst_null     
		//   13   27:astore          7
			CharSequence charsequence;
			if(b != null)
		//*  14   29:aload_0         
		//*  15   30:getfield        #97  <Field TabLayout$e b>
		//*  16   33:ifnull          48
				charsequence = b.d();
		//   17   36:aload_0         
		//   18   37:getfield        #97  <Field TabLayout$e b>
		//   19   40:invokevirtual   #105 <Method CharSequence TabLayout$e.d()>
		//   20   43:astore          8
			else
		//*  21   45:goto            51
				charsequence = null;
		//   22   48:aconst_null     
		//   23   49:astore          8
			if(b != null)
		//*  24   51:aload_0         
		//*  25   52:getfield        #97  <Field TabLayout$e b>
		//*  26   55:ifnull          70
				obj = ((Object) (b.g()));
		//   27   58:aload_0         
		//   28   59:getfield        #97  <Field TabLayout$e b>
		//   29   62:invokevirtual   #107 <Method CharSequence TabLayout$e.g()>
		//   30   65:astore          6
			else
		//*  31   67:goto            73
				obj = null;
		//   32   70:aconst_null     
		//   33   71:astore          6
			boolean flag = false;
		//   34   73:iconst_0        
		//   35   74:istore          4
			if(imageview != null)
		//*  36   76:aload_2         
		//*  37   77:ifnull          121
			{
				if(drawable != null)
		//*  38   80:aload           7
		//*  39   82:ifnull          104
				{
					imageview.setImageDrawable(drawable);
		//   40   85:aload_2         
		//   41   86:aload           7
		//   42   88:invokevirtual   #113 <Method void ImageView.setImageDrawable(Drawable)>
					imageview.setVisibility(0);
		//   43   91:aload_2         
		//   44   92:iconst_0        
		//   45   93:invokevirtual   #116 <Method void ImageView.setVisibility(int)>
					setVisibility(0);
		//   46   96:aload_0         
		//   47   97:iconst_0        
		//   48   98:invokevirtual   #117 <Method void setVisibility(int)>
				} else
		//*  49  101:goto            115
				{
					imageview.setVisibility(8);
		//   50  104:aload_2         
		//   51  105:bipush          8
		//   52  107:invokevirtual   #116 <Method void ImageView.setVisibility(int)>
					imageview.setImageDrawable(((Drawable) (null)));
		//   53  110:aload_2         
		//   54  111:aconst_null     
		//   55  112:invokevirtual   #113 <Method void ImageView.setImageDrawable(Drawable)>
				}
				imageview.setContentDescription(((CharSequence) (obj)));
		//   56  115:aload_2         
		//   57  116:aload           6
		//   58  118:invokevirtual   #121 <Method void ImageView.setContentDescription(CharSequence)>
			}
			boolean flag1 = TextUtils.isEmpty(charsequence) ^ true;
		//   59  121:aload           8
		//   60  123:invokestatic    #127 <Method boolean TextUtils.isEmpty(CharSequence)>
		//   61  126:iconst_1        
		//   62  127:ixor            
		//   63  128:istore          5
			if(textview != null)
		//*  64  130:aload_1         
		//*  65  131:ifnull          175
			{
				if(flag1)
		//*  66  134:iload           5
		//*  67  136:ifeq            158
				{
					textview.setText(charsequence);
		//   68  139:aload_1         
		//   69  140:aload           8
		//   70  142:invokevirtual   #132 <Method void TextView.setText(CharSequence)>
					textview.setVisibility(0);
		//   71  145:aload_1         
		//   72  146:iconst_0        
		//   73  147:invokevirtual   #133 <Method void TextView.setVisibility(int)>
					setVisibility(0);
		//   74  150:aload_0         
		//   75  151:iconst_0        
		//   76  152:invokevirtual   #117 <Method void setVisibility(int)>
				} else
		//*  77  155:goto            169
				{
					textview.setVisibility(8);
		//   78  158:aload_1         
		//   79  159:bipush          8
		//   80  161:invokevirtual   #133 <Method void TextView.setVisibility(int)>
					textview.setText(((CharSequence) (null)));
		//   81  164:aload_1         
		//   82  165:aconst_null     
		//   83  166:invokevirtual   #132 <Method void TextView.setText(CharSequence)>
				}
				textview.setContentDescription(((CharSequence) (obj)));
		//   84  169:aload_1         
		//   85  170:aload           6
		//   86  172:invokevirtual   #134 <Method void TextView.setContentDescription(CharSequence)>
			}
			if(imageview != null)
		//*  87  175:aload_2         
		//*  88  176:ifnull          232
			{
				textview = ((TextView) ((android.view.ViewGroup.MarginLayoutParams)imageview.getLayoutParams()));
		//   89  179:aload_2         
		//   90  180:invokevirtual   #138 <Method android.view.ViewGroup$LayoutParams ImageView.getLayoutParams()>
		//   91  183:checkcast       #140 <Class android.view.ViewGroup$MarginLayoutParams>
		//   92  186:astore_1        
				int i1 = ((int) (flag));
		//   93  187:iload           4
		//   94  189:istore_3        
				if(flag1)
		//*  95  190:iload           5
		//*  96  192:ifeq            215
				{
					i1 = ((int) (flag));
		//   97  195:iload           4
		//   98  197:istore_3        
					if(imageview.getVisibility() == 0)
		//*  99  198:aload_2         
		//* 100  199:invokevirtual   #144 <Method int ImageView.getVisibility()>
		//* 101  202:ifne            215
						i1 = a.b(8);
		//  102  205:aload_0         
		//  103  206:getfield        #24  <Field TabLayout a>
		//  104  209:bipush          8
		//  105  211:invokevirtual   #147 <Method int TabLayout.b(int)>
		//  106  214:istore_3        
				}
				if(i1 != ((android.view.ViewGroup.MarginLayoutParams) (textview)).bottomMargin)
		//* 107  215:iload_3         
		//* 108  216:aload_1         
		//* 109  217:getfield        #150 <Field int android.view.ViewGroup$MarginLayoutParams.bottomMargin>
		//* 110  220:icmpeq          232
				{
					textview.bottomMargin = i1;
		//  111  223:aload_1         
		//  112  224:iload_3         
		//  113  225:putfield        #150 <Field int android.view.ViewGroup$MarginLayoutParams.bottomMargin>
					imageview.requestLayout();
		//  114  228:aload_2         
		//  115  229:invokevirtual   #154 <Method void ImageView.requestLayout()>
				}
			}
			if(flag1)
		//* 116  232:iload           5
		//* 117  234:ifeq            244
				obj = ((Object) (obj1));
		//  118  237:aload           9
		//  119  239:astore          6
		//* 120  241:goto            244
			ax.a(((View) (this)), ((CharSequence) (obj)));
		//  121  244:aload_0         
		//  122  245:aload           6
		//  123  247:invokestatic    #159 <Method void ax.a(View, CharSequence)>
		//  124  250:return          
		}

		void a()
		{
			a(((e) (null)));
		//    0    0:aload_0         
		//    1    1:aconst_null     
		//    2    2:invokevirtual   #162 <Method void a(TabLayout$e)>
			setSelected(false);
		//    3    5:aload_0         
		//    4    6:iconst_0        
		//    5    7:invokevirtual   #165 <Method void setSelected(boolean)>
		//    6   10:return          
		}

		void a(e e1)
		{
			if(e1 != b)
		//*   0    0:aload_1         
		//*   1    1:aload_0         
		//*   2    2:getfield        #97  <Field TabLayout$e b>
		//*   3    5:if_acmpeq       17
			{
				b = e1;
		//    4    8:aload_0         
		//    5    9:aload_1         
		//    6   10:putfield        #97  <Field TabLayout$e b>
				b();
		//    7   13:aload_0         
		//    8   14:invokevirtual   #167 <Method void b()>
			}
		//    9   17:return          
		}

		final void b()
		{
			boolean flag1;
			e e1;
label0:
			{
				e1 = b;
		//    0    0:aload_0         
		//    1    1:getfield        #97  <Field TabLayout$e b>
		//    2    4:astore          5
				Object obj1 = null;
		//    3    6:aconst_null     
		//    4    7:astore          4
				Object obj;
				if(e1 != null)
		//*   5    9:aload           5
		//*   6   11:ifnull          23
					obj = ((Object) (e1.a()));
		//    7   14:aload           5
		//    8   16:invokevirtual   #170 <Method View TabLayout$e.a()>
		//    9   19:astore_3        
				else
		//*  10   20:goto            25
					obj = null;
		//   11   23:aconst_null     
		//   12   24:astore_3        
				if(obj != null)
		//*  13   25:aload_3         
		//*  14   26:ifnull          149
				{
					obj1 = ((Object) (((View) (obj)).getParent()));
		//   15   29:aload_3         
		//   16   30:invokevirtual   #176 <Method android.view.ViewParent View.getParent()>
		//   17   33:astore          4
					if(obj1 != this)
		//*  18   35:aload           4
		//*  19   37:aload_0         
		//*  20   38:if_acmpeq       60
					{
						if(obj1 != null)
		//*  21   41:aload           4
		//*  22   43:ifnull          55
							((ViewGroup)obj1).removeView(((View) (obj)));
		//   23   46:aload           4
		//   24   48:checkcast       #178 <Class ViewGroup>
		//   25   51:aload_3         
		//   26   52:invokevirtual   #182 <Method void ViewGroup.removeView(View)>
						addView(((View) (obj)));
		//   27   55:aload_0         
		//   28   56:aload_3         
		//   29   57:invokevirtual   #185 <Method void addView(View)>
					}
					e = ((View) (obj));
		//   30   60:aload_0         
		//   31   61:aload_3         
		//   32   62:putfield        #187 <Field View e>
					if(c != null)
		//*  33   65:aload_0         
		//*  34   66:getfield        #189 <Field TextView c>
		//*  35   69:ifnull          81
						c.setVisibility(8);
		//   36   72:aload_0         
		//   37   73:getfield        #189 <Field TextView c>
		//   38   76:bipush          8
		//   39   78:invokevirtual   #133 <Method void TextView.setVisibility(int)>
					if(d != null)
		//*  40   81:aload_0         
		//*  41   82:getfield        #191 <Field ImageView d>
		//*  42   85:ifnull          105
					{
						d.setVisibility(8);
		//   43   88:aload_0         
		//   44   89:getfield        #191 <Field ImageView d>
		//   45   92:bipush          8
		//   46   94:invokevirtual   #116 <Method void ImageView.setVisibility(int)>
						d.setImageDrawable(((Drawable) (null)));
		//   47   97:aload_0         
		//   48   98:getfield        #191 <Field ImageView d>
		//   49  101:aconst_null     
		//   50  102:invokevirtual   #113 <Method void ImageView.setImageDrawable(Drawable)>
					}
					f = (TextView)((View) (obj)).findViewById(0x1020014);
		//   51  105:aload_0         
		//   52  106:aload_3         
		//   53  107:ldc1            #192 <Int 0x1020014>
		//   54  109:invokevirtual   #196 <Method View View.findViewById(int)>
		//   55  112:checkcast       #129 <Class TextView>
		//   56  115:putfield        #198 <Field TextView f>
					if(f != null)
		//*  57  118:aload_0         
		//*  58  119:getfield        #198 <Field TextView f>
		//*  59  122:ifnull          136
						h = android.support.v4.widget.m.a(f);
		//   60  125:aload_0         
		//   61  126:aload_0         
		//   62  127:getfield        #198 <Field TextView f>
		//   63  130:invokestatic    #203 <Method int m.a(TextView)>
		//   64  133:putfield        #29  <Field int h>
					obj = ((Object) ((ImageView)((View) (obj)).findViewById(0x1020006)));
		//   65  136:aload_3         
		//   66  137:ldc1            #204 <Int 0x1020006>
		//   67  139:invokevirtual   #196 <Method View View.findViewById(int)>
		//   68  142:checkcast       #109 <Class ImageView>
		//   69  145:astore_3        
				} else
		//*  70  146:goto            177
				{
					if(e != null)
		//*  71  149:aload_0         
		//*  72  150:getfield        #187 <Field View e>
		//*  73  153:ifnull          169
					{
						removeView(e);
		//   74  156:aload_0         
		//   75  157:aload_0         
		//   76  158:getfield        #187 <Field View e>
		//   77  161:invokevirtual   #205 <Method void removeView(View)>
						e = null;
		//   78  164:aload_0         
		//   79  165:aconst_null     
		//   80  166:putfield        #187 <Field View e>
					}
					f = null;
		//   81  169:aload_0         
		//   82  170:aconst_null     
		//   83  171:putfield        #198 <Field TextView f>
					obj = obj1;
		//   84  174:aload           4
		//   85  176:astore_3        
				}
				g = ((ImageView) (obj));
		//   86  177:aload_0         
		//   87  178:aload_3         
		//   88  179:putfield        #207 <Field ImageView g>
				obj = ((Object) (e));
		//   89  182:aload_0         
		//   90  183:getfield        #187 <Field View e>
		//   91  186:astore_3        
				flag1 = false;
		//   92  187:iconst_0        
		//   93  188:istore_2        
				if(obj == null)
		//*  94  189:aload_3         
		//*  95  190:ifnonnull       329
				{
					if(d == null)
		//*  96  193:aload_0         
		//*  97  194:getfield        #191 <Field ImageView d>
		//*  98  197:ifnonnull       230
					{
						obj = ((Object) ((ImageView)LayoutInflater.from(getContext()).inflate(android.support.design.a.h.design_layout_tab_icon, ((ViewGroup) (this)), false)));
		//   99  200:aload_0         
		//  100  201:invokevirtual   #68  <Method Context getContext()>
		//  101  204:invokestatic    #213 <Method LayoutInflater LayoutInflater.from(Context)>
		//  102  207:getstatic       #218 <Field int android.support.design.a$h.design_layout_tab_icon>
		//  103  210:aload_0         
		//  104  211:iconst_0        
		//  105  212:invokevirtual   #222 <Method View LayoutInflater.inflate(int, ViewGroup, boolean)>
		//  106  215:checkcast       #109 <Class ImageView>
		//  107  218:astore_3        
						addView(((View) (obj)), 0);
		//  108  219:aload_0         
		//  109  220:aload_3         
		//  110  221:iconst_0        
		//  111  222:invokevirtual   #225 <Method void addView(View, int)>
						d = ((ImageView) (obj));
		//  112  225:aload_0         
		//  113  226:aload_3         
		//  114  227:putfield        #191 <Field ImageView d>
					}
					if(c == null)
		//* 115  230:aload_0         
		//* 116  231:getfield        #189 <Field TextView c>
		//* 117  234:ifnonnull       277
					{
						obj = ((Object) ((TextView)LayoutInflater.from(getContext()).inflate(android.support.design.a.h.design_layout_tab_text, ((ViewGroup) (this)), false)));
		//  118  237:aload_0         
		//  119  238:invokevirtual   #68  <Method Context getContext()>
		//  120  241:invokestatic    #213 <Method LayoutInflater LayoutInflater.from(Context)>
		//  121  244:getstatic       #228 <Field int android.support.design.a$h.design_layout_tab_text>
		//  122  247:aload_0         
		//  123  248:iconst_0        
		//  124  249:invokevirtual   #222 <Method View LayoutInflater.inflate(int, ViewGroup, boolean)>
		//  125  252:checkcast       #129 <Class TextView>
		//  126  255:astore_3        
						addView(((View) (obj)));
		//  127  256:aload_0         
		//  128  257:aload_3         
		//  129  258:invokevirtual   #185 <Method void addView(View)>
						c = ((TextView) (obj));
		//  130  261:aload_0         
		//  131  262:aload_3         
		//  132  263:putfield        #189 <Field TextView c>
						h = android.support.v4.widget.m.a(c);
		//  133  266:aload_0         
		//  134  267:aload_0         
		//  135  268:getfield        #189 <Field TextView c>
		//  136  271:invokestatic    #203 <Method int m.a(TextView)>
		//  137  274:putfield        #29  <Field int h>
					}
					android.support.v4.widget.m.a(c, a.e);
		//  138  277:aload_0         
		//  139  278:getfield        #189 <Field TextView c>
		//  140  281:aload_0         
		//  141  282:getfield        #24  <Field TabLayout a>
		//  142  285:getfield        #230 <Field int TabLayout.e>
		//  143  288:invokestatic    #233 <Method void m.a(TextView, int)>
					if(a.f != null)
		//* 144  291:aload_0         
		//* 145  292:getfield        #24  <Field TabLayout a>
		//* 146  295:getfield        #236 <Field ColorStateList TabLayout.f>
		//* 147  298:ifnull          315
						c.setTextColor(a.f);
		//  148  301:aload_0         
		//  149  302:getfield        #189 <Field TextView c>
		//  150  305:aload_0         
		//  151  306:getfield        #24  <Field TabLayout a>
		//  152  309:getfield        #236 <Field ColorStateList TabLayout.f>
		//  153  312:invokevirtual   #240 <Method void TextView.setTextColor(ColorStateList)>
					obj = ((Object) (c));
		//  154  315:aload_0         
		//  155  316:getfield        #189 <Field TextView c>
		//  156  319:astore_3        
					obj1 = ((Object) (d));
		//  157  320:aload_0         
		//  158  321:getfield        #191 <Field ImageView d>
		//  159  324:astore          4
				} else
		//* 160  326:goto            354
				{
					if(f == null && g == null)
						break label0;
		//  161  329:aload_0         
		//  162  330:getfield        #198 <Field TextView f>
		//  163  333:ifnonnull       343
		//  164  336:aload_0         
		//  165  337:getfield        #207 <Field ImageView g>
		//  166  340:ifnull          361
					obj = ((Object) (f));
		//  167  343:aload_0         
		//  168  344:getfield        #198 <Field TextView f>
		//  169  347:astore_3        
					obj1 = ((Object) (g));
		//  170  348:aload_0         
		//  171  349:getfield        #207 <Field ImageView g>
		//  172  352:astore          4
				}
				a(((TextView) (obj)), ((ImageView) (obj1)));
		//  173  354:aload_0         
		//  174  355:aload_3         
		//  175  356:aload           4
		//  176  358:invokespecial   #242 <Method void a(TextView, ImageView)>
			}
			boolean flag = flag1;
		//  177  361:iload_2         
		//  178  362:istore_1        
			if(e1 != null)
		//* 179  363:aload           5
		//* 180  365:ifnull          380
			{
				flag = flag1;
		//  181  368:iload_2         
		//  182  369:istore_1        
				if(e1.f())
		//* 183  370:aload           5
		//* 184  372:invokevirtual   #245 <Method boolean TabLayout$e.f()>
		//* 185  375:ifeq            380
					flag = true;
		//  186  378:iconst_1        
		//  187  379:istore_1        
			}
			setSelected(flag);
		//  188  380:aload_0         
		//  189  381:iload_1         
		//  190  382:invokevirtual   #165 <Method void setSelected(boolean)>
		//  191  385:return          
		}

		public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityevent)
		{
			super.onInitializeAccessibilityEvent(accessibilityevent);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #249 <Method void LinearLayout.onInitializeAccessibilityEvent(AccessibilityEvent)>
			accessibilityevent.setClassName(((CharSequence) (((Class) (android/support/v7/app/ActionBar$b)).getName())));
		//    3    5:aload_1         
		//    4    6:ldc1            #251 <Class android.support.v7.app.ActionBar$b>
		//    5    8:invokevirtual   #257 <Method String Class.getName()>
		//    6   11:invokevirtual   #262 <Method void AccessibilityEvent.setClassName(CharSequence)>
		//    7   14:return          
		}

		public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilitynodeinfo)
		{
			super.onInitializeAccessibilityNodeInfo(accessibilitynodeinfo);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #266 <Method void LinearLayout.onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo)>
			accessibilitynodeinfo.setClassName(((CharSequence) (((Class) (android/support/v7/app/ActionBar$b)).getName())));
		//    3    5:aload_1         
		//    4    6:ldc1            #251 <Class android.support.v7.app.ActionBar$b>
		//    5    8:invokevirtual   #257 <Method String Class.getName()>
		//    6   11:invokevirtual   #269 <Method void AccessibilityNodeInfo.setClassName(CharSequence)>
		//    7   14:return          
		}

		public void onMeasure(int i1, int j1)
		{
			int k1;
label0:
			{
				int l1 = android.view.View.MeasureSpec.getSize(i1);
		//    0    0:iload_1         
		//    1    1:invokestatic    #276 <Method int android.view.View$MeasureSpec.getSize(int)>
		//    2    4:istore          6
				int j2 = android.view.View.MeasureSpec.getMode(i1);
		//    3    6:iload_1         
		//    4    7:invokestatic    #279 <Method int android.view.View$MeasureSpec.getMode(int)>
		//    5   10:istore          7
				int k2 = a.getTabMaxWidth();
		//    6   12:aload_0         
		//    7   13:getfield        #24  <Field TabLayout a>
		//    8   16:invokevirtual   #282 <Method int TabLayout.getTabMaxWidth()>
		//    9   19:istore          8
				k1 = i1;
		//   10   21:iload_1         
		//   11   22:istore          5
				if(k2 <= 0)
					break label0;
		//   12   24:iload           8
		//   13   26:ifle            59
				if(j2 != 0)
		//*  14   29:iload           7
		//*  15   31:ifeq            44
				{
					k1 = i1;
		//   16   34:iload_1         
		//   17   35:istore          5
					if(l1 <= k2)
						break label0;
		//   18   37:iload           6
		//   19   39:iload           8
		//   20   41:icmple          59
				}
				k1 = android.view.View.MeasureSpec.makeMeasureSpec(a.j, 0x80000000);
		//   21   44:aload_0         
		//   22   45:getfield        #24  <Field TabLayout a>
		//   23   48:getfield        #285 <Field int TabLayout.j>
		//   24   51:ldc2            #286 <Int 0x80000000>
		//   25   54:invokestatic    #290 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
		//   26   57:istore          5
			}
label1:
			{
				float f1;
				boolean flag;
label2:
				{
					super.onMeasure(k1, j1);
		//   27   59:aload_0         
		//   28   60:iload           5
		//   29   62:iload_2         
		//   30   63:invokespecial   #292 <Method void LinearLayout.onMeasure(int, int)>
					if(c == null)
						break label1;
		//   31   66:aload_0         
		//   32   67:getfield        #189 <Field TextView c>
		//   33   70:ifnull          326
					getResources();
		//   34   73:aload_0         
		//   35   74:invokevirtual   #296 <Method Resources getResources()>
		//   36   77:pop             
					float f2 = a.g;
		//   37   78:aload_0         
		//   38   79:getfield        #24  <Field TabLayout a>
		//   39   82:getfield        #299 <Field float TabLayout.g>
		//   40   85:fstore          4
					int i2 = h;
		//   41   87:aload_0         
		//   42   88:getfield        #29  <Field int h>
		//   43   91:istore          6
					Object obj = ((Object) (d));
		//   44   93:aload_0         
		//   45   94:getfield        #191 <Field ImageView d>
		//   46   97:astore          10
					boolean flag1 = true;
		//   47   99:iconst_1        
		//   48  100:istore          7
					if(obj != null && d.getVisibility() == 0)
		//*  49  102:aload           10
		//*  50  104:ifnull          125
		//*  51  107:aload_0         
		//*  52  108:getfield        #191 <Field ImageView d>
		//*  53  111:invokevirtual   #144 <Method int ImageView.getVisibility()>
		//*  54  114:ifne            125
					{
						i1 = 1;
		//   55  117:iconst_1        
		//   56  118:istore_1        
						f1 = f2;
		//   57  119:fload           4
		//   58  121:fstore_3        
					} else
		//*  59  122:goto            166
					{
						f1 = f2;
		//   60  125:fload           4
		//   61  127:fstore_3        
						i1 = i2;
		//   62  128:iload           6
		//   63  130:istore_1        
						if(c != null)
		//*  64  131:aload_0         
		//*  65  132:getfield        #189 <Field TextView c>
		//*  66  135:ifnull          166
						{
							f1 = f2;
		//   67  138:fload           4
		//   68  140:fstore_3        
							i1 = i2;
		//   69  141:iload           6
		//   70  143:istore_1        
							if(c.getLineCount() > 1)
		//*  71  144:aload_0         
		//*  72  145:getfield        #189 <Field TextView c>
		//*  73  148:invokevirtual   #302 <Method int TextView.getLineCount()>
		//*  74  151:iconst_1        
		//*  75  152:icmple          166
							{
								f1 = a.h;
		//   76  155:aload_0         
		//   77  156:getfield        #24  <Field TabLayout a>
		//   78  159:getfield        #304 <Field float TabLayout.h>
		//   79  162:fstore_3        
								i1 = i2;
		//   80  163:iload           6
		//   81  165:istore_1        
							}
						}
					}
					f2 = c.getTextSize();
		//   82  166:aload_0         
		//   83  167:getfield        #189 <Field TextView c>
		//   84  170:invokevirtual   #305 <Method float TextView.getTextSize()>
		//   85  173:fstore          4
					int l2 = c.getLineCount();
		//   86  175:aload_0         
		//   87  176:getfield        #189 <Field TextView c>
		//   88  179:invokevirtual   #302 <Method int TextView.getLineCount()>
		//   89  182:istore          8
					i2 = android.support.v4.widget.m.a(c);
		//   90  184:aload_0         
		//   91  185:getfield        #189 <Field TextView c>
		//   92  188:invokestatic    #203 <Method int m.a(TextView)>
		//   93  191:istore          6
					int i3 = f1 != f2;
		//   94  193:fload_3         
		//   95  194:fload           4
		//   96  196:fcmpl           
		//   97  197:istore          9
					if(i3 == 0 && (i2 < 0 || i1 == i2))
						break label1;
		//   98  199:iload           9
		//   99  201:ifne            215
		//  100  204:iload           6
		//  101  206:iflt            326
		//  102  209:iload_1         
		//  103  210:iload           6
		//  104  212:icmpeq          326
					flag = flag1;
		//  105  215:iload           7
		//  106  217:istore          6
					if(a.l != 1)
						break label2;
		//  107  219:aload_0         
		//  108  220:getfield        #24  <Field TabLayout a>
		//  109  223:getfield        #308 <Field int TabLayout.l>
		//  110  226:iconst_1        
		//  111  227:icmpne          297
					flag = flag1;
		//  112  230:iload           7
		//  113  232:istore          6
					if(i3 <= 0)
						break label2;
		//  114  234:iload           9
		//  115  236:ifle            297
					flag = flag1;
		//  116  239:iload           7
		//  117  241:istore          6
					if(l2 != 1)
						break label2;
		//  118  243:iload           8
		//  119  245:iconst_1        
		//  120  246:icmpne          297
					obj = ((Object) (c.getLayout()));
		//  121  249:aload_0         
		//  122  250:getfield        #189 <Field TextView c>
		//  123  253:invokevirtual   #312 <Method Layout TextView.getLayout()>
		//  124  256:astore          10
					if(obj != null)
		//* 125  258:aload           10
		//* 126  260:ifnull          294
					{
						flag = flag1;
		//  127  263:iload           7
		//  128  265:istore          6
						if(a(((Layout) (obj)), 0, f1) <= (float)(getMeasuredWidth() - getPaddingLeft() - getPaddingRight()))
							break label2;
		//  129  267:aload_0         
		//  130  268:aload           10
		//  131  270:iconst_0        
		//  132  271:fload_3         
		//  133  272:invokespecial   #314 <Method float a(Layout, int, float)>
		//  134  275:aload_0         
		//  135  276:invokevirtual   #317 <Method int getMeasuredWidth()>
		//  136  279:aload_0         
		//  137  280:invokevirtual   #320 <Method int getPaddingLeft()>
		//  138  283:isub            
		//  139  284:aload_0         
		//  140  285:invokevirtual   #323 <Method int getPaddingRight()>
		//  141  288:isub            
		//  142  289:i2f             
		//  143  290:fcmpl           
		//  144  291:ifle            297
					}
					flag = false;
		//  145  294:iconst_0        
		//  146  295:istore          6
				}
				if(flag)
		//* 147  297:iload           6
		//* 148  299:ifeq            326
				{
					c.setTextSize(0, f1);
		//  149  302:aload_0         
		//  150  303:getfield        #189 <Field TextView c>
		//  151  306:iconst_0        
		//  152  307:fload_3         
		//  153  308:invokevirtual   #327 <Method void TextView.setTextSize(int, float)>
					c.setMaxLines(i1);
		//  154  311:aload_0         
		//  155  312:getfield        #189 <Field TextView c>
		//  156  315:iload_1         
		//  157  316:invokevirtual   #330 <Method void TextView.setMaxLines(int)>
					super.onMeasure(k1, j1);
		//  158  319:aload_0         
		//  159  320:iload           5
		//  160  322:iload_2         
		//  161  323:invokespecial   #292 <Method void LinearLayout.onMeasure(int, int)>
				}
			}
		//  162  326:return          
		}

		public boolean performClick()
		{
			boolean flag1 = super.performClick();
		//    0    0:aload_0         
		//    1    1:invokespecial   #333 <Method boolean LinearLayout.performClick()>
		//    2    4:istore_2        
			boolean flag = flag1;
		//    3    5:iload_2         
		//    4    6:istore_1        
			if(b != null)
		//*   5    7:aload_0         
		//*   6    8:getfield        #97  <Field TabLayout$e b>
		//*   7   11:ifnull          32
			{
				if(!flag1)
		//*   8   14:iload_2         
		//*   9   15:ifne            23
					playSoundEffect(0);
		//   10   18:aload_0         
		//   11   19:iconst_0        
		//   12   20:invokevirtual   #336 <Method void playSoundEffect(int)>
				b.e();
		//   13   23:aload_0         
		//   14   24:getfield        #97  <Field TabLayout$e b>
		//   15   27:invokevirtual   #338 <Method void TabLayout$e.e()>
				flag = true;
		//   16   30:iconst_1        
		//   17   31:istore_1        
			}
			return flag;
		//   18   32:iload_1         
		//   19   33:ireturn         
		}

		public void setSelected(boolean flag)
		{
			boolean flag1;
			if(isSelected() != flag)
		//*   0    0:aload_0         
		//*   1    1:invokevirtual   #341 <Method boolean isSelected()>
		//*   2    4:iload_1         
		//*   3    5:icmpeq          13
				flag1 = true;
		//    4    8:iconst_1        
		//    5    9:istore_2        
			else
		//*   6   10:goto            15
				flag1 = false;
		//    7   13:iconst_0        
		//    8   14:istore_2        
			super.setSelected(flag);
		//    9   15:aload_0         
		//   10   16:iload_1         
		//   11   17:invokespecial   #342 <Method void LinearLayout.setSelected(boolean)>
			if(flag1 && flag && android.os.Build.VERSION.SDK_INT < 16)
		//*  12   20:iload_2         
		//*  13   21:ifeq            41
		//*  14   24:iload_1         
		//*  15   25:ifeq            41
		//*  16   28:getstatic       #347 <Field int android.os.Build$VERSION.SDK_INT>
		//*  17   31:bipush          16
		//*  18   33:icmpge          41
				sendAccessibilityEvent(4);
		//   19   36:aload_0         
		//   20   37:iconst_4        
		//   21   38:invokevirtual   #350 <Method void sendAccessibilityEvent(int)>
			if(c != null)
		//*  22   41:aload_0         
		//*  23   42:getfield        #189 <Field TextView c>
		//*  24   45:ifnull          56
				c.setSelected(flag);
		//   25   48:aload_0         
		//   26   49:getfield        #189 <Field TextView c>
		//   27   52:iload_1         
		//   28   53:invokevirtual   #351 <Method void TextView.setSelected(boolean)>
			if(d != null)
		//*  29   56:aload_0         
		//*  30   57:getfield        #191 <Field ImageView d>
		//*  31   60:ifnull          71
				d.setSelected(flag);
		//   32   63:aload_0         
		//   33   64:getfield        #191 <Field ImageView d>
		//   34   67:iload_1         
		//   35   68:invokevirtual   #352 <Method void ImageView.setSelected(boolean)>
			if(e != null)
		//*  36   71:aload_0         
		//*  37   72:getfield        #187 <Field View e>
		//*  38   75:ifnull          86
				e.setSelected(flag);
		//   39   78:aload_0         
		//   40   79:getfield        #187 <Field View e>
		//   41   82:iload_1         
		//   42   83:invokevirtual   #353 <Method void View.setSelected(boolean)>
		//   43   86:return          
		}

		final TabLayout a;
		private e b;
		private TextView c;
		private ImageView d;
		private View e;
		private TextView f;
		private ImageView g;
		private int h;

		public g(Context context)
		{
			a = TabLayout.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #24  <Field TabLayout a>
			super(context);
		//    3    5:aload_0         
		//    4    6:aload_2         
		//    5    7:invokespecial   #27  <Method void LinearLayout(Context)>
			h = 2;
		//    6   10:aload_0         
		//    7   11:iconst_2        
		//    8   12:putfield        #29  <Field int h>
			if(i != 0)
		//*   9   15:aload_1         
		//*  10   16:getfield        #32  <Field int TabLayout.i>
		//*  11   19:ifeq            34
				android.support.v4.view.s.a(((View) (this)), android.support.v7.c.a.b.b(context, i));
		//   12   22:aload_0         
		//   13   23:aload_2         
		//   14   24:aload_1         
		//   15   25:getfield        #32  <Field int TabLayout.i>
		//   16   28:invokestatic    #37  <Method Drawable android.support.v7.c.a.b.b(Context, int)>
		//   17   31:invokestatic    #42  <Method void s.a(View, Drawable)>
			android.support.v4.view.s.b(((View) (this)), TabLayout.this.a, TabLayout.this.b, TabLayout.this.c, TabLayout.this.d);
		//   18   34:aload_0         
		//   19   35:aload_1         
		//   20   36:getfield        #44  <Field int TabLayout.a>
		//   21   39:aload_1         
		//   22   40:getfield        #46  <Field int TabLayout.b>
		//   23   43:aload_1         
		//   24   44:getfield        #48  <Field int TabLayout.c>
		//   25   47:aload_1         
		//   26   48:getfield        #50  <Field int TabLayout.d>
		//   27   51:invokestatic    #53  <Method void s.b(View, int, int, int, int)>
			setGravity(17);
		//   28   54:aload_0         
		//   29   55:bipush          17
		//   30   57:invokevirtual   #57  <Method void setGravity(int)>
			setOrientation(1);
		//   31   60:aload_0         
		//   32   61:iconst_1        
		//   33   62:invokevirtual   #60  <Method void setOrientation(int)>
			setClickable(true);
		//   34   65:aload_0         
		//   35   66:iconst_1        
		//   36   67:invokevirtual   #64  <Method void setClickable(boolean)>
			android.support.v4.view.s.a(((View) (this)), android.support.v4.view.q.a(getContext(), 1002));
		//   37   70:aload_0         
		//   38   71:aload_0         
		//   39   72:invokevirtual   #68  <Method Context getContext()>
		//   40   75:sipush          1002
		//   41   78:invokestatic    #73  <Method q q.a(Context, int)>
		//   42   81:invokestatic    #76  <Method void s.a(View, q)>
		//   43   84:return          
		}
	}

	public static class h
		implements b
	{

		public void a(e e1)
		{
			a.setCurrentItem(e1.c());
		//    0    0:aload_0         
		//    1    1:getfield        #18  <Field ViewPager a>
		//    2    4:aload_1         
		//    3    5:invokevirtual   #26  <Method int TabLayout$e.c()>
		//    4    8:invokevirtual   #32  <Method void ViewPager.setCurrentItem(int)>
		//    5   11:return          
		}

		public void b(e e1)
		{
		//    0    0:return          
		}

		public void c(e e1)
		{
		//    0    0:return          
		}

		private final ViewPager a;

		public h(ViewPager viewpager)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #16  <Method void Object()>
			a = viewpager;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #18  <Field ViewPager a>
		//    5    9:return          
		}
	}


	public TabLayout(Context context)
	{
		this(context, ((AttributeSet) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:invokespecial   #92  <Method void TabLayout(Context, AttributeSet)>
	//    4    6:return          
	}

	public TabLayout(Context context, AttributeSet attributeset)
	{
		this(context, attributeset, 0);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iconst_0        
	//    4    4:invokespecial   #95  <Method void TabLayout(Context, AttributeSet, int)>
	//    5    7:return          
	}

	public TabLayout(Context context, AttributeSet attributeset, int i1)
	{
		super(context, attributeset, i1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:invokespecial   #96  <Method void HorizontalScrollView(Context, AttributeSet, int)>
		o = new ArrayList();
	//    5    7:aload_0         
	//    6    8:new             #98  <Class ArrayList>
	//    7   11:dup             
	//    8   12:invokespecial   #100 <Method void ArrayList()>
	//    9   15:putfield        #102 <Field ArrayList o>
		j = 0x7fffffff;
	//   10   18:aload_0         
	//   11   19:ldc1            #103 <Int 0x7fffffff>
	//   12   21:putfield        #105 <Field int j>
		w = new ArrayList();
	//   13   24:aload_0         
	//   14   25:new             #98  <Class ArrayList>
	//   15   28:dup             
	//   16   29:invokespecial   #100 <Method void ArrayList()>
	//   17   32:putfield        #107 <Field ArrayList w>
		E = ((android.support.v4.f.k.a) (new android.support.v4.f.k.b(12)));
	//   18   35:aload_0         
	//   19   36:new             #109 <Class android.support.v4.f.k$b>
	//   20   39:dup             
	//   21   40:bipush          12
	//   22   42:invokespecial   #110 <Method void android.support.v4.f.k$b(int)>
	//   23   45:putfield        #112 <Field android.support.v4.f.k$a E>
		android.support.design.widget.n.a(context);
	//   24   48:aload_1         
	//   25   49:invokestatic    #116 <Method void n.a(Context)>
		setHorizontalScrollBarEnabled(false);
	//   26   52:aload_0         
	//   27   53:iconst_0        
	//   28   54:invokevirtual   #120 <Method void setHorizontalScrollBarEnabled(boolean)>
		q = new d(context);
	//   29   57:aload_0         
	//   30   58:new             #17  <Class TabLayout$d>
	//   31   61:dup             
	//   32   62:aload_0         
	//   33   63:aload_1         
	//   34   64:invokespecial   #123 <Method void TabLayout$d(TabLayout, Context)>
	//   35   67:putfield        #125 <Field TabLayout$d q>
		super.addView(((View) (q)), 0, ((android.view.ViewGroup.LayoutParams) (new android.widget.FrameLayout.LayoutParams(-2, -1))));
	//   36   70:aload_0         
	//   37   71:aload_0         
	//   38   72:getfield        #125 <Field TabLayout$d q>
	//   39   75:iconst_0        
	//   40   76:new             #127 <Class android.widget.FrameLayout$LayoutParams>
	//   41   79:dup             
	//   42   80:bipush          -2
	//   43   82:iconst_m1       
	//   44   83:invokespecial   #130 <Method void android.widget.FrameLayout$LayoutParams(int, int)>
	//   45   86:invokespecial   #134 <Method void HorizontalScrollView.addView(View, int, android.view.ViewGroup$LayoutParams)>
		attributeset = ((AttributeSet) (context.obtainStyledAttributes(attributeset, android.support.design.a.k.TabLayout, i1, android.support.design.a.j.Widget_Design_TabLayout)));
	//   46   89:aload_1         
	//   47   90:aload_2         
	//   48   91:getstatic       #140 <Field int[] android.support.design.a$k.TabLayout>
	//   49   94:iload_3         
	//   50   95:getstatic       #145 <Field int android.support.design.a$j.Widget_Design_TabLayout>
	//   51   98:invokevirtual   #151 <Method TypedArray Context.obtainStyledAttributes(AttributeSet, int[], int, int)>
	//   52  101:astore_2        
		q.b(((TypedArray) (attributeset)).getDimensionPixelSize(android.support.design.a.k.TabLayout_tabIndicatorHeight, 0));
	//   53  102:aload_0         
	//   54  103:getfield        #125 <Field TabLayout$d q>
	//   55  106:aload_2         
	//   56  107:getstatic       #154 <Field int android.support.design.a$k.TabLayout_tabIndicatorHeight>
	//   57  110:iconst_0        
	//   58  111:invokevirtual   #160 <Method int TypedArray.getDimensionPixelSize(int, int)>
	//   59  114:invokevirtual   #162 <Method void TabLayout$d.b(int)>
		q.a(((TypedArray) (attributeset)).getColor(android.support.design.a.k.TabLayout_tabIndicatorColor, 0));
	//   60  117:aload_0         
	//   61  118:getfield        #125 <Field TabLayout$d q>
	//   62  121:aload_2         
	//   63  122:getstatic       #165 <Field int android.support.design.a$k.TabLayout_tabIndicatorColor>
	//   64  125:iconst_0        
	//   65  126:invokevirtual   #168 <Method int TypedArray.getColor(int, int)>
	//   66  129:invokevirtual   #170 <Method void TabLayout$d.a(int)>
		i1 = ((TypedArray) (attributeset)).getDimensionPixelSize(android.support.design.a.k.TabLayout_tabPadding, 0);
	//   67  132:aload_2         
	//   68  133:getstatic       #173 <Field int android.support.design.a$k.TabLayout_tabPadding>
	//   69  136:iconst_0        
	//   70  137:invokevirtual   #160 <Method int TypedArray.getDimensionPixelSize(int, int)>
	//   71  140:istore_3        
		d = i1;
	//   72  141:aload_0         
	//   73  142:iload_3         
	//   74  143:putfield        #175 <Field int d>
		c = i1;
	//   75  146:aload_0         
	//   76  147:iload_3         
	//   77  148:putfield        #177 <Field int c>
		b = i1;
	//   78  151:aload_0         
	//   79  152:iload_3         
	//   80  153:putfield        #179 <Field int b>
		a = i1;
	//   81  156:aload_0         
	//   82  157:iload_3         
	//   83  158:putfield        #181 <Field int a>
		a = ((TypedArray) (attributeset)).getDimensionPixelSize(android.support.design.a.k.TabLayout_tabPaddingStart, a);
	//   84  161:aload_0         
	//   85  162:aload_2         
	//   86  163:getstatic       #184 <Field int android.support.design.a$k.TabLayout_tabPaddingStart>
	//   87  166:aload_0         
	//   88  167:getfield        #181 <Field int a>
	//   89  170:invokevirtual   #160 <Method int TypedArray.getDimensionPixelSize(int, int)>
	//   90  173:putfield        #181 <Field int a>
		b = ((TypedArray) (attributeset)).getDimensionPixelSize(android.support.design.a.k.TabLayout_tabPaddingTop, b);
	//   91  176:aload_0         
	//   92  177:aload_2         
	//   93  178:getstatic       #187 <Field int android.support.design.a$k.TabLayout_tabPaddingTop>
	//   94  181:aload_0         
	//   95  182:getfield        #179 <Field int b>
	//   96  185:invokevirtual   #160 <Method int TypedArray.getDimensionPixelSize(int, int)>
	//   97  188:putfield        #179 <Field int b>
		c = ((TypedArray) (attributeset)).getDimensionPixelSize(android.support.design.a.k.TabLayout_tabPaddingEnd, c);
	//   98  191:aload_0         
	//   99  192:aload_2         
	//  100  193:getstatic       #190 <Field int android.support.design.a$k.TabLayout_tabPaddingEnd>
	//  101  196:aload_0         
	//  102  197:getfield        #177 <Field int c>
	//  103  200:invokevirtual   #160 <Method int TypedArray.getDimensionPixelSize(int, int)>
	//  104  203:putfield        #177 <Field int c>
		d = ((TypedArray) (attributeset)).getDimensionPixelSize(android.support.design.a.k.TabLayout_tabPaddingBottom, d);
	//  105  206:aload_0         
	//  106  207:aload_2         
	//  107  208:getstatic       #193 <Field int android.support.design.a$k.TabLayout_tabPaddingBottom>
	//  108  211:aload_0         
	//  109  212:getfield        #175 <Field int d>
	//  110  215:invokevirtual   #160 <Method int TypedArray.getDimensionPixelSize(int, int)>
	//  111  218:putfield        #175 <Field int d>
		e = ((TypedArray) (attributeset)).getResourceId(android.support.design.a.k.TabLayout_tabTextAppearance, android.support.design.a.j.TextAppearance_Design_Tab);
	//  112  221:aload_0         
	//  113  222:aload_2         
	//  114  223:getstatic       #196 <Field int android.support.design.a$k.TabLayout_tabTextAppearance>
	//  115  226:getstatic       #199 <Field int android.support.design.a$j.TextAppearance_Design_Tab>
	//  116  229:invokevirtual   #202 <Method int TypedArray.getResourceId(int, int)>
	//  117  232:putfield        #204 <Field int e>
		context = ((Context) (context.obtainStyledAttributes(e, android.support.v7.a.a.j.TextAppearance)));
	//  118  235:aload_1         
	//  119  236:aload_0         
	//  120  237:getfield        #204 <Field int e>
	//  121  240:getstatic       #209 <Field int[] android.support.v7.a.a$j.TextAppearance>
	//  122  243:invokevirtual   #212 <Method TypedArray Context.obtainStyledAttributes(int, int[])>
	//  123  246:astore_1        
		g = ((TypedArray) (context)).getDimensionPixelSize(android.support.v7.a.a.j.TextAppearance_android_textSize, 0);
	//  124  247:aload_0         
	//  125  248:aload_1         
	//  126  249:getstatic       #215 <Field int android.support.v7.a.a$j.TextAppearance_android_textSize>
	//  127  252:iconst_0        
	//  128  253:invokevirtual   #160 <Method int TypedArray.getDimensionPixelSize(int, int)>
	//  129  256:i2f             
	//  130  257:putfield        #217 <Field float g>
		f = ((TypedArray) (context)).getColorStateList(android.support.v7.a.a.j.TextAppearance_android_textColor);
	//  131  260:aload_0         
	//  132  261:aload_1         
	//  133  262:getstatic       #220 <Field int android.support.v7.a.a$j.TextAppearance_android_textColor>
	//  134  265:invokevirtual   #224 <Method ColorStateList TypedArray.getColorStateList(int)>
	//  135  268:putfield        #226 <Field ColorStateList f>
		((TypedArray) (context)).recycle();
	//  136  271:aload_1         
	//  137  272:invokevirtual   #229 <Method void TypedArray.recycle()>
		if(((TypedArray) (attributeset)).hasValue(android.support.design.a.k.TabLayout_tabTextColor))
	//* 138  275:aload_2         
	//* 139  276:getstatic       #232 <Field int android.support.design.a$k.TabLayout_tabTextColor>
	//* 140  279:invokevirtual   #236 <Method boolean TypedArray.hasValue(int)>
	//* 141  282:ifeq            296
			f = ((TypedArray) (attributeset)).getColorStateList(android.support.design.a.k.TabLayout_tabTextColor);
	//  142  285:aload_0         
	//  143  286:aload_2         
	//  144  287:getstatic       #232 <Field int android.support.design.a$k.TabLayout_tabTextColor>
	//  145  290:invokevirtual   #224 <Method ColorStateList TypedArray.getColorStateList(int)>
	//  146  293:putfield        #226 <Field ColorStateList f>
		if(((TypedArray) (attributeset)).hasValue(android.support.design.a.k.TabLayout_tabSelectedTextColor))
	//* 147  296:aload_2         
	//* 148  297:getstatic       #239 <Field int android.support.design.a$k.TabLayout_tabSelectedTextColor>
	//* 149  300:invokevirtual   #236 <Method boolean TypedArray.hasValue(int)>
	//* 150  303:ifeq            330
		{
			i1 = ((TypedArray) (attributeset)).getColor(android.support.design.a.k.TabLayout_tabSelectedTextColor, 0);
	//  151  306:aload_2         
	//  152  307:getstatic       #239 <Field int android.support.design.a$k.TabLayout_tabSelectedTextColor>
	//  153  310:iconst_0        
	//  154  311:invokevirtual   #168 <Method int TypedArray.getColor(int, int)>
	//  155  314:istore_3        
			f = a(f.getDefaultColor(), i1);
	//  156  315:aload_0         
	//  157  316:aload_0         
	//  158  317:getfield        #226 <Field ColorStateList f>
	//  159  320:invokevirtual   #245 <Method int ColorStateList.getDefaultColor()>
	//  160  323:iload_3         
	//  161  324:invokestatic    #248 <Method ColorStateList a(int, int)>
	//  162  327:putfield        #226 <Field ColorStateList f>
		}
		r = ((TypedArray) (attributeset)).getDimensionPixelSize(android.support.design.a.k.TabLayout_tabMinWidth, -1);
	//  163  330:aload_0         
	//  164  331:aload_2         
	//  165  332:getstatic       #251 <Field int android.support.design.a$k.TabLayout_tabMinWidth>
	//  166  335:iconst_m1       
	//  167  336:invokevirtual   #160 <Method int TypedArray.getDimensionPixelSize(int, int)>
	//  168  339:putfield        #253 <Field int r>
		s = ((TypedArray) (attributeset)).getDimensionPixelSize(android.support.design.a.k.TabLayout_tabMaxWidth, -1);
	//  169  342:aload_0         
	//  170  343:aload_2         
	//  171  344:getstatic       #256 <Field int android.support.design.a$k.TabLayout_tabMaxWidth>
	//  172  347:iconst_m1       
	//  173  348:invokevirtual   #160 <Method int TypedArray.getDimensionPixelSize(int, int)>
	//  174  351:putfield        #258 <Field int s>
		i = ((TypedArray) (attributeset)).getResourceId(android.support.design.a.k.TabLayout_tabBackground, 0);
	//  175  354:aload_0         
	//  176  355:aload_2         
	//  177  356:getstatic       #261 <Field int android.support.design.a$k.TabLayout_tabBackground>
	//  178  359:iconst_0        
	//  179  360:invokevirtual   #202 <Method int TypedArray.getResourceId(int, int)>
	//  180  363:putfield        #263 <Field int i>
		u = ((TypedArray) (attributeset)).getDimensionPixelSize(android.support.design.a.k.TabLayout_tabContentStart, 0);
	//  181  366:aload_0         
	//  182  367:aload_2         
	//  183  368:getstatic       #266 <Field int android.support.design.a$k.TabLayout_tabContentStart>
	//  184  371:iconst_0        
	//  185  372:invokevirtual   #160 <Method int TypedArray.getDimensionPixelSize(int, int)>
	//  186  375:putfield        #268 <Field int u>
		l = ((TypedArray) (attributeset)).getInt(android.support.design.a.k.TabLayout_tabMode, 1);
	//  187  378:aload_0         
	//  188  379:aload_2         
	//  189  380:getstatic       #271 <Field int android.support.design.a$k.TabLayout_tabMode>
	//  190  383:iconst_1        
	//  191  384:invokevirtual   #274 <Method int TypedArray.getInt(int, int)>
	//  192  387:putfield        #276 <Field int l>
		k = ((TypedArray) (attributeset)).getInt(android.support.design.a.k.TabLayout_tabGravity, 0);
	//  193  390:aload_0         
	//  194  391:aload_2         
	//  195  392:getstatic       #279 <Field int android.support.design.a$k.TabLayout_tabGravity>
	//  196  395:iconst_0        
	//  197  396:invokevirtual   #274 <Method int TypedArray.getInt(int, int)>
	//  198  399:putfield        #281 <Field int k>
		((TypedArray) (attributeset)).recycle();
	//  199  402:aload_2         
	//  200  403:invokevirtual   #229 <Method void TypedArray.recycle()>
		context = ((Context) (getResources()));
	//  201  406:aload_0         
	//  202  407:invokevirtual   #285 <Method Resources getResources()>
	//  203  410:astore_1        
		h = ((Resources) (context)).getDimensionPixelSize(android.support.design.a.d.design_tab_text_size_2line);
	//  204  411:aload_0         
	//  205  412:aload_1         
	//  206  413:getstatic       #290 <Field int android.support.design.a$d.design_tab_text_size_2line>
	//  207  416:invokevirtual   #295 <Method int Resources.getDimensionPixelSize(int)>
	//  208  419:i2f             
	//  209  420:putfield        #297 <Field float h>
		t = ((Resources) (context)).getDimensionPixelSize(android.support.design.a.d.design_tab_scrollable_min_width);
	//  210  423:aload_0         
	//  211  424:aload_1         
	//  212  425:getstatic       #300 <Field int android.support.design.a$d.design_tab_scrollable_min_width>
	//  213  428:invokevirtual   #295 <Method int Resources.getDimensionPixelSize(int)>
	//  214  431:putfield        #302 <Field int t>
		g();
	//  215  434:aload_0         
	//  216  435:invokespecial   #304 <Method void g()>
		return;
	//  217  438:return          
		attributeset;
	//  218  439:astore_2        
		((TypedArray) (context)).recycle();
	//  219  440:aload_1         
	//  220  441:invokevirtual   #229 <Method void TypedArray.recycle()>
		throw attributeset;
	//  221  444:aload_2         
	//  222  445:athrow          
	}

	private int a(int i1, float f1)
	{
		int k1 = l;
	//    0    0:aload_0         
	//    1    1:getfield        #276 <Field int l>
	//    2    4:istore          4
		int j1 = 0;
	//    3    6:iconst_0        
	//    4    7:istore_3        
		if(k1 == 0)
	//*   5    8:iload           4
	//*   6   10:ifne            128
		{
			View view1 = q.getChildAt(i1);
	//    7   13:aload_0         
	//    8   14:getfield        #125 <Field TabLayout$d q>
	//    9   17:iload_1         
	//   10   18:invokevirtual   #309 <Method View TabLayout$d.getChildAt(int)>
	//   11   21:astore          6
			i1++;
	//   12   23:iload_1         
	//   13   24:iconst_1        
	//   14   25:iadd            
	//   15   26:istore_1        
			View view;
			if(i1 < q.getChildCount())
	//*  16   27:iload_1         
	//*  17   28:aload_0         
	//*  18   29:getfield        #125 <Field TabLayout$d q>
	//*  19   32:invokevirtual   #312 <Method int TabLayout$d.getChildCount()>
	//*  20   35:icmpge          51
				view = q.getChildAt(i1);
	//   21   38:aload_0         
	//   22   39:getfield        #125 <Field TabLayout$d q>
	//   23   42:iload_1         
	//   24   43:invokevirtual   #309 <Method View TabLayout$d.getChildAt(int)>
	//   25   46:astore          5
			else
	//*  26   48:goto            54
				view = null;
	//   27   51:aconst_null     
	//   28   52:astore          5
			if(view1 != null)
	//*  29   54:aload           6
	//*  30   56:ifnull          68
				i1 = view1.getWidth();
	//   31   59:aload           6
	//   32   61:invokevirtual   #317 <Method int View.getWidth()>
	//   33   64:istore_1        
			else
	//*  34   65:goto            70
				i1 = 0;
	//   35   68:iconst_0        
	//   36   69:istore_1        
			if(view != null)
	//*  37   70:aload           5
	//*  38   72:ifnull          81
				j1 = view.getWidth();
	//   39   75:aload           5
	//   40   77:invokevirtual   #317 <Method int View.getWidth()>
	//   41   80:istore_3        
			int l1 = (view1.getLeft() + i1 / 2) - getWidth() / 2;
	//   42   81:aload           6
	//   43   83:invokevirtual   #320 <Method int View.getLeft()>
	//   44   86:iload_1         
	//   45   87:iconst_2        
	//   46   88:idiv            
	//   47   89:iadd            
	//   48   90:aload_0         
	//   49   91:invokevirtual   #321 <Method int getWidth()>
	//   50   94:iconst_2        
	//   51   95:idiv            
	//   52   96:isub            
	//   53   97:istore          4
			i1 = (int)((float)(i1 + j1) * 0.5F * f1);
	//   54   99:iload_1         
	//   55  100:iload_3         
	//   56  101:iadd            
	//   57  102:i2f             
	//   58  103:ldc2            #322 <Float 0.5F>
	//   59  106:fmul            
	//   60  107:fload_2         
	//   61  108:fmul            
	//   62  109:f2i             
	//   63  110:istore_1        
			if(android.support.v4.view.s.e(((View) (this))) == 0)
	//*  64  111:aload_0         
	//*  65  112:invokestatic    #327 <Method int s.e(View)>
	//*  66  115:ifne            123
				return l1 + i1;
	//   67  118:iload           4
	//   68  120:iload_1         
	//   69  121:iadd            
	//   70  122:ireturn         
			else
				return l1 - i1;
	//   71  123:iload           4
	//   72  125:iload_1         
	//   73  126:isub            
	//   74  127:ireturn         
		} else
		{
			return 0;
	//   75  128:iconst_0        
	//   76  129:ireturn         
		}
	}

	private static ColorStateList a(int i1, int j1)
	{
		return new ColorStateList(new int[][] {
			SELECTED_STATE_SET, EMPTY_STATE_SET
		}, new int[] {
			j1, i1
		});
	//    0    0:new             #241 <Class ColorStateList>
	//    1    3:dup             
	//    2    4:iconst_2        
	//    3    5:anewarray       int[][]
	//    4    8:dup             
	//    5    9:iconst_0        
	//    6   10:getstatic       #331 <Field int[] SELECTED_STATE_SET>
	//    7   13:aastore         
	//    8   14:dup             
	//    9   15:iconst_1        
	//   10   16:getstatic       #334 <Field int[] EMPTY_STATE_SET>
	//   11   19:aastore         
	//   12   20:iconst_2        
	//   13   21:newarray        int[]
	//   14   23:dup             
	//   15   24:iconst_0        
	//   16   25:iload_1         
	//   17   26:iastore         
	//   18   27:dup             
	//   19   28:iconst_1        
	//   20   29:iload_0         
	//   21   30:iastore         
	//   22   31:invokespecial   #337 <Method void ColorStateList(int[][], int[])>
	//   23   34:areturn         
	}

	private void a(TabItem tabitem)
	{
		e e1 = a();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #341 <Method TabLayout$e a()>
	//    2    4:astore_2        
		if(tabitem.a != null)
	//*   3    5:aload_1         
	//*   4    6:getfield        #346 <Field CharSequence TabItem.a>
	//*   5    9:ifnull          21
			e1.a(tabitem.a);
	//    6   12:aload_2         
	//    7   13:aload_1         
	//    8   14:getfield        #346 <Field CharSequence TabItem.a>
	//    9   17:invokevirtual   #349 <Method TabLayout$e TabLayout$e.a(CharSequence)>
	//   10   20:pop             
		if(tabitem.b != null)
	//*  11   21:aload_1         
	//*  12   22:getfield        #352 <Field Drawable TabItem.b>
	//*  13   25:ifnull          37
			e1.a(tabitem.b);
	//   14   28:aload_2         
	//   15   29:aload_1         
	//   16   30:getfield        #352 <Field Drawable TabItem.b>
	//   17   33:invokevirtual   #355 <Method TabLayout$e TabLayout$e.a(Drawable)>
	//   18   36:pop             
		if(tabitem.c != 0)
	//*  19   37:aload_1         
	//*  20   38:getfield        #356 <Field int TabItem.c>
	//*  21   41:ifeq            53
			e1.a(tabitem.c);
	//   22   44:aload_2         
	//   23   45:aload_1         
	//   24   46:getfield        #356 <Field int TabItem.c>
	//   25   49:invokevirtual   #359 <Method TabLayout$e TabLayout$e.a(int)>
	//   26   52:pop             
		if(!TextUtils.isEmpty(tabitem.getContentDescription()))
	//*  27   53:aload_1         
	//*  28   54:invokevirtual   #363 <Method CharSequence TabItem.getContentDescription()>
	//*  29   57:invokestatic    #369 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  30   60:ifne            72
			e1.b(tabitem.getContentDescription());
	//   31   63:aload_2         
	//   32   64:aload_1         
	//   33   65:invokevirtual   #363 <Method CharSequence TabItem.getContentDescription()>
	//   34   68:invokevirtual   #371 <Method TabLayout$e TabLayout$e.b(CharSequence)>
	//   35   71:pop             
		a(e1);
	//   36   72:aload_0         
	//   37   73:aload_2         
	//   38   74:invokevirtual   #374 <Method void a(TabLayout$e)>
	//   39   77:return          
	}

	private void a(e e1, int i1)
	{
		e1.b(i1);
	//    0    0:aload_1         
	//    1    1:iload_2         
	//    2    2:invokevirtual   #376 <Method void TabLayout$e.b(int)>
		o.add(i1, ((Object) (e1)));
	//    3    5:aload_0         
	//    4    6:getfield        #102 <Field ArrayList o>
	//    5    9:iload_2         
	//    6   10:aload_1         
	//    7   11:invokevirtual   #380 <Method void ArrayList.add(int, Object)>
		int j1 = o.size();
	//    8   14:aload_0         
	//    9   15:getfield        #102 <Field ArrayList o>
	//   10   18:invokevirtual   #383 <Method int ArrayList.size()>
	//   11   21:istore_3        
		do
		{
			i1++;
	//   12   22:iload_2         
	//   13   23:iconst_1        
	//   14   24:iadd            
	//   15   25:istore_2        
			if(i1 < j1)
	//*  16   26:iload_2         
	//*  17   27:iload_3         
	//*  18   28:icmpge          49
				((e)o.get(i1)).b(i1);
	//   19   31:aload_0         
	//   20   32:getfield        #102 <Field ArrayList o>
	//   21   35:iload_2         
	//   22   36:invokevirtual   #387 <Method Object ArrayList.get(int)>
	//   23   39:checkcast       #24  <Class TabLayout$e>
	//   24   42:iload_2         
	//   25   43:invokevirtual   #376 <Method void TabLayout$e.b(int)>
			else
	//*  26   46:goto            22
				return;
	//   27   49:return          
		} while(true);
	}

	private void a(ViewPager viewpager, boolean flag, boolean flag1)
	{
		if(m != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #390 <Field ViewPager m>
	//*   2    4:ifnull          43
		{
			if(B != null)
	//*   3    7:aload_0         
	//*   4    8:getfield        #392 <Field TabLayout$f B>
	//*   5   11:ifnull          25
				m.b(((android.support.v4.view.ViewPager.e) (B)));
	//    6   14:aload_0         
	//    7   15:getfield        #390 <Field ViewPager m>
	//    8   18:aload_0         
	//    9   19:getfield        #392 <Field TabLayout$f B>
	//   10   22:invokevirtual   #397 <Method void ViewPager.b(android.support.v4.view.ViewPager$e)>
			if(C != null)
	//*  11   25:aload_0         
	//*  12   26:getfield        #399 <Field TabLayout$a C>
	//*  13   29:ifnull          43
				m.b(((android.support.v4.view.ViewPager.d) (C)));
	//   14   32:aload_0         
	//   15   33:getfield        #390 <Field ViewPager m>
	//   16   36:aload_0         
	//   17   37:getfield        #399 <Field TabLayout$a C>
	//   18   40:invokevirtual   #402 <Method void ViewPager.b(android.support.v4.view.ViewPager$d)>
		}
		if(x != null)
	//*  19   43:aload_0         
	//*  20   44:getfield        #404 <Field TabLayout$b x>
	//*  21   47:ifnull          63
		{
			b(x);
	//   22   50:aload_0         
	//   23   51:aload_0         
	//   24   52:getfield        #404 <Field TabLayout$b x>
	//   25   55:invokevirtual   #407 <Method void b(TabLayout$b)>
			x = null;
	//   26   58:aload_0         
	//   27   59:aconst_null     
	//   28   60:putfield        #404 <Field TabLayout$b x>
		}
		if(viewpager != null)
	//*  29   63:aload_1         
	//*  30   64:ifnull          192
		{
			m = viewpager;
	//   31   67:aload_0         
	//   32   68:aload_1         
	//   33   69:putfield        #390 <Field ViewPager m>
			if(B == null)
	//*  34   72:aload_0         
	//*  35   73:getfield        #392 <Field TabLayout$f B>
	//*  36   76:ifnonnull       91
				B = new f(this);
	//   37   79:aload_0         
	//   38   80:new             #27  <Class TabLayout$f>
	//   39   83:dup             
	//   40   84:aload_0         
	//   41   85:invokespecial   #410 <Method void TabLayout$f(TabLayout)>
	//   42   88:putfield        #392 <Field TabLayout$f B>
			B.a();
	//   43   91:aload_0         
	//   44   92:getfield        #392 <Field TabLayout$f B>
	//   45   95:invokevirtual   #412 <Method void TabLayout$f.a()>
			viewpager.a(((android.support.v4.view.ViewPager.e) (B)));
	//   46   98:aload_1         
	//   47   99:aload_0         
	//   48  100:getfield        #392 <Field TabLayout$f B>
	//   49  103:invokevirtual   #414 <Method void ViewPager.a(android.support.v4.view.ViewPager$e)>
			x = ((b) (new h(viewpager)));
	//   50  106:aload_0         
	//   51  107:new             #33  <Class TabLayout$h>
	//   52  110:dup             
	//   53  111:aload_1         
	//   54  112:invokespecial   #417 <Method void TabLayout$h(ViewPager)>
	//   55  115:putfield        #404 <Field TabLayout$b x>
			a(x);
	//   56  118:aload_0         
	//   57  119:aload_0         
	//   58  120:getfield        #404 <Field TabLayout$b x>
	//   59  123:invokevirtual   #419 <Method void a(TabLayout$b)>
			p p1 = viewpager.getAdapter();
	//   60  126:aload_1         
	//   61  127:invokevirtual   #423 <Method p ViewPager.getAdapter()>
	//   62  130:astore          4
			if(p1 != null)
	//*  63  132:aload           4
	//*  64  134:ifnull          144
				a(p1, flag);
	//   65  137:aload_0         
	//   66  138:aload           4
	//   67  140:iload_2         
	//   68  141:invokevirtual   #426 <Method void a(p, boolean)>
			if(C == null)
	//*  69  144:aload_0         
	//*  70  145:getfield        #399 <Field TabLayout$a C>
	//*  71  148:ifnonnull       163
				C = new a();
	//   72  151:aload_0         
	//   73  152:new             #8   <Class TabLayout$a>
	//   74  155:dup             
	//   75  156:aload_0         
	//   76  157:invokespecial   #427 <Method void TabLayout$a(TabLayout)>
	//   77  160:putfield        #399 <Field TabLayout$a C>
			C.a(flag);
	//   78  163:aload_0         
	//   79  164:getfield        #399 <Field TabLayout$a C>
	//   80  167:iload_2         
	//   81  168:invokevirtual   #429 <Method void TabLayout$a.a(boolean)>
			viewpager.a(((android.support.v4.view.ViewPager.d) (C)));
	//   82  171:aload_1         
	//   83  172:aload_0         
	//   84  173:getfield        #399 <Field TabLayout$a C>
	//   85  176:invokevirtual   #431 <Method void ViewPager.a(android.support.v4.view.ViewPager$d)>
			a(viewpager.getCurrentItem(), 0.0F, true);
	//   86  179:aload_0         
	//   87  180:aload_1         
	//   88  181:invokevirtual   #434 <Method int ViewPager.getCurrentItem()>
	//   89  184:fconst_0        
	//   90  185:iconst_1        
	//   91  186:invokevirtual   #437 <Method void a(int, float, boolean)>
		} else
	//*  92  189:goto            203
		{
			m = null;
	//   93  192:aload_0         
	//   94  193:aconst_null     
	//   95  194:putfield        #390 <Field ViewPager m>
			a(((p) (null)), false);
	//   96  197:aload_0         
	//   97  198:aconst_null     
	//   98  199:iconst_0        
	//   99  200:invokevirtual   #426 <Method void a(p, boolean)>
		}
		D = flag1;
	//  100  203:aload_0         
	//  101  204:iload_3         
	//  102  205:putfield        #439 <Field boolean D>
	//  103  208:return          
	}

	private void a(View view)
	{
		if(view instanceof TabItem)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #343 <Class TabItem>
	//*   2    4:ifeq            16
		{
			a((TabItem)view);
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:checkcast       #343 <Class TabItem>
	//    6   12:invokespecial   #442 <Method void a(TabItem)>
			return;
	//    7   15:return          
		} else
		{
			throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");
	//    8   16:new             #444 <Class IllegalArgumentException>
	//    9   19:dup             
	//   10   20:ldc2            #446 <String "Only TabItem instances can be added to TabLayout">
	//   11   23:invokespecial   #449 <Method void IllegalArgumentException(String)>
	//   12   26:athrow          
		}
	}

	private void a(android.widget.LinearLayout.LayoutParams layoutparams)
	{
		float f1;
		if(l == 1 && k == 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #276 <Field int l>
	//*   2    4:iconst_1        
	//*   3    5:icmpne          25
	//*   4    8:aload_0         
	//*   5    9:getfield        #281 <Field int k>
	//*   6   12:ifne            25
		{
			layoutparams.width = 0;
	//    7   15:aload_1         
	//    8   16:iconst_0        
	//    9   17:putfield        #455 <Field int android.widget.LinearLayout$LayoutParams.width>
			f1 = 1.0F;
	//   10   20:fconst_1        
	//   11   21:fstore_2        
		} else
	//*  12   22:goto            33
		{
			layoutparams.width = -2;
	//   13   25:aload_1         
	//   14   26:bipush          -2
	//   15   28:putfield        #455 <Field int android.widget.LinearLayout$LayoutParams.width>
			f1 = 0.0F;
	//   16   31:fconst_0        
	//   17   32:fstore_2        
		}
		layoutparams.weight = f1;
	//   18   33:aload_1         
	//   19   34:fload_2         
	//   20   35:putfield        #458 <Field float android.widget.LinearLayout$LayoutParams.weight>
	//   21   38:return          
	}

	private g c(e e1)
	{
		g g1;
		if(E != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #112 <Field android.support.v4.f.k$a E>
	//*   2    4:ifnull          23
			g1 = (g)E.a();
	//    3    7:aload_0         
	//    4    8:getfield        #112 <Field android.support.v4.f.k$a E>
	//    5   11:invokeinterface #464 <Method Object android.support.v4.f.k$a.a()>
	//    6   16:checkcast       #30  <Class TabLayout$g>
	//    7   19:astore_2        
		else
	//*   8   20:goto            25
			g1 = null;
	//    9   23:aconst_null     
	//   10   24:astore_2        
		g g2 = g1;
	//   11   25:aload_2         
	//   12   26:astore_3        
		if(g1 == null)
	//*  13   27:aload_2         
	//*  14   28:ifnonnull       44
			g2 = new g(getContext());
	//   15   31:new             #30  <Class TabLayout$g>
	//   16   34:dup             
	//   17   35:aload_0         
	//   18   36:aload_0         
	//   19   37:invokevirtual   #468 <Method Context getContext()>
	//   20   40:invokespecial   #469 <Method void TabLayout$g(TabLayout, Context)>
	//   21   43:astore_3        
		g2.a(e1);
	//   22   44:aload_3         
	//   23   45:aload_1         
	//   24   46:invokevirtual   #470 <Method void TabLayout$g.a(TabLayout$e)>
		g2.setFocusable(true);
	//   25   49:aload_3         
	//   26   50:iconst_1        
	//   27   51:invokevirtual   #473 <Method void TabLayout$g.setFocusable(boolean)>
		g2.setMinimumWidth(getTabMinWidth());
	//   28   54:aload_3         
	//   29   55:aload_0         
	//   30   56:invokespecial   #476 <Method int getTabMinWidth()>
	//   31   59:invokevirtual   #479 <Method void TabLayout$g.setMinimumWidth(int)>
		return g2;
	//   32   62:aload_3         
	//   33   63:areturn         
	}

	private void c(int i1)
	{
		g g1 = (g)q.getChildAt(i1);
	//    0    0:aload_0         
	//    1    1:getfield        #125 <Field TabLayout$d q>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #309 <Method View TabLayout$d.getChildAt(int)>
	//    4    8:checkcast       #30  <Class TabLayout$g>
	//    5   11:astore_2        
		q.removeViewAt(i1);
	//    6   12:aload_0         
	//    7   13:getfield        #125 <Field TabLayout$d q>
	//    8   16:iload_1         
	//    9   17:invokevirtual   #482 <Method void TabLayout$d.removeViewAt(int)>
		if(g1 != null)
	//*  10   20:aload_2         
	//*  11   21:ifnull          39
		{
			g1.a();
	//   12   24:aload_2         
	//   13   25:invokevirtual   #483 <Method void TabLayout$g.a()>
			E.a(((Object) (g1)));
	//   14   28:aload_0         
	//   15   29:getfield        #112 <Field android.support.v4.f.k$a E>
	//   16   32:aload_2         
	//   17   33:invokeinterface #486 <Method boolean android.support.v4.f.k$a.a(Object)>
	//   18   38:pop             
		}
		requestLayout();
	//   19   39:aload_0         
	//   20   40:invokevirtual   #489 <Method void requestLayout()>
	//   21   43:return          
	}

	private void d()
	{
		int j1 = o.size();
	//    0    0:aload_0         
	//    1    1:getfield        #102 <Field ArrayList o>
	//    2    4:invokevirtual   #383 <Method int ArrayList.size()>
	//    3    7:istore_2        
		for(int i1 = 0; i1 < j1; i1++)
	//*   4    8:iconst_0        
	//*   5    9:istore_1        
	//*   6   10:iload_1         
	//*   7   11:iload_2         
	//*   8   12:icmpge          36
			((e)o.get(i1)).h();
	//    9   15:aload_0         
	//   10   16:getfield        #102 <Field ArrayList o>
	//   11   19:iload_1         
	//   12   20:invokevirtual   #387 <Method Object ArrayList.get(int)>
	//   13   23:checkcast       #24  <Class TabLayout$e>
	//   14   26:invokevirtual   #491 <Method void TabLayout$e.h()>

	//   15   29:iload_1         
	//   16   30:iconst_1        
	//   17   31:iadd            
	//   18   32:istore_1        
	//*  19   33:goto            10
	//   20   36:return          
	}

	private void d(int i1)
	{
		if(i1 == -1)
	//*   0    0:iload_1         
	//*   1    1:iconst_m1       
	//*   2    2:icmpne          6
			return;
	//    3    5:return          
		if(getWindowToken() != null && android.support.v4.view.s.x(((View) (this))) && !q.a())
	//*   4    6:aload_0         
	//*   5    7:invokevirtual   #495 <Method android.os.IBinder getWindowToken()>
	//*   6   10:ifnull          91
	//*   7   13:aload_0         
	//*   8   14:invokestatic    #498 <Method boolean s.x(View)>
	//*   9   17:ifeq            91
	//*  10   20:aload_0         
	//*  11   21:getfield        #125 <Field TabLayout$d q>
	//*  12   24:invokevirtual   #501 <Method boolean TabLayout$d.a()>
	//*  13   27:ifeq            33
	//*  14   30:goto            91
		{
			int j1 = getScrollX();
	//   15   33:aload_0         
	//   16   34:invokevirtual   #504 <Method int getScrollX()>
	//   17   37:istore_2        
			int k1 = a(i1, 0.0F);
	//   18   38:aload_0         
	//   19   39:iload_1         
	//   20   40:fconst_0        
	//   21   41:invokespecial   #506 <Method int a(int, float)>
	//   22   44:istore_3        
			if(j1 != k1)
	//*  23   45:iload_2         
	//*  24   46:iload_3         
	//*  25   47:icmpeq          79
			{
				f();
	//   26   50:aload_0         
	//   27   51:invokespecial   #508 <Method void f()>
				y.setIntValues(new int[] {
					j1, k1
				});
	//   28   54:aload_0         
	//   29   55:getfield        #510 <Field ValueAnimator y>
	//   30   58:iconst_2        
	//   31   59:newarray        int[]
	//   32   61:dup             
	//   33   62:iconst_0        
	//   34   63:iload_2         
	//   35   64:iastore         
	//   36   65:dup             
	//   37   66:iconst_1        
	//   38   67:iload_3         
	//   39   68:iastore         
	//   40   69:invokevirtual   #516 <Method void ValueAnimator.setIntValues(int[])>
				y.start();
	//   41   72:aload_0         
	//   42   73:getfield        #510 <Field ValueAnimator y>
	//   43   76:invokevirtual   #519 <Method void ValueAnimator.start()>
			}
			q.b(i1, 300);
	//   44   79:aload_0         
	//   45   80:getfield        #125 <Field TabLayout$d q>
	//   46   83:iload_1         
	//   47   84:sipush          300
	//   48   87:invokevirtual   #521 <Method void TabLayout$d.b(int, int)>
			return;
	//   49   90:return          
		} else
		{
			a(i1, 0.0F, true);
	//   50   91:aload_0         
	//   51   92:iload_1         
	//   52   93:fconst_0        
	//   53   94:iconst_1        
	//   54   95:invokevirtual   #437 <Method void a(int, float, boolean)>
			return;
	//   55   98:return          
		}
	}

	private void d(e e1)
	{
		g g1 = e1.b;
	//    0    0:aload_1         
	//    1    1:getfield        #524 <Field TabLayout$g TabLayout$e.b>
	//    2    4:astore_2        
		q.addView(((View) (g1)), e1.c(), ((android.view.ViewGroup.LayoutParams) (e())));
	//    3    5:aload_0         
	//    4    6:getfield        #125 <Field TabLayout$d q>
	//    5    9:aload_2         
	//    6   10:aload_1         
	//    7   11:invokevirtual   #526 <Method int TabLayout$e.c()>
	//    8   14:aload_0         
	//    9   15:invokespecial   #529 <Method android.widget.LinearLayout$LayoutParams e()>
	//   10   18:invokevirtual   #530 <Method void TabLayout$d.addView(View, int, android.view.ViewGroup$LayoutParams)>
	//   11   21:return          
	}

	private android.widget.LinearLayout.LayoutParams e()
	{
		android.widget.LinearLayout.LayoutParams layoutparams = new android.widget.LinearLayout.LayoutParams(-2, -1);
	//    0    0:new             #452 <Class android.widget.LinearLayout$LayoutParams>
	//    1    3:dup             
	//    2    4:bipush          -2
	//    3    6:iconst_m1       
	//    4    7:invokespecial   #531 <Method void android.widget.LinearLayout$LayoutParams(int, int)>
	//    5   10:astore_1        
		a(layoutparams);
	//    6   11:aload_0         
	//    7   12:aload_1         
	//    8   13:invokespecial   #533 <Method void a(android.widget.LinearLayout$LayoutParams)>
		return layoutparams;
	//    9   16:aload_1         
	//   10   17:areturn         
	}

	private void e(e e1)
	{
		for(int i1 = w.size() - 1; i1 >= 0; i1--)
	//*   0    0:aload_0         
	//*   1    1:getfield        #107 <Field ArrayList w>
	//*   2    4:invokevirtual   #383 <Method int ArrayList.size()>
	//*   3    7:iconst_1        
	//*   4    8:isub            
	//*   5    9:istore_2        
	//*   6   10:iload_2         
	//*   7   11:iflt            38
			((b)w.get(i1)).a(e1);
	//    8   14:aload_0         
	//    9   15:getfield        #107 <Field ArrayList w>
	//   10   18:iload_2         
	//   11   19:invokevirtual   #387 <Method Object ArrayList.get(int)>
	//   12   22:checkcast       #11  <Class TabLayout$b>
	//   13   25:aload_1         
	//   14   26:invokeinterface #534 <Method void TabLayout$b.a(TabLayout$e)>

	//   15   31:iload_2         
	//   16   32:iconst_1        
	//   17   33:isub            
	//   18   34:istore_2        
	//*  19   35:goto            10
	//   20   38:return          
	}

	private void f()
	{
		if(y == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #510 <Field ValueAnimator y>
	//*   2    4:ifnonnull       54
		{
			y = new ValueAnimator();
	//    3    7:aload_0         
	//    4    8:new             #512 <Class ValueAnimator>
	//    5   11:dup             
	//    6   12:invokespecial   #535 <Method void ValueAnimator()>
	//    7   15:putfield        #510 <Field ValueAnimator y>
			y.setInterpolator(((android.animation.TimeInterpolator) (android.support.design.widget.a.b)));
	//    8   18:aload_0         
	//    9   19:getfield        #510 <Field ValueAnimator y>
	//   10   22:getstatic       #540 <Field android.view.animation.Interpolator a.b>
	//   11   25:invokevirtual   #544 <Method void ValueAnimator.setInterpolator(android.animation.TimeInterpolator)>
			y.setDuration(300L);
	//   12   28:aload_0         
	//   13   29:getfield        #510 <Field ValueAnimator y>
	//   14   32:ldc2w           #545 <Long 300L>
	//   15   35:invokevirtual   #550 <Method ValueAnimator ValueAnimator.setDuration(long)>
	//   16   38:pop             
			y.addUpdateListener(new android.animation.ValueAnimator.AnimatorUpdateListener() {

				public void onAnimationUpdate(ValueAnimator valueanimator)
				{
					a.scrollTo(((Integer)valueanimator.getAnimatedValue()).intValue(), 0);
				//    0    0:aload_0         
				//    1    1:getfield        #17  <Field TabLayout a>
				//    2    4:aload_1         
				//    3    5:invokevirtual   #28  <Method Object ValueAnimator.getAnimatedValue()>
				//    4    8:checkcast       #30  <Class Integer>
				//    5   11:invokevirtual   #34  <Method int Integer.intValue()>
				//    6   14:iconst_0        
				//    7   15:invokevirtual   #38  <Method void TabLayout.scrollTo(int, int)>
				//    8   18:return          
				}

				final TabLayout a;

			
			{
				a = TabLayout.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field TabLayout a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
			}
);
	//   17   39:aload_0         
	//   18   40:getfield        #510 <Field ValueAnimator y>
	//   19   43:new             #6   <Class TabLayout$1>
	//   20   46:dup             
	//   21   47:aload_0         
	//   22   48:invokespecial   #551 <Method void TabLayout$1(TabLayout)>
	//   23   51:invokevirtual   #555 <Method void ValueAnimator.addUpdateListener(android.animation.ValueAnimator$AnimatorUpdateListener)>
		}
	//   24   54:return          
	}

	private void f(e e1)
	{
		for(int i1 = w.size() - 1; i1 >= 0; i1--)
	//*   0    0:aload_0         
	//*   1    1:getfield        #107 <Field ArrayList w>
	//*   2    4:invokevirtual   #383 <Method int ArrayList.size()>
	//*   3    7:iconst_1        
	//*   4    8:isub            
	//*   5    9:istore_2        
	//*   6   10:iload_2         
	//*   7   11:iflt            38
			((b)w.get(i1)).b(e1);
	//    8   14:aload_0         
	//    9   15:getfield        #107 <Field ArrayList w>
	//   10   18:iload_2         
	//   11   19:invokevirtual   #387 <Method Object ArrayList.get(int)>
	//   12   22:checkcast       #11  <Class TabLayout$b>
	//   13   25:aload_1         
	//   14   26:invokeinterface #557 <Method void TabLayout$b.b(TabLayout$e)>

	//   15   31:iload_2         
	//   16   32:iconst_1        
	//   17   33:isub            
	//   18   34:istore_2        
	//*  19   35:goto            10
	//   20   38:return          
	}

	private void g()
	{
		int i1;
		if(l == 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #276 <Field int l>
	//*   2    4:ifne            24
			i1 = Math.max(0, u - a);
	//    3    7:iconst_0        
	//    4    8:aload_0         
	//    5    9:getfield        #268 <Field int u>
	//    6   12:aload_0         
	//    7   13:getfield        #181 <Field int a>
	//    8   16:isub            
	//    9   17:invokestatic    #562 <Method int Math.max(int, int)>
	//   10   20:istore_1        
		else
	//*  11   21:goto            26
			i1 = 0;
	//   12   24:iconst_0        
	//   13   25:istore_1        
		android.support.v4.view.s.b(((View) (q)), i1, 0, 0, 0);
	//   14   26:aload_0         
	//   15   27:getfield        #125 <Field TabLayout$d q>
	//   16   30:iload_1         
	//   17   31:iconst_0        
	//   18   32:iconst_0        
	//   19   33:iconst_0        
	//   20   34:invokestatic    #565 <Method void s.b(View, int, int, int, int)>
		switch(l)
	//*  21   37:aload_0         
	//*  22   38:getfield        #276 <Field int l>
		{
	//*  23   41:tableswitch     0 1: default 64
	//	               0 78
	//	               1 67
	//*  24   64:goto            88
		case 1: // '\001'
			q.setGravity(1);
	//   25   67:aload_0         
	//   26   68:getfield        #125 <Field TabLayout$d q>
	//   27   71:iconst_1        
	//   28   72:invokevirtual   #568 <Method void TabLayout$d.setGravity(int)>
			break;

	//*  29   75:goto            88
		case 0: // '\0'
			q.setGravity(0x800003);
	//   30   78:aload_0         
	//   31   79:getfield        #125 <Field TabLayout$d q>
	//   32   82:ldc2            #569 <Int 0x800003>
	//   33   85:invokevirtual   #568 <Method void TabLayout$d.setGravity(int)>
			break;
		}
		a(true);
	//   34   88:aload_0         
	//   35   89:iconst_1        
	//   36   90:invokevirtual   #570 <Method void a(boolean)>
	//   37   93:return          
	}

	private void g(e e1)
	{
		for(int i1 = w.size() - 1; i1 >= 0; i1--)
	//*   0    0:aload_0         
	//*   1    1:getfield        #107 <Field ArrayList w>
	//*   2    4:invokevirtual   #383 <Method int ArrayList.size()>
	//*   3    7:iconst_1        
	//*   4    8:isub            
	//*   5    9:istore_2        
	//*   6   10:iload_2         
	//*   7   11:iflt            38
			((b)w.get(i1)).c(e1);
	//    8   14:aload_0         
	//    9   15:getfield        #107 <Field ArrayList w>
	//   10   18:iload_2         
	//   11   19:invokevirtual   #387 <Method Object ArrayList.get(int)>
	//   12   22:checkcast       #11  <Class TabLayout$b>
	//   13   25:aload_1         
	//   14   26:invokeinterface #572 <Method void TabLayout$b.c(TabLayout$e)>

	//   15   31:iload_2         
	//   16   32:iconst_1        
	//   17   33:isub            
	//   18   34:istore_2        
	//*  19   35:goto            10
	//   20   38:return          
	}

	private int getDefaultHeight()
	{
		int j1 = o.size();
	//    0    0:aload_0         
	//    1    1:getfield        #102 <Field ArrayList o>
	//    2    4:invokevirtual   #383 <Method int ArrayList.size()>
	//    3    7:istore          4
		boolean flag1 = false;
	//    4    9:iconst_0        
	//    5   10:istore_3        
		int i1 = 0;
	//    6   11:iconst_0        
	//    7   12:istore_1        
		boolean flag;
		do
		{
			flag = flag1;
	//    8   13:iload_3         
	//    9   14:istore_2        
			if(i1 >= j1)
				break;
	//   10   15:iload_1         
	//   11   16:iload           4
	//   12   18:icmpge          70
			e e1 = (e)o.get(i1);
	//   13   21:aload_0         
	//   14   22:getfield        #102 <Field ArrayList o>
	//   15   25:iload_1         
	//   16   26:invokevirtual   #387 <Method Object ArrayList.get(int)>
	//   17   29:checkcast       #24  <Class TabLayout$e>
	//   18   32:astore          5
			if(e1 != null && e1.b() != null && !TextUtils.isEmpty(e1.d()))
	//*  19   34:aload           5
	//*  20   36:ifnull          63
	//*  21   39:aload           5
	//*  22   41:invokevirtual   #576 <Method Drawable TabLayout$e.b()>
	//*  23   44:ifnull          63
	//*  24   47:aload           5
	//*  25   49:invokevirtual   #578 <Method CharSequence TabLayout$e.d()>
	//*  26   52:invokestatic    #369 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  27   55:ifne            63
			{
				flag = true;
	//   28   58:iconst_1        
	//   29   59:istore_2        
				break;
	//   30   60:goto            70
			}
			i1++;
	//   31   63:iload_1         
	//   32   64:iconst_1        
	//   33   65:iadd            
	//   34   66:istore_1        
		} while(true);
	//   35   67:goto            13
		return !flag ? 48 : 72;
	//   36   70:iload_2         
	//   37   71:ifeq            77
	//   38   74:bipush          72
	//   39   76:ireturn         
	//   40   77:bipush          48
	//   41   79:ireturn         
	}

	private float getScrollPosition()
	{
		return q.b();
	//    0    0:aload_0         
	//    1    1:getfield        #125 <Field TabLayout$d q>
	//    2    4:invokevirtual   #582 <Method float TabLayout$d.b()>
	//    3    7:freturn         
	}

	private int getTabMinWidth()
	{
		if(r != -1)
	//*   0    0:aload_0         
	//*   1    1:getfield        #253 <Field int r>
	//*   2    4:iconst_m1       
	//*   3    5:icmpeq          13
			return r;
	//    4    8:aload_0         
	//    5    9:getfield        #253 <Field int r>
	//    6   12:ireturn         
		if(l == 0)
	//*   7   13:aload_0         
	//*   8   14:getfield        #276 <Field int l>
	//*   9   17:ifne            25
			return t;
	//   10   20:aload_0         
	//   11   21:getfield        #302 <Field int t>
	//   12   24:ireturn         
		else
			return 0;
	//   13   25:iconst_0        
	//   14   26:ireturn         
	}

	private int getTabScrollRange()
	{
		return Math.max(0, q.getWidth() - getWidth() - getPaddingLeft() - getPaddingRight());
	//    0    0:iconst_0        
	//    1    1:aload_0         
	//    2    2:getfield        #125 <Field TabLayout$d q>
	//    3    5:invokevirtual   #584 <Method int TabLayout$d.getWidth()>
	//    4    8:aload_0         
	//    5    9:invokevirtual   #321 <Method int getWidth()>
	//    6   12:isub            
	//    7   13:aload_0         
	//    8   14:invokevirtual   #587 <Method int getPaddingLeft()>
	//    9   17:isub            
	//   10   18:aload_0         
	//   11   19:invokevirtual   #590 <Method int getPaddingRight()>
	//   12   22:isub            
	//   13   23:invokestatic    #562 <Method int Math.max(int, int)>
	//   14   26:ireturn         
	}

	private void setSelectedTabView(int i1)
	{
		int k1 = q.getChildCount();
	//    0    0:aload_0         
	//    1    1:getfield        #125 <Field TabLayout$d q>
	//    2    4:invokevirtual   #312 <Method int TabLayout$d.getChildCount()>
	//    3    7:istore_3        
		if(i1 < k1)
	//*   4    8:iload_1         
	//*   5    9:iload_3         
	//*   6   10:icmpge          58
		{
			for(int j1 = 0; j1 < k1; j1++)
	//*   7   13:iconst_0        
	//*   8   14:istore_2        
	//*   9   15:iload_2         
	//*  10   16:iload_3         
	//*  11   17:icmpge          58
			{
				View view = q.getChildAt(j1);
	//   12   20:aload_0         
	//   13   21:getfield        #125 <Field TabLayout$d q>
	//   14   24:iload_2         
	//   15   25:invokevirtual   #309 <Method View TabLayout$d.getChildAt(int)>
	//   16   28:astore          5
				boolean flag;
				if(j1 == i1)
	//*  17   30:iload_2         
	//*  18   31:iload_1         
	//*  19   32:icmpne          41
					flag = true;
	//   20   35:iconst_1        
	//   21   36:istore          4
				else
	//*  22   38:goto            44
					flag = false;
	//   23   41:iconst_0        
	//   24   42:istore          4
				view.setSelected(flag);
	//   25   44:aload           5
	//   26   46:iload           4
	//   27   48:invokevirtual   #594 <Method void View.setSelected(boolean)>
			}

	//   28   51:iload_2         
	//   29   52:iconst_1        
	//   30   53:iadd            
	//   31   54:istore_2        
		}
	//*  32   55:goto            15
	//   33   58:return          
	}

	public e a()
	{
		e e2 = (e)n.a();
	//    0    0:getstatic       #87  <Field android.support.v4.f.k$a n>
	//    1    3:invokeinterface #464 <Method Object android.support.v4.f.k$a.a()>
	//    2    8:checkcast       #24  <Class TabLayout$e>
	//    3   11:astore_2        
		e e1 = e2;
	//    4   12:aload_2         
	//    5   13:astore_1        
		if(e2 == null)
	//*   6   14:aload_2         
	//*   7   15:ifnonnull       26
			e1 = new e();
	//    8   18:new             #24  <Class TabLayout$e>
	//    9   21:dup             
	//   10   22:invokespecial   #595 <Method void TabLayout$e()>
	//   11   25:astore_1        
		e1.a = this;
	//   12   26:aload_1         
	//   13   27:aload_0         
	//   14   28:putfield        #598 <Field TabLayout TabLayout$e.a>
		e1.b = c(e1);
	//   15   31:aload_1         
	//   16   32:aload_0         
	//   17   33:aload_1         
	//   18   34:invokespecial   #600 <Method TabLayout$g c(TabLayout$e)>
	//   19   37:putfield        #524 <Field TabLayout$g TabLayout$e.b>
		return e1;
	//   20   40:aload_1         
	//   21   41:areturn         
	}

	public e a(int i1)
	{
		if(i1 >= 0 && i1 < getTabCount())
	//*   0    0:iload_1         
	//*   1    1:iflt            27
	//*   2    4:iload_1         
	//*   3    5:aload_0         
	//*   4    6:invokevirtual   #603 <Method int getTabCount()>
	//*   5    9:icmplt          15
	//*   6   12:goto            27
			return (e)o.get(i1);
	//    7   15:aload_0         
	//    8   16:getfield        #102 <Field ArrayList o>
	//    9   19:iload_1         
	//   10   20:invokevirtual   #387 <Method Object ArrayList.get(int)>
	//   11   23:checkcast       #24  <Class TabLayout$e>
	//   12   26:areturn         
		else
			return null;
	//   13   27:aconst_null     
	//   14   28:areturn         
	}

	public void a(int i1, float f1, boolean flag)
	{
		a(i1, f1, flag, true);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:fload_2         
	//    3    3:iload_3         
	//    4    4:iconst_1        
	//    5    5:invokevirtual   #606 <Method void a(int, float, boolean, boolean)>
	//    6    8:return          
	}

	void a(int i1, float f1, boolean flag, boolean flag1)
	{
		int j1 = Math.round((float)i1 + f1);
	//    0    0:iload_1         
	//    1    1:i2f             
	//    2    2:fload_2         
	//    3    3:fadd            
	//    4    4:invokestatic    #610 <Method int Math.round(float)>
	//    5    7:istore          5
		if(j1 >= 0)
	//*   6    9:iload           5
	//*   7   11:iflt            86
		{
			if(j1 >= q.getChildCount())
	//*   8   14:iload           5
	//*   9   16:aload_0         
	//*  10   17:getfield        #125 <Field TabLayout$d q>
	//*  11   20:invokevirtual   #312 <Method int TabLayout$d.getChildCount()>
	//*  12   23:icmplt          27
				return;
	//   13   26:return          
			if(flag1)
	//*  14   27:iload           4
	//*  15   29:ifeq            41
				q.a(i1, f1);
	//   16   32:aload_0         
	//   17   33:getfield        #125 <Field TabLayout$d q>
	//   18   36:iload_1         
	//   19   37:fload_2         
	//   20   38:invokevirtual   #613 <Method void TabLayout$d.a(int, float)>
			if(y != null && y.isRunning())
	//*  21   41:aload_0         
	//*  22   42:getfield        #510 <Field ValueAnimator y>
	//*  23   45:ifnull          65
	//*  24   48:aload_0         
	//*  25   49:getfield        #510 <Field ValueAnimator y>
	//*  26   52:invokevirtual   #616 <Method boolean ValueAnimator.isRunning()>
	//*  27   55:ifeq            65
				y.cancel();
	//   28   58:aload_0         
	//   29   59:getfield        #510 <Field ValueAnimator y>
	//   30   62:invokevirtual   #619 <Method void ValueAnimator.cancel()>
			scrollTo(a(i1, f1), 0);
	//   31   65:aload_0         
	//   32   66:aload_0         
	//   33   67:iload_1         
	//   34   68:fload_2         
	//   35   69:invokespecial   #506 <Method int a(int, float)>
	//   36   72:iconst_0        
	//   37   73:invokevirtual   #622 <Method void scrollTo(int, int)>
			if(flag)
	//*  38   76:iload_3         
	//*  39   77:ifeq            86
				setSelectedTabView(j1);
	//   40   80:aload_0         
	//   41   81:iload           5
	//   42   83:invokespecial   #624 <Method void setSelectedTabView(int)>
		}
	//   43   86:return          
	}

	public void a(b b1)
	{
		if(!w.contains(((Object) (b1))))
	//*   0    0:aload_0         
	//*   1    1:getfield        #107 <Field ArrayList w>
	//*   2    4:aload_1         
	//*   3    5:invokevirtual   #627 <Method boolean ArrayList.contains(Object)>
	//*   4    8:ifne            20
			w.add(((Object) (b1)));
	//    5   11:aload_0         
	//    6   12:getfield        #107 <Field ArrayList w>
	//    7   15:aload_1         
	//    8   16:invokevirtual   #629 <Method boolean ArrayList.add(Object)>
	//    9   19:pop             
	//   10   20:return          
	}

	public void a(e e1)
	{
		a(e1, o.isEmpty());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_0         
	//    3    3:getfield        #102 <Field ArrayList o>
	//    4    6:invokevirtual   #631 <Method boolean ArrayList.isEmpty()>
	//    5    9:invokevirtual   #634 <Method void a(TabLayout$e, boolean)>
	//    6   12:return          
	}

	public void a(e e1, int i1, boolean flag)
	{
		if(e1.a != this)
	//*   0    0:aload_1         
	//*   1    1:getfield        #598 <Field TabLayout TabLayout$e.a>
	//*   2    4:aload_0         
	//*   3    5:if_acmpeq       19
			throw new IllegalArgumentException("Tab belongs to a different TabLayout.");
	//    4    8:new             #444 <Class IllegalArgumentException>
	//    5   11:dup             
	//    6   12:ldc2            #637 <String "Tab belongs to a different TabLayout.">
	//    7   15:invokespecial   #449 <Method void IllegalArgumentException(String)>
	//    8   18:athrow          
		a(e1, i1);
	//    9   19:aload_0         
	//   10   20:aload_1         
	//   11   21:iload_2         
	//   12   22:invokespecial   #639 <Method void a(TabLayout$e, int)>
		d(e1);
	//   13   25:aload_0         
	//   14   26:aload_1         
	//   15   27:invokespecial   #641 <Method void d(TabLayout$e)>
		if(flag)
	//*  16   30:iload_3         
	//*  17   31:ifeq            38
			e1.e();
	//   18   34:aload_1         
	//   19   35:invokevirtual   #643 <Method void TabLayout$e.e()>
	//   20   38:return          
	}

	public void a(e e1, boolean flag)
	{
		a(e1, o.size(), flag);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_0         
	//    3    3:getfield        #102 <Field ArrayList o>
	//    4    6:invokevirtual   #383 <Method int ArrayList.size()>
	//    5    9:iload_2         
	//    6   10:invokevirtual   #645 <Method void a(TabLayout$e, int, boolean)>
	//    7   13:return          
	}

	public void a(ViewPager viewpager, boolean flag)
	{
		a(viewpager, flag, false);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:iconst_0        
	//    4    4:invokespecial   #648 <Method void a(ViewPager, boolean, boolean)>
	//    5    7:return          
	}

	void a(p p1, boolean flag)
	{
		if(z != null && A != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #650 <Field p z>
	//*   2    4:ifnull          25
	//*   3    7:aload_0         
	//*   4    8:getfield        #652 <Field DataSetObserver A>
	//*   5   11:ifnull          25
			z.unregisterDataSetObserver(A);
	//    6   14:aload_0         
	//    7   15:getfield        #650 <Field p z>
	//    8   18:aload_0         
	//    9   19:getfield        #652 <Field DataSetObserver A>
	//   10   22:invokevirtual   #658 <Method void p.unregisterDataSetObserver(DataSetObserver)>
		z = p1;
	//   11   25:aload_0         
	//   12   26:aload_1         
	//   13   27:putfield        #650 <Field p z>
		if(flag && p1 != null)
	//*  14   30:iload_2         
	//*  15   31:ifeq            65
	//*  16   34:aload_1         
	//*  17   35:ifnull          65
		{
			if(A == null)
	//*  18   38:aload_0         
	//*  19   39:getfield        #652 <Field DataSetObserver A>
	//*  20   42:ifnonnull       57
				A = ((DataSetObserver) (new c()));
	//   21   45:aload_0         
	//   22   46:new             #14  <Class TabLayout$c>
	//   23   49:dup             
	//   24   50:aload_0         
	//   25   51:invokespecial   #659 <Method void TabLayout$c(TabLayout)>
	//   26   54:putfield        #652 <Field DataSetObserver A>
			p1.registerDataSetObserver(A);
	//   27   57:aload_1         
	//   28   58:aload_0         
	//   29   59:getfield        #652 <Field DataSetObserver A>
	//   30   62:invokevirtual   #662 <Method void p.registerDataSetObserver(DataSetObserver)>
		}
		c();
	//   31   65:aload_0         
	//   32   66:invokevirtual   #664 <Method void c()>
	//   33   69:return          
	}

	void a(boolean flag)
	{
		for(int i1 = 0; i1 < q.getChildCount(); i1++)
	//*   0    0:iconst_0        
	//*   1    1:istore_2        
	//*   2    2:iload_2         
	//*   3    3:aload_0         
	//*   4    4:getfield        #125 <Field TabLayout$d q>
	//*   5    7:invokevirtual   #312 <Method int TabLayout$d.getChildCount()>
	//*   6   10:icmpge          56
		{
			View view = q.getChildAt(i1);
	//    7   13:aload_0         
	//    8   14:getfield        #125 <Field TabLayout$d q>
	//    9   17:iload_2         
	//   10   18:invokevirtual   #309 <Method View TabLayout$d.getChildAt(int)>
	//   11   21:astore_3        
			view.setMinimumWidth(getTabMinWidth());
	//   12   22:aload_3         
	//   13   23:aload_0         
	//   14   24:invokespecial   #476 <Method int getTabMinWidth()>
	//   15   27:invokevirtual   #665 <Method void View.setMinimumWidth(int)>
			a((android.widget.LinearLayout.LayoutParams)view.getLayoutParams());
	//   16   30:aload_0         
	//   17   31:aload_3         
	//   18   32:invokevirtual   #669 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   19   35:checkcast       #452 <Class android.widget.LinearLayout$LayoutParams>
	//   20   38:invokespecial   #533 <Method void a(android.widget.LinearLayout$LayoutParams)>
			if(flag)
	//*  21   41:iload_1         
	//*  22   42:ifeq            49
				view.requestLayout();
	//   23   45:aload_3         
	//   24   46:invokevirtual   #670 <Method void View.requestLayout()>
		}

	//   25   49:iload_2         
	//   26   50:iconst_1        
	//   27   51:iadd            
	//   28   52:istore_2        
	//*  29   53:goto            2
	//   30   56:return          
	}

	public void addView(View view)
	{
		a(view);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #672 <Method void a(View)>
	//    3    5:return          
	}

	public void addView(View view, int i1)
	{
		a(view);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #672 <Method void a(View)>
	//    3    5:return          
	}

	public void addView(View view, int i1, android.view.ViewGroup.LayoutParams layoutparams)
	{
		a(view);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #672 <Method void a(View)>
	//    3    5:return          
	}

	public void addView(View view, android.view.ViewGroup.LayoutParams layoutparams)
	{
		a(view);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #672 <Method void a(View)>
	//    3    5:return          
	}

	int b(int i1)
	{
		return Math.round(getResources().getDisplayMetrics().density * (float)i1);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #285 <Method Resources getResources()>
	//    2    4:invokevirtual   #678 <Method DisplayMetrics Resources.getDisplayMetrics()>
	//    3    7:getfield        #683 <Field float DisplayMetrics.density>
	//    4   10:iload_1         
	//    5   11:i2f             
	//    6   12:fmul            
	//    7   13:invokestatic    #610 <Method int Math.round(float)>
	//    8   16:ireturn         
	}

	public void b()
	{
		for(int i1 = q.getChildCount() - 1; i1 >= 0; i1--)
	//*   0    0:aload_0         
	//*   1    1:getfield        #125 <Field TabLayout$d q>
	//*   2    4:invokevirtual   #312 <Method int TabLayout$d.getChildCount()>
	//*   3    7:iconst_1        
	//*   4    8:isub            
	//*   5    9:istore_1        
	//*   6   10:iload_1         
	//*   7   11:iflt            26
			c(i1);
	//    8   14:aload_0         
	//    9   15:iload_1         
	//   10   16:invokespecial   #685 <Method void c(int)>

	//   11   19:iload_1         
	//   12   20:iconst_1        
	//   13   21:isub            
	//   14   22:istore_1        
	//*  15   23:goto            10
		e e1;
		for(Iterator iterator = o.iterator(); iterator.hasNext(); n.a(((Object) (e1))))
	//*  16   26:aload_0         
	//*  17   27:getfield        #102 <Field ArrayList o>
	//*  18   30:invokevirtual   #689 <Method Iterator ArrayList.iterator()>
	//*  19   33:astore_2        
	//*  20   34:aload_2         
	//*  21   35:invokeinterface #694 <Method boolean Iterator.hasNext()>
	//*  22   40:ifeq            76
		{
			e1 = (e)iterator.next();
	//   23   43:aload_2         
	//   24   44:invokeinterface #697 <Method Object Iterator.next()>
	//   25   49:checkcast       #24  <Class TabLayout$e>
	//   26   52:astore_3        
			iterator.remove();
	//   27   53:aload_2         
	//   28   54:invokeinterface #700 <Method void Iterator.remove()>
			e1.i();
	//   29   59:aload_3         
	//   30   60:invokevirtual   #702 <Method void TabLayout$e.i()>
		}

	//   31   63:getstatic       #87  <Field android.support.v4.f.k$a n>
	//   32   66:aload_3         
	//   33   67:invokeinterface #486 <Method boolean android.support.v4.f.k$a.a(Object)>
	//   34   72:pop             
	//*  35   73:goto            34
		p = null;
	//   36   76:aload_0         
	//   37   77:aconst_null     
	//   38   78:putfield        #704 <Field TabLayout$e p>
	//   39   81:return          
	}

	public void b(b b1)
	{
		w.remove(((Object) (b1)));
	//    0    0:aload_0         
	//    1    1:getfield        #107 <Field ArrayList w>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #706 <Method boolean ArrayList.remove(Object)>
	//    4    8:pop             
	//    5    9:return          
	}

	void b(e e1)
	{
		b(e1, true);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_1        
	//    3    3:invokevirtual   #708 <Method void b(TabLayout$e, boolean)>
	//    4    6:return          
	}

	void b(e e1, boolean flag)
	{
		e e2 = p;
	//    0    0:aload_0         
	//    1    1:getfield        #704 <Field TabLayout$e p>
	//    2    4:astore          4
		if(e2 == e1)
	//*   3    6:aload           4
	//*   4    8:aload_1         
	//*   5    9:if_acmpne       31
		{
			if(e2 != null)
	//*   6   12:aload           4
	//*   7   14:ifnull          118
			{
				g(e1);
	//    8   17:aload_0         
	//    9   18:aload_1         
	//   10   19:invokespecial   #710 <Method void g(TabLayout$e)>
				d(e1.c());
	//   11   22:aload_0         
	//   12   23:aload_1         
	//   13   24:invokevirtual   #526 <Method int TabLayout$e.c()>
	//   14   27:invokespecial   #712 <Method void d(int)>
				return;
	//   15   30:return          
			}
		} else
		{
			int i1;
			if(e1 != null)
	//*  16   31:aload_1         
	//*  17   32:ifnull          43
				i1 = e1.c();
	//   18   35:aload_1         
	//   19   36:invokevirtual   #526 <Method int TabLayout$e.c()>
	//   20   39:istore_3        
			else
	//*  21   40:goto            45
				i1 = -1;
	//   22   43:iconst_m1       
	//   23   44:istore_3        
			if(flag)
	//*  24   45:iload_2         
	//*  25   46:ifeq            93
			{
				if((e2 == null || e2.c() == -1) && i1 != -1)
	//*  26   49:aload           4
	//*  27   51:ifnull          63
	//*  28   54:aload           4
	//*  29   56:invokevirtual   #526 <Method int TabLayout$e.c()>
	//*  30   59:iconst_m1       
	//*  31   60:icmpne          78
	//*  32   63:iload_3         
	//*  33   64:iconst_m1       
	//*  34   65:icmpeq          78
					a(i1, 0.0F, true);
	//   35   68:aload_0         
	//   36   69:iload_3         
	//   37   70:fconst_0        
	//   38   71:iconst_1        
	//   39   72:invokevirtual   #437 <Method void a(int, float, boolean)>
				else
	//*  40   75:goto            83
					d(i1);
	//   41   78:aload_0         
	//   42   79:iload_3         
	//   43   80:invokespecial   #712 <Method void d(int)>
				if(i1 != -1)
	//*  44   83:iload_3         
	//*  45   84:iconst_m1       
	//*  46   85:icmpeq          93
					setSelectedTabView(i1);
	//   47   88:aload_0         
	//   48   89:iload_3         
	//   49   90:invokespecial   #624 <Method void setSelectedTabView(int)>
			}
			if(e2 != null)
	//*  50   93:aload           4
	//*  51   95:ifnull          104
				f(e2);
	//   52   98:aload_0         
	//   53   99:aload           4
	//   54  101:invokespecial   #714 <Method void f(TabLayout$e)>
			p = e1;
	//   55  104:aload_0         
	//   56  105:aload_1         
	//   57  106:putfield        #704 <Field TabLayout$e p>
			if(e1 != null)
	//*  58  109:aload_1         
	//*  59  110:ifnull          118
				e(e1);
	//   60  113:aload_0         
	//   61  114:aload_1         
	//   62  115:invokespecial   #716 <Method void e(TabLayout$e)>
		}
	//   63  118:return          
	}

	void c()
	{
		b();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #718 <Method void b()>
		if(z != null)
	//*   2    4:aload_0         
	//*   3    5:getfield        #650 <Field p z>
	//*   4    8:ifnull          97
		{
			int k1 = z.getCount();
	//    5   11:aload_0         
	//    6   12:getfield        #650 <Field p z>
	//    7   15:invokevirtual   #721 <Method int p.getCount()>
	//    8   18:istore_2        
			for(int i1 = 0; i1 < k1; i1++)
	//*   9   19:iconst_0        
	//*  10   20:istore_1        
	//*  11   21:iload_1         
	//*  12   22:iload_2         
	//*  13   23:icmpge          53
				a(a().a(z.getPageTitle(i1)), false);
	//   14   26:aload_0         
	//   15   27:aload_0         
	//   16   28:invokevirtual   #341 <Method TabLayout$e a()>
	//   17   31:aload_0         
	//   18   32:getfield        #650 <Field p z>
	//   19   35:iload_1         
	//   20   36:invokevirtual   #725 <Method CharSequence p.getPageTitle(int)>
	//   21   39:invokevirtual   #349 <Method TabLayout$e TabLayout$e.a(CharSequence)>
	//   22   42:iconst_0        
	//   23   43:invokevirtual   #634 <Method void a(TabLayout$e, boolean)>

	//   24   46:iload_1         
	//   25   47:iconst_1        
	//   26   48:iadd            
	//   27   49:istore_1        
	//*  28   50:goto            21
			if(m != null && k1 > 0)
	//*  29   53:aload_0         
	//*  30   54:getfield        #390 <Field ViewPager m>
	//*  31   57:ifnull          97
	//*  32   60:iload_2         
	//*  33   61:ifle            97
			{
				int j1 = m.getCurrentItem();
	//   34   64:aload_0         
	//   35   65:getfield        #390 <Field ViewPager m>
	//   36   68:invokevirtual   #434 <Method int ViewPager.getCurrentItem()>
	//   37   71:istore_1        
				if(j1 != getSelectedTabPosition() && j1 < getTabCount())
	//*  38   72:iload_1         
	//*  39   73:aload_0         
	//*  40   74:invokevirtual   #728 <Method int getSelectedTabPosition()>
	//*  41   77:icmpeq          97
	//*  42   80:iload_1         
	//*  43   81:aload_0         
	//*  44   82:invokevirtual   #603 <Method int getTabCount()>
	//*  45   85:icmpge          97
					b(a(j1));
	//   46   88:aload_0         
	//   47   89:aload_0         
	//   48   90:iload_1         
	//   49   91:invokevirtual   #729 <Method TabLayout$e a(int)>
	//   50   94:invokevirtual   #730 <Method void b(TabLayout$e)>
			}
		}
	//   51   97:return          
	}

	public volatile android.view.ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeset)
	{
		return ((android.view.ViewGroup.LayoutParams) (generateLayoutParams(attributeset)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #735 <Method android.widget.FrameLayout$LayoutParams generateLayoutParams(AttributeSet)>
	//    3    5:areturn         
	}

	public android.widget.FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeset)
	{
		return generateDefaultLayoutParams();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #739 <Method android.widget.FrameLayout$LayoutParams generateDefaultLayoutParams()>
	//    2    4:areturn         
	}

	public int getSelectedTabPosition()
	{
		if(p != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #704 <Field TabLayout$e p>
	//*   2    4:ifnull          15
			return p.c();
	//    3    7:aload_0         
	//    4    8:getfield        #704 <Field TabLayout$e p>
	//    5   11:invokevirtual   #526 <Method int TabLayout$e.c()>
	//    6   14:ireturn         
		else
			return -1;
	//    7   15:iconst_m1       
	//    8   16:ireturn         
	}

	public int getTabCount()
	{
		return o.size();
	//    0    0:aload_0         
	//    1    1:getfield        #102 <Field ArrayList o>
	//    2    4:invokevirtual   #383 <Method int ArrayList.size()>
	//    3    7:ireturn         
	}

	public int getTabGravity()
	{
		return k;
	//    0    0:aload_0         
	//    1    1:getfield        #281 <Field int k>
	//    2    4:ireturn         
	}

	int getTabMaxWidth()
	{
		return j;
	//    0    0:aload_0         
	//    1    1:getfield        #105 <Field int j>
	//    2    4:ireturn         
	}

	public int getTabMode()
	{
		return l;
	//    0    0:aload_0         
	//    1    1:getfield        #276 <Field int l>
	//    2    4:ireturn         
	}

	public ColorStateList getTabTextColors()
	{
		return f;
	//    0    0:aload_0         
	//    1    1:getfield        #226 <Field ColorStateList f>
	//    2    4:areturn         
	}

	protected void onAttachedToWindow()
	{
		super.onAttachedToWindow();
	//    0    0:aload_0         
	//    1    1:invokespecial   #747 <Method void HorizontalScrollView.onAttachedToWindow()>
		if(m == null)
	//*   2    4:aload_0         
	//*   3    5:getfield        #390 <Field ViewPager m>
	//*   4    8:ifnonnull       33
		{
			android.view.ViewParent viewparent = getParent();
	//    5   11:aload_0         
	//    6   12:invokevirtual   #751 <Method android.view.ViewParent getParent()>
	//    7   15:astore_1        
			if(viewparent instanceof ViewPager)
	//*   8   16:aload_1         
	//*   9   17:instanceof      #394 <Class ViewPager>
	//*  10   20:ifeq            33
				a((ViewPager)viewparent, true, true);
	//   11   23:aload_0         
	//   12   24:aload_1         
	//   13   25:checkcast       #394 <Class ViewPager>
	//   14   28:iconst_1        
	//   15   29:iconst_1        
	//   16   30:invokespecial   #648 <Method void a(ViewPager, boolean, boolean)>
		}
	//   17   33:return          
	}

	protected void onDetachedFromWindow()
	{
		super.onDetachedFromWindow();
	//    0    0:aload_0         
	//    1    1:invokespecial   #754 <Method void HorizontalScrollView.onDetachedFromWindow()>
		if(D)
	//*   2    4:aload_0         
	//*   3    5:getfield        #439 <Field boolean D>
	//*   4    8:ifeq            21
		{
			setupWithViewPager(((ViewPager) (null)));
	//    5   11:aload_0         
	//    6   12:aconst_null     
	//    7   13:invokevirtual   #757 <Method void setupWithViewPager(ViewPager)>
			D = false;
	//    8   16:aload_0         
	//    9   17:iconst_0        
	//   10   18:putfield        #439 <Field boolean D>
		}
	//   11   21:return          
	}

	protected void onMeasure(int i1, int j1)
	{
		View view;
		int k1 = b(getDefaultHeight()) + getPaddingTop() + getPaddingBottom();
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokespecial   #760 <Method int getDefaultHeight()>
	//    3    5:invokevirtual   #762 <Method int b(int)>
	//    4    8:aload_0         
	//    5    9:invokevirtual   #765 <Method int getPaddingTop()>
	//    6   12:iadd            
	//    7   13:aload_0         
	//    8   14:invokevirtual   #768 <Method int getPaddingBottom()>
	//    9   17:iadd            
	//   10   18:istore_3        
		int l1 = android.view.View.MeasureSpec.getMode(j1);
	//   11   19:iload_2         
	//   12   20:invokestatic    #773 <Method int android.view.View$MeasureSpec.getMode(int)>
	//   13   23:istore          4
		if(l1 != 0x80000000)
	//*  14   25:iload           4
	//*  15   27:ldc2            #774 <Int 0x80000000>
	//*  16   30:icmpeq          52
		{
			if(l1 == 0)
	//*  17   33:iload           4
	//*  18   35:ifeq            41
	//*  19   38:goto            67
				j1 = android.view.View.MeasureSpec.makeMeasureSpec(k1, 0x40000000);
	//   20   41:iload_3         
	//   21   42:ldc2            #775 <Int 0x40000000>
	//   22   45:invokestatic    #778 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//   23   48:istore_2        
		} else
	//*  24   49:goto            67
		{
			j1 = android.view.View.MeasureSpec.makeMeasureSpec(Math.min(k1, android.view.View.MeasureSpec.getSize(j1)), 0x40000000);
	//   25   52:iload_3         
	//   26   53:iload_2         
	//   27   54:invokestatic    #781 <Method int android.view.View$MeasureSpec.getSize(int)>
	//   28   57:invokestatic    #784 <Method int Math.min(int, int)>
	//   29   60:ldc2            #775 <Int 0x40000000>
	//   30   63:invokestatic    #778 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//   31   66:istore_2        
		}
		k1 = android.view.View.MeasureSpec.getSize(i1);
	//   32   67:iload_1         
	//   33   68:invokestatic    #781 <Method int android.view.View$MeasureSpec.getSize(int)>
	//   34   71:istore_3        
		if(android.view.View.MeasureSpec.getMode(i1) != 0)
	//*  35   72:iload_1         
	//*  36   73:invokestatic    #773 <Method int android.view.View$MeasureSpec.getMode(int)>
	//*  37   76:ifeq            108
		{
			if(s > 0)
	//*  38   79:aload_0         
	//*  39   80:getfield        #258 <Field int s>
	//*  40   83:ifle            94
				k1 = s;
	//   41   86:aload_0         
	//   42   87:getfield        #258 <Field int s>
	//   43   90:istore_3        
			else
	//*  44   91:goto            103
				k1 -= b(56);
	//   45   94:iload_3         
	//   46   95:aload_0         
	//   47   96:bipush          56
	//   48   98:invokevirtual   #762 <Method int b(int)>
	//   49  101:isub            
	//   50  102:istore_3        
			j = k1;
	//   51  103:aload_0         
	//   52  104:iload_3         
	//   53  105:putfield        #105 <Field int j>
		}
		super.onMeasure(i1, j1);
	//   54  108:aload_0         
	//   55  109:iload_1         
	//   56  110:iload_2         
	//   57  111:invokespecial   #786 <Method void HorizontalScrollView.onMeasure(int, int)>
		if(getChildCount() != 1)
			break MISSING_BLOCK_LABEL_233;
	//   58  114:aload_0         
	//   59  115:invokevirtual   #787 <Method int getChildCount()>
	//   60  118:iconst_1        
	//   61  119:icmpne          233
		i1 = 0;
	//   62  122:iconst_0        
	//   63  123:istore_1        
		view = getChildAt(0);
	//   64  124:aload_0         
	//   65  125:iconst_0        
	//   66  126:invokevirtual   #788 <Method View getChildAt(int)>
	//   67  129:astore          5
		l;
	//   68  131:aload_0         
	//   69  132:getfield        #276 <Field int l>
		JVM INSTR tableswitch 0 1: default 156
	//	               0 176
	//	               1 159;
	//   70  135:tableswitch     0 1: default 156
	//	               0 176
	//	               1 159
		   goto _L1 _L2 _L3
_L1:
		break; /* Loop/switch isn't completed */
	//   71  156:goto            191
_L3:
		if(view.getMeasuredWidth() == getMeasuredWidth())
			break; /* Loop/switch isn't completed */
	//   72  159:aload           5
	//   73  161:invokevirtual   #791 <Method int View.getMeasuredWidth()>
	//   74  164:aload_0         
	//   75  165:invokevirtual   #792 <Method int getMeasuredWidth()>
	//   76  168:icmpeq          191
_L4:
		i1 = 1;
	//   77  171:iconst_1        
	//   78  172:istore_1        
		break; /* Loop/switch isn't completed */
	//   79  173:goto            191
_L2:
		if(view.getMeasuredWidth() >= getMeasuredWidth()) goto _L5; else goto _L4
	//   80  176:aload           5
	//   81  178:invokevirtual   #791 <Method int View.getMeasuredWidth()>
	//   82  181:aload_0         
	//   83  182:invokevirtual   #792 <Method int getMeasuredWidth()>
	//   84  185:icmpge          191
	//*  85  188:goto            171
_L5:
		if(i1 != 0)
	//*  86  191:iload_1         
	//*  87  192:ifeq            233
		{
			i1 = getChildMeasureSpec(j1, getPaddingTop() + getPaddingBottom(), view.getLayoutParams().height);
	//   88  195:iload_2         
	//   89  196:aload_0         
	//   90  197:invokevirtual   #765 <Method int getPaddingTop()>
	//   91  200:aload_0         
	//   92  201:invokevirtual   #768 <Method int getPaddingBottom()>
	//   93  204:iadd            
	//   94  205:aload           5
	//   95  207:invokevirtual   #669 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   96  210:getfield        #797 <Field int android.view.ViewGroup$LayoutParams.height>
	//   97  213:invokestatic    #801 <Method int getChildMeasureSpec(int, int, int)>
	//   98  216:istore_1        
			view.measure(android.view.View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0x40000000), i1);
	//   99  217:aload           5
	//  100  219:aload_0         
	//  101  220:invokevirtual   #792 <Method int getMeasuredWidth()>
	//  102  223:ldc2            #775 <Int 0x40000000>
	//  103  226:invokestatic    #778 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//  104  229:iload_1         
	//  105  230:invokevirtual   #804 <Method void View.measure(int, int)>
		}
	//  106  233:return          
	}

	public void setOnTabSelectedListener(b b1)
	{
		if(v != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #808 <Field TabLayout$b v>
	//*   2    4:ifnull          15
			b(v);
	//    3    7:aload_0         
	//    4    8:aload_0         
	//    5    9:getfield        #808 <Field TabLayout$b v>
	//    6   12:invokevirtual   #407 <Method void b(TabLayout$b)>
		v = b1;
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:putfield        #808 <Field TabLayout$b v>
		if(b1 != null)
	//*  10   20:aload_1         
	//*  11   21:ifnull          29
			a(b1);
	//   12   24:aload_0         
	//   13   25:aload_1         
	//   14   26:invokevirtual   #419 <Method void a(TabLayout$b)>
	//   15   29:return          
	}

	void setScrollAnimatorListener(android.animation.Animator.AnimatorListener animatorlistener)
	{
		f();
	//    0    0:aload_0         
	//    1    1:invokespecial   #508 <Method void f()>
		y.addListener(animatorlistener);
	//    2    4:aload_0         
	//    3    5:getfield        #510 <Field ValueAnimator y>
	//    4    8:aload_1         
	//    5    9:invokevirtual   #814 <Method void ValueAnimator.addListener(android.animation.Animator$AnimatorListener)>
	//    6   12:return          
	}

	public void setSelectedTabIndicatorColor(int i1)
	{
		q.a(i1);
	//    0    0:aload_0         
	//    1    1:getfield        #125 <Field TabLayout$d q>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #170 <Method void TabLayout$d.a(int)>
	//    4    8:return          
	}

	public void setSelectedTabIndicatorHeight(int i1)
	{
		q.b(i1);
	//    0    0:aload_0         
	//    1    1:getfield        #125 <Field TabLayout$d q>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #162 <Method void TabLayout$d.b(int)>
	//    4    8:return          
	}

	public void setTabGravity(int i1)
	{
		if(k != i1)
	//*   0    0:aload_0         
	//*   1    1:getfield        #281 <Field int k>
	//*   2    4:iload_1         
	//*   3    5:icmpeq          17
		{
			k = i1;
	//    4    8:aload_0         
	//    5    9:iload_1         
	//    6   10:putfield        #281 <Field int k>
			g();
	//    7   13:aload_0         
	//    8   14:invokespecial   #304 <Method void g()>
		}
	//    9   17:return          
	}

	public void setTabMode(int i1)
	{
		if(i1 != l)
	//*   0    0:iload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #276 <Field int l>
	//*   3    5:icmpeq          17
		{
			l = i1;
	//    4    8:aload_0         
	//    5    9:iload_1         
	//    6   10:putfield        #276 <Field int l>
			g();
	//    7   13:aload_0         
	//    8   14:invokespecial   #304 <Method void g()>
		}
	//    9   17:return          
	}

	public void setTabTextColors(ColorStateList colorstatelist)
	{
		if(f != colorstatelist)
	//*   0    0:aload_0         
	//*   1    1:getfield        #226 <Field ColorStateList f>
	//*   2    4:aload_1         
	//*   3    5:if_acmpeq       17
		{
			f = colorstatelist;
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:putfield        #226 <Field ColorStateList f>
			d();
	//    7   13:aload_0         
	//    8   14:invokespecial   #822 <Method void d()>
		}
	//    9   17:return          
	}

	public void setTabsFromPagerAdapter(p p1)
	{
		a(p1, false);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_0        
	//    3    3:invokevirtual   #426 <Method void a(p, boolean)>
	//    4    6:return          
	}

	public void setupWithViewPager(ViewPager viewpager)
	{
		a(viewpager, true);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_1        
	//    3    3:invokevirtual   #826 <Method void a(ViewPager, boolean)>
	//    4    6:return          
	}

	public boolean shouldDelayChildPressedState()
	{
		return getTabScrollRange() > 0;
	//    0    0:aload_0         
	//    1    1:invokespecial   #829 <Method int getTabScrollRange()>
	//    2    4:ifle            9
	//    3    7:iconst_1        
	//    4    8:ireturn         
	//    5    9:iconst_0        
	//    6   10:ireturn         
	}

	private static final android.support.v4.f.k.a n = new android.support.v4.f.k.c(16);
	private DataSetObserver A;
	private f B;
	private a C;
	private boolean D;
	private final android.support.v4.f.k.a E;
	int a;
	int b;
	int c;
	int d;
	int e;
	ColorStateList f;
	float g;
	float h;
	final int i;
	int j;
	int k;
	int l;
	ViewPager m;
	private final ArrayList o;
	private e p;
	private final d q;
	private final int r;
	private final int s;
	private final int t;
	private int u;
	private b v;
	private final ArrayList w;
	private b x;
	private ValueAnimator y;
	private p z;

	static 
	{
	//    0    0:new             #81  <Class android.support.v4.f.k$c>
	//    1    3:dup             
	//    2    4:bipush          16
	//    3    6:invokespecial   #85  <Method void android.support.v4.f.k$c(int)>
	//    4    9:putstatic       #87  <Field android.support.v4.f.k$a n>
	//*   5   12:return          
	}
}

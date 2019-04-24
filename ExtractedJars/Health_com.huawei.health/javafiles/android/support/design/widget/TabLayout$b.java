// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.widget;

import android.animation.*;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.support.v4.view.ViewCompat;
import android.view.View;
import android.widget.LinearLayout;
import o.p;

// Referenced classes of package android.support.design.widget:
//			TabLayout

class TabLayout$b extends LinearLayout
{

	private void c()
	{
		View view = getChildAt(d);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #33  <Field int d>
	//    3    5:invokevirtual   #55  <Method View getChildAt(int)>
	//    4    8:astore          5
		int j;
		int k;
		if(view != null && view.getWidth() > 0)
	//*   5   10:aload           5
	//*   6   12:ifnull          130
	//*   7   15:aload           5
	//*   8   17:invokevirtual   #61  <Method int View.getWidth()>
	//*   9   20:ifle            130
		{
			int i1 = view.getLeft();
	//   10   23:aload           5
	//   11   25:invokevirtual   #64  <Method int View.getLeft()>
	//   12   28:istore          4
			int l = view.getRight();
	//   13   30:aload           5
	//   14   32:invokevirtual   #67  <Method int View.getRight()>
	//   15   35:istore_3        
			j = i1;
	//   16   36:iload           4
	//   17   38:istore_1        
			k = l;
	//   18   39:iload_3         
	//   19   40:istore_2        
			if(a > 0.0F)
	//*  20   41:aload_0         
	//*  21   42:getfield        #69  <Field float a>
	//*  22   45:fconst_0        
	//*  23   46:fcmpl           
	//*  24   47:ifle            134
			{
				j = i1;
	//   25   50:iload           4
	//   26   52:istore_1        
				k = l;
	//   27   53:iload_3         
	//   28   54:istore_2        
				if(d < getChildCount() - 1)
	//*  29   55:aload_0         
	//*  30   56:getfield        #33  <Field int d>
	//*  31   59:aload_0         
	//*  32   60:invokevirtual   #72  <Method int getChildCount()>
	//*  33   63:iconst_1        
	//*  34   64:isub            
	//*  35   65:icmpge          134
				{
					View view1 = getChildAt(d + 1);
	//   36   68:aload_0         
	//   37   69:aload_0         
	//   38   70:getfield        #33  <Field int d>
	//   39   73:iconst_1        
	//   40   74:iadd            
	//   41   75:invokevirtual   #55  <Method View getChildAt(int)>
	//   42   78:astore          5
					j = (int)(a * (float)view1.getLeft() + (1.0F - a) * (float)i1);
	//   43   80:aload_0         
	//   44   81:getfield        #69  <Field float a>
	//   45   84:aload           5
	//   46   86:invokevirtual   #64  <Method int View.getLeft()>
	//   47   89:i2f             
	//   48   90:fmul            
	//   49   91:fconst_1        
	//   50   92:aload_0         
	//   51   93:getfield        #69  <Field float a>
	//   52   96:fsub            
	//   53   97:iload           4
	//   54   99:i2f             
	//   55  100:fmul            
	//   56  101:fadd            
	//   57  102:f2i             
	//   58  103:istore_1        
					k = (int)(a * (float)view1.getRight() + (1.0F - a) * (float)l);
	//   59  104:aload_0         
	//   60  105:getfield        #69  <Field float a>
	//   61  108:aload           5
	//   62  110:invokevirtual   #67  <Method int View.getRight()>
	//   63  113:i2f             
	//   64  114:fmul            
	//   65  115:fconst_1        
	//   66  116:aload_0         
	//   67  117:getfield        #69  <Field float a>
	//   68  120:fsub            
	//   69  121:iload_3         
	//   70  122:i2f             
	//   71  123:fmul            
	//   72  124:fadd            
	//   73  125:f2i             
	//   74  126:istore_2        
				}
			}
		} else
	//*  75  127:goto            134
		{
			k = -1;
	//   76  130:iconst_m1       
	//   77  131:istore_2        
			j = -1;
	//   78  132:iconst_m1       
	//   79  133:istore_1        
		}
		c(j, k);
	//   80  134:aload_0         
	//   81  135:iload_1         
	//   82  136:iload_2         
	//   83  137:invokevirtual   #75  <Method void c(int, int)>
	//   84  140:return          
	}

	boolean a()
	{
		int j = 0;
	//    0    0:iconst_0        
	//    1    1:istore_1        
		for(int k = getChildCount(); j < k; j++)
	//*   2    2:aload_0         
	//*   3    3:invokevirtual   #72  <Method int getChildCount()>
	//*   4    6:istore_2        
	//*   5    7:iload_1         
	//*   6    8:iload_2         
	//*   7    9:icmpge          32
			if(getChildAt(j).getWidth() <= 0)
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

	void b(int j)
	{
		if(b.getColor() != j)
	//*   0    0:aload_0         
	//*   1    1:getfield        #50  <Field Paint b>
	//*   2    4:invokevirtual   #80  <Method int Paint.getColor()>
	//*   3    7:iload_1         
	//*   4    8:icmpeq          23
		{
			b.setColor(j);
	//    5   11:aload_0         
	//    6   12:getfield        #50  <Field Paint b>
	//    7   15:iload_1         
	//    8   16:invokevirtual   #83  <Method void Paint.setColor(int)>
			ViewCompat.postInvalidateOnAnimation(((View) (this)));
	//    9   19:aload_0         
	//   10   20:invokestatic    #89  <Method void ViewCompat.postInvalidateOnAnimation(View)>
		}
	//   11   23:return          
	}

	void c(int j, float f1)
	{
		if(g != null && g.isRunning())
	//*   0    0:aload_0         
	//*   1    1:getfield        #92  <Field ValueAnimator g>
	//*   2    4:ifnull          24
	//*   3    7:aload_0         
	//*   4    8:getfield        #92  <Field ValueAnimator g>
	//*   5   11:invokevirtual   #97  <Method boolean ValueAnimator.isRunning()>
	//*   6   14:ifeq            24
			g.cancel();
	//    7   17:aload_0         
	//    8   18:getfield        #92  <Field ValueAnimator g>
	//    9   21:invokevirtual   #100 <Method void ValueAnimator.cancel()>
		d = j;
	//   10   24:aload_0         
	//   11   25:iload_1         
	//   12   26:putfield        #33  <Field int d>
		a = f1;
	//   13   29:aload_0         
	//   14   30:fload_2         
	//   15   31:putfield        #69  <Field float a>
		c();
	//   16   34:aload_0         
	//   17   35:invokespecial   #102 <Method void c()>
	//   18   38:return          
	}

	void c(int j, int k)
	{
		if(j != h || k != i)
	//*   0    0:iload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #37  <Field int h>
	//*   3    5:icmpne          16
	//*   4    8:iload_2         
	//*   5    9:aload_0         
	//*   6   10:getfield        #39  <Field int i>
	//*   7   13:icmpeq          30
		{
			h = j;
	//    8   16:aload_0         
	//    9   17:iload_1         
	//   10   18:putfield        #37  <Field int h>
			i = k;
	//   11   21:aload_0         
	//   12   22:iload_2         
	//   13   23:putfield        #39  <Field int i>
			ViewCompat.postInvalidateOnAnimation(((View) (this)));
	//   14   26:aload_0         
	//   15   27:invokestatic    #89  <Method void ViewCompat.postInvalidateOnAnimation(View)>
		}
	//   16   30:return          
	}

	public void draw(Canvas canvas)
	{
		super.draw(canvas);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #106 <Method void LinearLayout.draw(Canvas)>
		if(h >= 0 && i > h)
	//*   3    5:aload_0         
	//*   4    6:getfield        #37  <Field int h>
	//*   5    9:iflt            56
	//*   6   12:aload_0         
	//*   7   13:getfield        #39  <Field int i>
	//*   8   16:aload_0         
	//*   9   17:getfield        #37  <Field int h>
	//*  10   20:icmple          56
			canvas.drawRect(h, getHeight() - c, i, getHeight(), b);
	//   11   23:aload_1         
	//   12   24:aload_0         
	//   13   25:getfield        #37  <Field int h>
	//   14   28:i2f             
	//   15   29:aload_0         
	//   16   30:invokevirtual   #109 <Method int getHeight()>
	//   17   33:aload_0         
	//   18   34:getfield        #111 <Field int c>
	//   19   37:isub            
	//   20   38:i2f             
	//   21   39:aload_0         
	//   22   40:getfield        #39  <Field int i>
	//   23   43:i2f             
	//   24   44:aload_0         
	//   25   45:invokevirtual   #109 <Method int getHeight()>
	//   26   48:i2f             
	//   27   49:aload_0         
	//   28   50:getfield        #50  <Field Paint b>
	//   29   53:invokevirtual   #117 <Method void Canvas.drawRect(float, float, float, float, Paint)>
	//   30   56:return          
	}

	float e()
	{
		return (float)d + a;
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field int d>
	//    2    4:i2f             
	//    3    5:aload_0         
	//    4    6:getfield        #69  <Field float a>
	//    5    9:fadd            
	//    6   10:freturn         
	}

	void e(int j)
	{
		if(c != j)
	//*   0    0:aload_0         
	//*   1    1:getfield        #111 <Field int c>
	//*   2    4:iload_1         
	//*   3    5:icmpeq          17
		{
			c = j;
	//    4    8:aload_0         
	//    5    9:iload_1         
	//    6   10:putfield        #111 <Field int c>
			ViewCompat.postInvalidateOnAnimation(((View) (this)));
	//    7   13:aload_0         
	//    8   14:invokestatic    #89  <Method void ViewCompat.postInvalidateOnAnimation(View)>
		}
	//    9   17:return          
	}

	void e(int j, int k)
	{
		if(g != null && g.isRunning())
	//*   0    0:aload_0         
	//*   1    1:getfield        #92  <Field ValueAnimator g>
	//*   2    4:ifnull          24
	//*   3    7:aload_0         
	//*   4    8:getfield        #92  <Field ValueAnimator g>
	//*   5   11:invokevirtual   #97  <Method boolean ValueAnimator.isRunning()>
	//*   6   14:ifeq            24
			g.cancel();
	//    7   17:aload_0         
	//    8   18:getfield        #92  <Field ValueAnimator g>
	//    9   21:invokevirtual   #100 <Method void ValueAnimator.cancel()>
		int l;
		if(ViewCompat.getLayoutDirection(((View) (this))) == 1)
	//*  10   24:aload_0         
	//*  11   25:invokestatic    #122 <Method int ViewCompat.getLayoutDirection(View)>
	//*  12   28:iconst_1        
	//*  13   29:icmpne          37
			l = 1;
	//   14   32:iconst_1        
	//   15   33:istore_3        
		else
	//*  16   34:goto            39
			l = 0;
	//   17   37:iconst_0        
	//   18   38:istore_3        
		View view = getChildAt(j);
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
	//   26   52:invokespecial   #102 <Method void c()>
			return;
	//   27   55:return          
		}
		int j1 = view.getLeft();
	//   28   56:aload           7
	//   29   58:invokevirtual   #64  <Method int View.getLeft()>
	//   30   61:istore          5
		int k1 = view.getRight();
	//   31   63:aload           7
	//   32   65:invokevirtual   #67  <Method int View.getRight()>
	//   33   68:istore          6
		int i1;
		if(Math.abs(j - d) <= 1)
	//*  34   70:iload_1         
	//*  35   71:aload_0         
	//*  36   72:getfield        #33  <Field int d>
	//*  37   75:isub            
	//*  38   76:invokestatic    #128 <Method int Math.abs(int)>
	//*  39   79:iconst_1        
	//*  40   80:icmpgt          97
		{
			l = h;
	//   41   83:aload_0         
	//   42   84:getfield        #37  <Field int h>
	//   43   87:istore_3        
			i1 = i;
	//   44   88:aload_0         
	//   45   89:getfield        #39  <Field int i>
	//   46   92:istore          4
		} else
	//*  47   94:goto            169
		{
			i1 = e.dpToPx(24);
	//   48   97:aload_0         
	//   49   98:getfield        #28  <Field TabLayout e>
	//   50  101:bipush          24
	//   51  103:invokevirtual   #131 <Method int TabLayout.dpToPx(int)>
	//   52  106:istore          4
			if(j < d)
	//*  53  108:iload_1         
	//*  54  109:aload_0         
	//*  55  110:getfield        #33  <Field int d>
	//*  56  113:icmpge          144
			{
				if(l != 0)
	//*  57  116:iload_3         
	//*  58  117:ifeq            132
				{
					l = j1 - i1;
	//   59  120:iload           5
	//   60  122:iload           4
	//   61  124:isub            
	//   62  125:istore_3        
					i1 = l;
	//   63  126:iload_3         
	//   64  127:istore          4
				} else
	//*  65  129:goto            169
				{
					l = k1 + i1;
	//   66  132:iload           6
	//   67  134:iload           4
	//   68  136:iadd            
	//   69  137:istore_3        
					i1 = l;
	//   70  138:iload_3         
	//   71  139:istore          4
				}
			} else
	//*  72  141:goto            169
			if(l != 0)
	//*  73  144:iload_3         
	//*  74  145:ifeq            160
			{
				l = k1 + i1;
	//   75  148:iload           6
	//   76  150:iload           4
	//   77  152:iadd            
	//   78  153:istore_3        
				i1 = l;
	//   79  154:iload_3         
	//   80  155:istore          4
			} else
	//*  81  157:goto            169
			{
				l = j1 - i1;
	//   82  160:iload           5
	//   83  162:iload           4
	//   84  164:isub            
	//   85  165:istore_3        
				i1 = l;
	//   86  166:iload_3         
	//   87  167:istore          4
			}
		}
		if(l != j1 || i1 != k1)
	//*  88  169:iload_3         
	//*  89  170:iload           5
	//*  90  172:icmpne          182
	//*  91  175:iload           4
	//*  92  177:iload           6
	//*  93  179:icmpeq          268
		{
			ValueAnimator valueanimator = new ValueAnimator();
	//   94  182:new             #94  <Class ValueAnimator>
	//   95  185:dup             
	//   96  186:invokespecial   #132 <Method void ValueAnimator()>
	//   97  189:astore          7
			g = valueanimator;
	//   98  191:aload_0         
	//   99  192:aload           7
	//  100  194:putfield        #92  <Field ValueAnimator g>
			valueanimator.setInterpolator(((android.animation.TimeInterpolator) (p.a)));
	//  101  197:aload           7
	//  102  199:getstatic       #137 <Field android.view.animation.Interpolator p.a>
	//  103  202:invokevirtual   #141 <Method void ValueAnimator.setInterpolator(android.animation.TimeInterpolator)>
			valueanimator.setDuration(k);
	//  104  205:aload           7
	//  105  207:iload_2         
	//  106  208:i2l             
	//  107  209:invokevirtual   #145 <Method ValueAnimator ValueAnimator.setDuration(long)>
	//  108  212:pop             
			valueanimator.setFloatValues(new float[] {
				0.0F, 1.0F
			});
	//  109  213:aload           7
	//  110  215:iconst_2        
	//  111  216:newarray        float[]
	//  112  218:dup             
	//  113  219:iconst_0        
	//  114  220:fconst_0        
	//  115  221:fastore         
	//  116  222:dup             
	//  117  223:iconst_1        
	//  118  224:fconst_1        
	//  119  225:fastore         
	//  120  226:invokevirtual   #149 <Method void ValueAnimator.setFloatValues(float[])>
			valueanimator.addUpdateListener(new android.animation.ValueAnimator.AnimatorUpdateListener(l, j1, i1, k1) {

				public void onAnimationUpdate(ValueAnimator valueanimator1)
				{
					float f1 = valueanimator1.getAnimatedFraction();
				//    0    0:aload_1         
				//    1    1:invokevirtual   #43  <Method float ValueAnimator.getAnimatedFraction()>
				//    2    4:fstore_2        
					e.c(p.d(c, d, f1), p.d(b, a, f1));
				//    3    5:aload_0         
				//    4    6:getfield        #23  <Field TabLayout$b e>
				//    5    9:aload_0         
				//    6   10:getfield        #25  <Field int c>
				//    7   13:aload_0         
				//    8   14:getfield        #27  <Field int d>
				//    9   17:fload_2         
				//   10   18:invokestatic    #48  <Method int p.d(int, int, float)>
				//   11   21:aload_0         
				//   12   22:getfield        #29  <Field int b>
				//   13   25:aload_0         
				//   14   26:getfield        #31  <Field int a>
				//   15   29:fload_2         
				//   16   30:invokestatic    #48  <Method int p.d(int, int, float)>
				//   17   33:invokevirtual   #50  <Method void TabLayout$b.c(int, int)>
				//   18   36:return          
				}

				final int a;
				final int b;
				final int c;
				final int d;
				final TabLayout.b e;

			
			{
				e = TabLayout.b.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #23  <Field TabLayout$b e>
				c = j;
			//    3    5:aload_0         
			//    4    6:iload_2         
			//    5    7:putfield        #25  <Field int c>
				d = k;
			//    6   10:aload_0         
			//    7   11:iload_3         
			//    8   12:putfield        #27  <Field int d>
				b = l;
			//    9   15:aload_0         
			//   10   16:iload           4
			//   11   18:putfield        #29  <Field int b>
				a = i1;
			//   12   21:aload_0         
			//   13   22:iload           5
			//   14   24:putfield        #31  <Field int a>
				super();
			//   15   27:aload_0         
			//   16   28:invokespecial   #34  <Method void Object()>
			//   17   31:return          
			}
			}
);
	//  121  229:aload           7
	//  122  231:new             #9   <Class TabLayout$b$2>
	//  123  234:dup             
	//  124  235:aload_0         
	//  125  236:iload_3         
	//  126  237:iload           5
	//  127  239:iload           4
	//  128  241:iload           6
	//  129  243:invokespecial   #152 <Method void TabLayout$b$2(TabLayout$b, int, int, int, int)>
	//  130  246:invokevirtual   #156 <Method void ValueAnimator.addUpdateListener(android.animation.ValueAnimator$AnimatorUpdateListener)>
			valueanimator.addListener(((android.animation.matorListener) (new AnimatorListenerAdapter(j) {

				public void onAnimationEnd(Animator animator)
				{
					b.d = e;
				//    0    0:aload_0         
				//    1    1:getfield        #18  <Field TabLayout$b b>
				//    2    4:aload_0         
				//    3    5:getfield        #20  <Field int e>
				//    4    8:putfield        #29  <Field int TabLayout$b.d>
					b.a = 0.0F;
				//    5   11:aload_0         
				//    6   12:getfield        #18  <Field TabLayout$b b>
				//    7   15:fconst_0        
				//    8   16:putfield        #33  <Field float TabLayout$b.a>
				//    9   19:return          
				}

				final TabLayout.b b;
				final int e;

			
			{
				b = TabLayout.b.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #18  <Field TabLayout$b b>
				e = j;
			//    3    5:aload_0         
			//    4    6:iload_2         
			//    5    7:putfield        #20  <Field int e>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #23  <Method void AnimatorListenerAdapter()>
			//    8   14:return          
			}
			}
)));
	//  131  249:aload           7
	//  132  251:new             #11  <Class TabLayout$b$3>
	//  133  254:dup             
	//  134  255:aload_0         
	//  135  256:iload_1         
	//  136  257:invokespecial   #159 <Method void TabLayout$b$3(TabLayout$b, int)>
	//  137  260:invokevirtual   #163 <Method void ValueAnimator.addListener(android.animation.Animator$AnimatorListener)>
			valueanimator.start();
	//  138  263:aload           7
	//  139  265:invokevirtual   #166 <Method void ValueAnimator.start()>
		}
	//  140  268:return          
	}

	protected void onLayout(boolean flag, int j, int k, int l, int i1)
	{
		super.onLayout(flag, j, k, l, i1);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:iload_3         
	//    4    4:iload           4
	//    5    6:iload           5
	//    6    8:invokespecial   #170 <Method void LinearLayout.onLayout(boolean, int, int, int, int)>
		if(g != null && g.isRunning())
	//*   7   11:aload_0         
	//*   8   12:getfield        #92  <Field ValueAnimator g>
	//*   9   15:ifnull          69
	//*  10   18:aload_0         
	//*  11   19:getfield        #92  <Field ValueAnimator g>
	//*  12   22:invokevirtual   #97  <Method boolean ValueAnimator.isRunning()>
	//*  13   25:ifeq            69
		{
			g.cancel();
	//   14   28:aload_0         
	//   15   29:getfield        #92  <Field ValueAnimator g>
	//   16   32:invokevirtual   #100 <Method void ValueAnimator.cancel()>
			long l1 = g.getDuration();
	//   17   35:aload_0         
	//   18   36:getfield        #92  <Field ValueAnimator g>
	//   19   39:invokevirtual   #174 <Method long ValueAnimator.getDuration()>
	//   20   42:lstore          6
			e(d, Math.round((1.0F - g.getAnimatedFraction()) * (float)l1));
	//   21   44:aload_0         
	//   22   45:aload_0         
	//   23   46:getfield        #33  <Field int d>
	//   24   49:fconst_1        
	//   25   50:aload_0         
	//   26   51:getfield        #92  <Field ValueAnimator g>
	//   27   54:invokevirtual   #177 <Method float ValueAnimator.getAnimatedFraction()>
	//   28   57:fsub            
	//   29   58:lload           6
	//   30   60:l2f             
	//   31   61:fmul            
	//   32   62:invokestatic    #181 <Method int Math.round(float)>
	//   33   65:invokevirtual   #183 <Method void e(int, int)>
			return;
	//   34   68:return          
		} else
		{
			c();
	//   35   69:aload_0         
	//   36   70:invokespecial   #102 <Method void c()>
			return;
	//   37   73:return          
		}
	}

	protected void onMeasure(int j, int k)
	{
		super.onMeasure(j, k);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #186 <Method void LinearLayout.onMeasure(int, int)>
		if(android.view.Spec.getMode(j) != 0x40000000)
	//*   4    6:iload_1         
	//*   5    7:invokestatic    #191 <Method int android.view.View$MeasureSpec.getMode(int)>
	//*   6   10:ldc1            #192 <Int 0x40000000>
	//*   7   12:icmpeq          16
			return;
	//    8   15:return          
		if(e.mMode == 1 && e.mTabGravity == 1)
	//*   9   16:aload_0         
	//*  10   17:getfield        #28  <Field TabLayout e>
	//*  11   20:getfield        #195 <Field int TabLayout.mMode>
	//*  12   23:iconst_1        
	//*  13   24:icmpne          232
	//*  14   27:aload_0         
	//*  15   28:getfield        #28  <Field TabLayout e>
	//*  16   31:getfield        #198 <Field int TabLayout.mTabGravity>
	//*  17   34:iconst_1        
	//*  18   35:icmpne          232
		{
			int i2 = getChildCount();
	//   19   38:aload_0         
	//   20   39:invokevirtual   #72  <Method int getChildCount()>
	//   21   42:istore          6
			int i1 = 0;
	//   22   44:iconst_0        
	//   23   45:istore          4
			for(int l = 0; l < i2;)
	//*  24   47:iconst_0        
	//*  25   48:istore_3        
	//*  26   49:iload_3         
	//*  27   50:iload           6
	//*  28   52:icmpge          97
			{
				View view = getChildAt(l);
	//   29   55:aload_0         
	//   30   56:iload_3         
	//   31   57:invokevirtual   #55  <Method View getChildAt(int)>
	//   32   60:astore          7
				int j1 = i1;
	//   33   62:iload           4
	//   34   64:istore          5
				if(view.getVisibility() == 0)
	//*  35   66:aload           7
	//*  36   68:invokevirtual   #201 <Method int View.getVisibility()>
	//*  37   71:ifne            86
					j1 = Math.max(i1, view.getMeasuredWidth());
	//   38   74:iload           4
	//   39   76:aload           7
	//   40   78:invokevirtual   #204 <Method int View.getMeasuredWidth()>
	//   41   81:invokestatic    #208 <Method int Math.max(int, int)>
	//   42   84:istore          5
				l++;
	//   43   86:iload_3         
	//   44   87:iconst_1        
	//   45   88:iadd            
	//   46   89:istore_3        
				i1 = j1;
	//   47   90:iload           5
	//   48   92:istore          4
			}

	//*  49   94:goto            49
			if(i1 <= 0)
	//*  50   97:iload           4
	//*  51   99:ifgt            103
				return;
	//   52  102:return          
			int k1 = e.dpToPx(16);
	//   53  103:aload_0         
	//   54  104:getfield        #28  <Field TabLayout e>
	//   55  107:bipush          16
	//   56  109:invokevirtual   #131 <Method int TabLayout.dpToPx(int)>
	//   57  112:istore          5
			boolean flag = false;
	//   58  114:iconst_0        
	//   59  115:istore_3        
			if(i1 * i2 <= getMeasuredWidth() - k1 * 2)
	//*  60  116:iload           4
	//*  61  118:iload           6
	//*  62  120:imul            
	//*  63  121:aload_0         
	//*  64  122:invokevirtual   #209 <Method int getMeasuredWidth()>
	//*  65  125:iload           5
	//*  66  127:iconst_2        
	//*  67  128:imul            
	//*  68  129:isub            
	//*  69  130:icmpgt          204
			{
				for(int l1 = 0; l1 < i2; l1++)
	//*  70  133:iconst_0        
	//*  71  134:istore          5
	//*  72  136:iload           5
	//*  73  138:iload           6
	//*  74  140:icmpge          201
				{
					android.widget..LayoutParams layoutparams = (android.widget..LayoutParams)getChildAt(l1).getLayoutParams();
	//   75  143:aload_0         
	//   76  144:iload           5
	//   77  146:invokevirtual   #55  <Method View getChildAt(int)>
	//   78  149:invokevirtual   #213 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   79  152:checkcast       #215 <Class android.widget.LinearLayout$LayoutParams>
	//   80  155:astore          7
					if(layoutparams.width != i1 || layoutparams.weight != 0.0F)
	//*  81  157:aload           7
	//*  82  159:getfield        #218 <Field int android.widget.LinearLayout$LayoutParams.width>
	//*  83  162:iload           4
	//*  84  164:icmpne          177
	//*  85  167:aload           7
	//*  86  169:getfield        #221 <Field float android.widget.LinearLayout$LayoutParams.weight>
	//*  87  172:fconst_0        
	//*  88  173:fcmpl           
	//*  89  174:ifeq            192
					{
						layoutparams.width = i1;
	//   90  177:aload           7
	//   91  179:iload           4
	//   92  181:putfield        #218 <Field int android.widget.LinearLayout$LayoutParams.width>
						layoutparams.weight = 0.0F;
	//   93  184:aload           7
	//   94  186:fconst_0        
	//   95  187:putfield        #221 <Field float android.widget.LinearLayout$LayoutParams.weight>
						flag = true;
	//   96  190:iconst_1        
	//   97  191:istore_3        
					}
				}

	//   98  192:iload           5
	//   99  194:iconst_1        
	//  100  195:iadd            
	//  101  196:istore          5
			} else
	//* 102  198:goto            136
	//* 103  201:goto            222
			{
				e.mTabGravity = 0;
	//  104  204:aload_0         
	//  105  205:getfield        #28  <Field TabLayout e>
	//  106  208:iconst_0        
	//  107  209:putfield        #198 <Field int TabLayout.mTabGravity>
				e.updateTabViews(false);
	//  108  212:aload_0         
	//  109  213:getfield        #28  <Field TabLayout e>
	//  110  216:iconst_0        
	//  111  217:invokevirtual   #224 <Method void TabLayout.updateTabViews(boolean)>
				flag = true;
	//  112  220:iconst_1        
	//  113  221:istore_3        
			}
			if(flag)
	//* 114  222:iload_3         
	//* 115  223:ifeq            232
				super.onMeasure(j, k);
	//  116  226:aload_0         
	//  117  227:iload_1         
	//  118  228:iload_2         
	//  119  229:invokespecial   #186 <Method void LinearLayout.onMeasure(int, int)>
		}
	//  120  232:return          
	}

	public void onRtlPropertiesChanged(int j)
	{
		super.onRtlPropertiesChanged(j);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #227 <Method void LinearLayout.onRtlPropertiesChanged(int)>
		if(android.os.N.SDK_INT < 23 && f != j)
	//*   3    5:getstatic       #232 <Field int android.os.Build$VERSION.SDK_INT>
	//*   4    8:bipush          23
	//*   5   10:icmpge          30
	//*   6   13:aload_0         
	//*   7   14:getfield        #35  <Field int f>
	//*   8   17:iload_1         
	//*   9   18:icmpeq          30
		{
			requestLayout();
	//   10   21:aload_0         
	//   11   22:invokevirtual   #235 <Method void requestLayout()>
			f = j;
	//   12   25:aload_0         
	//   13   26:iload_1         
	//   14   27:putfield        #35  <Field int f>
		}
	//   15   30:return          
	}

	float a;
	private final Paint b = new Paint();
	private int c;
	int d;
	final TabLayout e;
	private int f;
	private ValueAnimator g;
	private int h;
	private int i;

	TabLayout$b(TabLayout tablayout, Context context)
	{
		e = tablayout;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #28  <Field TabLayout e>
		super(context);
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:invokespecial   #31  <Method void LinearLayout(Context)>
		d = -1;
	//    6   10:aload_0         
	//    7   11:iconst_m1       
	//    8   12:putfield        #33  <Field int d>
		f = -1;
	//    9   15:aload_0         
	//   10   16:iconst_m1       
	//   11   17:putfield        #35  <Field int f>
		h = -1;
	//   12   20:aload_0         
	//   13   21:iconst_m1       
	//   14   22:putfield        #37  <Field int h>
		i = -1;
	//   15   25:aload_0         
	//   16   26:iconst_m1       
	//   17   27:putfield        #39  <Field int i>
		setWillNotDraw(false);
	//   18   30:aload_0         
	//   19   31:iconst_0        
	//   20   32:invokevirtual   #43  <Method void setWillNotDraw(boolean)>
	//   21   35:aload_0         
	//   22   36:new             #45  <Class Paint>
	//   23   39:dup             
	//   24   40:invokespecial   #48  <Method void Paint()>
	//   25   43:putfield        #50  <Field Paint b>
	//   26   46:return          
	}
}

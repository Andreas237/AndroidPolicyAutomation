// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.widget;

import android.animation.*;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.support.v4.view.s;
import android.view.View;
import android.widget.LinearLayout;

// Referenced classes of package android.support.design.widget:
//			TabLayout, a

private class TabLayout$d extends LinearLayout
{

	private void c()
	{
		View view = getChildAt(a);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #33  <Field int a>
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
			j = l;
	//   16   36:iload_3         
	//   17   37:istore_1        
			k = i1;
	//   18   38:iload           4
	//   19   40:istore_2        
			if(b > 0.0F)
	//*  20   41:aload_0         
	//*  21   42:getfield        #69  <Field float b>
	//*  22   45:fconst_0        
	//*  23   46:fcmpl           
	//*  24   47:ifle            134
			{
				j = l;
	//   25   50:iload_3         
	//   26   51:istore_1        
				k = i1;
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
					k = (int)(b * (float)view1.getLeft() + (1.0F - b) * (float)i1);
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
					j = (int)(b * (float)view1.getRight() + (1.0F - b) * (float)l);
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
			k = -1;
	//   76  130:iconst_m1       
	//   77  131:istore_2        
			j = -1;
	//   78  132:iconst_m1       
	//   79  133:istore_1        
		}
		a(k, j);
	//   80  134:aload_0         
	//   81  135:iload_2         
	//   82  136:iload_1         
	//   83  137:invokevirtual   #75  <Method void a(int, int)>
	//   84  140:return          
	}

	void a(int j)
	{
		if(e.getColor() != j)
	//*   0    0:aload_0         
	//*   1    1:getfield        #50  <Field Paint e>
	//*   2    4:invokevirtual   #79  <Method int Paint.getColor()>
	//*   3    7:iload_1         
	//*   4    8:icmpeq          23
		{
			e.setColor(j);
	//    5   11:aload_0         
	//    6   12:getfield        #50  <Field Paint e>
	//    7   15:iload_1         
	//    8   16:invokevirtual   #82  <Method void Paint.setColor(int)>
			s.c(((View) (this)));
	//    9   19:aload_0         
	//   10   20:invokestatic    #87  <Method void s.c(View)>
		}
	//   11   23:return          
	}

	void a(int j, float f1)
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
		a = j;
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

	void a(int j, int k)
	{
		if(j != g || k != h)
	//*   0    0:iload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #37  <Field int g>
	//*   3    5:icmpne          16
	//*   4    8:iload_2         
	//*   5    9:aload_0         
	//*   6   10:getfield        #39  <Field int h>
	//*   7   13:icmpeq          30
		{
			g = j;
	//    8   16:aload_0         
	//    9   17:iload_1         
	//   10   18:putfield        #37  <Field int g>
			h = k;
	//   11   21:aload_0         
	//   12   22:iload_2         
	//   13   23:putfield        #39  <Field int h>
			s.c(((View) (this)));
	//   14   26:aload_0         
	//   15   27:invokestatic    #87  <Method void s.c(View)>
		}
	//   16   30:return          
	}

	boolean a()
	{
		int k = getChildCount();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #72  <Method int getChildCount()>
	//    2    4:istore_2        
		for(int j = 0; j < k; j++)
	//*   3    5:iconst_0        
	//*   4    6:istore_1        
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

	void b(int j)
	{
		if(d != j)
	//*   0    0:aload_0         
	//*   1    1:getfield        #104 <Field int d>
	//*   2    4:iload_1         
	//*   3    5:icmpeq          17
		{
			d = j;
	//    4    8:aload_0         
	//    5    9:iload_1         
	//    6   10:putfield        #104 <Field int d>
			s.c(((View) (this)));
	//    7   13:aload_0         
	//    8   14:invokestatic    #87  <Method void s.c(View)>
		}
	//    9   17:return          
	}

	void b(int j, int k)
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
		int l;
		if(s.e(((View) (this))) == 1)
	//*  10   24:aload_0         
	//*  11   25:invokestatic    #107 <Method int s.e(View)>
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
	//   26   52:invokespecial   #101 <Method void c()>
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
		if(Math.abs(j - a) <= 1)
	//*  34   70:iload_1         
	//*  35   71:aload_0         
	//*  36   72:getfield        #33  <Field int a>
	//*  37   75:isub            
	//*  38   76:invokestatic    #113 <Method int Math.abs(int)>
	//*  39   79:iconst_1        
	//*  40   80:icmpgt          97
		{
			l = g;
	//   41   83:aload_0         
	//   42   84:getfield        #37  <Field int g>
	//   43   87:istore_3        
			i1 = h;
	//   44   88:aload_0         
	//   45   89:getfield        #39  <Field int h>
	//   46   92:istore          4
		} else
	//*  47   94:goto            148
		{
			i1 = c.b(24);
	//   48   97:aload_0         
	//   49   98:getfield        #28  <Field TabLayout c>
	//   50  101:bipush          24
	//   51  103:invokevirtual   #115 <Method int TabLayout.b(int)>
	//   52  106:istore          4
			if(j >= a ? l == 0 : l != 0)
	//*  53  108:iload_1         
	//*  54  109:aload_0         
	//*  55  110:getfield        #33  <Field int a>
	//*  56  113:icmpge          141
	//*  57  116:iload_3         
	//*  58  117:ifeq            132
				l = j1 - i1;
	//   59  120:iload           5
	//   60  122:iload           4
	//   61  124:isub            
	//   62  125:istore_3        
			else
	//*  63  126:iload_3         
	//*  64  127:istore          4
	//*  65  129:goto            148
				l = i1 + k1;
	//   66  132:iload           4
	//   67  134:iload           6
	//   68  136:iadd            
	//   69  137:istore_3        
	//   70  138:goto            126
	//   71  141:iload_3         
	//   72  142:ifeq            120
			i1 = l;
		}
	//*  73  145:goto            132
		if(l != j1 || i1 != k1)
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
			valueanimator.setInterpolator(((android.animation.TimeInterpolator) (a.b)));
	//   87  176:aload           7
	//   88  178:getstatic       #121 <Field android.view.animation.Interpolator a.b>
	//   89  181:invokevirtual   #125 <Method void ValueAnimator.setInterpolator(android.animation.TimeInterpolator)>
			valueanimator.setDuration(k);
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
			valueanimator.addUpdateListener(new android.animation.ValueAnimator.AnimatorUpdateListener(l, j1, i1, k1) {

				public void onAnimationUpdate(ValueAnimator valueanimator1)
				{
					float f1 = valueanimator1.getAnimatedFraction();
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
				final TabLayout.d e;

			
			{
				e = TabLayout.d.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #23  <Field TabLayout$d e>
				a = j;
			//    3    5:aload_0         
			//    4    6:iload_2         
			//    5    7:putfield        #25  <Field int a>
				b = k;
			//    6   10:aload_0         
			//    7   11:iload_3         
			//    8   12:putfield        #27  <Field int b>
				c = l;
			//    9   15:aload_0         
			//   10   16:iload           4
			//   11   18:putfield        #29  <Field int c>
				d = i1;
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
			valueanimator.addListener(((android.animation.matorListener) (new AnimatorListenerAdapter(j) {

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
				final TabLayout.d b;

			
			{
				b = TabLayout.d.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field TabLayout$d b>
				a = j;
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

	protected void onLayout(boolean flag, int j, int k, int l, int i1)
	{
		super.onLayout(flag, j, k, l, i1);
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
			long l1 = i.getDuration();
	//   17   35:aload_0         
	//   18   36:getfield        #90  <Field ValueAnimator i>
	//   19   39:invokevirtual   #171 <Method long ValueAnimator.getDuration()>
	//   20   42:lstore          6
			b(a, Math.round((1.0F - i.getAnimatedFraction()) * (float)l1));
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

	protected void onMeasure(int j, int k)
	{
		super.onMeasure(j, k);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #183 <Method void LinearLayout.onMeasure(int, int)>
		if(android.view.Spec.getMode(j) != 0x40000000)
	//*   4    6:iload_1         
	//*   5    7:invokestatic    #188 <Method int android.view.View$MeasureSpec.getMode(int)>
	//*   6   10:ldc1            #189 <Int 0x40000000>
	//*   7   12:icmpeq          16
			return;
	//    8   15:return          
		int l = c.l;
	//    9   16:aload_0         
	//   10   17:getfield        #28  <Field TabLayout c>
	//   11   20:getfield        #192 <Field int TabLayout.l>
	//   12   23:istore_3        
		boolean flag2 = true;
	//   13   24:iconst_1        
	//   14   25:istore          7
		if(l == 1 && c.k == 1)
	//*  15   27:iload_3         
	//*  16   28:iconst_1        
	//*  17   29:icmpne          240
	//*  18   32:aload_0         
	//*  19   33:getfield        #28  <Field TabLayout c>
	//*  20   36:getfield        #195 <Field int TabLayout.k>
	//*  21   39:iconst_1        
	//*  22   40:icmpne          240
		{
			int i2 = getChildCount();
	//   23   43:aload_0         
	//   24   44:invokevirtual   #72  <Method int getChildCount()>
	//   25   47:istore          8
			boolean flag1 = false;
	//   26   49:iconst_0        
	//   27   50:istore          6
			int i1 = 0;
	//   28   52:iconst_0        
	//   29   53:istore_3        
			int j1;
			int k1;
			for(j1 = 0; i1 < i2; j1 = k1)
	//*  30   54:iconst_0        
	//*  31   55:istore          4
	//*  32   57:iload_3         
	//*  33   58:iload           8
	//*  34   60:icmpge          105
			{
				View view = getChildAt(i1);
	//   35   63:aload_0         
	//   36   64:iload_3         
	//   37   65:invokevirtual   #55  <Method View getChildAt(int)>
	//   38   68:astore          9
				k1 = j1;
	//   39   70:iload           4
	//   40   72:istore          5
				if(view.getVisibility() == 0)
	//*  41   74:aload           9
	//*  42   76:invokevirtual   #198 <Method int View.getVisibility()>
	//*  43   79:ifne            94
					k1 = Math.max(j1, view.getMeasuredWidth());
	//   44   82:iload           4
	//   45   84:aload           9
	//   46   86:invokevirtual   #201 <Method int View.getMeasuredWidth()>
	//   47   89:invokestatic    #205 <Method int Math.max(int, int)>
	//   48   92:istore          5
				i1++;
	//   49   94:iload_3         
	//   50   95:iconst_1        
	//   51   96:iadd            
	//   52   97:istore_3        
			}

	//   53   98:iload           5
	//   54  100:istore          4
	//*  55  102:goto            57
			if(j1 <= 0)
	//*  56  105:iload           4
	//*  57  107:ifgt            111
				return;
	//   58  110:return          
			i1 = c.b(16);
	//   59  111:aload_0         
	//   60  112:getfield        #28  <Field TabLayout c>
	//   61  115:bipush          16
	//   62  117:invokevirtual   #115 <Method int TabLayout.b(int)>
	//   63  120:istore_3        
			boolean flag;
			if(j1 * i2 <= getMeasuredWidth() - i1 * 2)
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
				for(int l1 = ((int) (flag1)); l1 < i2; l1++)
	//*  76  139:iload           6
	//*  77  141:istore          5
	//*  78  143:iload           5
	//*  79  145:iload           8
	//*  80  147:icmpge          208
				{
					android.widget..LayoutParams layoutparams = (android.widget..LayoutParams)getChildAt(l1).getLayoutParams();
	//   81  150:aload_0         
	//   82  151:iload           5
	//   83  153:invokevirtual   #55  <Method View getChildAt(int)>
	//   84  156:invokevirtual   #210 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   85  159:checkcast       #212 <Class android.widget.LinearLayout$LayoutParams>
	//   86  162:astore          9
					if(layoutparams.width != j1 || layoutparams.weight != 0.0F)
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
						layoutparams.width = j1;
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
				super.onMeasure(j, k);
	//  122  234:aload_0         
	//  123  235:iload_1         
	//  124  236:iload_2         
	//  125  237:invokespecial   #183 <Method void LinearLayout.onMeasure(int, int)>
		}
	//  126  240:return          
	}

	public void onRtlPropertiesChanged(int j)
	{
		super.onRtlPropertiesChanged(j);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #223 <Method void LinearLayout.onRtlPropertiesChanged(int)>
		if(android.os.N.SDK_INT < 23 && f != j)
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
			f = j;
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

	TabLayout$d(TabLayout tablayout, Context context)
	{
		c = tablayout;
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

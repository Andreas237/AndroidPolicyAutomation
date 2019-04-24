// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.internal;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.v4.view.*;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;

public class ScrimInsetsFrameLayout extends FrameLayout
{

	public ScrimInsetsFrameLayout(Context context)
	{
		this(context, ((AttributeSet) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:invokespecial   #16  <Method void ScrimInsetsFrameLayout(Context, AttributeSet)>
	//    4    6:return          
	}

	public ScrimInsetsFrameLayout(Context context, AttributeSet attributeset)
	{
		this(context, attributeset, 0);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iconst_0        
	//    4    4:invokespecial   #20  <Method void ScrimInsetsFrameLayout(Context, AttributeSet, int)>
	//    5    7:return          
	}

	public ScrimInsetsFrameLayout(Context context, AttributeSet attributeset, int i)
	{
		super(context, attributeset, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:invokespecial   #21  <Method void FrameLayout(Context, AttributeSet, int)>
		c = new Rect();
	//    5    7:aload_0         
	//    6    8:new             #23  <Class Rect>
	//    7   11:dup             
	//    8   12:invokespecial   #26  <Method void Rect()>
	//    9   15:putfield        #28  <Field Rect c>
		context = ((Context) (context.obtainStyledAttributes(attributeset, android.support.design.a.k.ScrimInsetsFrameLayout, i, android.support.design.a.j.Widget_Design_ScrimInsetsFrameLayout)));
	//   10   18:aload_1         
	//   11   19:aload_2         
	//   12   20:getstatic       #34  <Field int[] android.support.design.a$k.ScrimInsetsFrameLayout>
	//   13   23:iload_3         
	//   14   24:getstatic       #40  <Field int android.support.design.a$j.Widget_Design_ScrimInsetsFrameLayout>
	//   15   27:invokevirtual   #46  <Method TypedArray Context.obtainStyledAttributes(AttributeSet, int[], int, int)>
	//   16   30:astore_1        
		a = ((TypedArray) (context)).getDrawable(android.support.design.a.k.ScrimInsetsFrameLayout_insetForeground);
	//   17   31:aload_0         
	//   18   32:aload_1         
	//   19   33:getstatic       #49  <Field int android.support.design.a$k.ScrimInsetsFrameLayout_insetForeground>
	//   20   36:invokevirtual   #55  <Method Drawable TypedArray.getDrawable(int)>
	//   21   39:putfield        #57  <Field Drawable a>
		((TypedArray) (context)).recycle();
	//   22   42:aload_1         
	//   23   43:invokevirtual   #60  <Method void TypedArray.recycle()>
		setWillNotDraw(true);
	//   24   46:aload_0         
	//   25   47:iconst_1        
	//   26   48:invokevirtual   #64  <Method void setWillNotDraw(boolean)>
		s.a(((View) (this)), new o() {

			public aa a(View view, aa aa1)
			{
				if(a.b == null)
			//*   0    0:aload_0         
			//*   1    1:getfield        #16  <Field ScrimInsetsFrameLayout a>
			//*   2    4:getfield        #25  <Field Rect ScrimInsetsFrameLayout.b>
			//*   3    7:ifnonnull       24
					a.b = new Rect();
			//    4   10:aload_0         
			//    5   11:getfield        #16  <Field ScrimInsetsFrameLayout a>
			//    6   14:new             #27  <Class Rect>
			//    7   17:dup             
			//    8   18:invokespecial   #28  <Method void Rect()>
			//    9   21:putfield        #25  <Field Rect ScrimInsetsFrameLayout.b>
				a.b.set(aa1.a(), aa1.b(), aa1.c(), aa1.d());
			//   10   24:aload_0         
			//   11   25:getfield        #16  <Field ScrimInsetsFrameLayout a>
			//   12   28:getfield        #25  <Field Rect ScrimInsetsFrameLayout.b>
			//   13   31:aload_2         
			//   14   32:invokevirtual   #33  <Method int aa.a()>
			//   15   35:aload_2         
			//   16   36:invokevirtual   #35  <Method int aa.b()>
			//   17   39:aload_2         
			//   18   40:invokevirtual   #38  <Method int aa.c()>
			//   19   43:aload_2         
			//   20   44:invokevirtual   #41  <Method int aa.d()>
			//   21   47:invokevirtual   #45  <Method void Rect.set(int, int, int, int)>
				a.a(aa1);
			//   22   50:aload_0         
			//   23   51:getfield        #16  <Field ScrimInsetsFrameLayout a>
			//   24   54:aload_2         
			//   25   55:invokevirtual   #48  <Method void ScrimInsetsFrameLayout.a(aa)>
				view = ((View) (a));
			//   26   58:aload_0         
			//   27   59:getfield        #16  <Field ScrimInsetsFrameLayout a>
			//   28   62:astore_1        
				boolean flag;
				if(aa1.e() && a.a != null)
			//*  29   63:aload_2         
			//*  30   64:invokevirtual   #52  <Method boolean aa.e()>
			//*  31   67:ifeq            88
			//*  32   70:aload_0         
			//*  33   71:getfield        #16  <Field ScrimInsetsFrameLayout a>
			//*  34   74:getfield        #55  <Field Drawable ScrimInsetsFrameLayout.a>
			//*  35   77:ifnonnull       83
			//*  36   80:goto            88
					flag = false;
			//   37   83:iconst_0        
			//   38   84:istore_3        
				else
			//*  39   85:goto            90
					flag = true;
			//   40   88:iconst_1        
			//   41   89:istore_3        
				((ScrimInsetsFrameLayout) (view)).setWillNotDraw(flag);
			//   42   90:aload_1         
			//   43   91:iload_3         
			//   44   92:invokevirtual   #59  <Method void ScrimInsetsFrameLayout.setWillNotDraw(boolean)>
				s.c(((View) (a)));
			//   45   95:aload_0         
			//   46   96:getfield        #16  <Field ScrimInsetsFrameLayout a>
			//   47   99:invokestatic    #64  <Method void s.c(View)>
				return aa1.g();
			//   48  102:aload_2         
			//   49  103:invokevirtual   #68  <Method aa aa.g()>
			//   50  106:areturn         
			}

			final ScrimInsetsFrameLayout a;

			
			{
				a = ScrimInsetsFrameLayout.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field ScrimInsetsFrameLayout a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
		}
);
	//   27   51:aload_0         
	//   28   52:new             #6   <Class ScrimInsetsFrameLayout$1>
	//   29   55:dup             
	//   30   56:aload_0         
	//   31   57:invokespecial   #67  <Method void ScrimInsetsFrameLayout$1(ScrimInsetsFrameLayout)>
	//   32   60:invokestatic    #72  <Method void s.a(View, o)>
	//   33   63:return          
	}

	protected void a(aa aa)
	{
	//    0    0:return          
	}

	public void draw(Canvas canvas)
	{
		super.draw(canvas);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #77  <Method void FrameLayout.draw(Canvas)>
		int i = getWidth();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #81  <Method int getWidth()>
	//    5    9:istore_2        
		int j = getHeight();
	//    6   10:aload_0         
	//    7   11:invokevirtual   #84  <Method int getHeight()>
	//    8   14:istore_3        
		if(b != null && a != null)
	//*   9   15:aload_0         
	//*  10   16:getfield        #86  <Field Rect b>
	//*  11   19:ifnull          231
	//*  12   22:aload_0         
	//*  13   23:getfield        #57  <Field Drawable a>
	//*  14   26:ifnull          231
		{
			int k = canvas.save();
	//   15   29:aload_1         
	//   16   30:invokevirtual   #91  <Method int Canvas.save()>
	//   17   33:istore          4
			canvas.translate(getScrollX(), getScrollY());
	//   18   35:aload_1         
	//   19   36:aload_0         
	//   20   37:invokevirtual   #94  <Method int getScrollX()>
	//   21   40:i2f             
	//   22   41:aload_0         
	//   23   42:invokevirtual   #97  <Method int getScrollY()>
	//   24   45:i2f             
	//   25   46:invokevirtual   #101 <Method void Canvas.translate(float, float)>
			c.set(0, 0, i, b.top);
	//   26   49:aload_0         
	//   27   50:getfield        #28  <Field Rect c>
	//   28   53:iconst_0        
	//   29   54:iconst_0        
	//   30   55:iload_2         
	//   31   56:aload_0         
	//   32   57:getfield        #86  <Field Rect b>
	//   33   60:getfield        #104 <Field int Rect.top>
	//   34   63:invokevirtual   #108 <Method void Rect.set(int, int, int, int)>
			a.setBounds(c);
	//   35   66:aload_0         
	//   36   67:getfield        #57  <Field Drawable a>
	//   37   70:aload_0         
	//   38   71:getfield        #28  <Field Rect c>
	//   39   74:invokevirtual   #114 <Method void Drawable.setBounds(Rect)>
			a.draw(canvas);
	//   40   77:aload_0         
	//   41   78:getfield        #57  <Field Drawable a>
	//   42   81:aload_1         
	//   43   82:invokevirtual   #115 <Method void Drawable.draw(Canvas)>
			c.set(0, j - b.bottom, i, j);
	//   44   85:aload_0         
	//   45   86:getfield        #28  <Field Rect c>
	//   46   89:iconst_0        
	//   47   90:iload_3         
	//   48   91:aload_0         
	//   49   92:getfield        #86  <Field Rect b>
	//   50   95:getfield        #118 <Field int Rect.bottom>
	//   51   98:isub            
	//   52   99:iload_2         
	//   53  100:iload_3         
	//   54  101:invokevirtual   #108 <Method void Rect.set(int, int, int, int)>
			a.setBounds(c);
	//   55  104:aload_0         
	//   56  105:getfield        #57  <Field Drawable a>
	//   57  108:aload_0         
	//   58  109:getfield        #28  <Field Rect c>
	//   59  112:invokevirtual   #114 <Method void Drawable.setBounds(Rect)>
			a.draw(canvas);
	//   60  115:aload_0         
	//   61  116:getfield        #57  <Field Drawable a>
	//   62  119:aload_1         
	//   63  120:invokevirtual   #115 <Method void Drawable.draw(Canvas)>
			c.set(0, b.top, b.left, j - b.bottom);
	//   64  123:aload_0         
	//   65  124:getfield        #28  <Field Rect c>
	//   66  127:iconst_0        
	//   67  128:aload_0         
	//   68  129:getfield        #86  <Field Rect b>
	//   69  132:getfield        #104 <Field int Rect.top>
	//   70  135:aload_0         
	//   71  136:getfield        #86  <Field Rect b>
	//   72  139:getfield        #121 <Field int Rect.left>
	//   73  142:iload_3         
	//   74  143:aload_0         
	//   75  144:getfield        #86  <Field Rect b>
	//   76  147:getfield        #118 <Field int Rect.bottom>
	//   77  150:isub            
	//   78  151:invokevirtual   #108 <Method void Rect.set(int, int, int, int)>
			a.setBounds(c);
	//   79  154:aload_0         
	//   80  155:getfield        #57  <Field Drawable a>
	//   81  158:aload_0         
	//   82  159:getfield        #28  <Field Rect c>
	//   83  162:invokevirtual   #114 <Method void Drawable.setBounds(Rect)>
			a.draw(canvas);
	//   84  165:aload_0         
	//   85  166:getfield        #57  <Field Drawable a>
	//   86  169:aload_1         
	//   87  170:invokevirtual   #115 <Method void Drawable.draw(Canvas)>
			c.set(i - b.right, b.top, i, j - b.bottom);
	//   88  173:aload_0         
	//   89  174:getfield        #28  <Field Rect c>
	//   90  177:iload_2         
	//   91  178:aload_0         
	//   92  179:getfield        #86  <Field Rect b>
	//   93  182:getfield        #124 <Field int Rect.right>
	//   94  185:isub            
	//   95  186:aload_0         
	//   96  187:getfield        #86  <Field Rect b>
	//   97  190:getfield        #104 <Field int Rect.top>
	//   98  193:iload_2         
	//   99  194:iload_3         
	//  100  195:aload_0         
	//  101  196:getfield        #86  <Field Rect b>
	//  102  199:getfield        #118 <Field int Rect.bottom>
	//  103  202:isub            
	//  104  203:invokevirtual   #108 <Method void Rect.set(int, int, int, int)>
			a.setBounds(c);
	//  105  206:aload_0         
	//  106  207:getfield        #57  <Field Drawable a>
	//  107  210:aload_0         
	//  108  211:getfield        #28  <Field Rect c>
	//  109  214:invokevirtual   #114 <Method void Drawable.setBounds(Rect)>
			a.draw(canvas);
	//  110  217:aload_0         
	//  111  218:getfield        #57  <Field Drawable a>
	//  112  221:aload_1         
	//  113  222:invokevirtual   #115 <Method void Drawable.draw(Canvas)>
			canvas.restoreToCount(k);
	//  114  225:aload_1         
	//  115  226:iload           4
	//  116  228:invokevirtual   #128 <Method void Canvas.restoreToCount(int)>
		}
	//  117  231:return          
	}

	protected void onAttachedToWindow()
	{
		super.onAttachedToWindow();
	//    0    0:aload_0         
	//    1    1:invokespecial   #131 <Method void FrameLayout.onAttachedToWindow()>
		if(a != null)
	//*   2    4:aload_0         
	//*   3    5:getfield        #57  <Field Drawable a>
	//*   4    8:ifnull          19
			a.setCallback(((android.graphics.drawable.Drawable.Callback) (this)));
	//    5   11:aload_0         
	//    6   12:getfield        #57  <Field Drawable a>
	//    7   15:aload_0         
	//    8   16:invokevirtual   #135 <Method void Drawable.setCallback(android.graphics.drawable.Drawable$Callback)>
	//    9   19:return          
	}

	protected void onDetachedFromWindow()
	{
		super.onDetachedFromWindow();
	//    0    0:aload_0         
	//    1    1:invokespecial   #138 <Method void FrameLayout.onDetachedFromWindow()>
		if(a != null)
	//*   2    4:aload_0         
	//*   3    5:getfield        #57  <Field Drawable a>
	//*   4    8:ifnull          19
			a.setCallback(((android.graphics.drawable.Drawable.Callback) (null)));
	//    5   11:aload_0         
	//    6   12:getfield        #57  <Field Drawable a>
	//    7   15:aconst_null     
	//    8   16:invokevirtual   #135 <Method void Drawable.setCallback(android.graphics.drawable.Drawable$Callback)>
	//    9   19:return          
	}

	Drawable a;
	Rect b;
	private Rect c;
}

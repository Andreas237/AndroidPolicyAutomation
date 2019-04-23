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

// Referenced classes of package android.support.design.internal:
//			ThemeEnforcement

public class ScrimInsetsFrameLayout extends FrameLayout
{

	public ScrimInsetsFrameLayout(Context context)
	{
		this(context, ((AttributeSet) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:invokespecial   #20  <Method void ScrimInsetsFrameLayout(Context, AttributeSet)>
	//    4    6:return          
	}

	public ScrimInsetsFrameLayout(Context context, AttributeSet attributeset)
	{
		this(context, attributeset, 0);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iconst_0        
	//    4    4:invokespecial   #24  <Method void ScrimInsetsFrameLayout(Context, AttributeSet, int)>
	//    5    7:return          
	}

	public ScrimInsetsFrameLayout(Context context, AttributeSet attributeset, int i)
	{
		super(context, attributeset, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:invokespecial   #25  <Method void FrameLayout(Context, AttributeSet, int)>
		tempRect = new Rect();
	//    5    7:aload_0         
	//    6    8:new             #27  <Class Rect>
	//    7   11:dup             
	//    8   12:invokespecial   #30  <Method void Rect()>
	//    9   15:putfield        #32  <Field Rect tempRect>
		context = ((Context) (ThemeEnforcement.obtainStyledAttributes(context, attributeset, android.support.design.R.styleable.ScrimInsetsFrameLayout, i, android.support.design.R.style.Widget_Design_ScrimInsetsFrameLayout, new int[0])));
	//   10   18:aload_1         
	//   11   19:aload_2         
	//   12   20:getstatic       #38  <Field int[] android.support.design.R$styleable.ScrimInsetsFrameLayout>
	//   13   23:iload_3         
	//   14   24:getstatic       #44  <Field int android.support.design.R$style.Widget_Design_ScrimInsetsFrameLayout>
	//   15   27:iconst_0        
	//   16   28:newarray        int[]
	//   17   30:invokestatic    #50  <Method TypedArray ThemeEnforcement.obtainStyledAttributes(Context, AttributeSet, int[], int, int, int[])>
	//   18   33:astore_1        
		insetForeground = ((TypedArray) (context)).getDrawable(android.support.design.R.styleable.ScrimInsetsFrameLayout_insetForeground);
	//   19   34:aload_0         
	//   20   35:aload_1         
	//   21   36:getstatic       #53  <Field int android.support.design.R$styleable.ScrimInsetsFrameLayout_insetForeground>
	//   22   39:invokevirtual   #59  <Method Drawable TypedArray.getDrawable(int)>
	//   23   42:putfield        #61  <Field Drawable insetForeground>
		((TypedArray) (context)).recycle();
	//   24   45:aload_1         
	//   25   46:invokevirtual   #64  <Method void TypedArray.recycle()>
		setWillNotDraw(true);
	//   26   49:aload_0         
	//   27   50:iconst_1        
	//   28   51:invokevirtual   #68  <Method void setWillNotDraw(boolean)>
		ViewCompat.setOnApplyWindowInsetsListener(((View) (this)), new OnApplyWindowInsetsListener() {

			public WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowinsetscompat)
			{
				if(insets == null)
			//*   0    0:aload_0         
			//*   1    1:getfield        #16  <Field ScrimInsetsFrameLayout this$0>
			//*   2    4:getfield        #26  <Field Rect ScrimInsetsFrameLayout.insets>
			//*   3    7:ifnonnull       24
					insets = new Rect();
			//    4   10:aload_0         
			//    5   11:getfield        #16  <Field ScrimInsetsFrameLayout this$0>
			//    6   14:new             #28  <Class Rect>
			//    7   17:dup             
			//    8   18:invokespecial   #29  <Method void Rect()>
			//    9   21:putfield        #26  <Field Rect ScrimInsetsFrameLayout.insets>
				insets.set(windowinsetscompat.getSystemWindowInsetLeft(), windowinsetscompat.getSystemWindowInsetTop(), windowinsetscompat.getSystemWindowInsetRight(), windowinsetscompat.getSystemWindowInsetBottom());
			//   10   24:aload_0         
			//   11   25:getfield        #16  <Field ScrimInsetsFrameLayout this$0>
			//   12   28:getfield        #26  <Field Rect ScrimInsetsFrameLayout.insets>
			//   13   31:aload_2         
			//   14   32:invokevirtual   #35  <Method int WindowInsetsCompat.getSystemWindowInsetLeft()>
			//   15   35:aload_2         
			//   16   36:invokevirtual   #38  <Method int WindowInsetsCompat.getSystemWindowInsetTop()>
			//   17   39:aload_2         
			//   18   40:invokevirtual   #41  <Method int WindowInsetsCompat.getSystemWindowInsetRight()>
			//   19   43:aload_2         
			//   20   44:invokevirtual   #44  <Method int WindowInsetsCompat.getSystemWindowInsetBottom()>
			//   21   47:invokevirtual   #48  <Method void Rect.set(int, int, int, int)>
				onInsetsChanged(windowinsetscompat);
			//   22   50:aload_0         
			//   23   51:getfield        #16  <Field ScrimInsetsFrameLayout this$0>
			//   24   54:aload_2         
			//   25   55:invokevirtual   #52  <Method void ScrimInsetsFrameLayout.onInsetsChanged(WindowInsetsCompat)>
				view = ((View) (ScrimInsetsFrameLayout.this));
			//   26   58:aload_0         
			//   27   59:getfield        #16  <Field ScrimInsetsFrameLayout this$0>
			//   28   62:astore_1        
				boolean flag;
				if(windowinsetscompat.hasSystemWindowInsets() && insetForeground != null)
			//*  29   63:aload_2         
			//*  30   64:invokevirtual   #56  <Method boolean WindowInsetsCompat.hasSystemWindowInsets()>
			//*  31   67:ifeq            88
			//*  32   70:aload_0         
			//*  33   71:getfield        #16  <Field ScrimInsetsFrameLayout this$0>
			//*  34   74:getfield        #60  <Field Drawable ScrimInsetsFrameLayout.insetForeground>
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
			//   44   92:invokevirtual   #64  <Method void ScrimInsetsFrameLayout.setWillNotDraw(boolean)>
				ViewCompat.postInvalidateOnAnimation(((View) (ScrimInsetsFrameLayout.this)));
			//   45   95:aload_0         
			//   46   96:getfield        #16  <Field ScrimInsetsFrameLayout this$0>
			//   47   99:invokestatic    #70  <Method void ViewCompat.postInvalidateOnAnimation(View)>
				return windowinsetscompat.consumeSystemWindowInsets();
			//   48  102:aload_2         
			//   49  103:invokevirtual   #74  <Method WindowInsetsCompat WindowInsetsCompat.consumeSystemWindowInsets()>
			//   50  106:areturn         
			}

			final ScrimInsetsFrameLayout this$0;

			
			{
				this$0 = ScrimInsetsFrameLayout.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field ScrimInsetsFrameLayout this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
		}
);
	//   29   54:aload_0         
	//   30   55:new             #6   <Class ScrimInsetsFrameLayout$1>
	//   31   58:dup             
	//   32   59:aload_0         
	//   33   60:invokespecial   #71  <Method void ScrimInsetsFrameLayout$1(ScrimInsetsFrameLayout)>
	//   34   63:invokestatic    #77  <Method void ViewCompat.setOnApplyWindowInsetsListener(View, OnApplyWindowInsetsListener)>
	//   35   66:return          
	}

	public void draw(Canvas canvas)
	{
		super.draw(canvas);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #82  <Method void FrameLayout.draw(Canvas)>
		int i = getWidth();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #86  <Method int getWidth()>
	//    5    9:istore_2        
		int j = getHeight();
	//    6   10:aload_0         
	//    7   11:invokevirtual   #89  <Method int getHeight()>
	//    8   14:istore_3        
		if(insets != null && insetForeground != null)
	//*   9   15:aload_0         
	//*  10   16:getfield        #91  <Field Rect insets>
	//*  11   19:ifnull          231
	//*  12   22:aload_0         
	//*  13   23:getfield        #61  <Field Drawable insetForeground>
	//*  14   26:ifnull          231
		{
			int k = canvas.save();
	//   15   29:aload_1         
	//   16   30:invokevirtual   #96  <Method int Canvas.save()>
	//   17   33:istore          4
			canvas.translate(getScrollX(), getScrollY());
	//   18   35:aload_1         
	//   19   36:aload_0         
	//   20   37:invokevirtual   #99  <Method int getScrollX()>
	//   21   40:i2f             
	//   22   41:aload_0         
	//   23   42:invokevirtual   #102 <Method int getScrollY()>
	//   24   45:i2f             
	//   25   46:invokevirtual   #106 <Method void Canvas.translate(float, float)>
			tempRect.set(0, 0, i, insets.top);
	//   26   49:aload_0         
	//   27   50:getfield        #32  <Field Rect tempRect>
	//   28   53:iconst_0        
	//   29   54:iconst_0        
	//   30   55:iload_2         
	//   31   56:aload_0         
	//   32   57:getfield        #91  <Field Rect insets>
	//   33   60:getfield        #109 <Field int Rect.top>
	//   34   63:invokevirtual   #113 <Method void Rect.set(int, int, int, int)>
			insetForeground.setBounds(tempRect);
	//   35   66:aload_0         
	//   36   67:getfield        #61  <Field Drawable insetForeground>
	//   37   70:aload_0         
	//   38   71:getfield        #32  <Field Rect tempRect>
	//   39   74:invokevirtual   #119 <Method void Drawable.setBounds(Rect)>
			insetForeground.draw(canvas);
	//   40   77:aload_0         
	//   41   78:getfield        #61  <Field Drawable insetForeground>
	//   42   81:aload_1         
	//   43   82:invokevirtual   #120 <Method void Drawable.draw(Canvas)>
			tempRect.set(0, j - insets.bottom, i, j);
	//   44   85:aload_0         
	//   45   86:getfield        #32  <Field Rect tempRect>
	//   46   89:iconst_0        
	//   47   90:iload_3         
	//   48   91:aload_0         
	//   49   92:getfield        #91  <Field Rect insets>
	//   50   95:getfield        #123 <Field int Rect.bottom>
	//   51   98:isub            
	//   52   99:iload_2         
	//   53  100:iload_3         
	//   54  101:invokevirtual   #113 <Method void Rect.set(int, int, int, int)>
			insetForeground.setBounds(tempRect);
	//   55  104:aload_0         
	//   56  105:getfield        #61  <Field Drawable insetForeground>
	//   57  108:aload_0         
	//   58  109:getfield        #32  <Field Rect tempRect>
	//   59  112:invokevirtual   #119 <Method void Drawable.setBounds(Rect)>
			insetForeground.draw(canvas);
	//   60  115:aload_0         
	//   61  116:getfield        #61  <Field Drawable insetForeground>
	//   62  119:aload_1         
	//   63  120:invokevirtual   #120 <Method void Drawable.draw(Canvas)>
			tempRect.set(0, insets.top, insets.left, j - insets.bottom);
	//   64  123:aload_0         
	//   65  124:getfield        #32  <Field Rect tempRect>
	//   66  127:iconst_0        
	//   67  128:aload_0         
	//   68  129:getfield        #91  <Field Rect insets>
	//   69  132:getfield        #109 <Field int Rect.top>
	//   70  135:aload_0         
	//   71  136:getfield        #91  <Field Rect insets>
	//   72  139:getfield        #126 <Field int Rect.left>
	//   73  142:iload_3         
	//   74  143:aload_0         
	//   75  144:getfield        #91  <Field Rect insets>
	//   76  147:getfield        #123 <Field int Rect.bottom>
	//   77  150:isub            
	//   78  151:invokevirtual   #113 <Method void Rect.set(int, int, int, int)>
			insetForeground.setBounds(tempRect);
	//   79  154:aload_0         
	//   80  155:getfield        #61  <Field Drawable insetForeground>
	//   81  158:aload_0         
	//   82  159:getfield        #32  <Field Rect tempRect>
	//   83  162:invokevirtual   #119 <Method void Drawable.setBounds(Rect)>
			insetForeground.draw(canvas);
	//   84  165:aload_0         
	//   85  166:getfield        #61  <Field Drawable insetForeground>
	//   86  169:aload_1         
	//   87  170:invokevirtual   #120 <Method void Drawable.draw(Canvas)>
			tempRect.set(i - insets.right, insets.top, i, j - insets.bottom);
	//   88  173:aload_0         
	//   89  174:getfield        #32  <Field Rect tempRect>
	//   90  177:iload_2         
	//   91  178:aload_0         
	//   92  179:getfield        #91  <Field Rect insets>
	//   93  182:getfield        #129 <Field int Rect.right>
	//   94  185:isub            
	//   95  186:aload_0         
	//   96  187:getfield        #91  <Field Rect insets>
	//   97  190:getfield        #109 <Field int Rect.top>
	//   98  193:iload_2         
	//   99  194:iload_3         
	//  100  195:aload_0         
	//  101  196:getfield        #91  <Field Rect insets>
	//  102  199:getfield        #123 <Field int Rect.bottom>
	//  103  202:isub            
	//  104  203:invokevirtual   #113 <Method void Rect.set(int, int, int, int)>
			insetForeground.setBounds(tempRect);
	//  105  206:aload_0         
	//  106  207:getfield        #61  <Field Drawable insetForeground>
	//  107  210:aload_0         
	//  108  211:getfield        #32  <Field Rect tempRect>
	//  109  214:invokevirtual   #119 <Method void Drawable.setBounds(Rect)>
			insetForeground.draw(canvas);
	//  110  217:aload_0         
	//  111  218:getfield        #61  <Field Drawable insetForeground>
	//  112  221:aload_1         
	//  113  222:invokevirtual   #120 <Method void Drawable.draw(Canvas)>
			canvas.restoreToCount(k);
	//  114  225:aload_1         
	//  115  226:iload           4
	//  116  228:invokevirtual   #133 <Method void Canvas.restoreToCount(int)>
		}
	//  117  231:return          
	}

	protected void onAttachedToWindow()
	{
		super.onAttachedToWindow();
	//    0    0:aload_0         
	//    1    1:invokespecial   #137 <Method void FrameLayout.onAttachedToWindow()>
		Drawable drawable = insetForeground;
	//    2    4:aload_0         
	//    3    5:getfield        #61  <Field Drawable insetForeground>
	//    4    8:astore_1        
		if(drawable != null)
	//*   5    9:aload_1         
	//*   6   10:ifnull          18
			drawable.setCallback(((android.graphics.drawable.Drawable.Callback) (this)));
	//    7   13:aload_1         
	//    8   14:aload_0         
	//    9   15:invokevirtual   #141 <Method void Drawable.setCallback(android.graphics.drawable.Drawable$Callback)>
	//   10   18:return          
	}

	protected void onDetachedFromWindow()
	{
		super.onDetachedFromWindow();
	//    0    0:aload_0         
	//    1    1:invokespecial   #144 <Method void FrameLayout.onDetachedFromWindow()>
		Drawable drawable = insetForeground;
	//    2    4:aload_0         
	//    3    5:getfield        #61  <Field Drawable insetForeground>
	//    4    8:astore_1        
		if(drawable != null)
	//*   5    9:aload_1         
	//*   6   10:ifnull          18
			drawable.setCallback(((android.graphics.drawable.Drawable.Callback) (null)));
	//    7   13:aload_1         
	//    8   14:aconst_null     
	//    9   15:invokevirtual   #141 <Method void Drawable.setCallback(android.graphics.drawable.Drawable$Callback)>
	//   10   18:return          
	}

	protected void onInsetsChanged(WindowInsetsCompat windowinsetscompat)
	{
	//    0    0:return          
	}

	Drawable insetForeground;
	Rect insets;
	private Rect tempRect;
}

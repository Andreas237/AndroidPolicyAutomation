// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.pactforcure.app.ui.view;

import android.animation.*;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

public class CircleIndicatorView extends View
{

	public CircleIndicatorView(Context context)
	{
		super(context);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #37  <Method void View(Context)>
		init(((AttributeSet) (null)), 0);
	//    3    5:aload_0         
	//    4    6:aconst_null     
	//    5    7:iconst_0        
	//    6    8:invokespecial   #41  <Method void init(AttributeSet, int)>
	//    7   11:return          
	}

	public CircleIndicatorView(Context context, AttributeSet attributeset)
	{
		super(context, attributeset);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #45  <Method void View(Context, AttributeSet)>
		init(attributeset, 0);
	//    4    6:aload_0         
	//    5    7:aload_2         
	//    6    8:iconst_0        
	//    7    9:invokespecial   #41  <Method void init(AttributeSet, int)>
	//    8   12:return          
	}

	public CircleIndicatorView(Context context, AttributeSet attributeset, int i)
	{
		super(context, attributeset, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:invokespecial   #48  <Method void View(Context, AttributeSet, int)>
		init(attributeset, i);
	//    5    7:aload_0         
	//    6    8:aload_2         
	//    7    9:iload_3         
	//    8   10:invokespecial   #41  <Method void init(AttributeSet, int)>
	//    9   13:return          
	}

	private int calculateDesiredWidth()
	{
		if(totalIndicators == 1)
	//*   0    0:aload_0         
	//*   1    1:getfield        #63  <Field int totalIndicators>
	//*   2    4:iconst_1        
	//*   3    5:icmpne          16
			return (int)(radius * 2.0F);
	//    4    8:aload_0         
	//    5    9:getfield        #65  <Field float radius>
	//    6   12:fconst_2        
	//    7   13:fmul            
	//    8   14:f2i             
	//    9   15:ireturn         
		else
			return (int)((float)(totalIndicators - 1) * radius * 4.1F + radius * 2.0F);
	//   10   16:aload_0         
	//   11   17:getfield        #63  <Field int totalIndicators>
	//   12   20:iconst_1        
	//   13   21:isub            
	//   14   22:i2f             
	//   15   23:aload_0         
	//   16   24:getfield        #65  <Field float radius>
	//   17   27:fmul            
	//   18   28:ldc1            #66  <Float 4.1F>
	//   19   30:fmul            
	//   20   31:aload_0         
	//   21   32:getfield        #65  <Field float radius>
	//   22   35:fconst_2        
	//   23   36:fmul            
	//   24   37:fadd            
	//   25   38:f2i             
	//   26   39:ireturn         
	}

	private void init(AttributeSet attributeset, int i)
	{
		attributeset = ((AttributeSet) (getContext().getTheme().obtainStyledAttributes(attributeset, com.pactforcure.app.R.styleable.CircleIndicatorView, 0, 0)));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #70  <Method Context getContext()>
	//    2    4:invokevirtual   #76  <Method android.content.res.Resources$Theme Context.getTheme()>
	//    3    7:aload_1         
	//    4    8:getstatic       #82  <Field int[] com.pactforcure.app.R$styleable.CircleIndicatorView>
	//    5   11:iconst_0        
	//    6   12:iconst_0        
	//    7   13:invokevirtual   #88  <Method TypedArray android.content.res.Resources$Theme.obtainStyledAttributes(AttributeSet, int[], int, int)>
	//    8   16:astore_1        
		totalIndicators = ((TypedArray) (attributeset)).getInt(0, 0);
	//    9   17:aload_0         
	//   10   18:aload_1         
	//   11   19:iconst_0        
	//   12   20:iconst_0        
	//   13   21:invokevirtual   #94  <Method int TypedArray.getInt(int, int)>
	//   14   24:putfield        #63  <Field int totalIndicators>
		((TypedArray) (attributeset)).recycle();
	//   15   27:aload_1         
	//   16   28:invokevirtual   #98  <Method void TypedArray.recycle()>
		radius = getResources().getDimension(0x7f09008c);
	//   17   31:aload_0         
	//   18   32:aload_0         
	//   19   33:invokevirtual   #102 <Method Resources getResources()>
	//   20   36:ldc1            #103 <Int 0x7f09008c>
	//   21   38:invokevirtual   #109 <Method float Resources.getDimension(int)>
	//   22   41:putfield        #65  <Field float radius>
		regularPaint = new Paint();
	//   23   44:aload_0         
	//   24   45:new             #111 <Class Paint>
	//   25   48:dup             
	//   26   49:invokespecial   #113 <Method void Paint()>
	//   27   52:putfield        #115 <Field Paint regularPaint>
		regularPaint.setAntiAlias(true);
	//   28   55:aload_0         
	//   29   56:getfield        #115 <Field Paint regularPaint>
	//   30   59:iconst_1        
	//   31   60:invokevirtual   #119 <Method void Paint.setAntiAlias(boolean)>
		greyColor = getResources().getColor(0x7f0d0023);
	//   32   63:aload_0         
	//   33   64:aload_0         
	//   34   65:invokevirtual   #102 <Method Resources getResources()>
	//   35   68:ldc1            #120 <Int 0x7f0d0023>
	//   36   70:invokevirtual   #124 <Method int Resources.getColor(int)>
	//   37   73:putfield        #126 <Field int greyColor>
		regularPaint.setColor(greyColor);
	//   38   76:aload_0         
	//   39   77:getfield        #115 <Field Paint regularPaint>
	//   40   80:aload_0         
	//   41   81:getfield        #126 <Field int greyColor>
	//   42   84:invokevirtual   #130 <Method void Paint.setColor(int)>
		activePaint = new Paint();
	//   43   87:aload_0         
	//   44   88:new             #111 <Class Paint>
	//   45   91:dup             
	//   46   92:invokespecial   #113 <Method void Paint()>
	//   47   95:putfield        #132 <Field Paint activePaint>
		activePaint.setAntiAlias(true);
	//   48   98:aload_0         
	//   49   99:getfield        #132 <Field Paint activePaint>
	//   50  102:iconst_1        
	//   51  103:invokevirtual   #119 <Method void Paint.setAntiAlias(boolean)>
		blackColor = getResources().getColor(0x7f0d0051);
	//   52  106:aload_0         
	//   53  107:aload_0         
	//   54  108:invokevirtual   #102 <Method Resources getResources()>
	//   55  111:ldc1            #133 <Int 0x7f0d0051>
	//   56  113:invokevirtual   #124 <Method int Resources.getColor(int)>
	//   57  116:putfield        #135 <Field int blackColor>
		activePaint.setColor(blackColor);
	//   58  119:aload_0         
	//   59  120:getfield        #132 <Field Paint activePaint>
	//   60  123:aload_0         
	//   61  124:getfield        #135 <Field int blackColor>
	//   62  127:invokevirtual   #130 <Method void Paint.setColor(int)>
		greyToBlackPaint = new Paint();
	//   63  130:aload_0         
	//   64  131:new             #111 <Class Paint>
	//   65  134:dup             
	//   66  135:invokespecial   #113 <Method void Paint()>
	//   67  138:putfield        #52  <Field Paint greyToBlackPaint>
		greyToBlackPaint.setAntiAlias(true);
	//   68  141:aload_0         
	//   69  142:getfield        #52  <Field Paint greyToBlackPaint>
	//   70  145:iconst_1        
	//   71  146:invokevirtual   #119 <Method void Paint.setAntiAlias(boolean)>
		blackToGrayPaint = new Paint();
	//   72  149:aload_0         
	//   73  150:new             #111 <Class Paint>
	//   74  153:dup             
	//   75  154:invokespecial   #113 <Method void Paint()>
	//   76  157:putfield        #59  <Field Paint blackToGrayPaint>
		blackToGrayPaint.setAntiAlias(true);
	//   77  160:aload_0         
	//   78  161:getfield        #59  <Field Paint blackToGrayPaint>
	//   79  164:iconst_1        
	//   80  165:invokevirtual   #119 <Method void Paint.setAntiAlias(boolean)>
		attributeset = ((AttributeSet) (new ArgbEvaluator()));
	//   81  168:new             #137 <Class ArgbEvaluator>
	//   82  171:dup             
	//   83  172:invokespecial   #138 <Method void ArgbEvaluator()>
	//   84  175:astore_1        
		fromGreyToBlackAnimator = ObjectAnimator.ofObject(((Object) (new Object() {

			public void setColor(int j)
			{
				greyToBlackPaint.setColor(j);
			//    0    0:aload_0         
			//    1    1:getfield        #15  <Field CircleIndicatorView this$0>
			//    2    4:invokestatic    #25  <Method Paint CircleIndicatorView.access$000(CircleIndicatorView)>
			//    3    7:iload_1         
			//    4    8:invokevirtual   #29  <Method void Paint.setColor(int)>
				invalidate();
			//    5   11:aload_0         
			//    6   12:getfield        #15  <Field CircleIndicatorView this$0>
			//    7   15:invokevirtual   #32  <Method void CircleIndicatorView.invalidate()>
			//    8   18:return          
			}

			final CircleIndicatorView this$0;

			
			{
				this$0 = CircleIndicatorView.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #15  <Field CircleIndicatorView this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #18  <Method void Object()>
			//    5    9:return          
			}
		}
)), "color", ((android.animation.TypeEvaluator) (attributeset)), new Object[] {
			Integer.valueOf(greyColor), Integer.valueOf(blackColor)
		});
	//   85  176:aload_0         
	//   86  177:new             #6   <Class CircleIndicatorView$1>
	//   87  180:dup             
	//   88  181:aload_0         
	//   89  182:invokespecial   #141 <Method void CircleIndicatorView$1(CircleIndicatorView)>
	//   90  185:ldc1            #143 <String "color">
	//   91  187:aload_1         
	//   92  188:iconst_2        
	//   93  189:anewarray       Object[]
	//   94  192:dup             
	//   95  193:iconst_0        
	//   96  194:aload_0         
	//   97  195:getfield        #126 <Field int greyColor>
	//   98  198:invokestatic    #151 <Method Integer Integer.valueOf(int)>
	//   99  201:aastore         
	//  100  202:dup             
	//  101  203:iconst_1        
	//  102  204:aload_0         
	//  103  205:getfield        #135 <Field int blackColor>
	//  104  208:invokestatic    #151 <Method Integer Integer.valueOf(int)>
	//  105  211:aastore         
	//  106  212:invokestatic    #157 <Method ObjectAnimator ObjectAnimator.ofObject(Object, String, android.animation.TypeEvaluator, Object[])>
	//  107  215:putfield        #159 <Field ObjectAnimator fromGreyToBlackAnimator>
		fromGreyToBlackAnimator.addListener(new android.animation.Animator.AnimatorListener() {

			public void onAnimationCancel(Animator animator)
			{
			//    0    0:return          
			}

			public void onAnimationEnd(Animator animator)
			{
				animatingColors = false;
			//    0    0:aload_0         
			//    1    1:getfield        #17  <Field CircleIndicatorView this$0>
			//    2    4:iconst_0        
			//    3    5:invokestatic    #28  <Method boolean CircleIndicatorView.access$102(CircleIndicatorView, boolean)>
			//    4    8:pop             
			//    5    9:return          
			}

			public void onAnimationRepeat(Animator animator)
			{
			//    0    0:return          
			}

			public void onAnimationStart(Animator animator)
			{
			//    0    0:return          
			}

			final CircleIndicatorView this$0;

			
			{
				this$0 = CircleIndicatorView.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field CircleIndicatorView this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #20  <Method void Object()>
			//    5    9:return          
			}
		}
);
	//  108  218:aload_0         
	//  109  219:getfield        #159 <Field ObjectAnimator fromGreyToBlackAnimator>
	//  110  222:new             #8   <Class CircleIndicatorView$2>
	//  111  225:dup             
	//  112  226:aload_0         
	//  113  227:invokespecial   #160 <Method void CircleIndicatorView$2(CircleIndicatorView)>
	//  114  230:invokevirtual   #164 <Method void ObjectAnimator.addListener(android.animation.Animator$AnimatorListener)>
		fromGreyToBlackAnimator.setDuration(200L);
	//  115  233:aload_0         
	//  116  234:getfield        #159 <Field ObjectAnimator fromGreyToBlackAnimator>
	//  117  237:ldc2w           #165 <Long 200L>
	//  118  240:invokevirtual   #170 <Method ObjectAnimator ObjectAnimator.setDuration(long)>
	//  119  243:pop             
		fromBlackToGrayAnimator = ObjectAnimator.ofObject(((Object) (new Object() {

			public void setColor(int j)
			{
				blackToGrayPaint.setColor(j);
			//    0    0:aload_0         
			//    1    1:getfield        #15  <Field CircleIndicatorView this$0>
			//    2    4:invokestatic    #25  <Method Paint CircleIndicatorView.access$200(CircleIndicatorView)>
			//    3    7:iload_1         
			//    4    8:invokevirtual   #29  <Method void Paint.setColor(int)>
				invalidate();
			//    5   11:aload_0         
			//    6   12:getfield        #15  <Field CircleIndicatorView this$0>
			//    7   15:invokevirtual   #32  <Method void CircleIndicatorView.invalidate()>
			//    8   18:return          
			}

			final CircleIndicatorView this$0;

			
			{
				this$0 = CircleIndicatorView.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #15  <Field CircleIndicatorView this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #18  <Method void Object()>
			//    5    9:return          
			}
		}
)), "color", ((android.animation.TypeEvaluator) (attributeset)), new Object[] {
			Integer.valueOf(blackColor), Integer.valueOf(greyColor)
		});
	//  120  244:aload_0         
	//  121  245:new             #10  <Class CircleIndicatorView$3>
	//  122  248:dup             
	//  123  249:aload_0         
	//  124  250:invokespecial   #171 <Method void CircleIndicatorView$3(CircleIndicatorView)>
	//  125  253:ldc1            #143 <String "color">
	//  126  255:aload_1         
	//  127  256:iconst_2        
	//  128  257:anewarray       Object[]
	//  129  260:dup             
	//  130  261:iconst_0        
	//  131  262:aload_0         
	//  132  263:getfield        #135 <Field int blackColor>
	//  133  266:invokestatic    #151 <Method Integer Integer.valueOf(int)>
	//  134  269:aastore         
	//  135  270:dup             
	//  136  271:iconst_1        
	//  137  272:aload_0         
	//  138  273:getfield        #126 <Field int greyColor>
	//  139  276:invokestatic    #151 <Method Integer Integer.valueOf(int)>
	//  140  279:aastore         
	//  141  280:invokestatic    #157 <Method ObjectAnimator ObjectAnimator.ofObject(Object, String, android.animation.TypeEvaluator, Object[])>
	//  142  283:putfield        #173 <Field ObjectAnimator fromBlackToGrayAnimator>
		fromBlackToGrayAnimator.setDuration(200L);
	//  143  286:aload_0         
	//  144  287:getfield        #173 <Field ObjectAnimator fromBlackToGrayAnimator>
	//  145  290:ldc2w           #165 <Long 200L>
	//  146  293:invokevirtual   #170 <Method ObjectAnimator ObjectAnimator.setDuration(long)>
	//  147  296:pop             
		return;
	//  148  297:return          
		Exception exception;
		exception;
	//  149  298:astore_3        
		((TypedArray) (attributeset)).recycle();
	//  150  299:aload_1         
	//  151  300:invokevirtual   #98  <Method void TypedArray.recycle()>
		throw exception;
	//  152  303:aload_3         
	//  153  304:athrow          
	}

	private void startColorAnimations()
	{
		animatingColors = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #56  <Field boolean animatingColors>
		fromBlackToGrayAnimator.start();
	//    3    5:aload_0         
	//    4    6:getfield        #173 <Field ObjectAnimator fromBlackToGrayAnimator>
	//    5    9:invokevirtual   #177 <Method void ObjectAnimator.start()>
		fromGreyToBlackAnimator.start();
	//    6   12:aload_0         
	//    7   13:getfield        #159 <Field ObjectAnimator fromGreyToBlackAnimator>
	//    8   16:invokevirtual   #177 <Method void ObjectAnimator.start()>
	//    9   19:return          
	}

	public int getTotalIndicators()
	{
		return totalIndicators;
	//    0    0:aload_0         
	//    1    1:getfield        #63  <Field int totalIndicators>
	//    2    4:ireturn         
	}

	protected void onDraw(Canvas canvas)
	{
		super.onDraw(canvas);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #182 <Method void View.onDraw(Canvas)>
		float f = 0.0F;
	//    3    5:fconst_0        
	//    4    6:fstore_2        
		int i = 0;
	//    5    7:iconst_0        
	//    6    8:istore_3        
		while(i < totalIndicators) 
	//*   7    9:iload_3         
	//*   8   10:aload_0         
	//*   9   11:getfield        #63  <Field int totalIndicators>
	//*  10   14:icmpge          151
		{
			Paint paint;
			if(animatingColors)
	//*  11   17:aload_0         
	//*  12   18:getfield        #56  <Field boolean animatingColors>
	//*  13   21:ifeq            125
			{
				int j = currentIndicatorIndex;
	//   14   24:aload_0         
	//   15   25:getfield        #184 <Field int currentIndicatorIndex>
	//   16   28:istore          5
				byte byte0;
				if(direction == 2)
	//*  17   30:aload_0         
	//*  18   31:getfield        #186 <Field int direction>
	//*  19   34:iconst_2        
	//*  20   35:icmpne          93
					byte0 = -1;
	//   21   38:iconst_m1       
	//   22   39:istore          4
				else
	//*  23   41:iload_3         
	//*  24   42:iload           4
	//*  25   44:iload           5
	//*  26   46:iadd            
	//*  27   47:icmpne          99
	//*  28   50:aload_0         
	//*  29   51:getfield        #59  <Field Paint blackToGrayPaint>
	//*  30   54:astore          6
	//*  31   56:aload_1         
	//*  32   57:aload_0         
	//*  33   58:getfield        #65  <Field float radius>
	//*  34   61:fload_2         
	//*  35   62:fadd            
	//*  36   63:aload_0         
	//*  37   64:getfield        #65  <Field float radius>
	//*  38   67:aload_0         
	//*  39   68:getfield        #65  <Field float radius>
	//*  40   71:aload           6
	//*  41   73:invokevirtual   #192 <Method void Canvas.drawCircle(float, float, float, Paint)>
	//*  42   76:fload_2         
	//*  43   77:ldc1            #66  <Float 4.1F>
	//*  44   79:aload_0         
	//*  45   80:getfield        #65  <Field float radius>
	//*  46   83:fmul            
	//*  47   84:fadd            
	//*  48   85:fstore_2        
	//*  49   86:iload_3         
	//*  50   87:iconst_1        
	//*  51   88:iadd            
	//*  52   89:istore_3        
	//*  53   90:goto            9
					byte0 = 1;
	//   54   93:iconst_1        
	//   55   94:istore          4
				if(i == byte0 + j)
					paint = blackToGrayPaint;
				else
	//*  56   96:goto            41
				if(i == currentIndicatorIndex)
	//*  57   99:iload_3         
	//*  58  100:aload_0         
	//*  59  101:getfield        #184 <Field int currentIndicatorIndex>
	//*  60  104:icmpne          116
					paint = greyToBlackPaint;
	//   61  107:aload_0         
	//   62  108:getfield        #52  <Field Paint greyToBlackPaint>
	//   63  111:astore          6
				else
	//*  64  113:goto            56
					paint = regularPaint;
	//   65  116:aload_0         
	//   66  117:getfield        #115 <Field Paint regularPaint>
	//   67  120:astore          6
			} else
	//*  68  122:goto            56
			if(i == currentIndicatorIndex)
	//*  69  125:iload_3         
	//*  70  126:aload_0         
	//*  71  127:getfield        #184 <Field int currentIndicatorIndex>
	//*  72  130:icmpne          142
				paint = activePaint;
	//   73  133:aload_0         
	//   74  134:getfield        #132 <Field Paint activePaint>
	//   75  137:astore          6
			else
	//*  76  139:goto            56
				paint = regularPaint;
	//   77  142:aload_0         
	//   78  143:getfield        #115 <Field Paint regularPaint>
	//   79  146:astore          6
			canvas.drawCircle(radius + f, radius, radius, paint);
			f += 4.1F * radius;
			i++;
		}
	//*  80  148:goto            139
	//   81  151:return          
	}

	protected void onMeasure(int i, int j)
	{
		int l = calculateDesiredWidth();
	//    0    0:aload_0         
	//    1    1:invokespecial   #196 <Method int calculateDesiredWidth()>
	//    2    4:istore          4
		int k = (int)(radius * 2.0F);
	//    3    6:aload_0         
	//    4    7:getfield        #65  <Field float radius>
	//    5   10:fconst_2        
	//    6   11:fmul            
	//    7   12:f2i             
	//    8   13:istore_3        
		int j1 = android.view.View.MeasureSpec.getMode(i);
	//    9   14:iload_1         
	//   10   15:invokestatic    #201 <Method int android.view.View$MeasureSpec.getMode(int)>
	//   11   18:istore          6
		i = android.view.View.MeasureSpec.getSize(i);
	//   12   20:iload_1         
	//   13   21:invokestatic    #204 <Method int android.view.View$MeasureSpec.getSize(int)>
	//   14   24:istore_1        
		int i1 = android.view.View.MeasureSpec.getMode(j);
	//   15   25:iload_2         
	//   16   26:invokestatic    #201 <Method int android.view.View$MeasureSpec.getMode(int)>
	//   17   29:istore          5
		j = android.view.View.MeasureSpec.getSize(j);
	//   18   31:iload_2         
	//   19   32:invokestatic    #204 <Method int android.view.View$MeasureSpec.getSize(int)>
	//   20   35:istore_2        
		if(j1 != 0x40000000)
	//*  21   36:iload           6
	//*  22   38:ldc1            #205 <Int 0x40000000>
	//*  23   40:icmpne          57
	//*  24   43:iload           5
	//*  25   45:ldc1            #205 <Int 0x40000000>
	//*  26   47:icmpne          80
	//*  27   50:aload_0         
	//*  28   51:iload_1         
	//*  29   52:iload_2         
	//*  30   53:invokevirtual   #208 <Method void setMeasuredDimension(int, int)>
	//*  31   56:return          
			if(j1 == 0x80000000)
	//*  32   57:iload           6
	//*  33   59:ldc1            #209 <Int 0x80000000>
	//*  34   61:icmpne          74
				i = Math.min(l, i);
	//   35   64:iload           4
	//   36   66:iload_1         
	//   37   67:invokestatic    #214 <Method int Math.min(int, int)>
	//   38   70:istore_1        
			else
	//*  39   71:goto            43
				i = l;
	//   40   74:iload           4
	//   41   76:istore_1        
		if(i1 != 0x40000000)
	//*  42   77:goto            43
			if(i1 == 0x80000000)
	//*  43   80:iload           5
	//*  44   82:ldc1            #209 <Int 0x80000000>
	//*  45   84:icmpne          96
				j = Math.min(k, j);
	//   46   87:iload_3         
	//   47   88:iload_2         
	//   48   89:invokestatic    #214 <Method int Math.min(int, int)>
	//   49   92:istore_2        
			else
	//*  50   93:goto            50
				j = k;
	//   51   96:iload_3         
	//   52   97:istore_2        
		setMeasuredDimension(i, j);
	//*  53   98:goto            50
	}

	public void showNext()
	{
		currentIndicatorIndex = currentIndicatorIndex + 1;
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #184 <Field int currentIndicatorIndex>
	//    3    5:iconst_1        
	//    4    6:iadd            
	//    5    7:putfield        #184 <Field int currentIndicatorIndex>
		direction = 2;
	//    6   10:aload_0         
	//    7   11:iconst_2        
	//    8   12:putfield        #186 <Field int direction>
		startColorAnimations();
	//    9   15:aload_0         
	//   10   16:invokespecial   #217 <Method void startColorAnimations()>
		invalidate();
	//   11   19:aload_0         
	//   12   20:invokevirtual   #220 <Method void invalidate()>
	//   13   23:return          
	}

	public void showPrevious()
	{
		currentIndicatorIndex = currentIndicatorIndex - 1;
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #184 <Field int currentIndicatorIndex>
	//    3    5:iconst_1        
	//    4    6:isub            
	//    5    7:putfield        #184 <Field int currentIndicatorIndex>
		direction = 1;
	//    6   10:aload_0         
	//    7   11:iconst_1        
	//    8   12:putfield        #186 <Field int direction>
		startColorAnimations();
	//    9   15:aload_0         
	//   10   16:invokespecial   #217 <Method void startColorAnimations()>
		invalidate();
	//   11   19:aload_0         
	//   12   20:invokevirtual   #220 <Method void invalidate()>
	//   13   23:return          
	}

	private static final short GOING_BACK = 1;
	private static final short GOING_FWD = 2;
	private Paint activePaint;
	private boolean animatingColors;
	private int blackColor;
	private Paint blackToGrayPaint;
	private int currentIndicatorIndex;
	private int direction;
	private ObjectAnimator fromBlackToGrayAnimator;
	private ObjectAnimator fromGreyToBlackAnimator;
	private int greyColor;
	private Paint greyToBlackPaint;
	private float radius;
	private Paint regularPaint;
	private int totalIndicators;


/*
	static Paint access$000(CircleIndicatorView circleindicatorview)
	{
		return circleindicatorview.greyToBlackPaint;
	//    0    0:aload_0         
	//    1    1:getfield        #52  <Field Paint greyToBlackPaint>
	//    2    4:areturn         
	}

*/


/*
	static boolean access$102(CircleIndicatorView circleindicatorview, boolean flag)
	{
		circleindicatorview.animatingColors = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #56  <Field boolean animatingColors>
		return flag;
	//    3    5:iload_1         
	//    4    6:ireturn         
	}

*/


/*
	static Paint access$200(CircleIndicatorView circleindicatorview)
	{
		return circleindicatorview.blackToGrayPaint;
	//    0    0:aload_0         
	//    1    1:getfield        #59  <Field Paint blackToGrayPaint>
	//    2    4:areturn         
	}

*/
}

// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.internal;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;

public class ScrimInsetsFrameLayout extends FrameLayout
{

	public void draw(Canvas canvas)
	{
		super.draw(canvas);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #18  <Method void FrameLayout.draw(Canvas)>
		int i = getWidth();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #22  <Method int getWidth()>
	//    5    9:istore_2        
		int j = getHeight();
	//    6   10:aload_0         
	//    7   11:invokevirtual   #25  <Method int getHeight()>
	//    8   14:istore_3        
		if(insets != null && insetForeground != null)
	//*   9   15:aload_0         
	//*  10   16:getfield        #27  <Field Rect insets>
	//*  11   19:ifnull          231
	//*  12   22:aload_0         
	//*  13   23:getfield        #29  <Field Drawable insetForeground>
	//*  14   26:ifnull          231
		{
			int k = canvas.save();
	//   15   29:aload_1         
	//   16   30:invokevirtual   #34  <Method int Canvas.save()>
	//   17   33:istore          4
			canvas.translate(getScrollX(), getScrollY());
	//   18   35:aload_1         
	//   19   36:aload_0         
	//   20   37:invokevirtual   #37  <Method int getScrollX()>
	//   21   40:i2f             
	//   22   41:aload_0         
	//   23   42:invokevirtual   #40  <Method int getScrollY()>
	//   24   45:i2f             
	//   25   46:invokevirtual   #44  <Method void Canvas.translate(float, float)>
			tempRect.set(0, 0, i, insets.top);
	//   26   49:aload_0         
	//   27   50:getfield        #46  <Field Rect tempRect>
	//   28   53:iconst_0        
	//   29   54:iconst_0        
	//   30   55:iload_2         
	//   31   56:aload_0         
	//   32   57:getfield        #27  <Field Rect insets>
	//   33   60:getfield        #52  <Field int Rect.top>
	//   34   63:invokevirtual   #56  <Method void Rect.set(int, int, int, int)>
			insetForeground.setBounds(tempRect);
	//   35   66:aload_0         
	//   36   67:getfield        #29  <Field Drawable insetForeground>
	//   37   70:aload_0         
	//   38   71:getfield        #46  <Field Rect tempRect>
	//   39   74:invokevirtual   #62  <Method void Drawable.setBounds(Rect)>
			insetForeground.draw(canvas);
	//   40   77:aload_0         
	//   41   78:getfield        #29  <Field Drawable insetForeground>
	//   42   81:aload_1         
	//   43   82:invokevirtual   #63  <Method void Drawable.draw(Canvas)>
			tempRect.set(0, j - insets.bottom, i, j);
	//   44   85:aload_0         
	//   45   86:getfield        #46  <Field Rect tempRect>
	//   46   89:iconst_0        
	//   47   90:iload_3         
	//   48   91:aload_0         
	//   49   92:getfield        #27  <Field Rect insets>
	//   50   95:getfield        #66  <Field int Rect.bottom>
	//   51   98:isub            
	//   52   99:iload_2         
	//   53  100:iload_3         
	//   54  101:invokevirtual   #56  <Method void Rect.set(int, int, int, int)>
			insetForeground.setBounds(tempRect);
	//   55  104:aload_0         
	//   56  105:getfield        #29  <Field Drawable insetForeground>
	//   57  108:aload_0         
	//   58  109:getfield        #46  <Field Rect tempRect>
	//   59  112:invokevirtual   #62  <Method void Drawable.setBounds(Rect)>
			insetForeground.draw(canvas);
	//   60  115:aload_0         
	//   61  116:getfield        #29  <Field Drawable insetForeground>
	//   62  119:aload_1         
	//   63  120:invokevirtual   #63  <Method void Drawable.draw(Canvas)>
			tempRect.set(0, insets.top, insets.left, j - insets.bottom);
	//   64  123:aload_0         
	//   65  124:getfield        #46  <Field Rect tempRect>
	//   66  127:iconst_0        
	//   67  128:aload_0         
	//   68  129:getfield        #27  <Field Rect insets>
	//   69  132:getfield        #52  <Field int Rect.top>
	//   70  135:aload_0         
	//   71  136:getfield        #27  <Field Rect insets>
	//   72  139:getfield        #69  <Field int Rect.left>
	//   73  142:iload_3         
	//   74  143:aload_0         
	//   75  144:getfield        #27  <Field Rect insets>
	//   76  147:getfield        #66  <Field int Rect.bottom>
	//   77  150:isub            
	//   78  151:invokevirtual   #56  <Method void Rect.set(int, int, int, int)>
			insetForeground.setBounds(tempRect);
	//   79  154:aload_0         
	//   80  155:getfield        #29  <Field Drawable insetForeground>
	//   81  158:aload_0         
	//   82  159:getfield        #46  <Field Rect tempRect>
	//   83  162:invokevirtual   #62  <Method void Drawable.setBounds(Rect)>
			insetForeground.draw(canvas);
	//   84  165:aload_0         
	//   85  166:getfield        #29  <Field Drawable insetForeground>
	//   86  169:aload_1         
	//   87  170:invokevirtual   #63  <Method void Drawable.draw(Canvas)>
			tempRect.set(i - insets.right, insets.top, i, j - insets.bottom);
	//   88  173:aload_0         
	//   89  174:getfield        #46  <Field Rect tempRect>
	//   90  177:iload_2         
	//   91  178:aload_0         
	//   92  179:getfield        #27  <Field Rect insets>
	//   93  182:getfield        #72  <Field int Rect.right>
	//   94  185:isub            
	//   95  186:aload_0         
	//   96  187:getfield        #27  <Field Rect insets>
	//   97  190:getfield        #52  <Field int Rect.top>
	//   98  193:iload_2         
	//   99  194:iload_3         
	//  100  195:aload_0         
	//  101  196:getfield        #27  <Field Rect insets>
	//  102  199:getfield        #66  <Field int Rect.bottom>
	//  103  202:isub            
	//  104  203:invokevirtual   #56  <Method void Rect.set(int, int, int, int)>
			insetForeground.setBounds(tempRect);
	//  105  206:aload_0         
	//  106  207:getfield        #29  <Field Drawable insetForeground>
	//  107  210:aload_0         
	//  108  211:getfield        #46  <Field Rect tempRect>
	//  109  214:invokevirtual   #62  <Method void Drawable.setBounds(Rect)>
			insetForeground.draw(canvas);
	//  110  217:aload_0         
	//  111  218:getfield        #29  <Field Drawable insetForeground>
	//  112  221:aload_1         
	//  113  222:invokevirtual   #63  <Method void Drawable.draw(Canvas)>
			canvas.restoreToCount(k);
	//  114  225:aload_1         
	//  115  226:iload           4
	//  116  228:invokevirtual   #76  <Method void Canvas.restoreToCount(int)>
		}
	//  117  231:return          
	}

	protected void onAttachedToWindow()
	{
		super.onAttachedToWindow();
	//    0    0:aload_0         
	//    1    1:invokespecial   #82  <Method void FrameLayout.onAttachedToWindow()>
		Drawable drawable = insetForeground;
	//    2    4:aload_0         
	//    3    5:getfield        #29  <Field Drawable insetForeground>
	//    4    8:astore_1        
		if(drawable != null)
	//*   5    9:aload_1         
	//*   6   10:ifnull          18
			drawable.setCallback(((android.graphics.drawable.Drawable.Callback) (this)));
	//    7   13:aload_1         
	//    8   14:aload_0         
	//    9   15:invokevirtual   #86  <Method void Drawable.setCallback(android.graphics.drawable.Drawable$Callback)>
	//   10   18:return          
	}

	protected void onDetachedFromWindow()
	{
		super.onDetachedFromWindow();
	//    0    0:aload_0         
	//    1    1:invokespecial   #89  <Method void FrameLayout.onDetachedFromWindow()>
		Drawable drawable = insetForeground;
	//    2    4:aload_0         
	//    3    5:getfield        #29  <Field Drawable insetForeground>
	//    4    8:astore_1        
		if(drawable != null)
	//*   5    9:aload_1         
	//*   6   10:ifnull          18
			drawable.setCallback(((android.graphics.drawable.Drawable.Callback) (null)));
	//    7   13:aload_1         
	//    8   14:aconst_null     
	//    9   15:invokevirtual   #86  <Method void Drawable.setCallback(android.graphics.drawable.Drawable$Callback)>
	//   10   18:return          
	}

	Drawable insetForeground;
	Rect insets;
	private Rect tempRect;
}

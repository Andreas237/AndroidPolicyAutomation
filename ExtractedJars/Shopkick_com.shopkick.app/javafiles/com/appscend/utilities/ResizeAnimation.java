// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appscend.utilities;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Transformation;

public class ResizeAnimation extends Animation
{

	public ResizeAnimation(View view1, int i, int j)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Animation()>
		view = view1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #18  <Field View view>
		targetWidth = i;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #20  <Field int targetWidth>
		targetHeight = j;
	//    8   14:aload_0         
	//    9   15:iload_3         
	//   10   16:putfield        #22  <Field int targetHeight>
		startWidth = view1.getWidth();
	//   11   19:aload_0         
	//   12   20:aload_1         
	//   13   21:invokevirtual   #28  <Method int View.getWidth()>
	//   14   24:putfield        #30  <Field int startWidth>
		startHeight = view1.getHeight();
	//   15   27:aload_0         
	//   16   28:aload_1         
	//   17   29:invokevirtual   #33  <Method int View.getHeight()>
	//   18   32:putfield        #35  <Field int startHeight>
	//   19   35:return          
	}

	protected void applyTransformation(float f, Transformation transformation)
	{
		int i = startWidth;
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field int startWidth>
	//    2    4:istore_3        
		i = (int)((float)i + (float)(targetWidth - i) * f);
	//    3    5:iload_3         
	//    4    6:i2f             
	//    5    7:aload_0         
	//    6    8:getfield        #20  <Field int targetWidth>
	//    7   11:iload_3         
	//    8   12:isub            
	//    9   13:i2f             
	//   10   14:fload_1         
	//   11   15:fmul            
	//   12   16:fadd            
	//   13   17:f2i             
	//   14   18:istore_3        
		int j = startHeight;
	//   15   19:aload_0         
	//   16   20:getfield        #35  <Field int startHeight>
	//   17   23:istore          4
		j = (int)((float)j + (float)(targetHeight - j) * f);
	//   18   25:iload           4
	//   19   27:i2f             
	//   20   28:aload_0         
	//   21   29:getfield        #22  <Field int targetHeight>
	//   22   32:iload           4
	//   23   34:isub            
	//   24   35:i2f             
	//   25   36:fload_1         
	//   26   37:fmul            
	//   27   38:fadd            
	//   28   39:f2i             
	//   29   40:istore          4
		view.getLayoutParams().width = i;
	//   30   42:aload_0         
	//   31   43:getfield        #18  <Field View view>
	//   32   46:invokevirtual   #42  <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   33   49:iload_3         
	//   34   50:putfield        #47  <Field int android.view.ViewGroup$LayoutParams.width>
		view.getLayoutParams().height = j;
	//   35   53:aload_0         
	//   36   54:getfield        #18  <Field View view>
	//   37   57:invokevirtual   #42  <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   38   60:iload           4
	//   39   62:putfield        #50  <Field int android.view.ViewGroup$LayoutParams.height>
		view.requestLayout();
	//   40   65:aload_0         
	//   41   66:getfield        #18  <Field View view>
	//   42   69:invokevirtual   #53  <Method void View.requestLayout()>
	//   43   72:return          
	}

	public void initialize(int i, int j, int k, int l)
	{
		super.initialize(i, j, k, l);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:iload_3         
	//    4    4:iload           4
	//    5    6:invokespecial   #57  <Method void Animation.initialize(int, int, int, int)>
	//    6    9:return          
	}

	public boolean willChangeBounds()
	{
		return true;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	final int startHeight;
	final int startWidth;
	final int targetHeight;
	final int targetWidth;
	View view;
}

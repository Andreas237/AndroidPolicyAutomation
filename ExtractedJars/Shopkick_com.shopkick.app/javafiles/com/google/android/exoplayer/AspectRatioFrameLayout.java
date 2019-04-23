// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;

public final class AspectRatioFrameLayout extends FrameLayout
{

	public AspectRatioFrameLayout(Context context)
	{
		super(context);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #12  <Method void FrameLayout(Context)>
	//    3    5:return          
	}

	public AspectRatioFrameLayout(Context context, AttributeSet attributeset)
	{
		super(context, attributeset);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #16  <Method void FrameLayout(Context, AttributeSet)>
	//    4    6:return          
	}

	protected void onMeasure(int i, int j)
	{
		super.onMeasure(i, j);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #20  <Method void FrameLayout.onMeasure(int, int)>
		if(videoAspectRatio == 0.0F)
	//*   4    6:aload_0         
	//*   5    7:getfield        #22  <Field float videoAspectRatio>
	//*   6   10:fconst_0        
	//*   7   11:fcmpl           
	//*   8   12:ifne            16
			return;
	//    9   15:return          
		j = getMeasuredWidth();
	//   10   16:aload_0         
	//   11   17:invokevirtual   #26  <Method int getMeasuredWidth()>
	//   12   20:istore_2        
		i = getMeasuredHeight();
	//   13   21:aload_0         
	//   14   22:invokevirtual   #29  <Method int getMeasuredHeight()>
	//   15   25:istore_1        
		float f = j;
	//   16   26:iload_2         
	//   17   27:i2f             
	//   18   28:fstore_3        
		float f1 = i;
	//   19   29:iload_1         
	//   20   30:i2f             
	//   21   31:fstore          4
		float f2 = f / f1;
	//   22   33:fload_3         
	//   23   34:fload           4
	//   24   36:fdiv            
	//   25   37:fstore          5
		f2 = videoAspectRatio / f2 - 1.0F;
	//   26   39:aload_0         
	//   27   40:getfield        #22  <Field float videoAspectRatio>
	//   28   43:fload           5
	//   29   45:fdiv            
	//   30   46:fconst_1        
	//   31   47:fsub            
	//   32   48:fstore          5
		if(Math.abs(f2) <= 0.01F)
	//*  33   50:fload           5
	//*  34   52:invokestatic    #35  <Method float Math.abs(float)>
	//*  35   55:ldc1            #7   <Float 0.01F>
	//*  36   57:fcmpg           
	//*  37   58:ifgt            62
			return;
	//   38   61:return          
		if(f2 > 0.0F)
	//*  39   62:fload           5
	//*  40   64:fconst_0        
	//*  41   65:fcmpl           
	//*  42   66:ifle            80
			i = (int)(f / videoAspectRatio);
	//   43   69:fload_3         
	//   44   70:aload_0         
	//   45   71:getfield        #22  <Field float videoAspectRatio>
	//   46   74:fdiv            
	//   47   75:f2i             
	//   48   76:istore_1        
		else
	//*  49   77:goto            89
			j = (int)(f1 * videoAspectRatio);
	//   50   80:fload           4
	//   51   82:aload_0         
	//   52   83:getfield        #22  <Field float videoAspectRatio>
	//   53   86:fmul            
	//   54   87:f2i             
	//   55   88:istore_2        
		super.onMeasure(android.view.View.MeasureSpec.makeMeasureSpec(j, 0x40000000), android.view.View.MeasureSpec.makeMeasureSpec(i, 0x40000000));
	//   56   89:aload_0         
	//   57   90:iload_2         
	//   58   91:ldc1            #36  <Int 0x40000000>
	//   59   93:invokestatic    #42  <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//   60   96:iload_1         
	//   61   97:ldc1            #36  <Int 0x40000000>
	//   62   99:invokestatic    #42  <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//   63  102:invokespecial   #20  <Method void FrameLayout.onMeasure(int, int)>
	//   64  105:return          
	}

	public void setAspectRatio(float f)
	{
		if(videoAspectRatio != f)
	//*   0    0:aload_0         
	//*   1    1:getfield        #22  <Field float videoAspectRatio>
	//*   2    4:fload_1         
	//*   3    5:fcmpl           
	//*   4    6:ifeq            18
		{
			videoAspectRatio = f;
	//    5    9:aload_0         
	//    6   10:fload_1         
	//    7   11:putfield        #22  <Field float videoAspectRatio>
			requestLayout();
	//    8   14:aload_0         
	//    9   15:invokevirtual   #48  <Method void requestLayout()>
		}
	//   10   18:return          
	}

	private static final float MAX_ASPECT_RATIO_DEFORMATION_FRACTION = 0.01F;
	private float videoAspectRatio;
}

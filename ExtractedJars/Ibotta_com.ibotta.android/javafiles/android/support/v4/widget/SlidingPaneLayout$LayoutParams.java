// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.util.AttributeSet;

// Referenced classes of package android.support.v4.widget:
//			SlidingPaneLayout

public static class SlidingPaneLayout$LayoutParams extends android.view.ViewGroup.MarginLayoutParams
{

	private static final int ATTRS[] = {
		0x1010181
	};
	Paint dimPaint;
	boolean dimWhenOffset;
	boolean slideable;
	public float weight;

	static 
	{
	//    0    0:iconst_1        
	//    1    1:newarray        int[]
	//    2    3:dup             
	//    3    4:iconst_0        
	//    4    5:ldc1            #19  <Int 0x1010181>
	//    5    7:iastore         
	//    6    8:putstatic       #21  <Field int[] ATTRS>
	//*   7   11:return          
	}

	public SlidingPaneLayout$LayoutParams()
	{
		super(-1, -1);
	//    0    0:aload_0         
	//    1    1:iconst_m1       
	//    2    2:iconst_m1       
	//    3    3:invokespecial   #26  <Method void android.view.ViewGroup$MarginLayoutParams(int, int)>
		weight = 0.0F;
	//    4    6:aload_0         
	//    5    7:fconst_0        
	//    6    8:putfield        #28  <Field float weight>
	//    7   11:return          
	}

	public SlidingPaneLayout$LayoutParams(Context context, AttributeSet attributeset)
	{
		super(context, attributeset);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #33  <Method void android.view.ViewGroup$MarginLayoutParams(Context, AttributeSet)>
		weight = 0.0F;
	//    4    6:aload_0         
	//    5    7:fconst_0        
	//    6    8:putfield        #28  <Field float weight>
		context = ((Context) (context.obtainStyledAttributes(attributeset, ATTRS)));
	//    7   11:aload_1         
	//    8   12:aload_2         
	//    9   13:getstatic       #21  <Field int[] ATTRS>
	//   10   16:invokevirtual   #39  <Method TypedArray Context.obtainStyledAttributes(AttributeSet, int[])>
	//   11   19:astore_1        
		weight = ((TypedArray) (context)).getFloat(0, 0.0F);
	//   12   20:aload_0         
	//   13   21:aload_1         
	//   14   22:iconst_0        
	//   15   23:fconst_0        
	//   16   24:invokevirtual   #45  <Method float TypedArray.getFloat(int, float)>
	//   17   27:putfield        #28  <Field float weight>
		((TypedArray) (context)).recycle();
	//   18   30:aload_1         
	//   19   31:invokevirtual   #48  <Method void TypedArray.recycle()>
	//   20   34:return          
	}

	public SlidingPaneLayout$LayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
	{
		super(layoutparams);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #52  <Method void android.view.ViewGroup$MarginLayoutParams(android.view.ViewGroup$LayoutParams)>
		weight = 0.0F;
	//    3    5:aload_0         
	//    4    6:fconst_0        
	//    5    7:putfield        #28  <Field float weight>
	//    6   10:return          
	}

	public SlidingPaneLayout$LayoutParams(android.view.ViewGroup.MarginLayoutParams marginlayoutparams)
	{
		super(marginlayoutparams);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #55  <Method void android.view.ViewGroup$MarginLayoutParams(android.view.ViewGroup$MarginLayoutParams)>
		weight = 0.0F;
	//    3    5:aload_0         
	//    4    6:fconst_0        
	//    5    7:putfield        #28  <Field float weight>
	//    6   10:return          
	}
}

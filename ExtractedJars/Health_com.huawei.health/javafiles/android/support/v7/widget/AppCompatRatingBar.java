// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RatingBar;

// Referenced classes of package android.support.v7.widget:
//			AppCompatProgressBarHelper

public class AppCompatRatingBar extends RatingBar
{

	public AppCompatRatingBar(Context context)
	{
		this(context, ((AttributeSet) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:invokespecial   #11  <Method void AppCompatRatingBar(Context, AttributeSet)>
	//    4    6:return          
	}

	public AppCompatRatingBar(Context context, AttributeSet attributeset)
	{
		this(context, attributeset, android.support.v7.appcompat.R.attr.ratingBarStyle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:getstatic       #18  <Field int android.support.v7.appcompat.R$attr.ratingBarStyle>
	//    4    6:invokespecial   #21  <Method void AppCompatRatingBar(Context, AttributeSet, int)>
	//    5    9:return          
	}

	public AppCompatRatingBar(Context context, AttributeSet attributeset, int i)
	{
		super(context, attributeset, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:invokespecial   #22  <Method void RatingBar(Context, AttributeSet, int)>
		mAppCompatProgressBarHelper = new AppCompatProgressBarHelper(((android.widget.ProgressBar) (this)));
	//    5    7:aload_0         
	//    6    8:new             #24  <Class AppCompatProgressBarHelper>
	//    7   11:dup             
	//    8   12:aload_0         
	//    9   13:invokespecial   #27  <Method void AppCompatProgressBarHelper(android.widget.ProgressBar)>
	//   10   16:putfield        #29  <Field AppCompatProgressBarHelper mAppCompatProgressBarHelper>
		mAppCompatProgressBarHelper.loadFromAttributes(attributeset, i);
	//   11   19:aload_0         
	//   12   20:getfield        #29  <Field AppCompatProgressBarHelper mAppCompatProgressBarHelper>
	//   13   23:aload_2         
	//   14   24:iload_3         
	//   15   25:invokevirtual   #33  <Method void AppCompatProgressBarHelper.loadFromAttributes(AttributeSet, int)>
	//   16   28:return          
	}

	protected void onMeasure(int i, int j)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		Bitmap bitmap;
		super.onMeasure(i, j);
	//    2    2:aload_0         
	//    3    3:iload_1         
	//    4    4:iload_2         
	//    5    5:invokespecial   #37  <Method void RatingBar.onMeasure(int, int)>
		bitmap = mAppCompatProgressBarHelper.getSampleTime();
	//    6    8:aload_0         
	//    7    9:getfield        #29  <Field AppCompatProgressBarHelper mAppCompatProgressBarHelper>
	//    8   12:invokevirtual   #41  <Method Bitmap AppCompatProgressBarHelper.getSampleTime()>
	//    9   15:astore_3        
		if(bitmap == null)
			break MISSING_BLOCK_LABEL_42;
	//   10   16:aload_3         
	//   11   17:ifnull          42
		setMeasuredDimension(View.resolveSizeAndState(bitmap.getWidth() * getNumStars(), i, 0), getMeasuredHeight());
	//   12   20:aload_0         
	//   13   21:aload_3         
	//   14   22:invokevirtual   #47  <Method int Bitmap.getWidth()>
	//   15   25:aload_0         
	//   16   26:invokevirtual   #50  <Method int getNumStars()>
	//   17   29:imul            
	//   18   30:iload_1         
	//   19   31:iconst_0        
	//   20   32:invokestatic    #56  <Method int View.resolveSizeAndState(int, int, int)>
	//   21   35:aload_0         
	//   22   36:invokevirtual   #59  <Method int getMeasuredHeight()>
	//   23   39:invokevirtual   #62  <Method void setMeasuredDimension(int, int)>
		this;
	//   24   42:aload_0         
		JVM INSTR monitorexit ;
	//   25   43:monitorexit     
		return;
	//   26   44:return          
		Exception exception;
		exception;
	//   27   45:astore_3        
	//*  28   46:aload_0         
		throw exception;
	//   29   47:monitorexit     
	//   30   48:aload_3         
	//   31   49:athrow          
	}

	private AppCompatProgressBarHelper mAppCompatProgressBarHelper;
}

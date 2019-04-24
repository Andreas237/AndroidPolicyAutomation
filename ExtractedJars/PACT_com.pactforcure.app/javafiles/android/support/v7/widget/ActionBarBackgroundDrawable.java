// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;

// Referenced classes of package android.support.v7.widget:
//			ActionBarContainer

class ActionBarBackgroundDrawable extends Drawable
{

	public ActionBarBackgroundDrawable(ActionBarContainer actionbarcontainer)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Drawable()>
		mContainer = actionbarcontainer;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #16  <Field ActionBarContainer mContainer>
	//    5    9:return          
	}

	public void draw(Canvas canvas)
	{
		if(mContainer.mIsSplit)
	//*   0    0:aload_0         
	//*   1    1:getfield        #16  <Field ActionBarContainer mContainer>
	//*   2    4:getfield        #25  <Field boolean ActionBarContainer.mIsSplit>
	//*   3    7:ifeq            32
		{
			if(mContainer.mSplitBackground != null)
	//*   4   10:aload_0         
	//*   5   11:getfield        #16  <Field ActionBarContainer mContainer>
	//*   6   14:getfield        #29  <Field Drawable ActionBarContainer.mSplitBackground>
	//*   7   17:ifnull          31
				mContainer.mSplitBackground.draw(canvas);
	//    8   20:aload_0         
	//    9   21:getfield        #16  <Field ActionBarContainer mContainer>
	//   10   24:getfield        #29  <Field Drawable ActionBarContainer.mSplitBackground>
	//   11   27:aload_1         
	//   12   28:invokevirtual   #31  <Method void Drawable.draw(Canvas)>
		} else
	//*  13   31:return          
		{
			if(mContainer.mBackground != null)
	//*  14   32:aload_0         
	//*  15   33:getfield        #16  <Field ActionBarContainer mContainer>
	//*  16   36:getfield        #34  <Field Drawable ActionBarContainer.mBackground>
	//*  17   39:ifnull          53
				mContainer.mBackground.draw(canvas);
	//   18   42:aload_0         
	//   19   43:getfield        #16  <Field ActionBarContainer mContainer>
	//   20   46:getfield        #34  <Field Drawable ActionBarContainer.mBackground>
	//   21   49:aload_1         
	//   22   50:invokevirtual   #31  <Method void Drawable.draw(Canvas)>
			if(mContainer.mStackedBackground != null && mContainer.mIsStacked)
	//*  23   53:aload_0         
	//*  24   54:getfield        #16  <Field ActionBarContainer mContainer>
	//*  25   57:getfield        #37  <Field Drawable ActionBarContainer.mStackedBackground>
	//*  26   60:ifnull          31
	//*  27   63:aload_0         
	//*  28   64:getfield        #16  <Field ActionBarContainer mContainer>
	//*  29   67:getfield        #40  <Field boolean ActionBarContainer.mIsStacked>
	//*  30   70:ifeq            31
			{
				mContainer.mStackedBackground.draw(canvas);
	//   31   73:aload_0         
	//   32   74:getfield        #16  <Field ActionBarContainer mContainer>
	//   33   77:getfield        #37  <Field Drawable ActionBarContainer.mStackedBackground>
	//   34   80:aload_1         
	//   35   81:invokevirtual   #31  <Method void Drawable.draw(Canvas)>
				return;
	//   36   84:return          
			}
		}
	}

	public int getOpacity()
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public void setAlpha(int i)
	{
	//    0    0:return          
	}

	public void setColorFilter(ColorFilter colorfilter)
	{
	//    0    0:return          
	}

	final ActionBarContainer mContainer;
}

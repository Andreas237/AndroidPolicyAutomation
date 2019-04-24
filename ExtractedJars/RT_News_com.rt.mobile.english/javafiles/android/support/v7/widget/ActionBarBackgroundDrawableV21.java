// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.graphics.Outline;
import android.graphics.drawable.Drawable;

// Referenced classes of package android.support.v7.widget:
//			ActionBarBackgroundDrawable, ActionBarContainer

class ActionBarBackgroundDrawableV21 extends ActionBarBackgroundDrawable
{

	public ActionBarBackgroundDrawableV21(ActionBarContainer actionbarcontainer)
	{
		super(actionbarcontainer);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #11  <Method void ActionBarBackgroundDrawable(ActionBarContainer)>
	//    3    5:return          
	}

	public void getOutline(Outline outline)
	{
		if(mContainer.mIsSplit)
	//*   0    0:aload_0         
	//*   1    1:getfield        #19  <Field ActionBarContainer mContainer>
	//*   2    4:getfield        #25  <Field boolean ActionBarContainer.mIsSplit>
	//*   3    7:ifeq            32
		{
			if(mContainer.mSplitBackground != null)
	//*   4   10:aload_0         
	//*   5   11:getfield        #19  <Field ActionBarContainer mContainer>
	//*   6   14:getfield        #29  <Field Drawable ActionBarContainer.mSplitBackground>
	//*   7   17:ifnull          53
			{
				mContainer.mSplitBackground.getOutline(outline);
	//    8   20:aload_0         
	//    9   21:getfield        #19  <Field ActionBarContainer mContainer>
	//   10   24:getfield        #29  <Field Drawable ActionBarContainer.mSplitBackground>
	//   11   27:aload_1         
	//   12   28:invokevirtual   #33  <Method void Drawable.getOutline(Outline)>
				return;
	//   13   31:return          
			}
		} else
		if(mContainer.mBackground != null)
	//*  14   32:aload_0         
	//*  15   33:getfield        #19  <Field ActionBarContainer mContainer>
	//*  16   36:getfield        #36  <Field Drawable ActionBarContainer.mBackground>
	//*  17   39:ifnull          53
			mContainer.mBackground.getOutline(outline);
	//   18   42:aload_0         
	//   19   43:getfield        #19  <Field ActionBarContainer mContainer>
	//   20   46:getfield        #36  <Field Drawable ActionBarContainer.mBackground>
	//   21   49:aload_1         
	//   22   50:invokevirtual   #33  <Method void Drawable.getOutline(Outline)>
	//   23   53:return          
	}
}

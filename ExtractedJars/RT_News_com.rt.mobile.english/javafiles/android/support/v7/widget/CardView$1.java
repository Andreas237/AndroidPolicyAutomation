// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;

// Referenced classes of package android.support.v7.widget:
//			CardViewDelegate, CardView

class CardView$1
	implements CardViewDelegate
{

	public Drawable getCardBackground()
	{
		return mCardBackground;
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field Drawable mCardBackground>
	//    2    4:areturn         
	}

	public View getCardView()
	{
		return ((View) (CardView.this));
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field CardView this$0>
	//    2    4:areturn         
	}

	public boolean getPreventCornerOverlap()
	{
		return CardView.this.getPreventCornerOverlap();
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field CardView this$0>
	//    2    4:invokevirtual   #30  <Method boolean CardView.getPreventCornerOverlap()>
	//    3    7:ireturn         
	}

	public boolean getUseCompatPadding()
	{
		return CardView.this.getUseCompatPadding();
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field CardView this$0>
	//    2    4:invokevirtual   #33  <Method boolean CardView.getUseCompatPadding()>
	//    3    7:ireturn         
	}

	public void setCardBackground(Drawable drawable)
	{
		mCardBackground = drawable;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #24  <Field Drawable mCardBackground>
		setBackgroundDrawable(drawable);
	//    3    5:aload_0         
	//    4    6:getfield        #16  <Field CardView this$0>
	//    5    9:aload_1         
	//    6   10:invokevirtual   #38  <Method void CardView.setBackgroundDrawable(Drawable)>
	//    7   13:return          
	}

	public void setMinWidthHeightInternal(int i, int j)
	{
		if(i > mUserSetMinWidth)
	//*   0    0:iload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #16  <Field CardView this$0>
	//*   3    5:getfield        #44  <Field int CardView.mUserSetMinWidth>
	//*   4    8:icmple          19
			CardView.access$101(CardView.this, i);
	//    5   11:aload_0         
	//    6   12:getfield        #16  <Field CardView this$0>
	//    7   15:iload_1         
	//    8   16:invokestatic    #48  <Method void CardView.access$101(CardView, int)>
		if(j > mUserSetMinHeight)
	//*   9   19:iload_2         
	//*  10   20:aload_0         
	//*  11   21:getfield        #16  <Field CardView this$0>
	//*  12   24:getfield        #51  <Field int CardView.mUserSetMinHeight>
	//*  13   27:icmple          38
			CardView.access$201(CardView.this, j);
	//   14   30:aload_0         
	//   15   31:getfield        #16  <Field CardView this$0>
	//   16   34:iload_2         
	//   17   35:invokestatic    #54  <Method void CardView.access$201(CardView, int)>
	//   18   38:return          
	}

	public void setShadowPadding(int i, int j, int k, int l)
	{
		mShadowBounds.set(i, j, k, l);
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field CardView this$0>
	//    2    4:getfield        #60  <Field Rect CardView.mShadowBounds>
	//    3    7:iload_1         
	//    4    8:iload_2         
	//    5    9:iload_3         
	//    6   10:iload           4
	//    7   12:invokevirtual   #65  <Method void Rect.set(int, int, int, int)>
		CardView.access$001(CardView.this, i + mContentPadding.left, j + mContentPadding.top, k + mContentPadding.right, l + mContentPadding.bottom);
	//    8   15:aload_0         
	//    9   16:getfield        #16  <Field CardView this$0>
	//   10   19:iload_1         
	//   11   20:aload_0         
	//   12   21:getfield        #16  <Field CardView this$0>
	//   13   24:getfield        #68  <Field Rect CardView.mContentPadding>
	//   14   27:getfield        #71  <Field int Rect.left>
	//   15   30:iadd            
	//   16   31:iload_2         
	//   17   32:aload_0         
	//   18   33:getfield        #16  <Field CardView this$0>
	//   19   36:getfield        #68  <Field Rect CardView.mContentPadding>
	//   20   39:getfield        #74  <Field int Rect.top>
	//   21   42:iadd            
	//   22   43:iload_3         
	//   23   44:aload_0         
	//   24   45:getfield        #16  <Field CardView this$0>
	//   25   48:getfield        #68  <Field Rect CardView.mContentPadding>
	//   26   51:getfield        #77  <Field int Rect.right>
	//   27   54:iadd            
	//   28   55:iload           4
	//   29   57:aload_0         
	//   30   58:getfield        #16  <Field CardView this$0>
	//   31   61:getfield        #68  <Field Rect CardView.mContentPadding>
	//   32   64:getfield        #80  <Field int Rect.bottom>
	//   33   67:iadd            
	//   34   68:invokestatic    #84  <Method void CardView.access$001(CardView, int, int, int, int)>
	//   35   71:return          
	}

	private Drawable mCardBackground;
	final CardView this$0;

	CardView$1()
	{
		this$0 = CardView.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #16  <Field CardView this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #19  <Method void Object()>
	//    5    9:return          
	}
}
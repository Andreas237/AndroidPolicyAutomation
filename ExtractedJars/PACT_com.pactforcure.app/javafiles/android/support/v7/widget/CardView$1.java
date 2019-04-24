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
		CardView.access$001(CardView.this, mContentPadding.left + i, mContentPadding.top + j, mContentPadding.right + k, mContentPadding.bottom + l);
	//    8   15:aload_0         
	//    9   16:getfield        #16  <Field CardView this$0>
	//   10   19:aload_0         
	//   11   20:getfield        #16  <Field CardView this$0>
	//   12   23:getfield        #68  <Field Rect CardView.mContentPadding>
	//   13   26:getfield        #71  <Field int Rect.left>
	//   14   29:iload_1         
	//   15   30:iadd            
	//   16   31:aload_0         
	//   17   32:getfield        #16  <Field CardView this$0>
	//   18   35:getfield        #68  <Field Rect CardView.mContentPadding>
	//   19   38:getfield        #74  <Field int Rect.top>
	//   20   41:iload_2         
	//   21   42:iadd            
	//   22   43:aload_0         
	//   23   44:getfield        #16  <Field CardView this$0>
	//   24   47:getfield        #68  <Field Rect CardView.mContentPadding>
	//   25   50:getfield        #77  <Field int Rect.right>
	//   26   53:iload_3         
	//   27   54:iadd            
	//   28   55:aload_0         
	//   29   56:getfield        #16  <Field CardView this$0>
	//   30   59:getfield        #68  <Field Rect CardView.mContentPadding>
	//   31   62:getfield        #80  <Field int Rect.bottom>
	//   32   65:iload           4
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

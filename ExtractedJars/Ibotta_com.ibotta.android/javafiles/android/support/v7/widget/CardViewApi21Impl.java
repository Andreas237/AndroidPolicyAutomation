// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.View;

// Referenced classes of package android.support.v7.widget:
//			CardViewImpl, CardViewDelegate, RoundRectDrawable, RoundRectDrawableWithShadow

class CardViewApi21Impl
	implements CardViewImpl
{

	CardViewApi21Impl()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
	//    2    4:return          
	}

	private RoundRectDrawable getCardBackground(CardViewDelegate cardviewdelegate)
	{
		return (RoundRectDrawable)cardviewdelegate.getCardBackground();
	//    0    0:aload_1         
	//    1    1:invokeinterface #21  <Method android.graphics.drawable.Drawable CardViewDelegate.getCardBackground()>
	//    2    6:checkcast       #23  <Class RoundRectDrawable>
	//    3    9:areturn         
	}

	public ColorStateList getBackgroundColor(CardViewDelegate cardviewdelegate)
	{
		return getCardBackground(cardviewdelegate).getColor();
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #27  <Method RoundRectDrawable getCardBackground(CardViewDelegate)>
	//    3    5:invokevirtual   #31  <Method ColorStateList RoundRectDrawable.getColor()>
	//    4    8:areturn         
	}

	public float getElevation(CardViewDelegate cardviewdelegate)
	{
		return cardviewdelegate.getCardView().getElevation();
	//    0    0:aload_1         
	//    1    1:invokeinterface #37  <Method View CardViewDelegate.getCardView()>
	//    2    6:invokevirtual   #42  <Method float View.getElevation()>
	//    3    9:freturn         
	}

	public float getMaxElevation(CardViewDelegate cardviewdelegate)
	{
		return getCardBackground(cardviewdelegate).getPadding();
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #27  <Method RoundRectDrawable getCardBackground(CardViewDelegate)>
	//    3    5:invokevirtual   #46  <Method float RoundRectDrawable.getPadding()>
	//    4    8:freturn         
	}

	public float getMinHeight(CardViewDelegate cardviewdelegate)
	{
		return getRadius(cardviewdelegate) * 2.0F;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #50  <Method float getRadius(CardViewDelegate)>
	//    3    5:fconst_2        
	//    4    6:fmul            
	//    5    7:freturn         
	}

	public float getMinWidth(CardViewDelegate cardviewdelegate)
	{
		return getRadius(cardviewdelegate) * 2.0F;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #50  <Method float getRadius(CardViewDelegate)>
	//    3    5:fconst_2        
	//    4    6:fmul            
	//    5    7:freturn         
	}

	public float getRadius(CardViewDelegate cardviewdelegate)
	{
		return getCardBackground(cardviewdelegate).getRadius();
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #27  <Method RoundRectDrawable getCardBackground(CardViewDelegate)>
	//    3    5:invokevirtual   #53  <Method float RoundRectDrawable.getRadius()>
	//    4    8:freturn         
	}

	public void initStatic()
	{
	//    0    0:return          
	}

	public void initialize(CardViewDelegate cardviewdelegate, Context context, ColorStateList colorstatelist, float f, float f1, float f2)
	{
		cardviewdelegate.setCardBackground(((android.graphics.drawable.Drawable) (new RoundRectDrawable(colorstatelist, f))));
	//    0    0:aload_1         
	//    1    1:new             #23  <Class RoundRectDrawable>
	//    2    4:dup             
	//    3    5:aload_3         
	//    4    6:fload           4
	//    5    8:invokespecial   #59  <Method void RoundRectDrawable(ColorStateList, float)>
	//    6   11:invokeinterface #63  <Method void CardViewDelegate.setCardBackground(android.graphics.drawable.Drawable)>
		context = ((Context) (cardviewdelegate.getCardView()));
	//    7   16:aload_1         
	//    8   17:invokeinterface #37  <Method View CardViewDelegate.getCardView()>
	//    9   22:astore_2        
		((View) (context)).setClipToOutline(true);
	//   10   23:aload_2         
	//   11   24:iconst_1        
	//   12   25:invokevirtual   #67  <Method void View.setClipToOutline(boolean)>
		((View) (context)).setElevation(f1);
	//   13   28:aload_2         
	//   14   29:fload           5
	//   15   31:invokevirtual   #71  <Method void View.setElevation(float)>
		setMaxElevation(cardviewdelegate, f2);
	//   16   34:aload_0         
	//   17   35:aload_1         
	//   18   36:fload           6
	//   19   38:invokevirtual   #75  <Method void setMaxElevation(CardViewDelegate, float)>
	//   20   41:return          
	}

	public void onCompatPaddingChanged(CardViewDelegate cardviewdelegate)
	{
		setMaxElevation(cardviewdelegate, getMaxElevation(cardviewdelegate));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_0         
	//    3    3:aload_1         
	//    4    4:invokevirtual   #79  <Method float getMaxElevation(CardViewDelegate)>
	//    5    7:invokevirtual   #75  <Method void setMaxElevation(CardViewDelegate, float)>
	//    6   10:return          
	}

	public void onPreventCornerOverlapChanged(CardViewDelegate cardviewdelegate)
	{
		setMaxElevation(cardviewdelegate, getMaxElevation(cardviewdelegate));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_0         
	//    3    3:aload_1         
	//    4    4:invokevirtual   #79  <Method float getMaxElevation(CardViewDelegate)>
	//    5    7:invokevirtual   #75  <Method void setMaxElevation(CardViewDelegate, float)>
	//    6   10:return          
	}

	public void setBackgroundColor(CardViewDelegate cardviewdelegate, ColorStateList colorstatelist)
	{
		getCardBackground(cardviewdelegate).setColor(colorstatelist);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #27  <Method RoundRectDrawable getCardBackground(CardViewDelegate)>
	//    3    5:aload_2         
	//    4    6:invokevirtual   #87  <Method void RoundRectDrawable.setColor(ColorStateList)>
	//    5    9:return          
	}

	public void setElevation(CardViewDelegate cardviewdelegate, float f)
	{
		cardviewdelegate.getCardView().setElevation(f);
	//    0    0:aload_1         
	//    1    1:invokeinterface #37  <Method View CardViewDelegate.getCardView()>
	//    2    6:fload_2         
	//    3    7:invokevirtual   #71  <Method void View.setElevation(float)>
	//    4   10:return          
	}

	public void setMaxElevation(CardViewDelegate cardviewdelegate, float f)
	{
		getCardBackground(cardviewdelegate).setPadding(f, cardviewdelegate.getUseCompatPadding(), cardviewdelegate.getPreventCornerOverlap());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #27  <Method RoundRectDrawable getCardBackground(CardViewDelegate)>
	//    3    5:fload_2         
	//    4    6:aload_1         
	//    5    7:invokeinterface #92  <Method boolean CardViewDelegate.getUseCompatPadding()>
	//    6   12:aload_1         
	//    7   13:invokeinterface #95  <Method boolean CardViewDelegate.getPreventCornerOverlap()>
	//    8   18:invokevirtual   #99  <Method void RoundRectDrawable.setPadding(float, boolean, boolean)>
		updatePadding(cardviewdelegate);
	//    9   21:aload_0         
	//   10   22:aload_1         
	//   11   23:invokevirtual   #102 <Method void updatePadding(CardViewDelegate)>
	//   12   26:return          
	}

	public void setRadius(CardViewDelegate cardviewdelegate, float f)
	{
		getCardBackground(cardviewdelegate).setRadius(f);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #27  <Method RoundRectDrawable getCardBackground(CardViewDelegate)>
	//    3    5:fload_2         
	//    4    6:invokevirtual   #105 <Method void RoundRectDrawable.setRadius(float)>
	//    5    9:return          
	}

	public void updatePadding(CardViewDelegate cardviewdelegate)
	{
		if(!cardviewdelegate.getUseCompatPadding())
	//*   0    0:aload_1         
	//*   1    1:invokeinterface #92  <Method boolean CardViewDelegate.getUseCompatPadding()>
	//*   2    6:ifne            20
		{
			cardviewdelegate.setShadowPadding(0, 0, 0, 0);
	//    3    9:aload_1         
	//    4   10:iconst_0        
	//    5   11:iconst_0        
	//    6   12:iconst_0        
	//    7   13:iconst_0        
	//    8   14:invokeinterface #109 <Method void CardViewDelegate.setShadowPadding(int, int, int, int)>
			return;
	//    9   19:return          
		} else
		{
			float f = getMaxElevation(cardviewdelegate);
	//   10   20:aload_0         
	//   11   21:aload_1         
	//   12   22:invokevirtual   #79  <Method float getMaxElevation(CardViewDelegate)>
	//   13   25:fstore_2        
			float f1 = getRadius(cardviewdelegate);
	//   14   26:aload_0         
	//   15   27:aload_1         
	//   16   28:invokevirtual   #50  <Method float getRadius(CardViewDelegate)>
	//   17   31:fstore_3        
			int i = (int)Math.ceil(RoundRectDrawableWithShadow.calculateHorizontalPadding(f, f1, cardviewdelegate.getPreventCornerOverlap()));
	//   18   32:fload_2         
	//   19   33:fload_3         
	//   20   34:aload_1         
	//   21   35:invokeinterface #95  <Method boolean CardViewDelegate.getPreventCornerOverlap()>
	//   22   40:invokestatic    #115 <Method float RoundRectDrawableWithShadow.calculateHorizontalPadding(float, float, boolean)>
	//   23   43:f2d             
	//   24   44:invokestatic    #121 <Method double Math.ceil(double)>
	//   25   47:d2i             
	//   26   48:istore          4
			int j = (int)Math.ceil(RoundRectDrawableWithShadow.calculateVerticalPadding(f, f1, cardviewdelegate.getPreventCornerOverlap()));
	//   27   50:fload_2         
	//   28   51:fload_3         
	//   29   52:aload_1         
	//   30   53:invokeinterface #95  <Method boolean CardViewDelegate.getPreventCornerOverlap()>
	//   31   58:invokestatic    #124 <Method float RoundRectDrawableWithShadow.calculateVerticalPadding(float, float, boolean)>
	//   32   61:f2d             
	//   33   62:invokestatic    #121 <Method double Math.ceil(double)>
	//   34   65:d2i             
	//   35   66:istore          5
			cardviewdelegate.setShadowPadding(i, j, i, j);
	//   36   68:aload_1         
	//   37   69:iload           4
	//   38   71:iload           5
	//   39   73:iload           4
	//   40   75:iload           5
	//   41   77:invokeinterface #109 <Method void CardViewDelegate.setShadowPadding(int, int, int, int)>
			return;
	//   42   82:return          
		}
	}
}

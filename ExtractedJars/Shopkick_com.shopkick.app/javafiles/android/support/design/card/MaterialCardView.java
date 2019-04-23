// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.card;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.design.internal.ThemeEnforcement;
import android.support.v7.widget.CardView;
import android.util.AttributeSet;

// Referenced classes of package android.support.design.card:
//			MaterialCardViewHelper

public class MaterialCardView extends CardView
{

	public MaterialCardView(Context context)
	{
		this(context, ((AttributeSet) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:invokespecial   #11  <Method void MaterialCardView(Context, AttributeSet)>
	//    4    6:return          
	}

	public MaterialCardView(Context context, AttributeSet attributeset)
	{
		this(context, attributeset, android.support.design.R.attr.materialCardViewStyle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:getstatic       #18  <Field int android.support.design.R$attr.materialCardViewStyle>
	//    4    6:invokespecial   #21  <Method void MaterialCardView(Context, AttributeSet, int)>
	//    5    9:return          
	}

	public MaterialCardView(Context context, AttributeSet attributeset, int i)
	{
		super(context, attributeset, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:invokespecial   #22  <Method void CardView(Context, AttributeSet, int)>
		context = ((Context) (ThemeEnforcement.obtainStyledAttributes(context, attributeset, android.support.design.R.styleable.MaterialCardView, i, android.support.design.R.style.Widget_MaterialComponents_CardView, new int[0])));
	//    5    7:aload_1         
	//    6    8:aload_2         
	//    7    9:getstatic       #28  <Field int[] android.support.design.R$styleable.MaterialCardView>
	//    8   12:iload_3         
	//    9   13:getstatic       #33  <Field int android.support.design.R$style.Widget_MaterialComponents_CardView>
	//   10   16:iconst_0        
	//   11   17:newarray        int[]
	//   12   19:invokestatic    #39  <Method TypedArray ThemeEnforcement.obtainStyledAttributes(Context, AttributeSet, int[], int, int, int[])>
	//   13   22:astore_1        
		cardViewHelper = new MaterialCardViewHelper(this);
	//   14   23:aload_0         
	//   15   24:new             #41  <Class MaterialCardViewHelper>
	//   16   27:dup             
	//   17   28:aload_0         
	//   18   29:invokespecial   #44  <Method void MaterialCardViewHelper(MaterialCardView)>
	//   19   32:putfield        #46  <Field MaterialCardViewHelper cardViewHelper>
		cardViewHelper.loadFromAttributes(((TypedArray) (context)));
	//   20   35:aload_0         
	//   21   36:getfield        #46  <Field MaterialCardViewHelper cardViewHelper>
	//   22   39:aload_1         
	//   23   40:invokevirtual   #50  <Method void MaterialCardViewHelper.loadFromAttributes(TypedArray)>
		((TypedArray) (context)).recycle();
	//   24   43:aload_1         
	//   25   44:invokevirtual   #56  <Method void TypedArray.recycle()>
	//   26   47:return          
	}

	public int getStrokeColor()
	{
		return cardViewHelper.getStrokeColor();
	//    0    0:aload_0         
	//    1    1:getfield        #46  <Field MaterialCardViewHelper cardViewHelper>
	//    2    4:invokevirtual   #61  <Method int MaterialCardViewHelper.getStrokeColor()>
	//    3    7:ireturn         
	}

	public int getStrokeWidth()
	{
		return cardViewHelper.getStrokeWidth();
	//    0    0:aload_0         
	//    1    1:getfield        #46  <Field MaterialCardViewHelper cardViewHelper>
	//    2    4:invokevirtual   #66  <Method int MaterialCardViewHelper.getStrokeWidth()>
	//    3    7:ireturn         
	}

	public void setRadius(float f)
	{
		super.setRadius(f);
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:invokespecial   #70  <Method void CardView.setRadius(float)>
		cardViewHelper.updateForeground();
	//    3    5:aload_0         
	//    4    6:getfield        #46  <Field MaterialCardViewHelper cardViewHelper>
	//    5    9:invokevirtual   #73  <Method void MaterialCardViewHelper.updateForeground()>
	//    6   12:return          
	}

	public void setStrokeColor(int i)
	{
		cardViewHelper.setStrokeColor(i);
	//    0    0:aload_0         
	//    1    1:getfield        #46  <Field MaterialCardViewHelper cardViewHelper>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #77  <Method void MaterialCardViewHelper.setStrokeColor(int)>
	//    4    8:return          
	}

	public void setStrokeWidth(int i)
	{
		cardViewHelper.setStrokeWidth(i);
	//    0    0:aload_0         
	//    1    1:getfield        #46  <Field MaterialCardViewHelper cardViewHelper>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #81  <Method void MaterialCardViewHelper.setStrokeWidth(int)>
	//    4    8:return          
	}

	private final MaterialCardViewHelper cardViewHelper;
}

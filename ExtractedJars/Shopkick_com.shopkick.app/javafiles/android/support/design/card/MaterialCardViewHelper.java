// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.card;

import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;

// Referenced classes of package android.support.design.card:
//			MaterialCardView

class MaterialCardViewHelper
{

	public MaterialCardViewHelper(MaterialCardView materialcardview)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #20  <Method void Object()>
		materialCardView = materialcardview;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #22  <Field MaterialCardView materialCardView>
	//    5    9:return          
	}

	private void adjustContentPadding()
	{
		int i = materialCardView.getContentPaddingLeft();
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field MaterialCardView materialCardView>
	//    2    4:invokevirtual   #30  <Method int MaterialCardView.getContentPaddingLeft()>
	//    3    7:istore_1        
		int j = strokeWidth;
	//    4    8:aload_0         
	//    5    9:getfield        #32  <Field int strokeWidth>
	//    6   12:istore_2        
		int k = materialCardView.getContentPaddingTop();
	//    7   13:aload_0         
	//    8   14:getfield        #22  <Field MaterialCardView materialCardView>
	//    9   17:invokevirtual   #35  <Method int MaterialCardView.getContentPaddingTop()>
	//   10   20:istore_3        
		int l = strokeWidth;
	//   11   21:aload_0         
	//   12   22:getfield        #32  <Field int strokeWidth>
	//   13   25:istore          4
		int i1 = materialCardView.getContentPaddingRight();
	//   14   27:aload_0         
	//   15   28:getfield        #22  <Field MaterialCardView materialCardView>
	//   16   31:invokevirtual   #38  <Method int MaterialCardView.getContentPaddingRight()>
	//   17   34:istore          5
		int j1 = strokeWidth;
	//   18   36:aload_0         
	//   19   37:getfield        #32  <Field int strokeWidth>
	//   20   40:istore          6
		int k1 = materialCardView.getContentPaddingBottom();
	//   21   42:aload_0         
	//   22   43:getfield        #22  <Field MaterialCardView materialCardView>
	//   23   46:invokevirtual   #41  <Method int MaterialCardView.getContentPaddingBottom()>
	//   24   49:istore          7
		int l1 = strokeWidth;
	//   25   51:aload_0         
	//   26   52:getfield        #32  <Field int strokeWidth>
	//   27   55:istore          8
		materialCardView.setContentPadding(i + j, k + l, i1 + j1, k1 + l1);
	//   28   57:aload_0         
	//   29   58:getfield        #22  <Field MaterialCardView materialCardView>
	//   30   61:iload_1         
	//   31   62:iload_2         
	//   32   63:iadd            
	//   33   64:iload_3         
	//   34   65:iload           4
	//   35   67:iadd            
	//   36   68:iload           5
	//   37   70:iload           6
	//   38   72:iadd            
	//   39   73:iload           7
	//   40   75:iload           8
	//   41   77:iadd            
	//   42   78:invokevirtual   #45  <Method void MaterialCardView.setContentPadding(int, int, int, int)>
	//   43   81:return          
	}

	private Drawable createForegroundDrawable()
	{
		GradientDrawable gradientdrawable = new GradientDrawable();
	//    0    0:new             #49  <Class GradientDrawable>
	//    1    3:dup             
	//    2    4:invokespecial   #50  <Method void GradientDrawable()>
	//    3    7:astore_2        
		gradientdrawable.setCornerRadius(materialCardView.getRadius());
	//    4    8:aload_2         
	//    5    9:aload_0         
	//    6   10:getfield        #22  <Field MaterialCardView materialCardView>
	//    7   13:invokevirtual   #54  <Method float MaterialCardView.getRadius()>
	//    8   16:invokevirtual   #58  <Method void GradientDrawable.setCornerRadius(float)>
		int i = strokeColor;
	//    9   19:aload_0         
	//   10   20:getfield        #60  <Field int strokeColor>
	//   11   23:istore_1        
		if(i != -1)
	//*  12   24:iload_1         
	//*  13   25:iconst_m1       
	//*  14   26:icmpeq          38
			gradientdrawable.setStroke(strokeWidth, i);
	//   15   29:aload_2         
	//   16   30:aload_0         
	//   17   31:getfield        #32  <Field int strokeWidth>
	//   18   34:iload_1         
	//   19   35:invokevirtual   #64  <Method void GradientDrawable.setStroke(int, int)>
		return ((Drawable) (gradientdrawable));
	//   20   38:aload_2         
	//   21   39:areturn         
	}

	int getStrokeColor()
	{
		return strokeColor;
	//    0    0:aload_0         
	//    1    1:getfield        #60  <Field int strokeColor>
	//    2    4:ireturn         
	}

	int getStrokeWidth()
	{
		return strokeWidth;
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field int strokeWidth>
	//    2    4:ireturn         
	}

	public void loadFromAttributes(TypedArray typedarray)
	{
		strokeColor = typedarray.getColor(android.support.design.R.styleable.MaterialCardView_strokeColor, -1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:getstatic       #76  <Field int android.support.design.R$styleable.MaterialCardView_strokeColor>
	//    3    5:iconst_m1       
	//    4    6:invokevirtual   #82  <Method int TypedArray.getColor(int, int)>
	//    5    9:putfield        #60  <Field int strokeColor>
		strokeWidth = typedarray.getDimensionPixelSize(android.support.design.R.styleable.MaterialCardView_strokeWidth, 0);
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:getstatic       #85  <Field int android.support.design.R$styleable.MaterialCardView_strokeWidth>
	//    9   17:iconst_0        
	//   10   18:invokevirtual   #88  <Method int TypedArray.getDimensionPixelSize(int, int)>
	//   11   21:putfield        #32  <Field int strokeWidth>
		updateForeground();
	//   12   24:aload_0         
	//   13   25:invokevirtual   #91  <Method void updateForeground()>
		adjustContentPadding();
	//   14   28:aload_0         
	//   15   29:invokespecial   #93  <Method void adjustContentPadding()>
	//   16   32:return          
	}

	void setStrokeColor(int i)
	{
		strokeColor = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #60  <Field int strokeColor>
		updateForeground();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #91  <Method void updateForeground()>
	//    5    9:return          
	}

	void setStrokeWidth(int i)
	{
		strokeWidth = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #32  <Field int strokeWidth>
		updateForeground();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #91  <Method void updateForeground()>
		adjustContentPadding();
	//    5    9:aload_0         
	//    6   10:invokespecial   #93  <Method void adjustContentPadding()>
	//    7   13:return          
	}

	void updateForeground()
	{
		materialCardView.setForeground(createForegroundDrawable());
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field MaterialCardView materialCardView>
	//    2    4:aload_0         
	//    3    5:invokespecial   #99  <Method Drawable createForegroundDrawable()>
	//    4    8:invokevirtual   #103 <Method void MaterialCardView.setForeground(Drawable)>
	//    5   11:return          
	}

	private static final int DEFAULT_STROKE_VALUE = -1;
	private final MaterialCardView materialCardView;
	private int strokeColor;
	private int strokeWidth;
}

// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.button;

import android.content.res.ColorStateList;
import android.graphics.ColorFilter;
import android.graphics.drawable.*;

class MaterialButtonBackgroundDrawable extends RippleDrawable
{

	MaterialButtonBackgroundDrawable(ColorStateList colorstatelist, InsetDrawable insetdrawable, Drawable drawable)
	{
		super(colorstatelist, ((Drawable) (insetdrawable)), drawable);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:invokespecial   #14  <Method void RippleDrawable(ColorStateList, Drawable, Drawable)>
	//    5    7:return          
	}

	public void setColorFilter(ColorFilter colorfilter)
	{
		if(getDrawable(0) != null)
	//*   0    0:aload_0         
	//*   1    1:iconst_0        
	//*   2    2:invokevirtual   #22  <Method Drawable getDrawable(int)>
	//*   3    5:ifnull          33
			((GradientDrawable)((LayerDrawable)((InsetDrawable)getDrawable(0)).getDrawable()).getDrawable(0)).setColorFilter(colorfilter);
	//    4    8:aload_0         
	//    5    9:iconst_0        
	//    6   10:invokevirtual   #22  <Method Drawable getDrawable(int)>
	//    7   13:checkcast       #24  <Class InsetDrawable>
	//    8   16:invokevirtual   #27  <Method Drawable InsetDrawable.getDrawable()>
	//    9   19:checkcast       #29  <Class LayerDrawable>
	//   10   22:iconst_0        
	//   11   23:invokevirtual   #30  <Method Drawable LayerDrawable.getDrawable(int)>
	//   12   26:checkcast       #32  <Class GradientDrawable>
	//   13   29:aload_1         
	//   14   30:invokevirtual   #34  <Method void GradientDrawable.setColorFilter(ColorFilter)>
	//   15   33:return          
	}
}

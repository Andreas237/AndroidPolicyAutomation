// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.button;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.*;
import android.graphics.drawable.*;
import android.support.design.internal.ViewUtils;
import android.support.design.resources.MaterialResources;
import android.support.design.ripple.RippleUtils;
import android.support.v4.graphics.drawable.DrawableCompat;
import android.support.v4.view.ViewCompat;

// Referenced classes of package android.support.design.button:
//			MaterialButtonBackgroundDrawable, MaterialButton

class MaterialButtonHelper
{

	public MaterialButtonHelper(MaterialButton materialbutton)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #56  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #58  <Class Paint>
	//    4    8:dup             
	//    5    9:iconst_1        
	//    6   10:invokespecial   #61  <Method void Paint(int)>
	//    7   13:putfield        #63  <Field Paint buttonStrokePaint>
	//    8   16:aload_0         
	//    9   17:new             #65  <Class Rect>
	//   10   20:dup             
	//   11   21:invokespecial   #66  <Method void Rect()>
	//   12   24:putfield        #68  <Field Rect bounds>
	//   13   27:aload_0         
	//   14   28:new             #70  <Class RectF>
	//   15   31:dup             
	//   16   32:invokespecial   #71  <Method void RectF()>
	//   17   35:putfield        #73  <Field RectF rectF>
		backgroundOverwritten = false;
	//   18   38:aload_0         
	//   19   39:iconst_0        
	//   20   40:putfield        #75  <Field boolean backgroundOverwritten>
		materialButton = materialbutton;
	//   21   43:aload_0         
	//   22   44:aload_1         
	//   23   45:putfield        #77  <Field MaterialButton materialButton>
	//   24   48:return          
	}

	private Drawable createBackgroundCompat()
	{
		colorableBackgroundDrawableCompat = new GradientDrawable();
	//    0    0:aload_0         
	//    1    1:new             #81  <Class GradientDrawable>
	//    2    4:dup             
	//    3    5:invokespecial   #82  <Method void GradientDrawable()>
	//    4    8:putfield        #84  <Field GradientDrawable colorableBackgroundDrawableCompat>
		colorableBackgroundDrawableCompat.setCornerRadius((float)cornerRadius + 1E-05F);
	//    5   11:aload_0         
	//    6   12:getfield        #84  <Field GradientDrawable colorableBackgroundDrawableCompat>
	//    7   15:aload_0         
	//    8   16:getfield        #86  <Field int cornerRadius>
	//    9   19:i2f             
	//   10   20:ldc1            #87  <Float 1E-05F>
	//   11   22:fadd            
	//   12   23:invokevirtual   #91  <Method void GradientDrawable.setCornerRadius(float)>
		colorableBackgroundDrawableCompat.setColor(-1);
	//   13   26:aload_0         
	//   14   27:getfield        #84  <Field GradientDrawable colorableBackgroundDrawableCompat>
	//   15   30:iconst_m1       
	//   16   31:invokevirtual   #94  <Method void GradientDrawable.setColor(int)>
		tintableBackgroundDrawableCompat = DrawableCompat.wrap(((Drawable) (colorableBackgroundDrawableCompat)));
	//   17   34:aload_0         
	//   18   35:aload_0         
	//   19   36:getfield        #84  <Field GradientDrawable colorableBackgroundDrawableCompat>
	//   20   39:invokestatic    #100 <Method Drawable DrawableCompat.wrap(Drawable)>
	//   21   42:putfield        #102 <Field Drawable tintableBackgroundDrawableCompat>
		DrawableCompat.setTintList(tintableBackgroundDrawableCompat, backgroundTint);
	//   22   45:aload_0         
	//   23   46:getfield        #102 <Field Drawable tintableBackgroundDrawableCompat>
	//   24   49:aload_0         
	//   25   50:getfield        #104 <Field ColorStateList backgroundTint>
	//   26   53:invokestatic    #108 <Method void DrawableCompat.setTintList(Drawable, ColorStateList)>
		android.graphics.PorterDuff.Mode mode = backgroundTintMode;
	//   27   56:aload_0         
	//   28   57:getfield        #110 <Field android.graphics.PorterDuff$Mode backgroundTintMode>
	//   29   60:astore_1        
		if(mode != null)
	//*  30   61:aload_1         
	//*  31   62:ifnull          73
			DrawableCompat.setTintMode(tintableBackgroundDrawableCompat, mode);
	//   32   65:aload_0         
	//   33   66:getfield        #102 <Field Drawable tintableBackgroundDrawableCompat>
	//   34   69:aload_1         
	//   35   70:invokestatic    #114 <Method void DrawableCompat.setTintMode(Drawable, android.graphics.PorterDuff$Mode)>
		rippleDrawableCompat = new GradientDrawable();
	//   36   73:aload_0         
	//   37   74:new             #81  <Class GradientDrawable>
	//   38   77:dup             
	//   39   78:invokespecial   #82  <Method void GradientDrawable()>
	//   40   81:putfield        #116 <Field GradientDrawable rippleDrawableCompat>
		rippleDrawableCompat.setCornerRadius((float)cornerRadius + 1E-05F);
	//   41   84:aload_0         
	//   42   85:getfield        #116 <Field GradientDrawable rippleDrawableCompat>
	//   43   88:aload_0         
	//   44   89:getfield        #86  <Field int cornerRadius>
	//   45   92:i2f             
	//   46   93:ldc1            #87  <Float 1E-05F>
	//   47   95:fadd            
	//   48   96:invokevirtual   #91  <Method void GradientDrawable.setCornerRadius(float)>
		rippleDrawableCompat.setColor(-1);
	//   49   99:aload_0         
	//   50  100:getfield        #116 <Field GradientDrawable rippleDrawableCompat>
	//   51  103:iconst_m1       
	//   52  104:invokevirtual   #94  <Method void GradientDrawable.setColor(int)>
		tintableRippleDrawableCompat = DrawableCompat.wrap(((Drawable) (rippleDrawableCompat)));
	//   53  107:aload_0         
	//   54  108:aload_0         
	//   55  109:getfield        #116 <Field GradientDrawable rippleDrawableCompat>
	//   56  112:invokestatic    #100 <Method Drawable DrawableCompat.wrap(Drawable)>
	//   57  115:putfield        #118 <Field Drawable tintableRippleDrawableCompat>
		DrawableCompat.setTintList(tintableRippleDrawableCompat, rippleColor);
	//   58  118:aload_0         
	//   59  119:getfield        #118 <Field Drawable tintableRippleDrawableCompat>
	//   60  122:aload_0         
	//   61  123:getfield        #120 <Field ColorStateList rippleColor>
	//   62  126:invokestatic    #108 <Method void DrawableCompat.setTintList(Drawable, ColorStateList)>
		return ((Drawable) (wrapDrawableWithInset(((Drawable) (new LayerDrawable(new Drawable[] {
			tintableBackgroundDrawableCompat, tintableRippleDrawableCompat
		}))))));
	//   63  129:aload_0         
	//   64  130:new             #122 <Class LayerDrawable>
	//   65  133:dup             
	//   66  134:iconst_2        
	//   67  135:anewarray       Drawable[]
	//   68  138:dup             
	//   69  139:iconst_0        
	//   70  140:aload_0         
	//   71  141:getfield        #102 <Field Drawable tintableBackgroundDrawableCompat>
	//   72  144:aastore         
	//   73  145:dup             
	//   74  146:iconst_1        
	//   75  147:aload_0         
	//   76  148:getfield        #118 <Field Drawable tintableRippleDrawableCompat>
	//   77  151:aastore         
	//   78  152:invokespecial   #127 <Method void LayerDrawable(Drawable[])>
	//   79  155:invokespecial   #131 <Method InsetDrawable wrapDrawableWithInset(Drawable)>
	//   80  158:areturn         
	}

	private Drawable createBackgroundLollipop()
	{
		backgroundDrawableLollipop = new GradientDrawable();
	//    0    0:aload_0         
	//    1    1:new             #81  <Class GradientDrawable>
	//    2    4:dup             
	//    3    5:invokespecial   #82  <Method void GradientDrawable()>
	//    4    8:putfield        #136 <Field GradientDrawable backgroundDrawableLollipop>
		backgroundDrawableLollipop.setCornerRadius((float)cornerRadius + 1E-05F);
	//    5   11:aload_0         
	//    6   12:getfield        #136 <Field GradientDrawable backgroundDrawableLollipop>
	//    7   15:aload_0         
	//    8   16:getfield        #86  <Field int cornerRadius>
	//    9   19:i2f             
	//   10   20:ldc1            #87  <Float 1E-05F>
	//   11   22:fadd            
	//   12   23:invokevirtual   #91  <Method void GradientDrawable.setCornerRadius(float)>
		backgroundDrawableLollipop.setColor(-1);
	//   13   26:aload_0         
	//   14   27:getfield        #136 <Field GradientDrawable backgroundDrawableLollipop>
	//   15   30:iconst_m1       
	//   16   31:invokevirtual   #94  <Method void GradientDrawable.setColor(int)>
		updateTintAndTintModeLollipop();
	//   17   34:aload_0         
	//   18   35:invokespecial   #139 <Method void updateTintAndTintModeLollipop()>
		strokeDrawableLollipop = new GradientDrawable();
	//   19   38:aload_0         
	//   20   39:new             #81  <Class GradientDrawable>
	//   21   42:dup             
	//   22   43:invokespecial   #82  <Method void GradientDrawable()>
	//   23   46:putfield        #141 <Field GradientDrawable strokeDrawableLollipop>
		strokeDrawableLollipop.setCornerRadius((float)cornerRadius + 1E-05F);
	//   24   49:aload_0         
	//   25   50:getfield        #141 <Field GradientDrawable strokeDrawableLollipop>
	//   26   53:aload_0         
	//   27   54:getfield        #86  <Field int cornerRadius>
	//   28   57:i2f             
	//   29   58:ldc1            #87  <Float 1E-05F>
	//   30   60:fadd            
	//   31   61:invokevirtual   #91  <Method void GradientDrawable.setCornerRadius(float)>
		strokeDrawableLollipop.setColor(0);
	//   32   64:aload_0         
	//   33   65:getfield        #141 <Field GradientDrawable strokeDrawableLollipop>
	//   34   68:iconst_0        
	//   35   69:invokevirtual   #94  <Method void GradientDrawable.setColor(int)>
		strokeDrawableLollipop.setStroke(strokeWidth, strokeColor);
	//   36   72:aload_0         
	//   37   73:getfield        #141 <Field GradientDrawable strokeDrawableLollipop>
	//   38   76:aload_0         
	//   39   77:getfield        #143 <Field int strokeWidth>
	//   40   80:aload_0         
	//   41   81:getfield        #145 <Field ColorStateList strokeColor>
	//   42   84:invokevirtual   #149 <Method void GradientDrawable.setStroke(int, ColorStateList)>
		InsetDrawable insetdrawable = wrapDrawableWithInset(((Drawable) (new LayerDrawable(new Drawable[] {
			backgroundDrawableLollipop, strokeDrawableLollipop
		}))));
	//   43   87:aload_0         
	//   44   88:new             #122 <Class LayerDrawable>
	//   45   91:dup             
	//   46   92:iconst_2        
	//   47   93:anewarray       Drawable[]
	//   48   96:dup             
	//   49   97:iconst_0        
	//   50   98:aload_0         
	//   51   99:getfield        #136 <Field GradientDrawable backgroundDrawableLollipop>
	//   52  102:aastore         
	//   53  103:dup             
	//   54  104:iconst_1        
	//   55  105:aload_0         
	//   56  106:getfield        #141 <Field GradientDrawable strokeDrawableLollipop>
	//   57  109:aastore         
	//   58  110:invokespecial   #127 <Method void LayerDrawable(Drawable[])>
	//   59  113:invokespecial   #131 <Method InsetDrawable wrapDrawableWithInset(Drawable)>
	//   60  116:astore_1        
		maskDrawableLollipop = new GradientDrawable();
	//   61  117:aload_0         
	//   62  118:new             #81  <Class GradientDrawable>
	//   63  121:dup             
	//   64  122:invokespecial   #82  <Method void GradientDrawable()>
	//   65  125:putfield        #151 <Field GradientDrawable maskDrawableLollipop>
		maskDrawableLollipop.setCornerRadius((float)cornerRadius + 1E-05F);
	//   66  128:aload_0         
	//   67  129:getfield        #151 <Field GradientDrawable maskDrawableLollipop>
	//   68  132:aload_0         
	//   69  133:getfield        #86  <Field int cornerRadius>
	//   70  136:i2f             
	//   71  137:ldc1            #87  <Float 1E-05F>
	//   72  139:fadd            
	//   73  140:invokevirtual   #91  <Method void GradientDrawable.setCornerRadius(float)>
		maskDrawableLollipop.setColor(-1);
	//   74  143:aload_0         
	//   75  144:getfield        #151 <Field GradientDrawable maskDrawableLollipop>
	//   76  147:iconst_m1       
	//   77  148:invokevirtual   #94  <Method void GradientDrawable.setColor(int)>
		return ((Drawable) (new MaterialButtonBackgroundDrawable(RippleUtils.convertToRippleDrawableColor(rippleColor), insetdrawable, ((Drawable) (maskDrawableLollipop)))));
	//   78  151:new             #153 <Class MaterialButtonBackgroundDrawable>
	//   79  154:dup             
	//   80  155:aload_0         
	//   81  156:getfield        #120 <Field ColorStateList rippleColor>
	//   82  159:invokestatic    #159 <Method ColorStateList RippleUtils.convertToRippleDrawableColor(ColorStateList)>
	//   83  162:aload_1         
	//   84  163:aload_0         
	//   85  164:getfield        #151 <Field GradientDrawable maskDrawableLollipop>
	//   86  167:invokespecial   #162 <Method void MaterialButtonBackgroundDrawable(ColorStateList, InsetDrawable, Drawable)>
	//   87  170:areturn         
	}

	private GradientDrawable unwrapBackgroundDrawable()
	{
		if(IS_LOLLIPOP && materialButton.getBackground() != null)
	//*   0    0:getstatic       #51  <Field boolean IS_LOLLIPOP>
	//*   1    3:ifeq            47
	//*   2    6:aload_0         
	//*   3    7:getfield        #77  <Field MaterialButton materialButton>
	//*   4   10:invokevirtual   #170 <Method Drawable MaterialButton.getBackground()>
	//*   5   13:ifnull          47
			return (GradientDrawable)((LayerDrawable)((InsetDrawable)((RippleDrawable)materialButton.getBackground()).getDrawable(0)).getDrawable()).getDrawable(0);
	//    6   16:aload_0         
	//    7   17:getfield        #77  <Field MaterialButton materialButton>
	//    8   20:invokevirtual   #170 <Method Drawable MaterialButton.getBackground()>
	//    9   23:checkcast       #172 <Class RippleDrawable>
	//   10   26:iconst_0        
	//   11   27:invokevirtual   #176 <Method Drawable RippleDrawable.getDrawable(int)>
	//   12   30:checkcast       #178 <Class InsetDrawable>
	//   13   33:invokevirtual   #180 <Method Drawable InsetDrawable.getDrawable()>
	//   14   36:checkcast       #122 <Class LayerDrawable>
	//   15   39:iconst_0        
	//   16   40:invokevirtual   #181 <Method Drawable LayerDrawable.getDrawable(int)>
	//   17   43:checkcast       #81  <Class GradientDrawable>
	//   18   46:areturn         
		else
			return null;
	//   19   47:aconst_null     
	//   20   48:areturn         
	}

	private GradientDrawable unwrapStrokeDrawable()
	{
		if(IS_LOLLIPOP && materialButton.getBackground() != null)
	//*   0    0:getstatic       #51  <Field boolean IS_LOLLIPOP>
	//*   1    3:ifeq            47
	//*   2    6:aload_0         
	//*   3    7:getfield        #77  <Field MaterialButton materialButton>
	//*   4   10:invokevirtual   #170 <Method Drawable MaterialButton.getBackground()>
	//*   5   13:ifnull          47
			return (GradientDrawable)((LayerDrawable)((InsetDrawable)((RippleDrawable)materialButton.getBackground()).getDrawable(0)).getDrawable()).getDrawable(1);
	//    6   16:aload_0         
	//    7   17:getfield        #77  <Field MaterialButton materialButton>
	//    8   20:invokevirtual   #170 <Method Drawable MaterialButton.getBackground()>
	//    9   23:checkcast       #172 <Class RippleDrawable>
	//   10   26:iconst_0        
	//   11   27:invokevirtual   #176 <Method Drawable RippleDrawable.getDrawable(int)>
	//   12   30:checkcast       #178 <Class InsetDrawable>
	//   13   33:invokevirtual   #180 <Method Drawable InsetDrawable.getDrawable()>
	//   14   36:checkcast       #122 <Class LayerDrawable>
	//   15   39:iconst_1        
	//   16   40:invokevirtual   #181 <Method Drawable LayerDrawable.getDrawable(int)>
	//   17   43:checkcast       #81  <Class GradientDrawable>
	//   18   46:areturn         
		else
			return null;
	//   19   47:aconst_null     
	//   20   48:areturn         
	}

	private void updateStroke()
	{
		if(IS_LOLLIPOP && strokeDrawableLollipop != null)
	//*   0    0:getstatic       #51  <Field boolean IS_LOLLIPOP>
	//*   1    3:ifeq            25
	//*   2    6:aload_0         
	//*   3    7:getfield        #141 <Field GradientDrawable strokeDrawableLollipop>
	//*   4   10:ifnull          25
		{
			materialButton.setInternalBackground(createBackgroundLollipop());
	//    5   13:aload_0         
	//    6   14:getfield        #77  <Field MaterialButton materialButton>
	//    7   17:aload_0         
	//    8   18:invokespecial   #185 <Method Drawable createBackgroundLollipop()>
	//    9   21:invokevirtual   #189 <Method void MaterialButton.setInternalBackground(Drawable)>
			return;
	//   10   24:return          
		}
		if(!IS_LOLLIPOP)
	//*  11   25:getstatic       #51  <Field boolean IS_LOLLIPOP>
	//*  12   28:ifne            38
			materialButton.invalidate();
	//   13   31:aload_0         
	//   14   32:getfield        #77  <Field MaterialButton materialButton>
	//   15   35:invokevirtual   #192 <Method void MaterialButton.invalidate()>
	//   16   38:return          
	}

	private void updateTintAndTintModeLollipop()
	{
		Object obj = ((Object) (backgroundDrawableLollipop));
	//    0    0:aload_0         
	//    1    1:getfield        #136 <Field GradientDrawable backgroundDrawableLollipop>
	//    2    4:astore_1        
		if(obj != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          34
		{
			DrawableCompat.setTintList(((Drawable) (obj)), backgroundTint);
	//    5    9:aload_1         
	//    6   10:aload_0         
	//    7   11:getfield        #104 <Field ColorStateList backgroundTint>
	//    8   14:invokestatic    #108 <Method void DrawableCompat.setTintList(Drawable, ColorStateList)>
			obj = ((Object) (backgroundTintMode));
	//    9   17:aload_0         
	//   10   18:getfield        #110 <Field android.graphics.PorterDuff$Mode backgroundTintMode>
	//   11   21:astore_1        
			if(obj != null)
	//*  12   22:aload_1         
	//*  13   23:ifnull          34
				DrawableCompat.setTintMode(((Drawable) (backgroundDrawableLollipop)), ((android.graphics.PorterDuff.Mode) (obj)));
	//   14   26:aload_0         
	//   15   27:getfield        #136 <Field GradientDrawable backgroundDrawableLollipop>
	//   16   30:aload_1         
	//   17   31:invokestatic    #114 <Method void DrawableCompat.setTintMode(Drawable, android.graphics.PorterDuff$Mode)>
		}
	//   18   34:return          
	}

	private InsetDrawable wrapDrawableWithInset(Drawable drawable)
	{
		return new InsetDrawable(drawable, insetLeft, insetTop, insetRight, insetBottom);
	//    0    0:new             #178 <Class InsetDrawable>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:aload_0         
	//    4    6:getfield        #194 <Field int insetLeft>
	//    5    9:aload_0         
	//    6   10:getfield        #196 <Field int insetTop>
	//    7   13:aload_0         
	//    8   14:getfield        #198 <Field int insetRight>
	//    9   17:aload_0         
	//   10   18:getfield        #200 <Field int insetBottom>
	//   11   21:invokespecial   #203 <Method void InsetDrawable(Drawable, int, int, int, int)>
	//   12   24:areturn         
	}

	void drawStroke(Canvas canvas)
	{
		if(canvas != null && strokeColor != null && strokeWidth > 0)
	//*   0    0:aload_1         
	//*   1    1:ifnull          158
	//*   2    4:aload_0         
	//*   3    5:getfield        #145 <Field ColorStateList strokeColor>
	//*   4    8:ifnull          158
	//*   5   11:aload_0         
	//*   6   12:getfield        #143 <Field int strokeWidth>
	//*   7   15:ifle            158
		{
			bounds.set(materialButton.getBackground().getBounds());
	//    8   18:aload_0         
	//    9   19:getfield        #68  <Field Rect bounds>
	//   10   22:aload_0         
	//   11   23:getfield        #77  <Field MaterialButton materialButton>
	//   12   26:invokevirtual   #170 <Method Drawable MaterialButton.getBackground()>
	//   13   29:invokevirtual   #209 <Method Rect Drawable.getBounds()>
	//   14   32:invokevirtual   #213 <Method void Rect.set(Rect)>
			rectF.set((float)bounds.left + (float)strokeWidth / 2.0F + (float)insetLeft, (float)bounds.top + (float)strokeWidth / 2.0F + (float)insetTop, (float)bounds.right - (float)strokeWidth / 2.0F - (float)insetRight, (float)bounds.bottom - (float)strokeWidth / 2.0F - (float)insetBottom);
	//   15   35:aload_0         
	//   16   36:getfield        #73  <Field RectF rectF>
	//   17   39:aload_0         
	//   18   40:getfield        #68  <Field Rect bounds>
	//   19   43:getfield        #216 <Field int Rect.left>
	//   20   46:i2f             
	//   21   47:aload_0         
	//   22   48:getfield        #143 <Field int strokeWidth>
	//   23   51:i2f             
	//   24   52:fconst_2        
	//   25   53:fdiv            
	//   26   54:fadd            
	//   27   55:aload_0         
	//   28   56:getfield        #194 <Field int insetLeft>
	//   29   59:i2f             
	//   30   60:fadd            
	//   31   61:aload_0         
	//   32   62:getfield        #68  <Field Rect bounds>
	//   33   65:getfield        #219 <Field int Rect.top>
	//   34   68:i2f             
	//   35   69:aload_0         
	//   36   70:getfield        #143 <Field int strokeWidth>
	//   37   73:i2f             
	//   38   74:fconst_2        
	//   39   75:fdiv            
	//   40   76:fadd            
	//   41   77:aload_0         
	//   42   78:getfield        #196 <Field int insetTop>
	//   43   81:i2f             
	//   44   82:fadd            
	//   45   83:aload_0         
	//   46   84:getfield        #68  <Field Rect bounds>
	//   47   87:getfield        #222 <Field int Rect.right>
	//   48   90:i2f             
	//   49   91:aload_0         
	//   50   92:getfield        #143 <Field int strokeWidth>
	//   51   95:i2f             
	//   52   96:fconst_2        
	//   53   97:fdiv            
	//   54   98:fsub            
	//   55   99:aload_0         
	//   56  100:getfield        #198 <Field int insetRight>
	//   57  103:i2f             
	//   58  104:fsub            
	//   59  105:aload_0         
	//   60  106:getfield        #68  <Field Rect bounds>
	//   61  109:getfield        #225 <Field int Rect.bottom>
	//   62  112:i2f             
	//   63  113:aload_0         
	//   64  114:getfield        #143 <Field int strokeWidth>
	//   65  117:i2f             
	//   66  118:fconst_2        
	//   67  119:fdiv            
	//   68  120:fsub            
	//   69  121:aload_0         
	//   70  122:getfield        #200 <Field int insetBottom>
	//   71  125:i2f             
	//   72  126:fsub            
	//   73  127:invokevirtual   #228 <Method void RectF.set(float, float, float, float)>
			float f = (float)cornerRadius - (float)strokeWidth / 2.0F;
	//   74  130:aload_0         
	//   75  131:getfield        #86  <Field int cornerRadius>
	//   76  134:i2f             
	//   77  135:aload_0         
	//   78  136:getfield        #143 <Field int strokeWidth>
	//   79  139:i2f             
	//   80  140:fconst_2        
	//   81  141:fdiv            
	//   82  142:fsub            
	//   83  143:fstore_2        
			canvas.drawRoundRect(rectF, f, f, buttonStrokePaint);
	//   84  144:aload_1         
	//   85  145:aload_0         
	//   86  146:getfield        #73  <Field RectF rectF>
	//   87  149:fload_2         
	//   88  150:fload_2         
	//   89  151:aload_0         
	//   90  152:getfield        #63  <Field Paint buttonStrokePaint>
	//   91  155:invokevirtual   #234 <Method void Canvas.drawRoundRect(RectF, float, float, Paint)>
		}
	//   92  158:return          
	}

	int getCornerRadius()
	{
		return cornerRadius;
	//    0    0:aload_0         
	//    1    1:getfield        #86  <Field int cornerRadius>
	//    2    4:ireturn         
	}

	ColorStateList getRippleColor()
	{
		return rippleColor;
	//    0    0:aload_0         
	//    1    1:getfield        #120 <Field ColorStateList rippleColor>
	//    2    4:areturn         
	}

	ColorStateList getStrokeColor()
	{
		return strokeColor;
	//    0    0:aload_0         
	//    1    1:getfield        #145 <Field ColorStateList strokeColor>
	//    2    4:areturn         
	}

	int getStrokeWidth()
	{
		return strokeWidth;
	//    0    0:aload_0         
	//    1    1:getfield        #143 <Field int strokeWidth>
	//    2    4:ireturn         
	}

	ColorStateList getSupportBackgroundTintList()
	{
		return backgroundTint;
	//    0    0:aload_0         
	//    1    1:getfield        #104 <Field ColorStateList backgroundTint>
	//    2    4:areturn         
	}

	android.graphics.PorterDuff.Mode getSupportBackgroundTintMode()
	{
		return backgroundTintMode;
	//    0    0:aload_0         
	//    1    1:getfield        #110 <Field android.graphics.PorterDuff$Mode backgroundTintMode>
	//    2    4:areturn         
	}

	boolean isBackgroundOverwritten()
	{
		return backgroundOverwritten;
	//    0    0:aload_0         
	//    1    1:getfield        #75  <Field boolean backgroundOverwritten>
	//    2    4:ireturn         
	}

	public void loadFromAttributes(TypedArray typedarray)
	{
		int j = android.support.design.R.styleable.MaterialButton_android_insetLeft;
	//    0    0:getstatic       #253 <Field int android.support.design.R$styleable.MaterialButton_android_insetLeft>
	//    1    3:istore_3        
		int i = 0;
	//    2    4:iconst_0        
	//    3    5:istore_2        
		insetLeft = typedarray.getDimensionPixelOffset(j, 0);
	//    4    6:aload_0         
	//    5    7:aload_1         
	//    6    8:iload_3         
	//    7    9:iconst_0        
	//    8   10:invokevirtual   #259 <Method int TypedArray.getDimensionPixelOffset(int, int)>
	//    9   13:putfield        #194 <Field int insetLeft>
		insetRight = typedarray.getDimensionPixelOffset(android.support.design.R.styleable.MaterialButton_android_insetRight, 0);
	//   10   16:aload_0         
	//   11   17:aload_1         
	//   12   18:getstatic       #262 <Field int android.support.design.R$styleable.MaterialButton_android_insetRight>
	//   13   21:iconst_0        
	//   14   22:invokevirtual   #259 <Method int TypedArray.getDimensionPixelOffset(int, int)>
	//   15   25:putfield        #198 <Field int insetRight>
		insetTop = typedarray.getDimensionPixelOffset(android.support.design.R.styleable.MaterialButton_android_insetTop, 0);
	//   16   28:aload_0         
	//   17   29:aload_1         
	//   18   30:getstatic       #265 <Field int android.support.design.R$styleable.MaterialButton_android_insetTop>
	//   19   33:iconst_0        
	//   20   34:invokevirtual   #259 <Method int TypedArray.getDimensionPixelOffset(int, int)>
	//   21   37:putfield        #196 <Field int insetTop>
		insetBottom = typedarray.getDimensionPixelOffset(android.support.design.R.styleable.MaterialButton_android_insetBottom, 0);
	//   22   40:aload_0         
	//   23   41:aload_1         
	//   24   42:getstatic       #268 <Field int android.support.design.R$styleable.MaterialButton_android_insetBottom>
	//   25   45:iconst_0        
	//   26   46:invokevirtual   #259 <Method int TypedArray.getDimensionPixelOffset(int, int)>
	//   27   49:putfield        #200 <Field int insetBottom>
		cornerRadius = typedarray.getDimensionPixelSize(android.support.design.R.styleable.MaterialButton_cornerRadius, 0);
	//   28   52:aload_0         
	//   29   53:aload_1         
	//   30   54:getstatic       #271 <Field int android.support.design.R$styleable.MaterialButton_cornerRadius>
	//   31   57:iconst_0        
	//   32   58:invokevirtual   #274 <Method int TypedArray.getDimensionPixelSize(int, int)>
	//   33   61:putfield        #86  <Field int cornerRadius>
		strokeWidth = typedarray.getDimensionPixelSize(android.support.design.R.styleable.MaterialButton_strokeWidth, 0);
	//   34   64:aload_0         
	//   35   65:aload_1         
	//   36   66:getstatic       #277 <Field int android.support.design.R$styleable.MaterialButton_strokeWidth>
	//   37   69:iconst_0        
	//   38   70:invokevirtual   #274 <Method int TypedArray.getDimensionPixelSize(int, int)>
	//   39   73:putfield        #143 <Field int strokeWidth>
		backgroundTintMode = ViewUtils.parseTintMode(typedarray.getInt(android.support.design.R.styleable.MaterialButton_backgroundTintMode, -1), android.graphics.PorterDuff.Mode.SRC_IN);
	//   40   76:aload_0         
	//   41   77:aload_1         
	//   42   78:getstatic       #280 <Field int android.support.design.R$styleable.MaterialButton_backgroundTintMode>
	//   43   81:iconst_m1       
	//   44   82:invokevirtual   #283 <Method int TypedArray.getInt(int, int)>
	//   45   85:getstatic       #288 <Field android.graphics.PorterDuff$Mode android.graphics.PorterDuff$Mode.SRC_IN>
	//   46   88:invokestatic    #294 <Method android.graphics.PorterDuff$Mode ViewUtils.parseTintMode(int, android.graphics.PorterDuff$Mode)>
	//   47   91:putfield        #110 <Field android.graphics.PorterDuff$Mode backgroundTintMode>
		backgroundTint = MaterialResources.getColorStateList(materialButton.getContext(), typedarray, android.support.design.R.styleable.MaterialButton_backgroundTint);
	//   48   94:aload_0         
	//   49   95:aload_0         
	//   50   96:getfield        #77  <Field MaterialButton materialButton>
	//   51   99:invokevirtual   #298 <Method android.content.Context MaterialButton.getContext()>
	//   52  102:aload_1         
	//   53  103:getstatic       #301 <Field int android.support.design.R$styleable.MaterialButton_backgroundTint>
	//   54  106:invokestatic    #307 <Method ColorStateList MaterialResources.getColorStateList(android.content.Context, TypedArray, int)>
	//   55  109:putfield        #104 <Field ColorStateList backgroundTint>
		strokeColor = MaterialResources.getColorStateList(materialButton.getContext(), typedarray, android.support.design.R.styleable.MaterialButton_strokeColor);
	//   56  112:aload_0         
	//   57  113:aload_0         
	//   58  114:getfield        #77  <Field MaterialButton materialButton>
	//   59  117:invokevirtual   #298 <Method android.content.Context MaterialButton.getContext()>
	//   60  120:aload_1         
	//   61  121:getstatic       #310 <Field int android.support.design.R$styleable.MaterialButton_strokeColor>
	//   62  124:invokestatic    #307 <Method ColorStateList MaterialResources.getColorStateList(android.content.Context, TypedArray, int)>
	//   63  127:putfield        #145 <Field ColorStateList strokeColor>
		rippleColor = MaterialResources.getColorStateList(materialButton.getContext(), typedarray, android.support.design.R.styleable.MaterialButton_rippleColor);
	//   64  130:aload_0         
	//   65  131:aload_0         
	//   66  132:getfield        #77  <Field MaterialButton materialButton>
	//   67  135:invokevirtual   #298 <Method android.content.Context MaterialButton.getContext()>
	//   68  138:aload_1         
	//   69  139:getstatic       #313 <Field int android.support.design.R$styleable.MaterialButton_rippleColor>
	//   70  142:invokestatic    #307 <Method ColorStateList MaterialResources.getColorStateList(android.content.Context, TypedArray, int)>
	//   71  145:putfield        #120 <Field ColorStateList rippleColor>
		buttonStrokePaint.setStyle(android.graphics.Paint.Style.STROKE);
	//   72  148:aload_0         
	//   73  149:getfield        #63  <Field Paint buttonStrokePaint>
	//   74  152:getstatic       #319 <Field android.graphics.Paint$Style android.graphics.Paint$Style.STROKE>
	//   75  155:invokevirtual   #323 <Method void Paint.setStyle(android.graphics.Paint$Style)>
		buttonStrokePaint.setStrokeWidth(strokeWidth);
	//   76  158:aload_0         
	//   77  159:getfield        #63  <Field Paint buttonStrokePaint>
	//   78  162:aload_0         
	//   79  163:getfield        #143 <Field int strokeWidth>
	//   80  166:i2f             
	//   81  167:invokevirtual   #326 <Method void Paint.setStrokeWidth(float)>
		typedarray = ((TypedArray) (buttonStrokePaint));
	//   82  170:aload_0         
	//   83  171:getfield        #63  <Field Paint buttonStrokePaint>
	//   84  174:astore_1        
		Object obj = ((Object) (strokeColor));
	//   85  175:aload_0         
	//   86  176:getfield        #145 <Field ColorStateList strokeColor>
	//   87  179:astore          6
		if(obj != null)
	//*  88  181:aload           6
	//*  89  183:ifnull          200
			i = ((ColorStateList) (obj)).getColorForState(materialButton.getDrawableState(), 0);
	//   90  186:aload           6
	//   91  188:aload_0         
	//   92  189:getfield        #77  <Field MaterialButton materialButton>
	//   93  192:invokevirtual   #330 <Method int[] MaterialButton.getDrawableState()>
	//   94  195:iconst_0        
	//   95  196:invokevirtual   #336 <Method int ColorStateList.getColorForState(int[], int)>
	//   96  199:istore_2        
		((Paint) (typedarray)).setColor(i);
	//   97  200:aload_1         
	//   98  201:iload_2         
	//   99  202:invokevirtual   #337 <Method void Paint.setColor(int)>
		i = ViewCompat.getPaddingStart(((android.view.View) (materialButton)));
	//  100  205:aload_0         
	//  101  206:getfield        #77  <Field MaterialButton materialButton>
	//  102  209:invokestatic    #343 <Method int ViewCompat.getPaddingStart(android.view.View)>
	//  103  212:istore_2        
		j = materialButton.getPaddingTop();
	//  104  213:aload_0         
	//  105  214:getfield        #77  <Field MaterialButton materialButton>
	//  106  217:invokevirtual   #346 <Method int MaterialButton.getPaddingTop()>
	//  107  220:istore_3        
		int k = ViewCompat.getPaddingEnd(((android.view.View) (materialButton)));
	//  108  221:aload_0         
	//  109  222:getfield        #77  <Field MaterialButton materialButton>
	//  110  225:invokestatic    #349 <Method int ViewCompat.getPaddingEnd(android.view.View)>
	//  111  228:istore          4
		int l = materialButton.getPaddingBottom();
	//  112  230:aload_0         
	//  113  231:getfield        #77  <Field MaterialButton materialButton>
	//  114  234:invokevirtual   #352 <Method int MaterialButton.getPaddingBottom()>
	//  115  237:istore          5
		obj = ((Object) (materialButton));
	//  116  239:aload_0         
	//  117  240:getfield        #77  <Field MaterialButton materialButton>
	//  118  243:astore          6
		if(IS_LOLLIPOP)
	//* 119  245:getstatic       #51  <Field boolean IS_LOLLIPOP>
	//* 120  248:ifeq            259
			typedarray = ((TypedArray) (createBackgroundLollipop()));
	//  121  251:aload_0         
	//  122  252:invokespecial   #185 <Method Drawable createBackgroundLollipop()>
	//  123  255:astore_1        
		else
	//* 124  256:goto            264
			typedarray = ((TypedArray) (createBackgroundCompat()));
	//  125  259:aload_0         
	//  126  260:invokespecial   #354 <Method Drawable createBackgroundCompat()>
	//  127  263:astore_1        
		((MaterialButton) (obj)).setInternalBackground(((Drawable) (typedarray)));
	//  128  264:aload           6
	//  129  266:aload_1         
	//  130  267:invokevirtual   #189 <Method void MaterialButton.setInternalBackground(Drawable)>
		ViewCompat.setPaddingRelative(((android.view.View) (materialButton)), i + insetLeft, j + insetTop, k + insetRight, l + insetBottom);
	//  131  270:aload_0         
	//  132  271:getfield        #77  <Field MaterialButton materialButton>
	//  133  274:iload_2         
	//  134  275:aload_0         
	//  135  276:getfield        #194 <Field int insetLeft>
	//  136  279:iadd            
	//  137  280:iload_3         
	//  138  281:aload_0         
	//  139  282:getfield        #196 <Field int insetTop>
	//  140  285:iadd            
	//  141  286:iload           4
	//  142  288:aload_0         
	//  143  289:getfield        #198 <Field int insetRight>
	//  144  292:iadd            
	//  145  293:iload           5
	//  146  295:aload_0         
	//  147  296:getfield        #200 <Field int insetBottom>
	//  148  299:iadd            
	//  149  300:invokestatic    #358 <Method void ViewCompat.setPaddingRelative(android.view.View, int, int, int, int)>
	//  150  303:return          
	}

	void setBackgroundColor(int i)
	{
		if(IS_LOLLIPOP)
	//*   0    0:getstatic       #51  <Field boolean IS_LOLLIPOP>
	//*   1    3:ifeq            21
		{
			GradientDrawable gradientdrawable = backgroundDrawableLollipop;
	//    2    6:aload_0         
	//    3    7:getfield        #136 <Field GradientDrawable backgroundDrawableLollipop>
	//    4   10:astore_2        
			if(gradientdrawable != null)
	//*   5   11:aload_2         
	//*   6   12:ifnull          21
			{
				gradientdrawable.setColor(i);
	//    7   15:aload_2         
	//    8   16:iload_1         
	//    9   17:invokevirtual   #94  <Method void GradientDrawable.setColor(int)>
				return;
	//   10   20:return          
			}
		}
		if(!IS_LOLLIPOP)
	//*  11   21:getstatic       #51  <Field boolean IS_LOLLIPOP>
	//*  12   24:ifne            41
		{
			GradientDrawable gradientdrawable1 = colorableBackgroundDrawableCompat;
	//   13   27:aload_0         
	//   14   28:getfield        #84  <Field GradientDrawable colorableBackgroundDrawableCompat>
	//   15   31:astore_2        
			if(gradientdrawable1 != null)
	//*  16   32:aload_2         
	//*  17   33:ifnull          41
				gradientdrawable1.setColor(i);
	//   18   36:aload_2         
	//   19   37:iload_1         
	//   20   38:invokevirtual   #94  <Method void GradientDrawable.setColor(int)>
		}
	//   21   41:return          
	}

	void setBackgroundOverwritten()
	{
		backgroundOverwritten = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #75  <Field boolean backgroundOverwritten>
		materialButton.setSupportBackgroundTintList(backgroundTint);
	//    3    5:aload_0         
	//    4    6:getfield        #77  <Field MaterialButton materialButton>
	//    5    9:aload_0         
	//    6   10:getfield        #104 <Field ColorStateList backgroundTint>
	//    7   13:invokevirtual   #364 <Method void MaterialButton.setSupportBackgroundTintList(ColorStateList)>
		materialButton.setSupportBackgroundTintMode(backgroundTintMode);
	//    8   16:aload_0         
	//    9   17:getfield        #77  <Field MaterialButton materialButton>
	//   10   20:aload_0         
	//   11   21:getfield        #110 <Field android.graphics.PorterDuff$Mode backgroundTintMode>
	//   12   24:invokevirtual   #368 <Method void MaterialButton.setSupportBackgroundTintMode(android.graphics.PorterDuff$Mode)>
	//   13   27:return          
	}

	void setCornerRadius(int i)
	{
		if(cornerRadius != i)
	//*   0    0:aload_0         
	//*   1    1:getfield        #86  <Field int cornerRadius>
	//*   2    4:iload_1         
	//*   3    5:icmpeq          153
		{
			cornerRadius = i;
	//    4    8:aload_0         
	//    5    9:iload_1         
	//    6   10:putfield        #86  <Field int cornerRadius>
			if(IS_LOLLIPOP && backgroundDrawableLollipop != null && strokeDrawableLollipop != null && maskDrawableLollipop != null)
	//*   7   13:getstatic       #51  <Field boolean IS_LOLLIPOP>
	//*   8   16:ifeq            105
	//*   9   19:aload_0         
	//*  10   20:getfield        #136 <Field GradientDrawable backgroundDrawableLollipop>
	//*  11   23:ifnull          105
	//*  12   26:aload_0         
	//*  13   27:getfield        #141 <Field GradientDrawable strokeDrawableLollipop>
	//*  14   30:ifnull          105
	//*  15   33:aload_0         
	//*  16   34:getfield        #151 <Field GradientDrawable maskDrawableLollipop>
	//*  17   37:ifnull          105
			{
				if(android.os.Build.VERSION.SDK_INT == 21)
	//*  18   40:getstatic       #49  <Field int android.os.Build$VERSION.SDK_INT>
	//*  19   43:bipush          21
	//*  20   45:icmpne          72
				{
					GradientDrawable gradientdrawable = unwrapBackgroundDrawable();
	//   21   48:aload_0         
	//   22   49:invokespecial   #370 <Method GradientDrawable unwrapBackgroundDrawable()>
	//   23   52:astore_3        
					float f = (float)i + 1E-05F;
	//   24   53:iload_1         
	//   25   54:i2f             
	//   26   55:ldc1            #87  <Float 1E-05F>
	//   27   57:fadd            
	//   28   58:fstore_2        
					gradientdrawable.setCornerRadius(f);
	//   29   59:aload_3         
	//   30   60:fload_2         
	//   31   61:invokevirtual   #91  <Method void GradientDrawable.setCornerRadius(float)>
					unwrapStrokeDrawable().setCornerRadius(f);
	//   32   64:aload_0         
	//   33   65:invokespecial   #372 <Method GradientDrawable unwrapStrokeDrawable()>
	//   34   68:fload_2         
	//   35   69:invokevirtual   #91  <Method void GradientDrawable.setCornerRadius(float)>
				}
				GradientDrawable gradientdrawable1 = backgroundDrawableLollipop;
	//   36   72:aload_0         
	//   37   73:getfield        #136 <Field GradientDrawable backgroundDrawableLollipop>
	//   38   76:astore_3        
				float f1 = (float)i + 1E-05F;
	//   39   77:iload_1         
	//   40   78:i2f             
	//   41   79:ldc1            #87  <Float 1E-05F>
	//   42   81:fadd            
	//   43   82:fstore_2        
				gradientdrawable1.setCornerRadius(f1);
	//   44   83:aload_3         
	//   45   84:fload_2         
	//   46   85:invokevirtual   #91  <Method void GradientDrawable.setCornerRadius(float)>
				strokeDrawableLollipop.setCornerRadius(f1);
	//   47   88:aload_0         
	//   48   89:getfield        #141 <Field GradientDrawable strokeDrawableLollipop>
	//   49   92:fload_2         
	//   50   93:invokevirtual   #91  <Method void GradientDrawable.setCornerRadius(float)>
				maskDrawableLollipop.setCornerRadius(f1);
	//   51   96:aload_0         
	//   52   97:getfield        #151 <Field GradientDrawable maskDrawableLollipop>
	//   53  100:fload_2         
	//   54  101:invokevirtual   #91  <Method void GradientDrawable.setCornerRadius(float)>
				return;
	//   55  104:return          
			}
			if(!IS_LOLLIPOP)
	//*  56  105:getstatic       #51  <Field boolean IS_LOLLIPOP>
	//*  57  108:ifne            153
			{
				GradientDrawable gradientdrawable2 = colorableBackgroundDrawableCompat;
	//   58  111:aload_0         
	//   59  112:getfield        #84  <Field GradientDrawable colorableBackgroundDrawableCompat>
	//   60  115:astore_3        
				if(gradientdrawable2 != null && rippleDrawableCompat != null)
	//*  61  116:aload_3         
	//*  62  117:ifnull          153
	//*  63  120:aload_0         
	//*  64  121:getfield        #116 <Field GradientDrawable rippleDrawableCompat>
	//*  65  124:ifnull          153
				{
					float f2 = (float)i + 1E-05F;
	//   66  127:iload_1         
	//   67  128:i2f             
	//   68  129:ldc1            #87  <Float 1E-05F>
	//   69  131:fadd            
	//   70  132:fstore_2        
					gradientdrawable2.setCornerRadius(f2);
	//   71  133:aload_3         
	//   72  134:fload_2         
	//   73  135:invokevirtual   #91  <Method void GradientDrawable.setCornerRadius(float)>
					rippleDrawableCompat.setCornerRadius(f2);
	//   74  138:aload_0         
	//   75  139:getfield        #116 <Field GradientDrawable rippleDrawableCompat>
	//   76  142:fload_2         
	//   77  143:invokevirtual   #91  <Method void GradientDrawable.setCornerRadius(float)>
					materialButton.invalidate();
	//   78  146:aload_0         
	//   79  147:getfield        #77  <Field MaterialButton materialButton>
	//   80  150:invokevirtual   #192 <Method void MaterialButton.invalidate()>
				}
			}
		}
	//   81  153:return          
	}

	void setRippleColor(ColorStateList colorstatelist)
	{
		if(rippleColor != colorstatelist)
	//*   0    0:aload_0         
	//*   1    1:getfield        #120 <Field ColorStateList rippleColor>
	//*   2    4:aload_1         
	//*   3    5:if_acmpeq       67
		{
			rippleColor = colorstatelist;
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:putfield        #120 <Field ColorStateList rippleColor>
			if(IS_LOLLIPOP && (materialButton.getBackground() instanceof RippleDrawable))
	//*   7   13:getstatic       #51  <Field boolean IS_LOLLIPOP>
	//*   8   16:ifeq            47
	//*   9   19:aload_0         
	//*  10   20:getfield        #77  <Field MaterialButton materialButton>
	//*  11   23:invokevirtual   #170 <Method Drawable MaterialButton.getBackground()>
	//*  12   26:instanceof      #172 <Class RippleDrawable>
	//*  13   29:ifeq            47
			{
				((RippleDrawable)materialButton.getBackground()).setColor(colorstatelist);
	//   14   32:aload_0         
	//   15   33:getfield        #77  <Field MaterialButton materialButton>
	//   16   36:invokevirtual   #170 <Method Drawable MaterialButton.getBackground()>
	//   17   39:checkcast       #172 <Class RippleDrawable>
	//   18   42:aload_1         
	//   19   43:invokevirtual   #375 <Method void RippleDrawable.setColor(ColorStateList)>
				return;
	//   20   46:return          
			}
			if(!IS_LOLLIPOP)
	//*  21   47:getstatic       #51  <Field boolean IS_LOLLIPOP>
	//*  22   50:ifne            67
			{
				Drawable drawable = tintableRippleDrawableCompat;
	//   23   53:aload_0         
	//   24   54:getfield        #118 <Field Drawable tintableRippleDrawableCompat>
	//   25   57:astore_2        
				if(drawable != null)
	//*  26   58:aload_2         
	//*  27   59:ifnull          67
					DrawableCompat.setTintList(drawable, colorstatelist);
	//   28   62:aload_2         
	//   29   63:aload_1         
	//   30   64:invokestatic    #108 <Method void DrawableCompat.setTintList(Drawable, ColorStateList)>
			}
		}
	//   31   67:return          
	}

	void setStrokeColor(ColorStateList colorstatelist)
	{
		if(strokeColor != colorstatelist)
	//*   0    0:aload_0         
	//*   1    1:getfield        #145 <Field ColorStateList strokeColor>
	//*   2    4:aload_1         
	//*   3    5:if_acmpeq       46
		{
			strokeColor = colorstatelist;
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:putfield        #145 <Field ColorStateList strokeColor>
			Paint paint = buttonStrokePaint;
	//    7   13:aload_0         
	//    8   14:getfield        #63  <Field Paint buttonStrokePaint>
	//    9   17:astore_3        
			int i = 0;
	//   10   18:iconst_0        
	//   11   19:istore_2        
			if(colorstatelist != null)
	//*  12   20:aload_1         
	//*  13   21:ifnull          37
				i = colorstatelist.getColorForState(materialButton.getDrawableState(), 0);
	//   14   24:aload_1         
	//   15   25:aload_0         
	//   16   26:getfield        #77  <Field MaterialButton materialButton>
	//   17   29:invokevirtual   #330 <Method int[] MaterialButton.getDrawableState()>
	//   18   32:iconst_0        
	//   19   33:invokevirtual   #336 <Method int ColorStateList.getColorForState(int[], int)>
	//   20   36:istore_2        
			paint.setColor(i);
	//   21   37:aload_3         
	//   22   38:iload_2         
	//   23   39:invokevirtual   #337 <Method void Paint.setColor(int)>
			updateStroke();
	//   24   42:aload_0         
	//   25   43:invokespecial   #378 <Method void updateStroke()>
		}
	//   26   46:return          
	}

	void setStrokeWidth(int i)
	{
		if(strokeWidth != i)
	//*   0    0:aload_0         
	//*   1    1:getfield        #143 <Field int strokeWidth>
	//*   2    4:iload_1         
	//*   3    5:icmpeq          26
		{
			strokeWidth = i;
	//    4    8:aload_0         
	//    5    9:iload_1         
	//    6   10:putfield        #143 <Field int strokeWidth>
			buttonStrokePaint.setStrokeWidth(i);
	//    7   13:aload_0         
	//    8   14:getfield        #63  <Field Paint buttonStrokePaint>
	//    9   17:iload_1         
	//   10   18:i2f             
	//   11   19:invokevirtual   #326 <Method void Paint.setStrokeWidth(float)>
			updateStroke();
	//   12   22:aload_0         
	//   13   23:invokespecial   #378 <Method void updateStroke()>
		}
	//   14   26:return          
	}

	void setSupportBackgroundTintList(ColorStateList colorstatelist)
	{
		if(backgroundTint != colorstatelist)
	//*   0    0:aload_0         
	//*   1    1:getfield        #104 <Field ColorStateList backgroundTint>
	//*   2    4:aload_1         
	//*   3    5:if_acmpeq       41
		{
			backgroundTint = colorstatelist;
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:putfield        #104 <Field ColorStateList backgroundTint>
			if(IS_LOLLIPOP)
	//*   7   13:getstatic       #51  <Field boolean IS_LOLLIPOP>
	//*   8   16:ifeq            24
			{
				updateTintAndTintModeLollipop();
	//    9   19:aload_0         
	//   10   20:invokespecial   #139 <Method void updateTintAndTintModeLollipop()>
				return;
	//   11   23:return          
			}
			colorstatelist = ((ColorStateList) (tintableBackgroundDrawableCompat));
	//   12   24:aload_0         
	//   13   25:getfield        #102 <Field Drawable tintableBackgroundDrawableCompat>
	//   14   28:astore_1        
			if(colorstatelist != null)
	//*  15   29:aload_1         
	//*  16   30:ifnull          41
				DrawableCompat.setTintList(((Drawable) (colorstatelist)), backgroundTint);
	//   17   33:aload_1         
	//   18   34:aload_0         
	//   19   35:getfield        #104 <Field ColorStateList backgroundTint>
	//   20   38:invokestatic    #108 <Method void DrawableCompat.setTintList(Drawable, ColorStateList)>
		}
	//   21   41:return          
	}

	void setSupportBackgroundTintMode(android.graphics.PorterDuff.Mode mode)
	{
		if(backgroundTintMode != mode)
	//*   0    0:aload_0         
	//*   1    1:getfield        #110 <Field android.graphics.PorterDuff$Mode backgroundTintMode>
	//*   2    4:aload_1         
	//*   3    5:if_acmpeq       47
		{
			backgroundTintMode = mode;
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:putfield        #110 <Field android.graphics.PorterDuff$Mode backgroundTintMode>
			if(IS_LOLLIPOP)
	//*   7   13:getstatic       #51  <Field boolean IS_LOLLIPOP>
	//*   8   16:ifeq            24
			{
				updateTintAndTintModeLollipop();
	//    9   19:aload_0         
	//   10   20:invokespecial   #139 <Method void updateTintAndTintModeLollipop()>
				return;
	//   11   23:return          
			}
			mode = ((android.graphics.PorterDuff.Mode) (tintableBackgroundDrawableCompat));
	//   12   24:aload_0         
	//   13   25:getfield        #102 <Field Drawable tintableBackgroundDrawableCompat>
	//   14   28:astore_1        
			if(mode != null)
	//*  15   29:aload_1         
	//*  16   30:ifnull          47
			{
				android.graphics.PorterDuff.Mode mode1 = backgroundTintMode;
	//   17   33:aload_0         
	//   18   34:getfield        #110 <Field android.graphics.PorterDuff$Mode backgroundTintMode>
	//   19   37:astore_2        
				if(mode1 != null)
	//*  20   38:aload_2         
	//*  21   39:ifnull          47
					DrawableCompat.setTintMode(((Drawable) (mode)), mode1);
	//   22   42:aload_1         
	//   23   43:aload_2         
	//   24   44:invokestatic    #114 <Method void DrawableCompat.setTintMode(Drawable, android.graphics.PorterDuff$Mode)>
			}
		}
	//   25   47:return          
	}

	void updateMaskBounds(int i, int j)
	{
		GradientDrawable gradientdrawable = maskDrawableLollipop;
	//    0    0:aload_0         
	//    1    1:getfield        #151 <Field GradientDrawable maskDrawableLollipop>
	//    2    4:astore_3        
		if(gradientdrawable != null)
	//*   3    5:aload_3         
	//*   4    6:ifnull          33
			gradientdrawable.setBounds(insetLeft, insetTop, j - insetRight, i - insetBottom);
	//    5    9:aload_3         
	//    6   10:aload_0         
	//    7   11:getfield        #194 <Field int insetLeft>
	//    8   14:aload_0         
	//    9   15:getfield        #196 <Field int insetTop>
	//   10   18:iload_2         
	//   11   19:aload_0         
	//   12   20:getfield        #198 <Field int insetRight>
	//   13   23:isub            
	//   14   24:iload_1         
	//   15   25:aload_0         
	//   16   26:getfield        #200 <Field int insetBottom>
	//   17   29:isub            
	//   18   30:invokevirtual   #384 <Method void GradientDrawable.setBounds(int, int, int, int)>
	//   19   33:return          
	}

	private static final boolean IS_LOLLIPOP;
	private GradientDrawable backgroundDrawableLollipop;
	private boolean backgroundOverwritten;
	private ColorStateList backgroundTint;
	private android.graphics.PorterDuff.Mode backgroundTintMode;
	private final Rect bounds = new Rect();
	private final Paint buttonStrokePaint = new Paint(1);
	private GradientDrawable colorableBackgroundDrawableCompat;
	private int cornerRadius;
	private int insetBottom;
	private int insetLeft;
	private int insetRight;
	private int insetTop;
	private GradientDrawable maskDrawableLollipop;
	private final MaterialButton materialButton;
	private final RectF rectF = new RectF();
	private ColorStateList rippleColor;
	private GradientDrawable rippleDrawableCompat;
	private ColorStateList strokeColor;
	private GradientDrawable strokeDrawableLollipop;
	private int strokeWidth;
	private Drawable tintableBackgroundDrawableCompat;
	private Drawable tintableRippleDrawableCompat;

	static 
	{
		boolean flag;
		if(android.os.Build.VERSION.SDK_INT >= 21)
	//*   0    0:getstatic       #49  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          21
	//*   2    5:icmplt          13
			flag = true;
	//    3    8:iconst_1        
	//    4    9:istore_0        
		else
	//*   5   10:goto            15
			flag = false;
	//    6   13:iconst_0        
	//    7   14:istore_0        
		IS_LOLLIPOP = flag;
	//    8   15:iload_0         
	//    9   16:putstatic       #51  <Field boolean IS_LOLLIPOP>
	//*  10   19:return          
	}
}

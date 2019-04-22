// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.button;

import android.content.Context;
import android.content.res.*;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.support.design.internal.ThemeEnforcement;
import android.support.design.internal.ViewUtils;
import android.support.design.resources.MaterialResources;
import android.support.v4.graphics.drawable.DrawableCompat;
import android.support.v4.view.ViewCompat;
import android.support.v4.widget.TextViewCompat;
import android.support.v7.content.res.AppCompatResources;
import android.support.v7.widget.AppCompatButton;
import android.util.AttributeSet;
import android.util.Log;
import java.lang.annotation.Annotation;

// Referenced classes of package android.support.design.button:
//			MaterialButtonHelper

public class MaterialButton extends AppCompatButton
{
	public static interface IconGravity
		extends Annotation
	{
	}


	public MaterialButton(Context context, AttributeSet attributeset)
	{
		this(context, attributeset, android.support.design.R.attr.materialButtonStyle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:getstatic       #29  <Field int android.support.design.R$attr.materialButtonStyle>
	//    4    6:invokespecial   #32  <Method void MaterialButton(Context, AttributeSet, int)>
	//    5    9:return          
	}

	public MaterialButton(Context context, AttributeSet attributeset, int i)
	{
		super(context, attributeset, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:invokespecial   #34  <Method void AppCompatButton(Context, AttributeSet, int)>
		context = ((Context) (ThemeEnforcement.obtainStyledAttributes(context, attributeset, android.support.design.R.styleable.MaterialButton, i, android.support.design.R.style.Widget_MaterialComponents_Button, new int[0])));
	//    5    7:aload_1         
	//    6    8:aload_2         
	//    7    9:getstatic       #40  <Field int[] android.support.design.R$styleable.MaterialButton>
	//    8   12:iload_3         
	//    9   13:getstatic       #45  <Field int android.support.design.R$style.Widget_MaterialComponents_Button>
	//   10   16:iconst_0        
	//   11   17:newarray        int[]
	//   12   19:invokestatic    #51  <Method TypedArray ThemeEnforcement.obtainStyledAttributes(Context, AttributeSet, int[], int, int, int[])>
	//   13   22:astore_1        
		iconPadding = ((TypedArray) (context)).getDimensionPixelSize(android.support.design.R.styleable.MaterialButton_iconPadding, 0);
	//   14   23:aload_0         
	//   15   24:aload_1         
	//   16   25:getstatic       #54  <Field int android.support.design.R$styleable.MaterialButton_iconPadding>
	//   17   28:iconst_0        
	//   18   29:invokevirtual   #60  <Method int TypedArray.getDimensionPixelSize(int, int)>
	//   19   32:putfield        #62  <Field int iconPadding>
		iconTintMode = ViewUtils.parseTintMode(((TypedArray) (context)).getInt(android.support.design.R.styleable.MaterialButton_iconTintMode, -1), android.graphics.PorterDuff.Mode.SRC_IN);
	//   20   35:aload_0         
	//   21   36:aload_1         
	//   22   37:getstatic       #65  <Field int android.support.design.R$styleable.MaterialButton_iconTintMode>
	//   23   40:iconst_m1       
	//   24   41:invokevirtual   #68  <Method int TypedArray.getInt(int, int)>
	//   25   44:getstatic       #73  <Field android.graphics.PorterDuff$Mode android.graphics.PorterDuff$Mode.SRC_IN>
	//   26   47:invokestatic    #79  <Method android.graphics.PorterDuff$Mode ViewUtils.parseTintMode(int, android.graphics.PorterDuff$Mode)>
	//   27   50:putfield        #81  <Field android.graphics.PorterDuff$Mode iconTintMode>
		iconTint = MaterialResources.getColorStateList(getContext(), ((TypedArray) (context)), android.support.design.R.styleable.MaterialButton_iconTint);
	//   28   53:aload_0         
	//   29   54:aload_0         
	//   30   55:invokevirtual   #85  <Method Context getContext()>
	//   31   58:aload_1         
	//   32   59:getstatic       #88  <Field int android.support.design.R$styleable.MaterialButton_iconTint>
	//   33   62:invokestatic    #94  <Method ColorStateList MaterialResources.getColorStateList(Context, TypedArray, int)>
	//   34   65:putfield        #96  <Field ColorStateList iconTint>
		icon = MaterialResources.getDrawable(getContext(), ((TypedArray) (context)), android.support.design.R.styleable.MaterialButton_icon);
	//   35   68:aload_0         
	//   36   69:aload_0         
	//   37   70:invokevirtual   #85  <Method Context getContext()>
	//   38   73:aload_1         
	//   39   74:getstatic       #99  <Field int android.support.design.R$styleable.MaterialButton_icon>
	//   40   77:invokestatic    #103 <Method Drawable MaterialResources.getDrawable(Context, TypedArray, int)>
	//   41   80:putfield        #105 <Field Drawable icon>
		iconGravity = ((TypedArray) (context)).getInteger(android.support.design.R.styleable.MaterialButton_iconGravity, 1);
	//   42   83:aload_0         
	//   43   84:aload_1         
	//   44   85:getstatic       #108 <Field int android.support.design.R$styleable.MaterialButton_iconGravity>
	//   45   88:iconst_1        
	//   46   89:invokevirtual   #111 <Method int TypedArray.getInteger(int, int)>
	//   47   92:putfield        #113 <Field int iconGravity>
		iconSize = ((TypedArray) (context)).getDimensionPixelSize(android.support.design.R.styleable.MaterialButton_iconSize, 0);
	//   48   95:aload_0         
	//   49   96:aload_1         
	//   50   97:getstatic       #116 <Field int android.support.design.R$styleable.MaterialButton_iconSize>
	//   51  100:iconst_0        
	//   52  101:invokevirtual   #60  <Method int TypedArray.getDimensionPixelSize(int, int)>
	//   53  104:putfield        #118 <Field int iconSize>
		materialButtonHelper = new MaterialButtonHelper(this);
	//   54  107:aload_0         
	//   55  108:new             #120 <Class MaterialButtonHelper>
	//   56  111:dup             
	//   57  112:aload_0         
	//   58  113:invokespecial   #123 <Method void MaterialButtonHelper(MaterialButton)>
	//   59  116:putfield        #125 <Field MaterialButtonHelper materialButtonHelper>
		materialButtonHelper.loadFromAttributes(((TypedArray) (context)));
	//   60  119:aload_0         
	//   61  120:getfield        #125 <Field MaterialButtonHelper materialButtonHelper>
	//   62  123:aload_1         
	//   63  124:invokevirtual   #129 <Method void MaterialButtonHelper.loadFromAttributes(TypedArray)>
		((TypedArray) (context)).recycle();
	//   64  127:aload_1         
	//   65  128:invokevirtual   #133 <Method void TypedArray.recycle()>
		setCompoundDrawablePadding(iconPadding);
	//   66  131:aload_0         
	//   67  132:aload_0         
	//   68  133:getfield        #62  <Field int iconPadding>
	//   69  136:invokevirtual   #137 <Method void setCompoundDrawablePadding(int)>
		updateIcon();
	//   70  139:aload_0         
	//   71  140:invokespecial   #140 <Method void updateIcon()>
	//   72  143:return          
	}

	private boolean isLayoutRTL()
	{
		return ViewCompat.getLayoutDirection(((android.view.View) (this))) == 1;
	//    0    0:aload_0         
	//    1    1:invokestatic    #148 <Method int ViewCompat.getLayoutDirection(android.view.View)>
	//    2    4:iconst_1        
	//    3    5:icmpne          10
	//    4    8:iconst_1        
	//    5    9:ireturn         
	//    6   10:iconst_0        
	//    7   11:ireturn         
	}

	private boolean isUsingOriginalBackground()
	{
		MaterialButtonHelper materialbuttonhelper = materialButtonHelper;
	//    0    0:aload_0         
	//    1    1:getfield        #125 <Field MaterialButtonHelper materialButtonHelper>
	//    2    4:astore_1        
		return materialbuttonhelper != null && !materialbuttonhelper.isBackgroundOverwritten();
	//    3    5:aload_1         
	//    4    6:ifnull          18
	//    5    9:aload_1         
	//    6   10:invokevirtual   #152 <Method boolean MaterialButtonHelper.isBackgroundOverwritten()>
	//    7   13:ifne            18
	//    8   16:iconst_1        
	//    9   17:ireturn         
	//   10   18:iconst_0        
	//   11   19:ireturn         
	}

	private void updateIcon()
	{
		Object obj = ((Object) (icon));
	//    0    0:aload_0         
	//    1    1:getfield        #105 <Field Drawable icon>
	//    2    4:astore          4
		if(obj != null)
	//*   3    6:aload           4
	//*   4    8:ifnull          113
		{
			icon = ((Drawable) (obj)).mutate();
	//    5   11:aload_0         
	//    6   12:aload           4
	//    7   14:invokevirtual   #158 <Method Drawable Drawable.mutate()>
	//    8   17:putfield        #105 <Field Drawable icon>
			DrawableCompat.setTintList(icon, iconTint);
	//    9   20:aload_0         
	//   10   21:getfield        #105 <Field Drawable icon>
	//   11   24:aload_0         
	//   12   25:getfield        #96  <Field ColorStateList iconTint>
	//   13   28:invokestatic    #164 <Method void DrawableCompat.setTintList(Drawable, ColorStateList)>
			obj = ((Object) (iconTintMode));
	//   14   31:aload_0         
	//   15   32:getfield        #81  <Field android.graphics.PorterDuff$Mode iconTintMode>
	//   16   35:astore          4
			if(obj != null)
	//*  17   37:aload           4
	//*  18   39:ifnull          51
				DrawableCompat.setTintMode(icon, ((android.graphics.PorterDuff.Mode) (obj)));
	//   19   42:aload_0         
	//   20   43:getfield        #105 <Field Drawable icon>
	//   21   46:aload           4
	//   22   48:invokestatic    #168 <Method void DrawableCompat.setTintMode(Drawable, android.graphics.PorterDuff$Mode)>
			int i = iconSize;
	//   23   51:aload_0         
	//   24   52:getfield        #118 <Field int iconSize>
	//   25   55:istore_1        
			if(i == 0)
	//*  26   56:iload_1         
	//*  27   57:ifeq            63
	//*  28   60:goto            71
				i = icon.getIntrinsicWidth();
	//   29   63:aload_0         
	//   30   64:getfield        #105 <Field Drawable icon>
	//   31   67:invokevirtual   #172 <Method int Drawable.getIntrinsicWidth()>
	//   32   70:istore_1        
			int j = iconSize;
	//   33   71:aload_0         
	//   34   72:getfield        #118 <Field int iconSize>
	//   35   75:istore_2        
			if(j == 0)
	//*  36   76:iload_2         
	//*  37   77:ifeq            83
	//*  38   80:goto            91
				j = icon.getIntrinsicHeight();
	//   39   83:aload_0         
	//   40   84:getfield        #105 <Field Drawable icon>
	//   41   87:invokevirtual   #175 <Method int Drawable.getIntrinsicHeight()>
	//   42   90:istore_2        
			obj = ((Object) (icon));
	//   43   91:aload_0         
	//   44   92:getfield        #105 <Field Drawable icon>
	//   45   95:astore          4
			int k = iconLeft;
	//   46   97:aload_0         
	//   47   98:getfield        #177 <Field int iconLeft>
	//   48  101:istore_3        
			((Drawable) (obj)).setBounds(k, 0, i + k, j);
	//   49  102:aload           4
	//   50  104:iload_3         
	//   51  105:iconst_0        
	//   52  106:iload_1         
	//   53  107:iload_3         
	//   54  108:iadd            
	//   55  109:iload_2         
	//   56  110:invokevirtual   #181 <Method void Drawable.setBounds(int, int, int, int)>
		}
		TextViewCompat.setCompoundDrawablesRelative(((android.widget.TextView) (this)), icon, ((Drawable) (null)), ((Drawable) (null)), ((Drawable) (null)));
	//   57  113:aload_0         
	//   58  114:aload_0         
	//   59  115:getfield        #105 <Field Drawable icon>
	//   60  118:aconst_null     
	//   61  119:aconst_null     
	//   62  120:aconst_null     
	//   63  121:invokestatic    #187 <Method void TextViewCompat.setCompoundDrawablesRelative(android.widget.TextView, Drawable, Drawable, Drawable, Drawable)>
	//   64  124:return          
	}

	public ColorStateList getBackgroundTintList()
	{
		return getSupportBackgroundTintList();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #192 <Method ColorStateList getSupportBackgroundTintList()>
	//    2    4:areturn         
	}

	public android.graphics.PorterDuff.Mode getBackgroundTintMode()
	{
		return getSupportBackgroundTintMode();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #198 <Method android.graphics.PorterDuff$Mode getSupportBackgroundTintMode()>
	//    2    4:areturn         
	}

	public int getCornerRadius()
	{
		if(isUsingOriginalBackground())
	//*   0    0:aload_0         
	//*   1    1:invokespecial   #201 <Method boolean isUsingOriginalBackground()>
	//*   2    4:ifeq            15
			return materialButtonHelper.getCornerRadius();
	//    3    7:aload_0         
	//    4    8:getfield        #125 <Field MaterialButtonHelper materialButtonHelper>
	//    5   11:invokevirtual   #203 <Method int MaterialButtonHelper.getCornerRadius()>
	//    6   14:ireturn         
		else
			return 0;
	//    7   15:iconst_0        
	//    8   16:ireturn         
	}

	public Drawable getIcon()
	{
		return icon;
	//    0    0:aload_0         
	//    1    1:getfield        #105 <Field Drawable icon>
	//    2    4:areturn         
	}

	public int getIconGravity()
	{
		return iconGravity;
	//    0    0:aload_0         
	//    1    1:getfield        #113 <Field int iconGravity>
	//    2    4:ireturn         
	}

	public int getIconPadding()
	{
		return iconPadding;
	//    0    0:aload_0         
	//    1    1:getfield        #62  <Field int iconPadding>
	//    2    4:ireturn         
	}

	public int getIconSize()
	{
		return iconSize;
	//    0    0:aload_0         
	//    1    1:getfield        #118 <Field int iconSize>
	//    2    4:ireturn         
	}

	public ColorStateList getIconTint()
	{
		return iconTint;
	//    0    0:aload_0         
	//    1    1:getfield        #96  <Field ColorStateList iconTint>
	//    2    4:areturn         
	}

	public android.graphics.PorterDuff.Mode getIconTintMode()
	{
		return iconTintMode;
	//    0    0:aload_0         
	//    1    1:getfield        #81  <Field android.graphics.PorterDuff$Mode iconTintMode>
	//    2    4:areturn         
	}

	public ColorStateList getRippleColor()
	{
		if(isUsingOriginalBackground())
	//*   0    0:aload_0         
	//*   1    1:invokespecial   #201 <Method boolean isUsingOriginalBackground()>
	//*   2    4:ifeq            15
			return materialButtonHelper.getRippleColor();
	//    3    7:aload_0         
	//    4    8:getfield        #125 <Field MaterialButtonHelper materialButtonHelper>
	//    5   11:invokevirtual   #212 <Method ColorStateList MaterialButtonHelper.getRippleColor()>
	//    6   14:areturn         
		else
			return null;
	//    7   15:aconst_null     
	//    8   16:areturn         
	}

	public ColorStateList getStrokeColor()
	{
		if(isUsingOriginalBackground())
	//*   0    0:aload_0         
	//*   1    1:invokespecial   #201 <Method boolean isUsingOriginalBackground()>
	//*   2    4:ifeq            15
			return materialButtonHelper.getStrokeColor();
	//    3    7:aload_0         
	//    4    8:getfield        #125 <Field MaterialButtonHelper materialButtonHelper>
	//    5   11:invokevirtual   #215 <Method ColorStateList MaterialButtonHelper.getStrokeColor()>
	//    6   14:areturn         
		else
			return null;
	//    7   15:aconst_null     
	//    8   16:areturn         
	}

	public int getStrokeWidth()
	{
		if(isUsingOriginalBackground())
	//*   0    0:aload_0         
	//*   1    1:invokespecial   #201 <Method boolean isUsingOriginalBackground()>
	//*   2    4:ifeq            15
			return materialButtonHelper.getStrokeWidth();
	//    3    7:aload_0         
	//    4    8:getfield        #125 <Field MaterialButtonHelper materialButtonHelper>
	//    5   11:invokevirtual   #218 <Method int MaterialButtonHelper.getStrokeWidth()>
	//    6   14:ireturn         
		else
			return 0;
	//    7   15:iconst_0        
	//    8   16:ireturn         
	}

	public ColorStateList getSupportBackgroundTintList()
	{
		if(isUsingOriginalBackground())
	//*   0    0:aload_0         
	//*   1    1:invokespecial   #201 <Method boolean isUsingOriginalBackground()>
	//*   2    4:ifeq            15
			return materialButtonHelper.getSupportBackgroundTintList();
	//    3    7:aload_0         
	//    4    8:getfield        #125 <Field MaterialButtonHelper materialButtonHelper>
	//    5   11:invokevirtual   #223 <Method ColorStateList MaterialButtonHelper.getSupportBackgroundTintList()>
	//    6   14:areturn         
		else
			return super.getSupportBackgroundTintList();
	//    7   15:aload_0         
	//    8   16:invokespecial   #224 <Method ColorStateList AppCompatButton.getSupportBackgroundTintList()>
	//    9   19:areturn         
	}

	public android.graphics.PorterDuff.Mode getSupportBackgroundTintMode()
	{
		if(isUsingOriginalBackground())
	//*   0    0:aload_0         
	//*   1    1:invokespecial   #201 <Method boolean isUsingOriginalBackground()>
	//*   2    4:ifeq            15
			return materialButtonHelper.getSupportBackgroundTintMode();
	//    3    7:aload_0         
	//    4    8:getfield        #125 <Field MaterialButtonHelper materialButtonHelper>
	//    5   11:invokevirtual   #225 <Method android.graphics.PorterDuff$Mode MaterialButtonHelper.getSupportBackgroundTintMode()>
	//    6   14:areturn         
		else
			return super.getSupportBackgroundTintMode();
	//    7   15:aload_0         
	//    8   16:invokespecial   #226 <Method android.graphics.PorterDuff$Mode AppCompatButton.getSupportBackgroundTintMode()>
	//    9   19:areturn         
	}

	protected void onDraw(Canvas canvas)
	{
		super.onDraw(canvas);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #230 <Method void AppCompatButton.onDraw(Canvas)>
		if(android.os.Build.VERSION.SDK_INT < 21 && isUsingOriginalBackground())
	//*   3    5:getstatic       #235 <Field int android.os.Build$VERSION.SDK_INT>
	//*   4    8:bipush          21
	//*   5   10:icmpge          28
	//*   6   13:aload_0         
	//*   7   14:invokespecial   #201 <Method boolean isUsingOriginalBackground()>
	//*   8   17:ifeq            28
			materialButtonHelper.drawStroke(canvas);
	//    9   20:aload_0         
	//   10   21:getfield        #125 <Field MaterialButtonHelper materialButtonHelper>
	//   11   24:aload_1         
	//   12   25:invokevirtual   #238 <Method void MaterialButtonHelper.drawStroke(Canvas)>
	//   13   28:return          
	}

	protected void onLayout(boolean flag, int i, int j, int k, int l)
	{
		super.onLayout(flag, i, j, k, l);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:iload_3         
	//    4    4:iload           4
	//    5    6:iload           5
	//    6    8:invokespecial   #242 <Method void AppCompatButton.onLayout(boolean, int, int, int, int)>
		if(android.os.Build.VERSION.SDK_INT == 21)
	//*   7   11:getstatic       #235 <Field int android.os.Build$VERSION.SDK_INT>
	//*   8   14:bipush          21
	//*   9   16:icmpne          43
		{
			MaterialButtonHelper materialbuttonhelper = materialButtonHelper;
	//   10   19:aload_0         
	//   11   20:getfield        #125 <Field MaterialButtonHelper materialButtonHelper>
	//   12   23:astore          6
			if(materialbuttonhelper != null)
	//*  13   25:aload           6
	//*  14   27:ifnull          43
				materialbuttonhelper.updateMaskBounds(l - j, k - i);
	//   15   30:aload           6
	//   16   32:iload           5
	//   17   34:iload_3         
	//   18   35:isub            
	//   19   36:iload           4
	//   20   38:iload_2         
	//   21   39:isub            
	//   22   40:invokevirtual   #246 <Method void MaterialButtonHelper.updateMaskBounds(int, int)>
		}
	//   23   43:return          
	}

	protected void onMeasure(int i, int j)
	{
		super.onMeasure(i, j);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #249 <Method void AppCompatButton.onMeasure(int, int)>
		if(icon != null)
	//*   4    6:aload_0         
	//*   5    7:getfield        #105 <Field Drawable icon>
	//*   6   10:ifnull          115
		{
			if(iconGravity != 2)
	//*   7   13:aload_0         
	//*   8   14:getfield        #113 <Field int iconGravity>
	//*   9   17:iconst_2        
	//*  10   18:icmpeq          22
				return;
	//   11   21:return          
			int k = (int)((Paint) (getPaint())).measureText(getText().toString());
	//   12   22:aload_0         
	//   13   23:invokevirtual   #253 <Method android.text.TextPaint getPaint()>
	//   14   26:aload_0         
	//   15   27:invokevirtual   #257 <Method CharSequence getText()>
	//   16   30:invokeinterface #263 <Method String CharSequence.toString()>
	//   17   35:invokevirtual   #269 <Method float Paint.measureText(String)>
	//   18   38:f2i             
	//   19   39:istore_3        
			j = iconSize;
	//   20   40:aload_0         
	//   21   41:getfield        #118 <Field int iconSize>
	//   22   44:istore_2        
			i = j;
	//   23   45:iload_2         
	//   24   46:istore_1        
			if(j == 0)
	//*  25   47:iload_2         
	//*  26   48:ifne            59
				i = icon.getIntrinsicWidth();
	//   27   51:aload_0         
	//   28   52:getfield        #105 <Field Drawable icon>
	//   29   55:invokevirtual   #172 <Method int Drawable.getIntrinsicWidth()>
	//   30   58:istore_1        
			j = (getMeasuredWidth() - k - ViewCompat.getPaddingEnd(((android.view.View) (this))) - i - iconPadding - ViewCompat.getPaddingStart(((android.view.View) (this)))) / 2;
	//   31   59:aload_0         
	//   32   60:invokevirtual   #272 <Method int getMeasuredWidth()>
	//   33   63:iload_3         
	//   34   64:isub            
	//   35   65:aload_0         
	//   36   66:invokestatic    #275 <Method int ViewCompat.getPaddingEnd(android.view.View)>
	//   37   69:isub            
	//   38   70:iload_1         
	//   39   71:isub            
	//   40   72:aload_0         
	//   41   73:getfield        #62  <Field int iconPadding>
	//   42   76:isub            
	//   43   77:aload_0         
	//   44   78:invokestatic    #278 <Method int ViewCompat.getPaddingStart(android.view.View)>
	//   45   81:isub            
	//   46   82:iconst_2        
	//   47   83:idiv            
	//   48   84:istore_2        
			i = j;
	//   49   85:iload_2         
	//   50   86:istore_1        
			if(isLayoutRTL())
	//*  51   87:aload_0         
	//*  52   88:invokespecial   #280 <Method boolean isLayoutRTL()>
	//*  53   91:ifeq            97
				i = -j;
	//   54   94:iload_2         
	//   55   95:ineg            
	//   56   96:istore_1        
			if(iconLeft != i)
	//*  57   97:aload_0         
	//*  58   98:getfield        #177 <Field int iconLeft>
	//*  59  101:iload_1         
	//*  60  102:icmpeq          114
			{
				iconLeft = i;
	//   61  105:aload_0         
	//   62  106:iload_1         
	//   63  107:putfield        #177 <Field int iconLeft>
				updateIcon();
	//   64  110:aload_0         
	//   65  111:invokespecial   #140 <Method void updateIcon()>
			}
			return;
	//   66  114:return          
		} else
		{
			return;
	//   67  115:return          
		}
	}

	public void setBackground(Drawable drawable)
	{
		setBackgroundDrawable(drawable);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #285 <Method void setBackgroundDrawable(Drawable)>
	//    3    5:return          
	}

	public void setBackgroundColor(int i)
	{
		if(isUsingOriginalBackground())
	//*   0    0:aload_0         
	//*   1    1:invokespecial   #201 <Method boolean isUsingOriginalBackground()>
	//*   2    4:ifeq            16
		{
			materialButtonHelper.setBackgroundColor(i);
	//    3    7:aload_0         
	//    4    8:getfield        #125 <Field MaterialButtonHelper materialButtonHelper>
	//    5   11:iload_1         
	//    6   12:invokevirtual   #289 <Method void MaterialButtonHelper.setBackgroundColor(int)>
			return;
	//    7   15:return          
		} else
		{
			super.setBackgroundColor(i);
	//    8   16:aload_0         
	//    9   17:iload_1         
	//   10   18:invokespecial   #290 <Method void AppCompatButton.setBackgroundColor(int)>
			return;
	//   11   21:return          
		}
	}

	public void setBackgroundDrawable(Drawable drawable)
	{
		if(isUsingOriginalBackground())
	//*   0    0:aload_0         
	//*   1    1:invokespecial   #201 <Method boolean isUsingOriginalBackground()>
	//*   2    4:ifeq            51
		{
			if(drawable != getBackground())
	//*   3    7:aload_1         
	//*   4    8:aload_0         
	//*   5    9:invokevirtual   #294 <Method Drawable getBackground()>
	//*   6   12:if_acmpeq       38
			{
				Log.i("MaterialButton", "Setting a custom background is not supported.");
	//    7   15:ldc2            #295 <String "MaterialButton">
	//    8   18:ldc2            #297 <String "Setting a custom background is not supported.">
	//    9   21:invokestatic    #303 <Method int Log.i(String, String)>
	//   10   24:pop             
				materialButtonHelper.setBackgroundOverwritten();
	//   11   25:aload_0         
	//   12   26:getfield        #125 <Field MaterialButtonHelper materialButtonHelper>
	//   13   29:invokevirtual   #306 <Method void MaterialButtonHelper.setBackgroundOverwritten()>
				super.setBackgroundDrawable(drawable);
	//   14   32:aload_0         
	//   15   33:aload_1         
	//   16   34:invokespecial   #307 <Method void AppCompatButton.setBackgroundDrawable(Drawable)>
				return;
	//   17   37:return          
			} else
			{
				getBackground().setState(drawable.getState());
	//   18   38:aload_0         
	//   19   39:invokevirtual   #294 <Method Drawable getBackground()>
	//   20   42:aload_1         
	//   21   43:invokevirtual   #311 <Method int[] Drawable.getState()>
	//   22   46:invokevirtual   #315 <Method boolean Drawable.setState(int[])>
	//   23   49:pop             
				return;
	//   24   50:return          
			}
		} else
		{
			super.setBackgroundDrawable(drawable);
	//   25   51:aload_0         
	//   26   52:aload_1         
	//   27   53:invokespecial   #307 <Method void AppCompatButton.setBackgroundDrawable(Drawable)>
			return;
	//   28   56:return          
		}
	}

	public void setBackgroundResource(int i)
	{
		Drawable drawable;
		if(i != 0)
	//*   0    0:iload_1         
	//*   1    1:ifeq            16
			drawable = AppCompatResources.getDrawable(getContext(), i);
	//    2    4:aload_0         
	//    3    5:invokevirtual   #85  <Method Context getContext()>
	//    4    8:iload_1         
	//    5    9:invokestatic    #322 <Method Drawable AppCompatResources.getDrawable(Context, int)>
	//    6   12:astore_2        
		else
	//*   7   13:goto            18
			drawable = null;
	//    8   16:aconst_null     
	//    9   17:astore_2        
		setBackgroundDrawable(drawable);
	//   10   18:aload_0         
	//   11   19:aload_2         
	//   12   20:invokevirtual   #285 <Method void setBackgroundDrawable(Drawable)>
	//   13   23:return          
	}

	public void setBackgroundTintList(ColorStateList colorstatelist)
	{
		setSupportBackgroundTintList(colorstatelist);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #327 <Method void setSupportBackgroundTintList(ColorStateList)>
	//    3    5:return          
	}

	public void setBackgroundTintMode(android.graphics.PorterDuff.Mode mode)
	{
		setSupportBackgroundTintMode(mode);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #332 <Method void setSupportBackgroundTintMode(android.graphics.PorterDuff$Mode)>
	//    3    5:return          
	}

	public void setCornerRadius(int i)
	{
		if(isUsingOriginalBackground())
	//*   0    0:aload_0         
	//*   1    1:invokespecial   #201 <Method boolean isUsingOriginalBackground()>
	//*   2    4:ifeq            15
			materialButtonHelper.setCornerRadius(i);
	//    3    7:aload_0         
	//    4    8:getfield        #125 <Field MaterialButtonHelper materialButtonHelper>
	//    5   11:iload_1         
	//    6   12:invokevirtual   #335 <Method void MaterialButtonHelper.setCornerRadius(int)>
	//    7   15:return          
	}

	public void setCornerRadiusResource(int i)
	{
		if(isUsingOriginalBackground())
	//*   0    0:aload_0         
	//*   1    1:invokespecial   #201 <Method boolean isUsingOriginalBackground()>
	//*   2    4:ifeq            19
			setCornerRadius(getResources().getDimensionPixelSize(i));
	//    3    7:aload_0         
	//    4    8:aload_0         
	//    5    9:invokevirtual   #341 <Method Resources getResources()>
	//    6   12:iload_1         
	//    7   13:invokevirtual   #346 <Method int Resources.getDimensionPixelSize(int)>
	//    8   16:invokevirtual   #347 <Method void setCornerRadius(int)>
	//    9   19:return          
	}

	public void setIcon(Drawable drawable)
	{
		if(icon != drawable)
	//*   0    0:aload_0         
	//*   1    1:getfield        #105 <Field Drawable icon>
	//*   2    4:aload_1         
	//*   3    5:if_acmpeq       17
		{
			icon = drawable;
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:putfield        #105 <Field Drawable icon>
			updateIcon();
	//    7   13:aload_0         
	//    8   14:invokespecial   #140 <Method void updateIcon()>
		}
	//    9   17:return          
	}

	public void setIconGravity(int i)
	{
		iconGravity = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #113 <Field int iconGravity>
	//    3    5:return          
	}

	public void setIconPadding(int i)
	{
		if(iconPadding != i)
	//*   0    0:aload_0         
	//*   1    1:getfield        #62  <Field int iconPadding>
	//*   2    4:iload_1         
	//*   3    5:icmpeq          18
		{
			iconPadding = i;
	//    4    8:aload_0         
	//    5    9:iload_1         
	//    6   10:putfield        #62  <Field int iconPadding>
			setCompoundDrawablePadding(i);
	//    7   13:aload_0         
	//    8   14:iload_1         
	//    9   15:invokevirtual   #137 <Method void setCompoundDrawablePadding(int)>
		}
	//   10   18:return          
	}

	public void setIconResource(int i)
	{
		Drawable drawable;
		if(i != 0)
	//*   0    0:iload_1         
	//*   1    1:ifeq            16
			drawable = AppCompatResources.getDrawable(getContext(), i);
	//    2    4:aload_0         
	//    3    5:invokevirtual   #85  <Method Context getContext()>
	//    4    8:iload_1         
	//    5    9:invokestatic    #322 <Method Drawable AppCompatResources.getDrawable(Context, int)>
	//    6   12:astore_2        
		else
	//*   7   13:goto            18
			drawable = null;
	//    8   16:aconst_null     
	//    9   17:astore_2        
		setIcon(drawable);
	//   10   18:aload_0         
	//   11   19:aload_2         
	//   12   20:invokevirtual   #353 <Method void setIcon(Drawable)>
	//   13   23:return          
	}

	public void setIconSize(int i)
	{
		if(i >= 0)
	//*   0    0:iload_1         
	//*   1    1:iflt            22
		{
			if(iconSize != i)
	//*   2    4:aload_0         
	//*   3    5:getfield        #118 <Field int iconSize>
	//*   4    8:iload_1         
	//*   5    9:icmpeq          21
			{
				iconSize = i;
	//    6   12:aload_0         
	//    7   13:iload_1         
	//    8   14:putfield        #118 <Field int iconSize>
				updateIcon();
	//    9   17:aload_0         
	//   10   18:invokespecial   #140 <Method void updateIcon()>
			}
			return;
	//   11   21:return          
		} else
		{
			throw new IllegalArgumentException("iconSize cannot be less than 0");
	//   12   22:new             #356 <Class IllegalArgumentException>
	//   13   25:dup             
	//   14   26:ldc2            #358 <String "iconSize cannot be less than 0">
	//   15   29:invokespecial   #361 <Method void IllegalArgumentException(String)>
	//   16   32:athrow          
		}
	}

	public void setIconTint(ColorStateList colorstatelist)
	{
		if(iconTint != colorstatelist)
	//*   0    0:aload_0         
	//*   1    1:getfield        #96  <Field ColorStateList iconTint>
	//*   2    4:aload_1         
	//*   3    5:if_acmpeq       17
		{
			iconTint = colorstatelist;
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:putfield        #96  <Field ColorStateList iconTint>
			updateIcon();
	//    7   13:aload_0         
	//    8   14:invokespecial   #140 <Method void updateIcon()>
		}
	//    9   17:return          
	}

	public void setIconTintMode(android.graphics.PorterDuff.Mode mode)
	{
		if(iconTintMode != mode)
	//*   0    0:aload_0         
	//*   1    1:getfield        #81  <Field android.graphics.PorterDuff$Mode iconTintMode>
	//*   2    4:aload_1         
	//*   3    5:if_acmpeq       17
		{
			iconTintMode = mode;
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:putfield        #81  <Field android.graphics.PorterDuff$Mode iconTintMode>
			updateIcon();
	//    7   13:aload_0         
	//    8   14:invokespecial   #140 <Method void updateIcon()>
		}
	//    9   17:return          
	}

	public void setIconTintResource(int i)
	{
		setIconTint(AppCompatResources.getColorStateList(getContext(), i));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #85  <Method Context getContext()>
	//    3    5:iload_1         
	//    4    6:invokestatic    #368 <Method ColorStateList AppCompatResources.getColorStateList(Context, int)>
	//    5    9:invokevirtual   #370 <Method void setIconTint(ColorStateList)>
	//    6   12:return          
	}

	void setInternalBackground(Drawable drawable)
	{
		super.setBackgroundDrawable(drawable);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #307 <Method void AppCompatButton.setBackgroundDrawable(Drawable)>
	//    3    5:return          
	}

	public void setRippleColor(ColorStateList colorstatelist)
	{
		if(isUsingOriginalBackground())
	//*   0    0:aload_0         
	//*   1    1:invokespecial   #201 <Method boolean isUsingOriginalBackground()>
	//*   2    4:ifeq            15
			materialButtonHelper.setRippleColor(colorstatelist);
	//    3    7:aload_0         
	//    4    8:getfield        #125 <Field MaterialButtonHelper materialButtonHelper>
	//    5   11:aload_1         
	//    6   12:invokevirtual   #374 <Method void MaterialButtonHelper.setRippleColor(ColorStateList)>
	//    7   15:return          
	}

	public void setRippleColorResource(int i)
	{
		if(isUsingOriginalBackground())
	//*   0    0:aload_0         
	//*   1    1:invokespecial   #201 <Method boolean isUsingOriginalBackground()>
	//*   2    4:ifeq            19
			setRippleColor(AppCompatResources.getColorStateList(getContext(), i));
	//    3    7:aload_0         
	//    4    8:aload_0         
	//    5    9:invokevirtual   #85  <Method Context getContext()>
	//    6   12:iload_1         
	//    7   13:invokestatic    #368 <Method ColorStateList AppCompatResources.getColorStateList(Context, int)>
	//    8   16:invokevirtual   #376 <Method void setRippleColor(ColorStateList)>
	//    9   19:return          
	}

	public void setStrokeColor(ColorStateList colorstatelist)
	{
		if(isUsingOriginalBackground())
	//*   0    0:aload_0         
	//*   1    1:invokespecial   #201 <Method boolean isUsingOriginalBackground()>
	//*   2    4:ifeq            15
			materialButtonHelper.setStrokeColor(colorstatelist);
	//    3    7:aload_0         
	//    4    8:getfield        #125 <Field MaterialButtonHelper materialButtonHelper>
	//    5   11:aload_1         
	//    6   12:invokevirtual   #379 <Method void MaterialButtonHelper.setStrokeColor(ColorStateList)>
	//    7   15:return          
	}

	public void setStrokeColorResource(int i)
	{
		if(isUsingOriginalBackground())
	//*   0    0:aload_0         
	//*   1    1:invokespecial   #201 <Method boolean isUsingOriginalBackground()>
	//*   2    4:ifeq            19
			setStrokeColor(AppCompatResources.getColorStateList(getContext(), i));
	//    3    7:aload_0         
	//    4    8:aload_0         
	//    5    9:invokevirtual   #85  <Method Context getContext()>
	//    6   12:iload_1         
	//    7   13:invokestatic    #368 <Method ColorStateList AppCompatResources.getColorStateList(Context, int)>
	//    8   16:invokevirtual   #381 <Method void setStrokeColor(ColorStateList)>
	//    9   19:return          
	}

	public void setStrokeWidth(int i)
	{
		if(isUsingOriginalBackground())
	//*   0    0:aload_0         
	//*   1    1:invokespecial   #201 <Method boolean isUsingOriginalBackground()>
	//*   2    4:ifeq            15
			materialButtonHelper.setStrokeWidth(i);
	//    3    7:aload_0         
	//    4    8:getfield        #125 <Field MaterialButtonHelper materialButtonHelper>
	//    5   11:iload_1         
	//    6   12:invokevirtual   #384 <Method void MaterialButtonHelper.setStrokeWidth(int)>
	//    7   15:return          
	}

	public void setStrokeWidthResource(int i)
	{
		if(isUsingOriginalBackground())
	//*   0    0:aload_0         
	//*   1    1:invokespecial   #201 <Method boolean isUsingOriginalBackground()>
	//*   2    4:ifeq            19
			setStrokeWidth(getResources().getDimensionPixelSize(i));
	//    3    7:aload_0         
	//    4    8:aload_0         
	//    5    9:invokevirtual   #341 <Method Resources getResources()>
	//    6   12:iload_1         
	//    7   13:invokevirtual   #346 <Method int Resources.getDimensionPixelSize(int)>
	//    8   16:invokevirtual   #386 <Method void setStrokeWidth(int)>
	//    9   19:return          
	}

	public void setSupportBackgroundTintList(ColorStateList colorstatelist)
	{
		if(isUsingOriginalBackground())
	//*   0    0:aload_0         
	//*   1    1:invokespecial   #201 <Method boolean isUsingOriginalBackground()>
	//*   2    4:ifeq            16
		{
			materialButtonHelper.setSupportBackgroundTintList(colorstatelist);
	//    3    7:aload_0         
	//    4    8:getfield        #125 <Field MaterialButtonHelper materialButtonHelper>
	//    5   11:aload_1         
	//    6   12:invokevirtual   #387 <Method void MaterialButtonHelper.setSupportBackgroundTintList(ColorStateList)>
			return;
	//    7   15:return          
		}
		if(materialButtonHelper != null)
	//*   8   16:aload_0         
	//*   9   17:getfield        #125 <Field MaterialButtonHelper materialButtonHelper>
	//*  10   20:ifnull          28
			super.setSupportBackgroundTintList(colorstatelist);
	//   11   23:aload_0         
	//   12   24:aload_1         
	//   13   25:invokespecial   #388 <Method void AppCompatButton.setSupportBackgroundTintList(ColorStateList)>
	//   14   28:return          
	}

	public void setSupportBackgroundTintMode(android.graphics.PorterDuff.Mode mode)
	{
		if(isUsingOriginalBackground())
	//*   0    0:aload_0         
	//*   1    1:invokespecial   #201 <Method boolean isUsingOriginalBackground()>
	//*   2    4:ifeq            16
		{
			materialButtonHelper.setSupportBackgroundTintMode(mode);
	//    3    7:aload_0         
	//    4    8:getfield        #125 <Field MaterialButtonHelper materialButtonHelper>
	//    5   11:aload_1         
	//    6   12:invokevirtual   #389 <Method void MaterialButtonHelper.setSupportBackgroundTintMode(android.graphics.PorterDuff$Mode)>
			return;
	//    7   15:return          
		}
		if(materialButtonHelper != null)
	//*   8   16:aload_0         
	//*   9   17:getfield        #125 <Field MaterialButtonHelper materialButtonHelper>
	//*  10   20:ifnull          28
			super.setSupportBackgroundTintMode(mode);
	//   11   23:aload_0         
	//   12   24:aload_1         
	//   13   25:invokespecial   #390 <Method void AppCompatButton.setSupportBackgroundTintMode(android.graphics.PorterDuff$Mode)>
	//   14   28:return          
	}

	private Drawable icon;
	private int iconGravity;
	private int iconLeft;
	private int iconPadding;
	private int iconSize;
	private ColorStateList iconTint;
	private android.graphics.PorterDuff.Mode iconTintMode;
	private final MaterialButtonHelper materialButtonHelper;
}

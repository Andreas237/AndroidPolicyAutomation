// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.support.v4.graphics.drawable.DrawableCompat;
import android.support.v4.widget.CompoundButtonCompat;
import android.support.v7.content.res.AppCompatResources;
import android.util.AttributeSet;
import android.widget.CompoundButton;

// Referenced classes of package android.support.v7.widget:
//			DrawableUtils

class AppCompatCompoundButtonHelper
{
	static interface DirectSetButtonDrawableInterface
	{

		public abstract void setButtonDrawable(Drawable drawable);
	}


	AppCompatCompoundButtonHelper(CompoundButton compoundbutton)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #22  <Method void Object()>
		mButtonTintList = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #24  <Field ColorStateList mButtonTintList>
		mButtonTintMode = null;
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:putfield        #26  <Field android.graphics.PorterDuff$Mode mButtonTintMode>
		mHasButtonTint = false;
	//    8   14:aload_0         
	//    9   15:iconst_0        
	//   10   16:putfield        #28  <Field boolean mHasButtonTint>
		mHasButtonTintMode = false;
	//   11   19:aload_0         
	//   12   20:iconst_0        
	//   13   21:putfield        #30  <Field boolean mHasButtonTintMode>
		mView = compoundbutton;
	//   14   24:aload_0         
	//   15   25:aload_1         
	//   16   26:putfield        #32  <Field CompoundButton mView>
	//   17   29:return          
	}

	void applyButtonTint()
	{
		Drawable drawable = CompoundButtonCompat.getButtonDrawable(mView);
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field CompoundButton mView>
	//    2    4:invokestatic    #40  <Method Drawable CompoundButtonCompat.getButtonDrawable(CompoundButton)>
	//    3    7:astore_1        
		if(drawable != null && (mHasButtonTint || mHasButtonTintMode))
	//*   4    8:aload_1         
	//*   5    9:ifnull          91
	//*   6   12:aload_0         
	//*   7   13:getfield        #28  <Field boolean mHasButtonTint>
	//*   8   16:ifne            26
	//*   9   19:aload_0         
	//*  10   20:getfield        #30  <Field boolean mHasButtonTintMode>
	//*  11   23:ifeq            91
		{
			drawable = DrawableCompat.wrap(drawable).mutate();
	//   12   26:aload_1         
	//   13   27:invokestatic    #46  <Method Drawable DrawableCompat.wrap(Drawable)>
	//   14   30:invokevirtual   #52  <Method Drawable Drawable.mutate()>
	//   15   33:astore_1        
			if(mHasButtonTint)
	//*  16   34:aload_0         
	//*  17   35:getfield        #28  <Field boolean mHasButtonTint>
	//*  18   38:ifeq            49
				DrawableCompat.setTintList(drawable, mButtonTintList);
	//   19   41:aload_1         
	//   20   42:aload_0         
	//   21   43:getfield        #24  <Field ColorStateList mButtonTintList>
	//   22   46:invokestatic    #56  <Method void DrawableCompat.setTintList(Drawable, ColorStateList)>
			if(mHasButtonTintMode)
	//*  23   49:aload_0         
	//*  24   50:getfield        #30  <Field boolean mHasButtonTintMode>
	//*  25   53:ifeq            64
				DrawableCompat.setTintMode(drawable, mButtonTintMode);
	//   26   56:aload_1         
	//   27   57:aload_0         
	//   28   58:getfield        #26  <Field android.graphics.PorterDuff$Mode mButtonTintMode>
	//   29   61:invokestatic    #60  <Method void DrawableCompat.setTintMode(Drawable, android.graphics.PorterDuff$Mode)>
			if(drawable.isStateful())
	//*  30   64:aload_1         
	//*  31   65:invokevirtual   #64  <Method boolean Drawable.isStateful()>
	//*  32   68:ifeq            83
				drawable.setState(mView.getDrawableState());
	//   33   71:aload_1         
	//   34   72:aload_0         
	//   35   73:getfield        #32  <Field CompoundButton mView>
	//   36   76:invokevirtual   #70  <Method int[] CompoundButton.getDrawableState()>
	//   37   79:invokevirtual   #74  <Method boolean Drawable.setState(int[])>
	//   38   82:pop             
			mView.setButtonDrawable(drawable);
	//   39   83:aload_0         
	//   40   84:getfield        #32  <Field CompoundButton mView>
	//   41   87:aload_1         
	//   42   88:invokevirtual   #78  <Method void CompoundButton.setButtonDrawable(Drawable)>
		}
	//   43   91:return          
	}

	int getCompoundPaddingLeft(int i)
	{
		int j = i;
	//    0    0:iload_1         
	//    1    1:istore_2        
		if(android.os.Build.VERSION.SDK_INT < 17)
	//*   2    2:getstatic       #86  <Field int android.os.Build$VERSION.SDK_INT>
	//*   3    5:bipush          17
	//*   4    7:icmpge          31
		{
			Drawable drawable = CompoundButtonCompat.getButtonDrawable(mView);
	//    5   10:aload_0         
	//    6   11:getfield        #32  <Field CompoundButton mView>
	//    7   14:invokestatic    #40  <Method Drawable CompoundButtonCompat.getButtonDrawable(CompoundButton)>
	//    8   17:astore_3        
			j = i;
	//    9   18:iload_1         
	//   10   19:istore_2        
			if(drawable != null)
	//*  11   20:aload_3         
	//*  12   21:ifnull          31
				j = i + drawable.getIntrinsicWidth();
	//   13   24:iload_1         
	//   14   25:aload_3         
	//   15   26:invokevirtual   #90  <Method int Drawable.getIntrinsicWidth()>
	//   16   29:iadd            
	//   17   30:istore_2        
		}
		return j;
	//   18   31:iload_2         
	//   19   32:ireturn         
	}

	ColorStateList getSupportButtonTintList()
	{
		return mButtonTintList;
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field ColorStateList mButtonTintList>
	//    2    4:areturn         
	}

	android.graphics.PorterDuff.Mode getSupportButtonTintMode()
	{
		return mButtonTintMode;
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field android.graphics.PorterDuff$Mode mButtonTintMode>
	//    2    4:areturn         
	}

	void loadFromAttributes(AttributeSet attributeset, int i)
	{
		attributeset = ((AttributeSet) (mView.getContext().obtainStyledAttributes(attributeset, android.support.v7.appcompat.R.styleable.CompoundButton, i, 0)));
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field CompoundButton mView>
	//    2    4:invokevirtual   #100 <Method Context CompoundButton.getContext()>
	//    3    7:aload_1         
	//    4    8:getstatic       #106 <Field int[] android.support.v7.appcompat.R$styleable.CompoundButton>
	//    5   11:iload_2         
	//    6   12:iconst_0        
	//    7   13:invokevirtual   #112 <Method TypedArray Context.obtainStyledAttributes(AttributeSet, int[], int, int)>
	//    8   16:astore_1        
		if(!((TypedArray) (attributeset)).hasValue(android.support.v7.appcompat.R.styleable.CompoundButton_android_button))
			break MISSING_BLOCK_LABEL_58;
	//    9   17:aload_1         
	//   10   18:getstatic       #115 <Field int android.support.v7.appcompat.R$styleable.CompoundButton_android_button>
	//   11   21:invokevirtual   #121 <Method boolean TypedArray.hasValue(int)>
	//   12   24:ifeq            58
		i = ((TypedArray) (attributeset)).getResourceId(android.support.v7.appcompat.R.styleable.CompoundButton_android_button, 0);
	//   13   27:aload_1         
	//   14   28:getstatic       #115 <Field int android.support.v7.appcompat.R$styleable.CompoundButton_android_button>
	//   15   31:iconst_0        
	//   16   32:invokevirtual   #125 <Method int TypedArray.getResourceId(int, int)>
	//   17   35:istore_2        
		if(i == 0)
			break MISSING_BLOCK_LABEL_58;
	//   18   36:iload_2         
	//   19   37:ifeq            58
		mView.setButtonDrawable(AppCompatResources.getDrawable(mView.getContext(), i));
	//   20   40:aload_0         
	//   21   41:getfield        #32  <Field CompoundButton mView>
	//   22   44:aload_0         
	//   23   45:getfield        #32  <Field CompoundButton mView>
	//   24   48:invokevirtual   #100 <Method Context CompoundButton.getContext()>
	//   25   51:iload_2         
	//   26   52:invokestatic    #131 <Method Drawable AppCompatResources.getDrawable(Context, int)>
	//   27   55:invokevirtual   #78  <Method void CompoundButton.setButtonDrawable(Drawable)>
		if(((TypedArray) (attributeset)).hasValue(android.support.v7.appcompat.R.styleable.CompoundButton_buttonTint))
	//*  28   58:aload_1         
	//*  29   59:getstatic       #134 <Field int android.support.v7.appcompat.R$styleable.CompoundButton_buttonTint>
	//*  30   62:invokevirtual   #121 <Method boolean TypedArray.hasValue(int)>
	//*  31   65:ifeq            82
			CompoundButtonCompat.setButtonTintList(mView, ((TypedArray) (attributeset)).getColorStateList(android.support.v7.appcompat.R.styleable.CompoundButton_buttonTint));
	//   32   68:aload_0         
	//   33   69:getfield        #32  <Field CompoundButton mView>
	//   34   72:aload_1         
	//   35   73:getstatic       #134 <Field int android.support.v7.appcompat.R$styleable.CompoundButton_buttonTint>
	//   36   76:invokevirtual   #138 <Method ColorStateList TypedArray.getColorStateList(int)>
	//   37   79:invokestatic    #142 <Method void CompoundButtonCompat.setButtonTintList(CompoundButton, ColorStateList)>
		if(((TypedArray) (attributeset)).hasValue(android.support.v7.appcompat.R.styleable.CompoundButton_buttonTintMode))
	//*  38   82:aload_1         
	//*  39   83:getstatic       #145 <Field int android.support.v7.appcompat.R$styleable.CompoundButton_buttonTintMode>
	//*  40   86:invokevirtual   #121 <Method boolean TypedArray.hasValue(int)>
	//*  41   89:ifeq            111
			CompoundButtonCompat.setButtonTintMode(mView, DrawableUtils.parseTintMode(((TypedArray) (attributeset)).getInt(android.support.v7.appcompat.R.styleable.CompoundButton_buttonTintMode, -1), ((android.graphics.PorterDuff.Mode) (null))));
	//   42   92:aload_0         
	//   43   93:getfield        #32  <Field CompoundButton mView>
	//   44   96:aload_1         
	//   45   97:getstatic       #145 <Field int android.support.v7.appcompat.R$styleable.CompoundButton_buttonTintMode>
	//   46  100:iconst_m1       
	//   47  101:invokevirtual   #148 <Method int TypedArray.getInt(int, int)>
	//   48  104:aconst_null     
	//   49  105:invokestatic    #154 <Method android.graphics.PorterDuff$Mode DrawableUtils.parseTintMode(int, android.graphics.PorterDuff$Mode)>
	//   50  108:invokestatic    #158 <Method void CompoundButtonCompat.setButtonTintMode(CompoundButton, android.graphics.PorterDuff$Mode)>
		((TypedArray) (attributeset)).recycle();
	//   51  111:aload_1         
	//   52  112:invokevirtual   #161 <Method void TypedArray.recycle()>
		return;
	//   53  115:return          
		Exception exception;
		exception;
	//   54  116:astore_3        
		((TypedArray) (attributeset)).recycle();
	//   55  117:aload_1         
	//   56  118:invokevirtual   #161 <Method void TypedArray.recycle()>
		throw exception;
	//   57  121:aload_3         
	//   58  122:athrow          
	}

	void onSetButtonDrawable()
	{
		if(mSkipNextApply)
	//*   0    0:aload_0         
	//*   1    1:getfield        #164 <Field boolean mSkipNextApply>
	//*   2    4:ifeq            13
		{
			mSkipNextApply = false;
	//    3    7:aload_0         
	//    4    8:iconst_0        
	//    5    9:putfield        #164 <Field boolean mSkipNextApply>
			return;
	//    6   12:return          
		} else
		{
			mSkipNextApply = true;
	//    7   13:aload_0         
	//    8   14:iconst_1        
	//    9   15:putfield        #164 <Field boolean mSkipNextApply>
			applyButtonTint();
	//   10   18:aload_0         
	//   11   19:invokevirtual   #166 <Method void applyButtonTint()>
			return;
	//   12   22:return          
		}
	}

	void setSupportButtonTintList(ColorStateList colorstatelist)
	{
		mButtonTintList = colorstatelist;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #24  <Field ColorStateList mButtonTintList>
		mHasButtonTint = true;
	//    3    5:aload_0         
	//    4    6:iconst_1        
	//    5    7:putfield        #28  <Field boolean mHasButtonTint>
		applyButtonTint();
	//    6   10:aload_0         
	//    7   11:invokevirtual   #166 <Method void applyButtonTint()>
	//    8   14:return          
	}

	void setSupportButtonTintMode(android.graphics.PorterDuff.Mode mode)
	{
		mButtonTintMode = mode;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #26  <Field android.graphics.PorterDuff$Mode mButtonTintMode>
		mHasButtonTintMode = true;
	//    3    5:aload_0         
	//    4    6:iconst_1        
	//    5    7:putfield        #30  <Field boolean mHasButtonTintMode>
		applyButtonTint();
	//    6   10:aload_0         
	//    7   11:invokevirtual   #166 <Method void applyButtonTint()>
	//    8   14:return          
	}

	private ColorStateList mButtonTintList;
	private android.graphics.PorterDuff.Mode mButtonTintMode;
	private boolean mHasButtonTint;
	private boolean mHasButtonTintMode;
	private boolean mSkipNextApply;
	private final CompoundButton mView;
}

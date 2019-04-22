// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.support.v4.widget.TintableCompoundButton;
import android.support.v7.content.res.AppCompatResources;
import android.util.AttributeSet;
import android.widget.CheckBox;

// Referenced classes of package android.support.v7.widget:
//			TintContextWrapper, AppCompatCompoundButtonHelper

public class AppCompatCheckBox extends CheckBox
	implements TintableCompoundButton
{

	public AppCompatCheckBox(Context context, AttributeSet attributeset)
	{
		this(context, attributeset, android.support.v7.appcompat.R.attr.checkboxStyle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:getstatic       #16  <Field int android.support.v7.appcompat.R$attr.checkboxStyle>
	//    4    6:invokespecial   #19  <Method void AppCompatCheckBox(Context, AttributeSet, int)>
	//    5    9:return          
	}

	public AppCompatCheckBox(Context context, AttributeSet attributeset, int i)
	{
		super(TintContextWrapper.wrap(context), attributeset, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #26  <Method Context TintContextWrapper.wrap(Context)>
	//    3    5:aload_2         
	//    4    6:iload_3         
	//    5    7:invokespecial   #27  <Method void CheckBox(Context, AttributeSet, int)>
		mCompoundButtonHelper = new AppCompatCompoundButtonHelper(((android.widget.CompoundButton) (this)));
	//    6   10:aload_0         
	//    7   11:new             #29  <Class AppCompatCompoundButtonHelper>
	//    8   14:dup             
	//    9   15:aload_0         
	//   10   16:invokespecial   #32  <Method void AppCompatCompoundButtonHelper(android.widget.CompoundButton)>
	//   11   19:putfield        #34  <Field AppCompatCompoundButtonHelper mCompoundButtonHelper>
		mCompoundButtonHelper.loadFromAttributes(attributeset, i);
	//   12   22:aload_0         
	//   13   23:getfield        #34  <Field AppCompatCompoundButtonHelper mCompoundButtonHelper>
	//   14   26:aload_2         
	//   15   27:iload_3         
	//   16   28:invokevirtual   #38  <Method void AppCompatCompoundButtonHelper.loadFromAttributes(AttributeSet, int)>
	//   17   31:return          
	}

	public int getCompoundPaddingLeft()
	{
		int j = super.getCompoundPaddingLeft();
	//    0    0:aload_0         
	//    1    1:invokespecial   #42  <Method int CheckBox.getCompoundPaddingLeft()>
	//    2    4:istore_2        
		AppCompatCompoundButtonHelper appcompatcompoundbuttonhelper = mCompoundButtonHelper;
	//    3    5:aload_0         
	//    4    6:getfield        #34  <Field AppCompatCompoundButtonHelper mCompoundButtonHelper>
	//    5    9:astore_3        
		int i = j;
	//    6   10:iload_2         
	//    7   11:istore_1        
		if(appcompatcompoundbuttonhelper != null)
	//*   8   12:aload_3         
	//*   9   13:ifnull          22
			i = appcompatcompoundbuttonhelper.getCompoundPaddingLeft(j);
	//   10   16:aload_3         
	//   11   17:iload_2         
	//   12   18:invokevirtual   #45  <Method int AppCompatCompoundButtonHelper.getCompoundPaddingLeft(int)>
	//   13   21:istore_1        
		return i;
	//   14   22:iload_1         
	//   15   23:ireturn         
	}

	public ColorStateList getSupportButtonTintList()
	{
		AppCompatCompoundButtonHelper appcompatcompoundbuttonhelper = mCompoundButtonHelper;
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field AppCompatCompoundButtonHelper mCompoundButtonHelper>
	//    2    4:astore_1        
		if(appcompatcompoundbuttonhelper != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          14
			return appcompatcompoundbuttonhelper.getSupportButtonTintList();
	//    5    9:aload_1         
	//    6   10:invokevirtual   #54  <Method ColorStateList AppCompatCompoundButtonHelper.getSupportButtonTintList()>
	//    7   13:areturn         
		else
			return null;
	//    8   14:aconst_null     
	//    9   15:areturn         
	}

	public android.graphics.PorterDuff.Mode getSupportButtonTintMode()
	{
		AppCompatCompoundButtonHelper appcompatcompoundbuttonhelper = mCompoundButtonHelper;
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field AppCompatCompoundButtonHelper mCompoundButtonHelper>
	//    2    4:astore_1        
		if(appcompatcompoundbuttonhelper != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          14
			return appcompatcompoundbuttonhelper.getSupportButtonTintMode();
	//    5    9:aload_1         
	//    6   10:invokevirtual   #59  <Method android.graphics.PorterDuff$Mode AppCompatCompoundButtonHelper.getSupportButtonTintMode()>
	//    7   13:areturn         
		else
			return null;
	//    8   14:aconst_null     
	//    9   15:areturn         
	}

	public void setButtonDrawable(int i)
	{
		setButtonDrawable(AppCompatResources.getDrawable(getContext(), i));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #66  <Method Context getContext()>
	//    3    5:iload_1         
	//    4    6:invokestatic    #72  <Method Drawable AppCompatResources.getDrawable(Context, int)>
	//    5    9:invokevirtual   #75  <Method void setButtonDrawable(Drawable)>
	//    6   12:return          
	}

	public void setButtonDrawable(Drawable drawable)
	{
		super.setButtonDrawable(drawable);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #77  <Method void CheckBox.setButtonDrawable(Drawable)>
		drawable = ((Drawable) (mCompoundButtonHelper));
	//    3    5:aload_0         
	//    4    6:getfield        #34  <Field AppCompatCompoundButtonHelper mCompoundButtonHelper>
	//    5    9:astore_1        
		if(drawable != null)
	//*   6   10:aload_1         
	//*   7   11:ifnull          18
			((AppCompatCompoundButtonHelper) (drawable)).onSetButtonDrawable();
	//    8   14:aload_1         
	//    9   15:invokevirtual   #81  <Method void AppCompatCompoundButtonHelper.onSetButtonDrawable()>
	//   10   18:return          
	}

	public void setSupportButtonTintList(ColorStateList colorstatelist)
	{
		AppCompatCompoundButtonHelper appcompatcompoundbuttonhelper = mCompoundButtonHelper;
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field AppCompatCompoundButtonHelper mCompoundButtonHelper>
	//    2    4:astore_2        
		if(appcompatcompoundbuttonhelper != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          14
			appcompatcompoundbuttonhelper.setSupportButtonTintList(colorstatelist);
	//    5    9:aload_2         
	//    6   10:aload_1         
	//    7   11:invokevirtual   #85  <Method void AppCompatCompoundButtonHelper.setSupportButtonTintList(ColorStateList)>
	//    8   14:return          
	}

	public void setSupportButtonTintMode(android.graphics.PorterDuff.Mode mode)
	{
		AppCompatCompoundButtonHelper appcompatcompoundbuttonhelper = mCompoundButtonHelper;
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field AppCompatCompoundButtonHelper mCompoundButtonHelper>
	//    2    4:astore_2        
		if(appcompatcompoundbuttonhelper != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          14
			appcompatcompoundbuttonhelper.setSupportButtonTintMode(mode);
	//    5    9:aload_2         
	//    6   10:aload_1         
	//    7   11:invokevirtual   #89  <Method void AppCompatCompoundButtonHelper.setSupportButtonTintMode(android.graphics.PorterDuff$Mode)>
	//    8   14:return          
	}

	private final AppCompatCompoundButtonHelper mCompoundButtonHelper;
}

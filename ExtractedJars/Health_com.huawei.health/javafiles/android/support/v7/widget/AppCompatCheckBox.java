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

	public AppCompatCheckBox(Context context)
	{
		this(context, ((AttributeSet) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:invokespecial   #13  <Method void AppCompatCheckBox(Context, AttributeSet)>
	//    4    6:return          
	}

	public AppCompatCheckBox(Context context, AttributeSet attributeset)
	{
		this(context, attributeset, android.support.v7.appcompat.R.attr.checkboxStyle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:getstatic       #20  <Field int android.support.v7.appcompat.R$attr.checkboxStyle>
	//    4    6:invokespecial   #23  <Method void AppCompatCheckBox(Context, AttributeSet, int)>
	//    5    9:return          
	}

	public AppCompatCheckBox(Context context, AttributeSet attributeset, int i)
	{
		super(TintContextWrapper.wrap(context), attributeset, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #29  <Method Context TintContextWrapper.wrap(Context)>
	//    3    5:aload_2         
	//    4    6:iload_3         
	//    5    7:invokespecial   #30  <Method void CheckBox(Context, AttributeSet, int)>
		mCompoundButtonHelper = new AppCompatCompoundButtonHelper(((android.widget.CompoundButton) (this)));
	//    6   10:aload_0         
	//    7   11:new             #32  <Class AppCompatCompoundButtonHelper>
	//    8   14:dup             
	//    9   15:aload_0         
	//   10   16:invokespecial   #35  <Method void AppCompatCompoundButtonHelper(android.widget.CompoundButton)>
	//   11   19:putfield        #37  <Field AppCompatCompoundButtonHelper mCompoundButtonHelper>
		mCompoundButtonHelper.loadFromAttributes(attributeset, i);
	//   12   22:aload_0         
	//   13   23:getfield        #37  <Field AppCompatCompoundButtonHelper mCompoundButtonHelper>
	//   14   26:aload_2         
	//   15   27:iload_3         
	//   16   28:invokevirtual   #41  <Method void AppCompatCompoundButtonHelper.loadFromAttributes(AttributeSet, int)>
	//   17   31:return          
	}

	public int getCompoundPaddingLeft()
	{
		int i = super.getCompoundPaddingLeft();
	//    0    0:aload_0         
	//    1    1:invokespecial   #45  <Method int CheckBox.getCompoundPaddingLeft()>
	//    2    4:istore_1        
		if(mCompoundButtonHelper != null)
	//*   3    5:aload_0         
	//*   4    6:getfield        #37  <Field AppCompatCompoundButtonHelper mCompoundButtonHelper>
	//*   5    9:ifnull          21
			return mCompoundButtonHelper.getCompoundPaddingLeft(i);
	//    6   12:aload_0         
	//    7   13:getfield        #37  <Field AppCompatCompoundButtonHelper mCompoundButtonHelper>
	//    8   16:iload_1         
	//    9   17:invokevirtual   #48  <Method int AppCompatCompoundButtonHelper.getCompoundPaddingLeft(int)>
	//   10   20:ireturn         
		else
			return i;
	//   11   21:iload_1         
	//   12   22:ireturn         
	}

	public ColorStateList getSupportButtonTintList()
	{
		if(mCompoundButtonHelper != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #37  <Field AppCompatCompoundButtonHelper mCompoundButtonHelper>
	//*   2    4:ifnull          15
			return mCompoundButtonHelper.getSupportButtonTintList();
	//    3    7:aload_0         
	//    4    8:getfield        #37  <Field AppCompatCompoundButtonHelper mCompoundButtonHelper>
	//    5   11:invokevirtual   #57  <Method ColorStateList AppCompatCompoundButtonHelper.getSupportButtonTintList()>
	//    6   14:areturn         
		else
			return null;
	//    7   15:aconst_null     
	//    8   16:areturn         
	}

	public android.graphics.PorterDuff.Mode getSupportButtonTintMode()
	{
		if(mCompoundButtonHelper != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #37  <Field AppCompatCompoundButtonHelper mCompoundButtonHelper>
	//*   2    4:ifnull          15
			return mCompoundButtonHelper.getSupportButtonTintMode();
	//    3    7:aload_0         
	//    4    8:getfield        #37  <Field AppCompatCompoundButtonHelper mCompoundButtonHelper>
	//    5   11:invokevirtual   #62  <Method android.graphics.PorterDuff$Mode AppCompatCompoundButtonHelper.getSupportButtonTintMode()>
	//    6   14:areturn         
		else
			return null;
	//    7   15:aconst_null     
	//    8   16:areturn         
	}

	public void setButtonDrawable(int i)
	{
		setButtonDrawable(AppCompatResources.getDrawable(getContext(), i));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #69  <Method Context getContext()>
	//    3    5:iload_1         
	//    4    6:invokestatic    #75  <Method Drawable AppCompatResources.getDrawable(Context, int)>
	//    5    9:invokevirtual   #78  <Method void setButtonDrawable(Drawable)>
	//    6   12:return          
	}

	public void setButtonDrawable(Drawable drawable)
	{
		super.setButtonDrawable(drawable);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #80  <Method void CheckBox.setButtonDrawable(Drawable)>
		if(mCompoundButtonHelper != null)
	//*   3    5:aload_0         
	//*   4    6:getfield        #37  <Field AppCompatCompoundButtonHelper mCompoundButtonHelper>
	//*   5    9:ifnull          19
			mCompoundButtonHelper.onSetButtonDrawable();
	//    6   12:aload_0         
	//    7   13:getfield        #37  <Field AppCompatCompoundButtonHelper mCompoundButtonHelper>
	//    8   16:invokevirtual   #84  <Method void AppCompatCompoundButtonHelper.onSetButtonDrawable()>
	//    9   19:return          
	}

	public void setSupportButtonTintList(ColorStateList colorstatelist)
	{
		if(mCompoundButtonHelper != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #37  <Field AppCompatCompoundButtonHelper mCompoundButtonHelper>
	//*   2    4:ifnull          15
			mCompoundButtonHelper.setSupportButtonTintList(colorstatelist);
	//    3    7:aload_0         
	//    4    8:getfield        #37  <Field AppCompatCompoundButtonHelper mCompoundButtonHelper>
	//    5   11:aload_1         
	//    6   12:invokevirtual   #88  <Method void AppCompatCompoundButtonHelper.setSupportButtonTintList(ColorStateList)>
	//    7   15:return          
	}

	public void setSupportButtonTintMode(android.graphics.PorterDuff.Mode mode)
	{
		if(mCompoundButtonHelper != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #37  <Field AppCompatCompoundButtonHelper mCompoundButtonHelper>
	//*   2    4:ifnull          15
			mCompoundButtonHelper.setSupportButtonTintMode(mode);
	//    3    7:aload_0         
	//    4    8:getfield        #37  <Field AppCompatCompoundButtonHelper mCompoundButtonHelper>
	//    5   11:aload_1         
	//    6   12:invokevirtual   #92  <Method void AppCompatCompoundButtonHelper.setSupportButtonTintMode(android.graphics.PorterDuff$Mode)>
	//    7   15:return          
	}

	private AppCompatCompoundButtonHelper mCompoundButtonHelper;
}

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
import android.widget.RadioButton;

// Referenced classes of package android.support.v7.widget:
//			TintContextWrapper, AppCompatCompoundButtonHelper, AppCompatTextHelper

public class AppCompatRadioButton extends RadioButton
	implements TintableCompoundButton
{

	public AppCompatRadioButton(Context context)
	{
		this(context, ((AttributeSet) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:invokespecial   #15  <Method void AppCompatRadioButton(Context, AttributeSet)>
	//    4    6:return          
	}

	public AppCompatRadioButton(Context context, AttributeSet attributeset)
	{
		this(context, attributeset, android.support.v7.appcompat.R.attr.radioButtonStyle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:getstatic       #22  <Field int android.support.v7.appcompat.R$attr.radioButtonStyle>
	//    4    6:invokespecial   #25  <Method void AppCompatRadioButton(Context, AttributeSet, int)>
	//    5    9:return          
	}

	public AppCompatRadioButton(Context context, AttributeSet attributeset, int i)
	{
		super(TintContextWrapper.wrap(context), attributeset, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #31  <Method Context TintContextWrapper.wrap(Context)>
	//    3    5:aload_2         
	//    4    6:iload_3         
	//    5    7:invokespecial   #32  <Method void RadioButton(Context, AttributeSet, int)>
		mCompoundButtonHelper = new AppCompatCompoundButtonHelper(((android.widget.CompoundButton) (this)));
	//    6   10:aload_0         
	//    7   11:new             #34  <Class AppCompatCompoundButtonHelper>
	//    8   14:dup             
	//    9   15:aload_0         
	//   10   16:invokespecial   #37  <Method void AppCompatCompoundButtonHelper(android.widget.CompoundButton)>
	//   11   19:putfield        #39  <Field AppCompatCompoundButtonHelper mCompoundButtonHelper>
		mCompoundButtonHelper.loadFromAttributes(attributeset, i);
	//   12   22:aload_0         
	//   13   23:getfield        #39  <Field AppCompatCompoundButtonHelper mCompoundButtonHelper>
	//   14   26:aload_2         
	//   15   27:iload_3         
	//   16   28:invokevirtual   #43  <Method void AppCompatCompoundButtonHelper.loadFromAttributes(AttributeSet, int)>
		mTextHelper = new AppCompatTextHelper(((android.widget.TextView) (this)));
	//   17   31:aload_0         
	//   18   32:new             #45  <Class AppCompatTextHelper>
	//   19   35:dup             
	//   20   36:aload_0         
	//   21   37:invokespecial   #48  <Method void AppCompatTextHelper(android.widget.TextView)>
	//   22   40:putfield        #50  <Field AppCompatTextHelper mTextHelper>
		mTextHelper.loadFromAttributes(attributeset, i);
	//   23   43:aload_0         
	//   24   44:getfield        #50  <Field AppCompatTextHelper mTextHelper>
	//   25   47:aload_2         
	//   26   48:iload_3         
	//   27   49:invokevirtual   #51  <Method void AppCompatTextHelper.loadFromAttributes(AttributeSet, int)>
	//   28   52:return          
	}

	public int getCompoundPaddingLeft()
	{
		int j = super.getCompoundPaddingLeft();
	//    0    0:aload_0         
	//    1    1:invokespecial   #55  <Method int RadioButton.getCompoundPaddingLeft()>
	//    2    4:istore_2        
		int i = j;
	//    3    5:iload_2         
	//    4    6:istore_1        
		if(mCompoundButtonHelper != null)
	//*   5    7:aload_0         
	//*   6    8:getfield        #39  <Field AppCompatCompoundButtonHelper mCompoundButtonHelper>
	//*   7   11:ifnull          23
			i = mCompoundButtonHelper.getCompoundPaddingLeft(j);
	//    8   14:aload_0         
	//    9   15:getfield        #39  <Field AppCompatCompoundButtonHelper mCompoundButtonHelper>
	//   10   18:iload_2         
	//   11   19:invokevirtual   #58  <Method int AppCompatCompoundButtonHelper.getCompoundPaddingLeft(int)>
	//   12   22:istore_1        
		return i;
	//   13   23:iload_1         
	//   14   24:ireturn         
	}

	public ColorStateList getSupportButtonTintList()
	{
		if(mCompoundButtonHelper != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #39  <Field AppCompatCompoundButtonHelper mCompoundButtonHelper>
	//*   2    4:ifnull          15
			return mCompoundButtonHelper.getSupportButtonTintList();
	//    3    7:aload_0         
	//    4    8:getfield        #39  <Field AppCompatCompoundButtonHelper mCompoundButtonHelper>
	//    5   11:invokevirtual   #67  <Method ColorStateList AppCompatCompoundButtonHelper.getSupportButtonTintList()>
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
	//*   1    1:getfield        #39  <Field AppCompatCompoundButtonHelper mCompoundButtonHelper>
	//*   2    4:ifnull          15
			return mCompoundButtonHelper.getSupportButtonTintMode();
	//    3    7:aload_0         
	//    4    8:getfield        #39  <Field AppCompatCompoundButtonHelper mCompoundButtonHelper>
	//    5   11:invokevirtual   #72  <Method android.graphics.PorterDuff$Mode AppCompatCompoundButtonHelper.getSupportButtonTintMode()>
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
	//    2    2:invokevirtual   #79  <Method Context getContext()>
	//    3    5:iload_1         
	//    4    6:invokestatic    #85  <Method Drawable AppCompatResources.getDrawable(Context, int)>
	//    5    9:invokevirtual   #88  <Method void setButtonDrawable(Drawable)>
	//    6   12:return          
	}

	public void setButtonDrawable(Drawable drawable)
	{
		super.setButtonDrawable(drawable);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #90  <Method void RadioButton.setButtonDrawable(Drawable)>
		if(mCompoundButtonHelper != null)
	//*   3    5:aload_0         
	//*   4    6:getfield        #39  <Field AppCompatCompoundButtonHelper mCompoundButtonHelper>
	//*   5    9:ifnull          19
			mCompoundButtonHelper.onSetButtonDrawable();
	//    6   12:aload_0         
	//    7   13:getfield        #39  <Field AppCompatCompoundButtonHelper mCompoundButtonHelper>
	//    8   16:invokevirtual   #94  <Method void AppCompatCompoundButtonHelper.onSetButtonDrawable()>
	//    9   19:return          
	}

	public void setSupportButtonTintList(ColorStateList colorstatelist)
	{
		if(mCompoundButtonHelper != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #39  <Field AppCompatCompoundButtonHelper mCompoundButtonHelper>
	//*   2    4:ifnull          15
			mCompoundButtonHelper.setSupportButtonTintList(colorstatelist);
	//    3    7:aload_0         
	//    4    8:getfield        #39  <Field AppCompatCompoundButtonHelper mCompoundButtonHelper>
	//    5   11:aload_1         
	//    6   12:invokevirtual   #98  <Method void AppCompatCompoundButtonHelper.setSupportButtonTintList(ColorStateList)>
	//    7   15:return          
	}

	public void setSupportButtonTintMode(android.graphics.PorterDuff.Mode mode)
	{
		if(mCompoundButtonHelper != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #39  <Field AppCompatCompoundButtonHelper mCompoundButtonHelper>
	//*   2    4:ifnull          15
			mCompoundButtonHelper.setSupportButtonTintMode(mode);
	//    3    7:aload_0         
	//    4    8:getfield        #39  <Field AppCompatCompoundButtonHelper mCompoundButtonHelper>
	//    5   11:aload_1         
	//    6   12:invokevirtual   #102 <Method void AppCompatCompoundButtonHelper.setSupportButtonTintMode(android.graphics.PorterDuff$Mode)>
	//    7   15:return          
	}

	private final AppCompatCompoundButtonHelper mCompoundButtonHelper;
	private final AppCompatTextHelper mTextHelper;
}

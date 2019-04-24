// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.support.v4.view.TintableBackgroundView;
import android.support.v7.content.res.AppCompatResources;
import android.util.AttributeSet;
import android.widget.MultiAutoCompleteTextView;

// Referenced classes of package android.support.v7.widget:
//			TintContextWrapper, TintTypedArray, AppCompatBackgroundHelper, AppCompatTextHelper

public class AppCompatMultiAutoCompleteTextView extends MultiAutoCompleteTextView
	implements TintableBackgroundView
{

	public AppCompatMultiAutoCompleteTextView(Context context)
	{
		this(context, ((AttributeSet) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:invokespecial   #23  <Method void AppCompatMultiAutoCompleteTextView(Context, AttributeSet)>
	//    4    6:return          
	}

	public AppCompatMultiAutoCompleteTextView(Context context, AttributeSet attributeset)
	{
		this(context, attributeset, android.support.v7.appcompat.R.attr.autoCompleteTextViewStyle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:getstatic       #29  <Field int android.support.v7.appcompat.R$attr.autoCompleteTextViewStyle>
	//    4    6:invokespecial   #32  <Method void AppCompatMultiAutoCompleteTextView(Context, AttributeSet, int)>
	//    5    9:return          
	}

	public AppCompatMultiAutoCompleteTextView(Context context, AttributeSet attributeset, int i)
	{
		super(TintContextWrapper.wrap(context), attributeset, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #38  <Method Context TintContextWrapper.wrap(Context)>
	//    3    5:aload_2         
	//    4    6:iload_3         
	//    5    7:invokespecial   #39  <Method void MultiAutoCompleteTextView(Context, AttributeSet, int)>
		context = ((Context) (TintTypedArray.obtainStyledAttributes(getContext(), attributeset, TINT_ATTRS, i, 0)));
	//    6   10:aload_0         
	//    7   11:invokevirtual   #43  <Method Context getContext()>
	//    8   14:aload_2         
	//    9   15:getstatic       #17  <Field int[] TINT_ATTRS>
	//   10   18:iload_3         
	//   11   19:iconst_0        
	//   12   20:invokestatic    #49  <Method TintTypedArray TintTypedArray.obtainStyledAttributes(Context, AttributeSet, int[], int, int)>
	//   13   23:astore_1        
		if(((TintTypedArray) (context)).hasValue(0))
	//*  14   24:aload_1         
	//*  15   25:iconst_0        
	//*  16   26:invokevirtual   #53  <Method boolean TintTypedArray.hasValue(int)>
	//*  17   29:ifeq            41
			setDropDownBackgroundDrawable(((TintTypedArray) (context)).getDrawable(0));
	//   18   32:aload_0         
	//   19   33:aload_1         
	//   20   34:iconst_0        
	//   21   35:invokevirtual   #57  <Method Drawable TintTypedArray.getDrawable(int)>
	//   22   38:invokevirtual   #61  <Method void setDropDownBackgroundDrawable(Drawable)>
		((TintTypedArray) (context)).recycle();
	//   23   41:aload_1         
	//   24   42:invokevirtual   #64  <Method void TintTypedArray.recycle()>
		mBackgroundTintHelper = new AppCompatBackgroundHelper(((android.view.View) (this)));
	//   25   45:aload_0         
	//   26   46:new             #66  <Class AppCompatBackgroundHelper>
	//   27   49:dup             
	//   28   50:aload_0         
	//   29   51:invokespecial   #69  <Method void AppCompatBackgroundHelper(android.view.View)>
	//   30   54:putfield        #71  <Field AppCompatBackgroundHelper mBackgroundTintHelper>
		mBackgroundTintHelper.loadFromAttributes(attributeset, i);
	//   31   57:aload_0         
	//   32   58:getfield        #71  <Field AppCompatBackgroundHelper mBackgroundTintHelper>
	//   33   61:aload_2         
	//   34   62:iload_3         
	//   35   63:invokevirtual   #75  <Method void AppCompatBackgroundHelper.loadFromAttributes(AttributeSet, int)>
		mTextHelper = AppCompatTextHelper.create(((android.widget.TextView) (this)));
	//   36   66:aload_0         
	//   37   67:aload_0         
	//   38   68:invokestatic    #81  <Method AppCompatTextHelper AppCompatTextHelper.create(android.widget.TextView)>
	//   39   71:putfield        #83  <Field AppCompatTextHelper mTextHelper>
		mTextHelper.loadFromAttributes(attributeset, i);
	//   40   74:aload_0         
	//   41   75:getfield        #83  <Field AppCompatTextHelper mTextHelper>
	//   42   78:aload_2         
	//   43   79:iload_3         
	//   44   80:invokevirtual   #84  <Method void AppCompatTextHelper.loadFromAttributes(AttributeSet, int)>
		mTextHelper.applyCompoundDrawablesTints();
	//   45   83:aload_0         
	//   46   84:getfield        #83  <Field AppCompatTextHelper mTextHelper>
	//   47   87:invokevirtual   #87  <Method void AppCompatTextHelper.applyCompoundDrawablesTints()>
	//   48   90:return          
	}

	protected void drawableStateChanged()
	{
		super.drawableStateChanged();
	//    0    0:aload_0         
	//    1    1:invokespecial   #90  <Method void MultiAutoCompleteTextView.drawableStateChanged()>
		if(mBackgroundTintHelper != null)
	//*   2    4:aload_0         
	//*   3    5:getfield        #71  <Field AppCompatBackgroundHelper mBackgroundTintHelper>
	//*   4    8:ifnull          18
			mBackgroundTintHelper.applySupportBackgroundTint();
	//    5   11:aload_0         
	//    6   12:getfield        #71  <Field AppCompatBackgroundHelper mBackgroundTintHelper>
	//    7   15:invokevirtual   #93  <Method void AppCompatBackgroundHelper.applySupportBackgroundTint()>
		if(mTextHelper != null)
	//*   8   18:aload_0         
	//*   9   19:getfield        #83  <Field AppCompatTextHelper mTextHelper>
	//*  10   22:ifnull          32
			mTextHelper.applyCompoundDrawablesTints();
	//   11   25:aload_0         
	//   12   26:getfield        #83  <Field AppCompatTextHelper mTextHelper>
	//   13   29:invokevirtual   #87  <Method void AppCompatTextHelper.applyCompoundDrawablesTints()>
	//   14   32:return          
	}

	public ColorStateList getSupportBackgroundTintList()
	{
		if(mBackgroundTintHelper != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #71  <Field AppCompatBackgroundHelper mBackgroundTintHelper>
	//*   2    4:ifnull          15
			return mBackgroundTintHelper.getSupportBackgroundTintList();
	//    3    7:aload_0         
	//    4    8:getfield        #71  <Field AppCompatBackgroundHelper mBackgroundTintHelper>
	//    5   11:invokevirtual   #102 <Method ColorStateList AppCompatBackgroundHelper.getSupportBackgroundTintList()>
	//    6   14:areturn         
		else
			return null;
	//    7   15:aconst_null     
	//    8   16:areturn         
	}

	public android.graphics.PorterDuff.Mode getSupportBackgroundTintMode()
	{
		if(mBackgroundTintHelper != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #71  <Field AppCompatBackgroundHelper mBackgroundTintHelper>
	//*   2    4:ifnull          15
			return mBackgroundTintHelper.getSupportBackgroundTintMode();
	//    3    7:aload_0         
	//    4    8:getfield        #71  <Field AppCompatBackgroundHelper mBackgroundTintHelper>
	//    5   11:invokevirtual   #107 <Method android.graphics.PorterDuff$Mode AppCompatBackgroundHelper.getSupportBackgroundTintMode()>
	//    6   14:areturn         
		else
			return null;
	//    7   15:aconst_null     
	//    8   16:areturn         
	}

	public void setBackgroundDrawable(Drawable drawable)
	{
		super.setBackgroundDrawable(drawable);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #110 <Method void MultiAutoCompleteTextView.setBackgroundDrawable(Drawable)>
		if(mBackgroundTintHelper != null)
	//*   3    5:aload_0         
	//*   4    6:getfield        #71  <Field AppCompatBackgroundHelper mBackgroundTintHelper>
	//*   5    9:ifnull          20
			mBackgroundTintHelper.onSetBackgroundDrawable(drawable);
	//    6   12:aload_0         
	//    7   13:getfield        #71  <Field AppCompatBackgroundHelper mBackgroundTintHelper>
	//    8   16:aload_1         
	//    9   17:invokevirtual   #113 <Method void AppCompatBackgroundHelper.onSetBackgroundDrawable(Drawable)>
	//   10   20:return          
	}

	public void setBackgroundResource(int i)
	{
		super.setBackgroundResource(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #118 <Method void MultiAutoCompleteTextView.setBackgroundResource(int)>
		if(mBackgroundTintHelper != null)
	//*   3    5:aload_0         
	//*   4    6:getfield        #71  <Field AppCompatBackgroundHelper mBackgroundTintHelper>
	//*   5    9:ifnull          20
			mBackgroundTintHelper.onSetBackgroundResource(i);
	//    6   12:aload_0         
	//    7   13:getfield        #71  <Field AppCompatBackgroundHelper mBackgroundTintHelper>
	//    8   16:iload_1         
	//    9   17:invokevirtual   #121 <Method void AppCompatBackgroundHelper.onSetBackgroundResource(int)>
	//   10   20:return          
	}

	public void setDropDownBackgroundResource(int i)
	{
		setDropDownBackgroundDrawable(AppCompatResources.getDrawable(getContext(), i));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #43  <Method Context getContext()>
	//    3    5:iload_1         
	//    4    6:invokestatic    #128 <Method Drawable AppCompatResources.getDrawable(Context, int)>
	//    5    9:invokevirtual   #61  <Method void setDropDownBackgroundDrawable(Drawable)>
	//    6   12:return          
	}

	public void setSupportBackgroundTintList(ColorStateList colorstatelist)
	{
		if(mBackgroundTintHelper != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #71  <Field AppCompatBackgroundHelper mBackgroundTintHelper>
	//*   2    4:ifnull          15
			mBackgroundTintHelper.setSupportBackgroundTintList(colorstatelist);
	//    3    7:aload_0         
	//    4    8:getfield        #71  <Field AppCompatBackgroundHelper mBackgroundTintHelper>
	//    5   11:aload_1         
	//    6   12:invokevirtual   #132 <Method void AppCompatBackgroundHelper.setSupportBackgroundTintList(ColorStateList)>
	//    7   15:return          
	}

	public void setSupportBackgroundTintMode(android.graphics.PorterDuff.Mode mode)
	{
		if(mBackgroundTintHelper != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #71  <Field AppCompatBackgroundHelper mBackgroundTintHelper>
	//*   2    4:ifnull          15
			mBackgroundTintHelper.setSupportBackgroundTintMode(mode);
	//    3    7:aload_0         
	//    4    8:getfield        #71  <Field AppCompatBackgroundHelper mBackgroundTintHelper>
	//    5   11:aload_1         
	//    6   12:invokevirtual   #136 <Method void AppCompatBackgroundHelper.setSupportBackgroundTintMode(android.graphics.PorterDuff$Mode)>
	//    7   15:return          
	}

	public void setTextAppearance(Context context, int i)
	{
		super.setTextAppearance(context, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #140 <Method void MultiAutoCompleteTextView.setTextAppearance(Context, int)>
		if(mTextHelper != null)
	//*   4    6:aload_0         
	//*   5    7:getfield        #83  <Field AppCompatTextHelper mTextHelper>
	//*   6   10:ifnull          22
			mTextHelper.onSetTextAppearance(context, i);
	//    7   13:aload_0         
	//    8   14:getfield        #83  <Field AppCompatTextHelper mTextHelper>
	//    9   17:aload_1         
	//   10   18:iload_2         
	//   11   19:invokevirtual   #143 <Method void AppCompatTextHelper.onSetTextAppearance(Context, int)>
	//   12   22:return          
	}

	private static final int TINT_ATTRS[] = {
		0x1010176
	};
	private final AppCompatBackgroundHelper mBackgroundTintHelper;
	private final AppCompatTextHelper mTextHelper;

	static 
	{
	//    0    0:iconst_1        
	//    1    1:newarray        int[]
	//    2    3:dup             
	//    3    4:iconst_0        
	//    4    5:ldc1            #15  <Int 0x1010176>
	//    5    7:iastore         
	//    6    8:putstatic       #17  <Field int[] TINT_ATTRS>
	//*   7   11:return          
	}
}

// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.support.v4.view.TintableBackgroundView;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;

// Referenced classes of package android.support.v7.widget:
//			TintContextWrapper, AppCompatBackgroundHelper, AppCompatTextHelper, AppCompatHintHelper

public class AppCompatEditText extends EditText
	implements TintableBackgroundView
{

	public AppCompatEditText(Context context)
	{
		this(context, ((AttributeSet) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:invokespecial   #15  <Method void AppCompatEditText(Context, AttributeSet)>
	//    4    6:return          
	}

	public AppCompatEditText(Context context, AttributeSet attributeset)
	{
		this(context, attributeset, android.support.v7.appcompat.R.attr.editTextStyle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:getstatic       #22  <Field int android.support.v7.appcompat.R$attr.editTextStyle>
	//    4    6:invokespecial   #25  <Method void AppCompatEditText(Context, AttributeSet, int)>
	//    5    9:return          
	}

	public AppCompatEditText(Context context, AttributeSet attributeset, int i)
	{
		super(TintContextWrapper.wrap(context), attributeset, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #31  <Method Context TintContextWrapper.wrap(Context)>
	//    3    5:aload_2         
	//    4    6:iload_3         
	//    5    7:invokespecial   #32  <Method void EditText(Context, AttributeSet, int)>
		mBackgroundTintHelper = new AppCompatBackgroundHelper(((android.view.View) (this)));
	//    6   10:aload_0         
	//    7   11:new             #34  <Class AppCompatBackgroundHelper>
	//    8   14:dup             
	//    9   15:aload_0         
	//   10   16:invokespecial   #37  <Method void AppCompatBackgroundHelper(android.view.View)>
	//   11   19:putfield        #39  <Field AppCompatBackgroundHelper mBackgroundTintHelper>
		mBackgroundTintHelper.loadFromAttributes(attributeset, i);
	//   12   22:aload_0         
	//   13   23:getfield        #39  <Field AppCompatBackgroundHelper mBackgroundTintHelper>
	//   14   26:aload_2         
	//   15   27:iload_3         
	//   16   28:invokevirtual   #43  <Method void AppCompatBackgroundHelper.loadFromAttributes(AttributeSet, int)>
		mTextHelper = AppCompatTextHelper.create(((android.widget.TextView) (this)));
	//   17   31:aload_0         
	//   18   32:aload_0         
	//   19   33:invokestatic    #49  <Method AppCompatTextHelper AppCompatTextHelper.create(android.widget.TextView)>
	//   20   36:putfield        #51  <Field AppCompatTextHelper mTextHelper>
		mTextHelper.loadFromAttributes(attributeset, i);
	//   21   39:aload_0         
	//   22   40:getfield        #51  <Field AppCompatTextHelper mTextHelper>
	//   23   43:aload_2         
	//   24   44:iload_3         
	//   25   45:invokevirtual   #52  <Method void AppCompatTextHelper.loadFromAttributes(AttributeSet, int)>
		mTextHelper.applyCompoundDrawablesTints();
	//   26   48:aload_0         
	//   27   49:getfield        #51  <Field AppCompatTextHelper mTextHelper>
	//   28   52:invokevirtual   #56  <Method void AppCompatTextHelper.applyCompoundDrawablesTints()>
	//   29   55:return          
	}

	protected void drawableStateChanged()
	{
		super.drawableStateChanged();
	//    0    0:aload_0         
	//    1    1:invokespecial   #59  <Method void EditText.drawableStateChanged()>
		if(mBackgroundTintHelper != null)
	//*   2    4:aload_0         
	//*   3    5:getfield        #39  <Field AppCompatBackgroundHelper mBackgroundTintHelper>
	//*   4    8:ifnull          18
			mBackgroundTintHelper.applySupportBackgroundTint();
	//    5   11:aload_0         
	//    6   12:getfield        #39  <Field AppCompatBackgroundHelper mBackgroundTintHelper>
	//    7   15:invokevirtual   #62  <Method void AppCompatBackgroundHelper.applySupportBackgroundTint()>
		if(mTextHelper != null)
	//*   8   18:aload_0         
	//*   9   19:getfield        #51  <Field AppCompatTextHelper mTextHelper>
	//*  10   22:ifnull          32
			mTextHelper.applyCompoundDrawablesTints();
	//   11   25:aload_0         
	//   12   26:getfield        #51  <Field AppCompatTextHelper mTextHelper>
	//   13   29:invokevirtual   #56  <Method void AppCompatTextHelper.applyCompoundDrawablesTints()>
	//   14   32:return          
	}

	public ColorStateList getSupportBackgroundTintList()
	{
		if(mBackgroundTintHelper != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #39  <Field AppCompatBackgroundHelper mBackgroundTintHelper>
	//*   2    4:ifnull          15
			return mBackgroundTintHelper.getSupportBackgroundTintList();
	//    3    7:aload_0         
	//    4    8:getfield        #39  <Field AppCompatBackgroundHelper mBackgroundTintHelper>
	//    5   11:invokevirtual   #71  <Method ColorStateList AppCompatBackgroundHelper.getSupportBackgroundTintList()>
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
	//*   1    1:getfield        #39  <Field AppCompatBackgroundHelper mBackgroundTintHelper>
	//*   2    4:ifnull          15
			return mBackgroundTintHelper.getSupportBackgroundTintMode();
	//    3    7:aload_0         
	//    4    8:getfield        #39  <Field AppCompatBackgroundHelper mBackgroundTintHelper>
	//    5   11:invokevirtual   #76  <Method android.graphics.PorterDuff$Mode AppCompatBackgroundHelper.getSupportBackgroundTintMode()>
	//    6   14:areturn         
		else
			return null;
	//    7   15:aconst_null     
	//    8   16:areturn         
	}

	public InputConnection onCreateInputConnection(EditorInfo editorinfo)
	{
		return AppCompatHintHelper.onCreateInputConnection(super.onCreateInputConnection(editorinfo), editorinfo, ((android.view.View) (this)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #80  <Method InputConnection EditText.onCreateInputConnection(EditorInfo)>
	//    3    5:aload_1         
	//    4    6:aload_0         
	//    5    7:invokestatic    #85  <Method InputConnection AppCompatHintHelper.onCreateInputConnection(InputConnection, EditorInfo, android.view.View)>
	//    6   10:areturn         
	}

	public void setBackgroundDrawable(Drawable drawable)
	{
		super.setBackgroundDrawable(drawable);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #89  <Method void EditText.setBackgroundDrawable(Drawable)>
		if(mBackgroundTintHelper != null)
	//*   3    5:aload_0         
	//*   4    6:getfield        #39  <Field AppCompatBackgroundHelper mBackgroundTintHelper>
	//*   5    9:ifnull          20
			mBackgroundTintHelper.onSetBackgroundDrawable(drawable);
	//    6   12:aload_0         
	//    7   13:getfield        #39  <Field AppCompatBackgroundHelper mBackgroundTintHelper>
	//    8   16:aload_1         
	//    9   17:invokevirtual   #92  <Method void AppCompatBackgroundHelper.onSetBackgroundDrawable(Drawable)>
	//   10   20:return          
	}

	public void setBackgroundResource(int i)
	{
		super.setBackgroundResource(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #97  <Method void EditText.setBackgroundResource(int)>
		if(mBackgroundTintHelper != null)
	//*   3    5:aload_0         
	//*   4    6:getfield        #39  <Field AppCompatBackgroundHelper mBackgroundTintHelper>
	//*   5    9:ifnull          20
			mBackgroundTintHelper.onSetBackgroundResource(i);
	//    6   12:aload_0         
	//    7   13:getfield        #39  <Field AppCompatBackgroundHelper mBackgroundTintHelper>
	//    8   16:iload_1         
	//    9   17:invokevirtual   #100 <Method void AppCompatBackgroundHelper.onSetBackgroundResource(int)>
	//   10   20:return          
	}

	public void setSupportBackgroundTintList(ColorStateList colorstatelist)
	{
		if(mBackgroundTintHelper != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #39  <Field AppCompatBackgroundHelper mBackgroundTintHelper>
	//*   2    4:ifnull          15
			mBackgroundTintHelper.setSupportBackgroundTintList(colorstatelist);
	//    3    7:aload_0         
	//    4    8:getfield        #39  <Field AppCompatBackgroundHelper mBackgroundTintHelper>
	//    5   11:aload_1         
	//    6   12:invokevirtual   #105 <Method void AppCompatBackgroundHelper.setSupportBackgroundTintList(ColorStateList)>
	//    7   15:return          
	}

	public void setSupportBackgroundTintMode(android.graphics.PorterDuff.Mode mode)
	{
		if(mBackgroundTintHelper != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #39  <Field AppCompatBackgroundHelper mBackgroundTintHelper>
	//*   2    4:ifnull          15
			mBackgroundTintHelper.setSupportBackgroundTintMode(mode);
	//    3    7:aload_0         
	//    4    8:getfield        #39  <Field AppCompatBackgroundHelper mBackgroundTintHelper>
	//    5   11:aload_1         
	//    6   12:invokevirtual   #109 <Method void AppCompatBackgroundHelper.setSupportBackgroundTintMode(android.graphics.PorterDuff$Mode)>
	//    7   15:return          
	}

	public void setTextAppearance(Context context, int i)
	{
		super.setTextAppearance(context, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #113 <Method void EditText.setTextAppearance(Context, int)>
		if(mTextHelper != null)
	//*   4    6:aload_0         
	//*   5    7:getfield        #51  <Field AppCompatTextHelper mTextHelper>
	//*   6   10:ifnull          22
			mTextHelper.onSetTextAppearance(context, i);
	//    7   13:aload_0         
	//    8   14:getfield        #51  <Field AppCompatTextHelper mTextHelper>
	//    9   17:aload_1         
	//   10   18:iload_2         
	//   11   19:invokevirtual   #116 <Method void AppCompatTextHelper.onSetTextAppearance(Context, int)>
	//   12   22:return          
	}

	private final AppCompatBackgroundHelper mBackgroundTintHelper;
	private final AppCompatTextHelper mTextHelper;
}

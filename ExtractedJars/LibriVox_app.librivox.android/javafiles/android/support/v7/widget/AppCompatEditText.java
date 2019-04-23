// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.support.v4.view.ab;
import android.support.v4.widget.ah;
import android.text.Editable;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;

// Referenced classes of package android.support.v7.widget:
//			TintContextWrapper, AppCompatBackgroundHelper, AppCompatTextHelper, AppCompatHintHelper

public class AppCompatEditText extends EditText
	implements ab
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
		mTextHelper.applyCompoundDrawablesTints();
	//   28   52:aload_0         
	//   29   53:getfield        #50  <Field AppCompatTextHelper mTextHelper>
	//   30   56:invokevirtual   #55  <Method void AppCompatTextHelper.applyCompoundDrawablesTints()>
	//   31   59:return          
	}

	protected void drawableStateChanged()
	{
		super.drawableStateChanged();
	//    0    0:aload_0         
	//    1    1:invokespecial   #58  <Method void EditText.drawableStateChanged()>
		Object obj = ((Object) (mBackgroundTintHelper));
	//    2    4:aload_0         
	//    3    5:getfield        #39  <Field AppCompatBackgroundHelper mBackgroundTintHelper>
	//    4    8:astore_1        
		if(obj != null)
	//*   5    9:aload_1         
	//*   6   10:ifnull          17
			((AppCompatBackgroundHelper) (obj)).applySupportBackgroundTint();
	//    7   13:aload_1         
	//    8   14:invokevirtual   #61  <Method void AppCompatBackgroundHelper.applySupportBackgroundTint()>
		obj = ((Object) (mTextHelper));
	//    9   17:aload_0         
	//   10   18:getfield        #50  <Field AppCompatTextHelper mTextHelper>
	//   11   21:astore_1        
		if(obj != null)
	//*  12   22:aload_1         
	//*  13   23:ifnull          30
			((AppCompatTextHelper) (obj)).applyCompoundDrawablesTints();
	//   14   26:aload_1         
	//   15   27:invokevirtual   #55  <Method void AppCompatTextHelper.applyCompoundDrawablesTints()>
	//   16   30:return          
	}

	public ColorStateList getSupportBackgroundTintList()
	{
		AppCompatBackgroundHelper appcompatbackgroundhelper = mBackgroundTintHelper;
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field AppCompatBackgroundHelper mBackgroundTintHelper>
	//    2    4:astore_1        
		if(appcompatbackgroundhelper != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          14
			return appcompatbackgroundhelper.getSupportBackgroundTintList();
	//    5    9:aload_1         
	//    6   10:invokevirtual   #65  <Method ColorStateList AppCompatBackgroundHelper.getSupportBackgroundTintList()>
	//    7   13:areturn         
		else
			return null;
	//    8   14:aconst_null     
	//    9   15:areturn         
	}

	public android.graphics.PorterDuff.Mode getSupportBackgroundTintMode()
	{
		AppCompatBackgroundHelper appcompatbackgroundhelper = mBackgroundTintHelper;
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field AppCompatBackgroundHelper mBackgroundTintHelper>
	//    2    4:astore_1        
		if(appcompatbackgroundhelper != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          14
			return appcompatbackgroundhelper.getSupportBackgroundTintMode();
	//    5    9:aload_1         
	//    6   10:invokevirtual   #69  <Method android.graphics.PorterDuff$Mode AppCompatBackgroundHelper.getSupportBackgroundTintMode()>
	//    7   13:areturn         
		else
			return null;
	//    8   14:aconst_null     
	//    9   15:areturn         
	}

	public Editable getText()
	{
		if(android.os.Build.VERSION.SDK_INT >= 28)
	//*   0    0:getstatic       #76  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          28
	//*   2    5:icmplt          13
			return super.getText();
	//    3    8:aload_0         
	//    4    9:invokespecial   #78  <Method Editable EditText.getText()>
	//    5   12:areturn         
		else
			return super.getEditableText();
	//    6   13:aload_0         
	//    7   14:invokespecial   #81  <Method Editable EditText.getEditableText()>
	//    8   17:areturn         
	}

	public volatile CharSequence getText()
	{
		return ((CharSequence) (getText()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #83  <Method Editable getText()>
	//    2    4:areturn         
	}

	public InputConnection onCreateInputConnection(EditorInfo editorinfo)
	{
		return AppCompatHintHelper.onCreateInputConnection(super.onCreateInputConnection(editorinfo), editorinfo, ((android.view.View) (this)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #87  <Method InputConnection EditText.onCreateInputConnection(EditorInfo)>
	//    3    5:aload_1         
	//    4    6:aload_0         
	//    5    7:invokestatic    #92  <Method InputConnection AppCompatHintHelper.onCreateInputConnection(InputConnection, EditorInfo, android.view.View)>
	//    6   10:areturn         
	}

	public void setBackgroundDrawable(Drawable drawable)
	{
		super.setBackgroundDrawable(drawable);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #96  <Method void EditText.setBackgroundDrawable(Drawable)>
		AppCompatBackgroundHelper appcompatbackgroundhelper = mBackgroundTintHelper;
	//    3    5:aload_0         
	//    4    6:getfield        #39  <Field AppCompatBackgroundHelper mBackgroundTintHelper>
	//    5    9:astore_2        
		if(appcompatbackgroundhelper != null)
	//*   6   10:aload_2         
	//*   7   11:ifnull          19
			appcompatbackgroundhelper.onSetBackgroundDrawable(drawable);
	//    8   14:aload_2         
	//    9   15:aload_1         
	//   10   16:invokevirtual   #99  <Method void AppCompatBackgroundHelper.onSetBackgroundDrawable(Drawable)>
	//   11   19:return          
	}

	public void setBackgroundResource(int i)
	{
		super.setBackgroundResource(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #103 <Method void EditText.setBackgroundResource(int)>
		AppCompatBackgroundHelper appcompatbackgroundhelper = mBackgroundTintHelper;
	//    3    5:aload_0         
	//    4    6:getfield        #39  <Field AppCompatBackgroundHelper mBackgroundTintHelper>
	//    5    9:astore_2        
		if(appcompatbackgroundhelper != null)
	//*   6   10:aload_2         
	//*   7   11:ifnull          19
			appcompatbackgroundhelper.onSetBackgroundResource(i);
	//    8   14:aload_2         
	//    9   15:iload_1         
	//   10   16:invokevirtual   #106 <Method void AppCompatBackgroundHelper.onSetBackgroundResource(int)>
	//   11   19:return          
	}

	public void setCustomSelectionActionModeCallback(android.view.ActionMode.Callback callback)
	{
		super.setCustomSelectionActionModeCallback(ah.a(((android.widget.TextView) (this)), callback));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:aload_1         
	//    3    3:invokestatic    #114 <Method android.view.ActionMode$Callback ah.a(android.widget.TextView, android.view.ActionMode$Callback)>
	//    4    6:invokespecial   #116 <Method void EditText.setCustomSelectionActionModeCallback(android.view.ActionMode$Callback)>
	//    5    9:return          
	}

	public void setSupportBackgroundTintList(ColorStateList colorstatelist)
	{
		AppCompatBackgroundHelper appcompatbackgroundhelper = mBackgroundTintHelper;
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field AppCompatBackgroundHelper mBackgroundTintHelper>
	//    2    4:astore_2        
		if(appcompatbackgroundhelper != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          14
			appcompatbackgroundhelper.setSupportBackgroundTintList(colorstatelist);
	//    5    9:aload_2         
	//    6   10:aload_1         
	//    7   11:invokevirtual   #120 <Method void AppCompatBackgroundHelper.setSupportBackgroundTintList(ColorStateList)>
	//    8   14:return          
	}

	public void setSupportBackgroundTintMode(android.graphics.PorterDuff.Mode mode)
	{
		AppCompatBackgroundHelper appcompatbackgroundhelper = mBackgroundTintHelper;
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field AppCompatBackgroundHelper mBackgroundTintHelper>
	//    2    4:astore_2        
		if(appcompatbackgroundhelper != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          14
			appcompatbackgroundhelper.setSupportBackgroundTintMode(mode);
	//    5    9:aload_2         
	//    6   10:aload_1         
	//    7   11:invokevirtual   #124 <Method void AppCompatBackgroundHelper.setSupportBackgroundTintMode(android.graphics.PorterDuff$Mode)>
	//    8   14:return          
	}

	public void setTextAppearance(Context context, int i)
	{
		super.setTextAppearance(context, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #128 <Method void EditText.setTextAppearance(Context, int)>
		AppCompatTextHelper appcompattexthelper = mTextHelper;
	//    4    6:aload_0         
	//    5    7:getfield        #50  <Field AppCompatTextHelper mTextHelper>
	//    6   10:astore_3        
		if(appcompattexthelper != null)
	//*   7   11:aload_3         
	//*   8   12:ifnull          21
			appcompattexthelper.onSetTextAppearance(context, i);
	//    9   15:aload_3         
	//   10   16:aload_1         
	//   11   17:iload_2         
	//   12   18:invokevirtual   #131 <Method void AppCompatTextHelper.onSetTextAppearance(Context, int)>
	//   13   21:return          
	}

	private final AppCompatBackgroundHelper mBackgroundTintHelper;
	private final AppCompatTextHelper mTextHelper;
}

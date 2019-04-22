// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.support.v4.view.TintableBackgroundView;
import android.support.v4.widget.TextViewCompat;
import android.support.v7.content.res.AppCompatResources;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.AutoCompleteTextView;

// Referenced classes of package android.support.v7.widget:
//			TintContextWrapper, TintTypedArray, AppCompatBackgroundHelper, AppCompatTextHelper, 
//			AppCompatHintHelper

public class AppCompatAutoCompleteTextView extends AutoCompleteTextView
	implements TintableBackgroundView
{

	public AppCompatAutoCompleteTextView(Context context, AttributeSet attributeset)
	{
		this(context, attributeset, android.support.v7.appcompat.R.attr.autoCompleteTextViewStyle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:getstatic       #26  <Field int android.support.v7.appcompat.R$attr.autoCompleteTextViewStyle>
	//    4    6:invokespecial   #29  <Method void AppCompatAutoCompleteTextView(Context, AttributeSet, int)>
	//    5    9:return          
	}

	public AppCompatAutoCompleteTextView(Context context, AttributeSet attributeset, int i)
	{
		super(TintContextWrapper.wrap(context), attributeset, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #35  <Method Context TintContextWrapper.wrap(Context)>
	//    3    5:aload_2         
	//    4    6:iload_3         
	//    5    7:invokespecial   #36  <Method void AutoCompleteTextView(Context, AttributeSet, int)>
		context = ((Context) (TintTypedArray.obtainStyledAttributes(getContext(), attributeset, TINT_ATTRS, i, 0)));
	//    6   10:aload_0         
	//    7   11:invokevirtual   #40  <Method Context getContext()>
	//    8   14:aload_2         
	//    9   15:getstatic       #17  <Field int[] TINT_ATTRS>
	//   10   18:iload_3         
	//   11   19:iconst_0        
	//   12   20:invokestatic    #46  <Method TintTypedArray TintTypedArray.obtainStyledAttributes(Context, AttributeSet, int[], int, int)>
	//   13   23:astore_1        
		if(((TintTypedArray) (context)).hasValue(0))
	//*  14   24:aload_1         
	//*  15   25:iconst_0        
	//*  16   26:invokevirtual   #50  <Method boolean TintTypedArray.hasValue(int)>
	//*  17   29:ifeq            41
			setDropDownBackgroundDrawable(((TintTypedArray) (context)).getDrawable(0));
	//   18   32:aload_0         
	//   19   33:aload_1         
	//   20   34:iconst_0        
	//   21   35:invokevirtual   #54  <Method Drawable TintTypedArray.getDrawable(int)>
	//   22   38:invokevirtual   #58  <Method void setDropDownBackgroundDrawable(Drawable)>
		((TintTypedArray) (context)).recycle();
	//   23   41:aload_1         
	//   24   42:invokevirtual   #61  <Method void TintTypedArray.recycle()>
		mBackgroundTintHelper = new AppCompatBackgroundHelper(((android.view.View) (this)));
	//   25   45:aload_0         
	//   26   46:new             #63  <Class AppCompatBackgroundHelper>
	//   27   49:dup             
	//   28   50:aload_0         
	//   29   51:invokespecial   #66  <Method void AppCompatBackgroundHelper(android.view.View)>
	//   30   54:putfield        #68  <Field AppCompatBackgroundHelper mBackgroundTintHelper>
		mBackgroundTintHelper.loadFromAttributes(attributeset, i);
	//   31   57:aload_0         
	//   32   58:getfield        #68  <Field AppCompatBackgroundHelper mBackgroundTintHelper>
	//   33   61:aload_2         
	//   34   62:iload_3         
	//   35   63:invokevirtual   #72  <Method void AppCompatBackgroundHelper.loadFromAttributes(AttributeSet, int)>
		mTextHelper = new AppCompatTextHelper(((android.widget.TextView) (this)));
	//   36   66:aload_0         
	//   37   67:new             #74  <Class AppCompatTextHelper>
	//   38   70:dup             
	//   39   71:aload_0         
	//   40   72:invokespecial   #77  <Method void AppCompatTextHelper(android.widget.TextView)>
	//   41   75:putfield        #79  <Field AppCompatTextHelper mTextHelper>
		mTextHelper.loadFromAttributes(attributeset, i);
	//   42   78:aload_0         
	//   43   79:getfield        #79  <Field AppCompatTextHelper mTextHelper>
	//   44   82:aload_2         
	//   45   83:iload_3         
	//   46   84:invokevirtual   #80  <Method void AppCompatTextHelper.loadFromAttributes(AttributeSet, int)>
		mTextHelper.applyCompoundDrawablesTints();
	//   47   87:aload_0         
	//   48   88:getfield        #79  <Field AppCompatTextHelper mTextHelper>
	//   49   91:invokevirtual   #83  <Method void AppCompatTextHelper.applyCompoundDrawablesTints()>
	//   50   94:return          
	}

	protected void drawableStateChanged()
	{
		super.drawableStateChanged();
	//    0    0:aload_0         
	//    1    1:invokespecial   #86  <Method void AutoCompleteTextView.drawableStateChanged()>
		Object obj = ((Object) (mBackgroundTintHelper));
	//    2    4:aload_0         
	//    3    5:getfield        #68  <Field AppCompatBackgroundHelper mBackgroundTintHelper>
	//    4    8:astore_1        
		if(obj != null)
	//*   5    9:aload_1         
	//*   6   10:ifnull          17
			((AppCompatBackgroundHelper) (obj)).applySupportBackgroundTint();
	//    7   13:aload_1         
	//    8   14:invokevirtual   #89  <Method void AppCompatBackgroundHelper.applySupportBackgroundTint()>
		obj = ((Object) (mTextHelper));
	//    9   17:aload_0         
	//   10   18:getfield        #79  <Field AppCompatTextHelper mTextHelper>
	//   11   21:astore_1        
		if(obj != null)
	//*  12   22:aload_1         
	//*  13   23:ifnull          30
			((AppCompatTextHelper) (obj)).applyCompoundDrawablesTints();
	//   14   26:aload_1         
	//   15   27:invokevirtual   #83  <Method void AppCompatTextHelper.applyCompoundDrawablesTints()>
	//   16   30:return          
	}

	public ColorStateList getSupportBackgroundTintList()
	{
		AppCompatBackgroundHelper appcompatbackgroundhelper = mBackgroundTintHelper;
	//    0    0:aload_0         
	//    1    1:getfield        #68  <Field AppCompatBackgroundHelper mBackgroundTintHelper>
	//    2    4:astore_1        
		if(appcompatbackgroundhelper != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          14
			return appcompatbackgroundhelper.getSupportBackgroundTintList();
	//    5    9:aload_1         
	//    6   10:invokevirtual   #98  <Method ColorStateList AppCompatBackgroundHelper.getSupportBackgroundTintList()>
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
	//    1    1:getfield        #68  <Field AppCompatBackgroundHelper mBackgroundTintHelper>
	//    2    4:astore_1        
		if(appcompatbackgroundhelper != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          14
			return appcompatbackgroundhelper.getSupportBackgroundTintMode();
	//    5    9:aload_1         
	//    6   10:invokevirtual   #103 <Method android.graphics.PorterDuff$Mode AppCompatBackgroundHelper.getSupportBackgroundTintMode()>
	//    7   13:areturn         
		else
			return null;
	//    8   14:aconst_null     
	//    9   15:areturn         
	}

	public InputConnection onCreateInputConnection(EditorInfo editorinfo)
	{
		return AppCompatHintHelper.onCreateInputConnection(super.onCreateInputConnection(editorinfo), editorinfo, ((android.view.View) (this)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #107 <Method InputConnection AutoCompleteTextView.onCreateInputConnection(EditorInfo)>
	//    3    5:aload_1         
	//    4    6:aload_0         
	//    5    7:invokestatic    #112 <Method InputConnection AppCompatHintHelper.onCreateInputConnection(InputConnection, EditorInfo, android.view.View)>
	//    6   10:areturn         
	}

	public void setBackgroundDrawable(Drawable drawable)
	{
		super.setBackgroundDrawable(drawable);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #115 <Method void AutoCompleteTextView.setBackgroundDrawable(Drawable)>
		AppCompatBackgroundHelper appcompatbackgroundhelper = mBackgroundTintHelper;
	//    3    5:aload_0         
	//    4    6:getfield        #68  <Field AppCompatBackgroundHelper mBackgroundTintHelper>
	//    5    9:astore_2        
		if(appcompatbackgroundhelper != null)
	//*   6   10:aload_2         
	//*   7   11:ifnull          19
			appcompatbackgroundhelper.onSetBackgroundDrawable(drawable);
	//    8   14:aload_2         
	//    9   15:aload_1         
	//   10   16:invokevirtual   #118 <Method void AppCompatBackgroundHelper.onSetBackgroundDrawable(Drawable)>
	//   11   19:return          
	}

	public void setBackgroundResource(int i)
	{
		super.setBackgroundResource(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #123 <Method void AutoCompleteTextView.setBackgroundResource(int)>
		AppCompatBackgroundHelper appcompatbackgroundhelper = mBackgroundTintHelper;
	//    3    5:aload_0         
	//    4    6:getfield        #68  <Field AppCompatBackgroundHelper mBackgroundTintHelper>
	//    5    9:astore_2        
		if(appcompatbackgroundhelper != null)
	//*   6   10:aload_2         
	//*   7   11:ifnull          19
			appcompatbackgroundhelper.onSetBackgroundResource(i);
	//    8   14:aload_2         
	//    9   15:iload_1         
	//   10   16:invokevirtual   #126 <Method void AppCompatBackgroundHelper.onSetBackgroundResource(int)>
	//   11   19:return          
	}

	public void setCustomSelectionActionModeCallback(android.view.ActionMode.Callback callback)
	{
		super.setCustomSelectionActionModeCallback(TextViewCompat.wrapCustomSelectionActionModeCallback(((android.widget.TextView) (this)), callback));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:aload_1         
	//    3    3:invokestatic    #135 <Method android.view.ActionMode$Callback TextViewCompat.wrapCustomSelectionActionModeCallback(android.widget.TextView, android.view.ActionMode$Callback)>
	//    4    6:invokespecial   #137 <Method void AutoCompleteTextView.setCustomSelectionActionModeCallback(android.view.ActionMode$Callback)>
	//    5    9:return          
	}

	public void setDropDownBackgroundResource(int i)
	{
		setDropDownBackgroundDrawable(AppCompatResources.getDrawable(getContext(), i));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #40  <Method Context getContext()>
	//    3    5:iload_1         
	//    4    6:invokestatic    #143 <Method Drawable AppCompatResources.getDrawable(Context, int)>
	//    5    9:invokevirtual   #58  <Method void setDropDownBackgroundDrawable(Drawable)>
	//    6   12:return          
	}

	public void setSupportBackgroundTintList(ColorStateList colorstatelist)
	{
		AppCompatBackgroundHelper appcompatbackgroundhelper = mBackgroundTintHelper;
	//    0    0:aload_0         
	//    1    1:getfield        #68  <Field AppCompatBackgroundHelper mBackgroundTintHelper>
	//    2    4:astore_2        
		if(appcompatbackgroundhelper != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          14
			appcompatbackgroundhelper.setSupportBackgroundTintList(colorstatelist);
	//    5    9:aload_2         
	//    6   10:aload_1         
	//    7   11:invokevirtual   #147 <Method void AppCompatBackgroundHelper.setSupportBackgroundTintList(ColorStateList)>
	//    8   14:return          
	}

	public void setSupportBackgroundTintMode(android.graphics.PorterDuff.Mode mode)
	{
		AppCompatBackgroundHelper appcompatbackgroundhelper = mBackgroundTintHelper;
	//    0    0:aload_0         
	//    1    1:getfield        #68  <Field AppCompatBackgroundHelper mBackgroundTintHelper>
	//    2    4:astore_2        
		if(appcompatbackgroundhelper != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          14
			appcompatbackgroundhelper.setSupportBackgroundTintMode(mode);
	//    5    9:aload_2         
	//    6   10:aload_1         
	//    7   11:invokevirtual   #151 <Method void AppCompatBackgroundHelper.setSupportBackgroundTintMode(android.graphics.PorterDuff$Mode)>
	//    8   14:return          
	}

	public void setTextAppearance(Context context, int i)
	{
		super.setTextAppearance(context, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #155 <Method void AutoCompleteTextView.setTextAppearance(Context, int)>
		AppCompatTextHelper appcompattexthelper = mTextHelper;
	//    4    6:aload_0         
	//    5    7:getfield        #79  <Field AppCompatTextHelper mTextHelper>
	//    6   10:astore_3        
		if(appcompattexthelper != null)
	//*   7   11:aload_3         
	//*   8   12:ifnull          21
			appcompattexthelper.onSetTextAppearance(context, i);
	//    9   15:aload_3         
	//   10   16:aload_1         
	//   11   17:iload_2         
	//   12   18:invokevirtual   #158 <Method void AppCompatTextHelper.onSetTextAppearance(Context, int)>
	//   13   21:return          
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

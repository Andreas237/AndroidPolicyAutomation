// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.content.Context;
import android.support.v4.widget.ah;
import android.support.v7.content.res.AppCompatResources;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;

// Referenced classes of package android.support.v7.widget:
//			TintContextWrapper, AppCompatTextHelper, TintTypedArray, AppCompatHintHelper

public class AppCompatCheckedTextView extends CheckedTextView
{

	public AppCompatCheckedTextView(Context context)
	{
		this(context, ((AttributeSet) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:invokespecial   #19  <Method void AppCompatCheckedTextView(Context, AttributeSet)>
	//    4    6:return          
	}

	public AppCompatCheckedTextView(Context context, AttributeSet attributeset)
	{
		this(context, attributeset, 0x10103c8);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:ldc1            #20  <Int 0x10103c8>
	//    4    5:invokespecial   #23  <Method void AppCompatCheckedTextView(Context, AttributeSet, int)>
	//    5    8:return          
	}

	public AppCompatCheckedTextView(Context context, AttributeSet attributeset, int i)
	{
		super(TintContextWrapper.wrap(context), attributeset, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #29  <Method Context TintContextWrapper.wrap(Context)>
	//    3    5:aload_2         
	//    4    6:iload_3         
	//    5    7:invokespecial   #30  <Method void CheckedTextView(Context, AttributeSet, int)>
		mTextHelper = new AppCompatTextHelper(((android.widget.TextView) (this)));
	//    6   10:aload_0         
	//    7   11:new             #32  <Class AppCompatTextHelper>
	//    8   14:dup             
	//    9   15:aload_0         
	//   10   16:invokespecial   #35  <Method void AppCompatTextHelper(android.widget.TextView)>
	//   11   19:putfield        #37  <Field AppCompatTextHelper mTextHelper>
		mTextHelper.loadFromAttributes(attributeset, i);
	//   12   22:aload_0         
	//   13   23:getfield        #37  <Field AppCompatTextHelper mTextHelper>
	//   14   26:aload_2         
	//   15   27:iload_3         
	//   16   28:invokevirtual   #41  <Method void AppCompatTextHelper.loadFromAttributes(AttributeSet, int)>
		mTextHelper.applyCompoundDrawablesTints();
	//   17   31:aload_0         
	//   18   32:getfield        #37  <Field AppCompatTextHelper mTextHelper>
	//   19   35:invokevirtual   #44  <Method void AppCompatTextHelper.applyCompoundDrawablesTints()>
		context = ((Context) (TintTypedArray.obtainStyledAttributes(getContext(), attributeset, TINT_ATTRS, i, 0)));
	//   20   38:aload_0         
	//   21   39:invokevirtual   #48  <Method Context getContext()>
	//   22   42:aload_2         
	//   23   43:getstatic       #13  <Field int[] TINT_ATTRS>
	//   24   46:iload_3         
	//   25   47:iconst_0        
	//   26   48:invokestatic    #54  <Method TintTypedArray TintTypedArray.obtainStyledAttributes(Context, AttributeSet, int[], int, int)>
	//   27   51:astore_1        
		setCheckMarkDrawable(((TintTypedArray) (context)).getDrawable(0));
	//   28   52:aload_0         
	//   29   53:aload_1         
	//   30   54:iconst_0        
	//   31   55:invokevirtual   #58  <Method android.graphics.drawable.Drawable TintTypedArray.getDrawable(int)>
	//   32   58:invokevirtual   #62  <Method void setCheckMarkDrawable(android.graphics.drawable.Drawable)>
		((TintTypedArray) (context)).recycle();
	//   33   61:aload_1         
	//   34   62:invokevirtual   #65  <Method void TintTypedArray.recycle()>
	//   35   65:return          
	}

	protected void drawableStateChanged()
	{
		super.drawableStateChanged();
	//    0    0:aload_0         
	//    1    1:invokespecial   #68  <Method void CheckedTextView.drawableStateChanged()>
		AppCompatTextHelper appcompattexthelper = mTextHelper;
	//    2    4:aload_0         
	//    3    5:getfield        #37  <Field AppCompatTextHelper mTextHelper>
	//    4    8:astore_1        
		if(appcompattexthelper != null)
	//*   5    9:aload_1         
	//*   6   10:ifnull          17
			appcompattexthelper.applyCompoundDrawablesTints();
	//    7   13:aload_1         
	//    8   14:invokevirtual   #44  <Method void AppCompatTextHelper.applyCompoundDrawablesTints()>
	//    9   17:return          
	}

	public InputConnection onCreateInputConnection(EditorInfo editorinfo)
	{
		return AppCompatHintHelper.onCreateInputConnection(super.onCreateInputConnection(editorinfo), editorinfo, ((android.view.View) (this)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #72  <Method InputConnection CheckedTextView.onCreateInputConnection(EditorInfo)>
	//    3    5:aload_1         
	//    4    6:aload_0         
	//    5    7:invokestatic    #77  <Method InputConnection AppCompatHintHelper.onCreateInputConnection(InputConnection, EditorInfo, android.view.View)>
	//    6   10:areturn         
	}

	public void setCheckMarkDrawable(int i)
	{
		setCheckMarkDrawable(AppCompatResources.getDrawable(getContext(), i));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #48  <Method Context getContext()>
	//    3    5:iload_1         
	//    4    6:invokestatic    #83  <Method android.graphics.drawable.Drawable AppCompatResources.getDrawable(Context, int)>
	//    5    9:invokevirtual   #62  <Method void setCheckMarkDrawable(android.graphics.drawable.Drawable)>
	//    6   12:return          
	}

	public void setCustomSelectionActionModeCallback(android.view.ActionMode.Callback callback)
	{
		super.setCustomSelectionActionModeCallback(ah.a(((android.widget.TextView) (this)), callback));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:aload_1         
	//    3    3:invokestatic    #91  <Method android.view.ActionMode$Callback ah.a(android.widget.TextView, android.view.ActionMode$Callback)>
	//    4    6:invokespecial   #93  <Method void CheckedTextView.setCustomSelectionActionModeCallback(android.view.ActionMode$Callback)>
	//    5    9:return          
	}

	public void setTextAppearance(Context context, int i)
	{
		super.setTextAppearance(context, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #97  <Method void CheckedTextView.setTextAppearance(Context, int)>
		AppCompatTextHelper appcompattexthelper = mTextHelper;
	//    4    6:aload_0         
	//    5    7:getfield        #37  <Field AppCompatTextHelper mTextHelper>
	//    6   10:astore_3        
		if(appcompattexthelper != null)
	//*   7   11:aload_3         
	//*   8   12:ifnull          21
			appcompattexthelper.onSetTextAppearance(context, i);
	//    9   15:aload_3         
	//   10   16:aload_1         
	//   11   17:iload_2         
	//   12   18:invokevirtual   #100 <Method void AppCompatTextHelper.onSetTextAppearance(Context, int)>
	//   13   21:return          
	}

	private static final int TINT_ATTRS[] = {
		0x1010108
	};
	private final AppCompatTextHelper mTextHelper;

	static 
	{
	//    0    0:iconst_1        
	//    1    1:newarray        int[]
	//    2    3:dup             
	//    3    4:iconst_0        
	//    4    5:ldc1            #11  <Int 0x1010108>
	//    5    7:iastore         
	//    6    8:putstatic       #13  <Field int[] TINT_ATTRS>
	//*   7   11:return          
	}
}

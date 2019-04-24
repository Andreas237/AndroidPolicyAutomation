// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.support.v4.view.TintableBackgroundView;
import android.support.v4.widget.AutoSizeableTextView;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;

// Referenced classes of package android.support.v7.widget:
//			TintContextWrapper, AppCompatBackgroundHelper, AppCompatTextHelper, AppCompatHintHelper

public class AppCompatTextView extends TextView
	implements TintableBackgroundView, AutoSizeableTextView
{

	public AppCompatTextView(Context context)
	{
		this(context, ((AttributeSet) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:invokespecial   #17  <Method void AppCompatTextView(Context, AttributeSet)>
	//    4    6:return          
	}

	public AppCompatTextView(Context context, AttributeSet attributeset)
	{
		this(context, attributeset, 0x1010084);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:ldc1            #19  <Int 0x1010084>
	//    4    5:invokespecial   #22  <Method void AppCompatTextView(Context, AttributeSet, int)>
	//    5    8:return          
	}

	public AppCompatTextView(Context context, AttributeSet attributeset, int i)
	{
		super(TintContextWrapper.wrap(context), attributeset, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #28  <Method Context TintContextWrapper.wrap(Context)>
	//    3    5:aload_2         
	//    4    6:iload_3         
	//    5    7:invokespecial   #29  <Method void TextView(Context, AttributeSet, int)>
		mBackgroundTintHelper = new AppCompatBackgroundHelper(((android.view.View) (this)));
	//    6   10:aload_0         
	//    7   11:new             #31  <Class AppCompatBackgroundHelper>
	//    8   14:dup             
	//    9   15:aload_0         
	//   10   16:invokespecial   #34  <Method void AppCompatBackgroundHelper(android.view.View)>
	//   11   19:putfield        #36  <Field AppCompatBackgroundHelper mBackgroundTintHelper>
		mBackgroundTintHelper.loadFromAttributes(attributeset, i);
	//   12   22:aload_0         
	//   13   23:getfield        #36  <Field AppCompatBackgroundHelper mBackgroundTintHelper>
	//   14   26:aload_2         
	//   15   27:iload_3         
	//   16   28:invokevirtual   #40  <Method void AppCompatBackgroundHelper.loadFromAttributes(AttributeSet, int)>
		mTextHelper = AppCompatTextHelper.create(((TextView) (this)));
	//   17   31:aload_0         
	//   18   32:aload_0         
	//   19   33:invokestatic    #46  <Method AppCompatTextHelper AppCompatTextHelper.create(TextView)>
	//   20   36:putfield        #48  <Field AppCompatTextHelper mTextHelper>
		mTextHelper.loadFromAttributes(attributeset, i);
	//   21   39:aload_0         
	//   22   40:getfield        #48  <Field AppCompatTextHelper mTextHelper>
	//   23   43:aload_2         
	//   24   44:iload_3         
	//   25   45:invokevirtual   #49  <Method void AppCompatTextHelper.loadFromAttributes(AttributeSet, int)>
		mTextHelper.applyCompoundDrawablesTints();
	//   26   48:aload_0         
	//   27   49:getfield        #48  <Field AppCompatTextHelper mTextHelper>
	//   28   52:invokevirtual   #53  <Method void AppCompatTextHelper.applyCompoundDrawablesTints()>
	//   29   55:return          
	}

	protected void drawableStateChanged()
	{
		super.drawableStateChanged();
	//    0    0:aload_0         
	//    1    1:invokespecial   #56  <Method void TextView.drawableStateChanged()>
		if(mBackgroundTintHelper != null)
	//*   2    4:aload_0         
	//*   3    5:getfield        #36  <Field AppCompatBackgroundHelper mBackgroundTintHelper>
	//*   4    8:ifnull          18
			mBackgroundTintHelper.applySupportBackgroundTint();
	//    5   11:aload_0         
	//    6   12:getfield        #36  <Field AppCompatBackgroundHelper mBackgroundTintHelper>
	//    7   15:invokevirtual   #59  <Method void AppCompatBackgroundHelper.applySupportBackgroundTint()>
		if(mTextHelper != null)
	//*   8   18:aload_0         
	//*   9   19:getfield        #48  <Field AppCompatTextHelper mTextHelper>
	//*  10   22:ifnull          32
			mTextHelper.applyCompoundDrawablesTints();
	//   11   25:aload_0         
	//   12   26:getfield        #48  <Field AppCompatTextHelper mTextHelper>
	//   13   29:invokevirtual   #53  <Method void AppCompatTextHelper.applyCompoundDrawablesTints()>
	//   14   32:return          
	}

	public int getAutoSizeMaxTextSize()
	{
		if(PLATFORM_SUPPORTS_AUTOSIZE)
	//*   0    0:getstatic       #69  <Field boolean PLATFORM_SUPPORTS_AUTOSIZE>
	//*   1    3:ifeq            11
			return super.getAutoSizeMaxTextSize();
	//    2    6:aload_0         
	//    3    7:invokespecial   #71  <Method int TextView.getAutoSizeMaxTextSize()>
	//    4   10:ireturn         
		if(mTextHelper != null)
	//*   5   11:aload_0         
	//*   6   12:getfield        #48  <Field AppCompatTextHelper mTextHelper>
	//*   7   15:ifnull          26
			return mTextHelper.getAutoSizeMaxTextSize();
	//    8   18:aload_0         
	//    9   19:getfield        #48  <Field AppCompatTextHelper mTextHelper>
	//   10   22:invokevirtual   #72  <Method int AppCompatTextHelper.getAutoSizeMaxTextSize()>
	//   11   25:ireturn         
		else
			return -1;
	//   12   26:iconst_m1       
	//   13   27:ireturn         
	}

	public int getAutoSizeMinTextSize()
	{
		if(PLATFORM_SUPPORTS_AUTOSIZE)
	//*   0    0:getstatic       #69  <Field boolean PLATFORM_SUPPORTS_AUTOSIZE>
	//*   1    3:ifeq            11
			return super.getAutoSizeMinTextSize();
	//    2    6:aload_0         
	//    3    7:invokespecial   #76  <Method int TextView.getAutoSizeMinTextSize()>
	//    4   10:ireturn         
		if(mTextHelper != null)
	//*   5   11:aload_0         
	//*   6   12:getfield        #48  <Field AppCompatTextHelper mTextHelper>
	//*   7   15:ifnull          26
			return mTextHelper.getAutoSizeMinTextSize();
	//    8   18:aload_0         
	//    9   19:getfield        #48  <Field AppCompatTextHelper mTextHelper>
	//   10   22:invokevirtual   #77  <Method int AppCompatTextHelper.getAutoSizeMinTextSize()>
	//   11   25:ireturn         
		else
			return -1;
	//   12   26:iconst_m1       
	//   13   27:ireturn         
	}

	public int getAutoSizeStepGranularity()
	{
		if(PLATFORM_SUPPORTS_AUTOSIZE)
	//*   0    0:getstatic       #69  <Field boolean PLATFORM_SUPPORTS_AUTOSIZE>
	//*   1    3:ifeq            11
			return super.getAutoSizeStepGranularity();
	//    2    6:aload_0         
	//    3    7:invokespecial   #80  <Method int TextView.getAutoSizeStepGranularity()>
	//    4   10:ireturn         
		if(mTextHelper != null)
	//*   5   11:aload_0         
	//*   6   12:getfield        #48  <Field AppCompatTextHelper mTextHelper>
	//*   7   15:ifnull          26
			return mTextHelper.getAutoSizeStepGranularity();
	//    8   18:aload_0         
	//    9   19:getfield        #48  <Field AppCompatTextHelper mTextHelper>
	//   10   22:invokevirtual   #81  <Method int AppCompatTextHelper.getAutoSizeStepGranularity()>
	//   11   25:ireturn         
		else
			return -1;
	//   12   26:iconst_m1       
	//   13   27:ireturn         
	}

	public int[] getAutoSizeTextAvailableSizes()
	{
		if(PLATFORM_SUPPORTS_AUTOSIZE)
	//*   0    0:getstatic       #69  <Field boolean PLATFORM_SUPPORTS_AUTOSIZE>
	//*   1    3:ifeq            11
			return super.getAutoSizeTextAvailableSizes();
	//    2    6:aload_0         
	//    3    7:invokespecial   #85  <Method int[] TextView.getAutoSizeTextAvailableSizes()>
	//    4   10:areturn         
		if(mTextHelper != null)
	//*   5   11:aload_0         
	//*   6   12:getfield        #48  <Field AppCompatTextHelper mTextHelper>
	//*   7   15:ifnull          26
			return mTextHelper.getAutoSizeTextAvailableSizes();
	//    8   18:aload_0         
	//    9   19:getfield        #48  <Field AppCompatTextHelper mTextHelper>
	//   10   22:invokevirtual   #86  <Method int[] AppCompatTextHelper.getAutoSizeTextAvailableSizes()>
	//   11   25:areturn         
		else
			return new int[0];
	//   12   26:iconst_0        
	//   13   27:newarray        int[]
	//   14   29:areturn         
	}

	public int getAutoSizeTextType()
	{
		boolean flag = PLATFORM_SUPPORTS_AUTOSIZE;
	//    0    0:getstatic       #69  <Field boolean PLATFORM_SUPPORTS_AUTOSIZE>
	//    1    3:istore_2        
		int i = 0;
	//    2    4:iconst_0        
	//    3    5:istore_1        
		if(flag)
	//*   4    6:iload_2         
	//*   5    7:ifeq            22
		{
			if(super.getAutoSizeTextType() == 1)
	//*   6   10:aload_0         
	//*   7   11:invokespecial   #89  <Method int TextView.getAutoSizeTextType()>
	//*   8   14:iconst_1        
	//*   9   15:icmpne          20
				i = 1;
	//   10   18:iconst_1        
	//   11   19:istore_1        
			return i;
	//   12   20:iload_1         
	//   13   21:ireturn         
		}
		if(mTextHelper != null)
	//*  14   22:aload_0         
	//*  15   23:getfield        #48  <Field AppCompatTextHelper mTextHelper>
	//*  16   26:ifnull          37
			return mTextHelper.getAutoSizeTextType();
	//   17   29:aload_0         
	//   18   30:getfield        #48  <Field AppCompatTextHelper mTextHelper>
	//   19   33:invokevirtual   #90  <Method int AppCompatTextHelper.getAutoSizeTextType()>
	//   20   36:ireturn         
		else
			return 0;
	//   21   37:iconst_0        
	//   22   38:ireturn         
	}

	public ColorStateList getSupportBackgroundTintList()
	{
		if(mBackgroundTintHelper != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #36  <Field AppCompatBackgroundHelper mBackgroundTintHelper>
	//*   2    4:ifnull          15
			return mBackgroundTintHelper.getSupportBackgroundTintList();
	//    3    7:aload_0         
	//    4    8:getfield        #36  <Field AppCompatBackgroundHelper mBackgroundTintHelper>
	//    5   11:invokevirtual   #95  <Method ColorStateList AppCompatBackgroundHelper.getSupportBackgroundTintList()>
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
	//*   1    1:getfield        #36  <Field AppCompatBackgroundHelper mBackgroundTintHelper>
	//*   2    4:ifnull          15
			return mBackgroundTintHelper.getSupportBackgroundTintMode();
	//    3    7:aload_0         
	//    4    8:getfield        #36  <Field AppCompatBackgroundHelper mBackgroundTintHelper>
	//    5   11:invokevirtual   #99  <Method android.graphics.PorterDuff$Mode AppCompatBackgroundHelper.getSupportBackgroundTintMode()>
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
	//    2    2:invokespecial   #103 <Method InputConnection TextView.onCreateInputConnection(EditorInfo)>
	//    3    5:aload_1         
	//    4    6:aload_0         
	//    5    7:invokestatic    #108 <Method InputConnection AppCompatHintHelper.onCreateInputConnection(InputConnection, EditorInfo, android.view.View)>
	//    6   10:areturn         
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
	//    6    8:invokespecial   #112 <Method void TextView.onLayout(boolean, int, int, int, int)>
		if(mTextHelper != null)
	//*   7   11:aload_0         
	//*   8   12:getfield        #48  <Field AppCompatTextHelper mTextHelper>
	//*   9   15:ifnull          32
			mTextHelper.onLayout(flag, i, j, k, l);
	//   10   18:aload_0         
	//   11   19:getfield        #48  <Field AppCompatTextHelper mTextHelper>
	//   12   22:iload_1         
	//   13   23:iload_2         
	//   14   24:iload_3         
	//   15   25:iload           4
	//   16   27:iload           5
	//   17   29:invokevirtual   #113 <Method void AppCompatTextHelper.onLayout(boolean, int, int, int, int)>
	//   18   32:return          
	}

	protected void onTextChanged(CharSequence charsequence, int i, int j, int k)
	{
		super.onTextChanged(charsequence, i, j, k);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:iload_3         
	//    4    4:iload           4
	//    5    6:invokespecial   #117 <Method void TextView.onTextChanged(CharSequence, int, int, int)>
		if(mTextHelper != null && !PLATFORM_SUPPORTS_AUTOSIZE && mTextHelper.isAutoSizeEnabled())
	//*   6    9:aload_0         
	//*   7   10:getfield        #48  <Field AppCompatTextHelper mTextHelper>
	//*   8   13:ifnull          39
	//*   9   16:getstatic       #69  <Field boolean PLATFORM_SUPPORTS_AUTOSIZE>
	//*  10   19:ifne            39
	//*  11   22:aload_0         
	//*  12   23:getfield        #48  <Field AppCompatTextHelper mTextHelper>
	//*  13   26:invokevirtual   #121 <Method boolean AppCompatTextHelper.isAutoSizeEnabled()>
	//*  14   29:ifeq            39
			mTextHelper.autoSizeText();
	//   15   32:aload_0         
	//   16   33:getfield        #48  <Field AppCompatTextHelper mTextHelper>
	//   17   36:invokevirtual   #124 <Method void AppCompatTextHelper.autoSizeText()>
	//   18   39:return          
	}

	public void setAutoSizeTextTypeUniformWithConfiguration(int i, int j, int k, int l)
		throws IllegalArgumentException
	{
		if(PLATFORM_SUPPORTS_AUTOSIZE)
	//*   0    0:getstatic       #69  <Field boolean PLATFORM_SUPPORTS_AUTOSIZE>
	//*   1    3:ifeq            16
		{
			super.setAutoSizeTextTypeUniformWithConfiguration(i, j, k, l);
	//    2    6:aload_0         
	//    3    7:iload_1         
	//    4    8:iload_2         
	//    5    9:iload_3         
	//    6   10:iload           4
	//    7   12:invokespecial   #130 <Method void TextView.setAutoSizeTextTypeUniformWithConfiguration(int, int, int, int)>
			return;
	//    8   15:return          
		}
		if(mTextHelper != null)
	//*   9   16:aload_0         
	//*  10   17:getfield        #48  <Field AppCompatTextHelper mTextHelper>
	//*  11   20:ifnull          35
			mTextHelper.setAutoSizeTextTypeUniformWithConfiguration(i, j, k, l);
	//   12   23:aload_0         
	//   13   24:getfield        #48  <Field AppCompatTextHelper mTextHelper>
	//   14   27:iload_1         
	//   15   28:iload_2         
	//   16   29:iload_3         
	//   17   30:iload           4
	//   18   32:invokevirtual   #131 <Method void AppCompatTextHelper.setAutoSizeTextTypeUniformWithConfiguration(int, int, int, int)>
	//   19   35:return          
	}

	public void setAutoSizeTextTypeUniformWithPresetSizes(int ai[], int i)
		throws IllegalArgumentException
	{
		if(PLATFORM_SUPPORTS_AUTOSIZE)
	//*   0    0:getstatic       #69  <Field boolean PLATFORM_SUPPORTS_AUTOSIZE>
	//*   1    3:ifeq            13
		{
			super.setAutoSizeTextTypeUniformWithPresetSizes(ai, i);
	//    2    6:aload_0         
	//    3    7:aload_1         
	//    4    8:iload_2         
	//    5    9:invokespecial   #137 <Method void TextView.setAutoSizeTextTypeUniformWithPresetSizes(int[], int)>
			return;
	//    6   12:return          
		}
		if(mTextHelper != null)
	//*   7   13:aload_0         
	//*   8   14:getfield        #48  <Field AppCompatTextHelper mTextHelper>
	//*   9   17:ifnull          29
			mTextHelper.setAutoSizeTextTypeUniformWithPresetSizes(ai, i);
	//   10   20:aload_0         
	//   11   21:getfield        #48  <Field AppCompatTextHelper mTextHelper>
	//   12   24:aload_1         
	//   13   25:iload_2         
	//   14   26:invokevirtual   #138 <Method void AppCompatTextHelper.setAutoSizeTextTypeUniformWithPresetSizes(int[], int)>
	//   15   29:return          
	}

	public void setAutoSizeTextTypeWithDefaults(int i)
	{
		if(PLATFORM_SUPPORTS_AUTOSIZE)
	//*   0    0:getstatic       #69  <Field boolean PLATFORM_SUPPORTS_AUTOSIZE>
	//*   1    3:ifeq            12
		{
			super.setAutoSizeTextTypeWithDefaults(i);
	//    2    6:aload_0         
	//    3    7:iload_1         
	//    4    8:invokespecial   #143 <Method void TextView.setAutoSizeTextTypeWithDefaults(int)>
			return;
	//    5   11:return          
		}
		if(mTextHelper != null)
	//*   6   12:aload_0         
	//*   7   13:getfield        #48  <Field AppCompatTextHelper mTextHelper>
	//*   8   16:ifnull          27
			mTextHelper.setAutoSizeTextTypeWithDefaults(i);
	//    9   19:aload_0         
	//   10   20:getfield        #48  <Field AppCompatTextHelper mTextHelper>
	//   11   23:iload_1         
	//   12   24:invokevirtual   #144 <Method void AppCompatTextHelper.setAutoSizeTextTypeWithDefaults(int)>
	//   13   27:return          
	}

	public void setBackgroundDrawable(Drawable drawable)
	{
		super.setBackgroundDrawable(drawable);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #148 <Method void TextView.setBackgroundDrawable(Drawable)>
		if(mBackgroundTintHelper != null)
	//*   3    5:aload_0         
	//*   4    6:getfield        #36  <Field AppCompatBackgroundHelper mBackgroundTintHelper>
	//*   5    9:ifnull          20
			mBackgroundTintHelper.onSetBackgroundDrawable(drawable);
	//    6   12:aload_0         
	//    7   13:getfield        #36  <Field AppCompatBackgroundHelper mBackgroundTintHelper>
	//    8   16:aload_1         
	//    9   17:invokevirtual   #151 <Method void AppCompatBackgroundHelper.onSetBackgroundDrawable(Drawable)>
	//   10   20:return          
	}

	public void setBackgroundResource(int i)
	{
		super.setBackgroundResource(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #155 <Method void TextView.setBackgroundResource(int)>
		if(mBackgroundTintHelper != null)
	//*   3    5:aload_0         
	//*   4    6:getfield        #36  <Field AppCompatBackgroundHelper mBackgroundTintHelper>
	//*   5    9:ifnull          20
			mBackgroundTintHelper.onSetBackgroundResource(i);
	//    6   12:aload_0         
	//    7   13:getfield        #36  <Field AppCompatBackgroundHelper mBackgroundTintHelper>
	//    8   16:iload_1         
	//    9   17:invokevirtual   #158 <Method void AppCompatBackgroundHelper.onSetBackgroundResource(int)>
	//   10   20:return          
	}

	public void setSupportBackgroundTintList(ColorStateList colorstatelist)
	{
		if(mBackgroundTintHelper != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #36  <Field AppCompatBackgroundHelper mBackgroundTintHelper>
	//*   2    4:ifnull          15
			mBackgroundTintHelper.setSupportBackgroundTintList(colorstatelist);
	//    3    7:aload_0         
	//    4    8:getfield        #36  <Field AppCompatBackgroundHelper mBackgroundTintHelper>
	//    5   11:aload_1         
	//    6   12:invokevirtual   #162 <Method void AppCompatBackgroundHelper.setSupportBackgroundTintList(ColorStateList)>
	//    7   15:return          
	}

	public void setSupportBackgroundTintMode(android.graphics.PorterDuff.Mode mode)
	{
		if(mBackgroundTintHelper != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #36  <Field AppCompatBackgroundHelper mBackgroundTintHelper>
	//*   2    4:ifnull          15
			mBackgroundTintHelper.setSupportBackgroundTintMode(mode);
	//    3    7:aload_0         
	//    4    8:getfield        #36  <Field AppCompatBackgroundHelper mBackgroundTintHelper>
	//    5   11:aload_1         
	//    6   12:invokevirtual   #166 <Method void AppCompatBackgroundHelper.setSupportBackgroundTintMode(android.graphics.PorterDuff$Mode)>
	//    7   15:return          
	}

	public void setTextAppearance(Context context, int i)
	{
		super.setTextAppearance(context, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #170 <Method void TextView.setTextAppearance(Context, int)>
		if(mTextHelper != null)
	//*   4    6:aload_0         
	//*   5    7:getfield        #48  <Field AppCompatTextHelper mTextHelper>
	//*   6   10:ifnull          22
			mTextHelper.onSetTextAppearance(context, i);
	//    7   13:aload_0         
	//    8   14:getfield        #48  <Field AppCompatTextHelper mTextHelper>
	//    9   17:aload_1         
	//   10   18:iload_2         
	//   11   19:invokevirtual   #173 <Method void AppCompatTextHelper.onSetTextAppearance(Context, int)>
	//   12   22:return          
	}

	public void setTextSize(int i, float f)
	{
		if(PLATFORM_SUPPORTS_AUTOSIZE)
	//*   0    0:getstatic       #69  <Field boolean PLATFORM_SUPPORTS_AUTOSIZE>
	//*   1    3:ifeq            13
		{
			super.setTextSize(i, f);
	//    2    6:aload_0         
	//    3    7:iload_1         
	//    4    8:fload_2         
	//    5    9:invokespecial   #177 <Method void TextView.setTextSize(int, float)>
			return;
	//    6   12:return          
		}
		if(mTextHelper != null)
	//*   7   13:aload_0         
	//*   8   14:getfield        #48  <Field AppCompatTextHelper mTextHelper>
	//*   9   17:ifnull          29
			mTextHelper.setTextSize(i, f);
	//   10   20:aload_0         
	//   11   21:getfield        #48  <Field AppCompatTextHelper mTextHelper>
	//   12   24:iload_1         
	//   13   25:fload_2         
	//   14   26:invokevirtual   #178 <Method void AppCompatTextHelper.setTextSize(int, float)>
	//   15   29:return          
	}

	private final AppCompatBackgroundHelper mBackgroundTintHelper;
	private final AppCompatTextHelper mTextHelper;
}

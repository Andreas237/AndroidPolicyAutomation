// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.support.v4.view.TintableBackgroundView;
import android.support.v4.widget.AutoSizeableTextView;
import android.support.v4.widget.TextViewCompat;
import android.util.AttributeSet;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;

// Referenced classes of package android.support.v7.widget:
//			TintContextWrapper, AppCompatBackgroundHelper, AppCompatTextHelper

public class AppCompatButton extends Button
	implements TintableBackgroundView, AutoSizeableTextView
{

	public AppCompatButton(Context context)
	{
		this(context, ((AttributeSet) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:invokespecial   #17  <Method void AppCompatButton(Context, AttributeSet)>
	//    4    6:return          
	}

	public AppCompatButton(Context context, AttributeSet attributeset)
	{
		this(context, attributeset, android.support.v7.appcompat.R.attr.buttonStyle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:getstatic       #24  <Field int android.support.v7.appcompat.R$attr.buttonStyle>
	//    4    6:invokespecial   #27  <Method void AppCompatButton(Context, AttributeSet, int)>
	//    5    9:return          
	}

	public AppCompatButton(Context context, AttributeSet attributeset, int i)
	{
		super(TintContextWrapper.wrap(context), attributeset, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #33  <Method Context TintContextWrapper.wrap(Context)>
	//    3    5:aload_2         
	//    4    6:iload_3         
	//    5    7:invokespecial   #34  <Method void Button(Context, AttributeSet, int)>
		mBackgroundTintHelper = new AppCompatBackgroundHelper(((android.view.View) (this)));
	//    6   10:aload_0         
	//    7   11:new             #36  <Class AppCompatBackgroundHelper>
	//    8   14:dup             
	//    9   15:aload_0         
	//   10   16:invokespecial   #39  <Method void AppCompatBackgroundHelper(android.view.View)>
	//   11   19:putfield        #41  <Field AppCompatBackgroundHelper mBackgroundTintHelper>
		mBackgroundTintHelper.loadFromAttributes(attributeset, i);
	//   12   22:aload_0         
	//   13   23:getfield        #41  <Field AppCompatBackgroundHelper mBackgroundTintHelper>
	//   14   26:aload_2         
	//   15   27:iload_3         
	//   16   28:invokevirtual   #45  <Method void AppCompatBackgroundHelper.loadFromAttributes(AttributeSet, int)>
		mTextHelper = new AppCompatTextHelper(((android.widget.TextView) (this)));
	//   17   31:aload_0         
	//   18   32:new             #47  <Class AppCompatTextHelper>
	//   19   35:dup             
	//   20   36:aload_0         
	//   21   37:invokespecial   #50  <Method void AppCompatTextHelper(android.widget.TextView)>
	//   22   40:putfield        #52  <Field AppCompatTextHelper mTextHelper>
		mTextHelper.loadFromAttributes(attributeset, i);
	//   23   43:aload_0         
	//   24   44:getfield        #52  <Field AppCompatTextHelper mTextHelper>
	//   25   47:aload_2         
	//   26   48:iload_3         
	//   27   49:invokevirtual   #53  <Method void AppCompatTextHelper.loadFromAttributes(AttributeSet, int)>
		mTextHelper.applyCompoundDrawablesTints();
	//   28   52:aload_0         
	//   29   53:getfield        #52  <Field AppCompatTextHelper mTextHelper>
	//   30   56:invokevirtual   #57  <Method void AppCompatTextHelper.applyCompoundDrawablesTints()>
	//   31   59:return          
	}

	protected void drawableStateChanged()
	{
		super.drawableStateChanged();
	//    0    0:aload_0         
	//    1    1:invokespecial   #60  <Method void Button.drawableStateChanged()>
		Object obj = ((Object) (mBackgroundTintHelper));
	//    2    4:aload_0         
	//    3    5:getfield        #41  <Field AppCompatBackgroundHelper mBackgroundTintHelper>
	//    4    8:astore_1        
		if(obj != null)
	//*   5    9:aload_1         
	//*   6   10:ifnull          17
			((AppCompatBackgroundHelper) (obj)).applySupportBackgroundTint();
	//    7   13:aload_1         
	//    8   14:invokevirtual   #63  <Method void AppCompatBackgroundHelper.applySupportBackgroundTint()>
		obj = ((Object) (mTextHelper));
	//    9   17:aload_0         
	//   10   18:getfield        #52  <Field AppCompatTextHelper mTextHelper>
	//   11   21:astore_1        
		if(obj != null)
	//*  12   22:aload_1         
	//*  13   23:ifnull          30
			((AppCompatTextHelper) (obj)).applyCompoundDrawablesTints();
	//   14   26:aload_1         
	//   15   27:invokevirtual   #57  <Method void AppCompatTextHelper.applyCompoundDrawablesTints()>
	//   16   30:return          
	}

	public int getAutoSizeMaxTextSize()
	{
		if(PLATFORM_SUPPORTS_AUTOSIZE)
	//*   0    0:getstatic       #73  <Field boolean PLATFORM_SUPPORTS_AUTOSIZE>
	//*   1    3:ifeq            11
			return super.getAutoSizeMaxTextSize();
	//    2    6:aload_0         
	//    3    7:invokespecial   #75  <Method int Button.getAutoSizeMaxTextSize()>
	//    4   10:ireturn         
		AppCompatTextHelper appcompattexthelper = mTextHelper;
	//    5   11:aload_0         
	//    6   12:getfield        #52  <Field AppCompatTextHelper mTextHelper>
	//    7   15:astore_1        
		if(appcompattexthelper != null)
	//*   8   16:aload_1         
	//*   9   17:ifnull          25
			return appcompattexthelper.getAutoSizeMaxTextSize();
	//   10   20:aload_1         
	//   11   21:invokevirtual   #76  <Method int AppCompatTextHelper.getAutoSizeMaxTextSize()>
	//   12   24:ireturn         
		else
			return -1;
	//   13   25:iconst_m1       
	//   14   26:ireturn         
	}

	public int getAutoSizeMinTextSize()
	{
		if(PLATFORM_SUPPORTS_AUTOSIZE)
	//*   0    0:getstatic       #73  <Field boolean PLATFORM_SUPPORTS_AUTOSIZE>
	//*   1    3:ifeq            11
			return super.getAutoSizeMinTextSize();
	//    2    6:aload_0         
	//    3    7:invokespecial   #80  <Method int Button.getAutoSizeMinTextSize()>
	//    4   10:ireturn         
		AppCompatTextHelper appcompattexthelper = mTextHelper;
	//    5   11:aload_0         
	//    6   12:getfield        #52  <Field AppCompatTextHelper mTextHelper>
	//    7   15:astore_1        
		if(appcompattexthelper != null)
	//*   8   16:aload_1         
	//*   9   17:ifnull          25
			return appcompattexthelper.getAutoSizeMinTextSize();
	//   10   20:aload_1         
	//   11   21:invokevirtual   #81  <Method int AppCompatTextHelper.getAutoSizeMinTextSize()>
	//   12   24:ireturn         
		else
			return -1;
	//   13   25:iconst_m1       
	//   14   26:ireturn         
	}

	public int getAutoSizeStepGranularity()
	{
		if(PLATFORM_SUPPORTS_AUTOSIZE)
	//*   0    0:getstatic       #73  <Field boolean PLATFORM_SUPPORTS_AUTOSIZE>
	//*   1    3:ifeq            11
			return super.getAutoSizeStepGranularity();
	//    2    6:aload_0         
	//    3    7:invokespecial   #84  <Method int Button.getAutoSizeStepGranularity()>
	//    4   10:ireturn         
		AppCompatTextHelper appcompattexthelper = mTextHelper;
	//    5   11:aload_0         
	//    6   12:getfield        #52  <Field AppCompatTextHelper mTextHelper>
	//    7   15:astore_1        
		if(appcompattexthelper != null)
	//*   8   16:aload_1         
	//*   9   17:ifnull          25
			return appcompattexthelper.getAutoSizeStepGranularity();
	//   10   20:aload_1         
	//   11   21:invokevirtual   #85  <Method int AppCompatTextHelper.getAutoSizeStepGranularity()>
	//   12   24:ireturn         
		else
			return -1;
	//   13   25:iconst_m1       
	//   14   26:ireturn         
	}

	public int[] getAutoSizeTextAvailableSizes()
	{
		if(PLATFORM_SUPPORTS_AUTOSIZE)
	//*   0    0:getstatic       #73  <Field boolean PLATFORM_SUPPORTS_AUTOSIZE>
	//*   1    3:ifeq            11
			return super.getAutoSizeTextAvailableSizes();
	//    2    6:aload_0         
	//    3    7:invokespecial   #89  <Method int[] Button.getAutoSizeTextAvailableSizes()>
	//    4   10:areturn         
		AppCompatTextHelper appcompattexthelper = mTextHelper;
	//    5   11:aload_0         
	//    6   12:getfield        #52  <Field AppCompatTextHelper mTextHelper>
	//    7   15:astore_1        
		if(appcompattexthelper != null)
	//*   8   16:aload_1         
	//*   9   17:ifnull          25
			return appcompattexthelper.getAutoSizeTextAvailableSizes();
	//   10   20:aload_1         
	//   11   21:invokevirtual   #90  <Method int[] AppCompatTextHelper.getAutoSizeTextAvailableSizes()>
	//   12   24:areturn         
		else
			return new int[0];
	//   13   25:iconst_0        
	//   14   26:newarray        int[]
	//   15   28:areturn         
	}

	public int getAutoSizeTextType()
	{
		boolean flag = PLATFORM_SUPPORTS_AUTOSIZE;
	//    0    0:getstatic       #73  <Field boolean PLATFORM_SUPPORTS_AUTOSIZE>
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
	//*   7   11:invokespecial   #93  <Method int Button.getAutoSizeTextType()>
	//*   8   14:iconst_1        
	//*   9   15:icmpne          20
				i = 1;
	//   10   18:iconst_1        
	//   11   19:istore_1        
			return i;
	//   12   20:iload_1         
	//   13   21:ireturn         
		}
		AppCompatTextHelper appcompattexthelper = mTextHelper;
	//   14   22:aload_0         
	//   15   23:getfield        #52  <Field AppCompatTextHelper mTextHelper>
	//   16   26:astore_3        
		if(appcompattexthelper != null)
	//*  17   27:aload_3         
	//*  18   28:ifnull          36
			return appcompattexthelper.getAutoSizeTextType();
	//   19   31:aload_3         
	//   20   32:invokevirtual   #94  <Method int AppCompatTextHelper.getAutoSizeTextType()>
	//   21   35:ireturn         
		else
			return 0;
	//   22   36:iconst_0        
	//   23   37:ireturn         
	}

	public ColorStateList getSupportBackgroundTintList()
	{
		AppCompatBackgroundHelper appcompatbackgroundhelper = mBackgroundTintHelper;
	//    0    0:aload_0         
	//    1    1:getfield        #41  <Field AppCompatBackgroundHelper mBackgroundTintHelper>
	//    2    4:astore_1        
		if(appcompatbackgroundhelper != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          14
			return appcompatbackgroundhelper.getSupportBackgroundTintList();
	//    5    9:aload_1         
	//    6   10:invokevirtual   #99  <Method ColorStateList AppCompatBackgroundHelper.getSupportBackgroundTintList()>
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
	//    1    1:getfield        #41  <Field AppCompatBackgroundHelper mBackgroundTintHelper>
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

	public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityevent)
	{
		super.onInitializeAccessibilityEvent(accessibilityevent);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #107 <Method void Button.onInitializeAccessibilityEvent(AccessibilityEvent)>
		accessibilityevent.setClassName(((CharSequence) (((Class) (android/widget/Button)).getName())));
	//    3    5:aload_1         
	//    4    6:ldc1            #4   <Class Button>
	//    5    8:invokevirtual   #113 <Method String Class.getName()>
	//    6   11:invokevirtual   #119 <Method void AccessibilityEvent.setClassName(CharSequence)>
	//    7   14:return          
	}

	public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilitynodeinfo)
	{
		super.onInitializeAccessibilityNodeInfo(accessibilitynodeinfo);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #123 <Method void Button.onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo)>
		accessibilitynodeinfo.setClassName(((CharSequence) (((Class) (android/widget/Button)).getName())));
	//    3    5:aload_1         
	//    4    6:ldc1            #4   <Class Button>
	//    5    8:invokevirtual   #113 <Method String Class.getName()>
	//    6   11:invokevirtual   #126 <Method void AccessibilityNodeInfo.setClassName(CharSequence)>
	//    7   14:return          
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
	//    6    8:invokespecial   #130 <Method void Button.onLayout(boolean, int, int, int, int)>
		AppCompatTextHelper appcompattexthelper = mTextHelper;
	//    7   11:aload_0         
	//    8   12:getfield        #52  <Field AppCompatTextHelper mTextHelper>
	//    9   15:astore          6
		if(appcompattexthelper != null)
	//*  10   17:aload           6
	//*  11   19:ifnull          34
			appcompattexthelper.onLayout(flag, i, j, k, l);
	//   12   22:aload           6
	//   13   24:iload_1         
	//   14   25:iload_2         
	//   15   26:iload_3         
	//   16   27:iload           4
	//   17   29:iload           5
	//   18   31:invokevirtual   #131 <Method void AppCompatTextHelper.onLayout(boolean, int, int, int, int)>
	//   19   34:return          
	}

	protected void onTextChanged(CharSequence charsequence, int i, int j, int k)
	{
		super.onTextChanged(charsequence, i, j, k);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:iload_3         
	//    4    4:iload           4
	//    5    6:invokespecial   #135 <Method void Button.onTextChanged(CharSequence, int, int, int)>
		if(mTextHelper != null && !PLATFORM_SUPPORTS_AUTOSIZE && mTextHelper.isAutoSizeEnabled())
	//*   6    9:aload_0         
	//*   7   10:getfield        #52  <Field AppCompatTextHelper mTextHelper>
	//*   8   13:ifnull          39
	//*   9   16:getstatic       #73  <Field boolean PLATFORM_SUPPORTS_AUTOSIZE>
	//*  10   19:ifne            39
	//*  11   22:aload_0         
	//*  12   23:getfield        #52  <Field AppCompatTextHelper mTextHelper>
	//*  13   26:invokevirtual   #139 <Method boolean AppCompatTextHelper.isAutoSizeEnabled()>
	//*  14   29:ifeq            39
			mTextHelper.autoSizeText();
	//   15   32:aload_0         
	//   16   33:getfield        #52  <Field AppCompatTextHelper mTextHelper>
	//   17   36:invokevirtual   #142 <Method void AppCompatTextHelper.autoSizeText()>
	//   18   39:return          
	}

	public void setAutoSizeTextTypeUniformWithConfiguration(int i, int j, int k, int l)
		throws IllegalArgumentException
	{
		if(PLATFORM_SUPPORTS_AUTOSIZE)
	//*   0    0:getstatic       #73  <Field boolean PLATFORM_SUPPORTS_AUTOSIZE>
	//*   1    3:ifeq            16
		{
			super.setAutoSizeTextTypeUniformWithConfiguration(i, j, k, l);
	//    2    6:aload_0         
	//    3    7:iload_1         
	//    4    8:iload_2         
	//    5    9:iload_3         
	//    6   10:iload           4
	//    7   12:invokespecial   #148 <Method void Button.setAutoSizeTextTypeUniformWithConfiguration(int, int, int, int)>
			return;
	//    8   15:return          
		}
		AppCompatTextHelper appcompattexthelper = mTextHelper;
	//    9   16:aload_0         
	//   10   17:getfield        #52  <Field AppCompatTextHelper mTextHelper>
	//   11   20:astore          5
		if(appcompattexthelper != null)
	//*  12   22:aload           5
	//*  13   24:ifnull          37
			appcompattexthelper.setAutoSizeTextTypeUniformWithConfiguration(i, j, k, l);
	//   14   27:aload           5
	//   15   29:iload_1         
	//   16   30:iload_2         
	//   17   31:iload_3         
	//   18   32:iload           4
	//   19   34:invokevirtual   #149 <Method void AppCompatTextHelper.setAutoSizeTextTypeUniformWithConfiguration(int, int, int, int)>
	//   20   37:return          
	}

	public void setAutoSizeTextTypeUniformWithPresetSizes(int ai[], int i)
		throws IllegalArgumentException
	{
		if(PLATFORM_SUPPORTS_AUTOSIZE)
	//*   0    0:getstatic       #73  <Field boolean PLATFORM_SUPPORTS_AUTOSIZE>
	//*   1    3:ifeq            13
		{
			super.setAutoSizeTextTypeUniformWithPresetSizes(ai, i);
	//    2    6:aload_0         
	//    3    7:aload_1         
	//    4    8:iload_2         
	//    5    9:invokespecial   #155 <Method void Button.setAutoSizeTextTypeUniformWithPresetSizes(int[], int)>
			return;
	//    6   12:return          
		}
		AppCompatTextHelper appcompattexthelper = mTextHelper;
	//    7   13:aload_0         
	//    8   14:getfield        #52  <Field AppCompatTextHelper mTextHelper>
	//    9   17:astore_3        
		if(appcompattexthelper != null)
	//*  10   18:aload_3         
	//*  11   19:ifnull          28
			appcompattexthelper.setAutoSizeTextTypeUniformWithPresetSizes(ai, i);
	//   12   22:aload_3         
	//   13   23:aload_1         
	//   14   24:iload_2         
	//   15   25:invokevirtual   #156 <Method void AppCompatTextHelper.setAutoSizeTextTypeUniformWithPresetSizes(int[], int)>
	//   16   28:return          
	}

	public void setAutoSizeTextTypeWithDefaults(int i)
	{
		if(PLATFORM_SUPPORTS_AUTOSIZE)
	//*   0    0:getstatic       #73  <Field boolean PLATFORM_SUPPORTS_AUTOSIZE>
	//*   1    3:ifeq            12
		{
			super.setAutoSizeTextTypeWithDefaults(i);
	//    2    6:aload_0         
	//    3    7:iload_1         
	//    4    8:invokespecial   #161 <Method void Button.setAutoSizeTextTypeWithDefaults(int)>
			return;
	//    5   11:return          
		}
		AppCompatTextHelper appcompattexthelper = mTextHelper;
	//    6   12:aload_0         
	//    7   13:getfield        #52  <Field AppCompatTextHelper mTextHelper>
	//    8   16:astore_2        
		if(appcompattexthelper != null)
	//*   9   17:aload_2         
	//*  10   18:ifnull          26
			appcompattexthelper.setAutoSizeTextTypeWithDefaults(i);
	//   11   21:aload_2         
	//   12   22:iload_1         
	//   13   23:invokevirtual   #162 <Method void AppCompatTextHelper.setAutoSizeTextTypeWithDefaults(int)>
	//   14   26:return          
	}

	public void setBackgroundDrawable(Drawable drawable)
	{
		super.setBackgroundDrawable(drawable);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #166 <Method void Button.setBackgroundDrawable(Drawable)>
		AppCompatBackgroundHelper appcompatbackgroundhelper = mBackgroundTintHelper;
	//    3    5:aload_0         
	//    4    6:getfield        #41  <Field AppCompatBackgroundHelper mBackgroundTintHelper>
	//    5    9:astore_2        
		if(appcompatbackgroundhelper != null)
	//*   6   10:aload_2         
	//*   7   11:ifnull          19
			appcompatbackgroundhelper.onSetBackgroundDrawable(drawable);
	//    8   14:aload_2         
	//    9   15:aload_1         
	//   10   16:invokevirtual   #169 <Method void AppCompatBackgroundHelper.onSetBackgroundDrawable(Drawable)>
	//   11   19:return          
	}

	public void setBackgroundResource(int i)
	{
		super.setBackgroundResource(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #173 <Method void Button.setBackgroundResource(int)>
		AppCompatBackgroundHelper appcompatbackgroundhelper = mBackgroundTintHelper;
	//    3    5:aload_0         
	//    4    6:getfield        #41  <Field AppCompatBackgroundHelper mBackgroundTintHelper>
	//    5    9:astore_2        
		if(appcompatbackgroundhelper != null)
	//*   6   10:aload_2         
	//*   7   11:ifnull          19
			appcompatbackgroundhelper.onSetBackgroundResource(i);
	//    8   14:aload_2         
	//    9   15:iload_1         
	//   10   16:invokevirtual   #176 <Method void AppCompatBackgroundHelper.onSetBackgroundResource(int)>
	//   11   19:return          
	}

	public void setCustomSelectionActionModeCallback(android.view.ActionMode.Callback callback)
	{
		super.setCustomSelectionActionModeCallback(TextViewCompat.wrapCustomSelectionActionModeCallback(((android.widget.TextView) (this)), callback));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:aload_1         
	//    3    3:invokestatic    #184 <Method android.view.ActionMode$Callback TextViewCompat.wrapCustomSelectionActionModeCallback(android.widget.TextView, android.view.ActionMode$Callback)>
	//    4    6:invokespecial   #186 <Method void Button.setCustomSelectionActionModeCallback(android.view.ActionMode$Callback)>
	//    5    9:return          
	}

	public void setSupportAllCaps(boolean flag)
	{
		AppCompatTextHelper appcompattexthelper = mTextHelper;
	//    0    0:aload_0         
	//    1    1:getfield        #52  <Field AppCompatTextHelper mTextHelper>
	//    2    4:astore_2        
		if(appcompattexthelper != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          14
			appcompattexthelper.setAllCaps(flag);
	//    5    9:aload_2         
	//    6   10:iload_1         
	//    7   11:invokevirtual   #191 <Method void AppCompatTextHelper.setAllCaps(boolean)>
	//    8   14:return          
	}

	public void setSupportBackgroundTintList(ColorStateList colorstatelist)
	{
		AppCompatBackgroundHelper appcompatbackgroundhelper = mBackgroundTintHelper;
	//    0    0:aload_0         
	//    1    1:getfield        #41  <Field AppCompatBackgroundHelper mBackgroundTintHelper>
	//    2    4:astore_2        
		if(appcompatbackgroundhelper != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          14
			appcompatbackgroundhelper.setSupportBackgroundTintList(colorstatelist);
	//    5    9:aload_2         
	//    6   10:aload_1         
	//    7   11:invokevirtual   #195 <Method void AppCompatBackgroundHelper.setSupportBackgroundTintList(ColorStateList)>
	//    8   14:return          
	}

	public void setSupportBackgroundTintMode(android.graphics.PorterDuff.Mode mode)
	{
		AppCompatBackgroundHelper appcompatbackgroundhelper = mBackgroundTintHelper;
	//    0    0:aload_0         
	//    1    1:getfield        #41  <Field AppCompatBackgroundHelper mBackgroundTintHelper>
	//    2    4:astore_2        
		if(appcompatbackgroundhelper != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          14
			appcompatbackgroundhelper.setSupportBackgroundTintMode(mode);
	//    5    9:aload_2         
	//    6   10:aload_1         
	//    7   11:invokevirtual   #199 <Method void AppCompatBackgroundHelper.setSupportBackgroundTintMode(android.graphics.PorterDuff$Mode)>
	//    8   14:return          
	}

	public void setTextAppearance(Context context, int i)
	{
		super.setTextAppearance(context, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #203 <Method void Button.setTextAppearance(Context, int)>
		AppCompatTextHelper appcompattexthelper = mTextHelper;
	//    4    6:aload_0         
	//    5    7:getfield        #52  <Field AppCompatTextHelper mTextHelper>
	//    6   10:astore_3        
		if(appcompattexthelper != null)
	//*   7   11:aload_3         
	//*   8   12:ifnull          21
			appcompattexthelper.onSetTextAppearance(context, i);
	//    9   15:aload_3         
	//   10   16:aload_1         
	//   11   17:iload_2         
	//   12   18:invokevirtual   #206 <Method void AppCompatTextHelper.onSetTextAppearance(Context, int)>
	//   13   21:return          
	}

	public void setTextSize(int i, float f)
	{
		if(PLATFORM_SUPPORTS_AUTOSIZE)
	//*   0    0:getstatic       #73  <Field boolean PLATFORM_SUPPORTS_AUTOSIZE>
	//*   1    3:ifeq            13
		{
			super.setTextSize(i, f);
	//    2    6:aload_0         
	//    3    7:iload_1         
	//    4    8:fload_2         
	//    5    9:invokespecial   #210 <Method void Button.setTextSize(int, float)>
			return;
	//    6   12:return          
		}
		AppCompatTextHelper appcompattexthelper = mTextHelper;
	//    7   13:aload_0         
	//    8   14:getfield        #52  <Field AppCompatTextHelper mTextHelper>
	//    9   17:astore_3        
		if(appcompattexthelper != null)
	//*  10   18:aload_3         
	//*  11   19:ifnull          28
			appcompattexthelper.setTextSize(i, f);
	//   12   22:aload_3         
	//   13   23:iload_1         
	//   14   24:fload_2         
	//   15   25:invokevirtual   #211 <Method void AppCompatTextHelper.setTextSize(int, float)>
	//   16   28:return          
	}

	private final AppCompatBackgroundHelper mBackgroundTintHelper;
	private final AppCompatTextHelper mTextHelper;
}

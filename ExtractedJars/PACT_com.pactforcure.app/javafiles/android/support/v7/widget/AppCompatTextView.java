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
import android.widget.TextView;

// Referenced classes of package android.support.v7.widget:
//			TintContextWrapper, AppCompatBackgroundHelper, AppCompatTextHelper

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
		if(android.os.Build.VERSION.SDK_INT >= 26)
	//*   0    0:getstatic       #71  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          26
	//*   2    5:icmplt          13
			return super.getAutoSizeMaxTextSize();
	//    3    8:aload_0         
	//    4    9:invokespecial   #73  <Method int TextView.getAutoSizeMaxTextSize()>
	//    5   12:ireturn         
		if(mTextHelper != null)
	//*   6   13:aload_0         
	//*   7   14:getfield        #48  <Field AppCompatTextHelper mTextHelper>
	//*   8   17:ifnull          28
			return mTextHelper.getAutoSizeMaxTextSize();
	//    9   20:aload_0         
	//   10   21:getfield        #48  <Field AppCompatTextHelper mTextHelper>
	//   11   24:invokevirtual   #74  <Method int AppCompatTextHelper.getAutoSizeMaxTextSize()>
	//   12   27:ireturn         
		else
			return -1;
	//   13   28:iconst_m1       
	//   14   29:ireturn         
	}

	public int getAutoSizeMinTextSize()
	{
		if(android.os.Build.VERSION.SDK_INT >= 26)
	//*   0    0:getstatic       #71  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          26
	//*   2    5:icmplt          13
			return super.getAutoSizeMinTextSize();
	//    3    8:aload_0         
	//    4    9:invokespecial   #78  <Method int TextView.getAutoSizeMinTextSize()>
	//    5   12:ireturn         
		if(mTextHelper != null)
	//*   6   13:aload_0         
	//*   7   14:getfield        #48  <Field AppCompatTextHelper mTextHelper>
	//*   8   17:ifnull          28
			return mTextHelper.getAutoSizeMinTextSize();
	//    9   20:aload_0         
	//   10   21:getfield        #48  <Field AppCompatTextHelper mTextHelper>
	//   11   24:invokevirtual   #79  <Method int AppCompatTextHelper.getAutoSizeMinTextSize()>
	//   12   27:ireturn         
		else
			return -1;
	//   13   28:iconst_m1       
	//   14   29:ireturn         
	}

	public int getAutoSizeStepGranularity()
	{
		if(android.os.Build.VERSION.SDK_INT >= 26)
	//*   0    0:getstatic       #71  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          26
	//*   2    5:icmplt          13
			return super.getAutoSizeStepGranularity();
	//    3    8:aload_0         
	//    4    9:invokespecial   #82  <Method int TextView.getAutoSizeStepGranularity()>
	//    5   12:ireturn         
		if(mTextHelper != null)
	//*   6   13:aload_0         
	//*   7   14:getfield        #48  <Field AppCompatTextHelper mTextHelper>
	//*   8   17:ifnull          28
			return mTextHelper.getAutoSizeStepGranularity();
	//    9   20:aload_0         
	//   10   21:getfield        #48  <Field AppCompatTextHelper mTextHelper>
	//   11   24:invokevirtual   #83  <Method int AppCompatTextHelper.getAutoSizeStepGranularity()>
	//   12   27:ireturn         
		else
			return -1;
	//   13   28:iconst_m1       
	//   14   29:ireturn         
	}

	public int[] getAutoSizeTextAvailableSizes()
	{
		if(android.os.Build.VERSION.SDK_INT >= 26)
	//*   0    0:getstatic       #71  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          26
	//*   2    5:icmplt          13
			return super.getAutoSizeTextAvailableSizes();
	//    3    8:aload_0         
	//    4    9:invokespecial   #87  <Method int[] TextView.getAutoSizeTextAvailableSizes()>
	//    5   12:areturn         
		if(mTextHelper != null)
	//*   6   13:aload_0         
	//*   7   14:getfield        #48  <Field AppCompatTextHelper mTextHelper>
	//*   8   17:ifnull          28
			return mTextHelper.getAutoSizeTextAvailableSizes();
	//    9   20:aload_0         
	//   10   21:getfield        #48  <Field AppCompatTextHelper mTextHelper>
	//   11   24:invokevirtual   #88  <Method int[] AppCompatTextHelper.getAutoSizeTextAvailableSizes()>
	//   12   27:areturn         
		else
			return new int[0];
	//   13   28:iconst_0        
	//   14   29:newarray        int[]
	//   15   31:areturn         
	}

	public int getAutoSizeTextType()
	{
		if(android.os.Build.VERSION.SDK_INT >= 26)
	//*   0    0:getstatic       #71  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          26
	//*   2    5:icmplt          20
			return super.getAutoSizeTextType() != 1 ? 0 : 1;
	//    3    8:aload_0         
	//    4    9:invokespecial   #91  <Method int TextView.getAutoSizeTextType()>
	//    5   12:iconst_1        
	//    6   13:icmpne          18
	//    7   16:iconst_1        
	//    8   17:ireturn         
	//    9   18:iconst_0        
	//   10   19:ireturn         
		if(mTextHelper != null)
	//*  11   20:aload_0         
	//*  12   21:getfield        #48  <Field AppCompatTextHelper mTextHelper>
	//*  13   24:ifnull          35
			return mTextHelper.getAutoSizeTextType();
	//   14   27:aload_0         
	//   15   28:getfield        #48  <Field AppCompatTextHelper mTextHelper>
	//   16   31:invokevirtual   #92  <Method int AppCompatTextHelper.getAutoSizeTextType()>
	//   17   34:ireturn         
		else
			return 0;
	//   18   35:iconst_0        
	//   19   36:ireturn         
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
	//    5   11:invokevirtual   #97  <Method ColorStateList AppCompatBackgroundHelper.getSupportBackgroundTintList()>
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
	//    5   11:invokevirtual   #101 <Method android.graphics.PorterDuff$Mode AppCompatBackgroundHelper.getSupportBackgroundTintMode()>
	//    6   14:areturn         
		else
			return null;
	//    7   15:aconst_null     
	//    8   16:areturn         
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
	//    6    8:invokespecial   #105 <Method void TextView.onLayout(boolean, int, int, int, int)>
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
	//   17   29:invokevirtual   #106 <Method void AppCompatTextHelper.onLayout(boolean, int, int, int, int)>
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
	//    5    6:invokespecial   #110 <Method void TextView.onTextChanged(CharSequence, int, int, int)>
		if(mTextHelper != null && android.os.Build.VERSION.SDK_INT < 26 && mTextHelper.isAutoSizeEnabled())
	//*   6    9:aload_0         
	//*   7   10:getfield        #48  <Field AppCompatTextHelper mTextHelper>
	//*   8   13:ifnull          41
	//*   9   16:getstatic       #71  <Field int android.os.Build$VERSION.SDK_INT>
	//*  10   19:bipush          26
	//*  11   21:icmpge          41
	//*  12   24:aload_0         
	//*  13   25:getfield        #48  <Field AppCompatTextHelper mTextHelper>
	//*  14   28:invokevirtual   #114 <Method boolean AppCompatTextHelper.isAutoSizeEnabled()>
	//*  15   31:ifeq            41
			mTextHelper.autoSizeText();
	//   16   34:aload_0         
	//   17   35:getfield        #48  <Field AppCompatTextHelper mTextHelper>
	//   18   38:invokevirtual   #117 <Method void AppCompatTextHelper.autoSizeText()>
	//   19   41:return          
	}

	public void setAutoSizeTextTypeUniformWithConfiguration(int i, int j, int k, int l)
		throws IllegalArgumentException
	{
		if(android.os.Build.VERSION.SDK_INT >= 26)
	//*   0    0:getstatic       #71  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          26
	//*   2    5:icmplt          18
			super.setAutoSizeTextTypeUniformWithConfiguration(i, j, k, l);
	//    3    8:aload_0         
	//    4    9:iload_1         
	//    5   10:iload_2         
	//    6   11:iload_3         
	//    7   12:iload           4
	//    8   14:invokespecial   #123 <Method void TextView.setAutoSizeTextTypeUniformWithConfiguration(int, int, int, int)>
		else
	//*   9   17:return          
		if(mTextHelper != null)
	//*  10   18:aload_0         
	//*  11   19:getfield        #48  <Field AppCompatTextHelper mTextHelper>
	//*  12   22:ifnull          17
		{
			mTextHelper.setAutoSizeTextTypeUniformWithConfiguration(i, j, k, l);
	//   13   25:aload_0         
	//   14   26:getfield        #48  <Field AppCompatTextHelper mTextHelper>
	//   15   29:iload_1         
	//   16   30:iload_2         
	//   17   31:iload_3         
	//   18   32:iload           4
	//   19   34:invokevirtual   #124 <Method void AppCompatTextHelper.setAutoSizeTextTypeUniformWithConfiguration(int, int, int, int)>
			return;
	//   20   37:return          
		}
	}

	public void setAutoSizeTextTypeUniformWithPresetSizes(int ai[], int i)
		throws IllegalArgumentException
	{
		if(android.os.Build.VERSION.SDK_INT >= 26)
	//*   0    0:getstatic       #71  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          26
	//*   2    5:icmplt          15
			super.setAutoSizeTextTypeUniformWithPresetSizes(ai, i);
	//    3    8:aload_0         
	//    4    9:aload_1         
	//    5   10:iload_2         
	//    6   11:invokespecial   #130 <Method void TextView.setAutoSizeTextTypeUniformWithPresetSizes(int[], int)>
		else
	//*   7   14:return          
		if(mTextHelper != null)
	//*   8   15:aload_0         
	//*   9   16:getfield        #48  <Field AppCompatTextHelper mTextHelper>
	//*  10   19:ifnull          14
		{
			mTextHelper.setAutoSizeTextTypeUniformWithPresetSizes(ai, i);
	//   11   22:aload_0         
	//   12   23:getfield        #48  <Field AppCompatTextHelper mTextHelper>
	//   13   26:aload_1         
	//   14   27:iload_2         
	//   15   28:invokevirtual   #131 <Method void AppCompatTextHelper.setAutoSizeTextTypeUniformWithPresetSizes(int[], int)>
			return;
	//   16   31:return          
		}
	}

	public void setAutoSizeTextTypeWithDefaults(int i)
	{
		if(android.os.Build.VERSION.SDK_INT >= 26)
	//*   0    0:getstatic       #71  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          26
	//*   2    5:icmplt          14
			super.setAutoSizeTextTypeWithDefaults(i);
	//    3    8:aload_0         
	//    4    9:iload_1         
	//    5   10:invokespecial   #136 <Method void TextView.setAutoSizeTextTypeWithDefaults(int)>
		else
	//*   6   13:return          
		if(mTextHelper != null)
	//*   7   14:aload_0         
	//*   8   15:getfield        #48  <Field AppCompatTextHelper mTextHelper>
	//*   9   18:ifnull          13
		{
			mTextHelper.setAutoSizeTextTypeWithDefaults(i);
	//   10   21:aload_0         
	//   11   22:getfield        #48  <Field AppCompatTextHelper mTextHelper>
	//   12   25:iload_1         
	//   13   26:invokevirtual   #137 <Method void AppCompatTextHelper.setAutoSizeTextTypeWithDefaults(int)>
			return;
	//   14   29:return          
		}
	}

	public void setBackgroundDrawable(Drawable drawable)
	{
		super.setBackgroundDrawable(drawable);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #141 <Method void TextView.setBackgroundDrawable(Drawable)>
		if(mBackgroundTintHelper != null)
	//*   3    5:aload_0         
	//*   4    6:getfield        #36  <Field AppCompatBackgroundHelper mBackgroundTintHelper>
	//*   5    9:ifnull          20
			mBackgroundTintHelper.onSetBackgroundDrawable(drawable);
	//    6   12:aload_0         
	//    7   13:getfield        #36  <Field AppCompatBackgroundHelper mBackgroundTintHelper>
	//    8   16:aload_1         
	//    9   17:invokevirtual   #144 <Method void AppCompatBackgroundHelper.onSetBackgroundDrawable(Drawable)>
	//   10   20:return          
	}

	public void setBackgroundResource(int i)
	{
		super.setBackgroundResource(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #148 <Method void TextView.setBackgroundResource(int)>
		if(mBackgroundTintHelper != null)
	//*   3    5:aload_0         
	//*   4    6:getfield        #36  <Field AppCompatBackgroundHelper mBackgroundTintHelper>
	//*   5    9:ifnull          20
			mBackgroundTintHelper.onSetBackgroundResource(i);
	//    6   12:aload_0         
	//    7   13:getfield        #36  <Field AppCompatBackgroundHelper mBackgroundTintHelper>
	//    8   16:iload_1         
	//    9   17:invokevirtual   #151 <Method void AppCompatBackgroundHelper.onSetBackgroundResource(int)>
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
	//    6   12:invokevirtual   #155 <Method void AppCompatBackgroundHelper.setSupportBackgroundTintList(ColorStateList)>
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
	//    6   12:invokevirtual   #159 <Method void AppCompatBackgroundHelper.setSupportBackgroundTintMode(android.graphics.PorterDuff$Mode)>
	//    7   15:return          
	}

	public void setTextAppearance(Context context, int i)
	{
		super.setTextAppearance(context, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #163 <Method void TextView.setTextAppearance(Context, int)>
		if(mTextHelper != null)
	//*   4    6:aload_0         
	//*   5    7:getfield        #48  <Field AppCompatTextHelper mTextHelper>
	//*   6   10:ifnull          22
			mTextHelper.onSetTextAppearance(context, i);
	//    7   13:aload_0         
	//    8   14:getfield        #48  <Field AppCompatTextHelper mTextHelper>
	//    9   17:aload_1         
	//   10   18:iload_2         
	//   11   19:invokevirtual   #166 <Method void AppCompatTextHelper.onSetTextAppearance(Context, int)>
	//   12   22:return          
	}

	public void setTextSize(int i, float f)
	{
		if(android.os.Build.VERSION.SDK_INT >= 26)
	//*   0    0:getstatic       #71  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          26
	//*   2    5:icmplt          15
			super.setTextSize(i, f);
	//    3    8:aload_0         
	//    4    9:iload_1         
	//    5   10:fload_2         
	//    6   11:invokespecial   #170 <Method void TextView.setTextSize(int, float)>
		else
	//*   7   14:return          
		if(mTextHelper != null)
	//*   8   15:aload_0         
	//*   9   16:getfield        #48  <Field AppCompatTextHelper mTextHelper>
	//*  10   19:ifnull          14
		{
			mTextHelper.setTextSize(i, f);
	//   11   22:aload_0         
	//   12   23:getfield        #48  <Field AppCompatTextHelper mTextHelper>
	//   13   26:iload_1         
	//   14   27:fload_2         
	//   15   28:invokevirtual   #171 <Method void AppCompatTextHelper.setTextSize(int, float)>
			return;
	//   16   31:return          
		}
	}

	private final AppCompatBackgroundHelper mBackgroundTintHelper;
	private final AppCompatTextHelper mTextHelper;
}

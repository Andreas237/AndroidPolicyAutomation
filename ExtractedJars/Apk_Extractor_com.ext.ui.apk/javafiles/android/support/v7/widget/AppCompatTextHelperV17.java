// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.TextView;

// Referenced classes of package android.support.v7.widget:
//			AppCompatTextHelper, AppCompatDrawableManager, TintInfo

class AppCompatTextHelperV17 extends AppCompatTextHelper
{

	AppCompatTextHelperV17(TextView textview)
	{
		super(textview);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #14  <Method void AppCompatTextHelper(TextView)>
	//    3    5:return          
	}

	void applyCompoundDrawablesTints()
	{
		super.applyCompoundDrawablesTints();
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void AppCompatTextHelper.applyCompoundDrawablesTints()>
		if(mDrawableStartTint != null || mDrawableEndTint != null)
	//*   2    4:aload_0         
	//*   3    5:getfield        #21  <Field TintInfo mDrawableStartTint>
	//*   4    8:ifnonnull       18
	//*   5   11:aload_0         
	//*   6   12:getfield        #23  <Field TintInfo mDrawableEndTint>
	//*   7   15:ifnull          48
		{
			android.graphics.drawable.Drawable adrawable[] = mView.getCompoundDrawablesRelative();
	//    8   18:aload_0         
	//    9   19:getfield        #27  <Field TextView mView>
	//   10   22:invokevirtual   #33  <Method android.graphics.drawable.Drawable[] TextView.getCompoundDrawablesRelative()>
	//   11   25:astore_1        
			applyCompoundDrawableTint(adrawable[0], mDrawableStartTint);
	//   12   26:aload_0         
	//   13   27:aload_1         
	//   14   28:iconst_0        
	//   15   29:aaload          
	//   16   30:aload_0         
	//   17   31:getfield        #21  <Field TintInfo mDrawableStartTint>
	//   18   34:invokevirtual   #37  <Method void applyCompoundDrawableTint(android.graphics.drawable.Drawable, TintInfo)>
			applyCompoundDrawableTint(adrawable[2], mDrawableEndTint);
	//   19   37:aload_0         
	//   20   38:aload_1         
	//   21   39:iconst_2        
	//   22   40:aaload          
	//   23   41:aload_0         
	//   24   42:getfield        #23  <Field TintInfo mDrawableEndTint>
	//   25   45:invokevirtual   #37  <Method void applyCompoundDrawableTint(android.graphics.drawable.Drawable, TintInfo)>
		}
	//   26   48:return          
	}

	void loadFromAttributes(AttributeSet attributeset, int i)
	{
		super.loadFromAttributes(attributeset, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #41  <Method void AppCompatTextHelper.loadFromAttributes(AttributeSet, int)>
		Context context = mView.getContext();
	//    4    6:aload_0         
	//    5    7:getfield        #27  <Field TextView mView>
	//    6   10:invokevirtual   #45  <Method Context TextView.getContext()>
	//    7   13:astore_3        
		AppCompatDrawableManager appcompatdrawablemanager = AppCompatDrawableManager.get();
	//    8   14:invokestatic    #51  <Method AppCompatDrawableManager AppCompatDrawableManager.get()>
	//    9   17:astore          4
		attributeset = ((AttributeSet) (context.obtainStyledAttributes(attributeset, android.support.v7.appcompat.R.styleable.AppCompatTextHelper, i, 0)));
	//   10   19:aload_3         
	//   11   20:aload_1         
	//   12   21:getstatic       #57  <Field int[] android.support.v7.appcompat.R$styleable.AppCompatTextHelper>
	//   13   24:iload_2         
	//   14   25:iconst_0        
	//   15   26:invokevirtual   #63  <Method TypedArray Context.obtainStyledAttributes(AttributeSet, int[], int, int)>
	//   16   29:astore_1        
		if(((TypedArray) (attributeset)).hasValue(android.support.v7.appcompat.R.styleable.AppCompatTextHelper_android_drawableStart))
	//*  17   30:aload_1         
	//*  18   31:getstatic       #67  <Field int android.support.v7.appcompat.R$styleable.AppCompatTextHelper_android_drawableStart>
	//*  19   34:invokevirtual   #73  <Method boolean TypedArray.hasValue(int)>
	//*  20   37:ifeq            58
			mDrawableStartTint = createTintInfo(context, appcompatdrawablemanager, ((TypedArray) (attributeset)).getResourceId(android.support.v7.appcompat.R.styleable.AppCompatTextHelper_android_drawableStart, 0));
	//   21   40:aload_0         
	//   22   41:aload_3         
	//   23   42:aload           4
	//   24   44:aload_1         
	//   25   45:getstatic       #67  <Field int android.support.v7.appcompat.R$styleable.AppCompatTextHelper_android_drawableStart>
	//   26   48:iconst_0        
	//   27   49:invokevirtual   #77  <Method int TypedArray.getResourceId(int, int)>
	//   28   52:invokestatic    #81  <Method TintInfo createTintInfo(Context, AppCompatDrawableManager, int)>
	//   29   55:putfield        #21  <Field TintInfo mDrawableStartTint>
		if(((TypedArray) (attributeset)).hasValue(android.support.v7.appcompat.R.styleable.AppCompatTextHelper_android_drawableEnd))
	//*  30   58:aload_1         
	//*  31   59:getstatic       #84  <Field int android.support.v7.appcompat.R$styleable.AppCompatTextHelper_android_drawableEnd>
	//*  32   62:invokevirtual   #73  <Method boolean TypedArray.hasValue(int)>
	//*  33   65:ifeq            86
			mDrawableEndTint = createTintInfo(context, appcompatdrawablemanager, ((TypedArray) (attributeset)).getResourceId(android.support.v7.appcompat.R.styleable.AppCompatTextHelper_android_drawableEnd, 0));
	//   34   68:aload_0         
	//   35   69:aload_3         
	//   36   70:aload           4
	//   37   72:aload_1         
	//   38   73:getstatic       #84  <Field int android.support.v7.appcompat.R$styleable.AppCompatTextHelper_android_drawableEnd>
	//   39   76:iconst_0        
	//   40   77:invokevirtual   #77  <Method int TypedArray.getResourceId(int, int)>
	//   41   80:invokestatic    #81  <Method TintInfo createTintInfo(Context, AppCompatDrawableManager, int)>
	//   42   83:putfield        #23  <Field TintInfo mDrawableEndTint>
		((TypedArray) (attributeset)).recycle();
	//   43   86:aload_1         
	//   44   87:invokevirtual   #87  <Method void TypedArray.recycle()>
	//   45   90:return          
	}

	private TintInfo mDrawableEndTint;
	private TintInfo mDrawableStartTint;
}

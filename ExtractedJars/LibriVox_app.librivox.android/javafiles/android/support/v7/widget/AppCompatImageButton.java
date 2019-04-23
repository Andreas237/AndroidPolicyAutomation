// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.support.v4.view.ab;
import android.support.v4.widget.ak;
import android.util.AttributeSet;
import android.widget.ImageButton;

// Referenced classes of package android.support.v7.widget:
//			TintContextWrapper, AppCompatBackgroundHelper, AppCompatImageHelper

public class AppCompatImageButton extends ImageButton
	implements ab, ak
{

	public AppCompatImageButton(Context context)
	{
		this(context, ((AttributeSet) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:invokespecial   #17  <Method void AppCompatImageButton(Context, AttributeSet)>
	//    4    6:return          
	}

	public AppCompatImageButton(Context context, AttributeSet attributeset)
	{
		this(context, attributeset, android.support.v7.appcompat.R.attr.imageButtonStyle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:getstatic       #24  <Field int android.support.v7.appcompat.R$attr.imageButtonStyle>
	//    4    6:invokespecial   #27  <Method void AppCompatImageButton(Context, AttributeSet, int)>
	//    5    9:return          
	}

	public AppCompatImageButton(Context context, AttributeSet attributeset, int i)
	{
		super(TintContextWrapper.wrap(context), attributeset, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #33  <Method Context TintContextWrapper.wrap(Context)>
	//    3    5:aload_2         
	//    4    6:iload_3         
	//    5    7:invokespecial   #34  <Method void ImageButton(Context, AttributeSet, int)>
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
		mImageHelper = new AppCompatImageHelper(((android.widget.ImageView) (this)));
	//   17   31:aload_0         
	//   18   32:new             #47  <Class AppCompatImageHelper>
	//   19   35:dup             
	//   20   36:aload_0         
	//   21   37:invokespecial   #50  <Method void AppCompatImageHelper(android.widget.ImageView)>
	//   22   40:putfield        #52  <Field AppCompatImageHelper mImageHelper>
		mImageHelper.loadFromAttributes(attributeset, i);
	//   23   43:aload_0         
	//   24   44:getfield        #52  <Field AppCompatImageHelper mImageHelper>
	//   25   47:aload_2         
	//   26   48:iload_3         
	//   27   49:invokevirtual   #53  <Method void AppCompatImageHelper.loadFromAttributes(AttributeSet, int)>
	//   28   52:return          
	}

	protected void drawableStateChanged()
	{
		super.drawableStateChanged();
	//    0    0:aload_0         
	//    1    1:invokespecial   #57  <Method void ImageButton.drawableStateChanged()>
		Object obj = ((Object) (mBackgroundTintHelper));
	//    2    4:aload_0         
	//    3    5:getfield        #41  <Field AppCompatBackgroundHelper mBackgroundTintHelper>
	//    4    8:astore_1        
		if(obj != null)
	//*   5    9:aload_1         
	//*   6   10:ifnull          17
			((AppCompatBackgroundHelper) (obj)).applySupportBackgroundTint();
	//    7   13:aload_1         
	//    8   14:invokevirtual   #60  <Method void AppCompatBackgroundHelper.applySupportBackgroundTint()>
		obj = ((Object) (mImageHelper));
	//    9   17:aload_0         
	//   10   18:getfield        #52  <Field AppCompatImageHelper mImageHelper>
	//   11   21:astore_1        
		if(obj != null)
	//*  12   22:aload_1         
	//*  13   23:ifnull          30
			((AppCompatImageHelper) (obj)).applySupportImageTint();
	//   14   26:aload_1         
	//   15   27:invokevirtual   #63  <Method void AppCompatImageHelper.applySupportImageTint()>
	//   16   30:return          
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
	//    6   10:invokevirtual   #67  <Method ColorStateList AppCompatBackgroundHelper.getSupportBackgroundTintList()>
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
	//    6   10:invokevirtual   #71  <Method android.graphics.PorterDuff$Mode AppCompatBackgroundHelper.getSupportBackgroundTintMode()>
	//    7   13:areturn         
		else
			return null;
	//    8   14:aconst_null     
	//    9   15:areturn         
	}

	public ColorStateList getSupportImageTintList()
	{
		AppCompatImageHelper appcompatimagehelper = mImageHelper;
	//    0    0:aload_0         
	//    1    1:getfield        #52  <Field AppCompatImageHelper mImageHelper>
	//    2    4:astore_1        
		if(appcompatimagehelper != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          14
			return appcompatimagehelper.getSupportImageTintList();
	//    5    9:aload_1         
	//    6   10:invokevirtual   #74  <Method ColorStateList AppCompatImageHelper.getSupportImageTintList()>
	//    7   13:areturn         
		else
			return null;
	//    8   14:aconst_null     
	//    9   15:areturn         
	}

	public android.graphics.PorterDuff.Mode getSupportImageTintMode()
	{
		AppCompatImageHelper appcompatimagehelper = mImageHelper;
	//    0    0:aload_0         
	//    1    1:getfield        #52  <Field AppCompatImageHelper mImageHelper>
	//    2    4:astore_1        
		if(appcompatimagehelper != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          14
			return appcompatimagehelper.getSupportImageTintMode();
	//    5    9:aload_1         
	//    6   10:invokevirtual   #77  <Method android.graphics.PorterDuff$Mode AppCompatImageHelper.getSupportImageTintMode()>
	//    7   13:areturn         
		else
			return null;
	//    8   14:aconst_null     
	//    9   15:areturn         
	}

	public boolean hasOverlappingRendering()
	{
		return mImageHelper.hasOverlappingRendering() && super.hasOverlappingRendering();
	//    0    0:aload_0         
	//    1    1:getfield        #52  <Field AppCompatImageHelper mImageHelper>
	//    2    4:invokevirtual   #81  <Method boolean AppCompatImageHelper.hasOverlappingRendering()>
	//    3    7:ifeq            19
	//    4   10:aload_0         
	//    5   11:invokespecial   #82  <Method boolean ImageButton.hasOverlappingRendering()>
	//    6   14:ifeq            19
	//    7   17:iconst_1        
	//    8   18:ireturn         
	//    9   19:iconst_0        
	//   10   20:ireturn         
	}

	public void setBackgroundDrawable(Drawable drawable)
	{
		super.setBackgroundDrawable(drawable);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #86  <Method void ImageButton.setBackgroundDrawable(Drawable)>
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
	//   10   16:invokevirtual   #89  <Method void AppCompatBackgroundHelper.onSetBackgroundDrawable(Drawable)>
	//   11   19:return          
	}

	public void setBackgroundResource(int i)
	{
		super.setBackgroundResource(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #93  <Method void ImageButton.setBackgroundResource(int)>
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
	//   10   16:invokevirtual   #96  <Method void AppCompatBackgroundHelper.onSetBackgroundResource(int)>
	//   11   19:return          
	}

	public void setImageBitmap(Bitmap bitmap)
	{
		super.setImageBitmap(bitmap);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #100 <Method void ImageButton.setImageBitmap(Bitmap)>
		bitmap = ((Bitmap) (mImageHelper));
	//    3    5:aload_0         
	//    4    6:getfield        #52  <Field AppCompatImageHelper mImageHelper>
	//    5    9:astore_1        
		if(bitmap != null)
	//*   6   10:aload_1         
	//*   7   11:ifnull          18
			((AppCompatImageHelper) (bitmap)).applySupportImageTint();
	//    8   14:aload_1         
	//    9   15:invokevirtual   #63  <Method void AppCompatImageHelper.applySupportImageTint()>
	//   10   18:return          
	}

	public void setImageDrawable(Drawable drawable)
	{
		super.setImageDrawable(drawable);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #103 <Method void ImageButton.setImageDrawable(Drawable)>
		drawable = ((Drawable) (mImageHelper));
	//    3    5:aload_0         
	//    4    6:getfield        #52  <Field AppCompatImageHelper mImageHelper>
	//    5    9:astore_1        
		if(drawable != null)
	//*   6   10:aload_1         
	//*   7   11:ifnull          18
			((AppCompatImageHelper) (drawable)).applySupportImageTint();
	//    8   14:aload_1         
	//    9   15:invokevirtual   #63  <Method void AppCompatImageHelper.applySupportImageTint()>
	//   10   18:return          
	}

	public void setImageResource(int i)
	{
		mImageHelper.setImageResource(i);
	//    0    0:aload_0         
	//    1    1:getfield        #52  <Field AppCompatImageHelper mImageHelper>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #106 <Method void AppCompatImageHelper.setImageResource(int)>
	//    4    8:return          
	}

	public void setImageURI(Uri uri)
	{
		super.setImageURI(uri);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #110 <Method void ImageButton.setImageURI(Uri)>
		uri = ((Uri) (mImageHelper));
	//    3    5:aload_0         
	//    4    6:getfield        #52  <Field AppCompatImageHelper mImageHelper>
	//    5    9:astore_1        
		if(uri != null)
	//*   6   10:aload_1         
	//*   7   11:ifnull          18
			((AppCompatImageHelper) (uri)).applySupportImageTint();
	//    8   14:aload_1         
	//    9   15:invokevirtual   #63  <Method void AppCompatImageHelper.applySupportImageTint()>
	//   10   18:return          
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
	//    7   11:invokevirtual   #114 <Method void AppCompatBackgroundHelper.setSupportBackgroundTintList(ColorStateList)>
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
	//    7   11:invokevirtual   #118 <Method void AppCompatBackgroundHelper.setSupportBackgroundTintMode(android.graphics.PorterDuff$Mode)>
	//    8   14:return          
	}

	public void setSupportImageTintList(ColorStateList colorstatelist)
	{
		AppCompatImageHelper appcompatimagehelper = mImageHelper;
	//    0    0:aload_0         
	//    1    1:getfield        #52  <Field AppCompatImageHelper mImageHelper>
	//    2    4:astore_2        
		if(appcompatimagehelper != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          14
			appcompatimagehelper.setSupportImageTintList(colorstatelist);
	//    5    9:aload_2         
	//    6   10:aload_1         
	//    7   11:invokevirtual   #121 <Method void AppCompatImageHelper.setSupportImageTintList(ColorStateList)>
	//    8   14:return          
	}

	public void setSupportImageTintMode(android.graphics.PorterDuff.Mode mode)
	{
		AppCompatImageHelper appcompatimagehelper = mImageHelper;
	//    0    0:aload_0         
	//    1    1:getfield        #52  <Field AppCompatImageHelper mImageHelper>
	//    2    4:astore_2        
		if(appcompatimagehelper != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          14
			appcompatimagehelper.setSupportImageTintMode(mode);
	//    5    9:aload_2         
	//    6   10:aload_1         
	//    7   11:invokevirtual   #124 <Method void AppCompatImageHelper.setSupportImageTintMode(android.graphics.PorterDuff$Mode)>
	//    8   14:return          
	}

	private final AppCompatBackgroundHelper mBackgroundTintHelper;
	private final AppCompatImageHelper mImageHelper;
}

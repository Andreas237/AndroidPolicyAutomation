// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.support.v4.view.TintableBackgroundView;
import android.support.v4.widget.TintableImageSourceView;
import android.util.AttributeSet;
import android.widget.ImageButton;

// Referenced classes of package android.support.v7.widget:
//			TintContextWrapper, AppCompatBackgroundHelper, AppCompatImageHelper

public class AppCompatImageButton extends ImageButton
	implements TintableBackgroundView, TintableImageSourceView
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
		if(mBackgroundTintHelper != null)
	//*   2    4:aload_0         
	//*   3    5:getfield        #41  <Field AppCompatBackgroundHelper mBackgroundTintHelper>
	//*   4    8:ifnull          18
			mBackgroundTintHelper.applySupportBackgroundTint();
	//    5   11:aload_0         
	//    6   12:getfield        #41  <Field AppCompatBackgroundHelper mBackgroundTintHelper>
	//    7   15:invokevirtual   #60  <Method void AppCompatBackgroundHelper.applySupportBackgroundTint()>
		if(mImageHelper != null)
	//*   8   18:aload_0         
	//*   9   19:getfield        #52  <Field AppCompatImageHelper mImageHelper>
	//*  10   22:ifnull          32
			mImageHelper.applySupportImageTint();
	//   11   25:aload_0         
	//   12   26:getfield        #52  <Field AppCompatImageHelper mImageHelper>
	//   13   29:invokevirtual   #63  <Method void AppCompatImageHelper.applySupportImageTint()>
	//   14   32:return          
	}

	public ColorStateList getSupportBackgroundTintList()
	{
		if(mBackgroundTintHelper != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #41  <Field AppCompatBackgroundHelper mBackgroundTintHelper>
	//*   2    4:ifnull          15
			return mBackgroundTintHelper.getSupportBackgroundTintList();
	//    3    7:aload_0         
	//    4    8:getfield        #41  <Field AppCompatBackgroundHelper mBackgroundTintHelper>
	//    5   11:invokevirtual   #72  <Method ColorStateList AppCompatBackgroundHelper.getSupportBackgroundTintList()>
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
	//*   1    1:getfield        #41  <Field AppCompatBackgroundHelper mBackgroundTintHelper>
	//*   2    4:ifnull          15
			return mBackgroundTintHelper.getSupportBackgroundTintMode();
	//    3    7:aload_0         
	//    4    8:getfield        #41  <Field AppCompatBackgroundHelper mBackgroundTintHelper>
	//    5   11:invokevirtual   #77  <Method android.graphics.PorterDuff$Mode AppCompatBackgroundHelper.getSupportBackgroundTintMode()>
	//    6   14:areturn         
		else
			return null;
	//    7   15:aconst_null     
	//    8   16:areturn         
	}

	public ColorStateList getSupportImageTintList()
	{
		if(mImageHelper != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #52  <Field AppCompatImageHelper mImageHelper>
	//*   2    4:ifnull          15
			return mImageHelper.getSupportImageTintList();
	//    3    7:aload_0         
	//    4    8:getfield        #52  <Field AppCompatImageHelper mImageHelper>
	//    5   11:invokevirtual   #80  <Method ColorStateList AppCompatImageHelper.getSupportImageTintList()>
	//    6   14:areturn         
		else
			return null;
	//    7   15:aconst_null     
	//    8   16:areturn         
	}

	public android.graphics.PorterDuff.Mode getSupportImageTintMode()
	{
		if(mImageHelper != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #52  <Field AppCompatImageHelper mImageHelper>
	//*   2    4:ifnull          15
			return mImageHelper.getSupportImageTintMode();
	//    3    7:aload_0         
	//    4    8:getfield        #52  <Field AppCompatImageHelper mImageHelper>
	//    5   11:invokevirtual   #83  <Method android.graphics.PorterDuff$Mode AppCompatImageHelper.getSupportImageTintMode()>
	//    6   14:areturn         
		else
			return null;
	//    7   15:aconst_null     
	//    8   16:areturn         
	}

	public boolean hasOverlappingRendering()
	{
		return mImageHelper.hasOverlappingRendering() && super.hasOverlappingRendering();
	//    0    0:aload_0         
	//    1    1:getfield        #52  <Field AppCompatImageHelper mImageHelper>
	//    2    4:invokevirtual   #87  <Method boolean AppCompatImageHelper.hasOverlappingRendering()>
	//    3    7:ifeq            19
	//    4   10:aload_0         
	//    5   11:invokespecial   #88  <Method boolean ImageButton.hasOverlappingRendering()>
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
	//    2    2:invokespecial   #92  <Method void ImageButton.setBackgroundDrawable(Drawable)>
		if(mBackgroundTintHelper != null)
	//*   3    5:aload_0         
	//*   4    6:getfield        #41  <Field AppCompatBackgroundHelper mBackgroundTintHelper>
	//*   5    9:ifnull          20
			mBackgroundTintHelper.onSetBackgroundDrawable(drawable);
	//    6   12:aload_0         
	//    7   13:getfield        #41  <Field AppCompatBackgroundHelper mBackgroundTintHelper>
	//    8   16:aload_1         
	//    9   17:invokevirtual   #95  <Method void AppCompatBackgroundHelper.onSetBackgroundDrawable(Drawable)>
	//   10   20:return          
	}

	public void setBackgroundResource(int i)
	{
		super.setBackgroundResource(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #100 <Method void ImageButton.setBackgroundResource(int)>
		if(mBackgroundTintHelper != null)
	//*   3    5:aload_0         
	//*   4    6:getfield        #41  <Field AppCompatBackgroundHelper mBackgroundTintHelper>
	//*   5    9:ifnull          20
			mBackgroundTintHelper.onSetBackgroundResource(i);
	//    6   12:aload_0         
	//    7   13:getfield        #41  <Field AppCompatBackgroundHelper mBackgroundTintHelper>
	//    8   16:iload_1         
	//    9   17:invokevirtual   #103 <Method void AppCompatBackgroundHelper.onSetBackgroundResource(int)>
	//   10   20:return          
	}

	public void setImageBitmap(Bitmap bitmap)
	{
		super.setImageBitmap(bitmap);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #108 <Method void ImageButton.setImageBitmap(Bitmap)>
		if(mImageHelper != null)
	//*   3    5:aload_0         
	//*   4    6:getfield        #52  <Field AppCompatImageHelper mImageHelper>
	//*   5    9:ifnull          19
			mImageHelper.applySupportImageTint();
	//    6   12:aload_0         
	//    7   13:getfield        #52  <Field AppCompatImageHelper mImageHelper>
	//    8   16:invokevirtual   #63  <Method void AppCompatImageHelper.applySupportImageTint()>
	//    9   19:return          
	}

	public void setImageDrawable(Drawable drawable)
	{
		super.setImageDrawable(drawable);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #111 <Method void ImageButton.setImageDrawable(Drawable)>
		if(mImageHelper != null)
	//*   3    5:aload_0         
	//*   4    6:getfield        #52  <Field AppCompatImageHelper mImageHelper>
	//*   5    9:ifnull          19
			mImageHelper.applySupportImageTint();
	//    6   12:aload_0         
	//    7   13:getfield        #52  <Field AppCompatImageHelper mImageHelper>
	//    8   16:invokevirtual   #63  <Method void AppCompatImageHelper.applySupportImageTint()>
	//    9   19:return          
	}

	public void setImageIcon(Icon icon)
	{
		super.setImageIcon(icon);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #115 <Method void ImageButton.setImageIcon(Icon)>
		if(mImageHelper != null)
	//*   3    5:aload_0         
	//*   4    6:getfield        #52  <Field AppCompatImageHelper mImageHelper>
	//*   5    9:ifnull          19
			mImageHelper.applySupportImageTint();
	//    6   12:aload_0         
	//    7   13:getfield        #52  <Field AppCompatImageHelper mImageHelper>
	//    8   16:invokevirtual   #63  <Method void AppCompatImageHelper.applySupportImageTint()>
	//    9   19:return          
	}

	public void setImageResource(int i)
	{
		mImageHelper.setImageResource(i);
	//    0    0:aload_0         
	//    1    1:getfield        #52  <Field AppCompatImageHelper mImageHelper>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #118 <Method void AppCompatImageHelper.setImageResource(int)>
	//    4    8:return          
	}

	public void setImageURI(Uri uri)
	{
		super.setImageURI(uri);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #122 <Method void ImageButton.setImageURI(Uri)>
		if(mImageHelper != null)
	//*   3    5:aload_0         
	//*   4    6:getfield        #52  <Field AppCompatImageHelper mImageHelper>
	//*   5    9:ifnull          19
			mImageHelper.applySupportImageTint();
	//    6   12:aload_0         
	//    7   13:getfield        #52  <Field AppCompatImageHelper mImageHelper>
	//    8   16:invokevirtual   #63  <Method void AppCompatImageHelper.applySupportImageTint()>
	//    9   19:return          
	}

	public void setSupportBackgroundTintList(ColorStateList colorstatelist)
	{
		if(mBackgroundTintHelper != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #41  <Field AppCompatBackgroundHelper mBackgroundTintHelper>
	//*   2    4:ifnull          15
			mBackgroundTintHelper.setSupportBackgroundTintList(colorstatelist);
	//    3    7:aload_0         
	//    4    8:getfield        #41  <Field AppCompatBackgroundHelper mBackgroundTintHelper>
	//    5   11:aload_1         
	//    6   12:invokevirtual   #126 <Method void AppCompatBackgroundHelper.setSupportBackgroundTintList(ColorStateList)>
	//    7   15:return          
	}

	public void setSupportBackgroundTintMode(android.graphics.PorterDuff.Mode mode)
	{
		if(mBackgroundTintHelper != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #41  <Field AppCompatBackgroundHelper mBackgroundTintHelper>
	//*   2    4:ifnull          15
			mBackgroundTintHelper.setSupportBackgroundTintMode(mode);
	//    3    7:aload_0         
	//    4    8:getfield        #41  <Field AppCompatBackgroundHelper mBackgroundTintHelper>
	//    5   11:aload_1         
	//    6   12:invokevirtual   #130 <Method void AppCompatBackgroundHelper.setSupportBackgroundTintMode(android.graphics.PorterDuff$Mode)>
	//    7   15:return          
	}

	public void setSupportImageTintList(ColorStateList colorstatelist)
	{
		if(mImageHelper != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #52  <Field AppCompatImageHelper mImageHelper>
	//*   2    4:ifnull          15
			mImageHelper.setSupportImageTintList(colorstatelist);
	//    3    7:aload_0         
	//    4    8:getfield        #52  <Field AppCompatImageHelper mImageHelper>
	//    5   11:aload_1         
	//    6   12:invokevirtual   #133 <Method void AppCompatImageHelper.setSupportImageTintList(ColorStateList)>
	//    7   15:return          
	}

	public void setSupportImageTintMode(android.graphics.PorterDuff.Mode mode)
	{
		if(mImageHelper != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #52  <Field AppCompatImageHelper mImageHelper>
	//*   2    4:ifnull          15
			mImageHelper.setSupportImageTintMode(mode);
	//    3    7:aload_0         
	//    4    8:getfield        #52  <Field AppCompatImageHelper mImageHelper>
	//    5   11:aload_1         
	//    6   12:invokevirtual   #136 <Method void AppCompatImageHelper.setSupportImageTintMode(android.graphics.PorterDuff$Mode)>
	//    7   15:return          
	}

	private final AppCompatBackgroundHelper mBackgroundTintHelper;
	private final AppCompatImageHelper mImageHelper;
}

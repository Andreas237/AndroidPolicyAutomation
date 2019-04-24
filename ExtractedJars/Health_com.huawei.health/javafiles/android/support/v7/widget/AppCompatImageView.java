// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.support.v4.view.TintableBackgroundView;
import android.util.AttributeSet;
import android.widget.ImageView;

// Referenced classes of package android.support.v7.widget:
//			TintContextWrapper, AppCompatBackgroundHelper, AppCompatImageHelper

public class AppCompatImageView extends ImageView
	implements TintableBackgroundView
{

	public AppCompatImageView(Context context)
	{
		this(context, ((AttributeSet) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:invokespecial   #15  <Method void AppCompatImageView(Context, AttributeSet)>
	//    4    6:return          
	}

	public AppCompatImageView(Context context, AttributeSet attributeset)
	{
		this(context, attributeset, 0);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iconst_0        
	//    4    4:invokespecial   #19  <Method void AppCompatImageView(Context, AttributeSet, int)>
	//    5    7:return          
	}

	public AppCompatImageView(Context context, AttributeSet attributeset, int i)
	{
		super(TintContextWrapper.wrap(context), attributeset, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #25  <Method Context TintContextWrapper.wrap(Context)>
	//    3    5:aload_2         
	//    4    6:iload_3         
	//    5    7:invokespecial   #26  <Method void ImageView(Context, AttributeSet, int)>
		mBackgroundTintHelper = new AppCompatBackgroundHelper(((android.view.View) (this)));
	//    6   10:aload_0         
	//    7   11:new             #28  <Class AppCompatBackgroundHelper>
	//    8   14:dup             
	//    9   15:aload_0         
	//   10   16:invokespecial   #31  <Method void AppCompatBackgroundHelper(android.view.View)>
	//   11   19:putfield        #33  <Field AppCompatBackgroundHelper mBackgroundTintHelper>
		mBackgroundTintHelper.loadFromAttributes(attributeset, i);
	//   12   22:aload_0         
	//   13   23:getfield        #33  <Field AppCompatBackgroundHelper mBackgroundTintHelper>
	//   14   26:aload_2         
	//   15   27:iload_3         
	//   16   28:invokevirtual   #37  <Method void AppCompatBackgroundHelper.loadFromAttributes(AttributeSet, int)>
		mImageHelper = new AppCompatImageHelper(((ImageView) (this)));
	//   17   31:aload_0         
	//   18   32:new             #39  <Class AppCompatImageHelper>
	//   19   35:dup             
	//   20   36:aload_0         
	//   21   37:invokespecial   #42  <Method void AppCompatImageHelper(ImageView)>
	//   22   40:putfield        #44  <Field AppCompatImageHelper mImageHelper>
		mImageHelper.loadFromAttributes(attributeset, i);
	//   23   43:aload_0         
	//   24   44:getfield        #44  <Field AppCompatImageHelper mImageHelper>
	//   25   47:aload_2         
	//   26   48:iload_3         
	//   27   49:invokevirtual   #45  <Method void AppCompatImageHelper.loadFromAttributes(AttributeSet, int)>
	//   28   52:return          
	}

	protected void drawableStateChanged()
	{
		super.drawableStateChanged();
	//    0    0:aload_0         
	//    1    1:invokespecial   #49  <Method void ImageView.drawableStateChanged()>
		if(mBackgroundTintHelper != null)
	//*   2    4:aload_0         
	//*   3    5:getfield        #33  <Field AppCompatBackgroundHelper mBackgroundTintHelper>
	//*   4    8:ifnull          18
			mBackgroundTintHelper.applySupportBackgroundTint();
	//    5   11:aload_0         
	//    6   12:getfield        #33  <Field AppCompatBackgroundHelper mBackgroundTintHelper>
	//    7   15:invokevirtual   #52  <Method void AppCompatBackgroundHelper.applySupportBackgroundTint()>
	//    8   18:return          
	}

	public ColorStateList getSupportBackgroundTintList()
	{
		if(mBackgroundTintHelper != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #33  <Field AppCompatBackgroundHelper mBackgroundTintHelper>
	//*   2    4:ifnull          15
			return mBackgroundTintHelper.getSupportBackgroundTintList();
	//    3    7:aload_0         
	//    4    8:getfield        #33  <Field AppCompatBackgroundHelper mBackgroundTintHelper>
	//    5   11:invokevirtual   #61  <Method ColorStateList AppCompatBackgroundHelper.getSupportBackgroundTintList()>
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
	//*   1    1:getfield        #33  <Field AppCompatBackgroundHelper mBackgroundTintHelper>
	//*   2    4:ifnull          15
			return mBackgroundTintHelper.getSupportBackgroundTintMode();
	//    3    7:aload_0         
	//    4    8:getfield        #33  <Field AppCompatBackgroundHelper mBackgroundTintHelper>
	//    5   11:invokevirtual   #66  <Method android.graphics.PorterDuff$Mode AppCompatBackgroundHelper.getSupportBackgroundTintMode()>
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
	//    1    1:getfield        #44  <Field AppCompatImageHelper mImageHelper>
	//    2    4:invokevirtual   #70  <Method boolean AppCompatImageHelper.hasOverlappingRendering()>
	//    3    7:ifeq            19
	//    4   10:aload_0         
	//    5   11:invokespecial   #71  <Method boolean ImageView.hasOverlappingRendering()>
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
	//    2    2:invokespecial   #75  <Method void ImageView.setBackgroundDrawable(Drawable)>
		if(mBackgroundTintHelper != null)
	//*   3    5:aload_0         
	//*   4    6:getfield        #33  <Field AppCompatBackgroundHelper mBackgroundTintHelper>
	//*   5    9:ifnull          20
			mBackgroundTintHelper.onSetBackgroundDrawable(drawable);
	//    6   12:aload_0         
	//    7   13:getfield        #33  <Field AppCompatBackgroundHelper mBackgroundTintHelper>
	//    8   16:aload_1         
	//    9   17:invokevirtual   #78  <Method void AppCompatBackgroundHelper.onSetBackgroundDrawable(Drawable)>
	//   10   20:return          
	}

	public void setBackgroundResource(int i)
	{
		super.setBackgroundResource(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #83  <Method void ImageView.setBackgroundResource(int)>
		if(mBackgroundTintHelper != null)
	//*   3    5:aload_0         
	//*   4    6:getfield        #33  <Field AppCompatBackgroundHelper mBackgroundTintHelper>
	//*   5    9:ifnull          20
			mBackgroundTintHelper.onSetBackgroundResource(i);
	//    6   12:aload_0         
	//    7   13:getfield        #33  <Field AppCompatBackgroundHelper mBackgroundTintHelper>
	//    8   16:iload_1         
	//    9   17:invokevirtual   #86  <Method void AppCompatBackgroundHelper.onSetBackgroundResource(int)>
	//   10   20:return          
	}

	public void setImageResource(int i)
	{
		mImageHelper.setImageResource(i);
	//    0    0:aload_0         
	//    1    1:getfield        #44  <Field AppCompatImageHelper mImageHelper>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #90  <Method void AppCompatImageHelper.setImageResource(int)>
	//    4    8:return          
	}

	public void setSupportBackgroundTintList(ColorStateList colorstatelist)
	{
		if(mBackgroundTintHelper != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #33  <Field AppCompatBackgroundHelper mBackgroundTintHelper>
	//*   2    4:ifnull          15
			mBackgroundTintHelper.setSupportBackgroundTintList(colorstatelist);
	//    3    7:aload_0         
	//    4    8:getfield        #33  <Field AppCompatBackgroundHelper mBackgroundTintHelper>
	//    5   11:aload_1         
	//    6   12:invokevirtual   #94  <Method void AppCompatBackgroundHelper.setSupportBackgroundTintList(ColorStateList)>
	//    7   15:return          
	}

	public void setSupportBackgroundTintMode(android.graphics.PorterDuff.Mode mode)
	{
		if(mBackgroundTintHelper != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #33  <Field AppCompatBackgroundHelper mBackgroundTintHelper>
	//*   2    4:ifnull          15
			mBackgroundTintHelper.setSupportBackgroundTintMode(mode);
	//    3    7:aload_0         
	//    4    8:getfield        #33  <Field AppCompatBackgroundHelper mBackgroundTintHelper>
	//    5   11:aload_1         
	//    6   12:invokevirtual   #98  <Method void AppCompatBackgroundHelper.setSupportBackgroundTintMode(android.graphics.PorterDuff$Mode)>
	//    7   15:return          
	}

	private AppCompatBackgroundHelper mBackgroundTintHelper;
	private AppCompatImageHelper mImageHelper;
}

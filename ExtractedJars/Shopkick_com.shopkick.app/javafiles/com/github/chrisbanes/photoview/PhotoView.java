// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.github.chrisbanes.photoview;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageView;

// Referenced classes of package com.github.chrisbanes.photoview:
//			PhotoViewAttacher, OnMatrixChangedListener, OnOutsidePhotoTapListener, OnPhotoTapListener, 
//			OnScaleChangedListener, OnSingleFlingListener

public class PhotoView extends ImageView
{

	public PhotoView(Context context)
	{
		this(context, ((AttributeSet) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:invokespecial   #11  <Method void PhotoView(Context, AttributeSet)>
	//    4    6:return          
	}

	public PhotoView(Context context, AttributeSet attributeset)
	{
		this(context, attributeset, 0);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iconst_0        
	//    4    4:invokespecial   #15  <Method void PhotoView(Context, AttributeSet, int)>
	//    5    7:return          
	}

	public PhotoView(Context context, AttributeSet attributeset, int i)
	{
		super(context, attributeset, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:invokespecial   #16  <Method void ImageView(Context, AttributeSet, int)>
		init();
	//    5    7:aload_0         
	//    6    8:invokespecial   #20  <Method void init()>
	//    7   11:return          
	}

	public PhotoView(Context context, AttributeSet attributeset, int i, int j)
	{
		super(context, attributeset, i, j);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:iload           4
	//    5    6:invokespecial   #26  <Method void ImageView(Context, AttributeSet, int, int)>
		init();
	//    6    9:aload_0         
	//    7   10:invokespecial   #20  <Method void init()>
	//    8   13:return          
	}

	private void init()
	{
		attacher = new PhotoViewAttacher(((ImageView) (this)));
	//    0    0:aload_0         
	//    1    1:new             #29  <Class PhotoViewAttacher>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:invokespecial   #32  <Method void PhotoViewAttacher(ImageView)>
	//    5    9:putfield        #34  <Field PhotoViewAttacher attacher>
		super.setScaleType(android.widget.ImageView.ScaleType.MATRIX);
	//    6   12:aload_0         
	//    7   13:getstatic       #40  <Field android.widget.ImageView$ScaleType android.widget.ImageView$ScaleType.MATRIX>
	//    8   16:invokespecial   #44  <Method void ImageView.setScaleType(android.widget.ImageView$ScaleType)>
	//    9   19:return          
	}

	public PhotoViewAttacher getAttacher()
	{
		return attacher;
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field PhotoViewAttacher attacher>
	//    2    4:areturn         
	}

	public void getDisplayMatrix(Matrix matrix)
	{
		attacher.getDisplayMatrix(matrix);
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field PhotoViewAttacher attacher>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #50  <Method void PhotoViewAttacher.getDisplayMatrix(Matrix)>
	//    4    8:return          
	}

	public RectF getDisplayRect()
	{
		return attacher.getDisplayRect();
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field PhotoViewAttacher attacher>
	//    2    4:invokevirtual   #54  <Method RectF PhotoViewAttacher.getDisplayRect()>
	//    3    7:areturn         
	}

	public Matrix getImageMatrix()
	{
		return attacher.getImageMatrix();
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field PhotoViewAttacher attacher>
	//    2    4:invokevirtual   #58  <Method Matrix PhotoViewAttacher.getImageMatrix()>
	//    3    7:areturn         
	}

	public float getMaximumScale()
	{
		return attacher.getMaximumScale();
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field PhotoViewAttacher attacher>
	//    2    4:invokevirtual   #62  <Method float PhotoViewAttacher.getMaximumScale()>
	//    3    7:freturn         
	}

	public float getMediumScale()
	{
		return attacher.getMediumScale();
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field PhotoViewAttacher attacher>
	//    2    4:invokevirtual   #65  <Method float PhotoViewAttacher.getMediumScale()>
	//    3    7:freturn         
	}

	public float getMinimumScale()
	{
		return attacher.getMinimumScale();
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field PhotoViewAttacher attacher>
	//    2    4:invokevirtual   #68  <Method float PhotoViewAttacher.getMinimumScale()>
	//    3    7:freturn         
	}

	public float getScale()
	{
		return attacher.getScale();
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field PhotoViewAttacher attacher>
	//    2    4:invokevirtual   #71  <Method float PhotoViewAttacher.getScale()>
	//    3    7:freturn         
	}

	public android.widget.ImageView.ScaleType getScaleType()
	{
		return attacher.getScaleType();
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field PhotoViewAttacher attacher>
	//    2    4:invokevirtual   #75  <Method android.widget.ImageView$ScaleType PhotoViewAttacher.getScaleType()>
	//    3    7:areturn         
	}

	public boolean isZoomEnabled()
	{
		return attacher.isZoomEnabled();
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field PhotoViewAttacher attacher>
	//    2    4:invokevirtual   #79  <Method boolean PhotoViewAttacher.isZoomEnabled()>
	//    3    7:ireturn         
	}

	public void setAllowParentInterceptOnEdge(boolean flag)
	{
		attacher.setAllowParentInterceptOnEdge(flag);
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field PhotoViewAttacher attacher>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #83  <Method void PhotoViewAttacher.setAllowParentInterceptOnEdge(boolean)>
	//    4    8:return          
	}

	public boolean setDisplayMatrix(Matrix matrix)
	{
		return attacher.setDisplayMatrix(matrix);
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field PhotoViewAttacher attacher>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #87  <Method boolean PhotoViewAttacher.setDisplayMatrix(Matrix)>
	//    4    8:ireturn         
	}

	protected boolean setFrame(int i, int j, int k, int l)
	{
		boolean flag = super.setFrame(i, j, k, l);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:iload_3         
	//    4    4:iload           4
	//    5    6:invokespecial   #91  <Method boolean ImageView.setFrame(int, int, int, int)>
	//    6    9:istore          5
		if(flag)
	//*   7   11:iload           5
	//*   8   13:ifeq            23
			attacher.update();
	//    9   16:aload_0         
	//   10   17:getfield        #34  <Field PhotoViewAttacher attacher>
	//   11   20:invokevirtual   #94  <Method void PhotoViewAttacher.update()>
		return flag;
	//   12   23:iload           5
	//   13   25:ireturn         
	}

	public void setImageDrawable(Drawable drawable)
	{
		super.setImageDrawable(drawable);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #98  <Method void ImageView.setImageDrawable(Drawable)>
		drawable = ((Drawable) (attacher));
	//    3    5:aload_0         
	//    4    6:getfield        #34  <Field PhotoViewAttacher attacher>
	//    5    9:astore_1        
		if(drawable != null)
	//*   6   10:aload_1         
	//*   7   11:ifnull          18
			((PhotoViewAttacher) (drawable)).update();
	//    8   14:aload_1         
	//    9   15:invokevirtual   #94  <Method void PhotoViewAttacher.update()>
	//   10   18:return          
	}

	public void setImageResource(int i)
	{
		super.setImageResource(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #102 <Method void ImageView.setImageResource(int)>
		PhotoViewAttacher photoviewattacher = attacher;
	//    3    5:aload_0         
	//    4    6:getfield        #34  <Field PhotoViewAttacher attacher>
	//    5    9:astore_2        
		if(photoviewattacher != null)
	//*   6   10:aload_2         
	//*   7   11:ifnull          18
			photoviewattacher.update();
	//    8   14:aload_2         
	//    9   15:invokevirtual   #94  <Method void PhotoViewAttacher.update()>
	//   10   18:return          
	}

	public void setImageURI(Uri uri)
	{
		super.setImageURI(uri);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #106 <Method void ImageView.setImageURI(Uri)>
		uri = ((Uri) (attacher));
	//    3    5:aload_0         
	//    4    6:getfield        #34  <Field PhotoViewAttacher attacher>
	//    5    9:astore_1        
		if(uri != null)
	//*   6   10:aload_1         
	//*   7   11:ifnull          18
			((PhotoViewAttacher) (uri)).update();
	//    8   14:aload_1         
	//    9   15:invokevirtual   #94  <Method void PhotoViewAttacher.update()>
	//   10   18:return          
	}

	public void setMaximumScale(float f)
	{
		attacher.setMaximumScale(f);
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field PhotoViewAttacher attacher>
	//    2    4:fload_1         
	//    3    5:invokevirtual   #110 <Method void PhotoViewAttacher.setMaximumScale(float)>
	//    4    8:return          
	}

	public void setMediumScale(float f)
	{
		attacher.setMediumScale(f);
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field PhotoViewAttacher attacher>
	//    2    4:fload_1         
	//    3    5:invokevirtual   #113 <Method void PhotoViewAttacher.setMediumScale(float)>
	//    4    8:return          
	}

	public void setMinimumScale(float f)
	{
		attacher.setMinimumScale(f);
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field PhotoViewAttacher attacher>
	//    2    4:fload_1         
	//    3    5:invokevirtual   #116 <Method void PhotoViewAttacher.setMinimumScale(float)>
	//    4    8:return          
	}

	public void setOnClickListener(android.view.View.OnClickListener onclicklistener)
	{
		attacher.setOnClickListener(onclicklistener);
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field PhotoViewAttacher attacher>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #120 <Method void PhotoViewAttacher.setOnClickListener(android.view.View$OnClickListener)>
	//    4    8:return          
	}

	public void setOnDoubleTapListener(android.view.GestureDetector.OnDoubleTapListener ondoubletaplistener)
	{
		attacher.setOnDoubleTapListener(ondoubletaplistener);
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field PhotoViewAttacher attacher>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #124 <Method void PhotoViewAttacher.setOnDoubleTapListener(android.view.GestureDetector$OnDoubleTapListener)>
	//    4    8:return          
	}

	public void setOnLongClickListener(android.view.View.OnLongClickListener onlongclicklistener)
	{
		attacher.setOnLongClickListener(onlongclicklistener);
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field PhotoViewAttacher attacher>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #128 <Method void PhotoViewAttacher.setOnLongClickListener(android.view.View$OnLongClickListener)>
	//    4    8:return          
	}

	public void setOnMatrixChangeListener(OnMatrixChangedListener onmatrixchangedlistener)
	{
		attacher.setOnMatrixChangeListener(onmatrixchangedlistener);
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field PhotoViewAttacher attacher>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #132 <Method void PhotoViewAttacher.setOnMatrixChangeListener(OnMatrixChangedListener)>
	//    4    8:return          
	}

	public void setOnOutsidePhotoTapListener(OnOutsidePhotoTapListener onoutsidephototaplistener)
	{
		attacher.setOnOutsidePhotoTapListener(onoutsidephototaplistener);
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field PhotoViewAttacher attacher>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #136 <Method void PhotoViewAttacher.setOnOutsidePhotoTapListener(OnOutsidePhotoTapListener)>
	//    4    8:return          
	}

	public void setOnPhotoTapListener(OnPhotoTapListener onphototaplistener)
	{
		attacher.setOnPhotoTapListener(onphototaplistener);
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field PhotoViewAttacher attacher>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #140 <Method void PhotoViewAttacher.setOnPhotoTapListener(OnPhotoTapListener)>
	//    4    8:return          
	}

	public void setOnScaleChangeListener(OnScaleChangedListener onscalechangedlistener)
	{
		attacher.setOnScaleChangeListener(onscalechangedlistener);
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field PhotoViewAttacher attacher>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #144 <Method void PhotoViewAttacher.setOnScaleChangeListener(OnScaleChangedListener)>
	//    4    8:return          
	}

	public void setOnSingleFlingListener(OnSingleFlingListener onsingleflinglistener)
	{
		attacher.setOnSingleFlingListener(onsingleflinglistener);
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field PhotoViewAttacher attacher>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #148 <Method void PhotoViewAttacher.setOnSingleFlingListener(OnSingleFlingListener)>
	//    4    8:return          
	}

	public void setRotationBy(float f)
	{
		attacher.setRotationBy(f);
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field PhotoViewAttacher attacher>
	//    2    4:fload_1         
	//    3    5:invokevirtual   #151 <Method void PhotoViewAttacher.setRotationBy(float)>
	//    4    8:return          
	}

	public void setRotationTo(float f)
	{
		attacher.setRotationTo(f);
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field PhotoViewAttacher attacher>
	//    2    4:fload_1         
	//    3    5:invokevirtual   #154 <Method void PhotoViewAttacher.setRotationTo(float)>
	//    4    8:return          
	}

	public void setScale(float f)
	{
		attacher.setScale(f);
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field PhotoViewAttacher attacher>
	//    2    4:fload_1         
	//    3    5:invokevirtual   #157 <Method void PhotoViewAttacher.setScale(float)>
	//    4    8:return          
	}

	public void setScale(float f, float f1, float f2, boolean flag)
	{
		attacher.setScale(f, f1, f2, flag);
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field PhotoViewAttacher attacher>
	//    2    4:fload_1         
	//    3    5:fload_2         
	//    4    6:fload_3         
	//    5    7:iload           4
	//    6    9:invokevirtual   #160 <Method void PhotoViewAttacher.setScale(float, float, float, boolean)>
	//    7   12:return          
	}

	public void setScale(float f, boolean flag)
	{
		attacher.setScale(f, flag);
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field PhotoViewAttacher attacher>
	//    2    4:fload_1         
	//    3    5:iload_2         
	//    4    6:invokevirtual   #163 <Method void PhotoViewAttacher.setScale(float, boolean)>
	//    5    9:return          
	}

	public void setScaleLevels(float f, float f1, float f2)
	{
		attacher.setScaleLevels(f, f1, f2);
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field PhotoViewAttacher attacher>
	//    2    4:fload_1         
	//    3    5:fload_2         
	//    4    6:fload_3         
	//    5    7:invokevirtual   #167 <Method void PhotoViewAttacher.setScaleLevels(float, float, float)>
	//    6   10:return          
	}

	public void setScaleType(android.widget.ImageView.ScaleType scaletype)
	{
		PhotoViewAttacher photoviewattacher = attacher;
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field PhotoViewAttacher attacher>
	//    2    4:astore_2        
		if(photoviewattacher != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          14
			photoviewattacher.setScaleType(scaletype);
	//    5    9:aload_2         
	//    6   10:aload_1         
	//    7   11:invokevirtual   #168 <Method void PhotoViewAttacher.setScaleType(android.widget.ImageView$ScaleType)>
	//    8   14:return          
	}

	public void setZoomTransitionDuration(int i)
	{
		attacher.setZoomTransitionDuration(i);
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field PhotoViewAttacher attacher>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #171 <Method void PhotoViewAttacher.setZoomTransitionDuration(int)>
	//    4    8:return          
	}

	public void setZoomable(boolean flag)
	{
		attacher.setZoomable(flag);
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field PhotoViewAttacher attacher>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #174 <Method void PhotoViewAttacher.setZoomable(boolean)>
	//    4    8:return          
	}

	private PhotoViewAttacher attacher;
}

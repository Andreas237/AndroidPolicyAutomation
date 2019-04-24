// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package o;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageView;

// Referenced classes of package o:
//			kx, kq, kp, ko, 
//			kw, kt

public class kv extends ImageView
{

	public kv(Context context)
	{
		this(context, ((AttributeSet) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:invokespecial   #11  <Method void kv(Context, AttributeSet)>
	//    4    6:return          
	}

	public kv(Context context, AttributeSet attributeset)
	{
		this(context, attributeset, 0);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iconst_0        
	//    4    4:invokespecial   #15  <Method void kv(Context, AttributeSet, int)>
	//    5    7:return          
	}

	public kv(Context context, AttributeSet attributeset, int i)
	{
		super(context, attributeset, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:invokespecial   #16  <Method void ImageView(Context, AttributeSet, int)>
		b();
	//    5    7:aload_0         
	//    6    8:invokespecial   #20  <Method void b()>
	//    7   11:return          
	}

	private void b()
	{
		d = new kx(((ImageView) (this)));
	//    0    0:aload_0         
	//    1    1:new             #22  <Class kx>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:invokespecial   #25  <Method void kx(ImageView)>
	//    5    9:putfield        #27  <Field kx d>
		super.setScaleType(android.widget.ImageView.ScaleType.MATRIX);
	//    6   12:aload_0         
	//    7   13:getstatic       #33  <Field android.widget.ImageView$ScaleType android.widget.ImageView$ScaleType.MATRIX>
	//    8   16:invokespecial   #37  <Method void ImageView.setScaleType(android.widget.ImageView$ScaleType)>
	//    9   19:return          
	}

	public kx getAttacher()
	{
		return d;
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field kx d>
	//    2    4:areturn         
	}

	public RectF getDisplayRect()
	{
		return d.a();
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field kx d>
	//    2    4:invokevirtual   #44  <Method RectF kx.a()>
	//    3    7:areturn         
	}

	public Matrix getImageMatrix()
	{
		return d.h();
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field kx d>
	//    2    4:invokevirtual   #49  <Method Matrix kx.h()>
	//    3    7:areturn         
	}

	public float getMaximumScale()
	{
		return d.d();
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field kx d>
	//    2    4:invokevirtual   #53  <Method float kx.d()>
	//    3    7:freturn         
	}

	public float getMediumScale()
	{
		return d.e();
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field kx d>
	//    2    4:invokevirtual   #57  <Method float kx.e()>
	//    3    7:freturn         
	}

	public float getMinimumScale()
	{
		return d.c();
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field kx d>
	//    2    4:invokevirtual   #61  <Method float kx.c()>
	//    3    7:freturn         
	}

	public float getScale()
	{
		return d.b();
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field kx d>
	//    2    4:invokevirtual   #64  <Method float kx.b()>
	//    3    7:freturn         
	}

	public android.widget.ImageView.ScaleType getScaleType()
	{
		return d.i();
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field kx d>
	//    2    4:invokevirtual   #69  <Method android.widget.ImageView$ScaleType kx.i()>
	//    3    7:areturn         
	}

	public void setAllowParentInterceptOnEdge(boolean flag)
	{
		d.a(flag);
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field kx d>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #73  <Method void kx.a(boolean)>
	//    4    8:return          
	}

	protected boolean setFrame(int i, int j, int k, int l)
	{
		boolean flag = super.setFrame(i, j, k, l);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:iload_3         
	//    4    4:iload           4
	//    5    6:invokespecial   #77  <Method boolean ImageView.setFrame(int, int, int, int)>
	//    6    9:istore          5
		if(flag)
	//*   7   11:iload           5
	//*   8   13:ifeq            23
			d.f();
	//    9   16:aload_0         
	//   10   17:getfield        #27  <Field kx d>
	//   11   20:invokevirtual   #80  <Method void kx.f()>
		return flag;
	//   12   23:iload           5
	//   13   25:ireturn         
	}

	public void setImageDrawable(Drawable drawable)
	{
		super.setImageDrawable(drawable);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #84  <Method void ImageView.setImageDrawable(Drawable)>
		if(d != null)
	//*   3    5:aload_0         
	//*   4    6:getfield        #27  <Field kx d>
	//*   5    9:ifnull          19
			d.f();
	//    6   12:aload_0         
	//    7   13:getfield        #27  <Field kx d>
	//    8   16:invokevirtual   #80  <Method void kx.f()>
	//    9   19:return          
	}

	public void setImageResource(int i)
	{
		super.setImageResource(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #88  <Method void ImageView.setImageResource(int)>
		if(d != null)
	//*   3    5:aload_0         
	//*   4    6:getfield        #27  <Field kx d>
	//*   5    9:ifnull          19
			d.f();
	//    6   12:aload_0         
	//    7   13:getfield        #27  <Field kx d>
	//    8   16:invokevirtual   #80  <Method void kx.f()>
	//    9   19:return          
	}

	public void setImageURI(Uri uri)
	{
		super.setImageURI(uri);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #92  <Method void ImageView.setImageURI(Uri)>
		if(d != null)
	//*   3    5:aload_0         
	//*   4    6:getfield        #27  <Field kx d>
	//*   5    9:ifnull          19
			d.f();
	//    6   12:aload_0         
	//    7   13:getfield        #27  <Field kx d>
	//    8   16:invokevirtual   #80  <Method void kx.f()>
	//    9   19:return          
	}

	public void setMaximumScale(float f)
	{
		d.e(f);
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field kx d>
	//    2    4:fload_1         
	//    3    5:invokevirtual   #96  <Method void kx.e(float)>
	//    4    8:return          
	}

	public void setMediumScale(float f)
	{
		d.c(f);
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field kx d>
	//    2    4:fload_1         
	//    3    5:invokevirtual   #99  <Method void kx.c(float)>
	//    4    8:return          
	}

	public void setMinimumScale(float f)
	{
		d.d(f);
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field kx d>
	//    2    4:fload_1         
	//    3    5:invokevirtual   #102 <Method void kx.d(float)>
	//    4    8:return          
	}

	public void setOnClickListener(android.view.View.OnClickListener onclicklistener)
	{
		d.c(onclicklistener);
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field kx d>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #106 <Method void kx.c(android.view.View$OnClickListener)>
	//    4    8:return          
	}

	public void setOnDoubleTapListener(android.view.GestureDetector.OnDoubleTapListener ondoubletaplistener)
	{
		d.a(ondoubletaplistener);
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field kx d>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #110 <Method void kx.a(android.view.GestureDetector$OnDoubleTapListener)>
	//    4    8:return          
	}

	public void setOnLongClickListener(android.view.View.OnLongClickListener onlongclicklistener)
	{
		d.b(onlongclicklistener);
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field kx d>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #114 <Method void kx.b(android.view.View$OnLongClickListener)>
	//    4    8:return          
	}

	public void setOnMatrixChangeListener(kq kq)
	{
		d.d(kq);
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field kx d>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #118 <Method void kx.d(kq)>
	//    4    8:return          
	}

	public void setOnOutsidePhotoTapListener(kp kp)
	{
		d.e(kp);
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field kx d>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #122 <Method void kx.e(kp)>
	//    4    8:return          
	}

	public void setOnPhotoTapListener(ko ko)
	{
		d.b(ko);
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field kx d>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #126 <Method void kx.b(ko)>
	//    4    8:return          
	}

	public void setOnScaleChangeListener(kw kw)
	{
		d.d(kw);
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field kx d>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #130 <Method void kx.d(kw)>
	//    4    8:return          
	}

	public void setOnSingleFlingListener(kt kt)
	{
		d.c(kt);
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field kx d>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #134 <Method void kx.c(kt)>
	//    4    8:return          
	}

	public void setRotationBy(float f)
	{
		d.a(f);
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field kx d>
	//    2    4:fload_1         
	//    3    5:invokevirtual   #137 <Method void kx.a(float)>
	//    4    8:return          
	}

	public void setRotationTo(float f)
	{
		d.b(f);
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field kx d>
	//    2    4:fload_1         
	//    3    5:invokevirtual   #140 <Method void kx.b(float)>
	//    4    8:return          
	}

	public void setScale(float f)
	{
		d.k(f);
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field kx d>
	//    2    4:fload_1         
	//    3    5:invokevirtual   #144 <Method void kx.k(float)>
	//    4    8:return          
	}

	public void setScale(float f, float f1, float f2, boolean flag)
	{
		d.d(f, f1, f2, flag);
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field kx d>
	//    2    4:fload_1         
	//    3    5:fload_2         
	//    4    6:fload_3         
	//    5    7:iload           4
	//    6    9:invokevirtual   #147 <Method void kx.d(float, float, float, boolean)>
	//    7   12:return          
	}

	public void setScale(float f, boolean flag)
	{
		d.e(f, flag);
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field kx d>
	//    2    4:fload_1         
	//    3    5:iload_2         
	//    4    6:invokevirtual   #150 <Method void kx.e(float, boolean)>
	//    5    9:return          
	}

	public void setScaleLevels(float f, float f1, float f2)
	{
		d.c(f, f1, f2);
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field kx d>
	//    2    4:fload_1         
	//    3    5:fload_2         
	//    4    6:fload_3         
	//    5    7:invokevirtual   #154 <Method void kx.c(float, float, float)>
	//    6   10:return          
	}

	public void setScaleType(android.widget.ImageView.ScaleType scaletype)
	{
		if(d != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #27  <Field kx d>
	//*   2    4:ifnull          15
			d.e(scaletype);
	//    3    7:aload_0         
	//    4    8:getfield        #27  <Field kx d>
	//    5   11:aload_1         
	//    6   12:invokevirtual   #156 <Method void kx.e(android.widget.ImageView$ScaleType)>
	//    7   15:return          
	}

	public void setZoomTransitionDuration(int i)
	{
		d.a(i);
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field kx d>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #159 <Method void kx.a(int)>
	//    4    8:return          
	}

	public void setZoomable(boolean flag)
	{
		d.d(flag);
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field kx d>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #162 <Method void kx.d(boolean)>
	//    4    8:return          
	}

	private kx d;
}

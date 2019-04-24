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
import android.support.v4.view.r;
import android.support.v4.widget.o;
import android.util.AttributeSet;
import android.widget.ImageView;

// Referenced classes of package android.support.v7.widget:
//			as, f, i

public class AppCompatImageView extends ImageView
	implements r, o
{

	public AppCompatImageView(Context context)
	{
		this(context, ((AttributeSet) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:invokespecial   #17  <Method void AppCompatImageView(Context, AttributeSet)>
	//    4    6:return          
	}

	public AppCompatImageView(Context context, AttributeSet attributeset)
	{
		this(context, attributeset, 0);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iconst_0        
	//    4    4:invokespecial   #21  <Method void AppCompatImageView(Context, AttributeSet, int)>
	//    5    7:return          
	}

	public AppCompatImageView(Context context, AttributeSet attributeset, int j)
	{
		super(as.a(context), attributeset, j);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #26  <Method Context as.a(Context)>
	//    3    5:aload_2         
	//    4    6:iload_3         
	//    5    7:invokespecial   #27  <Method void ImageView(Context, AttributeSet, int)>
		a = new f(((android.view.View) (this)));
	//    6   10:aload_0         
	//    7   11:new             #29  <Class f>
	//    8   14:dup             
	//    9   15:aload_0         
	//   10   16:invokespecial   #32  <Method void f(android.view.View)>
	//   11   19:putfield        #34  <Field f a>
		a.a(attributeset, j);
	//   12   22:aload_0         
	//   13   23:getfield        #34  <Field f a>
	//   14   26:aload_2         
	//   15   27:iload_3         
	//   16   28:invokevirtual   #37  <Method void f.a(AttributeSet, int)>
		b = new i(((ImageView) (this)));
	//   17   31:aload_0         
	//   18   32:new             #39  <Class i>
	//   19   35:dup             
	//   20   36:aload_0         
	//   21   37:invokespecial   #42  <Method void i(ImageView)>
	//   22   40:putfield        #44  <Field i b>
		b.a(attributeset, j);
	//   23   43:aload_0         
	//   24   44:getfield        #44  <Field i b>
	//   25   47:aload_2         
	//   26   48:iload_3         
	//   27   49:invokevirtual   #45  <Method void i.a(AttributeSet, int)>
	//   28   52:return          
	}

	protected void drawableStateChanged()
	{
		super.drawableStateChanged();
	//    0    0:aload_0         
	//    1    1:invokespecial   #49  <Method void ImageView.drawableStateChanged()>
		if(a != null)
	//*   2    4:aload_0         
	//*   3    5:getfield        #34  <Field f a>
	//*   4    8:ifnull          18
			a.c();
	//    5   11:aload_0         
	//    6   12:getfield        #34  <Field f a>
	//    7   15:invokevirtual   #52  <Method void f.c()>
		if(b != null)
	//*   8   18:aload_0         
	//*   9   19:getfield        #44  <Field i b>
	//*  10   22:ifnull          32
			b.d();
	//   11   25:aload_0         
	//   12   26:getfield        #44  <Field i b>
	//   13   29:invokevirtual   #55  <Method void i.d()>
	//   14   32:return          
	}

	public ColorStateList getSupportBackgroundTintList()
	{
		if(a != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #34  <Field f a>
	//*   2    4:ifnull          15
			return a.a();
	//    3    7:aload_0         
	//    4    8:getfield        #34  <Field f a>
	//    5   11:invokevirtual   #59  <Method ColorStateList f.a()>
	//    6   14:areturn         
		else
			return null;
	//    7   15:aconst_null     
	//    8   16:areturn         
	}

	public android.graphics.PorterDuff.Mode getSupportBackgroundTintMode()
	{
		if(a != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #34  <Field f a>
	//*   2    4:ifnull          15
			return a.b();
	//    3    7:aload_0         
	//    4    8:getfield        #34  <Field f a>
	//    5   11:invokevirtual   #63  <Method android.graphics.PorterDuff$Mode f.b()>
	//    6   14:areturn         
		else
			return null;
	//    7   15:aconst_null     
	//    8   16:areturn         
	}

	public ColorStateList getSupportImageTintList()
	{
		if(b != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #44  <Field i b>
	//*   2    4:ifnull          15
			return b.b();
	//    3    7:aload_0         
	//    4    8:getfield        #44  <Field i b>
	//    5   11:invokevirtual   #66  <Method ColorStateList i.b()>
	//    6   14:areturn         
		else
			return null;
	//    7   15:aconst_null     
	//    8   16:areturn         
	}

	public android.graphics.PorterDuff.Mode getSupportImageTintMode()
	{
		if(b != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #44  <Field i b>
	//*   2    4:ifnull          15
			return b.c();
	//    3    7:aload_0         
	//    4    8:getfield        #44  <Field i b>
	//    5   11:invokevirtual   #69  <Method android.graphics.PorterDuff$Mode i.c()>
	//    6   14:areturn         
		else
			return null;
	//    7   15:aconst_null     
	//    8   16:areturn         
	}

	public boolean hasOverlappingRendering()
	{
		return b.a() && super.hasOverlappingRendering();
	//    0    0:aload_0         
	//    1    1:getfield        #44  <Field i b>
	//    2    4:invokevirtual   #73  <Method boolean i.a()>
	//    3    7:ifeq            19
	//    4   10:aload_0         
	//    5   11:invokespecial   #75  <Method boolean ImageView.hasOverlappingRendering()>
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
	//    2    2:invokespecial   #79  <Method void ImageView.setBackgroundDrawable(Drawable)>
		if(a != null)
	//*   3    5:aload_0         
	//*   4    6:getfield        #34  <Field f a>
	//*   5    9:ifnull          20
			a.a(drawable);
	//    6   12:aload_0         
	//    7   13:getfield        #34  <Field f a>
	//    8   16:aload_1         
	//    9   17:invokevirtual   #81  <Method void f.a(Drawable)>
	//   10   20:return          
	}

	public void setBackgroundResource(int j)
	{
		super.setBackgroundResource(j);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #85  <Method void ImageView.setBackgroundResource(int)>
		if(a != null)
	//*   3    5:aload_0         
	//*   4    6:getfield        #34  <Field f a>
	//*   5    9:ifnull          20
			a.a(j);
	//    6   12:aload_0         
	//    7   13:getfield        #34  <Field f a>
	//    8   16:iload_1         
	//    9   17:invokevirtual   #87  <Method void f.a(int)>
	//   10   20:return          
	}

	public void setImageBitmap(Bitmap bitmap)
	{
		super.setImageBitmap(bitmap);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #91  <Method void ImageView.setImageBitmap(Bitmap)>
		if(b != null)
	//*   3    5:aload_0         
	//*   4    6:getfield        #44  <Field i b>
	//*   5    9:ifnull          19
			b.d();
	//    6   12:aload_0         
	//    7   13:getfield        #44  <Field i b>
	//    8   16:invokevirtual   #55  <Method void i.d()>
	//    9   19:return          
	}

	public void setImageDrawable(Drawable drawable)
	{
		super.setImageDrawable(drawable);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #94  <Method void ImageView.setImageDrawable(Drawable)>
		if(b != null)
	//*   3    5:aload_0         
	//*   4    6:getfield        #44  <Field i b>
	//*   5    9:ifnull          19
			b.d();
	//    6   12:aload_0         
	//    7   13:getfield        #44  <Field i b>
	//    8   16:invokevirtual   #55  <Method void i.d()>
	//    9   19:return          
	}

	public void setImageIcon(Icon icon)
	{
		super.setImageIcon(icon);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #98  <Method void ImageView.setImageIcon(Icon)>
		if(b != null)
	//*   3    5:aload_0         
	//*   4    6:getfield        #44  <Field i b>
	//*   5    9:ifnull          19
			b.d();
	//    6   12:aload_0         
	//    7   13:getfield        #44  <Field i b>
	//    8   16:invokevirtual   #55  <Method void i.d()>
	//    9   19:return          
	}

	public void setImageResource(int j)
	{
		if(b != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #44  <Field i b>
	//*   2    4:ifnull          15
			b.a(j);
	//    3    7:aload_0         
	//    4    8:getfield        #44  <Field i b>
	//    5   11:iload_1         
	//    6   12:invokevirtual   #100 <Method void i.a(int)>
	//    7   15:return          
	}

	public void setImageURI(Uri uri)
	{
		super.setImageURI(uri);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #104 <Method void ImageView.setImageURI(Uri)>
		if(b != null)
	//*   3    5:aload_0         
	//*   4    6:getfield        #44  <Field i b>
	//*   5    9:ifnull          19
			b.d();
	//    6   12:aload_0         
	//    7   13:getfield        #44  <Field i b>
	//    8   16:invokevirtual   #55  <Method void i.d()>
	//    9   19:return          
	}

	public void setSupportBackgroundTintList(ColorStateList colorstatelist)
	{
		if(a != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #34  <Field f a>
	//*   2    4:ifnull          15
			a.a(colorstatelist);
	//    3    7:aload_0         
	//    4    8:getfield        #34  <Field f a>
	//    5   11:aload_1         
	//    6   12:invokevirtual   #108 <Method void f.a(ColorStateList)>
	//    7   15:return          
	}

	public void setSupportBackgroundTintMode(android.graphics.PorterDuff.Mode mode)
	{
		if(a != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #34  <Field f a>
	//*   2    4:ifnull          15
			a.a(mode);
	//    3    7:aload_0         
	//    4    8:getfield        #34  <Field f a>
	//    5   11:aload_1         
	//    6   12:invokevirtual   #112 <Method void f.a(android.graphics.PorterDuff$Mode)>
	//    7   15:return          
	}

	public void setSupportImageTintList(ColorStateList colorstatelist)
	{
		if(b != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #44  <Field i b>
	//*   2    4:ifnull          15
			b.a(colorstatelist);
	//    3    7:aload_0         
	//    4    8:getfield        #44  <Field i b>
	//    5   11:aload_1         
	//    6   12:invokevirtual   #114 <Method void i.a(ColorStateList)>
	//    7   15:return          
	}

	public void setSupportImageTintMode(android.graphics.PorterDuff.Mode mode)
	{
		if(b != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #44  <Field i b>
	//*   2    4:ifnull          15
			b.a(mode);
	//    3    7:aload_0         
	//    4    8:getfield        #44  <Field i b>
	//    5   11:aload_1         
	//    6   12:invokevirtual   #116 <Method void i.a(android.graphics.PorterDuff$Mode)>
	//    7   15:return          
	}

	private final f a;
	private final i b;
}

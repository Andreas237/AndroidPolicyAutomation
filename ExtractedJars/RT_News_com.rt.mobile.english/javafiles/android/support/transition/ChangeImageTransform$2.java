// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.transition;

import android.graphics.Matrix;
import android.util.Property;
import android.widget.ImageView;

// Referenced classes of package android.support.transition:
//			ChangeImageTransform, ImageViewUtils

static final class ChangeImageTransform$2 extends Property
{

	public Matrix get(ImageView imageview)
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public volatile Object get(Object obj)
	{
		return ((Object) (get((ImageView)obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #17  <Class ImageView>
	//    3    5:invokevirtual   #19  <Method Matrix get(ImageView)>
	//    4    8:areturn         
	}

	public void set(ImageView imageview, Matrix matrix)
	{
		ImageViewUtils.animateTransform(imageview, matrix);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:invokestatic    #26  <Method void ImageViewUtils.animateTransform(ImageView, Matrix)>
	//    3    5:return          
	}

	public volatile void set(Object obj, Object obj1)
	{
		set((ImageView)obj, (Matrix)obj1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #17  <Class ImageView>
	//    3    5:aload_2         
	//    4    6:checkcast       #29  <Class Matrix>
	//    5    9:invokevirtual   #31  <Method void set(ImageView, Matrix)>
	//    6   12:return          
	}

	ChangeImageTransform$2(Class class1, String s)
	{
		super(class1, s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #11  <Method void Property(Class, String)>
	//    4    6:return          
	}
}

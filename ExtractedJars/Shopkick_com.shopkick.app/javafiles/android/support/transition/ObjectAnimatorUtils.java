// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.transition;

import android.animation.ObjectAnimator;
import android.graphics.Path;
import android.util.Property;

// Referenced classes of package android.support.transition:
//			PathProperty

class ObjectAnimatorUtils
{

	private ObjectAnimatorUtils()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void Object()>
	//    2    4:return          
	}

	static ObjectAnimator ofPointF(Object obj, Property property, Path path)
	{
		if(android.os.Build.VERSION.SDK_INT >= 21)
	//*   0    0:getstatic       #17  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          21
	//*   2    5:icmplt          16
			return ObjectAnimator.ofObject(obj, property, ((android.animation.TypeConverter) (null)), path);
	//    3    8:aload_0         
	//    4    9:aload_1         
	//    5   10:aconst_null     
	//    6   11:aload_2         
	//    7   12:invokestatic    #23  <Method ObjectAnimator ObjectAnimator.ofObject(Object, Property, android.animation.TypeConverter, Path)>
	//    8   15:areturn         
		else
			return ObjectAnimator.ofFloat(obj, ((Property) (new PathProperty(property, path))), new float[] {
				0.0F, 1.0F
			});
	//    9   16:aload_0         
	//   10   17:new             #25  <Class PathProperty>
	//   11   20:dup             
	//   12   21:aload_1         
	//   13   22:aload_2         
	//   14   23:invokespecial   #28  <Method void PathProperty(Property, Path)>
	//   15   26:iconst_2        
	//   16   27:newarray        float[]
	//   17   29:dup             
	//   18   30:iconst_0        
	//   19   31:fconst_0        
	//   20   32:fastore         
	//   21   33:dup             
	//   22   34:iconst_1        
	//   23   35:fconst_1        
	//   24   36:fastore         
	//   25   37:invokestatic    #32  <Method ObjectAnimator ObjectAnimator.ofFloat(Object, Property, float[])>
	//   26   40:areturn         
	}
}

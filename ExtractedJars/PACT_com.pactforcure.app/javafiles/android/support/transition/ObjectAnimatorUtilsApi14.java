// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.transition;

import android.animation.ObjectAnimator;
import android.graphics.Path;
import android.util.Property;

// Referenced classes of package android.support.transition:
//			ObjectAnimatorUtilsImpl, PathProperty

class ObjectAnimatorUtilsApi14
	implements ObjectAnimatorUtilsImpl
{

	ObjectAnimatorUtilsApi14()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
	//    2    4:return          
	}

	public ObjectAnimator ofPointF(Object obj, Property property, Path path)
	{
		return ObjectAnimator.ofFloat(obj, ((Property) (new PathProperty(property, path))), new float[] {
			0.0F, 1.0F
		});
	//    0    0:aload_1         
	//    1    1:new             #18  <Class PathProperty>
	//    2    4:dup             
	//    3    5:aload_2         
	//    4    6:aload_3         
	//    5    7:invokespecial   #21  <Method void PathProperty(Property, Path)>
	//    6   10:iconst_2        
	//    7   11:newarray        float[]
	//    8   13:dup             
	//    9   14:iconst_0        
	//   10   15:fconst_0        
	//   11   16:fastore         
	//   12   17:dup             
	//   13   18:iconst_1        
	//   14   19:fconst_1        
	//   15   20:fastore         
	//   16   21:invokestatic    #27  <Method ObjectAnimator ObjectAnimator.ofFloat(Object, Property, float[])>
	//   17   24:areturn         
	}
}

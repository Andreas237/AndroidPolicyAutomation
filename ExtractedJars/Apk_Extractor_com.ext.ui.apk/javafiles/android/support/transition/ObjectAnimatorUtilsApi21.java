// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.transition;

import android.animation.ObjectAnimator;
import android.graphics.Path;
import android.util.Property;

// Referenced classes of package android.support.transition:
//			ObjectAnimatorUtilsImpl

class ObjectAnimatorUtilsApi21
	implements ObjectAnimatorUtilsImpl
{

	ObjectAnimatorUtilsApi21()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
	//    2    4:return          
	}

	public ObjectAnimator ofPointF(Object obj, Property property, Path path)
	{
		return ObjectAnimator.ofObject(obj, property, ((android.animation.TypeConverter) (null)), path);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:aconst_null     
	//    3    3:aload_3         
	//    4    4:invokestatic    #22  <Method ObjectAnimator ObjectAnimator.ofObject(Object, Property, android.animation.TypeConverter, Path)>
	//    5    7:areturn         
	}
}

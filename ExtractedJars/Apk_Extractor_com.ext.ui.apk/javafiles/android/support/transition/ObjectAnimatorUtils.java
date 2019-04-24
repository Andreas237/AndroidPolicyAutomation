// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.transition;

import android.animation.ObjectAnimator;
import android.graphics.Path;
import android.util.Property;

// Referenced classes of package android.support.transition:
//			ObjectAnimatorUtilsApi21, ObjectAnimatorUtilsApi14, ObjectAnimatorUtilsImpl

class ObjectAnimatorUtils
{

	ObjectAnimatorUtils()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #26  <Method void Object()>
	//    2    4:return          
	}

	static ObjectAnimator ofPointF(Object obj, Property property, Path path)
	{
		return IMPL.ofPointF(obj, property, path);
	//    0    0:getstatic       #21  <Field ObjectAnimatorUtilsImpl IMPL>
	//    1    3:aload_0         
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokeinterface #32  <Method ObjectAnimator ObjectAnimatorUtilsImpl.ofPointF(Object, Property, Path)>
	//    5   11:areturn         
	}

	private static final ObjectAnimatorUtilsImpl IMPL;

	static 
	{
		if(android.os.Build.VERSION.SDK_INT >= 21)
	//*   0    0:getstatic       #14  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          21
	//*   2    5:icmplt          19
			IMPL = ((ObjectAnimatorUtilsImpl) (new ObjectAnimatorUtilsApi21()));
	//    3    8:new             #16  <Class ObjectAnimatorUtilsApi21>
	//    4   11:dup             
	//    5   12:invokespecial   #19  <Method void ObjectAnimatorUtilsApi21()>
	//    6   15:putstatic       #21  <Field ObjectAnimatorUtilsImpl IMPL>
	//    7   18:return          
		else
			IMPL = ((ObjectAnimatorUtilsImpl) (new ObjectAnimatorUtilsApi14()));
	//    8   19:new             #23  <Class ObjectAnimatorUtilsApi14>
	//    9   22:dup             
	//   10   23:invokespecial   #24  <Method void ObjectAnimatorUtilsApi14()>
	//   11   26:putstatic       #21  <Field ObjectAnimatorUtilsImpl IMPL>
	//*  12   29:return          
	}
}

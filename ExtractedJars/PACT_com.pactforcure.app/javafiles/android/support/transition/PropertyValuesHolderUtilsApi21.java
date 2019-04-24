// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.transition;

import android.animation.PropertyValuesHolder;
import android.graphics.Path;
import android.util.Property;

// Referenced classes of package android.support.transition:
//			PropertyValuesHolderUtilsImpl

class PropertyValuesHolderUtilsApi21
	implements PropertyValuesHolderUtilsImpl
{

	PropertyValuesHolderUtilsApi21()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
	//    2    4:return          
	}

	public PropertyValuesHolder ofPointF(Property property, Path path)
	{
		return PropertyValuesHolder.ofObject(property, ((android.animation.TypeConverter) (null)), path);
	//    0    0:aload_1         
	//    1    1:aconst_null     
	//    2    2:aload_2         
	//    3    3:invokestatic    #22  <Method PropertyValuesHolder PropertyValuesHolder.ofObject(Property, android.animation.TypeConverter, Path)>
	//    4    6:areturn         
	}
}

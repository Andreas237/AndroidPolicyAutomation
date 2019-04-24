// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.transition;

import android.animation.PropertyValuesHolder;
import android.graphics.Path;
import android.util.Property;

// Referenced classes of package android.support.transition:
//			PropertyValuesHolderUtilsApi21, PropertyValuesHolderUtilsApi14, PropertyValuesHolderUtilsImpl

class PropertyValuesHolderUtils
{

	PropertyValuesHolderUtils()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #26  <Method void Object()>
	//    2    4:return          
	}

	static PropertyValuesHolder ofPointF(Property property, Path path)
	{
		return IMPL.ofPointF(property, path);
	//    0    0:getstatic       #21  <Field PropertyValuesHolderUtilsImpl IMPL>
	//    1    3:aload_0         
	//    2    4:aload_1         
	//    3    5:invokeinterface #32  <Method PropertyValuesHolder PropertyValuesHolderUtilsImpl.ofPointF(Property, Path)>
	//    4   10:areturn         
	}

	private static final PropertyValuesHolderUtilsImpl IMPL;

	static 
	{
		if(android.os.Build.VERSION.SDK_INT >= 21)
	//*   0    0:getstatic       #14  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          21
	//*   2    5:icmplt          19
			IMPL = ((PropertyValuesHolderUtilsImpl) (new PropertyValuesHolderUtilsApi21()));
	//    3    8:new             #16  <Class PropertyValuesHolderUtilsApi21>
	//    4   11:dup             
	//    5   12:invokespecial   #19  <Method void PropertyValuesHolderUtilsApi21()>
	//    6   15:putstatic       #21  <Field PropertyValuesHolderUtilsImpl IMPL>
	//    7   18:return          
		else
			IMPL = ((PropertyValuesHolderUtilsImpl) (new PropertyValuesHolderUtilsApi14()));
	//    8   19:new             #23  <Class PropertyValuesHolderUtilsApi14>
	//    9   22:dup             
	//   10   23:invokespecial   #24  <Method void PropertyValuesHolderUtilsApi14()>
	//   11   26:putstatic       #21  <Field PropertyValuesHolderUtilsImpl IMPL>
	//*  12   29:return          
	}
}

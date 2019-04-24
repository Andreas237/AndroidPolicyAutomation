// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.transition;

import android.animation.PropertyValuesHolder;
import android.graphics.Path;
import android.util.Property;

// Referenced classes of package android.support.transition:
//			PropertyValuesHolderUtilsImpl, PathProperty

class PropertyValuesHolderUtilsApi14
	implements PropertyValuesHolderUtilsImpl
{

	PropertyValuesHolderUtilsApi14()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
	//    2    4:return          
	}

	public PropertyValuesHolder ofPointF(Property property, Path path)
	{
		return PropertyValuesHolder.ofFloat(((Property) (new PathProperty(property, path))), new float[] {
			0.0F, 1.0F
		});
	//    0    0:new             #18  <Class PathProperty>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokespecial   #21  <Method void PathProperty(Property, Path)>
	//    5    9:iconst_2        
	//    6   10:newarray        float[]
	//    7   12:dup             
	//    8   13:iconst_0        
	//    9   14:fconst_0        
	//   10   15:fastore         
	//   11   16:dup             
	//   12   17:iconst_1        
	//   13   18:fconst_1        
	//   14   19:fastore         
	//   15   20:invokestatic    #27  <Method PropertyValuesHolder PropertyValuesHolder.ofFloat(Property, float[])>
	//   16   23:areturn         
	}
}

// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.transition;

import android.animation.PropertyValuesHolder;
import android.graphics.Path;
import android.util.Property;

// Referenced classes of package android.support.transition:
//			PathProperty

class PropertyValuesHolderUtils
{

	static PropertyValuesHolder ofPointF(Property property, Path path)
	{
		if(android.os.Build.VERSION.SDK_INT >= 21)
	//*   0    0:getstatic       #12  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          21
	//*   2    5:icmplt          15
			return PropertyValuesHolder.ofObject(property, ((android.animation.TypeConverter) (null)), path);
	//    3    8:aload_0         
	//    4    9:aconst_null     
	//    5   10:aload_1         
	//    6   11:invokestatic    #18  <Method PropertyValuesHolder PropertyValuesHolder.ofObject(Property, android.animation.TypeConverter, Path)>
	//    7   14:areturn         
		else
			return PropertyValuesHolder.ofFloat(((Property) (new PathProperty(property, path))), new float[] {
				0.0F, 1.0F
			});
	//    8   15:new             #20  <Class PathProperty>
	//    9   18:dup             
	//   10   19:aload_0         
	//   11   20:aload_1         
	//   12   21:invokespecial   #24  <Method void PathProperty(Property, Path)>
	//   13   24:iconst_2        
	//   14   25:newarray        float[]
	//   15   27:dup             
	//   16   28:iconst_0        
	//   17   29:fconst_0        
	//   18   30:fastore         
	//   19   31:dup             
	//   20   32:iconst_1        
	//   21   33:fconst_1        
	//   22   34:fastore         
	//   23   35:invokestatic    #28  <Method PropertyValuesHolder PropertyValuesHolder.ofFloat(Property, float[])>
	//   24   38:areturn         
	}
}

// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.content.pm.ResolveInfo;
import java.math.BigDecimal;

// Referenced classes of package android.support.v7.widget:
//			ActivityChooserModel

public static final class ActivityChooserModel$ActivityResolveInfo
	implements Comparable
{

	public int compareTo(ActivityChooserModel$ActivityResolveInfo activitychoosermodel$activityresolveinfo)
	{
		return Float.floatToIntBits(activitychoosermodel$activityresolveinfo.weight) - Float.floatToIntBits(weight);
	//    0    0:aload_1         
	//    1    1:getfield        #26  <Field float weight>
	//    2    4:invokestatic    #32  <Method int Float.floatToIntBits(float)>
	//    3    7:aload_0         
	//    4    8:getfield        #26  <Field float weight>
	//    5   11:invokestatic    #32  <Method int Float.floatToIntBits(float)>
	//    6   14:isub            
	//    7   15:ireturn         
	}

	public volatile int compareTo(Object obj)
	{
		return compareTo((ActivityChooserModel$ActivityResolveInfo)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #2   <Class ActivityChooserModel$ActivityResolveInfo>
	//    3    5:invokevirtual   #35  <Method int compareTo(ActivityChooserModel$ActivityResolveInfo)>
	//    4    8:ireturn         
	}

	public boolean equals(Object obj)
	{
		if(this != obj)
	//*   0    0:aload_0         
	//*   1    1:aload_1         
	//*   2    2:if_acmpne       7
	//*   3    5:iconst_1        
	//*   4    6:ireturn         
		{
			if(obj == null)
	//*   5    7:aload_1         
	//*   6    8:ifnonnull       13
				return false;
	//    7   11:iconst_0        
	//    8   12:ireturn         
			if(((Object)this).getClass() != obj.getClass())
	//*   9   13:aload_0         
	//*  10   14:invokevirtual   #41  <Method Class Object.getClass()>
	//*  11   17:aload_1         
	//*  12   18:invokevirtual   #41  <Method Class Object.getClass()>
	//*  13   21:if_acmpeq       26
				return false;
	//   14   24:iconst_0        
	//   15   25:ireturn         
			obj = ((Object) ((ActivityChooserModel$ActivityResolveInfo)obj));
	//   16   26:aload_1         
	//   17   27:checkcast       #2   <Class ActivityChooserModel$ActivityResolveInfo>
	//   18   30:astore_1        
			if(Float.floatToIntBits(weight) != Float.floatToIntBits(((ActivityChooserModel$ActivityResolveInfo) (obj)).weight))
	//*  19   31:aload_0         
	//*  20   32:getfield        #26  <Field float weight>
	//*  21   35:invokestatic    #32  <Method int Float.floatToIntBits(float)>
	//*  22   38:aload_1         
	//*  23   39:getfield        #26  <Field float weight>
	//*  24   42:invokestatic    #32  <Method int Float.floatToIntBits(float)>
	//*  25   45:icmpeq          5
				return false;
	//   26   48:iconst_0        
	//   27   49:ireturn         
		}
		return true;
	}

	public int hashCode()
	{
		return Float.floatToIntBits(weight) + 31;
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field float weight>
	//    2    4:invokestatic    #32  <Method int Float.floatToIntBits(float)>
	//    3    7:bipush          31
	//    4    9:iadd            
	//    5   10:ireturn         
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #47  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #48  <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append("[");
	//    4    8:aload_1         
	//    5    9:ldc1            #50  <String "[">
	//    6   11:invokevirtual   #54  <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		stringbuilder.append("resolveInfo:").append(resolveInfo.toString());
	//    8   15:aload_1         
	//    9   16:ldc1            #56  <String "resolveInfo:">
	//   10   18:invokevirtual   #54  <Method StringBuilder StringBuilder.append(String)>
	//   11   21:aload_0         
	//   12   22:getfield        #21  <Field ResolveInfo resolveInfo>
	//   13   25:invokevirtual   #60  <Method String ResolveInfo.toString()>
	//   14   28:invokevirtual   #54  <Method StringBuilder StringBuilder.append(String)>
	//   15   31:pop             
		stringbuilder.append("; weight:").append(((Object) (new BigDecimal(weight))));
	//   16   32:aload_1         
	//   17   33:ldc1            #62  <String "; weight:">
	//   18   35:invokevirtual   #54  <Method StringBuilder StringBuilder.append(String)>
	//   19   38:new             #64  <Class BigDecimal>
	//   20   41:dup             
	//   21   42:aload_0         
	//   22   43:getfield        #26  <Field float weight>
	//   23   46:f2d             
	//   24   47:invokespecial   #67  <Method void BigDecimal(double)>
	//   25   50:invokevirtual   #70  <Method StringBuilder StringBuilder.append(Object)>
	//   26   53:pop             
		stringbuilder.append("]");
	//   27   54:aload_1         
	//   28   55:ldc1            #72  <String "]">
	//   29   57:invokevirtual   #54  <Method StringBuilder StringBuilder.append(String)>
	//   30   60:pop             
		return stringbuilder.toString();
	//   31   61:aload_1         
	//   32   62:invokevirtual   #73  <Method String StringBuilder.toString()>
	//   33   65:areturn         
	}

	public final ResolveInfo resolveInfo;
	public float weight;

	public ActivityChooserModel$ActivityResolveInfo(ResolveInfo resolveinfo)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void Object()>
		resolveInfo = resolveinfo;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #21  <Field ResolveInfo resolveInfo>
	//    5    9:return          
	}
}

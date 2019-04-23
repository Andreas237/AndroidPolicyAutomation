// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.content.pm.ResolveInfo;
import java.math.BigDecimal;

public final class ActivityChooserModel$ActivityResolveInfo
	implements Comparable
{

	public int compareTo(ActivityChooserModel$ActivityResolveInfo activitychoosermodel$activityresolveinfo)
	{
		return Float.floatToIntBits(activitychoosermodel$activityresolveinfo.weight) - Float.floatToIntBits(weight);
	//    0    0:aload_1         
	//    1    1:getfield        #22  <Field float weight>
	//    2    4:invokestatic    #28  <Method int Float.floatToIntBits(float)>
	//    3    7:aload_0         
	//    4    8:getfield        #22  <Field float weight>
	//    5   11:invokestatic    #28  <Method int Float.floatToIntBits(float)>
	//    6   14:isub            
	//    7   15:ireturn         
	}

	public volatile int compareTo(Object obj)
	{
		return compareTo((ActivityChooserModel$ActivityResolveInfo)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #2   <Class ActivityChooserModel$ActivityResolveInfo>
	//    3    5:invokevirtual   #31  <Method int compareTo(ActivityChooserModel$ActivityResolveInfo)>
	//    4    8:ireturn         
	}

	public boolean equals(Object obj)
	{
		if(this == obj)
	//*   0    0:aload_0         
	//*   1    1:aload_1         
	//*   2    2:if_acmpne       7
			return true;
	//    3    5:iconst_1        
	//    4    6:ireturn         
		if(obj == null)
	//*   5    7:aload_1         
	//*   6    8:ifnonnull       13
			return false;
	//    7   11:iconst_0        
	//    8   12:ireturn         
		if(((Object)this).getClass() != obj.getClass())
	//*   9   13:aload_0         
	//*  10   14:invokevirtual   #37  <Method Class Object.getClass()>
	//*  11   17:aload_1         
	//*  12   18:invokevirtual   #37  <Method Class Object.getClass()>
	//*  13   21:if_acmpeq       26
			return false;
	//   14   24:iconst_0        
	//   15   25:ireturn         
		obj = ((Object) ((ActivityChooserModel$ActivityResolveInfo)obj));
	//   16   26:aload_1         
	//   17   27:checkcast       #2   <Class ActivityChooserModel$ActivityResolveInfo>
	//   18   30:astore_1        
		return Float.floatToIntBits(weight) == Float.floatToIntBits(((ActivityChooserModel$ActivityResolveInfo) (obj)).weight);
	//   19   31:aload_0         
	//   20   32:getfield        #22  <Field float weight>
	//   21   35:invokestatic    #28  <Method int Float.floatToIntBits(float)>
	//   22   38:aload_1         
	//   23   39:getfield        #22  <Field float weight>
	//   24   42:invokestatic    #28  <Method int Float.floatToIntBits(float)>
	//   25   45:icmpeq          50
	//   26   48:iconst_0        
	//   27   49:ireturn         
	//   28   50:iconst_1        
	//   29   51:ireturn         
	}

	public int hashCode()
	{
		return Float.floatToIntBits(weight) + 31;
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field float weight>
	//    2    4:invokestatic    #28  <Method int Float.floatToIntBits(float)>
	//    3    7:bipush          31
	//    4    9:iadd            
	//    5   10:ireturn         
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #43  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #44  <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append("[");
	//    4    8:aload_1         
	//    5    9:ldc1            #46  <String "[">
	//    6   11:invokevirtual   #50  <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		stringbuilder.append("resolveInfo:");
	//    8   15:aload_1         
	//    9   16:ldc1            #52  <String "resolveInfo:">
	//   10   18:invokevirtual   #50  <Method StringBuilder StringBuilder.append(String)>
	//   11   21:pop             
		stringbuilder.append(resolveInfo.toString());
	//   12   22:aload_1         
	//   13   23:aload_0         
	//   14   24:getfield        #17  <Field ResolveInfo resolveInfo>
	//   15   27:invokevirtual   #56  <Method String ResolveInfo.toString()>
	//   16   30:invokevirtual   #50  <Method StringBuilder StringBuilder.append(String)>
	//   17   33:pop             
		stringbuilder.append("; weight:");
	//   18   34:aload_1         
	//   19   35:ldc1            #58  <String "; weight:">
	//   20   37:invokevirtual   #50  <Method StringBuilder StringBuilder.append(String)>
	//   21   40:pop             
		stringbuilder.append(((Object) (new BigDecimal(weight))));
	//   22   41:aload_1         
	//   23   42:new             #60  <Class BigDecimal>
	//   24   45:dup             
	//   25   46:aload_0         
	//   26   47:getfield        #22  <Field float weight>
	//   27   50:f2d             
	//   28   51:invokespecial   #63  <Method void BigDecimal(double)>
	//   29   54:invokevirtual   #66  <Method StringBuilder StringBuilder.append(Object)>
	//   30   57:pop             
		stringbuilder.append("]");
	//   31   58:aload_1         
	//   32   59:ldc1            #68  <String "]">
	//   33   61:invokevirtual   #50  <Method StringBuilder StringBuilder.append(String)>
	//   34   64:pop             
		return stringbuilder.toString();
	//   35   65:aload_1         
	//   36   66:invokevirtual   #69  <Method String StringBuilder.toString()>
	//   37   69:areturn         
	}

	public final ResolveInfo resolveInfo;
	public float weight;

	public ActivityChooserModel$ActivityResolveInfo(ResolveInfo resolveinfo)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
		resolveInfo = resolveinfo;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #17  <Field ResolveInfo resolveInfo>
	//    5    9:return          
	}
}

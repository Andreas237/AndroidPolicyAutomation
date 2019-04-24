// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.content.pm.ResolveInfo;
import java.math.BigDecimal;

// Referenced classes of package android.support.v7.widget:
//			ActivityChooserModel

public final class ActivityChooserModel$ActivityResolveInfo
	implements Comparable
{

	public int compareTo(ActivityChooserModel$ActivityResolveInfo activitychoosermodel$activityresolveinfo)
	{
		return Float.floatToIntBits(activitychoosermodel$activityresolveinfo.weight) - Float.floatToIntBits(weight);
	//    0    0:aload_1         
	//    1    1:getfield        #30  <Field float weight>
	//    2    4:invokestatic    #36  <Method int Float.floatToIntBits(float)>
	//    3    7:aload_0         
	//    4    8:getfield        #30  <Field float weight>
	//    5   11:invokestatic    #36  <Method int Float.floatToIntBits(float)>
	//    6   14:isub            
	//    7   15:ireturn         
	}

	public volatile int compareTo(Object obj)
	{
		return compareTo((ActivityChooserModel$ActivityResolveInfo)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #2   <Class ActivityChooserModel$ActivityResolveInfo>
	//    3    5:invokevirtual   #39  <Method int compareTo(ActivityChooserModel$ActivityResolveInfo)>
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
	//*  10   14:invokevirtual   #45  <Method Class Object.getClass()>
	//*  11   17:aload_1         
	//*  12   18:invokevirtual   #45  <Method Class Object.getClass()>
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
	//   20   32:getfield        #30  <Field float weight>
	//   21   35:invokestatic    #36  <Method int Float.floatToIntBits(float)>
	//   22   38:aload_1         
	//   23   39:getfield        #30  <Field float weight>
	//   24   42:invokestatic    #36  <Method int Float.floatToIntBits(float)>
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
	//    1    1:getfield        #30  <Field float weight>
	//    2    4:invokestatic    #36  <Method int Float.floatToIntBits(float)>
	//    3    7:bipush          31
	//    4    9:iadd            
	//    5   10:ireturn         
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #51  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #52  <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append("[");
	//    4    8:aload_1         
	//    5    9:ldc1            #54  <String "[">
	//    6   11:invokevirtual   #58  <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		stringbuilder.append("resolveInfo:").append(resolveInfo.toString());
	//    8   15:aload_1         
	//    9   16:ldc1            #60  <String "resolveInfo:">
	//   10   18:invokevirtual   #58  <Method StringBuilder StringBuilder.append(String)>
	//   11   21:aload_0         
	//   12   22:getfield        #25  <Field ResolveInfo resolveInfo>
	//   13   25:invokevirtual   #64  <Method String ResolveInfo.toString()>
	//   14   28:invokevirtual   #58  <Method StringBuilder StringBuilder.append(String)>
	//   15   31:pop             
		stringbuilder.append("; weight:").append(((Object) (new BigDecimal(weight))));
	//   16   32:aload_1         
	//   17   33:ldc1            #66  <String "; weight:">
	//   18   35:invokevirtual   #58  <Method StringBuilder StringBuilder.append(String)>
	//   19   38:new             #68  <Class BigDecimal>
	//   20   41:dup             
	//   21   42:aload_0         
	//   22   43:getfield        #30  <Field float weight>
	//   23   46:f2d             
	//   24   47:invokespecial   #71  <Method void BigDecimal(double)>
	//   25   50:invokevirtual   #74  <Method StringBuilder StringBuilder.append(Object)>
	//   26   53:pop             
		stringbuilder.append("]");
	//   27   54:aload_1         
	//   28   55:ldc1            #76  <String "]">
	//   29   57:invokevirtual   #58  <Method StringBuilder StringBuilder.append(String)>
	//   30   60:pop             
		return stringbuilder.toString();
	//   31   61:aload_1         
	//   32   62:invokevirtual   #77  <Method String StringBuilder.toString()>
	//   33   65:areturn         
	}

	public final ResolveInfo resolveInfo;
	final ActivityChooserModel this$0;
	public float weight;

	public ActivityChooserModel$ActivityResolveInfo(ResolveInfo resolveinfo)
	{
		this$0 = ActivityChooserModel.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #20  <Field ActivityChooserModel this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #23  <Method void Object()>
		resolveInfo = resolveinfo;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #25  <Field ResolveInfo resolveInfo>
	//    8   14:return          
	}
}

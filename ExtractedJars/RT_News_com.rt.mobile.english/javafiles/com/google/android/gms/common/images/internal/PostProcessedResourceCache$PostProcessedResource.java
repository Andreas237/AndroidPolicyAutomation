// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.images.internal;

import com.google.android.gms.common.internal.Objects;

// Referenced classes of package com.google.android.gms.common.images.internal:
//			PostProcessedResourceCache

public static final class PostProcessedResourceCache$PostProcessedResource
{

	public final boolean equals(Object obj)
	{
		if(!(obj instanceof PostProcessedResourceCache$PostProcessedResource))
	//*   0    0:aload_1         
	//*   1    1:instanceof      #2   <Class PostProcessedResourceCache$PostProcessedResource>
	//*   2    4:ifne            9
			return false;
	//    3    7:iconst_0        
	//    4    8:ireturn         
		if(this == obj)
	//*   5    9:aload_0         
	//*   6   10:aload_1         
	//*   7   11:if_acmpne       16
			return true;
	//    8   14:iconst_1        
	//    9   15:ireturn         
		obj = ((Object) ((PostProcessedResourceCache$PostProcessedResource)obj));
	//   10   16:aload_1         
	//   11   17:checkcast       #2   <Class PostProcessedResourceCache$PostProcessedResource>
	//   12   20:astore_1        
		return ((PostProcessedResourceCache$PostProcessedResource) (obj)).resId == resId && ((PostProcessedResourceCache$PostProcessedResource) (obj)).postProcessingFlags == postProcessingFlags;
	//   13   21:aload_1         
	//   14   22:getfield        #17  <Field int resId>
	//   15   25:aload_0         
	//   16   26:getfield        #17  <Field int resId>
	//   17   29:icmpne          45
	//   18   32:aload_1         
	//   19   33:getfield        #19  <Field int postProcessingFlags>
	//   20   36:aload_0         
	//   21   37:getfield        #19  <Field int postProcessingFlags>
	//   22   40:icmpne          45
	//   23   43:iconst_1        
	//   24   44:ireturn         
	//   25   45:iconst_0        
	//   26   46:ireturn         
	}

	public final int hashCode()
	{
		return Objects.hashCode(new Object[] {
			Integer.valueOf(resId), Integer.valueOf(postProcessingFlags)
		});
	//    0    0:iconst_2        
	//    1    1:anewarray       Object[]
	//    2    4:dup             
	//    3    5:iconst_0        
	//    4    6:aload_0         
	//    5    7:getfield        #17  <Field int resId>
	//    6   10:invokestatic    #30  <Method Integer Integer.valueOf(int)>
	//    7   13:aastore         
	//    8   14:dup             
	//    9   15:iconst_1        
	//   10   16:aload_0         
	//   11   17:getfield        #19  <Field int postProcessingFlags>
	//   12   20:invokestatic    #30  <Method Integer Integer.valueOf(int)>
	//   13   23:aastore         
	//   14   24:invokestatic    #35  <Method int Objects.hashCode(Object[])>
	//   15   27:ireturn         
	}

	public final int postProcessingFlags;
	public final int resId;

	public PostProcessedResourceCache$PostProcessedResource(int i, int j)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
		resId = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #17  <Field int resId>
		postProcessingFlags = j;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #19  <Field int postProcessingFlags>
	//    8   14:return          
	}
}

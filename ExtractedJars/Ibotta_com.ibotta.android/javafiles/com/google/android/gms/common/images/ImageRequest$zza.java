// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.images;

import android.net.Uri;
import com.google.android.gms.common.internal.Objects;

// Referenced classes of package com.google.android.gms.common.images:
//			ImageRequest

static final class ImageRequest$zza
{

	public final boolean equals(Object obj)
	{
		if(!(obj instanceof ImageRequest$zza))
	//*   0    0:aload_1         
	//*   1    1:instanceof      #2   <Class ImageRequest$zza>
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
		else
			return Objects.equal(((Object) (((ImageRequest$zza)obj).uri)), ((Object) (uri)));
	//   10   16:aload_1         
	//   11   17:checkcast       #2   <Class ImageRequest$zza>
	//   12   20:getfield        #16  <Field Uri uri>
	//   13   23:aload_0         
	//   14   24:getfield        #16  <Field Uri uri>
	//   15   27:invokestatic    #25  <Method boolean Objects.equal(Object, Object)>
	//   16   30:ireturn         
	}

	public final int hashCode()
	{
		return Objects.hashCode(new Object[] {
			uri
		});
	//    0    0:iconst_1        
	//    1    1:anewarray       Object[]
	//    2    4:dup             
	//    3    5:iconst_0        
	//    4    6:aload_0         
	//    5    7:getfield        #16  <Field Uri uri>
	//    6   10:aastore         
	//    7   11:invokestatic    #30  <Method int Objects.hashCode(Object[])>
	//    8   14:ireturn         
	}

	public final Uri uri;

	public ImageRequest$zza(Uri uri1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
		uri = uri1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #16  <Field Uri uri>
	//    5    9:return          
	}
}

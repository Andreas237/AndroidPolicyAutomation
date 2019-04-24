// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.Intent;

// Referenced classes of package com.google.android.gms.common.internal:
//			zzo, zzac, zzaa

private static final class zzo$zza
{

	public boolean equals(Object obj)
	{
		if(this != obj)
	//*   0    0:aload_0         
	//*   1    1:aload_1         
	//*   2    2:if_acmpne       7
	//*   3    5:iconst_1        
	//*   4    6:ireturn         
		{
			if(!(obj instanceof zzo$zza))
	//*   5    7:aload_1         
	//*   6    8:instanceof      #2   <Class zzo$zza>
	//*   7   11:ifne            16
				return false;
	//    8   14:iconst_0        
	//    9   15:ireturn         
			obj = ((Object) ((zzo$zza)obj));
	//   10   16:aload_1         
	//   11   17:checkcast       #2   <Class zzo$zza>
	//   12   20:astore_1        
			if(!zzaa.equal(((Object) (zzaca)), ((Object) (((zzo$zza) (obj)).zzaca))) || !zzaa.equal(((Object) (zzaEJ)), ((Object) (((zzo$zza) (obj)).zzaEJ))))
	//*  13   21:aload_0         
	//*  14   22:getfield        #19  <Field String zzaca>
	//*  15   25:aload_1         
	//*  16   26:getfield        #19  <Field String zzaca>
	//*  17   29:invokestatic    #45  <Method boolean zzaa.equal(Object, Object)>
	//*  18   32:ifeq            49
	//*  19   35:aload_0         
	//*  20   36:getfield        #31  <Field ComponentName zzaEJ>
	//*  21   39:aload_1         
	//*  22   40:getfield        #31  <Field ComponentName zzaEJ>
	//*  23   43:invokestatic    #45  <Method boolean zzaa.equal(Object, Object)>
	//*  24   46:ifne            5
				return false;
	//   25   49:iconst_0        
	//   26   50:ireturn         
		}
		return true;
	}

	public int hashCode()
	{
		return zzaa.hashCode(new Object[] {
			zzaca, zzaEJ
		});
	//    0    0:iconst_2        
	//    1    1:anewarray       Object[]
	//    2    4:dup             
	//    3    5:iconst_0        
	//    4    6:aload_0         
	//    5    7:getfield        #19  <Field String zzaca>
	//    6   10:aastore         
	//    7   11:dup             
	//    8   12:iconst_1        
	//    9   13:aload_0         
	//   10   14:getfield        #31  <Field ComponentName zzaEJ>
	//   11   17:aastore         
	//   12   18:invokestatic    #50  <Method int zzaa.hashCode(Object[])>
	//   13   21:ireturn         
	}

	public String toString()
	{
		if(zzaca == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #19  <Field String zzaca>
	//*   2    4:ifnonnull       15
			return zzaEJ.flattenToString();
	//    3    7:aload_0         
	//    4    8:getfield        #31  <Field ComponentName zzaEJ>
	//    5   11:invokevirtual   #55  <Method String ComponentName.flattenToString()>
	//    6   14:areturn         
		else
			return zzaca;
	//    7   15:aload_0         
	//    8   16:getfield        #19  <Field String zzaca>
	//    9   19:areturn         
	}

	public Intent zzxs()
	{
		if(zzaca != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #19  <Field String zzaca>
	//*   2    4:ifnull          26
			return (new Intent(zzaca)).setPackage(zzaEI);
	//    3    7:new             #59  <Class Intent>
	//    4   10:dup             
	//    5   11:aload_0         
	//    6   12:getfield        #19  <Field String zzaca>
	//    7   15:invokespecial   #62  <Method void Intent(String)>
	//    8   18:aload_0         
	//    9   19:getfield        #21  <Field String zzaEI>
	//   10   22:invokevirtual   #66  <Method Intent Intent.setPackage(String)>
	//   11   25:areturn         
		else
			return (new Intent()).setComponent(zzaEJ);
	//   12   26:new             #59  <Class Intent>
	//   13   29:dup             
	//   14   30:invokespecial   #67  <Method void Intent()>
	//   15   33:aload_0         
	//   16   34:getfield        #31  <Field ComponentName zzaEJ>
	//   17   37:invokevirtual   #71  <Method Intent Intent.setComponent(ComponentName)>
	//   18   40:areturn         
	}

	private final String zzaEI;
	private final ComponentName zzaEJ;
	private final String zzaca;

	public zzo$zza(ComponentName componentname)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
		zzaca = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #19  <Field String zzaca>
		zzaEI = null;
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:putfield        #21  <Field String zzaEI>
		zzaEJ = (ComponentName)zzac.zzw(((Object) (componentname)));
	//    8   14:aload_0         
	//    9   15:aload_1         
	//   10   16:invokestatic    #27  <Method Object zzac.zzw(Object)>
	//   11   19:checkcast       #29  <Class ComponentName>
	//   12   22:putfield        #31  <Field ComponentName zzaEJ>
	//   13   25:return          
	}

	public zzo$zza(String s, String s1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
		zzaca = zzac.zzdv(s);
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokestatic    #37  <Method String zzac.zzdv(String)>
	//    5    9:putfield        #19  <Field String zzaca>
		zzaEI = zzac.zzdv(s1);
	//    6   12:aload_0         
	//    7   13:aload_2         
	//    8   14:invokestatic    #37  <Method String zzac.zzdv(String)>
	//    9   17:putfield        #21  <Field String zzaEI>
		zzaEJ = null;
	//   10   20:aload_0         
	//   11   21:aconst_null     
	//   12   22:putfield        #31  <Field ComponentName zzaEJ>
	//   13   25:return          
	}
}

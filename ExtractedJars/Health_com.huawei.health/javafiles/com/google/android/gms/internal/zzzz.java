// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.internal.zzaa;

public final class zzzz
{

	private zzzz(Api api)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #20  <Method void Object()>
		zzazL = true;
	//    2    4:aload_0         
	//    3    5:iconst_1        
	//    4    6:putfield        #22  <Field boolean zzazL>
		zzaxf = api;
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:putfield        #24  <Field Api zzaxf>
		zzayT = null;
	//    8   14:aload_0         
	//    9   15:aconst_null     
	//   10   16:putfield        #26  <Field com.google.android.gms.common.api.Api$ApiOptions zzayT>
		zzazM = System.identityHashCode(((Object) (this)));
	//   11   19:aload_0         
	//   12   20:aload_0         
	//   13   21:invokestatic    #32  <Method int System.identityHashCode(Object)>
	//   14   24:putfield        #34  <Field int zzazM>
	//   15   27:return          
	}

	private zzzz(Api api, com.google.android.gms.common.api.Api.ApiOptions apioptions)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #20  <Method void Object()>
		zzazL = false;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #22  <Field boolean zzazL>
		zzaxf = api;
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:putfield        #24  <Field Api zzaxf>
		zzayT = apioptions;
	//    8   14:aload_0         
	//    9   15:aload_2         
	//   10   16:putfield        #26  <Field com.google.android.gms.common.api.Api$ApiOptions zzayT>
		zzazM = zzaa.hashCode(new Object[] {
			zzaxf, zzayT
		});
	//   11   19:aload_0         
	//   12   20:iconst_2        
	//   13   21:anewarray       Object[]
	//   14   24:dup             
	//   15   25:iconst_0        
	//   16   26:aload_0         
	//   17   27:getfield        #24  <Field Api zzaxf>
	//   18   30:aastore         
	//   19   31:dup             
	//   20   32:iconst_1        
	//   21   33:aload_0         
	//   22   34:getfield        #26  <Field com.google.android.gms.common.api.Api$ApiOptions zzayT>
	//   23   37:aastore         
	//   24   38:invokestatic    #44  <Method int zzaa.hashCode(Object[])>
	//   25   41:putfield        #34  <Field int zzazM>
	//   26   44:return          
	}

	public static zzzz zza(Api api, com.google.android.gms.common.api.Api.ApiOptions apioptions)
	{
		return new zzzz(api, apioptions);
	//    0    0:new             #2   <Class zzzz>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokespecial   #49  <Method void zzzz(Api, com.google.android.gms.common.api.Api$ApiOptions)>
	//    5    9:areturn         
	}

	public static zzzz zzb(Api api)
	{
		return new zzzz(api);
	//    0    0:new             #2   <Class zzzz>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #54  <Method void zzzz(Api)>
	//    4    8:areturn         
	}

	public boolean equals(Object obj)
	{
		if(obj == this)
	//*   0    0:aload_1         
	//*   1    1:aload_0         
	//*   2    2:if_acmpne       7
			return true;
	//    3    5:iconst_1        
	//    4    6:ireturn         
		if(!(obj instanceof zzzz))
	//*   5    7:aload_1         
	//*   6    8:instanceof      #2   <Class zzzz>
	//*   7   11:ifne            16
			return false;
	//    8   14:iconst_0        
	//    9   15:ireturn         
		obj = ((Object) ((zzzz)obj));
	//   10   16:aload_1         
	//   11   17:checkcast       #2   <Class zzzz>
	//   12   20:astore_1        
		return !zzazL && !((zzzz) (obj)).zzazL && zzaa.equal(((Object) (zzaxf)), ((Object) (((zzzz) (obj)).zzaxf))) && zzaa.equal(((Object) (zzayT)), ((Object) (((zzzz) (obj)).zzayT)));
	//   13   21:aload_0         
	//   14   22:getfield        #22  <Field boolean zzazL>
	//   15   25:ifne            65
	//   16   28:aload_1         
	//   17   29:getfield        #22  <Field boolean zzazL>
	//   18   32:ifne            65
	//   19   35:aload_0         
	//   20   36:getfield        #24  <Field Api zzaxf>
	//   21   39:aload_1         
	//   22   40:getfield        #24  <Field Api zzaxf>
	//   23   43:invokestatic    #61  <Method boolean zzaa.equal(Object, Object)>
	//   24   46:ifeq            65
	//   25   49:aload_0         
	//   26   50:getfield        #26  <Field com.google.android.gms.common.api.Api$ApiOptions zzayT>
	//   27   53:aload_1         
	//   28   54:getfield        #26  <Field com.google.android.gms.common.api.Api$ApiOptions zzayT>
	//   29   57:invokestatic    #61  <Method boolean zzaa.equal(Object, Object)>
	//   30   60:ifeq            65
	//   31   63:iconst_1        
	//   32   64:ireturn         
	//   33   65:iconst_0        
	//   34   66:ireturn         
	}

	public int hashCode()
	{
		return zzazM;
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field int zzazM>
	//    2    4:ireturn         
	}

	public String zzvw()
	{
		return zzaxf.getName();
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field Api zzaxf>
	//    2    4:invokevirtual   #69  <Method String Api.getName()>
	//    3    7:areturn         
	}

	private final Api zzaxf;
	private final com.google.android.gms.common.api.Api.ApiOptions zzayT;
	private final boolean zzazL;
	private final int zzazM;
}

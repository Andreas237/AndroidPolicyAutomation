// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.internal.zzaa;

public final class zzzs
{

	private zzzs(Api api)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #20  <Method void Object()>
		zzayv = true;
	//    2    4:aload_0         
	//    3    5:iconst_1        
	//    4    6:putfield        #22  <Field boolean zzayv>
		zzawb = api;
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:putfield        #24  <Field Api zzawb>
		zzaxG = null;
	//    8   14:aload_0         
	//    9   15:aconst_null     
	//   10   16:putfield        #26  <Field com.google.android.gms.common.api.Api$ApiOptions zzaxG>
		zzayw = System.identityHashCode(((Object) (this)));
	//   11   19:aload_0         
	//   12   20:aload_0         
	//   13   21:invokestatic    #32  <Method int System.identityHashCode(Object)>
	//   14   24:putfield        #34  <Field int zzayw>
	//   15   27:return          
	}

	private zzzs(Api api, com.google.android.gms.common.api.Api.ApiOptions apioptions)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #20  <Method void Object()>
		zzayv = false;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #22  <Field boolean zzayv>
		zzawb = api;
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:putfield        #24  <Field Api zzawb>
		zzaxG = apioptions;
	//    8   14:aload_0         
	//    9   15:aload_2         
	//   10   16:putfield        #26  <Field com.google.android.gms.common.api.Api$ApiOptions zzaxG>
		zzayw = zzaa.hashCode(new Object[] {
			zzawb, zzaxG
		});
	//   11   19:aload_0         
	//   12   20:iconst_2        
	//   13   21:anewarray       Object[]
	//   14   24:dup             
	//   15   25:iconst_0        
	//   16   26:aload_0         
	//   17   27:getfield        #24  <Field Api zzawb>
	//   18   30:aastore         
	//   19   31:dup             
	//   20   32:iconst_1        
	//   21   33:aload_0         
	//   22   34:getfield        #26  <Field com.google.android.gms.common.api.Api$ApiOptions zzaxG>
	//   23   37:aastore         
	//   24   38:invokestatic    #44  <Method int zzaa.hashCode(Object[])>
	//   25   41:putfield        #34  <Field int zzayw>
	//   26   44:return          
	}

	public static zzzs zza(Api api, com.google.android.gms.common.api.Api.ApiOptions apioptions)
	{
		return new zzzs(api, apioptions);
	//    0    0:new             #2   <Class zzzs>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokespecial   #49  <Method void zzzs(Api, com.google.android.gms.common.api.Api$ApiOptions)>
	//    5    9:areturn         
	}

	public static zzzs zzb(Api api)
	{
		return new zzzs(api);
	//    0    0:new             #2   <Class zzzs>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #54  <Method void zzzs(Api)>
	//    4    8:areturn         
	}

	public boolean equals(Object obj)
	{
		if(obj != this)
	//*   0    0:aload_1         
	//*   1    1:aload_0         
	//*   2    2:if_acmpne       7
	//*   3    5:iconst_1        
	//*   4    6:ireturn         
		{
			if(!(obj instanceof zzzs))
	//*   5    7:aload_1         
	//*   6    8:instanceof      #2   <Class zzzs>
	//*   7   11:ifne            16
				return false;
	//    8   14:iconst_0        
	//    9   15:ireturn         
			obj = ((Object) ((zzzs)obj));
	//   10   16:aload_1         
	//   11   17:checkcast       #2   <Class zzzs>
	//   12   20:astore_1        
			if(zzayv || ((zzzs) (obj)).zzayv || !zzaa.equal(((Object) (zzawb)), ((Object) (((zzzs) (obj)).zzawb))) || !zzaa.equal(((Object) (zzaxG)), ((Object) (((zzzs) (obj)).zzaxG))))
	//*  13   21:aload_0         
	//*  14   22:getfield        #22  <Field boolean zzayv>
	//*  15   25:ifne            63
	//*  16   28:aload_1         
	//*  17   29:getfield        #22  <Field boolean zzayv>
	//*  18   32:ifne            63
	//*  19   35:aload_0         
	//*  20   36:getfield        #24  <Field Api zzawb>
	//*  21   39:aload_1         
	//*  22   40:getfield        #24  <Field Api zzawb>
	//*  23   43:invokestatic    #61  <Method boolean zzaa.equal(Object, Object)>
	//*  24   46:ifeq            63
	//*  25   49:aload_0         
	//*  26   50:getfield        #26  <Field com.google.android.gms.common.api.Api$ApiOptions zzaxG>
	//*  27   53:aload_1         
	//*  28   54:getfield        #26  <Field com.google.android.gms.common.api.Api$ApiOptions zzaxG>
	//*  29   57:invokestatic    #61  <Method boolean zzaa.equal(Object, Object)>
	//*  30   60:ifne            5
				return false;
	//   31   63:iconst_0        
	//   32   64:ireturn         
		}
		return true;
	}

	public int hashCode()
	{
		return zzayw;
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field int zzayw>
	//    2    4:ireturn         
	}

	public String zzuV()
	{
		return zzawb.getName();
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field Api zzawb>
	//    2    4:invokevirtual   #69  <Method String Api.getName()>
	//    3    7:areturn         
	}

	private final Api zzawb;
	private final com.google.android.gms.common.api.Api.ApiOptions zzaxG;
	private final boolean zzayv;
	private final int zzayw;
}

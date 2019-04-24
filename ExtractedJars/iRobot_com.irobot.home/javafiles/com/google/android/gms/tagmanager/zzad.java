// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.measurement.*;

// Referenced classes of package com.google.android.gms.tagmanager:
//			zzdh, zzy, zzz

final class zzad
	implements zzdh
{

	private zzad(zzy zzy1)
	{
		zzbau = zzy1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #13  <Field zzy zzbau>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #16  <Method void Object()>
	//    5    9:return          
	}

	zzad(zzy zzy1, zzz zzz)
	{
		this(zzy1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #20  <Method void zzad(zzy)>
	//    3    5:return          
	}

	public final void onSuccess(Object obj)
	{
		zzre zzre1 = (zzre)obj;
	//    0    0:aload_1         
	//    1    1:checkcast       #24  <Class zzre>
	//    2    4:astore_2        
		if(zzre1.zzbqf != null)
	//*   3    5:aload_2         
	//*   4    6:getfield        #28  <Field zzo zzre.zzbqf>
	//*   5    9:ifnull          20
		{
			obj = ((Object) (zzre1.zzbqf));
	//    6   12:aload_2         
	//    7   13:getfield        #28  <Field zzo zzre.zzbqf>
	//    8   16:astore_1        
		} else
	//*   9   17:goto            51
		{
			zzl zzl1 = zzre1.zzqg;
	//   10   20:aload_2         
	//   11   21:getfield        #32  <Field zzl zzre.zzqg>
	//   12   24:astore_3        
			obj = ((Object) (new zzo()));
	//   13   25:new             #34  <Class zzo>
	//   14   28:dup             
	//   15   29:invokespecial   #35  <Method void zzo()>
	//   16   32:astore_1        
			obj.zzqg = zzl1;
	//   17   33:aload_1         
	//   18   34:aload_3         
	//   19   35:putfield        #36  <Field zzl zzo.zzqg>
			obj.zzqf = null;
	//   20   38:aload_1         
	//   21   39:aconst_null     
	//   22   40:putfield        #40  <Field com.google.android.gms.internal.measurement.zzn[] zzo.zzqf>
			obj.zzqh = zzl1.version;
	//   23   43:aload_1         
	//   24   44:aload_3         
	//   25   45:getfield        #46  <Field String zzl.version>
	//   26   48:putfield        #49  <Field String zzo.zzqh>
		}
		zzy.zza(zzbau, ((zzo) (obj)), zzre1.zzbqe, true);
	//   27   51:aload_0         
	//   28   52:getfield        #13  <Field zzy zzbau>
	//   29   55:aload_1         
	//   30   56:aload_2         
	//   31   57:getfield        #53  <Field long zzre.zzbqe>
	//   32   60:iconst_1        
	//   33   61:invokestatic    #59  <Method void zzy.zza(zzy, zzo, long, boolean)>
	//   34   64:return          
	}

	public final void zznx()
	{
	//    0    0:return          
	}

	public final void zzu(int i)
	{
		if(!zzy.zze(zzbau))
	//*   0    0:aload_0         
	//*   1    1:getfield        #13  <Field zzy zzbau>
	//*   2    4:invokestatic    #66  <Method boolean zzy.zze(zzy)>
	//*   3    7:ifne            18
			zzy.zza(zzbau, 0L);
	//    4   10:aload_0         
	//    5   11:getfield        #13  <Field zzy zzbau>
	//    6   14:lconst_0        
	//    7   15:invokestatic    #69  <Method void zzy.zza(zzy, long)>
	//    8   18:return          
	}

	private final zzy zzbau;
}

// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzbbu, zzaxr, zzaxi, zzauh

public final class zzaul
{

	public static final zzauh zzh(byte abyte0[])
		throws GeneralSecurityException
	{
		try
		{
			abyte0 = ((byte []) (zzaxr.zzj(abyte0)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #17  <Method zzaxr zzaxr.zzj(byte[])>
	//    2    4:astore_0        
			for(Iterator iterator = ((zzaxr) (abyte0)).zzzl().iterator(); iterator.hasNext();)
	//*   3    5:aload_0         
	//*   4    6:invokevirtual   #21  <Method List zzaxr.zzzl()>
	//*   5    9:invokeinterface #27  <Method Iterator List.iterator()>
	//*   6   14:astore_1        
	//*   7   15:aload_1         
	//*   8   16:invokeinterface #33  <Method boolean Iterator.hasNext()>
	//*   9   21:ifeq            83
			{
				zzaxr.zzb zzb = (zzaxr.zzb)iterator.next();
	//   10   24:aload_1         
	//   11   25:invokeinterface #37  <Method Object Iterator.next()>
	//   12   30:checkcast       #39  <Class zzaxr$zzb>
	//   13   33:astore_2        
				if(zzb.zzzp().zzyy() == zzaxi.zzb.zzdkw || zzb.zzzp().zzyy() == zzaxi.zzb.zzdkx || zzb.zzzp().zzyy() == zzaxi.zzb.zzdky)
	//*  14   34:aload_2         
	//*  15   35:invokevirtual   #43  <Method zzaxi zzaxr$zzb.zzzp()>
	//*  16   38:invokevirtual   #49  <Method zzaxi$zzb zzaxi.zzyy()>
	//*  17   41:getstatic       #55  <Field zzaxi$zzb zzaxi$zzb.zzdkw>
	//*  18   44:if_acmpeq       73
	//*  19   47:aload_2         
	//*  20   48:invokevirtual   #43  <Method zzaxi zzaxr$zzb.zzzp()>
	//*  21   51:invokevirtual   #49  <Method zzaxi$zzb zzaxi.zzyy()>
	//*  22   54:getstatic       #58  <Field zzaxi$zzb zzaxi$zzb.zzdkx>
	//*  23   57:if_acmpeq       73
	//*  24   60:aload_2         
	//*  25   61:invokevirtual   #43  <Method zzaxi zzaxr$zzb.zzzp()>
	//*  26   64:invokevirtual   #49  <Method zzaxi$zzb zzaxi.zzyy()>
	//*  27   67:getstatic       #61  <Field zzaxi$zzb zzaxi$zzb.zzdky>
	//*  28   70:if_acmpne       15
					throw new GeneralSecurityException("keyset contains secret key material");
	//   29   73:new             #8   <Class GeneralSecurityException>
	//   30   76:dup             
	//   31   77:ldc1            #63  <String "keyset contains secret key material">
	//   32   79:invokespecial   #67  <Method void GeneralSecurityException(String)>
	//   33   82:athrow          
			}

			abyte0 = ((byte []) (zzauh.zza(((zzaxr) (abyte0)))));
	//   34   83:aload_0         
	//   35   84:invokestatic    #73  <Method zzauh zzauh.zza(zzaxr)>
	//   36   87:astore_0        
		}
	//*  37   88:aload_0         
	//*  38   89:areturn         
	//*  39   90:new             #8   <Class GeneralSecurityException>
	//*  40   93:dup             
	//*  41   94:ldc1            #75  <String "invalid keyset">
	//*  42   96:invokespecial   #67  <Method void GeneralSecurityException(String)>
	//*  43   99:athrow          
		// Misplaced declaration of an exception variable
		catch(byte abyte0[])
		{
			throw new GeneralSecurityException("invalid keyset");
		}
		return ((zzauh) (abyte0));
	//*  44  100:astore_0        
	//*  45  101:goto            90
	}
}

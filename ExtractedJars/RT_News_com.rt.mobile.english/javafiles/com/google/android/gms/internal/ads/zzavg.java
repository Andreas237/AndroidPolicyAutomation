// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzauf, zzaum, zzaun, zzayk

final class zzavg
	implements zzauf
{

	zzavg(zzaum zzaum1)
	{
		zzdhy = zzaum1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #12  <Field zzaum zzdhy>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #15  <Method void Object()>
	//    5    9:return          
	}

	public final byte[] zzc(byte abyte0[], byte abyte1[])
		throws GeneralSecurityException
	{
		return zzayk.zza(new byte[][] {
			zzdhy.zzwh().zzwj(), ((zzauf)zzdhy.zzwh().zzwi()).zzc(abyte0, abyte1)
		});
	//    0    0:iconst_2        
	//    1    1:anewarray       byte[][]
	//    2    4:dup             
	//    3    5:iconst_0        
	//    4    6:aload_0         
	//    5    7:getfield        #12  <Field zzaum zzdhy>
	//    6   10:invokevirtual   #28  <Method zzaun zzaum.zzwh()>
	//    7   13:invokevirtual   #34  <Method byte[] zzaun.zzwj()>
	//    8   16:aastore         
	//    9   17:dup             
	//   10   18:iconst_1        
	//   11   19:aload_0         
	//   12   20:getfield        #12  <Field zzaum zzdhy>
	//   13   23:invokevirtual   #28  <Method zzaun zzaum.zzwh()>
	//   14   26:invokevirtual   #38  <Method Object zzaun.zzwi()>
	//   15   29:checkcast       #6   <Class zzauf>
	//   16   32:aload_1         
	//   17   33:aload_2         
	//   18   34:invokeinterface #40  <Method byte[] zzauf.zzc(byte[], byte[])>
	//   19   39:aastore         
	//   20   40:invokestatic    #46  <Method byte[] zzayk.zza(byte[][])>
	//   21   43:areturn         
	}

	private final zzaum zzdhy;
}

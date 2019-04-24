// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzaug, zzbbu, zzawu, zzazq, 
//			zzavh, zzawq, zzaww, zzbah, 
//			zzayt, zzavj, zzawm, zzayp, 
//			zzauf, zzbcu, zzaxi

final class zzavb
	implements zzaug
{

	zzavb()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
	//    2    4:return          
	}

	private final zzauf zzg(zzbah zzbah1)
		throws GeneralSecurityException
	{
		try
		{
			zzbah1 = ((zzbah) (zzawu.zzab(zzbah1)));
	//    0    0:aload_1         
	//    1    1:invokestatic    #24  <Method zzawu zzawu.zzab(zzbah)>
	//    2    4:astore_1        
			if(!(zzbah1 instanceof zzawu))
	//*   3    5:aload_1         
	//*   4    6:instanceof      #20  <Class zzawu>
	//*   5    9:ifne            22
				throw new GeneralSecurityException("expected EciesAeadHkdfPublicKey proto");
	//    6   12:new             #16  <Class GeneralSecurityException>
	//    7   15:dup             
	//    8   16:ldc1            #26  <String "expected EciesAeadHkdfPublicKey proto">
	//    9   18:invokespecial   #29  <Method void GeneralSecurityException(String)>
	//   10   21:athrow          
			Object obj = ((Object) ((zzawu)zzbah1));
	//   11   22:aload_1         
	//   12   23:checkcast       #20  <Class zzawu>
	//   13   26:astore_3        
			zzazq.zzj(((zzawu) (obj)).getVersion(), 0);
	//   14   27:aload_3         
	//   15   28:invokevirtual   #33  <Method int zzawu.getVersion()>
	//   16   31:iconst_0        
	//   17   32:invokestatic    #39  <Method void zzazq.zzj(int, int)>
			zzavh.zza(((zzawu) (obj)).zzxs());
	//   18   35:aload_3         
	//   19   36:invokevirtual   #43  <Method zzawq zzawu.zzxs()>
	//   20   39:invokestatic    #49  <Method void zzavh.zza(zzawq)>
			zzbah1 = ((zzbah) (((zzawu) (obj)).zzxs()));
	//   21   42:aload_3         
	//   22   43:invokevirtual   #43  <Method zzawq zzawu.zzxs()>
	//   23   46:astore_1        
			zzaww zzaww1 = ((zzawq) (zzbah1)).zzxu();
	//   24   47:aload_1         
	//   25   48:invokevirtual   #55  <Method zzaww zzawq.zzxu()>
	//   26   51:astore_2        
			obj = ((Object) (zzayt.zza(zzavh.zza(zzaww1.zzyh()), ((zzawu) (obj)).zzyc().toByteArray(), ((zzawu) (obj)).zzyd().toByteArray())));
	//   27   52:aload_2         
	//   28   53:invokevirtual   #61  <Method zzawy zzaww.zzyh()>
	//   29   56:invokestatic    #64  <Method zzayv zzavh.zza(zzawy)>
	//   30   59:aload_3         
	//   31   60:invokevirtual   #68  <Method zzbah zzawu.zzyc()>
	//   32   63:invokevirtual   #74  <Method byte[] zzbah.toByteArray()>
	//   33   66:aload_3         
	//   34   67:invokevirtual   #77  <Method zzbah zzawu.zzyd()>
	//   35   70:invokevirtual   #74  <Method byte[] zzbah.toByteArray()>
	//   36   73:invokestatic    #82  <Method java.security.interfaces.ECPublicKey zzayt.zza(zzayv, byte[], byte[])>
	//   37   76:astore_3        
			zzavj zzavj1 = new zzavj(((zzawq) (zzbah1)).zzxv().zzxp());
	//   38   77:new             #84  <Class zzavj>
	//   39   80:dup             
	//   40   81:aload_1         
	//   41   82:invokevirtual   #88  <Method zzawm zzawq.zzxv()>
	//   42   85:invokevirtual   #94  <Method zzaxn zzawm.zzxp()>
	//   43   88:invokespecial   #97  <Method void zzavj(zzaxn)>
	//   44   91:astore          4
			zzbah1 = ((zzbah) ((zzauf)new zzayp(((java.security.interfaces.ECPublicKey) (obj)), zzaww1.zzyj().toByteArray(), zzavh.zza(zzaww1.zzyi()), zzavh.zza(((zzawq) (zzbah1)).zzxw()), ((zzayn) (zzavj1)))));
	//   45   93:new             #99  <Class zzayp>
	//   46   96:dup             
	//   47   97:aload_3         
	//   48   98:aload_2         
	//   49   99:invokevirtual   #102 <Method zzbah zzaww.zzyj()>
	//   50  102:invokevirtual   #74  <Method byte[] zzbah.toByteArray()>
	//   51  105:aload_2         
	//   52  106:invokevirtual   #106 <Method zzaxa zzaww.zzyi()>
	//   53  109:invokestatic    #109 <Method String zzavh.zza(zzaxa)>
	//   54  112:aload_1         
	//   55  113:invokevirtual   #113 <Method zzawk zzawq.zzxw()>
	//   56  116:invokestatic    #116 <Method zzayw zzavh.zza(zzawk)>
	//   57  119:aload           4
	//   58  121:invokespecial   #119 <Method void zzayp(java.security.interfaces.ECPublicKey, byte[], String, zzayw, zzayn)>
	//   59  124:checkcast       #121 <Class zzauf>
	//   60  127:astore_1        
		}
	//*  61  128:aload_1         
	//*  62  129:areturn         
		// Misplaced declaration of an exception variable
		catch(zzbah zzbah1)
	//*  63  130:astore_1        
		{
			throw new GeneralSecurityException("expected serialized EciesAeadHkdfPublicKey proto", ((Throwable) (zzbah1)));
	//   64  131:new             #16  <Class GeneralSecurityException>
	//   65  134:dup             
	//   66  135:ldc1            #123 <String "expected serialized EciesAeadHkdfPublicKey proto">
	//   67  137:aload_1         
	//   68  138:invokespecial   #126 <Method void GeneralSecurityException(String, Throwable)>
	//   69  141:athrow          
		}
		return ((zzauf) (zzbah1));
	}

	public final int getVersion()
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public final Object zza(zzbah zzbah1)
		throws GeneralSecurityException
	{
		return ((Object) (zzg(zzbah1)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #130 <Method zzauf zzg(zzbah)>
	//    3    5:areturn         
	}

	public final Object zza(zzbcu zzbcu)
		throws GeneralSecurityException
	{
		if(!(zzbcu instanceof zzawu))
	//*   0    0:aload_1         
	//*   1    1:instanceof      #20  <Class zzawu>
	//*   2    4:ifne            17
		{
			throw new GeneralSecurityException("expected EciesAeadHkdfPublicKey proto");
	//    3    7:new             #16  <Class GeneralSecurityException>
	//    4   10:dup             
	//    5   11:ldc1            #26  <String "expected EciesAeadHkdfPublicKey proto">
	//    6   13:invokespecial   #29  <Method void GeneralSecurityException(String)>
	//    7   16:athrow          
		} else
		{
			Object obj = ((Object) ((zzawu)zzbcu));
	//    8   17:aload_1         
	//    9   18:checkcast       #20  <Class zzawu>
	//   10   21:astore_3        
			zzazq.zzj(((zzawu) (obj)).getVersion(), 0);
	//   11   22:aload_3         
	//   12   23:invokevirtual   #33  <Method int zzawu.getVersion()>
	//   13   26:iconst_0        
	//   14   27:invokestatic    #39  <Method void zzazq.zzj(int, int)>
			zzavh.zza(((zzawu) (obj)).zzxs());
	//   15   30:aload_3         
	//   16   31:invokevirtual   #43  <Method zzawq zzawu.zzxs()>
	//   17   34:invokestatic    #49  <Method void zzavh.zza(zzawq)>
			zzbcu = ((zzbcu) (((zzawu) (obj)).zzxs()));
	//   18   37:aload_3         
	//   19   38:invokevirtual   #43  <Method zzawq zzawu.zzxs()>
	//   20   41:astore_1        
			zzaww zzaww1 = ((zzawq) (zzbcu)).zzxu();
	//   21   42:aload_1         
	//   22   43:invokevirtual   #55  <Method zzaww zzawq.zzxu()>
	//   23   46:astore_2        
			obj = ((Object) (zzayt.zza(zzavh.zza(zzaww1.zzyh()), ((zzawu) (obj)).zzyc().toByteArray(), ((zzawu) (obj)).zzyd().toByteArray())));
	//   24   47:aload_2         
	//   25   48:invokevirtual   #61  <Method zzawy zzaww.zzyh()>
	//   26   51:invokestatic    #64  <Method zzayv zzavh.zza(zzawy)>
	//   27   54:aload_3         
	//   28   55:invokevirtual   #68  <Method zzbah zzawu.zzyc()>
	//   29   58:invokevirtual   #74  <Method byte[] zzbah.toByteArray()>
	//   30   61:aload_3         
	//   31   62:invokevirtual   #77  <Method zzbah zzawu.zzyd()>
	//   32   65:invokevirtual   #74  <Method byte[] zzbah.toByteArray()>
	//   33   68:invokestatic    #82  <Method java.security.interfaces.ECPublicKey zzayt.zza(zzayv, byte[], byte[])>
	//   34   71:astore_3        
			zzavj zzavj1 = new zzavj(((zzawq) (zzbcu)).zzxv().zzxp());
	//   35   72:new             #84  <Class zzavj>
	//   36   75:dup             
	//   37   76:aload_1         
	//   38   77:invokevirtual   #88  <Method zzawm zzawq.zzxv()>
	//   39   80:invokevirtual   #94  <Method zzaxn zzawm.zzxp()>
	//   40   83:invokespecial   #97  <Method void zzavj(zzaxn)>
	//   41   86:astore          4
			return ((Object) (new zzayp(((java.security.interfaces.ECPublicKey) (obj)), zzaww1.zzyj().toByteArray(), zzavh.zza(zzaww1.zzyi()), zzavh.zza(((zzawq) (zzbcu)).zzxw()), ((zzayn) (zzavj1)))));
	//   42   88:new             #99  <Class zzayp>
	//   43   91:dup             
	//   44   92:aload_3         
	//   45   93:aload_2         
	//   46   94:invokevirtual   #102 <Method zzbah zzaww.zzyj()>
	//   47   97:invokevirtual   #74  <Method byte[] zzbah.toByteArray()>
	//   48  100:aload_2         
	//   49  101:invokevirtual   #106 <Method zzaxa zzaww.zzyi()>
	//   50  104:invokestatic    #109 <Method String zzavh.zza(zzaxa)>
	//   51  107:aload_1         
	//   52  108:invokevirtual   #113 <Method zzawk zzawq.zzxw()>
	//   53  111:invokestatic    #116 <Method zzayw zzavh.zza(zzawk)>
	//   54  114:aload           4
	//   55  116:invokespecial   #119 <Method void zzayp(java.security.interfaces.ECPublicKey, byte[], String, zzayw, zzayn)>
	//   56  119:areturn         
		}
	}

	public final zzbcu zzb(zzbah zzbah1)
		throws GeneralSecurityException
	{
		throw new GeneralSecurityException("Not implemented.");
	//    0    0:new             #16  <Class GeneralSecurityException>
	//    1    3:dup             
	//    2    4:ldc1            #135 <String "Not implemented.">
	//    3    6:invokespecial   #29  <Method void GeneralSecurityException(String)>
	//    4    9:athrow          
	}

	public final zzbcu zzb(zzbcu zzbcu)
		throws GeneralSecurityException
	{
		throw new GeneralSecurityException("Not implemented.");
	//    0    0:new             #16  <Class GeneralSecurityException>
	//    1    3:dup             
	//    2    4:ldc1            #135 <String "Not implemented.">
	//    3    6:invokespecial   #29  <Method void GeneralSecurityException(String)>
	//    4    9:athrow          
	}

	public final zzaxi zzc(zzbah zzbah1)
		throws GeneralSecurityException
	{
		throw new GeneralSecurityException("Not implemented.");
	//    0    0:new             #16  <Class GeneralSecurityException>
	//    1    3:dup             
	//    2    4:ldc1            #135 <String "Not implemented.">
	//    3    6:invokespecial   #29  <Method void GeneralSecurityException(String)>
	//    4    9:athrow          
	}
}

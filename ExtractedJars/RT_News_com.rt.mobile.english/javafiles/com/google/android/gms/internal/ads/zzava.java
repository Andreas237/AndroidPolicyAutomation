// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.math.BigInteger;
import java.security.*;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECPoint;
import java.security.spec.ECPrivateKeySpec;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzaug, zzbbu, zzaws, zzazq, 
//			zzawu, zzavh, zzawq, zzaww, 
//			zzbah, zzayt, zzayy, zzavj, 
//			zzawm, zzayo, zzaue, zzawo, 
//			zzbbo, zzaxi, zzazy, zzbcu

final class zzava
	implements zzaug
{

	zzava()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
	//    2    4:return          
	}

	private final zzaue zzf(zzbah zzbah1)
		throws GeneralSecurityException
	{
		try
		{
			zzbah1 = ((zzbah) (zzaws.zzx(zzbah1)));
	//    0    0:aload_1         
	//    1    1:invokestatic    #24  <Method zzaws zzaws.zzx(zzbah)>
	//    2    4:astore_1        
			if(!(zzbah1 instanceof zzaws))
	//*   3    5:aload_1         
	//*   4    6:instanceof      #20  <Class zzaws>
	//*   5    9:ifne            22
				throw new GeneralSecurityException("expected EciesAeadHkdfPrivateKey proto");
	//    6   12:new             #16  <Class GeneralSecurityException>
	//    7   15:dup             
	//    8   16:ldc1            #26  <String "expected EciesAeadHkdfPrivateKey proto">
	//    9   18:invokespecial   #29  <Method void GeneralSecurityException(String)>
	//   10   21:athrow          
			Object obj1 = ((Object) ((zzaws)zzbah1));
	//   11   22:aload_1         
	//   12   23:checkcast       #20  <Class zzaws>
	//   13   26:astore          4
			zzazq.zzj(((zzaws) (obj1)).getVersion(), 0);
	//   14   28:aload           4
	//   15   30:invokevirtual   #33  <Method int zzaws.getVersion()>
	//   16   33:iconst_0        
	//   17   34:invokestatic    #39  <Method void zzazq.zzj(int, int)>
			zzavh.zza(((zzaws) (obj1)).zzxz().zzxs());
	//   18   37:aload           4
	//   19   39:invokevirtual   #43  <Method zzawu zzaws.zzxz()>
	//   20   42:invokevirtual   #49  <Method zzawq zzawu.zzxs()>
	//   21   45:invokestatic    #55  <Method void zzavh.zza(zzawq)>
			zzbah1 = ((zzbah) (((zzaws) (obj1)).zzxz().zzxs()));
	//   22   48:aload           4
	//   23   50:invokevirtual   #43  <Method zzawu zzaws.zzxz()>
	//   24   53:invokevirtual   #49  <Method zzawq zzawu.zzxs()>
	//   25   56:astore_1        
			zzaww zzaww1 = ((zzawq) (zzbah1)).zzxu();
	//   26   57:aload_1         
	//   27   58:invokevirtual   #61  <Method zzaww zzawq.zzxu()>
	//   28   61:astore_2        
			Object obj = ((Object) (zzavh.zza(zzaww1.zzyh())));
	//   29   62:aload_2         
	//   30   63:invokevirtual   #67  <Method zzawy zzaww.zzyh()>
	//   31   66:invokestatic    #70  <Method zzayv zzavh.zza(zzawy)>
	//   32   69:astore_3        
			byte abyte0[] = ((zzaws) (obj1)).zzwv().toByteArray();
	//   33   70:aload           4
	//   34   72:invokevirtual   #74  <Method zzbah zzaws.zzwv()>
	//   35   75:invokevirtual   #80  <Method byte[] zzbah.toByteArray()>
	//   36   78:astore          4
			obj = ((Object) (zzayt.zza(((zzayv) (obj)))));
	//   37   80:aload_3         
	//   38   81:invokestatic    #85  <Method java.security.spec.ECParameterSpec zzayt.zza(zzayv)>
	//   39   84:astore_3        
			obj = ((Object) (new ECPrivateKeySpec(new BigInteger(1, abyte0), ((java.security.spec.ECParameterSpec) (obj)))));
	//   40   85:new             #87  <Class ECPrivateKeySpec>
	//   41   88:dup             
	//   42   89:new             #89  <Class BigInteger>
	//   43   92:dup             
	//   44   93:iconst_1        
	//   45   94:aload           4
	//   46   96:invokespecial   #92  <Method void BigInteger(int, byte[])>
	//   47   99:aload_3         
	//   48  100:invokespecial   #95  <Method void ECPrivateKeySpec(BigInteger, java.security.spec.ECParameterSpec)>
	//   49  103:astore_3        
			obj = ((Object) ((ECPrivateKey)((KeyFactory)zzayy.zzdof.zzek("EC")).generatePrivate(((java.security.spec.KeySpec) (obj)))));
	//   50  104:getstatic       #101 <Field zzayy zzayy.zzdof>
	//   51  107:ldc1            #103 <String "EC">
	//   52  109:invokevirtual   #107 <Method Object zzayy.zzek(String)>
	//   53  112:checkcast       #109 <Class KeyFactory>
	//   54  115:aload_3         
	//   55  116:invokevirtual   #113 <Method java.security.PrivateKey KeyFactory.generatePrivate(java.security.spec.KeySpec)>
	//   56  119:checkcast       #115 <Class ECPrivateKey>
	//   57  122:astore_3        
			abyte0 = ((byte []) (new zzavj(((zzawq) (zzbah1)).zzxv().zzxp())));
	//   58  123:new             #117 <Class zzavj>
	//   59  126:dup             
	//   60  127:aload_1         
	//   61  128:invokevirtual   #121 <Method zzawm zzawq.zzxv()>
	//   62  131:invokevirtual   #127 <Method zzaxn zzawm.zzxp()>
	//   63  134:invokespecial   #130 <Method void zzavj(zzaxn)>
	//   64  137:astore          4
			zzbah1 = ((zzbah) ((zzaue)new zzayo(((ECPrivateKey) (obj)), zzaww1.zzyj().toByteArray(), zzavh.zza(zzaww1.zzyi()), zzavh.zza(((zzawq) (zzbah1)).zzxw()), ((zzayn) (abyte0)))));
	//   65  139:new             #132 <Class zzayo>
	//   66  142:dup             
	//   67  143:aload_3         
	//   68  144:aload_2         
	//   69  145:invokevirtual   #135 <Method zzbah zzaww.zzyj()>
	//   70  148:invokevirtual   #80  <Method byte[] zzbah.toByteArray()>
	//   71  151:aload_2         
	//   72  152:invokevirtual   #139 <Method zzaxa zzaww.zzyi()>
	//   73  155:invokestatic    #142 <Method String zzavh.zza(zzaxa)>
	//   74  158:aload_1         
	//   75  159:invokevirtual   #146 <Method zzawk zzawq.zzxw()>
	//   76  162:invokestatic    #149 <Method zzayw zzavh.zza(zzawk)>
	//   77  165:aload           4
	//   78  167:invokespecial   #152 <Method void zzayo(ECPrivateKey, byte[], String, zzayw, zzayn)>
	//   79  170:checkcast       #154 <Class zzaue>
	//   80  173:astore_1        
		}
	//*  81  174:aload_1         
	//*  82  175:areturn         
		// Misplaced declaration of an exception variable
		catch(zzbah zzbah1)
	//*  83  176:astore_1        
		{
			throw new GeneralSecurityException("expected serialized EciesAeadHkdfPrivateKey proto", ((Throwable) (zzbah1)));
	//   84  177:new             #16  <Class GeneralSecurityException>
	//   85  180:dup             
	//   86  181:ldc1            #156 <String "expected serialized EciesAeadHkdfPrivateKey proto">
	//   87  183:aload_1         
	//   88  184:invokespecial   #159 <Method void GeneralSecurityException(String, Throwable)>
	//   89  187:athrow          
		}
		return ((zzaue) (zzbah1));
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
		return ((Object) (zzf(zzbah1)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #163 <Method zzaue zzf(zzbah)>
	//    3    5:areturn         
	}

	public final Object zza(zzbcu zzbcu)
		throws GeneralSecurityException
	{
		if(!(zzbcu instanceof zzaws))
	//*   0    0:aload_1         
	//*   1    1:instanceof      #20  <Class zzaws>
	//*   2    4:ifne            17
		{
			throw new GeneralSecurityException("expected EciesAeadHkdfPrivateKey proto");
	//    3    7:new             #16  <Class GeneralSecurityException>
	//    4   10:dup             
	//    5   11:ldc1            #26  <String "expected EciesAeadHkdfPrivateKey proto">
	//    6   13:invokespecial   #29  <Method void GeneralSecurityException(String)>
	//    7   16:athrow          
		} else
		{
			Object obj1 = ((Object) ((zzaws)zzbcu));
	//    8   17:aload_1         
	//    9   18:checkcast       #20  <Class zzaws>
	//   10   21:astore          4
			zzazq.zzj(((zzaws) (obj1)).getVersion(), 0);
	//   11   23:aload           4
	//   12   25:invokevirtual   #33  <Method int zzaws.getVersion()>
	//   13   28:iconst_0        
	//   14   29:invokestatic    #39  <Method void zzazq.zzj(int, int)>
			zzavh.zza(((zzaws) (obj1)).zzxz().zzxs());
	//   15   32:aload           4
	//   16   34:invokevirtual   #43  <Method zzawu zzaws.zzxz()>
	//   17   37:invokevirtual   #49  <Method zzawq zzawu.zzxs()>
	//   18   40:invokestatic    #55  <Method void zzavh.zza(zzawq)>
			zzbcu = ((zzbcu) (((zzaws) (obj1)).zzxz().zzxs()));
	//   19   43:aload           4
	//   20   45:invokevirtual   #43  <Method zzawu zzaws.zzxz()>
	//   21   48:invokevirtual   #49  <Method zzawq zzawu.zzxs()>
	//   22   51:astore_1        
			zzaww zzaww1 = ((zzawq) (zzbcu)).zzxu();
	//   23   52:aload_1         
	//   24   53:invokevirtual   #61  <Method zzaww zzawq.zzxu()>
	//   25   56:astore_2        
			Object obj = ((Object) (zzavh.zza(zzaww1.zzyh())));
	//   26   57:aload_2         
	//   27   58:invokevirtual   #67  <Method zzawy zzaww.zzyh()>
	//   28   61:invokestatic    #70  <Method zzayv zzavh.zza(zzawy)>
	//   29   64:astore_3        
			byte abyte0[] = ((zzaws) (obj1)).zzwv().toByteArray();
	//   30   65:aload           4
	//   31   67:invokevirtual   #74  <Method zzbah zzaws.zzwv()>
	//   32   70:invokevirtual   #80  <Method byte[] zzbah.toByteArray()>
	//   33   73:astore          4
			obj = ((Object) (zzayt.zza(((zzayv) (obj)))));
	//   34   75:aload_3         
	//   35   76:invokestatic    #85  <Method java.security.spec.ECParameterSpec zzayt.zza(zzayv)>
	//   36   79:astore_3        
			obj = ((Object) (new ECPrivateKeySpec(new BigInteger(1, abyte0), ((java.security.spec.ECParameterSpec) (obj)))));
	//   37   80:new             #87  <Class ECPrivateKeySpec>
	//   38   83:dup             
	//   39   84:new             #89  <Class BigInteger>
	//   40   87:dup             
	//   41   88:iconst_1        
	//   42   89:aload           4
	//   43   91:invokespecial   #92  <Method void BigInteger(int, byte[])>
	//   44   94:aload_3         
	//   45   95:invokespecial   #95  <Method void ECPrivateKeySpec(BigInteger, java.security.spec.ECParameterSpec)>
	//   46   98:astore_3        
			obj = ((Object) ((ECPrivateKey)((KeyFactory)zzayy.zzdof.zzek("EC")).generatePrivate(((java.security.spec.KeySpec) (obj)))));
	//   47   99:getstatic       #101 <Field zzayy zzayy.zzdof>
	//   48  102:ldc1            #103 <String "EC">
	//   49  104:invokevirtual   #107 <Method Object zzayy.zzek(String)>
	//   50  107:checkcast       #109 <Class KeyFactory>
	//   51  110:aload_3         
	//   52  111:invokevirtual   #113 <Method java.security.PrivateKey KeyFactory.generatePrivate(java.security.spec.KeySpec)>
	//   53  114:checkcast       #115 <Class ECPrivateKey>
	//   54  117:astore_3        
			abyte0 = ((byte []) (new zzavj(((zzawq) (zzbcu)).zzxv().zzxp())));
	//   55  118:new             #117 <Class zzavj>
	//   56  121:dup             
	//   57  122:aload_1         
	//   58  123:invokevirtual   #121 <Method zzawm zzawq.zzxv()>
	//   59  126:invokevirtual   #127 <Method zzaxn zzawm.zzxp()>
	//   60  129:invokespecial   #130 <Method void zzavj(zzaxn)>
	//   61  132:astore          4
			return ((Object) (new zzayo(((ECPrivateKey) (obj)), zzaww1.zzyj().toByteArray(), zzavh.zza(zzaww1.zzyi()), zzavh.zza(((zzawq) (zzbcu)).zzxw()), ((zzayn) (abyte0)))));
	//   62  134:new             #132 <Class zzayo>
	//   63  137:dup             
	//   64  138:aload_3         
	//   65  139:aload_2         
	//   66  140:invokevirtual   #135 <Method zzbah zzaww.zzyj()>
	//   67  143:invokevirtual   #80  <Method byte[] zzbah.toByteArray()>
	//   68  146:aload_2         
	//   69  147:invokevirtual   #139 <Method zzaxa zzaww.zzyi()>
	//   70  150:invokestatic    #142 <Method String zzavh.zza(zzaxa)>
	//   71  153:aload_1         
	//   72  154:invokevirtual   #146 <Method zzawk zzawq.zzxw()>
	//   73  157:invokestatic    #149 <Method zzayw zzavh.zza(zzawk)>
	//   74  160:aload           4
	//   75  162:invokespecial   #152 <Method void zzayo(ECPrivateKey, byte[], String, zzayw, zzayn)>
	//   76  165:areturn         
		}
	}

	public final zzbcu zzb(zzbah zzbah1)
		throws GeneralSecurityException
	{
		try
		{
			zzbah1 = ((zzbah) (zzb(((zzbcu) (zzawo.zzw(zzbah1))))));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #172 <Method zzawo zzawo.zzw(zzbah)>
	//    3    5:invokevirtual   #175 <Method zzbcu zzb(zzbcu)>
	//    4    8:astore_1        
		}
	//*   5    9:aload_1         
	//*   6   10:areturn         
		// Misplaced declaration of an exception variable
		catch(zzbah zzbah1)
	//*   7   11:astore_1        
		{
			throw new GeneralSecurityException("invalid EciesAeadHkdf key format", ((Throwable) (zzbah1)));
	//    8   12:new             #16  <Class GeneralSecurityException>
	//    9   15:dup             
	//   10   16:ldc1            #177 <String "invalid EciesAeadHkdf key format">
	//   11   18:aload_1         
	//   12   19:invokespecial   #159 <Method void GeneralSecurityException(String, Throwable)>
	//   13   22:athrow          
		}
		return ((zzbcu) (zzbah1));
	}

	public final zzbcu zzb(zzbcu zzbcu)
		throws GeneralSecurityException
	{
		if(!(zzbcu instanceof zzawo))
	//*   0    0:aload_1         
	//*   1    1:instanceof      #168 <Class zzawo>
	//*   2    4:ifne            17
		{
			throw new GeneralSecurityException("expected EciesAeadHkdfKeyFormat proto");
	//    3    7:new             #16  <Class GeneralSecurityException>
	//    4   10:dup             
	//    5   11:ldc1            #179 <String "expected EciesAeadHkdfKeyFormat proto">
	//    6   13:invokespecial   #29  <Method void GeneralSecurityException(String)>
	//    7   16:athrow          
		} else
		{
			zzbcu = ((zzbcu) ((zzawo)zzbcu));
	//    8   17:aload_1         
	//    9   18:checkcast       #168 <Class zzawo>
	//   10   21:astore_1        
			zzavh.zza(((zzawo) (zzbcu)).zzxs());
	//   11   22:aload_1         
	//   12   23:invokevirtual   #180 <Method zzawq zzawo.zzxs()>
	//   13   26:invokestatic    #55  <Method void zzavh.zza(zzawq)>
			Object obj = ((Object) (zzayt.zza(zzayt.zza(zzavh.zza(((zzawo) (zzbcu)).zzxs().zzxu().zzyh())))));
	//   14   29:aload_1         
	//   15   30:invokevirtual   #180 <Method zzawq zzawo.zzxs()>
	//   16   33:invokevirtual   #61  <Method zzaww zzawq.zzxu()>
	//   17   36:invokevirtual   #67  <Method zzawy zzaww.zzyh()>
	//   18   39:invokestatic    #70  <Method zzayv zzavh.zza(zzawy)>
	//   19   42:invokestatic    #85  <Method java.security.spec.ECParameterSpec zzayt.zza(zzayv)>
	//   20   45:invokestatic    #183 <Method KeyPair zzayt.zza(java.security.spec.ECParameterSpec)>
	//   21   48:astore_2        
			Object obj1 = ((Object) ((ECPublicKey)((KeyPair) (obj)).getPublic()));
	//   22   49:aload_2         
	//   23   50:invokevirtual   #189 <Method java.security.PublicKey KeyPair.getPublic()>
	//   24   53:checkcast       #191 <Class ECPublicKey>
	//   25   56:astore_3        
			obj = ((Object) ((ECPrivateKey)((KeyPair) (obj)).getPrivate()));
	//   26   57:aload_2         
	//   27   58:invokevirtual   #195 <Method java.security.PrivateKey KeyPair.getPrivate()>
	//   28   61:checkcast       #115 <Class ECPrivateKey>
	//   29   64:astore_2        
			obj1 = ((Object) (((ECPublicKey) (obj1)).getW()));
	//   30   65:aload_3         
	//   31   66:invokeinterface #199 <Method ECPoint ECPublicKey.getW()>
	//   32   71:astore_3        
			zzbcu = ((zzbcu) ((zzawu)(zzbbo)((zzbbo.zza) (zzawu.zzye().zzas(0).zzc(((zzawo) (zzbcu)).zzxs()).zzac(zzbah.zzo(((ECPoint) (obj1)).getAffineX().toByteArray())).zzad(zzbah.zzo(((ECPoint) (obj1)).getAffineY().toByteArray())))).zzadi()));
	//   33   72:invokestatic    #203 <Method zzawu$zza zzawu.zzye()>
	//   34   75:iconst_0        
	//   35   76:invokevirtual   #209 <Method zzawu$zza zzawu$zza.zzas(int)>
	//   36   79:aload_1         
	//   37   80:invokevirtual   #180 <Method zzawq zzawo.zzxs()>
	//   38   83:invokevirtual   #213 <Method zzawu$zza zzawu$zza.zzc(zzawq)>
	//   39   86:aload_3         
	//   40   87:invokevirtual   #219 <Method BigInteger ECPoint.getAffineX()>
	//   41   90:invokevirtual   #220 <Method byte[] BigInteger.toByteArray()>
	//   42   93:invokestatic    #224 <Method zzbah zzbah.zzo(byte[])>
	//   43   96:invokevirtual   #228 <Method zzawu$zza zzawu$zza.zzac(zzbah)>
	//   44   99:aload_3         
	//   45  100:invokevirtual   #231 <Method BigInteger ECPoint.getAffineY()>
	//   46  103:invokevirtual   #220 <Method byte[] BigInteger.toByteArray()>
	//   47  106:invokestatic    #224 <Method zzbah zzbah.zzo(byte[])>
	//   48  109:invokevirtual   #234 <Method zzawu$zza zzawu$zza.zzad(zzbah)>
	//   49  112:invokevirtual   #240 <Method zzbbo zzbbo$zza.zzadi()>
	//   50  115:checkcast       #242 <Class zzbbo>
	//   51  118:checkcast       #45  <Class zzawu>
	//   52  121:astore_1        
			return ((zzbcu) ((zzbbo)((zzbbo.zza) (zzaws.zzya().zzar(0).zzb(((zzawu) (zzbcu))).zzy(zzbah.zzo(((ECPrivateKey) (obj)).getS().toByteArray())))).zzadi()));
	//   53  122:invokestatic    #246 <Method zzaws$zza zzaws.zzya()>
	//   54  125:iconst_0        
	//   55  126:invokevirtual   #252 <Method zzaws$zza zzaws$zza.zzar(int)>
	//   56  129:aload_1         
	//   57  130:invokevirtual   #255 <Method zzaws$zza zzaws$zza.zzb(zzawu)>
	//   58  133:aload_2         
	//   59  134:invokeinterface #258 <Method BigInteger ECPrivateKey.getS()>
	//   60  139:invokevirtual   #220 <Method byte[] BigInteger.toByteArray()>
	//   61  142:invokestatic    #224 <Method zzbah zzbah.zzo(byte[])>
	//   62  145:invokevirtual   #262 <Method zzaws$zza zzaws$zza.zzy(zzbah)>
	//   63  148:invokevirtual   #240 <Method zzbbo zzbbo$zza.zzadi()>
	//   64  151:checkcast       #242 <Class zzbbo>
	//   65  154:areturn         
		}
	}

	public final zzaxi zzc(zzbah zzbah1)
		throws GeneralSecurityException
	{
		zzbah1 = ((zzbah) ((zzaws)zzb(zzbah1)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #265 <Method zzbcu zzb(zzbah)>
	//    3    5:checkcast       #20  <Class zzaws>
	//    4    8:astore_1        
		return (zzaxi)(zzbbo)((zzbbo.zza) (zzaxi.zzyz().zzeb("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey").zzai(((zzazy) (zzbah1)).zzaav()).zzb(zzaxi.zzb.zzdky))).zzadi();
	//    5    9:invokestatic    #271 <Method zzaxi$zza zzaxi.zzyz()>
	//    6   12:ldc2            #273 <String "type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey">
	//    7   15:invokevirtual   #279 <Method zzaxi$zza zzaxi$zza.zzeb(String)>
	//    8   18:aload_1         
	//    9   19:invokevirtual   #284 <Method zzbah zzazy.zzaav()>
	//   10   22:invokevirtual   #288 <Method zzaxi$zza zzaxi$zza.zzai(zzbah)>
	//   11   25:getstatic       #294 <Field zzaxi$zzb zzaxi$zzb.zzdky>
	//   12   28:invokevirtual   #297 <Method zzaxi$zza zzaxi$zza.zzb(zzaxi$zzb)>
	//   13   31:invokevirtual   #240 <Method zzbbo zzbbo$zza.zzadi()>
	//   14   34:checkcast       #242 <Class zzbbo>
	//   15   37:checkcast       #267 <Class zzaxi>
	//   16   40:areturn         
	}
}

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
//			aiz, asu, amc, apy, 
//			amf, akb, alz, ami, 
//			aqq, apa, apf, akd, 
//			als, aov, aix, alw, 
//			amg, asi, ash, amd, 
//			amy, amz, aqh, ana, 
//			atv

final class aju
	implements aiz
{

	aju()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #10  <Method void Object()>
	//    2    4:return          
	}

	private final aix d(aqq aqq1)
	{
		try
		{
			aqq1 = ((aqq) (amc.a(aqq1)));
	//    0    0:aload_1         
	//    1    1:invokestatic    #21  <Method amc amc.a(aqq)>
	//    2    4:astore_1        
			if(aqq1 instanceof amc)
	//*   3    5:aload_1         
	//*   4    6:instanceof      #17  <Class amc>
	//*   5    9:ifeq            164
			{
				Object obj1 = ((Object) ((amc)aqq1));
	//    6   12:aload_1         
	//    7   13:checkcast       #17  <Class amc>
	//    8   16:astore          4
				apy.a(((amc) (obj1)).a(), 0);
	//    9   18:aload           4
	//   10   20:invokevirtual   #24  <Method int amc.a()>
	//   11   23:iconst_0        
	//   12   24:invokestatic    #29  <Method void apy.a(int, int)>
				akb.a(((amc) (obj1)).b().b());
	//   13   27:aload           4
	//   14   29:invokevirtual   #33  <Method amf amc.b()>
	//   15   32:invokevirtual   #38  <Method alz amf.b()>
	//   16   35:invokestatic    #43  <Method void akb.a(alz)>
				aqq1 = ((aqq) (((amc) (obj1)).b().b()));
	//   17   38:aload           4
	//   18   40:invokevirtual   #33  <Method amf amc.b()>
	//   19   43:invokevirtual   #38  <Method alz amf.b()>
	//   20   46:astore_1        
				ami ami1 = ((alz) (aqq1)).a();
	//   21   47:aload_1         
	//   22   48:invokevirtual   #48  <Method ami alz.a()>
	//   23   51:astore_2        
				Object obj = ((Object) (akb.a(ami1.a())));
	//   24   52:aload_2         
	//   25   53:invokevirtual   #53  <Method aml ami.a()>
	//   26   56:invokestatic    #56  <Method apc akb.a(aml)>
	//   27   59:astore_3        
				byte abyte0[] = ((amc) (obj1)).c().b();
	//   28   60:aload           4
	//   29   62:invokevirtual   #60  <Method aqq amc.c()>
	//   30   65:invokevirtual   #65  <Method byte[] aqq.b()>
	//   31   68:astore          4
				obj = ((Object) (apa.a(((apc) (obj)))));
	//   32   70:aload_3         
	//   33   71:invokestatic    #70  <Method java.security.spec.ECParameterSpec apa.a(apc)>
	//   34   74:astore_3        
				obj = ((Object) (new ECPrivateKeySpec(new BigInteger(1, abyte0), ((java.security.spec.ECParameterSpec) (obj)))));
	//   35   75:new             #72  <Class ECPrivateKeySpec>
	//   36   78:dup             
	//   37   79:new             #74  <Class BigInteger>
	//   38   82:dup             
	//   39   83:iconst_1        
	//   40   84:aload           4
	//   41   86:invokespecial   #77  <Method void BigInteger(int, byte[])>
	//   42   89:aload_3         
	//   43   90:invokespecial   #80  <Method void ECPrivateKeySpec(BigInteger, java.security.spec.ECParameterSpec)>
	//   44   93:astore_3        
				obj = ((Object) ((ECPrivateKey)((KeyFactory)apf.e.a("EC")).generatePrivate(((java.security.spec.KeySpec) (obj)))));
	//   45   94:getstatic       #86  <Field apf apf.e>
	//   46   97:ldc1            #88  <String "EC">
	//   47   99:invokevirtual   #91  <Method Object apf.a(String)>
	//   48  102:checkcast       #93  <Class KeyFactory>
	//   49  105:aload_3         
	//   50  106:invokevirtual   #97  <Method java.security.PrivateKey KeyFactory.generatePrivate(java.security.spec.KeySpec)>
	//   51  109:checkcast       #99  <Class ECPrivateKey>
	//   52  112:astore_3        
				abyte0 = ((byte []) (new akd(((alz) (aqq1)).b().a())));
	//   53  113:new             #101 <Class akd>
	//   54  116:dup             
	//   55  117:aload_1         
	//   56  118:invokevirtual   #104 <Method als alz.b()>
	//   57  121:invokevirtual   #109 <Method ang als.a()>
	//   58  124:invokespecial   #112 <Method void akd(ang)>
	//   59  127:astore          4
				return (aix)new aov(((ECPrivateKey) (obj)), ami1.c().b(), akb.a(ami1.b()), akb.a(((alz) (aqq1)).c()), ((aou) (abyte0)));
	//   60  129:new             #114 <Class aov>
	//   61  132:dup             
	//   62  133:aload_3         
	//   63  134:aload_2         
	//   64  135:invokevirtual   #115 <Method aqq ami.c()>
	//   65  138:invokevirtual   #65  <Method byte[] aqq.b()>
	//   66  141:aload_2         
	//   67  142:invokevirtual   #118 <Method amn ami.b()>
	//   68  145:invokestatic    #121 <Method String akb.a(amn)>
	//   69  148:aload_1         
	//   70  149:invokevirtual   #124 <Method alq alz.c()>
	//   71  152:invokestatic    #127 <Method apd akb.a(alq)>
	//   72  155:aload           4
	//   73  157:invokespecial   #130 <Method void aov(ECPrivateKey, byte[], String, apd, aou)>
	//   74  160:checkcast       #132 <Class aix>
	//   75  163:areturn         
			} else
			{
				throw new GeneralSecurityException("expected EciesAeadHkdfPrivateKey proto");
	//   76  164:new             #134 <Class GeneralSecurityException>
	//   77  167:dup             
	//   78  168:ldc1            #136 <String "expected EciesAeadHkdfPrivateKey proto">
	//   79  170:invokespecial   #139 <Method void GeneralSecurityException(String)>
	//   80  173:athrow          
			}
		}
		// Misplaced declaration of an exception variable
		catch(aqq aqq1)
	//*  81  174:astore_1        
		{
			throw new GeneralSecurityException("expected serialized EciesAeadHkdfPrivateKey proto", ((Throwable) (aqq1)));
	//   82  175:new             #134 <Class GeneralSecurityException>
	//   83  178:dup             
	//   84  179:ldc1            #141 <String "expected serialized EciesAeadHkdfPrivateKey proto">
	//   85  181:aload_1         
	//   86  182:invokespecial   #144 <Method void GeneralSecurityException(String, Throwable)>
	//   87  185:athrow          
		}
	}

	public final Object a(aqq aqq1)
	{
		return ((Object) (d(aqq1)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #147 <Method aix d(aqq)>
	//    3    5:areturn         
	}

	public final Object a(atv atv)
	{
		if(atv instanceof amc)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #17  <Class amc>
	//*   2    4:ifeq            156
		{
			Object obj1 = ((Object) ((amc)atv));
	//    3    7:aload_1         
	//    4    8:checkcast       #17  <Class amc>
	//    5   11:astore          4
			apy.a(((amc) (obj1)).a(), 0);
	//    6   13:aload           4
	//    7   15:invokevirtual   #24  <Method int amc.a()>
	//    8   18:iconst_0        
	//    9   19:invokestatic    #29  <Method void apy.a(int, int)>
			akb.a(((amc) (obj1)).b().b());
	//   10   22:aload           4
	//   11   24:invokevirtual   #33  <Method amf amc.b()>
	//   12   27:invokevirtual   #38  <Method alz amf.b()>
	//   13   30:invokestatic    #43  <Method void akb.a(alz)>
			atv = ((atv) (((amc) (obj1)).b().b()));
	//   14   33:aload           4
	//   15   35:invokevirtual   #33  <Method amf amc.b()>
	//   16   38:invokevirtual   #38  <Method alz amf.b()>
	//   17   41:astore_1        
			ami ami1 = ((alz) (atv)).a();
	//   18   42:aload_1         
	//   19   43:invokevirtual   #48  <Method ami alz.a()>
	//   20   46:astore_2        
			Object obj = ((Object) (akb.a(ami1.a())));
	//   21   47:aload_2         
	//   22   48:invokevirtual   #53  <Method aml ami.a()>
	//   23   51:invokestatic    #56  <Method apc akb.a(aml)>
	//   24   54:astore_3        
			byte abyte0[] = ((amc) (obj1)).c().b();
	//   25   55:aload           4
	//   26   57:invokevirtual   #60  <Method aqq amc.c()>
	//   27   60:invokevirtual   #65  <Method byte[] aqq.b()>
	//   28   63:astore          4
			obj = ((Object) (apa.a(((apc) (obj)))));
	//   29   65:aload_3         
	//   30   66:invokestatic    #70  <Method java.security.spec.ECParameterSpec apa.a(apc)>
	//   31   69:astore_3        
			obj = ((Object) (new ECPrivateKeySpec(new BigInteger(1, abyte0), ((java.security.spec.ECParameterSpec) (obj)))));
	//   32   70:new             #72  <Class ECPrivateKeySpec>
	//   33   73:dup             
	//   34   74:new             #74  <Class BigInteger>
	//   35   77:dup             
	//   36   78:iconst_1        
	//   37   79:aload           4
	//   38   81:invokespecial   #77  <Method void BigInteger(int, byte[])>
	//   39   84:aload_3         
	//   40   85:invokespecial   #80  <Method void ECPrivateKeySpec(BigInteger, java.security.spec.ECParameterSpec)>
	//   41   88:astore_3        
			obj = ((Object) ((ECPrivateKey)((KeyFactory)apf.e.a("EC")).generatePrivate(((java.security.spec.KeySpec) (obj)))));
	//   42   89:getstatic       #86  <Field apf apf.e>
	//   43   92:ldc1            #88  <String "EC">
	//   44   94:invokevirtual   #91  <Method Object apf.a(String)>
	//   45   97:checkcast       #93  <Class KeyFactory>
	//   46  100:aload_3         
	//   47  101:invokevirtual   #97  <Method java.security.PrivateKey KeyFactory.generatePrivate(java.security.spec.KeySpec)>
	//   48  104:checkcast       #99  <Class ECPrivateKey>
	//   49  107:astore_3        
			abyte0 = ((byte []) (new akd(((alz) (atv)).b().a())));
	//   50  108:new             #101 <Class akd>
	//   51  111:dup             
	//   52  112:aload_1         
	//   53  113:invokevirtual   #104 <Method als alz.b()>
	//   54  116:invokevirtual   #109 <Method ang als.a()>
	//   55  119:invokespecial   #112 <Method void akd(ang)>
	//   56  122:astore          4
			return ((Object) (new aov(((ECPrivateKey) (obj)), ami1.c().b(), akb.a(ami1.b()), akb.a(((alz) (atv)).c()), ((aou) (abyte0)))));
	//   57  124:new             #114 <Class aov>
	//   58  127:dup             
	//   59  128:aload_3         
	//   60  129:aload_2         
	//   61  130:invokevirtual   #115 <Method aqq ami.c()>
	//   62  133:invokevirtual   #65  <Method byte[] aqq.b()>
	//   63  136:aload_2         
	//   64  137:invokevirtual   #118 <Method amn ami.b()>
	//   65  140:invokestatic    #121 <Method String akb.a(amn)>
	//   66  143:aload_1         
	//   67  144:invokevirtual   #124 <Method alq alz.c()>
	//   68  147:invokestatic    #127 <Method apd akb.a(alq)>
	//   69  150:aload           4
	//   70  152:invokespecial   #130 <Method void aov(ECPrivateKey, byte[], String, apd, aou)>
	//   71  155:areturn         
		} else
		{
			throw new GeneralSecurityException("expected EciesAeadHkdfPrivateKey proto");
	//   72  156:new             #134 <Class GeneralSecurityException>
	//   73  159:dup             
	//   74  160:ldc1            #136 <String "expected EciesAeadHkdfPrivateKey proto">
	//   75  162:invokespecial   #139 <Method void GeneralSecurityException(String)>
	//   76  165:athrow          
		}
	}

	public final String a()
	{
		return "type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey";
	//    0    0:ldc1            #151 <String "type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey">
	//    1    2:areturn         
	}

	public final int b()
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public final atv b(aqq aqq1)
	{
		try
		{
			aqq1 = ((aqq) (b(((atv) (alw.a(aqq1))))));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #157 <Method alw alw.a(aqq)>
	//    3    5:invokevirtual   #160 <Method atv b(atv)>
	//    4    8:astore_1        
		}
	//*   5    9:aload_1         
	//*   6   10:areturn         
		// Misplaced declaration of an exception variable
		catch(aqq aqq1)
	//*   7   11:astore_1        
		{
			throw new GeneralSecurityException("invalid EciesAeadHkdf key format", ((Throwable) (aqq1)));
	//    8   12:new             #134 <Class GeneralSecurityException>
	//    9   15:dup             
	//   10   16:ldc1            #162 <String "invalid EciesAeadHkdf key format">
	//   11   18:aload_1         
	//   12   19:invokespecial   #144 <Method void GeneralSecurityException(String, Throwable)>
	//   13   22:athrow          
		}
		return ((atv) (aqq1));
	}

	public final atv b(atv atv)
	{
		if(atv instanceof alw)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #154 <Class alw>
	//*   2    4:ifeq            145
		{
			atv = ((atv) ((alw)atv));
	//    3    7:aload_1         
	//    4    8:checkcast       #154 <Class alw>
	//    5   11:astore_1        
			akb.a(((alw) (atv)).a());
	//    6   12:aload_1         
	//    7   13:invokevirtual   #164 <Method alz alw.a()>
	//    8   16:invokestatic    #43  <Method void akb.a(alz)>
			Object obj = ((Object) (apa.a(apa.a(akb.a(((alw) (atv)).a().a().a())))));
	//    9   19:aload_1         
	//   10   20:invokevirtual   #164 <Method alz alw.a()>
	//   11   23:invokevirtual   #48  <Method ami alz.a()>
	//   12   26:invokevirtual   #53  <Method aml ami.a()>
	//   13   29:invokestatic    #56  <Method apc akb.a(aml)>
	//   14   32:invokestatic    #70  <Method java.security.spec.ECParameterSpec apa.a(apc)>
	//   15   35:invokestatic    #167 <Method KeyPair apa.a(java.security.spec.ECParameterSpec)>
	//   16   38:astore_2        
			Object obj1 = ((Object) ((ECPublicKey)((KeyPair) (obj)).getPublic()));
	//   17   39:aload_2         
	//   18   40:invokevirtual   #173 <Method java.security.PublicKey KeyPair.getPublic()>
	//   19   43:checkcast       #175 <Class ECPublicKey>
	//   20   46:astore_3        
			obj = ((Object) ((ECPrivateKey)((KeyPair) (obj)).getPrivate()));
	//   21   47:aload_2         
	//   22   48:invokevirtual   #179 <Method java.security.PrivateKey KeyPair.getPrivate()>
	//   23   51:checkcast       #99  <Class ECPrivateKey>
	//   24   54:astore_2        
			obj1 = ((Object) (((ECPublicKey) (obj1)).getW()));
	//   25   55:aload_3         
	//   26   56:invokeinterface #183 <Method ECPoint ECPublicKey.getW()>
	//   27   61:astore_3        
			atv = ((atv) ((amf)(ash)((asi) (amf.e().a(0).a(((alw) (atv)).a()).a(aqq.a(((ECPoint) (obj1)).getAffineX().toByteArray())).b(aqq.a(((ECPoint) (obj1)).getAffineY().toByteArray())))).f()));
	//   28   62:invokestatic    #186 <Method amg amf.e()>
	//   29   65:iconst_0        
	//   30   66:invokevirtual   #191 <Method amg amg.a(int)>
	//   31   69:aload_1         
	//   32   70:invokevirtual   #164 <Method alz alw.a()>
	//   33   73:invokevirtual   #194 <Method amg amg.a(alz)>
	//   34   76:aload_3         
	//   35   77:invokevirtual   #200 <Method BigInteger ECPoint.getAffineX()>
	//   36   80:invokevirtual   #203 <Method byte[] BigInteger.toByteArray()>
	//   37   83:invokestatic    #206 <Method aqq aqq.a(byte[])>
	//   38   86:invokevirtual   #209 <Method amg amg.a(aqq)>
	//   39   89:aload_3         
	//   40   90:invokevirtual   #212 <Method BigInteger ECPoint.getAffineY()>
	//   41   93:invokevirtual   #203 <Method byte[] BigInteger.toByteArray()>
	//   42   96:invokestatic    #206 <Method aqq aqq.a(byte[])>
	//   43   99:invokevirtual   #214 <Method amg amg.b(aqq)>
	//   44  102:invokevirtual   #220 <Method atv asi.f()>
	//   45  105:checkcast       #222 <Class ash>
	//   46  108:checkcast       #35  <Class amf>
	//   47  111:astore_1        
			return ((atv) ((ash)((asi) (amc.d().a(0).a(((amf) (atv))).a(aqq.a(((ECPrivateKey) (obj)).getS().toByteArray())))).f()));
	//   48  112:invokestatic    #225 <Method amd amc.d()>
	//   49  115:iconst_0        
	//   50  116:invokevirtual   #230 <Method amd amd.a(int)>
	//   51  119:aload_1         
	//   52  120:invokevirtual   #233 <Method amd amd.a(amf)>
	//   53  123:aload_2         
	//   54  124:invokeinterface #236 <Method BigInteger ECPrivateKey.getS()>
	//   55  129:invokevirtual   #203 <Method byte[] BigInteger.toByteArray()>
	//   56  132:invokestatic    #206 <Method aqq aqq.a(byte[])>
	//   57  135:invokevirtual   #239 <Method amd amd.a(aqq)>
	//   58  138:invokevirtual   #220 <Method atv asi.f()>
	//   59  141:checkcast       #222 <Class ash>
	//   60  144:areturn         
		} else
		{
			throw new GeneralSecurityException("expected EciesAeadHkdfKeyFormat proto");
	//   61  145:new             #134 <Class GeneralSecurityException>
	//   62  148:dup             
	//   63  149:ldc1            #241 <String "expected EciesAeadHkdfKeyFormat proto">
	//   64  151:invokespecial   #139 <Method void GeneralSecurityException(String)>
	//   65  154:athrow          
		}
	}

	public final amy c(aqq aqq1)
	{
		aqq1 = ((aqq) ((amc)b(aqq1)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #244 <Method atv b(aqq)>
	//    3    5:checkcast       #17  <Class amc>
	//    4    8:astore_1        
		return (amy)(ash)((asi) (amy.d().a("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey").a(((aqh) (aqq1)).h()).a(ana.c))).f();
	//    5    9:invokestatic    #249 <Method amz amy.d()>
	//    6   12:ldc1            #151 <String "type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey">
	//    7   14:invokevirtual   #254 <Method amz amz.a(String)>
	//    8   17:aload_1         
	//    9   18:invokevirtual   #259 <Method aqq aqh.h()>
	//   10   21:invokevirtual   #262 <Method amz amz.a(aqq)>
	//   11   24:getstatic       #267 <Field ana ana.c>
	//   12   27:invokevirtual   #270 <Method amz amz.a(ana)>
	//   13   30:invokevirtual   #220 <Method atv asi.f()>
	//   14   33:checkcast       #222 <Class ash>
	//   15   36:checkcast       #246 <Class amy>
	//   16   39:areturn         
	}
}

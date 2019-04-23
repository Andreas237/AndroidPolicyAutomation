// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

// Referenced classes of package com.google.android.gms.internal.ads:
//			aiz, asu, amf, apy, 
//			akb, alz, ami, aqq, 
//			apa, akd, als, aow, 
//			aiy, atv, amy

final class ajv
	implements aiz
{

	ajv()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #10  <Method void Object()>
	//    2    4:return          
	}

	private final aiy d(aqq aqq1)
	{
		try
		{
			aqq1 = ((aqq) (amf.a(aqq1)));
	//    0    0:aload_1         
	//    1    1:invokestatic    #21  <Method amf amf.a(aqq)>
	//    2    4:astore_1        
			if(aqq1 instanceof amf)
	//*   3    5:aload_1         
	//*   4    6:instanceof      #17  <Class amf>
	//*   5    9:ifeq            118
			{
				Object obj = ((Object) ((amf)aqq1));
	//    6   12:aload_1         
	//    7   13:checkcast       #17  <Class amf>
	//    8   16:astore_3        
				apy.a(((amf) (obj)).a(), 0);
	//    9   17:aload_3         
	//   10   18:invokevirtual   #24  <Method int amf.a()>
	//   11   21:iconst_0        
	//   12   22:invokestatic    #29  <Method void apy.a(int, int)>
				akb.a(((amf) (obj)).b());
	//   13   25:aload_3         
	//   14   26:invokevirtual   #33  <Method alz amf.b()>
	//   15   29:invokestatic    #38  <Method void akb.a(alz)>
				aqq1 = ((aqq) (((amf) (obj)).b()));
	//   16   32:aload_3         
	//   17   33:invokevirtual   #33  <Method alz amf.b()>
	//   18   36:astore_1        
				ami ami1 = ((alz) (aqq1)).a();
	//   19   37:aload_1         
	//   20   38:invokevirtual   #43  <Method ami alz.a()>
	//   21   41:astore_2        
				obj = ((Object) (apa.a(akb.a(ami1.a()), ((amf) (obj)).c().b(), ((amf) (obj)).d().b())));
	//   22   42:aload_2         
	//   23   43:invokevirtual   #48  <Method aml ami.a()>
	//   24   46:invokestatic    #51  <Method apc akb.a(aml)>
	//   25   49:aload_3         
	//   26   50:invokevirtual   #55  <Method aqq amf.c()>
	//   27   53:invokevirtual   #60  <Method byte[] aqq.b()>
	//   28   56:aload_3         
	//   29   57:invokevirtual   #62  <Method aqq amf.d()>
	//   30   60:invokevirtual   #60  <Method byte[] aqq.b()>
	//   31   63:invokestatic    #67  <Method java.security.interfaces.ECPublicKey apa.a(apc, byte[], byte[])>
	//   32   66:astore_3        
				akd akd1 = new akd(((alz) (aqq1)).b().a());
	//   33   67:new             #69  <Class akd>
	//   34   70:dup             
	//   35   71:aload_1         
	//   36   72:invokevirtual   #72  <Method als alz.b()>
	//   37   75:invokevirtual   #77  <Method ang als.a()>
	//   38   78:invokespecial   #80  <Method void akd(ang)>
	//   39   81:astore          4
				return (aiy)new aow(((java.security.interfaces.ECPublicKey) (obj)), ami1.c().b(), akb.a(ami1.b()), akb.a(((alz) (aqq1)).c()), ((aou) (akd1)));
	//   40   83:new             #82  <Class aow>
	//   41   86:dup             
	//   42   87:aload_3         
	//   43   88:aload_2         
	//   44   89:invokevirtual   #83  <Method aqq ami.c()>
	//   45   92:invokevirtual   #60  <Method byte[] aqq.b()>
	//   46   95:aload_2         
	//   47   96:invokevirtual   #86  <Method amn ami.b()>
	//   48   99:invokestatic    #89  <Method String akb.a(amn)>
	//   49  102:aload_1         
	//   50  103:invokevirtual   #92  <Method alq alz.c()>
	//   51  106:invokestatic    #95  <Method apd akb.a(alq)>
	//   52  109:aload           4
	//   53  111:invokespecial   #98  <Method void aow(java.security.interfaces.ECPublicKey, byte[], String, apd, aou)>
	//   54  114:checkcast       #100 <Class aiy>
	//   55  117:areturn         
			} else
			{
				throw new GeneralSecurityException("expected EciesAeadHkdfPublicKey proto");
	//   56  118:new             #102 <Class GeneralSecurityException>
	//   57  121:dup             
	//   58  122:ldc1            #104 <String "expected EciesAeadHkdfPublicKey proto">
	//   59  124:invokespecial   #107 <Method void GeneralSecurityException(String)>
	//   60  127:athrow          
			}
		}
		// Misplaced declaration of an exception variable
		catch(aqq aqq1)
	//*  61  128:astore_1        
		{
			throw new GeneralSecurityException("expected serialized EciesAeadHkdfPublicKey proto", ((Throwable) (aqq1)));
	//   62  129:new             #102 <Class GeneralSecurityException>
	//   63  132:dup             
	//   64  133:ldc1            #109 <String "expected serialized EciesAeadHkdfPublicKey proto">
	//   65  135:aload_1         
	//   66  136:invokespecial   #112 <Method void GeneralSecurityException(String, Throwable)>
	//   67  139:athrow          
		}
	}

	public final Object a(aqq aqq1)
	{
		return ((Object) (d(aqq1)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #115 <Method aiy d(aqq)>
	//    3    5:areturn         
	}

	public final Object a(atv atv)
	{
		if(atv instanceof amf)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #17  <Class amf>
	//*   2    4:ifeq            110
		{
			Object obj = ((Object) ((amf)atv));
	//    3    7:aload_1         
	//    4    8:checkcast       #17  <Class amf>
	//    5   11:astore_3        
			apy.a(((amf) (obj)).a(), 0);
	//    6   12:aload_3         
	//    7   13:invokevirtual   #24  <Method int amf.a()>
	//    8   16:iconst_0        
	//    9   17:invokestatic    #29  <Method void apy.a(int, int)>
			akb.a(((amf) (obj)).b());
	//   10   20:aload_3         
	//   11   21:invokevirtual   #33  <Method alz amf.b()>
	//   12   24:invokestatic    #38  <Method void akb.a(alz)>
			atv = ((atv) (((amf) (obj)).b()));
	//   13   27:aload_3         
	//   14   28:invokevirtual   #33  <Method alz amf.b()>
	//   15   31:astore_1        
			ami ami1 = ((alz) (atv)).a();
	//   16   32:aload_1         
	//   17   33:invokevirtual   #43  <Method ami alz.a()>
	//   18   36:astore_2        
			obj = ((Object) (apa.a(akb.a(ami1.a()), ((amf) (obj)).c().b(), ((amf) (obj)).d().b())));
	//   19   37:aload_2         
	//   20   38:invokevirtual   #48  <Method aml ami.a()>
	//   21   41:invokestatic    #51  <Method apc akb.a(aml)>
	//   22   44:aload_3         
	//   23   45:invokevirtual   #55  <Method aqq amf.c()>
	//   24   48:invokevirtual   #60  <Method byte[] aqq.b()>
	//   25   51:aload_3         
	//   26   52:invokevirtual   #62  <Method aqq amf.d()>
	//   27   55:invokevirtual   #60  <Method byte[] aqq.b()>
	//   28   58:invokestatic    #67  <Method java.security.interfaces.ECPublicKey apa.a(apc, byte[], byte[])>
	//   29   61:astore_3        
			akd akd1 = new akd(((alz) (atv)).b().a());
	//   30   62:new             #69  <Class akd>
	//   31   65:dup             
	//   32   66:aload_1         
	//   33   67:invokevirtual   #72  <Method als alz.b()>
	//   34   70:invokevirtual   #77  <Method ang als.a()>
	//   35   73:invokespecial   #80  <Method void akd(ang)>
	//   36   76:astore          4
			return ((Object) (new aow(((java.security.interfaces.ECPublicKey) (obj)), ami1.c().b(), akb.a(ami1.b()), akb.a(((alz) (atv)).c()), ((aou) (akd1)))));
	//   37   78:new             #82  <Class aow>
	//   38   81:dup             
	//   39   82:aload_3         
	//   40   83:aload_2         
	//   41   84:invokevirtual   #83  <Method aqq ami.c()>
	//   42   87:invokevirtual   #60  <Method byte[] aqq.b()>
	//   43   90:aload_2         
	//   44   91:invokevirtual   #86  <Method amn ami.b()>
	//   45   94:invokestatic    #89  <Method String akb.a(amn)>
	//   46   97:aload_1         
	//   47   98:invokevirtual   #92  <Method alq alz.c()>
	//   48  101:invokestatic    #95  <Method apd akb.a(alq)>
	//   49  104:aload           4
	//   50  106:invokespecial   #98  <Method void aow(java.security.interfaces.ECPublicKey, byte[], String, apd, aou)>
	//   51  109:areturn         
		} else
		{
			throw new GeneralSecurityException("expected EciesAeadHkdfPublicKey proto");
	//   52  110:new             #102 <Class GeneralSecurityException>
	//   53  113:dup             
	//   54  114:ldc1            #104 <String "expected EciesAeadHkdfPublicKey proto">
	//   55  116:invokespecial   #107 <Method void GeneralSecurityException(String)>
	//   56  119:athrow          
		}
	}

	public final String a()
	{
		return "type.googleapis.com/google.crypto.tink.EciesAeadHkdfPublicKey";
	//    0    0:ldc1            #119 <String "type.googleapis.com/google.crypto.tink.EciesAeadHkdfPublicKey">
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
		throw new GeneralSecurityException("Not implemented.");
	//    0    0:new             #102 <Class GeneralSecurityException>
	//    1    3:dup             
	//    2    4:ldc1            #122 <String "Not implemented.">
	//    3    6:invokespecial   #107 <Method void GeneralSecurityException(String)>
	//    4    9:athrow          
	}

	public final atv b(atv atv)
	{
		throw new GeneralSecurityException("Not implemented.");
	//    0    0:new             #102 <Class GeneralSecurityException>
	//    1    3:dup             
	//    2    4:ldc1            #122 <String "Not implemented.">
	//    3    6:invokespecial   #107 <Method void GeneralSecurityException(String)>
	//    4    9:athrow          
	}

	public final amy c(aqq aqq1)
	{
		throw new GeneralSecurityException("Not implemented.");
	//    0    0:new             #102 <Class GeneralSecurityException>
	//    1    3:dup             
	//    2    4:ldc1            #122 <String "Not implemented.">
	//    3    6:invokespecial   #107 <Method void GeneralSecurityException(String)>
	//    4    9:athrow          
	}
}

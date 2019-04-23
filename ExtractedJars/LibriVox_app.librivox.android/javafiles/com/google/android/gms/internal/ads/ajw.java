// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

// Referenced classes of package com.google.android.gms.internal.ads:
//			aok, ajl, asi, aol, 
//			aiu, ash, ajy, aji, 
//			ajx

public final class ajw
{

	public static final aok a;
	private static final aok b;
	private static final aok c;

	static 
	{
		a = (aok)(ash)((asi) (((aol)((asi) (aok.b())).a(((ash) (ajl.a)))).a(aiu.a("TinkHybridDecrypt", "HybridDecrypt", "EciesAeadHkdfPrivateKey", 0, true)).a(aiu.a("TinkHybridEncrypt", "HybridEncrypt", "EciesAeadHkdfPublicKey", 0, true)).a("TINK_HYBRID_1_0_0"))).f();
	//    0    0:invokestatic    #18  <Method aol aok.b()>
	//    1    3:getstatic       #22  <Field aok ajl.a>
	//    2    6:invokevirtual   #27  <Method asi asi.a(ash)>
	//    3    9:checkcast       #29  <Class aol>
	//    4   12:ldc1            #31  <String "TinkHybridDecrypt">
	//    5   14:ldc1            #33  <String "HybridDecrypt">
	//    6   16:ldc1            #35  <String "EciesAeadHkdfPrivateKey">
	//    7   18:iconst_0        
	//    8   19:iconst_1        
	//    9   20:invokestatic    #40  <Method anj aiu.a(String, String, String, int, boolean)>
	//   10   23:invokevirtual   #43  <Method aol aol.a(anj)>
	//   11   26:ldc1            #45  <String "TinkHybridEncrypt">
	//   12   28:ldc1            #47  <String "HybridEncrypt">
	//   13   30:ldc1            #49  <String "EciesAeadHkdfPublicKey">
	//   14   32:iconst_0        
	//   15   33:iconst_1        
	//   16   34:invokestatic    #40  <Method anj aiu.a(String, String, String, int, boolean)>
	//   17   37:invokevirtual   #43  <Method aol aol.a(anj)>
	//   18   40:ldc1            #51  <String "TINK_HYBRID_1_0_0">
	//   19   42:invokevirtual   #54  <Method aol aol.a(String)>
	//   20   45:invokevirtual   #58  <Method atv asi.f()>
	//   21   48:checkcast       #60  <Class ash>
	//   22   51:checkcast       #15  <Class aok>
	//   23   54:putstatic       #61  <Field aok a>
		b = (aok)(ash)((asi) (((aol)((asi) (aok.b())).a(((ash) (a)))).a("TINK_HYBRID_1_1_0"))).f();
	//   24   57:invokestatic    #18  <Method aol aok.b()>
	//   25   60:getstatic       #61  <Field aok a>
	//   26   63:invokevirtual   #27  <Method asi asi.a(ash)>
	//   27   66:checkcast       #29  <Class aol>
	//   28   69:ldc1            #63  <String "TINK_HYBRID_1_1_0">
	//   29   71:invokevirtual   #54  <Method aol aol.a(String)>
	//   30   74:invokevirtual   #58  <Method atv asi.f()>
	//   31   77:checkcast       #60  <Class ash>
	//   32   80:checkcast       #15  <Class aok>
	//   33   83:putstatic       #65  <Field aok b>
		c = (aok)(ash)((asi) (((aol)((asi) (aok.b())).a(((ash) (ajl.b)))).a(aiu.a("TinkHybridDecrypt", "HybridDecrypt", "EciesAeadHkdfPrivateKey", 0, true)).a(aiu.a("TinkHybridEncrypt", "HybridEncrypt", "EciesAeadHkdfPublicKey", 0, true)).a("TINK_HYBRID"))).f();
	//   34   86:invokestatic    #18  <Method aol aok.b()>
	//   35   89:getstatic       #66  <Field aok ajl.b>
	//   36   92:invokevirtual   #27  <Method asi asi.a(ash)>
	//   37   95:checkcast       #29  <Class aol>
	//   38   98:ldc1            #31  <String "TinkHybridDecrypt">
	//   39  100:ldc1            #33  <String "HybridDecrypt">
	//   40  102:ldc1            #35  <String "EciesAeadHkdfPrivateKey">
	//   41  104:iconst_0        
	//   42  105:iconst_1        
	//   43  106:invokestatic    #40  <Method anj aiu.a(String, String, String, int, boolean)>
	//   44  109:invokevirtual   #43  <Method aol aol.a(anj)>
	//   45  112:ldc1            #45  <String "TinkHybridEncrypt">
	//   46  114:ldc1            #47  <String "HybridEncrypt">
	//   47  116:ldc1            #49  <String "EciesAeadHkdfPublicKey">
	//   48  118:iconst_0        
	//   49  119:iconst_1        
	//   50  120:invokestatic    #40  <Method anj aiu.a(String, String, String, int, boolean)>
	//   51  123:invokevirtual   #43  <Method aol aol.a(anj)>
	//   52  126:ldc1            #68  <String "TINK_HYBRID">
	//   53  128:invokevirtual   #54  <Method aol aol.a(String)>
	//   54  131:invokevirtual   #58  <Method atv asi.f()>
	//   55  134:checkcast       #60  <Class ash>
	//   56  137:checkcast       #15  <Class aok>
	//   57  140:putstatic       #70  <Field aok c>
		try
		{
			ajl.a();
	//   58  143:invokestatic    #72  <Method void ajl.a()>
			aji.a("TinkHybridEncrypt", ((ait) (new ajy())));
	//   59  146:ldc1            #45  <String "TinkHybridEncrypt">
	//   60  148:new             #74  <Class ajy>
	//   61  151:dup             
	//   62  152:invokespecial   #77  <Method void ajy()>
	//   63  155:invokestatic    #82  <Method void aji.a(String, ait)>
			aji.a("TinkHybridDecrypt", ((ait) (new ajx())));
	//   64  158:ldc1            #31  <String "TinkHybridDecrypt">
	//   65  160:new             #84  <Class ajx>
	//   66  163:dup             
	//   67  164:invokespecial   #85  <Method void ajx()>
	//   68  167:invokestatic    #82  <Method void aji.a(String, ait)>
			aiu.a(c);
	//   69  170:getstatic       #70  <Field aok c>
	//   70  173:invokestatic    #88  <Method void aiu.a(aok)>
	//   71  176:return          
		}
		catch(GeneralSecurityException generalsecurityexception)
	//*  72  177:astore_0        
		{
			throw new ExceptionInInitializerError(((Throwable) (generalsecurityexception)));
	//   73  178:new             #90  <Class ExceptionInInitializerError>
	//   74  181:dup             
	//   75  182:aload_0         
	//   76  183:invokespecial   #93  <Method void ExceptionInInitializerError(Throwable)>
	//   77  186:athrow          
		}
	}
}

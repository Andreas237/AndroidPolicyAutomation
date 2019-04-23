// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

// Referenced classes of package com.google.android.gms.internal.ads:
//			aok, aki, asi, aol, 
//			aiu, ash, ajk, aji

public final class ajl
{

	public static void a()
	{
		aki.a();
	//    0    0:invokestatic    #84  <Method void aki.a()>
		aji.a("TinkAead", ((ait) (new ajk())));
	//    1    3:ldc1            #31  <String "TinkAead">
	//    2    5:new             #86  <Class ajk>
	//    3    8:dup             
	//    4    9:invokespecial   #88  <Method void ajk()>
	//    5   12:invokestatic    #93  <Method void aji.a(String, ait)>
		aiu.a(b);
	//    6   15:getstatic       #74  <Field aok b>
	//    7   18:invokestatic    #96  <Method void aiu.a(aok)>
	//    8   21:return          
	}

	public static final aok a;
	public static final aok b;
	private static final aok c;

	static 
	{
		a = (aok)(ash)((asi) (((aol)((asi) (aok.b())).a(((ash) (aki.a)))).a(aiu.a("TinkAead", "Aead", "AesCtrHmacAeadKey", 0, true)).a(aiu.a("TinkAead", "Aead", "AesEaxKey", 0, true)).a(aiu.a("TinkAead", "Aead", "AesGcmKey", 0, true)).a(aiu.a("TinkAead", "Aead", "ChaCha20Poly1305Key", 0, true)).a(aiu.a("TinkAead", "Aead", "KmsAeadKey", 0, true)).a(aiu.a("TinkAead", "Aead", "KmsEnvelopeAeadKey", 0, true)).a("TINK_AEAD_1_0_0"))).f();
	//    0    0:invokestatic    #18  <Method aol aok.b()>
	//    1    3:getstatic       #22  <Field aok aki.a>
	//    2    6:invokevirtual   #27  <Method asi asi.a(ash)>
	//    3    9:checkcast       #29  <Class aol>
	//    4   12:ldc1            #31  <String "TinkAead">
	//    5   14:ldc1            #33  <String "Aead">
	//    6   16:ldc1            #35  <String "AesCtrHmacAeadKey">
	//    7   18:iconst_0        
	//    8   19:iconst_1        
	//    9   20:invokestatic    #40  <Method anj aiu.a(String, String, String, int, boolean)>
	//   10   23:invokevirtual   #43  <Method aol aol.a(anj)>
	//   11   26:ldc1            #31  <String "TinkAead">
	//   12   28:ldc1            #33  <String "Aead">
	//   13   30:ldc1            #45  <String "AesEaxKey">
	//   14   32:iconst_0        
	//   15   33:iconst_1        
	//   16   34:invokestatic    #40  <Method anj aiu.a(String, String, String, int, boolean)>
	//   17   37:invokevirtual   #43  <Method aol aol.a(anj)>
	//   18   40:ldc1            #31  <String "TinkAead">
	//   19   42:ldc1            #33  <String "Aead">
	//   20   44:ldc1            #47  <String "AesGcmKey">
	//   21   46:iconst_0        
	//   22   47:iconst_1        
	//   23   48:invokestatic    #40  <Method anj aiu.a(String, String, String, int, boolean)>
	//   24   51:invokevirtual   #43  <Method aol aol.a(anj)>
	//   25   54:ldc1            #31  <String "TinkAead">
	//   26   56:ldc1            #33  <String "Aead">
	//   27   58:ldc1            #49  <String "ChaCha20Poly1305Key">
	//   28   60:iconst_0        
	//   29   61:iconst_1        
	//   30   62:invokestatic    #40  <Method anj aiu.a(String, String, String, int, boolean)>
	//   31   65:invokevirtual   #43  <Method aol aol.a(anj)>
	//   32   68:ldc1            #31  <String "TinkAead">
	//   33   70:ldc1            #33  <String "Aead">
	//   34   72:ldc1            #51  <String "KmsAeadKey">
	//   35   74:iconst_0        
	//   36   75:iconst_1        
	//   37   76:invokestatic    #40  <Method anj aiu.a(String, String, String, int, boolean)>
	//   38   79:invokevirtual   #43  <Method aol aol.a(anj)>
	//   39   82:ldc1            #31  <String "TinkAead">
	//   40   84:ldc1            #33  <String "Aead">
	//   41   86:ldc1            #53  <String "KmsEnvelopeAeadKey">
	//   42   88:iconst_0        
	//   43   89:iconst_1        
	//   44   90:invokestatic    #40  <Method anj aiu.a(String, String, String, int, boolean)>
	//   45   93:invokevirtual   #43  <Method aol aol.a(anj)>
	//   46   96:ldc1            #55  <String "TINK_AEAD_1_0_0">
	//   47   98:invokevirtual   #58  <Method aol aol.a(String)>
	//   48  101:invokevirtual   #62  <Method atv asi.f()>
	//   49  104:checkcast       #64  <Class ash>
	//   50  107:checkcast       #15  <Class aok>
	//   51  110:putstatic       #65  <Field aok a>
		c = (aok)(ash)((asi) (((aol)((asi) (aok.b())).a(((ash) (a)))).a("TINK_AEAD_1_1_0"))).f();
	//   52  113:invokestatic    #18  <Method aol aok.b()>
	//   53  116:getstatic       #65  <Field aok a>
	//   54  119:invokevirtual   #27  <Method asi asi.a(ash)>
	//   55  122:checkcast       #29  <Class aol>
	//   56  125:ldc1            #67  <String "TINK_AEAD_1_1_0">
	//   57  127:invokevirtual   #58  <Method aol aol.a(String)>
	//   58  130:invokevirtual   #62  <Method atv asi.f()>
	//   59  133:checkcast       #64  <Class ash>
	//   60  136:checkcast       #15  <Class aok>
	//   61  139:putstatic       #69  <Field aok c>
		b = (aok)(ash)((asi) (((aol)((asi) (aok.b())).a(((ash) (aki.b)))).a(aiu.a("TinkAead", "Aead", "AesCtrHmacAeadKey", 0, true)).a(aiu.a("TinkAead", "Aead", "AesEaxKey", 0, true)).a(aiu.a("TinkAead", "Aead", "AesGcmKey", 0, true)).a(aiu.a("TinkAead", "Aead", "ChaCha20Poly1305Key", 0, true)).a(aiu.a("TinkAead", "Aead", "KmsAeadKey", 0, true)).a(aiu.a("TinkAead", "Aead", "KmsEnvelopeAeadKey", 0, true)).a("TINK_AEAD"))).f();
	//   62  142:invokestatic    #18  <Method aol aok.b()>
	//   63  145:getstatic       #71  <Field aok aki.b>
	//   64  148:invokevirtual   #27  <Method asi asi.a(ash)>
	//   65  151:checkcast       #29  <Class aol>
	//   66  154:ldc1            #31  <String "TinkAead">
	//   67  156:ldc1            #33  <String "Aead">
	//   68  158:ldc1            #35  <String "AesCtrHmacAeadKey">
	//   69  160:iconst_0        
	//   70  161:iconst_1        
	//   71  162:invokestatic    #40  <Method anj aiu.a(String, String, String, int, boolean)>
	//   72  165:invokevirtual   #43  <Method aol aol.a(anj)>
	//   73  168:ldc1            #31  <String "TinkAead">
	//   74  170:ldc1            #33  <String "Aead">
	//   75  172:ldc1            #45  <String "AesEaxKey">
	//   76  174:iconst_0        
	//   77  175:iconst_1        
	//   78  176:invokestatic    #40  <Method anj aiu.a(String, String, String, int, boolean)>
	//   79  179:invokevirtual   #43  <Method aol aol.a(anj)>
	//   80  182:ldc1            #31  <String "TinkAead">
	//   81  184:ldc1            #33  <String "Aead">
	//   82  186:ldc1            #47  <String "AesGcmKey">
	//   83  188:iconst_0        
	//   84  189:iconst_1        
	//   85  190:invokestatic    #40  <Method anj aiu.a(String, String, String, int, boolean)>
	//   86  193:invokevirtual   #43  <Method aol aol.a(anj)>
	//   87  196:ldc1            #31  <String "TinkAead">
	//   88  198:ldc1            #33  <String "Aead">
	//   89  200:ldc1            #49  <String "ChaCha20Poly1305Key">
	//   90  202:iconst_0        
	//   91  203:iconst_1        
	//   92  204:invokestatic    #40  <Method anj aiu.a(String, String, String, int, boolean)>
	//   93  207:invokevirtual   #43  <Method aol aol.a(anj)>
	//   94  210:ldc1            #31  <String "TinkAead">
	//   95  212:ldc1            #33  <String "Aead">
	//   96  214:ldc1            #51  <String "KmsAeadKey">
	//   97  216:iconst_0        
	//   98  217:iconst_1        
	//   99  218:invokestatic    #40  <Method anj aiu.a(String, String, String, int, boolean)>
	//  100  221:invokevirtual   #43  <Method aol aol.a(anj)>
	//  101  224:ldc1            #31  <String "TinkAead">
	//  102  226:ldc1            #33  <String "Aead">
	//  103  228:ldc1            #53  <String "KmsEnvelopeAeadKey">
	//  104  230:iconst_0        
	//  105  231:iconst_1        
	//  106  232:invokestatic    #40  <Method anj aiu.a(String, String, String, int, boolean)>
	//  107  235:invokevirtual   #43  <Method aol aol.a(anj)>
	//  108  238:ldc1            #73  <String "TINK_AEAD">
	//  109  240:invokevirtual   #58  <Method aol aol.a(String)>
	//  110  243:invokevirtual   #62  <Method atv asi.f()>
	//  111  246:checkcast       #64  <Class ash>
	//  112  249:checkcast       #15  <Class aok>
	//  113  252:putstatic       #74  <Field aok b>
		try
		{
			a();
	//  114  255:invokestatic    #76  <Method void a()>
	//  115  258:return          
		}
		catch(GeneralSecurityException generalsecurityexception)
	//* 116  259:astore_0        
		{
			throw new ExceptionInInitializerError(((Throwable) (generalsecurityexception)));
	//  117  260:new             #78  <Class ExceptionInInitializerError>
	//  118  263:dup             
	//  119  264:aload_0         
	//  120  265:invokespecial   #82  <Method void ExceptionInInitializerError(Throwable)>
	//  121  268:athrow          
		}
	}
}

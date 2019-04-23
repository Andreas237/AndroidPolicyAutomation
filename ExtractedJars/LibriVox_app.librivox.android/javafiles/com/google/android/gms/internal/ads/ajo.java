// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

// Referenced classes of package com.google.android.gms.internal.ads:
//			aiz, asu, aky, apy, 
//			aqq, ale, aoo, ais, 
//			alb, aps, akz, asi, 
//			ash, amy, amz, aqh, 
//			ana, atv

final class ajo
	implements aiz
{

	ajo()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #10  <Method void Object()>
	//    2    4:return          
	}

	private final ais d(aqq aqq1)
	{
		try
		{
			aqq1 = ((aqq) (aky.a(aqq1)));
	//    0    0:aload_1         
	//    1    1:invokestatic    #21  <Method aky aky.a(aqq)>
	//    2    4:astore_1        
			if(!(aqq1 instanceof aky))
				break MISSING_BLOCK_LABEL_97;
	//    3    5:aload_1         
	//    4    6:instanceof      #17  <Class aky>
	//    5    9:ifeq            97
			aqq1 = ((aqq) ((aky)aqq1));
	//    6   12:aload_1         
	//    7   13:checkcast       #17  <Class aky>
	//    8   16:astore_1        
			apy.a(((aky) (aqq1)).a(), 0);
	//    9   17:aload_1         
	//   10   18:invokevirtual   #24  <Method int aky.a()>
	//   11   21:iconst_0        
	//   12   22:invokestatic    #29  <Method void apy.a(int, int)>
			apy.a(((aky) (aqq1)).c().a());
	//   13   25:aload_1         
	//   14   26:invokevirtual   #33  <Method aqq aky.c()>
	//   15   29:invokevirtual   #36  <Method int aqq.a()>
	//   16   32:invokestatic    #39  <Method void apy.a(int)>
			if(((aky) (aqq1)).b().a() == 12 || ((aky) (aqq1)).b().a() == 16)
	//*  17   35:aload_1         
	//*  18   36:invokevirtual   #43  <Method ale aky.b()>
	//*  19   39:invokevirtual   #46  <Method int ale.a()>
	//*  20   42:bipush          12
	//*  21   44:icmpeq          72
	//*  22   47:aload_1         
	//*  23   48:invokevirtual   #43  <Method ale aky.b()>
	//*  24   51:invokevirtual   #46  <Method int ale.a()>
	//*  25   54:bipush          16
	//*  26   56:icmpne          62
				break MISSING_BLOCK_LABEL_72;
	//   27   59:goto            72
		}
	//*  28   62:new             #48  <Class GeneralSecurityException>
	//*  29   65:dup             
	//*  30   66:ldc1            #50  <String "invalid IV size; acceptable values have 12 or 16 bytes">
	//*  31   68:invokespecial   #53  <Method void GeneralSecurityException(String)>
	//*  32   71:athrow          
	//*  33   72:new             #55  <Class aoo>
	//*  34   75:dup             
	//*  35   76:aload_1         
	//*  36   77:invokevirtual   #33  <Method aqq aky.c()>
	//*  37   80:invokevirtual   #58  <Method byte[] aqq.b()>
	//*  38   83:aload_1         
	//*  39   84:invokevirtual   #43  <Method ale aky.b()>
	//*  40   87:invokevirtual   #46  <Method int ale.a()>
	//*  41   90:invokespecial   #61  <Method void aoo(byte[], int)>
	//*  42   93:checkcast       #63  <Class ais>
	//*  43   96:areturn         
	//*  44   97:new             #48  <Class GeneralSecurityException>
	//*  45  100:dup             
	//*  46  101:ldc1            #65  <String "expected AesEaxKey proto">
	//*  47  103:invokespecial   #53  <Method void GeneralSecurityException(String)>
	//*  48  106:athrow          
		// Misplaced declaration of an exception variable
		catch(aqq aqq1)
	//*  49  107:astore_1        
		{
			throw new GeneralSecurityException("expected serialized AesEaxKey proto", ((Throwable) (aqq1)));
	//   50  108:new             #48  <Class GeneralSecurityException>
	//   51  111:dup             
	//   52  112:ldc1            #67  <String "expected serialized AesEaxKey proto">
	//   53  114:aload_1         
	//   54  115:invokespecial   #70  <Method void GeneralSecurityException(String, Throwable)>
	//   55  118:athrow          
		}
		throw new GeneralSecurityException("invalid IV size; acceptable values have 12 or 16 bytes");
		return (ais)new aoo(((aky) (aqq1)).c().b(), ((aky) (aqq1)).b().a());
		throw new GeneralSecurityException("expected AesEaxKey proto");
	}

	public final Object a(aqq aqq1)
	{
		return ((Object) (d(aqq1)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #73  <Method ais d(aqq)>
	//    3    5:areturn         
	}

	public final Object a(atv atv)
	{
		if(atv instanceof aky)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #17  <Class aky>
	//*   2    4:ifeq            89
		{
			atv = ((atv) ((aky)atv));
	//    3    7:aload_1         
	//    4    8:checkcast       #17  <Class aky>
	//    5   11:astore_1        
			apy.a(((aky) (atv)).a(), 0);
	//    6   12:aload_1         
	//    7   13:invokevirtual   #24  <Method int aky.a()>
	//    8   16:iconst_0        
	//    9   17:invokestatic    #29  <Method void apy.a(int, int)>
			apy.a(((aky) (atv)).c().a());
	//   10   20:aload_1         
	//   11   21:invokevirtual   #33  <Method aqq aky.c()>
	//   12   24:invokevirtual   #36  <Method int aqq.a()>
	//   13   27:invokestatic    #39  <Method void apy.a(int)>
			if(((aky) (atv)).b().a() != 12 && ((aky) (atv)).b().a() != 16)
	//*  14   30:aload_1         
	//*  15   31:invokevirtual   #43  <Method ale aky.b()>
	//*  16   34:invokevirtual   #46  <Method int ale.a()>
	//*  17   37:bipush          12
	//*  18   39:icmpeq          67
	//*  19   42:aload_1         
	//*  20   43:invokevirtual   #43  <Method ale aky.b()>
	//*  21   46:invokevirtual   #46  <Method int ale.a()>
	//*  22   49:bipush          16
	//*  23   51:icmpne          57
	//*  24   54:goto            67
				throw new GeneralSecurityException("invalid IV size; acceptable values have 12 or 16 bytes");
	//   25   57:new             #48  <Class GeneralSecurityException>
	//   26   60:dup             
	//   27   61:ldc1            #50  <String "invalid IV size; acceptable values have 12 or 16 bytes">
	//   28   63:invokespecial   #53  <Method void GeneralSecurityException(String)>
	//   29   66:athrow          
			else
				return ((Object) (new aoo(((aky) (atv)).c().b(), ((aky) (atv)).b().a())));
	//   30   67:new             #55  <Class aoo>
	//   31   70:dup             
	//   32   71:aload_1         
	//   33   72:invokevirtual   #33  <Method aqq aky.c()>
	//   34   75:invokevirtual   #58  <Method byte[] aqq.b()>
	//   35   78:aload_1         
	//   36   79:invokevirtual   #43  <Method ale aky.b()>
	//   37   82:invokevirtual   #46  <Method int ale.a()>
	//   38   85:invokespecial   #61  <Method void aoo(byte[], int)>
	//   39   88:areturn         
		} else
		{
			throw new GeneralSecurityException("expected AesEaxKey proto");
	//   40   89:new             #48  <Class GeneralSecurityException>
	//   41   92:dup             
	//   42   93:ldc1            #65  <String "expected AesEaxKey proto">
	//   43   95:invokespecial   #53  <Method void GeneralSecurityException(String)>
	//   44   98:athrow          
		}
	}

	public final String a()
	{
		return "type.googleapis.com/google.crypto.tink.AesEaxKey";
	//    0    0:ldc1            #77  <String "type.googleapis.com/google.crypto.tink.AesEaxKey">
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
			aqq1 = ((aqq) (b(((atv) (alb.a(aqq1))))));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #83  <Method alb alb.a(aqq)>
	//    3    5:invokevirtual   #86  <Method atv b(atv)>
	//    4    8:astore_1        
		}
	//*   5    9:aload_1         
	//*   6   10:areturn         
		// Misplaced declaration of an exception variable
		catch(aqq aqq1)
	//*   7   11:astore_1        
		{
			throw new GeneralSecurityException("expected serialized AesEaxKeyFormat proto", ((Throwable) (aqq1)));
	//    8   12:new             #48  <Class GeneralSecurityException>
	//    9   15:dup             
	//   10   16:ldc1            #88  <String "expected serialized AesEaxKeyFormat proto">
	//   11   18:aload_1         
	//   12   19:invokespecial   #70  <Method void GeneralSecurityException(String, Throwable)>
	//   13   22:athrow          
		}
		return ((atv) (aqq1));
	}

	public final atv b(atv atv)
	{
		if(atv instanceof alb)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #80  <Class alb>
	//*   2    4:ifeq            90
		{
			atv = ((atv) ((alb)atv));
	//    3    7:aload_1         
	//    4    8:checkcast       #80  <Class alb>
	//    5   11:astore_1        
			apy.a(((alb) (atv)).b());
	//    6   12:aload_1         
	//    7   13:invokevirtual   #90  <Method int alb.b()>
	//    8   16:invokestatic    #39  <Method void apy.a(int)>
			if(((alb) (atv)).a().a() != 12 && ((alb) (atv)).a().a() != 16)
	//*   9   19:aload_1         
	//*  10   20:invokevirtual   #92  <Method ale alb.a()>
	//*  11   23:invokevirtual   #46  <Method int ale.a()>
	//*  12   26:bipush          12
	//*  13   28:icmpeq          56
	//*  14   31:aload_1         
	//*  15   32:invokevirtual   #92  <Method ale alb.a()>
	//*  16   35:invokevirtual   #46  <Method int ale.a()>
	//*  17   38:bipush          16
	//*  18   40:icmpne          46
	//*  19   43:goto            56
				throw new GeneralSecurityException("invalid IV size; acceptable values have 12 or 16 bytes");
	//   20   46:new             #48  <Class GeneralSecurityException>
	//   21   49:dup             
	//   22   50:ldc1            #50  <String "invalid IV size; acceptable values have 12 or 16 bytes">
	//   23   52:invokespecial   #53  <Method void GeneralSecurityException(String)>
	//   24   55:athrow          
			else
				return ((atv) ((ash)((asi) (aky.d().a(aqq.a(aps.a(((alb) (atv)).b()))).a(((alb) (atv)).a()).a(0))).f()));
	//   25   56:invokestatic    #95  <Method akz aky.d()>
	//   26   59:aload_1         
	//   27   60:invokevirtual   #90  <Method int alb.b()>
	//   28   63:invokestatic    #100 <Method byte[] aps.a(int)>
	//   29   66:invokestatic    #103 <Method aqq aqq.a(byte[])>
	//   30   69:invokevirtual   #108 <Method akz akz.a(aqq)>
	//   31   72:aload_1         
	//   32   73:invokevirtual   #92  <Method ale alb.a()>
	//   33   76:invokevirtual   #111 <Method akz akz.a(ale)>
	//   34   79:iconst_0        
	//   35   80:invokevirtual   #114 <Method akz akz.a(int)>
	//   36   83:invokevirtual   #120 <Method atv asi.f()>
	//   37   86:checkcast       #122 <Class ash>
	//   38   89:areturn         
		} else
		{
			throw new GeneralSecurityException("expected AesEaxKeyFormat proto");
	//   39   90:new             #48  <Class GeneralSecurityException>
	//   40   93:dup             
	//   41   94:ldc1            #124 <String "expected AesEaxKeyFormat proto">
	//   42   96:invokespecial   #53  <Method void GeneralSecurityException(String)>
	//   43   99:athrow          
		}
	}

	public final amy c(aqq aqq1)
	{
		aqq1 = ((aqq) ((aky)b(aqq1)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #127 <Method atv b(aqq)>
	//    3    5:checkcast       #17  <Class aky>
	//    4    8:astore_1        
		return (amy)(ash)((asi) (amy.d().a("type.googleapis.com/google.crypto.tink.AesEaxKey").a(((aqh) (aqq1)).h()).a(ana.b))).f();
	//    5    9:invokestatic    #132 <Method amz amy.d()>
	//    6   12:ldc1            #77  <String "type.googleapis.com/google.crypto.tink.AesEaxKey">
	//    7   14:invokevirtual   #137 <Method amz amz.a(String)>
	//    8   17:aload_1         
	//    9   18:invokevirtual   #142 <Method aqq aqh.h()>
	//   10   21:invokevirtual   #145 <Method amz amz.a(aqq)>
	//   11   24:getstatic       #150 <Field ana ana.b>
	//   12   27:invokevirtual   #153 <Method amz amz.a(ana)>
	//   13   30:invokevirtual   #120 <Method atv asi.f()>
	//   14   33:checkcast       #122 <Class ash>
	//   15   36:checkcast       #129 <Class amy>
	//   16   39:areturn         
	}
}

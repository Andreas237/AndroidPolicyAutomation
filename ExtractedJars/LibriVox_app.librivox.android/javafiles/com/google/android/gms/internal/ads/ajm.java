// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.logging.Logger;

// Referenced classes of package com.google.android.gms.internal.ads:
//			aiz, ajn, aji, asu, 
//			akj, apy, ape, app, 
//			ajd, amp, amv, ais, 
//			akm, akp, akk, asi, 
//			ash, amy, amz, aqh, 
//			ana, aqq, atv

class ajm
	implements aiz
{

	ajm()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #28  <Method void Object()>
		aji.a(((aiz) (new ajn())));
	//    2    4:new             #30  <Class ajn>
	//    3    7:dup             
	//    4    8:invokespecial   #31  <Method void ajn()>
	//    5   11:invokestatic    #36  <Method void aji.a(aiz)>
	//    6   14:return          
	}

	private final ais d(aqq aqq)
	{
		try
		{
			aqq = ((aqq) (akj.a(aqq)));
	//    0    0:aload_1         
	//    1    1:invokestatic    #45  <Method akj akj.a(aqq)>
	//    2    4:astore_1        
			if(aqq instanceof akj)
	//*   3    5:aload_1         
	//*   4    6:instanceof      #42  <Class akj>
	//*   5    9:ifeq            70
			{
				aqq = ((aqq) ((akj)aqq));
	//    6   12:aload_1         
	//    7   13:checkcast       #42  <Class akj>
	//    8   16:astore_1        
				apy.a(((akj) (aqq)).a(), 0);
	//    9   17:aload_1         
	//   10   18:invokevirtual   #48  <Method int akj.a()>
	//   11   21:iconst_0        
	//   12   22:invokestatic    #53  <Method void apy.a(int, int)>
				return (ais)new ape((app)aji.b("type.googleapis.com/google.crypto.tink.AesCtrKey", ((atv) (((akj) (aqq)).b()))), (ajd)aji.b("type.googleapis.com/google.crypto.tink.HmacKey", ((atv) (((akj) (aqq)).c()))), ((akj) (aqq)).c().b().b());
	//   13   25:new             #55  <Class ape>
	//   14   28:dup             
	//   15   29:ldc1            #57  <String "type.googleapis.com/google.crypto.tink.AesCtrKey">
	//   16   31:aload_1         
	//   17   32:invokevirtual   #61  <Method akp akj.b()>
	//   18   35:invokestatic    #64  <Method Object aji.b(String, atv)>
	//   19   38:checkcast       #66  <Class app>
	//   20   41:ldc1            #68  <String "type.googleapis.com/google.crypto.tink.HmacKey">
	//   21   43:aload_1         
	//   22   44:invokevirtual   #72  <Method amp akj.c()>
	//   23   47:invokestatic    #64  <Method Object aji.b(String, atv)>
	//   24   50:checkcast       #74  <Class ajd>
	//   25   53:aload_1         
	//   26   54:invokevirtual   #72  <Method amp akj.c()>
	//   27   57:invokevirtual   #79  <Method amv amp.b()>
	//   28   60:invokevirtual   #83  <Method int amv.b()>
	//   29   63:invokespecial   #86  <Method void ape(app, ajd, int)>
	//   30   66:checkcast       #88  <Class ais>
	//   31   69:areturn         
			} else
			{
				throw new GeneralSecurityException("expected AesCtrHmacAeadKey proto");
	//   32   70:new             #90  <Class GeneralSecurityException>
	//   33   73:dup             
	//   34   74:ldc1            #92  <String "expected AesCtrHmacAeadKey proto">
	//   35   76:invokespecial   #95  <Method void GeneralSecurityException(String)>
	//   36   79:athrow          
			}
		}
		// Misplaced declaration of an exception variable
		catch(aqq aqq)
	//*  37   80:astore_1        
		{
			throw new GeneralSecurityException("expected serialized AesCtrHmacAeadKey proto", ((Throwable) (aqq)));
	//   38   81:new             #90  <Class GeneralSecurityException>
	//   39   84:dup             
	//   40   85:ldc1            #97  <String "expected serialized AesCtrHmacAeadKey proto">
	//   41   87:aload_1         
	//   42   88:invokespecial   #100 <Method void GeneralSecurityException(String, Throwable)>
	//   43   91:athrow          
		}
	}

	public final Object a(aqq aqq)
	{
		return ((Object) (d(aqq)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #103 <Method ais d(aqq)>
	//    3    5:areturn         
	}

	public final Object a(atv atv)
	{
		if(atv instanceof akj)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #42  <Class akj>
	//*   2    4:ifeq            62
		{
			atv = ((atv) ((akj)atv));
	//    3    7:aload_1         
	//    4    8:checkcast       #42  <Class akj>
	//    5   11:astore_1        
			apy.a(((akj) (atv)).a(), 0);
	//    6   12:aload_1         
	//    7   13:invokevirtual   #48  <Method int akj.a()>
	//    8   16:iconst_0        
	//    9   17:invokestatic    #53  <Method void apy.a(int, int)>
			return ((Object) (new ape((app)aji.b("type.googleapis.com/google.crypto.tink.AesCtrKey", ((atv) (((akj) (atv)).b()))), (ajd)aji.b("type.googleapis.com/google.crypto.tink.HmacKey", ((atv) (((akj) (atv)).c()))), ((akj) (atv)).c().b().b())));
	//   10   20:new             #55  <Class ape>
	//   11   23:dup             
	//   12   24:ldc1            #57  <String "type.googleapis.com/google.crypto.tink.AesCtrKey">
	//   13   26:aload_1         
	//   14   27:invokevirtual   #61  <Method akp akj.b()>
	//   15   30:invokestatic    #64  <Method Object aji.b(String, atv)>
	//   16   33:checkcast       #66  <Class app>
	//   17   36:ldc1            #68  <String "type.googleapis.com/google.crypto.tink.HmacKey">
	//   18   38:aload_1         
	//   19   39:invokevirtual   #72  <Method amp akj.c()>
	//   20   42:invokestatic    #64  <Method Object aji.b(String, atv)>
	//   21   45:checkcast       #74  <Class ajd>
	//   22   48:aload_1         
	//   23   49:invokevirtual   #72  <Method amp akj.c()>
	//   24   52:invokevirtual   #79  <Method amv amp.b()>
	//   25   55:invokevirtual   #83  <Method int amv.b()>
	//   26   58:invokespecial   #86  <Method void ape(app, ajd, int)>
	//   27   61:areturn         
		} else
		{
			throw new GeneralSecurityException("expected AesCtrHmacAeadKey proto");
	//   28   62:new             #90  <Class GeneralSecurityException>
	//   29   65:dup             
	//   30   66:ldc1            #92  <String "expected AesCtrHmacAeadKey proto">
	//   31   68:invokespecial   #95  <Method void GeneralSecurityException(String)>
	//   32   71:athrow          
		}
	}

	public final String a()
	{
		return "type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey";
	//    0    0:ldc1            #106 <String "type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey">
	//    1    2:areturn         
	}

	public final int b()
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public final atv b(aqq aqq)
	{
		try
		{
			aqq = ((aqq) (b(((atv) (akm.a(aqq))))));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #112 <Method akm akm.a(aqq)>
	//    3    5:invokevirtual   #115 <Method atv b(atv)>
	//    4    8:astore_1        
		}
	//*   5    9:aload_1         
	//*   6   10:areturn         
		// Misplaced declaration of an exception variable
		catch(aqq aqq)
	//*   7   11:astore_1        
		{
			throw new GeneralSecurityException("expected serialized AesCtrHmacAeadKeyFormat proto", ((Throwable) (aqq)));
	//    8   12:new             #90  <Class GeneralSecurityException>
	//    9   15:dup             
	//   10   16:ldc1            #117 <String "expected serialized AesCtrHmacAeadKeyFormat proto">
	//   11   18:aload_1         
	//   12   19:invokespecial   #100 <Method void GeneralSecurityException(String, Throwable)>
	//   13   22:athrow          
		}
		return ((atv) (aqq));
	}

	public final atv b(atv atv)
	{
		if(atv instanceof akm)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #109 <Class akm>
	//*   2    4:ifeq            60
		{
			Object obj = ((Object) ((akm)atv));
	//    3    7:aload_1         
	//    4    8:checkcast       #109 <Class akm>
	//    5   11:astore_2        
			atv = ((atv) ((akp)aji.a("type.googleapis.com/google.crypto.tink.AesCtrKey", ((atv) (((akm) (obj)).a())))));
	//    6   12:ldc1            #57  <String "type.googleapis.com/google.crypto.tink.AesCtrKey">
	//    7   14:aload_2         
	//    8   15:invokevirtual   #120 <Method aks akm.a()>
	//    9   18:invokestatic    #123 <Method atv aji.a(String, atv)>
	//   10   21:checkcast       #125 <Class akp>
	//   11   24:astore_1        
			obj = ((Object) ((amp)aji.a("type.googleapis.com/google.crypto.tink.HmacKey", ((atv) (((akm) (obj)).b())))));
	//   12   25:ldc1            #68  <String "type.googleapis.com/google.crypto.tink.HmacKey">
	//   13   27:aload_2         
	//   14   28:invokevirtual   #128 <Method ams akm.b()>
	//   15   31:invokestatic    #123 <Method atv aji.a(String, atv)>
	//   16   34:checkcast       #76  <Class amp>
	//   17   37:astore_2        
			return ((atv) ((ash)((asi) (akj.d().a(((akp) (atv))).a(((amp) (obj))).a(0))).f()));
	//   18   38:invokestatic    #131 <Method akk akj.d()>
	//   19   41:aload_1         
	//   20   42:invokevirtual   #136 <Method akk akk.a(akp)>
	//   21   45:aload_2         
	//   22   46:invokevirtual   #139 <Method akk akk.a(amp)>
	//   23   49:iconst_0        
	//   24   50:invokevirtual   #142 <Method akk akk.a(int)>
	//   25   53:invokevirtual   #148 <Method atv asi.f()>
	//   26   56:checkcast       #150 <Class ash>
	//   27   59:areturn         
		} else
		{
			throw new GeneralSecurityException("expected AesCtrHmacAeadKeyFormat proto");
	//   28   60:new             #90  <Class GeneralSecurityException>
	//   29   63:dup             
	//   30   64:ldc1            #152 <String "expected AesCtrHmacAeadKeyFormat proto">
	//   31   66:invokespecial   #95  <Method void GeneralSecurityException(String)>
	//   32   69:athrow          
		}
	}

	public final amy c(aqq aqq)
	{
		aqq = ((aqq) ((akj)b(aqq)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #155 <Method atv b(aqq)>
	//    3    5:checkcast       #42  <Class akj>
	//    4    8:astore_1        
		return (amy)(ash)((asi) (amy.d().a("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey").a(((aqh) (aqq)).h()).a(ana.b))).f();
	//    5    9:invokestatic    #160 <Method amz amy.d()>
	//    6   12:ldc1            #106 <String "type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey">
	//    7   14:invokevirtual   #165 <Method amz amz.a(String)>
	//    8   17:aload_1         
	//    9   18:invokevirtual   #171 <Method aqq aqh.h()>
	//   10   21:invokevirtual   #174 <Method amz amz.a(aqq)>
	//   11   24:getstatic       #179 <Field ana ana.b>
	//   12   27:invokevirtual   #182 <Method amz amz.a(ana)>
	//   13   30:invokevirtual   #148 <Method atv asi.f()>
	//   14   33:checkcast       #150 <Class ash>
	//   15   36:checkcast       #157 <Class amy>
	//   16   39:areturn         
	}

	private static final Logger a = Logger.getLogger(((Class) (com/google/android/gms/internal/ads/ajm)).getName());

	static 
	{
	//    0    0:ldc1            #2   <Class ajm>
	//    1    2:invokevirtual   #16  <Method String Class.getName()>
	//    2    5:invokestatic    #22  <Method Logger Logger.getLogger(String)>
	//    3    8:putstatic       #24  <Field Logger a>
	//*   4   11:return          
	}
}

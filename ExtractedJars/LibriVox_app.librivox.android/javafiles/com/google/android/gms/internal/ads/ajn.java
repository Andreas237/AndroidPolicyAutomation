// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

// Referenced classes of package com.google.android.gms.internal.ads:
//			aiz, akv, asu, akp, 
//			apy, aqq, aon, aks, 
//			akq, aps, asi, ash, 
//			amy, amz, aqh, ana, 
//			atv

final class ajn
	implements aiz
{

	ajn()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #10  <Method void Object()>
	//    2    4:return          
	}

	private static void a(akv akv1)
	{
		if(akv1.a() >= 12 && akv1.a() <= 16)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #18  <Method int akv.a()>
	//*   2    4:bipush          12
	//*   3    6:icmplt          19
	//*   4    9:aload_0         
	//*   5   10:invokevirtual   #18  <Method int akv.a()>
	//*   6   13:bipush          16
	//*   7   15:icmpgt          19
			return;
	//    8   18:return          
		else
			throw new GeneralSecurityException("invalid IV size");
	//    9   19:new             #20  <Class GeneralSecurityException>
	//   10   22:dup             
	//   11   23:ldc1            #22  <String "invalid IV size">
	//   12   25:invokespecial   #25  <Method void GeneralSecurityException(String)>
	//   13   28:athrow          
	}

	private final aon d(aqq aqq1)
	{
		try
		{
			aqq1 = ((aqq) (akp.a(aqq1)));
	//    0    0:aload_1         
	//    1    1:invokestatic    #34  <Method akp akp.a(aqq)>
	//    2    4:astore_1        
			if(aqq1 instanceof akp)
	//*   3    5:aload_1         
	//*   4    6:instanceof      #31  <Class akp>
	//*   5    9:ifeq            67
			{
				aqq1 = ((aqq) ((akp)aqq1));
	//    6   12:aload_1         
	//    7   13:checkcast       #31  <Class akp>
	//    8   16:astore_1        
				apy.a(((akp) (aqq1)).a(), 0);
	//    9   17:aload_1         
	//   10   18:invokevirtual   #35  <Method int akp.a()>
	//   11   21:iconst_0        
	//   12   22:invokestatic    #40  <Method void apy.a(int, int)>
				apy.a(((akp) (aqq1)).c().a());
	//   13   25:aload_1         
	//   14   26:invokevirtual   #44  <Method aqq akp.c()>
	//   15   29:invokevirtual   #47  <Method int aqq.a()>
	//   16   32:invokestatic    #50  <Method void apy.a(int)>
				a(((akp) (aqq1)).b());
	//   17   35:aload_1         
	//   18   36:invokevirtual   #54  <Method akv akp.b()>
	//   19   39:invokestatic    #56  <Method void a(akv)>
				return (aon)new aon(((akp) (aqq1)).c().b(), ((akp) (aqq1)).b().a());
	//   20   42:new             #58  <Class aon>
	//   21   45:dup             
	//   22   46:aload_1         
	//   23   47:invokevirtual   #44  <Method aqq akp.c()>
	//   24   50:invokevirtual   #61  <Method byte[] aqq.b()>
	//   25   53:aload_1         
	//   26   54:invokevirtual   #54  <Method akv akp.b()>
	//   27   57:invokevirtual   #18  <Method int akv.a()>
	//   28   60:invokespecial   #64  <Method void aon(byte[], int)>
	//   29   63:checkcast       #58  <Class aon>
	//   30   66:areturn         
			} else
			{
				throw new GeneralSecurityException("expected AesCtrKey proto");
	//   31   67:new             #20  <Class GeneralSecurityException>
	//   32   70:dup             
	//   33   71:ldc1            #66  <String "expected AesCtrKey proto">
	//   34   73:invokespecial   #25  <Method void GeneralSecurityException(String)>
	//   35   76:athrow          
			}
		}
		// Misplaced declaration of an exception variable
		catch(aqq aqq1)
	//*  36   77:astore_1        
		{
			throw new GeneralSecurityException("expected serialized AesCtrKey proto", ((Throwable) (aqq1)));
	//   37   78:new             #20  <Class GeneralSecurityException>
	//   38   81:dup             
	//   39   82:ldc1            #68  <String "expected serialized AesCtrKey proto">
	//   40   84:aload_1         
	//   41   85:invokespecial   #71  <Method void GeneralSecurityException(String, Throwable)>
	//   42   88:athrow          
		}
	}

	public final Object a(aqq aqq1)
	{
		return ((Object) (d(aqq1)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #74  <Method aon d(aqq)>
	//    3    5:areturn         
	}

	public final Object a(atv atv)
	{
		if(atv instanceof akp)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #31  <Class akp>
	//*   2    4:ifeq            59
		{
			atv = ((atv) ((akp)atv));
	//    3    7:aload_1         
	//    4    8:checkcast       #31  <Class akp>
	//    5   11:astore_1        
			apy.a(((akp) (atv)).a(), 0);
	//    6   12:aload_1         
	//    7   13:invokevirtual   #35  <Method int akp.a()>
	//    8   16:iconst_0        
	//    9   17:invokestatic    #40  <Method void apy.a(int, int)>
			apy.a(((akp) (atv)).c().a());
	//   10   20:aload_1         
	//   11   21:invokevirtual   #44  <Method aqq akp.c()>
	//   12   24:invokevirtual   #47  <Method int aqq.a()>
	//   13   27:invokestatic    #50  <Method void apy.a(int)>
			a(((akp) (atv)).b());
	//   14   30:aload_1         
	//   15   31:invokevirtual   #54  <Method akv akp.b()>
	//   16   34:invokestatic    #56  <Method void a(akv)>
			return ((Object) (new aon(((akp) (atv)).c().b(), ((akp) (atv)).b().a())));
	//   17   37:new             #58  <Class aon>
	//   18   40:dup             
	//   19   41:aload_1         
	//   20   42:invokevirtual   #44  <Method aqq akp.c()>
	//   21   45:invokevirtual   #61  <Method byte[] aqq.b()>
	//   22   48:aload_1         
	//   23   49:invokevirtual   #54  <Method akv akp.b()>
	//   24   52:invokevirtual   #18  <Method int akv.a()>
	//   25   55:invokespecial   #64  <Method void aon(byte[], int)>
	//   26   58:areturn         
		} else
		{
			throw new GeneralSecurityException("expected AesCtrKey proto");
	//   27   59:new             #20  <Class GeneralSecurityException>
	//   28   62:dup             
	//   29   63:ldc1            #66  <String "expected AesCtrKey proto">
	//   30   65:invokespecial   #25  <Method void GeneralSecurityException(String)>
	//   31   68:athrow          
		}
	}

	public final String a()
	{
		return "type.googleapis.com/google.crypto.tink.AesCtrKey";
	//    0    0:ldc1            #78  <String "type.googleapis.com/google.crypto.tink.AesCtrKey">
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
			aqq1 = ((aqq) (b(((atv) (aks.a(aqq1))))));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #84  <Method aks aks.a(aqq)>
	//    3    5:invokevirtual   #87  <Method atv b(atv)>
	//    4    8:astore_1        
		}
	//*   5    9:aload_1         
	//*   6   10:areturn         
		// Misplaced declaration of an exception variable
		catch(aqq aqq1)
	//*   7   11:astore_1        
		{
			throw new GeneralSecurityException("expected serialized AesCtrKeyFormat proto", ((Throwable) (aqq1)));
	//    8   12:new             #20  <Class GeneralSecurityException>
	//    9   15:dup             
	//   10   16:ldc1            #89  <String "expected serialized AesCtrKeyFormat proto">
	//   11   18:aload_1         
	//   12   19:invokespecial   #71  <Method void GeneralSecurityException(String, Throwable)>
	//   13   22:athrow          
		}
		return ((atv) (aqq1));
	}

	public final atv b(atv atv)
	{
		if(atv instanceof aks)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #81  <Class aks>
	//*   2    4:ifeq            60
		{
			atv = ((atv) ((aks)atv));
	//    3    7:aload_1         
	//    4    8:checkcast       #81  <Class aks>
	//    5   11:astore_1        
			apy.a(((aks) (atv)).b());
	//    6   12:aload_1         
	//    7   13:invokevirtual   #91  <Method int aks.b()>
	//    8   16:invokestatic    #50  <Method void apy.a(int)>
			a(((aks) (atv)).a());
	//    9   19:aload_1         
	//   10   20:invokevirtual   #93  <Method akv aks.a()>
	//   11   23:invokestatic    #56  <Method void a(akv)>
			return ((atv) ((ash)((asi) (akp.d().a(((aks) (atv)).a()).a(aqq.a(aps.a(((aks) (atv)).b()))).a(0))).f()));
	//   12   26:invokestatic    #96  <Method akq akp.d()>
	//   13   29:aload_1         
	//   14   30:invokevirtual   #93  <Method akv aks.a()>
	//   15   33:invokevirtual   #101 <Method akq akq.a(akv)>
	//   16   36:aload_1         
	//   17   37:invokevirtual   #91  <Method int aks.b()>
	//   18   40:invokestatic    #106 <Method byte[] aps.a(int)>
	//   19   43:invokestatic    #109 <Method aqq aqq.a(byte[])>
	//   20   46:invokevirtual   #112 <Method akq akq.a(aqq)>
	//   21   49:iconst_0        
	//   22   50:invokevirtual   #115 <Method akq akq.a(int)>
	//   23   53:invokevirtual   #121 <Method atv asi.f()>
	//   24   56:checkcast       #123 <Class ash>
	//   25   59:areturn         
		} else
		{
			throw new GeneralSecurityException("expected AesCtrKeyFormat proto");
	//   26   60:new             #20  <Class GeneralSecurityException>
	//   27   63:dup             
	//   28   64:ldc1            #125 <String "expected AesCtrKeyFormat proto">
	//   29   66:invokespecial   #25  <Method void GeneralSecurityException(String)>
	//   30   69:athrow          
		}
	}

	public final amy c(aqq aqq1)
	{
		aqq1 = ((aqq) ((akp)b(aqq1)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #128 <Method atv b(aqq)>
	//    3    5:checkcast       #31  <Class akp>
	//    4    8:astore_1        
		return (amy)(ash)((asi) (amy.d().a("type.googleapis.com/google.crypto.tink.AesCtrKey").a(((aqh) (aqq1)).h()).a(ana.b))).f();
	//    5    9:invokestatic    #133 <Method amz amy.d()>
	//    6   12:ldc1            #78  <String "type.googleapis.com/google.crypto.tink.AesCtrKey">
	//    7   14:invokevirtual   #138 <Method amz amz.a(String)>
	//    8   17:aload_1         
	//    9   18:invokevirtual   #143 <Method aqq aqh.h()>
	//   10   21:invokevirtual   #146 <Method amz amz.a(aqq)>
	//   11   24:getstatic       #151 <Field ana ana.b>
	//   12   27:invokevirtual   #154 <Method amz amz.a(ana)>
	//   13   30:invokevirtual   #121 <Method atv asi.f()>
	//   14   33:checkcast       #123 <Class ash>
	//   15   36:checkcast       #130 <Class amy>
	//   16   39:areturn         
	}
}

// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

// Referenced classes of package com.google.android.gms.internal.ads:
//			aiz, asu, alh, apy, 
//			aqq, aop, ais, alk, 
//			aps, ali, asi, ash, 
//			amy, amz, aqh, ana, 
//			atv

final class ajp
	implements aiz
{

	ajp()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #10  <Method void Object()>
	//    2    4:return          
	}

	private final ais d(aqq aqq1)
	{
		try
		{
			aqq1 = ((aqq) (alh.a(aqq1)));
	//    0    0:aload_1         
	//    1    1:invokestatic    #21  <Method alh alh.a(aqq)>
	//    2    4:astore_1        
			if(aqq1 instanceof alh)
	//*   3    5:aload_1         
	//*   4    6:instanceof      #17  <Class alh>
	//*   5    9:ifeq            53
			{
				aqq1 = ((aqq) ((alh)aqq1));
	//    6   12:aload_1         
	//    7   13:checkcast       #17  <Class alh>
	//    8   16:astore_1        
				apy.a(((alh) (aqq1)).a(), 0);
	//    9   17:aload_1         
	//   10   18:invokevirtual   #24  <Method int alh.a()>
	//   11   21:iconst_0        
	//   12   22:invokestatic    #29  <Method void apy.a(int, int)>
				apy.a(((alh) (aqq1)).b().a());
	//   13   25:aload_1         
	//   14   26:invokevirtual   #33  <Method aqq alh.b()>
	//   15   29:invokevirtual   #36  <Method int aqq.a()>
	//   16   32:invokestatic    #39  <Method void apy.a(int)>
				return (ais)new aop(((alh) (aqq1)).b().b());
	//   17   35:new             #41  <Class aop>
	//   18   38:dup             
	//   19   39:aload_1         
	//   20   40:invokevirtual   #33  <Method aqq alh.b()>
	//   21   43:invokevirtual   #44  <Method byte[] aqq.b()>
	//   22   46:invokespecial   #47  <Method void aop(byte[])>
	//   23   49:checkcast       #49  <Class ais>
	//   24   52:areturn         
			} else
			{
				throw new GeneralSecurityException("expected AesGcmKey proto");
	//   25   53:new             #51  <Class GeneralSecurityException>
	//   26   56:dup             
	//   27   57:ldc1            #53  <String "expected AesGcmKey proto">
	//   28   59:invokespecial   #56  <Method void GeneralSecurityException(String)>
	//   29   62:athrow          
			}
		}
	//*  30   63:new             #51  <Class GeneralSecurityException>
	//*  31   66:dup             
	//*  32   67:ldc1            #53  <String "expected AesGcmKey proto">
	//*  33   69:invokespecial   #56  <Method void GeneralSecurityException(String)>
	//*  34   72:athrow          
		// Misplaced declaration of an exception variable
		catch(aqq aqq1)
		{
			throw new GeneralSecurityException("expected AesGcmKey proto");
		}
	//*  35   73:astore_1        
	//*  36   74:goto            63
	}

	public final Object a(aqq aqq1)
	{
		return ((Object) (d(aqq1)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #59  <Method ais d(aqq)>
	//    3    5:areturn         
	}

	public final Object a(atv atv)
	{
		if(atv instanceof alh)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #17  <Class alh>
	//*   2    4:ifeq            45
		{
			atv = ((atv) ((alh)atv));
	//    3    7:aload_1         
	//    4    8:checkcast       #17  <Class alh>
	//    5   11:astore_1        
			apy.a(((alh) (atv)).a(), 0);
	//    6   12:aload_1         
	//    7   13:invokevirtual   #24  <Method int alh.a()>
	//    8   16:iconst_0        
	//    9   17:invokestatic    #29  <Method void apy.a(int, int)>
			apy.a(((alh) (atv)).b().a());
	//   10   20:aload_1         
	//   11   21:invokevirtual   #33  <Method aqq alh.b()>
	//   12   24:invokevirtual   #36  <Method int aqq.a()>
	//   13   27:invokestatic    #39  <Method void apy.a(int)>
			return ((Object) (new aop(((alh) (atv)).b().b())));
	//   14   30:new             #41  <Class aop>
	//   15   33:dup             
	//   16   34:aload_1         
	//   17   35:invokevirtual   #33  <Method aqq alh.b()>
	//   18   38:invokevirtual   #44  <Method byte[] aqq.b()>
	//   19   41:invokespecial   #47  <Method void aop(byte[])>
	//   20   44:areturn         
		} else
		{
			throw new GeneralSecurityException("expected AesGcmKey proto");
	//   21   45:new             #51  <Class GeneralSecurityException>
	//   22   48:dup             
	//   23   49:ldc1            #53  <String "expected AesGcmKey proto">
	//   24   51:invokespecial   #56  <Method void GeneralSecurityException(String)>
	//   25   54:athrow          
		}
	}

	public final String a()
	{
		return "type.googleapis.com/google.crypto.tink.AesGcmKey";
	//    0    0:ldc1            #63  <String "type.googleapis.com/google.crypto.tink.AesGcmKey">
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
			aqq1 = ((aqq) (b(((atv) (alk.a(aqq1))))));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #69  <Method alk alk.a(aqq)>
	//    3    5:invokevirtual   #72  <Method atv b(atv)>
	//    4    8:astore_1        
		}
	//*   5    9:aload_1         
	//*   6   10:areturn         
		// Misplaced declaration of an exception variable
		catch(aqq aqq1)
	//*   7   11:astore_1        
		{
			throw new GeneralSecurityException("expected serialized AesGcmKeyFormat proto", ((Throwable) (aqq1)));
	//    8   12:new             #51  <Class GeneralSecurityException>
	//    9   15:dup             
	//   10   16:ldc1            #74  <String "expected serialized AesGcmKeyFormat proto">
	//   11   18:aload_1         
	//   12   19:invokespecial   #77  <Method void GeneralSecurityException(String, Throwable)>
	//   13   22:athrow          
		}
		return ((atv) (aqq1));
	}

	public final atv b(atv atv)
	{
		if(atv instanceof alk)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #66  <Class alk>
	//*   2    4:ifeq            46
		{
			atv = ((atv) ((alk)atv));
	//    3    7:aload_1         
	//    4    8:checkcast       #66  <Class alk>
	//    5   11:astore_1        
			apy.a(((alk) (atv)).a());
	//    6   12:aload_1         
	//    7   13:invokevirtual   #78  <Method int alk.a()>
	//    8   16:invokestatic    #39  <Method void apy.a(int)>
			return ((atv) ((ash)((asi) (alh.c().a(aqq.a(aps.a(((alk) (atv)).a()))).a(0))).f()));
	//    9   19:invokestatic    #82  <Method ali alh.c()>
	//   10   22:aload_1         
	//   11   23:invokevirtual   #78  <Method int alk.a()>
	//   12   26:invokestatic    #87  <Method byte[] aps.a(int)>
	//   13   29:invokestatic    #90  <Method aqq aqq.a(byte[])>
	//   14   32:invokevirtual   #95  <Method ali ali.a(aqq)>
	//   15   35:iconst_0        
	//   16   36:invokevirtual   #98  <Method ali ali.a(int)>
	//   17   39:invokevirtual   #104 <Method atv asi.f()>
	//   18   42:checkcast       #106 <Class ash>
	//   19   45:areturn         
		} else
		{
			throw new GeneralSecurityException("expected AesGcmKeyFormat proto");
	//   20   46:new             #51  <Class GeneralSecurityException>
	//   21   49:dup             
	//   22   50:ldc1            #108 <String "expected AesGcmKeyFormat proto">
	//   23   52:invokespecial   #56  <Method void GeneralSecurityException(String)>
	//   24   55:athrow          
		}
	}

	public final amy c(aqq aqq1)
	{
		aqq1 = ((aqq) ((alh)b(aqq1)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #111 <Method atv b(aqq)>
	//    3    5:checkcast       #17  <Class alh>
	//    4    8:astore_1        
		return (amy)(ash)((asi) (amy.d().a("type.googleapis.com/google.crypto.tink.AesGcmKey").a(((aqh) (aqq1)).h()).a(ana.b))).f();
	//    5    9:invokestatic    #116 <Method amz amy.d()>
	//    6   12:ldc1            #63  <String "type.googleapis.com/google.crypto.tink.AesGcmKey">
	//    7   14:invokevirtual   #121 <Method amz amz.a(String)>
	//    8   17:aload_1         
	//    9   18:invokevirtual   #126 <Method aqq aqh.h()>
	//   10   21:invokevirtual   #129 <Method amz amz.a(aqq)>
	//   11   24:getstatic       #134 <Field ana ana.b>
	//   12   27:invokevirtual   #137 <Method amz amz.a(ana)>
	//   13   30:invokevirtual   #104 <Method atv asi.f()>
	//   14   33:checkcast       #106 <Class ash>
	//   15   36:checkcast       #113 <Class amy>
	//   16   39:areturn         
	}
}

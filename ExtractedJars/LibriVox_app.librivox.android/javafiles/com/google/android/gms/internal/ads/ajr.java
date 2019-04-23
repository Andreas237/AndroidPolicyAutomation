// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

// Referenced classes of package com.google.android.gms.internal.ads:
//			aiz, anw, apy, anz, 
//			ajc, ajb, asu, anx, 
//			asi, ash, amy, amz, 
//			aqh, ana, atv, ais, 
//			aqq

final class ajr
	implements aiz
{

	ajr()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #10  <Method void Object()>
	//    2    4:return          
	}

	private static ais c(atv atv)
	{
		if(atv instanceof anw)
	//*   0    0:aload_0         
	//*   1    1:instanceof      #15  <Class anw>
	//*   2    4:ifeq            39
		{
			atv = ((atv) ((anw)atv));
	//    3    7:aload_0         
	//    4    8:checkcast       #15  <Class anw>
	//    5   11:astore_0        
			apy.a(((anw) (atv)).a(), 0);
	//    6   12:aload_0         
	//    7   13:invokevirtual   #19  <Method int anw.a()>
	//    8   16:iconst_0        
	//    9   17:invokestatic    #24  <Method void apy.a(int, int)>
			atv = ((atv) (((anw) (atv)).b().a()));
	//   10   20:aload_0         
	//   11   21:invokevirtual   #28  <Method anz anw.b()>
	//   12   24:invokevirtual   #33  <Method String anz.a()>
	//   13   27:astore_0        
			return ajc.a(((String) (atv))).b(((String) (atv)));
	//   14   28:aload_0         
	//   15   29:invokestatic    #38  <Method ajb ajc.a(String)>
	//   16   32:aload_0         
	//   17   33:invokeinterface #43  <Method ais ajb.b(String)>
	//   18   38:areturn         
		} else
		{
			throw new GeneralSecurityException("expected KmsAeadKey proto");
	//   19   39:new             #45  <Class GeneralSecurityException>
	//   20   42:dup             
	//   21   43:ldc1            #47  <String "expected KmsAeadKey proto">
	//   22   45:invokespecial   #50  <Method void GeneralSecurityException(String)>
	//   23   48:athrow          
		}
	}

	private static ais d(aqq aqq)
	{
		try
		{
			aqq = ((aqq) (c(((atv) (anw.a(aqq))))));
	//    0    0:aload_0         
	//    1    1:invokestatic    #57  <Method anw anw.a(aqq)>
	//    2    4:invokestatic    #59  <Method ais c(atv)>
	//    3    7:astore_0        
		}
	//*   4    8:aload_0         
	//*   5    9:areturn         
		// Misplaced declaration of an exception variable
		catch(aqq aqq)
	//*   6   10:astore_0        
		{
			throw new GeneralSecurityException("expected KmsAeadKey proto", ((Throwable) (aqq)));
	//    7   11:new             #45  <Class GeneralSecurityException>
	//    8   14:dup             
	//    9   15:ldc1            #47  <String "expected KmsAeadKey proto">
	//   10   17:aload_0         
	//   11   18:invokespecial   #62  <Method void GeneralSecurityException(String, Throwable)>
	//   12   21:athrow          
		}
		return ((ais) (aqq));
	}

	public final Object a(aqq aqq)
	{
		return ((Object) (d(aqq)));
	//    0    0:aload_1         
	//    1    1:invokestatic    #65  <Method ais d(aqq)>
	//    2    4:areturn         
	}

	public final Object a(atv atv)
	{
		return ((Object) (c(atv)));
	//    0    0:aload_1         
	//    1    1:invokestatic    #59  <Method ais c(atv)>
	//    2    4:areturn         
	}

	public final String a()
	{
		return "type.googleapis.com/google.crypto.tink.KmsAeadKey";
	//    0    0:ldc1            #68  <String "type.googleapis.com/google.crypto.tink.KmsAeadKey">
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
			aqq = ((aqq) (b(((atv) (anz.a(aqq))))));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #72  <Method anz anz.a(aqq)>
	//    3    5:invokevirtual   #75  <Method atv b(atv)>
	//    4    8:astore_1        
		}
	//*   5    9:aload_1         
	//*   6   10:areturn         
		// Misplaced declaration of an exception variable
		catch(aqq aqq)
	//*   7   11:astore_1        
		{
			throw new GeneralSecurityException("expected serialized KmsAeadKeyFormat proto", ((Throwable) (aqq)));
	//    8   12:new             #45  <Class GeneralSecurityException>
	//    9   15:dup             
	//   10   16:ldc1            #77  <String "expected serialized KmsAeadKeyFormat proto">
	//   11   18:aload_1         
	//   12   19:invokespecial   #62  <Method void GeneralSecurityException(String, Throwable)>
	//   13   22:athrow          
		}
		return ((atv) (aqq));
	}

	public final atv b(atv atv)
	{
		if(atv instanceof anz)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #30  <Class anz>
	//*   2    4:ifeq            30
		{
			atv = ((atv) ((anz)atv));
	//    3    7:aload_1         
	//    4    8:checkcast       #30  <Class anz>
	//    5   11:astore_1        
			return ((atv) ((ash)((asi) (anw.c().a(((anz) (atv))).a(0))).f()));
	//    6   12:invokestatic    #80  <Method anx anw.c()>
	//    7   15:aload_1         
	//    8   16:invokevirtual   #85  <Method anx anx.a(anz)>
	//    9   19:iconst_0        
	//   10   20:invokevirtual   #88  <Method anx anx.a(int)>
	//   11   23:invokevirtual   #94  <Method atv asi.f()>
	//   12   26:checkcast       #96  <Class ash>
	//   13   29:areturn         
		} else
		{
			throw new GeneralSecurityException("expected KmsAeadKeyFormat proto");
	//   14   30:new             #45  <Class GeneralSecurityException>
	//   15   33:dup             
	//   16   34:ldc1            #98  <String "expected KmsAeadKeyFormat proto">
	//   17   36:invokespecial   #50  <Method void GeneralSecurityException(String)>
	//   18   39:athrow          
		}
	}

	public final amy c(aqq aqq)
	{
		aqq = ((aqq) ((anw)b(aqq)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #101 <Method atv b(aqq)>
	//    3    5:checkcast       #15  <Class anw>
	//    4    8:astore_1        
		return (amy)(ash)((asi) (amy.d().a("type.googleapis.com/google.crypto.tink.KmsAeadKey").a(((aqh) (aqq)).h()).a(ana.e))).f();
	//    5    9:invokestatic    #106 <Method amz amy.d()>
	//    6   12:ldc1            #68  <String "type.googleapis.com/google.crypto.tink.KmsAeadKey">
	//    7   14:invokevirtual   #111 <Method amz amz.a(String)>
	//    8   17:aload_1         
	//    9   18:invokevirtual   #117 <Method aqq aqh.h()>
	//   10   21:invokevirtual   #120 <Method amz amz.a(aqq)>
	//   11   24:getstatic       #126 <Field ana ana.e>
	//   12   27:invokevirtual   #129 <Method amz amz.a(ana)>
	//   13   30:invokevirtual   #94  <Method atv asi.f()>
	//   14   33:checkcast       #96  <Class ash>
	//   15   36:checkcast       #103 <Class amy>
	//   16   39:areturn         
	}
}

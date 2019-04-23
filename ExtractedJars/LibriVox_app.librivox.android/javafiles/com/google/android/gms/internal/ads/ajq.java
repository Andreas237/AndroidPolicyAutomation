// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

// Referenced classes of package com.google.android.gms.internal.ads:
//			aiz, aln, alo, aps, 
//			aqq, asi, ash, asu, 
//			apy, aos, ais, amy, 
//			amz, aqh, ana, atv

final class ajq
	implements aiz
{

	ajq()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #10  <Method void Object()>
	//    2    4:return          
	}

	private static aln c()
	{
		return (aln)(ash)((asi) (aln.c().a(0).a(aqq.a(aps.a(32))))).f();
	//    0    0:invokestatic    #18  <Method alo aln.c()>
	//    1    3:iconst_0        
	//    2    4:invokevirtual   #24  <Method alo alo.a(int)>
	//    3    7:bipush          32
	//    4    9:invokestatic    #29  <Method byte[] aps.a(int)>
	//    5   12:invokestatic    #34  <Method aqq aqq.a(byte[])>
	//    6   15:invokevirtual   #37  <Method alo alo.a(aqq)>
	//    7   18:invokevirtual   #43  <Method atv asi.f()>
	//    8   21:checkcast       #45  <Class ash>
	//    9   24:checkcast       #15  <Class aln>
	//   10   27:areturn         
	}

	private final ais d(aqq aqq1)
	{
		try
		{
			aqq1 = ((aqq) (aln.a(aqq1)));
	//    0    0:aload_1         
	//    1    1:invokestatic    #52  <Method aln aln.a(aqq)>
	//    2    4:astore_1        
			if(aqq1 instanceof aln)
	//*   3    5:aload_1         
	//*   4    6:instanceof      #15  <Class aln>
	//*   5    9:ifeq            65
			{
				aqq1 = ((aqq) ((aln)aqq1));
	//    6   12:aload_1         
	//    7   13:checkcast       #15  <Class aln>
	//    8   16:astore_1        
				apy.a(((aln) (aqq1)).a(), 0);
	//    9   17:aload_1         
	//   10   18:invokevirtual   #55  <Method int aln.a()>
	//   11   21:iconst_0        
	//   12   22:invokestatic    #60  <Method void apy.a(int, int)>
				if(((aln) (aqq1)).b().a() == 32)
	//*  13   25:aload_1         
	//*  14   26:invokevirtual   #64  <Method aqq aln.b()>
	//*  15   29:invokevirtual   #65  <Method int aqq.a()>
	//*  16   32:bipush          32
	//*  17   34:icmpne          55
					return (ais)new aos(((aln) (aqq1)).b().b());
	//   18   37:new             #67  <Class aos>
	//   19   40:dup             
	//   20   41:aload_1         
	//   21   42:invokevirtual   #64  <Method aqq aln.b()>
	//   22   45:invokevirtual   #70  <Method byte[] aqq.b()>
	//   23   48:invokespecial   #73  <Method void aos(byte[])>
	//   24   51:checkcast       #75  <Class ais>
	//   25   54:areturn         
				else
					throw new GeneralSecurityException("invalid ChaCha20Poly1305Key: incorrect key length");
	//   26   55:new             #77  <Class GeneralSecurityException>
	//   27   58:dup             
	//   28   59:ldc1            #79  <String "invalid ChaCha20Poly1305Key: incorrect key length">
	//   29   61:invokespecial   #82  <Method void GeneralSecurityException(String)>
	//   30   64:athrow          
			} else
			{
				throw new GeneralSecurityException("expected ChaCha20Poly1305Key proto");
	//   31   65:new             #77  <Class GeneralSecurityException>
	//   32   68:dup             
	//   33   69:ldc1            #84  <String "expected ChaCha20Poly1305Key proto">
	//   34   71:invokespecial   #82  <Method void GeneralSecurityException(String)>
	//   35   74:athrow          
			}
		}
		// Misplaced declaration of an exception variable
		catch(aqq aqq1)
	//*  36   75:astore_1        
		{
			throw new GeneralSecurityException("invalid ChaCha20Poly1305 key", ((Throwable) (aqq1)));
	//   37   76:new             #77  <Class GeneralSecurityException>
	//   38   79:dup             
	//   39   80:ldc1            #86  <String "invalid ChaCha20Poly1305 key">
	//   40   82:aload_1         
	//   41   83:invokespecial   #89  <Method void GeneralSecurityException(String, Throwable)>
	//   42   86:athrow          
		}
	}

	public final Object a(aqq aqq1)
	{
		return ((Object) (d(aqq1)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #92  <Method ais d(aqq)>
	//    3    5:areturn         
	}

	public final Object a(atv atv)
	{
		if(atv instanceof aln)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #15  <Class aln>
	//*   2    4:ifeq            57
		{
			atv = ((atv) ((aln)atv));
	//    3    7:aload_1         
	//    4    8:checkcast       #15  <Class aln>
	//    5   11:astore_1        
			apy.a(((aln) (atv)).a(), 0);
	//    6   12:aload_1         
	//    7   13:invokevirtual   #55  <Method int aln.a()>
	//    8   16:iconst_0        
	//    9   17:invokestatic    #60  <Method void apy.a(int, int)>
			if(((aln) (atv)).b().a() == 32)
	//*  10   20:aload_1         
	//*  11   21:invokevirtual   #64  <Method aqq aln.b()>
	//*  12   24:invokevirtual   #65  <Method int aqq.a()>
	//*  13   27:bipush          32
	//*  14   29:icmpne          47
				return ((Object) (new aos(((aln) (atv)).b().b())));
	//   15   32:new             #67  <Class aos>
	//   16   35:dup             
	//   17   36:aload_1         
	//   18   37:invokevirtual   #64  <Method aqq aln.b()>
	//   19   40:invokevirtual   #70  <Method byte[] aqq.b()>
	//   20   43:invokespecial   #73  <Method void aos(byte[])>
	//   21   46:areturn         
			else
				throw new GeneralSecurityException("invalid ChaCha20Poly1305Key: incorrect key length");
	//   22   47:new             #77  <Class GeneralSecurityException>
	//   23   50:dup             
	//   24   51:ldc1            #79  <String "invalid ChaCha20Poly1305Key: incorrect key length">
	//   25   53:invokespecial   #82  <Method void GeneralSecurityException(String)>
	//   26   56:athrow          
		} else
		{
			throw new GeneralSecurityException("expected ChaCha20Poly1305Key proto");
	//   27   57:new             #77  <Class GeneralSecurityException>
	//   28   60:dup             
	//   29   61:ldc1            #84  <String "expected ChaCha20Poly1305Key proto">
	//   30   63:invokespecial   #82  <Method void GeneralSecurityException(String)>
	//   31   66:athrow          
		}
	}

	public final String a()
	{
		return "type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key";
	//    0    0:ldc1            #96  <String "type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key">
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
		return ((atv) (c()));
	//    0    0:invokestatic    #99  <Method aln c()>
	//    1    3:areturn         
	}

	public final atv b(atv atv)
	{
		return ((atv) (c()));
	//    0    0:invokestatic    #99  <Method aln c()>
	//    1    3:areturn         
	}

	public final amy c(aqq aqq1)
	{
		aqq1 = ((aqq) (c()));
	//    0    0:invokestatic    #99  <Method aln c()>
	//    1    3:astore_1        
		return (amy)(ash)((asi) (amy.d().a("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key").a(((aqh) (aqq1)).h()).a(ana.b))).f();
	//    2    4:invokestatic    #106 <Method amz amy.d()>
	//    3    7:ldc1            #96  <String "type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key">
	//    4    9:invokevirtual   #111 <Method amz amz.a(String)>
	//    5   12:aload_1         
	//    6   13:invokevirtual   #116 <Method aqq aqh.h()>
	//    7   16:invokevirtual   #119 <Method amz amz.a(aqq)>
	//    8   19:getstatic       #124 <Field ana ana.b>
	//    9   22:invokevirtual   #127 <Method amz amz.a(ana)>
	//   10   25:invokevirtual   #43  <Method atv asi.f()>
	//   11   28:checkcast       #45  <Class ash>
	//   12   31:checkcast       #103 <Class amy>
	//   13   34:areturn         
	}
}

// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

// Referenced classes of package com.google.android.gms.internal.ads:
//			aiz, asu, aoc, apy, 
//			aof, ajc, ajb, ajs, 
//			ais, aod, asi, ash, 
//			amy, amz, aqh, ana, 
//			aqq, atv

final class ajt
	implements aiz
{

	ajt()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #10  <Method void Object()>
	//    2    4:return          
	}

	private final ais d(aqq aqq)
	{
		try
		{
			aqq = ((aqq) (aoc.a(aqq)));
	//    0    0:aload_1         
	//    1    1:invokestatic    #21  <Method aoc aoc.a(aqq)>
	//    2    4:astore_1        
			if(aqq instanceof aoc)
	//*   3    5:aload_1         
	//*   4    6:instanceof      #17  <Class aoc>
	//*   5    9:ifeq            63
			{
				aqq = ((aqq) ((aoc)aqq));
	//    6   12:aload_1         
	//    7   13:checkcast       #17  <Class aoc>
	//    8   16:astore_1        
				apy.a(((aoc) (aqq)).a(), 0);
	//    9   17:aload_1         
	//   10   18:invokevirtual   #24  <Method int aoc.a()>
	//   11   21:iconst_0        
	//   12   22:invokestatic    #29  <Method void apy.a(int, int)>
				Object obj = ((Object) (((aoc) (aqq)).b().a()));
	//   13   25:aload_1         
	//   14   26:invokevirtual   #33  <Method aof aoc.b()>
	//   15   29:invokevirtual   #38  <Method String aof.a()>
	//   16   32:astore_2        
				obj = ((Object) (ajc.a(((String) (obj))).b(((String) (obj)))));
	//   17   33:aload_2         
	//   18   34:invokestatic    #43  <Method ajb ajc.a(String)>
	//   19   37:aload_2         
	//   20   38:invokeinterface #48  <Method ais ajb.b(String)>
	//   21   43:astore_2        
				return (ais)new ajs(((aoc) (aqq)).b().b(), ((ais) (obj)));
	//   22   44:new             #50  <Class ajs>
	//   23   47:dup             
	//   24   48:aload_1         
	//   25   49:invokevirtual   #33  <Method aof aoc.b()>
	//   26   52:invokevirtual   #53  <Method ang aof.b()>
	//   27   55:aload_2         
	//   28   56:invokespecial   #56  <Method void ajs(ang, ais)>
	//   29   59:checkcast       #58  <Class ais>
	//   30   62:areturn         
			} else
			{
				throw new GeneralSecurityException("expected KmsEnvelopeAeadKey proto");
	//   31   63:new             #60  <Class GeneralSecurityException>
	//   32   66:dup             
	//   33   67:ldc1            #62  <String "expected KmsEnvelopeAeadKey proto">
	//   34   69:invokespecial   #65  <Method void GeneralSecurityException(String)>
	//   35   72:athrow          
			}
		}
		// Misplaced declaration of an exception variable
		catch(aqq aqq)
	//*  36   73:astore_1        
		{
			throw new GeneralSecurityException("expected serialized KmSEnvelopeAeadKey proto", ((Throwable) (aqq)));
	//   37   74:new             #60  <Class GeneralSecurityException>
	//   38   77:dup             
	//   39   78:ldc1            #67  <String "expected serialized KmSEnvelopeAeadKey proto">
	//   40   80:aload_1         
	//   41   81:invokespecial   #70  <Method void GeneralSecurityException(String, Throwable)>
	//   42   84:athrow          
		}
	}

	public final Object a(aqq aqq)
	{
		return ((Object) (d(aqq)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #73  <Method ais d(aqq)>
	//    3    5:areturn         
	}

	public final Object a(atv atv)
	{
		if(atv instanceof aoc)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #17  <Class aoc>
	//*   2    4:ifeq            55
		{
			atv = ((atv) ((aoc)atv));
	//    3    7:aload_1         
	//    4    8:checkcast       #17  <Class aoc>
	//    5   11:astore_1        
			apy.a(((aoc) (atv)).a(), 0);
	//    6   12:aload_1         
	//    7   13:invokevirtual   #24  <Method int aoc.a()>
	//    8   16:iconst_0        
	//    9   17:invokestatic    #29  <Method void apy.a(int, int)>
			Object obj = ((Object) (((aoc) (atv)).b().a()));
	//   10   20:aload_1         
	//   11   21:invokevirtual   #33  <Method aof aoc.b()>
	//   12   24:invokevirtual   #38  <Method String aof.a()>
	//   13   27:astore_2        
			obj = ((Object) (ajc.a(((String) (obj))).b(((String) (obj)))));
	//   14   28:aload_2         
	//   15   29:invokestatic    #43  <Method ajb ajc.a(String)>
	//   16   32:aload_2         
	//   17   33:invokeinterface #48  <Method ais ajb.b(String)>
	//   18   38:astore_2        
			return ((Object) (new ajs(((aoc) (atv)).b().b(), ((ais) (obj)))));
	//   19   39:new             #50  <Class ajs>
	//   20   42:dup             
	//   21   43:aload_1         
	//   22   44:invokevirtual   #33  <Method aof aoc.b()>
	//   23   47:invokevirtual   #53  <Method ang aof.b()>
	//   24   50:aload_2         
	//   25   51:invokespecial   #56  <Method void ajs(ang, ais)>
	//   26   54:areturn         
		} else
		{
			throw new GeneralSecurityException("expected KmsEnvelopeAeadKey proto");
	//   27   55:new             #60  <Class GeneralSecurityException>
	//   28   58:dup             
	//   29   59:ldc1            #62  <String "expected KmsEnvelopeAeadKey proto">
	//   30   61:invokespecial   #65  <Method void GeneralSecurityException(String)>
	//   31   64:athrow          
		}
	}

	public final String a()
	{
		return "type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey";
	//    0    0:ldc1            #76  <String "type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey">
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
			aqq = ((aqq) (b(((atv) (aof.a(aqq))))));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #80  <Method aof aof.a(aqq)>
	//    3    5:invokevirtual   #83  <Method atv b(atv)>
	//    4    8:astore_1        
		}
	//*   5    9:aload_1         
	//*   6   10:areturn         
		// Misplaced declaration of an exception variable
		catch(aqq aqq)
	//*   7   11:astore_1        
		{
			throw new GeneralSecurityException("expected serialized KmsEnvelopeAeadKeyFormat proto", ((Throwable) (aqq)));
	//    8   12:new             #60  <Class GeneralSecurityException>
	//    9   15:dup             
	//   10   16:ldc1            #85  <String "expected serialized KmsEnvelopeAeadKeyFormat proto">
	//   11   18:aload_1         
	//   12   19:invokespecial   #70  <Method void GeneralSecurityException(String, Throwable)>
	//   13   22:athrow          
		}
		return ((atv) (aqq));
	}

	public final atv b(atv atv)
	{
		if(atv instanceof aof)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #35  <Class aof>
	//*   2    4:ifeq            30
		{
			atv = ((atv) ((aof)atv));
	//    3    7:aload_1         
	//    4    8:checkcast       #35  <Class aof>
	//    5   11:astore_1        
			return ((atv) ((ash)((asi) (aoc.c().a(((aof) (atv))).a(0))).f()));
	//    6   12:invokestatic    #89  <Method aod aoc.c()>
	//    7   15:aload_1         
	//    8   16:invokevirtual   #94  <Method aod aod.a(aof)>
	//    9   19:iconst_0        
	//   10   20:invokevirtual   #97  <Method aod aod.a(int)>
	//   11   23:invokevirtual   #103 <Method atv asi.f()>
	//   12   26:checkcast       #105 <Class ash>
	//   13   29:areturn         
		} else
		{
			throw new GeneralSecurityException("expected KmsEnvelopeAeadKeyFormat proto");
	//   14   30:new             #60  <Class GeneralSecurityException>
	//   15   33:dup             
	//   16   34:ldc1            #107 <String "expected KmsEnvelopeAeadKeyFormat proto">
	//   17   36:invokespecial   #65  <Method void GeneralSecurityException(String)>
	//   18   39:athrow          
		}
	}

	public final amy c(aqq aqq)
	{
		aqq = ((aqq) ((aoc)b(aqq)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #110 <Method atv b(aqq)>
	//    3    5:checkcast       #17  <Class aoc>
	//    4    8:astore_1        
		return (amy)(ash)((asi) (amy.d().a("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey").a(((aqh) (aqq)).h()).a(ana.e))).f();
	//    5    9:invokestatic    #115 <Method amz amy.d()>
	//    6   12:ldc1            #76  <String "type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey">
	//    7   14:invokevirtual   #120 <Method amz amz.a(String)>
	//    8   17:aload_1         
	//    9   18:invokevirtual   #126 <Method aqq aqh.h()>
	//   10   21:invokevirtual   #129 <Method amz amz.a(aqq)>
	//   11   24:getstatic       #135 <Field ana ana.e>
	//   12   27:invokevirtual   #138 <Method amz amz.a(ana)>
	//   13   30:invokevirtual   #103 <Method atv asi.f()>
	//   14   33:checkcast       #105 <Class ash>
	//   15   36:checkcast       #112 <Class amy>
	//   16   39:areturn         
	}
}

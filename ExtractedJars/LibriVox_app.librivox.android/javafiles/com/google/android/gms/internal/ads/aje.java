// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.android.gms.internal.ads:
//			asu, anm, ano, amy, 
//			ana, aja

public final class aje
{

	public static final aja a(byte abyte0[])
	{
		try
		{
			abyte0 = ((byte []) (anm.a(abyte0)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #14  <Method anm anm.a(byte[])>
	//    2    4:astore_0        
			Iterator iterator = ((anm) (abyte0)).b().iterator();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #18  <Method List anm.b()>
	//    5    9:invokeinterface #24  <Method Iterator List.iterator()>
	//    6   14:astore_1        
			ano ano1;
			do
			{
				if(!iterator.hasNext())
					break MISSING_BLOCK_LABEL_86;
	//    7   15:aload_1         
	//    8   16:invokeinterface #30  <Method boolean Iterator.hasNext()>
	//    9   21:ifeq            86
				ano1 = (ano)iterator.next();
	//   10   24:aload_1         
	//   11   25:invokeinterface #34  <Method Object Iterator.next()>
	//   12   30:checkcast       #36  <Class ano>
	//   13   33:astore_2        
			} while(ano1.b().c() != ana.a && ano1.b().c() != ana.b && ano1.b().c() != ana.c);
	//   14   34:aload_2         
	//   15   35:invokevirtual   #39  <Method amy ano.b()>
	//   16   38:invokevirtual   #45  <Method ana amy.c()>
	//   17   41:getstatic       #50  <Field ana ana.a>
	//   18   44:if_acmpeq       76
	//   19   47:aload_2         
	//   20   48:invokevirtual   #39  <Method amy ano.b()>
	//   21   51:invokevirtual   #45  <Method ana amy.c()>
	//   22   54:getstatic       #52  <Field ana ana.b>
	//   23   57:if_acmpeq       76
	//   24   60:aload_2         
	//   25   61:invokevirtual   #39  <Method amy ano.b()>
	//   26   64:invokevirtual   #45  <Method ana amy.c()>
	//   27   67:getstatic       #54  <Field ana ana.c>
	//   28   70:if_acmpeq       76
		}
	//*  29   73:goto            15
	//*  30   76:new             #56  <Class GeneralSecurityException>
	//*  31   79:dup             
	//*  32   80:ldc1            #58  <String "keyset contains secret key material">
	//*  33   82:invokespecial   #62  <Method void GeneralSecurityException(String)>
	//*  34   85:athrow          
	//*  35   86:aload_0         
	//*  36   87:invokestatic    #67  <Method aja aja.a(anm)>
	//*  37   90:astore_0        
	//*  38   91:aload_0         
	//*  39   92:areturn         
	//*  40   93:new             #56  <Class GeneralSecurityException>
	//*  41   96:dup             
	//*  42   97:ldc1            #69  <String "invalid keyset">
	//*  43   99:invokespecial   #62  <Method void GeneralSecurityException(String)>
	//*  44  102:athrow          
		// Misplaced declaration of an exception variable
		catch(byte abyte0[])
		{
			throw new GeneralSecurityException("invalid keyset");
		}
		throw new GeneralSecurityException("keyset contains secret key material");
		abyte0 = ((byte []) (aja.a(((anm) (abyte0)))));
		return ((aja) (abyte0));
	//*  45  103:astore_0        
	//*  46  104:goto            93
	}
}

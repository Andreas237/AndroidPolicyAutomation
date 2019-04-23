// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

// Referenced classes of package com.google.android.gms.internal.ads:
//			aok, aol, aiu, asi, 
//			ash, akg, aji

public final class aki
{

	public static void a()
	{
		aji.a("TinkMac", ((ait) (new akg())));
	//    0    0:ldc1            #27  <String "TinkMac">
	//    1    2:new             #71  <Class akg>
	//    2    5:dup             
	//    3    6:invokespecial   #73  <Method void akg()>
	//    4    9:invokestatic    #78  <Method void aji.a(String, ait)>
		aiu.a(b);
	//    5   12:getstatic       #60  <Field aok b>
	//    6   15:invokestatic    #81  <Method void aiu.a(aok)>
	//    7   18:return          
	}

	public static final aok a;
	public static final aok b;
	private static final aok c;

	static 
	{
		a = (aok)(ash)((asi) (aok.b().a("TINK_MAC_1_0_0").a(aiu.a("TinkMac", "Mac", "HmacKey", 0, true)))).f();
	//    0    0:invokestatic    #18  <Method aol aok.b()>
	//    1    3:ldc1            #20  <String "TINK_MAC_1_0_0">
	//    2    5:invokevirtual   #25  <Method aol aol.a(String)>
	//    3    8:ldc1            #27  <String "TinkMac">
	//    4   10:ldc1            #29  <String "Mac">
	//    5   12:ldc1            #31  <String "HmacKey">
	//    6   14:iconst_0        
	//    7   15:iconst_1        
	//    8   16:invokestatic    #36  <Method anj aiu.a(String, String, String, int, boolean)>
	//    9   19:invokevirtual   #39  <Method aol aol.a(anj)>
	//   10   22:invokevirtual   #45  <Method atv asi.f()>
	//   11   25:checkcast       #47  <Class ash>
	//   12   28:checkcast       #15  <Class aok>
	//   13   31:putstatic       #49  <Field aok a>
		c = (aok)(ash)((asi) (((aol)((asi) (aok.b())).a(((ash) (a)))).a("TINK_MAC_1_1_0"))).f();
	//   14   34:invokestatic    #18  <Method aol aok.b()>
	//   15   37:getstatic       #49  <Field aok a>
	//   16   40:invokevirtual   #52  <Method asi asi.a(ash)>
	//   17   43:checkcast       #22  <Class aol>
	//   18   46:ldc1            #54  <String "TINK_MAC_1_1_0">
	//   19   48:invokevirtual   #25  <Method aol aol.a(String)>
	//   20   51:invokevirtual   #45  <Method atv asi.f()>
	//   21   54:checkcast       #47  <Class ash>
	//   22   57:checkcast       #15  <Class aok>
	//   23   60:putstatic       #56  <Field aok c>
		b = (aok)(ash)((asi) (((aol)((asi) (aok.b())).a(((ash) (a)))).a("TINK_MAC"))).f();
	//   24   63:invokestatic    #18  <Method aol aok.b()>
	//   25   66:getstatic       #49  <Field aok a>
	//   26   69:invokevirtual   #52  <Method asi asi.a(ash)>
	//   27   72:checkcast       #22  <Class aol>
	//   28   75:ldc1            #58  <String "TINK_MAC">
	//   29   77:invokevirtual   #25  <Method aol aol.a(String)>
	//   30   80:invokevirtual   #45  <Method atv asi.f()>
	//   31   83:checkcast       #47  <Class ash>
	//   32   86:checkcast       #15  <Class aok>
	//   33   89:putstatic       #60  <Field aok b>
		try
		{
			a();
	//   34   92:invokestatic    #62  <Method void a()>
	//   35   95:return          
		}
		catch(GeneralSecurityException generalsecurityexception)
	//*  36   96:astore_0        
		{
			throw new ExceptionInInitializerError(((Throwable) (generalsecurityexception)));
	//   37   97:new             #64  <Class ExceptionInInitializerError>
	//   38  100:dup             
	//   39  101:aload_0         
	//   40  102:invokespecial   #68  <Method void ExceptionInInitializerError(Throwable)>
	//   41  105:athrow          
		}
	}
}

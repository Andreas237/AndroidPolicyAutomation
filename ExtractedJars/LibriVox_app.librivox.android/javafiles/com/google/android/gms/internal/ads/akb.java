// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;

// Referenced classes of package com.google.android.gms.internal.ads:
//			akc, aml, apc, alq, 
//			apd, amn, alz, ami, 
//			apa, als, aji

final class akb
{

	public static apc a(aml aml1)
	{
		switch(akc.b[aml1.ordinal()])
	//*   0    0:getstatic       #12  <Field int[] akc.b>
	//*   1    3:aload_0         
	//*   2    4:invokevirtual   #18  <Method int aml.ordinal()>
	//*   3    7:iaload          
		{
	//*   4    8:tableswitch     1 3: default 36
	//	               1 92
	//	               2 88
	//	               3 84
		default:
			aml1 = ((aml) (String.valueOf(((Object) (aml1)))));
	//    5   36:aload_0         
	//    6   37:invokestatic    #24  <Method String String.valueOf(Object)>
	//    7   40:astore_0        
			StringBuilder stringbuilder = new StringBuilder(String.valueOf(((Object) (aml1))).length() + 20);
	//    8   41:new             #26  <Class StringBuilder>
	//    9   44:dup             
	//   10   45:aload_0         
	//   11   46:invokestatic    #24  <Method String String.valueOf(Object)>
	//   12   49:invokevirtual   #29  <Method int String.length()>
	//   13   52:bipush          20
	//   14   54:iadd            
	//   15   55:invokespecial   #33  <Method void StringBuilder(int)>
	//   16   58:astore_1        
			stringbuilder.append("unknown curve type: ");
	//   17   59:aload_1         
	//   18   60:ldc1            #35  <String "unknown curve type: ">
	//   19   62:invokevirtual   #39  <Method StringBuilder StringBuilder.append(String)>
	//   20   65:pop             
			stringbuilder.append(((String) (aml1)));
	//   21   66:aload_1         
	//   22   67:aload_0         
	//   23   68:invokevirtual   #39  <Method StringBuilder StringBuilder.append(String)>
	//   24   71:pop             
			throw new GeneralSecurityException(stringbuilder.toString());
	//   25   72:new             #41  <Class GeneralSecurityException>
	//   26   75:dup             
	//   27   76:aload_1         
	//   28   77:invokevirtual   #45  <Method String StringBuilder.toString()>
	//   29   80:invokespecial   #48  <Method void GeneralSecurityException(String)>
	//   30   83:athrow          

		case 3: // '\003'
			return apc.c;
	//   31   84:getstatic       #54  <Field apc apc.c>
	//   32   87:areturn         

		case 2: // '\002'
			return apc.b;
	//   33   88:getstatic       #56  <Field apc apc.b>
	//   34   91:areturn         

		case 1: // '\001'
			return apc.a;
	//   35   92:getstatic       #58  <Field apc apc.a>
	//   36   95:areturn         
		}
	}

	public static apd a(alq alq1)
	{
		switch(akc.c[alq1.ordinal()])
	//*   0    0:getstatic       #62  <Field int[] akc.c>
	//*   1    3:aload_0         
	//*   2    4:invokevirtual   #65  <Method int alq.ordinal()>
	//*   3    7:iaload          
		{
	//*   4    8:tableswitch     1 3: default 36
	//	               1 92
	//	               2 88
	//	               3 84
		default:
			alq1 = ((alq) (String.valueOf(((Object) (alq1)))));
	//    5   36:aload_0         
	//    6   37:invokestatic    #24  <Method String String.valueOf(Object)>
	//    7   40:astore_0        
			StringBuilder stringbuilder = new StringBuilder(String.valueOf(((Object) (alq1))).length() + 22);
	//    8   41:new             #26  <Class StringBuilder>
	//    9   44:dup             
	//   10   45:aload_0         
	//   11   46:invokestatic    #24  <Method String String.valueOf(Object)>
	//   12   49:invokevirtual   #29  <Method int String.length()>
	//   13   52:bipush          22
	//   14   54:iadd            
	//   15   55:invokespecial   #33  <Method void StringBuilder(int)>
	//   16   58:astore_1        
			stringbuilder.append("unknown point format: ");
	//   17   59:aload_1         
	//   18   60:ldc1            #67  <String "unknown point format: ">
	//   19   62:invokevirtual   #39  <Method StringBuilder StringBuilder.append(String)>
	//   20   65:pop             
			stringbuilder.append(((String) (alq1)));
	//   21   66:aload_1         
	//   22   67:aload_0         
	//   23   68:invokevirtual   #39  <Method StringBuilder StringBuilder.append(String)>
	//   24   71:pop             
			throw new GeneralSecurityException(stringbuilder.toString());
	//   25   72:new             #41  <Class GeneralSecurityException>
	//   26   75:dup             
	//   27   76:aload_1         
	//   28   77:invokevirtual   #45  <Method String StringBuilder.toString()>
	//   29   80:invokespecial   #48  <Method void GeneralSecurityException(String)>
	//   30   83:athrow          

		case 3: // '\003'
			return apd.b;
	//   31   84:getstatic       #72  <Field apd apd.b>
	//   32   87:areturn         

		case 2: // '\002'
			return apd.c;
	//   33   88:getstatic       #74  <Field apd apd.c>
	//   34   91:areturn         

		case 1: // '\001'
			return apd.a;
	//   35   92:getstatic       #76  <Field apd apd.a>
	//   36   95:areturn         
		}
	}

	public static String a(amn amn1)
	{
		switch(akc.a[amn1.ordinal()])
	//*   0    0:getstatic       #79  <Field int[] akc.a>
	//*   1    3:aload_0         
	//*   2    4:invokevirtual   #82  <Method int amn.ordinal()>
	//*   3    7:iaload          
		{
	//*   4    8:tableswitch     1 3: default 36
	//	               1 90
	//	               2 87
	//	               3 84
		default:
			amn1 = ((amn) (String.valueOf(((Object) (amn1)))));
	//    5   36:aload_0         
	//    6   37:invokestatic    #24  <Method String String.valueOf(Object)>
	//    7   40:astore_0        
			StringBuilder stringbuilder = new StringBuilder(String.valueOf(((Object) (amn1))).length() + 27);
	//    8   41:new             #26  <Class StringBuilder>
	//    9   44:dup             
	//   10   45:aload_0         
	//   11   46:invokestatic    #24  <Method String String.valueOf(Object)>
	//   12   49:invokevirtual   #29  <Method int String.length()>
	//   13   52:bipush          27
	//   14   54:iadd            
	//   15   55:invokespecial   #33  <Method void StringBuilder(int)>
	//   16   58:astore_1        
			stringbuilder.append("hash unsupported for HMAC: ");
	//   17   59:aload_1         
	//   18   60:ldc1            #84  <String "hash unsupported for HMAC: ">
	//   19   62:invokevirtual   #39  <Method StringBuilder StringBuilder.append(String)>
	//   20   65:pop             
			stringbuilder.append(((String) (amn1)));
	//   21   66:aload_1         
	//   22   67:aload_0         
	//   23   68:invokevirtual   #39  <Method StringBuilder StringBuilder.append(String)>
	//   24   71:pop             
			throw new NoSuchAlgorithmException(stringbuilder.toString());
	//   25   72:new             #86  <Class NoSuchAlgorithmException>
	//   26   75:dup             
	//   27   76:aload_1         
	//   28   77:invokevirtual   #45  <Method String StringBuilder.toString()>
	//   29   80:invokespecial   #87  <Method void NoSuchAlgorithmException(String)>
	//   30   83:athrow          

		case 3: // '\003'
			return "HmacSha512";
	//   31   84:ldc1            #89  <String "HmacSha512">
	//   32   86:areturn         

		case 2: // '\002'
			return "HmacSha256";
	//   33   87:ldc1            #91  <String "HmacSha256">
	//   34   89:areturn         

		case 1: // '\001'
			return "HmacSha1";
	//   35   90:ldc1            #93  <String "HmacSha1">
	//   36   92:areturn         
		}
	}

	public static void a(alz alz1)
	{
		apa.a(a(alz1.a().a()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #99  <Method ami alz.a()>
	//    2    4:invokevirtual   #104 <Method aml ami.a()>
	//    3    7:invokestatic    #106 <Method apc a(aml)>
	//    4   10:invokestatic    #111 <Method java.security.spec.ECParameterSpec apa.a(apc)>
	//    5   13:pop             
		a(alz1.a().b());
	//    6   14:aload_0         
	//    7   15:invokevirtual   #99  <Method ami alz.a()>
	//    8   18:invokevirtual   #114 <Method amn ami.b()>
	//    9   21:invokestatic    #116 <Method String a(amn)>
	//   10   24:pop             
		if(alz1.c() != alq.a)
	//*  11   25:aload_0         
	//*  12   26:invokevirtual   #119 <Method alq alz.c()>
	//*  13   29:getstatic       #122 <Field alq alq.a>
	//*  14   32:if_acmpeq       47
		{
			aji.a(alz1.b().a());
	//   15   35:aload_0         
	//   16   36:invokevirtual   #125 <Method als alz.b()>
	//   17   39:invokevirtual   #130 <Method ang als.a()>
	//   18   42:invokestatic    #135 <Method amy aji.a(ang)>
	//   19   45:pop             
			return;
	//   20   46:return          
		} else
		{
			throw new GeneralSecurityException("unknown EC point format");
	//   21   47:new             #41  <Class GeneralSecurityException>
	//   22   50:dup             
	//   23   51:ldc1            #137 <String "unknown EC point format">
	//   24   53:invokespecial   #48  <Method void GeneralSecurityException(String)>
	//   25   56:athrow          
		}
	}
}

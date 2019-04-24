// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzavi, zzawy, zzayv, zzawk, 
//			zzayw, zzaxa, zzawq, zzaww, 
//			zzayt, zzawm, zzauo

final class zzavh
{

	public static zzayv zza(zzawy zzawy1)
		throws GeneralSecurityException
	{
		switch(zzavi.zzdia[zzawy1.ordinal()])
	//*   0    0:getstatic       #14  <Field int[] zzavi.zzdia>
	//*   1    3:aload_0         
	//*   2    4:invokevirtual   #20  <Method int zzawy.ordinal()>
	//*   3    7:iaload          
		{
	//*   4    8:tableswitch     1 3: default 36
	//	               1 92
	//	               2 88
	//	               3 84
		default:
			zzawy1 = ((zzawy) (String.valueOf(((Object) (zzawy1)))));
	//    5   36:aload_0         
	//    6   37:invokestatic    #26  <Method String String.valueOf(Object)>
	//    7   40:astore_0        
			StringBuilder stringbuilder = new StringBuilder(20 + String.valueOf(((Object) (zzawy1))).length());
	//    8   41:new             #28  <Class StringBuilder>
	//    9   44:dup             
	//   10   45:bipush          20
	//   11   47:aload_0         
	//   12   48:invokestatic    #26  <Method String String.valueOf(Object)>
	//   13   51:invokevirtual   #31  <Method int String.length()>
	//   14   54:iadd            
	//   15   55:invokespecial   #35  <Method void StringBuilder(int)>
	//   16   58:astore_1        
			stringbuilder.append("unknown curve type: ");
	//   17   59:aload_1         
	//   18   60:ldc1            #37  <String "unknown curve type: ">
	//   19   62:invokevirtual   #41  <Method StringBuilder StringBuilder.append(String)>
	//   20   65:pop             
			stringbuilder.append(((String) (zzawy1)));
	//   21   66:aload_1         
	//   22   67:aload_0         
	//   23   68:invokevirtual   #41  <Method StringBuilder StringBuilder.append(String)>
	//   24   71:pop             
			throw new GeneralSecurityException(stringbuilder.toString());
	//   25   72:new             #8   <Class GeneralSecurityException>
	//   26   75:dup             
	//   27   76:aload_1         
	//   28   77:invokevirtual   #45  <Method String StringBuilder.toString()>
	//   29   80:invokespecial   #48  <Method void GeneralSecurityException(String)>
	//   30   83:athrow          

		case 3: // '\003'
			return zzayv.zzdnq;
	//   31   84:getstatic       #54  <Field zzayv zzayv.zzdnq>
	//   32   87:areturn         

		case 2: // '\002'
			return zzayv.zzdnp;
	//   33   88:getstatic       #57  <Field zzayv zzayv.zzdnp>
	//   34   91:areturn         

		case 1: // '\001'
			return zzayv.zzdno;
	//   35   92:getstatic       #60  <Field zzayv zzayv.zzdno>
	//   36   95:areturn         
		}
	}

	public static zzayw zza(zzawk zzawk1)
		throws GeneralSecurityException
	{
		switch(zzavi.zzdib[zzawk1.ordinal()])
	//*   0    0:getstatic       #66  <Field int[] zzavi.zzdib>
	//*   1    3:aload_0         
	//*   2    4:invokevirtual   #69  <Method int zzawk.ordinal()>
	//*   3    7:iaload          
		{
	//*   4    8:tableswitch     1 2: default 32
	//	               1 84
	//	               2 80
		default:
			zzawk1 = ((zzawk) (String.valueOf(((Object) (zzawk1)))));
	//    5   32:aload_0         
	//    6   33:invokestatic    #26  <Method String String.valueOf(Object)>
	//    7   36:astore_0        
			StringBuilder stringbuilder = new StringBuilder(22 + String.valueOf(((Object) (zzawk1))).length());
	//    8   37:new             #28  <Class StringBuilder>
	//    9   40:dup             
	//   10   41:bipush          22
	//   11   43:aload_0         
	//   12   44:invokestatic    #26  <Method String String.valueOf(Object)>
	//   13   47:invokevirtual   #31  <Method int String.length()>
	//   14   50:iadd            
	//   15   51:invokespecial   #35  <Method void StringBuilder(int)>
	//   16   54:astore_1        
			stringbuilder.append("unknown point format: ");
	//   17   55:aload_1         
	//   18   56:ldc1            #71  <String "unknown point format: ">
	//   19   58:invokevirtual   #41  <Method StringBuilder StringBuilder.append(String)>
	//   20   61:pop             
			stringbuilder.append(((String) (zzawk1)));
	//   21   62:aload_1         
	//   22   63:aload_0         
	//   23   64:invokevirtual   #41  <Method StringBuilder StringBuilder.append(String)>
	//   24   67:pop             
			throw new GeneralSecurityException(stringbuilder.toString());
	//   25   68:new             #8   <Class GeneralSecurityException>
	//   26   71:dup             
	//   27   72:aload_1         
	//   28   73:invokevirtual   #45  <Method String StringBuilder.toString()>
	//   29   76:invokespecial   #48  <Method void GeneralSecurityException(String)>
	//   30   79:athrow          

		case 2: // '\002'
			return zzayw.zzdnt;
	//   31   80:getstatic       #77  <Field zzayw zzayw.zzdnt>
	//   32   83:areturn         

		case 1: // '\001'
			return zzayw.zzdns;
	//   33   84:getstatic       #80  <Field zzayw zzayw.zzdns>
	//   34   87:areturn         
		}
	}

	public static String zza(zzaxa zzaxa1)
		throws NoSuchAlgorithmException
	{
		switch(zzavi.zzdhz[zzaxa1.ordinal()])
	//*   0    0:getstatic       #86  <Field int[] zzavi.zzdhz>
	//*   1    3:aload_0         
	//*   2    4:invokevirtual   #89  <Method int zzaxa.ordinal()>
	//*   3    7:iaload          
		{
	//*   4    8:tableswitch     1 3: default 36
	//	               1 90
	//	               2 87
	//	               3 84
		default:
			zzaxa1 = ((zzaxa) (String.valueOf(((Object) (zzaxa1)))));
	//    5   36:aload_0         
	//    6   37:invokestatic    #26  <Method String String.valueOf(Object)>
	//    7   40:astore_0        
			StringBuilder stringbuilder = new StringBuilder(27 + String.valueOf(((Object) (zzaxa1))).length());
	//    8   41:new             #28  <Class StringBuilder>
	//    9   44:dup             
	//   10   45:bipush          27
	//   11   47:aload_0         
	//   12   48:invokestatic    #26  <Method String String.valueOf(Object)>
	//   13   51:invokevirtual   #31  <Method int String.length()>
	//   14   54:iadd            
	//   15   55:invokespecial   #35  <Method void StringBuilder(int)>
	//   16   58:astore_1        
			stringbuilder.append("hash unsupported for HMAC: ");
	//   17   59:aload_1         
	//   18   60:ldc1            #91  <String "hash unsupported for HMAC: ">
	//   19   62:invokevirtual   #41  <Method StringBuilder StringBuilder.append(String)>
	//   20   65:pop             
			stringbuilder.append(((String) (zzaxa1)));
	//   21   66:aload_1         
	//   22   67:aload_0         
	//   23   68:invokevirtual   #41  <Method StringBuilder StringBuilder.append(String)>
	//   24   71:pop             
			throw new NoSuchAlgorithmException(stringbuilder.toString());
	//   25   72:new             #83  <Class NoSuchAlgorithmException>
	//   26   75:dup             
	//   27   76:aload_1         
	//   28   77:invokevirtual   #45  <Method String StringBuilder.toString()>
	//   29   80:invokespecial   #92  <Method void NoSuchAlgorithmException(String)>
	//   30   83:athrow          

		case 3: // '\003'
			return "HmacSha512";
	//   31   84:ldc1            #94  <String "HmacSha512">
	//   32   86:areturn         

		case 2: // '\002'
			return "HmacSha256";
	//   33   87:ldc1            #96  <String "HmacSha256">
	//   34   89:areturn         

		case 1: // '\001'
			return "HmacSha1";
	//   35   90:ldc1            #98  <String "HmacSha1">
	//   36   92:areturn         
		}
	}

	public static void zza(zzawq zzawq1)
		throws GeneralSecurityException
	{
		zzayt.zza(zza(zzawq1.zzxu().zzyh()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #105 <Method zzaww zzawq.zzxu()>
	//    2    4:invokevirtual   #111 <Method zzawy zzaww.zzyh()>
	//    3    7:invokestatic    #113 <Method zzayv zza(zzawy)>
	//    4   10:invokestatic    #118 <Method java.security.spec.ECParameterSpec zzayt.zza(zzayv)>
	//    5   13:pop             
		zza(zzawq1.zzxu().zzyi());
	//    6   14:aload_0         
	//    7   15:invokevirtual   #105 <Method zzaww zzawq.zzxu()>
	//    8   18:invokevirtual   #122 <Method zzaxa zzaww.zzyi()>
	//    9   21:invokestatic    #124 <Method String zza(zzaxa)>
	//   10   24:pop             
		if(zzawq1.zzxw() == zzawk.zzdjc)
	//*  11   25:aload_0         
	//*  12   26:invokevirtual   #128 <Method zzawk zzawq.zzxw()>
	//*  13   29:getstatic       #132 <Field zzawk zzawk.zzdjc>
	//*  14   32:if_acmpne       45
		{
			throw new GeneralSecurityException("unknown EC point format");
	//   15   35:new             #8   <Class GeneralSecurityException>
	//   16   38:dup             
	//   17   39:ldc1            #134 <String "unknown EC point format">
	//   18   41:invokespecial   #48  <Method void GeneralSecurityException(String)>
	//   19   44:athrow          
		} else
		{
			zzauo.zza(zzawq1.zzxv().zzxp());
	//   20   45:aload_0         
	//   21   46:invokevirtual   #138 <Method zzawm zzawq.zzxv()>
	//   22   49:invokevirtual   #144 <Method zzaxn zzawm.zzxp()>
	//   23   52:invokestatic    #149 <Method zzaxi zzauo.zza(zzaxn)>
	//   24   55:pop             
			return;
	//   25   56:return          
		}
	}
}

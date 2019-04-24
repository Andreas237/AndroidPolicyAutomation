// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.measurement.zzp;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

// Referenced classes of package com.google.android.gms.tagmanager:
//			zzdz, zzgj, zzdi

final class zzgn
{

	private static zzdz zza(zzdz zzdz1)
	{
		zzdz zzdz2;
		try
		{
			zzdz2 = new zzdz(((Object) (zzgj.zzj(((Object) (zzei(zzgj.zzc((zzp)zzdz1.getObject()))))))), zzdz1.zzpi());
	//    0    0:new             #10  <Class zzdz>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokevirtual   #14  <Method Object zzdz.getObject()>
	//    4    8:checkcast       #16  <Class zzp>
	//    5   11:invokestatic    #22  <Method String zzgj.zzc(zzp)>
	//    6   14:invokestatic    #26  <Method String zzei(String)>
	//    7   17:invokestatic    #30  <Method zzp zzgj.zzj(Object)>
	//    8   20:aload_0         
	//    9   21:invokevirtual   #34  <Method boolean zzdz.zzpi()>
	//   10   24:invokespecial   #38  <Method void zzdz(Object, boolean)>
	//   11   27:astore_1        
		}
	//*  12   28:aload_1         
	//*  13   29:areturn         
		catch(UnsupportedEncodingException unsupportedencodingexception)
	//*  14   30:astore_1        
		{
			zzdi.zza("Escape URI: unsupported encoding", ((Throwable) (unsupportedencodingexception)));
	//   15   31:ldc1            #40  <String "Escape URI: unsupported encoding">
	//   16   33:aload_1         
	//   17   34:invokestatic    #45  <Method void zzdi.zza(String, Throwable)>
			return zzdz1;
	//   18   37:aload_0         
	//   19   38:areturn         
		}
		return zzdz2;
	}

	static transient zzdz zza(zzdz zzdz1, int ai[])
	{
		int i;
		int j;
		j = ai.length;
	//    0    0:aload_1         
	//    1    1:arraylength     
	//    2    2:istore_3        
		i = 0;
	//    3    3:iconst_0        
	//    4    4:istore_2        
_L7:
		if(i >= j) goto _L2; else goto _L1
	//    5    5:iload_2         
	//    6    6:iload_3         
	//    7    7:icmpge          99
_L1:
		int k = ai[i];
	//    8   10:aload_1         
	//    9   11:iload_2         
	//   10   12:iaload          
	//   11   13:istore          4
		if(zzgj.zzh((zzp)zzdz1.getObject()) instanceof String) goto _L4; else goto _L3
	//   12   15:aload_0         
	//   13   16:invokevirtual   #14  <Method Object zzdz.getObject()>
	//   14   19:checkcast       #16  <Class zzp>
	//   15   22:invokestatic    #53  <Method Object zzgj.zzh(zzp)>
	//   16   25:instanceof      #55  <Class String>
	//   17   28:ifne            43
_L3:
		Object obj = "Escaping can only be applied to strings.";
	//   18   31:ldc1            #57  <String "Escaping can only be applied to strings.">
	//   19   33:astore          5
_L6:
		zzdi.e(((String) (obj)));
	//   20   35:aload           5
	//   21   37:invokestatic    #61  <Method void zzdi.e(String)>
		continue; /* Loop/switch isn't completed */
	//   22   40:goto            92
_L4:
		if(k == 12)
			break; /* Loop/switch isn't completed */
	//   23   43:iload           4
	//   24   45:bipush          12
	//   25   47:icmpeq          87
		obj = ((Object) (new StringBuilder(39)));
	//   26   50:new             #63  <Class StringBuilder>
	//   27   53:dup             
	//   28   54:bipush          39
	//   29   56:invokespecial   #66  <Method void StringBuilder(int)>
	//   30   59:astore          5
		((StringBuilder) (obj)).append("Unsupported Value Escaping: ");
	//   31   61:aload           5
	//   32   63:ldc1            #68  <String "Unsupported Value Escaping: ">
	//   33   65:invokevirtual   #72  <Method StringBuilder StringBuilder.append(String)>
	//   34   68:pop             
		((StringBuilder) (obj)).append(k);
	//   35   69:aload           5
	//   36   71:iload           4
	//   37   73:invokevirtual   #75  <Method StringBuilder StringBuilder.append(int)>
	//   38   76:pop             
		obj = ((Object) (((StringBuilder) (obj)).toString()));
	//   39   77:aload           5
	//   40   79:invokevirtual   #79  <Method String StringBuilder.toString()>
	//   41   82:astore          5
		if(true) goto _L6; else goto _L5
	//   42   84:goto            35
_L5:
		zzdz1 = zza(zzdz1);
	//   43   87:aload_0         
	//   44   88:invokestatic    #81  <Method zzdz zza(zzdz)>
	//   45   91:astore_0        
		i++;
	//   46   92:iload_2         
	//   47   93:iconst_1        
	//   48   94:iadd            
	//   49   95:istore_2        
		  goto _L7
	//*  50   96:goto            5
_L2:
		return zzdz1;
	//   51   99:aload_0         
	//   52  100:areturn         
	}

	static String zzei(String s)
	{
		return URLEncoder.encode(s, "UTF-8").replaceAll("\\+", "%20");
	//    0    0:aload_0         
	//    1    1:ldc1            #84  <String "UTF-8">
	//    2    3:invokestatic    #90  <Method String URLEncoder.encode(String, String)>
	//    3    6:ldc1            #92  <String "\\+">
	//    4    8:ldc1            #94  <String "%20">
	//    5   10:invokevirtual   #97  <Method String String.replaceAll(String, String)>
	//    6   13:areturn         
	}
}

// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.text.TextUtils;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zznr

final class zznu extends zznr
{

	zznu()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void zznr()>
	//    2    4:return          
	}

	private static String zzam(String s)
	{
		if(TextUtils.isEmpty(((CharSequence) (s))))
	//*   0    0:aload_0         
	//*   1    1:invokestatic    #18  <Method boolean TextUtils.isEmpty(CharSequence)>
	//*   2    4:ifeq            9
			return s;
	//    3    7:aload_0         
	//    4    8:areturn         
		int i = 0;
	//    5    9:iconst_0        
	//    6   10:istore_1        
		int k = s.length();
	//    7   11:aload_0         
	//    8   12:invokevirtual   #24  <Method int String.length()>
	//    9   15:istore_3        
		int j;
		do
		{
			j = k;
	//   10   16:iload_3         
	//   11   17:istore_2        
			if(i >= s.length())
				break;
	//   12   18:iload_1         
	//   13   19:aload_0         
	//   14   20:invokevirtual   #24  <Method int String.length()>
	//   15   23:icmpge          45
			j = k;
	//   16   26:iload_3         
	//   17   27:istore_2        
			if(s.charAt(i) != ',')
				break;
	//   18   28:aload_0         
	//   19   29:iload_1         
	//   20   30:invokevirtual   #28  <Method char String.charAt(int)>
	//   21   33:bipush          44
	//   22   35:icmpne          45
			i++;
	//   23   38:iload_1         
	//   24   39:iconst_1        
	//   25   40:iadd            
	//   26   41:istore_1        
		} while(true);
	//   27   42:goto            16
		for(; j > 0 && s.charAt(j - 1) == ','; j--);
	//   28   45:iload_2         
	//   29   46:ifle            68
	//   30   49:aload_0         
	//   31   50:iload_2         
	//   32   51:iconst_1        
	//   33   52:isub            
	//   34   53:invokevirtual   #28  <Method char String.charAt(int)>
	//   35   56:bipush          44
	//   36   58:icmpne          68
	//   37   61:iload_2         
	//   38   62:iconst_1        
	//   39   63:isub            
	//   40   64:istore_2        
	//*  41   65:goto            45
		if(j < i)
	//*  42   68:iload_2         
	//*  43   69:iload_1         
	//*  44   70:icmpge          75
			return null;
	//   45   73:aconst_null     
	//   46   74:areturn         
		if(i == 0 && j == s.length())
	//*  47   75:iload_1         
	//*  48   76:ifne            89
	//*  49   79:iload_2         
	//*  50   80:aload_0         
	//*  51   81:invokevirtual   #24  <Method int String.length()>
	//*  52   84:icmpne          89
			return s;
	//   53   87:aload_0         
	//   54   88:areturn         
		else
			return s.substring(i, j);
	//   55   89:aload_0         
	//   56   90:iload_1         
	//   57   91:iload_2         
	//   58   92:invokevirtual   #32  <Method String String.substring(int, int)>
	//   59   95:areturn         
	}

	public final String zzd(String s, String s1)
	{
		s = zzam(s);
	//    0    0:aload_1         
	//    1    1:invokestatic    #38  <Method String zzam(String)>
	//    2    4:astore_1        
		s1 = zzam(s1);
	//    3    5:aload_2         
	//    4    6:invokestatic    #38  <Method String zzam(String)>
	//    5    9:astore_2        
		if(TextUtils.isEmpty(((CharSequence) (s))))
	//*   6   10:aload_1         
	//*   7   11:invokestatic    #18  <Method boolean TextUtils.isEmpty(CharSequence)>
	//*   8   14:ifeq            19
			return s1;
	//    9   17:aload_2         
	//   10   18:areturn         
		if(TextUtils.isEmpty(((CharSequence) (s1))))
	//*  11   19:aload_2         
	//*  12   20:invokestatic    #18  <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  13   23:ifeq            28
		{
			return s;
	//   14   26:aload_1         
	//   15   27:areturn         
		} else
		{
			StringBuilder stringbuilder = new StringBuilder(1 + String.valueOf(((Object) (s))).length() + String.valueOf(((Object) (s1))).length());
	//   16   28:new             #40  <Class StringBuilder>
	//   17   31:dup             
	//   18   32:iconst_1        
	//   19   33:aload_1         
	//   20   34:invokestatic    #44  <Method String String.valueOf(Object)>
	//   21   37:invokevirtual   #24  <Method int String.length()>
	//   22   40:iadd            
	//   23   41:aload_2         
	//   24   42:invokestatic    #44  <Method String String.valueOf(Object)>
	//   25   45:invokevirtual   #24  <Method int String.length()>
	//   26   48:iadd            
	//   27   49:invokespecial   #47  <Method void StringBuilder(int)>
	//   28   52:astore_3        
			stringbuilder.append(s);
	//   29   53:aload_3         
	//   30   54:aload_1         
	//   31   55:invokevirtual   #51  <Method StringBuilder StringBuilder.append(String)>
	//   32   58:pop             
			stringbuilder.append(",");
	//   33   59:aload_3         
	//   34   60:ldc1            #53  <String ",">
	//   35   62:invokevirtual   #51  <Method StringBuilder StringBuilder.append(String)>
	//   36   65:pop             
			stringbuilder.append(s1);
	//   37   66:aload_3         
	//   38   67:aload_2         
	//   39   68:invokevirtual   #51  <Method StringBuilder StringBuilder.append(String)>
	//   40   71:pop             
			return stringbuilder.toString();
	//   41   72:aload_3         
	//   42   73:invokevirtual   #57  <Method String StringBuilder.toString()>
	//   43   76:areturn         
		}
	}
}

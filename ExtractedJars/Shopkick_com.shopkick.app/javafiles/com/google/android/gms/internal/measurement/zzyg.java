// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.measurement;

import java.nio.charset.Charset;
import java.util.Arrays;

// Referenced classes of package com.google.android.gms.internal.measurement:
//			zzyc, zzye

public final class zzyg
{

	public static boolean equals(int ai[], int ai1[])
	{
		if(ai != null && ai.length != 0)
	//*   0    0:aload_0         
	//*   1    1:ifnull          18
	//*   2    4:aload_0         
	//*   3    5:arraylength     
	//*   4    6:ifne            12
	//*   5    9:goto            18
			return Arrays.equals(ai, ai1);
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:invokestatic    #37  <Method boolean Arrays.equals(int[], int[])>
	//    9   17:ireturn         
		return ai1 == null || ai1.length == 0;
	//   10   18:aload_1         
	//   11   19:ifnull          32
	//   12   22:aload_1         
	//   13   23:arraylength     
	//   14   24:ifne            30
	//   15   27:goto            32
	//   16   30:iconst_0        
	//   17   31:ireturn         
	//   18   32:iconst_1        
	//   19   33:ireturn         
	}

	public static boolean equals(long al[], long al1[])
	{
		if(al != null && al.length != 0)
	//*   0    0:aload_0         
	//*   1    1:ifnull          18
	//*   2    4:aload_0         
	//*   3    5:arraylength     
	//*   4    6:ifne            12
	//*   5    9:goto            18
			return Arrays.equals(al, al1);
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:invokestatic    #40  <Method boolean Arrays.equals(long[], long[])>
	//    9   17:ireturn         
		return al1 == null || al1.length == 0;
	//   10   18:aload_1         
	//   11   19:ifnull          32
	//   12   22:aload_1         
	//   13   23:arraylength     
	//   14   24:ifne            30
	//   15   27:goto            32
	//   16   30:iconst_0        
	//   17   31:ireturn         
	//   18   32:iconst_1        
	//   19   33:ireturn         
	}

	public static boolean equals(Object aobj[], Object aobj1[])
	{
		int k;
		if(aobj == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       10
			k = 0;
	//    2    4:iconst_0        
	//    3    5:istore          4
		else
	//*   4    7:goto            14
			k = aobj.length;
	//    5   10:aload_0         
	//    6   11:arraylength     
	//    7   12:istore          4
		int l;
		if(aobj1 == null)
	//*   8   14:aload_1         
	//*   9   15:ifnonnull       24
			l = 0;
	//   10   18:iconst_0        
	//   11   19:istore          5
		else
	//*  12   21:goto            28
			l = aobj1.length;
	//   13   24:aload_1         
	//   14   25:arraylength     
	//   15   26:istore          5
		int i = 0;
	//   16   28:iconst_0        
	//   17   29:istore_2        
		int j = i;
	//   18   30:iload_2         
	//   19   31:istore_3        
		do
		{
			int i1 = j;
	//   20   32:iload_3         
	//   21   33:istore          6
			if(i < k)
	//*  22   35:iload_2         
	//*  23   36:iload           4
	//*  24   38:icmpge          57
			{
				i1 = j;
	//   25   41:iload_3         
	//   26   42:istore          6
				if(aobj[i] == null)
	//*  27   44:aload_0         
	//*  28   45:iload_2         
	//*  29   46:aaload          
	//*  30   47:ifnonnull       57
				{
					i++;
	//   31   50:iload_2         
	//   32   51:iconst_1        
	//   33   52:iadd            
	//   34   53:istore_2        
					continue;
	//   35   54:goto            32
				}
			}
			for(; i1 < l && aobj1[i1] == null; i1++);
	//   36   57:iload           6
	//   37   59:iload           5
	//   38   61:icmpge          80
	//   39   64:aload_1         
	//   40   65:iload           6
	//   41   67:aaload          
	//   42   68:ifnonnull       80
	//   43   71:iload           6
	//   44   73:iconst_1        
	//   45   74:iadd            
	//   46   75:istore          6
	//*  47   77:goto            57
			if(i >= k)
	//*  48   80:iload_2         
	//*  49   81:iload           4
	//*  50   83:icmplt          91
				j = 1;
	//   51   86:iconst_1        
	//   52   87:istore_3        
			else
	//*  53   88:goto            93
				j = 0;
	//   54   91:iconst_0        
	//   55   92:istore_3        
			boolean flag;
			if(i1 >= l)
	//*  56   93:iload           6
	//*  57   95:iload           5
	//*  58   97:icmplt          106
				flag = true;
	//   59  100:iconst_1        
	//   60  101:istore          7
			else
	//*  61  103:goto            109
				flag = false;
	//   62  106:iconst_0        
	//   63  107:istore          7
			if(j != 0 && flag)
	//*  64  109:iload_3         
	//*  65  110:ifeq            120
	//*  66  113:iload           7
	//*  67  115:ifeq            120
				return true;
	//   68  118:iconst_1        
	//   69  119:ireturn         
			if(j != flag)
	//*  70  120:iload_3         
	//*  71  121:iload           7
	//*  72  123:icmpeq          128
				return false;
	//   73  126:iconst_0        
	//   74  127:ireturn         
			if(!aobj[i].equals(aobj1[i1]))
	//*  75  128:aload_0         
	//*  76  129:iload_2         
	//*  77  130:aaload          
	//*  78  131:aload_1         
	//*  79  132:iload           6
	//*  80  134:aaload          
	//*  81  135:invokevirtual   #44  <Method boolean Object.equals(Object)>
	//*  82  138:ifne            143
				return false;
	//   83  141:iconst_0        
	//   84  142:ireturn         
			i++;
	//   85  143:iload_2         
	//   86  144:iconst_1        
	//   87  145:iadd            
	//   88  146:istore_2        
			j = i1 + 1;
	//   89  147:iload           6
	//   90  149:iconst_1        
	//   91  150:iadd            
	//   92  151:istore_3        
		} while(true);
	//   93  152:goto            32
	}

	public static int hashCode(int ai[])
	{
		if(ai != null && ai.length != 0)
	//*   0    0:aload_0         
	//*   1    1:ifnull          17
	//*   2    4:aload_0         
	//*   3    5:arraylength     
	//*   4    6:ifne            12
	//*   5    9:goto            17
			return Arrays.hashCode(ai);
	//    6   12:aload_0         
	//    7   13:invokestatic    #48  <Method int Arrays.hashCode(int[])>
	//    8   16:ireturn         
		else
			return 0;
	//    9   17:iconst_0        
	//   10   18:ireturn         
	}

	public static int hashCode(long al[])
	{
		if(al != null && al.length != 0)
	//*   0    0:aload_0         
	//*   1    1:ifnull          17
	//*   2    4:aload_0         
	//*   3    5:arraylength     
	//*   4    6:ifne            12
	//*   5    9:goto            17
			return Arrays.hashCode(al);
	//    6   12:aload_0         
	//    7   13:invokestatic    #51  <Method int Arrays.hashCode(long[])>
	//    8   16:ireturn         
		else
			return 0;
	//    9   17:iconst_0        
	//   10   18:ireturn         
	}

	public static int hashCode(Object aobj[])
	{
		int j = 0;
	//    0    0:iconst_0        
	//    1    1:istore_2        
		int i;
		if(aobj == null)
	//*   2    2:aload_0         
	//*   3    3:ifnonnull       11
			i = 0;
	//    4    6:iconst_0        
	//    5    7:istore_1        
		else
	//*   6    8:goto            14
			i = aobj.length;
	//    7   11:aload_0         
	//    8   12:arraylength     
	//    9   13:istore_1        
		int k;
		int l;
		for(k = 0; j < i; k = l)
	//*  10   14:iconst_0        
	//*  11   15:istore_3        
	//*  12   16:iload_2         
	//*  13   17:iload_1         
	//*  14   18:icmpge          56
		{
			Object obj = aobj[j];
	//   15   21:aload_0         
	//   16   22:iload_2         
	//   17   23:aaload          
	//   18   24:astore          5
			l = k;
	//   19   26:iload_3         
	//   20   27:istore          4
			if(obj != null)
	//*  21   29:aload           5
	//*  22   31:ifnull          46
				l = k * 31 + obj.hashCode();
	//   23   34:iload_3         
	//   24   35:bipush          31
	//   25   37:imul            
	//   26   38:aload           5
	//   27   40:invokevirtual   #55  <Method int Object.hashCode()>
	//   28   43:iadd            
	//   29   44:istore          4
			j++;
	//   30   46:iload_2         
	//   31   47:iconst_1        
	//   32   48:iadd            
	//   33   49:istore_2        
		}

	//   34   50:iload           4
	//   35   52:istore_3        
	//*  36   53:goto            16
		return k;
	//   37   56:iload_3         
	//   38   57:ireturn         
	}

	public static void zza(zzyc zzyc1, zzyc zzyc2)
	{
		if(zzyc1.zzcet != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #63  <Field zzye zzyc.zzcet>
	//*   2    4:ifnull          21
			zzyc2.zzcet = (zzye)zzyc1.zzcet.clone();
	//    3    7:aload_1         
	//    4    8:aload_0         
	//    5    9:getfield        #63  <Field zzye zzyc.zzcet>
	//    6   12:invokevirtual   #69  <Method Object zzye.clone()>
	//    7   15:checkcast       #65  <Class zzye>
	//    8   18:putfield        #63  <Field zzye zzyc.zzcet>
	//    9   21:return          
	}

	private static final Charset ISO_8859_1 = Charset.forName("ISO-8859-1");
	protected static final Charset UTF_8 = Charset.forName("UTF-8");
	public static final Object zzcfc = new Object();

	static 
	{
	//    0    0:ldc1            #13  <String "UTF-8">
	//    1    2:invokestatic    #19  <Method Charset Charset.forName(String)>
	//    2    5:putstatic       #21  <Field Charset UTF_8>
	//    3    8:ldc1            #23  <String "ISO-8859-1">
	//    4   10:invokestatic    #19  <Method Charset Charset.forName(String)>
	//    5   13:putstatic       #25  <Field Charset ISO_8859_1>
	//    6   16:new             #4   <Class Object>
	//    7   19:dup             
	//    8   20:invokespecial   #28  <Method void Object()>
	//    9   23:putstatic       #30  <Field Object zzcfc>
	//*  10   26:return          
	}
}

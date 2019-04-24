// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import java.nio.charset.Charset;
import java.util.Arrays;

// Referenced classes of package com.google.android.gms.internal:
//			zzbun, zzbup

public final class zzbur
{

	public static boolean equals(float af[], float af1[])
	{
		if(af == null || af.length == 0)
	//*   0    0:aload_0         
	//*   1    1:ifnull          9
	//*   2    4:aload_0         
	//*   3    5:arraylength     
	//*   4    6:ifne            22
			return af1 == null || af1.length == 0;
	//    5    9:aload_1         
	//    6   10:ifnull          18
	//    7   13:aload_1         
	//    8   14:arraylength     
	//    9   15:ifne            20
	//   10   18:iconst_1        
	//   11   19:ireturn         
	//   12   20:iconst_0        
	//   13   21:ireturn         
		else
			return Arrays.equals(af, af1);
	//   14   22:aload_0         
	//   15   23:aload_1         
	//   16   24:invokestatic    #37  <Method boolean Arrays.equals(float[], float[])>
	//   17   27:ireturn         
	}

	public static boolean equals(int ai[], int ai1[])
	{
		if(ai == null || ai.length == 0)
	//*   0    0:aload_0         
	//*   1    1:ifnull          9
	//*   2    4:aload_0         
	//*   3    5:arraylength     
	//*   4    6:ifne            22
			return ai1 == null || ai1.length == 0;
	//    5    9:aload_1         
	//    6   10:ifnull          18
	//    7   13:aload_1         
	//    8   14:arraylength     
	//    9   15:ifne            20
	//   10   18:iconst_1        
	//   11   19:ireturn         
	//   12   20:iconst_0        
	//   13   21:ireturn         
		else
			return Arrays.equals(ai, ai1);
	//   14   22:aload_0         
	//   15   23:aload_1         
	//   16   24:invokestatic    #40  <Method boolean Arrays.equals(int[], int[])>
	//   17   27:ireturn         
	}

	public static boolean equals(long al[], long al1[])
	{
		if(al == null || al.length == 0)
	//*   0    0:aload_0         
	//*   1    1:ifnull          9
	//*   2    4:aload_0         
	//*   3    5:arraylength     
	//*   4    6:ifne            22
			return al1 == null || al1.length == 0;
	//    5    9:aload_1         
	//    6   10:ifnull          18
	//    7   13:aload_1         
	//    8   14:arraylength     
	//    9   15:ifne            20
	//   10   18:iconst_1        
	//   11   19:ireturn         
	//   12   20:iconst_0        
	//   13   21:ireturn         
		else
			return Arrays.equals(al, al1);
	//   14   22:aload_0         
	//   15   23:aload_1         
	//   16   24:invokestatic    #43  <Method boolean Arrays.equals(long[], long[])>
	//   17   27:ireturn         
	}

	public static boolean equals(Object aobj[], Object aobj1[])
	{
		int j;
		int k;
		int l;
		boolean flag3;
		flag3 = false;
	//    0    0:iconst_0        
	//    1    1:istore          9
		if(aobj == null)
	//*   2    3:aload_0         
	//*   3    4:ifnonnull       40
			k = 0;
	//    4    7:iconst_0        
	//    5    8:istore          4
		else
	//*   6   10:aload_1         
	//*   7   11:ifnonnull       47
	//*   8   14:iconst_0        
	//*   9   15:istore          5
	//*  10   17:iconst_0        
	//*  11   18:istore_3        
	//*  12   19:iconst_0        
	//*  13   20:istore_2        
	//*  14   21:iload_2         
	//*  15   22:iload           4
	//*  16   24:icmpge          157
	//*  17   27:aload_0         
	//*  18   28:iload_2         
	//*  19   29:aaload          
	//*  20   30:ifnonnull       157
	//*  21   33:iload_2         
	//*  22   34:iconst_1        
	//*  23   35:iadd            
	//*  24   36:istore_2        
	//*  25   37:goto            21
			k = aobj.length;
	//   26   40:aload_0         
	//   27   41:arraylength     
	//   28   42:istore          4
		if(aobj1 == null)
			l = 0;
		else
	//*  29   44:goto            10
			l = aobj1.length;
	//   30   47:aload_1         
	//   31   48:arraylength     
	//   32   49:istore          5
		j = 0;
_L7:
		int i;
		boolean flag;
		boolean flag1;
		boolean flag2;
		for(i = 0; i < k && aobj[i] == null; i++);
	//*  33   51:goto            17
		for(; j < l && aobj1[j] == null; j++);
	//   34   54:iload_3         
	//   35   55:iload           5
	//   36   57:icmpge          73
	//   37   60:aload_1         
	//   38   61:iload_3         
	//   39   62:aaload          
	//   40   63:ifnonnull       73
	//   41   66:iload_3         
	//   42   67:iconst_1        
	//   43   68:iadd            
	//   44   69:istore_3        
	//*  45   70:goto            54
		if(i >= k)
	//*  46   73:iload_2         
	//*  47   74:iload           4
	//*  48   76:icmplt          107
			flag = true;
	//   49   79:iconst_1        
	//   50   80:istore          6
		else
	//*  51   82:iload_3         
	//*  52   83:iload           5
	//*  53   85:icmplt          113
	//*  54   88:iconst_1        
	//*  55   89:istore          7
	//*  56   91:iload           6
	//*  57   93:ifeq            119
	//*  58   96:iload           7
	//*  59   98:ifeq            119
	//*  60  101:iconst_1        
	//*  61  102:istore          8
	//*  62  104:iload           8
	//*  63  106:ireturn         
			flag = false;
	//   64  107:iconst_0        
	//   65  108:istore          6
		if(j >= l)
			flag1 = true;
		else
	//*  66  110:goto            82
			flag1 = false;
	//   67  113:iconst_0        
	//   68  114:istore          7
		if(!flag || !flag1) goto _L2; else goto _L1
_L1:
		flag2 = true;
_L4:
		return flag2;
	//*  69  116:goto            91
_L2:
		flag2 = flag3;
	//   70  119:iload           9
	//   71  121:istore          8
		if(flag != flag1) goto _L4; else goto _L3
	//   72  123:iload           6
	//   73  125:iload           7
	//   74  127:icmpne          104
_L3:
		flag2 = flag3;
	//   75  130:iload           9
	//   76  132:istore          8
		if(!aobj[i].equals(aobj1[j])) goto _L4; else goto _L5
	//   77  134:aload_0         
	//   78  135:iload_2         
	//   79  136:aaload          
	//   80  137:aload_1         
	//   81  138:iload_3         
	//   82  139:aaload          
	//   83  140:invokevirtual   #47  <Method boolean Object.equals(Object)>
	//   84  143:ifeq            104
_L5:
		j++;
	//   85  146:iload_3         
	//   86  147:iconst_1        
	//   87  148:iadd            
	//   88  149:istore_3        
		i++;
	//   89  150:iload_2         
	//   90  151:iconst_1        
	//   91  152:iadd            
	//   92  153:istore_2        
		if(true) goto _L7; else goto _L6
	//   93  154:goto            21
_L6:
	//*  94  157:goto            54
	}

	public static int hashCode(float af[])
	{
		if(af == null || af.length == 0)
	//*   0    0:aload_0         
	//*   1    1:ifnull          9
	//*   2    4:aload_0         
	//*   3    5:arraylength     
	//*   4    6:ifne            11
			return 0;
	//    5    9:iconst_0        
	//    6   10:ireturn         
		else
			return Arrays.hashCode(af);
	//    7   11:aload_0         
	//    8   12:invokestatic    #51  <Method int Arrays.hashCode(float[])>
	//    9   15:ireturn         
	}

	public static int hashCode(int ai[])
	{
		if(ai == null || ai.length == 0)
	//*   0    0:aload_0         
	//*   1    1:ifnull          9
	//*   2    4:aload_0         
	//*   3    5:arraylength     
	//*   4    6:ifne            11
			return 0;
	//    5    9:iconst_0        
	//    6   10:ireturn         
		else
			return Arrays.hashCode(ai);
	//    7   11:aload_0         
	//    8   12:invokestatic    #54  <Method int Arrays.hashCode(int[])>
	//    9   15:ireturn         
	}

	public static int hashCode(long al[])
	{
		if(al == null || al.length == 0)
	//*   0    0:aload_0         
	//*   1    1:ifnull          9
	//*   2    4:aload_0         
	//*   3    5:arraylength     
	//*   4    6:ifne            11
			return 0;
	//    5    9:iconst_0        
	//    6   10:ireturn         
		else
			return Arrays.hashCode(al);
	//    7   11:aload_0         
	//    8   12:invokestatic    #57  <Method int Arrays.hashCode(long[])>
	//    9   15:ireturn         
	}

	public static int hashCode(Object aobj[])
	{
		int k = 0;
	//    0    0:iconst_0        
	//    1    1:istore_3        
		int i;
		int j;
		if(aobj == null)
	//*   2    2:aload_0         
	//*   3    3:ifnonnull       50
			i = 0;
	//    4    6:iconst_0        
	//    5    7:istore_1        
		else
	//*   6    8:iconst_0        
	//*   7    9:istore_2        
	//*   8   10:iload_2         
	//*   9   11:iload_1         
	//*  10   12:icmpge          56
	//*  11   15:aload_0         
	//*  12   16:iload_2         
	//*  13   17:aaload          
	//*  14   18:astore          5
	//*  15   20:iload_3         
	//*  16   21:istore          4
	//*  17   23:aload           5
	//*  18   25:ifnull          40
	//*  19   28:iload_3         
	//*  20   29:bipush          31
	//*  21   31:imul            
	//*  22   32:aload           5
	//*  23   34:invokevirtual   #61  <Method int Object.hashCode()>
	//*  24   37:iadd            
	//*  25   38:istore          4
	//*  26   40:iload_2         
	//*  27   41:iconst_1        
	//*  28   42:iadd            
	//*  29   43:istore_2        
	//*  30   44:iload           4
	//*  31   46:istore_3        
	//*  32   47:goto            10
			i = aobj.length;
	//   33   50:aload_0         
	//   34   51:arraylength     
	//   35   52:istore_1        
		for(j = 0; j < i;)
		{
			Object obj = aobj[j];
			int l = k;
			if(obj != null)
				l = k * 31 + obj.hashCode();
			j++;
			k = l;
		}

	//*  36   53:goto            8
		return k;
	//   37   56:iload_3         
	//   38   57:ireturn         
	}

	public static void zza(zzbun zzbun1, zzbun zzbun2)
	{
		if(zzbun1.zzcrX != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #69  <Field zzbup zzbun.zzcrX>
	//*   2    4:ifnull          21
			zzbun2.zzcrX = (zzbup)zzbun1.zzcrX.clone();
	//    3    7:aload_1         
	//    4    8:aload_0         
	//    5    9:getfield        #69  <Field zzbup zzbun.zzcrX>
	//    6   12:invokevirtual   #75  <Method Object zzbup.clone()>
	//    7   15:checkcast       #71  <Class zzbup>
	//    8   18:putfield        #69  <Field zzbup zzbun.zzcrX>
	//    9   21:return          
	}

	public static boolean zza(byte abyte0[][], byte abyte1[][])
	{
		int j;
		int k;
		int l;
		boolean flag3;
		flag3 = false;
	//    0    0:iconst_0        
	//    1    1:istore          9
		if(abyte0 == null)
	//*   2    3:aload_0         
	//*   3    4:ifnonnull       40
			k = 0;
	//    4    7:iconst_0        
	//    5    8:istore          4
		else
	//*   6   10:aload_1         
	//*   7   11:ifnonnull       47
	//*   8   14:iconst_0        
	//*   9   15:istore          5
	//*  10   17:iconst_0        
	//*  11   18:istore_3        
	//*  12   19:iconst_0        
	//*  13   20:istore_2        
	//*  14   21:iload_2         
	//*  15   22:iload           4
	//*  16   24:icmpge          157
	//*  17   27:aload_0         
	//*  18   28:iload_2         
	//*  19   29:aaload          
	//*  20   30:ifnonnull       157
	//*  21   33:iload_2         
	//*  22   34:iconst_1        
	//*  23   35:iadd            
	//*  24   36:istore_2        
	//*  25   37:goto            21
			k = abyte0.length;
	//   26   40:aload_0         
	//   27   41:arraylength     
	//   28   42:istore          4
		if(abyte1 == null)
			l = 0;
		else
	//*  29   44:goto            10
			l = abyte1.length;
	//   30   47:aload_1         
	//   31   48:arraylength     
	//   32   49:istore          5
		j = 0;
_L7:
		int i;
		boolean flag;
		boolean flag1;
		boolean flag2;
		for(i = 0; i < k && abyte0[i] == null; i++);
	//*  33   51:goto            17
		for(; j < l && abyte1[j] == null; j++);
	//   34   54:iload_3         
	//   35   55:iload           5
	//   36   57:icmpge          73
	//   37   60:aload_1         
	//   38   61:iload_3         
	//   39   62:aaload          
	//   40   63:ifnonnull       73
	//   41   66:iload_3         
	//   42   67:iconst_1        
	//   43   68:iadd            
	//   44   69:istore_3        
	//*  45   70:goto            54
		if(i >= k)
	//*  46   73:iload_2         
	//*  47   74:iload           4
	//*  48   76:icmplt          107
			flag = true;
	//   49   79:iconst_1        
	//   50   80:istore          6
		else
	//*  51   82:iload_3         
	//*  52   83:iload           5
	//*  53   85:icmplt          113
	//*  54   88:iconst_1        
	//*  55   89:istore          7
	//*  56   91:iload           6
	//*  57   93:ifeq            119
	//*  58   96:iload           7
	//*  59   98:ifeq            119
	//*  60  101:iconst_1        
	//*  61  102:istore          8
	//*  62  104:iload           8
	//*  63  106:ireturn         
			flag = false;
	//   64  107:iconst_0        
	//   65  108:istore          6
		if(j >= l)
			flag1 = true;
		else
	//*  66  110:goto            82
			flag1 = false;
	//   67  113:iconst_0        
	//   68  114:istore          7
		if(!flag || !flag1) goto _L2; else goto _L1
_L1:
		flag2 = true;
_L4:
		return flag2;
	//*  69  116:goto            91
_L2:
		flag2 = flag3;
	//   70  119:iload           9
	//   71  121:istore          8
		if(flag != flag1) goto _L4; else goto _L3
	//   72  123:iload           6
	//   73  125:iload           7
	//   74  127:icmpne          104
_L3:
		flag2 = flag3;
	//   75  130:iload           9
	//   76  132:istore          8
		if(!Arrays.equals(abyte0[i], abyte1[j])) goto _L4; else goto _L5
	//   77  134:aload_0         
	//   78  135:iload_2         
	//   79  136:aaload          
	//   80  137:aload_1         
	//   81  138:iload_3         
	//   82  139:aaload          
	//   83  140:invokestatic    #79  <Method boolean Arrays.equals(byte[], byte[])>
	//   84  143:ifeq            104
_L5:
		j++;
	//   85  146:iload_3         
	//   86  147:iconst_1        
	//   87  148:iadd            
	//   88  149:istore_3        
		i++;
	//   89  150:iload_2         
	//   90  151:iconst_1        
	//   91  152:iadd            
	//   92  153:istore_2        
		if(true) goto _L7; else goto _L6
	//   93  154:goto            21
_L6:
	//*  94  157:goto            54
	}

	public static int zzb(byte abyte0[][])
	{
		int k = 0;
	//    0    0:iconst_0        
	//    1    1:istore_3        
		int i;
		int j;
		if(abyte0 == null)
	//*   2    2:aload_0         
	//*   3    3:ifnonnull       50
			i = 0;
	//    4    6:iconst_0        
	//    5    7:istore_1        
		else
	//*   6    8:iconst_0        
	//*   7    9:istore_2        
	//*   8   10:iload_2         
	//*   9   11:iload_1         
	//*  10   12:icmpge          56
	//*  11   15:aload_0         
	//*  12   16:iload_2         
	//*  13   17:aaload          
	//*  14   18:astore          5
	//*  15   20:iload_3         
	//*  16   21:istore          4
	//*  17   23:aload           5
	//*  18   25:ifnull          40
	//*  19   28:iload_3         
	//*  20   29:bipush          31
	//*  21   31:imul            
	//*  22   32:aload           5
	//*  23   34:invokestatic    #84  <Method int Arrays.hashCode(byte[])>
	//*  24   37:iadd            
	//*  25   38:istore          4
	//*  26   40:iload_2         
	//*  27   41:iconst_1        
	//*  28   42:iadd            
	//*  29   43:istore_2        
	//*  30   44:iload           4
	//*  31   46:istore_3        
	//*  32   47:goto            10
			i = abyte0.length;
	//   33   50:aload_0         
	//   34   51:arraylength     
	//   35   52:istore_1        
		for(j = 0; j < i;)
		{
			byte abyte1[] = abyte0[j];
			int l = k;
			if(abyte1 != null)
				l = k * 31 + Arrays.hashCode(abyte1);
			j++;
			k = l;
		}

	//*  36   53:goto            8
		return k;
	//   37   56:iload_3         
	//   38   57:ireturn         
	}

	protected static final Charset ISO_8859_1 = Charset.forName("ISO-8859-1");
	protected static final Charset UTF_8 = Charset.forName("UTF-8");
	public static final Object zzcsf = new Object();

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
	//    9   23:putstatic       #30  <Field Object zzcsf>
	//*  10   26:return          
	}
}

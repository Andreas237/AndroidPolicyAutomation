// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import java.nio.charset.Charset;
import java.util.Arrays;

// Referenced classes of package com.google.android.gms.internal:
//			zzbxn, zzbxp

public final class zzbxr
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
		int i = 0;
	//    0    0:iconst_0        
	//    1    1:istore_2        
		int k;
		if(aobj == null)
	//*   2    2:aload_0         
	//*   3    3:ifnonnull       12
			k = 0;
	//    4    6:iconst_0        
	//    5    7:istore          4
		else
	//*   6    9:goto            16
			k = aobj.length;
	//    7   12:aload_0         
	//    8   13:arraylength     
	//    9   14:istore          4
		int j = 0;
	//   10   16:iconst_0        
	//   11   17:istore_3        
		int l;
		if(aobj1 == null)
	//*  12   18:aload_1         
	//*  13   19:ifnonnull       28
			l = 0;
	//   14   22:iconst_0        
	//   15   23:istore          5
		else
	//*  16   25:goto            32
			l = aobj1.length;
	//   17   28:aload_1         
	//   18   29:arraylength     
	//   19   30:istore          5
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
	//*  81  135:invokevirtual   #47  <Method boolean Object.equals(Object)>
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
		int j = 0;
	//    0    0:iconst_0        
	//    1    1:istore_2        
		int k = 0;
	//    2    2:iconst_0        
	//    3    3:istore_3        
		int i;
		if(aobj == null)
	//*   4    4:aload_0         
	//*   5    5:ifnonnull       13
			i = 0;
	//    6    8:iconst_0        
	//    7    9:istore_1        
		else
	//*   8   10:goto            16
			i = aobj.length;
	//    9   13:aload_0         
	//   10   14:arraylength     
	//   11   15:istore_1        
		while(k < i) 
	//*  12   16:iload_3         
	//*  13   17:iload_1         
	//*  14   18:icmpge          56
		{
			Object obj = aobj[k];
	//   15   21:aload_0         
	//   16   22:iload_3         
	//   17   23:aaload          
	//   18   24:astore          5
			int l = j;
	//   19   26:iload_2         
	//   20   27:istore          4
			if(obj != null)
	//*  21   29:aload           5
	//*  22   31:ifnull          46
				l = j * 31 + obj.hashCode();
	//   23   34:iload_2         
	//   24   35:bipush          31
	//   25   37:imul            
	//   26   38:aload           5
	//   27   40:invokevirtual   #61  <Method int Object.hashCode()>
	//   28   43:iadd            
	//   29   44:istore          4
			k++;
	//   30   46:iload_3         
	//   31   47:iconst_1        
	//   32   48:iadd            
	//   33   49:istore_3        
			j = l;
	//   34   50:iload           4
	//   35   52:istore_2        
		}
	//*  36   53:goto            16
		return j;
	//   37   56:iload_2         
	//   38   57:ireturn         
	}

	public static void zza(zzbxn zzbxn1, zzbxn zzbxn2)
	{
		if(zzbxn1.zzcuI != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #69  <Field zzbxp zzbxn.zzcuI>
	//*   2    4:ifnull          21
			zzbxn2.zzcuI = (zzbxp)zzbxn1.zzcuI.clone();
	//    3    7:aload_1         
	//    4    8:aload_0         
	//    5    9:getfield        #69  <Field zzbxp zzbxn.zzcuI>
	//    6   12:invokevirtual   #75  <Method Object zzbxp.clone()>
	//    7   15:checkcast       #71  <Class zzbxp>
	//    8   18:putfield        #69  <Field zzbxp zzbxn.zzcuI>
	//    9   21:return          
	}

	public static boolean zza(byte abyte0[][], byte abyte1[][])
	{
		int i = 0;
	//    0    0:iconst_0        
	//    1    1:istore_2        
		int k;
		if(abyte0 == null)
	//*   2    2:aload_0         
	//*   3    3:ifnonnull       12
			k = 0;
	//    4    6:iconst_0        
	//    5    7:istore          4
		else
	//*   6    9:goto            16
			k = abyte0.length;
	//    7   12:aload_0         
	//    8   13:arraylength     
	//    9   14:istore          4
		int j = 0;
	//   10   16:iconst_0        
	//   11   17:istore_3        
		int l;
		if(abyte1 == null)
	//*  12   18:aload_1         
	//*  13   19:ifnonnull       28
			l = 0;
	//   14   22:iconst_0        
	//   15   23:istore          5
		else
	//*  16   25:goto            32
			l = abyte1.length;
	//   17   28:aload_1         
	//   18   29:arraylength     
	//   19   30:istore          5
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
				if(abyte0[i] == null)
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
			for(; i1 < l && abyte1[i1] == null; i1++);
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
			if(!Arrays.equals(abyte0[i], abyte1[i1]))
	//*  75  128:aload_0         
	//*  76  129:iload_2         
	//*  77  130:aaload          
	//*  78  131:aload_1         
	//*  79  132:iload           6
	//*  80  134:aaload          
	//*  81  135:invokestatic    #79  <Method boolean Arrays.equals(byte[], byte[])>
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

	public static int zzb(byte abyte0[][])
	{
		int j = 0;
	//    0    0:iconst_0        
	//    1    1:istore_2        
		int k = 0;
	//    2    2:iconst_0        
	//    3    3:istore_3        
		int i;
		if(abyte0 == null)
	//*   4    4:aload_0         
	//*   5    5:ifnonnull       13
			i = 0;
	//    6    8:iconst_0        
	//    7    9:istore_1        
		else
	//*   8   10:goto            16
			i = abyte0.length;
	//    9   13:aload_0         
	//   10   14:arraylength     
	//   11   15:istore_1        
		while(k < i) 
	//*  12   16:iload_3         
	//*  13   17:iload_1         
	//*  14   18:icmpge          56
		{
			byte abyte1[] = abyte0[k];
	//   15   21:aload_0         
	//   16   22:iload_3         
	//   17   23:aaload          
	//   18   24:astore          5
			int l = j;
	//   19   26:iload_2         
	//   20   27:istore          4
			if(abyte1 != null)
	//*  21   29:aload           5
	//*  22   31:ifnull          46
				l = j * 31 + Arrays.hashCode(abyte1);
	//   23   34:iload_2         
	//   24   35:bipush          31
	//   25   37:imul            
	//   26   38:aload           5
	//   27   40:invokestatic    #84  <Method int Arrays.hashCode(byte[])>
	//   28   43:iadd            
	//   29   44:istore          4
			k++;
	//   30   46:iload_3         
	//   31   47:iconst_1        
	//   32   48:iadd            
	//   33   49:istore_3        
			j = l;
	//   34   50:iload           4
	//   35   52:istore_2        
		}
	//*  36   53:goto            16
		return j;
	//   37   56:iload_2         
	//   38   57:ireturn         
	}

	protected static final Charset ISO_8859_1 = Charset.forName("ISO-8859-1");
	protected static final Charset UTF_8 = Charset.forName("UTF-8");
	public static final Object zzcuQ = new Object();

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
	//    9   23:putstatic       #30  <Field Object zzcuQ>
	//*  10   26:return          
	}
}

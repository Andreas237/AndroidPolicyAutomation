// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.util;

import com.google.android.gms.common.internal.Objects;
import java.lang.reflect.Array;
import java.util.*;

// Referenced classes of package com.google.android.gms.common.util:
//			zza, Predicate

public final class ArrayUtils
{
	private static final class zza
	{

		private final com.google.android.gms.common.util.zza zzd(Object obj)
		{
			com.google.android.gms.common.util.zza zza2 = (com.google.android.gms.common.util.zza)zzzb.get(obj);
		//    0    0:aload_0         
		//    1    1:getfield        #21  <Field HashMap zzzb>
		//    2    4:aload_1         
		//    3    5:invokevirtual   #28  <Method Object HashMap.get(Object)>
		//    4    8:checkcast       #30  <Class zza>
		//    5   11:astore_3        
			com.google.android.gms.common.util.zza zza1 = zza2;
		//    6   12:aload_3         
		//    7   13:astore_2        
			if(zza2 == null)
		//*   8   14:aload_3         
		//*   9   15:ifnonnull       36
			{
				zza1 = new com.google.android.gms.common.util.zza();
		//   10   18:new             #30  <Class zza>
		//   11   21:dup             
		//   12   22:invokespecial   #31  <Method void zza()>
		//   13   25:astore_2        
				zzzb.put(obj, ((Object) (zza1)));
		//   14   26:aload_0         
		//   15   27:getfield        #21  <Field HashMap zzzb>
		//   16   30:aload_1         
		//   17   31:aload_2         
		//   18   32:invokevirtual   #35  <Method Object HashMap.put(Object, Object)>
		//   19   35:pop             
			}
			return zza1;
		//   20   36:aload_2         
		//   21   37:areturn         
		}

		final void zzb(Object obj)
		{
			obj = ((Object) (zzd(obj)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #39  <Method zza zzd(Object)>
		//    3    5:astore_1        
			obj.count = ((com.google.android.gms.common.util.zza) (obj)).count + 1;
		//    4    6:aload_1         
		//    5    7:aload_1         
		//    6    8:getfield        #43  <Field int zza.count>
		//    7   11:iconst_1        
		//    8   12:iadd            
		//    9   13:putfield        #43  <Field int zza.count>
		//   10   16:return          
		}

		final void zzc(Object obj)
		{
			obj = ((Object) (zzd(obj)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #39  <Method zza zzd(Object)>
		//    3    5:astore_1        
			obj.count = ((com.google.android.gms.common.util.zza) (obj)).count - 1;
		//    4    6:aload_1         
		//    5    7:aload_1         
		//    6    8:getfield        #43  <Field int zza.count>
		//    7   11:iconst_1        
		//    8   12:isub            
		//    9   13:putfield        #43  <Field int zza.count>
		//   10   16:return          
		}

		HashMap zzzb;

		zza(int i)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #15  <Method void Object()>
			zzzb = new HashMap(i);
		//    2    4:aload_0         
		//    3    5:new             #17  <Class HashMap>
		//    4    8:dup             
		//    5    9:iload_1         
		//    6   10:invokespecial   #19  <Method void HashMap(int)>
		//    7   13:putfield        #21  <Field HashMap zzzb>
		//    8   16:return          
		}
	}


	private ArrayUtils()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void Object()>
	//    2    4:return          
	}

	public static int[] appendToArray(int ai[], int i)
	{
		if(ai != null && ai.length != 0)
	//*   0    0:aload_0         
	//*   1    1:ifnull          24
	//*   2    4:aload_0         
	//*   3    5:arraylength     
	//*   4    6:ifne            12
	//*   5    9:goto            24
			ai = Arrays.copyOf(ai, ai.length + 1);
	//    6   12:aload_0         
	//    7   13:aload_0         
	//    8   14:arraylength     
	//    9   15:iconst_1        
	//   10   16:iadd            
	//   11   17:invokestatic    #20  <Method int[] Arrays.copyOf(int[], int)>
	//   12   20:astore_0        
		else
	//*  13   21:goto            28
			ai = new int[1];
	//   14   24:iconst_1        
	//   15   25:newarray        int[]
	//   16   27:astore_0        
		ai[ai.length - 1] = i;
	//   17   28:aload_0         
	//   18   29:aload_0         
	//   19   30:arraylength     
	//   20   31:iconst_1        
	//   21   32:isub            
	//   22   33:iload_1         
	//   23   34:iastore         
		return ai;
	//   24   35:aload_0         
	//   25   36:areturn         
	}

	public static Object[] appendToArray(Object aobj[], Object obj)
	{
		if(aobj == null && obj == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       21
	//*   2    4:aload_1         
	//*   3    5:ifnull          11
	//*   4    8:goto            21
			throw new IllegalArgumentException("Cannot generate array of generic type w/o class info");
	//    5   11:new             #23  <Class IllegalArgumentException>
	//    6   14:dup             
	//    7   15:ldc1            #25  <String "Cannot generate array of generic type w/o class info">
	//    8   17:invokespecial   #28  <Method void IllegalArgumentException(String)>
	//    9   20:athrow          
		if(aobj == null)
	//*  10   21:aload_0         
	//*  11   22:ifnonnull       40
			aobj = (Object[])Array.newInstance(obj.getClass(), 1);
	//   12   25:aload_1         
	//   13   26:invokevirtual   #32  <Method Class Object.getClass()>
	//   14   29:iconst_1        
	//   15   30:invokestatic    #38  <Method Object Array.newInstance(Class, int)>
	//   16   33:checkcast       #40  <Class Object[]>
	//   17   36:astore_0        
		else
	//*  18   37:goto            49
			aobj = Arrays.copyOf(aobj, aobj.length + 1);
	//   19   40:aload_0         
	//   20   41:aload_0         
	//   21   42:arraylength     
	//   22   43:iconst_1        
	//   23   44:iadd            
	//   24   45:invokestatic    #43  <Method Object[] Arrays.copyOf(Object[], int)>
	//   25   48:astore_0        
		aobj[aobj.length - 1] = obj;
	//   26   49:aload_0         
	//   27   50:aload_0         
	//   28   51:arraylength     
	//   29   52:iconst_1        
	//   30   53:isub            
	//   31   54:aload_1         
	//   32   55:aastore         
		return aobj;
	//   33   56:aload_0         
	//   34   57:areturn         
	}

	public static transient Object[] concat(Object aobj[][])
	{
		if(aobj.length == 0)
	//*   0    0:aload_0         
	//*   1    1:arraylength     
	//*   2    2:ifne            17
			return (Object[])Array.newInstance(((Object) (aobj)).getClass(), 0);
	//    3    5:aload_0         
	//    4    6:invokevirtual   #32  <Method Class Object.getClass()>
	//    5    9:iconst_0        
	//    6   10:invokestatic    #38  <Method Object Array.newInstance(Class, int)>
	//    7   13:checkcast       #40  <Class Object[]>
	//    8   16:areturn         
		int i = 0;
	//    9   17:iconst_0        
	//   10   18:istore_1        
		int k = 0;
	//   11   19:iconst_0        
	//   12   20:istore_2        
		for(; i < aobj.length; i++)
	//*  13   21:iload_1         
	//*  14   22:aload_0         
	//*  15   23:arraylength     
	//*  16   24:icmpge          41
			k += aobj[i].length;
	//   17   27:iload_2         
	//   18   28:aload_0         
	//   19   29:iload_1         
	//   20   30:aaload          
	//   21   31:arraylength     
	//   22   32:iadd            
	//   23   33:istore_2        

	//   24   34:iload_1         
	//   25   35:iconst_1        
	//   26   36:iadd            
	//   27   37:istore_1        
	//*  28   38:goto            21
		Object aobj1[] = Arrays.copyOf(aobj[0], k);
	//   29   41:aload_0         
	//   30   42:iconst_0        
	//   31   43:aaload          
	//   32   44:iload_2         
	//   33   45:invokestatic    #43  <Method Object[] Arrays.copyOf(Object[], int)>
	//   34   48:astore_3        
		k = aobj[0].length;
	//   35   49:aload_0         
	//   36   50:iconst_0        
	//   37   51:aaload          
	//   38   52:arraylength     
	//   39   53:istore_2        
		for(int j = 1; j < aobj.length; j++)
	//*  40   54:iconst_1        
	//*  41   55:istore_1        
	//*  42   56:iload_1         
	//*  43   57:aload_0         
	//*  44   58:arraylength     
	//*  45   59:icmpge          91
		{
			Object aobj2[] = aobj[j];
	//   46   62:aload_0         
	//   47   63:iload_1         
	//   48   64:aaload          
	//   49   65:astore          4
			System.arraycopy(((Object) (aobj2)), 0, ((Object) (aobj1)), k, aobj2.length);
	//   50   67:aload           4
	//   51   69:iconst_0        
	//   52   70:aload_3         
	//   53   71:iload_2         
	//   54   72:aload           4
	//   55   74:arraylength     
	//   56   75:invokestatic    #53  <Method void System.arraycopy(Object, int, Object, int, int)>
			k += aobj2.length;
	//   57   78:iload_2         
	//   58   79:aload           4
	//   59   81:arraylength     
	//   60   82:iadd            
	//   61   83:istore_2        
		}

	//   62   84:iload_1         
	//   63   85:iconst_1        
	//   64   86:iadd            
	//   65   87:istore_1        
	//*  66   88:goto            56
		return aobj1;
	//   67   91:aload_3         
	//   68   92:areturn         
	}

	public static transient byte[] concatByteArrays(byte abyte0[][])
	{
		if(abyte0.length == 0)
	//*   0    0:aload_0         
	//*   1    1:arraylength     
	//*   2    2:ifne            9
			return new byte[0];
	//    3    5:iconst_0        
	//    4    6:newarray        byte[]
	//    5    8:areturn         
		int i = 0;
	//    6    9:iconst_0        
	//    7   10:istore_1        
		int k = 0;
	//    8   11:iconst_0        
	//    9   12:istore_2        
		for(; i < abyte0.length; i++)
	//*  10   13:iload_1         
	//*  11   14:aload_0         
	//*  12   15:arraylength     
	//*  13   16:icmpge          33
			k += abyte0[i].length;
	//   14   19:iload_2         
	//   15   20:aload_0         
	//   16   21:iload_1         
	//   17   22:aaload          
	//   18   23:arraylength     
	//   19   24:iadd            
	//   20   25:istore_2        

	//   21   26:iload_1         
	//   22   27:iconst_1        
	//   23   28:iadd            
	//   24   29:istore_1        
	//*  25   30:goto            13
		byte abyte1[] = Arrays.copyOf(abyte0[0], k);
	//   26   33:aload_0         
	//   27   34:iconst_0        
	//   28   35:aaload          
	//   29   36:iload_2         
	//   30   37:invokestatic    #59  <Method byte[] Arrays.copyOf(byte[], int)>
	//   31   40:astore_3        
		k = abyte0[0].length;
	//   32   41:aload_0         
	//   33   42:iconst_0        
	//   34   43:aaload          
	//   35   44:arraylength     
	//   36   45:istore_2        
		for(int j = 1; j < abyte0.length; j++)
	//*  37   46:iconst_1        
	//*  38   47:istore_1        
	//*  39   48:iload_1         
	//*  40   49:aload_0         
	//*  41   50:arraylength     
	//*  42   51:icmpge          83
		{
			byte abyte2[] = abyte0[j];
	//   43   54:aload_0         
	//   44   55:iload_1         
	//   45   56:aaload          
	//   46   57:astore          4
			System.arraycopy(((Object) (abyte2)), 0, ((Object) (abyte1)), k, abyte2.length);
	//   47   59:aload           4
	//   48   61:iconst_0        
	//   49   62:aload_3         
	//   50   63:iload_2         
	//   51   64:aload           4
	//   52   66:arraylength     
	//   53   67:invokestatic    #53  <Method void System.arraycopy(Object, int, Object, int, int)>
			k += abyte2.length;
	//   54   70:iload_2         
	//   55   71:aload           4
	//   56   73:arraylength     
	//   57   74:iadd            
	//   58   75:istore_2        
		}

	//   59   76:iload_1         
	//   60   77:iconst_1        
	//   61   78:iadd            
	//   62   79:istore_1        
	//*  63   80:goto            48
		return abyte1;
	//   64   83:aload_3         
	//   65   84:areturn         
	}

	public static boolean contains(byte abyte0[], byte byte0)
	{
		if(abyte0 == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return false;
	//    2    4:iconst_0        
	//    3    5:ireturn         
		int j = abyte0.length;
	//    4    6:aload_0         
	//    5    7:arraylength     
	//    6    8:istore_3        
		for(int i = 0; i < j; i++)
	//*   7    9:iconst_0        
	//*   8   10:istore_2        
	//*   9   11:iload_2         
	//*  10   12:iload_3         
	//*  11   13:icmpge          32
			if(abyte0[i] == byte0)
	//*  12   16:aload_0         
	//*  13   17:iload_2         
	//*  14   18:baload          
	//*  15   19:iload_1         
	//*  16   20:icmpne          25
				return true;
	//   17   23:iconst_1        
	//   18   24:ireturn         

	//   19   25:iload_2         
	//   20   26:iconst_1        
	//   21   27:iadd            
	//   22   28:istore_2        
	//*  23   29:goto            11
		return false;
	//   24   32:iconst_0        
	//   25   33:ireturn         
	}

	public static boolean contains(char ac[], char c)
	{
		if(ac == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return false;
	//    2    4:iconst_0        
	//    3    5:ireturn         
		int j = ac.length;
	//    4    6:aload_0         
	//    5    7:arraylength     
	//    6    8:istore_3        
		for(int i = 0; i < j; i++)
	//*   7    9:iconst_0        
	//*   8   10:istore_2        
	//*   9   11:iload_2         
	//*  10   12:iload_3         
	//*  11   13:icmpge          32
			if(ac[i] == c)
	//*  12   16:aload_0         
	//*  13   17:iload_2         
	//*  14   18:caload          
	//*  15   19:iload_1         
	//*  16   20:icmpne          25
				return true;
	//   17   23:iconst_1        
	//   18   24:ireturn         

	//   19   25:iload_2         
	//   20   26:iconst_1        
	//   21   27:iadd            
	//   22   28:istore_2        
	//*  23   29:goto            11
		return false;
	//   24   32:iconst_0        
	//   25   33:ireturn         
	}

	public static boolean contains(double ad[], double d)
	{
		if(ad == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return false;
	//    2    4:iconst_0        
	//    3    5:ireturn         
		int j = ad.length;
	//    4    6:aload_0         
	//    5    7:arraylength     
	//    6    8:istore          4
		for(int i = 0; i < j; i++)
	//*   7   10:iconst_0        
	//*   8   11:istore_3        
	//*   9   12:iload_3         
	//*  10   13:iload           4
	//*  11   15:icmpge          35
			if(ad[i] == d)
	//*  12   18:aload_0         
	//*  13   19:iload_3         
	//*  14   20:daload          
	//*  15   21:dload_1         
	//*  16   22:dcmpl           
	//*  17   23:ifne            28
				return true;
	//   18   26:iconst_1        
	//   19   27:ireturn         

	//   20   28:iload_3         
	//   21   29:iconst_1        
	//   22   30:iadd            
	//   23   31:istore_3        
	//*  24   32:goto            12
		return false;
	//   25   35:iconst_0        
	//   26   36:ireturn         
	}

	public static boolean contains(float af[], float f, float f1)
	{
		if(af == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return false;
	//    2    4:iconst_0        
	//    3    5:ireturn         
		int j = af.length;
	//    4    6:aload_0         
	//    5    7:arraylength     
	//    6    8:istore          5
		for(int i = 0; i < j; i++)
	//*   7   10:iconst_0        
	//*   8   11:istore          4
	//*   9   13:iload           4
	//*  10   15:iload           5
	//*  11   17:icmpge          52
		{
			float f2 = af[i];
	//   12   20:aload_0         
	//   13   21:iload           4
	//   14   23:faload          
	//   15   24:fstore_3        
			if(f - f1 <= f2 && f2 <= f + f1)
	//*  16   25:fload_1         
	//*  17   26:fload_2         
	//*  18   27:fsub            
	//*  19   28:fload_3         
	//*  20   29:fcmpg           
	//*  21   30:ifgt            43
	//*  22   33:fload_3         
	//*  23   34:fload_1         
	//*  24   35:fload_2         
	//*  25   36:fadd            
	//*  26   37:fcmpg           
	//*  27   38:ifgt            43
				return true;
	//   28   41:iconst_1        
	//   29   42:ireturn         
		}

	//   30   43:iload           4
	//   31   45:iconst_1        
	//   32   46:iadd            
	//   33   47:istore          4
	//*  34   49:goto            13
		return false;
	//   35   52:iconst_0        
	//   36   53:ireturn         
	}

	public static boolean contains(int ai[], int i)
	{
		if(ai == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return false;
	//    2    4:iconst_0        
	//    3    5:ireturn         
		int k = ai.length;
	//    4    6:aload_0         
	//    5    7:arraylength     
	//    6    8:istore_3        
		for(int j = 0; j < k; j++)
	//*   7    9:iconst_0        
	//*   8   10:istore_2        
	//*   9   11:iload_2         
	//*  10   12:iload_3         
	//*  11   13:icmpge          32
			if(ai[j] == i)
	//*  12   16:aload_0         
	//*  13   17:iload_2         
	//*  14   18:iaload          
	//*  15   19:iload_1         
	//*  16   20:icmpne          25
				return true;
	//   17   23:iconst_1        
	//   18   24:ireturn         

	//   19   25:iload_2         
	//   20   26:iconst_1        
	//   21   27:iadd            
	//   22   28:istore_2        
	//*  23   29:goto            11
		return false;
	//   24   32:iconst_0        
	//   25   33:ireturn         
	}

	public static boolean contains(Object aobj[], Object obj)
	{
		return indexOf(aobj, obj) >= 0;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #70  <Method int indexOf(Object[], Object)>
	//    3    5:iflt            10
	//    4    8:iconst_1        
	//    5    9:ireturn         
	//    6   10:iconst_0        
	//    7   11:ireturn         
	}

	public static boolean contains(short aword0[], short word0)
	{
		if(aword0 == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return false;
	//    2    4:iconst_0        
	//    3    5:ireturn         
		int j = aword0.length;
	//    4    6:aload_0         
	//    5    7:arraylength     
	//    6    8:istore_3        
		for(int i = 0; i < j; i++)
	//*   7    9:iconst_0        
	//*   8   10:istore_2        
	//*   9   11:iload_2         
	//*  10   12:iload_3         
	//*  11   13:icmpge          32
			if(aword0[i] == word0)
	//*  12   16:aload_0         
	//*  13   17:iload_2         
	//*  14   18:saload          
	//*  15   19:iload_1         
	//*  16   20:icmpne          25
				return true;
	//   17   23:iconst_1        
	//   18   24:ireturn         

	//   19   25:iload_2         
	//   20   26:iconst_1        
	//   21   27:iadd            
	//   22   28:istore_2        
	//*  23   29:goto            11
		return false;
	//   24   32:iconst_0        
	//   25   33:ireturn         
	}

	public static boolean contains(boolean aflag[], boolean flag)
	{
		if(aflag == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return false;
	//    2    4:iconst_0        
	//    3    5:ireturn         
		int j = aflag.length;
	//    4    6:aload_0         
	//    5    7:arraylength     
	//    6    8:istore_3        
		for(int i = 0; i < j; i++)
	//*   7    9:iconst_0        
	//*   8   10:istore_2        
	//*   9   11:iload_2         
	//*  10   12:iload_3         
	//*  11   13:icmpge          32
			if(aflag[i] == flag)
	//*  12   16:aload_0         
	//*  13   17:iload_2         
	//*  14   18:baload          
	//*  15   19:iload_1         
	//*  16   20:icmpne          25
				return true;
	//   17   23:iconst_1        
	//   18   24:ireturn         

	//   19   25:iload_2         
	//   20   26:iconst_1        
	//   21   27:iadd            
	//   22   28:istore_2        
	//*  23   29:goto            11
		return false;
	//   24   32:iconst_0        
	//   25   33:ireturn         
	}

	public static boolean containsIgnoreCase(String as[], String s)
	{
		if(as == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return false;
	//    2    4:iconst_0        
	//    3    5:ireturn         
		int j = as.length;
	//    4    6:aload_0         
	//    5    7:arraylength     
	//    6    8:istore_3        
		for(int i = 0; i < j; i++)
	//*   7    9:iconst_0        
	//*   8   10:istore_2        
	//*   9   11:iload_2         
	//*  10   12:iload_3         
	//*  11   13:icmpge          52
		{
			String s1 = as[i];
	//   12   16:aload_0         
	//   13   17:iload_2         
	//   14   18:aaload          
	//   15   19:astore          4
			if(s1 == s)
	//*  16   21:aload           4
	//*  17   23:aload_1         
	//*  18   24:if_acmpne       29
				return true;
	//   19   27:iconst_1        
	//   20   28:ireturn         
			if(s1 != null && s1.equalsIgnoreCase(s))
	//*  21   29:aload           4
	//*  22   31:ifnull          45
	//*  23   34:aload           4
	//*  24   36:aload_1         
	//*  25   37:invokevirtual   #81  <Method boolean String.equalsIgnoreCase(String)>
	//*  26   40:ifeq            45
				return true;
	//   27   43:iconst_1        
	//   28   44:ireturn         
		}

	//   29   45:iload_2         
	//   30   46:iconst_1        
	//   31   47:iadd            
	//   32   48:istore_2        
	//*  33   49:goto            11
		return false;
	//   34   52:iconst_0        
	//   35   53:ireturn         
	}

	public static boolean equalsAnyOrder(Object aobj[], Object aobj1[])
	{
		if(aobj == aobj1)
	//*   0    0:aload_0         
	//*   1    1:aload_1         
	//*   2    2:if_acmpne       7
			return true;
	//    3    5:iconst_1        
	//    4    6:ireturn         
		int i;
		if(aobj == null)
	//*   5    7:aload_0         
	//*   6    8:ifnonnull       16
			i = 0;
	//    7   11:iconst_0        
	//    8   12:istore_2        
		else
	//*   9   13:goto            19
			i = aobj.length;
	//   10   16:aload_0         
	//   11   17:arraylength     
	//   12   18:istore_2        
		int l;
		if(aobj1 == null)
	//*  13   19:aload_1         
	//*  14   20:ifnonnull       28
			l = 0;
	//   15   23:iconst_0        
	//   16   24:istore_3        
		else
	//*  17   25:goto            31
			l = aobj1.length;
	//   18   28:aload_1         
	//   19   29:arraylength     
	//   20   30:istore_3        
		if(i == 0 && l == 0)
	//*  21   31:iload_2         
	//*  22   32:ifne            41
	//*  23   35:iload_3         
	//*  24   36:ifne            41
			return true;
	//   25   39:iconst_1        
	//   26   40:ireturn         
		if(i != l)
	//*  27   41:iload_2         
	//*  28   42:iload_3         
	//*  29   43:icmpeq          48
			return false;
	//   30   46:iconst_0        
	//   31   47:ireturn         
		zza zza1 = new zza(i);
	//   32   48:new             #6   <Class ArrayUtils$zza>
	//   33   51:dup             
	//   34   52:iload_2         
	//   35   53:invokespecial   #86  <Method void ArrayUtils$zza(int)>
	//   36   56:astore          4
		l = aobj.length;
	//   37   58:aload_0         
	//   38   59:arraylength     
	//   39   60:istore_3        
		for(int j = 0; j < l; j++)
	//*  40   61:iconst_0        
	//*  41   62:istore_2        
	//*  42   63:iload_2         
	//*  43   64:iload_3         
	//*  44   65:icmpge          83
			zza1.zzb(aobj[j]);
	//   45   68:aload           4
	//   46   70:aload_0         
	//   47   71:iload_2         
	//   48   72:aaload          
	//   49   73:invokevirtual   #90  <Method void ArrayUtils$zza.zzb(Object)>

	//   50   76:iload_2         
	//   51   77:iconst_1        
	//   52   78:iadd            
	//   53   79:istore_2        
	//*  54   80:goto            63
		l = aobj1.length;
	//   55   83:aload_1         
	//   56   84:arraylength     
	//   57   85:istore_3        
		for(int k = 0; k < l; k++)
	//*  58   86:iconst_0        
	//*  59   87:istore_2        
	//*  60   88:iload_2         
	//*  61   89:iload_3         
	//*  62   90:icmpge          108
			zza1.zzc(aobj1[k]);
	//   63   93:aload           4
	//   64   95:aload_1         
	//   65   96:iload_2         
	//   66   97:aaload          
	//   67   98:invokevirtual   #93  <Method void ArrayUtils$zza.zzc(Object)>

	//   68  101:iload_2         
	//   69  102:iconst_1        
	//   70  103:iadd            
	//   71  104:istore_2        
	//*  72  105:goto            88
		for(aobj = ((Object []) (zza1.zzzb.values().iterator())); ((Iterator) (aobj)).hasNext();)
	//*  73  108:aload           4
	//*  74  110:getfield        #97  <Field HashMap ArrayUtils$zza.zzzb>
	//*  75  113:invokevirtual   #103 <Method Collection HashMap.values()>
	//*  76  116:invokeinterface #109 <Method Iterator Collection.iterator()>
	//*  77  121:astore_0        
	//*  78  122:aload_0         
	//*  79  123:invokeinterface #115 <Method boolean Iterator.hasNext()>
	//*  80  128:ifeq            148
			if(((com.google.android.gms.common.util.zza)((Iterator) (aobj)).next()).count != 0)
	//*  81  131:aload_0         
	//*  82  132:invokeinterface #119 <Method Object Iterator.next()>
	//*  83  137:checkcast       #121 <Class zza>
	//*  84  140:getfield        #125 <Field int zza.count>
	//*  85  143:ifeq            122
				return false;
	//   86  146:iconst_0        
	//   87  147:ireturn         

		return true;
	//   88  148:iconst_1        
	//   89  149:ireturn         
	}

	public static int indexOf(Object aobj[], Object obj)
	{
		int j = 0;
	//    0    0:iconst_0        
	//    1    1:istore_3        
		int i;
		if(aobj != null)
	//*   2    2:aload_0         
	//*   3    3:ifnull          12
			i = aobj.length;
	//    4    6:aload_0         
	//    5    7:arraylength     
	//    6    8:istore_2        
		else
	//*   7    9:goto            14
			i = 0;
	//    8   12:iconst_0        
	//    9   13:istore_2        
		for(; j < i; j++)
	//*  10   14:iload_3         
	//*  11   15:iload_2         
	//*  12   16:icmpge          38
			if(Objects.equal(aobj[j], obj))
	//*  13   19:aload_0         
	//*  14   20:iload_3         
	//*  15   21:aaload          
	//*  16   22:aload_1         
	//*  17   23:invokestatic    #131 <Method boolean Objects.equal(Object, Object)>
	//*  18   26:ifeq            31
				return j;
	//   19   29:iload_3         
	//   20   30:ireturn         

	//   21   31:iload_3         
	//   22   32:iconst_1        
	//   23   33:iadd            
	//   24   34:istore_3        
	//*  25   35:goto            14
		return -1;
	//   26   38:iconst_m1       
	//   27   39:ireturn         
	}

	public static ArrayList newArrayList()
	{
		return new ArrayList();
	//    0    0:new             #136 <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #137 <Method void ArrayList()>
	//    3    7:areturn         
	}

	public static int rearrange(Object aobj[], Predicate predicate)
	{
		int i = 0;
	//    0    0:iconst_0        
	//    1    1:istore_2        
		if(aobj != null)
	//*   2    2:aload_0         
	//*   3    3:ifnull          78
		{
			if(aobj.length == 0)
	//*   4    6:aload_0         
	//*   5    7:arraylength     
	//*   6    8:ifne            13
				return 0;
	//    7   11:iconst_0        
	//    8   12:ireturn         
			int l = aobj.length;
	//    9   13:aload_0         
	//   10   14:arraylength     
	//   11   15:istore          5
			int j;
			int k;
			for(j = 0; i < l; j = k)
	//*  12   17:iconst_0        
	//*  13   18:istore_3        
	//*  14   19:iload_2         
	//*  15   20:iload           5
	//*  16   22:icmpge          76
			{
				k = j;
	//   17   25:iload_3         
	//   18   26:istore          4
				if(predicate.apply(aobj[i]))
	//*  19   28:aload_1         
	//*  20   29:aload_0         
	//*  21   30:iload_2         
	//*  22   31:aaload          
	//*  23   32:invokeinterface #146 <Method boolean Predicate.apply(Object)>
	//*  24   37:ifeq            66
				{
					if(j != i)
	//*  25   40:iload_3         
	//*  26   41:iload_2         
	//*  27   42:icmpeq          61
					{
						Object obj = aobj[j];
	//   28   45:aload_0         
	//   29   46:iload_3         
	//   30   47:aaload          
	//   31   48:astore          6
						aobj[j] = aobj[i];
	//   32   50:aload_0         
	//   33   51:iload_3         
	//   34   52:aload_0         
	//   35   53:iload_2         
	//   36   54:aaload          
	//   37   55:aastore         
						aobj[i] = obj;
	//   38   56:aload_0         
	//   39   57:iload_2         
	//   40   58:aload           6
	//   41   60:aastore         
					}
					k = j + 1;
	//   42   61:iload_3         
	//   43   62:iconst_1        
	//   44   63:iadd            
	//   45   64:istore          4
				}
				i++;
	//   46   66:iload_2         
	//   47   67:iconst_1        
	//   48   68:iadd            
	//   49   69:istore_2        
			}

	//   50   70:iload           4
	//   51   72:istore_3        
	//*  52   73:goto            19
			return j;
	//   53   76:iload_3         
	//   54   77:ireturn         
		} else
		{
			return 0;
	//   55   78:iconst_0        
	//   56   79:ireturn         
		}
	}

	public static transient int[] removeAll(int ai[], int ai1[])
	{
		if(ai == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		if(ai1 != null && ai1.length != 0)
	//*   4    6:aload_1         
	//*   5    7:ifnull          149
	//*   6   10:aload_1         
	//*   7   11:arraylength     
	//*   8   12:ifne            18
	//*   9   15:goto            149
		{
			int ai2[] = new int[ai.length];
	//   10   18:aload_0         
	//   11   19:arraylength     
	//   12   20:newarray        int[]
	//   13   22:astore          7
			int i = ai1.length;
	//   14   24:aload_1         
	//   15   25:arraylength     
	//   16   26:istore_2        
			int l = 0;
	//   17   27:iconst_0        
	//   18   28:istore_3        
			int i1;
			if(i == 1)
	//*  19   29:iload_2         
	//*  20   30:iconst_1        
	//*  21   31:icmpne          88
			{
				int j1 = ai.length;
	//   22   34:aload_0         
	//   23   35:arraylength     
	//   24   36:istore          5
				l = 0;
	//   25   38:iconst_0        
	//   26   39:istore_3        
				int j = 0;
	//   27   40:iconst_0        
	//   28   41:istore_2        
				do
				{
					i1 = j;
	//   29   42:iload_2         
	//   30   43:istore          4
					if(l >= j1)
						break;
	//   31   45:iload_3         
	//   32   46:iload           5
	//   33   48:icmpge          141
					int l1 = ai[l];
	//   34   51:aload_0         
	//   35   52:iload_3         
	//   36   53:iaload          
	//   37   54:istore          6
					i1 = j;
	//   38   56:iload_2         
	//   39   57:istore          4
					if(ai1[0] != l1)
	//*  40   59:aload_1         
	//*  41   60:iconst_0        
	//*  42   61:iaload          
	//*  43   62:iload           6
	//*  44   64:icmpeq          78
					{
						ai2[j] = l1;
	//   45   67:aload           7
	//   46   69:iload_2         
	//   47   70:iload           6
	//   48   72:iastore         
						i1 = j + 1;
	//   49   73:iload_2         
	//   50   74:iconst_1        
	//   51   75:iadd            
	//   52   76:istore          4
					}
					l++;
	//   53   78:iload_3         
	//   54   79:iconst_1        
	//   55   80:iadd            
	//   56   81:istore_3        
					j = i1;
	//   57   82:iload           4
	//   58   84:istore_2        
				} while(true);
	//   59   85:goto            42
			} else
			{
				int k1 = ai.length;
	//   60   88:aload_0         
	//   61   89:arraylength     
	//   62   90:istore          5
				int k = 0;
	//   63   92:iconst_0        
	//   64   93:istore_2        
				do
				{
					i1 = k;
	//   65   94:iload_2         
	//   66   95:istore          4
					if(l >= k1)
						break;
	//   67   97:iload_3         
	//   68   98:iload           5
	//   69  100:icmpge          141
					int i2 = ai[l];
	//   70  103:aload_0         
	//   71  104:iload_3         
	//   72  105:iaload          
	//   73  106:istore          6
					i1 = k;
	//   74  108:iload_2         
	//   75  109:istore          4
					if(!contains(ai1, i2))
	//*  76  111:aload_1         
	//*  77  112:iload           6
	//*  78  114:invokestatic    #151 <Method boolean contains(int[], int)>
	//*  79  117:ifne            131
					{
						ai2[k] = i2;
	//   80  120:aload           7
	//   81  122:iload_2         
	//   82  123:iload           6
	//   83  125:iastore         
						i1 = k + 1;
	//   84  126:iload_2         
	//   85  127:iconst_1        
	//   86  128:iadd            
	//   87  129:istore          4
					}
					l++;
	//   88  131:iload_3         
	//   89  132:iconst_1        
	//   90  133:iadd            
	//   91  134:istore_3        
					k = i1;
	//   92  135:iload           4
	//   93  137:istore_2        
				} while(true);
	//   94  138:goto            94
			}
			return resize(ai2, i1);
	//   95  141:aload           7
	//   96  143:iload           4
	//   97  145:invokestatic    #154 <Method int[] resize(int[], int)>
	//   98  148:areturn         
		} else
		{
			return Arrays.copyOf(ai, ai.length);
	//   99  149:aload_0         
	//  100  150:aload_0         
	//  101  151:arraylength     
	//  102  152:invokestatic    #20  <Method int[] Arrays.copyOf(int[], int)>
	//  103  155:areturn         
		}
	}

	public static transient Object[] removeAll(Object aobj[], Object aobj1[])
	{
		if(aobj == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		if(aobj1 != null && aobj1.length != 0)
	//*   4    6:aload_1         
	//*   5    7:ifnull          164
	//*   6   10:aload_1         
	//*   7   11:arraylength     
	//*   8   12:ifne            18
	//*   9   15:goto            164
		{
			Object aobj2[] = (Object[])Array.newInstance(((Object) (aobj1)).getClass().getComponentType(), aobj.length);
	//   10   18:aload_1         
	//   11   19:invokevirtual   #32  <Method Class Object.getClass()>
	//   12   22:invokevirtual   #160 <Method Class Class.getComponentType()>
	//   13   25:aload_0         
	//   14   26:arraylength     
	//   15   27:invokestatic    #38  <Method Object Array.newInstance(Class, int)>
	//   16   30:checkcast       #40  <Class Object[]>
	//   17   33:astore          6
			int i = aobj1.length;
	//   18   35:aload_1         
	//   19   36:arraylength     
	//   20   37:istore_2        
			int i1 = 0;
	//   21   38:iconst_0        
	//   22   39:istore          4
			int l;
			if(i == 1)
	//*  23   41:iload_2         
	//*  24   42:iconst_1        
	//*  25   43:icmpne          104
			{
				int j1 = aobj.length;
	//   26   46:aload_0         
	//   27   47:arraylength     
	//   28   48:istore          5
				i1 = 0;
	//   29   50:iconst_0        
	//   30   51:istore          4
				int j = 0;
	//   31   53:iconst_0        
	//   32   54:istore_2        
				do
				{
					l = j;
	//   33   55:iload_2         
	//   34   56:istore_3        
					if(i1 >= j1)
						break;
	//   35   57:iload           4
	//   36   59:iload           5
	//   37   61:icmpge          157
					Object obj = aobj[i1];
	//   38   64:aload_0         
	//   39   65:iload           4
	//   40   67:aaload          
	//   41   68:astore          7
					l = j;
	//   42   70:iload_2         
	//   43   71:istore_3        
					if(!Objects.equal(aobj1[0], obj))
	//*  44   72:aload_1         
	//*  45   73:iconst_0        
	//*  46   74:aaload          
	//*  47   75:aload           7
	//*  48   77:invokestatic    #131 <Method boolean Objects.equal(Object, Object)>
	//*  49   80:ifne            93
					{
						aobj2[j] = obj;
	//   50   83:aload           6
	//   51   85:iload_2         
	//   52   86:aload           7
	//   53   88:aastore         
						l = j + 1;
	//   54   89:iload_2         
	//   55   90:iconst_1        
	//   56   91:iadd            
	//   57   92:istore_3        
					}
					i1++;
	//   58   93:iload           4
	//   59   95:iconst_1        
	//   60   96:iadd            
	//   61   97:istore          4
					j = l;
	//   62   99:iload_3         
	//   63  100:istore_2        
				} while(true);
	//   64  101:goto            55
			} else
			{
				int k1 = aobj.length;
	//   65  104:aload_0         
	//   66  105:arraylength     
	//   67  106:istore          5
				int k = 0;
	//   68  108:iconst_0        
	//   69  109:istore_2        
				do
				{
					l = k;
	//   70  110:iload_2         
	//   71  111:istore_3        
					if(i1 >= k1)
						break;
	//   72  112:iload           4
	//   73  114:iload           5
	//   74  116:icmpge          157
					Object obj1 = aobj[i1];
	//   75  119:aload_0         
	//   76  120:iload           4
	//   77  122:aaload          
	//   78  123:astore          7
					l = k;
	//   79  125:iload_2         
	//   80  126:istore_3        
					if(!contains(aobj1, obj1))
	//*  81  127:aload_1         
	//*  82  128:aload           7
	//*  83  130:invokestatic    #162 <Method boolean contains(Object[], Object)>
	//*  84  133:ifne            146
					{
						aobj2[k] = obj1;
	//   85  136:aload           6
	//   86  138:iload_2         
	//   87  139:aload           7
	//   88  141:aastore         
						l = k + 1;
	//   89  142:iload_2         
	//   90  143:iconst_1        
	//   91  144:iadd            
	//   92  145:istore_3        
					}
					i1++;
	//   93  146:iload           4
	//   94  148:iconst_1        
	//   95  149:iadd            
	//   96  150:istore          4
					k = l;
	//   97  152:iload_3         
	//   98  153:istore_2        
				} while(true);
	//   99  154:goto            110
			}
			return resize(aobj2, l);
	//  100  157:aload           6
	//  101  159:iload_3         
	//  102  160:invokestatic    #164 <Method Object[] resize(Object[], int)>
	//  103  163:areturn         
		} else
		{
			return Arrays.copyOf(aobj, aobj.length);
	//  104  164:aload_0         
	//  105  165:aload_0         
	//  106  166:arraylength     
	//  107  167:invokestatic    #43  <Method Object[] Arrays.copyOf(Object[], int)>
	//  108  170:areturn         
		}
	}

	public static int[] resize(int ai[], int i)
	{
		if(ai == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		int ai1[] = ai;
	//    4    6:aload_0         
	//    5    7:astore_2        
		if(i != ai.length)
	//*   6    8:iload_1         
	//*   7    9:aload_0         
	//*   8   10:arraylength     
	//*   9   11:icmpeq          20
			ai1 = Arrays.copyOf(ai, i);
	//   10   14:aload_0         
	//   11   15:iload_1         
	//   12   16:invokestatic    #20  <Method int[] Arrays.copyOf(int[], int)>
	//   13   19:astore_2        
		return ai1;
	//   14   20:aload_2         
	//   15   21:areturn         
	}

	public static Object[] resize(Object aobj[], int i)
	{
		if(aobj == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		Object aobj1[] = aobj;
	//    4    6:aload_0         
	//    5    7:astore_2        
		if(i != aobj.length)
	//*   6    8:iload_1         
	//*   7    9:aload_0         
	//*   8   10:arraylength     
	//*   9   11:icmpeq          20
			aobj1 = Arrays.copyOf(aobj, i);
	//   10   14:aload_0         
	//   11   15:iload_1         
	//   12   16:invokestatic    #43  <Method Object[] Arrays.copyOf(Object[], int)>
	//   13   19:astore_2        
		return aobj1;
	//   14   20:aload_2         
	//   15   21:areturn         
	}

	public static ArrayList toArrayList(Collection collection)
	{
		if(collection == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		else
			return new ArrayList(collection);
	//    4    6:new             #136 <Class ArrayList>
	//    5    9:dup             
	//    6   10:aload_0         
	//    7   11:invokespecial   #171 <Method void ArrayList(Collection)>
	//    8   14:areturn         
	}

	public static ArrayList toArrayList(Object aobj[])
	{
		int j = aobj.length;
	//    0    0:aload_0         
	//    1    1:arraylength     
	//    2    2:istore_2        
		ArrayList arraylist = new ArrayList(j);
	//    3    3:new             #136 <Class ArrayList>
	//    4    6:dup             
	//    5    7:iload_2         
	//    6    8:invokespecial   #174 <Method void ArrayList(int)>
	//    7   11:astore_3        
		for(int i = 0; i < j; i++)
	//*   8   12:iconst_0        
	//*   9   13:istore_1        
	//*  10   14:iload_1         
	//*  11   15:iload_2         
	//*  12   16:icmpge          34
			arraylist.add(aobj[i]);
	//   13   19:aload_3         
	//   14   20:aload_0         
	//   15   21:iload_1         
	//   16   22:aaload          
	//   17   23:invokevirtual   #177 <Method boolean ArrayList.add(Object)>
	//   18   26:pop             

	//   19   27:iload_1         
	//   20   28:iconst_1        
	//   21   29:iadd            
	//   22   30:istore_1        
	//*  23   31:goto            14
		return arraylist;
	//   24   34:aload_3         
	//   25   35:areturn         
	}

	public static long[] toLongArray(Collection collection)
	{
		int i = 0;
	//    0    0:iconst_0        
	//    1    1:istore_1        
		if(collection != null && collection.size() != 0)
	//*   2    2:aload_0         
	//*   3    3:ifnull          67
	//*   4    6:aload_0         
	//*   5    7:invokeinterface #184 <Method int Collection.size()>
	//*   6   12:ifne            18
	//*   7   15:goto            67
		{
			long al[] = new long[collection.size()];
	//    8   18:aload_0         
	//    9   19:invokeinterface #184 <Method int Collection.size()>
	//   10   24:newarray        long[]
	//   11   26:astore_2        
			for(collection = ((Collection) (collection.iterator())); ((Iterator) (collection)).hasNext();)
	//*  12   27:aload_0         
	//*  13   28:invokeinterface #109 <Method Iterator Collection.iterator()>
	//*  14   33:astore_0        
	//*  15   34:aload_0         
	//*  16   35:invokeinterface #115 <Method boolean Iterator.hasNext()>
	//*  17   40:ifeq            65
			{
				al[i] = ((Long)((Iterator) (collection)).next()).longValue();
	//   18   43:aload_2         
	//   19   44:iload_1         
	//   20   45:aload_0         
	//   21   46:invokeinterface #119 <Method Object Iterator.next()>
	//   22   51:checkcast       #186 <Class Long>
	//   23   54:invokevirtual   #190 <Method long Long.longValue()>
	//   24   57:lastore         
				i++;
	//   25   58:iload_1         
	//   26   59:iconst_1        
	//   27   60:iadd            
	//   28   61:istore_1        
			}

	//*  29   62:goto            34
			return al;
	//   30   65:aload_2         
	//   31   66:areturn         
		} else
		{
			return new long[0];
	//   32   67:iconst_0        
	//   33   68:newarray        long[]
	//   34   70:areturn         
		}
	}

	public static long[] toLongArray(Long along[])
	{
		int i = 0;
	//    0    0:iconst_0        
	//    1    1:istore_1        
		if(along == null)
	//*   2    2:aload_0         
	//*   3    3:ifnonnull       10
			return new long[0];
	//    4    6:iconst_0        
	//    5    7:newarray        long[]
	//    6    9:areturn         
		long al[] = new long[along.length];
	//    7   10:aload_0         
	//    8   11:arraylength     
	//    9   12:newarray        long[]
	//   10   14:astore_2        
		for(; i < along.length; i++)
	//*  11   15:iload_1         
	//*  12   16:aload_0         
	//*  13   17:arraylength     
	//*  14   18:icmpge          37
			al[i] = along[i].longValue();
	//   15   21:aload_2         
	//   16   22:iload_1         
	//   17   23:aload_0         
	//   18   24:iload_1         
	//   19   25:aaload          
	//   20   26:invokevirtual   #190 <Method long Long.longValue()>
	//   21   29:lastore         

	//   22   30:iload_1         
	//   23   31:iconst_1        
	//   24   32:iadd            
	//   25   33:istore_1        
	//*  26   34:goto            15
		return al;
	//   27   37:aload_2         
	//   28   38:areturn         
	}

	public static int[] toPrimitiveArray(Collection collection)
	{
		int i = 0;
	//    0    0:iconst_0        
	//    1    1:istore_1        
		if(collection != null && collection.size() != 0)
	//*   2    2:aload_0         
	//*   3    3:ifnull          67
	//*   4    6:aload_0         
	//*   5    7:invokeinterface #184 <Method int Collection.size()>
	//*   6   12:ifne            18
	//*   7   15:goto            67
		{
			int ai[] = new int[collection.size()];
	//    8   18:aload_0         
	//    9   19:invokeinterface #184 <Method int Collection.size()>
	//   10   24:newarray        int[]
	//   11   26:astore_2        
			for(collection = ((Collection) (collection.iterator())); ((Iterator) (collection)).hasNext();)
	//*  12   27:aload_0         
	//*  13   28:invokeinterface #109 <Method Iterator Collection.iterator()>
	//*  14   33:astore_0        
	//*  15   34:aload_0         
	//*  16   35:invokeinterface #115 <Method boolean Iterator.hasNext()>
	//*  17   40:ifeq            65
			{
				ai[i] = ((Integer)((Iterator) (collection)).next()).intValue();
	//   18   43:aload_2         
	//   19   44:iload_1         
	//   20   45:aload_0         
	//   21   46:invokeinterface #119 <Method Object Iterator.next()>
	//   22   51:checkcast       #196 <Class Integer>
	//   23   54:invokevirtual   #199 <Method int Integer.intValue()>
	//   24   57:iastore         
				i++;
	//   25   58:iload_1         
	//   26   59:iconst_1        
	//   27   60:iadd            
	//   28   61:istore_1        
			}

	//*  29   62:goto            34
			return ai;
	//   30   65:aload_2         
	//   31   66:areturn         
		} else
		{
			return new int[0];
	//   32   67:iconst_0        
	//   33   68:newarray        int[]
	//   34   70:areturn         
		}
	}

	public static int[] toPrimitiveArray(Integer ainteger[])
	{
		int i = 0;
	//    0    0:iconst_0        
	//    1    1:istore_1        
		if(ainteger == null)
	//*   2    2:aload_0         
	//*   3    3:ifnonnull       10
			return new int[0];
	//    4    6:iconst_0        
	//    5    7:newarray        int[]
	//    6    9:areturn         
		int ai[] = new int[ainteger.length];
	//    7   10:aload_0         
	//    8   11:arraylength     
	//    9   12:newarray        int[]
	//   10   14:astore_2        
		for(; i < ainteger.length; i++)
	//*  11   15:iload_1         
	//*  12   16:aload_0         
	//*  13   17:arraylength     
	//*  14   18:icmpge          37
			ai[i] = ainteger[i].intValue();
	//   15   21:aload_2         
	//   16   22:iload_1         
	//   17   23:aload_0         
	//   18   24:iload_1         
	//   19   25:aaload          
	//   20   26:invokevirtual   #199 <Method int Integer.intValue()>
	//   21   29:iastore         

	//   22   30:iload_1         
	//   23   31:iconst_1        
	//   24   32:iadd            
	//   25   33:istore_1        
	//*  26   34:goto            15
		return ai;
	//   27   37:aload_2         
	//   28   38:areturn         
	}

	public static String[] toStringArray(Collection collection)
	{
		if(collection != null && collection.size() != 0)
	//*   0    0:aload_0         
	//*   1    1:ifnull          35
	//*   2    4:aload_0         
	//*   3    5:invokeinterface #184 <Method int Collection.size()>
	//*   4   10:ifne            16
	//*   5   13:goto            35
			return (String[])collection.toArray(((Object []) (new String[collection.size()])));
	//    6   16:aload_0         
	//    7   17:aload_0         
	//    8   18:invokeinterface #184 <Method int Collection.size()>
	//    9   23:anewarray       String[]
	//   10   26:invokeinterface #207 <Method Object[] Collection.toArray(Object[])>
	//   11   31:checkcast       #209 <Class String[]>
	//   12   34:areturn         
		else
			return new String[0];
	//   13   35:iconst_0        
	//   14   36:anewarray       String[]
	//   15   39:areturn         
	}

	public static Boolean[] toWrapperArray(boolean aflag[])
	{
		if(aflag == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		int j = aflag.length;
	//    4    6:aload_0         
	//    5    7:arraylength     
	//    6    8:istore_2        
		Boolean aboolean[] = new Boolean[j];
	//    7    9:iload_2         
	//    8   10:anewarray       Boolean[]
	//    9   13:astore_3        
		for(int i = 0; i < j; i++)
	//*  10   14:iconst_0        
	//*  11   15:istore_1        
	//*  12   16:iload_1         
	//*  13   17:iload_2         
	//*  14   18:icmpge          37
			aboolean[i] = Boolean.valueOf(aflag[i]);
	//   15   21:aload_3         
	//   16   22:iload_1         
	//   17   23:aload_0         
	//   18   24:iload_1         
	//   19   25:baload          
	//   20   26:invokestatic    #218 <Method Boolean Boolean.valueOf(boolean)>
	//   21   29:aastore         

	//   22   30:iload_1         
	//   23   31:iconst_1        
	//   24   32:iadd            
	//   25   33:istore_1        
	//*  26   34:goto            16
		return aboolean;
	//   27   37:aload_3         
	//   28   38:areturn         
	}

	public static Byte[] toWrapperArray(byte abyte0[])
	{
		if(abyte0 == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		int j = abyte0.length;
	//    4    6:aload_0         
	//    5    7:arraylength     
	//    6    8:istore_2        
		Byte abyte[] = new Byte[j];
	//    7    9:iload_2         
	//    8   10:anewarray       Byte[]
	//    9   13:astore_3        
		for(int i = 0; i < j; i++)
	//*  10   14:iconst_0        
	//*  11   15:istore_1        
	//*  12   16:iload_1         
	//*  13   17:iload_2         
	//*  14   18:icmpge          37
			abyte[i] = Byte.valueOf(abyte0[i]);
	//   15   21:aload_3         
	//   16   22:iload_1         
	//   17   23:aload_0         
	//   18   24:iload_1         
	//   19   25:baload          
	//   20   26:invokestatic    #224 <Method Byte Byte.valueOf(byte)>
	//   21   29:aastore         

	//   22   30:iload_1         
	//   23   31:iconst_1        
	//   24   32:iadd            
	//   25   33:istore_1        
	//*  26   34:goto            16
		return abyte;
	//   27   37:aload_3         
	//   28   38:areturn         
	}

	public static Character[] toWrapperArray(char ac[])
	{
		if(ac == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		int j = ac.length;
	//    4    6:aload_0         
	//    5    7:arraylength     
	//    6    8:istore_2        
		Character acharacter[] = new Character[j];
	//    7    9:iload_2         
	//    8   10:anewarray       Character[]
	//    9   13:astore_3        
		for(int i = 0; i < j; i++)
	//*  10   14:iconst_0        
	//*  11   15:istore_1        
	//*  12   16:iload_1         
	//*  13   17:iload_2         
	//*  14   18:icmpge          37
			acharacter[i] = Character.valueOf(ac[i]);
	//   15   21:aload_3         
	//   16   22:iload_1         
	//   17   23:aload_0         
	//   18   24:iload_1         
	//   19   25:caload          
	//   20   26:invokestatic    #230 <Method Character Character.valueOf(char)>
	//   21   29:aastore         

	//   22   30:iload_1         
	//   23   31:iconst_1        
	//   24   32:iadd            
	//   25   33:istore_1        
	//*  26   34:goto            16
		return acharacter;
	//   27   37:aload_3         
	//   28   38:areturn         
	}

	public static Double[] toWrapperArray(double ad[])
	{
		if(ad == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		int j = ad.length;
	//    4    6:aload_0         
	//    5    7:arraylength     
	//    6    8:istore_2        
		Double adouble[] = new Double[j];
	//    7    9:iload_2         
	//    8   10:anewarray       Double[]
	//    9   13:astore_3        
		for(int i = 0; i < j; i++)
	//*  10   14:iconst_0        
	//*  11   15:istore_1        
	//*  12   16:iload_1         
	//*  13   17:iload_2         
	//*  14   18:icmpge          37
			adouble[i] = Double.valueOf(ad[i]);
	//   15   21:aload_3         
	//   16   22:iload_1         
	//   17   23:aload_0         
	//   18   24:iload_1         
	//   19   25:daload          
	//   20   26:invokestatic    #236 <Method Double Double.valueOf(double)>
	//   21   29:aastore         

	//   22   30:iload_1         
	//   23   31:iconst_1        
	//   24   32:iadd            
	//   25   33:istore_1        
	//*  26   34:goto            16
		return adouble;
	//   27   37:aload_3         
	//   28   38:areturn         
	}

	public static Float[] toWrapperArray(float af[])
	{
		if(af == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		int j = af.length;
	//    4    6:aload_0         
	//    5    7:arraylength     
	//    6    8:istore_2        
		Float afloat[] = new Float[j];
	//    7    9:iload_2         
	//    8   10:anewarray       Float[]
	//    9   13:astore_3        
		for(int i = 0; i < j; i++)
	//*  10   14:iconst_0        
	//*  11   15:istore_1        
	//*  12   16:iload_1         
	//*  13   17:iload_2         
	//*  14   18:icmpge          37
			afloat[i] = Float.valueOf(af[i]);
	//   15   21:aload_3         
	//   16   22:iload_1         
	//   17   23:aload_0         
	//   18   24:iload_1         
	//   19   25:faload          
	//   20   26:invokestatic    #242 <Method Float Float.valueOf(float)>
	//   21   29:aastore         

	//   22   30:iload_1         
	//   23   31:iconst_1        
	//   24   32:iadd            
	//   25   33:istore_1        
	//*  26   34:goto            16
		return afloat;
	//   27   37:aload_3         
	//   28   38:areturn         
	}

	public static Integer[] toWrapperArray(int ai[])
	{
		if(ai == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		int j = ai.length;
	//    4    6:aload_0         
	//    5    7:arraylength     
	//    6    8:istore_2        
		Integer ainteger[] = new Integer[j];
	//    7    9:iload_2         
	//    8   10:anewarray       Integer[]
	//    9   13:astore_3        
		for(int i = 0; i < j; i++)
	//*  10   14:iconst_0        
	//*  11   15:istore_1        
	//*  12   16:iload_1         
	//*  13   17:iload_2         
	//*  14   18:icmpge          37
			ainteger[i] = Integer.valueOf(ai[i]);
	//   15   21:aload_3         
	//   16   22:iload_1         
	//   17   23:aload_0         
	//   18   24:iload_1         
	//   19   25:iaload          
	//   20   26:invokestatic    #246 <Method Integer Integer.valueOf(int)>
	//   21   29:aastore         

	//   22   30:iload_1         
	//   23   31:iconst_1        
	//   24   32:iadd            
	//   25   33:istore_1        
	//*  26   34:goto            16
		return ainteger;
	//   27   37:aload_3         
	//   28   38:areturn         
	}

	public static Long[] toWrapperArray(long al[])
	{
		if(al == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		int j = al.length;
	//    4    6:aload_0         
	//    5    7:arraylength     
	//    6    8:istore_2        
		Long along[] = new Long[j];
	//    7    9:iload_2         
	//    8   10:anewarray       Long[]
	//    9   13:astore_3        
		for(int i = 0; i < j; i++)
	//*  10   14:iconst_0        
	//*  11   15:istore_1        
	//*  12   16:iload_1         
	//*  13   17:iload_2         
	//*  14   18:icmpge          37
			along[i] = Long.valueOf(al[i]);
	//   15   21:aload_3         
	//   16   22:iload_1         
	//   17   23:aload_0         
	//   18   24:iload_1         
	//   19   25:laload          
	//   20   26:invokestatic    #250 <Method Long Long.valueOf(long)>
	//   21   29:aastore         

	//   22   30:iload_1         
	//   23   31:iconst_1        
	//   24   32:iadd            
	//   25   33:istore_1        
	//*  26   34:goto            16
		return along;
	//   27   37:aload_3         
	//   28   38:areturn         
	}

	public static Short[] toWrapperArray(short aword0[])
	{
		if(aword0 == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		int j = aword0.length;
	//    4    6:aload_0         
	//    5    7:arraylength     
	//    6    8:istore_2        
		Short ashort[] = new Short[j];
	//    7    9:iload_2         
	//    8   10:anewarray       Short[]
	//    9   13:astore_3        
		for(int i = 0; i < j; i++)
	//*  10   14:iconst_0        
	//*  11   15:istore_1        
	//*  12   16:iload_1         
	//*  13   17:iload_2         
	//*  14   18:icmpge          37
			ashort[i] = Short.valueOf(aword0[i]);
	//   15   21:aload_3         
	//   16   22:iload_1         
	//   17   23:aload_0         
	//   18   24:iload_1         
	//   19   25:saload          
	//   20   26:invokestatic    #256 <Method Short Short.valueOf(short)>
	//   21   29:aastore         

	//   22   30:iload_1         
	//   23   31:iconst_1        
	//   24   32:iadd            
	//   25   33:istore_1        
	//*  26   34:goto            16
		return ashort;
	//   27   37:aload_3         
	//   28   38:areturn         
	}

	public static void writeArray(StringBuilder stringbuilder, double ad[])
	{
		int j = ad.length;
	//    0    0:aload_1         
	//    1    1:arraylength     
	//    2    2:istore_3        
		for(int i = 0; i < j; i++)
	//*   3    3:iconst_0        
	//*   4    4:istore_2        
	//*   5    5:iload_2         
	//*   6    6:iload_3         
	//*   7    7:icmpge          40
		{
			if(i != 0)
	//*   8   10:iload_2         
	//*   9   11:ifeq            22
				stringbuilder.append(",");
	//   10   14:aload_0         
	//   11   15:ldc2            #260 <String ",">
	//   12   18:invokevirtual   #266 <Method StringBuilder StringBuilder.append(String)>
	//   13   21:pop             
			stringbuilder.append(Double.toString(ad[i]));
	//   14   22:aload_0         
	//   15   23:aload_1         
	//   16   24:iload_2         
	//   17   25:daload          
	//   18   26:invokestatic    #270 <Method String Double.toString(double)>
	//   19   29:invokevirtual   #266 <Method StringBuilder StringBuilder.append(String)>
	//   20   32:pop             
		}

	//   21   33:iload_2         
	//   22   34:iconst_1        
	//   23   35:iadd            
	//   24   36:istore_2        
	//*  25   37:goto            5
	//   26   40:return          
	}

	public static void writeArray(StringBuilder stringbuilder, float af[])
	{
		int j = af.length;
	//    0    0:aload_1         
	//    1    1:arraylength     
	//    2    2:istore_3        
		for(int i = 0; i < j; i++)
	//*   3    3:iconst_0        
	//*   4    4:istore_2        
	//*   5    5:iload_2         
	//*   6    6:iload_3         
	//*   7    7:icmpge          40
		{
			if(i != 0)
	//*   8   10:iload_2         
	//*   9   11:ifeq            22
				stringbuilder.append(",");
	//   10   14:aload_0         
	//   11   15:ldc2            #260 <String ",">
	//   12   18:invokevirtual   #266 <Method StringBuilder StringBuilder.append(String)>
	//   13   21:pop             
			stringbuilder.append(Float.toString(af[i]));
	//   14   22:aload_0         
	//   15   23:aload_1         
	//   16   24:iload_2         
	//   17   25:faload          
	//   18   26:invokestatic    #274 <Method String Float.toString(float)>
	//   19   29:invokevirtual   #266 <Method StringBuilder StringBuilder.append(String)>
	//   20   32:pop             
		}

	//   21   33:iload_2         
	//   22   34:iconst_1        
	//   23   35:iadd            
	//   24   36:istore_2        
	//*  25   37:goto            5
	//   26   40:return          
	}

	public static void writeArray(StringBuilder stringbuilder, int ai[])
	{
		int j = ai.length;
	//    0    0:aload_1         
	//    1    1:arraylength     
	//    2    2:istore_3        
		for(int i = 0; i < j; i++)
	//*   3    3:iconst_0        
	//*   4    4:istore_2        
	//*   5    5:iload_2         
	//*   6    6:iload_3         
	//*   7    7:icmpge          40
		{
			if(i != 0)
	//*   8   10:iload_2         
	//*   9   11:ifeq            22
				stringbuilder.append(",");
	//   10   14:aload_0         
	//   11   15:ldc2            #260 <String ",">
	//   12   18:invokevirtual   #266 <Method StringBuilder StringBuilder.append(String)>
	//   13   21:pop             
			stringbuilder.append(Integer.toString(ai[i]));
	//   14   22:aload_0         
	//   15   23:aload_1         
	//   16   24:iload_2         
	//   17   25:iaload          
	//   18   26:invokestatic    #278 <Method String Integer.toString(int)>
	//   19   29:invokevirtual   #266 <Method StringBuilder StringBuilder.append(String)>
	//   20   32:pop             
		}

	//   21   33:iload_2         
	//   22   34:iconst_1        
	//   23   35:iadd            
	//   24   36:istore_2        
	//*  25   37:goto            5
	//   26   40:return          
	}

	public static void writeArray(StringBuilder stringbuilder, long al[])
	{
		int j = al.length;
	//    0    0:aload_1         
	//    1    1:arraylength     
	//    2    2:istore_3        
		for(int i = 0; i < j; i++)
	//*   3    3:iconst_0        
	//*   4    4:istore_2        
	//*   5    5:iload_2         
	//*   6    6:iload_3         
	//*   7    7:icmpge          40
		{
			if(i != 0)
	//*   8   10:iload_2         
	//*   9   11:ifeq            22
				stringbuilder.append(",");
	//   10   14:aload_0         
	//   11   15:ldc2            #260 <String ",">
	//   12   18:invokevirtual   #266 <Method StringBuilder StringBuilder.append(String)>
	//   13   21:pop             
			stringbuilder.append(Long.toString(al[i]));
	//   14   22:aload_0         
	//   15   23:aload_1         
	//   16   24:iload_2         
	//   17   25:laload          
	//   18   26:invokestatic    #282 <Method String Long.toString(long)>
	//   19   29:invokevirtual   #266 <Method StringBuilder StringBuilder.append(String)>
	//   20   32:pop             
		}

	//   21   33:iload_2         
	//   22   34:iconst_1        
	//   23   35:iadd            
	//   24   36:istore_2        
	//*  25   37:goto            5
	//   26   40:return          
	}

	public static void writeArray(StringBuilder stringbuilder, Object aobj[])
	{
		int j = aobj.length;
	//    0    0:aload_1         
	//    1    1:arraylength     
	//    2    2:istore_3        
		for(int i = 0; i < j; i++)
	//*   3    3:iconst_0        
	//*   4    4:istore_2        
	//*   5    5:iload_2         
	//*   6    6:iload_3         
	//*   7    7:icmpge          40
		{
			if(i != 0)
	//*   8   10:iload_2         
	//*   9   11:ifeq            22
				stringbuilder.append(",");
	//   10   14:aload_0         
	//   11   15:ldc2            #260 <String ",">
	//   12   18:invokevirtual   #266 <Method StringBuilder StringBuilder.append(String)>
	//   13   21:pop             
			stringbuilder.append(aobj[i].toString());
	//   14   22:aload_0         
	//   15   23:aload_1         
	//   16   24:iload_2         
	//   17   25:aaload          
	//   18   26:invokevirtual   #286 <Method String Object.toString()>
	//   19   29:invokevirtual   #266 <Method StringBuilder StringBuilder.append(String)>
	//   20   32:pop             
		}

	//   21   33:iload_2         
	//   22   34:iconst_1        
	//   23   35:iadd            
	//   24   36:istore_2        
	//*  25   37:goto            5
	//   26   40:return          
	}

	public static void writeArray(StringBuilder stringbuilder, boolean aflag[])
	{
		int j = aflag.length;
	//    0    0:aload_1         
	//    1    1:arraylength     
	//    2    2:istore_3        
		for(int i = 0; i < j; i++)
	//*   3    3:iconst_0        
	//*   4    4:istore_2        
	//*   5    5:iload_2         
	//*   6    6:iload_3         
	//*   7    7:icmpge          40
		{
			if(i != 0)
	//*   8   10:iload_2         
	//*   9   11:ifeq            22
				stringbuilder.append(",");
	//   10   14:aload_0         
	//   11   15:ldc2            #260 <String ",">
	//   12   18:invokevirtual   #266 <Method StringBuilder StringBuilder.append(String)>
	//   13   21:pop             
			stringbuilder.append(Boolean.toString(aflag[i]));
	//   14   22:aload_0         
	//   15   23:aload_1         
	//   16   24:iload_2         
	//   17   25:baload          
	//   18   26:invokestatic    #291 <Method String Boolean.toString(boolean)>
	//   19   29:invokevirtual   #266 <Method StringBuilder StringBuilder.append(String)>
	//   20   32:pop             
		}

	//   21   33:iload_2         
	//   22   34:iconst_1        
	//   23   35:iadd            
	//   24   36:istore_2        
	//*  25   37:goto            5
	//   26   40:return          
	}

	public static void writeStringArray(StringBuilder stringbuilder, String as[])
	{
		int j = as.length;
	//    0    0:aload_1         
	//    1    1:arraylength     
	//    2    2:istore_3        
		for(int i = 0; i < j; i++)
	//*   3    3:iconst_0        
	//*   4    4:istore_2        
	//*   5    5:iload_2         
	//*   6    6:iload_3         
	//*   7    7:icmpge          53
		{
			if(i != 0)
	//*   8   10:iload_2         
	//*   9   11:ifeq            22
				stringbuilder.append(",");
	//   10   14:aload_0         
	//   11   15:ldc2            #260 <String ",">
	//   12   18:invokevirtual   #266 <Method StringBuilder StringBuilder.append(String)>
	//   13   21:pop             
			stringbuilder.append("\"");
	//   14   22:aload_0         
	//   15   23:ldc2            #295 <String "\"">
	//   16   26:invokevirtual   #266 <Method StringBuilder StringBuilder.append(String)>
	//   17   29:pop             
			stringbuilder.append(as[i]);
	//   18   30:aload_0         
	//   19   31:aload_1         
	//   20   32:iload_2         
	//   21   33:aaload          
	//   22   34:invokevirtual   #266 <Method StringBuilder StringBuilder.append(String)>
	//   23   37:pop             
			stringbuilder.append("\"");
	//   24   38:aload_0         
	//   25   39:ldc2            #295 <String "\"">
	//   26   42:invokevirtual   #266 <Method StringBuilder StringBuilder.append(String)>
	//   27   45:pop             
		}

	//   28   46:iload_2         
	//   29   47:iconst_1        
	//   30   48:iadd            
	//   31   49:istore_2        
	//*  32   50:goto            5
	//   33   53:return          
	}
}

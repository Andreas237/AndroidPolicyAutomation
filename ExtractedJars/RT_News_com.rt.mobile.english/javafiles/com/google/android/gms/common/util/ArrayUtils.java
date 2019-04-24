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
	//*   1    1:ifnonnull       18
	//*   2    4:aload_1         
	//*   3    5:ifnonnull       18
			throw new IllegalArgumentException("Cannot generate array of generic type w/o class info");
	//    4    8:new             #23  <Class IllegalArgumentException>
	//    5   11:dup             
	//    6   12:ldc1            #25  <String "Cannot generate array of generic type w/o class info">
	//    7   14:invokespecial   #28  <Method void IllegalArgumentException(String)>
	//    8   17:athrow          
		if(aobj == null)
	//*   9   18:aload_0         
	//*  10   19:ifnonnull       37
			aobj = (Object[])Array.newInstance(obj.getClass(), 1);
	//   11   22:aload_1         
	//   12   23:invokevirtual   #32  <Method Class Object.getClass()>
	//   13   26:iconst_1        
	//   14   27:invokestatic    #38  <Method Object Array.newInstance(Class, int)>
	//   15   30:checkcast       #40  <Class Object[]>
	//   16   33:astore_0        
		else
	//*  17   34:goto            46
			aobj = Arrays.copyOf(aobj, aobj.length + 1);
	//   18   37:aload_0         
	//   19   38:aload_0         
	//   20   39:arraylength     
	//   21   40:iconst_1        
	//   22   41:iadd            
	//   23   42:invokestatic    #43  <Method Object[] Arrays.copyOf(Object[], int)>
	//   24   45:astore_0        
		aobj[aobj.length - 1] = obj;
	//   25   46:aload_0         
	//   26   47:aload_0         
	//   27   48:arraylength     
	//   28   49:iconst_1        
	//   29   50:isub            
	//   30   51:aload_1         
	//   31   52:aastore         
		return aobj;
	//   32   53:aload_0         
	//   33   54:areturn         
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
		int j = i;
	//   11   19:iload_1         
	//   12   20:istore_2        
		for(; i < aobj.length; i++)
	//*  13   21:iload_1         
	//*  14   22:aload_0         
	//*  15   23:arraylength     
	//*  16   24:icmpge          41
			j += aobj[i].length;
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
		Object aobj1[] = Arrays.copyOf(aobj[0], j);
	//   29   41:aload_0         
	//   30   42:iconst_0        
	//   31   43:aaload          
	//   32   44:iload_2         
	//   33   45:invokestatic    #43  <Method Object[] Arrays.copyOf(Object[], int)>
	//   34   48:astore_3        
		Object aobj2[] = aobj[0];
	//   35   49:aload_0         
	//   36   50:iconst_0        
	//   37   51:aaload          
	//   38   52:astore          4
		i = 1;
	//   39   54:iconst_1        
	//   40   55:istore_1        
		j = aobj2.length;
	//   41   56:aload           4
	//   42   58:arraylength     
	//   43   59:istore_2        
		for(; i < aobj.length; i++)
	//*  44   60:iload_1         
	//*  45   61:aload_0         
	//*  46   62:arraylength     
	//*  47   63:icmpge          95
		{
			Object aobj3[] = aobj[i];
	//   48   66:aload_0         
	//   49   67:iload_1         
	//   50   68:aaload          
	//   51   69:astore          4
			System.arraycopy(((Object) (aobj3)), 0, ((Object) (aobj1)), j, aobj3.length);
	//   52   71:aload           4
	//   53   73:iconst_0        
	//   54   74:aload_3         
	//   55   75:iload_2         
	//   56   76:aload           4
	//   57   78:arraylength     
	//   58   79:invokestatic    #53  <Method void System.arraycopy(Object, int, Object, int, int)>
			j += aobj3.length;
	//   59   82:iload_2         
	//   60   83:aload           4
	//   61   85:arraylength     
	//   62   86:iadd            
	//   63   87:istore_2        
		}

	//   64   88:iload_1         
	//   65   89:iconst_1        
	//   66   90:iadd            
	//   67   91:istore_1        
	//*  68   92:goto            60
		return aobj1;
	//   69   95:aload_3         
	//   70   96:areturn         
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
		int j = i;
	//    8   11:iload_1         
	//    9   12:istore_2        
		for(; i < abyte0.length; i++)
	//*  10   13:iload_1         
	//*  11   14:aload_0         
	//*  12   15:arraylength     
	//*  13   16:icmpge          33
			j += abyte0[i].length;
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
		byte abyte1[] = Arrays.copyOf(abyte0[0], j);
	//   26   33:aload_0         
	//   27   34:iconst_0        
	//   28   35:aaload          
	//   29   36:iload_2         
	//   30   37:invokestatic    #59  <Method byte[] Arrays.copyOf(byte[], int)>
	//   31   40:astore_3        
		byte abyte2[] = abyte0[0];
	//   32   41:aload_0         
	//   33   42:iconst_0        
	//   34   43:aaload          
	//   35   44:astore          4
		i = 1;
	//   36   46:iconst_1        
	//   37   47:istore_1        
		j = abyte2.length;
	//   38   48:aload           4
	//   39   50:arraylength     
	//   40   51:istore_2        
		for(; i < abyte0.length; i++)
	//*  41   52:iload_1         
	//*  42   53:aload_0         
	//*  43   54:arraylength     
	//*  44   55:icmpge          87
		{
			byte abyte3[] = abyte0[i];
	//   45   58:aload_0         
	//   46   59:iload_1         
	//   47   60:aaload          
	//   48   61:astore          4
			System.arraycopy(((Object) (abyte3)), 0, ((Object) (abyte1)), j, abyte3.length);
	//   49   63:aload           4
	//   50   65:iconst_0        
	//   51   66:aload_3         
	//   52   67:iload_2         
	//   53   68:aload           4
	//   54   70:arraylength     
	//   55   71:invokestatic    #53  <Method void System.arraycopy(Object, int, Object, int, int)>
			j += abyte3.length;
	//   56   74:iload_2         
	//   57   75:aload           4
	//   58   77:arraylength     
	//   59   78:iadd            
	//   60   79:istore_2        
		}

	//   61   80:iload_1         
	//   62   81:iconst_1        
	//   63   82:iadd            
	//   64   83:istore_1        
	//*  65   84:goto            52
		return abyte1;
	//   66   87:aload_3         
	//   67   88:areturn         
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
	//*   5    7:ifnull          147
	//*   6   10:aload_1         
	//*   7   11:arraylength     
	//*   8   12:ifne            18
	//*   9   15:goto            147
		{
			int k = 0;
	//   10   18:iconst_0        
	//   11   19:istore_3        
			int ai2[] = new int[ai.length];
	//   12   20:aload_0         
	//   13   21:arraylength     
	//   14   22:newarray        int[]
	//   15   24:astore          7
			int l;
			if(ai1.length == 1)
	//*  16   26:aload_1         
	//*  17   27:arraylength     
	//*  18   28:iconst_1        
	//*  19   29:icmpne          86
			{
				int i1 = ai.length;
	//   20   32:aload_0         
	//   21   33:arraylength     
	//   22   34:istore          5
				k = 0;
	//   23   36:iconst_0        
	//   24   37:istore_3        
				int i = k;
	//   25   38:iload_3         
	//   26   39:istore_2        
				do
				{
					l = i;
	//   27   40:iload_2         
	//   28   41:istore          4
					if(k >= i1)
						break;
	//   29   43:iload_3         
	//   30   44:iload           5
	//   31   46:icmpge          139
					int k1 = ai[k];
	//   32   49:aload_0         
	//   33   50:iload_3         
	//   34   51:iaload          
	//   35   52:istore          6
					l = i;
	//   36   54:iload_2         
	//   37   55:istore          4
					if(ai1[0] != k1)
	//*  38   57:aload_1         
	//*  39   58:iconst_0        
	//*  40   59:iaload          
	//*  41   60:iload           6
	//*  42   62:icmpeq          76
					{
						ai2[i] = k1;
	//   43   65:aload           7
	//   44   67:iload_2         
	//   45   68:iload           6
	//   46   70:iastore         
						l = i + 1;
	//   47   71:iload_2         
	//   48   72:iconst_1        
	//   49   73:iadd            
	//   50   74:istore          4
					}
					k++;
	//   51   76:iload_3         
	//   52   77:iconst_1        
	//   53   78:iadd            
	//   54   79:istore_3        
					i = l;
	//   55   80:iload           4
	//   56   82:istore_2        
				} while(true);
	//   57   83:goto            40
			} else
			{
				int j1 = ai.length;
	//   58   86:aload_0         
	//   59   87:arraylength     
	//   60   88:istore          5
				int j = 0;
	//   61   90:iconst_0        
	//   62   91:istore_2        
				do
				{
					l = j;
	//   63   92:iload_2         
	//   64   93:istore          4
					if(k >= j1)
						break;
	//   65   95:iload_3         
	//   66   96:iload           5
	//   67   98:icmpge          139
					int l1 = ai[k];
	//   68  101:aload_0         
	//   69  102:iload_3         
	//   70  103:iaload          
	//   71  104:istore          6
					l = j;
	//   72  106:iload_2         
	//   73  107:istore          4
					if(!contains(ai1, l1))
	//*  74  109:aload_1         
	//*  75  110:iload           6
	//*  76  112:invokestatic    #151 <Method boolean contains(int[], int)>
	//*  77  115:ifne            129
					{
						ai2[j] = l1;
	//   78  118:aload           7
	//   79  120:iload_2         
	//   80  121:iload           6
	//   81  123:iastore         
						l = j + 1;
	//   82  124:iload_2         
	//   83  125:iconst_1        
	//   84  126:iadd            
	//   85  127:istore          4
					}
					k++;
	//   86  129:iload_3         
	//   87  130:iconst_1        
	//   88  131:iadd            
	//   89  132:istore_3        
					j = l;
	//   90  133:iload           4
	//   91  135:istore_2        
				} while(true);
	//   92  136:goto            92
			}
			return resize(ai2, l);
	//   93  139:aload           7
	//   94  141:iload           4
	//   95  143:invokestatic    #154 <Method int[] resize(int[], int)>
	//   96  146:areturn         
		} else
		{
			return Arrays.copyOf(ai, ai.length);
	//   97  147:aload_0         
	//   98  148:aload_0         
	//   99  149:arraylength     
	//  100  150:invokestatic    #20  <Method int[] Arrays.copyOf(int[], int)>
	//  101  153:areturn         
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
	//*   5    7:ifnull          167
	//*   6   10:aload_1         
	//*   7   11:arraylength     
	//*   8   12:ifne            18
	//*   9   15:goto            167
		{
			Class class1 = ((Object) (aobj1)).getClass().getComponentType();
	//   10   18:aload_1         
	//   11   19:invokevirtual   #32  <Method Class Object.getClass()>
	//   12   22:invokevirtual   #160 <Method Class Class.getComponentType()>
	//   13   25:astore          6
			int l = 0;
	//   14   27:iconst_0        
	//   15   28:istore          4
			Object aobj2[] = (Object[])Array.newInstance(class1, aobj.length);
	//   16   30:aload           6
	//   17   32:aload_0         
	//   18   33:arraylength     
	//   19   34:invokestatic    #38  <Method Object Array.newInstance(Class, int)>
	//   20   37:checkcast       #40  <Class Object[]>
	//   21   40:astore          6
			int k;
			if(aobj1.length == 1)
	//*  22   42:aload_1         
	//*  23   43:arraylength     
	//*  24   44:iconst_1        
	//*  25   45:icmpne          107
			{
				int i1 = aobj.length;
	//   26   48:aload_0         
	//   27   49:arraylength     
	//   28   50:istore          5
				l = 0;
	//   29   52:iconst_0        
	//   30   53:istore          4
				int i = l;
	//   31   55:iload           4
	//   32   57:istore_2        
				do
				{
					k = i;
	//   33   58:iload_2         
	//   34   59:istore_3        
					if(l >= i1)
						break;
	//   35   60:iload           4
	//   36   62:iload           5
	//   37   64:icmpge          160
					Object obj = aobj[l];
	//   38   67:aload_0         
	//   39   68:iload           4
	//   40   70:aaload          
	//   41   71:astore          7
					k = i;
	//   42   73:iload_2         
	//   43   74:istore_3        
					if(!Objects.equal(aobj1[0], obj))
	//*  44   75:aload_1         
	//*  45   76:iconst_0        
	//*  46   77:aaload          
	//*  47   78:aload           7
	//*  48   80:invokestatic    #131 <Method boolean Objects.equal(Object, Object)>
	//*  49   83:ifne            96
					{
						aobj2[i] = obj;
	//   50   86:aload           6
	//   51   88:iload_2         
	//   52   89:aload           7
	//   53   91:aastore         
						k = i + 1;
	//   54   92:iload_2         
	//   55   93:iconst_1        
	//   56   94:iadd            
	//   57   95:istore_3        
					}
					l++;
	//   58   96:iload           4
	//   59   98:iconst_1        
	//   60   99:iadd            
	//   61  100:istore          4
					i = k;
	//   62  102:iload_3         
	//   63  103:istore_2        
				} while(true);
	//   64  104:goto            58
			} else
			{
				int j1 = aobj.length;
	//   65  107:aload_0         
	//   66  108:arraylength     
	//   67  109:istore          5
				int j = 0;
	//   68  111:iconst_0        
	//   69  112:istore_2        
				do
				{
					k = j;
	//   70  113:iload_2         
	//   71  114:istore_3        
					if(l >= j1)
						break;
	//   72  115:iload           4
	//   73  117:iload           5
	//   74  119:icmpge          160
					Object obj1 = aobj[l];
	//   75  122:aload_0         
	//   76  123:iload           4
	//   77  125:aaload          
	//   78  126:astore          7
					k = j;
	//   79  128:iload_2         
	//   80  129:istore_3        
					if(!contains(aobj1, obj1))
	//*  81  130:aload_1         
	//*  82  131:aload           7
	//*  83  133:invokestatic    #162 <Method boolean contains(Object[], Object)>
	//*  84  136:ifne            149
					{
						aobj2[j] = obj1;
	//   85  139:aload           6
	//   86  141:iload_2         
	//   87  142:aload           7
	//   88  144:aastore         
						k = j + 1;
	//   89  145:iload_2         
	//   90  146:iconst_1        
	//   91  147:iadd            
	//   92  148:istore_3        
					}
					l++;
	//   93  149:iload           4
	//   94  151:iconst_1        
	//   95  152:iadd            
	//   96  153:istore          4
					j = k;
	//   97  155:iload_3         
	//   98  156:istore_2        
				} while(true);
	//   99  157:goto            113
			}
			return resize(aobj2, k);
	//  100  160:aload           6
	//  101  162:iload_3         
	//  102  163:invokestatic    #164 <Method Object[] resize(Object[], int)>
	//  103  166:areturn         
		} else
		{
			return Arrays.copyOf(aobj, aobj.length);
	//  104  167:aload_0         
	//  105  168:aload_0         
	//  106  169:arraylength     
	//  107  170:invokestatic    #43  <Method Object[] Arrays.copyOf(Object[], int)>
	//  108  173:areturn         
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
		int i = 0;
	//    0    0:iconst_0        
	//    1    1:istore_1        
		int j = aobj.length;
	//    2    2:aload_0         
	//    3    3:arraylength     
	//    4    4:istore_2        
		ArrayList arraylist = new ArrayList(j);
	//    5    5:new             #136 <Class ArrayList>
	//    6    8:dup             
	//    7    9:iload_2         
	//    8   10:invokespecial   #174 <Method void ArrayList(int)>
	//    9   13:astore_3        
		for(; i < j; i++)
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
		int i = 0;
	//    0    0:iconst_0        
	//    1    1:istore_2        
		for(int j = ad.length; i < j; i++)
	//*   2    2:aload_1         
	//*   3    3:arraylength     
	//*   4    4:istore_3        
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
		int i = 0;
	//    0    0:iconst_0        
	//    1    1:istore_2        
		for(int j = af.length; i < j; i++)
	//*   2    2:aload_1         
	//*   3    3:arraylength     
	//*   4    4:istore_3        
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
		int i = 0;
	//    0    0:iconst_0        
	//    1    1:istore_2        
		for(int j = ai.length; i < j; i++)
	//*   2    2:aload_1         
	//*   3    3:arraylength     
	//*   4    4:istore_3        
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
		int i = 0;
	//    0    0:iconst_0        
	//    1    1:istore_2        
		for(int j = al.length; i < j; i++)
	//*   2    2:aload_1         
	//*   3    3:arraylength     
	//*   4    4:istore_3        
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
		int i = 0;
	//    0    0:iconst_0        
	//    1    1:istore_2        
		for(int j = aobj.length; i < j; i++)
	//*   2    2:aload_1         
	//*   3    3:arraylength     
	//*   4    4:istore_3        
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
		int i = 0;
	//    0    0:iconst_0        
	//    1    1:istore_2        
		for(int j = aflag.length; i < j; i++)
	//*   2    2:aload_1         
	//*   3    3:arraylength     
	//*   4    4:istore_3        
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
		int i = 0;
	//    0    0:iconst_0        
	//    1    1:istore_2        
		for(int j = as.length; i < j; i++)
	//*   2    2:aload_1         
	//*   3    3:arraylength     
	//*   4    4:istore_3        
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

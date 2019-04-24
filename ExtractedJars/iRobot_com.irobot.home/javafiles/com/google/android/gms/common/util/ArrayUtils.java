// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.util;

import com.google.android.gms.common.internal.Objects;
import java.lang.reflect.Array;
import java.util.*;

public final class ArrayUtils
{

	private ArrayUtils()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #10  <Method void Object()>
	//    2    4:return          
	}

	public static Object[] appendToArray(Object aobj[], Object obj)
	{
		if(aobj == null && obj == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       18
	//*   2    4:aload_1         
	//*   3    5:ifnonnull       18
			throw new IllegalArgumentException("Cannot generate array of generic type w/o class info");
	//    4    8:new             #15  <Class IllegalArgumentException>
	//    5   11:dup             
	//    6   12:ldc1            #17  <String "Cannot generate array of generic type w/o class info">
	//    7   14:invokespecial   #20  <Method void IllegalArgumentException(String)>
	//    8   17:athrow          
		if(aobj == null)
	//*   9   18:aload_0         
	//*  10   19:ifnonnull       37
			aobj = (Object[])Array.newInstance(obj.getClass(), 1);
	//   11   22:aload_1         
	//   12   23:invokevirtual   #24  <Method Class Object.getClass()>
	//   13   26:iconst_1        
	//   14   27:invokestatic    #30  <Method Object Array.newInstance(Class, int)>
	//   15   30:checkcast       #32  <Class Object[]>
	//   16   33:astore_0        
		else
	//*  17   34:goto            46
			aobj = Arrays.copyOf(aobj, aobj.length + 1);
	//   18   37:aload_0         
	//   19   38:aload_0         
	//   20   39:arraylength     
	//   21   40:iconst_1        
	//   22   41:iadd            
	//   23   42:invokestatic    #38  <Method Object[] Arrays.copyOf(Object[], int)>
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
	//    4    6:invokevirtual   #24  <Method Class Object.getClass()>
	//    5    9:iconst_0        
	//    6   10:invokestatic    #30  <Method Object Array.newInstance(Class, int)>
	//    7   13:checkcast       #32  <Class Object[]>
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
	//   33   45:invokestatic    #38  <Method Object[] Arrays.copyOf(Object[], int)>
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
	//   56   75:invokestatic    #49  <Method void System.arraycopy(Object, int, Object, int, int)>
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
	//   30   37:invokestatic    #55  <Method byte[] Arrays.copyOf(byte[], int)>
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
	//   53   67:invokestatic    #49  <Method void System.arraycopy(Object, int, Object, int, int)>
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
		int i;
label0:
		{
			int j;
			if(aobj != null)
	//*   0    0:aload_0         
	//*   1    1:ifnull          10
				j = aobj.length;
	//    2    4:aload_0         
	//    3    5:arraylength     
	//    4    6:istore_3        
			else
	//*   5    7:goto            12
				j = 0;
	//    6   10:iconst_0        
	//    7   11:istore_3        
			for(i = 0; i < j; i++)
	//*   8   12:iconst_0        
	//*   9   13:istore_2        
	//*  10   14:iload_2         
	//*  11   15:iload_3         
	//*  12   16:icmpge          39
				if(Objects.equal(aobj[i], obj))
	//*  13   19:aload_0         
	//*  14   20:iload_2         
	//*  15   21:aaload          
	//*  16   22:aload_1         
	//*  17   23:invokestatic    #64  <Method boolean Objects.equal(Object, Object)>
	//*  18   26:ifeq            32
					break label0;
	//   19   29:goto            41

	//   20   32:iload_2         
	//   21   33:iconst_1        
	//   22   34:iadd            
	//   23   35:istore_2        
	//*  24   36:goto            14
			i = -1;
	//   25   39:iconst_m1       
	//   26   40:istore_2        
		}
		return i >= 0;
	//   27   41:iload_2         
	//   28   42:iflt            47
	//   29   45:iconst_1        
	//   30   46:ireturn         
	//   31   47:iconst_0        
	//   32   48:ireturn         
	}

	public static ArrayList newArrayList()
	{
		return new ArrayList();
	//    0    0:new             #69  <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #70  <Method void ArrayList()>
	//    3    7:areturn         
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
	//*   5    7:ifnull          183
	//*   6   10:aload_1         
	//*   7   11:arraylength     
	//*   8   12:ifne            18
	//*   9   15:goto            183
		{
			Object aobj2[] = (Object[])Array.newInstance(((Object) (aobj1)).getClass().getComponentType(), aobj.length);
	//   10   18:aload_1         
	//   11   19:invokevirtual   #24  <Method Class Object.getClass()>
	//   12   22:invokevirtual   #78  <Method Class Class.getComponentType()>
	//   13   25:aload_0         
	//   14   26:arraylength     
	//   15   27:invokestatic    #30  <Method Object Array.newInstance(Class, int)>
	//   16   30:checkcast       #32  <Class Object[]>
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
	//*  48   77:invokestatic    #64  <Method boolean Objects.equal(Object, Object)>
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
	//*  83  130:invokestatic    #80  <Method boolean contains(Object[], Object)>
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
			if(aobj2 == null)
	//* 100  157:aload           6
	//* 101  159:ifnonnull       164
				return null;
	//  102  162:aconst_null     
	//  103  163:areturn         
			aobj = aobj2;
	//  104  164:aload           6
	//  105  166:astore_0        
			if(l != aobj2.length)
	//* 106  167:iload_3         
	//* 107  168:aload           6
	//* 108  170:arraylength     
	//* 109  171:icmpeq          181
				aobj = Arrays.copyOf(aobj2, l);
	//  110  174:aload           6
	//  111  176:iload_3         
	//  112  177:invokestatic    #38  <Method Object[] Arrays.copyOf(Object[], int)>
	//  113  180:astore_0        
			return aobj;
	//  114  181:aload_0         
	//  115  182:areturn         
		} else
		{
			return Arrays.copyOf(aobj, aobj.length);
	//  116  183:aload_0         
	//  117  184:aload_0         
	//  118  185:arraylength     
	//  119  186:invokestatic    #38  <Method Object[] Arrays.copyOf(Object[], int)>
	//  120  189:areturn         
		}
	}

	public static ArrayList toArrayList(Object aobj[])
	{
		int j = aobj.length;
	//    0    0:aload_0         
	//    1    1:arraylength     
	//    2    2:istore_2        
		ArrayList arraylist = new ArrayList(j);
	//    3    3:new             #69  <Class ArrayList>
	//    4    6:dup             
	//    5    7:iload_2         
	//    6    8:invokespecial   #86  <Method void ArrayList(int)>
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
	//   17   23:invokevirtual   #90  <Method boolean ArrayList.add(Object)>
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

	public static int[] toPrimitiveArray(Collection collection)
	{
		int i = 0;
	//    0    0:iconst_0        
	//    1    1:istore_1        
		if(collection != null && collection.size() != 0)
	//*   2    2:aload_0         
	//*   3    3:ifnull          67
	//*   4    6:aload_0         
	//*   5    7:invokeinterface #99  <Method int Collection.size()>
	//*   6   12:ifne            18
	//*   7   15:goto            67
		{
			int ai[] = new int[collection.size()];
	//    8   18:aload_0         
	//    9   19:invokeinterface #99  <Method int Collection.size()>
	//   10   24:newarray        int[]
	//   11   26:astore_2        
			for(collection = ((Collection) (collection.iterator())); ((Iterator) (collection)).hasNext();)
	//*  12   27:aload_0         
	//*  13   28:invokeinterface #103 <Method Iterator Collection.iterator()>
	//*  14   33:astore_0        
	//*  15   34:aload_0         
	//*  16   35:invokeinterface #109 <Method boolean Iterator.hasNext()>
	//*  17   40:ifeq            65
			{
				ai[i] = ((Integer)((Iterator) (collection)).next()).intValue();
	//   18   43:aload_2         
	//   19   44:iload_1         
	//   20   45:aload_0         
	//   21   46:invokeinterface #113 <Method Object Iterator.next()>
	//   22   51:checkcast       #115 <Class Integer>
	//   23   54:invokevirtual   #118 <Method int Integer.intValue()>
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
	//   20   26:invokestatic    #125 <Method Integer Integer.valueOf(int)>
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
	//*   7    7:icmpge          39
		{
			if(i != 0)
	//*   8   10:iload_2         
	//*   9   11:ifeq            21
				stringbuilder.append(",");
	//   10   14:aload_0         
	//   11   15:ldc1            #129 <String ",">
	//   12   17:invokevirtual   #135 <Method StringBuilder StringBuilder.append(String)>
	//   13   20:pop             
			stringbuilder.append(Double.toString(ad[i]));
	//   14   21:aload_0         
	//   15   22:aload_1         
	//   16   23:iload_2         
	//   17   24:daload          
	//   18   25:invokestatic    #141 <Method String Double.toString(double)>
	//   19   28:invokevirtual   #135 <Method StringBuilder StringBuilder.append(String)>
	//   20   31:pop             
		}

	//   21   32:iload_2         
	//   22   33:iconst_1        
	//   23   34:iadd            
	//   24   35:istore_2        
	//*  25   36:goto            5
	//   26   39:return          
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
	//*   7    7:icmpge          39
		{
			if(i != 0)
	//*   8   10:iload_2         
	//*   9   11:ifeq            21
				stringbuilder.append(",");
	//   10   14:aload_0         
	//   11   15:ldc1            #129 <String ",">
	//   12   17:invokevirtual   #135 <Method StringBuilder StringBuilder.append(String)>
	//   13   20:pop             
			stringbuilder.append(Float.toString(af[i]));
	//   14   21:aload_0         
	//   15   22:aload_1         
	//   16   23:iload_2         
	//   17   24:faload          
	//   18   25:invokestatic    #147 <Method String Float.toString(float)>
	//   19   28:invokevirtual   #135 <Method StringBuilder StringBuilder.append(String)>
	//   20   31:pop             
		}

	//   21   32:iload_2         
	//   22   33:iconst_1        
	//   23   34:iadd            
	//   24   35:istore_2        
	//*  25   36:goto            5
	//   26   39:return          
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
	//*   7    7:icmpge          39
		{
			if(i != 0)
	//*   8   10:iload_2         
	//*   9   11:ifeq            21
				stringbuilder.append(",");
	//   10   14:aload_0         
	//   11   15:ldc1            #129 <String ",">
	//   12   17:invokevirtual   #135 <Method StringBuilder StringBuilder.append(String)>
	//   13   20:pop             
			stringbuilder.append(Integer.toString(ai[i]));
	//   14   21:aload_0         
	//   15   22:aload_1         
	//   16   23:iload_2         
	//   17   24:iaload          
	//   18   25:invokestatic    #151 <Method String Integer.toString(int)>
	//   19   28:invokevirtual   #135 <Method StringBuilder StringBuilder.append(String)>
	//   20   31:pop             
		}

	//   21   32:iload_2         
	//   22   33:iconst_1        
	//   23   34:iadd            
	//   24   35:istore_2        
	//*  25   36:goto            5
	//   26   39:return          
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
	//*   7    7:icmpge          39
		{
			if(i != 0)
	//*   8   10:iload_2         
	//*   9   11:ifeq            21
				stringbuilder.append(",");
	//   10   14:aload_0         
	//   11   15:ldc1            #129 <String ",">
	//   12   17:invokevirtual   #135 <Method StringBuilder StringBuilder.append(String)>
	//   13   20:pop             
			stringbuilder.append(Long.toString(al[i]));
	//   14   21:aload_0         
	//   15   22:aload_1         
	//   16   23:iload_2         
	//   17   24:laload          
	//   18   25:invokestatic    #157 <Method String Long.toString(long)>
	//   19   28:invokevirtual   #135 <Method StringBuilder StringBuilder.append(String)>
	//   20   31:pop             
		}

	//   21   32:iload_2         
	//   22   33:iconst_1        
	//   23   34:iadd            
	//   24   35:istore_2        
	//*  25   36:goto            5
	//   26   39:return          
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
	//*   7    7:icmpge          39
		{
			if(i != 0)
	//*   8   10:iload_2         
	//*   9   11:ifeq            21
				stringbuilder.append(",");
	//   10   14:aload_0         
	//   11   15:ldc1            #129 <String ",">
	//   12   17:invokevirtual   #135 <Method StringBuilder StringBuilder.append(String)>
	//   13   20:pop             
			stringbuilder.append(aobj[i].toString());
	//   14   21:aload_0         
	//   15   22:aload_1         
	//   16   23:iload_2         
	//   17   24:aaload          
	//   18   25:invokevirtual   #161 <Method String Object.toString()>
	//   19   28:invokevirtual   #135 <Method StringBuilder StringBuilder.append(String)>
	//   20   31:pop             
		}

	//   21   32:iload_2         
	//   22   33:iconst_1        
	//   23   34:iadd            
	//   24   35:istore_2        
	//*  25   36:goto            5
	//   26   39:return          
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
	//*   7    7:icmpge          39
		{
			if(i != 0)
	//*   8   10:iload_2         
	//*   9   11:ifeq            21
				stringbuilder.append(",");
	//   10   14:aload_0         
	//   11   15:ldc1            #129 <String ",">
	//   12   17:invokevirtual   #135 <Method StringBuilder StringBuilder.append(String)>
	//   13   20:pop             
			stringbuilder.append(Boolean.toString(aflag[i]));
	//   14   21:aload_0         
	//   15   22:aload_1         
	//   16   23:iload_2         
	//   17   24:baload          
	//   18   25:invokestatic    #168 <Method String Boolean.toString(boolean)>
	//   19   28:invokevirtual   #135 <Method StringBuilder StringBuilder.append(String)>
	//   20   31:pop             
		}

	//   21   32:iload_2         
	//   22   33:iconst_1        
	//   23   34:iadd            
	//   24   35:istore_2        
	//*  25   36:goto            5
	//   26   39:return          
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
	//*   7    7:icmpge          50
		{
			if(i != 0)
	//*   8   10:iload_2         
	//*   9   11:ifeq            21
				stringbuilder.append(",");
	//   10   14:aload_0         
	//   11   15:ldc1            #129 <String ",">
	//   12   17:invokevirtual   #135 <Method StringBuilder StringBuilder.append(String)>
	//   13   20:pop             
			stringbuilder.append("\"");
	//   14   21:aload_0         
	//   15   22:ldc1            #172 <String "\"">
	//   16   24:invokevirtual   #135 <Method StringBuilder StringBuilder.append(String)>
	//   17   27:pop             
			stringbuilder.append(as[i]);
	//   18   28:aload_0         
	//   19   29:aload_1         
	//   20   30:iload_2         
	//   21   31:aaload          
	//   22   32:invokevirtual   #135 <Method StringBuilder StringBuilder.append(String)>
	//   23   35:pop             
			stringbuilder.append("\"");
	//   24   36:aload_0         
	//   25   37:ldc1            #172 <String "\"">
	//   26   39:invokevirtual   #135 <Method StringBuilder StringBuilder.append(String)>
	//   27   42:pop             
		}

	//   28   43:iload_2         
	//   29   44:iconst_1        
	//   30   45:iadd            
	//   31   46:istore_2        
	//*  32   47:goto            5
	//   33   50:return          
	}
}

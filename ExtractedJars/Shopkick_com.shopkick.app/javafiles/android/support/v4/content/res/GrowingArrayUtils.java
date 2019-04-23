// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.content.res;

import java.lang.reflect.Array;

final class GrowingArrayUtils
{

	private GrowingArrayUtils()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
	//    2    4:return          
	}

	public static int[] append(int ai[], int i, int j)
	{
		int ai1[] = ai;
	//    0    0:aload_0         
	//    1    1:astore_3        
		if(i + 1 > ai.length)
	//*   2    2:iload_1         
	//*   3    3:iconst_1        
	//*   4    4:iadd            
	//*   5    5:aload_0         
	//*   6    6:arraylength     
	//*   7    7:icmple          25
		{
			ai1 = new int[growSize(i)];
	//    8   10:iload_1         
	//    9   11:invokestatic    #19  <Method int growSize(int)>
	//   10   14:newarray        int[]
	//   11   16:astore_3        
			System.arraycopy(((Object) (ai)), 0, ((Object) (ai1)), 0, i);
	//   12   17:aload_0         
	//   13   18:iconst_0        
	//   14   19:aload_3         
	//   15   20:iconst_0        
	//   16   21:iload_1         
	//   17   22:invokestatic    #25  <Method void System.arraycopy(Object, int, Object, int, int)>
		}
		ai1[i] = j;
	//   18   25:aload_3         
	//   19   26:iload_1         
	//   20   27:iload_2         
	//   21   28:iastore         
		return ai1;
	//   22   29:aload_3         
	//   23   30:areturn         
	}

	public static long[] append(long al[], int i, long l)
	{
		long al1[] = al;
	//    0    0:aload_0         
	//    1    1:astore          4
		if(i + 1 > al.length)
	//*   2    3:iload_1         
	//*   3    4:iconst_1        
	//*   4    5:iadd            
	//*   5    6:aload_0         
	//*   6    7:arraylength     
	//*   7    8:icmple          28
		{
			al1 = new long[growSize(i)];
	//    8   11:iload_1         
	//    9   12:invokestatic    #19  <Method int growSize(int)>
	//   10   15:newarray        long[]
	//   11   17:astore          4
			System.arraycopy(((Object) (al)), 0, ((Object) (al1)), 0, i);
	//   12   19:aload_0         
	//   13   20:iconst_0        
	//   14   21:aload           4
	//   15   23:iconst_0        
	//   16   24:iload_1         
	//   17   25:invokestatic    #25  <Method void System.arraycopy(Object, int, Object, int, int)>
		}
		al1[i] = l;
	//   18   28:aload           4
	//   19   30:iload_1         
	//   20   31:lload_2         
	//   21   32:lastore         
		return al1;
	//   22   33:aload           4
	//   23   35:areturn         
	}

	public static Object[] append(Object aobj[], int i, Object obj)
	{
		Object aobj1[] = aobj;
	//    0    0:aload_0         
	//    1    1:astore_3        
		if(i + 1 > aobj.length)
	//*   2    2:iload_1         
	//*   3    3:iconst_1        
	//*   4    4:iadd            
	//*   5    5:aload_0         
	//*   6    6:arraylength     
	//*   7    7:icmple          36
		{
			aobj1 = (Object[])Array.newInstance(((Object) (aobj)).getClass().getComponentType(), growSize(i));
	//    8   10:aload_0         
	//    9   11:invokevirtual   #31  <Method Class Object.getClass()>
	//   10   14:invokevirtual   #36  <Method Class Class.getComponentType()>
	//   11   17:iload_1         
	//   12   18:invokestatic    #19  <Method int growSize(int)>
	//   13   21:invokestatic    #42  <Method Object Array.newInstance(Class, int)>
	//   14   24:checkcast       #44  <Class Object[]>
	//   15   27:astore_3        
			System.arraycopy(((Object) (aobj)), 0, ((Object) (aobj1)), 0, i);
	//   16   28:aload_0         
	//   17   29:iconst_0        
	//   18   30:aload_3         
	//   19   31:iconst_0        
	//   20   32:iload_1         
	//   21   33:invokestatic    #25  <Method void System.arraycopy(Object, int, Object, int, int)>
		}
		aobj1[i] = obj;
	//   22   36:aload_3         
	//   23   37:iload_1         
	//   24   38:aload_2         
	//   25   39:aastore         
		return aobj1;
	//   26   40:aload_3         
	//   27   41:areturn         
	}

	public static boolean[] append(boolean aflag[], int i, boolean flag)
	{
		boolean aflag1[] = aflag;
	//    0    0:aload_0         
	//    1    1:astore_3        
		if(i + 1 > aflag.length)
	//*   2    2:iload_1         
	//*   3    3:iconst_1        
	//*   4    4:iadd            
	//*   5    5:aload_0         
	//*   6    6:arraylength     
	//*   7    7:icmple          25
		{
			aflag1 = new boolean[growSize(i)];
	//    8   10:iload_1         
	//    9   11:invokestatic    #19  <Method int growSize(int)>
	//   10   14:newarray        boolean[]
	//   11   16:astore_3        
			System.arraycopy(((Object) (aflag)), 0, ((Object) (aflag1)), 0, i);
	//   12   17:aload_0         
	//   13   18:iconst_0        
	//   14   19:aload_3         
	//   15   20:iconst_0        
	//   16   21:iload_1         
	//   17   22:invokestatic    #25  <Method void System.arraycopy(Object, int, Object, int, int)>
		}
		aflag1[i] = flag;
	//   18   25:aload_3         
	//   19   26:iload_1         
	//   20   27:iload_2         
	//   21   28:bastore         
		return aflag1;
	//   22   29:aload_3         
	//   23   30:areturn         
	}

	public static int growSize(int i)
	{
		if(i <= 4)
	//*   0    0:iload_0         
	//*   1    1:iconst_4        
	//*   2    2:icmpgt          8
			return 8;
	//    3    5:bipush          8
	//    4    7:ireturn         
		else
			return i * 2;
	//    5    8:iload_0         
	//    6    9:iconst_2        
	//    7   10:imul            
	//    8   11:ireturn         
	}

	public static int[] insert(int ai[], int i, int j, int k)
	{
		if(i + 1 <= ai.length)
	//*   0    0:iload_1         
	//*   1    1:iconst_1        
	//*   2    2:iadd            
	//*   3    3:aload_0         
	//*   4    4:arraylength     
	//*   5    5:icmpgt          26
		{
			System.arraycopy(((Object) (ai)), j, ((Object) (ai)), j + 1, i - j);
	//    6    8:aload_0         
	//    7    9:iload_2         
	//    8   10:aload_0         
	//    9   11:iload_2         
	//   10   12:iconst_1        
	//   11   13:iadd            
	//   12   14:iload_1         
	//   13   15:iload_2         
	//   14   16:isub            
	//   15   17:invokestatic    #25  <Method void System.arraycopy(Object, int, Object, int, int)>
			ai[j] = k;
	//   16   20:aload_0         
	//   17   21:iload_2         
	//   18   22:iload_3         
	//   19   23:iastore         
			return ai;
	//   20   24:aload_0         
	//   21   25:areturn         
		} else
		{
			int ai1[] = new int[growSize(i)];
	//   22   26:iload_1         
	//   23   27:invokestatic    #19  <Method int growSize(int)>
	//   24   30:newarray        int[]
	//   25   32:astore          4
			System.arraycopy(((Object) (ai)), 0, ((Object) (ai1)), 0, j);
	//   26   34:aload_0         
	//   27   35:iconst_0        
	//   28   36:aload           4
	//   29   38:iconst_0        
	//   30   39:iload_2         
	//   31   40:invokestatic    #25  <Method void System.arraycopy(Object, int, Object, int, int)>
			ai1[j] = k;
	//   32   43:aload           4
	//   33   45:iload_2         
	//   34   46:iload_3         
	//   35   47:iastore         
			System.arraycopy(((Object) (ai)), j, ((Object) (ai1)), j + 1, ai.length - j);
	//   36   48:aload_0         
	//   37   49:iload_2         
	//   38   50:aload           4
	//   39   52:iload_2         
	//   40   53:iconst_1        
	//   41   54:iadd            
	//   42   55:aload_0         
	//   43   56:arraylength     
	//   44   57:iload_2         
	//   45   58:isub            
	//   46   59:invokestatic    #25  <Method void System.arraycopy(Object, int, Object, int, int)>
			return ai1;
	//   47   62:aload           4
	//   48   64:areturn         
		}
	}

	public static long[] insert(long al[], int i, int j, long l)
	{
		if(i + 1 <= al.length)
	//*   0    0:iload_1         
	//*   1    1:iconst_1        
	//*   2    2:iadd            
	//*   3    3:aload_0         
	//*   4    4:arraylength     
	//*   5    5:icmpgt          26
		{
			System.arraycopy(((Object) (al)), j, ((Object) (al)), j + 1, i - j);
	//    6    8:aload_0         
	//    7    9:iload_2         
	//    8   10:aload_0         
	//    9   11:iload_2         
	//   10   12:iconst_1        
	//   11   13:iadd            
	//   12   14:iload_1         
	//   13   15:iload_2         
	//   14   16:isub            
	//   15   17:invokestatic    #25  <Method void System.arraycopy(Object, int, Object, int, int)>
			al[j] = l;
	//   16   20:aload_0         
	//   17   21:iload_2         
	//   18   22:lload_3         
	//   19   23:lastore         
			return al;
	//   20   24:aload_0         
	//   21   25:areturn         
		} else
		{
			long al1[] = new long[growSize(i)];
	//   22   26:iload_1         
	//   23   27:invokestatic    #19  <Method int growSize(int)>
	//   24   30:newarray        long[]
	//   25   32:astore          5
			System.arraycopy(((Object) (al)), 0, ((Object) (al1)), 0, j);
	//   26   34:aload_0         
	//   27   35:iconst_0        
	//   28   36:aload           5
	//   29   38:iconst_0        
	//   30   39:iload_2         
	//   31   40:invokestatic    #25  <Method void System.arraycopy(Object, int, Object, int, int)>
			al1[j] = l;
	//   32   43:aload           5
	//   33   45:iload_2         
	//   34   46:lload_3         
	//   35   47:lastore         
			System.arraycopy(((Object) (al)), j, ((Object) (al1)), j + 1, al.length - j);
	//   36   48:aload_0         
	//   37   49:iload_2         
	//   38   50:aload           5
	//   39   52:iload_2         
	//   40   53:iconst_1        
	//   41   54:iadd            
	//   42   55:aload_0         
	//   43   56:arraylength     
	//   44   57:iload_2         
	//   45   58:isub            
	//   46   59:invokestatic    #25  <Method void System.arraycopy(Object, int, Object, int, int)>
			return al1;
	//   47   62:aload           5
	//   48   64:areturn         
		}
	}

	public static Object[] insert(Object aobj[], int i, int j, Object obj)
	{
		if(i + 1 <= aobj.length)
	//*   0    0:iload_1         
	//*   1    1:iconst_1        
	//*   2    2:iadd            
	//*   3    3:aload_0         
	//*   4    4:arraylength     
	//*   5    5:icmpgt          26
		{
			System.arraycopy(((Object) (aobj)), j, ((Object) (aobj)), j + 1, i - j);
	//    6    8:aload_0         
	//    7    9:iload_2         
	//    8   10:aload_0         
	//    9   11:iload_2         
	//   10   12:iconst_1        
	//   11   13:iadd            
	//   12   14:iload_1         
	//   13   15:iload_2         
	//   14   16:isub            
	//   15   17:invokestatic    #25  <Method void System.arraycopy(Object, int, Object, int, int)>
			aobj[j] = obj;
	//   16   20:aload_0         
	//   17   21:iload_2         
	//   18   22:aload_3         
	//   19   23:aastore         
			return aobj;
	//   20   24:aload_0         
	//   21   25:areturn         
		} else
		{
			Object aobj1[] = (Object[])Array.newInstance(((Object) (aobj)).getClass().getComponentType(), growSize(i));
	//   22   26:aload_0         
	//   23   27:invokevirtual   #31  <Method Class Object.getClass()>
	//   24   30:invokevirtual   #36  <Method Class Class.getComponentType()>
	//   25   33:iload_1         
	//   26   34:invokestatic    #19  <Method int growSize(int)>
	//   27   37:invokestatic    #42  <Method Object Array.newInstance(Class, int)>
	//   28   40:checkcast       #44  <Class Object[]>
	//   29   43:astore          4
			System.arraycopy(((Object) (aobj)), 0, ((Object) (aobj1)), 0, j);
	//   30   45:aload_0         
	//   31   46:iconst_0        
	//   32   47:aload           4
	//   33   49:iconst_0        
	//   34   50:iload_2         
	//   35   51:invokestatic    #25  <Method void System.arraycopy(Object, int, Object, int, int)>
			aobj1[j] = obj;
	//   36   54:aload           4
	//   37   56:iload_2         
	//   38   57:aload_3         
	//   39   58:aastore         
			System.arraycopy(((Object) (aobj)), j, ((Object) (aobj1)), j + 1, aobj.length - j);
	//   40   59:aload_0         
	//   41   60:iload_2         
	//   42   61:aload           4
	//   43   63:iload_2         
	//   44   64:iconst_1        
	//   45   65:iadd            
	//   46   66:aload_0         
	//   47   67:arraylength     
	//   48   68:iload_2         
	//   49   69:isub            
	//   50   70:invokestatic    #25  <Method void System.arraycopy(Object, int, Object, int, int)>
			return aobj1;
	//   51   73:aload           4
	//   52   75:areturn         
		}
	}

	public static boolean[] insert(boolean aflag[], int i, int j, boolean flag)
	{
		if(i + 1 <= aflag.length)
	//*   0    0:iload_1         
	//*   1    1:iconst_1        
	//*   2    2:iadd            
	//*   3    3:aload_0         
	//*   4    4:arraylength     
	//*   5    5:icmpgt          26
		{
			System.arraycopy(((Object) (aflag)), j, ((Object) (aflag)), j + 1, i - j);
	//    6    8:aload_0         
	//    7    9:iload_2         
	//    8   10:aload_0         
	//    9   11:iload_2         
	//   10   12:iconst_1        
	//   11   13:iadd            
	//   12   14:iload_1         
	//   13   15:iload_2         
	//   14   16:isub            
	//   15   17:invokestatic    #25  <Method void System.arraycopy(Object, int, Object, int, int)>
			aflag[j] = flag;
	//   16   20:aload_0         
	//   17   21:iload_2         
	//   18   22:iload_3         
	//   19   23:bastore         
			return aflag;
	//   20   24:aload_0         
	//   21   25:areturn         
		} else
		{
			boolean aflag1[] = new boolean[growSize(i)];
	//   22   26:iload_1         
	//   23   27:invokestatic    #19  <Method int growSize(int)>
	//   24   30:newarray        boolean[]
	//   25   32:astore          4
			System.arraycopy(((Object) (aflag)), 0, ((Object) (aflag1)), 0, j);
	//   26   34:aload_0         
	//   27   35:iconst_0        
	//   28   36:aload           4
	//   29   38:iconst_0        
	//   30   39:iload_2         
	//   31   40:invokestatic    #25  <Method void System.arraycopy(Object, int, Object, int, int)>
			aflag1[j] = flag;
	//   32   43:aload           4
	//   33   45:iload_2         
	//   34   46:iload_3         
	//   35   47:bastore         
			System.arraycopy(((Object) (aflag)), j, ((Object) (aflag1)), j + 1, aflag.length - j);
	//   36   48:aload_0         
	//   37   49:iload_2         
	//   38   50:aload           4
	//   39   52:iload_2         
	//   40   53:iconst_1        
	//   41   54:iadd            
	//   42   55:aload_0         
	//   43   56:arraylength     
	//   44   57:iload_2         
	//   45   58:isub            
	//   46   59:invokestatic    #25  <Method void System.arraycopy(Object, int, Object, int, int)>
			return aflag1;
	//   47   62:aload           4
	//   48   64:areturn         
		}
	}

	static final boolean $assertionsDisabled = false;

	static 
	{
	//    0    0:return          
	}
}

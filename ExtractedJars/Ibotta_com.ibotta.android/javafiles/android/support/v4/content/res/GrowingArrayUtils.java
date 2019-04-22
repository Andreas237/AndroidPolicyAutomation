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
	//    9   11:invokevirtual   #30  <Method Class Object.getClass()>
	//   10   14:invokevirtual   #35  <Method Class Class.getComponentType()>
	//   11   17:iload_1         
	//   12   18:invokestatic    #19  <Method int growSize(int)>
	//   13   21:invokestatic    #41  <Method Object Array.newInstance(Class, int)>
	//   14   24:checkcast       #43  <Class Object[]>
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

	static final boolean $assertionsDisabled = false;

	static 
	{
	//    0    0:return          
	}
}

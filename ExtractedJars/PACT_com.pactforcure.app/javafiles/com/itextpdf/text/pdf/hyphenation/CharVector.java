// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf.hyphenation;

import java.io.Serializable;

public class CharVector
	implements Cloneable, Serializable
{

	public CharVector()
	{
		this(2048);
	//    0    0:aload_0         
	//    1    1:sipush          2048
	//    2    4:invokespecial   #24  <Method void CharVector(int)>
	//    3    7:return          
	}

	public CharVector(int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #27  <Method void Object()>
		if(i > 0)
	//*   2    4:iload_1         
	//*   3    5:ifle            29
			blockSize = i;
	//    4    8:aload_0         
	//    5    9:iload_1         
	//    6   10:putfield        #29  <Field int blockSize>
		else
	//*   7   13:aload_0         
	//*   8   14:aload_0         
	//*   9   15:getfield        #29  <Field int blockSize>
	//*  10   18:newarray        char[]
	//*  11   20:putfield        #31  <Field char[] array>
	//*  12   23:aload_0         
	//*  13   24:iconst_0        
	//*  14   25:putfield        #33  <Field int n>
	//*  15   28:return          
			blockSize = 2048;
	//   16   29:aload_0         
	//   17   30:sipush          2048
	//   18   33:putfield        #29  <Field int blockSize>
		array = new char[blockSize];
		n = 0;
	//*  19   36:goto            13
	}

	public CharVector(char ac[])
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #27  <Method void Object()>
		blockSize = 2048;
	//    2    4:aload_0         
	//    3    5:sipush          2048
	//    4    8:putfield        #29  <Field int blockSize>
		array = ac;
	//    5   11:aload_0         
	//    6   12:aload_1         
	//    7   13:putfield        #31  <Field char[] array>
		n = ac.length;
	//    8   16:aload_0         
	//    9   17:aload_1         
	//   10   18:arraylength     
	//   11   19:putfield        #33  <Field int n>
	//   12   22:return          
	}

	public CharVector(char ac[], int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #27  <Method void Object()>
		if(i > 0)
	//*   2    4:iload_2         
	//*   3    5:ifle            25
			blockSize = i;
	//    4    8:aload_0         
	//    5    9:iload_2         
	//    6   10:putfield        #29  <Field int blockSize>
		else
	//*   7   13:aload_0         
	//*   8   14:aload_1         
	//*   9   15:putfield        #31  <Field char[] array>
	//*  10   18:aload_0         
	//*  11   19:aload_1         
	//*  12   20:arraylength     
	//*  13   21:putfield        #33  <Field int n>
	//*  14   24:return          
			blockSize = 2048;
	//   15   25:aload_0         
	//   16   26:sipush          2048
	//   17   29:putfield        #29  <Field int blockSize>
		array = ac;
		n = ac.length;
	//*  18   32:goto            13
	}

	public int alloc(int i)
	{
		int j = n;
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field int n>
	//    2    4:istore_2        
		int k = array.length;
	//    3    5:aload_0         
	//    4    6:getfield        #31  <Field char[] array>
	//    5    9:arraylength     
	//    6   10:istore_3        
		if(n + i >= k)
	//*   7   11:aload_0         
	//*   8   12:getfield        #33  <Field int n>
	//*   9   15:iload_1         
	//*  10   16:iadd            
	//*  11   17:iload_3         
	//*  12   18:icmplt          49
		{
			char ac[] = new char[blockSize + k];
	//   13   21:aload_0         
	//   14   22:getfield        #29  <Field int blockSize>
	//   15   25:iload_3         
	//   16   26:iadd            
	//   17   27:newarray        char[]
	//   18   29:astore          4
			System.arraycopy(((Object) (array)), 0, ((Object) (ac)), 0, k);
	//   19   31:aload_0         
	//   20   32:getfield        #31  <Field char[] array>
	//   21   35:iconst_0        
	//   22   36:aload           4
	//   23   38:iconst_0        
	//   24   39:iload_3         
	//   25   40:invokestatic    #43  <Method void System.arraycopy(Object, int, Object, int, int)>
			array = ac;
	//   26   43:aload_0         
	//   27   44:aload           4
	//   28   46:putfield        #31  <Field char[] array>
		}
		n = n + i;
	//   29   49:aload_0         
	//   30   50:aload_0         
	//   31   51:getfield        #33  <Field int n>
	//   32   54:iload_1         
	//   33   55:iadd            
	//   34   56:putfield        #33  <Field int n>
		return j;
	//   35   59:iload_2         
	//   36   60:ireturn         
	}

	public int capacity()
	{
		return array.length;
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field char[] array>
	//    2    4:arraylength     
	//    3    5:ireturn         
	}

	public void clear()
	{
		n = 0;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #33  <Field int n>
	//    3    5:return          
	}

	public Object clone()
	{
		CharVector charvector = new CharVector((char[])(char[])((char []) (array)).clone(), blockSize);
	//    0    0:new             #2   <Class CharVector>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #31  <Field char[] array>
	//    4    8:invokevirtual   #51  <Method Object _5B_C.clone()>
	//    5   11:checkcast       #49  <Class char[]>
	//    6   14:checkcast       #49  <Class char[]>
	//    7   17:aload_0         
	//    8   18:getfield        #29  <Field int blockSize>
	//    9   21:invokespecial   #53  <Method void CharVector(char[], int)>
	//   10   24:astore_1        
		charvector.n = n;
	//   11   25:aload_1         
	//   12   26:aload_0         
	//   13   27:getfield        #33  <Field int n>
	//   14   30:putfield        #33  <Field int n>
		return ((Object) (charvector));
	//   15   33:aload_1         
	//   16   34:areturn         
	}

	public char get(int i)
	{
		return array[i];
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field char[] array>
	//    2    4:iload_1         
	//    3    5:caload          
	//    4    6:ireturn         
	}

	public char[] getArray()
	{
		return array;
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field char[] array>
	//    2    4:areturn         
	}

	public int length()
	{
		return n;
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field int n>
	//    2    4:ireturn         
	}

	public void put(int i, char c)
	{
		array[i] = c;
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field char[] array>
	//    2    4:iload_1         
	//    3    5:iload_2         
	//    4    6:castore         
	//    5    7:return          
	}

	public void trimToSize()
	{
		if(n < array.length)
	//*   0    0:aload_0         
	//*   1    1:getfield        #33  <Field int n>
	//*   2    4:aload_0         
	//*   3    5:getfield        #31  <Field char[] array>
	//*   4    8:arraylength     
	//*   5    9:icmpge          38
		{
			char ac[] = new char[n];
	//    6   12:aload_0         
	//    7   13:getfield        #33  <Field int n>
	//    8   16:newarray        char[]
	//    9   18:astore_1        
			System.arraycopy(((Object) (array)), 0, ((Object) (ac)), 0, n);
	//   10   19:aload_0         
	//   11   20:getfield        #31  <Field char[] array>
	//   12   23:iconst_0        
	//   13   24:aload_1         
	//   14   25:iconst_0        
	//   15   26:aload_0         
	//   16   27:getfield        #33  <Field int n>
	//   17   30:invokestatic    #43  <Method void System.arraycopy(Object, int, Object, int, int)>
			array = ac;
	//   18   33:aload_0         
	//   19   34:aload_1         
	//   20   35:putfield        #31  <Field char[] array>
		}
	//   21   38:return          
	}

	private static final int DEFAULT_BLOCK_SIZE = 2048;
	private static final long serialVersionUID = 0xcc381ae8L;
	private char array[];
	private int blockSize;
	private int n;
}

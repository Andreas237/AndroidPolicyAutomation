// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer.util;

import java.util.Arrays;

public final class LongArray
{

	public LongArray()
	{
		this(32);
	//    0    0:aload_0         
	//    1    1:bipush          32
	//    2    3:invokespecial   #15  <Method void LongArray(int)>
	//    3    6:return          
	}

	public LongArray(int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void Object()>
		values = new long[i];
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:newarray        long[]
	//    5    8:putfield        #20  <Field long[] values>
	//    6   11:return          
	}

	public void add(long l)
	{
		int i = size;
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field int size>
	//    2    4:istore_3        
		long al[] = values;
	//    3    5:aload_0         
	//    4    6:getfield        #20  <Field long[] values>
	//    5    9:astore          4
		if(i == al.length)
	//*   6   11:iload_3         
	//*   7   12:aload           4
	//*   8   14:arraylength     
	//*   9   15:icmpne          30
			values = Arrays.copyOf(al, i * 2);
	//   10   18:aload_0         
	//   11   19:aload           4
	//   12   21:iload_3         
	//   13   22:iconst_2        
	//   14   23:imul            
	//   15   24:invokestatic    #30  <Method long[] Arrays.copyOf(long[], int)>
	//   16   27:putfield        #20  <Field long[] values>
		al = values;
	//   17   30:aload_0         
	//   18   31:getfield        #20  <Field long[] values>
	//   19   34:astore          4
		i = size;
	//   20   36:aload_0         
	//   21   37:getfield        #24  <Field int size>
	//   22   40:istore_3        
		size = i + 1;
	//   23   41:aload_0         
	//   24   42:iload_3         
	//   25   43:iconst_1        
	//   26   44:iadd            
	//   27   45:putfield        #24  <Field int size>
		al[i] = l;
	//   28   48:aload           4
	//   29   50:iload_3         
	//   30   51:lload_1         
	//   31   52:lastore         
	//   32   53:return          
	}

	public long get(int i)
	{
		if(i >= 0 && i < size)
	//*   0    0:iload_1         
	//*   1    1:iflt            19
	//*   2    4:iload_1         
	//*   3    5:aload_0         
	//*   4    6:getfield        #24  <Field int size>
	//*   5    9:icmpge          19
		{
			return values[i];
	//    6   12:aload_0         
	//    7   13:getfield        #20  <Field long[] values>
	//    8   16:iload_1         
	//    9   17:laload          
	//   10   18:lreturn         
		} else
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   11   19:new             #34  <Class StringBuilder>
	//   12   22:dup             
	//   13   23:invokespecial   #35  <Method void StringBuilder()>
	//   14   26:astore_2        
			stringbuilder.append("Invalid size ");
	//   15   27:aload_2         
	//   16   28:ldc1            #37  <String "Invalid size ">
	//   17   30:invokevirtual   #41  <Method StringBuilder StringBuilder.append(String)>
	//   18   33:pop             
			stringbuilder.append(i);
	//   19   34:aload_2         
	//   20   35:iload_1         
	//   21   36:invokevirtual   #44  <Method StringBuilder StringBuilder.append(int)>
	//   22   39:pop             
			stringbuilder.append(", size is ");
	//   23   40:aload_2         
	//   24   41:ldc1            #46  <String ", size is ">
	//   25   43:invokevirtual   #41  <Method StringBuilder StringBuilder.append(String)>
	//   26   46:pop             
			stringbuilder.append(size);
	//   27   47:aload_2         
	//   28   48:aload_0         
	//   29   49:getfield        #24  <Field int size>
	//   30   52:invokevirtual   #44  <Method StringBuilder StringBuilder.append(int)>
	//   31   55:pop             
			throw new IndexOutOfBoundsException(stringbuilder.toString());
	//   32   56:new             #48  <Class IndexOutOfBoundsException>
	//   33   59:dup             
	//   34   60:aload_2         
	//   35   61:invokevirtual   #52  <Method String StringBuilder.toString()>
	//   36   64:invokespecial   #55  <Method void IndexOutOfBoundsException(String)>
	//   37   67:athrow          
		}
	}

	public int size()
	{
		return size;
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field int size>
	//    2    4:ireturn         
	}

	public long[] toArray()
	{
		return Arrays.copyOf(values, size);
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field long[] values>
	//    2    4:aload_0         
	//    3    5:getfield        #24  <Field int size>
	//    4    8:invokestatic    #30  <Method long[] Arrays.copyOf(long[], int)>
	//    5   11:areturn         
	}

	private static final int DEFAULT_INITIAL_CAPACITY = 32;
	private int size;
	private long values[];
}

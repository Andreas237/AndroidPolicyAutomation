// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.util;

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
		if(size == values.length)
	//*   0    0:aload_0         
	//*   1    1:getfield        #24  <Field int size>
	//*   2    4:aload_0         
	//*   3    5:getfield        #20  <Field long[] values>
	//*   4    8:arraylength     
	//*   5    9:icmpne          29
			values = Arrays.copyOf(values, size * 2);
	//    6   12:aload_0         
	//    7   13:aload_0         
	//    8   14:getfield        #20  <Field long[] values>
	//    9   17:aload_0         
	//   10   18:getfield        #24  <Field int size>
	//   11   21:iconst_2        
	//   12   22:imul            
	//   13   23:invokestatic    #30  <Method long[] Arrays.copyOf(long[], int)>
	//   14   26:putfield        #20  <Field long[] values>
		long al[] = values;
	//   15   29:aload_0         
	//   16   30:getfield        #20  <Field long[] values>
	//   17   33:astore          4
		int i = size;
	//   18   35:aload_0         
	//   19   36:getfield        #24  <Field int size>
	//   20   39:istore_3        
		size = i + 1;
	//   21   40:aload_0         
	//   22   41:iload_3         
	//   23   42:iconst_1        
	//   24   43:iadd            
	//   25   44:putfield        #24  <Field int size>
		al[i] = l;
	//   26   47:aload           4
	//   27   49:iload_3         
	//   28   50:lload_1         
	//   29   51:lastore         
	//   30   52:return          
	}

	public long get(int i)
	{
		if(i >= 0 && i < size)
	//*   0    0:iload_1         
	//*   1    1:iflt            22
	//*   2    4:iload_1         
	//*   3    5:aload_0         
	//*   4    6:getfield        #24  <Field int size>
	//*   5    9:icmplt          15
	//*   6   12:goto            22
		{
			return values[i];
	//    7   15:aload_0         
	//    8   16:getfield        #20  <Field long[] values>
	//    9   19:iload_1         
	//   10   20:laload          
	//   11   21:lreturn         
		} else
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   12   22:new             #34  <Class StringBuilder>
	//   13   25:dup             
	//   14   26:invokespecial   #35  <Method void StringBuilder()>
	//   15   29:astore_2        
			stringbuilder.append("Invalid index ");
	//   16   30:aload_2         
	//   17   31:ldc1            #37  <String "Invalid index ">
	//   18   33:invokevirtual   #41  <Method StringBuilder StringBuilder.append(String)>
	//   19   36:pop             
			stringbuilder.append(i);
	//   20   37:aload_2         
	//   21   38:iload_1         
	//   22   39:invokevirtual   #44  <Method StringBuilder StringBuilder.append(int)>
	//   23   42:pop             
			stringbuilder.append(", size is ");
	//   24   43:aload_2         
	//   25   44:ldc1            #46  <String ", size is ">
	//   26   46:invokevirtual   #41  <Method StringBuilder StringBuilder.append(String)>
	//   27   49:pop             
			stringbuilder.append(size);
	//   28   50:aload_2         
	//   29   51:aload_0         
	//   30   52:getfield        #24  <Field int size>
	//   31   55:invokevirtual   #44  <Method StringBuilder StringBuilder.append(int)>
	//   32   58:pop             
			throw new IndexOutOfBoundsException(stringbuilder.toString());
	//   33   59:new             #48  <Class IndexOutOfBoundsException>
	//   34   62:dup             
	//   35   63:aload_2         
	//   36   64:invokevirtual   #52  <Method String StringBuilder.toString()>
	//   37   67:invokespecial   #55  <Method void IndexOutOfBoundsException(String)>
	//   38   70:athrow          
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

// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.util.Arrays;

public final class bni
{

	public bni()
	{
		this(32);
	//    0    0:aload_0         
	//    1    1:bipush          32
	//    2    3:invokespecial   #13  <Method void bni(int)>
	//    3    6:return          
	}

	private bni(int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
		b = new long[32];
	//    2    4:aload_0         
	//    3    5:bipush          32
	//    4    7:newarray        long[]
	//    5    9:putfield        #18  <Field long[] b>
	//    6   12:return          
	}

	public final int a()
	{
		return a;
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field int a>
	//    2    4:ireturn         
	}

	public final long a(int i)
	{
		if(i >= 0 && i < a)
	//*   0    0:iload_1         
	//*   1    1:iflt            19
	//*   2    4:iload_1         
	//*   3    5:aload_0         
	//*   4    6:getfield        #21  <Field int a>
	//*   5    9:icmpge          19
		{
			return b[i];
	//    6   12:aload_0         
	//    7   13:getfield        #18  <Field long[] b>
	//    8   16:iload_1         
	//    9   17:laload          
	//   10   18:lreturn         
		} else
		{
			int j = a;
	//   11   19:aload_0         
	//   12   20:getfield        #21  <Field int a>
	//   13   23:istore_2        
			StringBuilder stringbuilder = new StringBuilder(46);
	//   14   24:new             #24  <Class StringBuilder>
	//   15   27:dup             
	//   16   28:bipush          46
	//   17   30:invokespecial   #25  <Method void StringBuilder(int)>
	//   18   33:astore_3        
			stringbuilder.append("Invalid index ");
	//   19   34:aload_3         
	//   20   35:ldc1            #27  <String "Invalid index ">
	//   21   37:invokevirtual   #31  <Method StringBuilder StringBuilder.append(String)>
	//   22   40:pop             
			stringbuilder.append(i);
	//   23   41:aload_3         
	//   24   42:iload_1         
	//   25   43:invokevirtual   #34  <Method StringBuilder StringBuilder.append(int)>
	//   26   46:pop             
			stringbuilder.append(", size is ");
	//   27   47:aload_3         
	//   28   48:ldc1            #36  <String ", size is ">
	//   29   50:invokevirtual   #31  <Method StringBuilder StringBuilder.append(String)>
	//   30   53:pop             
			stringbuilder.append(j);
	//   31   54:aload_3         
	//   32   55:iload_2         
	//   33   56:invokevirtual   #34  <Method StringBuilder StringBuilder.append(int)>
	//   34   59:pop             
			throw new IndexOutOfBoundsException(stringbuilder.toString());
	//   35   60:new             #38  <Class IndexOutOfBoundsException>
	//   36   63:dup             
	//   37   64:aload_3         
	//   38   65:invokevirtual   #42  <Method String StringBuilder.toString()>
	//   39   68:invokespecial   #45  <Method void IndexOutOfBoundsException(String)>
	//   40   71:athrow          
		}
	}

	public final void a(long l)
	{
		int i = a;
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field int a>
	//    2    4:istore_3        
		long al[] = b;
	//    3    5:aload_0         
	//    4    6:getfield        #18  <Field long[] b>
	//    5    9:astore          4
		if(i == al.length)
	//*   6   11:iload_3         
	//*   7   12:aload           4
	//*   8   14:arraylength     
	//*   9   15:icmpne          30
			b = Arrays.copyOf(al, i << 1);
	//   10   18:aload_0         
	//   11   19:aload           4
	//   12   21:iload_3         
	//   13   22:iconst_1        
	//   14   23:ishl            
	//   15   24:invokestatic    #52  <Method long[] Arrays.copyOf(long[], int)>
	//   16   27:putfield        #18  <Field long[] b>
		al = b;
	//   17   30:aload_0         
	//   18   31:getfield        #18  <Field long[] b>
	//   19   34:astore          4
		i = a;
	//   20   36:aload_0         
	//   21   37:getfield        #21  <Field int a>
	//   22   40:istore_3        
		a = i + 1;
	//   23   41:aload_0         
	//   24   42:iload_3         
	//   25   43:iconst_1        
	//   26   44:iadd            
	//   27   45:putfield        #21  <Field int a>
		al[i] = l;
	//   28   48:aload           4
	//   29   50:iload_3         
	//   30   51:lload_1         
	//   31   52:lastore         
	//   32   53:return          
	}

	private int a;
	private long b[];
}

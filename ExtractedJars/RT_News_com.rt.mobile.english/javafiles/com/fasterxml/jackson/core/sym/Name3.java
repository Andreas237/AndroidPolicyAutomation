// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.core.sym;


// Referenced classes of package com.fasterxml.jackson.core.sym:
//			Name

public final class Name3 extends Name
{

	Name3(String s, int i, int j, int k, int l)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #13  <Method void Name(String, int)>
		q1 = j;
	//    4    6:aload_0         
	//    5    7:iload_3         
	//    6    8:putfield        #15  <Field int q1>
		q2 = k;
	//    7   11:aload_0         
	//    8   12:iload           4
	//    9   14:putfield        #17  <Field int q2>
		q3 = l;
	//   10   17:aload_0         
	//   11   18:iload           5
	//   12   20:putfield        #19  <Field int q3>
	//   13   23:return          
	}

	public boolean equals(int i)
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public boolean equals(int i, int j)
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public boolean equals(int i, int j, int k)
	{
		return q1 == i && q2 == j && q3 == k;
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field int q1>
	//    2    4:iload_1         
	//    3    5:icmpne          26
	//    4    8:aload_0         
	//    5    9:getfield        #17  <Field int q2>
	//    6   12:iload_2         
	//    7   13:icmpne          26
	//    8   16:aload_0         
	//    9   17:getfield        #19  <Field int q3>
	//   10   20:iload_3         
	//   11   21:icmpne          26
	//   12   24:iconst_1        
	//   13   25:ireturn         
	//   14   26:iconst_0        
	//   15   27:ireturn         
	}

	public boolean equals(int ai[], int i)
	{
		return i == 3 && ai[0] == q1 && ai[1] == q2 && ai[2] == q3;
	//    0    0:iload_2         
	//    1    1:iconst_3        
	//    2    2:icmpne          37
	//    3    5:aload_1         
	//    4    6:iconst_0        
	//    5    7:iaload          
	//    6    8:aload_0         
	//    7    9:getfield        #15  <Field int q1>
	//    8   12:icmpne          37
	//    9   15:aload_1         
	//   10   16:iconst_1        
	//   11   17:iaload          
	//   12   18:aload_0         
	//   13   19:getfield        #17  <Field int q2>
	//   14   22:icmpne          37
	//   15   25:aload_1         
	//   16   26:iconst_2        
	//   17   27:iaload          
	//   18   28:aload_0         
	//   19   29:getfield        #19  <Field int q3>
	//   20   32:icmpne          37
	//   21   35:iconst_1        
	//   22   36:ireturn         
	//   23   37:iconst_0        
	//   24   38:ireturn         
	}

	private final int q1;
	private final int q2;
	private final int q3;
}

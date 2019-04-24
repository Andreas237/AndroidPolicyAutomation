// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.core.sym;


// Referenced classes of package com.fasterxml.jackson.core.sym:
//			Name

public final class Name2 extends Name
{

	Name2(String s, int i, int j, int k)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #12  <Method void Name(String, int)>
		q1 = j;
	//    4    6:aload_0         
	//    5    7:iload_3         
	//    6    8:putfield        #14  <Field int q1>
		q2 = k;
	//    7   11:aload_0         
	//    8   12:iload           4
	//    9   14:putfield        #16  <Field int q2>
	//   10   17:return          
	}

	public boolean equals(int i)
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public boolean equals(int i, int j)
	{
		return i == q1 && j == q2;
	//    0    0:iload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #14  <Field int q1>
	//    3    5:icmpne          18
	//    4    8:iload_2         
	//    5    9:aload_0         
	//    6   10:getfield        #16  <Field int q2>
	//    7   13:icmpne          18
	//    8   16:iconst_1        
	//    9   17:ireturn         
	//   10   18:iconst_0        
	//   11   19:ireturn         
	}

	public boolean equals(int i, int j, int k)
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public boolean equals(int ai[], int i)
	{
		return i == 2 && ai[0] == q1 && ai[1] == q2;
	//    0    0:iload_2         
	//    1    1:iconst_2        
	//    2    2:icmpne          27
	//    3    5:aload_1         
	//    4    6:iconst_0        
	//    5    7:iaload          
	//    6    8:aload_0         
	//    7    9:getfield        #14  <Field int q1>
	//    8   12:icmpne          27
	//    9   15:aload_1         
	//   10   16:iconst_1        
	//   11   17:iaload          
	//   12   18:aload_0         
	//   13   19:getfield        #16  <Field int q2>
	//   14   22:icmpne          27
	//   15   25:iconst_1        
	//   16   26:ireturn         
	//   17   27:iconst_0        
	//   18   28:ireturn         
	}

	private final int q1;
	private final int q2;
}

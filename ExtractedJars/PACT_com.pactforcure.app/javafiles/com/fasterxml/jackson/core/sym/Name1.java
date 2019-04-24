// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.core.sym;


// Referenced classes of package com.fasterxml.jackson.core.sym:
//			Name

public final class Name1 extends Name
{

	Name1(String s, int i, int j)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #22  <Method void Name(String, int)>
		q = j;
	//    4    6:aload_0         
	//    5    7:iload_3         
	//    6    8:putfield        #24  <Field int q>
	//    7   11:return          
	}

	public static Name1 getEmptyName()
	{
		return EMPTY;
	//    0    0:getstatic       #18  <Field Name1 EMPTY>
	//    1    3:areturn         
	}

	public boolean equals(int i)
	{
		return i == q;
	//    0    0:iload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #24  <Field int q>
	//    3    5:icmpne          10
	//    4    8:iconst_1        
	//    5    9:ireturn         
	//    6   10:iconst_0        
	//    7   11:ireturn         
	}

	public boolean equals(int i, int j)
	{
		return i == q && j == 0;
	//    0    0:iload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #24  <Field int q>
	//    3    5:icmpne          14
	//    4    8:iload_2         
	//    5    9:ifne            14
	//    6   12:iconst_1        
	//    7   13:ireturn         
	//    8   14:iconst_0        
	//    9   15:ireturn         
	}

	public boolean equals(int i, int j, int k)
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public boolean equals(int ai[], int i)
	{
		return i == 1 && ai[0] == q;
	//    0    0:iload_2         
	//    1    1:iconst_1        
	//    2    2:icmpne          17
	//    3    5:aload_1         
	//    4    6:iconst_0        
	//    5    7:iaload          
	//    6    8:aload_0         
	//    7    9:getfield        #24  <Field int q>
	//    8   12:icmpne          17
	//    9   15:iconst_1        
	//   10   16:ireturn         
	//   11   17:iconst_0        
	//   12   18:ireturn         
	}

	private static final Name1 EMPTY = new Name1("", 0, 0);
	private final int q;

	static 
	{
	//    0    0:new             #2   <Class Name1>
	//    1    3:dup             
	//    2    4:ldc1            #12  <String "">
	//    3    6:iconst_0        
	//    4    7:iconst_0        
	//    5    8:invokespecial   #16  <Method void Name1(String, int, int)>
	//    6   11:putstatic       #18  <Field Name1 EMPTY>
	//*   7   14:return          
	}
}

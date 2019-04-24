// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


public final class zzia
{

	public static int zzd(int i)
	{
		if(i >= 0 && i <= 1)
	//*   0    0:iload_0         
	//*   1    1:iflt            11
	//*   2    4:iload_0         
	//*   3    5:iconst_1        
	//*   4    6:icmpgt          11
			return i;
	//    5    9:iload_0         
	//    6   10:ireturn         
		if(i >= 1000 && i <= 1000)
	//*   7   11:iload_0         
	//*   8   12:sipush          1000
	//*   9   15:icmplt          27
	//*  10   18:iload_0         
	//*  11   19:sipush          1000
	//*  12   22:icmpgt          27
		{
			return i;
	//   13   25:iload_0         
	//   14   26:ireturn         
		} else
		{
			StringBuilder stringbuilder = new StringBuilder(43);
	//   15   27:new             #8   <Class StringBuilder>
	//   16   30:dup             
	//   17   31:bipush          43
	//   18   33:invokespecial   #12  <Method void StringBuilder(int)>
	//   19   36:astore_1        
			stringbuilder.append(i);
	//   20   37:aload_1         
	//   21   38:iload_0         
	//   22   39:invokevirtual   #16  <Method StringBuilder StringBuilder.append(int)>
	//   23   42:pop             
			stringbuilder.append(" is not a valid enum EnumBoolean");
	//   24   43:aload_1         
	//   25   44:ldc1            #18  <String " is not a valid enum EnumBoolean">
	//   26   46:invokevirtual   #21  <Method StringBuilder StringBuilder.append(String)>
	//   27   49:pop             
			throw new IllegalArgumentException(stringbuilder.toString());
	//   28   50:new             #23  <Class IllegalArgumentException>
	//   29   53:dup             
	//   30   54:aload_1         
	//   31   55:invokevirtual   #27  <Method String StringBuilder.toString()>
	//   32   58:invokespecial   #30  <Method void IllegalArgumentException(String)>
	//   33   61:athrow          
		}
	}
}

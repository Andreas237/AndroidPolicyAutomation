// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


public final class ajg
{

	public static int a(int i)
	{
		if(i >= 0 && i <= 2)
	//*   0    0:iload_0         
	//*   1    1:iflt            11
	//*   2    4:iload_0         
	//*   3    5:iconst_2        
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

	public static int b(int i)
	{
		if(i >= 0 && i <= 2)
	//*   0    0:iload_0         
	//*   1    1:iflt            11
	//*   2    4:iload_0         
	//*   3    5:iconst_2        
	//*   4    6:icmpgt          11
		{
			return i;
	//    5    9:iload_0         
	//    6   10:ireturn         
		} else
		{
			StringBuilder stringbuilder = new StringBuilder(41);
	//    7   11:new             #8   <Class StringBuilder>
	//    8   14:dup             
	//    9   15:bipush          41
	//   10   17:invokespecial   #12  <Method void StringBuilder(int)>
	//   11   20:astore_1        
			stringbuilder.append(i);
	//   12   21:aload_1         
	//   13   22:iload_0         
	//   14   23:invokevirtual   #16  <Method StringBuilder StringBuilder.append(int)>
	//   15   26:pop             
			stringbuilder.append(" is not a valid enum ProtoName");
	//   16   27:aload_1         
	//   17   28:ldc1            #34  <String " is not a valid enum ProtoName">
	//   18   30:invokevirtual   #21  <Method StringBuilder StringBuilder.append(String)>
	//   19   33:pop             
			throw new IllegalArgumentException(stringbuilder.toString());
	//   20   34:new             #23  <Class IllegalArgumentException>
	//   21   37:dup             
	//   22   38:aload_1         
	//   23   39:invokevirtual   #27  <Method String StringBuilder.toString()>
	//   24   42:invokespecial   #30  <Method void IllegalArgumentException(String)>
	//   25   45:athrow          
		}
	}

	public static int c(int i)
	{
		if(i >= 0 && i <= 3)
	//*   0    0:iload_0         
	//*   1    1:iflt            11
	//*   2    4:iload_0         
	//*   3    5:iconst_3        
	//*   4    6:icmpgt          11
		{
			return i;
	//    5    9:iload_0         
	//    6   10:ireturn         
		} else
		{
			StringBuilder stringbuilder = new StringBuilder(48);
	//    7   11:new             #8   <Class StringBuilder>
	//    8   14:dup             
	//    9   15:bipush          48
	//   10   17:invokespecial   #12  <Method void StringBuilder(int)>
	//   11   20:astore_1        
			stringbuilder.append(i);
	//   12   21:aload_1         
	//   13   22:iload_0         
	//   14   23:invokevirtual   #16  <Method StringBuilder StringBuilder.append(int)>
	//   15   26:pop             
			stringbuilder.append(" is not a valid enum EncryptionMethod");
	//   16   27:aload_1         
	//   17   28:ldc1            #37  <String " is not a valid enum EncryptionMethod">
	//   18   30:invokevirtual   #21  <Method StringBuilder StringBuilder.append(String)>
	//   19   33:pop             
			throw new IllegalArgumentException(stringbuilder.toString());
	//   20   34:new             #23  <Class IllegalArgumentException>
	//   21   37:dup             
	//   22   38:aload_1         
	//   23   39:invokevirtual   #27  <Method String StringBuilder.toString()>
	//   24   42:invokespecial   #30  <Method void IllegalArgumentException(String)>
	//   25   45:athrow          
		}
	}
}

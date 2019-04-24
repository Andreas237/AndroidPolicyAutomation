// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amazonaws.util;


// Referenced classes of package com.amazonaws.util:
//			StringUtils

public class BinaryUtils
{

	public static String a(byte abyte0[])
	{
		StringBuilder stringbuilder = new StringBuilder(abyte0.length * 2);
	//    0    0:new             #8   <Class StringBuilder>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:arraylength     
	//    4    6:iconst_2        
	//    5    7:imul            
	//    6    8:invokespecial   #12  <Method void StringBuilder(int)>
	//    7   11:astore          4
		for(int i = 0; i < abyte0.length; i++)
	//*   8   13:iconst_0        
	//*   9   14:istore_1        
	//*  10   15:iload_1         
	//*  11   16:aload_0         
	//*  12   17:arraylength     
	//*  13   18:icmpge          81
		{
			String s1 = Integer.toHexString(((int) (abyte0[i])));
	//   14   21:aload_0         
	//   15   22:iload_1         
	//   16   23:baload          
	//   17   24:invokestatic    #18  <Method String Integer.toHexString(int)>
	//   18   27:astore_3        
			String s;
			if(s1.length() == 1)
	//*  19   28:aload_3         
	//*  20   29:invokevirtual   #24  <Method int String.length()>
	//*  21   32:iconst_1        
	//*  22   33:icmpne          49
			{
				stringbuilder.append("0");
	//   23   36:aload           4
	//   24   38:ldc1            #26  <String "0">
	//   25   40:invokevirtual   #30  <Method StringBuilder StringBuilder.append(String)>
	//   26   43:pop             
				s = s1;
	//   27   44:aload_3         
	//   28   45:astore_2        
			} else
	//*  29   46:goto            67
			{
				s = s1;
	//   30   49:aload_3         
	//   31   50:astore_2        
				if(s1.length() == 8)
	//*  32   51:aload_3         
	//*  33   52:invokevirtual   #24  <Method int String.length()>
	//*  34   55:bipush          8
	//*  35   57:icmpne          67
					s = s1.substring(6);
	//   36   60:aload_3         
	//   37   61:bipush          6
	//   38   63:invokevirtual   #33  <Method String String.substring(int)>
	//   39   66:astore_2        
			}
			stringbuilder.append(s);
	//   40   67:aload           4
	//   41   69:aload_2         
	//   42   70:invokevirtual   #30  <Method StringBuilder StringBuilder.append(String)>
	//   43   73:pop             
		}

	//   44   74:iload_1         
	//   45   75:iconst_1        
	//   46   76:iadd            
	//   47   77:istore_1        
	//*  48   78:goto            15
		return StringUtils.a(stringbuilder.toString());
	//   49   81:aload           4
	//   50   83:invokevirtual   #37  <Method String StringBuilder.toString()>
	//   51   86:invokestatic    #42  <Method String StringUtils.a(String)>
	//   52   89:areturn         
	}
}

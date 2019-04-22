// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind;


// Referenced classes of package com.fasterxml.jackson.databind:
//			PropertyNamingStrategy

public static class PropertyNamingStrategy$KebabCaseStrategy extends tegyBase
{

	public String translate(String s)
	{
		if(s == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       6
			return s;
	//    2    4:aload_1         
	//    3    5:areturn         
		int k = s.length();
	//    4    6:aload_1         
	//    5    7:invokevirtual   #20  <Method int String.length()>
	//    6   10:istore          6
		if(k == 0)
	//*   7   12:iload           6
	//*   8   14:ifne            19
			return s;
	//    9   17:aload_1         
	//   10   18:areturn         
		StringBuilder stringbuilder = new StringBuilder((k >> 1) + k);
	//   11   19:new             #22  <Class StringBuilder>
	//   12   22:dup             
	//   13   23:iload           6
	//   14   25:iconst_1        
	//   15   26:ishr            
	//   16   27:iload           6
	//   17   29:iadd            
	//   18   30:invokespecial   #25  <Method void StringBuilder(int)>
	//   19   33:astore          7
		int j = 0;
	//   20   35:iconst_0        
	//   21   36:istore          5
		int i = 0;
	//   22   38:iconst_0        
	//   23   39:istore          4
		for(; j < k; j++)
	//*  24   41:iload           5
	//*  25   43:iload           6
	//*  26   45:icmpge          132
		{
			char c = s.charAt(j);
	//   27   48:aload_1         
	//   28   49:iload           5
	//   29   51:invokevirtual   #29  <Method char String.charAt(int)>
	//   30   54:istore_2        
			char c1 = Character.toLowerCase(c);
	//   31   55:iload_2         
	//   32   56:invokestatic    #35  <Method char Character.toLowerCase(char)>
	//   33   59:istore_3        
			if(c1 == c)
	//*  34   60:iload_3         
	//*  35   61:iload_2         
	//*  36   62:icmpne          92
			{
				if(i > 1)
	//*  37   65:iload           4
	//*  38   67:iconst_1        
	//*  39   68:icmple          86
					stringbuilder.insert(stringbuilder.length() - 1, '-');
	//   40   71:aload           7
	//   41   73:aload           7
	//   42   75:invokevirtual   #36  <Method int StringBuilder.length()>
	//   43   78:iconst_1        
	//   44   79:isub            
	//   45   80:bipush          45
	//   46   82:invokevirtual   #40  <Method StringBuilder StringBuilder.insert(int, char)>
	//   47   85:pop             
				i = 0;
	//   48   86:iconst_0        
	//   49   87:istore          4
			} else
	//*  50   89:goto            116
			{
				if(i == 0 && j > 0)
	//*  51   92:iload           4
	//*  52   94:ifne            110
	//*  53   97:iload           5
	//*  54   99:ifle            110
					stringbuilder.append('-');
	//   55  102:aload           7
	//   56  104:bipush          45
	//   57  106:invokevirtual   #44  <Method StringBuilder StringBuilder.append(char)>
	//   58  109:pop             
				i++;
	//   59  110:iload           4
	//   60  112:iconst_1        
	//   61  113:iadd            
	//   62  114:istore          4
			}
			stringbuilder.append(c1);
	//   63  116:aload           7
	//   64  118:iload_3         
	//   65  119:invokevirtual   #44  <Method StringBuilder StringBuilder.append(char)>
	//   66  122:pop             
		}

	//   67  123:iload           5
	//   68  125:iconst_1        
	//   69  126:iadd            
	//   70  127:istore          5
	//*  71  129:goto            41
		return stringbuilder.toString();
	//   72  132:aload           7
	//   73  134:invokevirtual   #48  <Method String StringBuilder.toString()>
	//   74  137:areturn         
	}

	public PropertyNamingStrategy$KebabCaseStrategy()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void PropertyNamingStrategy$PropertyNamingStrategyBase()>
	//    2    4:return          
	}
}

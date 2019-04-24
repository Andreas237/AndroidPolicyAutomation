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
		int k;
		if(s != null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       6
	//*   2    4:aload_1         
	//*   3    5:areturn         
	//*   4    6:aload_1         
	//*   5    7:invokevirtual   #20  <Method int String.length()>
	//*   6   10:istore          6
			if((k = s.length()) != 0)
	//*   7   12:iload           6
	//*   8   14:ifeq            4
			{
				StringBuilder stringbuilder = new StringBuilder((k >> 1) + k);
	//    9   17:new             #22  <Class StringBuilder>
	//   10   20:dup             
	//   11   21:iload           6
	//   12   23:iconst_1        
	//   13   24:ishr            
	//   14   25:iload           6
	//   15   27:iadd            
	//   16   28:invokespecial   #25  <Method void StringBuilder(int)>
	//   17   31:astore          7
				int i = 0;
	//   18   33:iconst_0        
	//   19   34:istore          4
				int j = 0;
	//   20   36:iconst_0        
	//   21   37:istore          5
				while(j < k) 
	//*  22   39:iload           5
	//*  23   41:iload           6
	//*  24   43:icmpge          130
				{
					char c = s.charAt(j);
	//   25   46:aload_1         
	//   26   47:iload           5
	//   27   49:invokevirtual   #29  <Method char String.charAt(int)>
	//   28   52:istore_2        
					char c1 = Character.toLowerCase(c);
	//   29   53:iload_2         
	//   30   54:invokestatic    #35  <Method char Character.toLowerCase(char)>
	//   31   57:istore_3        
					if(c1 == c)
	//*  32   58:iload_3         
	//*  33   59:iload_2         
	//*  34   60:icmpne          103
					{
						if(i > 1)
	//*  35   63:iload           4
	//*  36   65:iconst_1        
	//*  37   66:icmple          84
							stringbuilder.insert(stringbuilder.length() - 1, '-');
	//   38   69:aload           7
	//   39   71:aload           7
	//   40   73:invokevirtual   #36  <Method int StringBuilder.length()>
	//   41   76:iconst_1        
	//   42   77:isub            
	//   43   78:bipush          45
	//   44   80:invokevirtual   #40  <Method StringBuilder StringBuilder.insert(int, char)>
	//   45   83:pop             
						i = 0;
	//   46   84:iconst_0        
	//   47   85:istore          4
					} else
	//*  48   87:aload           7
	//*  49   89:iload_3         
	//*  50   90:invokevirtual   #44  <Method StringBuilder StringBuilder.append(char)>
	//*  51   93:pop             
	//*  52   94:iload           5
	//*  53   96:iconst_1        
	//*  54   97:iadd            
	//*  55   98:istore          5
	//*  56  100:goto            39
					{
						if(i == 0 && j > 0)
	//*  57  103:iload           4
	//*  58  105:ifne            121
	//*  59  108:iload           5
	//*  60  110:ifle            121
							stringbuilder.append('-');
	//   61  113:aload           7
	//   62  115:bipush          45
	//   63  117:invokevirtual   #44  <Method StringBuilder StringBuilder.append(char)>
	//   64  120:pop             
						i++;
	//   65  121:iload           4
	//   66  123:iconst_1        
	//   67  124:iadd            
	//   68  125:istore          4
					}
					stringbuilder.append(c1);
					j++;
				}
	//*  69  127:goto            87
				return stringbuilder.toString();
	//   70  130:aload           7
	//   71  132:invokevirtual   #48  <Method String StringBuilder.toString()>
	//   72  135:areturn         
			}
		return s;
	}

	public PropertyNamingStrategy$KebabCaseStrategy()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void PropertyNamingStrategy$PropertyNamingStrategyBase()>
	//    2    4:return          
	}
}

// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind;


// Referenced classes of package com.fasterxml.jackson.databind:
//			PropertyNamingStrategy

public static class PropertyNamingStrategy$SnakeCaseStrategy extends tegyBase
{

	public String translate(String s)
	{
		if(s == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       6
			return s;
	//    2    4:aload_1         
	//    3    5:areturn         
		int j1 = s.length();
	//    4    6:aload_1         
	//    5    7:invokevirtual   #20  <Method int String.length()>
	//    6   10:istore          8
		StringBuilder stringbuilder = new StringBuilder(j1 * 2);
	//    7   12:new             #22  <Class StringBuilder>
	//    8   15:dup             
	//    9   16:iload           8
	//   10   18:iconst_2        
	//   11   19:imul            
	//   12   20:invokespecial   #25  <Method void StringBuilder(int)>
	//   13   23:astore          9
		int k = 0;
	//   14   25:iconst_0        
	//   15   26:istore          5
		int i = 0;
	//   16   28:iconst_0        
	//   17   29:istore_3        
		int j;
		for(int l = 0; k < j1; l = j)
	//*  18   30:iconst_0        
	//*  19   31:istore          6
	//*  20   33:iload           5
	//*  21   35:iload           8
	//*  22   37:icmpge          165
		{
			int i1;
label0:
			{
				char c = s.charAt(k);
	//   23   40:aload_1         
	//   24   41:iload           5
	//   25   43:invokevirtual   #29  <Method char String.charAt(int)>
	//   26   46:istore_2        
				if(k <= 0)
	//*  27   47:iload           5
	//*  28   49:ifgt            65
				{
					i1 = i;
	//   29   52:iload_3         
	//   30   53:istore          7
					j = l;
	//   31   55:iload           6
	//   32   57:istore          4
					if(c == '_')
						break label0;
	//   33   59:iload_2         
	//   34   60:bipush          95
	//   35   62:icmpeq          149
				}
				if(Character.isUpperCase(c))
	//*  36   65:iload_2         
	//*  37   66:invokestatic    #35  <Method boolean Character.isUpperCase(char)>
	//*  38   69:ifeq            134
				{
					j = i;
	//   39   72:iload_3         
	//   40   73:istore          4
					if(l == 0)
	//*  41   75:iload           6
	//*  42   77:ifne            116
					{
						j = i;
	//   43   80:iload_3         
	//   44   81:istore          4
						if(i > 0)
	//*  45   83:iload_3         
	//*  46   84:ifle            116
						{
							j = i;
	//   47   87:iload_3         
	//   48   88:istore          4
							if(stringbuilder.charAt(i - 1) != '_')
	//*  49   90:aload           9
	//*  50   92:iload_3         
	//*  51   93:iconst_1        
	//*  52   94:isub            
	//*  53   95:invokevirtual   #36  <Method char StringBuilder.charAt(int)>
	//*  54   98:bipush          95
	//*  55  100:icmpeq          116
							{
								stringbuilder.append('_');
	//   56  103:aload           9
	//   57  105:bipush          95
	//   58  107:invokevirtual   #40  <Method StringBuilder StringBuilder.append(char)>
	//   59  110:pop             
								j = i + 1;
	//   60  111:iload_3         
	//   61  112:iconst_1        
	//   62  113:iadd            
	//   63  114:istore          4
							}
						}
					}
					c = Character.toLowerCase(c);
	//   64  116:iload_2         
	//   65  117:invokestatic    #44  <Method char Character.toLowerCase(char)>
	//   66  120:istore_2        
					l = 1;
	//   67  121:iconst_1        
	//   68  122:istore          6
					i = j;
	//   69  124:iload           4
	//   70  126:istore_3        
					j = l;
	//   71  127:iload           6
	//   72  129:istore          4
				} else
	//*  73  131:goto            137
				{
					j = 0;
	//   74  134:iconst_0        
	//   75  135:istore          4
				}
				stringbuilder.append(c);
	//   76  137:aload           9
	//   77  139:iload_2         
	//   78  140:invokevirtual   #40  <Method StringBuilder StringBuilder.append(char)>
	//   79  143:pop             
				i1 = i + 1;
	//   80  144:iload_3         
	//   81  145:iconst_1        
	//   82  146:iadd            
	//   83  147:istore          7
			}
			k++;
	//   84  149:iload           5
	//   85  151:iconst_1        
	//   86  152:iadd            
	//   87  153:istore          5
			i = i1;
	//   88  155:iload           7
	//   89  157:istore_3        
		}

	//   90  158:iload           4
	//   91  160:istore          6
	//*  92  162:goto            33
		if(i > 0)
	//*  93  165:iload_3         
	//*  94  166:ifle            175
			s = stringbuilder.toString();
	//   95  169:aload           9
	//   96  171:invokevirtual   #48  <Method String StringBuilder.toString()>
	//   97  174:astore_1        
		return s;
	//   98  175:aload_1         
	//   99  176:areturn         
	}

	public PropertyNamingStrategy$SnakeCaseStrategy()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void PropertyNamingStrategy$PropertyNamingStrategyBase()>
	//    2    4:return          
	}
}

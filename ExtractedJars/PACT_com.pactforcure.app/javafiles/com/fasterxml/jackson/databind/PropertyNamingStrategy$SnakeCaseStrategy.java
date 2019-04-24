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
		if(s != null) goto _L2; else goto _L1
	//    0    0:aload_1         
	//    1    1:ifnonnull       6
_L1:
		return s;
	//    2    4:aload_1         
	//    3    5:areturn         
_L2:
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
		int i = 0;
	//   14   25:iconst_0        
	//   15   26:istore_3        
		int l = 0;
	//   16   27:iconst_0        
	//   17   28:istore          6
		int k = 0;
	//   18   30:iconst_0        
	//   19   31:istore          5
		while(k < j1) 
	//*  20   33:iload           5
	//*  21   35:iload           8
	//*  22   37:icmpge          167
		{
label0:
			{
				char c = s.charAt(k);
	//   23   40:aload_1         
	//   24   41:iload           5
	//   25   43:invokevirtual   #29  <Method char String.charAt(int)>
	//   26   46:istore_2        
				int j;
				int i1;
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
	//   35   62:icmpeq          139
				}
				if(Character.isUpperCase(c))
	//*  36   65:iload_2         
	//*  37   66:invokestatic    #35  <Method boolean Character.isUpperCase(char)>
	//*  38   69:ifeq            155
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
					i = 1;
	//   67  121:iconst_1        
	//   68  122:istore_3        
				} else
	//*  69  123:aload           9
	//*  70  125:iload_2         
	//*  71  126:invokevirtual   #40  <Method StringBuilder StringBuilder.append(char)>
	//*  72  129:pop             
	//*  73  130:iload           4
	//*  74  132:iconst_1        
	//*  75  133:iadd            
	//*  76  134:istore          7
	//*  77  136:iload_3         
	//*  78  137:istore          4
	//*  79  139:iload           5
	//*  80  141:iconst_1        
	//*  81  142:iadd            
	//*  82  143:istore          5
	//*  83  145:iload           7
	//*  84  147:istore_3        
	//*  85  148:iload           4
	//*  86  150:istore          6
	//*  87  152:goto            33
				{
					boolean flag = false;
	//   88  155:iconst_0        
	//   89  156:istore          6
					j = i;
	//   90  158:iload_3         
	//   91  159:istore          4
					i = ((int) (flag));
	//   92  161:iload           6
	//   93  163:istore_3        
				}
				stringbuilder.append(c);
				i1 = j + 1;
				j = i;
			}
			k++;
			i = i1;
			l = j;
		}
	//*  94  164:goto            123
		if(i > 0)
	//*  95  167:iload_3         
	//*  96  168:ifle            4
			return stringbuilder.toString();
	//   97  171:aload           9
	//   98  173:invokevirtual   #48  <Method String StringBuilder.toString()>
	//   99  176:areturn         
		if(true) goto _L1; else goto _L3
_L3:
	}

	public PropertyNamingStrategy$SnakeCaseStrategy()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void PropertyNamingStrategy$PropertyNamingStrategyBase()>
	//    2    4:return          
	}
}

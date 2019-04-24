// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.raizlabs.android.dbflow.config;

import java.util.Comparator;

public class NaturalOrderComparator
	implements Comparator
{

	public NaturalOrderComparator()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
	//    2    4:return          
	}

	static char charAt(String s, int i)
	{
		if(i >= s.length())
	//*   0    0:iload_1         
	//*   1    1:aload_0         
	//*   2    2:invokevirtual   #20  <Method int String.length()>
	//*   3    5:icmplt          10
			return '\0';
	//    4    8:iconst_0        
	//    5    9:ireturn         
		else
			return s.charAt(i);
	//    6   10:aload_0         
	//    7   11:iload_1         
	//    8   12:invokevirtual   #23  <Method char String.charAt(int)>
	//    9   15:ireturn         
	}

	public int compare(Object obj, Object obj1)
	{
		obj = ((Object) (obj.toString()));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #29  <Method String Object.toString()>
	//    2    4:astore_1        
		obj1 = ((Object) (obj1.toString()));
	//    3    5:aload_2         
	//    4    6:invokevirtual   #29  <Method String Object.toString()>
	//    5    9:astore_2        
		int j = 0;
	//    6   10:iconst_0        
	//    7   11:istore          7
		int i = 0;
	//    8   13:iconst_0        
	//    9   14:istore          6
		do
		{
			boolean flag = false;
	//   10   16:iconst_0        
	//   11   17:istore          11
			int l = 0;
	//   12   19:iconst_0        
	//   13   20:istore          9
			char c = charAt(((String) (obj)), j);
	//   14   22:aload_1         
	//   15   23:iload           7
	//   16   25:invokestatic    #31  <Method char charAt(String, int)>
	//   17   28:istore_3        
			char c2 = charAt(((String) (obj1)), i);
	//   18   29:aload_2         
	//   19   30:iload           6
	//   20   32:invokestatic    #31  <Method char charAt(String, int)>
	//   21   35:istore          5
			int k = j;
	//   22   37:iload           7
	//   23   39:istore          8
			char c1;
			int i1;
			do
			{
				if(!Character.isSpaceChar(c))
	//*  24   41:iload_3         
	//*  25   42:invokestatic    #37  <Method boolean Character.isSpaceChar(char)>
	//*  26   45:ifne            66
				{
					c1 = c2;
	//   27   48:iload           5
	//   28   50:istore          4
					j = i;
	//   29   52:iload           6
	//   30   54:istore          7
					i1 = ((int) (flag));
	//   31   56:iload           11
	//   32   58:istore          10
					if(c != '0')
						break;
	//   33   60:iload_3         
	//   34   61:bipush          48
	//   35   63:icmpne          104
				}
				if(c == '0')
	//*  36   66:iload_3         
	//*  37   67:bipush          48
	//*  38   69:icmpne          98
					j = l + 1;
	//   39   72:iload           9
	//   40   74:iconst_1        
	//   41   75:iadd            
	//   42   76:istore          7
				else
	//*  43   78:iload           8
	//*  44   80:iconst_1        
	//*  45   81:iadd            
	//*  46   82:istore          8
	//*  47   84:aload_1         
	//*  48   85:iload           8
	//*  49   87:invokestatic    #31  <Method char charAt(String, int)>
	//*  50   90:istore_3        
	//*  51   91:iload           7
	//*  52   93:istore          9
	//*  53   95:goto            41
					j = 0;
	//   54   98:iconst_0        
	//   55   99:istore          7
				k++;
				c = charAt(((String) (obj)), k);
				l = j;
			} while(true);
	//   56  101:goto            78
			while(Character.isSpaceChar(c1) || c1 == '0') 
	//*  57  104:iload           4
	//*  58  106:invokestatic    #37  <Method boolean Character.isSpaceChar(char)>
	//*  59  109:ifne            119
	//*  60  112:iload           4
	//*  61  114:bipush          48
	//*  62  116:icmpne          159
			{
				if(c1 == '0')
	//*  63  119:iload           4
	//*  64  121:bipush          48
	//*  65  123:icmpne          153
					i = i1 + 1;
	//   66  126:iload           10
	//   67  128:iconst_1        
	//   68  129:iadd            
	//   69  130:istore          6
				else
	//*  70  132:iload           7
	//*  71  134:iconst_1        
	//*  72  135:iadd            
	//*  73  136:istore          7
	//*  74  138:aload_2         
	//*  75  139:iload           7
	//*  76  141:invokestatic    #31  <Method char charAt(String, int)>
	//*  77  144:istore          4
	//*  78  146:iload           6
	//*  79  148:istore          10
	//*  80  150:goto            104
					i = 0;
	//   81  153:iconst_0        
	//   82  154:istore          6
				j++;
				c1 = charAt(((String) (obj1)), j);
				i1 = i;
			}
	//*  83  156:goto            132
			if(Character.isDigit(c) && Character.isDigit(c1))
	//*  84  159:iload_3         
	//*  85  160:invokestatic    #40  <Method boolean Character.isDigit(char)>
	//*  86  163:ifeq            200
	//*  87  166:iload           4
	//*  88  168:invokestatic    #40  <Method boolean Character.isDigit(char)>
	//*  89  171:ifeq            200
			{
				i = compareRight(((String) (obj)).substring(k), ((String) (obj1)).substring(j));
	//   90  174:aload_0         
	//   91  175:aload_1         
	//   92  176:iload           8
	//   93  178:invokevirtual   #44  <Method String String.substring(int)>
	//   94  181:aload_2         
	//   95  182:iload           7
	//   96  184:invokevirtual   #44  <Method String String.substring(int)>
	//   97  187:invokevirtual   #48  <Method int compareRight(String, String)>
	//   98  190:istore          6
				if(i != 0)
	//*  99  192:iload           6
	//* 100  194:ifeq            200
					return i;
	//  101  197:iload           6
	//  102  199:ireturn         
			}
			if(c == 0 && c1 == 0)
	//* 103  200:iload_3         
	//* 104  201:ifne            215
	//* 105  204:iload           4
	//* 106  206:ifne            215
				return l - i1;
	//  107  209:iload           9
	//  108  211:iload           10
	//  109  213:isub            
	//  110  214:ireturn         
			if(c < c1)
	//* 111  215:iload_3         
	//* 112  216:iload           4
	//* 113  218:icmpge          223
				return -1;
	//  114  221:iconst_m1       
	//  115  222:ireturn         
			if(c > c1)
	//* 116  223:iload_3         
	//* 117  224:iload           4
	//* 118  226:icmple          231
				return 1;
	//  119  229:iconst_1        
	//  120  230:ireturn         
			i = k + 1;
	//  121  231:iload           8
	//  122  233:iconst_1        
	//  123  234:iadd            
	//  124  235:istore          6
			k = j + 1;
	//  125  237:iload           7
	//  126  239:iconst_1        
	//  127  240:iadd            
	//  128  241:istore          8
			j = i;
	//  129  243:iload           6
	//  130  245:istore          7
			i = k;
	//  131  247:iload           8
	//  132  249:istore          6
		} while(true);
	//  133  251:goto            16
	}

	int compareRight(String s, String s1)
	{
		int j;
		int k;
		int l;
		l = 0;
	//    0    0:iconst_0        
	//    1    1:istore          8
		k = 0;
	//    2    3:iconst_0        
	//    3    4:istore          7
		j = 0;
	//    4    6:iconst_0        
	//    5    7:istore          6
_L2:
		char c;
		char c1;
		int i;
		c = charAt(s, k);
	//    6    9:aload_1         
	//    7   10:iload           7
	//    8   12:invokestatic    #31  <Method char charAt(String, int)>
	//    9   15:istore_3        
		c1 = charAt(s1, j);
	//   10   16:aload_2         
	//   11   17:iload           6
	//   12   19:invokestatic    #31  <Method char charAt(String, int)>
	//   13   22:istore          4
		if(!Character.isDigit(c) && !Character.isDigit(c1))
	//*  14   24:iload_3         
	//*  15   25:invokestatic    #40  <Method boolean Character.isDigit(char)>
	//*  16   28:ifne            42
	//*  17   31:iload           4
	//*  18   33:invokestatic    #40  <Method boolean Character.isDigit(char)>
	//*  19   36:ifne            42
			return l;
	//   20   39:iload           8
	//   21   41:ireturn         
		if(!Character.isDigit(c))
	//*  22   42:iload_3         
	//*  23   43:invokestatic    #40  <Method boolean Character.isDigit(char)>
	//*  24   46:ifne            51
			return -1;
	//   25   49:iconst_m1       
	//   26   50:ireturn         
		if(!Character.isDigit(c1))
	//*  27   51:iload           4
	//*  28   53:invokestatic    #40  <Method boolean Character.isDigit(char)>
	//*  29   56:ifne            61
			return 1;
	//   30   59:iconst_1        
	//   31   60:ireturn         
		if(c >= c1)
			break; /* Loop/switch isn't completed */
	//   32   61:iload_3         
	//   33   62:iload           4
	//   34   64:icmpge          98
		i = l;
	//   35   67:iload           8
	//   36   69:istore          5
		if(l == 0)
	//*  37   71:iload           8
	//*  38   73:ifne            79
			i = -1;
	//   39   76:iconst_m1       
	//   40   77:istore          5
_L3:
		k++;
	//   41   79:iload           7
	//   42   81:iconst_1        
	//   43   82:iadd            
	//   44   83:istore          7
		j++;
	//   45   85:iload           6
	//   46   87:iconst_1        
	//   47   88:iadd            
	//   48   89:istore          6
		l = i;
	//   49   91:iload           5
	//   50   93:istore          8
		if(true) goto _L2; else goto _L1
	//   51   95:goto            9
_L1:
		if(c > c1)
	//*  52   98:iload_3         
	//*  53   99:iload           4
	//*  54  101:icmple          119
		{
			i = l;
	//   55  104:iload           8
	//   56  106:istore          5
			if(l == 0)
	//*  57  108:iload           8
	//*  58  110:ifne            79
				i = 1;
	//   59  113:iconst_1        
	//   60  114:istore          5
		} else
	//*  61  116:goto            79
		{
			i = l;
	//   62  119:iload           8
	//   63  121:istore          5
			if(c == 0)
	//*  64  123:iload_3         
	//*  65  124:ifne            79
			{
				i = l;
	//   66  127:iload           8
	//   67  129:istore          5
				if(c1 == 0)
	//*  68  131:iload           4
	//*  69  133:ifne            79
					return l;
	//   70  136:iload           8
	//   71  138:ireturn         
			}
		}
		  goto _L3
		if(true) goto _L2; else goto _L4
_L4:
	}
}

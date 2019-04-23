// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer.util;

import android.net.Uri;
import android.text.TextUtils;

public final class UriUtil
{

	private UriUtil()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void Object()>
	//    2    4:return          
	}

	private static int[] getUriIndices(String s)
	{
		int i;
		int j;
		int ai[];
label0:
		{
			ai = new int[4];
	//    0    0:iconst_4        
	//    1    1:newarray        int[]
	//    2    3:astore          6
			if(TextUtils.isEmpty(((CharSequence) (s))))
	//*   3    5:aload_0         
	//*   4    6:invokestatic    #28  <Method boolean TextUtils.isEmpty(CharSequence)>
	//*   5    9:ifeq            20
			{
				ai[0] = -1;
	//    6   12:aload           6
	//    7   14:iconst_0        
	//    8   15:iconst_m1       
	//    9   16:iastore         
				return ai;
	//   10   17:aload           6
	//   11   19:areturn         
			}
			j = s.length();
	//   12   20:aload_0         
	//   13   21:invokevirtual   #34  <Method int String.length()>
	//   14   24:istore_2        
			i = s.indexOf('#');
	//   15   25:aload_0         
	//   16   26:bipush          35
	//   17   28:invokevirtual   #38  <Method int String.indexOf(int)>
	//   18   31:istore_1        
			if(i != -1)
	//*  19   32:iload_1         
	//*  20   33:iconst_m1       
	//*  21   34:icmpne          40
	//*  22   37:goto            42
				j = i;
	//   23   40:iload_1         
	//   24   41:istore_2        
			int k = s.indexOf('?');
	//   25   42:aload_0         
	//   26   43:bipush          63
	//   27   45:invokevirtual   #38  <Method int String.indexOf(int)>
	//   28   48:istore_3        
			if(k != -1)
	//*  29   49:iload_3         
	//*  30   50:iconst_m1       
	//*  31   51:icmpeq          61
			{
				i = k;
	//   32   54:iload_3         
	//   33   55:istore_1        
				if(k <= j)
					break label0;
	//   34   56:iload_3         
	//   35   57:iload_2         
	//   36   58:icmple          63
			}
			i = j;
	//   37   61:iload_2         
	//   38   62:istore_1        
		}
		int l;
label1:
		{
			int i1 = s.indexOf('/');
	//   39   63:aload_0         
	//   40   64:bipush          47
	//   41   66:invokevirtual   #38  <Method int String.indexOf(int)>
	//   42   69:istore          4
			if(i1 != -1)
	//*  43   71:iload           4
	//*  44   73:iconst_m1       
	//*  45   74:icmpeq          86
			{
				l = i1;
	//   46   77:iload           4
	//   47   79:istore_3        
				if(i1 <= i)
					break label1;
	//   48   80:iload           4
	//   49   82:iload_1         
	//   50   83:icmple          88
			}
			l = i;
	//   51   86:iload_1         
	//   52   87:istore_3        
		}
		int j1;
label2:
		{
			int k1 = s.indexOf(':');
	//   53   88:aload_0         
	//   54   89:bipush          58
	//   55   91:invokevirtual   #38  <Method int String.indexOf(int)>
	//   56   94:istore          5
			j1 = k1;
	//   57   96:iload           5
	//   58   98:istore          4
			if(k1 > l)
	//*  59  100:iload           5
	//*  60  102:iload_3         
	//*  61  103:icmple          109
				j1 = -1;
	//   62  106:iconst_m1       
	//   63  107:istore          4
			l = j1 + 2;
	//   64  109:iload           4
	//   65  111:iconst_2        
	//   66  112:iadd            
	//   67  113:istore_3        
			boolean flag;
			if(l < i && s.charAt(j1 + 1) == '/' && s.charAt(l) == '/')
	//*  68  114:iload_3         
	//*  69  115:iload_1         
	//*  70  116:icmpge          147
	//*  71  119:aload_0         
	//*  72  120:iload           4
	//*  73  122:iconst_1        
	//*  74  123:iadd            
	//*  75  124:invokevirtual   #42  <Method char String.charAt(int)>
	//*  76  127:bipush          47
	//*  77  129:icmpne          147
	//*  78  132:aload_0         
	//*  79  133:iload_3         
	//*  80  134:invokevirtual   #42  <Method char String.charAt(int)>
	//*  81  137:bipush          47
	//*  82  139:icmpne          147
				flag = true;
	//   83  142:iconst_1        
	//   84  143:istore_3        
			else
	//*  85  144:goto            149
				flag = false;
	//   86  147:iconst_0        
	//   87  148:istore_3        
			if(flag)
	//*  88  149:iload_3         
	//*  89  150:ifeq            185
			{
				int l1 = s.indexOf('/', j1 + 3);
	//   90  153:aload_0         
	//   91  154:bipush          47
	//   92  156:iload           4
	//   93  158:iconst_3        
	//   94  159:iadd            
	//   95  160:invokevirtual   #45  <Method int String.indexOf(int, int)>
	//   96  163:istore          5
				if(l1 != -1)
	//*  97  165:iload           5
	//*  98  167:iconst_m1       
	//*  99  168:icmpeq          180
				{
					flag = ((boolean) (l1));
	//  100  171:iload           5
	//  101  173:istore_3        
					if(l1 <= i)
						break label2;
	//  102  174:iload           5
	//  103  176:iload_1         
	//  104  177:icmple          190
				}
				flag = ((boolean) (i));
	//  105  180:iload_1         
	//  106  181:istore_3        
			} else
	//* 107  182:goto            190
			{
				flag = ((boolean) (j1 + 1));
	//  108  185:iload           4
	//  109  187:iconst_1        
	//  110  188:iadd            
	//  111  189:istore_3        
			}
		}
		ai[0] = j1;
	//  112  190:aload           6
	//  113  192:iconst_0        
	//  114  193:iload           4
	//  115  195:iastore         
		ai[1] = ((int) (flag));
	//  116  196:aload           6
	//  117  198:iconst_1        
	//  118  199:iload_3         
	//  119  200:iastore         
		ai[2] = i;
	//  120  201:aload           6
	//  121  203:iconst_2        
	//  122  204:iload_1         
	//  123  205:iastore         
		ai[3] = j;
	//  124  206:aload           6
	//  125  208:iconst_3        
	//  126  209:iload_2         
	//  127  210:iastore         
		return ai;
	//  128  211:aload           6
	//  129  213:areturn         
	}

	private static String removeDotSegments(StringBuilder stringbuilder, int i, int j)
	{
		if(i >= j)
	//*   0    0:iload_1         
	//*   1    1:iload_2         
	//*   2    2:icmplt          10
			return stringbuilder.toString();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #53  <Method String StringBuilder.toString()>
	//    5    9:areturn         
		int k = i;
	//    6   10:iload_1         
	//    7   11:istore_3        
		if(stringbuilder.charAt(i) == '/')
	//*   8   12:aload_0         
	//*   9   13:iload_1         
	//*  10   14:invokevirtual   #54  <Method char StringBuilder.charAt(int)>
	//*  11   17:bipush          47
	//*  12   19:icmpne          26
			k = i + 1;
	//   13   22:iload_1         
	//   14   23:iconst_1        
	//   15   24:iadd            
	//   16   25:istore_3        
		int l = k;
	//   17   26:iload_3         
	//   18   27:istore          4
		i = l;
	//   19   29:iload           4
	//   20   31:istore_1        
label0:
		do
		{
label1:
			{
				if(i > j)
					break label0;
	//   21   32:iload_1         
	//   22   33:iload_2         
	//   23   34:icmpgt          209
				int i1;
				if(i == j)
	//*  24   37:iload_1         
	//*  25   38:iload_2         
	//*  26   39:icmpne          48
				{
					i1 = i;
	//   27   42:iload_1         
	//   28   43:istore          5
				} else
	//*  29   45:goto            63
				{
					if(stringbuilder.charAt(i) != '/')
						break label1;
	//   30   48:aload_0         
	//   31   49:iload_1         
	//   32   50:invokevirtual   #54  <Method char StringBuilder.charAt(int)>
	//   33   53:bipush          47
	//   34   55:icmpne          202
					i1 = i + 1;
	//   35   58:iload_1         
	//   36   59:iconst_1        
	//   37   60:iadd            
	//   38   61:istore          5
				}
				int j1 = l + 1;
	//   39   63:iload           4
	//   40   65:iconst_1        
	//   41   66:iadd            
	//   42   67:istore          6
				if(i == j1 && stringbuilder.charAt(l) == '.')
	//*  43   69:iload_1         
	//*  44   70:iload           6
	//*  45   72:icmpne          109
	//*  46   75:aload_0         
	//*  47   76:iload           4
	//*  48   78:invokevirtual   #54  <Method char StringBuilder.charAt(int)>
	//*  49   81:bipush          46
	//*  50   83:icmpne          109
				{
					stringbuilder.delete(l, i1);
	//   51   86:aload_0         
	//   52   87:iload           4
	//   53   89:iload           5
	//   54   91:invokevirtual   #58  <Method StringBuilder StringBuilder.delete(int, int)>
	//   55   94:pop             
					j -= i1 - l;
	//   56   95:iload_2         
	//   57   96:iload           5
	//   58   98:iload           4
	//   59  100:isub            
	//   60  101:isub            
	//   61  102:istore_2        
					i = l;
	//   62  103:iload           4
	//   63  105:istore_1        
				} else
	//*  64  106:goto            190
				if(i == l + 2 && stringbuilder.charAt(l) == '.' && stringbuilder.charAt(j1) == '.')
	//*  65  109:iload_1         
	//*  66  110:iload           4
	//*  67  112:iconst_2        
	//*  68  113:iadd            
	//*  69  114:icmpne          186
	//*  70  117:aload_0         
	//*  71  118:iload           4
	//*  72  120:invokevirtual   #54  <Method char StringBuilder.charAt(int)>
	//*  73  123:bipush          46
	//*  74  125:icmpne          186
	//*  75  128:aload_0         
	//*  76  129:iload           6
	//*  77  131:invokevirtual   #54  <Method char StringBuilder.charAt(int)>
	//*  78  134:bipush          46
	//*  79  136:icmpne          186
				{
					i = stringbuilder.lastIndexOf("/", l - 2) + 1;
	//   80  139:aload_0         
	//   81  140:ldc1            #60  <String "/">
	//   82  142:iload           4
	//   83  144:iconst_2        
	//   84  145:isub            
	//   85  146:invokevirtual   #64  <Method int StringBuilder.lastIndexOf(String, int)>
	//   86  149:iconst_1        
	//   87  150:iadd            
	//   88  151:istore_1        
					if(i > k)
	//*  89  152:iload_1         
	//*  90  153:iload_3         
	//*  91  154:icmple          163
						l = i;
	//   92  157:iload_1         
	//   93  158:istore          4
					else
	//*  94  160:goto            166
						l = k;
	//   95  163:iload_3         
	//   96  164:istore          4
					stringbuilder.delete(l, i1);
	//   97  166:aload_0         
	//   98  167:iload           4
	//   99  169:iload           5
	//  100  171:invokevirtual   #58  <Method StringBuilder StringBuilder.delete(int, int)>
	//  101  174:pop             
					j -= i1 - l;
	//  102  175:iload_2         
	//  103  176:iload           5
	//  104  178:iload           4
	//  105  180:isub            
	//  106  181:isub            
	//  107  182:istore_2        
				} else
	//* 108  183:goto            190
				{
					i++;
	//  109  186:iload_1         
	//  110  187:iconst_1        
	//  111  188:iadd            
	//  112  189:istore_1        
				}
				i1 = i;
	//  113  190:iload_1         
	//  114  191:istore          5
				l = i;
	//  115  193:iload_1         
	//  116  194:istore          4
				i = i1;
	//  117  196:iload           5
	//  118  198:istore_1        
				continue;
	//  119  199:goto            32
			}
			i++;
	//  120  202:iload_1         
	//  121  203:iconst_1        
	//  122  204:iadd            
	//  123  205:istore_1        
		} while(true);
	//  124  206:goto            32
		return stringbuilder.toString();
	//  125  209:aload_0         
	//  126  210:invokevirtual   #53  <Method String StringBuilder.toString()>
	//  127  213:areturn         
	}

	public static String resolve(String s, String s1)
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #49  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #67  <Method void StringBuilder()>
	//    3    7:astore          4
		String s2 = s;
	//    4    9:aload_0         
	//    5   10:astore_3        
		if(s == null)
	//*   6   11:aload_0         
	//*   7   12:ifnonnull       18
			s2 = "";
	//    8   15:ldc1            #69  <String "">
	//    9   17:astore_3        
		s = s1;
	//   10   18:aload_1         
	//   11   19:astore_0        
		if(s1 == null)
	//*  12   20:aload_1         
	//*  13   21:ifnonnull       27
			s = "";
	//   14   24:ldc1            #69  <String "">
	//   15   26:astore_0        
		s1 = ((String) (getUriIndices(s)));
	//   16   27:aload_0         
	//   17   28:invokestatic    #71  <Method int[] getUriIndices(String)>
	//   18   31:astore_1        
		if(s1[0] != -1)
	//*  19   32:aload_1         
	//*  20   33:iconst_0        
	//*  21   34:iaload          
	//*  22   35:iconst_m1       
	//*  23   36:icmpeq          64
		{
			stringbuilder.append(s);
	//   24   39:aload           4
	//   25   41:aload_0         
	//   26   42:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//   27   45:pop             
			removeDotSegments(stringbuilder, s1[1], s1[2]);
	//   28   46:aload           4
	//   29   48:aload_1         
	//   30   49:iconst_1        
	//   31   50:iaload          
	//   32   51:aload_1         
	//   33   52:iconst_2        
	//   34   53:iaload          
	//   35   54:invokestatic    #77  <Method String removeDotSegments(StringBuilder, int, int)>
	//   36   57:pop             
			return stringbuilder.toString();
	//   37   58:aload           4
	//   38   60:invokevirtual   #53  <Method String StringBuilder.toString()>
	//   39   63:areturn         
		}
		int ai[] = getUriIndices(s2);
	//   40   64:aload_3         
	//   41   65:invokestatic    #71  <Method int[] getUriIndices(String)>
	//   42   68:astore          5
		if(s1[3] == 0)
	//*  43   70:aload_1         
	//*  44   71:iconst_3        
	//*  45   72:iaload          
	//*  46   73:ifne            101
		{
			stringbuilder.append(((CharSequence) (s2)), 0, ai[3]);
	//   47   76:aload           4
	//   48   78:aload_3         
	//   49   79:iconst_0        
	//   50   80:aload           5
	//   51   82:iconst_3        
	//   52   83:iaload          
	//   53   84:invokevirtual   #80  <Method StringBuilder StringBuilder.append(CharSequence, int, int)>
	//   54   87:pop             
			stringbuilder.append(s);
	//   55   88:aload           4
	//   56   90:aload_0         
	//   57   91:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//   58   94:pop             
			return stringbuilder.toString();
	//   59   95:aload           4
	//   60   97:invokevirtual   #53  <Method String StringBuilder.toString()>
	//   61  100:areturn         
		}
		if(s1[2] == 0)
	//*  62  101:aload_1         
	//*  63  102:iconst_2        
	//*  64  103:iaload          
	//*  65  104:ifne            132
		{
			stringbuilder.append(((CharSequence) (s2)), 0, ai[2]);
	//   66  107:aload           4
	//   67  109:aload_3         
	//   68  110:iconst_0        
	//   69  111:aload           5
	//   70  113:iconst_2        
	//   71  114:iaload          
	//   72  115:invokevirtual   #80  <Method StringBuilder StringBuilder.append(CharSequence, int, int)>
	//   73  118:pop             
			stringbuilder.append(s);
	//   74  119:aload           4
	//   75  121:aload_0         
	//   76  122:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//   77  125:pop             
			return stringbuilder.toString();
	//   78  126:aload           4
	//   79  128:invokevirtual   #53  <Method String StringBuilder.toString()>
	//   80  131:areturn         
		}
		if(s1[1] != 0)
	//*  81  132:aload_1         
	//*  82  133:iconst_1        
	//*  83  134:iaload          
	//*  84  135:ifeq            177
		{
			int i = ai[0] + 1;
	//   85  138:aload           5
	//   86  140:iconst_0        
	//   87  141:iaload          
	//   88  142:iconst_1        
	//   89  143:iadd            
	//   90  144:istore_2        
			stringbuilder.append(((CharSequence) (s2)), 0, i);
	//   91  145:aload           4
	//   92  147:aload_3         
	//   93  148:iconst_0        
	//   94  149:iload_2         
	//   95  150:invokevirtual   #80  <Method StringBuilder StringBuilder.append(CharSequence, int, int)>
	//   96  153:pop             
			stringbuilder.append(s);
	//   97  154:aload           4
	//   98  156:aload_0         
	//   99  157:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//  100  160:pop             
			return removeDotSegments(stringbuilder, s1[1] + i, i + s1[2]);
	//  101  161:aload           4
	//  102  163:aload_1         
	//  103  164:iconst_1        
	//  104  165:iaload          
	//  105  166:iload_2         
	//  106  167:iadd            
	//  107  168:iload_2         
	//  108  169:aload_1         
	//  109  170:iconst_2        
	//  110  171:iaload          
	//  111  172:iadd            
	//  112  173:invokestatic    #77  <Method String removeDotSegments(StringBuilder, int, int)>
	//  113  176:areturn         
		}
		if(s1[1] != s1[2] && s.charAt(s1[1]) == '/')
	//* 114  177:aload_1         
	//* 115  178:iconst_1        
	//* 116  179:iaload          
	//* 117  180:aload_1         
	//* 118  181:iconst_2        
	//* 119  182:iaload          
	//* 120  183:icmpeq          235
	//* 121  186:aload_0         
	//* 122  187:aload_1         
	//* 123  188:iconst_1        
	//* 124  189:iaload          
	//* 125  190:invokevirtual   #42  <Method char String.charAt(int)>
	//* 126  193:bipush          47
	//* 127  195:icmpne          235
		{
			stringbuilder.append(((CharSequence) (s2)), 0, ai[1]);
	//  128  198:aload           4
	//  129  200:aload_3         
	//  130  201:iconst_0        
	//  131  202:aload           5
	//  132  204:iconst_1        
	//  133  205:iaload          
	//  134  206:invokevirtual   #80  <Method StringBuilder StringBuilder.append(CharSequence, int, int)>
	//  135  209:pop             
			stringbuilder.append(s);
	//  136  210:aload           4
	//  137  212:aload_0         
	//  138  213:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//  139  216:pop             
			return removeDotSegments(stringbuilder, ai[1], ai[1] + s1[2]);
	//  140  217:aload           4
	//  141  219:aload           5
	//  142  221:iconst_1        
	//  143  222:iaload          
	//  144  223:aload           5
	//  145  225:iconst_1        
	//  146  226:iaload          
	//  147  227:aload_1         
	//  148  228:iconst_2        
	//  149  229:iaload          
	//  150  230:iadd            
	//  151  231:invokestatic    #77  <Method String removeDotSegments(StringBuilder, int, int)>
	//  152  234:areturn         
		}
		if(ai[0] + 2 < ai[1] && ai[1] == ai[2])
	//* 153  235:aload           5
	//* 154  237:iconst_0        
	//* 155  238:iaload          
	//* 156  239:iconst_2        
	//* 157  240:iadd            
	//* 158  241:aload           5
	//* 159  243:iconst_1        
	//* 160  244:iaload          
	//* 161  245:icmpge          306
	//* 162  248:aload           5
	//* 163  250:iconst_1        
	//* 164  251:iaload          
	//* 165  252:aload           5
	//* 166  254:iconst_2        
	//* 167  255:iaload          
	//* 168  256:icmpne          306
		{
			stringbuilder.append(((CharSequence) (s2)), 0, ai[1]);
	//  169  259:aload           4
	//  170  261:aload_3         
	//  171  262:iconst_0        
	//  172  263:aload           5
	//  173  265:iconst_1        
	//  174  266:iaload          
	//  175  267:invokevirtual   #80  <Method StringBuilder StringBuilder.append(CharSequence, int, int)>
	//  176  270:pop             
			stringbuilder.append('/');
	//  177  271:aload           4
	//  178  273:bipush          47
	//  179  275:invokevirtual   #83  <Method StringBuilder StringBuilder.append(char)>
	//  180  278:pop             
			stringbuilder.append(s);
	//  181  279:aload           4
	//  182  281:aload_0         
	//  183  282:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//  184  285:pop             
			return removeDotSegments(stringbuilder, ai[1], ai[1] + s1[2] + 1);
	//  185  286:aload           4
	//  186  288:aload           5
	//  187  290:iconst_1        
	//  188  291:iaload          
	//  189  292:aload           5
	//  190  294:iconst_1        
	//  191  295:iaload          
	//  192  296:aload_1         
	//  193  297:iconst_2        
	//  194  298:iaload          
	//  195  299:iadd            
	//  196  300:iconst_1        
	//  197  301:iadd            
	//  198  302:invokestatic    #77  <Method String removeDotSegments(StringBuilder, int, int)>
	//  199  305:areturn         
		}
		int j = s2.lastIndexOf('/', ai[2] - 1);
	//  200  306:aload_3         
	//  201  307:bipush          47
	//  202  309:aload           5
	//  203  311:iconst_2        
	//  204  312:iaload          
	//  205  313:iconst_1        
	//  206  314:isub            
	//  207  315:invokevirtual   #85  <Method int String.lastIndexOf(int, int)>
	//  208  318:istore_2        
		if(j == -1)
	//* 209  319:iload_2         
	//* 210  320:iconst_m1       
	//* 211  321:icmpne          332
			j = ai[1];
	//  212  324:aload           5
	//  213  326:iconst_1        
	//  214  327:iaload          
	//  215  328:istore_2        
		else
	//* 216  329:goto            336
			j++;
	//  217  332:iload_2         
	//  218  333:iconst_1        
	//  219  334:iadd            
	//  220  335:istore_2        
		stringbuilder.append(((CharSequence) (s2)), 0, j);
	//  221  336:aload           4
	//  222  338:aload_3         
	//  223  339:iconst_0        
	//  224  340:iload_2         
	//  225  341:invokevirtual   #80  <Method StringBuilder StringBuilder.append(CharSequence, int, int)>
	//  226  344:pop             
		stringbuilder.append(s);
	//  227  345:aload           4
	//  228  347:aload_0         
	//  229  348:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//  230  351:pop             
		return removeDotSegments(stringbuilder, ai[1], j + s1[2]);
	//  231  352:aload           4
	//  232  354:aload           5
	//  233  356:iconst_1        
	//  234  357:iaload          
	//  235  358:iload_2         
	//  236  359:aload_1         
	//  237  360:iconst_2        
	//  238  361:iaload          
	//  239  362:iadd            
	//  240  363:invokestatic    #77  <Method String removeDotSegments(StringBuilder, int, int)>
	//  241  366:areturn         
	}

	public static Uri resolveToUri(String s, String s1)
	{
		return Uri.parse(resolve(s, s1));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #89  <Method String resolve(String, String)>
	//    3    5:invokestatic    #95  <Method Uri Uri.parse(String)>
	//    4    8:areturn         
	}

	private static final int FRAGMENT = 3;
	private static final int INDEX_COUNT = 4;
	private static final int PATH = 1;
	private static final int QUERY = 2;
	private static final int SCHEME_COLON = 0;
}

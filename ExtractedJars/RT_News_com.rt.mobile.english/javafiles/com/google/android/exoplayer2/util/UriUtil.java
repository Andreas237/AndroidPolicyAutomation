// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.util;

import android.net.Uri;
import android.text.TextUtils;
import java.util.*;

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
		i = k;
	//   17   26:iload_3         
	//   18   27:istore_1        
		int l = j;
	//   19   28:iload_2         
	//   20   29:istore          4
		j = i;
	//   21   31:iload_1         
	//   22   32:istore_2        
		i = l;
	//   23   33:iload           4
	//   24   35:istore_1        
label0:
		do
		{
			int i1 = j;
	//   25   36:iload_2         
	//   26   37:istore          4
label1:
			do
			{
label2:
				{
					if(i1 > i)
						break label1;
	//   27   39:iload           4
	//   28   41:iload_1         
	//   29   42:icmpgt          207
					int j1;
					if(i1 == i)
	//*  30   45:iload           4
	//*  31   47:iload_1         
	//*  32   48:icmpne          58
					{
						j1 = i1;
	//   33   51:iload           4
	//   34   53:istore          5
					} else
	//*  35   55:goto            75
					{
						if(stringbuilder.charAt(i1) != '/')
							break label2;
	//   36   58:aload_0         
	//   37   59:iload           4
	//   38   61:invokevirtual   #54  <Method char StringBuilder.charAt(int)>
	//   39   64:bipush          47
	//   40   66:icmpne          198
						j1 = i1 + 1;
	//   41   69:iload           4
	//   42   71:iconst_1        
	//   43   72:iadd            
	//   44   73:istore          5
					}
					int k1 = j + 1;
	//   45   75:iload_2         
	//   46   76:iconst_1        
	//   47   77:iadd            
	//   48   78:istore          6
					if(i1 == k1 && stringbuilder.charAt(j) == '.')
	//*  49   80:iload           4
	//*  50   82:iload           6
	//*  51   84:icmpne          115
	//*  52   87:aload_0         
	//*  53   88:iload_2         
	//*  54   89:invokevirtual   #54  <Method char StringBuilder.charAt(int)>
	//*  55   92:bipush          46
	//*  56   94:icmpne          115
					{
						stringbuilder.delete(j, j1);
	//   57   97:aload_0         
	//   58   98:iload_2         
	//   59   99:iload           5
	//   60  101:invokevirtual   #58  <Method StringBuilder StringBuilder.delete(int, int)>
	//   61  104:pop             
						i -= j1 - j;
	//   62  105:iload_1         
	//   63  106:iload           5
	//   64  108:iload_2         
	//   65  109:isub            
	//   66  110:isub            
	//   67  111:istore_1        
					} else
	//*  68  112:goto            36
					if(i1 == j + 2 && stringbuilder.charAt(j) == '.' && stringbuilder.charAt(k1) == '.')
	//*  69  115:iload           4
	//*  70  117:iload_2         
	//*  71  118:iconst_2        
	//*  72  119:iadd            
	//*  73  120:icmpne          190
	//*  74  123:aload_0         
	//*  75  124:iload_2         
	//*  76  125:invokevirtual   #54  <Method char StringBuilder.charAt(int)>
	//*  77  128:bipush          46
	//*  78  130:icmpne          190
	//*  79  133:aload_0         
	//*  80  134:iload           6
	//*  81  136:invokevirtual   #54  <Method char StringBuilder.charAt(int)>
	//*  82  139:bipush          46
	//*  83  141:icmpne          190
					{
						j = stringbuilder.lastIndexOf("/", j - 2) + 1;
	//   84  144:aload_0         
	//   85  145:ldc1            #60  <String "/">
	//   86  147:iload_2         
	//   87  148:iconst_2        
	//   88  149:isub            
	//   89  150:invokevirtual   #64  <Method int StringBuilder.lastIndexOf(String, int)>
	//   90  153:iconst_1        
	//   91  154:iadd            
	//   92  155:istore_2        
						if(j > k)
	//*  93  156:iload_2         
	//*  94  157:iload_3         
	//*  95  158:icmple          167
							i1 = j;
	//   96  161:iload_2         
	//   97  162:istore          4
						else
	//*  98  164:goto            170
							i1 = k;
	//   99  167:iload_3         
	//  100  168:istore          4
						stringbuilder.delete(i1, j1);
	//  101  170:aload_0         
	//  102  171:iload           4
	//  103  173:iload           5
	//  104  175:invokevirtual   #58  <Method StringBuilder StringBuilder.delete(int, int)>
	//  105  178:pop             
						i -= j1 - i1;
	//  106  179:iload_1         
	//  107  180:iload           5
	//  108  182:iload           4
	//  109  184:isub            
	//  110  185:isub            
	//  111  186:istore_1        
					} else
	//* 112  187:goto            195
					{
						j = i1 + 1;
	//  113  190:iload           4
	//  114  192:iconst_1        
	//  115  193:iadd            
	//  116  194:istore_2        
					}
					continue label0;
	//  117  195:goto            36
				}
				i1++;
	//  118  198:iload           4
	//  119  200:iconst_1        
	//  120  201:iadd            
	//  121  202:istore          4
			} while(true);
	//  122  204:goto            39
			return stringbuilder.toString();
	//  123  207:aload_0         
	//  124  208:invokevirtual   #53  <Method String StringBuilder.toString()>
	//  125  211:areturn         
		} while(true);
	}

	public static Uri removeQueryParameter(Uri uri, String s)
	{
		android.net.Uri.Builder builder = uri.buildUpon();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #72  <Method android.net.Uri$Builder Uri.buildUpon()>
	//    2    4:astore_2        
		builder.clearQuery();
	//    3    5:aload_2         
	//    4    6:invokevirtual   #77  <Method android.net.Uri$Builder android.net.Uri$Builder.clearQuery()>
	//    5    9:pop             
		Iterator iterator = uri.getQueryParameterNames().iterator();
	//    6   10:aload_0         
	//    7   11:invokevirtual   #81  <Method Set Uri.getQueryParameterNames()>
	//    8   14:invokeinterface #87  <Method Iterator Set.iterator()>
	//    9   19:astore_3        
		do
		{
			if(!iterator.hasNext())
				break;
	//   10   20:aload_3         
	//   11   21:invokeinterface #93  <Method boolean Iterator.hasNext()>
	//   12   26:ifeq            92
			String s1 = (String)iterator.next();
	//   13   29:aload_3         
	//   14   30:invokeinterface #97  <Method Object Iterator.next()>
	//   15   35:checkcast       #30  <Class String>
	//   16   38:astore          4
			if(!s1.equals(((Object) (s))))
	//*  17   40:aload           4
	//*  18   42:aload_1         
	//*  19   43:invokevirtual   #101 <Method boolean String.equals(Object)>
	//*  20   46:ifne            20
			{
				Iterator iterator1 = uri.getQueryParameters(s1).iterator();
	//   21   49:aload_0         
	//   22   50:aload           4
	//   23   52:invokevirtual   #105 <Method List Uri.getQueryParameters(String)>
	//   24   55:invokeinterface #108 <Method Iterator List.iterator()>
	//   25   60:astore          5
				while(iterator1.hasNext()) 
	//*  26   62:aload           5
	//*  27   64:invokeinterface #93  <Method boolean Iterator.hasNext()>
	//*  28   69:ifeq            20
					builder.appendQueryParameter(s1, (String)iterator1.next());
	//   29   72:aload_2         
	//   30   73:aload           4
	//   31   75:aload           5
	//   32   77:invokeinterface #97  <Method Object Iterator.next()>
	//   33   82:checkcast       #30  <Class String>
	//   34   85:invokevirtual   #112 <Method android.net.Uri$Builder android.net.Uri$Builder.appendQueryParameter(String, String)>
	//   35   88:pop             
			}
		} while(true);
	//   36   89:goto            62
		return builder.build();
	//   37   92:aload_2         
	//   38   93:invokevirtual   #116 <Method Uri android.net.Uri$Builder.build()>
	//   39   96:areturn         
	}

	public static String resolve(String s, String s1)
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #49  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #119 <Method void StringBuilder()>
	//    3    7:astore          4
		String s2 = s;
	//    4    9:aload_0         
	//    5   10:astore_3        
		if(s == null)
	//*   6   11:aload_0         
	//*   7   12:ifnonnull       18
			s2 = "";
	//    8   15:ldc1            #121 <String "">
	//    9   17:astore_3        
		s = s1;
	//   10   18:aload_1         
	//   11   19:astore_0        
		if(s1 == null)
	//*  12   20:aload_1         
	//*  13   21:ifnonnull       27
			s = "";
	//   14   24:ldc1            #121 <String "">
	//   15   26:astore_0        
		s1 = ((String) (getUriIndices(s)));
	//   16   27:aload_0         
	//   17   28:invokestatic    #123 <Method int[] getUriIndices(String)>
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
	//   26   42:invokevirtual   #127 <Method StringBuilder StringBuilder.append(String)>
	//   27   45:pop             
			removeDotSegments(stringbuilder, s1[1], s1[2]);
	//   28   46:aload           4
	//   29   48:aload_1         
	//   30   49:iconst_1        
	//   31   50:iaload          
	//   32   51:aload_1         
	//   33   52:iconst_2        
	//   34   53:iaload          
	//   35   54:invokestatic    #129 <Method String removeDotSegments(StringBuilder, int, int)>
	//   36   57:pop             
			return stringbuilder.toString();
	//   37   58:aload           4
	//   38   60:invokevirtual   #53  <Method String StringBuilder.toString()>
	//   39   63:areturn         
		}
		int ai[] = getUriIndices(s2);
	//   40   64:aload_3         
	//   41   65:invokestatic    #123 <Method int[] getUriIndices(String)>
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
	//   53   84:invokevirtual   #132 <Method StringBuilder StringBuilder.append(CharSequence, int, int)>
	//   54   87:pop             
			stringbuilder.append(s);
	//   55   88:aload           4
	//   56   90:aload_0         
	//   57   91:invokevirtual   #127 <Method StringBuilder StringBuilder.append(String)>
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
	//   72  115:invokevirtual   #132 <Method StringBuilder StringBuilder.append(CharSequence, int, int)>
	//   73  118:pop             
			stringbuilder.append(s);
	//   74  119:aload           4
	//   75  121:aload_0         
	//   76  122:invokevirtual   #127 <Method StringBuilder StringBuilder.append(String)>
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
	//   95  150:invokevirtual   #132 <Method StringBuilder StringBuilder.append(CharSequence, int, int)>
	//   96  153:pop             
			stringbuilder.append(s);
	//   97  154:aload           4
	//   98  156:aload_0         
	//   99  157:invokevirtual   #127 <Method StringBuilder StringBuilder.append(String)>
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
	//  112  173:invokestatic    #129 <Method String removeDotSegments(StringBuilder, int, int)>
	//  113  176:areturn         
		}
		if(s.charAt(s1[1]) == '/')
	//* 114  177:aload_0         
	//* 115  178:aload_1         
	//* 116  179:iconst_1        
	//* 117  180:iaload          
	//* 118  181:invokevirtual   #42  <Method char String.charAt(int)>
	//* 119  184:bipush          47
	//* 120  186:icmpne          226
		{
			stringbuilder.append(((CharSequence) (s2)), 0, ai[1]);
	//  121  189:aload           4
	//  122  191:aload_3         
	//  123  192:iconst_0        
	//  124  193:aload           5
	//  125  195:iconst_1        
	//  126  196:iaload          
	//  127  197:invokevirtual   #132 <Method StringBuilder StringBuilder.append(CharSequence, int, int)>
	//  128  200:pop             
			stringbuilder.append(s);
	//  129  201:aload           4
	//  130  203:aload_0         
	//  131  204:invokevirtual   #127 <Method StringBuilder StringBuilder.append(String)>
	//  132  207:pop             
			return removeDotSegments(stringbuilder, ai[1], ai[1] + s1[2]);
	//  133  208:aload           4
	//  134  210:aload           5
	//  135  212:iconst_1        
	//  136  213:iaload          
	//  137  214:aload           5
	//  138  216:iconst_1        
	//  139  217:iaload          
	//  140  218:aload_1         
	//  141  219:iconst_2        
	//  142  220:iaload          
	//  143  221:iadd            
	//  144  222:invokestatic    #129 <Method String removeDotSegments(StringBuilder, int, int)>
	//  145  225:areturn         
		}
		if(ai[0] + 2 < ai[1] && ai[1] == ai[2])
	//* 146  226:aload           5
	//* 147  228:iconst_0        
	//* 148  229:iaload          
	//* 149  230:iconst_2        
	//* 150  231:iadd            
	//* 151  232:aload           5
	//* 152  234:iconst_1        
	//* 153  235:iaload          
	//* 154  236:icmpge          297
	//* 155  239:aload           5
	//* 156  241:iconst_1        
	//* 157  242:iaload          
	//* 158  243:aload           5
	//* 159  245:iconst_2        
	//* 160  246:iaload          
	//* 161  247:icmpne          297
		{
			stringbuilder.append(((CharSequence) (s2)), 0, ai[1]);
	//  162  250:aload           4
	//  163  252:aload_3         
	//  164  253:iconst_0        
	//  165  254:aload           5
	//  166  256:iconst_1        
	//  167  257:iaload          
	//  168  258:invokevirtual   #132 <Method StringBuilder StringBuilder.append(CharSequence, int, int)>
	//  169  261:pop             
			stringbuilder.append('/');
	//  170  262:aload           4
	//  171  264:bipush          47
	//  172  266:invokevirtual   #135 <Method StringBuilder StringBuilder.append(char)>
	//  173  269:pop             
			stringbuilder.append(s);
	//  174  270:aload           4
	//  175  272:aload_0         
	//  176  273:invokevirtual   #127 <Method StringBuilder StringBuilder.append(String)>
	//  177  276:pop             
			return removeDotSegments(stringbuilder, ai[1], ai[1] + s1[2] + 1);
	//  178  277:aload           4
	//  179  279:aload           5
	//  180  281:iconst_1        
	//  181  282:iaload          
	//  182  283:aload           5
	//  183  285:iconst_1        
	//  184  286:iaload          
	//  185  287:aload_1         
	//  186  288:iconst_2        
	//  187  289:iaload          
	//  188  290:iadd            
	//  189  291:iconst_1        
	//  190  292:iadd            
	//  191  293:invokestatic    #129 <Method String removeDotSegments(StringBuilder, int, int)>
	//  192  296:areturn         
		}
		int j = s2.lastIndexOf('/', ai[2] - 1);
	//  193  297:aload_3         
	//  194  298:bipush          47
	//  195  300:aload           5
	//  196  302:iconst_2        
	//  197  303:iaload          
	//  198  304:iconst_1        
	//  199  305:isub            
	//  200  306:invokevirtual   #137 <Method int String.lastIndexOf(int, int)>
	//  201  309:istore_2        
		if(j == -1)
	//* 202  310:iload_2         
	//* 203  311:iconst_m1       
	//* 204  312:icmpne          323
			j = ai[1];
	//  205  315:aload           5
	//  206  317:iconst_1        
	//  207  318:iaload          
	//  208  319:istore_2        
		else
	//* 209  320:goto            327
			j++;
	//  210  323:iload_2         
	//  211  324:iconst_1        
	//  212  325:iadd            
	//  213  326:istore_2        
		stringbuilder.append(((CharSequence) (s2)), 0, j);
	//  214  327:aload           4
	//  215  329:aload_3         
	//  216  330:iconst_0        
	//  217  331:iload_2         
	//  218  332:invokevirtual   #132 <Method StringBuilder StringBuilder.append(CharSequence, int, int)>
	//  219  335:pop             
		stringbuilder.append(s);
	//  220  336:aload           4
	//  221  338:aload_0         
	//  222  339:invokevirtual   #127 <Method StringBuilder StringBuilder.append(String)>
	//  223  342:pop             
		return removeDotSegments(stringbuilder, ai[1], j + s1[2]);
	//  224  343:aload           4
	//  225  345:aload           5
	//  226  347:iconst_1        
	//  227  348:iaload          
	//  228  349:iload_2         
	//  229  350:aload_1         
	//  230  351:iconst_2        
	//  231  352:iaload          
	//  232  353:iadd            
	//  233  354:invokestatic    #129 <Method String removeDotSegments(StringBuilder, int, int)>
	//  234  357:areturn         
	}

	public static Uri resolveToUri(String s, String s1)
	{
		return Uri.parse(resolve(s, s1));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #141 <Method String resolve(String, String)>
	//    3    5:invokestatic    #145 <Method Uri Uri.parse(String)>
	//    4    8:areturn         
	}

	private static final int FRAGMENT = 3;
	private static final int INDEX_COUNT = 4;
	private static final int PATH = 1;
	private static final int QUERY = 2;
	private static final int SCHEME_COLON = 0;
}

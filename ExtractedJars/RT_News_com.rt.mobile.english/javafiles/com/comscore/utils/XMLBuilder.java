// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.comscore.utils;


// Referenced classes of package com.comscore.utils:
//			Utils, Date

public class XMLBuilder
{

	public XMLBuilder()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #43  <Method void Object()>
	//    2    4:return          
	}

	private static void a(String s, String s1)
	{
		c = -1;
	//    0    0:iconst_m1       
	//    1    1:putstatic       #46  <Field int c>
		b = -1;
	//    2    4:iconst_m1       
	//    3    5:putstatic       #48  <Field int b>
		int j = 0;
	//    4    8:iconst_0        
	//    5    9:istore_3        
		int i;
		do
		{
			j = s.indexOf(s1, j);
	//    6   10:aload_0         
	//    7   11:aload_1         
	//    8   12:iload_3         
	//    9   13:invokevirtual   #52  <Method int String.indexOf(String, int)>
	//   10   16:istore_3        
			i = j;
	//   11   17:iload_3         
	//   12   18:istore_2        
			if(j >= 0)
	//*  13   19:iload_3         
	//*  14   20:iflt            101
			{
				i = s1.length() + j;
	//   15   23:aload_1         
	//   16   24:invokevirtual   #56  <Method int String.length()>
	//   17   27:iload_3         
	//   18   28:iadd            
	//   19   29:istore_2        
				if((j == 0 || s.charAt(j - 1) == '&') && i < s.length() && s.charAt(i) == '=')
	//*  20   30:iload_3         
	//*  21   31:ifeq            46
	//*  22   34:aload_0         
	//*  23   35:iload_3         
	//*  24   36:iconst_1        
	//*  25   37:isub            
	//*  26   38:invokevirtual   #60  <Method char String.charAt(int)>
	//*  27   41:bipush          38
	//*  28   43:icmpne          97
	//*  29   46:iload_2         
	//*  30   47:aload_0         
	//*  31   48:invokevirtual   #56  <Method int String.length()>
	//*  32   51:icmpge          97
	//*  33   54:aload_0         
	//*  34   55:iload_2         
	//*  35   56:invokevirtual   #60  <Method char String.charAt(int)>
	//*  36   59:bipush          61
	//*  37   61:icmpne          97
				{
					b = i + 1;
	//   38   64:iload_2         
	//   39   65:iconst_1        
	//   40   66:iadd            
	//   41   67:putstatic       #48  <Field int b>
					c = s.indexOf('&', b);
	//   42   70:aload_0         
	//   43   71:bipush          38
	//   44   73:getstatic       #48  <Field int b>
	//   45   76:invokevirtual   #63  <Method int String.indexOf(int, int)>
	//   46   79:putstatic       #46  <Field int c>
					if(c == -1)
	//*  47   82:getstatic       #46  <Field int c>
	//*  48   85:iconst_m1       
	//*  49   86:icmpne          96
						c = s.length();
	//   50   89:aload_0         
	//   51   90:invokevirtual   #56  <Method int String.length()>
	//   52   93:putstatic       #46  <Field int c>
					return;
	//   53   96:return          
				}
				i++;
	//   54   97:iload_2         
	//   55   98:iconst_1        
	//   56   99:iadd            
	//   57  100:istore_2        
			}
			if(i < 0)
				break;
	//   58  101:iload_2         
	//   59  102:iflt            115
			j = i;
	//   60  105:iload_2         
	//   61  106:istore_3        
		} while(i < s.length());
	//   62  107:iload_2         
	//   63  108:aload_0         
	//   64  109:invokevirtual   #56  <Method int String.length()>
	//   65  112:icmplt          10
	//   66  115:return          
	}

	private static void a(String s, StringBuilder stringbuilder)
	{
		a(s, "ns_ts");
	//    0    0:aload_0         
	//    1    1:ldc1            #35  <String "ns_ts">
	//    2    3:invokestatic    #66  <Method void a(String, String)>
		if(b != -1 && c > b)
	//*   3    6:getstatic       #48  <Field int b>
	//*   4    9:iconst_m1       
	//*   5   10:icmpeq          285
	//*   6   13:getstatic       #46  <Field int c>
	//*   7   16:getstatic       #48  <Field int b>
	//*   8   19:icmple          285
		{
			stringbuilder.append("<event t=\"");
	//    9   22:aload_1         
	//   10   23:ldc1            #68  <String "<event t=\"">
	//   11   25:invokevirtual   #74  <Method StringBuilder StringBuilder.append(String)>
	//   12   28:pop             
			stringbuilder.append(((CharSequence) (s)), b, c);
	//   13   29:aload_1         
	//   14   30:aload_0         
	//   15   31:getstatic       #48  <Field int b>
	//   16   34:getstatic       #46  <Field int c>
	//   17   37:invokevirtual   #77  <Method StringBuilder StringBuilder.append(CharSequence, int, int)>
	//   18   40:pop             
			stringbuilder.append("\">");
	//   19   41:aload_1         
	//   20   42:ldc1            #79  <String "\">">
	//   21   44:invokevirtual   #74  <Method StringBuilder StringBuilder.append(String)>
	//   22   47:pop             
			int k = 0;
	//   23   48:iconst_0        
	//   24   49:istore          4
			int i = k;
	//   25   51:iload           4
	//   26   53:istore_2        
			long l1 = 0L;
	//   27   54:lconst_0        
	//   28   55:lstore          7
			while(k < s.length()) 
	//*  29   57:iload           4
	//*  30   59:aload_0         
	//*  31   60:invokevirtual   #56  <Method int String.length()>
	//*  32   63:icmpge          278
			{
				int j = s.indexOf('&', k);
	//   33   66:aload_0         
	//   34   67:bipush          38
	//   35   69:iload           4
	//   36   71:invokevirtual   #63  <Method int String.indexOf(int, int)>
	//   37   74:istore_3        
				int l = j;
	//   38   75:iload_3         
	//   39   76:istore          5
				if(j == -1)
	//*  40   78:iload_3         
	//*  41   79:iconst_m1       
	//*  42   80:icmpne          89
					l = s.length();
	//   43   83:aload_0         
	//   44   84:invokevirtual   #56  <Method int String.length()>
	//   45   87:istore          5
				long l2 = l1;
	//   46   89:lload           7
	//   47   91:lstore          9
				j = i;
	//   48   93:iload_2         
	//   49   94:istore_3        
				if(l > k)
	//*  50   95:iload           5
	//*  51   97:iload           4
	//*  52   99:icmple          263
				{
					l2 = l1;
	//   53  102:lload           7
	//   54  104:lstore          9
					j = i;
	//   55  106:iload_2         
	//   56  107:istore_3        
					if(s.indexOf('=', k) > k)
	//*  57  108:aload_0         
	//*  58  109:bipush          61
	//*  59  111:iload           4
	//*  60  113:invokevirtual   #63  <Method int String.indexOf(int, int)>
	//*  61  116:iload           4
	//*  62  118:icmple          263
					{
						l2 = f;
	//   63  121:getstatic       #39  <Field long f>
	//   64  124:lstore          9
						boolean flag = true;
	//   65  126:iconst_1        
	//   66  127:istore          6
						if(l1 != l2)
	//*  67  129:lload           7
	//*  68  131:lload           9
	//*  69  133:lcmp            
	//*  70  134:ifeq            206
						{
							j = 0;
	//   71  137:iconst_0        
	//   72  138:istore_3        
							do
							{
								if(j >= e.length)
									break;
	//   73  139:iload_3         
	//   74  140:getstatic       #37  <Field String[] e>
	//   75  143:arraylength     
	//   76  144:icmpge          206
								l2 = 1 << j;
	//   77  147:iconst_1        
	//   78  148:iload_3         
	//   79  149:ishl            
	//   80  150:i2l             
	//   81  151:lstore          9
								if((l1 & l2) == 0L && e[j].regionMatches(0, s, k, e[j].length()))
	//*  82  153:lload           7
	//*  83  155:lload           9
	//*  84  157:land            
	//*  85  158:lconst_0        
	//*  86  159:lcmp            
	//*  87  160:ifne            199
	//*  88  163:getstatic       #37  <Field String[] e>
	//*  89  166:iload_3         
	//*  90  167:aaload          
	//*  91  168:iconst_0        
	//*  92  169:aload_0         
	//*  93  170:iload           4
	//*  94  172:getstatic       #37  <Field String[] e>
	//*  95  175:iload_3         
	//*  96  176:aaload          
	//*  97  177:invokevirtual   #56  <Method int String.length()>
	//*  98  180:invokevirtual   #83  <Method boolean String.regionMatches(int, String, int, int)>
	//*  99  183:ifeq            199
								{
									l1 |= l2;
	//  100  186:lload           7
	//  101  188:lload           9
	//  102  190:lor             
	//  103  191:lstore          7
									flag = false;
	//  104  193:iconst_0        
	//  105  194:istore          6
									break;
	//  106  196:goto            206
								}
								j++;
	//  107  199:iload_3         
	//  108  200:iconst_1        
	//  109  201:iadd            
	//  110  202:istore_3        
							} while(true);
	//  111  203:goto            139
						}
						j = i;
	//  112  206:iload_2         
	//  113  207:istore_3        
						if(flag)
	//* 114  208:iload           6
	//* 115  210:ifeq            259
						{
							if(i > 0)
	//* 116  213:iload_2         
	//* 117  214:ifle            233
							{
								a.append('&');
	//  118  217:getstatic       #85  <Field StringBuilder a>
	//  119  220:bipush          38
	//  120  222:invokevirtual   #88  <Method StringBuilder StringBuilder.append(char)>
	//  121  225:pop             
								stringbuilder.append('&');
	//  122  226:aload_1         
	//  123  227:bipush          38
	//  124  229:invokevirtual   #88  <Method StringBuilder StringBuilder.append(char)>
	//  125  232:pop             
							}
							a.append(((CharSequence) (s)), k, l);
	//  126  233:getstatic       #85  <Field StringBuilder a>
	//  127  236:aload_0         
	//  128  237:iload           4
	//  129  239:iload           5
	//  130  241:invokevirtual   #77  <Method StringBuilder StringBuilder.append(CharSequence, int, int)>
	//  131  244:pop             
							stringbuilder.append(((CharSequence) (s)), k, l);
	//  132  245:aload_1         
	//  133  246:aload_0         
	//  134  247:iload           4
	//  135  249:iload           5
	//  136  251:invokevirtual   #77  <Method StringBuilder StringBuilder.append(CharSequence, int, int)>
	//  137  254:pop             
							j = i + 1;
	//  138  255:iload_2         
	//  139  256:iconst_1        
	//  140  257:iadd            
	//  141  258:istore_3        
						}
						l2 = l1;
	//  142  259:lload           7
	//  143  261:lstore          9
					}
				}
				k = l + 1;
	//  144  263:iload           5
	//  145  265:iconst_1        
	//  146  266:iadd            
	//  147  267:istore          4
				l1 = l2;
	//  148  269:lload           9
	//  149  271:lstore          7
				i = j;
	//  150  273:iload_3         
	//  151  274:istore_2        
			}
	//* 152  275:goto            57
			stringbuilder.append("</event>");
	//  153  278:aload_1         
	//  154  279:ldc1            #90  <String "</event>">
	//  155  281:invokevirtual   #74  <Method StringBuilder StringBuilder.append(String)>
	//  156  284:pop             
		}
	//  157  285:return          
	}

	private static void a(StringBuilder stringbuilder)
	{
		String s = Utils.md5(a.toString()).toLowerCase();
	//    0    0:getstatic       #85  <Field StringBuilder a>
	//    1    3:invokevirtual   #95  <Method String StringBuilder.toString()>
	//    2    6:invokestatic    #101 <Method String Utils.md5(String)>
	//    3    9:invokevirtual   #104 <Method String String.toLowerCase()>
	//    4   12:astore_1        
		stringbuilder.insert(stringbuilder.indexOf("md5=\"") + "md5=\"".length(), s);
	//    5   13:aload_0         
	//    6   14:aload_0         
	//    7   15:ldc1            #106 <String "md5=\"">
	//    8   17:invokevirtual   #109 <Method int StringBuilder.indexOf(String)>
	//    9   20:ldc1            #106 <String "md5=\"">
	//   10   22:invokevirtual   #56  <Method int String.length()>
	//   11   25:iadd            
	//   12   26:aload_1         
	//   13   27:invokevirtual   #113 <Method StringBuilder StringBuilder.insert(int, String)>
	//   14   30:pop             
	//   15   31:return          
	}

	private static void a(StringBuilder stringbuilder, String s, String s1)
	{
		long l = Date.unixTime();
	//    0    0:invokestatic    #120 <Method long Date.unixTime()>
	//    1    3:lstore          4
		stringbuilder.append("<events t=\"");
	//    2    5:aload_0         
	//    3    6:ldc1            #122 <String "<events t=\"">
	//    4    8:invokevirtual   #74  <Method StringBuilder StringBuilder.append(String)>
	//    5   11:pop             
		stringbuilder.append(String.valueOf(l));
	//    6   12:aload_0         
	//    7   13:lload           4
	//    8   15:invokestatic    #126 <Method String String.valueOf(long)>
	//    9   18:invokevirtual   #74  <Method StringBuilder StringBuilder.append(String)>
	//   10   21:pop             
		stringbuilder.append("\" ");
	//   11   22:aload_0         
	//   12   23:ldc1            #128 <String "\" ">
	//   13   25:invokevirtual   #74  <Method StringBuilder StringBuilder.append(String)>
	//   14   28:pop             
		for(int i = 0; i < d.length; i++)
	//*  15   29:iconst_0        
	//*  16   30:istore_3        
	//*  17   31:iload_3         
	//*  18   32:getstatic       #33  <Field String[] d>
	//*  19   35:arraylength     
	//*  20   36:icmpge          56
			b(stringbuilder, s, d[i]);
	//   21   39:aload_0         
	//   22   40:aload_1         
	//   23   41:getstatic       #33  <Field String[] d>
	//   24   44:iload_3         
	//   25   45:aaload          
	//   26   46:invokestatic    #130 <Method void b(StringBuilder, String, String)>

	//   27   49:iload_3         
	//   28   50:iconst_1        
	//   29   51:iadd            
	//   30   52:istore_3        
	//*  31   53:goto            31
		stringbuilder.append("dropped=\"");
	//   32   56:aload_0         
	//   33   57:ldc1            #132 <String "dropped=\"">
	//   34   59:invokevirtual   #74  <Method StringBuilder StringBuilder.append(String)>
	//   35   62:pop             
		stringbuilder.append(s1);
	//   36   63:aload_0         
	//   37   64:aload_2         
	//   38   65:invokevirtual   #74  <Method StringBuilder StringBuilder.append(String)>
	//   39   68:pop             
		stringbuilder.append("\" md5=\"\">");
	//   40   69:aload_0         
	//   41   70:ldc1            #134 <String "\" md5=\"\">">
	//   42   72:invokevirtual   #74  <Method StringBuilder StringBuilder.append(String)>
	//   43   75:pop             
	//   44   76:return          
	}

	private static void a(String as[], StringBuilder stringbuilder)
	{
		a = new StringBuilder();
	//    0    0:new             #70  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #136 <Method void StringBuilder()>
	//    3    7:putstatic       #85  <Field StringBuilder a>
		for(int i = 0; i < as.length; i++)
	//*   4   10:iconst_0        
	//*   5   11:istore_2        
	//*   6   12:iload_2         
	//*   7   13:aload_0         
	//*   8   14:arraylength     
	//*   9   15:icmpge          41
			if(Utils.isNotEmpty(as[i]))
	//*  10   18:aload_0         
	//*  11   19:iload_2         
	//*  12   20:aaload          
	//*  13   21:invokestatic    #140 <Method boolean Utils.isNotEmpty(String)>
	//*  14   24:ifeq            34
				a(as[i], stringbuilder);
	//   15   27:aload_0         
	//   16   28:iload_2         
	//   17   29:aaload          
	//   18   30:aload_1         
	//   19   31:invokestatic    #142 <Method void a(String, StringBuilder)>

	//   20   34:iload_2         
	//   21   35:iconst_1        
	//   22   36:iadd            
	//   23   37:istore_2        
	//*  24   38:goto            12
	//   25   41:return          
	}

	private static void b(StringBuilder stringbuilder, String s, String s1)
	{
		a(s, s1);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:invokestatic    #66  <Method void a(String, String)>
		if(b != -1 && c > b)
	//*   3    5:getstatic       #48  <Field int b>
	//*   4    8:iconst_m1       
	//*   5    9:icmpeq          53
	//*   6   12:getstatic       #46  <Field int c>
	//*   7   15:getstatic       #48  <Field int b>
	//*   8   18:icmple          53
		{
			stringbuilder.append(s1);
	//    9   21:aload_0         
	//   10   22:aload_2         
	//   11   23:invokevirtual   #74  <Method StringBuilder StringBuilder.append(String)>
	//   12   26:pop             
			stringbuilder.append("=\"");
	//   13   27:aload_0         
	//   14   28:ldc1            #144 <String "=\"">
	//   15   30:invokevirtual   #74  <Method StringBuilder StringBuilder.append(String)>
	//   16   33:pop             
			stringbuilder.append(((CharSequence) (s)), b, c);
	//   17   34:aload_0         
	//   18   35:aload_1         
	//   19   36:getstatic       #48  <Field int b>
	//   20   39:getstatic       #46  <Field int c>
	//   21   42:invokevirtual   #77  <Method StringBuilder StringBuilder.append(CharSequence, int, int)>
	//   22   45:pop             
			stringbuilder.append("\" ");
	//   23   46:aload_0         
	//   24   47:ldc1            #128 <String "\" ">
	//   25   49:invokevirtual   #74  <Method StringBuilder StringBuilder.append(String)>
	//   26   52:pop             
		}
	//   27   53:return          
	}

	public static String generateXMLRequestString(String as[], String s)
	{
		com/comscore/utils/XMLBuilder;
	//    0    0:ldc1            #2   <Class XMLBuilder>
		JVM INSTR monitorenter ;
	//    1    2:monitorenter    
		StringBuilder stringbuilder = new StringBuilder("<?xml version=\"1.0\" encoding=\"UTF-8\" ?>");
	//    2    3:new             #70  <Class StringBuilder>
	//    3    6:dup             
	//    4    7:ldc1            #148 <String "<?xml version=\"1.0\" encoding=\"UTF-8\" ?>">
	//    5    9:invokespecial   #151 <Method void StringBuilder(String)>
	//    6   12:astore_2        
		a(stringbuilder, as[0], s);
	//    7   13:aload_2         
	//    8   14:aload_0         
	//    9   15:iconst_0        
	//   10   16:aaload          
	//   11   17:aload_1         
	//   12   18:invokestatic    #153 <Method void a(StringBuilder, String, String)>
		a(as, stringbuilder);
	//   13   21:aload_0         
	//   14   22:aload_2         
	//   15   23:invokestatic    #155 <Method void a(String[], StringBuilder)>
		a(stringbuilder);
	//   16   26:aload_2         
	//   17   27:invokestatic    #157 <Method void a(StringBuilder)>
		stringbuilder.append("</events>");
	//   18   30:aload_2         
	//   19   31:ldc1            #159 <String "</events>">
	//   20   33:invokevirtual   #74  <Method StringBuilder StringBuilder.append(String)>
	//   21   36:pop             
		as = ((String []) (stringbuilder.toString()));
	//   22   37:aload_2         
	//   23   38:invokevirtual   #95  <Method String StringBuilder.toString()>
	//   24   41:astore_0        
		com/comscore/utils/XMLBuilder;
	//   25   42:ldc1            #2   <Class XMLBuilder>
		JVM INSTR monitorexit ;
	//   26   44:monitorexit     
		return ((String) (as));
	//   27   45:aload_0         
	//   28   46:areturn         
		as;
	//   29   47:astore_0        
	//*  30   48:ldc1            #2   <Class XMLBuilder>
		throw as;
	//   31   50:monitorexit     
	//   32   51:aload_0         
	//   33   52:athrow          
	}

	public static String getLabelFromEvent(String s, String s1)
	{
		com/comscore/utils/XMLBuilder;
	//    0    0:ldc1            #2   <Class XMLBuilder>
		JVM INSTR monitorenter ;
	//    1    2:monitorenter    
		a(s, s1);
	//    2    3:aload_0         
	//    3    4:aload_1         
	//    4    5:invokestatic    #66  <Method void a(String, String)>
		if(b == -1 || c <= b)
			break MISSING_BLOCK_LABEL_40;
	//    5    8:getstatic       #48  <Field int b>
	//    6   11:iconst_m1       
	//    7   12:icmpeq          40
	//    8   15:getstatic       #46  <Field int c>
	//    9   18:getstatic       #48  <Field int b>
	//   10   21:icmple          40
		s = s.substring(b, c);
	//   11   24:aload_0         
	//   12   25:getstatic       #48  <Field int b>
	//   13   28:getstatic       #46  <Field int c>
	//   14   31:invokevirtual   #165 <Method String String.substring(int, int)>
	//   15   34:astore_0        
		com/comscore/utils/XMLBuilder;
	//   16   35:ldc1            #2   <Class XMLBuilder>
		JVM INSTR monitorexit ;
	//   17   37:monitorexit     
		return s;
	//   18   38:aload_0         
	//   19   39:areturn         
		com/comscore/utils/XMLBuilder;
	//   20   40:ldc1            #2   <Class XMLBuilder>
		JVM INSTR monitorexit ;
	//   21   42:monitorexit     
		return null;
	//   22   43:aconst_null     
	//   23   44:areturn         
		s;
	//   24   45:astore_0        
	//*  25   46:ldc1            #2   <Class XMLBuilder>
		throw s;
	//   26   48:monitorexit     
	//   27   49:aload_0         
	//   28   50:athrow          
	}

	private static StringBuilder a;
	private static int b = -1;
	private static int c = -1;
	private static final String d[] = {
		"c12", "c1", "ns_ap_an", "ns_ap_pn", "ns_ap_device", "ns_ak"
	};
	private static final String e[] = {
		"c12", "c1", "ns_ap_an", "ns_ap_pn", "ns_ap_device", "ns_ts", "ns_ak"
	};
	private static final long f = (long)((1 << e.length) - 1);

	static 
	{
	//    0    0:bipush          6
	//    1    2:anewarray       String[]
	//    2    5:dup             
	//    3    6:iconst_0        
	//    4    7:ldc1            #21  <String "c12">
	//    5    9:aastore         
	//    6   10:dup             
	//    7   11:iconst_1        
	//    8   12:ldc1            #23  <String "c1">
	//    9   14:aastore         
	//   10   15:dup             
	//   11   16:iconst_2        
	//   12   17:ldc1            #25  <String "ns_ap_an">
	//   13   19:aastore         
	//   14   20:dup             
	//   15   21:iconst_3        
	//   16   22:ldc1            #27  <String "ns_ap_pn">
	//   17   24:aastore         
	//   18   25:dup             
	//   19   26:iconst_4        
	//   20   27:ldc1            #29  <String "ns_ap_device">
	//   21   29:aastore         
	//   22   30:dup             
	//   23   31:iconst_5        
	//   24   32:ldc1            #31  <String "ns_ak">
	//   25   34:aastore         
	//   26   35:putstatic       #33  <Field String[] d>
	//   27   38:bipush          7
	//   28   40:anewarray       String[]
	//   29   43:dup             
	//   30   44:iconst_0        
	//   31   45:ldc1            #21  <String "c12">
	//   32   47:aastore         
	//   33   48:dup             
	//   34   49:iconst_1        
	//   35   50:ldc1            #23  <String "c1">
	//   36   52:aastore         
	//   37   53:dup             
	//   38   54:iconst_2        
	//   39   55:ldc1            #25  <String "ns_ap_an">
	//   40   57:aastore         
	//   41   58:dup             
	//   42   59:iconst_3        
	//   43   60:ldc1            #27  <String "ns_ap_pn">
	//   44   62:aastore         
	//   45   63:dup             
	//   46   64:iconst_4        
	//   47   65:ldc1            #29  <String "ns_ap_device">
	//   48   67:aastore         
	//   49   68:dup             
	//   50   69:iconst_5        
	//   51   70:ldc1            #35  <String "ns_ts">
	//   52   72:aastore         
	//   53   73:dup             
	//   54   74:bipush          6
	//   55   76:ldc1            #31  <String "ns_ak">
	//   56   78:aastore         
	//   57   79:putstatic       #37  <Field String[] e>
	//   58   82:iconst_1        
	//   59   83:getstatic       #37  <Field String[] e>
	//   60   86:arraylength     
	//   61   87:ishl            
	//   62   88:iconst_1        
	//   63   89:isub            
	//   64   90:i2l             
	//   65   91:putstatic       #39  <Field long f>
	//*  66   94:return          
	}
}

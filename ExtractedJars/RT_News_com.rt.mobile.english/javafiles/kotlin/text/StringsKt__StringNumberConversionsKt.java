// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package kotlin.text;

import kotlin.jvm.internal.Intrinsics;

// Referenced classes of package kotlin.text:
//			StringsKt__StringNumberConversionsJVMKt, StringsKt, CharsKt

class StringsKt__StringNumberConversionsKt extends StringsKt__StringNumberConversionsJVMKt
{

	public StringsKt__StringNumberConversionsKt()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #40  <Method void StringsKt__StringNumberConversionsJVMKt()>
	//    2    4:return          
	}

	public static final Void numberFormatError(String s)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (s)), "input");
	//    0    0:aload_0         
	//    1    1:ldc1            #44  <String "input">
	//    2    3:invokestatic    #50  <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		StringBuilder stringbuilder = new StringBuilder();
	//    3    6:new             #52  <Class StringBuilder>
	//    4    9:dup             
	//    5   10:invokespecial   #53  <Method void StringBuilder()>
	//    6   13:astore_1        
		stringbuilder.append("Invalid number format: '");
	//    7   14:aload_1         
	//    8   15:ldc1            #55  <String "Invalid number format: '">
	//    9   17:invokevirtual   #59  <Method StringBuilder StringBuilder.append(String)>
	//   10   20:pop             
		stringbuilder.append(s);
	//   11   21:aload_1         
	//   12   22:aload_0         
	//   13   23:invokevirtual   #59  <Method StringBuilder StringBuilder.append(String)>
	//   14   26:pop             
		stringbuilder.append('\'');
	//   15   27:aload_1         
	//   16   28:bipush          39
	//   17   30:invokevirtual   #62  <Method StringBuilder StringBuilder.append(char)>
	//   18   33:pop             
		throw (Throwable)new NumberFormatException(stringbuilder.toString());
	//   19   34:new             #64  <Class NumberFormatException>
	//   20   37:dup             
	//   21   38:aload_1         
	//   22   39:invokevirtual   #68  <Method String StringBuilder.toString()>
	//   23   42:invokespecial   #71  <Method void NumberFormatException(String)>
	//   24   45:checkcast       #73  <Class Throwable>
	//   25   48:athrow          
	}

	public static final Byte toByteOrNull(String s)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (s)), "receiver$0");
	//    0    0:aload_0         
	//    1    1:ldc1            #81  <String "receiver$0">
	//    2    3:invokestatic    #50  <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		return StringsKt.toByteOrNull(s, 10);
	//    3    6:aload_0         
	//    4    7:bipush          10
	//    5    9:invokestatic    #84  <Method Byte StringsKt.toByteOrNull(String, int)>
	//    6   12:areturn         
	}

	public static final Byte toByteOrNull(String s, int i)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (s)), "receiver$0");
	//    0    0:aload_0         
	//    1    1:ldc1            #81  <String "receiver$0">
	//    2    3:invokestatic    #50  <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		s = ((String) (StringsKt.toIntOrNull(s, i)));
	//    3    6:aload_0         
	//    4    7:iload_1         
	//    5    8:invokestatic    #86  <Method Integer StringsKt.toIntOrNull(String, int)>
	//    6   11:astore_0        
		if(s != null)
	//*   7   12:aload_0         
	//*   8   13:ifnull          43
		{
			i = ((Integer) (s)).intValue();
	//    9   16:aload_0         
	//   10   17:invokevirtual   #92  <Method int Integer.intValue()>
	//   11   20:istore_1        
			if(i >= -128)
	//*  12   21:iload_1         
	//*  13   22:bipush          -128
	//*  14   24:icmplt          41
			{
				if(i > 127)
	//*  15   27:iload_1         
	//*  16   28:bipush          127
	//*  17   30:icmple          35
					return null;
	//   18   33:aconst_null     
	//   19   34:areturn         
				else
					return Byte.valueOf((byte)i);
	//   20   35:iload_1         
	//   21   36:int2byte        
	//   22   37:invokestatic    #98  <Method Byte Byte.valueOf(byte)>
	//   23   40:areturn         
			} else
			{
				return null;
	//   24   41:aconst_null     
	//   25   42:areturn         
			}
		} else
		{
			return null;
	//   26   43:aconst_null     
	//   27   44:areturn         
		}
	}

	public static final Integer toIntOrNull(String s)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (s)), "receiver$0");
	//    0    0:aload_0         
	//    1    1:ldc1            #81  <String "receiver$0">
	//    2    3:invokestatic    #50  <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		return StringsKt.toIntOrNull(s, 10);
	//    3    6:aload_0         
	//    4    7:bipush          10
	//    5    9:invokestatic    #86  <Method Integer StringsKt.toIntOrNull(String, int)>
	//    6   12:areturn         
	}

	public static final Integer toIntOrNull(String s, int i)
	{
		int j;
		int k;
		int l;
		boolean flag;
		boolean flag1;
		int k1;
label0:
		{
			Intrinsics.checkParameterIsNotNull(((Object) (s)), "receiver$0");
	//    0    0:aload_0         
	//    1    1:ldc1            #81  <String "receiver$0">
	//    2    3:invokestatic    #50  <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
			CharsKt.checkRadix(i);
	//    3    6:iload_1         
	//    4    7:invokestatic    #104 <Method int CharsKt.checkRadix(int)>
	//    5   10:pop             
			k1 = s.length();
	//    6   11:aload_0         
	//    7   12:invokevirtual   #109 <Method int String.length()>
	//    8   15:istore          8
			if(k1 == 0)
	//*   9   17:iload           8
	//*  10   19:ifne            24
				return null;
	//   11   22:aconst_null     
	//   12   23:areturn         
			flag1 = false;
	//   13   24:iconst_0        
	//   14   25:istore          7
			flag = false;
	//   15   27:iconst_0        
	//   16   28:istore          6
			j = ((int) (s.charAt(0)));
	//   17   30:aload_0         
	//   18   31:iconst_0        
	//   19   32:invokevirtual   #113 <Method char String.charAt(int)>
	//   20   35:istore_2        
			l = 0x80000001;
	//   21   36:ldc1            #114 <Int 0x80000001>
	//   22   38:istore          4
			if(j < '0')
	//*  23   40:iload_2         
	//*  24   41:bipush          48
	//*  25   43:icmpge          83
			{
				if(k1 == 1)
	//*  26   46:iload           8
	//*  27   48:iconst_1        
	//*  28   49:icmpne          54
					return null;
	//   29   52:aconst_null     
	//   30   53:areturn         
				if(j == '-')
	//*  31   54:iload_2         
	//*  32   55:bipush          45
	//*  33   57:icmpne          68
				{
					k = 0x80000000;
	//   34   60:ldc1            #115 <Int 0x80000000>
	//   35   62:istore_3        
					j = 1;
	//   36   63:iconst_1        
	//   37   64:istore_2        
				} else
	//*  38   65:goto            88
				{
					if(j == '+')
	//*  39   68:iload_2         
	//*  40   69:bipush          43
	//*  41   71:icmpne          81
					{
						k = 0;
	//   42   74:iconst_0        
	//   43   75:istore_3        
						j = 1;
	//   44   76:iconst_1        
	//   45   77:istore_2        
					} else
	//*  46   78:goto            97
					{
						return null;
	//   47   81:aconst_null     
	//   48   82:areturn         
					}
					break label0;
				}
			} else
			{
				j = 0;
	//   49   83:iconst_0        
	//   50   84:istore_2        
				k = l;
	//   51   85:iload           4
	//   52   87:istore_3        
			}
			char c = ((char) (j));
	//   53   88:iload_2         
	//   54   89:istore          5
			l = k;
	//   55   91:iload_3         
	//   56   92:istore          4
			k = ((int) (c));
	//   57   94:iload           5
	//   58   96:istore_3        
		}
		int l1 = l / i;
	//   59   97:iload           4
	//   60   99:iload_1         
	//   61  100:idiv            
	//   62  101:istore          9
		k1--;
	//   63  103:iload           8
	//   64  105:iconst_1        
	//   65  106:isub            
	//   66  107:istore          8
		int i1 = ((int) (flag1));
	//   67  109:iload           7
	//   68  111:istore          5
		if(j <= k1)
	//*  69  113:iload_2         
	//*  70  114:iload           8
	//*  71  116:icmpgt          196
		{
			i1 = ((int) (flag));
	//   72  119:iload           6
	//   73  121:istore          5
			do
			{
				int j1 = CharsKt.digitOf(s.charAt(j), i);
	//   74  123:aload_0         
	//   75  124:iload_2         
	//   76  125:invokevirtual   #113 <Method char String.charAt(int)>
	//   77  128:iload_1         
	//   78  129:invokestatic    #119 <Method int CharsKt.digitOf(char, int)>
	//   79  132:istore          6
				if(j1 < 0)
	//*  80  134:iload           6
	//*  81  136:ifge            141
					return null;
	//   82  139:aconst_null     
	//   83  140:areturn         
				if(i1 < l1)
	//*  84  141:iload           5
	//*  85  143:iload           9
	//*  86  145:icmpge          150
					return null;
	//   87  148:aconst_null     
	//   88  149:areturn         
				i1 *= i;
	//   89  150:iload           5
	//   90  152:iload_1         
	//   91  153:imul            
	//   92  154:istore          5
				if(i1 < l + j1)
	//*  93  156:iload           5
	//*  94  158:iload           4
	//*  95  160:iload           6
	//*  96  162:iadd            
	//*  97  163:icmpge          168
					return null;
	//   98  166:aconst_null     
	//   99  167:areturn         
				j1 = i1 - j1;
	//  100  168:iload           5
	//  101  170:iload           6
	//  102  172:isub            
	//  103  173:istore          6
				i1 = j1;
	//  104  175:iload           6
	//  105  177:istore          5
				if(j == k1)
					break;
	//  106  179:iload_2         
	//  107  180:iload           8
	//  108  182:icmpeq          196
				j++;
	//  109  185:iload_2         
	//  110  186:iconst_1        
	//  111  187:iadd            
	//  112  188:istore_2        
				i1 = j1;
	//  113  189:iload           6
	//  114  191:istore          5
			} while(true);
	//  115  193:goto            123
		}
		if(k != 0)
	//* 116  196:iload_3         
	//* 117  197:ifeq            206
			return Integer.valueOf(i1);
	//  118  200:iload           5
	//  119  202:invokestatic    #122 <Method Integer Integer.valueOf(int)>
	//  120  205:areturn         
		else
			return Integer.valueOf(-i1);
	//  121  206:iload           5
	//  122  208:ineg            
	//  123  209:invokestatic    #122 <Method Integer Integer.valueOf(int)>
	//  124  212:areturn         
	}

	public static final Long toLongOrNull(String s)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (s)), "receiver$0");
	//    0    0:aload_0         
	//    1    1:ldc1            #81  <String "receiver$0">
	//    2    3:invokestatic    #50  <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		return StringsKt.toLongOrNull(s, 10);
	//    3    6:aload_0         
	//    4    7:bipush          10
	//    5    9:invokestatic    #124 <Method Long StringsKt.toLongOrNull(String, int)>
	//    6   12:areturn         
	}

	public static final Long toLongOrNull(String s, int i)
	{
		int j;
		int k;
		int l;
		long l1;
label0:
		{
			Intrinsics.checkParameterIsNotNull(((Object) (s)), "receiver$0");
	//    0    0:aload_0         
	//    1    1:ldc1            #81  <String "receiver$0">
	//    2    3:invokestatic    #50  <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
			CharsKt.checkRadix(i);
	//    3    6:iload_1         
	//    4    7:invokestatic    #104 <Method int CharsKt.checkRadix(int)>
	//    5   10:pop             
			l = s.length();
	//    6   11:aload_0         
	//    7   12:invokevirtual   #109 <Method int String.length()>
	//    8   15:istore          4
			if(l == 0)
	//*   9   17:iload           4
	//*  10   19:ifne            24
				return null;
	//   11   22:aconst_null     
	//   12   23:areturn         
			j = 0;
	//   13   24:iconst_0        
	//   14   25:istore_2        
			k = ((int) (s.charAt(0)));
	//   15   26:aload_0         
	//   16   27:iconst_0        
	//   17   28:invokevirtual   #113 <Method char String.charAt(int)>
	//   18   31:istore_3        
			long l2 = 0x1L;
	//   19   32:ldc2w           #125 <Long 0x1L>
	//   20   35:lstore          8
			l1 = l2;
	//   21   37:lload           8
	//   22   39:lstore          6
			if(k < '0')
	//*  23   41:iload_3         
	//*  24   42:bipush          48
	//*  25   44:icmpge          90
			{
				if(l == 1)
	//*  26   47:iload           4
	//*  27   49:iconst_1        
	//*  28   50:icmpne          55
					return null;
	//   29   53:aconst_null     
	//   30   54:areturn         
				if(k == '-')
	//*  31   55:iload_3         
	//*  32   56:bipush          45
	//*  33   58:icmpne          71
				{
					l1 = 0x0L;
	//   34   61:ldc2w           #127 <Long 0x0L>
	//   35   64:lstore          6
					j = 1;
	//   36   66:iconst_1        
	//   37   67:istore_2        
				} else
	//*  38   68:goto            90
				{
					if(k == '+')
	//*  39   71:iload_3         
	//*  40   72:bipush          43
	//*  41   74:icmpne          88
					{
						k = 0;
	//   42   77:iconst_0        
	//   43   78:istore_3        
						j = 1;
	//   44   79:iconst_1        
	//   45   80:istore_2        
						l1 = l2;
	//   46   81:lload           8
	//   47   83:lstore          6
					} else
	//*  48   85:goto            92
					{
						return null;
	//   49   88:aconst_null     
	//   50   89:areturn         
					}
					break label0;
				}
			}
			k = j;
	//   51   90:iload_2         
	//   52   91:istore_3        
		}
		long l5 = i;
	//   53   92:iload_1         
	//   54   93:i2l             
	//   55   94:lstore          12
		long l6 = l1 / l5;
	//   56   96:lload           6
	//   57   98:lload           12
	//   58  100:ldiv            
	//   59  101:lstore          14
		long l3 = 0L;
	//   60  103:lconst_0        
	//   61  104:lstore          8
		l--;
	//   62  106:iload           4
	//   63  108:iconst_1        
	//   64  109:isub            
	//   65  110:istore          4
		long l4 = l3;
	//   66  112:lload           8
	//   67  114:lstore          10
		if(j <= l)
	//*  68  116:iload_2         
	//*  69  117:iload           4
	//*  70  119:icmpgt          199
		{
			do
			{
				int i1 = CharsKt.digitOf(s.charAt(j), i);
	//   71  122:aload_0         
	//   72  123:iload_2         
	//   73  124:invokevirtual   #113 <Method char String.charAt(int)>
	//   74  127:iload_1         
	//   75  128:invokestatic    #119 <Method int CharsKt.digitOf(char, int)>
	//   76  131:istore          5
				if(i1 < 0)
	//*  77  133:iload           5
	//*  78  135:ifge            140
					return null;
	//   79  138:aconst_null     
	//   80  139:areturn         
				if(l3 < l6)
	//*  81  140:lload           8
	//*  82  142:lload           14
	//*  83  144:lcmp            
	//*  84  145:ifge            150
					return null;
	//   85  148:aconst_null     
	//   86  149:areturn         
				l3 *= l5;
	//   87  150:lload           8
	//   88  152:lload           12
	//   89  154:lmul            
	//   90  155:lstore          8
				l4 = i1;
	//   91  157:iload           5
	//   92  159:i2l             
	//   93  160:lstore          10
				if(l3 < l1 + l4)
	//*  94  162:lload           8
	//*  95  164:lload           6
	//*  96  166:lload           10
	//*  97  168:ladd            
	//*  98  169:lcmp            
	//*  99  170:ifge            175
					return null;
	//  100  173:aconst_null     
	//  101  174:areturn         
				l3 -= l4;
	//  102  175:lload           8
	//  103  177:lload           10
	//  104  179:lsub            
	//  105  180:lstore          8
				if(j == l)
					break;
	//  106  182:iload_2         
	//  107  183:iload           4
	//  108  185:icmpeq          195
				j++;
	//  109  188:iload_2         
	//  110  189:iconst_1        
	//  111  190:iadd            
	//  112  191:istore_2        
			} while(true);
	//  113  192:goto            122
			l4 = l3;
	//  114  195:lload           8
	//  115  197:lstore          10
		}
		if(k != 0)
	//* 116  199:iload_3         
	//* 117  200:ifeq            209
			return Long.valueOf(l4);
	//  118  203:lload           10
	//  119  205:invokestatic    #133 <Method Long Long.valueOf(long)>
	//  120  208:areturn         
		else
			return Long.valueOf(-l4);
	//  121  209:lload           10
	//  122  211:lneg            
	//  123  212:invokestatic    #133 <Method Long Long.valueOf(long)>
	//  124  215:areturn         
	}

	public static final Short toShortOrNull(String s)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (s)), "receiver$0");
	//    0    0:aload_0         
	//    1    1:ldc1            #81  <String "receiver$0">
	//    2    3:invokestatic    #50  <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		return StringsKt.toShortOrNull(s, 10);
	//    3    6:aload_0         
	//    4    7:bipush          10
	//    5    9:invokestatic    #135 <Method Short StringsKt.toShortOrNull(String, int)>
	//    6   12:areturn         
	}

	public static final Short toShortOrNull(String s, int i)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (s)), "receiver$0");
	//    0    0:aload_0         
	//    1    1:ldc1            #81  <String "receiver$0">
	//    2    3:invokestatic    #50  <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		s = ((String) (StringsKt.toIntOrNull(s, i)));
	//    3    6:aload_0         
	//    4    7:iload_1         
	//    5    8:invokestatic    #86  <Method Integer StringsKt.toIntOrNull(String, int)>
	//    6   11:astore_0        
		if(s != null)
	//*   7   12:aload_0         
	//*   8   13:ifnull          45
		{
			i = ((Integer) (s)).intValue();
	//    9   16:aload_0         
	//   10   17:invokevirtual   #92  <Method int Integer.intValue()>
	//   11   20:istore_1        
			if(i >= -32768)
	//*  12   21:iload_1         
	//*  13   22:sipush          -32768
	//*  14   25:icmplt          43
			{
				if(i > 32767)
	//*  15   28:iload_1         
	//*  16   29:sipush          32767
	//*  17   32:icmple          37
					return null;
	//   18   35:aconst_null     
	//   19   36:areturn         
				else
					return Short.valueOf((short)i);
	//   20   37:iload_1         
	//   21   38:int2short       
	//   22   39:invokestatic    #140 <Method Short Short.valueOf(short)>
	//   23   42:areturn         
			} else
			{
				return null;
	//   24   43:aconst_null     
	//   25   44:areturn         
			}
		} else
		{
			return null;
	//   26   45:aconst_null     
	//   27   46:areturn         
		}
	}
}

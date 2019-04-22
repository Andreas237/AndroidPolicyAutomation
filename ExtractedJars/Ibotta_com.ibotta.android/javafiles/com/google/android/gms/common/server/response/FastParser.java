// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.server.response;

import android.util.Log;
import com.google.android.gms.common.util.Base64Utils;
import com.google.android.gms.common.util.JsonUtils;
import java.io.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.*;

// Referenced classes of package com.google.android.gms.common.server.response:
//			zza, zzb, zzc, zzd, 
//			zze, zzf, zzg, zzh, 
//			FastJsonResponse, PostProcessor

public class FastParser
{
	public static class ParseException extends Exception
	{

		public ParseException(String s)
		{
			super(s);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #11  <Method void Exception(String)>
		//    3    5:return          
		}

		public ParseException(String s, Throwable throwable)
		{
			super(s, throwable);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokespecial   #15  <Method void Exception(String, Throwable)>
		//    4    6:return          
		}

		public ParseException(Throwable throwable)
		{
			super(throwable);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #18  <Method void Exception(Throwable)>
		//    3    5:return          
		}
	}

	private static interface zza
	{

		public abstract Object zzh(FastParser fastparser, BufferedReader bufferedreader)
			throws ParseException, IOException;
	}


	public FastParser()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #109 <Method void Object()>
	//    2    4:aload_0         
	//    3    5:iconst_1        
	//    4    6:newarray        char[]
	//    5    8:putfield        #111 <Field char[] zzwq>
	//    6   11:aload_0         
	//    7   12:bipush          32
	//    8   14:newarray        char[]
	//    9   16:putfield        #113 <Field char[] zzwr>
	//   10   19:aload_0         
	//   11   20:sipush          1024
	//   12   23:newarray        char[]
	//   13   25:putfield        #115 <Field char[] zzws>
	//   14   28:aload_0         
	//   15   29:new             #117 <Class StringBuilder>
	//   16   32:dup             
	//   17   33:bipush          32
	//   18   35:invokespecial   #120 <Method void StringBuilder(int)>
	//   19   38:putfield        #122 <Field StringBuilder zzwt>
	//   20   41:aload_0         
	//   21   42:new             #117 <Class StringBuilder>
	//   22   45:dup             
	//   23   46:sipush          1024
	//   24   49:invokespecial   #120 <Method void StringBuilder(int)>
	//   25   52:putfield        #124 <Field StringBuilder zzwu>
	//   26   55:aload_0         
	//   27   56:new             #126 <Class Stack>
	//   28   59:dup             
	//   29   60:invokespecial   #127 <Method void Stack()>
	//   30   63:putfield        #129 <Field Stack zzxb>
	//   31   66:return          
	}

	static int zza(FastParser fastparser, BufferedReader bufferedreader)
		throws ParseException, IOException
	{
		return fastparser.zzd(bufferedreader);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #136 <Method int zzd(BufferedReader)>
	//    3    5:ireturn         
	}

	private final int zza(BufferedReader bufferedreader, char ac[])
		throws ParseException, IOException
	{
		char c = zzj(bufferedreader);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #142 <Method char zzj(BufferedReader)>
	//    3    5:istore_3        
		if(c != 0)
	//*   4    6:iload_3         
	//*   5    7:ifeq            297
		{
			if(c != ',')
	//*   6   10:iload_3         
	//*   7   11:bipush          44
	//*   8   13:icmpeq          287
			{
				if(c == 'n')
	//*   9   16:iload_3         
	//*  10   17:bipush          110
	//*  11   19:icmpne          32
				{
					zzb(bufferedreader, zzwv);
	//   12   22:aload_0         
	//   13   23:aload_1         
	//   14   24:getstatic       #50  <Field char[] zzwv>
	//   15   27:invokespecial   #146 <Method void zzb(BufferedReader, char[])>
					return 0;
	//   16   30:iconst_0        
	//   17   31:ireturn         
				}
				bufferedreader.mark(1024);
	//   18   32:aload_1         
	//   19   33:sipush          1024
	//   20   36:invokevirtual   #151 <Method void BufferedReader.mark(int)>
				int k;
				if(c == '"')
	//*  21   39:iload_3         
	//*  22   40:bipush          34
	//*  23   42:icmpne          155
				{
					int i = 0;
	//   24   45:iconst_0        
	//   25   46:istore          4
					boolean flag = false;
	//   26   48:iconst_0        
	//   27   49:istore          5
					do
					{
						k = i;
	//   28   51:iload           4
	//   29   53:istore          6
						if(i >= ac.length)
							break;
	//   30   55:iload           4
	//   31   57:aload_2         
	//   32   58:arraylength     
	//   33   59:icmpge          260
						k = i;
	//   34   62:iload           4
	//   35   64:istore          6
						if(bufferedreader.read(ac, i, 1) == -1)
							break;
	//   36   66:aload_1         
	//   37   67:aload_2         
	//   38   68:iload           4
	//   39   70:iconst_1        
	//   40   71:invokevirtual   #155 <Method int BufferedReader.read(char[], int, int)>
	//   41   74:iconst_m1       
	//   42   75:icmpeq          260
						c = ac[i];
	//   43   78:aload_2         
	//   44   79:iload           4
	//   45   81:caload          
	//   46   82:istore_3        
						if(!Character.isISOControl(c))
	//*  47   83:iload_3         
	//*  48   84:invokestatic    #161 <Method boolean Character.isISOControl(char)>
	//*  49   87:ifne            145
						{
							if(c == '"' && !flag)
	//*  50   90:iload_3         
	//*  51   91:bipush          34
	//*  52   93:icmpne          118
	//*  53   96:iload           5
	//*  54   98:ifne            118
							{
								bufferedreader.reset();
	//   55  101:aload_1         
	//   56  102:invokevirtual   #164 <Method void BufferedReader.reset()>
								bufferedreader.skip(i + 1);
	//   57  105:aload_1         
	//   58  106:iload           4
	//   59  108:iconst_1        
	//   60  109:iadd            
	//   61  110:i2l             
	//   62  111:invokevirtual   #168 <Method long BufferedReader.skip(long)>
	//   63  114:pop2            
								return i;
	//   64  115:iload           4
	//   65  117:ireturn         
							}
							if(c == '\\')
	//*  66  118:iload_3         
	//*  67  119:bipush          92
	//*  68  121:icmpne          133
								flag ^= true;
	//   69  124:iload           5
	//   70  126:iconst_1        
	//   71  127:ixor            
	//   72  128:istore          5
							else
	//*  73  130:goto            136
								flag = false;
	//   74  133:iconst_0        
	//   75  134:istore          5
							i++;
	//   76  136:iload           4
	//   77  138:iconst_1        
	//   78  139:iadd            
	//   79  140:istore          4
						} else
	//*  80  142:goto            51
						{
							throw new ParseException("Unexpected control character while reading string");
	//   81  145:new             #7   <Class FastParser$ParseException>
	//   82  148:dup             
	//   83  149:ldc1            #170 <String "Unexpected control character while reading string">
	//   84  151:invokespecial   #173 <Method void FastParser$ParseException(String)>
	//   85  154:athrow          
						}
					} while(true);
				} else
				{
					ac[0] = c;
	//   86  155:aload_2         
	//   87  156:iconst_0        
	//   88  157:iload_3         
	//   89  158:castore         
					int j = 1;
	//   90  159:iconst_1        
	//   91  160:istore          4
					do
					{
						k = j;
	//   92  162:iload           4
	//   93  164:istore          6
						if(j >= ac.length)
							break;
	//   94  166:iload           4
	//   95  168:aload_2         
	//   96  169:arraylength     
	//   97  170:icmpge          260
						k = j;
	//   98  173:iload           4
	//   99  175:istore          6
						if(bufferedreader.read(ac, j, 1) == -1)
							break;
	//  100  177:aload_1         
	//  101  178:aload_2         
	//  102  179:iload           4
	//  103  181:iconst_1        
	//  104  182:invokevirtual   #155 <Method int BufferedReader.read(char[], int, int)>
	//  105  185:iconst_m1       
	//  106  186:icmpeq          260
						if(ac[j] != '}' && ac[j] != ',' && !Character.isWhitespace(ac[j]) && ac[j] != ']')
	//* 107  189:aload_2         
	//* 108  190:iload           4
	//* 109  192:caload          
	//* 110  193:bipush          125
	//* 111  195:icmpeq          238
	//* 112  198:aload_2         
	//* 113  199:iload           4
	//* 114  201:caload          
	//* 115  202:bipush          44
	//* 116  204:icmpeq          238
	//* 117  207:aload_2         
	//* 118  208:iload           4
	//* 119  210:caload          
	//* 120  211:invokestatic    #176 <Method boolean Character.isWhitespace(char)>
	//* 121  214:ifne            238
	//* 122  217:aload_2         
	//* 123  218:iload           4
	//* 124  220:caload          
	//* 125  221:bipush          93
	//* 126  223:icmpne          229
	//* 127  226:goto            238
						{
							j++;
	//  128  229:iload           4
	//  129  231:iconst_1        
	//  130  232:iadd            
	//  131  233:istore          4
						} else
	//* 132  235:goto            162
						{
							bufferedreader.reset();
	//  133  238:aload_1         
	//  134  239:invokevirtual   #164 <Method void BufferedReader.reset()>
							bufferedreader.skip(j - 1);
	//  135  242:aload_1         
	//  136  243:iload           4
	//  137  245:iconst_1        
	//  138  246:isub            
	//  139  247:i2l             
	//  140  248:invokevirtual   #168 <Method long BufferedReader.skip(long)>
	//  141  251:pop2            
							ac[j] = '\0';
	//  142  252:aload_2         
	//  143  253:iload           4
	//  144  255:iconst_0        
	//  145  256:castore         
							return j;
	//  146  257:iload           4
	//  147  259:ireturn         
						}
					} while(true);
				}
				if(k == ac.length)
	//* 148  260:iload           6
	//* 149  262:aload_2         
	//* 150  263:arraylength     
	//* 151  264:icmpne          277
					throw new ParseException("Absurdly long value");
	//  152  267:new             #7   <Class FastParser$ParseException>
	//  153  270:dup             
	//  154  271:ldc1            #178 <String "Absurdly long value">
	//  155  273:invokespecial   #173 <Method void FastParser$ParseException(String)>
	//  156  276:athrow          
				else
					throw new ParseException("Unexpected EOF");
	//  157  277:new             #7   <Class FastParser$ParseException>
	//  158  280:dup             
	//  159  281:ldc1            #180 <String "Unexpected EOF">
	//  160  283:invokespecial   #173 <Method void FastParser$ParseException(String)>
	//  161  286:athrow          
			} else
			{
				throw new ParseException("Missing value");
	//  162  287:new             #7   <Class FastParser$ParseException>
	//  163  290:dup             
	//  164  291:ldc1            #182 <String "Missing value">
	//  165  293:invokespecial   #173 <Method void FastParser$ParseException(String)>
	//  166  296:athrow          
			}
		} else
		{
			throw new ParseException("Unexpected EOF");
	//  167  297:new             #7   <Class FastParser$ParseException>
	//  168  300:dup             
	//  169  301:ldc1            #180 <String "Unexpected EOF">
	//  170  303:invokespecial   #173 <Method void FastParser$ParseException(String)>
	//  171  306:athrow          
		}
	}

	private final String zza(BufferedReader bufferedreader)
		throws ParseException, IOException
	{
		zzxb.push(((Object) (Integer.valueOf(2))));
	//    0    0:aload_0         
	//    1    1:getfield        #129 <Field Stack zzxb>
	//    2    4:iconst_2        
	//    3    5:invokestatic    #189 <Method Integer Integer.valueOf(int)>
	//    4    8:invokevirtual   #193 <Method Object Stack.push(Object)>
	//    5   11:pop             
		char c = zzj(bufferedreader);
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:invokespecial   #142 <Method char zzj(BufferedReader)>
	//    9   17:istore_2        
		if(c != '"')
	//*  10   18:iload_2         
	//*  11   19:bipush          34
	//*  12   21:icmpeq          95
			if(c != ']')
	//*  13   24:iload_2         
	//*  14   25:bipush          93
	//*  15   27:icmpeq          78
			{
				if(c == '}')
	//*  16   30:iload_2         
	//*  17   31:bipush          125
	//*  18   33:icmpne          43
				{
					zzk(2);
	//   19   36:aload_0         
	//   20   37:iconst_2        
	//   21   38:invokespecial   #196 <Method void zzk(int)>
					return null;
	//   22   41:aconst_null     
	//   23   42:areturn         
				} else
				{
					bufferedreader = ((BufferedReader) (new StringBuilder(19)));
	//   24   43:new             #117 <Class StringBuilder>
	//   25   46:dup             
	//   26   47:bipush          19
	//   27   49:invokespecial   #120 <Method void StringBuilder(int)>
	//   28   52:astore_1        
					((StringBuilder) (bufferedreader)).append("Unexpected token: ");
	//   29   53:aload_1         
	//   30   54:ldc1            #198 <String "Unexpected token: ">
	//   31   56:invokevirtual   #202 <Method StringBuilder StringBuilder.append(String)>
	//   32   59:pop             
					((StringBuilder) (bufferedreader)).append(c);
	//   33   60:aload_1         
	//   34   61:iload_2         
	//   35   62:invokevirtual   #205 <Method StringBuilder StringBuilder.append(char)>
	//   36   65:pop             
					throw new ParseException(((StringBuilder) (bufferedreader)).toString());
	//   37   66:new             #7   <Class FastParser$ParseException>
	//   38   69:dup             
	//   39   70:aload_1         
	//   40   71:invokevirtual   #209 <Method String StringBuilder.toString()>
	//   41   74:invokespecial   #173 <Method void FastParser$ParseException(String)>
	//   42   77:athrow          
				}
			} else
			{
				zzk(2);
	//   43   78:aload_0         
	//   44   79:iconst_2        
	//   45   80:invokespecial   #196 <Method void zzk(int)>
				zzk(1);
	//   46   83:aload_0         
	//   47   84:iconst_1        
	//   48   85:invokespecial   #196 <Method void zzk(int)>
				zzk(5);
	//   49   88:aload_0         
	//   50   89:iconst_5        
	//   51   90:invokespecial   #196 <Method void zzk(int)>
				return null;
	//   52   93:aconst_null     
	//   53   94:areturn         
			}
		zzxb.push(((Object) (Integer.valueOf(3))));
	//   54   95:aload_0         
	//   55   96:getfield        #129 <Field Stack zzxb>
	//   56   99:iconst_3        
	//   57  100:invokestatic    #189 <Method Integer Integer.valueOf(int)>
	//   58  103:invokevirtual   #193 <Method Object Stack.push(Object)>
	//   59  106:pop             
		String s = zzb(bufferedreader, zzwr, zzwt, ((char []) (null)));
	//   60  107:aload_1         
	//   61  108:aload_0         
	//   62  109:getfield        #113 <Field char[] zzwr>
	//   63  112:aload_0         
	//   64  113:getfield        #122 <Field StringBuilder zzwt>
	//   65  116:aconst_null     
	//   66  117:invokestatic    #212 <Method String zzb(BufferedReader, char[], StringBuilder, char[])>
	//   67  120:astore_3        
		zzk(3);
	//   68  121:aload_0         
	//   69  122:iconst_3        
	//   70  123:invokespecial   #196 <Method void zzk(int)>
		if(zzj(bufferedreader) == ':')
	//*  71  126:aload_0         
	//*  72  127:aload_1         
	//*  73  128:invokespecial   #142 <Method char zzj(BufferedReader)>
	//*  74  131:bipush          58
	//*  75  133:icmpne          138
			return s;
	//   76  136:aload_3         
	//   77  137:areturn         
		else
			throw new ParseException("Expected key/value separator");
	//   78  138:new             #7   <Class FastParser$ParseException>
	//   79  141:dup             
	//   80  142:ldc1            #214 <String "Expected key/value separator">
	//   81  144:invokespecial   #173 <Method void FastParser$ParseException(String)>
	//   82  147:athrow          
	}

	private final String zza(BufferedReader bufferedreader, char ac[], StringBuilder stringbuilder, char ac1[])
		throws ParseException, IOException
	{
		char c = zzj(bufferedreader);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #142 <Method char zzj(BufferedReader)>
	//    3    5:istore          5
		if(c != '"')
	//*   4    7:iload           5
	//*   5    9:bipush          34
	//*   6   11:icmpeq          41
		{
			if(c == 'n')
	//*   7   14:iload           5
	//*   8   16:bipush          110
	//*   9   18:icmpne          31
			{
				zzb(bufferedreader, zzwv);
	//   10   21:aload_0         
	//   11   22:aload_1         
	//   12   23:getstatic       #50  <Field char[] zzwv>
	//   13   26:invokespecial   #146 <Method void zzb(BufferedReader, char[])>
				return null;
	//   14   29:aconst_null     
	//   15   30:areturn         
			} else
			{
				throw new ParseException("Expected string");
	//   16   31:new             #7   <Class FastParser$ParseException>
	//   17   34:dup             
	//   18   35:ldc1            #216 <String "Expected string">
	//   19   37:invokespecial   #173 <Method void FastParser$ParseException(String)>
	//   20   40:athrow          
			}
		} else
		{
			return zzb(bufferedreader, ac, stringbuilder, ac1);
	//   21   41:aload_1         
	//   22   42:aload_2         
	//   23   43:aload_3         
	//   24   44:aload           4
	//   25   46:invokestatic    #212 <Method String zzb(BufferedReader, char[], StringBuilder, char[])>
	//   26   49:areturn         
		}
	}

	private final ArrayList zza(BufferedReader bufferedreader, FastJsonResponse.Field field)
		throws ParseException, IOException
	{
		ArrayList arraylist = new ArrayList();
	//    0    0:new             #223 <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #224 <Method void ArrayList()>
	//    3    7:astore          5
		char c = zzj(bufferedreader);
	//    4    9:aload_0         
	//    5   10:aload_1         
	//    6   11:invokespecial   #142 <Method char zzj(BufferedReader)>
	//    7   14:istore_3        
		if(c != ']')
	//*   8   15:iload_3         
	//*   9   16:bipush          93
	//*  10   18:icmpeq          240
		{
			if(c != 'n')
	//*  11   21:iload_3         
	//*  12   22:bipush          110
	//*  13   24:icmpeq          225
			{
				if(c == '{')
	//*  14   27:iload_3         
	//*  15   28:bipush          123
	//*  16   30:icmpne          190
				{
					Object obj = ((Object) (zzxb));
	//   17   33:aload_0         
	//   18   34:getfield        #129 <Field Stack zzxb>
	//   19   37:astore          4
					do
					{
						((Stack) (obj)).push(((Object) (Integer.valueOf(1))));
	//   20   39:aload           4
	//   21   41:iconst_1        
	//   22   42:invokestatic    #189 <Method Integer Integer.valueOf(int)>
	//   23   45:invokevirtual   #193 <Method Object Stack.push(Object)>
	//   24   48:pop             
						try
						{
							obj = ((Object) (field.newConcreteTypeInstance()));
	//   25   49:aload_2         
	//   26   50:invokevirtual   #230 <Method FastJsonResponse FastJsonResponse$Field.newConcreteTypeInstance()>
	//   27   53:astore          4
							if(!zza(bufferedreader, ((FastJsonResponse) (obj))))
								break;
	//   28   55:aload_0         
	//   29   56:aload_1         
	//   30   57:aload           4
	//   31   59:invokespecial   #233 <Method boolean zza(BufferedReader, FastJsonResponse)>
	//   32   62:ifeq            163
							arraylist.add(obj);
	//   33   65:aload           5
	//   34   67:aload           4
	//   35   69:invokevirtual   #237 <Method boolean ArrayList.add(Object)>
	//   36   72:pop             
						}
	//*  37   73:aload_0         
	//*  38   74:aload_1         
	//*  39   75:invokespecial   #142 <Method char zzj(BufferedReader)>
	//*  40   78:istore_3        
	//*  41   79:iload_3         
	//*  42   80:bipush          44
	//*  43   82:icmpeq          134
	//*  44   85:iload_3         
	//*  45   86:bipush          93
	//*  46   88:icmpne          99
	//*  47   91:aload_0         
	//*  48   92:iconst_5        
	//*  49   93:invokespecial   #196 <Method void zzk(int)>
	//*  50   96:aload           5
	//*  51   98:areturn         
	//*  52   99:new             #117 <Class StringBuilder>
	//*  53  102:dup             
	//*  54  103:bipush          19
	//*  55  105:invokespecial   #120 <Method void StringBuilder(int)>
	//*  56  108:astore_1        
	//*  57  109:aload_1         
	//*  58  110:ldc1            #198 <String "Unexpected token: ">
	//*  59  112:invokevirtual   #202 <Method StringBuilder StringBuilder.append(String)>
	//*  60  115:pop             
	//*  61  116:aload_1         
	//*  62  117:iload_3         
	//*  63  118:invokevirtual   #205 <Method StringBuilder StringBuilder.append(char)>
	//*  64  121:pop             
	//*  65  122:new             #7   <Class FastParser$ParseException>
	//*  66  125:dup             
	//*  67  126:aload_1         
	//*  68  127:invokevirtual   #209 <Method String StringBuilder.toString()>
	//*  69  130:invokespecial   #173 <Method void FastParser$ParseException(String)>
	//*  70  133:athrow          
	//*  71  134:aload_0         
	//*  72  135:aload_1         
	//*  73  136:invokespecial   #142 <Method char zzj(BufferedReader)>
	//*  74  139:bipush          123
	//*  75  141:icmpne          153
	//*  76  144:aload_0         
	//*  77  145:getfield        #129 <Field Stack zzxb>
	//*  78  148:astore          4
	//*  79  150:goto            39
	//*  80  153:new             #7   <Class FastParser$ParseException>
	//*  81  156:dup             
	//*  82  157:ldc1            #239 <String "Expected start of next object in array">
	//*  83  159:invokespecial   #173 <Method void FastParser$ParseException(String)>
	//*  84  162:athrow          
	//*  85  163:aload           5
	//*  86  165:areturn         
	//*  87  166:astore_1        
	//*  88  167:new             #7   <Class FastParser$ParseException>
	//*  89  170:dup             
	//*  90  171:ldc1            #241 <String "Error instantiating inner object">
	//*  91  173:aload_1         
	//*  92  174:invokespecial   #244 <Method void FastParser$ParseException(String, Throwable)>
	//*  93  177:athrow          
						// Misplaced declaration of an exception variable
						catch(BufferedReader bufferedreader)
	//*  94  178:astore_1        
						{
							throw new ParseException("Error instantiating inner object", ((Throwable) (bufferedreader)));
	//   95  179:new             #7   <Class FastParser$ParseException>
	//   96  182:dup             
	//   97  183:ldc1            #241 <String "Error instantiating inner object">
	//   98  185:aload_1         
	//   99  186:invokespecial   #244 <Method void FastParser$ParseException(String, Throwable)>
	//  100  189:athrow          
						}
						// Misplaced declaration of an exception variable
						catch(BufferedReader bufferedreader)
						{
							throw new ParseException("Error instantiating inner object", ((Throwable) (bufferedreader)));
						}
						c = zzj(bufferedreader);
						if(c != ',')
							if(c == ']')
							{
								zzk(5);
								return arraylist;
							} else
							{
								bufferedreader = ((BufferedReader) (new StringBuilder(19)));
								((StringBuilder) (bufferedreader)).append("Unexpected token: ");
								((StringBuilder) (bufferedreader)).append(c);
								throw new ParseException(((StringBuilder) (bufferedreader)).toString());
							}
						if(zzj(bufferedreader) == '{')
							obj = ((Object) (zzxb));
						else
							throw new ParseException("Expected start of next object in array");
					} while(true);
					return arraylist;
				} else
				{
					bufferedreader = ((BufferedReader) (new StringBuilder(19)));
	//  101  190:new             #117 <Class StringBuilder>
	//  102  193:dup             
	//  103  194:bipush          19
	//  104  196:invokespecial   #120 <Method void StringBuilder(int)>
	//  105  199:astore_1        
					((StringBuilder) (bufferedreader)).append("Unexpected token: ");
	//  106  200:aload_1         
	//  107  201:ldc1            #198 <String "Unexpected token: ">
	//  108  203:invokevirtual   #202 <Method StringBuilder StringBuilder.append(String)>
	//  109  206:pop             
					((StringBuilder) (bufferedreader)).append(c);
	//  110  207:aload_1         
	//  111  208:iload_3         
	//  112  209:invokevirtual   #205 <Method StringBuilder StringBuilder.append(char)>
	//  113  212:pop             
					throw new ParseException(((StringBuilder) (bufferedreader)).toString());
	//  114  213:new             #7   <Class FastParser$ParseException>
	//  115  216:dup             
	//  116  217:aload_1         
	//  117  218:invokevirtual   #209 <Method String StringBuilder.toString()>
	//  118  221:invokespecial   #173 <Method void FastParser$ParseException(String)>
	//  119  224:athrow          
				}
			} else
			{
				zzb(bufferedreader, zzwv);
	//  120  225:aload_0         
	//  121  226:aload_1         
	//  122  227:getstatic       #50  <Field char[] zzwv>
	//  123  230:invokespecial   #146 <Method void zzb(BufferedReader, char[])>
				zzk(5);
	//  124  233:aload_0         
	//  125  234:iconst_5        
	//  126  235:invokespecial   #196 <Method void zzk(int)>
				return null;
	//  127  238:aconst_null     
	//  128  239:areturn         
			}
		} else
		{
			zzk(5);
	//  129  240:aload_0         
	//  130  241:iconst_5        
	//  131  242:invokespecial   #196 <Method void zzk(int)>
			return arraylist;
	//  132  245:aload           5
	//  133  247:areturn         
		}
	}

	private final ArrayList zza(BufferedReader bufferedreader, zza zza1)
		throws ParseException, IOException
	{
		char c = zzj(bufferedreader);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #142 <Method char zzj(BufferedReader)>
	//    3    5:istore_3        
		if(c == 'n')
	//*   4    6:iload_3         
	//*   5    7:bipush          110
	//*   6    9:icmpne          22
		{
			zzb(bufferedreader, zzwv);
	//    7   12:aload_0         
	//    8   13:aload_1         
	//    9   14:getstatic       #50  <Field char[] zzwv>
	//   10   17:invokespecial   #146 <Method void zzb(BufferedReader, char[])>
			return null;
	//   11   20:aconst_null     
	//   12   21:areturn         
		}
		if(c == '[')
	//*  13   22:iload_3         
	//*  14   23:bipush          91
	//*  15   25:icmpne          117
		{
			zzxb.push(((Object) (Integer.valueOf(5))));
	//   16   28:aload_0         
	//   17   29:getfield        #129 <Field Stack zzxb>
	//   18   32:iconst_5        
	//   19   33:invokestatic    #189 <Method Integer Integer.valueOf(int)>
	//   20   36:invokevirtual   #193 <Method Object Stack.push(Object)>
	//   21   39:pop             
			ArrayList arraylist = new ArrayList();
	//   22   40:new             #223 <Class ArrayList>
	//   23   43:dup             
	//   24   44:invokespecial   #224 <Method void ArrayList()>
	//   25   47:astore          4
			do
			{
				bufferedreader.mark(1024);
	//   26   49:aload_1         
	//   27   50:sipush          1024
	//   28   53:invokevirtual   #151 <Method void BufferedReader.mark(int)>
				char c1 = zzj(bufferedreader);
	//   29   56:aload_0         
	//   30   57:aload_1         
	//   31   58:invokespecial   #142 <Method char zzj(BufferedReader)>
	//   32   61:istore_3        
				if(c1 == 0)
					break;
	//   33   62:iload_3         
	//   34   63:ifeq            107
				if(c1 != ',')
	//*  35   66:iload_3         
	//*  36   67:bipush          44
	//*  37   69:icmpeq          49
					if(c1 != ']')
	//*  38   72:iload_3         
	//*  39   73:bipush          93
	//*  40   75:icmpeq          99
					{
						bufferedreader.reset();
	//   41   78:aload_1         
	//   42   79:invokevirtual   #164 <Method void BufferedReader.reset()>
						arraylist.add(zza1.zzh(this, bufferedreader));
	//   43   82:aload           4
	//   44   84:aload_2         
	//   45   85:aload_0         
	//   46   86:aload_1         
	//   47   87:invokeinterface #251 <Method Object FastParser$zza.zzh(FastParser, BufferedReader)>
	//   48   92:invokevirtual   #237 <Method boolean ArrayList.add(Object)>
	//   49   95:pop             
					} else
	//*  50   96:goto            49
					{
						zzk(5);
	//   51   99:aload_0         
	//   52  100:iconst_5        
	//   53  101:invokespecial   #196 <Method void zzk(int)>
						return arraylist;
	//   54  104:aload           4
	//   55  106:areturn         
					}
			} while(true);
			throw new ParseException("Unexpected EOF");
	//   56  107:new             #7   <Class FastParser$ParseException>
	//   57  110:dup             
	//   58  111:ldc1            #180 <String "Unexpected EOF">
	//   59  113:invokespecial   #173 <Method void FastParser$ParseException(String)>
	//   60  116:athrow          
		} else
		{
			throw new ParseException("Expected start of array");
	//   61  117:new             #7   <Class FastParser$ParseException>
	//   62  120:dup             
	//   63  121:ldc1            #253 <String "Expected start of array">
	//   64  123:invokespecial   #173 <Method void FastParser$ParseException(String)>
	//   65  126:athrow          
		}
	}

	static boolean zza(FastParser fastparser, BufferedReader bufferedreader, boolean flag)
		throws ParseException, IOException
	{
		return fastparser.zza(bufferedreader, false);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_0        
	//    3    3:invokespecial   #258 <Method boolean zza(BufferedReader, boolean)>
	//    4    6:ireturn         
	}

	private final boolean zza(BufferedReader bufferedreader, FastJsonResponse fastjsonresponse)
		throws ParseException, IOException
	{
		Object obj;
		Map map;
		map = fastjsonresponse.getFieldMappings();
	//    0    0:aload_2         
	//    1    1:invokevirtual   #264 <Method Map FastJsonResponse.getFieldMappings()>
	//    2    4:astore          6
		obj = ((Object) (zza(bufferedreader)));
	//    3    6:aload_0         
	//    4    7:aload_1         
	//    5    8:invokespecial   #266 <Method String zza(BufferedReader)>
	//    6   11:astore          5
		if(obj == null)
	//*   7   13:aload           5
	//*   8   15:ifnonnull       25
		{
			zzk(1);
	//    9   18:aload_0         
	//   10   19:iconst_1        
	//   11   20:invokespecial   #196 <Method void zzk(int)>
			return false;
	//   12   23:iconst_0        
	//   13   24:ireturn         
		}
_L28:
		FastJsonResponse.Field field;
		if(obj == null)
			break; /* Loop/switch isn't completed */
	//   14   25:aload           5
	//   15   27:ifnull          1174
		field = (FastJsonResponse.Field)map.get(obj);
	//   16   30:aload           6
	//   17   32:aload           5
	//   18   34:invokeinterface #271 <Method Object Map.get(Object)>
	//   19   39:checkcast       #226 <Class FastJsonResponse$Field>
	//   20   42:astore          7
		if(field == null)
	//*  21   44:aload           7
	//*  22   46:ifnonnull       59
		{
			obj = ((Object) (zzb(bufferedreader)));
	//   23   49:aload_0         
	//   24   50:aload_1         
	//   25   51:invokespecial   #273 <Method String zzb(BufferedReader)>
	//   26   54:astore          5
			continue; /* Loop/switch isn't completed */
	//   27   56:goto            25
		}
		zzxb.push(((Object) (Integer.valueOf(4))));
	//   28   59:aload_0         
	//   29   60:getfield        #129 <Field Stack zzxb>
	//   30   63:iconst_4        
	//   31   64:invokestatic    #189 <Method Integer Integer.valueOf(int)>
	//   32   67:invokevirtual   #193 <Method Object Stack.push(Object)>
	//   33   70:pop             
		field.getTypeIn();
	//   34   71:aload           7
	//   35   73:invokevirtual   #277 <Method int FastJsonResponse$Field.getTypeIn()>
		JVM INSTR tableswitch 0 11: default 140
	//	               0 1058
	//	               1 1019
	//	               2 980
	//	               3 941
	//	               4 902
	//	               5 863
	//	               6 823
	//	               7 784
	//	               8 752
	//	               9 728
	//	               10 402
	//	               11 184;
	//   36   76:tableswitch     0 11: default 140
	//	               0 1058
	//	               1 1019
	//	               2 980
	//	               3 941
	//	               4 902
	//	               5 863
	//	               6 823
	//	               7 784
	//	               8 752
	//	               9 728
	//	               10 402
	//	               11 184
		   goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13
_L9:
		break MISSING_BLOCK_LABEL_784;
_L8:
		break MISSING_BLOCK_LABEL_823;
_L7:
		break MISSING_BLOCK_LABEL_863;
_L6:
		break MISSING_BLOCK_LABEL_902;
_L5:
		break MISSING_BLOCK_LABEL_941;
_L4:
		break MISSING_BLOCK_LABEL_980;
_L3:
		break MISSING_BLOCK_LABEL_1019;
_L2:
		break MISSING_BLOCK_LABEL_1058;
_L1:
		int i = field.getTypeIn();
	//   37  140:aload           7
	//   38  142:invokevirtual   #277 <Method int FastJsonResponse$Field.getTypeIn()>
	//   39  145:istore          4
		bufferedreader = ((BufferedReader) (new StringBuilder(30)));
	//   40  147:new             #117 <Class StringBuilder>
	//   41  150:dup             
	//   42  151:bipush          30
	//   43  153:invokespecial   #120 <Method void StringBuilder(int)>
	//   44  156:astore_1        
		((StringBuilder) (bufferedreader)).append("Invalid field type ");
	//   45  157:aload_1         
	//   46  158:ldc2            #279 <String "Invalid field type ">
	//   47  161:invokevirtual   #202 <Method StringBuilder StringBuilder.append(String)>
	//   48  164:pop             
		((StringBuilder) (bufferedreader)).append(i);
	//   49  165:aload_1         
	//   50  166:iload           4
	//   51  168:invokevirtual   #282 <Method StringBuilder StringBuilder.append(int)>
	//   52  171:pop             
		throw new ParseException(((StringBuilder) (bufferedreader)).toString());
	//   53  172:new             #7   <Class FastParser$ParseException>
	//   54  175:dup             
	//   55  176:aload_1         
	//   56  177:invokevirtual   #209 <Method String StringBuilder.toString()>
	//   57  180:invokespecial   #173 <Method void FastParser$ParseException(String)>
	//   58  183:athrow          
_L13:
		if(field.isTypeInArray())
	//*  59  184:aload           7
	//*  60  186:invokevirtual   #286 <Method boolean FastJsonResponse$Field.isTypeInArray()>
	//*  61  189:ifeq            280
		{
			char c2 = zzj(bufferedreader);
	//   62  192:aload_0         
	//   63  193:aload_1         
	//   64  194:invokespecial   #142 <Method char zzj(BufferedReader)>
	//   65  197:istore          4
			if(c2 == 'n')
	//*  66  199:iload           4
	//*  67  201:bipush          110
	//*  68  203:icmpne          229
			{
				zzb(bufferedreader, zzwv);
	//   69  206:aload_0         
	//   70  207:aload_1         
	//   71  208:getstatic       #50  <Field char[] zzwv>
	//   72  211:invokespecial   #146 <Method void zzb(BufferedReader, char[])>
				fastjsonresponse.addConcreteTypeArrayInternal(field, field.getOutputFieldName(), ((ArrayList) (null)));
	//   73  214:aload_2         
	//   74  215:aload           7
	//   75  217:aload           7
	//   76  219:invokevirtual   #289 <Method String FastJsonResponse$Field.getOutputFieldName()>
	//   77  222:aconst_null     
	//   78  223:invokevirtual   #293 <Method void FastJsonResponse.addConcreteTypeArrayInternal(FastJsonResponse$Field, String, ArrayList)>
			} else
	//*  79  226:goto            1094
			{
				zzxb.push(((Object) (Integer.valueOf(5))));
	//   80  229:aload_0         
	//   81  230:getfield        #129 <Field Stack zzxb>
	//   82  233:iconst_5        
	//   83  234:invokestatic    #189 <Method Integer Integer.valueOf(int)>
	//   84  237:invokevirtual   #193 <Method Object Stack.push(Object)>
	//   85  240:pop             
				if(c2 == '[')
	//*  86  241:iload           4
	//*  87  243:bipush          91
	//*  88  245:icmpne          269
					fastjsonresponse.addConcreteTypeArrayInternal(field, field.getOutputFieldName(), zza(bufferedreader, field));
	//   89  248:aload_2         
	//   90  249:aload           7
	//   91  251:aload           7
	//   92  253:invokevirtual   #289 <Method String FastJsonResponse$Field.getOutputFieldName()>
	//   93  256:aload_0         
	//   94  257:aload_1         
	//   95  258:aload           7
	//   96  260:invokespecial   #295 <Method ArrayList zza(BufferedReader, FastJsonResponse$Field)>
	//   97  263:invokevirtual   #293 <Method void FastJsonResponse.addConcreteTypeArrayInternal(FastJsonResponse$Field, String, ArrayList)>
				else
	//*  98  266:goto            1094
					throw new ParseException("Expected array start");
	//   99  269:new             #7   <Class FastParser$ParseException>
	//  100  272:dup             
	//  101  273:ldc2            #297 <String "Expected array start">
	//  102  276:invokespecial   #173 <Method void FastParser$ParseException(String)>
	//  103  279:athrow          
			}
		} else
		{
			char c3 = zzj(bufferedreader);
	//  104  280:aload_0         
	//  105  281:aload_1         
	//  106  282:invokespecial   #142 <Method char zzj(BufferedReader)>
	//  107  285:istore          4
			if(c3 == 'n')
	//* 108  287:iload           4
	//* 109  289:bipush          110
	//* 110  291:icmpne          317
			{
				zzb(bufferedreader, zzwv);
	//  111  294:aload_0         
	//  112  295:aload_1         
	//  113  296:getstatic       #50  <Field char[] zzwv>
	//  114  299:invokespecial   #146 <Method void zzb(BufferedReader, char[])>
				fastjsonresponse.addConcreteTypeInternal(field, field.getOutputFieldName(), ((FastJsonResponse) (null)));
	//  115  302:aload_2         
	//  116  303:aload           7
	//  117  305:aload           7
	//  118  307:invokevirtual   #289 <Method String FastJsonResponse$Field.getOutputFieldName()>
	//  119  310:aconst_null     
	//  120  311:invokevirtual   #301 <Method void FastJsonResponse.addConcreteTypeInternal(FastJsonResponse$Field, String, FastJsonResponse)>
			} else
	//* 121  314:goto            1094
			{
				zzxb.push(((Object) (Integer.valueOf(1))));
	//  122  317:aload_0         
	//  123  318:getfield        #129 <Field Stack zzxb>
	//  124  321:iconst_1        
	//  125  322:invokestatic    #189 <Method Integer Integer.valueOf(int)>
	//  126  325:invokevirtual   #193 <Method Object Stack.push(Object)>
	//  127  328:pop             
				if(c3 == '{')
	//* 128  329:iload           4
	//* 129  331:bipush          123
	//* 130  333:icmpne          391
					try
					{
						obj = ((Object) (field.newConcreteTypeInstance()));
	//  131  336:aload           7
	//  132  338:invokevirtual   #230 <Method FastJsonResponse FastJsonResponse$Field.newConcreteTypeInstance()>
	//  133  341:astore          5
						zza(bufferedreader, ((FastJsonResponse) (obj)));
	//  134  343:aload_0         
	//  135  344:aload_1         
	//  136  345:aload           5
	//  137  347:invokespecial   #233 <Method boolean zza(BufferedReader, FastJsonResponse)>
	//  138  350:pop             
						fastjsonresponse.addConcreteTypeInternal(field, field.getOutputFieldName(), ((FastJsonResponse) (obj)));
	//  139  351:aload_2         
	//  140  352:aload           7
	//  141  354:aload           7
	//  142  356:invokevirtual   #289 <Method String FastJsonResponse$Field.getOutputFieldName()>
	//  143  359:aload           5
	//  144  361:invokevirtual   #301 <Method void FastJsonResponse.addConcreteTypeInternal(FastJsonResponse$Field, String, FastJsonResponse)>
					}
	//* 145  364:goto            1094
	//* 146  367:astore_1        
	//* 147  368:new             #7   <Class FastParser$ParseException>
	//* 148  371:dup             
	//* 149  372:ldc1            #241 <String "Error instantiating inner object">
	//* 150  374:aload_1         
	//* 151  375:invokespecial   #244 <Method void FastParser$ParseException(String, Throwable)>
	//* 152  378:athrow          
					// Misplaced declaration of an exception variable
					catch(BufferedReader bufferedreader)
	//* 153  379:astore_1        
					{
						throw new ParseException("Error instantiating inner object", ((Throwable) (bufferedreader)));
	//  154  380:new             #7   <Class FastParser$ParseException>
	//  155  383:dup             
	//  156  384:ldc1            #241 <String "Error instantiating inner object">
	//  157  386:aload_1         
	//  158  387:invokespecial   #244 <Method void FastParser$ParseException(String, Throwable)>
	//  159  390:athrow          
					}
					// Misplaced declaration of an exception variable
					catch(BufferedReader bufferedreader)
					{
						throw new ParseException("Error instantiating inner object", ((Throwable) (bufferedreader)));
					}
				else
					throw new ParseException("Expected start of object");
	//  160  391:new             #7   <Class FastParser$ParseException>
	//  161  394:dup             
	//  162  395:ldc2            #303 <String "Expected start of object">
	//  163  398:invokespecial   #173 <Method void FastParser$ParseException(String)>
	//  164  401:athrow          
			}
		}
		break MISSING_BLOCK_LABEL_1094;
_L12:
		char c4 = zzj(bufferedreader);
	//  165  402:aload_0         
	//  166  403:aload_1         
	//  167  404:invokespecial   #142 <Method char zzj(BufferedReader)>
	//  168  407:istore          4
		if(c4 != 'n') goto _L15; else goto _L14
	//  169  409:iload           4
	//  170  411:bipush          110
	//  171  413:icmpne          430
_L14:
		zzb(bufferedreader, zzwv);
	//  172  416:aload_0         
	//  173  417:aload_1         
	//  174  418:getstatic       #50  <Field char[] zzwv>
	//  175  421:invokespecial   #146 <Method void zzb(BufferedReader, char[])>
		obj = null;
	//  176  424:aconst_null     
	//  177  425:astore          5
		  goto _L16
	//* 178  427:goto            660
_L15:
		if(c4 != '{') goto _L18; else goto _L17
	//  179  430:iload           4
	//  180  432:bipush          123
	//  181  434:icmpne          717
_L17:
		zzxb.push(((Object) (Integer.valueOf(1))));
	//  182  437:aload_0         
	//  183  438:getfield        #129 <Field Stack zzxb>
	//  184  441:iconst_1        
	//  185  442:invokestatic    #189 <Method Integer Integer.valueOf(int)>
	//  186  445:invokevirtual   #193 <Method Object Stack.push(Object)>
	//  187  448:pop             
		obj = ((Object) (new HashMap()));
	//  188  449:new             #305 <Class HashMap>
	//  189  452:dup             
	//  190  453:invokespecial   #306 <Method void HashMap()>
	//  191  456:astore          5
_L23:
		c4 = zzj(bufferedreader);
	//  192  458:aload_0         
	//  193  459:aload_1         
	//  194  460:invokespecial   #142 <Method char zzj(BufferedReader)>
	//  195  463:istore          4
		if(c4 == 0) goto _L20; else goto _L19
	//  196  465:iload           4
	//  197  467:ifeq            707
_L19:
		if(c4 == '"') goto _L22; else goto _L21
	//  198  470:iload           4
	//  199  472:bipush          34
	//  200  474:icmpeq          495
_L21:
		if(c4 == '}') goto _L24; else goto _L23
	//  201  477:iload           4
	//  202  479:bipush          125
	//  203  481:icmpeq          487
	//* 204  484:goto            458
_L24:
		zzk(1);
	//  205  487:aload_0         
	//  206  488:iconst_1        
	//  207  489:invokespecial   #196 <Method void zzk(int)>
		  goto _L16
	//* 208  492:goto            660
_L22:
		char c;
		String s = zzb(bufferedreader, zzwr, zzwt, ((char []) (null)));
	//  209  495:aload_1         
	//  210  496:aload_0         
	//  211  497:getfield        #113 <Field char[] zzwr>
	//  212  500:aload_0         
	//  213  501:getfield        #122 <Field StringBuilder zzwt>
	//  214  504:aconst_null     
	//  215  505:invokestatic    #212 <Method String zzb(BufferedReader, char[], StringBuilder, char[])>
	//  216  508:astore          8
		if(zzj(bufferedreader) != ':')
	//* 217  510:aload_0         
	//* 218  511:aload_1         
	//* 219  512:invokespecial   #142 <Method char zzj(BufferedReader)>
	//* 220  515:bipush          58
	//* 221  517:icmpeq          564
		{
			bufferedreader = ((BufferedReader) (String.valueOf(((Object) (s)))));
	//  222  520:aload           8
	//  223  522:invokestatic    #311 <Method String String.valueOf(Object)>
	//  224  525:astore_1        
			if(((String) (bufferedreader)).length() != 0)
	//* 225  526:aload_1         
	//* 226  527:invokevirtual   #314 <Method int String.length()>
	//* 227  530:ifeq            544
				bufferedreader = ((BufferedReader) ("No map value found for key ".concat(((String) (bufferedreader)))));
	//  228  533:ldc2            #316 <String "No map value found for key ">
	//  229  536:aload_1         
	//  230  537:invokevirtual   #320 <Method String String.concat(String)>
	//  231  540:astore_1        
			else
	//* 232  541:goto            555
				bufferedreader = ((BufferedReader) (new String("No map value found for key ")));
	//  233  544:new             #308 <Class String>
	//  234  547:dup             
	//  235  548:ldc2            #316 <String "No map value found for key ">
	//  236  551:invokespecial   #321 <Method void String(String)>
	//  237  554:astore_1        
			throw new ParseException(((String) (bufferedreader)));
	//  238  555:new             #7   <Class FastParser$ParseException>
	//  239  558:dup             
	//  240  559:aload_1         
	//  241  560:invokespecial   #173 <Method void FastParser$ParseException(String)>
	//  242  563:athrow          
		}
		if(zzj(bufferedreader) != '"')
	//* 243  564:aload_0         
	//* 244  565:aload_1         
	//* 245  566:invokespecial   #142 <Method char zzj(BufferedReader)>
	//* 246  569:bipush          34
	//* 247  571:icmpeq          618
		{
			bufferedreader = ((BufferedReader) (String.valueOf(((Object) (s)))));
	//  248  574:aload           8
	//  249  576:invokestatic    #311 <Method String String.valueOf(Object)>
	//  250  579:astore_1        
			if(((String) (bufferedreader)).length() != 0)
	//* 251  580:aload_1         
	//* 252  581:invokevirtual   #314 <Method int String.length()>
	//* 253  584:ifeq            598
				bufferedreader = ((BufferedReader) ("Expected String value for key ".concat(((String) (bufferedreader)))));
	//  254  587:ldc2            #323 <String "Expected String value for key ">
	//  255  590:aload_1         
	//  256  591:invokevirtual   #320 <Method String String.concat(String)>
	//  257  594:astore_1        
			else
	//* 258  595:goto            609
				bufferedreader = ((BufferedReader) (new String("Expected String value for key ")));
	//  259  598:new             #308 <Class String>
	//  260  601:dup             
	//  261  602:ldc2            #323 <String "Expected String value for key ">
	//  262  605:invokespecial   #321 <Method void String(String)>
	//  263  608:astore_1        
			throw new ParseException(((String) (bufferedreader)));
	//  264  609:new             #7   <Class FastParser$ParseException>
	//  265  612:dup             
	//  266  613:aload_1         
	//  267  614:invokespecial   #173 <Method void FastParser$ParseException(String)>
	//  268  617:athrow          
		}
		((HashMap) (obj)).put(((Object) (s)), ((Object) (zzb(bufferedreader, zzwr, zzwt, ((char []) (null))))));
	//  269  618:aload           5
	//  270  620:aload           8
	//  271  622:aload_1         
	//  272  623:aload_0         
	//  273  624:getfield        #113 <Field char[] zzwr>
	//  274  627:aload_0         
	//  275  628:getfield        #122 <Field StringBuilder zzwt>
	//  276  631:aconst_null     
	//  277  632:invokestatic    #212 <Method String zzb(BufferedReader, char[], StringBuilder, char[])>
	//  278  635:invokevirtual   #327 <Method Object HashMap.put(Object, Object)>
	//  279  638:pop             
		c = zzj(bufferedreader);
	//  280  639:aload_0         
	//  281  640:aload_1         
	//  282  641:invokespecial   #142 <Method char zzj(BufferedReader)>
	//  283  644:istore_3        
		if(c == ',') goto _L23; else goto _L25
	//  284  645:iload_3         
	//  285  646:bipush          44
	//  286  648:icmpeq          458
_L25:
		if(c != '}') goto _L26; else goto _L24
	//  287  651:iload_3         
	//  288  652:bipush          125
	//  289  654:icmpne          671
	//* 290  657:goto            487
_L16:
		fastjsonresponse.setStringMap(field, ((Map) (obj)));
	//  291  660:aload_2         
	//  292  661:aload           7
	//  293  663:aload           5
	//  294  665:invokevirtual   #331 <Method void FastJsonResponse.setStringMap(FastJsonResponse$Field, Map)>
		break MISSING_BLOCK_LABEL_1094;
	//  295  668:goto            1094
_L26:
		bufferedreader = ((BufferedReader) (new StringBuilder(48)));
	//  296  671:new             #117 <Class StringBuilder>
	//  297  674:dup             
	//  298  675:bipush          48
	//  299  677:invokespecial   #120 <Method void StringBuilder(int)>
	//  300  680:astore_1        
		((StringBuilder) (bufferedreader)).append("Unexpected character while parsing string map: ");
	//  301  681:aload_1         
	//  302  682:ldc2            #333 <String "Unexpected character while parsing string map: ">
	//  303  685:invokevirtual   #202 <Method StringBuilder StringBuilder.append(String)>
	//  304  688:pop             
		((StringBuilder) (bufferedreader)).append(c);
	//  305  689:aload_1         
	//  306  690:iload_3         
	//  307  691:invokevirtual   #205 <Method StringBuilder StringBuilder.append(char)>
	//  308  694:pop             
		throw new ParseException(((StringBuilder) (bufferedreader)).toString());
	//  309  695:new             #7   <Class FastParser$ParseException>
	//  310  698:dup             
	//  311  699:aload_1         
	//  312  700:invokevirtual   #209 <Method String StringBuilder.toString()>
	//  313  703:invokespecial   #173 <Method void FastParser$ParseException(String)>
	//  314  706:athrow          
_L20:
		throw new ParseException("Unexpected EOF");
	//  315  707:new             #7   <Class FastParser$ParseException>
	//  316  710:dup             
	//  317  711:ldc1            #180 <String "Unexpected EOF">
	//  318  713:invokespecial   #173 <Method void FastParser$ParseException(String)>
	//  319  716:athrow          
_L18:
		throw new ParseException("Expected start of a map object");
	//  320  717:new             #7   <Class FastParser$ParseException>
	//  321  720:dup             
	//  322  721:ldc2            #335 <String "Expected start of a map object">
	//  323  724:invokespecial   #173 <Method void FastParser$ParseException(String)>
	//  324  727:athrow          
_L11:
		obj = ((Object) (Base64Utils.decodeUrlSafe(zza(bufferedreader, zzws, zzwu, zzxa))));
	//  325  728:aload_0         
	//  326  729:aload_1         
	//  327  730:aload_0         
	//  328  731:getfield        #115 <Field char[] zzws>
	//  329  734:aload_0         
	//  330  735:getfield        #124 <Field StringBuilder zzwu>
	//  331  738:getstatic       #65  <Field char[] zzxa>
	//  332  741:invokespecial   #337 <Method String zza(BufferedReader, char[], StringBuilder, char[])>
	//  333  744:invokestatic    #343 <Method byte[] Base64Utils.decodeUrlSafe(String)>
	//  334  747:astore          5
		break; /* Loop/switch isn't completed */
	//  335  749:goto            773
_L10:
		obj = ((Object) (Base64Utils.decode(zza(bufferedreader, zzws, zzwu, zzxa))));
	//  336  752:aload_0         
	//  337  753:aload_1         
	//  338  754:aload_0         
	//  339  755:getfield        #115 <Field char[] zzws>
	//  340  758:aload_0         
	//  341  759:getfield        #124 <Field StringBuilder zzwu>
	//  342  762:getstatic       #65  <Field char[] zzxa>
	//  343  765:invokespecial   #337 <Method String zza(BufferedReader, char[], StringBuilder, char[])>
	//  344  768:invokestatic    #346 <Method byte[] Base64Utils.decode(String)>
	//  345  771:astore          5
		fastjsonresponse.setDecodedBytes(field, ((byte []) (obj)));
	//  346  773:aload_2         
	//  347  774:aload           7
	//  348  776:aload           5
	//  349  778:invokevirtual   #350 <Method void FastJsonResponse.setDecodedBytes(FastJsonResponse$Field, byte[])>
		break MISSING_BLOCK_LABEL_1094;
	//  350  781:goto            1094
		if(field.isTypeInArray())
	//* 351  784:aload           7
	//* 352  786:invokevirtual   #286 <Method boolean FastJsonResponse$Field.isTypeInArray()>
	//* 353  789:ifeq            809
			fastjsonresponse.setStrings(field, zza(bufferedreader, zzxh));
	//  354  792:aload_2         
	//  355  793:aload           7
	//  356  795:aload_0         
	//  357  796:aload_1         
	//  358  797:getstatic       #97  <Field FastParser$zza zzxh>
	//  359  800:invokespecial   #352 <Method ArrayList zza(BufferedReader, FastParser$zza)>
	//  360  803:invokevirtual   #356 <Method void FastJsonResponse.setStrings(FastJsonResponse$Field, ArrayList)>
		else
	//* 361  806:goto            1094
			fastjsonresponse.setString(field, zzc(bufferedreader));
	//  362  809:aload_2         
	//  363  810:aload           7
	//  364  812:aload_0         
	//  365  813:aload_1         
	//  366  814:invokespecial   #359 <Method String zzc(BufferedReader)>
	//  367  817:invokevirtual   #363 <Method void FastJsonResponse.setString(FastJsonResponse$Field, String)>
		break MISSING_BLOCK_LABEL_1094;
	//  368  820:goto            1094
		if(field.isTypeInArray())
	//* 369  823:aload           7
	//* 370  825:invokevirtual   #286 <Method boolean FastJsonResponse$Field.isTypeInArray()>
	//* 371  828:ifeq            848
			fastjsonresponse.setBooleans(field, zza(bufferedreader, zzxg));
	//  372  831:aload_2         
	//  373  832:aload           7
	//  374  834:aload_0         
	//  375  835:aload_1         
	//  376  836:getstatic       #92  <Field FastParser$zza zzxg>
	//  377  839:invokespecial   #352 <Method ArrayList zza(BufferedReader, FastParser$zza)>
	//  378  842:invokevirtual   #366 <Method void FastJsonResponse.setBooleans(FastJsonResponse$Field, ArrayList)>
		else
	//* 379  845:goto            1094
			fastjsonresponse.setBoolean(field, zza(bufferedreader, false));
	//  380  848:aload_2         
	//  381  849:aload           7
	//  382  851:aload_0         
	//  383  852:aload_1         
	//  384  853:iconst_0        
	//  385  854:invokespecial   #258 <Method boolean zza(BufferedReader, boolean)>
	//  386  857:invokevirtual   #370 <Method void FastJsonResponse.setBoolean(FastJsonResponse$Field, boolean)>
		break MISSING_BLOCK_LABEL_1094;
	//  387  860:goto            1094
		if(field.isTypeInArray())
	//* 388  863:aload           7
	//* 389  865:invokevirtual   #286 <Method boolean FastJsonResponse$Field.isTypeInArray()>
	//* 390  868:ifeq            888
			fastjsonresponse.setBigDecimals(field, zza(bufferedreader, zzxj));
	//  391  871:aload_2         
	//  392  872:aload           7
	//  393  874:aload_0         
	//  394  875:aload_1         
	//  395  876:getstatic       #107 <Field FastParser$zza zzxj>
	//  396  879:invokespecial   #352 <Method ArrayList zza(BufferedReader, FastParser$zza)>
	//  397  882:invokevirtual   #373 <Method void FastJsonResponse.setBigDecimals(FastJsonResponse$Field, ArrayList)>
		else
	//* 398  885:goto            1094
			fastjsonresponse.setBigDecimal(field, zzi(bufferedreader));
	//  399  888:aload_2         
	//  400  889:aload           7
	//  401  891:aload_0         
	//  402  892:aload_1         
	//  403  893:invokespecial   #377 <Method BigDecimal zzi(BufferedReader)>
	//  404  896:invokevirtual   #381 <Method void FastJsonResponse.setBigDecimal(FastJsonResponse$Field, BigDecimal)>
		break MISSING_BLOCK_LABEL_1094;
	//  405  899:goto            1094
		if(field.isTypeInArray())
	//* 406  902:aload           7
	//* 407  904:invokevirtual   #286 <Method boolean FastJsonResponse$Field.isTypeInArray()>
	//* 408  907:ifeq            927
			fastjsonresponse.setDoubles(field, zza(bufferedreader, zzxf));
	//  409  910:aload_2         
	//  410  911:aload           7
	//  411  913:aload_0         
	//  412  914:aload_1         
	//  413  915:getstatic       #87  <Field FastParser$zza zzxf>
	//  414  918:invokespecial   #352 <Method ArrayList zza(BufferedReader, FastParser$zza)>
	//  415  921:invokevirtual   #384 <Method void FastJsonResponse.setDoubles(FastJsonResponse$Field, ArrayList)>
		else
	//* 416  924:goto            1094
			fastjsonresponse.setDouble(field, zzh(bufferedreader));
	//  417  927:aload_2         
	//  418  928:aload           7
	//  419  930:aload_0         
	//  420  931:aload_1         
	//  421  932:invokespecial   #387 <Method double zzh(BufferedReader)>
	//  422  935:invokevirtual   #391 <Method void FastJsonResponse.setDouble(FastJsonResponse$Field, double)>
		break MISSING_BLOCK_LABEL_1094;
	//  423  938:goto            1094
		if(field.isTypeInArray())
	//* 424  941:aload           7
	//* 425  943:invokevirtual   #286 <Method boolean FastJsonResponse$Field.isTypeInArray()>
	//* 426  946:ifeq            966
			fastjsonresponse.setFloats(field, zza(bufferedreader, zzxe));
	//  427  949:aload_2         
	//  428  950:aload           7
	//  429  952:aload_0         
	//  430  953:aload_1         
	//  431  954:getstatic       #82  <Field FastParser$zza zzxe>
	//  432  957:invokespecial   #352 <Method ArrayList zza(BufferedReader, FastParser$zza)>
	//  433  960:invokevirtual   #394 <Method void FastJsonResponse.setFloats(FastJsonResponse$Field, ArrayList)>
		else
	//* 434  963:goto            1094
			fastjsonresponse.setFloat(field, zzg(bufferedreader));
	//  435  966:aload_2         
	//  436  967:aload           7
	//  437  969:aload_0         
	//  438  970:aload_1         
	//  439  971:invokespecial   #398 <Method float zzg(BufferedReader)>
	//  440  974:invokevirtual   #402 <Method void FastJsonResponse.setFloat(FastJsonResponse$Field, float)>
		break MISSING_BLOCK_LABEL_1094;
	//  441  977:goto            1094
		if(field.isTypeInArray())
	//* 442  980:aload           7
	//* 443  982:invokevirtual   #286 <Method boolean FastJsonResponse$Field.isTypeInArray()>
	//* 444  985:ifeq            1005
			fastjsonresponse.setLongs(field, zza(bufferedreader, zzxd));
	//  445  988:aload_2         
	//  446  989:aload           7
	//  447  991:aload_0         
	//  448  992:aload_1         
	//  449  993:getstatic       #77  <Field FastParser$zza zzxd>
	//  450  996:invokespecial   #352 <Method ArrayList zza(BufferedReader, FastParser$zza)>
	//  451  999:invokevirtual   #405 <Method void FastJsonResponse.setLongs(FastJsonResponse$Field, ArrayList)>
		else
	//* 452 1002:goto            1094
			fastjsonresponse.setLong(field, zze(bufferedreader));
	//  453 1005:aload_2         
	//  454 1006:aload           7
	//  455 1008:aload_0         
	//  456 1009:aload_1         
	//  457 1010:invokespecial   #409 <Method long zze(BufferedReader)>
	//  458 1013:invokevirtual   #413 <Method void FastJsonResponse.setLong(FastJsonResponse$Field, long)>
		break MISSING_BLOCK_LABEL_1094;
	//  459 1016:goto            1094
		if(field.isTypeInArray())
	//* 460 1019:aload           7
	//* 461 1021:invokevirtual   #286 <Method boolean FastJsonResponse$Field.isTypeInArray()>
	//* 462 1024:ifeq            1044
			fastjsonresponse.setBigIntegers(field, zza(bufferedreader, zzxi));
	//  463 1027:aload_2         
	//  464 1028:aload           7
	//  465 1030:aload_0         
	//  466 1031:aload_1         
	//  467 1032:getstatic       #102 <Field FastParser$zza zzxi>
	//  468 1035:invokespecial   #352 <Method ArrayList zza(BufferedReader, FastParser$zza)>
	//  469 1038:invokevirtual   #416 <Method void FastJsonResponse.setBigIntegers(FastJsonResponse$Field, ArrayList)>
		else
	//* 470 1041:goto            1094
			fastjsonresponse.setBigInteger(field, zzf(bufferedreader));
	//  471 1044:aload_2         
	//  472 1045:aload           7
	//  473 1047:aload_0         
	//  474 1048:aload_1         
	//  475 1049:invokespecial   #420 <Method BigInteger zzf(BufferedReader)>
	//  476 1052:invokevirtual   #424 <Method void FastJsonResponse.setBigInteger(FastJsonResponse$Field, BigInteger)>
		break MISSING_BLOCK_LABEL_1094;
	//  477 1055:goto            1094
		if(field.isTypeInArray())
	//* 478 1058:aload           7
	//* 479 1060:invokevirtual   #286 <Method boolean FastJsonResponse$Field.isTypeInArray()>
	//* 480 1063:ifeq            1083
			fastjsonresponse.setIntegers(field, zza(bufferedreader, zzxc));
	//  481 1066:aload_2         
	//  482 1067:aload           7
	//  483 1069:aload_0         
	//  484 1070:aload_1         
	//  485 1071:getstatic       #72  <Field FastParser$zza zzxc>
	//  486 1074:invokespecial   #352 <Method ArrayList zza(BufferedReader, FastParser$zza)>
	//  487 1077:invokevirtual   #427 <Method void FastJsonResponse.setIntegers(FastJsonResponse$Field, ArrayList)>
		else
	//* 488 1080:goto            1094
			fastjsonresponse.setInteger(field, zzd(bufferedreader));
	//  489 1083:aload_2         
	//  490 1084:aload           7
	//  491 1086:aload_0         
	//  492 1087:aload_1         
	//  493 1088:invokespecial   #136 <Method int zzd(BufferedReader)>
	//  494 1091:invokevirtual   #431 <Method void FastJsonResponse.setInteger(FastJsonResponse$Field, int)>
		zzk(4);
	//  495 1094:aload_0         
	//  496 1095:iconst_4        
	//  497 1096:invokespecial   #196 <Method void zzk(int)>
		zzk(2);
	//  498 1099:aload_0         
	//  499 1100:iconst_2        
	//  500 1101:invokespecial   #196 <Method void zzk(int)>
		char c1 = zzj(bufferedreader);
	//  501 1104:aload_0         
	//  502 1105:aload_1         
	//  503 1106:invokespecial   #142 <Method char zzj(BufferedReader)>
	//  504 1109:istore_3        
		if(c1 != ',')
	//* 505 1110:iload_3         
	//* 506 1111:bipush          44
	//* 507 1113:icmpeq          1164
		{
			if(c1 == '}')
	//* 508 1116:iload_3         
	//* 509 1117:bipush          125
	//* 510 1119:icmpne          1128
			{
				obj = null;
	//  511 1122:aconst_null     
	//  512 1123:astore          5
			} else
	//* 513 1125:goto            25
			{
				bufferedreader = ((BufferedReader) (new StringBuilder(55)));
	//  514 1128:new             #117 <Class StringBuilder>
	//  515 1131:dup             
	//  516 1132:bipush          55
	//  517 1134:invokespecial   #120 <Method void StringBuilder(int)>
	//  518 1137:astore_1        
				((StringBuilder) (bufferedreader)).append("Expected end of object or field separator, but found: ");
	//  519 1138:aload_1         
	//  520 1139:ldc2            #433 <String "Expected end of object or field separator, but found: ">
	//  521 1142:invokevirtual   #202 <Method StringBuilder StringBuilder.append(String)>
	//  522 1145:pop             
				((StringBuilder) (bufferedreader)).append(c1);
	//  523 1146:aload_1         
	//  524 1147:iload_3         
	//  525 1148:invokevirtual   #205 <Method StringBuilder StringBuilder.append(char)>
	//  526 1151:pop             
				throw new ParseException(((StringBuilder) (bufferedreader)).toString());
	//  527 1152:new             #7   <Class FastParser$ParseException>
	//  528 1155:dup             
	//  529 1156:aload_1         
	//  530 1157:invokevirtual   #209 <Method String StringBuilder.toString()>
	//  531 1160:invokespecial   #173 <Method void FastParser$ParseException(String)>
	//  532 1163:athrow          
			}
		} else
		{
			obj = ((Object) (zza(bufferedreader)));
	//  533 1164:aload_0         
	//  534 1165:aload_1         
	//  535 1166:invokespecial   #266 <Method String zza(BufferedReader)>
	//  536 1169:astore          5
		}
		if(true) goto _L28; else goto _L27
	//  537 1171:goto            25
_L27:
		bufferedreader = ((BufferedReader) (fastjsonresponse.getPostProcessor()));
	//  538 1174:aload_2         
	//  539 1175:invokevirtual   #437 <Method PostProcessor FastJsonResponse.getPostProcessor()>
	//  540 1178:astore_1        
		if(bufferedreader != null)
	//* 541 1179:aload_1         
	//* 542 1180:ifnull          1191
			((PostProcessor) (bufferedreader)).postProcess(fastjsonresponse);
	//  543 1183:aload_1         
	//  544 1184:aload_2         
	//  545 1185:invokeinterface #443 <Method FastJsonResponse PostProcessor.postProcess(FastJsonResponse)>
	//  546 1190:pop             
		zzk(1);
	//  547 1191:aload_0         
	//  548 1192:iconst_1        
	//  549 1193:invokespecial   #196 <Method void zzk(int)>
		return true;
	//  550 1196:iconst_1        
	//  551 1197:ireturn         
	}

	private final boolean zza(BufferedReader bufferedreader, boolean flag)
		throws ParseException, IOException
	{
		do
		{
			char c = zzj(bufferedreader);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #142 <Method char zzj(BufferedReader)>
	//    3    5:istore_3        
			if(c != '"')
	//*   4    6:iload_3         
	//*   5    7:bipush          34
	//*   6    9:icmpeq          127
			{
				if(c != 'f')
	//*   7   12:iload_3         
	//*   8   13:bipush          102
	//*   9   15:icmpeq          101
					if(c != 'n')
	//*  10   18:iload_3         
	//*  11   19:bipush          110
	//*  12   21:icmpeq          91
					{
						if(c == 't')
	//*  13   24:iload_3         
	//*  14   25:bipush          116
	//*  15   27:icmpne          56
						{
							char ac[];
							if(flag)
	//*  16   30:iload_2         
	//*  17   31:ifeq            42
								ac = zzwx;
	//   18   34:getstatic       #57  <Field char[] zzwx>
	//   19   37:astore          4
							else
	//*  20   39:goto            47
								ac = zzww;
	//   21   42:getstatic       #54  <Field char[] zzww>
	//   22   45:astore          4
							zzb(bufferedreader, ac);
	//   23   47:aload_0         
	//   24   48:aload_1         
	//   25   49:aload           4
	//   26   51:invokespecial   #146 <Method void zzb(BufferedReader, char[])>
							return true;
	//   27   54:iconst_1        
	//   28   55:ireturn         
						} else
						{
							bufferedreader = ((BufferedReader) (new StringBuilder(19)));
	//   29   56:new             #117 <Class StringBuilder>
	//   30   59:dup             
	//   31   60:bipush          19
	//   32   62:invokespecial   #120 <Method void StringBuilder(int)>
	//   33   65:astore_1        
							((StringBuilder) (bufferedreader)).append("Unexpected token: ");
	//   34   66:aload_1         
	//   35   67:ldc1            #198 <String "Unexpected token: ">
	//   36   69:invokevirtual   #202 <Method StringBuilder StringBuilder.append(String)>
	//   37   72:pop             
							((StringBuilder) (bufferedreader)).append(c);
	//   38   73:aload_1         
	//   39   74:iload_3         
	//   40   75:invokevirtual   #205 <Method StringBuilder StringBuilder.append(char)>
	//   41   78:pop             
							throw new ParseException(((StringBuilder) (bufferedreader)).toString());
	//   42   79:new             #7   <Class FastParser$ParseException>
	//   43   82:dup             
	//   44   83:aload_1         
	//   45   84:invokevirtual   #209 <Method String StringBuilder.toString()>
	//   46   87:invokespecial   #173 <Method void FastParser$ParseException(String)>
	//   47   90:athrow          
						}
					} else
					{
						zzb(bufferedreader, zzwv);
	//   48   91:aload_0         
	//   49   92:aload_1         
	//   50   93:getstatic       #50  <Field char[] zzwv>
	//   51   96:invokespecial   #146 <Method void zzb(BufferedReader, char[])>
						return false;
	//   52   99:iconst_0        
	//   53  100:ireturn         
					}
				char ac1[];
				if(flag)
	//*  54  101:iload_2         
	//*  55  102:ifeq            113
					ac1 = zzwz;
	//   56  105:getstatic       #63  <Field char[] zzwz>
	//   57  108:astore          4
				else
	//*  58  110:goto            118
					ac1 = zzwy;
	//   59  113:getstatic       #61  <Field char[] zzwy>
	//   60  116:astore          4
				zzb(bufferedreader, ac1);
	//   61  118:aload_0         
	//   62  119:aload_1         
	//   63  120:aload           4
	//   64  122:invokespecial   #146 <Method void zzb(BufferedReader, char[])>
				return false;
	//   65  125:iconst_0        
	//   66  126:ireturn         
			}
			if(!flag)
	//*  67  127:iload_2         
	//*  68  128:ifne            136
				flag = true;
	//   69  131:iconst_1        
	//   70  132:istore_2        
			else
	//*  71  133:goto            0
				throw new ParseException("No boolean value found in string");
	//   72  136:new             #7   <Class FastParser$ParseException>
	//   73  139:dup             
	//   74  140:ldc2            #445 <String "No boolean value found in string">
	//   75  143:invokespecial   #173 <Method void FastParser$ParseException(String)>
	//   76  146:athrow          
		} while(true);
	}

	static long zzb(FastParser fastparser, BufferedReader bufferedreader)
		throws ParseException, IOException
	{
		return fastparser.zze(bufferedreader);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #409 <Method long zze(BufferedReader)>
	//    3    5:lreturn         
	}

	private final String zzb(BufferedReader bufferedreader)
		throws ParseException, IOException
	{
		char c4;
		bufferedreader.mark(1024);
	//    0    0:aload_1         
	//    1    1:sipush          1024
	//    2    4:invokevirtual   #151 <Method void BufferedReader.mark(int)>
		c4 = zzj(bufferedreader);
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:invokespecial   #142 <Method char zzj(BufferedReader)>
	//    6   12:istore_3        
		if(c4 == '"') goto _L2; else goto _L1
	//    7   13:iload_3         
	//    8   14:bipush          34
	//    9   16:icmpeq          362
_L1:
		if(c4 != ',')
	//*  10   19:iload_3         
	//*  11   20:bipush          44
	//*  12   22:icmpeq          352
		{
			int i = 1;
	//   13   25:iconst_1        
	//   14   26:istore          4
			if(c4 != '[')
	//*  15   28:iload_3         
	//*  16   29:bipush          91
	//*  17   31:icmpeq          158
			{
				if(c4 != '{')
	//*  18   34:iload_3         
	//*  19   35:bipush          123
	//*  20   37:icmpeq          57
				{
					bufferedreader.reset();
	//   21   40:aload_1         
	//   22   41:invokevirtual   #164 <Method void BufferedReader.reset()>
					zza(bufferedreader, zzws);
	//   23   44:aload_0         
	//   24   45:aload_1         
	//   25   46:aload_0         
	//   26   47:getfield        #115 <Field char[] zzws>
	//   27   50:invokespecial   #448 <Method int zza(BufferedReader, char[])>
	//   28   53:pop             
				} else
	//*  29   54:goto            398
				{
					zzxb.push(((Object) (Integer.valueOf(1))));
	//   30   57:aload_0         
	//   31   58:getfield        #129 <Field Stack zzxb>
	//   32   61:iconst_1        
	//   33   62:invokestatic    #189 <Method Integer Integer.valueOf(int)>
	//   34   65:invokevirtual   #193 <Method Object Stack.push(Object)>
	//   35   68:pop             
					bufferedreader.mark(32);
	//   36   69:aload_1         
	//   37   70:bipush          32
	//   38   72:invokevirtual   #151 <Method void BufferedReader.mark(int)>
					char c = zzj(bufferedreader);
	//   39   75:aload_0         
	//   40   76:aload_1         
	//   41   77:invokespecial   #142 <Method char zzj(BufferedReader)>
	//   42   80:istore_2        
					if(c != '}')
	//*  43   81:iload_2         
	//*  44   82:bipush          125
	//*  45   84:icmpne          95
	//*  46   87:aload_0         
	//*  47   88:iconst_1        
	//*  48   89:invokespecial   #196 <Method void zzk(int)>
	//*  49   92:goto            398
						if(c == '"')
	//*  50   95:iload_2         
	//*  51   96:bipush          34
	//*  52   98:icmpne          122
						{
							bufferedreader.reset();
	//   53  101:aload_1         
	//   54  102:invokevirtual   #164 <Method void BufferedReader.reset()>
							zza(bufferedreader);
	//   55  105:aload_0         
	//   56  106:aload_1         
	//   57  107:invokespecial   #266 <Method String zza(BufferedReader)>
	//   58  110:pop             
							while(zzb(bufferedreader) != null) ;
	//   59  111:aload_0         
	//   60  112:aload_1         
	//   61  113:invokespecial   #273 <Method String zzb(BufferedReader)>
	//   62  116:ifnonnull       111
						} else
	//*  63  119:goto            87
						{
							bufferedreader = ((BufferedReader) (new StringBuilder(18)));
	//   64  122:new             #117 <Class StringBuilder>
	//   65  125:dup             
	//   66  126:bipush          18
	//   67  128:invokespecial   #120 <Method void StringBuilder(int)>
	//   68  131:astore_1        
							((StringBuilder) (bufferedreader)).append("Unexpected token ");
	//   69  132:aload_1         
	//   70  133:ldc2            #450 <String "Unexpected token ">
	//   71  136:invokevirtual   #202 <Method StringBuilder StringBuilder.append(String)>
	//   72  139:pop             
							((StringBuilder) (bufferedreader)).append(c);
	//   73  140:aload_1         
	//   74  141:iload_2         
	//   75  142:invokevirtual   #205 <Method StringBuilder StringBuilder.append(char)>
	//   76  145:pop             
							throw new ParseException(((StringBuilder) (bufferedreader)).toString());
	//   77  146:new             #7   <Class FastParser$ParseException>
	//   78  149:dup             
	//   79  150:aload_1         
	//   80  151:invokevirtual   #209 <Method String StringBuilder.toString()>
	//   81  154:invokespecial   #173 <Method void FastParser$ParseException(String)>
	//   82  157:athrow          
						}
					zzk(1);
				}
			} else
			{
				zzxb.push(((Object) (Integer.valueOf(5))));
	//   83  158:aload_0         
	//   84  159:getfield        #129 <Field Stack zzxb>
	//   85  162:iconst_5        
	//   86  163:invokestatic    #189 <Method Integer Integer.valueOf(int)>
	//   87  166:invokevirtual   #193 <Method Object Stack.push(Object)>
	//   88  169:pop             
				bufferedreader.mark(32);
	//   89  170:aload_1         
	//   90  171:bipush          32
	//   91  173:invokevirtual   #151 <Method void BufferedReader.mark(int)>
				if(zzj(bufferedreader) != ']')
	//*  92  176:aload_0         
	//*  93  177:aload_1         
	//*  94  178:invokespecial   #142 <Method char zzj(BufferedReader)>
	//*  95  181:bipush          93
	//*  96  183:icmpne          194
	//*  97  186:aload_0         
	//*  98  187:iconst_5        
	//*  99  188:invokespecial   #196 <Method void zzk(int)>
	//* 100  191:goto            398
				{
					bufferedreader.reset();
	//  101  194:aload_1         
	//  102  195:invokevirtual   #164 <Method void BufferedReader.reset()>
					boolean flag = false;
	//  103  198:iconst_0        
	//  104  199:istore_3        
					int j = 0;
	//  105  200:iconst_0        
	//  106  201:istore          5
					while(i > 0) 
	//* 107  203:iload           4
	//* 108  205:ifle            186
					{
						char c1 = zzj(bufferedreader);
	//  109  208:aload_0         
	//  110  209:aload_1         
	//  111  210:invokespecial   #142 <Method char zzj(BufferedReader)>
	//  112  213:istore_2        
						if(c1 != 0)
	//* 113  214:iload_2         
	//* 114  215:ifeq            341
						{
							if(!Character.isISOControl(c1))
	//* 115  218:iload_2         
	//* 116  219:invokestatic    #161 <Method boolean Character.isISOControl(char)>
	//* 117  222:ifne            330
							{
								boolean flag1 = ((boolean) (j));
	//  118  225:iload           5
	//  119  227:istore          6
								if(c1 == '"')
	//* 120  229:iload_2         
	//* 121  230:bipush          34
	//* 122  232:icmpne          249
								{
									flag1 = ((boolean) (j));
	//  123  235:iload           5
	//  124  237:istore          6
									if(!flag)
	//* 125  239:iload_3         
	//* 126  240:ifne            249
										flag1 = j ^ true;
	//  127  243:iload           5
	//  128  245:iconst_1        
	//  129  246:ixor            
	//  130  247:istore          6
								}
								j = i;
	//  131  249:iload           4
	//  132  251:istore          5
								if(c1 == '[')
	//* 133  253:iload_2         
	//* 134  254:bipush          91
	//* 135  256:icmpne          274
								{
									j = i;
	//  136  259:iload           4
	//  137  261:istore          5
									if(!flag1)
	//* 138  263:iload           6
	//* 139  265:ifne            274
										j = i + 1;
	//  140  268:iload           4
	//  141  270:iconst_1        
	//  142  271:iadd            
	//  143  272:istore          5
								}
								i = j;
	//  144  274:iload           5
	//  145  276:istore          4
								if(c1 == ']')
	//* 146  278:iload_2         
	//* 147  279:bipush          93
	//* 148  281:icmpne          299
								{
									i = j;
	//  149  284:iload           5
	//  150  286:istore          4
									if(!flag1)
	//* 151  288:iload           6
	//* 152  290:ifne            299
										i = j - 1;
	//  153  293:iload           5
	//  154  295:iconst_1        
	//  155  296:isub            
	//  156  297:istore          4
								}
								if(c1 == '\\' && flag1)
	//* 157  299:iload_2         
	//* 158  300:bipush          92
	//* 159  302:icmpne          321
	//* 160  305:iload           6
	//* 161  307:ifeq            321
								{
									flag ^= true;
	//  162  310:iload_3         
	//  163  311:iconst_1        
	//  164  312:ixor            
	//  165  313:istore_3        
									j = ((int) (flag1));
	//  166  314:iload           6
	//  167  316:istore          5
								} else
	//* 168  318:goto            203
								{
									flag = false;
	//  169  321:iconst_0        
	//  170  322:istore_3        
									j = ((int) (flag1));
	//  171  323:iload           6
	//  172  325:istore          5
								}
							} else
	//* 173  327:goto            203
							{
								throw new ParseException("Unexpected control character while reading array");
	//  174  330:new             #7   <Class FastParser$ParseException>
	//  175  333:dup             
	//  176  334:ldc2            #452 <String "Unexpected control character while reading array">
	//  177  337:invokespecial   #173 <Method void FastParser$ParseException(String)>
	//  178  340:athrow          
							}
						} else
						{
							throw new ParseException("Unexpected EOF while parsing array");
	//  179  341:new             #7   <Class FastParser$ParseException>
	//  180  344:dup             
	//  181  345:ldc2            #454 <String "Unexpected EOF while parsing array">
	//  182  348:invokespecial   #173 <Method void FastParser$ParseException(String)>
	//  183  351:athrow          
						}
					}
				}
				zzk(5);
			}
		} else
		{
			throw new ParseException("Missing value");
	//  184  352:new             #7   <Class FastParser$ParseException>
	//  185  355:dup             
	//  186  356:ldc1            #182 <String "Missing value">
	//  187  358:invokespecial   #173 <Method void FastParser$ParseException(String)>
	//  188  361:athrow          
		}
		  goto _L3
_L2:
		if(bufferedreader.read(zzwq) == -1) goto _L5; else goto _L4
	//  189  362:aload_1         
	//  190  363:aload_0         
	//  191  364:getfield        #111 <Field char[] zzwq>
	//  192  367:invokevirtual   #457 <Method int BufferedReader.read(char[])>
	//  193  370:iconst_m1       
	//  194  371:icmpeq          539
_L4:
		char c5;
		c5 = zzwq[0];
	//  195  374:aload_0         
	//  196  375:getfield        #111 <Field char[] zzwq>
	//  197  378:iconst_0        
	//  198  379:caload          
	//  199  380:istore          4
		flag = false;
	//  200  382:iconst_0        
	//  201  383:istore_3        
_L7:
		if(c5 == '"' && !flag) goto _L3; else goto _L6
	//  202  384:iload           4
	//  203  386:bipush          34
	//  204  388:icmpne          470
	//  205  391:iload_3         
	//  206  392:ifeq            398
	//* 207  395:goto            470
_L3:
		char c2 = zzj(bufferedreader);
	//  208  398:aload_0         
	//  209  399:aload_1         
	//  210  400:invokespecial   #142 <Method char zzj(BufferedReader)>
	//  211  403:istore_2        
		if(c2 != ',')
	//* 212  404:iload_2         
	//* 213  405:bipush          44
	//* 214  407:icmpeq          459
		{
			if(c2 == '}')
	//* 215  410:iload_2         
	//* 216  411:bipush          125
	//* 217  413:icmpne          423
			{
				zzk(2);
	//  218  416:aload_0         
	//  219  417:iconst_2        
	//  220  418:invokespecial   #196 <Method void zzk(int)>
				return null;
	//  221  421:aconst_null     
	//  222  422:areturn         
			} else
			{
				bufferedreader = ((BufferedReader) (new StringBuilder(18)));
	//  223  423:new             #117 <Class StringBuilder>
	//  224  426:dup             
	//  225  427:bipush          18
	//  226  429:invokespecial   #120 <Method void StringBuilder(int)>
	//  227  432:astore_1        
				((StringBuilder) (bufferedreader)).append("Unexpected token ");
	//  228  433:aload_1         
	//  229  434:ldc2            #450 <String "Unexpected token ">
	//  230  437:invokevirtual   #202 <Method StringBuilder StringBuilder.append(String)>
	//  231  440:pop             
				((StringBuilder) (bufferedreader)).append(c2);
	//  232  441:aload_1         
	//  233  442:iload_2         
	//  234  443:invokevirtual   #205 <Method StringBuilder StringBuilder.append(char)>
	//  235  446:pop             
				throw new ParseException(((StringBuilder) (bufferedreader)).toString());
	//  236  447:new             #7   <Class FastParser$ParseException>
	//  237  450:dup             
	//  238  451:aload_1         
	//  239  452:invokevirtual   #209 <Method String StringBuilder.toString()>
	//  240  455:invokespecial   #173 <Method void FastParser$ParseException(String)>
	//  241  458:athrow          
			}
		} else
		{
			zzk(2);
	//  242  459:aload_0         
	//  243  460:iconst_2        
	//  244  461:invokespecial   #196 <Method void zzk(int)>
			return zza(bufferedreader);
	//  245  464:aload_0         
	//  246  465:aload_1         
	//  247  466:invokespecial   #266 <Method String zza(BufferedReader)>
	//  248  469:areturn         
		}
_L6:
		if(c5 == '\\')
	//* 249  470:iload           4
	//* 250  472:bipush          92
	//* 251  474:icmpne          484
			flag ^= true;
	//  252  477:iload_3         
	//  253  478:iconst_1        
	//  254  479:ixor            
	//  255  480:istore_3        
		else
	//* 256  481:goto            486
			flag = false;
	//  257  484:iconst_0        
	//  258  485:istore_3        
		if(bufferedreader.read(zzwq) != -1)
	//* 259  486:aload_1         
	//* 260  487:aload_0         
	//* 261  488:getfield        #111 <Field char[] zzwq>
	//* 262  491:invokevirtual   #457 <Method int BufferedReader.read(char[])>
	//* 263  494:iconst_m1       
	//* 264  495:icmpeq          528
		{
			char c3 = zzwq[0];
	//  265  498:aload_0         
	//  266  499:getfield        #111 <Field char[] zzwq>
	//  267  502:iconst_0        
	//  268  503:caload          
	//  269  504:istore_2        
			if(!Character.isISOControl(c3))
	//* 270  505:iload_2         
	//* 271  506:invokestatic    #161 <Method boolean Character.isISOControl(char)>
	//* 272  509:ifne            518
				c5 = c3;
	//  273  512:iload_2         
	//  274  513:istore          4
			else
	//* 275  515:goto            384
				throw new ParseException("Unexpected control character while reading string");
	//  276  518:new             #7   <Class FastParser$ParseException>
	//  277  521:dup             
	//  278  522:ldc1            #170 <String "Unexpected control character while reading string">
	//  279  524:invokespecial   #173 <Method void FastParser$ParseException(String)>
	//  280  527:athrow          
		} else
		{
			throw new ParseException("Unexpected EOF while parsing string");
	//  281  528:new             #7   <Class FastParser$ParseException>
	//  282  531:dup             
	//  283  532:ldc2            #459 <String "Unexpected EOF while parsing string">
	//  284  535:invokespecial   #173 <Method void FastParser$ParseException(String)>
	//  285  538:athrow          
		}
		if(true) goto _L7; else goto _L5
_L5:
		throw new ParseException("Unexpected EOF while parsing string");
	//  286  539:new             #7   <Class FastParser$ParseException>
	//  287  542:dup             
	//  288  543:ldc2            #459 <String "Unexpected EOF while parsing string">
	//  289  546:invokespecial   #173 <Method void FastParser$ParseException(String)>
	//  290  549:athrow          
	}

	private static String zzb(BufferedReader bufferedreader, char ac[], StringBuilder stringbuilder, char ac1[])
		throws ParseException, IOException
	{
		stringbuilder.setLength(0);
	//    0    0:aload_2         
	//    1    1:iconst_0        
	//    2    2:invokevirtual   #462 <Method void StringBuilder.setLength(int)>
		bufferedreader.mark(ac.length);
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:arraylength     
	//    6    8:invokevirtual   #151 <Method void BufferedReader.mark(int)>
		boolean flag = false;
	//    7   11:iconst_0        
	//    8   12:istore          5
		boolean flag1 = false;
	//    9   14:iconst_0        
	//   10   15:istore          6
		do
		{
			int k = bufferedreader.read(ac);
	//   11   17:aload_0         
	//   12   18:aload_1         
	//   13   19:invokevirtual   #457 <Method int BufferedReader.read(char[])>
	//   14   22:istore          9
			if(k == -1)
				break;
	//   15   24:iload           9
	//   16   26:iconst_m1       
	//   17   27:icmpeq          243
			int i = ((int) (flag));
	//   18   30:iload           5
	//   19   32:istore          7
			boolean flag2 = false;
	//   20   34:iconst_0        
	//   21   35:istore          8
			flag = flag1;
	//   22   37:iload           6
	//   23   39:istore          5
			flag1 = ((boolean) (i));
	//   24   41:iload           7
	//   25   43:istore          6
			for(i = ((int) (flag2)); i < k; i++)
	//*  26   45:iload           8
	//*  27   47:istore          7
	//*  28   49:iload           7
	//*  29   51:iload           9
	//*  30   53:icmpge          213
			{
				char c;
label0:
				{
					int j;
label1:
					{
						c = ac[i];
	//   31   56:aload_1         
	//   32   57:iload           7
	//   33   59:caload          
	//   34   60:istore          4
						if(!Character.isISOControl(c))
							break label0;
	//   35   62:iload           4
	//   36   64:invokestatic    #161 <Method boolean Character.isISOControl(char)>
	//   37   67:ifeq            129
						if(ac1 != null)
	//*  38   70:aload_3         
	//*  39   71:ifnull          108
						{
							j = 0;
	//   40   74:iconst_0        
	//   41   75:istore          8
							do
							{
								if(j >= ac1.length)
									break;
	//   42   77:iload           8
	//   43   79:aload_3         
	//   44   80:arraylength     
	//   45   81:icmpge          108
								if(ac1[j] == c)
	//*  46   84:aload_3         
	//*  47   85:iload           8
	//*  48   87:caload          
	//*  49   88:iload           4
	//*  50   90:icmpne          99
								{
									j = 1;
	//   51   93:iconst_1        
	//   52   94:istore          8
									break label1;
	//   53   96:goto            111
								}
								j++;
	//   54   99:iload           8
	//   55  101:iconst_1        
	//   56  102:iadd            
	//   57  103:istore          8
							} while(true);
	//   58  105:goto            77
						}
						j = 0;
	//   59  108:iconst_0        
	//   60  109:istore          8
					}
					if(j == 0)
	//*  61  111:iload           8
	//*  62  113:ifeq            119
	//*  63  116:goto            129
						throw new ParseException("Unexpected control character while reading string");
	//   64  119:new             #7   <Class FastParser$ParseException>
	//   65  122:dup             
	//   66  123:ldc1            #170 <String "Unexpected control character while reading string">
	//   67  125:invokespecial   #173 <Method void FastParser$ParseException(String)>
	//   68  128:athrow          
				}
				if(c == '"' && !flag1)
	//*  69  129:iload           4
	//*  70  131:bipush          34
	//*  71  133:icmpne          182
	//*  72  136:iload           6
	//*  73  138:ifne            182
				{
					stringbuilder.append(ac, 0, i);
	//   74  141:aload_2         
	//   75  142:aload_1         
	//   76  143:iconst_0        
	//   77  144:iload           7
	//   78  146:invokevirtual   #465 <Method StringBuilder StringBuilder.append(char[], int, int)>
	//   79  149:pop             
					bufferedreader.reset();
	//   80  150:aload_0         
	//   81  151:invokevirtual   #164 <Method void BufferedReader.reset()>
					bufferedreader.skip(i + 1);
	//   82  154:aload_0         
	//   83  155:iload           7
	//   84  157:iconst_1        
	//   85  158:iadd            
	//   86  159:i2l             
	//   87  160:invokevirtual   #168 <Method long BufferedReader.skip(long)>
	//   88  163:pop2            
					if(flag)
	//*  89  164:iload           5
	//*  90  166:ifeq            177
						return JsonUtils.unescapeString(stringbuilder.toString());
	//   91  169:aload_2         
	//   92  170:invokevirtual   #209 <Method String StringBuilder.toString()>
	//   93  173:invokestatic    #470 <Method String JsonUtils.unescapeString(String)>
	//   94  176:areturn         
					else
						return stringbuilder.toString();
	//   95  177:aload_2         
	//   96  178:invokevirtual   #209 <Method String StringBuilder.toString()>
	//   97  181:areturn         
				}
				if(c == '\\')
	//*  98  182:iload           4
	//*  99  184:bipush          92
	//* 100  186:icmpne          201
				{
					flag1 ^= true;
	//  101  189:iload           6
	//  102  191:iconst_1        
	//  103  192:ixor            
	//  104  193:istore          6
					flag = true;
	//  105  195:iconst_1        
	//  106  196:istore          5
				} else
	//* 107  198:goto            204
				{
					flag1 = false;
	//  108  201:iconst_0        
	//  109  202:istore          6
				}
			}

	//  110  204:iload           7
	//  111  206:iconst_1        
	//  112  207:iadd            
	//  113  208:istore          7
	//* 114  210:goto            49
			stringbuilder.append(ac, 0, k);
	//  115  213:aload_2         
	//  116  214:aload_1         
	//  117  215:iconst_0        
	//  118  216:iload           9
	//  119  218:invokevirtual   #465 <Method StringBuilder StringBuilder.append(char[], int, int)>
	//  120  221:pop             
			bufferedreader.mark(ac.length);
	//  121  222:aload_0         
	//  122  223:aload_1         
	//  123  224:arraylength     
	//  124  225:invokevirtual   #151 <Method void BufferedReader.mark(int)>
			i = ((int) (flag));
	//  125  228:iload           5
	//  126  230:istore          7
			flag = flag1;
	//  127  232:iload           6
	//  128  234:istore          5
			flag1 = ((boolean) (i));
	//  129  236:iload           7
	//  130  238:istore          6
		} while(true);
	//  131  240:goto            17
		throw new ParseException("Unexpected EOF while parsing string");
	//  132  243:new             #7   <Class FastParser$ParseException>
	//  133  246:dup             
	//  134  247:ldc2            #459 <String "Unexpected EOF while parsing string">
	//  135  250:invokespecial   #173 <Method void FastParser$ParseException(String)>
	//  136  253:athrow          
	}

	private final void zzb(BufferedReader bufferedreader, char ac[])
		throws ParseException, IOException
	{
		for(int i = 0; i < ac.length;)
	//*   0    0:iconst_0        
	//*   1    1:istore_3        
	//*   2    2:iload_3         
	//*   3    3:aload_2         
	//*   4    4:arraylength     
	//*   5    5:icmpge          93
		{
			int k = bufferedreader.read(zzwr, 0, ac.length - i);
	//    6    8:aload_1         
	//    7    9:aload_0         
	//    8   10:getfield        #113 <Field char[] zzwr>
	//    9   13:iconst_0        
	//   10   14:aload_2         
	//   11   15:arraylength     
	//   12   16:iload_3         
	//   13   17:isub            
	//   14   18:invokevirtual   #155 <Method int BufferedReader.read(char[], int, int)>
	//   15   21:istore          5
			if(k != -1)
	//*  16   23:iload           5
	//*  17   25:iconst_m1       
	//*  18   26:icmpeq          83
			{
				for(int j = 0; j < k;)
	//*  19   29:iconst_0        
	//*  20   30:istore          4
	//*  21   32:iload           4
	//*  22   34:iload           5
	//*  23   36:icmpge          75
					if(ac[j + i] == zzwr[j])
	//*  24   39:aload_2         
	//*  25   40:iload           4
	//*  26   42:iload_3         
	//*  27   43:iadd            
	//*  28   44:caload          
	//*  29   45:aload_0         
	//*  30   46:getfield        #113 <Field char[] zzwr>
	//*  31   49:iload           4
	//*  32   51:caload          
	//*  33   52:icmpne          64
						j++;
	//   34   55:iload           4
	//   35   57:iconst_1        
	//   36   58:iadd            
	//   37   59:istore          4
					else
	//*  38   61:goto            32
						throw new ParseException("Unexpected character");
	//   39   64:new             #7   <Class FastParser$ParseException>
	//   40   67:dup             
	//   41   68:ldc2            #472 <String "Unexpected character">
	//   42   71:invokespecial   #173 <Method void FastParser$ParseException(String)>
	//   43   74:athrow          

				i += k;
	//   44   75:iload_3         
	//   45   76:iload           5
	//   46   78:iadd            
	//   47   79:istore_3        
			} else
	//*  48   80:goto            2
			{
				throw new ParseException("Unexpected EOF");
	//   49   83:new             #7   <Class FastParser$ParseException>
	//   50   86:dup             
	//   51   87:ldc1            #180 <String "Unexpected EOF">
	//   52   89:invokespecial   #173 <Method void FastParser$ParseException(String)>
	//   53   92:athrow          
			}
		}

	//   54   93:return          
	}

	static float zzc(FastParser fastparser, BufferedReader bufferedreader)
		throws ParseException, IOException
	{
		return fastparser.zzg(bufferedreader);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #398 <Method float zzg(BufferedReader)>
	//    3    5:freturn         
	}

	private final String zzc(BufferedReader bufferedreader)
		throws ParseException, IOException
	{
		return zza(bufferedreader, zzwr, zzwt, ((char []) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_0         
	//    3    3:getfield        #113 <Field char[] zzwr>
	//    4    6:aload_0         
	//    5    7:getfield        #122 <Field StringBuilder zzwt>
	//    6   10:aconst_null     
	//    7   11:invokespecial   #337 <Method String zza(BufferedReader, char[], StringBuilder, char[])>
	//    8   14:areturn         
	}

	static double zzd(FastParser fastparser, BufferedReader bufferedreader)
		throws ParseException, IOException
	{
		return fastparser.zzh(bufferedreader);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #387 <Method double zzh(BufferedReader)>
	//    3    5:dreturn         
	}

	private final int zzd(BufferedReader bufferedreader)
		throws ParseException, IOException
	{
		int j1 = zza(bufferedreader, zzws);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_0         
	//    3    3:getfield        #115 <Field char[] zzws>
	//    4    6:invokespecial   #448 <Method int zza(BufferedReader, char[])>
	//    5    9:istore          7
		if(j1 == 0)
	//*   6   11:iload           7
	//*   7   13:ifne            18
			return 0;
	//    8   16:iconst_0        
	//    9   17:ireturn         
		bufferedreader = ((BufferedReader) (zzws));
	//   10   18:aload_0         
	//   11   19:getfield        #115 <Field char[] zzws>
	//   12   22:astore_1        
		if(j1 > 0)
	//*  13   23:iload           7
	//*  14   25:ifle            220
		{
			int i;
			boolean flag;
			int k;
			if(bufferedreader[0] == '-')
	//*  15   28:aload_1         
	//*  16   29:iconst_0        
	//*  17   30:caload          
	//*  18   31:bipush          45
	//*  19   33:icmpne          49
			{
				i = 1;
	//   20   36:iconst_1        
	//   21   37:istore_2        
				flag = true;
	//   22   38:iconst_1        
	//   23   39:istore          4
				k = 0x80000000;
	//   24   41:ldc2            #475 <Int 0x80000000>
	//   25   44:istore          5
			} else
	//*  26   46:goto            59
			{
				i = 0;
	//   27   49:iconst_0        
	//   28   50:istore_2        
				flag = false;
	//   29   51:iconst_0        
	//   30   52:istore          4
				k = 0x80000001;
	//   31   54:ldc2            #476 <Int 0x80000001>
	//   32   57:istore          5
			}
			int j;
			if(i < j1)
	//*  33   59:iload_2         
	//*  34   60:iload           7
	//*  35   62:icmpge          105
			{
				j = i + 1;
	//   36   65:iload_2         
	//   37   66:iconst_1        
	//   38   67:iadd            
	//   39   68:istore_3        
				i = Character.digit(bufferedreader[i], 10);
	//   40   69:aload_1         
	//   41   70:iload_2         
	//   42   71:caload          
	//   43   72:bipush          10
	//   44   74:invokestatic    #480 <Method int Character.digit(char, int)>
	//   45   77:istore_2        
				if(i >= 0)
	//*  46   78:iload_2         
	//*  47   79:iflt            94
				{
					int l = -i;
	//   48   82:iload_2         
	//   49   83:ineg            
	//   50   84:istore          6
					i = j;
	//   51   86:iload_3         
	//   52   87:istore_2        
					j = l;
	//   53   88:iload           6
	//   54   90:istore_3        
				} else
	//*  55   91:goto            107
				{
					throw new ParseException("Unexpected non-digit character");
	//   56   94:new             #7   <Class FastParser$ParseException>
	//   57   97:dup             
	//   58   98:ldc2            #482 <String "Unexpected non-digit character">
	//   59  101:invokespecial   #173 <Method void FastParser$ParseException(String)>
	//   60  104:athrow          
				}
			} else
			{
				j = 0;
	//   61  105:iconst_0        
	//   62  106:istore_3        
			}
			while(i < j1) 
	//*  63  107:iload_2         
	//*  64  108:iload           7
	//*  65  110:icmpge          194
			{
				int i1 = Character.digit(bufferedreader[i], 10);
	//   66  113:aload_1         
	//   67  114:iload_2         
	//   68  115:caload          
	//   69  116:bipush          10
	//   70  118:invokestatic    #480 <Method int Character.digit(char, int)>
	//   71  121:istore          6
				if(i1 >= 0)
	//*  72  123:iload           6
	//*  73  125:iflt            183
				{
					if(j >= 0xf3333334)
	//*  74  128:iload_3         
	//*  75  129:ldc2            #483 <Int 0xf3333334>
	//*  76  132:icmplt          172
					{
						j *= 10;
	//   77  135:iload_3         
	//   78  136:bipush          10
	//   79  138:imul            
	//   80  139:istore_3        
						if(j >= k + i1)
	//*  81  140:iload_3         
	//*  82  141:iload           5
	//*  83  143:iload           6
	//*  84  145:iadd            
	//*  85  146:icmplt          161
						{
							j -= i1;
	//   86  149:iload_3         
	//   87  150:iload           6
	//   88  152:isub            
	//   89  153:istore_3        
							i++;
	//   90  154:iload_2         
	//   91  155:iconst_1        
	//   92  156:iadd            
	//   93  157:istore_2        
						} else
	//*  94  158:goto            107
						{
							throw new ParseException("Number too large");
	//   95  161:new             #7   <Class FastParser$ParseException>
	//   96  164:dup             
	//   97  165:ldc2            #485 <String "Number too large">
	//   98  168:invokespecial   #173 <Method void FastParser$ParseException(String)>
	//   99  171:athrow          
						}
					} else
					{
						throw new ParseException("Number too large");
	//  100  172:new             #7   <Class FastParser$ParseException>
	//  101  175:dup             
	//  102  176:ldc2            #485 <String "Number too large">
	//  103  179:invokespecial   #173 <Method void FastParser$ParseException(String)>
	//  104  182:athrow          
					}
				} else
				{
					throw new ParseException("Unexpected non-digit character");
	//  105  183:new             #7   <Class FastParser$ParseException>
	//  106  186:dup             
	//  107  187:ldc2            #482 <String "Unexpected non-digit character">
	//  108  190:invokespecial   #173 <Method void FastParser$ParseException(String)>
	//  109  193:athrow          
				}
			}
			if(flag)
	//* 110  194:iload           4
	//* 111  196:ifeq            217
			{
				if(i > 1)
	//* 112  199:iload_2         
	//* 113  200:iconst_1        
	//* 114  201:icmple          206
					return j;
	//  115  204:iload_3         
	//  116  205:ireturn         
				else
					throw new ParseException("No digits to parse");
	//  117  206:new             #7   <Class FastParser$ParseException>
	//  118  209:dup             
	//  119  210:ldc2            #487 <String "No digits to parse">
	//  120  213:invokespecial   #173 <Method void FastParser$ParseException(String)>
	//  121  216:athrow          
			} else
			{
				return -j;
	//  122  217:iload_3         
	//  123  218:ineg            
	//  124  219:ireturn         
			}
		} else
		{
			throw new ParseException("No number to parse");
	//  125  220:new             #7   <Class FastParser$ParseException>
	//  126  223:dup             
	//  127  224:ldc2            #489 <String "No number to parse">
	//  128  227:invokespecial   #173 <Method void FastParser$ParseException(String)>
	//  129  230:athrow          
		}
	}

	private final long zze(BufferedReader bufferedreader)
		throws ParseException, IOException
	{
		int l = zza(bufferedreader, zzws);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_0         
	//    3    3:getfield        #115 <Field char[] zzws>
	//    4    6:invokespecial   #448 <Method int zza(BufferedReader, char[])>
	//    5    9:istore          5
		if(l == 0)
	//*   6   11:iload           5
	//*   7   13:ifne            18
			return 0L;
	//    8   16:lconst_0        
	//    9   17:lreturn         
		bufferedreader = ((BufferedReader) (zzws));
	//   10   18:aload_0         
	//   11   19:getfield        #115 <Field char[] zzws>
	//   12   22:astore_1        
		if(l > 0)
	//*  13   23:iload           5
	//*  14   25:ifle            234
		{
			int i = 0;
	//   15   28:iconst_0        
	//   16   29:istore_2        
			boolean flag;
			long l2;
			if(bufferedreader[0] == '-')
	//*  17   30:aload_1         
	//*  18   31:iconst_0        
	//*  19   32:caload          
	//*  20   33:bipush          45
	//*  21   35:icmpne          50
			{
				l2 = 0x0L;
	//   22   38:ldc2w           #490 <Long 0x0L>
	//   23   41:lstore          8
				i = 1;
	//   24   43:iconst_1        
	//   25   44:istore_2        
				flag = true;
	//   26   45:iconst_1        
	//   27   46:istore_3        
			} else
	//*  28   47:goto            57
			{
				l2 = 0x1L;
	//   29   50:ldc2w           #492 <Long 0x1L>
	//   30   53:lstore          8
				flag = false;
	//   31   55:iconst_0        
	//   32   56:istore_3        
			}
			long l1;
			if(i < l)
	//*  33   57:iload_2         
	//*  34   58:iload           5
	//*  35   60:icmpge          103
			{
				int j = i + 1;
	//   36   63:iload_2         
	//   37   64:iconst_1        
	//   38   65:iadd            
	//   39   66:istore          4
				i = Character.digit(bufferedreader[i], 10);
	//   40   68:aload_1         
	//   41   69:iload_2         
	//   42   70:caload          
	//   43   71:bipush          10
	//   44   73:invokestatic    #480 <Method int Character.digit(char, int)>
	//   45   76:istore_2        
				if(i >= 0)
	//*  46   77:iload_2         
	//*  47   78:iflt            92
				{
					l1 = -i;
	//   48   81:iload_2         
	//   49   82:ineg            
	//   50   83:i2l             
	//   51   84:lstore          6
					i = j;
	//   52   86:iload           4
	//   53   88:istore_2        
				} else
	//*  54   89:goto            106
				{
					throw new ParseException("Unexpected non-digit character");
	//   55   92:new             #7   <Class FastParser$ParseException>
	//   56   95:dup             
	//   57   96:ldc2            #482 <String "Unexpected non-digit character">
	//   58   99:invokespecial   #173 <Method void FastParser$ParseException(String)>
	//   59  102:athrow          
				}
			} else
			{
				l1 = 0L;
	//   60  103:lconst_0        
	//   61  104:lstore          6
			}
			while(i < l) 
	//*  62  106:iload_2         
	//*  63  107:iload           5
	//*  64  109:icmpge          207
			{
				int k = Character.digit(bufferedreader[i], 10);
	//   65  112:aload_1         
	//   66  113:iload_2         
	//   67  114:caload          
	//   68  115:bipush          10
	//   69  117:invokestatic    #480 <Method int Character.digit(char, int)>
	//   70  120:istore          4
				if(k >= 0)
	//*  71  122:iload           4
	//*  72  124:iflt            196
				{
					if(l1 >= 0x33333334L)
	//*  73  127:lload           6
	//*  74  129:ldc2w           #494 <Long 0x33333334L>
	//*  75  132:lcmp            
	//*  76  133:iflt            185
					{
						l1 *= 10L;
	//   77  136:lload           6
	//   78  138:ldc2w           #496 <Long 10L>
	//   79  141:lmul            
	//   80  142:lstore          6
						long l3 = k;
	//   81  144:iload           4
	//   82  146:i2l             
	//   83  147:lstore          10
						if(l1 >= l2 + l3)
	//*  84  149:lload           6
	//*  85  151:lload           8
	//*  86  153:lload           10
	//*  87  155:ladd            
	//*  88  156:lcmp            
	//*  89  157:iflt            174
						{
							l1 -= l3;
	//   90  160:lload           6
	//   91  162:lload           10
	//   92  164:lsub            
	//   93  165:lstore          6
							i++;
	//   94  167:iload_2         
	//   95  168:iconst_1        
	//   96  169:iadd            
	//   97  170:istore_2        
						} else
	//*  98  171:goto            106
						{
							throw new ParseException("Number too large");
	//   99  174:new             #7   <Class FastParser$ParseException>
	//  100  177:dup             
	//  101  178:ldc2            #485 <String "Number too large">
	//  102  181:invokespecial   #173 <Method void FastParser$ParseException(String)>
	//  103  184:athrow          
						}
					} else
					{
						throw new ParseException("Number too large");
	//  104  185:new             #7   <Class FastParser$ParseException>
	//  105  188:dup             
	//  106  189:ldc2            #485 <String "Number too large">
	//  107  192:invokespecial   #173 <Method void FastParser$ParseException(String)>
	//  108  195:athrow          
					}
				} else
				{
					throw new ParseException("Unexpected non-digit character");
	//  109  196:new             #7   <Class FastParser$ParseException>
	//  110  199:dup             
	//  111  200:ldc2            #482 <String "Unexpected non-digit character">
	//  112  203:invokespecial   #173 <Method void FastParser$ParseException(String)>
	//  113  206:athrow          
				}
			}
			if(flag)
	//* 114  207:iload_3         
	//* 115  208:ifeq            230
			{
				if(i > 1)
	//* 116  211:iload_2         
	//* 117  212:iconst_1        
	//* 118  213:icmple          219
					return l1;
	//  119  216:lload           6
	//  120  218:lreturn         
				else
					throw new ParseException("No digits to parse");
	//  121  219:new             #7   <Class FastParser$ParseException>
	//  122  222:dup             
	//  123  223:ldc2            #487 <String "No digits to parse">
	//  124  226:invokespecial   #173 <Method void FastParser$ParseException(String)>
	//  125  229:athrow          
			} else
			{
				return -l1;
	//  126  230:lload           6
	//  127  232:lneg            
	//  128  233:lreturn         
			}
		} else
		{
			throw new ParseException("No number to parse");
	//  129  234:new             #7   <Class FastParser$ParseException>
	//  130  237:dup             
	//  131  238:ldc2            #489 <String "No number to parse">
	//  132  241:invokespecial   #173 <Method void FastParser$ParseException(String)>
	//  133  244:athrow          
		}
	}

	static String zze(FastParser fastparser, BufferedReader bufferedreader)
		throws ParseException, IOException
	{
		return fastparser.zzc(bufferedreader);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #359 <Method String zzc(BufferedReader)>
	//    3    5:areturn         
	}

	static BigInteger zzf(FastParser fastparser, BufferedReader bufferedreader)
		throws ParseException, IOException
	{
		return fastparser.zzf(bufferedreader);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #420 <Method BigInteger zzf(BufferedReader)>
	//    3    5:areturn         
	}

	private final BigInteger zzf(BufferedReader bufferedreader)
		throws ParseException, IOException
	{
		int i = zza(bufferedreader, zzws);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_0         
	//    3    3:getfield        #115 <Field char[] zzws>
	//    4    6:invokespecial   #448 <Method int zza(BufferedReader, char[])>
	//    5    9:istore_2        
		if(i == 0)
	//*   6   10:iload_2         
	//*   7   11:ifne            16
			return null;
	//    8   14:aconst_null     
	//    9   15:areturn         
		else
			return new BigInteger(new String(zzws, 0, i));
	//   10   16:new             #501 <Class BigInteger>
	//   11   19:dup             
	//   12   20:new             #308 <Class String>
	//   13   23:dup             
	//   14   24:aload_0         
	//   15   25:getfield        #115 <Field char[] zzws>
	//   16   28:iconst_0        
	//   17   29:iload_2         
	//   18   30:invokespecial   #504 <Method void String(char[], int, int)>
	//   19   33:invokespecial   #505 <Method void BigInteger(String)>
	//   20   36:areturn         
	}

	private final float zzg(BufferedReader bufferedreader)
		throws ParseException, IOException
	{
		int i = zza(bufferedreader, zzws);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_0         
	//    3    3:getfield        #115 <Field char[] zzws>
	//    4    6:invokespecial   #448 <Method int zza(BufferedReader, char[])>
	//    5    9:istore_2        
		if(i == 0)
	//*   6   10:iload_2         
	//*   7   11:ifne            16
			return 0.0F;
	//    8   14:fconst_0        
	//    9   15:freturn         
		else
			return Float.parseFloat(new String(zzws, 0, i));
	//   10   16:new             #308 <Class String>
	//   11   19:dup             
	//   12   20:aload_0         
	//   13   21:getfield        #115 <Field char[] zzws>
	//   14   24:iconst_0        
	//   15   25:iload_2         
	//   16   26:invokespecial   #504 <Method void String(char[], int, int)>
	//   17   29:invokestatic    #511 <Method float Float.parseFloat(String)>
	//   18   32:freturn         
	}

	static BigDecimal zzg(FastParser fastparser, BufferedReader bufferedreader)
		throws ParseException, IOException
	{
		return fastparser.zzi(bufferedreader);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #377 <Method BigDecimal zzi(BufferedReader)>
	//    3    5:areturn         
	}

	private final double zzh(BufferedReader bufferedreader)
		throws ParseException, IOException
	{
		int i = zza(bufferedreader, zzws);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_0         
	//    3    3:getfield        #115 <Field char[] zzws>
	//    4    6:invokespecial   #448 <Method int zza(BufferedReader, char[])>
	//    5    9:istore_2        
		if(i == 0)
	//*   6   10:iload_2         
	//*   7   11:ifne            16
			return 0.0D;
	//    8   14:dconst_0        
	//    9   15:dreturn         
		else
			return Double.parseDouble(new String(zzws, 0, i));
	//   10   16:new             #308 <Class String>
	//   11   19:dup             
	//   12   20:aload_0         
	//   13   21:getfield        #115 <Field char[] zzws>
	//   14   24:iconst_0        
	//   15   25:iload_2         
	//   16   26:invokespecial   #504 <Method void String(char[], int, int)>
	//   17   29:invokestatic    #518 <Method double Double.parseDouble(String)>
	//   18   32:dreturn         
	}

	private final BigDecimal zzi(BufferedReader bufferedreader)
		throws ParseException, IOException
	{
		int i = zza(bufferedreader, zzws);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_0         
	//    3    3:getfield        #115 <Field char[] zzws>
	//    4    6:invokespecial   #448 <Method int zza(BufferedReader, char[])>
	//    5    9:istore_2        
		if(i == 0)
	//*   6   10:iload_2         
	//*   7   11:ifne            16
			return null;
	//    8   14:aconst_null     
	//    9   15:areturn         
		else
			return new BigDecimal(new String(zzws, 0, i));
	//   10   16:new             #520 <Class BigDecimal>
	//   11   19:dup             
	//   12   20:new             #308 <Class String>
	//   13   23:dup             
	//   14   24:aload_0         
	//   15   25:getfield        #115 <Field char[] zzws>
	//   16   28:iconst_0        
	//   17   29:iload_2         
	//   18   30:invokespecial   #504 <Method void String(char[], int, int)>
	//   19   33:invokespecial   #521 <Method void BigDecimal(String)>
	//   20   36:areturn         
	}

	private final char zzj(BufferedReader bufferedreader)
		throws ParseException, IOException
	{
		if(bufferedreader.read(zzwq) == -1)
	//*   0    0:aload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #111 <Field char[] zzwq>
	//*   3    5:invokevirtual   #457 <Method int BufferedReader.read(char[])>
	//*   4    8:iconst_m1       
	//*   5    9:icmpne          14
			return '\0';
	//    6   12:iconst_0        
	//    7   13:ireturn         
		while(Character.isWhitespace(zzwq[0])) 
	//*   8   14:aload_0         
	//*   9   15:getfield        #111 <Field char[] zzwq>
	//*  10   18:iconst_0        
	//*  11   19:caload          
	//*  12   20:invokestatic    #176 <Method boolean Character.isWhitespace(char)>
	//*  13   23:ifeq            40
			if(bufferedreader.read(zzwq) == -1)
	//*  14   26:aload_1         
	//*  15   27:aload_0         
	//*  16   28:getfield        #111 <Field char[] zzwq>
	//*  17   31:invokevirtual   #457 <Method int BufferedReader.read(char[])>
	//*  18   34:iconst_m1       
	//*  19   35:icmpne          14
				return '\0';
	//   20   38:iconst_0        
	//   21   39:ireturn         
		return zzwq[0];
	//   22   40:aload_0         
	//   23   41:getfield        #111 <Field char[] zzwq>
	//   24   44:iconst_0        
	//   25   45:caload          
	//   26   46:ireturn         
	}

	private final void zzk(int i)
		throws ParseException
	{
		if(!zzxb.isEmpty())
	//*   0    0:aload_0         
	//*   1    1:getfield        #129 <Field Stack zzxb>
	//*   2    4:invokevirtual   #524 <Method boolean Stack.isEmpty()>
	//*   3    7:ifne            80
		{
			int j = ((Integer)zzxb.pop()).intValue();
	//    4   10:aload_0         
	//    5   11:getfield        #129 <Field Stack zzxb>
	//    6   14:invokevirtual   #528 <Method Object Stack.pop()>
	//    7   17:checkcast       #185 <Class Integer>
	//    8   20:invokevirtual   #531 <Method int Integer.intValue()>
	//    9   23:istore_2        
			if(j == i)
	//*  10   24:iload_2         
	//*  11   25:iload_1         
	//*  12   26:icmpne          30
			{
				return;
	//   13   29:return          
			} else
			{
				StringBuilder stringbuilder = new StringBuilder(46);
	//   14   30:new             #117 <Class StringBuilder>
	//   15   33:dup             
	//   16   34:bipush          46
	//   17   36:invokespecial   #120 <Method void StringBuilder(int)>
	//   18   39:astore_3        
				stringbuilder.append("Expected state ");
	//   19   40:aload_3         
	//   20   41:ldc2            #533 <String "Expected state ">
	//   21   44:invokevirtual   #202 <Method StringBuilder StringBuilder.append(String)>
	//   22   47:pop             
				stringbuilder.append(i);
	//   23   48:aload_3         
	//   24   49:iload_1         
	//   25   50:invokevirtual   #282 <Method StringBuilder StringBuilder.append(int)>
	//   26   53:pop             
				stringbuilder.append(" but had ");
	//   27   54:aload_3         
	//   28   55:ldc2            #535 <String " but had ">
	//   29   58:invokevirtual   #202 <Method StringBuilder StringBuilder.append(String)>
	//   30   61:pop             
				stringbuilder.append(j);
	//   31   62:aload_3         
	//   32   63:iload_2         
	//   33   64:invokevirtual   #282 <Method StringBuilder StringBuilder.append(int)>
	//   34   67:pop             
				throw new ParseException(stringbuilder.toString());
	//   35   68:new             #7   <Class FastParser$ParseException>
	//   36   71:dup             
	//   37   72:aload_3         
	//   38   73:invokevirtual   #209 <Method String StringBuilder.toString()>
	//   39   76:invokespecial   #173 <Method void FastParser$ParseException(String)>
	//   40   79:athrow          
			}
		} else
		{
			StringBuilder stringbuilder1 = new StringBuilder(46);
	//   41   80:new             #117 <Class StringBuilder>
	//   42   83:dup             
	//   43   84:bipush          46
	//   44   86:invokespecial   #120 <Method void StringBuilder(int)>
	//   45   89:astore_3        
			stringbuilder1.append("Expected state ");
	//   46   90:aload_3         
	//   47   91:ldc2            #533 <String "Expected state ">
	//   48   94:invokevirtual   #202 <Method StringBuilder StringBuilder.append(String)>
	//   49   97:pop             
			stringbuilder1.append(i);
	//   50   98:aload_3         
	//   51   99:iload_1         
	//   52  100:invokevirtual   #282 <Method StringBuilder StringBuilder.append(int)>
	//   53  103:pop             
			stringbuilder1.append(" but had empty stack");
	//   54  104:aload_3         
	//   55  105:ldc2            #537 <String " but had empty stack">
	//   56  108:invokevirtual   #202 <Method StringBuilder StringBuilder.append(String)>
	//   57  111:pop             
			throw new ParseException(stringbuilder1.toString());
	//   58  112:new             #7   <Class FastParser$ParseException>
	//   59  115:dup             
	//   60  116:aload_3         
	//   61  117:invokevirtual   #209 <Method String StringBuilder.toString()>
	//   62  120:invokespecial   #173 <Method void FastParser$ParseException(String)>
	//   63  123:athrow          
		}
	}

	public void parse(InputStream inputstream, FastJsonResponse fastjsonresponse)
		throws ParseException
	{
		inputstream = ((InputStream) (new BufferedReader(((java.io.Reader) (new InputStreamReader(inputstream))), 1024)));
	//    0    0:new             #148 <Class BufferedReader>
	//    1    3:dup             
	//    2    4:new             #541 <Class InputStreamReader>
	//    3    7:dup             
	//    4    8:aload_1         
	//    5    9:invokespecial   #544 <Method void InputStreamReader(InputStream)>
	//    6   12:sipush          1024
	//    7   15:invokespecial   #547 <Method void BufferedReader(java.io.Reader, int)>
	//    8   18:astore_1        
		char c;
		zzxb.push(((Object) (Integer.valueOf(0))));
	//    9   19:aload_0         
	//   10   20:getfield        #129 <Field Stack zzxb>
	//   11   23:iconst_0        
	//   12   24:invokestatic    #189 <Method Integer Integer.valueOf(int)>
	//   13   27:invokevirtual   #193 <Method Object Stack.push(Object)>
	//   14   30:pop             
		c = zzj(((BufferedReader) (inputstream)));
	//   15   31:aload_0         
	//   16   32:aload_1         
	//   17   33:invokespecial   #142 <Method char zzj(BufferedReader)>
	//   18   36:istore_3        
		if(c == 0)
			break MISSING_BLOCK_LABEL_223;
	//   19   37:iload_3         
	//   20   38:ifeq            223
		if(c == '[') goto _L2; else goto _L1
	//   21   41:iload_3         
	//   22   42:bipush          91
	//   23   44:icmpeq          110
_L1:
		if(c != '{') goto _L4; else goto _L3
	//   24   47:iload_3         
	//   25   48:bipush          123
	//   26   50:icmpne          75
_L3:
		try
		{
			zzxb.push(((Object) (Integer.valueOf(1))));
	//   27   53:aload_0         
	//   28   54:getfield        #129 <Field Stack zzxb>
	//   29   57:iconst_1        
	//   30   58:invokestatic    #189 <Method Integer Integer.valueOf(int)>
	//   31   61:invokevirtual   #193 <Method Object Stack.push(Object)>
	//   32   64:pop             
			zza(((BufferedReader) (inputstream)), fastjsonresponse);
	//   33   65:aload_0         
	//   34   66:aload_1         
	//   35   67:aload_2         
	//   36   68:invokespecial   #233 <Method boolean zza(BufferedReader, FastJsonResponse)>
	//   37   71:pop             
			break MISSING_BLOCK_LABEL_191;
	//   38   72:goto            191
		}
	//*  39   75:new             #117 <Class StringBuilder>
	//*  40   78:dup             
	//*  41   79:bipush          19
	//*  42   81:invokespecial   #120 <Method void StringBuilder(int)>
	//*  43   84:astore_2        
	//*  44   85:aload_2         
	//*  45   86:ldc1            #198 <String "Unexpected token: ">
	//*  46   88:invokevirtual   #202 <Method StringBuilder StringBuilder.append(String)>
	//*  47   91:pop             
	//*  48   92:aload_2         
	//*  49   93:iload_3         
	//*  50   94:invokevirtual   #205 <Method StringBuilder StringBuilder.append(char)>
	//*  51   97:pop             
	//*  52   98:new             #7   <Class FastParser$ParseException>
	//*  53  101:dup             
	//*  54  102:aload_2         
	//*  55  103:invokevirtual   #209 <Method String StringBuilder.toString()>
	//*  56  106:invokespecial   #173 <Method void FastParser$ParseException(String)>
	//*  57  109:athrow          
	//*  58  110:aload_0         
	//*  59  111:getfield        #129 <Field Stack zzxb>
	//*  60  114:iconst_5        
	//*  61  115:invokestatic    #189 <Method Integer Integer.valueOf(int)>
	//*  62  118:invokevirtual   #193 <Method Object Stack.push(Object)>
	//*  63  121:pop             
	//*  64  122:aload_2         
	//*  65  123:invokevirtual   #264 <Method Map FastJsonResponse.getFieldMappings()>
	//*  66  126:astore          4
	//*  67  128:aload           4
	//*  68  130:invokeinterface #550 <Method int Map.size()>
	//*  69  135:iconst_1        
	//*  70  136:icmpne          212
	//*  71  139:aload           4
	//*  72  141:invokeinterface #554 <Method Set Map.entrySet()>
	//*  73  146:invokeinterface #560 <Method Iterator Set.iterator()>
	//*  74  151:invokeinterface #565 <Method Object Iterator.next()>
	//*  75  156:checkcast       #567 <Class java.util.Map$Entry>
	//*  76  159:invokeinterface #570 <Method Object java.util.Map$Entry.getValue()>
	//*  77  164:checkcast       #226 <Class FastJsonResponse$Field>
	//*  78  167:astore          4
	//*  79  169:aload_0         
	//*  80  170:aload_1         
	//*  81  171:aload           4
	//*  82  173:invokespecial   #295 <Method ArrayList zza(BufferedReader, FastJsonResponse$Field)>
	//*  83  176:astore          5
	//*  84  178:aload_2         
	//*  85  179:aload           4
	//*  86  181:aload           4
	//*  87  183:invokevirtual   #289 <Method String FastJsonResponse$Field.getOutputFieldName()>
	//*  88  186:aload           5
	//*  89  188:invokevirtual   #293 <Method void FastJsonResponse.addConcreteTypeArrayInternal(FastJsonResponse$Field, String, ArrayList)>
	//*  90  191:aload_0         
	//*  91  192:iconst_0        
	//*  92  193:invokespecial   #196 <Method void zzk(int)>
	//*  93  196:aload_1         
	//*  94  197:invokevirtual   #573 <Method void BufferedReader.close()>
	//*  95  200:return          
	//*  96  201:ldc2            #575 <String "FastParser">
	//*  97  204:ldc2            #577 <String "Failed to close reader while parsing.">
	//*  98  207:invokestatic    #583 <Method int Log.w(String, String)>
	//*  99  210:pop             
	//* 100  211:return          
	//* 101  212:new             #7   <Class FastParser$ParseException>
	//* 102  215:dup             
	//* 103  216:ldc2            #585 <String "Object array response class must have a single Field">
	//* 104  219:invokespecial   #173 <Method void FastParser$ParseException(String)>
	//* 105  222:athrow          
	//* 106  223:new             #7   <Class FastParser$ParseException>
	//* 107  226:dup             
	//* 108  227:ldc2            #587 <String "No data to parse">
	//* 109  230:invokespecial   #173 <Method void FastParser$ParseException(String)>
	//* 110  233:athrow          
	//* 111  234:astore_2        
	//* 112  235:goto            248
		// Misplaced declaration of an exception variable
		catch(FastJsonResponse fastjsonresponse) { }
	//  113  238:astore_2        
		  goto _L5
_L4:
		fastjsonresponse = ((FastJsonResponse) (new StringBuilder(19)));
		((StringBuilder) (fastjsonresponse)).append("Unexpected token: ");
		((StringBuilder) (fastjsonresponse)).append(c);
		throw new ParseException(((StringBuilder) (fastjsonresponse)).toString());
_L2:
		zzxb.push(((Object) (Integer.valueOf(5))));
		Object obj = ((Object) (fastjsonresponse.getFieldMappings()));
		if(((Map) (obj)).size() != 1)
			break MISSING_BLOCK_LABEL_212;
		obj = ((Object) ((FastJsonResponse.Field)((java.util.Map.Entry)((Map) (obj)).entrySet().iterator().next()).getValue()));
		ArrayList arraylist = zza(((BufferedReader) (inputstream)), ((FastJsonResponse.Field) (obj)));
		fastjsonresponse.addConcreteTypeArrayInternal(((FastJsonResponse.Field) (obj)), ((FastJsonResponse.Field) (obj)).getOutputFieldName(), arraylist);
		zzk(0);
		try
		{
			((BufferedReader) (inputstream)).close();
			return;
		}
	//* 114  239:new             #7   <Class FastParser$ParseException>
	//* 115  242:dup             
	//* 116  243:aload_2         
	//* 117  244:invokespecial   #590 <Method void FastParser$ParseException(Throwable)>
	//* 118  247:athrow          
	//* 119  248:aload_1         
	//* 120  249:invokevirtual   #573 <Method void BufferedReader.close()>
	//* 121  252:goto            265
	//* 122  255:ldc2            #575 <String "FastParser">
	//* 123  258:ldc2            #577 <String "Failed to close reader while parsing.">
	//* 124  261:invokestatic    #583 <Method int Log.w(String, String)>
	//* 125  264:pop             
	//* 126  265:aload_2         
	//* 127  266:athrow          
		// Misplaced declaration of an exception variable
		catch(InputStream inputstream)
		{
			Log.w("FastParser", "Failed to close reader while parsing.");
		}
		return;
		throw new ParseException("Object array response class must have a single Field");
		throw new ParseException("No data to parse");
		fastjsonresponse;
		break MISSING_BLOCK_LABEL_248;
_L5:
		throw new ParseException(((Throwable) (fastjsonresponse)));
		try
		{
			((BufferedReader) (inputstream)).close();
		}
	//* 128  267:astore_1        
	//* 129  268:goto            201
		// Misplaced declaration of an exception variable
		catch(InputStream inputstream)
		{
			Log.w("FastParser", "Failed to close reader while parsing.");
		}
		throw fastjsonresponse;
	//* 130  271:astore_1        
	//* 131  272:goto            255
	}

	public void parse(String s, FastJsonResponse fastjsonresponse)
		throws ParseException
	{
		s = ((String) (new ByteArrayInputStream(s.getBytes())));
	//    0    0:new             #594 <Class ByteArrayInputStream>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:invokevirtual   #598 <Method byte[] String.getBytes()>
	//    4    8:invokespecial   #601 <Method void ByteArrayInputStream(byte[])>
	//    5   11:astore_1        
		parse(((InputStream) (s)), fastjsonresponse);
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:aload_2         
	//    9   15:invokevirtual   #603 <Method void parse(InputStream, FastJsonResponse)>
		try
		{
			((ByteArrayInputStream) (s)).close();
	//   10   18:aload_1         
	//   11   19:invokevirtual   #604 <Method void ByteArrayInputStream.close()>
			return;
	//   12   22:return          
		}
	//*  13   23:ldc2            #575 <String "FastParser">
	//*  14   26:ldc2            #606 <String "Failed to close the input stream while parsing.">
	//*  15   29:invokestatic    #583 <Method int Log.w(String, String)>
	//*  16   32:pop             
	//*  17   33:return          
	//*  18   34:astore_2        
	//*  19   35:aload_1         
	//*  20   36:invokevirtual   #604 <Method void ByteArrayInputStream.close()>
	//*  21   39:goto            52
	//*  22   42:ldc2            #575 <String "FastParser">
	//*  23   45:ldc2            #606 <String "Failed to close the input stream while parsing.">
	//*  24   48:invokestatic    #583 <Method int Log.w(String, String)>
	//*  25   51:pop             
	//*  26   52:aload_2         
	//*  27   53:athrow          
		// Misplaced declaration of an exception variable
		catch(String s)
		{
			Log.w("FastParser", "Failed to close the input stream while parsing.");
		}
		return;
		fastjsonresponse;
		try
		{
			((ByteArrayInputStream) (s)).close();
		}
	//*  28   54:astore_1        
	//*  29   55:goto            23
		// Misplaced declaration of an exception variable
		catch(String s)
		{
			Log.w("FastParser", "Failed to close the input stream while parsing.");
		}
		throw fastjsonresponse;
	//*  30   58:astore_1        
	//*  31   59:goto            42
	}

	private static final char zzwv[] = {
		'u', 'l', 'l'
	};
	private static final char zzww[] = {
		'r', 'u', 'e'
	};
	private static final char zzwx[] = {
		'r', 'u', 'e', '"'
	};
	private static final char zzwy[] = {
		'a', 'l', 's', 'e'
	};
	private static final char zzwz[] = {
		'a', 'l', 's', 'e', '"'
	};
	private static final char zzxa[] = {
		'\n'
	};
	private static final zza zzxc = new com.google.android.gms.common.server.response.zza();
	private static final zza zzxd = new zzb();
	private static final zza zzxe = new zzc();
	private static final zza zzxf = new zzd();
	private static final zza zzxg = new zze();
	private static final zza zzxh = new zzf();
	private static final zza zzxi = new zzg();
	private static final zza zzxj = new zzh();
	private final char zzwq[] = new char[1];
	private final char zzwr[] = new char[32];
	private final char zzws[] = new char[1024];
	private final StringBuilder zzwt = new StringBuilder(32);
	private final StringBuilder zzwu = new StringBuilder(1024);
	private final Stack zzxb = new Stack();

	static 
	{
	//    0    0:iconst_3        
	//    1    1:newarray        char[]
	//    2    3:dup             
	//    3    4:iconst_0        
	//    4    5:ldc1            #47  <Int 117>
	//    5    7:castore         
	//    6    8:dup             
	//    7    9:iconst_1        
	//    8   10:ldc1            #48  <Int 108>
	//    9   12:castore         
	//   10   13:dup             
	//   11   14:iconst_2        
	//   12   15:ldc1            #48  <Int 108>
	//   13   17:castore         
	//   14   18:putstatic       #50  <Field char[] zzwv>
	//   15   21:iconst_3        
	//   16   22:newarray        char[]
	//   17   24:dup             
	//   18   25:iconst_0        
	//   19   26:ldc1            #51  <Int 114>
	//   20   28:castore         
	//   21   29:dup             
	//   22   30:iconst_1        
	//   23   31:ldc1            #47  <Int 117>
	//   24   33:castore         
	//   25   34:dup             
	//   26   35:iconst_2        
	//   27   36:ldc1            #52  <Int 101>
	//   28   38:castore         
	//   29   39:putstatic       #54  <Field char[] zzww>
	//   30   42:iconst_4        
	//   31   43:newarray        char[]
	//   32   45:dup             
	//   33   46:iconst_0        
	//   34   47:ldc1            #51  <Int 114>
	//   35   49:castore         
	//   36   50:dup             
	//   37   51:iconst_1        
	//   38   52:ldc1            #47  <Int 117>
	//   39   54:castore         
	//   40   55:dup             
	//   41   56:iconst_2        
	//   42   57:ldc1            #52  <Int 101>
	//   43   59:castore         
	//   44   60:dup             
	//   45   61:iconst_3        
	//   46   62:ldc1            #55  <Int 34>
	//   47   64:castore         
	//   48   65:putstatic       #57  <Field char[] zzwx>
	//   49   68:iconst_4        
	//   50   69:newarray        char[]
	//   51   71:dup             
	//   52   72:iconst_0        
	//   53   73:ldc1            #58  <Int 97>
	//   54   75:castore         
	//   55   76:dup             
	//   56   77:iconst_1        
	//   57   78:ldc1            #48  <Int 108>
	//   58   80:castore         
	//   59   81:dup             
	//   60   82:iconst_2        
	//   61   83:ldc1            #59  <Int 115>
	//   62   85:castore         
	//   63   86:dup             
	//   64   87:iconst_3        
	//   65   88:ldc1            #52  <Int 101>
	//   66   90:castore         
	//   67   91:putstatic       #61  <Field char[] zzwy>
	//   68   94:iconst_5        
	//   69   95:newarray        char[]
	//   70   97:dup             
	//   71   98:iconst_0        
	//   72   99:ldc1            #58  <Int 97>
	//   73  101:castore         
	//   74  102:dup             
	//   75  103:iconst_1        
	//   76  104:ldc1            #48  <Int 108>
	//   77  106:castore         
	//   78  107:dup             
	//   79  108:iconst_2        
	//   80  109:ldc1            #59  <Int 115>
	//   81  111:castore         
	//   82  112:dup             
	//   83  113:iconst_3        
	//   84  114:ldc1            #52  <Int 101>
	//   85  116:castore         
	//   86  117:dup             
	//   87  118:iconst_4        
	//   88  119:ldc1            #55  <Int 34>
	//   89  121:castore         
	//   90  122:putstatic       #63  <Field char[] zzwz>
	//   91  125:iconst_1        
	//   92  126:newarray        char[]
	//   93  128:dup             
	//   94  129:iconst_0        
	//   95  130:bipush          10
	//   96  132:castore         
	//   97  133:putstatic       #65  <Field char[] zzxa>
	//   98  136:new             #67  <Class zza>
	//   99  139:dup             
	//  100  140:invokespecial   #70  <Method void zza()>
	//  101  143:putstatic       #72  <Field FastParser$zza zzxc>
	//  102  146:new             #74  <Class zzb>
	//  103  149:dup             
	//  104  150:invokespecial   #75  <Method void zzb()>
	//  105  153:putstatic       #77  <Field FastParser$zza zzxd>
	//  106  156:new             #79  <Class zzc>
	//  107  159:dup             
	//  108  160:invokespecial   #80  <Method void zzc()>
	//  109  163:putstatic       #82  <Field FastParser$zza zzxe>
	//  110  166:new             #84  <Class zzd>
	//  111  169:dup             
	//  112  170:invokespecial   #85  <Method void zzd()>
	//  113  173:putstatic       #87  <Field FastParser$zza zzxf>
	//  114  176:new             #89  <Class zze>
	//  115  179:dup             
	//  116  180:invokespecial   #90  <Method void zze()>
	//  117  183:putstatic       #92  <Field FastParser$zza zzxg>
	//  118  186:new             #94  <Class zzf>
	//  119  189:dup             
	//  120  190:invokespecial   #95  <Method void zzf()>
	//  121  193:putstatic       #97  <Field FastParser$zza zzxh>
	//  122  196:new             #99  <Class zzg>
	//  123  199:dup             
	//  124  200:invokespecial   #100 <Method void zzg()>
	//  125  203:putstatic       #102 <Field FastParser$zza zzxi>
	//  126  206:new             #104 <Class zzh>
	//  127  209:dup             
	//  128  210:invokespecial   #105 <Method void zzh()>
	//  129  213:putstatic       #107 <Field FastParser$zza zzxj>
	//* 130  216:return          
	}
}

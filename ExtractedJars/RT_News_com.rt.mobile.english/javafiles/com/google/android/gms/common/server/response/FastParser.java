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
		if(c == 0)
	//*   4    6:iload_3         
	//*   5    7:ifne            20
			throw new ParseException("Unexpected EOF");
	//    6   10:new             #7   <Class FastParser$ParseException>
	//    7   13:dup             
	//    8   14:ldc1            #144 <String "Unexpected EOF">
	//    9   16:invokespecial   #147 <Method void FastParser$ParseException(String)>
	//   10   19:athrow          
		if(c == ',')
	//*  11   20:iload_3         
	//*  12   21:bipush          44
	//*  13   23:icmpne          36
			throw new ParseException("Missing value");
	//   14   26:new             #7   <Class FastParser$ParseException>
	//   15   29:dup             
	//   16   30:ldc1            #149 <String "Missing value">
	//   17   32:invokespecial   #147 <Method void FastParser$ParseException(String)>
	//   18   35:athrow          
		if(c == 'n')
	//*  19   36:iload_3         
	//*  20   37:bipush          110
	//*  21   39:icmpne          52
		{
			zzb(bufferedreader, zzwv);
	//   22   42:aload_0         
	//   23   43:aload_1         
	//   24   44:getstatic       #50  <Field char[] zzwv>
	//   25   47:invokespecial   #153 <Method void zzb(BufferedReader, char[])>
			return 0;
	//   26   50:iconst_0        
	//   27   51:ireturn         
		}
		bufferedreader.mark(1024);
	//   28   52:aload_1         
	//   29   53:sipush          1024
	//   30   56:invokevirtual   #158 <Method void BufferedReader.mark(int)>
		int l;
		if(c == '"')
	//*  31   59:iload_3         
	//*  32   60:bipush          34
	//*  33   62:icmpne          176
		{
			int i = 0;
	//   34   65:iconst_0        
	//   35   66:istore          4
			int k = i;
	//   36   68:iload           4
	//   37   70:istore          5
			do
			{
				l = i;
	//   38   72:iload           4
	//   39   74:istore          6
				if(i >= ac.length)
					break;
	//   40   76:iload           4
	//   41   78:aload_2         
	//   42   79:arraylength     
	//   43   80:icmpge          281
				l = i;
	//   44   83:iload           4
	//   45   85:istore          6
				if(bufferedreader.read(ac, i, 1) == -1)
					break;
	//   46   87:aload_1         
	//   47   88:aload_2         
	//   48   89:iload           4
	//   49   91:iconst_1        
	//   50   92:invokevirtual   #162 <Method int BufferedReader.read(char[], int, int)>
	//   51   95:iconst_m1       
	//   52   96:icmpeq          281
				c = ac[i];
	//   53   99:aload_2         
	//   54  100:iload           4
	//   55  102:caload          
	//   56  103:istore_3        
				if(Character.isISOControl(c))
	//*  57  104:iload_3         
	//*  58  105:invokestatic    #168 <Method boolean Character.isISOControl(char)>
	//*  59  108:ifeq            121
					throw new ParseException("Unexpected control character while reading string");
	//   60  111:new             #7   <Class FastParser$ParseException>
	//   61  114:dup             
	//   62  115:ldc1            #170 <String "Unexpected control character while reading string">
	//   63  117:invokespecial   #147 <Method void FastParser$ParseException(String)>
	//   64  120:athrow          
				if(c == '"' && k == 0)
	//*  65  121:iload_3         
	//*  66  122:bipush          34
	//*  67  124:icmpne          149
	//*  68  127:iload           5
	//*  69  129:ifne            149
				{
					bufferedreader.reset();
	//   70  132:aload_1         
	//   71  133:invokevirtual   #173 <Method void BufferedReader.reset()>
					bufferedreader.skip(i + 1);
	//   72  136:aload_1         
	//   73  137:iload           4
	//   74  139:iconst_1        
	//   75  140:iadd            
	//   76  141:i2l             
	//   77  142:invokevirtual   #177 <Method long BufferedReader.skip(long)>
	//   78  145:pop2            
					return i;
	//   79  146:iload           4
	//   80  148:ireturn         
				}
				if(c == '\\')
	//*  81  149:iload_3         
	//*  82  150:bipush          92
	//*  83  152:icmpne          164
					k ^= 1;
	//   84  155:iload           5
	//   85  157:iconst_1        
	//   86  158:ixor            
	//   87  159:istore          5
				else
	//*  88  161:goto            167
					k = 0;
	//   89  164:iconst_0        
	//   90  165:istore          5
				i++;
	//   91  167:iload           4
	//   92  169:iconst_1        
	//   93  170:iadd            
	//   94  171:istore          4
			} while(true);
	//   95  173:goto            72
		} else
		{
			ac[0] = c;
	//   96  176:aload_2         
	//   97  177:iconst_0        
	//   98  178:iload_3         
	//   99  179:castore         
			int j = 1;
	//  100  180:iconst_1        
	//  101  181:istore          4
			do
			{
				l = j;
	//  102  183:iload           4
	//  103  185:istore          6
				if(j >= ac.length)
					break;
	//  104  187:iload           4
	//  105  189:aload_2         
	//  106  190:arraylength     
	//  107  191:icmpge          281
				l = j;
	//  108  194:iload           4
	//  109  196:istore          6
				if(bufferedreader.read(ac, j, 1) == -1)
					break;
	//  110  198:aload_1         
	//  111  199:aload_2         
	//  112  200:iload           4
	//  113  202:iconst_1        
	//  114  203:invokevirtual   #162 <Method int BufferedReader.read(char[], int, int)>
	//  115  206:iconst_m1       
	//  116  207:icmpeq          281
				if(ac[j] != '}' && ac[j] != ',' && !Character.isWhitespace(ac[j]) && ac[j] != ']')
	//* 117  210:aload_2         
	//* 118  211:iload           4
	//* 119  213:caload          
	//* 120  214:bipush          125
	//* 121  216:icmpeq          259
	//* 122  219:aload_2         
	//* 123  220:iload           4
	//* 124  222:caload          
	//* 125  223:bipush          44
	//* 126  225:icmpeq          259
	//* 127  228:aload_2         
	//* 128  229:iload           4
	//* 129  231:caload          
	//* 130  232:invokestatic    #180 <Method boolean Character.isWhitespace(char)>
	//* 131  235:ifne            259
	//* 132  238:aload_2         
	//* 133  239:iload           4
	//* 134  241:caload          
	//* 135  242:bipush          93
	//* 136  244:icmpne          250
	//* 137  247:goto            259
				{
					j++;
	//  138  250:iload           4
	//  139  252:iconst_1        
	//  140  253:iadd            
	//  141  254:istore          4
				} else
	//* 142  256:goto            183
				{
					bufferedreader.reset();
	//  143  259:aload_1         
	//  144  260:invokevirtual   #173 <Method void BufferedReader.reset()>
					bufferedreader.skip(j - 1);
	//  145  263:aload_1         
	//  146  264:iload           4
	//  147  266:iconst_1        
	//  148  267:isub            
	//  149  268:i2l             
	//  150  269:invokevirtual   #177 <Method long BufferedReader.skip(long)>
	//  151  272:pop2            
					ac[j] = '\0';
	//  152  273:aload_2         
	//  153  274:iload           4
	//  154  276:iconst_0        
	//  155  277:castore         
					return j;
	//  156  278:iload           4
	//  157  280:ireturn         
				}
			} while(true);
		}
		if(l == ac.length)
	//* 158  281:iload           6
	//* 159  283:aload_2         
	//* 160  284:arraylength     
	//* 161  285:icmpne          298
			throw new ParseException("Absurdly long value");
	//  162  288:new             #7   <Class FastParser$ParseException>
	//  163  291:dup             
	//  164  292:ldc1            #182 <String "Absurdly long value">
	//  165  294:invokespecial   #147 <Method void FastParser$ParseException(String)>
	//  166  297:athrow          
		else
			throw new ParseException("Unexpected EOF");
	//  167  298:new             #7   <Class FastParser$ParseException>
	//  168  301:dup             
	//  169  302:ldc1            #144 <String "Unexpected EOF">
	//  170  304:invokespecial   #147 <Method void FastParser$ParseException(String)>
	//  171  307:athrow          
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
				if(c != '}')
	//*  16   30:iload_2         
	//*  17   31:bipush          125
	//*  18   33:icmpeq          71
				{
					bufferedreader = ((BufferedReader) (new StringBuilder(19)));
	//   19   36:new             #117 <Class StringBuilder>
	//   20   39:dup             
	//   21   40:bipush          19
	//   22   42:invokespecial   #120 <Method void StringBuilder(int)>
	//   23   45:astore_1        
					((StringBuilder) (bufferedreader)).append("Unexpected token: ");
	//   24   46:aload_1         
	//   25   47:ldc1            #195 <String "Unexpected token: ">
	//   26   49:invokevirtual   #199 <Method StringBuilder StringBuilder.append(String)>
	//   27   52:pop             
					((StringBuilder) (bufferedreader)).append(c);
	//   28   53:aload_1         
	//   29   54:iload_2         
	//   30   55:invokevirtual   #202 <Method StringBuilder StringBuilder.append(char)>
	//   31   58:pop             
					throw new ParseException(((StringBuilder) (bufferedreader)).toString());
	//   32   59:new             #7   <Class FastParser$ParseException>
	//   33   62:dup             
	//   34   63:aload_1         
	//   35   64:invokevirtual   #206 <Method String StringBuilder.toString()>
	//   36   67:invokespecial   #147 <Method void FastParser$ParseException(String)>
	//   37   70:athrow          
				} else
				{
					zzk(2);
	//   38   71:aload_0         
	//   39   72:iconst_2        
	//   40   73:invokespecial   #209 <Method void zzk(int)>
					return null;
	//   41   76:aconst_null     
	//   42   77:areturn         
				}
			} else
			{
				zzk(2);
	//   43   78:aload_0         
	//   44   79:iconst_2        
	//   45   80:invokespecial   #209 <Method void zzk(int)>
				zzk(1);
	//   46   83:aload_0         
	//   47   84:iconst_1        
	//   48   85:invokespecial   #209 <Method void zzk(int)>
				zzk(5);
	//   49   88:aload_0         
	//   50   89:iconst_5        
	//   51   90:invokespecial   #209 <Method void zzk(int)>
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
	//   70  123:invokespecial   #209 <Method void zzk(int)>
		if(zzj(bufferedreader) != ':')
	//*  71  126:aload_0         
	//*  72  127:aload_1         
	//*  73  128:invokespecial   #142 <Method char zzj(BufferedReader)>
	//*  74  131:bipush          58
	//*  75  133:icmpeq          146
			throw new ParseException("Expected key/value separator");
	//   76  136:new             #7   <Class FastParser$ParseException>
	//   77  139:dup             
	//   78  140:ldc1            #214 <String "Expected key/value separator">
	//   79  142:invokespecial   #147 <Method void FastParser$ParseException(String)>
	//   80  145:athrow          
		else
			return s;
	//   81  146:aload_3         
	//   82  147:areturn         
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
			if(c != 'n')
	//*   7   14:iload           5
	//*   8   16:bipush          110
	//*   9   18:icmpeq          31
			{
				throw new ParseException("Expected string");
	//   10   21:new             #7   <Class FastParser$ParseException>
	//   11   24:dup             
	//   12   25:ldc1            #216 <String "Expected string">
	//   13   27:invokespecial   #147 <Method void FastParser$ParseException(String)>
	//   14   30:athrow          
			} else
			{
				zzb(bufferedreader, zzwv);
	//   15   31:aload_0         
	//   16   32:aload_1         
	//   17   33:getstatic       #50  <Field char[] zzwv>
	//   18   36:invokespecial   #153 <Method void zzb(BufferedReader, char[])>
				return null;
	//   19   39:aconst_null     
	//   20   40:areturn         
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
				if(c != '{')
	//*  14   27:iload_3         
	//*  15   28:bipush          123
	//*  16   30:icmpeq          68
				{
					bufferedreader = ((BufferedReader) (new StringBuilder(19)));
	//   17   33:new             #117 <Class StringBuilder>
	//   18   36:dup             
	//   19   37:bipush          19
	//   20   39:invokespecial   #120 <Method void StringBuilder(int)>
	//   21   42:astore_1        
					((StringBuilder) (bufferedreader)).append("Unexpected token: ");
	//   22   43:aload_1         
	//   23   44:ldc1            #195 <String "Unexpected token: ">
	//   24   46:invokevirtual   #199 <Method StringBuilder StringBuilder.append(String)>
	//   25   49:pop             
					((StringBuilder) (bufferedreader)).append(c);
	//   26   50:aload_1         
	//   27   51:iload_3         
	//   28   52:invokevirtual   #202 <Method StringBuilder StringBuilder.append(char)>
	//   29   55:pop             
					throw new ParseException(((StringBuilder) (bufferedreader)).toString());
	//   30   56:new             #7   <Class FastParser$ParseException>
	//   31   59:dup             
	//   32   60:aload_1         
	//   33   61:invokevirtual   #206 <Method String StringBuilder.toString()>
	//   34   64:invokespecial   #147 <Method void FastParser$ParseException(String)>
	//   35   67:athrow          
				}
				Object obj = ((Object) (zzxb));
	//   36   68:aload_0         
	//   37   69:getfield        #129 <Field Stack zzxb>
	//   38   72:astore          4
				do
				{
					((Stack) (obj)).push(((Object) (Integer.valueOf(1))));
	//   39   74:aload           4
	//   40   76:iconst_1        
	//   41   77:invokestatic    #189 <Method Integer Integer.valueOf(int)>
	//   42   80:invokevirtual   #193 <Method Object Stack.push(Object)>
	//   43   83:pop             
					char c1;
					try
					{
						obj = ((Object) (field.newConcreteTypeInstance()));
	//   44   84:aload_2         
	//   45   85:invokevirtual   #230 <Method FastJsonResponse FastJsonResponse$Field.newConcreteTypeInstance()>
	//   46   88:astore          4
						if(!zza(bufferedreader, ((FastJsonResponse) (obj))))
							break;
	//   47   90:aload_0         
	//   48   91:aload_1         
	//   49   92:aload           4
	//   50   94:invokespecial   #233 <Method boolean zza(BufferedReader, FastJsonResponse)>
	//   51   97:ifeq            198
						arraylist.add(obj);
	//   52  100:aload           5
	//   53  102:aload           4
	//   54  104:invokevirtual   #237 <Method boolean ArrayList.add(Object)>
	//   55  107:pop             
					}
	//*  56  108:aload_0         
	//*  57  109:aload_1         
	//*  58  110:invokespecial   #142 <Method char zzj(BufferedReader)>
	//*  59  113:istore_3        
	//*  60  114:iload_3         
	//*  61  115:bipush          44
	//*  62  117:icmpeq          169
	//*  63  120:iload_3         
	//*  64  121:bipush          93
	//*  65  123:icmpeq          161
	//*  66  126:new             #117 <Class StringBuilder>
	//*  67  129:dup             
	//*  68  130:bipush          19
	//*  69  132:invokespecial   #120 <Method void StringBuilder(int)>
	//*  70  135:astore_1        
	//*  71  136:aload_1         
	//*  72  137:ldc1            #195 <String "Unexpected token: ">
	//*  73  139:invokevirtual   #199 <Method StringBuilder StringBuilder.append(String)>
	//*  74  142:pop             
	//*  75  143:aload_1         
	//*  76  144:iload_3         
	//*  77  145:invokevirtual   #202 <Method StringBuilder StringBuilder.append(char)>
	//*  78  148:pop             
	//*  79  149:new             #7   <Class FastParser$ParseException>
	//*  80  152:dup             
	//*  81  153:aload_1         
	//*  82  154:invokevirtual   #206 <Method String StringBuilder.toString()>
	//*  83  157:invokespecial   #147 <Method void FastParser$ParseException(String)>
	//*  84  160:athrow          
	//*  85  161:aload_0         
	//*  86  162:iconst_5        
	//*  87  163:invokespecial   #209 <Method void zzk(int)>
	//*  88  166:aload           5
	//*  89  168:areturn         
	//*  90  169:aload_0         
	//*  91  170:aload_1         
	//*  92  171:invokespecial   #142 <Method char zzj(BufferedReader)>
	//*  93  174:bipush          123
	//*  94  176:icmpeq          189
	//*  95  179:new             #7   <Class FastParser$ParseException>
	//*  96  182:dup             
	//*  97  183:ldc1            #239 <String "Expected start of next object in array">
	//*  98  185:invokespecial   #147 <Method void FastParser$ParseException(String)>
	//*  99  188:athrow          
	//* 100  189:aload_0         
	//* 101  190:getfield        #129 <Field Stack zzxb>
	//* 102  193:astore          4
	//* 103  195:goto            74
	//* 104  198:aload           5
	//* 105  200:areturn         
	//* 106  201:astore_1        
	//* 107  202:new             #7   <Class FastParser$ParseException>
	//* 108  205:dup             
	//* 109  206:ldc1            #241 <String "Error instantiating inner object">
	//* 110  208:aload_1         
	//* 111  209:invokespecial   #244 <Method void FastParser$ParseException(String, Throwable)>
	//* 112  212:athrow          
					// Misplaced declaration of an exception variable
					catch(BufferedReader bufferedreader)
	//* 113  213:astore_1        
					{
						throw new ParseException("Error instantiating inner object", ((Throwable) (bufferedreader)));
	//  114  214:new             #7   <Class FastParser$ParseException>
	//  115  217:dup             
	//  116  218:ldc1            #241 <String "Error instantiating inner object">
	//  117  220:aload_1         
	//  118  221:invokespecial   #244 <Method void FastParser$ParseException(String, Throwable)>
	//  119  224:athrow          
					}
					// Misplaced declaration of an exception variable
					catch(BufferedReader bufferedreader)
					{
						throw new ParseException("Error instantiating inner object", ((Throwable) (bufferedreader)));
					}
					c1 = zzj(bufferedreader);
					if(c1 != ',')
						if(c1 != ']')
						{
							bufferedreader = ((BufferedReader) (new StringBuilder(19)));
							((StringBuilder) (bufferedreader)).append("Unexpected token: ");
							((StringBuilder) (bufferedreader)).append(c1);
							throw new ParseException(((StringBuilder) (bufferedreader)).toString());
						} else
						{
							zzk(5);
							return arraylist;
						}
					if(zzj(bufferedreader) != '{')
						throw new ParseException("Expected start of next object in array");
					obj = ((Object) (zzxb));
				} while(true);
				return arraylist;
			} else
			{
				zzb(bufferedreader, zzwv);
	//  120  225:aload_0         
	//  121  226:aload_1         
	//  122  227:getstatic       #50  <Field char[] zzwv>
	//  123  230:invokespecial   #153 <Method void zzb(BufferedReader, char[])>
				zzk(5);
	//  124  233:aload_0         
	//  125  234:iconst_5        
	//  126  235:invokespecial   #209 <Method void zzk(int)>
				return null;
	//  127  238:aconst_null     
	//  128  239:areturn         
			}
		} else
		{
			zzk(5);
	//  129  240:aload_0         
	//  130  241:iconst_5        
	//  131  242:invokespecial   #209 <Method void zzk(int)>
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
	//   10   17:invokespecial   #153 <Method void zzb(BufferedReader, char[])>
			return null;
	//   11   20:aconst_null     
	//   12   21:areturn         
		}
		if(c != '[')
	//*  13   22:iload_3         
	//*  14   23:bipush          91
	//*  15   25:icmpeq          38
			throw new ParseException("Expected start of array");
	//   16   28:new             #7   <Class FastParser$ParseException>
	//   17   31:dup             
	//   18   32:ldc1            #249 <String "Expected start of array">
	//   19   34:invokespecial   #147 <Method void FastParser$ParseException(String)>
	//   20   37:athrow          
		zzxb.push(((Object) (Integer.valueOf(5))));
	//   21   38:aload_0         
	//   22   39:getfield        #129 <Field Stack zzxb>
	//   23   42:iconst_5        
	//   24   43:invokestatic    #189 <Method Integer Integer.valueOf(int)>
	//   25   46:invokevirtual   #193 <Method Object Stack.push(Object)>
	//   26   49:pop             
		ArrayList arraylist = new ArrayList();
	//   27   50:new             #223 <Class ArrayList>
	//   28   53:dup             
	//   29   54:invokespecial   #224 <Method void ArrayList()>
	//   30   57:astore          4
		do
		{
			bufferedreader.mark(1024);
	//   31   59:aload_1         
	//   32   60:sipush          1024
	//   33   63:invokevirtual   #158 <Method void BufferedReader.mark(int)>
			char c1 = zzj(bufferedreader);
	//   34   66:aload_0         
	//   35   67:aload_1         
	//   36   68:invokespecial   #142 <Method char zzj(BufferedReader)>
	//   37   71:istore_3        
			if(c1 == 0)
				break;
	//   38   72:iload_3         
	//   39   73:ifeq            117
			if(c1 != ',')
	//*  40   76:iload_3         
	//*  41   77:bipush          44
	//*  42   79:icmpeq          59
				if(c1 != ']')
	//*  43   82:iload_3         
	//*  44   83:bipush          93
	//*  45   85:icmpeq          109
				{
					bufferedreader.reset();
	//   46   88:aload_1         
	//   47   89:invokevirtual   #173 <Method void BufferedReader.reset()>
					arraylist.add(zza1.zzh(this, bufferedreader));
	//   48   92:aload           4
	//   49   94:aload_2         
	//   50   95:aload_0         
	//   51   96:aload_1         
	//   52   97:invokeinterface #253 <Method Object FastParser$zza.zzh(FastParser, BufferedReader)>
	//   53  102:invokevirtual   #237 <Method boolean ArrayList.add(Object)>
	//   54  105:pop             
				} else
	//*  55  106:goto            59
				{
					zzk(5);
	//   56  109:aload_0         
	//   57  110:iconst_5        
	//   58  111:invokespecial   #209 <Method void zzk(int)>
					return arraylist;
	//   59  114:aload           4
	//   60  116:areturn         
				}
		} while(true);
		throw new ParseException("Unexpected EOF");
	//   61  117:new             #7   <Class FastParser$ParseException>
	//   62  120:dup             
	//   63  121:ldc1            #144 <String "Unexpected EOF">
	//   64  123:invokespecial   #147 <Method void FastParser$ParseException(String)>
	//   65  126:athrow          
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
	//   11   20:invokespecial   #209 <Method void zzk(int)>
			return false;
	//   12   23:iconst_0        
	//   13   24:ireturn         
		}
_L26:
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
	//   47  161:invokevirtual   #199 <Method StringBuilder StringBuilder.append(String)>
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
	//   56  177:invokevirtual   #206 <Method String StringBuilder.toString()>
	//   57  180:invokespecial   #147 <Method void FastParser$ParseException(String)>
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
	//   72  211:invokespecial   #153 <Method void zzb(BufferedReader, char[])>
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
				if(c2 != '[')
	//*  86  241:iload           4
	//*  87  243:bipush          91
	//*  88  245:icmpeq          259
					throw new ParseException("Expected array start");
	//   89  248:new             #7   <Class FastParser$ParseException>
	//   90  251:dup             
	//   91  252:ldc2            #295 <String "Expected array start">
	//   92  255:invokespecial   #147 <Method void FastParser$ParseException(String)>
	//   93  258:athrow          
				fastjsonresponse.addConcreteTypeArrayInternal(field, field.getOutputFieldName(), zza(bufferedreader, field));
	//   94  259:aload_2         
	//   95  260:aload           7
	//   96  262:aload           7
	//   97  264:invokevirtual   #289 <Method String FastJsonResponse$Field.getOutputFieldName()>
	//   98  267:aload_0         
	//   99  268:aload_1         
	//  100  269:aload           7
	//  101  271:invokespecial   #297 <Method ArrayList zza(BufferedReader, FastJsonResponse$Field)>
	//  102  274:invokevirtual   #293 <Method void FastJsonResponse.addConcreteTypeArrayInternal(FastJsonResponse$Field, String, ArrayList)>
			}
		} else
	//* 103  277:goto            1094
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
	//  114  299:invokespecial   #153 <Method void zzb(BufferedReader, char[])>
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
				if(c3 != '{')
	//* 128  329:iload           4
	//* 129  331:bipush          123
	//* 130  333:icmpeq          347
					throw new ParseException("Expected start of object");
	//  131  336:new             #7   <Class FastParser$ParseException>
	//  132  339:dup             
	//  133  340:ldc2            #303 <String "Expected start of object">
	//  134  343:invokespecial   #147 <Method void FastParser$ParseException(String)>
	//  135  346:athrow          
				try
				{
					obj = ((Object) (field.newConcreteTypeInstance()));
	//  136  347:aload           7
	//  137  349:invokevirtual   #230 <Method FastJsonResponse FastJsonResponse$Field.newConcreteTypeInstance()>
	//  138  352:astore          5
					zza(bufferedreader, ((FastJsonResponse) (obj)));
	//  139  354:aload_0         
	//  140  355:aload_1         
	//  141  356:aload           5
	//  142  358:invokespecial   #233 <Method boolean zza(BufferedReader, FastJsonResponse)>
	//  143  361:pop             
					fastjsonresponse.addConcreteTypeInternal(field, field.getOutputFieldName(), ((FastJsonResponse) (obj)));
	//  144  362:aload_2         
	//  145  363:aload           7
	//  146  365:aload           7
	//  147  367:invokevirtual   #289 <Method String FastJsonResponse$Field.getOutputFieldName()>
	//  148  370:aload           5
	//  149  372:invokevirtual   #301 <Method void FastJsonResponse.addConcreteTypeInternal(FastJsonResponse$Field, String, FastJsonResponse)>
				}
	//* 150  375:goto            1094
	//* 151  378:astore_1        
	//* 152  379:new             #7   <Class FastParser$ParseException>
	//* 153  382:dup             
	//* 154  383:ldc1            #241 <String "Error instantiating inner object">
	//* 155  385:aload_1         
	//* 156  386:invokespecial   #244 <Method void FastParser$ParseException(String, Throwable)>
	//* 157  389:athrow          
				// Misplaced declaration of an exception variable
				catch(BufferedReader bufferedreader)
	//* 158  390:astore_1        
				{
					throw new ParseException("Error instantiating inner object", ((Throwable) (bufferedreader)));
	//  159  391:new             #7   <Class FastParser$ParseException>
	//  160  394:dup             
	//  161  395:ldc1            #241 <String "Error instantiating inner object">
	//  162  397:aload_1         
	//  163  398:invokespecial   #244 <Method void FastParser$ParseException(String, Throwable)>
	//  164  401:athrow          
				}
				// Misplaced declaration of an exception variable
				catch(BufferedReader bufferedreader)
				{
					throw new ParseException("Error instantiating inner object", ((Throwable) (bufferedreader)));
				}
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
	//  175  421:invokespecial   #153 <Method void zzb(BufferedReader, char[])>
		obj = null;
	//  176  424:aconst_null     
	//  177  425:astore          5
		  goto _L16
	//* 178  427:goto            671
_L15:
		if(c4 != '{')
	//* 179  430:iload           4
	//* 180  432:bipush          123
	//* 181  434:icmpeq          448
			throw new ParseException("Expected start of a map object");
	//  182  437:new             #7   <Class FastParser$ParseException>
	//  183  440:dup             
	//  184  441:ldc2            #305 <String "Expected start of a map object">
	//  185  444:invokespecial   #147 <Method void FastParser$ParseException(String)>
	//  186  447:athrow          
		zzxb.push(((Object) (Integer.valueOf(1))));
	//  187  448:aload_0         
	//  188  449:getfield        #129 <Field Stack zzxb>
	//  189  452:iconst_1        
	//  190  453:invokestatic    #189 <Method Integer Integer.valueOf(int)>
	//  191  456:invokevirtual   #193 <Method Object Stack.push(Object)>
	//  192  459:pop             
		obj = ((Object) (new HashMap()));
	//  193  460:new             #307 <Class HashMap>
	//  194  463:dup             
	//  195  464:invokespecial   #308 <Method void HashMap()>
	//  196  467:astore          5
_L21:
		c4 = zzj(bufferedreader);
	//  197  469:aload_0         
	//  198  470:aload_1         
	//  199  471:invokespecial   #142 <Method char zzj(BufferedReader)>
	//  200  474:istore          4
		if(c4 == 0) goto _L18; else goto _L17
	//  201  476:iload           4
	//  202  478:ifeq            718
_L17:
		if(c4 == '"') goto _L20; else goto _L19
	//  203  481:iload           4
	//  204  483:bipush          34
	//  205  485:icmpeq          506
_L19:
		if(c4 == '}') goto _L22; else goto _L21
	//  206  488:iload           4
	//  207  490:bipush          125
	//  208  492:icmpeq          498
	//* 209  495:goto            469
_L22:
		zzk(1);
	//  210  498:aload_0         
	//  211  499:iconst_1        
	//  212  500:invokespecial   #209 <Method void zzk(int)>
		  goto _L16
	//* 213  503:goto            671
_L20:
		char c;
		String s = zzb(bufferedreader, zzwr, zzwt, ((char []) (null)));
	//  214  506:aload_1         
	//  215  507:aload_0         
	//  216  508:getfield        #113 <Field char[] zzwr>
	//  217  511:aload_0         
	//  218  512:getfield        #122 <Field StringBuilder zzwt>
	//  219  515:aconst_null     
	//  220  516:invokestatic    #212 <Method String zzb(BufferedReader, char[], StringBuilder, char[])>
	//  221  519:astore          8
		if(zzj(bufferedreader) != ':')
	//* 222  521:aload_0         
	//* 223  522:aload_1         
	//* 224  523:invokespecial   #142 <Method char zzj(BufferedReader)>
	//* 225  526:bipush          58
	//* 226  528:icmpeq          575
		{
			bufferedreader = ((BufferedReader) (String.valueOf(((Object) (s)))));
	//  227  531:aload           8
	//  228  533:invokestatic    #313 <Method String String.valueOf(Object)>
	//  229  536:astore_1        
			if(((String) (bufferedreader)).length() != 0)
	//* 230  537:aload_1         
	//* 231  538:invokevirtual   #316 <Method int String.length()>
	//* 232  541:ifeq            555
				bufferedreader = ((BufferedReader) ("No map value found for key ".concat(((String) (bufferedreader)))));
	//  233  544:ldc2            #318 <String "No map value found for key ">
	//  234  547:aload_1         
	//  235  548:invokevirtual   #322 <Method String String.concat(String)>
	//  236  551:astore_1        
			else
	//* 237  552:goto            566
				bufferedreader = ((BufferedReader) (new String("No map value found for key ")));
	//  238  555:new             #310 <Class String>
	//  239  558:dup             
	//  240  559:ldc2            #318 <String "No map value found for key ">
	//  241  562:invokespecial   #323 <Method void String(String)>
	//  242  565:astore_1        
			throw new ParseException(((String) (bufferedreader)));
	//  243  566:new             #7   <Class FastParser$ParseException>
	//  244  569:dup             
	//  245  570:aload_1         
	//  246  571:invokespecial   #147 <Method void FastParser$ParseException(String)>
	//  247  574:athrow          
		}
		if(zzj(bufferedreader) != '"')
	//* 248  575:aload_0         
	//* 249  576:aload_1         
	//* 250  577:invokespecial   #142 <Method char zzj(BufferedReader)>
	//* 251  580:bipush          34
	//* 252  582:icmpeq          629
		{
			bufferedreader = ((BufferedReader) (String.valueOf(((Object) (s)))));
	//  253  585:aload           8
	//  254  587:invokestatic    #313 <Method String String.valueOf(Object)>
	//  255  590:astore_1        
			if(((String) (bufferedreader)).length() != 0)
	//* 256  591:aload_1         
	//* 257  592:invokevirtual   #316 <Method int String.length()>
	//* 258  595:ifeq            609
				bufferedreader = ((BufferedReader) ("Expected String value for key ".concat(((String) (bufferedreader)))));
	//  259  598:ldc2            #325 <String "Expected String value for key ">
	//  260  601:aload_1         
	//  261  602:invokevirtual   #322 <Method String String.concat(String)>
	//  262  605:astore_1        
			else
	//* 263  606:goto            620
				bufferedreader = ((BufferedReader) (new String("Expected String value for key ")));
	//  264  609:new             #310 <Class String>
	//  265  612:dup             
	//  266  613:ldc2            #325 <String "Expected String value for key ">
	//  267  616:invokespecial   #323 <Method void String(String)>
	//  268  619:astore_1        
			throw new ParseException(((String) (bufferedreader)));
	//  269  620:new             #7   <Class FastParser$ParseException>
	//  270  623:dup             
	//  271  624:aload_1         
	//  272  625:invokespecial   #147 <Method void FastParser$ParseException(String)>
	//  273  628:athrow          
		}
		((HashMap) (obj)).put(((Object) (s)), ((Object) (zzb(bufferedreader, zzwr, zzwt, ((char []) (null))))));
	//  274  629:aload           5
	//  275  631:aload           8
	//  276  633:aload_1         
	//  277  634:aload_0         
	//  278  635:getfield        #113 <Field char[] zzwr>
	//  279  638:aload_0         
	//  280  639:getfield        #122 <Field StringBuilder zzwt>
	//  281  642:aconst_null     
	//  282  643:invokestatic    #212 <Method String zzb(BufferedReader, char[], StringBuilder, char[])>
	//  283  646:invokevirtual   #329 <Method Object HashMap.put(Object, Object)>
	//  284  649:pop             
		c = zzj(bufferedreader);
	//  285  650:aload_0         
	//  286  651:aload_1         
	//  287  652:invokespecial   #142 <Method char zzj(BufferedReader)>
	//  288  655:istore_3        
		if(c == ',') goto _L21; else goto _L23
	//  289  656:iload_3         
	//  290  657:bipush          44
	//  291  659:icmpeq          469
_L23:
		if(c != '}') goto _L24; else goto _L22
	//  292  662:iload_3         
	//  293  663:bipush          125
	//  294  665:icmpne          682
	//* 295  668:goto            498
_L16:
		fastjsonresponse.setStringMap(field, ((Map) (obj)));
	//  296  671:aload_2         
	//  297  672:aload           7
	//  298  674:aload           5
	//  299  676:invokevirtual   #333 <Method void FastJsonResponse.setStringMap(FastJsonResponse$Field, Map)>
		break MISSING_BLOCK_LABEL_1094;
	//  300  679:goto            1094
_L24:
		bufferedreader = ((BufferedReader) (new StringBuilder(48)));
	//  301  682:new             #117 <Class StringBuilder>
	//  302  685:dup             
	//  303  686:bipush          48
	//  304  688:invokespecial   #120 <Method void StringBuilder(int)>
	//  305  691:astore_1        
		((StringBuilder) (bufferedreader)).append("Unexpected character while parsing string map: ");
	//  306  692:aload_1         
	//  307  693:ldc2            #335 <String "Unexpected character while parsing string map: ">
	//  308  696:invokevirtual   #199 <Method StringBuilder StringBuilder.append(String)>
	//  309  699:pop             
		((StringBuilder) (bufferedreader)).append(c);
	//  310  700:aload_1         
	//  311  701:iload_3         
	//  312  702:invokevirtual   #202 <Method StringBuilder StringBuilder.append(char)>
	//  313  705:pop             
		throw new ParseException(((StringBuilder) (bufferedreader)).toString());
	//  314  706:new             #7   <Class FastParser$ParseException>
	//  315  709:dup             
	//  316  710:aload_1         
	//  317  711:invokevirtual   #206 <Method String StringBuilder.toString()>
	//  318  714:invokespecial   #147 <Method void FastParser$ParseException(String)>
	//  319  717:athrow          
_L18:
		throw new ParseException("Unexpected EOF");
	//  320  718:new             #7   <Class FastParser$ParseException>
	//  321  721:dup             
	//  322  722:ldc1            #144 <String "Unexpected EOF">
	//  323  724:invokespecial   #147 <Method void FastParser$ParseException(String)>
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
	//  497 1096:invokespecial   #209 <Method void zzk(int)>
		zzk(2);
	//  498 1099:aload_0         
	//  499 1100:iconst_2        
	//  500 1101:invokespecial   #209 <Method void zzk(int)>
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
			if(c1 != '}')
	//* 508 1116:iload_3         
	//* 509 1117:bipush          125
	//* 510 1119:icmpeq          1158
			{
				bufferedreader = ((BufferedReader) (new StringBuilder(55)));
	//  511 1122:new             #117 <Class StringBuilder>
	//  512 1125:dup             
	//  513 1126:bipush          55
	//  514 1128:invokespecial   #120 <Method void StringBuilder(int)>
	//  515 1131:astore_1        
				((StringBuilder) (bufferedreader)).append("Expected end of object or field separator, but found: ");
	//  516 1132:aload_1         
	//  517 1133:ldc2            #433 <String "Expected end of object or field separator, but found: ">
	//  518 1136:invokevirtual   #199 <Method StringBuilder StringBuilder.append(String)>
	//  519 1139:pop             
				((StringBuilder) (bufferedreader)).append(c1);
	//  520 1140:aload_1         
	//  521 1141:iload_3         
	//  522 1142:invokevirtual   #202 <Method StringBuilder StringBuilder.append(char)>
	//  523 1145:pop             
				throw new ParseException(((StringBuilder) (bufferedreader)).toString());
	//  524 1146:new             #7   <Class FastParser$ParseException>
	//  525 1149:dup             
	//  526 1150:aload_1         
	//  527 1151:invokevirtual   #206 <Method String StringBuilder.toString()>
	//  528 1154:invokespecial   #147 <Method void FastParser$ParseException(String)>
	//  529 1157:athrow          
			}
			obj = null;
	//  530 1158:aconst_null     
	//  531 1159:astore          5
		} else
	//* 532 1161:goto            25
		{
			obj = ((Object) (zza(bufferedreader)));
	//  533 1164:aload_0         
	//  534 1165:aload_1         
	//  535 1166:invokespecial   #266 <Method String zza(BufferedReader)>
	//  536 1169:astore          5
		}
		if(true) goto _L26; else goto _L25
	//  537 1171:goto            25
_L25:
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
	//  549 1193:invokespecial   #209 <Method void zzk(int)>
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
						if(c != 't')
	//*  13   24:iload_3         
	//*  14   25:bipush          116
	//*  15   27:icmpeq          65
						{
							bufferedreader = ((BufferedReader) (new StringBuilder(19)));
	//   16   30:new             #117 <Class StringBuilder>
	//   17   33:dup             
	//   18   34:bipush          19
	//   19   36:invokespecial   #120 <Method void StringBuilder(int)>
	//   20   39:astore_1        
							((StringBuilder) (bufferedreader)).append("Unexpected token: ");
	//   21   40:aload_1         
	//   22   41:ldc1            #195 <String "Unexpected token: ">
	//   23   43:invokevirtual   #199 <Method StringBuilder StringBuilder.append(String)>
	//   24   46:pop             
							((StringBuilder) (bufferedreader)).append(c);
	//   25   47:aload_1         
	//   26   48:iload_3         
	//   27   49:invokevirtual   #202 <Method StringBuilder StringBuilder.append(char)>
	//   28   52:pop             
							throw new ParseException(((StringBuilder) (bufferedreader)).toString());
	//   29   53:new             #7   <Class FastParser$ParseException>
	//   30   56:dup             
	//   31   57:aload_1         
	//   32   58:invokevirtual   #206 <Method String StringBuilder.toString()>
	//   33   61:invokespecial   #147 <Method void FastParser$ParseException(String)>
	//   34   64:athrow          
						}
						char ac[];
						if(flag)
	//*  35   65:iload_2         
	//*  36   66:ifeq            77
							ac = zzwx;
	//   37   69:getstatic       #57  <Field char[] zzwx>
	//   38   72:astore          4
						else
	//*  39   74:goto            82
							ac = zzww;
	//   40   77:getstatic       #54  <Field char[] zzww>
	//   41   80:astore          4
						zzb(bufferedreader, ac);
	//   42   82:aload_0         
	//   43   83:aload_1         
	//   44   84:aload           4
	//   45   86:invokespecial   #153 <Method void zzb(BufferedReader, char[])>
						return true;
	//   46   89:iconst_1        
	//   47   90:ireturn         
					} else
					{
						zzb(bufferedreader, zzwv);
	//   48   91:aload_0         
	//   49   92:aload_1         
	//   50   93:getstatic       #50  <Field char[] zzwv>
	//   51   96:invokespecial   #153 <Method void zzb(BufferedReader, char[])>
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
	//   64  122:invokespecial   #153 <Method void zzb(BufferedReader, char[])>
				return false;
	//   65  125:iconst_0        
	//   66  126:ireturn         
			}
			if(flag)
	//*  67  127:iload_2         
	//*  68  128:ifeq            142
				throw new ParseException("No boolean value found in string");
	//   69  131:new             #7   <Class FastParser$ParseException>
	//   70  134:dup             
	//   71  135:ldc2            #445 <String "No boolean value found in string">
	//   72  138:invokespecial   #147 <Method void FastParser$ParseException(String)>
	//   73  141:athrow          
			flag = true;
	//   74  142:iconst_1        
	//   75  143:istore_2        
		} while(true);
	//   76  144:goto            0
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
	//    2    4:invokevirtual   #158 <Method void BufferedReader.mark(int)>
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
	//   22   41:invokevirtual   #173 <Method void BufferedReader.reset()>
					zza(bufferedreader, zzws);
	//   23   44:aload_0         
	//   24   45:aload_1         
	//   25   46:aload_0         
	//   26   47:getfield        #115 <Field char[] zzws>
	//   27   50:invokespecial   #448 <Method int zza(BufferedReader, char[])>
	//   28   53:pop             
				} else
	//*  29   54:goto            409
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
	//   38   72:invokevirtual   #158 <Method void BufferedReader.mark(int)>
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
	//*  48   89:invokespecial   #209 <Method void zzk(int)>
	//*  49   92:goto            409
						if(c == '"')
	//*  50   95:iload_2         
	//*  51   96:bipush          34
	//*  52   98:icmpne          122
						{
							bufferedreader.reset();
	//   53  101:aload_1         
	//   54  102:invokevirtual   #173 <Method void BufferedReader.reset()>
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
	//   71  136:invokevirtual   #199 <Method StringBuilder StringBuilder.append(String)>
	//   72  139:pop             
							((StringBuilder) (bufferedreader)).append(c);
	//   73  140:aload_1         
	//   74  141:iload_2         
	//   75  142:invokevirtual   #202 <Method StringBuilder StringBuilder.append(char)>
	//   76  145:pop             
							throw new ParseException(((StringBuilder) (bufferedreader)).toString());
	//   77  146:new             #7   <Class FastParser$ParseException>
	//   78  149:dup             
	//   79  150:aload_1         
	//   80  151:invokevirtual   #206 <Method String StringBuilder.toString()>
	//   81  154:invokespecial   #147 <Method void FastParser$ParseException(String)>
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
	//   91  173:invokevirtual   #158 <Method void BufferedReader.mark(int)>
				if(zzj(bufferedreader) != ']')
	//*  92  176:aload_0         
	//*  93  177:aload_1         
	//*  94  178:invokespecial   #142 <Method char zzj(BufferedReader)>
	//*  95  181:bipush          93
	//*  96  183:icmpne          194
	//*  97  186:aload_0         
	//*  98  187:iconst_5        
	//*  99  188:invokespecial   #209 <Method void zzk(int)>
	//* 100  191:goto            409
				{
					bufferedreader.reset();
	//  101  194:aload_1         
	//  102  195:invokevirtual   #173 <Method void BufferedReader.reset()>
					boolean flag = false;
	//  103  198:iconst_0        
	//  104  199:istore_3        
					int j = ((int) (flag));
	//  105  200:iload_3         
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
						if(c1 == 0)
	//* 113  214:iload_2         
	//* 114  215:ifne            229
							throw new ParseException("Unexpected EOF while parsing array");
	//  115  218:new             #7   <Class FastParser$ParseException>
	//  116  221:dup             
	//  117  222:ldc2            #452 <String "Unexpected EOF while parsing array">
	//  118  225:invokespecial   #147 <Method void FastParser$ParseException(String)>
	//  119  228:athrow          
						if(Character.isISOControl(c1))
	//* 120  229:iload_2         
	//* 121  230:invokestatic    #168 <Method boolean Character.isISOControl(char)>
	//* 122  233:ifeq            247
							throw new ParseException("Unexpected control character while reading array");
	//  123  236:new             #7   <Class FastParser$ParseException>
	//  124  239:dup             
	//  125  240:ldc2            #454 <String "Unexpected control character while reading array">
	//  126  243:invokespecial   #147 <Method void FastParser$ParseException(String)>
	//  127  246:athrow          
						boolean flag1 = ((boolean) (j));
	//  128  247:iload           5
	//  129  249:istore          6
						if(c1 == '"')
	//* 130  251:iload_2         
	//* 131  252:bipush          34
	//* 132  254:icmpne          271
						{
							flag1 = ((boolean) (j));
	//  133  257:iload           5
	//  134  259:istore          6
							if(!flag)
	//* 135  261:iload_3         
	//* 136  262:ifne            271
								flag1 = j ^ true;
	//  137  265:iload           5
	//  138  267:iconst_1        
	//  139  268:ixor            
	//  140  269:istore          6
						}
						j = i;
	//  141  271:iload           4
	//  142  273:istore          5
						if(c1 == '[')
	//* 143  275:iload_2         
	//* 144  276:bipush          91
	//* 145  278:icmpne          296
						{
							j = i;
	//  146  281:iload           4
	//  147  283:istore          5
							if(!flag1)
	//* 148  285:iload           6
	//* 149  287:ifne            296
								j = i + 1;
	//  150  290:iload           4
	//  151  292:iconst_1        
	//  152  293:iadd            
	//  153  294:istore          5
						}
						i = j;
	//  154  296:iload           5
	//  155  298:istore          4
						if(c1 == ']')
	//* 156  300:iload_2         
	//* 157  301:bipush          93
	//* 158  303:icmpne          321
						{
							i = j;
	//  159  306:iload           5
	//  160  308:istore          4
							if(!flag1)
	//* 161  310:iload           6
	//* 162  312:ifne            321
								i = j - 1;
	//  163  315:iload           5
	//  164  317:iconst_1        
	//  165  318:isub            
	//  166  319:istore          4
						}
						if(c1 == '\\' && flag1)
	//* 167  321:iload_2         
	//* 168  322:bipush          92
	//* 169  324:icmpne          343
	//* 170  327:iload           6
	//* 171  329:ifeq            343
						{
							flag ^= true;
	//  172  332:iload_3         
	//  173  333:iconst_1        
	//  174  334:ixor            
	//  175  335:istore_3        
							j = ((int) (flag1));
	//  176  336:iload           6
	//  177  338:istore          5
						} else
	//* 178  340:goto            203
						{
							flag = false;
	//  179  343:iconst_0        
	//  180  344:istore_3        
							j = ((int) (flag1));
	//  181  345:iload           6
	//  182  347:istore          5
						}
					}
				}
				zzk(5);
			}
		} else
	//* 183  349:goto            203
		{
			throw new ParseException("Missing value");
	//  184  352:new             #7   <Class FastParser$ParseException>
	//  185  355:dup             
	//  186  356:ldc1            #149 <String "Missing value">
	//  187  358:invokespecial   #147 <Method void FastParser$ParseException(String)>
	//  188  361:athrow          
		}
		  goto _L3
_L2:
		char c5;
		if(bufferedreader.read(zzwq) == -1)
	//* 189  362:aload_1         
	//* 190  363:aload_0         
	//* 191  364:getfield        #111 <Field char[] zzwq>
	//* 192  367:invokevirtual   #457 <Method int BufferedReader.read(char[])>
	//* 193  370:iconst_m1       
	//* 194  371:icmpne          385
			throw new ParseException("Unexpected EOF while parsing string");
	//  195  374:new             #7   <Class FastParser$ParseException>
	//  196  377:dup             
	//  197  378:ldc2            #459 <String "Unexpected EOF while parsing string">
	//  198  381:invokespecial   #147 <Method void FastParser$ParseException(String)>
	//  199  384:athrow          
		c5 = zzwq[0];
	//  200  385:aload_0         
	//  201  386:getfield        #111 <Field char[] zzwq>
	//  202  389:iconst_0        
	//  203  390:caload          
	//  204  391:istore          4
		flag = false;
	//  205  393:iconst_0        
	//  206  394:istore_3        
_L6:
		if(c5 == '"' && !flag) goto _L3; else goto _L4
	//  207  395:iload           4
	//  208  397:bipush          34
	//  209  399:icmpne          481
	//  210  402:iload_3         
	//  211  403:ifeq            409
	//* 212  406:goto            481
_L3:
		char c2 = zzj(bufferedreader);
	//  213  409:aload_0         
	//  214  410:aload_1         
	//  215  411:invokespecial   #142 <Method char zzj(BufferedReader)>
	//  216  414:istore_2        
		if(c2 != ',')
	//* 217  415:iload_2         
	//* 218  416:bipush          44
	//* 219  418:icmpeq          470
		{
			if(c2 != '}')
	//* 220  421:iload_2         
	//* 221  422:bipush          125
	//* 222  424:icmpeq          463
			{
				bufferedreader = ((BufferedReader) (new StringBuilder(18)));
	//  223  427:new             #117 <Class StringBuilder>
	//  224  430:dup             
	//  225  431:bipush          18
	//  226  433:invokespecial   #120 <Method void StringBuilder(int)>
	//  227  436:astore_1        
				((StringBuilder) (bufferedreader)).append("Unexpected token ");
	//  228  437:aload_1         
	//  229  438:ldc2            #450 <String "Unexpected token ">
	//  230  441:invokevirtual   #199 <Method StringBuilder StringBuilder.append(String)>
	//  231  444:pop             
				((StringBuilder) (bufferedreader)).append(c2);
	//  232  445:aload_1         
	//  233  446:iload_2         
	//  234  447:invokevirtual   #202 <Method StringBuilder StringBuilder.append(char)>
	//  235  450:pop             
				throw new ParseException(((StringBuilder) (bufferedreader)).toString());
	//  236  451:new             #7   <Class FastParser$ParseException>
	//  237  454:dup             
	//  238  455:aload_1         
	//  239  456:invokevirtual   #206 <Method String StringBuilder.toString()>
	//  240  459:invokespecial   #147 <Method void FastParser$ParseException(String)>
	//  241  462:athrow          
			} else
			{
				zzk(2);
	//  242  463:aload_0         
	//  243  464:iconst_2        
	//  244  465:invokespecial   #209 <Method void zzk(int)>
				return null;
	//  245  468:aconst_null     
	//  246  469:areturn         
			}
		} else
		{
			zzk(2);
	//  247  470:aload_0         
	//  248  471:iconst_2        
	//  249  472:invokespecial   #209 <Method void zzk(int)>
			return zza(bufferedreader);
	//  250  475:aload_0         
	//  251  476:aload_1         
	//  252  477:invokespecial   #266 <Method String zza(BufferedReader)>
	//  253  480:areturn         
		}
_L4:
		if(c5 == '\\')
	//* 254  481:iload           4
	//* 255  483:bipush          92
	//* 256  485:icmpne          495
			flag ^= true;
	//  257  488:iload_3         
	//  258  489:iconst_1        
	//  259  490:ixor            
	//  260  491:istore_3        
		else
	//* 261  492:goto            497
			flag = false;
	//  262  495:iconst_0        
	//  263  496:istore_3        
		if(bufferedreader.read(zzwq) == -1)
	//* 264  497:aload_1         
	//* 265  498:aload_0         
	//* 266  499:getfield        #111 <Field char[] zzwq>
	//* 267  502:invokevirtual   #457 <Method int BufferedReader.read(char[])>
	//* 268  505:iconst_m1       
	//* 269  506:icmpne          520
			throw new ParseException("Unexpected EOF while parsing string");
	//  270  509:new             #7   <Class FastParser$ParseException>
	//  271  512:dup             
	//  272  513:ldc2            #459 <String "Unexpected EOF while parsing string">
	//  273  516:invokespecial   #147 <Method void FastParser$ParseException(String)>
	//  274  519:athrow          
		char c3 = zzwq[0];
	//  275  520:aload_0         
	//  276  521:getfield        #111 <Field char[] zzwq>
	//  277  524:iconst_0        
	//  278  525:caload          
	//  279  526:istore_2        
		c5 = c3;
	//  280  527:iload_2         
	//  281  528:istore          4
		if(Character.isISOControl(c3))
	//* 282  530:iload_2         
	//* 283  531:invokestatic    #168 <Method boolean Character.isISOControl(char)>
	//* 284  534:ifeq            395
			throw new ParseException("Unexpected control character while reading string");
	//  285  537:new             #7   <Class FastParser$ParseException>
	//  286  540:dup             
	//  287  541:ldc1            #170 <String "Unexpected control character while reading string">
	//  288  543:invokespecial   #147 <Method void FastParser$ParseException(String)>
	//  289  546:athrow          
		if(true) goto _L6; else goto _L5
_L5:
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
	//    6    8:invokevirtual   #158 <Method void BufferedReader.mark(int)>
		boolean flag = false;
	//    7   11:iconst_0        
	//    8   12:istore          5
		boolean flag1 = flag;
	//    9   14:iload           5
	//   10   16:istore          6
		do
		{
			int k = bufferedreader.read(ac);
	//   11   18:aload_0         
	//   12   19:aload_1         
	//   13   20:invokevirtual   #457 <Method int BufferedReader.read(char[])>
	//   14   23:istore          9
			if(k == -1)
				break;
	//   15   25:iload           9
	//   16   27:iconst_m1       
	//   17   28:icmpeq          241
			int i = ((int) (flag));
	//   18   31:iload           5
	//   19   33:istore          7
			boolean flag2 = false;
	//   20   35:iconst_0        
	//   21   36:istore          8
			flag = flag1;
	//   22   38:iload           6
	//   23   40:istore          5
			flag1 = ((boolean) (i));
	//   24   42:iload           7
	//   25   44:istore          6
			for(i = ((int) (flag2)); i < k; i++)
	//*  26   46:iload           8
	//*  27   48:istore          7
	//*  28   50:iload           7
	//*  29   52:iload           9
	//*  30   54:icmpge          211
			{
				char c;
label0:
				{
					int j;
label1:
					{
						c = ac[i];
	//   31   57:aload_1         
	//   32   58:iload           7
	//   33   60:caload          
	//   34   61:istore          4
						if(!Character.isISOControl(c))
							break label0;
	//   35   63:iload           4
	//   36   65:invokestatic    #168 <Method boolean Character.isISOControl(char)>
	//   37   68:ifeq            127
						if(ac1 != null)
	//*  38   71:aload_3         
	//*  39   72:ifnull          109
						{
							j = 0;
	//   40   75:iconst_0        
	//   41   76:istore          8
							do
							{
								if(j >= ac1.length)
									break;
	//   42   78:iload           8
	//   43   80:aload_3         
	//   44   81:arraylength     
	//   45   82:icmpge          109
								if(ac1[j] == c)
	//*  46   85:aload_3         
	//*  47   86:iload           8
	//*  48   88:caload          
	//*  49   89:iload           4
	//*  50   91:icmpne          100
								{
									j = 1;
	//   51   94:iconst_1        
	//   52   95:istore          8
									break label1;
	//   53   97:goto            112
								}
								j++;
	//   54  100:iload           8
	//   55  102:iconst_1        
	//   56  103:iadd            
	//   57  104:istore          8
							} while(true);
	//   58  106:goto            78
						}
						j = 0;
	//   59  109:iconst_0        
	//   60  110:istore          8
					}
					if(j == 0)
	//*  61  112:iload           8
	//*  62  114:ifne            127
						throw new ParseException("Unexpected control character while reading string");
	//   63  117:new             #7   <Class FastParser$ParseException>
	//   64  120:dup             
	//   65  121:ldc1            #170 <String "Unexpected control character while reading string">
	//   66  123:invokespecial   #147 <Method void FastParser$ParseException(String)>
	//   67  126:athrow          
				}
				if(c == '"' && !flag1)
	//*  68  127:iload           4
	//*  69  129:bipush          34
	//*  70  131:icmpne          180
	//*  71  134:iload           6
	//*  72  136:ifne            180
				{
					stringbuilder.append(ac, 0, i);
	//   73  139:aload_2         
	//   74  140:aload_1         
	//   75  141:iconst_0        
	//   76  142:iload           7
	//   77  144:invokevirtual   #465 <Method StringBuilder StringBuilder.append(char[], int, int)>
	//   78  147:pop             
					bufferedreader.reset();
	//   79  148:aload_0         
	//   80  149:invokevirtual   #173 <Method void BufferedReader.reset()>
					bufferedreader.skip(i + 1);
	//   81  152:aload_0         
	//   82  153:iload           7
	//   83  155:iconst_1        
	//   84  156:iadd            
	//   85  157:i2l             
	//   86  158:invokevirtual   #177 <Method long BufferedReader.skip(long)>
	//   87  161:pop2            
					if(flag)
	//*  88  162:iload           5
	//*  89  164:ifeq            175
						return JsonUtils.unescapeString(stringbuilder.toString());
	//   90  167:aload_2         
	//   91  168:invokevirtual   #206 <Method String StringBuilder.toString()>
	//   92  171:invokestatic    #470 <Method String JsonUtils.unescapeString(String)>
	//   93  174:areturn         
					else
						return stringbuilder.toString();
	//   94  175:aload_2         
	//   95  176:invokevirtual   #206 <Method String StringBuilder.toString()>
	//   96  179:areturn         
				}
				if(c == '\\')
	//*  97  180:iload           4
	//*  98  182:bipush          92
	//*  99  184:icmpne          199
				{
					flag1 ^= true;
	//  100  187:iload           6
	//  101  189:iconst_1        
	//  102  190:ixor            
	//  103  191:istore          6
					flag = true;
	//  104  193:iconst_1        
	//  105  194:istore          5
				} else
	//* 106  196:goto            202
				{
					flag1 = false;
	//  107  199:iconst_0        
	//  108  200:istore          6
				}
			}

	//  109  202:iload           7
	//  110  204:iconst_1        
	//  111  205:iadd            
	//  112  206:istore          7
	//* 113  208:goto            50
			stringbuilder.append(ac, 0, k);
	//  114  211:aload_2         
	//  115  212:aload_1         
	//  116  213:iconst_0        
	//  117  214:iload           9
	//  118  216:invokevirtual   #465 <Method StringBuilder StringBuilder.append(char[], int, int)>
	//  119  219:pop             
			bufferedreader.mark(ac.length);
	//  120  220:aload_0         
	//  121  221:aload_1         
	//  122  222:arraylength     
	//  123  223:invokevirtual   #158 <Method void BufferedReader.mark(int)>
			i = ((int) (flag));
	//  124  226:iload           5
	//  125  228:istore          7
			flag = flag1;
	//  126  230:iload           6
	//  127  232:istore          5
			flag1 = ((boolean) (i));
	//  128  234:iload           7
	//  129  236:istore          6
		} while(true);
	//  130  238:goto            18
		throw new ParseException("Unexpected EOF while parsing string");
	//  131  241:new             #7   <Class FastParser$ParseException>
	//  132  244:dup             
	//  133  245:ldc2            #459 <String "Unexpected EOF while parsing string">
	//  134  248:invokespecial   #147 <Method void FastParser$ParseException(String)>
	//  135  251:athrow          
	}

	private final void zzb(BufferedReader bufferedreader, char ac[])
		throws ParseException, IOException
	{
		int k;
		for(int i = 0; i < ac.length; i += k)
	//*   0    0:iconst_0        
	//*   1    1:istore_3        
	//*   2    2:iload_3         
	//*   3    3:aload_2         
	//*   4    4:arraylength     
	//*   5    5:icmpge          93
		{
			k = bufferedreader.read(zzwr, 0, ac.length - i);
	//    6    8:aload_1         
	//    7    9:aload_0         
	//    8   10:getfield        #113 <Field char[] zzwr>
	//    9   13:iconst_0        
	//   10   14:aload_2         
	//   11   15:arraylength     
	//   12   16:iload_3         
	//   13   17:isub            
	//   14   18:invokevirtual   #162 <Method int BufferedReader.read(char[], int, int)>
	//   15   21:istore          5
			if(k == -1)
	//*  16   23:iload           5
	//*  17   25:iconst_m1       
	//*  18   26:icmpne          39
				throw new ParseException("Unexpected EOF");
	//   19   29:new             #7   <Class FastParser$ParseException>
	//   20   32:dup             
	//   21   33:ldc1            #144 <String "Unexpected EOF">
	//   22   35:invokespecial   #147 <Method void FastParser$ParseException(String)>
	//   23   38:athrow          
			for(int j = 0; j < k; j++)
	//*  24   39:iconst_0        
	//*  25   40:istore          4
	//*  26   42:iload           4
	//*  27   44:iload           5
	//*  28   46:icmpge          85
				if(ac[j + i] != zzwr[j])
	//*  29   49:aload_2         
	//*  30   50:iload           4
	//*  31   52:iload_3         
	//*  32   53:iadd            
	//*  33   54:caload          
	//*  34   55:aload_0         
	//*  35   56:getfield        #113 <Field char[] zzwr>
	//*  36   59:iload           4
	//*  37   61:caload          
	//*  38   62:icmpeq          76
					throw new ParseException("Unexpected character");
	//   39   65:new             #7   <Class FastParser$ParseException>
	//   40   68:dup             
	//   41   69:ldc2            #472 <String "Unexpected character">
	//   42   72:invokespecial   #147 <Method void FastParser$ParseException(String)>
	//   43   75:athrow          

	//   44   76:iload           4
	//   45   78:iconst_1        
	//   46   79:iadd            
	//   47   80:istore          4
		}

	//   48   82:goto            42
	//   49   85:iload_3         
	//   50   86:iload           5
	//   51   88:iadd            
	//   52   89:istore_3        
	//*  53   90:goto            2
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
		int k1 = zza(bufferedreader, zzws);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_0         
	//    3    3:getfield        #115 <Field char[] zzws>
	//    4    6:invokespecial   #448 <Method int zza(BufferedReader, char[])>
	//    5    9:istore          7
		if(k1 == 0)
	//*   6   11:iload           7
	//*   7   13:ifne            18
			return 0;
	//    8   16:iconst_0        
	//    9   17:ireturn         
		bufferedreader = ((BufferedReader) (zzws));
	//   10   18:aload_0         
	//   11   19:getfield        #115 <Field char[] zzws>
	//   12   22:astore_1        
		if(k1 > 0)
	//*  13   23:iload           7
	//*  14   25:ifle            221
		{
			int i;
			int k;
			int l;
			if(bufferedreader[0] == '-')
	//*  15   28:aload_1         
	//*  16   29:iconst_0        
	//*  17   30:caload          
	//*  18   31:bipush          45
	//*  19   33:icmpne          49
			{
				l = 0x80000000;
	//   20   36:ldc2            #475 <Int 0x80000000>
	//   21   39:istore          5
				i = 1;
	//   22   41:iconst_1        
	//   23   42:istore_2        
				k = i;
	//   24   43:iload_2         
	//   25   44:istore          4
			} else
	//*  26   46:goto            60
			{
				k = 0;
	//   27   49:iconst_0        
	//   28   50:istore          4
				l = 0x80000001;
	//   29   52:ldc2            #476 <Int 0x80000001>
	//   30   55:istore          5
				i = k;
	//   31   57:iload           4
	//   32   59:istore_2        
			}
			int j;
			if(i < k1)
	//*  33   60:iload_2         
	//*  34   61:iload           7
	//*  35   63:icmpge          106
			{
				j = i + 1;
	//   36   66:iload_2         
	//   37   67:iconst_1        
	//   38   68:iadd            
	//   39   69:istore_3        
				i = Character.digit(bufferedreader[i], 10);
	//   40   70:aload_1         
	//   41   71:iload_2         
	//   42   72:caload          
	//   43   73:bipush          10
	//   44   75:invokestatic    #480 <Method int Character.digit(char, int)>
	//   45   78:istore_2        
				if(i < 0)
	//*  46   79:iload_2         
	//*  47   80:ifge            94
					throw new ParseException("Unexpected non-digit character");
	//   48   83:new             #7   <Class FastParser$ParseException>
	//   49   86:dup             
	//   50   87:ldc2            #482 <String "Unexpected non-digit character">
	//   51   90:invokespecial   #147 <Method void FastParser$ParseException(String)>
	//   52   93:athrow          
				int i1 = -i;
	//   53   94:iload_2         
	//   54   95:ineg            
	//   55   96:istore          6
				i = j;
	//   56   98:iload_3         
	//   57   99:istore_2        
				j = i1;
	//   58  100:iload           6
	//   59  102:istore_3        
			} else
	//*  60  103:goto            108
			{
				j = 0;
	//   61  106:iconst_0        
	//   62  107:istore_3        
			}
			for(; i < k1; i++)
	//*  63  108:iload_2         
	//*  64  109:iload           7
	//*  65  111:icmpge          195
			{
				int j1 = Character.digit(bufferedreader[i], 10);
	//   66  114:aload_1         
	//   67  115:iload_2         
	//   68  116:caload          
	//   69  117:bipush          10
	//   70  119:invokestatic    #480 <Method int Character.digit(char, int)>
	//   71  122:istore          6
				if(j1 < 0)
	//*  72  124:iload           6
	//*  73  126:ifge            140
					throw new ParseException("Unexpected non-digit character");
	//   74  129:new             #7   <Class FastParser$ParseException>
	//   75  132:dup             
	//   76  133:ldc2            #482 <String "Unexpected non-digit character">
	//   77  136:invokespecial   #147 <Method void FastParser$ParseException(String)>
	//   78  139:athrow          
				if(j < 0xf3333334)
	//*  79  140:iload_3         
	//*  80  141:ldc2            #483 <Int 0xf3333334>
	//*  81  144:icmpge          158
					throw new ParseException("Number too large");
	//   82  147:new             #7   <Class FastParser$ParseException>
	//   83  150:dup             
	//   84  151:ldc2            #485 <String "Number too large">
	//   85  154:invokespecial   #147 <Method void FastParser$ParseException(String)>
	//   86  157:athrow          
				j *= 10;
	//   87  158:iload_3         
	//   88  159:bipush          10
	//   89  161:imul            
	//   90  162:istore_3        
				if(j < l + j1)
	//*  91  163:iload_3         
	//*  92  164:iload           5
	//*  93  166:iload           6
	//*  94  168:iadd            
	//*  95  169:icmpge          183
					throw new ParseException("Number too large");
	//   96  172:new             #7   <Class FastParser$ParseException>
	//   97  175:dup             
	//   98  176:ldc2            #485 <String "Number too large">
	//   99  179:invokespecial   #147 <Method void FastParser$ParseException(String)>
	//  100  182:athrow          
				j -= j1;
	//  101  183:iload_3         
	//  102  184:iload           6
	//  103  186:isub            
	//  104  187:istore_3        
			}

	//  105  188:iload_2         
	//  106  189:iconst_1        
	//  107  190:iadd            
	//  108  191:istore_2        
	//* 109  192:goto            108
			if(k != 0)
	//* 110  195:iload           4
	//* 111  197:ifeq            218
			{
				if(i > 1)
	//* 112  200:iload_2         
	//* 113  201:iconst_1        
	//* 114  202:icmple          207
					return j;
	//  115  205:iload_3         
	//  116  206:ireturn         
				else
					throw new ParseException("No digits to parse");
	//  117  207:new             #7   <Class FastParser$ParseException>
	//  118  210:dup             
	//  119  211:ldc2            #487 <String "No digits to parse">
	//  120  214:invokespecial   #147 <Method void FastParser$ParseException(String)>
	//  121  217:athrow          
			} else
			{
				return -j;
	//  122  218:iload_3         
	//  123  219:ineg            
	//  124  220:ireturn         
			}
		} else
		{
			throw new ParseException("No number to parse");
	//  125  221:new             #7   <Class FastParser$ParseException>
	//  126  224:dup             
	//  127  225:ldc2            #489 <String "No number to parse">
	//  128  228:invokespecial   #147 <Method void FastParser$ParseException(String)>
	//  129  231:athrow          
		}
	}

	private final long zze(BufferedReader bufferedreader)
		throws ParseException, IOException
	{
		int k = zza(bufferedreader, zzws);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_0         
	//    3    3:getfield        #115 <Field char[] zzws>
	//    4    6:invokespecial   #448 <Method int zza(BufferedReader, char[])>
	//    5    9:istore          4
		if(k == 0)
	//*   6   11:iload           4
	//*   7   13:ifne            18
			return 0L;
	//    8   16:lconst_0        
	//    9   17:lreturn         
		bufferedreader = ((BufferedReader) (zzws));
	//   10   18:aload_0         
	//   11   19:getfield        #115 <Field char[] zzws>
	//   12   22:astore_1        
		if(k > 0)
	//*  13   23:iload           4
	//*  14   25:ifle            234
		{
			int i = 0;
	//   15   28:iconst_0        
	//   16   29:istore_2        
			long l2;
			if(bufferedreader[0] == '-')
	//*  17   30:aload_1         
	//*  18   31:iconst_0        
	//*  19   32:caload          
	//*  20   33:bipush          45
	//*  21   35:icmpne          48
			{
				l2 = 0x0L;
	//   22   38:ldc2w           #490 <Long 0x0L>
	//   23   41:lstore          8
				i = 1;
	//   24   43:iconst_1        
	//   25   44:istore_2        
			} else
	//*  26   45:goto            56
			{
				l2 = 0x1L;
	//   27   48:ldc2w           #492 <Long 0x1L>
	//   28   51:lstore          8
			}
	//*  29   53:goto            45
			int j;
			long l1;
			if(i < k)
	//*  30   56:iload_2         
	//*  31   57:iload           4
	//*  32   59:icmpge          101
			{
				j = i + 1;
	//   33   62:iload_2         
	//   34   63:iconst_1        
	//   35   64:iadd            
	//   36   65:istore_3        
				int l = Character.digit(bufferedreader[i], 10);
	//   37   66:aload_1         
	//   38   67:iload_2         
	//   39   68:caload          
	//   40   69:bipush          10
	//   41   71:invokestatic    #480 <Method int Character.digit(char, int)>
	//   42   74:istore          5
				if(l < 0)
	//*  43   76:iload           5
	//*  44   78:ifge            92
					throw new ParseException("Unexpected non-digit character");
	//   45   81:new             #7   <Class FastParser$ParseException>
	//   46   84:dup             
	//   47   85:ldc2            #482 <String "Unexpected non-digit character">
	//   48   88:invokespecial   #147 <Method void FastParser$ParseException(String)>
	//   49   91:athrow          
				l1 = -l;
	//   50   92:iload           5
	//   51   94:ineg            
	//   52   95:i2l             
	//   53   96:lstore          6
			} else
	//*  54   98:goto            106
			{
				l1 = 0L;
	//   55  101:lconst_0        
	//   56  102:lstore          6
				j = i;
	//   57  104:iload_2         
	//   58  105:istore_3        
			}
			while(j < k) 
	//*  59  106:iload_3         
	//*  60  107:iload           4
	//*  61  109:icmpge          207
			{
				int i1 = Character.digit(bufferedreader[j], 10);
	//   62  112:aload_1         
	//   63  113:iload_3         
	//   64  114:caload          
	//   65  115:bipush          10
	//   66  117:invokestatic    #480 <Method int Character.digit(char, int)>
	//   67  120:istore          5
				if(i1 < 0)
	//*  68  122:iload           5
	//*  69  124:ifge            138
					throw new ParseException("Unexpected non-digit character");
	//   70  127:new             #7   <Class FastParser$ParseException>
	//   71  130:dup             
	//   72  131:ldc2            #482 <String "Unexpected non-digit character">
	//   73  134:invokespecial   #147 <Method void FastParser$ParseException(String)>
	//   74  137:athrow          
				if(l1 < 0x33333334L)
	//*  75  138:lload           6
	//*  76  140:ldc2w           #494 <Long 0x33333334L>
	//*  77  143:lcmp            
	//*  78  144:ifge            158
					throw new ParseException("Number too large");
	//   79  147:new             #7   <Class FastParser$ParseException>
	//   80  150:dup             
	//   81  151:ldc2            #485 <String "Number too large">
	//   82  154:invokespecial   #147 <Method void FastParser$ParseException(String)>
	//   83  157:athrow          
				l1 *= 10L;
	//   84  158:lload           6
	//   85  160:ldc2w           #496 <Long 10L>
	//   86  163:lmul            
	//   87  164:lstore          6
				long l3 = i1;
	//   88  166:iload           5
	//   89  168:i2l             
	//   90  169:lstore          10
				if(l1 < l2 + l3)
	//*  91  171:lload           6
	//*  92  173:lload           8
	//*  93  175:lload           10
	//*  94  177:ladd            
	//*  95  178:lcmp            
	//*  96  179:ifge            193
					throw new ParseException("Number too large");
	//   97  182:new             #7   <Class FastParser$ParseException>
	//   98  185:dup             
	//   99  186:ldc2            #485 <String "Number too large">
	//  100  189:invokespecial   #147 <Method void FastParser$ParseException(String)>
	//  101  192:athrow          
				j++;
	//  102  193:iload_3         
	//  103  194:iconst_1        
	//  104  195:iadd            
	//  105  196:istore_3        
				l1 -= l3;
	//  106  197:lload           6
	//  107  199:lload           10
	//  108  201:lsub            
	//  109  202:lstore          6
			}
	//* 110  204:goto            106
			if(i != 0)
	//* 111  207:iload_2         
	//* 112  208:ifeq            230
			{
				if(j > 1)
	//* 113  211:iload_3         
	//* 114  212:iconst_1        
	//* 115  213:icmple          219
					return l1;
	//  116  216:lload           6
	//  117  218:lreturn         
				else
					throw new ParseException("No digits to parse");
	//  118  219:new             #7   <Class FastParser$ParseException>
	//  119  222:dup             
	//  120  223:ldc2            #487 <String "No digits to parse">
	//  121  226:invokespecial   #147 <Method void FastParser$ParseException(String)>
	//  122  229:athrow          
			} else
			{
				return -l1;
	//  123  230:lload           6
	//  124  232:lneg            
	//  125  233:lreturn         
			}
		} else
		{
			throw new ParseException("No number to parse");
	//  126  234:new             #7   <Class FastParser$ParseException>
	//  127  237:dup             
	//  128  238:ldc2            #489 <String "No number to parse">
	//  129  241:invokespecial   #147 <Method void FastParser$ParseException(String)>
	//  130  244:athrow          
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
	//   12   20:new             #310 <Class String>
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
	//   10   16:new             #310 <Class String>
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
	//   10   16:new             #310 <Class String>
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
	//   12   20:new             #310 <Class String>
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
	//*  12   20:invokestatic    #180 <Method boolean Character.isWhitespace(char)>
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
		if(zzxb.isEmpty())
	//*   0    0:aload_0         
	//*   1    1:getfield        #129 <Field Stack zzxb>
	//*   2    4:invokevirtual   #524 <Method boolean Stack.isEmpty()>
	//*   3    7:ifeq            54
		{
			StringBuilder stringbuilder = new StringBuilder(46);
	//    4   10:new             #117 <Class StringBuilder>
	//    5   13:dup             
	//    6   14:bipush          46
	//    7   16:invokespecial   #120 <Method void StringBuilder(int)>
	//    8   19:astore_3        
			stringbuilder.append("Expected state ");
	//    9   20:aload_3         
	//   10   21:ldc2            #526 <String "Expected state ">
	//   11   24:invokevirtual   #199 <Method StringBuilder StringBuilder.append(String)>
	//   12   27:pop             
			stringbuilder.append(i);
	//   13   28:aload_3         
	//   14   29:iload_1         
	//   15   30:invokevirtual   #282 <Method StringBuilder StringBuilder.append(int)>
	//   16   33:pop             
			stringbuilder.append(" but had empty stack");
	//   17   34:aload_3         
	//   18   35:ldc2            #528 <String " but had empty stack">
	//   19   38:invokevirtual   #199 <Method StringBuilder StringBuilder.append(String)>
	//   20   41:pop             
			throw new ParseException(stringbuilder.toString());
	//   21   42:new             #7   <Class FastParser$ParseException>
	//   22   45:dup             
	//   23   46:aload_3         
	//   24   47:invokevirtual   #206 <Method String StringBuilder.toString()>
	//   25   50:invokespecial   #147 <Method void FastParser$ParseException(String)>
	//   26   53:athrow          
		}
		int j = ((Integer)zzxb.pop()).intValue();
	//   27   54:aload_0         
	//   28   55:getfield        #129 <Field Stack zzxb>
	//   29   58:invokevirtual   #532 <Method Object Stack.pop()>
	//   30   61:checkcast       #185 <Class Integer>
	//   31   64:invokevirtual   #535 <Method int Integer.intValue()>
	//   32   67:istore_2        
		if(j != i)
	//*  33   68:iload_2         
	//*  34   69:iload_1         
	//*  35   70:icmpeq          123
		{
			StringBuilder stringbuilder1 = new StringBuilder(46);
	//   36   73:new             #117 <Class StringBuilder>
	//   37   76:dup             
	//   38   77:bipush          46
	//   39   79:invokespecial   #120 <Method void StringBuilder(int)>
	//   40   82:astore_3        
			stringbuilder1.append("Expected state ");
	//   41   83:aload_3         
	//   42   84:ldc2            #526 <String "Expected state ">
	//   43   87:invokevirtual   #199 <Method StringBuilder StringBuilder.append(String)>
	//   44   90:pop             
			stringbuilder1.append(i);
	//   45   91:aload_3         
	//   46   92:iload_1         
	//   47   93:invokevirtual   #282 <Method StringBuilder StringBuilder.append(int)>
	//   48   96:pop             
			stringbuilder1.append(" but had ");
	//   49   97:aload_3         
	//   50   98:ldc2            #537 <String " but had ">
	//   51  101:invokevirtual   #199 <Method StringBuilder StringBuilder.append(String)>
	//   52  104:pop             
			stringbuilder1.append(j);
	//   53  105:aload_3         
	//   54  106:iload_2         
	//   55  107:invokevirtual   #282 <Method StringBuilder StringBuilder.append(int)>
	//   56  110:pop             
			throw new ParseException(stringbuilder1.toString());
	//   57  111:new             #7   <Class FastParser$ParseException>
	//   58  114:dup             
	//   59  115:aload_3         
	//   60  116:invokevirtual   #206 <Method String StringBuilder.toString()>
	//   61  119:invokespecial   #147 <Method void FastParser$ParseException(String)>
	//   62  122:athrow          
		} else
		{
			return;
	//   63  123:return          
		}
	}

	public void parse(InputStream inputstream, FastJsonResponse fastjsonresponse)
		throws ParseException
	{
		inputstream = ((InputStream) (new BufferedReader(((java.io.Reader) (new InputStreamReader(inputstream))), 1024)));
	//    0    0:new             #155 <Class BufferedReader>
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
		if(c == '[')
			break MISSING_BLOCK_LABEL_110;
	//   21   41:iload_3         
	//   22   42:bipush          91
	//   23   44:icmpeq          110
		if(c == '{')
			break MISSING_BLOCK_LABEL_88;
	//   24   47:iload_3         
	//   25   48:bipush          123
	//   26   50:icmpeq          88
		fastjsonresponse = ((FastJsonResponse) (new StringBuilder(19)));
	//   27   53:new             #117 <Class StringBuilder>
	//   28   56:dup             
	//   29   57:bipush          19
	//   30   59:invokespecial   #120 <Method void StringBuilder(int)>
	//   31   62:astore_2        
		((StringBuilder) (fastjsonresponse)).append("Unexpected token: ");
	//   32   63:aload_2         
	//   33   64:ldc1            #195 <String "Unexpected token: ">
	//   34   66:invokevirtual   #199 <Method StringBuilder StringBuilder.append(String)>
	//   35   69:pop             
		((StringBuilder) (fastjsonresponse)).append(c);
	//   36   70:aload_2         
	//   37   71:iload_3         
	//   38   72:invokevirtual   #202 <Method StringBuilder StringBuilder.append(char)>
	//   39   75:pop             
		throw new ParseException(((StringBuilder) (fastjsonresponse)).toString());
	//   40   76:new             #7   <Class FastParser$ParseException>
	//   41   79:dup             
	//   42   80:aload_2         
	//   43   81:invokevirtual   #206 <Method String StringBuilder.toString()>
	//   44   84:invokespecial   #147 <Method void FastParser$ParseException(String)>
	//   45   87:athrow          
		zzxb.push(((Object) (Integer.valueOf(1))));
	//   46   88:aload_0         
	//   47   89:getfield        #129 <Field Stack zzxb>
	//   48   92:iconst_1        
	//   49   93:invokestatic    #189 <Method Integer Integer.valueOf(int)>
	//   50   96:invokevirtual   #193 <Method Object Stack.push(Object)>
	//   51   99:pop             
		zza(((BufferedReader) (inputstream)), fastjsonresponse);
	//   52  100:aload_0         
	//   53  101:aload_1         
	//   54  102:aload_2         
	//   55  103:invokespecial   #233 <Method boolean zza(BufferedReader, FastJsonResponse)>
	//   56  106:pop             
		break MISSING_BLOCK_LABEL_202;
	//   57  107:goto            202
		zzxb.push(((Object) (Integer.valueOf(5))));
	//   58  110:aload_0         
	//   59  111:getfield        #129 <Field Stack zzxb>
	//   60  114:iconst_5        
	//   61  115:invokestatic    #189 <Method Integer Integer.valueOf(int)>
	//   62  118:invokevirtual   #193 <Method Object Stack.push(Object)>
	//   63  121:pop             
		Object obj = ((Object) (fastjsonresponse.getFieldMappings()));
	//   64  122:aload_2         
	//   65  123:invokevirtual   #264 <Method Map FastJsonResponse.getFieldMappings()>
	//   66  126:astore          4
		if(((Map) (obj)).size() != 1)
	//*  67  128:aload           4
	//*  68  130:invokeinterface #550 <Method int Map.size()>
	//*  69  135:iconst_1        
	//*  70  136:icmpeq          150
			throw new ParseException("Object array response class must have a single Field");
	//   71  139:new             #7   <Class FastParser$ParseException>
	//   72  142:dup             
	//   73  143:ldc2            #552 <String "Object array response class must have a single Field">
	//   74  146:invokespecial   #147 <Method void FastParser$ParseException(String)>
	//   75  149:athrow          
		obj = ((Object) ((FastJsonResponse.Field)((java.util.Map.Entry)((Map) (obj)).entrySet().iterator().next()).getValue()));
	//   76  150:aload           4
	//   77  152:invokeinterface #556 <Method Set Map.entrySet()>
	//   78  157:invokeinterface #562 <Method Iterator Set.iterator()>
	//   79  162:invokeinterface #567 <Method Object Iterator.next()>
	//   80  167:checkcast       #569 <Class java.util.Map$Entry>
	//   81  170:invokeinterface #572 <Method Object java.util.Map$Entry.getValue()>
	//   82  175:checkcast       #226 <Class FastJsonResponse$Field>
	//   83  178:astore          4
		ArrayList arraylist = zza(((BufferedReader) (inputstream)), ((FastJsonResponse.Field) (obj)));
	//   84  180:aload_0         
	//   85  181:aload_1         
	//   86  182:aload           4
	//   87  184:invokespecial   #297 <Method ArrayList zza(BufferedReader, FastJsonResponse$Field)>
	//   88  187:astore          5
		fastjsonresponse.addConcreteTypeArrayInternal(((FastJsonResponse.Field) (obj)), ((FastJsonResponse.Field) (obj)).getOutputFieldName(), arraylist);
	//   89  189:aload_2         
	//   90  190:aload           4
	//   91  192:aload           4
	//   92  194:invokevirtual   #289 <Method String FastJsonResponse$Field.getOutputFieldName()>
	//   93  197:aload           5
	//   94  199:invokevirtual   #293 <Method void FastJsonResponse.addConcreteTypeArrayInternal(FastJsonResponse$Field, String, ArrayList)>
		zzk(0);
	//   95  202:aload_0         
	//   96  203:iconst_0        
	//   97  204:invokespecial   #209 <Method void zzk(int)>
		try
		{
			((BufferedReader) (inputstream)).close();
	//   98  207:aload_1         
	//   99  208:invokevirtual   #575 <Method void BufferedReader.close()>
			return;
	//  100  211:return          
		}
	//* 101  212:ldc2            #577 <String "FastParser">
	//* 102  215:ldc2            #579 <String "Failed to close reader while parsing.">
	//* 103  218:invokestatic    #585 <Method int Log.w(String, String)>
	//* 104  221:pop             
	//* 105  222:return          
	//* 106  223:new             #7   <Class FastParser$ParseException>
	//* 107  226:dup             
	//* 108  227:ldc2            #587 <String "No data to parse">
	//* 109  230:invokespecial   #147 <Method void FastParser$ParseException(String)>
	//* 110  233:athrow          
	//* 111  234:astore_2        
	//* 112  235:goto            248
	//* 113  238:astore_2        
	//* 114  239:new             #7   <Class FastParser$ParseException>
	//* 115  242:dup             
	//* 116  243:aload_2         
	//* 117  244:invokespecial   #590 <Method void FastParser$ParseException(Throwable)>
	//* 118  247:athrow          
	//* 119  248:aload_1         
	//* 120  249:invokevirtual   #575 <Method void BufferedReader.close()>
	//* 121  252:goto            265
	//* 122  255:ldc2            #577 <String "FastParser">
	//* 123  258:ldc2            #579 <String "Failed to close reader while parsing.">
	//* 124  261:invokestatic    #585 <Method int Log.w(String, String)>
	//* 125  264:pop             
	//* 126  265:aload_2         
	//* 127  266:athrow          
		// Misplaced declaration of an exception variable
		catch(InputStream inputstream)
		{
			Log.w("FastParser", "Failed to close reader while parsing.");
		}
		return;
		try
		{
			throw new ParseException("No data to parse");
		}
		// Misplaced declaration of an exception variable
		catch(FastJsonResponse fastjsonresponse) { }
		break MISSING_BLOCK_LABEL_239;
		fastjsonresponse;
		break MISSING_BLOCK_LABEL_248;
		throw new ParseException(((Throwable) (fastjsonresponse)));
		try
		{
			((BufferedReader) (inputstream)).close();
		}
	//* 128  267:astore_1        
	//* 129  268:goto            212
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
	//*  13   23:ldc2            #577 <String "FastParser">
	//*  14   26:ldc2            #606 <String "Failed to close the input stream while parsing.">
	//*  15   29:invokestatic    #585 <Method int Log.w(String, String)>
	//*  16   32:pop             
	//*  17   33:return          
	//*  18   34:astore_2        
	//*  19   35:aload_1         
	//*  20   36:invokevirtual   #604 <Method void ByteArrayInputStream.close()>
	//*  21   39:goto            52
	//*  22   42:ldc2            #577 <String "FastParser">
	//*  23   45:ldc2            #606 <String "Failed to close the input stream while parsing.">
	//*  24   48:invokestatic    #585 <Method int Log.w(String, String)>
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

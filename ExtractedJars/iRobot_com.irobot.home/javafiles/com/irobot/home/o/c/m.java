// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.o.c;

import com.irobot.core.Error;
import com.irobot.home.core.c;
import java.io.*;
import java.net.HttpURLConnection;
import java.util.HashMap;

// Referenced classes of package com.irobot.home.o.c:
//			e, q, m

abstract class m extends e
{

	public m(HashMap hashmap)
	{
		super(hashmap);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #10  <Method void e(HashMap)>
	//    3    5:return          
	}

	private static String a(InputStream inputstream)
	{
		BufferedReader bufferedreader = new BufferedReader(((java.io.Reader) (new InputStreamReader(inputstream, "UTF-8"))));
	//    0    0:new             #17  <Class BufferedReader>
	//    1    3:dup             
	//    2    4:new             #19  <Class InputStreamReader>
	//    3    7:dup             
	//    4    8:aload_0         
	//    5    9:ldc1            #21  <String "UTF-8">
	//    6   11:invokespecial   #24  <Method void InputStreamReader(InputStream, String)>
	//    7   14:invokespecial   #27  <Method void BufferedReader(java.io.Reader)>
	//    8   17:astore_2        
		inputstream = ((InputStream) (new StringBuilder(inputstream.available())));
	//    9   18:new             #29  <Class StringBuilder>
	//   10   21:dup             
	//   11   22:aload_0         
	//   12   23:invokevirtual   #35  <Method int InputStream.available()>
	//   13   26:invokespecial   #38  <Method void StringBuilder(int)>
	//   14   29:astore_0        
		char ac[] = new char[256];
	//   15   30:sipush          256
	//   16   33:newarray        char[]
	//   17   35:astore_3        
		do
		{
			int i = bufferedreader.read(ac);
	//   18   36:aload_2         
	//   19   37:aload_3         
	//   20   38:invokevirtual   #42  <Method int BufferedReader.read(char[])>
	//   21   41:istore_1        
			if(i == -1)
	//*  22   42:iload_1         
	//*  23   43:iconst_m1       
	//*  24   44:icmpne          52
				return ((StringBuilder) (inputstream)).toString();
	//   25   47:aload_0         
	//   26   48:invokevirtual   #46  <Method String StringBuilder.toString()>
	//   27   51:areturn         
			((StringBuilder) (inputstream)).append(ac, 0, i);
	//   28   52:aload_0         
	//   29   53:aload_3         
	//   30   54:iconst_0        
	//   31   55:iload_1         
	//   32   56:invokevirtual   #50  <Method StringBuilder StringBuilder.append(char[], int, int)>
	//   33   59:pop             
		} while(true);
	//   34   60:goto            36
	}

	static void a(m m1, String s, String s1, String s2, boolean flag, String s3, int i, n.a a1)
	{
		m1.b(s, s1, s2, flag, s3, i, a1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:iload           4
	//    5    6:aload           5
	//    6    8:iload           6
	//    7   10:aload           7
	//    8   12:invokespecial   #55  <Method void b(String, String, String, boolean, String, int, n$a)>
	//    9   15:return          
	}

	private void b(String s, String s1, String s2, boolean flag, String s3, int i, n.a a1)
	{
		long l = System.currentTimeMillis();
	//    0    0:invokestatic    #63  <Method long System.currentTimeMillis()>
	//    1    3:lstore          9
		s = ((String) (a(s, s1, s3, i)));
	//    2    5:aload_0         
	//    3    6:aload_1         
	//    4    7:aload_2         
	//    5    8:aload           5
	//    6   10:iload           6
	//    7   12:invokevirtual   #66  <Method HttpURLConnection a(String, String, String, int)>
	//    8   15:astore_1        
		i = ((HttpURLConnection) (s)).getResponseCode();
	//    9   16:aload_1         
	//   10   17:invokevirtual   #71  <Method int HttpURLConnection.getResponseCode()>
	//   11   20:istore          6
		int j;
		Object obj;
		obj = ((Object) (s));
	//   12   22:aload_1         
	//   13   23:astore          11
		j = i;
	//   14   25:iload           6
	//   15   27:istore          8
		String s4 = a(((HttpURLConnection) (s)).getInputStream());
	//   16   29:aload_1         
	//   17   30:invokevirtual   #75  <Method InputStream HttpURLConnection.getInputStream()>
	//   18   33:invokestatic    #77  <Method String a(InputStream)>
	//   19   36:astore          12
		s2 = "UNKNOWN";
	//   20   38:ldc1            #79  <String "UNKNOWN">
	//   21   40:astore_3        
		if(s != null)
	//*  22   41:aload_1         
	//*  23   42:ifnull          54
		{
			s2 = ((HttpURLConnection) (s)).getRequestMethod();
	//   24   45:aload_1         
	//   25   46:invokevirtual   #82  <Method String HttpURLConnection.getRequestMethod()>
	//   26   49:astore_3        
			((HttpURLConnection) (s)).disconnect();
	//   27   50:aload_1         
	//   28   51:invokevirtual   #86  <Method void HttpURLConnection.disconnect()>
		}
		a("NetSessionHttpURLConn", s1, s3, s4, l, System.currentTimeMillis());
	//   29   54:ldc1            #88  <String "NetSessionHttpURLConn">
	//   30   56:aload_2         
	//   31   57:aload           5
	//   32   59:aload           12
	//   33   61:lload           9
	//   34   63:invokestatic    #63  <Method long System.currentTimeMillis()>
	//   35   66:invokestatic    #91  <Method void a(String, String, String, String, long, long)>
		if(a1 != null)
	//*  36   69:aload           7
	//*  37   71:ifnull          340
		{
			a1.a(s2, i, s4, ((Error) (null)));
	//   38   74:aload           7
	//   39   76:aload_3         
	//   40   77:iload           6
	//   41   79:aload           12
	//   42   81:aconst_null     
	//   43   82:invokeinterface #96  <Method void n$a.a(String, int, String, Error)>
			return;
	//   44   87:return          
		}
		  goto _L1
		s2;
	//   45   88:astore_3        
		s = null;
	//   46   89:aconst_null     
	//   47   90:astore_1        
		i = j;
	//   48   91:iload           8
	//   49   93:istore          6
_L10:
		s4 = s2;
	//   50   95:aload_3         
	//   51   96:astore          12
		s2 = ((String) (obj));
	//   52   98:aload           11
	//   53  100:astore_3        
		obj = ((Object) (s4));
	//   54  101:aload           12
	//   55  103:astore          11
		  goto _L2
	//*  56  105:goto            351
		s2;
	//   57  108:astore_3        
		  goto _L3
	//*  58  109:goto            150
		obj;
	//   59  112:astore          11
		s2 = s;
	//   60  114:aload_1         
	//   61  115:astore_3        
		s = ((String) (obj));
	//   62  116:aload           11
	//   63  118:astore_1        
		  goto _L4
	//*  64  119:goto            129
		s2;
	//   65  122:astore_3        
		  goto _L5
	//*  66  123:goto            147
		s;
	//   67  126:astore_1        
		s2 = null;
	//   68  127:aconst_null     
	//   69  128:astore_3        
_L4:
		s4 = null;
	//   70  129:aconst_null     
	//   71  130:astore          12
		i = -1;
	//   72  132:iconst_m1       
	//   73  133:istore          6
		obj = ((Object) (s));
	//   74  135:aload_1         
	//   75  136:astore          11
		s = s4;
	//   76  138:aload           12
	//   77  140:astore_1        
		  goto _L2
	//*  78  141:goto            351
		s2;
	//   79  144:astore_3        
		s = null;
	//   80  145:aconst_null     
	//   81  146:astore_1        
_L5:
		i = -1;
	//   82  147:iconst_m1       
	//   83  148:istore          6
_L3:
		if(s == null) goto _L7; else goto _L6
	//   84  150:aload_1         
	//   85  151:ifnull          190
_L6:
		obj = ((Object) (s));
	//   86  154:aload_1         
	//   87  155:astore          11
		j = i;
	//   88  157:iload           6
	//   89  159:istore          8
		if(((HttpURLConnection) (s)).getErrorStream() == null) goto _L7; else goto _L8
	//   90  161:aload_1         
	//   91  162:invokevirtual   #99  <Method InputStream HttpURLConnection.getErrorStream()>
	//   92  165:ifnull          190
_L8:
		obj = ((Object) (s));
	//   93  168:aload_1         
	//   94  169:astore          11
		j = i;
	//   95  171:iload           6
	//   96  173:istore          8
		s4 = a(((HttpURLConnection) (s)).getErrorStream());
	//   97  175:aload_1         
	//   98  176:invokevirtual   #99  <Method InputStream HttpURLConnection.getErrorStream()>
	//   99  179:invokestatic    #77  <Method String a(InputStream)>
	//  100  182:astore          12
		s2 = s4;
	//  101  184:aload           12
	//  102  186:astore_3        
		  goto _L9
	//* 103  187:goto            221
_L7:
		obj = ((Object) (s));
	//  104  190:aload_1         
	//  105  191:astore          11
		j = i;
	//  106  193:iload           6
	//  107  195:istore          8
		s4 = ((IOException) (s2)).getMessage();
	//  108  197:aload_3         
	//  109  198:invokevirtual   #102 <Method String IOException.getMessage()>
	//  110  201:astore          12
		s2 = s4;
	//  111  203:aload           12
	//  112  205:astore_3        
		  goto _L9
	//* 113  206:goto            221
_L11:
		obj = ((Object) (s));
	//  114  209:aload_1         
	//  115  210:astore          11
		j = i;
	//  116  212:iload           6
	//  117  214:istore          8
		s2 = ((IOException) (s2)).getMessage();
	//  118  216:aload_3         
	//  119  217:invokevirtual   #102 <Method String IOException.getMessage()>
	//  120  220:astore_3        
_L9:
		obj = ((Object) (s));
	//  121  221:aload_1         
	//  122  222:astore          11
		j = i;
	//  123  224:iload           6
	//  124  226:istore          8
		s4 = String.format("statusCode: %d, errorMessage: %s", new Object[] {
			Integer.valueOf(i), s2
		});
	//  125  228:ldc1            #104 <String "statusCode: %d, errorMessage: %s">
	//  126  230:iconst_2        
	//  127  231:anewarray       Object[]
	//  128  234:dup             
	//  129  235:iconst_0        
	//  130  236:iload           6
	//  131  238:invokestatic    #112 <Method Integer Integer.valueOf(int)>
	//  132  241:aastore         
	//  133  242:dup             
	//  134  243:iconst_1        
	//  135  244:aload_3         
	//  136  245:aastore         
	//  137  246:invokestatic    #118 <Method String String.format(String, Object[])>
	//  138  249:astore          12
		j = a(i);
	//  139  251:aload_0         
	//  140  252:iload           6
	//  141  254:invokevirtual   #121 <Method int a(int)>
	//  142  257:istore          8
		if(s2 == null)
	//* 143  259:aload_3         
	//* 144  260:ifnonnull       409
			obj = "";
	//  145  263:ldc1            #123 <String "">
	//  146  265:astore          11
		else
	//* 147  267:goto            270
	//* 148  270:iload           8
	//* 149  272:aload           11
	//* 150  274:new             #57  <Class IOException>
	//* 151  277:dup             
	//* 152  278:aload_3         
	//* 153  279:invokespecial   #126 <Method void IOException(String)>
	//* 154  282:invokestatic    #131 <Method HashMap c.a(Throwable)>
	//* 155  285:invokestatic    #137 <Method Error Error.create(int, String, HashMap)>
	//* 156  288:astore          11
	//* 157  290:ldc1            #79  <String "UNKNOWN">
	//* 158  292:astore_3        
	//* 159  293:aload_1         
	//* 160  294:ifnull          306
	//* 161  297:aload_1         
	//* 162  298:invokevirtual   #82  <Method String HttpURLConnection.getRequestMethod()>
	//* 163  301:astore_3        
	//* 164  302:aload_1         
	//* 165  303:invokevirtual   #86  <Method void HttpURLConnection.disconnect()>
	//* 166  306:ldc1            #88  <String "NetSessionHttpURLConn">
	//* 167  308:aload_2         
	//* 168  309:aload           5
	//* 169  311:aload           12
	//* 170  313:lload           9
	//* 171  315:invokestatic    #63  <Method long System.currentTimeMillis()>
	//* 172  318:invokestatic    #91  <Method void a(String, String, String, String, long, long)>
	//* 173  321:aload           7
	//* 174  323:ifnull          340
	//* 175  326:aload           7
	//* 176  328:aload_3         
	//* 177  329:iload           6
	//* 178  331:aload           12
	//* 179  333:aload           11
	//* 180  335:invokeinterface #96  <Method void n$a.a(String, int, String, Error)>
	//* 181  340:return          
	//* 182  341:astore_3        
	//* 183  342:aload_1         
	//* 184  343:astore          11
	//* 185  345:aload           12
	//* 186  347:astore_1        
	//* 187  348:goto            95
	//* 188  351:ldc1            #79  <String "UNKNOWN">
	//* 189  353:astore          12
	//* 190  355:aload_3         
	//* 191  356:ifnull          369
	//* 192  359:aload_3         
	//* 193  360:invokevirtual   #82  <Method String HttpURLConnection.getRequestMethod()>
	//* 194  363:astore          12
	//* 195  365:aload_3         
	//* 196  366:invokevirtual   #86  <Method void HttpURLConnection.disconnect()>
	//* 197  369:ldc1            #88  <String "NetSessionHttpURLConn">
	//* 198  371:aload_2         
	//* 199  372:aload           5
	//* 200  374:aload_1         
	//* 201  375:lload           9
	//* 202  377:invokestatic    #63  <Method long System.currentTimeMillis()>
	//* 203  380:invokestatic    #91  <Method void a(String, String, String, String, long, long)>
	//* 204  383:aload           7
	//* 205  385:ifnull          401
	//* 206  388:aload           7
	//* 207  390:aload           12
	//* 208  392:iload           6
	//* 209  394:aload_1         
	//* 210  395:aconst_null     
	//* 211  396:invokeinterface #96  <Method void n$a.a(String, int, String, Error)>
	//* 212  401:aload           11
	//* 213  403:athrow          
	//* 214  404:astore          11
	//* 215  406:goto            209
			obj = ((Object) (s2));
	//  216  409:aload_3         
	//  217  410:astore          11
		obj = ((Object) (Error.create(j, ((String) (obj)), c.a(((Throwable) (new IOException(s2)))))));
		s2 = "UNKNOWN";
		if(s != null)
		{
			s2 = ((HttpURLConnection) (s)).getRequestMethod();
			((HttpURLConnection) (s)).disconnect();
		}
		a("NetSessionHttpURLConn", s1, s3, s4, l, System.currentTimeMillis());
		if(a1 != null)
			a1.a(s2, i, s4, ((Error) (obj)));
_L1:
		return;
		s2;
		obj = ((Object) (s));
		s = s4;
		  goto _L10
_L2:
		String s5 = "UNKNOWN";
		if(s2 != null)
		{
			s5 = ((HttpURLConnection) (s2)).getRequestMethod();
			((HttpURLConnection) (s2)).disconnect();
		}
		a("NetSessionHttpURLConn", s1, s3, s, l, System.currentTimeMillis());
		if(a1 != null)
			a1.a(s5, i, s, ((Error) (null)));
		throw obj;
		obj;
		  goto _L11
	//* 218  412:goto            270
	}

	public int a(int i)
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public abstract HttpURLConnection a(String s, String s1, String s2, int i);

	public void a()
	{
		f().a();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #141 <Method q f()>
	//    2    4:invokevirtual   #145 <Method void q.a()>
	//    3    7:return          
	}

	public void a(String s, String s1, String s2, boolean flag, String s3, int i, n.a a1)
	{
		f().a(((q.a) (new com.mixpanel.android.mpmetrics.u.a(this, flag, s2, s, s1, s3, i, a1) {

			public void a()
			{
				android.os.Message message = com.mixpanel.android.b.m.a(a).obtainMessage(4);
			//    0    0:aload_0         
			//    1    1:getfield        #16  <Field m a>
			//    2    4:invokestatic    #23  <Method m$f m.a(m)>
			//    3    7:iconst_4        
			//    4    8:invokevirtual   #29  <Method android.os.Message m$f.obtainMessage(int)>
			//    5   11:astore_1        
				com.mixpanel.android.b.m.a(a).sendMessage(message);
			//    6   12:aload_0         
			//    7   13:getfield        #16  <Field m a>
			//    8   16:invokestatic    #23  <Method m$f m.a(m)>
			//    9   19:aload_1         
			//   10   20:invokevirtual   #33  <Method boolean m$f.sendMessage(android.os.Message)>
			//   11   23:pop             
			//   12   24:return          
			}

			final m a;

			
			{
				a = m1;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field m a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
		}
)));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #141 <Method q f()>
	//    2    4:new             #6   <Class m$1>
	//    3    7:dup             
	//    4    8:aload_0         
	//    5    9:iload           4
	//    6   11:aload_3         
	//    7   12:aload_1         
	//    8   13:aload_2         
	//    9   14:aload           5
	//   10   16:iload           6
	//   11   18:aload           7
	//   12   20:invokespecial   #148 <Method void m$1(m, boolean, String, String, String, String, int, n$a)>
	//   13   23:invokevirtual   #151 <Method void q.a(q$a)>
	//   14   26:return          
	}

	public void a(HashMap hashmap)
	{
	//    0    0:return          
	}
}

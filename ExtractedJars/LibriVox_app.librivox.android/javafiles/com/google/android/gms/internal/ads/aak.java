// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zy, aag, bwk, zv, 
//			zz

public final class aak
	implements zy
{

	public aak()
	{
		this(((String) (null)));
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:invokespecial   #14  <Method void aak(String)>
	//    3    5:return          
	}

	public aak(String s)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
		a = s;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #19  <Field String a>
	//    5    9:return          
	}

	public final void a(String s)
	{
		Object obj;
		obj = ((Object) (String.valueOf(((Object) (s)))));
	//    0    0:aload_1         
	//    1    1:invokestatic    #31  <Method String String.valueOf(Object)>
	//    2    4:astore_3        
		if(((String) (obj)).length() != 0)
	//*   3    5:aload_3         
	//*   4    6:invokevirtual   #35  <Method int String.length()>
	//*   5    9:ifeq            22
		{
			obj = ((Object) ("Pinging URL: ".concat(((String) (obj)))));
	//    6   12:ldc1            #37  <String "Pinging URL: ">
	//    7   14:aload_3         
	//    8   15:invokevirtual   #41  <Method String String.concat(String)>
	//    9   18:astore_3        
			break MISSING_BLOCK_LABEL_32;
	//   10   19:goto            32
		}
		obj = ((Object) (new String("Pinging URL: ")));
	//   11   22:new             #27  <Class String>
	//   12   25:dup             
	//   13   26:ldc1            #37  <String "Pinging URL: ">
	//   14   28:invokespecial   #42  <Method void String(String)>
	//   15   31:astore_3        
		aag.b(((String) (obj)));
	//   16   32:aload_3         
	//   17   33:invokestatic    #47  <Method void aag.b(String)>
		obj = ((Object) ((HttpURLConnection)(new URL(s)).openConnection()));
	//   18   36:new             #49  <Class URL>
	//   19   39:dup             
	//   20   40:aload_1         
	//   21   41:invokespecial   #50  <Method void URL(String)>
	//   22   44:invokevirtual   #54  <Method java.net.URLConnection URL.openConnection()>
	//   23   47:checkcast       #56  <Class HttpURLConnection>
	//   24   50:astore_3        
		int i;
		bwk.a();
	//   25   51:invokestatic    #61  <Method zv bwk.a()>
	//   26   54:pop             
		zv.a(true, ((HttpURLConnection) (obj)), a);
	//   27   55:iconst_1        
	//   28   56:aload_3         
	//   29   57:aload_0         
	//   30   58:getfield        #19  <Field String a>
	//   31   61:invokestatic    #66  <Method void zv.a(boolean, HttpURLConnection, String)>
		zz zz1 = new zz();
	//   32   64:new             #68  <Class zz>
	//   33   67:dup             
	//   34   68:invokespecial   #69  <Method void zz()>
	//   35   71:astore          4
		zz1.a(((HttpURLConnection) (obj)), ((byte []) (null)));
	//   36   73:aload           4
	//   37   75:aload_3         
	//   38   76:aconst_null     
	//   39   77:invokevirtual   #72  <Method void zz.a(HttpURLConnection, byte[])>
		i = ((HttpURLConnection) (obj)).getResponseCode();
	//   40   80:aload_3         
	//   41   81:invokevirtual   #75  <Method int HttpURLConnection.getResponseCode()>
	//   42   84:istore_2        
		zz1.a(((HttpURLConnection) (obj)), i);
	//   43   85:aload           4
	//   44   87:aload_3         
	//   45   88:iload_2         
	//   46   89:invokevirtual   #78  <Method void zz.a(HttpURLConnection, int)>
		if(i >= 200 && i < 300)
			break MISSING_BLOCK_LABEL_163;
	//   47   92:iload_2         
	//   48   93:sipush          200
	//   49   96:icmplt          106
	//   50   99:iload_2         
	//   51  100:sipush          300
	//   52  103:icmplt          163
		StringBuilder stringbuilder = new StringBuilder(String.valueOf(((Object) (s))).length() + 65);
	//   53  106:new             #80  <Class StringBuilder>
	//   54  109:dup             
	//   55  110:aload_1         
	//   56  111:invokestatic    #31  <Method String String.valueOf(Object)>
	//   57  114:invokevirtual   #35  <Method int String.length()>
	//   58  117:bipush          65
	//   59  119:iadd            
	//   60  120:invokespecial   #83  <Method void StringBuilder(int)>
	//   61  123:astore          4
		stringbuilder.append("Received non-success response code ");
	//   62  125:aload           4
	//   63  127:ldc1            #85  <String "Received non-success response code ">
	//   64  129:invokevirtual   #89  <Method StringBuilder StringBuilder.append(String)>
	//   65  132:pop             
		stringbuilder.append(i);
	//   66  133:aload           4
	//   67  135:iload_2         
	//   68  136:invokevirtual   #92  <Method StringBuilder StringBuilder.append(int)>
	//   69  139:pop             
		stringbuilder.append(" from pinging URL: ");
	//   70  140:aload           4
	//   71  142:ldc1            #94  <String " from pinging URL: ">
	//   72  144:invokevirtual   #89  <Method StringBuilder StringBuilder.append(String)>
	//   73  147:pop             
		stringbuilder.append(s);
	//   74  148:aload           4
	//   75  150:aload_1         
	//   76  151:invokevirtual   #89  <Method StringBuilder StringBuilder.append(String)>
	//   77  154:pop             
		aag.e(stringbuilder.toString());
	//   78  155:aload           4
	//   79  157:invokevirtual   #98  <Method String StringBuilder.toString()>
	//   80  160:invokestatic    #101 <Method void aag.e(String)>
		Exception exception;
		try
		{
			((HttpURLConnection) (obj)).disconnect();
	//   81  163:aload_3         
	//   82  164:invokevirtual   #104 <Method void HttpURLConnection.disconnect()>
			return;
	//   83  167:return          
		}
	//*  84  168:astore          4
	//*  85  170:aload_3         
	//*  86  171:invokevirtual   #104 <Method void HttpURLConnection.disconnect()>
	//*  87  174:aload           4
	//*  88  176:athrow          
	//*  89  177:astore_3        
	//*  90  178:aload_3         
	//*  91  179:invokevirtual   #107 <Method String RuntimeException.getMessage()>
	//*  92  182:astore_3        
	//*  93  183:new             #80  <Class StringBuilder>
	//*  94  186:dup             
	//*  95  187:aload_1         
	//*  96  188:invokestatic    #31  <Method String String.valueOf(Object)>
	//*  97  191:invokevirtual   #35  <Method int String.length()>
	//*  98  194:bipush          27
	//*  99  196:iadd            
	//* 100  197:aload_3         
	//* 101  198:invokestatic    #31  <Method String String.valueOf(Object)>
	//* 102  201:invokevirtual   #35  <Method int String.length()>
	//* 103  204:iadd            
	//* 104  205:invokespecial   #83  <Method void StringBuilder(int)>
	//* 105  208:astore          4
	//* 106  210:aload           4
	//* 107  212:ldc1            #109 <String "Error while pinging URL: ">
	//* 108  214:invokevirtual   #89  <Method StringBuilder StringBuilder.append(String)>
	//* 109  217:pop             
	//* 110  218:aload           4
	//* 111  220:aload_1         
	//* 112  221:invokevirtual   #89  <Method StringBuilder StringBuilder.append(String)>
	//* 113  224:pop             
	//* 114  225:aload           4
	//* 115  227:ldc1            #111 <String ". ">
	//* 116  229:invokevirtual   #89  <Method StringBuilder StringBuilder.append(String)>
	//* 117  232:pop             
	//* 118  233:aload           4
	//* 119  235:aload_3         
	//* 120  236:invokevirtual   #89  <Method StringBuilder StringBuilder.append(String)>
	//* 121  239:pop             
	//* 122  240:aload           4
	//* 123  242:invokevirtual   #98  <Method String StringBuilder.toString()>
	//* 124  245:invokestatic    #101 <Method void aag.e(String)>
	//* 125  248:return          
	//* 126  249:astore_3        
	//* 127  250:aload_3         
	//* 128  251:invokevirtual   #112 <Method String IOException.getMessage()>
	//* 129  254:astore_3        
	//* 130  255:new             #80  <Class StringBuilder>
	//* 131  258:dup             
	//* 132  259:aload_1         
	//* 133  260:invokestatic    #31  <Method String String.valueOf(Object)>
	//* 134  263:invokevirtual   #35  <Method int String.length()>
	//* 135  266:bipush          27
	//* 136  268:iadd            
	//* 137  269:aload_3         
	//* 138  270:invokestatic    #31  <Method String String.valueOf(Object)>
	//* 139  273:invokevirtual   #35  <Method int String.length()>
	//* 140  276:iadd            
	//* 141  277:invokespecial   #83  <Method void StringBuilder(int)>
	//* 142  280:astore          4
	//* 143  282:aload           4
	//* 144  284:ldc1            #109 <String "Error while pinging URL: ">
	//* 145  286:invokevirtual   #89  <Method StringBuilder StringBuilder.append(String)>
	//* 146  289:pop             
	//* 147  290:aload           4
	//* 148  292:aload_1         
	//* 149  293:invokevirtual   #89  <Method StringBuilder StringBuilder.append(String)>
	//* 150  296:pop             
	//* 151  297:aload           4
	//* 152  299:ldc1            #111 <String ". ">
	//* 153  301:invokevirtual   #89  <Method StringBuilder StringBuilder.append(String)>
	//* 154  304:pop             
	//* 155  305:aload           4
	//* 156  307:aload_3         
	//* 157  308:invokevirtual   #89  <Method StringBuilder StringBuilder.append(String)>
	//* 158  311:pop             
	//* 159  312:aload           4
	//* 160  314:invokevirtual   #98  <Method String StringBuilder.toString()>
	//* 161  317:invokestatic    #101 <Method void aag.e(String)>
	//* 162  320:return          
		catch(IndexOutOfBoundsException indexoutofboundsexception)
	//* 163  321:astore_3        
		{
			indexoutofboundsexception = ((IndexOutOfBoundsException) (indexoutofboundsexception.getMessage()));
	//  164  322:aload_3         
	//  165  323:invokevirtual   #113 <Method String IndexOutOfBoundsException.getMessage()>
	//  166  326:astore_3        
		}
		catch(IOException ioexception)
		{
			ioexception = ((IOException) (ioexception.getMessage()));
			StringBuilder stringbuilder2 = new StringBuilder(String.valueOf(((Object) (s))).length() + 27 + String.valueOf(((Object) (ioexception))).length());
			stringbuilder2.append("Error while pinging URL: ");
			stringbuilder2.append(s);
			stringbuilder2.append(". ");
			stringbuilder2.append(((String) (ioexception)));
			aag.e(stringbuilder2.toString());
			return;
		}
		catch(RuntimeException runtimeexception)
		{
			runtimeexception = ((RuntimeException) (runtimeexception.getMessage()));
			StringBuilder stringbuilder1 = new StringBuilder(String.valueOf(((Object) (s))).length() + 27 + String.valueOf(((Object) (runtimeexception))).length());
			stringbuilder1.append("Error while pinging URL: ");
			stringbuilder1.append(s);
			stringbuilder1.append(". ");
			stringbuilder1.append(((String) (runtimeexception)));
			aag.e(stringbuilder1.toString());
			return;
		}
		break MISSING_BLOCK_LABEL_327;
		exception;
		((HttpURLConnection) (obj)).disconnect();
		throw exception;
		StringBuilder stringbuilder3 = new StringBuilder(String.valueOf(((Object) (s))).length() + 32 + String.valueOf(((Object) (indexoutofboundsexception))).length());
	//  167  327:new             #80  <Class StringBuilder>
	//  168  330:dup             
	//  169  331:aload_1         
	//  170  332:invokestatic    #31  <Method String String.valueOf(Object)>
	//  171  335:invokevirtual   #35  <Method int String.length()>
	//  172  338:bipush          32
	//  173  340:iadd            
	//  174  341:aload_3         
	//  175  342:invokestatic    #31  <Method String String.valueOf(Object)>
	//  176  345:invokevirtual   #35  <Method int String.length()>
	//  177  348:iadd            
	//  178  349:invokespecial   #83  <Method void StringBuilder(int)>
	//  179  352:astore          4
		stringbuilder3.append("Error while parsing ping URL: ");
	//  180  354:aload           4
	//  181  356:ldc1            #115 <String "Error while parsing ping URL: ">
	//  182  358:invokevirtual   #89  <Method StringBuilder StringBuilder.append(String)>
	//  183  361:pop             
		stringbuilder3.append(s);
	//  184  362:aload           4
	//  185  364:aload_1         
	//  186  365:invokevirtual   #89  <Method StringBuilder StringBuilder.append(String)>
	//  187  368:pop             
		stringbuilder3.append(". ");
	//  188  369:aload           4
	//  189  371:ldc1            #111 <String ". ">
	//  190  373:invokevirtual   #89  <Method StringBuilder StringBuilder.append(String)>
	//  191  376:pop             
		stringbuilder3.append(((String) (indexoutofboundsexception)));
	//  192  377:aload           4
	//  193  379:aload_3         
	//  194  380:invokevirtual   #89  <Method StringBuilder StringBuilder.append(String)>
	//  195  383:pop             
		aag.e(stringbuilder3.toString());
	//  196  384:aload           4
	//  197  386:invokevirtual   #98  <Method String StringBuilder.toString()>
	//  198  389:invokestatic    #101 <Method void aag.e(String)>
		return;
	//  199  392:return          
	}

	private final String a;
}

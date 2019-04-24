// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzamx, zzane, zzkb, zzamu, 
//			zzamy

public final class zzanf
	implements zzamx
{

	public zzanf()
	{
		this(((String) (null)));
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:invokespecial   #15  <Method void zzanf(String)>
	//    3    5:return          
	}

	public zzanf(String s)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void Object()>
		zzcpq = s;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #20  <Field String zzcpq>
	//    5    9:return          
	}

	public final void zzcz(String s)
	{
		Object obj;
		obj = ((Object) (String.valueOf(((Object) (s)))));
	//    0    0:aload_1         
	//    1    1:invokestatic    #35  <Method String String.valueOf(Object)>
	//    2    4:astore_3        
		if(((String) (obj)).length() != 0)
	//*   3    5:aload_3         
	//*   4    6:invokevirtual   #39  <Method int String.length()>
	//*   5    9:ifeq            22
		{
			obj = ((Object) ("Pinging URL: ".concat(((String) (obj)))));
	//    6   12:ldc1            #41  <String "Pinging URL: ">
	//    7   14:aload_3         
	//    8   15:invokevirtual   #45  <Method String String.concat(String)>
	//    9   18:astore_3        
			break MISSING_BLOCK_LABEL_32;
	//   10   19:goto            32
		}
		obj = ((Object) (new String("Pinging URL: ")));
	//   11   22:new             #31  <Class String>
	//   12   25:dup             
	//   13   26:ldc1            #41  <String "Pinging URL: ">
	//   14   28:invokespecial   #46  <Method void String(String)>
	//   15   31:astore_3        
		zzane.zzck(((String) (obj)));
	//   16   32:aload_3         
	//   17   33:invokestatic    #51  <Method void zzane.zzck(String)>
		obj = ((Object) ((HttpURLConnection)(new URL(s)).openConnection()));
	//   18   36:new             #53  <Class URL>
	//   19   39:dup             
	//   20   40:aload_1         
	//   21   41:invokespecial   #54  <Method void URL(String)>
	//   22   44:invokevirtual   #58  <Method java.net.URLConnection URL.openConnection()>
	//   23   47:checkcast       #60  <Class HttpURLConnection>
	//   24   50:astore_3        
		int i;
		zzkb.zzif();
	//   25   51:invokestatic    #66  <Method zzamu zzkb.zzif()>
	//   26   54:pop             
		zzamu.zza(true, ((HttpURLConnection) (obj)), zzcpq);
	//   27   55:iconst_1        
	//   28   56:aload_3         
	//   29   57:aload_0         
	//   30   58:getfield        #20  <Field String zzcpq>
	//   31   61:invokestatic    #72  <Method void zzamu.zza(boolean, HttpURLConnection, String)>
		zzamy zzamy1 = new zzamy();
	//   32   64:new             #74  <Class zzamy>
	//   33   67:dup             
	//   34   68:invokespecial   #75  <Method void zzamy()>
	//   35   71:astore          4
		zzamy1.zza(((HttpURLConnection) (obj)), ((byte []) (null)));
	//   36   73:aload           4
	//   37   75:aload_3         
	//   38   76:aconst_null     
	//   39   77:invokevirtual   #78  <Method void zzamy.zza(HttpURLConnection, byte[])>
		i = ((HttpURLConnection) (obj)).getResponseCode();
	//   40   80:aload_3         
	//   41   81:invokevirtual   #81  <Method int HttpURLConnection.getResponseCode()>
	//   42   84:istore_2        
		zzamy1.zza(((HttpURLConnection) (obj)), i);
	//   43   85:aload           4
	//   44   87:aload_3         
	//   45   88:iload_2         
	//   46   89:invokevirtual   #84  <Method void zzamy.zza(HttpURLConnection, int)>
		if(i >= 200 && i < 300)
			break MISSING_BLOCK_LABEL_163;
	//   47   92:iload_2         
	//   48   93:sipush          200
	//   49   96:icmplt          106
	//   50   99:iload_2         
	//   51  100:sipush          300
	//   52  103:icmplt          163
		StringBuilder stringbuilder = new StringBuilder(65 + String.valueOf(((Object) (s))).length());
	//   53  106:new             #86  <Class StringBuilder>
	//   54  109:dup             
	//   55  110:bipush          65
	//   56  112:aload_1         
	//   57  113:invokestatic    #35  <Method String String.valueOf(Object)>
	//   58  116:invokevirtual   #39  <Method int String.length()>
	//   59  119:iadd            
	//   60  120:invokespecial   #89  <Method void StringBuilder(int)>
	//   61  123:astore          4
		stringbuilder.append("Received non-success response code ");
	//   62  125:aload           4
	//   63  127:ldc1            #91  <String "Received non-success response code ">
	//   64  129:invokevirtual   #95  <Method StringBuilder StringBuilder.append(String)>
	//   65  132:pop             
		stringbuilder.append(i);
	//   66  133:aload           4
	//   67  135:iload_2         
	//   68  136:invokevirtual   #98  <Method StringBuilder StringBuilder.append(int)>
	//   69  139:pop             
		stringbuilder.append(" from pinging URL: ");
	//   70  140:aload           4
	//   71  142:ldc1            #100 <String " from pinging URL: ">
	//   72  144:invokevirtual   #95  <Method StringBuilder StringBuilder.append(String)>
	//   73  147:pop             
		stringbuilder.append(s);
	//   74  148:aload           4
	//   75  150:aload_1         
	//   76  151:invokevirtual   #95  <Method StringBuilder StringBuilder.append(String)>
	//   77  154:pop             
		zzane.zzdk(stringbuilder.toString());
	//   78  155:aload           4
	//   79  157:invokevirtual   #104 <Method String StringBuilder.toString()>
	//   80  160:invokestatic    #107 <Method void zzane.zzdk(String)>
		((HttpURLConnection) (obj)).disconnect();
	//   81  163:aload_3         
	//   82  164:invokevirtual   #110 <Method void HttpURLConnection.disconnect()>
		return;
	//   83  167:return          
		Exception exception;
		exception;
	//   84  168:astore          4
		((HttpURLConnection) (obj)).disconnect();
	//   85  170:aload_3         
	//   86  171:invokevirtual   #110 <Method void HttpURLConnection.disconnect()>
		throw exception;
	//   87  174:aload           4
	//   88  176:athrow          
		Object obj1;
		obj1;
	//   89  177:astore_3        
		String s1;
		s1 = ((RuntimeException) (obj1)).getMessage();
	//   90  178:aload_3         
	//   91  179:invokevirtual   #113 <Method String RuntimeException.getMessage()>
	//   92  182:astore          4
		obj1 = ((Object) (new StringBuilder(27 + String.valueOf(((Object) (s))).length() + String.valueOf(((Object) (s1))).length())));
	//   93  184:new             #86  <Class StringBuilder>
	//   94  187:dup             
	//   95  188:bipush          27
	//   96  190:aload_1         
	//   97  191:invokestatic    #35  <Method String String.valueOf(Object)>
	//   98  194:invokevirtual   #39  <Method int String.length()>
	//   99  197:iadd            
	//  100  198:aload           4
	//  101  200:invokestatic    #35  <Method String String.valueOf(Object)>
	//  102  203:invokevirtual   #39  <Method int String.length()>
	//  103  206:iadd            
	//  104  207:invokespecial   #89  <Method void StringBuilder(int)>
	//  105  210:astore_3        
_L1:
		((StringBuilder) (obj1)).append("Error while pinging URL: ");
	//  106  211:aload_3         
	//  107  212:ldc1            #115 <String "Error while pinging URL: ">
	//  108  214:invokevirtual   #95  <Method StringBuilder StringBuilder.append(String)>
	//  109  217:pop             
		((StringBuilder) (obj1)).append(s);
	//  110  218:aload_3         
	//  111  219:aload_1         
	//  112  220:invokevirtual   #95  <Method StringBuilder StringBuilder.append(String)>
	//  113  223:pop             
		((StringBuilder) (obj1)).append(". ");
	//  114  224:aload_3         
	//  115  225:ldc1            #117 <String ". ">
	//  116  227:invokevirtual   #95  <Method StringBuilder StringBuilder.append(String)>
	//  117  230:pop             
		((StringBuilder) (obj1)).append(s1);
	//  118  231:aload_3         
	//  119  232:aload           4
	//  120  234:invokevirtual   #95  <Method StringBuilder StringBuilder.append(String)>
	//  121  237:pop             
_L2:
		zzane.zzdk(((StringBuilder) (obj1)).toString());
	//  122  238:aload_3         
	//  123  239:invokevirtual   #104 <Method String StringBuilder.toString()>
	//  124  242:invokestatic    #107 <Method void zzane.zzdk(String)>
		return;
	//  125  245:return          
		obj1;
	//  126  246:astore_3        
		s1 = ((IOException) (obj1)).getMessage();
	//  127  247:aload_3         
	//  128  248:invokevirtual   #118 <Method String IOException.getMessage()>
	//  129  251:astore          4
		obj1 = ((Object) (new StringBuilder(27 + String.valueOf(((Object) (s))).length() + String.valueOf(((Object) (s1))).length())));
	//  130  253:new             #86  <Class StringBuilder>
	//  131  256:dup             
	//  132  257:bipush          27
	//  133  259:aload_1         
	//  134  260:invokestatic    #35  <Method String String.valueOf(Object)>
	//  135  263:invokevirtual   #39  <Method int String.length()>
	//  136  266:iadd            
	//  137  267:aload           4
	//  138  269:invokestatic    #35  <Method String String.valueOf(Object)>
	//  139  272:invokevirtual   #39  <Method int String.length()>
	//  140  275:iadd            
	//  141  276:invokespecial   #89  <Method void StringBuilder(int)>
	//  142  279:astore_3        
		  goto _L1
	//* 143  280:goto            211
		obj1;
	//  144  283:astore_3        
		String s2 = ((IndexOutOfBoundsException) (obj1)).getMessage();
	//  145  284:aload_3         
	//  146  285:invokevirtual   #119 <Method String IndexOutOfBoundsException.getMessage()>
	//  147  288:astore          4
		obj1 = ((Object) (new StringBuilder(32 + String.valueOf(((Object) (s))).length() + String.valueOf(((Object) (s2))).length())));
	//  148  290:new             #86  <Class StringBuilder>
	//  149  293:dup             
	//  150  294:bipush          32
	//  151  296:aload_1         
	//  152  297:invokestatic    #35  <Method String String.valueOf(Object)>
	//  153  300:invokevirtual   #39  <Method int String.length()>
	//  154  303:iadd            
	//  155  304:aload           4
	//  156  306:invokestatic    #35  <Method String String.valueOf(Object)>
	//  157  309:invokevirtual   #39  <Method int String.length()>
	//  158  312:iadd            
	//  159  313:invokespecial   #89  <Method void StringBuilder(int)>
	//  160  316:astore_3        
		((StringBuilder) (obj1)).append("Error while parsing ping URL: ");
	//  161  317:aload_3         
	//  162  318:ldc1            #121 <String "Error while parsing ping URL: ">
	//  163  320:invokevirtual   #95  <Method StringBuilder StringBuilder.append(String)>
	//  164  323:pop             
		((StringBuilder) (obj1)).append(s);
	//  165  324:aload_3         
	//  166  325:aload_1         
	//  167  326:invokevirtual   #95  <Method StringBuilder StringBuilder.append(String)>
	//  168  329:pop             
		((StringBuilder) (obj1)).append(". ");
	//  169  330:aload_3         
	//  170  331:ldc1            #117 <String ". ">
	//  171  333:invokevirtual   #95  <Method StringBuilder StringBuilder.append(String)>
	//  172  336:pop             
		((StringBuilder) (obj1)).append(s2);
	//  173  337:aload_3         
	//  174  338:aload           4
	//  175  340:invokevirtual   #95  <Method StringBuilder StringBuilder.append(String)>
	//  176  343:pop             
		  goto _L2
	//* 177  344:goto            238
	}

	private final String zzcpq;
}

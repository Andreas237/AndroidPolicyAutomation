// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package ch.qos.logback.core.net.ssl;

import ch.qos.logback.core.util.LocationUtil;
import java.io.*;
import java.net.URL;
import java.security.*;

public class KeyStoreFactoryBean
{

	public KeyStoreFactoryBean()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
	//    2    4:return          
	}

	private KeyStore newKeyStore()
	{
		if(getProvider() != null)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #20  <Method String getProvider()>
	//*   2    4:ifnull          19
			return KeyStore.getInstance(getType(), getProvider());
	//    3    7:aload_0         
	//    4    8:invokevirtual   #23  <Method String getType()>
	//    5   11:aload_0         
	//    6   12:invokevirtual   #20  <Method String getProvider()>
	//    7   15:invokestatic    #29  <Method KeyStore KeyStore.getInstance(String, String)>
	//    8   18:areturn         
		else
			return KeyStore.getInstance(getType());
	//    9   19:aload_0         
	//   10   20:invokevirtual   #23  <Method String getType()>
	//   11   23:invokestatic    #32  <Method KeyStore KeyStore.getInstance(String)>
	//   12   26:areturn         
	}

	public KeyStore createKeyStore()
	{
		Object obj2;
		Object obj4;
		StringBuilder stringbuilder;
		Object obj5;
		if(getLocation() == null)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #46  <Method String getLocation()>
	//*   2    4:ifnonnull       17
			throw new IllegalArgumentException("location is required");
	//    3    7:new             #48  <Class IllegalArgumentException>
	//    4   10:dup             
	//    5   11:ldc1            #50  <String "location is required">
	//    6   13:invokespecial   #53  <Method void IllegalArgumentException(String)>
	//    7   16:athrow          
		obj4 = null;
	//    8   17:aconst_null     
	//    9   18:astore_3        
		stringbuilder = null;
	//   10   19:aconst_null     
	//   11   20:astore          4
		obj5 = null;
	//   12   22:aconst_null     
	//   13   23:astore          5
		obj2 = null;
	//   14   25:aconst_null     
	//   15   26:astore_2        
		Object obj = ((Object) (LocationUtil.urlForResource(getLocation()).openStream()));
	//   16   27:aload_0         
	//   17   28:invokevirtual   #46  <Method String getLocation()>
	//   18   31:invokestatic    #59  <Method URL LocationUtil.urlForResource(String)>
	//   19   34:invokevirtual   #65  <Method InputStream URL.openStream()>
	//   20   37:astore_1        
		obj2 = obj;
	//   21   38:aload_1         
	//   22   39:astore_2        
		obj4 = ((Object) (newKeyStore()));
	//   23   40:aload_0         
	//   24   41:invokespecial   #67  <Method KeyStore newKeyStore()>
	//   25   44:astore_3        
		obj2 = obj;
	//   26   45:aload_1         
	//   27   46:astore_2        
		((KeyStore) (obj4)).load(((InputStream) (obj)), getPassword().toCharArray());
	//   28   47:aload_3         
	//   29   48:aload_1         
	//   30   49:aload_0         
	//   31   50:invokevirtual   #70  <Method String getPassword()>
	//   32   53:invokevirtual   #76  <Method char[] String.toCharArray()>
	//   33   56:invokevirtual   #80  <Method void KeyStore.load(InputStream, char[])>
		if(obj == null)
			break MISSING_BLOCK_LABEL_77;
	//   34   59:aload_1         
	//   35   60:ifnull          77
		((InputStream) (obj)).close();
	//   36   63:aload_1         
	//   37   64:invokevirtual   #85  <Method void InputStream.close()>
		return ((KeyStore) (obj4));
	//   38   67:aload_3         
	//   39   68:areturn         
		obj;
	//   40   69:astore_1        
		((IOException) (obj)).printStackTrace(System.err);
	//   41   70:aload_1         
	//   42   71:getstatic       #91  <Field java.io.PrintStream System.err>
	//   43   74:invokevirtual   #95  <Method void IOException.printStackTrace(java.io.PrintStream)>
		return ((KeyStore) (obj4));
	//   44   77:aload_3         
	//   45   78:areturn         
		obj4;
	//   46   79:astore_3        
		  goto _L1
	//*  47   80:goto            99
	//*  48   83:goto            164
	//*  49   86:goto            208
	//*  50   89:goto            252
		obj;
	//   51   92:astore_1        
		  goto _L2
	//*  52   93:goto            296
		obj4;
	//   53   96:astore_3        
		obj = null;
	//   54   97:aconst_null     
	//   55   98:astore_1        
_L1:
		obj2 = obj;
	//   56   99:aload_1         
	//   57  100:astore_2        
		stringbuilder = new StringBuilder();
	//   58  101:new             #97  <Class StringBuilder>
	//   59  104:dup             
	//   60  105:invokespecial   #98  <Method void StringBuilder()>
	//   61  108:astore          4
		obj2 = obj;
	//   62  110:aload_1         
	//   63  111:astore_2        
		stringbuilder.append(getLocation());
	//   64  112:aload           4
	//   65  114:aload_0         
	//   66  115:invokevirtual   #46  <Method String getLocation()>
	//   67  118:invokevirtual   #102 <Method StringBuilder StringBuilder.append(String)>
	//   68  121:pop             
		obj2 = obj;
	//   69  122:aload_1         
	//   70  123:astore_2        
		stringbuilder.append(": ");
	//   71  124:aload           4
	//   72  126:ldc1            #104 <String ": ">
	//   73  128:invokevirtual   #102 <Method StringBuilder StringBuilder.append(String)>
	//   74  131:pop             
		obj2 = obj;
	//   75  132:aload_1         
	//   76  133:astore_2        
		stringbuilder.append(((Exception) (obj4)).getMessage());
	//   77  134:aload           4
	//   78  136:aload_3         
	//   79  137:invokevirtual   #107 <Method String Exception.getMessage()>
	//   80  140:invokevirtual   #102 <Method StringBuilder StringBuilder.append(String)>
	//   81  143:pop             
		obj2 = obj;
	//   82  144:aload_1         
	//   83  145:astore_2        
		throw new KeyStoreException(stringbuilder.toString(), ((Throwable) (obj4)));
	//   84  146:new             #109 <Class KeyStoreException>
	//   85  149:dup             
	//   86  150:aload           4
	//   87  152:invokevirtual   #112 <Method String StringBuilder.toString()>
	//   88  155:aload_3         
	//   89  156:invokespecial   #115 <Method void KeyStoreException(String, Throwable)>
	//   90  159:athrow          
		obj;
	//   91  160:astore_1        
		  goto _L2
	//*  92  161:goto            296
_L8:
		obj2 = obj;
	//   93  164:aload_1         
	//   94  165:astore_2        
		obj4 = ((Object) (new StringBuilder()));
	//   95  166:new             #97  <Class StringBuilder>
	//   96  169:dup             
	//   97  170:invokespecial   #98  <Method void StringBuilder()>
	//   98  173:astore_3        
		obj2 = obj;
	//   99  174:aload_1         
	//  100  175:astore_2        
		((StringBuilder) (obj4)).append(getLocation());
	//  101  176:aload_3         
	//  102  177:aload_0         
	//  103  178:invokevirtual   #46  <Method String getLocation()>
	//  104  181:invokevirtual   #102 <Method StringBuilder StringBuilder.append(String)>
	//  105  184:pop             
		obj2 = obj;
	//  106  185:aload_1         
	//  107  186:astore_2        
		((StringBuilder) (obj4)).append(": file not found");
	//  108  187:aload_3         
	//  109  188:ldc1            #117 <String ": file not found">
	//  110  190:invokevirtual   #102 <Method StringBuilder StringBuilder.append(String)>
	//  111  193:pop             
		obj2 = obj;
	//  112  194:aload_1         
	//  113  195:astore_2        
		throw new KeyStoreException(((StringBuilder) (obj4)).toString());
	//  114  196:new             #109 <Class KeyStoreException>
	//  115  199:dup             
	//  116  200:aload_3         
	//  117  201:invokevirtual   #112 <Method String StringBuilder.toString()>
	//  118  204:invokespecial   #118 <Method void KeyStoreException(String)>
	//  119  207:athrow          
_L6:
		obj2 = obj;
	//  120  208:aload_1         
	//  121  209:astore_2        
		obj4 = ((Object) (new StringBuilder()));
	//  122  210:new             #97  <Class StringBuilder>
	//  123  213:dup             
	//  124  214:invokespecial   #98  <Method void StringBuilder()>
	//  125  217:astore_3        
		obj2 = obj;
	//  126  218:aload_1         
	//  127  219:astore_2        
		((StringBuilder) (obj4)).append("no such keystore type: ");
	//  128  220:aload_3         
	//  129  221:ldc1            #120 <String "no such keystore type: ">
	//  130  223:invokevirtual   #102 <Method StringBuilder StringBuilder.append(String)>
	//  131  226:pop             
		obj2 = obj;
	//  132  227:aload_1         
	//  133  228:astore_2        
		((StringBuilder) (obj4)).append(getType());
	//  134  229:aload_3         
	//  135  230:aload_0         
	//  136  231:invokevirtual   #23  <Method String getType()>
	//  137  234:invokevirtual   #102 <Method StringBuilder StringBuilder.append(String)>
	//  138  237:pop             
		obj2 = obj;
	//  139  238:aload_1         
	//  140  239:astore_2        
		throw new NoSuchAlgorithmException(((StringBuilder) (obj4)).toString());
	//  141  240:new             #37  <Class NoSuchAlgorithmException>
	//  142  243:dup             
	//  143  244:aload_3         
	//  144  245:invokevirtual   #112 <Method String StringBuilder.toString()>
	//  145  248:invokespecial   #121 <Method void NoSuchAlgorithmException(String)>
	//  146  251:athrow          
_L4:
		obj2 = obj;
	//  147  252:aload_1         
	//  148  253:astore_2        
		obj4 = ((Object) (new StringBuilder()));
	//  149  254:new             #97  <Class StringBuilder>
	//  150  257:dup             
	//  151  258:invokespecial   #98  <Method void StringBuilder()>
	//  152  261:astore_3        
		obj2 = obj;
	//  153  262:aload_1         
	//  154  263:astore_2        
		((StringBuilder) (obj4)).append("no such keystore provider: ");
	//  155  264:aload_3         
	//  156  265:ldc1            #123 <String "no such keystore provider: ">
	//  157  267:invokevirtual   #102 <Method StringBuilder StringBuilder.append(String)>
	//  158  270:pop             
		obj2 = obj;
	//  159  271:aload_1         
	//  160  272:astore_2        
		((StringBuilder) (obj4)).append(getProvider());
	//  161  273:aload_3         
	//  162  274:aload_0         
	//  163  275:invokevirtual   #20  <Method String getProvider()>
	//  164  278:invokevirtual   #102 <Method StringBuilder StringBuilder.append(String)>
	//  165  281:pop             
		obj2 = obj;
	//  166  282:aload_1         
	//  167  283:astore_2        
		throw new NoSuchProviderException(((StringBuilder) (obj4)).toString());
	//  168  284:new             #35  <Class NoSuchProviderException>
	//  169  287:dup             
	//  170  288:aload_3         
	//  171  289:invokevirtual   #112 <Method String StringBuilder.toString()>
	//  172  292:invokespecial   #124 <Method void NoSuchProviderException(String)>
	//  173  295:athrow          
_L2:
		if(obj2 != null)
	//* 174  296:aload_2         
	//* 175  297:ifnull          315
			try
			{
				((InputStream) (obj2)).close();
	//  176  300:aload_2         
	//  177  301:invokevirtual   #85  <Method void InputStream.close()>
			}
	//* 178  304:goto            315
			catch(IOException ioexception)
	//* 179  307:astore_2        
			{
				ioexception.printStackTrace(System.err);
	//  180  308:aload_2         
	//  181  309:getstatic       #91  <Field java.io.PrintStream System.err>
	//  182  312:invokevirtual   #95  <Method void IOException.printStackTrace(java.io.PrintStream)>
			}
		throw obj;
	//  183  315:aload_1         
	//  184  316:athrow          
		Object obj1;
		obj1;
	//  185  317:astore_1        
		obj1 = ((Object) (obj5));
	//  186  318:aload           5
	//  187  320:astore_1        
		continue; /* Loop/switch isn't completed */
	//  188  321:goto            252
		obj1;
	//  189  324:astore_1        
		obj1 = ((Object) (stringbuilder));
	//  190  325:aload           4
	//  191  327:astore_1        
		continue; /* Loop/switch isn't completed */
	//  192  328:goto            208
		obj1;
	//  193  331:astore_1        
		obj1 = obj4;
	//  194  332:aload_3         
	//  195  333:astore_1        
		continue; /* Loop/switch isn't completed */
	//  196  334:goto            164
		Object obj3;
		obj3;
	//  197  337:astore_2        
		if(true) goto _L4; else goto _L3
	//  198  338:goto            89
_L3:
		obj3;
	//  199  341:astore_2        
		if(true) goto _L6; else goto _L5
	//  200  342:goto            86
_L5:
		obj3;
	//  201  345:astore_2        
		if(true) goto _L8; else goto _L7
_L7:
	//* 202  346:goto            83
	}

	public String getLocation()
	{
		return location;
	//    0    0:aload_0         
	//    1    1:getfield        #126 <Field String location>
	//    2    4:areturn         
	}

	public String getPassword()
	{
		if(password == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #128 <Field String password>
	//*   2    4:ifnonnull       10
			return "changeit";
	//    3    7:ldc1            #130 <String "changeit">
	//    4    9:areturn         
		else
			return password;
	//    5   10:aload_0         
	//    6   11:getfield        #128 <Field String password>
	//    7   14:areturn         
	}

	public String getProvider()
	{
		return provider;
	//    0    0:aload_0         
	//    1    1:getfield        #132 <Field String provider>
	//    2    4:areturn         
	}

	public String getType()
	{
		if(type == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #134 <Field String type>
	//*   2    4:ifnonnull       10
			return "JKS";
	//    3    7:ldc1            #136 <String "JKS">
	//    4    9:areturn         
		else
			return type;
	//    5   10:aload_0         
	//    6   11:getfield        #134 <Field String type>
	//    7   14:areturn         
	}

	public void setLocation(String s)
	{
		location = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #126 <Field String location>
	//    3    5:return          
	}

	public void setPassword(String s)
	{
		password = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #128 <Field String password>
	//    3    5:return          
	}

	public void setProvider(String s)
	{
		provider = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #132 <Field String provider>
	//    3    5:return          
	}

	public void setType(String s)
	{
		type = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #134 <Field String type>
	//    3    5:return          
	}

	private String location;
	private String password;
	private String provider;
	private String type;
}

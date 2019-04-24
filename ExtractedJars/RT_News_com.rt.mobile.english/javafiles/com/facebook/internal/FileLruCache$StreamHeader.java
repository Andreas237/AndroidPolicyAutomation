// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.internal;

import com.facebook.LoggingBehavior;
import java.io.*;
import org.json.*;

// Referenced classes of package com.facebook.internal:
//			FileLruCache, Logger

private static final class FileLruCache$StreamHeader
{

	static JSONObject readHeader(InputStream inputstream)
		throws IOException
	{
		if(inputstream.read() != 0)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #27  <Method int InputStream.read()>
	//*   2    4:ifeq            9
			return null;
	//    3    7:aconst_null     
	//    4    8:areturn         
		boolean flag = false;
	//    5    9:iconst_0        
	//    6   10:istore_3        
		int i = 0;
	//    7   11:iconst_0        
	//    8   12:istore_1        
		int k = i;
	//    9   13:iload_1         
	//   10   14:istore_2        
		for(; i < 3; i++)
	//*  11   15:iload_1         
	//*  12   16:iconst_3        
	//*  13   17:icmpge          64
		{
			int i1 = inputstream.read();
	//   14   20:aload_0         
	//   15   21:invokevirtual   #27  <Method int InputStream.read()>
	//   16   24:istore          4
			if(i1 == -1)
	//*  17   26:iload           4
	//*  18   28:iconst_m1       
	//*  19   29:icmpne          45
			{
				Logger.log(LoggingBehavior.CACHE, FileLruCache.TAG, "readHeader: stream.read returned -1 while reading header size");
	//   20   32:getstatic       #33  <Field LoggingBehavior LoggingBehavior.CACHE>
	//   21   35:getstatic       #37  <Field String FileLruCache.TAG>
	//   22   38:ldc1            #39  <String "readHeader: stream.read returned -1 while reading header size">
	//   23   40:invokestatic    #45  <Method void Logger.log(LoggingBehavior, String, String)>
				return null;
	//   24   43:aconst_null     
	//   25   44:areturn         
			}
			k = (k << 8) + (i1 & 0xff);
	//   26   45:iload_2         
	//   27   46:bipush          8
	//   28   48:ishl            
	//   29   49:iload           4
	//   30   51:sipush          255
	//   31   54:iand            
	//   32   55:iadd            
	//   33   56:istore_2        
		}

	//   34   57:iload_1         
	//   35   58:iconst_1        
	//   36   59:iadd            
	//   37   60:istore_1        
	//*  38   61:goto            15
		byte abyte0[] = new byte[k];
	//   39   64:iload_2         
	//   40   65:newarray        byte[]
	//   41   67:astore          5
		int l;
		for(int j = ((int) (flag)); j < abyte0.length; j += l)
	//*  42   69:iload_3         
	//*  43   70:istore_1        
	//*  44   71:iload_1         
	//*  45   72:aload           5
	//*  46   74:arraylength     
	//*  47   75:icmpge          169
		{
			l = inputstream.read(abyte0, j, abyte0.length - j);
	//   48   78:aload_0         
	//   49   79:aload           5
	//   50   81:iload_1         
	//   51   82:aload           5
	//   52   84:arraylength     
	//   53   85:iload_1         
	//   54   86:isub            
	//   55   87:invokevirtual   #48  <Method int InputStream.read(byte[], int, int)>
	//   56   90:istore_2        
			if(l < 1)
	//*  57   91:iload_2         
	//*  58   92:iconst_1        
	//*  59   93:icmpge          162
			{
				inputstream = ((InputStream) (LoggingBehavior.CACHE));
	//   60   96:getstatic       #33  <Field LoggingBehavior LoggingBehavior.CACHE>
	//   61   99:astore_0        
				String s = FileLruCache.TAG;
	//   62  100:getstatic       #37  <Field String FileLruCache.TAG>
	//   63  103:astore          6
				StringBuilder stringbuilder = new StringBuilder();
	//   64  105:new             #50  <Class StringBuilder>
	//   65  108:dup             
	//   66  109:invokespecial   #51  <Method void StringBuilder()>
	//   67  112:astore          7
				stringbuilder.append("readHeader: stream.read stopped at ");
	//   68  114:aload           7
	//   69  116:ldc1            #53  <String "readHeader: stream.read stopped at ">
	//   70  118:invokevirtual   #57  <Method StringBuilder StringBuilder.append(String)>
	//   71  121:pop             
				stringbuilder.append(((Object) (Integer.valueOf(j))));
	//   72  122:aload           7
	//   73  124:iload_1         
	//   74  125:invokestatic    #63  <Method Integer Integer.valueOf(int)>
	//   75  128:invokevirtual   #66  <Method StringBuilder StringBuilder.append(Object)>
	//   76  131:pop             
				stringbuilder.append(" when expected ");
	//   77  132:aload           7
	//   78  134:ldc1            #68  <String " when expected ">
	//   79  136:invokevirtual   #57  <Method StringBuilder StringBuilder.append(String)>
	//   80  139:pop             
				stringbuilder.append(abyte0.length);
	//   81  140:aload           7
	//   82  142:aload           5
	//   83  144:arraylength     
	//   84  145:invokevirtual   #71  <Method StringBuilder StringBuilder.append(int)>
	//   85  148:pop             
				Logger.log(((LoggingBehavior) (inputstream)), s, stringbuilder.toString());
	//   86  149:aload_0         
	//   87  150:aload           6
	//   88  152:aload           7
	//   89  154:invokevirtual   #75  <Method String StringBuilder.toString()>
	//   90  157:invokestatic    #45  <Method void Logger.log(LoggingBehavior, String, String)>
				return null;
	//   91  160:aconst_null     
	//   92  161:areturn         
			}
		}

	//   93  162:iload_1         
	//   94  163:iload_2         
	//   95  164:iadd            
	//   96  165:istore_1        
	//*  97  166:goto            71
		inputstream = ((InputStream) (new JSONTokener(new String(abyte0))));
	//   98  169:new             #77  <Class JSONTokener>
	//   99  172:dup             
	//  100  173:new             #79  <Class String>
	//  101  176:dup             
	//  102  177:aload           5
	//  103  179:invokespecial   #82  <Method void String(byte[])>
	//  104  182:invokespecial   #85  <Method void JSONTokener(String)>
	//  105  185:astore_0        
		inputstream = ((InputStream) (((JSONTokener) (inputstream)).nextValue()));
	//  106  186:aload_0         
	//  107  187:invokevirtual   #89  <Method Object JSONTokener.nextValue()>
	//  108  190:astore_0        
		if(inputstream instanceof JSONObject)
			break MISSING_BLOCK_LABEL_252;
	//  109  191:aload_0         
	//  110  192:instanceof      #91  <Class JSONObject>
	//  111  195:ifne            252
		LoggingBehavior loggingbehavior = LoggingBehavior.CACHE;
	//  112  198:getstatic       #33  <Field LoggingBehavior LoggingBehavior.CACHE>
	//  113  201:astore          5
		String s1 = FileLruCache.TAG;
	//  114  203:getstatic       #37  <Field String FileLruCache.TAG>
	//  115  206:astore          6
		StringBuilder stringbuilder1 = new StringBuilder();
	//  116  208:new             #50  <Class StringBuilder>
	//  117  211:dup             
	//  118  212:invokespecial   #51  <Method void StringBuilder()>
	//  119  215:astore          7
		stringbuilder1.append("readHeader: expected JSONObject, got ");
	//  120  217:aload           7
	//  121  219:ldc1            #93  <String "readHeader: expected JSONObject, got ">
	//  122  221:invokevirtual   #57  <Method StringBuilder StringBuilder.append(String)>
	//  123  224:pop             
		stringbuilder1.append(((Object) (inputstream)).getClass().getCanonicalName());
	//  124  225:aload           7
	//  125  227:aload_0         
	//  126  228:invokevirtual   #97  <Method Class Object.getClass()>
	//  127  231:invokevirtual   #102 <Method String Class.getCanonicalName()>
	//  128  234:invokevirtual   #57  <Method StringBuilder StringBuilder.append(String)>
	//  129  237:pop             
		Logger.log(loggingbehavior, s1, stringbuilder1.toString());
	//  130  238:aload           5
	//  131  240:aload           6
	//  132  242:aload           7
	//  133  244:invokevirtual   #75  <Method String StringBuilder.toString()>
	//  134  247:invokestatic    #45  <Method void Logger.log(LoggingBehavior, String, String)>
		return null;
	//  135  250:aconst_null     
	//  136  251:areturn         
		try
		{
			inputstream = ((InputStream) ((JSONObject)inputstream));
	//  137  252:aload_0         
	//  138  253:checkcast       #91  <Class JSONObject>
	//  139  256:astore_0        
		}
	//* 140  257:aload_0         
	//* 141  258:areturn         
		// Misplaced declaration of an exception variable
		catch(InputStream inputstream)
	//* 142  259:astore_0        
		{
			throw new IOException(((JSONException) (inputstream)).getMessage());
	//  143  260:new             #19  <Class IOException>
	//  144  263:dup             
	//  145  264:aload_0         
	//  146  265:invokevirtual   #105 <Method String JSONException.getMessage()>
	//  147  268:invokespecial   #106 <Method void IOException(String)>
	//  148  271:athrow          
		}
		return ((JSONObject) (inputstream));
	}

	static void writeHeader(OutputStream outputstream, JSONObject jsonobject)
		throws IOException
	{
		jsonobject = ((JSONObject) (jsonobject.toString().getBytes()));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #110 <Method String JSONObject.toString()>
	//    2    4:invokevirtual   #114 <Method byte[] String.getBytes()>
	//    3    7:astore_1        
		outputstream.write(0);
	//    4    8:aload_0         
	//    5    9:iconst_0        
	//    6   10:invokevirtual   #120 <Method void OutputStream.write(int)>
		outputstream.write(jsonobject.length >> 16 & 0xff);
	//    7   13:aload_0         
	//    8   14:aload_1         
	//    9   15:arraylength     
	//   10   16:bipush          16
	//   11   18:ishr            
	//   12   19:sipush          255
	//   13   22:iand            
	//   14   23:invokevirtual   #120 <Method void OutputStream.write(int)>
		outputstream.write(jsonobject.length >> 8 & 0xff);
	//   15   26:aload_0         
	//   16   27:aload_1         
	//   17   28:arraylength     
	//   18   29:bipush          8
	//   19   31:ishr            
	//   20   32:sipush          255
	//   21   35:iand            
	//   22   36:invokevirtual   #120 <Method void OutputStream.write(int)>
		outputstream.write(jsonobject.length >> 0 & 0xff);
	//   23   39:aload_0         
	//   24   40:aload_1         
	//   25   41:arraylength     
	//   26   42:iconst_0        
	//   27   43:ishr            
	//   28   44:sipush          255
	//   29   47:iand            
	//   30   48:invokevirtual   #120 <Method void OutputStream.write(int)>
		outputstream.write(((byte []) (jsonobject)));
	//   31   51:aload_0         
	//   32   52:aload_1         
	//   33   53:invokevirtual   #122 <Method void OutputStream.write(byte[])>
	//   34   56:return          
	}

	private static final int HEADER_VERSION = 0;

	private FileLruCache$StreamHeader()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
	//    2    4:return          
	}
}

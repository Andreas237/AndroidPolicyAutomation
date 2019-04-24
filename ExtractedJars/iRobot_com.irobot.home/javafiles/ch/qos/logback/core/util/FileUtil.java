// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package ch.qos.logback.core.util;

import ch.qos.logback.core.Context;
import ch.qos.logback.core.rolling.RolloverFailure;
import ch.qos.logback.core.spi.ContextAwareBase;
import java.io.*;
import java.net.*;

// Referenced classes of package ch.qos.logback.core.util:
//			OptionHelper

public class FileUtil extends ContextAwareBase
{

	public FileUtil(Context context)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void ContextAwareBase()>
		setContext(context);
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokevirtual   #15  <Method void setContext(Context)>
	//    5    9:return          
	}

	public static boolean createMissingParentDirectories(File file)
	{
		Object obj = ((Object) (file.getParentFile()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #24  <Method File File.getParentFile()>
	//    2    4:astore_1        
		if(obj == null)
	//*   3    5:aload_1         
	//*   4    6:ifnonnull       42
		{
			obj = ((Object) (new StringBuilder()));
	//    5    9:new             #26  <Class StringBuilder>
	//    6   12:dup             
	//    7   13:invokespecial   #27  <Method void StringBuilder()>
	//    8   16:astore_1        
			((StringBuilder) (obj)).append(((Object) (file)));
	//    9   17:aload_1         
	//   10   18:aload_0         
	//   11   19:invokevirtual   #31  <Method StringBuilder StringBuilder.append(Object)>
	//   12   22:pop             
			((StringBuilder) (obj)).append(" should not have a null parent");
	//   13   23:aload_1         
	//   14   24:ldc1            #33  <String " should not have a null parent">
	//   15   26:invokevirtual   #36  <Method StringBuilder StringBuilder.append(String)>
	//   16   29:pop             
			throw new IllegalStateException(((StringBuilder) (obj)).toString());
	//   17   30:new             #38  <Class IllegalStateException>
	//   18   33:dup             
	//   19   34:aload_1         
	//   20   35:invokevirtual   #42  <Method String StringBuilder.toString()>
	//   21   38:invokespecial   #45  <Method void IllegalStateException(String)>
	//   22   41:athrow          
		}
		if(((File) (obj)).exists())
	//*  23   42:aload_1         
	//*  24   43:invokevirtual   #49  <Method boolean File.exists()>
	//*  25   46:ifeq            82
		{
			obj = ((Object) (new StringBuilder()));
	//   26   49:new             #26  <Class StringBuilder>
	//   27   52:dup             
	//   28   53:invokespecial   #27  <Method void StringBuilder()>
	//   29   56:astore_1        
			((StringBuilder) (obj)).append(((Object) (file)));
	//   30   57:aload_1         
	//   31   58:aload_0         
	//   32   59:invokevirtual   #31  <Method StringBuilder StringBuilder.append(Object)>
	//   33   62:pop             
			((StringBuilder) (obj)).append(" should not have existing parent directory");
	//   34   63:aload_1         
	//   35   64:ldc1            #51  <String " should not have existing parent directory">
	//   36   66:invokevirtual   #36  <Method StringBuilder StringBuilder.append(String)>
	//   37   69:pop             
			throw new IllegalStateException(((StringBuilder) (obj)).toString());
	//   38   70:new             #38  <Class IllegalStateException>
	//   39   73:dup             
	//   40   74:aload_1         
	//   41   75:invokevirtual   #42  <Method String StringBuilder.toString()>
	//   42   78:invokespecial   #45  <Method void IllegalStateException(String)>
	//   43   81:athrow          
		} else
		{
			return ((File) (obj)).mkdirs();
	//   44   82:aload_1         
	//   45   83:invokevirtual   #54  <Method boolean File.mkdirs()>
	//   46   86:ireturn         
		}
	}

	public static URL fileToURL(File file)
	{
		URL url;
		try
		{
			url = file.toURI().toURL();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #62  <Method URI File.toURI()>
	//    2    4:invokevirtual   #68  <Method URL URI.toURL()>
	//    3    7:astore_1        
		}
	//*   4    8:aload_1         
	//*   5    9:areturn         
		catch(MalformedURLException malformedurlexception)
	//*   6   10:astore_1        
		{
			StringBuilder stringbuilder = new StringBuilder();
	//    7   11:new             #26  <Class StringBuilder>
	//    8   14:dup             
	//    9   15:invokespecial   #27  <Method void StringBuilder()>
	//   10   18:astore_2        
			stringbuilder.append("Unexpected exception on file [");
	//   11   19:aload_2         
	//   12   20:ldc1            #70  <String "Unexpected exception on file [">
	//   13   22:invokevirtual   #36  <Method StringBuilder StringBuilder.append(String)>
	//   14   25:pop             
			stringbuilder.append(((Object) (file)));
	//   15   26:aload_2         
	//   16   27:aload_0         
	//   17   28:invokevirtual   #31  <Method StringBuilder StringBuilder.append(Object)>
	//   18   31:pop             
			stringbuilder.append("]");
	//   19   32:aload_2         
	//   20   33:ldc1            #72  <String "]">
	//   21   35:invokevirtual   #36  <Method StringBuilder StringBuilder.append(String)>
	//   22   38:pop             
			throw new RuntimeException(stringbuilder.toString(), ((Throwable) (malformedurlexception)));
	//   23   39:new             #74  <Class RuntimeException>
	//   24   42:dup             
	//   25   43:aload_2         
	//   26   44:invokevirtual   #42  <Method String StringBuilder.toString()>
	//   27   47:aload_1         
	//   28   48:invokespecial   #77  <Method void RuntimeException(String, Throwable)>
	//   29   51:athrow          
		}
		return url;
	}

	public static boolean isParentDirectoryCreationRequired(File file)
	{
		file = file.getParentFile();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #24  <Method File File.getParentFile()>
	//    2    4:astore_0        
		return file != null && !file.exists();
	//    3    5:aload_0         
	//    4    6:ifnull          18
	//    5    9:aload_0         
	//    6   10:invokevirtual   #49  <Method boolean File.exists()>
	//    7   13:ifne            18
	//    8   16:iconst_1        
	//    9   17:ireturn         
	//   10   18:iconst_0        
	//   11   19:ireturn         
	}

	public static String prefixRelativePath(String s, String s1)
	{
		Object obj = ((Object) (s1));
	//    0    0:aload_1         
	//    1    1:astore_2        
		if(s != null)
	//*   2    2:aload_0         
	//*   3    3:ifnull          66
		{
			obj = ((Object) (s1));
	//    4    6:aload_1         
	//    5    7:astore_2        
			if(!OptionHelper.isEmpty(s.trim()))
	//*   6    8:aload_0         
	//*   7    9:invokevirtual   #85  <Method String String.trim()>
	//*   8   12:invokestatic    #91  <Method boolean OptionHelper.isEmpty(String)>
	//*   9   15:ifne            66
			{
				obj = ((Object) (s1));
	//   10   18:aload_1         
	//   11   19:astore_2        
				if(!(new File(s1)).isAbsolute())
	//*  12   20:new             #20  <Class File>
	//*  13   23:dup             
	//*  14   24:aload_1         
	//*  15   25:invokespecial   #92  <Method void File(String)>
	//*  16   28:invokevirtual   #95  <Method boolean File.isAbsolute()>
	//*  17   31:ifne            66
				{
					obj = ((Object) (new StringBuilder()));
	//   18   34:new             #26  <Class StringBuilder>
	//   19   37:dup             
	//   20   38:invokespecial   #27  <Method void StringBuilder()>
	//   21   41:astore_2        
					((StringBuilder) (obj)).append(s);
	//   22   42:aload_2         
	//   23   43:aload_0         
	//   24   44:invokevirtual   #36  <Method StringBuilder StringBuilder.append(String)>
	//   25   47:pop             
					((StringBuilder) (obj)).append("/");
	//   26   48:aload_2         
	//   27   49:ldc1            #97  <String "/">
	//   28   51:invokevirtual   #36  <Method StringBuilder StringBuilder.append(String)>
	//   29   54:pop             
					((StringBuilder) (obj)).append(s1);
	//   30   55:aload_2         
	//   31   56:aload_1         
	//   32   57:invokevirtual   #36  <Method StringBuilder StringBuilder.append(String)>
	//   33   60:pop             
					obj = ((Object) (((StringBuilder) (obj)).toString()));
	//   34   61:aload_2         
	//   35   62:invokevirtual   #42  <Method String StringBuilder.toString()>
	//   36   65:astore_2        
				}
			}
		}
		return ((String) (obj));
	//   37   66:aload_2         
	//   38   67:areturn         
	}

	public void copy(String s, String s1)
	{
		Object obj;
		Object obj1;
		StringBuilder stringbuilder;
		obj1 = null;
	//    0    0:aconst_null     
	//    1    1:astore          7
		obj = null;
	//    2    3:aconst_null     
	//    3    4:astore          5
		stringbuilder = null;
	//    4    6:aconst_null     
	//    5    7:astore          9
		BufferedInputStream bufferedinputstream = new BufferedInputStream(((java.io.InputStream) (new FileInputStream(s))));
	//    6    9:new             #103 <Class BufferedInputStream>
	//    7   12:dup             
	//    8   13:new             #105 <Class FileInputStream>
	//    9   16:dup             
	//   10   17:aload_1         
	//   11   18:invokespecial   #106 <Method void FileInputStream(String)>
	//   12   21:invokespecial   #109 <Method void BufferedInputStream(java.io.InputStream)>
	//   13   24:astore          4
		int i;
		BufferedOutputStream bufferedoutputstream;
		BufferedOutputStream bufferedoutputstream1;
		try
		{
			bufferedoutputstream = new BufferedOutputStream(((java.io.OutputStream) (new FileOutputStream(s1))));
	//   14   26:new             #111 <Class BufferedOutputStream>
	//   15   29:dup             
	//   16   30:new             #113 <Class FileOutputStream>
	//   17   33:dup             
	//   18   34:aload_2         
	//   19   35:invokespecial   #114 <Method void FileOutputStream(String)>
	//   20   38:invokespecial   #117 <Method void BufferedOutputStream(java.io.OutputStream)>
	//   21   41:astore          6
		}
	//*  22   43:ldc1            #7   <Int 32768>
	//*  23   45:newarray        byte[]
	//*  24   47:astore          5
	//*  25   49:aload           4
	//*  26   51:aload           5
	//*  27   53:invokevirtual   #121 <Method int BufferedInputStream.read(byte[])>
	//*  28   56:istore_3        
	//*  29   57:iload_3         
	//*  30   58:iconst_m1       
	//*  31   59:icmpeq          74
	//*  32   62:aload           6
	//*  33   64:aload           5
	//*  34   66:iconst_0        
	//*  35   67:iload_3         
	//*  36   68:invokevirtual   #125 <Method void BufferedOutputStream.write(byte[], int, int)>
	//*  37   71:goto            49
	//*  38   74:aload           4
	//*  39   76:invokevirtual   #128 <Method void BufferedInputStream.close()>
	//*  40   79:aload           6
	//*  41   81:astore          8
	//*  42   83:aload           6
	//*  43   85:invokevirtual   #129 <Method void BufferedOutputStream.close()>
	//*  44   88:return          
	//*  45   89:astore          5
	//*  46   91:aload           9
	//*  47   93:astore          4
	//*  48   95:goto            150
	//*  49   98:astore_1        
	//*  50   99:goto            111
	//*  51  102:astore          5
	//*  52  104:goto            150
	//*  53  107:astore_1        
	//*  54  108:aconst_null     
	//*  55  109:astore          6
	//*  56  111:aload           4
	//*  57  113:astore          7
	//*  58  115:aload           6
	//*  59  117:astore          8
	//*  60  119:goto            292
		// Misplaced declaration of an exception variable
		catch(Object obj)
	//*  61  122:astore          5
		{
			bufferedoutputstream = null;
	//   62  124:aconst_null     
	//   63  125:astore          6
			break MISSING_BLOCK_LABEL_150;
	//   64  127:goto            150
		}
		obj = ((Object) (new byte[32768]));
_L1:
		i = bufferedinputstream.read(((byte []) (obj)));
		if(i == -1)
			break MISSING_BLOCK_LABEL_74;
		try
		{
			bufferedoutputstream.write(((byte []) (obj)), 0, i);
		}
		// Misplaced declaration of an exception variable
		catch(Object obj)
		{
			break MISSING_BLOCK_LABEL_150;
		}
		  goto _L1
		bufferedinputstream.close();
		bufferedoutputstream1 = bufferedoutputstream;
		try
		{
			bufferedoutputstream.close();
			return;
		}
		// Misplaced declaration of an exception variable
		catch(Object obj)
		{
			bufferedinputstream = ((BufferedInputStream) (stringbuilder));
		}
		break MISSING_BLOCK_LABEL_150;
		s;
		break MISSING_BLOCK_LABEL_111;
		s;
		bufferedoutputstream = null;
		obj1 = ((Object) (bufferedinputstream));
		bufferedoutputstream1 = bufferedoutputstream;
		break MISSING_BLOCK_LABEL_292;
		s;
	//   65  130:astore_1        
		bufferedoutputstream1 = null;
	//   66  131:aconst_null     
	//   67  132:astore          8
		obj1 = obj;
	//   68  134:aload           5
	//   69  136:astore          7
		break MISSING_BLOCK_LABEL_292;
	//   70  138:goto            292
		IOException ioexception;
		ioexception;
	//   71  141:astore          5
		bufferedoutputstream = null;
	//   72  143:aconst_null     
	//   73  144:astore          6
		bufferedinputstream = ((BufferedInputStream) (stringbuilder));
	//   74  146:aload           9
	//   75  148:astore          4
		obj1 = ((Object) (bufferedinputstream));
	//   76  150:aload           4
	//   77  152:astore          7
		bufferedoutputstream1 = bufferedoutputstream;
	//   78  154:aload           6
	//   79  156:astore          8
		stringbuilder = new StringBuilder();
	//   80  158:new             #26  <Class StringBuilder>
	//   81  161:dup             
	//   82  162:invokespecial   #27  <Method void StringBuilder()>
	//   83  165:astore          9
		obj1 = ((Object) (bufferedinputstream));
	//   84  167:aload           4
	//   85  169:astore          7
		bufferedoutputstream1 = bufferedoutputstream;
	//   86  171:aload           6
	//   87  173:astore          8
		stringbuilder.append("Failed to copy [");
	//   88  175:aload           9
	//   89  177:ldc1            #131 <String "Failed to copy [">
	//   90  179:invokevirtual   #36  <Method StringBuilder StringBuilder.append(String)>
	//   91  182:pop             
		obj1 = ((Object) (bufferedinputstream));
	//   92  183:aload           4
	//   93  185:astore          7
		bufferedoutputstream1 = bufferedoutputstream;
	//   94  187:aload           6
	//   95  189:astore          8
		stringbuilder.append(s);
	//   96  191:aload           9
	//   97  193:aload_1         
	//   98  194:invokevirtual   #36  <Method StringBuilder StringBuilder.append(String)>
	//   99  197:pop             
		obj1 = ((Object) (bufferedinputstream));
	//  100  198:aload           4
	//  101  200:astore          7
		bufferedoutputstream1 = bufferedoutputstream;
	//  102  202:aload           6
	//  103  204:astore          8
		stringbuilder.append("] to [");
	//  104  206:aload           9
	//  105  208:ldc1            #133 <String "] to [">
	//  106  210:invokevirtual   #36  <Method StringBuilder StringBuilder.append(String)>
	//  107  213:pop             
		obj1 = ((Object) (bufferedinputstream));
	//  108  214:aload           4
	//  109  216:astore          7
		bufferedoutputstream1 = bufferedoutputstream;
	//  110  218:aload           6
	//  111  220:astore          8
		stringbuilder.append(s1);
	//  112  222:aload           9
	//  113  224:aload_2         
	//  114  225:invokevirtual   #36  <Method StringBuilder StringBuilder.append(String)>
	//  115  228:pop             
		obj1 = ((Object) (bufferedinputstream));
	//  116  229:aload           4
	//  117  231:astore          7
		bufferedoutputstream1 = bufferedoutputstream;
	//  118  233:aload           6
	//  119  235:astore          8
		stringbuilder.append("]");
	//  120  237:aload           9
	//  121  239:ldc1            #72  <String "]">
	//  122  241:invokevirtual   #36  <Method StringBuilder StringBuilder.append(String)>
	//  123  244:pop             
		obj1 = ((Object) (bufferedinputstream));
	//  124  245:aload           4
	//  125  247:astore          7
		bufferedoutputstream1 = bufferedoutputstream;
	//  126  249:aload           6
	//  127  251:astore          8
		s = stringbuilder.toString();
	//  128  253:aload           9
	//  129  255:invokevirtual   #42  <Method String StringBuilder.toString()>
	//  130  258:astore_1        
		obj1 = ((Object) (bufferedinputstream));
	//  131  259:aload           4
	//  132  261:astore          7
		bufferedoutputstream1 = bufferedoutputstream;
	//  133  263:aload           6
	//  134  265:astore          8
		addError(s, ((Throwable) (ioexception)));
	//  135  267:aload_0         
	//  136  268:aload_1         
	//  137  269:aload           5
	//  138  271:invokevirtual   #136 <Method void addError(String, Throwable)>
		obj1 = ((Object) (bufferedinputstream));
	//  139  274:aload           4
	//  140  276:astore          7
		bufferedoutputstream1 = bufferedoutputstream;
	//  141  278:aload           6
	//  142  280:astore          8
		throw new RolloverFailure(s);
	//  143  282:new             #138 <Class RolloverFailure>
	//  144  285:dup             
	//  145  286:aload_1         
	//  146  287:invokespecial   #139 <Method void RolloverFailure(String)>
	//  147  290:athrow          
		s;
	//  148  291:astore_1        
		if(obj1 != null)
	//* 149  292:aload           7
	//* 150  294:ifnull          302
			try
			{
				((BufferedInputStream) (obj1)).close();
	//  151  297:aload           7
	//  152  299:invokevirtual   #128 <Method void BufferedInputStream.close()>
			}
	//* 153  302:aload           8
	//* 154  304:ifnull          312
	//* 155  307:aload           8
	//* 156  309:invokevirtual   #129 <Method void BufferedOutputStream.close()>
	//* 157  312:aload_1         
	//* 158  313:athrow          
			// Misplaced declaration of an exception variable
			catch(String s1) { }
	//  159  314:astore_2        
		if(bufferedoutputstream1 != null)
			try
			{
				bufferedoutputstream1.close();
			}
	//* 160  315:goto            302
			// Misplaced declaration of an exception variable
			catch(String s1) { }
	//  161  318:astore_2        
		throw s;
	//* 162  319:goto            312
	}

	static final int BUF_SIZE = 32768;
}

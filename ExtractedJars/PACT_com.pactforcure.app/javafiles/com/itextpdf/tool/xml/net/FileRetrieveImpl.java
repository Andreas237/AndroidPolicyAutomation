// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.tool.xml.net;

import com.itextpdf.text.log.*;
import com.itextpdf.tool.xml.exceptions.LocaleMessages;
import com.itextpdf.tool.xml.exceptions.RuntimeWorkerException;
import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

// Referenced classes of package com.itextpdf.tool.xml.net:
//			FileRetrieve, ReadingProcessor

public class FileRetrieveImpl
	implements FileRetrieve
{

	public FileRetrieveImpl()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #27  <Method void Object()>
		rootdirs = ((List) (new CopyOnWriteArrayList()));
	//    2    4:aload_0         
	//    3    5:new             #29  <Class CopyOnWriteArrayList>
	//    4    8:dup             
	//    5    9:invokespecial   #30  <Method void CopyOnWriteArrayList()>
	//    6   12:putfield        #32  <Field List rootdirs>
		urls = ((List) (new CopyOnWriteArrayList()));
	//    7   15:aload_0         
	//    8   16:new             #29  <Class CopyOnWriteArrayList>
	//    9   19:dup             
	//   10   20:invokespecial   #30  <Method void CopyOnWriteArrayList()>
	//   11   23:putfield        #34  <Field List urls>
	//   12   26:return          
	}

	public FileRetrieveImpl(File file)
	{
		this();
	//    0    0:aload_0         
	//    1    1:invokespecial   #36  <Method void FileRetrieveImpl()>
		if(file.isDirectory())
	//*   2    4:aload_1         
	//*   3    5:invokevirtual   #42  <Method boolean File.isDirectory()>
	//*   4    8:ifeq            22
			rootdirs.add(((Object) (file)));
	//    5   11:aload_0         
	//    6   12:getfield        #32  <Field List rootdirs>
	//    7   15:aload_1         
	//    8   16:invokeinterface #48  <Method boolean List.add(Object)>
	//    9   21:pop             
	//   10   22:return          
	}

	public transient FileRetrieveImpl(String as[])
	{
		this();
	//    0    0:aload_0         
	//    1    1:invokespecial   #36  <Method void FileRetrieveImpl()>
		int j = as.length;
	//    2    4:aload_1         
	//    3    5:arraylength     
	//    4    6:istore_3        
		int i = 0;
	//    5    7:iconst_0        
	//    6    8:istore_2        
		while(i < j) 
	//*   7    9:iload_2         
	//*   8   10:iload_3         
	//*   9   11:icmpge          92
		{
			Object obj = ((Object) (as[i]));
	//   10   14:aload_1         
	//   11   15:iload_2         
	//   12   16:aaload          
	//   13   17:astore          4
			if(((String) (obj)).startsWith("http") || ((String) (obj)).startsWith("https"))
	//*  14   19:aload           4
	//*  15   21:ldc1            #51  <String "http">
	//*  16   23:invokevirtual   #57  <Method boolean String.startsWith(String)>
	//*  17   26:ifne            39
	//*  18   29:aload           4
	//*  19   31:ldc1            #59  <String "https">
	//*  20   33:invokevirtual   #57  <Method boolean String.startsWith(String)>
	//*  21   36:ifeq            58
			{
				urls.add(obj);
	//   22   39:aload_0         
	//   23   40:getfield        #34  <Field List urls>
	//   24   43:aload           4
	//   25   45:invokeinterface #48  <Method boolean List.add(Object)>
	//   26   50:pop             
			} else
	//*  27   51:iload_2         
	//*  28   52:iconst_1        
	//*  29   53:iadd            
	//*  30   54:istore_2        
	//*  31   55:goto            9
			{
				obj = ((Object) (new File(((String) (obj)))));
	//   32   58:new             #38  <Class File>
	//   33   61:dup             
	//   34   62:aload           4
	//   35   64:invokespecial   #62  <Method void File(String)>
	//   36   67:astore          4
				if(((File) (obj)).isDirectory())
	//*  37   69:aload           4
	//*  38   71:invokevirtual   #42  <Method boolean File.isDirectory()>
	//*  39   74:ifeq            51
					rootdirs.add(obj);
	//   40   77:aload_0         
	//   41   78:getfield        #32  <Field List rootdirs>
	//   42   81:aload           4
	//   43   83:invokeinterface #48  <Method boolean List.add(Object)>
	//   44   88:pop             
			}
			i++;
		}
	//*  45   89:goto            51
	//   46   92:return          
	}

	private URL detectWithRootUrls(String s)
		throws MalformedURLException
	{
		Iterator iterator = urls.iterator();
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field List urls>
	//    2    4:invokeinterface #70  <Method Iterator List.iterator()>
	//    3    9:astore_2        
_L2:
		Object obj;
		if(!iterator.hasNext())
			break MISSING_BLOCK_LABEL_57;
	//    4   10:aload_2         
	//    5   11:invokeinterface #75  <Method boolean Iterator.hasNext()>
	//    6   16:ifeq            57
		obj = ((Object) ((String)iterator.next()));
	//    7   19:aload_2         
	//    8   20:invokeinterface #79  <Method Object Iterator.next()>
	//    9   25:checkcast       #53  <Class String>
	//   10   28:astore_3        
		obj = ((Object) (new URL((new StringBuilder()).append(((String) (obj))).append(s).toString())));
	//   11   29:new             #81  <Class URL>
	//   12   32:dup             
	//   13   33:new             #83  <Class StringBuilder>
	//   14   36:dup             
	//   15   37:invokespecial   #84  <Method void StringBuilder()>
	//   16   40:aload_3         
	//   17   41:invokevirtual   #88  <Method StringBuilder StringBuilder.append(String)>
	//   18   44:aload_1         
	//   19   45:invokevirtual   #88  <Method StringBuilder StringBuilder.append(String)>
	//   20   48:invokevirtual   #92  <Method String StringBuilder.toString()>
	//   21   51:invokespecial   #93  <Method void URL(String)>
	//   22   54:astore_3        
		return ((URL) (obj));
	//   23   55:aload_3         
	//   24   56:areturn         
		throw new MalformedURLException();
	//   25   57:new             #66  <Class MalformedURLException>
	//   26   60:dup             
	//   27   61:invokespecial   #94  <Method void MalformedURLException()>
	//   28   64:athrow          
		MalformedURLException malformedurlexception;
		malformedurlexception;
	//   29   65:astore_3        
		if(true) goto _L2; else goto _L1
_L1:
	//*  30   66:goto            10
	}

	private void read(ReadingProcessor readingprocessor, InputStream inputstream)
		throws IOException
	{
_L2:
		int i = inputstream.read();
	//    0    0:aload_2         
	//    1    1:invokevirtual   #104 <Method int InputStream.read()>
	//    2    4:istore_3        
		if(i == -1)
			break; /* Loop/switch isn't completed */
	//    3    5:iload_3         
	//    4    6:iconst_m1       
	//    5    7:icmpeq          34
		readingprocessor.process(i);
	//    6   10:aload_1         
	//    7   11:iload_3         
	//    8   12:invokeinterface #110 <Method void ReadingProcessor.process(int)>
		if(true) goto _L2; else goto _L1
	//    9   17:goto            0
		readingprocessor;
	//   10   20:astore_1        
		throw readingprocessor;
	//   11   21:aload_1         
	//   12   22:athrow          
		readingprocessor;
	//   13   23:astore_1        
		if(inputstream != null)
	//*  14   24:aload_2         
	//*  15   25:ifnull          32
			try
			{
				inputstream.close();
	//   16   28:aload_2         
	//   17   29:invokevirtual   #113 <Method void InputStream.close()>
			}
	//*  18   32:aload_1         
	//*  19   33:athrow          
	//*  20   34:aload_2         
	//*  21   35:ifnull          42
	//*  22   38:aload_2         
	//*  23   39:invokevirtual   #113 <Method void InputStream.close()>
	//*  24   42:return          
	//*  25   43:astore_1        
	//*  26   44:new             #115 <Class RuntimeWorkerException>
	//*  27   47:dup             
	//*  28   48:aload_1         
	//*  29   49:invokespecial   #118 <Method void RuntimeWorkerException(Throwable)>
	//*  30   52:athrow          
			// Misplaced declaration of an exception variable
			catch(ReadingProcessor readingprocessor)
	//*  31   53:astore_1        
			{
				throw new RuntimeWorkerException(((Throwable) (readingprocessor)));
	//   32   54:new             #115 <Class RuntimeWorkerException>
	//   33   57:dup             
	//   34   58:aload_1         
	//   35   59:invokespecial   #118 <Method void RuntimeWorkerException(Throwable)>
	//   36   62:athrow          
			}
		throw readingprocessor;
_L1:
		if(inputstream == null)
			break MISSING_BLOCK_LABEL_42;
		inputstream.close();
		return;
		readingprocessor;
		throw new RuntimeWorkerException(((Throwable) (readingprocessor)));
	}

	public void addRootDir(File file)
	{
		rootdirs.add(((Object) (file)));
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field List rootdirs>
	//    2    4:aload_1         
	//    3    5:invokeinterface #48  <Method boolean List.add(Object)>
	//    4   10:pop             
	//    5   11:return          
	}

	public void addURL(String s)
	{
		urls.add(((Object) (s)));
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field List urls>
	//    2    4:aload_1         
	//    3    5:invokeinterface #48  <Method boolean List.add(Object)>
	//    4   10:pop             
	//    5   11:return          
	}

	public void processFromHref(String s, ReadingProcessor readingprocessor)
		throws IOException
	{
		boolean flag;
		Object obj;
		if(LOGGER.isLogging(Level.DEBUG))
	//*   0    0:getstatic       #23  <Field Logger LOGGER>
	//*   1    3:getstatic       #128 <Field Level Level.DEBUG>
	//*   2    6:invokeinterface #134 <Method boolean Logger.isLogging(Level)>
	//*   3   11:ifeq            41
			LOGGER.debug(String.format(LocaleMessages.getInstance().getMessage("retrieve.file.from"), new Object[] {
				s
			}));
	//    4   14:getstatic       #23  <Field Logger LOGGER>
	//    5   17:invokestatic    #140 <Method LocaleMessages LocaleMessages.getInstance()>
	//    6   20:ldc1            #142 <String "retrieve.file.from">
	//    7   22:invokevirtual   #146 <Method String LocaleMessages.getMessage(String)>
	//    8   25:iconst_1        
	//    9   26:anewarray       Object[]
	//   10   29:dup             
	//   11   30:iconst_0        
	//   12   31:aload_1         
	//   13   32:aastore         
	//   14   33:invokestatic    #150 <Method String String.format(String, Object[])>
	//   15   36:invokeinterface #153 <Method void Logger.debug(String)>
		Object obj2 = null;
	//   16   41:aconst_null     
	//   17   42:astore          8
		obj = null;
	//   18   44:aconst_null     
	//   19   45:astore          5
		flag = false;
	//   20   47:iconst_0        
	//   21   48:istore_3        
		Object obj1;
		try
		{
			obj1 = ((Object) (new URL(s)));
	//   22   49:new             #81  <Class URL>
	//   23   52:dup             
	//   24   53:aload_1         
	//   25   54:invokespecial   #93  <Method void URL(String)>
	//   26   57:astore          6
		}
	//*  27   59:aload           6
	//*  28   61:ifnull          219
	//*  29   64:aload           6
	//*  30   66:invokevirtual   #157 <Method InputStream URL.openStream()>
	//*  31   69:astore_1        
	//*  32   70:aload_0         
	//*  33   71:aload_2         
	//*  34   72:aload_1         
	//*  35   73:invokespecial   #159 <Method void read(ReadingProcessor, InputStream)>
	//*  36   76:return          
		catch(MalformedURLException malformedurlexception)
	//*  37   77:astore          6
		{
			boolean flag1;
			Iterator iterator;
			try
			{
				malformedurlexception = ((MalformedURLException) (detectWithRootUrls(s)));
	//   38   79:aload_0         
	//   39   80:aload_1         
	//   40   81:invokespecial   #161 <Method URL detectWithRootUrls(String)>
	//   41   84:astore          6
				continue; /* Loop/switch isn't completed */
	//   42   86:goto            59
			}
			// Misplaced declaration of an exception variable
			catch(Object obj)
	//*  43   89:astore          5
			{
				File file = new File(s);
	//   44   91:new             #38  <Class File>
	//   45   94:dup             
	//   46   95:aload_1         
	//   47   96:invokespecial   #62  <Method void File(String)>
	//   48   99:astore          7
				flag = true;
	//   49  101:iconst_1        
	//   50  102:istore_3        
				if(file.isFile())
	//*  51  103:aload           7
	//*  52  105:invokevirtual   #164 <Method boolean File.isFile()>
	//*  53  108:ifeq            127
				{
					obj = ((Object) (file));
	//   54  111:aload           7
	//   55  113:astore          5
					malformedurlexception = ((MalformedURLException) (obj2));
	//   56  115:aload           8
	//   57  117:astore          6
					if(file.canRead())
						continue; /* Loop/switch isn't completed */
	//   58  119:aload           7
	//   59  121:invokevirtual   #167 <Method boolean File.canRead()>
	//   60  124:ifne            59
				}
				flag1 = false;
	//   61  127:iconst_0        
	//   62  128:istore          4
				iterator = rootdirs.iterator();
	//   63  130:aload_0         
	//   64  131:getfield        #32  <Field List rootdirs>
	//   65  134:invokeinterface #70  <Method Iterator List.iterator()>
	//   66  139:astore          9
				obj = ((Object) (file));
	//   67  141:aload           7
	//   68  143:astore          5
			}
			do
			{
				do
				{
					flag = flag1;
	//   69  145:iload           4
	//   70  147:istore_3        
					malformedurlexception = ((MalformedURLException) (obj2));
	//   71  148:aload           8
	//   72  150:astore          6
					if(!iterator.hasNext())
						continue; /* Loop/switch isn't completed */
	//   73  152:aload           9
	//   74  154:invokeinterface #75  <Method boolean Iterator.hasNext()>
	//   75  159:ifeq            59
					malformedurlexception = ((MalformedURLException) (new File((File)iterator.next(), s)));
	//   76  162:new             #38  <Class File>
	//   77  165:dup             
	//   78  166:aload           9
	//   79  168:invokeinterface #79  <Method Object Iterator.next()>
	//   80  173:checkcast       #38  <Class File>
	//   81  176:aload_1         
	//   82  177:invokespecial   #170 <Method void File(File, String)>
	//   83  180:astore          6
					obj = ((Object) (malformedurlexception));
	//   84  182:aload           6
	//   85  184:astore          5
				} while(!((File) (malformedurlexception)).isFile());
	//   86  186:aload           6
	//   87  188:invokevirtual   #164 <Method boolean File.isFile()>
	//   88  191:ifeq            145
				obj = ((Object) (malformedurlexception));
	//   89  194:aload           6
	//   90  196:astore          5
			} while(!((File) (malformedurlexception)).canRead());
	//   91  198:aload           6
	//   92  200:invokevirtual   #167 <Method boolean File.canRead()>
	//   93  203:ifeq            145
			flag = true;
	//   94  206:iconst_1        
	//   95  207:istore_3        
			obj = ((Object) (malformedurlexception));
	//   96  208:aload           6
	//   97  210:astore          5
			malformedurlexception = ((MalformedURLException) (obj2));
	//   98  212:aload           8
	//   99  214:astore          6
			continue; /* Loop/switch isn't completed */
	//  100  216:goto            59
		}
_L6:
		if(obj1 == null) goto _L2; else goto _L1
_L1:
		s = ((String) (((URL) (obj1)).openStream()));
_L4:
		read(readingprocessor, ((InputStream) (s)));
		return;
_L2:
		if(!flag)
			break; /* Loop/switch isn't completed */
	//  101  219:iload_3         
	//  102  220:ifeq            236
		s = ((String) (new FileInputStream(((File) (obj)))));
	//  103  223:new             #172 <Class FileInputStream>
	//  104  226:dup             
	//  105  227:aload           5
	//  106  229:invokespecial   #174 <Method void FileInputStream(File)>
	//  107  232:astore_1        
		if(true) goto _L4; else goto _L3
	//  108  233:goto            70
_L3:
		throw new IOException(LocaleMessages.getInstance().getMessage("retrieve.file.from.nothing"));
	//  109  236:new             #99  <Class IOException>
	//  110  239:dup             
	//  111  240:invokestatic    #140 <Method LocaleMessages LocaleMessages.getInstance()>
	//  112  243:ldc1            #176 <String "retrieve.file.from.nothing">
	//  113  245:invokevirtual   #146 <Method String LocaleMessages.getMessage(String)>
	//  114  248:invokespecial   #177 <Method void IOException(String)>
	//  115  251:athrow          
		if(true) goto _L6; else goto _L5
_L5:
	}

	public void processFromStream(InputStream inputstream, ReadingProcessor readingprocessor)
		throws IOException
	{
		read(readingprocessor, inputstream);
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:aload_1         
	//    3    3:invokespecial   #159 <Method void read(ReadingProcessor, InputStream)>
	//    4    6:return          
	}

	private static final Logger LOGGER = LoggerFactory.getLogger(com/itextpdf/tool/xml/net/FileRetrieveImpl);
	private final List rootdirs;
	private final List urls;

	static 
	{
	//    0    0:ldc1            #2   <Class FileRetrieveImpl>
	//    1    2:invokestatic    #21  <Method Logger LoggerFactory.getLogger(Class)>
	//    2    5:putstatic       #23  <Field Logger LOGGER>
	//*   3    8:return          
	}
}

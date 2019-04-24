// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package ch.qos.logback.classic.util;

import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.classic.joran.JoranConfigurator;
import ch.qos.logback.core.android.CommonPathUtil;
import ch.qos.logback.core.status.InfoStatus;
import ch.qos.logback.core.status.StatusManager;
import ch.qos.logback.core.util.Loader;
import ch.qos.logback.core.util.OptionHelper;
import java.io.File;
import java.io.InputStream;
import java.net.*;

// Referenced classes of package ch.qos.logback.classic.util:
//			StatusListenerConfigHelper

public class ContextInitializer
{

	public ContextInitializer(LoggerContext loggercontext)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #34  <Method void Object()>
		loggerContext = loggercontext;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #36  <Field LoggerContext loggerContext>
	//    5    9:aload_0         
	//    6   10:aload_0         
	//    7   11:invokestatic    #42  <Method ClassLoader Loader.getClassLoaderOfObject(Object)>
	//    8   14:putfield        #44  <Field ClassLoader classLoader>
	//    9   17:return          
	}

	private URL findConfigFileFromSystemProperties(boolean flag)
	{
		Object obj;
		Object obj1;
		String s;
		s = OptionHelper.getSystemProperty("logback.configurationFile");
	//    0    0:ldc1            #12  <String "logback.configurationFile">
	//    1    2:invokestatic    #54  <Method String OptionHelper.getSystemProperty(String)>
	//    2    5:astore          5
		obj = null;
	//    3    7:aconst_null     
	//    4    8:astore_2        
		obj1 = null;
	//    5    9:aconst_null     
	//    6   10:astore_3        
		if(s == null) goto _L2; else goto _L1
	//    7   11:aload           5
	//    8   13:ifnull          219
_L1:
		Object obj2;
		obj2 = ((Object) (new File(s)));
	//    9   16:new             #56  <Class File>
	//   10   19:dup             
	//   11   20:aload           5
	//   12   22:invokespecial   #59  <Method void File(String)>
	//   13   25:astore          4
		if(!((File) (obj2)).exists() || !((File) (obj2)).isFile())
			break MISSING_BLOCK_LABEL_75;
	//   14   27:aload           4
	//   15   29:invokevirtual   #63  <Method boolean File.exists()>
	//   16   32:ifeq            75
	//   17   35:aload           4
	//   18   37:invokevirtual   #66  <Method boolean File.isFile()>
	//   19   40:ifeq            75
		if(!flag)
			break MISSING_BLOCK_LABEL_59;
	//   20   43:iload_1         
	//   21   44:ifeq            59
		statusOnResourceSearch(s, classLoader, s);
	//   22   47:aload_0         
	//   23   48:aload           5
	//   24   50:aload_0         
	//   25   51:getfield        #44  <Field ClassLoader classLoader>
	//   26   54:aload           5
	//   27   56:invokespecial   #70  <Method void statusOnResourceSearch(String, ClassLoader, String)>
		obj2 = ((Object) (((File) (obj2)).toURI().toURL()));
	//   28   59:aload           4
	//   29   61:invokevirtual   #74  <Method URI File.toURI()>
	//   30   64:invokevirtual   #80  <Method URL URI.toURL()>
	//   31   67:astore          4
		obj = obj2;
	//   32   69:aload           4
	//   33   71:astore_2        
		break MISSING_BLOCK_LABEL_89;
	//   34   72:goto            89
		obj2 = ((Object) (new URL(s)));
	//   35   75:new             #82  <Class URL>
	//   36   78:dup             
	//   37   79:aload           5
	//   38   81:invokespecial   #83  <Method void URL(String)>
	//   39   84:astore          4
		obj = obj2;
	//   40   86:aload           4
	//   41   88:astore_2        
		if(flag)
	//*  42   89:iload_1         
	//*  43   90:ifeq            117
		{
			ClassLoader classloader = classLoader;
	//   44   93:aload_0         
	//   45   94:getfield        #44  <Field ClassLoader classLoader>
	//   46   97:astore          4
			if(obj != null)
	//*  47   99:aload_2         
	//*  48  100:ifnull          108
				obj1 = ((Object) (((URL) (obj)).toString()));
	//   49  103:aload_2         
	//   50  104:invokevirtual   #86  <Method String URL.toString()>
	//   51  107:astore_3        
			statusOnResourceSearch(s, classloader, ((String) (obj1)));
	//   52  108:aload_0         
	//   53  109:aload           5
	//   54  111:aload           4
	//   55  113:aload_3         
	//   56  114:invokespecial   #70  <Method void statusOnResourceSearch(String, ClassLoader, String)>
		}
		return ((URL) (obj));
	//   57  117:aload_2         
	//   58  118:areturn         
		obj;
	//   59  119:astore_2        
		  goto _L3
	//*  60  120:goto            202
_L5:
		obj1 = ((Object) (Loader.getResource(s, classLoader)));
	//   61  123:aload           5
	//   62  125:aload_0         
	//   63  126:getfield        #44  <Field ClassLoader classLoader>
	//   64  129:invokestatic    #90  <Method URL Loader.getResource(String, ClassLoader)>
	//   65  132:astore_3        
		if(obj1 != null)
	//*  66  133:aload_3         
	//*  67  134:ifnull          167
		{
			if(flag)
	//*  68  137:iload_1         
	//*  69  138:ifeq            165
			{
				ClassLoader classloader1 = classLoader;
	//   70  141:aload_0         
	//   71  142:getfield        #44  <Field ClassLoader classLoader>
	//   72  145:astore          4
				if(obj1 != null)
	//*  73  147:aload_3         
	//*  74  148:ifnull          156
					obj = ((Object) (((URL) (obj1)).toString()));
	//   75  151:aload_3         
	//   76  152:invokevirtual   #86  <Method String URL.toString()>
	//   77  155:astore_2        
				statusOnResourceSearch(s, classloader1, ((String) (obj)));
	//   78  156:aload_0         
	//   79  157:aload           5
	//   80  159:aload           4
	//   81  161:aload_2         
	//   82  162:invokespecial   #70  <Method void statusOnResourceSearch(String, ClassLoader, String)>
			}
			return ((URL) (obj1));
	//   83  165:aload_3         
	//   84  166:areturn         
		}
		if(flag)
	//*  85  167:iload_1         
	//*  86  168:ifeq            219
		{
			ClassLoader classloader2 = classLoader;
	//   87  171:aload_0         
	//   88  172:getfield        #44  <Field ClassLoader classLoader>
	//   89  175:astore          4
			if(obj1 != null)
	//*  90  177:aload_3         
	//*  91  178:ifnull          189
				obj = ((Object) (((URL) (obj1)).toString()));
	//   92  181:aload_3         
	//   93  182:invokevirtual   #86  <Method String URL.toString()>
	//   94  185:astore_2        
			else
	//*  95  186:goto            191
				obj = null;
	//   96  189:aconst_null     
	//   97  190:astore_2        
			statusOnResourceSearch(s, classloader2, ((String) (obj)));
	//   98  191:aload_0         
	//   99  192:aload           5
	//  100  194:aload           4
	//  101  196:aload_2         
	//  102  197:invokespecial   #70  <Method void statusOnResourceSearch(String, ClassLoader, String)>
			return null;
	//  103  200:aconst_null     
	//  104  201:areturn         
		}
		  goto _L2
_L3:
		if(flag)
	//* 105  202:iload_1         
	//* 106  203:ifeq            217
			statusOnResourceSearch(s, classLoader, ((String) (null)));
	//  107  206:aload_0         
	//  108  207:aload           5
	//  109  209:aload_0         
	//  110  210:getfield        #44  <Field ClassLoader classLoader>
	//  111  213:aconst_null     
	//  112  214:invokespecial   #70  <Method void statusOnResourceSearch(String, ClassLoader, String)>
		throw obj;
	//  113  217:aload_2         
	//  114  218:athrow          
_L2:
		return null;
	//  115  219:aconst_null     
	//  116  220:areturn         
		MalformedURLException malformedurlexception;
		malformedurlexception;
	//  117  221:astore_3        
		if(true) goto _L5; else goto _L4
_L4:
	//* 118  222:goto            123
	}

	private InputStream findConfigFileURLFromAssets(boolean flag)
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #94  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #95  <Method void StringBuilder()>
	//    3    7:astore_2        
		stringbuilder.append(ASSETS_DIR);
	//    4    8:aload_2         
	//    5    9:getstatic       #29  <Field String ASSETS_DIR>
	//    6   12:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//    7   15:pop             
		stringbuilder.append("/");
	//    8   16:aload_2         
	//    9   17:ldc1            #101 <String "/">
	//   10   19:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//   11   22:pop             
		stringbuilder.append("logback.xml");
	//   12   23:aload_2         
	//   13   24:ldc1            #9   <String "logback.xml">
	//   14   26:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//   15   29:pop             
		return getResource(stringbuilder.toString(), classLoader, flag);
	//   16   30:aload_0         
	//   17   31:aload_2         
	//   18   32:invokevirtual   #102 <Method String StringBuilder.toString()>
	//   19   35:aload_0         
	//   20   36:getfield        #44  <Field ClassLoader classLoader>
	//   21   39:iload_1         
	//   22   40:invokespecial   #105 <Method InputStream getResource(String, ClassLoader, boolean)>
	//   23   43:areturn         
	}

	private InputStream getResource(String s, ClassLoader classloader, boolean flag)
	{
		InputStream inputstream = classloader.getResourceAsStream(s);
	//    0    0:aload_2         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #111 <Method InputStream ClassLoader.getResourceAsStream(String)>
	//    3    5:astore          5
		if(flag)
	//*   4    7:iload_3         
	//*   5    8:ifeq            30
		{
			String s1 = null;
	//    6   11:aconst_null     
	//    7   12:astore          4
			if(inputstream != null)
	//*   8   14:aload           5
	//*   9   16:ifnull          22
				s1 = s;
	//   10   19:aload_1         
	//   11   20:astore          4
			statusOnResourceSearch(s, classloader, s1);
	//   12   22:aload_0         
	//   13   23:aload_1         
	//   14   24:aload_2         
	//   15   25:aload           4
	//   16   27:invokespecial   #70  <Method void statusOnResourceSearch(String, ClassLoader, String)>
		}
		return inputstream;
	//   17   30:aload           5
	//   18   32:areturn         
	}

	private void statusOnResourceSearch(String s, ClassLoader classloader, String s1)
	{
		classloader = ((ClassLoader) (loggerContext.getStatusManager()));
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field LoggerContext loggerContext>
	//    2    4:invokevirtual   #117 <Method StatusManager LoggerContext.getStatusManager()>
	//    3    7:astore_2        
		if(s1 == null)
	//*   4    8:aload_3         
	//*   5    9:ifnonnull       62
		{
			s1 = ((String) (new StringBuilder()));
	//    6   12:new             #94  <Class StringBuilder>
	//    7   15:dup             
	//    8   16:invokespecial   #95  <Method void StringBuilder()>
	//    9   19:astore_3        
			((StringBuilder) (s1)).append("Could NOT find resource [");
	//   10   20:aload_3         
	//   11   21:ldc1            #119 <String "Could NOT find resource [">
	//   12   23:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//   13   26:pop             
			((StringBuilder) (s1)).append(s);
	//   14   27:aload_3         
	//   15   28:aload_1         
	//   16   29:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//   17   32:pop             
			((StringBuilder) (s1)).append("]");
	//   18   33:aload_3         
	//   19   34:ldc1            #121 <String "]">
	//   20   36:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//   21   39:pop             
			((StatusManager) (classloader)).add(((ch.qos.logback.core.status.Status) (new InfoStatus(((StringBuilder) (s1)).toString(), ((Object) (loggerContext))))));
	//   22   40:aload_2         
	//   23   41:new             #123 <Class InfoStatus>
	//   24   44:dup             
	//   25   45:aload_3         
	//   26   46:invokevirtual   #102 <Method String StringBuilder.toString()>
	//   27   49:aload_0         
	//   28   50:getfield        #36  <Field LoggerContext loggerContext>
	//   29   53:invokespecial   #126 <Method void InfoStatus(String, Object)>
	//   30   56:invokeinterface #132 <Method void StatusManager.add(ch.qos.logback.core.status.Status)>
			return;
	//   31   61:return          
		} else
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   32   62:new             #94  <Class StringBuilder>
	//   33   65:dup             
	//   34   66:invokespecial   #95  <Method void StringBuilder()>
	//   35   69:astore          4
			stringbuilder.append("Found resource [");
	//   36   71:aload           4
	//   37   73:ldc1            #134 <String "Found resource [">
	//   38   75:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//   39   78:pop             
			stringbuilder.append(s);
	//   40   79:aload           4
	//   41   81:aload_1         
	//   42   82:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//   43   85:pop             
			stringbuilder.append("] at [");
	//   44   86:aload           4
	//   45   88:ldc1            #136 <String "] at [">
	//   46   90:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//   47   93:pop             
			stringbuilder.append(s1);
	//   48   94:aload           4
	//   49   96:aload_3         
	//   50   97:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//   51  100:pop             
			stringbuilder.append("]");
	//   52  101:aload           4
	//   53  103:ldc1            #121 <String "]">
	//   54  105:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//   55  108:pop             
			((StatusManager) (classloader)).add(((ch.qos.logback.core.status.Status) (new InfoStatus(stringbuilder.toString(), ((Object) (loggerContext))))));
	//   56  109:aload_2         
	//   57  110:new             #123 <Class InfoStatus>
	//   58  113:dup             
	//   59  114:aload           4
	//   60  116:invokevirtual   #102 <Method String StringBuilder.toString()>
	//   61  119:aload_0         
	//   62  120:getfield        #36  <Field LoggerContext loggerContext>
	//   63  123:invokespecial   #126 <Method void InfoStatus(String, Object)>
	//   64  126:invokeinterface #132 <Method void StatusManager.add(ch.qos.logback.core.status.Status)>
			return;
	//   65  131:return          
		}
	}

	public void autoConfig()
	{
		StatusListenerConfigHelper.installIfAsked(loggerContext);
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field LoggerContext loggerContext>
	//    2    4:invokestatic    #142 <Method void StatusListenerConfigHelper.installIfAsked(LoggerContext)>
		JoranConfigurator joranconfigurator = new JoranConfigurator();
	//    3    7:new             #144 <Class JoranConfigurator>
	//    4   10:dup             
	//    5   11:invokespecial   #145 <Method void JoranConfigurator()>
	//    6   14:astore_2        
		joranconfigurator.setContext(((ch.qos.logback.core.Context) (loggerContext)));
	//    7   15:aload_2         
	//    8   16:aload_0         
	//    9   17:getfield        #36  <Field LoggerContext loggerContext>
	//   10   20:invokevirtual   #149 <Method void JoranConfigurator.setContext(ch.qos.logback.core.Context)>
		URL url = findConfigFileFromSystemProperties(true);
	//   11   23:aload_0         
	//   12   24:iconst_1        
	//   13   25:invokespecial   #151 <Method URL findConfigFileFromSystemProperties(boolean)>
	//   14   28:astore_3        
		boolean flag;
		if(url != null)
	//*  15   29:aload_3         
	//*  16   30:ifnull          43
		{
			joranconfigurator.doConfigure(url);
	//   17   33:aload_2         
	//   18   34:aload_3         
	//   19   35:invokevirtual   #155 <Method void JoranConfigurator.doConfigure(URL)>
			flag = true;
	//   20   38:iconst_1        
	//   21   39:istore_1        
		} else
	//*  22   40:goto            45
		{
			flag = false;
	//   23   43:iconst_0        
	//   24   44:istore_1        
		}
		if(!flag)
	//*  25   45:iload_1         
	//*  26   46:ifne            64
		{
			InputStream inputstream = findConfigFileURLFromAssets(true);
	//   27   49:aload_0         
	//   28   50:iconst_1        
	//   29   51:invokespecial   #157 <Method InputStream findConfigFileURLFromAssets(boolean)>
	//   30   54:astore_3        
			if(inputstream != null)
	//*  31   55:aload_3         
	//*  32   56:ifnull          64
				joranconfigurator.doConfigure(inputstream);
	//   33   59:aload_2         
	//   34   60:aload_3         
	//   35   61:invokevirtual   #160 <Method void JoranConfigurator.doConfigure(InputStream)>
		}
	//   36   64:return          
	}

	private static final String ASSETS_DIR = CommonPathUtil.getAssetsDirectoryPath();
	public static final String AUTOCONFIG_FILE = "logback.xml";
	public static final String CONFIG_FILE_PROPERTY = "logback.configurationFile";
	public static final String STATUS_LISTENER_CLASS = "logback.statusListenerClass";
	final ClassLoader classLoader = Loader.getClassLoaderOfObject(((Object) (this)));
	final LoggerContext loggerContext;

	static 
	{
	//    0    0:invokestatic    #27  <Method String CommonPathUtil.getAssetsDirectoryPath()>
	//    1    3:putstatic       #29  <Field String ASSETS_DIR>
	//*   2    6:return          
	}
}

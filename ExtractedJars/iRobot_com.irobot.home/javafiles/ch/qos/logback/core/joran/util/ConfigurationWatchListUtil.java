// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package ch.qos.logback.core.joran.util;

import ch.qos.logback.core.Context;
import ch.qos.logback.core.joran.spi.ConfigurationWatchList;
import ch.qos.logback.core.status.*;
import java.io.PrintStream;
import java.net.URL;

public class ConfigurationWatchListUtil
{

	private ConfigurationWatchListUtil()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
	//    2    4:return          
	}

	static void addInfo(Context context, String s)
	{
		addStatus(context, ((Status) (new InfoStatus(s, ((Object) (origin))))));
	//    0    0:aload_0         
	//    1    1:new             #19  <Class InfoStatus>
	//    2    4:dup             
	//    3    5:aload_1         
	//    4    6:getstatic       #13  <Field ConfigurationWatchListUtil origin>
	//    5    9:invokespecial   #22  <Method void InfoStatus(String, Object)>
	//    6   12:invokestatic    #26  <Method void addStatus(Context, Status)>
	//    7   15:return          
	}

	static void addStatus(Context context, Status status)
	{
		if(context == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       42
		{
			context = ((Context) (System.out));
	//    2    4:getstatic       #32  <Field PrintStream System.out>
	//    3    7:astore_0        
			status = ((Status) (new StringBuilder()));
	//    4    8:new             #34  <Class StringBuilder>
	//    5   11:dup             
	//    6   12:invokespecial   #35  <Method void StringBuilder()>
	//    7   15:astore_1        
			((StringBuilder) (status)).append("Null context in ");
	//    8   16:aload_1         
	//    9   17:ldc1            #37  <String "Null context in ">
	//   10   19:invokevirtual   #41  <Method StringBuilder StringBuilder.append(String)>
	//   11   22:pop             
			((StringBuilder) (status)).append(((Class) (ch/qos/logback/core/joran/spi/ConfigurationWatchList)).getName());
	//   12   23:aload_1         
	//   13   24:ldc1            #43  <Class ConfigurationWatchList>
	//   14   26:invokevirtual   #49  <Method String Class.getName()>
	//   15   29:invokevirtual   #41  <Method StringBuilder StringBuilder.append(String)>
	//   16   32:pop             
			((PrintStream) (context)).println(((StringBuilder) (status)).toString());
	//   17   33:aload_0         
	//   18   34:aload_1         
	//   19   35:invokevirtual   #52  <Method String StringBuilder.toString()>
	//   20   38:invokevirtual   #58  <Method void PrintStream.println(String)>
			return;
	//   21   41:return          
		}
		context = ((Context) (context.getStatusManager()));
	//   22   42:aload_0         
	//   23   43:invokeinterface #64  <Method StatusManager Context.getStatusManager()>
	//   24   48:astore_0        
		if(context == null)
	//*  25   49:aload_0         
	//*  26   50:ifnonnull       54
		{
			return;
	//   27   53:return          
		} else
		{
			((StatusManager) (context)).add(status);
	//   28   54:aload_0         
	//   29   55:aload_1         
	//   30   56:invokeinterface #70  <Method void StatusManager.add(Status)>
			return;
	//   31   61:return          
		}
	}

	public static void addToWatchList(Context context, URL url)
	{
		Object obj = ((Object) (getConfigurationWatchList(context)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #76  <Method ConfigurationWatchList getConfigurationWatchList(Context)>
	//    2    4:astore_2        
		if(obj == null)
	//*   3    5:aload_2         
	//*   4    6:ifnonnull       39
		{
			obj = ((Object) (new StringBuilder()));
	//    5    9:new             #34  <Class StringBuilder>
	//    6   12:dup             
	//    7   13:invokespecial   #35  <Method void StringBuilder()>
	//    8   16:astore_2        
			((StringBuilder) (obj)).append("Null ConfigurationWatchList. Cannot add ");
	//    9   17:aload_2         
	//   10   18:ldc1            #78  <String "Null ConfigurationWatchList. Cannot add ">
	//   11   20:invokevirtual   #41  <Method StringBuilder StringBuilder.append(String)>
	//   12   23:pop             
			((StringBuilder) (obj)).append(((Object) (url)));
	//   13   24:aload_2         
	//   14   25:aload_1         
	//   15   26:invokevirtual   #81  <Method StringBuilder StringBuilder.append(Object)>
	//   16   29:pop             
			addWarn(context, ((StringBuilder) (obj)).toString());
	//   17   30:aload_0         
	//   18   31:aload_2         
	//   19   32:invokevirtual   #52  <Method String StringBuilder.toString()>
	//   20   35:invokestatic    #84  <Method void addWarn(Context, String)>
			return;
	//   21   38:return          
		} else
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   22   39:new             #34  <Class StringBuilder>
	//   23   42:dup             
	//   24   43:invokespecial   #35  <Method void StringBuilder()>
	//   25   46:astore_3        
			stringbuilder.append("Adding [");
	//   26   47:aload_3         
	//   27   48:ldc1            #86  <String "Adding [">
	//   28   50:invokevirtual   #41  <Method StringBuilder StringBuilder.append(String)>
	//   29   53:pop             
			stringbuilder.append(((Object) (url)));
	//   30   54:aload_3         
	//   31   55:aload_1         
	//   32   56:invokevirtual   #81  <Method StringBuilder StringBuilder.append(Object)>
	//   33   59:pop             
			stringbuilder.append("] to configuration watch list.");
	//   34   60:aload_3         
	//   35   61:ldc1            #88  <String "] to configuration watch list.">
	//   36   63:invokevirtual   #41  <Method StringBuilder StringBuilder.append(String)>
	//   37   66:pop             
			addInfo(context, stringbuilder.toString());
	//   38   67:aload_0         
	//   39   68:aload_3         
	//   40   69:invokevirtual   #52  <Method String StringBuilder.toString()>
	//   41   72:invokestatic    #90  <Method void addInfo(Context, String)>
			((ConfigurationWatchList) (obj)).addToWatchList(url);
	//   42   75:aload_2         
	//   43   76:aload_1         
	//   44   77:invokevirtual   #93  <Method void ConfigurationWatchList.addToWatchList(URL)>
			return;
	//   45   80:return          
		}
	}

	static void addWarn(Context context, String s)
	{
		addStatus(context, ((Status) (new WarnStatus(s, ((Object) (origin))))));
	//    0    0:aload_0         
	//    1    1:new             #95  <Class WarnStatus>
	//    2    4:dup             
	//    3    5:aload_1         
	//    4    6:getstatic       #13  <Field ConfigurationWatchListUtil origin>
	//    5    9:invokespecial   #96  <Method void WarnStatus(String, Object)>
	//    6   12:invokestatic    #26  <Method void addStatus(Context, Status)>
	//    7   15:return          
	}

	public static ConfigurationWatchList getConfigurationWatchList(Context context)
	{
		if(context == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		else
			return (ConfigurationWatchList)context.getObject("CONFIGURATION_WATCH_LIST");
	//    4    6:aload_0         
	//    5    7:ldc1            #98  <String "CONFIGURATION_WATCH_LIST">
	//    6    9:invokeinterface #102 <Method Object Context.getObject(String)>
	//    7   14:checkcast       #43  <Class ConfigurationWatchList>
	//    8   17:areturn         
	}

	public static URL getMainWatchURL(Context context)
	{
		context = ((Context) (getConfigurationWatchList(context)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #76  <Method ConfigurationWatchList getConfigurationWatchList(Context)>
	//    2    4:astore_0        
		if(context == null)
	//*   3    5:aload_0         
	//*   4    6:ifnonnull       11
			return null;
	//    5    9:aconst_null     
	//    6   10:areturn         
		else
			return ((ConfigurationWatchList) (context)).getMainURL();
	//    7   11:aload_0         
	//    8   12:invokevirtual   #108 <Method URL ConfigurationWatchList.getMainURL()>
	//    9   15:areturn         
	}

	public static void setConfigurationWatchListResetFlag(Context context, boolean flag)
	{
		context.putObject("CONFIGURATION_WATCH_LIST_RESET", ((Object) (Boolean.valueOf(flag))));
	//    0    0:aload_0         
	//    1    1:ldc1            #112 <String "CONFIGURATION_WATCH_LIST_RESET">
	//    2    3:iload_1         
	//    3    4:invokestatic    #118 <Method Boolean Boolean.valueOf(boolean)>
	//    4    7:invokeinterface #121 <Method void Context.putObject(String, Object)>
	//    5   12:return          
	}

	public static void setMainWatchURL(Context context, URL url)
	{
		if(context == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       5
			return;
	//    2    4:return          
		ConfigurationWatchList configurationwatchlist = getConfigurationWatchList(context);
	//    3    5:aload_0         
	//    4    6:invokestatic    #76  <Method ConfigurationWatchList getConfigurationWatchList(Context)>
	//    5    9:astore_2        
		if(configurationwatchlist == null)
	//*   6   10:aload_2         
	//*   7   11:ifnonnull       39
		{
			configurationwatchlist = new ConfigurationWatchList();
	//    8   14:new             #43  <Class ConfigurationWatchList>
	//    9   17:dup             
	//   10   18:invokespecial   #123 <Method void ConfigurationWatchList()>
	//   11   21:astore_2        
			configurationwatchlist.setContext(context);
	//   12   22:aload_2         
	//   13   23:aload_0         
	//   14   24:invokevirtual   #127 <Method void ConfigurationWatchList.setContext(Context)>
			context.putObject("CONFIGURATION_WATCH_LIST", ((Object) (configurationwatchlist)));
	//   15   27:aload_0         
	//   16   28:ldc1            #98  <String "CONFIGURATION_WATCH_LIST">
	//   17   30:aload_2         
	//   18   31:invokeinterface #121 <Method void Context.putObject(String, Object)>
		} else
	//*  19   36:goto            43
		{
			configurationwatchlist.clear();
	//   20   39:aload_2         
	//   21   40:invokevirtual   #130 <Method void ConfigurationWatchList.clear()>
		}
		setConfigurationWatchListResetFlag(context, true);
	//   22   43:aload_0         
	//   23   44:iconst_1        
	//   24   45:invokestatic    #132 <Method void setConfigurationWatchListResetFlag(Context, boolean)>
		configurationwatchlist.setMainURL(url);
	//   25   48:aload_2         
	//   26   49:aload_1         
	//   27   50:invokevirtual   #135 <Method void ConfigurationWatchList.setMainURL(URL)>
	//   28   53:return          
	}

	public static boolean wasConfigurationWatchListReset(Context context)
	{
		if(context == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return false;
	//    2    4:iconst_0        
	//    3    5:ireturn         
		context = ((Context) (context.getObject("CONFIGURATION_WATCH_LIST_RESET")));
	//    4    6:aload_0         
	//    5    7:ldc1            #112 <String "CONFIGURATION_WATCH_LIST_RESET">
	//    6    9:invokeinterface #102 <Method Object Context.getObject(String)>
	//    7   14:astore_0        
		if(context == null)
	//*   8   15:aload_0         
	//*   9   16:ifnonnull       21
			return false;
	//   10   19:iconst_0        
	//   11   20:ireturn         
		else
			return ((Boolean)context).booleanValue();
	//   12   21:aload_0         
	//   13   22:checkcast       #114 <Class Boolean>
	//   14   25:invokevirtual   #141 <Method boolean Boolean.booleanValue()>
	//   15   28:ireturn         
	}

	static final ConfigurationWatchListUtil origin = new ConfigurationWatchListUtil();

	static 
	{
	//    0    0:new             #2   <Class ConfigurationWatchListUtil>
	//    1    3:dup             
	//    2    4:invokespecial   #11  <Method void ConfigurationWatchListUtil()>
	//    3    7:putstatic       #13  <Field ConfigurationWatchListUtil origin>
	//*   4   10:return          
	}
}

// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package ch.qos.logback.core.joran.spi;

import ch.qos.logback.core.spi.ContextAwareBase;
import java.io.File;
import java.net.URL;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.List;

public class ConfigurationWatchList extends ContextAwareBase
{

	public ConfigurationWatchList()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void ContextAwareBase()>
		fileWatchList = ((List) (new ArrayList()));
	//    2    4:aload_0         
	//    3    5:new             #17  <Class ArrayList>
	//    4    8:dup             
	//    5    9:invokespecial   #18  <Method void ArrayList()>
	//    6   12:putfield        #20  <Field List fileWatchList>
		lastModifiedList = ((List) (new ArrayList()));
	//    7   15:aload_0         
	//    8   16:new             #17  <Class ArrayList>
	//    9   19:dup             
	//   10   20:invokespecial   #18  <Method void ArrayList()>
	//   11   23:putfield        #22  <Field List lastModifiedList>
	//   12   26:return          
	}

	private void addAsFileToWatch(URL url)
	{
		url = ((URL) (convertToFile(url)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #29  <Method File convertToFile(URL)>
	//    3    5:astore_1        
		if(url != null)
	//*   4    6:aload_1         
	//*   5    7:ifnull          38
		{
			fileWatchList.add(((Object) (url)));
	//    6   10:aload_0         
	//    7   11:getfield        #20  <Field List fileWatchList>
	//    8   14:aload_1         
	//    9   15:invokeinterface #35  <Method boolean List.add(Object)>
	//   10   20:pop             
			lastModifiedList.add(((Object) (Long.valueOf(((File) (url)).lastModified()))));
	//   11   21:aload_0         
	//   12   22:getfield        #22  <Field List lastModifiedList>
	//   13   25:aload_1         
	//   14   26:invokevirtual   #41  <Method long File.lastModified()>
	//   15   29:invokestatic    #47  <Method Long Long.valueOf(long)>
	//   16   32:invokeinterface #35  <Method boolean List.add(Object)>
	//   17   37:pop             
		}
	//   18   38:return          
	}

	public void addToWatchList(URL url)
	{
		addAsFileToWatch(url);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #50  <Method void addAsFileToWatch(URL)>
	//    3    5:return          
	}

	public boolean changeDetected()
	{
		int j = fileWatchList.size();
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field List fileWatchList>
	//    2    4:invokeinterface #56  <Method int List.size()>
	//    3    9:istore_2        
		for(int i = 0; i < j; i++)
	//*   4   10:iconst_0        
	//*   5   11:istore_1        
	//*   6   12:iload_1         
	//*   7   13:iload_2         
	//*   8   14:icmpge          62
			if(((Long)lastModifiedList.get(i)).longValue() != ((File)fileWatchList.get(i)).lastModified())
	//*   9   17:aload_0         
	//*  10   18:getfield        #22  <Field List lastModifiedList>
	//*  11   21:iload_1         
	//*  12   22:invokeinterface #60  <Method Object List.get(int)>
	//*  13   27:checkcast       #43  <Class Long>
	//*  14   30:invokevirtual   #63  <Method long Long.longValue()>
	//*  15   33:aload_0         
	//*  16   34:getfield        #20  <Field List fileWatchList>
	//*  17   37:iload_1         
	//*  18   38:invokeinterface #60  <Method Object List.get(int)>
	//*  19   43:checkcast       #37  <Class File>
	//*  20   46:invokevirtual   #41  <Method long File.lastModified()>
	//*  21   49:lcmp            
	//*  22   50:ifeq            55
				return true;
	//   23   53:iconst_1        
	//   24   54:ireturn         

	//   25   55:iload_1         
	//   26   56:iconst_1        
	//   27   57:iadd            
	//   28   58:istore_1        
	//*  29   59:goto            12
		return false;
	//   30   62:iconst_0        
	//   31   63:ireturn         
	}

	public void clear()
	{
		mainURL = null;
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:putfield        #66  <Field URL mainURL>
		lastModifiedList.clear();
	//    3    5:aload_0         
	//    4    6:getfield        #22  <Field List lastModifiedList>
	//    5    9:invokeinterface #68  <Method void List.clear()>
		fileWatchList.clear();
	//    6   14:aload_0         
	//    7   15:getfield        #20  <Field List fileWatchList>
	//    8   18:invokeinterface #68  <Method void List.clear()>
	//    9   23:return          
	}

	File convertToFile(URL url)
	{
		if("file".equals(((Object) (url.getProtocol()))))
	//*   0    0:ldc1            #70  <String "file">
	//*   1    2:aload_1         
	//*   2    3:invokevirtual   #76  <Method String URL.getProtocol()>
	//*   3    6:invokevirtual   #81  <Method boolean String.equals(Object)>
	//*   4    9:ifeq            27
		{
			return new File(URLDecoder.decode(url.getFile()));
	//    5   12:new             #37  <Class File>
	//    6   15:dup             
	//    7   16:aload_1         
	//    8   17:invokevirtual   #84  <Method String URL.getFile()>
	//    9   20:invokestatic    #90  <Method String URLDecoder.decode(String)>
	//   10   23:invokespecial   #93  <Method void File(String)>
	//   11   26:areturn         
		} else
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   12   27:new             #95  <Class StringBuilder>
	//   13   30:dup             
	//   14   31:invokespecial   #96  <Method void StringBuilder()>
	//   15   34:astore_2        
			stringbuilder.append("URL [");
	//   16   35:aload_2         
	//   17   36:ldc1            #98  <String "URL [">
	//   18   38:invokevirtual   #102 <Method StringBuilder StringBuilder.append(String)>
	//   19   41:pop             
			stringbuilder.append(((Object) (url)));
	//   20   42:aload_2         
	//   21   43:aload_1         
	//   22   44:invokevirtual   #105 <Method StringBuilder StringBuilder.append(Object)>
	//   23   47:pop             
			stringbuilder.append("] is not of type file");
	//   24   48:aload_2         
	//   25   49:ldc1            #107 <String "] is not of type file">
	//   26   51:invokevirtual   #102 <Method StringBuilder StringBuilder.append(String)>
	//   27   54:pop             
			addInfo(stringbuilder.toString());
	//   28   55:aload_0         
	//   29   56:aload_2         
	//   30   57:invokevirtual   #110 <Method String StringBuilder.toString()>
	//   31   60:invokevirtual   #113 <Method void addInfo(String)>
			return null;
	//   32   63:aconst_null     
	//   33   64:areturn         
		}
	}

	public List getCopyOfFileWatchList()
	{
		return ((List) (new ArrayList(((java.util.Collection) (fileWatchList)))));
	//    0    0:new             #17  <Class ArrayList>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #20  <Field List fileWatchList>
	//    4    8:invokespecial   #118 <Method void ArrayList(java.util.Collection)>
	//    5   11:areturn         
	}

	public URL getMainURL()
	{
		return mainURL;
	//    0    0:aload_0         
	//    1    1:getfield        #66  <Field URL mainURL>
	//    2    4:areturn         
	}

	public void setMainURL(URL url)
	{
		mainURL = url;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #66  <Field URL mainURL>
		if(url != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          14
			addAsFileToWatch(url);
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:invokespecial   #50  <Method void addAsFileToWatch(URL)>
	//    8   14:return          
	}

	List fileWatchList;
	List lastModifiedList;
	URL mainURL;
}

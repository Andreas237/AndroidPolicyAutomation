// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.crashlytics.android.core;

import io.fabric.sdk.android.Fabric;
import io.fabric.sdk.android.Logger;
import java.io.File;
import java.util.*;

// Referenced classes of package com.crashlytics.android.core:
//			Report, ReportUploader

class SessionReport
	implements Report
{

	public SessionReport(File file1)
	{
		this(file1, Collections.emptyMap());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #21  <Method Map Collections.emptyMap()>
	//    3    5:invokespecial   #24  <Method void SessionReport(File, Map)>
	//    4    8:return          
	}

	public SessionReport(File file1, Map map)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #28  <Method void Object()>
		file = file1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #30  <Field File file>
		files = (new File[] {
			file1
		});
	//    5    9:aload_0         
	//    6   10:iconst_1        
	//    7   11:anewarray       File[]
	//    8   14:dup             
	//    9   15:iconst_0        
	//   10   16:aload_1         
	//   11   17:aastore         
	//   12   18:putfield        #34  <Field File[] files>
		customHeaders = ((Map) (new HashMap(map)));
	//   13   21:aload_0         
	//   14   22:new             #36  <Class HashMap>
	//   15   25:dup             
	//   16   26:aload_2         
	//   17   27:invokespecial   #39  <Method void HashMap(Map)>
	//   18   30:putfield        #41  <Field Map customHeaders>
		if(file.length() == 0L)
	//*  19   33:aload_0         
	//*  20   34:getfield        #30  <Field File file>
	//*  21   37:invokevirtual   #45  <Method long File.length()>
	//*  22   40:lconst_0        
	//*  23   41:lcmp            
	//*  24   42:ifne            57
			customHeaders.putAll(ReportUploader.HEADER_INVALID_CLS_FILE);
	//   25   45:aload_0         
	//   26   46:getfield        #41  <Field Map customHeaders>
	//   27   49:getstatic       #50  <Field Map ReportUploader.HEADER_INVALID_CLS_FILE>
	//   28   52:invokeinterface #55  <Method void Map.putAll(Map)>
	//   29   57:return          
	}

	public Map getCustomHeaders()
	{
		return Collections.unmodifiableMap(customHeaders);
	//    0    0:aload_0         
	//    1    1:getfield        #41  <Field Map customHeaders>
	//    2    4:invokestatic    #62  <Method Map Collections.unmodifiableMap(Map)>
	//    3    7:areturn         
	}

	public File getFile()
	{
		return file;
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field File file>
	//    2    4:areturn         
	}

	public String getFileName()
	{
		return getFile().getName();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #69  <Method File getFile()>
	//    2    4:invokevirtual   #72  <Method String File.getName()>
	//    3    7:areturn         
	}

	public File[] getFiles()
	{
		return files;
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field File[] files>
	//    2    4:areturn         
	}

	public String getIdentifier()
	{
		String s = getFileName();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #77  <Method String getFileName()>
	//    2    4:astore_1        
		return s.substring(0, s.lastIndexOf('.'));
	//    3    5:aload_1         
	//    4    6:iconst_0        
	//    5    7:aload_1         
	//    6    8:bipush          46
	//    7   10:invokevirtual   #83  <Method int String.lastIndexOf(int)>
	//    8   13:invokevirtual   #87  <Method String String.substring(int, int)>
	//    9   16:areturn         
	}

	public void remove()
	{
		Fabric.getLogger().d("CrashlyticsCore", (new StringBuilder()).append("Removing report at ").append(file.getPath()).toString());
	//    0    0:invokestatic    #94  <Method Logger Fabric.getLogger()>
	//    1    3:ldc1            #96  <String "CrashlyticsCore">
	//    2    5:new             #98  <Class StringBuilder>
	//    3    8:dup             
	//    4    9:invokespecial   #99  <Method void StringBuilder()>
	//    5   12:ldc1            #101 <String "Removing report at ">
	//    6   14:invokevirtual   #105 <Method StringBuilder StringBuilder.append(String)>
	//    7   17:aload_0         
	//    8   18:getfield        #30  <Field File file>
	//    9   21:invokevirtual   #108 <Method String File.getPath()>
	//   10   24:invokevirtual   #105 <Method StringBuilder StringBuilder.append(String)>
	//   11   27:invokevirtual   #111 <Method String StringBuilder.toString()>
	//   12   30:invokeinterface #117 <Method void Logger.d(String, String)>
		file.delete();
	//   13   35:aload_0         
	//   14   36:getfield        #30  <Field File file>
	//   15   39:invokevirtual   #121 <Method boolean File.delete()>
	//   16   42:pop             
	//   17   43:return          
	}

	private final Map customHeaders;
	private final File file;
	private final File files[];
}

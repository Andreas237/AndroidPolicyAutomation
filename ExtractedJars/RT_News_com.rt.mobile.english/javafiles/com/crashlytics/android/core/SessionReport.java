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
	//    2    2:invokestatic    #19  <Method Map Collections.emptyMap()>
	//    3    5:invokespecial   #22  <Method void SessionReport(File, Map)>
	//    4    8:return          
	}

	public SessionReport(File file1, Map map)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #26  <Method void Object()>
		file = file1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #28  <Field File file>
		customHeaders = ((Map) (new HashMap(map)));
	//    5    9:aload_0         
	//    6   10:new             #30  <Class HashMap>
	//    7   13:dup             
	//    8   14:aload_2         
	//    9   15:invokespecial   #33  <Method void HashMap(Map)>
	//   10   18:putfield        #35  <Field Map customHeaders>
		if(file.length() == 0L)
	//*  11   21:aload_0         
	//*  12   22:getfield        #28  <Field File file>
	//*  13   25:invokevirtual   #41  <Method long File.length()>
	//*  14   28:lconst_0        
	//*  15   29:lcmp            
	//*  16   30:ifne            45
			customHeaders.putAll(ReportUploader.HEADER_INVALID_CLS_FILE);
	//   17   33:aload_0         
	//   18   34:getfield        #35  <Field Map customHeaders>
	//   19   37:getstatic       #46  <Field Map ReportUploader.HEADER_INVALID_CLS_FILE>
	//   20   40:invokeinterface #51  <Method void Map.putAll(Map)>
	//   21   45:return          
	}

	public Map getCustomHeaders()
	{
		return Collections.unmodifiableMap(customHeaders);
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field Map customHeaders>
	//    2    4:invokestatic    #58  <Method Map Collections.unmodifiableMap(Map)>
	//    3    7:areturn         
	}

	public File getFile()
	{
		return file;
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field File file>
	//    2    4:areturn         
	}

	public String getFileName()
	{
		return getFile().getName();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #65  <Method File getFile()>
	//    2    4:invokevirtual   #68  <Method String File.getName()>
	//    3    7:areturn         
	}

	public String getIdentifier()
	{
		String s = getFileName();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #71  <Method String getFileName()>
	//    2    4:astore_1        
		return s.substring(0, s.lastIndexOf('.'));
	//    3    5:aload_1         
	//    4    6:iconst_0        
	//    5    7:aload_1         
	//    6    8:bipush          46
	//    7   10:invokevirtual   #77  <Method int String.lastIndexOf(int)>
	//    8   13:invokevirtual   #81  <Method String String.substring(int, int)>
	//    9   16:areturn         
	}

	public boolean remove()
	{
		Logger logger = Fabric.getLogger();
	//    0    0:invokestatic    #89  <Method Logger Fabric.getLogger()>
	//    1    3:astore_1        
		StringBuilder stringbuilder = new StringBuilder();
	//    2    4:new             #91  <Class StringBuilder>
	//    3    7:dup             
	//    4    8:invokespecial   #92  <Method void StringBuilder()>
	//    5   11:astore_2        
		stringbuilder.append("Removing report at ");
	//    6   12:aload_2         
	//    7   13:ldc1            #94  <String "Removing report at ">
	//    8   15:invokevirtual   #98  <Method StringBuilder StringBuilder.append(String)>
	//    9   18:pop             
		stringbuilder.append(file.getPath());
	//   10   19:aload_2         
	//   11   20:aload_0         
	//   12   21:getfield        #28  <Field File file>
	//   13   24:invokevirtual   #101 <Method String File.getPath()>
	//   14   27:invokevirtual   #98  <Method StringBuilder StringBuilder.append(String)>
	//   15   30:pop             
		logger.d("CrashlyticsCore", stringbuilder.toString());
	//   16   31:aload_1         
	//   17   32:ldc1            #103 <String "CrashlyticsCore">
	//   18   34:aload_2         
	//   19   35:invokevirtual   #106 <Method String StringBuilder.toString()>
	//   20   38:invokeinterface #112 <Method void Logger.d(String, String)>
		return file.delete();
	//   21   43:aload_0         
	//   22   44:getfield        #28  <Field File file>
	//   23   47:invokevirtual   #115 <Method boolean File.delete()>
	//   24   50:ireturn         
	}

	private final Map customHeaders;
	private final File file;
}

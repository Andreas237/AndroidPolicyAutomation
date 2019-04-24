// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.crashlytics.android.core;

import b.a.a.a.c;
import b.a.a.a.l;
import java.io.File;
import java.util.*;

// Referenced classes of package com.crashlytics.android.core:
//			Report, ReportUploader

class InvalidSessionReport
	implements Report
{

	public InvalidSessionReport(String s, File afile[])
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void Object()>
		files = afile;
	//    2    4:aload_0         
	//    3    5:aload_2         
	//    4    6:putfield        #20  <Field File[] files>
		customHeaders = ((Map) (new HashMap(ReportUploader.HEADER_INVALID_CLS_FILE)));
	//    5    9:aload_0         
	//    6   10:new             #22  <Class HashMap>
	//    7   13:dup             
	//    8   14:getstatic       #27  <Field Map ReportUploader.HEADER_INVALID_CLS_FILE>
	//    9   17:invokespecial   #30  <Method void HashMap(Map)>
	//   10   20:putfield        #32  <Field Map customHeaders>
		identifier = s;
	//   11   23:aload_0         
	//   12   24:aload_1         
	//   13   25:putfield        #34  <Field String identifier>
	//   14   28:return          
	}

	public Map getCustomHeaders()
	{
		return Collections.unmodifiableMap(customHeaders);
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field Map customHeaders>
	//    2    4:invokestatic    #43  <Method Map Collections.unmodifiableMap(Map)>
	//    3    7:areturn         
	}

	public File getFile()
	{
		return files[0];
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field File[] files>
	//    2    4:iconst_0        
	//    3    5:aaload          
	//    4    6:areturn         
	}

	public String getFileName()
	{
		return files[0].getName();
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field File[] files>
	//    2    4:iconst_0        
	//    3    5:aaload          
	//    4    6:invokevirtual   #54  <Method String File.getName()>
	//    5    9:areturn         
	}

	public File[] getFiles()
	{
		return files;
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field File[] files>
	//    2    4:areturn         
	}

	public String getIdentifier()
	{
		return identifier;
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field String identifier>
	//    2    4:areturn         
	}

	public Report.Type getType()
	{
		return Report.Type.JAVA;
	//    0    0:getstatic       #65  <Field Report$Type Report$Type.JAVA>
	//    1    3:areturn         
	}

	public void remove()
	{
		File afile[] = files;
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field File[] files>
	//    2    4:astore_3        
		int j = afile.length;
	//    3    5:aload_3         
	//    4    6:arraylength     
	//    5    7:istore_2        
		for(int i = 0; i < j; i++)
	//*   6    8:iconst_0        
	//*   7    9:istore_1        
	//*   8   10:iload_1         
	//*   9   11:iload_2         
	//*  10   12:icmpge          80
		{
			File file = afile[i];
	//   11   15:aload_3         
	//   12   16:iload_1         
	//   13   17:aaload          
	//   14   18:astore          4
			l l1 = c.g();
	//   15   20:invokestatic    #72  <Method l c.g()>
	//   16   23:astore          5
			StringBuilder stringbuilder = new StringBuilder();
	//   17   25:new             #74  <Class StringBuilder>
	//   18   28:dup             
	//   19   29:invokespecial   #75  <Method void StringBuilder()>
	//   20   32:astore          6
			stringbuilder.append("Removing invalid report file at ");
	//   21   34:aload           6
	//   22   36:ldc1            #77  <String "Removing invalid report file at ">
	//   23   38:invokevirtual   #81  <Method StringBuilder StringBuilder.append(String)>
	//   24   41:pop             
			stringbuilder.append(file.getPath());
	//   25   42:aload           6
	//   26   44:aload           4
	//   27   46:invokevirtual   #84  <Method String File.getPath()>
	//   28   49:invokevirtual   #81  <Method StringBuilder StringBuilder.append(String)>
	//   29   52:pop             
			l1.a("CrashlyticsCore", stringbuilder.toString());
	//   30   53:aload           5
	//   31   55:ldc1            #86  <String "CrashlyticsCore">
	//   32   57:aload           6
	//   33   59:invokevirtual   #89  <Method String StringBuilder.toString()>
	//   34   62:invokeinterface #95  <Method void l.a(String, String)>
			file.delete();
	//   35   67:aload           4
	//   36   69:invokevirtual   #99  <Method boolean File.delete()>
	//   37   72:pop             
		}

	//   38   73:iload_1         
	//   39   74:iconst_1        
	//   40   75:iadd            
	//   41   76:istore_1        
	//*  42   77:goto            10
	//   43   80:return          
	}

	private final Map customHeaders;
	private final File files[];
	private final String identifier;
}

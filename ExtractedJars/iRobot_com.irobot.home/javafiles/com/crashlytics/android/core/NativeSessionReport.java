// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.crashlytics.android.core;

import b.a.a.a.c;
import b.a.a.a.l;
import java.io.File;
import java.util.Map;

// Referenced classes of package com.crashlytics.android.core:
//			Report

class NativeSessionReport
	implements Report
{

	public NativeSessionReport(File file)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
		reportDirectory = file;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #15  <Field File reportDirectory>
	//    5    9:return          
	}

	public Map getCustomHeaders()
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public File getFile()
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public String getFileName()
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public File[] getFiles()
	{
		return reportDirectory.listFiles();
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field File reportDirectory>
	//    2    4:invokevirtual   #31  <Method File[] File.listFiles()>
	//    3    7:areturn         
	}

	public String getIdentifier()
	{
		return reportDirectory.getName();
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field File reportDirectory>
	//    2    4:invokevirtual   #35  <Method String File.getName()>
	//    3    7:areturn         
	}

	public Report.Type getType()
	{
		return Report.Type.NATIVE;
	//    0    0:getstatic       #43  <Field Report$Type Report$Type.NATIVE>
	//    1    3:areturn         
	}

	public void remove()
	{
		File afile[] = getFiles();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #46  <Method File[] getFiles()>
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
			l l2 = c.g();
	//   15   20:invokestatic    #52  <Method l c.g()>
	//   16   23:astore          5
			StringBuilder stringbuilder1 = new StringBuilder();
	//   17   25:new             #54  <Class StringBuilder>
	//   18   28:dup             
	//   19   29:invokespecial   #55  <Method void StringBuilder()>
	//   20   32:astore          6
			stringbuilder1.append("Removing native report file at ");
	//   21   34:aload           6
	//   22   36:ldc1            #57  <String "Removing native report file at ">
	//   23   38:invokevirtual   #61  <Method StringBuilder StringBuilder.append(String)>
	//   24   41:pop             
			stringbuilder1.append(file.getPath());
	//   25   42:aload           6
	//   26   44:aload           4
	//   27   46:invokevirtual   #64  <Method String File.getPath()>
	//   28   49:invokevirtual   #61  <Method StringBuilder StringBuilder.append(String)>
	//   29   52:pop             
			l2.a("CrashlyticsCore", stringbuilder1.toString());
	//   30   53:aload           5
	//   31   55:ldc1            #66  <String "CrashlyticsCore">
	//   32   57:aload           6
	//   33   59:invokevirtual   #69  <Method String StringBuilder.toString()>
	//   34   62:invokeinterface #75  <Method void l.a(String, String)>
			file.delete();
	//   35   67:aload           4
	//   36   69:invokevirtual   #79  <Method boolean File.delete()>
	//   37   72:pop             
		}

	//   38   73:iload_1         
	//   39   74:iconst_1        
	//   40   75:iadd            
	//   41   76:istore_1        
	//*  42   77:goto            10
		l l1 = c.g();
	//   43   80:invokestatic    #52  <Method l c.g()>
	//   44   83:astore_3        
		StringBuilder stringbuilder = new StringBuilder();
	//   45   84:new             #54  <Class StringBuilder>
	//   46   87:dup             
	//   47   88:invokespecial   #55  <Method void StringBuilder()>
	//   48   91:astore          4
		stringbuilder.append("Removing native report directory at ");
	//   49   93:aload           4
	//   50   95:ldc1            #81  <String "Removing native report directory at ">
	//   51   97:invokevirtual   #61  <Method StringBuilder StringBuilder.append(String)>
	//   52  100:pop             
		stringbuilder.append(((Object) (reportDirectory)));
	//   53  101:aload           4
	//   54  103:aload_0         
	//   55  104:getfield        #15  <Field File reportDirectory>
	//   56  107:invokevirtual   #84  <Method StringBuilder StringBuilder.append(Object)>
	//   57  110:pop             
		l1.a("CrashlyticsCore", stringbuilder.toString());
	//   58  111:aload_3         
	//   59  112:ldc1            #66  <String "CrashlyticsCore">
	//   60  114:aload           4
	//   61  116:invokevirtual   #69  <Method String StringBuilder.toString()>
	//   62  119:invokeinterface #75  <Method void l.a(String, String)>
		reportDirectory.delete();
	//   63  124:aload_0         
	//   64  125:getfield        #15  <Field File reportDirectory>
	//   65  128:invokevirtual   #79  <Method boolean File.delete()>
	//   66  131:pop             
	//   67  132:return          
	}

	private final File reportDirectory;
}

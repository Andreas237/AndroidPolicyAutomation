// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.crashlytics.android.core;

import java.io.*;

class ClsFileOutputStream extends FileOutputStream
{

	public ClsFileOutputStream(File file, String s)
		throws FileNotFoundException
	{
		super(new File(file, (new StringBuilder()).append(s).append(".cls_temp").toString()));
	//    0    0:aload_0         
	//    1    1:new             #34  <Class File>
	//    2    4:dup             
	//    3    5:aload_1         
	//    4    6:new             #36  <Class StringBuilder>
	//    5    9:dup             
	//    6   10:invokespecial   #37  <Method void StringBuilder()>
	//    7   13:aload_2         
	//    8   14:invokevirtual   #41  <Method StringBuilder StringBuilder.append(String)>
	//    9   17:ldc1            #10  <String ".cls_temp">
	//   10   19:invokevirtual   #41  <Method StringBuilder StringBuilder.append(String)>
	//   11   22:invokevirtual   #45  <Method String StringBuilder.toString()>
	//   12   25:invokespecial   #47  <Method void File(File, String)>
	//   13   28:invokespecial   #50  <Method void FileOutputStream(File)>
		closed = false;
	//   14   31:aload_0         
	//   15   32:iconst_0        
	//   16   33:putfield        #52  <Field boolean closed>
		root = (new StringBuilder()).append(((Object) (file))).append(File.separator).append(s).toString();
	//   17   36:aload_0         
	//   18   37:new             #36  <Class StringBuilder>
	//   19   40:dup             
	//   20   41:invokespecial   #37  <Method void StringBuilder()>
	//   21   44:aload_1         
	//   22   45:invokevirtual   #55  <Method StringBuilder StringBuilder.append(Object)>
	//   23   48:getstatic       #58  <Field String File.separator>
	//   24   51:invokevirtual   #41  <Method StringBuilder StringBuilder.append(String)>
	//   25   54:aload_2         
	//   26   55:invokevirtual   #41  <Method StringBuilder StringBuilder.append(String)>
	//   27   58:invokevirtual   #45  <Method String StringBuilder.toString()>
	//   28   61:putfield        #60  <Field String root>
		inProgress = new File((new StringBuilder()).append(root).append(".cls_temp").toString());
	//   29   64:aload_0         
	//   30   65:new             #34  <Class File>
	//   31   68:dup             
	//   32   69:new             #36  <Class StringBuilder>
	//   33   72:dup             
	//   34   73:invokespecial   #37  <Method void StringBuilder()>
	//   35   76:aload_0         
	//   36   77:getfield        #60  <Field String root>
	//   37   80:invokevirtual   #41  <Method StringBuilder StringBuilder.append(String)>
	//   38   83:ldc1            #10  <String ".cls_temp">
	//   39   85:invokevirtual   #41  <Method StringBuilder StringBuilder.append(String)>
	//   40   88:invokevirtual   #45  <Method String StringBuilder.toString()>
	//   41   91:invokespecial   #63  <Method void File(String)>
	//   42   94:putfield        #65  <Field File inProgress>
	//   43   97:return          
	}

	public ClsFileOutputStream(String s, String s1)
		throws FileNotFoundException
	{
		this(new File(s), s1);
	//    0    0:aload_0         
	//    1    1:new             #34  <Class File>
	//    2    4:dup             
	//    3    5:aload_1         
	//    4    6:invokespecial   #63  <Method void File(String)>
	//    5    9:aload_2         
	//    6   10:invokespecial   #68  <Method void ClsFileOutputStream(File, String)>
	//    7   13:return          
	}

	public void close()
		throws IOException
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		boolean flag = closed;
	//    2    2:aload_0         
	//    3    3:getfield        #52  <Field boolean closed>
	//    4    6:istore_1        
		if(!flag) goto _L2; else goto _L1
	//    5    7:iload_1         
	//    6    8:ifeq            14
_L1:
		this;
	//    7   11:aload_0         
		JVM INSTR monitorexit ;
	//    8   12:monitorexit     
		return;
	//    9   13:return          
_L2:
		File file;
		closed = true;
	//   10   14:aload_0         
	//   11   15:iconst_1        
	//   12   16:putfield        #52  <Field boolean closed>
		super.flush();
	//   13   19:aload_0         
	//   14   20:invokespecial   #74  <Method void FileOutputStream.flush()>
		super.close();
	//   15   23:aload_0         
	//   16   24:invokespecial   #76  <Method void FileOutputStream.close()>
		file = new File((new StringBuilder()).append(root).append(".cls").toString());
	//   17   27:new             #34  <Class File>
	//   18   30:dup             
	//   19   31:new             #36  <Class StringBuilder>
	//   20   34:dup             
	//   21   35:invokespecial   #37  <Method void StringBuilder()>
	//   22   38:aload_0         
	//   23   39:getfield        #60  <Field String root>
	//   24   42:invokevirtual   #41  <Method StringBuilder StringBuilder.append(String)>
	//   25   45:ldc1            #13  <String ".cls">
	//   26   47:invokevirtual   #41  <Method StringBuilder StringBuilder.append(String)>
	//   27   50:invokevirtual   #45  <Method String StringBuilder.toString()>
	//   28   53:invokespecial   #63  <Method void File(String)>
	//   29   56:astore_3        
		if(!inProgress.renameTo(file))
			break; /* Loop/switch isn't completed */
	//   30   57:aload_0         
	//   31   58:getfield        #65  <Field File inProgress>
	//   32   61:aload_3         
	//   33   62:invokevirtual   #80  <Method boolean File.renameTo(File)>
	//   34   65:ifeq            86
		inProgress = null;
	//   35   68:aload_0         
	//   36   69:aconst_null     
	//   37   70:putfield        #65  <Field File inProgress>
		complete = file;
	//   38   73:aload_0         
	//   39   74:aload_3         
	//   40   75:putfield        #82  <Field File complete>
		if(true) goto _L1; else goto _L3
	//   41   78:goto            11
		Exception exception;
		exception;
	//   42   81:astore_2        
	//*  43   82:aload_0         
		throw exception;
	//   44   83:monitorexit     
	//   45   84:aload_2         
	//   46   85:athrow          
_L3:
		String s = "";
	//   47   86:ldc1            #84  <String "">
	//   48   88:astore_2        
		if(!file.exists()) goto _L5; else goto _L4
	//   49   89:aload_3         
	//   50   90:invokevirtual   #88  <Method boolean File.exists()>
	//   51   93:ifeq            142
_L4:
		s = " (target already exists)";
	//   52   96:ldc1            #90  <String " (target already exists)">
	//   53   98:astore_2        
_L7:
		throw new IOException((new StringBuilder()).append("Could not rename temp file: ").append(((Object) (inProgress))).append(" -> ").append(((Object) (file))).append(s).toString());
	//   54   99:new             #71  <Class IOException>
	//   55  102:dup             
	//   56  103:new             #36  <Class StringBuilder>
	//   57  106:dup             
	//   58  107:invokespecial   #37  <Method void StringBuilder()>
	//   59  110:ldc1            #92  <String "Could not rename temp file: ">
	//   60  112:invokevirtual   #41  <Method StringBuilder StringBuilder.append(String)>
	//   61  115:aload_0         
	//   62  116:getfield        #65  <Field File inProgress>
	//   63  119:invokevirtual   #55  <Method StringBuilder StringBuilder.append(Object)>
	//   64  122:ldc1            #94  <String " -> ">
	//   65  124:invokevirtual   #41  <Method StringBuilder StringBuilder.append(String)>
	//   66  127:aload_3         
	//   67  128:invokevirtual   #55  <Method StringBuilder StringBuilder.append(Object)>
	//   68  131:aload_2         
	//   69  132:invokevirtual   #41  <Method StringBuilder StringBuilder.append(String)>
	//   70  135:invokevirtual   #45  <Method String StringBuilder.toString()>
	//   71  138:invokespecial   #95  <Method void IOException(String)>
	//   72  141:athrow          
_L5:
		if(!inProgress.exists())
	//*  73  142:aload_0         
	//*  74  143:getfield        #65  <Field File inProgress>
	//*  75  146:invokevirtual   #88  <Method boolean File.exists()>
	//*  76  149:ifne            99
			s = " (source does not exist)";
	//   77  152:ldc1            #97  <String " (source does not exist)">
	//   78  154:astore_2        
		if(true) goto _L7; else goto _L6
	//   79  155:goto            99
_L6:
	}

	public void closeInProgressStream()
		throws IOException
	{
		if(closed)
	//*   0    0:aload_0         
	//*   1    1:getfield        #52  <Field boolean closed>
	//*   2    4:ifeq            8
		{
			return;
	//    3    7:return          
		} else
		{
			closed = true;
	//    4    8:aload_0         
	//    5    9:iconst_1        
	//    6   10:putfield        #52  <Field boolean closed>
			super.flush();
	//    7   13:aload_0         
	//    8   14:invokespecial   #74  <Method void FileOutputStream.flush()>
			super.close();
	//    9   17:aload_0         
	//   10   18:invokespecial   #76  <Method void FileOutputStream.close()>
			return;
	//   11   21:return          
		}
	}

	public File getCompleteFile()
	{
		return complete;
	//    0    0:aload_0         
	//    1    1:getfield        #82  <Field File complete>
	//    2    4:areturn         
	}

	public File getInProgressFile()
	{
		return inProgress;
	//    0    0:aload_0         
	//    1    1:getfield        #65  <Field File inProgress>
	//    2    4:areturn         
	}

	public static final String IN_PROGRESS_SESSION_FILE_EXTENSION = ".cls_temp";
	public static final String SESSION_FILE_EXTENSION = ".cls";
	public static final FilenameFilter TEMP_FILENAME_FILTER = new FilenameFilter() {

		public boolean accept(File file, String s)
		{
			return s.endsWith(".cls_temp");
		//    0    0:aload_2         
		//    1    1:ldc1            #17  <String ".cls_temp">
		//    2    3:invokevirtual   #23  <Method boolean String.endsWith(String)>
		//    3    6:ireturn         
		}

	}
;
	private boolean closed;
	private File complete;
	private File inProgress;
	private final String root;

	static 
	{
	//    0    0:new             #6   <Class ClsFileOutputStream$1>
	//    1    3:dup             
	//    2    4:invokespecial   #26  <Method void ClsFileOutputStream$1()>
	//    3    7:putstatic       #28  <Field FilenameFilter TEMP_FILENAME_FILTER>
	//*   4   10:return          
	}
}

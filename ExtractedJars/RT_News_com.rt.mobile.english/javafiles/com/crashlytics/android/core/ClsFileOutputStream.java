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
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #34  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #35  <Method void StringBuilder()>
	//    3    7:astore_3        
		stringbuilder.append(s);
	//    4    8:aload_3         
	//    5    9:aload_2         
	//    6   10:invokevirtual   #39  <Method StringBuilder StringBuilder.append(String)>
	//    7   13:pop             
		stringbuilder.append(".cls_temp");
	//    8   14:aload_3         
	//    9   15:ldc1            #10  <String ".cls_temp">
	//   10   17:invokevirtual   #39  <Method StringBuilder StringBuilder.append(String)>
	//   11   20:pop             
		super(new File(file, stringbuilder.toString()));
	//   12   21:aload_0         
	//   13   22:new             #41  <Class File>
	//   14   25:dup             
	//   15   26:aload_1         
	//   16   27:aload_3         
	//   17   28:invokevirtual   #45  <Method String StringBuilder.toString()>
	//   18   31:invokespecial   #47  <Method void File(File, String)>
	//   19   34:invokespecial   #50  <Method void FileOutputStream(File)>
		closed = false;
	//   20   37:aload_0         
	//   21   38:iconst_0        
	//   22   39:putfield        #52  <Field boolean closed>
		stringbuilder = new StringBuilder();
	//   23   42:new             #34  <Class StringBuilder>
	//   24   45:dup             
	//   25   46:invokespecial   #35  <Method void StringBuilder()>
	//   26   49:astore_3        
		stringbuilder.append(((Object) (file)));
	//   27   50:aload_3         
	//   28   51:aload_1         
	//   29   52:invokevirtual   #55  <Method StringBuilder StringBuilder.append(Object)>
	//   30   55:pop             
		stringbuilder.append(File.separator);
	//   31   56:aload_3         
	//   32   57:getstatic       #58  <Field String File.separator>
	//   33   60:invokevirtual   #39  <Method StringBuilder StringBuilder.append(String)>
	//   34   63:pop             
		stringbuilder.append(s);
	//   35   64:aload_3         
	//   36   65:aload_2         
	//   37   66:invokevirtual   #39  <Method StringBuilder StringBuilder.append(String)>
	//   38   69:pop             
		root = stringbuilder.toString();
	//   39   70:aload_0         
	//   40   71:aload_3         
	//   41   72:invokevirtual   #45  <Method String StringBuilder.toString()>
	//   42   75:putfield        #60  <Field String root>
		file = ((File) (new StringBuilder()));
	//   43   78:new             #34  <Class StringBuilder>
	//   44   81:dup             
	//   45   82:invokespecial   #35  <Method void StringBuilder()>
	//   46   85:astore_1        
		((StringBuilder) (file)).append(root);
	//   47   86:aload_1         
	//   48   87:aload_0         
	//   49   88:getfield        #60  <Field String root>
	//   50   91:invokevirtual   #39  <Method StringBuilder StringBuilder.append(String)>
	//   51   94:pop             
		((StringBuilder) (file)).append(".cls_temp");
	//   52   95:aload_1         
	//   53   96:ldc1            #10  <String ".cls_temp">
	//   54   98:invokevirtual   #39  <Method StringBuilder StringBuilder.append(String)>
	//   55  101:pop             
		inProgress = new File(((StringBuilder) (file)).toString());
	//   56  102:aload_0         
	//   57  103:new             #41  <Class File>
	//   58  106:dup             
	//   59  107:aload_1         
	//   60  108:invokevirtual   #45  <Method String StringBuilder.toString()>
	//   61  111:invokespecial   #63  <Method void File(String)>
	//   62  114:putfield        #65  <Field File inProgress>
	//   63  117:return          
	}

	public ClsFileOutputStream(String s, String s1)
		throws FileNotFoundException
	{
		this(new File(s), s1);
	//    0    0:aload_0         
	//    1    1:new             #41  <Class File>
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
		if(!flag)
			break MISSING_BLOCK_LABEL_14;
	//    5    7:iload_1         
	//    6    8:ifeq            14
		this;
	//    7   11:aload_0         
		JVM INSTR monitorexit ;
	//    8   12:monitorexit     
		return;
	//    9   13:return          
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
		StringBuilder stringbuilder = new StringBuilder();
	//   17   27:new             #34  <Class StringBuilder>
	//   18   30:dup             
	//   19   31:invokespecial   #35  <Method void StringBuilder()>
	//   20   34:astore_2        
		stringbuilder.append(root);
	//   21   35:aload_2         
	//   22   36:aload_0         
	//   23   37:getfield        #60  <Field String root>
	//   24   40:invokevirtual   #39  <Method StringBuilder StringBuilder.append(String)>
	//   25   43:pop             
		stringbuilder.append(".cls");
	//   26   44:aload_2         
	//   27   45:ldc1            #13  <String ".cls">
	//   28   47:invokevirtual   #39  <Method StringBuilder StringBuilder.append(String)>
	//   29   50:pop             
		file = new File(stringbuilder.toString());
	//   30   51:new             #41  <Class File>
	//   31   54:dup             
	//   32   55:aload_2         
	//   33   56:invokevirtual   #45  <Method String StringBuilder.toString()>
	//   34   59:invokespecial   #63  <Method void File(String)>
	//   35   62:astore_3        
		if(!inProgress.renameTo(file))
			break MISSING_BLOCK_LABEL_87;
	//   36   63:aload_0         
	//   37   64:getfield        #65  <Field File inProgress>
	//   38   67:aload_3         
	//   39   68:invokevirtual   #80  <Method boolean File.renameTo(File)>
	//   40   71:ifeq            87
		inProgress = null;
	//   41   74:aload_0         
	//   42   75:aconst_null     
	//   43   76:putfield        #65  <Field File inProgress>
		complete = file;
	//   44   79:aload_0         
	//   45   80:aload_3         
	//   46   81:putfield        #82  <Field File complete>
		this;
	//   47   84:aload_0         
		JVM INSTR monitorexit ;
	//   48   85:monitorexit     
		return;
	//   49   86:return          
		String s = "";
	//   50   87:ldc1            #84  <String "">
	//   51   89:astore_2        
		if(file.exists())
	//*  52   90:aload_3         
	//*  53   91:invokevirtual   #88  <Method boolean File.exists()>
	//*  54   94:ifeq            103
		{
			s = " (target already exists)";
	//   55   97:ldc1            #90  <String " (target already exists)">
	//   56   99:astore_2        
			break MISSING_BLOCK_LABEL_116;
	//   57  100:goto            116
		}
		if(!inProgress.exists())
	//*  58  103:aload_0         
	//*  59  104:getfield        #65  <Field File inProgress>
	//*  60  107:invokevirtual   #88  <Method boolean File.exists()>
	//*  61  110:ifne            116
			s = " (source does not exist)";
	//   62  113:ldc1            #92  <String " (source does not exist)">
	//   63  115:astore_2        
		StringBuilder stringbuilder1 = new StringBuilder();
	//   64  116:new             #34  <Class StringBuilder>
	//   65  119:dup             
	//   66  120:invokespecial   #35  <Method void StringBuilder()>
	//   67  123:astore          4
		stringbuilder1.append("Could not rename temp file: ");
	//   68  125:aload           4
	//   69  127:ldc1            #94  <String "Could not rename temp file: ">
	//   70  129:invokevirtual   #39  <Method StringBuilder StringBuilder.append(String)>
	//   71  132:pop             
		stringbuilder1.append(((Object) (inProgress)));
	//   72  133:aload           4
	//   73  135:aload_0         
	//   74  136:getfield        #65  <Field File inProgress>
	//   75  139:invokevirtual   #55  <Method StringBuilder StringBuilder.append(Object)>
	//   76  142:pop             
		stringbuilder1.append(" -> ");
	//   77  143:aload           4
	//   78  145:ldc1            #96  <String " -> ">
	//   79  147:invokevirtual   #39  <Method StringBuilder StringBuilder.append(String)>
	//   80  150:pop             
		stringbuilder1.append(((Object) (file)));
	//   81  151:aload           4
	//   82  153:aload_3         
	//   83  154:invokevirtual   #55  <Method StringBuilder StringBuilder.append(Object)>
	//   84  157:pop             
		stringbuilder1.append(s);
	//   85  158:aload           4
	//   86  160:aload_2         
	//   87  161:invokevirtual   #39  <Method StringBuilder StringBuilder.append(String)>
	//   88  164:pop             
		throw new IOException(stringbuilder1.toString());
	//   89  165:new             #71  <Class IOException>
	//   90  168:dup             
	//   91  169:aload           4
	//   92  171:invokevirtual   #45  <Method String StringBuilder.toString()>
	//   93  174:invokespecial   #97  <Method void IOException(String)>
	//   94  177:athrow          
		Exception exception;
		exception;
	//   95  178:astore_2        
		this;
	//   96  179:aload_0         
		JVM INSTR monitorexit ;
	//   97  180:monitorexit     
		throw exception;
	//   98  181:aload_2         
	//   99  182:athrow          
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

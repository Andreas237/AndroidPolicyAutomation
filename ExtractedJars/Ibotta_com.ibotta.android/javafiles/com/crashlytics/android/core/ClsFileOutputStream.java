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
	//    0    0:new             #28  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #29  <Method void StringBuilder()>
	//    3    7:astore_3        
		stringbuilder.append(s);
	//    4    8:aload_3         
	//    5    9:aload_2         
	//    6   10:invokevirtual   #33  <Method StringBuilder StringBuilder.append(String)>
	//    7   13:pop             
		stringbuilder.append(".cls_temp");
	//    8   14:aload_3         
	//    9   15:ldc1            #35  <String ".cls_temp">
	//   10   17:invokevirtual   #33  <Method StringBuilder StringBuilder.append(String)>
	//   11   20:pop             
		super(new File(file, stringbuilder.toString()));
	//   12   21:aload_0         
	//   13   22:new             #37  <Class File>
	//   14   25:dup             
	//   15   26:aload_1         
	//   16   27:aload_3         
	//   17   28:invokevirtual   #41  <Method String StringBuilder.toString()>
	//   18   31:invokespecial   #43  <Method void File(File, String)>
	//   19   34:invokespecial   #46  <Method void FileOutputStream(File)>
		closed = false;
	//   20   37:aload_0         
	//   21   38:iconst_0        
	//   22   39:putfield        #48  <Field boolean closed>
		stringbuilder = new StringBuilder();
	//   23   42:new             #28  <Class StringBuilder>
	//   24   45:dup             
	//   25   46:invokespecial   #29  <Method void StringBuilder()>
	//   26   49:astore_3        
		stringbuilder.append(((Object) (file)));
	//   27   50:aload_3         
	//   28   51:aload_1         
	//   29   52:invokevirtual   #51  <Method StringBuilder StringBuilder.append(Object)>
	//   30   55:pop             
		stringbuilder.append(File.separator);
	//   31   56:aload_3         
	//   32   57:getstatic       #54  <Field String File.separator>
	//   33   60:invokevirtual   #33  <Method StringBuilder StringBuilder.append(String)>
	//   34   63:pop             
		stringbuilder.append(s);
	//   35   64:aload_3         
	//   36   65:aload_2         
	//   37   66:invokevirtual   #33  <Method StringBuilder StringBuilder.append(String)>
	//   38   69:pop             
		root = stringbuilder.toString();
	//   39   70:aload_0         
	//   40   71:aload_3         
	//   41   72:invokevirtual   #41  <Method String StringBuilder.toString()>
	//   42   75:putfield        #56  <Field String root>
		file = ((File) (new StringBuilder()));
	//   43   78:new             #28  <Class StringBuilder>
	//   44   81:dup             
	//   45   82:invokespecial   #29  <Method void StringBuilder()>
	//   46   85:astore_1        
		((StringBuilder) (file)).append(root);
	//   47   86:aload_1         
	//   48   87:aload_0         
	//   49   88:getfield        #56  <Field String root>
	//   50   91:invokevirtual   #33  <Method StringBuilder StringBuilder.append(String)>
	//   51   94:pop             
		((StringBuilder) (file)).append(".cls_temp");
	//   52   95:aload_1         
	//   53   96:ldc1            #35  <String ".cls_temp">
	//   54   98:invokevirtual   #33  <Method StringBuilder StringBuilder.append(String)>
	//   55  101:pop             
		inProgress = new File(((StringBuilder) (file)).toString());
	//   56  102:aload_0         
	//   57  103:new             #37  <Class File>
	//   58  106:dup             
	//   59  107:aload_1         
	//   60  108:invokevirtual   #41  <Method String StringBuilder.toString()>
	//   61  111:invokespecial   #59  <Method void File(String)>
	//   62  114:putfield        #61  <Field File inProgress>
	//   63  117:return          
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
	//    3    3:getfield        #48  <Field boolean closed>
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
	//   12   16:putfield        #48  <Field boolean closed>
		super.flush();
	//   13   19:aload_0         
	//   14   20:invokespecial   #68  <Method void FileOutputStream.flush()>
		super.close();
	//   15   23:aload_0         
	//   16   24:invokespecial   #70  <Method void FileOutputStream.close()>
		StringBuilder stringbuilder = new StringBuilder();
	//   17   27:new             #28  <Class StringBuilder>
	//   18   30:dup             
	//   19   31:invokespecial   #29  <Method void StringBuilder()>
	//   20   34:astore_2        
		stringbuilder.append(root);
	//   21   35:aload_2         
	//   22   36:aload_0         
	//   23   37:getfield        #56  <Field String root>
	//   24   40:invokevirtual   #33  <Method StringBuilder StringBuilder.append(String)>
	//   25   43:pop             
		stringbuilder.append(".cls");
	//   26   44:aload_2         
	//   27   45:ldc1            #72  <String ".cls">
	//   28   47:invokevirtual   #33  <Method StringBuilder StringBuilder.append(String)>
	//   29   50:pop             
		file = new File(stringbuilder.toString());
	//   30   51:new             #37  <Class File>
	//   31   54:dup             
	//   32   55:aload_2         
	//   33   56:invokevirtual   #41  <Method String StringBuilder.toString()>
	//   34   59:invokespecial   #59  <Method void File(String)>
	//   35   62:astore_3        
		if(!inProgress.renameTo(file))
			break MISSING_BLOCK_LABEL_87;
	//   36   63:aload_0         
	//   37   64:getfield        #61  <Field File inProgress>
	//   38   67:aload_3         
	//   39   68:invokevirtual   #76  <Method boolean File.renameTo(File)>
	//   40   71:ifeq            87
		inProgress = null;
	//   41   74:aload_0         
	//   42   75:aconst_null     
	//   43   76:putfield        #61  <Field File inProgress>
		complete = file;
	//   44   79:aload_0         
	//   45   80:aload_3         
	//   46   81:putfield        #78  <Field File complete>
		this;
	//   47   84:aload_0         
		JVM INSTR monitorexit ;
	//   48   85:monitorexit     
		return;
	//   49   86:return          
		Object obj = "";
	//   50   87:ldc1            #80  <String "">
	//   51   89:astore_2        
		StringBuilder stringbuilder1;
		if(!file.exists())
	//*  52   90:aload_3         
	//*  53   91:invokevirtual   #84  <Method boolean File.exists()>
	//*  54   94:ifne            180
		{
			if(!inProgress.exists())
	//*  55   97:aload_0         
	//*  56   98:getfield        #61  <Field File inProgress>
	//*  57  101:invokevirtual   #84  <Method boolean File.exists()>
	//*  58  104:ifne            113
				obj = " (source does not exist)";
	//   59  107:ldc1            #86  <String " (source does not exist)">
	//   60  109:astore_2        
		} else
	//*  61  110:goto            113
	//*  62  113:new             #28  <Class StringBuilder>
	//*  63  116:dup             
	//*  64  117:invokespecial   #29  <Method void StringBuilder()>
	//*  65  120:astore          4
	//*  66  122:aload           4
	//*  67  124:ldc1            #88  <String "Could not rename temp file: ">
	//*  68  126:invokevirtual   #33  <Method StringBuilder StringBuilder.append(String)>
	//*  69  129:pop             
	//*  70  130:aload           4
	//*  71  132:aload_0         
	//*  72  133:getfield        #61  <Field File inProgress>
	//*  73  136:invokevirtual   #51  <Method StringBuilder StringBuilder.append(Object)>
	//*  74  139:pop             
	//*  75  140:aload           4
	//*  76  142:ldc1            #90  <String " -> ">
	//*  77  144:invokevirtual   #33  <Method StringBuilder StringBuilder.append(String)>
	//*  78  147:pop             
	//*  79  148:aload           4
	//*  80  150:aload_3         
	//*  81  151:invokevirtual   #51  <Method StringBuilder StringBuilder.append(Object)>
	//*  82  154:pop             
	//*  83  155:aload           4
	//*  84  157:aload_2         
	//*  85  158:invokevirtual   #33  <Method StringBuilder StringBuilder.append(String)>
	//*  86  161:pop             
	//*  87  162:new             #65  <Class IOException>
	//*  88  165:dup             
	//*  89  166:aload           4
	//*  90  168:invokevirtual   #41  <Method String StringBuilder.toString()>
	//*  91  171:invokespecial   #91  <Method void IOException(String)>
	//*  92  174:athrow          
	//*  93  175:astore_2        
	//*  94  176:aload_0         
	//*  95  177:monitorexit     
	//*  96  178:aload_2         
	//*  97  179:athrow          
		{
			obj = " (target already exists)";
	//   98  180:ldc1            #93  <String " (target already exists)">
	//   99  182:astore_2        
		}
		stringbuilder1 = new StringBuilder();
		stringbuilder1.append("Could not rename temp file: ");
		stringbuilder1.append(((Object) (inProgress)));
		stringbuilder1.append(" -> ");
		stringbuilder1.append(((Object) (file)));
		stringbuilder1.append(((String) (obj)));
		throw new IOException(stringbuilder1.toString());
		obj;
		this;
		JVM INSTR monitorexit ;
		throw obj;
	//* 100  183:goto            113
	}

	public void closeInProgressStream()
		throws IOException
	{
		if(closed)
	//*   0    0:aload_0         
	//*   1    1:getfield        #48  <Field boolean closed>
	//*   2    4:ifeq            8
		{
			return;
	//    3    7:return          
		} else
		{
			closed = true;
	//    4    8:aload_0         
	//    5    9:iconst_1        
	//    6   10:putfield        #48  <Field boolean closed>
			super.flush();
	//    7   13:aload_0         
	//    8   14:invokespecial   #68  <Method void FileOutputStream.flush()>
			super.close();
	//    9   17:aload_0         
	//   10   18:invokespecial   #70  <Method void FileOutputStream.close()>
			return;
	//   11   21:return          
		}
	}

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
	//    2    4:invokespecial   #20  <Method void ClsFileOutputStream$1()>
	//    3    7:putstatic       #22  <Field FilenameFilter TEMP_FILENAME_FILTER>
	//*   4   10:return          
	}
}

// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package ch.qos.logback.core;

import ch.qos.logback.core.recovery.ResilientFileOutputStream;
import ch.qos.logback.core.util.EnvUtil;
import ch.qos.logback.core.util.FileUtil;
import java.io.File;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;

// Referenced classes of package ch.qos.logback.core:
//			OutputStreamAppender, Context, NOPOutputStream

public class FileAppender extends OutputStreamAppender
{

	public FileAppender()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void OutputStreamAppender()>
		append = true;
	//    2    4:aload_0         
	//    3    5:iconst_1        
	//    4    6:putfield        #18  <Field boolean append>
		fileName = null;
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:putfield        #20  <Field String fileName>
		prudent = false;
	//    8   14:aload_0         
	//    9   15:iconst_0        
	//   10   16:putfield        #22  <Field boolean prudent>
		initialized = false;
	//   11   19:aload_0         
	//   12   20:iconst_0        
	//   13   21:putfield        #24  <Field boolean initialized>
		lazyInit = false;
	//   14   24:aload_0         
	//   15   25:iconst_0        
	//   16   26:putfield        #26  <Field boolean lazyInit>
	//   17   29:return          
	}

	private String getAbsoluteFilePath(String s)
	{
		String s1 = s;
	//    0    0:aload_1         
	//    1    1:astore_2        
		if(EnvUtil.isAndroidOS())
	//*   2    2:invokestatic    #35  <Method boolean EnvUtil.isAndroidOS()>
	//*   3    5:ifeq            40
		{
			s1 = s;
	//    4    8:aload_1         
	//    5    9:astore_2        
			if(!(new File(s)).isAbsolute())
	//*   6   10:new             #37  <Class File>
	//*   7   13:dup             
	//*   8   14:aload_1         
	//*   9   15:invokespecial   #40  <Method void File(String)>
	//*  10   18:invokevirtual   #43  <Method boolean File.isAbsolute()>
	//*  11   21:ifne            40
				s1 = FileUtil.prefixRelativePath(context.getProperty("DATA_DIR"), s);
	//   12   24:aload_0         
	//   13   25:getfield        #47  <Field Context context>
	//   14   28:ldc1            #49  <String "DATA_DIR">
	//   15   30:invokeinterface #54  <Method String Context.getProperty(String)>
	//   16   35:aload_1         
	//   17   36:invokestatic    #60  <Method String FileUtil.prefixRelativePath(String, String)>
	//   18   39:astore_2        
		}
		return s1;
	//   19   40:aload_2         
	//   20   41:areturn         
	}

	private void safeWrite(Object obj)
	{
		FileChannel filechannel;
		filechannel = ((ResilientFileOutputStream)getOutputStream()).getChannel();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #66  <Method java.io.OutputStream getOutputStream()>
	//    2    4:checkcast       #68  <Class ResilientFileOutputStream>
	//    3    7:invokevirtual   #72  <Method FileChannel ResilientFileOutputStream.getChannel()>
	//    4   10:astore          7
		if(filechannel == null)
	//*   5   12:aload           7
	//*   6   14:ifnonnull       18
			return;
	//    7   17:return          
		FileLock filelock = filechannel.lock();
	//    8   18:aload           7
	//    9   20:invokevirtual   #78  <Method FileLock FileChannel.lock()>
	//   10   23:astore          6
		long l;
		long l1;
		l = filechannel.position();
	//   11   25:aload           7
	//   12   27:invokevirtual   #82  <Method long FileChannel.position()>
	//   13   30:lstore_2        
		l1 = filechannel.size();
	//   14   31:aload           7
	//   15   33:invokevirtual   #85  <Method long FileChannel.size()>
	//   16   36:lstore          4
		if(l1 == l)
			break MISSING_BLOCK_LABEL_53;
	//   17   38:lload           4
	//   18   40:lload_2         
	//   19   41:lcmp            
	//   20   42:ifeq            53
		filechannel.position(l1);
	//   21   45:aload           7
	//   22   47:lload           4
	//   23   49:invokevirtual   #88  <Method FileChannel FileChannel.position(long)>
	//   24   52:pop             
		super.writeOut(obj);
	//   25   53:aload_0         
	//   26   54:aload_1         
	//   27   55:invokespecial   #91  <Method void OutputStreamAppender.writeOut(Object)>
		if(filelock != null)
	//*  28   58:aload           6
	//*  29   60:ifnull          68
			filelock.release();
	//   30   63:aload           6
	//   31   65:invokevirtual   #96  <Method void FileLock.release()>
		return;
	//   32   68:return          
		Exception exception1;
		exception1;
	//   33   69:astore          7
		Exception exception;
		obj = ((Object) (filelock));
	//   34   71:aload           6
	//   35   73:astore_1        
		exception = exception1;
	//   36   74:aload           7
	//   37   76:astore          6
		break MISSING_BLOCK_LABEL_85;
	//   38   78:goto            85
		exception;
	//   39   81:astore          6
		obj = null;
	//   40   83:aconst_null     
	//   41   84:astore_1        
		if(obj != null)
	//*  42   85:aload_1         
	//*  43   86:ifnull          93
			((FileLock) (obj)).release();
	//   44   89:aload_1         
	//   45   90:invokevirtual   #96  <Method void FileLock.release()>
		throw exception;
	//   46   93:aload           6
	//   47   95:athrow          
	}

	public String getFile()
	{
		return fileName;
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field String fileName>
	//    2    4:areturn         
	}

	public boolean getLazy()
	{
		return lazyInit;
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field boolean lazyInit>
	//    2    4:ireturn         
	}

	public boolean isAppend()
	{
		return append;
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field boolean append>
	//    2    4:ireturn         
	}

	public boolean isPrudent()
	{
		return prudent;
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field boolean prudent>
	//    2    4:ireturn         
	}

	protected boolean openFile(String s)
	{
		Object obj = ((Object) (getAbsoluteFilePath(s)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #107 <Method String getAbsoluteFilePath(String)>
	//    3    5:astore_2        
		synchronized(lock)
	//*   4    6:aload_0         
	//*   5    7:getfield        #110 <Field ch.qos.logback.core.spi.LogbackLock lock>
	//*   6   10:astore_1        
	//*   7   11:aload_1         
	//*   8   12:monitorenter    
		{
			obj = ((Object) (new File(((String) (obj)))));
	//    9   13:new             #37  <Class File>
	//   10   16:dup             
	//   11   17:aload_2         
	//   12   18:invokespecial   #40  <Method void File(String)>
	//   13   21:astore_2        
			if(FileUtil.isParentDirectoryCreationRequired(((File) (obj))) && !FileUtil.createMissingParentDirectories(((File) (obj))))
	//*  14   22:aload_2         
	//*  15   23:invokestatic    #114 <Method boolean FileUtil.isParentDirectoryCreationRequired(File)>
	//*  16   26:ifeq            75
	//*  17   29:aload_2         
	//*  18   30:invokestatic    #117 <Method boolean FileUtil.createMissingParentDirectories(File)>
	//*  19   33:ifne            75
			{
				StringBuilder stringbuilder = new StringBuilder();
	//   20   36:new             #119 <Class StringBuilder>
	//   21   39:dup             
	//   22   40:invokespecial   #120 <Method void StringBuilder()>
	//   23   43:astore_3        
				stringbuilder.append("Failed to create parent directories for [");
	//   24   44:aload_3         
	//   25   45:ldc1            #122 <String "Failed to create parent directories for [">
	//   26   47:invokevirtual   #125 <Method StringBuilder StringBuilder.append(String)>
	//   27   50:pop             
				stringbuilder.append(((File) (obj)).getAbsolutePath());
	//   28   51:aload_3         
	//   29   52:aload_2         
	//   30   53:invokevirtual   #128 <Method String File.getAbsolutePath()>
	//   31   56:invokevirtual   #125 <Method StringBuilder StringBuilder.append(String)>
	//   32   59:pop             
				stringbuilder.append("]");
	//   33   60:aload_3         
	//   34   61:ldc1            #130 <String "]">
	//   35   63:invokevirtual   #125 <Method StringBuilder StringBuilder.append(String)>
	//   36   66:pop             
				addError(stringbuilder.toString());
	//   37   67:aload_0         
	//   38   68:aload_3         
	//   39   69:invokevirtual   #133 <Method String StringBuilder.toString()>
	//   40   72:invokevirtual   #136 <Method void addError(String)>
			}
			obj = ((Object) (new ResilientFileOutputStream(((File) (obj)), append)));
	//   41   75:new             #68  <Class ResilientFileOutputStream>
	//   42   78:dup             
	//   43   79:aload_2         
	//   44   80:aload_0         
	//   45   81:getfield        #18  <Field boolean append>
	//   46   84:invokespecial   #139 <Method void ResilientFileOutputStream(File, boolean)>
	//   47   87:astore_2        
			((ResilientFileOutputStream) (obj)).setContext(context);
	//   48   88:aload_2         
	//   49   89:aload_0         
	//   50   90:getfield        #47  <Field Context context>
	//   51   93:invokevirtual   #143 <Method void ResilientFileOutputStream.setContext(Context)>
			setOutputStream(((java.io.OutputStream) (obj)));
	//   52   96:aload_0         
	//   53   97:aload_2         
	//   54   98:invokevirtual   #147 <Method void setOutputStream(java.io.OutputStream)>
		}
	//   55  101:aload_1         
	//   56  102:monitorexit     
		return true;
	//   57  103:iconst_1        
	//   58  104:ireturn         
		exception;
	//   59  105:astore_2        
		s;
	//   60  106:aload_1         
		JVM INSTR monitorexit ;
	//   61  107:monitorexit     
		throw exception;
	//   62  108:aload_2         
	//   63  109:athrow          
	}

	public final String rawFileProperty()
	{
		return fileName;
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field String fileName>
	//    2    4:areturn         
	}

	public void setAppend(boolean flag)
	{
		append = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #18  <Field boolean append>
	//    3    5:return          
	}

	public void setFile(String s)
	{
		if(s == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       12
			s = null;
	//    2    4:aconst_null     
	//    3    5:astore_1        
		else
	//*   4    6:aload_0         
	//*   5    7:aload_1         
	//*   6    8:putfield        #20  <Field String fileName>
	//*   7   11:return          
			s = s.trim();
	//    8   12:aload_1         
	//    9   13:invokevirtual   #156 <Method String String.trim()>
	//   10   16:astore_1        
		fileName = s;
	//*  11   17:goto            6
	}

	public void setLazy(boolean flag)
	{
		lazyInit = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #26  <Field boolean lazyInit>
	//    3    5:return          
	}

	public void setPrudent(boolean flag)
	{
		prudent = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #22  <Field boolean prudent>
	//    3    5:return          
	}

	public void start()
	{
		boolean flag;
label0:
		{
			String s = getFile();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #163 <Method String getFile()>
	//    2    4:astore_2        
			flag = true;
	//    3    5:iconst_1        
	//    4    6:istore_1        
			if(s != null)
	//*   5    7:aload_2         
	//*   6    8:ifnull          174
			{
				s = getAbsoluteFilePath(s);
	//    7   11:aload_0         
	//    8   12:aload_2         
	//    9   13:invokespecial   #107 <Method String getAbsoluteFilePath(String)>
	//   10   16:astore_2        
				StringBuilder stringbuilder1 = new StringBuilder();
	//   11   17:new             #119 <Class StringBuilder>
	//   12   20:dup             
	//   13   21:invokespecial   #120 <Method void StringBuilder()>
	//   14   24:astore_3        
				stringbuilder1.append("File property is set to [");
	//   15   25:aload_3         
	//   16   26:ldc1            #165 <String "File property is set to [">
	//   17   28:invokevirtual   #125 <Method StringBuilder StringBuilder.append(String)>
	//   18   31:pop             
				stringbuilder1.append(s);
	//   19   32:aload_3         
	//   20   33:aload_2         
	//   21   34:invokevirtual   #125 <Method StringBuilder StringBuilder.append(String)>
	//   22   37:pop             
				stringbuilder1.append("]");
	//   23   38:aload_3         
	//   24   39:ldc1            #130 <String "]">
	//   25   41:invokevirtual   #125 <Method StringBuilder StringBuilder.append(String)>
	//   26   44:pop             
				addInfo(stringbuilder1.toString());
	//   27   45:aload_0         
	//   28   46:aload_3         
	//   29   47:invokevirtual   #133 <Method String StringBuilder.toString()>
	//   30   50:invokevirtual   #168 <Method void addInfo(String)>
				if(prudent && !isAppend())
	//*  31   53:aload_0         
	//*  32   54:getfield        #22  <Field boolean prudent>
	//*  33   57:ifeq            78
	//*  34   60:aload_0         
	//*  35   61:invokevirtual   #170 <Method boolean isAppend()>
	//*  36   64:ifne            78
				{
					setAppend(true);
	//   37   67:aload_0         
	//   38   68:iconst_1        
	//   39   69:invokevirtual   #172 <Method void setAppend(boolean)>
					addWarn("Setting \"Append\" property to true on account of \"Prudent\" mode");
	//   40   72:aload_0         
	//   41   73:ldc1            #174 <String "Setting \"Append\" property to true on account of \"Prudent\" mode">
	//   42   75:invokevirtual   #177 <Method void addWarn(String)>
				}
				if(!lazyInit)
	//*  43   78:aload_0         
	//*  44   79:getfield        #26  <Field boolean lazyInit>
	//*  45   82:ifne            158
					try
					{
						openFile(s);
	//   46   85:aload_0         
	//   47   86:aload_2         
	//   48   87:invokevirtual   #179 <Method boolean openFile(String)>
	//   49   90:pop             
					}
	//*  50   91:goto            169
					catch(IOException ioexception)
	//*  51   94:astore_3        
					{
						StringBuilder stringbuilder2 = new StringBuilder();
	//   52   95:new             #119 <Class StringBuilder>
	//   53   98:dup             
	//   54   99:invokespecial   #120 <Method void StringBuilder()>
	//   55  102:astore          4
						stringbuilder2.append("openFile(");
	//   56  104:aload           4
	//   57  106:ldc1            #181 <String "openFile(">
	//   58  108:invokevirtual   #125 <Method StringBuilder StringBuilder.append(String)>
	//   59  111:pop             
						stringbuilder2.append(s);
	//   60  112:aload           4
	//   61  114:aload_2         
	//   62  115:invokevirtual   #125 <Method StringBuilder StringBuilder.append(String)>
	//   63  118:pop             
						stringbuilder2.append(",");
	//   64  119:aload           4
	//   65  121:ldc1            #183 <String ",">
	//   66  123:invokevirtual   #125 <Method StringBuilder StringBuilder.append(String)>
	//   67  126:pop             
						stringbuilder2.append(append);
	//   68  127:aload           4
	//   69  129:aload_0         
	//   70  130:getfield        #18  <Field boolean append>
	//   71  133:invokevirtual   #186 <Method StringBuilder StringBuilder.append(boolean)>
	//   72  136:pop             
						stringbuilder2.append(") failed");
	//   73  137:aload           4
	//   74  139:ldc1            #188 <String ") failed">
	//   75  141:invokevirtual   #125 <Method StringBuilder StringBuilder.append(String)>
	//   76  144:pop             
						addError(stringbuilder2.toString(), ((Throwable) (ioexception)));
	//   77  145:aload_0         
	//   78  146:aload           4
	//   79  148:invokevirtual   #133 <Method String StringBuilder.toString()>
	//   80  151:aload_3         
	//   81  152:invokevirtual   #191 <Method void addError(String, Throwable)>
						break label0;
	//   82  155:goto            213
					}
				else
					setOutputStream(((java.io.OutputStream) (new NOPOutputStream())));
	//   83  158:aload_0         
	//   84  159:new             #193 <Class NOPOutputStream>
	//   85  162:dup             
	//   86  163:invokespecial   #194 <Method void NOPOutputStream()>
	//   87  166:invokevirtual   #147 <Method void setOutputStream(java.io.OutputStream)>
				flag = false;
	//   88  169:iconst_0        
	//   89  170:istore_1        
			} else
	//*  90  171:goto            213
			{
				StringBuilder stringbuilder = new StringBuilder();
	//   91  174:new             #119 <Class StringBuilder>
	//   92  177:dup             
	//   93  178:invokespecial   #120 <Method void StringBuilder()>
	//   94  181:astore_2        
				stringbuilder.append("\"File\" property not set for appender named [");
	//   95  182:aload_2         
	//   96  183:ldc1            #196 <String "\"File\" property not set for appender named [">
	//   97  185:invokevirtual   #125 <Method StringBuilder StringBuilder.append(String)>
	//   98  188:pop             
				stringbuilder.append(name);
	//   99  189:aload_2         
	//  100  190:aload_0         
	//  101  191:getfield        #199 <Field String name>
	//  102  194:invokevirtual   #125 <Method StringBuilder StringBuilder.append(String)>
	//  103  197:pop             
				stringbuilder.append("]");
	//  104  198:aload_2         
	//  105  199:ldc1            #130 <String "]">
	//  106  201:invokevirtual   #125 <Method StringBuilder StringBuilder.append(String)>
	//  107  204:pop             
				addError(stringbuilder.toString());
	//  108  205:aload_0         
	//  109  206:aload_2         
	//  110  207:invokevirtual   #133 <Method String StringBuilder.toString()>
	//  111  210:invokevirtual   #136 <Method void addError(String)>
			}
		}
		if(!flag)
	//* 112  213:iload_1         
	//* 113  214:ifne            221
			super.start();
	//  114  217:aload_0         
	//  115  218:invokespecial   #201 <Method void OutputStreamAppender.start()>
	//  116  221:return          
	}

	protected void subAppend(Object obj)
	{
		if(!initialized && lazyInit)
	//*   0    0:aload_0         
	//*   1    1:getfield        #24  <Field boolean initialized>
	//*   2    4:ifne            93
	//*   3    7:aload_0         
	//*   4    8:getfield        #26  <Field boolean lazyInit>
	//*   5   11:ifeq            93
		{
			initialized = true;
	//    6   14:aload_0         
	//    7   15:iconst_1        
	//    8   16:putfield        #24  <Field boolean initialized>
			try
			{
				openFile(getFile());
	//    9   19:aload_0         
	//   10   20:aload_0         
	//   11   21:invokevirtual   #163 <Method String getFile()>
	//   12   24:invokevirtual   #179 <Method boolean openFile(String)>
	//   13   27:pop             
			}
	//*  14   28:goto            93
			catch(IOException ioexception)
	//*  15   31:astore_2        
			{
				started = false;
	//   16   32:aload_0         
	//   17   33:iconst_0        
	//   18   34:putfield        #205 <Field boolean started>
				StringBuilder stringbuilder = new StringBuilder();
	//   19   37:new             #119 <Class StringBuilder>
	//   20   40:dup             
	//   21   41:invokespecial   #120 <Method void StringBuilder()>
	//   22   44:astore_3        
				stringbuilder.append("openFile(");
	//   23   45:aload_3         
	//   24   46:ldc1            #181 <String "openFile(">
	//   25   48:invokevirtual   #125 <Method StringBuilder StringBuilder.append(String)>
	//   26   51:pop             
				stringbuilder.append(fileName);
	//   27   52:aload_3         
	//   28   53:aload_0         
	//   29   54:getfield        #20  <Field String fileName>
	//   30   57:invokevirtual   #125 <Method StringBuilder StringBuilder.append(String)>
	//   31   60:pop             
				stringbuilder.append(",");
	//   32   61:aload_3         
	//   33   62:ldc1            #183 <String ",">
	//   34   64:invokevirtual   #125 <Method StringBuilder StringBuilder.append(String)>
	//   35   67:pop             
				stringbuilder.append(append);
	//   36   68:aload_3         
	//   37   69:aload_0         
	//   38   70:getfield        #18  <Field boolean append>
	//   39   73:invokevirtual   #186 <Method StringBuilder StringBuilder.append(boolean)>
	//   40   76:pop             
				stringbuilder.append(") failed");
	//   41   77:aload_3         
	//   42   78:ldc1            #188 <String ") failed">
	//   43   80:invokevirtual   #125 <Method StringBuilder StringBuilder.append(String)>
	//   44   83:pop             
				addError(stringbuilder.toString(), ((Throwable) (ioexception)));
	//   45   84:aload_0         
	//   46   85:aload_3         
	//   47   86:invokevirtual   #133 <Method String StringBuilder.toString()>
	//   48   89:aload_2         
	//   49   90:invokevirtual   #191 <Method void addError(String, Throwable)>
			}
		}
		super.subAppend(obj);
	//   50   93:aload_0         
	//   51   94:aload_1         
	//   52   95:invokespecial   #207 <Method void OutputStreamAppender.subAppend(Object)>
	//   53   98:return          
	}

	protected void writeOut(Object obj)
	{
		if(prudent)
	//*   0    0:aload_0         
	//*   1    1:getfield        #22  <Field boolean prudent>
	//*   2    4:ifeq            13
		{
			safeWrite(obj);
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:invokespecial   #209 <Method void safeWrite(Object)>
			return;
	//    6   12:return          
		} else
		{
			super.writeOut(obj);
	//    7   13:aload_0         
	//    8   14:aload_1         
	//    9   15:invokespecial   #91  <Method void OutputStreamAppender.writeOut(Object)>
			return;
	//   10   18:return          
		}
	}

	protected boolean append;
	protected String fileName;
	private boolean initialized;
	private boolean lazyInit;
	private boolean prudent;
}

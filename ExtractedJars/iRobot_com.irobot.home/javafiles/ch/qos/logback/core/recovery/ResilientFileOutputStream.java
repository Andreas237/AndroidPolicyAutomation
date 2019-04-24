// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package ch.qos.logback.core.recovery;

import java.io.*;
import java.nio.channels.FileChannel;

// Referenced classes of package ch.qos.logback.core.recovery:
//			ResilientOutputStreamBase

public class ResilientFileOutputStream extends ResilientOutputStreamBase
{

	public ResilientFileOutputStream(File file1, boolean flag)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void ResilientOutputStreamBase()>
		file = file1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #15  <Field File file>
		fos = new FileOutputStream(file1, flag);
	//    5    9:aload_0         
	//    6   10:new             #17  <Class FileOutputStream>
	//    7   13:dup             
	//    8   14:aload_1         
	//    9   15:iload_2         
	//   10   16:invokespecial   #19  <Method void FileOutputStream(File, boolean)>
	//   11   19:putfield        #21  <Field FileOutputStream fos>
		os = ((OutputStream) (new BufferedOutputStream(((OutputStream) (fos)))));
	//   12   22:aload_0         
	//   13   23:new             #23  <Class BufferedOutputStream>
	//   14   26:dup             
	//   15   27:aload_0         
	//   16   28:getfield        #21  <Field FileOutputStream fos>
	//   17   31:invokespecial   #26  <Method void BufferedOutputStream(OutputStream)>
	//   18   34:putfield        #30  <Field OutputStream os>
		presumedClean = true;
	//   19   37:aload_0         
	//   20   38:iconst_1        
	//   21   39:putfield        #34  <Field boolean presumedClean>
	//   22   42:return          
	}

	public FileChannel getChannel()
	{
		if(os == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #30  <Field OutputStream os>
	//*   2    4:ifnonnull       9
			return null;
	//    3    7:aconst_null     
	//    4    8:areturn         
		else
			return fos.getChannel();
	//    5    9:aload_0         
	//    6   10:getfield        #21  <Field FileOutputStream fos>
	//    7   13:invokevirtual   #39  <Method FileChannel FileOutputStream.getChannel()>
	//    8   16:areturn         
	}

	String getDescription()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #43  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #44  <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append("file [");
	//    4    8:aload_1         
	//    5    9:ldc1            #46  <String "file [">
	//    6   11:invokevirtual   #50  <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		stringbuilder.append(((Object) (file)));
	//    8   15:aload_1         
	//    9   16:aload_0         
	//   10   17:getfield        #15  <Field File file>
	//   11   20:invokevirtual   #53  <Method StringBuilder StringBuilder.append(Object)>
	//   12   23:pop             
		stringbuilder.append("]");
	//   13   24:aload_1         
	//   14   25:ldc1            #55  <String "]">
	//   15   27:invokevirtual   #50  <Method StringBuilder StringBuilder.append(String)>
	//   16   30:pop             
		return stringbuilder.toString();
	//   17   31:aload_1         
	//   18   32:invokevirtual   #58  <Method String StringBuilder.toString()>
	//   19   35:areturn         
	}

	public File getFile()
	{
		return file;
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field File file>
	//    2    4:areturn         
	}

	OutputStream openNewOutputStream()
	{
		fos = new FileOutputStream(file, true);
	//    0    0:aload_0         
	//    1    1:new             #17  <Class FileOutputStream>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:getfield        #15  <Field File file>
	//    5    9:iconst_1        
	//    6   10:invokespecial   #19  <Method void FileOutputStream(File, boolean)>
	//    7   13:putfield        #21  <Field FileOutputStream fos>
		return ((OutputStream) (new BufferedOutputStream(((OutputStream) (fos)))));
	//    8   16:new             #23  <Class BufferedOutputStream>
	//    9   19:dup             
	//   10   20:aload_0         
	//   11   21:getfield        #21  <Field FileOutputStream fos>
	//   12   24:invokespecial   #26  <Method void BufferedOutputStream(OutputStream)>
	//   13   27:areturn         
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #43  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #44  <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append("c.q.l.c.recovery.ResilientFileOutputStream@");
	//    4    8:aload_1         
	//    5    9:ldc1            #64  <String "c.q.l.c.recovery.ResilientFileOutputStream@">
	//    6   11:invokevirtual   #50  <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		stringbuilder.append(System.identityHashCode(((Object) (this))));
	//    8   15:aload_1         
	//    9   16:aload_0         
	//   10   17:invokestatic    #70  <Method int System.identityHashCode(Object)>
	//   11   20:invokevirtual   #73  <Method StringBuilder StringBuilder.append(int)>
	//   12   23:pop             
		return stringbuilder.toString();
	//   13   24:aload_1         
	//   14   25:invokevirtual   #58  <Method String StringBuilder.toString()>
	//   15   28:areturn         
	}

	private File file;
	private FileOutputStream fos;
}

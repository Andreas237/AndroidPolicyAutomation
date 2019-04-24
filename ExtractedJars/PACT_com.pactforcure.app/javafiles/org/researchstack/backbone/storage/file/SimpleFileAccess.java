// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package org.researchstack.backbone.storage.file;

import android.content.Context;
import java.io.*;
import java.security.GeneralSecurityException;
import org.researchstack.backbone.storage.file.aes.Encrypter;
import org.researchstack.backbone.utils.FileUtils;

// Referenced classes of package org.researchstack.backbone.storage.file:
//			FileAccess, StorageAccessException

public class SimpleFileAccess
	implements FileAccess
{

	public SimpleFileAccess()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void Object()>
	//    2    4:return          
	}

	private File findLocalFile(Context context, String s)
	{
		checkPath(s);
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:invokevirtual   #20  <Method void checkPath(String)>
		return new File((new StringBuilder()).append(((Object) (context.getFilesDir()))).append(s).toString());
	//    3    5:new             #22  <Class File>
	//    4    8:dup             
	//    5    9:new             #24  <Class StringBuilder>
	//    6   12:dup             
	//    7   13:invokespecial   #25  <Method void StringBuilder()>
	//    8   16:aload_1         
	//    9   17:invokevirtual   #31  <Method File Context.getFilesDir()>
	//   10   20:invokevirtual   #35  <Method StringBuilder StringBuilder.append(Object)>
	//   11   23:aload_2         
	//   12   24:invokevirtual   #38  <Method StringBuilder StringBuilder.append(String)>
	//   13   27:invokevirtual   #42  <Method String StringBuilder.toString()>
	//   14   30:invokespecial   #44  <Method void File(String)>
	//   15   33:areturn         
	}

	public void checkPath(String s)
	{
		if(!s.startsWith("/"))
	//*   0    0:aload_1         
	//*   1    1:ldc1            #47  <String "/">
	//*   2    3:invokevirtual   #53  <Method boolean String.startsWith(String)>
	//*   3    6:ifne            19
			throw new StorageAccessException("Path must be absolute (ie start with '/')");
	//    4    9:new             #55  <Class StorageAccessException>
	//    5   12:dup             
	//    6   13:ldc1            #57  <String "Path must be absolute (ie start with '/')">
	//    7   15:invokespecial   #58  <Method void StorageAccessException(String)>
	//    8   18:athrow          
		else
			return;
	//    9   19:return          
	}

	public void clearData(Context context, String s)
	{
		findLocalFile(context, s).delete();
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #62  <Method File findLocalFile(Context, String)>
	//    4    6:invokevirtual   #66  <Method boolean File.delete()>
	//    5    9:pop             
	//    6   10:return          
	}

	public boolean dataExists(Context context, String s)
	{
		return findLocalFile(context, s).exists();
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #62  <Method File findLocalFile(Context, String)>
	//    4    6:invokevirtual   #72  <Method boolean File.exists()>
	//    5    9:ireturn         
	}

	public void moveData(Context context, String s, String s1)
	{
		s = ((String) (findLocalFile(context, s)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #62  <Method File findLocalFile(Context, String)>
	//    4    6:astore_2        
		context = ((Context) (findLocalFile(context, s1)));
	//    5    7:aload_0         
	//    6    8:aload_1         
	//    7    9:aload_3         
	//    8   10:invokespecial   #62  <Method File findLocalFile(Context, String)>
	//    9   13:astore_1        
		FileUtils.makeParent(((File) (context)));
	//   10   14:aload_1         
	//   11   15:invokestatic    #82  <Method void FileUtils.makeParent(File)>
		try
		{
			FileUtils.copy(((java.io.InputStream) (new FileInputStream(((File) (s))))), ((File) (context)));
	//   12   18:new             #84  <Class FileInputStream>
	//   13   21:dup             
	//   14   22:aload_2         
	//   15   23:invokespecial   #86  <Method void FileInputStream(File)>
	//   16   26:aload_1         
	//   17   27:invokestatic    #90  <Method void FileUtils.copy(java.io.InputStream, File)>
		}
	//*  18   30:aload_2         
	//*  19   31:invokevirtual   #66  <Method boolean File.delete()>
	//*  20   34:ifne            57
	//*  21   37:new             #92  <Class RuntimeException>
	//*  22   40:dup             
	//*  23   41:ldc1            #94  <String "Failed to delete temp file">
	//*  24   43:invokespecial   #95  <Method void RuntimeException(String)>
	//*  25   46:athrow          
		// Misplaced declaration of an exception variable
		catch(Context context)
	//*  26   47:astore_1        
		{
			throw new RuntimeException(((Throwable) (context)));
	//   27   48:new             #92  <Class RuntimeException>
	//   28   51:dup             
	//   29   52:aload_1         
	//   30   53:invokespecial   #98  <Method void RuntimeException(Throwable)>
	//   31   56:athrow          
		}
		if(!((File) (s)).delete())
			throw new RuntimeException("Failed to delete temp file");
		else
			return;
	//   32   57:return          
	}

	public byte[] readData(Context context, String s)
	{
		context = ((Context) (findLocalFile(context, s)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #62  <Method File findLocalFile(Context, String)>
	//    4    6:astore_1        
		context = ((Context) (encrypter.decrypt(FileUtils.readAll(((File) (context))))));
	//    5    7:aload_0         
	//    6    8:getfield        #104 <Field Encrypter encrypter>
	//    7   11:aload_1         
	//    8   12:invokestatic    #108 <Method byte[] FileUtils.readAll(File)>
	//    9   15:invokeinterface #114 <Method byte[] Encrypter.decrypt(byte[])>
	//   10   20:astore_1        
		return ((byte []) (context));
	//   11   21:aload_1         
	//   12   22:areturn         
		context;
	//   13   23:astore_1        
_L2:
		throw new StorageAccessException(((Throwable) (context)));
	//   14   24:new             #55  <Class StorageAccessException>
	//   15   27:dup             
	//   16   28:aload_1         
	//   17   29:invokespecial   #115 <Method void StorageAccessException(Throwable)>
	//   18   32:athrow          
		context;
	//   19   33:astore_1        
		if(true) goto _L2; else goto _L1
_L1:
	//*  20   34:goto            24
	}

	public void setEncrypter(Encrypter encrypter1)
	{
		encrypter = encrypter1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #104 <Field Encrypter encrypter>
	//    3    5:return          
	}

	public void writeData(Context context, String s, byte abyte0[])
	{
		try
		{
			context = ((Context) (findLocalFile(context, s)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #62  <Method File findLocalFile(Context, String)>
	//    4    6:astore_1        
			FileUtils.makeParent(((File) (context)));
	//    5    7:aload_1         
	//    6    8:invokestatic    #82  <Method void FileUtils.makeParent(File)>
			FileUtils.writeSafe(((File) (context)), encrypter.encrypt(abyte0));
	//    7   11:aload_1         
	//    8   12:aload_0         
	//    9   13:getfield        #104 <Field Encrypter encrypter>
	//   10   16:aload_3         
	//   11   17:invokeinterface #122 <Method byte[] Encrypter.encrypt(byte[])>
	//   12   22:invokestatic    #126 <Method void FileUtils.writeSafe(File, byte[])>
			return;
	//   13   25:return          
		}
		// Misplaced declaration of an exception variable
		catch(Context context)
	//*  14   26:astore_1        
		{
			throw new StorageAccessException(((Throwable) (context)));
	//   15   27:new             #55  <Class StorageAccessException>
	//   16   30:dup             
	//   17   31:aload_1         
	//   18   32:invokespecial   #115 <Method void StorageAccessException(Throwable)>
	//   19   35:athrow          
		}
	}

	private Encrypter encrypter;
}

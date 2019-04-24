// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package o;

import android.util.Log;
import java.io.*;

public class dig
{

	public dig()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void Object()>
	//    2    4:return          
	}

	public static boolean e(File file, byte abyte0[], boolean flag)
	{
		File file1;
		File file2;
		file2 = null;
	//    0    0:aconst_null     
	//    1    1:astore          4
		file1 = null;
	//    2    3:aconst_null     
	//    3    4:astore_3        
		file = ((File) (new FileOutputStream(file, flag)));
	//    4    5:new             #15  <Class FileOutputStream>
	//    5    8:dup             
	//    6    9:aload_0         
	//    7   10:iload_2         
	//    8   11:invokespecial   #18  <Method void FileOutputStream(File, boolean)>
	//    9   14:astore_0        
		file1 = file;
	//   10   15:aload_0         
	//   11   16:astore_3        
		file2 = file;
	//   12   17:aload_0         
	//   13   18:astore          4
		((FileOutputStream) (file)).write(abyte0);
	//   14   20:aload_0         
	//   15   21:aload_1         
	//   16   22:invokevirtual   #22  <Method void FileOutputStream.write(byte[])>
		file1 = file;
	//   17   25:aload_0         
	//   18   26:astore_3        
		file2 = file;
	//   19   27:aload_0         
	//   20   28:astore          4
		((FileOutputStream) (file)).flush();
	//   21   30:aload_0         
	//   22   31:invokevirtual   #25  <Method void FileOutputStream.flush()>
		if(file == null)
			break MISSING_BLOCK_LABEL_53;
	//   23   34:aload_0         
	//   24   35:ifnull          53
		((FileOutputStream) (file)).close();
	//   25   38:aload_0         
	//   26   39:invokevirtual   #28  <Method void FileOutputStream.close()>
		return true;
	//   27   42:iconst_1        
	//   28   43:ireturn         
		file;
	//   29   44:astore_0        
		Log.w("LogUtil_FileWriter", "logOut close failed");
	//   30   45:ldc1            #30  <String "LogUtil_FileWriter">
	//   31   47:ldc1            #32  <String "logOut close failed">
	//   32   49:invokestatic    #38  <Method int Log.w(String, String)>
	//   33   52:pop             
		return true;
	//   34   53:iconst_1        
	//   35   54:ireturn         
		file;
	//   36   55:astore_0        
		file2 = file1;
	//   37   56:aload_3         
	//   38   57:astore          4
		Log.w("LogUtil_FileWriter", (new StringBuilder()).append("writeFile IOException:").append(((IOException) (file)).getMessage()).toString());
	//   39   59:ldc1            #30  <String "LogUtil_FileWriter">
	//   40   61:new             #40  <Class StringBuilder>
	//   41   64:dup             
	//   42   65:invokespecial   #41  <Method void StringBuilder()>
	//   43   68:ldc1            #43  <String "writeFile IOException:">
	//   44   70:invokevirtual   #47  <Method StringBuilder StringBuilder.append(String)>
	//   45   73:aload_0         
	//   46   74:invokevirtual   #51  <Method String IOException.getMessage()>
	//   47   77:invokevirtual   #47  <Method StringBuilder StringBuilder.append(String)>
	//   48   80:invokevirtual   #54  <Method String StringBuilder.toString()>
	//   49   83:invokestatic    #38  <Method int Log.w(String, String)>
	//   50   86:pop             
		if(file1 == null)
			break MISSING_BLOCK_LABEL_106;
	//   51   87:aload_3         
	//   52   88:ifnull          106
		((FileOutputStream) (file1)).close();
	//   53   91:aload_3         
	//   54   92:invokevirtual   #28  <Method void FileOutputStream.close()>
		return false;
	//   55   95:iconst_0        
	//   56   96:ireturn         
		file;
	//   57   97:astore_0        
		Log.w("LogUtil_FileWriter", "logOut close failed");
	//   58   98:ldc1            #30  <String "LogUtil_FileWriter">
	//   59  100:ldc1            #32  <String "logOut close failed">
	//   60  102:invokestatic    #38  <Method int Log.w(String, String)>
	//   61  105:pop             
		return false;
	//   62  106:iconst_0        
	//   63  107:ireturn         
		file;
	//   64  108:astore_0        
		if(file2 != null)
	//*  65  109:aload           4
	//*  66  111:ifnull          131
			try
			{
				((FileOutputStream) (file2)).close();
	//   67  114:aload           4
	//   68  116:invokevirtual   #28  <Method void FileOutputStream.close()>
			}
	//*  69  119:goto            131
			// Misplaced declaration of an exception variable
			catch(byte abyte0[])
	//*  70  122:astore_1        
			{
				Log.w("LogUtil_FileWriter", "logOut close failed");
	//   71  123:ldc1            #30  <String "LogUtil_FileWriter">
	//   72  125:ldc1            #32  <String "logOut close failed">
	//   73  127:invokestatic    #38  <Method int Log.w(String, String)>
	//   74  130:pop             
			}
		throw file;
	//   75  131:aload_0         
	//   76  132:athrow          
	}
}

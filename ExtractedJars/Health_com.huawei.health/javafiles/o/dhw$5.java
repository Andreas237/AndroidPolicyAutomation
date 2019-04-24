// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package o;

import android.util.Log;
import java.io.File;
import java.io.FileFilter;

// Referenced classes of package o:
//			dhw

static final class dhw$5
	implements FileFilter
{

	public boolean accept(File file)
	{
		if(file == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       14
		{
			Log.w("LogUtil_LockManager", "reject lock,temp null");
	//    2    4:ldc1            #20  <String "LogUtil_LockManager">
	//    3    6:ldc1            #22  <String "reject lock,temp null">
	//    4    8:invokestatic    #28  <Method int Log.w(String, String)>
	//    5   11:pop             
			return false;
	//    6   12:iconst_0        
	//    7   13:ireturn         
		}
		if(file.exists() && file.isDirectory())
	//*   8   14:aload_1         
	//*   9   15:invokevirtual   #34  <Method boolean File.exists()>
	//*  10   18:ifeq            58
	//*  11   21:aload_1         
	//*  12   22:invokevirtual   #37  <Method boolean File.isDirectory()>
	//*  13   25:ifeq            58
		{
			Log.i("LogUtil_LockManager", (new StringBuilder()).append("accept lock:").append(file.getAbsolutePath()).toString());
	//   14   28:ldc1            #20  <String "LogUtil_LockManager">
	//   15   30:new             #39  <Class StringBuilder>
	//   16   33:dup             
	//   17   34:invokespecial   #40  <Method void StringBuilder()>
	//   18   37:ldc1            #42  <String "accept lock:">
	//   19   39:invokevirtual   #46  <Method StringBuilder StringBuilder.append(String)>
	//   20   42:aload_1         
	//   21   43:invokevirtual   #50  <Method String File.getAbsolutePath()>
	//   22   46:invokevirtual   #46  <Method StringBuilder StringBuilder.append(String)>
	//   23   49:invokevirtual   #53  <Method String StringBuilder.toString()>
	//   24   52:invokestatic    #56  <Method int Log.i(String, String)>
	//   25   55:pop             
			return true;
	//   26   56:iconst_1        
	//   27   57:ireturn         
		} else
		{
			Log.w("LogUtil_LockManager", (new StringBuilder()).append("reject lock:").append(file.getAbsolutePath()).toString());
	//   28   58:ldc1            #20  <String "LogUtil_LockManager">
	//   29   60:new             #39  <Class StringBuilder>
	//   30   63:dup             
	//   31   64:invokespecial   #40  <Method void StringBuilder()>
	//   32   67:ldc1            #58  <String "reject lock:">
	//   33   69:invokevirtual   #46  <Method StringBuilder StringBuilder.append(String)>
	//   34   72:aload_1         
	//   35   73:invokevirtual   #50  <Method String File.getAbsolutePath()>
	//   36   76:invokevirtual   #46  <Method StringBuilder StringBuilder.append(String)>
	//   37   79:invokevirtual   #53  <Method String StringBuilder.toString()>
	//   38   82:invokestatic    #28  <Method int Log.w(String, String)>
	//   39   85:pop             
			return false;
	//   40   86:iconst_0        
	//   41   87:ireturn         
		}
	}

	dhw$5()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
	//    2    4:return          
	}
}

// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.os;

import android.os.Environment;
import android.util.Log;
import java.io.File;
import java.io.IOException;

public final class EnvironmentCompat
{

	private EnvironmentCompat()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
	//    2    4:return          
	}

	public static String getStorageState(File file)
	{
		if(android.os.Build.VERSION.SDK_INT >= 19)
	//*   0    0:getstatic       #26  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          19
	//*   2    5:icmplt          13
			return Environment.getStorageState(file);
	//    3    8:aload_0         
	//    4    9:invokestatic    #30  <Method String Environment.getStorageState(File)>
	//    5   12:areturn         
		if(!file.getCanonicalPath().startsWith(Environment.getExternalStorageDirectory().getCanonicalPath()))
			break MISSING_BLOCK_LABEL_61;
	//    6   13:aload_0         
	//    7   14:invokevirtual   #36  <Method String File.getCanonicalPath()>
	//    8   17:invokestatic    #40  <Method File Environment.getExternalStorageDirectory()>
	//    9   20:invokevirtual   #36  <Method String File.getCanonicalPath()>
	//   10   23:invokevirtual   #46  <Method boolean String.startsWith(String)>
	//   11   26:ifeq            61
		file = ((File) (Environment.getExternalStorageState()));
	//   12   29:invokestatic    #49  <Method String Environment.getExternalStorageState()>
	//   13   32:astore_0        
		return ((String) (file));
	//   14   33:aload_0         
	//   15   34:areturn         
		file;
	//   16   35:astore_0        
		Log.w("EnvironmentCompat", (new StringBuilder()).append("Failed to resolve canonical path: ").append(((Object) (file))).toString());
	//   17   36:ldc1            #11  <String "EnvironmentCompat">
	//   18   38:new             #51  <Class StringBuilder>
	//   19   41:dup             
	//   20   42:invokespecial   #52  <Method void StringBuilder()>
	//   21   45:ldc1            #54  <String "Failed to resolve canonical path: ">
	//   22   47:invokevirtual   #58  <Method StringBuilder StringBuilder.append(String)>
	//   23   50:aload_0         
	//   24   51:invokevirtual   #61  <Method StringBuilder StringBuilder.append(Object)>
	//   25   54:invokevirtual   #64  <Method String StringBuilder.toString()>
	//   26   57:invokestatic    #70  <Method int Log.w(String, String)>
	//   27   60:pop             
		return "unknown";
	//   28   61:ldc1            #8   <String "unknown">
	//   29   63:areturn         
	}

	public static final String MEDIA_UNKNOWN = "unknown";
	private static final String TAG = "EnvironmentCompat";
}

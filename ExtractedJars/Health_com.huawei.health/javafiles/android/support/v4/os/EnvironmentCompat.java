// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.os;

import android.os.Environment;
import android.util.Log;
import java.io.File;
import java.io.IOException;

// Referenced classes of package android.support.v4.os:
//			EnvironmentCompatKitKat

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
			return EnvironmentCompatKitKat.getStorageState(file);
	//    3    8:aload_0         
	//    4    9:invokestatic    #30  <Method String EnvironmentCompatKitKat.getStorageState(File)>
	//    5   12:areturn         
		if(!file.getCanonicalPath().startsWith(Environment.getExternalStorageDirectory().getCanonicalPath()))
			break MISSING_BLOCK_LABEL_64;
	//    6   13:aload_0         
	//    7   14:invokevirtual   #36  <Method String File.getCanonicalPath()>
	//    8   17:invokestatic    #42  <Method File Environment.getExternalStorageDirectory()>
	//    9   20:invokevirtual   #36  <Method String File.getCanonicalPath()>
	//   10   23:invokevirtual   #48  <Method boolean String.startsWith(String)>
	//   11   26:ifeq            35
		file = ((File) (Environment.getExternalStorageState()));
	//   12   29:invokestatic    #51  <Method String Environment.getExternalStorageState()>
	//   13   32:astore_0        
		return ((String) (file));
	//   14   33:aload_0         
	//   15   34:areturn         
	//*  16   35:goto            64
		file;
	//   17   38:astore_0        
		Log.w("EnvironmentCompat", (new StringBuilder()).append("Failed to resolve canonical path: ").append(((Object) (file))).toString());
	//   18   39:ldc1            #11  <String "EnvironmentCompat">
	//   19   41:new             #53  <Class StringBuilder>
	//   20   44:dup             
	//   21   45:invokespecial   #54  <Method void StringBuilder()>
	//   22   48:ldc1            #56  <String "Failed to resolve canonical path: ">
	//   23   50:invokevirtual   #60  <Method StringBuilder StringBuilder.append(String)>
	//   24   53:aload_0         
	//   25   54:invokevirtual   #63  <Method StringBuilder StringBuilder.append(Object)>
	//   26   57:invokevirtual   #66  <Method String StringBuilder.toString()>
	//   27   60:invokestatic    #72  <Method int Log.w(String, String)>
	//   28   63:pop             
		return "unknown";
	//   29   64:ldc1            #8   <String "unknown">
	//   30   66:areturn         
	}

	public static final String MEDIA_UNKNOWN = "unknown";
	private static final String TAG = "EnvironmentCompat";
}

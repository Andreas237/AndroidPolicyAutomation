// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package o;

import android.os.Environment;
import java.io.File;

// Referenced classes of package o:
//			en

public final class fb
{

	public static boolean a()
	{
		String s = Environment.getExternalStorageState();
	//    0    0:invokestatic    #12  <Method String Environment.getExternalStorageState()>
	//    1    3:astore_0        
		return s != null && s.length() > 0 && (s.equals("mounted") || s.equals("mounted_ro")) && Environment.getExternalStorageDirectory() != null;
	//    2    4:aload_0         
	//    3    5:ifnull          41
	//    4    8:aload_0         
	//    5    9:invokevirtual   #18  <Method int String.length()>
	//    6   12:ifle            41
	//    7   15:aload_0         
	//    8   16:ldc1            #20  <String "mounted">
	//    9   18:invokevirtual   #24  <Method boolean String.equals(Object)>
	//   10   21:ifne            33
	//   11   24:aload_0         
	//   12   25:ldc1            #26  <String "mounted_ro">
	//   13   27:invokevirtual   #24  <Method boolean String.equals(Object)>
	//   14   30:ifeq            41
	//   15   33:invokestatic    #30  <Method File Environment.getExternalStorageDirectory()>
	//   16   36:ifnull          41
	//   17   39:iconst_1        
	//   18   40:ireturn         
	//   19   41:iconst_0        
	//   20   42:ireturn         
	}

	public static String e(String s)
	{
		if(!a())
			break MISSING_BLOCK_LABEL_36;
	//    0    0:invokestatic    #37  <Method boolean a()>
	//    1    3:ifeq            36
		String s1 = Environment.getExternalStorageDirectory().getAbsolutePath();
	//    2    6:invokestatic    #30  <Method File Environment.getExternalStorageDirectory()>
	//    3    9:invokevirtual   #42  <Method String File.getAbsolutePath()>
	//    4   12:astore_1        
		if(!(new File(s1, s)).exists())
			break MISSING_BLOCK_LABEL_36;
	//    5   13:new             #39  <Class File>
	//    6   16:dup             
	//    7   17:aload_1         
	//    8   18:aload_0         
	//    9   19:invokespecial   #46  <Method void File(String, String)>
	//   10   22:invokevirtual   #49  <Method boolean File.exists()>
	//   11   25:ifeq            36
		s = en.c(s1, s);
	//   12   28:aload_1         
	//   13   29:aload_0         
	//   14   30:invokestatic    #55  <Method String en.c(String, String)>
	//   15   33:astore_0        
		return s;
	//   16   34:aload_0         
	//   17   35:areturn         
_L2:
		return null;
	//   18   36:aconst_null     
	//   19   37:areturn         
		s;
	//   20   38:astore_0        
		if(true) goto _L2; else goto _L1
_L1:
	//*  21   39:goto            36
	}
}

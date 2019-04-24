// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package o;

import android.util.Log;
import java.io.File;
import java.io.UnsupportedEncodingException;

// Referenced classes of package o:
//			did, dhw, dig

public class dil
	implements did
{

	public dil()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #10  <Method void Object()>
	//    2    4:return          
	}

	private static boolean b(File file, byte abyte0[], boolean flag)
	{
		dhw.c c = dhw.b();
	//    0    0:invokestatic    #18  <Method dhw$c dhw.b()>
	//    1    3:astore_3        
		if(c == null)
	//*   2    4:aload_3         
	//*   3    5:ifnonnull       10
		{
			return false;
	//    4    8:iconst_0        
	//    5    9:ireturn         
		} else
		{
			flag = dig.e(file, abyte0, flag);
	//    6   10:aload_0         
	//    7   11:aload_1         
	//    8   12:iload_2         
	//    9   13:invokestatic    #23  <Method boolean dig.e(File, byte[], boolean)>
	//   10   16:istore_2        
			c.a();
	//   11   17:aload_3         
	//   12   18:invokevirtual   #28  <Method void dhw$c.a()>
			return flag;
	//   13   21:iload_2         
	//   14   22:ireturn         
		}
	}

	public void a()
	{
	//    0    0:return          
	}

	public boolean a(File file, String s, boolean flag)
	{
		flag = false;
	//    0    0:iconst_0        
	//    1    1:istore_3        
		Object obj = null;
	//    2    2:aconst_null     
	//    3    3:astore          4
		try
		{
			s = ((String) (s.getBytes("UTF-8")));
	//    4    5:aload_2         
	//    5    6:ldc1            #33  <String "UTF-8">
	//    6    8:invokevirtual   #39  <Method byte[] String.getBytes(String)>
	//    7   11:astore_2        
		}
	//*   8   12:goto            27
		// Misplaced declaration of an exception variable
		catch(String s)
	//*   9   15:astore_2        
		{
			Log.w("LogUtil_StrWriterImpl", "write file failed");
	//   10   16:ldc1            #41  <String "LogUtil_StrWriterImpl">
	//   11   18:ldc1            #43  <String "write file failed">
	//   12   20:invokestatic    #49  <Method int Log.w(String, String)>
	//   13   23:pop             
			s = ((String) (obj));
	//   14   24:aload           4
	//   15   26:astore_2        
		}
		if(s != null)
	//*  16   27:aload_2         
	//*  17   28:ifnull          38
			flag = b(file, ((byte []) (s)), true);
	//   18   31:aload_1         
	//   19   32:aload_2         
	//   20   33:iconst_1        
	//   21   34:invokestatic    #51  <Method boolean b(File, byte[], boolean)>
	//   22   37:istore_3        
		return flag;
	//   23   38:iload_3         
	//   24   39:ireturn         
	}

	public void b(File file, boolean flag)
	{
	//    0    0:return          
	}
}

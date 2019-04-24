// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package o;

import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;

// Referenced classes of package o:
//			dif, dij, dil, did, 
//			dhu, dih

public class dii extends dif
{

	public dii(Looper looper, dih dih1)
	{
		super(looper);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #13  <Method void dif(Looper)>
		c = ((did) (new dij(((did) (new dil())))));
	//    3    5:aload_0         
	//    4    6:new             #15  <Class dij>
	//    5    9:dup             
	//    6   10:new             #17  <Class dil>
	//    7   13:dup             
	//    8   14:invokespecial   #20  <Method void dil()>
	//    9   17:invokespecial   #23  <Method void dij(did)>
	//   10   20:putfield        #25  <Field did c>
		d = null;
	//   11   23:aload_0         
	//   12   24:aconst_null     
	//   13   25:putfield        #27  <Field dih d>
		d = dih1;
	//   14   28:aload_0         
	//   15   29:aload_2         
	//   16   30:putfield        #27  <Field dih d>
	//   17   33:return          
	}

	public void c()
	{
		c.a();
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field did c>
	//    2    4:invokeinterface #33  <Method void did.a()>
	//    3    9:return          
	}

	public void c(String s)
	{
		a(((Object) (s)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #37  <Method void a(Object)>
	//    3    5:return          
	}

	protected void d(Object obj, String s)
	{
		String s1 = (String)obj;
	//    0    0:aload_1         
	//    1    1:checkcast       #40  <Class String>
	//    2    4:astore_3        
		if(!TextUtils.isEmpty(((CharSequence) (s))))
	//*   3    5:aload_2         
	//*   4    6:invokestatic    #46  <Method boolean TextUtils.isEmpty(CharSequence)>
	//*   5    9:ifne            20
			obj = ((Object) (dhu.d(s)));
	//    6   12:aload_2         
	//    7   13:invokestatic    #51  <Method dhu dhu.d(String)>
	//    8   16:astore_1        
		else
	//*   9   17:goto            24
			obj = ((Object) (dhu.f()));
	//   10   20:invokestatic    #55  <Method dhu dhu.f()>
	//   11   23:astore_1        
		obj = ((Object) (((dhu) (obj)).r()));
	//   12   24:aload_1         
	//   13   25:invokevirtual   #59  <Method java.io.File dhu.r()>
	//   14   28:astore_1        
		if(s1 == null)
	//*  15   29:aload_3         
	//*  16   30:ifnonnull       45
		{
			c.b(((java.io.File) (obj)), true);
	//   17   33:aload_0         
	//   18   34:getfield        #25  <Field did c>
	//   19   37:aload_1         
	//   20   38:iconst_1        
	//   21   39:invokeinterface #63  <Method void did.b(java.io.File, boolean)>
			return;
	//   22   44:return          
		}
		if(obj != null)
	//*  23   45:aload_1         
	//*  24   46:ifnull          73
		{
			if(!c.a(((java.io.File) (obj)), s1, true))
	//*  25   49:aload_0         
	//*  26   50:getfield        #25  <Field did c>
	//*  27   53:aload_1         
	//*  28   54:aload_3         
	//*  29   55:iconst_1        
	//*  30   56:invokeinterface #66  <Method boolean did.a(java.io.File, String, boolean)>
	//*  31   61:ifne            81
			{
				Log.w("LogUtil_LogFileHandler", "writer.write() in Handler failed");
	//   32   64:ldc1            #68  <String "LogUtil_LogFileHandler">
	//   33   66:ldc1            #70  <String "writer.write() in Handler failed">
	//   34   68:invokestatic    #76  <Method int Log.w(String, String)>
	//   35   71:pop             
				return;
	//   36   72:return          
			}
		} else
		{
			Log.w("LogUtil_LogFileHandler", "get log file failed.");
	//   37   73:ldc1            #68  <String "LogUtil_LogFileHandler">
	//   38   75:ldc1            #78  <String "get log file failed.">
	//   39   77:invokestatic    #76  <Method int Log.w(String, String)>
	//   40   80:pop             
		}
	//   41   81:return          
	}

	protected void e()
	{
		d.e();
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field dih d>
	//    2    4:invokevirtual   #83  <Method void dih.e()>
	//    3    7:return          
	}

	private did c;
	private dih d;
}

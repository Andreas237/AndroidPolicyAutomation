// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package o;

import android.util.Log;
import java.io.File;

// Referenced classes of package o:
//			dhw

public static class dhw$c
{

	public void a()
	{
		c = null;
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:putfield        #15  <Field File c>
	//    3    5:return          
	}

	public void d()
	{
		if(c == null || !c.exists() || !c.isDirectory())
	//*   0    0:aload_0         
	//*   1    1:getfield        #15  <Field File c>
	//*   2    4:ifnull          27
	//*   3    7:aload_0         
	//*   4    8:getfield        #15  <Field File c>
	//*   5   11:invokevirtual   #24  <Method boolean File.exists()>
	//*   6   14:ifeq            27
	//*   7   17:aload_0         
	//*   8   18:getfield        #15  <Field File c>
	//*   9   21:invokevirtual   #27  <Method boolean File.isDirectory()>
	//*  10   24:ifne            36
		{
			Log.w("LogUtil_LockManager", "clearDir failed: not validate file");
	//   11   27:ldc1            #29  <String "LogUtil_LockManager">
	//   12   29:ldc1            #31  <String "clearDir failed: not validate file">
	//   13   31:invokestatic    #37  <Method int Log.w(String, String)>
	//   14   34:pop             
			return;
	//   15   35:return          
		}
		File afile[] = c.listFiles();
	//   16   36:aload_0         
	//   17   37:getfield        #15  <Field File c>
	//   18   40:invokevirtual   #41  <Method File[] File.listFiles()>
	//   19   43:astore          4
		if(afile == null || afile.length == 0)
	//*  20   45:aload           4
	//*  21   47:ifnull          56
	//*  22   50:aload           4
	//*  23   52:arraylength     
	//*  24   53:ifne            65
		{
			Log.i("LogUtil_LockManager", "clearDir success,no subfiles");
	//   25   56:ldc1            #29  <String "LogUtil_LockManager">
	//   26   58:ldc1            #43  <String "clearDir success,no subfiles">
	//   27   60:invokestatic    #46  <Method int Log.i(String, String)>
	//   28   63:pop             
			return;
	//   29   64:return          
		}
		int j = afile.length;
	//   30   65:aload           4
	//   31   67:arraylength     
	//   32   68:istore_2        
		for(int i = 0; i < j; i++)
	//*  33   69:iconst_0        
	//*  34   70:istore_1        
	//*  35   71:iload_1         
	//*  36   72:iload_2         
	//*  37   73:icmpge          149
		{
			File file = afile[i];
	//   38   76:aload           4
	//   39   78:iload_1         
	//   40   79:aaload          
	//   41   80:astore          5
			if(file == null)
	//*  42   82:aload           5
	//*  43   84:ifnonnull       98
			{
				Log.w("LogUtil_LockManager", "clearDir file failed,logFile null,continue");
	//   44   87:ldc1            #29  <String "LogUtil_LockManager">
	//   45   89:ldc1            #48  <String "clearDir file failed,logFile null,continue">
	//   46   91:invokestatic    #37  <Method int Log.w(String, String)>
	//   47   94:pop             
			} else
	//*  48   95:goto            142
			{
				boolean flag = file.delete();
	//   49   98:aload           5
	//   50  100:invokevirtual   #51  <Method boolean File.delete()>
	//   51  103:istore_3        
				Log.i("LogUtil_LockManager", (new StringBuilder()).append("clearDir file:").append(file.getAbsolutePath()).append(" OpResult:").append(flag).toString());
	//   52  104:ldc1            #29  <String "LogUtil_LockManager">
	//   53  106:new             #53  <Class StringBuilder>
	//   54  109:dup             
	//   55  110:invokespecial   #54  <Method void StringBuilder()>
	//   56  113:ldc1            #56  <String "clearDir file:">
	//   57  115:invokevirtual   #60  <Method StringBuilder StringBuilder.append(String)>
	//   58  118:aload           5
	//   59  120:invokevirtual   #64  <Method String File.getAbsolutePath()>
	//   60  123:invokevirtual   #60  <Method StringBuilder StringBuilder.append(String)>
	//   61  126:ldc1            #66  <String " OpResult:">
	//   62  128:invokevirtual   #60  <Method StringBuilder StringBuilder.append(String)>
	//   63  131:iload_3         
	//   64  132:invokevirtual   #69  <Method StringBuilder StringBuilder.append(boolean)>
	//   65  135:invokevirtual   #72  <Method String StringBuilder.toString()>
	//   66  138:invokestatic    #46  <Method int Log.i(String, String)>
	//   67  141:pop             
			}
		}

	//   68  142:iload_1         
	//   69  143:iconst_1        
	//   70  144:iadd            
	//   71  145:istore_1        
	//*  72  146:goto            71
	//   73  149:return          
	}

	private File c;

	dhw$c(File file)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
		c = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #15  <Field File c>
		c = file;
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:putfield        #15  <Field File c>
	//    8   14:return          
	}
}

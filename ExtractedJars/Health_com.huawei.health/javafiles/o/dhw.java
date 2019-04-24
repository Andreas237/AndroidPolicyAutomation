// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package o;

import android.util.Log;
import java.io.File;
import java.io.FileFilter;
import java.util.*;

// Referenced classes of package o:
//			dhu

public class dhw
{
	public static class c
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

		c(File file)
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

	public static class d
	{

		public void b()
		{
			for(Iterator iterator = c.iterator(); iterator.hasNext();)
		//*   0    0:aload_0         
		//*   1    1:getfield        #17  <Field List c>
		//*   2    4:invokeinterface #27  <Method Iterator List.iterator()>
		//*   3    9:astore_1        
		//*   4   10:aload_1         
		//*   5   11:invokeinterface #33  <Method boolean Iterator.hasNext()>
		//*   6   16:ifeq            51
			{
				c c1 = (c)iterator.next();
		//    7   19:aload_1         
		//    8   20:invokeinterface #37  <Method Object Iterator.next()>
		//    9   25:checkcast       #39  <Class dhw$c>
		//   10   28:astore_2        
				if(c1 == null)
		//*  11   29:aload_2         
		//*  12   30:ifnonnull       44
					Log.w("LogUtil_LockManager", "GlobalLock clearDirs lock null,continue");
		//   13   33:ldc1            #41  <String "LogUtil_LockManager">
		//   14   35:ldc1            #43  <String "GlobalLock clearDirs lock null,continue">
		//   15   37:invokestatic    #49  <Method int Log.w(String, String)>
		//   16   40:pop             
				else
		//*  17   41:goto            10
					c1.d();
		//   18   44:aload_2         
		//   19   45:invokevirtual   #51  <Method void dhw$c.d()>
			}

		//*  20   48:goto            10
		//   21   51:return          
		}

		public void d()
		{
			for(Iterator iterator = c.iterator(); iterator.hasNext();)
		//*   0    0:aload_0         
		//*   1    1:getfield        #17  <Field List c>
		//*   2    4:invokeinterface #27  <Method Iterator List.iterator()>
		//*   3    9:astore_1        
		//*   4   10:aload_1         
		//*   5   11:invokeinterface #33  <Method boolean Iterator.hasNext()>
		//*   6   16:ifeq            51
			{
				c c1 = (c)iterator.next();
		//    7   19:aload_1         
		//    8   20:invokeinterface #37  <Method Object Iterator.next()>
		//    9   25:checkcast       #39  <Class dhw$c>
		//   10   28:astore_2        
				if(c1 == null)
		//*  11   29:aload_2         
		//*  12   30:ifnonnull       44
					Log.w("LogUtil_LockManager", "GlobalLock release lock null,continue next");
		//   13   33:ldc1            #41  <String "LogUtil_LockManager">
		//   14   35:ldc1            #53  <String "GlobalLock release lock null,continue next">
		//   15   37:invokestatic    #49  <Method int Log.w(String, String)>
		//   16   40:pop             
				else
		//*  17   41:goto            48
					c1.a();
		//   18   44:aload_2         
		//   19   45:invokevirtual   #56  <Method void dhw$c.a()>
			}

		//*  20   48:goto            10
		//   21   51:return          
		}

		private List c;

		d(List list)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #15  <Method void Object()>
			c = null;
		//    2    4:aload_0         
		//    3    5:aconst_null     
		//    4    6:putfield        #17  <Field List c>
			c = list;
		//    5    9:aload_0         
		//    6   10:aload_1         
		//    7   11:putfield        #17  <Field List c>
		//    8   14:return          
		}
	}


	public dhw()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
	//    2    4:return          
	}

	public static c a(dhu dhu1)
	{
		if(dhu1 == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       14
		{
			Log.w("LogUtil_LockManager", "waitWriteLock logConfig null,return null");
	//    2    4:ldc1            #21  <String "LogUtil_LockManager">
	//    3    6:ldc1            #23  <String "waitWriteLock logConfig null,return null">
	//    4    8:invokestatic    #29  <Method int Log.w(String, String)>
	//    5   11:pop             
			return null;
	//    6   12:aconst_null     
	//    7   13:areturn         
		}
		dhu1 = ((dhu) (dhu1.n()));
	//    8   14:aload_0         
	//    9   15:invokevirtual   #35  <Method File dhu.n()>
	//   10   18:astore_0        
		if(dhu1 == null)
	//*  11   19:aload_0         
	//*  12   20:ifnonnull       33
		{
			Log.w("LogUtil_LockManager", "waitWriteLock file null,return null");
	//   13   23:ldc1            #21  <String "LogUtil_LockManager">
	//   14   25:ldc1            #37  <String "waitWriteLock file null,return null">
	//   15   27:invokestatic    #29  <Method int Log.w(String, String)>
	//   16   30:pop             
			return null;
	//   17   31:aconst_null     
	//   18   32:areturn         
		} else
		{
			return e(((File) (dhu1)));
	//   19   33:aload_0         
	//   20   34:invokestatic    #41  <Method dhw$c e(File)>
	//   21   37:areturn         
		}
	}

	public static d a()
	{
		File file = dhu.h();
	//    0    0:invokestatic    #45  <Method File dhu.h()>
	//    1    3:astore_3        
		if(file == null)
	//*   2    4:aload_3         
	//*   3    5:ifnonnull       18
		{
			Log.w("LogUtil_LockManager", "lockGlobal file null,return null");
	//    4    8:ldc1            #21  <String "LogUtil_LockManager">
	//    5   10:ldc1            #47  <String "lockGlobal file null,return null">
	//    6   12:invokestatic    #29  <Method int Log.w(String, String)>
	//    7   15:pop             
			return null;
	//    8   16:aconst_null     
	//    9   17:areturn         
		}
		ArrayList arraylist = new ArrayList();
	//   10   18:new             #49  <Class ArrayList>
	//   11   21:dup             
	//   12   22:invokespecial   #50  <Method void ArrayList()>
	//   13   25:astore_2        
		File afile[] = file.listFiles(new FileFilter() {

			public boolean accept(File file1)
			{
				if(file1 == null)
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
				if(file1.exists() && file1.isDirectory())
			//*   8   14:aload_1         
			//*   9   15:invokevirtual   #34  <Method boolean File.exists()>
			//*  10   18:ifeq            58
			//*  11   21:aload_1         
			//*  12   22:invokevirtual   #37  <Method boolean File.isDirectory()>
			//*  13   25:ifeq            58
				{
					Log.i("LogUtil_LockManager", (new StringBuilder()).append("accept lock:").append(file1.getAbsolutePath()).toString());
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
					Log.w("LogUtil_LockManager", (new StringBuilder()).append("reject lock:").append(file1.getAbsolutePath()).toString());
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

		}
);
	//   14   26:aload_3         
	//   15   27:new             #6   <Class dhw$5>
	//   16   30:dup             
	//   17   31:invokespecial   #51  <Method void dhw$5()>
	//   18   34:invokevirtual   #57  <Method File[] File.listFiles(FileFilter)>
	//   19   37:astore_3        
		if(afile == null || afile.length == 0)
	//*  20   38:aload_3         
	//*  21   39:ifnull          47
	//*  22   42:aload_3         
	//*  23   43:arraylength     
	//*  24   44:ifne            57
		{
			Log.w("LogUtil_LockManager", "lockGlobal failed,procDirs empty");
	//   25   47:ldc1            #21  <String "LogUtil_LockManager">
	//   26   49:ldc1            #59  <String "lockGlobal failed,procDirs empty">
	//   27   51:invokestatic    #29  <Method int Log.w(String, String)>
	//   28   54:pop             
			return null;
	//   29   55:aconst_null     
	//   30   56:areturn         
		}
		int j = afile.length;
	//   31   57:aload_3         
	//   32   58:arraylength     
	//   33   59:istore_1        
		for(int i = 0; i < j; i++)
	//*  34   60:iconst_0        
	//*  35   61:istore_0        
	//*  36   62:iload_0         
	//*  37   63:iload_1         
	//*  38   64:icmpge          99
		{
			c c1 = e(afile[i]);
	//   39   67:aload_3         
	//   40   68:iload_0         
	//   41   69:aaload          
	//   42   70:invokestatic    #41  <Method dhw$c e(File)>
	//   43   73:astore          4
			if(c1 != null)
	//*  44   75:aload           4
	//*  45   77:ifnonnull       83
	//*  46   80:goto            92
				((List) (arraylist)).add(((Object) (c1)));
	//   47   83:aload_2         
	//   48   84:aload           4
	//   49   86:invokeinterface #65  <Method boolean List.add(Object)>
	//   50   91:pop             
		}

	//   51   92:iload_0         
	//   52   93:iconst_1        
	//   53   94:iadd            
	//   54   95:istore_0        
	//*  55   96:goto            62
		return new d(((List) (arraylist)));
	//   56   99:new             #11  <Class dhw$d>
	//   57  102:dup             
	//   58  103:aload_2         
	//   59  104:invokespecial   #68  <Method void dhw$d(List)>
	//   60  107:areturn         
	}

	public static c b()
	{
		File file = dhu.f().n();
	//    0    0:invokestatic    #74  <Method dhu dhu.f()>
	//    1    3:invokevirtual   #35  <Method File dhu.n()>
	//    2    6:astore_0        
		if(file == null)
	//*   3    7:aload_0         
	//*   4    8:ifnonnull       21
		{
			Log.w("LogUtil_LockManager", "tryWriteLock4LocalProc file null,return null");
	//    5   11:ldc1            #21  <String "LogUtil_LockManager">
	//    6   13:ldc1            #76  <String "tryWriteLock4LocalProc file null,return null">
	//    7   15:invokestatic    #29  <Method int Log.w(String, String)>
	//    8   18:pop             
			return null;
	//    9   19:aconst_null     
	//   10   20:areturn         
		} else
		{
			return b(file);
	//   11   21:aload_0         
	//   12   22:invokestatic    #78  <Method dhw$c b(File)>
	//   13   25:areturn         
		}
	}

	private static c b(File file)
	{
		if(file == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       14
		{
			Log.w("LogUtil_LockManager", "tryFileLock failed,file null");
	//    2    4:ldc1            #21  <String "LogUtil_LockManager">
	//    3    6:ldc1            #80  <String "tryFileLock failed,file null">
	//    4    8:invokestatic    #29  <Method int Log.w(String, String)>
	//    5   11:pop             
			return null;
	//    6   12:aconst_null     
	//    7   13:areturn         
		} else
		{
			return new c(file);
	//    8   14:new             #8   <Class dhw$c>
	//    9   17:dup             
	//   10   18:aload_0         
	//   11   19:invokespecial   #83  <Method void dhw$c(File)>
	//   12   22:areturn         
		}
	}

	public static c c(dhu dhu1)
	{
		if(dhu1 == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       14
		{
			Log.w("LogUtil_LockManager", "tryWriteLock logConfig null,return null");
	//    2    4:ldc1            #21  <String "LogUtil_LockManager">
	//    3    6:ldc1            #85  <String "tryWriteLock logConfig null,return null">
	//    4    8:invokestatic    #29  <Method int Log.w(String, String)>
	//    5   11:pop             
			return null;
	//    6   12:aconst_null     
	//    7   13:areturn         
		}
		dhu1 = ((dhu) (dhu1.n()));
	//    8   14:aload_0         
	//    9   15:invokevirtual   #35  <Method File dhu.n()>
	//   10   18:astore_0        
		if(dhu1 == null)
	//*  11   19:aload_0         
	//*  12   20:ifnonnull       33
		{
			Log.w("LogUtil_LockManager", "tryWriteLock file null,return null");
	//   13   23:ldc1            #21  <String "LogUtil_LockManager">
	//   14   25:ldc1            #87  <String "tryWriteLock file null,return null">
	//   15   27:invokestatic    #29  <Method int Log.w(String, String)>
	//   16   30:pop             
			return null;
	//   17   31:aconst_null     
	//   18   32:areturn         
		} else
		{
			return b(((File) (dhu1)));
	//   19   33:aload_0         
	//   20   34:invokestatic    #78  <Method dhw$c b(File)>
	//   21   37:areturn         
		}
	}

	public static c d()
	{
		return a(dhu.f());
	//    0    0:invokestatic    #74  <Method dhu dhu.f()>
	//    1    3:invokestatic    #89  <Method dhw$c a(dhu)>
	//    2    6:areturn         
	}

	private static c e(File file)
	{
		if(file == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       14
		{
			Log.w("LogUtil_LockManager", "tryFileLock failed,file null");
	//    2    4:ldc1            #21  <String "LogUtil_LockManager">
	//    3    6:ldc1            #80  <String "tryFileLock failed,file null">
	//    4    8:invokestatic    #29  <Method int Log.w(String, String)>
	//    5   11:pop             
			return null;
	//    6   12:aconst_null     
	//    7   13:areturn         
		} else
		{
			return new c(file);
	//    8   14:new             #8   <Class dhw$c>
	//    9   17:dup             
	//   10   18:aload_0         
	//   11   19:invokespecial   #83  <Method void dhw$c(File)>
	//   12   22:areturn         
		}
	}
}

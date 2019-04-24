// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package o;

import android.util.Log;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package o:
//			dhw

public static class dhw$d
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
			dhw$c dhw$c1 = (dhw$c)iterator.next();
	//    7   19:aload_1         
	//    8   20:invokeinterface #37  <Method Object Iterator.next()>
	//    9   25:checkcast       #39  <Class dhw$c>
	//   10   28:astore_2        
			if(dhw$c1 == null)
	//*  11   29:aload_2         
	//*  12   30:ifnonnull       44
				Log.w("LogUtil_LockManager", "GlobalLock clearDirs lock null,continue");
	//   13   33:ldc1            #41  <String "LogUtil_LockManager">
	//   14   35:ldc1            #43  <String "GlobalLock clearDirs lock null,continue">
	//   15   37:invokestatic    #49  <Method int Log.w(String, String)>
	//   16   40:pop             
			else
	//*  17   41:goto            10
				dhw$c1.d();
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
			dhw$c dhw$c1 = (dhw$c)iterator.next();
	//    7   19:aload_1         
	//    8   20:invokeinterface #37  <Method Object Iterator.next()>
	//    9   25:checkcast       #39  <Class dhw$c>
	//   10   28:astore_2        
			if(dhw$c1 == null)
	//*  11   29:aload_2         
	//*  12   30:ifnonnull       44
				Log.w("LogUtil_LockManager", "GlobalLock release lock null,continue next");
	//   13   33:ldc1            #41  <String "LogUtil_LockManager">
	//   14   35:ldc1            #53  <String "GlobalLock release lock null,continue next">
	//   15   37:invokestatic    #49  <Method int Log.w(String, String)>
	//   16   40:pop             
			else
	//*  17   41:goto            48
				dhw$c1.a();
	//   18   44:aload_2         
	//   19   45:invokevirtual   #56  <Method void dhw$c.a()>
		}

	//*  20   48:goto            10
	//   21   51:return          
	}

	private List c;

	dhw$d(List list)
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

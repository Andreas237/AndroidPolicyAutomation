// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appboy.lrucache;

import android.os.AsyncTask;
import bo.app.au;
import com.appboy.support.AppboyLogger;
import java.io.File;

// Referenced classes of package com.appboy.lrucache:
//			AppboyLruImageLoader

class AppboyLruImageLoader$a extends AsyncTask
{

	protected transient Void a(File afile[])
	{
		Object obj = AppboyLruImageLoader.a(a);
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field AppboyLruImageLoader a>
	//    2    4:invokestatic    #26  <Method Object AppboyLruImageLoader.a(AppboyLruImageLoader)>
	//    3    7:astore_2        
		obj;
	//    4    8:aload_2         
		JVM INSTR monitorenter ;
	//    5    9:monitorenter    
		afile = ((File []) (afile[0]));
	//    6   10:aload_1         
	//    7   11:iconst_0        
	//    8   12:aaload          
	//    9   13:astore_1        
		try
		{
			AppboyLogger.d(AppboyLruImageLoader.a(), "Initializing disk cache");
	//   10   14:invokestatic    #29  <Method String AppboyLruImageLoader.a()>
	//   11   17:ldc1            #31  <String "Initializing disk cache">
	//   12   19:invokestatic    #37  <Method int AppboyLogger.d(String, String)>
	//   13   22:pop             
			AppboyLruImageLoader.a(a, new au(((File) (afile)), 1, 1, 0x3200000L));
	//   14   23:aload_0         
	//   15   24:getfield        #13  <Field AppboyLruImageLoader a>
	//   16   27:new             #39  <Class au>
	//   17   30:dup             
	//   18   31:aload_1         
	//   19   32:iconst_1        
	//   20   33:iconst_1        
	//   21   34:ldc2w           #40  <Long 0x3200000L>
	//   22   37:invokespecial   #44  <Method void au(File, int, int, long)>
	//   23   40:invokestatic    #47  <Method au AppboyLruImageLoader.a(AppboyLruImageLoader, au)>
	//   24   43:pop             
			break MISSING_BLOCK_LABEL_58;
	//   25   44:goto            58
		}
		// Misplaced declaration of an exception variable
		catch(File afile[]) { }
	//   26   47:astore_1        
		AppboyLogger.e(AppboyLruImageLoader.a(), "Caught exception creating new disk cache. Unable to create new disk cache", ((Throwable) (afile)));
	//   27   48:invokestatic    #29  <Method String AppboyLruImageLoader.a()>
	//   28   51:ldc1            #49  <String "Caught exception creating new disk cache. Unable to create new disk cache">
	//   29   53:aload_1         
	//   30   54:invokestatic    #53  <Method int AppboyLogger.e(String, String, Throwable)>
	//   31   57:pop             
		AppboyLruImageLoader.a(a, false);
	//   32   58:aload_0         
	//   33   59:getfield        #13  <Field AppboyLruImageLoader a>
	//   34   62:iconst_0        
	//   35   63:invokestatic    #56  <Method boolean AppboyLruImageLoader.a(AppboyLruImageLoader, boolean)>
	//   36   66:pop             
		AppboyLruImageLoader.a(a).notifyAll();
	//   37   67:aload_0         
	//   38   68:getfield        #13  <Field AppboyLruImageLoader a>
	//   39   71:invokestatic    #26  <Method Object AppboyLruImageLoader.a(AppboyLruImageLoader)>
	//   40   74:invokevirtual   #61  <Method void Object.notifyAll()>
		obj;
	//   41   77:aload_2         
		JVM INSTR monitorexit ;
	//   42   78:monitorexit     
		return null;
	//   43   79:aconst_null     
	//   44   80:areturn         
		afile;
	//   45   81:astore_1        
		obj;
	//   46   82:aload_2         
		JVM INSTR monitorexit ;
	//   47   83:monitorexit     
		throw afile;
	//   48   84:aload_1         
	//   49   85:athrow          
	}

	protected Object doInBackground(Object aobj[])
	{
		return ((Object) (a((File[])aobj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #65  <Class File[]>
	//    3    5:invokevirtual   #67  <Method Void a(File[])>
	//    4    8:areturn         
	}

	final AppboyLruImageLoader a;

	private AppboyLruImageLoader$a(AppboyLruImageLoader appboylruimageloader)
	{
		a = appboylruimageloader;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #13  <Field AppboyLruImageLoader a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #16  <Method void AsyncTask()>
	//    5    9:return          
	}

	AppboyLruImageLoader$a(AppboyLruImageLoader appboylruimageloader, AppboyLruImageLoader$1 appboylruimageloader$1)
	{
		this(appboylruimageloader);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #20  <Method void AppboyLruImageLoader$a(AppboyLruImageLoader)>
	//    3    5:return          
	}
}

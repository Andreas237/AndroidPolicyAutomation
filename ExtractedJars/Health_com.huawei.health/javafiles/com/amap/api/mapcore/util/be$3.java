// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amap.api.mapcore.util;

import com.amap.api.maps.AMapException;

// Referenced classes of package com.amap.api.mapcore.util:
//			be, bg, bf, bd, 
//			hm

class be$3
	implements Runnable
{

	public void run()
	{
		bf bf1;
		try
		{
			if(!be.e(b))
				break MISSING_BLOCK_LABEL_68;
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field be b>
	//    2    4:invokestatic    #34  <Method boolean be.e(be)>
	//    3    7:ifeq            68
			be.b(b);
	//    4   10:aload_0         
	//    5   11:getfield        #19  <Field be b>
	//    6   14:invokestatic    #37  <Method void be.b(be)>
			bf1 = (bf)(new bg(be.c(b), be.d)).c();
	//    7   17:new             #39  <Class bg>
	//    8   20:dup             
	//    9   21:aload_0         
	//   10   22:getfield        #19  <Field be b>
	//   11   25:invokestatic    #43  <Method android.content.Context be.c(be)>
	//   12   28:getstatic       #47  <Field String be.d>
	//   13   31:invokespecial   #50  <Method void bg(android.content.Context, String)>
	//   14   34:invokevirtual   #53  <Method Object bg.c()>
	//   15   37:checkcast       #55  <Class bf>
	//   16   40:astore_1        
		}
	//*  17   41:aload_1         
	//*  18   42:ifnull          68
	//*  19   45:aload_0         
	//*  20   46:getfield        #19  <Field be b>
	//*  21   49:iconst_0        
	//*  22   50:invokestatic    #58  <Method boolean be.a(be, boolean)>
	//*  23   53:pop             
	//*  24   54:aload_1         
	//*  25   55:invokevirtual   #61  <Method boolean bf.a()>
	//*  26   58:ifeq            68
	//*  27   61:aload_0         
	//*  28   62:getfield        #19  <Field be b>
	//*  29   65:invokevirtual   #63  <Method void be.b()>
	//*  30   68:aload_0         
	//*  31   69:getfield        #21  <Field bd a>
	//*  32   72:getstatic       #47  <Field String be.d>
	//*  33   75:invokevirtual   #69  <Method void bd.setVersion(String)>
	//*  34   78:aload_0         
	//*  35   79:getfield        #21  <Field bd a>
	//*  36   82:invokevirtual   #71  <Method void bd.f()>
	//*  37   85:return          
		catch(AMapException amapexception)
	//*  38   86:astore_1        
		{
			amapexception.printStackTrace();
	//   39   87:aload_1         
	//   40   88:invokevirtual   #74  <Method void AMapException.printStackTrace()>
			return;
	//   41   91:return          
		}
		catch(Throwable throwable)
	//*  42   92:astore_1        
		{
			hm.c(throwable, "OfflineDownloadManager", "startDownloadRunnable");
	//   43   93:aload_1         
	//   44   94:ldc1            #76  <String "OfflineDownloadManager">
	//   45   96:ldc1            #78  <String "startDownloadRunnable">
	//   46   98:invokestatic    #83  <Method void hm.c(Throwable, String, String)>
			return;
	//   47  101:return          
		}
		if(bf1 == null)
			break MISSING_BLOCK_LABEL_68;
		be.a(b, false);
		if(bf1.a())
			b.b();
		a.setVersion(be.d);
		a.f();
		return;
	}

	final bd a;
	final be b;

	be$3(be be1, bd bd1)
	{
		b = be1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field be b>
		a = bd1;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #21  <Field bd a>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #24  <Method void Object()>
	//    8   14:return          
	}
}

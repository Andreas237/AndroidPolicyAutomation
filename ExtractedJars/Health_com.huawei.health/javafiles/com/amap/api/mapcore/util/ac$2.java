// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amap.api.mapcore.util;

import android.opengl.GLES20;

// Referenced classes of package com.amap.api.mapcore.util:
//			ac

class ac$2
	implements Runnable
{

	public void run()
	{
		ac.a(a, 0);
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field ac a>
	//    2    4:iconst_0        
	//    3    5:invokestatic    #25  <Method int ac.a(ac, int)>
	//    4    8:pop             
		for(; !ac.b(a) && ac.c(a) < 5; ac.h(a))
	//*   5    9:aload_0         
	//*   6   10:getfield        #16  <Field ac a>
	//*   7   13:invokestatic    #29  <Method boolean ac.b(ac)>
	//*   8   16:ifne            114
	//*   9   19:aload_0         
	//*  10   20:getfield        #16  <Field ac a>
	//*  11   23:invokestatic    #33  <Method int ac.c(ac)>
	//*  12   26:iconst_5        
	//*  13   27:icmpge          114
		{
			try
			{
				Thread.sleep(16L);
	//   14   30:ldc2w           #34  <Long 16L>
	//   15   33:invokestatic    #41  <Method void Thread.sleep(long)>
			}
	//*  16   36:goto            44
			catch(InterruptedException interruptedexception)
	//*  17   39:astore_1        
			{
				interruptedexception.printStackTrace();
	//   18   40:aload_1         
	//   19   41:invokevirtual   #44  <Method void InterruptedException.printStackTrace()>
			}
			if(!ac.d(a))
	//*  20   44:aload_0         
	//*  21   45:getfield        #16  <Field ac a>
	//*  22   48:invokestatic    #47  <Method boolean ac.d(ac)>
	//*  23   51:ifne            79
			{
				if(ac.e(a) != null)
	//*  24   54:aload_0         
	//*  25   55:getfield        #16  <Field ac a>
	//*  26   58:invokestatic    #51  <Method com.amap.api.maps.model.CrossOverlay$GenerateCrossImageListener ac.e(ac)>
	//*  27   61:ifnull          78
					ac.e(a).onGenerateComplete(((android.graphics.Bitmap) (null)), -1);
	//   28   64:aload_0         
	//   29   65:getfield        #16  <Field ac a>
	//   30   68:invokestatic    #51  <Method com.amap.api.maps.model.CrossOverlay$GenerateCrossImageListener ac.e(ac)>
	//   31   71:aconst_null     
	//   32   72:iconst_m1       
	//   33   73:invokeinterface #57  <Method void com.amap.api.maps.model.CrossOverlay$GenerateCrossImageListener.onGenerateComplete(android.graphics.Bitmap, int)>
				return;
	//   34   78:return          
			}
			GLES20.glViewport(0, 0, ac.f(a), ac.g(a));
	//   35   79:iconst_0        
	//   36   80:iconst_0        
	//   37   81:aload_0         
	//   38   82:getfield        #16  <Field ac a>
	//   39   85:invokestatic    #60  <Method int ac.f(ac)>
	//   40   88:aload_0         
	//   41   89:getfield        #16  <Field ac a>
	//   42   92:invokestatic    #63  <Method int ac.g(ac)>
	//   43   95:invokestatic    #69  <Method void GLES20.glViewport(int, int, int, int)>
			GLES20.glClear(16640);
	//   44   98:sipush          16640
	//   45  101:invokestatic    #73  <Method void GLES20.glClear(int)>
		}

	//   46  104:aload_0         
	//   47  105:getfield        #16  <Field ac a>
	//   48  108:invokestatic    #76  <Method void ac.h(ac)>
	//*  49  111:goto            9
	//   50  114:return          
	}

	final ac a;

	ac$2(ac ac1)
	{
		a = ac1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #16  <Field ac a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #18  <Method void Object()>
	//    5    9:return          
	}
}

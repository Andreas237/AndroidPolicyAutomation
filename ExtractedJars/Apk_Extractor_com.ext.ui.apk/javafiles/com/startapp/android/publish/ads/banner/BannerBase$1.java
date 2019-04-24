// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.startapp.android.publish.ads.banner;

import android.os.Handler;
import com.startapp.android.publish.adsCommon.i;
import com.startapp.common.a.g;

// Referenced classes of package com.startapp.android.publish.ads.banner:
//			BannerBase

class BannerBase$1
	implements Runnable
{

	public void run()
	{
		boolean flag;
		try
		{
			if(!b.shouldSendImpression(a))
				break MISSING_BLOCK_LABEL_125;
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field BannerBase b>
	//    2    4:aload_0         
	//    3    5:getfield        #23  <Field i a>
	//    4    8:invokevirtual   #36  <Method boolean BannerBase.shouldSendImpression(i)>
	//    5   11:ifeq            125
			flag = b.isVisible();
	//    6   14:aload_0         
	//    7   15:getfield        #21  <Field BannerBase b>
	//    8   18:invokevirtual   #40  <Method boolean BannerBase.isVisible()>
	//    9   21:istore_1        
		}
	//*  10   22:iload_1         
	//*  11   23:ifeq            61
	//*  12   26:aload_0         
	//*  13   27:getfield        #28  <Field boolean c>
	//*  14   30:ifeq            61
	//*  15   33:aload_0         
	//*  16   34:iconst_0        
	//*  17   35:putfield        #28  <Field boolean c>
	//*  18   38:aload_0         
	//*  19   39:getfield        #23  <Field i a>
	//*  20   42:invokevirtual   #44  <Method void i.a()>
	//*  21   45:aload_0         
	//*  22   46:getfield        #21  <Field BannerBase b>
	//*  23   49:invokestatic    #48  <Method Handler BannerBase.access$000(BannerBase)>
	//*  24   52:aload_0         
	//*  25   53:ldc2w           #49  <Long 100L>
	//*  26   56:invokevirtual   #56  <Method boolean Handler.postDelayed(Runnable, long)>
	//*  27   59:pop             
	//*  28   60:return          
	//*  29   61:iload_1         
	//*  30   62:ifne            45
	//*  31   65:aload_0         
	//*  32   66:getfield        #28  <Field boolean c>
	//*  33   69:ifne            45
	//*  34   72:aload_0         
	//*  35   73:iconst_1        
	//*  36   74:putfield        #28  <Field boolean c>
	//*  37   77:aload_0         
	//*  38   78:getfield        #23  <Field i a>
	//*  39   81:invokevirtual   #58  <Method void i.b()>
	//*  40   84:goto            45
		catch(Exception exception)
	//*  41   87:astore_2        
		{
			g.a("BannerLayout", 6, (new StringBuilder()).append("BannerBase.startVisibilityRunnable.run - runnable error ").append(exception.getMessage()).toString());
	//   42   88:ldc1            #60  <String "BannerLayout">
	//   43   90:bipush          6
	//   44   92:new             #62  <Class StringBuilder>
	//   45   95:dup             
	//   46   96:invokespecial   #63  <Method void StringBuilder()>
	//   47   99:ldc1            #65  <String "BannerBase.startVisibilityRunnable.run - runnable error ">
	//   48  101:invokevirtual   #69  <Method StringBuilder StringBuilder.append(String)>
	//   49  104:aload_2         
	//   50  105:invokevirtual   #73  <Method String Exception.getMessage()>
	//   51  108:invokevirtual   #69  <Method StringBuilder StringBuilder.append(String)>
	//   52  111:invokevirtual   #76  <Method String StringBuilder.toString()>
	//   53  114:invokestatic    #81  <Method void g.a(String, int, String)>
			BannerBase.access$100(b);
	//   54  117:aload_0         
	//   55  118:getfield        #21  <Field BannerBase b>
	//   56  121:invokestatic    #85  <Method void BannerBase.access$100(BannerBase)>
			return;
	//   57  124:return          
		}
		if(!flag) goto _L2; else goto _L1
_L1:
		if(!c) goto _L2; else goto _L3
_L3:
		c = false;
		a.a();
_L5:
		BannerBase.access$000(b).postDelayed(((Runnable) (this)), 100L);
		return;
_L2:
		if(flag) goto _L5; else goto _L4
_L4:
		if(c) goto _L5; else goto _L6
_L6:
		c = true;
		a.b();
		  goto _L5
		BannerBase.access$100(b);
	//   58  125:aload_0         
	//   59  126:getfield        #21  <Field BannerBase b>
	//   60  129:invokestatic    #85  <Method void BannerBase.access$100(BannerBase)>
		return;
	//   61  132:return          
	}

	final i a;
	final BannerBase b;
	private boolean c;

	BannerBase$1(BannerBase bannerbase, i j)
	{
		b = bannerbase;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #21  <Field BannerBase b>
		a = j;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #23  <Field i a>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #26  <Method void Object()>
		c = true;
	//    8   14:aload_0         
	//    9   15:iconst_1        
	//   10   16:putfield        #28  <Field boolean c>
	//   11   19:return          
	}
}

// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appboy;

import bo.app.*;
import com.appboy.support.AppboyLogger;

// Referenced classes of package com.appboy:
//			Appboy, IAppboyImageLoader

class Appboy$27
	implements Runnable
{

	public void run()
	{
		b.g.a(a);
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field Appboy b>
	//    2    4:getfield        #29  <Field bo Appboy.g>
	//    3    7:aload_0         
	//    4    8:getfield        #20  <Field boolean a>
	//    5   11:invokevirtual   #33  <Method void bo.a(boolean)>
		b.b.b().a(a);
	//    6   14:aload_0         
	//    7   15:getfield        #18  <Field Appboy b>
	//    8   18:getfield        #36  <Field eq Appboy.b>
	//    9   21:invokevirtual   #41  <Method q eq.b()>
	//   10   24:aload_0         
	//   11   25:getfield        #20  <Field boolean a>
	//   12   28:invokevirtual   #44  <Method void q.a(boolean)>
		if(Appboy.h(b) != null)
	//*  13   31:aload_0         
	//*  14   32:getfield        #18  <Field Appboy b>
	//*  15   35:invokestatic    #48  <Method IAppboyImageLoader Appboy.h(Appboy)>
	//*  16   38:ifnull          94
		{
			String s = Appboy.b();
	//   17   41:invokestatic    #51  <Method String Appboy.b()>
	//   18   44:astore_1        
			StringBuilder stringbuilder = new StringBuilder();
	//   19   45:new             #53  <Class StringBuilder>
	//   20   48:dup             
	//   21   49:invokespecial   #54  <Method void StringBuilder()>
	//   22   52:astore_2        
			stringbuilder.append("Setting the image loader deny network downloads to ");
	//   23   53:aload_2         
	//   24   54:ldc1            #56  <String "Setting the image loader deny network downloads to ">
	//   25   56:invokevirtual   #60  <Method StringBuilder StringBuilder.append(String)>
	//   26   59:pop             
			stringbuilder.append(a);
	//   27   60:aload_2         
	//   28   61:aload_0         
	//   29   62:getfield        #20  <Field boolean a>
	//   30   65:invokevirtual   #63  <Method StringBuilder StringBuilder.append(boolean)>
	//   31   68:pop             
			AppboyLogger.d(s, stringbuilder.toString());
	//   32   69:aload_1         
	//   33   70:aload_2         
	//   34   71:invokevirtual   #66  <Method String StringBuilder.toString()>
	//   35   74:invokestatic    #72  <Method int AppboyLogger.d(String, String)>
	//   36   77:pop             
			Appboy.h(b).setOffline(a);
	//   37   78:aload_0         
	//   38   79:getfield        #18  <Field Appboy b>
	//   39   82:invokestatic    #48  <Method IAppboyImageLoader Appboy.h(Appboy)>
	//   40   85:aload_0         
	//   41   86:getfield        #20  <Field boolean a>
	//   42   89:invokeinterface #77  <Method void IAppboyImageLoader.setOffline(boolean)>
		}
	//   43   94:return          
	}

	final boolean a;
	final Appboy b;

	Appboy$27(Appboy appboy, boolean flag)
	{
		b = appboy;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #18  <Field Appboy b>
		a = flag;
	//    3    5:aload_0         
	//    4    6:iload_2         
	//    5    7:putfield        #20  <Field boolean a>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #23  <Method void Object()>
	//    8   14:return          
	}
}

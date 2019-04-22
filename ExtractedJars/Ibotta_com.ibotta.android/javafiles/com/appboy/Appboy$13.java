// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appboy;

import bo.app.*;
import com.appboy.events.ContentCardsUpdatedEvent;
import com.appboy.support.AppboyLogger;

// Referenced classes of package com.appboy:
//			Appboy

class Appboy$13
	implements Runnable
{

	public void run()
	{
		try
		{
			if(a)
	//*   0    0:aload_0         
	//*   1    1:getfield        #21  <Field boolean a>
	//*   2    4:ifeq            30
			{
				Appboy.c(b).a(((Object) (b.h.a())), com/appboy/events/ContentCardsUpdatedEvent);
	//    3    7:aload_0         
	//    4    8:getfield        #19  <Field Appboy b>
	//    5   11:invokestatic    #32  <Method ac Appboy.c(Appboy)>
	//    6   14:aload_0         
	//    7   15:getfield        #19  <Field Appboy b>
	//    8   18:getfield        #36  <Field dn Appboy.h>
	//    9   21:invokevirtual   #41  <Method ContentCardsUpdatedEvent dn.a()>
	//   10   24:ldc1            #43  <Class ContentCardsUpdatedEvent>
	//   11   26:invokevirtual   #48  <Method void ac.a(Object, Class)>
				return;
	//   12   29:return          
			}
		}
	//*  13   30:aload_0         
	//*  14   31:getfield        #19  <Field Appboy b>
	//*  15   34:getfield        #52  <Field bo Appboy.g>
	//*  16   37:aload_0         
	//*  17   38:getfield        #19  <Field Appboy b>
	//*  18   41:getfield        #36  <Field dn Appboy.h>
	//*  19   44:invokevirtual   #55  <Method long dn.b()>
	//*  20   47:aload_0         
	//*  21   48:getfield        #19  <Field Appboy b>
	//*  22   51:getfield        #36  <Field dn Appboy.h>
	//*  23   54:invokevirtual   #57  <Method long dn.c()>
	//*  24   57:invokevirtual   #62  <Method void bo.a(long, long)>
	//*  25   60:return          
		catch(Exception exception)
	//*  26   61:astore_1        
		{
			String s = Appboy.b();
	//   27   62:invokestatic    #65  <Method String Appboy.b()>
	//   28   65:astore_2        
			StringBuilder stringbuilder = new StringBuilder();
	//   29   66:new             #67  <Class StringBuilder>
	//   30   69:dup             
	//   31   70:invokespecial   #68  <Method void StringBuilder()>
	//   32   73:astore_3        
			stringbuilder.append("Failed to request Content Cards refresh. Requesting from cache: ");
	//   33   74:aload_3         
	//   34   75:ldc1            #70  <String "Failed to request Content Cards refresh. Requesting from cache: ">
	//   35   77:invokevirtual   #74  <Method StringBuilder StringBuilder.append(String)>
	//   36   80:pop             
			stringbuilder.append(a);
	//   37   81:aload_3         
	//   38   82:aload_0         
	//   39   83:getfield        #21  <Field boolean a>
	//   40   86:invokevirtual   #77  <Method StringBuilder StringBuilder.append(boolean)>
	//   41   89:pop             
			AppboyLogger.w(s, stringbuilder.toString(), ((Throwable) (exception)));
	//   42   90:aload_2         
	//   43   91:aload_3         
	//   44   92:invokevirtual   #80  <Method String StringBuilder.toString()>
	//   45   95:aload_1         
	//   46   96:invokestatic    #86  <Method int AppboyLogger.w(String, String, Throwable)>
	//   47   99:pop             
			Appboy.a(b, ((Throwable) (exception)));
	//   48  100:aload_0         
	//   49  101:getfield        #19  <Field Appboy b>
	//   50  104:aload_1         
	//   51  105:invokestatic    #89  <Method void Appboy.a(Appboy, Throwable)>
			return;
	//   52  108:return          
		}
		b.g.a(b.h.b(), b.h.c());
		return;
	}

	final boolean a;
	final Appboy b;

	Appboy$13(Appboy appboy, boolean flag)
	{
		b = appboy;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field Appboy b>
		a = flag;
	//    3    5:aload_0         
	//    4    6:iload_2         
	//    5    7:putfield        #21  <Field boolean a>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #24  <Method void Object()>
	//    8   14:return          
	}
}

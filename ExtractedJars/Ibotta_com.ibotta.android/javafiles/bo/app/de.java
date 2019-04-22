// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package bo.app;

import com.appboy.support.AppboyLogger;

// Referenced classes of package bo.app:
//			dd, dc, af, db, 
//			ad

public class de
	implements dd
{

	public de(ad ad1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #25  <Method void Object()>
		b = ad1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #27  <Field ad b>
	//    5    9:return          
	}

	private void c(dc dc1)
	{
		AppboyLogger.i(a, "Short circuiting execution of network request and immediately marking it as succeeded.", false);
	//    0    0:getstatic       #20  <Field String a>
	//    1    3:ldc1            #31  <String "Short circuiting execution of network request and immediately marking it as succeeded.">
	//    2    5:iconst_0        
	//    3    6:invokestatic    #35  <Method int AppboyLogger.i(String, String, boolean)>
	//    4    9:pop             
		dc1.a(b, ((cp) (null)));
	//    5   10:aload_1         
	//    6   11:aload_0         
	//    7   12:getfield        #27  <Field ad b>
	//    8   15:aconst_null     
	//    9   16:invokeinterface #40  <Method void dc.a(ad, cp)>
		dc1.a(b);
	//   10   21:aload_1         
	//   11   22:aload_0         
	//   12   23:getfield        #27  <Field ad b>
	//   13   26:invokeinterface #42  <Method void dc.a(ad)>
		b.a(((Object) (new af((db)dc1))), bo/app/af);
	//   14   31:aload_0         
	//   15   32:getfield        #27  <Field ad b>
	//   16   35:new             #44  <Class af>
	//   17   38:dup             
	//   18   39:aload_1         
	//   19   40:checkcast       #46  <Class db>
	//   20   43:invokespecial   #49  <Method void af(db)>
	//   21   46:ldc1            #44  <Class af>
	//   22   48:invokeinterface #54  <Method void ad.a(Object, Class)>
	//   23   53:return          
	}

	public void a(dc dc1)
	{
		c(dc1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #56  <Method void c(dc)>
	//    3    5:return          
	}

	public void b(dc dc1)
	{
		c(dc1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #56  <Method void c(dc)>
	//    3    5:return          
	}

	private static final String a = AppboyLogger.getAppboyLogTag(bo/app/de);
	private final ad b;

	static 
	{
	//    0    0:ldc1            #2   <Class de>
	//    1    2:invokestatic    #18  <Method String AppboyLogger.getAppboyLogTag(Class)>
	//    2    5:putstatic       #20  <Field String a>
	//*   3    8:return          
	}
}

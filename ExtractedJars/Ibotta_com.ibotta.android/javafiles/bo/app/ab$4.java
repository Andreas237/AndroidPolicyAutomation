// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package bo.app;

import com.appboy.events.IEventSubscriber;
import com.appboy.events.InAppMessageEvent;
import com.appboy.support.AppboyLogger;

// Referenced classes of package bo.app:
//			ab, ak, gd, ad, 
//			eb, gb, er

class ab$4
	implements IEventSubscriber
{

	public void a(ak ak1)
	{
		er er1 = ak1.a();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #28  <Method er ak.a()>
	//    2    4:astore_3        
		gd gd1 = ab.m(a);
	//    3    5:aload_0         
	//    4    6:getfield        #18  <Field ab a>
	//    5    9:invokestatic    #31  <Method gd ab.m(ab)>
	//    6   12:astore_2        
		gd1;
	//    7   13:aload_2         
		JVM INSTR monitorenter ;
	//    8   14:monitorenter    
		if(ab.m(a).a(er1))
	//*   9   15:aload_0         
	//*  10   16:getfield        #18  <Field ab a>
	//*  11   19:invokestatic    #31  <Method gd ab.m(ab)>
	//*  12   22:aload_3         
	//*  13   23:invokeinterface #36  <Method boolean gd.a(er)>
	//*  14   28:ifeq            94
		{
			ab.n(a).a(((Object) (new InAppMessageEvent(ak1.b(), ak1.c()))), com/appboy/events/InAppMessageEvent);
	//   15   31:aload_0         
	//   16   32:getfield        #18  <Field ab a>
	//   17   35:invokestatic    #40  <Method ad ab.n(ab)>
	//   18   38:new             #42  <Class InAppMessageEvent>
	//   19   41:dup             
	//   20   42:aload_1         
	//   21   43:invokevirtual   #46  <Method com.appboy.models.IInAppMessage ak.b()>
	//   22   46:aload_1         
	//   23   47:invokevirtual   #50  <Method String ak.c()>
	//   24   50:invokespecial   #53  <Method void InAppMessageEvent(com.appboy.models.IInAppMessage, String)>
	//   25   53:ldc1            #42  <Class InAppMessageEvent>
	//   26   55:invokeinterface #58  <Method void ad.a(Object, Class)>
			ab.m(a).a(er1, eb.a());
	//   27   60:aload_0         
	//   28   61:getfield        #18  <Field ab a>
	//   29   64:invokestatic    #31  <Method gd ab.m(ab)>
	//   30   67:aload_3         
	//   31   68:invokestatic    #63  <Method long eb.a()>
	//   32   71:invokeinterface #66  <Method void gd.a(er, long)>
			ab.l(a).a(eb.a());
	//   33   76:aload_0         
	//   34   77:getfield        #18  <Field ab a>
	//   35   80:invokestatic    #70  <Method gb ab.l(ab)>
	//   36   83:invokestatic    #63  <Method long eb.a()>
	//   37   86:invokeinterface #75  <Method void gb.a(long)>
			break MISSING_BLOCK_LABEL_137;
	//   38   91:goto            137
		}
		ak1 = ((ak) (ab.q()));
	//   39   94:invokestatic    #78  <Method String ab.q()>
	//   40   97:astore_1        
		StringBuilder stringbuilder = new StringBuilder();
	//   41   98:new             #80  <Class StringBuilder>
	//   42  101:dup             
	//   43  102:invokespecial   #81  <Method void StringBuilder()>
	//   44  105:astore          4
		stringbuilder.append("Could not publish in-app message with trigger action id: ");
	//   45  107:aload           4
	//   46  109:ldc1            #83  <String "Could not publish in-app message with trigger action id: ">
	//   47  111:invokevirtual   #87  <Method StringBuilder StringBuilder.append(String)>
	//   48  114:pop             
		stringbuilder.append(er1.b());
	//   49  115:aload           4
	//   50  117:aload_3         
	//   51  118:invokeinterface #91  <Method String er.b()>
	//   52  123:invokevirtual   #87  <Method StringBuilder StringBuilder.append(String)>
	//   53  126:pop             
		AppboyLogger.d(((String) (ak1)), stringbuilder.toString());
	//   54  127:aload_1         
	//   55  128:aload           4
	//   56  130:invokevirtual   #94  <Method String StringBuilder.toString()>
	//   57  133:invokestatic    #100 <Method int AppboyLogger.d(String, String)>
	//   58  136:pop             
		gd1;
	//   59  137:aload_2         
		JVM INSTR monitorexit ;
	//   60  138:monitorexit     
		return;
	//   61  139:return          
		ak1;
	//   62  140:astore_1        
		gd1;
	//   63  141:aload_2         
		JVM INSTR monitorexit ;
	//   64  142:monitorexit     
		throw ak1;
	//   65  143:aload_1         
	//   66  144:athrow          
	}

	public void trigger(Object obj)
	{
		a((ak)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #25  <Class ak>
	//    3    5:invokevirtual   #104 <Method void a(ak)>
	//    4    8:return          
	}

	final ab a;

	ab$4(ab ab1)
	{
		a = ab1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #18  <Field ab a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #21  <Method void Object()>
	//    5    9:return          
	}
}

// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package bo.app;

import com.appboy.support.AppboyLogger;

// Referenced classes of package bo.app:
//			k, o

class k$a
	implements Runnable
{

	public void run()
	{
		while(k.a(a)) 
	//*   0    0:aload_0         
	//*   1    1:getfield        #14  <Field k a>
	//*   2    4:invokestatic    #27  <Method boolean k.a(k)>
	//*   3    7:ifeq            80
			try
			{
				co co = k.b(a).b();
	//    4   10:aload_0         
	//    5   11:getfield        #14  <Field k a>
	//    6   14:invokestatic    #31  <Method o k.b(k)>
	//    7   17:invokevirtual   #36  <Method co o.b()>
	//    8   20:astore_1        
				k.a(a, co);
	//    9   21:aload_0         
	//   10   22:getfield        #14  <Field k a>
	//   11   25:aload_1         
	//   12   26:invokestatic    #39  <Method void k.a(k, co)>
			}
	//*  13   29:goto            0
			catch(InterruptedException interruptedexception)
	//*  14   32:astore_1        
			{
				String s = k.b();
	//   15   33:invokestatic    #42  <Method String k.b()>
	//   16   36:astore_2        
				StringBuilder stringbuilder = new StringBuilder();
	//   17   37:new             #44  <Class StringBuilder>
	//   18   40:dup             
	//   19   41:invokespecial   #45  <Method void StringBuilder()>
	//   20   44:astore_3        
				stringbuilder.append("Automatic thread interrupted! [");
	//   21   45:aload_3         
	//   22   46:ldc1            #47  <String "Automatic thread interrupted! [">
	//   23   48:invokevirtual   #51  <Method StringBuilder StringBuilder.append(String)>
	//   24   51:pop             
				stringbuilder.append(interruptedexception.getMessage());
	//   25   52:aload_3         
	//   26   53:aload_1         
	//   27   54:invokevirtual   #54  <Method String InterruptedException.getMessage()>
	//   28   57:invokevirtual   #51  <Method StringBuilder StringBuilder.append(String)>
	//   29   60:pop             
				stringbuilder.append("]");
	//   30   61:aload_3         
	//   31   62:ldc1            #56  <String "]">
	//   32   64:invokevirtual   #51  <Method StringBuilder StringBuilder.append(String)>
	//   33   67:pop             
				AppboyLogger.d(s, stringbuilder.toString());
	//   34   68:aload_2         
	//   35   69:aload_3         
	//   36   70:invokevirtual   #59  <Method String StringBuilder.toString()>
	//   37   73:invokestatic    #65  <Method int AppboyLogger.d(String, String)>
	//   38   76:pop             
			}
	//*  39   77:goto            0
	//   40   80:return          
	}

	final k a;

	private k$a(k k1)
	{
		a = k1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #14  <Field k a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #17  <Method void Object()>
	//    5    9:return          
	}

	k$a(k k1, k$1 k$1)
	{
		this(k1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #21  <Method void k$a(k)>
	//    3    5:return          
	}
}

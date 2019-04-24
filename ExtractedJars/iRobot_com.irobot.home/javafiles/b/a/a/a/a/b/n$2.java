// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package b.a.a.a.a.b;

import b.a.a.a.c;
import b.a.a.a.l;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

// Referenced classes of package b.a.a.a.a.b:
//			h, n

static final class n$2 extends h
{

	public void onRun()
	{
		InterruptedException interruptedexception;
		try
		{
			l l1 = b.a.a.a.c.g();
	//    0    0:invokestatic    #38  <Method l c.g()>
	//    1    3:astore_1        
			StringBuilder stringbuilder = new StringBuilder();
	//    2    4:new             #40  <Class StringBuilder>
	//    3    7:dup             
	//    4    8:invokespecial   #41  <Method void StringBuilder()>
	//    5   11:astore_2        
			stringbuilder.append("Executing shutdown hook for ");
	//    6   12:aload_2         
	//    7   13:ldc1            #43  <String "Executing shutdown hook for ">
	//    8   15:invokevirtual   #47  <Method StringBuilder StringBuilder.append(String)>
	//    9   18:pop             
			stringbuilder.append(a);
	//   10   19:aload_2         
	//   11   20:aload_0         
	//   12   21:getfield        #19  <Field String a>
	//   13   24:invokevirtual   #47  <Method StringBuilder StringBuilder.append(String)>
	//   14   27:pop             
			l1.a("Fabric", stringbuilder.toString());
	//   15   28:aload_1         
	//   16   29:ldc1            #49  <String "Fabric">
	//   17   31:aload_2         
	//   18   32:invokevirtual   #53  <Method String StringBuilder.toString()>
	//   19   35:invokeinterface #58  <Method void l.a(String, String)>
			b.shutdown();
	//   20   40:aload_0         
	//   21   41:getfield        #21  <Field ExecutorService b>
	//   22   44:invokeinterface #63  <Method void ExecutorService.shutdown()>
			if(!b.awaitTermination(c, d))
	//*  23   49:aload_0         
	//*  24   50:getfield        #21  <Field ExecutorService b>
	//*  25   53:aload_0         
	//*  26   54:getfield        #23  <Field long c>
	//*  27   57:aload_0         
	//*  28   58:getfield        #25  <Field TimeUnit d>
	//*  29   61:invokeinterface #67  <Method boolean ExecutorService.awaitTermination(long, TimeUnit)>
	//*  30   66:ifne            159
			{
				l l2 = b.a.a.a.c.g();
	//   31   69:invokestatic    #38  <Method l c.g()>
	//   32   72:astore_1        
				StringBuilder stringbuilder1 = new StringBuilder();
	//   33   73:new             #40  <Class StringBuilder>
	//   34   76:dup             
	//   35   77:invokespecial   #41  <Method void StringBuilder()>
	//   36   80:astore_2        
				stringbuilder1.append(a);
	//   37   81:aload_2         
	//   38   82:aload_0         
	//   39   83:getfield        #19  <Field String a>
	//   40   86:invokevirtual   #47  <Method StringBuilder StringBuilder.append(String)>
	//   41   89:pop             
				stringbuilder1.append(" did not shut down in the allocated time. Requesting immediate shutdown.");
	//   42   90:aload_2         
	//   43   91:ldc1            #69  <String " did not shut down in the allocated time. Requesting immediate shutdown.">
	//   44   93:invokevirtual   #47  <Method StringBuilder StringBuilder.append(String)>
	//   45   96:pop             
				l2.a("Fabric", stringbuilder1.toString());
	//   46   97:aload_1         
	//   47   98:ldc1            #49  <String "Fabric">
	//   48  100:aload_2         
	//   49  101:invokevirtual   #53  <Method String StringBuilder.toString()>
	//   50  104:invokeinterface #58  <Method void l.a(String, String)>
				b.shutdownNow();
	//   51  109:aload_0         
	//   52  110:getfield        #21  <Field ExecutorService b>
	//   53  113:invokeinterface #73  <Method java.util.List ExecutorService.shutdownNow()>
	//   54  118:pop             
				return;
	//   55  119:return          
			}
		}
	//*  56  120:invokestatic    #38  <Method l c.g()>
	//*  57  123:ldc1            #49  <String "Fabric">
	//*  58  125:getstatic       #79  <Field Locale Locale.US>
	//*  59  128:ldc1            #81  <String "Interrupted while waiting for %s to shut down. Requesting immediate shutdown.">
	//*  60  130:iconst_1        
	//*  61  131:anewarray       Object[]
	//*  62  134:dup             
	//*  63  135:iconst_0        
	//*  64  136:aload_0         
	//*  65  137:getfield        #19  <Field String a>
	//*  66  140:aastore         
	//*  67  141:invokestatic    #89  <Method String String.format(Locale, String, Object[])>
	//*  68  144:invokeinterface #58  <Method void l.a(String, String)>
	//*  69  149:aload_0         
	//*  70  150:getfield        #21  <Field ExecutorService b>
	//*  71  153:invokeinterface #73  <Method java.util.List ExecutorService.shutdownNow()>
	//*  72  158:pop             
	//*  73  159:return          
		// Misplaced declaration of an exception variable
		catch(InterruptedException interruptedexception)
		{
			b.a.a.a.c.g().a("Fabric", String.format(Locale.US, "Interrupted while waiting for %s to shut down. Requesting immediate shutdown.", new Object[] {
				a
			}));
			b.shutdownNow();
		}
	//*  74  160:astore_1        
	//*  75  161:goto            120
	}

	final String a;
	final ExecutorService b;
	final long c;
	final TimeUnit d;

	n$2(String s, ExecutorService executorservice, long l1, TimeUnit timeunit)
	{
		a = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field String a>
		b = executorservice;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #21  <Field ExecutorService b>
		c = l1;
	//    6   10:aload_0         
	//    7   11:lload_3         
	//    8   12:putfield        #23  <Field long c>
		d = timeunit;
	//    9   15:aload_0         
	//   10   16:aload           5
	//   11   18:putfield        #25  <Field TimeUnit d>
		super();
	//   12   21:aload_0         
	//   13   22:invokespecial   #28  <Method void h()>
	//   14   25:return          
	}
}

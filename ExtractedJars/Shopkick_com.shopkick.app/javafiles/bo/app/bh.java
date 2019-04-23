// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package bo.app;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.*;
import android.os.Handler;
import com.appboy.Appboy;
import com.appboy.support.AppboyLogger;
import java.util.concurrent.TimeUnit;

// Referenced classes of package bo.app:
//			dq, dl, by, de, 
//			ca, dh, ai, aa, 
//			ak, al, aj

public class bh
{

	public bh(Context context, de de1, aa aa1, AlarmManager alarmmanager, dh dh1, int i1, boolean flag)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #68  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #4   <Class Object>
	//    4    8:dup             
	//    5    9:invokespecial   #68  <Method void Object()>
	//    6   12:putfield        #70  <Field Object d>
		e = de1;
	//    7   15:aload_0         
	//    8   16:aload_2         
	//    9   17:putfield        #72  <Field de e>
		f = aa1;
	//   10   20:aload_0         
	//   11   21:aload_3         
	//   12   22:putfield        #74  <Field aa f>
		g = context;
	//   13   25:aload_0         
	//   14   26:aload_1         
	//   15   27:putfield        #76  <Field Context g>
		h = alarmmanager;
	//   16   30:aload_0         
	//   17   31:aload           4
	//   18   33:putfield        #78  <Field AlarmManager h>
		i = i1;
	//   19   36:aload_0         
	//   20   37:iload           6
	//   21   39:putfield        #80  <Field int i>
		k = dh1;
	//   22   42:aload_0         
	//   23   43:aload           5
	//   24   45:putfield        #82  <Field dh k>
	//   25   48:aload_0         
	//   26   49:invokestatic    #87  <Method Handler dq.a()>
	//   27   52:putfield        #89  <Field Handler m>
		n = new Runnable(context) {

			public void run()
			{
				AppboyLogger.d(bh.h(), "Requesting data flush on internal session close flush timer.");
			//    0    0:invokestatic    #29  <Method String bh.h()>
			//    1    3:ldc1            #31  <String "Requesting data flush on internal session close flush timer.">
			//    2    5:invokestatic    #37  <Method int AppboyLogger.d(String, String)>
			//    3    8:pop             
				Appboy.getInstance(a).requestImmediateDataFlush();
			//    4    9:aload_0         
			//    5   10:getfield        #20  <Field Context a>
			//    6   13:invokestatic    #43  <Method Appboy Appboy.getInstance(Context)>
			//    7   16:invokevirtual   #46  <Method void Appboy.requestImmediateDataFlush()>
			//    8   19:return          
			}

			final Context a;
			final bh b;

			
			{
				b = bh.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #18  <Field bh b>
				a = context;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #20  <Field Context a>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #23  <Method void Object()>
			//    8   14:return          
			}
		}
;
	//   28   55:aload_0         
	//   29   56:new             #6   <Class bh$1>
	//   30   59:dup             
	//   31   60:aload_0         
	//   32   61:aload_1         
	//   33   62:invokespecial   #92  <Method void bh$1(bh, Context)>
	//   34   65:putfield        #94  <Field Runnable n>
		o = flag;
	//   35   68:aload_0         
	//   36   69:iload           7
	//   37   71:putfield        #96  <Field boolean o>
		de1 = ((de) (new BroadcastReceiver() {

			public void onReceive(Context context1, Intent intent)
			{
				context1 = ((Context) (bh.a(a)));
			//    0    0:aload_0         
			//    1    1:getfield        #14  <Field bh a>
			//    2    4:invokestatic    #25  <Method Object bh.a(bh)>
			//    3    7:astore_1        
				context1;
			//    4    8:aload_1         
				JVM INSTR monitorenter ;
			//    5    9:monitorenter    
				try
				{
					bh.b(a);
			//    6   10:aload_0         
			//    7   11:getfield        #14  <Field bh a>
			//    8   14:invokestatic    #28  <Method void bh.b(bh)>
					break MISSING_BLOCK_LABEL_54;
			//    9   17:goto            54
				}
			//*  10   20:astore_2        
			//*  11   21:goto            57
				// Misplaced declaration of an exception variable
				catch(Intent intent) { }
			//   12   24:astore_2        
				break MISSING_BLOCK_LABEL_25;
				intent;
				break MISSING_BLOCK_LABEL_57;
				try
				{
					bh.c(a).a(((Object) (intent)), java/lang/Throwable);
			//   13   25:aload_0         
			//   14   26:getfield        #14  <Field bh a>
			//   15   29:invokestatic    #32  <Method aa bh.c(bh)>
			//   16   32:aload_2         
			//   17   33:ldc1            #34  <Class Throwable>
			//   18   35:invokeinterface #39  <Method void aa.a(Object, Class)>
					break MISSING_BLOCK_LABEL_54;
			//   19   40:goto            54
				}
				// Misplaced declaration of an exception variable
				catch(Intent intent) { }
			//   20   43:astore_2        
				AppboyLogger.e(bh.h(), "Failed to log throwable.", ((Throwable) (intent)));
			//   21   44:invokestatic    #43  <Method String bh.h()>
			//   22   47:ldc1            #45  <String "Failed to log throwable.">
			//   23   49:aload_2         
			//   24   50:invokestatic    #51  <Method int AppboyLogger.e(String, String, Throwable)>
			//   25   53:pop             
				context1;
			//   26   54:aload_1         
				JVM INSTR monitorexit ;
			//   27   55:monitorexit     
				return;
			//   28   56:return          
				context1;
			//   29   57:aload_1         
				JVM INSTR monitorexit ;
			//   30   58:monitorexit     
				throw intent;
			//   31   59:aload_2         
			//   32   60:athrow          
			}

			final bh a;

			
			{
				a = bh.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #14  <Field bh a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #17  <Method void BroadcastReceiver()>
			//    5    9:return          
			}
		}
));
	//   38   74:new             #8   <Class bh$2>
	//   39   77:dup             
	//   40   78:aload_0         
	//   41   79:invokespecial   #99  <Method void bh$2(bh)>
	//   42   82:astore_2        
		aa1 = ((aa) (new StringBuilder()));
	//   43   83:new             #101 <Class StringBuilder>
	//   44   86:dup             
	//   45   87:invokespecial   #102 <Method void StringBuilder()>
	//   46   90:astore_3        
		((StringBuilder) (aa1)).append(context.getPackageName());
	//   47   91:aload_3         
	//   48   92:aload_1         
	//   49   93:invokevirtual   #108 <Method String Context.getPackageName()>
	//   50   96:invokevirtual   #112 <Method StringBuilder StringBuilder.append(String)>
	//   51   99:pop             
		((StringBuilder) (aa1)).append(".intent.APPBOY_SESSION_SHOULD_SEAL");
	//   52  100:aload_3         
	//   53  101:ldc1            #114 <String ".intent.APPBOY_SESSION_SHOULD_SEAL">
	//   54  103:invokevirtual   #112 <Method StringBuilder StringBuilder.append(String)>
	//   55  106:pop             
		j = ((StringBuilder) (aa1)).toString();
	//   56  107:aload_0         
	//   57  108:aload_3         
	//   58  109:invokevirtual   #117 <Method String StringBuilder.toString()>
	//   59  112:putfield        #119 <Field String j>
		context.registerReceiver(((BroadcastReceiver) (de1)), new IntentFilter(j));
	//   60  115:aload_1         
	//   61  116:aload_2         
	//   62  117:new             #121 <Class IntentFilter>
	//   63  120:dup             
	//   64  121:aload_0         
	//   65  122:getfield        #119 <Field String j>
	//   66  125:invokespecial   #124 <Method void IntentFilter(String)>
	//   67  128:invokevirtual   #128 <Method Intent Context.registerReceiver(BroadcastReceiver, IntentFilter)>
	//   68  131:pop             
	//   69  132:return          
	}

	static Object a(bh bh1)
	{
		return bh1.d;
	//    0    0:aload_0         
	//    1    1:getfield        #70  <Field Object d>
	//    2    4:areturn         
	}

	private void a(long l1)
	{
		Object obj = ((Object) (b));
	//    0    0:getstatic       #47  <Field String b>
	//    1    3:astore_3        
		StringBuilder stringbuilder = new StringBuilder();
	//    2    4:new             #101 <Class StringBuilder>
	//    3    7:dup             
	//    4    8:invokespecial   #102 <Method void StringBuilder()>
	//    5   11:astore          4
		stringbuilder.append("Creating a session seal alarm with a delay of ");
	//    6   13:aload           4
	//    7   15:ldc1            #132 <String "Creating a session seal alarm with a delay of ">
	//    8   17:invokevirtual   #112 <Method StringBuilder StringBuilder.append(String)>
	//    9   20:pop             
		stringbuilder.append(l1);
	//   10   21:aload           4
	//   11   23:lload_1         
	//   12   24:invokevirtual   #135 <Method StringBuilder StringBuilder.append(long)>
	//   13   27:pop             
		stringbuilder.append(" ms");
	//   14   28:aload           4
	//   15   30:ldc1            #137 <String " ms">
	//   16   32:invokevirtual   #112 <Method StringBuilder StringBuilder.append(String)>
	//   17   35:pop             
		AppboyLogger.d(((String) (obj)), stringbuilder.toString());
	//   18   36:aload_3         
	//   19   37:aload           4
	//   20   39:invokevirtual   #117 <Method String StringBuilder.toString()>
	//   21   42:invokestatic    #140 <Method int AppboyLogger.d(String, String)>
	//   22   45:pop             
		obj = ((Object) (new Intent(j)));
	//   23   46:new             #142 <Class Intent>
	//   24   49:dup             
	//   25   50:aload_0         
	//   26   51:getfield        #119 <Field String j>
	//   27   54:invokespecial   #143 <Method void Intent(String)>
	//   28   57:astore_3        
		((Intent) (obj)).putExtra("session_id", ((Object) (l)).toString());
	//   29   58:aload_3         
	//   30   59:ldc1            #145 <String "session_id">
	//   31   61:aload_0         
	//   32   62:getfield        #147 <Field by l>
	//   33   65:invokevirtual   #148 <Method String Object.toString()>
	//   34   68:invokevirtual   #152 <Method Intent Intent.putExtra(String, String)>
	//   35   71:pop             
		obj = ((Object) (PendingIntent.getBroadcast(g, 0, ((Intent) (obj)), 0x40000000)));
	//   36   72:aload_0         
	//   37   73:getfield        #76  <Field Context g>
	//   38   76:iconst_0        
	//   39   77:aload_3         
	//   40   78:ldc1            #153 <Int 0x40000000>
	//   41   80:invokestatic    #159 <Method PendingIntent PendingIntent.getBroadcast(Context, int, Intent, int)>
	//   42   83:astore_3        
		h.set(1, dl.c() + l1, ((PendingIntent) (obj)));
	//   43   84:aload_0         
	//   44   85:getfield        #78  <Field AlarmManager h>
	//   45   88:iconst_1        
	//   46   89:invokestatic    #164 <Method long dl.c()>
	//   47   92:lload_1         
	//   48   93:ladd            
	//   49   94:aload_3         
	//   50   95:invokevirtual   #170 <Method void AlarmManager.set(int, long, PendingIntent)>
	//   51   98:return          
	}

	static boolean a(by by1, int i1, boolean flag)
	{
		long l1 = dl.c();
	//    0    0:invokestatic    #164 <Method long dl.c()>
	//    1    3:lstore_3        
		long l2 = TimeUnit.SECONDS.toMillis(i1);
	//    2    4:getstatic       #53  <Field TimeUnit TimeUnit.SECONDS>
	//    3    7:iload_1         
	//    4    8:i2l             
	//    5    9:invokevirtual   #59  <Method long TimeUnit.toMillis(long)>
	//    6   12:lstore          5
		long l3 = TimeUnit.SECONDS.toMillis(by1.c().longValue());
	//    7   14:getstatic       #53  <Field TimeUnit TimeUnit.SECONDS>
	//    8   17:aload_0         
	//    9   18:invokevirtual   #176 <Method Double by.c()>
	//   10   21:invokevirtual   #181 <Method long Double.longValue()>
	//   11   24:invokevirtual   #59  <Method long TimeUnit.toMillis(long)>
	//   12   27:lstore          7
		long l4 = TimeUnit.SECONDS.toMillis((long)by1.b());
	//   13   29:getstatic       #53  <Field TimeUnit TimeUnit.SECONDS>
	//   14   32:aload_0         
	//   15   33:invokevirtual   #184 <Method double by.b()>
	//   16   36:d2l             
	//   17   37:invokevirtual   #59  <Method long TimeUnit.toMillis(long)>
	//   18   40:lstore          9
		if(flag)
	//*  19   42:iload_2         
	//*  20   43:ifeq            64
			return l4 + l2 + a <= l1;
	//   21   46:lload           9
	//   22   48:lload           5
	//   23   50:ladd            
	//   24   51:getstatic       #63  <Field long a>
	//   25   54:ladd            
	//   26   55:lload_3         
	//   27   56:lcmp            
	//   28   57:ifgt            62
	//   29   60:iconst_1        
	//   30   61:ireturn         
	//   31   62:iconst_0        
	//   32   63:ireturn         
		return l3 + l2 <= l1;
	//   33   64:lload           7
	//   34   66:lload           5
	//   35   68:ladd            
	//   36   69:lload_3         
	//   37   70:lcmp            
	//   38   71:ifgt            76
	//   39   74:iconst_1        
	//   40   75:ireturn         
	//   41   76:iconst_0        
	//   42   77:ireturn         
	}

	static long b(by by1, int i1, boolean flag)
	{
		long l1 = TimeUnit.SECONDS.toMillis(i1);
	//    0    0:getstatic       #53  <Field TimeUnit TimeUnit.SECONDS>
	//    1    3:iload_1         
	//    2    4:i2l             
	//    3    5:invokevirtual   #59  <Method long TimeUnit.toMillis(long)>
	//    4    8:lstore_3        
		if(flag)
	//*   5    9:iload_2         
	//*   6   10:ifeq            45
		{
			long l2 = TimeUnit.SECONDS.toMillis((long)by1.b());
	//    7   13:getstatic       #53  <Field TimeUnit TimeUnit.SECONDS>
	//    8   16:aload_0         
	//    9   17:invokevirtual   #184 <Method double by.b()>
	//   10   20:d2l             
	//   11   21:invokevirtual   #59  <Method long TimeUnit.toMillis(long)>
	//   12   24:lstore          5
			long l3 = dl.c();
	//   13   26:invokestatic    #164 <Method long dl.c()>
	//   14   29:lstore          7
			return Math.max(a, (l2 + l1) - l3);
	//   15   31:getstatic       #63  <Field long a>
	//   16   34:lload           5
	//   17   36:lload_3         
	//   18   37:ladd            
	//   19   38:lload           7
	//   20   40:lsub            
	//   21   41:invokestatic    #192 <Method long Math.max(long, long)>
	//   22   44:lreturn         
		} else
		{
			return l1;
	//   23   45:lload_3         
	//   24   46:lreturn         
		}
	}

	static void b(bh bh1)
	{
		bh1.k();
	//    0    0:aload_0         
	//    1    1:invokespecial   #194 <Method void k()>
	//    2    4:return          
	}

	static aa c(bh bh1)
	{
		return bh1.f;
	//    0    0:aload_0         
	//    1    1:getfield        #74  <Field aa f>
	//    2    4:areturn         
	}

	static String h()
	{
		return b;
	//    0    0:getstatic       #47  <Field String b>
	//    1    3:areturn         
	}

	private boolean i()
	{
		Object obj = d;
	//    0    0:aload_0         
	//    1    1:getfield        #70  <Field Object d>
	//    2    4:astore_1        
		obj;
	//    3    5:aload_1         
		JVM INSTR monitorenter ;
	//    4    6:monitorenter    
		k();
	//    5    7:aload_0         
	//    6    8:invokespecial   #194 <Method void k()>
		if(l == null || l.d())
	//*   7   11:aload_0         
	//*   8   12:getfield        #147 <Field by l>
	//*   9   15:ifnull          57
	//*  10   18:aload_0         
	//*  11   19:getfield        #147 <Field by l>
	//*  12   22:invokevirtual   #198 <Method boolean by.d()>
	//*  13   25:ifeq            31
			break MISSING_BLOCK_LABEL_57;
	//   14   28:goto            57
		if(l.c() == null)
			break MISSING_BLOCK_LABEL_53;
	//   15   31:aload_0         
	//   16   32:getfield        #147 <Field by l>
	//   17   35:invokevirtual   #176 <Method Double by.c()>
	//   18   38:ifnull          53
		l.a(((Double) (null)));
	//   19   41:aload_0         
	//   20   42:getfield        #147 <Field by l>
	//   21   45:aconst_null     
	//   22   46:invokevirtual   #201 <Method void by.a(Double)>
	//*  23   49:aload_1         
	//*  24   50:monitorexit     
		return true;
	//   25   51:iconst_1        
	//   26   52:ireturn         
		obj;
	//   27   53:aload_1         
		JVM INSTR monitorexit ;
	//   28   54:monitorexit     
		return false;
	//   29   55:iconst_0        
	//   30   56:ireturn         
		by by1;
		by1 = l;
	//   31   57:aload_0         
	//   32   58:getfield        #147 <Field by l>
	//   33   61:astore_2        
		l = j();
	//   34   62:aload_0         
	//   35   63:aload_0         
	//   36   64:invokespecial   #204 <Method by j()>
	//   37   67:putfield        #147 <Field by l>
		if(by1 == null)
			break MISSING_BLOCK_LABEL_132;
	//   38   70:aload_2         
	//   39   71:ifnull          132
		if(by1.d())
	//*  40   74:aload_2         
	//*  41   75:invokevirtual   #198 <Method boolean by.d()>
	//*  42   78:ifeq            132
		{
			String s = b;
	//   43   81:getstatic       #47  <Field String b>
	//   44   84:astore_3        
			StringBuilder stringbuilder = new StringBuilder();
	//   45   85:new             #101 <Class StringBuilder>
	//   46   88:dup             
	//   47   89:invokespecial   #102 <Method void StringBuilder()>
	//   48   92:astore          4
			stringbuilder.append("Clearing completely dispatched sealed session ");
	//   49   94:aload           4
	//   50   96:ldc1            #206 <String "Clearing completely dispatched sealed session ">
	//   51   98:invokevirtual   #112 <Method StringBuilder StringBuilder.append(String)>
	//   52  101:pop             
			stringbuilder.append(((Object) (by1.a())));
	//   53  102:aload           4
	//   54  104:aload_2         
	//   55  105:invokevirtual   #209 <Method ca by.a()>
	//   56  108:invokevirtual   #212 <Method StringBuilder StringBuilder.append(Object)>
	//   57  111:pop             
			AppboyLogger.d(s, stringbuilder.toString());
	//   58  112:aload_3         
	//   59  113:aload           4
	//   60  115:invokevirtual   #117 <Method String StringBuilder.toString()>
	//   61  118:invokestatic    #140 <Method int AppboyLogger.d(String, String)>
	//   62  121:pop             
			e.b(by1);
	//   63  122:aload_0         
	//   64  123:getfield        #72  <Field de e>
	//   65  126:aload_2         
	//   66  127:invokeinterface #217 <Method void de.b(by)>
		}
		obj;
	//   67  132:aload_1         
		JVM INSTR monitorexit ;
	//   68  133:monitorexit     
		return true;
	//   69  134:iconst_1        
	//   70  135:ireturn         
		Exception exception;
		exception;
	//   71  136:astore_2        
		obj;
	//   72  137:aload_1         
		JVM INSTR monitorexit ;
	//   73  138:monitorexit     
		throw exception;
	//   74  139:aload_2         
	//   75  140:athrow          
	}

	private by j()
	{
		by by1 = new by(ca.a(), dl.b());
	//    0    0:new             #173 <Class by>
	//    1    3:dup             
	//    2    4:invokestatic    #220 <Method ca ca.a()>
	//    3    7:invokestatic    #221 <Method double dl.b()>
	//    4   10:invokespecial   #224 <Method void by(ca, double)>
	//    5   13:astore_1        
		k.a(true);
	//    6   14:aload_0         
	//    7   15:getfield        #82  <Field dh k>
	//    8   18:iconst_1        
	//    9   19:invokevirtual   #229 <Method void dh.a(boolean)>
		f.a(((Object) (ai.a)), bo/app/ai);
	//   10   22:aload_0         
	//   11   23:getfield        #74  <Field aa f>
	//   12   26:getstatic       #234 <Field ai ai.a>
	//   13   29:ldc1            #231 <Class ai>
	//   14   31:invokeinterface #239 <Method void aa.a(Object, Class)>
		String s = b;
	//   15   36:getstatic       #47  <Field String b>
	//   16   39:astore_2        
		StringBuilder stringbuilder = new StringBuilder();
	//   17   40:new             #101 <Class StringBuilder>
	//   18   43:dup             
	//   19   44:invokespecial   #102 <Method void StringBuilder()>
	//   20   47:astore_3        
		stringbuilder.append("New session created with ID: ");
	//   21   48:aload_3         
	//   22   49:ldc1            #241 <String "New session created with ID: ">
	//   23   51:invokevirtual   #112 <Method StringBuilder StringBuilder.append(String)>
	//   24   54:pop             
		stringbuilder.append(((Object) (by1.a())));
	//   25   55:aload_3         
	//   26   56:aload_1         
	//   27   57:invokevirtual   #209 <Method ca by.a()>
	//   28   60:invokevirtual   #212 <Method StringBuilder StringBuilder.append(Object)>
	//   29   63:pop             
		AppboyLogger.i(s, stringbuilder.toString());
	//   30   64:aload_2         
	//   31   65:aload_3         
	//   32   66:invokevirtual   #117 <Method String StringBuilder.toString()>
	//   33   69:invokestatic    #243 <Method int AppboyLogger.i(String, String)>
	//   34   72:pop             
		return by1;
	//   35   73:aload_1         
	//   36   74:areturn         
	}

	private void k()
	{
		synchronized(d)
	//*   0    0:aload_0         
	//*   1    1:getfield        #70  <Field Object d>
	//*   2    4:astore_1        
	//*   3    5:aload_1         
	//*   4    6:monitorenter    
		{
			if(l == null)
	//*   5    7:aload_0         
	//*   6    8:getfield        #147 <Field by l>
	//*   7   11:ifnonnull       77
			{
				l = e.a();
	//    8   14:aload_0         
	//    9   15:aload_0         
	//   10   16:getfield        #72  <Field de e>
	//   11   19:invokeinterface #245 <Method by de.a()>
	//   12   24:putfield        #147 <Field by l>
				if(l != null)
	//*  13   27:aload_0         
	//*  14   28:getfield        #147 <Field by l>
	//*  15   31:ifnull          77
				{
					String s = b;
	//   16   34:getstatic       #47  <Field String b>
	//   17   37:astore_2        
					StringBuilder stringbuilder = new StringBuilder();
	//   18   38:new             #101 <Class StringBuilder>
	//   19   41:dup             
	//   20   42:invokespecial   #102 <Method void StringBuilder()>
	//   21   45:astore_3        
					stringbuilder.append("Restored session from offline storage: ");
	//   22   46:aload_3         
	//   23   47:ldc1            #247 <String "Restored session from offline storage: ">
	//   24   49:invokevirtual   #112 <Method StringBuilder StringBuilder.append(String)>
	//   25   52:pop             
					stringbuilder.append(l.a().toString());
	//   26   53:aload_3         
	//   27   54:aload_0         
	//   28   55:getfield        #147 <Field by l>
	//   29   58:invokevirtual   #209 <Method ca by.a()>
	//   30   61:invokevirtual   #248 <Method String ca.toString()>
	//   31   64:invokevirtual   #112 <Method StringBuilder StringBuilder.append(String)>
	//   32   67:pop             
					AppboyLogger.d(s, stringbuilder.toString());
	//   33   68:aload_2         
	//   34   69:aload_3         
	//   35   70:invokevirtual   #117 <Method String StringBuilder.toString()>
	//   36   73:invokestatic    #140 <Method int AppboyLogger.d(String, String)>
	//   37   76:pop             
				}
			}
			if(l != null && l.c() != null && !l.d() && a(l, i, o))
	//*  38   77:aload_0         
	//*  39   78:getfield        #147 <Field by l>
	//*  40   81:ifnull          191
	//*  41   84:aload_0         
	//*  42   85:getfield        #147 <Field by l>
	//*  43   88:invokevirtual   #176 <Method Double by.c()>
	//*  44   91:ifnull          191
	//*  45   94:aload_0         
	//*  46   95:getfield        #147 <Field by l>
	//*  47   98:invokevirtual   #198 <Method boolean by.d()>
	//*  48  101:ifne            191
	//*  49  104:aload_0         
	//*  50  105:getfield        #147 <Field by l>
	//*  51  108:aload_0         
	//*  52  109:getfield        #80  <Field int i>
	//*  53  112:aload_0         
	//*  54  113:getfield        #96  <Field boolean o>
	//*  55  116:invokestatic    #250 <Method boolean a(by, int, boolean)>
	//*  56  119:ifeq            191
			{
				String s1 = b;
	//   57  122:getstatic       #47  <Field String b>
	//   58  125:astore_2        
				StringBuilder stringbuilder1 = new StringBuilder();
	//   59  126:new             #101 <Class StringBuilder>
	//   60  129:dup             
	//   61  130:invokespecial   #102 <Method void StringBuilder()>
	//   62  133:astore_3        
				stringbuilder1.append("Session [");
	//   63  134:aload_3         
	//   64  135:ldc1            #252 <String "Session [">
	//   65  137:invokevirtual   #112 <Method StringBuilder StringBuilder.append(String)>
	//   66  140:pop             
				stringbuilder1.append(((Object) (l.a())));
	//   67  141:aload_3         
	//   68  142:aload_0         
	//   69  143:getfield        #147 <Field by l>
	//   70  146:invokevirtual   #209 <Method ca by.a()>
	//   71  149:invokevirtual   #212 <Method StringBuilder StringBuilder.append(Object)>
	//   72  152:pop             
				stringbuilder1.append("] being sealed because its end time is over the grace period.");
	//   73  153:aload_3         
	//   74  154:ldc1            #254 <String "] being sealed because its end time is over the grace period.">
	//   75  156:invokevirtual   #112 <Method StringBuilder StringBuilder.append(String)>
	//   76  159:pop             
				AppboyLogger.i(s1, stringbuilder1.toString());
	//   77  160:aload_2         
	//   78  161:aload_3         
	//   79  162:invokevirtual   #117 <Method String StringBuilder.toString()>
	//   80  165:invokestatic    #243 <Method int AppboyLogger.i(String, String)>
	//   81  168:pop             
				e();
	//   82  169:aload_0         
	//   83  170:invokevirtual   #256 <Method void e()>
				e.b(l);
	//   84  173:aload_0         
	//   85  174:getfield        #72  <Field de e>
	//   86  177:aload_0         
	//   87  178:getfield        #147 <Field by l>
	//   88  181:invokeinterface #217 <Method void de.b(by)>
				l = null;
	//   89  186:aload_0         
	//   90  187:aconst_null     
	//   91  188:putfield        #147 <Field by l>
			}
		}
	//   92  191:aload_1         
	//   93  192:monitorexit     
		return;
	//   94  193:return          
		exception;
	//   95  194:astore_2        
		obj;
	//   96  195:aload_1         
		JVM INSTR monitorexit ;
	//   97  196:monitorexit     
		throw exception;
	//   98  197:aload_2         
	//   99  198:athrow          
	}

	private void l()
	{
		Object obj = ((Object) (new Intent(j)));
	//    0    0:new             #142 <Class Intent>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #119 <Field String j>
	//    4    8:invokespecial   #143 <Method void Intent(String)>
	//    5   11:astore_1        
		((Intent) (obj)).putExtra("session_id", ((Object) (l)).toString());
	//    6   12:aload_1         
	//    7   13:ldc1            #145 <String "session_id">
	//    8   15:aload_0         
	//    9   16:getfield        #147 <Field by l>
	//   10   19:invokevirtual   #148 <Method String Object.toString()>
	//   11   22:invokevirtual   #152 <Method Intent Intent.putExtra(String, String)>
	//   12   25:pop             
		obj = ((Object) (PendingIntent.getBroadcast(g, 0, ((Intent) (obj)), 0x40000000)));
	//   13   26:aload_0         
	//   14   27:getfield        #76  <Field Context g>
	//   15   30:iconst_0        
	//   16   31:aload_1         
	//   17   32:ldc1            #153 <Int 0x40000000>
	//   18   34:invokestatic    #159 <Method PendingIntent PendingIntent.getBroadcast(Context, int, Intent, int)>
	//   19   37:astore_1        
		h.cancel(((PendingIntent) (obj)));
	//   20   38:aload_0         
	//   21   39:getfield        #78  <Field AlarmManager h>
	//   22   42:aload_1         
	//   23   43:invokevirtual   #260 <Method void AlarmManager.cancel(PendingIntent)>
	//   24   46:return          
	}

	public by a()
	{
		by by1;
		synchronized(d)
	//*   0    0:aload_0         
	//*   1    1:getfield        #70  <Field Object d>
	//*   2    4:astore_1        
	//*   3    5:aload_1         
	//*   4    6:monitorenter    
		{
			if(i())
	//*   5    7:aload_0         
	//*   6    8:invokespecial   #262 <Method boolean i()>
	//*   7   11:ifeq            27
				e.a(l);
	//    8   14:aload_0         
	//    9   15:getfield        #72  <Field de e>
	//   10   18:aload_0         
	//   11   19:getfield        #147 <Field by l>
	//   12   22:invokeinterface #264 <Method void de.a(by)>
			g();
	//   13   27:aload_0         
	//   14   28:invokevirtual   #266 <Method void g()>
			l();
	//   15   31:aload_0         
	//   16   32:invokespecial   #268 <Method void l()>
			f.a(((Object) (ak.a)), bo/app/ak);
	//   17   35:aload_0         
	//   18   36:getfield        #74  <Field aa f>
	//   19   39:getstatic       #273 <Field ak ak.a>
	//   20   42:ldc2            #270 <Class ak>
	//   21   45:invokeinterface #239 <Method void aa.a(Object, Class)>
			by1 = l;
	//   22   50:aload_0         
	//   23   51:getfield        #147 <Field by l>
	//   24   54:astore_2        
		}
	//   25   55:aload_1         
	//   26   56:monitorexit     
		return by1;
	//   27   57:aload_2         
	//   28   58:areturn         
		exception;
	//   29   59:astore_2        
		obj;
	//   30   60:aload_1         
		JVM INSTR monitorexit ;
	//   31   61:monitorexit     
		throw exception;
	//   32   62:aload_2         
	//   33   63:athrow          
	}

	public by b()
	{
		by by1;
		synchronized(d)
	//*   0    0:aload_0         
	//*   1    1:getfield        #70  <Field Object d>
	//*   2    4:astore_1        
	//*   3    5:aload_1         
	//*   4    6:monitorenter    
		{
			i();
	//    5    7:aload_0         
	//    6    8:invokespecial   #262 <Method boolean i()>
	//    7   11:pop             
			l.a(Double.valueOf(dl.b()));
	//    8   12:aload_0         
	//    9   13:getfield        #147 <Field by l>
	//   10   16:invokestatic    #221 <Method double dl.b()>
	//   11   19:invokestatic    #277 <Method Double Double.valueOf(double)>
	//   12   22:invokevirtual   #201 <Method void by.a(Double)>
			e.a(l);
	//   13   25:aload_0         
	//   14   26:getfield        #72  <Field de e>
	//   15   29:aload_0         
	//   16   30:getfield        #147 <Field by l>
	//   17   33:invokeinterface #264 <Method void de.a(by)>
			f();
	//   18   38:aload_0         
	//   19   39:invokevirtual   #279 <Method void f()>
			a(b(l, i, o));
	//   20   42:aload_0         
	//   21   43:aload_0         
	//   22   44:getfield        #147 <Field by l>
	//   23   47:aload_0         
	//   24   48:getfield        #80  <Field int i>
	//   25   51:aload_0         
	//   26   52:getfield        #96  <Field boolean o>
	//   27   55:invokestatic    #281 <Method long b(by, int, boolean)>
	//   28   58:invokespecial   #283 <Method void a(long)>
			f.a(((Object) (al.a)), bo/app/al);
	//   29   61:aload_0         
	//   30   62:getfield        #74  <Field aa f>
	//   31   65:getstatic       #288 <Field al al.a>
	//   32   68:ldc2            #285 <Class al>
	//   33   71:invokeinterface #239 <Method void aa.a(Object, Class)>
			by1 = l;
	//   34   76:aload_0         
	//   35   77:getfield        #147 <Field by l>
	//   36   80:astore_2        
		}
	//   37   81:aload_1         
	//   38   82:monitorexit     
		return by1;
	//   39   83:aload_2         
	//   40   84:areturn         
		exception;
	//   41   85:astore_2        
		obj;
	//   42   86:aload_1         
		JVM INSTR monitorexit ;
	//   43   87:monitorexit     
		throw exception;
	//   44   88:aload_2         
	//   45   89:athrow          
	}

	public ca c()
	{
label0:
		{
			synchronized(d)
	//*   0    0:aload_0         
	//*   1    1:getfield        #70  <Field Object d>
	//*   2    4:astore_1        
	//*   3    5:aload_1         
	//*   4    6:monitorenter    
			{
				k();
	//    5    7:aload_0         
	//    6    8:invokespecial   #194 <Method void k()>
				if(l != null)
					break label0;
	//    7   11:aload_0         
	//    8   12:getfield        #147 <Field by l>
	//    9   15:ifnonnull       22
			}
	//   10   18:aload_1         
	//   11   19:monitorexit     
			return null;
	//   12   20:aconst_null     
	//   13   21:areturn         
		}
		ca ca1 = l.a();
	//   14   22:aload_0         
	//   15   23:getfield        #147 <Field by l>
	//   16   26:invokevirtual   #209 <Method ca by.a()>
	//   17   29:astore_2        
		obj;
	//   18   30:aload_1         
		JVM INSTR monitorexit ;
	//   19   31:monitorexit     
		return ca1;
	//   20   32:aload_2         
	//   21   33:areturn         
		exception;
	//   22   34:astore_2        
		obj;
	//   23   35:aload_1         
		JVM INSTR monitorexit ;
	//   24   36:monitorexit     
		throw exception;
	//   25   37:aload_2         
	//   26   38:athrow          
	}

	public boolean d()
	{
		Object obj = d;
	//    0    0:aload_0         
	//    1    1:getfield        #70  <Field Object d>
	//    2    4:astore_2        
		obj;
	//    3    5:aload_2         
		JVM INSTR monitorenter ;
	//    4    6:monitorenter    
		boolean flag;
		Exception exception;
		if(l != null && l.d())
	//*   5    7:aload_0         
	//*   6    8:getfield        #147 <Field by l>
	//*   7   11:ifnull          38
	//*   8   14:aload_0         
	//*   9   15:getfield        #147 <Field by l>
	//*  10   18:invokevirtual   #198 <Method boolean by.d()>
	//*  11   21:ifeq            38
			flag = true;
	//   12   24:iconst_1        
	//   13   25:istore_1        
		else
	//*  14   26:goto            29
	//*  15   29:aload_2         
	//*  16   30:monitorexit     
	//*  17   31:iload_1         
	//*  18   32:ireturn         
	//*  19   33:astore_3        
	//*  20   34:aload_2         
	//*  21   35:monitorexit     
	//*  22   36:aload_3         
	//*  23   37:athrow          
			flag = false;
	//   24   38:iconst_0        
	//   25   39:istore_1        
		obj;
		JVM INSTR monitorexit ;
		return flag;
		exception;
		obj;
		JVM INSTR monitorexit ;
		throw exception;
	//*  26   40:goto            29
	}

	public void e()
	{
		synchronized(d)
	//*   0    0:aload_0         
	//*   1    1:getfield        #70  <Field Object d>
	//*   2    4:astore_1        
	//*   3    5:aload_1         
	//*   4    6:monitorenter    
		{
			if(l != null)
	//*   5    7:aload_0         
	//*   6    8:getfield        #147 <Field by l>
	//*   7   11:ifnull          57
			{
				l.e();
	//    8   14:aload_0         
	//    9   15:getfield        #147 <Field by l>
	//   10   18:invokevirtual   #289 <Method void by.e()>
				e.a(l);
	//   11   21:aload_0         
	//   12   22:getfield        #72  <Field de e>
	//   13   25:aload_0         
	//   14   26:getfield        #147 <Field by l>
	//   15   29:invokeinterface #264 <Method void de.a(by)>
				f.a(((Object) (new aj(l))), bo/app/aj);
	//   16   34:aload_0         
	//   17   35:getfield        #74  <Field aa f>
	//   18   38:new             #291 <Class aj>
	//   19   41:dup             
	//   20   42:aload_0         
	//   21   43:getfield        #147 <Field by l>
	//   22   46:invokespecial   #293 <Method void aj(by)>
	//   23   49:ldc2            #291 <Class aj>
	//   24   52:invokeinterface #239 <Method void aa.a(Object, Class)>
			}
		}
	//   25   57:aload_1         
	//   26   58:monitorexit     
		return;
	//   27   59:return          
		exception;
	//   28   60:astore_2        
		obj;
	//   29   61:aload_1         
		JVM INSTR monitorexit ;
	//   30   62:monitorexit     
		throw exception;
	//   31   63:aload_2         
	//   32   64:athrow          
	}

	protected void f()
	{
		g();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #266 <Method void g()>
		m.postDelayed(n, c);
	//    2    4:aload_0         
	//    3    5:getfield        #89  <Field Handler m>
	//    4    8:aload_0         
	//    5    9:getfield        #94  <Field Runnable n>
	//    6   12:getstatic       #61  <Field long c>
	//    7   15:invokevirtual   #299 <Method boolean Handler.postDelayed(Runnable, long)>
	//    8   18:pop             
	//    9   19:return          
	}

	protected void g()
	{
		m.removeCallbacks(n);
	//    0    0:aload_0         
	//    1    1:getfield        #89  <Field Handler m>
	//    2    4:aload_0         
	//    3    5:getfield        #94  <Field Runnable n>
	//    4    8:invokevirtual   #303 <Method void Handler.removeCallbacks(Runnable)>
	//    5   11:return          
	}

	static final long a;
	private static final String b = AppboyLogger.getAppboyLogTag(bo/app/bh);
	private static final long c;
	private final Object d = new Object();
	private final de e;
	private final aa f;
	private final Context g;
	private final AlarmManager h;
	private final int i;
	private final String j;
	private final dh k;
	private volatile by l;
	private final Handler m = dq.a();
	private final Runnable n;
	private final boolean o;

	static 
	{
	//    0    0:ldc1            #2   <Class bh>
	//    1    2:invokestatic    #45  <Method String AppboyLogger.getAppboyLogTag(Class)>
	//    2    5:putstatic       #47  <Field String b>
		c = TimeUnit.SECONDS.toMillis(10L);
	//    3    8:getstatic       #53  <Field TimeUnit TimeUnit.SECONDS>
	//    4   11:ldc2w           #54  <Long 10L>
	//    5   14:invokevirtual   #59  <Method long TimeUnit.toMillis(long)>
	//    6   17:putstatic       #61  <Field long c>
		a = TimeUnit.SECONDS.toMillis(10L);
	//    7   20:getstatic       #53  <Field TimeUnit TimeUnit.SECONDS>
	//    8   23:ldc2w           #54  <Long 10L>
	//    9   26:invokevirtual   #59  <Method long TimeUnit.toMillis(long)>
	//   10   29:putstatic       #63  <Field long a>
	//*  11   32:return          
	}
}

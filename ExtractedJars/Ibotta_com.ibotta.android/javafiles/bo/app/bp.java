// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package bo.app;

import android.content.Context;
import android.content.SharedPreferences;
import com.appboy.support.AppboyLogger;

// Referenced classes of package bo.app:
//			al, ad, eb, dx

public class bp
{

	public bp(Context context, ad ad1, dx dx1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #30  <Method void Object()>
		c = false;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #32  <Field boolean c>
		b = ad1;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #34  <Field ad b>
		e = dx1;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #36  <Field dx e>
		a = context.getSharedPreferences("com.appboy.storage.sessions.messaging_session", 0);
	//   11   19:aload_0         
	//   12   20:aload_1         
	//   13   21:ldc1            #38  <String "com.appboy.storage.sessions.messaging_session">
	//   14   23:iconst_0        
	//   15   24:invokevirtual   #44  <Method SharedPreferences Context.getSharedPreferences(String, int)>
	//   16   27:putfield        #46  <Field SharedPreferences a>
	//   17   30:return          
	}

	void a()
	{
		if(c())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #49  <Method boolean c()>
	//*   2    4:ifeq            36
		{
			AppboyLogger.d(d, "Publishing new messaging session event.");
	//    3    7:getstatic       #25  <Field String d>
	//    4   10:ldc1            #51  <String "Publishing new messaging session event.">
	//    5   12:invokestatic    #54  <Method int AppboyLogger.d(String, String)>
	//    6   15:pop             
			b.a(((Object) (al.a)), bo/app/al);
	//    7   16:aload_0         
	//    8   17:getfield        #34  <Field ad b>
	//    9   20:getstatic       #59  <Field al al.a>
	//   10   23:ldc1            #56  <Class al>
	//   11   25:invokeinterface #64  <Method void ad.a(Object, Class)>
			c = true;
	//   12   30:aload_0         
	//   13   31:iconst_1        
	//   14   32:putfield        #32  <Field boolean c>
			return;
	//   15   35:return          
		} else
		{
			AppboyLogger.d(d, "Messaging session not started.");
	//   16   36:getstatic       #25  <Field String d>
	//   17   39:ldc1            #66  <String "Messaging session not started.">
	//   18   41:invokestatic    #54  <Method int AppboyLogger.d(String, String)>
	//   19   44:pop             
			return;
	//   20   45:return          
		}
	}

	void b()
	{
		long l = eb.a();
	//    0    0:invokestatic    #71  <Method long eb.a()>
	//    1    3:lstore_1        
		String s = d;
	//    2    4:getstatic       #25  <Field String d>
	//    3    7:astore_3        
		StringBuilder stringbuilder = new StringBuilder();
	//    4    8:new             #73  <Class StringBuilder>
	//    5   11:dup             
	//    6   12:invokespecial   #74  <Method void StringBuilder()>
	//    7   15:astore          4
		stringbuilder.append("Messaging session stopped. Adding new messaging session timestamp: ");
	//    8   17:aload           4
	//    9   19:ldc1            #76  <String "Messaging session stopped. Adding new messaging session timestamp: ">
	//   10   21:invokevirtual   #80  <Method StringBuilder StringBuilder.append(String)>
	//   11   24:pop             
		stringbuilder.append(l);
	//   12   25:aload           4
	//   13   27:lload_1         
	//   14   28:invokevirtual   #83  <Method StringBuilder StringBuilder.append(long)>
	//   15   31:pop             
		AppboyLogger.d(s, stringbuilder.toString());
	//   16   32:aload_3         
	//   17   33:aload           4
	//   18   35:invokevirtual   #87  <Method String StringBuilder.toString()>
	//   19   38:invokestatic    #54  <Method int AppboyLogger.d(String, String)>
	//   20   41:pop             
		a.edit().putLong("messaging_session_timestamp", l).apply();
	//   21   42:aload_0         
	//   22   43:getfield        #46  <Field SharedPreferences a>
	//   23   46:invokeinterface #93  <Method android.content.SharedPreferences$Editor SharedPreferences.edit()>
	//   24   51:ldc1            #95  <String "messaging_session_timestamp">
	//   25   53:lload_1         
	//   26   54:invokeinterface #101 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putLong(String, long)>
	//   27   59:invokeinterface #104 <Method void android.content.SharedPreferences$Editor.apply()>
		c = false;
	//   28   64:aload_0         
	//   29   65:iconst_0        
	//   30   66:putfield        #32  <Field boolean c>
	//   31   69:return          
	}

	boolean c()
	{
		long l = e.f();
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field dx e>
	//    2    4:invokevirtual   #109 <Method long dx.f()>
	//    3    7:lstore_1        
		boolean flag = false;
	//    4    8:iconst_0        
	//    5    9:istore          7
		if(l != -1L && !c)
	//*   6   11:lload_1         
	//*   7   12:ldc2w           #110 <Long -1L>
	//*   8   15:lcmp            
	//*   9   16:ifeq            119
	//*  10   19:aload_0         
	//*  11   20:getfield        #32  <Field boolean c>
	//*  12   23:ifne            119
		{
			long l1 = a.getLong("messaging_session_timestamp", -1L);
	//   13   26:aload_0         
	//   14   27:getfield        #46  <Field SharedPreferences a>
	//   15   30:ldc1            #95  <String "messaging_session_timestamp">
	//   16   32:ldc2w           #110 <Long -1L>
	//   17   35:invokeinterface #115 <Method long SharedPreferences.getLong(String, long)>
	//   18   40:lstore_3        
			long l2 = eb.a();
	//   19   41:invokestatic    #71  <Method long eb.a()>
	//   20   44:lstore          5
			String s = d;
	//   21   46:getstatic       #25  <Field String d>
	//   22   49:astore          8
			StringBuilder stringbuilder = new StringBuilder();
	//   23   51:new             #73  <Class StringBuilder>
	//   24   54:dup             
	//   25   55:invokespecial   #74  <Method void StringBuilder()>
	//   26   58:astore          9
			stringbuilder.append("Messaging session timeout: ");
	//   27   60:aload           9
	//   28   62:ldc1            #117 <String "Messaging session timeout: ">
	//   29   64:invokevirtual   #80  <Method StringBuilder StringBuilder.append(String)>
	//   30   67:pop             
			stringbuilder.append(l);
	//   31   68:aload           9
	//   32   70:lload_1         
	//   33   71:invokevirtual   #83  <Method StringBuilder StringBuilder.append(long)>
	//   34   74:pop             
			stringbuilder.append(", current diff: ");
	//   35   75:aload           9
	//   36   77:ldc1            #119 <String ", current diff: ">
	//   37   79:invokevirtual   #80  <Method StringBuilder StringBuilder.append(String)>
	//   38   82:pop             
			stringbuilder.append(l2 - l1);
	//   39   83:aload           9
	//   40   85:lload           5
	//   41   87:lload_3         
	//   42   88:lsub            
	//   43   89:invokevirtual   #83  <Method StringBuilder StringBuilder.append(long)>
	//   44   92:pop             
			AppboyLogger.d(s, stringbuilder.toString());
	//   45   93:aload           8
	//   46   95:aload           9
	//   47   97:invokevirtual   #87  <Method String StringBuilder.toString()>
	//   48  100:invokestatic    #54  <Method int AppboyLogger.d(String, String)>
	//   49  103:pop             
			if(l1 + l < l2)
	//*  50  104:lload_3         
	//*  51  105:lload_1         
	//*  52  106:ladd            
	//*  53  107:lload           5
	//*  54  109:lcmp            
	//*  55  110:ifge            116
				flag = true;
	//   56  113:iconst_1        
	//   57  114:istore          7
			return flag;
	//   58  116:iload           7
	//   59  118:ireturn         
		} else
		{
			return false;
	//   60  119:iconst_0        
	//   61  120:ireturn         
		}
	}

	private static final String d = AppboyLogger.getAppboyLogTag(bo/app/bp);
	final SharedPreferences a;
	final ad b;
	boolean c;
	private final dx e;

	static 
	{
	//    0    0:ldc1            #2   <Class bp>
	//    1    2:invokestatic    #23  <Method String AppboyLogger.getAppboyLogTag(Class)>
	//    2    5:putstatic       #25  <Field String d>
	//*   3    8:return          
	}
}

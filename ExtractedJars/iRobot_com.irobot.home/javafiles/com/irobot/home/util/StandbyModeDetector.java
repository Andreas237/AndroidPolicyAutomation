// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.util;

import android.content.*;
import com.irobot.home.IRobotApplication;
import java.util.*;

// Referenced classes of package com.irobot.home.util:
//			o, j

public final class StandbyModeDetector extends BroadcastReceiver
{
	public static interface a
	{

		public abstract void g(String s);
	}

	private static class b
	{

		static StandbyModeDetector a()
		{
			return a;
		//    0    0:getstatic       #25  <Field StandbyModeDetector a>
		//    1    3:areturn         
		}

		private static StandbyModeDetector a = new StandbyModeDetector((IRobotApplication)j.g());

		static 
		{
		//    0    0:new             #6   <Class StandbyModeDetector>
		//    1    3:dup             
		//    2    4:invokestatic    #17  <Method android.app.Application j.g()>
		//    3    7:checkcast       #19  <Class IRobotApplication>
		//    4   10:aconst_null     
		//    5   11:invokespecial   #23  <Method void StandbyModeDetector(IRobotApplication, StandbyModeDetector$1)>
		//    6   14:putstatic       #25  <Field StandbyModeDetector a>
		//*   7   17:return          
		}
	}


	private StandbyModeDetector(IRobotApplication irobotapplication)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #24  <Method void BroadcastReceiver()>
		b = ((Set) (new HashSet()));
	//    2    4:aload_0         
	//    3    5:new             #26  <Class HashSet>
	//    4    8:dup             
	//    5    9:invokespecial   #27  <Method void HashSet()>
	//    6   12:putfield        #29  <Field Set b>
		if(irobotapplication == null)
	//*   7   15:aload_1         
	//*   8   16:ifnonnull       28
		{
			o.e(a, "Unable to register standby detection intents, null app context");
	//    9   19:getstatic       #31  <Field String a>
	//   10   22:ldc1            #33  <String "Unable to register standby detection intents, null app context">
	//   11   24:invokestatic    #39  <Method void o.e(String, String)>
			return;
	//   12   27:return          
		} else
		{
			IntentFilter intentfilter = new IntentFilter();
	//   13   28:new             #41  <Class IntentFilter>
	//   14   31:dup             
	//   15   32:invokespecial   #42  <Method void IntentFilter()>
	//   16   35:astore_2        
			intentfilter.addAction("android.intent.action.SCREEN_OFF");
	//   17   36:aload_2         
	//   18   37:ldc1            #44  <String "android.intent.action.SCREEN_OFF">
	//   19   39:invokevirtual   #48  <Method void IntentFilter.addAction(String)>
			intentfilter.addAction("android.intent.action.DREAMING_STARTED");
	//   20   42:aload_2         
	//   21   43:ldc1            #50  <String "android.intent.action.DREAMING_STARTED">
	//   22   45:invokevirtual   #48  <Method void IntentFilter.addAction(String)>
			irobotapplication.registerReceiver(((BroadcastReceiver) (this)), intentfilter, ((String) (null)), ((android.os.Handler) (null)));
	//   23   48:aload_1         
	//   24   49:aload_0         
	//   25   50:aload_2         
	//   26   51:aconst_null     
	//   27   52:aconst_null     
	//   28   53:invokevirtual   #56  <Method Intent IRobotApplication.registerReceiver(BroadcastReceiver, IntentFilter, String, android.os.Handler)>
	//   29   56:pop             
			return;
	//   30   57:return          
		}
	}


	public static StandbyModeDetector a()
	{
		return b.a();
	//    0    0:invokestatic    #62  <Method StandbyModeDetector StandbyModeDetector$b.a()>
	//    1    3:areturn         
	}

	public boolean a(a a1)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		if(a1 == null)
			break MISSING_BLOCK_LABEL_27;
	//    2    2:aload_1         
	//    3    3:ifnull          26
		boolean flag = b.add(((Object) (a1)));
	//    4    6:aload_0         
	//    5    7:getfield        #29  <Field Set b>
	//    6   10:aload_1         
	//    7   11:invokeinterface #69  <Method boolean Set.add(Object)>
	//    8   16:istore_2        
		this;
	//    9   17:aload_0         
		JVM INSTR monitorexit ;
	//   10   18:monitorexit     
		return flag;
	//   11   19:iload_2         
	//   12   20:ireturn         
		a1;
	//   13   21:astore_1        
	//*  14   22:aload_0         
		throw a1;
	//   15   23:monitorexit     
	//   16   24:aload_1         
	//   17   25:athrow          
	//*  18   26:aload_0         
		return false;
	//   19   27:monitorexit     
	//   20   28:iconst_0        
	//   21   29:ireturn         
	}

	public void onReceive(Context context, Intent intent)
	{
		int i;
label0:
		{
			context = ((Context) (intent.getAction()));
	//    0    0:aload_2         
	//    1    1:invokevirtual   #77  <Method String Intent.getAction()>
	//    2    4:astore_1        
			i = ((String) (context)).hashCode();
	//    3    5:aload_1         
	//    4    6:invokevirtual   #83  <Method int String.hashCode()>
	//    5    9:istore_3        
			if(i != 0x81271581)
	//*   6   10:iload_3         
	//*   7   11:ldc1            #84  <Int 0x81271581>
	//*   8   13:icmpeq          39
			{
				if(i == 0xe98bfe6 && ((String) (context)).equals("android.intent.action.DREAMING_STARTED"))
	//*   9   16:iload_3         
	//*  10   17:ldc1            #85  <Int 0xe98bfe6>
	//*  11   19:icmpeq          25
	//*  12   22:goto            53
	//*  13   25:aload_1         
	//*  14   26:ldc1            #50  <String "android.intent.action.DREAMING_STARTED">
	//*  15   28:invokevirtual   #88  <Method boolean String.equals(Object)>
	//*  16   31:ifeq            53
				{
					i = 1;
	//   17   34:iconst_1        
	//   18   35:istore_3        
					break label0;
	//   19   36:goto            55
				}
			} else
			if(((String) (context)).equals("android.intent.action.SCREEN_OFF"))
	//*  20   39:aload_1         
	//*  21   40:ldc1            #44  <String "android.intent.action.SCREEN_OFF">
	//*  22   42:invokevirtual   #88  <Method boolean String.equals(Object)>
	//*  23   45:ifeq            53
			{
				i = 0;
	//   24   48:iconst_0        
	//   25   49:istore_3        
				break label0;
	//   26   50:goto            55
			}
			i = -1;
	//   27   53:iconst_m1       
	//   28   54:istore_3        
		}
		switch(i)
	//*  29   55:iload_3         
		{
	//*  30   56:tableswitch     0 1: default 80
	//	               0 81
	//	               1 81
		default:
			return;
	//   31   80:return          

		case 0: // '\0'
		case 1: // '\001'
			intent = ((Intent) (b.iterator()));
	//   32   81:aload_0         
	//   33   82:getfield        #29  <Field Set b>
	//   34   85:invokeinterface #92  <Method Iterator Set.iterator()>
	//   35   90:astore_2        
			break;
		}
		do
		{
			if(!((Iterator) (intent)).hasNext())
				break;
	//   36   91:aload_2         
	//   37   92:invokeinterface #98  <Method boolean Iterator.hasNext()>
	//   38   97:ifeq            127
			a a1 = (a)((Iterator) (intent)).next();
	//   39  100:aload_2         
	//   40  101:invokeinterface #102 <Method Object Iterator.next()>
	//   41  106:checkcast       #8   <Class StandbyModeDetector$a>
	//   42  109:astore          4
			if(a1 != null)
	//*  43  111:aload           4
	//*  44  113:ifnull          91
				a1.g(((String) (context)));
	//   45  116:aload           4
	//   46  118:aload_1         
	//   47  119:invokeinterface #105 <Method void StandbyModeDetector$a.g(String)>
		} while(true);
	//   48  124:goto            91
	//   49  127:return          
	}

	private static final String a = "StandbyModeDetector";
	private final Set b;

	static 
	{
	//    0    0:return          
	}
}

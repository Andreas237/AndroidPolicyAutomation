// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package o;

import android.content.*;
import android.os.*;
import android.text.TextUtils;
import android.util.Log;
import java.io.File;
import java.util.*;

// Referenced classes of package o:
//			dio, dht, dhy, dhw

public class dhu
{
	public static interface b
	{

		public abstract void e();
	}

	static class d
	{

		boolean a;

		private d()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #13  <Method void Object()>
			a = true;
		//    2    4:aload_0         
		//    3    5:iconst_1        
		//    4    6:putfield        #15  <Field boolean a>
		//    5    9:return          
		}

	}


	private dhu()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #105 <Method void Object()>
		c = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #166 <Field String c>
		i = null;
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:putfield        #168 <Field String i>
		f = 5;
	//    8   14:aload_0         
	//    9   15:iconst_5        
	//   10   16:putfield        #170 <Field int f>
		h = true;
	//   11   19:aload_0         
	//   12   20:iconst_1        
	//   13   21:putfield        #172 <Field boolean h>
		g = 0.0D;
	//   14   24:aload_0         
	//   15   25:dconst_0        
	//   16   26:putfield        #174 <Field double g>
		k = null;
	//   17   29:aload_0         
	//   18   30:aconst_null     
	//   19   31:putfield        #176 <Field String k>
		p = n;
	//   20   34:aload_0         
	//   21   35:getstatic       #101 <Field int n>
	//   22   38:i2d             
	//   23   39:putfield        #178 <Field double p>
	//   24   42:return          
	}

	public static String a()
	{
		String s1;
		if(1 == l)
	//*   0    0:iconst_1        
	//*   1    1:getstatic       #98  <Field int l>
	//*   2    4:icmpne          13
			s1 = "/data/data/com.huawei.health/files/";
	//    3    7:ldc1            #180 <String "/data/data/com.huawei.health/files/">
	//    4    9:astore_0        
		else
	//*   5   10:goto            17
			s1 = e;
	//    6   13:getstatic       #81  <Field String e>
	//    7   16:astore_0        
		Log.d("LogUtil_LogConfig", (new StringBuilder()).append("obtainSavePath(): path = ").append(s1).toString());
	//    8   17:ldc1            #182 <String "LogUtil_LogConfig">
	//    9   19:new             #67  <Class StringBuilder>
	//   10   22:dup             
	//   11   23:invokespecial   #70  <Method void StringBuilder()>
	//   12   26:ldc1            #184 <String "obtainSavePath(): path = ">
	//   13   28:invokevirtual   #74  <Method StringBuilder StringBuilder.append(String)>
	//   14   31:aload_0         
	//   15   32:invokevirtual   #74  <Method StringBuilder StringBuilder.append(String)>
	//   16   35:invokevirtual   #79  <Method String StringBuilder.toString()>
	//   17   38:invokestatic    #189 <Method int Log.d(String, String)>
	//   18   41:pop             
		return s1;
	//   19   42:aload_0         
	//   20   43:areturn         
	}

	private static void a(Context context)
	{
		Log.i("LogUtil_LogConfig", (new StringBuilder()).append("registerLogConfigReceiver process:").append(dio.d()).append(" pid:").append(Process.myPid()).toString());
	//    0    0:ldc1            #182 <String "LogUtil_LogConfig">
	//    1    2:new             #67  <Class StringBuilder>
	//    2    5:dup             
	//    3    6:invokespecial   #70  <Method void StringBuilder()>
	//    4    9:ldc1            #192 <String "registerLogConfigReceiver process:">
	//    5   11:invokevirtual   #74  <Method StringBuilder StringBuilder.append(String)>
	//    6   14:invokestatic    #196 <Method String dio.d()>
	//    7   17:invokevirtual   #74  <Method StringBuilder StringBuilder.append(String)>
	//    8   20:ldc1            #198 <String " pid:">
	//    9   22:invokevirtual   #74  <Method StringBuilder StringBuilder.append(String)>
	//   10   25:invokestatic    #204 <Method int Process.myPid()>
	//   11   28:invokevirtual   #207 <Method StringBuilder StringBuilder.append(int)>
	//   12   31:invokevirtual   #79  <Method String StringBuilder.toString()>
	//   13   34:invokestatic    #209 <Method int Log.i(String, String)>
	//   14   37:pop             
		IntentFilter intentfilter = new IntentFilter();
	//   15   38:new             #211 <Class IntentFilter>
	//   16   41:dup             
	//   17   42:invokespecial   #212 <Method void IntentFilter()>
	//   18   45:astore_1        
		intentfilter.addAction("com.huawei.health.update_log_config_area");
	//   19   46:aload_1         
	//   20   47:ldc1            #214 <String "com.huawei.health.update_log_config_area">
	//   21   49:invokevirtual   #217 <Method void IntentFilter.addAction(String)>
		intentfilter.addAction("com.huawei.health.update_log_config_user");
	//   22   52:aload_1         
	//   23   53:ldc1            #219 <String "com.huawei.health.update_log_config_user">
	//   24   55:invokevirtual   #217 <Method void IntentFilter.addAction(String)>
		context.registerReceiver(z, intentfilter, "com.huawei.health.INTERNAL_PERMISSION", ((Handler) (null)));
	//   25   58:aload_0         
	//   26   59:getstatic       #163 <Field BroadcastReceiver z>
	//   27   62:aload_1         
	//   28   63:ldc1            #221 <String "com.huawei.health.INTERNAL_PERMISSION">
	//   29   65:aconst_null     
	//   30   66:invokevirtual   #227 <Method Intent Context.registerReceiver(BroadcastReceiver, IntentFilter, String, Handler)>
	//   31   69:pop             
	//   32   70:return          
	}

	private static void a(Context context, String s1)
	{
		Object obj = r;
	//    0    0:getstatic       #107 <Field Object r>
	//    1    3:astore_3        
		obj;
	//    2    4:aload_3         
		JVM INSTR monitorenter ;
	//    3    5:monitorenter    
		boolean flag;
		flag = dht.a(context);
	//    4    6:aload_0         
	//    5    7:invokestatic    #233 <Method boolean dht.a(Context)>
	//    6   10:istore_2        
		t.a = flag;
	//    7   11:getstatic       #112 <Field dhu$d t>
	//    8   14:iload_2         
	//    9   15:putfield        #235 <Field boolean dhu$d.a>
		obj;
	//   10   18:aload_3         
		JVM INSTR monitorexit ;
	//   11   19:monitorexit     
		  goto _L1
	//*  12   20:goto            28
		context;
	//   13   23:astore_0        
	//*  14   24:aload_3         
		throw context;
	//   15   25:monitorexit     
	//   16   26:aload_0         
	//   17   27:athrow          
_L1:
		Log.i("LogUtil_LogConfig", (new StringBuilder()).append("updateOverseaSwitchByDB:").append(flag).append(" for cause:").append(s1).toString());
	//   18   28:ldc1            #182 <String "LogUtil_LogConfig">
	//   19   30:new             #67  <Class StringBuilder>
	//   20   33:dup             
	//   21   34:invokespecial   #70  <Method void StringBuilder()>
	//   22   37:ldc1            #237 <String "updateOverseaSwitchByDB:">
	//   23   39:invokevirtual   #74  <Method StringBuilder StringBuilder.append(String)>
	//   24   42:iload_2         
	//   25   43:invokevirtual   #240 <Method StringBuilder StringBuilder.append(boolean)>
	//   26   46:ldc1            #242 <String " for cause:">
	//   27   48:invokevirtual   #74  <Method StringBuilder StringBuilder.append(String)>
	//   28   51:aload_1         
	//   29   52:invokevirtual   #74  <Method StringBuilder StringBuilder.append(String)>
	//   30   55:invokevirtual   #79  <Method String StringBuilder.toString()>
	//   31   58:invokestatic    #209 <Method int Log.i(String, String)>
	//   32   61:pop             
		return;
	//   33   62:return          
	}

	public static boolean a(String s1)
	{
		if("HWWEAR".equals(((Object) (s1))))
	//*   0    0:ldc1            #245 <String "HWWEAR">
	//*   1    2:aload_0         
	//*   2    3:invokevirtual   #250 <Method boolean String.equals(Object)>
	//*   3    6:ifeq            11
			return false;
	//    4    9:iconst_0        
	//    5   10:ireturn         
		if(x)
	//*   6   11:getstatic       #118 <Field boolean x>
	//*   7   14:ifeq            22
			return k(s1);
	//    8   17:aload_0         
	//    9   18:invokestatic    #252 <Method boolean k(String)>
	//   10   21:ireturn         
		else
			return true;
	//   11   22:iconst_1        
	//   12   23:ireturn         
	}

	private static boolean a(List list, String s1)
	{
		if(s1 == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       6
			return false;
	//    2    4:iconst_0        
	//    3    5:ireturn         
		int j = s1.indexOf('_');
	//    4    6:aload_1         
	//    5    7:bipush          95
	//    6    9:invokevirtual   #257 <Method int String.indexOf(int)>
	//    7   12:istore_2        
		if(j <= 0)
	//*   8   13:iload_2         
	//*   9   14:ifgt            19
			return false;
	//   10   17:iconst_0        
	//   11   18:ireturn         
		else
			return list.contains(((Object) (s1.substring(0, j))));
	//   12   19:aload_0         
	//   13   20:aload_1         
	//   14   21:iconst_0        
	//   15   22:iload_2         
	//   16   23:invokevirtual   #261 <Method String String.substring(int, int)>
	//   17   26:invokeinterface #264 <Method boolean List.contains(Object)>
	//   18   31:ireturn         
	}

	public static void b(Context context)
	{
		if(1 != l)
	//*   0    0:iconst_1        
	//*   1    1:getstatic       #98  <Field int l>
	//*   2    4:icmpeq          17
		{
			Log.i("LogUtil_LogConfig", "confirmAccountChangedAsync-not release,no effect,return");
	//    3    7:ldc1            #182 <String "LogUtil_LogConfig">
	//    4    9:ldc2            #268 <String "confirmAccountChangedAsync-not release,no effect,return">
	//    5   12:invokestatic    #209 <Method int Log.i(String, String)>
	//    6   15:pop             
			return;
	//    7   16:return          
		} else
		{
			Log.i("LogUtil_LogConfig", "confirmAccountChangedAsync");
	//    8   17:ldc1            #182 <String "LogUtil_LogConfig">
	//    9   19:ldc2            #270 <String "confirmAccountChangedAsync">
	//   10   22:invokestatic    #209 <Method int Log.i(String, String)>
	//   11   25:pop             
			dhy.e().post(new Runnable(context) {

				public void run()
				{
					dhu.d(a);
				//    0    0:aload_0         
				//    1    1:getfield        #16  <Field Context a>
				//    2    4:invokestatic    #24  <Method void dhu.d(Context)>
				//    3    7:return          
				}

				final Context a;

			
			{
				a = context;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field Context a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
			}
);
	//   12   26:invokestatic    #275 <Method Handler dhy.e()>
	//   13   29:new             #10  <Class dhu$4>
	//   14   32:dup             
	//   15   33:aload_0         
	//   16   34:invokespecial   #277 <Method void dhu$4(Context)>
	//   17   37:invokevirtual   #283 <Method boolean Handler.post(Runnable)>
	//   18   40:pop             
			return;
	//   19   41:return          
		}
	}

	public static boolean b()
	{
		return l == 5;
	//    0    0:getstatic       #98  <Field int l>
	//    1    3:iconst_5        
	//    2    4:icmpne          9
	//    3    7:iconst_1        
	//    4    8:ireturn         
	//    5    9:iconst_0        
	//    6   10:ireturn         
	}

	public static int c()
	{
		int j = l;
	//    0    0:getstatic       #98  <Field int l>
	//    1    3:istore_0        
		Log.d("LogUtil_LogConfig", (new StringBuilder()).append("obtainSavePath(): path = ").append(j).toString());
	//    2    4:ldc1            #182 <String "LogUtil_LogConfig">
	//    3    6:new             #67  <Class StringBuilder>
	//    4    9:dup             
	//    5   10:invokespecial   #70  <Method void StringBuilder()>
	//    6   13:ldc1            #184 <String "obtainSavePath(): path = ">
	//    7   15:invokevirtual   #74  <Method StringBuilder StringBuilder.append(String)>
	//    8   18:iload_0         
	//    9   19:invokevirtual   #207 <Method StringBuilder StringBuilder.append(int)>
	//   10   22:invokevirtual   #79  <Method String StringBuilder.toString()>
	//   11   25:invokestatic    #189 <Method int Log.d(String, String)>
	//   12   28:pop             
		return j;
	//   13   29:iload_0         
	//   14   30:ireturn         
	}

	public static void c(Context context)
	{
		if(1 != l)
	//*   0    0:iconst_1        
	//*   1    1:getstatic       #98  <Field int l>
	//*   2    4:icmpeq          17
		{
			Log.i("LogUtil_LogConfig", "confirmOverseaGlobalRefresh-not release,no effect,return");
	//    3    7:ldc1            #182 <String "LogUtil_LogConfig">
	//    4    9:ldc2            #286 <String "confirmOverseaGlobalRefresh-not release,no effect,return">
	//    5   12:invokestatic    #209 <Method int Log.i(String, String)>
	//    6   15:pop             
			return;
	//    7   16:return          
		} else
		{
			Log.i("LogUtil_LogConfig", "confirmOverseaGlobalRefresh");
	//    8   17:ldc1            #182 <String "LogUtil_LogConfig">
	//    9   19:ldc2            #288 <String "confirmOverseaGlobalRefresh">
	//   10   22:invokestatic    #209 <Method int Log.i(String, String)>
	//   11   25:pop             
			d(context, "com.huawei.health.update_log_config_area");
	//   12   26:aload_0         
	//   13   27:ldc1            #214 <String "com.huawei.health.update_log_config_area">
	//   14   29:invokestatic    #290 <Method void d(Context, String)>
			return;
	//   15   32:return          
		}
	}

	public static dhu d(String s1)
	{
		for(Iterator iterator = o.iterator(); iterator.hasNext();)
	//*   0    0:getstatic       #94  <Field List o>
	//*   1    3:invokeinterface #295 <Method Iterator List.iterator()>
	//*   2    8:astore_1        
	//*   3    9:aload_1         
	//*   4   10:invokeinterface #300 <Method boolean Iterator.hasNext()>
	//*   5   15:ifeq            69
		{
			dhu dhu1 = (dhu)iterator.next();
	//    6   18:aload_1         
	//    7   19:invokeinterface #304 <Method Object Iterator.next()>
	//    8   24:checkcast       #2   <Class dhu>
	//    9   27:astore_2        
			if(TextUtils.equals(((CharSequence) ((new StringBuilder()).append(dio.d()).append("_").append(s1).toString())), ((CharSequence) (dhu1.m()))))
	//*  10   28:new             #67  <Class StringBuilder>
	//*  11   31:dup             
	//*  12   32:invokespecial   #70  <Method void StringBuilder()>
	//*  13   35:invokestatic    #196 <Method String dio.d()>
	//*  14   38:invokevirtual   #74  <Method StringBuilder StringBuilder.append(String)>
	//*  15   41:ldc2            #306 <String "_">
	//*  16   44:invokevirtual   #74  <Method StringBuilder StringBuilder.append(String)>
	//*  17   47:aload_0         
	//*  18   48:invokevirtual   #74  <Method StringBuilder StringBuilder.append(String)>
	//*  19   51:invokevirtual   #79  <Method String StringBuilder.toString()>
	//*  20   54:aload_2         
	//*  21   55:invokevirtual   #308 <Method String m()>
	//*  22   58:invokestatic    #313 <Method boolean TextUtils.equals(CharSequence, CharSequence)>
	//*  23   61:ifeq            66
				return dhu1;
	//   24   64:aload_2         
	//   25   65:areturn         
		}

	//*  26   66:goto            9
		return m;
	//   27   69:getstatic       #96  <Field dhu m>
	//   28   72:areturn         
	}

	static void d(Context context)
	{
		h(context);
	//    0    0:aload_0         
	//    1    1:invokestatic    #315 <Method void h(Context)>
	//    2    4:return          
	}

	private static void d(Context context, String s1)
	{
		s1 = ((String) (new Intent(s1)));
	//    0    0:new             #317 <Class Intent>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:invokespecial   #319 <Method void Intent(String)>
	//    4    8:astore_1        
		((Intent) (s1)).setPackage("com.huawei.health");
	//    5    9:aload_1         
	//    6   10:ldc1            #123 <String "com.huawei.health">
	//    7   12:invokevirtual   #323 <Method Intent Intent.setPackage(String)>
	//    8   15:pop             
		context.sendBroadcast(((Intent) (s1)), "com.huawei.health.INTERNAL_PERMISSION");
	//    9   16:aload_0         
	//   10   17:aload_1         
	//   11   18:ldc1            #221 <String "com.huawei.health.INTERNAL_PERMISSION">
	//   12   20:invokevirtual   #327 <Method void Context.sendBroadcast(Intent, String)>
	//   13   23:return          
	}

	public static boolean d()
	{
		return l == 1;
	//    0    0:getstatic       #98  <Field int l>
	//    1    3:iconst_1        
	//    2    4:icmpne          9
	//    3    7:iconst_1        
	//    4    8:ireturn         
	//    5    9:iconst_0        
	//    6   10:ireturn         
	}

	public static void e(Context context)
	{
		if(context == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       14
		{
			Log.w("LogUtil_LogConfig", "init context null,init failed,return");
	//    2    4:ldc1            #182 <String "LogUtil_LogConfig">
	//    3    6:ldc2            #329 <String "init context null,init failed,return">
	//    4    9:invokestatic    #331 <Method int Log.w(String, String)>
	//    5   12:pop             
			return;
	//    6   13:return          
		} else
		{
			a(context);
	//    7   14:aload_0         
	//    8   15:invokestatic    #333 <Method void a(Context)>
			a(context, "init log config");
	//    9   18:aload_0         
	//   10   19:ldc2            #335 <String "init log config">
	//   11   22:invokestatic    #337 <Method void a(Context, String)>
			return;
	//   12   25:return          
		}
	}

	static void e(Context context, String s1)
	{
		a(context, s1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #337 <Method void a(Context, String)>
	//    3    5:return          
	}

	public static void e(String s1)
	{
		if("release".equals(((Object) (s1))))
	//*   0    0:ldc2            #339 <String "release">
	//*   1    3:aload_0         
	//*   2    4:invokevirtual   #250 <Method boolean String.equals(Object)>
	//*   3    7:ifeq            17
			l = 1;
	//    4   10:iconst_1        
	//    5   11:putstatic       #98  <Field int l>
		else
	//*   6   14:goto            106
		if("debug".equals(((Object) (s1))))
	//*   7   17:ldc2            #341 <String "debug">
	//*   8   20:aload_0         
	//*   9   21:invokevirtual   #250 <Method boolean String.equals(Object)>
	//*  10   24:ifeq            34
			l = 2;
	//   11   27:iconst_2        
	//   12   28:putstatic       #98  <Field int l>
		else
	//*  13   31:goto            106
		if("beta".equals(((Object) (s1))))
	//*  14   34:ldc2            #343 <String "beta">
	//*  15   37:aload_0         
	//*  16   38:invokevirtual   #250 <Method boolean String.equals(Object)>
	//*  17   41:ifeq            51
			l = 3;
	//   18   44:iconst_3        
	//   19   45:putstatic       #98  <Field int l>
		else
	//*  20   48:goto            106
		if("Test".equals(((Object) (s1))))
	//*  21   51:ldc2            #345 <String "Test">
	//*  22   54:aload_0         
	//*  23   55:invokevirtual   #250 <Method boolean String.equals(Object)>
	//*  24   58:ifeq            68
			l = 4;
	//   25   61:iconst_4        
	//   26   62:putstatic       #98  <Field int l>
		else
	//*  27   65:goto            106
		if("BetaPay".equals(((Object) (s1))))
	//*  28   68:ldc2            #347 <String "BetaPay">
	//*  29   71:aload_0         
	//*  30   72:invokevirtual   #250 <Method boolean String.equals(Object)>
	//*  31   75:ifeq            85
			l = 3;
	//   32   78:iconst_3        
	//   33   79:putstatic       #98  <Field int l>
		else
	//*  34   82:goto            106
		if("StoreDemo".equalsIgnoreCase(s1))
	//*  35   85:ldc2            #349 <String "StoreDemo">
	//*  36   88:aload_0         
	//*  37   89:invokevirtual   #352 <Method boolean String.equalsIgnoreCase(String)>
	//*  38   92:ifeq            102
			l = 5;
	//   39   95:iconst_5        
	//   40   96:putstatic       #98  <Field int l>
		else
	//*  41   99:goto            106
			l = 1;
	//   42  102:iconst_1        
	//   43  103:putstatic       #98  <Field int l>
		Log.i("LogUtil_LogConfig", (new StringBuilder()).append("modifyBuildType(): sBuildType = ").append(l).toString());
	//   44  106:ldc1            #182 <String "LogUtil_LogConfig">
	//   45  108:new             #67  <Class StringBuilder>
	//   46  111:dup             
	//   47  112:invokespecial   #70  <Method void StringBuilder()>
	//   48  115:ldc2            #354 <String "modifyBuildType(): sBuildType = ">
	//   49  118:invokevirtual   #74  <Method StringBuilder StringBuilder.append(String)>
	//   50  121:getstatic       #98  <Field int l>
	//   51  124:invokevirtual   #207 <Method StringBuilder StringBuilder.append(int)>
	//   52  127:invokevirtual   #79  <Method String StringBuilder.toString()>
	//   53  130:invokestatic    #209 <Method int Log.i(String, String)>
	//   54  133:pop             
	//   55  134:return          
	}

	public static void e(b b1)
	{
		w.add(((Object) (b1)));
	//    0    0:getstatic       #120 <Field List w>
	//    1    3:aload_0         
	//    2    4:invokeinterface #140 <Method boolean List.add(Object)>
	//    3    9:pop             
	//    4   10:return          
	}

	public static boolean e()
	{
		return l == 3;
	//    0    0:getstatic       #98  <Field int l>
	//    1    3:iconst_3        
	//    2    4:icmpne          9
	//    3    7:iconst_1        
	//    4    8:ireturn         
	//    5    9:iconst_0        
	//    6   10:ireturn         
	}

	public static dhu f()
	{
label0:
		{
			if(!d() && !e())
				break label0;
	//    0    0:invokestatic    #358 <Method boolean d()>
	//    1    3:ifne            12
	//    2    6:invokestatic    #360 <Method boolean e()>
	//    3    9:ifeq            58
			Iterator iterator = o.iterator();
	//    4   12:getstatic       #94  <Field List o>
	//    5   15:invokeinterface #295 <Method Iterator List.iterator()>
	//    6   20:astore_0        
			dhu dhu1;
			do
			{
				if(!iterator.hasNext())
					break label0;
	//    7   21:aload_0         
	//    8   22:invokeinterface #300 <Method boolean Iterator.hasNext()>
	//    9   27:ifeq            58
				dhu1 = (dhu)iterator.next();
	//   10   30:aload_0         
	//   11   31:invokeinterface #304 <Method Object Iterator.next()>
	//   12   36:checkcast       #2   <Class dhu>
	//   13   39:astore_1        
			} while(!TextUtils.equals(((CharSequence) (dio.d())), ((CharSequence) (dhu1.m()))));
	//   14   40:invokestatic    #196 <Method String dio.d()>
	//   15   43:aload_1         
	//   16   44:invokevirtual   #308 <Method String m()>
	//   17   47:invokestatic    #313 <Method boolean TextUtils.equals(CharSequence, CharSequence)>
	//   18   50:ifeq            55
			return dhu1;
	//   19   53:aload_1         
	//   20   54:areturn         
		}
	//*  21   55:goto            21
		return m;
	//   22   58:getstatic       #96  <Field dhu m>
	//   23   61:areturn         
	}

	public static String g()
	{
		String s1;
		if(1 == l)
	//*   0    0:iconst_1        
	//*   1    1:getstatic       #98  <Field int l>
	//*   2    4:icmpne          14
			s1 = "/data/data/com.huawei.health/files/com.huawei.health/";
	//    3    7:ldc2            #362 <String "/data/data/com.huawei.health/files/com.huawei.health/">
	//    4   10:astore_0        
		else
	//*   5   11:goto            18
			s1 = b;
	//    6   14:getstatic       #85  <Field String b>
	//    7   17:astore_0        
		Log.d("LogUtil_LogConfig", (new StringBuilder()).append("obtainSavePathDetail(): path = ").append(s1).toString());
	//    8   18:ldc1            #182 <String "LogUtil_LogConfig">
	//    9   20:new             #67  <Class StringBuilder>
	//   10   23:dup             
	//   11   24:invokespecial   #70  <Method void StringBuilder()>
	//   12   27:ldc2            #364 <String "obtainSavePathDetail(): path = ">
	//   13   30:invokevirtual   #74  <Method StringBuilder StringBuilder.append(String)>
	//   14   33:aload_0         
	//   15   34:invokevirtual   #74  <Method StringBuilder StringBuilder.append(String)>
	//   16   37:invokevirtual   #79  <Method String StringBuilder.toString()>
	//   17   40:invokestatic    #189 <Method int Log.d(String, String)>
	//   18   43:pop             
		return s1;
	//   19   44:aload_0         
	//   20   45:areturn         
	}

	public static File h()
	{
		File file = new File(g());
	//    0    0:new             #59  <Class File>
	//    1    3:dup             
	//    2    4:invokestatic    #366 <Method String g()>
	//    3    7:invokespecial   #367 <Method void File(String)>
	//    4   10:astore_0        
		if(!file.exists() && !file.mkdirs())
	//*   5   11:aload_0         
	//*   6   12:invokevirtual   #370 <Method boolean File.exists()>
	//*   7   15:ifne            36
	//*   8   18:aload_0         
	//*   9   19:invokevirtual   #373 <Method boolean File.mkdirs()>
	//*  10   22:ifne            36
		{
			Log.w("LogUtil_LogConfig", "obtainSaveFileDetail,create log directory failed");
	//   11   25:ldc1            #182 <String "LogUtil_LogConfig">
	//   12   27:ldc2            #375 <String "obtainSaveFileDetail,create log directory failed">
	//   13   30:invokestatic    #331 <Method int Log.w(String, String)>
	//   14   33:pop             
			return null;
	//   15   34:aconst_null     
	//   16   35:areturn         
		} else
		{
			return file;
	//   17   36:aload_0         
	//   18   37:areturn         
		}
	}

	private static void h(Context context)
	{
		Log.i("LogUtil_LogConfig", "confirmAccountChanged");
	//    0    0:ldc1            #182 <String "LogUtil_LogConfig">
	//    1    2:ldc2            #377 <String "confirmAccountChanged">
	//    2    5:invokestatic    #209 <Method int Log.i(String, String)>
	//    3    8:pop             
		dhw.d d1 = dhw.a();
	//    4    9:invokestatic    #382 <Method dhw$d dhw.a()>
	//    5   12:astore_1        
		if(d1 == null)
	//*   6   13:aload_1         
	//*   7   14:ifnonnull       27
		{
			Log.w("LogUtil_LogConfig", "confirmAccountChangedLocked,globalLock null,return");
	//    8   17:ldc1            #182 <String "LogUtil_LogConfig">
	//    9   19:ldc2            #384 <String "confirmAccountChangedLocked,globalLock null,return">
	//   10   22:invokestatic    #331 <Method int Log.w(String, String)>
	//   11   25:pop             
			return;
	//   12   26:return          
		} else
		{
			d1.b();
	//   13   27:aload_1         
	//   14   28:invokevirtual   #388 <Method void dhw$d.b()>
			d(context, "com.huawei.health.update_log_config_user");
	//   15   31:aload_0         
	//   16   32:ldc1            #219 <String "com.huawei.health.update_log_config_user">
	//   17   34:invokestatic    #290 <Method void d(Context, String)>
			d1.d();
	//   18   37:aload_1         
	//   19   38:invokevirtual   #390 <Method void dhw$d.d()>
			Log.i("LogUtil_LogConfig", "confirmAccountChanged end in main process,memory clear in broadcast receiver");
	//   20   41:ldc1            #182 <String "LogUtil_LogConfig">
	//   21   43:ldc2            #392 <String "confirmAccountChanged end in main process,memory clear in broadcast receiver">
	//   22   46:invokestatic    #209 <Method int Log.i(String, String)>
	//   23   49:pop             
			return;
	//   24   50:return          
		}
	}

	public static boolean h(String s1)
	{
		return a(s, s1);
	//    0    0:getstatic       #114 <Field List s>
	//    1    3:aload_0         
	//    2    4:invokestatic    #394 <Method boolean a(List, String)>
	//    3    7:ireturn         
	}

	public static String i()
	{
		return "/data/data/com.huawei.health/files/com.huawei.health/";
	//    0    0:ldc2            #362 <String "/data/data/com.huawei.health/files/com.huawei.health/">
	//    1    3:areturn         
	}

	public static String k()
	{
		return b;
	//    0    0:getstatic       #85  <Field String b>
	//    1    3:areturn         
	}

	public static boolean k(String s1)
	{
		Object obj = r;
	//    0    0:getstatic       #107 <Field Object r>
	//    1    3:astore_2        
		obj;
	//    2    4:aload_2         
		JVM INSTR monitorenter ;
	//    3    5:monitorenter    
		boolean flag = t.a;
	//    4    6:getstatic       #112 <Field dhu$d t>
	//    5    9:getfield        #235 <Field boolean dhu$d.a>
	//    6   12:istore_1        
		obj;
	//    7   13:aload_2         
		JVM INSTR monitorexit ;
	//    8   14:monitorexit     
		  goto _L1
	//*   9   15:goto            23
		s1;
	//   10   18:astore_0        
	//*  11   19:aload_2         
		throw s1;
	//   12   20:monitorexit     
	//   13   21:aload_0         
	//   14   22:athrow          
_L1:
		if(!flag)
	//*  15   23:iload_1         
	//*  16   24:ifne            29
			return true;
	//   17   27:iconst_1        
	//   18   28:ireturn         
		else
			return a(u, s1);
	//   19   29:getstatic       #116 <Field List u>
	//   20   32:aload_0         
	//   21   33:invokestatic    #394 <Method boolean a(List, String)>
	//   22   36:ireturn         
	}

	static void q()
	{
		v();
	//    0    0:invokestatic    #397 <Method void v()>
	//    1    3:return          
	}

	public static void s()
	{
		x = true;
	//    0    0:iconst_1        
	//    1    1:putstatic       #118 <Field boolean x>
	//    2    4:return          
	}

	static void t()
	{
		w();
	//    0    0:invokestatic    #399 <Method void w()>
	//    1    3:return          
	}

	public static void u()
	{
		x = false;
	//    0    0:iconst_0        
	//    1    1:putstatic       #118 <Field boolean x>
	//    2    4:return          
	}

	private static void v()
	{
		for(Iterator iterator = w.iterator(); iterator.hasNext(); ((b)iterator.next()).e());
	//    0    0:getstatic       #120 <Field List w>
	//    1    3:invokeinterface #295 <Method Iterator List.iterator()>
	//    2    8:astore_0        
	//    3    9:aload_0         
	//    4   10:invokeinterface #300 <Method boolean Iterator.hasNext()>
	//    5   15:ifeq            35
	//    6   18:aload_0         
	//    7   19:invokeinterface #304 <Method Object Iterator.next()>
	//    8   24:checkcast       #12  <Class dhu$b>
	//    9   27:invokeinterface #401 <Method void dhu$b.e()>
	//*  10   32:goto            9
	//   11   35:return          
	}

	private static void w()
	{
		dhy.e().post(new Runnable() {

			public void run()
			{
				Log.i("LogUtil_LogConfig", "clearNativeMemoryAndFilesLogAsync memory");
			//    0    0:ldc1            #18  <String "LogUtil_LogConfig">
			//    1    2:ldc1            #20  <String "clearNativeMemoryAndFilesLogAsync memory">
			//    2    4:invokestatic    #26  <Method int Log.i(String, String)>
			//    3    7:pop             
				dhu.q();
			//    4    8:invokestatic    #29  <Method void dhu.q()>
			//    5   11:return          
			}

		}
);
	//    0    0:invokestatic    #275 <Method Handler dhy.e()>
	//    1    3:new             #6   <Class dhu$2>
	//    2    6:dup             
	//    3    7:invokespecial   #402 <Method void dhu$2()>
	//    4   10:invokevirtual   #283 <Method boolean Handler.post(Runnable)>
	//    5   13:pop             
	//    6   14:return          
	}

	private void x()
	{
		if(TextUtils.isEmpty(((CharSequence) (i))) && (1 == c() || 3 == c()))
	//*   0    0:aload_0         
	//*   1    1:getfield        #168 <Field String i>
	//*   2    4:invokestatic    #406 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*   3    7:ifeq            93
	//*   4   10:iconst_1        
	//*   5   11:invokestatic    #408 <Method int c()>
	//*   6   14:icmpeq          24
	//*   7   17:iconst_3        
	//*   8   18:invokestatic    #408 <Method int c()>
	//*   9   21:icmpne          93
		{
			File file = new File((new StringBuilder()).append(k).append("log.4").toString());
	//   10   24:new             #59  <Class File>
	//   11   27:dup             
	//   12   28:new             #67  <Class StringBuilder>
	//   13   31:dup             
	//   14   32:invokespecial   #70  <Method void StringBuilder()>
	//   15   35:aload_0         
	//   16   36:getfield        #176 <Field String k>
	//   17   39:invokevirtual   #74  <Method StringBuilder StringBuilder.append(String)>
	//   18   42:ldc2            #410 <String "log.4">
	//   19   45:invokevirtual   #74  <Method StringBuilder StringBuilder.append(String)>
	//   20   48:invokevirtual   #79  <Method String StringBuilder.toString()>
	//   21   51:invokespecial   #367 <Method void File(String)>
	//   22   54:astore_2        
			if(file.exists())
	//*  23   55:aload_2         
	//*  24   56:invokevirtual   #370 <Method boolean File.exists()>
	//*  25   59:ifeq            93
			{
				boolean flag = file.delete();
	//   26   62:aload_2         
	//   27   63:invokevirtual   #413 <Method boolean File.delete()>
	//   28   66:istore_1        
				Log.d("LogUtil_LogConfig", (new StringBuilder()).append("deleteSuc = ").append(flag).toString());
	//   29   67:ldc1            #182 <String "LogUtil_LogConfig">
	//   30   69:new             #67  <Class StringBuilder>
	//   31   72:dup             
	//   32   73:invokespecial   #70  <Method void StringBuilder()>
	//   33   76:ldc2            #415 <String "deleteSuc = ">
	//   34   79:invokevirtual   #74  <Method StringBuilder StringBuilder.append(String)>
	//   35   82:iload_1         
	//   36   83:invokevirtual   #240 <Method StringBuilder StringBuilder.append(boolean)>
	//   37   86:invokevirtual   #79  <Method String StringBuilder.toString()>
	//   38   89:invokestatic    #189 <Method int Log.d(String, String)>
	//   39   92:pop             
			}
		}
	//   40   93:return          
	}

	private static void y()
	{
		u.add("Login");
	//    0    0:getstatic       #116 <Field List u>
	//    1    3:ldc2            #417 <String "Login">
	//    2    6:invokeinterface #140 <Method boolean List.add(Object)>
	//    3   11:pop             
		u.add("Track");
	//    4   12:getstatic       #116 <Field List u>
	//    5   15:ldc2            #419 <String "Track">
	//    6   18:invokeinterface #140 <Method boolean List.add(Object)>
	//    7   23:pop             
		u.add("HiH");
	//    8   24:getstatic       #116 <Field List u>
	//    9   27:ldc2            #421 <String "HiH">
	//   10   30:invokeinterface #140 <Method boolean List.add(Object)>
	//   11   35:pop             
		u.add("PluginDevice");
	//   12   36:getstatic       #116 <Field List u>
	//   13   39:ldc2            #423 <String "PluginDevice">
	//   14   42:invokeinterface #140 <Method boolean List.add(Object)>
	//   15   47:pop             
		u.add("HealthAdapter");
	//   16   48:getstatic       #116 <Field List u>
	//   17   51:ldc2            #425 <String "HealthAdapter">
	//   18   54:invokeinterface #140 <Method boolean List.add(Object)>
	//   19   59:pop             
		u.add("HWhealthLinkage");
	//   20   60:getstatic       #116 <Field List u>
	//   21   63:ldc2            #427 <String "HWhealthLinkage">
	//   22   66:invokeinterface #140 <Method boolean List.add(Object)>
	//   23   71:pop             
		u.add("SCUI");
	//   24   72:getstatic       #116 <Field List u>
	//   25   75:ldc2            #429 <String "SCUI">
	//   26   78:invokeinterface #140 <Method boolean List.add(Object)>
	//   27   83:pop             
		u.add("UIHLH");
	//   28   84:getstatic       #116 <Field List u>
	//   29   87:ldc2            #431 <String "UIHLH">
	//   30   90:invokeinterface #140 <Method boolean List.add(Object)>
	//   31   95:pop             
		u.add("UIME");
	//   32   96:getstatic       #116 <Field List u>
	//   33   99:ldc2            #433 <String "UIME">
	//   34  102:invokeinterface #140 <Method boolean List.add(Object)>
	//   35  107:pop             
		u.add("PLGACHIEVE");
	//   36  108:getstatic       #116 <Field List u>
	//   37  111:ldc2            #435 <String "PLGACHIEVE">
	//   38  114:invokeinterface #140 <Method boolean List.add(Object)>
	//   39  119:pop             
		u.add("UIDV");
	//   40  120:getstatic       #116 <Field List u>
	//   41  123:ldc2            #437 <String "UIDV">
	//   42  126:invokeinterface #140 <Method boolean List.add(Object)>
	//   43  131:pop             
		u.add("PLGLOGIN");
	//   44  132:getstatic       #116 <Field List u>
	//   45  135:ldc2            #439 <String "PLGLOGIN">
	//   46  138:invokeinterface #140 <Method boolean List.add(Object)>
	//   47  143:pop             
		u.add("Opera");
	//   48  144:getstatic       #116 <Field List u>
	//   49  147:ldc2            #441 <String "Opera">
	//   50  150:invokeinterface #140 <Method boolean List.add(Object)>
	//   51  155:pop             
		u.add("Share");
	//   52  156:getstatic       #116 <Field List u>
	//   53  159:ldc2            #443 <String "Share">
	//   54  162:invokeinterface #140 <Method boolean List.add(Object)>
	//   55  167:pop             
		u.add("Suggestion");
	//   56  168:getstatic       #116 <Field List u>
	//   57  171:ldc2            #445 <String "Suggestion">
	//   58  174:invokeinterface #140 <Method boolean List.add(Object)>
	//   59  179:pop             
		u.add("BTSDK");
	//   60  180:getstatic       #116 <Field List u>
	//   61  183:ldc2            #447 <String "BTSDK">
	//   62  186:invokeinterface #140 <Method boolean List.add(Object)>
	//   63  191:pop             
		u.add("DMS");
	//   64  192:getstatic       #116 <Field List u>
	//   65  195:ldc2            #449 <String "DMS">
	//   66  198:invokeinterface #140 <Method boolean List.add(Object)>
	//   67  203:pop             
		u.add("Fitness");
	//   68  204:getstatic       #116 <Field List u>
	//   69  207:ldc2            #451 <String "Fitness">
	//   70  210:invokeinterface #140 <Method boolean List.add(Object)>
	//   71  215:pop             
		u.add("KIDWATCH");
	//   72  216:getstatic       #116 <Field List u>
	//   73  219:ldc2            #453 <String "KIDWATCH">
	//   74  222:invokeinterface #140 <Method boolean List.add(Object)>
	//   75  227:pop             
		u.add("Notfiy");
	//   76  228:getstatic       #116 <Field List u>
	//   77  231:ldc2            #455 <String "Notfiy">
	//   78  234:invokeinterface #140 <Method boolean List.add(Object)>
	//   79  239:pop             
		u.add("OTA");
	//   80  240:getstatic       #116 <Field List u>
	//   81  243:ldc2            #457 <String "OTA">
	//   82  246:invokeinterface #140 <Method boolean List.add(Object)>
	//   83  251:pop             
		u.add("SMART");
	//   84  252:getstatic       #116 <Field List u>
	//   85  255:ldc2            #459 <String "SMART">
	//   86  258:invokeinterface #140 <Method boolean List.add(Object)>
	//   87  263:pop             
		u.add("DEVMGR");
	//   88  264:getstatic       #116 <Field List u>
	//   89  267:ldc2            #461 <String "DEVMGR">
	//   90  270:invokeinterface #140 <Method boolean List.add(Object)>
	//   91  275:pop             
		s.add("AW70");
	//   92  276:getstatic       #114 <Field List s>
	//   93  279:ldc2            #463 <String "AW70">
	//   94  282:invokeinterface #140 <Method boolean List.add(Object)>
	//   95  287:pop             
		u.add("CORESLEEPMISSON");
	//   96  288:getstatic       #116 <Field List u>
	//   97  291:ldc2            #465 <String "CORESLEEPMISSON">
	//   98  294:invokeinterface #140 <Method boolean List.add(Object)>
	//   99  299:pop             
	//  100  300:return          
	}

	private static void z()
	{
		s.add("Login");
	//    0    0:getstatic       #114 <Field List s>
	//    1    3:ldc2            #417 <String "Login">
	//    2    6:invokeinterface #140 <Method boolean List.add(Object)>
	//    3   11:pop             
		s.add("Track");
	//    4   12:getstatic       #114 <Field List s>
	//    5   15:ldc2            #419 <String "Track">
	//    6   18:invokeinterface #140 <Method boolean List.add(Object)>
	//    7   23:pop             
		s.add("Step");
	//    8   24:getstatic       #114 <Field List s>
	//    9   27:ldc2            #467 <String "Step">
	//   10   30:invokeinterface #140 <Method boolean List.add(Object)>
	//   11   35:pop             
		s.add("HiH");
	//   12   36:getstatic       #114 <Field List s>
	//   13   39:ldc2            #421 <String "HiH">
	//   14   42:invokeinterface #140 <Method boolean List.add(Object)>
	//   15   47:pop             
		s.add("PluginDevice");
	//   16   48:getstatic       #114 <Field List s>
	//   17   51:ldc2            #423 <String "PluginDevice">
	//   18   54:invokeinterface #140 <Method boolean List.add(Object)>
	//   19   59:pop             
		s.add("HealthAdapter");
	//   20   60:getstatic       #114 <Field List s>
	//   21   63:ldc2            #425 <String "HealthAdapter">
	//   22   66:invokeinterface #140 <Method boolean List.add(Object)>
	//   23   71:pop             
		s.add("HWhealthLinkage");
	//   24   72:getstatic       #114 <Field List s>
	//   25   75:ldc2            #427 <String "HWhealthLinkage">
	//   26   78:invokeinterface #140 <Method boolean List.add(Object)>
	//   27   83:pop             
		s.add("SCUI");
	//   28   84:getstatic       #114 <Field List s>
	//   29   87:ldc2            #429 <String "SCUI">
	//   30   90:invokeinterface #140 <Method boolean List.add(Object)>
	//   31   95:pop             
		s.add("UIHLH");
	//   32   96:getstatic       #114 <Field List s>
	//   33   99:ldc2            #431 <String "UIHLH">
	//   34  102:invokeinterface #140 <Method boolean List.add(Object)>
	//   35  107:pop             
		s.add("UIME");
	//   36  108:getstatic       #114 <Field List s>
	//   37  111:ldc2            #433 <String "UIME">
	//   38  114:invokeinterface #140 <Method boolean List.add(Object)>
	//   39  119:pop             
		s.add("PLGACHIEVE");
	//   40  120:getstatic       #114 <Field List s>
	//   41  123:ldc2            #435 <String "PLGACHIEVE">
	//   42  126:invokeinterface #140 <Method boolean List.add(Object)>
	//   43  131:pop             
		s.add("UIDV");
	//   44  132:getstatic       #114 <Field List s>
	//   45  135:ldc2            #437 <String "UIDV">
	//   46  138:invokeinterface #140 <Method boolean List.add(Object)>
	//   47  143:pop             
		s.add("PLGLOGIN");
	//   48  144:getstatic       #114 <Field List s>
	//   49  147:ldc2            #439 <String "PLGLOGIN">
	//   50  150:invokeinterface #140 <Method boolean List.add(Object)>
	//   51  155:pop             
		s.add("Opera");
	//   52  156:getstatic       #114 <Field List s>
	//   53  159:ldc2            #441 <String "Opera">
	//   54  162:invokeinterface #140 <Method boolean List.add(Object)>
	//   55  167:pop             
		s.add("Share");
	//   56  168:getstatic       #114 <Field List s>
	//   57  171:ldc2            #443 <String "Share">
	//   58  174:invokeinterface #140 <Method boolean List.add(Object)>
	//   59  179:pop             
		s.add("Suggestion");
	//   60  180:getstatic       #114 <Field List s>
	//   61  183:ldc2            #445 <String "Suggestion">
	//   62  186:invokeinterface #140 <Method boolean List.add(Object)>
	//   63  191:pop             
		s.add("TimeEat");
	//   64  192:getstatic       #114 <Field List s>
	//   65  195:ldc2            #469 <String "TimeEat">
	//   66  198:invokeinterface #140 <Method boolean List.add(Object)>
	//   67  203:pop             
		s.add("Group");
	//   68  204:getstatic       #114 <Field List s>
	//   69  207:ldc2            #471 <String "Group">
	//   70  210:invokeinterface #140 <Method boolean List.add(Object)>
	//   71  215:pop             
		s.add("BTSDK");
	//   72  216:getstatic       #114 <Field List s>
	//   73  219:ldc2            #447 <String "BTSDK">
	//   74  222:invokeinterface #140 <Method boolean List.add(Object)>
	//   75  227:pop             
		s.add("DMS");
	//   76  228:getstatic       #114 <Field List s>
	//   77  231:ldc2            #449 <String "DMS">
	//   78  234:invokeinterface #140 <Method boolean List.add(Object)>
	//   79  239:pop             
		s.add("Fitness");
	//   80  240:getstatic       #114 <Field List s>
	//   81  243:ldc2            #451 <String "Fitness">
	//   82  246:invokeinterface #140 <Method boolean List.add(Object)>
	//   83  251:pop             
		s.add("KIDWATCH");
	//   84  252:getstatic       #114 <Field List s>
	//   85  255:ldc2            #453 <String "KIDWATCH">
	//   86  258:invokeinterface #140 <Method boolean List.add(Object)>
	//   87  263:pop             
		s.add("Notfiy");
	//   88  264:getstatic       #114 <Field List s>
	//   89  267:ldc2            #455 <String "Notfiy">
	//   90  270:invokeinterface #140 <Method boolean List.add(Object)>
	//   91  275:pop             
		s.add("OTA");
	//   92  276:getstatic       #114 <Field List s>
	//   93  279:ldc2            #457 <String "OTA">
	//   94  282:invokeinterface #140 <Method boolean List.add(Object)>
	//   95  287:pop             
		s.add("SMART");
	//   96  288:getstatic       #114 <Field List s>
	//   97  291:ldc2            #459 <String "SMART">
	//   98  294:invokeinterface #140 <Method boolean List.add(Object)>
	//   99  299:pop             
		s.add("DEVMGR");
	//  100  300:getstatic       #114 <Field List s>
	//  101  303:ldc2            #461 <String "DEVMGR">
	//  102  306:invokeinterface #140 <Method boolean List.add(Object)>
	//  103  311:pop             
		s.add("AW70");
	//  104  312:getstatic       #114 <Field List s>
	//  105  315:ldc2            #463 <String "AW70">
	//  106  318:invokeinterface #140 <Method boolean List.add(Object)>
	//  107  323:pop             
		s.add("CORESLEEPMISSON");
	//  108  324:getstatic       #114 <Field List s>
	//  109  327:ldc2            #465 <String "CORESLEEPMISSON">
	//  110  330:invokeinterface #140 <Method boolean List.add(Object)>
	//  111  335:pop             
	//  112  336:return          
	}

	public void a(double d1)
	{
		g = d1;
	//    0    0:aload_0         
	//    1    1:dload_1         
	//    2    2:putfield        #174 <Field double g>
	//    3    5:return          
	}

	public void b(double d1)
	{
		p = d1;
	//    0    0:aload_0         
	//    1    1:dload_1         
	//    2    2:putfield        #178 <Field double p>
	//    3    5:return          
	}

	public void b(String s1)
	{
		i = s1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #168 <Field String i>
	//    3    5:return          
	}

	public void c(String s1)
	{
		c = s1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #166 <Field String c>
	//    3    5:return          
	}

	public void c(boolean flag)
	{
		h = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #172 <Field boolean h>
	//    3    5:return          
	}

	public void d(int j)
	{
		f = j;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #170 <Field int f>
	//    3    5:return          
	}

	public double l()
	{
		int j = l;
	//    0    0:getstatic       #98  <Field int l>
	//    1    3:istore_1        
		if(!h)
	//*   2    4:aload_0         
	//*   3    5:getfield        #172 <Field boolean h>
	//*   4    8:ifne            16
			return p;
	//    5   11:aload_0         
	//    6   12:getfield        #178 <Field double p>
	//    7   15:dreturn         
		switch(j)
	//*   8   16:iload_1         
		{
	//*   9   17:tableswitch     1 3: default 44
	//	               1 47
	//	               2 54
	//	               3 61
	//*  10   44:goto            68
		case 1: // '\001'
			j = n;
	//   11   47:getstatic       #101 <Field int n>
	//   12   50:istore_1        
			break;

	//*  13   51:goto            72
		case 2: // '\002'
			j = q;
	//   14   54:getstatic       #104 <Field int q>
	//   15   57:istore_1        
			break;

	//*  16   58:goto            72
		case 3: // '\003'
			j = n;
	//   17   61:getstatic       #101 <Field int n>
	//   18   64:istore_1        
			break;

	//*  19   65:goto            72
		default:
			j = n;
	//   20   68:getstatic       #101 <Field int n>
	//   21   71:istore_1        
			break;
		}
		j = (int)((double)j + g);
	//   22   72:iload_1         
	//   23   73:i2d             
	//   24   74:aload_0         
	//   25   75:getfield        #174 <Field double g>
	//   26   78:dadd            
	//   27   79:d2i             
	//   28   80:istore_1        
		Log.d("LogUtil_LogConfig", (new StringBuilder()).append("acquireMaxLogFileLengthContainsOffset describe: ").append(m()).append(" result:").append(j).toString());
	//   29   81:ldc1            #182 <String "LogUtil_LogConfig">
	//   30   83:new             #67  <Class StringBuilder>
	//   31   86:dup             
	//   32   87:invokespecial   #70  <Method void StringBuilder()>
	//   33   90:ldc2            #474 <String "acquireMaxLogFileLengthContainsOffset describe: ">
	//   34   93:invokevirtual   #74  <Method StringBuilder StringBuilder.append(String)>
	//   35   96:aload_0         
	//   36   97:invokevirtual   #308 <Method String m()>
	//   37  100:invokevirtual   #74  <Method StringBuilder StringBuilder.append(String)>
	//   38  103:ldc2            #476 <String " result:">
	//   39  106:invokevirtual   #74  <Method StringBuilder StringBuilder.append(String)>
	//   40  109:iload_1         
	//   41  110:invokevirtual   #207 <Method StringBuilder StringBuilder.append(int)>
	//   42  113:invokevirtual   #79  <Method String StringBuilder.toString()>
	//   43  116:invokestatic    #189 <Method int Log.d(String, String)>
	//   44  119:pop             
		return (double)j;
	//   45  120:iload_1         
	//   46  121:i2d             
	//   47  122:dreturn         
	}

	public String m()
	{
		if(TextUtils.isEmpty(((CharSequence) (c))))
	//*   0    0:aload_0         
	//*   1    1:getfield        #166 <Field String c>
	//*   2    4:invokestatic    #406 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*   3    7:ifeq            12
			return null;
	//    4   10:aconst_null     
	//    5   11:areturn         
		String s2 = c;
	//    6   12:aload_0         
	//    7   13:getfield        #166 <Field String c>
	//    8   16:astore_2        
		String s1 = s2;
	//    9   17:aload_2         
	//   10   18:astore_1        
		if(!TextUtils.isEmpty(((CharSequence) (i))))
	//*  11   19:aload_0         
	//*  12   20:getfield        #168 <Field String i>
	//*  13   23:invokestatic    #406 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  14   26:ifne            57
			s1 = (new StringBuilder()).append(s2).append("_").append(i).toString();
	//   15   29:new             #67  <Class StringBuilder>
	//   16   32:dup             
	//   17   33:invokespecial   #70  <Method void StringBuilder()>
	//   18   36:aload_2         
	//   19   37:invokevirtual   #74  <Method StringBuilder StringBuilder.append(String)>
	//   20   40:ldc2            #306 <String "_">
	//   21   43:invokevirtual   #74  <Method StringBuilder StringBuilder.append(String)>
	//   22   46:aload_0         
	//   23   47:getfield        #168 <Field String i>
	//   24   50:invokevirtual   #74  <Method StringBuilder StringBuilder.append(String)>
	//   25   53:invokevirtual   #79  <Method String StringBuilder.toString()>
	//   26   56:astore_1        
		return s1;
	//   27   57:aload_1         
	//   28   58:areturn         
	}

	public File n()
	{
		if(k == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #176 <Field String k>
	//*   2    4:ifnonnull       15
			k = o();
	//    3    7:aload_0         
	//    4    8:aload_0         
	//    5    9:invokevirtual   #478 <Method String o()>
	//    6   12:putfield        #176 <Field String k>
		File file = new File(k);
	//    7   15:new             #59  <Class File>
	//    8   18:dup             
	//    9   19:aload_0         
	//   10   20:getfield        #176 <Field String k>
	//   11   23:invokespecial   #367 <Method void File(String)>
	//   12   26:astore_1        
		if(!file.exists() && !file.mkdirs())
	//*  13   27:aload_1         
	//*  14   28:invokevirtual   #370 <Method boolean File.exists()>
	//*  15   31:ifne            72
	//*  16   34:aload_1         
	//*  17   35:invokevirtual   #373 <Method boolean File.mkdirs()>
	//*  18   38:ifne            72
		{
			Log.w("LogUtil_LogConfig", (new StringBuilder()).append("create log directory failed, getLogFileRoot=").append(k).toString());
	//   19   41:ldc1            #182 <String "LogUtil_LogConfig">
	//   20   43:new             #67  <Class StringBuilder>
	//   21   46:dup             
	//   22   47:invokespecial   #70  <Method void StringBuilder()>
	//   23   50:ldc2            #480 <String "create log directory failed, getLogFileRoot=">
	//   24   53:invokevirtual   #74  <Method StringBuilder StringBuilder.append(String)>
	//   25   56:aload_0         
	//   26   57:getfield        #176 <Field String k>
	//   27   60:invokevirtual   #74  <Method StringBuilder StringBuilder.append(String)>
	//   28   63:invokevirtual   #79  <Method String StringBuilder.toString()>
	//   29   66:invokestatic    #331 <Method int Log.w(String, String)>
	//   30   69:pop             
			return null;
	//   31   70:aconst_null     
	//   32   71:areturn         
		} else
		{
			return file;
	//   33   72:aload_1         
	//   34   73:areturn         
		}
	}

	public String o()
	{
		Object obj = ((Object) (c));
	//    0    0:aload_0         
	//    1    1:getfield        #166 <Field String c>
	//    2    4:astore_2        
		String s1 = ((String) (obj));
	//    3    5:aload_2         
	//    4    6:astore_1        
		if(TextUtils.isEmpty(((CharSequence) (obj))))
	//*   5    7:aload_2         
	//*   6    8:invokestatic    #406 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*   7   11:ifeq            18
			s1 = dio.d();
	//    8   14:invokestatic    #196 <Method String dio.d()>
	//    9   17:astore_1        
		obj = ((Object) (s1));
	//   10   18:aload_1         
	//   11   19:astore_2        
		if(TextUtils.isEmpty(((CharSequence) (s1))))
	//*  12   20:aload_1         
	//*  13   21:invokestatic    #406 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  14   24:ifeq            31
			obj = "health";
	//   15   27:ldc2            #482 <String "health">
	//   16   30:astore_2        
		s1 = ((String) (obj)).replaceAll(":", "_");
	//   17   31:aload_2         
	//   18   32:ldc2            #484 <String ":">
	//   19   35:ldc2            #306 <String "_">
	//   20   38:invokevirtual   #488 <Method String String.replaceAll(String, String)>
	//   21   41:astore_1        
		obj = ((Object) (new StringBuilder()));
	//   22   42:new             #67  <Class StringBuilder>
	//   23   45:dup             
	//   24   46:invokespecial   #70  <Method void StringBuilder()>
	//   25   49:astore_2        
		((StringBuilder) (obj)).append(g());
	//   26   50:aload_2         
	//   27   51:invokestatic    #366 <Method String g()>
	//   28   54:invokevirtual   #74  <Method StringBuilder StringBuilder.append(String)>
	//   29   57:pop             
		((StringBuilder) (obj)).append(s1);
	//   30   58:aload_2         
	//   31   59:aload_1         
	//   32   60:invokevirtual   #74  <Method StringBuilder StringBuilder.append(String)>
	//   33   63:pop             
		if(!TextUtils.isEmpty(((CharSequence) (i))))
	//*  34   64:aload_0         
	//*  35   65:getfield        #168 <Field String i>
	//*  36   68:invokestatic    #406 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  37   71:ifne            102
			((StringBuilder) (obj)).append((new StringBuilder()).append("_").append(i).toString());
	//   38   74:aload_2         
	//   39   75:new             #67  <Class StringBuilder>
	//   40   78:dup             
	//   41   79:invokespecial   #70  <Method void StringBuilder()>
	//   42   82:ldc2            #306 <String "_">
	//   43   85:invokevirtual   #74  <Method StringBuilder StringBuilder.append(String)>
	//   44   88:aload_0         
	//   45   89:getfield        #168 <Field String i>
	//   46   92:invokevirtual   #74  <Method StringBuilder StringBuilder.append(String)>
	//   47   95:invokevirtual   #79  <Method String StringBuilder.toString()>
	//   48   98:invokevirtual   #74  <Method StringBuilder StringBuilder.append(String)>
	//   49  101:pop             
		((StringBuilder) (obj)).append("/");
	//   50  102:aload_2         
	//   51  103:ldc2            #490 <String "/">
	//   52  106:invokevirtual   #74  <Method StringBuilder StringBuilder.append(String)>
	//   53  109:pop             
		Log.w("LogUtil_LogConfig", (new StringBuilder()).append("getLogFileRootPath mDetail:").append(i).append(" result:").append(((StringBuilder) (obj)).toString()).toString());
	//   54  110:ldc1            #182 <String "LogUtil_LogConfig">
	//   55  112:new             #67  <Class StringBuilder>
	//   56  115:dup             
	//   57  116:invokespecial   #70  <Method void StringBuilder()>
	//   58  119:ldc2            #492 <String "getLogFileRootPath mDetail:">
	//   59  122:invokevirtual   #74  <Method StringBuilder StringBuilder.append(String)>
	//   60  125:aload_0         
	//   61  126:getfield        #168 <Field String i>
	//   62  129:invokevirtual   #74  <Method StringBuilder StringBuilder.append(String)>
	//   63  132:ldc2            #476 <String " result:">
	//   64  135:invokevirtual   #74  <Method StringBuilder StringBuilder.append(String)>
	//   65  138:aload_2         
	//   66  139:invokevirtual   #79  <Method String StringBuilder.toString()>
	//   67  142:invokevirtual   #74  <Method StringBuilder StringBuilder.append(String)>
	//   68  145:invokevirtual   #79  <Method String StringBuilder.toString()>
	//   69  148:invokestatic    #331 <Method int Log.w(String, String)>
	//   70  151:pop             
		return ((StringBuilder) (obj)).toString();
	//   71  152:aload_2         
	//   72  153:invokevirtual   #79  <Method String StringBuilder.toString()>
	//   73  156:areturn         
	}

	public int p()
	{
		return f;
	//    0    0:aload_0         
	//    1    1:getfield        #170 <Field int f>
	//    2    4:ireturn         
	}

	public File r()
	{
		if(k == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #176 <Field String k>
	//*   2    4:ifnonnull       15
			k = o();
	//    3    7:aload_0         
	//    4    8:aload_0         
	//    5    9:invokevirtual   #478 <Method String o()>
	//    6   12:putfield        #176 <Field String k>
		Log.d("LogUtil_LogConfig", (new StringBuilder()).append("getLogFile(): logFilePath = ").append(k).toString());
	//    7   15:ldc1            #182 <String "LogUtil_LogConfig">
	//    8   17:new             #67  <Class StringBuilder>
	//    9   20:dup             
	//   10   21:invokespecial   #70  <Method void StringBuilder()>
	//   11   24:ldc2            #494 <String "getLogFile(): logFilePath = ">
	//   12   27:invokevirtual   #74  <Method StringBuilder StringBuilder.append(String)>
	//   13   30:aload_0         
	//   14   31:getfield        #176 <Field String k>
	//   15   34:invokevirtual   #74  <Method StringBuilder StringBuilder.append(String)>
	//   16   37:invokevirtual   #79  <Method String StringBuilder.toString()>
	//   17   40:invokestatic    #189 <Method int Log.d(String, String)>
	//   18   43:pop             
		File file = new File(k);
	//   19   44:new             #59  <Class File>
	//   20   47:dup             
	//   21   48:aload_0         
	//   22   49:getfield        #176 <Field String k>
	//   23   52:invokespecial   #367 <Method void File(String)>
	//   24   55:astore          4
		if(!file.exists())
	//*  25   57:aload           4
	//*  26   59:invokevirtual   #370 <Method boolean File.exists()>
	//*  27   62:ifne            85
		{
			if(!file.mkdirs())
	//*  28   65:aload           4
	//*  29   67:invokevirtual   #373 <Method boolean File.mkdirs()>
	//*  30   70:ifne            89
				Log.w("LogUtil_LogConfig", "create log directory failed");
	//   31   73:ldc1            #182 <String "LogUtil_LogConfig">
	//   32   75:ldc2            #496 <String "create log directory failed">
	//   33   78:invokestatic    #331 <Method int Log.w(String, String)>
	//   34   81:pop             
		} else
	//*  35   82:goto            89
		{
			x();
	//   36   85:aload_0         
	//   37   86:invokespecial   #498 <Method void x()>
		}
		file = new File((new StringBuilder()).append(k).append("log.0").toString());
	//   38   89:new             #59  <Class File>
	//   39   92:dup             
	//   40   93:new             #67  <Class StringBuilder>
	//   41   96:dup             
	//   42   97:invokespecial   #70  <Method void StringBuilder()>
	//   43  100:aload_0         
	//   44  101:getfield        #176 <Field String k>
	//   45  104:invokevirtual   #74  <Method StringBuilder StringBuilder.append(String)>
	//   46  107:ldc2            #500 <String "log.0">
	//   47  110:invokevirtual   #74  <Method StringBuilder StringBuilder.append(String)>
	//   48  113:invokevirtual   #79  <Method String StringBuilder.toString()>
	//   49  116:invokespecial   #367 <Method void File(String)>
	//   50  119:astore          4
		double d1 = l();
	//   51  121:aload_0         
	//   52  122:invokevirtual   #502 <Method double l()>
	//   53  125:dstore_1        
		int j = p();
	//   54  126:aload_0         
	//   55  127:invokevirtual   #504 <Method int p()>
	//   56  130:istore_3        
		if(file.exists() && (double)file.length() > d1)
	//*  57  131:aload           4
	//*  58  133:invokevirtual   #370 <Method boolean File.exists()>
	//*  59  136:ifeq            329
	//*  60  139:aload           4
	//*  61  141:invokevirtual   #508 <Method long File.length()>
	//*  62  144:l2d             
	//*  63  145:dload_1         
	//*  64  146:dcmpl           
	//*  65  147:ifle            329
		{
			File file1 = new File((new StringBuilder()).append(k).append("log.").append(j - 1).toString());
	//   66  150:new             #59  <Class File>
	//   67  153:dup             
	//   68  154:new             #67  <Class StringBuilder>
	//   69  157:dup             
	//   70  158:invokespecial   #70  <Method void StringBuilder()>
	//   71  161:aload_0         
	//   72  162:getfield        #176 <Field String k>
	//   73  165:invokevirtual   #74  <Method StringBuilder StringBuilder.append(String)>
	//   74  168:ldc2            #510 <String "log.">
	//   75  171:invokevirtual   #74  <Method StringBuilder StringBuilder.append(String)>
	//   76  174:iload_3         
	//   77  175:iconst_1        
	//   78  176:isub            
	//   79  177:invokevirtual   #207 <Method StringBuilder StringBuilder.append(int)>
	//   80  180:invokevirtual   #79  <Method String StringBuilder.toString()>
	//   81  183:invokespecial   #367 <Method void File(String)>
	//   82  186:astore          5
			if(file1.exists() && !file1.delete())
	//*  83  188:aload           5
	//*  84  190:invokevirtual   #370 <Method boolean File.exists()>
	//*  85  193:ifeq            215
	//*  86  196:aload           5
	//*  87  198:invokevirtual   #413 <Method boolean File.delete()>
	//*  88  201:ifne            215
			{
				Log.w("LogUtil_LogConfig", "delete log file failed");
	//   89  204:ldc1            #182 <String "LogUtil_LogConfig">
	//   90  206:ldc2            #512 <String "delete log file failed">
	//   91  209:invokestatic    #331 <Method int Log.w(String, String)>
	//   92  212:pop             
				return null;
	//   93  213:aconst_null     
	//   94  214:areturn         
			}
			for(j -= 2; j >= 0; j--)
	//*  95  215:iload_3         
	//*  96  216:iconst_2        
	//*  97  217:isub            
	//*  98  218:istore_3        
	//*  99  219:iload_3         
	//* 100  220:iflt            329
			{
				File file2 = new File((new StringBuilder()).append(k).append("log.").append(j).toString());
	//  101  223:new             #59  <Class File>
	//  102  226:dup             
	//  103  227:new             #67  <Class StringBuilder>
	//  104  230:dup             
	//  105  231:invokespecial   #70  <Method void StringBuilder()>
	//  106  234:aload_0         
	//  107  235:getfield        #176 <Field String k>
	//  108  238:invokevirtual   #74  <Method StringBuilder StringBuilder.append(String)>
	//  109  241:ldc2            #510 <String "log.">
	//  110  244:invokevirtual   #74  <Method StringBuilder StringBuilder.append(String)>
	//  111  247:iload_3         
	//  112  248:invokevirtual   #207 <Method StringBuilder StringBuilder.append(int)>
	//  113  251:invokevirtual   #79  <Method String StringBuilder.toString()>
	//  114  254:invokespecial   #367 <Method void File(String)>
	//  115  257:astore          5
				if(file2.exists() && !file2.renameTo(new File((new StringBuilder()).append(k).append("log.").append(j + 1).toString())))
	//* 116  259:aload           5
	//* 117  261:invokevirtual   #370 <Method boolean File.exists()>
	//* 118  264:ifeq            322
	//* 119  267:aload           5
	//* 120  269:new             #59  <Class File>
	//* 121  272:dup             
	//* 122  273:new             #67  <Class StringBuilder>
	//* 123  276:dup             
	//* 124  277:invokespecial   #70  <Method void StringBuilder()>
	//* 125  280:aload_0         
	//* 126  281:getfield        #176 <Field String k>
	//* 127  284:invokevirtual   #74  <Method StringBuilder StringBuilder.append(String)>
	//* 128  287:ldc2            #510 <String "log.">
	//* 129  290:invokevirtual   #74  <Method StringBuilder StringBuilder.append(String)>
	//* 130  293:iload_3         
	//* 131  294:iconst_1        
	//* 132  295:iadd            
	//* 133  296:invokevirtual   #207 <Method StringBuilder StringBuilder.append(int)>
	//* 134  299:invokevirtual   #79  <Method String StringBuilder.toString()>
	//* 135  302:invokespecial   #367 <Method void File(String)>
	//* 136  305:invokevirtual   #516 <Method boolean File.renameTo(File)>
	//* 137  308:ifne            322
				{
					Log.w("LogUtil_LogConfig", "rename log file failed");
	//  138  311:ldc1            #182 <String "LogUtil_LogConfig">
	//  139  313:ldc2            #518 <String "rename log file failed">
	//  140  316:invokestatic    #331 <Method int Log.w(String, String)>
	//  141  319:pop             
					return null;
	//  142  320:aconst_null     
	//  143  321:areturn         
				}
			}

	//  144  322:iload_3         
	//  145  323:iconst_1        
	//  146  324:isub            
	//  147  325:istore_3        
		}
	//* 148  326:goto            219
		return file;
	//  149  329:aload           4
	//  150  331:areturn         
	}

	public static final String a = (new StringBuilder()).append(d).append("/log/phonelogcat").toString();
	private static final String b = (new StringBuilder()).append(d).append("/huaweisystem/com.huawei.health/").toString();
	public static final String d = Environment.getExternalStorageDirectory().getAbsolutePath();
	private static final String e = (new StringBuilder()).append(d).append("/huaweisystem/").toString();
	private static int l = 1;
	private static dhu m = null;
	private static int n;
	private static final List o;
	private static int q = 0xa00000;
	private static Object r = new Object();
	private static List s = new ArrayList();
	private static d t = new d();
	private static List u = new ArrayList();
	private static List w = new ArrayList();
	private static boolean x = false;
	private static BroadcastReceiver z = new BroadcastReceiver() {

		public void onReceive(Context context, Intent intent)
		{
			if(context == null || intent == null)
		//*   0    0:aload_1         
		//*   1    1:ifnull          8
		//*   2    4:aload_2         
		//*   3    5:ifnonnull       17
			{
				Log.w("LogUtil_LogConfig", "sLogConfigReceiver receive null,deal failed,return");
		//    4    8:ldc1            #15  <String "LogUtil_LogConfig">
		//    5   10:ldc1            #17  <String "sLogConfigReceiver receive null,deal failed,return">
		//    6   12:invokestatic    #23  <Method int Log.w(String, String)>
		//    7   15:pop             
				return;
		//    8   16:return          
			}
			intent = ((Intent) (intent.getAction()));
		//    9   17:aload_2         
		//   10   18:invokevirtual   #29  <Method String Intent.getAction()>
		//   11   21:astore_2        
			if(intent == null)
		//*  12   22:aload_2         
		//*  13   23:ifnonnull       35
			{
				Log.w("LogUtil_LogConfig", "sLogConfigReceiver receive action null,deal failed,return");
		//   14   26:ldc1            #15  <String "LogUtil_LogConfig">
		//   15   28:ldc1            #31  <String "sLogConfigReceiver receive action null,deal failed,return">
		//   16   30:invokestatic    #23  <Method int Log.w(String, String)>
		//   17   33:pop             
				return;
		//   18   34:return          
			}
			Log.i("LogUtil_LogConfig", (new StringBuilder()).append("sLogConfigReceiver receive,deal:").append(((String) (intent))).toString());
		//   19   35:ldc1            #15  <String "LogUtil_LogConfig">
		//   20   37:new             #33  <Class StringBuilder>
		//   21   40:dup             
		//   22   41:invokespecial   #34  <Method void StringBuilder()>
		//   23   44:ldc1            #36  <String "sLogConfigReceiver receive,deal:">
		//   24   46:invokevirtual   #40  <Method StringBuilder StringBuilder.append(String)>
		//   25   49:aload_2         
		//   26   50:invokevirtual   #40  <Method StringBuilder StringBuilder.append(String)>
		//   27   53:invokevirtual   #43  <Method String StringBuilder.toString()>
		//   28   56:invokestatic    #46  <Method int Log.i(String, String)>
		//   29   59:pop             
			if(((String) (intent)).equals("com.huawei.health.update_log_config_area"))
		//*  30   60:aload_2         
		//*  31   61:ldc1            #48  <String "com.huawei.health.update_log_config_area">
		//*  32   63:invokevirtual   #54  <Method boolean String.equals(Object)>
		//*  33   66:ifeq            106
			{
				dhu.e(context, (new StringBuilder()).append("ACTION_UPDATE_LOG_CONFIG_AREA message deal for process:").append(dio.d()).append(" pid:").append(Process.myPid()).toString());
		//   34   69:aload_1         
		//   35   70:new             #33  <Class StringBuilder>
		//   36   73:dup             
		//   37   74:invokespecial   #34  <Method void StringBuilder()>
		//   38   77:ldc1            #56  <String "ACTION_UPDATE_LOG_CONFIG_AREA message deal for process:">
		//   39   79:invokevirtual   #40  <Method StringBuilder StringBuilder.append(String)>
		//   40   82:invokestatic    #61  <Method String dio.d()>
		//   41   85:invokevirtual   #40  <Method StringBuilder StringBuilder.append(String)>
		//   42   88:ldc1            #63  <String " pid:">
		//   43   90:invokevirtual   #40  <Method StringBuilder StringBuilder.append(String)>
		//   44   93:invokestatic    #69  <Method int Process.myPid()>
		//   45   96:invokevirtual   #72  <Method StringBuilder StringBuilder.append(int)>
		//   46   99:invokevirtual   #43  <Method String StringBuilder.toString()>
		//   47  102:invokestatic    #76  <Method void dhu.e(Context, String)>
				return;
		//   48  105:return          
			}
			if(((String) (intent)).equals("com.huawei.health.update_log_config_user"))
		//*  49  106:aload_2         
		//*  50  107:ldc1            #78  <String "com.huawei.health.update_log_config_user">
		//*  51  109:invokevirtual   #54  <Method boolean String.equals(Object)>
		//*  52  112:ifeq            118
				dhu.t();
		//   53  115:invokestatic    #81  <Method void dhu.t()>
		//   54  118:return          
		}

	}
;
	private String c;
	private int f;
	private double g;
	private boolean h;
	private String i;
	private String k;
	private double p;

	static 
	{
	//    0    0:invokestatic    #57  <Method File Environment.getExternalStorageDirectory()>
	//    1    3:invokevirtual   #63  <Method String File.getAbsolutePath()>
	//    2    6:putstatic       #65  <Field String d>
	//    3    9:new             #67  <Class StringBuilder>
	//    4   12:dup             
	//    5   13:invokespecial   #70  <Method void StringBuilder()>
	//    6   16:getstatic       #65  <Field String d>
	//    7   19:invokevirtual   #74  <Method StringBuilder StringBuilder.append(String)>
	//    8   22:ldc1            #76  <String "/huaweisystem/">
	//    9   24:invokevirtual   #74  <Method StringBuilder StringBuilder.append(String)>
	//   10   27:invokevirtual   #79  <Method String StringBuilder.toString()>
	//   11   30:putstatic       #81  <Field String e>
	//   12   33:new             #67  <Class StringBuilder>
	//   13   36:dup             
	//   14   37:invokespecial   #70  <Method void StringBuilder()>
	//   15   40:getstatic       #65  <Field String d>
	//   16   43:invokevirtual   #74  <Method StringBuilder StringBuilder.append(String)>
	//   17   46:ldc1            #83  <String "/huaweisystem/com.huawei.health/">
	//   18   48:invokevirtual   #74  <Method StringBuilder StringBuilder.append(String)>
	//   19   51:invokevirtual   #79  <Method String StringBuilder.toString()>
	//   20   54:putstatic       #85  <Field String b>
	//   21   57:new             #67  <Class StringBuilder>
	//   22   60:dup             
	//   23   61:invokespecial   #70  <Method void StringBuilder()>
	//   24   64:getstatic       #65  <Field String d>
	//   25   67:invokevirtual   #74  <Method StringBuilder StringBuilder.append(String)>
	//   26   70:ldc1            #87  <String "/log/phonelogcat">
	//   27   72:invokevirtual   #74  <Method StringBuilder StringBuilder.append(String)>
	//   28   75:invokevirtual   #79  <Method String StringBuilder.toString()>
	//   29   78:putstatic       #89  <Field String a>
		o = ((List) (new ArrayList()));
	//   30   81:new             #91  <Class ArrayList>
	//   31   84:dup             
	//   32   85:invokespecial   #92  <Method void ArrayList()>
	//   33   88:putstatic       #94  <Field List o>
	//   34   91:aconst_null     
	//   35   92:putstatic       #96  <Field dhu m>
	//   36   95:iconst_1        
	//   37   96:putstatic       #98  <Field int l>
		n = 0x500000;
	//   38   99:ldc1            #99  <Int 0x500000>
	//   39  101:putstatic       #101 <Field int n>
	//   40  104:ldc1            #102 <Int 0xa00000>
	//   41  106:putstatic       #104 <Field int q>
	//   42  109:new             #4   <Class Object>
	//   43  112:dup             
	//   44  113:invokespecial   #105 <Method void Object()>
	//   45  116:putstatic       #107 <Field Object r>
	//   46  119:new             #15  <Class dhu$d>
	//   47  122:dup             
	//   48  123:aconst_null     
	//   49  124:invokespecial   #110 <Method void dhu$d(dhu$2)>
	//   50  127:putstatic       #112 <Field dhu$d t>
	//   51  130:new             #91  <Class ArrayList>
	//   52  133:dup             
	//   53  134:invokespecial   #92  <Method void ArrayList()>
	//   54  137:putstatic       #114 <Field List s>
	//   55  140:new             #91  <Class ArrayList>
	//   56  143:dup             
	//   57  144:invokespecial   #92  <Method void ArrayList()>
	//   58  147:putstatic       #116 <Field List u>
	//   59  150:iconst_0        
	//   60  151:putstatic       #118 <Field boolean x>
	//   61  154:new             #91  <Class ArrayList>
	//   62  157:dup             
	//   63  158:invokespecial   #92  <Method void ArrayList()>
	//   64  161:putstatic       #120 <Field List w>
		m = new dhu();
	//   65  164:new             #2   <Class dhu>
	//   66  167:dup             
	//   67  168:invokespecial   #121 <Method void dhu()>
	//   68  171:putstatic       #96  <Field dhu m>
		dhu dhu1 = new dhu();
	//   69  174:new             #2   <Class dhu>
	//   70  177:dup             
	//   71  178:invokespecial   #121 <Method void dhu()>
	//   72  181:astore_0        
		dhu1.c("com.huawei.health");
	//   73  182:aload_0         
	//   74  183:ldc1            #123 <String "com.huawei.health">
	//   75  185:invokevirtual   #126 <Method void c(String)>
		dhu1.d(4);
	//   76  188:aload_0         
	//   77  189:iconst_4        
	//   78  190:invokevirtual   #129 <Method void d(int)>
		dhu1.a(-209715.20000000001D);
	//   79  193:aload_0         
	//   80  194:ldc2w           #130 <Double -209715.20000000001D>
	//   81  197:invokevirtual   #134 <Method void a(double)>
		o.add(((Object) (dhu1)));
	//   82  200:getstatic       #94  <Field List o>
	//   83  203:aload_0         
	//   84  204:invokeinterface #140 <Method boolean List.add(Object)>
	//   85  209:pop             
		dhu1 = new dhu();
	//   86  210:new             #2   <Class dhu>
	//   87  213:dup             
	//   88  214:invokespecial   #121 <Method void dhu()>
	//   89  217:astore_0        
		dhu1.c("com.huawei.health:DaemonService");
	//   90  218:aload_0         
	//   91  219:ldc1            #142 <String "com.huawei.health:DaemonService">
	//   92  221:invokevirtual   #126 <Method void c(String)>
		dhu1.d(4);
	//   93  224:aload_0         
	//   94  225:iconst_4        
	//   95  226:invokevirtual   #129 <Method void d(int)>
		o.add(((Object) (dhu1)));
	//   96  229:getstatic       #94  <Field List o>
	//   97  232:aload_0         
	//   98  233:invokeinterface #140 <Method boolean List.add(Object)>
	//   99  238:pop             
		dhu1 = new dhu();
	//  100  239:new             #2   <Class dhu>
	//  101  242:dup             
	//  102  243:invokespecial   #121 <Method void dhu()>
	//  103  246:astore_0        
		dhu1.c("com.huawei.health:PhoneService");
	//  104  247:aload_0         
	//  105  248:ldc1            #144 <String "com.huawei.health:PhoneService">
	//  106  250:invokevirtual   #126 <Method void c(String)>
		dhu1.d(5);
	//  107  253:aload_0         
	//  108  254:iconst_5        
	//  109  255:invokevirtual   #129 <Method void d(int)>
		dhu1.a(n);
	//  110  258:aload_0         
	//  111  259:getstatic       #101 <Field int n>
	//  112  262:i2d             
	//  113  263:invokevirtual   #134 <Method void a(double)>
		o.add(((Object) (dhu1)));
	//  114  266:getstatic       #94  <Field List o>
	//  115  269:aload_0         
	//  116  270:invokeinterface #140 <Method boolean List.add(Object)>
	//  117  275:pop             
		dhu1 = new dhu();
	//  118  276:new             #2   <Class dhu>
	//  119  279:dup             
	//  120  280:invokespecial   #121 <Method void dhu()>
	//  121  283:astore_0        
		dhu1.c("com.huawei.health:DaemonService");
	//  122  284:aload_0         
	//  123  285:ldc1            #142 <String "com.huawei.health:DaemonService">
	//  124  287:invokevirtual   #126 <Method void c(String)>
		dhu1.b("sensor");
	//  125  290:aload_0         
	//  126  291:ldc1            #146 <String "sensor">
	//  127  293:invokevirtual   #148 <Method void b(String)>
		dhu1.d(2);
	//  128  296:aload_0         
	//  129  297:iconst_2        
	//  130  298:invokevirtual   #129 <Method void d(int)>
		dhu1.c(false);
	//  131  301:aload_0         
	//  132  302:iconst_0        
	//  133  303:invokevirtual   #151 <Method void c(boolean)>
		dhu1.b(512000D);
	//  134  306:aload_0         
	//  135  307:ldc2w           #152 <Double 512000D>
	//  136  310:invokevirtual   #155 <Method void b(double)>
		o.add(((Object) (dhu1)));
	//  137  313:getstatic       #94  <Field List o>
	//  138  316:aload_0         
	//  139  317:invokeinterface #140 <Method boolean List.add(Object)>
	//  140  322:pop             
		z();
	//  141  323:invokestatic    #157 <Method void z()>
		y();
	//  142  326:invokestatic    #160 <Method void y()>
	//  143  329:new             #8   <Class dhu$3>
	//  144  332:dup             
	//  145  333:invokespecial   #161 <Method void dhu$3()>
	//  146  336:putstatic       #163 <Field BroadcastReceiver z>
	//* 147  339:return          
	}
}

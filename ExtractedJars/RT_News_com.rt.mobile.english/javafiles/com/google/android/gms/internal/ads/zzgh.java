// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import com.google.android.gms.ads.internal.zzbv;
import java.util.*;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzgw, zzajm, zzane, zzakk, 
//			zzgi, zzgj, zzakb, zznk, 
//			zzkb, zzni

final class zzgh
	implements android.app.Application.ActivityLifecycleCallbacks
{

	zzgh()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #34  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #4   <Class Object>
	//    4    8:dup             
	//    5    9:invokespecial   #34  <Method void Object()>
	//    6   12:putfield        #36  <Field Object mLock>
		zzahr = true;
	//    7   15:aload_0         
	//    8   16:iconst_1        
	//    9   17:putfield        #38  <Field boolean zzahr>
		zzahs = false;
	//   10   20:aload_0         
	//   11   21:iconst_0        
	//   12   22:putfield        #40  <Field boolean zzahs>
	//   13   25:aload_0         
	//   14   26:new             #42  <Class ArrayList>
	//   15   29:dup             
	//   16   30:invokespecial   #43  <Method void ArrayList()>
	//   17   33:putfield        #45  <Field List zzaht>
	//   18   36:aload_0         
	//   19   37:new             #42  <Class ArrayList>
	//   20   40:dup             
	//   21   41:invokespecial   #43  <Method void ArrayList()>
	//   22   44:putfield        #47  <Field List zzahu>
		zzzv = false;
	//   23   47:aload_0         
	//   24   48:iconst_0        
	//   25   49:putfield        #49  <Field boolean zzzv>
	//   26   52:return          
	}

	private final void setActivity(Activity activity)
	{
		synchronized(mLock)
	//*   0    0:aload_0         
	//*   1    1:getfield        #36  <Field Object mLock>
	//*   2    4:astore_2        
	//*   3    5:aload_2         
	//*   4    6:monitorenter    
		{
			if(!((Object) (activity)).getClass().getName().startsWith("com.google.android.gms.ads"))
	//*   5    7:aload_1         
	//*   6    8:invokevirtual   #56  <Method Class Object.getClass()>
	//*   7   11:invokevirtual   #62  <Method String Class.getName()>
	//*   8   14:ldc1            #64  <String "com.google.android.gms.ads">
	//*   9   16:invokevirtual   #70  <Method boolean String.startsWith(String)>
	//*  10   19:ifne            27
				mActivity = activity;
	//   11   22:aload_0         
	//   12   23:aload_1         
	//   13   24:putfield        #72  <Field Activity mActivity>
		}
	//   14   27:aload_2         
	//   15   28:monitorexit     
		return;
	//   16   29:return          
		activity;
	//   17   30:astore_1        
		obj;
	//   18   31:aload_2         
		JVM INSTR monitorexit ;
	//   19   32:monitorexit     
		throw activity;
	//   20   33:aload_1         
	//   21   34:athrow          
	}

	static Object zza(zzgh zzgh1)
	{
		return zzgh1.mLock;
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field Object mLock>
	//    2    4:areturn         
	}

	static boolean zza(zzgh zzgh1, boolean flag)
	{
		zzgh1.zzahr = false;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #38  <Field boolean zzahr>
		return false;
	//    3    5:iconst_0        
	//    4    6:ireturn         
	}

	static boolean zzb(zzgh zzgh1)
	{
		return zzgh1.zzahr;
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field boolean zzahr>
	//    2    4:ireturn         
	}

	static boolean zzc(zzgh zzgh1)
	{
		return zzgh1.zzahs;
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field boolean zzahs>
	//    2    4:ireturn         
	}

	static List zzd(zzgh zzgh1)
	{
		return zzgh1.zzaht;
	//    0    0:aload_0         
	//    1    1:getfield        #45  <Field List zzaht>
	//    2    4:areturn         
	}

	public final Activity getActivity()
	{
		return mActivity;
	//    0    0:aload_0         
	//    1    1:getfield        #72  <Field Activity mActivity>
	//    2    4:areturn         
	}

	public final Context getContext()
	{
		return mContext;
	//    0    0:aload_0         
	//    1    1:getfield        #87  <Field Context mContext>
	//    2    4:areturn         
	}

	public final void onActivityCreated(Activity activity, Bundle bundle)
	{
	//    0    0:return          
	}

	public final void onActivityDestroyed(Activity activity)
	{
label0:
		{
			synchronized(mLock)
	//*   0    0:aload_0         
	//*   1    1:getfield        #36  <Field Object mLock>
	//*   2    4:astore_2        
	//*   3    5:aload_2         
	//*   4    6:monitorenter    
			{
				if(mActivity != null)
					break label0;
	//    5    7:aload_0         
	//    6    8:getfield        #72  <Field Activity mActivity>
	//    7   11:ifnonnull       17
			}
	//    8   14:aload_2         
	//    9   15:monitorexit     
			return;
	//   10   16:return          
		}
		Iterator iterator;
		if(((Object) (mActivity)).equals(((Object) (activity))))
	//*  11   17:aload_0         
	//*  12   18:getfield        #72  <Field Activity mActivity>
	//*  13   21:aload_1         
	//*  14   22:invokevirtual   #96  <Method boolean Object.equals(Object)>
	//*  15   25:ifeq            33
			mActivity = null;
	//   16   28:aload_0         
	//   17   29:aconst_null     
	//   18   30:putfield        #72  <Field Activity mActivity>
		iterator = zzahu.iterator();
	//   19   33:aload_0         
	//   20   34:getfield        #47  <Field List zzahu>
	//   21   37:invokeinterface #102 <Method Iterator List.iterator()>
	//   22   42:astore_3        
_L2:
		zzgw zzgw1;
		if(!iterator.hasNext())
			break MISSING_BLOCK_LABEL_105;
	//   23   43:aload_3         
	//   24   44:invokeinterface #108 <Method boolean Iterator.hasNext()>
	//   25   49:ifeq            105
		zzgw1 = (zzgw)iterator.next();
	//   26   52:aload_3         
	//   27   53:invokeinterface #112 <Method Object Iterator.next()>
	//   28   58:checkcast       #114 <Class zzgw>
	//   29   61:astore          4
		if(!zzgw1.zza(activity)) goto _L2; else goto _L1
	//   30   63:aload           4
	//   31   65:aload_1         
	//   32   66:invokeinterface #117 <Method boolean zzgw.zza(Activity)>
	//   33   71:ifeq            43
_L1:
		iterator.remove();
	//   34   74:aload_3         
	//   35   75:invokeinterface #120 <Method void Iterator.remove()>
		  goto _L2
	//*  36   80:goto            43
		Exception exception;
		exception;
	//   37   83:astore          4
		zzbv.zzeo().zza(((Throwable) (exception)), "AppActivityTracker.ActivityListener.onActivityDestroyed");
	//   38   85:invokestatic    #126 <Method zzajm zzbv.zzeo()>
	//   39   88:aload           4
	//   40   90:ldc1            #128 <String "AppActivityTracker.ActivityListener.onActivityDestroyed">
	//   41   92:invokevirtual   #133 <Method void zzajm.zza(Throwable, String)>
		zzane.zzb("", ((Throwable) (exception)));
	//   42   95:ldc1            #135 <String "">
	//   43   97:aload           4
	//   44   99:invokestatic    #140 <Method void zzane.zzb(String, Throwable)>
		  goto _L2
	//*  45  102:goto            43
		obj;
	//   46  105:aload_2         
		JVM INSTR monitorexit ;
	//   47  106:monitorexit     
		return;
	//   48  107:return          
		activity;
	//   49  108:astore_1        
		obj;
	//   50  109:aload_2         
		JVM INSTR monitorexit ;
	//   51  110:monitorexit     
		throw activity;
	//   52  111:aload_1         
	//   53  112:athrow          
	}

	public final void onActivityPaused(Activity activity)
	{
		setActivity(activity);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #143 <Method void setActivity(Activity)>
		Object obj = mLock;
	//    3    5:aload_0         
	//    4    6:getfield        #36  <Field Object mLock>
	//    5    9:astore_2        
		obj;
	//    6   10:aload_2         
		JVM INSTR monitorenter ;
	//    7   11:monitorenter    
		Iterator iterator = zzahu.iterator();
	//    8   12:aload_0         
	//    9   13:getfield        #47  <Field List zzahu>
	//   10   16:invokeinterface #102 <Method Iterator List.iterator()>
	//   11   21:astore_3        
_L1:
		zzgw zzgw1;
		if(!iterator.hasNext())
			break MISSING_BLOCK_LABEL_75;
	//   12   22:aload_3         
	//   13   23:invokeinterface #108 <Method boolean Iterator.hasNext()>
	//   14   28:ifeq            75
		zzgw1 = (zzgw)iterator.next();
	//   15   31:aload_3         
	//   16   32:invokeinterface #112 <Method Object Iterator.next()>
	//   17   37:checkcast       #114 <Class zzgw>
	//   18   40:astore          4
		zzgw1.onActivityPaused(activity);
	//   19   42:aload           4
	//   20   44:aload_1         
	//   21   45:invokeinterface #145 <Method void zzgw.onActivityPaused(Activity)>
		  goto _L1
	//*  22   50:goto            22
		Exception exception;
		exception;
	//   23   53:astore          4
		zzbv.zzeo().zza(((Throwable) (exception)), "AppActivityTracker.ActivityListener.onActivityPaused");
	//   24   55:invokestatic    #126 <Method zzajm zzbv.zzeo()>
	//   25   58:aload           4
	//   26   60:ldc1            #147 <String "AppActivityTracker.ActivityListener.onActivityPaused">
	//   27   62:invokevirtual   #133 <Method void zzajm.zza(Throwable, String)>
		zzane.zzb("", ((Throwable) (exception)));
	//   28   65:ldc1            #135 <String "">
	//   29   67:aload           4
	//   30   69:invokestatic    #140 <Method void zzane.zzb(String, Throwable)>
		  goto _L1
	//*  31   72:goto            22
		obj;
	//   32   75:aload_2         
		JVM INSTR monitorexit ;
	//   33   76:monitorexit     
		zzahs = true;
	//   34   77:aload_0         
	//   35   78:iconst_1        
	//   36   79:putfield        #40  <Field boolean zzahs>
		if(zzahv != null)
	//*  37   82:aload_0         
	//*  38   83:getfield        #149 <Field Runnable zzahv>
	//*  39   86:ifnull          99
			zzakk.zzcrm.removeCallbacks(zzahv);
	//   40   89:getstatic       #155 <Field Handler zzakk.zzcrm>
	//   41   92:aload_0         
	//   42   93:getfield        #149 <Field Runnable zzahv>
	//   43   96:invokevirtual   #161 <Method void Handler.removeCallbacks(Runnable)>
		activity = ((Activity) (zzakk.zzcrm));
	//   44   99:getstatic       #155 <Field Handler zzakk.zzcrm>
	//   45  102:astore_1        
		obj = ((Object) (new zzgi(this)));
	//   46  103:new             #163 <Class zzgi>
	//   47  106:dup             
	//   48  107:aload_0         
	//   49  108:invokespecial   #166 <Method void zzgi(zzgh)>
	//   50  111:astore_2        
		zzahv = ((Runnable) (obj));
	//   51  112:aload_0         
	//   52  113:aload_2         
	//   53  114:putfield        #149 <Field Runnable zzahv>
		((Handler) (activity)).postDelayed(((Runnable) (obj)), zzahw);
	//   54  117:aload_1         
	//   55  118:aload_2         
	//   56  119:aload_0         
	//   57  120:getfield        #168 <Field long zzahw>
	//   58  123:invokevirtual   #172 <Method boolean Handler.postDelayed(Runnable, long)>
	//   59  126:pop             
		return;
	//   60  127:return          
		activity;
	//   61  128:astore_1        
		obj;
	//   62  129:aload_2         
		JVM INSTR monitorexit ;
	//   63  130:monitorexit     
		throw activity;
	//   64  131:aload_1         
	//   65  132:athrow          
	}

	public final void onActivityResumed(Activity activity)
	{
		boolean flag;
		setActivity(activity);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #143 <Method void setActivity(Activity)>
		zzahs = false;
	//    3    5:aload_0         
	//    4    6:iconst_0        
	//    5    7:putfield        #40  <Field boolean zzahs>
		flag = zzahr;
	//    6   10:aload_0         
	//    7   11:getfield        #38  <Field boolean zzahr>
	//    8   14:istore_2        
		zzahr = true;
	//    9   15:aload_0         
	//   10   16:iconst_1        
	//   11   17:putfield        #38  <Field boolean zzahr>
		if(zzahv != null)
	//*  12   20:aload_0         
	//*  13   21:getfield        #149 <Field Runnable zzahv>
	//*  14   24:ifnull          37
			zzakk.zzcrm.removeCallbacks(zzahv);
	//   15   27:getstatic       #155 <Field Handler zzakk.zzcrm>
	//   16   30:aload_0         
	//   17   31:getfield        #149 <Field Runnable zzahv>
	//   18   34:invokevirtual   #161 <Method void Handler.removeCallbacks(Runnable)>
		Object obj = mLock;
	//   19   37:aload_0         
	//   20   38:getfield        #36  <Field Object mLock>
	//   21   41:astore_3        
		obj;
	//   22   42:aload_3         
		JVM INSTR monitorenter ;
	//   23   43:monitorenter    
		Object obj1 = ((Object) (zzahu.iterator()));
	//   24   44:aload_0         
	//   25   45:getfield        #47  <Field List zzahu>
	//   26   48:invokeinterface #102 <Method Iterator List.iterator()>
	//   27   53:astore          4
_L1:
		zzgw zzgw1;
		if(!((Iterator) (obj1)).hasNext())
			break MISSING_BLOCK_LABEL_110;
	//   28   55:aload           4
	//   29   57:invokeinterface #108 <Method boolean Iterator.hasNext()>
	//   30   62:ifeq            110
		zzgw1 = (zzgw)((Iterator) (obj1)).next();
	//   31   65:aload           4
	//   32   67:invokeinterface #112 <Method Object Iterator.next()>
	//   33   72:checkcast       #114 <Class zzgw>
	//   34   75:astore          5
		zzgw1.onActivityResumed(activity);
	//   35   77:aload           5
	//   36   79:aload_1         
	//   37   80:invokeinterface #175 <Method void zzgw.onActivityResumed(Activity)>
		  goto _L1
	//*  38   85:goto            55
		Exception exception1;
		exception1;
	//   39   88:astore          5
		zzbv.zzeo().zza(((Throwable) (exception1)), "AppActivityTracker.ActivityListener.onActivityResumed");
	//   40   90:invokestatic    #126 <Method zzajm zzbv.zzeo()>
	//   41   93:aload           5
	//   42   95:ldc1            #177 <String "AppActivityTracker.ActivityListener.onActivityResumed">
	//   43   97:invokevirtual   #133 <Method void zzajm.zza(Throwable, String)>
		zzane.zzb("", ((Throwable) (exception1)));
	//   44  100:ldc1            #135 <String "">
	//   45  102:aload           5
	//   46  104:invokestatic    #140 <Method void zzane.zzb(String, Throwable)>
		  goto _L1
	//*  47  107:goto            55
		if(!(flag ^ true))
			break MISSING_BLOCK_LABEL_169;
	//   48  110:iload_2         
	//   49  111:iconst_1        
	//   50  112:ixor            
	//   51  113:ifeq            169
		activity = ((Activity) (zzaht.iterator()));
	//   52  116:aload_0         
	//   53  117:getfield        #45  <Field List zzaht>
	//   54  120:invokeinterface #102 <Method Iterator List.iterator()>
	//   55  125:astore_1        
_L2:
		if(!((Iterator) (activity)).hasNext())
			break MISSING_BLOCK_LABEL_174;
	//   56  126:aload_1         
	//   57  127:invokeinterface #108 <Method boolean Iterator.hasNext()>
	//   58  132:ifeq            174
		obj1 = ((Object) ((zzgj)((Iterator) (activity)).next()));
	//   59  135:aload_1         
	//   60  136:invokeinterface #112 <Method Object Iterator.next()>
	//   61  141:checkcast       #179 <Class zzgj>
	//   62  144:astore          4
		((zzgj) (obj1)).zzh(true);
	//   63  146:aload           4
	//   64  148:iconst_1        
	//   65  149:invokeinterface #183 <Method void zzgj.zzh(boolean)>
		  goto _L2
	//*  66  154:goto            126
		Exception exception;
		exception;
	//   67  157:astore          4
		zzane.zzb("", ((Throwable) (exception)));
	//   68  159:ldc1            #135 <String "">
	//   69  161:aload           4
	//   70  163:invokestatic    #140 <Method void zzane.zzb(String, Throwable)>
		  goto _L2
	//*  71  166:goto            126
		zzakb.zzck("App is still foreground.");
	//   72  169:ldc1            #185 <String "App is still foreground.">
	//   73  171:invokestatic    #191 <Method void zzakb.zzck(String)>
		obj;
	//   74  174:aload_3         
		JVM INSTR monitorexit ;
	//   75  175:monitorexit     
		return;
	//   76  176:return          
		activity;
	//   77  177:astore_1        
		obj;
	//   78  178:aload_3         
		JVM INSTR monitorexit ;
	//   79  179:monitorexit     
		throw activity;
	//   80  180:aload_1         
	//   81  181:athrow          
	}

	public final void onActivitySaveInstanceState(Activity activity, Bundle bundle)
	{
	//    0    0:return          
	}

	public final void onActivityStarted(Activity activity)
	{
		setActivity(activity);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #143 <Method void setActivity(Activity)>
	//    3    5:return          
	}

	public final void onActivityStopped(Activity activity)
	{
	//    0    0:return          
	}

	public final void zza(Application application, Context context)
	{
		if(!zzzv)
	//*   0    0:aload_0         
	//*   1    1:getfield        #49  <Field boolean zzzv>
	//*   2    4:ifne            58
		{
			application.registerActivityLifecycleCallbacks(((android.app.Application.ActivityLifecycleCallbacks) (this)));
	//    3    7:aload_1         
	//    4    8:aload_0         
	//    5    9:invokevirtual   #201 <Method void Application.registerActivityLifecycleCallbacks(android.app.Application$ActivityLifecycleCallbacks)>
			if(context instanceof Activity)
	//*   6   12:aload_2         
	//*   7   13:instanceof      #203 <Class Activity>
	//*   8   16:ifeq            27
				setActivity((Activity)context);
	//    9   19:aload_0         
	//   10   20:aload_2         
	//   11   21:checkcast       #203 <Class Activity>
	//   12   24:invokespecial   #143 <Method void setActivity(Activity)>
			mContext = ((Context) (application));
	//   13   27:aload_0         
	//   14   28:aload_1         
	//   15   29:putfield        #87  <Field Context mContext>
			application = ((Application) (zznk.zzayh));
	//   16   32:getstatic       #209 <Field zzna zznk.zzayh>
	//   17   35:astore_1        
			zzahw = ((Long)zzkb.zzik().zzd(((zzna) (application)))).longValue();
	//   18   36:aload_0         
	//   19   37:invokestatic    #215 <Method zzni zzkb.zzik()>
	//   20   40:aload_1         
	//   21   41:invokevirtual   #220 <Method Object zzni.zzd(zzna)>
	//   22   44:checkcast       #222 <Class Long>
	//   23   47:invokevirtual   #226 <Method long Long.longValue()>
	//   24   50:putfield        #168 <Field long zzahw>
			zzzv = true;
	//   25   53:aload_0         
	//   26   54:iconst_1        
	//   27   55:putfield        #49  <Field boolean zzzv>
		}
	//   28   58:return          
	}

	public final void zza(zzgj zzgj1)
	{
		synchronized(mLock)
	//*   0    0:aload_0         
	//*   1    1:getfield        #36  <Field Object mLock>
	//*   2    4:astore_2        
	//*   3    5:aload_2         
	//*   4    6:monitorenter    
		{
			zzaht.add(((Object) (zzgj1)));
	//    5    7:aload_0         
	//    6    8:getfield        #45  <Field List zzaht>
	//    7   11:aload_1         
	//    8   12:invokeinterface #230 <Method boolean List.add(Object)>
	//    9   17:pop             
		}
	//   10   18:aload_2         
	//   11   19:monitorexit     
		return;
	//   12   20:return          
		zzgj1;
	//   13   21:astore_1        
		obj;
	//   14   22:aload_2         
		JVM INSTR monitorexit ;
	//   15   23:monitorexit     
		throw zzgj1;
	//   16   24:aload_1         
	//   17   25:athrow          
	}

	private Activity mActivity;
	private Context mContext;
	private final Object mLock = new Object();
	private boolean zzahr;
	private boolean zzahs;
	private final List zzaht = new ArrayList();
	private final List zzahu = new ArrayList();
	private Runnable zzahv;
	private long zzahw;
	private boolean zzzv;
}

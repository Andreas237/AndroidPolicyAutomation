// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.media;

import android.content.*;
import android.content.pm.*;
import android.os.Handler;
import java.util.*;

// Referenced classes of package android.support.v7.media:
//			RegisteredMediaRouteProvider

final class RegisteredMediaRouteProviderWatcher
{

	public RegisteredMediaRouteProviderWatcher(Context context, Callback callback)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #25  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #27  <Class ArrayList>
	//    4    8:dup             
	//    5    9:invokespecial   #28  <Method void ArrayList()>
	//    6   12:putfield        #30  <Field ArrayList mProviders>
	//    7   15:aload_0         
	//    8   16:new             #32  <Class RegisteredMediaRouteProviderWatcher$1>
	//    9   19:dup             
	//   10   20:aload_0         
	//   11   21:invokespecial   #35  <Method void RegisteredMediaRouteProviderWatcher$1(RegisteredMediaRouteProviderWatcher)>
	//   12   24:putfield        #37  <Field BroadcastReceiver mScanPackagesReceiver>
	//   13   27:aload_0         
	//   14   28:new             #39  <Class RegisteredMediaRouteProviderWatcher$2>
	//   15   31:dup             
	//   16   32:aload_0         
	//   17   33:invokespecial   #40  <Method void RegisteredMediaRouteProviderWatcher$2(RegisteredMediaRouteProviderWatcher)>
	//   18   36:putfield        #42  <Field Runnable mScanPackagesRunnable>
		mContext = context;
	//   19   39:aload_0         
	//   20   40:aload_1         
	//   21   41:putfield        #44  <Field Context mContext>
		mCallback = callback;
	//   22   44:aload_0         
	//   23   45:aload_2         
	//   24   46:putfield        #46  <Field RegisteredMediaRouteProviderWatcher$Callback mCallback>
	//   25   49:aload_0         
	//   26   50:new             #48  <Class Handler>
	//   27   53:dup             
	//   28   54:invokespecial   #49  <Method void Handler()>
	//   29   57:putfield        #51  <Field Handler mHandler>
		mPackageManager = context.getPackageManager();
	//   30   60:aload_0         
	//   31   61:aload_1         
	//   32   62:invokevirtual   #57  <Method PackageManager Context.getPackageManager()>
	//   33   65:putfield        #59  <Field PackageManager mPackageManager>
	//   34   68:return          
	}

	private int findProvider(String s, String s1)
	{
		int j = mProviders.size();
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field ArrayList mProviders>
	//    2    4:invokevirtual   #66  <Method int ArrayList.size()>
	//    3    7:istore          4
		for(int i = 0; i < j; i++)
	//*   4    9:iconst_0        
	//*   5   10:istore_3        
	//*   6   11:iload_3         
	//*   7   12:iload           4
	//*   8   14:icmpge          45
			if(((RegisteredMediaRouteProvider)mProviders.get(i)).hasComponentName(s, s1))
	//*   9   17:aload_0         
	//*  10   18:getfield        #30  <Field ArrayList mProviders>
	//*  11   21:iload_3         
	//*  12   22:invokevirtual   #70  <Method Object ArrayList.get(int)>
	//*  13   25:checkcast       #72  <Class RegisteredMediaRouteProvider>
	//*  14   28:aload_1         
	//*  15   29:aload_2         
	//*  16   30:invokevirtual   #76  <Method boolean RegisteredMediaRouteProvider.hasComponentName(String, String)>
	//*  17   33:ifeq            38
				return i;
	//   18   36:iload_3         
	//   19   37:ireturn         

	//   20   38:iload_3         
	//   21   39:iconst_1        
	//   22   40:iadd            
	//   23   41:istore_3        
	//*  24   42:goto            11
		return -1;
	//   25   45:iconst_m1       
	//   26   46:ireturn         
	}

	void scanPackages()
	{
		if(!mRunning)
	//*   0    0:aload_0         
	//*   1    1:getfield        #79  <Field boolean mRunning>
	//*   2    4:ifne            8
			return;
	//    3    7:return          
		Object obj = ((Object) (new Intent("android.media.MediaRouteProviderService")));
	//    4    8:new             #81  <Class Intent>
	//    5   11:dup             
	//    6   12:ldc1            #83  <String "android.media.MediaRouteProviderService">
	//    7   14:invokespecial   #86  <Method void Intent(String)>
	//    8   17:astore_3        
		PackageManager packagemanager = mPackageManager;
	//    9   18:aload_0         
	//   10   19:getfield        #59  <Field PackageManager mPackageManager>
	//   11   22:astore          4
		int i = 0;
	//   12   24:iconst_0        
	//   13   25:istore_1        
		obj = ((Object) (packagemanager.queryIntentServices(((Intent) (obj)), 0).iterator()));
	//   14   26:aload           4
	//   15   28:aload_3         
	//   16   29:iconst_0        
	//   17   30:invokevirtual   #92  <Method List PackageManager.queryIntentServices(Intent, int)>
	//   18   33:invokeinterface #98  <Method Iterator List.iterator()>
	//   19   38:astore_3        
		do
		{
			if(!((Iterator) (obj)).hasNext())
				break;
	//   20   39:aload_3         
	//   21   40:invokeinterface #104 <Method boolean Iterator.hasNext()>
	//   22   45:ifeq            193
			Object obj1 = ((Object) (((ResolveInfo)((Iterator) (obj)).next()).serviceInfo));
	//   23   48:aload_3         
	//   24   49:invokeinterface #108 <Method Object Iterator.next()>
	//   25   54:checkcast       #110 <Class ResolveInfo>
	//   26   57:getfield        #114 <Field ServiceInfo ResolveInfo.serviceInfo>
	//   27   60:astore          4
			if(obj1 != null)
	//*  28   62:aload           4
	//*  29   64:ifnull          39
			{
				int j = findProvider(((ServiceInfo) (obj1)).packageName, ((ServiceInfo) (obj1)).name);
	//   30   67:aload_0         
	//   31   68:aload           4
	//   32   70:getfield        #120 <Field String ServiceInfo.packageName>
	//   33   73:aload           4
	//   34   75:getfield        #123 <Field String ServiceInfo.name>
	//   35   78:invokespecial   #125 <Method int findProvider(String, String)>
	//   36   81:istore_2        
				if(j < 0)
	//*  37   82:iload_2         
	//*  38   83:ifge            149
				{
					obj1 = ((Object) (new RegisteredMediaRouteProvider(mContext, new ComponentName(((ServiceInfo) (obj1)).packageName, ((ServiceInfo) (obj1)).name))));
	//   39   86:new             #72  <Class RegisteredMediaRouteProvider>
	//   40   89:dup             
	//   41   90:aload_0         
	//   42   91:getfield        #44  <Field Context mContext>
	//   43   94:new             #127 <Class ComponentName>
	//   44   97:dup             
	//   45   98:aload           4
	//   46  100:getfield        #120 <Field String ServiceInfo.packageName>
	//   47  103:aload           4
	//   48  105:getfield        #123 <Field String ServiceInfo.name>
	//   49  108:invokespecial   #130 <Method void ComponentName(String, String)>
	//   50  111:invokespecial   #133 <Method void RegisteredMediaRouteProvider(Context, ComponentName)>
	//   51  114:astore          4
					((RegisteredMediaRouteProvider) (obj1)).start();
	//   52  116:aload           4
	//   53  118:invokevirtual   #136 <Method void RegisteredMediaRouteProvider.start()>
					mProviders.add(i, obj1);
	//   54  121:aload_0         
	//   55  122:getfield        #30  <Field ArrayList mProviders>
	//   56  125:iload_1         
	//   57  126:aload           4
	//   58  128:invokevirtual   #140 <Method void ArrayList.add(int, Object)>
					mCallback.addProvider(((MediaRouteProvider) (obj1)));
	//   59  131:aload_0         
	//   60  132:getfield        #46  <Field RegisteredMediaRouteProviderWatcher$Callback mCallback>
	//   61  135:aload           4
	//   62  137:invokeinterface #146 <Method void RegisteredMediaRouteProviderWatcher$Callback.addProvider(MediaRouteProvider)>
					i++;
	//   63  142:iload_1         
	//   64  143:iconst_1        
	//   65  144:iadd            
	//   66  145:istore_1        
				} else
	//*  67  146:goto            39
				if(j >= i)
	//*  68  149:iload_2         
	//*  69  150:iload_1         
	//*  70  151:icmplt          39
				{
					RegisteredMediaRouteProvider registeredmediarouteprovider1 = (RegisteredMediaRouteProvider)mProviders.get(j);
	//   71  154:aload_0         
	//   72  155:getfield        #30  <Field ArrayList mProviders>
	//   73  158:iload_2         
	//   74  159:invokevirtual   #70  <Method Object ArrayList.get(int)>
	//   75  162:checkcast       #72  <Class RegisteredMediaRouteProvider>
	//   76  165:astore          4
					registeredmediarouteprovider1.start();
	//   77  167:aload           4
	//   78  169:invokevirtual   #136 <Method void RegisteredMediaRouteProvider.start()>
					registeredmediarouteprovider1.rebindIfDisconnected();
	//   79  172:aload           4
	//   80  174:invokevirtual   #149 <Method void RegisteredMediaRouteProvider.rebindIfDisconnected()>
					Collections.swap(((List) (mProviders)), j, i);
	//   81  177:aload_0         
	//   82  178:getfield        #30  <Field ArrayList mProviders>
	//   83  181:iload_2         
	//   84  182:iload_1         
	//   85  183:invokestatic    #155 <Method void Collections.swap(List, int, int)>
					i++;
	//   86  186:iload_1         
	//   87  187:iconst_1        
	//   88  188:iadd            
	//   89  189:istore_1        
				}
			}
		} while(true);
	//   90  190:goto            39
		if(i < mProviders.size())
	//*  91  193:iload_1         
	//*  92  194:aload_0         
	//*  93  195:getfield        #30  <Field ArrayList mProviders>
	//*  94  198:invokevirtual   #66  <Method int ArrayList.size()>
	//*  95  201:icmpge          261
		{
			for(int k = mProviders.size() - 1; k >= i; k--)
	//*  96  204:aload_0         
	//*  97  205:getfield        #30  <Field ArrayList mProviders>
	//*  98  208:invokevirtual   #66  <Method int ArrayList.size()>
	//*  99  211:iconst_1        
	//* 100  212:isub            
	//* 101  213:istore_2        
	//* 102  214:iload_2         
	//* 103  215:iload_1         
	//* 104  216:icmplt          261
			{
				RegisteredMediaRouteProvider registeredmediarouteprovider = (RegisteredMediaRouteProvider)mProviders.get(k);
	//  105  219:aload_0         
	//  106  220:getfield        #30  <Field ArrayList mProviders>
	//  107  223:iload_2         
	//  108  224:invokevirtual   #70  <Method Object ArrayList.get(int)>
	//  109  227:checkcast       #72  <Class RegisteredMediaRouteProvider>
	//  110  230:astore_3        
				mCallback.removeProvider(((MediaRouteProvider) (registeredmediarouteprovider)));
	//  111  231:aload_0         
	//  112  232:getfield        #46  <Field RegisteredMediaRouteProviderWatcher$Callback mCallback>
	//  113  235:aload_3         
	//  114  236:invokeinterface #158 <Method void RegisteredMediaRouteProviderWatcher$Callback.removeProvider(MediaRouteProvider)>
				mProviders.remove(((Object) (registeredmediarouteprovider)));
	//  115  241:aload_0         
	//  116  242:getfield        #30  <Field ArrayList mProviders>
	//  117  245:aload_3         
	//  118  246:invokevirtual   #162 <Method boolean ArrayList.remove(Object)>
	//  119  249:pop             
				registeredmediarouteprovider.stop();
	//  120  250:aload_3         
	//  121  251:invokevirtual   #165 <Method void RegisteredMediaRouteProvider.stop()>
			}

	//  122  254:iload_2         
	//  123  255:iconst_1        
	//  124  256:isub            
	//  125  257:istore_2        
		}
	//* 126  258:goto            214
	//  127  261:return          
	}

	public void start()
	{
		if(!mRunning)
	//*   0    0:aload_0         
	//*   1    1:getfield        #79  <Field boolean mRunning>
	//*   2    4:ifne            86
		{
			mRunning = true;
	//    3    7:aload_0         
	//    4    8:iconst_1        
	//    5    9:putfield        #79  <Field boolean mRunning>
			IntentFilter intentfilter = new IntentFilter();
	//    6   12:new             #167 <Class IntentFilter>
	//    7   15:dup             
	//    8   16:invokespecial   #168 <Method void IntentFilter()>
	//    9   19:astore_1        
			intentfilter.addAction("android.intent.action.PACKAGE_ADDED");
	//   10   20:aload_1         
	//   11   21:ldc1            #170 <String "android.intent.action.PACKAGE_ADDED">
	//   12   23:invokevirtual   #173 <Method void IntentFilter.addAction(String)>
			intentfilter.addAction("android.intent.action.PACKAGE_REMOVED");
	//   13   26:aload_1         
	//   14   27:ldc1            #175 <String "android.intent.action.PACKAGE_REMOVED">
	//   15   29:invokevirtual   #173 <Method void IntentFilter.addAction(String)>
			intentfilter.addAction("android.intent.action.PACKAGE_CHANGED");
	//   16   32:aload_1         
	//   17   33:ldc1            #177 <String "android.intent.action.PACKAGE_CHANGED">
	//   18   35:invokevirtual   #173 <Method void IntentFilter.addAction(String)>
			intentfilter.addAction("android.intent.action.PACKAGE_REPLACED");
	//   19   38:aload_1         
	//   20   39:ldc1            #179 <String "android.intent.action.PACKAGE_REPLACED">
	//   21   41:invokevirtual   #173 <Method void IntentFilter.addAction(String)>
			intentfilter.addAction("android.intent.action.PACKAGE_RESTARTED");
	//   22   44:aload_1         
	//   23   45:ldc1            #181 <String "android.intent.action.PACKAGE_RESTARTED">
	//   24   47:invokevirtual   #173 <Method void IntentFilter.addAction(String)>
			intentfilter.addDataScheme("package");
	//   25   50:aload_1         
	//   26   51:ldc1            #183 <String "package">
	//   27   53:invokevirtual   #186 <Method void IntentFilter.addDataScheme(String)>
			mContext.registerReceiver(mScanPackagesReceiver, intentfilter, ((String) (null)), mHandler);
	//   28   56:aload_0         
	//   29   57:getfield        #44  <Field Context mContext>
	//   30   60:aload_0         
	//   31   61:getfield        #37  <Field BroadcastReceiver mScanPackagesReceiver>
	//   32   64:aload_1         
	//   33   65:aconst_null     
	//   34   66:aload_0         
	//   35   67:getfield        #51  <Field Handler mHandler>
	//   36   70:invokevirtual   #190 <Method Intent Context.registerReceiver(BroadcastReceiver, IntentFilter, String, Handler)>
	//   37   73:pop             
			mHandler.post(mScanPackagesRunnable);
	//   38   74:aload_0         
	//   39   75:getfield        #51  <Field Handler mHandler>
	//   40   78:aload_0         
	//   41   79:getfield        #42  <Field Runnable mScanPackagesRunnable>
	//   42   82:invokevirtual   #194 <Method boolean Handler.post(Runnable)>
	//   43   85:pop             
		}
	//   44   86:return          
	}

	public void stop()
	{
		if(mRunning)
	//*   0    0:aload_0         
	//*   1    1:getfield        #79  <Field boolean mRunning>
	//*   2    4:ifeq            69
		{
			mRunning = false;
	//    3    7:aload_0         
	//    4    8:iconst_0        
	//    5    9:putfield        #79  <Field boolean mRunning>
			mContext.unregisterReceiver(mScanPackagesReceiver);
	//    6   12:aload_0         
	//    7   13:getfield        #44  <Field Context mContext>
	//    8   16:aload_0         
	//    9   17:getfield        #37  <Field BroadcastReceiver mScanPackagesReceiver>
	//   10   20:invokevirtual   #198 <Method void Context.unregisterReceiver(BroadcastReceiver)>
			mHandler.removeCallbacks(mScanPackagesRunnable);
	//   11   23:aload_0         
	//   12   24:getfield        #51  <Field Handler mHandler>
	//   13   27:aload_0         
	//   14   28:getfield        #42  <Field Runnable mScanPackagesRunnable>
	//   15   31:invokevirtual   #202 <Method void Handler.removeCallbacks(Runnable)>
			for(int i = mProviders.size() - 1; i >= 0; i--)
	//*  16   34:aload_0         
	//*  17   35:getfield        #30  <Field ArrayList mProviders>
	//*  18   38:invokevirtual   #66  <Method int ArrayList.size()>
	//*  19   41:iconst_1        
	//*  20   42:isub            
	//*  21   43:istore_1        
	//*  22   44:iload_1         
	//*  23   45:iflt            69
				((RegisteredMediaRouteProvider)mProviders.get(i)).stop();
	//   24   48:aload_0         
	//   25   49:getfield        #30  <Field ArrayList mProviders>
	//   26   52:iload_1         
	//   27   53:invokevirtual   #70  <Method Object ArrayList.get(int)>
	//   28   56:checkcast       #72  <Class RegisteredMediaRouteProvider>
	//   29   59:invokevirtual   #165 <Method void RegisteredMediaRouteProvider.stop()>

	//   30   62:iload_1         
	//   31   63:iconst_1        
	//   32   64:isub            
	//   33   65:istore_1        
		}
	//*  34   66:goto            44
	//   35   69:return          
	}

	private final Callback mCallback;
	private final Context mContext;
	private final Handler mHandler = new Handler();
	private final PackageManager mPackageManager;
	private final ArrayList mProviders = new ArrayList();
	private boolean mRunning;
	private final BroadcastReceiver mScanPackagesReceiver = new _cls1();
	private final Runnable mScanPackagesRunnable = new _cls2();

	private class _cls1 extends BroadcastReceiver
	{

		public void onReceive(Context context, Intent intent)
		{
			scanPackages();
		//    0    0:aload_0         
		//    1    1:getfield        #10  <Field RegisteredMediaRouteProviderWatcher this$0>
		//    2    4:invokevirtual   #21  <Method void RegisteredMediaRouteProviderWatcher.scanPackages()>
		//    3    7:return          
		}

		final RegisteredMediaRouteProviderWatcher this$0;

		_cls1()
		{
			this$0 = RegisteredMediaRouteProviderWatcher.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #10  <Field RegisteredMediaRouteProviderWatcher this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #13  <Method void BroadcastReceiver()>
		//    5    9:return          
		}
	}


	private class _cls2
		implements Runnable
	{

		public void run()
		{
			scanPackages();
		//    0    0:aload_0         
		//    1    1:getfield        #12  <Field RegisteredMediaRouteProviderWatcher this$0>
		//    2    4:invokevirtual   #22  <Method void RegisteredMediaRouteProviderWatcher.scanPackages()>
		//    3    7:return          
		}

		final RegisteredMediaRouteProviderWatcher this$0;

		_cls2()
		{
			this$0 = RegisteredMediaRouteProviderWatcher.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #12  <Field RegisteredMediaRouteProviderWatcher this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #15  <Method void Object()>
		//    5    9:return          
		}
	}


	private class Callback
	{

		public abstract void addProvider(MediaRouteProvider mediarouteprovider);

		public abstract void removeProvider(MediaRouteProvider mediarouteprovider);
	}

}

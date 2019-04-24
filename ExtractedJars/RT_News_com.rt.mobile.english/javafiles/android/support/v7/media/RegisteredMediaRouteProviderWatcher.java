// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.media;

import android.content.*;
import android.content.pm.*;
import android.os.Handler;
import java.util.*;

// Referenced classes of package android.support.v7.media:
//			RegisteredMediaRouteProvider, MediaRouteProvider

final class RegisteredMediaRouteProviderWatcher
{
	public static interface Callback
	{

		public abstract void addProvider(MediaRouteProvider mediarouteprovider);

		public abstract void removeProvider(MediaRouteProvider mediarouteprovider);
	}


	public RegisteredMediaRouteProviderWatcher(Context context, Callback callback)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #33  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #35  <Class ArrayList>
	//    4    8:dup             
	//    5    9:invokespecial   #36  <Method void ArrayList()>
	//    6   12:putfield        #38  <Field ArrayList mProviders>
	//    7   15:aload_0         
	//    8   16:new             #6   <Class RegisteredMediaRouteProviderWatcher$1>
	//    9   19:dup             
	//   10   20:aload_0         
	//   11   21:invokespecial   #41  <Method void RegisteredMediaRouteProviderWatcher$1(RegisteredMediaRouteProviderWatcher)>
	//   12   24:putfield        #43  <Field BroadcastReceiver mScanPackagesReceiver>
	//   13   27:aload_0         
	//   14   28:new             #8   <Class RegisteredMediaRouteProviderWatcher$2>
	//   15   31:dup             
	//   16   32:aload_0         
	//   17   33:invokespecial   #44  <Method void RegisteredMediaRouteProviderWatcher$2(RegisteredMediaRouteProviderWatcher)>
	//   18   36:putfield        #46  <Field Runnable mScanPackagesRunnable>
		mContext = context;
	//   19   39:aload_0         
	//   20   40:aload_1         
	//   21   41:putfield        #48  <Field Context mContext>
		mCallback = callback;
	//   22   44:aload_0         
	//   23   45:aload_2         
	//   24   46:putfield        #50  <Field RegisteredMediaRouteProviderWatcher$Callback mCallback>
	//   25   49:aload_0         
	//   26   50:new             #52  <Class Handler>
	//   27   53:dup             
	//   28   54:invokespecial   #53  <Method void Handler()>
	//   29   57:putfield        #55  <Field Handler mHandler>
		mPackageManager = context.getPackageManager();
	//   30   60:aload_0         
	//   31   61:aload_1         
	//   32   62:invokevirtual   #61  <Method PackageManager Context.getPackageManager()>
	//   33   65:putfield        #63  <Field PackageManager mPackageManager>
	//   34   68:return          
	}

	private int findProvider(String s, String s1)
	{
		int j = mProviders.size();
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field ArrayList mProviders>
	//    2    4:invokevirtual   #70  <Method int ArrayList.size()>
	//    3    7:istore          4
		for(int i = 0; i < j; i++)
	//*   4    9:iconst_0        
	//*   5   10:istore_3        
	//*   6   11:iload_3         
	//*   7   12:iload           4
	//*   8   14:icmpge          45
			if(((RegisteredMediaRouteProvider)mProviders.get(i)).hasComponentName(s, s1))
	//*   9   17:aload_0         
	//*  10   18:getfield        #38  <Field ArrayList mProviders>
	//*  11   21:iload_3         
	//*  12   22:invokevirtual   #74  <Method Object ArrayList.get(int)>
	//*  13   25:checkcast       #76  <Class RegisteredMediaRouteProvider>
	//*  14   28:aload_1         
	//*  15   29:aload_2         
	//*  16   30:invokevirtual   #80  <Method boolean RegisteredMediaRouteProvider.hasComponentName(String, String)>
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
	//*   1    1:getfield        #83  <Field boolean mRunning>
	//*   2    4:ifne            8
			return;
	//    3    7:return          
		Object obj = ((Object) (new Intent("android.media.MediaRouteProviderService")));
	//    4    8:new             #85  <Class Intent>
	//    5   11:dup             
	//    6   12:ldc1            #87  <String "android.media.MediaRouteProviderService">
	//    7   14:invokespecial   #90  <Method void Intent(String)>
	//    8   17:astore          4
		PackageManager packagemanager = mPackageManager;
	//    9   19:aload_0         
	//   10   20:getfield        #63  <Field PackageManager mPackageManager>
	//   11   23:astore          5
		int i = 0;
	//   12   25:iconst_0        
	//   13   26:istore_1        
		obj = ((Object) (packagemanager.queryIntentServices(((Intent) (obj)), 0).iterator()));
	//   14   27:aload           5
	//   15   29:aload           4
	//   16   31:iconst_0        
	//   17   32:invokevirtual   #96  <Method List PackageManager.queryIntentServices(Intent, int)>
	//   18   35:invokeinterface #102 <Method Iterator List.iterator()>
	//   19   40:astore          4
		do
		{
			if(!((Iterator) (obj)).hasNext())
				break;
	//   20   42:aload           4
	//   21   44:invokeinterface #108 <Method boolean Iterator.hasNext()>
	//   22   49:ifeq            210
			Object obj1 = ((Object) (((ResolveInfo)((Iterator) (obj)).next()).serviceInfo));
	//   23   52:aload           4
	//   24   54:invokeinterface #112 <Method Object Iterator.next()>
	//   25   59:checkcast       #114 <Class ResolveInfo>
	//   26   62:getfield        #118 <Field ServiceInfo ResolveInfo.serviceInfo>
	//   27   65:astore          5
			if(obj1 != null)
	//*  28   67:aload           5
	//*  29   69:ifnull          42
			{
				int i1 = findProvider(((ServiceInfo) (obj1)).packageName, ((ServiceInfo) (obj1)).name);
	//   30   72:aload_0         
	//   31   73:aload           5
	//   32   75:getfield        #124 <Field String ServiceInfo.packageName>
	//   33   78:aload           5
	//   34   80:getfield        #127 <Field String ServiceInfo.name>
	//   35   83:invokespecial   #129 <Method int findProvider(String, String)>
	//   36   86:istore_3        
				if(i1 < 0)
	//*  37   87:iload_3         
	//*  38   88:ifge            160
				{
					obj1 = ((Object) (new RegisteredMediaRouteProvider(mContext, new ComponentName(((ServiceInfo) (obj1)).packageName, ((ServiceInfo) (obj1)).name))));
	//   39   91:new             #76  <Class RegisteredMediaRouteProvider>
	//   40   94:dup             
	//   41   95:aload_0         
	//   42   96:getfield        #48  <Field Context mContext>
	//   43   99:new             #131 <Class ComponentName>
	//   44  102:dup             
	//   45  103:aload           5
	//   46  105:getfield        #124 <Field String ServiceInfo.packageName>
	//   47  108:aload           5
	//   48  110:getfield        #127 <Field String ServiceInfo.name>
	//   49  113:invokespecial   #134 <Method void ComponentName(String, String)>
	//   50  116:invokespecial   #137 <Method void RegisteredMediaRouteProvider(Context, ComponentName)>
	//   51  119:astore          5
					((RegisteredMediaRouteProvider) (obj1)).start();
	//   52  121:aload           5
	//   53  123:invokevirtual   #140 <Method void RegisteredMediaRouteProvider.start()>
					ArrayList arraylist = mProviders;
	//   54  126:aload_0         
	//   55  127:getfield        #38  <Field ArrayList mProviders>
	//   56  130:astore          6
					int j = i + 1;
	//   57  132:iload_1         
	//   58  133:iconst_1        
	//   59  134:iadd            
	//   60  135:istore_2        
					arraylist.add(i, obj1);
	//   61  136:aload           6
	//   62  138:iload_1         
	//   63  139:aload           5
	//   64  141:invokevirtual   #144 <Method void ArrayList.add(int, Object)>
					mCallback.addProvider(((MediaRouteProvider) (obj1)));
	//   65  144:aload_0         
	//   66  145:getfield        #50  <Field RegisteredMediaRouteProviderWatcher$Callback mCallback>
	//   67  148:aload           5
	//   68  150:invokeinterface #148 <Method void RegisteredMediaRouteProviderWatcher$Callback.addProvider(MediaRouteProvider)>
					i = j;
	//   69  155:iload_2         
	//   70  156:istore_1        
				} else
	//*  71  157:goto            42
				if(i1 >= i)
	//*  72  160:iload_3         
	//*  73  161:iload_1         
	//*  74  162:icmplt          42
				{
					Object obj2 = ((Object) ((RegisteredMediaRouteProvider)mProviders.get(i1)));
	//   75  165:aload_0         
	//   76  166:getfield        #38  <Field ArrayList mProviders>
	//   77  169:iload_3         
	//   78  170:invokevirtual   #74  <Method Object ArrayList.get(int)>
	//   79  173:checkcast       #76  <Class RegisteredMediaRouteProvider>
	//   80  176:astore          5
					((RegisteredMediaRouteProvider) (obj2)).start();
	//   81  178:aload           5
	//   82  180:invokevirtual   #140 <Method void RegisteredMediaRouteProvider.start()>
					((RegisteredMediaRouteProvider) (obj2)).rebindIfDisconnected();
	//   83  183:aload           5
	//   84  185:invokevirtual   #151 <Method void RegisteredMediaRouteProvider.rebindIfDisconnected()>
					obj2 = ((Object) (mProviders));
	//   85  188:aload_0         
	//   86  189:getfield        #38  <Field ArrayList mProviders>
	//   87  192:astore          5
					int k = i + 1;
	//   88  194:iload_1         
	//   89  195:iconst_1        
	//   90  196:iadd            
	//   91  197:istore_2        
					Collections.swap(((List) (obj2)), i1, i);
	//   92  198:aload           5
	//   93  200:iload_3         
	//   94  201:iload_1         
	//   95  202:invokestatic    #157 <Method void Collections.swap(List, int, int)>
					i = k;
	//   96  205:iload_2         
	//   97  206:istore_1        
				}
			}
		} while(true);
	//   98  207:goto            157
		if(i < mProviders.size())
	//*  99  210:iload_1         
	//* 100  211:aload_0         
	//* 101  212:getfield        #38  <Field ArrayList mProviders>
	//* 102  215:invokevirtual   #70  <Method int ArrayList.size()>
	//* 103  218:icmpge          282
		{
			for(int l = mProviders.size() - 1; l >= i; l--)
	//* 104  221:aload_0         
	//* 105  222:getfield        #38  <Field ArrayList mProviders>
	//* 106  225:invokevirtual   #70  <Method int ArrayList.size()>
	//* 107  228:iconst_1        
	//* 108  229:isub            
	//* 109  230:istore_2        
	//* 110  231:iload_2         
	//* 111  232:iload_1         
	//* 112  233:icmplt          282
			{
				RegisteredMediaRouteProvider registeredmediarouteprovider = (RegisteredMediaRouteProvider)mProviders.get(l);
	//  113  236:aload_0         
	//  114  237:getfield        #38  <Field ArrayList mProviders>
	//  115  240:iload_2         
	//  116  241:invokevirtual   #74  <Method Object ArrayList.get(int)>
	//  117  244:checkcast       #76  <Class RegisteredMediaRouteProvider>
	//  118  247:astore          4
				mCallback.removeProvider(((MediaRouteProvider) (registeredmediarouteprovider)));
	//  119  249:aload_0         
	//  120  250:getfield        #50  <Field RegisteredMediaRouteProviderWatcher$Callback mCallback>
	//  121  253:aload           4
	//  122  255:invokeinterface #160 <Method void RegisteredMediaRouteProviderWatcher$Callback.removeProvider(MediaRouteProvider)>
				mProviders.remove(((Object) (registeredmediarouteprovider)));
	//  123  260:aload_0         
	//  124  261:getfield        #38  <Field ArrayList mProviders>
	//  125  264:aload           4
	//  126  266:invokevirtual   #164 <Method boolean ArrayList.remove(Object)>
	//  127  269:pop             
				registeredmediarouteprovider.stop();
	//  128  270:aload           4
	//  129  272:invokevirtual   #167 <Method void RegisteredMediaRouteProvider.stop()>
			}

	//  130  275:iload_2         
	//  131  276:iconst_1        
	//  132  277:isub            
	//  133  278:istore_2        
		}
	//* 134  279:goto            231
	//  135  282:return          
	}

	public void start()
	{
		if(!mRunning)
	//*   0    0:aload_0         
	//*   1    1:getfield        #83  <Field boolean mRunning>
	//*   2    4:ifne            86
		{
			mRunning = true;
	//    3    7:aload_0         
	//    4    8:iconst_1        
	//    5    9:putfield        #83  <Field boolean mRunning>
			IntentFilter intentfilter = new IntentFilter();
	//    6   12:new             #169 <Class IntentFilter>
	//    7   15:dup             
	//    8   16:invokespecial   #170 <Method void IntentFilter()>
	//    9   19:astore_1        
			intentfilter.addAction("android.intent.action.PACKAGE_ADDED");
	//   10   20:aload_1         
	//   11   21:ldc1            #172 <String "android.intent.action.PACKAGE_ADDED">
	//   12   23:invokevirtual   #175 <Method void IntentFilter.addAction(String)>
			intentfilter.addAction("android.intent.action.PACKAGE_REMOVED");
	//   13   26:aload_1         
	//   14   27:ldc1            #177 <String "android.intent.action.PACKAGE_REMOVED">
	//   15   29:invokevirtual   #175 <Method void IntentFilter.addAction(String)>
			intentfilter.addAction("android.intent.action.PACKAGE_CHANGED");
	//   16   32:aload_1         
	//   17   33:ldc1            #179 <String "android.intent.action.PACKAGE_CHANGED">
	//   18   35:invokevirtual   #175 <Method void IntentFilter.addAction(String)>
			intentfilter.addAction("android.intent.action.PACKAGE_REPLACED");
	//   19   38:aload_1         
	//   20   39:ldc1            #181 <String "android.intent.action.PACKAGE_REPLACED">
	//   21   41:invokevirtual   #175 <Method void IntentFilter.addAction(String)>
			intentfilter.addAction("android.intent.action.PACKAGE_RESTARTED");
	//   22   44:aload_1         
	//   23   45:ldc1            #183 <String "android.intent.action.PACKAGE_RESTARTED">
	//   24   47:invokevirtual   #175 <Method void IntentFilter.addAction(String)>
			intentfilter.addDataScheme("package");
	//   25   50:aload_1         
	//   26   51:ldc1            #185 <String "package">
	//   27   53:invokevirtual   #188 <Method void IntentFilter.addDataScheme(String)>
			mContext.registerReceiver(mScanPackagesReceiver, intentfilter, ((String) (null)), mHandler);
	//   28   56:aload_0         
	//   29   57:getfield        #48  <Field Context mContext>
	//   30   60:aload_0         
	//   31   61:getfield        #43  <Field BroadcastReceiver mScanPackagesReceiver>
	//   32   64:aload_1         
	//   33   65:aconst_null     
	//   34   66:aload_0         
	//   35   67:getfield        #55  <Field Handler mHandler>
	//   36   70:invokevirtual   #192 <Method Intent Context.registerReceiver(BroadcastReceiver, IntentFilter, String, Handler)>
	//   37   73:pop             
			mHandler.post(mScanPackagesRunnable);
	//   38   74:aload_0         
	//   39   75:getfield        #55  <Field Handler mHandler>
	//   40   78:aload_0         
	//   41   79:getfield        #46  <Field Runnable mScanPackagesRunnable>
	//   42   82:invokevirtual   #196 <Method boolean Handler.post(Runnable)>
	//   43   85:pop             
		}
	//   44   86:return          
	}

	public void stop()
	{
		if(mRunning)
	//*   0    0:aload_0         
	//*   1    1:getfield        #83  <Field boolean mRunning>
	//*   2    4:ifeq            69
		{
			mRunning = false;
	//    3    7:aload_0         
	//    4    8:iconst_0        
	//    5    9:putfield        #83  <Field boolean mRunning>
			mContext.unregisterReceiver(mScanPackagesReceiver);
	//    6   12:aload_0         
	//    7   13:getfield        #48  <Field Context mContext>
	//    8   16:aload_0         
	//    9   17:getfield        #43  <Field BroadcastReceiver mScanPackagesReceiver>
	//   10   20:invokevirtual   #200 <Method void Context.unregisterReceiver(BroadcastReceiver)>
			mHandler.removeCallbacks(mScanPackagesRunnable);
	//   11   23:aload_0         
	//   12   24:getfield        #55  <Field Handler mHandler>
	//   13   27:aload_0         
	//   14   28:getfield        #46  <Field Runnable mScanPackagesRunnable>
	//   15   31:invokevirtual   #204 <Method void Handler.removeCallbacks(Runnable)>
			for(int i = mProviders.size() - 1; i >= 0; i--)
	//*  16   34:aload_0         
	//*  17   35:getfield        #38  <Field ArrayList mProviders>
	//*  18   38:invokevirtual   #70  <Method int ArrayList.size()>
	//*  19   41:iconst_1        
	//*  20   42:isub            
	//*  21   43:istore_1        
	//*  22   44:iload_1         
	//*  23   45:iflt            69
				((RegisteredMediaRouteProvider)mProviders.get(i)).stop();
	//   24   48:aload_0         
	//   25   49:getfield        #38  <Field ArrayList mProviders>
	//   26   52:iload_1         
	//   27   53:invokevirtual   #74  <Method Object ArrayList.get(int)>
	//   28   56:checkcast       #76  <Class RegisteredMediaRouteProvider>
	//   29   59:invokevirtual   #167 <Method void RegisteredMediaRouteProvider.stop()>

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
	private final BroadcastReceiver mScanPackagesReceiver = new BroadcastReceiver() {

		public void onReceive(Context context1, Intent intent)
		{
			scanPackages();
		//    0    0:aload_0         
		//    1    1:getfield        #12  <Field RegisteredMediaRouteProviderWatcher this$0>
		//    2    4:invokevirtual   #21  <Method void RegisteredMediaRouteProviderWatcher.scanPackages()>
		//    3    7:return          
		}

		final RegisteredMediaRouteProviderWatcher this$0;

			
			{
				this$0 = RegisteredMediaRouteProviderWatcher.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #12  <Field RegisteredMediaRouteProviderWatcher this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #15  <Method void BroadcastReceiver()>
			//    5    9:return          
			}
	}
;
	private final Runnable mScanPackagesRunnable = new Runnable() {

		public void run()
		{
			scanPackages();
		//    0    0:aload_0         
		//    1    1:getfield        #14  <Field RegisteredMediaRouteProviderWatcher this$0>
		//    2    4:invokevirtual   #22  <Method void RegisteredMediaRouteProviderWatcher.scanPackages()>
		//    3    7:return          
		}

		final RegisteredMediaRouteProviderWatcher this$0;

			
			{
				this$0 = RegisteredMediaRouteProviderWatcher.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #14  <Field RegisteredMediaRouteProviderWatcher this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #17  <Method void Object()>
			//    5    9:return          
			}
	}
;
}

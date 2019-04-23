// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.places.internal;

import android.content.*;
import android.content.pm.PackageManager;
import android.net.wifi.*;
import android.os.SystemClock;
import android.text.TextUtils;
import com.facebook.internal.Validate;
import java.util.*;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.facebook.places.internal:
//			WifiScanner, ScannerException, LocationPackageRequestParams, WifiScanResult

public class WifiScannerImpl
	implements WifiScanner
{
	private class ScanResultBroadcastReceiver extends BroadcastReceiver
	{

		public void onReceive(Context context1, Intent intent)
		{
			if(intent != null && "android.net.wifi.SCAN_RESULTS".equals(((Object) (intent.getAction()))))
		//*   0    0:aload_2         
		//*   1    1:ifnull          51
		//*   2    4:ldc1            #24  <String "android.net.wifi.SCAN_RESULTS">
		//*   3    6:aload_2         
		//*   4    7:invokevirtual   #30  <Method String Intent.getAction()>
		//*   5   10:invokevirtual   #36  <Method boolean String.equals(Object)>
		//*   6   13:ifeq            51
			{
				synchronized(scanLock)
		//*   7   16:aload_0         
		//*   8   17:getfield        #13  <Field WifiScannerImpl this$0>
		//*   9   20:invokestatic    #40  <Method Object WifiScannerImpl.access$100(WifiScannerImpl)>
		//*  10   23:astore_1        
		//*  11   24:aload_1         
		//*  12   25:monitorenter    
				{
					scanLock.notify();
		//   13   26:aload_0         
		//   14   27:getfield        #13  <Field WifiScannerImpl this$0>
		//   15   30:invokestatic    #40  <Method Object WifiScannerImpl.access$100(WifiScannerImpl)>
		//   16   33:invokevirtual   #45  <Method void Object.notify()>
				}
		//   17   36:aload_1         
		//   18   37:monitorexit     
				unregisterBroadcastReceiver();
		//   19   38:aload_0         
		//   20   39:getfield        #13  <Field WifiScannerImpl this$0>
		//   21   42:invokestatic    #48  <Method void WifiScannerImpl.access$200(WifiScannerImpl)>
				return;
		//   22   45:return          
			} else
		//*  23   46:astore_2        
		//*  24   47:aload_1         
		//*  25   48:monitorexit     
		//*  26   49:aload_2         
		//*  27   50:athrow          
			{
				return;
		//   28   51:return          
			}
			intent;
			context1;
			JVM INSTR monitorexit ;
			throw intent;
		}

		final WifiScannerImpl this$0;

		private ScanResultBroadcastReceiver()
		{
			this$0 = WifiScannerImpl.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #13  <Field WifiScannerImpl this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #16  <Method void BroadcastReceiver()>
		//    5    9:return          
		}

	}


	WifiScannerImpl(Context context1, LocationPackageRequestParams locationpackagerequestparams)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #33  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #4   <Class Object>
	//    4    8:dup             
	//    5    9:invokespecial   #33  <Method void Object()>
	//    6   12:putfield        #35  <Field Object scanLock>
		context = context1;
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:putfield        #37  <Field Context context>
		params = locationpackagerequestparams;
	//   10   20:aload_0         
	//   11   21:aload_2         
	//   12   22:putfield        #39  <Field LocationPackageRequestParams params>
	//   13   25:return          
	}

	private static void filterResults(List list, int i)
	{
		if(list.size() > i)
	//*   0    0:aload_0         
	//*   1    1:invokeinterface #55  <Method int List.size()>
	//*   2    6:iload_1         
	//*   3    7:icmple          39
		{
			Collections.sort(list, new Comparator() {

				public int compare(ScanResult scanresult, ScanResult scanresult1)
				{
					return scanresult1.level - scanresult.level;
				//    0    0:aload_2         
				//    1    1:getfield        #25  <Field int ScanResult.level>
				//    2    4:aload_1         
				//    3    5:getfield        #25  <Field int ScanResult.level>
				//    4    8:isub            
				//    5    9:ireturn         
				}

				public volatile int compare(Object obj, Object obj1)
				{
					return compare((ScanResult)obj, (ScanResult)obj1);
				//    0    0:aload_0         
				//    1    1:aload_1         
				//    2    2:checkcast       #21  <Class ScanResult>
				//    3    5:aload_2         
				//    4    6:checkcast       #21  <Class ScanResult>
				//    5    9:invokevirtual   #28  <Method int compare(ScanResult, ScanResult)>
				//    6   12:ireturn         
				}

			}
);
	//    4   10:aload_0         
	//    5   11:new             #8   <Class WifiScannerImpl$1>
	//    6   14:dup             
	//    7   15:invokespecial   #56  <Method void WifiScannerImpl$1()>
	//    8   18:invokestatic    #62  <Method void Collections.sort(List, Comparator)>
			list.subList(i, list.size()).clear();
	//    9   21:aload_0         
	//   10   22:iload_1         
	//   11   23:aload_0         
	//   12   24:invokeinterface #55  <Method int List.size()>
	//   13   29:invokeinterface #66  <Method List List.subList(int, int)>
	//   14   34:invokeinterface #69  <Method void List.clear()>
		}
	//   15   39:return          
	}

	private static List filterWifiScanResultsByMaxAge(List list, long l)
	{
		ArrayList arraylist = new ArrayList();
	//    0    0:new             #75  <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #76  <Method void ArrayList()>
	//    3    7:astore          9
		if(list != null)
	//*   4    9:aload_0         
	//*   5   10:ifnull          118
		{
			if(android.os.Build.VERSION.SDK_INT < 17)
	//*   6   13:getstatic       #82  <Field int android.os.Build$VERSION.SDK_INT>
	//*   7   16:bipush          17
	//*   8   18:icmpge          33
			{
				((List) (arraylist)).addAll(((java.util.Collection) (list)));
	//    9   21:aload           9
	//   10   23:aload_0         
	//   11   24:invokeinterface #86  <Method boolean List.addAll(java.util.Collection)>
	//   12   29:pop             
				return ((List) (arraylist));
	//   13   30:aload           9
	//   14   32:areturn         
			}
			long l3 = SystemClock.elapsedRealtime();
	//   15   33:invokestatic    #92  <Method long SystemClock.elapsedRealtime()>
	//   16   36:lstore          7
			list = ((List) (list.iterator()));
	//   17   38:aload_0         
	//   18   39:invokeinterface #96  <Method Iterator List.iterator()>
	//   19   44:astore_0        
			do
			{
				if(!((Iterator) (list)).hasNext())
					break;
	//   20   45:aload_0         
	//   21   46:invokeinterface #102 <Method boolean Iterator.hasNext()>
	//   22   51:ifeq            118
				ScanResult scanresult = (ScanResult)((Iterator) (list)).next();
	//   23   54:aload_0         
	//   24   55:invokeinterface #106 <Method Object Iterator.next()>
	//   25   60:checkcast       #108 <Class ScanResult>
	//   26   63:astore          10
				long l2 = l3 - scanresult.timestamp / 1000L;
	//   27   65:lload           7
	//   28   67:aload           10
	//   29   69:getfield        #112 <Field long ScanResult.timestamp>
	//   30   72:ldc2w           #113 <Long 1000L>
	//   31   75:ldiv            
	//   32   76:lsub            
	//   33   77:lstore          5
				long l1 = l2;
	//   34   79:lload           5
	//   35   81:lstore_3        
				if(l2 < 0L)
	//*  36   82:lload           5
	//*  37   84:lconst_0        
	//*  38   85:lcmp            
	//*  39   86:ifge            99
					l1 = System.currentTimeMillis() - scanresult.timestamp;
	//   40   89:invokestatic    #119 <Method long System.currentTimeMillis()>
	//   41   92:aload           10
	//   42   94:getfield        #112 <Field long ScanResult.timestamp>
	//   43   97:lsub            
	//   44   98:lstore_3        
				if(l1 < l)
	//*  45   99:lload_3         
	//*  46  100:lload_1         
	//*  47  101:lcmp            
	//*  48  102:ifge            45
					((List) (arraylist)).add(((Object) (scanresult)));
	//   49  105:aload           9
	//   50  107:aload           10
	//   51  109:invokeinterface #123 <Method boolean List.add(Object)>
	//   52  114:pop             
			} while(true);
	//   53  115:goto            45
		}
		return ((List) (arraylist));
	//   54  118:aload           9
	//   55  120:areturn         
	}

	private List getActiveScanResults()
		throws ScannerException
	{
		Object obj1;
		obj1 = null;
	//    0    0:aconst_null     
	//    1    1:astore_3        
		obj = ((Object) (obj1));
	//    2    2:aload_3         
	//    3    3:astore_2        
		boolean flag;
		if(!Validate.hasChangeWifiStatePermission(context))
			break MISSING_BLOCK_LABEL_80;
	//    4    4:aload_0         
	//    5    5:getfield        #37  <Field Context context>
	//    6    8:invokestatic    #138 <Method boolean Validate.hasChangeWifiStatePermission(Context)>
	//    7   11:ifeq            80
		registerBroadcastReceiver();
	//    8   14:aload_0         
	//    9   15:invokespecial   #141 <Method void registerBroadcastReceiver()>
		flag = wifiManager.startScan();
	//   10   18:aload_0         
	//   11   19:getfield        #143 <Field WifiManager wifiManager>
	//   12   22:invokevirtual   #148 <Method boolean WifiManager.startScan()>
	//   13   25:istore_1        
		obj = ((Object) (obj1));
	//   14   26:aload_3         
	//   15   27:astore_2        
		if(!flag)
			break MISSING_BLOCK_LABEL_80;
	//   16   28:iload_1         
	//   17   29:ifeq            80
		synchronized(scanLock)
	//*  18   32:aload_0         
	//*  19   33:getfield        #35  <Field Object scanLock>
	//*  20   36:astore_2        
	//*  21   37:aload_2         
	//*  22   38:monitorenter    
		{
			scanLock.wait(params.getWifiScanTimeoutMs());
	//   23   39:aload_0         
	//   24   40:getfield        #35  <Field Object scanLock>
	//   25   43:aload_0         
	//   26   44:getfield        #39  <Field LocationPackageRequestParams params>
	//   27   47:invokevirtual   #153 <Method long LocationPackageRequestParams.getWifiScanTimeoutMs()>
	//   28   50:invokevirtual   #157 <Method void Object.wait(long)>
		}
	//   29   53:aload_2         
	//   30   54:monitorexit     
		break MISSING_BLOCK_LABEL_65;
	//   31   55:goto            65
		exception1;
	//   32   58:astore          4
		obj;
	//   33   60:aload_2         
		JVM INSTR monitorexit ;
	//   34   61:monitorexit     
		Exception exception;
		try
		{
			throw exception1;
	//   35   62:aload           4
	//   36   64:athrow          
		}
	//*  37   65:aload_0         
	//*  38   66:invokespecial   #160 <Method List getCachedScanResults()>
	//*  39   69:astore_2        
	//*  40   70:goto            80
	//*  41   73:astore_2        
	//*  42   74:aload_0         
	//*  43   75:invokespecial   #47  <Method void unregisterBroadcastReceiver()>
	//*  44   78:aload_2         
	//*  45   79:athrow          
	//*  46   80:aload_0         
	//*  47   81:invokespecial   #47  <Method void unregisterBroadcastReceiver()>
	//*  48   84:aload_2         
	//*  49   85:areturn         
	//*  50   86:astore_2        
	//*  51   87:aload_3         
	//*  52   88:astore_2        
	//*  53   89:goto            80
		catch(InterruptedException interruptedexception) { }
	//   54   92:astore_2        
		obj = ((Object) (getCachedScanResults()));
		break MISSING_BLOCK_LABEL_80;
		obj;
		unregisterBroadcastReceiver();
		throw obj;
_L2:
		unregisterBroadcastReceiver();
		return ((List) (obj));
		exception;
		exception = ((Exception) (obj1));
		if(true) goto _L2; else goto _L1
_L1:
	//*  55   93:goto            65
	}

	private List getCachedScanResults()
		throws ScannerException
	{
		ArrayList arraylist;
		Object obj;
		obj = ((Object) (filterWifiScanResultsByMaxAge(wifiManager.getScanResults(), params.getWifiScanMaxAgeMs())));
	//    0    0:aload_0         
	//    1    1:getfield        #143 <Field WifiManager wifiManager>
	//    2    4:invokevirtual   #165 <Method List WifiManager.getScanResults()>
	//    3    7:aload_0         
	//    4    8:getfield        #39  <Field LocationPackageRequestParams params>
	//    5   11:invokevirtual   #168 <Method long LocationPackageRequestParams.getWifiScanMaxAgeMs()>
	//    6   14:invokestatic    #170 <Method List filterWifiScanResultsByMaxAge(List, long)>
	//    7   17:astore_2        
		filterResults(((List) (obj)), params.getWifiMaxScanResults());
	//    8   18:aload_2         
	//    9   19:aload_0         
	//   10   20:getfield        #39  <Field LocationPackageRequestParams params>
	//   11   23:invokevirtual   #173 <Method int LocationPackageRequestParams.getWifiMaxScanResults()>
	//   12   26:invokestatic    #175 <Method void filterResults(List, int)>
		arraylist = new ArrayList(((List) (obj)).size());
	//   13   29:new             #75  <Class ArrayList>
	//   14   32:dup             
	//   15   33:aload_2         
	//   16   34:invokeinterface #55  <Method int List.size()>
	//   17   39:invokespecial   #178 <Method void ArrayList(int)>
	//   18   42:astore_1        
		obj = ((Object) (((List) (obj)).iterator()));
	//   19   43:aload_2         
	//   20   44:invokeinterface #96  <Method Iterator List.iterator()>
	//   21   49:astore_2        
_L2:
		WifiScanResult wifiscanresult;
		ScanResult scanresult;
		do
		{
			if(!((Iterator) (obj)).hasNext())
				break MISSING_BLOCK_LABEL_170;
	//   22   50:aload_2         
	//   23   51:invokeinterface #102 <Method boolean Iterator.hasNext()>
	//   24   56:ifeq            170
			scanresult = (ScanResult)((Iterator) (obj)).next();
	//   25   59:aload_2         
	//   26   60:invokeinterface #106 <Method Object Iterator.next()>
	//   27   65:checkcast       #108 <Class ScanResult>
	//   28   68:astore_3        
		} while(isWifiSsidBlacklisted(scanresult.SSID));
	//   29   69:aload_3         
	//   30   70:getfield        #181 <Field String ScanResult.SSID>
	//   31   73:invokestatic    #185 <Method boolean isWifiSsidBlacklisted(String)>
	//   32   76:ifne            50
		wifiscanresult = new WifiScanResult();
	//   33   79:new             #187 <Class WifiScanResult>
	//   34   82:dup             
	//   35   83:invokespecial   #188 <Method void WifiScanResult()>
	//   36   86:astore          4
		wifiscanresult.bssid = scanresult.BSSID;
	//   37   88:aload           4
	//   38   90:aload_3         
	//   39   91:getfield        #191 <Field String ScanResult.BSSID>
	//   40   94:putfield        #194 <Field String WifiScanResult.bssid>
		wifiscanresult.ssid = scanresult.SSID;
	//   41   97:aload           4
	//   42   99:aload_3         
	//   43  100:getfield        #181 <Field String ScanResult.SSID>
	//   44  103:putfield        #197 <Field String WifiScanResult.ssid>
		wifiscanresult.rssi = scanresult.level;
	//   45  106:aload           4
	//   46  108:aload_3         
	//   47  109:getfield        #200 <Field int ScanResult.level>
	//   48  112:putfield        #203 <Field int WifiScanResult.rssi>
		wifiscanresult.frequency = scanresult.frequency;
	//   49  115:aload           4
	//   50  117:aload_3         
	//   51  118:getfield        #206 <Field int ScanResult.frequency>
	//   52  121:putfield        #207 <Field int WifiScanResult.frequency>
		if(android.os.Build.VERSION.SDK_INT >= 17)
	//*  53  124:getstatic       #82  <Field int android.os.Build$VERSION.SDK_INT>
	//*  54  127:bipush          17
	//*  55  129:icmplt          150
		{
			wifiscanresult.timestampMs = TimeUnit.MICROSECONDS.toMillis(scanresult.timestamp);
	//   56  132:aload           4
	//   57  134:getstatic       #213 <Field TimeUnit TimeUnit.MICROSECONDS>
	//   58  137:aload_3         
	//   59  138:getfield        #112 <Field long ScanResult.timestamp>
	//   60  141:invokevirtual   #217 <Method long TimeUnit.toMillis(long)>
	//   61  144:putfield        #220 <Field long WifiScanResult.timestampMs>
			break MISSING_BLOCK_LABEL_158;
	//   62  147:goto            158
		}
		wifiscanresult.timestampMs = SystemClock.elapsedRealtime();
	//   63  150:aload           4
	//   64  152:invokestatic    #92  <Method long SystemClock.elapsedRealtime()>
	//   65  155:putfield        #220 <Field long WifiScanResult.timestampMs>
		((List) (arraylist)).add(((Object) (wifiscanresult)));
	//   66  158:aload_1         
	//   67  159:aload           4
	//   68  161:invokeinterface #123 <Method boolean List.add(Object)>
	//   69  166:pop             
		if(true) goto _L2; else goto _L1
	//   70  167:goto            50
_L1:
		return ((List) (arraylist));
	//   71  170:aload_1         
	//   72  171:areturn         
		Exception exception;
		exception;
	//   73  172:astore_1        
		throw new ScannerException(ScannerException.Type.UNKNOWN_ERROR, exception);
	//   74  173:new             #128 <Class ScannerException>
	//   75  176:dup             
	//   76  177:getstatic       #226 <Field ScannerException$Type ScannerException$Type.UNKNOWN_ERROR>
	//   77  180:aload_1         
	//   78  181:invokespecial   #229 <Method void ScannerException(ScannerException$Type, Exception)>
	//   79  184:athrow          
	}

	private boolean isWifiScanningAlwaysOn()
	{
		if(android.os.Build.VERSION.SDK_INT >= 18)
	//*   0    0:getstatic       #82  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          18
	//*   2    5:icmplt          16
			return wifiManager.isScanAlwaysAvailable();
	//    3    8:aload_0         
	//    4    9:getfield        #143 <Field WifiManager wifiManager>
	//    5   12:invokevirtual   #233 <Method boolean WifiManager.isScanAlwaysAvailable()>
	//    6   15:ireturn         
		else
			return false;
	//    7   16:iconst_0        
	//    8   17:ireturn         
	}

	private static boolean isWifiSsidBlacklisted(String s)
	{
		return s != null && (s.endsWith("_nomap") || s.contains("_optout"));
	//    0    0:aload_0         
	//    1    1:ifnull          24
	//    2    4:aload_0         
	//    3    5:ldc1            #15  <String "_nomap">
	//    4    7:invokevirtual   #238 <Method boolean String.endsWith(String)>
	//    5   10:ifne            22
	//    6   13:aload_0         
	//    7   14:ldc1            #18  <String "_optout">
	//    8   16:invokevirtual   #242 <Method boolean String.contains(CharSequence)>
	//    9   19:ifeq            24
	//   10   22:iconst_1        
	//   11   23:ireturn         
	//   12   24:iconst_0        
	//   13   25:ireturn         
	}

	private void registerBroadcastReceiver()
	{
		if(broadcastReceiver != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #244 <Field WifiScannerImpl$ScanResultBroadcastReceiver broadcastReceiver>
	//*   2    4:ifnull          11
			unregisterBroadcastReceiver();
	//    3    7:aload_0         
	//    4    8:invokespecial   #47  <Method void unregisterBroadcastReceiver()>
		broadcastReceiver = new ScanResultBroadcastReceiver();
	//    5   11:aload_0         
	//    6   12:new             #10  <Class WifiScannerImpl$ScanResultBroadcastReceiver>
	//    7   15:dup             
	//    8   16:aload_0         
	//    9   17:aconst_null     
	//   10   18:invokespecial   #247 <Method void WifiScannerImpl$ScanResultBroadcastReceiver(WifiScannerImpl, WifiScannerImpl$1)>
	//   11   21:putfield        #244 <Field WifiScannerImpl$ScanResultBroadcastReceiver broadcastReceiver>
		IntentFilter intentfilter = new IntentFilter();
	//   12   24:new             #249 <Class IntentFilter>
	//   13   27:dup             
	//   14   28:invokespecial   #250 <Method void IntentFilter()>
	//   15   31:astore_1        
		intentfilter.addAction("android.net.wifi.SCAN_RESULTS");
	//   16   32:aload_1         
	//   17   33:ldc1            #252 <String "android.net.wifi.SCAN_RESULTS">
	//   18   35:invokevirtual   #256 <Method void IntentFilter.addAction(String)>
		context.registerReceiver(((BroadcastReceiver) (broadcastReceiver)), intentfilter);
	//   19   38:aload_0         
	//   20   39:getfield        #37  <Field Context context>
	//   21   42:aload_0         
	//   22   43:getfield        #244 <Field WifiScannerImpl$ScanResultBroadcastReceiver broadcastReceiver>
	//   23   46:aload_1         
	//   24   47:invokevirtual   #262 <Method Intent Context.registerReceiver(BroadcastReceiver, IntentFilter)>
	//   25   50:pop             
	//   26   51:return          
	}

	private void unregisterBroadcastReceiver()
	{
		ScanResultBroadcastReceiver scanresultbroadcastreceiver = broadcastReceiver;
	//    0    0:aload_0         
	//    1    1:getfield        #244 <Field WifiScannerImpl$ScanResultBroadcastReceiver broadcastReceiver>
	//    2    4:astore_1        
		if(scanresultbroadcastreceiver != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          22
		{
			try
			{
				context.unregisterReceiver(((BroadcastReceiver) (scanresultbroadcastreceiver)));
	//    5    9:aload_0         
	//    6   10:getfield        #37  <Field Context context>
	//    7   13:aload_1         
	//    8   14:invokevirtual   #266 <Method void Context.unregisterReceiver(BroadcastReceiver)>
			}
	//*   9   17:aload_0         
	//*  10   18:aconst_null     
	//*  11   19:putfield        #244 <Field WifiScannerImpl$ScanResultBroadcastReceiver broadcastReceiver>
	//*  12   22:return          
			catch(Exception exception) { }
	//   13   23:astore_1        
			broadcastReceiver = null;
		}
	//*  14   24:goto            17
	}

	public WifiScanResult getConnectedWifi()
		throws ScannerException
	{
		WifiInfo wifiinfo;
		WifiScanResult wifiscanresult;
		try
		{
			wifiinfo = wifiManager.getConnectionInfo();
	//    0    0:aload_0         
	//    1    1:getfield        #143 <Field WifiManager wifiManager>
	//    2    4:invokevirtual   #272 <Method WifiInfo WifiManager.getConnectionInfo()>
	//    3    7:astore_1        
		}
	//*   4    8:aload_1         
	//*   5    9:ifnull          102
	//*   6   12:aload_1         
	//*   7   13:invokevirtual   #278 <Method String WifiInfo.getBSSID()>
	//*   8   16:invokestatic    #283 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*   9   19:ifne            102
	//*  10   22:aload_1         
	//*  11   23:invokevirtual   #287 <Method SupplicantState WifiInfo.getSupplicantState()>
	//*  12   26:getstatic       #293 <Field SupplicantState SupplicantState.COMPLETED>
	//*  13   29:if_acmpne       102
	//*  14   32:aload_1         
	//*  15   33:invokevirtual   #296 <Method String WifiInfo.getSSID()>
	//*  16   36:invokestatic    #185 <Method boolean isWifiSsidBlacklisted(String)>
	//*  17   39:ifeq            45
	//*  18   42:goto            102
	//*  19   45:new             #187 <Class WifiScanResult>
	//*  20   48:dup             
	//*  21   49:invokespecial   #188 <Method void WifiScanResult()>
	//*  22   52:astore_2        
	//*  23   53:aload_2         
	//*  24   54:aload_1         
	//*  25   55:invokevirtual   #278 <Method String WifiInfo.getBSSID()>
	//*  26   58:putfield        #194 <Field String WifiScanResult.bssid>
	//*  27   61:aload_2         
	//*  28   62:aload_1         
	//*  29   63:invokevirtual   #296 <Method String WifiInfo.getSSID()>
	//*  30   66:putfield        #197 <Field String WifiScanResult.ssid>
	//*  31   69:aload_2         
	//*  32   70:aload_1         
	//*  33   71:invokevirtual   #299 <Method int WifiInfo.getRssi()>
	//*  34   74:putfield        #203 <Field int WifiScanResult.rssi>
	//*  35   77:aload_2         
	//*  36   78:invokestatic    #92  <Method long SystemClock.elapsedRealtime()>
	//*  37   81:putfield        #220 <Field long WifiScanResult.timestampMs>
	//*  38   84:getstatic       #82  <Field int android.os.Build$VERSION.SDK_INT>
	//*  39   87:bipush          21
	//*  40   89:icmplt          100
	//*  41   92:aload_2         
	//*  42   93:aload_1         
	//*  43   94:invokevirtual   #302 <Method int WifiInfo.getFrequency()>
	//*  44   97:putfield        #207 <Field int WifiScanResult.frequency>
	//*  45  100:aload_2         
	//*  46  101:areturn         
	//*  47  102:aconst_null     
	//*  48  103:areturn         
		catch(Exception exception)
	//*  49  104:astore_1        
		{
			throw new ScannerException(ScannerException.Type.UNKNOWN_ERROR, exception);
	//   50  105:new             #128 <Class ScannerException>
	//   51  108:dup             
	//   52  109:getstatic       #226 <Field ScannerException$Type ScannerException$Type.UNKNOWN_ERROR>
	//   53  112:aload_1         
	//   54  113:invokespecial   #229 <Method void ScannerException(ScannerException$Type, Exception)>
	//   55  116:athrow          
		}
		if(wifiinfo == null)
			break MISSING_BLOCK_LABEL_102;
		if(TextUtils.isEmpty(((CharSequence) (wifiinfo.getBSSID()))) || wifiinfo.getSupplicantState() != SupplicantState.COMPLETED || isWifiSsidBlacklisted(wifiinfo.getSSID()))
			break MISSING_BLOCK_LABEL_102;
		wifiscanresult = new WifiScanResult();
		wifiscanresult.bssid = wifiinfo.getBSSID();
		wifiscanresult.ssid = wifiinfo.getSSID();
		wifiscanresult.rssi = wifiinfo.getRssi();
		wifiscanresult.timestampMs = SystemClock.elapsedRealtime();
		if(android.os.Build.VERSION.SDK_INT >= 21)
			wifiscanresult.frequency = wifiinfo.getFrequency();
		return wifiscanresult;
		return null;
	}

	public List getWifiScans()
		throws ScannerException
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		List list = null;
	//    2    2:aconst_null     
	//    3    3:astore_2        
		if(!params.isWifiActiveScanForced())
	//*   4    4:aload_0         
	//*   5    5:getfield        #39  <Field LocationPackageRequestParams params>
	//*   6    8:invokevirtual   #306 <Method boolean LocationPackageRequestParams.isWifiActiveScanForced()>
	//*   7   11:ifne            19
			list = getCachedScanResults();
	//    8   14:aload_0         
	//    9   15:invokespecial   #160 <Method List getCachedScanResults()>
	//   10   18:astore_2        
		if(list == null) goto _L2; else goto _L1
	//   11   19:aload_2         
	//   12   20:ifnull          82
_L1:
		boolean flag;
		Exception exception;
		List list1;
		if(!list.isEmpty())
	//*  13   23:aload_2         
	//*  14   24:invokeinterface #308 <Method boolean List.isEmpty()>
	//*  15   29:ifeq            77
	//*  16   32:goto            82
	//*  17   35:aload_0         
	//*  18   36:getfield        #39  <Field LocationPackageRequestParams params>
	//*  19   39:invokevirtual   #306 <Method boolean LocationPackageRequestParams.isWifiActiveScanForced()>
	//*  20   42:ifne            63
	//*  21   45:aload_2         
	//*  22   46:astore_3        
	//*  23   47:aload_0         
	//*  24   48:getfield        #39  <Field LocationPackageRequestParams params>
	//*  25   51:invokevirtual   #311 <Method boolean LocationPackageRequestParams.isWifiActiveScanAllowed()>
	//*  26   54:ifeq            68
	//*  27   57:aload_2         
	//*  28   58:astore_3        
	//*  29   59:iload_1         
	//*  30   60:ifeq            68
	//*  31   63:aload_0         
	//*  32   64:invokespecial   #313 <Method List getActiveScanResults()>
	//*  33   67:astore_3        
	//*  34   68:aload_0         
	//*  35   69:monitorexit     
	//*  36   70:aload_3         
	//*  37   71:areturn         
	//*  38   72:astore_2        
	//*  39   73:aload_0         
	//*  40   74:monitorexit     
	//*  41   75:aload_2         
	//*  42   76:athrow          
		{
			flag = false;
	//   43   77:iconst_0        
	//   44   78:istore_1        
			continue; /* Loop/switch isn't completed */
	//   45   79:goto            35
		}
		  goto _L2
_L4:
		if(params.isWifiActiveScanForced())
			break MISSING_BLOCK_LABEL_63;
		list1 = list;
		if(!params.isWifiActiveScanAllowed())
			break MISSING_BLOCK_LABEL_68;
		list1 = list;
		if(!flag)
			break MISSING_BLOCK_LABEL_68;
		list1 = getActiveScanResults();
		this;
		JVM INSTR monitorexit ;
		return list1;
		exception;
		throw exception;
_L2:
		flag = true;
	//   46   82:iconst_1        
	//   47   83:istore_1        
		if(true) goto _L4; else goto _L3
	//   48   84:goto            35
_L3:
	}

	public void initAndCheckEligibility()
		throws ScannerException
	{
		if(context.getPackageManager().hasSystemFeature("android.hardware.wifi"))
	//*   0    0:aload_0         
	//*   1    1:getfield        #37  <Field Context context>
	//*   2    4:invokevirtual   #318 <Method PackageManager Context.getPackageManager()>
	//*   3    7:ldc2            #320 <String "android.hardware.wifi">
	//*   4   10:invokevirtual   #325 <Method boolean PackageManager.hasSystemFeature(String)>
	//*   5   13:ifeq            91
		{
			if(Validate.hasWiFiPermission(context))
	//*   6   16:aload_0         
	//*   7   17:getfield        #37  <Field Context context>
	//*   8   20:invokestatic    #328 <Method boolean Validate.hasWiFiPermission(Context)>
	//*   9   23:ifeq            80
			{
				if(wifiManager == null)
	//*  10   26:aload_0         
	//*  11   27:getfield        #143 <Field WifiManager wifiManager>
	//*  12   30:ifnonnull       50
					wifiManager = (WifiManager)context.getSystemService("wifi");
	//   13   33:aload_0         
	//   14   34:aload_0         
	//   15   35:getfield        #37  <Field Context context>
	//   16   38:ldc2            #330 <String "wifi">
	//   17   41:invokevirtual   #334 <Method Object Context.getSystemService(String)>
	//   18   44:checkcast       #145 <Class WifiManager>
	//   19   47:putfield        #143 <Field WifiManager wifiManager>
				if(!isWifiScanningAlwaysOn())
	//*  20   50:aload_0         
	//*  21   51:invokespecial   #336 <Method boolean isWifiScanningAlwaysOn()>
	//*  22   54:ifne            79
				{
					if(wifiManager.isWifiEnabled())
	//*  23   57:aload_0         
	//*  24   58:getfield        #143 <Field WifiManager wifiManager>
	//*  25   61:invokevirtual   #339 <Method boolean WifiManager.isWifiEnabled()>
	//*  26   64:ifeq            68
						return;
	//   27   67:return          
					else
						throw new ScannerException(ScannerException.Type.DISABLED);
	//   28   68:new             #128 <Class ScannerException>
	//   29   71:dup             
	//   30   72:getstatic       #342 <Field ScannerException$Type ScannerException$Type.DISABLED>
	//   31   75:invokespecial   #345 <Method void ScannerException(ScannerException$Type)>
	//   32   78:athrow          
				} else
				{
					return;
	//   33   79:return          
				}
			} else
			{
				throw new ScannerException(ScannerException.Type.PERMISSION_DENIED);
	//   34   80:new             #128 <Class ScannerException>
	//   35   83:dup             
	//   36   84:getstatic       #348 <Field ScannerException$Type ScannerException$Type.PERMISSION_DENIED>
	//   37   87:invokespecial   #345 <Method void ScannerException(ScannerException$Type)>
	//   38   90:athrow          
			}
		} else
		{
			throw new ScannerException(ScannerException.Type.NOT_SUPPORTED);
	//   39   91:new             #128 <Class ScannerException>
	//   40   94:dup             
	//   41   95:getstatic       #351 <Field ScannerException$Type ScannerException$Type.NOT_SUPPORTED>
	//   42   98:invokespecial   #345 <Method void ScannerException(ScannerException$Type)>
	//   43  101:athrow          
		}
	}

	public boolean isWifiScanningEnabled()
	{
		boolean flag;
		initAndCheckEligibility();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #354 <Method void initAndCheckEligibility()>
		flag = Validate.hasLocationPermission(context);
	//    2    4:aload_0         
	//    3    5:getfield        #37  <Field Context context>
	//    4    8:invokestatic    #357 <Method boolean Validate.hasLocationPermission(Context)>
	//    5   11:istore_1        
		if(flag)
	//*   6   12:iload_1         
	//*   7   13:ifeq            18
			return true;
	//    8   16:iconst_1        
	//    9   17:ireturn         
_L2:
		return false;
	//   10   18:iconst_0        
	//   11   19:ireturn         
		ScannerException scannerexception;
		scannerexception;
	//   12   20:astore_2        
		if(true) goto _L2; else goto _L1
_L1:
	//*  13   21:goto            18
	}

	private static final String SSID_NOMAP = "_nomap";
	private static final String SSID_OPTOUT = "_optout";
	private ScanResultBroadcastReceiver broadcastReceiver;
	private Context context;
	private final LocationPackageRequestParams params;
	private final Object scanLock = new Object();
	private WifiManager wifiManager;


/*
	static Object access$100(WifiScannerImpl wifiscannerimpl)
	{
		return wifiscannerimpl.scanLock;
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field Object scanLock>
	//    2    4:areturn         
	}

*/


/*
	static void access$200(WifiScannerImpl wifiscannerimpl)
	{
		wifiscannerimpl.unregisterBroadcastReceiver();
	//    0    0:aload_0         
	//    1    1:invokespecial   #47  <Method void unregisterBroadcastReceiver()>
		return;
	//    2    4:return          
	}

*/
}

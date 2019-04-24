// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.util;

import android.content.*;
import android.net.NetworkInfo;
import com.irobot.home.IRobotApplication;
import java.util.Comparator;
import java.util.Iterator;
import java.util.concurrent.ConcurrentSkipListSet;

// Referenced classes of package com.irobot.home.util:
//			o, j

public final class WifiStateReceiver extends BroadcastReceiver
{
	public static interface a
	{

		public abstract void a(android.net.NetworkInfo.DetailedState detailedstate, NetworkInfo networkinfo);

		public abstract void a(NetworkInfo networkinfo);
	}

	private static class b
	{

		static WifiStateReceiver a()
		{
			return a;
		//    0    0:getstatic       #25  <Field WifiStateReceiver a>
		//    1    3:areturn         
		}

		private static WifiStateReceiver a = new WifiStateReceiver((IRobotApplication)j.g());

		static 
		{
		//    0    0:new             #6   <Class WifiStateReceiver>
		//    1    3:dup             
		//    2    4:invokestatic    #17  <Method android.app.Application j.g()>
		//    3    7:checkcast       #19  <Class IRobotApplication>
		//    4   10:aconst_null     
		//    5   11:invokespecial   #23  <Method void WifiStateReceiver(IRobotApplication, WifiStateReceiver$1)>
		//    6   14:putstatic       #25  <Field WifiStateReceiver a>
		//*   7   17:return          
		}
	}


	private WifiStateReceiver(IRobotApplication irobotapplication)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #24  <Method void BroadcastReceiver()>
		b = new ConcurrentSkipListSet(new Comparator() {

			public int compare(Object obj, Object obj1)
			{
				return ((int) (obj.equals(obj1) ^ true));
			//    0    0:aload_1         
			//    1    1:aload_2         
			//    2    2:invokevirtual   #24  <Method boolean Object.equals(Object)>
			//    3    5:iconst_1        
			//    4    6:ixor            
			//    5    7:ireturn         
			}

			final WifiStateReceiver a;

			
			{
				a = WifiStateReceiver.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #14  <Field WifiStateReceiver a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #17  <Method void Object()>
			//    5    9:return          
			}
		}
);
	//    2    4:aload_0         
	//    3    5:new             #26  <Class ConcurrentSkipListSet>
	//    4    8:dup             
	//    5    9:new             #6   <Class WifiStateReceiver$1>
	//    6   12:dup             
	//    7   13:aload_0         
	//    8   14:invokespecial   #29  <Method void WifiStateReceiver$1(WifiStateReceiver)>
	//    9   17:invokespecial   #32  <Method void ConcurrentSkipListSet(Comparator)>
	//   10   20:putfield        #34  <Field ConcurrentSkipListSet b>
		if(irobotapplication == null)
	//*  11   23:aload_1         
	//*  12   24:ifnonnull       36
		{
			o.e(a, "Unable to register network state changed intents, null app context");
	//   13   27:getstatic       #36  <Field String a>
	//   14   30:ldc1            #38  <String "Unable to register network state changed intents, null app context">
	//   15   32:invokestatic    #44  <Method void o.e(String, String)>
			return;
	//   16   35:return          
		} else
		{
			IntentFilter intentfilter = new IntentFilter();
	//   17   36:new             #46  <Class IntentFilter>
	//   18   39:dup             
	//   19   40:invokespecial   #47  <Method void IntentFilter()>
	//   20   43:astore_2        
			intentfilter.addAction("android.net.wifi.STATE_CHANGE");
	//   21   44:aload_2         
	//   22   45:ldc1            #49  <String "android.net.wifi.STATE_CHANGE">
	//   23   47:invokevirtual   #53  <Method void IntentFilter.addAction(String)>
			intentfilter.addAction("android.net.wifi.SCAN_RESULTS");
	//   24   50:aload_2         
	//   25   51:ldc1            #55  <String "android.net.wifi.SCAN_RESULTS">
	//   26   53:invokevirtual   #53  <Method void IntentFilter.addAction(String)>
			irobotapplication.registerReceiver(((BroadcastReceiver) (this)), intentfilter, ((String) (null)), ((android.os.Handler) (null)));
	//   27   56:aload_1         
	//   28   57:aload_0         
	//   29   58:aload_2         
	//   30   59:aconst_null     
	//   31   60:aconst_null     
	//   32   61:invokevirtual   #61  <Method Intent IRobotApplication.registerReceiver(BroadcastReceiver, IntentFilter, String, android.os.Handler)>
	//   33   64:pop             
			return;
	//   34   65:return          
		}
	}


	public static WifiStateReceiver a()
	{
		return b.a();
	//    0    0:invokestatic    #67  <Method WifiStateReceiver WifiStateReceiver$b.a()>
	//    1    3:areturn         
	}

	public boolean a(a a1)
	{
		if(a1 != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          13
			return b.add(((Object) (a1)));
	//    2    4:aload_0         
	//    3    5:getfield        #34  <Field ConcurrentSkipListSet b>
	//    4    8:aload_1         
	//    5    9:invokevirtual   #72  <Method boolean ConcurrentSkipListSet.add(Object)>
	//    6   12:ireturn         
		else
			return false;
	//    7   13:iconst_0        
	//    8   14:ireturn         
	}

	public boolean b(a a1)
	{
label0:
		{
			if(a1 == null || !b.contains(((Object) (a1))))
				break label0;
	//    0    0:aload_1         
	//    1    1:ifnull          56
	//    2    4:aload_0         
	//    3    5:getfield        #34  <Field ConcurrentSkipListSet b>
	//    4    8:aload_1         
	//    5    9:invokevirtual   #75  <Method boolean ConcurrentSkipListSet.contains(Object)>
	//    6   12:ifeq            56
			Iterator iterator = b.iterator();
	//    7   15:aload_0         
	//    8   16:getfield        #34  <Field ConcurrentSkipListSet b>
	//    9   19:invokevirtual   #79  <Method Iterator ConcurrentSkipListSet.iterator()>
	//   10   22:astore_2        
			do
				if(!iterator.hasNext())
					break label0;
	//   11   23:aload_2         
	//   12   24:invokeinterface #85  <Method boolean Iterator.hasNext()>
	//   13   29:ifeq            56
			while(!((Object) ((a)iterator.next())).equals(((Object) (a1))));
	//   14   32:aload_2         
	//   15   33:invokeinterface #89  <Method Object Iterator.next()>
	//   16   38:checkcast       #8   <Class WifiStateReceiver$a>
	//   17   41:aload_1         
	//   18   42:invokevirtual   #94  <Method boolean Object.equals(Object)>
	//   19   45:ifeq            23
			iterator.remove();
	//   20   48:aload_2         
	//   21   49:invokeinterface #97  <Method void Iterator.remove()>
			return true;
	//   22   54:iconst_1        
	//   23   55:ireturn         
		}
		return false;
	//   24   56:iconst_0        
	//   25   57:ireturn         
	}

	public void onReceive(Context context, Intent intent)
	{
		context = ((Context) (intent.getAction()));
	//    0    0:aload_2         
	//    1    1:invokevirtual   #105 <Method String Intent.getAction()>
	//    2    4:astore_1        
		if(((String) (context)).equals("android.net.wifi.SCAN_RESULTS"))
	//*   3    5:aload_1         
	//*   4    6:ldc1            #55  <String "android.net.wifi.SCAN_RESULTS">
	//*   5    8:invokevirtual   #108 <Method boolean String.equals(Object)>
	//*   6   11:ifeq            84
		{
			NetworkInfo networkinfo = (NetworkInfo)intent.getParcelableExtra("android.net.wifi.SCAN_RESULTS");
	//    7   14:aload_2         
	//    8   15:ldc1            #55  <String "android.net.wifi.SCAN_RESULTS">
	//    9   17:invokevirtual   #112 <Method android.os.Parcelable Intent.getParcelableExtra(String)>
	//   10   20:checkcast       #114 <Class NetworkInfo>
	//   11   23:astore_3        
			if(networkinfo == null)
	//*  12   24:aload_3         
	//*  13   25:ifnonnull       29
				return;
	//   14   28:return          
			o.b(a, "Scan results available");
	//   15   29:getstatic       #36  <Field String a>
	//   16   32:ldc1            #116 <String "Scan results available">
	//   17   34:invokestatic    #118 <Method void o.b(String, String)>
			Iterator iterator = b.iterator();
	//   18   37:aload_0         
	//   19   38:getfield        #34  <Field ConcurrentSkipListSet b>
	//   20   41:invokevirtual   #79  <Method Iterator ConcurrentSkipListSet.iterator()>
	//   21   44:astore          4
			do
			{
				if(!iterator.hasNext())
					break;
	//   22   46:aload           4
	//   23   48:invokeinterface #85  <Method boolean Iterator.hasNext()>
	//   24   53:ifeq            84
				a a2 = (a)iterator.next();
	//   25   56:aload           4
	//   26   58:invokeinterface #89  <Method Object Iterator.next()>
	//   27   63:checkcast       #8   <Class WifiStateReceiver$a>
	//   28   66:astore          5
				if(a2 != null)
	//*  29   68:aload           5
	//*  30   70:ifnull          46
					a2.a(networkinfo);
	//   31   73:aload           5
	//   32   75:aload_3         
	//   33   76:invokeinterface #121 <Method void WifiStateReceiver$a.a(NetworkInfo)>
			} while(true);
	//   34   81:goto            46
		}
		if(((String) (context)).equals("android.net.wifi.STATE_CHANGE"))
	//*  35   84:aload_1         
	//*  36   85:ldc1            #49  <String "android.net.wifi.STATE_CHANGE">
	//*  37   87:invokevirtual   #108 <Method boolean String.equals(Object)>
	//*  38   90:ifeq            192
		{
			context = ((Context) ((NetworkInfo)intent.getParcelableExtra("networkInfo")));
	//   39   93:aload_2         
	//   40   94:ldc1            #123 <String "networkInfo">
	//   41   96:invokevirtual   #112 <Method android.os.Parcelable Intent.getParcelableExtra(String)>
	//   42   99:checkcast       #114 <Class NetworkInfo>
	//   43  102:astore_1        
			if(context == null)
	//*  44  103:aload_1         
	//*  45  104:ifnonnull       108
				return;
	//   46  107:return          
			intent = ((Intent) (a));
	//   47  108:getstatic       #36  <Field String a>
	//   48  111:astore_2        
			StringBuilder stringbuilder = new StringBuilder();
	//   49  112:new             #125 <Class StringBuilder>
	//   50  115:dup             
	//   51  116:invokespecial   #126 <Method void StringBuilder()>
	//   52  119:astore_3        
			stringbuilder.append("Received State: ");
	//   53  120:aload_3         
	//   54  121:ldc1            #128 <String "Received State: ">
	//   55  123:invokevirtual   #132 <Method StringBuilder StringBuilder.append(String)>
	//   56  126:pop             
			stringbuilder.append(((NetworkInfo) (context)).getState().name());
	//   57  127:aload_3         
	//   58  128:aload_1         
	//   59  129:invokevirtual   #136 <Method android.net.NetworkInfo$State NetworkInfo.getState()>
	//   60  132:invokevirtual   #141 <Method String android.net.NetworkInfo$State.name()>
	//   61  135:invokevirtual   #132 <Method StringBuilder StringBuilder.append(String)>
	//   62  138:pop             
			o.b(((String) (intent)), stringbuilder.toString());
	//   63  139:aload_2         
	//   64  140:aload_3         
	//   65  141:invokevirtual   #144 <Method String StringBuilder.toString()>
	//   66  144:invokestatic    #118 <Method void o.b(String, String)>
			intent = ((Intent) (b.iterator()));
	//   67  147:aload_0         
	//   68  148:getfield        #34  <Field ConcurrentSkipListSet b>
	//   69  151:invokevirtual   #79  <Method Iterator ConcurrentSkipListSet.iterator()>
	//   70  154:astore_2        
			do
			{
				if(!((Iterator) (intent)).hasNext())
					break;
	//   71  155:aload_2         
	//   72  156:invokeinterface #85  <Method boolean Iterator.hasNext()>
	//   73  161:ifeq            192
				a a1 = (a)((Iterator) (intent)).next();
	//   74  164:aload_2         
	//   75  165:invokeinterface #89  <Method Object Iterator.next()>
	//   76  170:checkcast       #8   <Class WifiStateReceiver$a>
	//   77  173:astore_3        
				if(a1 != null)
	//*  78  174:aload_3         
	//*  79  175:ifnull          155
					a1.a(((NetworkInfo) (context)).getDetailedState(), ((NetworkInfo) (context)));
	//   80  178:aload_3         
	//   81  179:aload_1         
	//   82  180:invokevirtual   #148 <Method android.net.NetworkInfo$DetailedState NetworkInfo.getDetailedState()>
	//   83  183:aload_1         
	//   84  184:invokeinterface #151 <Method void WifiStateReceiver$a.a(android.net.NetworkInfo$DetailedState, NetworkInfo)>
			} while(true);
	//   85  189:goto            155
		}
	//   86  192:return          
	}

	private static final String a = "WifiStateReceiver";
	private final ConcurrentSkipListSet b;

	static 
	{
	//    0    0:return          
	}
}

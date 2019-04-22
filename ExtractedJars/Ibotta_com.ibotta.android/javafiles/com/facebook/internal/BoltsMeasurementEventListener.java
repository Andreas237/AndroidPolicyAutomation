// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.internal;

import android.content.*;
import android.os.Bundle;
import android.support.v4.content.LocalBroadcastManager;
import com.facebook.appevents.AppEventsLogger;
import java.util.Iterator;
import java.util.Set;

public class BoltsMeasurementEventListener extends BroadcastReceiver
{

	private BoltsMeasurementEventListener(Context context)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void BroadcastReceiver()>
		applicationContext = context.getApplicationContext();
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokevirtual   #19  <Method Context Context.getApplicationContext()>
	//    5    9:putfield        #21  <Field Context applicationContext>
	//    6   12:return          
	}

	private void close()
	{
		LocalBroadcastManager.getInstance(applicationContext).unregisterReceiver(((BroadcastReceiver) (this)));
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field Context applicationContext>
	//    2    4:invokestatic    #29  <Method LocalBroadcastManager LocalBroadcastManager.getInstance(Context)>
	//    3    7:aload_0         
	//    4    8:invokevirtual   #33  <Method void LocalBroadcastManager.unregisterReceiver(BroadcastReceiver)>
	//    5   11:return          
	}

	public static BoltsMeasurementEventListener getInstance(Context context)
	{
		BoltsMeasurementEventListener boltsmeasurementeventlistener = _instance;
	//    0    0:getstatic       #36  <Field BoltsMeasurementEventListener _instance>
	//    1    3:astore_1        
		if(boltsmeasurementeventlistener != null)
	//*   2    4:aload_1         
	//*   3    5:ifnull          10
		{
			return boltsmeasurementeventlistener;
	//    4    8:aload_1         
	//    5    9:areturn         
		} else
		{
			_instance = new BoltsMeasurementEventListener(context);
	//    6   10:new             #2   <Class BoltsMeasurementEventListener>
	//    7   13:dup             
	//    8   14:aload_0         
	//    9   15:invokespecial   #38  <Method void BoltsMeasurementEventListener(Context)>
	//   10   18:putstatic       #36  <Field BoltsMeasurementEventListener _instance>
			_instance.open();
	//   11   21:getstatic       #36  <Field BoltsMeasurementEventListener _instance>
	//   12   24:invokespecial   #41  <Method void open()>
			return _instance;
	//   13   27:getstatic       #36  <Field BoltsMeasurementEventListener _instance>
	//   14   30:areturn         
		}
	}

	private void open()
	{
		LocalBroadcastManager.getInstance(applicationContext).registerReceiver(((BroadcastReceiver) (this)), new IntentFilter("com.parse.bolts.measurement_event"));
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field Context applicationContext>
	//    2    4:invokestatic    #29  <Method LocalBroadcastManager LocalBroadcastManager.getInstance(Context)>
	//    3    7:aload_0         
	//    4    8:new             #43  <Class IntentFilter>
	//    5   11:dup             
	//    6   12:ldc1            #45  <String "com.parse.bolts.measurement_event">
	//    7   14:invokespecial   #48  <Method void IntentFilter(String)>
	//    8   17:invokevirtual   #52  <Method void LocalBroadcastManager.registerReceiver(BroadcastReceiver, IntentFilter)>
	//    9   20:return          
	}

	protected void finalize()
		throws Throwable
	{
		close();
	//    0    0:aload_0         
	//    1    1:invokespecial   #57  <Method void close()>
		((Object)this).finalize();
	//    2    4:aload_0         
	//    3    5:invokespecial   #61  <Method void Object.finalize()>
		return;
	//    4    8:return          
		Exception exception;
		exception;
	//    5    9:astore_1        
		((Object)this).finalize();
	//    6   10:aload_0         
	//    7   11:invokespecial   #61  <Method void Object.finalize()>
		throw exception;
	//    8   14:aload_1         
	//    9   15:athrow          
	}

	public void onReceive(Context context, Intent intent)
	{
		context = ((Context) (AppEventsLogger.newLogger(context)));
	//    0    0:aload_1         
	//    1    1:invokestatic    #70  <Method AppEventsLogger AppEventsLogger.newLogger(Context)>
	//    2    4:astore_1        
		Object obj = ((Object) (new StringBuilder()));
	//    3    5:new             #72  <Class StringBuilder>
	//    4    8:dup             
	//    5    9:invokespecial   #73  <Method void StringBuilder()>
	//    6   12:astore_3        
		((StringBuilder) (obj)).append("bf_");
	//    7   13:aload_3         
	//    8   14:ldc1            #75  <String "bf_">
	//    9   16:invokevirtual   #79  <Method StringBuilder StringBuilder.append(String)>
	//   10   19:pop             
		((StringBuilder) (obj)).append(intent.getStringExtra("event_name"));
	//   11   20:aload_3         
	//   12   21:aload_2         
	//   13   22:ldc1            #81  <String "event_name">
	//   14   24:invokevirtual   #87  <Method String Intent.getStringExtra(String)>
	//   15   27:invokevirtual   #79  <Method StringBuilder StringBuilder.append(String)>
	//   16   30:pop             
		obj = ((Object) (((StringBuilder) (obj)).toString()));
	//   17   31:aload_3         
	//   18   32:invokevirtual   #91  <Method String StringBuilder.toString()>
	//   19   35:astore_3        
		intent = ((Intent) (intent.getBundleExtra("event_args")));
	//   20   36:aload_2         
	//   21   37:ldc1            #93  <String "event_args">
	//   22   39:invokevirtual   #97  <Method Bundle Intent.getBundleExtra(String)>
	//   23   42:astore_2        
		Bundle bundle = new Bundle();
	//   24   43:new             #99  <Class Bundle>
	//   25   46:dup             
	//   26   47:invokespecial   #100 <Method void Bundle()>
	//   27   50:astore          4
		String s;
		for(Iterator iterator = ((Bundle) (intent)).keySet().iterator(); iterator.hasNext(); bundle.putString(s.replaceAll("[^0-9a-zA-Z _-]", "-").replaceAll("^[ -]*", "").replaceAll("[ -]*$", ""), (String)((Bundle) (intent)).get(s)))
	//*  28   52:aload_2         
	//*  29   53:invokevirtual   #104 <Method Set Bundle.keySet()>
	//*  30   56:invokeinterface #110 <Method Iterator Set.iterator()>
	//*  31   61:astore          5
	//*  32   63:aload           5
	//*  33   65:invokeinterface #116 <Method boolean Iterator.hasNext()>
	//*  34   70:ifeq            125
			s = (String)iterator.next();
	//   35   73:aload           5
	//   36   75:invokeinterface #120 <Method Object Iterator.next()>
	//   37   80:checkcast       #122 <Class String>
	//   38   83:astore          6

	//   39   85:aload           4
	//   40   87:aload           6
	//   41   89:ldc1            #124 <String "[^0-9a-zA-Z _-]">
	//   42   91:ldc1            #126 <String "-">
	//   43   93:invokevirtual   #130 <Method String String.replaceAll(String, String)>
	//   44   96:ldc1            #132 <String "^[ -]*">
	//   45   98:ldc1            #134 <String "">
	//   46  100:invokevirtual   #130 <Method String String.replaceAll(String, String)>
	//   47  103:ldc1            #136 <String "[ -]*$">
	//   48  105:ldc1            #134 <String "">
	//   49  107:invokevirtual   #130 <Method String String.replaceAll(String, String)>
	//   50  110:aload_2         
	//   51  111:aload           6
	//   52  113:invokevirtual   #140 <Method Object Bundle.get(String)>
	//   53  116:checkcast       #122 <Class String>
	//   54  119:invokevirtual   #144 <Method void Bundle.putString(String, String)>
	//*  55  122:goto            63
		((AppEventsLogger) (context)).logEvent(((String) (obj)), bundle);
	//   56  125:aload_1         
	//   57  126:aload_3         
	//   58  127:aload           4
	//   59  129:invokevirtual   #148 <Method void AppEventsLogger.logEvent(String, Bundle)>
	//   60  132:return          
	}

	private static BoltsMeasurementEventListener _instance;
	private Context applicationContext;
}

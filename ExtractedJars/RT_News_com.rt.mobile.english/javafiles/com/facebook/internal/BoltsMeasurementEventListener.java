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
	//    1    1:invokespecial   #26  <Method void BroadcastReceiver()>
		applicationContext = context.getApplicationContext();
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokevirtual   #32  <Method Context Context.getApplicationContext()>
	//    5    9:putfield        #34  <Field Context applicationContext>
	//    6   12:return          
	}

	private void close()
	{
		LocalBroadcastManager.getInstance(applicationContext).unregisterReceiver(((BroadcastReceiver) (this)));
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field Context applicationContext>
	//    2    4:invokestatic    #42  <Method LocalBroadcastManager LocalBroadcastManager.getInstance(Context)>
	//    3    7:aload_0         
	//    4    8:invokevirtual   #46  <Method void LocalBroadcastManager.unregisterReceiver(BroadcastReceiver)>
	//    5   11:return          
	}

	public static BoltsMeasurementEventListener getInstance(Context context)
	{
		if(_instance != null)
	//*   0    0:getstatic       #49  <Field BoltsMeasurementEventListener _instance>
	//*   1    3:ifnull          10
		{
			return _instance;
	//    2    6:getstatic       #49  <Field BoltsMeasurementEventListener _instance>
	//    3    9:areturn         
		} else
		{
			_instance = new BoltsMeasurementEventListener(context);
	//    4   10:new             #2   <Class BoltsMeasurementEventListener>
	//    5   13:dup             
	//    6   14:aload_0         
	//    7   15:invokespecial   #51  <Method void BoltsMeasurementEventListener(Context)>
	//    8   18:putstatic       #49  <Field BoltsMeasurementEventListener _instance>
			_instance.open();
	//    9   21:getstatic       #49  <Field BoltsMeasurementEventListener _instance>
	//   10   24:invokespecial   #54  <Method void open()>
			return _instance;
	//   11   27:getstatic       #49  <Field BoltsMeasurementEventListener _instance>
	//   12   30:areturn         
		}
	}

	private void open()
	{
		LocalBroadcastManager.getInstance(applicationContext).registerReceiver(((BroadcastReceiver) (this)), new IntentFilter("com.parse.bolts.measurement_event"));
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field Context applicationContext>
	//    2    4:invokestatic    #42  <Method LocalBroadcastManager LocalBroadcastManager.getInstance(Context)>
	//    3    7:aload_0         
	//    4    8:new             #56  <Class IntentFilter>
	//    5   11:dup             
	//    6   12:ldc1            #17  <String "com.parse.bolts.measurement_event">
	//    7   14:invokespecial   #59  <Method void IntentFilter(String)>
	//    8   17:invokevirtual   #63  <Method void LocalBroadcastManager.registerReceiver(BroadcastReceiver, IntentFilter)>
	//    9   20:return          
	}

	protected void finalize()
		throws Throwable
	{
		close();
	//    0    0:aload_0         
	//    1    1:invokespecial   #68  <Method void close()>
		((Object)this).finalize();
	//    2    4:aload_0         
	//    3    5:invokespecial   #72  <Method void Object.finalize()>
		return;
	//    4    8:return          
		Exception exception;
		exception;
	//    5    9:astore_1        
		((Object)this).finalize();
	//    6   10:aload_0         
	//    7   11:invokespecial   #72  <Method void Object.finalize()>
		throw exception;
	//    8   14:aload_1         
	//    9   15:athrow          
	}

	public void onReceive(Context context, Intent intent)
	{
		context = ((Context) (AppEventsLogger.newLogger(context)));
	//    0    0:aload_1         
	//    1    1:invokestatic    #81  <Method AppEventsLogger AppEventsLogger.newLogger(Context)>
	//    2    4:astore_1        
		Object obj = ((Object) (new StringBuilder()));
	//    3    5:new             #83  <Class StringBuilder>
	//    4    8:dup             
	//    5    9:invokespecial   #84  <Method void StringBuilder()>
	//    6   12:astore_3        
		((StringBuilder) (obj)).append("bf_");
	//    7   13:aload_3         
	//    8   14:ldc1            #8   <String "bf_">
	//    9   16:invokevirtual   #88  <Method StringBuilder StringBuilder.append(String)>
	//   10   19:pop             
		((StringBuilder) (obj)).append(intent.getStringExtra("event_name"));
	//   11   20:aload_3         
	//   12   21:aload_2         
	//   13   22:ldc1            #14  <String "event_name">
	//   14   24:invokevirtual   #94  <Method String Intent.getStringExtra(String)>
	//   15   27:invokevirtual   #88  <Method StringBuilder StringBuilder.append(String)>
	//   16   30:pop             
		obj = ((Object) (((StringBuilder) (obj)).toString()));
	//   17   31:aload_3         
	//   18   32:invokevirtual   #98  <Method String StringBuilder.toString()>
	//   19   35:astore_3        
		intent = ((Intent) (intent.getBundleExtra("event_args")));
	//   20   36:aload_2         
	//   21   37:ldc1            #11  <String "event_args">
	//   22   39:invokevirtual   #102 <Method Bundle Intent.getBundleExtra(String)>
	//   23   42:astore_2        
		Bundle bundle = new Bundle();
	//   24   43:new             #104 <Class Bundle>
	//   25   46:dup             
	//   26   47:invokespecial   #105 <Method void Bundle()>
	//   27   50:astore          4
		String s;
		for(Iterator iterator = ((Bundle) (intent)).keySet().iterator(); iterator.hasNext(); bundle.putString(s.replaceAll("[^0-9a-zA-Z _-]", "-").replaceAll("^[ -]*", "").replaceAll("[ -]*$", ""), (String)((Bundle) (intent)).get(s)))
	//*  28   52:aload_2         
	//*  29   53:invokevirtual   #109 <Method Set Bundle.keySet()>
	//*  30   56:invokeinterface #115 <Method Iterator Set.iterator()>
	//*  31   61:astore          5
	//*  32   63:aload           5
	//*  33   65:invokeinterface #121 <Method boolean Iterator.hasNext()>
	//*  34   70:ifeq            125
			s = (String)iterator.next();
	//   35   73:aload           5
	//   36   75:invokeinterface #125 <Method Object Iterator.next()>
	//   37   80:checkcast       #127 <Class String>
	//   38   83:astore          6

	//   39   85:aload           4
	//   40   87:aload           6
	//   41   89:ldc1            #129 <String "[^0-9a-zA-Z _-]">
	//   42   91:ldc1            #131 <String "-">
	//   43   93:invokevirtual   #135 <Method String String.replaceAll(String, String)>
	//   44   96:ldc1            #137 <String "^[ -]*">
	//   45   98:ldc1            #139 <String "">
	//   46  100:invokevirtual   #135 <Method String String.replaceAll(String, String)>
	//   47  103:ldc1            #141 <String "[ -]*$">
	//   48  105:ldc1            #139 <String "">
	//   49  107:invokevirtual   #135 <Method String String.replaceAll(String, String)>
	//   50  110:aload_2         
	//   51  111:aload           6
	//   52  113:invokevirtual   #145 <Method Object Bundle.get(String)>
	//   53  116:checkcast       #127 <Class String>
	//   54  119:invokevirtual   #149 <Method void Bundle.putString(String, String)>
	//*  55  122:goto            63
		((AppEventsLogger) (context)).logEvent(((String) (obj)), bundle);
	//   56  125:aload_1         
	//   57  126:aload_3         
	//   58  127:aload           4
	//   59  129:invokevirtual   #153 <Method void AppEventsLogger.logEvent(String, Bundle)>
	//   60  132:return          
	}

	private static final String BOLTS_MEASUREMENT_EVENT_PREFIX = "bf_";
	private static final String MEASUREMENT_EVENT_ARGS_KEY = "event_args";
	private static final String MEASUREMENT_EVENT_NAME_KEY = "event_name";
	private static final String MEASUREMENT_EVENT_NOTIFICATION_NAME = "com.parse.bolts.measurement_event";
	private static BoltsMeasurementEventListener _instance;
	private Context applicationContext;
}

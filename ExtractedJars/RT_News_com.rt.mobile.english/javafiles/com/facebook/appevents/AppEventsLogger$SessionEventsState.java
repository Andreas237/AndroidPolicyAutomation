// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.appevents;

import android.os.Bundle;
import com.facebook.GraphRequest;
import com.facebook.internal.*;
import java.io.UnsupportedEncodingException;
import java.util.*;
import org.json.*;

// Referenced classes of package com.facebook.appevents:
//			AppEventsLogger

static class AppEventsLogger$SessionEventsState
{

	private byte[] getStringAsByteArray(String s)
	{
		try
		{
			s = ((String) (s.getBytes("UTF-8")));
	//    0    0:aload_1         
	//    1    1:ldc1            #55  <String "UTF-8">
	//    2    3:invokevirtual   #60  <Method byte[] String.getBytes(String)>
	//    3    6:astore_1        
		}
	//*   4    7:aload_1         
	//*   5    8:areturn         
		// Misplaced declaration of an exception variable
		catch(String s)
	//*   6    9:astore_1        
		{
			Utility.logd("Encoding exception: ", ((Exception) (s)));
	//    7   10:ldc1            #62  <String "Encoding exception: ">
	//    8   12:aload_1         
	//    9   13:invokestatic    #68  <Method void Utility.logd(String, Exception)>
			return null;
	//   10   16:aconst_null     
	//   11   17:areturn         
		}
		return ((byte []) (s));
	}

	private void populateRequest(GraphRequest graphrequest, int i, JSONArray jsonarray, boolean flag)
	{
		JSONObject jsonobject = AppEventsLoggerUtility.getJSONObjectForGraphAPICall(com.facebook.internal.vityType.CUSTOM_APP_EVENTS, attributionIdentifiers, anonymousAppDeviceGUID, flag, AppEventsLogger.access$1000());
	//    0    0:getstatic       #78  <Field com.facebook.internal.AppEventsLoggerUtility$GraphAPIActivityType com.facebook.internal.AppEventsLoggerUtility$GraphAPIActivityType.CUSTOM_APP_EVENTS>
	//    1    3:aload_0         
	//    2    4:getfield        #44  <Field AttributionIdentifiers attributionIdentifiers>
	//    3    7:aload_0         
	//    4    8:getfield        #48  <Field String anonymousAppDeviceGUID>
	//    5   11:iload           4
	//    6   13:invokestatic    #82  <Method android.content.Context AppEventsLogger.access$1000()>
	//    7   16:invokestatic    #88  <Method JSONObject AppEventsLoggerUtility.getJSONObjectForGraphAPICall(com.facebook.internal.AppEventsLoggerUtility$GraphAPIActivityType, AttributionIdentifiers, String, boolean, android.content.Context)>
	//    8   19:astore          6
		Object obj = ((Object) (jsonobject));
	//    9   21:aload           6
	//   10   23:astore          5
		if(numSkippedEventsDueToFullBuffer <= 0) goto _L2; else goto _L1
	//   11   25:aload_0         
	//   12   26:getfield        #90  <Field int numSkippedEventsDueToFullBuffer>
	//   13   29:ifle            57
_L1:
		jsonobject.put("num_skipped_events", i);
	//   14   32:aload           6
	//   15   34:ldc1            #92  <String "num_skipped_events">
	//   16   36:iload_2         
	//   17   37:invokevirtual   #98  <Method JSONObject JSONObject.put(String, int)>
	//   18   40:pop             
		obj = ((Object) (jsonobject));
	//   19   41:aload           6
	//   20   43:astore          5
		  goto _L2
	//*  21   45:goto            57
_L4:
		obj = ((Object) (new JSONObject()));
	//   22   48:new             #94  <Class JSONObject>
	//   23   51:dup             
	//   24   52:invokespecial   #99  <Method void JSONObject()>
	//   25   55:astore          5
_L2:
		graphrequest.setGraphObject(((JSONObject) (obj)));
	//   26   57:aload_1         
	//   27   58:aload           5
	//   28   60:invokevirtual   #105 <Method void GraphRequest.setGraphObject(JSONObject)>
		Bundle bundle = graphrequest.getParameters();
	//   29   63:aload_1         
	//   30   64:invokevirtual   #109 <Method Bundle GraphRequest.getParameters()>
	//   31   67:astore          6
		obj = ((Object) (bundle));
	//   32   69:aload           6
	//   33   71:astore          5
		if(bundle == null)
	//*  34   73:aload           6
	//*  35   75:ifnonnull       87
			obj = ((Object) (new Bundle()));
	//   36   78:new             #111 <Class Bundle>
	//   37   81:dup             
	//   38   82:invokespecial   #112 <Method void Bundle()>
	//   39   85:astore          5
		jsonarray = ((JSONArray) (jsonarray.toString()));
	//   40   87:aload_3         
	//   41   88:invokevirtual   #118 <Method String JSONArray.toString()>
	//   42   91:astore_3        
		if(jsonarray != null)
	//*  43   92:aload_3         
	//*  44   93:ifnull          113
		{
			((Bundle) (obj)).putByteArray("custom_events_file", getStringAsByteArray(((String) (jsonarray))));
	//   45   96:aload           5
	//   46   98:ldc1            #120 <String "custom_events_file">
	//   47  100:aload_0         
	//   48  101:aload_3         
	//   49  102:invokespecial   #122 <Method byte[] getStringAsByteArray(String)>
	//   50  105:invokevirtual   #126 <Method void Bundle.putByteArray(String, byte[])>
			graphrequest.setTag(((Object) (jsonarray)));
	//   51  108:aload_1         
	//   52  109:aload_3         
	//   53  110:invokevirtual   #130 <Method void GraphRequest.setTag(Object)>
		}
		graphrequest.setParameters(((Bundle) (obj)));
	//   54  113:aload_1         
	//   55  114:aload           5
	//   56  116:invokevirtual   #134 <Method void GraphRequest.setParameters(Bundle)>
		return;
	//   57  119:return          
		JSONException jsonexception;
		jsonexception;
	//   58  120:astore          5
		if(true) goto _L4; else goto _L3
	//   59  122:goto            48
_L3:
	}

	public void accumulatePersistedEvents(List list)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		accumulatedEvents.addAll(((java.util.Collection) (list)));
	//    2    2:aload_0         
	//    3    3:getfield        #38  <Field List accumulatedEvents>
	//    4    6:aload_1         
	//    5    7:invokeinterface #142 <Method boolean List.addAll(java.util.Collection)>
	//    6   12:pop             
		this;
	//    7   13:aload_0         
		JVM INSTR monitorexit ;
	//    8   14:monitorexit     
		return;
	//    9   15:return          
		list;
	//   10   16:astore_1        
	//*  11   17:aload_0         
		throw list;
	//   12   18:monitorexit     
	//   13   19:aload_1         
	//   14   20:athrow          
	}

	public void addEvent(AppEventsLogger.AppEvent appevent)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		if(accumulatedEvents.size() + inFlightEvents.size() >= 1000)
	//*   2    2:aload_0         
	//*   3    3:getfield        #38  <Field List accumulatedEvents>
	//*   4    6:invokeinterface #150 <Method int List.size()>
	//*   5   11:aload_0         
	//*   6   12:getfield        #40  <Field List inFlightEvents>
	//*   7   15:invokeinterface #150 <Method int List.size()>
	//*   8   20:iadd            
	//*   9   21:sipush          1000
	//*  10   24:icmplt          40
		{
			numSkippedEventsDueToFullBuffer = numSkippedEventsDueToFullBuffer + 1;
	//   11   27:aload_0         
	//   12   28:aload_0         
	//   13   29:getfield        #90  <Field int numSkippedEventsDueToFullBuffer>
	//   14   32:iconst_1        
	//   15   33:iadd            
	//   16   34:putfield        #90  <Field int numSkippedEventsDueToFullBuffer>
			break MISSING_BLOCK_LABEL_51;
	//   17   37:goto            51
		}
		accumulatedEvents.add(((Object) (appevent)));
	//   18   40:aload_0         
	//   19   41:getfield        #38  <Field List accumulatedEvents>
	//   20   44:aload_1         
	//   21   45:invokeinterface #154 <Method boolean List.add(Object)>
	//   22   50:pop             
		this;
	//   23   51:aload_0         
		JVM INSTR monitorexit ;
	//   24   52:monitorexit     
		return;
	//   25   53:return          
		appevent;
	//   26   54:astore_1        
	//*  27   55:aload_0         
		throw appevent;
	//   28   56:monitorexit     
	//   29   57:aload_1         
	//   30   58:athrow          
	}

	public void clearInFlightAndStats(boolean flag)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		if(!flag)
			break MISSING_BLOCK_LABEL_23;
	//    2    2:iload_1         
	//    3    3:ifeq            23
		accumulatedEvents.addAll(((java.util.Collection) (inFlightEvents)));
	//    4    6:aload_0         
	//    5    7:getfield        #38  <Field List accumulatedEvents>
	//    6   10:aload_0         
	//    7   11:getfield        #40  <Field List inFlightEvents>
	//    8   14:invokeinterface #142 <Method boolean List.addAll(java.util.Collection)>
	//    9   19:pop             
	//*  10   20:goto            23
		inFlightEvents.clear();
	//   11   23:aload_0         
	//   12   24:getfield        #40  <Field List inFlightEvents>
	//   13   27:invokeinterface #159 <Method void List.clear()>
		numSkippedEventsDueToFullBuffer = 0;
	//   14   32:aload_0         
	//   15   33:iconst_0        
	//   16   34:putfield        #90  <Field int numSkippedEventsDueToFullBuffer>
		this;
	//   17   37:aload_0         
		JVM INSTR monitorexit ;
	//   18   38:monitorexit     
		return;
	//   19   39:return          
	//*  20   40:aload_0         
_L2:
		Exception exception;
		throw exception;
	//   21   41:monitorexit     
	//   22   42:aload_2         
	//   23   43:athrow          
		exception;
	//   24   44:astore_2        
		if(true) goto _L2; else goto _L1
_L1:
	//*  25   45:goto            40
	}

	public int getAccumulatedEventCount()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		int i = accumulatedEvents.size();
	//    2    2:aload_0         
	//    3    3:getfield        #38  <Field List accumulatedEvents>
	//    4    6:invokeinterface #150 <Method int List.size()>
	//    5   11:istore_1        
		this;
	//    6   12:aload_0         
		JVM INSTR monitorexit ;
	//    7   13:monitorexit     
		return i;
	//    8   14:iload_1         
	//    9   15:ireturn         
		Exception exception;
		exception;
	//   10   16:astore_2        
	//*  11   17:aload_0         
		throw exception;
	//   12   18:monitorexit     
	//   13   19:aload_2         
	//   14   20:athrow          
	}

	public List getEventsToPersist()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		List list;
		list = accumulatedEvents;
	//    2    2:aload_0         
	//    3    3:getfield        #38  <Field List accumulatedEvents>
	//    4    6:astore_1        
		accumulatedEvents = ((List) (new ArrayList()));
	//    5    7:aload_0         
	//    6    8:new             #35  <Class ArrayList>
	//    7   11:dup             
	//    8   12:invokespecial   #36  <Method void ArrayList()>
	//    9   15:putfield        #38  <Field List accumulatedEvents>
		this;
	//   10   18:aload_0         
		JVM INSTR monitorexit ;
	//   11   19:monitorexit     
		return list;
	//   12   20:aload_1         
	//   13   21:areturn         
		Exception exception;
		exception;
	//   14   22:astore_1        
	//*  15   23:aload_0         
		throw exception;
	//   16   24:monitorexit     
	//   17   25:aload_1         
	//   18   26:athrow          
	}

	public int populateRequest(GraphRequest graphrequest, boolean flag, boolean flag1)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		int i;
		JSONArray jsonarray;
		Iterator iterator;
		i = numSkippedEventsDueToFullBuffer;
	//    2    2:aload_0         
	//    3    3:getfield        #90  <Field int numSkippedEventsDueToFullBuffer>
	//    4    6:istore          4
		inFlightEvents.addAll(((java.util.Collection) (accumulatedEvents)));
	//    5    8:aload_0         
	//    6    9:getfield        #40  <Field List inFlightEvents>
	//    7   12:aload_0         
	//    8   13:getfield        #38  <Field List accumulatedEvents>
	//    9   16:invokeinterface #142 <Method boolean List.addAll(java.util.Collection)>
	//   10   21:pop             
		accumulatedEvents.clear();
	//   11   22:aload_0         
	//   12   23:getfield        #38  <Field List accumulatedEvents>
	//   13   26:invokeinterface #159 <Method void List.clear()>
		jsonarray = new JSONArray();
	//   14   31:new             #114 <Class JSONArray>
	//   15   34:dup             
	//   16   35:invokespecial   #165 <Method void JSONArray()>
	//   17   38:astore          5
		iterator = inFlightEvents.iterator();
	//   18   40:aload_0         
	//   19   41:getfield        #40  <Field List inFlightEvents>
	//   20   44:invokeinterface #169 <Method Iterator List.iterator()>
	//   21   49:astore          6
_L3:
		AppEventsLogger.AppEvent appevent;
		if(!iterator.hasNext())
			break MISSING_BLOCK_LABEL_99;
	//   22   51:aload           6
	//   23   53:invokeinterface #175 <Method boolean Iterator.hasNext()>
	//   24   58:ifeq            99
		appevent = (AppEventsLogger.AppEvent)iterator.next();
	//   25   61:aload           6
	//   26   63:invokeinterface #179 <Method Object Iterator.next()>
	//   27   68:checkcast       #181 <Class AppEventsLogger$AppEvent>
	//   28   71:astore          7
		if(flag) goto _L2; else goto _L1
	//   29   73:iload_2         
	//   30   74:ifne            85
_L1:
		if(appevent.getIsImplicit()) goto _L3; else goto _L2
	//   31   77:aload           7
	//   32   79:invokevirtual   #184 <Method boolean AppEventsLogger$AppEvent.getIsImplicit()>
	//   33   82:ifne            51
_L2:
		jsonarray.put(((Object) (appevent.getJSONObject())));
	//   34   85:aload           5
	//   35   87:aload           7
	//   36   89:invokevirtual   #188 <Method JSONObject AppEventsLogger$AppEvent.getJSONObject()>
	//   37   92:invokevirtual   #191 <Method JSONArray JSONArray.put(Object)>
	//   38   95:pop             
		  goto _L3
	//*  39   96:goto            51
		if(jsonarray.length() != 0)
			break MISSING_BLOCK_LABEL_111;
	//   40   99:aload           5
	//   41  101:invokevirtual   #194 <Method int JSONArray.length()>
	//   42  104:ifne            111
		this;
	//   43  107:aload_0         
		JVM INSTR monitorexit ;
	//   44  108:monitorexit     
		return 0;
	//   45  109:iconst_0        
	//   46  110:ireturn         
		this;
	//   47  111:aload_0         
		JVM INSTR monitorexit ;
	//   48  112:monitorexit     
		populateRequest(graphrequest, i, jsonarray, flag1);
	//   49  113:aload_0         
	//   50  114:aload_1         
	//   51  115:iload           4
	//   52  117:aload           5
	//   53  119:iload_3         
	//   54  120:invokespecial   #196 <Method void populateRequest(GraphRequest, int, JSONArray, boolean)>
		return jsonarray.length();
	//   55  123:aload           5
	//   56  125:invokevirtual   #194 <Method int JSONArray.length()>
	//   57  128:ireturn         
		graphrequest;
	//   58  129:astore_1        
		this;
	//   59  130:aload_0         
		JVM INSTR monitorexit ;
	//   60  131:monitorexit     
		throw graphrequest;
	//   61  132:aload_1         
	//   62  133:athrow          
	}

	public static final String ENCODED_EVENTS_KEY = "encoded_events";
	public static final String EVENT_COUNT_KEY = "event_count";
	public static final String NUM_SKIPPED_KEY = "num_skipped";
	private final int MAX_ACCUMULATED_LOG_EVENTS = 1000;
	private List accumulatedEvents;
	private String anonymousAppDeviceGUID;
	private AttributionIdentifiers attributionIdentifiers;
	private List inFlightEvents;
	private int numSkippedEventsDueToFullBuffer;
	private String packageName;

	public AppEventsLogger$SessionEventsState(AttributionIdentifiers attributionidentifiers, String s, String s1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #33  <Method void Object()>
		accumulatedEvents = ((List) (new ArrayList()));
	//    2    4:aload_0         
	//    3    5:new             #35  <Class ArrayList>
	//    4    8:dup             
	//    5    9:invokespecial   #36  <Method void ArrayList()>
	//    6   12:putfield        #38  <Field List accumulatedEvents>
		inFlightEvents = ((List) (new ArrayList()));
	//    7   15:aload_0         
	//    8   16:new             #35  <Class ArrayList>
	//    9   19:dup             
	//   10   20:invokespecial   #36  <Method void ArrayList()>
	//   11   23:putfield        #40  <Field List inFlightEvents>
	//   12   26:aload_0         
	//   13   27:sipush          1000
	//   14   30:putfield        #42  <Field int MAX_ACCUMULATED_LOG_EVENTS>
		attributionIdentifiers = attributionidentifiers;
	//   15   33:aload_0         
	//   16   34:aload_1         
	//   17   35:putfield        #44  <Field AttributionIdentifiers attributionIdentifiers>
		packageName = s;
	//   18   38:aload_0         
	//   19   39:aload_2         
	//   20   40:putfield        #46  <Field String packageName>
		anonymousAppDeviceGUID = s1;
	//   21   43:aload_0         
	//   22   44:aload_3         
	//   23   45:putfield        #48  <Field String anonymousAppDeviceGUID>
	//   24   48:return          
	}
}

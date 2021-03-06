// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.appevents;

import android.content.Context;
import android.os.Bundle;
import com.facebook.GraphRequest;
import com.facebook.appevents.internal.AppEventsLoggerUtility;
import com.facebook.internal.AttributionIdentifiers;
import com.facebook.internal.Utility;
import com.newrelic.agent.android.instrumentation.JSONArrayInstrumentation;
import java.io.UnsupportedEncodingException;
import java.util.*;
import org.json.*;

// Referenced classes of package com.facebook.appevents:
//			AppEvent

class SessionEventsState
{

	public SessionEventsState(AttributionIdentifiers attributionidentifiers, String s)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #21  <Method void Object()>
		accumulatedEvents = ((List) (new ArrayList()));
	//    2    4:aload_0         
	//    3    5:new             #23  <Class ArrayList>
	//    4    8:dup             
	//    5    9:invokespecial   #24  <Method void ArrayList()>
	//    6   12:putfield        #26  <Field List accumulatedEvents>
		inFlightEvents = ((List) (new ArrayList()));
	//    7   15:aload_0         
	//    8   16:new             #23  <Class ArrayList>
	//    9   19:dup             
	//   10   20:invokespecial   #24  <Method void ArrayList()>
	//   11   23:putfield        #28  <Field List inFlightEvents>
	//   12   26:aload_0         
	//   13   27:sipush          1000
	//   14   30:putfield        #30  <Field int MAX_ACCUMULATED_LOG_EVENTS>
		attributionIdentifiers = attributionidentifiers;
	//   15   33:aload_0         
	//   16   34:aload_1         
	//   17   35:putfield        #32  <Field AttributionIdentifiers attributionIdentifiers>
		anonymousAppDeviceGUID = s;
	//   18   38:aload_0         
	//   19   39:aload_2         
	//   20   40:putfield        #34  <Field String anonymousAppDeviceGUID>
	//   21   43:return          
	}

	private byte[] getStringAsByteArray(String s)
	{
		try
		{
			s = ((String) (s.getBytes("UTF-8")));
	//    0    0:aload_1         
	//    1    1:ldc1            #41  <String "UTF-8">
	//    2    3:invokevirtual   #46  <Method byte[] String.getBytes(String)>
	//    3    6:astore_1        
		}
	//*   4    7:aload_1         
	//*   5    8:areturn         
		// Misplaced declaration of an exception variable
		catch(String s)
	//*   6    9:astore_1        
		{
			Utility.logd("Encoding exception: ", ((Exception) (s)));
	//    7   10:ldc1            #48  <String "Encoding exception: ">
	//    8   12:aload_1         
	//    9   13:invokestatic    #54  <Method void Utility.logd(String, Exception)>
			return null;
	//   10   16:aconst_null     
	//   11   17:areturn         
		}
		return ((byte []) (s));
	}

	private void populateRequest(GraphRequest graphrequest, Context context, int i, JSONArray jsonarray, boolean flag)
	{
		JSONObject jsonobject = AppEventsLoggerUtility.getJSONObjectForGraphAPICall(com.facebook.appevents.internal.AppEventsLoggerUtility.GraphAPIActivityType.CUSTOM_APP_EVENTS, attributionIdentifiers, anonymousAppDeviceGUID, flag, context);
	//    0    0:getstatic       #64  <Field com.facebook.appevents.internal.AppEventsLoggerUtility$GraphAPIActivityType com.facebook.appevents.internal.AppEventsLoggerUtility$GraphAPIActivityType.CUSTOM_APP_EVENTS>
	//    1    3:aload_0         
	//    2    4:getfield        #32  <Field AttributionIdentifiers attributionIdentifiers>
	//    3    7:aload_0         
	//    4    8:getfield        #34  <Field String anonymousAppDeviceGUID>
	//    5   11:iload           5
	//    6   13:aload_2         
	//    7   14:invokestatic    #70  <Method JSONObject AppEventsLoggerUtility.getJSONObjectForGraphAPICall(com.facebook.appevents.internal.AppEventsLoggerUtility$GraphAPIActivityType, AttributionIdentifiers, String, boolean, Context)>
	//    8   17:astore          6
		context = ((Context) (jsonobject));
	//    9   19:aload           6
	//   10   21:astore_2        
		if(numSkippedEventsDueToFullBuffer <= 0) goto _L2; else goto _L1
	//   11   22:aload_0         
	//   12   23:getfield        #72  <Field int numSkippedEventsDueToFullBuffer>
	//   13   26:ifle            52
_L1:
		jsonobject.put("num_skipped_events", i);
	//   14   29:aload           6
	//   15   31:ldc1            #74  <String "num_skipped_events">
	//   16   33:iload_3         
	//   17   34:invokevirtual   #80  <Method JSONObject JSONObject.put(String, int)>
	//   18   37:pop             
		context = ((Context) (jsonobject));
	//   19   38:aload           6
	//   20   40:astore_2        
		  goto _L2
	//*  21   41:goto            52
_L4:
		context = ((Context) (new JSONObject()));
	//   22   44:new             #76  <Class JSONObject>
	//   23   47:dup             
	//   24   48:invokespecial   #81  <Method void JSONObject()>
	//   25   51:astore_2        
_L2:
		graphrequest.setGraphObject(((JSONObject) (context)));
	//   26   52:aload_1         
	//   27   53:aload_2         
	//   28   54:invokevirtual   #87  <Method void GraphRequest.setGraphObject(JSONObject)>
		Bundle bundle = graphrequest.getParameters();
	//   29   57:aload_1         
	//   30   58:invokevirtual   #91  <Method Bundle GraphRequest.getParameters()>
	//   31   61:astore          6
		context = ((Context) (bundle));
	//   32   63:aload           6
	//   33   65:astore_2        
		if(bundle == null)
	//*  34   66:aload           6
	//*  35   68:ifnonnull       79
			context = ((Context) (new Bundle()));
	//   36   71:new             #93  <Class Bundle>
	//   37   74:dup             
	//   38   75:invokespecial   #94  <Method void Bundle()>
	//   39   78:astore_2        
		if(!(jsonarray instanceof JSONArray))
	//*  40   79:aload           4
	//*  41   81:instanceof      #96  <Class JSONArray>
	//*  42   84:ifne            97
			jsonarray = ((JSONArray) (jsonarray.toString()));
	//   43   87:aload           4
	//   44   89:invokevirtual   #100 <Method String JSONArray.toString()>
	//   45   92:astore          4
		else
	//*  46   94:goto            107
			jsonarray = ((JSONArray) (JSONArrayInstrumentation.toString((JSONArray)jsonarray)));
	//   47   97:aload           4
	//   48   99:checkcast       #96  <Class JSONArray>
	//   49  102:invokestatic    #105 <Method String JSONArrayInstrumentation.toString(JSONArray)>
	//   50  105:astore          4
		if(jsonarray != null)
	//*  51  107:aload           4
	//*  52  109:ifnull          130
		{
			((Bundle) (context)).putByteArray("custom_events_file", getStringAsByteArray(((String) (jsonarray))));
	//   53  112:aload_2         
	//   54  113:ldc1            #107 <String "custom_events_file">
	//   55  115:aload_0         
	//   56  116:aload           4
	//   57  118:invokespecial   #109 <Method byte[] getStringAsByteArray(String)>
	//   58  121:invokevirtual   #113 <Method void Bundle.putByteArray(String, byte[])>
			graphrequest.setTag(((Object) (jsonarray)));
	//   59  124:aload_1         
	//   60  125:aload           4
	//   61  127:invokevirtual   #117 <Method void GraphRequest.setTag(Object)>
		}
		graphrequest.setParameters(((Bundle) (context)));
	//   62  130:aload_1         
	//   63  131:aload_2         
	//   64  132:invokevirtual   #121 <Method void GraphRequest.setParameters(Bundle)>
		return;
	//   65  135:return          
		context;
	//   66  136:astore_2        
		if(true) goto _L4; else goto _L3
_L3:
	//*  67  137:goto            44
	}

	public void addEvent(AppEvent appevent)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		if(accumulatedEvents.size() + inFlightEvents.size() >= 1000)
	//*   2    2:aload_0         
	//*   3    3:getfield        #26  <Field List accumulatedEvents>
	//*   4    6:invokeinterface #129 <Method int List.size()>
	//*   5   11:aload_0         
	//*   6   12:getfield        #28  <Field List inFlightEvents>
	//*   7   15:invokeinterface #129 <Method int List.size()>
	//*   8   20:iadd            
	//*   9   21:sipush          1000
	//*  10   24:icmplt          40
		{
			numSkippedEventsDueToFullBuffer = numSkippedEventsDueToFullBuffer + 1;
	//   11   27:aload_0         
	//   12   28:aload_0         
	//   13   29:getfield        #72  <Field int numSkippedEventsDueToFullBuffer>
	//   14   32:iconst_1        
	//   15   33:iadd            
	//   16   34:putfield        #72  <Field int numSkippedEventsDueToFullBuffer>
			break MISSING_BLOCK_LABEL_51;
	//   17   37:goto            51
		}
		accumulatedEvents.add(((Object) (appevent)));
	//   18   40:aload_0         
	//   19   41:getfield        #26  <Field List accumulatedEvents>
	//   20   44:aload_1         
	//   21   45:invokeinterface #133 <Method boolean List.add(Object)>
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
			break MISSING_BLOCK_LABEL_20;
	//    2    2:iload_1         
	//    3    3:ifeq            20
		accumulatedEvents.addAll(((java.util.Collection) (inFlightEvents)));
	//    4    6:aload_0         
	//    5    7:getfield        #26  <Field List accumulatedEvents>
	//    6   10:aload_0         
	//    7   11:getfield        #28  <Field List inFlightEvents>
	//    8   14:invokeinterface #139 <Method boolean List.addAll(java.util.Collection)>
	//    9   19:pop             
		inFlightEvents.clear();
	//   10   20:aload_0         
	//   11   21:getfield        #28  <Field List inFlightEvents>
	//   12   24:invokeinterface #142 <Method void List.clear()>
		numSkippedEventsDueToFullBuffer = 0;
	//   13   29:aload_0         
	//   14   30:iconst_0        
	//   15   31:putfield        #72  <Field int numSkippedEventsDueToFullBuffer>
		this;
	//   16   34:aload_0         
		JVM INSTR monitorexit ;
	//   17   35:monitorexit     
		return;
	//   18   36:return          
		Exception exception;
		exception;
	//   19   37:astore_2        
	//*  20   38:aload_0         
		throw exception;
	//   21   39:monitorexit     
	//   22   40:aload_2         
	//   23   41:athrow          
	}

	public int getAccumulatedEventCount()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		int i = accumulatedEvents.size();
	//    2    2:aload_0         
	//    3    3:getfield        #26  <Field List accumulatedEvents>
	//    4    6:invokeinterface #129 <Method int List.size()>
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
	//    3    3:getfield        #26  <Field List accumulatedEvents>
	//    4    6:astore_1        
		accumulatedEvents = ((List) (new ArrayList()));
	//    5    7:aload_0         
	//    6    8:new             #23  <Class ArrayList>
	//    7   11:dup             
	//    8   12:invokespecial   #24  <Method void ArrayList()>
	//    9   15:putfield        #26  <Field List accumulatedEvents>
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

	public int populateRequest(GraphRequest graphrequest, Context context, boolean flag, boolean flag1)
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
	//    3    3:getfield        #72  <Field int numSkippedEventsDueToFullBuffer>
	//    4    6:istore          5
		inFlightEvents.addAll(((java.util.Collection) (accumulatedEvents)));
	//    5    8:aload_0         
	//    6    9:getfield        #28  <Field List inFlightEvents>
	//    7   12:aload_0         
	//    8   13:getfield        #26  <Field List accumulatedEvents>
	//    9   16:invokeinterface #139 <Method boolean List.addAll(java.util.Collection)>
	//   10   21:pop             
		accumulatedEvents.clear();
	//   11   22:aload_0         
	//   12   23:getfield        #26  <Field List accumulatedEvents>
	//   13   26:invokeinterface #142 <Method void List.clear()>
		jsonarray = new JSONArray();
	//   14   31:new             #96  <Class JSONArray>
	//   15   34:dup             
	//   16   35:invokespecial   #149 <Method void JSONArray()>
	//   17   38:astore          6
		iterator = inFlightEvents.iterator();
	//   18   40:aload_0         
	//   19   41:getfield        #28  <Field List inFlightEvents>
	//   20   44:invokeinterface #153 <Method Iterator List.iterator()>
	//   21   49:astore          7
_L3:
		AppEvent appevent;
		if(!iterator.hasNext())
			break MISSING_BLOCK_LABEL_120;
	//   22   51:aload           7
	//   23   53:invokeinterface #159 <Method boolean Iterator.hasNext()>
	//   24   58:ifeq            120
		appevent = (AppEvent)iterator.next();
	//   25   61:aload           7
	//   26   63:invokeinterface #163 <Method Object Iterator.next()>
	//   27   68:checkcast       #165 <Class AppEvent>
	//   28   71:astore          8
		if(!appevent.isChecksumValid())
			break MISSING_BLOCK_LABEL_107;
	//   29   73:aload           8
	//   30   75:invokevirtual   #168 <Method boolean AppEvent.isChecksumValid()>
	//   31   78:ifeq            107
		if(flag) goto _L2; else goto _L1
	//   32   81:iload_3         
	//   33   82:ifne            93
_L1:
		if(appevent.getIsImplicit()) goto _L3; else goto _L2
	//   34   85:aload           8
	//   35   87:invokevirtual   #171 <Method boolean AppEvent.getIsImplicit()>
	//   36   90:ifne            51
_L2:
		jsonarray.put(((Object) (appevent.getJSONObject())));
	//   37   93:aload           6
	//   38   95:aload           8
	//   39   97:invokevirtual   #175 <Method JSONObject AppEvent.getJSONObject()>
	//   40  100:invokevirtual   #178 <Method JSONArray JSONArray.put(Object)>
	//   41  103:pop             
		  goto _L3
	//*  42  104:goto            51
		Utility.logd("Event with invalid checksum: %s", appevent.toString());
	//   43  107:ldc1            #180 <String "Event with invalid checksum: %s">
	//   44  109:aload           8
	//   45  111:invokevirtual   #181 <Method String AppEvent.toString()>
	//   46  114:invokestatic    #184 <Method void Utility.logd(String, String)>
		  goto _L3
	//*  47  117:goto            51
		if(jsonarray.length() != 0)
			break MISSING_BLOCK_LABEL_132;
	//   48  120:aload           6
	//   49  122:invokevirtual   #187 <Method int JSONArray.length()>
	//   50  125:ifne            132
		this;
	//   51  128:aload_0         
		JVM INSTR monitorexit ;
	//   52  129:monitorexit     
		return 0;
	//   53  130:iconst_0        
	//   54  131:ireturn         
		this;
	//   55  132:aload_0         
		JVM INSTR monitorexit ;
	//   56  133:monitorexit     
		populateRequest(graphrequest, context, i, jsonarray, flag1);
	//   57  134:aload_0         
	//   58  135:aload_1         
	//   59  136:aload_2         
	//   60  137:iload           5
	//   61  139:aload           6
	//   62  141:iload           4
	//   63  143:invokespecial   #189 <Method void populateRequest(GraphRequest, Context, int, JSONArray, boolean)>
		return jsonarray.length();
	//   64  146:aload           6
	//   65  148:invokevirtual   #187 <Method int JSONArray.length()>
	//   66  151:ireturn         
		graphrequest;
	//   67  152:astore_1        
		this;
	//   68  153:aload_0         
		JVM INSTR monitorexit ;
	//   69  154:monitorexit     
		throw graphrequest;
	//   70  155:aload_1         
	//   71  156:athrow          
	}

	private final int MAX_ACCUMULATED_LOG_EVENTS = 1000;
	private List accumulatedEvents;
	private String anonymousAppDeviceGUID;
	private AttributionIdentifiers attributionIdentifiers;
	private List inFlightEvents;
	private int numSkippedEventsDueToFullBuffer;
}

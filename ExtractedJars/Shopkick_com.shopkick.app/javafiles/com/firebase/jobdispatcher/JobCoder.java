// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.firebase.jobdispatcher;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import java.util.*;
import org.json.*;

// Referenced classes of package com.firebase.jobdispatcher:
//			ObservedUri, RetryStrategy, Trigger, Constraint, 
//			TriggerReason, JobParameters, JobTrigger, JobInvocation

final class JobCoder
{

	JobCoder(String s)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
		prefix = s;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #19  <Field String prefix>
	//    5    9:return          
	}

	private static List convertJsonToObservedUris(String s)
	{
		ArrayList arraylist = new ArrayList();
	//    0    0:new             #27  <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #28  <Method void ArrayList()>
	//    3    7:astore          4
		int i;
		int j;
		int k;
		Object obj;
		try
		{
			obj = ((Object) (new JSONObject(s)));
	//    4    9:new             #30  <Class JSONObject>
	//    5   12:dup             
	//    6   13:aload_0         
	//    7   14:invokespecial   #32  <Method void JSONObject(String)>
	//    8   17:astore          5
			s = ((String) (((JSONObject) (obj)).getJSONArray("uri_flags")));
	//    9   19:aload           5
	//   10   21:ldc1            #11  <String "uri_flags">
	//   11   23:invokevirtual   #36  <Method JSONArray JSONObject.getJSONArray(String)>
	//   12   26:astore_0        
			obj = ((Object) (((JSONObject) (obj)).getJSONArray("uris")));
	//   13   27:aload           5
	//   14   29:ldc1            #8   <String "uris">
	//   15   31:invokevirtual   #36  <Method JSONArray JSONObject.getJSONArray(String)>
	//   16   34:astore          5
			j = ((JSONArray) (s)).length();
	//   17   36:aload_0         
	//   18   37:invokevirtual   #42  <Method int JSONArray.length()>
	//   19   40:istore_2        
		}
	//*  20   41:iconst_0        
	//*  21   42:istore_1        
	//*  22   43:iload_1         
	//*  23   44:iload_2         
	//*  24   45:icmpge          86
	//*  25   48:aload_0         
	//*  26   49:iload_1         
	//*  27   50:invokevirtual   #46  <Method int JSONArray.getInt(int)>
	//*  28   53:istore_3        
	//*  29   54:aload           4
	//*  30   56:new             #48  <Class ObservedUri>
	//*  31   59:dup             
	//*  32   60:aload           5
	//*  33   62:iload_1         
	//*  34   63:invokevirtual   #52  <Method String JSONArray.getString(int)>
	//*  35   66:invokestatic    #58  <Method Uri Uri.parse(String)>
	//*  36   69:iload_3         
	//*  37   70:invokespecial   #61  <Method void ObservedUri(Uri, int)>
	//*  38   73:invokeinterface #67  <Method boolean List.add(Object)>
	//*  39   78:pop             
	//*  40   79:iload_1         
	//*  41   80:iconst_1        
	//*  42   81:iadd            
	//*  43   82:istore_1        
	//*  44   83:goto            43
	//*  45   86:aload           4
	//*  46   88:areturn         
		// Misplaced declaration of an exception variable
		catch(String s)
	//*  47   89:astore_0        
		{
			throw new RuntimeException(((Throwable) (s)));
	//   48   90:new             #69  <Class RuntimeException>
	//   49   93:dup             
	//   50   94:aload_0         
	//   51   95:invokespecial   #72  <Method void RuntimeException(Throwable)>
	//   52   98:athrow          
		}
		i = 0;
		if(i >= j)
			break; /* Loop/switch isn't completed */
		k = ((JSONArray) (s)).getInt(i);
		((List) (arraylist)).add(((Object) (new ObservedUri(Uri.parse(((JSONArray) (obj)).getString(i)), k))));
		i++;
		if(true) goto _L2; else goto _L1
_L2:
		break MISSING_BLOCK_LABEL_43;
_L1:
		return ((List) (arraylist));
	}

	private static String convertObservedUrisToJsonString(List list)
	{
		JSONObject jsonobject = new JSONObject();
	//    0    0:new             #30  <Class JSONObject>
	//    1    3:dup             
	//    2    4:invokespecial   #79  <Method void JSONObject()>
	//    3    7:astore_1        
		JSONArray jsonarray = new JSONArray();
	//    4    8:new             #38  <Class JSONArray>
	//    5   11:dup             
	//    6   12:invokespecial   #80  <Method void JSONArray()>
	//    7   15:astore_2        
		JSONArray jsonarray1 = new JSONArray();
	//    8   16:new             #38  <Class JSONArray>
	//    9   19:dup             
	//   10   20:invokespecial   #80  <Method void JSONArray()>
	//   11   23:astore_3        
		ObservedUri observeduri;
		for(list = ((List) (list.iterator())); ((Iterator) (list)).hasNext(); jsonarray1.put(((Object) (observeduri.getUri()))))
	//*  12   24:aload_0         
	//*  13   25:invokeinterface #84  <Method Iterator List.iterator()>
	//*  14   30:astore_0        
	//*  15   31:aload_0         
	//*  16   32:invokeinterface #90  <Method boolean Iterator.hasNext()>
	//*  17   37:ifeq            74
		{
			observeduri = (ObservedUri)((Iterator) (list)).next();
	//   18   40:aload_0         
	//   19   41:invokeinterface #94  <Method Object Iterator.next()>
	//   20   46:checkcast       #48  <Class ObservedUri>
	//   21   49:astore          4
			jsonarray.put(observeduri.getFlags());
	//   22   51:aload_2         
	//   23   52:aload           4
	//   24   54:invokevirtual   #97  <Method int ObservedUri.getFlags()>
	//   25   57:invokevirtual   #101 <Method JSONArray JSONArray.put(int)>
	//   26   60:pop             
		}

	//   27   61:aload_3         
	//   28   62:aload           4
	//   29   64:invokevirtual   #105 <Method Uri ObservedUri.getUri()>
	//   30   67:invokevirtual   #108 <Method JSONArray JSONArray.put(Object)>
	//   31   70:pop             
	//*  32   71:goto            31
		try
		{
			jsonobject.put("uri_flags", ((Object) (jsonarray)));
	//   33   74:aload_1         
	//   34   75:ldc1            #11  <String "uri_flags">
	//   35   77:aload_2         
	//   36   78:invokevirtual   #111 <Method JSONObject JSONObject.put(String, Object)>
	//   37   81:pop             
			jsonobject.put("uris", ((Object) (jsonarray1)));
	//   38   82:aload_1         
	//   39   83:ldc1            #8   <String "uris">
	//   40   85:aload_3         
	//   41   86:invokevirtual   #111 <Method JSONObject JSONObject.put(String, Object)>
	//   42   89:pop             
		}
	//*  43   90:aload_1         
	//*  44   91:invokevirtual   #115 <Method String JSONObject.toString()>
	//*  45   94:areturn         
		// Misplaced declaration of an exception variable
		catch(List list)
	//*  46   95:astore_0        
		{
			throw new RuntimeException(((Throwable) (list)));
	//   47   96:new             #69  <Class RuntimeException>
	//   48   99:dup             
	//   49  100:aload_0         
	//   50  101:invokespecial   #72  <Method void RuntimeException(Throwable)>
	//   51  104:athrow          
		}
		return jsonobject.toString();
	}

	private RetryStrategy decodeRetryStrategy(Bundle bundle)
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #120 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #121 <Method void StringBuilder()>
	//    3    7:astore          4
		stringbuilder.append(prefix);
	//    4    9:aload           4
	//    5   11:aload_0         
	//    6   12:getfield        #19  <Field String prefix>
	//    7   15:invokevirtual   #125 <Method StringBuilder StringBuilder.append(String)>
	//    8   18:pop             
		stringbuilder.append("retry_policy");
	//    9   19:aload           4
	//   10   21:ldc1            #127 <String "retry_policy">
	//   11   23:invokevirtual   #125 <Method StringBuilder StringBuilder.append(String)>
	//   12   26:pop             
		int i = bundle.getInt(stringbuilder.toString());
	//   13   27:aload_1         
	//   14   28:aload           4
	//   15   30:invokevirtual   #128 <Method String StringBuilder.toString()>
	//   16   33:invokevirtual   #133 <Method int Bundle.getInt(String)>
	//   17   36:istore_2        
		if(i != 1 && i != 2)
	//*  18   37:iload_2         
	//*  19   38:iconst_1        
	//*  20   39:icmpeq          51
	//*  21   42:iload_2         
	//*  22   43:iconst_2        
	//*  23   44:icmpeq          51
		{
			return RetryStrategy.DEFAULT_EXPONENTIAL;
	//   24   47:getstatic       #139 <Field RetryStrategy RetryStrategy.DEFAULT_EXPONENTIAL>
	//   25   50:areturn         
		} else
		{
			StringBuilder stringbuilder1 = new StringBuilder();
	//   26   51:new             #120 <Class StringBuilder>
	//   27   54:dup             
	//   28   55:invokespecial   #121 <Method void StringBuilder()>
	//   29   58:astore          4
			stringbuilder1.append(prefix);
	//   30   60:aload           4
	//   31   62:aload_0         
	//   32   63:getfield        #19  <Field String prefix>
	//   33   66:invokevirtual   #125 <Method StringBuilder StringBuilder.append(String)>
	//   34   69:pop             
			stringbuilder1.append("initial_backoff_seconds");
	//   35   70:aload           4
	//   36   72:ldc1            #141 <String "initial_backoff_seconds">
	//   37   74:invokevirtual   #125 <Method StringBuilder StringBuilder.append(String)>
	//   38   77:pop             
			int j = bundle.getInt(stringbuilder1.toString());
	//   39   78:aload_1         
	//   40   79:aload           4
	//   41   81:invokevirtual   #128 <Method String StringBuilder.toString()>
	//   42   84:invokevirtual   #133 <Method int Bundle.getInt(String)>
	//   43   87:istore_3        
			stringbuilder1 = new StringBuilder();
	//   44   88:new             #120 <Class StringBuilder>
	//   45   91:dup             
	//   46   92:invokespecial   #121 <Method void StringBuilder()>
	//   47   95:astore          4
			stringbuilder1.append(prefix);
	//   48   97:aload           4
	//   49   99:aload_0         
	//   50  100:getfield        #19  <Field String prefix>
	//   51  103:invokevirtual   #125 <Method StringBuilder StringBuilder.append(String)>
	//   52  106:pop             
			stringbuilder1.append("maximum_backoff_seconds");
	//   53  107:aload           4
	//   54  109:ldc1            #143 <String "maximum_backoff_seconds">
	//   55  111:invokevirtual   #125 <Method StringBuilder StringBuilder.append(String)>
	//   56  114:pop             
			return new RetryStrategy(i, j, bundle.getInt(stringbuilder1.toString()));
	//   57  115:new             #135 <Class RetryStrategy>
	//   58  118:dup             
	//   59  119:iload_2         
	//   60  120:iload_3         
	//   61  121:aload_1         
	//   62  122:aload           4
	//   63  124:invokevirtual   #128 <Method String StringBuilder.toString()>
	//   64  127:invokevirtual   #133 <Method int Bundle.getInt(String)>
	//   65  130:invokespecial   #146 <Method void RetryStrategy(int, int, int)>
	//   66  133:areturn         
		}
	}

	private JobTrigger decodeTrigger(Bundle bundle)
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #120 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #121 <Method void StringBuilder()>
	//    3    7:astore_3        
		stringbuilder.append(prefix);
	//    4    8:aload_3         
	//    5    9:aload_0         
	//    6   10:getfield        #19  <Field String prefix>
	//    7   13:invokevirtual   #125 <Method StringBuilder StringBuilder.append(String)>
	//    8   16:pop             
		stringbuilder.append("trigger_type");
	//    9   17:aload_3         
	//   10   18:ldc1            #150 <String "trigger_type">
	//   11   20:invokevirtual   #125 <Method StringBuilder StringBuilder.append(String)>
	//   12   23:pop             
		switch(bundle.getInt(stringbuilder.toString()))
	//*  13   24:aload_1         
	//*  14   25:aload_3         
	//*  15   26:invokevirtual   #128 <Method String StringBuilder.toString()>
	//*  16   29:invokevirtual   #133 <Method int Bundle.getInt(String)>
		{
	//*  17   32:tableswitch     1 3: default 60
	//	               1 126
	//	               2 122
	//	               3 80
		default:
			if(Log.isLoggable("FJD.ExternalReceiver", 3))
	//*  18   60:ldc1            #152 <String "FJD.ExternalReceiver">
	//*  19   62:iconst_3        
	//*  20   63:invokestatic    #158 <Method boolean Log.isLoggable(String, int)>
	//*  21   66:ifeq            196
				Log.d("FJD.ExternalReceiver", "Unsupported trigger.");
	//   22   69:ldc1            #152 <String "FJD.ExternalReceiver">
	//   23   71:ldc1            #160 <String "Unsupported trigger.">
	//   24   73:invokestatic    #164 <Method int Log.d(String, String)>
	//   25   76:pop             
			break;

	//*  26   77:goto            196
		case 3: // '\003'
			StringBuilder stringbuilder1 = new StringBuilder();
	//   27   80:new             #120 <Class StringBuilder>
	//   28   83:dup             
	//   29   84:invokespecial   #121 <Method void StringBuilder()>
	//   30   87:astore_3        
			stringbuilder1.append(prefix);
	//   31   88:aload_3         
	//   32   89:aload_0         
	//   33   90:getfield        #19  <Field String prefix>
	//   34   93:invokevirtual   #125 <Method StringBuilder StringBuilder.append(String)>
	//   35   96:pop             
			stringbuilder1.append("observed_uris");
	//   36   97:aload_3         
	//   37   98:ldc1            #166 <String "observed_uris">
	//   38  100:invokevirtual   #125 <Method StringBuilder StringBuilder.append(String)>
	//   39  103:pop             
			return ((JobTrigger) (Trigger.contentUriTrigger(Collections.unmodifiableList(convertJsonToObservedUris(bundle.getString(stringbuilder1.toString()))))));
	//   40  104:aload_1         
	//   41  105:aload_3         
	//   42  106:invokevirtual   #128 <Method String StringBuilder.toString()>
	//   43  109:invokevirtual   #169 <Method String Bundle.getString(String)>
	//   44  112:invokestatic    #171 <Method List convertJsonToObservedUris(String)>
	//   45  115:invokestatic    #177 <Method List Collections.unmodifiableList(List)>
	//   46  118:invokestatic    #183 <Method JobTrigger$ContentUriTrigger Trigger.contentUriTrigger(List)>
	//   47  121:areturn         

		case 2: // '\002'
			return ((JobTrigger) (Trigger.NOW));
	//   48  122:getstatic       #187 <Field JobTrigger$ImmediateTrigger Trigger.NOW>
	//   49  125:areturn         

		case 1: // '\001'
			StringBuilder stringbuilder2 = new StringBuilder();
	//   50  126:new             #120 <Class StringBuilder>
	//   51  129:dup             
	//   52  130:invokespecial   #121 <Method void StringBuilder()>
	//   53  133:astore_3        
			stringbuilder2.append(prefix);
	//   54  134:aload_3         
	//   55  135:aload_0         
	//   56  136:getfield        #19  <Field String prefix>
	//   57  139:invokevirtual   #125 <Method StringBuilder StringBuilder.append(String)>
	//   58  142:pop             
			stringbuilder2.append("window_start");
	//   59  143:aload_3         
	//   60  144:ldc1            #189 <String "window_start">
	//   61  146:invokevirtual   #125 <Method StringBuilder StringBuilder.append(String)>
	//   62  149:pop             
			int i = bundle.getInt(stringbuilder2.toString());
	//   63  150:aload_1         
	//   64  151:aload_3         
	//   65  152:invokevirtual   #128 <Method String StringBuilder.toString()>
	//   66  155:invokevirtual   #133 <Method int Bundle.getInt(String)>
	//   67  158:istore_2        
			stringbuilder2 = new StringBuilder();
	//   68  159:new             #120 <Class StringBuilder>
	//   69  162:dup             
	//   70  163:invokespecial   #121 <Method void StringBuilder()>
	//   71  166:astore_3        
			stringbuilder2.append(prefix);
	//   72  167:aload_3         
	//   73  168:aload_0         
	//   74  169:getfield        #19  <Field String prefix>
	//   75  172:invokevirtual   #125 <Method StringBuilder StringBuilder.append(String)>
	//   76  175:pop             
			stringbuilder2.append("window_end");
	//   77  176:aload_3         
	//   78  177:ldc1            #191 <String "window_end">
	//   79  179:invokevirtual   #125 <Method StringBuilder StringBuilder.append(String)>
	//   80  182:pop             
			return ((JobTrigger) (Trigger.executionWindow(i, bundle.getInt(stringbuilder2.toString()))));
	//   81  183:iload_2         
	//   82  184:aload_1         
	//   83  185:aload_3         
	//   84  186:invokevirtual   #128 <Method String StringBuilder.toString()>
	//   85  189:invokevirtual   #133 <Method int Bundle.getInt(String)>
	//   86  192:invokestatic    #195 <Method JobTrigger$ExecutionWindowTrigger Trigger.executionWindow(int, int)>
	//   87  195:areturn         
		}
		return null;
	//   88  196:aconst_null     
	//   89  197:areturn         
	}

	private void encodeRetryStrategy(RetryStrategy retrystrategy, Bundle bundle)
	{
		RetryStrategy retrystrategy1 = retrystrategy;
	//    0    0:aload_1         
	//    1    1:astore_3        
		if(retrystrategy == null)
	//*   2    2:aload_1         
	//*   3    3:ifnonnull       10
			retrystrategy1 = RetryStrategy.DEFAULT_EXPONENTIAL;
	//    4    6:getstatic       #139 <Field RetryStrategy RetryStrategy.DEFAULT_EXPONENTIAL>
	//    5    9:astore_3        
		retrystrategy = ((RetryStrategy) (new StringBuilder()));
	//    6   10:new             #120 <Class StringBuilder>
	//    7   13:dup             
	//    8   14:invokespecial   #121 <Method void StringBuilder()>
	//    9   17:astore_1        
		((StringBuilder) (retrystrategy)).append(prefix);
	//   10   18:aload_1         
	//   11   19:aload_0         
	//   12   20:getfield        #19  <Field String prefix>
	//   13   23:invokevirtual   #125 <Method StringBuilder StringBuilder.append(String)>
	//   14   26:pop             
		((StringBuilder) (retrystrategy)).append("retry_policy");
	//   15   27:aload_1         
	//   16   28:ldc1            #127 <String "retry_policy">
	//   17   30:invokevirtual   #125 <Method StringBuilder StringBuilder.append(String)>
	//   18   33:pop             
		bundle.putInt(((StringBuilder) (retrystrategy)).toString(), retrystrategy1.getPolicy());
	//   19   34:aload_2         
	//   20   35:aload_1         
	//   21   36:invokevirtual   #128 <Method String StringBuilder.toString()>
	//   22   39:aload_3         
	//   23   40:invokevirtual   #200 <Method int RetryStrategy.getPolicy()>
	//   24   43:invokevirtual   #204 <Method void Bundle.putInt(String, int)>
		retrystrategy = ((RetryStrategy) (new StringBuilder()));
	//   25   46:new             #120 <Class StringBuilder>
	//   26   49:dup             
	//   27   50:invokespecial   #121 <Method void StringBuilder()>
	//   28   53:astore_1        
		((StringBuilder) (retrystrategy)).append(prefix);
	//   29   54:aload_1         
	//   30   55:aload_0         
	//   31   56:getfield        #19  <Field String prefix>
	//   32   59:invokevirtual   #125 <Method StringBuilder StringBuilder.append(String)>
	//   33   62:pop             
		((StringBuilder) (retrystrategy)).append("initial_backoff_seconds");
	//   34   63:aload_1         
	//   35   64:ldc1            #141 <String "initial_backoff_seconds">
	//   36   66:invokevirtual   #125 <Method StringBuilder StringBuilder.append(String)>
	//   37   69:pop             
		bundle.putInt(((StringBuilder) (retrystrategy)).toString(), retrystrategy1.getInitialBackoff());
	//   38   70:aload_2         
	//   39   71:aload_1         
	//   40   72:invokevirtual   #128 <Method String StringBuilder.toString()>
	//   41   75:aload_3         
	//   42   76:invokevirtual   #207 <Method int RetryStrategy.getInitialBackoff()>
	//   43   79:invokevirtual   #204 <Method void Bundle.putInt(String, int)>
		retrystrategy = ((RetryStrategy) (new StringBuilder()));
	//   44   82:new             #120 <Class StringBuilder>
	//   45   85:dup             
	//   46   86:invokespecial   #121 <Method void StringBuilder()>
	//   47   89:astore_1        
		((StringBuilder) (retrystrategy)).append(prefix);
	//   48   90:aload_1         
	//   49   91:aload_0         
	//   50   92:getfield        #19  <Field String prefix>
	//   51   95:invokevirtual   #125 <Method StringBuilder StringBuilder.append(String)>
	//   52   98:pop             
		((StringBuilder) (retrystrategy)).append("maximum_backoff_seconds");
	//   53   99:aload_1         
	//   54  100:ldc1            #143 <String "maximum_backoff_seconds">
	//   55  102:invokevirtual   #125 <Method StringBuilder StringBuilder.append(String)>
	//   56  105:pop             
		bundle.putInt(((StringBuilder) (retrystrategy)).toString(), retrystrategy1.getMaximumBackoff());
	//   57  106:aload_2         
	//   58  107:aload_1         
	//   59  108:invokevirtual   #128 <Method String StringBuilder.toString()>
	//   60  111:aload_3         
	//   61  112:invokevirtual   #210 <Method int RetryStrategy.getMaximumBackoff()>
	//   62  115:invokevirtual   #204 <Method void Bundle.putInt(String, int)>
	//   63  118:return          
	}

	private void encodeTrigger(JobTrigger jobtrigger, Bundle bundle)
	{
		if(jobtrigger == Trigger.NOW)
	//*   0    0:aload_1         
	//*   1    1:getstatic       #187 <Field JobTrigger$ImmediateTrigger Trigger.NOW>
	//*   2    4:if_acmpne       41
		{
			jobtrigger = ((JobTrigger) (new StringBuilder()));
	//    3    7:new             #120 <Class StringBuilder>
	//    4   10:dup             
	//    5   11:invokespecial   #121 <Method void StringBuilder()>
	//    6   14:astore_1        
			((StringBuilder) (jobtrigger)).append(prefix);
	//    7   15:aload_1         
	//    8   16:aload_0         
	//    9   17:getfield        #19  <Field String prefix>
	//   10   20:invokevirtual   #125 <Method StringBuilder StringBuilder.append(String)>
	//   11   23:pop             
			((StringBuilder) (jobtrigger)).append("trigger_type");
	//   12   24:aload_1         
	//   13   25:ldc1            #150 <String "trigger_type">
	//   14   27:invokevirtual   #125 <Method StringBuilder StringBuilder.append(String)>
	//   15   30:pop             
			bundle.putInt(((StringBuilder) (jobtrigger)).toString(), 2);
	//   16   31:aload_2         
	//   17   32:aload_1         
	//   18   33:invokevirtual   #128 <Method String StringBuilder.toString()>
	//   19   36:iconst_2        
	//   20   37:invokevirtual   #204 <Method void Bundle.putInt(String, int)>
			return;
	//   21   40:return          
		}
		if(jobtrigger instanceof JobTrigger.ExecutionWindowTrigger)
	//*  22   41:aload_1         
	//*  23   42:instanceof      #214 <Class JobTrigger$ExecutionWindowTrigger>
	//*  24   45:ifeq            159
		{
			jobtrigger = ((JobTrigger) ((JobTrigger.ExecutionWindowTrigger)jobtrigger));
	//   25   48:aload_1         
	//   26   49:checkcast       #214 <Class JobTrigger$ExecutionWindowTrigger>
	//   27   52:astore_1        
			StringBuilder stringbuilder = new StringBuilder();
	//   28   53:new             #120 <Class StringBuilder>
	//   29   56:dup             
	//   30   57:invokespecial   #121 <Method void StringBuilder()>
	//   31   60:astore_3        
			stringbuilder.append(prefix);
	//   32   61:aload_3         
	//   33   62:aload_0         
	//   34   63:getfield        #19  <Field String prefix>
	//   35   66:invokevirtual   #125 <Method StringBuilder StringBuilder.append(String)>
	//   36   69:pop             
			stringbuilder.append("trigger_type");
	//   37   70:aload_3         
	//   38   71:ldc1            #150 <String "trigger_type">
	//   39   73:invokevirtual   #125 <Method StringBuilder StringBuilder.append(String)>
	//   40   76:pop             
			bundle.putInt(stringbuilder.toString(), 1);
	//   41   77:aload_2         
	//   42   78:aload_3         
	//   43   79:invokevirtual   #128 <Method String StringBuilder.toString()>
	//   44   82:iconst_1        
	//   45   83:invokevirtual   #204 <Method void Bundle.putInt(String, int)>
			stringbuilder = new StringBuilder();
	//   46   86:new             #120 <Class StringBuilder>
	//   47   89:dup             
	//   48   90:invokespecial   #121 <Method void StringBuilder()>
	//   49   93:astore_3        
			stringbuilder.append(prefix);
	//   50   94:aload_3         
	//   51   95:aload_0         
	//   52   96:getfield        #19  <Field String prefix>
	//   53   99:invokevirtual   #125 <Method StringBuilder StringBuilder.append(String)>
	//   54  102:pop             
			stringbuilder.append("window_start");
	//   55  103:aload_3         
	//   56  104:ldc1            #189 <String "window_start">
	//   57  106:invokevirtual   #125 <Method StringBuilder StringBuilder.append(String)>
	//   58  109:pop             
			bundle.putInt(stringbuilder.toString(), ((JobTrigger.ExecutionWindowTrigger) (jobtrigger)).getWindowStart());
	//   59  110:aload_2         
	//   60  111:aload_3         
	//   61  112:invokevirtual   #128 <Method String StringBuilder.toString()>
	//   62  115:aload_1         
	//   63  116:invokevirtual   #217 <Method int JobTrigger$ExecutionWindowTrigger.getWindowStart()>
	//   64  119:invokevirtual   #204 <Method void Bundle.putInt(String, int)>
			stringbuilder = new StringBuilder();
	//   65  122:new             #120 <Class StringBuilder>
	//   66  125:dup             
	//   67  126:invokespecial   #121 <Method void StringBuilder()>
	//   68  129:astore_3        
			stringbuilder.append(prefix);
	//   69  130:aload_3         
	//   70  131:aload_0         
	//   71  132:getfield        #19  <Field String prefix>
	//   72  135:invokevirtual   #125 <Method StringBuilder StringBuilder.append(String)>
	//   73  138:pop             
			stringbuilder.append("window_end");
	//   74  139:aload_3         
	//   75  140:ldc1            #191 <String "window_end">
	//   76  142:invokevirtual   #125 <Method StringBuilder StringBuilder.append(String)>
	//   77  145:pop             
			bundle.putInt(stringbuilder.toString(), ((JobTrigger.ExecutionWindowTrigger) (jobtrigger)).getWindowEnd());
	//   78  146:aload_2         
	//   79  147:aload_3         
	//   80  148:invokevirtual   #128 <Method String StringBuilder.toString()>
	//   81  151:aload_1         
	//   82  152:invokevirtual   #220 <Method int JobTrigger$ExecutionWindowTrigger.getWindowEnd()>
	//   83  155:invokevirtual   #204 <Method void Bundle.putInt(String, int)>
			return;
	//   84  158:return          
		}
		if(jobtrigger instanceof JobTrigger.ContentUriTrigger)
	//*  85  159:aload_1         
	//*  86  160:instanceof      #222 <Class JobTrigger$ContentUriTrigger>
	//*  87  163:ifeq            244
		{
			StringBuilder stringbuilder1 = new StringBuilder();
	//   88  166:new             #120 <Class StringBuilder>
	//   89  169:dup             
	//   90  170:invokespecial   #121 <Method void StringBuilder()>
	//   91  173:astore_3        
			stringbuilder1.append(prefix);
	//   92  174:aload_3         
	//   93  175:aload_0         
	//   94  176:getfield        #19  <Field String prefix>
	//   95  179:invokevirtual   #125 <Method StringBuilder StringBuilder.append(String)>
	//   96  182:pop             
			stringbuilder1.append("trigger_type");
	//   97  183:aload_3         
	//   98  184:ldc1            #150 <String "trigger_type">
	//   99  186:invokevirtual   #125 <Method StringBuilder StringBuilder.append(String)>
	//  100  189:pop             
			bundle.putInt(stringbuilder1.toString(), 3);
	//  101  190:aload_2         
	//  102  191:aload_3         
	//  103  192:invokevirtual   #128 <Method String StringBuilder.toString()>
	//  104  195:iconst_3        
	//  105  196:invokevirtual   #204 <Method void Bundle.putInt(String, int)>
			jobtrigger = ((JobTrigger) (convertObservedUrisToJsonString(((JobTrigger.ContentUriTrigger)jobtrigger).getUris())));
	//  106  199:aload_1         
	//  107  200:checkcast       #222 <Class JobTrigger$ContentUriTrigger>
	//  108  203:invokevirtual   #226 <Method List JobTrigger$ContentUriTrigger.getUris()>
	//  109  206:invokestatic    #228 <Method String convertObservedUrisToJsonString(List)>
	//  110  209:astore_1        
			stringbuilder1 = new StringBuilder();
	//  111  210:new             #120 <Class StringBuilder>
	//  112  213:dup             
	//  113  214:invokespecial   #121 <Method void StringBuilder()>
	//  114  217:astore_3        
			stringbuilder1.append(prefix);
	//  115  218:aload_3         
	//  116  219:aload_0         
	//  117  220:getfield        #19  <Field String prefix>
	//  118  223:invokevirtual   #125 <Method StringBuilder StringBuilder.append(String)>
	//  119  226:pop             
			stringbuilder1.append("observed_uris");
	//  120  227:aload_3         
	//  121  228:ldc1            #166 <String "observed_uris">
	//  122  230:invokevirtual   #125 <Method StringBuilder StringBuilder.append(String)>
	//  123  233:pop             
			bundle.putString(stringbuilder1.toString(), ((String) (jobtrigger)));
	//  124  234:aload_2         
	//  125  235:aload_3         
	//  126  236:invokevirtual   #128 <Method String StringBuilder.toString()>
	//  127  239:aload_1         
	//  128  240:invokevirtual   #232 <Method void Bundle.putString(String, String)>
			return;
	//  129  243:return          
		} else
		{
			throw new IllegalArgumentException("Unsupported trigger.");
	//  130  244:new             #234 <Class IllegalArgumentException>
	//  131  247:dup             
	//  132  248:ldc1            #160 <String "Unsupported trigger.">
	//  133  250:invokespecial   #235 <Method void IllegalArgumentException(String)>
	//  134  253:athrow          
		}
	}

	public JobInvocation.Builder decode(Bundle bundle)
	{
		if(bundle != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          425
		{
			bundle = new Bundle(bundle);
	//    2    4:new             #130 <Class Bundle>
	//    3    7:dup             
	//    4    8:aload_1         
	//    5    9:invokespecial   #241 <Method void Bundle(Bundle)>
	//    6   12:astore_1        
			StringBuilder stringbuilder = new StringBuilder();
	//    7   13:new             #120 <Class StringBuilder>
	//    8   16:dup             
	//    9   17:invokespecial   #121 <Method void StringBuilder()>
	//   10   20:astore          5
			stringbuilder.append(prefix);
	//   11   22:aload           5
	//   12   24:aload_0         
	//   13   25:getfield        #19  <Field String prefix>
	//   14   28:invokevirtual   #125 <Method StringBuilder StringBuilder.append(String)>
	//   15   31:pop             
			stringbuilder.append("recurring");
	//   16   32:aload           5
	//   17   34:ldc1            #243 <String "recurring">
	//   18   36:invokevirtual   #125 <Method StringBuilder StringBuilder.append(String)>
	//   19   39:pop             
			boolean flag = bundle.getBoolean(stringbuilder.toString());
	//   20   40:aload_1         
	//   21   41:aload           5
	//   22   43:invokevirtual   #128 <Method String StringBuilder.toString()>
	//   23   46:invokevirtual   #247 <Method boolean Bundle.getBoolean(String)>
	//   24   49:istore_3        
			stringbuilder = new StringBuilder();
	//   25   50:new             #120 <Class StringBuilder>
	//   26   53:dup             
	//   27   54:invokespecial   #121 <Method void StringBuilder()>
	//   28   57:astore          5
			stringbuilder.append(prefix);
	//   29   59:aload           5
	//   30   61:aload_0         
	//   31   62:getfield        #19  <Field String prefix>
	//   32   65:invokevirtual   #125 <Method StringBuilder StringBuilder.append(String)>
	//   33   68:pop             
			stringbuilder.append("replace_current");
	//   34   69:aload           5
	//   35   71:ldc1            #249 <String "replace_current">
	//   36   73:invokevirtual   #125 <Method StringBuilder StringBuilder.append(String)>
	//   37   76:pop             
			boolean flag1 = bundle.getBoolean(stringbuilder.toString());
	//   38   77:aload_1         
	//   39   78:aload           5
	//   40   80:invokevirtual   #128 <Method String StringBuilder.toString()>
	//   41   83:invokevirtual   #247 <Method boolean Bundle.getBoolean(String)>
	//   42   86:istore          4
			stringbuilder = new StringBuilder();
	//   43   88:new             #120 <Class StringBuilder>
	//   44   91:dup             
	//   45   92:invokespecial   #121 <Method void StringBuilder()>
	//   46   95:astore          5
			stringbuilder.append(prefix);
	//   47   97:aload           5
	//   48   99:aload_0         
	//   49  100:getfield        #19  <Field String prefix>
	//   50  103:invokevirtual   #125 <Method StringBuilder StringBuilder.append(String)>
	//   51  106:pop             
			stringbuilder.append("persistent");
	//   52  107:aload           5
	//   53  109:ldc1            #251 <String "persistent">
	//   54  111:invokevirtual   #125 <Method StringBuilder StringBuilder.append(String)>
	//   55  114:pop             
			int i = bundle.getInt(stringbuilder.toString());
	//   56  115:aload_1         
	//   57  116:aload           5
	//   58  118:invokevirtual   #128 <Method String StringBuilder.toString()>
	//   59  121:invokevirtual   #133 <Method int Bundle.getInt(String)>
	//   60  124:istore_2        
			stringbuilder = new StringBuilder();
	//   61  125:new             #120 <Class StringBuilder>
	//   62  128:dup             
	//   63  129:invokespecial   #121 <Method void StringBuilder()>
	//   64  132:astore          5
			stringbuilder.append(prefix);
	//   65  134:aload           5
	//   66  136:aload_0         
	//   67  137:getfield        #19  <Field String prefix>
	//   68  140:invokevirtual   #125 <Method StringBuilder StringBuilder.append(String)>
	//   69  143:pop             
			stringbuilder.append("constraints");
	//   70  144:aload           5
	//   71  146:ldc1            #253 <String "constraints">
	//   72  148:invokevirtual   #125 <Method StringBuilder StringBuilder.append(String)>
	//   73  151:pop             
			int ai[] = Constraint.uncompact(bundle.getInt(stringbuilder.toString()));
	//   74  152:aload_1         
	//   75  153:aload           5
	//   76  155:invokevirtual   #128 <Method String StringBuilder.toString()>
	//   77  158:invokevirtual   #133 <Method int Bundle.getInt(String)>
	//   78  161:invokestatic    #259 <Method int[] Constraint.uncompact(int)>
	//   79  164:astore          5
			JobTrigger jobtrigger = decodeTrigger(bundle);
	//   80  166:aload_0         
	//   81  167:aload_1         
	//   82  168:invokespecial   #261 <Method JobTrigger decodeTrigger(Bundle)>
	//   83  171:astore          6
			RetryStrategy retrystrategy = decodeRetryStrategy(bundle);
	//   84  173:aload_0         
	//   85  174:aload_1         
	//   86  175:invokespecial   #263 <Method RetryStrategy decodeRetryStrategy(Bundle)>
	//   87  178:astore          7
			Object obj = ((Object) (new StringBuilder()));
	//   88  180:new             #120 <Class StringBuilder>
	//   89  183:dup             
	//   90  184:invokespecial   #121 <Method void StringBuilder()>
	//   91  187:astore          8
			((StringBuilder) (obj)).append(prefix);
	//   92  189:aload           8
	//   93  191:aload_0         
	//   94  192:getfield        #19  <Field String prefix>
	//   95  195:invokevirtual   #125 <Method StringBuilder StringBuilder.append(String)>
	//   96  198:pop             
			((StringBuilder) (obj)).append("tag");
	//   97  199:aload           8
	//   98  201:ldc2            #265 <String "tag">
	//   99  204:invokevirtual   #125 <Method StringBuilder StringBuilder.append(String)>
	//  100  207:pop             
			obj = ((Object) (bundle.getString(((StringBuilder) (obj)).toString())));
	//  101  208:aload_1         
	//  102  209:aload           8
	//  103  211:invokevirtual   #128 <Method String StringBuilder.toString()>
	//  104  214:invokevirtual   #169 <Method String Bundle.getString(String)>
	//  105  217:astore          8
			StringBuilder stringbuilder1 = new StringBuilder();
	//  106  219:new             #120 <Class StringBuilder>
	//  107  222:dup             
	//  108  223:invokespecial   #121 <Method void StringBuilder()>
	//  109  226:astore          9
			stringbuilder1.append(prefix);
	//  110  228:aload           9
	//  111  230:aload_0         
	//  112  231:getfield        #19  <Field String prefix>
	//  113  234:invokevirtual   #125 <Method StringBuilder StringBuilder.append(String)>
	//  114  237:pop             
			stringbuilder1.append("service");
	//  115  238:aload           9
	//  116  240:ldc2            #267 <String "service">
	//  117  243:invokevirtual   #125 <Method StringBuilder StringBuilder.append(String)>
	//  118  246:pop             
			String s = bundle.getString(stringbuilder1.toString());
	//  119  247:aload_1         
	//  120  248:aload           9
	//  121  250:invokevirtual   #128 <Method String StringBuilder.toString()>
	//  122  253:invokevirtual   #169 <Method String Bundle.getString(String)>
	//  123  256:astore          10
			if(obj != null && s != null && jobtrigger != null && retrystrategy != null)
	//* 124  258:aload           8
	//* 125  260:ifnull          423
	//* 126  263:aload           10
	//* 127  265:ifnull          423
	//* 128  268:aload           6
	//* 129  270:ifnull          423
	//* 130  273:aload           7
	//* 131  275:ifnonnull       281
	//* 132  278:goto            423
			{
				JobInvocation.Builder builder = new JobInvocation.Builder();
	//  133  281:new             #269 <Class JobInvocation$Builder>
	//  134  284:dup             
	//  135  285:invokespecial   #270 <Method void JobInvocation$Builder()>
	//  136  288:astore          9
				builder.setTag(((String) (obj)));
	//  137  290:aload           9
	//  138  292:aload           8
	//  139  294:invokevirtual   #274 <Method JobInvocation$Builder JobInvocation$Builder.setTag(String)>
	//  140  297:pop             
				builder.setService(s);
	//  141  298:aload           9
	//  142  300:aload           10
	//  143  302:invokevirtual   #277 <Method JobInvocation$Builder JobInvocation$Builder.setService(String)>
	//  144  305:pop             
				builder.setTrigger(jobtrigger);
	//  145  306:aload           9
	//  146  308:aload           6
	//  147  310:invokevirtual   #281 <Method JobInvocation$Builder JobInvocation$Builder.setTrigger(JobTrigger)>
	//  148  313:pop             
				builder.setRetryStrategy(retrystrategy);
	//  149  314:aload           9
	//  150  316:aload           7
	//  151  318:invokevirtual   #285 <Method JobInvocation$Builder JobInvocation$Builder.setRetryStrategy(RetryStrategy)>
	//  152  321:pop             
				builder.setRecurring(flag);
	//  153  322:aload           9
	//  154  324:iload_3         
	//  155  325:invokevirtual   #289 <Method JobInvocation$Builder JobInvocation$Builder.setRecurring(boolean)>
	//  156  328:pop             
				builder.setLifetime(i);
	//  157  329:aload           9
	//  158  331:iload_2         
	//  159  332:invokevirtual   #293 <Method JobInvocation$Builder JobInvocation$Builder.setLifetime(int)>
	//  160  335:pop             
				builder.setConstraints(ai);
	//  161  336:aload           9
	//  162  338:aload           5
	//  163  340:invokevirtual   #297 <Method JobInvocation$Builder JobInvocation$Builder.setConstraints(int[])>
	//  164  343:pop             
				builder.setReplaceCurrent(flag1);
	//  165  344:aload           9
	//  166  346:iload           4
	//  167  348:invokevirtual   #300 <Method JobInvocation$Builder JobInvocation$Builder.setReplaceCurrent(boolean)>
	//  168  351:pop             
				if(!TextUtils.isEmpty(((CharSequence) (prefix))))
	//* 169  352:aload_0         
	//* 170  353:getfield        #19  <Field String prefix>
	//* 171  356:invokestatic    #306 <Method boolean TextUtils.isEmpty(CharSequence)>
	//* 172  359:ifne            413
				{
					Iterator iterator = bundle.keySet().iterator();
	//  173  362:aload_1         
	//  174  363:invokevirtual   #310 <Method Set Bundle.keySet()>
	//  175  366:invokeinterface #313 <Method Iterator Set.iterator()>
	//  176  371:astore          5
					do
					{
						if(!iterator.hasNext())
							break;
	//  177  373:aload           5
	//  178  375:invokeinterface #90  <Method boolean Iterator.hasNext()>
	//  179  380:ifeq            413
						if(((String)iterator.next()).startsWith(prefix))
	//* 180  383:aload           5
	//* 181  385:invokeinterface #94  <Method Object Iterator.next()>
	//* 182  390:checkcast       #315 <Class String>
	//* 183  393:aload_0         
	//* 184  394:getfield        #19  <Field String prefix>
	//* 185  397:invokevirtual   #318 <Method boolean String.startsWith(String)>
	//* 186  400:ifeq            373
							iterator.remove();
	//  187  403:aload           5
	//  188  405:invokeinterface #321 <Method void Iterator.remove()>
					} while(true);
	//  189  410:goto            373
				}
				builder.addExtras(bundle);
	//  190  413:aload           9
	//  191  415:aload_1         
	//  192  416:invokevirtual   #324 <Method JobInvocation$Builder JobInvocation$Builder.addExtras(Bundle)>
	//  193  419:pop             
				return builder;
	//  194  420:aload           9
	//  195  422:areturn         
			} else
			{
				return null;
	//  196  423:aconst_null     
	//  197  424:areturn         
			}
		} else
		{
			throw new IllegalArgumentException("Unexpected null Bundle provided");
	//  198  425:new             #234 <Class IllegalArgumentException>
	//  199  428:dup             
	//  200  429:ldc2            #326 <String "Unexpected null Bundle provided">
	//  201  432:invokespecial   #235 <Method void IllegalArgumentException(String)>
	//  202  435:athrow          
		}
	}

	JobInvocation decodeIntentBundle(Bundle bundle)
	{
		if(bundle == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       15
		{
			Log.e("FJD.ExternalReceiver", "Unexpected null Bundle provided");
	//    2    4:ldc1            #152 <String "FJD.ExternalReceiver">
	//    3    6:ldc2            #326 <String "Unexpected null Bundle provided">
	//    4    9:invokestatic    #331 <Method int Log.e(String, String)>
	//    5   12:pop             
			return null;
	//    6   13:aconst_null     
	//    7   14:areturn         
		}
		Object obj = ((Object) (bundle.getBundle("extras")));
	//    8   15:aload_1         
	//    9   16:ldc2            #333 <String "extras">
	//   10   19:invokevirtual   #337 <Method Bundle Bundle.getBundle(String)>
	//   11   22:astore_2        
		if(obj == null)
	//*  12   23:aload_2         
	//*  13   24:ifnonnull       29
			return null;
	//   14   27:aconst_null     
	//   15   28:areturn         
		obj = ((Object) (decode(((Bundle) (obj)))));
	//   16   29:aload_0         
	//   17   30:aload_2         
	//   18   31:invokevirtual   #339 <Method JobInvocation$Builder decode(Bundle)>
	//   19   34:astore_2        
		bundle = ((Bundle) (bundle.getParcelableArrayList("triggered_uris")));
	//   20   35:aload_1         
	//   21   36:ldc2            #341 <String "triggered_uris">
	//   22   39:invokevirtual   #345 <Method ArrayList Bundle.getParcelableArrayList(String)>
	//   23   42:astore_1        
		if(bundle != null)
	//*  24   43:aload_1         
	//*  25   44:ifnull          60
			((JobInvocation.Builder) (obj)).setTriggerReason(new TriggerReason(((List) (bundle))));
	//   26   47:aload_2         
	//   27   48:new             #347 <Class TriggerReason>
	//   28   51:dup             
	//   29   52:aload_1         
	//   30   53:invokespecial   #350 <Method void TriggerReason(List)>
	//   31   56:invokevirtual   #354 <Method JobInvocation$Builder JobInvocation$Builder.setTriggerReason(TriggerReason)>
	//   32   59:pop             
		return ((JobInvocation.Builder) (obj)).build();
	//   33   60:aload_2         
	//   34   61:invokevirtual   #358 <Method JobInvocation JobInvocation$Builder.build()>
	//   35   64:areturn         
	}

	Bundle encode(JobParameters jobparameters, Bundle bundle)
	{
		if(bundle != null)
	//*   0    0:aload_2         
	//*   1    1:ifnull          277
		{
			Object obj = ((Object) (jobparameters.getExtras()));
	//    2    4:aload_1         
	//    3    5:invokeinterface #366 <Method Bundle JobParameters.getExtras()>
	//    4   10:astore_3        
			if(obj != null)
	//*   5   11:aload_3         
	//*   6   12:ifnull          20
				bundle.putAll(((Bundle) (obj)));
	//    7   15:aload_2         
	//    8   16:aload_3         
	//    9   17:invokevirtual   #369 <Method void Bundle.putAll(Bundle)>
			obj = ((Object) (new StringBuilder()));
	//   10   20:new             #120 <Class StringBuilder>
	//   11   23:dup             
	//   12   24:invokespecial   #121 <Method void StringBuilder()>
	//   13   27:astore_3        
			((StringBuilder) (obj)).append(prefix);
	//   14   28:aload_3         
	//   15   29:aload_0         
	//   16   30:getfield        #19  <Field String prefix>
	//   17   33:invokevirtual   #125 <Method StringBuilder StringBuilder.append(String)>
	//   18   36:pop             
			((StringBuilder) (obj)).append("persistent");
	//   19   37:aload_3         
	//   20   38:ldc1            #251 <String "persistent">
	//   21   40:invokevirtual   #125 <Method StringBuilder StringBuilder.append(String)>
	//   22   43:pop             
			bundle.putInt(((StringBuilder) (obj)).toString(), jobparameters.getLifetime());
	//   23   44:aload_2         
	//   24   45:aload_3         
	//   25   46:invokevirtual   #128 <Method String StringBuilder.toString()>
	//   26   49:aload_1         
	//   27   50:invokeinterface #372 <Method int JobParameters.getLifetime()>
	//   28   55:invokevirtual   #204 <Method void Bundle.putInt(String, int)>
			obj = ((Object) (new StringBuilder()));
	//   29   58:new             #120 <Class StringBuilder>
	//   30   61:dup             
	//   31   62:invokespecial   #121 <Method void StringBuilder()>
	//   32   65:astore_3        
			((StringBuilder) (obj)).append(prefix);
	//   33   66:aload_3         
	//   34   67:aload_0         
	//   35   68:getfield        #19  <Field String prefix>
	//   36   71:invokevirtual   #125 <Method StringBuilder StringBuilder.append(String)>
	//   37   74:pop             
			((StringBuilder) (obj)).append("recurring");
	//   38   75:aload_3         
	//   39   76:ldc1            #243 <String "recurring">
	//   40   78:invokevirtual   #125 <Method StringBuilder StringBuilder.append(String)>
	//   41   81:pop             
			bundle.putBoolean(((StringBuilder) (obj)).toString(), jobparameters.isRecurring());
	//   42   82:aload_2         
	//   43   83:aload_3         
	//   44   84:invokevirtual   #128 <Method String StringBuilder.toString()>
	//   45   87:aload_1         
	//   46   88:invokeinterface #375 <Method boolean JobParameters.isRecurring()>
	//   47   93:invokevirtual   #379 <Method void Bundle.putBoolean(String, boolean)>
			obj = ((Object) (new StringBuilder()));
	//   48   96:new             #120 <Class StringBuilder>
	//   49   99:dup             
	//   50  100:invokespecial   #121 <Method void StringBuilder()>
	//   51  103:astore_3        
			((StringBuilder) (obj)).append(prefix);
	//   52  104:aload_3         
	//   53  105:aload_0         
	//   54  106:getfield        #19  <Field String prefix>
	//   55  109:invokevirtual   #125 <Method StringBuilder StringBuilder.append(String)>
	//   56  112:pop             
			((StringBuilder) (obj)).append("replace_current");
	//   57  113:aload_3         
	//   58  114:ldc1            #249 <String "replace_current">
	//   59  116:invokevirtual   #125 <Method StringBuilder StringBuilder.append(String)>
	//   60  119:pop             
			bundle.putBoolean(((StringBuilder) (obj)).toString(), jobparameters.shouldReplaceCurrent());
	//   61  120:aload_2         
	//   62  121:aload_3         
	//   63  122:invokevirtual   #128 <Method String StringBuilder.toString()>
	//   64  125:aload_1         
	//   65  126:invokeinterface #382 <Method boolean JobParameters.shouldReplaceCurrent()>
	//   66  131:invokevirtual   #379 <Method void Bundle.putBoolean(String, boolean)>
			obj = ((Object) (new StringBuilder()));
	//   67  134:new             #120 <Class StringBuilder>
	//   68  137:dup             
	//   69  138:invokespecial   #121 <Method void StringBuilder()>
	//   70  141:astore_3        
			((StringBuilder) (obj)).append(prefix);
	//   71  142:aload_3         
	//   72  143:aload_0         
	//   73  144:getfield        #19  <Field String prefix>
	//   74  147:invokevirtual   #125 <Method StringBuilder StringBuilder.append(String)>
	//   75  150:pop             
			((StringBuilder) (obj)).append("tag");
	//   76  151:aload_3         
	//   77  152:ldc2            #265 <String "tag">
	//   78  155:invokevirtual   #125 <Method StringBuilder StringBuilder.append(String)>
	//   79  158:pop             
			bundle.putString(((StringBuilder) (obj)).toString(), jobparameters.getTag());
	//   80  159:aload_2         
	//   81  160:aload_3         
	//   82  161:invokevirtual   #128 <Method String StringBuilder.toString()>
	//   83  164:aload_1         
	//   84  165:invokeinterface #385 <Method String JobParameters.getTag()>
	//   85  170:invokevirtual   #232 <Method void Bundle.putString(String, String)>
			obj = ((Object) (new StringBuilder()));
	//   86  173:new             #120 <Class StringBuilder>
	//   87  176:dup             
	//   88  177:invokespecial   #121 <Method void StringBuilder()>
	//   89  180:astore_3        
			((StringBuilder) (obj)).append(prefix);
	//   90  181:aload_3         
	//   91  182:aload_0         
	//   92  183:getfield        #19  <Field String prefix>
	//   93  186:invokevirtual   #125 <Method StringBuilder StringBuilder.append(String)>
	//   94  189:pop             
			((StringBuilder) (obj)).append("service");
	//   95  190:aload_3         
	//   96  191:ldc2            #267 <String "service">
	//   97  194:invokevirtual   #125 <Method StringBuilder StringBuilder.append(String)>
	//   98  197:pop             
			bundle.putString(((StringBuilder) (obj)).toString(), jobparameters.getService());
	//   99  198:aload_2         
	//  100  199:aload_3         
	//  101  200:invokevirtual   #128 <Method String StringBuilder.toString()>
	//  102  203:aload_1         
	//  103  204:invokeinterface #388 <Method String JobParameters.getService()>
	//  104  209:invokevirtual   #232 <Method void Bundle.putString(String, String)>
			obj = ((Object) (new StringBuilder()));
	//  105  212:new             #120 <Class StringBuilder>
	//  106  215:dup             
	//  107  216:invokespecial   #121 <Method void StringBuilder()>
	//  108  219:astore_3        
			((StringBuilder) (obj)).append(prefix);
	//  109  220:aload_3         
	//  110  221:aload_0         
	//  111  222:getfield        #19  <Field String prefix>
	//  112  225:invokevirtual   #125 <Method StringBuilder StringBuilder.append(String)>
	//  113  228:pop             
			((StringBuilder) (obj)).append("constraints");
	//  114  229:aload_3         
	//  115  230:ldc1            #253 <String "constraints">
	//  116  232:invokevirtual   #125 <Method StringBuilder StringBuilder.append(String)>
	//  117  235:pop             
			bundle.putInt(((StringBuilder) (obj)).toString(), Constraint.compact(jobparameters.getConstraints()));
	//  118  236:aload_2         
	//  119  237:aload_3         
	//  120  238:invokevirtual   #128 <Method String StringBuilder.toString()>
	//  121  241:aload_1         
	//  122  242:invokeinterface #392 <Method int[] JobParameters.getConstraints()>
	//  123  247:invokestatic    #396 <Method int Constraint.compact(int[])>
	//  124  250:invokevirtual   #204 <Method void Bundle.putInt(String, int)>
			encodeTrigger(jobparameters.getTrigger(), bundle);
	//  125  253:aload_0         
	//  126  254:aload_1         
	//  127  255:invokeinterface #400 <Method JobTrigger JobParameters.getTrigger()>
	//  128  260:aload_2         
	//  129  261:invokespecial   #402 <Method void encodeTrigger(JobTrigger, Bundle)>
			encodeRetryStrategy(jobparameters.getRetryStrategy(), bundle);
	//  130  264:aload_0         
	//  131  265:aload_1         
	//  132  266:invokeinterface #406 <Method RetryStrategy JobParameters.getRetryStrategy()>
	//  133  271:aload_2         
	//  134  272:invokespecial   #408 <Method void encodeRetryStrategy(RetryStrategy, Bundle)>
			return bundle;
	//  135  275:aload_2         
	//  136  276:areturn         
		} else
		{
			throw new IllegalArgumentException("Unexpected null Bundle provided");
	//  137  277:new             #234 <Class IllegalArgumentException>
	//  138  280:dup             
	//  139  281:ldc2            #326 <String "Unexpected null Bundle provided">
	//  140  284:invokespecial   #235 <Method void IllegalArgumentException(String)>
	//  141  287:athrow          
		}
	}

	private static final String JSON_URIS = "uris";
	private static final String JSON_URI_FLAGS = "uri_flags";
	private final String prefix;
}

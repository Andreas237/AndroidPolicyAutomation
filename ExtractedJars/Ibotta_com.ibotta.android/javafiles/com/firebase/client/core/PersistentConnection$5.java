// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.firebase.client.core;

import com.firebase.client.FirebaseError;
import com.firebase.client.utilities.LogWrapper;
import java.util.Map;

// Referenced classes of package com.firebase.client.core:
//			PersistentConnection

class PersistentConnection$5
	implements sponseListener
{

	public void onResponse(Map map)
	{
		if(PersistentConnection.access$1100(PersistentConnection.this).logsDebug())
	//*   0    0:aload_0         
	//*   1    1:getfield        #25  <Field PersistentConnection this$0>
	//*   2    4:invokestatic    #43  <Method LogWrapper PersistentConnection.access$1100(PersistentConnection)>
	//*   3    7:invokevirtual   #49  <Method boolean LogWrapper.logsDebug()>
	//*   4   10:ifeq            59
		{
			LogWrapper logwrapper = PersistentConnection.access$1100(PersistentConnection.this);
	//    5   13:aload_0         
	//    6   14:getfield        #25  <Field PersistentConnection this$0>
	//    7   17:invokestatic    #43  <Method LogWrapper PersistentConnection.access$1100(PersistentConnection)>
	//    8   20:astore_2        
			StringBuilder stringbuilder1 = new StringBuilder();
	//    9   21:new             #51  <Class StringBuilder>
	//   10   24:dup             
	//   11   25:invokespecial   #52  <Method void StringBuilder()>
	//   12   28:astore_3        
			stringbuilder1.append(val$action);
	//   13   29:aload_3         
	//   14   30:aload_0         
	//   15   31:getfield        #27  <Field String val$action>
	//   16   34:invokevirtual   #56  <Method StringBuilder StringBuilder.append(String)>
	//   17   37:pop             
			stringbuilder1.append(" response: ");
	//   18   38:aload_3         
	//   19   39:ldc1            #58  <String " response: ">
	//   20   41:invokevirtual   #56  <Method StringBuilder StringBuilder.append(String)>
	//   21   44:pop             
			stringbuilder1.append(((Object) (map)));
	//   22   45:aload_3         
	//   23   46:aload_1         
	//   24   47:invokevirtual   #61  <Method StringBuilder StringBuilder.append(Object)>
	//   25   50:pop             
			logwrapper.debug(stringbuilder1.toString());
	//   26   51:aload_2         
	//   27   52:aload_3         
	//   28   53:invokevirtual   #65  <Method String StringBuilder.toString()>
	//   29   56:invokevirtual   #69  <Method void LogWrapper.debug(String)>
		}
		if((tstandingPut)PersistentConnection.access$1200(PersistentConnection.this).get(((Object) (Long.valueOf(val$putId)))) == val$put)
	//*  30   59:aload_0         
	//*  31   60:getfield        #25  <Field PersistentConnection this$0>
	//*  32   63:invokestatic    #73  <Method Map PersistentConnection.access$1200(PersistentConnection)>
	//*  33   66:aload_0         
	//*  34   67:getfield        #29  <Field long val$putId>
	//*  35   70:invokestatic    #79  <Method Long Long.valueOf(long)>
	//*  36   73:invokeinterface #85  <Method Object Map.get(Object)>
	//*  37   78:checkcast       #87  <Class PersistentConnection$OutstandingPut>
	//*  38   81:aload_0         
	//*  39   82:getfield        #31  <Field PersistentConnection$OutstandingPut val$put>
	//*  40   85:if_acmpne       174
		{
			PersistentConnection.access$1200(PersistentConnection.this).remove(((Object) (Long.valueOf(val$putId))));
	//   41   88:aload_0         
	//   42   89:getfield        #25  <Field PersistentConnection this$0>
	//   43   92:invokestatic    #73  <Method Map PersistentConnection.access$1200(PersistentConnection)>
	//   44   95:aload_0         
	//   45   96:getfield        #29  <Field long val$putId>
	//   46   99:invokestatic    #79  <Method Long Long.valueOf(long)>
	//   47  102:invokeinterface #90  <Method Object Map.remove(Object)>
	//   48  107:pop             
			if(val$onComplete != null)
	//*  49  108:aload_0         
	//*  50  109:getfield        #33  <Field com.firebase.client.Firebase$CompletionListener val$onComplete>
	//*  51  112:ifnull          234
			{
				String s = (String)map.get("s");
	//   52  115:aload_1         
	//   53  116:ldc1            #92  <String "s">
	//   54  118:invokeinterface #85  <Method Object Map.get(Object)>
	//   55  123:checkcast       #94  <Class String>
	//   56  126:astore_2        
				if(s.equals("ok"))
	//*  57  127:aload_2         
	//*  58  128:ldc1            #96  <String "ok">
	//*  59  130:invokevirtual   #100 <Method boolean String.equals(Object)>
	//*  60  133:ifeq            148
				{
					val$onComplete.onComplete(((FirebaseError) (null)), ((com.firebase.client.Firebase) (null)));
	//   61  136:aload_0         
	//   62  137:getfield        #33  <Field com.firebase.client.Firebase$CompletionListener val$onComplete>
	//   63  140:aconst_null     
	//   64  141:aconst_null     
	//   65  142:invokeinterface #106 <Method void com.firebase.client.Firebase$CompletionListener.onComplete(FirebaseError, com.firebase.client.Firebase)>
					return;
	//   66  147:return          
				} else
				{
					val$onComplete.onComplete(FirebaseError.fromStatus(s, (String)map.get("d")), ((com.firebase.client.Firebase) (null)));
	//   67  148:aload_0         
	//   68  149:getfield        #33  <Field com.firebase.client.Firebase$CompletionListener val$onComplete>
	//   69  152:aload_2         
	//   70  153:aload_1         
	//   71  154:ldc1            #108 <String "d">
	//   72  156:invokeinterface #85  <Method Object Map.get(Object)>
	//   73  161:checkcast       #94  <Class String>
	//   74  164:invokestatic    #114 <Method FirebaseError FirebaseError.fromStatus(String, String)>
	//   75  167:aconst_null     
	//   76  168:invokeinterface #106 <Method void com.firebase.client.Firebase$CompletionListener.onComplete(FirebaseError, com.firebase.client.Firebase)>
					return;
	//   77  173:return          
				}
			}
		} else
		if(PersistentConnection.access$1100(PersistentConnection.this).logsDebug())
	//*  78  174:aload_0         
	//*  79  175:getfield        #25  <Field PersistentConnection this$0>
	//*  80  178:invokestatic    #43  <Method LogWrapper PersistentConnection.access$1100(PersistentConnection)>
	//*  81  181:invokevirtual   #49  <Method boolean LogWrapper.logsDebug()>
	//*  82  184:ifeq            234
		{
			map = ((Map) (PersistentConnection.access$1100(PersistentConnection.this)));
	//   83  187:aload_0         
	//   84  188:getfield        #25  <Field PersistentConnection this$0>
	//   85  191:invokestatic    #43  <Method LogWrapper PersistentConnection.access$1100(PersistentConnection)>
	//   86  194:astore_1        
			StringBuilder stringbuilder = new StringBuilder();
	//   87  195:new             #51  <Class StringBuilder>
	//   88  198:dup             
	//   89  199:invokespecial   #52  <Method void StringBuilder()>
	//   90  202:astore_2        
			stringbuilder.append("Ignoring on complete for put ");
	//   91  203:aload_2         
	//   92  204:ldc1            #116 <String "Ignoring on complete for put ">
	//   93  206:invokevirtual   #56  <Method StringBuilder StringBuilder.append(String)>
	//   94  209:pop             
			stringbuilder.append(val$putId);
	//   95  210:aload_2         
	//   96  211:aload_0         
	//   97  212:getfield        #29  <Field long val$putId>
	//   98  215:invokevirtual   #119 <Method StringBuilder StringBuilder.append(long)>
	//   99  218:pop             
			stringbuilder.append(" because it was removed already.");
	//  100  219:aload_2         
	//  101  220:ldc1            #121 <String " because it was removed already.">
	//  102  222:invokevirtual   #56  <Method StringBuilder StringBuilder.append(String)>
	//  103  225:pop             
			((LogWrapper) (map)).debug(stringbuilder.toString());
	//  104  226:aload_1         
	//  105  227:aload_2         
	//  106  228:invokevirtual   #65  <Method String StringBuilder.toString()>
	//  107  231:invokevirtual   #69  <Method void LogWrapper.debug(String)>
		}
	//  108  234:return          
	}

	final PersistentConnection this$0;
	final String val$action;
	final com.firebase.client.ener val$onComplete;
	final tstandingPut val$put;
	final long val$putId;

	PersistentConnection$5()
	{
		this$0 = final_persistentconnection;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #25  <Field PersistentConnection this$0>
		val$action = s;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #27  <Field String val$action>
		val$putId = l;
	//    6   10:aload_0         
	//    7   11:lload_3         
	//    8   12:putfield        #29  <Field long val$putId>
		val$put = tstandingput;
	//    9   15:aload_0         
	//   10   16:aload           5
	//   11   18:putfield        #31  <Field PersistentConnection$OutstandingPut val$put>
		val$onComplete = com.firebase.client.ener.this;
	//   12   21:aload_0         
	//   13   22:aload           6
	//   14   24:putfield        #33  <Field com.firebase.client.Firebase$CompletionListener val$onComplete>
		super();
	//   15   27:aload_0         
	//   16   28:invokespecial   #36  <Method void Object()>
	//   17   31:return          
	}
}

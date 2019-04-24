// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.birbit.android.jobqueue.messaging;

import com.birbit.android.jobqueue.messaging.message.AddJobMessage;
import com.birbit.android.jobqueue.messaging.message.CallbackMessage;
import com.birbit.android.jobqueue.messaging.message.CancelMessage;
import com.birbit.android.jobqueue.messaging.message.CancelResultMessage;
import com.birbit.android.jobqueue.messaging.message.CommandMessage;
import com.birbit.android.jobqueue.messaging.message.ConstraintChangeMessage;
import com.birbit.android.jobqueue.messaging.message.JobConsumerIdleMessage;
import com.birbit.android.jobqueue.messaging.message.PublicQueryMessage;
import com.birbit.android.jobqueue.messaging.message.RunJobMessage;
import com.birbit.android.jobqueue.messaging.message.RunJobResultMessage;
import com.birbit.android.jobqueue.messaging.message.SchedulerMessage;
import java.util.HashMap;
import java.util.Map;

public final class Type extends Enum
{

	private Type(String s, int i, Class class1, int j)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #117 <Method void Enum(String, int)>
		klass = class1;
	//    4    6:aload_0         
	//    5    7:aload_3         
	//    6    8:putfield        #103 <Field Class klass>
		priority = j;
	//    7   11:aload_0         
	//    8   12:iload           4
	//    9   14:putfield        #111 <Field int priority>
	//   10   17:return          
	}

	public static Type valueOf(String s)
	{
		return (Type)Enum.valueOf(com/birbit/android/jobqueue/messaging/Type, s);
	//    0    0:ldc1            #2   <Class Type>
	//    1    2:aload_0         
	//    2    3:invokestatic    #124 <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class Type>
	//    4    9:areturn         
	}

	public static Type[] values()
	{
		return (Type[])((Type []) ($VALUES)).clone();
	//    0    0:getstatic       #91  <Field Type[] $VALUES>
	//    1    3:invokevirtual   #129 <Method Object _5B_Lcom.birbit.android.jobqueue.messaging.Type_3B_.clone()>
	//    2    6:checkcast       #125 <Class Type[]>
	//    3    9:areturn         
	}

	private static final Type $VALUES[];
	public static final Type ADD_JOB;
	public static final Type CALLBACK;
	public static final Type CANCEL;
	public static final Type CANCEL_RESULT_CALLBACK;
	public static final Type COMMAND;
	public static final Type CONSTRAINT_CHANGE;
	public static final Type JOB_CONSUMER_IDLE;
	static final int MAX_PRIORITY;
	public static final Type PUBLIC_QUERY;
	public static final Type RUN_JOB;
	public static final Type RUN_JOB_RESULT;
	public static final Type SCHEDULER;
	static final Map mapping;
	final Class klass;
	final int priority;

	static 
	{
		int i = 0;
	//    0    0:iconst_0        
	//    1    1:istore_0        
		CALLBACK = new Type("CALLBACK", 0, com/birbit/android/jobqueue/messaging/message/CallbackMessage, 0);
	//    2    2:new             #2   <Class Type>
	//    3    5:dup             
	//    4    6:ldc1            #31  <String "CALLBACK">
	//    5    8:iconst_0        
	//    6    9:ldc1            #33  <Class CallbackMessage>
	//    7   11:iconst_0        
	//    8   12:invokespecial   #37  <Method void Type(String, int, Class, int)>
	//    9   15:putstatic       #39  <Field Type CALLBACK>
		CANCEL_RESULT_CALLBACK = new Type("CANCEL_RESULT_CALLBACK", 1, com/birbit/android/jobqueue/messaging/message/CancelResultMessage, 0);
	//   10   18:new             #2   <Class Type>
	//   11   21:dup             
	//   12   22:ldc1            #40  <String "CANCEL_RESULT_CALLBACK">
	//   13   24:iconst_1        
	//   14   25:ldc1            #42  <Class CancelResultMessage>
	//   15   27:iconst_0        
	//   16   28:invokespecial   #37  <Method void Type(String, int, Class, int)>
	//   17   31:putstatic       #44  <Field Type CANCEL_RESULT_CALLBACK>
		RUN_JOB = new Type("RUN_JOB", 2, com/birbit/android/jobqueue/messaging/message/RunJobMessage, 0);
	//   18   34:new             #2   <Class Type>
	//   19   37:dup             
	//   20   38:ldc1            #45  <String "RUN_JOB">
	//   21   40:iconst_2        
	//   22   41:ldc1            #47  <Class RunJobMessage>
	//   23   43:iconst_0        
	//   24   44:invokespecial   #37  <Method void Type(String, int, Class, int)>
	//   25   47:putstatic       #49  <Field Type RUN_JOB>
		COMMAND = new Type("COMMAND", 3, com/birbit/android/jobqueue/messaging/message/CommandMessage, 0);
	//   26   50:new             #2   <Class Type>
	//   27   53:dup             
	//   28   54:ldc1            #50  <String "COMMAND">
	//   29   56:iconst_3        
	//   30   57:ldc1            #52  <Class CommandMessage>
	//   31   59:iconst_0        
	//   32   60:invokespecial   #37  <Method void Type(String, int, Class, int)>
	//   33   63:putstatic       #54  <Field Type COMMAND>
		PUBLIC_QUERY = new Type("PUBLIC_QUERY", 4, com/birbit/android/jobqueue/messaging/message/PublicQueryMessage, 0);
	//   34   66:new             #2   <Class Type>
	//   35   69:dup             
	//   36   70:ldc1            #55  <String "PUBLIC_QUERY">
	//   37   72:iconst_4        
	//   38   73:ldc1            #57  <Class PublicQueryMessage>
	//   39   75:iconst_0        
	//   40   76:invokespecial   #37  <Method void Type(String, int, Class, int)>
	//   41   79:putstatic       #59  <Field Type PUBLIC_QUERY>
		JOB_CONSUMER_IDLE = new Type("JOB_CONSUMER_IDLE", 5, com/birbit/android/jobqueue/messaging/message/JobConsumerIdleMessage, 0);
	//   42   82:new             #2   <Class Type>
	//   43   85:dup             
	//   44   86:ldc1            #60  <String "JOB_CONSUMER_IDLE">
	//   45   88:iconst_5        
	//   46   89:ldc1            #62  <Class JobConsumerIdleMessage>
	//   47   91:iconst_0        
	//   48   92:invokespecial   #37  <Method void Type(String, int, Class, int)>
	//   49   95:putstatic       #64  <Field Type JOB_CONSUMER_IDLE>
		ADD_JOB = new Type("ADD_JOB", 6, com/birbit/android/jobqueue/messaging/message/AddJobMessage, 1);
	//   50   98:new             #2   <Class Type>
	//   51  101:dup             
	//   52  102:ldc1            #65  <String "ADD_JOB">
	//   53  104:bipush          6
	//   54  106:ldc1            #67  <Class AddJobMessage>
	//   55  108:iconst_1        
	//   56  109:invokespecial   #37  <Method void Type(String, int, Class, int)>
	//   57  112:putstatic       #69  <Field Type ADD_JOB>
		CANCEL = new Type("CANCEL", 7, com/birbit/android/jobqueue/messaging/message/CancelMessage, 1);
	//   58  115:new             #2   <Class Type>
	//   59  118:dup             
	//   60  119:ldc1            #70  <String "CANCEL">
	//   61  121:bipush          7
	//   62  123:ldc1            #72  <Class CancelMessage>
	//   63  125:iconst_1        
	//   64  126:invokespecial   #37  <Method void Type(String, int, Class, int)>
	//   65  129:putstatic       #74  <Field Type CANCEL>
		CONSTRAINT_CHANGE = new Type("CONSTRAINT_CHANGE", 8, com/birbit/android/jobqueue/messaging/message/ConstraintChangeMessage, 2);
	//   66  132:new             #2   <Class Type>
	//   67  135:dup             
	//   68  136:ldc1            #75  <String "CONSTRAINT_CHANGE">
	//   69  138:bipush          8
	//   70  140:ldc1            #77  <Class ConstraintChangeMessage>
	//   71  142:iconst_2        
	//   72  143:invokespecial   #37  <Method void Type(String, int, Class, int)>
	//   73  146:putstatic       #79  <Field Type CONSTRAINT_CHANGE>
		RUN_JOB_RESULT = new Type("RUN_JOB_RESULT", 9, com/birbit/android/jobqueue/messaging/message/RunJobResultMessage, 3);
	//   74  149:new             #2   <Class Type>
	//   75  152:dup             
	//   76  153:ldc1            #80  <String "RUN_JOB_RESULT">
	//   77  155:bipush          9
	//   78  157:ldc1            #82  <Class RunJobResultMessage>
	//   79  159:iconst_3        
	//   80  160:invokespecial   #37  <Method void Type(String, int, Class, int)>
	//   81  163:putstatic       #84  <Field Type RUN_JOB_RESULT>
		SCHEDULER = new Type("SCHEDULER", 10, com/birbit/android/jobqueue/messaging/message/SchedulerMessage, 4);
	//   82  166:new             #2   <Class Type>
	//   83  169:dup             
	//   84  170:ldc1            #85  <String "SCHEDULER">
	//   85  172:bipush          10
	//   86  174:ldc1            #87  <Class SchedulerMessage>
	//   87  176:iconst_4        
	//   88  177:invokespecial   #37  <Method void Type(String, int, Class, int)>
	//   89  180:putstatic       #89  <Field Type SCHEDULER>
		$VALUES = (new Type[] {
			CALLBACK, CANCEL_RESULT_CALLBACK, RUN_JOB, COMMAND, PUBLIC_QUERY, JOB_CONSUMER_IDLE, ADD_JOB, CANCEL, CONSTRAINT_CHANGE, RUN_JOB_RESULT, 
			SCHEDULER
		});
	//   90  183:bipush          11
	//   91  185:anewarray       Type[]
	//   92  188:dup             
	//   93  189:iconst_0        
	//   94  190:getstatic       #39  <Field Type CALLBACK>
	//   95  193:aastore         
	//   96  194:dup             
	//   97  195:iconst_1        
	//   98  196:getstatic       #44  <Field Type CANCEL_RESULT_CALLBACK>
	//   99  199:aastore         
	//  100  200:dup             
	//  101  201:iconst_2        
	//  102  202:getstatic       #49  <Field Type RUN_JOB>
	//  103  205:aastore         
	//  104  206:dup             
	//  105  207:iconst_3        
	//  106  208:getstatic       #54  <Field Type COMMAND>
	//  107  211:aastore         
	//  108  212:dup             
	//  109  213:iconst_4        
	//  110  214:getstatic       #59  <Field Type PUBLIC_QUERY>
	//  111  217:aastore         
	//  112  218:dup             
	//  113  219:iconst_5        
	//  114  220:getstatic       #64  <Field Type JOB_CONSUMER_IDLE>
	//  115  223:aastore         
	//  116  224:dup             
	//  117  225:bipush          6
	//  118  227:getstatic       #69  <Field Type ADD_JOB>
	//  119  230:aastore         
	//  120  231:dup             
	//  121  232:bipush          7
	//  122  234:getstatic       #74  <Field Type CANCEL>
	//  123  237:aastore         
	//  124  238:dup             
	//  125  239:bipush          8
	//  126  241:getstatic       #79  <Field Type CONSTRAINT_CHANGE>
	//  127  244:aastore         
	//  128  245:dup             
	//  129  246:bipush          9
	//  130  248:getstatic       #84  <Field Type RUN_JOB_RESULT>
	//  131  251:aastore         
	//  132  252:dup             
	//  133  253:bipush          10
	//  134  255:getstatic       #89  <Field Type SCHEDULER>
	//  135  258:aastore         
	//  136  259:putstatic       #91  <Field Type[] $VALUES>
		int j = 0;
	//  137  262:iconst_0        
	//  138  263:istore_1        
		mapping = ((Map) (new HashMap()));
	//  139  264:new             #93  <Class HashMap>
	//  140  267:dup             
	//  141  268:invokespecial   #95  <Method void HashMap()>
	//  142  271:putstatic       #97  <Field Map mapping>
		Type atype[] = values();
	//  143  274:invokestatic    #101 <Method Type[] values()>
	//  144  277:astore          4
		for(int l = atype.length; i < l;)
	//* 145  279:aload           4
	//* 146  281:arraylength     
	//* 147  282:istore_3        
	//* 148  283:iload_0         
	//* 149  284:iload_3         
	//* 150  285:icmpge          336
		{
			Type type = atype[i];
	//  151  288:aload           4
	//  152  290:iload_0         
	//  153  291:aaload          
	//  154  292:astore          5
			mapping.put(((Object) (type.klass)), ((Object) (type)));
	//  155  294:getstatic       #97  <Field Map mapping>
	//  156  297:aload           5
	//  157  299:getfield        #103 <Field Class klass>
	//  158  302:aload           5
	//  159  304:invokeinterface #109 <Method Object Map.put(Object, Object)>
	//  160  309:pop             
			int k = j;
	//  161  310:iload_1         
	//  162  311:istore_2        
			if(type.priority > j)
	//* 163  312:aload           5
	//* 164  314:getfield        #111 <Field int priority>
	//* 165  317:iload_1         
	//* 166  318:icmple          327
				k = type.priority;
	//  167  321:aload           5
	//  168  323:getfield        #111 <Field int priority>
	//  169  326:istore_2        
			i++;
	//  170  327:iload_0         
	//  171  328:iconst_1        
	//  172  329:iadd            
	//  173  330:istore_0        
			j = k;
	//  174  331:iload_2         
	//  175  332:istore_1        
		}

	//* 176  333:goto            283
		MAX_PRIORITY = j;
	//  177  336:iload_1         
	//  178  337:putstatic       #113 <Field int MAX_PRIORITY>
	//* 179  340:return          
	}
}

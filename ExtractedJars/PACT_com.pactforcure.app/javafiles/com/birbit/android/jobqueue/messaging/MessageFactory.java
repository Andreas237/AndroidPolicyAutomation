// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.birbit.android.jobqueue.messaging;

import com.birbit.android.jobqueue.log.JqLog;
import java.util.Arrays;
import java.util.Map;

// Referenced classes of package com.birbit.android.jobqueue.messaging:
//			Type, Message

public class MessageFactory
{

	public MessageFactory()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
		pools = new Message[Type.values().length];
	//    2    4:aload_0         
	//    3    5:invokestatic    #21  <Method Type[] Type.values()>
	//    4    8:arraylength     
	//    5    9:anewarray       Message[]
	//    6   12:putfield        #25  <Field Message[] pools>
		counts = new int[pools.length];
	//    7   15:aload_0         
	//    8   16:aload_0         
	//    9   17:getfield        #25  <Field Message[] pools>
	//   10   20:arraylength     
	//   11   21:newarray        int[]
	//   12   23:putfield        #27  <Field int[] counts>
		Arrays.fill(counts, 0);
	//   13   26:aload_0         
	//   14   27:getfield        #27  <Field int[] counts>
	//   15   30:iconst_0        
	//   16   31:invokestatic    #33  <Method void Arrays.fill(int[], int)>
	//   17   34:return          
	}

	public Message obtain(Class class1)
	{
		Type type = (Type)Type.mapping.get(((Object) (class1)));
	//    0    0:getstatic       #44  <Field Map Type.mapping>
	//    1    3:aload_1         
	//    2    4:invokeinterface #50  <Method Object Map.get(Object)>
	//    3    9:checkcast       #17  <Class Type>
	//    4   12:astore_3        
		type;
	//    5   13:aload_3         
		JVM INSTR monitorenter ;
	//    6   14:monitorenter    
		Message message = pools[type.ordinal()];
	//    7   15:aload_0         
	//    8   16:getfield        #25  <Field Message[] pools>
	//    9   19:aload_3         
	//   10   20:invokevirtual   #54  <Method int Type.ordinal()>
	//   11   23:aaload          
	//   12   24:astore          4
		if(message == null)
			break MISSING_BLOCK_LABEL_74;
	//   13   26:aload           4
	//   14   28:ifnull          74
		int i;
		pools[type.ordinal()] = message.next;
	//   15   31:aload_0         
	//   16   32:getfield        #25  <Field Message[] pools>
	//   17   35:aload_3         
	//   18   36:invokevirtual   #54  <Method int Type.ordinal()>
	//   19   39:aload           4
	//   20   41:getfield        #58  <Field Message Message.next>
	//   21   44:aastore         
		class1 = ((Class) (counts));
	//   22   45:aload_0         
	//   23   46:getfield        #27  <Field int[] counts>
	//   24   49:astore_1        
		i = type.ordinal();
	//   25   50:aload_3         
	//   26   51:invokevirtual   #54  <Method int Type.ordinal()>
	//   27   54:istore_2        
		class1[i] = class1[i] - 1;
	//   28   55:aload_1         
	//   29   56:iload_2         
	//   30   57:aload_1         
	//   31   58:iload_2         
	//   32   59:iaload          
	//   33   60:iconst_1        
	//   34   61:isub            
	//   35   62:iastore         
		message.next = null;
	//   36   63:aload           4
	//   37   65:aconst_null     
	//   38   66:putfield        #58  <Field Message Message.next>
		type;
	//   39   69:aload_3         
		JVM INSTR monitorexit ;
	//   40   70:monitorexit     
		return message;
	//   41   71:aload           4
	//   42   73:areturn         
		message = (Message)class1.newInstance();
	//   43   74:aload_1         
	//   44   75:invokevirtual   #64  <Method Object Class.newInstance()>
	//   45   78:checkcast       #23  <Class Message>
	//   46   81:astore          4
		type;
	//   47   83:aload_3         
		JVM INSTR monitorexit ;
	//   48   84:monitorexit     
		return message;
	//   49   85:aload           4
	//   50   87:areturn         
		Object obj;
		obj;
	//   51   88:astore          4
		JqLog.e(((Throwable) (obj)), (new StringBuilder()).append("Cannot create an instance of ").append(((Object) (class1))).append(". Make sure it has a empty").append(" constructor.").toString(), new Object[0]);
	//   52   90:aload           4
	//   53   92:new             #66  <Class StringBuilder>
	//   54   95:dup             
	//   55   96:invokespecial   #67  <Method void StringBuilder()>
	//   56   99:ldc1            #69  <String "Cannot create an instance of ">
	//   57  101:invokevirtual   #73  <Method StringBuilder StringBuilder.append(String)>
	//   58  104:aload_1         
	//   59  105:invokevirtual   #76  <Method StringBuilder StringBuilder.append(Object)>
	//   60  108:ldc1            #78  <String ". Make sure it has a empty">
	//   61  110:invokevirtual   #73  <Method StringBuilder StringBuilder.append(String)>
	//   62  113:ldc1            #80  <String " constructor.">
	//   63  115:invokevirtual   #73  <Method StringBuilder StringBuilder.append(String)>
	//   64  118:invokevirtual   #84  <Method String StringBuilder.toString()>
	//   65  121:iconst_0        
	//   66  122:anewarray       Object[]
	//   67  125:invokestatic    #90  <Method void JqLog.e(Throwable, String, Object[])>
_L1:
		type;
	//   68  128:aload_3         
		JVM INSTR monitorexit ;
	//   69  129:monitorexit     
		return null;
	//   70  130:aconst_null     
	//   71  131:areturn         
		obj;
	//   72  132:astore          4
		JqLog.e(((Throwable) (obj)), (new StringBuilder()).append("Cannot create an instance of ").append(((Object) (class1))).append(". Make sure it has a public").append(" empty constructor.").toString(), new Object[0]);
	//   73  134:aload           4
	//   74  136:new             #66  <Class StringBuilder>
	//   75  139:dup             
	//   76  140:invokespecial   #67  <Method void StringBuilder()>
	//   77  143:ldc1            #69  <String "Cannot create an instance of ">
	//   78  145:invokevirtual   #73  <Method StringBuilder StringBuilder.append(String)>
	//   79  148:aload_1         
	//   80  149:invokevirtual   #76  <Method StringBuilder StringBuilder.append(Object)>
	//   81  152:ldc1            #92  <String ". Make sure it has a public">
	//   82  154:invokevirtual   #73  <Method StringBuilder StringBuilder.append(String)>
	//   83  157:ldc1            #94  <String " empty constructor.">
	//   84  159:invokevirtual   #73  <Method StringBuilder StringBuilder.append(String)>
	//   85  162:invokevirtual   #84  <Method String StringBuilder.toString()>
	//   86  165:iconst_0        
	//   87  166:anewarray       Object[]
	//   88  169:invokestatic    #90  <Method void JqLog.e(Throwable, String, Object[])>
		  goto _L1
	//*  89  172:goto            128
		class1;
	//   90  175:astore_1        
		type;
	//   91  176:aload_3         
		JVM INSTR monitorexit ;
	//   92  177:monitorexit     
		throw class1;
	//   93  178:aload_1         
	//   94  179:athrow          
	}

	public void release(Message message)
	{
		Type type;
		type = message.type;
	//    0    0:aload_1         
	//    1    1:getfield        #102 <Field Type Message.type>
	//    2    4:astore_3        
		message.recycle();
	//    3    5:aload_1         
	//    4    6:invokevirtual   #105 <Method void Message.recycle()>
		type;
	//    5    9:aload_3         
		JVM INSTR monitorenter ;
	//    6   10:monitorenter    
		int i;
		if(counts[type.ordinal()] >= 20)
			break MISSING_BLOCK_LABEL_66;
	//    7   11:aload_0         
	//    8   12:getfield        #27  <Field int[] counts>
	//    9   15:aload_3         
	//   10   16:invokevirtual   #54  <Method int Type.ordinal()>
	//   11   19:iaload          
	//   12   20:bipush          20
	//   13   22:icmpge          66
		message.next = pools[type.ordinal()];
	//   14   25:aload_1         
	//   15   26:aload_0         
	//   16   27:getfield        #25  <Field Message[] pools>
	//   17   30:aload_3         
	//   18   31:invokevirtual   #54  <Method int Type.ordinal()>
	//   19   34:aaload          
	//   20   35:putfield        #58  <Field Message Message.next>
		pools[type.ordinal()] = message;
	//   21   38:aload_0         
	//   22   39:getfield        #25  <Field Message[] pools>
	//   23   42:aload_3         
	//   24   43:invokevirtual   #54  <Method int Type.ordinal()>
	//   25   46:aload_1         
	//   26   47:aastore         
		message = ((Message) (counts));
	//   27   48:aload_0         
	//   28   49:getfield        #27  <Field int[] counts>
	//   29   52:astore_1        
		i = type.ordinal();
	//   30   53:aload_3         
	//   31   54:invokevirtual   #54  <Method int Type.ordinal()>
	//   32   57:istore_2        
		message[i] = message[i] + 1;
	//   33   58:aload_1         
	//   34   59:iload_2         
	//   35   60:aload_1         
	//   36   61:iload_2         
	//   37   62:iaload          
	//   38   63:iconst_1        
	//   39   64:iadd            
	//   40   65:iastore         
		type;
	//   41   66:aload_3         
		JVM INSTR monitorexit ;
	//   42   67:monitorexit     
		return;
	//   43   68:return          
		message;
	//   44   69:astore_1        
		type;
	//   45   70:aload_3         
		JVM INSTR monitorexit ;
	//   46   71:monitorexit     
		throw message;
	//   47   72:aload_1         
	//   48   73:athrow          
	}

	private static final int CACHE_LIMIT = 20;
	int counts[];
	Message pools[];
}

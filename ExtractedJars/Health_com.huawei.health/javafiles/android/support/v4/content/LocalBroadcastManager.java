// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.content;

import android.content.*;
import android.os.*;
import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;

public final class LocalBroadcastManager
{
	static class BroadcastRecord
	{

		final Intent intent;
		final ArrayList receivers;

		BroadcastRecord(Intent intent1, ArrayList arraylist)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #17  <Method void Object()>
			intent = intent1;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #19  <Field Intent intent>
			receivers = arraylist;
		//    5    9:aload_0         
		//    6   10:aload_2         
		//    7   11:putfield        #21  <Field ArrayList receivers>
		//    8   14:return          
		}
	}

	static class ReceiverRecord
	{

		public String toString()
		{
			StringBuilder stringbuilder = new StringBuilder(128);
		//    0    0:new             #27  <Class StringBuilder>
		//    1    3:dup             
		//    2    4:sipush          128
		//    3    7:invokespecial   #30  <Method void StringBuilder(int)>
		//    4   10:astore_1        
			stringbuilder.append("Receiver{");
		//    5   11:aload_1         
		//    6   12:ldc1            #32  <String "Receiver{">
		//    7   14:invokevirtual   #36  <Method StringBuilder StringBuilder.append(String)>
		//    8   17:pop             
			stringbuilder.append(((Object) (receiver)));
		//    9   18:aload_1         
		//   10   19:aload_0         
		//   11   20:getfield        #22  <Field BroadcastReceiver receiver>
		//   12   23:invokevirtual   #39  <Method StringBuilder StringBuilder.append(Object)>
		//   13   26:pop             
			stringbuilder.append(" filter=");
		//   14   27:aload_1         
		//   15   28:ldc1            #41  <String " filter=">
		//   16   30:invokevirtual   #36  <Method StringBuilder StringBuilder.append(String)>
		//   17   33:pop             
			stringbuilder.append(((Object) (filter)));
		//   18   34:aload_1         
		//   19   35:aload_0         
		//   20   36:getfield        #20  <Field IntentFilter filter>
		//   21   39:invokevirtual   #39  <Method StringBuilder StringBuilder.append(Object)>
		//   22   42:pop             
			stringbuilder.append("}");
		//   23   43:aload_1         
		//   24   44:ldc1            #43  <String "}">
		//   25   46:invokevirtual   #36  <Method StringBuilder StringBuilder.append(String)>
		//   26   49:pop             
			return stringbuilder.toString();
		//   27   50:aload_1         
		//   28   51:invokevirtual   #45  <Method String StringBuilder.toString()>
		//   29   54:areturn         
		}

		boolean broadcasting;
		final IntentFilter filter;
		final BroadcastReceiver receiver;

		ReceiverRecord(IntentFilter intentfilter, BroadcastReceiver broadcastreceiver)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #18  <Method void Object()>
			filter = intentfilter;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #20  <Field IntentFilter filter>
			receiver = broadcastreceiver;
		//    5    9:aload_0         
		//    6   10:aload_2         
		//    7   11:putfield        #22  <Field BroadcastReceiver receiver>
		//    8   14:return          
		}
	}


	private LocalBroadcastManager(Context context)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #43  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #49  <Class HashMap>
	//    4    8:dup             
	//    5    9:invokespecial   #50  <Method void HashMap()>
	//    6   12:putfield        #52  <Field HashMap mReceivers>
	//    7   15:aload_0         
	//    8   16:new             #49  <Class HashMap>
	//    9   19:dup             
	//   10   20:invokespecial   #50  <Method void HashMap()>
	//   11   23:putfield        #54  <Field HashMap mActions>
	//   12   26:aload_0         
	//   13   27:new             #56  <Class ArrayList>
	//   14   30:dup             
	//   15   31:invokespecial   #57  <Method void ArrayList()>
	//   16   34:putfield        #59  <Field ArrayList mPendingBroadcasts>
		mAppContext = context;
	//   17   37:aload_0         
	//   18   38:aload_1         
	//   19   39:putfield        #61  <Field Context mAppContext>
		mHandler = ((Handler) (new Handler(context.getMainLooper()) {

			public void handleMessage(Message message)
			{
				switch(message.what)
			//*   0    0:aload_1         
			//*   1    1:getfield        #26  <Field int Message.what>
				{
			//*   2    4:lookupswitch    1: default 24
			//			               1: 27
			//*   3   24:goto            35
				case 1: // '\001'
					executePendingBroadcasts();
			//    4   27:aload_0         
			//    5   28:getfield        #14  <Field LocalBroadcastManager this$0>
			//    6   31:invokestatic    #30  <Method void LocalBroadcastManager.access$000(LocalBroadcastManager)>
					return;
			//    7   34:return          
				}
				super.handleMessage(message);
			//    8   35:aload_0         
			//    9   36:aload_1         
			//   10   37:invokespecial   #32  <Method void Handler.handleMessage(Message)>
			//   11   40:return          
			}

			final LocalBroadcastManager this$0;

			
			{
				this$0 = LocalBroadcastManager.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #14  <Field LocalBroadcastManager this$0>
				super(looper);
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:invokespecial   #17  <Method void Handler(Looper)>
			//    6   10:return          
			}
		}
));
	//   20   42:aload_0         
	//   21   43:new             #6   <Class LocalBroadcastManager$1>
	//   22   46:dup             
	//   23   47:aload_0         
	//   24   48:aload_1         
	//   25   49:invokevirtual   #67  <Method Looper Context.getMainLooper()>
	//   26   52:invokespecial   #70  <Method void LocalBroadcastManager$1(LocalBroadcastManager, Looper)>
	//   27   55:putfield        #72  <Field Handler mHandler>
	//   28   58:return          
	}

	private void executePendingBroadcasts()
	{
_L3:
		HashMap hashmap = mReceivers;
	//    0    0:aload_0         
	//    1    1:getfield        #52  <Field HashMap mReceivers>
	//    2    4:astore_3        
		hashmap;
	//    3    5:aload_3         
		JVM INSTR monitorenter ;
	//    4    6:monitorenter    
		int i = mPendingBroadcasts.size();
	//    5    7:aload_0         
	//    6    8:getfield        #59  <Field ArrayList mPendingBroadcasts>
	//    7   11:invokevirtual   #81  <Method int ArrayList.size()>
	//    8   14:istore_1        
		if(i > 0)
			break MISSING_BLOCK_LABEL_22;
	//    9   15:iload_1         
	//   10   16:ifgt            22
		hashmap;
	//   11   19:aload_3         
		JVM INSTR monitorexit ;
	//   12   20:monitorexit     
		return;
	//   13   21:return          
		Object obj;
		obj = ((Object) (new BroadcastRecord[i]));
	//   14   22:iload_1         
	//   15   23:anewarray       BroadcastRecord[]
	//   16   26:astore          4
		mPendingBroadcasts.toArray(((Object []) (obj)));
	//   17   28:aload_0         
	//   18   29:getfield        #59  <Field ArrayList mPendingBroadcasts>
	//   19   32:aload           4
	//   20   34:invokevirtual   #85  <Method Object[] ArrayList.toArray(Object[])>
	//   21   37:pop             
		mPendingBroadcasts.clear();
	//   22   38:aload_0         
	//   23   39:getfield        #59  <Field ArrayList mPendingBroadcasts>
	//   24   42:invokevirtual   #88  <Method void ArrayList.clear()>
		hashmap;
	//   25   45:aload_3         
		JVM INSTR monitorexit ;
	//   26   46:monitorexit     
		  goto _L1
	//*  27   47:goto            57
		obj;
	//   28   50:astore          4
	//*  29   52:aload_3         
		throw obj;
	//   30   53:monitorexit     
	//   31   54:aload           4
	//   32   56:athrow          
_L1:
		int j = 0;
	//   33   57:iconst_0        
	//   34   58:istore_1        
		while(j < obj.length) 
	//*  35   59:iload_1         
	//*  36   60:aload           4
	//*  37   62:arraylength     
	//*  38   63:icmpge          123
		{
			BroadcastRecord broadcastrecord = obj[j];
	//   39   66:aload           4
	//   40   68:iload_1         
	//   41   69:aaload          
	//   42   70:astore_3        
			for(int k = 0; k < broadcastrecord.receivers.size(); k++)
	//*  43   71:iconst_0        
	//*  44   72:istore_2        
	//*  45   73:iload_2         
	//*  46   74:aload_3         
	//*  47   75:getfield        #91  <Field ArrayList LocalBroadcastManager$BroadcastRecord.receivers>
	//*  48   78:invokevirtual   #81  <Method int ArrayList.size()>
	//*  49   81:icmpge          116
				((ReceiverRecord)broadcastrecord.receivers.get(k)).receiver.onReceive(mAppContext, broadcastrecord.intent);
	//   50   84:aload_3         
	//   51   85:getfield        #91  <Field ArrayList LocalBroadcastManager$BroadcastRecord.receivers>
	//   52   88:iload_2         
	//   53   89:invokevirtual   #95  <Method Object ArrayList.get(int)>
	//   54   92:checkcast       #11  <Class LocalBroadcastManager$ReceiverRecord>
	//   55   95:getfield        #99  <Field BroadcastReceiver LocalBroadcastManager$ReceiverRecord.receiver>
	//   56   98:aload_0         
	//   57   99:getfield        #61  <Field Context mAppContext>
	//   58  102:aload_3         
	//   59  103:getfield        #103 <Field Intent LocalBroadcastManager$BroadcastRecord.intent>
	//   60  106:invokevirtual   #109 <Method void BroadcastReceiver.onReceive(Context, Intent)>

	//   61  109:iload_2         
	//   62  110:iconst_1        
	//   63  111:iadd            
	//   64  112:istore_2        
	//*  65  113:goto            73
			j++;
	//   66  116:iload_1         
	//   67  117:iconst_1        
	//   68  118:iadd            
	//   69  119:istore_1        
		}
		if(true) goto _L3; else goto _L2
	//   70  120:goto            59
_L2:
	//*  71  123:goto            0
	}

	public static LocalBroadcastManager getInstance(Context context)
	{
		Object obj = mLock;
	//    0    0:getstatic       #45  <Field Object mLock>
	//    1    3:astore_1        
		obj;
	//    2    4:aload_1         
		JVM INSTR monitorenter ;
	//    3    5:monitorenter    
		if(mInstance == null)
	//*   4    6:getstatic       #113 <Field LocalBroadcastManager mInstance>
	//*   5    9:ifnonnull       26
			mInstance = new LocalBroadcastManager(context.getApplicationContext());
	//    6   12:new             #2   <Class LocalBroadcastManager>
	//    7   15:dup             
	//    8   16:aload_0         
	//    9   17:invokevirtual   #117 <Method Context Context.getApplicationContext()>
	//   10   20:invokespecial   #119 <Method void LocalBroadcastManager(Context)>
	//   11   23:putstatic       #113 <Field LocalBroadcastManager mInstance>
		context = ((Context) (mInstance));
	//   12   26:getstatic       #113 <Field LocalBroadcastManager mInstance>
	//   13   29:astore_0        
		obj;
	//   14   30:aload_1         
		JVM INSTR monitorexit ;
	//   15   31:monitorexit     
		return ((LocalBroadcastManager) (context));
	//   16   32:aload_0         
	//   17   33:areturn         
		context;
	//   18   34:astore_0        
	//*  19   35:aload_1         
		throw context;
	//   20   36:monitorexit     
	//   21   37:aload_0         
	//   22   38:athrow          
	}

	public void registerReceiver(BroadcastReceiver broadcastreceiver, IntentFilter intentfilter)
	{
		HashMap hashmap = mReceivers;
	//    0    0:aload_0         
	//    1    1:getfield        #52  <Field HashMap mReceivers>
	//    2    4:astore          6
		hashmap;
	//    3    6:aload           6
		JVM INSTR monitorenter ;
	//    4    8:monitorenter    
		Object obj;
		ReceiverRecord receiverrecord;
		receiverrecord = new ReceiverRecord(intentfilter, broadcastreceiver);
	//    5    9:new             #11  <Class LocalBroadcastManager$ReceiverRecord>
	//    6   12:dup             
	//    7   13:aload_2         
	//    8   14:aload_1         
	//    9   15:invokespecial   #124 <Method void LocalBroadcastManager$ReceiverRecord(IntentFilter, BroadcastReceiver)>
	//   10   18:astore          7
		obj = ((Object) ((ArrayList)mReceivers.get(((Object) (broadcastreceiver)))));
	//   11   20:aload_0         
	//   12   21:getfield        #52  <Field HashMap mReceivers>
	//   13   24:aload_1         
	//   14   25:invokevirtual   #127 <Method Object HashMap.get(Object)>
	//   15   28:checkcast       #56  <Class ArrayList>
	//   16   31:astore          5
		ArrayList arraylist;
		arraylist = ((ArrayList) (obj));
	//   17   33:aload           5
	//   18   35:astore          4
		if(obj != null)
			break MISSING_BLOCK_LABEL_63;
	//   19   37:aload           5
	//   20   39:ifnonnull       63
		arraylist = new ArrayList(1);
	//   21   42:new             #56  <Class ArrayList>
	//   22   45:dup             
	//   23   46:iconst_1        
	//   24   47:invokespecial   #130 <Method void ArrayList(int)>
	//   25   50:astore          4
		mReceivers.put(((Object) (broadcastreceiver)), ((Object) (arraylist)));
	//   26   52:aload_0         
	//   27   53:getfield        #52  <Field HashMap mReceivers>
	//   28   56:aload_1         
	//   29   57:aload           4
	//   30   59:invokevirtual   #134 <Method Object HashMap.put(Object, Object)>
	//   31   62:pop             
		arraylist.add(((Object) (intentfilter)));
	//   32   63:aload           4
	//   33   65:aload_2         
	//   34   66:invokevirtual   #138 <Method boolean ArrayList.add(Object)>
	//   35   69:pop             
		int i = 0;
	//   36   70:iconst_0        
	//   37   71:istore_3        
_L2:
		if(i >= intentfilter.countActions())
			break; /* Loop/switch isn't completed */
	//   38   72:iload_3         
	//   39   73:aload_2         
	//   40   74:invokevirtual   #143 <Method int IntentFilter.countActions()>
	//   41   77:icmpge          143
		obj = ((Object) (intentfilter.getAction(i)));
	//   42   80:aload_2         
	//   43   81:iload_3         
	//   44   82:invokevirtual   #147 <Method String IntentFilter.getAction(int)>
	//   45   85:astore          5
		arraylist = (ArrayList)mActions.get(obj);
	//   46   87:aload_0         
	//   47   88:getfield        #54  <Field HashMap mActions>
	//   48   91:aload           5
	//   49   93:invokevirtual   #127 <Method Object HashMap.get(Object)>
	//   50   96:checkcast       #56  <Class ArrayList>
	//   51   99:astore          4
		broadcastreceiver = ((BroadcastReceiver) (arraylist));
	//   52  101:aload           4
	//   53  103:astore_1        
		if(arraylist != null)
			break MISSING_BLOCK_LABEL_129;
	//   54  104:aload           4
	//   55  106:ifnonnull       129
		broadcastreceiver = ((BroadcastReceiver) (new ArrayList(1)));
	//   56  109:new             #56  <Class ArrayList>
	//   57  112:dup             
	//   58  113:iconst_1        
	//   59  114:invokespecial   #130 <Method void ArrayList(int)>
	//   60  117:astore_1        
		mActions.put(obj, ((Object) (broadcastreceiver)));
	//   61  118:aload_0         
	//   62  119:getfield        #54  <Field HashMap mActions>
	//   63  122:aload           5
	//   64  124:aload_1         
	//   65  125:invokevirtual   #134 <Method Object HashMap.put(Object, Object)>
	//   66  128:pop             
		((ArrayList) (broadcastreceiver)).add(((Object) (receiverrecord)));
	//   67  129:aload_1         
	//   68  130:aload           7
	//   69  132:invokevirtual   #138 <Method boolean ArrayList.add(Object)>
	//   70  135:pop             
		i++;
	//   71  136:iload_3         
	//   72  137:iconst_1        
	//   73  138:iadd            
	//   74  139:istore_3        
		if(true) goto _L2; else goto _L1
	//   75  140:goto            72
	//*  76  143:aload           6
_L1:
		return;
	//   77  145:monitorexit     
	//   78  146:return          
		broadcastreceiver;
	//   79  147:astore_1        
	//*  80  148:aload           6
		throw broadcastreceiver;
	//   81  150:monitorexit     
	//   82  151:aload_1         
	//   83  152:athrow          
	}

	public boolean sendBroadcast(Intent intent)
	{
		HashMap hashmap = mReceivers;
	//    0    0:aload_0         
	//    1    1:getfield        #52  <Field HashMap mReceivers>
	//    2    4:astore          7
		hashmap;
	//    3    6:aload           7
		JVM INSTR monitorenter ;
	//    4    8:monitorenter    
		String s;
		String s1;
		android.net.Uri uri;
		String s2;
		java.util.Set set;
		s = intent.getAction();
	//    5    9:aload_1         
	//    6   10:invokevirtual   #154 <Method String Intent.getAction()>
	//    7   13:astore          8
		s1 = intent.resolveTypeIfNeeded(mAppContext.getContentResolver());
	//    8   15:aload_1         
	//    9   16:aload_0         
	//   10   17:getfield        #61  <Field Context mAppContext>
	//   11   20:invokevirtual   #158 <Method android.content.ContentResolver Context.getContentResolver()>
	//   12   23:invokevirtual   #162 <Method String Intent.resolveTypeIfNeeded(android.content.ContentResolver)>
	//   13   26:astore          9
		uri = intent.getData();
	//   14   28:aload_1         
	//   15   29:invokevirtual   #166 <Method android.net.Uri Intent.getData()>
	//   16   32:astore          10
		s2 = intent.getScheme();
	//   17   34:aload_1         
	//   18   35:invokevirtual   #169 <Method String Intent.getScheme()>
	//   19   38:astore          11
		set = intent.getCategories();
	//   20   40:aload_1         
	//   21   41:invokevirtual   #173 <Method java.util.Set Intent.getCategories()>
	//   22   44:astore          12
		int i;
		int j;
		int k;
		Object obj;
		Object obj1;
		ArrayList arraylist;
		ReceiverRecord receiverrecord;
		if((intent.getFlags() & 8) != 0)
	//*  23   46:aload_1         
	//*  24   47:invokevirtual   #176 <Method int Intent.getFlags()>
	//*  25   50:bipush          8
	//*  26   52:iand            
	//*  27   53:ifeq            462
			i = 1;
	//   28   56:iconst_1        
	//   29   57:istore_2        
		else
	//*  30   58:goto            61
	//*  31   61:iload_2         
	//*  32   62:ifeq            110
	//*  33   65:ldc1            #22  <String "LocalBroadcastManager">
	//*  34   67:new             #178 <Class StringBuilder>
	//*  35   70:dup             
	//*  36   71:invokespecial   #179 <Method void StringBuilder()>
	//*  37   74:ldc1            #181 <String "Resolving type ">
	//*  38   76:invokevirtual   #185 <Method StringBuilder StringBuilder.append(String)>
	//*  39   79:aload           9
	//*  40   81:invokevirtual   #185 <Method StringBuilder StringBuilder.append(String)>
	//*  41   84:ldc1            #187 <String " scheme ">
	//*  42   86:invokevirtual   #185 <Method StringBuilder StringBuilder.append(String)>
	//*  43   89:aload           11
	//*  44   91:invokevirtual   #185 <Method StringBuilder StringBuilder.append(String)>
	//*  45   94:ldc1            #189 <String " of intent ">
	//*  46   96:invokevirtual   #185 <Method StringBuilder StringBuilder.append(String)>
	//*  47   99:aload_1         
	//*  48  100:invokevirtual   #192 <Method StringBuilder StringBuilder.append(Object)>
	//*  49  103:invokevirtual   #195 <Method String StringBuilder.toString()>
	//*  50  106:invokestatic    #201 <Method int Log.v(String, String)>
	//*  51  109:pop             
	//*  52  110:aload_0         
	//*  53  111:getfield        #54  <Field HashMap mActions>
	//*  54  114:aload_1         
	//*  55  115:invokevirtual   #154 <Method String Intent.getAction()>
	//*  56  118:invokevirtual   #127 <Method Object HashMap.get(Object)>
	//*  57  121:checkcast       #56  <Class ArrayList>
	//*  58  124:astore          13
	//*  59  126:aload           13
	//*  60  128:ifnull          448
	//*  61  131:iload_2         
	//*  62  132:ifeq            467
	//*  63  135:ldc1            #22  <String "LocalBroadcastManager">
	//*  64  137:new             #178 <Class StringBuilder>
	//*  65  140:dup             
	//*  66  141:invokespecial   #179 <Method void StringBuilder()>
	//*  67  144:ldc1            #203 <String "Action list: ">
	//*  68  146:invokevirtual   #185 <Method StringBuilder StringBuilder.append(String)>
	//*  69  149:aload           13
	//*  70  151:invokevirtual   #192 <Method StringBuilder StringBuilder.append(Object)>
	//*  71  154:invokevirtual   #195 <Method String StringBuilder.toString()>
	//*  72  157:invokestatic    #201 <Method int Log.v(String, String)>
	//*  73  160:pop             
	//*  74  161:goto            467
	//*  75  164:iload_3         
	//*  76  165:aload           13
	//*  77  167:invokevirtual   #81  <Method int ArrayList.size()>
	//*  78  170:icmpge          565
	//*  79  173:aload           13
	//*  80  175:iload_3         
	//*  81  176:invokevirtual   #95  <Method Object ArrayList.get(int)>
	//*  82  179:checkcast       #11  <Class LocalBroadcastManager$ReceiverRecord>
	//*  83  182:astore          14
	//*  84  184:iload_2         
	//*  85  185:ifeq            217
	//*  86  188:ldc1            #22  <String "LocalBroadcastManager">
	//*  87  190:new             #178 <Class StringBuilder>
	//*  88  193:dup             
	//*  89  194:invokespecial   #179 <Method void StringBuilder()>
	//*  90  197:ldc1            #205 <String "Matching against filter ">
	//*  91  199:invokevirtual   #185 <Method StringBuilder StringBuilder.append(String)>
	//*  92  202:aload           14
	//*  93  204:getfield        #209 <Field IntentFilter LocalBroadcastManager$ReceiverRecord.filter>
	//*  94  207:invokevirtual   #192 <Method StringBuilder StringBuilder.append(Object)>
	//*  95  210:invokevirtual   #195 <Method String StringBuilder.toString()>
	//*  96  213:invokestatic    #201 <Method int Log.v(String, String)>
	//*  97  216:pop             
	//*  98  217:aload           14
	//*  99  219:getfield        #212 <Field boolean LocalBroadcastManager$ReceiverRecord.broadcasting>
	//* 100  222:ifeq            248
	//* 101  225:aload           6
	//* 102  227:astore          5
	//* 103  229:iload_2         
	//* 104  230:ifeq            554
	//* 105  233:ldc1            #22  <String "LocalBroadcastManager">
	//* 106  235:ldc1            #214 <String "  Filter's target already added">
	//* 107  237:invokestatic    #201 <Method int Log.v(String, String)>
	//* 108  240:pop             
	//* 109  241:aload           6
	//* 110  243:astore          5
	//* 111  245:goto            554
	//* 112  248:aload           14
	//* 113  250:getfield        #209 <Field IntentFilter LocalBroadcastManager$ReceiverRecord.filter>
	//* 114  253:aload           8
	//* 115  255:aload           9
	//* 116  257:aload           11
	//* 117  259:aload           10
	//* 118  261:aload           12
	//* 119  263:ldc1            #22  <String "LocalBroadcastManager">
	//* 120  265:invokevirtual   #218 <Method int IntentFilter.match(String, String, String, android.net.Uri, java.util.Set, String)>
	//* 121  268:istore          4
	//* 122  270:iload           4
	//* 123  272:iflt            475
	//* 124  275:iload_2         
	//* 125  276:ifeq            308
	//* 126  279:ldc1            #22  <String "LocalBroadcastManager">
	//* 127  281:new             #178 <Class StringBuilder>
	//* 128  284:dup             
	//* 129  285:invokespecial   #179 <Method void StringBuilder()>
	//* 130  288:ldc1            #220 <String "  Filter matched!  match=0x">
	//* 131  290:invokevirtual   #185 <Method StringBuilder StringBuilder.append(String)>
	//* 132  293:iload           4
	//* 133  295:invokestatic    #225 <Method String Integer.toHexString(int)>
	//* 134  298:invokevirtual   #185 <Method StringBuilder StringBuilder.append(String)>
	//* 135  301:invokevirtual   #195 <Method String StringBuilder.toString()>
	//* 136  304:invokestatic    #201 <Method int Log.v(String, String)>
	//* 137  307:pop             
	//* 138  308:aload           6
	//* 139  310:astore          5
	//* 140  312:aload           6
	//* 141  314:ifnonnull       326
	//* 142  317:new             #56  <Class ArrayList>
	//* 143  320:dup             
	//* 144  321:invokespecial   #57  <Method void ArrayList()>
	//* 145  324:astore          5
	//* 146  326:aload           5
	//* 147  328:aload           14
	//* 148  330:invokevirtual   #138 <Method boolean ArrayList.add(Object)>
	//* 149  333:pop             
	//* 150  334:aload           14
	//* 151  336:iconst_1        
	//* 152  337:putfield        #212 <Field boolean LocalBroadcastManager$ReceiverRecord.broadcasting>
	//* 153  340:goto            554
	//* 154  343:ldc1            #22  <String "LocalBroadcastManager">
	//* 155  345:new             #178 <Class StringBuilder>
	//* 156  348:dup             
	//* 157  349:invokespecial   #179 <Method void StringBuilder()>
	//* 158  352:ldc1            #227 <String "  Filter did not match: ">
	//* 159  354:invokevirtual   #185 <Method StringBuilder StringBuilder.append(String)>
	//* 160  357:aload           5
	//* 161  359:invokevirtual   #185 <Method StringBuilder StringBuilder.append(String)>
	//* 162  362:invokevirtual   #195 <Method String StringBuilder.toString()>
	//* 163  365:invokestatic    #201 <Method int Log.v(String, String)>
	//* 164  368:pop             
	//* 165  369:aload           6
	//* 166  371:astore          5
	//* 167  373:goto            554
	//* 168  376:iload_2         
	//* 169  377:aload           6
	//* 170  379:invokevirtual   #81  <Method int ArrayList.size()>
	//* 171  382:icmpge          405
	//* 172  385:aload           6
	//* 173  387:iload_2         
	//* 174  388:invokevirtual   #95  <Method Object ArrayList.get(int)>
	//* 175  391:checkcast       #11  <Class LocalBroadcastManager$ReceiverRecord>
	//* 176  394:iconst_0        
	//* 177  395:putfield        #212 <Field boolean LocalBroadcastManager$ReceiverRecord.broadcasting>
	//* 178  398:iload_2         
	//* 179  399:iconst_1        
	//* 180  400:iadd            
	//* 181  401:istore_2        
	//* 182  402:goto            376
	//* 183  405:aload_0         
	//* 184  406:getfield        #59  <Field ArrayList mPendingBroadcasts>
	//* 185  409:new             #8   <Class LocalBroadcastManager$BroadcastRecord>
	//* 186  412:dup             
	//* 187  413:aload_1         
	//* 188  414:aload           6
	//* 189  416:invokespecial   #230 <Method void LocalBroadcastManager$BroadcastRecord(Intent, ArrayList)>
	//* 190  419:invokevirtual   #138 <Method boolean ArrayList.add(Object)>
	//* 191  422:pop             
	//* 192  423:aload_0         
	//* 193  424:getfield        #72  <Field Handler mHandler>
	//* 194  427:iconst_1        
	//* 195  428:invokevirtual   #236 <Method boolean Handler.hasMessages(int)>
	//* 196  431:ifne            443
	//* 197  434:aload_0         
	//* 198  435:getfield        #72  <Field Handler mHandler>
	//* 199  438:iconst_1        
	//* 200  439:invokevirtual   #239 <Method boolean Handler.sendEmptyMessage(int)>
	//* 201  442:pop             
	//* 202  443:aload           7
	//* 203  445:monitorexit     
	//* 204  446:iconst_1        
	//* 205  447:ireturn         
	//* 206  448:aload           7
	//* 207  450:monitorexit     
	//* 208  451:goto            460
	//* 209  454:astore_1        
	//* 210  455:aload           7
	//* 211  457:monitorexit     
	//* 212  458:aload_1         
	//* 213  459:athrow          
	//* 214  460:iconst_0        
	//* 215  461:ireturn         
			i = 0;
	//  216  462:iconst_0        
	//  217  463:istore_2        
		if(i == 0)
			break MISSING_BLOCK_LABEL_110;
		Log.v("LocalBroadcastManager", (new StringBuilder()).append("Resolving type ").append(s1).append(" scheme ").append(s2).append(" of intent ").append(((Object) (intent))).toString());
		arraylist = (ArrayList)mActions.get(((Object) (intent.getAction())));
		if(arraylist == null) goto _L2; else goto _L1
_L1:
		if(i == 0) goto _L4; else goto _L3
_L3:
		Log.v("LocalBroadcastManager", (new StringBuilder()).append("Action list: ").append(((Object) (arraylist))).toString());
		  goto _L4
_L15:
		if(j >= arraylist.size()) goto _L6; else goto _L5
_L5:
		receiverrecord = (ReceiverRecord)arraylist.get(j);
		if(i == 0)
			break MISSING_BLOCK_LABEL_217;
		Log.v("LocalBroadcastManager", (new StringBuilder()).append("Matching against filter ").append(((Object) (receiverrecord.filter))).toString());
		if(!receiverrecord.broadcasting) goto _L8; else goto _L7
_L7:
		obj = obj1;
		if(i == 0) goto _L10; else goto _L9
_L9:
		Log.v("LocalBroadcastManager", "  Filter's target already added");
		obj = obj1;
		  goto _L10
_L8:
		k = receiverrecord.filter.match(s, s1, s2, uri, set, "LocalBroadcastManager");
		if(k < 0) goto _L12; else goto _L11
_L11:
		if(i == 0)
			break MISSING_BLOCK_LABEL_308;
		Log.v("LocalBroadcastManager", (new StringBuilder()).append("  Filter matched!  match=0x").append(Integer.toHexString(k)).toString());
		obj = obj1;
		if(obj1 != null)
			break MISSING_BLOCK_LABEL_326;
		obj = ((Object) (new ArrayList()));
		((ArrayList) (obj)).add(((Object) (receiverrecord)));
		receiverrecord.broadcasting = true;
		  goto _L10
_L23:
		Log.v("LocalBroadcastManager", (new StringBuilder()).append("  Filter did not match: ").append(((String) (obj))).toString());
		obj = obj1;
		  goto _L10
_L13:
		if(i >= ((ArrayList) (obj1)).size())
			break MISSING_BLOCK_LABEL_405;
		((ReceiverRecord)((ArrayList) (obj1)).get(i)).broadcasting = false;
		i++;
		  goto _L13
		mPendingBroadcasts.add(((Object) (new BroadcastRecord(intent, ((ArrayList) (obj1))))));
		if(!mHandler.hasMessages(1))
			mHandler.sendEmptyMessage(1);
		hashmap;
		JVM INSTR monitorexit ;
		return true;
_L2:
		hashmap;
		JVM INSTR monitorexit ;
		  goto _L14
		intent;
		throw intent;
_L14:
		return false;
	//* 218  464:goto            61
_L4:
		obj1 = null;
	//  219  467:aconst_null     
	//  220  468:astore          6
		j = 0;
	//  221  470:iconst_0        
	//  222  471:istore_3        
		  goto _L15
	//* 223  472:goto            164
_L12:
		obj = obj1;
	//  224  475:aload           6
	//  225  477:astore          5
		if(i == 0) goto _L10; else goto _L16
	//  226  479:iload_2         
	//  227  480:ifeq            554
_L16:
		k;
	//  228  483:iload           4
		JVM INSTR tableswitch -4 -1: default 516
	//	               -4 526
	//	               -3 519
	//	               -2 533
	//	               -1 540;
	//  229  485:tableswitch     -4 -1: default 516
	//	               -4 526
	//	               -3 519
	//	               -2 533
	//	               -1 540
		   goto _L17 _L18 _L19 _L20 _L21
_L25:
		if(true) goto _L23; else goto _L22
_L22:
_L27:
		if(true) goto _L25; else goto _L24
_L24:
_L29:
		if(true) goto _L27; else goto _L26
_L26:
_L31:
		if(true) goto _L29; else goto _L28
_L28:
_L33:
		if(true) goto _L31; else goto _L30
_L30:
_L35:
		if(true) goto _L33; else goto _L32
_L32:
_L37:
		if(true) goto _L35; else goto _L34
_L34:
_L39:
		if(true) goto _L37; else goto _L36
_L36:
_L41:
		if(true) goto _L39; else goto _L38
_L38:
_L43:
		if(true) goto _L41; else goto _L40
_L40:
_L45:
		if(true) goto _L43; else goto _L42
_L42:
_L47:
		if(true) goto _L45; else goto _L44
_L44:
_L49:
		if(true) goto _L47; else goto _L46
_L46:
_L51:
		if(true) goto _L49; else goto _L48
_L48:
_L53:
		if(true) goto _L51; else goto _L50
_L50:
_L55:
		if(true) goto _L53; else goto _L52
_L52:
_L57:
		if(true) goto _L55; else goto _L54
_L54:
_L59:
		if(true) goto _L57; else goto _L56
_L56:
_L61:
		if(true) goto _L59; else goto _L58
_L58:
_L63:
		if(true) goto _L61; else goto _L60
_L60:
_L65:
		if(true) goto _L63; else goto _L62
_L62:
_L67:
		if(true) goto _L65; else goto _L64
_L64:
_L69:
		if(true) goto _L67; else goto _L66
_L66:
_L68:
	//* 230  516:goto            547
_L19:
		obj = "action";
	//  231  519:ldc1            #241 <String "action">
	//  232  521:astore          5
		  goto _L23
	//* 233  523:goto            343
_L18:
		obj = "category";
	//  234  526:ldc1            #243 <String "category">
	//  235  528:astore          5
		  goto _L23
	//* 236  530:goto            343
_L20:
		obj = "data";
	//  237  533:ldc1            #245 <String "data">
	//  238  535:astore          5
		  goto _L23
	//* 239  537:goto            343
_L21:
		obj = "type";
	//  240  540:ldc1            #247 <String "type">
	//  241  542:astore          5
		  goto _L23
	//* 242  544:goto            343
_L17:
		obj = "unknown reason";
	//  243  547:ldc1            #249 <String "unknown reason">
	//  244  549:astore          5
		  goto _L23
	//* 245  551:goto            343
_L10:
		j++;
	//  246  554:iload_3         
	//  247  555:iconst_1        
	//  248  556:iadd            
	//  249  557:istore_3        
		obj1 = obj;
	//  250  558:aload           5
	//  251  560:astore          6
		  goto _L15
	//* 252  562:goto            164
_L6:
		if(obj1 == null) goto _L2; else goto _L70
	//  253  565:aload           6
	//  254  567:ifnull          448
_L70:
		i = 0;
	//  255  570:iconst_0        
	//  256  571:istore_2        
		  goto _L13
	//* 257  572:goto            376
	}

	public void sendBroadcastSync(Intent intent)
	{
		if(sendBroadcast(intent))
	//*   0    0:aload_0         
	//*   1    1:aload_1         
	//*   2    2:invokevirtual   #253 <Method boolean sendBroadcast(Intent)>
	//*   3    5:ifeq            12
			executePendingBroadcasts();
	//    4    8:aload_0         
	//    5    9:invokespecial   #77  <Method void executePendingBroadcasts()>
	//    6   12:return          
	}

	public void unregisterReceiver(BroadcastReceiver broadcastreceiver)
	{
		HashMap hashmap = mReceivers;
	//    0    0:aload_0         
	//    1    1:getfield        #52  <Field HashMap mReceivers>
	//    2    4:astore          6
		hashmap;
	//    3    6:aload           6
		JVM INSTR monitorenter ;
	//    4    8:monitorenter    
		ArrayList arraylist = (ArrayList)mReceivers.remove(((Object) (broadcastreceiver)));
	//    5    9:aload_0         
	//    6   10:getfield        #52  <Field HashMap mReceivers>
	//    7   13:aload_1         
	//    8   14:invokevirtual   #258 <Method Object HashMap.remove(Object)>
	//    9   17:checkcast       #56  <Class ArrayList>
	//   10   20:astore          7
		if(arraylist != null)
			break MISSING_BLOCK_LABEL_31;
	//   11   22:aload           7
	//   12   24:ifnonnull       31
		hashmap;
	//   13   27:aload           6
		JVM INSTR monitorexit ;
	//   14   29:monitorexit     
		return;
	//   15   30:return          
		int j = 0;
	//   16   31:iconst_0        
	//   17   32:istore_3        
_L8:
		if(j >= arraylist.size()) goto _L2; else goto _L1
	//   18   33:iload_3         
	//   19   34:aload           7
	//   20   36:invokevirtual   #81  <Method int ArrayList.size()>
	//   21   39:icmpge          173
_L1:
		IntentFilter intentfilter = (IntentFilter)arraylist.get(j);
	//   22   42:aload           7
	//   23   44:iload_3         
	//   24   45:invokevirtual   #95  <Method Object ArrayList.get(int)>
	//   25   48:checkcast       #140 <Class IntentFilter>
	//   26   51:astore          8
		int k = 0;
	//   27   53:iconst_0        
	//   28   54:istore          4
_L7:
		if(k >= intentfilter.countActions()) goto _L4; else goto _L3
	//   29   56:iload           4
	//   30   58:aload           8
	//   31   60:invokevirtual   #143 <Method int IntentFilter.countActions()>
	//   32   63:icmpge          166
_L3:
		String s;
		ArrayList arraylist1;
		s = intentfilter.getAction(k);
	//   33   66:aload           8
	//   34   68:iload           4
	//   35   70:invokevirtual   #147 <Method String IntentFilter.getAction(int)>
	//   36   73:astore          9
		arraylist1 = (ArrayList)mActions.get(((Object) (s)));
	//   37   75:aload_0         
	//   38   76:getfield        #54  <Field HashMap mActions>
	//   39   79:aload           9
	//   40   81:invokevirtual   #127 <Method Object HashMap.get(Object)>
	//   41   84:checkcast       #56  <Class ArrayList>
	//   42   87:astore          10
		if(arraylist1 == null) goto _L6; else goto _L5
	//   43   89:aload           10
	//   44   91:ifnull          157
_L5:
		int i = 0;
	//   45   94:iconst_0        
	//   46   95:istore_2        
_L9:
		if(i >= arraylist1.size())
			break MISSING_BLOCK_LABEL_139;
	//   47   96:iload_2         
	//   48   97:aload           10
	//   49   99:invokevirtual   #81  <Method int ArrayList.size()>
	//   50  102:icmpge          139
		int l = i;
	//   51  105:iload_2         
	//   52  106:istore          5
		if(((ReceiverRecord)arraylist1.get(i)).receiver != broadcastreceiver)
			break MISSING_BLOCK_LABEL_183;
	//   53  108:aload           10
	//   54  110:iload_2         
	//   55  111:invokevirtual   #95  <Method Object ArrayList.get(int)>
	//   56  114:checkcast       #11  <Class LocalBroadcastManager$ReceiverRecord>
	//   57  117:getfield        #99  <Field BroadcastReceiver LocalBroadcastManager$ReceiverRecord.receiver>
	//   58  120:aload_1         
	//   59  121:if_acmpne       183
		arraylist1.remove(i);
	//   60  124:aload           10
	//   61  126:iload_2         
	//   62  127:invokevirtual   #260 <Method Object ArrayList.remove(int)>
	//   63  130:pop             
		l = i - 1;
	//   64  131:iload_2         
	//   65  132:iconst_1        
	//   66  133:isub            
	//   67  134:istore          5
		break MISSING_BLOCK_LABEL_183;
	//   68  136:goto            183
		if(arraylist1.size() <= 0)
	//*  69  139:aload           10
	//*  70  141:invokevirtual   #81  <Method int ArrayList.size()>
	//*  71  144:ifgt            157
			mActions.remove(((Object) (s)));
	//   72  147:aload_0         
	//   73  148:getfield        #54  <Field HashMap mActions>
	//   74  151:aload           9
	//   75  153:invokevirtual   #258 <Method Object HashMap.remove(Object)>
	//   76  156:pop             
_L6:
		k++;
	//   77  157:iload           4
	//   78  159:iconst_1        
	//   79  160:iadd            
	//   80  161:istore          4
		  goto _L7
	//*  81  163:goto            56
_L4:
		j++;
	//   82  166:iload_3         
	//   83  167:iconst_1        
	//   84  168:iadd            
	//   85  169:istore_3        
		  goto _L8
	//*  86  170:goto            33
_L2:
		hashmap;
	//   87  173:aload           6
		JVM INSTR monitorexit ;
	//   88  175:monitorexit     
		return;
	//   89  176:return          
		broadcastreceiver;
	//   90  177:astore_1        
	//*  91  178:aload           6
		throw broadcastreceiver;
	//   92  180:monitorexit     
	//   93  181:aload_1         
	//   94  182:athrow          
		i = l + 1;
	//   95  183:iload           5
	//   96  185:iconst_1        
	//   97  186:iadd            
	//   98  187:istore_2        
		  goto _L9
	//*  99  188:goto            96
	}

	private static final boolean DEBUG = false;
	static final int MSG_EXEC_PENDING_BROADCASTS = 1;
	private static final String TAG = "LocalBroadcastManager";
	private static LocalBroadcastManager mInstance;
	private static final Object mLock = new Object();
	private final HashMap mActions = new HashMap();
	private final Context mAppContext;
	private final Handler mHandler;
	private final ArrayList mPendingBroadcasts = new ArrayList();
	private final HashMap mReceivers = new HashMap();

	static 
	{
	//    0    0:new             #4   <Class Object>
	//    1    3:dup             
	//    2    4:invokespecial   #43  <Method void Object()>
	//    3    7:putstatic       #45  <Field Object mLock>
	//*   4   10:return          
	}


/*
	static void access$000(LocalBroadcastManager localbroadcastmanager)
	{
		localbroadcastmanager.executePendingBroadcasts();
	//    0    0:aload_0         
	//    1    1:invokespecial   #77  <Method void executePendingBroadcasts()>
		return;
	//    2    4:return          
	}

*/
}

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
	private static final class BroadcastRecord
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

	private static final class ReceiverRecord
	{

		public String toString()
		{
			StringBuilder stringbuilder = new StringBuilder(128);
		//    0    0:new             #28  <Class StringBuilder>
		//    1    3:dup             
		//    2    4:sipush          128
		//    3    7:invokespecial   #31  <Method void StringBuilder(int)>
		//    4   10:astore_1        
			stringbuilder.append("Receiver{");
		//    5   11:aload_1         
		//    6   12:ldc1            #33  <String "Receiver{">
		//    7   14:invokevirtual   #37  <Method StringBuilder StringBuilder.append(String)>
		//    8   17:pop             
			stringbuilder.append(((Object) (receiver)));
		//    9   18:aload_1         
		//   10   19:aload_0         
		//   11   20:getfield        #23  <Field BroadcastReceiver receiver>
		//   12   23:invokevirtual   #40  <Method StringBuilder StringBuilder.append(Object)>
		//   13   26:pop             
			stringbuilder.append(" filter=");
		//   14   27:aload_1         
		//   15   28:ldc1            #42  <String " filter=">
		//   16   30:invokevirtual   #37  <Method StringBuilder StringBuilder.append(String)>
		//   17   33:pop             
			stringbuilder.append(((Object) (filter)));
		//   18   34:aload_1         
		//   19   35:aload_0         
		//   20   36:getfield        #21  <Field IntentFilter filter>
		//   21   39:invokevirtual   #40  <Method StringBuilder StringBuilder.append(Object)>
		//   22   42:pop             
			if(dead)
		//*  23   43:aload_0         
		//*  24   44:getfield        #44  <Field boolean dead>
		//*  25   47:ifeq            57
				stringbuilder.append(" DEAD");
		//   26   50:aload_1         
		//   27   51:ldc1            #46  <String " DEAD">
		//   28   53:invokevirtual   #37  <Method StringBuilder StringBuilder.append(String)>
		//   29   56:pop             
			stringbuilder.append("}");
		//   30   57:aload_1         
		//   31   58:ldc1            #48  <String "}">
		//   32   60:invokevirtual   #37  <Method StringBuilder StringBuilder.append(String)>
		//   33   63:pop             
			return stringbuilder.toString();
		//   34   64:aload_1         
		//   35   65:invokevirtual   #50  <Method String StringBuilder.toString()>
		//   36   68:areturn         
		}

		boolean broadcasting;
		boolean dead;
		final IntentFilter filter;
		final BroadcastReceiver receiver;

		ReceiverRecord(IntentFilter intentfilter, BroadcastReceiver broadcastreceiver)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #19  <Method void Object()>
			filter = intentfilter;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #21  <Field IntentFilter filter>
			receiver = broadcastreceiver;
		//    5    9:aload_0         
		//    6   10:aload_2         
		//    7   11:putfield        #23  <Field BroadcastReceiver receiver>
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
			//*   2    4:tableswitch     1 1: default 24
			//			               1 30
				default:
					super.handleMessage(message);
			//    3   24:aload_0         
			//    4   25:aload_1         
			//    5   26:invokespecial   #28  <Method void Handler.handleMessage(Message)>
					return;
			//    6   29:return          

				case 1: // '\001'
					executePendingBroadcasts();
			//    7   30:aload_0         
			//    8   31:getfield        #14  <Field LocalBroadcastManager this$0>
			//    9   34:invokestatic    #32  <Method void LocalBroadcastManager.access$000(LocalBroadcastManager)>
					break;
				}
			//   10   37:return          
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
_L4:
		Object obj = ((Object) (mReceivers));
	//    0    0:aload_0         
	//    1    1:getfield        #52  <Field HashMap mReceivers>
	//    2    4:astore          5
		obj;
	//    3    6:aload           5
		JVM INSTR monitorenter ;
	//    4    8:monitorenter    
		int i = mPendingBroadcasts.size();
	//    5    9:aload_0         
	//    6   10:getfield        #59  <Field ArrayList mPendingBroadcasts>
	//    7   13:invokevirtual   #81  <Method int ArrayList.size()>
	//    8   16:istore_1        
		if(i > 0)
			break MISSING_BLOCK_LABEL_25;
	//    9   17:iload_1         
	//   10   18:ifgt            25
		obj;
	//   11   21:aload           5
		JVM INSTR monitorexit ;
	//   12   23:monitorexit     
		return;
	//   13   24:return          
		BroadcastRecord abroadcastrecord[];
		abroadcastrecord = new BroadcastRecord[i];
	//   14   25:iload_1         
	//   15   26:anewarray       BroadcastRecord[]
	//   16   29:astore          4
		mPendingBroadcasts.toArray(((Object []) (abroadcastrecord)));
	//   17   31:aload_0         
	//   18   32:getfield        #59  <Field ArrayList mPendingBroadcasts>
	//   19   35:aload           4
	//   20   37:invokevirtual   #85  <Method Object[] ArrayList.toArray(Object[])>
	//   21   40:pop             
		mPendingBroadcasts.clear();
	//   22   41:aload_0         
	//   23   42:getfield        #59  <Field ArrayList mPendingBroadcasts>
	//   24   45:invokevirtual   #88  <Method void ArrayList.clear()>
		obj;
	//   25   48:aload           5
		JVM INSTR monitorexit ;
	//   26   50:monitorexit     
		i = 0;
	//   27   51:iconst_0        
	//   28   52:istore_1        
_L2:
		if(i < abroadcastrecord.length)
	//*  29   53:iload_1         
	//*  30   54:aload           4
	//*  31   56:arraylength     
	//*  32   57:icmpge          0
		{
			obj = ((Object) (abroadcastrecord[i]));
	//   33   60:aload           4
	//   34   62:iload_1         
	//   35   63:aaload          
	//   36   64:astore          5
			int k = ((BroadcastRecord) (obj)).receivers.size();
	//   37   66:aload           5
	//   38   68:getfield        #91  <Field ArrayList LocalBroadcastManager$BroadcastRecord.receivers>
	//   39   71:invokevirtual   #81  <Method int ArrayList.size()>
	//   40   74:istore_3        
			for(int j = 0; j < k; j++)
	//*  41   75:iconst_0        
	//*  42   76:istore_2        
	//*  43   77:iload_2         
	//*  44   78:iload_3         
	//*  45   79:icmpge          136
			{
				ReceiverRecord receiverrecord = (ReceiverRecord)((BroadcastRecord) (obj)).receivers.get(j);
	//   46   82:aload           5
	//   47   84:getfield        #91  <Field ArrayList LocalBroadcastManager$BroadcastRecord.receivers>
	//   48   87:iload_2         
	//   49   88:invokevirtual   #95  <Method Object ArrayList.get(int)>
	//   50   91:checkcast       #11  <Class LocalBroadcastManager$ReceiverRecord>
	//   51   94:astore          6
				if(!receiverrecord.dead)
	//*  52   96:aload           6
	//*  53   98:getfield        #98  <Field boolean LocalBroadcastManager$ReceiverRecord.dead>
	//*  54  101:ifne            121
					receiverrecord.receiver.onReceive(mAppContext, ((BroadcastRecord) (obj)).intent);
	//   55  104:aload           6
	//   56  106:getfield        #102 <Field BroadcastReceiver LocalBroadcastManager$ReceiverRecord.receiver>
	//   57  109:aload_0         
	//   58  110:getfield        #61  <Field Context mAppContext>
	//   59  113:aload           5
	//   60  115:getfield        #106 <Field Intent LocalBroadcastManager$BroadcastRecord.intent>
	//   61  118:invokevirtual   #112 <Method void BroadcastReceiver.onReceive(Context, Intent)>
			}

	//   62  121:iload_2         
	//   63  122:iconst_1        
	//   64  123:iadd            
	//   65  124:istore_2        
			break MISSING_BLOCK_LABEL_136;
	//   66  125:goto            77
		}
		continue; /* Loop/switch isn't completed */
		Exception exception;
		exception;
	//   67  128:astore          4
		obj;
	//   68  130:aload           5
		JVM INSTR monitorexit ;
	//   69  132:monitorexit     
		throw exception;
	//   70  133:aload           4
	//   71  135:athrow          
		i++;
	//   72  136:iload_1         
	//   73  137:iconst_1        
	//   74  138:iadd            
	//   75  139:istore_1        
		if(true) goto _L2; else goto _L1
_L1:
		if(true) goto _L4; else goto _L3
_L3:
	//*  76  140:goto            53
	}

	public static LocalBroadcastManager getInstance(Context context)
	{
		synchronized(mLock)
	//*   0    0:getstatic       #45  <Field Object mLock>
	//*   1    3:astore_1        
	//*   2    4:aload_1         
	//*   3    5:monitorenter    
		{
			if(mInstance == null)
	//*   4    6:getstatic       #116 <Field LocalBroadcastManager mInstance>
	//*   5    9:ifnonnull       26
				mInstance = new LocalBroadcastManager(context.getApplicationContext());
	//    6   12:new             #2   <Class LocalBroadcastManager>
	//    7   15:dup             
	//    8   16:aload_0         
	//    9   17:invokevirtual   #120 <Method Context Context.getApplicationContext()>
	//   10   20:invokespecial   #122 <Method void LocalBroadcastManager(Context)>
	//   11   23:putstatic       #116 <Field LocalBroadcastManager mInstance>
			context = ((Context) (mInstance));
	//   12   26:getstatic       #116 <Field LocalBroadcastManager mInstance>
	//   13   29:astore_0        
		}
	//   14   30:aload_1         
	//   15   31:monitorexit     
		return ((LocalBroadcastManager) (context));
	//   16   32:aload_0         
	//   17   33:areturn         
		context;
	//   18   34:astore_0        
		obj;
	//   19   35:aload_1         
		JVM INSTR monitorexit ;
	//   20   36:monitorexit     
		throw context;
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
	//    9   15:invokespecial   #127 <Method void LocalBroadcastManager$ReceiverRecord(IntentFilter, BroadcastReceiver)>
	//   10   18:astore          7
		obj = ((Object) ((ArrayList)mReceivers.get(((Object) (broadcastreceiver)))));
	//   11   20:aload_0         
	//   12   21:getfield        #52  <Field HashMap mReceivers>
	//   13   24:aload_1         
	//   14   25:invokevirtual   #130 <Method Object HashMap.get(Object)>
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
	//   24   47:invokespecial   #133 <Method void ArrayList(int)>
	//   25   50:astore          4
		mReceivers.put(((Object) (broadcastreceiver)), ((Object) (arraylist)));
	//   26   52:aload_0         
	//   27   53:getfield        #52  <Field HashMap mReceivers>
	//   28   56:aload_1         
	//   29   57:aload           4
	//   30   59:invokevirtual   #137 <Method Object HashMap.put(Object, Object)>
	//   31   62:pop             
		arraylist.add(((Object) (receiverrecord)));
	//   32   63:aload           4
	//   33   65:aload           7
	//   34   67:invokevirtual   #141 <Method boolean ArrayList.add(Object)>
	//   35   70:pop             
		int i = 0;
	//   36   71:iconst_0        
	//   37   72:istore_3        
_L2:
		if(i >= intentfilter.countActions())
			break; /* Loop/switch isn't completed */
	//   38   73:iload_3         
	//   39   74:aload_2         
	//   40   75:invokevirtual   #146 <Method int IntentFilter.countActions()>
	//   41   78:icmpge          144
		obj = ((Object) (intentfilter.getAction(i)));
	//   42   81:aload_2         
	//   43   82:iload_3         
	//   44   83:invokevirtual   #150 <Method String IntentFilter.getAction(int)>
	//   45   86:astore          5
		arraylist = (ArrayList)mActions.get(obj);
	//   46   88:aload_0         
	//   47   89:getfield        #54  <Field HashMap mActions>
	//   48   92:aload           5
	//   49   94:invokevirtual   #130 <Method Object HashMap.get(Object)>
	//   50   97:checkcast       #56  <Class ArrayList>
	//   51  100:astore          4
		broadcastreceiver = ((BroadcastReceiver) (arraylist));
	//   52  102:aload           4
	//   53  104:astore_1        
		if(arraylist != null)
			break MISSING_BLOCK_LABEL_130;
	//   54  105:aload           4
	//   55  107:ifnonnull       130
		broadcastreceiver = ((BroadcastReceiver) (new ArrayList(1)));
	//   56  110:new             #56  <Class ArrayList>
	//   57  113:dup             
	//   58  114:iconst_1        
	//   59  115:invokespecial   #133 <Method void ArrayList(int)>
	//   60  118:astore_1        
		mActions.put(obj, ((Object) (broadcastreceiver)));
	//   61  119:aload_0         
	//   62  120:getfield        #54  <Field HashMap mActions>
	//   63  123:aload           5
	//   64  125:aload_1         
	//   65  126:invokevirtual   #137 <Method Object HashMap.put(Object, Object)>
	//   66  129:pop             
		((ArrayList) (broadcastreceiver)).add(((Object) (receiverrecord)));
	//   67  130:aload_1         
	//   68  131:aload           7
	//   69  133:invokevirtual   #141 <Method boolean ArrayList.add(Object)>
	//   70  136:pop             
		i++;
	//   71  137:iload_3         
	//   72  138:iconst_1        
	//   73  139:iadd            
	//   74  140:istore_3        
		if(true) goto _L2; else goto _L1
	//   75  141:goto            73
_L1:
		hashmap;
	//   76  144:aload           6
		JVM INSTR monitorexit ;
	//   77  146:monitorexit     
		return;
	//   78  147:return          
		broadcastreceiver;
	//   79  148:astore_1        
		hashmap;
	//   80  149:aload           6
		JVM INSTR monitorexit ;
	//   81  151:monitorexit     
		throw broadcastreceiver;
	//   82  152:aload_1         
	//   83  153:athrow          
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
	//    6   10:invokevirtual   #157 <Method String Intent.getAction()>
	//    7   13:astore          8
		s1 = intent.resolveTypeIfNeeded(mAppContext.getContentResolver());
	//    8   15:aload_1         
	//    9   16:aload_0         
	//   10   17:getfield        #61  <Field Context mAppContext>
	//   11   20:invokevirtual   #161 <Method android.content.ContentResolver Context.getContentResolver()>
	//   12   23:invokevirtual   #165 <Method String Intent.resolveTypeIfNeeded(android.content.ContentResolver)>
	//   13   26:astore          9
		uri = intent.getData();
	//   14   28:aload_1         
	//   15   29:invokevirtual   #169 <Method android.net.Uri Intent.getData()>
	//   16   32:astore          10
		s2 = intent.getScheme();
	//   17   34:aload_1         
	//   18   35:invokevirtual   #172 <Method String Intent.getScheme()>
	//   19   38:astore          11
		set = intent.getCategories();
	//   20   40:aload_1         
	//   21   41:invokevirtual   #176 <Method java.util.Set Intent.getCategories()>
	//   22   44:astore          12
		int i;
		Object obj;
		Object obj1;
		int j;
		int k;
		ArrayList arraylist;
		ReceiverRecord receiverrecord;
		if((intent.getFlags() & 8) != 0)
	//*  23   46:aload_1         
	//*  24   47:invokevirtual   #179 <Method int Intent.getFlags()>
	//*  25   50:bipush          8
	//*  26   52:iand            
	//*  27   53:ifeq            521
			i = 1;
	//   28   56:iconst_1        
	//   29   57:istore_2        
		else
	//*  30   58:iload_2         
	//*  31   59:ifeq            107
	//*  32   62:ldc1            #22  <String "LocalBroadcastManager">
	//*  33   64:new             #181 <Class StringBuilder>
	//*  34   67:dup             
	//*  35   68:invokespecial   #182 <Method void StringBuilder()>
	//*  36   71:ldc1            #184 <String "Resolving type ">
	//*  37   73:invokevirtual   #188 <Method StringBuilder StringBuilder.append(String)>
	//*  38   76:aload           9
	//*  39   78:invokevirtual   #188 <Method StringBuilder StringBuilder.append(String)>
	//*  40   81:ldc1            #190 <String " scheme ">
	//*  41   83:invokevirtual   #188 <Method StringBuilder StringBuilder.append(String)>
	//*  42   86:aload           11
	//*  43   88:invokevirtual   #188 <Method StringBuilder StringBuilder.append(String)>
	//*  44   91:ldc1            #192 <String " of intent ">
	//*  45   93:invokevirtual   #188 <Method StringBuilder StringBuilder.append(String)>
	//*  46   96:aload_1         
	//*  47   97:invokevirtual   #195 <Method StringBuilder StringBuilder.append(Object)>
	//*  48  100:invokevirtual   #198 <Method String StringBuilder.toString()>
	//*  49  103:invokestatic    #204 <Method int Log.v(String, String)>
	//*  50  106:pop             
	//*  51  107:aload_0         
	//*  52  108:getfield        #54  <Field HashMap mActions>
	//*  53  111:aload_1         
	//*  54  112:invokevirtual   #157 <Method String Intent.getAction()>
	//*  55  115:invokevirtual   #130 <Method Object HashMap.get(Object)>
	//*  56  118:checkcast       #56  <Class ArrayList>
	//*  57  121:astore          13
	//*  58  123:aload           13
	//*  59  125:ifnull          497
	//*  60  128:iload_2         
	//*  61  129:ifeq            502
	//*  62  132:ldc1            #22  <String "LocalBroadcastManager">
	//*  63  134:new             #181 <Class StringBuilder>
	//*  64  137:dup             
	//*  65  138:invokespecial   #182 <Method void StringBuilder()>
	//*  66  141:ldc1            #206 <String "Action list: ">
	//*  67  143:invokevirtual   #188 <Method StringBuilder StringBuilder.append(String)>
	//*  68  146:aload           13
	//*  69  148:invokevirtual   #195 <Method StringBuilder StringBuilder.append(Object)>
	//*  70  151:invokevirtual   #198 <Method String StringBuilder.toString()>
	//*  71  154:invokestatic    #204 <Method int Log.v(String, String)>
	//*  72  157:pop             
	//*  73  158:goto            502
	//*  74  161:iload_3         
	//*  75  162:aload           13
	//*  76  164:invokevirtual   #81  <Method int ArrayList.size()>
	//*  77  167:icmpge          554
	//*  78  170:aload           13
	//*  79  172:iload_3         
	//*  80  173:invokevirtual   #95  <Method Object ArrayList.get(int)>
	//*  81  176:checkcast       #11  <Class LocalBroadcastManager$ReceiverRecord>
	//*  82  179:astore          14
	//*  83  181:iload_2         
	//*  84  182:ifeq            214
	//*  85  185:ldc1            #22  <String "LocalBroadcastManager">
	//*  86  187:new             #181 <Class StringBuilder>
	//*  87  190:dup             
	//*  88  191:invokespecial   #182 <Method void StringBuilder()>
	//*  89  194:ldc1            #208 <String "Matching against filter ">
	//*  90  196:invokevirtual   #188 <Method StringBuilder StringBuilder.append(String)>
	//*  91  199:aload           14
	//*  92  201:getfield        #212 <Field IntentFilter LocalBroadcastManager$ReceiverRecord.filter>
	//*  93  204:invokevirtual   #195 <Method StringBuilder StringBuilder.append(Object)>
	//*  94  207:invokevirtual   #198 <Method String StringBuilder.toString()>
	//*  95  210:invokestatic    #204 <Method int Log.v(String, String)>
	//*  96  213:pop             
	//*  97  214:aload           14
	//*  98  216:getfield        #215 <Field boolean LocalBroadcastManager$ReceiverRecord.broadcasting>
	//*  99  219:ifeq            245
	//* 100  222:aload           6
	//* 101  224:astore          5
	//* 102  226:iload_2         
	//* 103  227:ifeq            510
	//* 104  230:ldc1            #22  <String "LocalBroadcastManager">
	//* 105  232:ldc1            #217 <String "  Filter's target already added">
	//* 106  234:invokestatic    #204 <Method int Log.v(String, String)>
	//* 107  237:pop             
	//* 108  238:aload           6
	//* 109  240:astore          5
	//* 110  242:goto            510
	//* 111  245:aload           14
	//* 112  247:getfield        #212 <Field IntentFilter LocalBroadcastManager$ReceiverRecord.filter>
	//* 113  250:aload           8
	//* 114  252:aload           9
	//* 115  254:aload           11
	//* 116  256:aload           10
	//* 117  258:aload           12
	//* 118  260:ldc1            #22  <String "LocalBroadcastManager">
	//* 119  262:invokevirtual   #221 <Method int IntentFilter.match(String, String, String, android.net.Uri, java.util.Set, String)>
	//* 120  265:istore          4
	//* 121  267:iload           4
	//* 122  269:iflt            346
	//* 123  272:iload_2         
	//* 124  273:ifeq            305
	//* 125  276:ldc1            #22  <String "LocalBroadcastManager">
	//* 126  278:new             #181 <Class StringBuilder>
	//* 127  281:dup             
	//* 128  282:invokespecial   #182 <Method void StringBuilder()>
	//* 129  285:ldc1            #223 <String "  Filter matched!  match=0x">
	//* 130  287:invokevirtual   #188 <Method StringBuilder StringBuilder.append(String)>
	//* 131  290:iload           4
	//* 132  292:invokestatic    #228 <Method String Integer.toHexString(int)>
	//* 133  295:invokevirtual   #188 <Method StringBuilder StringBuilder.append(String)>
	//* 134  298:invokevirtual   #198 <Method String StringBuilder.toString()>
	//* 135  301:invokestatic    #204 <Method int Log.v(String, String)>
	//* 136  304:pop             
	//* 137  305:aload           6
	//* 138  307:astore          5
	//* 139  309:aload           6
	//* 140  311:ifnonnull       323
	//* 141  314:new             #56  <Class ArrayList>
	//* 142  317:dup             
	//* 143  318:invokespecial   #57  <Method void ArrayList()>
	//* 144  321:astore          5
	//* 145  323:aload           5
	//* 146  325:aload           14
	//* 147  327:invokevirtual   #141 <Method boolean ArrayList.add(Object)>
	//* 148  330:pop             
	//* 149  331:aload           14
	//* 150  333:iconst_1        
	//* 151  334:putfield        #215 <Field boolean LocalBroadcastManager$ReceiverRecord.broadcasting>
	//* 152  337:goto            510
	//* 153  340:astore_1        
	//* 154  341:aload           7
	//* 155  343:monitorexit     
	//* 156  344:aload_1         
	//* 157  345:athrow          
	//* 158  346:aload           6
	//* 159  348:astore          5
	//* 160  350:iload_2         
	//* 161  351:ifeq            510
	//* 162  354:iload           4
	//* 163  356:tableswitch     -4 -1: default 388
	//	               -4 533
	//	               -3 526
	//	               -2 540
	//	               -1 547
	//* 164  388:ldc1            #230 <String "unknown reason">
	//* 165  390:astore          5
	//* 166  392:ldc1            #22  <String "LocalBroadcastManager">
	//* 167  394:new             #181 <Class StringBuilder>
	//* 168  397:dup             
	//* 169  398:invokespecial   #182 <Method void StringBuilder()>
	//* 170  401:ldc1            #232 <String "  Filter did not match: ">
	//* 171  403:invokevirtual   #188 <Method StringBuilder StringBuilder.append(String)>
	//* 172  406:aload           5
	//* 173  408:invokevirtual   #188 <Method StringBuilder StringBuilder.append(String)>
	//* 174  411:invokevirtual   #198 <Method String StringBuilder.toString()>
	//* 175  414:invokestatic    #204 <Method int Log.v(String, String)>
	//* 176  417:pop             
	//* 177  418:aload           6
	//* 178  420:astore          5
	//* 179  422:goto            510
	//* 180  425:iload_2         
	//* 181  426:aload           6
	//* 182  428:invokevirtual   #81  <Method int ArrayList.size()>
	//* 183  431:icmpge          454
	//* 184  434:aload           6
	//* 185  436:iload_2         
	//* 186  437:invokevirtual   #95  <Method Object ArrayList.get(int)>
	//* 187  440:checkcast       #11  <Class LocalBroadcastManager$ReceiverRecord>
	//* 188  443:iconst_0        
	//* 189  444:putfield        #215 <Field boolean LocalBroadcastManager$ReceiverRecord.broadcasting>
	//* 190  447:iload_2         
	//* 191  448:iconst_1        
	//* 192  449:iadd            
	//* 193  450:istore_2        
	//* 194  451:goto            425
	//* 195  454:aload_0         
	//* 196  455:getfield        #59  <Field ArrayList mPendingBroadcasts>
	//* 197  458:new             #8   <Class LocalBroadcastManager$BroadcastRecord>
	//* 198  461:dup             
	//* 199  462:aload_1         
	//* 200  463:aload           6
	//* 201  465:invokespecial   #235 <Method void LocalBroadcastManager$BroadcastRecord(Intent, ArrayList)>
	//* 202  468:invokevirtual   #141 <Method boolean ArrayList.add(Object)>
	//* 203  471:pop             
	//* 204  472:aload_0         
	//* 205  473:getfield        #72  <Field Handler mHandler>
	//* 206  476:iconst_1        
	//* 207  477:invokevirtual   #241 <Method boolean Handler.hasMessages(int)>
	//* 208  480:ifne            492
	//* 209  483:aload_0         
	//* 210  484:getfield        #72  <Field Handler mHandler>
	//* 211  487:iconst_1        
	//* 212  488:invokevirtual   #244 <Method boolean Handler.sendEmptyMessage(int)>
	//* 213  491:pop             
	//* 214  492:aload           7
	//* 215  494:monitorexit     
	//* 216  495:iconst_1        
	//* 217  496:ireturn         
	//* 218  497:aload           7
	//* 219  499:monitorexit     
	//* 220  500:iconst_0        
	//* 221  501:ireturn         
	//* 222  502:aconst_null     
	//* 223  503:astore          6
	//* 224  505:iconst_0        
	//* 225  506:istore_3        
	//* 226  507:goto            161
	//* 227  510:iload_3         
	//* 228  511:iconst_1        
	//* 229  512:iadd            
	//* 230  513:istore_3        
	//* 231  514:aload           5
	//* 232  516:astore          6
	//* 233  518:goto            161
			i = 0;
	//  234  521:iconst_0        
	//  235  522:istore_2        
		if(i == 0)
			break MISSING_BLOCK_LABEL_107;
		Log.v("LocalBroadcastManager", (new StringBuilder()).append("Resolving type ").append(s1).append(" scheme ").append(s2).append(" of intent ").append(((Object) (intent))).toString());
		arraylist = (ArrayList)mActions.get(((Object) (intent.getAction())));
		if(arraylist == null) goto _L2; else goto _L1
_L1:
		if(i == 0) goto _L4; else goto _L3
_L3:
		Log.v("LocalBroadcastManager", (new StringBuilder()).append("Action list: ").append(((Object) (arraylist))).toString());
		  goto _L4
_L20:
		if(j >= arraylist.size()) goto _L6; else goto _L5
_L5:
		receiverrecord = (ReceiverRecord)arraylist.get(j);
		if(i == 0)
			break MISSING_BLOCK_LABEL_214;
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
			break MISSING_BLOCK_LABEL_305;
		Log.v("LocalBroadcastManager", (new StringBuilder()).append("  Filter matched!  match=0x").append(Integer.toHexString(k)).toString());
		obj = obj1;
		if(obj1 != null)
			break MISSING_BLOCK_LABEL_323;
		obj = ((Object) (new ArrayList()));
		((ArrayList) (obj)).add(((Object) (receiverrecord)));
		receiverrecord.broadcasting = true;
		  goto _L10
		intent;
		hashmap;
		JVM INSTR monitorexit ;
		throw intent;
_L12:
		obj = obj1;
		if(i == 0) goto _L10; else goto _L13
_L13:
		k;
		JVM INSTR tableswitch -4 -1: default 388
	//	               -4 533
	//	               -3 526
	//	               -2 540
	//	               -1 547;
		   goto _L14 _L15 _L16 _L17 _L18
_L14:
		obj = "unknown reason";
_L21:
		Log.v("LocalBroadcastManager", (new StringBuilder()).append("  Filter did not match: ").append(((String) (obj))).toString());
		obj = obj1;
		  goto _L10
_L19:
		if(i >= ((ArrayList) (obj1)).size())
			break MISSING_BLOCK_LABEL_454;
		((ReceiverRecord)((ArrayList) (obj1)).get(i)).broadcasting = false;
		i++;
		  goto _L19
		mPendingBroadcasts.add(((Object) (new BroadcastRecord(intent, ((ArrayList) (obj1))))));
		if(!mHandler.hasMessages(1))
			mHandler.sendEmptyMessage(1);
		hashmap;
		JVM INSTR monitorexit ;
		return true;
_L2:
		hashmap;
		JVM INSTR monitorexit ;
		return false;
_L4:
		obj1 = null;
		j = 0;
		  goto _L20
_L10:
		j++;
		obj1 = obj;
		  goto _L20
	//* 236  523:goto            58
_L16:
		obj = "action";
	//  237  526:ldc1            #246 <String "action">
	//  238  528:astore          5
		  goto _L21
	//* 239  530:goto            392
_L15:
		obj = "category";
	//  240  533:ldc1            #248 <String "category">
	//  241  535:astore          5
		  goto _L21
	//* 242  537:goto            392
_L17:
		obj = "data";
	//  243  540:ldc1            #250 <String "data">
	//  244  542:astore          5
		  goto _L21
	//* 245  544:goto            392
_L18:
		obj = "type";
	//  246  547:ldc1            #252 <String "type">
	//  247  549:astore          5
		  goto _L21
	//* 248  551:goto            392
_L6:
		if(obj1 == null) goto _L2; else goto _L22
	//  249  554:aload           6
	//  250  556:ifnull          497
_L22:
		i = 0;
	//  251  559:iconst_0        
	//  252  560:istore_2        
		  goto _L19
	//* 253  561:goto            425
	}

	public void sendBroadcastSync(Intent intent)
	{
		if(sendBroadcast(intent))
	//*   0    0:aload_0         
	//*   1    1:aload_1         
	//*   2    2:invokevirtual   #256 <Method boolean sendBroadcast(Intent)>
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
	//    2    4:astore          5
		hashmap;
	//    3    6:aload           5
		JVM INSTR monitorenter ;
	//    4    8:monitorenter    
		ArrayList arraylist = (ArrayList)mReceivers.remove(((Object) (broadcastreceiver)));
	//    5    9:aload_0         
	//    6   10:getfield        #52  <Field HashMap mReceivers>
	//    7   13:aload_1         
	//    8   14:invokevirtual   #261 <Method Object HashMap.remove(Object)>
	//    9   17:checkcast       #56  <Class ArrayList>
	//   10   20:astore          6
		if(arraylist != null)
			break MISSING_BLOCK_LABEL_31;
	//   11   22:aload           6
	//   12   24:ifnonnull       31
		hashmap;
	//   13   27:aload           5
		JVM INSTR monitorexit ;
	//   14   29:monitorexit     
		return;
	//   15   30:return          
		int i = arraylist.size() - 1;
	//   16   31:aload           6
	//   17   33:invokevirtual   #81  <Method int ArrayList.size()>
	//   18   36:iconst_1        
	//   19   37:isub            
	//   20   38:istore_2        
_L12:
		if(i < 0) goto _L2; else goto _L1
	//   21   39:iload_2         
	//   22   40:iflt            177
_L1:
		ReceiverRecord receiverrecord;
		receiverrecord = (ReceiverRecord)arraylist.get(i);
	//   23   43:aload           6
	//   24   45:iload_2         
	//   25   46:invokevirtual   #95  <Method Object ArrayList.get(int)>
	//   26   49:checkcast       #11  <Class LocalBroadcastManager$ReceiverRecord>
	//   27   52:astore          7
		receiverrecord.dead = true;
	//   28   54:aload           7
	//   29   56:iconst_1        
	//   30   57:putfield        #98  <Field boolean LocalBroadcastManager$ReceiverRecord.dead>
		int j = 0;
	//   31   60:iconst_0        
	//   32   61:istore_3        
_L10:
		String s;
		ArrayList arraylist1;
		if(j >= receiverrecord.filter.countActions())
			break; /* Loop/switch isn't completed */
	//   33   62:iload_3         
	//   34   63:aload           7
	//   35   65:getfield        #212 <Field IntentFilter LocalBroadcastManager$ReceiverRecord.filter>
	//   36   68:invokevirtual   #146 <Method int IntentFilter.countActions()>
	//   37   71:icmpge          203
		s = receiverrecord.filter.getAction(j);
	//   38   74:aload           7
	//   39   76:getfield        #212 <Field IntentFilter LocalBroadcastManager$ReceiverRecord.filter>
	//   40   79:iload_3         
	//   41   80:invokevirtual   #150 <Method String IntentFilter.getAction(int)>
	//   42   83:astore          8
		arraylist1 = (ArrayList)mActions.get(((Object) (s)));
	//   43   85:aload_0         
	//   44   86:getfield        #54  <Field HashMap mActions>
	//   45   89:aload           8
	//   46   91:invokevirtual   #130 <Method Object HashMap.get(Object)>
	//   47   94:checkcast       #56  <Class ArrayList>
	//   48   97:astore          9
		if(arraylist1 == null) goto _L4; else goto _L3
	//   49   99:aload           9
	//   50  101:ifnull          196
_L3:
		int k = arraylist1.size() - 1;
	//   51  104:aload           9
	//   52  106:invokevirtual   #81  <Method int ArrayList.size()>
	//   53  109:iconst_1        
	//   54  110:isub            
	//   55  111:istore          4
_L8:
		if(k < 0) goto _L6; else goto _L5
	//   56  113:iload           4
	//   57  115:iflt            156
_L5:
		ReceiverRecord receiverrecord1 = (ReceiverRecord)arraylist1.get(k);
	//   58  118:aload           9
	//   59  120:iload           4
	//   60  122:invokevirtual   #95  <Method Object ArrayList.get(int)>
	//   61  125:checkcast       #11  <Class LocalBroadcastManager$ReceiverRecord>
	//   62  128:astore          10
		if(receiverrecord1.receiver == broadcastreceiver)
	//*  63  130:aload           10
	//*  64  132:getfield        #102 <Field BroadcastReceiver LocalBroadcastManager$ReceiverRecord.receiver>
	//*  65  135:aload_1         
	//*  66  136:if_acmpne       187
		{
			receiverrecord1.dead = true;
	//   67  139:aload           10
	//   68  141:iconst_1        
	//   69  142:putfield        #98  <Field boolean LocalBroadcastManager$ReceiverRecord.dead>
			arraylist1.remove(k);
	//   70  145:aload           9
	//   71  147:iload           4
	//   72  149:invokevirtual   #263 <Method Object ArrayList.remove(int)>
	//   73  152:pop             
		}
		  goto _L7
	//*  74  153:goto            187
_L6:
		if(arraylist1.size() <= 0)
	//*  75  156:aload           9
	//*  76  158:invokevirtual   #81  <Method int ArrayList.size()>
	//*  77  161:ifgt            196
			mActions.remove(((Object) (s)));
	//   78  164:aload_0         
	//   79  165:getfield        #54  <Field HashMap mActions>
	//   80  168:aload           8
	//   81  170:invokevirtual   #261 <Method Object HashMap.remove(Object)>
	//   82  173:pop             
		break; /* Loop/switch isn't completed */
	//   83  174:goto            196
_L2:
		hashmap;
	//   84  177:aload           5
		JVM INSTR monitorexit ;
	//   85  179:monitorexit     
		return;
	//   86  180:return          
		broadcastreceiver;
	//   87  181:astore_1        
		hashmap;
	//   88  182:aload           5
		JVM INSTR monitorexit ;
	//   89  184:monitorexit     
		throw broadcastreceiver;
	//   90  185:aload_1         
	//   91  186:athrow          
_L7:
		k--;
	//   92  187:iload           4
	//   93  189:iconst_1        
	//   94  190:isub            
	//   95  191:istore          4
		if(true) goto _L8; else goto _L4
	//   96  193:goto            113
_L4:
		j++;
	//   97  196:iload_3         
	//   98  197:iconst_1        
	//   99  198:iadd            
	//  100  199:istore_3        
		if(true) goto _L10; else goto _L9
	//  101  200:goto            62
_L9:
		i--;
	//  102  203:iload_2         
	//  103  204:iconst_1        
	//  104  205:isub            
	//  105  206:istore_2        
		if(true) goto _L12; else goto _L11
	//  106  207:goto            39
_L11:
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

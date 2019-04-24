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
				if(message.what != 1)
			//*   0    0:aload_1         
			//*   1    1:getfield        #26  <Field int Message.what>
			//*   2    4:iconst_1        
			//*   3    5:icmpeq          14
				{
					super.handleMessage(message);
			//    4    8:aload_0         
			//    5    9:aload_1         
			//    6   10:invokespecial   #28  <Method void Handler.handleMessage(Message)>
					return;
			//    7   13:return          
				} else
				{
					executePendingBroadcasts();
			//    8   14:aload_0         
			//    9   15:getfield        #14  <Field LocalBroadcastManager this$0>
			//   10   18:invokestatic    #32  <Method void LocalBroadcastManager.access$000(LocalBroadcastManager)>
					return;
			//   11   21:return          
				}
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
_L2:
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
		int j = 0;
	//   27   51:iconst_0        
	//   28   52:istore_1        
		while(j < abroadcastrecord.length) 
	//*  29   53:iload_1         
	//*  30   54:aload           4
	//*  31   56:arraylength     
	//*  32   57:icmpge          0
		{
			obj = ((Object) (abroadcastrecord[j]));
	//   33   60:aload           4
	//   34   62:iload_1         
	//   35   63:aaload          
	//   36   64:astore          5
			int l = ((BroadcastRecord) (obj)).receivers.size();
	//   37   66:aload           5
	//   38   68:getfield        #91  <Field ArrayList LocalBroadcastManager$BroadcastRecord.receivers>
	//   39   71:invokevirtual   #81  <Method int ArrayList.size()>
	//   40   74:istore_3        
			for(int k = 0; k < l; k++)
	//*  41   75:iconst_0        
	//*  42   76:istore_2        
	//*  43   77:iload_2         
	//*  44   78:iload_3         
	//*  45   79:icmpge          128
			{
				ReceiverRecord receiverrecord = (ReceiverRecord)((BroadcastRecord) (obj)).receivers.get(k);
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
	//*  66  125:goto            77
			j++;
	//   67  128:iload_1         
	//   68  129:iconst_1        
	//   69  130:iadd            
	//   70  131:istore_1        
		}
		if(true) goto _L2; else goto _L1
	//   71  132:goto            53
_L1:
		Exception exception;
		exception;
	//   72  135:astore          4
		obj;
	//   73  137:aload           5
		JVM INSTR monitorexit ;
	//   74  139:monitorexit     
		throw exception;
	//   75  140:aload           4
	//   76  142:athrow          
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
	//*   4    6:getstatic       #117 <Field LocalBroadcastManager mInstance>
	//*   5    9:ifnonnull       26
				mInstance = new LocalBroadcastManager(context.getApplicationContext());
	//    6   12:new             #2   <Class LocalBroadcastManager>
	//    7   15:dup             
	//    8   16:aload_0         
	//    9   17:invokevirtual   #121 <Method Context Context.getApplicationContext()>
	//   10   20:invokespecial   #123 <Method void LocalBroadcastManager(Context)>
	//   11   23:putstatic       #117 <Field LocalBroadcastManager mInstance>
			context = ((Context) (mInstance));
	//   12   26:getstatic       #117 <Field LocalBroadcastManager mInstance>
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
	//    9   15:invokespecial   #130 <Method void LocalBroadcastManager$ReceiverRecord(IntentFilter, BroadcastReceiver)>
	//   10   18:astore          7
		obj = ((Object) ((ArrayList)mReceivers.get(((Object) (broadcastreceiver)))));
	//   11   20:aload_0         
	//   12   21:getfield        #52  <Field HashMap mReceivers>
	//   13   24:aload_1         
	//   14   25:invokevirtual   #133 <Method Object HashMap.get(Object)>
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
	//   24   47:invokespecial   #136 <Method void ArrayList(int)>
	//   25   50:astore          4
		mReceivers.put(((Object) (broadcastreceiver)), ((Object) (arraylist)));
	//   26   52:aload_0         
	//   27   53:getfield        #52  <Field HashMap mReceivers>
	//   28   56:aload_1         
	//   29   57:aload           4
	//   30   59:invokevirtual   #140 <Method Object HashMap.put(Object, Object)>
	//   31   62:pop             
		arraylist.add(((Object) (receiverrecord)));
	//   32   63:aload           4
	//   33   65:aload           7
	//   34   67:invokevirtual   #144 <Method boolean ArrayList.add(Object)>
	//   35   70:pop             
		int i = 0;
	//   36   71:iconst_0        
	//   37   72:istore_3        
_L2:
		if(i >= intentfilter.countActions())
			break; /* Loop/switch isn't completed */
	//   38   73:iload_3         
	//   39   74:aload_2         
	//   40   75:invokevirtual   #149 <Method int IntentFilter.countActions()>
	//   41   78:icmpge          144
		obj = ((Object) (intentfilter.getAction(i)));
	//   42   81:aload_2         
	//   43   82:iload_3         
	//   44   83:invokevirtual   #153 <Method String IntentFilter.getAction(int)>
	//   45   86:astore          5
		arraylist = (ArrayList)mActions.get(obj);
	//   46   88:aload_0         
	//   47   89:getfield        #54  <Field HashMap mActions>
	//   48   92:aload           5
	//   49   94:invokevirtual   #133 <Method Object HashMap.get(Object)>
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
	//   59  115:invokespecial   #136 <Method void ArrayList(int)>
	//   60  118:astore_1        
		mActions.put(obj, ((Object) (broadcastreceiver)));
	//   61  119:aload_0         
	//   62  120:getfield        #54  <Field HashMap mActions>
	//   63  123:aload           5
	//   64  125:aload_1         
	//   65  126:invokevirtual   #140 <Method Object HashMap.put(Object, Object)>
	//   66  129:pop             
		((ArrayList) (broadcastreceiver)).add(((Object) (receiverrecord)));
	//   67  130:aload_1         
	//   68  131:aload           7
	//   69  133:invokevirtual   #144 <Method boolean ArrayList.add(Object)>
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
	//    2    4:astore          11
		hashmap;
	//    3    6:aload           11
		JVM INSTR monitorenter ;
	//    4    8:monitorenter    
		String s;
		String s1;
		android.net.Uri uri;
		String s2;
		java.util.Set set;
		s = intent.getAction();
	//    5    9:aload_1         
	//    6   10:invokevirtual   #160 <Method String Intent.getAction()>
	//    7   13:astore          8
		s1 = intent.resolveTypeIfNeeded(mAppContext.getContentResolver());
	//    8   15:aload_1         
	//    9   16:aload_0         
	//   10   17:getfield        #61  <Field Context mAppContext>
	//   11   20:invokevirtual   #164 <Method android.content.ContentResolver Context.getContentResolver()>
	//   12   23:invokevirtual   #168 <Method String Intent.resolveTypeIfNeeded(android.content.ContentResolver)>
	//   13   26:astore          9
		uri = intent.getData();
	//   14   28:aload_1         
	//   15   29:invokevirtual   #172 <Method android.net.Uri Intent.getData()>
	//   16   32:astore          10
		s2 = intent.getScheme();
	//   17   34:aload_1         
	//   18   35:invokevirtual   #175 <Method String Intent.getScheme()>
	//   19   38:astore          12
		set = intent.getCategories();
	//   20   40:aload_1         
	//   21   41:invokevirtual   #179 <Method java.util.Set Intent.getCategories()>
	//   22   44:astore          13
		int i;
		int j;
		int k;
		Object obj;
		Object obj1;
		ArrayList arraylist;
		Object obj2;
		IntentFilter intentfilter;
		if((intent.getFlags() & 8) != 0)
	//*  23   46:aload_1         
	//*  24   47:invokevirtual   #182 <Method int Intent.getFlags()>
	//*  25   50:bipush          8
	//*  26   52:iand            
	//*  27   53:ifeq            516
			i = 1;
	//   28   56:iconst_1        
	//   29   57:istore_2        
		else
	//*  30   58:goto            61
	//*  31   61:iload_2         
	//*  32   62:ifeq            132
	//*  33   65:new             #184 <Class StringBuilder>
	//*  34   68:dup             
	//*  35   69:invokespecial   #185 <Method void StringBuilder()>
	//*  36   72:astore          5
	//*  37   74:aload           5
	//*  38   76:ldc1            #187 <String "Resolving type ">
	//*  39   78:invokevirtual   #191 <Method StringBuilder StringBuilder.append(String)>
	//*  40   81:pop             
	//*  41   82:aload           5
	//*  42   84:aload           9
	//*  43   86:invokevirtual   #191 <Method StringBuilder StringBuilder.append(String)>
	//*  44   89:pop             
	//*  45   90:aload           5
	//*  46   92:ldc1            #193 <String " scheme ">
	//*  47   94:invokevirtual   #191 <Method StringBuilder StringBuilder.append(String)>
	//*  48   97:pop             
	//*  49   98:aload           5
	//*  50  100:aload           12
	//*  51  102:invokevirtual   #191 <Method StringBuilder StringBuilder.append(String)>
	//*  52  105:pop             
	//*  53  106:aload           5
	//*  54  108:ldc1            #195 <String " of intent ">
	//*  55  110:invokevirtual   #191 <Method StringBuilder StringBuilder.append(String)>
	//*  56  113:pop             
	//*  57  114:aload           5
	//*  58  116:aload_1         
	//*  59  117:invokevirtual   #198 <Method StringBuilder StringBuilder.append(Object)>
	//*  60  120:pop             
	//*  61  121:ldc1            #22  <String "LocalBroadcastManager">
	//*  62  123:aload           5
	//*  63  125:invokevirtual   #201 <Method String StringBuilder.toString()>
	//*  64  128:invokestatic    #207 <Method int Log.v(String, String)>
	//*  65  131:pop             
	//*  66  132:aload_0         
	//*  67  133:getfield        #54  <Field HashMap mActions>
	//*  68  136:aload_1         
	//*  69  137:invokevirtual   #160 <Method String Intent.getAction()>
	//*  70  140:invokevirtual   #133 <Method Object HashMap.get(Object)>
	//*  71  143:checkcast       #56  <Class ArrayList>
	//*  72  146:astore          7
	//*  73  148:aload           7
	//*  74  150:ifnull          505
	//*  75  153:iload_2         
	//*  76  154:ifeq            521
	//*  77  157:new             #184 <Class StringBuilder>
	//*  78  160:dup             
	//*  79  161:invokespecial   #185 <Method void StringBuilder()>
	//*  80  164:astore          5
	//*  81  166:aload           5
	//*  82  168:ldc1            #209 <String "Action list: ">
	//*  83  170:invokevirtual   #191 <Method StringBuilder StringBuilder.append(String)>
	//*  84  173:pop             
	//*  85  174:aload           5
	//*  86  176:aload           7
	//*  87  178:invokevirtual   #198 <Method StringBuilder StringBuilder.append(Object)>
	//*  88  181:pop             
	//*  89  182:ldc1            #22  <String "LocalBroadcastManager">
	//*  90  184:aload           5
	//*  91  186:invokevirtual   #201 <Method String StringBuilder.toString()>
	//*  92  189:invokestatic    #207 <Method int Log.v(String, String)>
	//*  93  192:pop             
	//*  94  193:goto            521
	//*  95  196:iload_3         
	//*  96  197:aload           7
	//*  97  199:invokevirtual   #81  <Method int ArrayList.size()>
	//*  98  202:icmpge          618
	//*  99  205:aload           7
	//* 100  207:iload_3         
	//* 101  208:invokevirtual   #95  <Method Object ArrayList.get(int)>
	//* 102  211:checkcast       #11  <Class LocalBroadcastManager$ReceiverRecord>
	//* 103  214:astore          14
	//* 104  216:iload_2         
	//* 105  217:ifeq            259
	//* 106  220:new             #184 <Class StringBuilder>
	//* 107  223:dup             
	//* 108  224:invokespecial   #185 <Method void StringBuilder()>
	//* 109  227:astore          5
	//* 110  229:aload           5
	//* 111  231:ldc1            #211 <String "Matching against filter ">
	//* 112  233:invokevirtual   #191 <Method StringBuilder StringBuilder.append(String)>
	//* 113  236:pop             
	//* 114  237:aload           5
	//* 115  239:aload           14
	//* 116  241:getfield        #215 <Field IntentFilter LocalBroadcastManager$ReceiverRecord.filter>
	//* 117  244:invokevirtual   #198 <Method StringBuilder StringBuilder.append(Object)>
	//* 118  247:pop             
	//* 119  248:ldc1            #22  <String "LocalBroadcastManager">
	//* 120  250:aload           5
	//* 121  252:invokevirtual   #201 <Method String StringBuilder.toString()>
	//* 122  255:invokestatic    #207 <Method int Log.v(String, String)>
	//* 123  258:pop             
	//* 124  259:aload           14
	//* 125  261:getfield        #218 <Field boolean LocalBroadcastManager$ReceiverRecord.broadcasting>
	//* 126  264:ifeq            282
	//* 127  267:iload_2         
	//* 128  268:ifeq            529
	//* 129  271:ldc1            #22  <String "LocalBroadcastManager">
	//* 130  273:ldc1            #220 <String "  Filter's target already added">
	//* 131  275:invokestatic    #207 <Method int Log.v(String, String)>
	//* 132  278:pop             
	//* 133  279:goto            529
	//* 134  282:aload           14
	//* 135  284:getfield        #215 <Field IntentFilter LocalBroadcastManager$ReceiverRecord.filter>
	//* 136  287:astore          15
	//* 137  289:aload           6
	//* 138  291:astore          5
	//* 139  293:aload           15
	//* 140  295:aload           8
	//* 141  297:aload           9
	//* 142  299:aload           12
	//* 143  301:aload           10
	//* 144  303:aload           13
	//* 145  305:ldc1            #22  <String "LocalBroadcastManager">
	//* 146  307:invokevirtual   #224 <Method int IntentFilter.match(String, String, String, android.net.Uri, java.util.Set, String)>
	//* 147  310:istore          4
	//* 148  312:iload           4
	//* 149  314:iflt            539
	//* 150  317:iload_2         
	//* 151  318:ifeq            360
	//* 152  321:new             #184 <Class StringBuilder>
	//* 153  324:dup             
	//* 154  325:invokespecial   #185 <Method void StringBuilder()>
	//* 155  328:astore          6
	//* 156  330:aload           6
	//* 157  332:ldc1            #226 <String "  Filter matched!  match=0x">
	//* 158  334:invokevirtual   #191 <Method StringBuilder StringBuilder.append(String)>
	//* 159  337:pop             
	//* 160  338:aload           6
	//* 161  340:iload           4
	//* 162  342:invokestatic    #231 <Method String Integer.toHexString(int)>
	//* 163  345:invokevirtual   #191 <Method StringBuilder StringBuilder.append(String)>
	//* 164  348:pop             
	//* 165  349:ldc1            #22  <String "LocalBroadcastManager">
	//* 166  351:aload           6
	//* 167  353:invokevirtual   #201 <Method String StringBuilder.toString()>
	//* 168  356:invokestatic    #207 <Method int Log.v(String, String)>
	//* 169  359:pop             
	//* 170  360:aload           5
	//* 171  362:ifnonnull       532
	//* 172  365:new             #56  <Class ArrayList>
	//* 173  368:dup             
	//* 174  369:invokespecial   #57  <Method void ArrayList()>
	//* 175  372:astore          6
	//* 176  374:goto            377
	//* 177  377:aload           6
	//* 178  379:aload           14
	//* 179  381:invokevirtual   #144 <Method boolean ArrayList.add(Object)>
	//* 180  384:pop             
	//* 181  385:aload           14
	//* 182  387:iconst_1        
	//* 183  388:putfield        #218 <Field boolean LocalBroadcastManager$ReceiverRecord.broadcasting>
	//* 184  391:goto            611
	//* 185  394:new             #184 <Class StringBuilder>
	//* 186  397:dup             
	//* 187  398:invokespecial   #185 <Method void StringBuilder()>
	//* 188  401:astore          14
	//* 189  403:aload           14
	//* 190  405:ldc1            #233 <String "  Filter did not match: ">
	//* 191  407:invokevirtual   #191 <Method StringBuilder StringBuilder.append(String)>
	//* 192  410:pop             
	//* 193  411:aload           14
	//* 194  413:aload           5
	//* 195  415:invokevirtual   #191 <Method StringBuilder StringBuilder.append(String)>
	//* 196  418:pop             
	//* 197  419:ldc1            #22  <String "LocalBroadcastManager">
	//* 198  421:aload           14
	//* 199  423:invokevirtual   #201 <Method String StringBuilder.toString()>
	//* 200  426:invokestatic    #207 <Method int Log.v(String, String)>
	//* 201  429:pop             
	//* 202  430:goto            611
	//* 203  433:iload_2         
	//* 204  434:aload           6
	//* 205  436:invokevirtual   #81  <Method int ArrayList.size()>
	//* 206  439:icmpge          462
	//* 207  442:aload           6
	//* 208  444:iload_2         
	//* 209  445:invokevirtual   #95  <Method Object ArrayList.get(int)>
	//* 210  448:checkcast       #11  <Class LocalBroadcastManager$ReceiverRecord>
	//* 211  451:iconst_0        
	//* 212  452:putfield        #218 <Field boolean LocalBroadcastManager$ReceiverRecord.broadcasting>
	//* 213  455:iload_2         
	//* 214  456:iconst_1        
	//* 215  457:iadd            
	//* 216  458:istore_2        
	//* 217  459:goto            433
	//* 218  462:aload_0         
	//* 219  463:getfield        #59  <Field ArrayList mPendingBroadcasts>
	//* 220  466:new             #8   <Class LocalBroadcastManager$BroadcastRecord>
	//* 221  469:dup             
	//* 222  470:aload_1         
	//* 223  471:aload           6
	//* 224  473:invokespecial   #236 <Method void LocalBroadcastManager$BroadcastRecord(Intent, ArrayList)>
	//* 225  476:invokevirtual   #144 <Method boolean ArrayList.add(Object)>
	//* 226  479:pop             
	//* 227  480:aload_0         
	//* 228  481:getfield        #72  <Field Handler mHandler>
	//* 229  484:iconst_1        
	//* 230  485:invokevirtual   #242 <Method boolean Handler.hasMessages(int)>
	//* 231  488:ifne            500
	//* 232  491:aload_0         
	//* 233  492:getfield        #72  <Field Handler mHandler>
	//* 234  495:iconst_1        
	//* 235  496:invokevirtual   #245 <Method boolean Handler.sendEmptyMessage(int)>
	//* 236  499:pop             
	//* 237  500:aload           11
	//* 238  502:monitorexit     
	//* 239  503:iconst_1        
	//* 240  504:ireturn         
	//* 241  505:aload           11
	//* 242  507:monitorexit     
	//* 243  508:iconst_0        
	//* 244  509:ireturn         
	//* 245  510:astore_1        
	//* 246  511:aload           11
	//* 247  513:monitorexit     
	//* 248  514:aload_1         
	//* 249  515:athrow          
			i = 0;
	//  250  516:iconst_0        
	//  251  517:istore_2        
		if(i == 0)
			break MISSING_BLOCK_LABEL_132;
		obj = ((Object) (new StringBuilder()));
		((StringBuilder) (obj)).append("Resolving type ");
		((StringBuilder) (obj)).append(s1);
		((StringBuilder) (obj)).append(" scheme ");
		((StringBuilder) (obj)).append(s2);
		((StringBuilder) (obj)).append(" of intent ");
		((StringBuilder) (obj)).append(((Object) (intent)));
		Log.v("LocalBroadcastManager", ((StringBuilder) (obj)).toString());
		arraylist = (ArrayList)mActions.get(((Object) (intent.getAction())));
		if(arraylist == null) goto _L2; else goto _L1
_L1:
		if(i == 0) goto _L4; else goto _L3
_L3:
		obj = ((Object) (new StringBuilder()));
		((StringBuilder) (obj)).append("Action list: ");
		((StringBuilder) (obj)).append(((Object) (arraylist)));
		Log.v("LocalBroadcastManager", ((StringBuilder) (obj)).toString());
		  goto _L4
_L16:
		if(j >= arraylist.size()) goto _L6; else goto _L5
_L5:
		obj2 = ((Object) ((ReceiverRecord)arraylist.get(j)));
		if(i == 0)
			break MISSING_BLOCK_LABEL_259;
		obj = ((Object) (new StringBuilder()));
		((StringBuilder) (obj)).append("Matching against filter ");
		((StringBuilder) (obj)).append(((Object) (((ReceiverRecord) (obj2)).filter)));
		Log.v("LocalBroadcastManager", ((StringBuilder) (obj)).toString());
		if(!((ReceiverRecord) (obj2)).broadcasting) goto _L8; else goto _L7
_L7:
		if(i == 0) goto _L10; else goto _L9
_L9:
		Log.v("LocalBroadcastManager", "  Filter's target already added");
		  goto _L10
_L8:
		intentfilter = ((ReceiverRecord) (obj2)).filter;
		obj = obj1;
		k = intentfilter.match(s, s1, s2, uri, set, "LocalBroadcastManager");
		if(k < 0) goto _L12; else goto _L11
_L11:
		if(i == 0)
			break MISSING_BLOCK_LABEL_360;
		obj1 = ((Object) (new StringBuilder()));
		((StringBuilder) (obj1)).append("  Filter matched!  match=0x");
		((StringBuilder) (obj1)).append(Integer.toHexString(k));
		Log.v("LocalBroadcastManager", ((StringBuilder) (obj1)).toString());
		if(obj != null) goto _L14; else goto _L13
_L13:
		obj1 = ((Object) (new ArrayList()));
_L17:
		((ArrayList) (obj1)).add(obj2);
		obj2.broadcasting = true;
		  goto _L10
_L25:
		obj2 = ((Object) (new StringBuilder()));
		((StringBuilder) (obj2)).append("  Filter did not match: ");
		((StringBuilder) (obj2)).append(((String) (obj)));
		Log.v("LocalBroadcastManager", ((StringBuilder) (obj2)).toString());
		  goto _L10
_L15:
		if(i >= ((ArrayList) (obj1)).size())
			break MISSING_BLOCK_LABEL_462;
		((ReceiverRecord)((ArrayList) (obj1)).get(i)).broadcasting = false;
		i++;
		  goto _L15
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
		intent;
		hashmap;
		JVM INSTR monitorexit ;
		throw intent;
	//* 252  518:goto            61
_L4:
		obj1 = null;
	//  253  521:aconst_null     
	//  254  522:astore          6
		j = 0;
	//  255  524:iconst_0        
	//  256  525:istore_3        
		  goto _L16
	//* 257  526:goto            196
	//* 258  529:goto            611
_L14:
		obj1 = obj;
	//  259  532:aload           5
	//  260  534:astore          6
		  goto _L17
	//* 261  536:goto            377
_L12:
		if(i == 0) goto _L10; else goto _L18
	//  262  539:iload_2         
	//  263  540:ifeq            611
_L18:
		k;
	//  264  543:iload           4
		JVM INSTR tableswitch -4 -1: default 576
	//	               -4 604
	//	               -3 597
	//	               -2 590
	//	               -1 583;
	//  265  545:tableswitch     -4 -1: default 576
	//	               -4 604
	//	               -3 597
	//	               -2 590
	//	               -1 583
		   goto _L19 _L20 _L21 _L22 _L23
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
_L19:
		obj = "unknown reason";
	//  266  576:ldc1            #247 <String "unknown reason">
	//  267  578:astore          5
		  goto _L25
	//* 268  580:goto            394
_L23:
		obj = "type";
	//  269  583:ldc1            #249 <String "type">
	//  270  585:astore          5
		  goto _L25
	//* 271  587:goto            394
_L22:
		obj = "data";
	//  272  590:ldc1            #251 <String "data">
	//  273  592:astore          5
		  goto _L25
	//* 274  594:goto            394
_L21:
		obj = "action";
	//  275  597:ldc1            #253 <String "action">
	//  276  599:astore          5
		  goto _L25
	//* 277  601:goto            394
_L20:
		obj = "category";
	//  278  604:ldc1            #255 <String "category">
	//  279  606:astore          5
		  goto _L25
	//* 280  608:goto            394
_L10:
		j++;
	//  281  611:iload_3         
	//  282  612:iconst_1        
	//  283  613:iadd            
	//  284  614:istore_3        
		  goto _L16
	//* 285  615:goto            196
_L6:
		if(obj1 == null) goto _L2; else goto _L70
	//  286  618:aload           6
	//  287  620:ifnull          505
_L70:
		i = 0;
	//  288  623:iconst_0        
	//  289  624:istore_2        
		  goto _L15
	//* 290  625:goto            433
	}

	public void sendBroadcastSync(Intent intent)
	{
		if(sendBroadcast(intent))
	//*   0    0:aload_0         
	//*   1    1:aload_1         
	//*   2    2:invokevirtual   #259 <Method boolean sendBroadcast(Intent)>
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
	//    8   14:invokevirtual   #264 <Method Object HashMap.remove(Object)>
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
	//   35   65:getfield        #215 <Field IntentFilter LocalBroadcastManager$ReceiverRecord.filter>
	//   36   68:invokevirtual   #149 <Method int IntentFilter.countActions()>
	//   37   71:icmpge          203
		s = receiverrecord.filter.getAction(j);
	//   38   74:aload           7
	//   39   76:getfield        #215 <Field IntentFilter LocalBroadcastManager$ReceiverRecord.filter>
	//   40   79:iload_3         
	//   41   80:invokevirtual   #153 <Method String IntentFilter.getAction(int)>
	//   42   83:astore          8
		arraylist1 = (ArrayList)mActions.get(((Object) (s)));
	//   43   85:aload_0         
	//   44   86:getfield        #54  <Field HashMap mActions>
	//   45   89:aload           8
	//   46   91:invokevirtual   #133 <Method Object HashMap.get(Object)>
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
	//   72  149:invokevirtual   #266 <Method Object ArrayList.remove(int)>
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
	//   81  170:invokevirtual   #264 <Method Object HashMap.remove(Object)>
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

// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.internal;

import android.os.*;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.internal.base.zal;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

// Referenced classes of package com.google.android.gms.common.internal:
//			Preconditions

public final class GmsClientEventManager
	implements android.os.Handler.Callback
{
	public static interface GmsClientEventState
	{

		public abstract Bundle getConnectionHint();

		public abstract boolean isConnected();
	}


	public GmsClientEventManager(Looper looper, GmsClientEventState gmsclienteventstate)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #32  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #34  <Class ArrayList>
	//    4    8:dup             
	//    5    9:invokespecial   #35  <Method void ArrayList()>
	//    6   12:putfield        #37  <Field ArrayList zaol>
	//    7   15:aload_0         
	//    8   16:new             #34  <Class ArrayList>
	//    9   19:dup             
	//   10   20:invokespecial   #35  <Method void ArrayList()>
	//   11   23:putfield        #39  <Field ArrayList zaom>
	//   12   26:aload_0         
	//   13   27:new             #34  <Class ArrayList>
	//   14   30:dup             
	//   15   31:invokespecial   #35  <Method void ArrayList()>
	//   16   34:putfield        #41  <Field ArrayList zaon>
		zaoo = false;
	//   17   37:aload_0         
	//   18   38:iconst_0        
	//   19   39:putfield        #43  <Field boolean zaoo>
	//   20   42:aload_0         
	//   21   43:new             #45  <Class AtomicInteger>
	//   22   46:dup             
	//   23   47:iconst_0        
	//   24   48:invokespecial   #48  <Method void AtomicInteger(int)>
	//   25   51:putfield        #50  <Field AtomicInteger zaop>
		zaoq = false;
	//   26   54:aload_0         
	//   27   55:iconst_0        
	//   28   56:putfield        #52  <Field boolean zaoq>
	//   29   59:aload_0         
	//   30   60:new             #4   <Class Object>
	//   31   63:dup             
	//   32   64:invokespecial   #32  <Method void Object()>
	//   33   67:putfield        #54  <Field Object mLock>
		zaok = gmsclienteventstate;
	//   34   70:aload_0         
	//   35   71:aload_2         
	//   36   72:putfield        #56  <Field GmsClientEventManager$GmsClientEventState zaok>
		mHandler = ((Handler) (new zal(looper, ((android.os.Handler.Callback) (this)))));
	//   37   75:aload_0         
	//   38   76:new             #58  <Class zal>
	//   39   79:dup             
	//   40   80:aload_1         
	//   41   81:aload_0         
	//   42   82:invokespecial   #61  <Method void zal(Looper, android.os.Handler$Callback)>
	//   43   85:putfield        #63  <Field Handler mHandler>
	//   44   88:return          
	}

	public final boolean areCallbacksEnabled()
	{
		return zaoo;
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field boolean zaoo>
	//    2    4:ireturn         
	}

	public final void disableCallbacks()
	{
		zaoo = false;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #43  <Field boolean zaoo>
		zaop.incrementAndGet();
	//    3    5:aload_0         
	//    4    6:getfield        #50  <Field AtomicInteger zaop>
	//    5    9:invokevirtual   #71  <Method int AtomicInteger.incrementAndGet()>
	//    6   12:pop             
	//    7   13:return          
	}

	public final void enableCallbacks()
	{
		zaoo = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #43  <Field boolean zaoo>
	//    3    5:return          
	}

	public final boolean handleMessage(Message message)
	{
		if(message.what == 1)
	//*   0    0:aload_1         
	//*   1    1:getfield        #80  <Field int Message.what>
	//*   2    4:iconst_1        
	//*   3    5:icmpne          77
		{
			com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks = (com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks)message.obj;
	//    4    8:aload_1         
	//    5    9:getfield        #83  <Field Object Message.obj>
	//    6   12:checkcast       #85  <Class com.google.android.gms.common.api.GoogleApiClient$ConnectionCallbacks>
	//    7   15:astore_3        
			synchronized(mLock)
	//*   8   16:aload_0         
	//*   9   17:getfield        #54  <Field Object mLock>
	//*  10   20:astore_1        
	//*  11   21:aload_1         
	//*  12   22:monitorenter    
			{
				if(zaoo && zaok.isConnected() && zaol.contains(((Object) (connectioncallbacks))))
	//*  13   23:aload_0         
	//*  14   24:getfield        #43  <Field boolean zaoo>
	//*  15   27:ifeq            68
	//*  16   30:aload_0         
	//*  17   31:getfield        #56  <Field GmsClientEventManager$GmsClientEventState zaok>
	//*  18   34:invokeinterface #88  <Method boolean GmsClientEventManager$GmsClientEventState.isConnected()>
	//*  19   39:ifeq            68
	//*  20   42:aload_0         
	//*  21   43:getfield        #37  <Field ArrayList zaol>
	//*  22   46:aload_3         
	//*  23   47:invokevirtual   #92  <Method boolean ArrayList.contains(Object)>
	//*  24   50:ifeq            68
					connectioncallbacks.onConnected(zaok.getConnectionHint());
	//   25   53:aload_3         
	//   26   54:aload_0         
	//   27   55:getfield        #56  <Field GmsClientEventManager$GmsClientEventState zaok>
	//   28   58:invokeinterface #96  <Method Bundle GmsClientEventManager$GmsClientEventState.getConnectionHint()>
	//   29   63:invokeinterface #100 <Method void com.google.android.gms.common.api.GoogleApiClient$ConnectionCallbacks.onConnected(Bundle)>
			}
	//   30   68:aload_1         
	//   31   69:monitorexit     
			return true;
	//   32   70:iconst_1        
	//   33   71:ireturn         
		} else
	//*  34   72:astore_3        
	//*  35   73:aload_1         
	//*  36   74:monitorexit     
	//*  37   75:aload_3         
	//*  38   76:athrow          
		{
			int i = message.what;
	//   39   77:aload_1         
	//   40   78:getfield        #80  <Field int Message.what>
	//   41   81:istore_2        
			message = ((Message) (new StringBuilder(45)));
	//   42   82:new             #102 <Class StringBuilder>
	//   43   85:dup             
	//   44   86:bipush          45
	//   45   88:invokespecial   #103 <Method void StringBuilder(int)>
	//   46   91:astore_1        
			((StringBuilder) (message)).append("Don't know how to handle message: ");
	//   47   92:aload_1         
	//   48   93:ldc1            #105 <String "Don't know how to handle message: ">
	//   49   95:invokevirtual   #109 <Method StringBuilder StringBuilder.append(String)>
	//   50   98:pop             
			((StringBuilder) (message)).append(i);
	//   51   99:aload_1         
	//   52  100:iload_2         
	//   53  101:invokevirtual   #112 <Method StringBuilder StringBuilder.append(int)>
	//   54  104:pop             
			Log.wtf("GmsClientEvents", ((StringBuilder) (message)).toString(), ((Throwable) (new Exception())));
	//   55  105:ldc1            #114 <String "GmsClientEvents">
	//   56  107:aload_1         
	//   57  108:invokevirtual   #118 <Method String StringBuilder.toString()>
	//   58  111:new             #120 <Class Exception>
	//   59  114:dup             
	//   60  115:invokespecial   #121 <Method void Exception()>
	//   61  118:invokestatic    #127 <Method int Log.wtf(String, String, Throwable)>
	//   62  121:pop             
			return false;
	//   63  122:iconst_0        
	//   64  123:ireturn         
		}
		exception;
		message;
		JVM INSTR monitorexit ;
		throw exception;
	}

	public final boolean isConnectionCallbacksRegistered(com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks)
	{
		Preconditions.checkNotNull(((Object) (connectioncallbacks)));
	//    0    0:aload_1         
	//    1    1:invokestatic    #135 <Method Object Preconditions.checkNotNull(Object)>
	//    2    4:pop             
		boolean flag;
		synchronized(mLock)
	//*   3    5:aload_0         
	//*   4    6:getfield        #54  <Field Object mLock>
	//*   5    9:astore_3        
	//*   6   10:aload_3         
	//*   7   11:monitorenter    
		{
			flag = zaol.contains(((Object) (connectioncallbacks)));
	//    8   12:aload_0         
	//    9   13:getfield        #37  <Field ArrayList zaol>
	//   10   16:aload_1         
	//   11   17:invokevirtual   #92  <Method boolean ArrayList.contains(Object)>
	//   12   20:istore_2        
		}
	//   13   21:aload_3         
	//   14   22:monitorexit     
		return flag;
	//   15   23:iload_2         
	//   16   24:ireturn         
		connectioncallbacks;
	//   17   25:astore_1        
		obj;
	//   18   26:aload_3         
		JVM INSTR monitorexit ;
	//   19   27:monitorexit     
		throw connectioncallbacks;
	//   20   28:aload_1         
	//   21   29:athrow          
	}

	public final boolean isConnectionFailedListenerRegistered(com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
	{
		Preconditions.checkNotNull(((Object) (onconnectionfailedlistener)));
	//    0    0:aload_1         
	//    1    1:invokestatic    #135 <Method Object Preconditions.checkNotNull(Object)>
	//    2    4:pop             
		boolean flag;
		synchronized(mLock)
	//*   3    5:aload_0         
	//*   4    6:getfield        #54  <Field Object mLock>
	//*   5    9:astore_3        
	//*   6   10:aload_3         
	//*   7   11:monitorenter    
		{
			flag = zaon.contains(((Object) (onconnectionfailedlistener)));
	//    8   12:aload_0         
	//    9   13:getfield        #41  <Field ArrayList zaon>
	//   10   16:aload_1         
	//   11   17:invokevirtual   #92  <Method boolean ArrayList.contains(Object)>
	//   12   20:istore_2        
		}
	//   13   21:aload_3         
	//   14   22:monitorexit     
		return flag;
	//   15   23:iload_2         
	//   16   24:ireturn         
		onconnectionfailedlistener;
	//   17   25:astore_1        
		obj;
	//   18   26:aload_3         
		JVM INSTR monitorexit ;
	//   19   27:monitorexit     
		throw onconnectionfailedlistener;
	//   20   28:aload_1         
	//   21   29:athrow          
	}

	public final void onConnectionFailure(ConnectionResult connectionresult)
	{
		int i;
		Looper looper = Looper.myLooper();
	//    0    0:invokestatic    #145 <Method Looper Looper.myLooper()>
	//    1    3:astore          7
		Looper looper1 = mHandler.getLooper();
	//    2    5:aload_0         
	//    3    6:getfield        #63  <Field Handler mHandler>
	//    4    9:invokevirtual   #150 <Method Looper Handler.getLooper()>
	//    5   12:astore          8
		i = 0;
	//    6   14:iconst_0        
	//    7   15:istore_2        
		boolean flag;
		if(looper == looper1)
	//*   8   16:aload           7
	//*   9   18:aload           8
	//*  10   20:if_acmpne       29
			flag = true;
	//   11   23:iconst_1        
	//   12   24:istore          6
		else
	//*  13   26:goto            32
			flag = false;
	//   14   29:iconst_0        
	//   15   30:istore          6
		Preconditions.checkState(flag, "onConnectionFailure must only be called on the Handler thread");
	//   16   32:iload           6
	//   17   34:ldc1            #152 <String "onConnectionFailure must only be called on the Handler thread">
	//   18   36:invokestatic    #156 <Method void Preconditions.checkState(boolean, Object)>
		mHandler.removeMessages(1);
	//   19   39:aload_0         
	//   20   40:getfield        #63  <Field Handler mHandler>
	//   21   43:iconst_1        
	//   22   44:invokevirtual   #159 <Method void Handler.removeMessages(int)>
		Object obj = mLock;
	//   23   47:aload_0         
	//   24   48:getfield        #54  <Field Object mLock>
	//   25   51:astore          7
		obj;
	//   26   53:aload           7
		JVM INSTR monitorenter ;
	//   27   55:monitorenter    
		int k;
		int l;
		ArrayList arraylist;
		arraylist = new ArrayList(((java.util.Collection) (zaon)));
	//   28   56:new             #34  <Class ArrayList>
	//   29   59:dup             
	//   30   60:aload_0         
	//   31   61:getfield        #41  <Field ArrayList zaon>
	//   32   64:invokespecial   #162 <Method void ArrayList(java.util.Collection)>
	//   33   67:astore          8
		k = zaop.get();
	//   34   69:aload_0         
	//   35   70:getfield        #50  <Field AtomicInteger zaop>
	//   36   73:invokevirtual   #165 <Method int AtomicInteger.get()>
	//   37   76:istore          4
		arraylist = (ArrayList)arraylist;
	//   38   78:aload           8
	//   39   80:checkcast       #34  <Class ArrayList>
	//   40   83:astore          8
		l = arraylist.size();
	//   41   85:aload           8
	//   42   87:invokevirtual   #168 <Method int ArrayList.size()>
	//   43   90:istore          5
_L2:
		if(i >= l)
			break MISSING_BLOCK_LABEL_170;
	//   44   92:iload_2         
	//   45   93:iload           5
	//   46   95:icmpge          170
		Object obj1 = arraylist.get(i);
	//   47   98:aload           8
	//   48  100:iload_2         
	//   49  101:invokevirtual   #171 <Method Object ArrayList.get(int)>
	//   50  104:astore          9
		int j = i + 1;
	//   51  106:iload_2         
	//   52  107:iconst_1        
	//   53  108:iadd            
	//   54  109:istore_3        
		obj1 = ((Object) ((com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener)obj1));
	//   55  110:aload           9
	//   56  112:checkcast       #173 <Class com.google.android.gms.common.api.GoogleApiClient$OnConnectionFailedListener>
	//   57  115:astore          9
		if(!zaoo || zaop.get() != k)
	//*  58  117:aload_0         
	//*  59  118:getfield        #43  <Field boolean zaoo>
	//*  60  121:ifeq            166
	//*  61  124:aload_0         
	//*  62  125:getfield        #50  <Field AtomicInteger zaop>
	//*  63  128:invokevirtual   #165 <Method int AtomicInteger.get()>
	//*  64  131:iload           4
	//*  65  133:icmpeq          139
			break; /* Loop/switch isn't completed */
	//   66  136:goto            166
		i = j;
	//   67  139:iload_3         
	//   68  140:istore_2        
		if(!zaon.contains(obj1))
			continue; /* Loop/switch isn't completed */
	//   69  141:aload_0         
	//   70  142:getfield        #41  <Field ArrayList zaon>
	//   71  145:aload           9
	//   72  147:invokevirtual   #92  <Method boolean ArrayList.contains(Object)>
	//   73  150:ifeq            92
		((com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener) (obj1)).onConnectionFailed(connectionresult);
	//   74  153:aload           9
	//   75  155:aload_1         
	//   76  156:invokeinterface #176 <Method void com.google.android.gms.common.api.GoogleApiClient$OnConnectionFailedListener.onConnectionFailed(ConnectionResult)>
		i = j;
	//   77  161:iload_3         
	//   78  162:istore_2        
		if(true) goto _L2; else goto _L1
	//   79  163:goto            92
_L1:
		obj;
	//   80  166:aload           7
		JVM INSTR monitorexit ;
	//   81  168:monitorexit     
		return;
	//   82  169:return          
		obj;
	//   83  170:aload           7
		JVM INSTR monitorexit ;
	//   84  172:monitorexit     
		return;
	//   85  173:return          
		connectionresult;
	//   86  174:astore_1        
		obj;
	//   87  175:aload           7
		JVM INSTR monitorexit ;
	//   88  177:monitorexit     
		throw connectionresult;
	//   89  178:aload_1         
	//   90  179:athrow          
	}

	protected final void onConnectionSuccess()
	{
		synchronized(mLock)
	//*   0    0:aload_0         
	//*   1    1:getfield        #54  <Field Object mLock>
	//*   2    4:astore_1        
	//*   3    5:aload_1         
	//*   4    6:monitorenter    
		{
			onConnectionSuccess(zaok.getConnectionHint());
	//    5    7:aload_0         
	//    6    8:aload_0         
	//    7    9:getfield        #56  <Field GmsClientEventManager$GmsClientEventState zaok>
	//    8   12:invokeinterface #96  <Method Bundle GmsClientEventManager$GmsClientEventState.getConnectionHint()>
	//    9   17:invokevirtual   #180 <Method void onConnectionSuccess(Bundle)>
		}
	//   10   20:aload_1         
	//   11   21:monitorexit     
		return;
	//   12   22:return          
		exception;
	//   13   23:astore_2        
		obj;
	//   14   24:aload_1         
		JVM INSTR monitorexit ;
	//   15   25:monitorexit     
		throw exception;
	//   16   26:aload_2         
	//   17   27:athrow          
	}

	public final void onConnectionSuccess(Bundle bundle)
	{
		boolean flag2;
		Looper looper = Looper.myLooper();
	//    0    0:invokestatic    #145 <Method Looper Looper.myLooper()>
	//    1    3:astore          8
		Looper looper1 = mHandler.getLooper();
	//    2    5:aload_0         
	//    3    6:getfield        #63  <Field Handler mHandler>
	//    4    9:invokevirtual   #150 <Method Looper Handler.getLooper()>
	//    5   12:astore          9
		flag2 = true;
	//    6   14:iconst_1        
	//    7   15:istore          7
		boolean flag;
		if(looper == looper1)
	//*   8   17:aload           8
	//*   9   19:aload           9
	//*  10   21:if_acmpne       30
			flag = true;
	//   11   24:iconst_1        
	//   12   25:istore          6
		else
	//*  13   27:goto            33
			flag = false;
	//   14   30:iconst_0        
	//   15   31:istore          6
		Preconditions.checkState(flag, "onConnectionSuccess must only be called on the Handler thread");
	//   16   33:iload           6
	//   17   35:ldc1            #182 <String "onConnectionSuccess must only be called on the Handler thread">
	//   18   37:invokestatic    #156 <Method void Preconditions.checkState(boolean, Object)>
		Object obj = mLock;
	//   19   40:aload_0         
	//   20   41:getfield        #54  <Field Object mLock>
	//   21   44:astore          8
		obj;
	//   22   46:aload           8
		JVM INSTR monitorenter ;
	//   23   48:monitorenter    
		Preconditions.checkState(zaoq ^ true);
	//   24   49:aload_0         
	//   25   50:getfield        #52  <Field boolean zaoq>
	//   26   53:iconst_1        
	//   27   54:ixor            
	//   28   55:invokestatic    #185 <Method void Preconditions.checkState(boolean)>
		mHandler.removeMessages(1);
	//   29   58:aload_0         
	//   30   59:getfield        #63  <Field Handler mHandler>
	//   31   62:iconst_1        
	//   32   63:invokevirtual   #159 <Method void Handler.removeMessages(int)>
		zaoq = true;
	//   33   66:aload_0         
	//   34   67:iconst_1        
	//   35   68:putfield        #52  <Field boolean zaoq>
		int i;
		int j;
		int k;
		int l;
		boolean flag1;
		ArrayList arraylist;
		Object obj1;
		if(zaom.size() == 0)
	//*  36   71:aload_0         
	//*  37   72:getfield        #39  <Field ArrayList zaom>
	//*  38   75:invokevirtual   #168 <Method int ArrayList.size()>
	//*  39   78:ifne            236
			flag1 = flag2;
	//   40   81:iload           7
	//   41   83:istore          6
		else
	//*  42   85:goto            88
	//*  43   88:iload           6
	//*  44   90:invokestatic    #185 <Method void Preconditions.checkState(boolean)>
	//*  45   93:new             #34  <Class ArrayList>
	//*  46   96:dup             
	//*  47   97:aload_0         
	//*  48   98:getfield        #37  <Field ArrayList zaol>
	//*  49  101:invokespecial   #162 <Method void ArrayList(java.util.Collection)>
	//*  50  104:astore          9
	//*  51  106:aload_0         
	//*  52  107:getfield        #50  <Field AtomicInteger zaop>
	//*  53  110:invokevirtual   #165 <Method int AtomicInteger.get()>
	//*  54  113:istore          4
	//*  55  115:aload           9
	//*  56  117:checkcast       #34  <Class ArrayList>
	//*  57  120:astore          9
	//*  58  122:aload           9
	//*  59  124:invokevirtual   #168 <Method int ArrayList.size()>
	//*  60  127:istore          5
	//*  61  129:iconst_0        
	//*  62  130:istore_2        
	//*  63  131:iload_2         
	//*  64  132:iload           5
	//*  65  134:icmpge          214
	//*  66  137:aload           9
	//*  67  139:iload_2         
	//*  68  140:invokevirtual   #171 <Method Object ArrayList.get(int)>
	//*  69  143:astore          10
	//*  70  145:iload_2         
	//*  71  146:iconst_1        
	//*  72  147:iadd            
	//*  73  148:istore_3        
	//*  74  149:aload           10
	//*  75  151:checkcast       #85  <Class com.google.android.gms.common.api.GoogleApiClient$ConnectionCallbacks>
	//*  76  154:astore          10
	//*  77  156:aload_0         
	//*  78  157:getfield        #43  <Field boolean zaoo>
	//*  79  160:ifeq            214
	//*  80  163:aload_0         
	//*  81  164:getfield        #56  <Field GmsClientEventManager$GmsClientEventState zaok>
	//*  82  167:invokeinterface #88  <Method boolean GmsClientEventManager$GmsClientEventState.isConnected()>
	//*  83  172:ifeq            214
	//*  84  175:aload_0         
	//*  85  176:getfield        #50  <Field AtomicInteger zaop>
	//*  86  179:invokevirtual   #165 <Method int AtomicInteger.get()>
	//*  87  182:iload           4
	//*  88  184:icmpne          214
	//*  89  187:iload_3         
	//*  90  188:istore_2        
	//*  91  189:aload_0         
	//*  92  190:getfield        #39  <Field ArrayList zaom>
	//*  93  193:aload           10
	//*  94  195:invokevirtual   #92  <Method boolean ArrayList.contains(Object)>
	//*  95  198:ifne            131
	//*  96  201:aload           10
	//*  97  203:aload_1         
	//*  98  204:invokeinterface #100 <Method void com.google.android.gms.common.api.GoogleApiClient$ConnectionCallbacks.onConnected(Bundle)>
	//*  99  209:iload_3         
	//* 100  210:istore_2        
	//* 101  211:goto            131
	//* 102  214:aload_0         
	//* 103  215:getfield        #39  <Field ArrayList zaom>
	//* 104  218:invokevirtual   #188 <Method void ArrayList.clear()>
	//* 105  221:aload_0         
	//* 106  222:iconst_0        
	//* 107  223:putfield        #52  <Field boolean zaoq>
	//* 108  226:aload           8
	//* 109  228:monitorexit     
	//* 110  229:return          
	//* 111  230:astore_1        
	//* 112  231:aload           8
	//* 113  233:monitorexit     
	//* 114  234:aload_1         
	//* 115  235:athrow          
			flag1 = false;
	//  116  236:iconst_0        
	//  117  237:istore          6
		Preconditions.checkState(flag1);
		arraylist = new ArrayList(((java.util.Collection) (zaol)));
		k = zaop.get();
		arraylist = (ArrayList)arraylist;
		l = arraylist.size();
		i = 0;
_L2:
		if(i >= l)
			break; /* Loop/switch isn't completed */
		obj1 = arraylist.get(i);
		j = i + 1;
		obj1 = ((Object) ((com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks)obj1));
		if(!zaoo || !zaok.isConnected() || zaop.get() != k)
			break; /* Loop/switch isn't completed */
		i = j;
		if(zaom.contains(obj1))
			continue; /* Loop/switch isn't completed */
		((com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks) (obj1)).onConnected(bundle);
		i = j;
		if(true) goto _L2; else goto _L1
_L1:
		zaom.clear();
		zaoq = false;
		obj;
		JVM INSTR monitorexit ;
		return;
		bundle;
		obj;
		JVM INSTR monitorexit ;
		throw bundle;
	//* 118  239:goto            88
	}

	public final void onUnintentionalDisconnection(int i)
	{
		boolean flag;
		if(Looper.myLooper() == mHandler.getLooper())
	//*   0    0:invokestatic    #145 <Method Looper Looper.myLooper()>
	//*   1    3:aload_0         
	//*   2    4:getfield        #63  <Field Handler mHandler>
	//*   3    7:invokevirtual   #150 <Method Looper Handler.getLooper()>
	//*   4   10:if_acmpne       19
			flag = true;
	//    5   13:iconst_1        
	//    6   14:istore          6
		else
	//*   7   16:goto            22
			flag = false;
	//    8   19:iconst_0        
	//    9   20:istore          6
		Preconditions.checkState(flag, "onUnintentionalDisconnection must only be called on the Handler thread");
	//   10   22:iload           6
	//   11   24:ldc1            #191 <String "onUnintentionalDisconnection must only be called on the Handler thread">
	//   12   26:invokestatic    #156 <Method void Preconditions.checkState(boolean, Object)>
		mHandler.removeMessages(1);
	//   13   29:aload_0         
	//   14   30:getfield        #63  <Field Handler mHandler>
	//   15   33:iconst_1        
	//   16   34:invokevirtual   #159 <Method void Handler.removeMessages(int)>
		Object obj = mLock;
	//   17   37:aload_0         
	//   18   38:getfield        #54  <Field Object mLock>
	//   19   41:astore          7
		obj;
	//   20   43:aload           7
		JVM INSTR monitorenter ;
	//   21   45:monitorenter    
		int l;
		int i1;
		ArrayList arraylist;
		zaoq = true;
	//   22   46:aload_0         
	//   23   47:iconst_1        
	//   24   48:putfield        #52  <Field boolean zaoq>
		arraylist = new ArrayList(((java.util.Collection) (zaol)));
	//   25   51:new             #34  <Class ArrayList>
	//   26   54:dup             
	//   27   55:aload_0         
	//   28   56:getfield        #37  <Field ArrayList zaol>
	//   29   59:invokespecial   #162 <Method void ArrayList(java.util.Collection)>
	//   30   62:astore          8
		l = zaop.get();
	//   31   64:aload_0         
	//   32   65:getfield        #50  <Field AtomicInteger zaop>
	//   33   68:invokevirtual   #165 <Method int AtomicInteger.get()>
	//   34   71:istore          4
		arraylist = (ArrayList)arraylist;
	//   35   73:aload           8
	//   36   75:checkcast       #34  <Class ArrayList>
	//   37   78:astore          8
		i1 = arraylist.size();
	//   38   80:aload           8
	//   39   82:invokevirtual   #168 <Method int ArrayList.size()>
	//   40   85:istore          5
		int j = 0;
	//   41   87:iconst_0        
	//   42   88:istore_2        
_L2:
		if(j >= i1)
			break; /* Loop/switch isn't completed */
	//   43   89:iload_2         
	//   44   90:iload           5
	//   45   92:icmpge          160
		Object obj1 = arraylist.get(j);
	//   46   95:aload           8
	//   47   97:iload_2         
	//   48   98:invokevirtual   #171 <Method Object ArrayList.get(int)>
	//   49  101:astore          9
		int k = j + 1;
	//   50  103:iload_2         
	//   51  104:iconst_1        
	//   52  105:iadd            
	//   53  106:istore_3        
		obj1 = ((Object) ((com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks)obj1));
	//   54  107:aload           9
	//   55  109:checkcast       #85  <Class com.google.android.gms.common.api.GoogleApiClient$ConnectionCallbacks>
	//   56  112:astore          9
		if(!zaoo || zaop.get() != l)
			break; /* Loop/switch isn't completed */
	//   57  114:aload_0         
	//   58  115:getfield        #43  <Field boolean zaoo>
	//   59  118:ifeq            160
	//   60  121:aload_0         
	//   61  122:getfield        #50  <Field AtomicInteger zaop>
	//   62  125:invokevirtual   #165 <Method int AtomicInteger.get()>
	//   63  128:iload           4
	//   64  130:icmpne          160
		j = k;
	//   65  133:iload_3         
	//   66  134:istore_2        
		if(!zaol.contains(obj1))
			continue; /* Loop/switch isn't completed */
	//   67  135:aload_0         
	//   68  136:getfield        #37  <Field ArrayList zaol>
	//   69  139:aload           9
	//   70  141:invokevirtual   #92  <Method boolean ArrayList.contains(Object)>
	//   71  144:ifeq            89
		((com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks) (obj1)).onConnectionSuspended(i);
	//   72  147:aload           9
	//   73  149:iload_1         
	//   74  150:invokeinterface #194 <Method void com.google.android.gms.common.api.GoogleApiClient$ConnectionCallbacks.onConnectionSuspended(int)>
		j = k;
	//   75  155:iload_3         
	//   76  156:istore_2        
		if(true) goto _L2; else goto _L1
	//   77  157:goto            89
_L1:
		zaom.clear();
	//   78  160:aload_0         
	//   79  161:getfield        #39  <Field ArrayList zaom>
	//   80  164:invokevirtual   #188 <Method void ArrayList.clear()>
		zaoq = false;
	//   81  167:aload_0         
	//   82  168:iconst_0        
	//   83  169:putfield        #52  <Field boolean zaoq>
		obj;
	//   84  172:aload           7
		JVM INSTR monitorexit ;
	//   85  174:monitorexit     
		return;
	//   86  175:return          
		Exception exception;
		exception;
	//   87  176:astore          8
		obj;
	//   88  178:aload           7
		JVM INSTR monitorexit ;
	//   89  180:monitorexit     
		throw exception;
	//   90  181:aload           8
	//   91  183:athrow          
	}

	public final void registerConnectionCallbacks(com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks)
	{
		Preconditions.checkNotNull(((Object) (connectioncallbacks)));
	//    0    0:aload_1         
	//    1    1:invokestatic    #135 <Method Object Preconditions.checkNotNull(Object)>
	//    2    4:pop             
		Object obj = mLock;
	//    3    5:aload_0         
	//    4    6:getfield        #54  <Field Object mLock>
	//    5    9:astore_2        
		obj;
	//    6   10:aload_2         
		JVM INSTR monitorenter ;
	//    7   11:monitorenter    
		if(zaol.contains(((Object) (connectioncallbacks))))
	//*   8   12:aload_0         
	//*   9   13:getfield        #37  <Field ArrayList zaol>
	//*  10   16:aload_1         
	//*  11   17:invokevirtual   #92  <Method boolean ArrayList.contains(Object)>
	//*  12   20:ifeq            84
		{
			String s = String.valueOf(((Object) (connectioncallbacks)));
	//   13   23:aload_1         
	//   14   24:invokestatic    #202 <Method String String.valueOf(Object)>
	//   15   27:astore_3        
			StringBuilder stringbuilder = new StringBuilder(String.valueOf(((Object) (s))).length() + 62);
	//   16   28:new             #102 <Class StringBuilder>
	//   17   31:dup             
	//   18   32:aload_3         
	//   19   33:invokestatic    #202 <Method String String.valueOf(Object)>
	//   20   36:invokevirtual   #205 <Method int String.length()>
	//   21   39:bipush          62
	//   22   41:iadd            
	//   23   42:invokespecial   #103 <Method void StringBuilder(int)>
	//   24   45:astore          4
			stringbuilder.append("registerConnectionCallbacks(): listener ");
	//   25   47:aload           4
	//   26   49:ldc1            #207 <String "registerConnectionCallbacks(): listener ">
	//   27   51:invokevirtual   #109 <Method StringBuilder StringBuilder.append(String)>
	//   28   54:pop             
			stringbuilder.append(s);
	//   29   55:aload           4
	//   30   57:aload_3         
	//   31   58:invokevirtual   #109 <Method StringBuilder StringBuilder.append(String)>
	//   32   61:pop             
			stringbuilder.append(" is already registered");
	//   33   62:aload           4
	//   34   64:ldc1            #209 <String " is already registered">
	//   35   66:invokevirtual   #109 <Method StringBuilder StringBuilder.append(String)>
	//   36   69:pop             
			Log.w("GmsClientEvents", stringbuilder.toString());
	//   37   70:ldc1            #114 <String "GmsClientEvents">
	//   38   72:aload           4
	//   39   74:invokevirtual   #118 <Method String StringBuilder.toString()>
	//   40   77:invokestatic    #213 <Method int Log.w(String, String)>
	//   41   80:pop             
			break MISSING_BLOCK_LABEL_93;
	//   42   81:goto            93
		}
		zaol.add(((Object) (connectioncallbacks)));
	//   43   84:aload_0         
	//   44   85:getfield        #37  <Field ArrayList zaol>
	//   45   88:aload_1         
	//   46   89:invokevirtual   #216 <Method boolean ArrayList.add(Object)>
	//   47   92:pop             
		obj;
	//   48   93:aload_2         
		JVM INSTR monitorexit ;
	//   49   94:monitorexit     
		if(zaok.isConnected())
	//*  50   95:aload_0         
	//*  51   96:getfield        #56  <Field GmsClientEventManager$GmsClientEventState zaok>
	//*  52   99:invokeinterface #88  <Method boolean GmsClientEventManager$GmsClientEventState.isConnected()>
	//*  53  104:ifeq            124
			mHandler.sendMessage(mHandler.obtainMessage(1, ((Object) (connectioncallbacks))));
	//   54  107:aload_0         
	//   55  108:getfield        #63  <Field Handler mHandler>
	//   56  111:aload_0         
	//   57  112:getfield        #63  <Field Handler mHandler>
	//   58  115:iconst_1        
	//   59  116:aload_1         
	//   60  117:invokevirtual   #220 <Method Message Handler.obtainMessage(int, Object)>
	//   61  120:invokevirtual   #223 <Method boolean Handler.sendMessage(Message)>
	//   62  123:pop             
		return;
	//   63  124:return          
		connectioncallbacks;
	//   64  125:astore_1        
		obj;
	//   65  126:aload_2         
		JVM INSTR monitorexit ;
	//   66  127:monitorexit     
		throw connectioncallbacks;
	//   67  128:aload_1         
	//   68  129:athrow          
	}

	public final void registerConnectionFailedListener(com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
	{
		Preconditions.checkNotNull(((Object) (onconnectionfailedlistener)));
	//    0    0:aload_1         
	//    1    1:invokestatic    #135 <Method Object Preconditions.checkNotNull(Object)>
	//    2    4:pop             
		Object obj = mLock;
	//    3    5:aload_0         
	//    4    6:getfield        #54  <Field Object mLock>
	//    5    9:astore_2        
		obj;
	//    6   10:aload_2         
		JVM INSTR monitorenter ;
	//    7   11:monitorenter    
		if(zaon.contains(((Object) (onconnectionfailedlistener))))
	//*   8   12:aload_0         
	//*   9   13:getfield        #41  <Field ArrayList zaon>
	//*  10   16:aload_1         
	//*  11   17:invokevirtual   #92  <Method boolean ArrayList.contains(Object)>
	//*  12   20:ifeq            79
		{
			onconnectionfailedlistener = ((com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener) (String.valueOf(((Object) (onconnectionfailedlistener)))));
	//   13   23:aload_1         
	//   14   24:invokestatic    #202 <Method String String.valueOf(Object)>
	//   15   27:astore_1        
			StringBuilder stringbuilder = new StringBuilder(String.valueOf(((Object) (onconnectionfailedlistener))).length() + 67);
	//   16   28:new             #102 <Class StringBuilder>
	//   17   31:dup             
	//   18   32:aload_1         
	//   19   33:invokestatic    #202 <Method String String.valueOf(Object)>
	//   20   36:invokevirtual   #205 <Method int String.length()>
	//   21   39:bipush          67
	//   22   41:iadd            
	//   23   42:invokespecial   #103 <Method void StringBuilder(int)>
	//   24   45:astore_3        
			stringbuilder.append("registerConnectionFailedListener(): listener ");
	//   25   46:aload_3         
	//   26   47:ldc1            #227 <String "registerConnectionFailedListener(): listener ">
	//   27   49:invokevirtual   #109 <Method StringBuilder StringBuilder.append(String)>
	//   28   52:pop             
			stringbuilder.append(((String) (onconnectionfailedlistener)));
	//   29   53:aload_3         
	//   30   54:aload_1         
	//   31   55:invokevirtual   #109 <Method StringBuilder StringBuilder.append(String)>
	//   32   58:pop             
			stringbuilder.append(" is already registered");
	//   33   59:aload_3         
	//   34   60:ldc1            #209 <String " is already registered">
	//   35   62:invokevirtual   #109 <Method StringBuilder StringBuilder.append(String)>
	//   36   65:pop             
			Log.w("GmsClientEvents", stringbuilder.toString());
	//   37   66:ldc1            #114 <String "GmsClientEvents">
	//   38   68:aload_3         
	//   39   69:invokevirtual   #118 <Method String StringBuilder.toString()>
	//   40   72:invokestatic    #213 <Method int Log.w(String, String)>
	//   41   75:pop             
			break MISSING_BLOCK_LABEL_88;
	//   42   76:goto            88
		}
		zaon.add(((Object) (onconnectionfailedlistener)));
	//   43   79:aload_0         
	//   44   80:getfield        #41  <Field ArrayList zaon>
	//   45   83:aload_1         
	//   46   84:invokevirtual   #216 <Method boolean ArrayList.add(Object)>
	//   47   87:pop             
		obj;
	//   48   88:aload_2         
		JVM INSTR monitorexit ;
	//   49   89:monitorexit     
		return;
	//   50   90:return          
		onconnectionfailedlistener;
	//   51   91:astore_1        
		obj;
	//   52   92:aload_2         
		JVM INSTR monitorexit ;
	//   53   93:monitorexit     
		throw onconnectionfailedlistener;
	//   54   94:aload_1         
	//   55   95:athrow          
	}

	public final void unregisterConnectionCallbacks(com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks)
	{
		Preconditions.checkNotNull(((Object) (connectioncallbacks)));
	//    0    0:aload_1         
	//    1    1:invokestatic    #135 <Method Object Preconditions.checkNotNull(Object)>
	//    2    4:pop             
		Object obj = mLock;
	//    3    5:aload_0         
	//    4    6:getfield        #54  <Field Object mLock>
	//    5    9:astore_2        
		obj;
	//    6   10:aload_2         
		JVM INSTR monitorenter ;
	//    7   11:monitorenter    
		if(!zaol.remove(((Object) (connectioncallbacks))))
	//*   8   12:aload_0         
	//*   9   13:getfield        #37  <Field ArrayList zaol>
	//*  10   16:aload_1         
	//*  11   17:invokevirtual   #231 <Method boolean ArrayList.remove(Object)>
	//*  12   20:ifne            79
		{
			connectioncallbacks = ((com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks) (String.valueOf(((Object) (connectioncallbacks)))));
	//   13   23:aload_1         
	//   14   24:invokestatic    #202 <Method String String.valueOf(Object)>
	//   15   27:astore_1        
			StringBuilder stringbuilder = new StringBuilder(String.valueOf(((Object) (connectioncallbacks))).length() + 52);
	//   16   28:new             #102 <Class StringBuilder>
	//   17   31:dup             
	//   18   32:aload_1         
	//   19   33:invokestatic    #202 <Method String String.valueOf(Object)>
	//   20   36:invokevirtual   #205 <Method int String.length()>
	//   21   39:bipush          52
	//   22   41:iadd            
	//   23   42:invokespecial   #103 <Method void StringBuilder(int)>
	//   24   45:astore_3        
			stringbuilder.append("unregisterConnectionCallbacks(): listener ");
	//   25   46:aload_3         
	//   26   47:ldc1            #233 <String "unregisterConnectionCallbacks(): listener ">
	//   27   49:invokevirtual   #109 <Method StringBuilder StringBuilder.append(String)>
	//   28   52:pop             
			stringbuilder.append(((String) (connectioncallbacks)));
	//   29   53:aload_3         
	//   30   54:aload_1         
	//   31   55:invokevirtual   #109 <Method StringBuilder StringBuilder.append(String)>
	//   32   58:pop             
			stringbuilder.append(" not found");
	//   33   59:aload_3         
	//   34   60:ldc1            #235 <String " not found">
	//   35   62:invokevirtual   #109 <Method StringBuilder StringBuilder.append(String)>
	//   36   65:pop             
			Log.w("GmsClientEvents", stringbuilder.toString());
	//   37   66:ldc1            #114 <String "GmsClientEvents">
	//   38   68:aload_3         
	//   39   69:invokevirtual   #118 <Method String StringBuilder.toString()>
	//   40   72:invokestatic    #213 <Method int Log.w(String, String)>
	//   41   75:pop             
			break MISSING_BLOCK_LABEL_95;
	//   42   76:goto            95
		}
		if(zaoq)
	//*  43   79:aload_0         
	//*  44   80:getfield        #52  <Field boolean zaoq>
	//*  45   83:ifeq            95
			zaom.add(((Object) (connectioncallbacks)));
	//   46   86:aload_0         
	//   47   87:getfield        #39  <Field ArrayList zaom>
	//   48   90:aload_1         
	//   49   91:invokevirtual   #216 <Method boolean ArrayList.add(Object)>
	//   50   94:pop             
		obj;
	//   51   95:aload_2         
		JVM INSTR monitorexit ;
	//   52   96:monitorexit     
		return;
	//   53   97:return          
		connectioncallbacks;
	//   54   98:astore_1        
		obj;
	//   55   99:aload_2         
		JVM INSTR monitorexit ;
	//   56  100:monitorexit     
		throw connectioncallbacks;
	//   57  101:aload_1         
	//   58  102:athrow          
	}

	public final void unregisterConnectionFailedListener(com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
	{
		Preconditions.checkNotNull(((Object) (onconnectionfailedlistener)));
	//    0    0:aload_1         
	//    1    1:invokestatic    #135 <Method Object Preconditions.checkNotNull(Object)>
	//    2    4:pop             
		synchronized(mLock)
	//*   3    5:aload_0         
	//*   4    6:getfield        #54  <Field Object mLock>
	//*   5    9:astore_2        
	//*   6   10:aload_2         
	//*   7   11:monitorenter    
		{
			if(!zaon.remove(((Object) (onconnectionfailedlistener))))
	//*   8   12:aload_0         
	//*   9   13:getfield        #41  <Field ArrayList zaon>
	//*  10   16:aload_1         
	//*  11   17:invokevirtual   #231 <Method boolean ArrayList.remove(Object)>
	//*  12   20:ifne            76
			{
				onconnectionfailedlistener = ((com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener) (String.valueOf(((Object) (onconnectionfailedlistener)))));
	//   13   23:aload_1         
	//   14   24:invokestatic    #202 <Method String String.valueOf(Object)>
	//   15   27:astore_1        
				StringBuilder stringbuilder = new StringBuilder(String.valueOf(((Object) (onconnectionfailedlistener))).length() + 57);
	//   16   28:new             #102 <Class StringBuilder>
	//   17   31:dup             
	//   18   32:aload_1         
	//   19   33:invokestatic    #202 <Method String String.valueOf(Object)>
	//   20   36:invokevirtual   #205 <Method int String.length()>
	//   21   39:bipush          57
	//   22   41:iadd            
	//   23   42:invokespecial   #103 <Method void StringBuilder(int)>
	//   24   45:astore_3        
				stringbuilder.append("unregisterConnectionFailedListener(): listener ");
	//   25   46:aload_3         
	//   26   47:ldc1            #238 <String "unregisterConnectionFailedListener(): listener ">
	//   27   49:invokevirtual   #109 <Method StringBuilder StringBuilder.append(String)>
	//   28   52:pop             
				stringbuilder.append(((String) (onconnectionfailedlistener)));
	//   29   53:aload_3         
	//   30   54:aload_1         
	//   31   55:invokevirtual   #109 <Method StringBuilder StringBuilder.append(String)>
	//   32   58:pop             
				stringbuilder.append(" not found");
	//   33   59:aload_3         
	//   34   60:ldc1            #235 <String " not found">
	//   35   62:invokevirtual   #109 <Method StringBuilder StringBuilder.append(String)>
	//   36   65:pop             
				Log.w("GmsClientEvents", stringbuilder.toString());
	//   37   66:ldc1            #114 <String "GmsClientEvents">
	//   38   68:aload_3         
	//   39   69:invokevirtual   #118 <Method String StringBuilder.toString()>
	//   40   72:invokestatic    #213 <Method int Log.w(String, String)>
	//   41   75:pop             
			}
		}
	//   42   76:aload_2         
	//   43   77:monitorexit     
		return;
	//   44   78:return          
		onconnectionfailedlistener;
	//   45   79:astore_1        
		obj;
	//   46   80:aload_2         
		JVM INSTR monitorexit ;
	//   47   81:monitorexit     
		throw onconnectionfailedlistener;
	//   48   82:aload_1         
	//   49   83:athrow          
	}

	private final Handler mHandler;
	private final Object mLock = new Object();
	private final GmsClientEventState zaok;
	private final ArrayList zaol = new ArrayList();
	private final ArrayList zaom = new ArrayList();
	private final ArrayList zaon = new ArrayList();
	private volatile boolean zaoo;
	private final AtomicInteger zaop = new AtomicInteger(0);
	private boolean zaoq;
}

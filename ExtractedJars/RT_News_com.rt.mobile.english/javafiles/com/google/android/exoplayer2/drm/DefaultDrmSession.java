// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.drm;

import android.media.NotProvisionedException;
import android.os.*;
import android.util.Log;
import android.util.Pair;
import com.google.android.exoplayer2.C;
import java.util.*;

// Referenced classes of package com.google.android.exoplayer2.drm:
//			DrmSession, KeysExpiredException, WidevineUtil, ExoMediaDrm, 
//			MediaDrmCallback, ExoMediaCrypto

class DefaultDrmSession
	implements DrmSession
{
	private class PostRequestHandler extends Handler
	{

		private long getRetryDelayMillis(int i)
		{
			return (long)Math.min((i - 1) * 1000, 5000);
		//    0    0:iload_1         
		//    1    1:iconst_1        
		//    2    2:isub            
		//    3    3:sipush          1000
		//    4    6:imul            
		//    5    7:sipush          5000
		//    6   10:invokestatic    #28  <Method int Math.min(int, int)>
		//    7   13:i2l             
		//    8   14:lreturn         
		}

		private boolean maybeRetryRequest(Message message)
		{
			boolean flag;
			if(message.arg1 == 1)
		//*   0    0:aload_1         
		//*   1    1:getfield        #36  <Field int Message.arg1>
		//*   2    4:iconst_1        
		//*   3    5:icmpne          13
				flag = true;
		//    4    8:iconst_1        
		//    5    9:istore_2        
			else
		//*   6   10:goto            15
				flag = false;
		//    7   13:iconst_0        
		//    8   14:istore_2        
			if(!flag)
		//*   9   15:iload_2         
		//*  10   16:ifne            21
				return false;
		//   11   19:iconst_0        
		//   12   20:ireturn         
			int i = message.arg2 + 1;
		//   13   21:aload_1         
		//   14   22:getfield        #39  <Field int Message.arg2>
		//   15   25:iconst_1        
		//   16   26:iadd            
		//   17   27:istore_2        
			if(i > initialDrmRequestRetryCount)
		//*  18   28:iload_2         
		//*  19   29:aload_0         
		//*  20   30:getfield        #16  <Field DefaultDrmSession this$0>
		//*  21   33:invokestatic    #43  <Method int DefaultDrmSession.access$200(DefaultDrmSession)>
		//*  22   36:icmple          41
			{
				return false;
		//   23   39:iconst_0        
		//   24   40:ireturn         
			} else
			{
				message = Message.obtain(message);
		//   25   41:aload_1         
		//   26   42:invokestatic    #47  <Method Message Message.obtain(Message)>
		//   27   45:astore_1        
				message.arg2 = i;
		//   28   46:aload_1         
		//   29   47:iload_2         
		//   30   48:putfield        #39  <Field int Message.arg2>
				sendMessageDelayed(message, getRetryDelayMillis(i));
		//   31   51:aload_0         
		//   32   52:aload_1         
		//   33   53:aload_0         
		//   34   54:iload_2         
		//   35   55:invokespecial   #49  <Method long getRetryDelayMillis(int)>
		//   36   58:invokevirtual   #53  <Method boolean sendMessageDelayed(Message, long)>
		//   37   61:pop             
				return true;
		//   38   62:iconst_1        
		//   39   63:ireturn         
			}
		}

		public void handleMessage(Message message)
		{
			Object obj1 = message.obj;
		//    0    0:aload_1         
		//    1    1:getfield        #61  <Field Object Message.obj>
		//    2    4:astore_3        
			message.what;
		//    3    5:aload_1         
		//    4    6:getfield        #64  <Field int Message.what>
			Object obj;
			JVM INSTR tableswitch 0 1: default 154
		//		               0 86
		//		               1 35;
		//    5    9:tableswitch     0 1: default 154
		//		               0 86
		//		               1 35
			   goto _L1 _L2 _L3
		//*   6   32:goto            113
		//*   7   35:aload_3         
		//*   8   36:checkcast       #66  <Class Pair>
		//*   9   39:astore          4
		//*  10   41:aload           4
		//*  11   43:getfield        #69  <Field Object Pair.first>
		//*  12   46:checkcast       #71  <Class ExoMediaDrm$KeyRequest>
		//*  13   49:astore_2        
		//*  14   50:aload           4
		//*  15   52:getfield        #74  <Field Object Pair.second>
		//*  16   55:checkcast       #76  <Class String>
		//*  17   58:astore          4
		//*  18   60:aload_0         
		//*  19   61:getfield        #16  <Field DefaultDrmSession this$0>
		//*  20   64:getfield        #80  <Field MediaDrmCallback DefaultDrmSession.callback>
		//*  21   67:aload_0         
		//*  22   68:getfield        #16  <Field DefaultDrmSession this$0>
		//*  23   71:getfield        #84  <Field UUID DefaultDrmSession.uuid>
		//*  24   74:aload_2         
		//*  25   75:aload           4
		//*  26   77:invokeinterface #90  <Method byte[] MediaDrmCallback.executeKeyRequest(UUID, ExoMediaDrm$KeyRequest, String)>
		//*  27   82:astore_2        
		//*  28   83:goto            131
_L2:
			obj = ((Object) (callback.executeProvisionRequest(uuid, (ExoMediaDrm.ProvisionRequest)obj1)));
		//   29   86:aload_0         
		//   30   87:getfield        #16  <Field DefaultDrmSession this$0>
		//   31   90:getfield        #80  <Field MediaDrmCallback DefaultDrmSession.callback>
		//   32   93:aload_0         
		//   33   94:getfield        #16  <Field DefaultDrmSession this$0>
		//   34   97:getfield        #84  <Field UUID DefaultDrmSession.uuid>
		//   35  100:aload_3         
		//   36  101:checkcast       #92  <Class ExoMediaDrm$ProvisionRequest>
		//   37  104:invokeinterface #96  <Method byte[] MediaDrmCallback.executeProvisionRequest(UUID, ExoMediaDrm$ProvisionRequest)>
		//   38  109:astore_2        
			break; /* Loop/switch isn't completed */
		//   39  110:goto            131
_L1:
			throw new RuntimeException();
		//   40  113:new             #98  <Class RuntimeException>
		//   41  116:dup             
		//   42  117:invokespecial   #101 <Method void RuntimeException()>
		//   43  120:athrow          
_L3:
			try
			{
				Object obj2 = ((Object) ((Pair)obj1));
				obj = ((Object) ((ExoMediaDrm.KeyRequest)((Pair) (obj2)).first));
				obj2 = ((Object) ((String)((Pair) (obj2)).second));
				obj = ((Object) (callback.executeKeyRequest(uuid, ((ExoMediaDrm.KeyRequest) (obj)), ((String) (obj2)))));
				break; /* Loop/switch isn't completed */
			}
			// Misplaced declaration of an exception variable
			catch(Object obj) { }
		//   44  121:astore_2        
			if(maybeRetryRequest(message))
		//*  45  122:aload_0         
		//*  46  123:aload_1         
		//*  47  124:invokespecial   #103 <Method boolean maybeRetryRequest(Message)>
		//*  48  127:ifeq            131
				return;
		//   49  130:return          
			postResponseHandler.obtainMessage(message.what, ((Object) (Pair.create(obj1, obj)))).sendToTarget();
		//   50  131:aload_0         
		//   51  132:getfield        #16  <Field DefaultDrmSession this$0>
		//   52  135:getfield        #107 <Field DefaultDrmSession$PostResponseHandler DefaultDrmSession.postResponseHandler>
		//   53  138:aload_1         
		//   54  139:getfield        #64  <Field int Message.what>
		//   55  142:aload_3         
		//   56  143:aload_2         
		//   57  144:invokestatic    #111 <Method Pair Pair.create(Object, Object)>
		//   58  147:invokevirtual   #117 <Method Message DefaultDrmSession$PostResponseHandler.obtainMessage(int, Object)>
		//   59  150:invokevirtual   #120 <Method void Message.sendToTarget()>
			return;
		//   60  153:return          
		//*  61  154:goto            32
		}

		void post(int i, Object obj, boolean flag)
		{
			throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.copyTypes(TypeTransformer.java:311)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.fixTypes(TypeTransformer.java:226)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:207)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
		//    0    0:new             #98  <Class RuntimeException>
		//    1    3:dup             
		//    2    4:ldc1            #124 <String "d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.copyTypes(TypeTransformer.java:311)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.fixTypes(TypeTransformer.java:226)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:207)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n">
		//    3    6:invokespecial   #129 <Method void Runtime(String)>
		//    4    9:athrow          
		}

		final DefaultDrmSession this$0;

		public PostRequestHandler(Looper looper)
		{
			this$0 = DefaultDrmSession.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #16  <Field DefaultDrmSession this$0>
			super(looper);
		//    3    5:aload_0         
		//    4    6:aload_2         
		//    5    7:invokespecial   #19  <Method void Handler(Looper)>
		//    6   10:return          
		}
	}

	private class PostResponseHandler extends Handler
	{

		public void handleMessage(Message message)
		{
			Object obj1 = ((Object) ((Pair)message.obj));
		//    0    0:aload_1         
		//    1    1:getfield        #28  <Field Object Message.obj>
		//    2    4:checkcast       #30  <Class Pair>
		//    3    7:astore_3        
			Object obj = ((Pair) (obj1)).first;
		//    4    8:aload_3         
		//    5    9:getfield        #33  <Field Object Pair.first>
		//    6   12:astore_2        
			obj1 = ((Pair) (obj1)).second;
		//    7   13:aload_3         
		//    8   14:getfield        #36  <Field Object Pair.second>
		//    9   17:astore_3        
			switch(message.what)
		//*  10   18:aload_1         
		//*  11   19:getfield        #40  <Field int Message.what>
			{
		//*  12   22:tableswitch     0 1: default 44
		//		               0 55
		//		               1 45
			default:
				return;
		//   13   44:return          

			case 1: // '\001'
				onKeyResponse(obj, obj1);
		//   14   45:aload_0         
		//   15   46:getfield        #16  <Field DefaultDrmSession this$0>
		//   16   49:aload_2         
		//   17   50:aload_3         
		//   18   51:invokestatic    #44  <Method void DefaultDrmSession.access$100(DefaultDrmSession, Object, Object)>
				return;
		//   19   54:return          

			case 0: // '\0'
				onProvisionResponse(obj, obj1);
		//   20   55:aload_0         
		//   21   56:getfield        #16  <Field DefaultDrmSession this$0>
		//   22   59:aload_2         
		//   23   60:aload_3         
		//   24   61:invokestatic    #47  <Method void DefaultDrmSession.access$000(DefaultDrmSession, Object, Object)>
				return;
		//   25   64:return          
			}
		}

		final DefaultDrmSession this$0;

		public PostResponseHandler(Looper looper)
		{
			this$0 = DefaultDrmSession.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #16  <Field DefaultDrmSession this$0>
			super(looper);
		//    3    5:aload_0         
		//    4    6:aload_2         
		//    5    7:invokespecial   #19  <Method void Handler(Looper)>
		//    6   10:return          
		}
	}

	public static interface ProvisioningManager
	{

		public abstract void onProvisionCompleted();

		public abstract void onProvisionError(Exception exception);

		public abstract void provisionRequired(DefaultDrmSession defaultdrmsession);
	}


	public DefaultDrmSession(UUID uuid1, ExoMediaDrm exomediadrm, ProvisioningManager provisioningmanager, DrmInitData.SchemeData schemedata, int i, byte abyte0[], HashMap hashmap, 
			MediaDrmCallback mediadrmcallback, Looper looper, DefaultDrmSessionEventListener.EventDispatcher eventdispatcher, int j)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #76  <Method void Object()>
		uuid = uuid1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #78  <Field UUID uuid>
		provisioningManager = provisioningmanager;
	//    5    9:aload_0         
	//    6   10:aload_3         
	//    7   11:putfield        #80  <Field DefaultDrmSession$ProvisioningManager provisioningManager>
		mediaDrm = exomediadrm;
	//    8   14:aload_0         
	//    9   15:aload_2         
	//   10   16:putfield        #82  <Field ExoMediaDrm mediaDrm>
		mode = i;
	//   11   19:aload_0         
	//   12   20:iload           5
	//   13   22:putfield        #84  <Field int mode>
		offlineLicenseKeySetId = abyte0;
	//   14   25:aload_0         
	//   15   26:aload           6
	//   16   28:putfield        #86  <Field byte[] offlineLicenseKeySetId>
		if(abyte0 != null)
	//*  17   31:aload           6
	//*  18   33:ifnonnull       39
	//*  19   36:goto            42
			schemedata = null;
	//   20   39:aconst_null     
	//   21   40:astore          4
		schemeData = schemedata;
	//   22   42:aload_0         
	//   23   43:aload           4
	//   24   45:putfield        #88  <Field DrmInitData$SchemeData schemeData>
		optionalKeyRequestParameters = hashmap;
	//   25   48:aload_0         
	//   26   49:aload           7
	//   27   51:putfield        #90  <Field HashMap optionalKeyRequestParameters>
		callback = mediadrmcallback;
	//   28   54:aload_0         
	//   29   55:aload           8
	//   30   57:putfield        #92  <Field MediaDrmCallback callback>
		initialDrmRequestRetryCount = j;
	//   31   60:aload_0         
	//   32   61:iload           11
	//   33   63:putfield        #94  <Field int initialDrmRequestRetryCount>
		eventDispatcher = eventdispatcher;
	//   34   66:aload_0         
	//   35   67:aload           10
	//   36   69:putfield        #96  <Field DefaultDrmSessionEventListener$EventDispatcher eventDispatcher>
		state = 2;
	//   37   72:aload_0         
	//   38   73:iconst_2        
	//   39   74:putfield        #98  <Field int state>
		postResponseHandler = new PostResponseHandler(looper);
	//   40   77:aload_0         
	//   41   78:new             #12  <Class DefaultDrmSession$PostResponseHandler>
	//   42   81:dup             
	//   43   82:aload_0         
	//   44   83:aload           9
	//   45   85:invokespecial   #101 <Method void DefaultDrmSession$PostResponseHandler(DefaultDrmSession, Looper)>
	//   46   88:putfield        #103 <Field DefaultDrmSession$PostResponseHandler postResponseHandler>
		requestHandlerThread = new HandlerThread("DrmRequestHandler");
	//   47   91:aload_0         
	//   48   92:new             #105 <Class HandlerThread>
	//   49   95:dup             
	//   50   96:ldc1            #107 <String "DrmRequestHandler">
	//   51   98:invokespecial   #110 <Method void HandlerThread(String)>
	//   52  101:putfield        #112 <Field HandlerThread requestHandlerThread>
		requestHandlerThread.start();
	//   53  104:aload_0         
	//   54  105:getfield        #112 <Field HandlerThread requestHandlerThread>
	//   55  108:invokevirtual   #115 <Method void HandlerThread.start()>
		postRequestHandler = new PostRequestHandler(requestHandlerThread.getLooper());
	//   56  111:aload_0         
	//   57  112:new             #9   <Class DefaultDrmSession$PostRequestHandler>
	//   58  115:dup             
	//   59  116:aload_0         
	//   60  117:aload_0         
	//   61  118:getfield        #112 <Field HandlerThread requestHandlerThread>
	//   62  121:invokevirtual   #119 <Method Looper HandlerThread.getLooper()>
	//   63  124:invokespecial   #120 <Method void DefaultDrmSession$PostRequestHandler(DefaultDrmSession, Looper)>
	//   64  127:putfield        #122 <Field DefaultDrmSession$PostRequestHandler postRequestHandler>
	//   65  130:return          
	}

	private void doLicense(boolean flag)
	{
		switch(mode)
	//*   0    0:aload_0         
	//*   1    1:getfield        #84  <Field int mode>
		{
	//*   2    4:tableswitch     0 3: default 36
	//	               0 79
	//	               1 79
	//	               2 51
	//	               3 37
		default:
			return;
	//    3   36:return          

		case 3: // '\003'
			if(restoreKeys())
	//*   4   37:aload_0         
	//*   5   38:invokespecial   #144 <Method boolean restoreKeys()>
	//*   6   41:ifeq            200
			{
				postKeyRequest(3, flag);
	//    7   44:aload_0         
	//    8   45:iconst_3        
	//    9   46:iload_1         
	//   10   47:invokespecial   #148 <Method void postKeyRequest(int, boolean)>
				return;
	//   11   50:return          
			}
			break;

		case 2: // '\002'
			if(offlineLicenseKeySetId == null)
	//*  12   51:aload_0         
	//*  13   52:getfield        #86  <Field byte[] offlineLicenseKeySetId>
	//*  14   55:ifnonnull       65
			{
				postKeyRequest(2, flag);
	//   15   58:aload_0         
	//   16   59:iconst_2        
	//   17   60:iload_1         
	//   18   61:invokespecial   #148 <Method void postKeyRequest(int, boolean)>
				return;
	//   19   64:return          
			}
			if(restoreKeys())
	//*  20   65:aload_0         
	//*  21   66:invokespecial   #144 <Method boolean restoreKeys()>
	//*  22   69:ifeq            200
			{
				postKeyRequest(2, flag);
	//   23   72:aload_0         
	//   24   73:iconst_2        
	//   25   74:iload_1         
	//   26   75:invokespecial   #148 <Method void postKeyRequest(int, boolean)>
				return;
	//   27   78:return          
			}
			break;

		case 0: // '\0'
		case 1: // '\001'
			if(offlineLicenseKeySetId == null)
	//*  28   79:aload_0         
	//*  29   80:getfield        #86  <Field byte[] offlineLicenseKeySetId>
	//*  30   83:ifnonnull       93
			{
				postKeyRequest(1, flag);
	//   31   86:aload_0         
	//   32   87:iconst_1        
	//   33   88:iload_1         
	//   34   89:invokespecial   #148 <Method void postKeyRequest(int, boolean)>
				return;
	//   35   92:return          
			}
			if(state != 4 && !restoreKeys())
				break;
	//   36   93:aload_0         
	//   37   94:getfield        #98  <Field int state>
	//   38   97:iconst_4        
	//   39   98:icmpeq          108
	//   40  101:aload_0         
	//   41  102:invokespecial   #144 <Method boolean restoreKeys()>
	//   42  105:ifeq            200
			long l = getLicenseDurationRemainingSec();
	//   43  108:aload_0         
	//   44  109:invokespecial   #152 <Method long getLicenseDurationRemainingSec()>
	//   45  112:lstore_2        
			if(mode == 0 && l <= 60L)
	//*  46  113:aload_0         
	//*  47  114:getfield        #84  <Field int mode>
	//*  48  117:ifne            170
	//*  49  120:lload_2         
	//*  50  121:ldc2w           #153 <Long 60L>
	//*  51  124:lcmp            
	//*  52  125:ifgt            170
			{
				StringBuilder stringbuilder = new StringBuilder();
	//   53  128:new             #156 <Class StringBuilder>
	//   54  131:dup             
	//   55  132:invokespecial   #157 <Method void StringBuilder()>
	//   56  135:astore          4
				stringbuilder.append("Offline license has expired or will expire soon. Remaining seconds: ");
	//   57  137:aload           4
	//   58  139:ldc1            #159 <String "Offline license has expired or will expire soon. Remaining seconds: ">
	//   59  141:invokevirtual   #163 <Method StringBuilder StringBuilder.append(String)>
	//   60  144:pop             
				stringbuilder.append(l);
	//   61  145:aload           4
	//   62  147:lload_2         
	//   63  148:invokevirtual   #166 <Method StringBuilder StringBuilder.append(long)>
	//   64  151:pop             
				Log.d("DefaultDrmSession", stringbuilder.toString());
	//   65  152:ldc1            #30  <String "DefaultDrmSession">
	//   66  154:aload           4
	//   67  156:invokevirtual   #170 <Method String StringBuilder.toString()>
	//   68  159:invokestatic    #176 <Method int Log.d(String, String)>
	//   69  162:pop             
				postKeyRequest(2, flag);
	//   70  163:aload_0         
	//   71  164:iconst_2        
	//   72  165:iload_1         
	//   73  166:invokespecial   #148 <Method void postKeyRequest(int, boolean)>
				return;
	//   74  169:return          
			}
			if(l <= 0L)
	//*  75  170:lload_2         
	//*  76  171:lconst_0        
	//*  77  172:lcmp            
	//*  78  173:ifgt            188
			{
				onError(((Exception) (new KeysExpiredException())));
	//   79  176:aload_0         
	//   80  177:new             #178 <Class KeysExpiredException>
	//   81  180:dup             
	//   82  181:invokespecial   #179 <Method void KeysExpiredException()>
	//   83  184:invokespecial   #183 <Method void onError(Exception)>
				return;
	//   84  187:return          
			}
			state = 4;
	//   85  188:aload_0         
	//   86  189:iconst_4        
	//   87  190:putfield        #98  <Field int state>
			eventDispatcher.drmKeysRestored();
	//   88  193:aload_0         
	//   89  194:getfield        #96  <Field DefaultDrmSessionEventListener$EventDispatcher eventDispatcher>
	//   90  197:invokevirtual   #188 <Method void DefaultDrmSessionEventListener$EventDispatcher.drmKeysRestored()>
			break;
		}
	//   91  200:return          
	}

	private long getLicenseDurationRemainingSec()
	{
		if(!C.WIDEVINE_UUID.equals(((Object) (uuid))))
	//*   0    0:getstatic       #193 <Field UUID C.WIDEVINE_UUID>
	//*   1    3:aload_0         
	//*   2    4:getfield        #78  <Field UUID uuid>
	//*   3    7:invokevirtual   #199 <Method boolean UUID.equals(Object)>
	//*   4   10:ifne            17
		{
			return 0xffffffffL;
	//    5   13:ldc2w           #200 <Long 0xffffffffL>
	//    6   16:lreturn         
		} else
		{
			Pair pair = WidevineUtil.getLicenseDurationRemainingSec(((DrmSession) (this)));
	//    7   17:aload_0         
	//    8   18:invokestatic    #206 <Method Pair WidevineUtil.getLicenseDurationRemainingSec(DrmSession)>
	//    9   21:astore_1        
			return Math.min(((Long)pair.first).longValue(), ((Long)pair.second).longValue());
	//   10   22:aload_1         
	//   11   23:getfield        #211 <Field Object Pair.first>
	//   12   26:checkcast       #213 <Class Long>
	//   13   29:invokevirtual   #216 <Method long Long.longValue()>
	//   14   32:aload_1         
	//   15   33:getfield        #219 <Field Object Pair.second>
	//   16   36:checkcast       #213 <Class Long>
	//   17   39:invokevirtual   #216 <Method long Long.longValue()>
	//   18   42:invokestatic    #225 <Method long Math.min(long, long)>
	//   19   45:lreturn         
		}
	}

	private boolean isOpen()
	{
		return state == 3 || state == 4;
	//    0    0:aload_0         
	//    1    1:getfield        #98  <Field int state>
	//    2    4:iconst_3        
	//    3    5:icmpeq          21
	//    4    8:aload_0         
	//    5    9:getfield        #98  <Field int state>
	//    6   12:iconst_4        
	//    7   13:icmpne          19
	//    8   16:goto            21
	//    9   19:iconst_0        
	//   10   20:ireturn         
	//   11   21:iconst_1        
	//   12   22:ireturn         
	}

	private void onError(Exception exception)
	{
		lastException = new DrmSession.DrmSessionException(((Throwable) (exception)));
	//    0    0:aload_0         
	//    1    1:new             #228 <Class DrmSession$DrmSessionException>
	//    2    4:dup             
	//    3    5:aload_1         
	//    4    6:invokespecial   #231 <Method void DrmSession$DrmSessionException(Throwable)>
	//    5    9:putfield        #233 <Field DrmSession$DrmSessionException lastException>
		eventDispatcher.drmSessionManagerError(exception);
	//    6   12:aload_0         
	//    7   13:getfield        #96  <Field DefaultDrmSessionEventListener$EventDispatcher eventDispatcher>
	//    8   16:aload_1         
	//    9   17:invokevirtual   #236 <Method void DefaultDrmSessionEventListener$EventDispatcher.drmSessionManagerError(Exception)>
		if(state != 4)
	//*  10   20:aload_0         
	//*  11   21:getfield        #98  <Field int state>
	//*  12   24:iconst_4        
	//*  13   25:icmpeq          33
			state = 1;
	//   14   28:aload_0         
	//   15   29:iconst_1        
	//   16   30:putfield        #98  <Field int state>
	//   17   33:return          
	}

	private void onKeyResponse(Object obj, Object obj1)
	{
		if(obj != currentKeyRequest)
			break MISSING_BLOCK_LABEL_144;
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #240 <Field Object currentKeyRequest>
	//    3    5:if_acmpne       144
		if(!isOpen())
	//*   4    8:aload_0         
	//*   5    9:invokespecial   #242 <Method boolean isOpen()>
	//*   6   12:ifne            16
			return;
	//    7   15:return          
		currentKeyRequest = null;
	//    8   16:aload_0         
	//    9   17:aconst_null     
	//   10   18:putfield        #240 <Field Object currentKeyRequest>
		if(obj1 instanceof Exception)
	//*  11   21:aload_2         
	//*  12   22:instanceof      #238 <Class Exception>
	//*  13   25:ifeq            37
		{
			onKeysError((Exception)obj1);
	//   14   28:aload_0         
	//   15   29:aload_2         
	//   16   30:checkcast       #238 <Class Exception>
	//   17   33:invokespecial   #245 <Method void onKeysError(Exception)>
			return;
	//   18   36:return          
		}
		try
		{
			obj = ((Object) ((byte[])obj1));
	//   19   37:aload_2         
	//   20   38:checkcast       #246 <Class byte[]>
	//   21   41:astore_1        
			if(mode == 3)
	//*  22   42:aload_0         
	//*  23   43:getfield        #84  <Field int mode>
	//*  24   46:iconst_3        
	//*  25   47:icmpne          73
			{
				mediaDrm.provideKeyResponse(offlineLicenseKeySetId, ((byte []) (obj)));
	//   26   50:aload_0         
	//   27   51:getfield        #82  <Field ExoMediaDrm mediaDrm>
	//   28   54:aload_0         
	//   29   55:getfield        #86  <Field byte[] offlineLicenseKeySetId>
	//   30   58:aload_1         
	//   31   59:invokeinterface #252 <Method byte[] ExoMediaDrm.provideKeyResponse(byte[], byte[])>
	//   32   64:pop             
				eventDispatcher.drmKeysRemoved();
	//   33   65:aload_0         
	//   34   66:getfield        #96  <Field DefaultDrmSessionEventListener$EventDispatcher eventDispatcher>
	//   35   69:invokevirtual   #255 <Method void DefaultDrmSessionEventListener$EventDispatcher.drmKeysRemoved()>
				return;
	//   36   72:return          
			}
		}
	//*  37   73:aload_0         
	//*  38   74:getfield        #82  <Field ExoMediaDrm mediaDrm>
	//*  39   77:aload_0         
	//*  40   78:getfield        #257 <Field byte[] sessionId>
	//*  41   81:aload_1         
	//*  42   82:invokeinterface #252 <Method byte[] ExoMediaDrm.provideKeyResponse(byte[], byte[])>
	//*  43   87:astore_1        
	//*  44   88:aload_0         
	//*  45   89:getfield        #84  <Field int mode>
	//*  46   92:iconst_2        
	//*  47   93:icmpeq          110
	//*  48   96:aload_0         
	//*  49   97:getfield        #84  <Field int mode>
	//*  50  100:ifne            124
	//*  51  103:aload_0         
	//*  52  104:getfield        #86  <Field byte[] offlineLicenseKeySetId>
	//*  53  107:ifnull          124
	//*  54  110:aload_1         
	//*  55  111:ifnull          124
	//*  56  114:aload_1         
	//*  57  115:arraylength     
	//*  58  116:ifeq            124
	//*  59  119:aload_0         
	//*  60  120:aload_1         
	//*  61  121:putfield        #86  <Field byte[] offlineLicenseKeySetId>
	//*  62  124:aload_0         
	//*  63  125:iconst_4        
	//*  64  126:putfield        #98  <Field int state>
	//*  65  129:aload_0         
	//*  66  130:getfield        #96  <Field DefaultDrmSessionEventListener$EventDispatcher eventDispatcher>
	//*  67  133:invokevirtual   #260 <Method void DefaultDrmSessionEventListener$EventDispatcher.drmKeysLoaded()>
	//*  68  136:return          
		// Misplaced declaration of an exception variable
		catch(Object obj)
	//*  69  137:astore_1        
		{
			onKeysError(((Exception) (obj)));
	//   70  138:aload_0         
	//   71  139:aload_1         
	//   72  140:invokespecial   #245 <Method void onKeysError(Exception)>
			return;
	//   73  143:return          
		}
		obj = ((Object) (mediaDrm.provideKeyResponse(sessionId, ((byte []) (obj)))));
		if(mode != 2 && (mode != 0 || offlineLicenseKeySetId == null) || obj == null)
			break MISSING_BLOCK_LABEL_124;
		if(obj.length != 0)
			offlineLicenseKeySetId = ((byte []) (obj));
		state = 4;
		eventDispatcher.drmKeysLoaded();
		return;
	//   74  144:return          
	}

	private void onKeysError(Exception exception)
	{
		if(exception instanceof NotProvisionedException)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #262 <Class NotProvisionedException>
	//*   2    4:ifeq            18
		{
			provisioningManager.provisionRequired(this);
	//    3    7:aload_0         
	//    4    8:getfield        #80  <Field DefaultDrmSession$ProvisioningManager provisioningManager>
	//    5   11:aload_0         
	//    6   12:invokeinterface #266 <Method void DefaultDrmSession$ProvisioningManager.provisionRequired(DefaultDrmSession)>
			return;
	//    7   17:return          
		} else
		{
			onError(exception);
	//    8   18:aload_0         
	//    9   19:aload_1         
	//   10   20:invokespecial   #183 <Method void onError(Exception)>
			return;
	//   11   23:return          
		}
	}

	private void onKeysExpired()
	{
		if(state == 4)
	//*   0    0:aload_0         
	//*   1    1:getfield        #98  <Field int state>
	//*   2    4:iconst_4        
	//*   3    5:icmpne          24
		{
			state = 3;
	//    4    8:aload_0         
	//    5    9:iconst_3        
	//    6   10:putfield        #98  <Field int state>
			onError(((Exception) (new KeysExpiredException())));
	//    7   13:aload_0         
	//    8   14:new             #178 <Class KeysExpiredException>
	//    9   17:dup             
	//   10   18:invokespecial   #179 <Method void KeysExpiredException()>
	//   11   21:invokespecial   #183 <Method void onError(Exception)>
		}
	//   12   24:return          
	}

	private void onProvisionResponse(Object obj, Object obj1)
	{
		if(obj == currentProvisionRequest)
	//*   0    0:aload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #269 <Field Object currentProvisionRequest>
	//*   3    5:if_acmpne       85
		{
			if(state != 2 && !isOpen())
	//*   4    8:aload_0         
	//*   5    9:getfield        #98  <Field int state>
	//*   6   12:iconst_2        
	//*   7   13:icmpeq          24
	//*   8   16:aload_0         
	//*   9   17:invokespecial   #242 <Method boolean isOpen()>
	//*  10   20:ifne            24
				return;
	//   11   23:return          
			currentProvisionRequest = null;
	//   12   24:aload_0         
	//   13   25:aconst_null     
	//   14   26:putfield        #269 <Field Object currentProvisionRequest>
			if(obj1 instanceof Exception)
	//*  15   29:aload_2         
	//*  16   30:instanceof      #238 <Class Exception>
	//*  17   33:ifeq            50
			{
				provisioningManager.onProvisionError((Exception)obj1);
	//   18   36:aload_0         
	//   19   37:getfield        #80  <Field DefaultDrmSession$ProvisioningManager provisioningManager>
	//   20   40:aload_2         
	//   21   41:checkcast       #238 <Class Exception>
	//   22   44:invokeinterface #272 <Method void DefaultDrmSession$ProvisioningManager.onProvisionError(Exception)>
				return;
	//   23   49:return          
			}
			try
			{
				mediaDrm.provideProvisionResponse((byte[])obj1);
	//   24   50:aload_0         
	//   25   51:getfield        #82  <Field ExoMediaDrm mediaDrm>
	//   26   54:aload_2         
	//   27   55:checkcast       #246 <Class byte[]>
	//   28   58:invokeinterface #276 <Method void ExoMediaDrm.provideProvisionResponse(byte[])>
			}
	//*  29   63:aload_0         
	//*  30   64:getfield        #80  <Field DefaultDrmSession$ProvisioningManager provisioningManager>
	//*  31   67:invokeinterface #279 <Method void DefaultDrmSession$ProvisioningManager.onProvisionCompleted()>
	//*  32   72:return          
			// Misplaced declaration of an exception variable
			catch(Object obj)
	//*  33   73:astore_1        
			{
				provisioningManager.onProvisionError(((Exception) (obj)));
	//   34   74:aload_0         
	//   35   75:getfield        #80  <Field DefaultDrmSession$ProvisioningManager provisioningManager>
	//   36   78:aload_1         
	//   37   79:invokeinterface #272 <Method void DefaultDrmSession$ProvisioningManager.onProvisionError(Exception)>
				return;
	//   38   84:return          
			}
			provisioningManager.onProvisionCompleted();
			return;
		} else
		{
			return;
	//   39   85:return          
		}
	}

	private boolean openInternal(boolean flag)
	{
		if(isOpen())
	//*   0    0:aload_0         
	//*   1    1:invokespecial   #242 <Method boolean isOpen()>
	//*   2    4:ifeq            9
			return true;
	//    3    7:iconst_1        
	//    4    8:ireturn         
		sessionId = mediaDrm.openSession();
	//    5    9:aload_0         
	//    6   10:aload_0         
	//    7   11:getfield        #82  <Field ExoMediaDrm mediaDrm>
	//    8   14:invokeinterface #285 <Method byte[] ExoMediaDrm.openSession()>
	//    9   19:putfield        #257 <Field byte[] sessionId>
		mediaCrypto = mediaDrm.createMediaCrypto(sessionId);
	//   10   22:aload_0         
	//   11   23:aload_0         
	//   12   24:getfield        #82  <Field ExoMediaDrm mediaDrm>
	//   13   27:aload_0         
	//   14   28:getfield        #257 <Field byte[] sessionId>
	//   15   31:invokeinterface #289 <Method ExoMediaCrypto ExoMediaDrm.createMediaCrypto(byte[])>
	//   16   36:putfield        #291 <Field ExoMediaCrypto mediaCrypto>
		state = 3;
	//   17   39:aload_0         
	//   18   40:iconst_3        
	//   19   41:putfield        #98  <Field int state>
		return true;
	//   20   44:iconst_1        
	//   21   45:ireturn         
		Object obj;
		obj;
	//   22   46:astore_2        
		onError(((Exception) (obj)));
	//   23   47:aload_0         
	//   24   48:aload_2         
	//   25   49:invokespecial   #183 <Method void onError(Exception)>
		break MISSING_BLOCK_LABEL_78;
	//   26   52:goto            78
		obj;
	//   27   55:astore_2        
		if(flag)
	//*  28   56:iload_1         
	//*  29   57:ifeq            73
			provisioningManager.provisionRequired(this);
	//   30   60:aload_0         
	//   31   61:getfield        #80  <Field DefaultDrmSession$ProvisioningManager provisioningManager>
	//   32   64:aload_0         
	//   33   65:invokeinterface #266 <Method void DefaultDrmSession$ProvisioningManager.provisionRequired(DefaultDrmSession)>
		else
	//*  34   70:goto            78
			onError(((Exception) (obj)));
	//   35   73:aload_0         
	//   36   74:aload_2         
	//   37   75:invokespecial   #183 <Method void onError(Exception)>
		return false;
	//   38   78:iconst_0        
	//   39   79:ireturn         
	}

	private void postKeyRequest(int i, boolean flag)
	{
		byte abyte0[];
		if(i == 3)
	//*   0    0:iload_1         
	//*   1    1:iconst_3        
	//*   2    2:icmpne          14
			abyte0 = offlineLicenseKeySetId;
	//    3    5:aload_0         
	//    4    6:getfield        #86  <Field byte[] offlineLicenseKeySetId>
	//    5    9:astore          4
		else
	//*   6   11:goto            23
			abyte0 = sessionId;
	//    7   14:aload_0         
	//    8   15:getfield        #257 <Field byte[] sessionId>
	//    9   18:astore          4
	//*  10   20:goto            11
		String s1;
		byte abyte2[];
		String s2;
		if(schemeData != null)
	//*  11   23:aload_0         
	//*  12   24:getfield        #88  <Field DrmInitData$SchemeData schemeData>
	//*  13   27:ifnull          66
		{
			byte abyte1[] = schemeData.data;
	//   14   30:aload_0         
	//   15   31:getfield        #88  <Field DrmInitData$SchemeData schemeData>
	//   16   34:getfield        #296 <Field byte[] DrmInitData$SchemeData.data>
	//   17   37:astore          5
			String s = schemeData.mimeType;
	//   18   39:aload_0         
	//   19   40:getfield        #88  <Field DrmInitData$SchemeData schemeData>
	//   20   43:getfield        #299 <Field String DrmInitData$SchemeData.mimeType>
	//   21   46:astore_3        
			s1 = schemeData.licenseServerUrl;
	//   22   47:aload_0         
	//   23   48:getfield        #88  <Field DrmInitData$SchemeData schemeData>
	//   24   51:getfield        #302 <Field String DrmInitData$SchemeData.licenseServerUrl>
	//   25   54:astore          6
			abyte2 = abyte1;
	//   26   56:aload           5
	//   27   58:astore          7
			s2 = s;
	//   28   60:aload_3         
	//   29   61:astore          8
		} else
	//*  30   63:goto            82
		{
			Object obj1 = null;
	//   31   66:aconst_null     
	//   32   67:astore          5
			Object obj = obj1;
	//   33   69:aload           5
	//   34   71:astore_3        
			s2 = ((String) (obj));
	//   35   72:aload_3         
	//   36   73:astore          8
			abyte2 = ((byte []) (obj));
	//   37   75:aload_3         
	//   38   76:astore          7
			s1 = ((String) (obj1));
	//   39   78:aload           5
	//   40   80:astore          6
		}
		try
		{
			currentKeyRequest = ((Object) (Pair.create(((Object) (mediaDrm.getKeyRequest(abyte0, abyte2, s2, i, optionalKeyRequestParameters))), ((Object) (s1)))));
	//   41   82:aload_0         
	//   42   83:aload_0         
	//   43   84:getfield        #82  <Field ExoMediaDrm mediaDrm>
	//   44   87:aload           4
	//   45   89:aload           7
	//   46   91:aload           8
	//   47   93:iload_1         
	//   48   94:aload_0         
	//   49   95:getfield        #90  <Field HashMap optionalKeyRequestParameters>
	//   50   98:invokeinterface #306 <Method ExoMediaDrm$KeyRequest ExoMediaDrm.getKeyRequest(byte[], byte[], String, int, HashMap)>
	//   51  103:aload           6
	//   52  105:invokestatic    #310 <Method Pair Pair.create(Object, Object)>
	//   53  108:putfield        #240 <Field Object currentKeyRequest>
			postRequestHandler.post(1, currentKeyRequest, flag);
	//   54  111:aload_0         
	//   55  112:getfield        #122 <Field DefaultDrmSession$PostRequestHandler postRequestHandler>
	//   56  115:iconst_1        
	//   57  116:aload_0         
	//   58  117:getfield        #240 <Field Object currentKeyRequest>
	//   59  120:iload_2         
	//   60  121:invokevirtual   #314 <Method void DefaultDrmSession$PostRequestHandler.post(int, Object, boolean)>
			return;
	//   61  124:return          
		}
		catch(Exception exception)
	//*  62  125:astore_3        
		{
			onKeysError(exception);
	//   63  126:aload_0         
	//   64  127:aload_3         
	//   65  128:invokespecial   #245 <Method void onKeysError(Exception)>
		}
	//   66  131:return          
	}

	private boolean restoreKeys()
	{
		try
		{
			mediaDrm.restoreKeys(sessionId, offlineLicenseKeySetId);
	//    0    0:aload_0         
	//    1    1:getfield        #82  <Field ExoMediaDrm mediaDrm>
	//    2    4:aload_0         
	//    3    5:getfield        #257 <Field byte[] sessionId>
	//    4    8:aload_0         
	//    5    9:getfield        #86  <Field byte[] offlineLicenseKeySetId>
	//    6   12:invokeinterface #317 <Method void ExoMediaDrm.restoreKeys(byte[], byte[])>
		}
	//*   7   17:iconst_1        
	//*   8   18:ireturn         
		catch(Exception exception)
	//*   9   19:astore_1        
		{
			Log.e("DefaultDrmSession", "Error trying to restore Widevine keys.", ((Throwable) (exception)));
	//   10   20:ldc1            #30  <String "DefaultDrmSession">
	//   11   22:ldc2            #319 <String "Error trying to restore Widevine keys.">
	//   12   25:aload_1         
	//   13   26:invokestatic    #323 <Method int Log.e(String, String, Throwable)>
	//   14   29:pop             
			onError(exception);
	//   15   30:aload_0         
	//   16   31:aload_1         
	//   17   32:invokespecial   #183 <Method void onError(Exception)>
			return false;
	//   18   35:iconst_0        
	//   19   36:ireturn         
		}
		return true;
	}

	public void acquire()
	{
		int i = openCount + 1;
	//    0    0:aload_0         
	//    1    1:getfield        #326 <Field int openCount>
	//    2    4:iconst_1        
	//    3    5:iadd            
	//    4    6:istore_1        
		openCount = i;
	//    5    7:aload_0         
	//    6    8:iload_1         
	//    7    9:putfield        #326 <Field int openCount>
		if(i == 1)
	//*   8   12:iload_1         
	//*   9   13:iconst_1        
	//*  10   14:icmpne          39
		{
			if(state == 1)
	//*  11   17:aload_0         
	//*  12   18:getfield        #98  <Field int state>
	//*  13   21:iconst_1        
	//*  14   22:icmpne          26
				return;
	//   15   25:return          
			if(openInternal(true))
	//*  16   26:aload_0         
	//*  17   27:iconst_1        
	//*  18   28:invokespecial   #328 <Method boolean openInternal(boolean)>
	//*  19   31:ifeq            39
				doLicense(true);
	//   20   34:aload_0         
	//   21   35:iconst_1        
	//   22   36:invokespecial   #330 <Method void doLicense(boolean)>
		}
	//   23   39:return          
	}

	public final DrmSession.DrmSessionException getError()
	{
		if(state == 1)
	//*   0    0:aload_0         
	//*   1    1:getfield        #98  <Field int state>
	//*   2    4:iconst_1        
	//*   3    5:icmpne          13
			return lastException;
	//    4    8:aload_0         
	//    5    9:getfield        #233 <Field DrmSession$DrmSessionException lastException>
	//    6   12:areturn         
		else
			return null;
	//    7   13:aconst_null     
	//    8   14:areturn         
	}

	public final ExoMediaCrypto getMediaCrypto()
	{
		return mediaCrypto;
	//    0    0:aload_0         
	//    1    1:getfield        #291 <Field ExoMediaCrypto mediaCrypto>
	//    2    4:areturn         
	}

	public byte[] getOfflineLicenseKeySetId()
	{
		return offlineLicenseKeySetId;
	//    0    0:aload_0         
	//    1    1:getfield        #86  <Field byte[] offlineLicenseKeySetId>
	//    2    4:areturn         
	}

	public final int getState()
	{
		return state;
	//    0    0:aload_0         
	//    1    1:getfield        #98  <Field int state>
	//    2    4:ireturn         
	}

	public boolean hasInitData(byte abyte0[])
	{
		byte abyte1[];
		if(schemeData != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #88  <Field DrmInitData$SchemeData schemeData>
	//*   2    4:ifnull          18
			abyte1 = schemeData.data;
	//    3    7:aload_0         
	//    4    8:getfield        #88  <Field DrmInitData$SchemeData schemeData>
	//    5   11:getfield        #296 <Field byte[] DrmInitData$SchemeData.data>
	//    6   14:astore_2        
		else
	//*   7   15:goto            20
			abyte1 = null;
	//    8   18:aconst_null     
	//    9   19:astore_2        
		return Arrays.equals(abyte1, abyte0);
	//   10   20:aload_2         
	//   11   21:aload_1         
	//   12   22:invokestatic    #345 <Method boolean Arrays.equals(byte[], byte[])>
	//   13   25:ireturn         
	}

	public boolean hasSessionId(byte abyte0[])
	{
		return Arrays.equals(sessionId, abyte0);
	//    0    0:aload_0         
	//    1    1:getfield        #257 <Field byte[] sessionId>
	//    2    4:aload_1         
	//    3    5:invokestatic    #345 <Method boolean Arrays.equals(byte[], byte[])>
	//    4    8:ireturn         
	}

	public void onMediaDrmEvent(int i)
	{
		if(!isOpen())
	//*   0    0:aload_0         
	//*   1    1:invokespecial   #242 <Method boolean isOpen()>
	//*   2    4:ifne            8
			return;
	//    3    7:return          
		switch(i)
	//*   4    8:iload_1         
		{
	//*   5    9:tableswitch     1 3: default 36
	//	               1 48
	//	               2 42
	//	               3 37
		default:
			return;
	//    6   36:return          

		case 3: // '\003'
			onKeysExpired();
	//    7   37:aload_0         
	//    8   38:invokespecial   #350 <Method void onKeysExpired()>
			return;
	//    9   41:return          

		case 2: // '\002'
			doLicense(false);
	//   10   42:aload_0         
	//   11   43:iconst_0        
	//   12   44:invokespecial   #330 <Method void doLicense(boolean)>
			return;
	//   13   47:return          

		case 1: // '\001'
			state = 3;
	//   14   48:aload_0         
	//   15   49:iconst_3        
	//   16   50:putfield        #98  <Field int state>
			provisioningManager.provisionRequired(this);
	//   17   53:aload_0         
	//   18   54:getfield        #80  <Field DefaultDrmSession$ProvisioningManager provisioningManager>
	//   19   57:aload_0         
	//   20   58:invokeinterface #266 <Method void DefaultDrmSession$ProvisioningManager.provisionRequired(DefaultDrmSession)>
			return;
	//   21   63:return          
		}
	}

	public void onProvisionCompleted()
	{
		if(openInternal(false))
	//*   0    0:aload_0         
	//*   1    1:iconst_0        
	//*   2    2:invokespecial   #328 <Method boolean openInternal(boolean)>
	//*   3    5:ifeq            13
			doLicense(true);
	//    4    8:aload_0         
	//    5    9:iconst_1        
	//    6   10:invokespecial   #330 <Method void doLicense(boolean)>
	//    7   13:return          
	}

	public void onProvisionError(Exception exception)
	{
		onError(exception);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #183 <Method void onError(Exception)>
	//    3    5:return          
	}

	public void provision()
	{
		currentProvisionRequest = ((Object) (mediaDrm.getProvisionRequest()));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #82  <Field ExoMediaDrm mediaDrm>
	//    3    5:invokeinterface #355 <Method ExoMediaDrm$ProvisionRequest ExoMediaDrm.getProvisionRequest()>
	//    4   10:putfield        #269 <Field Object currentProvisionRequest>
		postRequestHandler.post(0, currentProvisionRequest, true);
	//    5   13:aload_0         
	//    6   14:getfield        #122 <Field DefaultDrmSession$PostRequestHandler postRequestHandler>
	//    7   17:iconst_0        
	//    8   18:aload_0         
	//    9   19:getfield        #269 <Field Object currentProvisionRequest>
	//   10   22:iconst_1        
	//   11   23:invokevirtual   #314 <Method void DefaultDrmSession$PostRequestHandler.post(int, Object, boolean)>
	//   12   26:return          
	}

	public Map queryKeyStatus()
	{
		if(sessionId == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #257 <Field byte[] sessionId>
	//*   2    4:ifnonnull       9
			return null;
	//    3    7:aconst_null     
	//    4    8:areturn         
		else
			return mediaDrm.queryKeyStatus(sessionId);
	//    5    9:aload_0         
	//    6   10:getfield        #82  <Field ExoMediaDrm mediaDrm>
	//    7   13:aload_0         
	//    8   14:getfield        #257 <Field byte[] sessionId>
	//    9   17:invokeinterface #360 <Method Map ExoMediaDrm.queryKeyStatus(byte[])>
	//   10   22:areturn         
	}

	public boolean release()
	{
		int i = openCount - 1;
	//    0    0:aload_0         
	//    1    1:getfield        #326 <Field int openCount>
	//    2    4:iconst_1        
	//    3    5:isub            
	//    4    6:istore_1        
		openCount = i;
	//    5    7:aload_0         
	//    6    8:iload_1         
	//    7    9:putfield        #326 <Field int openCount>
		if(i == 0)
	//*   8   12:iload_1         
	//*   9   13:ifne            102
		{
			state = 0;
	//   10   16:aload_0         
	//   11   17:iconst_0        
	//   12   18:putfield        #98  <Field int state>
			postResponseHandler.removeCallbacksAndMessages(((Object) (null)));
	//   13   21:aload_0         
	//   14   22:getfield        #103 <Field DefaultDrmSession$PostResponseHandler postResponseHandler>
	//   15   25:aconst_null     
	//   16   26:invokevirtual   #366 <Method void DefaultDrmSession$PostResponseHandler.removeCallbacksAndMessages(Object)>
			postRequestHandler.removeCallbacksAndMessages(((Object) (null)));
	//   17   29:aload_0         
	//   18   30:getfield        #122 <Field DefaultDrmSession$PostRequestHandler postRequestHandler>
	//   19   33:aconst_null     
	//   20   34:invokevirtual   #367 <Method void DefaultDrmSession$PostRequestHandler.removeCallbacksAndMessages(Object)>
			postRequestHandler = null;
	//   21   37:aload_0         
	//   22   38:aconst_null     
	//   23   39:putfield        #122 <Field DefaultDrmSession$PostRequestHandler postRequestHandler>
			requestHandlerThread.quit();
	//   24   42:aload_0         
	//   25   43:getfield        #112 <Field HandlerThread requestHandlerThread>
	//   26   46:invokevirtual   #370 <Method boolean HandlerThread.quit()>
	//   27   49:pop             
			requestHandlerThread = null;
	//   28   50:aload_0         
	//   29   51:aconst_null     
	//   30   52:putfield        #112 <Field HandlerThread requestHandlerThread>
			mediaCrypto = null;
	//   31   55:aload_0         
	//   32   56:aconst_null     
	//   33   57:putfield        #291 <Field ExoMediaCrypto mediaCrypto>
			lastException = null;
	//   34   60:aload_0         
	//   35   61:aconst_null     
	//   36   62:putfield        #233 <Field DrmSession$DrmSessionException lastException>
			currentKeyRequest = null;
	//   37   65:aload_0         
	//   38   66:aconst_null     
	//   39   67:putfield        #240 <Field Object currentKeyRequest>
			currentProvisionRequest = null;
	//   40   70:aload_0         
	//   41   71:aconst_null     
	//   42   72:putfield        #269 <Field Object currentProvisionRequest>
			if(sessionId != null)
	//*  43   75:aload_0         
	//*  44   76:getfield        #257 <Field byte[] sessionId>
	//*  45   79:ifnull          100
			{
				mediaDrm.closeSession(sessionId);
	//   46   82:aload_0         
	//   47   83:getfield        #82  <Field ExoMediaDrm mediaDrm>
	//   48   86:aload_0         
	//   49   87:getfield        #257 <Field byte[] sessionId>
	//   50   90:invokeinterface #373 <Method void ExoMediaDrm.closeSession(byte[])>
				sessionId = null;
	//   51   95:aload_0         
	//   52   96:aconst_null     
	//   53   97:putfield        #257 <Field byte[] sessionId>
			}
			return true;
	//   54  100:iconst_1        
	//   55  101:ireturn         
		} else
		{
			return false;
	//   56  102:iconst_0        
	//   57  103:ireturn         
		}
	}

	private static final int MAX_LICENSE_DURATION_TO_RENEW = 60;
	private static final int MSG_KEYS = 1;
	private static final int MSG_PROVISION = 0;
	private static final String TAG = "DefaultDrmSession";
	final MediaDrmCallback callback;
	private Object currentKeyRequest;
	private Object currentProvisionRequest;
	private final DefaultDrmSessionEventListener.EventDispatcher eventDispatcher;
	private final int initialDrmRequestRetryCount;
	private DrmSession.DrmSessionException lastException;
	private ExoMediaCrypto mediaCrypto;
	private final ExoMediaDrm mediaDrm;
	private final int mode;
	private byte offlineLicenseKeySetId[];
	private int openCount;
	private final HashMap optionalKeyRequestParameters;
	private PostRequestHandler postRequestHandler;
	final PostResponseHandler postResponseHandler;
	private final ProvisioningManager provisioningManager;
	private HandlerThread requestHandlerThread;
	private final DrmInitData.SchemeData schemeData;
	private byte sessionId[];
	private int state;
	final UUID uuid;


/*
	static void access$000(DefaultDrmSession defaultdrmsession, Object obj, Object obj1)
	{
		defaultdrmsession.onProvisionResponse(obj, obj1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #132 <Method void onProvisionResponse(Object, Object)>
		return;
	//    4    6:return          
	}

*/


/*
	static void access$100(DefaultDrmSession defaultdrmsession, Object obj, Object obj1)
	{
		defaultdrmsession.onKeyResponse(obj, obj1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #136 <Method void onKeyResponse(Object, Object)>
		return;
	//    4    6:return          
	}

*/


/*
	static int access$200(DefaultDrmSession defaultdrmsession)
	{
		return defaultdrmsession.initialDrmRequestRetryCount;
	//    0    0:aload_0         
	//    1    1:getfield        #94  <Field int initialDrmRequestRetryCount>
	//    2    4:ireturn         
	}

*/
}

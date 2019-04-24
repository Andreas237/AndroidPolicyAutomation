// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.drm;

import android.os.*;
import android.util.Pair;

// Referenced classes of package com.google.android.exoplayer2.drm:
//			DefaultDrmSession, MediaDrmCallback

private class DefaultDrmSession$PostRequestHandler extends Handler
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
		if(i > DefaultDrmSession.access$200(DefaultDrmSession.this))
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
	//	               0 86
	//	               1 35;
	//    5    9:tableswitch     0 1: default 154
	//	               0 86
	//	               1 35
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
	//*  23   71:getfield        #84  <Field java.util.UUID DefaultDrmSession.uuid>
	//*  24   74:aload_2         
	//*  25   75:aload           4
	//*  26   77:invokeinterface #90  <Method byte[] MediaDrmCallback.executeKeyRequest(java.util.UUID, ExoMediaDrm$KeyRequest, String)>
	//*  27   82:astore_2        
	//*  28   83:goto            131
_L2:
		obj = ((Object) (callback.executeProvisionRequest(uuid, (ExoMediaDrm.ProvisionRequest)obj1)));
	//   29   86:aload_0         
	//   30   87:getfield        #16  <Field DefaultDrmSession this$0>
	//   31   90:getfield        #80  <Field MediaDrmCallback DefaultDrmSession.callback>
	//   32   93:aload_0         
	//   33   94:getfield        #16  <Field DefaultDrmSession this$0>
	//   34   97:getfield        #84  <Field java.util.UUID DefaultDrmSession.uuid>
	//   35  100:aload_3         
	//   36  101:checkcast       #92  <Class ExoMediaDrm$ProvisionRequest>
	//   37  104:invokeinterface #96  <Method byte[] MediaDrmCallback.executeProvisionRequest(java.util.UUID, ExoMediaDrm$ProvisionRequest)>
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

	public DefaultDrmSession$PostRequestHandler(Looper looper)
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

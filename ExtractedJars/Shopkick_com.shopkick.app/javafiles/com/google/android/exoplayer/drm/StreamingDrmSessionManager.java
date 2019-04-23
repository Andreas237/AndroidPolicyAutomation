// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer.drm;

import android.media.*;
import android.os.*;
import android.text.TextUtils;
import com.google.android.exoplayer.extractor.mp4.PsshAtomUtil;
import com.google.android.exoplayer.util.Util;
import java.util.HashMap;
import java.util.UUID;

// Referenced classes of package com.google.android.exoplayer.drm:
//			DrmSessionManager, UnsupportedDrmException, ExoMediaDrm, FrameworkMediaDrm, 
//			DrmInitData, ExoMediaCrypto, MediaDrmCallback, KeysExpiredException

public class StreamingDrmSessionManager
	implements DrmSessionManager
{
	public static interface EventListener
	{

		public abstract void onDrmKeysLoaded();

		public abstract void onDrmSessionManagerError(Exception exception);
	}

	private class MediaDrmEventListener
		implements ExoMediaDrm.OnEventListener
	{

		public void onEvent(ExoMediaDrm exomediadrm, byte abyte0[], int i, int j, byte abyte1[])
		{
			mediaDrmHandler.sendEmptyMessage(i);
		//    0    0:aload_0         
		//    1    1:getfield        #16  <Field StreamingDrmSessionManager this$0>
		//    2    4:getfield        #29  <Field StreamingDrmSessionManager$MediaDrmHandler StreamingDrmSessionManager.mediaDrmHandler>
		//    3    7:iload_3         
		//    4    8:invokevirtual   #35  <Method boolean StreamingDrmSessionManager$MediaDrmHandler.sendEmptyMessage(int)>
		//    5   11:pop             
		//    6   12:return          
		}

		final StreamingDrmSessionManager this$0;

		private MediaDrmEventListener()
		{
			this$0 = StreamingDrmSessionManager.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #16  <Field StreamingDrmSessionManager this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #19  <Method void Object()>
		//    5    9:return          
		}

	}

	private class MediaDrmHandler extends Handler
	{

		public void handleMessage(Message message)
		{
			if(openCount != 0)
		//*   0    0:aload_0         
		//*   1    1:getfield        #16  <Field StreamingDrmSessionManager this$0>
		//*   2    4:invokestatic    #26  <Method int StreamingDrmSessionManager.access$200(StreamingDrmSessionManager)>
		//*   3    7:ifeq            114
			{
				if(state != 3 && state != 4)
		//*   4   10:aload_0         
		//*   5   11:getfield        #16  <Field StreamingDrmSessionManager this$0>
		//*   6   14:invokestatic    #29  <Method int StreamingDrmSessionManager.access$300(StreamingDrmSessionManager)>
		//*   7   17:iconst_3        
		//*   8   18:icmpeq          33
		//*   9   21:aload_0         
		//*  10   22:getfield        #16  <Field StreamingDrmSessionManager this$0>
		//*  11   25:invokestatic    #29  <Method int StreamingDrmSessionManager.access$300(StreamingDrmSessionManager)>
		//*  12   28:iconst_4        
		//*  13   29:icmpeq          33
					return;
		//   14   32:return          
				switch(message.what)
		//*  15   33:aload_1         
		//*  16   34:getfield        #35  <Field int Message.what>
				{
		//*  17   37:tableswitch     1 3: default 64
		//		               1 97
		//		               2 89
		//		               3 65
				default:
					return;
		//   18   64:return          

				case 3: // '\003'
					state = 3;
		//   19   65:aload_0         
		//   20   66:getfield        #16  <Field StreamingDrmSessionManager this$0>
		//   21   69:iconst_3        
		//   22   70:invokestatic    #39  <Method int StreamingDrmSessionManager.access$302(StreamingDrmSessionManager, int)>
		//   23   73:pop             
					onError(((Exception) (new KeysExpiredException())));
		//   24   74:aload_0         
		//   25   75:getfield        #16  <Field StreamingDrmSessionManager this$0>
		//   26   78:new             #41  <Class KeysExpiredException>
		//   27   81:dup             
		//   28   82:invokespecial   #44  <Method void KeysExpiredException()>
		//   29   85:invokestatic    #48  <Method void StreamingDrmSessionManager.access$500(StreamingDrmSessionManager, Exception)>
					return;
		//   30   88:return          

				case 2: // '\002'
					postKeyRequest();
		//   31   89:aload_0         
		//   32   90:getfield        #16  <Field StreamingDrmSessionManager this$0>
		//   33   93:invokestatic    #52  <Method void StreamingDrmSessionManager.access$400(StreamingDrmSessionManager)>
					return;
		//   34   96:return          

				case 1: // '\001'
					state = 3;
		//   35   97:aload_0         
		//   36   98:getfield        #16  <Field StreamingDrmSessionManager this$0>
		//   37  101:iconst_3        
		//   38  102:invokestatic    #39  <Method int StreamingDrmSessionManager.access$302(StreamingDrmSessionManager, int)>
		//   39  105:pop             
					postProvisionRequest();
		//   40  106:aload_0         
		//   41  107:getfield        #16  <Field StreamingDrmSessionManager this$0>
		//   42  110:invokestatic    #55  <Method void StreamingDrmSessionManager.access$600(StreamingDrmSessionManager)>
					return;
		//   43  113:return          
				}
			} else
			{
				return;
		//   44  114:return          
			}
		}

		final StreamingDrmSessionManager this$0;

		public MediaDrmHandler(Looper looper)
		{
			this$0 = StreamingDrmSessionManager.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #16  <Field StreamingDrmSessionManager this$0>
			super(looper);
		//    3    5:aload_0         
		//    4    6:aload_2         
		//    5    7:invokespecial   #19  <Method void Handler(Looper)>
		//    6   10:return          
		}
	}

	private class PostRequestHandler extends Handler
	{

		public void handleMessage(Message message)
		{
			message.what;
		//    0    0:aload_1         
		//    1    1:getfield        #30  <Field int Message.what>
			JVM INSTR tableswitch 0 1: default 119
		//		               0 61
		//		               1 31;
		//    2    4:tableswitch     0 1: default 119
		//		               0 61
		//		               1 31
			   goto _L1 _L2 _L3
		//*   3   28:goto            91
_L3:
			Object obj;
			try
			{
				obj = ((Object) (callback.executeKeyRequest(uuid, (ExoMediaDrm.KeyRequest)message.obj)));
		//    4   31:aload_0         
		//    5   32:getfield        #16  <Field StreamingDrmSessionManager this$0>
		//    6   35:getfield        #34  <Field MediaDrmCallback StreamingDrmSessionManager.callback>
		//    7   38:aload_0         
		//    8   39:getfield        #16  <Field StreamingDrmSessionManager this$0>
		//    9   42:getfield        #38  <Field UUID StreamingDrmSessionManager.uuid>
		//   10   45:aload_1         
		//   11   46:getfield        #42  <Field Object Message.obj>
		//   12   49:checkcast       #44  <Class ExoMediaDrm$KeyRequest>
		//   13   52:invokeinterface #50  <Method byte[] MediaDrmCallback.executeKeyRequest(UUID, ExoMediaDrm$KeyRequest)>
		//   14   57:astore_2        
			}
		//*  15   58:goto            100
		//*  16   61:aload_0         
		//*  17   62:getfield        #16  <Field StreamingDrmSessionManager this$0>
		//*  18   65:getfield        #34  <Field MediaDrmCallback StreamingDrmSessionManager.callback>
		//*  19   68:aload_0         
		//*  20   69:getfield        #16  <Field StreamingDrmSessionManager this$0>
		//*  21   72:getfield        #38  <Field UUID StreamingDrmSessionManager.uuid>
		//*  22   75:aload_1         
		//*  23   76:getfield        #42  <Field Object Message.obj>
		//*  24   79:checkcast       #52  <Class ExoMediaDrm$ProvisionRequest>
		//*  25   82:invokeinterface #56  <Method byte[] MediaDrmCallback.executeProvisionRequest(UUID, ExoMediaDrm$ProvisionRequest)>
		//*  26   87:astore_2        
		//*  27   88:goto            100
		//*  28   91:new             #58  <Class RuntimeException>
		//*  29   94:dup             
		//*  30   95:invokespecial   #61  <Method void RuntimeException()>
		//*  31   98:athrow          
			// Misplaced declaration of an exception variable
			catch(Object obj) { }
		//   32   99:astore_2        
			break; /* Loop/switch isn't completed */
_L2:
			obj = ((Object) (callback.executeProvisionRequest(uuid, (ExoMediaDrm.ProvisionRequest)message.obj)));
			break; /* Loop/switch isn't completed */
_L1:
			throw new RuntimeException();
			postResponseHandler.obtainMessage(message.what, obj).sendToTarget();
		//   33  100:aload_0         
		//   34  101:getfield        #16  <Field StreamingDrmSessionManager this$0>
		//   35  104:getfield        #65  <Field StreamingDrmSessionManager$PostResponseHandler StreamingDrmSessionManager.postResponseHandler>
		//   36  107:aload_1         
		//   37  108:getfield        #30  <Field int Message.what>
		//   38  111:aload_2         
		//   39  112:invokevirtual   #71  <Method Message StreamingDrmSessionManager$PostResponseHandler.obtainMessage(int, Object)>
		//   40  115:invokevirtual   #74  <Method void Message.sendToTarget()>
			return;
		//   41  118:return          
		//*  42  119:goto            28
		}

		final StreamingDrmSessionManager this$0;

		public PostRequestHandler(Looper looper)
		{
			this$0 = StreamingDrmSessionManager.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #16  <Field StreamingDrmSessionManager this$0>
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
			switch(message.what)
		//*   0    0:aload_1         
		//*   1    1:getfield        #28  <Field int Message.what>
			{
		//*   2    4:tableswitch     0 1: default 28
		//		               0 41
		//		               1 29
			default:
				return;
		//    3   28:return          

			case 1: // '\001'
				onKeyResponse(message.obj);
		//    4   29:aload_0         
		//    5   30:getfield        #16  <Field StreamingDrmSessionManager this$0>
		//    6   33:aload_1         
		//    7   34:getfield        #32  <Field Object Message.obj>
		//    8   37:invokestatic    #36  <Method void StreamingDrmSessionManager.access$800(StreamingDrmSessionManager, Object)>
				return;
		//    9   40:return          

			case 0: // '\0'
				onProvisionResponse(message.obj);
		//   10   41:aload_0         
		//   11   42:getfield        #16  <Field StreamingDrmSessionManager this$0>
		//   12   45:aload_1         
		//   13   46:getfield        #32  <Field Object Message.obj>
		//   14   49:invokestatic    #39  <Method void StreamingDrmSessionManager.access$700(StreamingDrmSessionManager, Object)>
				return;
		//   15   52:return          
			}
		}

		final StreamingDrmSessionManager this$0;

		public PostResponseHandler(Looper looper)
		{
			this$0 = StreamingDrmSessionManager.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #16  <Field StreamingDrmSessionManager this$0>
			super(looper);
		//    3    5:aload_0         
		//    4    6:aload_2         
		//    5    7:invokespecial   #19  <Method void Handler(Looper)>
		//    6   10:return          
		}
	}


	private StreamingDrmSessionManager(UUID uuid1, Looper looper, MediaDrmCallback mediadrmcallback, HashMap hashmap, Handler handler, EventListener eventlistener, ExoMediaDrm exomediadrm)
		throws UnsupportedDrmException
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #102 <Method void Object()>
		uuid = uuid1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #104 <Field UUID uuid>
		callback = mediadrmcallback;
	//    5    9:aload_0         
	//    6   10:aload_3         
	//    7   11:putfield        #106 <Field MediaDrmCallback callback>
		optionalKeyRequestParameters = hashmap;
	//    8   14:aload_0         
	//    9   15:aload           4
	//   10   17:putfield        #108 <Field HashMap optionalKeyRequestParameters>
		eventHandler = handler;
	//   11   20:aload_0         
	//   12   21:aload           5
	//   13   23:putfield        #110 <Field Handler eventHandler>
		eventListener = eventlistener;
	//   14   26:aload_0         
	//   15   27:aload           6
	//   16   29:putfield        #112 <Field StreamingDrmSessionManager$EventListener eventListener>
		mediaDrm = exomediadrm;
	//   17   32:aload_0         
	//   18   33:aload           7
	//   19   35:putfield        #114 <Field ExoMediaDrm mediaDrm>
		exomediadrm.setOnEventListener(((ExoMediaDrm.OnEventListener) (new MediaDrmEventListener())));
	//   20   38:aload           7
	//   21   40:new             #16  <Class StreamingDrmSessionManager$MediaDrmEventListener>
	//   22   43:dup             
	//   23   44:aload_0         
	//   24   45:aconst_null     
	//   25   46:invokespecial   #117 <Method void StreamingDrmSessionManager$MediaDrmEventListener(StreamingDrmSessionManager, StreamingDrmSessionManager$1)>
	//   26   49:invokeinterface #123 <Method void ExoMediaDrm.setOnEventListener(ExoMediaDrm$OnEventListener)>
		mediaDrmHandler = new MediaDrmHandler(looper);
	//   27   54:aload_0         
	//   28   55:new             #19  <Class StreamingDrmSessionManager$MediaDrmHandler>
	//   29   58:dup             
	//   30   59:aload_0         
	//   31   60:aload_2         
	//   32   61:invokespecial   #126 <Method void StreamingDrmSessionManager$MediaDrmHandler(StreamingDrmSessionManager, Looper)>
	//   33   64:putfield        #128 <Field StreamingDrmSessionManager$MediaDrmHandler mediaDrmHandler>
		postResponseHandler = new PostResponseHandler(looper);
	//   34   67:aload_0         
	//   35   68:new             #25  <Class StreamingDrmSessionManager$PostResponseHandler>
	//   36   71:dup             
	//   37   72:aload_0         
	//   38   73:aload_2         
	//   39   74:invokespecial   #129 <Method void StreamingDrmSessionManager$PostResponseHandler(StreamingDrmSessionManager, Looper)>
	//   40   77:putfield        #131 <Field StreamingDrmSessionManager$PostResponseHandler postResponseHandler>
		state = 1;
	//   41   80:aload_0         
	//   42   81:iconst_1        
	//   43   82:putfield        #133 <Field int state>
	//   44   85:return          
	}

	private static FrameworkMediaDrm createFrameworkDrm(UUID uuid1)
		throws UnsupportedDrmException
	{
		try
		{
			uuid1 = ((UUID) (new FrameworkMediaDrm(uuid1)));
	//    0    0:new             #178 <Class FrameworkMediaDrm>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #181 <Method void FrameworkMediaDrm(UUID)>
	//    4    8:astore_0        
		}
	//*   5    9:aload_0         
	//*   6   10:areturn         
	//*   7   11:astore_0        
	//*   8   12:new             #100 <Class UnsupportedDrmException>
	//*   9   15:dup             
	//*  10   16:iconst_2        
	//*  11   17:aload_0         
	//*  12   18:invokespecial   #184 <Method void UnsupportedDrmException(int, Exception)>
	//*  13   21:athrow          
		// Misplaced declaration of an exception variable
		catch(UUID uuid1)
	//*  14   22:astore_0        
		{
			throw new UnsupportedDrmException(1, ((Exception) (uuid1)));
	//   15   23:new             #100 <Class UnsupportedDrmException>
	//   16   26:dup             
	//   17   27:iconst_1        
	//   18   28:aload_0         
	//   19   29:invokespecial   #184 <Method void UnsupportedDrmException(int, Exception)>
	//   20   32:athrow          
		}
		// Misplaced declaration of an exception variable
		catch(UUID uuid1)
		{
			throw new UnsupportedDrmException(2, ((Exception) (uuid1)));
		}
		return ((FrameworkMediaDrm) (uuid1));
	}

	public static StreamingDrmSessionManager newFrameworkInstance(UUID uuid1, Looper looper, MediaDrmCallback mediadrmcallback, HashMap hashmap, Handler handler, EventListener eventlistener)
		throws UnsupportedDrmException
	{
		return newInstance(uuid1, looper, mediadrmcallback, hashmap, handler, eventlistener, ((ExoMediaDrm) (createFrameworkDrm(uuid1))));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:aload           4
	//    5    6:aload           5
	//    6    8:aload_0         
	//    7    9:invokestatic    #188 <Method FrameworkMediaDrm createFrameworkDrm(UUID)>
	//    8   12:invokestatic    #192 <Method StreamingDrmSessionManager newInstance(UUID, Looper, MediaDrmCallback, HashMap, Handler, StreamingDrmSessionManager$EventListener, ExoMediaDrm)>
	//    9   15:areturn         
	}

	public static StreamingDrmSessionManager newInstance(UUID uuid1, Looper looper, MediaDrmCallback mediadrmcallback, HashMap hashmap, Handler handler, EventListener eventlistener, ExoMediaDrm exomediadrm)
		throws UnsupportedDrmException
	{
		return new StreamingDrmSessionManager(uuid1, looper, mediadrmcallback, hashmap, handler, eventlistener, exomediadrm);
	//    0    0:new             #2   <Class StreamingDrmSessionManager>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:aload_3         
	//    6    8:aload           4
	//    7   10:aload           5
	//    8   12:aload           6
	//    9   14:invokespecial   #195 <Method void StreamingDrmSessionManager(UUID, Looper, MediaDrmCallback, HashMap, Handler, StreamingDrmSessionManager$EventListener, ExoMediaDrm)>
	//   10   17:areturn         
	}

	public static StreamingDrmSessionManager newPlayReadyInstance(Looper looper, MediaDrmCallback mediadrmcallback, String s, Handler handler, EventListener eventlistener)
		throws UnsupportedDrmException
	{
		if(!TextUtils.isEmpty(((CharSequence) (s))))
	//*   0    0:aload_2         
	//*   1    1:invokestatic    #204 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*   2    4:ifne            31
		{
			HashMap hashmap = new HashMap();
	//    3    7:new             #206 <Class HashMap>
	//    4   10:dup             
	//    5   11:invokespecial   #207 <Method void HashMap()>
	//    6   14:astore          5
			hashmap.put("PRCustomData", ((Object) (s)));
	//    7   16:aload           5
	//    8   18:ldc1            #38  <String "PRCustomData">
	//    9   20:aload_2         
	//   10   21:invokevirtual   #211 <Method Object HashMap.put(Object, Object)>
	//   11   24:pop             
			s = ((String) (hashmap));
	//   12   25:aload           5
	//   13   27:astore_2        
		} else
	//*  14   28:goto            33
		{
			s = null;
	//   15   31:aconst_null     
	//   16   32:astore_2        
		}
		return newFrameworkInstance(PLAYREADY_UUID, looper, mediadrmcallback, ((HashMap) (s)), handler, eventlistener);
	//   17   33:getstatic       #96  <Field UUID PLAYREADY_UUID>
	//   18   36:aload_0         
	//   19   37:aload_1         
	//   20   38:aload_2         
	//   21   39:aload_3         
	//   22   40:aload           4
	//   23   42:invokestatic    #213 <Method StreamingDrmSessionManager newFrameworkInstance(UUID, Looper, MediaDrmCallback, HashMap, Handler, StreamingDrmSessionManager$EventListener)>
	//   24   45:areturn         
	}

	public static StreamingDrmSessionManager newWidevineInstance(Looper looper, MediaDrmCallback mediadrmcallback, HashMap hashmap, Handler handler, EventListener eventlistener)
		throws UnsupportedDrmException
	{
		return newFrameworkInstance(WIDEVINE_UUID, looper, mediadrmcallback, hashmap, handler, eventlistener);
	//    0    0:getstatic       #90  <Field UUID WIDEVINE_UUID>
	//    1    3:aload_0         
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:aload_3         
	//    5    7:aload           4
	//    6    9:invokestatic    #213 <Method StreamingDrmSessionManager newFrameworkInstance(UUID, Looper, MediaDrmCallback, HashMap, Handler, StreamingDrmSessionManager$EventListener)>
	//    7   12:areturn         
	}

	private void onError(final Exception e)
	{
		lastException = e;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #219 <Field Exception lastException>
		Handler handler = eventHandler;
	//    3    5:aload_0         
	//    4    6:getfield        #110 <Field Handler eventHandler>
	//    5    9:astore_2        
		if(handler != null && eventListener != null)
	//*   6   10:aload_2         
	//*   7   11:ifnull          35
	//*   8   14:aload_0         
	//*   9   15:getfield        #112 <Field StreamingDrmSessionManager$EventListener eventListener>
	//*  10   18:ifnull          35
			handler.post(new Runnable() {

				public void run()
				{
					eventListener.onDrmSessionManagerError(e);
				//    0    0:aload_0         
				//    1    1:getfield        #19  <Field StreamingDrmSessionManager this$0>
				//    2    4:invokestatic    #30  <Method StreamingDrmSessionManager$EventListener StreamingDrmSessionManager.access$100(StreamingDrmSessionManager)>
				//    3    7:aload_0         
				//    4    8:getfield        #21  <Field Exception val$e>
				//    5   11:invokeinterface #35  <Method void StreamingDrmSessionManager$EventListener.onDrmSessionManagerError(Exception)>
				//    6   16:return          
				}

				final StreamingDrmSessionManager this$0;
				final Exception val$e;

			
			{
				this$0 = StreamingDrmSessionManager.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field StreamingDrmSessionManager this$0>
				e = exception;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #21  <Field Exception val$e>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #24  <Method void Object()>
			//    8   14:return          
			}
			}
);
	//   11   21:aload_2         
	//   12   22:new             #11  <Class StreamingDrmSessionManager$2>
	//   13   25:dup             
	//   14   26:aload_0         
	//   15   27:aload_1         
	//   16   28:invokespecial   #221 <Method void StreamingDrmSessionManager$2(StreamingDrmSessionManager, Exception)>
	//   17   31:invokevirtual   #227 <Method boolean Handler.post(Runnable)>
	//   18   34:pop             
		if(state != 4)
	//*  19   35:aload_0         
	//*  20   36:getfield        #133 <Field int state>
	//*  21   39:iconst_4        
	//*  22   40:icmpeq          48
			state = 0;
	//   23   43:aload_0         
	//   24   44:iconst_0        
	//   25   45:putfield        #133 <Field int state>
	//   26   48:return          
	}

	private void onKeyResponse(Object obj)
	{
		int i = state;
	//    0    0:aload_0         
	//    1    1:getfield        #133 <Field int state>
	//    2    4:istore_2        
		if(i != 3 && i != 4)
	//*   3    5:iload_2         
	//*   4    6:iconst_3        
	//*   5    7:icmpeq          16
	//*   6   10:iload_2         
	//*   7   11:iconst_4        
	//*   8   12:icmpeq          16
			return;
	//    9   15:return          
		if(obj instanceof Exception)
	//*  10   16:aload_1         
	//*  11   17:instanceof      #176 <Class Exception>
	//*  12   20:ifeq            32
		{
			onKeysError((Exception)obj);
	//   13   23:aload_0         
	//   14   24:aload_1         
	//   15   25:checkcast       #176 <Class Exception>
	//   16   28:invokespecial   #230 <Method void onKeysError(Exception)>
			return;
	//   17   31:return          
		}
		try
		{
			mediaDrm.provideKeyResponse(sessionId, (byte[])(byte[])obj);
	//   18   32:aload_0         
	//   19   33:getfield        #114 <Field ExoMediaDrm mediaDrm>
	//   20   36:aload_0         
	//   21   37:getfield        #232 <Field byte[] sessionId>
	//   22   40:aload_1         
	//   23   41:checkcast       #233 <Class byte[]>
	//   24   44:checkcast       #233 <Class byte[]>
	//   25   47:invokeinterface #237 <Method byte[] ExoMediaDrm.provideKeyResponse(byte[], byte[])>
	//   26   52:pop             
			state = 4;
	//   27   53:aload_0         
	//   28   54:iconst_4        
	//   29   55:putfield        #133 <Field int state>
			if(eventHandler != null && eventListener != null)
	//*  30   58:aload_0         
	//*  31   59:getfield        #110 <Field Handler eventHandler>
	//*  32   62:ifnull          95
	//*  33   65:aload_0         
	//*  34   66:getfield        #112 <Field StreamingDrmSessionManager$EventListener eventListener>
	//*  35   69:ifnull          95
			{
				eventHandler.post(new Runnable() {

					public void run()
					{
						eventListener.onDrmKeysLoaded();
					//    0    0:aload_0         
					//    1    1:getfield        #17  <Field StreamingDrmSessionManager this$0>
					//    2    4:invokestatic    #26  <Method StreamingDrmSessionManager$EventListener StreamingDrmSessionManager.access$100(StreamingDrmSessionManager)>
					//    3    7:invokeinterface #31  <Method void StreamingDrmSessionManager$EventListener.onDrmKeysLoaded()>
					//    4   12:return          
					}

					final StreamingDrmSessionManager this$0;

			
			{
				this$0 = StreamingDrmSessionManager.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field StreamingDrmSessionManager this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #20  <Method void Object()>
			//    5    9:return          
			}
				}
);
	//   36   72:aload_0         
	//   37   73:getfield        #110 <Field Handler eventHandler>
	//   38   76:new             #9   <Class StreamingDrmSessionManager$1>
	//   39   79:dup             
	//   40   80:aload_0         
	//   41   81:invokespecial   #239 <Method void StreamingDrmSessionManager$1(StreamingDrmSessionManager)>
	//   42   84:invokevirtual   #227 <Method boolean Handler.post(Runnable)>
	//   43   87:pop             
				return;
	//   44   88:return          
			}
		}
		// Misplaced declaration of an exception variable
		catch(Object obj)
	//*  45   89:astore_1        
		{
			onKeysError(((Exception) (obj)));
	//   46   90:aload_0         
	//   47   91:aload_1         
	//   48   92:invokespecial   #230 <Method void onKeysError(Exception)>
		}
	//   49   95:return          
	}

	private void onKeysError(Exception exception)
	{
		if(exception instanceof NotProvisionedException)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #241 <Class NotProvisionedException>
	//*   2    4:ifeq            12
		{
			postProvisionRequest();
	//    3    7:aload_0         
	//    4    8:invokespecial   #160 <Method void postProvisionRequest()>
			return;
	//    5   11:return          
		} else
		{
			onError(exception);
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:invokespecial   #156 <Method void onError(Exception)>
			return;
	//    9   17:return          
		}
	}

	private void onProvisionResponse(Object obj)
	{
		provisioningInProgress = false;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #245 <Field boolean provisioningInProgress>
		int i = state;
	//    3    5:aload_0         
	//    4    6:getfield        #133 <Field int state>
	//    5    9:istore_2        
		if(i != 2 && i != 3 && i != 4)
	//*   6   10:iload_2         
	//*   7   11:iconst_2        
	//*   8   12:icmpeq          26
	//*   9   15:iload_2         
	//*  10   16:iconst_3        
	//*  11   17:icmpeq          26
	//*  12   20:iload_2         
	//*  13   21:iconst_4        
	//*  14   22:icmpeq          26
			return;
	//   15   25:return          
		if(obj instanceof Exception)
	//*  16   26:aload_1         
	//*  17   27:instanceof      #176 <Class Exception>
	//*  18   30:ifeq            42
		{
			onError((Exception)obj);
	//   19   33:aload_0         
	//   20   34:aload_1         
	//   21   35:checkcast       #176 <Class Exception>
	//   22   38:invokespecial   #156 <Method void onError(Exception)>
			return;
	//   23   41:return          
		}
		mediaDrm.provideProvisionResponse((byte[])(byte[])obj);
	//   24   42:aload_0         
	//   25   43:getfield        #114 <Field ExoMediaDrm mediaDrm>
	//   26   46:aload_1         
	//   27   47:checkcast       #233 <Class byte[]>
	//   28   50:checkcast       #233 <Class byte[]>
	//   29   53:invokeinterface #249 <Method void ExoMediaDrm.provideProvisionResponse(byte[])>
		if(state == 2)
	//*  30   58:aload_0         
	//*  31   59:getfield        #133 <Field int state>
	//*  32   62:iconst_2        
	//*  33   63:icmpne          72
		{
			openInternal(false);
	//   34   66:aload_0         
	//   35   67:iconst_0        
	//   36   68:invokespecial   #253 <Method void openInternal(boolean)>
			return;
	//   37   71:return          
		}
		try
		{
			postKeyRequest();
	//   38   72:aload_0         
	//   39   73:invokespecial   #150 <Method void postKeyRequest()>
			return;
	//   40   76:return          
		}
		// Misplaced declaration of an exception variable
		catch(Object obj)
	//*  41   77:astore_1        
		{
			onError(((Exception) (obj)));
	//   42   78:aload_0         
	//   43   79:aload_1         
	//   44   80:invokespecial   #156 <Method void onError(Exception)>
		}
		return;
	//   45   83:return          
	}

	private void openInternal(boolean flag)
	{
		try
		{
			sessionId = mediaDrm.openSession();
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #114 <Field ExoMediaDrm mediaDrm>
	//    3    5:invokeinterface #257 <Method byte[] ExoMediaDrm.openSession()>
	//    4   10:putfield        #232 <Field byte[] sessionId>
			mediaCrypto = mediaDrm.createMediaCrypto(uuid, sessionId);
	//    5   13:aload_0         
	//    6   14:aload_0         
	//    7   15:getfield        #114 <Field ExoMediaDrm mediaDrm>
	//    8   18:aload_0         
	//    9   19:getfield        #104 <Field UUID uuid>
	//   10   22:aload_0         
	//   11   23:getfield        #232 <Field byte[] sessionId>
	//   12   26:invokeinterface #261 <Method ExoMediaCrypto ExoMediaDrm.createMediaCrypto(UUID, byte[])>
	//   13   31:putfield        #263 <Field ExoMediaCrypto mediaCrypto>
			state = 3;
	//   14   34:aload_0         
	//   15   35:iconst_3        
	//   16   36:putfield        #133 <Field int state>
			postKeyRequest();
	//   17   39:aload_0         
	//   18   40:invokespecial   #150 <Method void postKeyRequest()>
			return;
	//   19   43:return          
		}
	//*  20   44:astore_2        
	//*  21   45:aload_0         
	//*  22   46:aload_2         
	//*  23   47:invokespecial   #156 <Method void onError(Exception)>
	//*  24   50:return          
		catch(NotProvisionedException notprovisionedexception)
	//*  25   51:astore_2        
		{
			if(flag)
	//*  26   52:iload_1         
	//*  27   53:ifeq            61
			{
				postProvisionRequest();
	//   28   56:aload_0         
	//   29   57:invokespecial   #160 <Method void postProvisionRequest()>
				return;
	//   30   60:return          
			} else
			{
				onError(((Exception) (notprovisionedexception)));
	//   31   61:aload_0         
	//   32   62:aload_2         
	//   33   63:invokespecial   #156 <Method void onError(Exception)>
				return;
	//   34   66:return          
			}
		}
		catch(Exception exception)
		{
			onError(exception);
			return;
		}
	}

	private void postKeyRequest()
	{
		try
		{
			ExoMediaDrm.KeyRequest keyrequest = mediaDrm.getKeyRequest(sessionId, schemeInitData.data, schemeInitData.mimeType, 1, optionalKeyRequestParameters);
	//    0    0:aload_0         
	//    1    1:getfield        #114 <Field ExoMediaDrm mediaDrm>
	//    2    4:aload_0         
	//    3    5:getfield        #232 <Field byte[] sessionId>
	//    4    8:aload_0         
	//    5    9:getfield        #265 <Field DrmInitData$SchemeInitData schemeInitData>
	//    6   12:getfield        #270 <Field byte[] DrmInitData$SchemeInitData.data>
	//    7   15:aload_0         
	//    8   16:getfield        #265 <Field DrmInitData$SchemeInitData schemeInitData>
	//    9   19:getfield        #273 <Field String DrmInitData$SchemeInitData.mimeType>
	//   10   22:iconst_1        
	//   11   23:aload_0         
	//   12   24:getfield        #108 <Field HashMap optionalKeyRequestParameters>
	//   13   27:invokeinterface #277 <Method ExoMediaDrm$KeyRequest ExoMediaDrm.getKeyRequest(byte[], byte[], String, int, HashMap)>
	//   14   32:astore_1        
			postRequestHandler.obtainMessage(1, ((Object) (keyrequest))).sendToTarget();
	//   15   33:aload_0         
	//   16   34:getfield        #279 <Field Handler postRequestHandler>
	//   17   37:iconst_1        
	//   18   38:aload_1         
	//   19   39:invokevirtual   #283 <Method Message Handler.obtainMessage(int, Object)>
	//   20   42:invokevirtual   #288 <Method void Message.sendToTarget()>
			return;
	//   21   45:return          
		}
		catch(NotProvisionedException notprovisionedexception)
	//*  22   46:astore_1        
		{
			onKeysError(((Exception) (notprovisionedexception)));
	//   23   47:aload_0         
	//   24   48:aload_1         
	//   25   49:invokespecial   #230 <Method void onKeysError(Exception)>
		}
	//   26   52:return          
	}

	private void postProvisionRequest()
	{
		if(provisioningInProgress)
	//*   0    0:aload_0         
	//*   1    1:getfield        #245 <Field boolean provisioningInProgress>
	//*   2    4:ifeq            8
		{
			return;
	//    3    7:return          
		} else
		{
			provisioningInProgress = true;
	//    4    8:aload_0         
	//    5    9:iconst_1        
	//    6   10:putfield        #245 <Field boolean provisioningInProgress>
			ExoMediaDrm.ProvisionRequest provisionrequest = mediaDrm.getProvisionRequest();
	//    7   13:aload_0         
	//    8   14:getfield        #114 <Field ExoMediaDrm mediaDrm>
	//    9   17:invokeinterface #292 <Method ExoMediaDrm$ProvisionRequest ExoMediaDrm.getProvisionRequest()>
	//   10   22:astore_1        
			postRequestHandler.obtainMessage(0, ((Object) (provisionrequest))).sendToTarget();
	//   11   23:aload_0         
	//   12   24:getfield        #279 <Field Handler postRequestHandler>
	//   13   27:iconst_0        
	//   14   28:aload_1         
	//   15   29:invokevirtual   #283 <Method Message Handler.obtainMessage(int, Object)>
	//   16   32:invokevirtual   #288 <Method void Message.sendToTarget()>
			return;
	//   17   35:return          
		}
	}

	public void close()
	{
		int i = openCount - 1;
	//    0    0:aload_0         
	//    1    1:getfield        #142 <Field int openCount>
	//    2    4:iconst_1        
	//    3    5:isub            
	//    4    6:istore_1        
		openCount = i;
	//    5    7:aload_0         
	//    6    8:iload_1         
	//    7    9:putfield        #142 <Field int openCount>
		if(i != 0)
	//*   8   12:iload_1         
	//*   9   13:ifeq            17
			return;
	//   10   16:return          
		state = 1;
	//   11   17:aload_0         
	//   12   18:iconst_1        
	//   13   19:putfield        #133 <Field int state>
		provisioningInProgress = false;
	//   14   22:aload_0         
	//   15   23:iconst_0        
	//   16   24:putfield        #245 <Field boolean provisioningInProgress>
		mediaDrmHandler.removeCallbacksAndMessages(((Object) (null)));
	//   17   27:aload_0         
	//   18   28:getfield        #128 <Field StreamingDrmSessionManager$MediaDrmHandler mediaDrmHandler>
	//   19   31:aconst_null     
	//   20   32:invokevirtual   #296 <Method void StreamingDrmSessionManager$MediaDrmHandler.removeCallbacksAndMessages(Object)>
		postResponseHandler.removeCallbacksAndMessages(((Object) (null)));
	//   21   35:aload_0         
	//   22   36:getfield        #131 <Field StreamingDrmSessionManager$PostResponseHandler postResponseHandler>
	//   23   39:aconst_null     
	//   24   40:invokevirtual   #297 <Method void StreamingDrmSessionManager$PostResponseHandler.removeCallbacksAndMessages(Object)>
		postRequestHandler.removeCallbacksAndMessages(((Object) (null)));
	//   25   43:aload_0         
	//   26   44:getfield        #279 <Field Handler postRequestHandler>
	//   27   47:aconst_null     
	//   28   48:invokevirtual   #298 <Method void Handler.removeCallbacksAndMessages(Object)>
		postRequestHandler = null;
	//   29   51:aload_0         
	//   30   52:aconst_null     
	//   31   53:putfield        #279 <Field Handler postRequestHandler>
		requestHandlerThread.quit();
	//   32   56:aload_0         
	//   33   57:getfield        #300 <Field HandlerThread requestHandlerThread>
	//   34   60:invokevirtual   #306 <Method boolean HandlerThread.quit()>
	//   35   63:pop             
		requestHandlerThread = null;
	//   36   64:aload_0         
	//   37   65:aconst_null     
	//   38   66:putfield        #300 <Field HandlerThread requestHandlerThread>
		schemeInitData = null;
	//   39   69:aload_0         
	//   40   70:aconst_null     
	//   41   71:putfield        #265 <Field DrmInitData$SchemeInitData schemeInitData>
		mediaCrypto = null;
	//   42   74:aload_0         
	//   43   75:aconst_null     
	//   44   76:putfield        #263 <Field ExoMediaCrypto mediaCrypto>
		lastException = null;
	//   45   79:aload_0         
	//   46   80:aconst_null     
	//   47   81:putfield        #219 <Field Exception lastException>
		byte abyte0[] = sessionId;
	//   48   84:aload_0         
	//   49   85:getfield        #232 <Field byte[] sessionId>
	//   50   88:astore_2        
		if(abyte0 != null)
	//*  51   89:aload_2         
	//*  52   90:ifnull          108
		{
			mediaDrm.closeSession(abyte0);
	//   53   93:aload_0         
	//   54   94:getfield        #114 <Field ExoMediaDrm mediaDrm>
	//   55   97:aload_2         
	//   56   98:invokeinterface #309 <Method void ExoMediaDrm.closeSession(byte[])>
			sessionId = null;
	//   57  103:aload_0         
	//   58  104:aconst_null     
	//   59  105:putfield        #232 <Field byte[] sessionId>
		}
	//   60  108:return          
	}

	public final Exception getError()
	{
		if(state == 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #133 <Field int state>
	//*   2    4:ifne            12
			return lastException;
	//    3    7:aload_0         
	//    4    8:getfield        #219 <Field Exception lastException>
	//    5   11:areturn         
		else
			return null;
	//    6   12:aconst_null     
	//    7   13:areturn         
	}

	public final ExoMediaCrypto getMediaCrypto()
	{
		int i = state;
	//    0    0:aload_0         
	//    1    1:getfield        #133 <Field int state>
	//    2    4:istore_1        
		if(i != 3 && i != 4)
	//*   3    5:iload_1         
	//*   4    6:iconst_3        
	//*   5    7:icmpeq          26
	//*   6   10:iload_1         
	//*   7   11:iconst_4        
	//*   8   12:icmpne          18
	//*   9   15:goto            26
			throw new IllegalStateException();
	//   10   18:new             #315 <Class IllegalStateException>
	//   11   21:dup             
	//   12   22:invokespecial   #316 <Method void IllegalStateException()>
	//   13   25:athrow          
		else
			return mediaCrypto;
	//   14   26:aload_0         
	//   15   27:getfield        #263 <Field ExoMediaCrypto mediaCrypto>
	//   16   30:areturn         
	}

	public final byte[] getPropertyByteArray(String s)
	{
		return mediaDrm.getPropertyByteArray(s);
	//    0    0:aload_0         
	//    1    1:getfield        #114 <Field ExoMediaDrm mediaDrm>
	//    2    4:aload_1         
	//    3    5:invokeinterface #321 <Method byte[] ExoMediaDrm.getPropertyByteArray(String)>
	//    4   10:areturn         
	}

	public final String getPropertyString(String s)
	{
		return mediaDrm.getPropertyString(s);
	//    0    0:aload_0         
	//    1    1:getfield        #114 <Field ExoMediaDrm mediaDrm>
	//    2    4:aload_1         
	//    3    5:invokeinterface #325 <Method String ExoMediaDrm.getPropertyString(String)>
	//    4   10:areturn         
	}

	public final int getState()
	{
		return state;
	//    0    0:aload_0         
	//    1    1:getfield        #133 <Field int state>
	//    2    4:ireturn         
	}

	public void open(DrmInitData drminitdata)
	{
		int i = openCount + 1;
	//    0    0:aload_0         
	//    1    1:getfield        #142 <Field int openCount>
	//    2    4:iconst_1        
	//    3    5:iadd            
	//    4    6:istore_2        
		openCount = i;
	//    5    7:aload_0         
	//    6    8:iload_2         
	//    7    9:putfield        #142 <Field int openCount>
		if(i != 1)
	//*   8   12:iload_2         
	//*   9   13:iconst_1        
	//*  10   14:icmpeq          18
			return;
	//   11   17:return          
		if(postRequestHandler == null)
	//*  12   18:aload_0         
	//*  13   19:getfield        #279 <Field Handler postRequestHandler>
	//*  14   22:ifnonnull       65
		{
			requestHandlerThread = new HandlerThread("DrmRequestHandler");
	//   15   25:aload_0         
	//   16   26:new             #302 <Class HandlerThread>
	//   17   29:dup             
	//   18   30:ldc2            #331 <String "DrmRequestHandler">
	//   19   33:invokespecial   #334 <Method void HandlerThread(String)>
	//   20   36:putfield        #300 <Field HandlerThread requestHandlerThread>
			requestHandlerThread.start();
	//   21   39:aload_0         
	//   22   40:getfield        #300 <Field HandlerThread requestHandlerThread>
	//   23   43:invokevirtual   #337 <Method void HandlerThread.start()>
			postRequestHandler = ((Handler) (new PostRequestHandler(requestHandlerThread.getLooper())));
	//   24   46:aload_0         
	//   25   47:new             #22  <Class StreamingDrmSessionManager$PostRequestHandler>
	//   26   50:dup             
	//   27   51:aload_0         
	//   28   52:aload_0         
	//   29   53:getfield        #300 <Field HandlerThread requestHandlerThread>
	//   30   56:invokevirtual   #341 <Method Looper HandlerThread.getLooper()>
	//   31   59:invokespecial   #342 <Method void StreamingDrmSessionManager$PostRequestHandler(StreamingDrmSessionManager, Looper)>
	//   32   62:putfield        #279 <Field Handler postRequestHandler>
		}
		if(schemeInitData == null)
	//*  33   65:aload_0         
	//*  34   66:getfield        #265 <Field DrmInitData$SchemeInitData schemeInitData>
	//*  35   69:ifnonnull       182
		{
			schemeInitData = drminitdata.get(uuid);
	//   36   72:aload_0         
	//   37   73:aload_1         
	//   38   74:aload_0         
	//   39   75:getfield        #104 <Field UUID uuid>
	//   40   78:invokeinterface #348 <Method DrmInitData$SchemeInitData DrmInitData.get(UUID)>
	//   41   83:putfield        #265 <Field DrmInitData$SchemeInitData schemeInitData>
			if(schemeInitData == null)
	//*  42   86:aload_0         
	//*  43   87:getfield        #265 <Field DrmInitData$SchemeInitData schemeInitData>
	//*  44   90:ifnonnull       134
			{
				drminitdata = ((DrmInitData) (new StringBuilder()));
	//   45   93:new             #350 <Class StringBuilder>
	//   46   96:dup             
	//   47   97:invokespecial   #351 <Method void StringBuilder()>
	//   48  100:astore_1        
				((StringBuilder) (drminitdata)).append("Media does not support uuid: ");
	//   49  101:aload_1         
	//   50  102:ldc2            #353 <String "Media does not support uuid: ">
	//   51  105:invokevirtual   #357 <Method StringBuilder StringBuilder.append(String)>
	//   52  108:pop             
				((StringBuilder) (drminitdata)).append(((Object) (uuid)));
	//   53  109:aload_1         
	//   54  110:aload_0         
	//   55  111:getfield        #104 <Field UUID uuid>
	//   56  114:invokevirtual   #360 <Method StringBuilder StringBuilder.append(Object)>
	//   57  117:pop             
				onError(((Exception) (new IllegalStateException(((StringBuilder) (drminitdata)).toString()))));
	//   58  118:aload_0         
	//   59  119:new             #315 <Class IllegalStateException>
	//   60  122:dup             
	//   61  123:aload_1         
	//   62  124:invokevirtual   #364 <Method String StringBuilder.toString()>
	//   63  127:invokespecial   #365 <Method void IllegalStateException(String)>
	//   64  130:invokespecial   #156 <Method void onError(Exception)>
				return;
	//   65  133:return          
			}
			if(Util.SDK_INT < 21)
	//*  66  134:getstatic       #370 <Field int Util.SDK_INT>
	//*  67  137:bipush          21
	//*  68  139:icmpge          182
			{
				drminitdata = ((DrmInitData) (PsshAtomUtil.parseSchemeSpecificData(schemeInitData.data, WIDEVINE_UUID)));
	//   69  142:aload_0         
	//   70  143:getfield        #265 <Field DrmInitData$SchemeInitData schemeInitData>
	//   71  146:getfield        #270 <Field byte[] DrmInitData$SchemeInitData.data>
	//   72  149:getstatic       #90  <Field UUID WIDEVINE_UUID>
	//   73  152:invokestatic    #376 <Method byte[] PsshAtomUtil.parseSchemeSpecificData(byte[], UUID)>
	//   74  155:astore_1        
				if(drminitdata != null)
	//*  75  156:aload_1         
	//*  76  157:ifnonnull       163
	//*  77  160:goto            182
					schemeInitData = new DrmInitData.SchemeInitData(schemeInitData.mimeType, ((byte []) (drminitdata)));
	//   78  163:aload_0         
	//   79  164:new             #267 <Class DrmInitData$SchemeInitData>
	//   80  167:dup             
	//   81  168:aload_0         
	//   82  169:getfield        #265 <Field DrmInitData$SchemeInitData schemeInitData>
	//   83  172:getfield        #273 <Field String DrmInitData$SchemeInitData.mimeType>
	//   84  175:aload_1         
	//   85  176:invokespecial   #379 <Method void DrmInitData$SchemeInitData(String, byte[])>
	//   86  179:putfield        #265 <Field DrmInitData$SchemeInitData schemeInitData>
			}
		}
		state = 2;
	//   87  182:aload_0         
	//   88  183:iconst_2        
	//   89  184:putfield        #133 <Field int state>
		openInternal(true);
	//   90  187:aload_0         
	//   91  188:iconst_1        
	//   92  189:invokespecial   #253 <Method void openInternal(boolean)>
	//   93  192:return          
	}

	public boolean requiresSecureDecoderComponent(String s)
	{
		int i = state;
	//    0    0:aload_0         
	//    1    1:getfield        #133 <Field int state>
	//    2    4:istore_2        
		if(i != 3 && i != 4)
	//*   3    5:iload_2         
	//*   4    6:iconst_3        
	//*   5    7:icmpeq          26
	//*   6   10:iload_2         
	//*   7   11:iconst_4        
	//*   8   12:icmpne          18
	//*   9   15:goto            26
			throw new IllegalStateException();
	//   10   18:new             #315 <Class IllegalStateException>
	//   11   21:dup             
	//   12   22:invokespecial   #316 <Method void IllegalStateException()>
	//   13   25:athrow          
		else
			return mediaCrypto.requiresSecureDecoderComponent(s);
	//   14   26:aload_0         
	//   15   27:getfield        #263 <Field ExoMediaCrypto mediaCrypto>
	//   16   30:aload_1         
	//   17   31:invokeinterface #385 <Method boolean ExoMediaCrypto.requiresSecureDecoderComponent(String)>
	//   18   36:ireturn         
	}

	public final void setPropertyByteArray(String s, byte abyte0[])
	{
		mediaDrm.setPropertyByteArray(s, abyte0);
	//    0    0:aload_0         
	//    1    1:getfield        #114 <Field ExoMediaDrm mediaDrm>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokeinterface #388 <Method void ExoMediaDrm.setPropertyByteArray(String, byte[])>
	//    5   11:return          
	}

	public final void setPropertyString(String s, String s1)
	{
		mediaDrm.setPropertyString(s, s1);
	//    0    0:aload_0         
	//    1    1:getfield        #114 <Field ExoMediaDrm mediaDrm>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokeinterface #392 <Method void ExoMediaDrm.setPropertyString(String, String)>
	//    5   11:return          
	}

	private static final int MSG_KEYS = 1;
	private static final int MSG_PROVISION = 0;
	public static final String PLAYREADY_CUSTOM_DATA_KEY = "PRCustomData";
	public static final UUID PLAYREADY_UUID = new UUID(0x98404286L, 0xe0885f95L);
	public static final UUID WIDEVINE_UUID = new UUID(0x79d64aceL, 0xd51d21edL);
	final MediaDrmCallback callback;
	private final Handler eventHandler;
	private final EventListener eventListener;
	private Exception lastException;
	private ExoMediaCrypto mediaCrypto;
	private final ExoMediaDrm mediaDrm;
	final MediaDrmHandler mediaDrmHandler;
	private int openCount;
	private final HashMap optionalKeyRequestParameters;
	private Handler postRequestHandler;
	final PostResponseHandler postResponseHandler;
	private boolean provisioningInProgress;
	private HandlerThread requestHandlerThread;
	private DrmInitData.SchemeInitData schemeInitData;
	private byte sessionId[];
	private int state;
	final UUID uuid;

	static 
	{
	//    0    0:new             #80  <Class UUID>
	//    1    3:dup             
	//    2    4:ldc2w           #81  <Long 0x79d64aceL>
	//    3    7:ldc2w           #83  <Long 0xd51d21edL>
	//    4   10:invokespecial   #88  <Method void UUID(long, long)>
	//    5   13:putstatic       #90  <Field UUID WIDEVINE_UUID>
	//    6   16:new             #80  <Class UUID>
	//    7   19:dup             
	//    8   20:ldc2w           #91  <Long 0x98404286L>
	//    9   23:ldc2w           #93  <Long 0xe0885f95L>
	//   10   26:invokespecial   #88  <Method void UUID(long, long)>
	//   11   29:putstatic       #96  <Field UUID PLAYREADY_UUID>
	//*  12   32:return          
	}


/*
	static EventListener access$100(StreamingDrmSessionManager streamingdrmsessionmanager)
	{
		return streamingdrmsessionmanager.eventListener;
	//    0    0:aload_0         
	//    1    1:getfield        #112 <Field StreamingDrmSessionManager$EventListener eventListener>
	//    2    4:areturn         
	}

*/


/*
	static int access$200(StreamingDrmSessionManager streamingdrmsessionmanager)
	{
		return streamingdrmsessionmanager.openCount;
	//    0    0:aload_0         
	//    1    1:getfield        #142 <Field int openCount>
	//    2    4:ireturn         
	}

*/


/*
	static int access$300(StreamingDrmSessionManager streamingdrmsessionmanager)
	{
		return streamingdrmsessionmanager.state;
	//    0    0:aload_0         
	//    1    1:getfield        #133 <Field int state>
	//    2    4:ireturn         
	}

*/


/*
	static int access$302(StreamingDrmSessionManager streamingdrmsessionmanager, int i)
	{
		streamingdrmsessionmanager.state = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #133 <Field int state>
		return i;
	//    3    5:iload_1         
	//    4    6:ireturn         
	}

*/


/*
	static void access$400(StreamingDrmSessionManager streamingdrmsessionmanager)
	{
		streamingdrmsessionmanager.postKeyRequest();
	//    0    0:aload_0         
	//    1    1:invokespecial   #150 <Method void postKeyRequest()>
		return;
	//    2    4:return          
	}

*/


/*
	static void access$500(StreamingDrmSessionManager streamingdrmsessionmanager, Exception exception)
	{
		streamingdrmsessionmanager.onError(exception);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #156 <Method void onError(Exception)>
		return;
	//    3    5:return          
	}

*/


/*
	static void access$600(StreamingDrmSessionManager streamingdrmsessionmanager)
	{
		streamingdrmsessionmanager.postProvisionRequest();
	//    0    0:aload_0         
	//    1    1:invokespecial   #160 <Method void postProvisionRequest()>
		return;
	//    2    4:return          
	}

*/


/*
	static void access$700(StreamingDrmSessionManager streamingdrmsessionmanager, Object obj)
	{
		streamingdrmsessionmanager.onProvisionResponse(obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #166 <Method void onProvisionResponse(Object)>
		return;
	//    3    5:return          
	}

*/


/*
	static void access$800(StreamingDrmSessionManager streamingdrmsessionmanager, Object obj)
	{
		streamingdrmsessionmanager.onKeyResponse(obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #170 <Method void onKeyResponse(Object)>
		return;
	//    3    5:return          
	}

*/
}

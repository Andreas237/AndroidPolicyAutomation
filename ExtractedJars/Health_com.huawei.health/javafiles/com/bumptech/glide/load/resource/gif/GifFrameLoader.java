// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.load.resource.gif;

import android.graphics.Bitmap;
import android.os.*;
import com.bumptech.glide.*;
import com.bumptech.glide.gifdecoder.GifDecoder;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.load.Transformation;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import com.bumptech.glide.request.RequestOptions;
import com.bumptech.glide.request.target.SimpleTarget;
import com.bumptech.glide.request.transition.Transition;
import com.bumptech.glide.util.Preconditions;
import com.bumptech.glide.util.Util;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.util.*;

class GifFrameLoader
{
	static class DelayTarget extends SimpleTarget
	{

		Bitmap getResource()
		{
			return resource;
		//    0    0:aload_0         
		//    1    1:getfield        #32  <Field Bitmap resource>
		//    2    4:areturn         
		}

		public void onResourceReady(Bitmap bitmap, Transition transition)
		{
			resource = bitmap;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #32  <Field Bitmap resource>
			bitmap = ((Bitmap) (handler.obtainMessage(1, ((Object) (this)))));
		//    3    5:aload_0         
		//    4    6:getfield        #23  <Field Handler handler>
		//    5    9:iconst_1        
		//    6   10:aload_0         
		//    7   11:invokevirtual   #40  <Method Message Handler.obtainMessage(int, Object)>
		//    8   14:astore_1        
			handler.sendMessageAtTime(((Message) (bitmap)), targetTime);
		//    9   15:aload_0         
		//   10   16:getfield        #23  <Field Handler handler>
		//   11   19:aload_1         
		//   12   20:aload_0         
		//   13   21:getfield        #27  <Field long targetTime>
		//   14   24:invokevirtual   #44  <Method boolean Handler.sendMessageAtTime(Message, long)>
		//   15   27:pop             
		//   16   28:return          
		}

		public volatile void onResourceReady(Object obj, Transition transition)
		{
			onResourceReady((Bitmap)obj, transition);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:checkcast       #49  <Class Bitmap>
		//    3    5:aload_2         
		//    4    6:invokevirtual   #51  <Method void onResourceReady(Bitmap, Transition)>
		//    5    9:return          
		}

		private final Handler handler;
		final int index;
		private Bitmap resource;
		private final long targetTime;

		DelayTarget(Handler handler1, int i, long l)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #21  <Method void SimpleTarget()>
			handler = handler1;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #23  <Field Handler handler>
			index = i;
		//    5    9:aload_0         
		//    6   10:iload_2         
		//    7   11:putfield        #25  <Field int index>
			targetTime = l;
		//    8   14:aload_0         
		//    9   15:lload_3         
		//   10   16:putfield        #27  <Field long targetTime>
		//   11   19:return          
		}
	}

	public static interface FrameCallback
	{

		public abstract void onFrameReady();
	}

	class FrameLoaderCallback
		implements android.os.Handler.Callback
	{

		public boolean handleMessage(Message message)
		{
			if(message.what == 1)
		//*   0    0:aload_1         
		//*   1    1:getfield        #31  <Field int Message.what>
		//*   2    4:iconst_1        
		//*   3    5:icmpne          26
			{
				message = ((Message) ((DelayTarget)message.obj));
		//    4    8:aload_1         
		//    5    9:getfield        #35  <Field Object Message.obj>
		//    6   12:checkcast       #37  <Class GifFrameLoader$DelayTarget>
		//    7   15:astore_1        
				onFrameReady(((DelayTarget) (message)));
		//    8   16:aload_0         
		//    9   17:getfield        #20  <Field GifFrameLoader this$0>
		//   10   20:aload_1         
		//   11   21:invokevirtual   #41  <Method void GifFrameLoader.onFrameReady(GifFrameLoader$DelayTarget)>
				return true;
		//   12   24:iconst_1        
		//   13   25:ireturn         
			}
			if(message.what == 2)
		//*  14   26:aload_1         
		//*  15   27:getfield        #31  <Field int Message.what>
		//*  16   30:iconst_2        
		//*  17   31:icmpne          53
			{
				message = ((Message) ((DelayTarget)message.obj));
		//   18   34:aload_1         
		//   19   35:getfield        #35  <Field Object Message.obj>
		//   20   38:checkcast       #37  <Class GifFrameLoader$DelayTarget>
		//   21   41:astore_1        
				requestManager.clear(((com.bumptech.glide.request.target.Target) (message)));
		//   22   42:aload_0         
		//   23   43:getfield        #20  <Field GifFrameLoader this$0>
		//   24   46:getfield        #45  <Field RequestManager GifFrameLoader.requestManager>
		//   25   49:aload_1         
		//   26   50:invokevirtual   #51  <Method void RequestManager.clear(com.bumptech.glide.request.target.Target)>
			}
			return false;
		//   27   53:iconst_0        
		//   28   54:ireturn         
		}

		public static final int MSG_CLEAR = 2;
		public static final int MSG_DELAY = 1;
		final GifFrameLoader this$0;

		FrameLoaderCallback()
		{
			this$0 = GifFrameLoader.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #20  <Field GifFrameLoader this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #23  <Method void Object()>
		//    5    9:return          
		}
	}

	static class FrameSignature
		implements Key
	{

		public boolean equals(Object obj)
		{
			if(obj instanceof FrameSignature)
		//*   0    0:aload_1         
		//*   1    1:instanceof      #2   <Class GifFrameLoader$FrameSignature>
		//*   2    4:ifeq            22
				return ((FrameSignature)obj).uuid.equals(((Object) (uuid)));
		//    3    7:aload_1         
		//    4    8:checkcast       #2   <Class GifFrameLoader$FrameSignature>
		//    5   11:getfield        #27  <Field UUID uuid>
		//    6   14:aload_0         
		//    7   15:getfield        #27  <Field UUID uuid>
		//    8   18:invokevirtual   #31  <Method boolean UUID.equals(Object)>
		//    9   21:ireturn         
			else
				return false;
		//   10   22:iconst_0        
		//   11   23:ireturn         
		}

		public int hashCode()
		{
			return uuid.hashCode();
		//    0    0:aload_0         
		//    1    1:getfield        #27  <Field UUID uuid>
		//    2    4:invokevirtual   #35  <Method int UUID.hashCode()>
		//    3    7:ireturn         
		}

		public void updateDiskCacheKey(MessageDigest messagedigest)
		{
			throw new UnsupportedOperationException("Not implemented");
		//    0    0:new             #39  <Class UnsupportedOperationException>
		//    1    3:dup             
		//    2    4:ldc1            #41  <String "Not implemented">
		//    3    6:invokespecial   #44  <Method void UnsupportedOperationException(String)>
		//    4    9:athrow          
		}

		private final UUID uuid;

		public FrameSignature()
		{
			this(UUID.randomUUID());
		//    0    0:aload_0         
		//    1    1:invokestatic    #19  <Method UUID UUID.randomUUID()>
		//    2    4:invokespecial   #22  <Method void GifFrameLoader$FrameSignature(UUID)>
		//    3    7:return          
		}

		FrameSignature(UUID uuid1)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #25  <Method void Object()>
			uuid = uuid1;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #27  <Field UUID uuid>
		//    5    9:return          
		}
	}


	public GifFrameLoader(Glide glide, GifDecoder gifdecoder, int i, int j, Transformation transformation1, Bitmap bitmap)
	{
		this(glide.getBitmapPool(), Glide.with(glide.getContext()), gifdecoder, ((Handler) (null)), getRequestBuilder(Glide.with(glide.getContext()), i, j), transformation1, bitmap);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #51  <Method BitmapPool Glide.getBitmapPool()>
	//    3    5:aload_1         
	//    4    6:invokevirtual   #55  <Method android.content.Context Glide.getContext()>
	//    5    9:invokestatic    #59  <Method RequestManager Glide.with(android.content.Context)>
	//    6   12:aload_2         
	//    7   13:aconst_null     
	//    8   14:aload_1         
	//    9   15:invokevirtual   #55  <Method android.content.Context Glide.getContext()>
	//   10   18:invokestatic    #59  <Method RequestManager Glide.with(android.content.Context)>
	//   11   21:iload_3         
	//   12   22:iload           4
	//   13   24:invokestatic    #63  <Method RequestBuilder getRequestBuilder(RequestManager, int, int)>
	//   14   27:aload           5
	//   15   29:aload           6
	//   16   31:invokespecial   #66  <Method void GifFrameLoader(BitmapPool, RequestManager, GifDecoder, Handler, RequestBuilder, Transformation, Bitmap)>
	//   17   34:return          
	}

	GifFrameLoader(BitmapPool bitmappool, RequestManager requestmanager, GifDecoder gifdecoder, Handler handler1, RequestBuilder requestbuilder, Transformation transformation1, Bitmap bitmap)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #72  <Method void Object()>
		callbacks = ((List) (new ArrayList()));
	//    2    4:aload_0         
	//    3    5:new             #74  <Class ArrayList>
	//    4    8:dup             
	//    5    9:invokespecial   #75  <Method void ArrayList()>
	//    6   12:putfield        #77  <Field List callbacks>
		isRunning = false;
	//    7   15:aload_0         
	//    8   16:iconst_0        
	//    9   17:putfield        #79  <Field boolean isRunning>
		isLoadPending = false;
	//   10   20:aload_0         
	//   11   21:iconst_0        
	//   12   22:putfield        #81  <Field boolean isLoadPending>
		startFromFirstFrame = false;
	//   13   25:aload_0         
	//   14   26:iconst_0        
	//   15   27:putfield        #83  <Field boolean startFromFirstFrame>
		requestManager = requestmanager;
	//   16   30:aload_0         
	//   17   31:aload_2         
	//   18   32:putfield        #85  <Field RequestManager requestManager>
		requestmanager = ((RequestManager) (handler1));
	//   19   35:aload           4
	//   20   37:astore_2        
		if(handler1 == null)
	//*  21   38:aload           4
	//*  22   40:ifnonnull       62
			requestmanager = ((RequestManager) (new Handler(Looper.getMainLooper(), ((android.os.Handler.Callback) (new FrameLoaderCallback())))));
	//   23   43:new             #87  <Class Handler>
	//   24   46:dup             
	//   25   47:invokestatic    #93  <Method Looper Looper.getMainLooper()>
	//   26   50:new             #12  <Class GifFrameLoader$FrameLoaderCallback>
	//   27   53:dup             
	//   28   54:aload_0         
	//   29   55:invokespecial   #96  <Method void GifFrameLoader$FrameLoaderCallback(GifFrameLoader)>
	//   30   58:invokespecial   #99  <Method void Handler(Looper, android.os.Handler$Callback)>
	//   31   61:astore_2        
		bitmapPool = bitmappool;
	//   32   62:aload_0         
	//   33   63:aload_1         
	//   34   64:putfield        #101 <Field BitmapPool bitmapPool>
		handler = ((Handler) (requestmanager));
	//   35   67:aload_0         
	//   36   68:aload_2         
	//   37   69:putfield        #103 <Field Handler handler>
		requestBuilder = requestbuilder;
	//   38   72:aload_0         
	//   39   73:aload           5
	//   40   75:putfield        #105 <Field RequestBuilder requestBuilder>
		gifDecoder = gifdecoder;
	//   41   78:aload_0         
	//   42   79:aload_3         
	//   43   80:putfield        #107 <Field GifDecoder gifDecoder>
		setFrameTransformation(transformation1, bitmap);
	//   44   83:aload_0         
	//   45   84:aload           6
	//   46   86:aload           7
	//   47   88:invokevirtual   #111 <Method void setFrameTransformation(Transformation, Bitmap)>
	//   48   91:return          
	}

	private int getFrameSize()
	{
		return Util.getBitmapByteSize(getCurrentFrame().getWidth(), getCurrentFrame().getHeight(), getCurrentFrame().getConfig());
	//    0    0:aload_0         
	//    1    1:invokevirtual   #118 <Method Bitmap getCurrentFrame()>
	//    2    4:invokevirtual   #123 <Method int Bitmap.getWidth()>
	//    3    7:aload_0         
	//    4    8:invokevirtual   #118 <Method Bitmap getCurrentFrame()>
	//    5   11:invokevirtual   #126 <Method int Bitmap.getHeight()>
	//    6   14:aload_0         
	//    7   15:invokevirtual   #118 <Method Bitmap getCurrentFrame()>
	//    8   18:invokevirtual   #130 <Method android.graphics.Bitmap$Config Bitmap.getConfig()>
	//    9   21:invokestatic    #136 <Method int Util.getBitmapByteSize(int, int, android.graphics.Bitmap$Config)>
	//   10   24:ireturn         
	}

	private static RequestBuilder getRequestBuilder(RequestManager requestmanager, int i, int j)
	{
		return requestmanager.asBitmap().apply(RequestOptions.diskCacheStrategyOf(DiskCacheStrategy.NONE).skipMemoryCache(true).override(i, j));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #142 <Method RequestBuilder RequestManager.asBitmap()>
	//    2    4:getstatic       #148 <Field DiskCacheStrategy DiskCacheStrategy.NONE>
	//    3    7:invokestatic    #154 <Method RequestOptions RequestOptions.diskCacheStrategyOf(DiskCacheStrategy)>
	//    4   10:iconst_1        
	//    5   11:invokevirtual   #158 <Method RequestOptions RequestOptions.skipMemoryCache(boolean)>
	//    6   14:iload_1         
	//    7   15:iload_2         
	//    8   16:invokevirtual   #162 <Method RequestOptions RequestOptions.override(int, int)>
	//    9   19:invokevirtual   #168 <Method RequestBuilder RequestBuilder.apply(RequestOptions)>
	//   10   22:areturn         
	}

	private void loadNextFrame()
	{
		if(!isRunning || isLoadPending)
	//*   0    0:aload_0         
	//*   1    1:getfield        #79  <Field boolean isRunning>
	//*   2    4:ifeq            14
	//*   3    7:aload_0         
	//*   4    8:getfield        #81  <Field boolean isLoadPending>
	//*   5   11:ifeq            15
			return;
	//    6   14:return          
		if(startFromFirstFrame)
	//*   7   15:aload_0         
	//*   8   16:getfield        #83  <Field boolean startFromFirstFrame>
	//*   9   19:ifeq            36
		{
			gifDecoder.resetFrameIndex();
	//   10   22:aload_0         
	//   11   23:getfield        #107 <Field GifDecoder gifDecoder>
	//   12   26:invokeinterface #175 <Method void GifDecoder.resetFrameIndex()>
			startFromFirstFrame = false;
	//   13   31:aload_0         
	//   14   32:iconst_0        
	//   15   33:putfield        #83  <Field boolean startFromFirstFrame>
		}
		isLoadPending = true;
	//   16   36:aload_0         
	//   17   37:iconst_1        
	//   18   38:putfield        #81  <Field boolean isLoadPending>
		int i = gifDecoder.getNextDelay();
	//   19   41:aload_0         
	//   20   42:getfield        #107 <Field GifDecoder gifDecoder>
	//   21   45:invokeinterface #178 <Method int GifDecoder.getNextDelay()>
	//   22   50:istore_1        
		long l = SystemClock.uptimeMillis();
	//   23   51:invokestatic    #184 <Method long SystemClock.uptimeMillis()>
	//   24   54:lstore_2        
		long l1 = i;
	//   25   55:iload_1         
	//   26   56:i2l             
	//   27   57:lstore          4
		gifDecoder.advance();
	//   28   59:aload_0         
	//   29   60:getfield        #107 <Field GifDecoder gifDecoder>
	//   30   63:invokeinterface #187 <Method void GifDecoder.advance()>
		next = new DelayTarget(handler, gifDecoder.getCurrentFrameIndex(), l + l1);
	//   31   68:aload_0         
	//   32   69:new             #6   <Class GifFrameLoader$DelayTarget>
	//   33   72:dup             
	//   34   73:aload_0         
	//   35   74:getfield        #103 <Field Handler handler>
	//   36   77:aload_0         
	//   37   78:getfield        #107 <Field GifDecoder gifDecoder>
	//   38   81:invokeinterface #190 <Method int GifDecoder.getCurrentFrameIndex()>
	//   39   86:lload_2         
	//   40   87:lload           4
	//   41   89:ladd            
	//   42   90:invokespecial   #193 <Method void GifFrameLoader$DelayTarget(Handler, int, long)>
	//   43   93:putfield        #195 <Field GifFrameLoader$DelayTarget next>
		requestBuilder.clone().apply(RequestOptions.signatureOf(((Key) (new FrameSignature())))).load(((Object) (gifDecoder))).into(((com.bumptech.glide.request.target.Target) (next)));
	//   44   96:aload_0         
	//   45   97:getfield        #105 <Field RequestBuilder requestBuilder>
	//   46  100:invokevirtual   #198 <Method RequestBuilder RequestBuilder.clone()>
	//   47  103:new             #15  <Class GifFrameLoader$FrameSignature>
	//   48  106:dup             
	//   49  107:invokespecial   #199 <Method void GifFrameLoader$FrameSignature()>
	//   50  110:invokestatic    #203 <Method RequestOptions RequestOptions.signatureOf(Key)>
	//   51  113:invokevirtual   #168 <Method RequestBuilder RequestBuilder.apply(RequestOptions)>
	//   52  116:aload_0         
	//   53  117:getfield        #107 <Field GifDecoder gifDecoder>
	//   54  120:invokevirtual   #207 <Method RequestBuilder RequestBuilder.load(Object)>
	//   55  123:aload_0         
	//   56  124:getfield        #195 <Field GifFrameLoader$DelayTarget next>
	//   57  127:invokevirtual   #211 <Method com.bumptech.glide.request.target.Target RequestBuilder.into(com.bumptech.glide.request.target.Target)>
	//   58  130:pop             
	//   59  131:return          
	}

	private void recycleFirstFrame()
	{
		if(firstFrame != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #214 <Field Bitmap firstFrame>
	//*   2    4:ifnull          25
		{
			bitmapPool.put(firstFrame);
	//    3    7:aload_0         
	//    4    8:getfield        #101 <Field BitmapPool bitmapPool>
	//    5   11:aload_0         
	//    6   12:getfield        #214 <Field Bitmap firstFrame>
	//    7   15:invokeinterface #220 <Method void BitmapPool.put(Bitmap)>
			firstFrame = null;
	//    8   20:aload_0         
	//    9   21:aconst_null     
	//   10   22:putfield        #214 <Field Bitmap firstFrame>
		}
	//   11   25:return          
	}

	private void start()
	{
		if(isRunning)
	//*   0    0:aload_0         
	//*   1    1:getfield        #79  <Field boolean isRunning>
	//*   2    4:ifeq            8
		{
			return;
	//    3    7:return          
		} else
		{
			isRunning = true;
	//    4    8:aload_0         
	//    5    9:iconst_1        
	//    6   10:putfield        #79  <Field boolean isRunning>
			isCleared = false;
	//    7   13:aload_0         
	//    8   14:iconst_0        
	//    9   15:putfield        #223 <Field boolean isCleared>
			loadNextFrame();
	//   10   18:aload_0         
	//   11   19:invokespecial   #225 <Method void loadNextFrame()>
			return;
	//   12   22:return          
		}
	}

	private void stop()
	{
		isRunning = false;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #79  <Field boolean isRunning>
	//    3    5:return          
	}

	void clear()
	{
		callbacks.clear();
	//    0    0:aload_0         
	//    1    1:getfield        #77  <Field List callbacks>
	//    2    4:invokeinterface #231 <Method void List.clear()>
		recycleFirstFrame();
	//    3    9:aload_0         
	//    4   10:invokespecial   #233 <Method void recycleFirstFrame()>
		stop();
	//    5   13:aload_0         
	//    6   14:invokespecial   #235 <Method void stop()>
		if(current != null)
	//*   7   17:aload_0         
	//*   8   18:getfield        #237 <Field GifFrameLoader$DelayTarget current>
	//*   9   21:ifnull          40
		{
			requestManager.clear(((com.bumptech.glide.request.target.Target) (current)));
	//   10   24:aload_0         
	//   11   25:getfield        #85  <Field RequestManager requestManager>
	//   12   28:aload_0         
	//   13   29:getfield        #237 <Field GifFrameLoader$DelayTarget current>
	//   14   32:invokevirtual   #240 <Method void RequestManager.clear(com.bumptech.glide.request.target.Target)>
			current = null;
	//   15   35:aload_0         
	//   16   36:aconst_null     
	//   17   37:putfield        #237 <Field GifFrameLoader$DelayTarget current>
		}
		if(next != null)
	//*  18   40:aload_0         
	//*  19   41:getfield        #195 <Field GifFrameLoader$DelayTarget next>
	//*  20   44:ifnull          63
		{
			requestManager.clear(((com.bumptech.glide.request.target.Target) (next)));
	//   21   47:aload_0         
	//   22   48:getfield        #85  <Field RequestManager requestManager>
	//   23   51:aload_0         
	//   24   52:getfield        #195 <Field GifFrameLoader$DelayTarget next>
	//   25   55:invokevirtual   #240 <Method void RequestManager.clear(com.bumptech.glide.request.target.Target)>
			next = null;
	//   26   58:aload_0         
	//   27   59:aconst_null     
	//   28   60:putfield        #195 <Field GifFrameLoader$DelayTarget next>
		}
		gifDecoder.clear();
	//   29   63:aload_0         
	//   30   64:getfield        #107 <Field GifDecoder gifDecoder>
	//   31   67:invokeinterface #241 <Method void GifDecoder.clear()>
		isCleared = true;
	//   32   72:aload_0         
	//   33   73:iconst_1        
	//   34   74:putfield        #223 <Field boolean isCleared>
	//   35   77:return          
	}

	ByteBuffer getBuffer()
	{
		return gifDecoder.getData().asReadOnlyBuffer();
	//    0    0:aload_0         
	//    1    1:getfield        #107 <Field GifDecoder gifDecoder>
	//    2    4:invokeinterface #246 <Method ByteBuffer GifDecoder.getData()>
	//    3    9:invokevirtual   #251 <Method ByteBuffer ByteBuffer.asReadOnlyBuffer()>
	//    4   12:areturn         
	}

	Bitmap getCurrentFrame()
	{
		if(current != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #237 <Field GifFrameLoader$DelayTarget current>
	//*   2    4:ifnull          15
			return current.getResource();
	//    3    7:aload_0         
	//    4    8:getfield        #237 <Field GifFrameLoader$DelayTarget current>
	//    5   11:invokevirtual   #254 <Method Bitmap GifFrameLoader$DelayTarget.getResource()>
	//    6   14:areturn         
		else
			return firstFrame;
	//    7   15:aload_0         
	//    8   16:getfield        #214 <Field Bitmap firstFrame>
	//    9   19:areturn         
	}

	int getCurrentIndex()
	{
		if(current != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #237 <Field GifFrameLoader$DelayTarget current>
	//*   2    4:ifnull          15
			return current.index;
	//    3    7:aload_0         
	//    4    8:getfield        #237 <Field GifFrameLoader$DelayTarget current>
	//    5   11:getfield        #259 <Field int GifFrameLoader$DelayTarget.index>
	//    6   14:ireturn         
		else
			return -1;
	//    7   15:iconst_m1       
	//    8   16:ireturn         
	}

	Bitmap getFirstFrame()
	{
		return firstFrame;
	//    0    0:aload_0         
	//    1    1:getfield        #214 <Field Bitmap firstFrame>
	//    2    4:areturn         
	}

	int getFrameCount()
	{
		return gifDecoder.getFrameCount();
	//    0    0:aload_0         
	//    1    1:getfield        #107 <Field GifDecoder gifDecoder>
	//    2    4:invokeinterface #263 <Method int GifDecoder.getFrameCount()>
	//    3    9:ireturn         
	}

	Transformation getFrameTransformation()
	{
		return transformation;
	//    0    0:aload_0         
	//    1    1:getfield        #267 <Field Transformation transformation>
	//    2    4:areturn         
	}

	int getHeight()
	{
		return getCurrentFrame().getHeight();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #118 <Method Bitmap getCurrentFrame()>
	//    2    4:invokevirtual   #126 <Method int Bitmap.getHeight()>
	//    3    7:ireturn         
	}

	int getLoopCount()
	{
		return gifDecoder.getTotalIterationCount();
	//    0    0:aload_0         
	//    1    1:getfield        #107 <Field GifDecoder gifDecoder>
	//    2    4:invokeinterface #272 <Method int GifDecoder.getTotalIterationCount()>
	//    3    9:ireturn         
	}

	int getSize()
	{
		return gifDecoder.getByteSize() + getFrameSize();
	//    0    0:aload_0         
	//    1    1:getfield        #107 <Field GifDecoder gifDecoder>
	//    2    4:invokeinterface #276 <Method int GifDecoder.getByteSize()>
	//    3    9:aload_0         
	//    4   10:invokespecial   #278 <Method int getFrameSize()>
	//    5   13:iadd            
	//    6   14:ireturn         
	}

	int getWidth()
	{
		return getCurrentFrame().getWidth();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #118 <Method Bitmap getCurrentFrame()>
	//    2    4:invokevirtual   #123 <Method int Bitmap.getWidth()>
	//    3    7:ireturn         
	}

	void onFrameReady(DelayTarget delaytarget)
	{
		if(isCleared)
	//*   0    0:aload_0         
	//*   1    1:getfield        #223 <Field boolean isCleared>
	//*   2    4:ifeq            20
		{
			handler.obtainMessage(2, ((Object) (delaytarget))).sendToTarget();
	//    3    7:aload_0         
	//    4    8:getfield        #103 <Field Handler handler>
	//    5   11:iconst_2        
	//    6   12:aload_1         
	//    7   13:invokevirtual   #284 <Method Message Handler.obtainMessage(int, Object)>
	//    8   16:invokevirtual   #289 <Method void Message.sendToTarget()>
			return;
	//    9   19:return          
		}
		if(delaytarget.getResource() != null)
	//*  10   20:aload_1         
	//*  11   21:invokevirtual   #254 <Method Bitmap GifFrameLoader$DelayTarget.getResource()>
	//*  12   24:ifnull          98
		{
			recycleFirstFrame();
	//   13   27:aload_0         
	//   14   28:invokespecial   #233 <Method void recycleFirstFrame()>
			DelayTarget delaytarget1 = current;
	//   15   31:aload_0         
	//   16   32:getfield        #237 <Field GifFrameLoader$DelayTarget current>
	//   17   35:astore_3        
			current = delaytarget;
	//   18   36:aload_0         
	//   19   37:aload_1         
	//   20   38:putfield        #237 <Field GifFrameLoader$DelayTarget current>
			for(int i = callbacks.size() - 1; i >= 0; i--)
	//*  21   41:aload_0         
	//*  22   42:getfield        #77  <Field List callbacks>
	//*  23   45:invokeinterface #292 <Method int List.size()>
	//*  24   50:iconst_1        
	//*  25   51:isub            
	//*  26   52:istore_2        
	//*  27   53:iload_2         
	//*  28   54:iflt            82
				((FrameCallback)callbacks.get(i)).onFrameReady();
	//   29   57:aload_0         
	//   30   58:getfield        #77  <Field List callbacks>
	//   31   61:iload_2         
	//   32   62:invokeinterface #296 <Method Object List.get(int)>
	//   33   67:checkcast       #9   <Class GifFrameLoader$FrameCallback>
	//   34   70:invokeinterface #298 <Method void GifFrameLoader$FrameCallback.onFrameReady()>

	//   35   75:iload_2         
	//   36   76:iconst_1        
	//   37   77:isub            
	//   38   78:istore_2        
	//*  39   79:goto            53
			if(delaytarget1 != null)
	//*  40   82:aload_3         
	//*  41   83:ifnull          98
				handler.obtainMessage(2, ((Object) (delaytarget1))).sendToTarget();
	//   42   86:aload_0         
	//   43   87:getfield        #103 <Field Handler handler>
	//   44   90:iconst_2        
	//   45   91:aload_3         
	//   46   92:invokevirtual   #284 <Method Message Handler.obtainMessage(int, Object)>
	//   47   95:invokevirtual   #289 <Method void Message.sendToTarget()>
		}
		isLoadPending = false;
	//   48   98:aload_0         
	//   49   99:iconst_0        
	//   50  100:putfield        #81  <Field boolean isLoadPending>
		loadNextFrame();
	//   51  103:aload_0         
	//   52  104:invokespecial   #225 <Method void loadNextFrame()>
	//   53  107:return          
	}

	void setFrameTransformation(Transformation transformation1, Bitmap bitmap)
	{
		transformation = (Transformation)Preconditions.checkNotNull(((Object) (transformation1)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #304 <Method Object Preconditions.checkNotNull(Object)>
	//    3    5:checkcast       #306 <Class Transformation>
	//    4    8:putfield        #267 <Field Transformation transformation>
		firstFrame = (Bitmap)Preconditions.checkNotNull(((Object) (bitmap)));
	//    5   11:aload_0         
	//    6   12:aload_2         
	//    7   13:invokestatic    #304 <Method Object Preconditions.checkNotNull(Object)>
	//    8   16:checkcast       #120 <Class Bitmap>
	//    9   19:putfield        #214 <Field Bitmap firstFrame>
		requestBuilder = requestBuilder.apply((new RequestOptions()).transform(transformation1));
	//   10   22:aload_0         
	//   11   23:aload_0         
	//   12   24:getfield        #105 <Field RequestBuilder requestBuilder>
	//   13   27:new             #150 <Class RequestOptions>
	//   14   30:dup             
	//   15   31:invokespecial   #307 <Method void RequestOptions()>
	//   16   34:aload_1         
	//   17   35:invokevirtual   #311 <Method RequestOptions RequestOptions.transform(Transformation)>
	//   18   38:invokevirtual   #168 <Method RequestBuilder RequestBuilder.apply(RequestOptions)>
	//   19   41:putfield        #105 <Field RequestBuilder requestBuilder>
	//   20   44:return          
	}

	void setNextStartFromFirstFrame()
	{
		boolean flag;
		if(!isRunning)
	//*   0    0:aload_0         
	//*   1    1:getfield        #79  <Field boolean isRunning>
	//*   2    4:ifne            12
			flag = true;
	//    3    7:iconst_1        
	//    4    8:istore_1        
		else
	//*   5    9:goto            14
			flag = false;
	//    6   12:iconst_0        
	//    7   13:istore_1        
		Preconditions.checkArgument(flag, "Can't restart a running animation");
	//    8   14:iload_1         
	//    9   15:ldc2            #315 <String "Can't restart a running animation">
	//   10   18:invokestatic    #319 <Method void Preconditions.checkArgument(boolean, String)>
		startFromFirstFrame = true;
	//   11   21:aload_0         
	//   12   22:iconst_1        
	//   13   23:putfield        #83  <Field boolean startFromFirstFrame>
	//   14   26:return          
	}

	void subscribe(FrameCallback framecallback)
	{
		if(isCleared)
	//*   0    0:aload_0         
	//*   1    1:getfield        #223 <Field boolean isCleared>
	//*   2    4:ifeq            18
			throw new IllegalStateException("Cannot subscribe to a cleared frame loader");
	//    3    7:new             #323 <Class IllegalStateException>
	//    4   10:dup             
	//    5   11:ldc2            #325 <String "Cannot subscribe to a cleared frame loader">
	//    6   14:invokespecial   #328 <Method void IllegalStateException(String)>
	//    7   17:athrow          
		boolean flag = callbacks.isEmpty();
	//    8   18:aload_0         
	//    9   19:getfield        #77  <Field List callbacks>
	//   10   22:invokeinterface #332 <Method boolean List.isEmpty()>
	//   11   27:istore_2        
		if(callbacks.contains(((Object) (framecallback))))
	//*  12   28:aload_0         
	//*  13   29:getfield        #77  <Field List callbacks>
	//*  14   32:aload_1         
	//*  15   33:invokeinterface #336 <Method boolean List.contains(Object)>
	//*  16   38:ifeq            52
			throw new IllegalStateException("Cannot subscribe twice in a row");
	//   17   41:new             #323 <Class IllegalStateException>
	//   18   44:dup             
	//   19   45:ldc2            #338 <String "Cannot subscribe twice in a row">
	//   20   48:invokespecial   #328 <Method void IllegalStateException(String)>
	//   21   51:athrow          
		callbacks.add(((Object) (framecallback)));
	//   22   52:aload_0         
	//   23   53:getfield        #77  <Field List callbacks>
	//   24   56:aload_1         
	//   25   57:invokeinterface #341 <Method boolean List.add(Object)>
	//   26   62:pop             
		if(flag)
	//*  27   63:iload_2         
	//*  28   64:ifeq            71
			start();
	//   29   67:aload_0         
	//   30   68:invokespecial   #343 <Method void start()>
	//   31   71:return          
	}

	void unsubscribe(FrameCallback framecallback)
	{
		callbacks.remove(((Object) (framecallback)));
	//    0    0:aload_0         
	//    1    1:getfield        #77  <Field List callbacks>
	//    2    4:aload_1         
	//    3    5:invokeinterface #347 <Method boolean List.remove(Object)>
	//    4   10:pop             
		if(callbacks.isEmpty())
	//*   5   11:aload_0         
	//*   6   12:getfield        #77  <Field List callbacks>
	//*   7   15:invokeinterface #332 <Method boolean List.isEmpty()>
	//*   8   20:ifeq            27
			stop();
	//    9   23:aload_0         
	//   10   24:invokespecial   #235 <Method void stop()>
	//   11   27:return          
	}

	private final BitmapPool bitmapPool;
	private final List callbacks;
	private DelayTarget current;
	private Bitmap firstFrame;
	private final GifDecoder gifDecoder;
	private final Handler handler;
	private boolean isCleared;
	private boolean isLoadPending;
	private boolean isRunning;
	private DelayTarget next;
	private RequestBuilder requestBuilder;
	final RequestManager requestManager;
	private boolean startFromFirstFrame;
	private Transformation transformation;
}

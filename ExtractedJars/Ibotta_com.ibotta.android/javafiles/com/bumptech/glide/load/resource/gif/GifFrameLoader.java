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
import com.bumptech.glide.signature.ObjectKey;
import com.bumptech.glide.util.Preconditions;
import com.bumptech.glide.util.Util;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

class GifFrameLoader
{
	static class DelayTarget extends SimpleTarget
	{

		Bitmap getResource()
		{
			return resource;
		//    0    0:aload_0         
		//    1    1:getfield        #33  <Field Bitmap resource>
		//    2    4:areturn         
		}

		public void onResourceReady(Bitmap bitmap, Transition transition)
		{
			resource = bitmap;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #33  <Field Bitmap resource>
			bitmap = ((Bitmap) (handler.obtainMessage(1, ((Object) (this)))));
		//    3    5:aload_0         
		//    4    6:getfield        #24  <Field Handler handler>
		//    5    9:iconst_1        
		//    6   10:aload_0         
		//    7   11:invokevirtual   #43  <Method Message Handler.obtainMessage(int, Object)>
		//    8   14:astore_1        
			handler.sendMessageAtTime(((Message) (bitmap)), targetTime);
		//    9   15:aload_0         
		//   10   16:getfield        #24  <Field Handler handler>
		//   11   19:aload_1         
		//   12   20:aload_0         
		//   13   21:getfield        #28  <Field long targetTime>
		//   14   24:invokevirtual   #47  <Method boolean Handler.sendMessageAtTime(Message, long)>
		//   15   27:pop             
		//   16   28:return          
		}

		public volatile void onResourceReady(Object obj, Transition transition)
		{
			onResourceReady((Bitmap)obj, transition);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:checkcast       #53  <Class Bitmap>
		//    3    5:aload_2         
		//    4    6:invokevirtual   #55  <Method void onResourceReady(Bitmap, Transition)>
		//    5    9:return          
		}

		private final Handler handler;
		final int index;
		private Bitmap resource;
		private final long targetTime;

		DelayTarget(Handler handler1, int i, long l)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #22  <Method void SimpleTarget()>
			handler = handler1;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #24  <Field Handler handler>
			index = i;
		//    5    9:aload_0         
		//    6   10:iload_2         
		//    7   11:putfield        #26  <Field int index>
			targetTime = l;
		//    8   14:aload_0         
		//    9   15:lload_3         
		//   10   16:putfield        #28  <Field long targetTime>
		//   11   19:return          
		}
	}

	public static interface FrameCallback
	{

		public abstract void onFrameReady();
	}

	private class FrameLoaderCallback
		implements android.os.Handler.Callback
	{

		public boolean handleMessage(Message message)
		{
			if(message.what == 1)
		//*   0    0:aload_1         
		//*   1    1:getfield        #27  <Field int Message.what>
		//*   2    4:iconst_1        
		//*   3    5:icmpne          26
			{
				message = ((Message) ((DelayTarget)message.obj));
		//    4    8:aload_1         
		//    5    9:getfield        #31  <Field Object Message.obj>
		//    6   12:checkcast       #33  <Class GifFrameLoader$DelayTarget>
		//    7   15:astore_1        
				onFrameReady(((DelayTarget) (message)));
		//    8   16:aload_0         
		//    9   17:getfield        #15  <Field GifFrameLoader this$0>
		//   10   20:aload_1         
		//   11   21:invokevirtual   #37  <Method void GifFrameLoader.onFrameReady(GifFrameLoader$DelayTarget)>
				return true;
		//   12   24:iconst_1        
		//   13   25:ireturn         
			}
			if(message.what == 2)
		//*  14   26:aload_1         
		//*  15   27:getfield        #27  <Field int Message.what>
		//*  16   30:iconst_2        
		//*  17   31:icmpne          53
			{
				message = ((Message) ((DelayTarget)message.obj));
		//   18   34:aload_1         
		//   19   35:getfield        #31  <Field Object Message.obj>
		//   20   38:checkcast       #33  <Class GifFrameLoader$DelayTarget>
		//   21   41:astore_1        
				requestManager.clear(((com.bumptech.glide.request.target.Target) (message)));
		//   22   42:aload_0         
		//   23   43:getfield        #15  <Field GifFrameLoader this$0>
		//   24   46:getfield        #41  <Field RequestManager GifFrameLoader.requestManager>
		//   25   49:aload_1         
		//   26   50:invokevirtual   #47  <Method void RequestManager.clear(com.bumptech.glide.request.target.Target)>
			}
			return false;
		//   27   53:iconst_0        
		//   28   54:ireturn         
		}

		final GifFrameLoader this$0;

		FrameLoaderCallback()
		{
			this$0 = GifFrameLoader.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #15  <Field GifFrameLoader this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #18  <Method void Object()>
		//    5    9:return          
		}
	}

	static interface OnEveryFrameListener
	{

		public abstract void onFrameReady();
	}


	GifFrameLoader(Glide glide, GifDecoder gifdecoder, int i, int j, Transformation transformation1, Bitmap bitmap)
	{
		this(glide.getBitmapPool(), Glide.with(glide.getContext()), gifdecoder, ((Handler) (null)), getRequestBuilder(Glide.with(glide.getContext()), i, j), transformation1, bitmap);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #55  <Method BitmapPool Glide.getBitmapPool()>
	//    3    5:aload_1         
	//    4    6:invokevirtual   #59  <Method android.content.Context Glide.getContext()>
	//    5    9:invokestatic    #63  <Method RequestManager Glide.with(android.content.Context)>
	//    6   12:aload_2         
	//    7   13:aconst_null     
	//    8   14:aload_1         
	//    9   15:invokevirtual   #59  <Method android.content.Context Glide.getContext()>
	//   10   18:invokestatic    #63  <Method RequestManager Glide.with(android.content.Context)>
	//   11   21:iload_3         
	//   12   22:iload           4
	//   13   24:invokestatic    #67  <Method RequestBuilder getRequestBuilder(RequestManager, int, int)>
	//   14   27:aload           5
	//   15   29:aload           6
	//   16   31:invokespecial   #70  <Method void GifFrameLoader(BitmapPool, RequestManager, GifDecoder, Handler, RequestBuilder, Transformation, Bitmap)>
	//   17   34:return          
	}

	GifFrameLoader(BitmapPool bitmappool, RequestManager requestmanager, GifDecoder gifdecoder, Handler handler1, RequestBuilder requestbuilder, Transformation transformation1, Bitmap bitmap)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #76  <Method void Object()>
		callbacks = ((List) (new ArrayList()));
	//    2    4:aload_0         
	//    3    5:new             #78  <Class ArrayList>
	//    4    8:dup             
	//    5    9:invokespecial   #79  <Method void ArrayList()>
	//    6   12:putfield        #81  <Field List callbacks>
		requestManager = requestmanager;
	//    7   15:aload_0         
	//    8   16:aload_2         
	//    9   17:putfield        #83  <Field RequestManager requestManager>
		requestmanager = ((RequestManager) (handler1));
	//   10   20:aload           4
	//   11   22:astore_2        
		if(handler1 == null)
	//*  12   23:aload           4
	//*  13   25:ifnonnull       47
			requestmanager = ((RequestManager) (new Handler(Looper.getMainLooper(), ((android.os.Handler.Callback) (new FrameLoaderCallback())))));
	//   14   28:new             #85  <Class Handler>
	//   15   31:dup             
	//   16   32:invokestatic    #91  <Method Looper Looper.getMainLooper()>
	//   17   35:new             #12  <Class GifFrameLoader$FrameLoaderCallback>
	//   18   38:dup             
	//   19   39:aload_0         
	//   20   40:invokespecial   #94  <Method void GifFrameLoader$FrameLoaderCallback(GifFrameLoader)>
	//   21   43:invokespecial   #97  <Method void Handler(Looper, android.os.Handler$Callback)>
	//   22   46:astore_2        
		bitmapPool = bitmappool;
	//   23   47:aload_0         
	//   24   48:aload_1         
	//   25   49:putfield        #99  <Field BitmapPool bitmapPool>
		handler = ((Handler) (requestmanager));
	//   26   52:aload_0         
	//   27   53:aload_2         
	//   28   54:putfield        #101 <Field Handler handler>
		requestBuilder = requestbuilder;
	//   29   57:aload_0         
	//   30   58:aload           5
	//   31   60:putfield        #103 <Field RequestBuilder requestBuilder>
		gifDecoder = gifdecoder;
	//   32   63:aload_0         
	//   33   64:aload_3         
	//   34   65:putfield        #105 <Field GifDecoder gifDecoder>
		setFrameTransformation(transformation1, bitmap);
	//   35   68:aload_0         
	//   36   69:aload           6
	//   37   71:aload           7
	//   38   73:invokevirtual   #109 <Method void setFrameTransformation(Transformation, Bitmap)>
	//   39   76:return          
	}

	private static Key getFrameSignature()
	{
		return ((Key) (new ObjectKey(((Object) (Double.valueOf(Math.random()))))));
	//    0    0:new             #114 <Class ObjectKey>
	//    1    3:dup             
	//    2    4:invokestatic    #120 <Method double Math.random()>
	//    3    7:invokestatic    #126 <Method Double Double.valueOf(double)>
	//    4   10:invokespecial   #129 <Method void ObjectKey(Object)>
	//    5   13:areturn         
	}

	private int getFrameSize()
	{
		return Util.getBitmapByteSize(getCurrentFrame().getWidth(), getCurrentFrame().getHeight(), getCurrentFrame().getConfig());
	//    0    0:aload_0         
	//    1    1:invokevirtual   #135 <Method Bitmap getCurrentFrame()>
	//    2    4:invokevirtual   #140 <Method int Bitmap.getWidth()>
	//    3    7:aload_0         
	//    4    8:invokevirtual   #135 <Method Bitmap getCurrentFrame()>
	//    5   11:invokevirtual   #143 <Method int Bitmap.getHeight()>
	//    6   14:aload_0         
	//    7   15:invokevirtual   #135 <Method Bitmap getCurrentFrame()>
	//    8   18:invokevirtual   #147 <Method android.graphics.Bitmap$Config Bitmap.getConfig()>
	//    9   21:invokestatic    #153 <Method int Util.getBitmapByteSize(int, int, android.graphics.Bitmap$Config)>
	//   10   24:ireturn         
	}

	private static RequestBuilder getRequestBuilder(RequestManager requestmanager, int i, int j)
	{
		return requestmanager.asBitmap().apply(((RequestOptions)((RequestOptions)RequestOptions.diskCacheStrategyOf(DiskCacheStrategy.NONE).useAnimationPool(true)).skipMemoryCache(true)).override(i, j));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #159 <Method RequestBuilder RequestManager.asBitmap()>
	//    2    4:getstatic       #165 <Field DiskCacheStrategy DiskCacheStrategy.NONE>
	//    3    7:invokestatic    #171 <Method RequestOptions RequestOptions.diskCacheStrategyOf(DiskCacheStrategy)>
	//    4   10:iconst_1        
	//    5   11:invokevirtual   #175 <Method com.bumptech.glide.request.BaseRequestOptions RequestOptions.useAnimationPool(boolean)>
	//    6   14:checkcast       #167 <Class RequestOptions>
	//    7   17:iconst_1        
	//    8   18:invokevirtual   #178 <Method com.bumptech.glide.request.BaseRequestOptions RequestOptions.skipMemoryCache(boolean)>
	//    9   21:checkcast       #167 <Class RequestOptions>
	//   10   24:iload_1         
	//   11   25:iload_2         
	//   12   26:invokevirtual   #182 <Method com.bumptech.glide.request.BaseRequestOptions RequestOptions.override(int, int)>
	//   13   29:invokevirtual   #188 <Method RequestBuilder RequestBuilder.apply(com.bumptech.glide.request.BaseRequestOptions)>
	//   14   32:areturn         
	}

	private void loadNextFrame()
	{
		if(isRunning)
	//*   0    0:aload_0         
	//*   1    1:getfield        #192 <Field boolean isRunning>
	//*   2    4:ifeq            168
		{
			if(isLoadPending)
	//*   3    7:aload_0         
	//*   4    8:getfield        #194 <Field boolean isLoadPending>
	//*   5   11:ifeq            15
				return;
	//    6   14:return          
			if(startFromFirstFrame)
	//*   7   15:aload_0         
	//*   8   16:getfield        #196 <Field boolean startFromFirstFrame>
	//*   9   19:ifeq            56
			{
				boolean flag;
				if(pendingTarget == null)
	//*  10   22:aload_0         
	//*  11   23:getfield        #198 <Field GifFrameLoader$DelayTarget pendingTarget>
	//*  12   26:ifnonnull       34
					flag = true;
	//   13   29:iconst_1        
	//   14   30:istore_2        
				else
	//*  15   31:goto            36
					flag = false;
	//   16   34:iconst_0        
	//   17   35:istore_2        
				Preconditions.checkArgument(flag, "Pending target must be null when starting from the first frame");
	//   18   36:iload_2         
	//   19   37:ldc1            #200 <String "Pending target must be null when starting from the first frame">
	//   20   39:invokestatic    #206 <Method void Preconditions.checkArgument(boolean, String)>
				gifDecoder.resetFrameIndex();
	//   21   42:aload_0         
	//   22   43:getfield        #105 <Field GifDecoder gifDecoder>
	//   23   46:invokeinterface #211 <Method void GifDecoder.resetFrameIndex()>
				startFromFirstFrame = false;
	//   24   51:aload_0         
	//   25   52:iconst_0        
	//   26   53:putfield        #196 <Field boolean startFromFirstFrame>
			}
			DelayTarget delaytarget = pendingTarget;
	//   27   56:aload_0         
	//   28   57:getfield        #198 <Field GifFrameLoader$DelayTarget pendingTarget>
	//   29   60:astore          7
			if(delaytarget != null)
	//*  30   62:aload           7
	//*  31   64:ifnull          79
			{
				pendingTarget = null;
	//   32   67:aload_0         
	//   33   68:aconst_null     
	//   34   69:putfield        #198 <Field GifFrameLoader$DelayTarget pendingTarget>
				onFrameReady(delaytarget);
	//   35   72:aload_0         
	//   36   73:aload           7
	//   37   75:invokevirtual   #215 <Method void onFrameReady(GifFrameLoader$DelayTarget)>
				return;
	//   38   78:return          
			} else
			{
				isLoadPending = true;
	//   39   79:aload_0         
	//   40   80:iconst_1        
	//   41   81:putfield        #194 <Field boolean isLoadPending>
				int i = gifDecoder.getNextDelay();
	//   42   84:aload_0         
	//   43   85:getfield        #105 <Field GifDecoder gifDecoder>
	//   44   88:invokeinterface #218 <Method int GifDecoder.getNextDelay()>
	//   45   93:istore_1        
				long l = SystemClock.uptimeMillis();
	//   46   94:invokestatic    #224 <Method long SystemClock.uptimeMillis()>
	//   47   97:lstore_3        
				long l1 = i;
	//   48   98:iload_1         
	//   49   99:i2l             
	//   50  100:lstore          5
				gifDecoder.advance();
	//   51  102:aload_0         
	//   52  103:getfield        #105 <Field GifDecoder gifDecoder>
	//   53  106:invokeinterface #227 <Method void GifDecoder.advance()>
				next = new DelayTarget(handler, gifDecoder.getCurrentFrameIndex(), l + l1);
	//   54  111:aload_0         
	//   55  112:new             #6   <Class GifFrameLoader$DelayTarget>
	//   56  115:dup             
	//   57  116:aload_0         
	//   58  117:getfield        #101 <Field Handler handler>
	//   59  120:aload_0         
	//   60  121:getfield        #105 <Field GifDecoder gifDecoder>
	//   61  124:invokeinterface #230 <Method int GifDecoder.getCurrentFrameIndex()>
	//   62  129:lload_3         
	//   63  130:lload           5
	//   64  132:ladd            
	//   65  133:invokespecial   #233 <Method void GifFrameLoader$DelayTarget(Handler, int, long)>
	//   66  136:putfield        #235 <Field GifFrameLoader$DelayTarget next>
				requestBuilder.apply(((com.bumptech.glide.request.BaseRequestOptions) (RequestOptions.signatureOf(getFrameSignature())))).load(((Object) (gifDecoder))).into(((com.bumptech.glide.request.target.Target) (next)));
	//   67  139:aload_0         
	//   68  140:getfield        #103 <Field RequestBuilder requestBuilder>
	//   69  143:invokestatic    #237 <Method Key getFrameSignature()>
	//   70  146:invokestatic    #241 <Method RequestOptions RequestOptions.signatureOf(Key)>
	//   71  149:invokevirtual   #188 <Method RequestBuilder RequestBuilder.apply(com.bumptech.glide.request.BaseRequestOptions)>
	//   72  152:aload_0         
	//   73  153:getfield        #105 <Field GifDecoder gifDecoder>
	//   74  156:invokevirtual   #245 <Method RequestBuilder RequestBuilder.load(Object)>
	//   75  159:aload_0         
	//   76  160:getfield        #235 <Field GifFrameLoader$DelayTarget next>
	//   77  163:invokevirtual   #249 <Method com.bumptech.glide.request.target.Target RequestBuilder.into(com.bumptech.glide.request.target.Target)>
	//   78  166:pop             
				return;
	//   79  167:return          
			}
		} else
		{
			return;
	//   80  168:return          
		}
	}

	private void recycleFirstFrame()
	{
		Bitmap bitmap = firstFrame;
	//    0    0:aload_0         
	//    1    1:getfield        #252 <Field Bitmap firstFrame>
	//    2    4:astore_1        
		if(bitmap != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          24
		{
			bitmapPool.put(bitmap);
	//    5    9:aload_0         
	//    6   10:getfield        #99  <Field BitmapPool bitmapPool>
	//    7   13:aload_1         
	//    8   14:invokeinterface #258 <Method void BitmapPool.put(Bitmap)>
			firstFrame = null;
	//    9   19:aload_0         
	//   10   20:aconst_null     
	//   11   21:putfield        #252 <Field Bitmap firstFrame>
		}
	//   12   24:return          
	}

	private void start()
	{
		if(isRunning)
	//*   0    0:aload_0         
	//*   1    1:getfield        #192 <Field boolean isRunning>
	//*   2    4:ifeq            8
		{
			return;
	//    3    7:return          
		} else
		{
			isRunning = true;
	//    4    8:aload_0         
	//    5    9:iconst_1        
	//    6   10:putfield        #192 <Field boolean isRunning>
			isCleared = false;
	//    7   13:aload_0         
	//    8   14:iconst_0        
	//    9   15:putfield        #261 <Field boolean isCleared>
			loadNextFrame();
	//   10   18:aload_0         
	//   11   19:invokespecial   #263 <Method void loadNextFrame()>
			return;
	//   12   22:return          
		}
	}

	private void stop()
	{
		isRunning = false;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #192 <Field boolean isRunning>
	//    3    5:return          
	}

	void clear()
	{
		callbacks.clear();
	//    0    0:aload_0         
	//    1    1:getfield        #81  <Field List callbacks>
	//    2    4:invokeinterface #269 <Method void List.clear()>
		recycleFirstFrame();
	//    3    9:aload_0         
	//    4   10:invokespecial   #271 <Method void recycleFirstFrame()>
		stop();
	//    5   13:aload_0         
	//    6   14:invokespecial   #273 <Method void stop()>
		DelayTarget delaytarget = current;
	//    7   17:aload_0         
	//    8   18:getfield        #275 <Field GifFrameLoader$DelayTarget current>
	//    9   21:astore_1        
		if(delaytarget != null)
	//*  10   22:aload_1         
	//*  11   23:ifnull          39
		{
			requestManager.clear(((com.bumptech.glide.request.target.Target) (delaytarget)));
	//   12   26:aload_0         
	//   13   27:getfield        #83  <Field RequestManager requestManager>
	//   14   30:aload_1         
	//   15   31:invokevirtual   #278 <Method void RequestManager.clear(com.bumptech.glide.request.target.Target)>
			current = null;
	//   16   34:aload_0         
	//   17   35:aconst_null     
	//   18   36:putfield        #275 <Field GifFrameLoader$DelayTarget current>
		}
		delaytarget = next;
	//   19   39:aload_0         
	//   20   40:getfield        #235 <Field GifFrameLoader$DelayTarget next>
	//   21   43:astore_1        
		if(delaytarget != null)
	//*  22   44:aload_1         
	//*  23   45:ifnull          61
		{
			requestManager.clear(((com.bumptech.glide.request.target.Target) (delaytarget)));
	//   24   48:aload_0         
	//   25   49:getfield        #83  <Field RequestManager requestManager>
	//   26   52:aload_1         
	//   27   53:invokevirtual   #278 <Method void RequestManager.clear(com.bumptech.glide.request.target.Target)>
			next = null;
	//   28   56:aload_0         
	//   29   57:aconst_null     
	//   30   58:putfield        #235 <Field GifFrameLoader$DelayTarget next>
		}
		delaytarget = pendingTarget;
	//   31   61:aload_0         
	//   32   62:getfield        #198 <Field GifFrameLoader$DelayTarget pendingTarget>
	//   33   65:astore_1        
		if(delaytarget != null)
	//*  34   66:aload_1         
	//*  35   67:ifnull          83
		{
			requestManager.clear(((com.bumptech.glide.request.target.Target) (delaytarget)));
	//   36   70:aload_0         
	//   37   71:getfield        #83  <Field RequestManager requestManager>
	//   38   74:aload_1         
	//   39   75:invokevirtual   #278 <Method void RequestManager.clear(com.bumptech.glide.request.target.Target)>
			pendingTarget = null;
	//   40   78:aload_0         
	//   41   79:aconst_null     
	//   42   80:putfield        #198 <Field GifFrameLoader$DelayTarget pendingTarget>
		}
		gifDecoder.clear();
	//   43   83:aload_0         
	//   44   84:getfield        #105 <Field GifDecoder gifDecoder>
	//   45   87:invokeinterface #279 <Method void GifDecoder.clear()>
		isCleared = true;
	//   46   92:aload_0         
	//   47   93:iconst_1        
	//   48   94:putfield        #261 <Field boolean isCleared>
	//   49   97:return          
	}

	ByteBuffer getBuffer()
	{
		return gifDecoder.getData().asReadOnlyBuffer();
	//    0    0:aload_0         
	//    1    1:getfield        #105 <Field GifDecoder gifDecoder>
	//    2    4:invokeinterface #284 <Method ByteBuffer GifDecoder.getData()>
	//    3    9:invokevirtual   #289 <Method ByteBuffer ByteBuffer.asReadOnlyBuffer()>
	//    4   12:areturn         
	}

	Bitmap getCurrentFrame()
	{
		DelayTarget delaytarget = current;
	//    0    0:aload_0         
	//    1    1:getfield        #275 <Field GifFrameLoader$DelayTarget current>
	//    2    4:astore_1        
		if(delaytarget != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          14
			return delaytarget.getResource();
	//    5    9:aload_1         
	//    6   10:invokevirtual   #292 <Method Bitmap GifFrameLoader$DelayTarget.getResource()>
	//    7   13:areturn         
		else
			return firstFrame;
	//    8   14:aload_0         
	//    9   15:getfield        #252 <Field Bitmap firstFrame>
	//   10   18:areturn         
	}

	int getCurrentIndex()
	{
		DelayTarget delaytarget = current;
	//    0    0:aload_0         
	//    1    1:getfield        #275 <Field GifFrameLoader$DelayTarget current>
	//    2    4:astore_1        
		if(delaytarget != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          14
			return delaytarget.index;
	//    5    9:aload_1         
	//    6   10:getfield        #297 <Field int GifFrameLoader$DelayTarget.index>
	//    7   13:ireturn         
		else
			return -1;
	//    8   14:iconst_m1       
	//    9   15:ireturn         
	}

	Bitmap getFirstFrame()
	{
		return firstFrame;
	//    0    0:aload_0         
	//    1    1:getfield        #252 <Field Bitmap firstFrame>
	//    2    4:areturn         
	}

	int getFrameCount()
	{
		return gifDecoder.getFrameCount();
	//    0    0:aload_0         
	//    1    1:getfield        #105 <Field GifDecoder gifDecoder>
	//    2    4:invokeinterface #301 <Method int GifDecoder.getFrameCount()>
	//    3    9:ireturn         
	}

	int getHeight()
	{
		return getCurrentFrame().getHeight();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #135 <Method Bitmap getCurrentFrame()>
	//    2    4:invokevirtual   #143 <Method int Bitmap.getHeight()>
	//    3    7:ireturn         
	}

	int getSize()
	{
		return gifDecoder.getByteSize() + getFrameSize();
	//    0    0:aload_0         
	//    1    1:getfield        #105 <Field GifDecoder gifDecoder>
	//    2    4:invokeinterface #305 <Method int GifDecoder.getByteSize()>
	//    3    9:aload_0         
	//    4   10:invokespecial   #307 <Method int getFrameSize()>
	//    5   13:iadd            
	//    6   14:ireturn         
	}

	int getWidth()
	{
		return getCurrentFrame().getWidth();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #135 <Method Bitmap getCurrentFrame()>
	//    2    4:invokevirtual   #140 <Method int Bitmap.getWidth()>
	//    3    7:ireturn         
	}

	void onFrameReady(DelayTarget delaytarget)
	{
		OnEveryFrameListener oneveryframelistener = onEveryFrameListener;
	//    0    0:aload_0         
	//    1    1:getfield        #310 <Field GifFrameLoader$OnEveryFrameListener onEveryFrameListener>
	//    2    4:astore_3        
		if(oneveryframelistener != null)
	//*   3    5:aload_3         
	//*   4    6:ifnull          15
			oneveryframelistener.onFrameReady();
	//    5    9:aload_3         
	//    6   10:invokeinterface #312 <Method void GifFrameLoader$OnEveryFrameListener.onFrameReady()>
		isLoadPending = false;
	//    7   15:aload_0         
	//    8   16:iconst_0        
	//    9   17:putfield        #194 <Field boolean isLoadPending>
		if(isCleared)
	//*  10   20:aload_0         
	//*  11   21:getfield        #261 <Field boolean isCleared>
	//*  12   24:ifeq            40
		{
			handler.obtainMessage(2, ((Object) (delaytarget))).sendToTarget();
	//   13   27:aload_0         
	//   14   28:getfield        #101 <Field Handler handler>
	//   15   31:iconst_2        
	//   16   32:aload_1         
	//   17   33:invokevirtual   #316 <Method Message Handler.obtainMessage(int, Object)>
	//   18   36:invokevirtual   #321 <Method void Message.sendToTarget()>
			return;
	//   19   39:return          
		}
		if(!isRunning)
	//*  20   40:aload_0         
	//*  21   41:getfield        #192 <Field boolean isRunning>
	//*  22   44:ifne            53
		{
			pendingTarget = delaytarget;
	//   23   47:aload_0         
	//   24   48:aload_1         
	//   25   49:putfield        #198 <Field GifFrameLoader$DelayTarget pendingTarget>
			return;
	//   26   52:return          
		}
		if(delaytarget.getResource() != null)
	//*  27   53:aload_1         
	//*  28   54:invokevirtual   #292 <Method Bitmap GifFrameLoader$DelayTarget.getResource()>
	//*  29   57:ifnull          131
		{
			recycleFirstFrame();
	//   30   60:aload_0         
	//   31   61:invokespecial   #271 <Method void recycleFirstFrame()>
			DelayTarget delaytarget1 = current;
	//   32   64:aload_0         
	//   33   65:getfield        #275 <Field GifFrameLoader$DelayTarget current>
	//   34   68:astore_3        
			current = delaytarget;
	//   35   69:aload_0         
	//   36   70:aload_1         
	//   37   71:putfield        #275 <Field GifFrameLoader$DelayTarget current>
			for(int i = callbacks.size() - 1; i >= 0; i--)
	//*  38   74:aload_0         
	//*  39   75:getfield        #81  <Field List callbacks>
	//*  40   78:invokeinterface #324 <Method int List.size()>
	//*  41   83:iconst_1        
	//*  42   84:isub            
	//*  43   85:istore_2        
	//*  44   86:iload_2         
	//*  45   87:iflt            115
				((FrameCallback)callbacks.get(i)).onFrameReady();
	//   46   90:aload_0         
	//   47   91:getfield        #81  <Field List callbacks>
	//   48   94:iload_2         
	//   49   95:invokeinterface #328 <Method Object List.get(int)>
	//   50  100:checkcast       #9   <Class GifFrameLoader$FrameCallback>
	//   51  103:invokeinterface #329 <Method void GifFrameLoader$FrameCallback.onFrameReady()>

	//   52  108:iload_2         
	//   53  109:iconst_1        
	//   54  110:isub            
	//   55  111:istore_2        
	//*  56  112:goto            86
			if(delaytarget1 != null)
	//*  57  115:aload_3         
	//*  58  116:ifnull          131
				handler.obtainMessage(2, ((Object) (delaytarget1))).sendToTarget();
	//   59  119:aload_0         
	//   60  120:getfield        #101 <Field Handler handler>
	//   61  123:iconst_2        
	//   62  124:aload_3         
	//   63  125:invokevirtual   #316 <Method Message Handler.obtainMessage(int, Object)>
	//   64  128:invokevirtual   #321 <Method void Message.sendToTarget()>
		}
		loadNextFrame();
	//   65  131:aload_0         
	//   66  132:invokespecial   #263 <Method void loadNextFrame()>
	//   67  135:return          
	}

	void setFrameTransformation(Transformation transformation1, Bitmap bitmap)
	{
		transformation = (Transformation)Preconditions.checkNotNull(((Object) (transformation1)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #334 <Method Object Preconditions.checkNotNull(Object)>
	//    3    5:checkcast       #336 <Class Transformation>
	//    4    8:putfield        #338 <Field Transformation transformation>
		firstFrame = (Bitmap)Preconditions.checkNotNull(((Object) (bitmap)));
	//    5   11:aload_0         
	//    6   12:aload_2         
	//    7   13:invokestatic    #334 <Method Object Preconditions.checkNotNull(Object)>
	//    8   16:checkcast       #137 <Class Bitmap>
	//    9   19:putfield        #252 <Field Bitmap firstFrame>
		requestBuilder = requestBuilder.apply((new RequestOptions()).transform(transformation1));
	//   10   22:aload_0         
	//   11   23:aload_0         
	//   12   24:getfield        #103 <Field RequestBuilder requestBuilder>
	//   13   27:new             #167 <Class RequestOptions>
	//   14   30:dup             
	//   15   31:invokespecial   #339 <Method void RequestOptions()>
	//   16   34:aload_1         
	//   17   35:invokevirtual   #343 <Method com.bumptech.glide.request.BaseRequestOptions RequestOptions.transform(Transformation)>
	//   18   38:invokevirtual   #188 <Method RequestBuilder RequestBuilder.apply(com.bumptech.glide.request.BaseRequestOptions)>
	//   19   41:putfield        #103 <Field RequestBuilder requestBuilder>
	//   20   44:return          
	}

	void subscribe(FrameCallback framecallback)
	{
		if(!isCleared)
	//*   0    0:aload_0         
	//*   1    1:getfield        #261 <Field boolean isCleared>
	//*   2    4:ifne            61
		{
			if(!callbacks.contains(((Object) (framecallback))))
	//*   3    7:aload_0         
	//*   4    8:getfield        #81  <Field List callbacks>
	//*   5   11:aload_1         
	//*   6   12:invokeinterface #350 <Method boolean List.contains(Object)>
	//*   7   17:ifne            50
			{
				boolean flag = callbacks.isEmpty();
	//    8   20:aload_0         
	//    9   21:getfield        #81  <Field List callbacks>
	//   10   24:invokeinterface #354 <Method boolean List.isEmpty()>
	//   11   29:istore_2        
				callbacks.add(((Object) (framecallback)));
	//   12   30:aload_0         
	//   13   31:getfield        #81  <Field List callbacks>
	//   14   34:aload_1         
	//   15   35:invokeinterface #357 <Method boolean List.add(Object)>
	//   16   40:pop             
				if(flag)
	//*  17   41:iload_2         
	//*  18   42:ifeq            49
					start();
	//   19   45:aload_0         
	//   20   46:invokespecial   #359 <Method void start()>
				return;
	//   21   49:return          
			} else
			{
				throw new IllegalStateException("Cannot subscribe twice in a row");
	//   22   50:new             #361 <Class IllegalStateException>
	//   23   53:dup             
	//   24   54:ldc2            #363 <String "Cannot subscribe twice in a row">
	//   25   57:invokespecial   #366 <Method void IllegalStateException(String)>
	//   26   60:athrow          
			}
		} else
		{
			throw new IllegalStateException("Cannot subscribe to a cleared frame loader");
	//   27   61:new             #361 <Class IllegalStateException>
	//   28   64:dup             
	//   29   65:ldc2            #368 <String "Cannot subscribe to a cleared frame loader">
	//   30   68:invokespecial   #366 <Method void IllegalStateException(String)>
	//   31   71:athrow          
		}
	}

	void unsubscribe(FrameCallback framecallback)
	{
		callbacks.remove(((Object) (framecallback)));
	//    0    0:aload_0         
	//    1    1:getfield        #81  <Field List callbacks>
	//    2    4:aload_1         
	//    3    5:invokeinterface #372 <Method boolean List.remove(Object)>
	//    4   10:pop             
		if(callbacks.isEmpty())
	//*   5   11:aload_0         
	//*   6   12:getfield        #81  <Field List callbacks>
	//*   7   15:invokeinterface #354 <Method boolean List.isEmpty()>
	//*   8   20:ifeq            27
			stop();
	//    9   23:aload_0         
	//   10   24:invokespecial   #273 <Method void stop()>
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
	private OnEveryFrameListener onEveryFrameListener;
	private DelayTarget pendingTarget;
	private RequestBuilder requestBuilder;
	final RequestManager requestManager;
	private boolean startFromFirstFrame;
	private Transformation transformation;
}

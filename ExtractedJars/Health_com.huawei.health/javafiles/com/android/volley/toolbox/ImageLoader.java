// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.android.volley.toolbox;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.widget.ImageView;
import com.android.volley.*;
import java.util.*;

// Referenced classes of package com.android.volley.toolbox:
//			ImageRequest

public class ImageLoader
{
	class BatchedImageRequest
	{

		public void addContainer(ImageContainer imagecontainer)
		{
			mContainers.add(((Object) (imagecontainer)));
		//    0    0:aload_0         
		//    1    1:getfield        #31  <Field LinkedList mContainers>
		//    2    4:aload_1         
		//    3    5:invokevirtual   #37  <Method boolean LinkedList.add(Object)>
		//    4    8:pop             
		//    5    9:return          
		}

		public VolleyError getError()
		{
			return mError;
		//    0    0:aload_0         
		//    1    1:getfield        #54  <Field VolleyError mError>
		//    2    4:areturn         
		}

		public boolean removeContainerAndCancelIfNecessary(ImageContainer imagecontainer)
		{
			mContainers.remove(((Object) (imagecontainer)));
		//    0    0:aload_0         
		//    1    1:getfield        #31  <Field LinkedList mContainers>
		//    2    4:aload_1         
		//    3    5:invokevirtual   #59  <Method boolean LinkedList.remove(Object)>
		//    4    8:pop             
			if(mContainers.size() == 0)
		//*   5    9:aload_0         
		//*   6   10:getfield        #31  <Field LinkedList mContainers>
		//*   7   13:invokevirtual   #63  <Method int LinkedList.size()>
		//*   8   16:ifne            28
			{
				mRequest.cancel();
		//    9   19:aload_0         
		//   10   20:getfield        #33  <Field Request mRequest>
		//   11   23:invokevirtual   #68  <Method void Request.cancel()>
				return true;
		//   12   26:iconst_1        
		//   13   27:ireturn         
			} else
			{
				return false;
		//   14   28:iconst_0        
		//   15   29:ireturn         
			}
		}

		public void setError(VolleyError volleyerror)
		{
			mError = volleyerror;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #54  <Field VolleyError mError>
		//    3    5:return          
		}

		private final LinkedList mContainers = new LinkedList();
		private VolleyError mError;
		private final Request mRequest;
		private Bitmap mResponseBitmap;
		final ImageLoader this$0;


/*
		static Bitmap access$000(BatchedImageRequest batchedimagerequest)
		{
			return batchedimagerequest.mResponseBitmap;
		//    0    0:aload_0         
		//    1    1:getfield        #44  <Field Bitmap mResponseBitmap>
		//    2    4:areturn         
		}

*/


/*
		static Bitmap access$002(BatchedImageRequest batchedimagerequest, Bitmap bitmap)
		{
			batchedimagerequest.mResponseBitmap = bitmap;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #44  <Field Bitmap mResponseBitmap>
			return bitmap;
		//    3    5:aload_1         
		//    4    6:areturn         
		}

*/


/*
		static LinkedList access$300(BatchedImageRequest batchedimagerequest)
		{
			return batchedimagerequest.mContainers;
		//    0    0:aload_0         
		//    1    1:getfield        #31  <Field LinkedList mContainers>
		//    2    4:areturn         
		}

*/

		public BatchedImageRequest(Request request, ImageContainer imagecontainer)
		{
			this$0 = ImageLoader.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #23  <Field ImageLoader this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #26  <Method void Object()>
		//    5    9:aload_0         
		//    6   10:new             #28  <Class LinkedList>
		//    7   13:dup             
		//    8   14:invokespecial   #29  <Method void LinkedList()>
		//    9   17:putfield        #31  <Field LinkedList mContainers>
			mRequest = request;
		//   10   20:aload_0         
		//   11   21:aload_2         
		//   12   22:putfield        #33  <Field Request mRequest>
			mContainers.add(((Object) (imagecontainer)));
		//   13   25:aload_0         
		//   14   26:getfield        #31  <Field LinkedList mContainers>
		//   15   29:aload_3         
		//   16   30:invokevirtual   #37  <Method boolean LinkedList.add(Object)>
		//   17   33:pop             
		//   18   34:return          
		}
	}

	public static interface ImageCache
	{

		public abstract Bitmap getBitmap(String s);

		public abstract void putBitmap(String s, Bitmap bitmap);
	}

	public class ImageContainer
	{

		public void cancelRequest()
		{
			if(mListener == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #31  <Field ImageLoader$ImageListener mListener>
		//*   2    4:ifnonnull       8
				return;
		//    3    7:return          
			BatchedImageRequest batchedimagerequest = (BatchedImageRequest)mInFlightRequests.get(((Object) (mCacheKey)));
		//    4    8:aload_0         
		//    5    9:getfield        #20  <Field ImageLoader this$0>
		//    6   12:invokestatic    #41  <Method HashMap ImageLoader.access$100(ImageLoader)>
		//    7   15:aload_0         
		//    8   16:getfield        #29  <Field String mCacheKey>
		//    9   19:invokevirtual   #47  <Method Object HashMap.get(Object)>
		//   10   22:checkcast       #49  <Class ImageLoader$BatchedImageRequest>
		//   11   25:astore_1        
			if(batchedimagerequest != null)
		//*  12   26:aload_1         
		//*  13   27:ifnull          54
			{
				if(batchedimagerequest.removeContainerAndCancelIfNecessary(this))
		//*  14   30:aload_1         
		//*  15   31:aload_0         
		//*  16   32:invokevirtual   #53  <Method boolean ImageLoader$BatchedImageRequest.removeContainerAndCancelIfNecessary(ImageLoader$ImageContainer)>
		//*  17   35:ifeq            53
					mInFlightRequests.remove(((Object) (mCacheKey)));
		//   18   38:aload_0         
		//   19   39:getfield        #20  <Field ImageLoader this$0>
		//   20   42:invokestatic    #41  <Method HashMap ImageLoader.access$100(ImageLoader)>
		//   21   45:aload_0         
		//   22   46:getfield        #29  <Field String mCacheKey>
		//   23   49:invokevirtual   #56  <Method Object HashMap.remove(Object)>
		//   24   52:pop             
				return;
		//   25   53:return          
			}
			batchedimagerequest = (BatchedImageRequest)mBatchedResponses.get(((Object) (mCacheKey)));
		//   26   54:aload_0         
		//   27   55:getfield        #20  <Field ImageLoader this$0>
		//   28   58:invokestatic    #59  <Method HashMap ImageLoader.access$200(ImageLoader)>
		//   29   61:aload_0         
		//   30   62:getfield        #29  <Field String mCacheKey>
		//   31   65:invokevirtual   #47  <Method Object HashMap.get(Object)>
		//   32   68:checkcast       #49  <Class ImageLoader$BatchedImageRequest>
		//   33   71:astore_1        
			if(batchedimagerequest != null)
		//*  34   72:aload_1         
		//*  35   73:ifnull          107
			{
				batchedimagerequest.removeContainerAndCancelIfNecessary(this);
		//   36   76:aload_1         
		//   37   77:aload_0         
		//   38   78:invokevirtual   #53  <Method boolean ImageLoader$BatchedImageRequest.removeContainerAndCancelIfNecessary(ImageLoader$ImageContainer)>
		//   39   81:pop             
				if(batchedimagerequest.mContainers.size() == 0)
		//*  40   82:aload_1         
		//*  41   83:invokestatic    #63  <Method LinkedList ImageLoader$BatchedImageRequest.access$300(ImageLoader$BatchedImageRequest)>
		//*  42   86:invokevirtual   #69  <Method int LinkedList.size()>
		//*  43   89:ifne            107
					mBatchedResponses.remove(((Object) (mCacheKey)));
		//   44   92:aload_0         
		//   45   93:getfield        #20  <Field ImageLoader this$0>
		//   46   96:invokestatic    #59  <Method HashMap ImageLoader.access$200(ImageLoader)>
		//   47   99:aload_0         
		//   48  100:getfield        #29  <Field String mCacheKey>
		//   49  103:invokevirtual   #56  <Method Object HashMap.remove(Object)>
		//   50  106:pop             
			}
		//   51  107:return          
		}

		public Bitmap getBitmap()
		{
			return mBitmap;
		//    0    0:aload_0         
		//    1    1:getfield        #25  <Field Bitmap mBitmap>
		//    2    4:areturn         
		}

		public String getRequestUrl()
		{
			return mRequestUrl;
		//    0    0:aload_0         
		//    1    1:getfield        #27  <Field String mRequestUrl>
		//    2    4:areturn         
		}

		private Bitmap mBitmap;
		private final String mCacheKey;
		private final ImageListener mListener;
		private final String mRequestUrl;
		final ImageLoader this$0;


/*
		static ImageListener access$400(ImageContainer imagecontainer)
		{
			return imagecontainer.mListener;
		//    0    0:aload_0         
		//    1    1:getfield        #31  <Field ImageLoader$ImageListener mListener>
		//    2    4:areturn         
		}

*/


/*
		static Bitmap access$502(ImageContainer imagecontainer, Bitmap bitmap)
		{
			imagecontainer.mBitmap = bitmap;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #25  <Field Bitmap mBitmap>
			return bitmap;
		//    3    5:aload_1         
		//    4    6:areturn         
		}

*/

		public ImageContainer(Bitmap bitmap, String s, String s1, ImageListener imagelistener)
		{
			this$0 = ImageLoader.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #20  <Field ImageLoader this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #23  <Method void Object()>
			mBitmap = bitmap;
		//    5    9:aload_0         
		//    6   10:aload_2         
		//    7   11:putfield        #25  <Field Bitmap mBitmap>
			mRequestUrl = s;
		//    8   14:aload_0         
		//    9   15:aload_3         
		//   10   16:putfield        #27  <Field String mRequestUrl>
			mCacheKey = s1;
		//   11   19:aload_0         
		//   12   20:aload           4
		//   13   22:putfield        #29  <Field String mCacheKey>
			mListener = imagelistener;
		//   14   25:aload_0         
		//   15   26:aload           5
		//   16   28:putfield        #31  <Field ImageLoader$ImageListener mListener>
		//   17   31:return          
		}
	}

	public static interface ImageListener
		extends com.android.volley.Response.ErrorListener
	{

		public abstract void onResponse(ImageContainer imagecontainer, boolean flag);
	}


	public ImageLoader(RequestQueue requestqueue, ImageCache imagecache)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #43  <Method void Object()>
		mBatchResponseDelayMs = 100;
	//    2    4:aload_0         
	//    3    5:bipush          100
	//    4    7:putfield        #45  <Field int mBatchResponseDelayMs>
	//    5   10:aload_0         
	//    6   11:new             #47  <Class HashMap>
	//    7   14:dup             
	//    8   15:invokespecial   #48  <Method void HashMap()>
	//    9   18:putfield        #50  <Field HashMap mInFlightRequests>
	//   10   21:aload_0         
	//   11   22:new             #47  <Class HashMap>
	//   12   25:dup             
	//   13   26:invokespecial   #48  <Method void HashMap()>
	//   14   29:putfield        #52  <Field HashMap mBatchedResponses>
	//   15   32:aload_0         
	//   16   33:new             #54  <Class Handler>
	//   17   36:dup             
	//   18   37:invokestatic    #60  <Method Looper Looper.getMainLooper()>
	//   19   40:invokespecial   #63  <Method void Handler(Looper)>
	//   20   43:putfield        #65  <Field Handler mHandler>
		mRequestQueue = requestqueue;
	//   21   46:aload_0         
	//   22   47:aload_1         
	//   23   48:putfield        #67  <Field RequestQueue mRequestQueue>
		mCache = imagecache;
	//   24   51:aload_0         
	//   25   52:aload_2         
	//   26   53:putfield        #69  <Field ImageLoader$ImageCache mCache>
	//   27   56:return          
	}

	private void batchResponse(String s, BatchedImageRequest batchedimagerequest)
	{
		mBatchedResponses.put(((Object) (s)), ((Object) (batchedimagerequest)));
	//    0    0:aload_0         
	//    1    1:getfield        #52  <Field HashMap mBatchedResponses>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #83  <Method Object HashMap.put(Object, Object)>
	//    5    9:pop             
		if(mRunnable == null)
	//*   6   10:aload_0         
	//*   7   11:getfield        #77  <Field Runnable mRunnable>
	//*   8   14:ifnonnull       46
		{
			mRunnable = new Runnable() {

				public void run()
				{
					for(Iterator iterator = mBatchedResponses.values().iterator(); iterator.hasNext();)
				//*   0    0:aload_0         
				//*   1    1:getfield        #17  <Field ImageLoader this$0>
				//*   2    4:invokestatic    #26  <Method HashMap ImageLoader.access$200(ImageLoader)>
				//*   3    7:invokevirtual   #32  <Method Collection HashMap.values()>
				//*   4   10:invokeinterface #38  <Method Iterator Collection.iterator()>
				//*   5   15:astore_1        
				//*   6   16:aload_1         
				//*   7   17:invokeinterface #44  <Method boolean Iterator.hasNext()>
				//*   8   22:ifeq            127
					{
						BatchedImageRequest batchedimagerequest1 = (BatchedImageRequest)iterator.next();
				//    9   25:aload_1         
				//   10   26:invokeinterface #48  <Method Object Iterator.next()>
				//   11   31:checkcast       #50  <Class ImageLoader$BatchedImageRequest>
				//   12   34:astore_2        
						Iterator iterator1 = batchedimagerequest1.mContainers.iterator();
				//   13   35:aload_2         
				//   14   36:invokestatic    #54  <Method LinkedList ImageLoader$BatchedImageRequest.access$300(ImageLoader$BatchedImageRequest)>
				//   15   39:invokevirtual   #57  <Method Iterator LinkedList.iterator()>
				//   16   42:astore_3        
						while(iterator1.hasNext()) 
				//*  17   43:aload_3         
				//*  18   44:invokeinterface #44  <Method boolean Iterator.hasNext()>
				//*  19   49:ifeq            124
						{
							ImageContainer imagecontainer = (ImageContainer)iterator1.next();
				//   20   52:aload_3         
				//   21   53:invokeinterface #48  <Method Object Iterator.next()>
				//   22   58:checkcast       #59  <Class ImageLoader$ImageContainer>
				//   23   61:astore          4
							if(imagecontainer.mListener != null)
				//*  24   63:aload           4
				//*  25   65:invokestatic    #63  <Method ImageLoader$ImageListener ImageLoader$ImageContainer.access$400(ImageLoader$ImageContainer)>
				//*  26   68:ifnonnull       74
				//*  27   71:goto            43
								if(batchedimagerequest1.getError() == null)
				//*  28   74:aload_2         
				//*  29   75:invokevirtual   #67  <Method VolleyError ImageLoader$BatchedImageRequest.getError()>
				//*  30   78:ifnonnull       107
								{
									imagecontainer.mBitmap = batchedimagerequest1.mResponseBitmap;
				//   31   81:aload           4
				//   32   83:aload_2         
				//   33   84:invokestatic    #71  <Method Bitmap ImageLoader$BatchedImageRequest.access$000(ImageLoader$BatchedImageRequest)>
				//   34   87:invokestatic    #75  <Method Bitmap ImageLoader$ImageContainer.access$502(ImageLoader$ImageContainer, Bitmap)>
				//   35   90:pop             
									imagecontainer.mListener.onResponse(imagecontainer, false);
				//   36   91:aload           4
				//   37   93:invokestatic    #63  <Method ImageLoader$ImageListener ImageLoader$ImageContainer.access$400(ImageLoader$ImageContainer)>
				//   38   96:aload           4
				//   39   98:iconst_0        
				//   40   99:invokeinterface #81  <Method void ImageLoader$ImageListener.onResponse(ImageLoader$ImageContainer, boolean)>
								} else
				//*  41  104:goto            121
								{
									imagecontainer.mListener.onErrorResponse(batchedimagerequest1.getError());
				//   42  107:aload           4
				//   43  109:invokestatic    #63  <Method ImageLoader$ImageListener ImageLoader$ImageContainer.access$400(ImageLoader$ImageContainer)>
				//   44  112:aload_2         
				//   45  113:invokevirtual   #67  <Method VolleyError ImageLoader$BatchedImageRequest.getError()>
				//   46  116:invokeinterface #85  <Method void ImageLoader$ImageListener.onErrorResponse(VolleyError)>
								}
						}
					}

				//*  47  121:goto            43
				//*  48  124:goto            16
					mBatchedResponses.clear();
				//   49  127:aload_0         
				//   50  128:getfield        #17  <Field ImageLoader this$0>
				//   51  131:invokestatic    #26  <Method HashMap ImageLoader.access$200(ImageLoader)>
				//   52  134:invokevirtual   #88  <Method void HashMap.clear()>
					mRunnable = null;
				//   53  137:aload_0         
				//   54  138:getfield        #17  <Field ImageLoader this$0>
				//   55  141:aconst_null     
				//   56  142:invokestatic    #92  <Method Runnable ImageLoader.access$602(ImageLoader, Runnable)>
				//   57  145:pop             
				//   58  146:return          
				}

				final ImageLoader this$0;

			
			{
				this$0 = ImageLoader.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field ImageLoader this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #20  <Method void Object()>
			//    5    9:return          
			}
			}
;
	//    9   17:aload_0         
	//   10   18:new             #12  <Class ImageLoader$4>
	//   11   21:dup             
	//   12   22:aload_0         
	//   13   23:invokespecial   #86  <Method void ImageLoader$4(ImageLoader)>
	//   14   26:putfield        #77  <Field Runnable mRunnable>
			mHandler.postDelayed(mRunnable, mBatchResponseDelayMs);
	//   15   29:aload_0         
	//   16   30:getfield        #65  <Field Handler mHandler>
	//   17   33:aload_0         
	//   18   34:getfield        #77  <Field Runnable mRunnable>
	//   19   37:aload_0         
	//   20   38:getfield        #45  <Field int mBatchResponseDelayMs>
	//   21   41:i2l             
	//   22   42:invokevirtual   #90  <Method boolean Handler.postDelayed(Runnable, long)>
	//   23   45:pop             
		}
	//   24   46:return          
	}

	private static String getCacheKey(String s, int i, int j, android.widget.ImageView.ScaleType scaletype)
	{
		return (new StringBuilder(s.length() + 12)).append("#W").append(i).append("#H").append(j).append("#S").append(scaletype.ordinal()).append(s).toString();
	//    0    0:new             #94  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokevirtual   #100 <Method int String.length()>
	//    4    8:bipush          12
	//    5   10:iadd            
	//    6   11:invokespecial   #103 <Method void StringBuilder(int)>
	//    7   14:ldc1            #105 <String "#W">
	//    8   16:invokevirtual   #109 <Method StringBuilder StringBuilder.append(String)>
	//    9   19:iload_1         
	//   10   20:invokevirtual   #112 <Method StringBuilder StringBuilder.append(int)>
	//   11   23:ldc1            #114 <String "#H">
	//   12   25:invokevirtual   #109 <Method StringBuilder StringBuilder.append(String)>
	//   13   28:iload_2         
	//   14   29:invokevirtual   #112 <Method StringBuilder StringBuilder.append(int)>
	//   15   32:ldc1            #116 <String "#S">
	//   16   34:invokevirtual   #109 <Method StringBuilder StringBuilder.append(String)>
	//   17   37:aload_3         
	//   18   38:invokevirtual   #121 <Method int android.widget.ImageView$ScaleType.ordinal()>
	//   19   41:invokevirtual   #112 <Method StringBuilder StringBuilder.append(int)>
	//   20   44:aload_0         
	//   21   45:invokevirtual   #109 <Method StringBuilder StringBuilder.append(String)>
	//   22   48:invokevirtual   #125 <Method String StringBuilder.toString()>
	//   23   51:areturn         
	}

	public static ImageListener getImageListener(ImageView imageview, int i, int j)
	{
		return new ImageListener(j, imageview, i) {

			public void onErrorResponse(VolleyError volleyerror)
			{
				if(errorImageResId != 0)
			//*   0    0:aload_0         
			//*   1    1:getfield        #20  <Field int val$errorImageResId>
			//*   2    4:ifeq            18
					view.setImageResource(errorImageResId);
			//    3    7:aload_0         
			//    4    8:getfield        #22  <Field ImageView val$view>
			//    5   11:aload_0         
			//    6   12:getfield        #20  <Field int val$errorImageResId>
			//    7   15:invokevirtual   #36  <Method void ImageView.setImageResource(int)>
			//    8   18:return          
			}

			public void onResponse(ImageContainer imagecontainer, boolean flag)
			{
				if(imagecontainer.getBitmap() != null)
			//*   0    0:aload_1         
			//*   1    1:invokevirtual   #44  <Method Bitmap ImageLoader$ImageContainer.getBitmap()>
			//*   2    4:ifnull          19
				{
					view.setImageBitmap(imagecontainer.getBitmap());
			//    3    7:aload_0         
			//    4    8:getfield        #22  <Field ImageView val$view>
			//    5   11:aload_1         
			//    6   12:invokevirtual   #44  <Method Bitmap ImageLoader$ImageContainer.getBitmap()>
			//    7   15:invokevirtual   #48  <Method void ImageView.setImageBitmap(Bitmap)>
					return;
			//    8   18:return          
				}
				if(defaultImageResId != 0)
			//*   9   19:aload_0         
			//*  10   20:getfield        #24  <Field int val$defaultImageResId>
			//*  11   23:ifeq            37
					view.setImageResource(defaultImageResId);
			//   12   26:aload_0         
			//   13   27:getfield        #22  <Field ImageView val$view>
			//   14   30:aload_0         
			//   15   31:getfield        #24  <Field int val$defaultImageResId>
			//   16   34:invokevirtual   #36  <Method void ImageView.setImageResource(int)>
			//   17   37:return          
			}

			final int val$defaultImageResId;
			final int val$errorImageResId;
			final ImageView val$view;

			
			{
				errorImageResId = i;
			//    0    0:aload_0         
			//    1    1:iload_1         
			//    2    2:putfield        #20  <Field int val$errorImageResId>
				view = imageview;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #22  <Field ImageView val$view>
				defaultImageResId = j;
			//    6   10:aload_0         
			//    7   11:iload_3         
			//    8   12:putfield        #24  <Field int val$defaultImageResId>
				super();
			//    9   15:aload_0         
			//   10   16:invokespecial   #27  <Method void Object()>
			//   11   19:return          
			}
		}
;
	//    0    0:new             #6   <Class ImageLoader$1>
	//    1    3:dup             
	//    2    4:iload_2         
	//    3    5:aload_0         
	//    4    6:iload_1         
	//    5    7:invokespecial   #130 <Method void ImageLoader$1(int, ImageView, int)>
	//    6   10:areturn         
	}

	private void throwIfNotOnMainThread()
	{
		if(Looper.myLooper() != Looper.getMainLooper())
	//*   0    0:invokestatic    #134 <Method Looper Looper.myLooper()>
	//*   1    3:invokestatic    #60  <Method Looper Looper.getMainLooper()>
	//*   2    6:if_acmpeq       19
			throw new IllegalStateException("ImageLoader must be invoked from the main thread.");
	//    3    9:new             #136 <Class IllegalStateException>
	//    4   12:dup             
	//    5   13:ldc1            #138 <String "ImageLoader must be invoked from the main thread.">
	//    6   15:invokespecial   #141 <Method void IllegalStateException(String)>
	//    7   18:athrow          
		else
			return;
	//    8   19:return          
	}

	public ImageContainer get(String s, ImageListener imagelistener)
	{
		return get(s, imagelistener, 0, 0);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iconst_0        
	//    4    4:iconst_0        
	//    5    5:invokevirtual   #146 <Method ImageLoader$ImageContainer get(String, ImageLoader$ImageListener, int, int)>
	//    6    8:areturn         
	}

	public ImageContainer get(String s, ImageListener imagelistener, int i, int j)
	{
		return get(s, imagelistener, i, j, android.widget.ImageView.ScaleType.CENTER_INSIDE);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:iload           4
	//    5    6:getstatic       #150 <Field android.widget.ImageView$ScaleType android.widget.ImageView$ScaleType.CENTER_INSIDE>
	//    6    9:invokevirtual   #153 <Method ImageLoader$ImageContainer get(String, ImageLoader$ImageListener, int, int, android.widget.ImageView$ScaleType)>
	//    7   12:areturn         
	}

	public ImageContainer get(String s, ImageListener imagelistener, int i, int j, android.widget.ImageView.ScaleType scaletype)
	{
		throwIfNotOnMainThread();
	//    0    0:aload_0         
	//    1    1:invokespecial   #155 <Method void throwIfNotOnMainThread()>
		String s1 = getCacheKey(s, i, j, scaletype);
	//    2    4:aload_1         
	//    3    5:iload_3         
	//    4    6:iload           4
	//    5    8:aload           5
	//    6   10:invokestatic    #157 <Method String getCacheKey(String, int, int, android.widget.ImageView$ScaleType)>
	//    7   13:astore          6
		Object obj = ((Object) (mCache.getBitmap(s1)));
	//    8   15:aload_0         
	//    9   16:getfield        #69  <Field ImageLoader$ImageCache mCache>
	//   10   19:aload           6
	//   11   21:invokeinterface #161 <Method Bitmap ImageLoader$ImageCache.getBitmap(String)>
	//   12   26:astore          7
		if(obj != null)
	//*  13   28:aload           7
	//*  14   30:ifnull          57
		{
			s = ((String) (new ImageContainer(((Bitmap) (obj)), s, ((String) (null)), ((ImageListener) (null)))));
	//   15   33:new             #20  <Class ImageLoader$ImageContainer>
	//   16   36:dup             
	//   17   37:aload_0         
	//   18   38:aload           7
	//   19   40:aload_1         
	//   20   41:aconst_null     
	//   21   42:aconst_null     
	//   22   43:invokespecial   #164 <Method void ImageLoader$ImageContainer(ImageLoader, Bitmap, String, String, ImageLoader$ImageListener)>
	//   23   46:astore_1        
			imagelistener.onResponse(((ImageContainer) (s)), true);
	//   24   47:aload_2         
	//   25   48:aload_1         
	//   26   49:iconst_1        
	//   27   50:invokeinterface #168 <Method void ImageLoader$ImageListener.onResponse(ImageLoader$ImageContainer, boolean)>
			return ((ImageContainer) (s));
	//   28   55:aload_1         
	//   29   56:areturn         
		}
		obj = ((Object) (new ImageContainer(((Bitmap) (null)), s, s1, imagelistener)));
	//   30   57:new             #20  <Class ImageLoader$ImageContainer>
	//   31   60:dup             
	//   32   61:aload_0         
	//   33   62:aconst_null     
	//   34   63:aload_1         
	//   35   64:aload           6
	//   36   66:aload_2         
	//   37   67:invokespecial   #164 <Method void ImageLoader$ImageContainer(ImageLoader, Bitmap, String, String, ImageLoader$ImageListener)>
	//   38   70:astore          7
		imagelistener.onResponse(((ImageContainer) (obj)), true);
	//   39   72:aload_2         
	//   40   73:aload           7
	//   41   75:iconst_1        
	//   42   76:invokeinterface #168 <Method void ImageLoader$ImageListener.onResponse(ImageLoader$ImageContainer, boolean)>
		imagelistener = ((ImageListener) ((BatchedImageRequest)mInFlightRequests.get(((Object) (s1)))));
	//   43   81:aload_0         
	//   44   82:getfield        #50  <Field HashMap mInFlightRequests>
	//   45   85:aload           6
	//   46   87:invokevirtual   #171 <Method Object HashMap.get(Object)>
	//   47   90:checkcast       #14  <Class ImageLoader$BatchedImageRequest>
	//   48   93:astore_2        
		if(imagelistener != null)
	//*  49   94:aload_2         
	//*  50   95:ifnull          107
		{
			((BatchedImageRequest) (imagelistener)).addContainer(((ImageContainer) (obj)));
	//   51   98:aload_2         
	//   52   99:aload           7
	//   53  101:invokevirtual   #175 <Method void ImageLoader$BatchedImageRequest.addContainer(ImageLoader$ImageContainer)>
			return ((ImageContainer) (obj));
	//   54  104:aload           7
	//   55  106:areturn         
		} else
		{
			s = ((String) (makeImageRequest(s, i, j, scaletype, s1)));
	//   56  107:aload_0         
	//   57  108:aload_1         
	//   58  109:iload_3         
	//   59  110:iload           4
	//   60  112:aload           5
	//   61  114:aload           6
	//   62  116:invokevirtual   #179 <Method Request makeImageRequest(String, int, int, android.widget.ImageView$ScaleType, String)>
	//   63  119:astore_1        
			mRequestQueue.add(((Request) (s)));
	//   64  120:aload_0         
	//   65  121:getfield        #67  <Field RequestQueue mRequestQueue>
	//   66  124:aload_1         
	//   67  125:invokevirtual   #185 <Method Request RequestQueue.add(Request)>
	//   68  128:pop             
			mInFlightRequests.put(((Object) (s1)), ((Object) (new BatchedImageRequest(((Request) (s)), ((ImageContainer) (obj))))));
	//   69  129:aload_0         
	//   70  130:getfield        #50  <Field HashMap mInFlightRequests>
	//   71  133:aload           6
	//   72  135:new             #14  <Class ImageLoader$BatchedImageRequest>
	//   73  138:dup             
	//   74  139:aload_0         
	//   75  140:aload_1         
	//   76  141:aload           7
	//   77  143:invokespecial   #188 <Method void ImageLoader$BatchedImageRequest(ImageLoader, Request, ImageLoader$ImageContainer)>
	//   78  146:invokevirtual   #83  <Method Object HashMap.put(Object, Object)>
	//   79  149:pop             
			return ((ImageContainer) (obj));
	//   80  150:aload           7
	//   81  152:areturn         
		}
	}

	public boolean isCached(String s, int i, int j)
	{
		return isCached(s, i, j, android.widget.ImageView.ScaleType.CENTER_INSIDE);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:iload_3         
	//    4    4:getstatic       #150 <Field android.widget.ImageView$ScaleType android.widget.ImageView$ScaleType.CENTER_INSIDE>
	//    5    7:invokevirtual   #193 <Method boolean isCached(String, int, int, android.widget.ImageView$ScaleType)>
	//    6   10:ireturn         
	}

	public boolean isCached(String s, int i, int j, android.widget.ImageView.ScaleType scaletype)
	{
		throwIfNotOnMainThread();
	//    0    0:aload_0         
	//    1    1:invokespecial   #155 <Method void throwIfNotOnMainThread()>
		s = getCacheKey(s, i, j, scaletype);
	//    2    4:aload_1         
	//    3    5:iload_2         
	//    4    6:iload_3         
	//    5    7:aload           4
	//    6    9:invokestatic    #157 <Method String getCacheKey(String, int, int, android.widget.ImageView$ScaleType)>
	//    7   12:astore_1        
		return mCache.getBitmap(s) != null;
	//    8   13:aload_0         
	//    9   14:getfield        #69  <Field ImageLoader$ImageCache mCache>
	//   10   17:aload_1         
	//   11   18:invokeinterface #161 <Method Bitmap ImageLoader$ImageCache.getBitmap(String)>
	//   12   23:ifnull          28
	//   13   26:iconst_1        
	//   14   27:ireturn         
	//   15   28:iconst_0        
	//   16   29:ireturn         
	}

	protected Request makeImageRequest(String s, int i, int j, android.widget.ImageView.ScaleType scaletype, final String cacheKey)
	{
		return ((Request) (new ImageRequest(s, new com.android.volley.Response.Listener() {

			public void onResponse(Bitmap bitmap)
			{
				onGetImageSuccess(cacheKey, bitmap);
			//    0    0:aload_0         
			//    1    1:getfield        #20  <Field ImageLoader this$0>
			//    2    4:aload_0         
			//    3    5:getfield        #22  <Field String val$cacheKey>
			//    4    8:aload_1         
			//    5    9:invokevirtual   #32  <Method void ImageLoader.onGetImageSuccess(String, Bitmap)>
			//    6   12:return          
			}

			public volatile void onResponse(Object obj)
			{
				onResponse((Bitmap)obj);
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:checkcast       #35  <Class Bitmap>
			//    3    5:invokevirtual   #37  <Method void onResponse(Bitmap)>
			//    4    8:return          
			}

			final ImageLoader this$0;
			final String val$cacheKey;

			
			{
				this$0 = ImageLoader.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #20  <Field ImageLoader this$0>
				cacheKey = s;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #22  <Field String val$cacheKey>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #25  <Method void Object()>
			//    8   14:return          
			}
		}
, i, j, scaletype, android.graphics.Bitmap.Config.RGB_565, new com.android.volley.Response.ErrorListener() {

			public void onErrorResponse(VolleyError volleyerror)
			{
				onGetImageError(cacheKey, volleyerror);
			//    0    0:aload_0         
			//    1    1:getfield        #19  <Field ImageLoader this$0>
			//    2    4:aload_0         
			//    3    5:getfield        #21  <Field String val$cacheKey>
			//    4    8:aload_1         
			//    5    9:invokevirtual   #31  <Method void ImageLoader.onGetImageError(String, VolleyError)>
			//    6   12:return          
			}

			final ImageLoader this$0;
			final String val$cacheKey;

			
			{
				this$0 = ImageLoader.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field ImageLoader this$0>
				cacheKey = s;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #21  <Field String val$cacheKey>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #24  <Method void Object()>
			//    8   14:return          
			}
		}
)));
	//    0    0:new             #195 <Class ImageRequest>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:new             #8   <Class ImageLoader$2>
	//    4    8:dup             
	//    5    9:aload_0         
	//    6   10:aload           5
	//    7   12:invokespecial   #198 <Method void ImageLoader$2(ImageLoader, String)>
	//    8   15:iload_2         
	//    9   16:iload_3         
	//   10   17:aload           4
	//   11   19:getstatic       #204 <Field android.graphics.Bitmap$Config android.graphics.Bitmap$Config.RGB_565>
	//   12   22:new             #10  <Class ImageLoader$3>
	//   13   25:dup             
	//   14   26:aload_0         
	//   15   27:aload           5
	//   16   29:invokespecial   #205 <Method void ImageLoader$3(ImageLoader, String)>
	//   17   32:invokespecial   #208 <Method void ImageRequest(String, com.android.volley.Response$Listener, int, int, android.widget.ImageView$ScaleType, android.graphics.Bitmap$Config, com.android.volley.Response$ErrorListener)>
	//   18   35:areturn         
	}

	protected void onGetImageError(String s, VolleyError volleyerror)
	{
		BatchedImageRequest batchedimagerequest = (BatchedImageRequest)mInFlightRequests.remove(((Object) (s)));
	//    0    0:aload_0         
	//    1    1:getfield        #50  <Field HashMap mInFlightRequests>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #215 <Method Object HashMap.remove(Object)>
	//    4    8:checkcast       #14  <Class ImageLoader$BatchedImageRequest>
	//    5   11:astore_3        
		if(batchedimagerequest != null)
	//*   6   12:aload_3         
	//*   7   13:ifnull          27
		{
			batchedimagerequest.setError(volleyerror);
	//    8   16:aload_3         
	//    9   17:aload_2         
	//   10   18:invokevirtual   #219 <Method void ImageLoader$BatchedImageRequest.setError(VolleyError)>
			batchResponse(s, batchedimagerequest);
	//   11   21:aload_0         
	//   12   22:aload_1         
	//   13   23:aload_3         
	//   14   24:invokespecial   #221 <Method void batchResponse(String, ImageLoader$BatchedImageRequest)>
		}
	//   15   27:return          
	}

	protected void onGetImageSuccess(String s, Bitmap bitmap)
	{
		mCache.putBitmap(s, bitmap);
	//    0    0:aload_0         
	//    1    1:getfield        #69  <Field ImageLoader$ImageCache mCache>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokeinterface #226 <Method void ImageLoader$ImageCache.putBitmap(String, Bitmap)>
		BatchedImageRequest batchedimagerequest = (BatchedImageRequest)mInFlightRequests.remove(((Object) (s)));
	//    5   11:aload_0         
	//    6   12:getfield        #50  <Field HashMap mInFlightRequests>
	//    7   15:aload_1         
	//    8   16:invokevirtual   #215 <Method Object HashMap.remove(Object)>
	//    9   19:checkcast       #14  <Class ImageLoader$BatchedImageRequest>
	//   10   22:astore_3        
		if(batchedimagerequest != null)
	//*  11   23:aload_3         
	//*  12   24:ifnull          39
		{
			batchedimagerequest.mResponseBitmap = bitmap;
	//   13   27:aload_3         
	//   14   28:aload_2         
	//   15   29:invokestatic    #230 <Method Bitmap ImageLoader$BatchedImageRequest.access$002(ImageLoader$BatchedImageRequest, Bitmap)>
	//   16   32:pop             
			batchResponse(s, batchedimagerequest);
	//   17   33:aload_0         
	//   18   34:aload_1         
	//   19   35:aload_3         
	//   20   36:invokespecial   #221 <Method void batchResponse(String, ImageLoader$BatchedImageRequest)>
		}
	//   21   39:return          
	}

	public void setBatchedResponseDelay(int i)
	{
		mBatchResponseDelayMs = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #45  <Field int mBatchResponseDelayMs>
	//    3    5:return          
	}

	private int mBatchResponseDelayMs;
	private final HashMap mBatchedResponses = new HashMap();
	private final ImageCache mCache;
	private final Handler mHandler = new Handler(Looper.getMainLooper());
	private final HashMap mInFlightRequests = new HashMap();
	private final RequestQueue mRequestQueue;
	private Runnable mRunnable;


/*
	static HashMap access$100(ImageLoader imageloader)
	{
		return imageloader.mInFlightRequests;
	//    0    0:aload_0         
	//    1    1:getfield        #50  <Field HashMap mInFlightRequests>
	//    2    4:areturn         
	}

*/


/*
	static HashMap access$200(ImageLoader imageloader)
	{
		return imageloader.mBatchedResponses;
	//    0    0:aload_0         
	//    1    1:getfield        #52  <Field HashMap mBatchedResponses>
	//    2    4:areturn         
	}

*/


/*
	static Runnable access$602(ImageLoader imageloader, Runnable runnable)
	{
		imageloader.mRunnable = runnable;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #77  <Field Runnable mRunnable>
		return runnable;
	//    3    5:aload_1         
	//    4    6:areturn         
	}

*/
}

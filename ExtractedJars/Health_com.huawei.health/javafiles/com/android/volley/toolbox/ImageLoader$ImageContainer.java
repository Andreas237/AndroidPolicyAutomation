// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.android.volley.toolbox;

import android.graphics.Bitmap;
import java.util.HashMap;
import java.util.LinkedList;

// Referenced classes of package com.android.volley.toolbox:
//			ImageLoader

public class ImageLoader$ImageContainer
{

	public void cancelRequest()
	{
		if(mListener == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #31  <Field ImageLoader$ImageListener mListener>
	//*   2    4:ifnonnull       8
			return;
	//    3    7:return          
		uest uest = (uest)ImageLoader.access$100(ImageLoader.this).get(((Object) (mCacheKey)));
	//    4    8:aload_0         
	//    5    9:getfield        #20  <Field ImageLoader this$0>
	//    6   12:invokestatic    #41  <Method HashMap ImageLoader.access$100(ImageLoader)>
	//    7   15:aload_0         
	//    8   16:getfield        #29  <Field String mCacheKey>
	//    9   19:invokevirtual   #47  <Method Object HashMap.get(Object)>
	//   10   22:checkcast       #49  <Class ImageLoader$BatchedImageRequest>
	//   11   25:astore_1        
		if(uest != null)
	//*  12   26:aload_1         
	//*  13   27:ifnull          54
		{
			if(uest.removeContainerAndCancelIfNecessary(this))
	//*  14   30:aload_1         
	//*  15   31:aload_0         
	//*  16   32:invokevirtual   #53  <Method boolean ImageLoader$BatchedImageRequest.removeContainerAndCancelIfNecessary(ImageLoader$ImageContainer)>
	//*  17   35:ifeq            53
				ImageLoader.access$100(ImageLoader.this).remove(((Object) (mCacheKey)));
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
		uest = (uest)ImageLoader.access$200(ImageLoader.this).get(((Object) (mCacheKey)));
	//   26   54:aload_0         
	//   27   55:getfield        #20  <Field ImageLoader this$0>
	//   28   58:invokestatic    #59  <Method HashMap ImageLoader.access$200(ImageLoader)>
	//   29   61:aload_0         
	//   30   62:getfield        #29  <Field String mCacheKey>
	//   31   65:invokevirtual   #47  <Method Object HashMap.get(Object)>
	//   32   68:checkcast       #49  <Class ImageLoader$BatchedImageRequest>
	//   33   71:astore_1        
		if(uest != null)
	//*  34   72:aload_1         
	//*  35   73:ifnull          107
		{
			uest.removeContainerAndCancelIfNecessary(this);
	//   36   76:aload_1         
	//   37   77:aload_0         
	//   38   78:invokevirtual   #53  <Method boolean ImageLoader$BatchedImageRequest.removeContainerAndCancelIfNecessary(ImageLoader$ImageContainer)>
	//   39   81:pop             
			if(uest.access._mth300(uest).size() == 0)
	//*  40   82:aload_1         
	//*  41   83:invokestatic    #63  <Method LinkedList ImageLoader$BatchedImageRequest.access$300(ImageLoader$BatchedImageRequest)>
	//*  42   86:invokevirtual   #69  <Method int LinkedList.size()>
	//*  43   89:ifne            107
				ImageLoader.access$200(ImageLoader.this).remove(((Object) (mCacheKey)));
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
	private final ImageLoader.ImageListener mListener;
	private final String mRequestUrl;
	final ImageLoader this$0;


/*
	static ImageLoader.ImageListener access$400(ImageLoader$ImageContainer imageloader$imagecontainer)
	{
		return imageloader$imagecontainer.mListener;
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field ImageLoader$ImageListener mListener>
	//    2    4:areturn         
	}

*/


/*
	static Bitmap access$502(ImageLoader$ImageContainer imageloader$imagecontainer, Bitmap bitmap)
	{
		imageloader$imagecontainer.mBitmap = bitmap;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #25  <Field Bitmap mBitmap>
		return bitmap;
	//    3    5:aload_1         
	//    4    6:areturn         
	}

*/

	public ImageLoader$ImageContainer(Bitmap bitmap, String s, String s1, ImageLoader.ImageListener imagelistener)
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

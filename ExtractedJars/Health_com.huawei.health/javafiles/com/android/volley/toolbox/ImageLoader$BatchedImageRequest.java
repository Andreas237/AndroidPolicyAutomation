// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.android.volley.toolbox;

import android.graphics.Bitmap;
import com.android.volley.Request;
import com.android.volley.VolleyError;
import java.util.LinkedList;

// Referenced classes of package com.android.volley.toolbox:
//			ImageLoader

class ImageLoader$BatchedImageRequest
{

	public void addContainer(ImageLoader.ImageContainer imagecontainer)
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

	public boolean removeContainerAndCancelIfNecessary(ImageLoader.ImageContainer imagecontainer)
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
	static Bitmap access$000(ImageLoader$BatchedImageRequest imageloader$batchedimagerequest)
	{
		return imageloader$batchedimagerequest.mResponseBitmap;
	//    0    0:aload_0         
	//    1    1:getfield        #44  <Field Bitmap mResponseBitmap>
	//    2    4:areturn         
	}

*/


/*
	static Bitmap access$002(ImageLoader$BatchedImageRequest imageloader$batchedimagerequest, Bitmap bitmap)
	{
		imageloader$batchedimagerequest.mResponseBitmap = bitmap;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #44  <Field Bitmap mResponseBitmap>
		return bitmap;
	//    3    5:aload_1         
	//    4    6:areturn         
	}

*/


/*
	static LinkedList access$300(ImageLoader$BatchedImageRequest imageloader$batchedimagerequest)
	{
		return imageloader$batchedimagerequest.mContainers;
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field LinkedList mContainers>
	//    2    4:areturn         
	}

*/

	public ImageLoader$BatchedImageRequest(Request request, ImageLoader.ImageContainer imagecontainer)
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

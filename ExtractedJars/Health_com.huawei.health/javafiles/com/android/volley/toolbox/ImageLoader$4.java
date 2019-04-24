// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.android.volley.toolbox;

import java.util.*;

// Referenced classes of package com.android.volley.toolbox:
//			ImageLoader

class ImageLoader$4
	implements Runnable
{

	public void run()
	{
		for(Iterator iterator = ImageLoader.access$200(ImageLoader.this).values().iterator(); iterator.hasNext();)
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
			tchedImageRequest tchedimagerequest = (tchedImageRequest)iterator.next();
	//    9   25:aload_1         
	//   10   26:invokeinterface #48  <Method Object Iterator.next()>
	//   11   31:checkcast       #50  <Class ImageLoader$BatchedImageRequest>
	//   12   34:astore_2        
			Iterator iterator1 = tchedImageRequest.access._mth300(tchedimagerequest).iterator();
	//   13   35:aload_2         
	//   14   36:invokestatic    #54  <Method LinkedList ImageLoader$BatchedImageRequest.access$300(ImageLoader$BatchedImageRequest)>
	//   15   39:invokevirtual   #57  <Method Iterator LinkedList.iterator()>
	//   16   42:astore_3        
			while(iterator1.hasNext()) 
	//*  17   43:aload_3         
	//*  18   44:invokeinterface #44  <Method boolean Iterator.hasNext()>
	//*  19   49:ifeq            124
			{
				ageContainer agecontainer = (ageContainer)iterator1.next();
	//   20   52:aload_3         
	//   21   53:invokeinterface #48  <Method Object Iterator.next()>
	//   22   58:checkcast       #59  <Class ImageLoader$ImageContainer>
	//   23   61:astore          4
				if(ageContainer.access._mth400(agecontainer) != null)
	//*  24   63:aload           4
	//*  25   65:invokestatic    #63  <Method ImageLoader$ImageListener ImageLoader$ImageContainer.access$400(ImageLoader$ImageContainer)>
	//*  26   68:ifnonnull       74
	//*  27   71:goto            43
					if(tchedimagerequest.getError() == null)
	//*  28   74:aload_2         
	//*  29   75:invokevirtual   #67  <Method com.android.volley.VolleyError ImageLoader$BatchedImageRequest.getError()>
	//*  30   78:ifnonnull       107
					{
						ageContainer.access._mth502(agecontainer, tchedImageRequest.access._mth000(tchedimagerequest));
	//   31   81:aload           4
	//   32   83:aload_2         
	//   33   84:invokestatic    #71  <Method android.graphics.Bitmap ImageLoader$BatchedImageRequest.access$000(ImageLoader$BatchedImageRequest)>
	//   34   87:invokestatic    #75  <Method android.graphics.Bitmap ImageLoader$ImageContainer.access$502(ImageLoader$ImageContainer, android.graphics.Bitmap)>
	//   35   90:pop             
						ageContainer.access._mth400(agecontainer).onResponse(agecontainer, false);
	//   36   91:aload           4
	//   37   93:invokestatic    #63  <Method ImageLoader$ImageListener ImageLoader$ImageContainer.access$400(ImageLoader$ImageContainer)>
	//   38   96:aload           4
	//   39   98:iconst_0        
	//   40   99:invokeinterface #81  <Method void ImageLoader$ImageListener.onResponse(ImageLoader$ImageContainer, boolean)>
					} else
	//*  41  104:goto            121
					{
						ageContainer.access._mth400(agecontainer).onErrorResponse(tchedimagerequest.getError());
	//   42  107:aload           4
	//   43  109:invokestatic    #63  <Method ImageLoader$ImageListener ImageLoader$ImageContainer.access$400(ImageLoader$ImageContainer)>
	//   44  112:aload_2         
	//   45  113:invokevirtual   #67  <Method com.android.volley.VolleyError ImageLoader$BatchedImageRequest.getError()>
	//   46  116:invokeinterface #85  <Method void ImageLoader$ImageListener.onErrorResponse(com.android.volley.VolleyError)>
					}
			}
		}

	//*  47  121:goto            43
	//*  48  124:goto            16
		ImageLoader.access$200(ImageLoader.this).clear();
	//   49  127:aload_0         
	//   50  128:getfield        #17  <Field ImageLoader this$0>
	//   51  131:invokestatic    #26  <Method HashMap ImageLoader.access$200(ImageLoader)>
	//   52  134:invokevirtual   #88  <Method void HashMap.clear()>
		ImageLoader.access$602(ImageLoader.this, ((Runnable) (null)));
	//   53  137:aload_0         
	//   54  138:getfield        #17  <Field ImageLoader this$0>
	//   55  141:aconst_null     
	//   56  142:invokestatic    #92  <Method Runnable ImageLoader.access$602(ImageLoader, Runnable)>
	//   57  145:pop             
	//   58  146:return          
	}

	final ImageLoader this$0;

	ImageLoader$4()
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

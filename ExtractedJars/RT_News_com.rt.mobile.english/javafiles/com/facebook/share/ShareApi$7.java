// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.share;

import com.facebook.share.model.ShareOpenGraphObject;
import com.facebook.share.model.SharePhoto;
import java.util.ArrayList;

// Referenced classes of package com.facebook.share:
//			ShareApi

class ShareApi$7
	implements com.facebook.internal.apper.ValueMapper
{

	public void mapValue(Object obj, com.facebook.internal.apper.OnMapValueCompleteListener onmapvaluecompletelistener)
	{
		if(obj instanceof ArrayList)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #25  <Class ArrayList>
	//*   2    4:ifeq            20
		{
			ShareApi.access$200(ShareApi.this, (ArrayList)obj, onmapvaluecompletelistener);
	//    3    7:aload_0         
	//    4    8:getfield        #17  <Field ShareApi this$0>
	//    5   11:aload_1         
	//    6   12:checkcast       #25  <Class ArrayList>
	//    7   15:aload_2         
	//    8   16:invokestatic    #29  <Method void ShareApi.access$200(ShareApi, ArrayList, com.facebook.internal.CollectionMapper$OnMapValueCompleteListener)>
			return;
	//    9   19:return          
		}
		if(obj instanceof ShareOpenGraphObject)
	//*  10   20:aload_1         
	//*  11   21:instanceof      #31  <Class ShareOpenGraphObject>
	//*  12   24:ifeq            40
		{
			ShareApi.access$300(ShareApi.this, (ShareOpenGraphObject)obj, onmapvaluecompletelistener);
	//   13   27:aload_0         
	//   14   28:getfield        #17  <Field ShareApi this$0>
	//   15   31:aload_1         
	//   16   32:checkcast       #31  <Class ShareOpenGraphObject>
	//   17   35:aload_2         
	//   18   36:invokestatic    #35  <Method void ShareApi.access$300(ShareApi, ShareOpenGraphObject, com.facebook.internal.CollectionMapper$OnMapValueCompleteListener)>
			return;
	//   19   39:return          
		}
		if(obj instanceof SharePhoto)
	//*  20   40:aload_1         
	//*  21   41:instanceof      #37  <Class SharePhoto>
	//*  22   44:ifeq            60
		{
			ShareApi.access$400(ShareApi.this, (SharePhoto)obj, onmapvaluecompletelistener);
	//   23   47:aload_0         
	//   24   48:getfield        #17  <Field ShareApi this$0>
	//   25   51:aload_1         
	//   26   52:checkcast       #37  <Class SharePhoto>
	//   27   55:aload_2         
	//   28   56:invokestatic    #41  <Method void ShareApi.access$400(ShareApi, SharePhoto, com.facebook.internal.CollectionMapper$OnMapValueCompleteListener)>
			return;
	//   29   59:return          
		} else
		{
			onmapvaluecompletelistener.onComplete(obj);
	//   30   60:aload_2         
	//   31   61:aload_1         
	//   32   62:invokeinterface #47  <Method void com.facebook.internal.CollectionMapper$OnMapValueCompleteListener.onComplete(Object)>
			return;
	//   33   67:return          
		}
	}

	final ShareApi this$0;

	ShareApi$7()
	{
		this$0 = ShareApi.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field ShareApi this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #20  <Method void Object()>
	//    5    9:return          
	}
}

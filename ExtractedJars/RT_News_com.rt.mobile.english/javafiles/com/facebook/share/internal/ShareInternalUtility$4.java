// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.share.internal;

import com.facebook.share.model.SharePhoto;
import java.util.UUID;

// Referenced classes of package com.facebook.share.internal:
//			ShareInternalUtility

static final class ShareInternalUtility$4
	implements com.facebook.internal.Utility.Mapper
{

	public com.facebook.internal.Store.Attachment apply(SharePhoto sharephoto)
	{
		return ShareInternalUtility.access$000(val$appCallId, sharephoto);
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field UUID val$appCallId>
	//    2    4:aload_1         
	//    3    5:invokestatic    #28  <Method com.facebook.internal.NativeAppCallAttachmentStore$Attachment ShareInternalUtility.access$000(UUID, SharePhoto)>
	//    4    8:areturn         
	}

	public volatile Object apply(Object obj)
	{
		return ((Object) (apply((SharePhoto)obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #31  <Class SharePhoto>
	//    3    5:invokevirtual   #33  <Method com.facebook.internal.NativeAppCallAttachmentStore$Attachment apply(SharePhoto)>
	//    4    8:areturn         
	}

	final UUID val$appCallId;

	ShareInternalUtility$4(UUID uuid)
	{
		val$appCallId = uuid;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #18  <Field UUID val$appCallId>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #21  <Method void Object()>
	//    5    9:return          
	}
}

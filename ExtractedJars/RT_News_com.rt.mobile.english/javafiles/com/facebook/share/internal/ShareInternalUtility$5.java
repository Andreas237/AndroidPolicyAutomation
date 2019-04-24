// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.share.internal;


// Referenced classes of package com.facebook.share.internal:
//			ShareInternalUtility

static final class ShareInternalUtility$5
	implements com.facebook.internal.Utility.Mapper
{

	public volatile Object apply(Object obj)
	{
		return ((Object) (apply((com.facebook.internal.Store.Attachment)obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #21  <Class com.facebook.internal.NativeAppCallAttachmentStore$Attachment>
	//    3    5:invokevirtual   #24  <Method String apply(com.facebook.internal.NativeAppCallAttachmentStore$Attachment)>
	//    4    8:areturn         
	}

	public String apply(com.facebook.internal.Store.Attachment attachment)
	{
		return attachment.getAttachmentUrl();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #28  <Method String com.facebook.internal.NativeAppCallAttachmentStore$Attachment.getAttachmentUrl()>
	//    2    4:areturn         
	}

	ShareInternalUtility$5()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
	//    2    4:return          
	}
}

// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.share.internal;

import android.os.Bundle;
import com.facebook.internal.Utility;
import com.facebook.share.model.ShareMedia;
import java.util.List;
import java.util.UUID;

// Referenced classes of package com.facebook.share.internal:
//			ShareInternalUtility

static final class ShareInternalUtility$11
	implements com.facebook.internal.Utility.Mapper
{

	public Bundle apply(ShareMedia sharemedia)
	{
		com.facebook.internal.tore.Attachment attachment = ShareInternalUtility.access$000(val$appCallId, sharemedia);
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field UUID val$appCallId>
	//    2    4:aload_1         
	//    3    5:invokestatic    #32  <Method com.facebook.internal.NativeAppCallAttachmentStore$Attachment ShareInternalUtility.access$000(UUID, ShareMedia)>
	//    4    8:astore_3        
		val$attachments.add(((Object) (attachment)));
	//    5    9:aload_0         
	//    6   10:getfield        #22  <Field List val$attachments>
	//    7   13:aload_3         
	//    8   14:invokeinterface #38  <Method boolean List.add(Object)>
	//    9   19:pop             
		Bundle bundle = new Bundle();
	//   10   20:new             #40  <Class Bundle>
	//   11   23:dup             
	//   12   24:invokespecial   #41  <Method void Bundle()>
	//   13   27:astore_2        
		bundle.putString("type", sharemedia.getMediaType().name());
	//   14   28:aload_2         
	//   15   29:ldc1            #43  <String "type">
	//   16   31:aload_1         
	//   17   32:invokevirtual   #49  <Method com.facebook.share.model.ShareMedia$Type ShareMedia.getMediaType()>
	//   18   35:invokevirtual   #55  <Method String com.facebook.share.model.ShareMedia$Type.name()>
	//   19   38:invokevirtual   #59  <Method void Bundle.putString(String, String)>
		bundle.putString("uri", attachment.getAttachmentUrl());
	//   20   41:aload_2         
	//   21   42:ldc1            #61  <String "uri">
	//   22   44:aload_3         
	//   23   45:invokevirtual   #66  <Method String com.facebook.internal.NativeAppCallAttachmentStore$Attachment.getAttachmentUrl()>
	//   24   48:invokevirtual   #59  <Method void Bundle.putString(String, String)>
		sharemedia = ((ShareMedia) (ShareInternalUtility.getUriExtension(attachment.getOriginalUri())));
	//   25   51:aload_3         
	//   26   52:invokevirtual   #70  <Method android.net.Uri com.facebook.internal.NativeAppCallAttachmentStore$Attachment.getOriginalUri()>
	//   27   55:invokestatic    #74  <Method String ShareInternalUtility.getUriExtension(android.net.Uri)>
	//   28   58:astore_1        
		if(sharemedia != null)
	//*  29   59:aload_1         
	//*  30   60:ifnull          70
			Utility.putNonEmptyString(bundle, "extension", ((String) (sharemedia)));
	//   31   63:aload_2         
	//   32   64:ldc1            #76  <String "extension">
	//   33   66:aload_1         
	//   34   67:invokestatic    #82  <Method void Utility.putNonEmptyString(Bundle, String, String)>
		return bundle;
	//   35   70:aload_2         
	//   36   71:areturn         
	}

	public volatile Object apply(Object obj)
	{
		return ((Object) (apply((ShareMedia)obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #45  <Class ShareMedia>
	//    3    5:invokevirtual   #85  <Method Bundle apply(ShareMedia)>
	//    4    8:areturn         
	}

	final UUID val$appCallId;
	final List val$attachments;

	ShareInternalUtility$11(UUID uuid, List list)
	{
		val$appCallId = uuid;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #20  <Field UUID val$appCallId>
		val$attachments = list;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #22  <Field List val$attachments>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #25  <Method void Object()>
	//    8   14:return          
	}
}

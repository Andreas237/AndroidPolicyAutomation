// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.share.internal;

import android.os.Bundle;
import com.facebook.internal.Utility;

// Referenced classes of package com.facebook.share.internal:
//			ShareInternalUtility

static final class ShareInternalUtility$10
	implements com.facebook.internal.Utility.Mapper
{

	public Bundle apply(com.facebook.internal.tore.Attachment attachment)
	{
		Bundle bundle = new Bundle();
	//    0    0:new             #21  <Class Bundle>
	//    1    3:dup             
	//    2    4:invokespecial   #22  <Method void Bundle()>
	//    3    7:astore_2        
		bundle.putString("uri", attachment.getAttachmentUrl());
	//    4    8:aload_2         
	//    5    9:ldc1            #24  <String "uri">
	//    6   11:aload_1         
	//    7   12:invokevirtual   #30  <Method String com.facebook.internal.NativeAppCallAttachmentStore$Attachment.getAttachmentUrl()>
	//    8   15:invokevirtual   #34  <Method void Bundle.putString(String, String)>
		attachment = ((com.facebook.internal.tore.Attachment) (ShareInternalUtility.getUriExtension(attachment.getOriginalUri())));
	//    9   18:aload_1         
	//   10   19:invokevirtual   #38  <Method android.net.Uri com.facebook.internal.NativeAppCallAttachmentStore$Attachment.getOriginalUri()>
	//   11   22:invokestatic    #42  <Method String ShareInternalUtility.getUriExtension(android.net.Uri)>
	//   12   25:astore_1        
		if(attachment != null)
	//*  13   26:aload_1         
	//*  14   27:ifnull          37
			Utility.putNonEmptyString(bundle, "extension", ((String) (attachment)));
	//   15   30:aload_2         
	//   16   31:ldc1            #44  <String "extension">
	//   17   33:aload_1         
	//   18   34:invokestatic    #50  <Method void Utility.putNonEmptyString(Bundle, String, String)>
		return bundle;
	//   19   37:aload_2         
	//   20   38:areturn         
	}

	public volatile Object apply(Object obj)
	{
		return ((Object) (apply((com.facebook.internal.tore.Attachment)obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #26  <Class com.facebook.internal.NativeAppCallAttachmentStore$Attachment>
	//    3    5:invokevirtual   #53  <Method Bundle apply(com.facebook.internal.NativeAppCallAttachmentStore$Attachment)>
	//    4    8:areturn         
	}

	ShareInternalUtility$10()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
	//    2    4:return          
	}
}

// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.share.internal;

import com.facebook.FacebookException;
import com.facebook.share.model.SharePhoto;
import java.util.ArrayList;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.facebook.share.internal:
//			ShareInternalUtility

static final class ShareInternalUtility$6
	implements otoJSONProcessor
{

	public JSONObject toJSONObject(SharePhoto sharephoto)
	{
		com.facebook.internal.Store.Attachment attachment = ShareInternalUtility.access$000(val$callId, sharephoto);
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field UUID val$callId>
	//    2    4:aload_1         
	//    3    5:invokestatic    #33  <Method com.facebook.internal.NativeAppCallAttachmentStore$Attachment ShareInternalUtility.access$000(UUID, SharePhoto)>
	//    4    8:astore_2        
		if(attachment == null)
	//*   5    9:aload_2         
	//*   6   10:ifnonnull       15
			return null;
	//    7   13:aconst_null     
	//    8   14:areturn         
		val$attachments.add(((Object) (attachment)));
	//    9   15:aload_0         
	//   10   16:getfield        #21  <Field ArrayList val$attachments>
	//   11   19:aload_2         
	//   12   20:invokevirtual   #39  <Method boolean ArrayList.add(Object)>
	//   13   23:pop             
		JSONObject jsonobject = new JSONObject();
	//   14   24:new             #41  <Class JSONObject>
	//   15   27:dup             
	//   16   28:invokespecial   #42  <Method void JSONObject()>
	//   17   31:astore_3        
		try
		{
			jsonobject.put("url", ((Object) (attachment.getAttachmentUrl())));
	//   18   32:aload_3         
	//   19   33:ldc1            #44  <String "url">
	//   20   35:aload_2         
	//   21   36:invokevirtual   #50  <Method String com.facebook.internal.NativeAppCallAttachmentStore$Attachment.getAttachmentUrl()>
	//   22   39:invokevirtual   #54  <Method JSONObject JSONObject.put(String, Object)>
	//   23   42:pop             
			if(sharephoto.getUserGenerated())
	//*  24   43:aload_1         
	//*  25   44:invokevirtual   #60  <Method boolean SharePhoto.getUserGenerated()>
	//*  26   47:ifeq            58
				jsonobject.put("user_generated", true);
	//   27   50:aload_3         
	//   28   51:ldc1            #62  <String "user_generated">
	//   29   53:iconst_1        
	//   30   54:invokevirtual   #65  <Method JSONObject JSONObject.put(String, boolean)>
	//   31   57:pop             
		}
	//*  32   58:aload_3         
	//*  33   59:areturn         
		// Misplaced declaration of an exception variable
		catch(SharePhoto sharephoto)
	//*  34   60:astore_1        
		{
			throw new FacebookException("Unable to attach images", ((Throwable) (sharephoto)));
	//   35   61:new             #67  <Class FacebookException>
	//   36   64:dup             
	//   37   65:ldc1            #69  <String "Unable to attach images">
	//   38   67:aload_1         
	//   39   68:invokespecial   #72  <Method void FacebookException(String, Throwable)>
	//   40   71:athrow          
		}
		return jsonobject;
	}

	final ArrayList val$attachments;
	final UUID val$callId;

	ShareInternalUtility$6(UUID uuid, ArrayList arraylist)
	{
		val$callId = uuid;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field UUID val$callId>
		val$attachments = arraylist;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #21  <Field ArrayList val$attachments>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #24  <Method void Object()>
	//    8   14:return          
	}
}

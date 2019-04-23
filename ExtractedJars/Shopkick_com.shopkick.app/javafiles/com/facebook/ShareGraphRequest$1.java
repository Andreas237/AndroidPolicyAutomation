// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook;

import android.net.Uri;
import com.facebook.share.model.SharePhoto;
import org.json.JSONObject;

// Referenced classes of package com.facebook:
//			ShareGraphRequest, FacebookException

static final class ShareGraphRequest$1
	implements com.facebook.share.internal..PhotoJSONProcessor
{

	public JSONObject toJSONObject(SharePhoto sharephoto)
	{
		sharephoto = ((SharePhoto) (sharephoto.getImageUrl()));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #26  <Method Uri SharePhoto.getImageUrl()>
	//    2    4:astore_1        
		JSONObject jsonobject = new JSONObject();
	//    3    5:new             #28  <Class JSONObject>
	//    4    8:dup             
	//    5    9:invokespecial   #29  <Method void JSONObject()>
	//    6   12:astore_2        
		try
		{
			jsonobject.put("url", ((Object) (((Uri) (sharephoto)).toString())));
	//    7   13:aload_2         
	//    8   14:ldc1            #31  <String "url">
	//    9   16:aload_1         
	//   10   17:invokevirtual   #37  <Method String Uri.toString()>
	//   11   20:invokevirtual   #41  <Method JSONObject JSONObject.put(String, Object)>
	//   12   23:pop             
		}
	//*  13   24:aload_2         
	//*  14   25:areturn         
		// Misplaced declaration of an exception variable
		catch(SharePhoto sharephoto)
	//*  15   26:astore_1        
		{
			throw new FacebookException("Unable to attach images", ((Throwable) (sharephoto)));
	//   16   27:new             #43  <Class FacebookException>
	//   17   30:dup             
	//   18   31:ldc1            #45  <String "Unable to attach images">
	//   19   33:aload_1         
	//   20   34:invokespecial   #48  <Method void FacebookException(String, Throwable)>
	//   21   37:athrow          
		}
		return jsonobject;
	}

	ShareGraphRequest$1()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
	//    2    4:return          
	}
}

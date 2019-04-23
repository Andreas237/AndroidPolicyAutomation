// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.share.internal;

import android.net.Uri;
import com.facebook.FacebookException;
import com.facebook.internal.Utility;
import com.facebook.share.model.SharePhoto;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.facebook.share.internal:
//			ShareInternalUtility

static final class ShareInternalUtility$8
	implements otoJSONProcessor
{

	public JSONObject toJSONObject(SharePhoto sharephoto)
	{
		sharephoto = ((SharePhoto) (sharephoto.getImageUrl()));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #26  <Method Uri SharePhoto.getImageUrl()>
	//    2    4:astore_1        
		if(Utility.isWebUri(((Uri) (sharephoto))))
	//*   3    5:aload_1         
	//*   4    6:invokestatic    #32  <Method boolean Utility.isWebUri(Uri)>
	//*   5    9:ifeq            45
		{
			JSONObject jsonobject = new JSONObject();
	//    6   12:new             #34  <Class JSONObject>
	//    7   15:dup             
	//    8   16:invokespecial   #35  <Method void JSONObject()>
	//    9   19:astore_2        
			try
			{
				jsonobject.put("url", ((Object) (((Uri) (sharephoto)).toString())));
	//   10   20:aload_2         
	//   11   21:ldc1            #37  <String "url">
	//   12   23:aload_1         
	//   13   24:invokevirtual   #43  <Method String Uri.toString()>
	//   14   27:invokevirtual   #47  <Method JSONObject JSONObject.put(String, Object)>
	//   15   30:pop             
			}
	//*  16   31:aload_2         
	//*  17   32:areturn         
			// Misplaced declaration of an exception variable
			catch(SharePhoto sharephoto)
	//*  18   33:astore_1        
			{
				throw new FacebookException("Unable to attach images", ((Throwable) (sharephoto)));
	//   19   34:new             #49  <Class FacebookException>
	//   20   37:dup             
	//   21   38:ldc1            #51  <String "Unable to attach images">
	//   22   40:aload_1         
	//   23   41:invokespecial   #54  <Method void FacebookException(String, Throwable)>
	//   24   44:athrow          
			}
			return jsonobject;
		} else
		{
			throw new FacebookException("Only web images may be used in OG objects shared via the web dialog");
	//   25   45:new             #49  <Class FacebookException>
	//   26   48:dup             
	//   27   49:ldc1            #56  <String "Only web images may be used in OG objects shared via the web dialog">
	//   28   51:invokespecial   #59  <Method void FacebookException(String)>
	//   29   54:athrow          
		}
	}

	ShareInternalUtility$8()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
	//    2    4:return          
	}
}

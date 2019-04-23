// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook;

import android.net.Uri;
import android.os.Bundle;
import com.facebook.share.internal.OpenGraphJSONUtility;
import com.facebook.share.model.ShareOpenGraphObject;
import com.facebook.share.model.SharePhoto;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.facebook:
//			FacebookException, GraphRequest, AccessToken, HttpMethod

public class ShareGraphRequest
{

	public ShareGraphRequest()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #10  <Method void Object()>
	//    2    4:return          
	}

	public static GraphRequest createOpenGraphObject(ShareOpenGraphObject shareopengraphobject)
		throws FacebookException
	{
		String s1 = shareopengraphobject.getString("type");
	//    0    0:aload_0         
	//    1    1:ldc1            #19  <String "type">
	//    2    3:invokevirtual   #25  <Method String ShareOpenGraphObject.getString(String)>
	//    3    6:astore_2        
		String s = s1;
	//    4    7:aload_2         
	//    5    8:astore_1        
		if(s1 == null)
	//*   6    9:aload_2         
	//*   7   10:ifnonnull       20
			s = shareopengraphobject.getString("og:type");
	//    8   13:aload_0         
	//    9   14:ldc1            #27  <String "og:type">
	//   10   16:invokevirtual   #25  <Method String ShareOpenGraphObject.getString(String)>
	//   11   19:astore_1        
		if(s != null)
	//*  12   20:aload_1         
	//*  13   21:ifnull          136
		{
			try
			{
				Object obj = ((Object) ((JSONObject)OpenGraphJSONUtility.toJSONValue(((Object) (shareopengraphobject)), new com.facebook.share.internal.OpenGraphJSONUtility.PhotoJSONProcessor() {

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

				}
)));
	//   14   24:aload_0         
	//   15   25:new             #6   <Class ShareGraphRequest$1>
	//   16   28:dup             
	//   17   29:invokespecial   #28  <Method void ShareGraphRequest$1()>
	//   18   32:invokestatic    #34  <Method Object OpenGraphJSONUtility.toJSONValue(Object, com.facebook.share.internal.OpenGraphJSONUtility$PhotoJSONProcessor)>
	//   19   35:checkcast       #36  <Class JSONObject>
	//   20   38:astore_2        
				shareopengraphobject = ((ShareOpenGraphObject) (new Bundle()));
	//   21   39:new             #38  <Class Bundle>
	//   22   42:dup             
	//   23   43:invokespecial   #39  <Method void Bundle()>
	//   24   46:astore_0        
				((Bundle) (shareopengraphobject)).putString("object", ((JSONObject) (obj)).toString());
	//   25   47:aload_0         
	//   26   48:ldc1            #41  <String "object">
	//   27   50:aload_2         
	//   28   51:invokevirtual   #45  <Method String JSONObject.toString()>
	//   29   54:invokevirtual   #49  <Method void Bundle.putString(String, String)>
				obj = ((Object) (Locale.ROOT));
	//   30   57:getstatic       #55  <Field Locale Locale.ROOT>
	//   31   60:astore_2        
				StringBuilder stringbuilder = new StringBuilder();
	//   32   61:new             #57  <Class StringBuilder>
	//   33   64:dup             
	//   34   65:invokespecial   #58  <Method void StringBuilder()>
	//   35   68:astore_3        
				stringbuilder.append("objects/");
	//   36   69:aload_3         
	//   37   70:ldc1            #60  <String "objects/">
	//   38   72:invokevirtual   #64  <Method StringBuilder StringBuilder.append(String)>
	//   39   75:pop             
				stringbuilder.append(s);
	//   40   76:aload_3         
	//   41   77:aload_1         
	//   42   78:invokevirtual   #64  <Method StringBuilder StringBuilder.append(String)>
	//   43   81:pop             
				s = String.format(((Locale) (obj)), "%s/%s", new Object[] {
					"me", stringbuilder.toString()
				});
	//   44   82:aload_2         
	//   45   83:ldc1            #66  <String "%s/%s">
	//   46   85:iconst_2        
	//   47   86:anewarray       Object[]
	//   48   89:dup             
	//   49   90:iconst_0        
	//   50   91:ldc1            #68  <String "me">
	//   51   93:aastore         
	//   52   94:dup             
	//   53   95:iconst_1        
	//   54   96:aload_3         
	//   55   97:invokevirtual   #69  <Method String StringBuilder.toString()>
	//   56  100:aastore         
	//   57  101:invokestatic    #75  <Method String String.format(Locale, String, Object[])>
	//   58  104:astore_1        
				shareopengraphobject = ((ShareOpenGraphObject) (new GraphRequest(AccessToken.getCurrentAccessToken(), s, ((Bundle) (shareopengraphobject)), HttpMethod.POST)));
	//   59  105:new             #77  <Class GraphRequest>
	//   60  108:dup             
	//   61  109:invokestatic    #83  <Method AccessToken AccessToken.getCurrentAccessToken()>
	//   62  112:aload_1         
	//   63  113:aload_0         
	//   64  114:getstatic       #89  <Field HttpMethod HttpMethod.POST>
	//   65  117:invokespecial   #92  <Method void GraphRequest(AccessToken, String, Bundle, HttpMethod)>
	//   66  120:astore_0        
			}
	//*  67  121:aload_0         
	//*  68  122:areturn         
			// Misplaced declaration of an exception variable
			catch(ShareOpenGraphObject shareopengraphobject)
	//*  69  123:astore_0        
			{
				throw new FacebookException(((JSONException) (shareopengraphobject)).getMessage());
	//   70  124:new             #15  <Class FacebookException>
	//   71  127:dup             
	//   72  128:aload_0         
	//   73  129:invokevirtual   #95  <Method String JSONException.getMessage()>
	//   74  132:invokespecial   #98  <Method void FacebookException(String)>
	//   75  135:athrow          
			}
			return ((GraphRequest) (shareopengraphobject));
		} else
		{
			throw new FacebookException("Open graph object type cannot be null");
	//   76  136:new             #15  <Class FacebookException>
	//   77  139:dup             
	//   78  140:ldc1            #100 <String "Open graph object type cannot be null">
	//   79  142:invokespecial   #98  <Method void FacebookException(String)>
	//   80  145:athrow          
		}
	}
}

// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.firebase.client.authentication;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.firebase.client.utilities.encoding.JsonHelpers;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.ResponseHandler;

class JsonBasicResponseHandler
	implements ResponseHandler
{

	JsonBasicResponseHandler()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
	//    2    4:return          
	}

	public volatile Object handleResponse(HttpResponse httpresponse)
		throws ClientProtocolException, IOException
	{
		return ((Object) (handleResponse(httpresponse)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #23  <Method Map handleResponse(HttpResponse)>
	//    3    5:areturn         
	}

	public Map handleResponse(HttpResponse httpresponse)
		throws IOException
	{
		if(httpresponse == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       6
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		httpresponse = ((HttpResponse) (httpresponse.getEntity()));
	//    4    6:aload_1         
	//    5    7:invokeinterface #30  <Method HttpEntity HttpResponse.getEntity()>
	//    6   12:astore_1        
		if(httpresponse == null)
			break MISSING_BLOCK_LABEL_56;
	//    7   13:aload_1         
	//    8   14:ifnull          56
		httpresponse = ((HttpResponse) (((HttpEntity) (httpresponse)).getContent()));
	//    9   17:aload_1         
	//   10   18:invokeinterface #36  <Method InputStream HttpEntity.getContent()>
	//   11   23:astore_1        
		Map map = (Map)JsonHelpers.getMapper().readValue(((InputStream) (httpresponse)), ((TypeReference) (new TypeReference() {

			final JsonBasicResponseHandler this$0;

			
			{
				this$0 = JsonBasicResponseHandler.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field JsonBasicResponseHandler this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void TypeReference()>
			//    5    9:return          
			}
		}
)));
	//   12   24:invokestatic    #42  <Method ObjectMapper JsonHelpers.getMapper()>
	//   13   27:aload_1         
	//   14   28:new             #9   <Class JsonBasicResponseHandler$1>
	//   15   31:dup             
	//   16   32:aload_0         
	//   17   33:invokespecial   #45  <Method void JsonBasicResponseHandler$1(JsonBasicResponseHandler)>
	//   18   36:invokevirtual   #51  <Method Object ObjectMapper.readValue(InputStream, TypeReference)>
	//   19   39:checkcast       #53  <Class Map>
	//   20   42:astore_2        
		((InputStream) (httpresponse)).close();
	//   21   43:aload_1         
	//   22   44:invokevirtual   #58  <Method void InputStream.close()>
		return map;
	//   23   47:aload_2         
	//   24   48:areturn         
		Exception exception;
		exception;
	//   25   49:astore_2        
		((InputStream) (httpresponse)).close();
	//   26   50:aload_1         
	//   27   51:invokevirtual   #58  <Method void InputStream.close()>
		throw exception;
	//   28   54:aload_2         
	//   29   55:athrow          
		return null;
	//   30   56:aconst_null     
	//   31   57:areturn         
	}
}

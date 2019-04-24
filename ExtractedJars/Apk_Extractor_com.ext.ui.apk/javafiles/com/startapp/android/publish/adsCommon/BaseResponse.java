// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.startapp.android.publish.adsCommon;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public abstract class BaseResponse
	implements Serializable
{

	public BaseResponse()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #21  <Method void Object()>
		parameters = ((Map) (new HashMap()));
	//    2    4:aload_0         
	//    3    5:new             #23  <Class HashMap>
	//    4    8:dup             
	//    5    9:invokespecial   #24  <Method void HashMap()>
	//    6   12:putfield        #26  <Field Map parameters>
		validResponse = true;
	//    7   15:aload_0         
	//    8   16:iconst_1        
	//    9   17:putfield        #28  <Field boolean validResponse>
		errorMessage = null;
	//   10   20:aload_0         
	//   11   21:aconst_null     
	//   12   22:putfield        #30  <Field String errorMessage>
	//   13   25:return          
	}

	public String getErrorMessage()
	{
		return errorMessage;
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field String errorMessage>
	//    2    4:areturn         
	}

	public Map getParameters()
	{
		return parameters;
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field Map parameters>
	//    2    4:areturn         
	}

	public boolean isValidResponse()
	{
		return validResponse;
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field boolean validResponse>
	//    2    4:ireturn         
	}

	public void setErrorMessage(String s)
	{
		errorMessage = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #30  <Field String errorMessage>
	//    3    5:return          
	}

	public void setParameters(Map map)
	{
		parameters = map;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #26  <Field Map parameters>
	//    3    5:return          
	}

	public void setValidResponse(boolean flag)
	{
		validResponse = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #28  <Field boolean validResponse>
	//    3    5:return          
	}

	public String toString()
	{
		return (new StringBuilder()).append("BaseResponse [parameters=").append(((Object) (parameters))).append(", validResponse=").append(validResponse).append(", errorMessage=").append(errorMessage).append("]").toString();
	//    0    0:new             #49  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #50  <Method void StringBuilder()>
	//    3    7:ldc1            #52  <String "BaseResponse [parameters=">
	//    4    9:invokevirtual   #56  <Method StringBuilder StringBuilder.append(String)>
	//    5   12:aload_0         
	//    6   13:getfield        #26  <Field Map parameters>
	//    7   16:invokevirtual   #59  <Method StringBuilder StringBuilder.append(Object)>
	//    8   19:ldc1            #61  <String ", validResponse=">
	//    9   21:invokevirtual   #56  <Method StringBuilder StringBuilder.append(String)>
	//   10   24:aload_0         
	//   11   25:getfield        #28  <Field boolean validResponse>
	//   12   28:invokevirtual   #64  <Method StringBuilder StringBuilder.append(boolean)>
	//   13   31:ldc1            #66  <String ", errorMessage=">
	//   14   33:invokevirtual   #56  <Method StringBuilder StringBuilder.append(String)>
	//   15   36:aload_0         
	//   16   37:getfield        #30  <Field String errorMessage>
	//   17   40:invokevirtual   #56  <Method StringBuilder StringBuilder.append(String)>
	//   18   43:ldc1            #68  <String "]">
	//   19   45:invokevirtual   #56  <Method StringBuilder StringBuilder.append(String)>
	//   20   48:invokevirtual   #70  <Method String StringBuilder.toString()>
	//   21   51:areturn         
	}

	private static final long serialVersionUID = 1L;
	private String errorMessage;
	protected Map parameters;
	private boolean validResponse;
}

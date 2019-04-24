// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.pactforcure.app.api;

import java.io.File;
import okhttp3.*;

public class MultipartFormFactory
{

	public MultipartFormFactory()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void Object()>
	//    2    4:return          
	}

	public static okhttp3.MultipartBody.Part createPartFromPdf(File file, String s, String s1)
	{
		s1 = ((String) (RequestBody.create(MediaType.parse("application/pdf"), file)));
	//    0    0:ldc1            #13  <String "application/pdf">
	//    1    2:invokestatic    #19  <Method MediaType MediaType.parse(String)>
	//    2    5:aload_0         
	//    3    6:invokestatic    #25  <Method RequestBody RequestBody.create(MediaType, File)>
	//    4    9:astore_2        
		return okhttp3.MultipartBody.Part.createFormData(s, file.getName(), ((RequestBody) (s1)));
	//    5   10:aload_1         
	//    6   11:aload_0         
	//    7   12:invokevirtual   #31  <Method String File.getName()>
	//    8   15:aload_2         
	//    9   16:invokestatic    #37  <Method okhttp3.MultipartBody$Part okhttp3.MultipartBody$Part.createFormData(String, String, RequestBody)>
	//   10   19:areturn         
	}

	public static RequestBody createPartFromString(Boolean boolean1)
	{
		if(boolean1.booleanValue())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #45  <Method boolean Boolean.booleanValue()>
	//*   2    4:ifeq            15
			boolean1 = "1";
	//    3    7:ldc1            #47  <String "1">
	//    4    9:astore_0        
		else
	//*   5   10:aload_0         
	//*   6   11:invokestatic    #50  <Method RequestBody createPartFromString(String)>
	//*   7   14:areturn         
			boolean1 = "0";
	//    8   15:ldc1            #52  <String "0">
	//    9   17:astore_0        
		return createPartFromString(((String) (boolean1)));
	//*  10   18:goto            10
	}

	public static RequestBody createPartFromString(Integer integer)
	{
		return createPartFromString(String.valueOf(((Object) (integer))));
	//    0    0:aload_0         
	//    1    1:invokestatic    #59  <Method String String.valueOf(Object)>
	//    2    4:invokestatic    #50  <Method RequestBody createPartFromString(String)>
	//    3    7:areturn         
	}

	public static RequestBody createPartFromString(String s)
	{
		return RequestBody.create(MultipartBody.FORM, s);
	//    0    0:getstatic       #65  <Field MediaType MultipartBody.FORM>
	//    1    3:aload_0         
	//    2    4:invokestatic    #68  <Method RequestBody RequestBody.create(MediaType, String)>
	//    3    7:areturn         
	}
}

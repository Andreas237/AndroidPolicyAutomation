// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amap.api.maps;


public class AMapException extends Exception
{

	public AMapException()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #61  <Method void Exception()>
		a = "\u672A\u77E5\u7684\u9519\u8BEF";
	//    2    4:aload_0         
	//    3    5:ldc1            #44  <String "\u672A\u77E5\u7684\u9519\u8BEF">
	//    4    7:putfield        #63  <Field String a>
	//    5   10:return          
	}

	public AMapException(String s)
	{
		super(s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #67  <Method void Exception(String)>
		a = "\u672A\u77E5\u7684\u9519\u8BEF";
	//    3    5:aload_0         
	//    4    6:ldc1            #44  <String "\u672A\u77E5\u7684\u9519\u8BEF">
	//    5    8:putfield        #63  <Field String a>
		a = s;
	//    6   11:aload_0         
	//    7   12:aload_1         
	//    8   13:putfield        #63  <Field String a>
	//    9   16:return          
	}

	public String getErrorMessage()
	{
		return a;
	//    0    0:aload_0         
	//    1    1:getfield        #63  <Field String a>
	//    2    4:areturn         
	}

	public static final String AMAP_NOT_SUPPORT = "\u79FB\u52A8\u8BBE\u5907\u4E0A\u672A\u5B89\u88C5\u9AD8\u5FB7\u5730\u56FE\u6216\u9AD8\u5FB7\u5730\u56FE\u7248\u672C\u8F83\u65E7";
	public static final String ERROR_CONNECTION = "http\u8FDE\u63A5\u5931\u8D25 - ConnectionException";
	public static final String ERROR_FAILURE_AUTH = "key\u9274\u6743\u5931\u8D25";
	public static final String ERROR_ILLEGAL_VALUE = "\u975E\u6CD5\u5750\u6807\u503C";
	public static final String ERROR_INVALID_PARAMETER = "\u65E0\u6548\u7684\u53C2\u6570 - IllegalArgumentException";
	public static final String ERROR_IO = "IO \u64CD\u4F5C\u5F02\u5E38 - IOException";
	public static final String ERROR_NOT_AVAILABLE = "\u4E0D\u53EF\u5199\u5165\u5F02\u5E38";
	public static final String ERROR_NOT_ENOUGH_SPACE = "\u7A7A\u95F4\u4E0D\u8DB3";
	public static final String ERROR_NULL_PARAMETER = "\u7A7A\u6307\u9488\u5F02\u5E38 - NullPointException";
	public static final String ERROR_PROTOCOL = "\u534F\u8BAE\u89E3\u6790\u9519\u8BEF - ProtocolException";
	public static final String ERROR_SOCKET = "socket \u8FDE\u63A5\u5F02\u5E38 - SocketException";
	public static final String ERROR_SOCKE_TIME_OUT = "socket \u8FDE\u63A5\u8D85\u65F6 - SocketTimeoutException";
	public static final String ERROR_UNKNOWN = "\u672A\u77E5\u7684\u9519\u8BEF";
	public static final String ERROR_UNKNOW_HOST = "\u672A\u77E5\u4E3B\u673A - UnKnowHostException";
	public static final String ERROR_UNKNOW_SERVICE = "\u670D\u52A1\u5668\u8FDE\u63A5\u5931\u8D25 - UnknownServiceException";
	public static final String ERROR_URL = "url\u5F02\u5E38 - MalformedURLException";
	public static final String ILLEGAL_AMAP_ARGUMENT = "\u975E\u6CD5\u53C2\u6570";
	private String a;
}

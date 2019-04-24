// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amap.api.location.core;


public class AMapLocException extends Exception
{

	public AMapLocException()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #82  <Method void Exception()>
		a = "\u6B63\u5E38";
	//    2    4:aload_0         
	//    3    5:ldc1            #84  <String "\u6B63\u5E38">
	//    4    7:putfield        #86  <Field String a>
		b = 0;
	//    5   10:aload_0         
	//    6   11:iconst_0        
	//    7   12:putfield        #88  <Field int b>
	//    8   15:return          
	}

	public AMapLocException(String s)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #82  <Method void Exception()>
		a = "\u6B63\u5E38";
	//    2    4:aload_0         
	//    3    5:ldc1            #84  <String "\u6B63\u5E38">
	//    4    7:putfield        #86  <Field String a>
		b = 0;
	//    5   10:aload_0         
	//    6   11:iconst_0        
	//    7   12:putfield        #88  <Field int b>
		a = s;
	//    8   15:aload_0         
	//    9   16:aload_1         
	//   10   17:putfield        #86  <Field String a>
		a(s);
	//   11   20:aload_0         
	//   12   21:aload_1         
	//   13   22:invokespecial   #92  <Method void a(String)>
	//   14   25:return          
	}

	private void a(String s)
	{
		if("IO \u64CD\u4F5C\u5F02\u5E38 - IOException".equals(((Object) (s))))
	//*   0    0:ldc1            #52  <String "IO \u64CD\u4F5C\u5F02\u5E38 - IOException">
	//*   1    2:aload_1         
	//*   2    3:invokevirtual   #98  <Method boolean String.equals(Object)>
	//*   3    6:ifeq            16
		{
			b = 21;
	//    4    9:aload_0         
	//    5   10:bipush          21
	//    6   12:putfield        #88  <Field int b>
			return;
	//    7   15:return          
		}
		if("socket \u8FDE\u63A5\u5F02\u5E38 - SocketException".equals(((Object) (s))))
	//*   8   16:ldc1            #61  <String "socket \u8FDE\u63A5\u5F02\u5E38 - SocketException">
	//*   9   18:aload_1         
	//*  10   19:invokevirtual   #98  <Method boolean String.equals(Object)>
	//*  11   22:ifeq            32
		{
			b = 22;
	//   12   25:aload_0         
	//   13   26:bipush          22
	//   14   28:putfield        #88  <Field int b>
			return;
	//   15   31:return          
		}
		if("socket \u8FDE\u63A5\u8D85\u65F6 - SocketTimeoutException".equals(((Object) (s))))
	//*  16   32:ldc1            #64  <String "socket \u8FDE\u63A5\u8D85\u65F6 - SocketTimeoutException">
	//*  17   34:aload_1         
	//*  18   35:invokevirtual   #98  <Method boolean String.equals(Object)>
	//*  19   38:ifeq            48
		{
			b = 23;
	//   20   41:aload_0         
	//   21   42:bipush          23
	//   22   44:putfield        #88  <Field int b>
			return;
	//   23   47:return          
		}
		if("\u65E0\u6548\u7684\u53C2\u6570 - IllegalArgumentException".equals(((Object) (s))))
	//*  24   48:ldc1            #49  <String "\u65E0\u6548\u7684\u53C2\u6570 - IllegalArgumentException">
	//*  25   50:aload_1         
	//*  26   51:invokevirtual   #98  <Method boolean String.equals(Object)>
	//*  27   54:ifeq            64
		{
			b = 24;
	//   28   57:aload_0         
	//   29   58:bipush          24
	//   30   60:putfield        #88  <Field int b>
			return;
	//   31   63:return          
		}
		if("\u7A7A\u6307\u9488\u5F02\u5E38 - NullPointException".equals(((Object) (s))))
	//*  32   64:ldc1            #55  <String "\u7A7A\u6307\u9488\u5F02\u5E38 - NullPointException">
	//*  33   66:aload_1         
	//*  34   67:invokevirtual   #98  <Method boolean String.equals(Object)>
	//*  35   70:ifeq            80
		{
			b = 25;
	//   36   73:aload_0         
	//   37   74:bipush          25
	//   38   76:putfield        #88  <Field int b>
			return;
	//   39   79:return          
		}
		if("url\u5F02\u5E38 - MalformedURLException".equals(((Object) (s))))
	//*  40   80:ldc1            #76  <String "url\u5F02\u5E38 - MalformedURLException">
	//*  41   82:aload_1         
	//*  42   83:invokevirtual   #98  <Method boolean String.equals(Object)>
	//*  43   86:ifeq            96
		{
			b = 26;
	//   44   89:aload_0         
	//   45   90:bipush          26
	//   46   92:putfield        #88  <Field int b>
			return;
	//   47   95:return          
		}
		if("\u672A\u77E5\u4E3B\u673A - UnKnowHostException".equals(((Object) (s))))
	//*  48   96:ldc1            #70  <String "\u672A\u77E5\u4E3B\u673A - UnKnowHostException">
	//*  49   98:aload_1         
	//*  50   99:invokevirtual   #98  <Method boolean String.equals(Object)>
	//*  51  102:ifeq            112
		{
			b = 27;
	//   52  105:aload_0         
	//   53  106:bipush          27
	//   54  108:putfield        #88  <Field int b>
			return;
	//   55  111:return          
		}
		if("\u670D\u52A1\u5668\u8FDE\u63A5\u5931\u8D25 - UnknownServiceException".equals(((Object) (s))))
	//*  56  112:ldc1            #73  <String "\u670D\u52A1\u5668\u8FDE\u63A5\u5931\u8D25 - UnknownServiceException">
	//*  57  114:aload_1         
	//*  58  115:invokevirtual   #98  <Method boolean String.equals(Object)>
	//*  59  118:ifeq            128
		{
			b = 28;
	//   60  121:aload_0         
	//   61  122:bipush          28
	//   62  124:putfield        #88  <Field int b>
			return;
	//   63  127:return          
		}
		if("\u534F\u8BAE\u89E3\u6790\u9519\u8BEF - ProtocolException".equals(((Object) (s))))
	//*  64  128:ldc1            #58  <String "\u534F\u8BAE\u89E3\u6790\u9519\u8BEF - ProtocolException">
	//*  65  130:aload_1         
	//*  66  131:invokevirtual   #98  <Method boolean String.equals(Object)>
	//*  67  134:ifeq            144
		{
			b = 29;
	//   68  137:aload_0         
	//   69  138:bipush          29
	//   70  140:putfield        #88  <Field int b>
			return;
	//   71  143:return          
		}
		if("http\u8FDE\u63A5\u5931\u8D25 - ConnectionException".equals(((Object) (s))))
	//*  72  144:ldc1            #37  <String "http\u8FDE\u63A5\u5931\u8D25 - ConnectionException">
	//*  73  146:aload_1         
	//*  74  147:invokevirtual   #98  <Method boolean String.equals(Object)>
	//*  75  150:ifeq            160
		{
			b = 30;
	//   76  153:aload_0         
	//   77  154:bipush          30
	//   78  156:putfield        #88  <Field int b>
			return;
	//   79  159:return          
		}
		if("\u672A\u77E5\u7684\u9519\u8BEF".equals(((Object) (s))))
	//*  80  160:ldc1            #67  <String "\u672A\u77E5\u7684\u9519\u8BEF">
	//*  81  162:aload_1         
	//*  82  163:invokevirtual   #98  <Method boolean String.equals(Object)>
	//*  83  166:ifeq            176
		{
			b = 31;
	//   84  169:aload_0         
	//   85  170:bipush          31
	//   86  172:putfield        #88  <Field int b>
			return;
	//   87  175:return          
		}
		if("key\u9274\u6743\u5931\u8D25".equals(((Object) (s))))
	//*  88  176:ldc1            #40  <String "key\u9274\u6743\u5931\u8D25">
	//*  89  178:aload_1         
	//*  90  179:invokevirtual   #98  <Method boolean String.equals(Object)>
	//*  91  182:ifeq            192
		{
			b = 32;
	//   92  185:aload_0         
	//   93  186:bipush          32
	//   94  188:putfield        #88  <Field int b>
			return;
	//   95  191:return          
		}
		if("\u83B7\u53D6\u57FA\u7AD9/WiFi\u4FE1\u606F\u4E3A\u7A7A\u6216\u5931\u8D25".equals(((Object) (s))))
	//*  96  192:ldc1            #43  <String "\u83B7\u53D6\u57FA\u7AD9/WiFi\u4FE1\u606F\u4E3A\u7A7A\u6216\u5931\u8D25">
	//*  97  194:aload_1         
	//*  98  195:invokevirtual   #98  <Method boolean String.equals(Object)>
	//*  99  198:ifeq            208
		{
			b = 33;
	//  100  201:aload_0         
	//  101  202:bipush          33
	//  102  204:putfield        #88  <Field int b>
			return;
	//  103  207:return          
		}
		if("\u5B9A\u4F4D\u5931\u8D25\u65E0\u6CD5\u83B7\u53D6\u57CE\u5E02\u4FE1\u606F".equals(((Object) (s))))
	//* 104  208:ldc1            #46  <String "\u5B9A\u4F4D\u5931\u8D25\u65E0\u6CD5\u83B7\u53D6\u57CE\u5E02\u4FE1\u606F">
	//* 105  210:aload_1         
	//* 106  211:invokevirtual   #98  <Method boolean String.equals(Object)>
	//* 107  214:ifeq            223
			b = 34;
	//  108  217:aload_0         
	//  109  218:bipush          34
	//  110  220:putfield        #88  <Field int b>
	//  111  223:return          
	}

	public int getErrorCode()
	{
		return b;
	//    0    0:aload_0         
	//    1    1:getfield        #88  <Field int b>
	//    2    4:ireturn         
	}

	public String getErrorMessage()
	{
		return a;
	//    0    0:aload_0         
	//    1    1:getfield        #86  <Field String a>
	//    2    4:areturn         
	}

	public static final int ERROR_CODE_CONNECTION = 30;
	public static final int ERROR_CODE_FAILURE_AUTH = 32;
	public static final int ERROR_CODE_FAILURE_INFO = 33;
	public static final int ERROR_CODE_FAILURE_LOCATION = 34;
	public static final int ERROR_CODE_INVALID_PARAMETER = 24;
	public static final int ERROR_CODE_IO = 21;
	public static final int ERROR_CODE_NULL_PARAMETER = 25;
	public static final int ERROR_CODE_PROTOCOL = 29;
	public static final int ERROR_CODE_SOCKET = 22;
	public static final int ERROR_CODE_SOCKE_TIME_OUT = 23;
	public static final int ERROR_CODE_UNKNOWN = 31;
	public static final int ERROR_CODE_UNKNOW_HOST = 27;
	public static final int ERROR_CODE_UNKNOW_SERVICE = 28;
	public static final int ERROR_CODE_URL = 26;
	public static final String ERROR_CONNECTION = "http\u8FDE\u63A5\u5931\u8D25 - ConnectionException";
	public static final String ERROR_FAILURE_AUTH = "key\u9274\u6743\u5931\u8D25";
	public static final String ERROR_FAILURE_INFO = "\u83B7\u53D6\u57FA\u7AD9/WiFi\u4FE1\u606F\u4E3A\u7A7A\u6216\u5931\u8D25";
	public static final String ERROR_FAILURE_LOCATION = "\u5B9A\u4F4D\u5931\u8D25\u65E0\u6CD5\u83B7\u53D6\u57CE\u5E02\u4FE1\u606F";
	public static final String ERROR_INVALID_PARAMETER = "\u65E0\u6548\u7684\u53C2\u6570 - IllegalArgumentException";
	public static final String ERROR_IO = "IO \u64CD\u4F5C\u5F02\u5E38 - IOException";
	public static final String ERROR_NULL_PARAMETER = "\u7A7A\u6307\u9488\u5F02\u5E38 - NullPointException";
	public static final String ERROR_PROTOCOL = "\u534F\u8BAE\u89E3\u6790\u9519\u8BEF - ProtocolException";
	public static final String ERROR_SOCKET = "socket \u8FDE\u63A5\u5F02\u5E38 - SocketException";
	public static final String ERROR_SOCKE_TIME_OUT = "socket \u8FDE\u63A5\u8D85\u65F6 - SocketTimeoutException";
	public static final String ERROR_UNKNOWN = "\u672A\u77E5\u7684\u9519\u8BEF";
	public static final String ERROR_UNKNOW_HOST = "\u672A\u77E5\u4E3B\u673A - UnKnowHostException";
	public static final String ERROR_UNKNOW_SERVICE = "\u670D\u52A1\u5668\u8FDE\u63A5\u5931\u8D25 - UnknownServiceException";
	public static final String ERROR_URL = "url\u5F02\u5E38 - MalformedURLException";
	private String a;
	private int b;
}

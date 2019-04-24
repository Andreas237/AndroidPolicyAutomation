// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.autonavi.amap.mapcore.maploader;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.amap.api.mapcore.util.*;
import com.autonavi.ae.gmap.GLMapEngine;
import java.io.*;
import java.net.*;
import java.util.Arrays;
import java.util.UUID;

public class AMapLoader
{
	public static class ADataRequestParam
	{

		public byte enCodeString[];
		public long handler;
		public int nCompress;
		public int nRequestType;
		public String requestBaseUrl;
		public String requestUrl;

		public ADataRequestParam()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #21  <Method void Object()>
		//    2    4:return          
		}
	}


	public AMapLoader(int i, GLMapEngine glmapengine, ADataRequestParam adatarequestparam)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #44  <Method void Object()>
		mEngineID = 0;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #46  <Field int mEngineID>
		mURLConnection = null;
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:putfield        #48  <Field HttpURLConnection mURLConnection>
		isCanceled = false;
	//    8   14:aload_0         
	//    9   15:iconst_0        
	//   10   16:putfield        #50  <Field boolean isCanceled>
		mRequestCancel = false;
	//   11   19:aload_0         
	//   12   20:iconst_0        
	//   13   21:putfield        #52  <Field boolean mRequestCancel>
		isFinish = false;
	//   14   24:aload_0         
	//   15   25:iconst_0        
	//   16   26:putfield        #54  <Field boolean isFinish>
		oriHost = "";
	//   17   29:aload_0         
	//   18   30:ldc1            #56  <String "">
	//   19   32:putfield        #58  <Field String oriHost>
		mDataRequestParam = adatarequestparam;
	//   20   35:aload_0         
	//   21   36:aload_3         
	//   22   37:putfield        #60  <Field AMapLoader$ADataRequestParam mDataRequestParam>
		mEngineID = i;
	//   23   40:aload_0         
	//   24   41:iload_1         
	//   25   42:putfield        #46  <Field int mEngineID>
		mGLMapEngine = glmapengine;
	//   26   45:aload_0         
	//   27   46:aload_2         
	//   28   47:putfield        #62  <Field GLMapEngine mGLMapEngine>
		mRequestCancel = false;
	//   29   50:aload_0         
	//   30   51:iconst_0        
	//   31   52:putfield        #52  <Field boolean mRequestCancel>
	//   32   55:return          
	}

	private void generateAMapHeader(HttpURLConnection httpurlconnection)
	{
		if(httpurlconnection != null && !TextUtils.isEmpty(((CharSequence) (ji.b))) && !TextUtils.isEmpty(((CharSequence) (oriHost))))
	//*   0    0:aload_1         
	//*   1    1:ifnull          33
	//*   2    4:getstatic       #69  <Field String ji.b>
	//*   3    7:invokestatic    #75  <Method boolean TextUtils.isEmpty(CharSequence)>
	//*   4   10:ifne            33
	//*   5   13:aload_0         
	//*   6   14:getfield        #58  <Field String oriHost>
	//*   7   17:invokestatic    #75  <Method boolean TextUtils.isEmpty(CharSequence)>
	//*   8   20:ifne            33
			httpurlconnection.setRequestProperty("targetHost", oriHost);
	//    9   23:aload_1         
	//   10   24:ldc1            #11  <String "targetHost">
	//   11   26:aload_0         
	//   12   27:getfield        #58  <Field String oriHost>
	//   13   30:invokevirtual   #81  <Method void HttpURLConnection.setRequestProperty(String, String)>
	//   14   33:return          
	}

	private String generateQueryString(Context context, String s)
	{
		s = ((String) (new StringBuffer(s)));
	//    0    0:new             #85  <Class StringBuffer>
	//    1    3:dup             
	//    2    4:aload_2         
	//    3    5:invokespecial   #88  <Method void StringBuffer(String)>
	//    4    8:astore_2        
		String s1 = go.f(mGLMapEngine.getContext());
	//    5    9:aload_0         
	//    6   10:getfield        #62  <Field GLMapEngine mGLMapEngine>
	//    7   13:invokevirtual   #94  <Method Context GLMapEngine.getContext()>
	//    8   16:invokestatic    #100 <Method String go.f(Context)>
	//    9   19:astore_3        
		((StringBuffer) (s)).append("&key=").append(s1);
	//   10   20:aload_2         
	//   11   21:ldc1            #102 <String "&key=">
	//   12   23:invokevirtual   #106 <Method StringBuffer StringBuffer.append(String)>
	//   13   26:aload_3         
	//   14   27:invokevirtual   #106 <Method StringBuffer StringBuffer.append(String)>
	//   15   30:pop             
		s1 = sortReEncoderParams(((StringBuffer) (s)).toString());
	//   16   31:aload_0         
	//   17   32:aload_2         
	//   18   33:invokevirtual   #110 <Method String StringBuffer.toString()>
	//   19   36:invokespecial   #114 <Method String sortReEncoderParams(String)>
	//   20   39:astore_3        
		String s2 = gr.a();
	//   21   40:invokestatic    #119 <Method String gr.a()>
	//   22   43:astore          4
		((StringBuffer) (s)).append((new StringBuilder()).append("&ts=").append(s2).toString());
	//   23   45:aload_2         
	//   24   46:new             #121 <Class StringBuilder>
	//   25   49:dup             
	//   26   50:invokespecial   #122 <Method void StringBuilder()>
	//   27   53:ldc1            #124 <String "&ts=">
	//   28   55:invokevirtual   #127 <Method StringBuilder StringBuilder.append(String)>
	//   29   58:aload           4
	//   30   60:invokevirtual   #127 <Method StringBuilder StringBuilder.append(String)>
	//   31   63:invokevirtual   #128 <Method String StringBuilder.toString()>
	//   32   66:invokevirtual   #106 <Method StringBuffer StringBuffer.append(String)>
	//   33   69:pop             
		((StringBuffer) (s)).append((new StringBuilder()).append("&scode=").append(gr.a(context, s2, s1)).toString());
	//   34   70:aload_2         
	//   35   71:new             #121 <Class StringBuilder>
	//   36   74:dup             
	//   37   75:invokespecial   #122 <Method void StringBuilder()>
	//   38   78:ldc1            #130 <String "&scode=">
	//   39   80:invokevirtual   #127 <Method StringBuilder StringBuilder.append(String)>
	//   40   83:aload_1         
	//   41   84:aload           4
	//   42   86:aload_3         
	//   43   87:invokestatic    #133 <Method String gr.a(Context, String, String)>
	//   44   90:invokevirtual   #127 <Method StringBuilder StringBuilder.append(String)>
	//   45   93:invokevirtual   #128 <Method String StringBuilder.toString()>
	//   46   96:invokevirtual   #106 <Method StringBuffer StringBuffer.append(String)>
	//   47   99:pop             
		return ((StringBuffer) (s)).toString();
	//   48  100:aload_2         
	//   49  101:invokevirtual   #110 <Method String StringBuffer.toString()>
	//   50  104:areturn         
	}

	private String generateUrl(String s)
	{
		if(!TextUtils.isEmpty(((CharSequence) (ji.b))))
	//*   0    0:getstatic       #69  <Field String ji.b>
	//*   1    3:invokestatic    #75  <Method boolean TextUtils.isEmpty(CharSequence)>
	//*   2    6:ifne            39
		{
			s = ((String) (Uri.parse(s)));
	//    3    9:aload_1         
	//    4   10:invokestatic    #140 <Method Uri Uri.parse(String)>
	//    5   13:astore_1        
			oriHost = ((Uri) (s)).getHost();
	//    6   14:aload_0         
	//    7   15:aload_1         
	//    8   16:invokevirtual   #143 <Method String Uri.getHost()>
	//    9   19:putfield        #58  <Field String oriHost>
			return ((Uri) (s)).buildUpon().encodedAuthority(ji.b).build().toString();
	//   10   22:aload_1         
	//   11   23:invokevirtual   #147 <Method android.net.Uri$Builder Uri.buildUpon()>
	//   12   26:getstatic       #69  <Field String ji.b>
	//   13   29:invokevirtual   #153 <Method android.net.Uri$Builder android.net.Uri$Builder.encodedAuthority(String)>
	//   14   32:invokevirtual   #157 <Method Uri android.net.Uri$Builder.build()>
	//   15   35:invokevirtual   #158 <Method String Uri.toString()>
	//   16   38:areturn         
		} else
		{
			return s;
	//   17   39:aload_1         
	//   18   40:areturn         
		}
	}

	private String getEncodeRequestParams(String s)
	{
		try
		{
			s = URLEncoder.encode(s, "UTF-8");
	//    0    0:aload_1         
	//    1    1:ldc1            #163 <String "UTF-8">
	//    2    3:invokestatic    #169 <Method String URLEncoder.encode(String, String)>
	//    3    6:astore_1        
		}
	//*   4    7:aload_1         
	//*   5    8:areturn         
		// Misplaced declaration of an exception variable
		catch(String s)
	//*   6    9:astore_1        
		{
			((UnsupportedEncodingException) (s)).printStackTrace();
	//    7   10:aload_1         
	//    8   11:invokevirtual   #172 <Method void UnsupportedEncodingException.printStackTrace()>
			return null;
	//    9   14:aconst_null     
	//   10   15:areturn         
		}
		return s;
	}

	private String sortReEncoderParams(String s)
	{
		String as[] = s.split("&");
	//    0    0:aload_1         
	//    1    1:ldc1            #174 <String "&">
	//    2    3:invokevirtual   #180 <Method String[] String.split(String)>
	//    3    6:astore          4
		Arrays.sort(((Object []) (as)));
	//    4    8:aload           4
	//    5   10:invokestatic    #186 <Method void Arrays.sort(Object[])>
		StringBuffer stringbuffer = new StringBuffer();
	//    6   13:new             #85  <Class StringBuffer>
	//    7   16:dup             
	//    8   17:invokespecial   #187 <Method void StringBuffer()>
	//    9   20:astore          5
		int j = as.length;
	//   10   22:aload           4
	//   11   24:arraylength     
	//   12   25:istore_3        
		for(int i = 0; i < j; i++)
	//*  13   26:iconst_0        
	//*  14   27:istore_2        
	//*  15   28:iload_2         
	//*  16   29:iload_3         
	//*  17   30:icmpge          62
		{
			stringbuffer.append(strReEncoder(as[i]));
	//   18   33:aload           5
	//   19   35:aload_0         
	//   20   36:aload           4
	//   21   38:iload_2         
	//   22   39:aaload          
	//   23   40:invokespecial   #190 <Method String strReEncoder(String)>
	//   24   43:invokevirtual   #106 <Method StringBuffer StringBuffer.append(String)>
	//   25   46:pop             
			stringbuffer.append("&");
	//   26   47:aload           5
	//   27   49:ldc1            #174 <String "&">
	//   28   51:invokevirtual   #106 <Method StringBuffer StringBuffer.append(String)>
	//   29   54:pop             
		}

	//   30   55:iload_2         
	//   31   56:iconst_1        
	//   32   57:iadd            
	//   33   58:istore_2        
	//*  34   59:goto            28
		String s1 = stringbuffer.toString();
	//   35   62:aload           5
	//   36   64:invokevirtual   #110 <Method String StringBuffer.toString()>
	//   37   67:astore          4
		if(s1.length() > 1)
	//*  38   69:aload           4
	//*  39   71:invokevirtual   #194 <Method int String.length()>
	//*  40   74:iconst_1        
	//*  41   75:icmple          95
			return (String)s1.subSequence(0, s1.length() - 1);
	//   42   78:aload           4
	//   43   80:iconst_0        
	//   44   81:aload           4
	//   45   83:invokevirtual   #194 <Method int String.length()>
	//   46   86:iconst_1        
	//   47   87:isub            
	//   48   88:invokevirtual   #198 <Method CharSequence String.subSequence(int, int)>
	//   49   91:checkcast       #176 <Class String>
	//   50   94:areturn         
		else
			return s;
	//   51   95:aload_1         
	//   52   96:areturn         
	}

	private String strReEncoder(String s)
	{
		if(s == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       6
			return s;
	//    2    4:aload_1         
	//    3    5:areturn         
		s = URLDecoder.decode(s, "utf-8");
	//    4    6:aload_1         
	//    5    7:ldc1            #202 <String "utf-8">
	//    6    9:invokestatic    #207 <Method String URLDecoder.decode(String, String)>
	//    7   12:astore_1        
		return s;
	//    8   13:aload_1         
	//    9   14:areturn         
		s;
	//   10   15:astore_1        
		hm.c(((Throwable) (s)), "AbstractProtocalHandler", "strReEncoder");
	//   11   16:aload_1         
	//   12   17:ldc1            #209 <String "AbstractProtocalHandler">
	//   13   19:ldc1            #210 <String "strReEncoder">
	//   14   21:invokestatic    #216 <Method void hm.c(Throwable, String, String)>
		break MISSING_BLOCK_LABEL_36;
	//   15   24:goto            36
		s;
	//   16   27:astore_1        
		hm.c(((Throwable) (s)), "AbstractProtocalHandler", "strReEncoderException");
	//   17   28:aload_1         
	//   18   29:ldc1            #209 <String "AbstractProtocalHandler">
	//   19   31:ldc1            #218 <String "strReEncoderException">
	//   20   33:invokestatic    #216 <Method void hm.c(Throwable, String, String)>
		return "";
	//   21   36:ldc1            #56  <String "">
	//   22   38:areturn         
	}

	public void doCancel()
	{
		mRequestCancel = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #52  <Field boolean mRequestCancel>
		if(mURLConnection == null || isCanceled)
			break MISSING_BLOCK_LABEL_69;
	//    3    5:aload_0         
	//    4    6:getfield        #48  <Field HttpURLConnection mURLConnection>
	//    5    9:ifnull          69
	//    6   12:aload_0         
	//    7   13:getfield        #50  <Field boolean isCanceled>
	//    8   16:ifne            69
		HttpURLConnection httpurlconnection = mURLConnection;
	//    9   19:aload_0         
	//   10   20:getfield        #48  <Field HttpURLConnection mURLConnection>
	//   11   23:astore_1        
		httpurlconnection;
	//   12   24:aload_1         
		JVM INSTR monitorenter ;
	//   13   25:monitorenter    
		try
		{
			isCanceled = true;
	//   14   26:aload_0         
	//   15   27:iconst_1        
	//   16   28:putfield        #50  <Field boolean isCanceled>
			mURLConnection.disconnect();
	//   17   31:aload_0         
	//   18   32:getfield        #48  <Field HttpURLConnection mURLConnection>
	//   19   35:invokevirtual   #222 <Method void HttpURLConnection.disconnect()>
			mGLMapEngine.setMapLoaderToTask(mEngineID, mDataRequestParam.handler, ((AMapLoader) (null)));
	//   20   38:aload_0         
	//   21   39:getfield        #62  <Field GLMapEngine mGLMapEngine>
	//   22   42:aload_0         
	//   23   43:getfield        #46  <Field int mEngineID>
	//   24   46:aload_0         
	//   25   47:getfield        #60  <Field AMapLoader$ADataRequestParam mDataRequestParam>
	//   26   50:getfield        #225 <Field long AMapLoader$ADataRequestParam.handler>
	//   27   53:aconst_null     
	//   28   54:invokevirtual   #229 <Method void GLMapEngine.setMapLoaderToTask(int, long, AMapLoader)>
		}
	//*  29   57:goto            61
		catch(Exception exception) { }
	//   30   60:astore_2        
		httpurlconnection;
	//   31   61:aload_1         
		JVM INSTR monitorexit ;
	//   32   62:monitorexit     
		return;
	//   33   63:return          
		Exception exception1;
		exception1;
	//   34   64:astore_2        
	//*  35   65:aload_1         
		throw exception1;
	//   36   66:monitorexit     
	//   37   67:aload_2         
	//   38   68:athrow          
	//   39   69:return          
	}

	public void doRequest()
	{
		Object obj;
		Object obj2;
		Object obj3;
		Object obj4;
		Object obj5;
		Object obj6;
		Object obj7;
		Object obj8;
		Object obj9;
		Object obj10;
		byte abyte0[];
		Object obj11;
		Object obj12;
		Object obj13;
		Object obj14;
		Object obj15;
		Object obj16;
		Object obj17;
		Object obj18;
		Object obj19;
		Object obj20;
		String s;
		if(mRequestCancel)
	//*   0    0:aload_0         
	//*   1    1:getfield        #52  <Field boolean mRequestCancel>
	//*   2    4:ifeq            8
			return;
	//    3    7:return          
		obj = ((Object) (mDataRequestParam.requestBaseUrl));
	//    4    8:aload_0         
	//    5    9:getfield        #60  <Field AMapLoader$ADataRequestParam mDataRequestParam>
	//    6   12:getfield        #249 <Field String AMapLoader$ADataRequestParam.requestBaseUrl>
	//    7   15:astore          6
		obj2 = ((Object) (mDataRequestParam.requestUrl));
	//    8   17:aload_0         
	//    9   18:getfield        #60  <Field AMapLoader$ADataRequestParam mDataRequestParam>
	//   10   21:getfield        #252 <Field String AMapLoader$ADataRequestParam.requestUrl>
	//   11   24:astore          7
		obj = ((Object) (generateUrl(((String) (obj)))));
	//   12   26:aload_0         
	//   13   27:aload           6
	//   14   29:invokespecial   #254 <Method String generateUrl(String)>
	//   15   32:astore          6
		obj20 = ((Object) ((new StringBuilder()).append(((String) (obj))).append("?").toString()));
	//   16   34:new             #121 <Class StringBuilder>
	//   17   37:dup             
	//   18   38:invokespecial   #122 <Method void StringBuilder()>
	//   19   41:aload           6
	//   20   43:invokevirtual   #127 <Method StringBuilder StringBuilder.append(String)>
	//   21   46:ldc2            #256 <String "?">
	//   22   49:invokevirtual   #127 <Method StringBuilder StringBuilder.append(String)>
	//   23   52:invokevirtual   #128 <Method String StringBuilder.toString()>
	//   24   55:astore          26
		obj = obj2;
	//   25   57:aload           7
	//   26   59:astore          6
		if(true)
	//*  27   61:iconst_1        
	//*  28   62:ifeq            85
			obj = ((Object) (((String) (obj2)).replaceAll(";", getEncodeRequestParams(";").toString())));
	//   29   65:aload           7
	//   30   67:ldc2            #258 <String ";">
	//   31   70:aload_0         
	//   32   71:ldc2            #258 <String ";">
	//   33   74:invokespecial   #260 <Method String getEncodeRequestParams(String)>
	//   34   77:invokevirtual   #261 <Method String String.toString()>
	//   35   80:invokevirtual   #264 <Method String String.replaceAll(String, String)>
	//   36   83:astore          6
		boolean flag2 = false;
	//   37   85:iconst_0        
	//   38   86:istore          5
		boolean flag = flag2;
	//   39   88:iload           5
	//   40   90:istore          4
		if(obj20 != null)
	//*  41   92:aload           26
	//*  42   94:ifnull          115
		{
			flag = flag2;
	//   43   97:iload           5
	//   44   99:istore          4
			if(((String) (obj20)).contains("http://m5.amap.com/"))
	//*  45  101:aload           26
	//*  46  103:ldc2            #266 <String "http://m5.amap.com/">
	//*  47  106:invokevirtual   #269 <Method boolean String.contains(CharSequence)>
	//*  48  109:ifeq            115
				flag = true;
	//   49  112:iconst_1        
	//   50  113:istore          4
		}
		s = getRequestParams(((String) (obj)), flag, mDataRequestParam.nRequestType);
	//   51  115:aload_0         
	//   52  116:aload           6
	//   53  118:iload           4
	//   54  120:aload_0         
	//   55  121:getfield        #60  <Field AMapLoader$ADataRequestParam mDataRequestParam>
	//   56  124:getfield        #272 <Field int AMapLoader$ADataRequestParam.nRequestType>
	//   57  127:invokevirtual   #276 <Method String getRequestParams(String, boolean, int)>
	//   58  130:astore          27
		obj = ((Object) (new StringBuffer()));
	//   59  132:new             #85  <Class StringBuffer>
	//   60  135:dup             
	//   61  136:invokespecial   #187 <Method void StringBuffer()>
	//   62  139:astore          6
		if(mDataRequestParam.nRequestType == 0)
	//*  63  141:aload_0         
	//*  64  142:getfield        #60  <Field AMapLoader$ADataRequestParam mDataRequestParam>
	//*  65  145:getfield        #272 <Field int AMapLoader$ADataRequestParam.nRequestType>
	//*  66  148:ifne            193
		{
			((StringBuffer) (obj)).append(s);
	//   67  151:aload           6
	//   68  153:aload           27
	//   69  155:invokevirtual   #106 <Method StringBuffer StringBuffer.append(String)>
	//   70  158:pop             
			((StringBuffer) (obj)).append((new StringBuilder()).append("&csid=").append(UUID.randomUUID().toString()).toString());
	//   71  159:aload           6
	//   72  161:new             #121 <Class StringBuilder>
	//   73  164:dup             
	//   74  165:invokespecial   #122 <Method void StringBuilder()>
	//   75  168:ldc2            #278 <String "&csid=">
	//   76  171:invokevirtual   #127 <Method StringBuilder StringBuilder.append(String)>
	//   77  174:invokestatic    #284 <Method UUID UUID.randomUUID()>
	//   78  177:invokevirtual   #285 <Method String UUID.toString()>
	//   79  180:invokevirtual   #127 <Method StringBuilder StringBuilder.append(String)>
	//   80  183:invokevirtual   #128 <Method String StringBuilder.toString()>
	//   81  186:invokevirtual   #106 <Method StringBuffer StringBuffer.append(String)>
	//   82  189:pop             
		} else
	//*  83  190:goto            224
		{
			((StringBuffer) (obj)).append((new StringBuilder()).append("csid=").append(UUID.randomUUID().toString()).toString());
	//   84  193:aload           6
	//   85  195:new             #121 <Class StringBuilder>
	//   86  198:dup             
	//   87  199:invokespecial   #122 <Method void StringBuilder()>
	//   88  202:ldc2            #287 <String "csid=">
	//   89  205:invokevirtual   #127 <Method StringBuilder StringBuilder.append(String)>
	//   90  208:invokestatic    #284 <Method UUID UUID.randomUUID()>
	//   91  211:invokevirtual   #285 <Method String UUID.toString()>
	//   92  214:invokevirtual   #127 <Method StringBuilder StringBuilder.append(String)>
	//   93  217:invokevirtual   #128 <Method String StringBuilder.toString()>
	//   94  220:invokevirtual   #106 <Method StringBuffer StringBuffer.append(String)>
	//   95  223:pop             
		}
		obj11 = null;
	//   96  224:aconst_null     
	//   97  225:astore          17
		obj12 = null;
	//   98  227:aconst_null     
	//   99  228:astore          18
		obj13 = null;
	//  100  230:aconst_null     
	//  101  231:astore          19
		obj14 = null;
	//  102  233:aconst_null     
	//  103  234:astore          20
		obj15 = null;
	//  104  236:aconst_null     
	//  105  237:astore          21
		obj16 = null;
	//  106  239:aconst_null     
	//  107  240:astore          22
		obj17 = null;
	//  108  242:aconst_null     
	//  109  243:astore          23
		obj18 = null;
	//  110  245:aconst_null     
	//  111  246:astore          24
		obj19 = null;
	//  112  248:aconst_null     
	//  113  249:astore          25
		abyte0 = null;
	//  114  251:aconst_null     
	//  115  252:astore          16
		obj6 = ((Object) (obj11));
	//  116  254:aload           17
	//  117  256:astore          11
		obj7 = ((Object) (obj12));
	//  118  258:aload           18
	//  119  260:astore          12
		obj8 = ((Object) (obj13));
	//  120  262:aload           19
	//  121  264:astore          13
		obj3 = ((Object) (obj14));
	//  122  266:aload           20
	//  123  268:astore          8
		obj4 = ((Object) (obj15));
	//  124  270:aload           21
	//  125  272:astore          9
		obj9 = ((Object) (obj16));
	//  126  274:aload           22
	//  127  276:astore          14
		obj5 = ((Object) (obj17));
	//  128  278:aload           23
	//  129  280:astore          10
		obj10 = ((Object) (obj18));
	//  130  282:aload           24
	//  131  284:astore          15
		obj2 = ((Object) (obj19));
	//  132  286:aload           25
	//  133  288:astore          7
		obj20 = ((Object) (new URL((new StringBuilder()).append(((String) (obj20))).append(generateQueryString(mGLMapEngine.getContext(), ((StringBuffer) (obj)).toString())).toString())));
	//  134  290:new             #289 <Class URL>
	//  135  293:dup             
	//  136  294:new             #121 <Class StringBuilder>
	//  137  297:dup             
	//  138  298:invokespecial   #122 <Method void StringBuilder()>
	//  139  301:aload           26
	//  140  303:invokevirtual   #127 <Method StringBuilder StringBuilder.append(String)>
	//  141  306:aload_0         
	//  142  307:aload_0         
	//  143  308:getfield        #62  <Field GLMapEngine mGLMapEngine>
	//  144  311:invokevirtual   #94  <Method Context GLMapEngine.getContext()>
	//  145  314:aload           6
	//  146  316:invokevirtual   #110 <Method String StringBuffer.toString()>
	//  147  319:invokespecial   #291 <Method String generateQueryString(Context, String)>
	//  148  322:invokevirtual   #127 <Method StringBuilder StringBuilder.append(String)>
	//  149  325:invokevirtual   #128 <Method String StringBuilder.toString()>
	//  150  328:invokespecial   #292 <Method void URL(String)>
	//  151  331:astore          26
		obj = ((Object) (abyte0));
	//  152  333:aload           16
	//  153  335:astore          6
		if(obj20 == null)
			break MISSING_BLOCK_LABEL_1722;
	//  154  337:aload           26
	//  155  339:ifnull          1722
		obj6 = ((Object) (obj11));
	//  156  342:aload           17
	//  157  344:astore          11
		obj7 = ((Object) (obj12));
	//  158  346:aload           18
	//  159  348:astore          12
		obj8 = ((Object) (obj13));
	//  160  350:aload           19
	//  161  352:astore          13
		obj3 = ((Object) (obj14));
	//  162  354:aload           20
	//  163  356:astore          8
		obj4 = ((Object) (obj15));
	//  164  358:aload           21
	//  165  360:astore          9
		obj9 = ((Object) (obj16));
	//  166  362:aload           22
	//  167  364:astore          14
		obj5 = ((Object) (obj17));
	//  168  366:aload           23
	//  169  368:astore          10
		obj10 = ((Object) (obj18));
	//  170  370:aload           24
	//  171  372:astore          15
		obj2 = ((Object) (obj19));
	//  172  374:aload           25
	//  173  376:astore          7
		if(mURLConnection != null)
			break MISSING_BLOCK_LABEL_433;
	//  174  378:aload_0         
	//  175  379:getfield        #48  <Field HttpURLConnection mURLConnection>
	//  176  382:ifnonnull       433
		obj6 = ((Object) (obj11));
	//  177  385:aload           17
	//  178  387:astore          11
		obj7 = ((Object) (obj12));
	//  179  389:aload           18
	//  180  391:astore          12
		obj8 = ((Object) (obj13));
	//  181  393:aload           19
	//  182  395:astore          13
		obj3 = ((Object) (obj14));
	//  183  397:aload           20
	//  184  399:astore          8
		obj4 = ((Object) (obj15));
	//  185  401:aload           21
	//  186  403:astore          9
		obj9 = ((Object) (obj16));
	//  187  405:aload           22
	//  188  407:astore          14
		obj5 = ((Object) (obj17));
	//  189  409:aload           23
	//  190  411:astore          10
		obj10 = ((Object) (obj18));
	//  191  413:aload           24
	//  192  415:astore          15
		obj2 = ((Object) (obj19));
	//  193  417:aload           25
	//  194  419:astore          7
		mURLConnection = (HttpURLConnection)((URL) (obj20)).openConnection();
	//  195  421:aload_0         
	//  196  422:aload           26
	//  197  424:invokevirtual   #296 <Method java.net.URLConnection URL.openConnection()>
	//  198  427:checkcast       #77  <Class HttpURLConnection>
	//  199  430:putfield        #48  <Field HttpURLConnection mURLConnection>
		obj6 = ((Object) (obj11));
	//  200  433:aload           17
	//  201  435:astore          11
		obj7 = ((Object) (obj12));
	//  202  437:aload           18
	//  203  439:astore          12
		obj8 = ((Object) (obj13));
	//  204  441:aload           19
	//  205  443:astore          13
		obj3 = ((Object) (obj14));
	//  206  445:aload           20
	//  207  447:astore          8
		obj4 = ((Object) (obj15));
	//  208  449:aload           21
	//  209  451:astore          9
		obj9 = ((Object) (obj16));
	//  210  453:aload           22
	//  211  455:astore          14
		obj5 = ((Object) (obj17));
	//  212  457:aload           23
	//  213  459:astore          10
		obj10 = ((Object) (obj18));
	//  214  461:aload           24
	//  215  463:astore          15
		obj2 = ((Object) (obj19));
	//  216  465:aload           25
	//  217  467:astore          7
		mURLConnection.setConnectTimeout(20000);
	//  218  469:aload_0         
	//  219  470:getfield        #48  <Field HttpURLConnection mURLConnection>
	//  220  473:sipush          20000
	//  221  476:invokevirtual   #300 <Method void HttpURLConnection.setConnectTimeout(int)>
		obj6 = ((Object) (obj11));
	//  222  479:aload           17
	//  223  481:astore          11
		obj7 = ((Object) (obj12));
	//  224  483:aload           18
	//  225  485:astore          12
		obj8 = ((Object) (obj13));
	//  226  487:aload           19
	//  227  489:astore          13
		obj3 = ((Object) (obj14));
	//  228  491:aload           20
	//  229  493:astore          8
		obj4 = ((Object) (obj15));
	//  230  495:aload           21
	//  231  497:astore          9
		obj9 = ((Object) (obj16));
	//  232  499:aload           22
	//  233  501:astore          14
		obj5 = ((Object) (obj17));
	//  234  503:aload           23
	//  235  505:astore          10
		obj10 = ((Object) (obj18));
	//  236  507:aload           24
	//  237  509:astore          15
		obj2 = ((Object) (obj19));
	//  238  511:aload           25
	//  239  513:astore          7
		mURLConnection.setReadTimeout(20000);
	//  240  515:aload_0         
	//  241  516:getfield        #48  <Field HttpURLConnection mURLConnection>
	//  242  519:sipush          20000
	//  243  522:invokevirtual   #303 <Method void HttpURLConnection.setReadTimeout(int)>
		obj6 = ((Object) (obj11));
	//  244  525:aload           17
	//  245  527:astore          11
		obj7 = ((Object) (obj12));
	//  246  529:aload           18
	//  247  531:astore          12
		obj8 = ((Object) (obj13));
	//  248  533:aload           19
	//  249  535:astore          13
		obj3 = ((Object) (obj14));
	//  250  537:aload           20
	//  251  539:astore          8
		obj4 = ((Object) (obj15));
	//  252  541:aload           21
	//  253  543:astore          9
		obj9 = ((Object) (obj16));
	//  254  545:aload           22
	//  255  547:astore          14
		obj5 = ((Object) (obj17));
	//  256  549:aload           23
	//  257  551:astore          10
		obj10 = ((Object) (obj18));
	//  258  553:aload           24
	//  259  555:astore          15
		obj2 = ((Object) (obj19));
	//  260  557:aload           25
	//  261  559:astore          7
		generateAMapHeader(mURLConnection);
	//  262  561:aload_0         
	//  263  562:aload_0         
	//  264  563:getfield        #48  <Field HttpURLConnection mURLConnection>
	//  265  566:invokespecial   #305 <Method void generateAMapHeader(HttpURLConnection)>
		obj6 = ((Object) (obj11));
	//  266  569:aload           17
	//  267  571:astore          11
		obj7 = ((Object) (obj12));
	//  268  573:aload           18
	//  269  575:astore          12
		obj8 = ((Object) (obj13));
	//  270  577:aload           19
	//  271  579:astore          13
		obj3 = ((Object) (obj14));
	//  272  581:aload           20
	//  273  583:astore          8
		obj4 = ((Object) (obj15));
	//  274  585:aload           21
	//  275  587:astore          9
		obj9 = ((Object) (obj16));
	//  276  589:aload           22
	//  277  591:astore          14
		obj5 = ((Object) (obj17));
	//  278  593:aload           23
	//  279  595:astore          10
		obj10 = ((Object) (obj18));
	//  280  597:aload           24
	//  281  599:astore          15
		obj2 = ((Object) (obj19));
	//  282  601:aload           25
	//  283  603:astore          7
		if(mDataRequestParam.nRequestType != 0)
			break MISSING_BLOCK_LABEL_664;
	//  284  605:aload_0         
	//  285  606:getfield        #60  <Field AMapLoader$ADataRequestParam mDataRequestParam>
	//  286  609:getfield        #272 <Field int AMapLoader$ADataRequestParam.nRequestType>
	//  287  612:ifne            664
		obj6 = ((Object) (obj11));
	//  288  615:aload           17
	//  289  617:astore          11
		obj7 = ((Object) (obj12));
	//  290  619:aload           18
	//  291  621:astore          12
		obj8 = ((Object) (obj13));
	//  292  623:aload           19
	//  293  625:astore          13
		obj3 = ((Object) (obj14));
	//  294  627:aload           20
	//  295  629:astore          8
		obj4 = ((Object) (obj15));
	//  296  631:aload           21
	//  297  633:astore          9
		obj9 = ((Object) (obj16));
	//  298  635:aload           22
	//  299  637:astore          14
		obj5 = ((Object) (obj17));
	//  300  639:aload           23
	//  301  641:astore          10
		obj10 = ((Object) (obj18));
	//  302  643:aload           24
	//  303  645:astore          15
		obj2 = ((Object) (obj19));
	//  304  647:aload           25
	//  305  649:astore          7
		mURLConnection.setRequestMethod("GET");
	//  306  651:aload_0         
	//  307  652:getfield        #48  <Field HttpURLConnection mURLConnection>
	//  308  655:ldc2            #307 <String "GET">
	//  309  658:invokevirtual   #310 <Method void HttpURLConnection.setRequestMethod(String)>
		break MISSING_BLOCK_LABEL_1110;
	//  310  661:goto            1110
		obj6 = ((Object) (obj11));
	//  311  664:aload           17
	//  312  666:astore          11
		obj7 = ((Object) (obj12));
	//  313  668:aload           18
	//  314  670:astore          12
		obj8 = ((Object) (obj13));
	//  315  672:aload           19
	//  316  674:astore          13
		obj3 = ((Object) (obj14));
	//  317  676:aload           20
	//  318  678:astore          8
		obj4 = ((Object) (obj15));
	//  319  680:aload           21
	//  320  682:astore          9
		obj9 = ((Object) (obj16));
	//  321  684:aload           22
	//  322  686:astore          14
		obj5 = ((Object) (obj17));
	//  323  688:aload           23
	//  324  690:astore          10
		obj10 = ((Object) (obj18));
	//  325  692:aload           24
	//  326  694:astore          15
		obj2 = ((Object) (obj19));
	//  327  696:aload           25
	//  328  698:astore          7
		mURLConnection.setRequestMethod("POST");
	//  329  700:aload_0         
	//  330  701:getfield        #48  <Field HttpURLConnection mURLConnection>
	//  331  704:ldc2            #312 <String "POST">
	//  332  707:invokevirtual   #310 <Method void HttpURLConnection.setRequestMethod(String)>
		obj6 = ((Object) (obj11));
	//  333  710:aload           17
	//  334  712:astore          11
		obj7 = ((Object) (obj12));
	//  335  714:aload           18
	//  336  716:astore          12
		obj8 = ((Object) (obj13));
	//  337  718:aload           19
	//  338  720:astore          13
		obj3 = ((Object) (obj14));
	//  339  722:aload           20
	//  340  724:astore          8
		obj4 = ((Object) (obj15));
	//  341  726:aload           21
	//  342  728:astore          9
		obj9 = ((Object) (obj16));
	//  343  730:aload           22
	//  344  732:astore          14
		obj5 = ((Object) (obj17));
	//  345  734:aload           23
	//  346  736:astore          10
		obj10 = ((Object) (obj18));
	//  347  738:aload           24
	//  348  740:astore          15
		obj2 = ((Object) (obj19));
	//  349  742:aload           25
	//  350  744:astore          7
		mURLConnection.setDoInput(true);
	//  351  746:aload_0         
	//  352  747:getfield        #48  <Field HttpURLConnection mURLConnection>
	//  353  750:iconst_1        
	//  354  751:invokevirtual   #316 <Method void HttpURLConnection.setDoInput(boolean)>
		obj6 = ((Object) (obj11));
	//  355  754:aload           17
	//  356  756:astore          11
		obj7 = ((Object) (obj12));
	//  357  758:aload           18
	//  358  760:astore          12
		obj8 = ((Object) (obj13));
	//  359  762:aload           19
	//  360  764:astore          13
		obj3 = ((Object) (obj14));
	//  361  766:aload           20
	//  362  768:astore          8
		obj4 = ((Object) (obj15));
	//  363  770:aload           21
	//  364  772:astore          9
		obj9 = ((Object) (obj16));
	//  365  774:aload           22
	//  366  776:astore          14
		obj5 = ((Object) (obj17));
	//  367  778:aload           23
	//  368  780:astore          10
		obj10 = ((Object) (obj18));
	//  369  782:aload           24
	//  370  784:astore          15
		obj2 = ((Object) (obj19));
	//  371  786:aload           25
	//  372  788:astore          7
		mURLConnection.setDoOutput(true);
	//  373  790:aload_0         
	//  374  791:getfield        #48  <Field HttpURLConnection mURLConnection>
	//  375  794:iconst_1        
	//  376  795:invokevirtual   #319 <Method void HttpURLConnection.setDoOutput(boolean)>
		obj6 = ((Object) (obj11));
	//  377  798:aload           17
	//  378  800:astore          11
		obj7 = ((Object) (obj12));
	//  379  802:aload           18
	//  380  804:astore          12
		obj8 = ((Object) (obj13));
	//  381  806:aload           19
	//  382  808:astore          13
		obj3 = ((Object) (obj14));
	//  383  810:aload           20
	//  384  812:astore          8
		obj4 = ((Object) (obj15));
	//  385  814:aload           21
	//  386  816:astore          9
		obj9 = ((Object) (obj16));
	//  387  818:aload           22
	//  388  820:astore          14
		obj5 = ((Object) (obj17));
	//  389  822:aload           23
	//  390  824:astore          10
		obj10 = ((Object) (obj18));
	//  391  826:aload           24
	//  392  828:astore          15
		obj2 = ((Object) (obj19));
	//  393  830:aload           25
	//  394  832:astore          7
		mURLConnection.setUseCaches(false);
	//  395  834:aload_0         
	//  396  835:getfield        #48  <Field HttpURLConnection mURLConnection>
	//  397  838:iconst_0        
	//  398  839:invokevirtual   #322 <Method void HttpURLConnection.setUseCaches(boolean)>
		obj6 = ((Object) (obj11));
	//  399  842:aload           17
	//  400  844:astore          11
		obj7 = ((Object) (obj12));
	//  401  846:aload           18
	//  402  848:astore          12
		obj8 = ((Object) (obj13));
	//  403  850:aload           19
	//  404  852:astore          13
		obj3 = ((Object) (obj14));
	//  405  854:aload           20
	//  406  856:astore          8
		obj4 = ((Object) (obj15));
	//  407  858:aload           21
	//  408  860:astore          9
		obj9 = ((Object) (obj16));
	//  409  862:aload           22
	//  410  864:astore          14
		obj5 = ((Object) (obj17));
	//  411  866:aload           23
	//  412  868:astore          10
		obj10 = ((Object) (obj18));
	//  413  870:aload           24
	//  414  872:astore          15
		obj2 = ((Object) (obj19));
	//  415  874:aload           25
	//  416  876:astore          7
		mURLConnection.setRequestProperty("User-Agent", mGLMapEngine.getUserAgent());
	//  417  878:aload_0         
	//  418  879:getfield        #48  <Field HttpURLConnection mURLConnection>
	//  419  882:ldc2            #324 <String "User-Agent">
	//  420  885:aload_0         
	//  421  886:getfield        #62  <Field GLMapEngine mGLMapEngine>
	//  422  889:invokevirtual   #327 <Method String GLMapEngine.getUserAgent()>
	//  423  892:invokevirtual   #81  <Method void HttpURLConnection.setRequestProperty(String, String)>
		obj6 = ((Object) (obj11));
	//  424  895:aload           17
	//  425  897:astore          11
		obj7 = ((Object) (obj12));
	//  426  899:aload           18
	//  427  901:astore          12
		obj8 = ((Object) (obj13));
	//  428  903:aload           19
	//  429  905:astore          13
		obj3 = ((Object) (obj14));
	//  430  907:aload           20
	//  431  909:astore          8
		obj4 = ((Object) (obj15));
	//  432  911:aload           21
	//  433  913:astore          9
		obj9 = ((Object) (obj16));
	//  434  915:aload           22
	//  435  917:astore          14
		obj5 = ((Object) (obj17));
	//  436  919:aload           23
	//  437  921:astore          10
		obj10 = ((Object) (obj18));
	//  438  923:aload           24
	//  439  925:astore          15
		obj2 = ((Object) (obj19));
	//  440  927:aload           25
	//  441  929:astore          7
		obj = ((Object) (s.getBytes("UTF-8")));
	//  442  931:aload           27
	//  443  933:ldc1            #163 <String "UTF-8">
	//  444  935:invokevirtual   #331 <Method byte[] String.getBytes(String)>
	//  445  938:astore          6
		obj6 = ((Object) (obj11));
	//  446  940:aload           17
	//  447  942:astore          11
		obj7 = ((Object) (obj12));
	//  448  944:aload           18
	//  449  946:astore          12
		obj8 = ((Object) (obj13));
	//  450  948:aload           19
	//  451  950:astore          13
		obj3 = ((Object) (obj14));
	//  452  952:aload           20
	//  453  954:astore          8
		obj4 = ((Object) (obj15));
	//  454  956:aload           21
	//  455  958:astore          9
		obj9 = ((Object) (obj16));
	//  456  960:aload           22
	//  457  962:astore          14
		obj5 = ((Object) (obj17));
	//  458  964:aload           23
	//  459  966:astore          10
		obj10 = ((Object) (obj18));
	//  460  968:aload           24
	//  461  970:astore          15
		obj2 = ((Object) (obj19));
	//  462  972:aload           25
	//  463  974:astore          7
		obj20 = ((Object) (mURLConnection.getOutputStream()));
	//  464  976:aload_0         
	//  465  977:getfield        #48  <Field HttpURLConnection mURLConnection>
	//  466  980:invokevirtual   #335 <Method OutputStream HttpURLConnection.getOutputStream()>
	//  467  983:astore          26
		obj6 = ((Object) (obj11));
	//  468  985:aload           17
	//  469  987:astore          11
		obj7 = ((Object) (obj12));
	//  470  989:aload           18
	//  471  991:astore          12
		obj8 = ((Object) (obj13));
	//  472  993:aload           19
	//  473  995:astore          13
		obj3 = ((Object) (obj14));
	//  474  997:aload           20
	//  475  999:astore          8
		obj4 = ((Object) (obj15));
	//  476 1001:aload           21
	//  477 1003:astore          9
		obj9 = ((Object) (obj16));
	//  478 1005:aload           22
	//  479 1007:astore          14
		obj5 = ((Object) (obj17));
	//  480 1009:aload           23
	//  481 1011:astore          10
		obj10 = ((Object) (obj18));
	//  482 1013:aload           24
	//  483 1015:astore          15
		obj2 = ((Object) (obj19));
	//  484 1017:aload           25
	//  485 1019:astore          7
		((OutputStream) (obj20)).write(((byte []) (obj)));
	//  486 1021:aload           26
	//  487 1023:aload           6
	//  488 1025:invokevirtual   #341 <Method void OutputStream.write(byte[])>
		obj6 = ((Object) (obj11));
	//  489 1028:aload           17
	//  490 1030:astore          11
		obj7 = ((Object) (obj12));
	//  491 1032:aload           18
	//  492 1034:astore          12
		obj8 = ((Object) (obj13));
	//  493 1036:aload           19
	//  494 1038:astore          13
		obj3 = ((Object) (obj14));
	//  495 1040:aload           20
	//  496 1042:astore          8
		obj4 = ((Object) (obj15));
	//  497 1044:aload           21
	//  498 1046:astore          9
		obj9 = ((Object) (obj16));
	//  499 1048:aload           22
	//  500 1050:astore          14
		obj5 = ((Object) (obj17));
	//  501 1052:aload           23
	//  502 1054:astore          10
		obj10 = ((Object) (obj18));
	//  503 1056:aload           24
	//  504 1058:astore          15
		obj2 = ((Object) (obj19));
	//  505 1060:aload           25
	//  506 1062:astore          7
		((OutputStream) (obj20)).flush();
	//  507 1064:aload           26
	//  508 1066:invokevirtual   #344 <Method void OutputStream.flush()>
		obj6 = ((Object) (obj11));
	//  509 1069:aload           17
	//  510 1071:astore          11
		obj7 = ((Object) (obj12));
	//  511 1073:aload           18
	//  512 1075:astore          12
		obj8 = ((Object) (obj13));
	//  513 1077:aload           19
	//  514 1079:astore          13
		obj3 = ((Object) (obj14));
	//  515 1081:aload           20
	//  516 1083:astore          8
		obj4 = ((Object) (obj15));
	//  517 1085:aload           21
	//  518 1087:astore          9
		obj9 = ((Object) (obj16));
	//  519 1089:aload           22
	//  520 1091:astore          14
		obj5 = ((Object) (obj17));
	//  521 1093:aload           23
	//  522 1095:astore          10
		obj10 = ((Object) (obj18));
	//  523 1097:aload           24
	//  524 1099:astore          15
		obj2 = ((Object) (obj19));
	//  525 1101:aload           25
	//  526 1103:astore          7
		((OutputStream) (obj20)).close();
	//  527 1105:aload           26
	//  528 1107:invokevirtual   #347 <Method void OutputStream.close()>
		obj6 = ((Object) (obj11));
	//  529 1110:aload           17
	//  530 1112:astore          11
		obj7 = ((Object) (obj12));
	//  531 1114:aload           18
	//  532 1116:astore          12
		obj8 = ((Object) (obj13));
	//  533 1118:aload           19
	//  534 1120:astore          13
		obj3 = ((Object) (obj14));
	//  535 1122:aload           20
	//  536 1124:astore          8
		obj4 = ((Object) (obj15));
	//  537 1126:aload           21
	//  538 1128:astore          9
		obj9 = ((Object) (obj16));
	//  539 1130:aload           22
	//  540 1132:astore          14
		obj5 = ((Object) (obj17));
	//  541 1134:aload           23
	//  542 1136:astore          10
		obj10 = ((Object) (obj18));
	//  543 1138:aload           24
	//  544 1140:astore          15
		obj2 = ((Object) (obj19));
	//  545 1142:aload           25
	//  546 1144:astore          7
		mURLConnection.connect();
	//  547 1146:aload_0         
	//  548 1147:getfield        #48  <Field HttpURLConnection mURLConnection>
	//  549 1150:invokevirtual   #350 <Method void HttpURLConnection.connect()>
		obj6 = ((Object) (obj11));
	//  550 1153:aload           17
	//  551 1155:astore          11
		obj7 = ((Object) (obj12));
	//  552 1157:aload           18
	//  553 1159:astore          12
		obj8 = ((Object) (obj13));
	//  554 1161:aload           19
	//  555 1163:astore          13
		obj3 = ((Object) (obj14));
	//  556 1165:aload           20
	//  557 1167:astore          8
		obj4 = ((Object) (obj15));
	//  558 1169:aload           21
	//  559 1171:astore          9
		obj9 = ((Object) (obj16));
	//  560 1173:aload           22
	//  561 1175:astore          14
		obj5 = ((Object) (obj17));
	//  562 1177:aload           23
	//  563 1179:astore          10
		obj10 = ((Object) (obj18));
	//  564 1181:aload           24
	//  565 1183:astore          15
		obj2 = ((Object) (obj19));
	//  566 1185:aload           25
	//  567 1187:astore          7
		boolean flag1 = mRequestCancel;
	//  568 1189:aload_0         
	//  569 1190:getfield        #52  <Field boolean mRequestCancel>
	//  570 1193:istore          4
		if(flag1)
	//* 571 1195:iload           4
	//* 572 1197:ifeq            1205
		{
			doCancel();
	//  573 1200:aload_0         
	//  574 1201:invokevirtual   #352 <Method void doCancel()>
			return;
	//  575 1204:return          
		}
		obj6 = ((Object) (obj11));
	//  576 1205:aload           17
	//  577 1207:astore          11
		obj7 = ((Object) (obj12));
	//  578 1209:aload           18
	//  579 1211:astore          12
		obj8 = ((Object) (obj13));
	//  580 1213:aload           19
	//  581 1215:astore          13
		obj3 = ((Object) (obj14));
	//  582 1217:aload           20
	//  583 1219:astore          8
		obj4 = ((Object) (obj15));
	//  584 1221:aload           21
	//  585 1223:astore          9
		obj9 = ((Object) (obj16));
	//  586 1225:aload           22
	//  587 1227:astore          14
		obj5 = ((Object) (obj17));
	//  588 1229:aload           23
	//  589 1231:astore          10
		obj10 = ((Object) (obj18));
	//  590 1233:aload           24
	//  591 1235:astore          15
		obj2 = ((Object) (obj19));
	//  592 1237:aload           25
	//  593 1239:astore          7
		int i = mURLConnection.getResponseCode();
	//  594 1241:aload_0         
	//  595 1242:getfield        #48  <Field HttpURLConnection mURLConnection>
	//  596 1245:invokevirtual   #355 <Method int HttpURLConnection.getResponseCode()>
	//  597 1248:istore_1        
		obj6 = ((Object) (obj11));
	//  598 1249:aload           17
	//  599 1251:astore          11
		obj7 = ((Object) (obj12));
	//  600 1253:aload           18
	//  601 1255:astore          12
		obj8 = ((Object) (obj13));
	//  602 1257:aload           19
	//  603 1259:astore          13
		obj3 = ((Object) (obj14));
	//  604 1261:aload           20
	//  605 1263:astore          8
		obj4 = ((Object) (obj15));
	//  606 1265:aload           21
	//  607 1267:astore          9
		obj9 = ((Object) (obj16));
	//  608 1269:aload           22
	//  609 1271:astore          14
		obj5 = ((Object) (obj17));
	//  610 1273:aload           23
	//  611 1275:astore          10
		obj10 = ((Object) (obj18));
	//  612 1277:aload           24
	//  613 1279:astore          15
		obj2 = ((Object) (obj19));
	//  614 1281:aload           25
	//  615 1283:astore          7
		flag1 = mRequestCancel;
	//  616 1285:aload_0         
	//  617 1286:getfield        #52  <Field boolean mRequestCancel>
	//  618 1289:istore          4
		if(flag1)
	//* 619 1291:iload           4
	//* 620 1293:ifeq            1301
		{
			doCancel();
	//  621 1296:aload_0         
	//  622 1297:invokevirtual   #352 <Method void doCancel()>
			return;
	//  623 1300:return          
		}
		if(i != 200)
			break MISSING_BLOCK_LABEL_1663;
	//  624 1301:iload_1         
	//  625 1302:sipush          200
	//  626 1305:icmpne          1663
		i = 0;
	//  627 1308:iconst_0        
	//  628 1309:istore_1        
		obj6 = ((Object) (obj11));
	//  629 1310:aload           17
	//  630 1312:astore          11
		obj7 = ((Object) (obj12));
	//  631 1314:aload           18
	//  632 1316:astore          12
		obj8 = ((Object) (obj13));
	//  633 1318:aload           19
	//  634 1320:astore          13
		obj3 = ((Object) (obj14));
	//  635 1322:aload           20
	//  636 1324:astore          8
		obj4 = ((Object) (obj15));
	//  637 1326:aload           21
	//  638 1328:astore          9
		obj9 = ((Object) (obj16));
	//  639 1330:aload           22
	//  640 1332:astore          14
		obj5 = ((Object) (obj17));
	//  641 1334:aload           23
	//  642 1336:astore          10
		obj10 = ((Object) (obj18));
	//  643 1338:aload           24
	//  644 1340:astore          15
		obj2 = ((Object) (obj19));
	//  645 1342:aload           25
	//  646 1344:astore          7
		obj = ((Object) (mURLConnection.getInputStream()));
	//  647 1346:aload_0         
	//  648 1347:getfield        #48  <Field HttpURLConnection mURLConnection>
	//  649 1350:invokevirtual   #359 <Method InputStream HttpURLConnection.getInputStream()>
	//  650 1353:astore          6
		obj6 = obj;
	//  651 1355:aload           6
	//  652 1357:astore          11
		obj7 = obj;
	//  653 1359:aload           6
	//  654 1361:astore          12
		obj8 = obj;
	//  655 1363:aload           6
	//  656 1365:astore          13
		obj3 = obj;
	//  657 1367:aload           6
	//  658 1369:astore          8
		obj4 = obj;
	//  659 1371:aload           6
	//  660 1373:astore          9
		obj9 = obj;
	//  661 1375:aload           6
	//  662 1377:astore          14
		obj5 = obj;
	//  663 1379:aload           6
	//  664 1381:astore          10
		obj10 = obj;
	//  665 1383:aload           6
	//  666 1385:astore          15
		obj2 = obj;
	//  667 1387:aload           6
	//  668 1389:astore          7
		abyte0 = new byte[512];
	//  669 1391:sipush          512
	//  670 1394:newarray        byte[]
	//  671 1396:astore          16
		obj6 = obj;
	//  672 1398:aload           6
	//  673 1400:astore          11
		obj7 = obj;
	//  674 1402:aload           6
	//  675 1404:astore          12
		obj8 = obj;
	//  676 1406:aload           6
	//  677 1408:astore          13
		obj3 = obj;
	//  678 1410:aload           6
	//  679 1412:astore          8
		obj4 = obj;
	//  680 1414:aload           6
	//  681 1416:astore          9
		obj9 = obj;
	//  682 1418:aload           6
	//  683 1420:astore          14
		obj5 = obj;
	//  684 1422:aload           6
	//  685 1424:astore          10
		obj10 = obj;
	//  686 1426:aload           6
	//  687 1428:astore          15
		obj2 = obj;
	//  688 1430:aload           6
	//  689 1432:astore          7
		if(mRequestCancel)
	//* 690 1434:aload_0         
	//* 691 1435:getfield        #52  <Field boolean mRequestCancel>
	//* 692 1438:ifeq            1443
			i = 1;
	//  693 1441:iconst_1        
	//  694 1442:istore_1        
_L2:
		int j;
		j = i;
	//  695 1443:iload_1         
	//  696 1444:istore_2        
		if(i != 0)
			break MISSING_BLOCK_LABEL_1602;
	//  697 1445:iload_1         
	//  698 1446:ifne            1602
		obj6 = obj;
	//  699 1449:aload           6
	//  700 1451:astore          11
		obj7 = obj;
	//  701 1453:aload           6
	//  702 1455:astore          12
		obj8 = obj;
	//  703 1457:aload           6
	//  704 1459:astore          13
		obj3 = obj;
	//  705 1461:aload           6
	//  706 1463:astore          8
		obj4 = obj;
	//  707 1465:aload           6
	//  708 1467:astore          9
		obj9 = obj;
	//  709 1469:aload           6
	//  710 1471:astore          14
		obj5 = obj;
	//  711 1473:aload           6
	//  712 1475:astore          10
		obj10 = obj;
	//  713 1477:aload           6
	//  714 1479:astore          15
		obj2 = obj;
	//  715 1481:aload           6
	//  716 1483:astore          7
		int k = ((InputStream) (obj)).read(abyte0);
	//  717 1485:aload           6
	//  718 1487:aload           16
	//  719 1489:invokevirtual   #365 <Method int InputStream.read(byte[])>
	//  720 1492:istore_3        
		j = i;
	//  721 1493:iload_1         
	//  722 1494:istore_2        
		if(k <= -1)
			break MISSING_BLOCK_LABEL_1602;
	//  723 1495:iload_3         
	//  724 1496:iconst_m1       
	//  725 1497:icmple          1602
		obj6 = obj;
	//  726 1500:aload           6
	//  727 1502:astore          11
		obj7 = obj;
	//  728 1504:aload           6
	//  729 1506:astore          12
		obj8 = obj;
	//  730 1508:aload           6
	//  731 1510:astore          13
		obj3 = obj;
	//  732 1512:aload           6
	//  733 1514:astore          8
		obj4 = obj;
	//  734 1516:aload           6
	//  735 1518:astore          9
		obj9 = obj;
	//  736 1520:aload           6
	//  737 1522:astore          14
		obj5 = obj;
	//  738 1524:aload           6
	//  739 1526:astore          10
		obj10 = obj;
	//  740 1528:aload           6
	//  741 1530:astore          15
		obj2 = obj;
	//  742 1532:aload           6
	//  743 1534:astore          7
		mGLMapEngine.receiveNetData(mEngineID, mDataRequestParam.handler, abyte0, k);
	//  744 1536:aload_0         
	//  745 1537:getfield        #62  <Field GLMapEngine mGLMapEngine>
	//  746 1540:aload_0         
	//  747 1541:getfield        #46  <Field int mEngineID>
	//  748 1544:aload_0         
	//  749 1545:getfield        #60  <Field AMapLoader$ADataRequestParam mDataRequestParam>
	//  750 1548:getfield        #225 <Field long AMapLoader$ADataRequestParam.handler>
	//  751 1551:aload           16
	//  752 1553:iload_3         
	//  753 1554:invokevirtual   #369 <Method void GLMapEngine.receiveNetData(int, long, byte[], int)>
		obj6 = obj;
	//  754 1557:aload           6
	//  755 1559:astore          11
		obj7 = obj;
	//  756 1561:aload           6
	//  757 1563:astore          12
		obj8 = obj;
	//  758 1565:aload           6
	//  759 1567:astore          13
		obj3 = obj;
	//  760 1569:aload           6
	//  761 1571:astore          8
		obj4 = obj;
	//  762 1573:aload           6
	//  763 1575:astore          9
		obj9 = obj;
	//  764 1577:aload           6
	//  765 1579:astore          14
		obj5 = obj;
	//  766 1581:aload           6
	//  767 1583:astore          10
		obj10 = obj;
	//  768 1585:aload           6
	//  769 1587:astore          15
		obj2 = obj;
	//  770 1589:aload           6
	//  771 1591:astore          7
		if(!mRequestCancel) goto _L2; else goto _L1
	//  772 1593:aload_0         
	//  773 1594:getfield        #52  <Field boolean mRequestCancel>
	//  774 1597:ifeq            1443
_L1:
		j = 1;
	//  775 1600:iconst_1        
	//  776 1601:istore_2        
		if(j != 0)
			break MISSING_BLOCK_LABEL_1722;
	//  777 1602:iload_2         
	//  778 1603:ifne            2058
		obj6 = obj;
	//  779 1606:aload           6
	//  780 1608:astore          11
		obj7 = obj;
	//  781 1610:aload           6
	//  782 1612:astore          12
		obj8 = obj;
	//  783 1614:aload           6
	//  784 1616:astore          13
		obj3 = obj;
	//  785 1618:aload           6
	//  786 1620:astore          8
		obj4 = obj;
	//  787 1622:aload           6
	//  788 1624:astore          9
		obj9 = obj;
	//  789 1626:aload           6
	//  790 1628:astore          14
		obj5 = obj;
	//  791 1630:aload           6
	//  792 1632:astore          10
		obj10 = obj;
	//  793 1634:aload           6
	//  794 1636:astore          15
		obj2 = obj;
	//  795 1638:aload           6
	//  796 1640:astore          7
		mGLMapEngine.finishDownLoad(mEngineID, mDataRequestParam.handler);
	//  797 1642:aload_0         
	//  798 1643:getfield        #62  <Field GLMapEngine mGLMapEngine>
	//  799 1646:aload_0         
	//  800 1647:getfield        #46  <Field int mEngineID>
	//  801 1650:aload_0         
	//  802 1651:getfield        #60  <Field AMapLoader$ADataRequestParam mDataRequestParam>
	//  803 1654:getfield        #225 <Field long AMapLoader$ADataRequestParam.handler>
	//  804 1657:invokevirtual   #373 <Method void GLMapEngine.finishDownLoad(int, long)>
		break MISSING_BLOCK_LABEL_1722;
	//  805 1660:goto            2058
		obj6 = ((Object) (obj11));
	//  806 1663:aload           17
	//  807 1665:astore          11
		obj7 = ((Object) (obj12));
	//  808 1667:aload           18
	//  809 1669:astore          12
		obj8 = ((Object) (obj13));
	//  810 1671:aload           19
	//  811 1673:astore          13
		obj3 = ((Object) (obj14));
	//  812 1675:aload           20
	//  813 1677:astore          8
		obj4 = ((Object) (obj15));
	//  814 1679:aload           21
	//  815 1681:astore          9
		obj9 = ((Object) (obj16));
	//  816 1683:aload           22
	//  817 1685:astore          14
		obj5 = ((Object) (obj17));
	//  818 1687:aload           23
	//  819 1689:astore          10
		obj10 = ((Object) (obj18));
	//  820 1691:aload           24
	//  821 1693:astore          15
		obj2 = ((Object) (obj19));
	//  822 1695:aload           25
	//  823 1697:astore          7
		mGLMapEngine.netError(mEngineID, mDataRequestParam.handler, i);
	//  824 1699:aload_0         
	//  825 1700:getfield        #62  <Field GLMapEngine mGLMapEngine>
	//  826 1703:aload_0         
	//  827 1704:getfield        #46  <Field int mEngineID>
	//  828 1707:aload_0         
	//  829 1708:getfield        #60  <Field AMapLoader$ADataRequestParam mDataRequestParam>
	//  830 1711:getfield        #225 <Field long AMapLoader$ADataRequestParam.handler>
	//  831 1714:iload_1         
	//  832 1715:invokevirtual   #377 <Method void GLMapEngine.netError(int, long, int)>
		obj = ((Object) (abyte0));
	//  833 1718:aload           16
	//  834 1720:astore          6
		doCancel();
	//  835 1722:aload_0         
	//  836 1723:invokevirtual   #352 <Method void doCancel()>
		if(obj != null)
	//* 837 1726:aload           6
	//* 838 1728:ifnull          2057
			try
			{
				((InputStream) (obj)).close();
	//  839 1731:aload           6
	//  840 1733:invokevirtual   #378 <Method void InputStream.close()>
				return;
	//  841 1736:return          
			}
			catch(IOException ioexception)
	//* 842 1737:astore          6
			{
				return;
	//  843 1739:return          
			}
			catch(ArrayIndexOutOfBoundsException arrayindexoutofboundsexception)
	//* 844 1740:astore          6
			{
				return;
	//  845 1742:return          
			}
			catch(NullPointerException nullpointerexception)
	//* 846 1743:astore          6
			{
				return;
	//  847 1745:return          
			}
		break MISSING_BLOCK_LABEL_2057;
		Object obj1;
		obj1;
	//  848 1746:astore          6
		doCancel();
	//  849 1748:aload_0         
	//  850 1749:invokevirtual   #352 <Method void doCancel()>
		if(obj6 != null)
	//* 851 1752:aload           11
	//* 852 1754:ifnull          2057
			try
			{
				((InputStream) (obj6)).close();
	//  853 1757:aload           11
	//  854 1759:invokevirtual   #378 <Method void InputStream.close()>
				return;
	//  855 1762:return          
			}
			// Misplaced declaration of an exception variable
			catch(Object obj1)
	//* 856 1763:astore          6
			{
				return;
	//  857 1765:return          
			}
			// Misplaced declaration of an exception variable
			catch(Object obj1)
	//* 858 1766:astore          6
			{
				return;
	//  859 1768:return          
			}
			// Misplaced declaration of an exception variable
			catch(Object obj1)
	//* 860 1769:astore          6
			{
				return;
	//  861 1771:return          
			}
		break MISSING_BLOCK_LABEL_2057;
		obj1;
	//  862 1772:astore          6
		doCancel();
	//  863 1774:aload_0         
	//  864 1775:invokevirtual   #352 <Method void doCancel()>
		if(obj7 != null)
	//* 865 1778:aload           12
	//* 866 1780:ifnull          2057
			try
			{
				((InputStream) (obj7)).close();
	//  867 1783:aload           12
	//  868 1785:invokevirtual   #378 <Method void InputStream.close()>
				return;
	//  869 1788:return          
			}
			// Misplaced declaration of an exception variable
			catch(Object obj1)
	//* 870 1789:astore          6
			{
				return;
	//  871 1791:return          
			}
			// Misplaced declaration of an exception variable
			catch(Object obj1)
	//* 872 1792:astore          6
			{
				return;
	//  873 1794:return          
			}
			// Misplaced declaration of an exception variable
			catch(Object obj1)
	//* 874 1795:astore          6
			{
				return;
	//  875 1797:return          
			}
		break MISSING_BLOCK_LABEL_2057;
		obj1;
	//  876 1798:astore          6
		doCancel();
	//  877 1800:aload_0         
	//  878 1801:invokevirtual   #352 <Method void doCancel()>
		if(obj8 != null)
	//* 879 1804:aload           13
	//* 880 1806:ifnull          2057
			try
			{
				((InputStream) (obj8)).close();
	//  881 1809:aload           13
	//  882 1811:invokevirtual   #378 <Method void InputStream.close()>
				return;
	//  883 1814:return          
			}
			// Misplaced declaration of an exception variable
			catch(Object obj1)
	//* 884 1815:astore          6
			{
				return;
	//  885 1817:return          
			}
			// Misplaced declaration of an exception variable
			catch(Object obj1)
	//* 886 1818:astore          6
			{
				return;
	//  887 1820:return          
			}
			// Misplaced declaration of an exception variable
			catch(Object obj1)
	//* 888 1821:astore          6
			{
				return;
	//  889 1823:return          
			}
		break MISSING_BLOCK_LABEL_2057;
		obj1;
	//  890 1824:astore          6
		obj2 = obj3;
	//  891 1826:aload           8
	//  892 1828:astore          7
		mGLMapEngine.netError(mEngineID, mDataRequestParam.handler, -1);
	//  893 1830:aload_0         
	//  894 1831:getfield        #62  <Field GLMapEngine mGLMapEngine>
	//  895 1834:aload_0         
	//  896 1835:getfield        #46  <Field int mEngineID>
	//  897 1838:aload_0         
	//  898 1839:getfield        #60  <Field AMapLoader$ADataRequestParam mDataRequestParam>
	//  899 1842:getfield        #225 <Field long AMapLoader$ADataRequestParam.handler>
	//  900 1845:iconst_m1       
	//  901 1846:invokevirtual   #377 <Method void GLMapEngine.netError(int, long, int)>
		doCancel();
	//  902 1849:aload_0         
	//  903 1850:invokevirtual   #352 <Method void doCancel()>
		if(obj3 != null)
	//* 904 1853:aload           8
	//* 905 1855:ifnull          2057
			try
			{
				((InputStream) (obj3)).close();
	//  906 1858:aload           8
	//  907 1860:invokevirtual   #378 <Method void InputStream.close()>
				return;
	//  908 1863:return          
			}
			// Misplaced declaration of an exception variable
			catch(Object obj1)
	//* 909 1864:astore          6
			{
				return;
	//  910 1866:return          
			}
			// Misplaced declaration of an exception variable
			catch(Object obj1)
	//* 911 1867:astore          6
			{
				return;
	//  912 1869:return          
			}
			// Misplaced declaration of an exception variable
			catch(Object obj1)
	//* 913 1870:astore          6
			{
				return;
	//  914 1872:return          
			}
		break MISSING_BLOCK_LABEL_2057;
		obj1;
	//  915 1873:astore          6
		obj2 = obj4;
	//  916 1875:aload           9
	//  917 1877:astore          7
		mGLMapEngine.netError(mEngineID, mDataRequestParam.handler, -1);
	//  918 1879:aload_0         
	//  919 1880:getfield        #62  <Field GLMapEngine mGLMapEngine>
	//  920 1883:aload_0         
	//  921 1884:getfield        #46  <Field int mEngineID>
	//  922 1887:aload_0         
	//  923 1888:getfield        #60  <Field AMapLoader$ADataRequestParam mDataRequestParam>
	//  924 1891:getfield        #225 <Field long AMapLoader$ADataRequestParam.handler>
	//  925 1894:iconst_m1       
	//  926 1895:invokevirtual   #377 <Method void GLMapEngine.netError(int, long, int)>
		doCancel();
	//  927 1898:aload_0         
	//  928 1899:invokevirtual   #352 <Method void doCancel()>
		if(obj4 != null)
	//* 929 1902:aload           9
	//* 930 1904:ifnull          2057
			try
			{
				((InputStream) (obj4)).close();
	//  931 1907:aload           9
	//  932 1909:invokevirtual   #378 <Method void InputStream.close()>
				return;
	//  933 1912:return          
			}
			// Misplaced declaration of an exception variable
			catch(Object obj1)
	//* 934 1913:astore          6
			{
				return;
	//  935 1915:return          
			}
			// Misplaced declaration of an exception variable
			catch(Object obj1)
	//* 936 1916:astore          6
			{
				return;
	//  937 1918:return          
			}
			// Misplaced declaration of an exception variable
			catch(Object obj1)
	//* 938 1919:astore          6
			{
				return;
	//  939 1921:return          
			}
		break MISSING_BLOCK_LABEL_2057;
		obj1;
	//  940 1922:astore          6
		doCancel();
	//  941 1924:aload_0         
	//  942 1925:invokevirtual   #352 <Method void doCancel()>
		if(obj9 != null)
	//* 943 1928:aload           14
	//* 944 1930:ifnull          2057
			try
			{
				((InputStream) (obj9)).close();
	//  945 1933:aload           14
	//  946 1935:invokevirtual   #378 <Method void InputStream.close()>
				return;
	//  947 1938:return          
			}
			// Misplaced declaration of an exception variable
			catch(Object obj1)
	//* 948 1939:astore          6
			{
				return;
	//  949 1941:return          
			}
			// Misplaced declaration of an exception variable
			catch(Object obj1)
	//* 950 1942:astore          6
			{
				return;
	//  951 1944:return          
			}
			// Misplaced declaration of an exception variable
			catch(Object obj1)
	//* 952 1945:astore          6
			{
				return;
	//  953 1947:return          
			}
		break MISSING_BLOCK_LABEL_2057;
		obj1;
	//  954 1948:astore          6
		obj2 = obj5;
	//  955 1950:aload           10
	//  956 1952:astore          7
		mGLMapEngine.netError(mEngineID, mDataRequestParam.handler, -1);
	//  957 1954:aload_0         
	//  958 1955:getfield        #62  <Field GLMapEngine mGLMapEngine>
	//  959 1958:aload_0         
	//  960 1959:getfield        #46  <Field int mEngineID>
	//  961 1962:aload_0         
	//  962 1963:getfield        #60  <Field AMapLoader$ADataRequestParam mDataRequestParam>
	//  963 1966:getfield        #225 <Field long AMapLoader$ADataRequestParam.handler>
	//  964 1969:iconst_m1       
	//  965 1970:invokevirtual   #377 <Method void GLMapEngine.netError(int, long, int)>
		doCancel();
	//  966 1973:aload_0         
	//  967 1974:invokevirtual   #352 <Method void doCancel()>
		if(obj5 != null)
	//* 968 1977:aload           10
	//* 969 1979:ifnull          2057
			try
			{
				((InputStream) (obj5)).close();
	//  970 1982:aload           10
	//  971 1984:invokevirtual   #378 <Method void InputStream.close()>
				return;
	//  972 1987:return          
			}
			// Misplaced declaration of an exception variable
			catch(Object obj1)
	//* 973 1988:astore          6
			{
				return;
	//  974 1990:return          
			}
			// Misplaced declaration of an exception variable
			catch(Object obj1)
	//* 975 1991:astore          6
			{
				return;
	//  976 1993:return          
			}
			// Misplaced declaration of an exception variable
			catch(Object obj1)
	//* 977 1994:astore          6
			{
				return;
	//  978 1996:return          
			}
		break MISSING_BLOCK_LABEL_2057;
		obj1;
	//  979 1997:astore          6
		doCancel();
	//  980 1999:aload_0         
	//  981 2000:invokevirtual   #352 <Method void doCancel()>
		if(obj10 != null)
	//* 982 2003:aload           15
	//* 983 2005:ifnull          2057
			try
			{
				((InputStream) (obj10)).close();
	//  984 2008:aload           15
	//  985 2010:invokevirtual   #378 <Method void InputStream.close()>
				return;
	//  986 2013:return          
			}
			// Misplaced declaration of an exception variable
			catch(Object obj1)
	//* 987 2014:astore          6
			{
				return;
	//  988 2016:return          
			}
			// Misplaced declaration of an exception variable
			catch(Object obj1)
	//* 989 2017:astore          6
			{
				return;
	//  990 2019:return          
			}
			// Misplaced declaration of an exception variable
			catch(Object obj1)
	//* 991 2020:astore          6
			{
				return;
	//  992 2022:return          
			}
		break MISSING_BLOCK_LABEL_2057;
		obj1;
	//  993 2023:astore          6
		doCancel();
	//  994 2025:aload_0         
	//  995 2026:invokevirtual   #352 <Method void doCancel()>
		if(obj2 != null)
	//* 996 2029:aload           7
	//* 997 2031:ifnull          2054
			try
			{
				((InputStream) (obj2)).close();
	//  998 2034:aload           7
	//  999 2036:invokevirtual   #378 <Method void InputStream.close()>
			}
	//*1000 2039:goto            2054
			catch(IOException ioexception1) { }
	// 1001 2042:astore          7
	//*1002 2044:goto            2054
			catch(ArrayIndexOutOfBoundsException arrayindexoutofboundsexception1) { }
	// 1003 2047:astore          7
	//*1004 2049:goto            2054
			catch(NullPointerException nullpointerexception1) { }
	// 1005 2052:astore          7
		throw obj1;
	// 1006 2054:aload           6
	// 1007 2056:athrow          
	// 1008 2057:return          
	//*1009 2058:goto            1722
	}

	public String getDeviceId(Context context)
	{
		if(context != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          9
			return gt.t(context);
	//    2    4:aload_1         
	//    3    5:invokestatic    #384 <Method String gt.t(Context)>
	//    4    8:areturn         
		else
			return null;
	//    5    9:aconst_null     
	//    6   10:areturn         
	}

	protected String getRequestParams(String s, boolean flag, int i)
	{
		if(mDiu == null)
	//*   0    0:getstatic       #386 <Field String mDiu>
	//*   1    3:ifnonnull       20
			mDiu = getDeviceId(mGLMapEngine.getContext());
	//    2    6:aload_0         
	//    3    7:aload_0         
	//    4    8:getfield        #62  <Field GLMapEngine mGLMapEngine>
	//    5   11:invokevirtual   #94  <Method Context GLMapEngine.getContext()>
	//    6   14:invokevirtual   #388 <Method String getDeviceId(Context)>
	//    7   17:putstatic       #386 <Field String mDiu>
		s = ((String) (new StringBuffer(s)));
	//    8   20:new             #85  <Class StringBuffer>
	//    9   23:dup             
	//   10   24:aload_1         
	//   11   25:invokespecial   #88  <Method void StringBuffer(String)>
	//   12   28:astore_1        
		if(flag)
	//*  13   29:iload_2         
	//*  14   30:ifeq            58
		{
			((StringBuffer) (s)).append("&channel=amap7&div=GNaviMap");
	//   15   33:aload_1         
	//   16   34:ldc2            #390 <String "&channel=amap7&div=GNaviMap">
	//   17   37:invokevirtual   #106 <Method StringBuffer StringBuffer.append(String)>
	//   18   40:pop             
			((StringBuffer) (s)).append("&diu=").append(mDiu);
	//   19   41:aload_1         
	//   20   42:ldc2            #392 <String "&diu=">
	//   21   45:invokevirtual   #106 <Method StringBuffer StringBuffer.append(String)>
	//   22   48:getstatic       #386 <Field String mDiu>
	//   23   51:invokevirtual   #106 <Method StringBuffer StringBuffer.append(String)>
	//   24   54:pop             
		} else
	//*  25   55:goto            88
		{
			((StringBuffer) (s)).append("&channel=amapapi");
	//   26   58:aload_1         
	//   27   59:ldc2            #394 <String "&channel=amapapi">
	//   28   62:invokevirtual   #106 <Method StringBuffer StringBuffer.append(String)>
	//   29   65:pop             
			((StringBuffer) (s)).append("&div=GNaviMap");
	//   30   66:aload_1         
	//   31   67:ldc2            #396 <String "&div=GNaviMap">
	//   32   70:invokevirtual   #106 <Method StringBuffer StringBuffer.append(String)>
	//   33   73:pop             
			((StringBuffer) (s)).append("&diu=").append(mDiu);
	//   34   74:aload_1         
	//   35   75:ldc2            #392 <String "&diu=">
	//   36   78:invokevirtual   #106 <Method StringBuffer StringBuffer.append(String)>
	//   37   81:getstatic       #386 <Field String mDiu>
	//   38   84:invokevirtual   #106 <Method StringBuffer StringBuffer.append(String)>
	//   39   87:pop             
		}
		return ((StringBuffer) (s)).toString();
	//   40   88:aload_1         
	//   41   89:invokevirtual   #110 <Method String StringBuffer.toString()>
	//   42   92:areturn         
	}

	private static final String AMAP_HOST_KEY = "targetHost";
	private static final int CIFA_UPLOAD_TIMELIMIT = 60000;
	private static final int CONNECTION_TIMEOUT = 20000;
	private static final int GET_METHOD = 0;
	private static String mDiu;
	private static long mLastRecordTime = 0L;
	private volatile boolean isCanceled;
	public boolean isFinish;
	ADataRequestParam mDataRequestParam;
	private int mEngineID;
	GLMapEngine mGLMapEngine;
	private boolean mRequestCancel;
	private HttpURLConnection mURLConnection;
	private String oriHost;

	static 
	{
		mLastRecordTime = 0L;
	//    0    0:lconst_0        
	//    1    1:putstatic       #39  <Field long mLastRecordTime>
	//*   2    4:return          
	}
}

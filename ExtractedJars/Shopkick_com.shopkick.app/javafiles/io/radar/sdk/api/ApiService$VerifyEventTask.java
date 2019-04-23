// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package io.radar.sdk.api;

import android.net.Uri;
import android.os.AsyncTask;
import io.radar.sdk.internal.RadarLogger;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Map;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

// Referenced classes of package io.radar.sdk.api:
//			ApiService, ApiClientRepository

private final class ApiService$VerifyEventTask extends AsyncTask
{

	public volatile Object doInBackground(Object aobj[])
	{
		doInBackground((Map[])aobj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #66  <Class Map[]>
	//    3    5:invokevirtual   #68  <Method void doInBackground(Map[])>
		return ((Object) (Unit.INSTANCE));
	//    4    8:getstatic       #74  <Field Unit Unit.INSTANCE>
	//    5   11:areturn         
	}

	protected transient void doInBackground(Map amap[])
	{
		Intrinsics.checkParameterIsNotNull(((Object) (amap)), "params");
	//    0    0:aload_1         
	//    1    1:ldc1            #77  <String "params">
	//    2    3:invokestatic    #49  <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		try
		{
			putVerification((Map)ArraysKt.first(((Object []) (amap))));
	//    3    6:aload_0         
	//    4    7:aload_1         
	//    5    8:invokestatic    #82  <Method Object ArraysKt.first(Object[])>
	//    6   11:checkcast       #84  <Class Map>
	//    7   14:invokevirtual   #87  <Method void putVerification(Map)>
			return;
	//    8   17:return          
		}
		// Misplaced declaration of an exception variable
		catch(Map amap[])
	//*   9   18:astore_1        
		{
			RadarLogger.INSTANCE.w("Error verifying event", (Throwable)amap);
	//   10   19:getstatic       #92  <Field RadarLogger RadarLogger.INSTANCE>
	//   11   22:ldc1            #94  <String "Error verifying event">
	//   12   24:aload_1         
	//   13   25:checkcast       #96  <Class Throwable>
	//   14   28:invokevirtual   #100 <Method void RadarLogger.w(String, Throwable)>
		}
	//   15   31:return          
	}

	public final String getEventId()
	{
		return eventId;
	//    0    0:aload_0         
	//    1    1:getfield        #59  <Field String eventId>
	//    2    4:areturn         
	}

	public final String getPublishableKey()
	{
		return publishableKey;
	//    0    0:aload_0         
	//    1    1:getfield        #57  <Field String publishableKey>
	//    2    4:areturn         
	}

	public final void putVerification(Map map)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (map)), "params");
	//    0    0:aload_1         
	//    1    1:ldc1            #77  <String "params">
	//    2    3:invokestatic    #49  <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		Object obj = ((Object) (new URL(Uri.parse(ApiService.access$getApiRepository$p(ApiService.this).getRadarHost$sdk_release()).buildUpon().appendEncodedPath("v1/events").appendEncodedPath(eventId).appendEncodedPath("verification").build().toString())));
	//    3    6:new             #104 <Class URL>
	//    4    9:dup             
	//    5   10:aload_0         
	//    6   11:getfield        #52  <Field ApiService this$0>
	//    7   14:invokestatic    #108 <Method ApiClientRepository ApiService.access$getApiRepository$p(ApiService)>
	//    8   17:invokevirtual   #113 <Method String ApiClientRepository.getRadarHost$sdk_release()>
	//    9   20:invokestatic    #119 <Method Uri Uri.parse(String)>
	//   10   23:invokevirtual   #123 <Method android.net.Uri$Builder Uri.buildUpon()>
	//   11   26:ldc1            #125 <String "v1/events">
	//   12   28:invokevirtual   #131 <Method android.net.Uri$Builder android.net.Uri$Builder.appendEncodedPath(String)>
	//   13   31:aload_0         
	//   14   32:getfield        #59  <Field String eventId>
	//   15   35:invokevirtual   #131 <Method android.net.Uri$Builder android.net.Uri$Builder.appendEncodedPath(String)>
	//   16   38:ldc1            #133 <String "verification">
	//   17   40:invokevirtual   #131 <Method android.net.Uri$Builder android.net.Uri$Builder.appendEncodedPath(String)>
	//   18   43:invokevirtual   #137 <Method Uri android.net.Uri$Builder.build()>
	//   19   46:invokevirtual   #140 <Method String Uri.toString()>
	//   20   49:invokespecial   #143 <Method void URL(String)>
	//   21   52:astore_3        
		RadarLogger radarlogger = RadarLogger.INSTANCE;
	//   22   53:getstatic       #92  <Field RadarLogger RadarLogger.INSTANCE>
	//   23   56:astore          4
		StringBuilder stringbuilder = new StringBuilder();
	//   24   58:new             #145 <Class StringBuilder>
	//   25   61:dup             
	//   26   62:invokespecial   #146 <Method void StringBuilder()>
	//   27   65:astore          5
		stringbuilder.append("Sending verification: ");
	//   28   67:aload           5
	//   29   69:ldc1            #148 <String "Sending verification: ">
	//   30   71:invokevirtual   #152 <Method StringBuilder StringBuilder.append(String)>
	//   31   74:pop             
		stringbuilder.append(obj);
	//   32   75:aload           5
	//   33   77:aload_3         
	//   34   78:invokevirtual   #155 <Method StringBuilder StringBuilder.append(Object)>
	//   35   81:pop             
		stringbuilder.append("\n with params: ");
	//   36   82:aload           5
	//   37   84:ldc1            #157 <String "\n with params: ">
	//   38   86:invokevirtual   #152 <Method StringBuilder StringBuilder.append(String)>
	//   39   89:pop             
		stringbuilder.append(((Object) (map)));
	//   40   90:aload           5
	//   41   92:aload_1         
	//   42   93:invokevirtual   #155 <Method StringBuilder StringBuilder.append(Object)>
	//   43   96:pop             
		RadarLogger.v$default(radarlogger, stringbuilder.toString(), ((Throwable) (null)), 2, ((Object) (null)));
	//   44   97:aload           4
	//   45   99:aload           5
	//   46  101:invokevirtual   #158 <Method String StringBuilder.toString()>
	//   47  104:aconst_null     
	//   48  105:iconst_2        
	//   49  106:aconst_null     
	//   50  107:invokestatic    #162 <Method void RadarLogger.v$default(RadarLogger, String, Throwable, int, Object)>
		obj = ((Object) (((URL) (obj)).openConnection()));
	//   51  110:aload_3         
	//   52  111:invokevirtual   #166 <Method java.net.URLConnection URL.openConnection()>
	//   53  114:astore_3        
		if(obj != null)
	//*  54  115:aload_3         
	//*  55  116:ifnull          214
		{
			obj = ((Object) ((HttpURLConnection)obj));
	//   56  119:aload_3         
	//   57  120:checkcast       #168 <Class HttpURLConnection>
	//   58  123:astore_3        
			((HttpURLConnection) (obj)).setRequestProperty("Authorization", publishableKey);
	//   59  124:aload_3         
	//   60  125:ldc1            #170 <String "Authorization">
	//   61  127:aload_0         
	//   62  128:getfield        #57  <Field String publishableKey>
	//   63  131:invokevirtual   #173 <Method void HttpURLConnection.setRequestProperty(String, String)>
			((HttpURLConnection) (obj)).setRequestProperty("Content-Type", "application/json");
	//   64  134:aload_3         
	//   65  135:ldc1            #175 <String "Content-Type">
	//   66  137:ldc1            #177 <String "application/json">
	//   67  139:invokevirtual   #173 <Method void HttpURLConnection.setRequestProperty(String, String)>
			((HttpURLConnection) (obj)).setRequestMethod("PUT");
	//   68  142:aload_3         
	//   69  143:ldc1            #179 <String "PUT">
	//   70  145:invokevirtual   #182 <Method void HttpURLConnection.setRequestMethod(String)>
			((HttpURLConnection) (obj)).setDoOutput(true);
	//   71  148:aload_3         
	//   72  149:iconst_1        
	//   73  150:invokevirtual   #186 <Method void HttpURLConnection.setDoOutput(boolean)>
			int i = (int)5000L;
	//   74  153:ldc2w           #187 <Long 5000L>
	//   75  156:l2i             
	//   76  157:istore_2        
			((HttpURLConnection) (obj)).setConnectTimeout(i);
	//   77  158:aload_3         
	//   78  159:iload_2         
	//   79  160:invokevirtual   #192 <Method void HttpURLConnection.setConnectTimeout(int)>
			((HttpURLConnection) (obj)).setReadTimeout(i);
	//   80  163:aload_3         
	//   81  164:iload_2         
	//   82  165:invokevirtual   #195 <Method void HttpURLConnection.setReadTimeout(int)>
			OutputStreamWriter outputstreamwriter = new OutputStreamWriter(((HttpURLConnection) (obj)).getOutputStream());
	//   83  168:new             #197 <Class OutputStreamWriter>
	//   84  171:dup             
	//   85  172:aload_3         
	//   86  173:invokevirtual   #201 <Method java.io.OutputStream HttpURLConnection.getOutputStream()>
	//   87  176:invokespecial   #204 <Method void OutputStreamWriter(java.io.OutputStream)>
	//   88  179:astore          4
			outputstreamwriter.write((new JSONObject(map)).toString());
	//   89  181:aload           4
	//   90  183:new             #206 <Class JSONObject>
	//   91  186:dup             
	//   92  187:aload_1         
	//   93  188:invokespecial   #208 <Method void JSONObject(Map)>
	//   94  191:invokevirtual   #209 <Method String JSONObject.toString()>
	//   95  194:invokevirtual   #212 <Method void OutputStreamWriter.write(String)>
			outputstreamwriter.close();
	//   96  197:aload           4
	//   97  199:invokevirtual   #215 <Method void OutputStreamWriter.close()>
			((HttpURLConnection) (obj)).getInputStream().skip(0xffffffffL);
	//   98  202:aload_3         
	//   99  203:invokevirtual   #219 <Method InputStream HttpURLConnection.getInputStream()>
	//  100  206:ldc2w           #220 <Long 0xffffffffL>
	//  101  209:invokevirtual   #227 <Method long InputStream.skip(long)>
	//  102  212:pop2            
			return;
	//  103  213:return          
		} else
		{
			throw new TypeCastException("null cannot be cast to non-null type java.net.HttpURLConnection");
	//  104  214:new             #229 <Class TypeCastException>
	//  105  217:dup             
	//  106  218:ldc1            #231 <String "null cannot be cast to non-null type java.net.HttpURLConnection">
	//  107  220:invokespecial   #232 <Method void TypeCastException(String)>
	//  108  223:athrow          
		}
	}

	private final String eventId;
	private final String publishableKey;
	final ApiService this$0;

	public ApiService$VerifyEventTask(String s, String s1)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (s)), "publishableKey");
	//    0    0:aload_2         
	//    1    1:ldc1            #43  <String "publishableKey">
	//    2    3:invokestatic    #49  <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		Intrinsics.checkParameterIsNotNull(((Object) (s1)), "eventId");
	//    3    6:aload_3         
	//    4    7:ldc1            #50  <String "eventId">
	//    5    9:invokestatic    #49  <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		this$0 = ApiService.this;
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:putfield        #52  <Field ApiService this$0>
		super();
	//    9   17:aload_0         
	//   10   18:invokespecial   #55  <Method void AsyncTask()>
		publishableKey = s;
	//   11   21:aload_0         
	//   12   22:aload_2         
	//   13   23:putfield        #57  <Field String publishableKey>
		eventId = s1;
	//   14   26:aload_0         
	//   15   27:aload_3         
	//   16   28:putfield        #59  <Field String eventId>
	//   17   31:return          
	}
}

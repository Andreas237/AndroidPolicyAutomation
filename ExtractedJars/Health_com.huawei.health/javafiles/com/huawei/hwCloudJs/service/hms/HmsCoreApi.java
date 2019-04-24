// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.huawei.hwCloudJs.service.hms;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.util.Log;
import android.webkit.WebView;
import com.huawei.hms.api.*;
import com.huawei.hms.support.api.client.*;
import com.huawei.hms.support.api.entity.auth.PermissionInfo;
import com.huawei.hms.support.api.entity.auth.Scope;
import com.huawei.hms.support.api.hwid.*;
import com.huawei.hwCloudJs.core.*;
import java.lang.ref.WeakReference;
import java.util.*;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.huawei.hwCloudJs.service.hms:
//			b, a, d, f, 
//			e, c

public class HmsCoreApi extends JSRequest
	implements c
{

	public HmsCoreApi()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #41  <Method void JSRequest()>
	//    2    4:return          
	}

	private HuaweiApiClient a(Context context, boolean flag, List list)
	{
		com.huawei.hms.support.api.hwid.HuaweiIdSignInOptions.Builder builder = new com.huawei.hms.support.api.hwid.HuaweiIdSignInOptions.Builder(HuaweiIdSignInOptions.DEFAULT_SIGN_IN);
	//    0    0:new             #44  <Class com.huawei.hms.support.api.hwid.HuaweiIdSignInOptions$Builder>
	//    1    3:dup             
	//    2    4:getstatic       #50  <Field HuaweiIdSignInOptions HuaweiIdSignInOptions.DEFAULT_SIGN_IN>
	//    3    7:invokespecial   #53  <Method void com.huawei.hms.support.api.hwid.HuaweiIdSignInOptions$Builder(HuaweiIdSignInOptions)>
	//    4   10:astore          4
		if(flag)
	//*   5   12:iload_2         
	//*   6   13:ifeq            25
			builder.requestServerAuthCode();
	//    7   16:aload           4
	//    8   18:invokevirtual   #57  <Method com.huawei.hms.support.api.hwid.HuaweiIdSignInOptions$Builder com.huawei.hms.support.api.hwid.HuaweiIdSignInOptions$Builder.requestServerAuthCode()>
	//    9   21:pop             
		else
	//*  10   22:goto            34
			builder.requestAccessToken().requestOpenId();
	//   11   25:aload           4
	//   12   27:invokevirtual   #60  <Method com.huawei.hms.support.api.hwid.HuaweiIdSignInOptions$Builder com.huawei.hms.support.api.hwid.HuaweiIdSignInOptions$Builder.requestAccessToken()>
	//   13   30:invokevirtual   #63  <Method com.huawei.hms.support.api.hwid.HuaweiIdSignInOptions$Builder com.huawei.hms.support.api.hwid.HuaweiIdSignInOptions$Builder.requestOpenId()>
	//   14   33:pop             
		context = ((Context) (new com.huawei.hms.api.HuaweiApiClient.Builder(context.getApplicationContext())));
	//   15   34:new             #65  <Class com.huawei.hms.api.HuaweiApiClient$Builder>
	//   16   37:dup             
	//   17   38:aload_1         
	//   18   39:invokevirtual   #71  <Method Context Context.getApplicationContext()>
	//   19   42:invokespecial   #74  <Method void com.huawei.hms.api.HuaweiApiClient$Builder(Context)>
	//   20   45:astore_1        
		((com.huawei.hms.api.HuaweiApiClient.Builder) (context)).addApi(HuaweiId.SIGN_IN_API, ((com.huawei.hms.api.Api.ApiOptions.HasOptions) (builder.build())));
	//   21   46:aload_1         
	//   22   47:getstatic       #79  <Field Api HuaweiId.SIGN_IN_API>
	//   23   50:aload           4
	//   24   52:invokevirtual   #83  <Method HuaweiIdSignInOptions com.huawei.hms.support.api.hwid.HuaweiIdSignInOptions$Builder.build()>
	//   25   55:invokevirtual   #87  <Method com.huawei.hms.api.HuaweiApiClient$Builder com.huawei.hms.api.HuaweiApiClient$Builder.addApi(Api, com.huawei.hms.api.Api$ApiOptions$HasOptions)>
	//   26   58:pop             
		((com.huawei.hms.api.HuaweiApiClient.Builder) (context)).addApi(d);
	//   27   59:aload_1         
	//   28   60:getstatic       #38  <Field Api d>
	//   29   63:invokevirtual   #90  <Method com.huawei.hms.api.HuaweiApiClient$Builder com.huawei.hms.api.HuaweiApiClient$Builder.addApi(Api)>
	//   30   66:pop             
		if(list != null)
	//*  31   67:aload_3         
	//*  32   68:ifnull          104
			for(list = ((List) (list.iterator())); ((Iterator) (list)).hasNext(); ((com.huawei.hms.api.HuaweiApiClient.Builder) (context)).addScope((Scope)((Iterator) (list)).next()));
	//   33   71:aload_3         
	//   34   72:invokeinterface #96  <Method Iterator List.iterator()>
	//   35   77:astore_3        
	//   36   78:aload_3         
	//   37   79:invokeinterface #102 <Method boolean Iterator.hasNext()>
	//   38   84:ifeq            104
	//   39   87:aload_1         
	//   40   88:aload_3         
	//   41   89:invokeinterface #106 <Method Object Iterator.next()>
	//   42   94:checkcast       #108 <Class Scope>
	//   43   97:invokevirtual   #112 <Method com.huawei.hms.api.HuaweiApiClient$Builder com.huawei.hms.api.HuaweiApiClient$Builder.addScope(Scope)>
	//   44  100:pop             
	//*  45  101:goto            78
		return ((com.huawei.hms.api.HuaweiApiClient.Builder) (context)).build();
	//   46  104:aload_1         
	//   47  105:invokevirtual   #115 <Method HuaweiApiClient com.huawei.hms.api.HuaweiApiClient$Builder.build()>
	//   48  108:areturn         
	}

	private static List a(String s)
	{
		ArrayList arraylist = new ArrayList();
	//    0    0:new             #120 <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #121 <Method void ArrayList()>
	//    3    7:astore_3        
		if(!TextUtils.isEmpty(((CharSequence) (s))))
	//*   4    8:aload_0         
	//*   5    9:invokestatic    #127 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*   6   12:ifne            70
		{
			s = ((String) (s.split("\\,")));
	//    7   15:aload_0         
	//    8   16:ldc1            #129 <String "\\,">
	//    9   18:invokevirtual   #135 <Method String[] String.split(String)>
	//   10   21:astore_0        
			int j = s.length;
	//   11   22:aload_0         
	//   12   23:arraylength     
	//   13   24:istore_2        
			for(int i = 0; i < j; i++)
	//*  14   25:iconst_0        
	//*  15   26:istore_1        
	//*  16   27:iload_1         
	//*  17   28:iload_2         
	//*  18   29:icmpge          68
			{
				CharSequence charsequence = ((CharSequence) (s[i]));
	//   19   32:aload_0         
	//   20   33:iload_1         
	//   21   34:aaload          
	//   22   35:astore          4
				if(!TextUtils.isEmpty(charsequence))
	//*  23   37:aload           4
	//*  24   39:invokestatic    #127 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  25   42:ifne            61
					((List) (arraylist)).add(((Object) (new Scope(((String) (charsequence))))));
	//   26   45:aload_3         
	//   27   46:new             #108 <Class Scope>
	//   28   49:dup             
	//   29   50:aload           4
	//   30   52:invokespecial   #136 <Method void Scope(String)>
	//   31   55:invokeinterface #140 <Method boolean List.add(Object)>
	//   32   60:pop             
			}

	//   33   61:iload_1         
	//   34   62:iconst_1        
	//   35   63:iadd            
	//   36   64:istore_1        
	//*  37   65:goto            27
			return ((List) (arraylist));
	//   38   68:aload_3         
	//   39   69:areturn         
		} else
		{
			Log.i("HmsCoreApi", "JS scopeEmpty");
	//   40   70:ldc1            #18  <String "HmsCoreApi">
	//   41   72:ldc1            #142 <String "JS scopeEmpty">
	//   42   74:invokestatic    #148 <Method int Log.i(String, String)>
	//   43   77:pop             
			return ((List) (arraylist));
	//   44   78:aload_3         
	//   45   79:areturn         
		}
	}

	private void a(SignInResult signinresult, boolean flag, WeakReference weakreference, WeakReference weakreference1, boolean flag1, JsCallback jscallback)
	{
		if(signinresult.isSuccess())
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #155 <Method boolean SignInResult.isSuccess()>
	//*   2    4:ifeq            26
		{
			Log.i("HmsCoreApi", "JS signIn result isSuccess");
	//    3    7:ldc1            #18  <String "HmsCoreApi">
	//    4    9:ldc1            #157 <String "JS signIn result isSuccess">
	//    5   11:invokestatic    #148 <Method int Log.i(String, String)>
	//    6   14:pop             
			jscallback.success(com.huawei.hwCloudJs.service.hms.b.a(signinresult, flag));
	//    7   15:aload           6
	//    8   17:aload_1         
	//    9   18:iload_2         
	//   10   19:invokestatic    #162 <Method String b.a(SignInResult, boolean)>
	//   11   22:invokevirtual   #167 <Method void JsCallback.success(String)>
			return;
	//   12   25:return          
		}
		int i = signinresult.getStatus().getStatusCode();
	//   13   26:aload_1         
	//   14   27:invokevirtual   #171 <Method Status SignInResult.getStatus()>
	//   15   30:invokevirtual   #177 <Method int Status.getStatusCode()>
	//   16   33:istore          7
		Log.e("HmsCoreApi", (new StringBuilder()).append("JS signIn result statusCode").append(i).toString());
	//   17   35:ldc1            #18  <String "HmsCoreApi">
	//   18   37:new             #179 <Class StringBuilder>
	//   19   40:dup             
	//   20   41:invokespecial   #180 <Method void StringBuilder()>
	//   21   44:ldc1            #182 <String "JS signIn result statusCode">
	//   22   46:invokevirtual   #186 <Method StringBuilder StringBuilder.append(String)>
	//   23   49:iload           7
	//   24   51:invokevirtual   #189 <Method StringBuilder StringBuilder.append(int)>
	//   25   54:invokevirtual   #193 <Method String StringBuilder.toString()>
	//   26   57:invokestatic    #196 <Method int Log.e(String, String)>
	//   27   60:pop             
		if(i == 2001 || i == 2004)
	//*  28   61:iload           7
	//*  29   63:sipush          2001
	//*  30   66:icmpeq          77
	//*  31   69:iload           7
	//*  32   71:sipush          2004
	//*  33   74:icmpne          121
		{
			Activity activity = (Activity)weakreference.get();
	//   34   77:aload_3         
	//   35   78:invokevirtual   #201 <Method Object WeakReference.get()>
	//   36   81:checkcast       #203 <Class Activity>
	//   37   84:astore          8
			if(activity == null)
	//*  38   86:aload           8
	//*  39   88:ifnonnull       105
			{
				Log.e("HmsCoreApi", "JS signIn webViewActivity == null");
	//   40   91:ldc1            #18  <String "HmsCoreApi">
	//   41   93:ldc1            #205 <String "JS signIn webViewActivity == null">
	//   42   95:invokestatic    #196 <Method int Log.e(String, String)>
	//   43   98:pop             
				jscallback.failure();
	//   44   99:aload           6
	//   45  101:invokevirtual   #208 <Method void JsCallback.failure()>
				return;
	//   46  104:return          
			} else
			{
				a(signinresult, flag, weakreference, weakreference1, flag1, jscallback, activity);
	//   47  105:aload_0         
	//   48  106:aload_1         
	//   49  107:iload_2         
	//   50  108:aload_3         
	//   51  109:aload           4
	//   52  111:iload           5
	//   53  113:aload           6
	//   54  115:aload           8
	//   55  117:invokespecial   #211 <Method void a(SignInResult, boolean, WeakReference, WeakReference, boolean, JsCallback, Activity)>
				return;
	//   56  120:return          
			}
		}
		if(i == 2002)
	//*  57  121:iload           7
	//*  58  123:sipush          2002
	//*  59  126:icmpne          182
		{
			Log.i("HmsCoreApi", "JS signIn SIGN_IN_AUTH");
	//   60  129:ldc1            #18  <String "HmsCoreApi">
	//   61  131:ldc1            #213 <String "JS signIn SIGN_IN_AUTH">
	//   62  133:invokestatic    #148 <Method int Log.i(String, String)>
	//   63  136:pop             
			weakreference = ((WeakReference) ((Activity)weakreference.get()));
	//   64  137:aload_3         
	//   65  138:invokevirtual   #201 <Method Object WeakReference.get()>
	//   66  141:checkcast       #203 <Class Activity>
	//   67  144:astore_3        
			if(weakreference == null)
	//*  68  145:aload_3         
	//*  69  146:ifnonnull       155
			{
				jscallback.failure();
	//   70  149:aload           6
	//   71  151:invokevirtual   #208 <Method void JsCallback.failure()>
				return;
	//   72  154:return          
			} else
			{
				signinresult = ((SignInResult) (signinresult.getData()));
	//   73  155:aload_1         
	//   74  156:invokevirtual   #217 <Method Intent SignInResult.getData()>
	//   75  159:astore_1        
	/* block-local class not found */
	class a {}

				com.huawei.hwCloudJs.service.hms.a.a().a(((Activity) (weakreference)), ((Intent) (signinresult)), 9002, ((a.c) (new a(jscallback, flag))));
	//   76  160:invokestatic    #222 <Method a a.a()>
	//   77  163:aload_3         
	//   78  164:aload_1         
	//   79  165:sipush          9002
	//   80  168:new             #14  <Class HmsCoreApi$a>
	//   81  171:dup             
	//   82  172:aload           6
	//   83  174:iload_2         
	//   84  175:invokespecial   #225 <Method void HmsCoreApi$a(JsCallback, boolean)>
	//   85  178:invokevirtual   #228 <Method void a.a(Activity, Intent, int, a$c)>
				return;
	//   86  181:return          
			}
		} else
		{
			jscallback.failure(signinresult.getStatus().getStatusCode());
	//   87  182:aload           6
	//   88  184:aload_1         
	//   89  185:invokevirtual   #171 <Method Status SignInResult.getStatus()>
	//   90  188:invokevirtual   #177 <Method int Status.getStatusCode()>
	//   91  191:invokevirtual   #231 <Method void JsCallback.failure(int)>
			return;
	//   92  194:return          
		}
	}

	private void a(SignInResult signinresult, boolean flag, WeakReference weakreference, WeakReference weakreference1, boolean flag1, JsCallback jscallback, Activity activity)
	{
		signinresult = ((SignInResult) (signinresult.getData()));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #217 <Method Intent SignInResult.getData()>
	//    2    4:astore_1        
		weakreference = ((WeakReference) (new _cls3(weakreference1, jscallback, weakreference, flag, flag1)));
	//    3    5:new             #234 <Class HmsCoreApi$3>
	//    4    8:dup             
	//    5    9:aload_0         
	//    6   10:aload           4
	//    7   12:aload           6
	//    8   14:aload_3         
	//    9   15:iload_2         
	//   10   16:iload           5
	//   11   18:invokespecial   #237 <Method void HmsCoreApi$3(HmsCoreApi, WeakReference, JsCallback, WeakReference, boolean, boolean)>
	//   12   21:astore_3        
		com.huawei.hwCloudJs.service.hms.a.a().a(activity, ((Intent) (signinresult)), 9001, ((a.c) (weakreference)));
	//   13   22:invokestatic    #222 <Method a a.a()>
	//   14   25:aload           7
	//   15   27:aload_1         
	//   16   28:sipush          9001
	//   17   31:aload_3         
	//   18   32:invokevirtual   #228 <Method void a.a(Activity, Intent, int, a$c)>
	//   19   35:return          
	}

	private void a(LoginReq loginreq, JsCallback jscallback, WebView webview)
	{
		if(webview == null)
	//*   0    0:aload_3         
	//*   1    1:ifnonnull       19
		{
			Log.e("HmsCoreApi", "JS signIn webview is null");
	//    2    4:ldc1            #18  <String "HmsCoreApi">
	//    3    6:ldc1            #241 <String "JS signIn webview is null">
	//    4    8:invokestatic    #196 <Method int Log.e(String, String)>
	//    5   11:pop             
			jscallback.failure("webview is null");
	//    6   12:aload_2         
	//    7   13:ldc1            #243 <String "webview is null">
	//    8   15:invokevirtual   #245 <Method void JsCallback.failure(String)>
			return;
	//    9   18:return          
		}
		if(loginreq == null)
	//*  10   19:aload_1         
	//*  11   20:ifnonnull       38
		{
			Log.e("HmsCoreApi", "JS signIn JS_RET_CODE_PARSE_PARAM_ERROR");
	//   12   23:ldc1            #18  <String "HmsCoreApi">
	//   13   25:ldc1            #247 <String "JS signIn JS_RET_CODE_PARSE_PARAM_ERROR">
	//   14   27:invokestatic    #196 <Method int Log.e(String, String)>
	//   15   30:pop             
			jscallback.failure(13);
	//   16   31:aload_2         
	//   17   32:bipush          13
	//   18   34:invokevirtual   #231 <Method void JsCallback.failure(int)>
			return;
	//   19   37:return          
		} else
		{
			return;
	//   20   38:return          
		}
	}

	private void a(StartIntentReq startintentreq, JsCallback jscallback, WebView webview, String s, String s1)
	{
	/* block-local class not found */
	class StartIntentReq {}

		int i = StartIntentReq.access._mth800(startintentreq);
	//    0    0:aload_1         
	//    1    1:invokestatic    #254 <Method int HmsCoreApi$StartIntentReq.access$800(HmsCoreApi$StartIntentReq)>
	//    2    4:istore          6
		if(i == 1001)
	//*   3    6:iload           6
	//*   4    8:sipush          1001
	//*   5   11:icmpne          78
		{
			startintentreq = ((StartIntentReq) ((Activity)webview.getContext()));
	//    6   14:aload_3         
	//    7   15:invokevirtual   #259 <Method Context WebView.getContext()>
	//    8   18:checkcast       #203 <Class Activity>
	//    9   21:astore_1        
			webview = ((WebView) (com.huawei.hwCloudJs.service.hms.d.a().a(s)));
	//   10   22:invokestatic    #264 <Method d d.a()>
	//   11   25:aload           4
	//   12   27:invokevirtual   #267 <Method Intent d.a(String)>
	//   13   30:astore_3        
			if(webview == null)
	//*  14   31:aload_3         
	//*  15   32:ifnonnull       52
			{
				Log.e("HmsCoreApi", "JS hmsInvoke startResolutionForResult intent is null");
	//   16   35:ldc1            #18  <String "HmsCoreApi">
	//   17   37:ldc2            #269 <String "JS hmsInvoke startResolutionForResult intent is null">
	//   18   40:invokestatic    #196 <Method int Log.e(String, String)>
	//   19   43:pop             
				jscallback.failure("intent is null");
	//   20   44:aload_2         
	//   21   45:ldc2            #271 <String "intent is null">
	//   22   48:invokevirtual   #245 <Method void JsCallback.failure(String)>
				return;
	//   23   51:return          
			}
			try
			{
				((Activity) (startintentreq)).startActivity(((Intent) (webview)));
	//   24   52:aload_1         
	//   25   53:aload_3         
	//   26   54:invokevirtual   #275 <Method void Activity.startActivity(Intent)>
			}
	//*  27   57:goto            77
			// Misplaced declaration of an exception variable
			catch(StartIntentReq startintentreq)
	//*  28   60:astore_1        
			{
				Log.e("HmsCoreApi", "JS hmsInvoke startResolutionForResult can not intent this");
	//   29   61:ldc1            #18  <String "HmsCoreApi">
	//   30   63:ldc2            #277 <String "JS hmsInvoke startResolutionForResult can not intent this">
	//   31   66:invokestatic    #196 <Method int Log.e(String, String)>
	//   32   69:pop             
				jscallback.failure("can not intent this");
	//   33   70:aload_2         
	//   34   71:ldc2            #279 <String "can not intent this">
	//   35   74:invokevirtual   #245 <Method void JsCallback.failure(String)>
			}
			return;
	//   36   77:return          
		}
		if(i == 1002 || i == 1003)
	//*  37   78:iload           6
	//*  38   80:sipush          1002
	//*  39   83:icmpeq          94
	//*  40   86:iload           6
	//*  41   88:sipush          1003
	//*  42   91:icmpne          108
		{
			a(startintentreq, jscallback, webview, s, s1, i);
	//   43   94:aload_0         
	//   44   95:aload_1         
	//   45   96:aload_2         
	//   46   97:aload_3         
	//   47   98:aload           4
	//   48  100:aload           5
	//   49  102:iload           6
	//   50  104:invokespecial   #282 <Method void a(HmsCoreApi$StartIntentReq, JsCallback, WebView, String, String, int)>
			return;
	//   51  107:return          
		}
		if(i == 1004)
	//*  52  108:iload           6
	//*  53  110:sipush          1004
	//*  54  113:icmpne          217
		{
			webview = ((WebView) (com.huawei.hwCloudJs.service.hms.d.a().a(s)));
	//   55  116:invokestatic    #264 <Method d d.a()>
	//   56  119:aload           4
	//   57  121:invokevirtual   #267 <Method Intent d.a(String)>
	//   58  124:astore_3        
			if(webview == null)
	//*  59  125:aload_3         
	//*  60  126:ifnonnull       146
			{
				Log.e("HmsCoreApi", "JS hmsInvoke TYPE_GETDATA_FORRESULT can not intent this");
	//   61  129:ldc1            #18  <String "HmsCoreApi">
	//   62  131:ldc2            #284 <String "JS hmsInvoke TYPE_GETDATA_FORRESULT can not intent this">
	//   63  134:invokestatic    #196 <Method int Log.e(String, String)>
	//   64  137:pop             
				jscallback.failure("intent is null");
	//   65  138:aload_2         
	//   66  139:ldc2            #271 <String "intent is null">
	//   67  142:invokevirtual   #245 <Method void JsCallback.failure(String)>
				return;
	//   68  145:return          
			}
			if(!TextUtils.isEmpty(((CharSequence) (((Intent) (webview)).getAction()))) || ((Intent) (webview)).getComponent() != null)
	//*  69  146:aload_3         
	//*  70  147:invokevirtual   #289 <Method String Intent.getAction()>
	//*  71  150:invokestatic    #127 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  72  153:ifeq            163
	//*  73  156:aload_3         
	//*  74  157:invokevirtual   #293 <Method android.content.ComponentName Intent.getComponent()>
	//*  75  160:ifnull          180
			{
				Log.e("HmsCoreApi", "JS hmsInvoke TYPE_GETDATA_FORRESULT it is not data intent");
	//   76  163:ldc1            #18  <String "HmsCoreApi">
	//   77  165:ldc2            #295 <String "JS hmsInvoke TYPE_GETDATA_FORRESULT it is not data intent">
	//   78  168:invokestatic    #196 <Method int Log.e(String, String)>
	//   79  171:pop             
				jscallback.failure("it is not data intent");
	//   80  172:aload_2         
	//   81  173:ldc2            #297 <String "it is not data intent">
	//   82  176:invokevirtual   #245 <Method void JsCallback.failure(String)>
				return;
	//   83  179:return          
			}
			startintentreq = ((StartIntentReq) (new JSONObject()));
	//   84  180:new             #299 <Class JSONObject>
	//   85  183:dup             
	//   86  184:invokespecial   #300 <Method void JSONObject()>
	//   87  187:astore_1        
			webview = ((WebView) (((Intent) (webview)).getExtras()));
	//   88  188:aload_3         
	//   89  189:invokevirtual   #304 <Method android.os.Bundle Intent.getExtras()>
	//   90  192:astore_3        
			if(webview != null)
	//*  91  193:aload_3         
	//*  92  194:ifnull          208
				f.a(2).a(s1, ((android.os.Bundle) (webview)), ((JSONObject) (startintentreq)));
	//   93  197:iconst_2        
	//   94  198:invokestatic    #309 <Method e f.a(int)>
	//   95  201:aload           5
	//   96  203:aload_3         
	//   97  204:aload_1         
	//   98  205:invokevirtual   #314 <Method void e.a(String, android.os.Bundle, JSONObject)>
			jscallback.success(((JSONObject) (startintentreq)).toString());
	//   99  208:aload_2         
	//  100  209:aload_1         
	//  101  210:invokevirtual   #315 <Method String JSONObject.toString()>
	//  102  213:invokevirtual   #167 <Method void JsCallback.success(String)>
			return;
	//  103  216:return          
		} else
		{
			Log.e("HmsCoreApi", "JS hmsInvoke startResolutionForResult failure!");
	//  104  217:ldc1            #18  <String "HmsCoreApi">
	//  105  219:ldc2            #317 <String "JS hmsInvoke startResolutionForResult failure!">
	//  106  222:invokestatic    #196 <Method int Log.e(String, String)>
	//  107  225:pop             
			jscallback.failure();
	//  108  226:aload_2         
	//  109  227:invokevirtual   #208 <Method void JsCallback.failure()>
			return;
	//  110  230:return          
		}
	}

	private void a(StartIntentReq startintentreq, JsCallback jscallback, WebView webview, String s, String s1, int i)
	{
		com.huawei.hwCloudJs.service.hms.b.a(s1, jscallback);
	//    0    0:aload           5
	//    1    2:aload_2         
	//    2    3:invokestatic    #322 <Method void b.a(String, JsCallback)>
		Activity activity = (Activity)webview.getContext();
	//    3    6:aload_3         
	//    4    7:invokevirtual   #259 <Method Context WebView.getContext()>
	//    5   10:checkcast       #203 <Class Activity>
	//    6   13:astore          10
		if(i == 1002)
	//*   7   15:iload           6
	//*   8   17:sipush          1002
	//*   9   20:icmpne          83
		{
			startintentreq = ((StartIntentReq) (com.huawei.hwCloudJs.service.hms.d.a().a(s)));
	//   10   23:invokestatic    #264 <Method d d.a()>
	//   11   26:aload           4
	//   12   28:invokevirtual   #267 <Method Intent d.a(String)>
	//   13   31:astore_1        
			if(startintentreq == null)
	//*  14   32:aload_1         
	//*  15   33:ifnonnull       53
			{
				Log.e("HmsCoreApi", "JS hmsInvoke startResolutionForResult intent == null");
	//   16   36:ldc1            #18  <String "HmsCoreApi">
	//   17   38:ldc2            #324 <String "JS hmsInvoke startResolutionForResult intent == null">
	//   18   41:invokestatic    #196 <Method int Log.e(String, String)>
	//   19   44:pop             
				jscallback.failure("intent is null");
	//   20   45:aload_2         
	//   21   46:ldc2            #271 <String "intent is null">
	//   22   49:invokevirtual   #245 <Method void JsCallback.failure(String)>
				return;
	//   23   52:return          
			}
			try
			{
				activity.startActivityForResult(((Intent) (startintentreq)), 9003);
	//   24   53:aload           10
	//   25   55:aload_1         
	//   26   56:sipush          9003
	//   27   59:invokevirtual   #328 <Method void Activity.startActivityForResult(Intent, int)>
			}
	//*  28   62:goto            82
			// Misplaced declaration of an exception variable
			catch(StartIntentReq startintentreq)
	//*  29   65:astore_1        
			{
				Log.e("HmsCoreApi", "JS hmsInvoke startResolutionForResult intentcan not intent this");
	//   30   66:ldc1            #18  <String "HmsCoreApi">
	//   31   68:ldc2            #330 <String "JS hmsInvoke startResolutionForResult intentcan not intent this">
	//   32   71:invokestatic    #196 <Method int Log.e(String, String)>
	//   33   74:pop             
				jscallback.failure("can not intent this");
	//   34   75:aload_2         
	//   35   76:ldc2            #279 <String "can not intent this">
	//   36   79:invokevirtual   #245 <Method void JsCallback.failure(String)>
			}
			return;
	//   37   82:return          
		}
		PendingIntent pendingintent = com.huawei.hwCloudJs.service.hms.d.a().b(s);
	//   38   83:invokestatic    #264 <Method d d.a()>
	//   39   86:aload           4
	//   40   88:invokevirtual   #333 <Method PendingIntent d.b(String)>
	//   41   91:astore          11
		if(pendingintent == null)
	//*  42   93:aload           11
	//*  43   95:ifnonnull       115
		{
			Log.e("HmsCoreApi", "JS hmsInvoke intent is null");
	//   44   98:ldc1            #18  <String "HmsCoreApi">
	//   45  100:ldc2            #335 <String "JS hmsInvoke intent is null">
	//   46  103:invokestatic    #196 <Method int Log.e(String, String)>
	//   47  106:pop             
			jscallback.failure("intent is null");
	//   48  107:aload_2         
	//   49  108:ldc2            #271 <String "intent is null">
	//   50  111:invokevirtual   #245 <Method void JsCallback.failure(String)>
			return;
	//   51  114:return          
		}
		Object obj = null;
	//   52  115:aconst_null     
	//   53  116:astore          9
		String s2 = StartIntentReq.access._mth900(startintentreq);
	//   54  118:aload_1         
	//   55  119:invokestatic    #339 <Method String HmsCoreApi$StartIntentReq.access$900(HmsCoreApi$StartIntentReq)>
	//   56  122:astore          12
		webview = ((WebView) (obj));
	//   57  124:aload           9
	//   58  126:astore_3        
		if(!TextUtils.isEmpty(((CharSequence) (s2))))
	//*  59  127:aload           12
	//*  60  129:invokestatic    #127 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  61  132:ifne            157
		{
			webview = ((WebView) (obj));
	//   62  135:aload           9
	//   63  137:astore_3        
			if(s2.startsWith(s1))
	//*  64  138:aload           12
	//*  65  140:aload           5
	//*  66  142:invokevirtual   #343 <Method boolean String.startsWith(String)>
	//*  67  145:ifeq            157
				webview = ((WebView) (com.huawei.hwCloudJs.service.hms.d.a().a(s)));
	//   68  148:invokestatic    #264 <Method d d.a()>
	//   69  151:aload           4
	//   70  153:invokevirtual   #267 <Method Intent d.a(String)>
	//   71  156:astore_3        
		}
		i = StartIntentReq.access._mth1000(startintentreq);
	//   72  157:aload_1         
	//   73  158:invokestatic    #346 <Method int HmsCoreApi$StartIntentReq.access$1000(HmsCoreApi$StartIntentReq)>
	//   74  161:istore          6
		int j = StartIntentReq.access._mth1100(startintentreq);
	//   75  163:aload_1         
	//   76  164:invokestatic    #349 <Method int HmsCoreApi$StartIntentReq.access$1100(HmsCoreApi$StartIntentReq)>
	//   77  167:istore          7
		int k = StartIntentReq.access._mth1200(startintentreq);
	//   78  169:aload_1         
	//   79  170:invokestatic    #352 <Method int HmsCoreApi$StartIntentReq.access$1200(HmsCoreApi$StartIntentReq)>
	//   80  173:istore          8
		try
		{
			activity.startIntentSenderForResult(pendingintent.getIntentSender(), 9003, ((Intent) (webview)), i, j, k);
	//   81  175:aload           10
	//   82  177:aload           11
	//   83  179:invokevirtual   #358 <Method android.content.IntentSender PendingIntent.getIntentSender()>
	//   84  182:sipush          9003
	//   85  185:aload_3         
	//   86  186:iload           6
	//   87  188:iload           7
	//   88  190:iload           8
	//   89  192:invokevirtual   #362 <Method void Activity.startIntentSenderForResult(android.content.IntentSender, int, Intent, int, int, int)>
			return;
	//   90  195:return          
		}
		// Misplaced declaration of an exception variable
		catch(StartIntentReq startintentreq)
	//*  91  196:astore_1        
		{
			Log.e("HmsCoreApi", "JS hmsInvoke REQUEST_CODE_INVOKE can not intent this");
	//   92  197:ldc1            #18  <String "HmsCoreApi">
	//   93  199:ldc2            #364 <String "JS hmsInvoke REQUEST_CODE_INVOKE can not intent this">
	//   94  202:invokestatic    #196 <Method int Log.e(String, String)>
	//   95  205:pop             
		}
		jscallback.failure("can not intent this");
	//   96  206:aload_2         
	//   97  207:ldc2            #279 <String "can not intent this">
	//   98  210:invokevirtual   #245 <Method void JsCallback.failure(String)>
	//   99  213:return          
	}

	static void a(HmsCoreApi hmscoreapi, SignInResult signinresult, boolean flag, WeakReference weakreference, WeakReference weakreference1, boolean flag1, JsCallback jscallback)
	{
		hmscoreapi.a(signinresult, flag, weakreference, weakreference1, flag1, jscallback);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:aload_3         
	//    4    4:aload           4
	//    5    6:iload           5
	//    6    8:aload           6
	//    7   10:invokespecial   #367 <Method void a(SignInResult, boolean, WeakReference, WeakReference, boolean, JsCallback)>
	//    8   13:return          
	}

	static void a(HmsCoreApi hmscoreapi, a.b b1, WeakReference weakreference, JsCallback jscallback, WeakReference weakreference1, boolean flag, boolean flag1)
	{
		hmscoreapi.a(b1, weakreference, jscallback, weakreference1, flag, flag1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:aload           4
	//    5    6:iload           5
	//    6    8:iload           6
	//    7   10:invokespecial   #371 <Method void a(a$b, WeakReference, JsCallback, WeakReference, boolean, boolean)>
	//    8   13:return          
	}

	static void a(HmsCoreApi hmscoreapi, WeakReference weakreference, JsCallback jscallback, WeakReference weakreference1, boolean flag, boolean flag1)
	{
		hmscoreapi.a(weakreference, jscallback, weakreference1, flag, flag1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:iload           4
	//    5    6:iload           5
	//    6    8:invokespecial   #374 <Method void a(WeakReference, JsCallback, WeakReference, boolean, boolean)>
	//    7   11:return          
	}

	private void a(a.b b1, WeakReference weakreference, JsCallback jscallback, WeakReference weakreference1, boolean flag, boolean flag1)
	{
		if(b1.b() == -1)
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #378 <Method int a$b.b()>
	//*   2    4:iconst_m1       
	//*   3    5:icmpne          30
		{
			Log.i("HmsCoreApi", "JS signIn Activity.RESULT_OK");
	//    4    8:ldc1            #18  <String "HmsCoreApi">
	//    5   10:ldc2            #380 <String "JS signIn Activity.RESULT_OK">
	//    6   13:invokestatic    #148 <Method int Log.i(String, String)>
	//    7   16:pop             
			a(weakreference, jscallback, weakreference1, flag, flag1);
	//    8   17:aload_0         
	//    9   18:aload_2         
	//   10   19:aload_3         
	//   11   20:aload           4
	//   12   22:iload           5
	//   13   24:iload           6
	//   14   26:invokespecial   #374 <Method void a(WeakReference, JsCallback, WeakReference, boolean, boolean)>
			return;
	//   15   29:return          
		} else
		{
			Log.e("HmsCoreApi", "JS signIn JS_RET_CODE_USER_DENAL");
	//   16   30:ldc1            #18  <String "HmsCoreApi">
	//   17   32:ldc2            #382 <String "JS signIn JS_RET_CODE_USER_DENAL">
	//   18   35:invokestatic    #196 <Method int Log.e(String, String)>
	//   19   38:pop             
			jscallback.failure(1);
	//   20   39:aload_3         
	//   21   40:iconst_1        
	//   22   41:invokevirtual   #231 <Method void JsCallback.failure(int)>
			return;
	//   23   44:return          
		}
	}

	private void a(WeakReference weakreference, JsCallback jscallback, WeakReference weakreference1, boolean flag, boolean flag1)
	{
		Object obj = ((Object) ((HuaweiApiClient)weakreference.get()));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #201 <Method Object WeakReference.get()>
	//    2    4:checkcast       #385 <Class HuaweiApiClient>
	//    3    7:astore          6
		if(obj == null)
	//*   4    9:aload           6
	//*   5   11:ifnonnull       19
		{
			jscallback.failure();
	//    6   14:aload_2         
	//    7   15:invokevirtual   #208 <Method void JsCallback.failure()>
			return;
	//    8   18:return          
		}
		if(flag1)
	//*   9   19:iload           5
	//*  10   21:ifeq            39
		{
			obj = ((Object) (HuaweiId.HuaweiIdApi.signInBackend(((HuaweiApiClient) (obj)))));
	//   11   24:getstatic       #389 <Field HuaweiIdApi HuaweiId.HuaweiIdApi>
	//   12   27:aload           6
	//   13   29:invokeinterface #395 <Method PendingResult HuaweiIdApi.signInBackend(HuaweiApiClient)>
	//   14   34:astore          6
		} else
	//*  15   36:goto            84
		{
			Activity activity = (Activity)weakreference1.get();
	//   16   39:aload_3         
	//   17   40:invokevirtual   #201 <Method Object WeakReference.get()>
	//   18   43:checkcast       #203 <Class Activity>
	//   19   46:astore          7
			if(activity != null)
	//*  20   48:aload           7
	//*  21   50:ifnull          70
			{
				obj = ((Object) (HuaweiId.HuaweiIdApi.signIn(activity, ((HuaweiApiClient) (obj)))));
	//   22   53:getstatic       #389 <Field HuaweiIdApi HuaweiId.HuaweiIdApi>
	//   23   56:aload           7
	//   24   58:aload           6
	//   25   60:invokeinterface #399 <Method PendingResult HuaweiIdApi.signIn(Activity, HuaweiApiClient)>
	//   26   65:astore          6
			} else
	//*  27   67:goto            84
			{
				Log.e("HmsCoreApi", "signIn with null activity");
	//   28   70:ldc1            #18  <String "HmsCoreApi">
	//   29   72:ldc2            #401 <String "signIn with null activity">
	//   30   75:invokestatic    #196 <Method int Log.e(String, String)>
	//   31   78:pop             
				jscallback.failure();
	//   32   79:aload_2         
	//   33   80:invokevirtual   #208 <Method void JsCallback.failure()>
				return;
	//   34   83:return          
			}
		}
		((PendingResult) (obj)).setResultCallback(((com.huawei.hms.support.api.client.ResultCallback) (new _cls2(flag, weakreference1, weakreference, flag1, jscallback))));
	//   35   84:aload           6
	//   36   86:new             #403 <Class HmsCoreApi$2>
	//   37   89:dup             
	//   38   90:aload_0         
	//   39   91:iload           4
	//   40   93:aload_3         
	//   41   94:aload_1         
	//   42   95:iload           5
	//   43   97:aload_2         
	//   44   98:invokespecial   #406 <Method void HmsCoreApi$2(HmsCoreApi, boolean, WeakReference, WeakReference, boolean, JsCallback)>
	//   45  101:invokevirtual   #412 <Method void PendingResult.setResultCallback(com.huawei.hms.support.api.client.ResultCallback)>
	//   46  104:return          
	}

	public String getApi()
	{
		return "hms";
	//    0    0:ldc2            #416 <String "hms">
	//    1    3:areturn         
	}

	public void hmsInvoke(InvokeReq invokereq, JsCallback jscallback)
	{
		Object obj1 = ((Object) (jscallback.getWebView()));
	//    0    0:aload_2         
	//    1    1:invokevirtual   #428 <Method WebView JsCallback.getWebView()>
	//    2    4:astore          6
		if(obj1 == null)
	//*   3    6:aload           6
	//*   4    8:ifnonnull       16
		{
			jscallback.failure();
	//    5   11:aload_2         
	//    6   12:invokevirtual   #208 <Method void JsCallback.failure()>
			return;
	//    7   15:return          
		}
		if(invokereq == null)
	//*   8   16:aload_1         
	//*   9   17:ifnonnull       36
		{
			Log.e("HmsCoreApi", "JS hmsInvoke req JS_RET_CODE_PARSE_PARAM_ERROR");
	//   10   20:ldc1            #18  <String "HmsCoreApi">
	//   11   22:ldc2            #430 <String "JS hmsInvoke req JS_RET_CODE_PARSE_PARAM_ERROR">
	//   12   25:invokestatic    #196 <Method int Log.e(String, String)>
	//   13   28:pop             
			jscallback.failure(13);
	//   14   29:aload_2         
	//   15   30:bipush          13
	//   16   32:invokevirtual   #231 <Method void JsCallback.failure(int)>
			return;
	//   17   35:return          
		}
	/* block-local class not found */
	class InvokeReq {}

		String s = InvokeReq.access._mth500(invokereq);
	//   18   36:aload_1         
	//   19   37:invokestatic    #434 <Method String HmsCoreApi$InvokeReq.access$500(HmsCoreApi$InvokeReq)>
	//   20   40:astore          5
		if(TextUtils.isEmpty(((CharSequence) (s))))
	//*  21   42:aload           5
	//*  22   44:invokestatic    #127 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  23   47:ifeq            66
		{
			Log.e("HmsCoreApi", "JS hmsInvoke URI JS_RET_CODE_PARSE_PARAM_ERROR");
	//   24   50:ldc1            #18  <String "HmsCoreApi">
	//   25   52:ldc2            #436 <String "JS hmsInvoke URI JS_RET_CODE_PARSE_PARAM_ERROR">
	//   26   55:invokestatic    #196 <Method int Log.e(String, String)>
	//   27   58:pop             
			jscallback.failure(13);
	//   28   59:aload_2         
	//   29   60:bipush          13
	//   30   62:invokevirtual   #231 <Method void JsCallback.failure(int)>
			return;
	//   31   65:return          
		}
		JSONObject jsonobject;
		if(TextUtils.isEmpty(((CharSequence) (InvokeReq.access._mth600(invokereq)))))
	//*  32   66:aload_1         
	//*  33   67:invokestatic    #439 <Method String HmsCoreApi$InvokeReq.access$600(HmsCoreApi$InvokeReq)>
	//*  34   70:invokestatic    #127 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  35   73:ifeq            87
			jsonobject = new JSONObject();
	//   36   76:new             #299 <Class JSONObject>
	//   37   79:dup             
	//   38   80:invokespecial   #300 <Method void JSONObject()>
	//   39   83:astore_3        
		else
	//*  40   84:goto            119
			try
			{
				jsonobject = new JSONObject(InvokeReq.access._mth600(invokereq));
	//   41   87:new             #299 <Class JSONObject>
	//   42   90:dup             
	//   43   91:aload_1         
	//   44   92:invokestatic    #439 <Method String HmsCoreApi$InvokeReq.access$600(HmsCoreApi$InvokeReq)>
	//   45   95:invokespecial   #440 <Method void JSONObject(String)>
	//   46   98:astore_3        
			}
	//*  47   99:goto            119
			// Misplaced declaration of an exception variable
			catch(InvokeReq invokereq)
	//*  48  102:astore_1        
			{
				Log.e("HmsCoreApi", "JS hmsInvoke JSONException");
	//   49  103:ldc1            #18  <String "HmsCoreApi">
	//   50  105:ldc2            #442 <String "JS hmsInvoke JSONException">
	//   51  108:invokestatic    #196 <Method int Log.e(String, String)>
	//   52  111:pop             
				jscallback.failure(13);
	//   53  112:aload_2         
	//   54  113:bipush          13
	//   55  115:invokevirtual   #231 <Method void JsCallback.failure(int)>
				return;
	//   56  118:return          
			}
		Object obj2 = ((Object) (invokereq.getAppId()));
	//   57  119:aload_1         
	//   58  120:invokevirtual   #445 <Method String HmsCoreApi$InvokeReq.getAppId()>
	//   59  123:astore          7
		invokereq = ((InvokeReq) (invokereq.getBridgeId()));
	//   60  125:aload_1         
	//   61  126:invokevirtual   #448 <Method String HmsCoreApi$InvokeReq.getBridgeId()>
	//   62  129:astore_1        
		Object obj = ((Object) (com.huawei.hwCloudJs.service.hms.c.a().a(((String) (invokereq)), ((String) (obj2)))));
	//   63  130:invokestatic    #453 <Method com.huawei.hwCloudJs.service.hms.c c.a()>
	//   64  133:aload_1         
	//   65  134:aload           7
	//   66  136:invokevirtual   #456 <Method HuaweiApiClient c.a(String, String)>
	//   67  139:astore          4
		invokereq = ((InvokeReq) (obj));
	//   68  141:aload           4
	//   69  143:astore_1        
		if(obj == null)
	//*  70  144:aload           4
	//*  71  146:ifnonnull       209
		{
			invokereq = ((InvokeReq) ((new com.huawei.hms.support.api.hwid.HuaweiIdSignInOptions.Builder()).requestOpenId().build()));
	//   72  149:new             #44  <Class com.huawei.hms.support.api.hwid.HuaweiIdSignInOptions$Builder>
	//   73  152:dup             
	//   74  153:invokespecial   #457 <Method void com.huawei.hms.support.api.hwid.HuaweiIdSignInOptions$Builder()>
	//   75  156:invokevirtual   #63  <Method com.huawei.hms.support.api.hwid.HuaweiIdSignInOptions$Builder com.huawei.hms.support.api.hwid.HuaweiIdSignInOptions$Builder.requestOpenId()>
	//   76  159:invokevirtual   #83  <Method HuaweiIdSignInOptions com.huawei.hms.support.api.hwid.HuaweiIdSignInOptions$Builder.build()>
	//   77  162:astore_1        
			invokereq = ((InvokeReq) ((new com.huawei.hms.api.HuaweiApiClient.Builder(((WebView) (obj1)).getContext().getApplicationContext())).addApi(HuaweiId.SIGN_IN_API, ((com.huawei.hms.api.Api.ApiOptions.HasOptions) (invokereq))).addApi(d).build()));
	//   78  163:new             #65  <Class com.huawei.hms.api.HuaweiApiClient$Builder>
	//   79  166:dup             
	//   80  167:aload           6
	//   81  169:invokevirtual   #259 <Method Context WebView.getContext()>
	//   82  172:invokevirtual   #71  <Method Context Context.getApplicationContext()>
	//   83  175:invokespecial   #74  <Method void com.huawei.hms.api.HuaweiApiClient$Builder(Context)>
	//   84  178:getstatic       #79  <Field Api HuaweiId.SIGN_IN_API>
	//   85  181:aload_1         
	//   86  182:invokevirtual   #87  <Method com.huawei.hms.api.HuaweiApiClient$Builder com.huawei.hms.api.HuaweiApiClient$Builder.addApi(Api, com.huawei.hms.api.Api$ApiOptions$HasOptions)>
	//   87  185:getstatic       #38  <Field Api d>
	//   88  188:invokevirtual   #90  <Method com.huawei.hms.api.HuaweiApiClient$Builder com.huawei.hms.api.HuaweiApiClient$Builder.addApi(Api)>
	//   89  191:invokevirtual   #115 <Method HuaweiApiClient com.huawei.hms.api.HuaweiApiClient$Builder.build()>
	//   90  194:astore_1        
			((HuaweiApiClient) (invokereq)).setSubAppInfo(new SubAppInfo(((String) (obj2))));
	//   91  195:aload_1         
	//   92  196:new             #459 <Class SubAppInfo>
	//   93  199:dup             
	//   94  200:aload           7
	//   95  202:invokespecial   #460 <Method void SubAppInfo(String)>
	//   96  205:invokevirtual   #464 <Method boolean HuaweiApiClient.setSubAppInfo(SubAppInfo)>
	//   97  208:pop             
		}
		obj = ((Object) (new WeakReference(((Object) (invokereq)))));
	//   98  209:new             #198 <Class WeakReference>
	//   99  212:dup             
	//  100  213:aload_1         
	//  101  214:invokespecial   #467 <Method void WeakReference(Object)>
	//  102  217:astore          4
		obj1 = ((Object) ((Activity)((WebView) (obj1)).getContext()));
	//  103  219:aload           6
	//  104  221:invokevirtual   #259 <Method Context WebView.getContext()>
	//  105  224:checkcast       #203 <Class Activity>
	//  106  227:astore          6
		obj2 = ((Object) (new WeakReference(obj1)));
	//  107  229:new             #198 <Class WeakReference>
	//  108  232:dup             
	//  109  233:aload           6
	//  110  235:invokespecial   #467 <Method void WeakReference(Object)>
	//  111  238:astore          7
		if(((HuaweiApiClient) (invokereq)).isConnected())
	//* 112  240:aload_1         
	//* 113  241:invokevirtual   #470 <Method boolean HuaweiApiClient.isConnected()>
	//* 114  244:ifeq            257
		{
			com.huawei.hwCloudJs.service.hms.b.a(((WeakReference) (obj)), s, jsonobject, jscallback);
	//  115  247:aload           4
	//  116  249:aload           5
	//  117  251:aload_3         
	//  118  252:aload_2         
	//  119  253:invokestatic    #473 <Method void b.a(WeakReference, String, JSONObject, JsCallback)>
			return;
	//  120  256:return          
		} else
		{
			((HuaweiApiClient) (invokereq)).setConnectionCallbacks(((com.huawei.hms.api.HuaweiApiClient.ConnectionCallbacks) (new b.c(((WeakReference) (obj)), jscallback, s, jsonobject))));
	//  121  257:aload_1         
	//  122  258:new             #475 <Class b$c>
	//  123  261:dup             
	//  124  262:aload           4
	//  125  264:aload_2         
	//  126  265:aload           5
	//  127  267:aload_3         
	//  128  268:invokespecial   #478 <Method void b$c(WeakReference, JsCallback, String, JSONObject)>
	//  129  271:invokevirtual   #482 <Method void HuaweiApiClient.setConnectionCallbacks(com.huawei.hms.api.HuaweiApiClient$ConnectionCallbacks)>
			((HuaweiApiClient) (invokereq)).setConnectionFailedListener(((com.huawei.hms.api.HuaweiApiClient.OnConnectionFailedListener) (new b.b(((WeakReference) (obj)), jscallback, ((WeakReference) (obj2))))));
	//  130  274:aload_1         
	//  131  275:new             #484 <Class b$b>
	//  132  278:dup             
	//  133  279:aload           4
	//  134  281:aload_2         
	//  135  282:aload           7
	//  136  284:invokespecial   #487 <Method void b$b(WeakReference, JsCallback, WeakReference)>
	//  137  287:invokevirtual   #491 <Method void HuaweiApiClient.setConnectionFailedListener(com.huawei.hms.api.HuaweiApiClient$OnConnectionFailedListener)>
			((HuaweiApiClient) (invokereq)).connect(((Activity) (obj1)));
	//  138  290:aload_1         
	//  139  291:aload           6
	//  140  293:invokevirtual   #495 <Method void HuaweiApiClient.connect(Activity)>
			return;
	//  141  296:return          
		}
	}

	public void onCompletedConfig(Context context, String s, String s1, String s2, JSONObject jsonobject)
	{
		s1 = null;
	//    0    0:aconst_null     
	//    1    1:astore_3        
		boolean flag = false;
	//    2    2:iconst_0        
	//    3    3:istore          6
		if(jsonobject != null)
	//*   4    5:aload           5
	//*   5    7:ifnull          31
		{
			s1 = jsonobject.optString("scope", ((String) (null)));
	//    6   10:aload           5
	//    7   12:ldc2            #500 <String "scope">
	//    8   15:aconst_null     
	//    9   16:invokevirtual   #504 <Method String JSONObject.optString(String, String)>
	//   10   19:astore_3        
			flag = jsonobject.optBoolean("needAuthCode", false);
	//   11   20:aload           5
	//   12   22:ldc2            #506 <String "needAuthCode">
	//   13   25:iconst_0        
	//   14   26:invokevirtual   #510 <Method boolean JSONObject.optBoolean(String, boolean)>
	//   15   29:istore          6
		}
		s1 = ((String) (a(s1)));
	//   16   31:aload_3         
	//   17   32:invokestatic    #512 <Method List a(String)>
	//   18   35:astore_3        
		if(!((List) (s1)).isEmpty())
	//*  19   36:aload_3         
	//*  20   37:invokeinterface #514 <Method boolean List.isEmpty()>
	//*  21   42:ifne            100
		{
			s1 = ((String) (a(context, flag, ((List) (s1)))));
	//   22   45:aload_0         
	//   23   46:aload_1         
	//   24   47:iload           6
	//   25   49:aload_3         
	//   26   50:invokespecial   #516 <Method HuaweiApiClient a(Context, boolean, List)>
	//   27   53:astore_3        
			((HuaweiApiClient) (s1)).setSubAppInfo(new SubAppInfo(s));
	//   28   54:aload_3         
	//   29   55:new             #459 <Class SubAppInfo>
	//   30   58:dup             
	//   31   59:aload_2         
	//   32   60:invokespecial   #460 <Method void SubAppInfo(String)>
	//   33   63:invokevirtual   #464 <Method boolean HuaweiApiClient.setSubAppInfo(SubAppInfo)>
	//   34   66:pop             
			if(context instanceof Activity)
	//*  35   67:aload_1         
	//*  36   68:instanceof      #203 <Class Activity>
	//*  37   71:ifeq            85
				((HuaweiApiClient) (s1)).connect((Activity)context);
	//   38   74:aload_3         
	//   39   75:aload_1         
	//   40   76:checkcast       #203 <Class Activity>
	//   41   79:invokevirtual   #495 <Method void HuaweiApiClient.connect(Activity)>
			else
	//*  42   82:goto            90
				((HuaweiApiClient) (s1)).connect(((Activity) (null)));
	//   43   85:aload_3         
	//   44   86:aconst_null     
	//   45   87:invokevirtual   #495 <Method void HuaweiApiClient.connect(Activity)>
			com.huawei.hwCloudJs.service.hms.c.a().a(s2, s, ((HuaweiApiClient) (s1)));
	//   46   90:invokestatic    #453 <Method com.huawei.hwCloudJs.service.hms.c c.a()>
	//   47   93:aload           4
	//   48   95:aload_2         
	//   49   96:aload_3         
	//   50   97:invokevirtual   #519 <Method void c.a(String, String, HuaweiApiClient)>
		}
	//   51  100:return          
	}

	public void onDestroy(String s)
	{
		com.huawei.hwCloudJs.service.hms.c.a().a(s);
	//    0    0:invokestatic    #453 <Method com.huawei.hwCloudJs.service.hms.c c.a()>
	//    1    3:aload_1         
	//    2    4:invokevirtual   #522 <Method void c.a(String)>
	//    3    7:return          
	}

	public void signIn(LoginReq loginreq, JsCallback jscallback)
	{
		boolean flag;
		boolean flag1;
		boolean flag4;
		boolean flag5;
		Object obj;
		Object obj1;
		Object obj2;
		String s;
		List list;
label0:
		{
			obj1 = ((Object) (jscallback.getWebView()));
	//    0    0:aload_2         
	//    1    1:invokevirtual   #428 <Method WebView JsCallback.getWebView()>
	//    2    4:astore          10
			a(loginreq, jscallback, ((WebView) (obj1)));
	//    3    6:aload_0         
	//    4    7:aload_1         
	//    5    8:aload_2         
	//    6    9:aload           10
	//    7   11:invokespecial   #525 <Method void a(HmsCoreApi$LoginReq, JsCallback, WebView)>
	/* block-local class not found */
	class LoginReq {}

			obj2 = ((Object) (loginreq.getAppId()));
	//    8   14:aload_1         
	//    9   15:invokevirtual   #526 <Method String HmsCoreApi$LoginReq.getAppId()>
	//   10   18:astore          11
			s = loginreq.getBridgeId();
	//   11   20:aload_1         
	//   12   21:invokevirtual   #527 <Method String HmsCoreApi$LoginReq.getBridgeId()>
	//   13   24:astore          12
			list = a(LoginReq.access._mth000(loginreq));
	//   14   26:aload_1         
	//   15   27:invokestatic    #531 <Method String HmsCoreApi$LoginReq.access$000(HmsCoreApi$LoginReq)>
	//   16   30:invokestatic    #512 <Method List a(String)>
	//   17   33:astore          13
			flag4 = list.isEmpty();
	//   18   35:aload           13
	//   19   37:invokeinterface #514 <Method boolean List.isEmpty()>
	//   20   42:istore          7
			flag5 = LoginReq.access._mth100(loginreq);
	//   21   44:aload_1         
	//   22   45:invokestatic    #535 <Method boolean HmsCoreApi$LoginReq.access$100(HmsCoreApi$LoginReq)>
	//   23   48:istore          8
			boolean flag2 = false;
	//   24   50:iconst_0        
	//   25   51:istore          5
			flag1 = false;
	//   26   53:iconst_0        
	//   27   54:istore          4
			obj = ((Object) (com.huawei.hwCloudJs.service.hms.c.a().a(s, ((String) (obj2)))));
	//   28   56:invokestatic    #453 <Method com.huawei.hwCloudJs.service.hms.c c.a()>
	//   29   59:aload           12
	//   30   61:aload           11
	//   31   63:invokevirtual   #456 <Method HuaweiApiClient c.a(String, String)>
	//   32   66:astore          9
			flag = flag2;
	//   33   68:iload           5
	//   34   70:istore_3        
			if(obj == null)
				break label0;
	//   35   71:aload           9
	//   36   73:ifnull          176
			boolean flag3 = com.huawei.hwCloudJs.service.hms.b.a(list, ((HuaweiApiClientImpl)obj).getScopes());
	//   37   76:aload           13
	//   38   78:aload           9
	//   39   80:checkcast       #537 <Class HuaweiApiClientImpl>
	//   40   83:invokevirtual   #541 <Method List HuaweiApiClientImpl.getScopes()>
	//   41   86:invokestatic    #544 <Method boolean b.a(List, List)>
	//   42   89:istore          6
			loginreq = ((LoginReq) (((HuaweiApiClientImpl)obj).getPermissionInfos()));
	//   43   91:aload           9
	//   44   93:checkcast       #537 <Class HuaweiApiClientImpl>
	//   45   96:invokevirtual   #547 <Method List HuaweiApiClientImpl.getPermissionInfos()>
	//   46   99:astore_1        
			flag = flag2;
	//   47  100:iload           5
	//   48  102:istore_3        
			flag1 = flag3;
	//   49  103:iload           6
	//   50  105:istore          4
			if(loginreq == null)
				break label0;
	//   51  107:aload_1         
	//   52  108:ifnull          176
			loginreq = ((LoginReq) (((List) (loginreq)).iterator()));
	//   53  111:aload_1         
	//   54  112:invokeinterface #96  <Method Iterator List.iterator()>
	//   55  117:astore_1        
			PermissionInfo permissioninfo;
			do
			{
				flag = flag2;
	//   56  118:iload           5
	//   57  120:istore_3        
				flag1 = flag3;
	//   58  121:iload           6
	//   59  123:istore          4
				if(!((Iterator) (loginreq)).hasNext())
					break label0;
	//   60  125:aload_1         
	//   61  126:invokeinterface #102 <Method boolean Iterator.hasNext()>
	//   62  131:ifeq            176
				permissioninfo = (PermissionInfo)((Iterator) (loginreq)).next();
	//   63  134:aload_1         
	//   64  135:invokeinterface #106 <Method Object Iterator.next()>
	//   65  140:checkcast       #549 <Class PermissionInfo>
	//   66  143:astore          14
			} while(permissioninfo == null || !"https://www.huawei.com/auth/account/base.profile/serviceauthcode".equals(((Object) (permissioninfo.getPermission()))));
	//   67  145:aload           14
	//   68  147:ifnull          173
	//   69  150:ldc2            #551 <String "https://www.huawei.com/auth/account/base.profile/serviceauthcode">
	//   70  153:aload           14
	//   71  155:invokevirtual   #554 <Method String PermissionInfo.getPermission()>
	//   72  158:invokevirtual   #557 <Method boolean String.equals(Object)>
	//   73  161:ifeq            173
			flag = true;
	//   74  164:iconst_1        
	//   75  165:istore_3        
			flag1 = flag3;
	//   76  166:iload           6
	//   77  168:istore          4
		}
	//*  78  170:goto            176
	//*  79  173:goto            118
label1:
		{
			if(obj != null && flag1)
	//*  80  176:aload           9
	//*  81  178:ifnull          195
	//*  82  181:iload           4
	//*  83  183:ifeq            195
			{
				loginreq = ((LoginReq) (obj));
	//   84  186:aload           9
	//   85  188:astore_1        
				if(flag == flag5)
					break label1;
	//   86  189:iload_3         
	//   87  190:iload           8
	//   88  192:icmpeq          247
			}
			if(obj != null)
	//*  89  195:aload           9
	//*  90  197:ifnull          205
				((HuaweiApiClient) (obj)).disconnect();
	//   91  200:aload           9
	//   92  202:invokevirtual   #560 <Method void HuaweiApiClient.disconnect()>
			loginreq = ((LoginReq) (a(((WebView) (obj1)).getContext().getApplicationContext(), flag5, list)));
	//   93  205:aload_0         
	//   94  206:aload           10
	//   95  208:invokevirtual   #259 <Method Context WebView.getContext()>
	//   96  211:invokevirtual   #71  <Method Context Context.getApplicationContext()>
	//   97  214:iload           8
	//   98  216:aload           13
	//   99  218:invokespecial   #516 <Method HuaweiApiClient a(Context, boolean, List)>
	//  100  221:astore_1        
			((HuaweiApiClient) (loginreq)).setSubAppInfo(new SubAppInfo(((String) (obj2))));
	//  101  222:aload_1         
	//  102  223:new             #459 <Class SubAppInfo>
	//  103  226:dup             
	//  104  227:aload           11
	//  105  229:invokespecial   #460 <Method void SubAppInfo(String)>
	//  106  232:invokevirtual   #464 <Method boolean HuaweiApiClient.setSubAppInfo(SubAppInfo)>
	//  107  235:pop             
			com.huawei.hwCloudJs.service.hms.c.a().a(s, ((String) (obj2)), ((HuaweiApiClient) (loginreq)));
	//  108  236:invokestatic    #453 <Method com.huawei.hwCloudJs.service.hms.c c.a()>
	//  109  239:aload           12
	//  110  241:aload           11
	//  111  243:aload_1         
	//  112  244:invokevirtual   #519 <Method void c.a(String, String, HuaweiApiClient)>
		}
		obj = ((Object) ((Activity)((WebView) (obj1)).getContext()));
	//  113  247:aload           10
	//  114  249:invokevirtual   #259 <Method Context WebView.getContext()>
	//  115  252:checkcast       #203 <Class Activity>
	//  116  255:astore          9
		obj1 = ((Object) (new WeakReference(((Object) (loginreq)))));
	//  117  257:new             #198 <Class WeakReference>
	//  118  260:dup             
	//  119  261:aload_1         
	//  120  262:invokespecial   #467 <Method void WeakReference(Object)>
	//  121  265:astore          10
		obj2 = ((Object) (new WeakReference(obj)));
	//  122  267:new             #198 <Class WeakReference>
	//  123  270:dup             
	//  124  271:aload           9
	//  125  273:invokespecial   #467 <Method void WeakReference(Object)>
	//  126  276:astore          11
		if(((HuaweiApiClient) (loginreq)).isConnected())
	//* 127  278:aload_1         
	//* 128  279:invokevirtual   #470 <Method boolean HuaweiApiClient.isConnected()>
	//* 129  282:ifeq            299
		{
			a(((WeakReference) (obj1)), jscallback, ((WeakReference) (obj2)), flag5, flag4);
	//  130  285:aload_0         
	//  131  286:aload           10
	//  132  288:aload_2         
	//  133  289:aload           11
	//  134  291:iload           8
	//  135  293:iload           7
	//  136  295:invokespecial   #374 <Method void a(WeakReference, JsCallback, WeakReference, boolean, boolean)>
			return;
	//  137  298:return          
		} else
		{
			((HuaweiApiClient) (loginreq)).setConnectionCallbacks(((com.huawei.hms.api.HuaweiApiClient.ConnectionCallbacks) (new _cls1(((WeakReference) (obj1)), jscallback, ((WeakReference) (obj2)), flag5, flag4))));
	//  138  299:aload_1         
	//  139  300:new             #562 <Class HmsCoreApi$1>
	//  140  303:dup             
	//  141  304:aload_0         
	//  142  305:aload           10
	//  143  307:aload_2         
	//  144  308:aload           11
	//  145  310:iload           8
	//  146  312:iload           7
	//  147  314:invokespecial   #563 <Method void HmsCoreApi$1(HmsCoreApi, WeakReference, JsCallback, WeakReference, boolean, boolean)>
	//  148  317:invokevirtual   #482 <Method void HuaweiApiClient.setConnectionCallbacks(com.huawei.hms.api.HuaweiApiClient$ConnectionCallbacks)>
			((HuaweiApiClient) (loginreq)).setConnectionFailedListener(((com.huawei.hms.api.HuaweiApiClient.OnConnectionFailedListener) (new b.b(((WeakReference) (obj1)), jscallback, ((WeakReference) (obj2))))));
	//  149  320:aload_1         
	//  150  321:new             #484 <Class b$b>
	//  151  324:dup             
	//  152  325:aload           10
	//  153  327:aload_2         
	//  154  328:aload           11
	//  155  330:invokespecial   #487 <Method void b$b(WeakReference, JsCallback, WeakReference)>
	//  156  333:invokevirtual   #491 <Method void HuaweiApiClient.setConnectionFailedListener(com.huawei.hms.api.HuaweiApiClient$OnConnectionFailedListener)>
			((HuaweiApiClient) (loginreq)).connect(((Activity) (obj)));
	//  157  336:aload_1         
	//  158  337:aload           9
	//  159  339:invokevirtual   #495 <Method void HuaweiApiClient.connect(Activity)>
			return;
	//  160  342:return          
		}
	}

	public void startResolutionForResult(StartIntentReq startintentreq, JsCallback jscallback)
	{
		Log.i("HmsCoreApi", "JS hmsInvoke startResolutionForResult");
	//    0    0:ldc1            #18  <String "HmsCoreApi">
	//    1    2:ldc2            #567 <String "JS hmsInvoke startResolutionForResult">
	//    2    5:invokestatic    #148 <Method int Log.i(String, String)>
	//    3    8:pop             
		WebView webview = jscallback.getWebView();
	//    4    9:aload_2         
	//    5   10:invokevirtual   #428 <Method WebView JsCallback.getWebView()>
	//    6   13:astore_3        
		if(webview == null)
	//*   7   14:aload_3         
	//*   8   15:ifnonnull       23
		{
			jscallback.failure();
	//    9   18:aload_2         
	//   10   19:invokevirtual   #208 <Method void JsCallback.failure()>
			return;
	//   11   22:return          
		}
		if(startintentreq == null)
	//*  12   23:aload_1         
	//*  13   24:ifnonnull       43
		{
			Log.e("HmsCoreApi", "JS hmsInvoke startResolutionForResult req null");
	//   14   27:ldc1            #18  <String "HmsCoreApi">
	//   15   29:ldc2            #569 <String "JS hmsInvoke startResolutionForResult req null">
	//   16   32:invokestatic    #196 <Method int Log.e(String, String)>
	//   17   35:pop             
			jscallback.failure(13);
	//   18   36:aload_2         
	//   19   37:bipush          13
	//   20   39:invokevirtual   #231 <Method void JsCallback.failure(int)>
			return;
	//   21   42:return          
		}
		String s = StartIntentReq.access._mth700(startintentreq);
	//   22   43:aload_1         
	//   23   44:invokestatic    #572 <Method String HmsCoreApi$StartIntentReq.access$700(HmsCoreApi$StartIntentReq)>
	//   24   47:astore          4
		if(TextUtils.isEmpty(((CharSequence) (s))))
	//*  25   49:aload           4
	//*  26   51:invokestatic    #127 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  27   54:ifeq            73
		{
			Log.e("HmsCoreApi", "JS hmsInvoke startResolutionForResult intentId null");
	//   28   57:ldc1            #18  <String "HmsCoreApi">
	//   29   59:ldc2            #574 <String "JS hmsInvoke startResolutionForResult intentId null">
	//   30   62:invokestatic    #196 <Method int Log.e(String, String)>
	//   31   65:pop             
			jscallback.failure(13);
	//   32   66:aload_2         
	//   33   67:bipush          13
	//   34   69:invokevirtual   #231 <Method void JsCallback.failure(int)>
			return;
	//   35   72:return          
		}
		String s1 = startintentreq.getAppId();
	//   36   73:aload_1         
	//   37   74:invokevirtual   #575 <Method String HmsCoreApi$StartIntentReq.getAppId()>
	//   38   77:astore          5
		if(!s.startsWith(s1))
	//*  39   79:aload           4
	//*  40   81:aload           5
	//*  41   83:invokevirtual   #343 <Method boolean String.startsWith(String)>
	//*  42   86:ifne            106
		{
			Log.e("HmsCoreApi", "JS hmsInvoke startResolutionForResult invalid intent id");
	//   43   89:ldc1            #18  <String "HmsCoreApi">
	//   44   91:ldc2            #577 <String "JS hmsInvoke startResolutionForResult invalid intent id">
	//   45   94:invokestatic    #196 <Method int Log.e(String, String)>
	//   46   97:pop             
			jscallback.failure("invalid intent id");
	//   47   98:aload_2         
	//   48   99:ldc2            #579 <String "invalid intent id">
	//   49  102:invokevirtual   #245 <Method void JsCallback.failure(String)>
			return;
	//   50  105:return          
		} else
		{
			a(startintentreq, jscallback, webview, s, s1);
	//   51  106:aload_0         
	//   52  107:aload_1         
	//   53  108:aload_2         
	//   54  109:aload_3         
	//   55  110:aload           4
	//   56  112:aload           5
	//   57  114:invokespecial   #581 <Method void a(HmsCoreApi$StartIntentReq, JsCallback, WebView, String, String)>
			return;
	//   58  117:return          
		}
	}

	private static final String a = "HmsCoreApi";
	private static final int b = 9001;
	private static final int c = 9002;
	private static final Api d = new Api("HuaweiPay.API");

	static 
	{
	//    0    0:new             #30  <Class Api>
	//    1    3:dup             
	//    2    4:ldc1            #32  <String "HuaweiPay.API">
	//    3    6:invokespecial   #36  <Method void Api(String)>
	//    4    9:putstatic       #38  <Field Api d>
	//*   5   12:return          
	}

	/* member class not found */
	class _cls3 {}


	/* member class not found */
	class _cls2 {}


	/* member class not found */
	class _cls1 {}

}

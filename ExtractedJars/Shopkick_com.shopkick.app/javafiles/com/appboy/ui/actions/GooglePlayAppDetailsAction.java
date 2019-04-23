// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appboy.ui.actions;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import com.appboy.enums.AppStore;
import com.appboy.enums.Channel;
import com.appboy.support.AppboyLogger;

// Referenced classes of package com.appboy.ui.actions:
//			IAction, UriAction

public final class GooglePlayAppDetailsAction
	implements IAction
{

	public GooglePlayAppDetailsAction(String s, boolean flag, AppStore appstore, String s1, Channel channel)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #43  <Method void Object()>
		mPackageName = s;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #45  <Field String mPackageName>
		mUseWebView = flag;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #47  <Field boolean mUseWebView>
		mAppStore = appstore;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #49  <Field AppStore mAppStore>
		mKindleId = s1;
	//   11   19:aload_0         
	//   12   20:aload           4
	//   13   22:putfield        #51  <Field String mKindleId>
		mChannel = channel;
	//   14   25:aload_0         
	//   15   26:aload           5
	//   16   28:putfield        #53  <Field Channel mChannel>
	//   17   31:return          
	}

	public void execute(Context context)
	{
		Object obj2;
		if(mAppStore != AppStore.KINDLE_STORE)
	//*   0    0:aload_0         
	//*   1    1:getfield        #49  <Field AppStore mAppStore>
	//*   2    4:getstatic       #64  <Field AppStore AppStore.KINDLE_STORE>
	//*   3    7:if_acmpeq       55
			try
			{
				context.getPackageManager().getPackageInfo("com.google.android.gsf", 0);
	//    4   10:aload_1         
	//    5   11:invokevirtual   #70  <Method PackageManager Context.getPackageManager()>
	//    6   14:ldc1            #72  <String "com.google.android.gsf">
	//    7   16:iconst_0        
	//    8   17:invokevirtual   #78  <Method android.content.pm.PackageInfo PackageManager.getPackageInfo(String, int)>
	//    9   20:pop             
			}
	//*  10   21:goto            55
	//*  11   24:getstatic       #38  <Field String TAG>
	//*  12   27:ldc1            #80  <String "Unexpected exception while checking for com.google.android.gsf.">
	//*  13   29:invokestatic    #84  <Method int AppboyLogger.e(String, String)>
	//*  14   32:pop             
	//*  15   33:aload_0         
	//*  16   34:iconst_1        
	//*  17   35:putfield        #47  <Field boolean mUseWebView>
	//*  18   38:goto            55
	//*  19   41:getstatic       #38  <Field String TAG>
	//*  20   44:ldc1            #86  <String "Google Play Store not found, launching Play Store with WebView">
	//*  21   46:invokestatic    #89  <Method int AppboyLogger.i(String, String)>
	//*  22   49:pop             
	//*  23   50:aload_0         
	//*  24   51:iconst_1        
	//*  25   52:putfield        #47  <Field boolean mUseWebView>
	//*  26   55:aload_0         
	//*  27   56:getfield        #47  <Field boolean mUseWebView>
	//*  28   59:ifeq            143
	//*  29   62:aload_0         
	//*  30   63:getfield        #49  <Field AppStore mAppStore>
	//*  31   66:getstatic       #64  <Field AppStore AppStore.KINDLE_STORE>
	//*  32   69:if_acmpne       104
	//*  33   72:new             #91  <Class StringBuilder>
	//*  34   75:dup             
	//*  35   76:invokespecial   #92  <Method void StringBuilder()>
	//*  36   79:astore_2        
	//*  37   80:aload_2         
	//*  38   81:ldc1            #13  <String "http://www.amazon.com/gp/mas/dl/android?asin=">
	//*  39   83:invokevirtual   #96  <Method StringBuilder StringBuilder.append(String)>
	//*  40   86:pop             
	//*  41   87:aload_2         
	//*  42   88:aload_0         
	//*  43   89:getfield        #51  <Field String mKindleId>
	//*  44   92:invokevirtual   #96  <Method StringBuilder StringBuilder.append(String)>
	//*  45   95:pop             
	//*  46   96:aload_2         
	//*  47   97:invokevirtual   #100 <Method String StringBuilder.toString()>
	//*  48  100:astore_2        
	//*  49  101:goto            133
	//*  50  104:new             #91  <Class StringBuilder>
	//*  51  107:dup             
	//*  52  108:invokespecial   #92  <Method void StringBuilder()>
	//*  53  111:astore_2        
	//*  54  112:aload_2         
	//*  55  113:ldc1            #19  <String "https://play.google.com/store/apps/details?id=">
	//*  56  115:invokevirtual   #96  <Method StringBuilder StringBuilder.append(String)>
	//*  57  118:pop             
	//*  58  119:aload_2         
	//*  59  120:aload_0         
	//*  60  121:getfield        #45  <Field String mPackageName>
	//*  61  124:invokevirtual   #96  <Method StringBuilder StringBuilder.append(String)>
	//*  62  127:pop             
	//*  63  128:aload_2         
	//*  64  129:invokevirtual   #100 <Method String StringBuilder.toString()>
	//*  65  132:astore_2        
	//*  66  133:aload_1         
	//*  67  134:aload_2         
	//*  68  135:invokestatic    #106 <Method Uri Uri.parse(String)>
	//*  69  138:aconst_null     
	//*  70  139:invokestatic    #112 <Method void UriAction.openUriWithWebViewActivity(Context, Uri, android.os.Bundle)>
	//*  71  142:return          
	//*  72  143:aload_0         
	//*  73  144:getfield        #49  <Field AppStore mAppStore>
	//*  74  147:getstatic       #64  <Field AppStore AppStore.KINDLE_STORE>
	//*  75  150:if_acmpne       185
	//*  76  153:new             #91  <Class StringBuilder>
	//*  77  156:dup             
	//*  78  157:invokespecial   #92  <Method void StringBuilder()>
	//*  79  160:astore_2        
	//*  80  161:aload_2         
	//*  81  162:ldc1            #10  <String "amzn://apps/android?asin=">
	//*  82  164:invokevirtual   #96  <Method StringBuilder StringBuilder.append(String)>
	//*  83  167:pop             
	//*  84  168:aload_2         
	//*  85  169:aload_0         
	//*  86  170:getfield        #51  <Field String mKindleId>
	//*  87  173:invokevirtual   #96  <Method StringBuilder StringBuilder.append(String)>
	//*  88  176:pop             
	//*  89  177:aload_2         
	//*  90  178:invokevirtual   #100 <Method String StringBuilder.toString()>
	//*  91  181:astore_2        
	//*  92  182:goto            214
	//*  93  185:new             #91  <Class StringBuilder>
	//*  94  188:dup             
	//*  95  189:invokespecial   #92  <Method void StringBuilder()>
	//*  96  192:astore_2        
	//*  97  193:aload_2         
	//*  98  194:ldc1            #16  <String "market://details?id=">
	//*  99  196:invokevirtual   #96  <Method StringBuilder StringBuilder.append(String)>
	//* 100  199:pop             
	//* 101  200:aload_2         
	//* 102  201:aload_0         
	//* 103  202:getfield        #45  <Field String mPackageName>
	//* 104  205:invokevirtual   #96  <Method StringBuilder StringBuilder.append(String)>
	//* 105  208:pop             
	//* 106  209:aload_2         
	//* 107  210:invokevirtual   #100 <Method String StringBuilder.toString()>
	//* 108  213:astore_2        
	//* 109  214:aload_1         
	//* 110  215:new             #114 <Class Intent>
	//* 111  218:dup             
	//* 112  219:ldc1            #116 <String "android.intent.action.VIEW">
	//* 113  221:aload_2         
	//* 114  222:invokestatic    #106 <Method Uri Uri.parse(String)>
	//* 115  225:invokespecial   #119 <Method void Intent(String, Uri)>
	//* 116  228:invokevirtual   #123 <Method void Context.startActivity(Intent)>
	//* 117  231:return          
			// Misplaced declaration of an exception variable
			catch(Object obj2)
			{
				AppboyLogger.i(TAG, "Google Play Store not found, launching Play Store with WebView");
				mUseWebView = true;
			}
	//* 118  232:astore_2        
	//* 119  233:goto            41
			// Misplaced declaration of an exception variable
			catch(Object obj2)
			{
				AppboyLogger.e(TAG, "Unexpected exception while checking for com.google.android.gsf.");
				mUseWebView = true;
			}
		if(mUseWebView)
		{
			Object obj;
			if(mAppStore == AppStore.KINDLE_STORE)
			{
				obj = ((Object) (new StringBuilder()));
				((StringBuilder) (obj)).append("http://www.amazon.com/gp/mas/dl/android?asin=");
				((StringBuilder) (obj)).append(mKindleId);
				obj = ((Object) (((StringBuilder) (obj)).toString()));
			} else
			{
				obj = ((Object) (new StringBuilder()));
				((StringBuilder) (obj)).append("https://play.google.com/store/apps/details?id=");
				((StringBuilder) (obj)).append(mPackageName);
				obj = ((Object) (((StringBuilder) (obj)).toString()));
			}
			UriAction.openUriWithWebViewActivity(context, Uri.parse(((String) (obj))), ((android.os.Bundle) (null)));
			return;
		}
		Object obj1;
		if(mAppStore == AppStore.KINDLE_STORE)
		{
			obj1 = ((Object) (new StringBuilder()));
			((StringBuilder) (obj1)).append("amzn://apps/android?asin=");
			((StringBuilder) (obj1)).append(mKindleId);
			obj1 = ((Object) (((StringBuilder) (obj1)).toString()));
		} else
		{
			obj1 = ((Object) (new StringBuilder()));
			((StringBuilder) (obj1)).append("market://details?id=");
			((StringBuilder) (obj1)).append(mPackageName);
			obj1 = ((Object) (((StringBuilder) (obj1)).toString()));
		}
		context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(((String) (obj1)))));
	//* 120  236:astore_2        
	//* 121  237:goto            24
	}

	public Channel getChannel()
	{
		return mChannel;
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field Channel mChannel>
	//    2    4:areturn         
	}

	public boolean getUseWebView()
	{
		return mUseWebView;
	//    0    0:aload_0         
	//    1    1:getfield        #47  <Field boolean mUseWebView>
	//    2    4:ireturn         
	}

	private static final String AMAZON_STORE_APP_BASE = "amzn://apps/android?asin=";
	private static final String AMAZON_STORE_WEB_BASE = "http://www.amazon.com/gp/mas/dl/android?asin=";
	private static final String PLAY_STORE_APP_BASE = "market://details?id=";
	private static final String PLAY_STORE_WEB_BASE = "https://play.google.com/store/apps/details?id=";
	private static final String TAG = AppboyLogger.getAppboyLogTag(com/appboy/ui/actions/GooglePlayAppDetailsAction);
	private final AppStore mAppStore;
	private final Channel mChannel;
	private final String mKindleId;
	private final String mPackageName;
	private boolean mUseWebView;

	static 
	{
	//    0    0:ldc1            #2   <Class GooglePlayAppDetailsAction>
	//    1    2:invokestatic    #36  <Method String AppboyLogger.getAppboyLogTag(Class)>
	//    2    5:putstatic       #38  <Field String TAG>
	//*   3    8:return          
	}
}

// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appboy.ui.actions;

import android.content.*;
import android.content.pm.*;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.TaskStackBuilder;
import android.util.Log;
import com.appboy.configuration.AppboyConfigurationProvider;
import com.appboy.enums.Channel;
import com.appboy.support.*;
import com.appboy.ui.AppboyWebViewActivity;
import com.appboy.ui.support.UriUtils;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.appboy.ui.actions:
//			IAction

public class UriAction
	implements IAction
{

	UriAction(Uri uri, Bundle bundle, boolean flag, Channel channel)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #32  <Method void Object()>
		mUri = uri;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #34  <Field Uri mUri>
		mExtras = bundle;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #36  <Field Bundle mExtras>
		mUseWebView = flag;
	//    8   14:aload_0         
	//    9   15:iload_3         
	//   10   16:putfield        #38  <Field boolean mUseWebView>
		mChannel = channel;
	//   11   19:aload_0         
	//   12   20:aload           4
	//   13   22:putfield        #40  <Field Channel mChannel>
	//   14   25:return          
	}

	private static Intent getActionViewIntent(Context context, Uri uri, Bundle bundle)
	{
		Intent intent;
label0:
		{
			intent = new Intent("android.intent.action.VIEW");
	//    0    0:new             #45  <Class Intent>
	//    1    3:dup             
	//    2    4:ldc1            #47  <String "android.intent.action.VIEW">
	//    3    6:invokespecial   #50  <Method void Intent(String)>
	//    4    9:astore_3        
			intent.setData(uri);
	//    5   10:aload_3         
	//    6   11:aload_1         
	//    7   12:invokevirtual   #54  <Method Intent Intent.setData(Uri)>
	//    8   15:pop             
			if(bundle != null)
	//*   9   16:aload_2         
	//*  10   17:ifnull          26
				intent.putExtras(bundle);
	//   11   20:aload_3         
	//   12   21:aload_2         
	//   13   22:invokevirtual   #58  <Method Intent Intent.putExtras(Bundle)>
	//   14   25:pop             
			uri = ((Uri) (context.getPackageManager().queryIntentActivities(intent, 0)));
	//   15   26:aload_0         
	//   16   27:invokevirtual   #64  <Method PackageManager Context.getPackageManager()>
	//   17   30:aload_3         
	//   18   31:iconst_0        
	//   19   32:invokevirtual   #70  <Method List PackageManager.queryIntentActivities(Intent, int)>
	//   20   35:astore_1        
			if(((List) (uri)).size() <= 1)
				break label0;
	//   21   36:aload_1         
	//   22   37:invokeinterface #76  <Method int List.size()>
	//   23   42:iconst_1        
	//   24   43:icmple          148
			bundle = ((Bundle) (((List) (uri)).iterator()));
	//   25   46:aload_1         
	//   26   47:invokeinterface #80  <Method Iterator List.iterator()>
	//   27   52:astore_2        
			do
			{
				if(!((Iterator) (bundle)).hasNext())
					break label0;
	//   28   53:aload_2         
	//   29   54:invokeinterface #86  <Method boolean Iterator.hasNext()>
	//   30   59:ifeq            148
				uri = ((Uri) ((ResolveInfo)((Iterator) (bundle)).next()));
	//   31   62:aload_2         
	//   32   63:invokeinterface #90  <Method Object Iterator.next()>
	//   33   68:checkcast       #92  <Class ResolveInfo>
	//   34   71:astore_1        
			} while(!((ResolveInfo) (uri)).activityInfo.packageName.equals(((Object) (context.getPackageName()))));
	//   35   72:aload_1         
	//   36   73:getfield        #96  <Field ActivityInfo ResolveInfo.activityInfo>
	//   37   76:getfield        #101 <Field String ActivityInfo.packageName>
	//   38   79:aload_0         
	//   39   80:invokevirtual   #105 <Method String Context.getPackageName()>
	//   40   83:invokevirtual   #111 <Method boolean String.equals(Object)>
	//   41   86:ifeq            53
			context = ((Context) (TAG));
	//   42   89:getstatic       #26  <Field String TAG>
	//   43   92:astore_0        
			bundle = ((Bundle) (new StringBuilder()));
	//   44   93:new             #113 <Class StringBuilder>
	//   45   96:dup             
	//   46   97:invokespecial   #114 <Method void StringBuilder()>
	//   47  100:astore_2        
			((StringBuilder) (bundle)).append("Setting deep link activity to ");
	//   48  101:aload_2         
	//   49  102:ldc1            #116 <String "Setting deep link activity to ">
	//   50  104:invokevirtual   #120 <Method StringBuilder StringBuilder.append(String)>
	//   51  107:pop             
			((StringBuilder) (bundle)).append(((ResolveInfo) (uri)).activityInfo.packageName);
	//   52  108:aload_2         
	//   53  109:aload_1         
	//   54  110:getfield        #96  <Field ActivityInfo ResolveInfo.activityInfo>
	//   55  113:getfield        #101 <Field String ActivityInfo.packageName>
	//   56  116:invokevirtual   #120 <Method StringBuilder StringBuilder.append(String)>
	//   57  119:pop             
			((StringBuilder) (bundle)).append(".");
	//   58  120:aload_2         
	//   59  121:ldc1            #122 <String ".">
	//   60  123:invokevirtual   #120 <Method StringBuilder StringBuilder.append(String)>
	//   61  126:pop             
			Log.d(((String) (context)), ((StringBuilder) (bundle)).toString());
	//   62  127:aload_0         
	//   63  128:aload_2         
	//   64  129:invokevirtual   #125 <Method String StringBuilder.toString()>
	//   65  132:invokestatic    #131 <Method int Log.d(String, String)>
	//   66  135:pop             
			intent.setPackage(((ResolveInfo) (uri)).activityInfo.packageName);
	//   67  136:aload_3         
	//   68  137:aload_1         
	//   69  138:getfield        #96  <Field ActivityInfo ResolveInfo.activityInfo>
	//   70  141:getfield        #101 <Field String ActivityInfo.packageName>
	//   71  144:invokevirtual   #135 <Method Intent Intent.setPackage(String)>
	//   72  147:pop             
		}
		return intent;
	//   73  148:aload_3         
	//   74  149:areturn         
	}

	private static TaskStackBuilder getConfiguredTaskBackStackBuilder(Context context, Bundle bundle)
	{
		Object obj = ((Object) (new AppboyConfigurationProvider(context)));
	//    0    0:new             #139 <Class AppboyConfigurationProvider>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #142 <Method void AppboyConfigurationProvider(Context)>
	//    4    8:astore_3        
		TaskStackBuilder taskstackbuilder = TaskStackBuilder.create(context);
	//    5    9:aload_0         
	//    6   10:invokestatic    #148 <Method TaskStackBuilder TaskStackBuilder.create(Context)>
	//    7   13:astore_2        
		if(((AppboyConfigurationProvider) (obj)).getIsPushDeepLinkBackStackActivityEnabled())
	//*   8   14:aload_3         
	//*   9   15:invokevirtual   #151 <Method boolean AppboyConfigurationProvider.getIsPushDeepLinkBackStackActivityEnabled()>
	//*  10   18:ifeq            155
		{
			obj = ((Object) (((AppboyConfigurationProvider) (obj)).getPushDeepLinkBackStackActivityClassName()));
	//   11   21:aload_3         
	//   12   22:invokevirtual   #154 <Method String AppboyConfigurationProvider.getPushDeepLinkBackStackActivityClassName()>
	//   13   25:astore_3        
			if(StringUtils.isNullOrBlank(((String) (obj))))
	//*  14   26:aload_3         
	//*  15   27:invokestatic    #160 <Method boolean StringUtils.isNullOrBlank(String)>
	//*  16   30:ifeq            54
			{
				AppboyLogger.i(TAG, "Adding main activity intent to back stack while opening uri from push");
	//   17   33:getstatic       #26  <Field String TAG>
	//   18   36:ldc1            #162 <String "Adding main activity intent to back stack while opening uri from push">
	//   19   38:invokestatic    #165 <Method int AppboyLogger.i(String, String)>
	//   20   41:pop             
				taskstackbuilder.addNextIntent(UriUtils.getMainActivityIntent(context, bundle));
	//   21   42:aload_2         
	//   22   43:aload_0         
	//   23   44:aload_1         
	//   24   45:invokestatic    #171 <Method Intent UriUtils.getMainActivityIntent(Context, Bundle)>
	//   25   48:invokevirtual   #175 <Method TaskStackBuilder TaskStackBuilder.addNextIntent(Intent)>
	//   26   51:pop             
				return taskstackbuilder;
	//   27   52:aload_2         
	//   28   53:areturn         
			}
			if(UriUtils.isActivityRegisteredInManifest(context, ((String) (obj))))
	//*  29   54:aload_0         
	//*  30   55:aload_3         
	//*  31   56:invokestatic    #179 <Method boolean UriUtils.isActivityRegisteredInManifest(Context, String)>
	//*  32   59:ifeq            119
			{
				bundle = ((Bundle) (TAG));
	//   33   62:getstatic       #26  <Field String TAG>
	//   34   65:astore_1        
				StringBuilder stringbuilder = new StringBuilder();
	//   35   66:new             #113 <Class StringBuilder>
	//   36   69:dup             
	//   37   70:invokespecial   #114 <Method void StringBuilder()>
	//   38   73:astore          4
				stringbuilder.append("Adding custom back stack activity while opening uri from push: ");
	//   39   75:aload           4
	//   40   77:ldc1            #181 <String "Adding custom back stack activity while opening uri from push: ">
	//   41   79:invokevirtual   #120 <Method StringBuilder StringBuilder.append(String)>
	//   42   82:pop             
				stringbuilder.append(((String) (obj)));
	//   43   83:aload           4
	//   44   85:aload_3         
	//   45   86:invokevirtual   #120 <Method StringBuilder StringBuilder.append(String)>
	//   46   89:pop             
				AppboyLogger.i(((String) (bundle)), stringbuilder.toString());
	//   47   90:aload_1         
	//   48   91:aload           4
	//   49   93:invokevirtual   #125 <Method String StringBuilder.toString()>
	//   50   96:invokestatic    #165 <Method int AppboyLogger.i(String, String)>
	//   51   99:pop             
				taskstackbuilder.addNextIntent((new Intent()).setClassName(context, ((String) (obj))));
	//   52  100:aload_2         
	//   53  101:new             #45  <Class Intent>
	//   54  104:dup             
	//   55  105:invokespecial   #182 <Method void Intent()>
	//   56  108:aload_0         
	//   57  109:aload_3         
	//   58  110:invokevirtual   #186 <Method Intent Intent.setClassName(Context, String)>
	//   59  113:invokevirtual   #175 <Method TaskStackBuilder TaskStackBuilder.addNextIntent(Intent)>
	//   60  116:pop             
				return taskstackbuilder;
	//   61  117:aload_2         
	//   62  118:areturn         
			} else
			{
				context = ((Context) (TAG));
	//   63  119:getstatic       #26  <Field String TAG>
	//   64  122:astore_0        
				bundle = ((Bundle) (new StringBuilder()));
	//   65  123:new             #113 <Class StringBuilder>
	//   66  126:dup             
	//   67  127:invokespecial   #114 <Method void StringBuilder()>
	//   68  130:astore_1        
				((StringBuilder) (bundle)).append("Not adding unregistered activity to the back stack while opening uri from push: ");
	//   69  131:aload_1         
	//   70  132:ldc1            #188 <String "Not adding unregistered activity to the back stack while opening uri from push: ">
	//   71  134:invokevirtual   #120 <Method StringBuilder StringBuilder.append(String)>
	//   72  137:pop             
				((StringBuilder) (bundle)).append(((String) (obj)));
	//   73  138:aload_1         
	//   74  139:aload_3         
	//   75  140:invokevirtual   #120 <Method StringBuilder StringBuilder.append(String)>
	//   76  143:pop             
				AppboyLogger.i(((String) (context)), ((StringBuilder) (bundle)).toString());
	//   77  144:aload_0         
	//   78  145:aload_1         
	//   79  146:invokevirtual   #125 <Method String StringBuilder.toString()>
	//   80  149:invokestatic    #165 <Method int AppboyLogger.i(String, String)>
	//   81  152:pop             
				return taskstackbuilder;
	//   82  153:aload_2         
	//   83  154:areturn         
			}
		} else
		{
			AppboyLogger.i(TAG, "Not adding back stack activity while opening uri from push due to disabled configuration setting.");
	//   84  155:getstatic       #26  <Field String TAG>
	//   85  158:ldc1            #190 <String "Not adding back stack activity while opening uri from push due to disabled configuration setting.">
	//   86  160:invokestatic    #165 <Method int AppboyLogger.i(String, String)>
	//   87  163:pop             
			return taskstackbuilder;
	//   88  164:aload_2         
	//   89  165:areturn         
		}
	}

	private static Intent getWebViewActivityIntent(Context context, Uri uri, Bundle bundle)
	{
		context = ((Context) (new Intent(context, com/appboy/ui/AppboyWebViewActivity)));
	//    0    0:new             #45  <Class Intent>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:ldc1            #193 <Class AppboyWebViewActivity>
	//    4    7:invokespecial   #196 <Method void Intent(Context, Class)>
	//    5   10:astore_0        
		if(bundle != null)
	//*   6   11:aload_2         
	//*   7   12:ifnull          21
			((Intent) (context)).putExtras(bundle);
	//    8   15:aload_0         
	//    9   16:aload_2         
	//   10   17:invokevirtual   #58  <Method Intent Intent.putExtras(Bundle)>
	//   11   20:pop             
		((Intent) (context)).putExtra("url", uri.toString());
	//   12   21:aload_0         
	//   13   22:ldc1            #198 <String "url">
	//   14   24:aload_1         
	//   15   25:invokevirtual   #201 <Method String Uri.toString()>
	//   16   28:invokevirtual   #205 <Method Intent Intent.putExtra(String, String)>
	//   17   31:pop             
		return ((Intent) (context));
	//   18   32:aload_0         
	//   19   33:areturn         
	}

	private static void openUriWithActionView(Context context, Uri uri, Bundle bundle)
	{
		bundle = ((Bundle) (getActionViewIntent(context, uri, bundle)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokestatic    #209 <Method Intent getActionViewIntent(Context, Uri, Bundle)>
	//    4    6:astore_2        
		((Intent) (bundle)).setFlags(0x34000000);
	//    5    7:aload_2         
	//    6    8:ldc1            #210 <Int 0x34000000>
	//    7   10:invokevirtual   #214 <Method Intent Intent.setFlags(int)>
	//    8   13:pop             
		if(((Intent) (bundle)).resolveActivity(context.getPackageManager()) != null)
	//*   9   14:aload_2         
	//*  10   15:aload_0         
	//*  11   16:invokevirtual   #64  <Method PackageManager Context.getPackageManager()>
	//*  12   19:invokevirtual   #218 <Method android.content.ComponentName Intent.resolveActivity(PackageManager)>
	//*  13   22:ifnull          31
		{
			context.startActivity(((Intent) (bundle)));
	//   14   25:aload_0         
	//   15   26:aload_2         
	//   16   27:invokevirtual   #222 <Method void Context.startActivity(Intent)>
			return;
	//   17   30:return          
		} else
		{
			context = ((Context) (TAG));
	//   18   31:getstatic       #26  <Field String TAG>
	//   19   34:astore_0        
			bundle = ((Bundle) (new StringBuilder()));
	//   20   35:new             #113 <Class StringBuilder>
	//   21   38:dup             
	//   22   39:invokespecial   #114 <Method void StringBuilder()>
	//   23   42:astore_2        
			((StringBuilder) (bundle)).append("Could not find appropriate activity to open for deep link ");
	//   24   43:aload_2         
	//   25   44:ldc1            #224 <String "Could not find appropriate activity to open for deep link ">
	//   26   46:invokevirtual   #120 <Method StringBuilder StringBuilder.append(String)>
	//   27   49:pop             
			((StringBuilder) (bundle)).append(((Object) (uri)));
	//   28   50:aload_2         
	//   29   51:aload_1         
	//   30   52:invokevirtual   #227 <Method StringBuilder StringBuilder.append(Object)>
	//   31   55:pop             
			((StringBuilder) (bundle)).append(".");
	//   32   56:aload_2         
	//   33   57:ldc1            #122 <String ".">
	//   34   59:invokevirtual   #120 <Method StringBuilder StringBuilder.append(String)>
	//   35   62:pop             
			Log.w(((String) (context)), ((StringBuilder) (bundle)).toString());
	//   36   63:aload_0         
	//   37   64:aload_2         
	//   38   65:invokevirtual   #125 <Method String StringBuilder.toString()>
	//   39   68:invokestatic    #230 <Method int Log.w(String, String)>
	//   40   71:pop             
			return;
	//   41   72:return          
		}
	}

	private static void openUriWithActionViewFromPush(Context context, Uri uri, Bundle bundle)
	{
		Object obj = ((Object) (getConfiguredTaskBackStackBuilder(context, bundle)));
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:invokestatic    #235 <Method TaskStackBuilder getConfiguredTaskBackStackBuilder(Context, Bundle)>
	//    3    5:astore_3        
		((TaskStackBuilder) (obj)).addNextIntent(getActionViewIntent(context, uri, bundle));
	//    4    6:aload_3         
	//    5    7:aload_0         
	//    6    8:aload_1         
	//    7    9:aload_2         
	//    8   10:invokestatic    #209 <Method Intent getActionViewIntent(Context, Uri, Bundle)>
	//    9   13:invokevirtual   #175 <Method TaskStackBuilder TaskStackBuilder.addNextIntent(Intent)>
	//   10   16:pop             
		try
		{
			((TaskStackBuilder) (obj)).startActivities(bundle);
	//   11   17:aload_3         
	//   12   18:aload_2         
	//   13   19:invokevirtual   #239 <Method void TaskStackBuilder.startActivities(Bundle)>
			return;
	//   14   22:return          
		}
		// Misplaced declaration of an exception variable
		catch(Context context)
	//*  15   23:astore_0        
		{
			bundle = ((Bundle) (TAG));
	//   16   24:getstatic       #26  <Field String TAG>
	//   17   27:astore_2        
		}
		obj = ((Object) (new StringBuilder()));
	//   18   28:new             #113 <Class StringBuilder>
	//   19   31:dup             
	//   20   32:invokespecial   #114 <Method void StringBuilder()>
	//   21   35:astore_3        
		((StringBuilder) (obj)).append("Could not find appropriate activity to open for deep link ");
	//   22   36:aload_3         
	//   23   37:ldc1            #224 <String "Could not find appropriate activity to open for deep link ">
	//   24   39:invokevirtual   #120 <Method StringBuilder StringBuilder.append(String)>
	//   25   42:pop             
		((StringBuilder) (obj)).append(((Object) (uri)));
	//   26   43:aload_3         
	//   27   44:aload_1         
	//   28   45:invokevirtual   #227 <Method StringBuilder StringBuilder.append(Object)>
	//   29   48:pop             
		Log.w(((String) (bundle)), ((StringBuilder) (obj)).toString(), ((Throwable) (context)));
	//   30   49:aload_2         
	//   31   50:aload_3         
	//   32   51:invokevirtual   #125 <Method String StringBuilder.toString()>
	//   33   54:aload_0         
	//   34   55:invokestatic    #242 <Method int Log.w(String, String, Throwable)>
	//   35   58:pop             
	//   36   59:return          
	}

	static void openUriWithWebViewActivity(Context context, Uri uri, Bundle bundle)
	{
		uri = ((Uri) (getWebViewActivityIntent(context, uri, bundle)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokestatic    #247 <Method Intent getWebViewActivityIntent(Context, Uri, Bundle)>
	//    4    6:astore_1        
		((Intent) (uri)).setFlags(0x34000000);
	//    5    7:aload_1         
	//    6    8:ldc1            #210 <Int 0x34000000>
	//    7   10:invokevirtual   #214 <Method Intent Intent.setFlags(int)>
	//    8   13:pop             
		try
		{
			context.startActivity(((Intent) (uri)));
	//    9   14:aload_0         
	//   10   15:aload_1         
	//   11   16:invokevirtual   #222 <Method void Context.startActivity(Intent)>
			return;
	//   12   19:return          
		}
		// Misplaced declaration of an exception variable
		catch(Context context)
	//*  13   20:astore_0        
		{
			AppboyLogger.e(TAG, "Appboy AppboyWebViewActivity not opened successfully.", ((Throwable) (context)));
	//   14   21:getstatic       #26  <Field String TAG>
	//   15   24:ldc1            #249 <String "Appboy AppboyWebViewActivity not opened successfully.">
	//   16   26:aload_0         
	//   17   27:invokestatic    #252 <Method int AppboyLogger.e(String, String, Throwable)>
	//   18   30:pop             
		}
	//   19   31:return          
	}

	private static void openUriWithWebViewActivityFromPush(Context context, Uri uri, Bundle bundle)
	{
		TaskStackBuilder taskstackbuilder = getConfiguredTaskBackStackBuilder(context, bundle);
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:invokestatic    #235 <Method TaskStackBuilder getConfiguredTaskBackStackBuilder(Context, Bundle)>
	//    3    5:astore_3        
		taskstackbuilder.addNextIntent(getWebViewActivityIntent(context, uri, bundle));
	//    4    6:aload_3         
	//    5    7:aload_0         
	//    6    8:aload_1         
	//    7    9:aload_2         
	//    8   10:invokestatic    #247 <Method Intent getWebViewActivityIntent(Context, Uri, Bundle)>
	//    9   13:invokevirtual   #175 <Method TaskStackBuilder TaskStackBuilder.addNextIntent(Intent)>
	//   10   16:pop             
		try
		{
			taskstackbuilder.startActivities(bundle);
	//   11   17:aload_3         
	//   12   18:aload_2         
	//   13   19:invokevirtual   #239 <Method void TaskStackBuilder.startActivities(Bundle)>
			return;
	//   14   22:return          
		}
		// Misplaced declaration of an exception variable
		catch(Context context)
	//*  15   23:astore_0        
		{
			AppboyLogger.e(TAG, "Appboy AppboyWebViewActivity not opened successfully.", ((Throwable) (context)));
	//   16   24:getstatic       #26  <Field String TAG>
	//   17   27:ldc1            #249 <String "Appboy AppboyWebViewActivity not opened successfully.">
	//   18   29:aload_0         
	//   19   30:invokestatic    #252 <Method int AppboyLogger.e(String, String, Throwable)>
	//   20   33:pop             
		}
	//   21   34:return          
	}

	public void execute(Context context)
	{
		if(AppboyFileUtils.isLocalUri(mUri))
	//*   0    0:aload_0         
	//*   1    1:getfield        #34  <Field Uri mUri>
	//*   2    4:invokestatic    #260 <Method boolean AppboyFileUtils.isLocalUri(Uri)>
	//*   3    7:ifeq            49
		{
			context = ((Context) (TAG));
	//    4   10:getstatic       #26  <Field String TAG>
	//    5   13:astore_1        
			StringBuilder stringbuilder = new StringBuilder();
	//    6   14:new             #113 <Class StringBuilder>
	//    7   17:dup             
	//    8   18:invokespecial   #114 <Method void StringBuilder()>
	//    9   21:astore_2        
			stringbuilder.append("Not executing local Uri: ");
	//   10   22:aload_2         
	//   11   23:ldc2            #262 <String "Not executing local Uri: ">
	//   12   26:invokevirtual   #120 <Method StringBuilder StringBuilder.append(String)>
	//   13   29:pop             
			stringbuilder.append(((Object) (mUri)));
	//   14   30:aload_2         
	//   15   31:aload_0         
	//   16   32:getfield        #34  <Field Uri mUri>
	//   17   35:invokevirtual   #227 <Method StringBuilder StringBuilder.append(Object)>
	//   18   38:pop             
			AppboyLogger.d(((String) (context)), stringbuilder.toString());
	//   19   39:aload_1         
	//   20   40:aload_2         
	//   21   41:invokevirtual   #125 <Method String StringBuilder.toString()>
	//   22   44:invokestatic    #263 <Method int AppboyLogger.d(String, String)>
	//   23   47:pop             
			return;
	//   24   48:return          
		}
		String s = TAG;
	//   25   49:getstatic       #26  <Field String TAG>
	//   26   52:astore_2        
		StringBuilder stringbuilder1 = new StringBuilder();
	//   27   53:new             #113 <Class StringBuilder>
	//   28   56:dup             
	//   29   57:invokespecial   #114 <Method void StringBuilder()>
	//   30   60:astore_3        
		stringbuilder1.append("Executing Uri action from channel ");
	//   31   61:aload_3         
	//   32   62:ldc2            #265 <String "Executing Uri action from channel ">
	//   33   65:invokevirtual   #120 <Method StringBuilder StringBuilder.append(String)>
	//   34   68:pop             
		stringbuilder1.append(((Object) (mChannel)));
	//   35   69:aload_3         
	//   36   70:aload_0         
	//   37   71:getfield        #40  <Field Channel mChannel>
	//   38   74:invokevirtual   #227 <Method StringBuilder StringBuilder.append(Object)>
	//   39   77:pop             
		stringbuilder1.append(": ");
	//   40   78:aload_3         
	//   41   79:ldc2            #267 <String ": ">
	//   42   82:invokevirtual   #120 <Method StringBuilder StringBuilder.append(String)>
	//   43   85:pop             
		stringbuilder1.append(((Object) (mUri)));
	//   44   86:aload_3         
	//   45   87:aload_0         
	//   46   88:getfield        #34  <Field Uri mUri>
	//   47   91:invokevirtual   #227 <Method StringBuilder StringBuilder.append(Object)>
	//   48   94:pop             
		stringbuilder1.append(". UseWebView: ");
	//   49   95:aload_3         
	//   50   96:ldc2            #269 <String ". UseWebView: ">
	//   51   99:invokevirtual   #120 <Method StringBuilder StringBuilder.append(String)>
	//   52  102:pop             
		stringbuilder1.append(mUseWebView);
	//   53  103:aload_3         
	//   54  104:aload_0         
	//   55  105:getfield        #38  <Field boolean mUseWebView>
	//   56  108:invokevirtual   #272 <Method StringBuilder StringBuilder.append(boolean)>
	//   57  111:pop             
		stringbuilder1.append(". Extras: ");
	//   58  112:aload_3         
	//   59  113:ldc2            #274 <String ". Extras: ">
	//   60  116:invokevirtual   #120 <Method StringBuilder StringBuilder.append(String)>
	//   61  119:pop             
		stringbuilder1.append(((Object) (mExtras)));
	//   62  120:aload_3         
	//   63  121:aload_0         
	//   64  122:getfield        #36  <Field Bundle mExtras>
	//   65  125:invokevirtual   #227 <Method StringBuilder StringBuilder.append(Object)>
	//   66  128:pop             
		AppboyLogger.d(s, stringbuilder1.toString());
	//   67  129:aload_2         
	//   68  130:aload_3         
	//   69  131:invokevirtual   #125 <Method String StringBuilder.toString()>
	//   70  134:invokestatic    #263 <Method int AppboyLogger.d(String, String)>
	//   71  137:pop             
		if(mUseWebView && AppboyFileUtils.REMOTE_SCHEMES.contains(((Object) (mUri.getScheme()))))
	//*  72  138:aload_0         
	//*  73  139:getfield        #38  <Field boolean mUseWebView>
	//*  74  142:ifeq            202
	//*  75  145:getstatic       #278 <Field List AppboyFileUtils.REMOTE_SCHEMES>
	//*  76  148:aload_0         
	//*  77  149:getfield        #34  <Field Uri mUri>
	//*  78  152:invokevirtual   #281 <Method String Uri.getScheme()>
	//*  79  155:invokeinterface #284 <Method boolean List.contains(Object)>
	//*  80  160:ifeq            202
			if(mChannel.equals(((Object) (Channel.PUSH))))
	//*  81  163:aload_0         
	//*  82  164:getfield        #40  <Field Channel mChannel>
	//*  83  167:getstatic       #289 <Field Channel Channel.PUSH>
	//*  84  170:invokevirtual   #290 <Method boolean Channel.equals(Object)>
	//*  85  173:ifeq            189
			{
				openUriWithWebViewActivityFromPush(context, mUri, mExtras);
	//   86  176:aload_1         
	//   87  177:aload_0         
	//   88  178:getfield        #34  <Field Uri mUri>
	//   89  181:aload_0         
	//   90  182:getfield        #36  <Field Bundle mExtras>
	//   91  185:invokestatic    #292 <Method void openUriWithWebViewActivityFromPush(Context, Uri, Bundle)>
				return;
	//   92  188:return          
			} else
			{
				openUriWithWebViewActivity(context, mUri, mExtras);
	//   93  189:aload_1         
	//   94  190:aload_0         
	//   95  191:getfield        #34  <Field Uri mUri>
	//   96  194:aload_0         
	//   97  195:getfield        #36  <Field Bundle mExtras>
	//   98  198:invokestatic    #294 <Method void openUriWithWebViewActivity(Context, Uri, Bundle)>
				return;
	//   99  201:return          
			}
		if(mChannel.equals(((Object) (Channel.PUSH))))
	//* 100  202:aload_0         
	//* 101  203:getfield        #40  <Field Channel mChannel>
	//* 102  206:getstatic       #289 <Field Channel Channel.PUSH>
	//* 103  209:invokevirtual   #290 <Method boolean Channel.equals(Object)>
	//* 104  212:ifeq            228
		{
			openUriWithActionViewFromPush(context, mUri, mExtras);
	//  105  215:aload_1         
	//  106  216:aload_0         
	//  107  217:getfield        #34  <Field Uri mUri>
	//  108  220:aload_0         
	//  109  221:getfield        #36  <Field Bundle mExtras>
	//  110  224:invokestatic    #296 <Method void openUriWithActionViewFromPush(Context, Uri, Bundle)>
			return;
	//  111  227:return          
		} else
		{
			openUriWithActionView(context, mUri, mExtras);
	//  112  228:aload_1         
	//  113  229:aload_0         
	//  114  230:getfield        #34  <Field Uri mUri>
	//  115  233:aload_0         
	//  116  234:getfield        #36  <Field Bundle mExtras>
	//  117  237:invokestatic    #298 <Method void openUriWithActionView(Context, Uri, Bundle)>
			return;
	//  118  240:return          
		}
	}

	public Channel getChannel()
	{
		return mChannel;
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field Channel mChannel>
	//    2    4:areturn         
	}

	public Bundle getExtras()
	{
		return mExtras;
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field Bundle mExtras>
	//    2    4:areturn         
	}

	public Uri getUri()
	{
		return mUri;
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field Uri mUri>
	//    2    4:areturn         
	}

	public boolean getUseWebView()
	{
		return mUseWebView;
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field boolean mUseWebView>
	//    2    4:ireturn         
	}

	public void setUri(Uri uri)
	{
		mUri = uri;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #34  <Field Uri mUri>
	//    3    5:return          
	}

	public void setUseWebView(boolean flag)
	{
		mUseWebView = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #38  <Field boolean mUseWebView>
	//    3    5:return          
	}

	private static final String TAG = AppboyLogger.getAppboyLogTag(com/appboy/ui/actions/UriAction);
	private final Channel mChannel;
	private final Bundle mExtras;
	private Uri mUri;
	private boolean mUseWebView;

	static 
	{
	//    0    0:ldc1            #2   <Class UriAction>
	//    1    2:invokestatic    #24  <Method String AppboyLogger.getAppboyLogTag(Class)>
	//    2    5:putstatic       #26  <Field String TAG>
	//*   3    8:return          
	}
}

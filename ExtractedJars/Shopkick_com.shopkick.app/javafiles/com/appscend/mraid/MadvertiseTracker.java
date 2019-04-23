// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appscend.mraid;

import android.content.*;
import android.net.Uri;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.params.HttpConnectionParams;

// Referenced classes of package com.appscend.mraid:
//			MadvertiseUtil

public class MadvertiseTracker
{

	public MadvertiseTracker()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #37  <Method void Object()>
		mIsDebugMode = false;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #39  <Field boolean mIsDebugMode>
	//    5    9:return          
	}

	public static MadvertiseTracker getInstance(Context context)
	{
		if(mInstance == null)
	//*   0    0:getstatic       #60  <Field MadvertiseTracker mInstance>
	//*   1    3:ifnonnull       16
			mInstance = new MadvertiseTracker();
	//    2    6:new             #2   <Class MadvertiseTracker>
	//    3    9:dup             
	//    4   10:invokespecial   #61  <Method void MadvertiseTracker()>
	//    5   13:putstatic       #60  <Field MadvertiseTracker mInstance>
		mInstance.startNewSession(context);
	//    6   16:getstatic       #60  <Field MadvertiseTracker mInstance>
	//    7   19:aload_0         
	//    8   20:invokevirtual   #65  <Method void startNewSession(Context)>
		return mInstance;
	//    9   23:getstatic       #60  <Field MadvertiseTracker mInstance>
	//   10   26:areturn         
	}

	private boolean isFirstLaunch()
	{
		return mPreferences.getBoolean("hasBeenLaunched", true);
	//    0    0:aload_0         
	//    1    1:getfield        #67  <Field SharedPreferences mPreferences>
	//    2    4:ldc1            #25  <String "hasBeenLaunched">
	//    3    6:iconst_1        
	//    4    7:invokeinterface #73  <Method boolean SharedPreferences.getBoolean(String, boolean)>
	//    5   12:ireturn         
	}

	private boolean isSessionEnabled()
	{
		if(mContext == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #44  <Field Context mContext>
	//*   2    4:ifnonnull       16
		{
			MadvertiseUtil.logMessage(((String) (null)), 3, "Tracker is not enabled. Please call startNewSession() first");
	//    3    7:aconst_null     
	//    4    8:iconst_3        
	//    5    9:ldc1            #76  <String "Tracker is not enabled. Please call startNewSession() first">
	//    6   11:invokestatic    #82  <Method void MadvertiseUtil.logMessage(String, int, String)>
			return false;
	//    7   14:iconst_0        
	//    8   15:ireturn         
		} else
		{
			return true;
	//    9   16:iconst_1        
	//   10   17:ireturn         
		}
	}

	private void onFirstLaunch()
	{
		android.content.SharedPreferences.Editor editor = mPreferences.edit();
	//    0    0:aload_0         
	//    1    1:getfield        #67  <Field SharedPreferences mPreferences>
	//    2    4:invokeinterface #86  <Method android.content.SharedPreferences$Editor SharedPreferences.edit()>
	//    3    9:astore_1        
		editor.putBoolean("hasBeenLaunched", false);
	//    4   10:aload_1         
	//    5   11:ldc1            #25  <String "hasBeenLaunched">
	//    6   13:iconst_0        
	//    7   14:invokeinterface #92  <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putBoolean(String, boolean)>
	//    8   19:pop             
		editor.commit();
	//    9   20:aload_1         
	//   10   21:invokeinterface #95  <Method boolean android.content.SharedPreferences$Editor.commit()>
	//   11   26:pop             
	//   12   27:return          
	}

	private void reportAction(String s)
	{
		reportAction(s, ((String) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:invokespecial   #100 <Method void reportAction(String, String)>
	//    4    6:return          
	}

	private void reportAction(final String actionType, final String tracking_data)
	{
		if((actionType.equals("active") || actionType.equals("inactive") || actionType.equals("launch") || actionType.equals("stop") || actionType.equals("download")) && isSessionEnabled())
	//*   0    0:aload_1         
	//*   1    1:ldc1            #10  <String "active">
	//*   2    3:invokevirtual   #106 <Method boolean String.equals(Object)>
	//*   3    6:ifne            45
	//*   4    9:aload_1         
	//*   5   10:ldc1            #16  <String "inactive">
	//*   6   12:invokevirtual   #106 <Method boolean String.equals(Object)>
	//*   7   15:ifne            45
	//*   8   18:aload_1         
	//*   9   19:ldc1            #19  <String "launch">
	//*  10   21:invokevirtual   #106 <Method boolean String.equals(Object)>
	//*  11   24:ifne            45
	//*  12   27:aload_1         
	//*  13   28:ldc1            #22  <String "stop">
	//*  14   30:invokevirtual   #106 <Method boolean String.equals(Object)>
	//*  15   33:ifne            45
	//*  16   36:aload_1         
	//*  17   37:ldc1            #13  <String "download">
	//*  18   39:invokevirtual   #106 <Method boolean String.equals(Object)>
	//*  19   42:ifeq            74
	//*  20   45:aload_0         
	//*  21   46:invokespecial   #108 <Method boolean isSessionEnabled()>
	//*  22   49:ifeq            74
			(new Thread(new Runnable() {

				public void run()
				{
					int i;
					Object obj3;
					Object obj = ((Object) (new StringBuilder()));
				//    0    0:new             #39  <Class StringBuilder>
				//    1    3:dup             
				//    2    4:invokespecial   #40  <Method void StringBuilder()>
				//    3    7:astore          4
					((StringBuilder) (obj)).append("Reporting action ");
				//    4    9:aload           4
				//    5   11:ldc1            #42  <String "Reporting action ">
				//    6   13:invokevirtual   #46  <Method StringBuilder StringBuilder.append(String)>
				//    7   16:pop             
					((StringBuilder) (obj)).append(actionType);
				//    8   17:aload           4
				//    9   19:aload_0         
				//   10   20:getfield        #22  <Field String val$actionType>
				//   11   23:invokevirtual   #46  <Method StringBuilder StringBuilder.append(String)>
				//   12   26:pop             
					MadvertiseUtil.logMessage(((String) (null)), 3, ((StringBuilder) (obj)).toString());
				//   13   27:aconst_null     
				//   14   28:iconst_3        
				//   15   29:aload           4
				//   16   31:invokevirtual   #50  <Method String StringBuilder.toString()>
				//   17   34:invokestatic    #56  <Method void MadvertiseUtil.logMessage(String, int, String)>
					obj = ((Object) (MadvertiseUtil.getToken(mContext, ((MadvertiseView.MadvertiseViewCallbackListener) (null)))));
				//   18   37:aload_0         
				//   19   38:getfield        #20  <Field MadvertiseTracker this$0>
				//   20   41:invokestatic    #60  <Method Context MadvertiseTracker.access$000(MadvertiseTracker)>
				//   21   44:aconst_null     
				//   22   45:invokestatic    #64  <Method String MadvertiseUtil.getToken(Context, MadvertiseView$MadvertiseViewCallbackListener)>
				//   23   48:astore          4
					if(obj == null)
				//*  24   50:aload           4
				//*  25   52:ifnonnull       69
					{
						obj = "";
				//   26   55:ldc1            #66  <String "">
				//   27   57:astore          4
						MadvertiseUtil.logMessage(((String) (null)), 3, "Cannot show ads, since the appID ist null");
				//   28   59:aconst_null     
				//   29   60:iconst_3        
				//   30   61:ldc1            #68  <String "Cannot show ads, since the appID ist null">
				//   31   63:invokestatic    #56  <Method void MadvertiseUtil.logMessage(String, int, String)>
					} else
				//*  32   66:goto            104
					{
						StringBuilder stringbuilder = new StringBuilder();
				//   33   69:new             #39  <Class StringBuilder>
				//   34   72:dup             
				//   35   73:invokespecial   #40  <Method void StringBuilder()>
				//   36   76:astore          5
						stringbuilder.append("appID = ");
				//   37   78:aload           5
				//   38   80:ldc1            #70  <String "appID = ">
				//   39   82:invokevirtual   #46  <Method StringBuilder StringBuilder.append(String)>
				//   40   85:pop             
						stringbuilder.append(((String) (obj)));
				//   41   86:aload           5
				//   42   88:aload           4
				//   43   90:invokevirtual   #46  <Method StringBuilder StringBuilder.append(String)>
				//   44   93:pop             
						MadvertiseUtil.logMessage(((String) (null)), 3, stringbuilder.toString());
				//   45   94:aconst_null     
				//   46   95:iconst_3        
				//   47   96:aload           5
				//   48   98:invokevirtual   #50  <Method String StringBuilder.toString()>
				//   49  101:invokestatic    #56  <Method void MadvertiseUtil.logMessage(String, int, String)>
					}
					obj3 = ((Object) (new StringBuilder()));
				//   50  104:new             #39  <Class StringBuilder>
				//   51  107:dup             
				//   52  108:invokespecial   #40  <Method void StringBuilder()>
				//   53  111:astore          5
					((StringBuilder) (obj3)).append("http://ad.madvertise.de/action/");
				//   54  113:aload           5
				//   55  115:ldc1            #72  <String "http://ad.madvertise.de/action/">
				//   56  117:invokevirtual   #46  <Method StringBuilder StringBuilder.append(String)>
				//   57  120:pop             
					((StringBuilder) (obj3)).append(((String) (obj)));
				//   58  121:aload           5
				//   59  123:aload           4
				//   60  125:invokevirtual   #46  <Method StringBuilder StringBuilder.append(String)>
				//   61  128:pop             
					obj3 = ((Object) (new HttpPost(((StringBuilder) (obj3)).toString())));
				//   62  129:new             #74  <Class HttpPost>
				//   63  132:dup             
				//   64  133:aload           5
				//   65  135:invokevirtual   #50  <Method String StringBuilder.toString()>
				//   66  138:invokespecial   #77  <Method void HttpPost(String)>
				//   67  141:astore          5
					((HttpPost) (obj3)).setHeader("Content-Type", "application/x-www-form-urlencoded; charset=utf-8");
				//   68  143:aload           5
				//   69  145:ldc1            #79  <String "Content-Type">
				//   70  147:ldc1            #81  <String "application/x-www-form-urlencoded; charset=utf-8">
				//   71  149:invokevirtual   #84  <Method void HttpPost.setHeader(String, String)>
					ArrayList arraylist = new ArrayList();
				//   72  152:new             #86  <Class ArrayList>
				//   73  155:dup             
				//   74  156:invokespecial   #87  <Method void ArrayList()>
				//   75  159:astore          6
					((List) (arraylist)).add(((Object) (new BasicNameValuePair("ua", MadvertiseUtil.getUA()))));
				//   76  161:aload           6
				//   77  163:new             #89  <Class BasicNameValuePair>
				//   78  166:dup             
				//   79  167:ldc1            #91  <String "ua">
				//   80  169:invokestatic    #94  <Method String MadvertiseUtil.getUA()>
				//   81  172:invokespecial   #96  <Method void BasicNameValuePair(String, String)>
				//   82  175:invokeinterface #102 <Method boolean List.add(Object)>
				//   83  180:pop             
					((List) (arraylist)).add(((Object) (new BasicNameValuePair("app", "true"))));
				//   84  181:aload           6
				//   85  183:new             #89  <Class BasicNameValuePair>
				//   86  186:dup             
				//   87  187:ldc1            #104 <String "app">
				//   88  189:ldc1            #106 <String "true">
				//   89  191:invokespecial   #96  <Method void BasicNameValuePair(String, String)>
				//   90  194:invokeinterface #102 <Method boolean List.add(Object)>
				//   91  199:pop             
					((List) (arraylist)).add(((Object) (new BasicNameValuePair("debug", Boolean.toString(mIsDebugMode)))));
				//   92  200:aload           6
				//   93  202:new             #89  <Class BasicNameValuePair>
				//   94  205:dup             
				//   95  206:ldc1            #108 <String "debug">
				//   96  208:aload_0         
				//   97  209:getfield        #20  <Field MadvertiseTracker this$0>
				//   98  212:invokestatic    #112 <Method boolean MadvertiseTracker.access$100(MadvertiseTracker)>
				//   99  215:invokestatic    #117 <Method String Boolean.toString(boolean)>
				//  100  218:invokespecial   #96  <Method void BasicNameValuePair(String, String)>
				//  101  221:invokeinterface #102 <Method boolean List.add(Object)>
				//  102  226:pop             
					((List) (arraylist)).add(((Object) (new BasicNameValuePair("ip", MadvertiseUtil.getLocalIpAddress(((MadvertiseView.MadvertiseViewCallbackListener) (null)))))));
				//  103  227:aload           6
				//  104  229:new             #89  <Class BasicNameValuePair>
				//  105  232:dup             
				//  106  233:ldc1            #119 <String "ip">
				//  107  235:aconst_null     
				//  108  236:invokestatic    #123 <Method String MadvertiseUtil.getLocalIpAddress(MadvertiseView$MadvertiseViewCallbackListener)>
				//  109  239:invokespecial   #96  <Method void BasicNameValuePair(String, String)>
				//  110  242:invokeinterface #102 <Method boolean List.add(Object)>
				//  111  247:pop             
					((List) (arraylist)).add(((Object) (new BasicNameValuePair("ts", Long.toString(System.currentTimeMillis())))));
				//  112  248:aload           6
				//  113  250:new             #89  <Class BasicNameValuePair>
				//  114  253:dup             
				//  115  254:ldc1            #125 <String "ts">
				//  116  256:invokestatic    #131 <Method long System.currentTimeMillis()>
				//  117  259:invokestatic    #136 <Method String Long.toString(long)>
				//  118  262:invokespecial   #96  <Method void BasicNameValuePair(String, String)>
				//  119  265:invokeinterface #102 <Method boolean List.add(Object)>
				//  120  270:pop             
					boolean flag = actionType.equals("download");
				//  121  271:aload_0         
				//  122  272:getfield        #22  <Field String val$actionType>
				//  123  275:ldc1            #138 <String "download">
				//  124  277:invokevirtual   #143 <Method boolean String.equals(Object)>
				//  125  280:istore_3        
					i = 0;
				//  126  281:iconst_0        
				//  127  282:istore_1        
					if(flag)
				//* 128  283:iload_3         
				//* 129  284:ifeq            426
					{
						((List) (arraylist)).add(((Object) (new BasicNameValuePair("at", "launch"))));
				//  130  287:aload           6
				//  131  289:new             #89  <Class BasicNameValuePair>
				//  132  292:dup             
				//  133  293:ldc1            #145 <String "at">
				//  134  295:ldc1            #147 <String "launch">
				//  135  297:invokespecial   #96  <Method void BasicNameValuePair(String, String)>
				//  136  300:invokeinterface #102 <Method boolean List.add(Object)>
				//  137  305:pop             
						((List) (arraylist)).add(((Object) (new BasicNameValuePair("first_launch", Boolean.toString(isFirstLaunch())))));
				//  138  306:aload           6
				//  139  308:new             #89  <Class BasicNameValuePair>
				//  140  311:dup             
				//  141  312:ldc1            #149 <String "first_launch">
				//  142  314:aload_0         
				//  143  315:getfield        #20  <Field MadvertiseTracker this$0>
				//  144  318:invokestatic    #152 <Method boolean MadvertiseTracker.access$200(MadvertiseTracker)>
				//  145  321:invokestatic    #117 <Method String Boolean.toString(boolean)>
				//  146  324:invokespecial   #96  <Method void BasicNameValuePair(String, String)>
				//  147  327:invokeinterface #102 <Method boolean List.add(Object)>
				//  148  332:pop             
						String as[] = tracking_data.split("&");
				//  149  333:aload_0         
				//  150  334:getfield        #24  <Field String val$tracking_data>
				//  151  337:ldc1            #154 <String "&">
				//  152  339:invokevirtual   #158 <Method String[] String.split(String)>
				//  153  342:astore          4
						if(as.length > 0)
				//* 154  344:aload           4
				//* 155  346:arraylength     
				//* 156  347:ifle            447
						{
							((List) (arraylist)).add(((Object) (new BasicNameValuePair("tracking_data", as[0]))));
				//  157  350:aload           6
				//  158  352:new             #89  <Class BasicNameValuePair>
				//  159  355:dup             
				//  160  356:ldc1            #160 <String "tracking_data">
				//  161  358:aload           4
				//  162  360:iconst_0        
				//  163  361:aaload          
				//  164  362:invokespecial   #96  <Method void BasicNameValuePair(String, String)>
				//  165  365:invokeinterface #102 <Method boolean List.add(Object)>
				//  166  370:pop             
							for(i = 1; i < as.length; i++)
				//* 167  371:iconst_1        
				//* 168  372:istore_1        
				//* 169  373:iload_1         
				//* 170  374:aload           4
				//* 171  376:arraylength     
				//* 172  377:icmpge          421
							{
								String as1[] = as[i].split("=");
				//  173  380:aload           4
				//  174  382:iload_1         
				//  175  383:aaload          
				//  176  384:ldc1            #162 <String "=">
				//  177  386:invokevirtual   #158 <Method String[] String.split(String)>
				//  178  389:astore          7
								((List) (arraylist)).add(((Object) (new BasicNameValuePair(as1[0], as1[1]))));
				//  179  391:aload           6
				//  180  393:new             #89  <Class BasicNameValuePair>
				//  181  396:dup             
				//  182  397:aload           7
				//  183  399:iconst_0        
				//  184  400:aaload          
				//  185  401:aload           7
				//  186  403:iconst_1        
				//  187  404:aaload          
				//  188  405:invokespecial   #96  <Method void BasicNameValuePair(String, String)>
				//  189  408:invokeinterface #102 <Method boolean List.add(Object)>
				//  190  413:pop             
							}

				//  191  414:iload_1         
				//  192  415:iconst_1        
				//  193  416:iadd            
				//  194  417:istore_1        
				//* 195  418:goto            373
							i = 1;
				//  196  421:iconst_1        
				//  197  422:istore_1        
						}
					} else
				//* 198  423:goto            447
					{
						((List) (arraylist)).add(((Object) (new BasicNameValuePair("at", actionType))));
				//  199  426:aload           6
				//  200  428:new             #89  <Class BasicNameValuePair>
				//  201  431:dup             
				//  202  432:ldc1            #145 <String "at">
				//  203  434:aload_0         
				//  204  435:getfield        #22  <Field String val$actionType>
				//  205  438:invokespecial   #96  <Method void BasicNameValuePair(String, String)>
				//  206  441:invokeinterface #102 <Method boolean List.add(Object)>
				//  207  446:pop             
					}
					((List) (arraylist)).add(((Object) (new BasicNameValuePair("app_name", MadvertiseUtil.getApplicationName(mContext.getApplicationContext())))));
				//  208  447:aload           6
				//  209  449:new             #89  <Class BasicNameValuePair>
				//  210  452:dup             
				//  211  453:ldc1            #164 <String "app_name">
				//  212  455:aload_0         
				//  213  456:getfield        #20  <Field MadvertiseTracker this$0>
				//  214  459:invokestatic    #60  <Method Context MadvertiseTracker.access$000(MadvertiseTracker)>
				//  215  462:invokevirtual   #170 <Method Context Context.getApplicationContext()>
				//  216  465:invokestatic    #174 <Method String MadvertiseUtil.getApplicationName(Context)>
				//  217  468:invokespecial   #96  <Method void BasicNameValuePair(String, String)>
				//  218  471:invokeinterface #102 <Method boolean List.add(Object)>
				//  219  476:pop             
					((List) (arraylist)).add(((Object) (new BasicNameValuePair("app_version", MadvertiseUtil.getApplicationVersion(mContext.getApplicationContext())))));
				//  220  477:aload           6
				//  221  479:new             #89  <Class BasicNameValuePair>
				//  222  482:dup             
				//  223  483:ldc1            #176 <String "app_version">
				//  224  485:aload_0         
				//  225  486:getfield        #20  <Field MadvertiseTracker this$0>
				//  226  489:invokestatic    #60  <Method Context MadvertiseTracker.access$000(MadvertiseTracker)>
				//  227  492:invokevirtual   #170 <Method Context Context.getApplicationContext()>
				//  228  495:invokestatic    #179 <Method String MadvertiseUtil.getApplicationVersion(Context)>
				//  229  498:invokespecial   #96  <Method void BasicNameValuePair(String, String)>
				//  230  501:invokeinterface #102 <Method boolean List.add(Object)>
				//  231  506:pop             
					((List) (arraylist)).add(((Object) (new BasicNameValuePair("udid_md5", MadvertiseUtil.getHashedAndroidID(mContext, MadvertiseUtil.HashType.MD5)))));
				//  232  507:aload           6
				//  233  509:new             #89  <Class BasicNameValuePair>
				//  234  512:dup             
				//  235  513:ldc1            #181 <String "udid_md5">
				//  236  515:aload_0         
				//  237  516:getfield        #20  <Field MadvertiseTracker this$0>
				//  238  519:invokestatic    #60  <Method Context MadvertiseTracker.access$000(MadvertiseTracker)>
				//  239  522:getstatic       #187 <Field MadvertiseUtil$HashType MadvertiseUtil$HashType.MD5>
				//  240  525:invokestatic    #191 <Method String MadvertiseUtil.getHashedAndroidID(Context, MadvertiseUtil$HashType)>
				//  241  528:invokespecial   #96  <Method void BasicNameValuePair(String, String)>
				//  242  531:invokeinterface #102 <Method boolean List.add(Object)>
				//  243  536:pop             
					((List) (arraylist)).add(((Object) (new BasicNameValuePair("udid_sha1", MadvertiseUtil.getHashedAndroidID(mContext, MadvertiseUtil.HashType.SHA1)))));
				//  244  537:aload           6
				//  245  539:new             #89  <Class BasicNameValuePair>
				//  246  542:dup             
				//  247  543:ldc1            #193 <String "udid_sha1">
				//  248  545:aload_0         
				//  249  546:getfield        #20  <Field MadvertiseTracker this$0>
				//  250  549:invokestatic    #60  <Method Context MadvertiseTracker.access$000(MadvertiseTracker)>
				//  251  552:getstatic       #196 <Field MadvertiseUtil$HashType MadvertiseUtil$HashType.SHA1>
				//  252  555:invokestatic    #191 <Method String MadvertiseUtil.getHashedAndroidID(Context, MadvertiseUtil$HashType)>
				//  253  558:invokespecial   #96  <Method void BasicNameValuePair(String, String)>
				//  254  561:invokeinterface #102 <Method boolean List.add(Object)>
				//  255  566:pop             
					((List) (arraylist)).add(((Object) (new BasicNameValuePair("mac_md5", MadvertiseUtil.getHashedMacAddress(mContext, MadvertiseUtil.HashType.MD5)))));
				//  256  567:aload           6
				//  257  569:new             #89  <Class BasicNameValuePair>
				//  258  572:dup             
				//  259  573:ldc1            #198 <String "mac_md5">
				//  260  575:aload_0         
				//  261  576:getfield        #20  <Field MadvertiseTracker this$0>
				//  262  579:invokestatic    #60  <Method Context MadvertiseTracker.access$000(MadvertiseTracker)>
				//  263  582:getstatic       #187 <Field MadvertiseUtil$HashType MadvertiseUtil$HashType.MD5>
				//  264  585:invokestatic    #201 <Method String MadvertiseUtil.getHashedMacAddress(Context, MadvertiseUtil$HashType)>
				//  265  588:invokespecial   #96  <Method void BasicNameValuePair(String, String)>
				//  266  591:invokeinterface #102 <Method boolean List.add(Object)>
				//  267  596:pop             
					((List) (arraylist)).add(((Object) (new BasicNameValuePair("mac_sha1", MadvertiseUtil.getHashedMacAddress(mContext, MadvertiseUtil.HashType.SHA1)))));
				//  268  597:aload           6
				//  269  599:new             #89  <Class BasicNameValuePair>
				//  270  602:dup             
				//  271  603:ldc1            #203 <String "mac_sha1">
				//  272  605:aload_0         
				//  273  606:getfield        #20  <Field MadvertiseTracker this$0>
				//  274  609:invokestatic    #60  <Method Context MadvertiseTracker.access$000(MadvertiseTracker)>
				//  275  612:getstatic       #196 <Field MadvertiseUtil$HashType MadvertiseUtil$HashType.SHA1>
				//  276  615:invokestatic    #201 <Method String MadvertiseUtil.getHashedMacAddress(Context, MadvertiseUtil$HashType)>
				//  277  618:invokespecial   #96  <Method void BasicNameValuePair(String, String)>
				//  278  621:invokeinterface #102 <Method boolean List.add(Object)>
				//  279  626:pop             
					try
					{
						as = ((String []) (new UrlEncodedFormEntity(((List) (arraylist)))));
				//  280  627:new             #205 <Class UrlEncodedFormEntity>
				//  281  630:dup             
				//  282  631:aload           6
				//  283  633:invokespecial   #208 <Method void UrlEncodedFormEntity(List)>
				//  284  636:astore          4
					}
				//* 285  638:goto            651
					// Misplaced declaration of an exception variable
					catch(String as[])
				//* 286  641:astore          4
					{
						((UnsupportedEncodingException) (as)).printStackTrace();
				//  287  643:aload           4
				//  288  645:invokevirtual   #211 <Method void UnsupportedEncodingException.printStackTrace()>
						as = null;
				//  289  648:aconst_null     
				//  290  649:astore          4
					}
					((HttpPost) (obj3)).setEntity(((org.apache.http.HttpEntity) (as)));
				//  291  651:aload           5
				//  292  653:aload           4
				//  293  655:invokevirtual   #215 <Method void HttpPost.setEntity(org.apache.http.HttpEntity)>
					MadvertiseUtil.logMessage(((String) (null)), 3, "Post request created");
				//  294  658:aconst_null     
				//  295  659:iconst_3        
				//  296  660:ldc1            #217 <String "Post request created">
				//  297  662:invokestatic    #56  <Method void MadvertiseUtil.logMessage(String, int, String)>
					as = ((String []) (new StringBuilder()));
				//  298  665:new             #39  <Class StringBuilder>
				//  299  668:dup             
				//  300  669:invokespecial   #40  <Method void StringBuilder()>
				//  301  672:astore          4
					((StringBuilder) (as)).append("Uri : ");
				//  302  674:aload           4
				//  303  676:ldc1            #219 <String "Uri : ">
				//  304  678:invokevirtual   #46  <Method StringBuilder StringBuilder.append(String)>
				//  305  681:pop             
					((StringBuilder) (as)).append(((HttpPost) (obj3)).getURI().toASCIIString());
				//  306  682:aload           4
				//  307  684:aload           5
				//  308  686:invokevirtual   #223 <Method URI HttpPost.getURI()>
				//  309  689:invokevirtual   #228 <Method String URI.toASCIIString()>
				//  310  692:invokevirtual   #46  <Method StringBuilder StringBuilder.append(String)>
				//  311  695:pop             
					MadvertiseUtil.logMessage(((String) (null)), 3, ((StringBuilder) (as)).toString());
				//  312  696:aconst_null     
				//  313  697:iconst_3        
				//  314  698:aload           4
				//  315  700:invokevirtual   #50  <Method String StringBuilder.toString()>
				//  316  703:invokestatic    #56  <Method void MadvertiseUtil.logMessage(String, int, String)>
					as = ((String []) (new StringBuilder()));
				//  317  706:new             #39  <Class StringBuilder>
				//  318  709:dup             
				//  319  710:invokespecial   #40  <Method void StringBuilder()>
				//  320  713:astore          4
					((StringBuilder) (as)).append("All headers : ");
				//  321  715:aload           4
				//  322  717:ldc1            #230 <String "All headers : ">
				//  323  719:invokevirtual   #46  <Method StringBuilder StringBuilder.append(String)>
				//  324  722:pop             
					((StringBuilder) (as)).append(MadvertiseUtil.getAllHeadersAsString(((HttpPost) (obj3)).getAllHeaders()));
				//  325  723:aload           4
				//  326  725:aload           5
				//  327  727:invokevirtual   #234 <Method org.apache.http.Header[] HttpPost.getAllHeaders()>
				//  328  730:invokestatic    #238 <Method String MadvertiseUtil.getAllHeadersAsString(org.apache.http.Header[])>
				//  329  733:invokevirtual   #46  <Method StringBuilder StringBuilder.append(String)>
				//  330  736:pop             
					MadvertiseUtil.logMessage(((String) (null)), 3, ((StringBuilder) (as)).toString());
				//  331  737:aconst_null     
				//  332  738:iconst_3        
				//  333  739:aload           4
				//  334  741:invokevirtual   #50  <Method String StringBuilder.toString()>
				//  335  744:invokestatic    #56  <Method void MadvertiseUtil.logMessage(String, int, String)>
					as = ((String []) (new StringBuilder()));
				//  336  747:new             #39  <Class StringBuilder>
				//  337  750:dup             
				//  338  751:invokespecial   #40  <Method void StringBuilder()>
				//  339  754:astore          4
					((StringBuilder) (as)).append("All request parameters :");
				//  340  756:aload           4
				//  341  758:ldc1            #240 <String "All request parameters :">
				//  342  760:invokevirtual   #46  <Method StringBuilder StringBuilder.append(String)>
				//  343  763:pop             
					((StringBuilder) (as)).append(MadvertiseUtil.printRequestParameters(((List) (arraylist))));
				//  344  764:aload           4
				//  345  766:aload           6
				//  346  768:invokestatic    #244 <Method String MadvertiseUtil.printRequestParameters(List)>
				//  347  771:invokevirtual   #46  <Method StringBuilder StringBuilder.append(String)>
				//  348  774:pop             
					MadvertiseUtil.logMessage(((String) (null)), 3, ((StringBuilder) (as)).toString());
				//  349  775:aconst_null     
				//  350  776:iconst_3        
				//  351  777:aload           4
				//  352  779:invokevirtual   #50  <Method String StringBuilder.toString()>
				//  353  782:invokestatic    #56  <Method void MadvertiseUtil.logMessage(String, int, String)>
					this;
				//  354  785:aload_0         
					JVM INSTR monitorenter ;
				//  355  786:monitorenter    
					Object obj1 = ((Object) (new DefaultHttpClient()));
				//  356  787:new             #246 <Class DefaultHttpClient>
				//  357  790:dup             
				//  358  791:invokespecial   #247 <Method void DefaultHttpClient()>
				//  359  794:astore          4
					int j;
					org.apache.http.params.HttpParams httpparams = ((HttpClient) (obj1)).getParams();
				//  360  796:aload           4
				//  361  798:invokeinterface #253 <Method org.apache.http.params.HttpParams HttpClient.getParams()>
				//  362  803:astore          6
					HttpConnectionParams.setConnectionTimeout(httpparams, 5000);
				//  363  805:aload           6
				//  364  807:sipush          5000
				//  365  810:invokestatic    #259 <Method void HttpConnectionParams.setConnectionTimeout(org.apache.http.params.HttpParams, int)>
					HttpConnectionParams.setSoTimeout(httpparams, 5000);
				//  366  813:aload           6
				//  367  815:sipush          5000
				//  368  818:invokestatic    #262 <Method void HttpConnectionParams.setSoTimeout(org.apache.http.params.HttpParams, int)>
					MadvertiseUtil.logMessage(((String) (null)), 3, "Sending request");
				//  369  821:aconst_null     
				//  370  822:iconst_3        
				//  371  823:ldc2            #264 <String "Sending request">
				//  372  826:invokestatic    #56  <Method void MadvertiseUtil.logMessage(String, int, String)>
					obj1 = ((Object) (((HttpClient) (obj1)).execute(((org.apache.http.client.methods.HttpUriRequest) (obj3)))));
				//  373  829:aload           4
				//  374  831:aload           5
				//  375  833:invokeinterface #268 <Method HttpResponse HttpClient.execute(org.apache.http.client.methods.HttpUriRequest)>
				//  376  838:astore          4
					obj3 = ((Object) (new StringBuilder()));
				//  377  840:new             #39  <Class StringBuilder>
				//  378  843:dup             
				//  379  844:invokespecial   #40  <Method void StringBuilder()>
				//  380  847:astore          5
					((StringBuilder) (obj3)).append("Response Code => ");
				//  381  849:aload           5
				//  382  851:ldc2            #270 <String "Response Code => ">
				//  383  854:invokevirtual   #46  <Method StringBuilder StringBuilder.append(String)>
				//  384  857:pop             
					((StringBuilder) (obj3)).append(((HttpResponse) (obj1)).getStatusLine().getStatusCode());
				//  385  858:aload           5
				//  386  860:aload           4
				//  387  862:invokeinterface #276 <Method StatusLine HttpResponse.getStatusLine()>
				//  388  867:invokeinterface #282 <Method int StatusLine.getStatusCode()>
				//  389  872:invokevirtual   #285 <Method StringBuilder StringBuilder.append(int)>
				//  390  875:pop             
					MadvertiseUtil.logMessage(((String) (null)), 3, ((StringBuilder) (obj3)).toString());
				//  391  876:aconst_null     
				//  392  877:iconst_3        
				//  393  878:aload           5
				//  394  880:invokevirtual   #50  <Method String StringBuilder.toString()>
				//  395  883:invokestatic    #56  <Method void MadvertiseUtil.logMessage(String, int, String)>
					j = ((HttpResponse) (obj1)).getStatusLine().getStatusCode();
				//  396  886:aload           4
				//  397  888:invokeinterface #276 <Method StatusLine HttpResponse.getStatusLine()>
				//  398  893:invokeinterface #282 <Method int StatusLine.getStatusCode()>
				//  399  898:istore_2        
					obj1 = ((Object) (((HttpResponse) (obj1)).getEntity()));
				//  400  899:aload           4
				//  401  901:invokeinterface #289 <Method org.apache.http.HttpEntity HttpResponse.getEntity()>
				//  402  906:astore          4
					if(j != 200 || obj1 == null)
						break MISSING_BLOCK_LABEL_995;
				//  403  908:iload_2         
				//  404  909:sipush          200
				//  405  912:icmpne          995
				//  406  915:aload           4
				//  407  917:ifnull          995
					if(!isFirstLaunch() || i == 0)
						break MISSING_BLOCK_LABEL_995;
				//  408  920:aload_0         
				//  409  921:getfield        #20  <Field MadvertiseTracker this$0>
				//  410  924:invokestatic    #152 <Method boolean MadvertiseTracker.access$200(MadvertiseTracker)>
				//  411  927:ifeq            995
				//  412  930:iload_1         
				//  413  931:ifeq            995
					onFirstLaunch();
				//  414  934:aload_0         
				//  415  935:getfield        #20  <Field MadvertiseTracker this$0>
				//  416  938:invokestatic    #293 <Method void MadvertiseTracker.access$300(MadvertiseTracker)>
					break MISSING_BLOCK_LABEL_995;
				//  417  941:goto            995
					Object obj2;
					obj2;
				//  418  944:astore          4
					MadvertiseUtil.logMessage(((String) (null)), 3, "Could not receive a http response on an report-request");
				//  419  946:aconst_null     
				//  420  947:iconst_3        
				//  421  948:ldc2            #295 <String "Could not receive a http response on an report-request">
				//  422  951:invokestatic    #56  <Method void MadvertiseUtil.logMessage(String, int, String)>
					((Exception) (obj2)).printStackTrace();
				//  423  954:aload           4
				//  424  956:invokevirtual   #296 <Method void Exception.printStackTrace()>
					break MISSING_BLOCK_LABEL_995;
				//  425  959:goto            995
					obj2;
				//  426  962:astore          4
					MadvertiseUtil.logMessage(((String) (null)), 3, "Could not receive a http response on an report-request");
				//  427  964:aconst_null     
				//  428  965:iconst_3        
				//  429  966:ldc2            #295 <String "Could not receive a http response on an report-request">
				//  430  969:invokestatic    #56  <Method void MadvertiseUtil.logMessage(String, int, String)>
					((IOException) (obj2)).printStackTrace();
				//  431  972:aload           4
				//  432  974:invokevirtual   #297 <Method void IOException.printStackTrace()>
					break MISSING_BLOCK_LABEL_995;
				//  433  977:goto            995
					obj2;
				//  434  980:astore          4
					MadvertiseUtil.logMessage(((String) (null)), 3, "Error in HTTP request / protocol");
				//  435  982:aconst_null     
				//  436  983:iconst_3        
				//  437  984:ldc2            #299 <String "Error in HTTP request / protocol">
				//  438  987:invokestatic    #56  <Method void MadvertiseUtil.logMessage(String, int, String)>
					((ClientProtocolException) (obj2)).printStackTrace();
				//  439  990:aload           4
				//  440  992:invokevirtual   #300 <Method void ClientProtocolException.printStackTrace()>
					this;
				//  441  995:aload_0         
					JVM INSTR monitorexit ;
				//  442  996:monitorexit     
					return;
				//  443  997:return          
					obj2;
				//  444  998:astore          4
					this;
				//  445 1000:aload_0         
					JVM INSTR monitorexit ;
				//  446 1001:monitorexit     
					throw obj2;
				//  447 1002:aload           4
				//  448 1004:athrow          
				}

				final MadvertiseTracker this$0;
				final String val$actionType;
				final String val$tracking_data;

			
			{
				this$0 = MadvertiseTracker.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #20  <Field MadvertiseTracker this$0>
				actionType = s;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #22  <Field String val$actionType>
				tracking_data = s1;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #24  <Field String val$tracking_data>
				super();
			//    9   15:aload_0         
			//   10   16:invokespecial   #27  <Method void Object()>
			//   11   19:return          
			}
			}
, "MadvertiseTrackingThread")).start();
	//   23   52:new             #110 <Class Thread>
	//   24   55:dup             
	//   25   56:new             #6   <Class MadvertiseTracker$1>
	//   26   59:dup             
	//   27   60:aload_0         
	//   28   61:aload_1         
	//   29   62:aload_2         
	//   30   63:invokespecial   #113 <Method void MadvertiseTracker$1(MadvertiseTracker, String, String)>
	//   31   66:ldc1            #115 <String "MadvertiseTrackingThread">
	//   32   68:invokespecial   #118 <Method void Thread(Runnable, String)>
	//   33   71:invokevirtual   #121 <Method void Thread.start()>
	//   34   74:return          
	}

	public void reportActive()
	{
		reportAction("active");
	//    0    0:aload_0         
	//    1    1:ldc1            #10  <String "active">
	//    2    3:invokespecial   #124 <Method void reportAction(String)>
	//    3    6:return          
	}

	public void reportDownload(Intent intent, String s)
	{
		intent = ((Intent) (intent.getData()));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #132 <Method Uri Intent.getData()>
	//    2    4:astore_1        
		if(intent != null && isFirstLaunch())
	//*   3    5:aload_1         
	//*   4    6:ifnull          27
	//*   5    9:aload_0         
	//*   6   10:invokespecial   #51  <Method boolean isFirstLaunch()>
	//*   7   13:ifeq            27
		{
			reportAction("download", ((Uri) (intent)).toString());
	//    8   16:aload_0         
	//    9   17:ldc1            #13  <String "download">
	//   10   19:aload_1         
	//   11   20:invokevirtual   #138 <Method String Uri.toString()>
	//   12   23:invokespecial   #100 <Method void reportAction(String, String)>
			return;
	//   13   26:return          
		} else
		{
			reportLaunch(s);
	//   14   27:aload_0         
	//   15   28:aload_2         
	//   16   29:invokevirtual   #141 <Method void reportLaunch(String)>
			return;
	//   17   32:return          
		}
	}

	public void reportInactive()
	{
		reportAction("inactive");
	//    0    0:aload_0         
	//    1    1:ldc1            #16  <String "inactive">
	//    2    3:invokespecial   #124 <Method void reportAction(String)>
	//    3    6:return          
	}

	public void reportLaunch(String s)
	{
		if(isFirstLaunch() && MadvertiseUtil.isConnectionAvailable())
	//*   0    0:aload_0         
	//*   1    1:invokespecial   #51  <Method boolean isFirstLaunch()>
	//*   2    4:ifeq            201
	//*   3    7:invokestatic    #147 <Method boolean MadvertiseUtil.isConnectionAvailable()>
	//*   4   10:ifeq            201
		{
			String s1 = MadvertiseUtil.getHashedAndroidID(mContext, MadvertiseUtil.HashType.MD5);
	//    5   13:aload_0         
	//    6   14:getfield        #44  <Field Context mContext>
	//    7   17:getstatic       #153 <Field MadvertiseUtil$HashType MadvertiseUtil$HashType.MD5>
	//    8   20:invokestatic    #157 <Method String MadvertiseUtil.getHashedAndroidID(Context, MadvertiseUtil$HashType)>
	//    9   23:astore_2        
			String s2 = MadvertiseUtil.getHashedAndroidID(mContext, MadvertiseUtil.HashType.SHA1);
	//   10   24:aload_0         
	//   11   25:getfield        #44  <Field Context mContext>
	//   12   28:getstatic       #160 <Field MadvertiseUtil$HashType MadvertiseUtil$HashType.SHA1>
	//   13   31:invokestatic    #157 <Method String MadvertiseUtil.getHashedAndroidID(Context, MadvertiseUtil$HashType)>
	//   14   34:astore_3        
			String s3 = MadvertiseUtil.getHashedMacAddress(mContext, MadvertiseUtil.HashType.MD5);
	//   15   35:aload_0         
	//   16   36:getfield        #44  <Field Context mContext>
	//   17   39:getstatic       #153 <Field MadvertiseUtil$HashType MadvertiseUtil$HashType.MD5>
	//   18   42:invokestatic    #163 <Method String MadvertiseUtil.getHashedMacAddress(Context, MadvertiseUtil$HashType)>
	//   19   45:astore          4
			String s4 = MadvertiseUtil.getHashedMacAddress(mContext, MadvertiseUtil.HashType.SHA1);
	//   20   47:aload_0         
	//   21   48:getfield        #44  <Field Context mContext>
	//   22   51:getstatic       #160 <Field MadvertiseUtil$HashType MadvertiseUtil$HashType.SHA1>
	//   23   54:invokestatic    #163 <Method String MadvertiseUtil.getHashedMacAddress(Context, MadvertiseUtil$HashType)>
	//   24   57:astore          5
			StringBuilder stringbuilder = new StringBuilder();
	//   25   59:new             #165 <Class StringBuilder>
	//   26   62:dup             
	//   27   63:invokespecial   #166 <Method void StringBuilder()>
	//   28   66:astore          6
			stringbuilder.append("http://ad.madvertise.de/sync.html?scheme=");
	//   29   68:aload           6
	//   30   70:ldc1            #168 <String "http://ad.madvertise.de/sync.html?scheme=">
	//   31   72:invokevirtual   #172 <Method StringBuilder StringBuilder.append(String)>
	//   32   75:pop             
			stringbuilder.append(s);
	//   33   76:aload           6
	//   34   78:aload_1         
	//   35   79:invokevirtual   #172 <Method StringBuilder StringBuilder.append(String)>
	//   36   82:pop             
			stringbuilder.append("&m1=");
	//   37   83:aload           6
	//   38   85:ldc1            #174 <String "&m1=">
	//   39   87:invokevirtual   #172 <Method StringBuilder StringBuilder.append(String)>
	//   40   90:pop             
			stringbuilder.append(s4);
	//   41   91:aload           6
	//   42   93:aload           5
	//   43   95:invokevirtual   #172 <Method StringBuilder StringBuilder.append(String)>
	//   44   98:pop             
			stringbuilder.append("&m5=");
	//   45   99:aload           6
	//   46  101:ldc1            #176 <String "&m5=">
	//   47  103:invokevirtual   #172 <Method StringBuilder StringBuilder.append(String)>
	//   48  106:pop             
			stringbuilder.append(s3);
	//   49  107:aload           6
	//   50  109:aload           4
	//   51  111:invokevirtual   #172 <Method StringBuilder StringBuilder.append(String)>
	//   52  114:pop             
			stringbuilder.append("&u1=");
	//   53  115:aload           6
	//   54  117:ldc1            #178 <String "&u1=">
	//   55  119:invokevirtual   #172 <Method StringBuilder StringBuilder.append(String)>
	//   56  122:pop             
			stringbuilder.append(s2);
	//   57  123:aload           6
	//   58  125:aload_3         
	//   59  126:invokevirtual   #172 <Method StringBuilder StringBuilder.append(String)>
	//   60  129:pop             
			stringbuilder.append("&u5=");
	//   61  130:aload           6
	//   62  132:ldc1            #180 <String "&u5=">
	//   63  134:invokevirtual   #172 <Method StringBuilder StringBuilder.append(String)>
	//   64  137:pop             
			stringbuilder.append(s1);
	//   65  138:aload           6
	//   66  140:aload_2         
	//   67  141:invokevirtual   #172 <Method StringBuilder StringBuilder.append(String)>
	//   68  144:pop             
			s = ((String) (new Intent("android.intent.action.VIEW", Uri.parse(stringbuilder.toString()))));
	//   69  145:new             #128 <Class Intent>
	//   70  148:dup             
	//   71  149:ldc1            #182 <String "android.intent.action.VIEW">
	//   72  151:aload           6
	//   73  153:invokevirtual   #183 <Method String StringBuilder.toString()>
	//   74  156:invokestatic    #187 <Method Uri Uri.parse(String)>
	//   75  159:invokespecial   #190 <Method void Intent(String, Uri)>
	//   76  162:astore_1        
			((Intent) (s)).addFlags(0x10000000);
	//   77  163:aload_1         
	//   78  164:ldc1            #191 <Int 0x10000000>
	//   79  166:invokevirtual   #195 <Method Intent Intent.addFlags(int)>
	//   80  169:pop             
			((Intent) (s)).addFlags(0x40000000);
	//   81  170:aload_1         
	//   82  171:ldc1            #196 <Int 0x40000000>
	//   83  173:invokevirtual   #195 <Method Intent Intent.addFlags(int)>
	//   84  176:pop             
			((Intent) (s)).addFlags(0x10000);
	//   85  177:aload_1         
	//   86  178:ldc1            #197 <Int 0x10000>
	//   87  180:invokevirtual   #195 <Method Intent Intent.addFlags(int)>
	//   88  183:pop             
			try
			{
				mContext.startActivity(((Intent) (s)));
	//   89  184:aload_0         
	//   90  185:getfield        #44  <Field Context mContext>
	//   91  188:aload_1         
	//   92  189:invokevirtual   #203 <Method void Context.startActivity(Intent)>
				return;
	//   93  192:return          
			}
	//*  94  193:aconst_null     
	//*  95  194:iconst_3        
	//*  96  195:ldc1            #205 <String "Failed to open sync.html.">
	//*  97  197:invokestatic    #82  <Method void MadvertiseUtil.logMessage(String, int, String)>
	//*  98  200:return          
	//*  99  201:aload_0         
	//* 100  202:ldc1            #19  <String "launch">
	//* 101  204:invokespecial   #124 <Method void reportAction(String)>
	//* 102  207:return          
			// Misplaced declaration of an exception variable
			catch(String s)
			{
				MadvertiseUtil.logMessage(((String) (null)), 3, "Failed to open sync.html.");
			}
			return;
		} else
		{
			reportAction("launch");
			return;
		}
	//* 103  208:astore_1        
	//* 104  209:goto            193
	}

	public void reportStop()
	{
		reportAction("stop");
	//    0    0:aload_0         
	//    1    1:ldc1            #22  <String "stop">
	//    2    3:invokespecial   #124 <Method void reportAction(String)>
	//    3    6:return          
	}

	public void setDebugMode(boolean flag)
	{
		mIsDebugMode = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #39  <Field boolean mIsDebugMode>
	//    3    5:return          
	}

	public void startNewSession(Context context)
	{
		mContext = context.getApplicationContext();
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #212 <Method Context Context.getApplicationContext()>
	//    3    5:putfield        #44  <Field Context mContext>
		mPreferences = mContext.getSharedPreferences("de.madvertise.android.sdk", 0);
	//    4    8:aload_0         
	//    5    9:aload_0         
	//    6   10:getfield        #44  <Field Context mContext>
	//    7   13:ldc1            #214 <String "de.madvertise.android.sdk">
	//    8   15:iconst_0        
	//    9   16:invokevirtual   #218 <Method SharedPreferences Context.getSharedPreferences(String, int)>
	//   10   19:putfield        #67  <Field SharedPreferences mPreferences>
	//   11   22:return          
	}

	private static final String ACTION_TYPE_ACTIVE = "active";
	private static final String ACTION_TYPE_DOWNLOAD = "download";
	private static final String ACTION_TYPE_INACTIVE = "inactive";
	private static final String ACTION_TYPE_LAUNCH = "launch";
	private static final String ACTION_TYPE_STOP = "stop";
	private static final String IS_FIRST_LAUNCH = "hasBeenLaunched";
	private static MadvertiseTracker mInstance;
	private Context mContext;
	private boolean mIsDebugMode;
	private SharedPreferences mPreferences;


/*
	static Context access$000(MadvertiseTracker madvertisetracker)
	{
		return madvertisetracker.mContext;
	//    0    0:aload_0         
	//    1    1:getfield        #44  <Field Context mContext>
	//    2    4:areturn         
	}

*/


/*
	static boolean access$100(MadvertiseTracker madvertisetracker)
	{
		return madvertisetracker.mIsDebugMode;
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field boolean mIsDebugMode>
	//    2    4:ireturn         
	}

*/


/*
	static boolean access$200(MadvertiseTracker madvertisetracker)
	{
		return madvertisetracker.isFirstLaunch();
	//    0    0:aload_0         
	//    1    1:invokespecial   #51  <Method boolean isFirstLaunch()>
	//    2    4:ireturn         
	}

*/


/*
	static void access$300(MadvertiseTracker madvertisetracker)
	{
		madvertisetracker.onFirstLaunch();
	//    0    0:aload_0         
	//    1    1:invokespecial   #56  <Method void onFirstLaunch()>
		return;
	//    2    4:return          
	}

*/
}

// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appscend.mraid;

import android.content.Context;
import android.location.Location;
import android.os.Handler;
import android.view.Display;
import android.view.WindowManager;
import java.io.*;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import org.apache.http.*;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.params.HttpConnectionParams;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.appscend.mraid:
//			MadvertiseView, MadvertiseUtil, MadvertiseAd

class MadvertiseView$3
	implements Runnable
{

	public void run()
	{
		Object obj = ((Object) (MadvertiseUtil.getToken(getContext().getApplicationContext(), MadvertiseView.access$200(MadvertiseView.this))));
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field MadvertiseView this$0>
	//    2    4:invokevirtual   #36  <Method Context MadvertiseView.getContext()>
	//    3    7:invokevirtual   #41  <Method Context Context.getApplicationContext()>
	//    4   10:aload_0         
	//    5   11:getfield        #17  <Field MadvertiseView this$0>
	//    6   14:invokestatic    #45  <Method MadvertiseView$MadvertiseViewCallbackListener MadvertiseView.access$200(MadvertiseView)>
	//    7   17:invokestatic    #51  <Method String MadvertiseUtil.getToken(Context, MadvertiseView$MadvertiseViewCallbackListener)>
	//    8   20:astore_2        
		Object obj1 = null;
	//    9   21:aconst_null     
	//   10   22:astore_3        
		if(obj == null)
	//*  11   23:aload_2         
	//*  12   24:ifnonnull       40
		{
			obj = "";
	//   13   27:ldc1            #53  <String "">
	//   14   29:astore_2        
			MadvertiseUtil.logMessage(((String) (null)), 3, "Cannot show ads, since the appID ist null");
	//   15   30:aconst_null     
	//   16   31:iconst_3        
	//   17   32:ldc1            #55  <String "Cannot show ads, since the appID ist null">
	//   18   34:invokestatic    #59  <Method void MadvertiseUtil.logMessage(String, int, String)>
		} else
	//*  19   37:goto            74
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   20   40:new             #61  <Class StringBuilder>
	//   21   43:dup             
	//   22   44:invokespecial   #62  <Method void StringBuilder()>
	//   23   47:astore          4
			stringbuilder.append("appID = ");
	//   24   49:aload           4
	//   25   51:ldc1            #64  <String "appID = ">
	//   26   53:invokevirtual   #68  <Method StringBuilder StringBuilder.append(String)>
	//   27   56:pop             
			stringbuilder.append(((String) (obj)));
	//   28   57:aload           4
	//   29   59:aload_2         
	//   30   60:invokevirtual   #68  <Method StringBuilder StringBuilder.append(String)>
	//   31   63:pop             
			MadvertiseUtil.logMessage(((String) (null)), 3, stringbuilder.toString());
	//   32   64:aconst_null     
	//   33   65:iconst_3        
	//   34   66:aload           4
	//   35   68:invokevirtual   #72  <Method String StringBuilder.toString()>
	//   36   71:invokestatic    #59  <Method void MadvertiseUtil.logMessage(String, int, String)>
		}
		Object obj2 = ((Object) (new StringBuilder()));
	//   37   74:new             #61  <Class StringBuilder>
	//   38   77:dup             
	//   39   78:invokespecial   #62  <Method void StringBuilder()>
	//   40   81:astore          4
		((StringBuilder) (obj2)).append("http://ad.madvertise.de/site/");
	//   41   83:aload           4
	//   42   85:ldc1            #74  <String "http://ad.madvertise.de/site/">
	//   43   87:invokevirtual   #68  <Method StringBuilder StringBuilder.append(String)>
	//   44   90:pop             
		((StringBuilder) (obj2)).append(((String) (obj)));
	//   45   91:aload           4
	//   46   93:aload_2         
	//   47   94:invokevirtual   #68  <Method StringBuilder StringBuilder.append(String)>
	//   48   97:pop             
		obj2 = ((Object) (new HttpPost(((StringBuilder) (obj2)).toString())));
	//   49   98:new             #76  <Class HttpPost>
	//   50  101:dup             
	//   51  102:aload           4
	//   52  104:invokevirtual   #72  <Method String StringBuilder.toString()>
	//   53  107:invokespecial   #79  <Method void HttpPost(String)>
	//   54  110:astore          4
		((HttpPost) (obj2)).setHeader("Content-Type", "application/x-www-form-urlencoded; charset=utf-8");
	//   55  112:aload           4
	//   56  114:ldc1            #81  <String "Content-Type">
	//   57  116:ldc1            #83  <String "application/x-www-form-urlencoded; charset=utf-8">
	//   58  118:invokevirtual   #87  <Method void HttpPost.setHeader(String, String)>
		((HttpPost) (obj2)).addHeader("Accept", "application/vnd.madad+json; version=3");
	//   59  121:aload           4
	//   60  123:ldc1            #89  <String "Accept">
	//   61  125:ldc1            #91  <String "application/vnd.madad+json; version=3">
	//   62  127:invokevirtual   #94  <Method void HttpPost.addHeader(String, String)>
		Object obj4 = ((Object) (new ArrayList()));
	//   63  130:new             #96  <Class ArrayList>
	//   64  133:dup             
	//   65  134:invokespecial   #97  <Method void ArrayList()>
	//   66  137:astore          5
		((List) (obj4)).add(((Object) (new BasicNameValuePair("ua", MadvertiseUtil.getUA()))));
	//   67  139:aload           5
	//   68  141:new             #99  <Class BasicNameValuePair>
	//   69  144:dup             
	//   70  145:ldc1            #101 <String "ua">
	//   71  147:invokestatic    #104 <Method String MadvertiseUtil.getUA()>
	//   72  150:invokespecial   #106 <Method void BasicNameValuePair(String, String)>
	//   73  153:invokeinterface #112 <Method boolean List.add(Object)>
	//   74  158:pop             
		((List) (obj4)).add(((Object) (new BasicNameValuePair("app", "true"))));
	//   75  159:aload           5
	//   76  161:new             #99  <Class BasicNameValuePair>
	//   77  164:dup             
	//   78  165:ldc1            #114 <String "app">
	//   79  167:ldc1            #116 <String "true">
	//   80  169:invokespecial   #106 <Method void BasicNameValuePair(String, String)>
	//   81  172:invokeinterface #112 <Method boolean List.add(Object)>
	//   82  177:pop             
		((List) (obj4)).add(((Object) (new BasicNameValuePair("debug", Boolean.toString(MadvertiseView.access$300(MadvertiseView.this))))));
	//   83  178:aload           5
	//   84  180:new             #99  <Class BasicNameValuePair>
	//   85  183:dup             
	//   86  184:ldc1            #118 <String "debug">
	//   87  186:aload_0         
	//   88  187:getfield        #17  <Field MadvertiseView this$0>
	//   89  190:invokestatic    #122 <Method boolean MadvertiseView.access$300(MadvertiseView)>
	//   90  193:invokestatic    #127 <Method String Boolean.toString(boolean)>
	//   91  196:invokespecial   #106 <Method void BasicNameValuePair(String, String)>
	//   92  199:invokeinterface #112 <Method boolean List.add(Object)>
	//   93  204:pop             
		((List) (obj4)).add(((Object) (new BasicNameValuePair("ip", MadvertiseUtil.getLocalIpAddress(MadvertiseView.access$200(MadvertiseView.this))))));
	//   94  205:aload           5
	//   95  207:new             #99  <Class BasicNameValuePair>
	//   96  210:dup             
	//   97  211:ldc1            #129 <String "ip">
	//   98  213:aload_0         
	//   99  214:getfield        #17  <Field MadvertiseView this$0>
	//  100  217:invokestatic    #45  <Method MadvertiseView$MadvertiseViewCallbackListener MadvertiseView.access$200(MadvertiseView)>
	//  101  220:invokestatic    #133 <Method String MadvertiseUtil.getLocalIpAddress(MadvertiseView$MadvertiseViewCallbackListener)>
	//  102  223:invokespecial   #106 <Method void BasicNameValuePair(String, String)>
	//  103  226:invokeinterface #112 <Method boolean List.add(Object)>
	//  104  231:pop             
		((List) (obj4)).add(((Object) (new BasicNameValuePair("format", "json"))));
	//  105  232:aload           5
	//  106  234:new             #99  <Class BasicNameValuePair>
	//  107  237:dup             
	//  108  238:ldc1            #135 <String "format">
	//  109  240:ldc1            #137 <String "json">
	//  110  242:invokespecial   #106 <Method void BasicNameValuePair(String, String)>
	//  111  245:invokeinterface #112 <Method boolean List.add(Object)>
	//  112  250:pop             
		((List) (obj4)).add(((Object) (new BasicNameValuePair("requester", "android_sdk"))));
	//  113  251:aload           5
	//  114  253:new             #99  <Class BasicNameValuePair>
	//  115  256:dup             
	//  116  257:ldc1            #139 <String "requester">
	//  117  259:ldc1            #141 <String "android_sdk">
	//  118  261:invokespecial   #106 <Method void BasicNameValuePair(String, String)>
	//  119  264:invokeinterface #112 <Method boolean List.add(Object)>
	//  120  269:pop             
		((List) (obj4)).add(((Object) (new BasicNameValuePair("version", "3.1.3"))));
	//  121  270:aload           5
	//  122  272:new             #99  <Class BasicNameValuePair>
	//  123  275:dup             
	//  124  276:ldc1            #143 <String "version">
	//  125  278:ldc1            #145 <String "3.1.3">
	//  126  280:invokespecial   #106 <Method void BasicNameValuePair(String, String)>
	//  127  283:invokeinterface #112 <Method boolean List.add(Object)>
	//  128  288:pop             
		((List) (obj4)).add(((Object) (new BasicNameValuePair("banner_type", MadvertiseView.access$400(MadvertiseView.this)))));
	//  129  289:aload           5
	//  130  291:new             #99  <Class BasicNameValuePair>
	//  131  294:dup             
	//  132  295:ldc1            #147 <String "banner_type">
	//  133  297:aload_0         
	//  134  298:getfield        #17  <Field MadvertiseView this$0>
	//  135  301:invokestatic    #151 <Method String MadvertiseView.access$400(MadvertiseView)>
	//  136  304:invokespecial   #106 <Method void BasicNameValuePair(String, String)>
	//  137  307:invokeinterface #112 <Method boolean List.add(Object)>
	//  138  312:pop             
		((List) (obj4)).add(((Object) (new BasicNameValuePair("deliver_only_text", Boolean.toString(MadvertiseView.access$500(MadvertiseView.this))))));
	//  139  313:aload           5
	//  140  315:new             #99  <Class BasicNameValuePair>
	//  141  318:dup             
	//  142  319:ldc1            #153 <String "deliver_only_text">
	//  143  321:aload_0         
	//  144  322:getfield        #17  <Field MadvertiseView this$0>
	//  145  325:invokestatic    #156 <Method boolean MadvertiseView.access$500(MadvertiseView)>
	//  146  328:invokestatic    #127 <Method String Boolean.toString(boolean)>
	//  147  331:invokespecial   #106 <Method void BasicNameValuePair(String, String)>
	//  148  334:invokeinterface #112 <Method boolean List.add(Object)>
	//  149  339:pop             
		if(MadvertiseView.access$600() != null && !MadvertiseView.access$600().equals(""))
	//* 150  340:invokestatic    #159 <Method String MadvertiseView.access$600()>
	//* 151  343:ifnull          377
	//* 152  346:invokestatic    #159 <Method String MadvertiseView.access$600()>
	//* 153  349:ldc1            #53  <String "">
	//* 154  351:invokevirtual   #164 <Method boolean String.equals(Object)>
	//* 155  354:ifne            377
			((List) (obj4)).add(((Object) (new BasicNameValuePair("age", MadvertiseView.access$600()))));
	//  156  357:aload           5
	//  157  359:new             #99  <Class BasicNameValuePair>
	//  158  362:dup             
	//  159  363:ldc1            #166 <String "age">
	//  160  365:invokestatic    #159 <Method String MadvertiseView.access$600()>
	//  161  368:invokespecial   #106 <Method void BasicNameValuePair(String, String)>
	//  162  371:invokeinterface #112 <Method boolean List.add(Object)>
	//  163  376:pop             
		((List) (obj4)).add(((Object) (new BasicNameValuePair("mraid", Boolean.toString(MadvertiseView.access$700(MadvertiseView.this))))));
	//  164  377:aload           5
	//  165  379:new             #99  <Class BasicNameValuePair>
	//  166  382:dup             
	//  167  383:ldc1            #168 <String "mraid">
	//  168  385:aload_0         
	//  169  386:getfield        #17  <Field MadvertiseView this$0>
	//  170  389:invokestatic    #171 <Method boolean MadvertiseView.access$700(MadvertiseView)>
	//  171  392:invokestatic    #127 <Method String Boolean.toString(boolean)>
	//  172  395:invokespecial   #106 <Method void BasicNameValuePair(String, String)>
	//  173  398:invokeinterface #112 <Method boolean List.add(Object)>
	//  174  403:pop             
		if(MadvertiseView.access$800() != null && !MadvertiseView.access$800().equals(""))
	//* 175  404:invokestatic    #174 <Method String MadvertiseView.access$800()>
	//* 176  407:ifnull          441
	//* 177  410:invokestatic    #174 <Method String MadvertiseView.access$800()>
	//* 178  413:ldc1            #53  <String "">
	//* 179  415:invokevirtual   #164 <Method boolean String.equals(Object)>
	//* 180  418:ifne            441
			((List) (obj4)).add(((Object) (new BasicNameValuePair("gender", MadvertiseView.access$800()))));
	//  181  421:aload           5
	//  182  423:new             #99  <Class BasicNameValuePair>
	//  183  426:dup             
	//  184  427:ldc1            #176 <String "gender">
	//  185  429:invokestatic    #174 <Method String MadvertiseView.access$800()>
	//  186  432:invokespecial   #106 <Method void BasicNameValuePair(String, String)>
	//  187  435:invokeinterface #112 <Method boolean List.add(Object)>
	//  188  440:pop             
		Display display = ((WindowManager)getContext().getApplicationContext().getSystemService("window")).getDefaultDisplay();
	//  189  441:aload_0         
	//  190  442:getfield        #17  <Field MadvertiseView this$0>
	//  191  445:invokevirtual   #36  <Method Context MadvertiseView.getContext()>
	//  192  448:invokevirtual   #41  <Method Context Context.getApplicationContext()>
	//  193  451:ldc1            #178 <String "window">
	//  194  453:invokevirtual   #182 <Method Object Context.getSystemService(String)>
	//  195  456:checkcast       #184 <Class WindowManager>
	//  196  459:invokeinterface #188 <Method Display WindowManager.getDefaultDisplay()>
	//  197  464:astore          6
		if(display.getWidth() > display.getHeight())
	//* 198  466:aload           6
	//* 199  468:invokevirtual   #194 <Method int Display.getWidth()>
	//* 200  471:aload           6
	//* 201  473:invokevirtual   #197 <Method int Display.getHeight()>
	//* 202  476:icmple          485
			obj = "landscape";
	//  203  479:ldc1            #199 <String "landscape">
	//  204  481:astore_2        
		else
	//* 205  482:goto            488
			obj = "portrait";
	//  206  485:ldc1            #201 <String "portrait">
	//  207  487:astore_2        
		((List) (obj4)).add(((Object) (new BasicNameValuePair("device_height", Integer.toString(display.getHeight())))));
	//  208  488:aload           5
	//  209  490:new             #99  <Class BasicNameValuePair>
	//  210  493:dup             
	//  211  494:ldc1            #203 <String "device_height">
	//  212  496:aload           6
	//  213  498:invokevirtual   #197 <Method int Display.getHeight()>
	//  214  501:invokestatic    #208 <Method String Integer.toString(int)>
	//  215  504:invokespecial   #106 <Method void BasicNameValuePair(String, String)>
	//  216  507:invokeinterface #112 <Method boolean List.add(Object)>
	//  217  512:pop             
		((List) (obj4)).add(((Object) (new BasicNameValuePair("device_width", Integer.toString(display.getWidth())))));
	//  218  513:aload           5
	//  219  515:new             #99  <Class BasicNameValuePair>
	//  220  518:dup             
	//  221  519:ldc1            #210 <String "device_width">
	//  222  521:aload           6
	//  223  523:invokevirtual   #194 <Method int Display.getWidth()>
	//  224  526:invokestatic    #208 <Method String Integer.toString(int)>
	//  225  529:invokespecial   #106 <Method void BasicNameValuePair(String, String)>
	//  226  532:invokeinterface #112 <Method boolean List.add(Object)>
	//  227  537:pop             
		if(MadvertiseView.access$900(MadvertiseView.this) == 0 && MadvertiseView.access$1000(MadvertiseView.this) == 0)
	//* 228  538:aload_0         
	//* 229  539:getfield        #17  <Field MadvertiseView this$0>
	//* 230  542:invokestatic    #214 <Method int MadvertiseView.access$900(MadvertiseView)>
	//* 231  545:ifne            584
	//* 232  548:aload_0         
	//* 233  549:getfield        #17  <Field MadvertiseView this$0>
	//* 234  552:invokestatic    #217 <Method int MadvertiseView.access$1000(MadvertiseView)>
	//* 235  555:ifne            584
		{
			MadvertiseView.access$902(MadvertiseView.this, display.getWidth());
	//  236  558:aload_0         
	//  237  559:getfield        #17  <Field MadvertiseView this$0>
	//  238  562:aload           6
	//  239  564:invokevirtual   #194 <Method int Display.getWidth()>
	//  240  567:invokestatic    #221 <Method int MadvertiseView.access$902(MadvertiseView, int)>
	//  241  570:pop             
			MadvertiseView.access$1002(MadvertiseView.this, display.getHeight());
	//  242  571:aload_0         
	//  243  572:getfield        #17  <Field MadvertiseView this$0>
	//  244  575:aload           6
	//  245  577:invokevirtual   #197 <Method int Display.getHeight()>
	//  246  580:invokestatic    #224 <Method int MadvertiseView.access$1002(MadvertiseView, int)>
	//  247  583:pop             
		}
		((List) (obj4)).add(((Object) (new BasicNameValuePair("parent_height", Integer.toString(MadvertiseView.access$1000(MadvertiseView.this))))));
	//  248  584:aload           5
	//  249  586:new             #99  <Class BasicNameValuePair>
	//  250  589:dup             
	//  251  590:ldc1            #226 <String "parent_height">
	//  252  592:aload_0         
	//  253  593:getfield        #17  <Field MadvertiseView this$0>
	//  254  596:invokestatic    #217 <Method int MadvertiseView.access$1000(MadvertiseView)>
	//  255  599:invokestatic    #208 <Method String Integer.toString(int)>
	//  256  602:invokespecial   #106 <Method void BasicNameValuePair(String, String)>
	//  257  605:invokeinterface #112 <Method boolean List.add(Object)>
	//  258  610:pop             
		((List) (obj4)).add(((Object) (new BasicNameValuePair("parent_width", Integer.toString(MadvertiseView.access$900(MadvertiseView.this))))));
	//  259  611:aload           5
	//  260  613:new             #99  <Class BasicNameValuePair>
	//  261  616:dup             
	//  262  617:ldc1            #228 <String "parent_width">
	//  263  619:aload_0         
	//  264  620:getfield        #17  <Field MadvertiseView this$0>
	//  265  623:invokestatic    #214 <Method int MadvertiseView.access$900(MadvertiseView)>
	//  266  626:invokestatic    #208 <Method String Integer.toString(int)>
	//  267  629:invokespecial   #106 <Method void BasicNameValuePair(String, String)>
	//  268  632:invokeinterface #112 <Method boolean List.add(Object)>
	//  269  637:pop             
		((List) (obj4)).add(((Object) (new BasicNameValuePair("device_orientation", ((String) (obj))))));
	//  270  638:aload           5
	//  271  640:new             #99  <Class BasicNameValuePair>
	//  272  643:dup             
	//  273  644:ldc1            #230 <String "device_orientation">
	//  274  646:aload_2         
	//  275  647:invokespecial   #106 <Method void BasicNameValuePair(String, String)>
	//  276  650:invokeinterface #112 <Method boolean List.add(Object)>
	//  277  655:pop             
		MadvertiseUtil.refreshCoordinates(getContext().getApplicationContext());
	//  278  656:aload_0         
	//  279  657:getfield        #17  <Field MadvertiseView this$0>
	//  280  660:invokevirtual   #36  <Method Context MadvertiseView.getContext()>
	//  281  663:invokevirtual   #41  <Method Context Context.getApplicationContext()>
	//  282  666:invokestatic    #234 <Method void MadvertiseUtil.refreshCoordinates(Context)>
		if(MadvertiseUtil.getLocation() != null)
	//* 283  669:invokestatic    #238 <Method Location MadvertiseUtil.getLocation()>
	//* 284  672:ifnull          727
		{
			((List) (obj4)).add(((Object) (new BasicNameValuePair("lat", Double.toString(MadvertiseUtil.getLocation().getLatitude())))));
	//  285  675:aload           5
	//  286  677:new             #99  <Class BasicNameValuePair>
	//  287  680:dup             
	//  288  681:ldc1            #240 <String "lat">
	//  289  683:invokestatic    #238 <Method Location MadvertiseUtil.getLocation()>
	//  290  686:invokevirtual   #246 <Method double Location.getLatitude()>
	//  291  689:invokestatic    #251 <Method String Double.toString(double)>
	//  292  692:invokespecial   #106 <Method void BasicNameValuePair(String, String)>
	//  293  695:invokeinterface #112 <Method boolean List.add(Object)>
	//  294  700:pop             
			((List) (obj4)).add(((Object) (new BasicNameValuePair("lng", Double.toString(MadvertiseUtil.getLocation().getLongitude())))));
	//  295  701:aload           5
	//  296  703:new             #99  <Class BasicNameValuePair>
	//  297  706:dup             
	//  298  707:ldc1            #253 <String "lng">
	//  299  709:invokestatic    #238 <Method Location MadvertiseUtil.getLocation()>
	//  300  712:invokevirtual   #256 <Method double Location.getLongitude()>
	//  301  715:invokestatic    #251 <Method String Double.toString(double)>
	//  302  718:invokespecial   #106 <Method void BasicNameValuePair(String, String)>
	//  303  721:invokeinterface #112 <Method boolean List.add(Object)>
	//  304  726:pop             
		}
		((List) (obj4)).add(((Object) (new BasicNameValuePair("app_name", MadvertiseUtil.getApplicationName(getContext().getApplicationContext())))));
	//  305  727:aload           5
	//  306  729:new             #99  <Class BasicNameValuePair>
	//  307  732:dup             
	//  308  733:ldc2            #258 <String "app_name">
	//  309  736:aload_0         
	//  310  737:getfield        #17  <Field MadvertiseView this$0>
	//  311  740:invokevirtual   #36  <Method Context MadvertiseView.getContext()>
	//  312  743:invokevirtual   #41  <Method Context Context.getApplicationContext()>
	//  313  746:invokestatic    #262 <Method String MadvertiseUtil.getApplicationName(Context)>
	//  314  749:invokespecial   #106 <Method void BasicNameValuePair(String, String)>
	//  315  752:invokeinterface #112 <Method boolean List.add(Object)>
	//  316  757:pop             
		((List) (obj4)).add(((Object) (new BasicNameValuePair("app_version", MadvertiseUtil.getApplicationVersion(getContext().getApplicationContext())))));
	//  317  758:aload           5
	//  318  760:new             #99  <Class BasicNameValuePair>
	//  319  763:dup             
	//  320  764:ldc2            #264 <String "app_version">
	//  321  767:aload_0         
	//  322  768:getfield        #17  <Field MadvertiseView this$0>
	//  323  771:invokevirtual   #36  <Method Context MadvertiseView.getContext()>
	//  324  774:invokevirtual   #41  <Method Context Context.getApplicationContext()>
	//  325  777:invokestatic    #267 <Method String MadvertiseUtil.getApplicationVersion(Context)>
	//  326  780:invokespecial   #106 <Method void BasicNameValuePair(String, String)>
	//  327  783:invokeinterface #112 <Method boolean List.add(Object)>
	//  328  788:pop             
		((List) (obj4)).add(((Object) (new BasicNameValuePair("udid_md5", MadvertiseUtil.getHashedAndroidID(getContext(), shType.MD5)))));
	//  329  789:aload           5
	//  330  791:new             #99  <Class BasicNameValuePair>
	//  331  794:dup             
	//  332  795:ldc2            #269 <String "udid_md5">
	//  333  798:aload_0         
	//  334  799:getfield        #17  <Field MadvertiseView this$0>
	//  335  802:invokevirtual   #36  <Method Context MadvertiseView.getContext()>
	//  336  805:getstatic       #275 <Field MadvertiseUtil$HashType MadvertiseUtil$HashType.MD5>
	//  337  808:invokestatic    #279 <Method String MadvertiseUtil.getHashedAndroidID(Context, MadvertiseUtil$HashType)>
	//  338  811:invokespecial   #106 <Method void BasicNameValuePair(String, String)>
	//  339  814:invokeinterface #112 <Method boolean List.add(Object)>
	//  340  819:pop             
		((List) (obj4)).add(((Object) (new BasicNameValuePair("udid_sha1", MadvertiseUtil.getHashedAndroidID(getContext(), shType.SHA1)))));
	//  341  820:aload           5
	//  342  822:new             #99  <Class BasicNameValuePair>
	//  343  825:dup             
	//  344  826:ldc2            #281 <String "udid_sha1">
	//  345  829:aload_0         
	//  346  830:getfield        #17  <Field MadvertiseView this$0>
	//  347  833:invokevirtual   #36  <Method Context MadvertiseView.getContext()>
	//  348  836:getstatic       #284 <Field MadvertiseUtil$HashType MadvertiseUtil$HashType.SHA1>
	//  349  839:invokestatic    #279 <Method String MadvertiseUtil.getHashedAndroidID(Context, MadvertiseUtil$HashType)>
	//  350  842:invokespecial   #106 <Method void BasicNameValuePair(String, String)>
	//  351  845:invokeinterface #112 <Method boolean List.add(Object)>
	//  352  850:pop             
		((List) (obj4)).add(((Object) (new BasicNameValuePair("mac_md5", MadvertiseUtil.getHashedMacAddress(getContext(), shType.MD5)))));
	//  353  851:aload           5
	//  354  853:new             #99  <Class BasicNameValuePair>
	//  355  856:dup             
	//  356  857:ldc2            #286 <String "mac_md5">
	//  357  860:aload_0         
	//  358  861:getfield        #17  <Field MadvertiseView this$0>
	//  359  864:invokevirtual   #36  <Method Context MadvertiseView.getContext()>
	//  360  867:getstatic       #275 <Field MadvertiseUtil$HashType MadvertiseUtil$HashType.MD5>
	//  361  870:invokestatic    #289 <Method String MadvertiseUtil.getHashedMacAddress(Context, MadvertiseUtil$HashType)>
	//  362  873:invokespecial   #106 <Method void BasicNameValuePair(String, String)>
	//  363  876:invokeinterface #112 <Method boolean List.add(Object)>
	//  364  881:pop             
		((List) (obj4)).add(((Object) (new BasicNameValuePair("mac_sha1", MadvertiseUtil.getHashedMacAddress(getContext(), shType.SHA1)))));
	//  365  882:aload           5
	//  366  884:new             #99  <Class BasicNameValuePair>
	//  367  887:dup             
	//  368  888:ldc2            #291 <String "mac_sha1">
	//  369  891:aload_0         
	//  370  892:getfield        #17  <Field MadvertiseView this$0>
	//  371  895:invokevirtual   #36  <Method Context MadvertiseView.getContext()>
	//  372  898:getstatic       #284 <Field MadvertiseUtil$HashType MadvertiseUtil$HashType.SHA1>
	//  373  901:invokestatic    #289 <Method String MadvertiseUtil.getHashedMacAddress(Context, MadvertiseUtil$HashType)>
	//  374  904:invokespecial   #106 <Method void BasicNameValuePair(String, String)>
	//  375  907:invokeinterface #112 <Method boolean List.add(Object)>
	//  376  912:pop             
		int i;
		Exception exception;
		IOException ioexception;
		Object obj3;
		try
		{
			obj = ((Object) (new UrlEncodedFormEntity(((List) (obj4)))));
	//  377  913:new             #293 <Class UrlEncodedFormEntity>
	//  378  916:dup             
	//  379  917:aload           5
	//  380  919:invokespecial   #296 <Method void UrlEncodedFormEntity(List)>
	//  381  922:astore_2        
		}
	//* 382  923:aload           4
	//* 383  925:aload_2         
	//* 384  926:invokevirtual   #300 <Method void HttpPost.setEntity(HttpEntity)>
	//* 385  929:aconst_null     
	//* 386  930:iconst_3        
	//* 387  931:ldc2            #302 <String "Post request created">
	//* 388  934:invokestatic    #59  <Method void MadvertiseUtil.logMessage(String, int, String)>
	//* 389  937:new             #61  <Class StringBuilder>
	//* 390  940:dup             
	//* 391  941:invokespecial   #62  <Method void StringBuilder()>
	//* 392  944:astore_2        
	//* 393  945:aload_2         
	//* 394  946:ldc2            #304 <String "Uri : ">
	//* 395  949:invokevirtual   #68  <Method StringBuilder StringBuilder.append(String)>
	//* 396  952:pop             
	//* 397  953:aload_2         
	//* 398  954:aload           4
	//* 399  956:invokevirtual   #308 <Method URI HttpPost.getURI()>
	//* 400  959:invokevirtual   #313 <Method String URI.toASCIIString()>
	//* 401  962:invokevirtual   #68  <Method StringBuilder StringBuilder.append(String)>
	//* 402  965:pop             
	//* 403  966:aconst_null     
	//* 404  967:iconst_3        
	//* 405  968:aload_2         
	//* 406  969:invokevirtual   #72  <Method String StringBuilder.toString()>
	//* 407  972:invokestatic    #59  <Method void MadvertiseUtil.logMessage(String, int, String)>
	//* 408  975:new             #61  <Class StringBuilder>
	//* 409  978:dup             
	//* 410  979:invokespecial   #62  <Method void StringBuilder()>
	//* 411  982:astore_2        
	//* 412  983:aload_2         
	//* 413  984:ldc2            #315 <String "All headers : ">
	//* 414  987:invokevirtual   #68  <Method StringBuilder StringBuilder.append(String)>
	//* 415  990:pop             
	//* 416  991:aload_2         
	//* 417  992:aload           4
	//* 418  994:invokevirtual   #319 <Method org.apache.http.Header[] HttpPost.getAllHeaders()>
	//* 419  997:invokestatic    #323 <Method String MadvertiseUtil.getAllHeadersAsString(org.apache.http.Header[])>
	//* 420 1000:invokevirtual   #68  <Method StringBuilder StringBuilder.append(String)>
	//* 421 1003:pop             
	//* 422 1004:aconst_null     
	//* 423 1005:iconst_3        
	//* 424 1006:aload_2         
	//* 425 1007:invokevirtual   #72  <Method String StringBuilder.toString()>
	//* 426 1010:invokestatic    #59  <Method void MadvertiseUtil.logMessage(String, int, String)>
	//* 427 1013:new             #61  <Class StringBuilder>
	//* 428 1016:dup             
	//* 429 1017:invokespecial   #62  <Method void StringBuilder()>
	//* 430 1020:astore_2        
	//* 431 1021:aload_2         
	//* 432 1022:ldc2            #325 <String "All request parameters :">
	//* 433 1025:invokevirtual   #68  <Method StringBuilder StringBuilder.append(String)>
	//* 434 1028:pop             
	//* 435 1029:aload_2         
	//* 436 1030:aload           5
	//* 437 1032:invokestatic    #329 <Method String MadvertiseUtil.printRequestParameters(List)>
	//* 438 1035:invokevirtual   #68  <Method StringBuilder StringBuilder.append(String)>
	//* 439 1038:pop             
	//* 440 1039:aconst_null     
	//* 441 1040:iconst_3        
	//* 442 1041:aload_2         
	//* 443 1042:invokevirtual   #72  <Method String StringBuilder.toString()>
	//* 444 1045:invokestatic    #59  <Method void MadvertiseUtil.logMessage(String, int, String)>
	//* 445 1048:aload_0         
	//* 446 1049:monitorenter    
	//* 447 1050:new             #331 <Class DefaultHttpClient>
	//* 448 1053:dup             
	//* 449 1054:invokespecial   #332 <Method void DefaultHttpClient()>
	//* 450 1057:astore_2        
	//* 451 1058:aload_2         
	//* 452 1059:invokeinterface #338 <Method org.apache.http.params.HttpParams HttpClient.getParams()>
	//* 453 1064:astore          5
	//* 454 1066:aload           5
	//* 455 1068:sipush          5000
	//* 456 1071:invokestatic    #344 <Method void HttpConnectionParams.setConnectionTimeout(org.apache.http.params.HttpParams, int)>
	//* 457 1074:aload           5
	//* 458 1076:sipush          5000
	//* 459 1079:invokestatic    #347 <Method void HttpConnectionParams.setSoTimeout(org.apache.http.params.HttpParams, int)>
	//* 460 1082:aconst_null     
	//* 461 1083:iconst_3        
	//* 462 1084:ldc2            #349 <String "Sending request">
	//* 463 1087:invokestatic    #59  <Method void MadvertiseUtil.logMessage(String, int, String)>
	//* 464 1090:aload_2         
	//* 465 1091:aload           4
	//* 466 1093:invokeinterface #353 <Method HttpResponse HttpClient.execute(org.apache.http.client.methods.HttpUriRequest)>
	//* 467 1098:astore          4
	//* 468 1100:new             #61  <Class StringBuilder>
	//* 469 1103:dup             
	//* 470 1104:invokespecial   #62  <Method void StringBuilder()>
	//* 471 1107:astore_2        
	//* 472 1108:aload_2         
	//* 473 1109:ldc2            #355 <String "Response Code => ">
	//* 474 1112:invokevirtual   #68  <Method StringBuilder StringBuilder.append(String)>
	//* 475 1115:pop             
	//* 476 1116:aload_2         
	//* 477 1117:aload           4
	//* 478 1119:invokeinterface #361 <Method StatusLine HttpResponse.getStatusLine()>
	//* 479 1124:invokeinterface #366 <Method int StatusLine.getStatusCode()>
	//* 480 1129:invokevirtual   #369 <Method StringBuilder StringBuilder.append(int)>
	//* 481 1132:pop             
	//* 482 1133:aconst_null     
	//* 483 1134:iconst_3        
	//* 484 1135:aload_2         
	//* 485 1136:invokevirtual   #72  <Method String StringBuilder.toString()>
	//* 486 1139:invokestatic    #59  <Method void MadvertiseUtil.logMessage(String, int, String)>
	//* 487 1142:ldc1            #53  <String "">
	//* 488 1144:astore_2        
	//* 489 1145:aload           4
	//* 490 1147:ldc2            #371 <String "X-Madvertise-Debug">
	//* 491 1150:invokeinterface #375 <Method org.apache.http.Header HttpResponse.getLastHeader(String)>
	//* 492 1155:ifnull          1172
	//* 493 1158:aload           4
	//* 494 1160:ldc2            #371 <String "X-Madvertise-Debug">
	//* 495 1163:invokeinterface #375 <Method org.apache.http.Header HttpResponse.getLastHeader(String)>
	//* 496 1168:invokevirtual   #376 <Method String Object.toString()>
	//* 497 1171:astore_2        
	//* 498 1172:aload_0         
	//* 499 1173:getfield        #17  <Field MadvertiseView this$0>
	//* 500 1176:invokestatic    #122 <Method boolean MadvertiseView.access$300(MadvertiseView)>
	//* 501 1179:ifeq            1217
	//* 502 1182:new             #61  <Class StringBuilder>
	//* 503 1185:dup             
	//* 504 1186:invokespecial   #62  <Method void StringBuilder()>
	//* 505 1189:astore          5
	//* 506 1191:aload           5
	//* 507 1193:ldc2            #378 <String "Madvertise Debug Response: ">
	//* 508 1196:invokevirtual   #68  <Method StringBuilder StringBuilder.append(String)>
	//* 509 1199:pop             
	//* 510 1200:aload           5
	//* 511 1202:aload_2         
	//* 512 1203:invokevirtual   #68  <Method StringBuilder StringBuilder.append(String)>
	//* 513 1206:pop             
	//* 514 1207:aconst_null     
	//* 515 1208:iconst_3        
	//* 516 1209:aload           5
	//* 517 1211:invokevirtual   #72  <Method String StringBuilder.toString()>
	//* 518 1214:invokestatic    #59  <Method void MadvertiseUtil.logMessage(String, int, String)>
	//* 519 1217:aload           4
	//* 520 1219:invokeinterface #361 <Method StatusLine HttpResponse.getStatusLine()>
	//* 521 1224:invokeinterface #366 <Method int StatusLine.getStatusCode()>
	//* 522 1229:istore_1        
	//* 523 1230:aload           4
	//* 524 1232:invokeinterface #382 <Method HttpEntity HttpResponse.getEntity()>
	//* 525 1237:astore          4
	//* 526 1239:iload_1         
	//* 527 1240:sipush          200
	//* 528 1243:icmpne          1407
	//* 529 1246:aload           4
	//* 530 1248:ifnull          1407
	//* 531 1251:aload           4
	//* 532 1253:invokeinterface #388 <Method InputStream HttpEntity.getContent()>
	//* 533 1258:astore_2        
	//* 534 1259:aload_2         
	//* 535 1260:invokestatic    #392 <Method String MadvertiseUtil.convertStreamToString(InputStream)>
	//* 536 1263:astore_3        
	//* 537 1264:new             #61  <Class StringBuilder>
	//* 538 1267:dup             
	//* 539 1268:invokespecial   #62  <Method void StringBuilder()>
	//* 540 1271:astore          4
	//* 541 1273:aload           4
	//* 542 1275:ldc2            #394 <String "Response => ">
	//* 543 1278:invokevirtual   #68  <Method StringBuilder StringBuilder.append(String)>
	//* 544 1281:pop             
	//* 545 1282:aload           4
	//* 546 1284:aload_3         
	//* 547 1285:invokevirtual   #68  <Method StringBuilder StringBuilder.append(String)>
	//* 548 1288:pop             
	//* 549 1289:aconst_null     
	//* 550 1290:iconst_3        
	//* 551 1291:aload           4
	//* 552 1293:invokevirtual   #72  <Method String StringBuilder.toString()>
	//* 553 1296:invokestatic    #59  <Method void MadvertiseUtil.logMessage(String, int, String)>
	//* 554 1299:new             #396 <Class JSONObject>
	//* 555 1302:dup             
	//* 556 1303:aload_3         
	//* 557 1304:invokespecial   #397 <Method void JSONObject(String)>
	//* 558 1307:astore_3        
	//* 559 1308:aload_0         
	//* 560 1309:getfield        #17  <Field MadvertiseView this$0>
	//* 561 1312:new             #399 <Class MadvertiseAd>
	//* 562 1315:dup             
	//* 563 1316:aload_0         
	//* 564 1317:getfield        #17  <Field MadvertiseView this$0>
	//* 565 1320:invokevirtual   #36  <Method Context MadvertiseView.getContext()>
	//* 566 1323:invokevirtual   #41  <Method Context Context.getApplicationContext()>
	//* 567 1326:aload_3         
	//* 568 1327:aload_0         
	//* 569 1328:getfield        #17  <Field MadvertiseView this$0>
	//* 570 1331:invokestatic    #45  <Method MadvertiseView$MadvertiseViewCallbackListener MadvertiseView.access$200(MadvertiseView)>
	//* 571 1334:invokespecial   #402 <Method void MadvertiseAd(Context, JSONObject, MadvertiseView$MadvertiseViewCallbackListener)>
	//* 572 1337:invokestatic    #406 <Method MadvertiseAd MadvertiseView.access$1102(MadvertiseView, MadvertiseAd)>
	//* 573 1340:pop             
	//* 574 1341:aload_0         
	//* 575 1342:getfield        #17  <Field MadvertiseView this$0>
	//* 576 1345:invokestatic    #409 <Method void MadvertiseView.access$1200(MadvertiseView)>
	//* 577 1348:aload_0         
	//* 578 1349:getfield        #17  <Field MadvertiseView this$0>
	//* 579 1352:invokestatic    #413 <Method Handler MadvertiseView.access$100(MadvertiseView)>
	//* 580 1355:aload_0         
	//* 581 1356:getfield        #17  <Field MadvertiseView this$0>
	//* 582 1359:invokestatic    #417 <Method Runnable MadvertiseView.access$1300(MadvertiseView)>
	//* 583 1362:invokevirtual   #423 <Method boolean Handler.post(Runnable)>
	//* 584 1365:pop             
	//* 585 1366:goto            1433
	//* 586 1369:astore          4
	//* 587 1371:aload_2         
	//* 588 1372:astore_3        
	//* 589 1373:aload           4
	//* 590 1375:astore_2        
	//* 591 1376:goto            1795
	//* 592 1379:astore          4
	//* 593 1381:aload_2         
	//* 594 1382:astore_3        
	//* 595 1383:goto            1481
	//* 596 1386:astore          4
	//* 597 1388:aload_2         
	//* 598 1389:astore_3        
	//* 599 1390:goto            1558
	//* 600 1393:astore          4
	//* 601 1395:aload_2         
	//* 602 1396:astore_3        
	//* 603 1397:goto            1635
	//* 604 1400:astore          4
	//* 605 1402:aload_2         
	//* 606 1403:astore_3        
	//* 607 1404:goto            1712
	//* 608 1407:aload_0         
	//* 609 1408:getfield        #17  <Field MadvertiseView this$0>
	//* 610 1411:invokestatic    #45  <Method MadvertiseView$MadvertiseViewCallbackListener MadvertiseView.access$200(MadvertiseView)>
	//* 611 1414:ifnull          1431
	//* 612 1417:aload_0         
	//* 613 1418:getfield        #17  <Field MadvertiseView this$0>
	//* 614 1421:invokestatic    #45  <Method MadvertiseView$MadvertiseViewCallbackListener MadvertiseView.access$200(MadvertiseView)>
	//* 615 1424:iload_1         
	//* 616 1425:aload_2         
	//* 617 1426:invokeinterface #429 <Method void MadvertiseView$MadvertiseViewCallbackListener.onIllegalHttpStatusCode(int, String)>
	//* 618 1431:aconst_null     
	//* 619 1432:astore_2        
	//* 620 1433:aload_2         
	//* 621 1434:ifnull          1785
	//* 622 1437:aload_2         
	//* 623 1438:invokevirtual   #434 <Method void InputStream.close()>
	//* 624 1441:goto            1785
	//* 625 1444:astore_2        
	//* 626 1445:aload_0         
	//* 627 1446:getfield        #17  <Field MadvertiseView this$0>
	//* 628 1449:invokestatic    #45  <Method MadvertiseView$MadvertiseViewCallbackListener MadvertiseView.access$200(MadvertiseView)>
	//* 629 1452:ifnull          1785
	//* 630 1455:aload_0         
	//* 631 1456:getfield        #17  <Field MadvertiseView this$0>
	//* 632 1459:invokestatic    #45  <Method MadvertiseView$MadvertiseViewCallbackListener MadvertiseView.access$200(MadvertiseView)>
	//* 633 1462:astore_3        
	//* 634 1463:aload_3         
	//* 635 1464:aload_2         
	//* 636 1465:invokeinterface #438 <Method void MadvertiseView$MadvertiseViewCallbackListener.onError(Exception)>
	//* 637 1470:goto            1785
	//* 638 1473:astore_2        
	//* 639 1474:goto            1795
	//* 640 1477:astore          4
	//* 641 1479:aconst_null     
	//* 642 1480:astore_3        
	//* 643 1481:aload_3         
	//* 644 1482:astore_2        
	//* 645 1483:aconst_null     
	//* 646 1484:iconst_3        
	//* 647 1485:ldc2            #440 <String "Could not receive a http response on an ad request">
	//* 648 1488:aload           4
	//* 649 1490:invokestatic    #443 <Method void MadvertiseUtil.logMessage(String, int, String, Throwable)>
	//* 650 1493:aload_3         
	//* 651 1494:astore_2        
	//* 652 1495:aload_0         
	//* 653 1496:getfield        #17  <Field MadvertiseView this$0>
	//* 654 1499:invokestatic    #45  <Method MadvertiseView$MadvertiseViewCallbackListener MadvertiseView.access$200(MadvertiseView)>
	//* 655 1502:ifnull          1521
	//* 656 1505:aload_3         
	//* 657 1506:astore_2        
	//* 658 1507:aload_0         
	//* 659 1508:getfield        #17  <Field MadvertiseView this$0>
	//* 660 1511:invokestatic    #45  <Method MadvertiseView$MadvertiseViewCallbackListener MadvertiseView.access$200(MadvertiseView)>
	//* 661 1514:aload           4
	//* 662 1516:invokeinterface #438 <Method void MadvertiseView$MadvertiseViewCallbackListener.onError(Exception)>
	//* 663 1521:aload_3         
	//* 664 1522:ifnull          1785
	//* 665 1525:aload_3         
	//* 666 1526:invokevirtual   #434 <Method void InputStream.close()>
	//* 667 1529:goto            1785
	//* 668 1532:astore_2        
	//* 669 1533:aload_0         
	//* 670 1534:getfield        #17  <Field MadvertiseView this$0>
	//* 671 1537:invokestatic    #45  <Method MadvertiseView$MadvertiseViewCallbackListener MadvertiseView.access$200(MadvertiseView)>
	//* 672 1540:ifnull          1785
	//* 673 1543:aload_0         
	//* 674 1544:getfield        #17  <Field MadvertiseView this$0>
	//* 675 1547:invokestatic    #45  <Method MadvertiseView$MadvertiseViewCallbackListener MadvertiseView.access$200(MadvertiseView)>
	//* 676 1550:astore_3        
	//* 677 1551:goto            1463
	//* 678 1554:astore          4
	//* 679 1556:aconst_null     
	//* 680 1557:astore_3        
	//* 681 1558:aload_3         
	//* 682 1559:astore_2        
	//* 683 1560:aconst_null     
	//* 684 1561:iconst_3        
	//* 685 1562:ldc2            #445 <String "Could not parse json object">
	//* 686 1565:aload           4
	//* 687 1567:invokestatic    #443 <Method void MadvertiseUtil.logMessage(String, int, String, Throwable)>
	//* 688 1570:aload_3         
	//* 689 1571:astore_2        
	//* 690 1572:aload_0         
	//* 691 1573:getfield        #17  <Field MadvertiseView this$0>
	//* 692 1576:invokestatic    #45  <Method MadvertiseView$MadvertiseViewCallbackListener MadvertiseView.access$200(MadvertiseView)>
	//* 693 1579:ifnull          1598
	//* 694 1582:aload_3         
	//* 695 1583:astore_2        
	//* 696 1584:aload_0         
	//* 697 1585:getfield        #17  <Field MadvertiseView this$0>
	//* 698 1588:invokestatic    #45  <Method MadvertiseView$MadvertiseViewCallbackListener MadvertiseView.access$200(MadvertiseView)>
	//* 699 1591:aload           4
	//* 700 1593:invokeinterface #438 <Method void MadvertiseView$MadvertiseViewCallbackListener.onError(Exception)>
	//* 701 1598:aload_3         
	//* 702 1599:ifnull          1785
	//* 703 1602:aload_3         
	//* 704 1603:invokevirtual   #434 <Method void InputStream.close()>
	//* 705 1606:goto            1785
	//* 706 1609:astore_2        
	//* 707 1610:aload_0         
	//* 708 1611:getfield        #17  <Field MadvertiseView this$0>
	//* 709 1614:invokestatic    #45  <Method MadvertiseView$MadvertiseViewCallbackListener MadvertiseView.access$200(MadvertiseView)>
	//* 710 1617:ifnull          1785
	//* 711 1620:aload_0         
	//* 712 1621:getfield        #17  <Field MadvertiseView this$0>
	//* 713 1624:invokestatic    #45  <Method MadvertiseView$MadvertiseViewCallbackListener MadvertiseView.access$200(MadvertiseView)>
	//* 714 1627:astore_3        
	//* 715 1628:goto            1463
	//* 716 1631:astore          4
	//* 717 1633:aconst_null     
	//* 718 1634:astore_3        
	//* 719 1635:aload_3         
	//* 720 1636:astore_2        
	//* 721 1637:aconst_null     
	//* 722 1638:iconst_3        
	//* 723 1639:ldc2            #440 <String "Could not receive a http response on an ad request">
	//* 724 1642:aload           4
	//* 725 1644:invokestatic    #443 <Method void MadvertiseUtil.logMessage(String, int, String, Throwable)>
	//* 726 1647:aload_3         
	//* 727 1648:astore_2        
	//* 728 1649:aload_0         
	//* 729 1650:getfield        #17  <Field MadvertiseView this$0>
	//* 730 1653:invokestatic    #45  <Method MadvertiseView$MadvertiseViewCallbackListener MadvertiseView.access$200(MadvertiseView)>
	//* 731 1656:ifnull          1675
	//* 732 1659:aload_3         
	//* 733 1660:astore_2        
	//* 734 1661:aload_0         
	//* 735 1662:getfield        #17  <Field MadvertiseView this$0>
	//* 736 1665:invokestatic    #45  <Method MadvertiseView$MadvertiseViewCallbackListener MadvertiseView.access$200(MadvertiseView)>
	//* 737 1668:aload           4
	//* 738 1670:invokeinterface #438 <Method void MadvertiseView$MadvertiseViewCallbackListener.onError(Exception)>
	//* 739 1675:aload_3         
	//* 740 1676:ifnull          1785
	//* 741 1679:aload_3         
	//* 742 1680:invokevirtual   #434 <Method void InputStream.close()>
	//* 743 1683:goto            1785
	//* 744 1686:astore_2        
	//* 745 1687:aload_0         
	//* 746 1688:getfield        #17  <Field MadvertiseView this$0>
	//* 747 1691:invokestatic    #45  <Method MadvertiseView$MadvertiseViewCallbackListener MadvertiseView.access$200(MadvertiseView)>
	//* 748 1694:ifnull          1785
	//* 749 1697:aload_0         
	//* 750 1698:getfield        #17  <Field MadvertiseView this$0>
	//* 751 1701:invokestatic    #45  <Method MadvertiseView$MadvertiseViewCallbackListener MadvertiseView.access$200(MadvertiseView)>
	//* 752 1704:astore_3        
	//* 753 1705:goto            1463
	//* 754 1708:astore          4
	//* 755 1710:aconst_null     
	//* 756 1711:astore_3        
	//* 757 1712:aload_3         
	//* 758 1713:astore_2        
	//* 759 1714:aconst_null     
	//* 760 1715:iconst_3        
	//* 761 1716:ldc2            #447 <String "Error in HTTP request / protocol">
	//* 762 1719:aload           4
	//* 763 1721:invokestatic    #443 <Method void MadvertiseUtil.logMessage(String, int, String, Throwable)>
	//* 764 1724:aload_3         
	//* 765 1725:astore_2        
	//* 766 1726:aload_0         
	//* 767 1727:getfield        #17  <Field MadvertiseView this$0>
	//* 768 1730:invokestatic    #45  <Method MadvertiseView$MadvertiseViewCallbackListener MadvertiseView.access$200(MadvertiseView)>
	//* 769 1733:ifnull          1752
	//* 770 1736:aload_3         
	//* 771 1737:astore_2        
	//* 772 1738:aload_0         
	//* 773 1739:getfield        #17  <Field MadvertiseView this$0>
	//* 774 1742:invokestatic    #45  <Method MadvertiseView$MadvertiseViewCallbackListener MadvertiseView.access$200(MadvertiseView)>
	//* 775 1745:aload           4
	//* 776 1747:invokeinterface #438 <Method void MadvertiseView$MadvertiseViewCallbackListener.onError(Exception)>
	//* 777 1752:aload_3         
	//* 778 1753:ifnull          1785
	//* 779 1756:aload_3         
	//* 780 1757:invokevirtual   #434 <Method void InputStream.close()>
	//* 781 1760:goto            1785
	//* 782 1763:astore_2        
	//* 783 1764:aload_0         
	//* 784 1765:getfield        #17  <Field MadvertiseView this$0>
	//* 785 1768:invokestatic    #45  <Method MadvertiseView$MadvertiseViewCallbackListener MadvertiseView.access$200(MadvertiseView)>
	//* 786 1771:ifnull          1785
	//* 787 1774:aload_0         
	//* 788 1775:getfield        #17  <Field MadvertiseView this$0>
	//* 789 1778:invokestatic    #45  <Method MadvertiseView$MadvertiseViewCallbackListener MadvertiseView.access$200(MadvertiseView)>
	//* 790 1781:astore_3        
	//* 791 1782:goto            1463
	//* 792 1785:aload_0         
	//* 793 1786:monitorexit     
	//* 794 1787:return          
	//* 795 1788:astore          4
	//* 796 1790:aload_2         
	//* 797 1791:astore_3        
	//* 798 1792:aload           4
	//* 799 1794:astore_2        
	//* 800 1795:aload_3         
	//* 801 1796:ifnull          1830
	//* 802 1799:aload_3         
	//* 803 1800:invokevirtual   #434 <Method void InputStream.close()>
	//* 804 1803:goto            1830
	//* 805 1806:astore_3        
	//* 806 1807:aload_0         
	//* 807 1808:getfield        #17  <Field MadvertiseView this$0>
	//* 808 1811:invokestatic    #45  <Method MadvertiseView$MadvertiseViewCallbackListener MadvertiseView.access$200(MadvertiseView)>
	//* 809 1814:ifnull          1830
	//* 810 1817:aload_0         
	//* 811 1818:getfield        #17  <Field MadvertiseView this$0>
	//* 812 1821:invokestatic    #45  <Method MadvertiseView$MadvertiseViewCallbackListener MadvertiseView.access$200(MadvertiseView)>
	//* 813 1824:aload_3         
	//* 814 1825:invokeinterface #438 <Method void MadvertiseView$MadvertiseViewCallbackListener.onError(Exception)>
	//* 815 1830:aload_2         
	//* 816 1831:athrow          
	//* 817 1832:astore_2        
	//* 818 1833:aload_0         
	//* 819 1834:monitorexit     
	//* 820 1835:aload_2         
	//* 821 1836:athrow          
		catch(UnsupportedEncodingException unsupportedencodingexception)
	//* 822 1837:astore_2        
		{
			throw new RuntimeException(((Throwable) (unsupportedencodingexception)));
	//  823 1838:new             #449 <Class RuntimeException>
	//  824 1841:dup             
	//  825 1842:aload_2         
	//  826 1843:invokespecial   #452 <Method void RuntimeException(Throwable)>
	//  827 1846:athrow          
		}
		((HttpPost) (obj2)).setEntity(((HttpEntity) (obj)));
		MadvertiseUtil.logMessage(((String) (null)), 3, "Post request created");
		obj = ((Object) (new StringBuilder()));
		((StringBuilder) (obj)).append("Uri : ");
		((StringBuilder) (obj)).append(((HttpPost) (obj2)).getURI().toASCIIString());
		MadvertiseUtil.logMessage(((String) (null)), 3, ((StringBuilder) (obj)).toString());
		obj = ((Object) (new StringBuilder()));
		((StringBuilder) (obj)).append("All headers : ");
		((StringBuilder) (obj)).append(MadvertiseUtil.getAllHeadersAsString(((HttpPost) (obj2)).getAllHeaders()));
		MadvertiseUtil.logMessage(((String) (null)), 3, ((StringBuilder) (obj)).toString());
		obj = ((Object) (new StringBuilder()));
		((StringBuilder) (obj)).append("All request parameters :");
		((StringBuilder) (obj)).append(MadvertiseUtil.printRequestParameters(((List) (obj4))));
		MadvertiseUtil.logMessage(((String) (null)), 3, ((StringBuilder) (obj)).toString());
		this;
		JVM INSTR monitorenter ;
		obj = ((Object) (new DefaultHttpClient()));
		obj4 = ((Object) (((HttpClient) (obj)).getParams()));
		HttpConnectionParams.setConnectionTimeout(((org.apache.http.params.HttpParams) (obj4)), 5000);
		HttpConnectionParams.setSoTimeout(((org.apache.http.params.HttpParams) (obj4)), 5000);
		MadvertiseUtil.logMessage(((String) (null)), 3, "Sending request");
		obj2 = ((Object) (((HttpClient) (obj)).execute(((org.apache.http.client.methods.HttpUriRequest) (obj2)))));
		obj = ((Object) (new StringBuilder()));
		((StringBuilder) (obj)).append("Response Code => ");
		((StringBuilder) (obj)).append(((HttpResponse) (obj2)).getStatusLine().getStatusCode());
		MadvertiseUtil.logMessage(((String) (null)), 3, ((StringBuilder) (obj)).toString());
		obj = "";
		if(((HttpResponse) (obj2)).getLastHeader("X-Madvertise-Debug") != null)
			obj = ((Object) (((Object) (((HttpResponse) (obj2)).getLastHeader("X-Madvertise-Debug"))).toString()));
		if(MadvertiseView.access$300(MadvertiseView.this))
		{
			obj4 = ((Object) (new StringBuilder()));
			((StringBuilder) (obj4)).append("Madvertise Debug Response: ");
			((StringBuilder) (obj4)).append(((String) (obj)));
			MadvertiseUtil.logMessage(((String) (null)), 3, ((StringBuilder) (obj4)).toString());
		}
		i = ((HttpResponse) (obj2)).getStatusLine().getStatusCode();
		obj2 = ((Object) (((HttpResponse) (obj2)).getEntity()));
		if(i != 200 || obj2 == null) goto _L2; else goto _L1
_L1:
		obj = ((Object) (((HttpEntity) (obj2)).getContent()));
		obj1 = ((Object) (MadvertiseUtil.convertStreamToString(((InputStream) (obj)))));
		obj2 = ((Object) (new StringBuilder()));
		((StringBuilder) (obj2)).append("Response => ");
		((StringBuilder) (obj2)).append(((String) (obj1)));
		MadvertiseUtil.logMessage(((String) (null)), 3, ((StringBuilder) (obj2)).toString());
		obj1 = ((Object) (new JSONObject(((String) (obj1)))));
		MadvertiseView.access$1102(MadvertiseView.this, new MadvertiseAd(getContext().getApplicationContext(), ((JSONObject) (obj1)), MadvertiseView.access$200(MadvertiseView.this)));
		MadvertiseView.access$1200(MadvertiseView.this);
		MadvertiseView.access$100(MadvertiseView.this).post(MadvertiseView.access$1300(MadvertiseView.this));
		  goto _L3
		obj3;
		obj1 = obj;
		obj = obj3;
		break MISSING_BLOCK_LABEL_1795;
		obj3;
		obj1 = obj;
		  goto _L4
		obj3;
		obj1 = obj;
		  goto _L5
		obj3;
		obj1 = obj;
		  goto _L6
		obj3;
		obj1 = obj;
		  goto _L7
_L2:
		if(MadvertiseView.access$200(MadvertiseView.this) != null)
			MadvertiseView.access$200(MadvertiseView.this).onIllegalHttpStatusCode(i, ((String) (obj)));
		obj = null;
_L3:
		if(obj == null)
			break MISSING_BLOCK_LABEL_1785;
		try
		{
			((InputStream) (obj)).close();
			break MISSING_BLOCK_LABEL_1785;
		}
		// Misplaced declaration of an exception variable
		catch(Object obj) { }
		if(MadvertiseView.access$200(MadvertiseView.this) == null)
			break MISSING_BLOCK_LABEL_1785;
		obj1 = ((Object) (MadvertiseView.access$200(MadvertiseView.this)));
_L8:
		((dvertiseViewCallbackListener) (obj1)).onError(((Exception) (obj)));
		break MISSING_BLOCK_LABEL_1785;
		obj;
		break MISSING_BLOCK_LABEL_1795;
		obj3;
		obj1 = null;
_L4:
		obj = obj1;
		MadvertiseUtil.logMessage(((String) (null)), 3, "Could not receive a http response on an ad request", ((Throwable) (obj3)));
		obj = obj1;
		if(MadvertiseView.access$200(MadvertiseView.this) == null)
			break MISSING_BLOCK_LABEL_1521;
		obj = obj1;
		MadvertiseView.access$200(MadvertiseView.this).onError(((Exception) (obj3)));
		if(obj1 == null)
			break MISSING_BLOCK_LABEL_1785;
		try
		{
			((InputStream) (obj1)).close();
			break MISSING_BLOCK_LABEL_1785;
		}
		// Misplaced declaration of an exception variable
		catch(Object obj) { }
		if(MadvertiseView.access$200(MadvertiseView.this) == null)
			break MISSING_BLOCK_LABEL_1785;
		obj1 = ((Object) (MadvertiseView.access$200(MadvertiseView.this)));
		  goto _L8
		obj3;
		obj1 = null;
_L5:
		obj = obj1;
		MadvertiseUtil.logMessage(((String) (null)), 3, "Could not parse json object", ((Throwable) (obj3)));
		obj = obj1;
		if(MadvertiseView.access$200(MadvertiseView.this) == null)
			break MISSING_BLOCK_LABEL_1598;
		obj = obj1;
		MadvertiseView.access$200(MadvertiseView.this).onError(((Exception) (obj3)));
		if(obj1 == null)
			break MISSING_BLOCK_LABEL_1785;
		try
		{
			((InputStream) (obj1)).close();
			break MISSING_BLOCK_LABEL_1785;
		}
		// Misplaced declaration of an exception variable
		catch(Object obj) { }
		if(MadvertiseView.access$200(MadvertiseView.this) == null)
			break MISSING_BLOCK_LABEL_1785;
		obj1 = ((Object) (MadvertiseView.access$200(MadvertiseView.this)));
		  goto _L8
		obj3;
		obj1 = null;
_L6:
		obj = obj1;
		MadvertiseUtil.logMessage(((String) (null)), 3, "Could not receive a http response on an ad request", ((Throwable) (obj3)));
		obj = obj1;
		if(MadvertiseView.access$200(MadvertiseView.this) == null)
			break MISSING_BLOCK_LABEL_1675;
		obj = obj1;
		MadvertiseView.access$200(MadvertiseView.this).onError(((Exception) (obj3)));
		if(obj1 == null)
			break MISSING_BLOCK_LABEL_1785;
		try
		{
			((InputStream) (obj1)).close();
			break MISSING_BLOCK_LABEL_1785;
		}
		// Misplaced declaration of an exception variable
		catch(Object obj) { }
		if(MadvertiseView.access$200(MadvertiseView.this) == null)
			break MISSING_BLOCK_LABEL_1785;
		obj1 = ((Object) (MadvertiseView.access$200(MadvertiseView.this)));
		  goto _L8
		obj3;
		obj1 = null;
_L7:
		obj = obj1;
		MadvertiseUtil.logMessage(((String) (null)), 3, "Error in HTTP request / protocol", ((Throwable) (obj3)));
		obj = obj1;
		if(MadvertiseView.access$200(MadvertiseView.this) == null)
			break MISSING_BLOCK_LABEL_1752;
		obj = obj1;
		MadvertiseView.access$200(MadvertiseView.this).onError(((Exception) (obj3)));
		if(obj1 == null)
			break MISSING_BLOCK_LABEL_1785;
		try
		{
			((InputStream) (obj1)).close();
			break MISSING_BLOCK_LABEL_1785;
		}
		// Misplaced declaration of an exception variable
		catch(Object obj) { }
		if(MadvertiseView.access$200(MadvertiseView.this) == null)
			break MISSING_BLOCK_LABEL_1785;
		obj1 = ((Object) (MadvertiseView.access$200(MadvertiseView.this)));
		  goto _L8
		this;
		JVM INSTR monitorexit ;
		return;
		obj3;
		obj1 = obj;
		obj = obj3;
		if(obj1 == null)
			break MISSING_BLOCK_LABEL_1830;
		((InputStream) (obj1)).close();
		break MISSING_BLOCK_LABEL_1830;
		ioexception;
		if(MadvertiseView.access$200(MadvertiseView.this) != null)
			MadvertiseView.access$200(MadvertiseView.this).onError(((Exception) (ioexception)));
		throw obj;
		exception;
		this;
		JVM INSTR monitorexit ;
		throw exception;
	}

	final MadvertiseView this$0;

	MadvertiseView$3()
	{
		this$0 = MadvertiseView.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field MadvertiseView this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #20  <Method void Object()>
	//    5    9:return          
	}
}

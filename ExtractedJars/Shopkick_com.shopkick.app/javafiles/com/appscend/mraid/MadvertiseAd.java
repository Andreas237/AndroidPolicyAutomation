// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appscend.mraid;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import org.json.*;

// Referenced classes of package com.appscend.mraid:
//			MadvertiseUtil

public class MadvertiseAd
{

	protected MadvertiseAd(Context context, JSONObject jsonobject, MadvertiseView.MadvertiseViewCallbackListener madvertiseviewcallbacklistener)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #40  <Method void Object()>
		MARKUP = "markup";
	//    2    4:aload_0         
	//    3    5:ldc1            #41  <String "markup">
	//    4    7:putfield        #43  <Field String MARKUP>
		CLICK_URL_CODE = "click_url";
	//    5   10:aload_0         
	//    6   11:ldc1            #45  <String "click_url">
	//    7   13:putfield        #47  <Field String CLICK_URL_CODE>
		BANNER_URL_CODE = "url";
	//    8   16:aload_0         
	//    9   17:ldc1            #49  <String "url">
	//   10   19:putfield        #51  <Field String BANNER_URL_CODE>
		TEXT_CODE = "text";
	//   11   22:aload_0         
	//   12   23:ldc1            #53  <String "text">
	//   13   25:putfield        #55  <Field String TEXT_CODE>
		IMPRESSION_TRACKING_ARRAY_CODE = "tracking";
	//   14   28:aload_0         
	//   15   29:ldc1            #57  <String "tracking">
	//   16   31:putfield        #59  <Field String IMPRESSION_TRACKING_ARRAY_CODE>
		mHasBanner = false;
	//   17   34:aload_0         
	//   18   35:iconst_0        
	//   19   36:putfield        #61  <Field boolean mHasBanner>
		mBannerHeight = 53;
	//   20   39:aload_0         
	//   21   40:bipush          53
	//   22   42:putfield        #63  <Field int mBannerHeight>
		mBannerWidth = 320;
	//   23   45:aload_0         
	//   24   46:sipush          320
	//   25   49:putfield        #65  <Field int mBannerWidth>
		mIsMraid = false;
	//   26   52:aload_0         
	//   27   53:iconst_0        
	//   28   54:putfield        #67  <Field boolean mIsMraid>
		mContext = context;
	//   29   57:aload_0         
	//   30   58:aload_1         
	//   31   59:putfield        #69  <Field Context mContext>
		mCallbackListener = madvertiseviewcallbacklistener;
	//   32   62:aload_0         
	//   33   63:aload_3         
	//   34   64:putfield        #71  <Field MadvertiseView$MadvertiseViewCallbackListener mCallbackListener>
		MadvertiseUtil.logMessage(((String) (null)), 3, "Creating ad");
	//   35   67:aconst_null     
	//   36   68:iconst_3        
	//   37   69:ldc1            #73  <String "Creating ad">
	//   38   71:invokestatic    #79  <Method void MadvertiseUtil.logMessage(String, int, String)>
		mJsonNames = jsonobject.names();
	//   39   74:aload_0         
	//   40   75:aload_2         
	//   41   76:invokevirtual   #85  <Method JSONArray JSONObject.names()>
	//   42   79:putfield        #87  <Field JSONArray mJsonNames>
		mJsonValues = jsonobject.toJSONArray(mJsonNames);
	//   43   82:aload_0         
	//   44   83:aload_2         
	//   45   84:aload_0         
	//   46   85:getfield        #87  <Field JSONArray mJsonNames>
	//   47   88:invokevirtual   #91  <Method JSONArray JSONObject.toJSONArray(JSONArray)>
	//   48   91:putfield        #93  <Field JSONArray mJsonValues>
		int i = 0;
	//   49   94:iconst_0        
	//   50   95:istore          4
_L2:
		if(i >= mJsonNames.length())
			break; /* Loop/switch isn't completed */
	//   51   97:iload           4
	//   52   99:aload_0         
	//   53  100:getfield        #87  <Field JSONArray mJsonNames>
	//   54  103:invokevirtual   #99  <Method int JSONArray.length()>
	//   55  106:icmpge          177
		context = ((Context) (new StringBuilder()));
	//   56  109:new             #101 <Class StringBuilder>
	//   57  112:dup             
	//   58  113:invokespecial   #102 <Method void StringBuilder()>
	//   59  116:astore_1        
		((StringBuilder) (context)).append("Key => ");
	//   60  117:aload_1         
	//   61  118:ldc1            #104 <String "Key => ">
	//   62  120:invokevirtual   #108 <Method StringBuilder StringBuilder.append(String)>
	//   63  123:pop             
		((StringBuilder) (context)).append(mJsonNames.getString(i));
	//   64  124:aload_1         
	//   65  125:aload_0         
	//   66  126:getfield        #87  <Field JSONArray mJsonNames>
	//   67  129:iload           4
	//   68  131:invokevirtual   #112 <Method String JSONArray.getString(int)>
	//   69  134:invokevirtual   #108 <Method StringBuilder StringBuilder.append(String)>
	//   70  137:pop             
		((StringBuilder) (context)).append(" Value => ");
	//   71  138:aload_1         
	//   72  139:ldc1            #114 <String " Value => ">
	//   73  141:invokevirtual   #108 <Method StringBuilder StringBuilder.append(String)>
	//   74  144:pop             
		((StringBuilder) (context)).append(mJsonValues.getString(i));
	//   75  145:aload_1         
	//   76  146:aload_0         
	//   77  147:getfield        #93  <Field JSONArray mJsonValues>
	//   78  150:iload           4
	//   79  152:invokevirtual   #112 <Method String JSONArray.getString(int)>
	//   80  155:invokevirtual   #108 <Method StringBuilder StringBuilder.append(String)>
	//   81  158:pop             
		MadvertiseUtil.logMessage(((String) (null)), 3, ((StringBuilder) (context)).toString());
	//   82  159:aconst_null     
	//   83  160:iconst_3        
	//   84  161:aload_1         
	//   85  162:invokevirtual   #118 <Method String StringBuilder.toString()>
	//   86  165:invokestatic    #79  <Method void MadvertiseUtil.logMessage(String, int, String)>
		i++;
	//   87  168:iload           4
	//   88  170:iconst_1        
	//   89  171:iadd            
	//   90  172:istore          4
		if(true) goto _L2; else goto _L1
	//   91  174:goto            97
_L1:
		markup = MadvertiseUtil.getJSONValue(jsonobject, "markup");
	//   92  177:aload_0         
	//   93  178:aload_2         
	//   94  179:ldc1            #41  <String "markup">
	//   95  181:invokestatic    #122 <Method String MadvertiseUtil.getJSONValue(JSONObject, String)>
	//   96  184:putfield        #124 <Field String markup>
		if(markup != null && !markup.equals(""))
	//*  97  187:aload_0         
	//*  98  188:getfield        #124 <Field String markup>
	//*  99  191:ifnull          249
	//* 100  194:aload_0         
	//* 101  195:getfield        #124 <Field String markup>
	//* 102  198:ldc1            #126 <String "">
	//* 103  200:invokevirtual   #132 <Method boolean String.equals(Object)>
	//* 104  203:ifne            249
		{
			mBannerType = "rich_media";
	//  105  206:aload_0         
	//  106  207:ldc1            #134 <String "rich_media">
	//  107  209:putfield        #136 <Field String mBannerType>
			mIsMraid = true;
	//  108  212:aload_0         
	//  109  213:iconst_1        
	//  110  214:putfield        #67  <Field boolean mIsMraid>
			mHasBanner = true;
	//  111  217:aload_0         
	//  112  218:iconst_1        
	//  113  219:putfield        #61  <Field boolean mHasBanner>
			mBannerHeight = Integer.parseInt(MadvertiseUtil.getJSONValue(jsonobject, "height"));
	//  114  222:aload_0         
	//  115  223:aload_2         
	//  116  224:ldc1            #138 <String "height">
	//  117  226:invokestatic    #122 <Method String MadvertiseUtil.getJSONValue(JSONObject, String)>
	//  118  229:invokestatic    #144 <Method int Integer.parseInt(String)>
	//  119  232:putfield        #63  <Field int mBannerHeight>
			mBannerWidth = Integer.parseInt(MadvertiseUtil.getJSONValue(jsonobject, "width"));
	//  120  235:aload_0         
	//  121  236:aload_2         
	//  122  237:ldc1            #146 <String "width">
	//  123  239:invokestatic    #122 <Method String MadvertiseUtil.getJSONValue(JSONObject, String)>
	//  124  242:invokestatic    #144 <Method int Integer.parseInt(String)>
	//  125  245:putfield        #65  <Field int mBannerWidth>
			return;
	//  126  248:return          
		}
		mClickUrl = MadvertiseUtil.getJSONValue(jsonobject, "click_url");
	//  127  249:aload_0         
	//  128  250:aload_2         
	//  129  251:ldc1            #45  <String "click_url">
	//  130  253:invokestatic    #122 <Method String MadvertiseUtil.getJSONValue(JSONObject, String)>
	//  131  256:putfield        #148 <Field String mClickUrl>
		mText = MadvertiseUtil.getJSONValue(jsonobject, "text");
	//  132  259:aload_0         
	//  133  260:aload_2         
	//  134  261:ldc1            #53  <String "text">
	//  135  263:invokestatic    #122 <Method String MadvertiseUtil.getJSONValue(JSONObject, String)>
	//  136  266:putfield        #150 <Field String mText>
		mImpressionTrackingArray = MadvertiseUtil.getJSONArray(jsonobject, "tracking");
	//  137  269:aload_0         
	//  138  270:aload_2         
	//  139  271:ldc1            #57  <String "tracking">
	//  140  273:invokestatic    #154 <Method JSONArray MadvertiseUtil.getJSONArray(JSONObject, String)>
	//  141  276:putfield        #156 <Field JSONArray mImpressionTrackingArray>
		context = ((Context) (MadvertiseUtil.getJSONObject(jsonobject, "banner")));
	//  142  279:aload_2         
	//  143  280:ldc1            #158 <String "banner">
	//  144  282:invokestatic    #162 <Method JSONObject MadvertiseUtil.getJSONObject(JSONObject, String)>
	//  145  285:astore_1        
		if(context == null)
	//* 146  286:aload_1         
	//* 147  287:ifnonnull       291
			return;
	//  148  290:return          
		mBannerUrl = MadvertiseUtil.getJSONValue(((JSONObject) (context)), "url");
	//  149  291:aload_0         
	//  150  292:aload_1         
	//  151  293:ldc1            #49  <String "url">
	//  152  295:invokestatic    #122 <Method String MadvertiseUtil.getJSONValue(JSONObject, String)>
	//  153  298:putfield        #164 <Field String mBannerUrl>
		mHasBanner = true;
	//  154  301:aload_0         
	//  155  302:iconst_1        
	//  156  303:putfield        #61  <Field boolean mHasBanner>
		mBannerType = MadvertiseUtil.getJSONValue(((JSONObject) (context)), "type");
	//  157  306:aload_0         
	//  158  307:aload_1         
	//  159  308:ldc1            #166 <String "type">
	//  160  310:invokestatic    #122 <Method String MadvertiseUtil.getJSONValue(JSONObject, String)>
	//  161  313:putfield        #136 <Field String mBannerType>
		context = ((Context) (MadvertiseUtil.getJSONObject(((JSONObject) (context)), "rich_media")));
	//  162  316:aload_1         
	//  163  317:ldc1            #134 <String "rich_media">
	//  164  319:invokestatic    #162 <Method JSONObject MadvertiseUtil.getJSONObject(JSONObject, String)>
	//  165  322:astore_1        
		if(context == null)
	//* 166  323:aload_1         
	//* 167  324:ifnonnull       328
			return;
	//  168  327:return          
		if(!MadvertiseUtil.getJSONBoolean(((JSONObject) (context)), "mraid"))
	//* 169  328:aload_1         
	//* 170  329:ldc1            #168 <String "mraid">
	//* 171  331:invokestatic    #172 <Method boolean MadvertiseUtil.getJSONBoolean(JSONObject, String)>
	//* 172  334:ifne            349
		{
			mHasBanner = false;
	//  173  337:aload_0         
	//  174  338:iconst_0        
	//  175  339:putfield        #61  <Field boolean mHasBanner>
			mBannerUrl = "";
	//  176  342:aload_0         
	//  177  343:ldc1            #126 <String "">
	//  178  345:putfield        #164 <Field String mBannerUrl>
			return;
	//  179  348:return          
		}
		mIsMraid = true;
	//  180  349:aload_0         
	//  181  350:iconst_1        
	//  182  351:putfield        #67  <Field boolean mIsMraid>
		mBannerUrl = MadvertiseUtil.getJSONValue(((JSONObject) (context)), "full_url");
	//  183  354:aload_0         
	//  184  355:aload_1         
	//  185  356:ldc1            #174 <String "full_url">
	//  186  358:invokestatic    #122 <Method String MadvertiseUtil.getJSONValue(JSONObject, String)>
	//  187  361:putfield        #164 <Field String mBannerUrl>
		try
		{
			mBannerHeight = Integer.parseInt(MadvertiseUtil.getJSONValue(((JSONObject) (context)), "height"));
	//  188  364:aload_0         
	//  189  365:aload_1         
	//  190  366:ldc1            #138 <String "height">
	//  191  368:invokestatic    #122 <Method String MadvertiseUtil.getJSONValue(JSONObject, String)>
	//  192  371:invokestatic    #144 <Method int Integer.parseInt(String)>
	//  193  374:putfield        #63  <Field int mBannerHeight>
			mBannerWidth = Integer.parseInt(MadvertiseUtil.getJSONValue(((JSONObject) (context)), "width"));
	//  194  377:aload_0         
	//  195  378:aload_1         
	//  196  379:ldc1            #146 <String "width">
	//  197  381:invokestatic    #122 <Method String MadvertiseUtil.getJSONValue(JSONObject, String)>
	//  198  384:invokestatic    #144 <Method int Integer.parseInt(String)>
	//  199  387:putfield        #65  <Field int mBannerWidth>
			return;
	//  200  390:return          
		}
	//* 201  391:aload_0         
	//* 202  392:bipush          53
	//* 203  394:putfield        #63  <Field int mBannerHeight>
	//* 204  397:aload_0         
	//* 205  398:sipush          320
	//* 206  401:putfield        #65  <Field int mBannerWidth>
	//* 207  404:return          
	//* 208  405:astore_1        
	//* 209  406:aconst_null     
	//* 210  407:iconst_3        
	//* 211  408:ldc1            #176 <String "Error in json string">
	//* 212  410:invokestatic    #79  <Method void MadvertiseUtil.logMessage(String, int, String)>
	//* 213  413:aload_0         
	//* 214  414:getfield        #71  <Field MadvertiseView$MadvertiseViewCallbackListener mCallbackListener>
	//* 215  417:astore_2        
	//* 216  418:aload_2         
	//* 217  419:ifnull          429
	//* 218  422:aload_2         
	//* 219  423:aload_1         
	//* 220  424:invokeinterface #182 <Method void MadvertiseView$MadvertiseViewCallbackListener.onError(Exception)>
	//* 221  429:aload_1         
	//* 222  430:invokevirtual   #185 <Method void JSONException.printStackTrace()>
	//* 223  433:return          
		// Misplaced declaration of an exception variable
		catch(Context context) { }
	//  224  434:astore_1        
		try
		{
			mBannerHeight = 53;
			mBannerWidth = 320;
			return;
		}
		// Misplaced declaration of an exception variable
		catch(Context context)
		{
			MadvertiseUtil.logMessage(((String) (null)), 3, "Error in json string");
		}
		jsonobject = ((JSONObject) (mCallbackListener));
		if(jsonobject != null)
			((MadvertiseView.MadvertiseViewCallbackListener) (jsonobject)).onError(((Exception) (context)));
		((JSONException) (context)).printStackTrace();
		return;
	//* 225  435:goto            391
	}

	protected int getBannerHeight()
	{
		return mBannerHeight;
	//    0    0:aload_0         
	//    1    1:getfield        #63  <Field int mBannerHeight>
	//    2    4:ireturn         
	}

	protected String getBannerType()
	{
		return mBannerType;
	//    0    0:aload_0         
	//    1    1:getfield        #136 <Field String mBannerType>
	//    2    4:areturn         
	}

	public String getBannerUrl()
	{
		return mBannerUrl;
	//    0    0:aload_0         
	//    1    1:getfield        #164 <Field String mBannerUrl>
	//    2    4:areturn         
	}

	protected int getBannerWidth()
	{
		return mBannerWidth;
	//    0    0:aload_0         
	//    1    1:getfield        #65  <Field int mBannerWidth>
	//    2    4:ireturn         
	}

	protected String getClickURL()
	{
		return mClickUrl;
	//    0    0:aload_0         
	//    1    1:getfield        #148 <Field String mClickUrl>
	//    2    4:areturn         
	}

	protected byte[] getImageByteArray()
	{
		return mImageByteArray;
	//    0    0:aload_0         
	//    1    1:getfield        #195 <Field byte[] mImageByteArray>
	//    2    4:areturn         
	}

	protected JSONArray getImpressionTrackingArray()
	{
		return mImpressionTrackingArray;
	//    0    0:aload_0         
	//    1    1:getfield        #156 <Field JSONArray mImpressionTrackingArray>
	//    2    4:areturn         
	}

	public String getMarkup()
	{
		return markup;
	//    0    0:aload_0         
	//    1    1:getfield        #124 <Field String markup>
	//    2    4:areturn         
	}

	protected String getText()
	{
		return mText;
	//    0    0:aload_0         
	//    1    1:getfield        #150 <Field String mText>
	//    2    4:areturn         
	}

	protected void handleClick()
	{
		String s = mClickUrl;
	//    0    0:aload_0         
	//    1    1:getfield        #148 <Field String mClickUrl>
	//    2    4:astore_1        
		if(s != null && !s.equals(""))
	//*   3    5:aload_1         
	//*   4    6:ifnull          121
	//*   5    9:aload_1         
	//*   6   10:ldc1            #126 <String "">
	//*   7   12:invokevirtual   #132 <Method boolean String.equals(Object)>
	//*   8   15:ifne            121
		{
			Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(mClickUrl));
	//    9   18:new             #203 <Class Intent>
	//   10   21:dup             
	//   11   22:ldc1            #205 <String "android.intent.action.VIEW">
	//   12   24:aload_0         
	//   13   25:getfield        #148 <Field String mClickUrl>
	//   14   28:invokestatic    #211 <Method Uri Uri.parse(String)>
	//   15   31:invokespecial   #214 <Method void Intent(String, Uri)>
	//   16   34:astore_1        
			intent.addFlags(0x10000000);
	//   17   35:aload_1         
	//   18   36:ldc1            #215 <Int 0x10000000>
	//   19   38:invokevirtual   #219 <Method Intent Intent.addFlags(int)>
	//   20   41:pop             
			try
			{
				mContext.startActivity(intent);
	//   21   42:aload_0         
	//   22   43:getfield        #69  <Field Context mContext>
	//   23   46:aload_1         
	//   24   47:invokevirtual   #225 <Method void Context.startActivity(Intent)>
				if(mCallbackListener != null)
	//*  25   50:aload_0         
	//*  26   51:getfield        #71  <Field MadvertiseView$MadvertiseViewCallbackListener mCallbackListener>
	//*  27   54:ifnull          121
				{
					mCallbackListener.onAdClicked();
	//   28   57:aload_0         
	//   29   58:getfield        #71  <Field MadvertiseView$MadvertiseViewCallbackListener mCallbackListener>
	//   30   61:invokeinterface #228 <Method void MadvertiseView$MadvertiseViewCallbackListener.onAdClicked()>
					return;
	//   31   66:return          
				}
			}
			catch(Exception exception)
	//*  32   67:astore_1        
			{
				Object obj = ((Object) (new StringBuilder()));
	//   33   68:new             #101 <Class StringBuilder>
	//   34   71:dup             
	//   35   72:invokespecial   #102 <Method void StringBuilder()>
	//   36   75:astore_2        
				((StringBuilder) (obj)).append("Failed to open URL : ");
	//   37   76:aload_2         
	//   38   77:ldc1            #230 <String "Failed to open URL : ">
	//   39   79:invokevirtual   #108 <Method StringBuilder StringBuilder.append(String)>
	//   40   82:pop             
				((StringBuilder) (obj)).append(mClickUrl);
	//   41   83:aload_2         
	//   42   84:aload_0         
	//   43   85:getfield        #148 <Field String mClickUrl>
	//   44   88:invokevirtual   #108 <Method StringBuilder StringBuilder.append(String)>
	//   45   91:pop             
				MadvertiseUtil.logMessage(((String) (null)), 3, ((StringBuilder) (obj)).toString());
	//   46   92:aconst_null     
	//   47   93:iconst_3        
	//   48   94:aload_2         
	//   49   95:invokevirtual   #118 <Method String StringBuilder.toString()>
	//   50   98:invokestatic    #79  <Method void MadvertiseUtil.logMessage(String, int, String)>
				obj = ((Object) (mCallbackListener));
	//   51  101:aload_0         
	//   52  102:getfield        #71  <Field MadvertiseView$MadvertiseViewCallbackListener mCallbackListener>
	//   53  105:astore_2        
				if(obj != null)
	//*  54  106:aload_2         
	//*  55  107:ifnull          117
					((MadvertiseView.MadvertiseViewCallbackListener) (obj)).onError(exception);
	//   56  110:aload_2         
	//   57  111:aload_1         
	//   58  112:invokeinterface #182 <Method void MadvertiseView$MadvertiseViewCallbackListener.onError(Exception)>
				exception.printStackTrace();
	//   59  117:aload_1         
	//   60  118:invokevirtual   #231 <Method void Exception.printStackTrace()>
			}
		}
	//   61  121:return          
	}

	protected boolean hasBanner()
	{
		return mHasBanner;
	//    0    0:aload_0         
	//    1    1:getfield        #61  <Field boolean mHasBanner>
	//    2    4:ireturn         
	}

	protected boolean isLoaddableViaMarkup()
	{
		String s = markup;
	//    0    0:aload_0         
	//    1    1:getfield        #124 <Field String markup>
	//    2    4:astore_1        
		return s != null && !s.equals("");
	//    3    5:aload_1         
	//    4    6:ifnull          20
	//    5    9:aload_1         
	//    6   10:ldc1            #126 <String "">
	//    7   12:invokevirtual   #132 <Method boolean String.equals(Object)>
	//    8   15:ifne            20
	//    9   18:iconst_1        
	//   10   19:ireturn         
	//   11   20:iconst_0        
	//   12   21:ireturn         
	}

	protected boolean isMraid()
	{
		return mIsMraid;
	//    0    0:aload_0         
	//    1    1:getfield        #67  <Field boolean mIsMraid>
	//    2    4:ireturn         
	}

	private final String BANNER_URL_CODE;
	private final String CLICK_URL_CODE;
	private final String IMPRESSION_TRACKING_ARRAY_CODE;
	private final String MARKUP;
	private final String TEXT_CODE;
	private int mBannerHeight;
	private String mBannerType;
	private String mBannerUrl;
	private int mBannerWidth;
	private MadvertiseView.MadvertiseViewCallbackListener mCallbackListener;
	private String mClickUrl;
	private Context mContext;
	private boolean mHasBanner;
	private byte mImageByteArray[];
	private JSONArray mImpressionTrackingArray;
	private boolean mIsMraid;
	private JSONArray mJsonNames;
	private JSONArray mJsonValues;
	private String mText;
	private String markup;
}

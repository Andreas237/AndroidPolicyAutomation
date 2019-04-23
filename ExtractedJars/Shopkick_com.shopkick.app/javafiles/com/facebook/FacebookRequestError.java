// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.internal.FacebookRequestErrorClassification;
import com.facebook.internal.FetchedAppSettings;
import com.facebook.internal.FetchedAppSettingsManager;
import com.facebook.internal.Utility;
import java.net.HttpURLConnection;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.facebook:
//			FacebookServiceException, FacebookException, FacebookSdk

public final class FacebookRequestError
	implements Parcelable
{
	public static final class Category extends Enum
	{

		public static Category valueOf(String s)
		{
			return (Category)Enum.valueOf(com/facebook/FacebookRequestError$Category, s);
		//    0    0:ldc1            #2   <Class FacebookRequestError$Category>
		//    1    2:aload_0         
		//    2    3:invokestatic    #39  <Method Enum Enum.valueOf(Class, String)>
		//    3    6:checkcast       #2   <Class FacebookRequestError$Category>
		//    4    9:areturn         
		}

		public static Category[] values()
		{
			return (Category[])((Category []) ($VALUES)).clone();
		//    0    0:getstatic       #31  <Field FacebookRequestError$Category[] $VALUES>
		//    1    3:invokevirtual   #46  <Method Object _5B_Lcom.facebook.FacebookRequestError$Category_3B_.clone()>
		//    2    6:checkcast       #42  <Class FacebookRequestError$Category[]>
		//    3    9:areturn         
		}

		private static final Category $VALUES[];
		public static final Category LOGIN_RECOVERABLE;
		public static final Category OTHER;
		public static final Category TRANSIENT;

		static 
		{
			LOGIN_RECOVERABLE = new Category("LOGIN_RECOVERABLE", 0);
		//    0    0:new             #2   <Class FacebookRequestError$Category>
		//    1    3:dup             
		//    2    4:ldc1            #17  <String "LOGIN_RECOVERABLE">
		//    3    6:iconst_0        
		//    4    7:invokespecial   #21  <Method void FacebookRequestError$Category(String, int)>
		//    5   10:putstatic       #23  <Field FacebookRequestError$Category LOGIN_RECOVERABLE>
			OTHER = new Category("OTHER", 1);
		//    6   13:new             #2   <Class FacebookRequestError$Category>
		//    7   16:dup             
		//    8   17:ldc1            #24  <String "OTHER">
		//    9   19:iconst_1        
		//   10   20:invokespecial   #21  <Method void FacebookRequestError$Category(String, int)>
		//   11   23:putstatic       #26  <Field FacebookRequestError$Category OTHER>
			TRANSIENT = new Category("TRANSIENT", 2);
		//   12   26:new             #2   <Class FacebookRequestError$Category>
		//   13   29:dup             
		//   14   30:ldc1            #27  <String "TRANSIENT">
		//   15   32:iconst_2        
		//   16   33:invokespecial   #21  <Method void FacebookRequestError$Category(String, int)>
		//   17   36:putstatic       #29  <Field FacebookRequestError$Category TRANSIENT>
			$VALUES = (new Category[] {
				LOGIN_RECOVERABLE, OTHER, TRANSIENT
			});
		//   18   39:iconst_3        
		//   19   40:anewarray       Category[]
		//   20   43:dup             
		//   21   44:iconst_0        
		//   22   45:getstatic       #23  <Field FacebookRequestError$Category LOGIN_RECOVERABLE>
		//   23   48:aastore         
		//   24   49:dup             
		//   25   50:iconst_1        
		//   26   51:getstatic       #26  <Field FacebookRequestError$Category OTHER>
		//   27   54:aastore         
		//   28   55:dup             
		//   29   56:iconst_2        
		//   30   57:getstatic       #29  <Field FacebookRequestError$Category TRANSIENT>
		//   31   60:aastore         
		//   32   61:putstatic       #31  <Field FacebookRequestError$Category[] $VALUES>
		//*  33   64:return          
		}

		private Category(String s, int i)
		{
			super(s, i);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #33  <Method void Enum(String, int)>
		//    4    6:return          
		}
	}

	private static class Range
	{

		boolean contains(int i)
		{
			return start <= i && i <= end;
		//    0    0:aload_0         
		//    1    1:getfield        #17  <Field int start>
		//    2    4:iload_1         
		//    3    5:icmpgt          18
		//    4    8:iload_1         
		//    5    9:aload_0         
		//    6   10:getfield        #19  <Field int end>
		//    7   13:icmpgt          18
		//    8   16:iconst_1        
		//    9   17:ireturn         
		//   10   18:iconst_0        
		//   11   19:ireturn         
		}

		private final int end;
		private final int start;

		private Range(int i, int j)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #15  <Method void Object()>
			start = i;
		//    2    4:aload_0         
		//    3    5:iload_1         
		//    4    6:putfield        #17  <Field int start>
			end = j;
		//    5    9:aload_0         
		//    6   10:iload_2         
		//    7   11:putfield        #19  <Field int end>
		//    8   14:return          
		}

	}


	private FacebookRequestError(int i, int j, int k, String s, String s1, String s2, String s3, 
			boolean flag, JSONObject jsonobject, JSONObject jsonobject1, Object obj, HttpURLConnection httpurlconnection, FacebookException facebookexception)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #95  <Method void Object()>
		requestStatusCode = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #97  <Field int requestStatusCode>
		errorCode = j;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #99  <Field int errorCode>
		subErrorCode = k;
	//    8   14:aload_0         
	//    9   15:iload_3         
	//   10   16:putfield        #101 <Field int subErrorCode>
		errorType = s;
	//   11   19:aload_0         
	//   12   20:aload           4
	//   13   22:putfield        #103 <Field String errorType>
		errorMessage = s1;
	//   14   25:aload_0         
	//   15   26:aload           5
	//   16   28:putfield        #105 <Field String errorMessage>
		requestResultBody = jsonobject;
	//   17   31:aload_0         
	//   18   32:aload           9
	//   19   34:putfield        #107 <Field JSONObject requestResultBody>
		requestResult = jsonobject1;
	//   20   37:aload_0         
	//   21   38:aload           10
	//   22   40:putfield        #109 <Field JSONObject requestResult>
		batchRequestResult = obj;
	//   23   43:aload_0         
	//   24   44:aload           11
	//   25   46:putfield        #111 <Field Object batchRequestResult>
		connection = httpurlconnection;
	//   26   49:aload_0         
	//   27   50:aload           12
	//   28   52:putfield        #113 <Field HttpURLConnection connection>
		errorUserTitle = s2;
	//   29   55:aload_0         
	//   30   56:aload           6
	//   31   58:putfield        #115 <Field String errorUserTitle>
		errorUserMessage = s3;
	//   32   61:aload_0         
	//   33   62:aload           7
	//   34   64:putfield        #117 <Field String errorUserMessage>
		if(facebookexception != null)
	//*  35   67:aload           13
	//*  36   69:ifnull          83
		{
			exception = facebookexception;
	//   37   72:aload_0         
	//   38   73:aload           13
	//   39   75:putfield        #119 <Field FacebookException exception>
			i = 1;
	//   40   78:iconst_1        
	//   41   79:istore_1        
		} else
	//*  42   80:goto            99
		{
			exception = ((FacebookException) (new FacebookServiceException(this, s1)));
	//   43   83:aload_0         
	//   44   84:new             #121 <Class FacebookServiceException>
	//   45   87:dup             
	//   46   88:aload_0         
	//   47   89:aload           5
	//   48   91:invokespecial   #124 <Method void FacebookServiceException(FacebookRequestError, String)>
	//   49   94:putfield        #119 <Field FacebookException exception>
			i = 0;
	//   50   97:iconst_0        
	//   51   98:istore_1        
		}
		s1 = ((String) (getErrorClassification()));
	//   52   99:invokestatic    #128 <Method FacebookRequestErrorClassification getErrorClassification()>
	//   53  102:astore          5
		if(i != 0)
	//*  54  104:iload_1         
	//*  55  105:ifeq            116
			s = ((String) (Category.OTHER));
	//   56  108:getstatic       #131 <Field FacebookRequestError$Category FacebookRequestError$Category.OTHER>
	//   57  111:astore          4
		else
	//*  58  113:goto            127
			s = ((String) (((FacebookRequestErrorClassification) (s1)).classify(j, k, flag)));
	//   59  116:aload           5
	//   60  118:iload_2         
	//   61  119:iload_3         
	//   62  120:iload           8
	//   63  122:invokevirtual   #137 <Method FacebookRequestError$Category FacebookRequestErrorClassification.classify(int, int, boolean)>
	//   64  125:astore          4
		category = ((Category) (s));
	//   65  127:aload_0         
	//   66  128:aload           4
	//   67  130:putfield        #139 <Field FacebookRequestError$Category category>
		errorRecoveryMessage = ((FacebookRequestErrorClassification) (s1)).getRecoveryMessage(category);
	//   68  133:aload_0         
	//   69  134:aload           5
	//   70  136:aload_0         
	//   71  137:getfield        #139 <Field FacebookRequestError$Category category>
	//   72  140:invokevirtual   #143 <Method String FacebookRequestErrorClassification.getRecoveryMessage(FacebookRequestError$Category)>
	//   73  143:putfield        #145 <Field String errorRecoveryMessage>
	//   74  146:return          
	}

	public FacebookRequestError(int i, String s, String s1)
	{
		this(-1, i, -1, s, s1, ((String) (null)), ((String) (null)), false, ((JSONObject) (null)), ((JSONObject) (null)), ((Object) (null)), ((HttpURLConnection) (null)), ((FacebookException) (null)));
	//    0    0:aload_0         
	//    1    1:iconst_m1       
	//    2    2:iload_1         
	//    3    3:iconst_m1       
	//    4    4:aload_2         
	//    5    5:aload_3         
	//    6    6:aconst_null     
	//    7    7:aconst_null     
	//    8    8:iconst_0        
	//    9    9:aconst_null     
	//   10   10:aconst_null     
	//   11   11:aconst_null     
	//   12   12:aconst_null     
	//   13   13:aconst_null     
	//   14   14:invokespecial   #148 <Method void FacebookRequestError(int, int, int, String, String, String, String, boolean, JSONObject, JSONObject, Object, HttpURLConnection, FacebookException)>
	//   15   17:return          
	}

	private FacebookRequestError(Parcel parcel)
	{
		this(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), false, ((JSONObject) (null)), ((JSONObject) (null)), ((Object) (null)), ((HttpURLConnection) (null)), ((FacebookException) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #155 <Method int Parcel.readInt()>
	//    3    5:aload_1         
	//    4    6:invokevirtual   #155 <Method int Parcel.readInt()>
	//    5    9:aload_1         
	//    6   10:invokevirtual   #155 <Method int Parcel.readInt()>
	//    7   13:aload_1         
	//    8   14:invokevirtual   #159 <Method String Parcel.readString()>
	//    9   17:aload_1         
	//   10   18:invokevirtual   #159 <Method String Parcel.readString()>
	//   11   21:aload_1         
	//   12   22:invokevirtual   #159 <Method String Parcel.readString()>
	//   13   25:aload_1         
	//   14   26:invokevirtual   #159 <Method String Parcel.readString()>
	//   15   29:iconst_0        
	//   16   30:aconst_null     
	//   17   31:aconst_null     
	//   18   32:aconst_null     
	//   19   33:aconst_null     
	//   20   34:aconst_null     
	//   21   35:invokespecial   #148 <Method void FacebookRequestError(int, int, int, String, String, String, String, boolean, JSONObject, JSONObject, Object, HttpURLConnection, FacebookException)>
	//   22   38:return          
	}


	FacebookRequestError(HttpURLConnection httpurlconnection, Exception exception1)
	{
		if(exception1 instanceof FacebookException)
	//*   0    0:aload_2         
	//*   1    1:instanceof      #165 <Class FacebookException>
	//*   2    4:ifeq            15
			exception1 = ((Exception) ((FacebookException)exception1));
	//    3    7:aload_2         
	//    4    8:checkcast       #165 <Class FacebookException>
	//    5   11:astore_2        
		else
	//*   6   12:goto            24
			exception1 = ((Exception) (new FacebookException(((Throwable) (exception1)))));
	//    7   15:new             #165 <Class FacebookException>
	//    8   18:dup             
	//    9   19:aload_2         
	//   10   20:invokespecial   #168 <Method void FacebookException(Throwable)>
	//   11   23:astore_2        
		this(-1, -1, -1, ((String) (null)), ((String) (null)), ((String) (null)), ((String) (null)), false, ((JSONObject) (null)), ((JSONObject) (null)), ((Object) (null)), httpurlconnection, ((FacebookException) (exception1)));
	//   12   24:aload_0         
	//   13   25:iconst_m1       
	//   14   26:iconst_m1       
	//   15   27:iconst_m1       
	//   16   28:aconst_null     
	//   17   29:aconst_null     
	//   18   30:aconst_null     
	//   19   31:aconst_null     
	//   20   32:iconst_0        
	//   21   33:aconst_null     
	//   22   34:aconst_null     
	//   23   35:aconst_null     
	//   24   36:aload_1         
	//   25   37:aload_2         
	//   26   38:invokespecial   #148 <Method void FacebookRequestError(int, int, int, String, String, String, String, boolean, JSONObject, JSONObject, Object, HttpURLConnection, FacebookException)>
	//   27   41:return          
	}

	static FacebookRequestError checkResponseAndCreateError(JSONObject jsonobject, Object obj, HttpURLConnection httpurlconnection)
	{
		if(!jsonobject.has("code")) goto _L2; else goto _L1
	//    0    0:aload_0         
	//    1    1:ldc1            #21  <String "code">
	//    2    3:invokevirtual   #178 <Method boolean JSONObject.has(String)>
	//    3    6:ifeq            329
_L1:
		int k;
		Object obj1;
		k = jsonobject.getInt("code");
	//    4    9:aload_0         
	//    5   10:ldc1            #21  <String "code">
	//    6   12:invokevirtual   #182 <Method int JSONObject.getInt(String)>
	//    7   15:istore          5
		obj1 = Utility.getStringPropertyAsJSON(jsonobject, "body", "FACEBOOK_NON_JSON_RESULT");
	//    8   17:aload_0         
	//    9   18:ldc1            #18  <String "body">
	//   10   20:ldc1            #184 <String "FACEBOOK_NON_JSON_RESULT">
	//   11   22:invokestatic    #190 <Method Object Utility.getStringPropertyAsJSON(JSONObject, String, String)>
	//   12   25:astore          8
		if(obj1 == null) goto _L4; else goto _L3
	//   13   27:aload           8
	//   14   29:ifnull          268
_L3:
		if(!(obj1 instanceof JSONObject)) goto _L4; else goto _L5
	//   15   32:aload           8
	//   16   34:instanceof      #174 <Class JSONObject>
	//   17   37:ifeq            268
_L5:
		boolean flag;
		JSONObject jsonobject1;
		jsonobject1 = (JSONObject)obj1;
	//   18   40:aload           8
	//   19   42:checkcast       #174 <Class JSONObject>
	//   20   45:astore          12
		flag = jsonobject1.has("error");
	//   21   47:aload           12
	//   22   49:ldc1            #34  <String "error">
	//   23   51:invokevirtual   #178 <Method boolean JSONObject.has(String)>
	//   24   54:istore          6
		int j;
		boolean flag1;
		flag1 = true;
	//   25   56:iconst_1        
	//   26   57:istore          7
		j = -1;
	//   27   59:iconst_m1       
	//   28   60:istore          4
		if(!flag) goto _L7; else goto _L6
	//   29   62:iload           6
	//   30   64:ifeq            152
_L6:
		int i;
		Object obj2;
		Object obj3;
		Object obj4;
		try
		{
			JSONObject jsonobject2 = (JSONObject)Utility.getStringPropertyAsJSON(jsonobject1, "error", ((String) (null)));
	//   31   67:aload           12
	//   32   69:ldc1            #34  <String "error">
	//   33   71:aconst_null     
	//   34   72:invokestatic    #190 <Method Object Utility.getStringPropertyAsJSON(JSONObject, String, String)>
	//   35   75:checkcast       #174 <Class JSONObject>
	//   36   78:astore          13
			obj1 = ((Object) (jsonobject2.optString("type", ((String) (null)))));
	//   37   80:aload           13
	//   38   82:ldc1            #49  <String "type">
	//   39   84:aconst_null     
	//   40   85:invokevirtual   #194 <Method String JSONObject.optString(String, String)>
	//   41   88:astore          8
			obj2 = ((Object) (jsonobject2.optString("message", ((String) (null)))));
	//   42   90:aload           13
	//   43   92:ldc1            #37  <String "message">
	//   44   94:aconst_null     
	//   45   95:invokevirtual   #194 <Method String JSONObject.optString(String, String)>
	//   46   98:astore          9
			j = jsonobject2.optInt("code", -1);
	//   47  100:aload           13
	//   48  102:ldc1            #21  <String "code">
	//   49  104:iconst_m1       
	//   50  105:invokevirtual   #198 <Method int JSONObject.optInt(String, int)>
	//   51  108:istore          4
			i = jsonobject2.optInt("error_subcode", -1);
	//   52  110:aload           13
	//   53  112:ldc1            #46  <String "error_subcode">
	//   54  114:iconst_m1       
	//   55  115:invokevirtual   #198 <Method int JSONObject.optInt(String, int)>
	//   56  118:istore_3        
			obj3 = ((Object) (jsonobject2.optString("error_user_msg", ((String) (null)))));
	//   57  119:aload           13
	//   58  121:ldc1            #52  <String "error_user_msg">
	//   59  123:aconst_null     
	//   60  124:invokevirtual   #194 <Method String JSONObject.optString(String, String)>
	//   61  127:astore          10
			obj4 = ((Object) (jsonobject2.optString("error_user_title", ((String) (null)))));
	//   62  129:aload           13
	//   63  131:ldc1            #55  <String "error_user_title">
	//   64  133:aconst_null     
	//   65  134:invokevirtual   #194 <Method String JSONObject.optString(String, String)>
	//   66  137:astore          11
			flag = jsonobject2.optBoolean("is_transient", false);
	//   67  139:aload           13
	//   68  141:ldc1            #31  <String "is_transient">
	//   69  143:iconst_0        
	//   70  144:invokevirtual   #202 <Method boolean JSONObject.optBoolean(String, boolean)>
	//   71  147:istore          6
		}
	//*  72  149:goto            234
	//*  73  152:aload           12
	//*  74  154:ldc1            #28  <String "error_code">
	//*  75  156:invokevirtual   #178 <Method boolean JSONObject.has(String)>
	//*  76  159:ifne            185
	//*  77  162:aload           12
	//*  78  164:ldc1            #40  <String "error_msg">
	//*  79  166:invokevirtual   #178 <Method boolean JSONObject.has(String)>
	//*  80  169:ifne            185
	//*  81  172:aload           12
	//*  82  174:ldc1            #43  <String "error_reason">
	//*  83  176:invokevirtual   #178 <Method boolean JSONObject.has(String)>
	//*  84  179:ifeq            334
	//*  85  182:goto            185
	//*  86  185:aload           12
	//*  87  187:ldc1            #43  <String "error_reason">
	//*  88  189:aconst_null     
	//*  89  190:invokevirtual   #194 <Method String JSONObject.optString(String, String)>
	//*  90  193:astore          8
	//*  91  195:aload           12
	//*  92  197:ldc1            #40  <String "error_msg">
	//*  93  199:aconst_null     
	//*  94  200:invokevirtual   #194 <Method String JSONObject.optString(String, String)>
	//*  95  203:astore          9
	//*  96  205:aload           12
	//*  97  207:ldc1            #28  <String "error_code">
	//*  98  209:iconst_m1       
	//*  99  210:invokevirtual   #198 <Method int JSONObject.optInt(String, int)>
	//* 100  213:istore          4
	//* 101  215:aload           12
	//* 102  217:ldc1            #46  <String "error_subcode">
	//* 103  219:iconst_m1       
	//* 104  220:invokevirtual   #198 <Method int JSONObject.optInt(String, int)>
	//* 105  223:istore_3        
	//* 106  224:iconst_0        
	//* 107  225:istore          6
	//* 108  227:aconst_null     
	//* 109  228:astore          10
	//* 110  230:aload           10
	//* 111  232:astore          11
	//* 112  234:iload           7
	//* 113  236:ifeq            268
	//* 114  239:new             #2   <Class FacebookRequestError>
	//* 115  242:dup             
	//* 116  243:iload           5
	//* 117  245:iload           4
	//* 118  247:iload_3         
	//* 119  248:aload           8
	//* 120  250:aload           9
	//* 121  252:aload           11
	//* 122  254:aload           10
	//* 123  256:iload           6
	//* 124  258:aload           12
	//* 125  260:aload_0         
	//* 126  261:aload_1         
	//* 127  262:aload_2         
	//* 128  263:aconst_null     
	//* 129  264:invokespecial   #148 <Method void FacebookRequestError(int, int, int, String, String, String, String, boolean, JSONObject, JSONObject, Object, HttpURLConnection, FacebookException)>
	//* 130  267:areturn         
	//* 131  268:getstatic       #88  <Field FacebookRequestError$Range HTTP_RANGE_SUCCESS>
	//* 132  271:iload           5
	//* 133  273:invokevirtual   #206 <Method boolean FacebookRequestError$Range.contains(int)>
	//* 134  276:ifne            329
	//* 135  279:aload_0         
	//* 136  280:ldc1            #18  <String "body">
	//* 137  282:invokevirtual   #178 <Method boolean JSONObject.has(String)>
	//* 138  285:ifeq            361
	//* 139  288:aload_0         
	//* 140  289:ldc1            #18  <String "body">
	//* 141  291:ldc1            #184 <String "FACEBOOK_NON_JSON_RESULT">
	//* 142  293:invokestatic    #190 <Method Object Utility.getStringPropertyAsJSON(JSONObject, String, String)>
	//* 143  296:checkcast       #174 <Class JSONObject>
	//* 144  299:astore          8
	//* 145  301:goto            304
	//* 146  304:new             #2   <Class FacebookRequestError>
	//* 147  307:dup             
	//* 148  308:iload           5
	//* 149  310:iconst_m1       
	//* 150  311:iconst_m1       
	//* 151  312:aconst_null     
	//* 152  313:aconst_null     
	//* 153  314:aconst_null     
	//* 154  315:aconst_null     
	//* 155  316:iconst_0        
	//* 156  317:aload           8
	//* 157  319:aload_0         
	//* 158  320:aload_1         
	//* 159  321:aload_2         
	//* 160  322:aconst_null     
	//* 161  323:invokespecial   #148 <Method void FacebookRequestError(int, int, int, String, String, String, String, boolean, JSONObject, JSONObject, Object, HttpURLConnection, FacebookException)>
	//* 162  326:astore_0        
	//* 163  327:aload_0         
	//* 164  328:areturn         
	//* 165  329:aconst_null     
	//* 166  330:areturn         
		// Misplaced declaration of an exception variable
		catch(JSONObject jsonobject)
	//* 167  331:astore_0        
		{
			return null;
	//  168  332:aconst_null     
	//  169  333:areturn         
		}
		  goto _L8
_L7:
		if(!jsonobject1.has("error_code") && !jsonobject1.has("error_msg") && !jsonobject1.has("error_reason")) goto _L10; else goto _L9
_L9:
		obj1 = ((Object) (jsonobject1.optString("error_reason", ((String) (null)))));
		obj2 = ((Object) (jsonobject1.optString("error_msg", ((String) (null)))));
		j = jsonobject1.optInt("error_code", -1);
		i = jsonobject1.optInt("error_subcode", -1);
		flag = false;
		obj3 = null;
		obj4 = obj3;
_L8:
		if(!flag1) goto _L4; else goto _L11
_L11:
		return new FacebookRequestError(k, j, i, ((String) (obj1)), ((String) (obj2)), ((String) (obj4)), ((String) (obj3)), flag, jsonobject1, jsonobject, obj, httpurlconnection, ((FacebookException) (null)));
_L4:
		if(HTTP_RANGE_SUCCESS.contains(k)) goto _L2; else goto _L12
_L12:
		if(!jsonobject.has("body"))
			break MISSING_BLOCK_LABEL_361;
		obj1 = ((Object) ((JSONObject)Utility.getStringPropertyAsJSON(jsonobject, "body", "FACEBOOK_NON_JSON_RESULT")));
_L13:
		jsonobject = ((JSONObject) (new FacebookRequestError(k, -1, -1, ((String) (null)), ((String) (null)), ((String) (null)), ((String) (null)), false, ((JSONObject) (obj1)), jsonobject, obj, httpurlconnection, ((FacebookException) (null)))));
		return ((FacebookRequestError) (jsonobject));
_L2:
		return null;
_L10:
		flag1 = false;
	//  170  334:iconst_0        
	//  171  335:istore          7
		flag = flag1;
	//  172  337:iload           7
	//  173  339:istore          6
		i = -1;
	//  174  341:iconst_m1       
	//  175  342:istore_3        
		obj1 = null;
	//  176  343:aconst_null     
	//  177  344:astore          8
		obj2 = obj1;
	//  178  346:aload           8
	//  179  348:astore          9
		obj3 = obj2;
	//  180  350:aload           9
	//  181  352:astore          10
		obj4 = obj3;
	//  182  354:aload           10
	//  183  356:astore          11
		  goto _L8
	//* 184  358:goto            234
		obj1 = null;
	//  185  361:aconst_null     
	//  186  362:astore          8
		  goto _L13
	//* 187  364:goto            304
	}

	static FacebookRequestErrorClassification getErrorClassification()
	{
		com/facebook/FacebookRequestError;
	//    0    0:ldc1            #2   <Class FacebookRequestError>
		JVM INSTR monitorenter ;
	//    1    2:monitorenter    
		Object obj = ((Object) (FetchedAppSettingsManager.getAppSettingsWithoutQuery(FacebookSdk.getApplicationId())));
	//    2    3:invokestatic    #211 <Method String FacebookSdk.getApplicationId()>
	//    3    6:invokestatic    #217 <Method FetchedAppSettings FetchedAppSettingsManager.getAppSettingsWithoutQuery(String)>
	//    4    9:astore_0        
		if(obj != null)
			break MISSING_BLOCK_LABEL_23;
	//    5   10:aload_0         
	//    6   11:ifnonnull       23
		obj = ((Object) (FacebookRequestErrorClassification.getDefaultErrorClassification()));
	//    7   14:invokestatic    #220 <Method FacebookRequestErrorClassification FacebookRequestErrorClassification.getDefaultErrorClassification()>
	//    8   17:astore_0        
		com/facebook/FacebookRequestError;
	//    9   18:ldc1            #2   <Class FacebookRequestError>
		JVM INSTR monitorexit ;
	//   10   20:monitorexit     
		return ((FacebookRequestErrorClassification) (obj));
	//   11   21:aload_0         
	//   12   22:areturn         
		obj = ((Object) (((FetchedAppSettings) (obj)).getErrorClassification()));
	//   13   23:aload_0         
	//   14   24:invokevirtual   #223 <Method FacebookRequestErrorClassification FetchedAppSettings.getErrorClassification()>
	//   15   27:astore_0        
		com/facebook/FacebookRequestError;
	//   16   28:ldc1            #2   <Class FacebookRequestError>
		JVM INSTR monitorexit ;
	//   17   30:monitorexit     
		return ((FacebookRequestErrorClassification) (obj));
	//   18   31:aload_0         
	//   19   32:areturn         
		Exception exception1;
		exception1;
	//   20   33:astore_0        
	//*  21   34:ldc1            #2   <Class FacebookRequestError>
		throw exception1;
	//   22   36:monitorexit     
	//   23   37:aload_0         
	//   24   38:athrow          
	}

	public int describeContents()
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public Object getBatchRequestResult()
	{
		return batchRequestResult;
	//    0    0:aload_0         
	//    1    1:getfield        #111 <Field Object batchRequestResult>
	//    2    4:areturn         
	}

	public Category getCategory()
	{
		return category;
	//    0    0:aload_0         
	//    1    1:getfield        #139 <Field FacebookRequestError$Category category>
	//    2    4:areturn         
	}

	public HttpURLConnection getConnection()
	{
		return connection;
	//    0    0:aload_0         
	//    1    1:getfield        #113 <Field HttpURLConnection connection>
	//    2    4:areturn         
	}

	public int getErrorCode()
	{
		return errorCode;
	//    0    0:aload_0         
	//    1    1:getfield        #99  <Field int errorCode>
	//    2    4:ireturn         
	}

	public String getErrorMessage()
	{
		String s = errorMessage;
	//    0    0:aload_0         
	//    1    1:getfield        #105 <Field String errorMessage>
	//    2    4:astore_1        
		if(s != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          11
			return s;
	//    5    9:aload_1         
	//    6   10:areturn         
		else
			return exception.getLocalizedMessage();
	//    7   11:aload_0         
	//    8   12:getfield        #119 <Field FacebookException exception>
	//    9   15:invokevirtual   #235 <Method String FacebookException.getLocalizedMessage()>
	//   10   18:areturn         
	}

	public String getErrorRecoveryMessage()
	{
		return errorRecoveryMessage;
	//    0    0:aload_0         
	//    1    1:getfield        #145 <Field String errorRecoveryMessage>
	//    2    4:areturn         
	}

	public String getErrorType()
	{
		return errorType;
	//    0    0:aload_0         
	//    1    1:getfield        #103 <Field String errorType>
	//    2    4:areturn         
	}

	public String getErrorUserMessage()
	{
		return errorUserMessage;
	//    0    0:aload_0         
	//    1    1:getfield        #117 <Field String errorUserMessage>
	//    2    4:areturn         
	}

	public String getErrorUserTitle()
	{
		return errorUserTitle;
	//    0    0:aload_0         
	//    1    1:getfield        #115 <Field String errorUserTitle>
	//    2    4:areturn         
	}

	public FacebookException getException()
	{
		return exception;
	//    0    0:aload_0         
	//    1    1:getfield        #119 <Field FacebookException exception>
	//    2    4:areturn         
	}

	public JSONObject getRequestResult()
	{
		return requestResult;
	//    0    0:aload_0         
	//    1    1:getfield        #109 <Field JSONObject requestResult>
	//    2    4:areturn         
	}

	public JSONObject getRequestResultBody()
	{
		return requestResultBody;
	//    0    0:aload_0         
	//    1    1:getfield        #107 <Field JSONObject requestResultBody>
	//    2    4:areturn         
	}

	public int getRequestStatusCode()
	{
		return requestStatusCode;
	//    0    0:aload_0         
	//    1    1:getfield        #97  <Field int requestStatusCode>
	//    2    4:ireturn         
	}

	public int getSubErrorCode()
	{
		return subErrorCode;
	//    0    0:aload_0         
	//    1    1:getfield        #101 <Field int subErrorCode>
	//    2    4:ireturn         
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder("{HttpStatus: ");
	//    0    0:new             #249 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:ldc1            #251 <String "{HttpStatus: ">
	//    3    6:invokespecial   #254 <Method void StringBuilder(String)>
	//    4    9:astore_1        
		stringbuilder.append(requestStatusCode);
	//    5   10:aload_1         
	//    6   11:aload_0         
	//    7   12:getfield        #97  <Field int requestStatusCode>
	//    8   15:invokevirtual   #258 <Method StringBuilder StringBuilder.append(int)>
	//    9   18:pop             
		stringbuilder.append(", errorCode: ");
	//   10   19:aload_1         
	//   11   20:ldc2            #260 <String ", errorCode: ">
	//   12   23:invokevirtual   #263 <Method StringBuilder StringBuilder.append(String)>
	//   13   26:pop             
		stringbuilder.append(errorCode);
	//   14   27:aload_1         
	//   15   28:aload_0         
	//   16   29:getfield        #99  <Field int errorCode>
	//   17   32:invokevirtual   #258 <Method StringBuilder StringBuilder.append(int)>
	//   18   35:pop             
		stringbuilder.append(", subErrorCode: ");
	//   19   36:aload_1         
	//   20   37:ldc2            #265 <String ", subErrorCode: ">
	//   21   40:invokevirtual   #263 <Method StringBuilder StringBuilder.append(String)>
	//   22   43:pop             
		stringbuilder.append(subErrorCode);
	//   23   44:aload_1         
	//   24   45:aload_0         
	//   25   46:getfield        #101 <Field int subErrorCode>
	//   26   49:invokevirtual   #258 <Method StringBuilder StringBuilder.append(int)>
	//   27   52:pop             
		stringbuilder.append(", errorType: ");
	//   28   53:aload_1         
	//   29   54:ldc2            #267 <String ", errorType: ">
	//   30   57:invokevirtual   #263 <Method StringBuilder StringBuilder.append(String)>
	//   31   60:pop             
		stringbuilder.append(errorType);
	//   32   61:aload_1         
	//   33   62:aload_0         
	//   34   63:getfield        #103 <Field String errorType>
	//   35   66:invokevirtual   #263 <Method StringBuilder StringBuilder.append(String)>
	//   36   69:pop             
		stringbuilder.append(", errorMessage: ");
	//   37   70:aload_1         
	//   38   71:ldc2            #269 <String ", errorMessage: ">
	//   39   74:invokevirtual   #263 <Method StringBuilder StringBuilder.append(String)>
	//   40   77:pop             
		stringbuilder.append(getErrorMessage());
	//   41   78:aload_1         
	//   42   79:aload_0         
	//   43   80:invokevirtual   #271 <Method String getErrorMessage()>
	//   44   83:invokevirtual   #263 <Method StringBuilder StringBuilder.append(String)>
	//   45   86:pop             
		stringbuilder.append("}");
	//   46   87:aload_1         
	//   47   88:ldc2            #273 <String "}">
	//   48   91:invokevirtual   #263 <Method StringBuilder StringBuilder.append(String)>
	//   49   94:pop             
		return stringbuilder.toString();
	//   50   95:aload_1         
	//   51   96:invokevirtual   #275 <Method String StringBuilder.toString()>
	//   52   99:areturn         
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		parcel.writeInt(requestStatusCode);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #97  <Field int requestStatusCode>
	//    3    5:invokevirtual   #281 <Method void Parcel.writeInt(int)>
		parcel.writeInt(errorCode);
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:getfield        #99  <Field int errorCode>
	//    7   13:invokevirtual   #281 <Method void Parcel.writeInt(int)>
		parcel.writeInt(subErrorCode);
	//    8   16:aload_1         
	//    9   17:aload_0         
	//   10   18:getfield        #101 <Field int subErrorCode>
	//   11   21:invokevirtual   #281 <Method void Parcel.writeInt(int)>
		parcel.writeString(errorType);
	//   12   24:aload_1         
	//   13   25:aload_0         
	//   14   26:getfield        #103 <Field String errorType>
	//   15   29:invokevirtual   #284 <Method void Parcel.writeString(String)>
		parcel.writeString(errorMessage);
	//   16   32:aload_1         
	//   17   33:aload_0         
	//   18   34:getfield        #105 <Field String errorMessage>
	//   19   37:invokevirtual   #284 <Method void Parcel.writeString(String)>
		parcel.writeString(errorUserTitle);
	//   20   40:aload_1         
	//   21   41:aload_0         
	//   22   42:getfield        #115 <Field String errorUserTitle>
	//   23   45:invokevirtual   #284 <Method void Parcel.writeString(String)>
		parcel.writeString(errorUserMessage);
	//   24   48:aload_1         
	//   25   49:aload_0         
	//   26   50:getfield        #117 <Field String errorUserMessage>
	//   27   53:invokevirtual   #284 <Method void Parcel.writeString(String)>
	//   28   56:return          
	}

	private static final String BODY_KEY = "body";
	private static final String CODE_KEY = "code";
	public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

		public FacebookRequestError createFromParcel(Parcel parcel)
		{
			return new FacebookRequestError(parcel);
		//    0    0:new             #9   <Class FacebookRequestError>
		//    1    3:dup             
		//    2    4:aload_1         
		//    3    5:aconst_null     
		//    4    6:invokespecial   #19  <Method void FacebookRequestError(Parcel, FacebookRequestError$1)>
		//    5    9:areturn         
		}

		public volatile Object createFromParcel(Parcel parcel)
		{
			return ((Object) (createFromParcel(parcel)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #22  <Method FacebookRequestError createFromParcel(Parcel)>
		//    3    5:areturn         
		}

		public FacebookRequestError[] newArray(int i)
		{
			return new FacebookRequestError[i];
		//    0    0:iload_1         
		//    1    1:anewarray       FacebookRequestError[]
		//    2    4:areturn         
		}

		public volatile Object[] newArray(int i)
		{
			return ((Object []) (newArray(i)));
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:invokevirtual   #27  <Method FacebookRequestError[] newArray(int)>
		//    3    5:areturn         
		}

	}
;
	private static final String ERROR_CODE_FIELD_KEY = "code";
	private static final String ERROR_CODE_KEY = "error_code";
	private static final String ERROR_IS_TRANSIENT_KEY = "is_transient";
	private static final String ERROR_KEY = "error";
	private static final String ERROR_MESSAGE_FIELD_KEY = "message";
	private static final String ERROR_MSG_KEY = "error_msg";
	private static final String ERROR_REASON_KEY = "error_reason";
	private static final String ERROR_SUB_CODE_KEY = "error_subcode";
	private static final String ERROR_TYPE_FIELD_KEY = "type";
	private static final String ERROR_USER_MSG_KEY = "error_user_msg";
	private static final String ERROR_USER_TITLE_KEY = "error_user_title";
	static final Range HTTP_RANGE_SUCCESS = new Range(200, 299);
	public static final int INVALID_ERROR_CODE = -1;
	public static final int INVALID_HTTP_STATUS_CODE = -1;
	private final Object batchRequestResult;
	private final Category category;
	private final HttpURLConnection connection;
	private final int errorCode;
	private final String errorMessage;
	private final String errorRecoveryMessage;
	private final String errorType;
	private final String errorUserMessage;
	private final String errorUserTitle;
	private final FacebookException exception;
	private final JSONObject requestResult;
	private final JSONObject requestResultBody;
	private final int requestStatusCode;
	private final int subErrorCode;

	static 
	{
	//    0    0:new             #13  <Class FacebookRequestError$Range>
	//    1    3:dup             
	//    2    4:sipush          200
	//    3    7:sipush          299
	//    4   10:aconst_null     
	//    5   11:invokespecial   #86  <Method void FacebookRequestError$Range(int, int, FacebookRequestError$1)>
	//    6   14:putstatic       #88  <Field FacebookRequestError$Range HTTP_RANGE_SUCCESS>
	//    7   17:new             #8   <Class FacebookRequestError$1>
	//    8   20:dup             
	//    9   21:invokespecial   #90  <Method void FacebookRequestError$1()>
	//   10   24:putstatic       #92  <Field android.os.Parcelable$Creator CREATOR>
	//*  11   27:return          
	}
}

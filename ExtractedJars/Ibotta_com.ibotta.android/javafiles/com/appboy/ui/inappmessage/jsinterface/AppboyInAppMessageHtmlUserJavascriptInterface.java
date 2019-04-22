// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appboy.ui.inappmessage.jsinterface;

import android.content.Context;
import com.appboy.Appboy;
import com.appboy.AppboyUser;
import com.appboy.enums.*;
import com.appboy.support.AppboyLogger;
import com.newrelic.agent.android.instrumentation.JSONArrayInstrumentation;
import com.newrelic.agent.android.instrumentation.JSONObjectInstrumentation;
import java.util.*;
import org.json.JSONArray;
import org.json.JSONObject;

public class AppboyInAppMessageHtmlUserJavascriptInterface
{

	public AppboyInAppMessageHtmlUserJavascriptInterface(Context context)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #79  <Method void Object()>
		mContext = context;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #81  <Field Context mContext>
	//    5    9:return          
	}

	public void addToCustomAttributeArray(String s, String s1)
	{
		Appboy.getInstance(mContext).getCurrentUser().addToCustomAttributeArray(s, s1);
	//    0    0:aload_0         
	//    1    1:getfield        #81  <Field Context mContext>
	//    2    4:invokestatic    #90  <Method Appboy Appboy.getInstance(Context)>
	//    3    7:invokevirtual   #94  <Method AppboyUser Appboy.getCurrentUser()>
	//    4   10:aload_1         
	//    5   11:aload_2         
	//    6   12:invokevirtual   #99  <Method boolean AppboyUser.addToCustomAttributeArray(String, String)>
	//    7   15:pop             
	//    8   16:return          
	}

	public void incrementCustomUserAttribute(String s)
	{
		Appboy.getInstance(mContext).getCurrentUser().incrementCustomUserAttribute(s);
	//    0    0:aload_0         
	//    1    1:getfield        #81  <Field Context mContext>
	//    2    4:invokestatic    #90  <Method Appboy Appboy.getInstance(Context)>
	//    3    7:invokevirtual   #94  <Method AppboyUser Appboy.getCurrentUser()>
	//    4   10:aload_1         
	//    5   11:invokevirtual   #105 <Method boolean AppboyUser.incrementCustomUserAttribute(String)>
	//    6   14:pop             
	//    7   15:return          
	}

	Month monthFromInt(int i)
	{
		if(i >= 1 && i <= 12)
	//*   0    0:iload_1         
	//*   1    1:iconst_1        
	//*   2    2:icmplt          21
	//*   3    5:iload_1         
	//*   4    6:bipush          12
	//*   5    8:icmple          14
	//*   6   11:goto            21
			return Month.getMonth(i - 1);
	//    7   14:iload_1         
	//    8   15:iconst_1        
	//    9   16:isub            
	//   10   17:invokestatic    #113 <Method Month Month.getMonth(int)>
	//   11   20:areturn         
		else
			return null;
	//   12   21:aconst_null     
	//   13   22:areturn         
	}

	Gender parseGender(String s)
	{
		if(s == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       6
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		s = s.toLowerCase(Locale.US);
	//    4    6:aload_1         
	//    5    7:getstatic       #122 <Field Locale Locale.US>
	//    6   10:invokevirtual   #128 <Method String String.toLowerCase(Locale)>
	//    7   13:astore_1        
		if(s.equals(((Object) (JS_BRIDGE_GENDER_MALE))))
	//*   8   14:aload_1         
	//*   9   15:getstatic       #49  <Field String JS_BRIDGE_GENDER_MALE>
	//*  10   18:invokevirtual   #132 <Method boolean String.equals(Object)>
	//*  11   21:ifeq            28
			return Gender.MALE;
	//   12   24:getstatic       #43  <Field Gender Gender.MALE>
	//   13   27:areturn         
		if(s.equals(((Object) (JS_BRIDGE_GENDER_FEMALE))))
	//*  14   28:aload_1         
	//*  15   29:getstatic       #54  <Field String JS_BRIDGE_GENDER_FEMALE>
	//*  16   32:invokevirtual   #132 <Method boolean String.equals(Object)>
	//*  17   35:ifeq            42
			return Gender.FEMALE;
	//   18   38:getstatic       #52  <Field Gender Gender.FEMALE>
	//   19   41:areturn         
		if(s.equals(((Object) (JS_BRIDGE_GENDER_OTHER))))
	//*  20   42:aload_1         
	//*  21   43:getstatic       #59  <Field String JS_BRIDGE_GENDER_OTHER>
	//*  22   46:invokevirtual   #132 <Method boolean String.equals(Object)>
	//*  23   49:ifeq            56
			return Gender.OTHER;
	//   24   52:getstatic       #57  <Field Gender Gender.OTHER>
	//   25   55:areturn         
		if(s.equals(((Object) (JS_BRIDGE_GENDER_UNKNOWN))))
	//*  26   56:aload_1         
	//*  27   57:getstatic       #64  <Field String JS_BRIDGE_GENDER_UNKNOWN>
	//*  28   60:invokevirtual   #132 <Method boolean String.equals(Object)>
	//*  29   63:ifeq            70
			return Gender.UNKNOWN;
	//   30   66:getstatic       #62  <Field Gender Gender.UNKNOWN>
	//   31   69:areturn         
		if(s.equals(((Object) (JS_BRIDGE_GENDER_NOT_APPLICABLE))))
	//*  32   70:aload_1         
	//*  33   71:getstatic       #69  <Field String JS_BRIDGE_GENDER_NOT_APPLICABLE>
	//*  34   74:invokevirtual   #132 <Method boolean String.equals(Object)>
	//*  35   77:ifeq            84
			return Gender.NOT_APPLICABLE;
	//   36   80:getstatic       #67  <Field Gender Gender.NOT_APPLICABLE>
	//   37   83:areturn         
		if(s.equals(((Object) (JS_BRIDGE_GENDER_PREFER_NOT_TO_SAY))))
	//*  38   84:aload_1         
	//*  39   85:getstatic       #74  <Field String JS_BRIDGE_GENDER_PREFER_NOT_TO_SAY>
	//*  40   88:invokevirtual   #132 <Method boolean String.equals(Object)>
	//*  41   91:ifeq            98
			return Gender.PREFER_NOT_TO_SAY;
	//   42   94:getstatic       #72  <Field Gender Gender.PREFER_NOT_TO_SAY>
	//   43   97:areturn         
		else
			return null;
	//   44   98:aconst_null     
	//   45   99:areturn         
	}

	String[] parseStringArrayFromJsonString(String s)
	{
		int i;
		ArrayList arraylist;
		try
		{
			s = ((String) (JSONArrayInstrumentation.init(s)));
	//    0    0:aload_1         
	//    1    1:invokestatic    #142 <Method JSONArray JSONArrayInstrumentation.init(String)>
	//    2    4:astore_1        
			arraylist = new ArrayList();
	//    3    5:new             #144 <Class ArrayList>
	//    4    8:dup             
	//    5    9:invokespecial   #145 <Method void ArrayList()>
	//    6   12:astore_3        
		}
	//*   7   13:iconst_0        
	//*   8   14:istore_2        
	//*   9   15:iload_2         
	//*  10   16:aload_1         
	//*  11   17:invokevirtual   #151 <Method int JSONArray.length()>
	//*  12   20:icmpge          42
	//*  13   23:aload_3         
	//*  14   24:aload_1         
	//*  15   25:iload_2         
	//*  16   26:invokevirtual   #155 <Method String JSONArray.getString(int)>
	//*  17   29:invokeinterface #160 <Method boolean List.add(Object)>
	//*  18   34:pop             
	//*  19   35:iload_2         
	//*  20   36:iconst_1        
	//*  21   37:iadd            
	//*  22   38:istore_2        
	//*  23   39:goto            15
	//*  24   42:aload_3         
	//*  25   43:iconst_0        
	//*  26   44:anewarray       String[]
	//*  27   47:invokeinterface #164 <Method Object[] List.toArray(Object[])>
	//*  28   52:checkcast       #166 <Class String[]>
	//*  29   55:astore_1        
	//*  30   56:aload_1         
	//*  31   57:areturn         
		// Misplaced declaration of an exception variable
		catch(String s)
	//*  32   58:astore_1        
		{
			AppboyLogger.e(TAG, "Failed to parse custom attribute array", ((Throwable) (s)));
	//   33   59:getstatic       #37  <Field String TAG>
	//   34   62:ldc1            #168 <String "Failed to parse custom attribute array">
	//   35   64:aload_1         
	//   36   65:invokestatic    #172 <Method int AppboyLogger.e(String, String, Throwable)>
	//   37   68:pop             
			return null;
	//   38   69:aconst_null     
	//   39   70:areturn         
		}
		i = 0;
		if(i >= ((JSONArray) (s)).length())
			break; /* Loop/switch isn't completed */
		((List) (arraylist)).add(((Object) (((JSONArray) (s)).getString(i))));
		i++;
		if(true) goto _L2; else goto _L1
_L2:
		break MISSING_BLOCK_LABEL_15;
_L1:
		s = ((String) ((String[])((List) (arraylist)).toArray(((Object []) (new String[0])))));
		return ((String []) (s));
	}

	public void removeFromCustomAttributeArray(String s, String s1)
	{
		Appboy.getInstance(mContext).getCurrentUser().removeFromCustomAttributeArray(s, s1);
	//    0    0:aload_0         
	//    1    1:getfield        #81  <Field Context mContext>
	//    2    4:invokestatic    #90  <Method Appboy Appboy.getInstance(Context)>
	//    3    7:invokevirtual   #94  <Method AppboyUser Appboy.getCurrentUser()>
	//    4   10:aload_1         
	//    5   11:aload_2         
	//    6   12:invokevirtual   #175 <Method boolean AppboyUser.removeFromCustomAttributeArray(String, String)>
	//    7   15:pop             
	//    8   16:return          
	}

	public void setCountry(String s)
	{
		Appboy.getInstance(mContext).getCurrentUser().setCountry(s);
	//    0    0:aload_0         
	//    1    1:getfield        #81  <Field Context mContext>
	//    2    4:invokestatic    #90  <Method Appboy Appboy.getInstance(Context)>
	//    3    7:invokevirtual   #94  <Method AppboyUser Appboy.getCurrentUser()>
	//    4   10:aload_1         
	//    5   11:invokevirtual   #178 <Method boolean AppboyUser.setCountry(String)>
	//    6   14:pop             
	//    7   15:return          
	}

	void setCustomAttribute(AppboyUser appboyuser, String s, String s1)
	{
		s1 = ((String) (JSONObjectInstrumentation.init(s1).get("value")));
	//    0    0:aload_3         
	//    1    1:invokestatic    #185 <Method JSONObject JSONObjectInstrumentation.init(String)>
	//    2    4:ldc1            #9   <String "value">
	//    3    6:invokevirtual   #191 <Method Object JSONObject.get(String)>
	//    4    9:astore_3        
		if(s1 instanceof String)
	//*   5   10:aload_3         
	//*   6   11:instanceof      #124 <Class String>
	//*   7   14:ifeq            28
		{
			appboyuser.setCustomUserAttribute(s, (String)s1);
	//    8   17:aload_1         
	//    9   18:aload_2         
	//   10   19:aload_3         
	//   11   20:checkcast       #124 <Class String>
	//   12   23:invokevirtual   #194 <Method boolean AppboyUser.setCustomUserAttribute(String, String)>
	//   13   26:pop             
			return;
	//   14   27:return          
		}
		if(s1 instanceof Boolean)
	//*  15   28:aload_3         
	//*  16   29:instanceof      #196 <Class Boolean>
	//*  17   32:ifeq            49
		{
			appboyuser.setCustomUserAttribute(s, ((Boolean)s1).booleanValue());
	//   18   35:aload_1         
	//   19   36:aload_2         
	//   20   37:aload_3         
	//   21   38:checkcast       #196 <Class Boolean>
	//   22   41:invokevirtual   #200 <Method boolean Boolean.booleanValue()>
	//   23   44:invokevirtual   #203 <Method boolean AppboyUser.setCustomUserAttribute(String, boolean)>
	//   24   47:pop             
			return;
	//   25   48:return          
		}
		if(s1 instanceof Integer)
	//*  26   49:aload_3         
	//*  27   50:instanceof      #205 <Class Integer>
	//*  28   53:ifeq            70
		{
			appboyuser.setCustomUserAttribute(s, ((Integer)s1).intValue());
	//   29   56:aload_1         
	//   30   57:aload_2         
	//   31   58:aload_3         
	//   32   59:checkcast       #205 <Class Integer>
	//   33   62:invokevirtual   #208 <Method int Integer.intValue()>
	//   34   65:invokevirtual   #211 <Method boolean AppboyUser.setCustomUserAttribute(String, int)>
	//   35   68:pop             
			return;
	//   36   69:return          
		}
		if(s1 instanceof Double)
	//*  37   70:aload_3         
	//*  38   71:instanceof      #213 <Class Double>
	//*  39   74:ifeq            91
		{
			appboyuser.setCustomUserAttribute(s, ((Double)s1).floatValue());
	//   40   77:aload_1         
	//   41   78:aload_2         
	//   42   79:aload_3         
	//   43   80:checkcast       #213 <Class Double>
	//   44   83:invokevirtual   #217 <Method float Double.floatValue()>
	//   45   86:invokevirtual   #220 <Method boolean AppboyUser.setCustomUserAttribute(String, float)>
	//   46   89:pop             
			return;
	//   47   90:return          
		}
		try
		{
			appboyuser = ((AppboyUser) (TAG));
	//   48   91:getstatic       #37  <Field String TAG>
	//   49   94:astore_1        
			s1 = ((String) (new StringBuilder()));
	//   50   95:new             #222 <Class StringBuilder>
	//   51   98:dup             
	//   52   99:invokespecial   #223 <Method void StringBuilder()>
	//   53  102:astore_3        
			((StringBuilder) (s1)).append("Failed to parse custom attribute type for key: ");
	//   54  103:aload_3         
	//   55  104:ldc1            #225 <String "Failed to parse custom attribute type for key: ">
	//   56  106:invokevirtual   #229 <Method StringBuilder StringBuilder.append(String)>
	//   57  109:pop             
			((StringBuilder) (s1)).append(s);
	//   58  110:aload_3         
	//   59  111:aload_2         
	//   60  112:invokevirtual   #229 <Method StringBuilder StringBuilder.append(String)>
	//   61  115:pop             
			AppboyLogger.e(((String) (appboyuser)), ((StringBuilder) (s1)).toString());
	//   62  116:aload_1         
	//   63  117:aload_3         
	//   64  118:invokevirtual   #232 <Method String StringBuilder.toString()>
	//   65  121:invokestatic    #235 <Method int AppboyLogger.e(String, String)>
	//   66  124:pop             
			return;
	//   67  125:return          
		}
		// Misplaced declaration of an exception variable
		catch(AppboyUser appboyuser)
	//*  68  126:astore_1        
		{
			s1 = TAG;
	//   69  127:getstatic       #37  <Field String TAG>
	//   70  130:astore_3        
		}
		StringBuilder stringbuilder = new StringBuilder();
	//   71  131:new             #222 <Class StringBuilder>
	//   72  134:dup             
	//   73  135:invokespecial   #223 <Method void StringBuilder()>
	//   74  138:astore          4
		stringbuilder.append("Failed to parse custom attribute type for key: ");
	//   75  140:aload           4
	//   76  142:ldc1            #225 <String "Failed to parse custom attribute type for key: ">
	//   77  144:invokevirtual   #229 <Method StringBuilder StringBuilder.append(String)>
	//   78  147:pop             
		stringbuilder.append(s);
	//   79  148:aload           4
	//   80  150:aload_2         
	//   81  151:invokevirtual   #229 <Method StringBuilder StringBuilder.append(String)>
	//   82  154:pop             
		AppboyLogger.e(s1, stringbuilder.toString(), ((Throwable) (appboyuser)));
	//   83  155:aload_3         
	//   84  156:aload           4
	//   85  158:invokevirtual   #232 <Method String StringBuilder.toString()>
	//   86  161:aload_1         
	//   87  162:invokestatic    #172 <Method int AppboyLogger.e(String, String, Throwable)>
	//   88  165:pop             
		return;
	//   89  166:return          
	}

	public void setCustomUserAttributeArray(String s, String s1)
	{
		s1 = ((String) (parseStringArrayFromJsonString(s1)));
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:invokevirtual   #238 <Method String[] parseStringArrayFromJsonString(String)>
	//    3    5:astore_2        
		if(s1 == null)
	//*   4    6:aload_2         
	//*   5    7:ifnonnull       45
		{
			s1 = TAG;
	//    6   10:getstatic       #37  <Field String TAG>
	//    7   13:astore_2        
			StringBuilder stringbuilder = new StringBuilder();
	//    8   14:new             #222 <Class StringBuilder>
	//    9   17:dup             
	//   10   18:invokespecial   #223 <Method void StringBuilder()>
	//   11   21:astore_3        
			stringbuilder.append("Failed to set custom attribute array for key ");
	//   12   22:aload_3         
	//   13   23:ldc1            #240 <String "Failed to set custom attribute array for key ">
	//   14   25:invokevirtual   #229 <Method StringBuilder StringBuilder.append(String)>
	//   15   28:pop             
			stringbuilder.append(s);
	//   16   29:aload_3         
	//   17   30:aload_1         
	//   18   31:invokevirtual   #229 <Method StringBuilder StringBuilder.append(String)>
	//   19   34:pop             
			AppboyLogger.e(s1, stringbuilder.toString());
	//   20   35:aload_2         
	//   21   36:aload_3         
	//   22   37:invokevirtual   #232 <Method String StringBuilder.toString()>
	//   23   40:invokestatic    #235 <Method int AppboyLogger.e(String, String)>
	//   24   43:pop             
			return;
	//   25   44:return          
		} else
		{
			Appboy.getInstance(mContext).getCurrentUser().setCustomAttributeArray(s, ((String []) (s1)));
	//   26   45:aload_0         
	//   27   46:getfield        #81  <Field Context mContext>
	//   28   49:invokestatic    #90  <Method Appboy Appboy.getInstance(Context)>
	//   29   52:invokevirtual   #94  <Method AppboyUser Appboy.getCurrentUser()>
	//   30   55:aload_1         
	//   31   56:aload_2         
	//   32   57:invokevirtual   #244 <Method boolean AppboyUser.setCustomAttributeArray(String, String[])>
	//   33   60:pop             
			return;
	//   34   61:return          
		}
	}

	public void setCustomUserAttributeJSON(String s, String s1)
	{
		setCustomAttribute(Appboy.getInstance(mContext).getCurrentUser(), s, s1);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #81  <Field Context mContext>
	//    3    5:invokestatic    #90  <Method Appboy Appboy.getInstance(Context)>
	//    4    8:invokevirtual   #94  <Method AppboyUser Appboy.getCurrentUser()>
	//    5   11:aload_1         
	//    6   12:aload_2         
	//    7   13:invokevirtual   #247 <Method void setCustomAttribute(AppboyUser, String, String)>
	//    8   16:return          
	}

	public void setDateOfBirth(int i, int j, int k)
	{
		Object obj = ((Object) (monthFromInt(j)));
	//    0    0:aload_0         
	//    1    1:iload_2         
	//    2    2:invokevirtual   #251 <Method Month monthFromInt(int)>
	//    3    5:astore          4
		if(obj == null)
	//*   4    7:aload           4
	//*   5    9:ifnonnull       53
		{
			obj = ((Object) (TAG));
	//    6   12:getstatic       #37  <Field String TAG>
	//    7   15:astore          4
			StringBuilder stringbuilder = new StringBuilder();
	//    8   17:new             #222 <Class StringBuilder>
	//    9   20:dup             
	//   10   21:invokespecial   #223 <Method void StringBuilder()>
	//   11   24:astore          5
			stringbuilder.append("Failed to parse month for value ");
	//   12   26:aload           5
	//   13   28:ldc1            #253 <String "Failed to parse month for value ">
	//   14   30:invokevirtual   #229 <Method StringBuilder StringBuilder.append(String)>
	//   15   33:pop             
			stringbuilder.append(j);
	//   16   34:aload           5
	//   17   36:iload_2         
	//   18   37:invokevirtual   #256 <Method StringBuilder StringBuilder.append(int)>
	//   19   40:pop             
			AppboyLogger.e(((String) (obj)), stringbuilder.toString());
	//   20   41:aload           4
	//   21   43:aload           5
	//   22   45:invokevirtual   #232 <Method String StringBuilder.toString()>
	//   23   48:invokestatic    #235 <Method int AppboyLogger.e(String, String)>
	//   24   51:pop             
			return;
	//   25   52:return          
		} else
		{
			Appboy.getInstance(mContext).getCurrentUser().setDateOfBirth(i, ((Month) (obj)), k);
	//   26   53:aload_0         
	//   27   54:getfield        #81  <Field Context mContext>
	//   28   57:invokestatic    #90  <Method Appboy Appboy.getInstance(Context)>
	//   29   60:invokevirtual   #94  <Method AppboyUser Appboy.getCurrentUser()>
	//   30   63:iload_1         
	//   31   64:aload           4
	//   32   66:iload_3         
	//   33   67:invokevirtual   #259 <Method boolean AppboyUser.setDateOfBirth(int, Month, int)>
	//   34   70:pop             
			return;
	//   35   71:return          
		}
	}

	public void setEmail(String s)
	{
		Appboy.getInstance(mContext).getCurrentUser().setEmail(s);
	//    0    0:aload_0         
	//    1    1:getfield        #81  <Field Context mContext>
	//    2    4:invokestatic    #90  <Method Appboy Appboy.getInstance(Context)>
	//    3    7:invokevirtual   #94  <Method AppboyUser Appboy.getCurrentUser()>
	//    4   10:aload_1         
	//    5   11:invokevirtual   #262 <Method boolean AppboyUser.setEmail(String)>
	//    6   14:pop             
	//    7   15:return          
	}

	public void setEmailNotificationSubscriptionType(String s)
	{
		Object obj = ((Object) (subscriptionTypeFromJavascriptString(s)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #267 <Method NotificationSubscriptionType subscriptionTypeFromJavascriptString(String)>
	//    3    5:astore_2        
		if(obj == null)
	//*   4    6:aload_2         
	//*   5    7:ifnonnull       46
		{
			obj = ((Object) (TAG));
	//    6   10:getstatic       #37  <Field String TAG>
	//    7   13:astore_2        
			StringBuilder stringbuilder = new StringBuilder();
	//    8   14:new             #222 <Class StringBuilder>
	//    9   17:dup             
	//   10   18:invokespecial   #223 <Method void StringBuilder()>
	//   11   21:astore_3        
			stringbuilder.append("Failed to parse email subscription type in Braze HTML in-app message javascript interface with subscription ");
	//   12   22:aload_3         
	//   13   23:ldc2            #269 <String "Failed to parse email subscription type in Braze HTML in-app message javascript interface with subscription ">
	//   14   26:invokevirtual   #229 <Method StringBuilder StringBuilder.append(String)>
	//   15   29:pop             
			stringbuilder.append(s);
	//   16   30:aload_3         
	//   17   31:aload_1         
	//   18   32:invokevirtual   #229 <Method StringBuilder StringBuilder.append(String)>
	//   19   35:pop             
			AppboyLogger.e(((String) (obj)), stringbuilder.toString());
	//   20   36:aload_2         
	//   21   37:aload_3         
	//   22   38:invokevirtual   #232 <Method String StringBuilder.toString()>
	//   23   41:invokestatic    #235 <Method int AppboyLogger.e(String, String)>
	//   24   44:pop             
			return;
	//   25   45:return          
		} else
		{
			Appboy.getInstance(mContext).getCurrentUser().setEmailNotificationSubscriptionType(((NotificationSubscriptionType) (obj)));
	//   26   46:aload_0         
	//   27   47:getfield        #81  <Field Context mContext>
	//   28   50:invokestatic    #90  <Method Appboy Appboy.getInstance(Context)>
	//   29   53:invokevirtual   #94  <Method AppboyUser Appboy.getCurrentUser()>
	//   30   56:aload_2         
	//   31   57:invokevirtual   #272 <Method boolean AppboyUser.setEmailNotificationSubscriptionType(NotificationSubscriptionType)>
	//   32   60:pop             
			return;
	//   33   61:return          
		}
	}

	public void setFirstName(String s)
	{
		Appboy.getInstance(mContext).getCurrentUser().setFirstName(s);
	//    0    0:aload_0         
	//    1    1:getfield        #81  <Field Context mContext>
	//    2    4:invokestatic    #90  <Method Appboy Appboy.getInstance(Context)>
	//    3    7:invokevirtual   #94  <Method AppboyUser Appboy.getCurrentUser()>
	//    4   10:aload_1         
	//    5   11:invokevirtual   #275 <Method boolean AppboyUser.setFirstName(String)>
	//    6   14:pop             
	//    7   15:return          
	}

	public void setGender(String s)
	{
		Object obj = ((Object) (parseGender(s)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #278 <Method Gender parseGender(String)>
	//    3    5:astore_2        
		if(obj == null)
	//*   4    6:aload_2         
	//*   5    7:ifnonnull       46
		{
			obj = ((Object) (TAG));
	//    6   10:getstatic       #37  <Field String TAG>
	//    7   13:astore_2        
			StringBuilder stringbuilder = new StringBuilder();
	//    8   14:new             #222 <Class StringBuilder>
	//    9   17:dup             
	//   10   18:invokespecial   #223 <Method void StringBuilder()>
	//   11   21:astore_3        
			stringbuilder.append("Failed to parse gender in Braze HTML in-app message javascript interface with gender: ");
	//   12   22:aload_3         
	//   13   23:ldc2            #280 <String "Failed to parse gender in Braze HTML in-app message javascript interface with gender: ">
	//   14   26:invokevirtual   #229 <Method StringBuilder StringBuilder.append(String)>
	//   15   29:pop             
			stringbuilder.append(s);
	//   16   30:aload_3         
	//   17   31:aload_1         
	//   18   32:invokevirtual   #229 <Method StringBuilder StringBuilder.append(String)>
	//   19   35:pop             
			AppboyLogger.e(((String) (obj)), stringbuilder.toString());
	//   20   36:aload_2         
	//   21   37:aload_3         
	//   22   38:invokevirtual   #232 <Method String StringBuilder.toString()>
	//   23   41:invokestatic    #235 <Method int AppboyLogger.e(String, String)>
	//   24   44:pop             
			return;
	//   25   45:return          
		} else
		{
			Appboy.getInstance(mContext).getCurrentUser().setGender(((Gender) (obj)));
	//   26   46:aload_0         
	//   27   47:getfield        #81  <Field Context mContext>
	//   28   50:invokestatic    #90  <Method Appboy Appboy.getInstance(Context)>
	//   29   53:invokevirtual   #94  <Method AppboyUser Appboy.getCurrentUser()>
	//   30   56:aload_2         
	//   31   57:invokevirtual   #283 <Method boolean AppboyUser.setGender(Gender)>
	//   32   60:pop             
			return;
	//   33   61:return          
		}
	}

	public void setHomeCity(String s)
	{
		Appboy.getInstance(mContext).getCurrentUser().setHomeCity(s);
	//    0    0:aload_0         
	//    1    1:getfield        #81  <Field Context mContext>
	//    2    4:invokestatic    #90  <Method Appboy Appboy.getInstance(Context)>
	//    3    7:invokevirtual   #94  <Method AppboyUser Appboy.getCurrentUser()>
	//    4   10:aload_1         
	//    5   11:invokevirtual   #286 <Method boolean AppboyUser.setHomeCity(String)>
	//    6   14:pop             
	//    7   15:return          
	}

	public void setLanguage(String s)
	{
		Appboy.getInstance(mContext).getCurrentUser().setLanguage(s);
	//    0    0:aload_0         
	//    1    1:getfield        #81  <Field Context mContext>
	//    2    4:invokestatic    #90  <Method Appboy Appboy.getInstance(Context)>
	//    3    7:invokevirtual   #94  <Method AppboyUser Appboy.getCurrentUser()>
	//    4   10:aload_1         
	//    5   11:invokevirtual   #289 <Method boolean AppboyUser.setLanguage(String)>
	//    6   14:pop             
	//    7   15:return          
	}

	public void setLastName(String s)
	{
		Appboy.getInstance(mContext).getCurrentUser().setLastName(s);
	//    0    0:aload_0         
	//    1    1:getfield        #81  <Field Context mContext>
	//    2    4:invokestatic    #90  <Method Appboy Appboy.getInstance(Context)>
	//    3    7:invokevirtual   #94  <Method AppboyUser Appboy.getCurrentUser()>
	//    4   10:aload_1         
	//    5   11:invokevirtual   #292 <Method boolean AppboyUser.setLastName(String)>
	//    6   14:pop             
	//    7   15:return          
	}

	public void setLocationCustomUserAttribute(String s, double d, double d1)
	{
		Appboy.getInstance(mContext).getCurrentUser().setLocationCustomAttribute(s, d, d1);
	//    0    0:aload_0         
	//    1    1:getfield        #81  <Field Context mContext>
	//    2    4:invokestatic    #90  <Method Appboy Appboy.getInstance(Context)>
	//    3    7:invokevirtual   #94  <Method AppboyUser Appboy.getCurrentUser()>
	//    4   10:aload_1         
	//    5   11:dload_2         
	//    6   12:dload           4
	//    7   14:invokevirtual   #297 <Method void AppboyUser.setLocationCustomAttribute(String, double, double)>
	//    8   17:return          
	}

	public void setPhoneNumber(String s)
	{
		Appboy.getInstance(mContext).getCurrentUser().setPhoneNumber(s);
	//    0    0:aload_0         
	//    1    1:getfield        #81  <Field Context mContext>
	//    2    4:invokestatic    #90  <Method Appboy Appboy.getInstance(Context)>
	//    3    7:invokevirtual   #94  <Method AppboyUser Appboy.getCurrentUser()>
	//    4   10:aload_1         
	//    5   11:invokevirtual   #300 <Method boolean AppboyUser.setPhoneNumber(String)>
	//    6   14:pop             
	//    7   15:return          
	}

	public void setPushNotificationSubscriptionType(String s)
	{
		Object obj = ((Object) (subscriptionTypeFromJavascriptString(s)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #267 <Method NotificationSubscriptionType subscriptionTypeFromJavascriptString(String)>
	//    3    5:astore_2        
		if(obj == null)
	//*   4    6:aload_2         
	//*   5    7:ifnonnull       46
		{
			obj = ((Object) (TAG));
	//    6   10:getstatic       #37  <Field String TAG>
	//    7   13:astore_2        
			StringBuilder stringbuilder = new StringBuilder();
	//    8   14:new             #222 <Class StringBuilder>
	//    9   17:dup             
	//   10   18:invokespecial   #223 <Method void StringBuilder()>
	//   11   21:astore_3        
			stringbuilder.append("Failed to parse push subscription type in Braze HTML in-app message javascript interface with subscription: ");
	//   12   22:aload_3         
	//   13   23:ldc2            #303 <String "Failed to parse push subscription type in Braze HTML in-app message javascript interface with subscription: ">
	//   14   26:invokevirtual   #229 <Method StringBuilder StringBuilder.append(String)>
	//   15   29:pop             
			stringbuilder.append(s);
	//   16   30:aload_3         
	//   17   31:aload_1         
	//   18   32:invokevirtual   #229 <Method StringBuilder StringBuilder.append(String)>
	//   19   35:pop             
			AppboyLogger.e(((String) (obj)), stringbuilder.toString());
	//   20   36:aload_2         
	//   21   37:aload_3         
	//   22   38:invokevirtual   #232 <Method String StringBuilder.toString()>
	//   23   41:invokestatic    #235 <Method int AppboyLogger.e(String, String)>
	//   24   44:pop             
			return;
	//   25   45:return          
		} else
		{
			Appboy.getInstance(mContext).getCurrentUser().setPushNotificationSubscriptionType(((NotificationSubscriptionType) (obj)));
	//   26   46:aload_0         
	//   27   47:getfield        #81  <Field Context mContext>
	//   28   50:invokestatic    #90  <Method Appboy Appboy.getInstance(Context)>
	//   29   53:invokevirtual   #94  <Method AppboyUser Appboy.getCurrentUser()>
	//   30   56:aload_2         
	//   31   57:invokevirtual   #305 <Method boolean AppboyUser.setPushNotificationSubscriptionType(NotificationSubscriptionType)>
	//   32   60:pop             
			return;
	//   33   61:return          
		}
	}

	NotificationSubscriptionType subscriptionTypeFromJavascriptString(String s)
	{
		s = s.toLowerCase(Locale.US);
	//    0    0:aload_1         
	//    1    1:getstatic       #122 <Field Locale Locale.US>
	//    2    4:invokevirtual   #128 <Method String String.toLowerCase(Locale)>
	//    3    7:astore_1        
		if(s.equals("subscribed"))
	//*   4    8:aload_1         
	//*   5    9:ldc1            #21  <String "subscribed">
	//*   6   11:invokevirtual   #132 <Method boolean String.equals(Object)>
	//*   7   14:ifeq            21
			return NotificationSubscriptionType.SUBSCRIBED;
	//    8   17:getstatic       #311 <Field NotificationSubscriptionType NotificationSubscriptionType.SUBSCRIBED>
	//    9   20:areturn         
		if(s.equals("unsubscribed"))
	//*  10   21:aload_1         
	//*  11   22:ldc1            #24  <String "unsubscribed">
	//*  12   24:invokevirtual   #132 <Method boolean String.equals(Object)>
	//*  13   27:ifeq            34
			return NotificationSubscriptionType.UNSUBSCRIBED;
	//   14   30:getstatic       #314 <Field NotificationSubscriptionType NotificationSubscriptionType.UNSUBSCRIBED>
	//   15   33:areturn         
		if(s.equals("opted_in"))
	//*  16   34:aload_1         
	//*  17   35:ldc1            #18  <String "opted_in">
	//*  18   37:invokevirtual   #132 <Method boolean String.equals(Object)>
	//*  19   40:ifeq            47
			return NotificationSubscriptionType.OPTED_IN;
	//   20   43:getstatic       #317 <Field NotificationSubscriptionType NotificationSubscriptionType.OPTED_IN>
	//   21   46:areturn         
		else
			return null;
	//   22   47:aconst_null     
	//   23   48:areturn         
	}

	public static final String JS_BRIDGE_ATTRIBUTE_VALUE = "value";
	public static final String JS_BRIDGE_GENDER_FEMALE;
	public static final String JS_BRIDGE_GENDER_MALE;
	public static final String JS_BRIDGE_GENDER_NOT_APPLICABLE;
	public static final String JS_BRIDGE_GENDER_OTHER;
	public static final String JS_BRIDGE_GENDER_PREFER_NOT_TO_SAY;
	public static final String JS_BRIDGE_GENDER_UNKNOWN;
	public static final String JS_BRIDGE_OPTED_IN = "opted_in";
	public static final String JS_BRIDGE_SUBSCRIBED = "subscribed";
	public static final String JS_BRIDGE_UNSUBSCRIBED = "unsubscribed";
	private static final String TAG = AppboyLogger.getAppboyLogTag(com/appboy/ui/inappmessage/jsinterface/AppboyInAppMessageHtmlUserJavascriptInterface);
	private Context mContext;

	static 
	{
	//    0    0:ldc1            #2   <Class AppboyInAppMessageHtmlUserJavascriptInterface>
	//    1    2:invokestatic    #35  <Method String AppboyLogger.getAppboyLogTag(Class)>
	//    2    5:putstatic       #37  <Field String TAG>
		JS_BRIDGE_GENDER_MALE = Gender.MALE.forJsonPut();
	//    3    8:getstatic       #43  <Field Gender Gender.MALE>
	//    4   11:invokevirtual   #47  <Method String Gender.forJsonPut()>
	//    5   14:putstatic       #49  <Field String JS_BRIDGE_GENDER_MALE>
		JS_BRIDGE_GENDER_FEMALE = Gender.FEMALE.forJsonPut();
	//    6   17:getstatic       #52  <Field Gender Gender.FEMALE>
	//    7   20:invokevirtual   #47  <Method String Gender.forJsonPut()>
	//    8   23:putstatic       #54  <Field String JS_BRIDGE_GENDER_FEMALE>
		JS_BRIDGE_GENDER_OTHER = Gender.OTHER.forJsonPut();
	//    9   26:getstatic       #57  <Field Gender Gender.OTHER>
	//   10   29:invokevirtual   #47  <Method String Gender.forJsonPut()>
	//   11   32:putstatic       #59  <Field String JS_BRIDGE_GENDER_OTHER>
		JS_BRIDGE_GENDER_UNKNOWN = Gender.UNKNOWN.forJsonPut();
	//   12   35:getstatic       #62  <Field Gender Gender.UNKNOWN>
	//   13   38:invokevirtual   #47  <Method String Gender.forJsonPut()>
	//   14   41:putstatic       #64  <Field String JS_BRIDGE_GENDER_UNKNOWN>
		JS_BRIDGE_GENDER_NOT_APPLICABLE = Gender.NOT_APPLICABLE.forJsonPut();
	//   15   44:getstatic       #67  <Field Gender Gender.NOT_APPLICABLE>
	//   16   47:invokevirtual   #47  <Method String Gender.forJsonPut()>
	//   17   50:putstatic       #69  <Field String JS_BRIDGE_GENDER_NOT_APPLICABLE>
		JS_BRIDGE_GENDER_PREFER_NOT_TO_SAY = Gender.PREFER_NOT_TO_SAY.forJsonPut();
	//   18   53:getstatic       #72  <Field Gender Gender.PREFER_NOT_TO_SAY>
	//   19   56:invokevirtual   #47  <Method String Gender.forJsonPut()>
	//   20   59:putstatic       #74  <Field String JS_BRIDGE_GENDER_PREFER_NOT_TO_SAY>
	//*  21   62:return          
	}
}

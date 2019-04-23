// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appboy.ui.inappmessage.jsinterface;

import android.content.Context;
import com.appboy.Appboy;
import com.appboy.AppboyUser;
import com.appboy.enums.*;
import com.appboy.support.AppboyLogger;
import java.util.*;
import org.json.JSONArray;
import org.json.JSONObject;

public class AppboyInAppMessageHtmlUserJavascriptInterface
{

	public AppboyInAppMessageHtmlUserJavascriptInterface(Context context)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #78  <Method void Object()>
		mContext = context;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #80  <Field Context mContext>
	//    5    9:return          
	}

	public void addToCustomAttributeArray(String s, String s1)
	{
		Appboy.getInstance(mContext).getCurrentUser().addToCustomAttributeArray(s, s1);
	//    0    0:aload_0         
	//    1    1:getfield        #80  <Field Context mContext>
	//    2    4:invokestatic    #89  <Method Appboy Appboy.getInstance(Context)>
	//    3    7:invokevirtual   #93  <Method AppboyUser Appboy.getCurrentUser()>
	//    4   10:aload_1         
	//    5   11:aload_2         
	//    6   12:invokevirtual   #98  <Method boolean AppboyUser.addToCustomAttributeArray(String, String)>
	//    7   15:pop             
	//    8   16:return          
	}

	public void incrementCustomUserAttribute(String s)
	{
		Appboy.getInstance(mContext).getCurrentUser().incrementCustomUserAttribute(s);
	//    0    0:aload_0         
	//    1    1:getfield        #80  <Field Context mContext>
	//    2    4:invokestatic    #89  <Method Appboy Appboy.getInstance(Context)>
	//    3    7:invokevirtual   #93  <Method AppboyUser Appboy.getCurrentUser()>
	//    4   10:aload_1         
	//    5   11:invokevirtual   #104 <Method boolean AppboyUser.incrementCustomUserAttribute(String)>
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
	//   10   17:invokestatic    #112 <Method Month Month.getMonth(int)>
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
	//    5    7:getstatic       #121 <Field Locale Locale.US>
	//    6   10:invokevirtual   #127 <Method String String.toLowerCase(Locale)>
	//    7   13:astore_1        
		if(s.equals(((Object) (JS_BRIDGE_GENDER_MALE))))
	//*   8   14:aload_1         
	//*   9   15:getstatic       #48  <Field String JS_BRIDGE_GENDER_MALE>
	//*  10   18:invokevirtual   #131 <Method boolean String.equals(Object)>
	//*  11   21:ifeq            28
			return Gender.MALE;
	//   12   24:getstatic       #42  <Field Gender Gender.MALE>
	//   13   27:areturn         
		if(s.equals(((Object) (JS_BRIDGE_GENDER_FEMALE))))
	//*  14   28:aload_1         
	//*  15   29:getstatic       #53  <Field String JS_BRIDGE_GENDER_FEMALE>
	//*  16   32:invokevirtual   #131 <Method boolean String.equals(Object)>
	//*  17   35:ifeq            42
			return Gender.FEMALE;
	//   18   38:getstatic       #51  <Field Gender Gender.FEMALE>
	//   19   41:areturn         
		if(s.equals(((Object) (JS_BRIDGE_GENDER_OTHER))))
	//*  20   42:aload_1         
	//*  21   43:getstatic       #58  <Field String JS_BRIDGE_GENDER_OTHER>
	//*  22   46:invokevirtual   #131 <Method boolean String.equals(Object)>
	//*  23   49:ifeq            56
			return Gender.OTHER;
	//   24   52:getstatic       #56  <Field Gender Gender.OTHER>
	//   25   55:areturn         
		if(s.equals(((Object) (JS_BRIDGE_GENDER_UNKNOWN))))
	//*  26   56:aload_1         
	//*  27   57:getstatic       #63  <Field String JS_BRIDGE_GENDER_UNKNOWN>
	//*  28   60:invokevirtual   #131 <Method boolean String.equals(Object)>
	//*  29   63:ifeq            70
			return Gender.UNKNOWN;
	//   30   66:getstatic       #61  <Field Gender Gender.UNKNOWN>
	//   31   69:areturn         
		if(s.equals(((Object) (JS_BRIDGE_GENDER_NOT_APPLICABLE))))
	//*  32   70:aload_1         
	//*  33   71:getstatic       #68  <Field String JS_BRIDGE_GENDER_NOT_APPLICABLE>
	//*  34   74:invokevirtual   #131 <Method boolean String.equals(Object)>
	//*  35   77:ifeq            84
			return Gender.NOT_APPLICABLE;
	//   36   80:getstatic       #66  <Field Gender Gender.NOT_APPLICABLE>
	//   37   83:areturn         
		if(s.equals(((Object) (JS_BRIDGE_GENDER_PREFER_NOT_TO_SAY))))
	//*  38   84:aload_1         
	//*  39   85:getstatic       #73  <Field String JS_BRIDGE_GENDER_PREFER_NOT_TO_SAY>
	//*  40   88:invokevirtual   #131 <Method boolean String.equals(Object)>
	//*  41   91:ifeq            98
			return Gender.PREFER_NOT_TO_SAY;
	//   42   94:getstatic       #71  <Field Gender Gender.PREFER_NOT_TO_SAY>
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
			s = ((String) (new JSONArray(s)));
	//    0    0:new             #137 <Class JSONArray>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:invokespecial   #139 <Method void JSONArray(String)>
	//    4    8:astore_1        
			arraylist = new ArrayList();
	//    5    9:new             #141 <Class ArrayList>
	//    6   12:dup             
	//    7   13:invokespecial   #142 <Method void ArrayList()>
	//    8   16:astore_3        
		}
	//*   9   17:iconst_0        
	//*  10   18:istore_2        
	//*  11   19:iload_2         
	//*  12   20:aload_1         
	//*  13   21:invokevirtual   #146 <Method int JSONArray.length()>
	//*  14   24:icmpge          46
	//*  15   27:aload_3         
	//*  16   28:aload_1         
	//*  17   29:iload_2         
	//*  18   30:invokevirtual   #150 <Method String JSONArray.getString(int)>
	//*  19   33:invokeinterface #155 <Method boolean List.add(Object)>
	//*  20   38:pop             
	//*  21   39:iload_2         
	//*  22   40:iconst_1        
	//*  23   41:iadd            
	//*  24   42:istore_2        
	//*  25   43:goto            19
	//*  26   46:aload_3         
	//*  27   47:iconst_0        
	//*  28   48:anewarray       String[]
	//*  29   51:invokeinterface #159 <Method Object[] List.toArray(Object[])>
	//*  30   56:checkcast       #161 <Class String[]>
	//*  31   59:astore_1        
	//*  32   60:aload_1         
	//*  33   61:areturn         
		// Misplaced declaration of an exception variable
		catch(String s)
	//*  34   62:astore_1        
		{
			AppboyLogger.e(TAG, "Failed to parse custom attribute array", ((Throwable) (s)));
	//   35   63:getstatic       #36  <Field String TAG>
	//   36   66:ldc1            #163 <String "Failed to parse custom attribute array">
	//   37   68:aload_1         
	//   38   69:invokestatic    #167 <Method int AppboyLogger.e(String, String, Throwable)>
	//   39   72:pop             
			return null;
	//   40   73:aconst_null     
	//   41   74:areturn         
		}
		i = 0;
		if(i >= ((JSONArray) (s)).length())
			break; /* Loop/switch isn't completed */
		((List) (arraylist)).add(((Object) (((JSONArray) (s)).getString(i))));
		i++;
		if(true) goto _L2; else goto _L1
_L2:
		break MISSING_BLOCK_LABEL_19;
_L1:
		s = ((String) ((String[])((List) (arraylist)).toArray(((Object []) (new String[0])))));
		return ((String []) (s));
	}

	public void removeFromCustomAttributeArray(String s, String s1)
	{
		Appboy.getInstance(mContext).getCurrentUser().removeFromCustomAttributeArray(s, s1);
	//    0    0:aload_0         
	//    1    1:getfield        #80  <Field Context mContext>
	//    2    4:invokestatic    #89  <Method Appboy Appboy.getInstance(Context)>
	//    3    7:invokevirtual   #93  <Method AppboyUser Appboy.getCurrentUser()>
	//    4   10:aload_1         
	//    5   11:aload_2         
	//    6   12:invokevirtual   #170 <Method boolean AppboyUser.removeFromCustomAttributeArray(String, String)>
	//    7   15:pop             
	//    8   16:return          
	}

	public void setCountry(String s)
	{
		Appboy.getInstance(mContext).getCurrentUser().setCountry(s);
	//    0    0:aload_0         
	//    1    1:getfield        #80  <Field Context mContext>
	//    2    4:invokestatic    #89  <Method Appboy Appboy.getInstance(Context)>
	//    3    7:invokevirtual   #93  <Method AppboyUser Appboy.getCurrentUser()>
	//    4   10:aload_1         
	//    5   11:invokevirtual   #173 <Method boolean AppboyUser.setCountry(String)>
	//    6   14:pop             
	//    7   15:return          
	}

	void setCustomAttribute(AppboyUser appboyuser, String s, String s1)
	{
		s1 = ((String) ((new JSONObject(s1)).get("value")));
	//    0    0:new             #177 <Class JSONObject>
	//    1    3:dup             
	//    2    4:aload_3         
	//    3    5:invokespecial   #178 <Method void JSONObject(String)>
	//    4    8:ldc1            #8   <String "value">
	//    5   10:invokevirtual   #182 <Method Object JSONObject.get(String)>
	//    6   13:astore_3        
		if(s1 instanceof String)
	//*   7   14:aload_3         
	//*   8   15:instanceof      #123 <Class String>
	//*   9   18:ifeq            32
		{
			appboyuser.setCustomUserAttribute(s, (String)s1);
	//   10   21:aload_1         
	//   11   22:aload_2         
	//   12   23:aload_3         
	//   13   24:checkcast       #123 <Class String>
	//   14   27:invokevirtual   #185 <Method boolean AppboyUser.setCustomUserAttribute(String, String)>
	//   15   30:pop             
			return;
	//   16   31:return          
		}
		if(s1 instanceof Boolean)
	//*  17   32:aload_3         
	//*  18   33:instanceof      #187 <Class Boolean>
	//*  19   36:ifeq            53
		{
			appboyuser.setCustomUserAttribute(s, ((Boolean)s1).booleanValue());
	//   20   39:aload_1         
	//   21   40:aload_2         
	//   22   41:aload_3         
	//   23   42:checkcast       #187 <Class Boolean>
	//   24   45:invokevirtual   #191 <Method boolean Boolean.booleanValue()>
	//   25   48:invokevirtual   #194 <Method boolean AppboyUser.setCustomUserAttribute(String, boolean)>
	//   26   51:pop             
			return;
	//   27   52:return          
		}
		if(s1 instanceof Integer)
	//*  28   53:aload_3         
	//*  29   54:instanceof      #196 <Class Integer>
	//*  30   57:ifeq            74
		{
			appboyuser.setCustomUserAttribute(s, ((Integer)s1).intValue());
	//   31   60:aload_1         
	//   32   61:aload_2         
	//   33   62:aload_3         
	//   34   63:checkcast       #196 <Class Integer>
	//   35   66:invokevirtual   #199 <Method int Integer.intValue()>
	//   36   69:invokevirtual   #202 <Method boolean AppboyUser.setCustomUserAttribute(String, int)>
	//   37   72:pop             
			return;
	//   38   73:return          
		}
		if(s1 instanceof Double)
	//*  39   74:aload_3         
	//*  40   75:instanceof      #204 <Class Double>
	//*  41   78:ifeq            95
		{
			appboyuser.setCustomUserAttribute(s, ((Double)s1).floatValue());
	//   42   81:aload_1         
	//   43   82:aload_2         
	//   44   83:aload_3         
	//   45   84:checkcast       #204 <Class Double>
	//   46   87:invokevirtual   #208 <Method float Double.floatValue()>
	//   47   90:invokevirtual   #211 <Method boolean AppboyUser.setCustomUserAttribute(String, float)>
	//   48   93:pop             
			return;
	//   49   94:return          
		}
		try
		{
			appboyuser = ((AppboyUser) (TAG));
	//   50   95:getstatic       #36  <Field String TAG>
	//   51   98:astore_1        
			s1 = ((String) (new StringBuilder()));
	//   52   99:new             #213 <Class StringBuilder>
	//   53  102:dup             
	//   54  103:invokespecial   #214 <Method void StringBuilder()>
	//   55  106:astore_3        
			((StringBuilder) (s1)).append("Failed to parse custom attribute type for key: ");
	//   56  107:aload_3         
	//   57  108:ldc1            #216 <String "Failed to parse custom attribute type for key: ">
	//   58  110:invokevirtual   #220 <Method StringBuilder StringBuilder.append(String)>
	//   59  113:pop             
			((StringBuilder) (s1)).append(s);
	//   60  114:aload_3         
	//   61  115:aload_2         
	//   62  116:invokevirtual   #220 <Method StringBuilder StringBuilder.append(String)>
	//   63  119:pop             
			AppboyLogger.e(((String) (appboyuser)), ((StringBuilder) (s1)).toString());
	//   64  120:aload_1         
	//   65  121:aload_3         
	//   66  122:invokevirtual   #223 <Method String StringBuilder.toString()>
	//   67  125:invokestatic    #226 <Method int AppboyLogger.e(String, String)>
	//   68  128:pop             
			return;
	//   69  129:return          
		}
		// Misplaced declaration of an exception variable
		catch(AppboyUser appboyuser)
	//*  70  130:astore_1        
		{
			s1 = TAG;
	//   71  131:getstatic       #36  <Field String TAG>
	//   72  134:astore_3        
		}
		StringBuilder stringbuilder = new StringBuilder();
	//   73  135:new             #213 <Class StringBuilder>
	//   74  138:dup             
	//   75  139:invokespecial   #214 <Method void StringBuilder()>
	//   76  142:astore          4
		stringbuilder.append("Failed to parse custom attribute type for key: ");
	//   77  144:aload           4
	//   78  146:ldc1            #216 <String "Failed to parse custom attribute type for key: ">
	//   79  148:invokevirtual   #220 <Method StringBuilder StringBuilder.append(String)>
	//   80  151:pop             
		stringbuilder.append(s);
	//   81  152:aload           4
	//   82  154:aload_2         
	//   83  155:invokevirtual   #220 <Method StringBuilder StringBuilder.append(String)>
	//   84  158:pop             
		AppboyLogger.e(s1, stringbuilder.toString(), ((Throwable) (appboyuser)));
	//   85  159:aload_3         
	//   86  160:aload           4
	//   87  162:invokevirtual   #223 <Method String StringBuilder.toString()>
	//   88  165:aload_1         
	//   89  166:invokestatic    #167 <Method int AppboyLogger.e(String, String, Throwable)>
	//   90  169:pop             
		return;
	//   91  170:return          
	}

	public void setCustomUserAttributeArray(String s, String s1)
	{
		s1 = ((String) (parseStringArrayFromJsonString(s1)));
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:invokevirtual   #229 <Method String[] parseStringArrayFromJsonString(String)>
	//    3    5:astore_2        
		if(s1 == null)
	//*   4    6:aload_2         
	//*   5    7:ifnonnull       45
		{
			s1 = TAG;
	//    6   10:getstatic       #36  <Field String TAG>
	//    7   13:astore_2        
			StringBuilder stringbuilder = new StringBuilder();
	//    8   14:new             #213 <Class StringBuilder>
	//    9   17:dup             
	//   10   18:invokespecial   #214 <Method void StringBuilder()>
	//   11   21:astore_3        
			stringbuilder.append("Failed to set custom attribute array for key ");
	//   12   22:aload_3         
	//   13   23:ldc1            #231 <String "Failed to set custom attribute array for key ">
	//   14   25:invokevirtual   #220 <Method StringBuilder StringBuilder.append(String)>
	//   15   28:pop             
			stringbuilder.append(s);
	//   16   29:aload_3         
	//   17   30:aload_1         
	//   18   31:invokevirtual   #220 <Method StringBuilder StringBuilder.append(String)>
	//   19   34:pop             
			AppboyLogger.e(s1, stringbuilder.toString());
	//   20   35:aload_2         
	//   21   36:aload_3         
	//   22   37:invokevirtual   #223 <Method String StringBuilder.toString()>
	//   23   40:invokestatic    #226 <Method int AppboyLogger.e(String, String)>
	//   24   43:pop             
			return;
	//   25   44:return          
		} else
		{
			Appboy.getInstance(mContext).getCurrentUser().setCustomAttributeArray(s, ((String []) (s1)));
	//   26   45:aload_0         
	//   27   46:getfield        #80  <Field Context mContext>
	//   28   49:invokestatic    #89  <Method Appboy Appboy.getInstance(Context)>
	//   29   52:invokevirtual   #93  <Method AppboyUser Appboy.getCurrentUser()>
	//   30   55:aload_1         
	//   31   56:aload_2         
	//   32   57:invokevirtual   #235 <Method boolean AppboyUser.setCustomAttributeArray(String, String[])>
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
	//    2    2:getfield        #80  <Field Context mContext>
	//    3    5:invokestatic    #89  <Method Appboy Appboy.getInstance(Context)>
	//    4    8:invokevirtual   #93  <Method AppboyUser Appboy.getCurrentUser()>
	//    5   11:aload_1         
	//    6   12:aload_2         
	//    7   13:invokevirtual   #238 <Method void setCustomAttribute(AppboyUser, String, String)>
	//    8   16:return          
	}

	public void setDateOfBirth(int i, int j, int k)
	{
		Object obj = ((Object) (monthFromInt(j)));
	//    0    0:aload_0         
	//    1    1:iload_2         
	//    2    2:invokevirtual   #242 <Method Month monthFromInt(int)>
	//    3    5:astore          4
		if(obj == null)
	//*   4    7:aload           4
	//*   5    9:ifnonnull       53
		{
			obj = ((Object) (TAG));
	//    6   12:getstatic       #36  <Field String TAG>
	//    7   15:astore          4
			StringBuilder stringbuilder = new StringBuilder();
	//    8   17:new             #213 <Class StringBuilder>
	//    9   20:dup             
	//   10   21:invokespecial   #214 <Method void StringBuilder()>
	//   11   24:astore          5
			stringbuilder.append("Failed to parse month for value ");
	//   12   26:aload           5
	//   13   28:ldc1            #244 <String "Failed to parse month for value ">
	//   14   30:invokevirtual   #220 <Method StringBuilder StringBuilder.append(String)>
	//   15   33:pop             
			stringbuilder.append(j);
	//   16   34:aload           5
	//   17   36:iload_2         
	//   18   37:invokevirtual   #247 <Method StringBuilder StringBuilder.append(int)>
	//   19   40:pop             
			AppboyLogger.e(((String) (obj)), stringbuilder.toString());
	//   20   41:aload           4
	//   21   43:aload           5
	//   22   45:invokevirtual   #223 <Method String StringBuilder.toString()>
	//   23   48:invokestatic    #226 <Method int AppboyLogger.e(String, String)>
	//   24   51:pop             
			return;
	//   25   52:return          
		} else
		{
			Appboy.getInstance(mContext).getCurrentUser().setDateOfBirth(i, ((Month) (obj)), k);
	//   26   53:aload_0         
	//   27   54:getfield        #80  <Field Context mContext>
	//   28   57:invokestatic    #89  <Method Appboy Appboy.getInstance(Context)>
	//   29   60:invokevirtual   #93  <Method AppboyUser Appboy.getCurrentUser()>
	//   30   63:iload_1         
	//   31   64:aload           4
	//   32   66:iload_3         
	//   33   67:invokevirtual   #250 <Method boolean AppboyUser.setDateOfBirth(int, Month, int)>
	//   34   70:pop             
			return;
	//   35   71:return          
		}
	}

	public void setEmail(String s)
	{
		Appboy.getInstance(mContext).getCurrentUser().setEmail(s);
	//    0    0:aload_0         
	//    1    1:getfield        #80  <Field Context mContext>
	//    2    4:invokestatic    #89  <Method Appboy Appboy.getInstance(Context)>
	//    3    7:invokevirtual   #93  <Method AppboyUser Appboy.getCurrentUser()>
	//    4   10:aload_1         
	//    5   11:invokevirtual   #253 <Method boolean AppboyUser.setEmail(String)>
	//    6   14:pop             
	//    7   15:return          
	}

	public void setEmailNotificationSubscriptionType(String s)
	{
		Object obj = ((Object) (subscriptionTypeFromJavascriptString(s)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #258 <Method NotificationSubscriptionType subscriptionTypeFromJavascriptString(String)>
	//    3    5:astore_2        
		if(obj == null)
	//*   4    6:aload_2         
	//*   5    7:ifnonnull       46
		{
			obj = ((Object) (TAG));
	//    6   10:getstatic       #36  <Field String TAG>
	//    7   13:astore_2        
			StringBuilder stringbuilder = new StringBuilder();
	//    8   14:new             #213 <Class StringBuilder>
	//    9   17:dup             
	//   10   18:invokespecial   #214 <Method void StringBuilder()>
	//   11   21:astore_3        
			stringbuilder.append("Failed to parse email subscription type in Braze HTML in-app message javascript interface with subscription ");
	//   12   22:aload_3         
	//   13   23:ldc2            #260 <String "Failed to parse email subscription type in Braze HTML in-app message javascript interface with subscription ">
	//   14   26:invokevirtual   #220 <Method StringBuilder StringBuilder.append(String)>
	//   15   29:pop             
			stringbuilder.append(s);
	//   16   30:aload_3         
	//   17   31:aload_1         
	//   18   32:invokevirtual   #220 <Method StringBuilder StringBuilder.append(String)>
	//   19   35:pop             
			AppboyLogger.e(((String) (obj)), stringbuilder.toString());
	//   20   36:aload_2         
	//   21   37:aload_3         
	//   22   38:invokevirtual   #223 <Method String StringBuilder.toString()>
	//   23   41:invokestatic    #226 <Method int AppboyLogger.e(String, String)>
	//   24   44:pop             
			return;
	//   25   45:return          
		} else
		{
			Appboy.getInstance(mContext).getCurrentUser().setEmailNotificationSubscriptionType(((NotificationSubscriptionType) (obj)));
	//   26   46:aload_0         
	//   27   47:getfield        #80  <Field Context mContext>
	//   28   50:invokestatic    #89  <Method Appboy Appboy.getInstance(Context)>
	//   29   53:invokevirtual   #93  <Method AppboyUser Appboy.getCurrentUser()>
	//   30   56:aload_2         
	//   31   57:invokevirtual   #263 <Method boolean AppboyUser.setEmailNotificationSubscriptionType(NotificationSubscriptionType)>
	//   32   60:pop             
			return;
	//   33   61:return          
		}
	}

	public void setFirstName(String s)
	{
		Appboy.getInstance(mContext).getCurrentUser().setFirstName(s);
	//    0    0:aload_0         
	//    1    1:getfield        #80  <Field Context mContext>
	//    2    4:invokestatic    #89  <Method Appboy Appboy.getInstance(Context)>
	//    3    7:invokevirtual   #93  <Method AppboyUser Appboy.getCurrentUser()>
	//    4   10:aload_1         
	//    5   11:invokevirtual   #266 <Method boolean AppboyUser.setFirstName(String)>
	//    6   14:pop             
	//    7   15:return          
	}

	public void setGender(String s)
	{
		Object obj = ((Object) (parseGender(s)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #269 <Method Gender parseGender(String)>
	//    3    5:astore_2        
		if(obj == null)
	//*   4    6:aload_2         
	//*   5    7:ifnonnull       46
		{
			obj = ((Object) (TAG));
	//    6   10:getstatic       #36  <Field String TAG>
	//    7   13:astore_2        
			StringBuilder stringbuilder = new StringBuilder();
	//    8   14:new             #213 <Class StringBuilder>
	//    9   17:dup             
	//   10   18:invokespecial   #214 <Method void StringBuilder()>
	//   11   21:astore_3        
			stringbuilder.append("Failed to parse gender in Braze HTML in-app message javascript interface with gender: ");
	//   12   22:aload_3         
	//   13   23:ldc2            #271 <String "Failed to parse gender in Braze HTML in-app message javascript interface with gender: ">
	//   14   26:invokevirtual   #220 <Method StringBuilder StringBuilder.append(String)>
	//   15   29:pop             
			stringbuilder.append(s);
	//   16   30:aload_3         
	//   17   31:aload_1         
	//   18   32:invokevirtual   #220 <Method StringBuilder StringBuilder.append(String)>
	//   19   35:pop             
			AppboyLogger.e(((String) (obj)), stringbuilder.toString());
	//   20   36:aload_2         
	//   21   37:aload_3         
	//   22   38:invokevirtual   #223 <Method String StringBuilder.toString()>
	//   23   41:invokestatic    #226 <Method int AppboyLogger.e(String, String)>
	//   24   44:pop             
			return;
	//   25   45:return          
		} else
		{
			Appboy.getInstance(mContext).getCurrentUser().setGender(((Gender) (obj)));
	//   26   46:aload_0         
	//   27   47:getfield        #80  <Field Context mContext>
	//   28   50:invokestatic    #89  <Method Appboy Appboy.getInstance(Context)>
	//   29   53:invokevirtual   #93  <Method AppboyUser Appboy.getCurrentUser()>
	//   30   56:aload_2         
	//   31   57:invokevirtual   #274 <Method boolean AppboyUser.setGender(Gender)>
	//   32   60:pop             
			return;
	//   33   61:return          
		}
	}

	public void setHomeCity(String s)
	{
		Appboy.getInstance(mContext).getCurrentUser().setHomeCity(s);
	//    0    0:aload_0         
	//    1    1:getfield        #80  <Field Context mContext>
	//    2    4:invokestatic    #89  <Method Appboy Appboy.getInstance(Context)>
	//    3    7:invokevirtual   #93  <Method AppboyUser Appboy.getCurrentUser()>
	//    4   10:aload_1         
	//    5   11:invokevirtual   #277 <Method boolean AppboyUser.setHomeCity(String)>
	//    6   14:pop             
	//    7   15:return          
	}

	public void setLanguage(String s)
	{
		Appboy.getInstance(mContext).getCurrentUser().setLanguage(s);
	//    0    0:aload_0         
	//    1    1:getfield        #80  <Field Context mContext>
	//    2    4:invokestatic    #89  <Method Appboy Appboy.getInstance(Context)>
	//    3    7:invokevirtual   #93  <Method AppboyUser Appboy.getCurrentUser()>
	//    4   10:aload_1         
	//    5   11:invokevirtual   #280 <Method boolean AppboyUser.setLanguage(String)>
	//    6   14:pop             
	//    7   15:return          
	}

	public void setLastName(String s)
	{
		Appboy.getInstance(mContext).getCurrentUser().setLastName(s);
	//    0    0:aload_0         
	//    1    1:getfield        #80  <Field Context mContext>
	//    2    4:invokestatic    #89  <Method Appboy Appboy.getInstance(Context)>
	//    3    7:invokevirtual   #93  <Method AppboyUser Appboy.getCurrentUser()>
	//    4   10:aload_1         
	//    5   11:invokevirtual   #283 <Method boolean AppboyUser.setLastName(String)>
	//    6   14:pop             
	//    7   15:return          
	}

	public void setPhoneNumber(String s)
	{
		Appboy.getInstance(mContext).getCurrentUser().setPhoneNumber(s);
	//    0    0:aload_0         
	//    1    1:getfield        #80  <Field Context mContext>
	//    2    4:invokestatic    #89  <Method Appboy Appboy.getInstance(Context)>
	//    3    7:invokevirtual   #93  <Method AppboyUser Appboy.getCurrentUser()>
	//    4   10:aload_1         
	//    5   11:invokevirtual   #286 <Method boolean AppboyUser.setPhoneNumber(String)>
	//    6   14:pop             
	//    7   15:return          
	}

	public void setPushNotificationSubscriptionType(String s)
	{
		Object obj = ((Object) (subscriptionTypeFromJavascriptString(s)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #258 <Method NotificationSubscriptionType subscriptionTypeFromJavascriptString(String)>
	//    3    5:astore_2        
		if(obj == null)
	//*   4    6:aload_2         
	//*   5    7:ifnonnull       46
		{
			obj = ((Object) (TAG));
	//    6   10:getstatic       #36  <Field String TAG>
	//    7   13:astore_2        
			StringBuilder stringbuilder = new StringBuilder();
	//    8   14:new             #213 <Class StringBuilder>
	//    9   17:dup             
	//   10   18:invokespecial   #214 <Method void StringBuilder()>
	//   11   21:astore_3        
			stringbuilder.append("Failed to parse push subscription type in Braze HTML in-app message javascript interface with subscription: ");
	//   12   22:aload_3         
	//   13   23:ldc2            #289 <String "Failed to parse push subscription type in Braze HTML in-app message javascript interface with subscription: ">
	//   14   26:invokevirtual   #220 <Method StringBuilder StringBuilder.append(String)>
	//   15   29:pop             
			stringbuilder.append(s);
	//   16   30:aload_3         
	//   17   31:aload_1         
	//   18   32:invokevirtual   #220 <Method StringBuilder StringBuilder.append(String)>
	//   19   35:pop             
			AppboyLogger.e(((String) (obj)), stringbuilder.toString());
	//   20   36:aload_2         
	//   21   37:aload_3         
	//   22   38:invokevirtual   #223 <Method String StringBuilder.toString()>
	//   23   41:invokestatic    #226 <Method int AppboyLogger.e(String, String)>
	//   24   44:pop             
			return;
	//   25   45:return          
		} else
		{
			Appboy.getInstance(mContext).getCurrentUser().setPushNotificationSubscriptionType(((NotificationSubscriptionType) (obj)));
	//   26   46:aload_0         
	//   27   47:getfield        #80  <Field Context mContext>
	//   28   50:invokestatic    #89  <Method Appboy Appboy.getInstance(Context)>
	//   29   53:invokevirtual   #93  <Method AppboyUser Appboy.getCurrentUser()>
	//   30   56:aload_2         
	//   31   57:invokevirtual   #291 <Method boolean AppboyUser.setPushNotificationSubscriptionType(NotificationSubscriptionType)>
	//   32   60:pop             
			return;
	//   33   61:return          
		}
	}

	NotificationSubscriptionType subscriptionTypeFromJavascriptString(String s)
	{
		s = s.toLowerCase(Locale.US);
	//    0    0:aload_1         
	//    1    1:getstatic       #121 <Field Locale Locale.US>
	//    2    4:invokevirtual   #127 <Method String String.toLowerCase(Locale)>
	//    3    7:astore_1        
		if(s.equals("subscribed"))
	//*   4    8:aload_1         
	//*   5    9:ldc1            #20  <String "subscribed">
	//*   6   11:invokevirtual   #131 <Method boolean String.equals(Object)>
	//*   7   14:ifeq            21
			return NotificationSubscriptionType.SUBSCRIBED;
	//    8   17:getstatic       #297 <Field NotificationSubscriptionType NotificationSubscriptionType.SUBSCRIBED>
	//    9   20:areturn         
		if(s.equals("unsubscribed"))
	//*  10   21:aload_1         
	//*  11   22:ldc1            #23  <String "unsubscribed">
	//*  12   24:invokevirtual   #131 <Method boolean String.equals(Object)>
	//*  13   27:ifeq            34
			return NotificationSubscriptionType.UNSUBSCRIBED;
	//   14   30:getstatic       #300 <Field NotificationSubscriptionType NotificationSubscriptionType.UNSUBSCRIBED>
	//   15   33:areturn         
		if(s.equals("opted_in"))
	//*  16   34:aload_1         
	//*  17   35:ldc1            #17  <String "opted_in">
	//*  18   37:invokevirtual   #131 <Method boolean String.equals(Object)>
	//*  19   40:ifeq            47
			return NotificationSubscriptionType.OPTED_IN;
	//   20   43:getstatic       #303 <Field NotificationSubscriptionType NotificationSubscriptionType.OPTED_IN>
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
	//    1    2:invokestatic    #34  <Method String AppboyLogger.getAppboyLogTag(Class)>
	//    2    5:putstatic       #36  <Field String TAG>
		JS_BRIDGE_GENDER_MALE = Gender.MALE.forJsonPut();
	//    3    8:getstatic       #42  <Field Gender Gender.MALE>
	//    4   11:invokevirtual   #46  <Method String Gender.forJsonPut()>
	//    5   14:putstatic       #48  <Field String JS_BRIDGE_GENDER_MALE>
		JS_BRIDGE_GENDER_FEMALE = Gender.FEMALE.forJsonPut();
	//    6   17:getstatic       #51  <Field Gender Gender.FEMALE>
	//    7   20:invokevirtual   #46  <Method String Gender.forJsonPut()>
	//    8   23:putstatic       #53  <Field String JS_BRIDGE_GENDER_FEMALE>
		JS_BRIDGE_GENDER_OTHER = Gender.OTHER.forJsonPut();
	//    9   26:getstatic       #56  <Field Gender Gender.OTHER>
	//   10   29:invokevirtual   #46  <Method String Gender.forJsonPut()>
	//   11   32:putstatic       #58  <Field String JS_BRIDGE_GENDER_OTHER>
		JS_BRIDGE_GENDER_UNKNOWN = Gender.UNKNOWN.forJsonPut();
	//   12   35:getstatic       #61  <Field Gender Gender.UNKNOWN>
	//   13   38:invokevirtual   #46  <Method String Gender.forJsonPut()>
	//   14   41:putstatic       #63  <Field String JS_BRIDGE_GENDER_UNKNOWN>
		JS_BRIDGE_GENDER_NOT_APPLICABLE = Gender.NOT_APPLICABLE.forJsonPut();
	//   15   44:getstatic       #66  <Field Gender Gender.NOT_APPLICABLE>
	//   16   47:invokevirtual   #46  <Method String Gender.forJsonPut()>
	//   17   50:putstatic       #68  <Field String JS_BRIDGE_GENDER_NOT_APPLICABLE>
		JS_BRIDGE_GENDER_PREFER_NOT_TO_SAY = Gender.PREFER_NOT_TO_SAY.forJsonPut();
	//   18   53:getstatic       #71  <Field Gender Gender.PREFER_NOT_TO_SAY>
	//   19   56:invokevirtual   #46  <Method String Gender.forJsonPut()>
	//   20   59:putstatic       #73  <Field String JS_BRIDGE_GENDER_PREFER_NOT_TO_SAY>
	//*  21   62:return          
	}
}

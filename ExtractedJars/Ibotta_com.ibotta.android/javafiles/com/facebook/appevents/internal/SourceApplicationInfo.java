// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.appevents.internal;

import android.app.Activity;
import android.content.*;
import android.os.Bundle;
import android.preference.PreferenceManager;
import bolts.AppLinks;
import com.facebook.FacebookSdk;

class SourceApplicationInfo
{
	public static class Factory
	{

		public static SourceApplicationInfo create(Activity activity)
		{
			String s = "";
		//    0    0:ldc1            #11  <String "">
		//    1    2:astore_3        
			Object obj = ((Object) (activity.getCallingActivity()));
		//    2    3:aload_0         
		//    3    4:invokevirtual   #17  <Method ComponentName Activity.getCallingActivity()>
		//    4    7:astore          4
			if(obj != null)
		//*   5    9:aload           4
		//*   6   11:ifnull          38
			{
				obj = ((Object) (((ComponentName) (obj)).getPackageName()));
		//    7   14:aload           4
		//    8   16:invokevirtual   #23  <Method String ComponentName.getPackageName()>
		//    9   19:astore          4
				s = ((String) (obj));
		//   10   21:aload           4
		//   11   23:astore_3        
				if(((String) (obj)).equals(((Object) (activity.getPackageName()))))
		//*  12   24:aload           4
		//*  13   26:aload_0         
		//*  14   27:invokevirtual   #24  <Method String Activity.getPackageName()>
		//*  15   30:invokevirtual   #30  <Method boolean String.equals(Object)>
		//*  16   33:ifeq            38
					return null;
		//   17   36:aconst_null     
		//   18   37:areturn         
			}
			obj = ((Object) (activity.getIntent()));
		//   19   38:aload_0         
		//   20   39:invokevirtual   #34  <Method Intent Activity.getIntent()>
		//   21   42:astore          4
			boolean flag1 = false;
		//   22   44:iconst_0        
		//   23   45:istore_2        
			activity = ((Activity) (s));
		//   24   46:aload_3         
		//   25   47:astore_0        
			boolean flag = flag1;
		//   26   48:iload_2         
		//   27   49:istore_1        
			if(obj != null)
		//*  28   50:aload           4
		//*  29   52:ifnull          123
			{
				activity = ((Activity) (s));
		//   30   55:aload_3         
		//   31   56:astore_0        
				flag = flag1;
		//   32   57:iload_2         
		//   33   58:istore_1        
				if(!((Intent) (obj)).getBooleanExtra("_fbSourceApplicationHasBeenSet", false))
		//*  34   59:aload           4
		//*  35   61:ldc1            #36  <String "_fbSourceApplicationHasBeenSet">
		//*  36   63:iconst_0        
		//*  37   64:invokevirtual   #42  <Method boolean Intent.getBooleanExtra(String, boolean)>
		//*  38   67:ifne            123
				{
					((Intent) (obj)).putExtra("_fbSourceApplicationHasBeenSet", true);
		//   39   70:aload           4
		//   40   72:ldc1            #36  <String "_fbSourceApplicationHasBeenSet">
		//   41   74:iconst_1        
		//   42   75:invokevirtual   #46  <Method Intent Intent.putExtra(String, boolean)>
		//   43   78:pop             
					Bundle bundle = AppLinks.getAppLinkData(((Intent) (obj)));
		//   44   79:aload           4
		//   45   81:invokestatic    #52  <Method Bundle AppLinks.getAppLinkData(Intent)>
		//   46   84:astore          5
					activity = ((Activity) (s));
		//   47   86:aload_3         
		//   48   87:astore_0        
					flag = flag1;
		//   49   88:iload_2         
		//   50   89:istore_1        
					if(bundle != null)
		//*  51   90:aload           5
		//*  52   92:ifnull          123
					{
						activity = ((Activity) (bundle.getBundle("referer_app_link")));
		//   53   95:aload           5
		//   54   97:ldc1            #54  <String "referer_app_link">
		//   55   99:invokevirtual   #60  <Method Bundle Bundle.getBundle(String)>
		//   56  102:astore_0        
						if(activity != null)
		//*  57  103:aload_0         
		//*  58  104:ifnull          119
						{
							activity = ((Activity) (((Bundle) (activity)).getString("package")));
		//   59  107:aload_0         
		//   60  108:ldc1            #62  <String "package">
		//   61  110:invokevirtual   #66  <Method String Bundle.getString(String)>
		//   62  113:astore_0        
							flag = true;
		//   63  114:iconst_1        
		//   64  115:istore_1        
						} else
		//*  65  116:goto            123
						{
							flag = true;
		//   66  119:iconst_1        
		//   67  120:istore_1        
							activity = ((Activity) (s));
		//   68  121:aload_3         
		//   69  122:astore_0        
						}
					}
				}
			}
			((Intent) (obj)).putExtra("_fbSourceApplicationHasBeenSet", true);
		//   70  123:aload           4
		//   71  125:ldc1            #36  <String "_fbSourceApplicationHasBeenSet">
		//   72  127:iconst_1        
		//   73  128:invokevirtual   #46  <Method Intent Intent.putExtra(String, boolean)>
		//   74  131:pop             
			return new SourceApplicationInfo(((String) (activity)), flag);
		//   75  132:new             #6   <Class SourceApplicationInfo>
		//   76  135:dup             
		//   77  136:aload_0         
		//   78  137:iload_1         
		//   79  138:aconst_null     
		//   80  139:invokespecial   #70  <Method void SourceApplicationInfo(String, boolean, SourceApplicationInfo$1)>
		//   81  142:areturn         
		}
	}


	private SourceApplicationInfo(String s, boolean flag)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void Object()>
		callingApplicationPackage = s;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #20  <Field String callingApplicationPackage>
		openedByAppLink = flag;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #22  <Field boolean openedByAppLink>
	//    8   14:return          
	}


	public static void clearSavedSourceApplicationInfoFromDisk()
	{
		android.content.SharedPreferences.Editor editor = PreferenceManager.getDefaultSharedPreferences(FacebookSdk.getApplicationContext()).edit();
	//    0    0:invokestatic    #33  <Method android.content.Context FacebookSdk.getApplicationContext()>
	//    1    3:invokestatic    #39  <Method SharedPreferences PreferenceManager.getDefaultSharedPreferences(android.content.Context)>
	//    2    6:invokeinterface #45  <Method android.content.SharedPreferences$Editor SharedPreferences.edit()>
	//    3   11:astore_0        
		editor.remove("com.facebook.appevents.SourceApplicationInfo.callingApplicationPackage");
	//    4   12:aload_0         
	//    5   13:ldc1            #47  <String "com.facebook.appevents.SourceApplicationInfo.callingApplicationPackage">
	//    6   15:invokeinterface #53  <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.remove(String)>
	//    7   20:pop             
		editor.remove("com.facebook.appevents.SourceApplicationInfo.openedByApplink");
	//    8   21:aload_0         
	//    9   22:ldc1            #55  <String "com.facebook.appevents.SourceApplicationInfo.openedByApplink">
	//   10   24:invokeinterface #53  <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.remove(String)>
	//   11   29:pop             
		editor.apply();
	//   12   30:aload_0         
	//   13   31:invokeinterface #58  <Method void android.content.SharedPreferences$Editor.apply()>
	//   14   36:return          
	}

	public static SourceApplicationInfo getStoredSourceApplicatioInfo()
	{
		SharedPreferences sharedpreferences = PreferenceManager.getDefaultSharedPreferences(FacebookSdk.getApplicationContext());
	//    0    0:invokestatic    #33  <Method android.content.Context FacebookSdk.getApplicationContext()>
	//    1    3:invokestatic    #39  <Method SharedPreferences PreferenceManager.getDefaultSharedPreferences(android.content.Context)>
	//    2    6:astore_0        
		if(!sharedpreferences.contains("com.facebook.appevents.SourceApplicationInfo.callingApplicationPackage"))
	//*   3    7:aload_0         
	//*   4    8:ldc1            #47  <String "com.facebook.appevents.SourceApplicationInfo.callingApplicationPackage">
	//*   5   10:invokeinterface #64  <Method boolean SharedPreferences.contains(String)>
	//*   6   15:ifne            20
			return null;
	//    7   18:aconst_null     
	//    8   19:areturn         
		else
			return new SourceApplicationInfo(sharedpreferences.getString("com.facebook.appevents.SourceApplicationInfo.callingApplicationPackage", ((String) (null))), sharedpreferences.getBoolean("com.facebook.appevents.SourceApplicationInfo.openedByApplink", false));
	//    9   20:new             #2   <Class SourceApplicationInfo>
	//   10   23:dup             
	//   11   24:aload_0         
	//   12   25:ldc1            #47  <String "com.facebook.appevents.SourceApplicationInfo.callingApplicationPackage">
	//   13   27:aconst_null     
	//   14   28:invokeinterface #68  <Method String SharedPreferences.getString(String, String)>
	//   15   33:aload_0         
	//   16   34:ldc1            #55  <String "com.facebook.appevents.SourceApplicationInfo.openedByApplink">
	//   17   36:iconst_0        
	//   18   37:invokeinterface #72  <Method boolean SharedPreferences.getBoolean(String, boolean)>
	//   19   42:invokespecial   #26  <Method void SourceApplicationInfo(String, boolean)>
	//   20   45:areturn         
	}

	public String toString()
	{
		String s = "Unclassified";
	//    0    0:ldc1            #76  <String "Unclassified">
	//    1    2:astore_1        
		if(openedByAppLink)
	//*   2    3:aload_0         
	//*   3    4:getfield        #22  <Field boolean openedByAppLink>
	//*   4    7:ifeq            13
			s = "Applink";
	//    5   10:ldc1            #78  <String "Applink">
	//    6   12:astore_1        
		if(callingApplicationPackage != null)
	//*   7   13:aload_0         
	//*   8   14:getfield        #20  <Field String callingApplicationPackage>
	//*   9   17:ifnull          62
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   10   20:new             #80  <Class StringBuilder>
	//   11   23:dup             
	//   12   24:invokespecial   #81  <Method void StringBuilder()>
	//   13   27:astore_2        
			stringbuilder.append(s);
	//   14   28:aload_2         
	//   15   29:aload_1         
	//   16   30:invokevirtual   #85  <Method StringBuilder StringBuilder.append(String)>
	//   17   33:pop             
			stringbuilder.append("(");
	//   18   34:aload_2         
	//   19   35:ldc1            #87  <String "(">
	//   20   37:invokevirtual   #85  <Method StringBuilder StringBuilder.append(String)>
	//   21   40:pop             
			stringbuilder.append(callingApplicationPackage);
	//   22   41:aload_2         
	//   23   42:aload_0         
	//   24   43:getfield        #20  <Field String callingApplicationPackage>
	//   25   46:invokevirtual   #85  <Method StringBuilder StringBuilder.append(String)>
	//   26   49:pop             
			stringbuilder.append(")");
	//   27   50:aload_2         
	//   28   51:ldc1            #89  <String ")">
	//   29   53:invokevirtual   #85  <Method StringBuilder StringBuilder.append(String)>
	//   30   56:pop             
			return stringbuilder.toString();
	//   31   57:aload_2         
	//   32   58:invokevirtual   #91  <Method String StringBuilder.toString()>
	//   33   61:areturn         
		} else
		{
			return s;
	//   34   62:aload_1         
	//   35   63:areturn         
		}
	}

	public void writeSourceApplicationInfoToDisk()
	{
		android.content.SharedPreferences.Editor editor = PreferenceManager.getDefaultSharedPreferences(FacebookSdk.getApplicationContext()).edit();
	//    0    0:invokestatic    #33  <Method android.content.Context FacebookSdk.getApplicationContext()>
	//    1    3:invokestatic    #39  <Method SharedPreferences PreferenceManager.getDefaultSharedPreferences(android.content.Context)>
	//    2    6:invokeinterface #45  <Method android.content.SharedPreferences$Editor SharedPreferences.edit()>
	//    3   11:astore_1        
		editor.putString("com.facebook.appevents.SourceApplicationInfo.callingApplicationPackage", callingApplicationPackage);
	//    4   12:aload_1         
	//    5   13:ldc1            #47  <String "com.facebook.appevents.SourceApplicationInfo.callingApplicationPackage">
	//    6   15:aload_0         
	//    7   16:getfield        #20  <Field String callingApplicationPackage>
	//    8   19:invokeinterface #96  <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putString(String, String)>
	//    9   24:pop             
		editor.putBoolean("com.facebook.appevents.SourceApplicationInfo.openedByApplink", openedByAppLink);
	//   10   25:aload_1         
	//   11   26:ldc1            #55  <String "com.facebook.appevents.SourceApplicationInfo.openedByApplink">
	//   12   28:aload_0         
	//   13   29:getfield        #22  <Field boolean openedByAppLink>
	//   14   32:invokeinterface #100 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putBoolean(String, boolean)>
	//   15   37:pop             
		editor.apply();
	//   16   38:aload_1         
	//   17   39:invokeinterface #58  <Method void android.content.SharedPreferences$Editor.apply()>
	//   18   44:return          
	}

	private String callingApplicationPackage;
	private boolean openedByAppLink;
}

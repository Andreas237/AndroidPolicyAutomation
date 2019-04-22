// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.customtabs;

import android.content.*;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.BundleCompat;
import android.support.v4.content.ContextCompat;
import java.util.ArrayList;

// Referenced classes of package android.support.customtabs:
//			CustomTabsSession

public final class CustomTabsIntent
{
	public static final class Builder
	{

		public CustomTabsIntent build()
		{
			ArrayList arraylist = mMenuItems;
		//    0    0:aload_0         
		//    1    1:getfield        #37  <Field ArrayList mMenuItems>
		//    2    4:astore_1        
			if(arraylist != null)
		//*   3    5:aload_1         
		//*   4    6:ifnull          20
				mIntent.putParcelableArrayListExtra("android.support.customtabs.extra.MENU_ITEMS", arraylist);
		//    5    9:aload_0         
		//    6   10:getfield        #35  <Field Intent mIntent>
		//    7   13:ldc1            #83  <String "android.support.customtabs.extra.MENU_ITEMS">
		//    8   15:aload_1         
		//    9   16:invokevirtual   #87  <Method Intent Intent.putParcelableArrayListExtra(String, ArrayList)>
		//   10   19:pop             
			arraylist = mActionButtons;
		//   11   20:aload_0         
		//   12   21:getfield        #41  <Field ArrayList mActionButtons>
		//   13   24:astore_1        
			if(arraylist != null)
		//*  14   25:aload_1         
		//*  15   26:ifnull          40
				mIntent.putParcelableArrayListExtra("android.support.customtabs.extra.TOOLBAR_ITEMS", arraylist);
		//   16   29:aload_0         
		//   17   30:getfield        #35  <Field Intent mIntent>
		//   18   33:ldc1            #89  <String "android.support.customtabs.extra.TOOLBAR_ITEMS">
		//   19   35:aload_1         
		//   20   36:invokevirtual   #87  <Method Intent Intent.putParcelableArrayListExtra(String, ArrayList)>
		//   21   39:pop             
			mIntent.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", mInstantAppsEnabled);
		//   22   40:aload_0         
		//   23   41:getfield        #35  <Field Intent mIntent>
		//   24   44:ldc1            #91  <String "android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS">
		//   25   46:aload_0         
		//   26   47:getfield        #43  <Field boolean mInstantAppsEnabled>
		//   27   50:invokevirtual   #95  <Method Intent Intent.putExtra(String, boolean)>
		//   28   53:pop             
			return new CustomTabsIntent(mIntent, mStartAnimationBundle);
		//   29   54:new             #6   <Class CustomTabsIntent>
		//   30   57:dup             
		//   31   58:aload_0         
		//   32   59:getfield        #35  <Field Intent mIntent>
		//   33   62:aload_0         
		//   34   63:getfield        #39  <Field Bundle mStartAnimationBundle>
		//   35   66:invokespecial   #98  <Method void CustomTabsIntent(Intent, Bundle)>
		//   36   69:areturn         
		}

		public Builder setSecondaryToolbarColor(int i)
		{
			mIntent.putExtra("android.support.customtabs.extra.SECONDARY_TOOLBAR_COLOR", i);
		//    0    0:aload_0         
		//    1    1:getfield        #35  <Field Intent mIntent>
		//    2    4:ldc1            #103 <String "android.support.customtabs.extra.SECONDARY_TOOLBAR_COLOR">
		//    3    6:iload_1         
		//    4    7:invokevirtual   #106 <Method Intent Intent.putExtra(String, int)>
		//    5   10:pop             
			return this;
		//    6   11:aload_0         
		//    7   12:areturn         
		}

		public Builder setToolbarColor(int i)
		{
			mIntent.putExtra("android.support.customtabs.extra.TOOLBAR_COLOR", i);
		//    0    0:aload_0         
		//    1    1:getfield        #35  <Field Intent mIntent>
		//    2    4:ldc1            #109 <String "android.support.customtabs.extra.TOOLBAR_COLOR">
		//    3    6:iload_1         
		//    4    7:invokevirtual   #106 <Method Intent Intent.putExtra(String, int)>
		//    5   10:pop             
			return this;
		//    6   11:aload_0         
		//    7   12:areturn         
		}

		private ArrayList mActionButtons;
		private boolean mInstantAppsEnabled;
		private final Intent mIntent;
		private ArrayList mMenuItems;
		private Bundle mStartAnimationBundle;

		public Builder()
		{
			this(((CustomTabsSession) (null)));
		//    0    0:aload_0         
		//    1    1:aconst_null     
		//    2    2:invokespecial   #22  <Method void CustomTabsIntent$Builder(CustomTabsSession)>
		//    3    5:return          
		}

		public Builder(CustomTabsSession customtabssession)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #26  <Method void Object()>
			mIntent = new Intent("android.intent.action.VIEW");
		//    2    4:aload_0         
		//    3    5:new             #28  <Class Intent>
		//    4    8:dup             
		//    5    9:ldc1            #30  <String "android.intent.action.VIEW">
		//    6   11:invokespecial   #33  <Method void Intent(String)>
		//    7   14:putfield        #35  <Field Intent mIntent>
			Object obj = null;
		//    8   17:aconst_null     
		//    9   18:astore_2        
			mMenuItems = null;
		//   10   19:aload_0         
		//   11   20:aconst_null     
		//   12   21:putfield        #37  <Field ArrayList mMenuItems>
			mStartAnimationBundle = null;
		//   13   24:aload_0         
		//   14   25:aconst_null     
		//   15   26:putfield        #39  <Field Bundle mStartAnimationBundle>
			mActionButtons = null;
		//   16   29:aload_0         
		//   17   30:aconst_null     
		//   18   31:putfield        #41  <Field ArrayList mActionButtons>
			mInstantAppsEnabled = true;
		//   19   34:aload_0         
		//   20   35:iconst_1        
		//   21   36:putfield        #43  <Field boolean mInstantAppsEnabled>
			if(customtabssession != null)
		//*  22   39:aload_1         
		//*  23   40:ifnull          58
				mIntent.setPackage(customtabssession.getComponentName().getPackageName());
		//   24   43:aload_0         
		//   25   44:getfield        #35  <Field Intent mIntent>
		//   26   47:aload_1         
		//   27   48:invokevirtual   #49  <Method ComponentName CustomTabsSession.getComponentName()>
		//   28   51:invokevirtual   #55  <Method String ComponentName.getPackageName()>
		//   29   54:invokevirtual   #59  <Method Intent Intent.setPackage(String)>
		//   30   57:pop             
			Bundle bundle = new Bundle();
		//   31   58:new             #61  <Class Bundle>
		//   32   61:dup             
		//   33   62:invokespecial   #62  <Method void Bundle()>
		//   34   65:astore_3        
			if(customtabssession == null)
		//*  35   66:aload_1         
		//*  36   67:ifnonnull       75
				customtabssession = ((CustomTabsSession) (obj));
		//   37   70:aload_2         
		//   38   71:astore_1        
			else
		//*  39   72:goto            80
				customtabssession = ((CustomTabsSession) (customtabssession.getBinder()));
		//   40   75:aload_1         
		//   41   76:invokevirtual   #66  <Method android.os.IBinder CustomTabsSession.getBinder()>
		//   42   79:astore_1        
			BundleCompat.putBinder(bundle, "android.support.customtabs.extra.SESSION", ((android.os.IBinder) (customtabssession)));
		//   43   80:aload_3         
		//   44   81:ldc1            #68  <String "android.support.customtabs.extra.SESSION">
		//   45   83:aload_1         
		//   46   84:invokestatic    #74  <Method void BundleCompat.putBinder(Bundle, String, android.os.IBinder)>
			mIntent.putExtras(bundle);
		//   47   87:aload_0         
		//   48   88:getfield        #35  <Field Intent mIntent>
		//   49   91:aload_3         
		//   50   92:invokevirtual   #78  <Method Intent Intent.putExtras(Bundle)>
		//   51   95:pop             
		//   52   96:return          
		}
	}


	CustomTabsIntent(Intent intent1, Bundle bundle)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void Object()>
		intent = intent1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #20  <Field Intent intent>
		startAnimationBundle = bundle;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #22  <Field Bundle startAnimationBundle>
	//    8   14:return          
	}

	public void launchUrl(Context context, Uri uri)
	{
		intent.setData(uri);
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field Intent intent>
	//    2    4:aload_2         
	//    3    5:invokevirtual   #31  <Method Intent Intent.setData(Uri)>
	//    4    8:pop             
		ContextCompat.startActivity(context, intent, startAnimationBundle);
	//    5    9:aload_1         
	//    6   10:aload_0         
	//    7   11:getfield        #20  <Field Intent intent>
	//    8   14:aload_0         
	//    9   15:getfield        #22  <Field Bundle startAnimationBundle>
	//   10   18:invokestatic    #37  <Method void ContextCompat.startActivity(Context, Intent, Bundle)>
	//   11   21:return          
	}

	public final Intent intent;
	public final Bundle startAnimationBundle;
}

// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.customtabs;

import android.app.PendingIntent;
import android.content.*;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.ActivityOptionsCompat;
import android.support.v4.app.BundleCompat;
import android.support.v4.content.ContextCompat;
import android.widget.RemoteViews;
import java.util.ArrayList;

// Referenced classes of package android.support.customtabs:
//			CustomTabsSession

public final class CustomTabsIntent
{
	public static final class Builder
	{

		public Builder addDefaultShareMenuItem()
		{
			mIntent.putExtra("android.support.customtabs.extra.SHARE_MENU_ITEM", true);
		//    0    0:aload_0         
		//    1    1:getfield        #35  <Field Intent mIntent>
		//    2    4:ldc1            #83  <String "android.support.customtabs.extra.SHARE_MENU_ITEM">
		//    3    6:iconst_1        
		//    4    7:invokevirtual   #87  <Method Intent Intent.putExtra(String, boolean)>
		//    5   10:pop             
			return this;
		//    6   11:aload_0         
		//    7   12:areturn         
		}

		public Builder addMenuItem(String s, PendingIntent pendingintent)
		{
			if(mMenuItems == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #37  <Field ArrayList mMenuItems>
		//*   2    4:ifnonnull       18
				mMenuItems = new ArrayList();
		//    3    7:aload_0         
		//    4    8:new             #92  <Class ArrayList>
		//    5   11:dup             
		//    6   12:invokespecial   #93  <Method void ArrayList()>
		//    7   15:putfield        #37  <Field ArrayList mMenuItems>
			Bundle bundle = new Bundle();
		//    8   18:new             #61  <Class Bundle>
		//    9   21:dup             
		//   10   22:invokespecial   #62  <Method void Bundle()>
		//   11   25:astore_3        
			bundle.putString("android.support.customtabs.customaction.MENU_ITEM_TITLE", s);
		//   12   26:aload_3         
		//   13   27:ldc1            #95  <String "android.support.customtabs.customaction.MENU_ITEM_TITLE">
		//   14   29:aload_1         
		//   15   30:invokevirtual   #99  <Method void Bundle.putString(String, String)>
			bundle.putParcelable("android.support.customtabs.customaction.PENDING_INTENT", ((android.os.Parcelable) (pendingintent)));
		//   16   33:aload_3         
		//   17   34:ldc1            #101 <String "android.support.customtabs.customaction.PENDING_INTENT">
		//   18   36:aload_2         
		//   19   37:invokevirtual   #105 <Method void Bundle.putParcelable(String, android.os.Parcelable)>
			mMenuItems.add(((Object) (bundle)));
		//   20   40:aload_0         
		//   21   41:getfield        #37  <Field ArrayList mMenuItems>
		//   22   44:aload_3         
		//   23   45:invokevirtual   #109 <Method boolean ArrayList.add(Object)>
		//   24   48:pop             
			return this;
		//   25   49:aload_0         
		//   26   50:areturn         
		}

		public Builder addToolbarItem(int i, Bitmap bitmap, String s, PendingIntent pendingintent)
			throws IllegalStateException
		{
			if(mActionButtons == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #41  <Field ArrayList mActionButtons>
		//*   2    4:ifnonnull       18
				mActionButtons = new ArrayList();
		//    3    7:aload_0         
		//    4    8:new             #92  <Class ArrayList>
		//    5   11:dup             
		//    6   12:invokespecial   #93  <Method void ArrayList()>
		//    7   15:putfield        #41  <Field ArrayList mActionButtons>
			if(mActionButtons.size() < 5)
		//*   8   18:aload_0         
		//*   9   19:getfield        #41  <Field ArrayList mActionButtons>
		//*  10   22:invokevirtual   #118 <Method int ArrayList.size()>
		//*  11   25:iconst_5        
		//*  12   26:icmpge          83
			{
				Bundle bundle = new Bundle();
		//   13   29:new             #61  <Class Bundle>
		//   14   32:dup             
		//   15   33:invokespecial   #62  <Method void Bundle()>
		//   16   36:astore          5
				bundle.putInt("android.support.customtabs.customaction.ID", i);
		//   17   38:aload           5
		//   18   40:ldc1            #120 <String "android.support.customtabs.customaction.ID">
		//   19   42:iload_1         
		//   20   43:invokevirtual   #124 <Method void Bundle.putInt(String, int)>
				bundle.putParcelable("android.support.customtabs.customaction.ICON", ((android.os.Parcelable) (bitmap)));
		//   21   46:aload           5
		//   22   48:ldc1            #126 <String "android.support.customtabs.customaction.ICON">
		//   23   50:aload_2         
		//   24   51:invokevirtual   #105 <Method void Bundle.putParcelable(String, android.os.Parcelable)>
				bundle.putString("android.support.customtabs.customaction.DESCRIPTION", s);
		//   25   54:aload           5
		//   26   56:ldc1            #128 <String "android.support.customtabs.customaction.DESCRIPTION">
		//   27   58:aload_3         
		//   28   59:invokevirtual   #99  <Method void Bundle.putString(String, String)>
				bundle.putParcelable("android.support.customtabs.customaction.PENDING_INTENT", ((android.os.Parcelable) (pendingintent)));
		//   29   62:aload           5
		//   30   64:ldc1            #101 <String "android.support.customtabs.customaction.PENDING_INTENT">
		//   31   66:aload           4
		//   32   68:invokevirtual   #105 <Method void Bundle.putParcelable(String, android.os.Parcelable)>
				mActionButtons.add(((Object) (bundle)));
		//   33   71:aload_0         
		//   34   72:getfield        #41  <Field ArrayList mActionButtons>
		//   35   75:aload           5
		//   36   77:invokevirtual   #109 <Method boolean ArrayList.add(Object)>
		//   37   80:pop             
				return this;
		//   38   81:aload_0         
		//   39   82:areturn         
			} else
			{
				throw new IllegalStateException("Exceeded maximum toolbar item count of 5");
		//   40   83:new             #113 <Class IllegalStateException>
		//   41   86:dup             
		//   42   87:ldc1            #130 <String "Exceeded maximum toolbar item count of 5">
		//   43   89:invokespecial   #131 <Method void IllegalStateException(String)>
		//   44   92:athrow          
			}
		}

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
		//    7   13:ldc1            #137 <String "android.support.customtabs.extra.MENU_ITEMS">
		//    8   15:aload_1         
		//    9   16:invokevirtual   #141 <Method Intent Intent.putParcelableArrayListExtra(String, ArrayList)>
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
		//   18   33:ldc1            #143 <String "android.support.customtabs.extra.TOOLBAR_ITEMS">
		//   19   35:aload_1         
		//   20   36:invokevirtual   #141 <Method Intent Intent.putParcelableArrayListExtra(String, ArrayList)>
		//   21   39:pop             
			mIntent.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", mInstantAppsEnabled);
		//   22   40:aload_0         
		//   23   41:getfield        #35  <Field Intent mIntent>
		//   24   44:ldc1            #145 <String "android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS">
		//   25   46:aload_0         
		//   26   47:getfield        #43  <Field boolean mInstantAppsEnabled>
		//   27   50:invokevirtual   #87  <Method Intent Intent.putExtra(String, boolean)>
		//   28   53:pop             
			return new CustomTabsIntent(mIntent, mStartAnimationBundle);
		//   29   54:new             #6   <Class CustomTabsIntent>
		//   30   57:dup             
		//   31   58:aload_0         
		//   32   59:getfield        #35  <Field Intent mIntent>
		//   33   62:aload_0         
		//   34   63:getfield        #39  <Field Bundle mStartAnimationBundle>
		//   35   66:invokespecial   #148 <Method void CustomTabsIntent(Intent, Bundle)>
		//   36   69:areturn         
		}

		public Builder enableUrlBarHiding()
		{
			mIntent.putExtra("android.support.customtabs.extra.ENABLE_URLBAR_HIDING", true);
		//    0    0:aload_0         
		//    1    1:getfield        #35  <Field Intent mIntent>
		//    2    4:ldc1            #151 <String "android.support.customtabs.extra.ENABLE_URLBAR_HIDING">
		//    3    6:iconst_1        
		//    4    7:invokevirtual   #87  <Method Intent Intent.putExtra(String, boolean)>
		//    5   10:pop             
			return this;
		//    6   11:aload_0         
		//    7   12:areturn         
		}

		public Builder setActionButton(Bitmap bitmap, String s, PendingIntent pendingintent)
		{
			return setActionButton(bitmap, s, pendingintent, false);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:aload_3         
		//    4    4:iconst_0        
		//    5    5:invokevirtual   #156 <Method CustomTabsIntent$Builder setActionButton(Bitmap, String, PendingIntent, boolean)>
		//    6    8:areturn         
		}

		public Builder setActionButton(Bitmap bitmap, String s, PendingIntent pendingintent, boolean flag)
		{
			Bundle bundle = new Bundle();
		//    0    0:new             #61  <Class Bundle>
		//    1    3:dup             
		//    2    4:invokespecial   #62  <Method void Bundle()>
		//    3    7:astore          5
			bundle.putInt("android.support.customtabs.customaction.ID", 0);
		//    4    9:aload           5
		//    5   11:ldc1            #120 <String "android.support.customtabs.customaction.ID">
		//    6   13:iconst_0        
		//    7   14:invokevirtual   #124 <Method void Bundle.putInt(String, int)>
			bundle.putParcelable("android.support.customtabs.customaction.ICON", ((android.os.Parcelable) (bitmap)));
		//    8   17:aload           5
		//    9   19:ldc1            #126 <String "android.support.customtabs.customaction.ICON">
		//   10   21:aload_1         
		//   11   22:invokevirtual   #105 <Method void Bundle.putParcelable(String, android.os.Parcelable)>
			bundle.putString("android.support.customtabs.customaction.DESCRIPTION", s);
		//   12   25:aload           5
		//   13   27:ldc1            #128 <String "android.support.customtabs.customaction.DESCRIPTION">
		//   14   29:aload_2         
		//   15   30:invokevirtual   #99  <Method void Bundle.putString(String, String)>
			bundle.putParcelable("android.support.customtabs.customaction.PENDING_INTENT", ((android.os.Parcelable) (pendingintent)));
		//   16   33:aload           5
		//   17   35:ldc1            #101 <String "android.support.customtabs.customaction.PENDING_INTENT">
		//   18   37:aload_3         
		//   19   38:invokevirtual   #105 <Method void Bundle.putParcelable(String, android.os.Parcelable)>
			mIntent.putExtra("android.support.customtabs.extra.ACTION_BUTTON_BUNDLE", bundle);
		//   20   41:aload_0         
		//   21   42:getfield        #35  <Field Intent mIntent>
		//   22   45:ldc1            #158 <String "android.support.customtabs.extra.ACTION_BUTTON_BUNDLE">
		//   23   47:aload           5
		//   24   49:invokevirtual   #161 <Method Intent Intent.putExtra(String, Bundle)>
		//   25   52:pop             
			mIntent.putExtra("android.support.customtabs.extra.TINT_ACTION_BUTTON", flag);
		//   26   53:aload_0         
		//   27   54:getfield        #35  <Field Intent mIntent>
		//   28   57:ldc1            #163 <String "android.support.customtabs.extra.TINT_ACTION_BUTTON">
		//   29   59:iload           4
		//   30   61:invokevirtual   #87  <Method Intent Intent.putExtra(String, boolean)>
		//   31   64:pop             
			return this;
		//   32   65:aload_0         
		//   33   66:areturn         
		}

		public Builder setCloseButtonIcon(Bitmap bitmap)
		{
			mIntent.putExtra("android.support.customtabs.extra.CLOSE_BUTTON_ICON", ((android.os.Parcelable) (bitmap)));
		//    0    0:aload_0         
		//    1    1:getfield        #35  <Field Intent mIntent>
		//    2    4:ldc1            #167 <String "android.support.customtabs.extra.CLOSE_BUTTON_ICON">
		//    3    6:aload_1         
		//    4    7:invokevirtual   #170 <Method Intent Intent.putExtra(String, android.os.Parcelable)>
		//    5   10:pop             
			return this;
		//    6   11:aload_0         
		//    7   12:areturn         
		}

		public Builder setExitAnimations(Context context, int i, int j)
		{
			context = ((Context) (ActivityOptionsCompat.makeCustomAnimation(context, i, j).toBundle()));
		//    0    0:aload_1         
		//    1    1:iload_2         
		//    2    2:iload_3         
		//    3    3:invokestatic    #179 <Method ActivityOptionsCompat ActivityOptionsCompat.makeCustomAnimation(Context, int, int)>
		//    4    6:invokevirtual   #183 <Method Bundle ActivityOptionsCompat.toBundle()>
		//    5    9:astore_1        
			mIntent.putExtra("android.support.customtabs.extra.EXIT_ANIMATION_BUNDLE", ((Bundle) (context)));
		//    6   10:aload_0         
		//    7   11:getfield        #35  <Field Intent mIntent>
		//    8   14:ldc1            #185 <String "android.support.customtabs.extra.EXIT_ANIMATION_BUNDLE">
		//    9   16:aload_1         
		//   10   17:invokevirtual   #161 <Method Intent Intent.putExtra(String, Bundle)>
		//   11   20:pop             
			return this;
		//   12   21:aload_0         
		//   13   22:areturn         
		}

		public Builder setInstantAppsEnabled(boolean flag)
		{
			mInstantAppsEnabled = flag;
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:putfield        #43  <Field boolean mInstantAppsEnabled>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public Builder setSecondaryToolbarColor(int i)
		{
			mIntent.putExtra("android.support.customtabs.extra.SECONDARY_TOOLBAR_COLOR", i);
		//    0    0:aload_0         
		//    1    1:getfield        #35  <Field Intent mIntent>
		//    2    4:ldc1            #192 <String "android.support.customtabs.extra.SECONDARY_TOOLBAR_COLOR">
		//    3    6:iload_1         
		//    4    7:invokevirtual   #195 <Method Intent Intent.putExtra(String, int)>
		//    5   10:pop             
			return this;
		//    6   11:aload_0         
		//    7   12:areturn         
		}

		public Builder setSecondaryToolbarViews(RemoteViews remoteviews, int ai[], PendingIntent pendingintent)
		{
			mIntent.putExtra("android.support.customtabs.extra.EXTRA_REMOTEVIEWS", ((android.os.Parcelable) (remoteviews)));
		//    0    0:aload_0         
		//    1    1:getfield        #35  <Field Intent mIntent>
		//    2    4:ldc1            #199 <String "android.support.customtabs.extra.EXTRA_REMOTEVIEWS">
		//    3    6:aload_1         
		//    4    7:invokevirtual   #170 <Method Intent Intent.putExtra(String, android.os.Parcelable)>
		//    5   10:pop             
			mIntent.putExtra("android.support.customtabs.extra.EXTRA_REMOTEVIEWS_VIEW_IDS", ai);
		//    6   11:aload_0         
		//    7   12:getfield        #35  <Field Intent mIntent>
		//    8   15:ldc1            #201 <String "android.support.customtabs.extra.EXTRA_REMOTEVIEWS_VIEW_IDS">
		//    9   17:aload_2         
		//   10   18:invokevirtual   #204 <Method Intent Intent.putExtra(String, int[])>
		//   11   21:pop             
			mIntent.putExtra("android.support.customtabs.extra.EXTRA_REMOTEVIEWS_PENDINGINTENT", ((android.os.Parcelable) (pendingintent)));
		//   12   22:aload_0         
		//   13   23:getfield        #35  <Field Intent mIntent>
		//   14   26:ldc1            #206 <String "android.support.customtabs.extra.EXTRA_REMOTEVIEWS_PENDINGINTENT">
		//   15   28:aload_3         
		//   16   29:invokevirtual   #170 <Method Intent Intent.putExtra(String, android.os.Parcelable)>
		//   17   32:pop             
			return this;
		//   18   33:aload_0         
		//   19   34:areturn         
		}

		public Builder setShowTitle(boolean flag)
		{
			throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.copyTypes(TypeTransformer.java:311)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.fixTypes(TypeTransformer.java:226)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:207)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
		//    0    0:new             #209 <Class RuntimeException>
		//    1    3:dup             
		//    2    4:ldc1            #211 <String "d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.copyTypes(TypeTransformer.java:311)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.fixTypes(TypeTransformer.java:226)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:207)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n">
		//    3    6:invokespecial   #214 <Method void Runtime(String)>
		//    4    9:athrow          
		}

		public Builder setStartAnimations(Context context, int i, int j)
		{
			mStartAnimationBundle = ActivityOptionsCompat.makeCustomAnimation(context, i, j).toBundle();
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:iload_3         
		//    4    4:invokestatic    #179 <Method ActivityOptionsCompat ActivityOptionsCompat.makeCustomAnimation(Context, int, int)>
		//    5    7:invokevirtual   #183 <Method Bundle ActivityOptionsCompat.toBundle()>
		//    6   10:putfield        #39  <Field Bundle mStartAnimationBundle>
			return this;
		//    7   13:aload_0         
		//    8   14:areturn         
		}

		public Builder setToolbarColor(int i)
		{
			mIntent.putExtra("android.support.customtabs.extra.TOOLBAR_COLOR", i);
		//    0    0:aload_0         
		//    1    1:getfield        #35  <Field Intent mIntent>
		//    2    4:ldc1            #218 <String "android.support.customtabs.extra.TOOLBAR_COLOR">
		//    3    6:iload_1         
		//    4    7:invokevirtual   #195 <Method Intent Intent.putExtra(String, int)>
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
	//    1    1:invokespecial   #96  <Method void Object()>
		intent = intent1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #98  <Field Intent intent>
		startAnimationBundle = bundle;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #100 <Field Bundle startAnimationBundle>
	//    8   14:return          
	}

	public static int getMaxToolbarItems()
	{
		return 5;
	//    0    0:iconst_5        
	//    1    1:ireturn         
	}

	public static Intent setAlwaysUseBrowserUI(Intent intent1)
	{
		Intent intent2 = intent1;
	//    0    0:aload_0         
	//    1    1:astore_1        
		if(intent1 == null)
	//*   2    2:aload_0         
	//*   3    3:ifnonnull       16
			intent2 = new Intent("android.intent.action.VIEW");
	//    4    6:new             #107 <Class Intent>
	//    5    9:dup             
	//    6   10:ldc1            #109 <String "android.intent.action.VIEW">
	//    7   12:invokespecial   #112 <Method void Intent(String)>
	//    8   15:astore_1        
		intent2.addFlags(0x10000000);
	//    9   16:aload_1         
	//   10   17:ldc1            #113 <Int 0x10000000>
	//   11   19:invokevirtual   #117 <Method Intent Intent.addFlags(int)>
	//   12   22:pop             
		intent2.putExtra("android.support.customtabs.extra.user_opt_out", true);
	//   13   23:aload_1         
	//   14   24:ldc1            #62  <String "android.support.customtabs.extra.user_opt_out">
	//   15   26:iconst_1        
	//   16   27:invokevirtual   #121 <Method Intent Intent.putExtra(String, boolean)>
	//   17   30:pop             
		return intent2;
	//   18   31:aload_1         
	//   19   32:areturn         
	}

	public static boolean shouldAlwaysUseBrowserUI(Intent intent1)
	{
		boolean flag1 = false;
	//    0    0:iconst_0        
	//    1    1:istore_2        
		boolean flag = flag1;
	//    2    2:iload_2         
	//    3    3:istore_1        
		if(intent1.getBooleanExtra("android.support.customtabs.extra.user_opt_out", false))
	//*   4    4:aload_0         
	//*   5    5:ldc1            #62  <String "android.support.customtabs.extra.user_opt_out">
	//*   6    7:iconst_0        
	//*   7    8:invokevirtual   #127 <Method boolean Intent.getBooleanExtra(String, boolean)>
	//*   8   11:ifeq            28
		{
			flag = flag1;
	//    9   14:iload_2         
	//   10   15:istore_1        
			if((intent1.getFlags() & 0x10000000) != 0)
	//*  11   16:aload_0         
	//*  12   17:invokevirtual   #130 <Method int Intent.getFlags()>
	//*  13   20:ldc1            #113 <Int 0x10000000>
	//*  14   22:iand            
	//*  15   23:ifeq            28
				flag = true;
	//   16   26:iconst_1        
	//   17   27:istore_1        
		}
		return flag;
	//   18   28:iload_1         
	//   19   29:ireturn         
	}

	public void launchUrl(Context context, Uri uri)
	{
		intent.setData(uri);
	//    0    0:aload_0         
	//    1    1:getfield        #98  <Field Intent intent>
	//    2    4:aload_2         
	//    3    5:invokevirtual   #136 <Method Intent Intent.setData(Uri)>
	//    4    8:pop             
		ContextCompat.startActivity(context, intent, startAnimationBundle);
	//    5    9:aload_1         
	//    6   10:aload_0         
	//    7   11:getfield        #98  <Field Intent intent>
	//    8   14:aload_0         
	//    9   15:getfield        #100 <Field Bundle startAnimationBundle>
	//   10   18:invokestatic    #142 <Method void ContextCompat.startActivity(Context, Intent, Bundle)>
	//   11   21:return          
	}

	public static final String EXTRA_ACTION_BUTTON_BUNDLE = "android.support.customtabs.extra.ACTION_BUTTON_BUNDLE";
	public static final String EXTRA_CLOSE_BUTTON_ICON = "android.support.customtabs.extra.CLOSE_BUTTON_ICON";
	public static final String EXTRA_DEFAULT_SHARE_MENU_ITEM = "android.support.customtabs.extra.SHARE_MENU_ITEM";
	public static final String EXTRA_ENABLE_INSTANT_APPS = "android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS";
	public static final String EXTRA_ENABLE_URLBAR_HIDING = "android.support.customtabs.extra.ENABLE_URLBAR_HIDING";
	public static final String EXTRA_EXIT_ANIMATION_BUNDLE = "android.support.customtabs.extra.EXIT_ANIMATION_BUNDLE";
	public static final String EXTRA_MENU_ITEMS = "android.support.customtabs.extra.MENU_ITEMS";
	public static final String EXTRA_REMOTEVIEWS = "android.support.customtabs.extra.EXTRA_REMOTEVIEWS";
	public static final String EXTRA_REMOTEVIEWS_CLICKED_ID = "android.support.customtabs.extra.EXTRA_REMOTEVIEWS_CLICKED_ID";
	public static final String EXTRA_REMOTEVIEWS_PENDINGINTENT = "android.support.customtabs.extra.EXTRA_REMOTEVIEWS_PENDINGINTENT";
	public static final String EXTRA_REMOTEVIEWS_VIEW_IDS = "android.support.customtabs.extra.EXTRA_REMOTEVIEWS_VIEW_IDS";
	public static final String EXTRA_SECONDARY_TOOLBAR_COLOR = "android.support.customtabs.extra.SECONDARY_TOOLBAR_COLOR";
	public static final String EXTRA_SESSION = "android.support.customtabs.extra.SESSION";
	public static final String EXTRA_TINT_ACTION_BUTTON = "android.support.customtabs.extra.TINT_ACTION_BUTTON";
	public static final String EXTRA_TITLE_VISIBILITY_STATE = "android.support.customtabs.extra.TITLE_VISIBILITY";
	public static final String EXTRA_TOOLBAR_COLOR = "android.support.customtabs.extra.TOOLBAR_COLOR";
	public static final String EXTRA_TOOLBAR_ITEMS = "android.support.customtabs.extra.TOOLBAR_ITEMS";
	private static final String EXTRA_USER_OPT_OUT_FROM_CUSTOM_TABS = "android.support.customtabs.extra.user_opt_out";
	public static final String KEY_DESCRIPTION = "android.support.customtabs.customaction.DESCRIPTION";
	public static final String KEY_ICON = "android.support.customtabs.customaction.ICON";
	public static final String KEY_ID = "android.support.customtabs.customaction.ID";
	public static final String KEY_MENU_ITEM_TITLE = "android.support.customtabs.customaction.MENU_ITEM_TITLE";
	public static final String KEY_PENDING_INTENT = "android.support.customtabs.customaction.PENDING_INTENT";
	private static final int MAX_TOOLBAR_ITEMS = 5;
	public static final int NO_TITLE = 0;
	public static final int SHOW_PAGE_TITLE = 1;
	public static final int TOOLBAR_ACTION_BUTTON_ID = 0;
	public final Intent intent;
	public final Bundle startAnimationBundle;
}

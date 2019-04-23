// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package androidx.browser.browseractions;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.*;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.text.TextUtils;
import java.lang.annotation.Annotation;
import java.util.*;

// Referenced classes of package androidx.browser.browseractions:
//			BrowserActionsFallbackMenuUi, BrowserActionItem

public class BrowserActionsIntent
{
	static interface BrowserActionsFallDialogListener
	{

		public abstract void onDialogShown();
	}

	public static interface BrowserActionsItemId
		extends Annotation
	{
	}

	public static interface BrowserActionsUrlType
		extends Annotation
	{
	}

	public static final class Builder
	{

		private Bundle getBundleFromItem(BrowserActionItem browseractionitem)
		{
			Bundle bundle = new Bundle();
		//    0    0:new             #52  <Class Bundle>
		//    1    3:dup             
		//    2    4:invokespecial   #53  <Method void Bundle()>
		//    3    7:astore_2        
			bundle.putString("androidx.browser.browseractions.TITLE", browseractionitem.getTitle());
		//    4    8:aload_2         
		//    5    9:ldc1            #55  <String "androidx.browser.browseractions.TITLE">
		//    6   11:aload_1         
		//    7   12:invokevirtual   #61  <Method String BrowserActionItem.getTitle()>
		//    8   15:invokevirtual   #65  <Method void Bundle.putString(String, String)>
			bundle.putParcelable("androidx.browser.browseractions.ACTION", ((android.os.Parcelable) (browseractionitem.getAction())));
		//    9   18:aload_2         
		//   10   19:ldc1            #67  <String "androidx.browser.browseractions.ACTION">
		//   11   21:aload_1         
		//   12   22:invokevirtual   #71  <Method PendingIntent BrowserActionItem.getAction()>
		//   13   25:invokevirtual   #75  <Method void Bundle.putParcelable(String, android.os.Parcelable)>
			if(browseractionitem.getIconId() != 0)
		//*  14   28:aload_1         
		//*  15   29:invokevirtual   #79  <Method int BrowserActionItem.getIconId()>
		//*  16   32:ifeq            45
				bundle.putInt("androidx.browser.browseractions.ICON_ID", browseractionitem.getIconId());
		//   17   35:aload_2         
		//   18   36:ldc1            #81  <String "androidx.browser.browseractions.ICON_ID">
		//   19   38:aload_1         
		//   20   39:invokevirtual   #79  <Method int BrowserActionItem.getIconId()>
		//   21   42:invokevirtual   #85  <Method void Bundle.putInt(String, int)>
			return bundle;
		//   22   45:aload_2         
		//   23   46:areturn         
		}

		public BrowserActionsIntent build()
		{
			mIntent.setData(mUri);
		//    0    0:aload_0         
		//    1    1:getfield        #34  <Field Intent mIntent>
		//    2    4:aload_0         
		//    3    5:getfield        #42  <Field Uri mUri>
		//    4    8:invokevirtual   #91  <Method Intent Intent.setData(Uri)>
		//    5   11:pop             
			mIntent.putExtra("androidx.browser.browseractions.extra.TYPE", mType);
		//    6   12:aload_0         
		//    7   13:getfield        #34  <Field Intent mIntent>
		//    8   16:ldc1            #93  <String "androidx.browser.browseractions.extra.TYPE">
		//    9   18:aload_0         
		//   10   19:getfield        #44  <Field int mType>
		//   11   22:invokevirtual   #97  <Method Intent Intent.putExtra(String, int)>
		//   12   25:pop             
			mIntent.putParcelableArrayListExtra("androidx.browser.browseractions.extra.MENU_ITEMS", mMenuItems);
		//   13   26:aload_0         
		//   14   27:getfield        #34  <Field Intent mIntent>
		//   15   30:ldc1            #99  <String "androidx.browser.browseractions.extra.MENU_ITEMS">
		//   16   32:aload_0         
		//   17   33:getfield        #36  <Field ArrayList mMenuItems>
		//   18   36:invokevirtual   #103 <Method Intent Intent.putParcelableArrayListExtra(String, ArrayList)>
		//   19   39:pop             
			PendingIntent pendingintent = PendingIntent.getActivity(mContext, 0, new Intent(), 0);
		//   20   40:aload_0         
		//   21   41:getfield        #40  <Field Context mContext>
		//   22   44:iconst_0        
		//   23   45:new             #27  <Class Intent>
		//   24   48:dup             
		//   25   49:invokespecial   #104 <Method void Intent()>
		//   26   52:iconst_0        
		//   27   53:invokestatic    #110 <Method PendingIntent PendingIntent.getActivity(Context, int, Intent, int)>
		//   28   56:astore_1        
			mIntent.putExtra("androidx.browser.browseractions.APP_ID", ((android.os.Parcelable) (pendingintent)));
		//   29   57:aload_0         
		//   30   58:getfield        #34  <Field Intent mIntent>
		//   31   61:ldc1            #112 <String "androidx.browser.browseractions.APP_ID">
		//   32   63:aload_1         
		//   33   64:invokevirtual   #115 <Method Intent Intent.putExtra(String, android.os.Parcelable)>
		//   34   67:pop             
			pendingintent = mOnItemSelectedPendingIntent;
		//   35   68:aload_0         
		//   36   69:getfield        #38  <Field PendingIntent mOnItemSelectedPendingIntent>
		//   37   72:astore_1        
			if(pendingintent != null)
		//*  38   73:aload_1         
		//*  39   74:ifnull          88
				mIntent.putExtra("androidx.browser.browseractions.extra.SELECTED_ACTION_PENDING_INTENT", ((android.os.Parcelable) (pendingintent)));
		//   40   77:aload_0         
		//   41   78:getfield        #34  <Field Intent mIntent>
		//   42   81:ldc1            #117 <String "androidx.browser.browseractions.extra.SELECTED_ACTION_PENDING_INTENT">
		//   43   83:aload_1         
		//   44   84:invokevirtual   #115 <Method Intent Intent.putExtra(String, android.os.Parcelable)>
		//   45   87:pop             
			return new BrowserActionsIntent(mIntent);
		//   46   88:new             #6   <Class BrowserActionsIntent>
		//   47   91:dup             
		//   48   92:aload_0         
		//   49   93:getfield        #34  <Field Intent mIntent>
		//   50   96:invokespecial   #120 <Method void BrowserActionsIntent(Intent)>
		//   51   99:areturn         
		}

		public Builder setCustomItems(ArrayList arraylist)
		{
			if(arraylist.size() <= 5)
		//*   0    0:aload_1         
		//*   1    1:invokevirtual   #125 <Method int ArrayList.size()>
		//*   2    4:iconst_5        
		//*   3    5:icmpgt          88
			{
				for(int i = 0; i < arraylist.size();)
		//*   4    8:iconst_0        
		//*   5    9:istore_2        
		//*   6   10:iload_2         
		//*   7   11:aload_1         
		//*   8   12:invokevirtual   #125 <Method int ArrayList.size()>
		//*   9   15:icmpge          86
					if(!TextUtils.isEmpty(((CharSequence) (((BrowserActionItem)arraylist.get(i)).getTitle()))) && ((BrowserActionItem)arraylist.get(i)).getAction() != null)
		//*  10   18:aload_1         
		//*  11   19:iload_2         
		//*  12   20:invokevirtual   #129 <Method Object ArrayList.get(int)>
		//*  13   23:checkcast       #57  <Class BrowserActionItem>
		//*  14   26:invokevirtual   #61  <Method String BrowserActionItem.getTitle()>
		//*  15   29:invokestatic    #135 <Method boolean TextUtils.isEmpty(CharSequence)>
		//*  16   32:ifne            76
		//*  17   35:aload_1         
		//*  18   36:iload_2         
		//*  19   37:invokevirtual   #129 <Method Object ArrayList.get(int)>
		//*  20   40:checkcast       #57  <Class BrowserActionItem>
		//*  21   43:invokevirtual   #71  <Method PendingIntent BrowserActionItem.getAction()>
		//*  22   46:ifnull          76
					{
						mMenuItems.add(((Object) (getBundleFromItem((BrowserActionItem)arraylist.get(i)))));
		//   23   49:aload_0         
		//   24   50:getfield        #36  <Field ArrayList mMenuItems>
		//   25   53:aload_0         
		//   26   54:aload_1         
		//   27   55:iload_2         
		//   28   56:invokevirtual   #129 <Method Object ArrayList.get(int)>
		//   29   59:checkcast       #57  <Class BrowserActionItem>
		//   30   62:invokespecial   #137 <Method Bundle getBundleFromItem(BrowserActionItem)>
		//   31   65:invokevirtual   #141 <Method boolean ArrayList.add(Object)>
		//   32   68:pop             
						i++;
		//   33   69:iload_2         
		//   34   70:iconst_1        
		//   35   71:iadd            
		//   36   72:istore_2        
					} else
		//*  37   73:goto            10
					{
						throw new IllegalArgumentException("Custom item should contain a non-empty title and non-null intent.");
		//   38   76:new             #143 <Class IllegalArgumentException>
		//   39   79:dup             
		//   40   80:ldc1            #145 <String "Custom item should contain a non-empty title and non-null intent.">
		//   41   82:invokespecial   #146 <Method void IllegalArgumentException(String)>
		//   42   85:athrow          
					}

				return this;
		//   43   86:aload_0         
		//   44   87:areturn         
			} else
			{
				throw new IllegalStateException("Exceeded maximum toolbar item count of 5");
		//   45   88:new             #148 <Class IllegalStateException>
		//   46   91:dup             
		//   47   92:ldc1            #150 <String "Exceeded maximum toolbar item count of 5">
		//   48   94:invokespecial   #151 <Method void IllegalStateException(String)>
		//   49   97:athrow          
			}
		}

		public transient Builder setCustomItems(BrowserActionItem abrowseractionitem[])
		{
			return setCustomItems(new ArrayList(((java.util.Collection) (Arrays.asList(((Object []) (abrowseractionitem)))))));
		//    0    0:aload_0         
		//    1    1:new             #46  <Class ArrayList>
		//    2    4:dup             
		//    3    5:aload_1         
		//    4    6:invokestatic    #160 <Method List Arrays.asList(Object[])>
		//    5    9:invokespecial   #163 <Method void ArrayList(java.util.Collection)>
		//    6   12:invokevirtual   #165 <Method BrowserActionsIntent$Builder setCustomItems(ArrayList)>
		//    7   15:areturn         
		}

		public Builder setOnItemSelectedAction(PendingIntent pendingintent)
		{
			mOnItemSelectedPendingIntent = pendingintent;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #38  <Field PendingIntent mOnItemSelectedPendingIntent>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public Builder setUrlType(int i)
		{
			mType = i;
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:putfield        #44  <Field int mType>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		private Context mContext;
		private final Intent mIntent = new Intent("androidx.browser.browseractions.browser_action_open");
		private ArrayList mMenuItems;
		private PendingIntent mOnItemSelectedPendingIntent;
		private int mType;
		private Uri mUri;

		public Builder(Context context, Uri uri)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #25  <Method void Object()>
		//    2    4:aload_0         
		//    3    5:new             #27  <Class Intent>
		//    4    8:dup             
		//    5    9:ldc1            #29  <String "androidx.browser.browseractions.browser_action_open">
		//    6   11:invokespecial   #32  <Method void Intent(String)>
		//    7   14:putfield        #34  <Field Intent mIntent>
			mMenuItems = null;
		//    8   17:aload_0         
		//    9   18:aconst_null     
		//   10   19:putfield        #36  <Field ArrayList mMenuItems>
			mOnItemSelectedPendingIntent = null;
		//   11   22:aload_0         
		//   12   23:aconst_null     
		//   13   24:putfield        #38  <Field PendingIntent mOnItemSelectedPendingIntent>
			mContext = context;
		//   14   27:aload_0         
		//   15   28:aload_1         
		//   16   29:putfield        #40  <Field Context mContext>
			mUri = uri;
		//   17   32:aload_0         
		//   18   33:aload_2         
		//   19   34:putfield        #42  <Field Uri mUri>
			mType = 0;
		//   20   37:aload_0         
		//   21   38:iconst_0        
		//   22   39:putfield        #44  <Field int mType>
			mMenuItems = new ArrayList();
		//   23   42:aload_0         
		//   24   43:new             #46  <Class ArrayList>
		//   25   46:dup             
		//   26   47:invokespecial   #47  <Method void ArrayList()>
		//   27   50:putfield        #36  <Field ArrayList mMenuItems>
		//   28   53:return          
		}
	}


	BrowserActionsIntent(Intent intent)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #78  <Method void Object()>
		mIntent = intent;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #80  <Field Intent mIntent>
	//    5    9:return          
	}

	private static List getBrowserActionsIntentHandlers(Context context)
	{
		Intent intent = new Intent("androidx.browser.browseractions.browser_action_open", Uri.parse("https://www.example.com"));
	//    0    0:new             #86  <Class Intent>
	//    1    3:dup             
	//    2    4:ldc1            #20  <String "androidx.browser.browseractions.browser_action_open">
	//    3    6:ldc1            #62  <String "https://www.example.com">
	//    4    8:invokestatic    #92  <Method Uri Uri.parse(String)>
	//    5   11:invokespecial   #95  <Method void Intent(String, Uri)>
	//    6   14:astore_1        
		return context.getPackageManager().queryIntentActivities(intent, 0x20000);
	//    7   15:aload_0         
	//    8   16:invokevirtual   #101 <Method PackageManager Context.getPackageManager()>
	//    9   19:aload_1         
	//   10   20:ldc1            #102 <Int 0x20000>
	//   11   22:invokevirtual   #108 <Method List PackageManager.queryIntentActivities(Intent, int)>
	//   12   25:areturn         
	}

	public static String getCreatorPackageName(Intent intent)
	{
		intent = ((Intent) ((PendingIntent)intent.getParcelableExtra("androidx.browser.browseractions.APP_ID")));
	//    0    0:aload_0         
	//    1    1:ldc1            #23  <String "androidx.browser.browseractions.APP_ID">
	//    2    3:invokevirtual   #116 <Method android.os.Parcelable Intent.getParcelableExtra(String)>
	//    3    6:checkcast       #118 <Class PendingIntent>
	//    4    9:astore_0        
		if(intent != null)
	//*   5   10:aload_0         
	//*   6   11:ifnull          32
		{
			if(android.os.Build.VERSION.SDK_INT >= 17)
	//*   7   14:getstatic       #123 <Field int android.os.Build$VERSION.SDK_INT>
	//*   8   17:bipush          17
	//*   9   19:icmplt          27
				return ((PendingIntent) (intent)).getCreatorPackage();
	//   10   22:aload_0         
	//   11   23:invokevirtual   #127 <Method String PendingIntent.getCreatorPackage()>
	//   12   26:areturn         
			else
				return ((PendingIntent) (intent)).getTargetPackage();
	//   13   27:aload_0         
	//   14   28:invokevirtual   #130 <Method String PendingIntent.getTargetPackage()>
	//   15   31:areturn         
		} else
		{
			return null;
	//   16   32:aconst_null     
	//   17   33:areturn         
		}
	}

	public static void launchIntent(Context context, Intent intent)
	{
		launchIntent(context, intent, getBrowserActionsIntentHandlers(context));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_0         
	//    3    3:invokestatic    #134 <Method List getBrowserActionsIntentHandlers(Context)>
	//    4    6:invokestatic    #137 <Method void launchIntent(Context, Intent, List)>
	//    5    9:return          
	}

	static void launchIntent(Context context, Intent intent, List list)
	{
		if(list != null && list.size() != 0)
	//*   0    0:aload_2         
	//*   1    1:ifnull          158
	//*   2    4:aload_2         
	//*   3    5:invokeinterface #148 <Method int List.size()>
	//*   4   10:ifne            16
	//*   5   13:goto            158
		{
			int j = list.size();
	//    6   16:aload_2         
	//    7   17:invokeinterface #148 <Method int List.size()>
	//    8   22:istore          4
			int i = 0;
	//    9   24:iconst_0        
	//   10   25:istore_3        
			if(j == 1)
	//*  11   26:iload           4
	//*  12   28:iconst_1        
	//*  13   29:icmpne          56
			{
				intent.setPackage(((ResolveInfo)list.get(0)).activityInfo.packageName);
	//   14   32:aload_1         
	//   15   33:aload_2         
	//   16   34:iconst_0        
	//   17   35:invokeinterface #152 <Method Object List.get(int)>
	//   18   40:checkcast       #154 <Class ResolveInfo>
	//   19   43:getfield        #158 <Field ActivityInfo ResolveInfo.activityInfo>
	//   20   46:getfield        #163 <Field String ActivityInfo.packageName>
	//   21   49:invokevirtual   #167 <Method Intent Intent.setPackage(String)>
	//   22   52:pop             
			} else
	//*  23   53:goto            151
			{
				Object obj = ((Object) (new Intent("android.intent.action.VIEW", Uri.parse("https://www.example.com"))));
	//   24   56:new             #86  <Class Intent>
	//   25   59:dup             
	//   26   60:ldc1            #169 <String "android.intent.action.VIEW">
	//   27   62:ldc1            #62  <String "https://www.example.com">
	//   28   64:invokestatic    #92  <Method Uri Uri.parse(String)>
	//   29   67:invokespecial   #95  <Method void Intent(String, Uri)>
	//   30   70:astore          5
				obj = ((Object) (context.getPackageManager().resolveActivity(((Intent) (obj)), 0x10000)));
	//   31   72:aload_0         
	//   32   73:invokevirtual   #101 <Method PackageManager Context.getPackageManager()>
	//   33   76:aload           5
	//   34   78:ldc1            #170 <Int 0x10000>
	//   35   80:invokevirtual   #174 <Method ResolveInfo PackageManager.resolveActivity(Intent, int)>
	//   36   83:astore          5
				if(obj != null)
	//*  37   85:aload           5
	//*  38   87:ifnull          151
				{
					obj = ((Object) (((ResolveInfo) (obj)).activityInfo.packageName));
	//   39   90:aload           5
	//   40   92:getfield        #158 <Field ActivityInfo ResolveInfo.activityInfo>
	//   41   95:getfield        #163 <Field String ActivityInfo.packageName>
	//   42   98:astore          5
					do
					{
						if(i >= list.size())
							break;
	//   43  100:iload_3         
	//   44  101:aload_2         
	//   45  102:invokeinterface #148 <Method int List.size()>
	//   46  107:icmpge          151
						if(((String) (obj)).equals(((Object) (((ResolveInfo)list.get(i)).activityInfo.packageName))))
	//*  47  110:aload           5
	//*  48  112:aload_2         
	//*  49  113:iload_3         
	//*  50  114:invokeinterface #152 <Method Object List.get(int)>
	//*  51  119:checkcast       #154 <Class ResolveInfo>
	//*  52  122:getfield        #158 <Field ActivityInfo ResolveInfo.activityInfo>
	//*  53  125:getfield        #163 <Field String ActivityInfo.packageName>
	//*  54  128:invokevirtual   #180 <Method boolean String.equals(Object)>
	//*  55  131:ifeq            144
						{
							intent.setPackage(((String) (obj)));
	//   56  134:aload_1         
	//   57  135:aload           5
	//   58  137:invokevirtual   #167 <Method Intent Intent.setPackage(String)>
	//   59  140:pop             
							break;
	//   60  141:goto            151
						}
						i++;
	//   61  144:iload_3         
	//   62  145:iconst_1        
	//   63  146:iadd            
	//   64  147:istore_3        
					} while(true);
	//   65  148:goto            100
				}
			}
			ContextCompat.startActivity(context, intent, ((Bundle) (null)));
	//   66  151:aload_0         
	//   67  152:aload_1         
	//   68  153:aconst_null     
	//   69  154:invokestatic    #186 <Method void ContextCompat.startActivity(Context, Intent, Bundle)>
			return;
	//   70  157:return          
		} else
		{
			openFallbackBrowserActionsMenu(context, intent);
	//   71  158:aload_0         
	//   72  159:aload_1         
	//   73  160:invokestatic    #189 <Method void openFallbackBrowserActionsMenu(Context, Intent)>
			return;
	//   74  163:return          
		}
	}

	public static void openBrowserAction(Context context, Uri uri)
	{
		launchIntent(context, (new Builder(context, uri)).build().getIntent());
	//    0    0:aload_0         
	//    1    1:new             #15  <Class BrowserActionsIntent$Builder>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokespecial   #195 <Method void BrowserActionsIntent$Builder(Context, Uri)>
	//    6   10:invokevirtual   #199 <Method BrowserActionsIntent BrowserActionsIntent$Builder.build()>
	//    7   13:invokevirtual   #203 <Method Intent getIntent()>
	//    8   16:invokestatic    #205 <Method void launchIntent(Context, Intent)>
	//    9   19:return          
	}

	public static void openBrowserAction(Context context, Uri uri, int i, ArrayList arraylist, PendingIntent pendingintent)
	{
		launchIntent(context, (new Builder(context, uri)).setUrlType(i).setCustomItems(arraylist).setOnItemSelectedAction(pendingintent).build().getIntent());
	//    0    0:aload_0         
	//    1    1:new             #15  <Class BrowserActionsIntent$Builder>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokespecial   #195 <Method void BrowserActionsIntent$Builder(Context, Uri)>
	//    6   10:iload_2         
	//    7   11:invokevirtual   #210 <Method BrowserActionsIntent$Builder BrowserActionsIntent$Builder.setUrlType(int)>
	//    8   14:aload_3         
	//    9   15:invokevirtual   #214 <Method BrowserActionsIntent$Builder BrowserActionsIntent$Builder.setCustomItems(ArrayList)>
	//   10   18:aload           4
	//   11   20:invokevirtual   #218 <Method BrowserActionsIntent$Builder BrowserActionsIntent$Builder.setOnItemSelectedAction(PendingIntent)>
	//   12   23:invokevirtual   #199 <Method BrowserActionsIntent BrowserActionsIntent$Builder.build()>
	//   13   26:invokevirtual   #203 <Method Intent getIntent()>
	//   14   29:invokestatic    #205 <Method void launchIntent(Context, Intent)>
	//   15   32:return          
	}

	private static void openFallbackBrowserActionsMenu(Context context, Intent intent)
	{
		Uri uri = intent.getData();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #223 <Method Uri Intent.getData()>
	//    2    4:astore_3        
		int i = intent.getIntExtra("androidx.browser.browseractions.extra.TYPE", 0);
	//    3    5:aload_1         
	//    4    6:ldc1            #32  <String "androidx.browser.browseractions.extra.TYPE">
	//    5    8:iconst_0        
	//    6    9:invokevirtual   #227 <Method int Intent.getIntExtra(String, int)>
	//    7   12:istore_2        
		intent = ((Intent) (intent.getParcelableArrayListExtra("androidx.browser.browseractions.extra.MENU_ITEMS")));
	//    8   13:aload_1         
	//    9   14:ldc1            #26  <String "androidx.browser.browseractions.extra.MENU_ITEMS">
	//   10   16:invokevirtual   #231 <Method ArrayList Intent.getParcelableArrayListExtra(String)>
	//   11   19:astore_1        
		if(intent != null)
	//*  12   20:aload_1         
	//*  13   21:ifnull          32
			intent = ((Intent) (parseBrowserActionItems(((ArrayList) (intent)))));
	//   14   24:aload_1         
	//   15   25:invokestatic    #235 <Method List parseBrowserActionItems(ArrayList)>
	//   16   28:astore_1        
		else
	//*  17   29:goto            34
			intent = null;
	//   18   32:aconst_null     
	//   19   33:astore_1        
		openFallbackBrowserActionsMenu(context, uri, i, ((List) (intent)));
	//   20   34:aload_0         
	//   21   35:aload_3         
	//   22   36:iload_2         
	//   23   37:aload_1         
	//   24   38:invokestatic    #238 <Method void openFallbackBrowserActionsMenu(Context, Uri, int, List)>
	//   25   41:return          
	}

	private static void openFallbackBrowserActionsMenu(Context context, Uri uri, int i, List list)
	{
		(new BrowserActionsFallbackMenuUi(context, uri, list)).displayMenu();
	//    0    0:new             #240 <Class BrowserActionsFallbackMenuUi>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:aload_3         
	//    5    7:invokespecial   #243 <Method void BrowserActionsFallbackMenuUi(Context, Uri, List)>
	//    6   10:invokevirtual   #246 <Method void BrowserActionsFallbackMenuUi.displayMenu()>
		context = ((Context) (sDialogListenter));
	//    7   13:getstatic       #248 <Field BrowserActionsIntent$BrowserActionsFallDialogListener sDialogListenter>
	//    8   16:astore_0        
		if(context != null)
	//*   9   17:aload_0         
	//*  10   18:ifnull          27
			((BrowserActionsFallDialogListener) (context)).onDialogShown();
	//   11   21:aload_0         
	//   12   22:invokeinterface #251 <Method void BrowserActionsIntent$BrowserActionsFallDialogListener.onDialogShown()>
	//   13   27:return          
	}

	public static List parseBrowserActionItems(ArrayList arraylist)
	{
		ArrayList arraylist1 = new ArrayList();
	//    0    0:new             #254 <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #255 <Method void ArrayList()>
	//    3    7:astore_3        
		for(int i = 0; i < arraylist.size();)
	//*   4    8:iconst_0        
	//*   5    9:istore_1        
	//*   6   10:iload_1         
	//*   7   11:aload_0         
	//*   8   12:invokevirtual   #256 <Method int ArrayList.size()>
	//*   9   15:icmpge          107
		{
			Bundle bundle = (Bundle)arraylist.get(i);
	//   10   18:aload_0         
	//   11   19:iload_1         
	//   12   20:invokevirtual   #257 <Method Object ArrayList.get(int)>
	//   13   23:checkcast       #259 <Class Bundle>
	//   14   26:astore          4
			String s = bundle.getString("androidx.browser.browseractions.TITLE");
	//   15   28:aload           4
	//   16   30:ldc1            #54  <String "androidx.browser.browseractions.TITLE">
	//   17   32:invokevirtual   #263 <Method String Bundle.getString(String)>
	//   18   35:astore          5
			PendingIntent pendingintent = (PendingIntent)bundle.getParcelable("androidx.browser.browseractions.ACTION");
	//   19   37:aload           4
	//   20   39:ldc1            #48  <String "androidx.browser.browseractions.ACTION">
	//   21   41:invokevirtual   #266 <Method android.os.Parcelable Bundle.getParcelable(String)>
	//   22   44:checkcast       #118 <Class PendingIntent>
	//   23   47:astore          6
			int j = bundle.getInt("androidx.browser.browseractions.ICON_ID");
	//   24   49:aload           4
	//   25   51:ldc1            #51  <String "androidx.browser.browseractions.ICON_ID">
	//   26   53:invokevirtual   #270 <Method int Bundle.getInt(String)>
	//   27   56:istore_2        
			if(!TextUtils.isEmpty(((CharSequence) (s))) && pendingintent != null)
	//*  28   57:aload           5
	//*  29   59:invokestatic    #276 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  30   62:ifne            96
	//*  31   65:aload           6
	//*  32   67:ifnull          96
			{
				((List) (arraylist1)).add(((Object) (new BrowserActionItem(s, pendingintent, j))));
	//   33   70:aload_3         
	//   34   71:new             #278 <Class BrowserActionItem>
	//   35   74:dup             
	//   36   75:aload           5
	//   37   77:aload           6
	//   38   79:iload_2         
	//   39   80:invokespecial   #281 <Method void BrowserActionItem(String, PendingIntent, int)>
	//   40   83:invokeinterface #284 <Method boolean List.add(Object)>
	//   41   88:pop             
				i++;
	//   42   89:iload_1         
	//   43   90:iconst_1        
	//   44   91:iadd            
	//   45   92:istore_1        
			} else
	//*  46   93:goto            10
			{
				throw new IllegalArgumentException("Custom item should contain a non-empty title and non-null intent.");
	//   47   96:new             #286 <Class IllegalArgumentException>
	//   48   99:dup             
	//   49  100:ldc2            #288 <String "Custom item should contain a non-empty title and non-null intent.">
	//   50  103:invokespecial   #291 <Method void IllegalArgumentException(String)>
	//   51  106:athrow          
			}
		}

		return ((List) (arraylist1));
	//   52  107:aload_3         
	//   53  108:areturn         
	}

	static void setDialogShownListenter(BrowserActionsFallDialogListener browseractionsfalldialoglistener)
	{
		sDialogListenter = browseractionsfalldialoglistener;
	//    0    0:aload_0         
	//    1    1:putstatic       #248 <Field BrowserActionsIntent$BrowserActionsFallDialogListener sDialogListenter>
	//    2    4:return          
	}

	public Intent getIntent()
	{
		return mIntent;
	//    0    0:aload_0         
	//    1    1:getfield        #80  <Field Intent mIntent>
	//    2    4:areturn         
	}

	public static final String ACTION_BROWSER_ACTIONS_OPEN = "androidx.browser.browseractions.browser_action_open";
	public static final String EXTRA_APP_ID = "androidx.browser.browseractions.APP_ID";
	public static final String EXTRA_MENU_ITEMS = "androidx.browser.browseractions.extra.MENU_ITEMS";
	public static final String EXTRA_SELECTED_ACTION_PENDING_INTENT = "androidx.browser.browseractions.extra.SELECTED_ACTION_PENDING_INTENT";
	public static final String EXTRA_TYPE = "androidx.browser.browseractions.extra.TYPE";
	public static final int ITEM_COPY = 3;
	public static final int ITEM_DOWNLOAD = 2;
	public static final int ITEM_INVALID_ITEM = -1;
	public static final int ITEM_OPEN_IN_INCOGNITO = 1;
	public static final int ITEM_OPEN_IN_NEW_TAB = 0;
	public static final int ITEM_SHARE = 4;
	public static final String KEY_ACTION = "androidx.browser.browseractions.ACTION";
	public static final String KEY_ICON_ID = "androidx.browser.browseractions.ICON_ID";
	public static final String KEY_TITLE = "androidx.browser.browseractions.TITLE";
	public static final int MAX_CUSTOM_ITEMS = 5;
	private static final String TAG = "BrowserActions";
	private static final String TEST_URL = "https://www.example.com";
	public static final int URL_TYPE_AUDIO = 3;
	public static final int URL_TYPE_FILE = 4;
	public static final int URL_TYPE_IMAGE = 1;
	public static final int URL_TYPE_NONE = 0;
	public static final int URL_TYPE_PLUGIN = 5;
	public static final int URL_TYPE_VIDEO = 2;
	private static BrowserActionsFallDialogListener sDialogListenter;
	private final Intent mIntent;
}

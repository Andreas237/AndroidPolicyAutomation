// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package androidx.browser.browseractions;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Arrays;

// Referenced classes of package androidx.browser.browseractions:
//			BrowserActionsIntent, BrowserActionItem

public static final class BrowserActionsIntent$Builder
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

	public BrowserActionsIntent$Builder setCustomItems(ArrayList arraylist)
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

	public transient BrowserActionsIntent$Builder setCustomItems(BrowserActionItem abrowseractionitem[])
	{
		return setCustomItems(new ArrayList(((java.util.Collection) (Arrays.asList(((Object []) (abrowseractionitem)))))));
	//    0    0:aload_0         
	//    1    1:new             #46  <Class ArrayList>
	//    2    4:dup             
	//    3    5:aload_1         
	//    4    6:invokestatic    #160 <Method java.util.List Arrays.asList(Object[])>
	//    5    9:invokespecial   #163 <Method void ArrayList(java.util.Collection)>
	//    6   12:invokevirtual   #165 <Method BrowserActionsIntent$Builder setCustomItems(ArrayList)>
	//    7   15:areturn         
	}

	public BrowserActionsIntent$Builder setOnItemSelectedAction(PendingIntent pendingintent)
	{
		mOnItemSelectedPendingIntent = pendingintent;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #38  <Field PendingIntent mOnItemSelectedPendingIntent>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public BrowserActionsIntent$Builder setUrlType(int i)
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

	public BrowserActionsIntent$Builder(Context context, Uri uri)
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

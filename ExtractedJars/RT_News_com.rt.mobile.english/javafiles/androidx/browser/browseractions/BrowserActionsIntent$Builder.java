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
		if(mOnItemSelectedPendingIntent != null)
	//*  35   68:aload_0         
	//*  36   69:getfield        #38  <Field PendingIntent mOnItemSelectedPendingIntent>
	//*  37   72:ifnull          89
			mIntent.putExtra("androidx.browser.browseractions.extra.SELECTED_ACTION_PENDING_INTENT", ((android.os.Parcelable) (mOnItemSelectedPendingIntent)));
	//   38   75:aload_0         
	//   39   76:getfield        #34  <Field Intent mIntent>
	//   40   79:ldc1            #117 <String "androidx.browser.browseractions.extra.SELECTED_ACTION_PENDING_INTENT">
	//   41   81:aload_0         
	//   42   82:getfield        #38  <Field PendingIntent mOnItemSelectedPendingIntent>
	//   43   85:invokevirtual   #115 <Method Intent Intent.putExtra(String, android.os.Parcelable)>
	//   44   88:pop             
		return new BrowserActionsIntent(mIntent, ((BrowserActionsIntent._cls1) (null)));
	//   45   89:new             #6   <Class BrowserActionsIntent>
	//   46   92:dup             
	//   47   93:aload_0         
	//   48   94:getfield        #34  <Field Intent mIntent>
	//   49   97:aconst_null     
	//   50   98:invokespecial   #120 <Method void BrowserActionsIntent(Intent, BrowserActionsIntent$1)>
	//   51  101:areturn         
	}

	public BrowserActionsIntent$Builder setCustomItems(ArrayList arraylist)
	{
		if(arraylist.size() > 5)
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #125 <Method int ArrayList.size()>
	//*   2    4:iconst_5        
	//*   3    5:icmple          18
			throw new IllegalStateException("Exceeded maximum toolbar item count of 5");
	//    4    8:new             #127 <Class IllegalStateException>
	//    5   11:dup             
	//    6   12:ldc1            #129 <String "Exceeded maximum toolbar item count of 5">
	//    7   14:invokespecial   #130 <Method void IllegalStateException(String)>
	//    8   17:athrow          
		for(int i = 0; i < arraylist.size();)
	//*   9   18:iconst_0        
	//*  10   19:istore_2        
	//*  11   20:iload_2         
	//*  12   21:aload_1         
	//*  13   22:invokevirtual   #125 <Method int ArrayList.size()>
	//*  14   25:icmpge          99
			if(!TextUtils.isEmpty(((CharSequence) (((BrowserActionItem)arraylist.get(i)).getTitle()))) && ((BrowserActionItem)arraylist.get(i)).getAction() != null)
	//*  15   28:aload_1         
	//*  16   29:iload_2         
	//*  17   30:invokevirtual   #134 <Method Object ArrayList.get(int)>
	//*  18   33:checkcast       #57  <Class BrowserActionItem>
	//*  19   36:invokevirtual   #61  <Method String BrowserActionItem.getTitle()>
	//*  20   39:invokestatic    #140 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  21   42:ifne            89
	//*  22   45:aload_1         
	//*  23   46:iload_2         
	//*  24   47:invokevirtual   #134 <Method Object ArrayList.get(int)>
	//*  25   50:checkcast       #57  <Class BrowserActionItem>
	//*  26   53:invokevirtual   #71  <Method PendingIntent BrowserActionItem.getAction()>
	//*  27   56:ifnonnull       62
	//*  28   59:goto            89
			{
				mMenuItems.add(((Object) (getBundleFromItem((BrowserActionItem)arraylist.get(i)))));
	//   29   62:aload_0         
	//   30   63:getfield        #36  <Field ArrayList mMenuItems>
	//   31   66:aload_0         
	//   32   67:aload_1         
	//   33   68:iload_2         
	//   34   69:invokevirtual   #134 <Method Object ArrayList.get(int)>
	//   35   72:checkcast       #57  <Class BrowserActionItem>
	//   36   75:invokespecial   #142 <Method Bundle getBundleFromItem(BrowserActionItem)>
	//   37   78:invokevirtual   #146 <Method boolean ArrayList.add(Object)>
	//   38   81:pop             
				i++;
	//   39   82:iload_2         
	//   40   83:iconst_1        
	//   41   84:iadd            
	//   42   85:istore_2        
			} else
	//*  43   86:goto            20
			{
				throw new IllegalArgumentException("Custom item should contain a non-empty title and non-null intent.");
	//   44   89:new             #148 <Class IllegalArgumentException>
	//   45   92:dup             
	//   46   93:ldc1            #150 <String "Custom item should contain a non-empty title and non-null intent.">
	//   47   95:invokespecial   #151 <Method void IllegalArgumentException(String)>
	//   48   98:athrow          
			}

		return this;
	//   49   99:aload_0         
	//   50  100:areturn         
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

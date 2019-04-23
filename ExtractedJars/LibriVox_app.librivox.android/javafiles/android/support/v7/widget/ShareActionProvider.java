// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.support.v4.view.d;
import android.support.v7.content.res.AppCompatResources;
import android.util.TypedValue;
import android.view.*;

// Referenced classes of package android.support.v7.widget:
//			ActivityChooserModel, ActivityChooserView

public class ShareActionProvider extends d
{

	public ShareActionProvider(Context context)
	{
		super(context);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #25  <Method void d(Context)>
		mMaxShownActivityCount = 4;
	//    3    5:aload_0         
	//    4    6:iconst_4        
	//    5    7:putfield        #27  <Field int mMaxShownActivityCount>
	//    6   10:aload_0         
	//    7   11:new             #29  <Class ShareActionProvider$ShareMenuItemOnMenuItemClickListener>
	//    8   14:dup             
	//    9   15:aload_0         
	//   10   16:invokespecial   #32  <Method void ShareActionProvider$ShareMenuItemOnMenuItemClickListener(ShareActionProvider)>
	//   11   19:putfield        #34  <Field ShareActionProvider$ShareMenuItemOnMenuItemClickListener mOnMenuItemClickListener>
		mShareHistoryFileName = "share_history.xml";
	//   12   22:aload_0         
	//   13   23:ldc1            #11  <String "share_history.xml">
	//   14   25:putfield        #36  <Field String mShareHistoryFileName>
		mContext = context;
	//   15   28:aload_0         
	//   16   29:aload_1         
	//   17   30:putfield        #38  <Field Context mContext>
	//   18   33:return          
	}

	private void setActivityChooserPolicyIfNeeded()
	{
		if(mOnShareTargetSelectedListener == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #43  <Field ShareActionProvider$OnShareTargetSelectedListener mOnShareTargetSelectedListener>
	//*   2    4:ifnonnull       8
			return;
	//    3    7:return          
		if(mOnChooseActivityListener == null)
	//*   4    8:aload_0         
	//*   5    9:getfield        #45  <Field ActivityChooserModel$OnChooseActivityListener mOnChooseActivityListener>
	//*   6   12:ifnonnull       27
			mOnChooseActivityListener = ((ActivityChooserModel.OnChooseActivityListener) (new ShareActivityChooserModelPolicy()));
	//    7   15:aload_0         
	//    8   16:new             #47  <Class ShareActionProvider$ShareActivityChooserModelPolicy>
	//    9   19:dup             
	//   10   20:aload_0         
	//   11   21:invokespecial   #48  <Method void ShareActionProvider$ShareActivityChooserModelPolicy(ShareActionProvider)>
	//   12   24:putfield        #45  <Field ActivityChooserModel$OnChooseActivityListener mOnChooseActivityListener>
		ActivityChooserModel.get(mContext, mShareHistoryFileName).setOnChooseActivityListener(mOnChooseActivityListener);
	//   13   27:aload_0         
	//   14   28:getfield        #38  <Field Context mContext>
	//   15   31:aload_0         
	//   16   32:getfield        #36  <Field String mShareHistoryFileName>
	//   17   35:invokestatic    #54  <Method ActivityChooserModel ActivityChooserModel.get(Context, String)>
	//   18   38:aload_0         
	//   19   39:getfield        #45  <Field ActivityChooserModel$OnChooseActivityListener mOnChooseActivityListener>
	//   20   42:invokevirtual   #58  <Method void ActivityChooserModel.setOnChooseActivityListener(ActivityChooserModel$OnChooseActivityListener)>
	//   21   45:return          
	}

	public boolean hasSubMenu()
	{
		return true;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	public View onCreateActionView()
	{
		ActivityChooserView activitychooserview = new ActivityChooserView(mContext);
	//    0    0:new             #64  <Class ActivityChooserView>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #38  <Field Context mContext>
	//    4    8:invokespecial   #65  <Method void ActivityChooserView(Context)>
	//    5   11:astore_1        
		if(!activitychooserview.isInEditMode())
	//*   6   12:aload_1         
	//*   7   13:invokevirtual   #68  <Method boolean ActivityChooserView.isInEditMode()>
	//*   8   16:ifne            34
			activitychooserview.setActivityChooserModel(ActivityChooserModel.get(mContext, mShareHistoryFileName));
	//    9   19:aload_1         
	//   10   20:aload_0         
	//   11   21:getfield        #38  <Field Context mContext>
	//   12   24:aload_0         
	//   13   25:getfield        #36  <Field String mShareHistoryFileName>
	//   14   28:invokestatic    #54  <Method ActivityChooserModel ActivityChooserModel.get(Context, String)>
	//   15   31:invokevirtual   #72  <Method void ActivityChooserView.setActivityChooserModel(ActivityChooserModel)>
		TypedValue typedvalue = new TypedValue();
	//   16   34:new             #74  <Class TypedValue>
	//   17   37:dup             
	//   18   38:invokespecial   #76  <Method void TypedValue()>
	//   19   41:astore_2        
		mContext.getTheme().resolveAttribute(android.support.v7.appcompat.R.attr.actionModeShareDrawable, typedvalue, true);
	//   20   42:aload_0         
	//   21   43:getfield        #38  <Field Context mContext>
	//   22   46:invokevirtual   #82  <Method android.content.res.Resources$Theme Context.getTheme()>
	//   23   49:getstatic       #87  <Field int android.support.v7.appcompat.R$attr.actionModeShareDrawable>
	//   24   52:aload_2         
	//   25   53:iconst_1        
	//   26   54:invokevirtual   #93  <Method boolean android.content.res.Resources$Theme.resolveAttribute(int, TypedValue, boolean)>
	//   27   57:pop             
		activitychooserview.setExpandActivityOverflowButtonDrawable(AppCompatResources.getDrawable(mContext, typedvalue.resourceId));
	//   28   58:aload_1         
	//   29   59:aload_0         
	//   30   60:getfield        #38  <Field Context mContext>
	//   31   63:aload_2         
	//   32   64:getfield        #96  <Field int TypedValue.resourceId>
	//   33   67:invokestatic    #102 <Method android.graphics.drawable.Drawable AppCompatResources.getDrawable(Context, int)>
	//   34   70:invokevirtual   #106 <Method void ActivityChooserView.setExpandActivityOverflowButtonDrawable(android.graphics.drawable.Drawable)>
		activitychooserview.setProvider(((d) (this)));
	//   35   73:aload_1         
	//   36   74:aload_0         
	//   37   75:invokevirtual   #110 <Method void ActivityChooserView.setProvider(d)>
		activitychooserview.setDefaultActionButtonContentDescription(android.support.v7.appcompat.R.string.abc_shareactionprovider_share_with_application);
	//   38   78:aload_1         
	//   39   79:getstatic       #115 <Field int android.support.v7.appcompat.R$string.abc_shareactionprovider_share_with_application>
	//   40   82:invokevirtual   #119 <Method void ActivityChooserView.setDefaultActionButtonContentDescription(int)>
		activitychooserview.setExpandActivityOverflowButtonContentDescription(android.support.v7.appcompat.R.string.abc_shareactionprovider_share_with);
	//   41   85:aload_1         
	//   42   86:getstatic       #122 <Field int android.support.v7.appcompat.R$string.abc_shareactionprovider_share_with>
	//   43   89:invokevirtual   #125 <Method void ActivityChooserView.setExpandActivityOverflowButtonContentDescription(int)>
		return ((View) (activitychooserview));
	//   44   92:aload_1         
	//   45   93:areturn         
	}

	public void onPrepareSubMenu(SubMenu submenu)
	{
		submenu.clear();
	//    0    0:aload_1         
	//    1    1:invokeinterface #132 <Method void SubMenu.clear()>
		ActivityChooserModel activitychoosermodel = ActivityChooserModel.get(mContext, mShareHistoryFileName);
	//    2    6:aload_0         
	//    3    7:getfield        #38  <Field Context mContext>
	//    4   10:aload_0         
	//    5   11:getfield        #36  <Field String mShareHistoryFileName>
	//    6   14:invokestatic    #54  <Method ActivityChooserModel ActivityChooserModel.get(Context, String)>
	//    7   17:astore          5
		android.content.pm.PackageManager packagemanager = mContext.getPackageManager();
	//    8   19:aload_0         
	//    9   20:getfield        #38  <Field Context mContext>
	//   10   23:invokevirtual   #136 <Method android.content.pm.PackageManager Context.getPackageManager()>
	//   11   26:astore          6
		int k = activitychoosermodel.getActivityCount();
	//   12   28:aload           5
	//   13   30:invokevirtual   #140 <Method int ActivityChooserModel.getActivityCount()>
	//   14   33:istore_3        
		int l = Math.min(k, mMaxShownActivityCount);
	//   15   34:iload_3         
	//   16   35:aload_0         
	//   17   36:getfield        #27  <Field int mMaxShownActivityCount>
	//   18   39:invokestatic    #146 <Method int Math.min(int, int)>
	//   19   42:istore          4
		for(int i = 0; i < l; i++)
	//*  20   44:iconst_0        
	//*  21   45:istore_2        
	//*  22   46:iload_2         
	//*  23   47:iload           4
	//*  24   49:icmpge          105
		{
			ResolveInfo resolveinfo = activitychoosermodel.getActivity(i);
	//   25   52:aload           5
	//   26   54:iload_2         
	//   27   55:invokevirtual   #150 <Method ResolveInfo ActivityChooserModel.getActivity(int)>
	//   28   58:astore          7
			submenu.add(0, i, i, resolveinfo.loadLabel(packagemanager)).setIcon(resolveinfo.loadIcon(packagemanager)).setOnMenuItemClickListener(((android.view.MenuItem.OnMenuItemClickListener) (mOnMenuItemClickListener)));
	//   29   60:aload_1         
	//   30   61:iconst_0        
	//   31   62:iload_2         
	//   32   63:iload_2         
	//   33   64:aload           7
	//   34   66:aload           6
	//   35   68:invokevirtual   #156 <Method CharSequence ResolveInfo.loadLabel(android.content.pm.PackageManager)>
	//   36   71:invokeinterface #160 <Method MenuItem SubMenu.add(int, int, int, CharSequence)>
	//   37   76:aload           7
	//   38   78:aload           6
	//   39   80:invokevirtual   #164 <Method android.graphics.drawable.Drawable ResolveInfo.loadIcon(android.content.pm.PackageManager)>
	//   40   83:invokeinterface #170 <Method MenuItem MenuItem.setIcon(android.graphics.drawable.Drawable)>
	//   41   88:aload_0         
	//   42   89:getfield        #34  <Field ShareActionProvider$ShareMenuItemOnMenuItemClickListener mOnMenuItemClickListener>
	//   43   92:invokeinterface #174 <Method MenuItem MenuItem.setOnMenuItemClickListener(android.view.MenuItem$OnMenuItemClickListener)>
	//   44   97:pop             
		}

	//   45   98:iload_2         
	//   46   99:iconst_1        
	//   47  100:iadd            
	//   48  101:istore_2        
	//*  49  102:goto            46
		if(l < k)
	//*  50  105:iload           4
	//*  51  107:iload_3         
	//*  52  108:icmpge          193
		{
			submenu = submenu.addSubMenu(0, l, l, ((CharSequence) (mContext.getString(android.support.v7.appcompat.R.string.abc_activity_chooser_view_see_all))));
	//   53  111:aload_1         
	//   54  112:iconst_0        
	//   55  113:iload           4
	//   56  115:iload           4
	//   57  117:aload_0         
	//   58  118:getfield        #38  <Field Context mContext>
	//   59  121:getstatic       #177 <Field int android.support.v7.appcompat.R$string.abc_activity_chooser_view_see_all>
	//   60  124:invokevirtual   #181 <Method String Context.getString(int)>
	//   61  127:invokeinterface #185 <Method SubMenu SubMenu.addSubMenu(int, int, int, CharSequence)>
	//   62  132:astore_1        
			for(int j = 0; j < k; j++)
	//*  63  133:iconst_0        
	//*  64  134:istore_2        
	//*  65  135:iload_2         
	//*  66  136:iload_3         
	//*  67  137:icmpge          193
			{
				ResolveInfo resolveinfo1 = activitychoosermodel.getActivity(j);
	//   68  140:aload           5
	//   69  142:iload_2         
	//   70  143:invokevirtual   #150 <Method ResolveInfo ActivityChooserModel.getActivity(int)>
	//   71  146:astore          7
				submenu.add(0, j, j, resolveinfo1.loadLabel(packagemanager)).setIcon(resolveinfo1.loadIcon(packagemanager)).setOnMenuItemClickListener(((android.view.MenuItem.OnMenuItemClickListener) (mOnMenuItemClickListener)));
	//   72  148:aload_1         
	//   73  149:iconst_0        
	//   74  150:iload_2         
	//   75  151:iload_2         
	//   76  152:aload           7
	//   77  154:aload           6
	//   78  156:invokevirtual   #156 <Method CharSequence ResolveInfo.loadLabel(android.content.pm.PackageManager)>
	//   79  159:invokeinterface #160 <Method MenuItem SubMenu.add(int, int, int, CharSequence)>
	//   80  164:aload           7
	//   81  166:aload           6
	//   82  168:invokevirtual   #164 <Method android.graphics.drawable.Drawable ResolveInfo.loadIcon(android.content.pm.PackageManager)>
	//   83  171:invokeinterface #170 <Method MenuItem MenuItem.setIcon(android.graphics.drawable.Drawable)>
	//   84  176:aload_0         
	//   85  177:getfield        #34  <Field ShareActionProvider$ShareMenuItemOnMenuItemClickListener mOnMenuItemClickListener>
	//   86  180:invokeinterface #174 <Method MenuItem MenuItem.setOnMenuItemClickListener(android.view.MenuItem$OnMenuItemClickListener)>
	//   87  185:pop             
			}

	//   88  186:iload_2         
	//   89  187:iconst_1        
	//   90  188:iadd            
	//   91  189:istore_2        
		}
	//*  92  190:goto            135
	//   93  193:return          
	}

	public void setOnShareTargetSelectedListener(OnShareTargetSelectedListener onsharetargetselectedlistener)
	{
		mOnShareTargetSelectedListener = onsharetargetselectedlistener;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #43  <Field ShareActionProvider$OnShareTargetSelectedListener mOnShareTargetSelectedListener>
		setActivityChooserPolicyIfNeeded();
	//    3    5:aload_0         
	//    4    6:invokespecial   #189 <Method void setActivityChooserPolicyIfNeeded()>
	//    5    9:return          
	}

	public void setShareHistoryFileName(String s)
	{
		mShareHistoryFileName = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #36  <Field String mShareHistoryFileName>
		setActivityChooserPolicyIfNeeded();
	//    3    5:aload_0         
	//    4    6:invokespecial   #189 <Method void setActivityChooserPolicyIfNeeded()>
	//    5    9:return          
	}

	public void setShareIntent(Intent intent)
	{
		if(intent != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          32
		{
			String s = intent.getAction();
	//    2    4:aload_1         
	//    3    5:invokevirtual   #199 <Method String Intent.getAction()>
	//    4    8:astore_2        
			if("android.intent.action.SEND".equals(((Object) (s))) || "android.intent.action.SEND_MULTIPLE".equals(((Object) (s))))
	//*   5    9:ldc1            #201 <String "android.intent.action.SEND">
	//*   6   11:aload_2         
	//*   7   12:invokevirtual   #207 <Method boolean String.equals(Object)>
	//*   8   15:ifne            27
	//*   9   18:ldc1            #209 <String "android.intent.action.SEND_MULTIPLE">
	//*  10   20:aload_2         
	//*  11   21:invokevirtual   #207 <Method boolean String.equals(Object)>
	//*  12   24:ifeq            32
				updateIntent(intent);
	//   13   27:aload_0         
	//   14   28:aload_1         
	//   15   29:invokevirtual   #212 <Method void updateIntent(Intent)>
		}
		ActivityChooserModel.get(mContext, mShareHistoryFileName).setIntent(intent);
	//   16   32:aload_0         
	//   17   33:getfield        #38  <Field Context mContext>
	//   18   36:aload_0         
	//   19   37:getfield        #36  <Field String mShareHistoryFileName>
	//   20   40:invokestatic    #54  <Method ActivityChooserModel ActivityChooserModel.get(Context, String)>
	//   21   43:aload_1         
	//   22   44:invokevirtual   #215 <Method void ActivityChooserModel.setIntent(Intent)>
	//   23   47:return          
	}

	void updateIntent(Intent intent)
	{
		if(android.os.Build.VERSION.SDK_INT >= 21)
	//*   0    0:getstatic       #220 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          21
	//*   2    5:icmplt          16
		{
			intent.addFlags(0x8080000);
	//    3    8:aload_1         
	//    4    9:ldc1            #221 <Int 0x8080000>
	//    5   11:invokevirtual   #225 <Method Intent Intent.addFlags(int)>
	//    6   14:pop             
			return;
	//    7   15:return          
		} else
		{
			intent.addFlags(0x80000);
	//    8   16:aload_1         
	//    9   17:ldc1            #226 <Int 0x80000>
	//   10   19:invokevirtual   #225 <Method Intent Intent.addFlags(int)>
	//   11   22:pop             
			return;
	//   12   23:return          
		}
	}

	private static final int DEFAULT_INITIAL_ACTIVITY_COUNT = 4;
	public static final String DEFAULT_SHARE_HISTORY_FILE_NAME = "share_history.xml";
	final Context mContext;
	private int mMaxShownActivityCount;
	private ActivityChooserModel.OnChooseActivityListener mOnChooseActivityListener;
	private final ShareMenuItemOnMenuItemClickListener mOnMenuItemClickListener = new ShareMenuItemOnMenuItemClickListener();
	OnShareTargetSelectedListener mOnShareTargetSelectedListener;
	String mShareHistoryFileName;

	private class ShareMenuItemOnMenuItemClickListener
		implements android.view.MenuItem.OnMenuItemClickListener
	{

		public boolean onMenuItemClick(MenuItem menuitem)
		{
			menuitem = ((MenuItem) (ActivityChooserModel.get(mContext, mShareHistoryFileName).chooseActivity(menuitem.getItemId())));
		//    0    0:aload_0         
		//    1    1:getfield        #12  <Field ShareActionProvider this$0>
		//    2    4:getfield        #24  <Field Context ShareActionProvider.mContext>
		//    3    7:aload_0         
		//    4    8:getfield        #12  <Field ShareActionProvider this$0>
		//    5   11:getfield        #28  <Field String ShareActionProvider.mShareHistoryFileName>
		//    6   14:invokestatic    #34  <Method ActivityChooserModel ActivityChooserModel.get(Context, String)>
		//    7   17:aload_1         
		//    8   18:invokeinterface #40  <Method int MenuItem.getItemId()>
		//    9   23:invokevirtual   #44  <Method Intent ActivityChooserModel.chooseActivity(int)>
		//   10   26:astore_1        
			if(menuitem != null)
		//*  11   27:aload_1         
		//*  12   28:ifnull          73
			{
				String s = ((Intent) (menuitem)).getAction();
		//   13   31:aload_1         
		//   14   32:invokevirtual   #50  <Method String Intent.getAction()>
		//   15   35:astore_2        
				if("android.intent.action.SEND".equals(((Object) (s))) || "android.intent.action.SEND_MULTIPLE".equals(((Object) (s))))
		//*  16   36:ldc1            #52  <String "android.intent.action.SEND">
		//*  17   38:aload_2         
		//*  18   39:invokevirtual   #58  <Method boolean String.equals(Object)>
		//*  19   42:ifne            54
		//*  20   45:ldc1            #60  <String "android.intent.action.SEND_MULTIPLE">
		//*  21   47:aload_2         
		//*  22   48:invokevirtual   #58  <Method boolean String.equals(Object)>
		//*  23   51:ifeq            62
					updateIntent(((Intent) (menuitem)));
		//   24   54:aload_0         
		//   25   55:getfield        #12  <Field ShareActionProvider this$0>
		//   26   58:aload_1         
		//   27   59:invokevirtual   #64  <Method void ShareActionProvider.updateIntent(Intent)>
				mContext.startActivity(((Intent) (menuitem)));
		//   28   62:aload_0         
		//   29   63:getfield        #12  <Field ShareActionProvider this$0>
		//   30   66:getfield        #24  <Field Context ShareActionProvider.mContext>
		//   31   69:aload_1         
		//   32   70:invokevirtual   #69  <Method void Context.startActivity(Intent)>
			}
			return true;
		//   33   73:iconst_1        
		//   34   74:ireturn         
		}

		final ShareActionProvider this$0;

		ShareMenuItemOnMenuItemClickListener()
		{
			this$0 = ShareActionProvider.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #12  <Field ShareActionProvider this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #15  <Method void Object()>
		//    5    9:return          
		}
	}


	private class ShareActivityChooserModelPolicy
		implements ActivityChooserModel.OnChooseActivityListener
	{

		public boolean onChooseActivity(ActivityChooserModel activitychoosermodel, Intent intent)
		{
			if(mOnShareTargetSelectedListener != null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #12  <Field ShareActionProvider this$0>
		//*   2    4:getfield        #24  <Field ShareActionProvider$OnShareTargetSelectedListener ShareActionProvider.mOnShareTargetSelectedListener>
		//*   3    7:ifnull          28
				mOnShareTargetSelectedListener.onShareTargetSelected(ShareActionProvider.this, intent);
		//    4   10:aload_0         
		//    5   11:getfield        #12  <Field ShareActionProvider this$0>
		//    6   14:getfield        #24  <Field ShareActionProvider$OnShareTargetSelectedListener ShareActionProvider.mOnShareTargetSelectedListener>
		//    7   17:aload_0         
		//    8   18:getfield        #12  <Field ShareActionProvider this$0>
		//    9   21:aload_2         
		//   10   22:invokeinterface #30  <Method boolean ShareActionProvider$OnShareTargetSelectedListener.onShareTargetSelected(ShareActionProvider, Intent)>
		//   11   27:pop             
			return false;
		//   12   28:iconst_0        
		//   13   29:ireturn         
		}

		final ShareActionProvider this$0;

		ShareActivityChooserModelPolicy()
		{
			this$0 = ShareActionProvider.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #12  <Field ShareActionProvider this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #15  <Method void Object()>
		//    5    9:return          
		}

		private class OnShareTargetSelectedListener
		{

			public abstract boolean onShareTargetSelected(ShareActionProvider shareactionprovider, Intent intent);
		}

	}

}

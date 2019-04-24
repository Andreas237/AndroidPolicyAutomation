// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.support.v4.view.ActionProvider;
import android.support.v4.view.accessibility.AccessibilityNodeInfoCompat;
import android.support.v7.view.menu.ShowableListMenu;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.*;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.*;

// Referenced classes of package android.support.v7.widget:
//			LinearLayoutCompat, ListPopupWindow, ActivityChooserModel, TintTypedArray, 
//			ForwardingListener

public class ActivityChooserView extends ViewGroup
	implements ActivityChooserModel.ActivityChooserModelClient
{
	private class ActivityChooserViewAdapter extends BaseAdapter
	{

		public int getActivityCount()
		{
			return mDataModel.getActivityCount();
		//    0    0:aload_0         
		//    1    1:getfield        #41  <Field ActivityChooserModel mDataModel>
		//    2    4:invokevirtual   #45  <Method int ActivityChooserModel.getActivityCount()>
		//    3    7:ireturn         
		}

		public int getCount()
		{
			int j = mDataModel.getActivityCount();
		//    0    0:aload_0         
		//    1    1:getfield        #41  <Field ActivityChooserModel mDataModel>
		//    2    4:invokevirtual   #45  <Method int ActivityChooserModel.getActivityCount()>
		//    3    7:istore_2        
			int i = j;
		//    4    8:iload_2         
		//    5    9:istore_1        
			if(!mShowDefaultActivity)
		//*   6   10:aload_0         
		//*   7   11:getfield        #48  <Field boolean mShowDefaultActivity>
		//*   8   14:ifne            33
			{
				i = j;
		//    9   17:iload_2         
		//   10   18:istore_1        
				if(mDataModel.getDefaultActivity() != null)
		//*  11   19:aload_0         
		//*  12   20:getfield        #41  <Field ActivityChooserModel mDataModel>
		//*  13   23:invokevirtual   #52  <Method ResolveInfo ActivityChooserModel.getDefaultActivity()>
		//*  14   26:ifnull          33
					i = j - 1;
		//   15   29:iload_2         
		//   16   30:iconst_1        
		//   17   31:isub            
		//   18   32:istore_1        
			}
			j = Math.min(i, mMaxActivityCount);
		//   19   33:iload_1         
		//   20   34:aload_0         
		//   21   35:getfield        #36  <Field int mMaxActivityCount>
		//   22   38:invokestatic    #58  <Method int Math.min(int, int)>
		//   23   41:istore_2        
			i = j;
		//   24   42:iload_2         
		//   25   43:istore_1        
			if(mShowFooterView)
		//*  26   44:aload_0         
		//*  27   45:getfield        #60  <Field boolean mShowFooterView>
		//*  28   48:ifeq            55
				i = j + 1;
		//   29   51:iload_2         
		//   30   52:iconst_1        
		//   31   53:iadd            
		//   32   54:istore_1        
			return i;
		//   33   55:iload_1         
		//   34   56:ireturn         
		}

		public ActivityChooserModel getDataModel()
		{
			return mDataModel;
		//    0    0:aload_0         
		//    1    1:getfield        #41  <Field ActivityChooserModel mDataModel>
		//    2    4:areturn         
		}

		public ResolveInfo getDefaultActivity()
		{
			return mDataModel.getDefaultActivity();
		//    0    0:aload_0         
		//    1    1:getfield        #41  <Field ActivityChooserModel mDataModel>
		//    2    4:invokevirtual   #52  <Method ResolveInfo ActivityChooserModel.getDefaultActivity()>
		//    3    7:areturn         
		}

		public int getHistorySize()
		{
			return mDataModel.getHistorySize();
		//    0    0:aload_0         
		//    1    1:getfield        #41  <Field ActivityChooserModel mDataModel>
		//    2    4:invokevirtual   #65  <Method int ActivityChooserModel.getHistorySize()>
		//    3    7:ireturn         
		}

		public Object getItem(int i)
		{
			int j;
			switch(getItemViewType(i))
		//*   0    0:aload_0         
		//*   1    1:iload_1         
		//*   2    2:invokevirtual   #71  <Method int getItemViewType(int)>
			{
		//*   3    5:tableswitch     0 1: default 28
		//		               0 38
		//		               1 36
			default:
				throw new IllegalArgumentException();
		//    4   28:new             #73  <Class IllegalArgumentException>
		//    5   31:dup             
		//    6   32:invokespecial   #74  <Method void IllegalArgumentException()>
		//    7   35:athrow          

			case 1: // '\001'
				return ((Object) (null));
		//    8   36:aconst_null     
		//    9   37:areturn         

			case 0: // '\0'
				j = i;
		//   10   38:iload_1         
		//   11   39:istore_2        
				break;
			}
			if(!mShowDefaultActivity)
		//*  12   40:aload_0         
		//*  13   41:getfield        #48  <Field boolean mShowDefaultActivity>
		//*  14   44:ifne            63
			{
				j = i;
		//   15   47:iload_1         
		//   16   48:istore_2        
				if(mDataModel.getDefaultActivity() != null)
		//*  17   49:aload_0         
		//*  18   50:getfield        #41  <Field ActivityChooserModel mDataModel>
		//*  19   53:invokevirtual   #52  <Method ResolveInfo ActivityChooserModel.getDefaultActivity()>
		//*  20   56:ifnull          63
					j = i + 1;
		//   21   59:iload_1         
		//   22   60:iconst_1        
		//   23   61:iadd            
		//   24   62:istore_2        
			}
			return ((Object) (mDataModel.getActivity(j)));
		//   25   63:aload_0         
		//   26   64:getfield        #41  <Field ActivityChooserModel mDataModel>
		//   27   67:iload_2         
		//   28   68:invokevirtual   #78  <Method ResolveInfo ActivityChooserModel.getActivity(int)>
		//   29   71:areturn         
		}

		public long getItemId(int i)
		{
			return (long)i;
		//    0    0:iload_1         
		//    1    1:i2l             
		//    2    2:lreturn         
		}

		public int getItemViewType(int i)
		{
			return !mShowFooterView || i != getCount() - 1 ? 0 : 1;
		//    0    0:aload_0         
		//    1    1:getfield        #60  <Field boolean mShowFooterView>
		//    2    4:ifeq            19
		//    3    7:iload_1         
		//    4    8:aload_0         
		//    5    9:invokevirtual   #82  <Method int getCount()>
		//    6   12:iconst_1        
		//    7   13:isub            
		//    8   14:icmpne          19
		//    9   17:iconst_1        
		//   10   18:ireturn         
		//   11   19:iconst_0        
		//   12   20:ireturn         
		}

		public boolean getShowDefaultActivity()
		{
			return mShowDefaultActivity;
		//    0    0:aload_0         
		//    1    1:getfield        #48  <Field boolean mShowDefaultActivity>
		//    2    4:ireturn         
		}

		public View getView(int i, View view, ViewGroup viewgroup)
		{
			getItemViewType(i);
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:invokevirtual   #71  <Method int getItemViewType(int)>
			JVM INSTR tableswitch 0 1: default 28
		//		               0 107
		//		               1 36;
		//    3    5:tableswitch     0 1: default 28
		//		               0 107
		//		               1 36
			   goto _L1 _L2 _L3
_L1:
			throw new IllegalArgumentException();
		//    4   28:new             #73  <Class IllegalArgumentException>
		//    5   31:dup             
		//    6   32:invokespecial   #74  <Method void IllegalArgumentException()>
		//    7   35:athrow          
_L3:
			if(view == null) goto _L5; else goto _L4
		//    8   36:aload_2         
		//    9   37:ifnull          51
_L4:
			View view1 = view;
		//   10   40:aload_2         
		//   11   41:astore          4
			if(view.getId() == 1) goto _L6; else goto _L5
		//   12   43:aload_2         
		//   13   44:invokevirtual   #91  <Method int View.getId()>
		//   14   47:iconst_1        
		//   15   48:icmpeq          104
_L5:
			view1 = LayoutInflater.from(getContext()).inflate(android.support.v7.appcompat.R.layout.abc_activity_chooser_view_list_item, viewgroup, false);
		//   16   51:aload_0         
		//   17   52:getfield        #31  <Field ActivityChooserView this$0>
		//   18   55:invokevirtual   #95  <Method Context ActivityChooserView.getContext()>
		//   19   58:invokestatic    #101 <Method LayoutInflater LayoutInflater.from(Context)>
		//   20   61:getstatic       #106 <Field int android.support.v7.appcompat.R$layout.abc_activity_chooser_view_list_item>
		//   21   64:aload_3         
		//   22   65:iconst_0        
		//   23   66:invokevirtual   #110 <Method View LayoutInflater.inflate(int, ViewGroup, boolean)>
		//   24   69:astore          4
			view1.setId(1);
		//   25   71:aload           4
		//   26   73:iconst_1        
		//   27   74:invokevirtual   #114 <Method void View.setId(int)>
			((TextView)view1.findViewById(android.support.v7.appcompat.R.id.title)).setText(((CharSequence) (getContext().getString(android.support.v7.appcompat.R.string.abc_activity_chooser_view_see_all))));
		//   28   77:aload           4
		//   29   79:getstatic       #119 <Field int android.support.v7.appcompat.R$id.title>
		//   30   82:invokevirtual   #123 <Method View View.findViewById(int)>
		//   31   85:checkcast       #125 <Class TextView>
		//   32   88:aload_0         
		//   33   89:getfield        #31  <Field ActivityChooserView this$0>
		//   34   92:invokevirtual   #95  <Method Context ActivityChooserView.getContext()>
		//   35   95:getstatic       #130 <Field int android.support.v7.appcompat.R$string.abc_activity_chooser_view_see_all>
		//   36   98:invokevirtual   #136 <Method String Context.getString(int)>
		//   37  101:invokevirtual   #140 <Method void TextView.setText(CharSequence)>
_L6:
			return view1;
		//   38  104:aload           4
		//   39  106:areturn         
_L2:
			if(view == null) goto _L8; else goto _L7
		//   40  107:aload_2         
		//   41  108:ifnull          124
_L7:
			view1 = view;
		//   42  111:aload_2         
		//   43  112:astore          4
			if(view.getId() == android.support.v7.appcompat.R.id.list_item) goto _L9; else goto _L8
		//   44  114:aload_2         
		//   45  115:invokevirtual   #91  <Method int View.getId()>
		//   46  118:getstatic       #143 <Field int android.support.v7.appcompat.R$id.list_item>
		//   47  121:icmpeq          144
_L8:
			view1 = LayoutInflater.from(getContext()).inflate(android.support.v7.appcompat.R.layout.abc_activity_chooser_view_list_item, viewgroup, false);
		//   48  124:aload_0         
		//   49  125:getfield        #31  <Field ActivityChooserView this$0>
		//   50  128:invokevirtual   #95  <Method Context ActivityChooserView.getContext()>
		//   51  131:invokestatic    #101 <Method LayoutInflater LayoutInflater.from(Context)>
		//   52  134:getstatic       #106 <Field int android.support.v7.appcompat.R$layout.abc_activity_chooser_view_list_item>
		//   53  137:aload_3         
		//   54  138:iconst_0        
		//   55  139:invokevirtual   #110 <Method View LayoutInflater.inflate(int, ViewGroup, boolean)>
		//   56  142:astore          4
_L9:
			view = ((View) (getContext().getPackageManager()));
		//   57  144:aload_0         
		//   58  145:getfield        #31  <Field ActivityChooserView this$0>
		//   59  148:invokevirtual   #95  <Method Context ActivityChooserView.getContext()>
		//   60  151:invokevirtual   #147 <Method android.content.pm.PackageManager Context.getPackageManager()>
		//   61  154:astore_2        
			viewgroup = ((ViewGroup) ((ImageView)view1.findViewById(android.support.v7.appcompat.R.id.icon)));
		//   62  155:aload           4
		//   63  157:getstatic       #150 <Field int android.support.v7.appcompat.R$id.icon>
		//   64  160:invokevirtual   #123 <Method View View.findViewById(int)>
		//   65  163:checkcast       #152 <Class ImageView>
		//   66  166:astore_3        
			ResolveInfo resolveinfo = (ResolveInfo)getItem(i);
		//   67  167:aload_0         
		//   68  168:iload_1         
		//   69  169:invokevirtual   #154 <Method Object getItem(int)>
		//   70  172:checkcast       #156 <Class ResolveInfo>
		//   71  175:astore          5
			((ImageView) (viewgroup)).setImageDrawable(resolveinfo.loadIcon(((android.content.pm.PackageManager) (view))));
		//   72  177:aload_3         
		//   73  178:aload           5
		//   74  180:aload_2         
		//   75  181:invokevirtual   #160 <Method Drawable ResolveInfo.loadIcon(android.content.pm.PackageManager)>
		//   76  184:invokevirtual   #164 <Method void ImageView.setImageDrawable(Drawable)>
			((TextView)view1.findViewById(android.support.v7.appcompat.R.id.title)).setText(resolveinfo.loadLabel(((android.content.pm.PackageManager) (view))));
		//   77  187:aload           4
		//   78  189:getstatic       #119 <Field int android.support.v7.appcompat.R$id.title>
		//   79  192:invokevirtual   #123 <Method View View.findViewById(int)>
		//   80  195:checkcast       #125 <Class TextView>
		//   81  198:aload           5
		//   82  200:aload_2         
		//   83  201:invokevirtual   #168 <Method CharSequence ResolveInfo.loadLabel(android.content.pm.PackageManager)>
		//   84  204:invokevirtual   #140 <Method void TextView.setText(CharSequence)>
			if(mShowDefaultActivity && i == 0 && mHighlightDefaultActivity)
		//*  85  207:aload_0         
		//*  86  208:getfield        #48  <Field boolean mShowDefaultActivity>
		//*  87  211:ifeq            234
		//*  88  214:iload_1         
		//*  89  215:ifne            234
		//*  90  218:aload_0         
		//*  91  219:getfield        #170 <Field boolean mHighlightDefaultActivity>
		//*  92  222:ifeq            234
			{
				view1.setActivated(true);
		//   93  225:aload           4
		//   94  227:iconst_1        
		//   95  228:invokevirtual   #174 <Method void View.setActivated(boolean)>
				return view1;
		//   96  231:aload           4
		//   97  233:areturn         
			} else
			{
				view1.setActivated(false);
		//   98  234:aload           4
		//   99  236:iconst_0        
		//  100  237:invokevirtual   #174 <Method void View.setActivated(boolean)>
				return view1;
		//  101  240:aload           4
		//  102  242:areturn         
			}
		}

		public int getViewTypeCount()
		{
			return 3;
		//    0    0:iconst_3        
		//    1    1:ireturn         
		}

		public int measureContentWidth()
		{
			int i = 0;
		//    0    0:iconst_0        
		//    1    1:istore_1        
			int k = mMaxActivityCount;
		//    2    2:aload_0         
		//    3    3:getfield        #36  <Field int mMaxActivityCount>
		//    4    6:istore_3        
			mMaxActivityCount = 0x7fffffff;
		//    5    7:aload_0         
		//    6    8:ldc1            #18  <Int 0x7fffffff>
		//    7   10:putfield        #36  <Field int mMaxActivityCount>
			int l = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
		//    8   13:iconst_0        
		//    9   14:iconst_0        
		//   10   15:invokestatic    #181 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
		//   11   18:istore          4
			int i1 = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
		//   12   20:iconst_0        
		//   13   21:iconst_0        
		//   14   22:invokestatic    #181 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
		//   15   25:istore          5
			int j1 = getCount();
		//   16   27:aload_0         
		//   17   28:invokevirtual   #82  <Method int getCount()>
		//   18   31:istore          6
			View view = null;
		//   19   33:aconst_null     
		//   20   34:astore          7
			int j = 0;
		//   21   36:iconst_0        
		//   22   37:istore_2        
			for(; i < j1; i++)
		//*  23   38:iload_1         
		//*  24   39:iload           6
		//*  25   41:icmpge          80
			{
				view = getView(i, view, ((ViewGroup) (null)));
		//   26   44:aload_0         
		//   27   45:iload_1         
		//   28   46:aload           7
		//   29   48:aconst_null     
		//   30   49:invokevirtual   #183 <Method View getView(int, View, ViewGroup)>
		//   31   52:astore          7
				view.measure(l, i1);
		//   32   54:aload           7
		//   33   56:iload           4
		//   34   58:iload           5
		//   35   60:invokevirtual   #187 <Method void View.measure(int, int)>
				j = Math.max(j, view.getMeasuredWidth());
		//   36   63:iload_2         
		//   37   64:aload           7
		//   38   66:invokevirtual   #190 <Method int View.getMeasuredWidth()>
		//   39   69:invokestatic    #193 <Method int Math.max(int, int)>
		//   40   72:istore_2        
			}

		//   41   73:iload_1         
		//   42   74:iconst_1        
		//   43   75:iadd            
		//   44   76:istore_1        
		//*  45   77:goto            38
			mMaxActivityCount = k;
		//   46   80:aload_0         
		//   47   81:iload_3         
		//   48   82:putfield        #36  <Field int mMaxActivityCount>
			return j;
		//   49   85:iload_2         
		//   50   86:ireturn         
		}

		public void setDataModel(ActivityChooserModel activitychoosermodel)
		{
			ActivityChooserModel activitychoosermodel1 = mAdapter.getDataModel();
		//    0    0:aload_0         
		//    1    1:getfield        #31  <Field ActivityChooserView this$0>
		//    2    4:getfield        #199 <Field ActivityChooserView$ActivityChooserViewAdapter ActivityChooserView.mAdapter>
		//    3    7:invokevirtual   #201 <Method ActivityChooserModel getDataModel()>
		//    4   10:astore_2        
			if(activitychoosermodel1 != null && isShown())
		//*   5   11:aload_2         
		//*   6   12:ifnull          36
		//*   7   15:aload_0         
		//*   8   16:getfield        #31  <Field ActivityChooserView this$0>
		//*   9   19:invokevirtual   #204 <Method boolean ActivityChooserView.isShown()>
		//*  10   22:ifeq            36
				activitychoosermodel1.unregisterObserver(((Object) (mModelDataSetObserver)));
		//   11   25:aload_2         
		//   12   26:aload_0         
		//   13   27:getfield        #31  <Field ActivityChooserView this$0>
		//   14   30:getfield        #208 <Field DataSetObserver ActivityChooserView.mModelDataSetObserver>
		//   15   33:invokevirtual   #212 <Method void ActivityChooserModel.unregisterObserver(Object)>
			mDataModel = activitychoosermodel;
		//   16   36:aload_0         
		//   17   37:aload_1         
		//   18   38:putfield        #41  <Field ActivityChooserModel mDataModel>
			if(activitychoosermodel != null && isShown())
		//*  19   41:aload_1         
		//*  20   42:ifnull          66
		//*  21   45:aload_0         
		//*  22   46:getfield        #31  <Field ActivityChooserView this$0>
		//*  23   49:invokevirtual   #204 <Method boolean ActivityChooserView.isShown()>
		//*  24   52:ifeq            66
				activitychoosermodel.registerObserver(((Object) (mModelDataSetObserver)));
		//   25   55:aload_1         
		//   26   56:aload_0         
		//   27   57:getfield        #31  <Field ActivityChooserView this$0>
		//   28   60:getfield        #208 <Field DataSetObserver ActivityChooserView.mModelDataSetObserver>
		//   29   63:invokevirtual   #215 <Method void ActivityChooserModel.registerObserver(Object)>
			notifyDataSetChanged();
		//   30   66:aload_0         
		//   31   67:invokevirtual   #218 <Method void notifyDataSetChanged()>
		//   32   70:return          
		}

		public void setMaxActivityCount(int i)
		{
			if(mMaxActivityCount != i)
		//*   0    0:aload_0         
		//*   1    1:getfield        #36  <Field int mMaxActivityCount>
		//*   2    4:iload_1         
		//*   3    5:icmpeq          17
			{
				mMaxActivityCount = i;
		//    4    8:aload_0         
		//    5    9:iload_1         
		//    6   10:putfield        #36  <Field int mMaxActivityCount>
				notifyDataSetChanged();
		//    7   13:aload_0         
		//    8   14:invokevirtual   #218 <Method void notifyDataSetChanged()>
			}
		//    9   17:return          
		}

		public void setShowDefaultActivity(boolean flag, boolean flag1)
		{
			if(mShowDefaultActivity != flag || mHighlightDefaultActivity != flag1)
		//*   0    0:aload_0         
		//*   1    1:getfield        #48  <Field boolean mShowDefaultActivity>
		//*   2    4:iload_1         
		//*   3    5:icmpne          16
		//*   4    8:aload_0         
		//*   5    9:getfield        #170 <Field boolean mHighlightDefaultActivity>
		//*   6   12:iload_2         
		//*   7   13:icmpeq          30
			{
				mShowDefaultActivity = flag;
		//    8   16:aload_0         
		//    9   17:iload_1         
		//   10   18:putfield        #48  <Field boolean mShowDefaultActivity>
				mHighlightDefaultActivity = flag1;
		//   11   21:aload_0         
		//   12   22:iload_2         
		//   13   23:putfield        #170 <Field boolean mHighlightDefaultActivity>
				notifyDataSetChanged();
		//   14   26:aload_0         
		//   15   27:invokevirtual   #218 <Method void notifyDataSetChanged()>
			}
		//   16   30:return          
		}

		public void setShowFooterView(boolean flag)
		{
			if(mShowFooterView != flag)
		//*   0    0:aload_0         
		//*   1    1:getfield        #60  <Field boolean mShowFooterView>
		//*   2    4:iload_1         
		//*   3    5:icmpeq          17
			{
				mShowFooterView = flag;
		//    4    8:aload_0         
		//    5    9:iload_1         
		//    6   10:putfield        #60  <Field boolean mShowFooterView>
				notifyDataSetChanged();
		//    7   13:aload_0         
		//    8   14:invokevirtual   #218 <Method void notifyDataSetChanged()>
			}
		//    9   17:return          
		}

		private static final int ITEM_VIEW_TYPE_ACTIVITY = 0;
		private static final int ITEM_VIEW_TYPE_COUNT = 3;
		private static final int ITEM_VIEW_TYPE_FOOTER = 1;
		public static final int MAX_ACTIVITY_COUNT_DEFAULT = 4;
		public static final int MAX_ACTIVITY_COUNT_UNLIMITED = 0x7fffffff;
		private ActivityChooserModel mDataModel;
		private boolean mHighlightDefaultActivity;
		private int mMaxActivityCount;
		private boolean mShowDefaultActivity;
		private boolean mShowFooterView;
		final ActivityChooserView this$0;

		ActivityChooserViewAdapter()
		{
			this$0 = ActivityChooserView.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #31  <Field ActivityChooserView this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #34  <Method void BaseAdapter()>
			mMaxActivityCount = 4;
		//    5    9:aload_0         
		//    6   10:iconst_4        
		//    7   11:putfield        #36  <Field int mMaxActivityCount>
		//    8   14:return          
		}
	}

	private class Callbacks
		implements android.view.View.OnClickListener, android.view.View.OnLongClickListener, android.widget.AdapterView.OnItemClickListener, android.widget.PopupWindow.OnDismissListener
	{

		private void notifyOnDismissListener()
		{
			if(mOnDismissListener != null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #21  <Field ActivityChooserView this$0>
		//*   2    4:getfield        #30  <Field android.widget.PopupWindow$OnDismissListener ActivityChooserView.mOnDismissListener>
		//*   3    7:ifnull          22
				mOnDismissListener.onDismiss();
		//    4   10:aload_0         
		//    5   11:getfield        #21  <Field ActivityChooserView this$0>
		//    6   14:getfield        #30  <Field android.widget.PopupWindow$OnDismissListener ActivityChooserView.mOnDismissListener>
		//    7   17:invokeinterface #33  <Method void android.widget.PopupWindow$OnDismissListener.onDismiss()>
		//    8   22:return          
		}

		public void onClick(View view)
		{
			if(view == mDefaultActivityButton)
		//*   0    0:aload_1         
		//*   1    1:aload_0         
		//*   2    2:getfield        #21  <Field ActivityChooserView this$0>
		//*   3    5:getfield        #39  <Field FrameLayout ActivityChooserView.mDefaultActivityButton>
		//*   4    8:if_acmpne       83
			{
				dismissPopup();
		//    5   11:aload_0         
		//    6   12:getfield        #21  <Field ActivityChooserView this$0>
		//    7   15:invokevirtual   #43  <Method boolean ActivityChooserView.dismissPopup()>
		//    8   18:pop             
				view = ((View) (mAdapter.getDefaultActivity()));
		//    9   19:aload_0         
		//   10   20:getfield        #21  <Field ActivityChooserView this$0>
		//   11   23:getfield        #47  <Field ActivityChooserView$ActivityChooserViewAdapter ActivityChooserView.mAdapter>
		//   12   26:invokevirtual   #53  <Method ResolveInfo ActivityChooserView$ActivityChooserViewAdapter.getDefaultActivity()>
		//   13   29:astore_1        
				int i = mAdapter.getDataModel().getActivityIndex(((ResolveInfo) (view)));
		//   14   30:aload_0         
		//   15   31:getfield        #21  <Field ActivityChooserView this$0>
		//   16   34:getfield        #47  <Field ActivityChooserView$ActivityChooserViewAdapter ActivityChooserView.mAdapter>
		//   17   37:invokevirtual   #57  <Method ActivityChooserModel ActivityChooserView$ActivityChooserViewAdapter.getDataModel()>
		//   18   40:aload_1         
		//   19   41:invokevirtual   #63  <Method int ActivityChooserModel.getActivityIndex(ResolveInfo)>
		//   20   44:istore_2        
				view = ((View) (mAdapter.getDataModel().chooseActivity(i)));
		//   21   45:aload_0         
		//   22   46:getfield        #21  <Field ActivityChooserView this$0>
		//   23   49:getfield        #47  <Field ActivityChooserView$ActivityChooserViewAdapter ActivityChooserView.mAdapter>
		//   24   52:invokevirtual   #57  <Method ActivityChooserModel ActivityChooserView$ActivityChooserViewAdapter.getDataModel()>
		//   25   55:iload_2         
		//   26   56:invokevirtual   #67  <Method Intent ActivityChooserModel.chooseActivity(int)>
		//   27   59:astore_1        
				if(view != null)
		//*  28   60:aload_1         
		//*  29   61:ifnull          82
				{
					((Intent) (view)).addFlags(0x80000);
		//   30   64:aload_1         
		//   31   65:ldc1            #68  <Int 0x80000>
		//   32   67:invokevirtual   #73  <Method Intent Intent.addFlags(int)>
		//   33   70:pop             
					getContext().startActivity(((Intent) (view)));
		//   34   71:aload_0         
		//   35   72:getfield        #21  <Field ActivityChooserView this$0>
		//   36   75:invokevirtual   #77  <Method Context ActivityChooserView.getContext()>
		//   37   78:aload_1         
		//   38   79:invokevirtual   #83  <Method void Context.startActivity(Intent)>
				}
				return;
		//   39   82:return          
			}
			if(view == mExpandActivityOverflowButton)
		//*  40   83:aload_1         
		//*  41   84:aload_0         
		//*  42   85:getfield        #21  <Field ActivityChooserView this$0>
		//*  43   88:getfield        #86  <Field FrameLayout ActivityChooserView.mExpandActivityOverflowButton>
		//*  44   91:if_acmpne       117
			{
				mIsSelectingDefaultActivity = false;
		//   45   94:aload_0         
		//   46   95:getfield        #21  <Field ActivityChooserView this$0>
		//   47   98:iconst_0        
		//   48   99:putfield        #90  <Field boolean ActivityChooserView.mIsSelectingDefaultActivity>
				showPopupUnchecked(mInitialActivityCount);
		//   49  102:aload_0         
		//   50  103:getfield        #21  <Field ActivityChooserView this$0>
		//   51  106:aload_0         
		//   52  107:getfield        #21  <Field ActivityChooserView this$0>
		//   53  110:getfield        #94  <Field int ActivityChooserView.mInitialActivityCount>
		//   54  113:invokevirtual   #98  <Method void ActivityChooserView.showPopupUnchecked(int)>
				return;
		//   55  116:return          
			} else
			{
				throw new IllegalArgumentException();
		//   56  117:new             #100 <Class IllegalArgumentException>
		//   57  120:dup             
		//   58  121:invokespecial   #101 <Method void IllegalArgumentException()>
		//   59  124:athrow          
			}
		}

		public void onDismiss()
		{
			notifyOnDismissListener();
		//    0    0:aload_0         
		//    1    1:invokespecial   #103 <Method void notifyOnDismissListener()>
			if(mProvider != null)
		//*   2    4:aload_0         
		//*   3    5:getfield        #21  <Field ActivityChooserView this$0>
		//*   4    8:getfield        #107 <Field ActionProvider ActivityChooserView.mProvider>
		//*   5   11:ifnull          25
				mProvider.subUiVisibilityChanged(false);
		//    6   14:aload_0         
		//    7   15:getfield        #21  <Field ActivityChooserView this$0>
		//    8   18:getfield        #107 <Field ActionProvider ActivityChooserView.mProvider>
		//    9   21:iconst_0        
		//   10   22:invokevirtual   #113 <Method void ActionProvider.subUiVisibilityChanged(boolean)>
		//   11   25:return          
		}

		public void onItemClick(AdapterView adapterview, View view, int i, long l)
		{
			((ActivityChooserViewAdapter)adapterview.getAdapter()).getItemViewType(i);
		//    0    0:aload_1         
		//    1    1:invokevirtual   #121 <Method android.widget.Adapter AdapterView.getAdapter()>
		//    2    4:checkcast       #49  <Class ActivityChooserView$ActivityChooserViewAdapter>
		//    3    7:iload_3         
		//    4    8:invokevirtual   #125 <Method int ActivityChooserView$ActivityChooserViewAdapter.getItemViewType(int)>
			JVM INSTR tableswitch 0 1: default 32
		//		               0 50
		//		               1 40;
		//    5   11:tableswitch     0 1: default 32
		//		               0 50
		//		               1 40
			   goto _L1 _L2 _L3
_L1:
			throw new IllegalArgumentException();
		//    6   32:new             #100 <Class IllegalArgumentException>
		//    7   35:dup             
		//    8   36:invokespecial   #101 <Method void IllegalArgumentException()>
		//    9   39:athrow          
_L3:
			showPopupUnchecked(0x7fffffff);
		//   10   40:aload_0         
		//   11   41:getfield        #21  <Field ActivityChooserView this$0>
		//   12   44:ldc1            #126 <Int 0x7fffffff>
		//   13   46:invokevirtual   #98  <Method void ActivityChooserView.showPopupUnchecked(int)>
_L5:
			return;
		//   14   49:return          
_L2:
			dismissPopup();
		//   15   50:aload_0         
		//   16   51:getfield        #21  <Field ActivityChooserView this$0>
		//   17   54:invokevirtual   #43  <Method boolean ActivityChooserView.dismissPopup()>
		//   18   57:pop             
			if(!mIsSelectingDefaultActivity)
				break; /* Loop/switch isn't completed */
		//   19   58:aload_0         
		//   20   59:getfield        #21  <Field ActivityChooserView this$0>
		//   21   62:getfield        #90  <Field boolean ActivityChooserView.mIsSelectingDefaultActivity>
		//   22   65:ifeq            87
			if(i > 0)
		//*  23   68:iload_3         
		//*  24   69:ifle            49
			{
				mAdapter.getDataModel().setDefaultActivity(i);
		//   25   72:aload_0         
		//   26   73:getfield        #21  <Field ActivityChooserView this$0>
		//   27   76:getfield        #47  <Field ActivityChooserView$ActivityChooserViewAdapter ActivityChooserView.mAdapter>
		//   28   79:invokevirtual   #57  <Method ActivityChooserModel ActivityChooserView$ActivityChooserViewAdapter.getDataModel()>
		//   29   82:iload_3         
		//   30   83:invokevirtual   #129 <Method void ActivityChooserModel.setDefaultActivity(int)>
				return;
		//   31   86:return          
			}
			if(true) goto _L5; else goto _L4
_L4:
			if(!mAdapter.getShowDefaultActivity())
		//*  32   87:aload_0         
		//*  33   88:getfield        #21  <Field ActivityChooserView this$0>
		//*  34   91:getfield        #47  <Field ActivityChooserView$ActivityChooserViewAdapter ActivityChooserView.mAdapter>
		//*  35   94:invokevirtual   #132 <Method boolean ActivityChooserView$ActivityChooserViewAdapter.getShowDefaultActivity()>
		//*  36   97:ifeq            138
		//*  37  100:aload_0         
		//*  38  101:getfield        #21  <Field ActivityChooserView this$0>
		//*  39  104:getfield        #47  <Field ActivityChooserView$ActivityChooserViewAdapter ActivityChooserView.mAdapter>
		//*  40  107:invokevirtual   #57  <Method ActivityChooserModel ActivityChooserView$ActivityChooserViewAdapter.getDataModel()>
		//*  41  110:iload_3         
		//*  42  111:invokevirtual   #67  <Method Intent ActivityChooserModel.chooseActivity(int)>
		//*  43  114:astore_1        
		//*  44  115:aload_1         
		//*  45  116:ifnull          49
		//*  46  119:aload_1         
		//*  47  120:ldc1            #68  <Int 0x80000>
		//*  48  122:invokevirtual   #73  <Method Intent Intent.addFlags(int)>
		//*  49  125:pop             
		//*  50  126:aload_0         
		//*  51  127:getfield        #21  <Field ActivityChooserView this$0>
		//*  52  130:invokevirtual   #77  <Method Context ActivityChooserView.getContext()>
		//*  53  133:aload_1         
		//*  54  134:invokevirtual   #83  <Method void Context.startActivity(Intent)>
		//*  55  137:return          
				i++;
		//   56  138:iload_3         
		//   57  139:iconst_1        
		//   58  140:iadd            
		//   59  141:istore_3        
			adapterview = ((AdapterView) (mAdapter.getDataModel().chooseActivity(i)));
			if(adapterview != null)
			{
				((Intent) (adapterview)).addFlags(0x80000);
				getContext().startActivity(((Intent) (adapterview)));
				return;
			}
			if(true) goto _L5; else goto _L6
		//   60  142:goto            100
_L6:
		}

		public boolean onLongClick(View view)
		{
			if(view == mDefaultActivityButton)
		//*   0    0:aload_1         
		//*   1    1:aload_0         
		//*   2    2:getfield        #21  <Field ActivityChooserView this$0>
		//*   3    5:getfield        #39  <Field FrameLayout ActivityChooserView.mDefaultActivityButton>
		//*   4    8:if_acmpne       48
			{
				if(mAdapter.getCount() > 0)
		//*   5   11:aload_0         
		//*   6   12:getfield        #21  <Field ActivityChooserView this$0>
		//*   7   15:getfield        #47  <Field ActivityChooserView$ActivityChooserViewAdapter ActivityChooserView.mAdapter>
		//*   8   18:invokevirtual   #140 <Method int ActivityChooserView$ActivityChooserViewAdapter.getCount()>
		//*   9   21:ifle            46
				{
					mIsSelectingDefaultActivity = true;
		//   10   24:aload_0         
		//   11   25:getfield        #21  <Field ActivityChooserView this$0>
		//   12   28:iconst_1        
		//   13   29:putfield        #90  <Field boolean ActivityChooserView.mIsSelectingDefaultActivity>
					showPopupUnchecked(mInitialActivityCount);
		//   14   32:aload_0         
		//   15   33:getfield        #21  <Field ActivityChooserView this$0>
		//   16   36:aload_0         
		//   17   37:getfield        #21  <Field ActivityChooserView this$0>
		//   18   40:getfield        #94  <Field int ActivityChooserView.mInitialActivityCount>
		//   19   43:invokevirtual   #98  <Method void ActivityChooserView.showPopupUnchecked(int)>
				}
				return true;
		//   20   46:iconst_1        
		//   21   47:ireturn         
			} else
			{
				throw new IllegalArgumentException();
		//   22   48:new             #100 <Class IllegalArgumentException>
		//   23   51:dup             
		//   24   52:invokespecial   #101 <Method void IllegalArgumentException()>
		//   25   55:athrow          
			}
		}

		final ActivityChooserView this$0;

		Callbacks()
		{
			this$0 = ActivityChooserView.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #21  <Field ActivityChooserView this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #24  <Method void Object()>
		//    5    9:return          
		}
	}

	public static class InnerLayout extends LinearLayoutCompat
	{

		private static final int TINT_ATTRS[] = {
			0x10100d4
		};

		static 
		{
		//    0    0:iconst_1        
		//    1    1:newarray        int[]
		//    2    3:dup             
		//    3    4:iconst_0        
		//    4    5:ldc1            #16  <Int 0x10100d4>
		//    5    7:iastore         
		//    6    8:putstatic       #18  <Field int[] TINT_ATTRS>
		//*   7   11:return          
		}

		public InnerLayout(Context context, AttributeSet attributeset)
		{
			super(context, attributeset);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokespecial   #23  <Method void LinearLayoutCompat(Context, AttributeSet)>
			context = ((Context) (TintTypedArray.obtainStyledAttributes(context, attributeset, TINT_ATTRS)));
		//    4    6:aload_1         
		//    5    7:aload_2         
		//    6    8:getstatic       #18  <Field int[] TINT_ATTRS>
		//    7   11:invokestatic    #29  <Method TintTypedArray TintTypedArray.obtainStyledAttributes(Context, AttributeSet, int[])>
		//    8   14:astore_1        
			setBackgroundDrawable(((TintTypedArray) (context)).getDrawable(0));
		//    9   15:aload_0         
		//   10   16:aload_1         
		//   11   17:iconst_0        
		//   12   18:invokevirtual   #33  <Method Drawable TintTypedArray.getDrawable(int)>
		//   13   21:invokevirtual   #37  <Method void setBackgroundDrawable(Drawable)>
			((TintTypedArray) (context)).recycle();
		//   14   24:aload_1         
		//   15   25:invokevirtual   #40  <Method void TintTypedArray.recycle()>
		//   16   28:return          
		}
	}


	public ActivityChooserView(Context context)
	{
		this(context, ((AttributeSet) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:invokespecial   #69  <Method void ActivityChooserView(Context, AttributeSet)>
	//    4    6:return          
	}

	public ActivityChooserView(Context context, AttributeSet attributeset)
	{
		this(context, attributeset, 0);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iconst_0        
	//    4    4:invokespecial   #73  <Method void ActivityChooserView(Context, AttributeSet, int)>
	//    5    7:return          
	}

	public ActivityChooserView(Context context, AttributeSet attributeset, int i)
	{
		super(context, attributeset, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:invokespecial   #74  <Method void ViewGroup(Context, AttributeSet, int)>
		mModelDataSetObserver = ((DataSetObserver) (new DataSetObserver() {

			public void onChanged()
			{
				super.onChanged();
			//    0    0:aload_0         
			//    1    1:invokespecial   #19  <Method void DataSetObserver.onChanged()>
				mAdapter.notifyDataSetChanged();
			//    2    4:aload_0         
			//    3    5:getfield        #12  <Field ActivityChooserView this$0>
			//    4    8:getfield        #23  <Field ActivityChooserView$ActivityChooserViewAdapter ActivityChooserView.mAdapter>
			//    5   11:invokevirtual   #28  <Method void ActivityChooserView$ActivityChooserViewAdapter.notifyDataSetChanged()>
			//    6   14:return          
			}

			public void onInvalidated()
			{
				super.onInvalidated();
			//    0    0:aload_0         
			//    1    1:invokespecial   #31  <Method void DataSetObserver.onInvalidated()>
				mAdapter.notifyDataSetInvalidated();
			//    2    4:aload_0         
			//    3    5:getfield        #12  <Field ActivityChooserView this$0>
			//    4    8:getfield        #23  <Field ActivityChooserView$ActivityChooserViewAdapter ActivityChooserView.mAdapter>
			//    5   11:invokevirtual   #34  <Method void ActivityChooserView$ActivityChooserViewAdapter.notifyDataSetInvalidated()>
			//    6   14:return          
			}

			final ActivityChooserView this$0;

			
			{
				this$0 = ActivityChooserView.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #12  <Field ActivityChooserView this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #15  <Method void DataSetObserver()>
			//    5    9:return          
			}
		}
));
	//    5    7:aload_0         
	//    6    8:new             #8   <Class ActivityChooserView$1>
	//    7   11:dup             
	//    8   12:aload_0         
	//    9   13:invokespecial   #77  <Method void ActivityChooserView$1(ActivityChooserView)>
	//   10   16:putfield        #79  <Field DataSetObserver mModelDataSetObserver>
		mOnGlobalLayoutListener = new android.view.ViewTreeObserver.OnGlobalLayoutListener() {

			public void onGlobalLayout()
			{
				if(isShowingPopup())
			//*   0    0:aload_0         
			//*   1    1:getfield        #14  <Field ActivityChooserView this$0>
			//*   2    4:invokevirtual   #23  <Method boolean ActivityChooserView.isShowingPopup()>
			//*   3    7:ifeq            30
					if(!isShown())
			//*   4   10:aload_0         
			//*   5   11:getfield        #14  <Field ActivityChooserView this$0>
			//*   6   14:invokevirtual   #26  <Method boolean ActivityChooserView.isShown()>
			//*   7   17:ifne            31
					{
						getListPopupWindow().dismiss();
			//    8   20:aload_0         
			//    9   21:getfield        #14  <Field ActivityChooserView this$0>
			//   10   24:invokevirtual   #30  <Method ListPopupWindow ActivityChooserView.getListPopupWindow()>
			//   11   27:invokevirtual   #35  <Method void ListPopupWindow.dismiss()>
					} else
			//*  12   30:return          
					{
						getListPopupWindow().show();
			//   13   31:aload_0         
			//   14   32:getfield        #14  <Field ActivityChooserView this$0>
			//   15   35:invokevirtual   #30  <Method ListPopupWindow ActivityChooserView.getListPopupWindow()>
			//   16   38:invokevirtual   #38  <Method void ListPopupWindow.show()>
						if(mProvider != null)
			//*  17   41:aload_0         
			//*  18   42:getfield        #14  <Field ActivityChooserView this$0>
			//*  19   45:getfield        #42  <Field ActionProvider ActivityChooserView.mProvider>
			//*  20   48:ifnull          30
						{
							mProvider.subUiVisibilityChanged(true);
			//   21   51:aload_0         
			//   22   52:getfield        #14  <Field ActivityChooserView this$0>
			//   23   55:getfield        #42  <Field ActionProvider ActivityChooserView.mProvider>
			//   24   58:iconst_1        
			//   25   59:invokevirtual   #48  <Method void ActionProvider.subUiVisibilityChanged(boolean)>
							return;
			//   26   62:return          
						}
					}
			}

			final ActivityChooserView this$0;

			
			{
				this$0 = ActivityChooserView.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #14  <Field ActivityChooserView this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #17  <Method void Object()>
			//    5    9:return          
			}
		}
;
	//   11   19:aload_0         
	//   12   20:new             #10  <Class ActivityChooserView$2>
	//   13   23:dup             
	//   14   24:aload_0         
	//   15   25:invokespecial   #80  <Method void ActivityChooserView$2(ActivityChooserView)>
	//   16   28:putfield        #82  <Field android.view.ViewTreeObserver$OnGlobalLayoutListener mOnGlobalLayoutListener>
		mInitialActivityCount = 4;
	//   17   31:aload_0         
	//   18   32:iconst_4        
	//   19   33:putfield        #84  <Field int mInitialActivityCount>
		Object obj = ((Object) (context.obtainStyledAttributes(attributeset, android.support.v7.appcompat.R.styleable.ActivityChooserView, i, 0)));
	//   20   36:aload_1         
	//   21   37:aload_2         
	//   22   38:getstatic       #89  <Field int[] android.support.v7.appcompat.R$styleable.ActivityChooserView>
	//   23   41:iload_3         
	//   24   42:iconst_0        
	//   25   43:invokevirtual   #95  <Method TypedArray Context.obtainStyledAttributes(AttributeSet, int[], int, int)>
	//   26   46:astore          4
		mInitialActivityCount = ((TypedArray) (obj)).getInt(android.support.v7.appcompat.R.styleable.ActivityChooserView_initialActivityCount, 4);
	//   27   48:aload_0         
	//   28   49:aload           4
	//   29   51:getstatic       #98  <Field int android.support.v7.appcompat.R$styleable.ActivityChooserView_initialActivityCount>
	//   30   54:iconst_4        
	//   31   55:invokevirtual   #104 <Method int TypedArray.getInt(int, int)>
	//   32   58:putfield        #84  <Field int mInitialActivityCount>
		attributeset = ((AttributeSet) (((TypedArray) (obj)).getDrawable(android.support.v7.appcompat.R.styleable.ActivityChooserView_expandActivityOverflowButtonDrawable)));
	//   33   61:aload           4
	//   34   63:getstatic       #107 <Field int android.support.v7.appcompat.R$styleable.ActivityChooserView_expandActivityOverflowButtonDrawable>
	//   35   66:invokevirtual   #111 <Method Drawable TypedArray.getDrawable(int)>
	//   36   69:astore_2        
		((TypedArray) (obj)).recycle();
	//   37   70:aload           4
	//   38   72:invokevirtual   #115 <Method void TypedArray.recycle()>
		LayoutInflater.from(getContext()).inflate(android.support.v7.appcompat.R.layout.abc_activity_chooser_view, ((ViewGroup) (this)), true);
	//   39   75:aload_0         
	//   40   76:invokevirtual   #119 <Method Context getContext()>
	//   41   79:invokestatic    #125 <Method LayoutInflater LayoutInflater.from(Context)>
	//   42   82:getstatic       #130 <Field int android.support.v7.appcompat.R$layout.abc_activity_chooser_view>
	//   43   85:aload_0         
	//   44   86:iconst_1        
	//   45   87:invokevirtual   #134 <Method View LayoutInflater.inflate(int, ViewGroup, boolean)>
	//   46   90:pop             
		mCallbacks = new Callbacks();
	//   47   91:aload_0         
	//   48   92:new             #21  <Class ActivityChooserView$Callbacks>
	//   49   95:dup             
	//   50   96:aload_0         
	//   51   97:invokespecial   #135 <Method void ActivityChooserView$Callbacks(ActivityChooserView)>
	//   52  100:putfield        #137 <Field ActivityChooserView$Callbacks mCallbacks>
		mActivityChooserContent = (LinearLayoutCompat)findViewById(android.support.v7.appcompat.R.id.activity_chooser_view_content);
	//   53  103:aload_0         
	//   54  104:aload_0         
	//   55  105:getstatic       #142 <Field int android.support.v7.appcompat.R$id.activity_chooser_view_content>
	//   56  108:invokevirtual   #146 <Method View findViewById(int)>
	//   57  111:checkcast       #148 <Class LinearLayoutCompat>
	//   58  114:putfield        #150 <Field LinearLayoutCompat mActivityChooserContent>
		mActivityChooserContentBackground = mActivityChooserContent.getBackground();
	//   59  117:aload_0         
	//   60  118:aload_0         
	//   61  119:getfield        #150 <Field LinearLayoutCompat mActivityChooserContent>
	//   62  122:invokevirtual   #154 <Method Drawable LinearLayoutCompat.getBackground()>
	//   63  125:putfield        #156 <Field Drawable mActivityChooserContentBackground>
		mDefaultActivityButton = (FrameLayout)findViewById(android.support.v7.appcompat.R.id.default_activity_button);
	//   64  128:aload_0         
	//   65  129:aload_0         
	//   66  130:getstatic       #159 <Field int android.support.v7.appcompat.R$id.default_activity_button>
	//   67  133:invokevirtual   #146 <Method View findViewById(int)>
	//   68  136:checkcast       #161 <Class FrameLayout>
	//   69  139:putfield        #163 <Field FrameLayout mDefaultActivityButton>
		mDefaultActivityButton.setOnClickListener(((android.view.View.OnClickListener) (mCallbacks)));
	//   70  142:aload_0         
	//   71  143:getfield        #163 <Field FrameLayout mDefaultActivityButton>
	//   72  146:aload_0         
	//   73  147:getfield        #137 <Field ActivityChooserView$Callbacks mCallbacks>
	//   74  150:invokevirtual   #167 <Method void FrameLayout.setOnClickListener(android.view.View$OnClickListener)>
		mDefaultActivityButton.setOnLongClickListener(((android.view.View.OnLongClickListener) (mCallbacks)));
	//   75  153:aload_0         
	//   76  154:getfield        #163 <Field FrameLayout mDefaultActivityButton>
	//   77  157:aload_0         
	//   78  158:getfield        #137 <Field ActivityChooserView$Callbacks mCallbacks>
	//   79  161:invokevirtual   #171 <Method void FrameLayout.setOnLongClickListener(android.view.View$OnLongClickListener)>
		mDefaultActivityButtonImage = (ImageView)mDefaultActivityButton.findViewById(android.support.v7.appcompat.R.id.image);
	//   80  164:aload_0         
	//   81  165:aload_0         
	//   82  166:getfield        #163 <Field FrameLayout mDefaultActivityButton>
	//   83  169:getstatic       #174 <Field int android.support.v7.appcompat.R$id.image>
	//   84  172:invokevirtual   #175 <Method View FrameLayout.findViewById(int)>
	//   85  175:checkcast       #177 <Class ImageView>
	//   86  178:putfield        #179 <Field ImageView mDefaultActivityButtonImage>
		obj = ((Object) ((FrameLayout)findViewById(android.support.v7.appcompat.R.id.expand_activities_button)));
	//   87  181:aload_0         
	//   88  182:getstatic       #182 <Field int android.support.v7.appcompat.R$id.expand_activities_button>
	//   89  185:invokevirtual   #146 <Method View findViewById(int)>
	//   90  188:checkcast       #161 <Class FrameLayout>
	//   91  191:astore          4
		((FrameLayout) (obj)).setOnClickListener(((android.view.View.OnClickListener) (mCallbacks)));
	//   92  193:aload           4
	//   93  195:aload_0         
	//   94  196:getfield        #137 <Field ActivityChooserView$Callbacks mCallbacks>
	//   95  199:invokevirtual   #167 <Method void FrameLayout.setOnClickListener(android.view.View$OnClickListener)>
		((FrameLayout) (obj)).setAccessibilityDelegate(((android.view.View.AccessibilityDelegate) (new android.view.View.AccessibilityDelegate() {

			public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilitynodeinfo)
			{
				super.onInitializeAccessibilityNodeInfo(view, accessibilitynodeinfo);
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:aload_2         
			//    3    3:invokespecial   #22  <Method void android.view.View$AccessibilityDelegate.onInitializeAccessibilityNodeInfo(View, AccessibilityNodeInfo)>
				AccessibilityNodeInfoCompat.wrap(accessibilitynodeinfo).setCanOpenPopup(true);
			//    4    6:aload_2         
			//    5    7:invokestatic    #28  <Method AccessibilityNodeInfoCompat AccessibilityNodeInfoCompat.wrap(AccessibilityNodeInfo)>
			//    6   10:iconst_1        
			//    7   11:invokevirtual   #32  <Method void AccessibilityNodeInfoCompat.setCanOpenPopup(boolean)>
			//    8   14:return          
			}

			final ActivityChooserView this$0;

			
			{
				this$0 = ActivityChooserView.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #14  <Field ActivityChooserView this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #17  <Method void android.view.View$AccessibilityDelegate()>
			//    5    9:return          
			}
		}
)));
	//   96  202:aload           4
	//   97  204:new             #12  <Class ActivityChooserView$3>
	//   98  207:dup             
	//   99  208:aload_0         
	//  100  209:invokespecial   #183 <Method void ActivityChooserView$3(ActivityChooserView)>
	//  101  212:invokevirtual   #187 <Method void FrameLayout.setAccessibilityDelegate(android.view.View$AccessibilityDelegate)>
		((FrameLayout) (obj)).setOnTouchListener(((android.view.View.OnTouchListener) (new ForwardingListener(((View) (obj))) {

			public ShowableListMenu getPopup()
			{
				return ((ShowableListMenu) (getListPopupWindow()));
			//    0    0:aload_0         
			//    1    1:getfield        #14  <Field ActivityChooserView this$0>
			//    2    4:invokevirtual   #24  <Method ListPopupWindow ActivityChooserView.getListPopupWindow()>
			//    3    7:areturn         
			}

			protected boolean onForwardingStarted()
			{
				showPopup();
			//    0    0:aload_0         
			//    1    1:getfield        #14  <Field ActivityChooserView this$0>
			//    2    4:invokevirtual   #29  <Method boolean ActivityChooserView.showPopup()>
			//    3    7:pop             
				return true;
			//    4    8:iconst_1        
			//    5    9:ireturn         
			}

			protected boolean onForwardingStopped()
			{
				dismissPopup();
			//    0    0:aload_0         
			//    1    1:getfield        #14  <Field ActivityChooserView this$0>
			//    2    4:invokevirtual   #33  <Method boolean ActivityChooserView.dismissPopup()>
			//    3    7:pop             
				return true;
			//    4    8:iconst_1        
			//    5    9:ireturn         
			}

			final ActivityChooserView this$0;

			
			{
				this$0 = ActivityChooserView.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #14  <Field ActivityChooserView this$0>
				super(view);
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:invokespecial   #17  <Method void ForwardingListener(View)>
			//    6   10:return          
			}
		}
)));
	//  102  215:aload           4
	//  103  217:new             #14  <Class ActivityChooserView$4>
	//  104  220:dup             
	//  105  221:aload_0         
	//  106  222:aload           4
	//  107  224:invokespecial   #190 <Method void ActivityChooserView$4(ActivityChooserView, View)>
	//  108  227:invokevirtual   #194 <Method void FrameLayout.setOnTouchListener(android.view.View$OnTouchListener)>
		mExpandActivityOverflowButton = ((FrameLayout) (obj));
	//  109  230:aload_0         
	//  110  231:aload           4
	//  111  233:putfield        #196 <Field FrameLayout mExpandActivityOverflowButton>
		mExpandActivityOverflowButtonImage = (ImageView)((FrameLayout) (obj)).findViewById(android.support.v7.appcompat.R.id.image);
	//  112  236:aload_0         
	//  113  237:aload           4
	//  114  239:getstatic       #174 <Field int android.support.v7.appcompat.R$id.image>
	//  115  242:invokevirtual   #175 <Method View FrameLayout.findViewById(int)>
	//  116  245:checkcast       #177 <Class ImageView>
	//  117  248:putfield        #198 <Field ImageView mExpandActivityOverflowButtonImage>
		mExpandActivityOverflowButtonImage.setImageDrawable(((Drawable) (attributeset)));
	//  118  251:aload_0         
	//  119  252:getfield        #198 <Field ImageView mExpandActivityOverflowButtonImage>
	//  120  255:aload_2         
	//  121  256:invokevirtual   #202 <Method void ImageView.setImageDrawable(Drawable)>
		mAdapter = new ActivityChooserViewAdapter();
	//  122  259:aload_0         
	//  123  260:new             #18  <Class ActivityChooserView$ActivityChooserViewAdapter>
	//  124  263:dup             
	//  125  264:aload_0         
	//  126  265:invokespecial   #203 <Method void ActivityChooserView$ActivityChooserViewAdapter(ActivityChooserView)>
	//  127  268:putfield        #205 <Field ActivityChooserView$ActivityChooserViewAdapter mAdapter>
		mAdapter.registerDataSetObserver(((DataSetObserver) (new DataSetObserver() {

			public void onChanged()
			{
				super.onChanged();
			//    0    0:aload_0         
			//    1    1:invokespecial   #21  <Method void DataSetObserver.onChanged()>
				updateAppearance();
			//    2    4:aload_0         
			//    3    5:getfield        #14  <Field ActivityChooserView this$0>
			//    4    8:invokevirtual   #24  <Method void ActivityChooserView.updateAppearance()>
			//    5   11:return          
			}

			final ActivityChooserView this$0;

			
			{
				this$0 = ActivityChooserView.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #14  <Field ActivityChooserView this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #17  <Method void DataSetObserver()>
			//    5    9:return          
			}
		}
)));
	//  128  271:aload_0         
	//  129  272:getfield        #205 <Field ActivityChooserView$ActivityChooserViewAdapter mAdapter>
	//  130  275:new             #16  <Class ActivityChooserView$5>
	//  131  278:dup             
	//  132  279:aload_0         
	//  133  280:invokespecial   #206 <Method void ActivityChooserView$5(ActivityChooserView)>
	//  134  283:invokevirtual   #210 <Method void ActivityChooserView$ActivityChooserViewAdapter.registerDataSetObserver(DataSetObserver)>
		context = ((Context) (context.getResources()));
	//  135  286:aload_1         
	//  136  287:invokevirtual   #214 <Method Resources Context.getResources()>
	//  137  290:astore_1        
		mListPopupMaxWidth = Math.max(((Resources) (context)).getDisplayMetrics().widthPixels / 2, ((Resources) (context)).getDimensionPixelSize(android.support.v7.appcompat.R.dimen.abc_config_prefDialogWidth));
	//  138  291:aload_0         
	//  139  292:aload_1         
	//  140  293:invokevirtual   #220 <Method DisplayMetrics Resources.getDisplayMetrics()>
	//  141  296:getfield        #225 <Field int DisplayMetrics.widthPixels>
	//  142  299:iconst_2        
	//  143  300:idiv            
	//  144  301:aload_1         
	//  145  302:getstatic       #230 <Field int android.support.v7.appcompat.R$dimen.abc_config_prefDialogWidth>
	//  146  305:invokevirtual   #234 <Method int Resources.getDimensionPixelSize(int)>
	//  147  308:invokestatic    #239 <Method int Math.max(int, int)>
	//  148  311:putfield        #241 <Field int mListPopupMaxWidth>
	//  149  314:return          
	}

	public boolean dismissPopup()
	{
		if(isShowingPopup())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #246 <Method boolean isShowingPopup()>
	//*   2    4:ifeq            34
		{
			getListPopupWindow().dismiss();
	//    3    7:aload_0         
	//    4    8:invokevirtual   #250 <Method ListPopupWindow getListPopupWindow()>
	//    5   11:invokevirtual   #255 <Method void ListPopupWindow.dismiss()>
			ViewTreeObserver viewtreeobserver = getViewTreeObserver();
	//    6   14:aload_0         
	//    7   15:invokevirtual   #259 <Method ViewTreeObserver getViewTreeObserver()>
	//    8   18:astore_1        
			if(viewtreeobserver.isAlive())
	//*   9   19:aload_1         
	//*  10   20:invokevirtual   #264 <Method boolean ViewTreeObserver.isAlive()>
	//*  11   23:ifeq            34
				viewtreeobserver.removeGlobalOnLayoutListener(mOnGlobalLayoutListener);
	//   12   26:aload_1         
	//   13   27:aload_0         
	//   14   28:getfield        #82  <Field android.view.ViewTreeObserver$OnGlobalLayoutListener mOnGlobalLayoutListener>
	//   15   31:invokevirtual   #268 <Method void ViewTreeObserver.removeGlobalOnLayoutListener(android.view.ViewTreeObserver$OnGlobalLayoutListener)>
		}
		return true;
	//   16   34:iconst_1        
	//   17   35:ireturn         
	}

	public ActivityChooserModel getDataModel()
	{
		return mAdapter.getDataModel();
	//    0    0:aload_0         
	//    1    1:getfield        #205 <Field ActivityChooserView$ActivityChooserViewAdapter mAdapter>
	//    2    4:invokevirtual   #272 <Method ActivityChooserModel ActivityChooserView$ActivityChooserViewAdapter.getDataModel()>
	//    3    7:areturn         
	}

	ListPopupWindow getListPopupWindow()
	{
		if(mListPopupWindow == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #274 <Field ListPopupWindow mListPopupWindow>
	//*   2    4:ifnonnull       71
		{
			mListPopupWindow = new ListPopupWindow(getContext());
	//    3    7:aload_0         
	//    4    8:new             #252 <Class ListPopupWindow>
	//    5   11:dup             
	//    6   12:aload_0         
	//    7   13:invokevirtual   #119 <Method Context getContext()>
	//    8   16:invokespecial   #276 <Method void ListPopupWindow(Context)>
	//    9   19:putfield        #274 <Field ListPopupWindow mListPopupWindow>
			mListPopupWindow.setAdapter(((android.widget.ListAdapter) (mAdapter)));
	//   10   22:aload_0         
	//   11   23:getfield        #274 <Field ListPopupWindow mListPopupWindow>
	//   12   26:aload_0         
	//   13   27:getfield        #205 <Field ActivityChooserView$ActivityChooserViewAdapter mAdapter>
	//   14   30:invokevirtual   #280 <Method void ListPopupWindow.setAdapter(android.widget.ListAdapter)>
			mListPopupWindow.setAnchorView(((View) (this)));
	//   15   33:aload_0         
	//   16   34:getfield        #274 <Field ListPopupWindow mListPopupWindow>
	//   17   37:aload_0         
	//   18   38:invokevirtual   #284 <Method void ListPopupWindow.setAnchorView(View)>
			mListPopupWindow.setModal(true);
	//   19   41:aload_0         
	//   20   42:getfield        #274 <Field ListPopupWindow mListPopupWindow>
	//   21   45:iconst_1        
	//   22   46:invokevirtual   #288 <Method void ListPopupWindow.setModal(boolean)>
			mListPopupWindow.setOnItemClickListener(((android.widget.AdapterView.OnItemClickListener) (mCallbacks)));
	//   23   49:aload_0         
	//   24   50:getfield        #274 <Field ListPopupWindow mListPopupWindow>
	//   25   53:aload_0         
	//   26   54:getfield        #137 <Field ActivityChooserView$Callbacks mCallbacks>
	//   27   57:invokevirtual   #292 <Method void ListPopupWindow.setOnItemClickListener(android.widget.AdapterView$OnItemClickListener)>
			mListPopupWindow.setOnDismissListener(((android.widget.PopupWindow.OnDismissListener) (mCallbacks)));
	//   28   60:aload_0         
	//   29   61:getfield        #274 <Field ListPopupWindow mListPopupWindow>
	//   30   64:aload_0         
	//   31   65:getfield        #137 <Field ActivityChooserView$Callbacks mCallbacks>
	//   32   68:invokevirtual   #296 <Method void ListPopupWindow.setOnDismissListener(android.widget.PopupWindow$OnDismissListener)>
		}
		return mListPopupWindow;
	//   33   71:aload_0         
	//   34   72:getfield        #274 <Field ListPopupWindow mListPopupWindow>
	//   35   75:areturn         
	}

	public boolean isShowingPopup()
	{
		return getListPopupWindow().isShowing();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #250 <Method ListPopupWindow getListPopupWindow()>
	//    2    4:invokevirtual   #299 <Method boolean ListPopupWindow.isShowing()>
	//    3    7:ireturn         
	}

	protected void onAttachedToWindow()
	{
		super.onAttachedToWindow();
	//    0    0:aload_0         
	//    1    1:invokespecial   #302 <Method void ViewGroup.onAttachedToWindow()>
		ActivityChooserModel activitychoosermodel = mAdapter.getDataModel();
	//    2    4:aload_0         
	//    3    5:getfield        #205 <Field ActivityChooserView$ActivityChooserViewAdapter mAdapter>
	//    4    8:invokevirtual   #272 <Method ActivityChooserModel ActivityChooserView$ActivityChooserViewAdapter.getDataModel()>
	//    5   11:astore_1        
		if(activitychoosermodel != null)
	//*   6   12:aload_1         
	//*   7   13:ifnull          24
			activitychoosermodel.registerObserver(((Object) (mModelDataSetObserver)));
	//    8   16:aload_1         
	//    9   17:aload_0         
	//   10   18:getfield        #79  <Field DataSetObserver mModelDataSetObserver>
	//   11   21:invokevirtual   #308 <Method void ActivityChooserModel.registerObserver(Object)>
		mIsAttachedToWindow = true;
	//   12   24:aload_0         
	//   13   25:iconst_1        
	//   14   26:putfield        #310 <Field boolean mIsAttachedToWindow>
	//   15   29:return          
	}

	protected void onDetachedFromWindow()
	{
		super.onDetachedFromWindow();
	//    0    0:aload_0         
	//    1    1:invokespecial   #313 <Method void ViewGroup.onDetachedFromWindow()>
		Object obj = ((Object) (mAdapter.getDataModel()));
	//    2    4:aload_0         
	//    3    5:getfield        #205 <Field ActivityChooserView$ActivityChooserViewAdapter mAdapter>
	//    4    8:invokevirtual   #272 <Method ActivityChooserModel ActivityChooserView$ActivityChooserViewAdapter.getDataModel()>
	//    5   11:astore_1        
		if(obj != null)
	//*   6   12:aload_1         
	//*   7   13:ifnull          24
			((ActivityChooserModel) (obj)).unregisterObserver(((Object) (mModelDataSetObserver)));
	//    8   16:aload_1         
	//    9   17:aload_0         
	//   10   18:getfield        #79  <Field DataSetObserver mModelDataSetObserver>
	//   11   21:invokevirtual   #316 <Method void ActivityChooserModel.unregisterObserver(Object)>
		obj = ((Object) (getViewTreeObserver()));
	//   12   24:aload_0         
	//   13   25:invokevirtual   #259 <Method ViewTreeObserver getViewTreeObserver()>
	//   14   28:astore_1        
		if(((ViewTreeObserver) (obj)).isAlive())
	//*  15   29:aload_1         
	//*  16   30:invokevirtual   #264 <Method boolean ViewTreeObserver.isAlive()>
	//*  17   33:ifeq            44
			((ViewTreeObserver) (obj)).removeGlobalOnLayoutListener(mOnGlobalLayoutListener);
	//   18   36:aload_1         
	//   19   37:aload_0         
	//   20   38:getfield        #82  <Field android.view.ViewTreeObserver$OnGlobalLayoutListener mOnGlobalLayoutListener>
	//   21   41:invokevirtual   #268 <Method void ViewTreeObserver.removeGlobalOnLayoutListener(android.view.ViewTreeObserver$OnGlobalLayoutListener)>
		if(isShowingPopup())
	//*  22   44:aload_0         
	//*  23   45:invokevirtual   #246 <Method boolean isShowingPopup()>
	//*  24   48:ifeq            56
			dismissPopup();
	//   25   51:aload_0         
	//   26   52:invokevirtual   #318 <Method boolean dismissPopup()>
	//   27   55:pop             
		mIsAttachedToWindow = false;
	//   28   56:aload_0         
	//   29   57:iconst_0        
	//   30   58:putfield        #310 <Field boolean mIsAttachedToWindow>
	//   31   61:return          
	}

	protected void onLayout(boolean flag, int i, int j, int k, int l)
	{
		mActivityChooserContent.layout(0, 0, k - i, l - j);
	//    0    0:aload_0         
	//    1    1:getfield        #150 <Field LinearLayoutCompat mActivityChooserContent>
	//    2    4:iconst_0        
	//    3    5:iconst_0        
	//    4    6:iload           4
	//    5    8:iload_2         
	//    6    9:isub            
	//    7   10:iload           5
	//    8   12:iload_3         
	//    9   13:isub            
	//   10   14:invokevirtual   #324 <Method void LinearLayoutCompat.layout(int, int, int, int)>
		if(!isShowingPopup())
	//*  11   17:aload_0         
	//*  12   18:invokevirtual   #246 <Method boolean isShowingPopup()>
	//*  13   21:ifne            29
			dismissPopup();
	//   14   24:aload_0         
	//   15   25:invokevirtual   #318 <Method boolean dismissPopup()>
	//   16   28:pop             
	//   17   29:return          
	}

	protected void onMeasure(int i, int j)
	{
		LinearLayoutCompat linearlayoutcompat = mActivityChooserContent;
	//    0    0:aload_0         
	//    1    1:getfield        #150 <Field LinearLayoutCompat mActivityChooserContent>
	//    2    4:astore          4
		int k = j;
	//    3    6:iload_2         
	//    4    7:istore_3        
		if(mDefaultActivityButton.getVisibility() != 0)
	//*   5    8:aload_0         
	//*   6    9:getfield        #163 <Field FrameLayout mDefaultActivityButton>
	//*   7   12:invokevirtual   #330 <Method int FrameLayout.getVisibility()>
	//*   8   15:ifeq            29
			k = android.view.View.MeasureSpec.makeMeasureSpec(android.view.View.MeasureSpec.getSize(j), 0x40000000);
	//    9   18:iload_2         
	//   10   19:invokestatic    #335 <Method int android.view.View$MeasureSpec.getSize(int)>
	//   11   22:ldc2            #336 <Int 0x40000000>
	//   12   25:invokestatic    #339 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//   13   28:istore_3        
		measureChild(((View) (linearlayoutcompat)), i, k);
	//   14   29:aload_0         
	//   15   30:aload           4
	//   16   32:iload_1         
	//   17   33:iload_3         
	//   18   34:invokevirtual   #343 <Method void measureChild(View, int, int)>
		setMeasuredDimension(((View) (linearlayoutcompat)).getMeasuredWidth(), ((View) (linearlayoutcompat)).getMeasuredHeight());
	//   19   37:aload_0         
	//   20   38:aload           4
	//   21   40:invokevirtual   #348 <Method int View.getMeasuredWidth()>
	//   22   43:aload           4
	//   23   45:invokevirtual   #351 <Method int View.getMeasuredHeight()>
	//   24   48:invokevirtual   #354 <Method void setMeasuredDimension(int, int)>
	//   25   51:return          
	}

	public void setActivityChooserModel(ActivityChooserModel activitychoosermodel)
	{
		mAdapter.setDataModel(activitychoosermodel);
	//    0    0:aload_0         
	//    1    1:getfield        #205 <Field ActivityChooserView$ActivityChooserViewAdapter mAdapter>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #359 <Method void ActivityChooserView$ActivityChooserViewAdapter.setDataModel(ActivityChooserModel)>
		if(isShowingPopup())
	//*   4    8:aload_0         
	//*   5    9:invokevirtual   #246 <Method boolean isShowingPopup()>
	//*   6   12:ifeq            25
		{
			dismissPopup();
	//    7   15:aload_0         
	//    8   16:invokevirtual   #318 <Method boolean dismissPopup()>
	//    9   19:pop             
			showPopup();
	//   10   20:aload_0         
	//   11   21:invokevirtual   #362 <Method boolean showPopup()>
	//   12   24:pop             
		}
	//   13   25:return          
	}

	public void setDefaultActionButtonContentDescription(int i)
	{
		mDefaultActionButtonContentDescription = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #366 <Field int mDefaultActionButtonContentDescription>
	//    3    5:return          
	}

	public void setExpandActivityOverflowButtonContentDescription(int i)
	{
		String s = getContext().getString(i);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #119 <Method Context getContext()>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #371 <Method String Context.getString(int)>
	//    4    8:astore_2        
		mExpandActivityOverflowButtonImage.setContentDescription(((CharSequence) (s)));
	//    5    9:aload_0         
	//    6   10:getfield        #198 <Field ImageView mExpandActivityOverflowButtonImage>
	//    7   13:aload_2         
	//    8   14:invokevirtual   #375 <Method void ImageView.setContentDescription(CharSequence)>
	//    9   17:return          
	}

	public void setExpandActivityOverflowButtonDrawable(Drawable drawable)
	{
		mExpandActivityOverflowButtonImage.setImageDrawable(drawable);
	//    0    0:aload_0         
	//    1    1:getfield        #198 <Field ImageView mExpandActivityOverflowButtonImage>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #202 <Method void ImageView.setImageDrawable(Drawable)>
	//    4    8:return          
	}

	public void setInitialActivityCount(int i)
	{
		mInitialActivityCount = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #84  <Field int mInitialActivityCount>
	//    3    5:return          
	}

	public void setOnDismissListener(android.widget.PopupWindow.OnDismissListener ondismisslistener)
	{
		mOnDismissListener = ondismisslistener;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #379 <Field android.widget.PopupWindow$OnDismissListener mOnDismissListener>
	//    3    5:return          
	}

	public void setProvider(ActionProvider actionprovider)
	{
		mProvider = actionprovider;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #383 <Field ActionProvider mProvider>
	//    3    5:return          
	}

	public boolean showPopup()
	{
		if(isShowingPopup() || !mIsAttachedToWindow)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #246 <Method boolean isShowingPopup()>
	//*   2    4:ifne            14
	//*   3    7:aload_0         
	//*   4    8:getfield        #310 <Field boolean mIsAttachedToWindow>
	//*   5   11:ifne            16
		{
			return false;
	//    6   14:iconst_0        
	//    7   15:ireturn         
		} else
		{
			mIsSelectingDefaultActivity = false;
	//    8   16:aload_0         
	//    9   17:iconst_0        
	//   10   18:putfield        #386 <Field boolean mIsSelectingDefaultActivity>
			showPopupUnchecked(mInitialActivityCount);
	//   11   21:aload_0         
	//   12   22:aload_0         
	//   13   23:getfield        #84  <Field int mInitialActivityCount>
	//   14   26:invokevirtual   #389 <Method void showPopupUnchecked(int)>
			return true;
	//   15   29:iconst_1        
	//   16   30:ireturn         
		}
	}

	void showPopupUnchecked(int i)
	{
		if(mAdapter.getDataModel() == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #205 <Field ActivityChooserView$ActivityChooserViewAdapter mAdapter>
	//*   2    4:invokevirtual   #272 <Method ActivityChooserModel ActivityChooserView$ActivityChooserViewAdapter.getDataModel()>
	//*   3    7:ifnonnull       21
			throw new IllegalStateException("No data model. Did you call #setDataModel?");
	//    4   10:new             #391 <Class IllegalStateException>
	//    5   13:dup             
	//    6   14:ldc2            #393 <String "No data model. Did you call #setDataModel?">
	//    7   17:invokespecial   #396 <Method void IllegalStateException(String)>
	//    8   20:athrow          
		getViewTreeObserver().addOnGlobalLayoutListener(mOnGlobalLayoutListener);
	//    9   21:aload_0         
	//   10   22:invokevirtual   #259 <Method ViewTreeObserver getViewTreeObserver()>
	//   11   25:aload_0         
	//   12   26:getfield        #82  <Field android.view.ViewTreeObserver$OnGlobalLayoutListener mOnGlobalLayoutListener>
	//   13   29:invokevirtual   #399 <Method void ViewTreeObserver.addOnGlobalLayoutListener(android.view.ViewTreeObserver$OnGlobalLayoutListener)>
		int j;
		int k;
		boolean flag;
		ListPopupWindow listpopupwindow;
		if(mDefaultActivityButton.getVisibility() == 0)
	//*  14   32:aload_0         
	//*  15   33:getfield        #163 <Field FrameLayout mDefaultActivityButton>
	//*  16   36:invokevirtual   #330 <Method int FrameLayout.getVisibility()>
	//*  17   39:ifne            202
			flag = true;
	//   18   42:iconst_1        
	//   19   43:istore          4
		else
	//*  20   45:aload_0         
	//*  21   46:getfield        #205 <Field ActivityChooserView$ActivityChooserViewAdapter mAdapter>
	//*  22   49:invokevirtual   #402 <Method int ActivityChooserView$ActivityChooserViewAdapter.getActivityCount()>
	//*  23   52:istore_3        
	//*  24   53:iload           4
	//*  25   55:ifeq            208
	//*  26   58:iconst_1        
	//*  27   59:istore_2        
	//*  28   60:iload_1         
	//*  29   61:ldc2            #403 <Int 0x7fffffff>
	//*  30   64:icmpeq          213
	//*  31   67:iload_3         
	//*  32   68:iload_2         
	//*  33   69:iload_1         
	//*  34   70:iadd            
	//*  35   71:icmple          213
	//*  36   74:aload_0         
	//*  37   75:getfield        #205 <Field ActivityChooserView$ActivityChooserViewAdapter mAdapter>
	//*  38   78:iconst_1        
	//*  39   79:invokevirtual   #406 <Method void ActivityChooserView$ActivityChooserViewAdapter.setShowFooterView(boolean)>
	//*  40   82:aload_0         
	//*  41   83:getfield        #205 <Field ActivityChooserView$ActivityChooserViewAdapter mAdapter>
	//*  42   86:iload_1         
	//*  43   87:iconst_1        
	//*  44   88:isub            
	//*  45   89:invokevirtual   #409 <Method void ActivityChooserView$ActivityChooserViewAdapter.setMaxActivityCount(int)>
	//*  46   92:aload_0         
	//*  47   93:invokevirtual   #250 <Method ListPopupWindow getListPopupWindow()>
	//*  48   96:astore          5
	//*  49   98:aload           5
	//*  50  100:invokevirtual   #299 <Method boolean ListPopupWindow.isShowing()>
	//*  51  103:ifne            201
	//*  52  106:aload_0         
	//*  53  107:getfield        #386 <Field boolean mIsSelectingDefaultActivity>
	//*  54  110:ifne            118
	//*  55  113:iload           4
	//*  56  115:ifne            232
	//*  57  118:aload_0         
	//*  58  119:getfield        #205 <Field ActivityChooserView$ActivityChooserViewAdapter mAdapter>
	//*  59  122:iconst_1        
	//*  60  123:iload           4
	//*  61  125:invokevirtual   #413 <Method void ActivityChooserView$ActivityChooserViewAdapter.setShowDefaultActivity(boolean, boolean)>
	//*  62  128:aload           5
	//*  63  130:aload_0         
	//*  64  131:getfield        #205 <Field ActivityChooserView$ActivityChooserViewAdapter mAdapter>
	//*  65  134:invokevirtual   #416 <Method int ActivityChooserView$ActivityChooserViewAdapter.measureContentWidth()>
	//*  66  137:aload_0         
	//*  67  138:getfield        #241 <Field int mListPopupMaxWidth>
	//*  68  141:invokestatic    #419 <Method int Math.min(int, int)>
	//*  69  144:invokevirtual   #422 <Method void ListPopupWindow.setContentWidth(int)>
	//*  70  147:aload           5
	//*  71  149:invokevirtual   #425 <Method void ListPopupWindow.show()>
	//*  72  152:aload_0         
	//*  73  153:getfield        #383 <Field ActionProvider mProvider>
	//*  74  156:ifnull          167
	//*  75  159:aload_0         
	//*  76  160:getfield        #383 <Field ActionProvider mProvider>
	//*  77  163:iconst_1        
	//*  78  164:invokevirtual   #430 <Method void ActionProvider.subUiVisibilityChanged(boolean)>
	//*  79  167:aload           5
	//*  80  169:invokevirtual   #434 <Method ListView ListPopupWindow.getListView()>
	//*  81  172:aload_0         
	//*  82  173:invokevirtual   #119 <Method Context getContext()>
	//*  83  176:getstatic       #439 <Field int android.support.v7.appcompat.R$string.abc_activitychooserview_choose_application>
	//*  84  179:invokevirtual   #371 <Method String Context.getString(int)>
	//*  85  182:invokevirtual   #442 <Method void ListView.setContentDescription(CharSequence)>
	//*  86  185:aload           5
	//*  87  187:invokevirtual   #434 <Method ListView ListPopupWindow.getListView()>
	//*  88  190:new             #444 <Class ColorDrawable>
	//*  89  193:dup             
	//*  90  194:iconst_0        
	//*  91  195:invokespecial   #446 <Method void ColorDrawable(int)>
	//*  92  198:invokevirtual   #449 <Method void ListView.setSelector(Drawable)>
	//*  93  201:return          
			flag = false;
	//   94  202:iconst_0        
	//   95  203:istore          4
		k = mAdapter.getActivityCount();
		if(flag)
			j = 1;
		else
	//*  96  205:goto            45
			j = 0;
	//   97  208:iconst_0        
	//   98  209:istore_2        
		if(i != 0x7fffffff && k > j + i)
		{
			mAdapter.setShowFooterView(true);
			mAdapter.setMaxActivityCount(i - 1);
		} else
	//*  99  210:goto            60
		{
			mAdapter.setShowFooterView(false);
	//  100  213:aload_0         
	//  101  214:getfield        #205 <Field ActivityChooserView$ActivityChooserViewAdapter mAdapter>
	//  102  217:iconst_0        
	//  103  218:invokevirtual   #406 <Method void ActivityChooserView$ActivityChooserViewAdapter.setShowFooterView(boolean)>
			mAdapter.setMaxActivityCount(i);
	//  104  221:aload_0         
	//  105  222:getfield        #205 <Field ActivityChooserView$ActivityChooserViewAdapter mAdapter>
	//  106  225:iload_1         
	//  107  226:invokevirtual   #409 <Method void ActivityChooserView$ActivityChooserViewAdapter.setMaxActivityCount(int)>
		}
		listpopupwindow = getListPopupWindow();
		if(!listpopupwindow.isShowing())
		{
			if(mIsSelectingDefaultActivity || !flag)
				mAdapter.setShowDefaultActivity(true, flag);
			else
	//* 108  229:goto            92
				mAdapter.setShowDefaultActivity(false, false);
	//  109  232:aload_0         
	//  110  233:getfield        #205 <Field ActivityChooserView$ActivityChooserViewAdapter mAdapter>
	//  111  236:iconst_0        
	//  112  237:iconst_0        
	//  113  238:invokevirtual   #413 <Method void ActivityChooserView$ActivityChooserViewAdapter.setShowDefaultActivity(boolean, boolean)>
			listpopupwindow.setContentWidth(Math.min(mAdapter.measureContentWidth(), mListPopupMaxWidth));
			listpopupwindow.show();
			if(mProvider != null)
				mProvider.subUiVisibilityChanged(true);
			listpopupwindow.getListView().setContentDescription(((CharSequence) (getContext().getString(android.support.v7.appcompat.R.string.abc_activitychooserview_choose_application))));
			listpopupwindow.getListView().setSelector(((Drawable) (new ColorDrawable(0))));
		}
	//* 114  241:goto            128
	}

	void updateAppearance()
	{
		int i;
		int j;
		if(mAdapter.getCount() > 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #205 <Field ActivityChooserView$ActivityChooserViewAdapter mAdapter>
	//*   2    4:invokevirtual   #453 <Method int ActivityChooserView$ActivityChooserViewAdapter.getCount()>
	//*   3    7:ifle            150
			mExpandActivityOverflowButton.setEnabled(true);
	//    4   10:aload_0         
	//    5   11:getfield        #196 <Field FrameLayout mExpandActivityOverflowButton>
	//    6   14:iconst_1        
	//    7   15:invokevirtual   #456 <Method void FrameLayout.setEnabled(boolean)>
		else
	//*   8   18:aload_0         
	//*   9   19:getfield        #205 <Field ActivityChooserView$ActivityChooserViewAdapter mAdapter>
	//*  10   22:invokevirtual   #402 <Method int ActivityChooserView$ActivityChooserViewAdapter.getActivityCount()>
	//*  11   25:istore_1        
	//*  12   26:aload_0         
	//*  13   27:getfield        #205 <Field ActivityChooserView$ActivityChooserViewAdapter mAdapter>
	//*  14   30:invokevirtual   #459 <Method int ActivityChooserView$ActivityChooserViewAdapter.getHistorySize()>
	//*  15   33:istore_2        
	//*  16   34:iload_1         
	//*  17   35:iconst_1        
	//*  18   36:icmpeq          48
	//*  19   39:iload_1         
	//*  20   40:iconst_1        
	//*  21   41:icmple          161
	//*  22   44:iload_2         
	//*  23   45:ifle            161
	//*  24   48:aload_0         
	//*  25   49:getfield        #163 <Field FrameLayout mDefaultActivityButton>
	//*  26   52:iconst_0        
	//*  27   53:invokevirtual   #462 <Method void FrameLayout.setVisibility(int)>
	//*  28   56:aload_0         
	//*  29   57:getfield        #205 <Field ActivityChooserView$ActivityChooserViewAdapter mAdapter>
	//*  30   60:invokevirtual   #466 <Method ResolveInfo ActivityChooserView$ActivityChooserViewAdapter.getDefaultActivity()>
	//*  31   63:astore_3        
	//*  32   64:aload_0         
	//*  33   65:invokevirtual   #119 <Method Context getContext()>
	//*  34   68:invokevirtual   #470 <Method android.content.pm.PackageManager Context.getPackageManager()>
	//*  35   71:astore          4
	//*  36   73:aload_0         
	//*  37   74:getfield        #179 <Field ImageView mDefaultActivityButtonImage>
	//*  38   77:aload_3         
	//*  39   78:aload           4
	//*  40   80:invokevirtual   #476 <Method Drawable ResolveInfo.loadIcon(android.content.pm.PackageManager)>
	//*  41   83:invokevirtual   #202 <Method void ImageView.setImageDrawable(Drawable)>
	//*  42   86:aload_0         
	//*  43   87:getfield        #366 <Field int mDefaultActionButtonContentDescription>
	//*  44   90:ifeq            128
	//*  45   93:aload_3         
	//*  46   94:aload           4
	//*  47   96:invokevirtual   #480 <Method CharSequence ResolveInfo.loadLabel(android.content.pm.PackageManager)>
	//*  48   99:astore_3        
	//*  49  100:aload_0         
	//*  50  101:invokevirtual   #119 <Method Context getContext()>
	//*  51  104:aload_0         
	//*  52  105:getfield        #366 <Field int mDefaultActionButtonContentDescription>
	//*  53  108:iconst_1        
	//*  54  109:anewarray       Object[]
	//*  55  112:dup             
	//*  56  113:iconst_0        
	//*  57  114:aload_3         
	//*  58  115:aastore         
	//*  59  116:invokevirtual   #485 <Method String Context.getString(int, Object[])>
	//*  60  119:astore_3        
	//*  61  120:aload_0         
	//*  62  121:getfield        #163 <Field FrameLayout mDefaultActivityButton>
	//*  63  124:aload_3         
	//*  64  125:invokevirtual   #486 <Method void FrameLayout.setContentDescription(CharSequence)>
	//*  65  128:aload_0         
	//*  66  129:getfield        #163 <Field FrameLayout mDefaultActivityButton>
	//*  67  132:invokevirtual   #330 <Method int FrameLayout.getVisibility()>
	//*  68  135:ifne            173
	//*  69  138:aload_0         
	//*  70  139:getfield        #150 <Field LinearLayoutCompat mActivityChooserContent>
	//*  71  142:aload_0         
	//*  72  143:getfield        #156 <Field Drawable mActivityChooserContentBackground>
	//*  73  146:invokevirtual   #489 <Method void LinearLayoutCompat.setBackgroundDrawable(Drawable)>
	//*  74  149:return          
			mExpandActivityOverflowButton.setEnabled(false);
	//   75  150:aload_0         
	//   76  151:getfield        #196 <Field FrameLayout mExpandActivityOverflowButton>
	//   77  154:iconst_0        
	//   78  155:invokevirtual   #456 <Method void FrameLayout.setEnabled(boolean)>
		i = mAdapter.getActivityCount();
		j = mAdapter.getHistorySize();
		if(i == 1 || i > 1 && j > 0)
		{
			mDefaultActivityButton.setVisibility(0);
			Object obj = ((Object) (mAdapter.getDefaultActivity()));
			android.content.pm.PackageManager packagemanager = getContext().getPackageManager();
			mDefaultActivityButtonImage.setImageDrawable(((ResolveInfo) (obj)).loadIcon(packagemanager));
			if(mDefaultActionButtonContentDescription != 0)
			{
				obj = ((Object) (((ResolveInfo) (obj)).loadLabel(packagemanager)));
				obj = ((Object) (getContext().getString(mDefaultActionButtonContentDescription, new Object[] {
					obj
				})));
				mDefaultActivityButton.setContentDescription(((CharSequence) (obj)));
			}
		} else
	//*  79  158:goto            18
		{
			mDefaultActivityButton.setVisibility(8);
	//   80  161:aload_0         
	//   81  162:getfield        #163 <Field FrameLayout mDefaultActivityButton>
	//   82  165:bipush          8
	//   83  167:invokevirtual   #462 <Method void FrameLayout.setVisibility(int)>
		}
		if(mDefaultActivityButton.getVisibility() == 0)
		{
			mActivityChooserContent.setBackgroundDrawable(mActivityChooserContentBackground);
			return;
		} else
	//*  84  170:goto            128
		{
			mActivityChooserContent.setBackgroundDrawable(((Drawable) (null)));
	//   85  173:aload_0         
	//   86  174:getfield        #150 <Field LinearLayoutCompat mActivityChooserContent>
	//   87  177:aconst_null     
	//   88  178:invokevirtual   #489 <Method void LinearLayoutCompat.setBackgroundDrawable(Drawable)>
			return;
	//   89  181:return          
		}
	}

	private static final String LOG_TAG = "ActivityChooserView";
	private final LinearLayoutCompat mActivityChooserContent;
	private final Drawable mActivityChooserContentBackground;
	final ActivityChooserViewAdapter mAdapter;
	private final Callbacks mCallbacks;
	private int mDefaultActionButtonContentDescription;
	final FrameLayout mDefaultActivityButton;
	private final ImageView mDefaultActivityButtonImage;
	final FrameLayout mExpandActivityOverflowButton;
	private final ImageView mExpandActivityOverflowButtonImage;
	int mInitialActivityCount;
	private boolean mIsAttachedToWindow;
	boolean mIsSelectingDefaultActivity;
	private final int mListPopupMaxWidth;
	private ListPopupWindow mListPopupWindow;
	final DataSetObserver mModelDataSetObserver;
	android.widget.PopupWindow.OnDismissListener mOnDismissListener;
	private final android.view.ViewTreeObserver.OnGlobalLayoutListener mOnGlobalLayoutListener;
	ActionProvider mProvider;
}

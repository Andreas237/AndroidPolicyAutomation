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
import android.graphics.drawable.Drawable;
import android.support.v4.view.ActionProvider;
import android.support.v7.view.menu.ShowableListMenu;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.*;
import android.widget.*;

// Referenced classes of package android.support.v7.widget:
//			LinearLayoutCompat, ListPopupWindow, ActivityChooserModel, TintTypedArray, 
//			ForwardingListener

public class ActivityChooserView extends ViewGroup
	implements ActivityChooserModel.ActivityChooserModelClient
{
	class ActivityChooserViewAdapter extends BaseAdapter
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
			switch(getItemViewType(i))
		//*   0    0:aload_0         
		//*   1    1:iload_1         
		//*   2    2:invokevirtual   #71  <Method int getItemViewType(int)>
			{
		//*   3    5:lookupswitch    2: default 32
		//		               0: 37
		//		               1: 35
		//*   4   32:goto            71
			case 1: // '\001'
				return ((Object) (null));
		//    5   35:aconst_null     
		//    6   36:areturn         

			case 0: // '\0'
				int j = i;
		//    7   37:iload_1         
		//    8   38:istore_2        
				if(!mShowDefaultActivity)
		//*   9   39:aload_0         
		//*  10   40:getfield        #48  <Field boolean mShowDefaultActivity>
		//*  11   43:ifne            62
				{
					j = i;
		//   12   46:iload_1         
		//   13   47:istore_2        
					if(mDataModel.getDefaultActivity() != null)
		//*  14   48:aload_0         
		//*  15   49:getfield        #41  <Field ActivityChooserModel mDataModel>
		//*  16   52:invokevirtual   #52  <Method ResolveInfo ActivityChooserModel.getDefaultActivity()>
		//*  17   55:ifnull          62
						j = i + 1;
		//   18   58:iload_1         
		//   19   59:iconst_1        
		//   20   60:iadd            
		//   21   61:istore_2        
				}
				return ((Object) (mDataModel.getActivity(j)));
		//   22   62:aload_0         
		//   23   63:getfield        #41  <Field ActivityChooserModel mDataModel>
		//   24   66:iload_2         
		//   25   67:invokevirtual   #75  <Method ResolveInfo ActivityChooserModel.getActivity(int)>
		//   26   70:areturn         
			}
			throw new IllegalArgumentException();
		//   27   71:new             #77  <Class IllegalArgumentException>
		//   28   74:dup             
		//   29   75:invokespecial   #78  <Method void IllegalArgumentException()>
		//   30   78:athrow          
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
			JVM INSTR lookupswitch 2: default 32
		//		               0: 106
		//		               1: 35;
		//    3    5:lookupswitch    2: default 32
		//		               0: 106
		//		               1: 35
			   goto _L1 _L2 _L3
		//*   4   32:goto            242
_L3:
			if(view == null) goto _L5; else goto _L4
		//    5   35:aload_2         
		//    6   36:ifnull          50
_L4:
			View view1 = view;
		//    7   39:aload_2         
		//    8   40:astore          4
			if(view.getId() == 1) goto _L6; else goto _L5
		//    9   42:aload_2         
		//   10   43:invokevirtual   #91  <Method int View.getId()>
		//   11   46:iconst_1        
		//   12   47:icmpeq          103
_L5:
			view1 = LayoutInflater.from(getContext()).inflate(android.support.v7.appcompat.R.layout.abc_activity_chooser_view_list_item, viewgroup, false);
		//   13   50:aload_0         
		//   14   51:getfield        #31  <Field ActivityChooserView this$0>
		//   15   54:invokevirtual   #95  <Method Context ActivityChooserView.getContext()>
		//   16   57:invokestatic    #101 <Method LayoutInflater LayoutInflater.from(Context)>
		//   17   60:getstatic       #106 <Field int android.support.v7.appcompat.R$layout.abc_activity_chooser_view_list_item>
		//   18   63:aload_3         
		//   19   64:iconst_0        
		//   20   65:invokevirtual   #110 <Method View LayoutInflater.inflate(int, ViewGroup, boolean)>
		//   21   68:astore          4
			view1.setId(1);
		//   22   70:aload           4
		//   23   72:iconst_1        
		//   24   73:invokevirtual   #114 <Method void View.setId(int)>
			((TextView)view1.findViewById(android.support.v7.appcompat.R.id.title)).setText(((CharSequence) (getContext().getString(android.support.v7.appcompat.R.string.abc_activity_chooser_view_see_all))));
		//   25   76:aload           4
		//   26   78:getstatic       #119 <Field int android.support.v7.appcompat.R$id.title>
		//   27   81:invokevirtual   #123 <Method View View.findViewById(int)>
		//   28   84:checkcast       #125 <Class TextView>
		//   29   87:aload_0         
		//   30   88:getfield        #31  <Field ActivityChooserView this$0>
		//   31   91:invokevirtual   #95  <Method Context ActivityChooserView.getContext()>
		//   32   94:getstatic       #130 <Field int android.support.v7.appcompat.R$string.abc_activity_chooser_view_see_all>
		//   33   97:invokevirtual   #136 <Method String Context.getString(int)>
		//   34  100:invokevirtual   #140 <Method void TextView.setText(CharSequence)>
_L6:
			return view1;
		//   35  103:aload           4
		//   36  105:areturn         
_L2:
			if(view == null) goto _L8; else goto _L7
		//   37  106:aload_2         
		//   38  107:ifnull          123
_L7:
			view1 = view;
		//   39  110:aload_2         
		//   40  111:astore          4
			if(view.getId() == android.support.v7.appcompat.R.id.list_item) goto _L9; else goto _L8
		//   41  113:aload_2         
		//   42  114:invokevirtual   #91  <Method int View.getId()>
		//   43  117:getstatic       #143 <Field int android.support.v7.appcompat.R$id.list_item>
		//   44  120:icmpeq          143
_L8:
			view1 = LayoutInflater.from(getContext()).inflate(android.support.v7.appcompat.R.layout.abc_activity_chooser_view_list_item, viewgroup, false);
		//   45  123:aload_0         
		//   46  124:getfield        #31  <Field ActivityChooserView this$0>
		//   47  127:invokevirtual   #95  <Method Context ActivityChooserView.getContext()>
		//   48  130:invokestatic    #101 <Method LayoutInflater LayoutInflater.from(Context)>
		//   49  133:getstatic       #106 <Field int android.support.v7.appcompat.R$layout.abc_activity_chooser_view_list_item>
		//   50  136:aload_3         
		//   51  137:iconst_0        
		//   52  138:invokevirtual   #110 <Method View LayoutInflater.inflate(int, ViewGroup, boolean)>
		//   53  141:astore          4
_L9:
			view = ((View) (getContext().getPackageManager()));
		//   54  143:aload_0         
		//   55  144:getfield        #31  <Field ActivityChooserView this$0>
		//   56  147:invokevirtual   #95  <Method Context ActivityChooserView.getContext()>
		//   57  150:invokevirtual   #147 <Method android.content.pm.PackageManager Context.getPackageManager()>
		//   58  153:astore_2        
			viewgroup = ((ViewGroup) ((ImageView)view1.findViewById(android.support.v7.appcompat.R.id.icon)));
		//   59  154:aload           4
		//   60  156:getstatic       #150 <Field int android.support.v7.appcompat.R$id.icon>
		//   61  159:invokevirtual   #123 <Method View View.findViewById(int)>
		//   62  162:checkcast       #152 <Class ImageView>
		//   63  165:astore_3        
			ResolveInfo resolveinfo = (ResolveInfo)getItem(i);
		//   64  166:aload_0         
		//   65  167:iload_1         
		//   66  168:invokevirtual   #154 <Method Object getItem(int)>
		//   67  171:checkcast       #156 <Class ResolveInfo>
		//   68  174:astore          5
			((ImageView) (viewgroup)).setImageDrawable(resolveinfo.loadIcon(((android.content.pm.PackageManager) (view))));
		//   69  176:aload_3         
		//   70  177:aload           5
		//   71  179:aload_2         
		//   72  180:invokevirtual   #160 <Method Drawable ResolveInfo.loadIcon(android.content.pm.PackageManager)>
		//   73  183:invokevirtual   #164 <Method void ImageView.setImageDrawable(Drawable)>
			((TextView)view1.findViewById(android.support.v7.appcompat.R.id.title)).setText(resolveinfo.loadLabel(((android.content.pm.PackageManager) (view))));
		//   74  186:aload           4
		//   75  188:getstatic       #119 <Field int android.support.v7.appcompat.R$id.title>
		//   76  191:invokevirtual   #123 <Method View View.findViewById(int)>
		//   77  194:checkcast       #125 <Class TextView>
		//   78  197:aload           5
		//   79  199:aload_2         
		//   80  200:invokevirtual   #168 <Method CharSequence ResolveInfo.loadLabel(android.content.pm.PackageManager)>
		//   81  203:invokevirtual   #140 <Method void TextView.setText(CharSequence)>
			if(mShowDefaultActivity && i == 0 && mHighlightDefaultActivity)
		//*  82  206:aload_0         
		//*  83  207:getfield        #48  <Field boolean mShowDefaultActivity>
		//*  84  210:ifeq            233
		//*  85  213:iload_1         
		//*  86  214:ifne            233
		//*  87  217:aload_0         
		//*  88  218:getfield        #170 <Field boolean mHighlightDefaultActivity>
		//*  89  221:ifeq            233
			{
				view1.setActivated(true);
		//   90  224:aload           4
		//   91  226:iconst_1        
		//   92  227:invokevirtual   #174 <Method void View.setActivated(boolean)>
				return view1;
		//   93  230:aload           4
		//   94  232:areturn         
			} else
			{
				view1.setActivated(false);
		//   95  233:aload           4
		//   96  235:iconst_0        
		//   97  236:invokevirtual   #174 <Method void View.setActivated(boolean)>
				return view1;
		//   98  239:aload           4
		//   99  241:areturn         
			}
_L1:
			throw new IllegalArgumentException();
		//  100  242:new             #77  <Class IllegalArgumentException>
		//  101  245:dup             
		//  102  246:invokespecial   #78  <Method void IllegalArgumentException()>
		//  103  249:athrow          
		}

		public int getViewTypeCount()
		{
			return 3;
		//    0    0:iconst_3        
		//    1    1:ireturn         
		}

		public int measureContentWidth()
		{
			int k = mMaxActivityCount;
		//    0    0:aload_0         
		//    1    1:getfield        #36  <Field int mMaxActivityCount>
		//    2    4:istore_3        
			mMaxActivityCount = 0x7fffffff;
		//    3    5:aload_0         
		//    4    6:ldc1            #18  <Int 0x7fffffff>
		//    5    8:putfield        #36  <Field int mMaxActivityCount>
			int j = 0;
		//    6   11:iconst_0        
		//    7   12:istore_2        
			View view = null;
		//    8   13:aconst_null     
		//    9   14:astore          7
			int l = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
		//   10   16:iconst_0        
		//   11   17:iconst_0        
		//   12   18:invokestatic    #181 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
		//   13   21:istore          4
			int i1 = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
		//   14   23:iconst_0        
		//   15   24:iconst_0        
		//   16   25:invokestatic    #181 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
		//   17   28:istore          5
			int j1 = getCount();
		//   18   30:aload_0         
		//   19   31:invokevirtual   #82  <Method int getCount()>
		//   20   34:istore          6
			for(int i = 0; i < j1; i++)
		//*  21   36:iconst_0        
		//*  22   37:istore_1        
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

	class Callbacks
		implements android.widget.AdapterView.OnItemClickListener, android.view.View.OnClickListener, android.view.View.OnLongClickListener, android.widget.PopupWindow.OnDismissListener
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
			switch(((ActivityChooserViewAdapter)adapterview.getAdapter()).getItemViewType(i))
		//*   0    0:aload_1         
		//*   1    1:invokevirtual   #121 <Method android.widget.Adapter AdapterView.getAdapter()>
		//*   2    4:checkcast       #49  <Class ActivityChooserView$ActivityChooserViewAdapter>
		//*   3    7:iload_3         
		//*   4    8:invokevirtual   #125 <Method int ActivityChooserView$ActivityChooserViewAdapter.getItemViewType(int)>
			{
		//*   5   11:lookupswitch    2: default 36
		//		               0: 49
		//		               1: 39
		//*   6   36:goto            144
			case 1: // '\001'
				showPopupUnchecked(0x7fffffff);
		//    7   39:aload_0         
		//    8   40:getfield        #21  <Field ActivityChooserView this$0>
		//    9   43:ldc1            #126 <Int 0x7fffffff>
		//   10   45:invokevirtual   #98  <Method void ActivityChooserView.showPopupUnchecked(int)>
				return;
		//   11   48:return          

			case 0: // '\0'
				dismissPopup();
		//   12   49:aload_0         
		//   13   50:getfield        #21  <Field ActivityChooserView this$0>
		//   14   53:invokevirtual   #43  <Method boolean ActivityChooserView.dismissPopup()>
		//   15   56:pop             
				if(mIsSelectingDefaultActivity)
		//*  16   57:aload_0         
		//*  17   58:getfield        #21  <Field ActivityChooserView this$0>
		//*  18   61:getfield        #90  <Field boolean ActivityChooserView.mIsSelectingDefaultActivity>
		//*  19   64:ifeq            86
					if(i > 0)
		//*  20   67:iload_3         
		//*  21   68:ifle            152
					{
						mAdapter.getDataModel().setDefaultActivity(i);
		//   22   71:aload_0         
		//   23   72:getfield        #21  <Field ActivityChooserView this$0>
		//   24   75:getfield        #47  <Field ActivityChooserView$ActivityChooserViewAdapter ActivityChooserView.mAdapter>
		//   25   78:invokevirtual   #57  <Method ActivityChooserModel ActivityChooserView$ActivityChooserViewAdapter.getDataModel()>
		//   26   81:iload_3         
		//   27   82:invokevirtual   #129 <Method void ActivityChooserModel.setDefaultActivity(int)>
						return;
		//   28   85:return          
					} else
		//*  29   86:aload_0         
		//*  30   87:getfield        #21  <Field ActivityChooserView this$0>
		//*  31   90:getfield        #47  <Field ActivityChooserView$ActivityChooserViewAdapter ActivityChooserView.mAdapter>
		//*  32   93:invokevirtual   #132 <Method boolean ActivityChooserView$ActivityChooserViewAdapter.getShowDefaultActivity()>
		//*  33   96:ifeq            102
		//*  34   99:goto            106
		//*  35  102:iload_3         
		//*  36  103:iconst_1        
		//*  37  104:iadd            
		//*  38  105:istore_3        
		//*  39  106:aload_0         
		//*  40  107:getfield        #21  <Field ActivityChooserView this$0>
		//*  41  110:getfield        #47  <Field ActivityChooserView$ActivityChooserViewAdapter ActivityChooserView.mAdapter>
		//*  42  113:invokevirtual   #57  <Method ActivityChooserModel ActivityChooserView$ActivityChooserViewAdapter.getDataModel()>
		//*  43  116:iload_3         
		//*  44  117:invokevirtual   #67  <Method Intent ActivityChooserModel.chooseActivity(int)>
		//*  45  120:astore_1        
		//*  46  121:aload_1         
		//*  47  122:ifnull          143
		//*  48  125:aload_1         
		//*  49  126:ldc1            #68  <Int 0x80000>
		//*  50  128:invokevirtual   #73  <Method Intent Intent.addFlags(int)>
		//*  51  131:pop             
		//*  52  132:aload_0         
		//*  53  133:getfield        #21  <Field ActivityChooserView this$0>
		//*  54  136:invokevirtual   #77  <Method Context ActivityChooserView.getContext()>
		//*  55  139:aload_1         
		//*  56  140:invokevirtual   #83  <Method void Context.startActivity(Intent)>
		//*  57  143:return          
		//*  58  144:new             #100 <Class IllegalArgumentException>
		//*  59  147:dup             
		//*  60  148:invokespecial   #101 <Method void IllegalArgumentException()>
		//*  61  151:athrow          
					{
						return;
		//   62  152:return          
					}
				if(!mAdapter.getShowDefaultActivity())
					i++;
				adapterview = ((AdapterView) (mAdapter.getDataModel().chooseActivity(i)));
				if(adapterview != null)
				{
					((Intent) (adapterview)).addFlags(0x80000);
					getContext().startActivity(((Intent) (adapterview)));
				}
				return;
			}
			throw new IllegalArgumentException();
		}

		public boolean onLongClick(View view)
		{
			if(view == mDefaultActivityButton)
		//*   0    0:aload_1         
		//*   1    1:aload_0         
		//*   2    2:getfield        #21  <Field ActivityChooserView this$0>
		//*   3    5:getfield        #39  <Field FrameLayout ActivityChooserView.mDefaultActivityButton>
		//*   4    8:if_acmpne       49
			{
				if(mAdapter.getCount() > 0)
		//*   5   11:aload_0         
		//*   6   12:getfield        #21  <Field ActivityChooserView this$0>
		//*   7   15:getfield        #47  <Field ActivityChooserView$ActivityChooserViewAdapter ActivityChooserView.mAdapter>
		//*   8   18:invokevirtual   #140 <Method int ActivityChooserView$ActivityChooserViewAdapter.getCount()>
		//*   9   21:ifle            57
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
			} else
		//*  20   46:goto            57
			{
				throw new IllegalArgumentException();
		//   21   49:new             #100 <Class IllegalArgumentException>
		//   22   52:dup             
		//   23   53:invokespecial   #101 <Method void IllegalArgumentException()>
		//   24   56:athrow          
			}
			return true;
		//   25   57:iconst_1        
		//   26   58:ireturn         
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
	//    3    3:invokespecial   #67  <Method void ActivityChooserView(Context, AttributeSet)>
	//    4    6:return          
	}

	public ActivityChooserView(Context context, AttributeSet attributeset)
	{
		this(context, attributeset, 0);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iconst_0        
	//    4    4:invokespecial   #71  <Method void ActivityChooserView(Context, AttributeSet, int)>
	//    5    7:return          
	}

	public ActivityChooserView(Context context, AttributeSet attributeset, int i)
	{
		super(context, attributeset, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:invokespecial   #72  <Method void ViewGroup(Context, AttributeSet, int)>
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
	//    9   13:invokespecial   #75  <Method void ActivityChooserView$1(ActivityChooserView)>
	//   10   16:putfield        #77  <Field DataSetObserver mModelDataSetObserver>
		mOnGlobalLayoutListener = new android.view.ViewTreeObserver.OnGlobalLayoutListener() {

			public void onGlobalLayout()
			{
				if(isShowingPopup())
			//*   0    0:aload_0         
			//*   1    1:getfield        #14  <Field ActivityChooserView this$0>
			//*   2    4:invokevirtual   #23  <Method boolean ActivityChooserView.isShowingPopup()>
			//*   3    7:ifeq            62
				{
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
						return;
			//   12   30:return          
					}
					getListPopupWindow().show();
			//   13   31:aload_0         
			//   14   32:getfield        #14  <Field ActivityChooserView this$0>
			//   15   35:invokevirtual   #30  <Method ListPopupWindow ActivityChooserView.getListPopupWindow()>
			//   16   38:invokevirtual   #38  <Method void ListPopupWindow.show()>
					if(mProvider != null)
			//*  17   41:aload_0         
			//*  18   42:getfield        #14  <Field ActivityChooserView this$0>
			//*  19   45:getfield        #42  <Field ActionProvider ActivityChooserView.mProvider>
			//*  20   48:ifnull          62
						mProvider.subUiVisibilityChanged(true);
			//   21   51:aload_0         
			//   22   52:getfield        #14  <Field ActivityChooserView this$0>
			//   23   55:getfield        #42  <Field ActionProvider ActivityChooserView.mProvider>
			//   24   58:iconst_1        
			//   25   59:invokevirtual   #48  <Method void ActionProvider.subUiVisibilityChanged(boolean)>
				}
			//   26   62:return          
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
	//   15   25:invokespecial   #78  <Method void ActivityChooserView$2(ActivityChooserView)>
	//   16   28:putfield        #80  <Field android.view.ViewTreeObserver$OnGlobalLayoutListener mOnGlobalLayoutListener>
		mInitialActivityCount = 4;
	//   17   31:aload_0         
	//   18   32:iconst_4        
	//   19   33:putfield        #82  <Field int mInitialActivityCount>
		Object obj = ((Object) (context.obtainStyledAttributes(attributeset, android.support.v7.appcompat.R.styleable.ActivityChooserView, i, 0)));
	//   20   36:aload_1         
	//   21   37:aload_2         
	//   22   38:getstatic       #87  <Field int[] android.support.v7.appcompat.R$styleable.ActivityChooserView>
	//   23   41:iload_3         
	//   24   42:iconst_0        
	//   25   43:invokevirtual   #93  <Method TypedArray Context.obtainStyledAttributes(AttributeSet, int[], int, int)>
	//   26   46:astore          4
		mInitialActivityCount = ((TypedArray) (obj)).getInt(android.support.v7.appcompat.R.styleable.ActivityChooserView_initialActivityCount, 4);
	//   27   48:aload_0         
	//   28   49:aload           4
	//   29   51:getstatic       #96  <Field int android.support.v7.appcompat.R$styleable.ActivityChooserView_initialActivityCount>
	//   30   54:iconst_4        
	//   31   55:invokevirtual   #102 <Method int TypedArray.getInt(int, int)>
	//   32   58:putfield        #82  <Field int mInitialActivityCount>
		attributeset = ((AttributeSet) (((TypedArray) (obj)).getDrawable(android.support.v7.appcompat.R.styleable.ActivityChooserView_expandActivityOverflowButtonDrawable)));
	//   33   61:aload           4
	//   34   63:getstatic       #105 <Field int android.support.v7.appcompat.R$styleable.ActivityChooserView_expandActivityOverflowButtonDrawable>
	//   35   66:invokevirtual   #109 <Method Drawable TypedArray.getDrawable(int)>
	//   36   69:astore_2        
		((TypedArray) (obj)).recycle();
	//   37   70:aload           4
	//   38   72:invokevirtual   #113 <Method void TypedArray.recycle()>
		LayoutInflater.from(getContext()).inflate(android.support.v7.appcompat.R.layout.abc_activity_chooser_view, ((ViewGroup) (this)), true);
	//   39   75:aload_0         
	//   40   76:invokevirtual   #117 <Method Context getContext()>
	//   41   79:invokestatic    #123 <Method LayoutInflater LayoutInflater.from(Context)>
	//   42   82:getstatic       #128 <Field int android.support.v7.appcompat.R$layout.abc_activity_chooser_view>
	//   43   85:aload_0         
	//   44   86:iconst_1        
	//   45   87:invokevirtual   #132 <Method View LayoutInflater.inflate(int, ViewGroup, boolean)>
	//   46   90:pop             
		mCallbacks = new Callbacks();
	//   47   91:aload_0         
	//   48   92:new             #19  <Class ActivityChooserView$Callbacks>
	//   49   95:dup             
	//   50   96:aload_0         
	//   51   97:invokespecial   #133 <Method void ActivityChooserView$Callbacks(ActivityChooserView)>
	//   52  100:putfield        #135 <Field ActivityChooserView$Callbacks mCallbacks>
		mActivityChooserContent = (LinearLayoutCompat)findViewById(android.support.v7.appcompat.R.id.activity_chooser_view_content);
	//   53  103:aload_0         
	//   54  104:aload_0         
	//   55  105:getstatic       #140 <Field int android.support.v7.appcompat.R$id.activity_chooser_view_content>
	//   56  108:invokevirtual   #144 <Method View findViewById(int)>
	//   57  111:checkcast       #146 <Class LinearLayoutCompat>
	//   58  114:putfield        #148 <Field LinearLayoutCompat mActivityChooserContent>
		mActivityChooserContentBackground = mActivityChooserContent.getBackground();
	//   59  117:aload_0         
	//   60  118:aload_0         
	//   61  119:getfield        #148 <Field LinearLayoutCompat mActivityChooserContent>
	//   62  122:invokevirtual   #152 <Method Drawable LinearLayoutCompat.getBackground()>
	//   63  125:putfield        #154 <Field Drawable mActivityChooserContentBackground>
		mDefaultActivityButton = (FrameLayout)findViewById(android.support.v7.appcompat.R.id.default_activity_button);
	//   64  128:aload_0         
	//   65  129:aload_0         
	//   66  130:getstatic       #157 <Field int android.support.v7.appcompat.R$id.default_activity_button>
	//   67  133:invokevirtual   #144 <Method View findViewById(int)>
	//   68  136:checkcast       #159 <Class FrameLayout>
	//   69  139:putfield        #161 <Field FrameLayout mDefaultActivityButton>
		mDefaultActivityButton.setOnClickListener(((android.view.View.OnClickListener) (mCallbacks)));
	//   70  142:aload_0         
	//   71  143:getfield        #161 <Field FrameLayout mDefaultActivityButton>
	//   72  146:aload_0         
	//   73  147:getfield        #135 <Field ActivityChooserView$Callbacks mCallbacks>
	//   74  150:invokevirtual   #165 <Method void FrameLayout.setOnClickListener(android.view.View$OnClickListener)>
		mDefaultActivityButton.setOnLongClickListener(((android.view.View.OnLongClickListener) (mCallbacks)));
	//   75  153:aload_0         
	//   76  154:getfield        #161 <Field FrameLayout mDefaultActivityButton>
	//   77  157:aload_0         
	//   78  158:getfield        #135 <Field ActivityChooserView$Callbacks mCallbacks>
	//   79  161:invokevirtual   #169 <Method void FrameLayout.setOnLongClickListener(android.view.View$OnLongClickListener)>
		mDefaultActivityButtonImage = (ImageView)mDefaultActivityButton.findViewById(android.support.v7.appcompat.R.id.image);
	//   80  164:aload_0         
	//   81  165:aload_0         
	//   82  166:getfield        #161 <Field FrameLayout mDefaultActivityButton>
	//   83  169:getstatic       #172 <Field int android.support.v7.appcompat.R$id.image>
	//   84  172:invokevirtual   #173 <Method View FrameLayout.findViewById(int)>
	//   85  175:checkcast       #175 <Class ImageView>
	//   86  178:putfield        #177 <Field ImageView mDefaultActivityButtonImage>
		obj = ((Object) ((FrameLayout)findViewById(android.support.v7.appcompat.R.id.expand_activities_button)));
	//   87  181:aload_0         
	//   88  182:getstatic       #180 <Field int android.support.v7.appcompat.R$id.expand_activities_button>
	//   89  185:invokevirtual   #144 <Method View findViewById(int)>
	//   90  188:checkcast       #159 <Class FrameLayout>
	//   91  191:astore          4
		((FrameLayout) (obj)).setOnClickListener(((android.view.View.OnClickListener) (mCallbacks)));
	//   92  193:aload           4
	//   93  195:aload_0         
	//   94  196:getfield        #135 <Field ActivityChooserView$Callbacks mCallbacks>
	//   95  199:invokevirtual   #165 <Method void FrameLayout.setOnClickListener(android.view.View$OnClickListener)>
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
	//   96  202:aload           4
	//   97  204:new             #12  <Class ActivityChooserView$3>
	//   98  207:dup             
	//   99  208:aload_0         
	//  100  209:aload           4
	//  101  211:invokespecial   #183 <Method void ActivityChooserView$3(ActivityChooserView, View)>
	//  102  214:invokevirtual   #187 <Method void FrameLayout.setOnTouchListener(android.view.View$OnTouchListener)>
		mExpandActivityOverflowButton = ((FrameLayout) (obj));
	//  103  217:aload_0         
	//  104  218:aload           4
	//  105  220:putfield        #189 <Field FrameLayout mExpandActivityOverflowButton>
		mExpandActivityOverflowButtonImage = (ImageView)((FrameLayout) (obj)).findViewById(android.support.v7.appcompat.R.id.image);
	//  106  223:aload_0         
	//  107  224:aload           4
	//  108  226:getstatic       #172 <Field int android.support.v7.appcompat.R$id.image>
	//  109  229:invokevirtual   #173 <Method View FrameLayout.findViewById(int)>
	//  110  232:checkcast       #175 <Class ImageView>
	//  111  235:putfield        #191 <Field ImageView mExpandActivityOverflowButtonImage>
		mExpandActivityOverflowButtonImage.setImageDrawable(((Drawable) (attributeset)));
	//  112  238:aload_0         
	//  113  239:getfield        #191 <Field ImageView mExpandActivityOverflowButtonImage>
	//  114  242:aload_2         
	//  115  243:invokevirtual   #195 <Method void ImageView.setImageDrawable(Drawable)>
		mAdapter = new ActivityChooserViewAdapter();
	//  116  246:aload_0         
	//  117  247:new             #16  <Class ActivityChooserView$ActivityChooserViewAdapter>
	//  118  250:dup             
	//  119  251:aload_0         
	//  120  252:invokespecial   #196 <Method void ActivityChooserView$ActivityChooserViewAdapter(ActivityChooserView)>
	//  121  255:putfield        #198 <Field ActivityChooserView$ActivityChooserViewAdapter mAdapter>
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
	//  122  258:aload_0         
	//  123  259:getfield        #198 <Field ActivityChooserView$ActivityChooserViewAdapter mAdapter>
	//  124  262:new             #14  <Class ActivityChooserView$4>
	//  125  265:dup             
	//  126  266:aload_0         
	//  127  267:invokespecial   #199 <Method void ActivityChooserView$4(ActivityChooserView)>
	//  128  270:invokevirtual   #203 <Method void ActivityChooserView$ActivityChooserViewAdapter.registerDataSetObserver(DataSetObserver)>
		context = ((Context) (context.getResources()));
	//  129  273:aload_1         
	//  130  274:invokevirtual   #207 <Method Resources Context.getResources()>
	//  131  277:astore_1        
		mListPopupMaxWidth = Math.max(((Resources) (context)).getDisplayMetrics().widthPixels / 2, ((Resources) (context)).getDimensionPixelSize(android.support.v7.appcompat.R.dimen.abc_config_prefDialogWidth));
	//  132  278:aload_0         
	//  133  279:aload_1         
	//  134  280:invokevirtual   #213 <Method DisplayMetrics Resources.getDisplayMetrics()>
	//  135  283:getfield        #218 <Field int DisplayMetrics.widthPixels>
	//  136  286:iconst_2        
	//  137  287:idiv            
	//  138  288:aload_1         
	//  139  289:getstatic       #223 <Field int android.support.v7.appcompat.R$dimen.abc_config_prefDialogWidth>
	//  140  292:invokevirtual   #227 <Method int Resources.getDimensionPixelSize(int)>
	//  141  295:invokestatic    #232 <Method int Math.max(int, int)>
	//  142  298:putfield        #234 <Field int mListPopupMaxWidth>
	//  143  301:return          
	}

	public boolean dismissPopup()
	{
		if(isShowingPopup())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #239 <Method boolean isShowingPopup()>
	//*   2    4:ifeq            34
		{
			getListPopupWindow().dismiss();
	//    3    7:aload_0         
	//    4    8:invokevirtual   #243 <Method ListPopupWindow getListPopupWindow()>
	//    5   11:invokevirtual   #248 <Method void ListPopupWindow.dismiss()>
			ViewTreeObserver viewtreeobserver = getViewTreeObserver();
	//    6   14:aload_0         
	//    7   15:invokevirtual   #252 <Method ViewTreeObserver getViewTreeObserver()>
	//    8   18:astore_1        
			if(viewtreeobserver.isAlive())
	//*   9   19:aload_1         
	//*  10   20:invokevirtual   #257 <Method boolean ViewTreeObserver.isAlive()>
	//*  11   23:ifeq            34
				viewtreeobserver.removeGlobalOnLayoutListener(mOnGlobalLayoutListener);
	//   12   26:aload_1         
	//   13   27:aload_0         
	//   14   28:getfield        #80  <Field android.view.ViewTreeObserver$OnGlobalLayoutListener mOnGlobalLayoutListener>
	//   15   31:invokevirtual   #261 <Method void ViewTreeObserver.removeGlobalOnLayoutListener(android.view.ViewTreeObserver$OnGlobalLayoutListener)>
		}
		return true;
	//   16   34:iconst_1        
	//   17   35:ireturn         
	}

	public ActivityChooserModel getDataModel()
	{
		return mAdapter.getDataModel();
	//    0    0:aload_0         
	//    1    1:getfield        #198 <Field ActivityChooserView$ActivityChooserViewAdapter mAdapter>
	//    2    4:invokevirtual   #265 <Method ActivityChooserModel ActivityChooserView$ActivityChooserViewAdapter.getDataModel()>
	//    3    7:areturn         
	}

	ListPopupWindow getListPopupWindow()
	{
		if(mListPopupWindow == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #267 <Field ListPopupWindow mListPopupWindow>
	//*   2    4:ifnonnull       71
		{
			mListPopupWindow = new ListPopupWindow(getContext());
	//    3    7:aload_0         
	//    4    8:new             #245 <Class ListPopupWindow>
	//    5   11:dup             
	//    6   12:aload_0         
	//    7   13:invokevirtual   #117 <Method Context getContext()>
	//    8   16:invokespecial   #269 <Method void ListPopupWindow(Context)>
	//    9   19:putfield        #267 <Field ListPopupWindow mListPopupWindow>
			mListPopupWindow.setAdapter(((android.widget.ListAdapter) (mAdapter)));
	//   10   22:aload_0         
	//   11   23:getfield        #267 <Field ListPopupWindow mListPopupWindow>
	//   12   26:aload_0         
	//   13   27:getfield        #198 <Field ActivityChooserView$ActivityChooserViewAdapter mAdapter>
	//   14   30:invokevirtual   #273 <Method void ListPopupWindow.setAdapter(android.widget.ListAdapter)>
			mListPopupWindow.setAnchorView(((View) (this)));
	//   15   33:aload_0         
	//   16   34:getfield        #267 <Field ListPopupWindow mListPopupWindow>
	//   17   37:aload_0         
	//   18   38:invokevirtual   #277 <Method void ListPopupWindow.setAnchorView(View)>
			mListPopupWindow.setModal(true);
	//   19   41:aload_0         
	//   20   42:getfield        #267 <Field ListPopupWindow mListPopupWindow>
	//   21   45:iconst_1        
	//   22   46:invokevirtual   #281 <Method void ListPopupWindow.setModal(boolean)>
			mListPopupWindow.setOnItemClickListener(((android.widget.AdapterView.OnItemClickListener) (mCallbacks)));
	//   23   49:aload_0         
	//   24   50:getfield        #267 <Field ListPopupWindow mListPopupWindow>
	//   25   53:aload_0         
	//   26   54:getfield        #135 <Field ActivityChooserView$Callbacks mCallbacks>
	//   27   57:invokevirtual   #285 <Method void ListPopupWindow.setOnItemClickListener(android.widget.AdapterView$OnItemClickListener)>
			mListPopupWindow.setOnDismissListener(((android.widget.PopupWindow.OnDismissListener) (mCallbacks)));
	//   28   60:aload_0         
	//   29   61:getfield        #267 <Field ListPopupWindow mListPopupWindow>
	//   30   64:aload_0         
	//   31   65:getfield        #135 <Field ActivityChooserView$Callbacks mCallbacks>
	//   32   68:invokevirtual   #289 <Method void ListPopupWindow.setOnDismissListener(android.widget.PopupWindow$OnDismissListener)>
		}
		return mListPopupWindow;
	//   33   71:aload_0         
	//   34   72:getfield        #267 <Field ListPopupWindow mListPopupWindow>
	//   35   75:areturn         
	}

	public boolean isShowingPopup()
	{
		return getListPopupWindow().isShowing();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #243 <Method ListPopupWindow getListPopupWindow()>
	//    2    4:invokevirtual   #292 <Method boolean ListPopupWindow.isShowing()>
	//    3    7:ireturn         
	}

	protected void onAttachedToWindow()
	{
		super.onAttachedToWindow();
	//    0    0:aload_0         
	//    1    1:invokespecial   #295 <Method void ViewGroup.onAttachedToWindow()>
		ActivityChooserModel activitychoosermodel = mAdapter.getDataModel();
	//    2    4:aload_0         
	//    3    5:getfield        #198 <Field ActivityChooserView$ActivityChooserViewAdapter mAdapter>
	//    4    8:invokevirtual   #265 <Method ActivityChooserModel ActivityChooserView$ActivityChooserViewAdapter.getDataModel()>
	//    5   11:astore_1        
		if(activitychoosermodel != null)
	//*   6   12:aload_1         
	//*   7   13:ifnull          24
			activitychoosermodel.registerObserver(((Object) (mModelDataSetObserver)));
	//    8   16:aload_1         
	//    9   17:aload_0         
	//   10   18:getfield        #77  <Field DataSetObserver mModelDataSetObserver>
	//   11   21:invokevirtual   #301 <Method void ActivityChooserModel.registerObserver(Object)>
		mIsAttachedToWindow = true;
	//   12   24:aload_0         
	//   13   25:iconst_1        
	//   14   26:putfield        #303 <Field boolean mIsAttachedToWindow>
	//   15   29:return          
	}

	protected void onDetachedFromWindow()
	{
		super.onDetachedFromWindow();
	//    0    0:aload_0         
	//    1    1:invokespecial   #306 <Method void ViewGroup.onDetachedFromWindow()>
		Object obj = ((Object) (mAdapter.getDataModel()));
	//    2    4:aload_0         
	//    3    5:getfield        #198 <Field ActivityChooserView$ActivityChooserViewAdapter mAdapter>
	//    4    8:invokevirtual   #265 <Method ActivityChooserModel ActivityChooserView$ActivityChooserViewAdapter.getDataModel()>
	//    5   11:astore_1        
		if(obj != null)
	//*   6   12:aload_1         
	//*   7   13:ifnull          24
			((ActivityChooserModel) (obj)).unregisterObserver(((Object) (mModelDataSetObserver)));
	//    8   16:aload_1         
	//    9   17:aload_0         
	//   10   18:getfield        #77  <Field DataSetObserver mModelDataSetObserver>
	//   11   21:invokevirtual   #309 <Method void ActivityChooserModel.unregisterObserver(Object)>
		obj = ((Object) (getViewTreeObserver()));
	//   12   24:aload_0         
	//   13   25:invokevirtual   #252 <Method ViewTreeObserver getViewTreeObserver()>
	//   14   28:astore_1        
		if(((ViewTreeObserver) (obj)).isAlive())
	//*  15   29:aload_1         
	//*  16   30:invokevirtual   #257 <Method boolean ViewTreeObserver.isAlive()>
	//*  17   33:ifeq            44
			((ViewTreeObserver) (obj)).removeGlobalOnLayoutListener(mOnGlobalLayoutListener);
	//   18   36:aload_1         
	//   19   37:aload_0         
	//   20   38:getfield        #80  <Field android.view.ViewTreeObserver$OnGlobalLayoutListener mOnGlobalLayoutListener>
	//   21   41:invokevirtual   #261 <Method void ViewTreeObserver.removeGlobalOnLayoutListener(android.view.ViewTreeObserver$OnGlobalLayoutListener)>
		if(isShowingPopup())
	//*  22   44:aload_0         
	//*  23   45:invokevirtual   #239 <Method boolean isShowingPopup()>
	//*  24   48:ifeq            56
			dismissPopup();
	//   25   51:aload_0         
	//   26   52:invokevirtual   #311 <Method boolean dismissPopup()>
	//   27   55:pop             
		mIsAttachedToWindow = false;
	//   28   56:aload_0         
	//   29   57:iconst_0        
	//   30   58:putfield        #303 <Field boolean mIsAttachedToWindow>
	//   31   61:return          
	}

	protected void onLayout(boolean flag, int i, int j, int k, int l)
	{
		mActivityChooserContent.layout(0, 0, k - i, l - j);
	//    0    0:aload_0         
	//    1    1:getfield        #148 <Field LinearLayoutCompat mActivityChooserContent>
	//    2    4:iconst_0        
	//    3    5:iconst_0        
	//    4    6:iload           4
	//    5    8:iload_2         
	//    6    9:isub            
	//    7   10:iload           5
	//    8   12:iload_3         
	//    9   13:isub            
	//   10   14:invokevirtual   #317 <Method void LinearLayoutCompat.layout(int, int, int, int)>
		if(!isShowingPopup())
	//*  11   17:aload_0         
	//*  12   18:invokevirtual   #239 <Method boolean isShowingPopup()>
	//*  13   21:ifne            29
			dismissPopup();
	//   14   24:aload_0         
	//   15   25:invokevirtual   #311 <Method boolean dismissPopup()>
	//   16   28:pop             
	//   17   29:return          
	}

	protected void onMeasure(int i, int j)
	{
		LinearLayoutCompat linearlayoutcompat = mActivityChooserContent;
	//    0    0:aload_0         
	//    1    1:getfield        #148 <Field LinearLayoutCompat mActivityChooserContent>
	//    2    4:astore          4
		int k = j;
	//    3    6:iload_2         
	//    4    7:istore_3        
		if(mDefaultActivityButton.getVisibility() != 0)
	//*   5    8:aload_0         
	//*   6    9:getfield        #161 <Field FrameLayout mDefaultActivityButton>
	//*   7   12:invokevirtual   #323 <Method int FrameLayout.getVisibility()>
	//*   8   15:ifeq            29
			k = android.view.View.MeasureSpec.makeMeasureSpec(android.view.View.MeasureSpec.getSize(j), 0x40000000);
	//    9   18:iload_2         
	//   10   19:invokestatic    #328 <Method int android.view.View$MeasureSpec.getSize(int)>
	//   11   22:ldc2            #329 <Int 0x40000000>
	//   12   25:invokestatic    #332 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//   13   28:istore_3        
		measureChild(((View) (linearlayoutcompat)), i, k);
	//   14   29:aload_0         
	//   15   30:aload           4
	//   16   32:iload_1         
	//   17   33:iload_3         
	//   18   34:invokevirtual   #336 <Method void measureChild(View, int, int)>
		setMeasuredDimension(((View) (linearlayoutcompat)).getMeasuredWidth(), ((View) (linearlayoutcompat)).getMeasuredHeight());
	//   19   37:aload_0         
	//   20   38:aload           4
	//   21   40:invokevirtual   #341 <Method int View.getMeasuredWidth()>
	//   22   43:aload           4
	//   23   45:invokevirtual   #344 <Method int View.getMeasuredHeight()>
	//   24   48:invokevirtual   #347 <Method void setMeasuredDimension(int, int)>
	//   25   51:return          
	}

	public void setActivityChooserModel(ActivityChooserModel activitychoosermodel)
	{
		mAdapter.setDataModel(activitychoosermodel);
	//    0    0:aload_0         
	//    1    1:getfield        #198 <Field ActivityChooserView$ActivityChooserViewAdapter mAdapter>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #352 <Method void ActivityChooserView$ActivityChooserViewAdapter.setDataModel(ActivityChooserModel)>
		if(isShowingPopup())
	//*   4    8:aload_0         
	//*   5    9:invokevirtual   #239 <Method boolean isShowingPopup()>
	//*   6   12:ifeq            25
		{
			dismissPopup();
	//    7   15:aload_0         
	//    8   16:invokevirtual   #311 <Method boolean dismissPopup()>
	//    9   19:pop             
			showPopup();
	//   10   20:aload_0         
	//   11   21:invokevirtual   #355 <Method boolean showPopup()>
	//   12   24:pop             
		}
	//   13   25:return          
	}

	public void setDefaultActionButtonContentDescription(int i)
	{
		mDefaultActionButtonContentDescription = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #359 <Field int mDefaultActionButtonContentDescription>
	//    3    5:return          
	}

	public void setExpandActivityOverflowButtonContentDescription(int i)
	{
		String s = getContext().getString(i);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #117 <Method Context getContext()>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #364 <Method String Context.getString(int)>
	//    4    8:astore_2        
		mExpandActivityOverflowButtonImage.setContentDescription(((CharSequence) (s)));
	//    5    9:aload_0         
	//    6   10:getfield        #191 <Field ImageView mExpandActivityOverflowButtonImage>
	//    7   13:aload_2         
	//    8   14:invokevirtual   #368 <Method void ImageView.setContentDescription(CharSequence)>
	//    9   17:return          
	}

	public void setExpandActivityOverflowButtonDrawable(Drawable drawable)
	{
		mExpandActivityOverflowButtonImage.setImageDrawable(drawable);
	//    0    0:aload_0         
	//    1    1:getfield        #191 <Field ImageView mExpandActivityOverflowButtonImage>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #195 <Method void ImageView.setImageDrawable(Drawable)>
	//    4    8:return          
	}

	public void setInitialActivityCount(int i)
	{
		mInitialActivityCount = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #82  <Field int mInitialActivityCount>
	//    3    5:return          
	}

	public void setOnDismissListener(android.widget.PopupWindow.OnDismissListener ondismisslistener)
	{
		mOnDismissListener = ondismisslistener;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #372 <Field android.widget.PopupWindow$OnDismissListener mOnDismissListener>
	//    3    5:return          
	}

	public void setProvider(ActionProvider actionprovider)
	{
		mProvider = actionprovider;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #376 <Field ActionProvider mProvider>
	//    3    5:return          
	}

	public boolean showPopup()
	{
		if(isShowingPopup() || !mIsAttachedToWindow)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #239 <Method boolean isShowingPopup()>
	//*   2    4:ifne            14
	//*   3    7:aload_0         
	//*   4    8:getfield        #303 <Field boolean mIsAttachedToWindow>
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
	//   10   18:putfield        #379 <Field boolean mIsSelectingDefaultActivity>
			showPopupUnchecked(mInitialActivityCount);
	//   11   21:aload_0         
	//   12   22:aload_0         
	//   13   23:getfield        #82  <Field int mInitialActivityCount>
	//   14   26:invokevirtual   #382 <Method void showPopupUnchecked(int)>
			return true;
	//   15   29:iconst_1        
	//   16   30:ireturn         
		}
	}

	void showPopupUnchecked(int i)
	{
		if(mAdapter.getDataModel() == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #198 <Field ActivityChooserView$ActivityChooserViewAdapter mAdapter>
	//*   2    4:invokevirtual   #265 <Method ActivityChooserModel ActivityChooserView$ActivityChooserViewAdapter.getDataModel()>
	//*   3    7:ifnonnull       21
			throw new IllegalStateException("No data model. Did you call #setDataModel?");
	//    4   10:new             #384 <Class IllegalStateException>
	//    5   13:dup             
	//    6   14:ldc2            #386 <String "No data model. Did you call #setDataModel?">
	//    7   17:invokespecial   #389 <Method void IllegalStateException(String)>
	//    8   20:athrow          
		getViewTreeObserver().addOnGlobalLayoutListener(mOnGlobalLayoutListener);
	//    9   21:aload_0         
	//   10   22:invokevirtual   #252 <Method ViewTreeObserver getViewTreeObserver()>
	//   11   25:aload_0         
	//   12   26:getfield        #80  <Field android.view.ViewTreeObserver$OnGlobalLayoutListener mOnGlobalLayoutListener>
	//   13   29:invokevirtual   #392 <Method void ViewTreeObserver.addOnGlobalLayoutListener(android.view.ViewTreeObserver$OnGlobalLayoutListener)>
		boolean flag;
		if(mDefaultActivityButton.getVisibility() == 0)
	//*  14   32:aload_0         
	//*  15   33:getfield        #161 <Field FrameLayout mDefaultActivityButton>
	//*  16   36:invokevirtual   #323 <Method int FrameLayout.getVisibility()>
	//*  17   39:ifne            48
			flag = true;
	//   18   42:iconst_1        
	//   19   43:istore          4
		else
	//*  20   45:goto            51
			flag = false;
	//   21   48:iconst_0        
	//   22   49:istore          4
		int k = mAdapter.getActivityCount();
	//   23   51:aload_0         
	//   24   52:getfield        #198 <Field ActivityChooserView$ActivityChooserViewAdapter mAdapter>
	//   25   55:invokevirtual   #395 <Method int ActivityChooserView$ActivityChooserViewAdapter.getActivityCount()>
	//   26   58:istore_3        
		int j;
		if(flag)
	//*  27   59:iload           4
	//*  28   61:ifeq            69
			j = 1;
	//   29   64:iconst_1        
	//   30   65:istore_2        
		else
	//*  31   66:goto            71
			j = 0;
	//   32   69:iconst_0        
	//   33   70:istore_2        
		if(i != 0x7fffffff && k > i + j)
	//*  34   71:iload_1         
	//*  35   72:ldc2            #396 <Int 0x7fffffff>
	//*  36   75:icmpeq          106
	//*  37   78:iload_3         
	//*  38   79:iload_1         
	//*  39   80:iload_2         
	//*  40   81:iadd            
	//*  41   82:icmple          106
		{
			mAdapter.setShowFooterView(true);
	//   42   85:aload_0         
	//   43   86:getfield        #198 <Field ActivityChooserView$ActivityChooserViewAdapter mAdapter>
	//   44   89:iconst_1        
	//   45   90:invokevirtual   #399 <Method void ActivityChooserView$ActivityChooserViewAdapter.setShowFooterView(boolean)>
			mAdapter.setMaxActivityCount(i - 1);
	//   46   93:aload_0         
	//   47   94:getfield        #198 <Field ActivityChooserView$ActivityChooserViewAdapter mAdapter>
	//   48   97:iload_1         
	//   49   98:iconst_1        
	//   50   99:isub            
	//   51  100:invokevirtual   #402 <Method void ActivityChooserView$ActivityChooserViewAdapter.setMaxActivityCount(int)>
		} else
	//*  52  103:goto            122
		{
			mAdapter.setShowFooterView(false);
	//   53  106:aload_0         
	//   54  107:getfield        #198 <Field ActivityChooserView$ActivityChooserViewAdapter mAdapter>
	//   55  110:iconst_0        
	//   56  111:invokevirtual   #399 <Method void ActivityChooserView$ActivityChooserViewAdapter.setShowFooterView(boolean)>
			mAdapter.setMaxActivityCount(i);
	//   57  114:aload_0         
	//   58  115:getfield        #198 <Field ActivityChooserView$ActivityChooserViewAdapter mAdapter>
	//   59  118:iload_1         
	//   60  119:invokevirtual   #402 <Method void ActivityChooserView$ActivityChooserViewAdapter.setMaxActivityCount(int)>
		}
		ListPopupWindow listpopupwindow = getListPopupWindow();
	//   61  122:aload_0         
	//   62  123:invokevirtual   #243 <Method ListPopupWindow getListPopupWindow()>
	//   63  126:astore          5
		if(!listpopupwindow.isShowing())
	//*  64  128:aload           5
	//*  65  130:invokevirtual   #292 <Method boolean ListPopupWindow.isShowing()>
	//*  66  133:ifne            227
		{
			if(mIsSelectingDefaultActivity || !flag)
	//*  67  136:aload_0         
	//*  68  137:getfield        #379 <Field boolean mIsSelectingDefaultActivity>
	//*  69  140:ifne            148
	//*  70  143:iload           4
	//*  71  145:ifne            161
				mAdapter.setShowDefaultActivity(true, flag);
	//   72  148:aload_0         
	//   73  149:getfield        #198 <Field ActivityChooserView$ActivityChooserViewAdapter mAdapter>
	//   74  152:iconst_1        
	//   75  153:iload           4
	//   76  155:invokevirtual   #406 <Method void ActivityChooserView$ActivityChooserViewAdapter.setShowDefaultActivity(boolean, boolean)>
			else
	//*  77  158:goto            170
				mAdapter.setShowDefaultActivity(false, false);
	//   78  161:aload_0         
	//   79  162:getfield        #198 <Field ActivityChooserView$ActivityChooserViewAdapter mAdapter>
	//   80  165:iconst_0        
	//   81  166:iconst_0        
	//   82  167:invokevirtual   #406 <Method void ActivityChooserView$ActivityChooserViewAdapter.setShowDefaultActivity(boolean, boolean)>
			listpopupwindow.setContentWidth(Math.min(mAdapter.measureContentWidth(), mListPopupMaxWidth));
	//   83  170:aload           5
	//   84  172:aload_0         
	//   85  173:getfield        #198 <Field ActivityChooserView$ActivityChooserViewAdapter mAdapter>
	//   86  176:invokevirtual   #409 <Method int ActivityChooserView$ActivityChooserViewAdapter.measureContentWidth()>
	//   87  179:aload_0         
	//   88  180:getfield        #234 <Field int mListPopupMaxWidth>
	//   89  183:invokestatic    #412 <Method int Math.min(int, int)>
	//   90  186:invokevirtual   #415 <Method void ListPopupWindow.setContentWidth(int)>
			listpopupwindow.show();
	//   91  189:aload           5
	//   92  191:invokevirtual   #418 <Method void ListPopupWindow.show()>
			if(mProvider != null)
	//*  93  194:aload_0         
	//*  94  195:getfield        #376 <Field ActionProvider mProvider>
	//*  95  198:ifnull          209
				mProvider.subUiVisibilityChanged(true);
	//   96  201:aload_0         
	//   97  202:getfield        #376 <Field ActionProvider mProvider>
	//   98  205:iconst_1        
	//   99  206:invokevirtual   #423 <Method void ActionProvider.subUiVisibilityChanged(boolean)>
			listpopupwindow.getListView().setContentDescription(((CharSequence) (getContext().getString(android.support.v7.appcompat.R.string.abc_activitychooserview_choose_application))));
	//  100  209:aload           5
	//  101  211:invokevirtual   #427 <Method ListView ListPopupWindow.getListView()>
	//  102  214:aload_0         
	//  103  215:invokevirtual   #117 <Method Context getContext()>
	//  104  218:getstatic       #432 <Field int android.support.v7.appcompat.R$string.abc_activitychooserview_choose_application>
	//  105  221:invokevirtual   #364 <Method String Context.getString(int)>
	//  106  224:invokevirtual   #435 <Method void ListView.setContentDescription(CharSequence)>
		}
	//  107  227:return          
	}

	void updateAppearance()
	{
		if(mAdapter.getCount() > 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #198 <Field ActivityChooserView$ActivityChooserViewAdapter mAdapter>
	//*   2    4:invokevirtual   #439 <Method int ActivityChooserView$ActivityChooserViewAdapter.getCount()>
	//*   3    7:ifle            21
			mExpandActivityOverflowButton.setEnabled(true);
	//    4   10:aload_0         
	//    5   11:getfield        #189 <Field FrameLayout mExpandActivityOverflowButton>
	//    6   14:iconst_1        
	//    7   15:invokevirtual   #442 <Method void FrameLayout.setEnabled(boolean)>
		else
	//*   8   18:goto            29
			mExpandActivityOverflowButton.setEnabled(false);
	//    9   21:aload_0         
	//   10   22:getfield        #189 <Field FrameLayout mExpandActivityOverflowButton>
	//   11   25:iconst_0        
	//   12   26:invokevirtual   #442 <Method void FrameLayout.setEnabled(boolean)>
		int i = mAdapter.getActivityCount();
	//   13   29:aload_0         
	//   14   30:getfield        #198 <Field ActivityChooserView$ActivityChooserViewAdapter mAdapter>
	//   15   33:invokevirtual   #395 <Method int ActivityChooserView$ActivityChooserViewAdapter.getActivityCount()>
	//   16   36:istore_1        
		int j = mAdapter.getHistorySize();
	//   17   37:aload_0         
	//   18   38:getfield        #198 <Field ActivityChooserView$ActivityChooserViewAdapter mAdapter>
	//   19   41:invokevirtual   #445 <Method int ActivityChooserView$ActivityChooserViewAdapter.getHistorySize()>
	//   20   44:istore_2        
		if(i == 1 || i > 1 && j > 0)
	//*  21   45:iload_1         
	//*  22   46:iconst_1        
	//*  23   47:icmpeq          59
	//*  24   50:iload_1         
	//*  25   51:iconst_1        
	//*  26   52:icmple          142
	//*  27   55:iload_2         
	//*  28   56:ifle            142
		{
			mDefaultActivityButton.setVisibility(0);
	//   29   59:aload_0         
	//   30   60:getfield        #161 <Field FrameLayout mDefaultActivityButton>
	//   31   63:iconst_0        
	//   32   64:invokevirtual   #448 <Method void FrameLayout.setVisibility(int)>
			Object obj = ((Object) (mAdapter.getDefaultActivity()));
	//   33   67:aload_0         
	//   34   68:getfield        #198 <Field ActivityChooserView$ActivityChooserViewAdapter mAdapter>
	//   35   71:invokevirtual   #452 <Method ResolveInfo ActivityChooserView$ActivityChooserViewAdapter.getDefaultActivity()>
	//   36   74:astore_3        
			android.content.pm.PackageManager packagemanager = getContext().getPackageManager();
	//   37   75:aload_0         
	//   38   76:invokevirtual   #117 <Method Context getContext()>
	//   39   79:invokevirtual   #456 <Method android.content.pm.PackageManager Context.getPackageManager()>
	//   40   82:astore          4
			mDefaultActivityButtonImage.setImageDrawable(((ResolveInfo) (obj)).loadIcon(packagemanager));
	//   41   84:aload_0         
	//   42   85:getfield        #177 <Field ImageView mDefaultActivityButtonImage>
	//   43   88:aload_3         
	//   44   89:aload           4
	//   45   91:invokevirtual   #462 <Method Drawable ResolveInfo.loadIcon(android.content.pm.PackageManager)>
	//   46   94:invokevirtual   #195 <Method void ImageView.setImageDrawable(Drawable)>
			if(mDefaultActionButtonContentDescription != 0)
	//*  47   97:aload_0         
	//*  48   98:getfield        #359 <Field int mDefaultActionButtonContentDescription>
	//*  49  101:ifeq            139
			{
				obj = ((Object) (((ResolveInfo) (obj)).loadLabel(packagemanager)));
	//   50  104:aload_3         
	//   51  105:aload           4
	//   52  107:invokevirtual   #466 <Method CharSequence ResolveInfo.loadLabel(android.content.pm.PackageManager)>
	//   53  110:astore_3        
				obj = ((Object) (getContext().getString(mDefaultActionButtonContentDescription, new Object[] {
					obj
				})));
	//   54  111:aload_0         
	//   55  112:invokevirtual   #117 <Method Context getContext()>
	//   56  115:aload_0         
	//   57  116:getfield        #359 <Field int mDefaultActionButtonContentDescription>
	//   58  119:iconst_1        
	//   59  120:anewarray       Object[]
	//   60  123:dup             
	//   61  124:iconst_0        
	//   62  125:aload_3         
	//   63  126:aastore         
	//   64  127:invokevirtual   #471 <Method String Context.getString(int, Object[])>
	//   65  130:astore_3        
				mDefaultActivityButton.setContentDescription(((CharSequence) (obj)));
	//   66  131:aload_0         
	//   67  132:getfield        #161 <Field FrameLayout mDefaultActivityButton>
	//   68  135:aload_3         
	//   69  136:invokevirtual   #472 <Method void FrameLayout.setContentDescription(CharSequence)>
			}
		} else
	//*  70  139:goto            151
		{
			mDefaultActivityButton.setVisibility(8);
	//   71  142:aload_0         
	//   72  143:getfield        #161 <Field FrameLayout mDefaultActivityButton>
	//   73  146:bipush          8
	//   74  148:invokevirtual   #448 <Method void FrameLayout.setVisibility(int)>
		}
		if(mDefaultActivityButton.getVisibility() == 0)
	//*  75  151:aload_0         
	//*  76  152:getfield        #161 <Field FrameLayout mDefaultActivityButton>
	//*  77  155:invokevirtual   #323 <Method int FrameLayout.getVisibility()>
	//*  78  158:ifne            173
		{
			mActivityChooserContent.setBackgroundDrawable(mActivityChooserContentBackground);
	//   79  161:aload_0         
	//   80  162:getfield        #148 <Field LinearLayoutCompat mActivityChooserContent>
	//   81  165:aload_0         
	//   82  166:getfield        #154 <Field Drawable mActivityChooserContentBackground>
	//   83  169:invokevirtual   #475 <Method void LinearLayoutCompat.setBackgroundDrawable(Drawable)>
			return;
	//   84  172:return          
		} else
		{
			mActivityChooserContent.setBackgroundDrawable(((Drawable) (null)));
	//   85  173:aload_0         
	//   86  174:getfield        #148 <Field LinearLayoutCompat mActivityChooserContent>
	//   87  177:aconst_null     
	//   88  178:invokevirtual   #475 <Method void LinearLayoutCompat.setBackgroundDrawable(Drawable)>
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

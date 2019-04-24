// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.content.Context;
import android.content.pm.ResolveInfo;
import android.view.*;
import android.widget.*;

// Referenced classes of package android.support.v7.widget:
//			ActivityChooserView, ActivityChooserModel

class ActivityChooserView$ActivityChooserViewAdapter extends BaseAdapter
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
	//	               0: 37
	//	               1: 35
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
	//	               0: 106
	//	               1: 35;
	//    3    5:lookupswitch    2: default 32
	//	               0: 106
	//	               1: 35
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
	//   72  180:invokevirtual   #160 <Method android.graphics.drawable.Drawable ResolveInfo.loadIcon(android.content.pm.PackageManager)>
	//   73  183:invokevirtual   #164 <Method void ImageView.setImageDrawable(android.graphics.drawable.Drawable)>
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
	//   14   30:getfield        #208 <Field android.database.DataSetObserver ActivityChooserView.mModelDataSetObserver>
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
	//   28   60:getfield        #208 <Field android.database.DataSetObserver ActivityChooserView.mModelDataSetObserver>
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

	ActivityChooserView$ActivityChooserViewAdapter()
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

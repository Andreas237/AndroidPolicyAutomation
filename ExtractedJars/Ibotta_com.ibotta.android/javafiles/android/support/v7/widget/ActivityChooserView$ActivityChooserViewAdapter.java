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

private class ActivityChooserView$ActivityChooserViewAdapter extends BaseAdapter
{

	public int getActivityCount()
	{
		return mDataModel.getActivityCount();
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field ActivityChooserModel mDataModel>
	//    2    4:invokevirtual   #35  <Method int ActivityChooserModel.getActivityCount()>
	//    3    7:ireturn         
	}

	public int getCount()
	{
		int j = mDataModel.getActivityCount();
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field ActivityChooserModel mDataModel>
	//    2    4:invokevirtual   #35  <Method int ActivityChooserModel.getActivityCount()>
	//    3    7:istore_2        
		int i = j;
	//    4    8:iload_2         
	//    5    9:istore_1        
		if(!mShowDefaultActivity)
	//*   6   10:aload_0         
	//*   7   11:getfield        #38  <Field boolean mShowDefaultActivity>
	//*   8   14:ifne            33
		{
			i = j;
	//    9   17:iload_2         
	//   10   18:istore_1        
			if(mDataModel.getDefaultActivity() != null)
	//*  11   19:aload_0         
	//*  12   20:getfield        #31  <Field ActivityChooserModel mDataModel>
	//*  13   23:invokevirtual   #42  <Method ResolveInfo ActivityChooserModel.getDefaultActivity()>
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
	//   21   35:getfield        #26  <Field int mMaxActivityCount>
	//   22   38:invokestatic    #48  <Method int Math.min(int, int)>
	//   23   41:istore_2        
		i = j;
	//   24   42:iload_2         
	//   25   43:istore_1        
		if(mShowFooterView)
	//*  26   44:aload_0         
	//*  27   45:getfield        #50  <Field boolean mShowFooterView>
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
	//    1    1:getfield        #31  <Field ActivityChooserModel mDataModel>
	//    2    4:areturn         
	}

	public ResolveInfo getDefaultActivity()
	{
		return mDataModel.getDefaultActivity();
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field ActivityChooserModel mDataModel>
	//    2    4:invokevirtual   #42  <Method ResolveInfo ActivityChooserModel.getDefaultActivity()>
	//    3    7:areturn         
	}

	public int getHistorySize()
	{
		return mDataModel.getHistorySize();
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field ActivityChooserModel mDataModel>
	//    2    4:invokevirtual   #55  <Method int ActivityChooserModel.getHistorySize()>
	//    3    7:ireturn         
	}

	public Object getItem(int i)
	{
		int j;
		switch(getItemViewType(i))
	//*   0    0:aload_0         
	//*   1    1:iload_1         
	//*   2    2:invokevirtual   #61  <Method int getItemViewType(int)>
		{
	//*   3    5:tableswitch     0 1: default 28
	//	               0 38
	//	               1 36
		default:
			throw new IllegalArgumentException();
	//    4   28:new             #63  <Class IllegalArgumentException>
	//    5   31:dup             
	//    6   32:invokespecial   #64  <Method void IllegalArgumentException()>
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
	//*  13   41:getfield        #38  <Field boolean mShowDefaultActivity>
	//*  14   44:ifne            63
		{
			j = i;
	//   15   47:iload_1         
	//   16   48:istore_2        
			if(mDataModel.getDefaultActivity() != null)
	//*  17   49:aload_0         
	//*  18   50:getfield        #31  <Field ActivityChooserModel mDataModel>
	//*  19   53:invokevirtual   #42  <Method ResolveInfo ActivityChooserModel.getDefaultActivity()>
	//*  20   56:ifnull          63
				j = i + 1;
	//   21   59:iload_1         
	//   22   60:iconst_1        
	//   23   61:iadd            
	//   24   62:istore_2        
		}
		return ((Object) (mDataModel.getActivity(j)));
	//   25   63:aload_0         
	//   26   64:getfield        #31  <Field ActivityChooserModel mDataModel>
	//   27   67:iload_2         
	//   28   68:invokevirtual   #68  <Method ResolveInfo ActivityChooserModel.getActivity(int)>
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
	//    1    1:getfield        #50  <Field boolean mShowFooterView>
	//    2    4:ifeq            19
	//    3    7:iload_1         
	//    4    8:aload_0         
	//    5    9:invokevirtual   #72  <Method int getCount()>
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
	//    1    1:getfield        #38  <Field boolean mShowDefaultActivity>
	//    2    4:ireturn         
	}

	public View getView(int i, View view, ViewGroup viewgroup)
	{
		getItemViewType(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #61  <Method int getItemViewType(int)>
		JVM INSTR tableswitch 0 1: default 28
	//	               0 107
	//	               1 36;
	//    3    5:tableswitch     0 1: default 28
	//	               0 107
	//	               1 36
		   goto _L1 _L2 _L3
_L1:
		throw new IllegalArgumentException();
	//    4   28:new             #63  <Class IllegalArgumentException>
	//    5   31:dup             
	//    6   32:invokespecial   #64  <Method void IllegalArgumentException()>
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
	//   13   44:invokevirtual   #81  <Method int View.getId()>
	//   14   47:iconst_1        
	//   15   48:icmpeq          104
_L5:
		view1 = LayoutInflater.from(getContext()).inflate(android.support.v7.appcompat.R.layout.abc_activity_chooser_view_list_item, viewgroup, false);
	//   16   51:aload_0         
	//   17   52:getfield        #21  <Field ActivityChooserView this$0>
	//   18   55:invokevirtual   #85  <Method Context ActivityChooserView.getContext()>
	//   19   58:invokestatic    #91  <Method LayoutInflater LayoutInflater.from(Context)>
	//   20   61:getstatic       #96  <Field int android.support.v7.appcompat.R$layout.abc_activity_chooser_view_list_item>
	//   21   64:aload_3         
	//   22   65:iconst_0        
	//   23   66:invokevirtual   #100 <Method View LayoutInflater.inflate(int, ViewGroup, boolean)>
	//   24   69:astore          4
		view1.setId(1);
	//   25   71:aload           4
	//   26   73:iconst_1        
	//   27   74:invokevirtual   #104 <Method void View.setId(int)>
		((TextView)view1.findViewById(android.support.v7.appcompat.R.id.title)).setText(((CharSequence) (getContext().getString(android.support.v7.appcompat.R.string.abc_activity_chooser_view_see_all))));
	//   28   77:aload           4
	//   29   79:getstatic       #109 <Field int android.support.v7.appcompat.R$id.title>
	//   30   82:invokevirtual   #113 <Method View View.findViewById(int)>
	//   31   85:checkcast       #115 <Class TextView>
	//   32   88:aload_0         
	//   33   89:getfield        #21  <Field ActivityChooserView this$0>
	//   34   92:invokevirtual   #85  <Method Context ActivityChooserView.getContext()>
	//   35   95:getstatic       #120 <Field int android.support.v7.appcompat.R$string.abc_activity_chooser_view_see_all>
	//   36   98:invokevirtual   #126 <Method String Context.getString(int)>
	//   37  101:invokevirtual   #130 <Method void TextView.setText(CharSequence)>
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
	//   45  115:invokevirtual   #81  <Method int View.getId()>
	//   46  118:getstatic       #133 <Field int android.support.v7.appcompat.R$id.list_item>
	//   47  121:icmpeq          144
_L8:
		view1 = LayoutInflater.from(getContext()).inflate(android.support.v7.appcompat.R.layout.abc_activity_chooser_view_list_item, viewgroup, false);
	//   48  124:aload_0         
	//   49  125:getfield        #21  <Field ActivityChooserView this$0>
	//   50  128:invokevirtual   #85  <Method Context ActivityChooserView.getContext()>
	//   51  131:invokestatic    #91  <Method LayoutInflater LayoutInflater.from(Context)>
	//   52  134:getstatic       #96  <Field int android.support.v7.appcompat.R$layout.abc_activity_chooser_view_list_item>
	//   53  137:aload_3         
	//   54  138:iconst_0        
	//   55  139:invokevirtual   #100 <Method View LayoutInflater.inflate(int, ViewGroup, boolean)>
	//   56  142:astore          4
_L9:
		view = ((View) (getContext().getPackageManager()));
	//   57  144:aload_0         
	//   58  145:getfield        #21  <Field ActivityChooserView this$0>
	//   59  148:invokevirtual   #85  <Method Context ActivityChooserView.getContext()>
	//   60  151:invokevirtual   #137 <Method android.content.pm.PackageManager Context.getPackageManager()>
	//   61  154:astore_2        
		viewgroup = ((ViewGroup) ((ImageView)view1.findViewById(android.support.v7.appcompat.R.id.icon)));
	//   62  155:aload           4
	//   63  157:getstatic       #140 <Field int android.support.v7.appcompat.R$id.icon>
	//   64  160:invokevirtual   #113 <Method View View.findViewById(int)>
	//   65  163:checkcast       #142 <Class ImageView>
	//   66  166:astore_3        
		ResolveInfo resolveinfo = (ResolveInfo)getItem(i);
	//   67  167:aload_0         
	//   68  168:iload_1         
	//   69  169:invokevirtual   #144 <Method Object getItem(int)>
	//   70  172:checkcast       #146 <Class ResolveInfo>
	//   71  175:astore          5
		((ImageView) (viewgroup)).setImageDrawable(resolveinfo.loadIcon(((android.content.pm.PackageManager) (view))));
	//   72  177:aload_3         
	//   73  178:aload           5
	//   74  180:aload_2         
	//   75  181:invokevirtual   #150 <Method android.graphics.drawable.Drawable ResolveInfo.loadIcon(android.content.pm.PackageManager)>
	//   76  184:invokevirtual   #154 <Method void ImageView.setImageDrawable(android.graphics.drawable.Drawable)>
		((TextView)view1.findViewById(android.support.v7.appcompat.R.id.title)).setText(resolveinfo.loadLabel(((android.content.pm.PackageManager) (view))));
	//   77  187:aload           4
	//   78  189:getstatic       #109 <Field int android.support.v7.appcompat.R$id.title>
	//   79  192:invokevirtual   #113 <Method View View.findViewById(int)>
	//   80  195:checkcast       #115 <Class TextView>
	//   81  198:aload           5
	//   82  200:aload_2         
	//   83  201:invokevirtual   #158 <Method CharSequence ResolveInfo.loadLabel(android.content.pm.PackageManager)>
	//   84  204:invokevirtual   #130 <Method void TextView.setText(CharSequence)>
		if(mShowDefaultActivity && i == 0 && mHighlightDefaultActivity)
	//*  85  207:aload_0         
	//*  86  208:getfield        #38  <Field boolean mShowDefaultActivity>
	//*  87  211:ifeq            234
	//*  88  214:iload_1         
	//*  89  215:ifne            234
	//*  90  218:aload_0         
	//*  91  219:getfield        #160 <Field boolean mHighlightDefaultActivity>
	//*  92  222:ifeq            234
		{
			view1.setActivated(true);
	//   93  225:aload           4
	//   94  227:iconst_1        
	//   95  228:invokevirtual   #164 <Method void View.setActivated(boolean)>
			return view1;
	//   96  231:aload           4
	//   97  233:areturn         
		} else
		{
			view1.setActivated(false);
	//   98  234:aload           4
	//   99  236:iconst_0        
	//  100  237:invokevirtual   #164 <Method void View.setActivated(boolean)>
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
		int k = mMaxActivityCount;
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field int mMaxActivityCount>
	//    2    4:istore_3        
		mMaxActivityCount = 0x7fffffff;
	//    3    5:aload_0         
	//    4    6:ldc1            #167 <Int 0x7fffffff>
	//    5    8:putfield        #26  <Field int mMaxActivityCount>
		int i = 0;
	//    6   11:iconst_0        
	//    7   12:istore_1        
		int l = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
	//    8   13:iconst_0        
	//    9   14:iconst_0        
	//   10   15:invokestatic    #172 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//   11   18:istore          4
		int i1 = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
	//   12   20:iconst_0        
	//   13   21:iconst_0        
	//   14   22:invokestatic    #172 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//   15   25:istore          5
		int j1 = getCount();
	//   16   27:aload_0         
	//   17   28:invokevirtual   #72  <Method int getCount()>
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
	//   30   49:invokevirtual   #174 <Method View getView(int, View, ViewGroup)>
	//   31   52:astore          7
			view.measure(l, i1);
	//   32   54:aload           7
	//   33   56:iload           4
	//   34   58:iload           5
	//   35   60:invokevirtual   #178 <Method void View.measure(int, int)>
			j = Math.max(j, view.getMeasuredWidth());
	//   36   63:iload_2         
	//   37   64:aload           7
	//   38   66:invokevirtual   #181 <Method int View.getMeasuredWidth()>
	//   39   69:invokestatic    #184 <Method int Math.max(int, int)>
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
	//   48   82:putfield        #26  <Field int mMaxActivityCount>
		return j;
	//   49   85:iload_2         
	//   50   86:ireturn         
	}

	public void setDataModel(ActivityChooserModel activitychoosermodel)
	{
		ActivityChooserModel activitychoosermodel1 = mAdapter.getDataModel();
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field ActivityChooserView this$0>
	//    2    4:getfield        #190 <Field ActivityChooserView$ActivityChooserViewAdapter ActivityChooserView.mAdapter>
	//    3    7:invokevirtual   #192 <Method ActivityChooserModel getDataModel()>
	//    4   10:astore_2        
		if(activitychoosermodel1 != null && isShown())
	//*   5   11:aload_2         
	//*   6   12:ifnull          36
	//*   7   15:aload_0         
	//*   8   16:getfield        #21  <Field ActivityChooserView this$0>
	//*   9   19:invokevirtual   #195 <Method boolean ActivityChooserView.isShown()>
	//*  10   22:ifeq            36
			activitychoosermodel1.unregisterObserver(((Object) (mModelDataSetObserver)));
	//   11   25:aload_2         
	//   12   26:aload_0         
	//   13   27:getfield        #21  <Field ActivityChooserView this$0>
	//   14   30:getfield        #199 <Field android.database.DataSetObserver ActivityChooserView.mModelDataSetObserver>
	//   15   33:invokevirtual   #203 <Method void ActivityChooserModel.unregisterObserver(Object)>
		mDataModel = activitychoosermodel;
	//   16   36:aload_0         
	//   17   37:aload_1         
	//   18   38:putfield        #31  <Field ActivityChooserModel mDataModel>
		if(activitychoosermodel != null && isShown())
	//*  19   41:aload_1         
	//*  20   42:ifnull          66
	//*  21   45:aload_0         
	//*  22   46:getfield        #21  <Field ActivityChooserView this$0>
	//*  23   49:invokevirtual   #195 <Method boolean ActivityChooserView.isShown()>
	//*  24   52:ifeq            66
			activitychoosermodel.registerObserver(((Object) (mModelDataSetObserver)));
	//   25   55:aload_1         
	//   26   56:aload_0         
	//   27   57:getfield        #21  <Field ActivityChooserView this$0>
	//   28   60:getfield        #199 <Field android.database.DataSetObserver ActivityChooserView.mModelDataSetObserver>
	//   29   63:invokevirtual   #206 <Method void ActivityChooserModel.registerObserver(Object)>
		notifyDataSetChanged();
	//   30   66:aload_0         
	//   31   67:invokevirtual   #209 <Method void notifyDataSetChanged()>
	//   32   70:return          
	}

	public void setMaxActivityCount(int i)
	{
		if(mMaxActivityCount != i)
	//*   0    0:aload_0         
	//*   1    1:getfield        #26  <Field int mMaxActivityCount>
	//*   2    4:iload_1         
	//*   3    5:icmpeq          17
		{
			mMaxActivityCount = i;
	//    4    8:aload_0         
	//    5    9:iload_1         
	//    6   10:putfield        #26  <Field int mMaxActivityCount>
			notifyDataSetChanged();
	//    7   13:aload_0         
	//    8   14:invokevirtual   #209 <Method void notifyDataSetChanged()>
		}
	//    9   17:return          
	}

	public void setShowDefaultActivity(boolean flag, boolean flag1)
	{
		if(mShowDefaultActivity != flag || mHighlightDefaultActivity != flag1)
	//*   0    0:aload_0         
	//*   1    1:getfield        #38  <Field boolean mShowDefaultActivity>
	//*   2    4:iload_1         
	//*   3    5:icmpne          16
	//*   4    8:aload_0         
	//*   5    9:getfield        #160 <Field boolean mHighlightDefaultActivity>
	//*   6   12:iload_2         
	//*   7   13:icmpeq          30
		{
			mShowDefaultActivity = flag;
	//    8   16:aload_0         
	//    9   17:iload_1         
	//   10   18:putfield        #38  <Field boolean mShowDefaultActivity>
			mHighlightDefaultActivity = flag1;
	//   11   21:aload_0         
	//   12   22:iload_2         
	//   13   23:putfield        #160 <Field boolean mHighlightDefaultActivity>
			notifyDataSetChanged();
	//   14   26:aload_0         
	//   15   27:invokevirtual   #209 <Method void notifyDataSetChanged()>
		}
	//   16   30:return          
	}

	public void setShowFooterView(boolean flag)
	{
		if(mShowFooterView != flag)
	//*   0    0:aload_0         
	//*   1    1:getfield        #50  <Field boolean mShowFooterView>
	//*   2    4:iload_1         
	//*   3    5:icmpeq          17
		{
			mShowFooterView = flag;
	//    4    8:aload_0         
	//    5    9:iload_1         
	//    6   10:putfield        #50  <Field boolean mShowFooterView>
			notifyDataSetChanged();
	//    7   13:aload_0         
	//    8   14:invokevirtual   #209 <Method void notifyDataSetChanged()>
		}
	//    9   17:return          
	}

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
	//    2    2:putfield        #21  <Field ActivityChooserView this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #24  <Method void BaseAdapter()>
		mMaxActivityCount = 4;
	//    5    9:aload_0         
	//    6   10:iconst_4        
	//    7   11:putfield        #26  <Field int mMaxActivityCount>
	//    8   14:return          
	}
}

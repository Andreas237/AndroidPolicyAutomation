// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.ibotta.android.mvp.ui.activity.bonus;

import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.SwipeRefreshLayout;
import android.view.*;
import android.widget.FrameLayout;
import butterknife.ButterKnife;
import com.ibotta.android.mvp.ui.misc.scrolllistner.SincereSwipeRefreshScrollListener;
import com.ibotta.android.mvp.ui.view.bonus.picker.BonusPickerListView;
import com.ibotta.android.mvp.ui.view.bonus.picker.BonusPickerRecyclerListener;
import com.ibotta.android.mvp.ui.view.bonus.picker.row.FeaturedBonusRow;
import com.ibotta.api.model.BonusModel;
import java.util.*;

// Referenced classes of package com.ibotta.android.mvp.ui.activity.bonus:
//			BonusPickerTab

public class BonusPickerPagerAdapter extends PagerAdapter
{
	protected static class ViewHolder
	{

		protected BonusPickerListView bplvBonusList;

		public ViewHolder(ViewGroup viewgroup)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #17  <Method void Object()>
			ButterKnife.bind(((Object) (this)), ((View) (viewgroup)));
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:invokestatic    #23  <Method butterknife.Unbinder ButterKnife.bind(Object, View)>
		//    5    9:pop             
		//    6   10:return          
		}
	}


	public BonusPickerPagerAdapter()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #25  <Method void PagerAdapter()>
		tabs = ((List) (new ArrayList()));
	//    2    4:aload_0         
	//    3    5:new             #27  <Class ArrayList>
	//    4    8:dup             
	//    5    9:invokespecial   #28  <Method void ArrayList()>
	//    6   12:putfield        #30  <Field List tabs>
		dataMap = ((Map) (new LinkedHashMap()));
	//    7   15:aload_0         
	//    8   16:new             #32  <Class LinkedHashMap>
	//    9   19:dup             
	//   10   20:invokespecial   #33  <Method void LinkedHashMap()>
	//   11   23:putfield        #35  <Field Map dataMap>
		listViewMap = ((Map) (new HashMap()));
	//   12   26:aload_0         
	//   13   27:new             #37  <Class HashMap>
	//   14   30:dup             
	//   15   31:invokespecial   #38  <Method void HashMap()>
	//   16   34:putfield        #40  <Field Map listViewMap>
	//   17   37:return          
	}

	private void initBonusPickerList(int i, FrameLayout framelayout, ViewHolder viewholder)
	{
		ButterKnife.bind(((Object) (viewholder)), ((View) (framelayout)));
	//    0    0:aload_3         
	//    1    1:aload_2         
	//    2    2:invokestatic    #49  <Method butterknife.Unbinder ButterKnife.bind(Object, View)>
	//    3    5:pop             
		viewholder.bplvBonusList.setListener(listener);
	//    4    6:aload_3         
	//    5    7:getfield        #53  <Field BonusPickerListView BonusPickerPagerAdapter$ViewHolder.bplvBonusList>
	//    6   10:aload_0         
	//    7   11:getfield        #55  <Field BonusPickerRecyclerListener listener>
	//    8   14:invokevirtual   #61  <Method void BonusPickerListView.setListener(BonusPickerRecyclerListener)>
		viewholder.bplvBonusList.setRows((List)dataMap.get(tabs.get(i)));
	//    9   17:aload_3         
	//   10   18:getfield        #53  <Field BonusPickerListView BonusPickerPagerAdapter$ViewHolder.bplvBonusList>
	//   11   21:aload_0         
	//   12   22:getfield        #35  <Field Map dataMap>
	//   13   25:aload_0         
	//   14   26:getfield        #30  <Field List tabs>
	//   15   29:iload_1         
	//   16   30:invokeinterface #67  <Method Object List.get(int)>
	//   17   35:invokeinterface #72  <Method Object Map.get(Object)>
	//   18   40:checkcast       #63  <Class List>
	//   19   43:invokevirtual   #76  <Method void BonusPickerListView.setRows(List)>
		viewholder.bplvBonusList.addOnScrollListener(((android.support.v7.widget.RecyclerView.OnScrollListener) (new SincereSwipeRefreshScrollListener(srlSwipeRefresh))));
	//   20   46:aload_3         
	//   21   47:getfield        #53  <Field BonusPickerListView BonusPickerPagerAdapter$ViewHolder.bplvBonusList>
	//   22   50:new             #78  <Class SincereSwipeRefreshScrollListener>
	//   23   53:dup             
	//   24   54:aload_0         
	//   25   55:getfield        #80  <Field SwipeRefreshLayout srlSwipeRefresh>
	//   26   58:invokespecial   #83  <Method void SincereSwipeRefreshScrollListener(SwipeRefreshLayout)>
	//   27   61:invokevirtual   #87  <Method void BonusPickerListView.addOnScrollListener(android.support.v7.widget.RecyclerView$OnScrollListener)>
		listViewMap.put(((Object) ((BonusPickerTab)tabs.get(i))), ((Object) (viewholder.bplvBonusList)));
	//   28   64:aload_0         
	//   29   65:getfield        #40  <Field Map listViewMap>
	//   30   68:aload_0         
	//   31   69:getfield        #30  <Field List tabs>
	//   32   72:iload_1         
	//   33   73:invokeinterface #67  <Method Object List.get(int)>
	//   34   78:checkcast       #89  <Class BonusPickerTab>
	//   35   81:aload_3         
	//   36   82:getfield        #53  <Field BonusPickerListView BonusPickerPagerAdapter$ViewHolder.bplvBonusList>
	//   37   85:invokeinterface #93  <Method Object Map.put(Object, Object)>
	//   38   90:pop             
	//   39   91:return          
	}

	public void destroyItem(ViewGroup viewgroup, int i, Object obj)
	{
		((ViewPager)viewgroup).removeView(((View) ((FrameLayout)obj)));
	//    0    0:aload_1         
	//    1    1:checkcast       #97  <Class ViewPager>
	//    2    4:aload_3         
	//    3    5:checkcast       #99  <Class FrameLayout>
	//    4    8:invokevirtual   #103 <Method void ViewPager.removeView(View)>
	//    5   11:return          
	}

	public int getCount()
	{
		return tabs.size();
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field List tabs>
	//    2    4:invokeinterface #108 <Method int List.size()>
	//    3    9:ireturn         
	}

	public CharSequence getPageTitle(int i)
	{
		return ((CharSequence) (((BonusPickerTab)tabs.get(i)).getName()));
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field List tabs>
	//    2    4:iload_1         
	//    3    5:invokeinterface #67  <Method Object List.get(int)>
	//    4   10:checkcast       #89  <Class BonusPickerTab>
	//    5   13:invokevirtual   #114 <Method String BonusPickerTab.getName()>
	//    6   16:areturn         
	}

	public Object instantiateItem(ViewGroup viewgroup, int i)
	{
		FrameLayout framelayout = (FrameLayout)LayoutInflater.from(viewgroup.getContext()).inflate(0x7f0c0138, ((ViewGroup) (null)), false);
	//    0    0:aload_1         
	//    1    1:invokevirtual   #122 <Method android.content.Context ViewGroup.getContext()>
	//    2    4:invokestatic    #128 <Method LayoutInflater LayoutInflater.from(android.content.Context)>
	//    3    7:ldc1            #129 <Int 0x7f0c0138>
	//    4    9:aconst_null     
	//    5   10:iconst_0        
	//    6   11:invokevirtual   #133 <Method View LayoutInflater.inflate(int, ViewGroup, boolean)>
	//    7   14:checkcast       #99  <Class FrameLayout>
	//    8   17:astore_3        
		initBonusPickerList(i, framelayout, new ViewHolder(((ViewGroup) (framelayout))));
	//    9   18:aload_0         
	//   10   19:iload_2         
	//   11   20:aload_3         
	//   12   21:new             #6   <Class BonusPickerPagerAdapter$ViewHolder>
	//   13   24:dup             
	//   14   25:aload_3         
	//   15   26:invokespecial   #136 <Method void BonusPickerPagerAdapter$ViewHolder(ViewGroup)>
	//   16   29:invokespecial   #138 <Method void initBonusPickerList(int, FrameLayout, BonusPickerPagerAdapter$ViewHolder)>
		viewgroup.addView(((View) (framelayout)));
	//   17   32:aload_1         
	//   18   33:aload_3         
	//   19   34:invokevirtual   #141 <Method void ViewGroup.addView(View)>
		return ((Object) (framelayout));
	//   20   37:aload_3         
	//   21   38:areturn         
	}

	public boolean isViewFromObject(View view, Object obj)
	{
		return view == obj;
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:if_acmpne       7
	//    3    5:iconst_1        
	//    4    6:ireturn         
	//    5    7:iconst_0        
	//    6    8:ireturn         
	}

	public void setDataMap(LinkedHashMap linkedhashmap)
	{
		if(linkedhashmap != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          12
			dataMap = ((Map) (linkedhashmap));
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #35  <Field Map dataMap>
		else
	//*   5    9:goto            21
			dataMap.clear();
	//    6   12:aload_0         
	//    7   13:getfield        #35  <Field Map dataMap>
	//    8   16:invokeinterface #148 <Method void Map.clear()>
		tabs = ((List) (new ArrayList(((java.util.Collection) (linkedhashmap.keySet())))));
	//    9   21:aload_0         
	//   10   22:new             #27  <Class ArrayList>
	//   11   25:dup             
	//   12   26:aload_1         
	//   13   27:invokevirtual   #152 <Method java.util.Set LinkedHashMap.keySet()>
	//   14   30:invokespecial   #155 <Method void ArrayList(java.util.Collection)>
	//   15   33:putfield        #30  <Field List tabs>
		notifyDataSetChanged();
	//   16   36:aload_0         
	//   17   37:invokevirtual   #158 <Method void notifyDataSetChanged()>
	//   18   40:return          
	}

	public void setListener(BonusPickerRecyclerListener bonuspickerrecyclerlistener)
	{
		listener = bonuspickerrecyclerlistener;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #55  <Field BonusPickerRecyclerListener listener>
	//    3    5:return          
	}

	public void setSwipeRefresh(SwipeRefreshLayout swiperefreshlayout)
	{
		srlSwipeRefresh = swiperefreshlayout;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #80  <Field SwipeRefreshLayout srlSwipeRefresh>
	//    3    5:return          
	}

	public void setTabHidden(android.support.design.widget.TabLayout.Tab tab)
	{
		tab = ((android.support.design.widget.TabLayout.Tab) ((BonusPickerListView)listViewMap.get(((Object) (BonusPickerTab.values()[tab.getPosition()])))));
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field Map listViewMap>
	//    2    4:invokestatic    #167 <Method BonusPickerTab[] BonusPickerTab.values()>
	//    3    7:aload_1         
	//    4    8:invokevirtual   #172 <Method int android.support.design.widget.TabLayout$Tab.getPosition()>
	//    5   11:aaload          
	//    6   12:invokeinterface #72  <Method Object Map.get(Object)>
	//    7   17:checkcast       #57  <Class BonusPickerListView>
	//    8   20:astore_1        
		if(tab != null)
	//*   9   21:aload_1         
	//*  10   22:ifnull          30
			((BonusPickerListView) (tab)).onVisibilityChanged(false);
	//   11   25:aload_1         
	//   12   26:iconst_0        
	//   13   27:invokevirtual   #176 <Method void BonusPickerListView.onVisibilityChanged(boolean)>
	//   14   30:return          
	}

	public void setTabVisible(android.support.design.widget.TabLayout.Tab tab)
	{
		selectedTab = tab;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #179 <Field android.support.design.widget.TabLayout$Tab selectedTab>
		tab = ((android.support.design.widget.TabLayout.Tab) ((BonusPickerListView)listViewMap.get(((Object) (BonusPickerTab.values()[tab.getPosition()])))));
	//    3    5:aload_0         
	//    4    6:getfield        #40  <Field Map listViewMap>
	//    5    9:invokestatic    #167 <Method BonusPickerTab[] BonusPickerTab.values()>
	//    6   12:aload_1         
	//    7   13:invokevirtual   #172 <Method int android.support.design.widget.TabLayout$Tab.getPosition()>
	//    8   16:aaload          
	//    9   17:invokeinterface #72  <Method Object Map.get(Object)>
	//   10   22:checkcast       #57  <Class BonusPickerListView>
	//   11   25:astore_1        
		if(tab != null)
	//*  12   26:aload_1         
	//*  13   27:ifnull          35
			((BonusPickerListView) (tab)).onVisibilityChanged(true);
	//   14   30:aload_1         
	//   15   31:iconst_1        
	//   16   32:invokevirtual   #176 <Method void BonusPickerListView.onVisibilityChanged(boolean)>
	//   17   35:return          
	}

	public void trackBonusClick(BonusModel bonusmodel)
	{
		if(selectedTab == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #179 <Field android.support.design.widget.TabLayout$Tab selectedTab>
	//*   2    4:ifnonnull       8
			return;
	//    3    7:return          
		BonusPickerListView bonuspickerlistview = (BonusPickerListView)listViewMap.get(((Object) (BonusPickerTab.values()[selectedTab.getPosition()])));
	//    4    8:aload_0         
	//    5    9:getfield        #40  <Field Map listViewMap>
	//    6   12:invokestatic    #167 <Method BonusPickerTab[] BonusPickerTab.values()>
	//    7   15:aload_0         
	//    8   16:getfield        #179 <Field android.support.design.widget.TabLayout$Tab selectedTab>
	//    9   19:invokevirtual   #172 <Method int android.support.design.widget.TabLayout$Tab.getPosition()>
	//   10   22:aaload          
	//   11   23:invokeinterface #72  <Method Object Map.get(Object)>
	//   12   28:checkcast       #57  <Class BonusPickerListView>
	//   13   31:astore_2        
		if(bonuspickerlistview != null)
	//*  14   32:aload_2         
	//*  15   33:ifnull          41
			bonuspickerlistview.trackBonusClick(bonusmodel);
	//   16   36:aload_2         
	//   17   37:aload_1         
	//   18   38:invokevirtual   #183 <Method void BonusPickerListView.trackBonusClick(BonusModel)>
	//   19   41:return          
	}

	public void trackSubListContentClicked(FeaturedBonusRow featuredbonusrow, BonusModel bonusmodel, int i)
	{
		if(selectedTab == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #179 <Field android.support.design.widget.TabLayout$Tab selectedTab>
	//*   2    4:ifnonnull       8
			return;
	//    3    7:return          
		BonusPickerListView bonuspickerlistview = (BonusPickerListView)listViewMap.get(((Object) (BonusPickerTab.values()[selectedTab.getPosition()])));
	//    4    8:aload_0         
	//    5    9:getfield        #40  <Field Map listViewMap>
	//    6   12:invokestatic    #167 <Method BonusPickerTab[] BonusPickerTab.values()>
	//    7   15:aload_0         
	//    8   16:getfield        #179 <Field android.support.design.widget.TabLayout$Tab selectedTab>
	//    9   19:invokevirtual   #172 <Method int android.support.design.widget.TabLayout$Tab.getPosition()>
	//   10   22:aaload          
	//   11   23:invokeinterface #72  <Method Object Map.get(Object)>
	//   12   28:checkcast       #57  <Class BonusPickerListView>
	//   13   31:astore          4
		if(bonuspickerlistview != null)
	//*  14   33:aload           4
	//*  15   35:ifnull          46
			bonuspickerlistview.trackSubListContentClicked(featuredbonusrow, bonusmodel, i);
	//   16   38:aload           4
	//   17   40:aload_1         
	//   18   41:aload_2         
	//   19   42:iload_3         
	//   20   43:invokevirtual   #187 <Method void BonusPickerListView.trackSubListContentClicked(FeaturedBonusRow, BonusModel, int)>
	//   21   46:return          
	}

	public void trackSubListContentVisible(FeaturedBonusRow featuredbonusrow, BonusModel bonusmodel, int i)
	{
		if(selectedTab == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #179 <Field android.support.design.widget.TabLayout$Tab selectedTab>
	//*   2    4:ifnonnull       8
			return;
	//    3    7:return          
		BonusPickerListView bonuspickerlistview = (BonusPickerListView)listViewMap.get(((Object) (BonusPickerTab.values()[selectedTab.getPosition()])));
	//    4    8:aload_0         
	//    5    9:getfield        #40  <Field Map listViewMap>
	//    6   12:invokestatic    #167 <Method BonusPickerTab[] BonusPickerTab.values()>
	//    7   15:aload_0         
	//    8   16:getfield        #179 <Field android.support.design.widget.TabLayout$Tab selectedTab>
	//    9   19:invokevirtual   #172 <Method int android.support.design.widget.TabLayout$Tab.getPosition()>
	//   10   22:aaload          
	//   11   23:invokeinterface #72  <Method Object Map.get(Object)>
	//   12   28:checkcast       #57  <Class BonusPickerListView>
	//   13   31:astore          4
		if(bonuspickerlistview != null)
	//*  14   33:aload           4
	//*  15   35:ifnull          46
			bonuspickerlistview.trackSubListContentVisible(featuredbonusrow, bonusmodel, i);
	//   16   38:aload           4
	//   17   40:aload_1         
	//   18   41:aload_2         
	//   19   42:iload_3         
	//   20   43:invokevirtual   #190 <Method void BonusPickerListView.trackSubListContentVisible(FeaturedBonusRow, BonusModel, int)>
	//   21   46:return          
	}

	private Map dataMap;
	private Map listViewMap;
	private BonusPickerRecyclerListener listener;
	private android.support.design.widget.TabLayout.Tab selectedTab;
	private SwipeRefreshLayout srlSwipeRefresh;
	private List tabs;
}

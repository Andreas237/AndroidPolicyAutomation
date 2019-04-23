// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.databinding.adapters;

import android.content.Context;
import android.databinding.ObservableList;
import android.view.*;
import android.widget.BaseAdapter;
import android.widget.TextView;
import java.util.List;

class ObservableListAdapter extends BaseAdapter
{

	public ObservableListAdapter(Context context, List list, int i, int j, int k)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #29  <Method void BaseAdapter()>
		mContext = context;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #31  <Field Context mContext>
		mResourceId = i;
	//    5    9:aload_0         
	//    6   10:iload_3         
	//    7   11:putfield        #33  <Field int mResourceId>
		mDropDownResourceId = j;
	//    8   14:aload_0         
	//    9   15:iload           4
	//   10   17:putfield        #35  <Field int mDropDownResourceId>
		mTextViewResourceId = k;
	//   11   20:aload_0         
	//   12   21:iload           5
	//   13   23:putfield        #37  <Field int mTextViewResourceId>
		if(i == 0)
	//*  14   26:iload_3         
	//*  15   27:ifne            35
			context = null;
	//   16   30:aconst_null     
	//   17   31:astore_1        
		else
	//*  18   32:goto            45
			context = ((Context) ((LayoutInflater)context.getSystemService("layout_inflater")));
	//   19   35:aload_1         
	//   20   36:ldc1            #39  <String "layout_inflater">
	//   21   38:invokevirtual   #45  <Method Object Context.getSystemService(String)>
	//   22   41:checkcast       #47  <Class LayoutInflater>
	//   23   44:astore_1        
		mLayoutInflater = ((LayoutInflater) (context));
	//   24   45:aload_0         
	//   25   46:aload_1         
	//   26   47:putfield        #49  <Field LayoutInflater mLayoutInflater>
		setList(list);
	//   27   50:aload_0         
	//   28   51:aload_2         
	//   29   52:invokevirtual   #53  <Method void setList(List)>
	//   30   55:return          
	}

	public int getCount()
	{
		return mList.size();
	//    0    0:aload_0         
	//    1    1:getfield        #60  <Field List mList>
	//    2    4:invokeinterface #65  <Method int List.size()>
	//    3    9:ireturn         
	}

	public View getDropDownView(int i, View view, ViewGroup viewgroup)
	{
		return getViewForResource(mDropDownResourceId, i, view, viewgroup);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field int mDropDownResourceId>
	//    3    5:iload_1         
	//    4    6:aload_2         
	//    5    7:aload_3         
	//    6    8:invokevirtual   #71  <Method View getViewForResource(int, int, View, ViewGroup)>
	//    7   11:areturn         
	}

	public Object getItem(int i)
	{
		return mList.get(i);
	//    0    0:aload_0         
	//    1    1:getfield        #60  <Field List mList>
	//    2    4:iload_1         
	//    3    5:invokeinterface #76  <Method Object List.get(int)>
	//    4   10:areturn         
	}

	public long getItemId(int i)
	{
		return (long)i;
	//    0    0:iload_1         
	//    1    1:i2l             
	//    2    2:lreturn         
	}

	public View getView(int i, View view, ViewGroup viewgroup)
	{
		return getViewForResource(mResourceId, i, view, viewgroup);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #33  <Field int mResourceId>
	//    3    5:iload_1         
	//    4    6:aload_2         
	//    5    7:aload_3         
	//    6    8:invokevirtual   #71  <Method View getViewForResource(int, int, View, ViewGroup)>
	//    7   11:areturn         
	}

	public View getViewForResource(int i, int j, View view, ViewGroup viewgroup)
	{
		Object obj = ((Object) (view));
	//    0    0:aload_3         
	//    1    1:astore          5
		if(view == null)
	//*   2    3:aload_3         
	//*   3    4:ifnonnull       40
			if(i == 0)
	//*   4    7:iload_1         
	//*   5    8:ifne            27
				obj = ((Object) (new TextView(mContext)));
	//    6   11:new             #81  <Class TextView>
	//    7   14:dup             
	//    8   15:aload_0         
	//    9   16:getfield        #31  <Field Context mContext>
	//   10   19:invokespecial   #84  <Method void TextView(Context)>
	//   11   22:astore          5
			else
	//*  12   24:goto            40
				obj = ((Object) (mLayoutInflater.inflate(i, viewgroup, false)));
	//   13   27:aload_0         
	//   14   28:getfield        #49  <Field LayoutInflater mLayoutInflater>
	//   15   31:iload_1         
	//   16   32:aload           4
	//   17   34:iconst_0        
	//   18   35:invokevirtual   #88  <Method View LayoutInflater.inflate(int, ViewGroup, boolean)>
	//   19   38:astore          5
		i = mTextViewResourceId;
	//   20   40:aload_0         
	//   21   41:getfield        #37  <Field int mTextViewResourceId>
	//   22   44:istore_1        
		if(i == 0)
	//*  23   45:iload_1         
	//*  24   46:ifne            55
			view = ((View) (obj));
	//   25   49:aload           5
	//   26   51:astore_3        
		else
	//*  27   52:goto            62
			view = ((View) (obj)).findViewById(i);
	//   28   55:aload           5
	//   29   57:iload_1         
	//   30   58:invokevirtual   #94  <Method View View.findViewById(int)>
	//   31   61:astore_3        
		viewgroup = ((ViewGroup) ((TextView)view));
	//   32   62:aload_3         
	//   33   63:checkcast       #81  <Class TextView>
	//   34   66:astore          4
		view = ((View) (mList.get(j)));
	//   35   68:aload_0         
	//   36   69:getfield        #60  <Field List mList>
	//   37   72:iload_2         
	//   38   73:invokeinterface #76  <Method Object List.get(int)>
	//   39   78:astore_3        
		if(view instanceof CharSequence)
	//*  40   79:aload_3         
	//*  41   80:instanceof      #96  <Class CharSequence>
	//*  42   83:ifeq            94
			view = ((View) ((CharSequence)view));
	//   43   86:aload_3         
	//   44   87:checkcast       #96  <Class CharSequence>
	//   45   90:astore_3        
		else
	//*  46   91:goto            99
			view = ((View) (String.valueOf(((Object) (view)))));
	//   47   94:aload_3         
	//   48   95:invokestatic    #102 <Method String String.valueOf(Object)>
	//   49   98:astore_3        
		((TextView) (viewgroup)).setText(((CharSequence) (view)));
	//   50   99:aload           4
	//   51  101:aload_3         
	//   52  102:invokevirtual   #106 <Method void TextView.setText(CharSequence)>
		return ((View) (obj));
	//   53  105:aload           5
	//   54  107:areturn         
	}

	public void setList(List list)
	{
		List list1 = mList;
	//    0    0:aload_0         
	//    1    1:getfield        #60  <Field List mList>
	//    2    4:astore_2        
		if(list1 == list)
	//*   3    5:aload_2         
	//*   4    6:aload_1         
	//*   5    7:if_acmpne       11
			return;
	//    6   10:return          
		if(list1 instanceof ObservableList)
	//*   7   11:aload_2         
	//*   8   12:instanceof      #108 <Class ObservableList>
	//*   9   15:ifeq            31
			((ObservableList)list1).removeOnListChangedCallback(mListChangedCallback);
	//   10   18:aload_2         
	//   11   19:checkcast       #108 <Class ObservableList>
	//   12   22:aload_0         
	//   13   23:getfield        #110 <Field android.databinding.ObservableList$OnListChangedCallback mListChangedCallback>
	//   14   26:invokeinterface #114 <Method void ObservableList.removeOnListChangedCallback(android.databinding.ObservableList$OnListChangedCallback)>
		mList = list;
	//   15   31:aload_0         
	//   16   32:aload_1         
	//   17   33:putfield        #60  <Field List mList>
		if(mList instanceof ObservableList)
	//*  18   36:aload_0         
	//*  19   37:getfield        #60  <Field List mList>
	//*  20   40:instanceof      #108 <Class ObservableList>
	//*  21   43:ifeq            81
		{
			if(mListChangedCallback == null)
	//*  22   46:aload_0         
	//*  23   47:getfield        #110 <Field android.databinding.ObservableList$OnListChangedCallback mListChangedCallback>
	//*  24   50:ifnonnull       65
				mListChangedCallback = ((android.databinding.ObservableList.OnListChangedCallback) (new android.databinding.ObservableList.OnListChangedCallback() {

					public void onChanged(ObservableList observablelist)
					{
						notifyDataSetChanged();
					//    0    0:aload_0         
					//    1    1:getfield        #15  <Field ObservableListAdapter this$0>
					//    2    4:invokevirtual   #24  <Method void ObservableListAdapter.notifyDataSetChanged()>
					//    3    7:return          
					}

					public void onItemRangeChanged(ObservableList observablelist, int i, int j)
					{
						notifyDataSetChanged();
					//    0    0:aload_0         
					//    1    1:getfield        #15  <Field ObservableListAdapter this$0>
					//    2    4:invokevirtual   #24  <Method void ObservableListAdapter.notifyDataSetChanged()>
					//    3    7:return          
					}

					public void onItemRangeInserted(ObservableList observablelist, int i, int j)
					{
						notifyDataSetChanged();
					//    0    0:aload_0         
					//    1    1:getfield        #15  <Field ObservableListAdapter this$0>
					//    2    4:invokevirtual   #24  <Method void ObservableListAdapter.notifyDataSetChanged()>
					//    3    7:return          
					}

					public void onItemRangeMoved(ObservableList observablelist, int i, int j, int k)
					{
						notifyDataSetChanged();
					//    0    0:aload_0         
					//    1    1:getfield        #15  <Field ObservableListAdapter this$0>
					//    2    4:invokevirtual   #24  <Method void ObservableListAdapter.notifyDataSetChanged()>
					//    3    7:return          
					}

					public void onItemRangeRemoved(ObservableList observablelist, int i, int j)
					{
						notifyDataSetChanged();
					//    0    0:aload_0         
					//    1    1:getfield        #15  <Field ObservableListAdapter this$0>
					//    2    4:invokevirtual   #24  <Method void ObservableListAdapter.notifyDataSetChanged()>
					//    3    7:return          
					}

					final ObservableListAdapter this$0;

			
			{
				this$0 = ObservableListAdapter.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #15  <Field ObservableListAdapter this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #18  <Method void android.databinding.ObservableList$OnListChangedCallback()>
			//    5    9:return          
			}
				}
));
	//   25   53:aload_0         
	//   26   54:new             #7   <Class ObservableListAdapter$1>
	//   27   57:dup             
	//   28   58:aload_0         
	//   29   59:invokespecial   #117 <Method void ObservableListAdapter$1(ObservableListAdapter)>
	//   30   62:putfield        #110 <Field android.databinding.ObservableList$OnListChangedCallback mListChangedCallback>
			((ObservableList)mList).addOnListChangedCallback(mListChangedCallback);
	//   31   65:aload_0         
	//   32   66:getfield        #60  <Field List mList>
	//   33   69:checkcast       #108 <Class ObservableList>
	//   34   72:aload_0         
	//   35   73:getfield        #110 <Field android.databinding.ObservableList$OnListChangedCallback mListChangedCallback>
	//   36   76:invokeinterface #120 <Method void ObservableList.addOnListChangedCallback(android.databinding.ObservableList$OnListChangedCallback)>
		}
		notifyDataSetChanged();
	//   37   81:aload_0         
	//   38   82:invokevirtual   #123 <Method void notifyDataSetChanged()>
	//   39   85:return          
	}

	private final Context mContext;
	private final int mDropDownResourceId;
	private final LayoutInflater mLayoutInflater;
	private List mList;
	private android.databinding.ObservableList.OnListChangedCallback mListChangedCallback;
	private final int mResourceId;
	private final int mTextViewResourceId;
}

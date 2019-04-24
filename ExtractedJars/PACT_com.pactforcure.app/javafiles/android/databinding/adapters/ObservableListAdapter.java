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
	//    1    1:invokespecial   #25  <Method void BaseAdapter()>
		mContext = context;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #27  <Field Context mContext>
		mResourceId = i;
	//    5    9:aload_0         
	//    6   10:iload_3         
	//    7   11:putfield        #29  <Field int mResourceId>
		mDropDownResourceId = j;
	//    8   14:aload_0         
	//    9   15:iload           4
	//   10   17:putfield        #31  <Field int mDropDownResourceId>
		mTextViewResourceId = k;
	//   11   20:aload_0         
	//   12   21:iload           5
	//   13   23:putfield        #33  <Field int mTextViewResourceId>
		if(i == 0)
	//*  14   26:iload_3         
	//*  15   27:ifne            43
			context = null;
	//   16   30:aconst_null     
	//   17   31:astore_1        
		else
	//*  18   32:aload_0         
	//*  19   33:aload_1         
	//*  20   34:putfield        #35  <Field LayoutInflater mLayoutInflater>
	//*  21   37:aload_0         
	//*  22   38:aload_2         
	//*  23   39:invokevirtual   #39  <Method void setList(List)>
	//*  24   42:return          
			context = ((Context) ((LayoutInflater)context.getSystemService("layout_inflater")));
	//   25   43:aload_1         
	//   26   44:ldc1            #41  <String "layout_inflater">
	//   27   46:invokevirtual   #47  <Method Object Context.getSystemService(String)>
	//   28   49:checkcast       #49  <Class LayoutInflater>
	//   29   52:astore_1        
		mLayoutInflater = ((LayoutInflater) (context));
		setList(list);
	//*  30   53:goto            32
	}

	public int getCount()
	{
		return mList.size();
	//    0    0:aload_0         
	//    1    1:getfield        #56  <Field List mList>
	//    2    4:invokeinterface #61  <Method int List.size()>
	//    3    9:ireturn         
	}

	public View getDropDownView(int i, View view, ViewGroup viewgroup)
	{
		return getViewForResource(mDropDownResourceId, i, view, viewgroup);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #31  <Field int mDropDownResourceId>
	//    3    5:iload_1         
	//    4    6:aload_2         
	//    5    7:aload_3         
	//    6    8:invokevirtual   #67  <Method View getViewForResource(int, int, View, ViewGroup)>
	//    7   11:areturn         
	}

	public Object getItem(int i)
	{
		return mList.get(i);
	//    0    0:aload_0         
	//    1    1:getfield        #56  <Field List mList>
	//    2    4:iload_1         
	//    3    5:invokeinterface #72  <Method Object List.get(int)>
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
	//    2    2:getfield        #29  <Field int mResourceId>
	//    3    5:iload_1         
	//    4    6:aload_2         
	//    5    7:aload_3         
	//    6    8:invokevirtual   #67  <Method View getViewForResource(int, int, View, ViewGroup)>
	//    7   11:areturn         
	}

	public View getViewForResource(int i, int j, View view, ViewGroup viewgroup)
	{
		Object obj = ((Object) (view));
	//    0    0:aload_3         
	//    1    1:astore          5
		if(view == null)
	//*   2    3:aload_3         
	//*   3    4:ifnonnull       24
			if(i == 0)
	//*   4    7:iload_1         
	//*   5    8:ifne            75
				obj = ((Object) (new TextView(mContext)));
	//    6   11:new             #77  <Class TextView>
	//    7   14:dup             
	//    8   15:aload_0         
	//    9   16:getfield        #27  <Field Context mContext>
	//   10   19:invokespecial   #80  <Method void TextView(Context)>
	//   11   22:astore          5
			else
	//*  12   24:aload_0         
	//*  13   25:getfield        #33  <Field int mTextViewResourceId>
	//*  14   28:ifne            91
	//*  15   31:aload           5
	//*  16   33:astore_3        
	//*  17   34:aload_3         
	//*  18   35:checkcast       #77  <Class TextView>
	//*  19   38:checkcast       #77  <Class TextView>
	//*  20   41:astore          4
	//*  21   43:aload_0         
	//*  22   44:getfield        #56  <Field List mList>
	//*  23   47:iload_2         
	//*  24   48:invokeinterface #72  <Method Object List.get(int)>
	//*  25   53:astore_3        
	//*  26   54:aload_3         
	//*  27   55:instanceof      #82  <Class CharSequence>
	//*  28   58:ifeq            104
	//*  29   61:aload_3         
	//*  30   62:checkcast       #82  <Class CharSequence>
	//*  31   65:astore_3        
	//*  32   66:aload           4
	//*  33   68:aload_3         
	//*  34   69:invokevirtual   #86  <Method void TextView.setText(CharSequence)>
	//*  35   72:aload           5
	//*  36   74:areturn         
				obj = ((Object) (mLayoutInflater.inflate(i, viewgroup, false)));
	//   37   75:aload_0         
	//   38   76:getfield        #35  <Field LayoutInflater mLayoutInflater>
	//   39   79:iload_1         
	//   40   80:aload           4
	//   41   82:iconst_0        
	//   42   83:invokevirtual   #90  <Method View LayoutInflater.inflate(int, ViewGroup, boolean)>
	//   43   86:astore          5
		if(mTextViewResourceId == 0)
			view = ((View) (obj));
		else
	//*  44   88:goto            24
			view = ((View) (obj)).findViewById(mTextViewResourceId);
	//   45   91:aload           5
	//   46   93:aload_0         
	//   47   94:getfield        #33  <Field int mTextViewResourceId>
	//   48   97:invokevirtual   #96  <Method View View.findViewById(int)>
	//   49  100:astore_3        
		viewgroup = ((ViewGroup) ((TextView)(TextView)view));
		view = ((View) (mList.get(j)));
		if(view instanceof CharSequence)
			view = ((View) ((CharSequence)view));
		else
	//*  50  101:goto            34
			view = ((View) (String.valueOf(((Object) (view)))));
	//   51  104:aload_3         
	//   52  105:invokestatic    #102 <Method String String.valueOf(Object)>
	//   53  108:astore_3        
		((TextView) (viewgroup)).setText(((CharSequence) (view)));
		return ((View) (obj));
	//*  54  109:goto            66
	}

	public void setList(List list)
	{
		if(mList == list)
	//*   0    0:aload_0         
	//*   1    1:getfield        #56  <Field List mList>
	//*   2    4:aload_1         
	//*   3    5:if_acmpne       9
			return;
	//    4    8:return          
		if(mList instanceof ObservableList)
	//*   5    9:aload_0         
	//*   6   10:getfield        #56  <Field List mList>
	//*   7   13:instanceof      #104 <Class ObservableList>
	//*   8   16:ifeq            35
			((ObservableList)mList).removeOnListChangedCallback(mListChangedCallback);
	//    9   19:aload_0         
	//   10   20:getfield        #56  <Field List mList>
	//   11   23:checkcast       #104 <Class ObservableList>
	//   12   26:aload_0         
	//   13   27:getfield        #106 <Field android.databinding.ObservableList$OnListChangedCallback mListChangedCallback>
	//   14   30:invokeinterface #110 <Method void ObservableList.removeOnListChangedCallback(android.databinding.ObservableList$OnListChangedCallback)>
		mList = list;
	//   15   35:aload_0         
	//   16   36:aload_1         
	//   17   37:putfield        #56  <Field List mList>
		if(mList instanceof ObservableList)
	//*  18   40:aload_0         
	//*  19   41:getfield        #56  <Field List mList>
	//*  20   44:instanceof      #104 <Class ObservableList>
	//*  21   47:ifeq            85
		{
			if(mListChangedCallback == null)
	//*  22   50:aload_0         
	//*  23   51:getfield        #106 <Field android.databinding.ObservableList$OnListChangedCallback mListChangedCallback>
	//*  24   54:ifnonnull       69
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
	//   25   57:aload_0         
	//   26   58:new             #7   <Class ObservableListAdapter$1>
	//   27   61:dup             
	//   28   62:aload_0         
	//   29   63:invokespecial   #113 <Method void ObservableListAdapter$1(ObservableListAdapter)>
	//   30   66:putfield        #106 <Field android.databinding.ObservableList$OnListChangedCallback mListChangedCallback>
			((ObservableList)mList).addOnListChangedCallback(mListChangedCallback);
	//   31   69:aload_0         
	//   32   70:getfield        #56  <Field List mList>
	//   33   73:checkcast       #104 <Class ObservableList>
	//   34   76:aload_0         
	//   35   77:getfield        #106 <Field android.databinding.ObservableList$OnListChangedCallback mListChangedCallback>
	//   36   80:invokeinterface #116 <Method void ObservableList.addOnListChangedCallback(android.databinding.ObservableList$OnListChangedCallback)>
		}
		notifyDataSetChanged();
	//   37   85:aload_0         
	//   38   86:invokevirtual   #119 <Method void notifyDataSetChanged()>
	//   39   89:return          
	}

	private final Context mContext;
	private final int mDropDownResourceId;
	private final LayoutInflater mLayoutInflater;
	private List mList;
	private android.databinding.ObservableList.OnListChangedCallback mListChangedCallback;
	private final int mResourceId;
	private final int mTextViewResourceId;
}

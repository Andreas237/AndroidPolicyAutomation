// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v14.preference;

import android.support.v7.preference.Preference;
import android.support.v7.widget.RecyclerView;

// Referenced classes of package android.support.v14.preference:
//			PreferenceFragment

private static class PreferenceFragment$ScrollToPreferenceObserver extends android.support.v7.widget.RecyclerView.AdapterDataObserver
{

	private void scrollToPreference()
	{
		mAdapter.unregisterAdapterDataObserver(((android.support.v7.widget.RecyclerView.AdapterDataObserver) (this)));
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field android.support.v7.widget.RecyclerView$Adapter mAdapter>
	//    2    4:aload_0         
	//    3    5:invokevirtual   #36  <Method void android.support.v7.widget.RecyclerView$Adapter.unregisterAdapterDataObserver(android.support.v7.widget.RecyclerView$AdapterDataObserver)>
		int i;
		if(mPreference != null)
	//*   4    8:aload_0         
	//*   5    9:getfield        #26  <Field Preference mPreference>
	//*   6   12:ifnull          46
			i = ((android.support.v7.preference.PreferenceGroup.PreferencePositionCallback)mAdapter).getPreferenceAdapterPosition(mPreference);
	//    7   15:aload_0         
	//    8   16:getfield        #22  <Field android.support.v7.widget.RecyclerView$Adapter mAdapter>
	//    9   19:checkcast       #38  <Class android.support.v7.preference.PreferenceGroup$PreferencePositionCallback>
	//   10   22:aload_0         
	//   11   23:getfield        #26  <Field Preference mPreference>
	//   12   26:invokeinterface #42  <Method int android.support.v7.preference.PreferenceGroup$PreferencePositionCallback.getPreferenceAdapterPosition(Preference)>
	//   13   31:istore_1        
		else
	//*  14   32:iload_1         
	//*  15   33:iconst_m1       
	//*  16   34:icmpeq          45
	//*  17   37:aload_0         
	//*  18   38:getfield        #24  <Field RecyclerView mList>
	//*  19   41:iload_1         
	//*  20   42:invokevirtual   #48  <Method void RecyclerView.scrollToPosition(int)>
	//*  21   45:return          
			i = ((android.support.v7.preference.PreferenceGroup.PreferencePositionCallback)mAdapter).getPreferenceAdapterPosition(mKey);
	//   22   46:aload_0         
	//   23   47:getfield        #22  <Field android.support.v7.widget.RecyclerView$Adapter mAdapter>
	//   24   50:checkcast       #38  <Class android.support.v7.preference.PreferenceGroup$PreferencePositionCallback>
	//   25   53:aload_0         
	//   26   54:getfield        #28  <Field String mKey>
	//   27   57:invokeinterface #51  <Method int android.support.v7.preference.PreferenceGroup$PreferencePositionCallback.getPreferenceAdapterPosition(String)>
	//   28   62:istore_1        
		if(i != -1)
			mList.scrollToPosition(i);
	//*  29   63:goto            32
	}

	public void onChanged()
	{
		scrollToPreference();
	//    0    0:aload_0         
	//    1    1:invokespecial   #54  <Method void scrollToPreference()>
	//    2    4:return          
	}

	public void onItemRangeChanged(int i, int j)
	{
		scrollToPreference();
	//    0    0:aload_0         
	//    1    1:invokespecial   #54  <Method void scrollToPreference()>
	//    2    4:return          
	}

	public void onItemRangeChanged(int i, int j, Object obj)
	{
		scrollToPreference();
	//    0    0:aload_0         
	//    1    1:invokespecial   #54  <Method void scrollToPreference()>
	//    2    4:return          
	}

	public void onItemRangeInserted(int i, int j)
	{
		scrollToPreference();
	//    0    0:aload_0         
	//    1    1:invokespecial   #54  <Method void scrollToPreference()>
	//    2    4:return          
	}

	public void onItemRangeMoved(int i, int j, int k)
	{
		scrollToPreference();
	//    0    0:aload_0         
	//    1    1:invokespecial   #54  <Method void scrollToPreference()>
	//    2    4:return          
	}

	public void onItemRangeRemoved(int i, int j)
	{
		scrollToPreference();
	//    0    0:aload_0         
	//    1    1:invokespecial   #54  <Method void scrollToPreference()>
	//    2    4:return          
	}

	private final android.support.v7.widget.RecyclerView.Adapter mAdapter;
	private final String mKey;
	private final RecyclerView mList;
	private final Preference mPreference;

	public PreferenceFragment$ScrollToPreferenceObserver(android.support.v7.widget.RecyclerView.Adapter adapter, RecyclerView recyclerview, Preference preference, String s)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #20  <Method void android.support.v7.widget.RecyclerView$AdapterDataObserver()>
		mAdapter = adapter;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #22  <Field android.support.v7.widget.RecyclerView$Adapter mAdapter>
		mList = recyclerview;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #24  <Field RecyclerView mList>
		mPreference = preference;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #26  <Field Preference mPreference>
		mKey = s;
	//   11   19:aload_0         
	//   12   20:aload           4
	//   13   22:putfield        #28  <Field String mKey>
	//   14   25:return          
	}
}

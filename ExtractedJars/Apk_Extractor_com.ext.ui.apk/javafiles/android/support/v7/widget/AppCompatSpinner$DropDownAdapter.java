// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.database.DataSetObserver;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;

// Referenced classes of package android.support.v7.widget:
//			AppCompatSpinner, ThemedSpinnerAdapter

private static class AppCompatSpinner$DropDownAdapter
	implements ListAdapter, SpinnerAdapter
{

	public boolean areAllItemsEnabled()
	{
		ListAdapter listadapter = mListAdapter;
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field ListAdapter mListAdapter>
	//    2    4:astore_1        
		if(listadapter != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          16
			return listadapter.areAllItemsEnabled();
	//    5    9:aload_1         
	//    6   10:invokeinterface #51  <Method boolean ListAdapter.areAllItemsEnabled()>
	//    7   15:ireturn         
		else
			return true;
	//    8   16:iconst_1        
	//    9   17:ireturn         
	}

	public int getCount()
	{
		if(mAdapter == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #23  <Field SpinnerAdapter mAdapter>
	//*   2    4:ifnonnull       9
			return 0;
	//    3    7:iconst_0        
	//    4    8:ireturn         
		else
			return mAdapter.getCount();
	//    5    9:aload_0         
	//    6   10:getfield        #23  <Field SpinnerAdapter mAdapter>
	//    7   13:invokeinterface #55  <Method int SpinnerAdapter.getCount()>
	//    8   18:ireturn         
	}

	public View getDropDownView(int i, View view, ViewGroup viewgroup)
	{
		if(mAdapter == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #23  <Field SpinnerAdapter mAdapter>
	//*   2    4:ifnonnull       9
			return null;
	//    3    7:aconst_null     
	//    4    8:areturn         
		else
			return mAdapter.getDropDownView(i, view, viewgroup);
	//    5    9:aload_0         
	//    6   10:getfield        #23  <Field SpinnerAdapter mAdapter>
	//    7   13:iload_1         
	//    8   14:aload_2         
	//    9   15:aload_3         
	//   10   16:invokeinterface #59  <Method View SpinnerAdapter.getDropDownView(int, View, ViewGroup)>
	//   11   21:areturn         
	}

	public Object getItem(int i)
	{
		if(mAdapter == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #23  <Field SpinnerAdapter mAdapter>
	//*   2    4:ifnonnull       9
			return ((Object) (null));
	//    3    7:aconst_null     
	//    4    8:areturn         
		else
			return mAdapter.getItem(i);
	//    5    9:aload_0         
	//    6   10:getfield        #23  <Field SpinnerAdapter mAdapter>
	//    7   13:iload_1         
	//    8   14:invokeinterface #63  <Method Object SpinnerAdapter.getItem(int)>
	//    9   19:areturn         
	}

	public long getItemId(int i)
	{
		if(mAdapter == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #23  <Field SpinnerAdapter mAdapter>
	//*   2    4:ifnonnull       11
			return -1L;
	//    3    7:ldc2w           #66  <Long -1L>
	//    4   10:lreturn         
		else
			return mAdapter.getItemId(i);
	//    5   11:aload_0         
	//    6   12:getfield        #23  <Field SpinnerAdapter mAdapter>
	//    7   15:iload_1         
	//    8   16:invokeinterface #69  <Method long SpinnerAdapter.getItemId(int)>
	//    9   21:lreturn         
	}

	public int getItemViewType(int i)
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public View getView(int i, View view, ViewGroup viewgroup)
	{
		return getDropDownView(i, view, viewgroup);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:invokevirtual   #73  <Method View getDropDownView(int, View, ViewGroup)>
	//    5    7:areturn         
	}

	public int getViewTypeCount()
	{
		return 1;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	public boolean hasStableIds()
	{
		return mAdapter != null && mAdapter.hasStableIds();
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field SpinnerAdapter mAdapter>
	//    2    4:ifnull          21
	//    3    7:aload_0         
	//    4    8:getfield        #23  <Field SpinnerAdapter mAdapter>
	//    5   11:invokeinterface #77  <Method boolean SpinnerAdapter.hasStableIds()>
	//    6   16:ifeq            21
	//    7   19:iconst_1        
	//    8   20:ireturn         
	//    9   21:iconst_0        
	//   10   22:ireturn         
	}

	public boolean isEmpty()
	{
		return getCount() == 0;
	//    0    0:aload_0         
	//    1    1:invokevirtual   #79  <Method int getCount()>
	//    2    4:ifne            9
	//    3    7:iconst_1        
	//    4    8:ireturn         
	//    5    9:iconst_0        
	//    6   10:ireturn         
	}

	public boolean isEnabled(int i)
	{
		ListAdapter listadapter = mListAdapter;
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field ListAdapter mListAdapter>
	//    2    4:astore_2        
		if(listadapter != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          17
			return listadapter.isEnabled(i);
	//    5    9:aload_2         
	//    6   10:iload_1         
	//    7   11:invokeinterface #83  <Method boolean ListAdapter.isEnabled(int)>
	//    8   16:ireturn         
		else
			return true;
	//    9   17:iconst_1        
	//   10   18:ireturn         
	}

	public void registerDataSetObserver(DataSetObserver datasetobserver)
	{
		if(mAdapter != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #23  <Field SpinnerAdapter mAdapter>
	//*   2    4:ifnull          17
			mAdapter.registerDataSetObserver(datasetobserver);
	//    3    7:aload_0         
	//    4    8:getfield        #23  <Field SpinnerAdapter mAdapter>
	//    5   11:aload_1         
	//    6   12:invokeinterface #87  <Method void SpinnerAdapter.registerDataSetObserver(DataSetObserver)>
	//    7   17:return          
	}

	public void unregisterDataSetObserver(DataSetObserver datasetobserver)
	{
		if(mAdapter != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #23  <Field SpinnerAdapter mAdapter>
	//*   2    4:ifnull          17
			mAdapter.unregisterDataSetObserver(datasetobserver);
	//    3    7:aload_0         
	//    4    8:getfield        #23  <Field SpinnerAdapter mAdapter>
	//    5   11:aload_1         
	//    6   12:invokeinterface #90  <Method void SpinnerAdapter.unregisterDataSetObserver(DataSetObserver)>
	//    7   17:return          
	}

	private SpinnerAdapter mAdapter;
	private ListAdapter mListAdapter;

	public AppCompatSpinner$DropDownAdapter(SpinnerAdapter spinneradapter, android.content.res.Resources.Theme theme)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #21  <Method void Object()>
		mAdapter = spinneradapter;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #23  <Field SpinnerAdapter mAdapter>
		if(spinneradapter instanceof ListAdapter)
	//*   5    9:aload_1         
	//*   6   10:instanceof      #6   <Class ListAdapter>
	//*   7   13:ifeq            24
			mListAdapter = (ListAdapter)spinneradapter;
	//    8   16:aload_0         
	//    9   17:aload_1         
	//   10   18:checkcast       #6   <Class ListAdapter>
	//   11   21:putfield        #25  <Field ListAdapter mListAdapter>
		if(theme != null)
	//*  12   24:aload_2         
	//*  13   25:ifnull          65
			if(android.os.Build.VERSION.SDK_INT >= 23 && (spinneradapter instanceof ThemedSpinnerAdapter))
	//*  14   28:getstatic       #31  <Field int android.os.Build$VERSION.SDK_INT>
	//*  15   31:bipush          23
	//*  16   33:icmplt          66
	//*  17   36:aload_1         
	//*  18   37:instanceof      #33  <Class ThemedSpinnerAdapter>
	//*  19   40:ifeq            66
			{
				spinneradapter = ((SpinnerAdapter) ((ThemedSpinnerAdapter)spinneradapter));
	//   20   43:aload_1         
	//   21   44:checkcast       #33  <Class ThemedSpinnerAdapter>
	//   22   47:astore_1        
				if(((ThemedSpinnerAdapter) (spinneradapter)).getDropDownViewTheme() != theme)
	//*  23   48:aload_1         
	//*  24   49:invokeinterface #37  <Method android.content.res.Resources$Theme ThemedSpinnerAdapter.getDropDownViewTheme()>
	//*  25   54:aload_2         
	//*  26   55:if_acmpeq       65
					((ThemedSpinnerAdapter) (spinneradapter)).setDropDownViewTheme(theme);
	//   27   58:aload_1         
	//   28   59:aload_2         
	//   29   60:invokeinterface #41  <Method void ThemedSpinnerAdapter.setDropDownViewTheme(android.content.res.Resources$Theme)>
			} else
	//*  30   65:return          
			if(spinneradapter instanceof android.support.v7.widget.ThemedSpinnerAdapter)
	//*  31   66:aload_1         
	//*  32   67:instanceof      #43  <Class android.support.v7.widget.ThemedSpinnerAdapter>
	//*  33   70:ifeq            65
			{
				spinneradapter = ((SpinnerAdapter) ((android.support.v7.widget.ThemedSpinnerAdapter)spinneradapter));
	//   34   73:aload_1         
	//   35   74:checkcast       #43  <Class android.support.v7.widget.ThemedSpinnerAdapter>
	//   36   77:astore_1        
				if(((android.support.v7.widget.ThemedSpinnerAdapter) (spinneradapter)).getDropDownViewTheme() == null)
	//*  37   78:aload_1         
	//*  38   79:invokeinterface #44  <Method android.content.res.Resources$Theme ThemedSpinnerAdapter.getDropDownViewTheme()>
	//*  39   84:ifnonnull       65
				{
					((android.support.v7.widget.ThemedSpinnerAdapter) (spinneradapter)).setDropDownViewTheme(theme);
	//   40   87:aload_1         
	//   41   88:aload_2         
	//   42   89:invokeinterface #45  <Method void ThemedSpinnerAdapter.setDropDownViewTheme(android.content.res.Resources$Theme)>
					return;
	//   43   94:return          
				}
			}
	}
}

// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.github.ksoichiro.android.observablescrollview;

import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.app.*;
import android.util.SparseArray;
import android.view.ViewGroup;

public abstract class CacheFragmentStatePagerAdapter extends FragmentStatePagerAdapter
{

	public CacheFragmentStatePagerAdapter(FragmentManager fragmentmanager)
	{
		super(fragmentmanager);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #26  <Method void FragmentStatePagerAdapter(FragmentManager)>
		mPages = new SparseArray();
	//    3    5:aload_0         
	//    4    6:new             #28  <Class SparseArray>
	//    5    9:dup             
	//    6   10:invokespecial   #31  <Method void SparseArray()>
	//    7   13:putfield        #33  <Field SparseArray mPages>
		mFm = fragmentmanager;
	//    8   16:aload_0         
	//    9   17:aload_1         
	//   10   18:putfield        #35  <Field FragmentManager mFm>
	//   11   21:return          
	}

	protected String createCacheIndex(int i)
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #40  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #41  <Method void StringBuilder()>
	//    3    7:astore_2        
		stringbuilder.append("pageIndex:");
	//    4    8:aload_2         
	//    5    9:ldc1            #11  <String "pageIndex:">
	//    6   11:invokevirtual   #45  <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		stringbuilder.append(i);
	//    8   15:aload_2         
	//    9   16:iload_1         
	//   10   17:invokevirtual   #48  <Method StringBuilder StringBuilder.append(int)>
	//   11   20:pop             
		return stringbuilder.toString();
	//   12   21:aload_2         
	//   13   22:invokevirtual   #52  <Method String StringBuilder.toString()>
	//   14   25:areturn         
	}

	protected String createCacheKey(int i)
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #40  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #41  <Method void StringBuilder()>
	//    3    7:astore_2        
		stringbuilder.append("page:");
	//    4    8:aload_2         
	//    5    9:ldc1            #14  <String "page:">
	//    6   11:invokevirtual   #45  <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		stringbuilder.append(i);
	//    8   15:aload_2         
	//    9   16:iload_1         
	//   10   17:invokevirtual   #48  <Method StringBuilder StringBuilder.append(int)>
	//   11   20:pop             
		return stringbuilder.toString();
	//   12   21:aload_2         
	//   13   22:invokevirtual   #52  <Method String StringBuilder.toString()>
	//   14   25:areturn         
	}

	protected abstract Fragment createItem(int i);

	public void destroyItem(ViewGroup viewgroup, int i, Object obj)
	{
		if(mPages.indexOfKey(i) >= 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #33  <Field SparseArray mPages>
	//*   2    4:iload_2         
	//*   3    5:invokevirtual   #61  <Method int SparseArray.indexOfKey(int)>
	//*   4    8:iflt            19
			mPages.remove(i);
	//    5   11:aload_0         
	//    6   12:getfield        #33  <Field SparseArray mPages>
	//    7   15:iload_2         
	//    8   16:invokevirtual   #65  <Method void SparseArray.remove(int)>
		super.destroyItem(viewgroup, i, obj);
	//    9   19:aload_0         
	//   10   20:aload_1         
	//   11   21:iload_2         
	//   12   22:aload_3         
	//   13   23:invokespecial   #67  <Method void FragmentStatePagerAdapter.destroyItem(ViewGroup, int, Object)>
	//   14   26:return          
	}

	public Fragment getItem(int i)
	{
		Fragment fragment = createItem(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #70  <Method Fragment createItem(int)>
	//    3    5:astore_2        
		mPages.put(i, ((Object) (fragment)));
	//    4    6:aload_0         
	//    5    7:getfield        #33  <Field SparseArray mPages>
	//    6   10:iload_1         
	//    7   11:aload_2         
	//    8   12:invokevirtual   #74  <Method void SparseArray.put(int, Object)>
		return fragment;
	//    9   15:aload_2         
	//   10   16:areturn         
	}

	public Fragment getItemAt(int i)
	{
		return (Fragment)mPages.get(i);
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field SparseArray mPages>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #79  <Method Object SparseArray.get(int)>
	//    4    8:checkcast       #81  <Class Fragment>
	//    5   11:areturn         
	}

	public void restoreState(Parcelable parcelable, ClassLoader classloader)
	{
		parcelable = ((Parcelable) ((Bundle)parcelable));
	//    0    0:aload_1         
	//    1    1:checkcast       #85  <Class Bundle>
	//    2    4:astore_1        
		int j = ((Bundle) (parcelable)).getInt("pages");
	//    3    5:aload_1         
	//    4    6:ldc1            #8   <String "pages">
	//    5    8:invokevirtual   #89  <Method int Bundle.getInt(String)>
	//    6   11:istore          4
		if(j > 0)
	//*   7   13:iload           4
	//*   8   15:ifle            71
		{
			for(int i = 0; i < j; i++)
	//*   9   18:iconst_0        
	//*  10   19:istore_3        
	//*  11   20:iload_3         
	//*  12   21:iload           4
	//*  13   23:icmpge          71
			{
				int k = ((Bundle) (parcelable)).getInt(createCacheIndex(i));
	//   14   26:aload_1         
	//   15   27:aload_0         
	//   16   28:iload_3         
	//   17   29:invokevirtual   #91  <Method String createCacheIndex(int)>
	//   18   32:invokevirtual   #89  <Method int Bundle.getInt(String)>
	//   19   35:istore          5
				Fragment fragment = mFm.getFragment(((Bundle) (parcelable)), createCacheKey(k));
	//   20   37:aload_0         
	//   21   38:getfield        #35  <Field FragmentManager mFm>
	//   22   41:aload_1         
	//   23   42:aload_0         
	//   24   43:iload           5
	//   25   45:invokevirtual   #93  <Method String createCacheKey(int)>
	//   26   48:invokevirtual   #99  <Method Fragment FragmentManager.getFragment(Bundle, String)>
	//   27   51:astore          6
				mPages.put(k, ((Object) (fragment)));
	//   28   53:aload_0         
	//   29   54:getfield        #33  <Field SparseArray mPages>
	//   30   57:iload           5
	//   31   59:aload           6
	//   32   61:invokevirtual   #74  <Method void SparseArray.put(int, Object)>
			}

	//   33   64:iload_3         
	//   34   65:iconst_1        
	//   35   66:iadd            
	//   36   67:istore_3        
		}
	//*  37   68:goto            20
		super.restoreState(((Bundle) (parcelable)).getParcelable("superState"), classloader);
	//   38   71:aload_0         
	//   39   72:aload_1         
	//   40   73:ldc1            #17  <String "superState">
	//   41   75:invokevirtual   #103 <Method Parcelable Bundle.getParcelable(String)>
	//   42   78:aload_2         
	//   43   79:invokespecial   #105 <Method void FragmentStatePagerAdapter.restoreState(Parcelable, ClassLoader)>
	//   44   82:return          
	}

	public Parcelable saveState()
	{
		Parcelable parcelable = super.saveState();
	//    0    0:aload_0         
	//    1    1:invokespecial   #109 <Method Parcelable FragmentStatePagerAdapter.saveState()>
	//    2    4:astore          4
		Bundle bundle = new Bundle();
	//    3    6:new             #85  <Class Bundle>
	//    4    9:dup             
	//    5   10:invokespecial   #110 <Method void Bundle()>
	//    6   13:astore_3        
		bundle.putParcelable("superState", parcelable);
	//    7   14:aload_3         
	//    8   15:ldc1            #17  <String "superState">
	//    9   17:aload           4
	//   10   19:invokevirtual   #114 <Method void Bundle.putParcelable(String, Parcelable)>
		bundle.putInt("pages", mPages.size());
	//   11   22:aload_3         
	//   12   23:ldc1            #8   <String "pages">
	//   13   25:aload_0         
	//   14   26:getfield        #33  <Field SparseArray mPages>
	//   15   29:invokevirtual   #118 <Method int SparseArray.size()>
	//   16   32:invokevirtual   #122 <Method void Bundle.putInt(String, int)>
		if(mPages.size() > 0)
	//*  17   35:aload_0         
	//*  18   36:getfield        #33  <Field SparseArray mPages>
	//*  19   39:invokevirtual   #118 <Method int SparseArray.size()>
	//*  20   42:ifle            112
		{
			for(int i = 0; i < mPages.size(); i++)
	//*  21   45:iconst_0        
	//*  22   46:istore_1        
	//*  23   47:iload_1         
	//*  24   48:aload_0         
	//*  25   49:getfield        #33  <Field SparseArray mPages>
	//*  26   52:invokevirtual   #118 <Method int SparseArray.size()>
	//*  27   55:icmpge          112
			{
				int j = mPages.keyAt(i);
	//   28   58:aload_0         
	//   29   59:getfield        #33  <Field SparseArray mPages>
	//   30   62:iload_1         
	//   31   63:invokevirtual   #125 <Method int SparseArray.keyAt(int)>
	//   32   66:istore_2        
				bundle.putInt(createCacheIndex(i), j);
	//   33   67:aload_3         
	//   34   68:aload_0         
	//   35   69:iload_1         
	//   36   70:invokevirtual   #91  <Method String createCacheIndex(int)>
	//   37   73:iload_2         
	//   38   74:invokevirtual   #122 <Method void Bundle.putInt(String, int)>
				Fragment fragment = (Fragment)mPages.get(j);
	//   39   77:aload_0         
	//   40   78:getfield        #33  <Field SparseArray mPages>
	//   41   81:iload_2         
	//   42   82:invokevirtual   #79  <Method Object SparseArray.get(int)>
	//   43   85:checkcast       #81  <Class Fragment>
	//   44   88:astore          4
				mFm.putFragment(bundle, createCacheKey(j), fragment);
	//   45   90:aload_0         
	//   46   91:getfield        #35  <Field FragmentManager mFm>
	//   47   94:aload_3         
	//   48   95:aload_0         
	//   49   96:iload_2         
	//   50   97:invokevirtual   #93  <Method String createCacheKey(int)>
	//   51  100:aload           4
	//   52  102:invokevirtual   #129 <Method void FragmentManager.putFragment(Bundle, String, Fragment)>
			}

	//   53  105:iload_1         
	//   54  106:iconst_1        
	//   55  107:iadd            
	//   56  108:istore_1        
		}
	//*  57  109:goto            47
		return ((Parcelable) (bundle));
	//   58  112:aload_3         
	//   59  113:areturn         
	}

	private static final String STATE_PAGES = "pages";
	private static final String STATE_PAGE_INDEX_PREFIX = "pageIndex:";
	private static final String STATE_PAGE_KEY_PREFIX = "page:";
	private static final String STATE_SUPER_STATE = "superState";
	private FragmentManager mFm;
	private SparseArray mPages;
}

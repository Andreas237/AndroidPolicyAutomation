// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.app;

import android.os.Parcelable;
import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;

// Referenced classes of package android.support.v4.app:
//			FragmentManager, Fragment, FragmentTransaction

public abstract class FragmentPagerAdapter extends PagerAdapter
{

	public FragmentPagerAdapter(FragmentManager fragmentmanager)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #22  <Method void PagerAdapter()>
		mCurTransaction = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #24  <Field FragmentTransaction mCurTransaction>
		mCurrentPrimaryItem = null;
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:putfield        #26  <Field Fragment mCurrentPrimaryItem>
		mFragmentManager = fragmentmanager;
	//    8   14:aload_0         
	//    9   15:aload_1         
	//   10   16:putfield        #28  <Field FragmentManager mFragmentManager>
	//   11   19:return          
	}

	private static String makeFragmentName(int i, long l)
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #33  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #34  <Method void StringBuilder()>
	//    3    7:astore_3        
		stringbuilder.append("android:switcher:");
	//    4    8:aload_3         
	//    5    9:ldc1            #36  <String "android:switcher:">
	//    6   11:invokevirtual   #40  <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		stringbuilder.append(i);
	//    8   15:aload_3         
	//    9   16:iload_0         
	//   10   17:invokevirtual   #43  <Method StringBuilder StringBuilder.append(int)>
	//   11   20:pop             
		stringbuilder.append(":");
	//   12   21:aload_3         
	//   13   22:ldc1            #45  <String ":">
	//   14   24:invokevirtual   #40  <Method StringBuilder StringBuilder.append(String)>
	//   15   27:pop             
		stringbuilder.append(l);
	//   16   28:aload_3         
	//   17   29:lload_1         
	//   18   30:invokevirtual   #48  <Method StringBuilder StringBuilder.append(long)>
	//   19   33:pop             
		return stringbuilder.toString();
	//   20   34:aload_3         
	//   21   35:invokevirtual   #52  <Method String StringBuilder.toString()>
	//   22   38:areturn         
	}

	public void destroyItem(ViewGroup viewgroup, int i, Object obj)
	{
		if(mCurTransaction == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #24  <Field FragmentTransaction mCurTransaction>
	//*   2    4:ifnonnull       18
			mCurTransaction = mFragmentManager.beginTransaction();
	//    3    7:aload_0         
	//    4    8:aload_0         
	//    5    9:getfield        #28  <Field FragmentManager mFragmentManager>
	//    6   12:invokevirtual   #61  <Method FragmentTransaction FragmentManager.beginTransaction()>
	//    7   15:putfield        #24  <Field FragmentTransaction mCurTransaction>
		mCurTransaction.detach((Fragment)obj);
	//    8   18:aload_0         
	//    9   19:getfield        #24  <Field FragmentTransaction mCurTransaction>
	//   10   22:aload_3         
	//   11   23:checkcast       #63  <Class Fragment>
	//   12   26:invokevirtual   #69  <Method FragmentTransaction FragmentTransaction.detach(Fragment)>
	//   13   29:pop             
	//   14   30:return          
	}

	public void finishUpdate(ViewGroup viewgroup)
	{
		viewgroup = ((ViewGroup) (mCurTransaction));
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field FragmentTransaction mCurTransaction>
	//    2    4:astore_1        
		if(viewgroup != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          18
		{
			((FragmentTransaction) (viewgroup)).commitNowAllowingStateLoss();
	//    5    9:aload_1         
	//    6   10:invokevirtual   #75  <Method void FragmentTransaction.commitNowAllowingStateLoss()>
			mCurTransaction = null;
	//    7   13:aload_0         
	//    8   14:aconst_null     
	//    9   15:putfield        #24  <Field FragmentTransaction mCurTransaction>
		}
	//   10   18:return          
	}

	public abstract Fragment getItem(int i);

	public long getItemId(int i)
	{
		return (long)i;
	//    0    0:iload_1         
	//    1    1:i2l             
	//    2    2:lreturn         
	}

	public Object instantiateItem(ViewGroup viewgroup, int i)
	{
		if(mCurTransaction == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #24  <Field FragmentTransaction mCurTransaction>
	//*   2    4:ifnonnull       18
			mCurTransaction = mFragmentManager.beginTransaction();
	//    3    7:aload_0         
	//    4    8:aload_0         
	//    5    9:getfield        #28  <Field FragmentManager mFragmentManager>
	//    6   12:invokevirtual   #61  <Method FragmentTransaction FragmentManager.beginTransaction()>
	//    7   15:putfield        #24  <Field FragmentTransaction mCurTransaction>
		long l = getItemId(i);
	//    8   18:aload_0         
	//    9   19:iload_2         
	//   10   20:invokevirtual   #83  <Method long getItemId(int)>
	//   11   23:lstore_3        
		Object obj = ((Object) (makeFragmentName(viewgroup.getId(), l)));
	//   12   24:aload_1         
	//   13   25:invokevirtual   #89  <Method int ViewGroup.getId()>
	//   14   28:lload_3         
	//   15   29:invokestatic    #91  <Method String makeFragmentName(int, long)>
	//   16   32:astore          5
		obj = ((Object) (mFragmentManager.findFragmentByTag(((String) (obj)))));
	//   17   34:aload_0         
	//   18   35:getfield        #28  <Field FragmentManager mFragmentManager>
	//   19   38:aload           5
	//   20   40:invokevirtual   #95  <Method Fragment FragmentManager.findFragmentByTag(String)>
	//   21   43:astore          5
		if(obj != null)
	//*  22   45:aload           5
	//*  23   47:ifnull          66
		{
			mCurTransaction.attach(((Fragment) (obj)));
	//   24   50:aload_0         
	//   25   51:getfield        #24  <Field FragmentTransaction mCurTransaction>
	//   26   54:aload           5
	//   27   56:invokevirtual   #98  <Method FragmentTransaction FragmentTransaction.attach(Fragment)>
	//   28   59:pop             
			viewgroup = ((ViewGroup) (obj));
	//   29   60:aload           5
	//   30   62:astore_1        
		} else
	//*  31   63:goto            98
		{
			Fragment fragment = getItem(i);
	//   32   66:aload_0         
	//   33   67:iload_2         
	//   34   68:invokevirtual   #100 <Method Fragment getItem(int)>
	//   35   71:astore          5
			mCurTransaction.add(viewgroup.getId(), fragment, makeFragmentName(viewgroup.getId(), l));
	//   36   73:aload_0         
	//   37   74:getfield        #24  <Field FragmentTransaction mCurTransaction>
	//   38   77:aload_1         
	//   39   78:invokevirtual   #89  <Method int ViewGroup.getId()>
	//   40   81:aload           5
	//   41   83:aload_1         
	//   42   84:invokevirtual   #89  <Method int ViewGroup.getId()>
	//   43   87:lload_3         
	//   44   88:invokestatic    #91  <Method String makeFragmentName(int, long)>
	//   45   91:invokevirtual   #104 <Method FragmentTransaction FragmentTransaction.add(int, Fragment, String)>
	//   46   94:pop             
			viewgroup = ((ViewGroup) (fragment));
	//   47   95:aload           5
	//   48   97:astore_1        
		}
		if(viewgroup != mCurrentPrimaryItem)
	//*  49   98:aload_1         
	//*  50   99:aload_0         
	//*  51  100:getfield        #26  <Field Fragment mCurrentPrimaryItem>
	//*  52  103:if_acmpeq       116
		{
			((Fragment) (viewgroup)).setMenuVisibility(false);
	//   53  106:aload_1         
	//   54  107:iconst_0        
	//   55  108:invokevirtual   #108 <Method void Fragment.setMenuVisibility(boolean)>
			((Fragment) (viewgroup)).setUserVisibleHint(false);
	//   56  111:aload_1         
	//   57  112:iconst_0        
	//   58  113:invokevirtual   #111 <Method void Fragment.setUserVisibleHint(boolean)>
		}
		return ((Object) (viewgroup));
	//   59  116:aload_1         
	//   60  117:areturn         
	}

	public boolean isViewFromObject(View view, Object obj)
	{
		return ((Fragment)obj).getView() == view;
	//    0    0:aload_2         
	//    1    1:checkcast       #63  <Class Fragment>
	//    2    4:invokevirtual   #118 <Method View Fragment.getView()>
	//    3    7:aload_1         
	//    4    8:if_acmpne       13
	//    5   11:iconst_1        
	//    6   12:ireturn         
	//    7   13:iconst_0        
	//    8   14:ireturn         
	}

	public void restoreState(Parcelable parcelable, ClassLoader classloader)
	{
	//    0    0:return          
	}

	public Parcelable saveState()
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public void setPrimaryItem(ViewGroup viewgroup, int i, Object obj)
	{
		viewgroup = ((ViewGroup) ((Fragment)obj));
	//    0    0:aload_3         
	//    1    1:checkcast       #63  <Class Fragment>
	//    2    4:astore_1        
		obj = ((Object) (mCurrentPrimaryItem));
	//    3    5:aload_0         
	//    4    6:getfield        #26  <Field Fragment mCurrentPrimaryItem>
	//    5    9:astore_3        
		if(viewgroup != obj)
	//*   6   10:aload_1         
	//*   7   11:aload_3         
	//*   8   12:if_acmpeq       47
		{
			if(obj != null)
	//*   9   15:aload_3         
	//*  10   16:ifnull          32
			{
				((Fragment) (obj)).setMenuVisibility(false);
	//   11   19:aload_3         
	//   12   20:iconst_0        
	//   13   21:invokevirtual   #108 <Method void Fragment.setMenuVisibility(boolean)>
				mCurrentPrimaryItem.setUserVisibleHint(false);
	//   14   24:aload_0         
	//   15   25:getfield        #26  <Field Fragment mCurrentPrimaryItem>
	//   16   28:iconst_0        
	//   17   29:invokevirtual   #111 <Method void Fragment.setUserVisibleHint(boolean)>
			}
			((Fragment) (viewgroup)).setMenuVisibility(true);
	//   18   32:aload_1         
	//   19   33:iconst_1        
	//   20   34:invokevirtual   #108 <Method void Fragment.setMenuVisibility(boolean)>
			((Fragment) (viewgroup)).setUserVisibleHint(true);
	//   21   37:aload_1         
	//   22   38:iconst_1        
	//   23   39:invokevirtual   #111 <Method void Fragment.setUserVisibleHint(boolean)>
			mCurrentPrimaryItem = ((Fragment) (viewgroup));
	//   24   42:aload_0         
	//   25   43:aload_1         
	//   26   44:putfield        #26  <Field Fragment mCurrentPrimaryItem>
		}
	//   27   47:return          
	}

	public void startUpdate(ViewGroup viewgroup)
	{
		if(viewgroup.getId() != -1)
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #89  <Method int ViewGroup.getId()>
	//*   2    4:iconst_m1       
	//*   3    5:icmpeq          9
		{
			return;
	//    4    8:return          
		} else
		{
			viewgroup = ((ViewGroup) (new StringBuilder()));
	//    5    9:new             #33  <Class StringBuilder>
	//    6   12:dup             
	//    7   13:invokespecial   #34  <Method void StringBuilder()>
	//    8   16:astore_1        
			((StringBuilder) (viewgroup)).append("ViewPager with adapter ");
	//    9   17:aload_1         
	//   10   18:ldc1            #126 <String "ViewPager with adapter ">
	//   11   20:invokevirtual   #40  <Method StringBuilder StringBuilder.append(String)>
	//   12   23:pop             
			((StringBuilder) (viewgroup)).append(((Object) (this)));
	//   13   24:aload_1         
	//   14   25:aload_0         
	//   15   26:invokevirtual   #129 <Method StringBuilder StringBuilder.append(Object)>
	//   16   29:pop             
			((StringBuilder) (viewgroup)).append(" requires a view id");
	//   17   30:aload_1         
	//   18   31:ldc1            #131 <String " requires a view id">
	//   19   33:invokevirtual   #40  <Method StringBuilder StringBuilder.append(String)>
	//   20   36:pop             
			throw new IllegalStateException(((StringBuilder) (viewgroup)).toString());
	//   21   37:new             #133 <Class IllegalStateException>
	//   22   40:dup             
	//   23   41:aload_1         
	//   24   42:invokevirtual   #52  <Method String StringBuilder.toString()>
	//   25   45:invokespecial   #136 <Method void IllegalStateException(String)>
	//   26   48:athrow          
		}
	}

	private static final boolean DEBUG = false;
	private static final String TAG = "FragmentPagerAdapter";
	private FragmentTransaction mCurTransaction;
	private Fragment mCurrentPrimaryItem;
	private final FragmentManager mFragmentManager;
}

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
		return (new StringBuilder()).append("android:switcher:").append(i).append(":").append(l).toString();
	//    0    0:new             #33  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #34  <Method void StringBuilder()>
	//    3    7:ldc1            #36  <String "android:switcher:">
	//    4    9:invokevirtual   #40  <Method StringBuilder StringBuilder.append(String)>
	//    5   12:iload_0         
	//    6   13:invokevirtual   #43  <Method StringBuilder StringBuilder.append(int)>
	//    7   16:ldc1            #45  <String ":">
	//    8   18:invokevirtual   #40  <Method StringBuilder StringBuilder.append(String)>
	//    9   21:lload_1         
	//   10   22:invokevirtual   #48  <Method StringBuilder StringBuilder.append(long)>
	//   11   25:invokevirtual   #52  <Method String StringBuilder.toString()>
	//   12   28:areturn         
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
	//    6   12:invokevirtual   #60  <Method FragmentTransaction FragmentManager.beginTransaction()>
	//    7   15:putfield        #24  <Field FragmentTransaction mCurTransaction>
		mCurTransaction.detach((Fragment)obj);
	//    8   18:aload_0         
	//    9   19:getfield        #24  <Field FragmentTransaction mCurTransaction>
	//   10   22:aload_3         
	//   11   23:checkcast       #62  <Class Fragment>
	//   12   26:invokevirtual   #68  <Method FragmentTransaction FragmentTransaction.detach(Fragment)>
	//   13   29:pop             
	//   14   30:return          
	}

	public void finishUpdate(ViewGroup viewgroup)
	{
		if(mCurTransaction != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #24  <Field FragmentTransaction mCurTransaction>
	//*   2    4:ifnull          19
		{
			mCurTransaction.commitNowAllowingStateLoss();
	//    3    7:aload_0         
	//    4    8:getfield        #24  <Field FragmentTransaction mCurTransaction>
	//    5   11:invokevirtual   #73  <Method void FragmentTransaction.commitNowAllowingStateLoss()>
			mCurTransaction = null;
	//    6   14:aload_0         
	//    7   15:aconst_null     
	//    8   16:putfield        #24  <Field FragmentTransaction mCurTransaction>
		}
	//    9   19:return          
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
	//    6   12:invokevirtual   #60  <Method FragmentTransaction FragmentManager.beginTransaction()>
	//    7   15:putfield        #24  <Field FragmentTransaction mCurTransaction>
		long l = getItemId(i);
	//    8   18:aload_0         
	//    9   19:iload_2         
	//   10   20:invokevirtual   #81  <Method long getItemId(int)>
	//   11   23:lstore_3        
		Object obj = ((Object) (makeFragmentName(viewgroup.getId(), l)));
	//   12   24:aload_1         
	//   13   25:invokevirtual   #87  <Method int ViewGroup.getId()>
	//   14   28:lload_3         
	//   15   29:invokestatic    #89  <Method String makeFragmentName(int, long)>
	//   16   32:astore          5
		obj = ((Object) (mFragmentManager.findFragmentByTag(((String) (obj)))));
	//   17   34:aload_0         
	//   18   35:getfield        #28  <Field FragmentManager mFragmentManager>
	//   19   38:aload           5
	//   20   40:invokevirtual   #93  <Method Fragment FragmentManager.findFragmentByTag(String)>
	//   21   43:astore          5
		if(obj != null)
	//*  22   45:aload           5
	//*  23   47:ifnull          66
		{
			mCurTransaction.attach(((Fragment) (obj)));
	//   24   50:aload_0         
	//   25   51:getfield        #24  <Field FragmentTransaction mCurTransaction>
	//   26   54:aload           5
	//   27   56:invokevirtual   #96  <Method FragmentTransaction FragmentTransaction.attach(Fragment)>
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
	//   34   68:invokevirtual   #98  <Method Fragment getItem(int)>
	//   35   71:astore          5
			mCurTransaction.add(viewgroup.getId(), fragment, makeFragmentName(viewgroup.getId(), l));
	//   36   73:aload_0         
	//   37   74:getfield        #24  <Field FragmentTransaction mCurTransaction>
	//   38   77:aload_1         
	//   39   78:invokevirtual   #87  <Method int ViewGroup.getId()>
	//   40   81:aload           5
	//   41   83:aload_1         
	//   42   84:invokevirtual   #87  <Method int ViewGroup.getId()>
	//   43   87:lload_3         
	//   44   88:invokestatic    #89  <Method String makeFragmentName(int, long)>
	//   45   91:invokevirtual   #102 <Method FragmentTransaction FragmentTransaction.add(int, Fragment, String)>
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
	//   55  108:invokevirtual   #106 <Method void Fragment.setMenuVisibility(boolean)>
			((Fragment) (viewgroup)).setUserVisibleHint(false);
	//   56  111:aload_1         
	//   57  112:iconst_0        
	//   58  113:invokevirtual   #109 <Method void Fragment.setUserVisibleHint(boolean)>
		}
		return ((Object) (viewgroup));
	//   59  116:aload_1         
	//   60  117:areturn         
	}

	public boolean isViewFromObject(View view, Object obj)
	{
		return ((Fragment)obj).getView() == view;
	//    0    0:aload_2         
	//    1    1:checkcast       #62  <Class Fragment>
	//    2    4:invokevirtual   #115 <Method View Fragment.getView()>
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
	//    1    1:checkcast       #62  <Class Fragment>
	//    2    4:astore_1        
		if(viewgroup != mCurrentPrimaryItem)
	//*   3    5:aload_1         
	//*   4    6:aload_0         
	//*   5    7:getfield        #26  <Field Fragment mCurrentPrimaryItem>
	//*   6   10:if_acmpeq       55
		{
			if(mCurrentPrimaryItem != null)
	//*   7   13:aload_0         
	//*   8   14:getfield        #26  <Field Fragment mCurrentPrimaryItem>
	//*   9   17:ifnull          36
			{
				mCurrentPrimaryItem.setMenuVisibility(false);
	//   10   20:aload_0         
	//   11   21:getfield        #26  <Field Fragment mCurrentPrimaryItem>
	//   12   24:iconst_0        
	//   13   25:invokevirtual   #106 <Method void Fragment.setMenuVisibility(boolean)>
				mCurrentPrimaryItem.setUserVisibleHint(false);
	//   14   28:aload_0         
	//   15   29:getfield        #26  <Field Fragment mCurrentPrimaryItem>
	//   16   32:iconst_0        
	//   17   33:invokevirtual   #109 <Method void Fragment.setUserVisibleHint(boolean)>
			}
			if(viewgroup != null)
	//*  18   36:aload_1         
	//*  19   37:ifnull          50
			{
				((Fragment) (viewgroup)).setMenuVisibility(true);
	//   20   40:aload_1         
	//   21   41:iconst_1        
	//   22   42:invokevirtual   #106 <Method void Fragment.setMenuVisibility(boolean)>
				((Fragment) (viewgroup)).setUserVisibleHint(true);
	//   23   45:aload_1         
	//   24   46:iconst_1        
	//   25   47:invokevirtual   #109 <Method void Fragment.setUserVisibleHint(boolean)>
			}
			mCurrentPrimaryItem = ((Fragment) (viewgroup));
	//   26   50:aload_0         
	//   27   51:aload_1         
	//   28   52:putfield        #26  <Field Fragment mCurrentPrimaryItem>
		}
	//   29   55:return          
	}

	public void startUpdate(ViewGroup viewgroup)
	{
		if(viewgroup.getId() == -1)
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #87  <Method int ViewGroup.getId()>
	//*   2    4:iconst_m1       
	//*   3    5:icmpne          40
			throw new IllegalStateException((new StringBuilder()).append("ViewPager with adapter ").append(((Object) (this))).append(" requires a view id").toString());
	//    4    8:new             #123 <Class IllegalStateException>
	//    5   11:dup             
	//    6   12:new             #33  <Class StringBuilder>
	//    7   15:dup             
	//    8   16:invokespecial   #34  <Method void StringBuilder()>
	//    9   19:ldc1            #125 <String "ViewPager with adapter ">
	//   10   21:invokevirtual   #40  <Method StringBuilder StringBuilder.append(String)>
	//   11   24:aload_0         
	//   12   25:invokevirtual   #128 <Method StringBuilder StringBuilder.append(Object)>
	//   13   28:ldc1            #130 <String " requires a view id">
	//   14   30:invokevirtual   #40  <Method StringBuilder StringBuilder.append(String)>
	//   15   33:invokevirtual   #52  <Method String StringBuilder.toString()>
	//   16   36:invokespecial   #133 <Method void IllegalStateException(String)>
	//   17   39:athrow          
		else
			return;
	//   18   40:return          
	}

	private static final boolean DEBUG = false;
	private static final String TAG = "FragmentPagerAdapter";
	private FragmentTransaction mCurTransaction;
	private Fragment mCurrentPrimaryItem;
	private final FragmentManager mFragmentManager;
}

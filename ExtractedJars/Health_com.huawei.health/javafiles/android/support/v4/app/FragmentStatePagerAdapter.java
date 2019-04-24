// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.app;

import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.view.PagerAdapter;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package android.support.v4.app:
//			Fragment, FragmentManager, FragmentTransaction

public abstract class FragmentStatePagerAdapter extends PagerAdapter
{

	public FragmentStatePagerAdapter(FragmentManager fragmentmanager)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #27  <Method void PagerAdapter()>
		mCurTransaction = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #29  <Field FragmentTransaction mCurTransaction>
		mSavedState = new ArrayList();
	//    5    9:aload_0         
	//    6   10:new             #31  <Class ArrayList>
	//    7   13:dup             
	//    8   14:invokespecial   #32  <Method void ArrayList()>
	//    9   17:putfield        #34  <Field ArrayList mSavedState>
		mFragments = new ArrayList();
	//   10   20:aload_0         
	//   11   21:new             #31  <Class ArrayList>
	//   12   24:dup             
	//   13   25:invokespecial   #32  <Method void ArrayList()>
	//   14   28:putfield        #36  <Field ArrayList mFragments>
		mCurrentPrimaryItem = null;
	//   15   31:aload_0         
	//   16   32:aconst_null     
	//   17   33:putfield        #38  <Field Fragment mCurrentPrimaryItem>
		mFragmentManager = fragmentmanager;
	//   18   36:aload_0         
	//   19   37:aload_1         
	//   20   38:putfield        #40  <Field FragmentManager mFragmentManager>
	//   21   41:return          
	}

	public void destroyItem(ViewGroup viewgroup, int i, Object obj)
	{
		obj = ((Object) ((Fragment)obj));
	//    0    0:aload_3         
	//    1    1:checkcast       #45  <Class Fragment>
	//    2    4:astore_3        
		if(mCurTransaction == null)
	//*   3    5:aload_0         
	//*   4    6:getfield        #29  <Field FragmentTransaction mCurTransaction>
	//*   5    9:ifnonnull       23
			mCurTransaction = mFragmentManager.beginTransaction();
	//    6   12:aload_0         
	//    7   13:aload_0         
	//    8   14:getfield        #40  <Field FragmentManager mFragmentManager>
	//    9   17:invokevirtual   #51  <Method FragmentTransaction FragmentManager.beginTransaction()>
	//   10   20:putfield        #29  <Field FragmentTransaction mCurTransaction>
		for(; mSavedState.size() <= i; mSavedState.add(((Object) (null))));
	//   11   23:aload_0         
	//   12   24:getfield        #34  <Field ArrayList mSavedState>
	//   13   27:invokevirtual   #55  <Method int ArrayList.size()>
	//   14   30:iload_2         
	//   15   31:icmpgt          46
	//   16   34:aload_0         
	//   17   35:getfield        #34  <Field ArrayList mSavedState>
	//   18   38:aconst_null     
	//   19   39:invokevirtual   #59  <Method boolean ArrayList.add(Object)>
	//   20   42:pop             
	//*  21   43:goto            23
		ArrayList arraylist = mSavedState;
	//   22   46:aload_0         
	//   23   47:getfield        #34  <Field ArrayList mSavedState>
	//   24   50:astore          4
		if(((Fragment) (obj)).isAdded())
	//*  25   52:aload_3         
	//*  26   53:invokevirtual   #63  <Method boolean Fragment.isAdded()>
	//*  27   56:ifeq            71
			viewgroup = ((ViewGroup) (mFragmentManager.saveFragmentInstanceState(((Fragment) (obj)))));
	//   28   59:aload_0         
	//   29   60:getfield        #40  <Field FragmentManager mFragmentManager>
	//   30   63:aload_3         
	//   31   64:invokevirtual   #67  <Method Fragment$SavedState FragmentManager.saveFragmentInstanceState(Fragment)>
	//   32   67:astore_1        
		else
	//*  33   68:goto            73
			viewgroup = null;
	//   34   71:aconst_null     
	//   35   72:astore_1        
		arraylist.set(i, ((Object) (viewgroup)));
	//   36   73:aload           4
	//   37   75:iload_2         
	//   38   76:aload_1         
	//   39   77:invokevirtual   #71  <Method Object ArrayList.set(int, Object)>
	//   40   80:pop             
		mFragments.set(i, ((Object) (null)));
	//   41   81:aload_0         
	//   42   82:getfield        #36  <Field ArrayList mFragments>
	//   43   85:iload_2         
	//   44   86:aconst_null     
	//   45   87:invokevirtual   #71  <Method Object ArrayList.set(int, Object)>
	//   46   90:pop             
		mCurTransaction.remove(((Fragment) (obj)));
	//   47   91:aload_0         
	//   48   92:getfield        #29  <Field FragmentTransaction mCurTransaction>
	//   49   95:aload_3         
	//   50   96:invokevirtual   #77  <Method FragmentTransaction FragmentTransaction.remove(Fragment)>
	//   51   99:pop             
	//   52  100:return          
	}

	public void finishUpdate(ViewGroup viewgroup)
	{
		if(mCurTransaction != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #29  <Field FragmentTransaction mCurTransaction>
	//*   2    4:ifnull          19
		{
			mCurTransaction.commitNowAllowingStateLoss();
	//    3    7:aload_0         
	//    4    8:getfield        #29  <Field FragmentTransaction mCurTransaction>
	//    5   11:invokevirtual   #82  <Method void FragmentTransaction.commitNowAllowingStateLoss()>
			mCurTransaction = null;
	//    6   14:aload_0         
	//    7   15:aconst_null     
	//    8   16:putfield        #29  <Field FragmentTransaction mCurTransaction>
		}
	//    9   19:return          
	}

	public abstract Fragment getItem(int i);

	public Object instantiateItem(ViewGroup viewgroup, int i)
	{
		if(mFragments.size() > i)
	//*   0    0:aload_0         
	//*   1    1:getfield        #36  <Field ArrayList mFragments>
	//*   2    4:invokevirtual   #55  <Method int ArrayList.size()>
	//*   3    7:iload_2         
	//*   4    8:icmple          29
		{
			Fragment fragment = (Fragment)mFragments.get(i);
	//    5   11:aload_0         
	//    6   12:getfield        #36  <Field ArrayList mFragments>
	//    7   15:iload_2         
	//    8   16:invokevirtual   #90  <Method Object ArrayList.get(int)>
	//    9   19:checkcast       #45  <Class Fragment>
	//   10   22:astore_3        
			if(fragment != null)
	//*  11   23:aload_3         
	//*  12   24:ifnull          29
				return ((Object) (fragment));
	//   13   27:aload_3         
	//   14   28:areturn         
		}
		if(mCurTransaction == null)
	//*  15   29:aload_0         
	//*  16   30:getfield        #29  <Field FragmentTransaction mCurTransaction>
	//*  17   33:ifnonnull       47
			mCurTransaction = mFragmentManager.beginTransaction();
	//   18   36:aload_0         
	//   19   37:aload_0         
	//   20   38:getfield        #40  <Field FragmentManager mFragmentManager>
	//   21   41:invokevirtual   #51  <Method FragmentTransaction FragmentManager.beginTransaction()>
	//   22   44:putfield        #29  <Field FragmentTransaction mCurTransaction>
		Fragment fragment1 = getItem(i);
	//   23   47:aload_0         
	//   24   48:iload_2         
	//   25   49:invokevirtual   #92  <Method Fragment getItem(int)>
	//   26   52:astore_3        
		if(mSavedState.size() > i)
	//*  27   53:aload_0         
	//*  28   54:getfield        #34  <Field ArrayList mSavedState>
	//*  29   57:invokevirtual   #55  <Method int ArrayList.size()>
	//*  30   60:iload_2         
	//*  31   61:icmple          88
		{
			Fragment.SavedState savedstate = (Fragment.SavedState)mSavedState.get(i);
	//   32   64:aload_0         
	//   33   65:getfield        #34  <Field ArrayList mSavedState>
	//   34   68:iload_2         
	//   35   69:invokevirtual   #90  <Method Object ArrayList.get(int)>
	//   36   72:checkcast       #94  <Class Fragment$SavedState>
	//   37   75:astore          4
			if(savedstate != null)
	//*  38   77:aload           4
	//*  39   79:ifnull          88
				fragment1.setInitialSavedState(savedstate);
	//   40   82:aload_3         
	//   41   83:aload           4
	//   42   85:invokevirtual   #98  <Method void Fragment.setInitialSavedState(Fragment$SavedState)>
		}
		for(; mFragments.size() <= i; mFragments.add(((Object) (null))));
	//   43   88:aload_0         
	//   44   89:getfield        #36  <Field ArrayList mFragments>
	//   45   92:invokevirtual   #55  <Method int ArrayList.size()>
	//   46   95:iload_2         
	//   47   96:icmpgt          111
	//   48   99:aload_0         
	//   49  100:getfield        #36  <Field ArrayList mFragments>
	//   50  103:aconst_null     
	//   51  104:invokevirtual   #59  <Method boolean ArrayList.add(Object)>
	//   52  107:pop             
	//*  53  108:goto            88
		fragment1.setMenuVisibility(false);
	//   54  111:aload_3         
	//   55  112:iconst_0        
	//   56  113:invokevirtual   #102 <Method void Fragment.setMenuVisibility(boolean)>
		fragment1.setUserVisibleHint(false);
	//   57  116:aload_3         
	//   58  117:iconst_0        
	//   59  118:invokevirtual   #105 <Method void Fragment.setUserVisibleHint(boolean)>
		mFragments.set(i, ((Object) (fragment1)));
	//   60  121:aload_0         
	//   61  122:getfield        #36  <Field ArrayList mFragments>
	//   62  125:iload_2         
	//   63  126:aload_3         
	//   64  127:invokevirtual   #71  <Method Object ArrayList.set(int, Object)>
	//   65  130:pop             
		mCurTransaction.add(viewgroup.getId(), fragment1);
	//   66  131:aload_0         
	//   67  132:getfield        #29  <Field FragmentTransaction mCurTransaction>
	//   68  135:aload_1         
	//   69  136:invokevirtual   #110 <Method int ViewGroup.getId()>
	//   70  139:aload_3         
	//   71  140:invokevirtual   #113 <Method FragmentTransaction FragmentTransaction.add(int, Fragment)>
	//   72  143:pop             
		return ((Object) (fragment1));
	//   73  144:aload_3         
	//   74  145:areturn         
	}

	public boolean isViewFromObject(View view, Object obj)
	{
		return ((Fragment)obj).getView() == view;
	//    0    0:aload_2         
	//    1    1:checkcast       #45  <Class Fragment>
	//    2    4:invokevirtual   #119 <Method View Fragment.getView()>
	//    3    7:aload_1         
	//    4    8:if_acmpne       13
	//    5   11:iconst_1        
	//    6   12:ireturn         
	//    7   13:iconst_0        
	//    8   14:ireturn         
	}

	public void restoreState(Parcelable parcelable, ClassLoader classloader)
	{
		if(parcelable != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          207
		{
			parcelable = ((Parcelable) ((Bundle)parcelable));
	//    2    4:aload_1         
	//    3    5:checkcast       #123 <Class Bundle>
	//    4    8:astore_1        
			((Bundle) (parcelable)).setClassLoader(classloader);
	//    5    9:aload_1         
	//    6   10:aload_2         
	//    7   11:invokevirtual   #127 <Method void Bundle.setClassLoader(ClassLoader)>
			classloader = ((ClassLoader) (((Bundle) (parcelable)).getParcelableArray("states")));
	//    8   14:aload_1         
	//    9   15:ldc1            #129 <String "states">
	//   10   17:invokevirtual   #133 <Method Parcelable[] Bundle.getParcelableArray(String)>
	//   11   20:astore_2        
			mSavedState.clear();
	//   12   21:aload_0         
	//   13   22:getfield        #34  <Field ArrayList mSavedState>
	//   14   25:invokevirtual   #136 <Method void ArrayList.clear()>
			mFragments.clear();
	//   15   28:aload_0         
	//   16   29:getfield        #36  <Field ArrayList mFragments>
	//   17   32:invokevirtual   #136 <Method void ArrayList.clear()>
			if(classloader != null)
	//*  18   35:aload_2         
	//*  19   36:ifnull          68
			{
				for(int i = 0; i < classloader.length; i++)
	//*  20   39:iconst_0        
	//*  21   40:istore_3        
	//*  22   41:iload_3         
	//*  23   42:aload_2         
	//*  24   43:arraylength     
	//*  25   44:icmpge          68
					mSavedState.add(((Object) ((Fragment.SavedState)classloader[i])));
	//   26   47:aload_0         
	//   27   48:getfield        #34  <Field ArrayList mSavedState>
	//   28   51:aload_2         
	//   29   52:iload_3         
	//   30   53:aaload          
	//   31   54:checkcast       #94  <Class Fragment$SavedState>
	//   32   57:invokevirtual   #59  <Method boolean ArrayList.add(Object)>
	//   33   60:pop             

	//   34   61:iload_3         
	//   35   62:iconst_1        
	//   36   63:iadd            
	//   37   64:istore_3        
			}
	//*  38   65:goto            41
			classloader = ((ClassLoader) (((Iterable) (((Bundle) (parcelable)).keySet())).iterator()));
	//   39   68:aload_1         
	//   40   69:invokevirtual   #140 <Method java.util.Set Bundle.keySet()>
	//   41   72:invokeinterface #146 <Method Iterator Iterable.iterator()>
	//   42   77:astore_2        
			do
			{
				if(!((Iterator) (classloader)).hasNext())
					break;
	//   43   78:aload_2         
	//   44   79:invokeinterface #151 <Method boolean Iterator.hasNext()>
	//   45   84:ifeq            207
				String s = (String)((Iterator) (classloader)).next();
	//   46   87:aload_2         
	//   47   88:invokeinterface #155 <Method Object Iterator.next()>
	//   48   93:checkcast       #157 <Class String>
	//   49   96:astore          4
				if(s.startsWith("f"))
	//*  50   98:aload           4
	//*  51  100:ldc1            #159 <String "f">
	//*  52  102:invokevirtual   #163 <Method boolean String.startsWith(String)>
	//*  53  105:ifeq            204
				{
					int j = Integer.parseInt(s.substring(1));
	//   54  108:aload           4
	//   55  110:iconst_1        
	//   56  111:invokevirtual   #167 <Method String String.substring(int)>
	//   57  114:invokestatic    #173 <Method int Integer.parseInt(String)>
	//   58  117:istore_3        
					Fragment fragment = mFragmentManager.getFragment(((Bundle) (parcelable)), s);
	//   59  118:aload_0         
	//   60  119:getfield        #40  <Field FragmentManager mFragmentManager>
	//   61  122:aload_1         
	//   62  123:aload           4
	//   63  125:invokevirtual   #177 <Method Fragment FragmentManager.getFragment(Bundle, String)>
	//   64  128:astore          5
					if(fragment != null)
	//*  65  130:aload           5
	//*  66  132:ifnull          178
					{
						for(; mFragments.size() <= j; mFragments.add(((Object) (null))));
	//   67  135:aload_0         
	//   68  136:getfield        #36  <Field ArrayList mFragments>
	//   69  139:invokevirtual   #55  <Method int ArrayList.size()>
	//   70  142:iload_3         
	//   71  143:icmpgt          158
	//   72  146:aload_0         
	//   73  147:getfield        #36  <Field ArrayList mFragments>
	//   74  150:aconst_null     
	//   75  151:invokevirtual   #59  <Method boolean ArrayList.add(Object)>
	//   76  154:pop             
	//*  77  155:goto            135
						fragment.setMenuVisibility(false);
	//   78  158:aload           5
	//   79  160:iconst_0        
	//   80  161:invokevirtual   #102 <Method void Fragment.setMenuVisibility(boolean)>
						mFragments.set(j, ((Object) (fragment)));
	//   81  164:aload_0         
	//   82  165:getfield        #36  <Field ArrayList mFragments>
	//   83  168:iload_3         
	//   84  169:aload           5
	//   85  171:invokevirtual   #71  <Method Object ArrayList.set(int, Object)>
	//   86  174:pop             
					} else
	//*  87  175:goto            204
					{
						Log.w("FragmentStatePagerAdapter", (new StringBuilder()).append("Bad fragment at key ").append(s).toString());
	//   88  178:ldc1            #11  <String "FragmentStatePagerAdapter">
	//   89  180:new             #179 <Class StringBuilder>
	//   90  183:dup             
	//   91  184:invokespecial   #180 <Method void StringBuilder()>
	//   92  187:ldc1            #182 <String "Bad fragment at key ">
	//   93  189:invokevirtual   #186 <Method StringBuilder StringBuilder.append(String)>
	//   94  192:aload           4
	//   95  194:invokevirtual   #186 <Method StringBuilder StringBuilder.append(String)>
	//   96  197:invokevirtual   #190 <Method String StringBuilder.toString()>
	//   97  200:invokestatic    #196 <Method int Log.w(String, String)>
	//   98  203:pop             
					}
				}
			} while(true);
	//   99  204:goto            78
		}
	//  100  207:return          
	}

	public Parcelable saveState()
	{
		Object obj = null;
	//    0    0:aconst_null     
	//    1    1:astore_2        
		if(mSavedState.size() > 0)
	//*   2    2:aload_0         
	//*   3    3:getfield        #34  <Field ArrayList mSavedState>
	//*   4    6:invokevirtual   #55  <Method int ArrayList.size()>
	//*   5    9:ifle            47
		{
			obj = ((Object) (new Bundle()));
	//    6   12:new             #123 <Class Bundle>
	//    7   15:dup             
	//    8   16:invokespecial   #199 <Method void Bundle()>
	//    9   19:astore_2        
			Fragment.SavedState asavedstate[] = new Fragment.SavedState[mSavedState.size()];
	//   10   20:aload_0         
	//   11   21:getfield        #34  <Field ArrayList mSavedState>
	//   12   24:invokevirtual   #55  <Method int ArrayList.size()>
	//   13   27:anewarray       Fragment.SavedState[]
	//   14   30:astore_3        
			mSavedState.toArray(((Object []) (asavedstate)));
	//   15   31:aload_0         
	//   16   32:getfield        #34  <Field ArrayList mSavedState>
	//   17   35:aload_3         
	//   18   36:invokevirtual   #203 <Method Object[] ArrayList.toArray(Object[])>
	//   19   39:pop             
			((Bundle) (obj)).putParcelableArray("states", ((Parcelable []) (asavedstate)));
	//   20   40:aload_2         
	//   21   41:ldc1            #129 <String "states">
	//   22   43:aload_3         
	//   23   44:invokevirtual   #207 <Method void Bundle.putParcelableArray(String, Parcelable[])>
		}
		for(int i = 0; i < mFragments.size();)
	//*  24   47:iconst_0        
	//*  25   48:istore_1        
	//*  26   49:iload_1         
	//*  27   50:aload_0         
	//*  28   51:getfield        #36  <Field ArrayList mFragments>
	//*  29   54:invokevirtual   #55  <Method int ArrayList.size()>
	//*  30   57:icmpge          144
		{
			Fragment fragment = (Fragment)mFragments.get(i);
	//   31   60:aload_0         
	//   32   61:getfield        #36  <Field ArrayList mFragments>
	//   33   64:iload_1         
	//   34   65:invokevirtual   #90  <Method Object ArrayList.get(int)>
	//   35   68:checkcast       #45  <Class Fragment>
	//   36   71:astore          4
			Object obj1 = obj;
	//   37   73:aload_2         
	//   38   74:astore_3        
			if(fragment != null)
	//*  39   75:aload           4
	//*  40   77:ifnull          135
			{
				obj1 = obj;
	//   41   80:aload_2         
	//   42   81:astore_3        
				if(fragment.isAdded())
	//*  43   82:aload           4
	//*  44   84:invokevirtual   #63  <Method boolean Fragment.isAdded()>
	//*  45   87:ifeq            135
				{
					obj1 = obj;
	//   46   90:aload_2         
	//   47   91:astore_3        
					if(obj == null)
	//*  48   92:aload_2         
	//*  49   93:ifnonnull       104
						obj1 = ((Object) (new Bundle()));
	//   50   96:new             #123 <Class Bundle>
	//   51   99:dup             
	//   52  100:invokespecial   #199 <Method void Bundle()>
	//   53  103:astore_3        
					obj = ((Object) ((new StringBuilder()).append("f").append(i).toString()));
	//   54  104:new             #179 <Class StringBuilder>
	//   55  107:dup             
	//   56  108:invokespecial   #180 <Method void StringBuilder()>
	//   57  111:ldc1            #159 <String "f">
	//   58  113:invokevirtual   #186 <Method StringBuilder StringBuilder.append(String)>
	//   59  116:iload_1         
	//   60  117:invokevirtual   #210 <Method StringBuilder StringBuilder.append(int)>
	//   61  120:invokevirtual   #190 <Method String StringBuilder.toString()>
	//   62  123:astore_2        
					mFragmentManager.putFragment(((Bundle) (obj1)), ((String) (obj)), fragment);
	//   63  124:aload_0         
	//   64  125:getfield        #40  <Field FragmentManager mFragmentManager>
	//   65  128:aload_3         
	//   66  129:aload_2         
	//   67  130:aload           4
	//   68  132:invokevirtual   #214 <Method void FragmentManager.putFragment(Bundle, String, Fragment)>
				}
			}
			i++;
	//   69  135:iload_1         
	//   70  136:iconst_1        
	//   71  137:iadd            
	//   72  138:istore_1        
			obj = obj1;
	//   73  139:aload_3         
	//   74  140:astore_2        
		}

	//*  75  141:goto            49
		return ((Parcelable) (obj));
	//   76  144:aload_2         
	//   77  145:areturn         
	}

	public void setPrimaryItem(ViewGroup viewgroup, int i, Object obj)
	{
		viewgroup = ((ViewGroup) ((Fragment)obj));
	//    0    0:aload_3         
	//    1    1:checkcast       #45  <Class Fragment>
	//    2    4:astore_1        
		if(viewgroup != mCurrentPrimaryItem)
	//*   3    5:aload_1         
	//*   4    6:aload_0         
	//*   5    7:getfield        #38  <Field Fragment mCurrentPrimaryItem>
	//*   6   10:if_acmpeq       55
		{
			if(mCurrentPrimaryItem != null)
	//*   7   13:aload_0         
	//*   8   14:getfield        #38  <Field Fragment mCurrentPrimaryItem>
	//*   9   17:ifnull          36
			{
				mCurrentPrimaryItem.setMenuVisibility(false);
	//   10   20:aload_0         
	//   11   21:getfield        #38  <Field Fragment mCurrentPrimaryItem>
	//   12   24:iconst_0        
	//   13   25:invokevirtual   #102 <Method void Fragment.setMenuVisibility(boolean)>
				mCurrentPrimaryItem.setUserVisibleHint(false);
	//   14   28:aload_0         
	//   15   29:getfield        #38  <Field Fragment mCurrentPrimaryItem>
	//   16   32:iconst_0        
	//   17   33:invokevirtual   #105 <Method void Fragment.setUserVisibleHint(boolean)>
			}
			if(viewgroup != null)
	//*  18   36:aload_1         
	//*  19   37:ifnull          50
			{
				((Fragment) (viewgroup)).setMenuVisibility(true);
	//   20   40:aload_1         
	//   21   41:iconst_1        
	//   22   42:invokevirtual   #102 <Method void Fragment.setMenuVisibility(boolean)>
				((Fragment) (viewgroup)).setUserVisibleHint(true);
	//   23   45:aload_1         
	//   24   46:iconst_1        
	//   25   47:invokevirtual   #105 <Method void Fragment.setUserVisibleHint(boolean)>
			}
			mCurrentPrimaryItem = ((Fragment) (viewgroup));
	//   26   50:aload_0         
	//   27   51:aload_1         
	//   28   52:putfield        #38  <Field Fragment mCurrentPrimaryItem>
		}
	//   29   55:return          
	}

	public void startUpdate(ViewGroup viewgroup)
	{
		if(viewgroup.getId() == -1)
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #110 <Method int ViewGroup.getId()>
	//*   2    4:iconst_m1       
	//*   3    5:icmpne          40
			throw new IllegalStateException((new StringBuilder()).append("ViewPager with adapter ").append(((Object) (this))).append(" requires a view id").toString());
	//    4    8:new             #218 <Class IllegalStateException>
	//    5   11:dup             
	//    6   12:new             #179 <Class StringBuilder>
	//    7   15:dup             
	//    8   16:invokespecial   #180 <Method void StringBuilder()>
	//    9   19:ldc1            #220 <String "ViewPager with adapter ">
	//   10   21:invokevirtual   #186 <Method StringBuilder StringBuilder.append(String)>
	//   11   24:aload_0         
	//   12   25:invokevirtual   #223 <Method StringBuilder StringBuilder.append(Object)>
	//   13   28:ldc1            #225 <String " requires a view id">
	//   14   30:invokevirtual   #186 <Method StringBuilder StringBuilder.append(String)>
	//   15   33:invokevirtual   #190 <Method String StringBuilder.toString()>
	//   16   36:invokespecial   #228 <Method void IllegalStateException(String)>
	//   17   39:athrow          
		else
			return;
	//   18   40:return          
	}

	private static final boolean DEBUG = false;
	private static final String TAG = "FragmentStatePagerAdapter";
	private FragmentTransaction mCurTransaction;
	private Fragment mCurrentPrimaryItem;
	private final FragmentManager mFragmentManager;
	private ArrayList mFragments;
	private ArrayList mSavedState;
}

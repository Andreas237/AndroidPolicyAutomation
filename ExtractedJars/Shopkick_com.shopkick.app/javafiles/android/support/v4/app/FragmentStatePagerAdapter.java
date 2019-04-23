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
	//    1    1:checkcast       #46  <Class Fragment>
	//    2    4:astore_3        
		if(mCurTransaction == null)
	//*   3    5:aload_0         
	//*   4    6:getfield        #29  <Field FragmentTransaction mCurTransaction>
	//*   5    9:ifnonnull       23
			mCurTransaction = mFragmentManager.beginTransaction();
	//    6   12:aload_0         
	//    7   13:aload_0         
	//    8   14:getfield        #40  <Field FragmentManager mFragmentManager>
	//    9   17:invokevirtual   #52  <Method FragmentTransaction FragmentManager.beginTransaction()>
	//   10   20:putfield        #29  <Field FragmentTransaction mCurTransaction>
		for(; mSavedState.size() <= i; mSavedState.add(((Object) (null))));
	//   11   23:aload_0         
	//   12   24:getfield        #34  <Field ArrayList mSavedState>
	//   13   27:invokevirtual   #56  <Method int ArrayList.size()>
	//   14   30:iload_2         
	//   15   31:icmpgt          46
	//   16   34:aload_0         
	//   17   35:getfield        #34  <Field ArrayList mSavedState>
	//   18   38:aconst_null     
	//   19   39:invokevirtual   #60  <Method boolean ArrayList.add(Object)>
	//   20   42:pop             
	//*  21   43:goto            23
		ArrayList arraylist = mSavedState;
	//   22   46:aload_0         
	//   23   47:getfield        #34  <Field ArrayList mSavedState>
	//   24   50:astore          4
		if(((Fragment) (obj)).isAdded())
	//*  25   52:aload_3         
	//*  26   53:invokevirtual   #64  <Method boolean Fragment.isAdded()>
	//*  27   56:ifeq            71
			viewgroup = ((ViewGroup) (mFragmentManager.saveFragmentInstanceState(((Fragment) (obj)))));
	//   28   59:aload_0         
	//   29   60:getfield        #40  <Field FragmentManager mFragmentManager>
	//   30   63:aload_3         
	//   31   64:invokevirtual   #68  <Method Fragment$SavedState FragmentManager.saveFragmentInstanceState(Fragment)>
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
	//   39   77:invokevirtual   #72  <Method Object ArrayList.set(int, Object)>
	//   40   80:pop             
		mFragments.set(i, ((Object) (null)));
	//   41   81:aload_0         
	//   42   82:getfield        #36  <Field ArrayList mFragments>
	//   43   85:iload_2         
	//   44   86:aconst_null     
	//   45   87:invokevirtual   #72  <Method Object ArrayList.set(int, Object)>
	//   46   90:pop             
		mCurTransaction.remove(((Fragment) (obj)));
	//   47   91:aload_0         
	//   48   92:getfield        #29  <Field FragmentTransaction mCurTransaction>
	//   49   95:aload_3         
	//   50   96:invokevirtual   #78  <Method FragmentTransaction FragmentTransaction.remove(Fragment)>
	//   51   99:pop             
	//   52  100:return          
	}

	public void finishUpdate(ViewGroup viewgroup)
	{
		viewgroup = ((ViewGroup) (mCurTransaction));
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field FragmentTransaction mCurTransaction>
	//    2    4:astore_1        
		if(viewgroup != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          18
		{
			((FragmentTransaction) (viewgroup)).commitNowAllowingStateLoss();
	//    5    9:aload_1         
	//    6   10:invokevirtual   #84  <Method void FragmentTransaction.commitNowAllowingStateLoss()>
			mCurTransaction = null;
	//    7   13:aload_0         
	//    8   14:aconst_null     
	//    9   15:putfield        #29  <Field FragmentTransaction mCurTransaction>
		}
	//   10   18:return          
	}

	public abstract Fragment getItem(int i);

	public Object instantiateItem(ViewGroup viewgroup, int i)
	{
		if(mFragments.size() > i)
	//*   0    0:aload_0         
	//*   1    1:getfield        #36  <Field ArrayList mFragments>
	//*   2    4:invokevirtual   #56  <Method int ArrayList.size()>
	//*   3    7:iload_2         
	//*   4    8:icmple          29
		{
			Fragment fragment = (Fragment)mFragments.get(i);
	//    5   11:aload_0         
	//    6   12:getfield        #36  <Field ArrayList mFragments>
	//    7   15:iload_2         
	//    8   16:invokevirtual   #92  <Method Object ArrayList.get(int)>
	//    9   19:checkcast       #46  <Class Fragment>
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
	//   21   41:invokevirtual   #52  <Method FragmentTransaction FragmentManager.beginTransaction()>
	//   22   44:putfield        #29  <Field FragmentTransaction mCurTransaction>
		Fragment fragment1 = getItem(i);
	//   23   47:aload_0         
	//   24   48:iload_2         
	//   25   49:invokevirtual   #94  <Method Fragment getItem(int)>
	//   26   52:astore_3        
		if(mSavedState.size() > i)
	//*  27   53:aload_0         
	//*  28   54:getfield        #34  <Field ArrayList mSavedState>
	//*  29   57:invokevirtual   #56  <Method int ArrayList.size()>
	//*  30   60:iload_2         
	//*  31   61:icmple          88
		{
			Fragment.SavedState savedstate = (Fragment.SavedState)mSavedState.get(i);
	//   32   64:aload_0         
	//   33   65:getfield        #34  <Field ArrayList mSavedState>
	//   34   68:iload_2         
	//   35   69:invokevirtual   #92  <Method Object ArrayList.get(int)>
	//   36   72:checkcast       #96  <Class Fragment$SavedState>
	//   37   75:astore          4
			if(savedstate != null)
	//*  38   77:aload           4
	//*  39   79:ifnull          88
				fragment1.setInitialSavedState(savedstate);
	//   40   82:aload_3         
	//   41   83:aload           4
	//   42   85:invokevirtual   #100 <Method void Fragment.setInitialSavedState(Fragment$SavedState)>
		}
		for(; mFragments.size() <= i; mFragments.add(((Object) (null))));
	//   43   88:aload_0         
	//   44   89:getfield        #36  <Field ArrayList mFragments>
	//   45   92:invokevirtual   #56  <Method int ArrayList.size()>
	//   46   95:iload_2         
	//   47   96:icmpgt          111
	//   48   99:aload_0         
	//   49  100:getfield        #36  <Field ArrayList mFragments>
	//   50  103:aconst_null     
	//   51  104:invokevirtual   #60  <Method boolean ArrayList.add(Object)>
	//   52  107:pop             
	//*  53  108:goto            88
		fragment1.setMenuVisibility(false);
	//   54  111:aload_3         
	//   55  112:iconst_0        
	//   56  113:invokevirtual   #104 <Method void Fragment.setMenuVisibility(boolean)>
		fragment1.setUserVisibleHint(false);
	//   57  116:aload_3         
	//   58  117:iconst_0        
	//   59  118:invokevirtual   #107 <Method void Fragment.setUserVisibleHint(boolean)>
		mFragments.set(i, ((Object) (fragment1)));
	//   60  121:aload_0         
	//   61  122:getfield        #36  <Field ArrayList mFragments>
	//   62  125:iload_2         
	//   63  126:aload_3         
	//   64  127:invokevirtual   #72  <Method Object ArrayList.set(int, Object)>
	//   65  130:pop             
		mCurTransaction.add(viewgroup.getId(), fragment1);
	//   66  131:aload_0         
	//   67  132:getfield        #29  <Field FragmentTransaction mCurTransaction>
	//   68  135:aload_1         
	//   69  136:invokevirtual   #112 <Method int ViewGroup.getId()>
	//   70  139:aload_3         
	//   71  140:invokevirtual   #115 <Method FragmentTransaction FragmentTransaction.add(int, Fragment)>
	//   72  143:pop             
		return ((Object) (fragment1));
	//   73  144:aload_3         
	//   74  145:areturn         
	}

	public boolean isViewFromObject(View view, Object obj)
	{
		return ((Fragment)obj).getView() == view;
	//    0    0:aload_2         
	//    1    1:checkcast       #46  <Class Fragment>
	//    2    4:invokevirtual   #122 <Method View Fragment.getView()>
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
	//*   1    1:ifnull          217
		{
			parcelable = ((Parcelable) ((Bundle)parcelable));
	//    2    4:aload_1         
	//    3    5:checkcast       #126 <Class Bundle>
	//    4    8:astore_1        
			((Bundle) (parcelable)).setClassLoader(classloader);
	//    5    9:aload_1         
	//    6   10:aload_2         
	//    7   11:invokevirtual   #130 <Method void Bundle.setClassLoader(ClassLoader)>
			classloader = ((ClassLoader) (((Bundle) (parcelable)).getParcelableArray("states")));
	//    8   14:aload_1         
	//    9   15:ldc1            #132 <String "states">
	//   10   17:invokevirtual   #136 <Method Parcelable[] Bundle.getParcelableArray(String)>
	//   11   20:astore_2        
			mSavedState.clear();
	//   12   21:aload_0         
	//   13   22:getfield        #34  <Field ArrayList mSavedState>
	//   14   25:invokevirtual   #139 <Method void ArrayList.clear()>
			mFragments.clear();
	//   15   28:aload_0         
	//   16   29:getfield        #36  <Field ArrayList mFragments>
	//   17   32:invokevirtual   #139 <Method void ArrayList.clear()>
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
	//   31   54:checkcast       #96  <Class Fragment$SavedState>
	//   32   57:invokevirtual   #60  <Method boolean ArrayList.add(Object)>
	//   33   60:pop             

	//   34   61:iload_3         
	//   35   62:iconst_1        
	//   36   63:iadd            
	//   37   64:istore_3        
			}
	//*  38   65:goto            41
			classloader = ((ClassLoader) (((Iterable) (((Bundle) (parcelable)).keySet())).iterator()));
	//   39   68:aload_1         
	//   40   69:invokevirtual   #143 <Method java.util.Set Bundle.keySet()>
	//   41   72:invokeinterface #149 <Method Iterator Iterable.iterator()>
	//   42   77:astore_2        
			do
			{
				if(!((Iterator) (classloader)).hasNext())
					break;
	//   43   78:aload_2         
	//   44   79:invokeinterface #154 <Method boolean Iterator.hasNext()>
	//   45   84:ifeq            217
				String s = (String)((Iterator) (classloader)).next();
	//   46   87:aload_2         
	//   47   88:invokeinterface #158 <Method Object Iterator.next()>
	//   48   93:checkcast       #160 <Class String>
	//   49   96:astore          4
				if(s.startsWith("f"))
	//*  50   98:aload           4
	//*  51  100:ldc1            #162 <String "f">
	//*  52  102:invokevirtual   #166 <Method boolean String.startsWith(String)>
	//*  53  105:ifeq            78
				{
					int j = Integer.parseInt(s.substring(1));
	//   54  108:aload           4
	//   55  110:iconst_1        
	//   56  111:invokevirtual   #170 <Method String String.substring(int)>
	//   57  114:invokestatic    #176 <Method int Integer.parseInt(String)>
	//   58  117:istore_3        
					Fragment fragment = mFragmentManager.getFragment(((Bundle) (parcelable)), s);
	//   59  118:aload_0         
	//   60  119:getfield        #40  <Field FragmentManager mFragmentManager>
	//   61  122:aload_1         
	//   62  123:aload           4
	//   63  125:invokevirtual   #180 <Method Fragment FragmentManager.getFragment(Bundle, String)>
	//   64  128:astore          5
					if(fragment != null)
	//*  65  130:aload           5
	//*  66  132:ifnull          178
					{
						for(; mFragments.size() <= j; mFragments.add(((Object) (null))));
	//   67  135:aload_0         
	//   68  136:getfield        #36  <Field ArrayList mFragments>
	//   69  139:invokevirtual   #56  <Method int ArrayList.size()>
	//   70  142:iload_3         
	//   71  143:icmpgt          158
	//   72  146:aload_0         
	//   73  147:getfield        #36  <Field ArrayList mFragments>
	//   74  150:aconst_null     
	//   75  151:invokevirtual   #60  <Method boolean ArrayList.add(Object)>
	//   76  154:pop             
	//*  77  155:goto            135
						fragment.setMenuVisibility(false);
	//   78  158:aload           5
	//   79  160:iconst_0        
	//   80  161:invokevirtual   #104 <Method void Fragment.setMenuVisibility(boolean)>
						mFragments.set(j, ((Object) (fragment)));
	//   81  164:aload_0         
	//   82  165:getfield        #36  <Field ArrayList mFragments>
	//   83  168:iload_3         
	//   84  169:aload           5
	//   85  171:invokevirtual   #72  <Method Object ArrayList.set(int, Object)>
	//   86  174:pop             
					} else
	//*  87  175:goto            78
					{
						StringBuilder stringbuilder = new StringBuilder();
	//   88  178:new             #182 <Class StringBuilder>
	//   89  181:dup             
	//   90  182:invokespecial   #183 <Method void StringBuilder()>
	//   91  185:astore          5
						stringbuilder.append("Bad fragment at key ");
	//   92  187:aload           5
	//   93  189:ldc1            #185 <String "Bad fragment at key ">
	//   94  191:invokevirtual   #189 <Method StringBuilder StringBuilder.append(String)>
	//   95  194:pop             
						stringbuilder.append(s);
	//   96  195:aload           5
	//   97  197:aload           4
	//   98  199:invokevirtual   #189 <Method StringBuilder StringBuilder.append(String)>
	//   99  202:pop             
						Log.w("FragmentStatePagerAdapt", stringbuilder.toString());
	//  100  203:ldc1            #11  <String "FragmentStatePagerAdapt">
	//  101  205:aload           5
	//  102  207:invokevirtual   #193 <Method String StringBuilder.toString()>
	//  103  210:invokestatic    #199 <Method int Log.w(String, String)>
	//  104  213:pop             
					}
				}
			} while(true);
	//  105  214:goto            78
		}
	//  106  217:return          
	}

	public Parcelable saveState()
	{
		Object obj1;
		if(mSavedState.size() > 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #34  <Field ArrayList mSavedState>
	//*   2    4:invokevirtual   #56  <Method int ArrayList.size()>
	//*   3    7:ifle            48
		{
			obj1 = ((Object) (new Bundle()));
	//    4   10:new             #126 <Class Bundle>
	//    5   13:dup             
	//    6   14:invokespecial   #202 <Method void Bundle()>
	//    7   17:astore_3        
			Fragment.SavedState asavedstate[] = new Fragment.SavedState[mSavedState.size()];
	//    8   18:aload_0         
	//    9   19:getfield        #34  <Field ArrayList mSavedState>
	//   10   22:invokevirtual   #56  <Method int ArrayList.size()>
	//   11   25:anewarray       Fragment.SavedState[]
	//   12   28:astore_2        
			mSavedState.toArray(((Object []) (asavedstate)));
	//   13   29:aload_0         
	//   14   30:getfield        #34  <Field ArrayList mSavedState>
	//   15   33:aload_2         
	//   16   34:invokevirtual   #206 <Method Object[] ArrayList.toArray(Object[])>
	//   17   37:pop             
			((Bundle) (obj1)).putParcelableArray("states", ((Parcelable []) (asavedstate)));
	//   18   38:aload_3         
	//   19   39:ldc1            #132 <String "states">
	//   20   41:aload_2         
	//   21   42:invokevirtual   #210 <Method void Bundle.putParcelableArray(String, Parcelable[])>
		} else
	//*  22   45:goto            50
		{
			obj1 = null;
	//   23   48:aconst_null     
	//   24   49:astore_3        
		}
		for(int i = 0; i < mFragments.size();)
	//*  25   50:iconst_0        
	//*  26   51:istore_1        
	//*  27   52:iload_1         
	//*  28   53:aload_0         
	//*  29   54:getfield        #36  <Field ArrayList mFragments>
	//*  30   57:invokevirtual   #56  <Method int ArrayList.size()>
	//*  31   60:icmpge          153
		{
			Fragment fragment = (Fragment)mFragments.get(i);
	//   32   63:aload_0         
	//   33   64:getfield        #36  <Field ArrayList mFragments>
	//   34   67:iload_1         
	//   35   68:invokevirtual   #92  <Method Object ArrayList.get(int)>
	//   36   71:checkcast       #46  <Class Fragment>
	//   37   74:astore          4
			Object obj = obj1;
	//   38   76:aload_3         
	//   39   77:astore_2        
			if(fragment != null)
	//*  40   78:aload           4
	//*  41   80:ifnull          144
			{
				obj = obj1;
	//   42   83:aload_3         
	//   43   84:astore_2        
				if(fragment.isAdded())
	//*  44   85:aload           4
	//*  45   87:invokevirtual   #64  <Method boolean Fragment.isAdded()>
	//*  46   90:ifeq            144
				{
					obj = obj1;
	//   47   93:aload_3         
	//   48   94:astore_2        
					if(obj1 == null)
	//*  49   95:aload_3         
	//*  50   96:ifnonnull       107
						obj = ((Object) (new Bundle()));
	//   51   99:new             #126 <Class Bundle>
	//   52  102:dup             
	//   53  103:invokespecial   #202 <Method void Bundle()>
	//   54  106:astore_2        
					obj1 = ((Object) (new StringBuilder()));
	//   55  107:new             #182 <Class StringBuilder>
	//   56  110:dup             
	//   57  111:invokespecial   #183 <Method void StringBuilder()>
	//   58  114:astore_3        
					((StringBuilder) (obj1)).append("f");
	//   59  115:aload_3         
	//   60  116:ldc1            #162 <String "f">
	//   61  118:invokevirtual   #189 <Method StringBuilder StringBuilder.append(String)>
	//   62  121:pop             
					((StringBuilder) (obj1)).append(i);
	//   63  122:aload_3         
	//   64  123:iload_1         
	//   65  124:invokevirtual   #213 <Method StringBuilder StringBuilder.append(int)>
	//   66  127:pop             
					obj1 = ((Object) (((StringBuilder) (obj1)).toString()));
	//   67  128:aload_3         
	//   68  129:invokevirtual   #193 <Method String StringBuilder.toString()>
	//   69  132:astore_3        
					mFragmentManager.putFragment(((Bundle) (obj)), ((String) (obj1)), fragment);
	//   70  133:aload_0         
	//   71  134:getfield        #40  <Field FragmentManager mFragmentManager>
	//   72  137:aload_2         
	//   73  138:aload_3         
	//   74  139:aload           4
	//   75  141:invokevirtual   #217 <Method void FragmentManager.putFragment(Bundle, String, Fragment)>
				}
			}
			i++;
	//   76  144:iload_1         
	//   77  145:iconst_1        
	//   78  146:iadd            
	//   79  147:istore_1        
			obj1 = obj;
	//   80  148:aload_2         
	//   81  149:astore_3        
		}

	//*  82  150:goto            52
		return ((Parcelable) (obj1));
	//   83  153:aload_3         
	//   84  154:areturn         
	}

	public void setPrimaryItem(ViewGroup viewgroup, int i, Object obj)
	{
		viewgroup = ((ViewGroup) ((Fragment)obj));
	//    0    0:aload_3         
	//    1    1:checkcast       #46  <Class Fragment>
	//    2    4:astore_1        
		obj = ((Object) (mCurrentPrimaryItem));
	//    3    5:aload_0         
	//    4    6:getfield        #38  <Field Fragment mCurrentPrimaryItem>
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
	//   13   21:invokevirtual   #104 <Method void Fragment.setMenuVisibility(boolean)>
				mCurrentPrimaryItem.setUserVisibleHint(false);
	//   14   24:aload_0         
	//   15   25:getfield        #38  <Field Fragment mCurrentPrimaryItem>
	//   16   28:iconst_0        
	//   17   29:invokevirtual   #107 <Method void Fragment.setUserVisibleHint(boolean)>
			}
			((Fragment) (viewgroup)).setMenuVisibility(true);
	//   18   32:aload_1         
	//   19   33:iconst_1        
	//   20   34:invokevirtual   #104 <Method void Fragment.setMenuVisibility(boolean)>
			((Fragment) (viewgroup)).setUserVisibleHint(true);
	//   21   37:aload_1         
	//   22   38:iconst_1        
	//   23   39:invokevirtual   #107 <Method void Fragment.setUserVisibleHint(boolean)>
			mCurrentPrimaryItem = ((Fragment) (viewgroup));
	//   24   42:aload_0         
	//   25   43:aload_1         
	//   26   44:putfield        #38  <Field Fragment mCurrentPrimaryItem>
		}
	//   27   47:return          
	}

	public void startUpdate(ViewGroup viewgroup)
	{
		if(viewgroup.getId() != -1)
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #112 <Method int ViewGroup.getId()>
	//*   2    4:iconst_m1       
	//*   3    5:icmpeq          9
		{
			return;
	//    4    8:return          
		} else
		{
			viewgroup = ((ViewGroup) (new StringBuilder()));
	//    5    9:new             #182 <Class StringBuilder>
	//    6   12:dup             
	//    7   13:invokespecial   #183 <Method void StringBuilder()>
	//    8   16:astore_1        
			((StringBuilder) (viewgroup)).append("ViewPager with adapter ");
	//    9   17:aload_1         
	//   10   18:ldc1            #221 <String "ViewPager with adapter ">
	//   11   20:invokevirtual   #189 <Method StringBuilder StringBuilder.append(String)>
	//   12   23:pop             
			((StringBuilder) (viewgroup)).append(((Object) (this)));
	//   13   24:aload_1         
	//   14   25:aload_0         
	//   15   26:invokevirtual   #224 <Method StringBuilder StringBuilder.append(Object)>
	//   16   29:pop             
			((StringBuilder) (viewgroup)).append(" requires a view id");
	//   17   30:aload_1         
	//   18   31:ldc1            #226 <String " requires a view id">
	//   19   33:invokevirtual   #189 <Method StringBuilder StringBuilder.append(String)>
	//   20   36:pop             
			throw new IllegalStateException(((StringBuilder) (viewgroup)).toString());
	//   21   37:new             #228 <Class IllegalStateException>
	//   22   40:dup             
	//   23   41:aload_1         
	//   24   42:invokevirtual   #193 <Method String StringBuilder.toString()>
	//   25   45:invokespecial   #231 <Method void IllegalStateException(String)>
	//   26   48:athrow          
		}
	}

	private static final boolean DEBUG = false;
	private static final String TAG = "FragmentStatePagerAdapt";
	private FragmentTransaction mCurTransaction;
	private Fragment mCurrentPrimaryItem;
	private final FragmentManager mFragmentManager;
	private ArrayList mFragments;
	private ArrayList mSavedState;
}

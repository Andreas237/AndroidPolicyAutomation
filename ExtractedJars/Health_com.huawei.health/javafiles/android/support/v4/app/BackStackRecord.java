// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.app;

import android.content.Context;
import android.support.v4.util.LogWriter;
import android.support.v4.view.ViewCompat;
import android.util.Log;
import android.view.View;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;
import java.util.ArrayList;

// Referenced classes of package android.support.v4.app:
//			FragmentTransaction, Fragment, FragmentManagerImpl, FragmentHostCallback

final class BackStackRecord extends FragmentTransaction
	implements FragmentManager.BackStackEntry, FragmentManagerImpl.OpGenerator
{
	static final class Op
	{

		int cmd;
		int enterAnim;
		int exitAnim;
		Fragment fragment;
		int popEnterAnim;
		int popExitAnim;

		Op()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #19  <Method void Object()>
		//    2    4:return          
		}

		Op(int i, Fragment fragment1)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #19  <Method void Object()>
			cmd = i;
		//    2    4:aload_0         
		//    3    5:iload_1         
		//    4    6:putfield        #23  <Field int cmd>
			fragment = fragment1;
		//    5    9:aload_0         
		//    6   10:aload_2         
		//    7   11:putfield        #25  <Field Fragment fragment>
		//    8   14:return          
		}
	}


	public BackStackRecord(FragmentManagerImpl fragmentmanagerimpl)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #79  <Method void FragmentTransaction()>
		mOps = new ArrayList();
	//    2    4:aload_0         
	//    3    5:new             #81  <Class ArrayList>
	//    4    8:dup             
	//    5    9:invokespecial   #82  <Method void ArrayList()>
	//    6   12:putfield        #84  <Field ArrayList mOps>
		mAllowAddToBackStack = true;
	//    7   15:aload_0         
	//    8   16:iconst_1        
	//    9   17:putfield        #86  <Field boolean mAllowAddToBackStack>
		mIndex = -1;
	//   10   20:aload_0         
	//   11   21:iconst_m1       
	//   12   22:putfield        #88  <Field int mIndex>
		mAllowOptimization = false;
	//   13   25:aload_0         
	//   14   26:iconst_0        
	//   15   27:putfield        #90  <Field boolean mAllowOptimization>
		mManager = fragmentmanagerimpl;
	//   16   30:aload_0         
	//   17   31:aload_1         
	//   18   32:putfield        #92  <Field FragmentManagerImpl mManager>
	//   19   35:return          
	}

	private void doAddOp(int i, Fragment fragment, String s, int j)
	{
		Class class1 = ((Object) (fragment)).getClass();
	//    0    0:aload_2         
	//    1    1:invokevirtual   #100 <Method Class Object.getClass()>
	//    2    4:astore          6
		int k = class1.getModifiers();
	//    3    6:aload           6
	//    4    8:invokevirtual   #106 <Method int Class.getModifiers()>
	//    5   11:istore          5
		if(class1.isAnonymousClass() || !Modifier.isPublic(k) || class1.isMemberClass() && !Modifier.isStatic(k))
	//*   6   13:aload           6
	//*   7   15:invokevirtual   #110 <Method boolean Class.isAnonymousClass()>
	//*   8   18:ifne            45
	//*   9   21:iload           5
	//*  10   23:invokestatic    #116 <Method boolean Modifier.isPublic(int)>
	//*  11   26:ifeq            45
	//*  12   29:aload           6
	//*  13   31:invokevirtual   #119 <Method boolean Class.isMemberClass()>
	//*  14   34:ifeq            86
	//*  15   37:iload           5
	//*  16   39:invokestatic    #122 <Method boolean Modifier.isStatic(int)>
	//*  17   42:ifne            86
			throw new IllegalStateException((new StringBuilder()).append("Fragment ").append(class1.getCanonicalName()).append(" must be a public static class to be  properly recreated from").append(" instance state.").toString());
	//   18   45:new             #124 <Class IllegalStateException>
	//   19   48:dup             
	//   20   49:new             #126 <Class StringBuilder>
	//   21   52:dup             
	//   22   53:invokespecial   #127 <Method void StringBuilder()>
	//   23   56:ldc1            #129 <String "Fragment ">
	//   24   58:invokevirtual   #133 <Method StringBuilder StringBuilder.append(String)>
	//   25   61:aload           6
	//   26   63:invokevirtual   #137 <Method String Class.getCanonicalName()>
	//   27   66:invokevirtual   #133 <Method StringBuilder StringBuilder.append(String)>
	//   28   69:ldc1            #139 <String " must be a public static class to be  properly recreated from">
	//   29   71:invokevirtual   #133 <Method StringBuilder StringBuilder.append(String)>
	//   30   74:ldc1            #141 <String " instance state.">
	//   31   76:invokevirtual   #133 <Method StringBuilder StringBuilder.append(String)>
	//   32   79:invokevirtual   #144 <Method String StringBuilder.toString()>
	//   33   82:invokespecial   #147 <Method void IllegalStateException(String)>
	//   34   85:athrow          
		fragment.mFragmentManager = mManager;
	//   35   86:aload_2         
	//   36   87:aload_0         
	//   37   88:getfield        #92  <Field FragmentManagerImpl mManager>
	//   38   91:putfield        #152 <Field FragmentManagerImpl Fragment.mFragmentManager>
		if(s != null)
	//*  39   94:aload_3         
	//*  40   95:ifnull          169
		{
			if(fragment.mTag != null && !s.equals(((Object) (fragment.mTag))))
	//*  41   98:aload_2         
	//*  42   99:getfield        #155 <Field String Fragment.mTag>
	//*  43  102:ifnull          164
	//*  44  105:aload_3         
	//*  45  106:aload_2         
	//*  46  107:getfield        #155 <Field String Fragment.mTag>
	//*  47  110:invokevirtual   #161 <Method boolean String.equals(Object)>
	//*  48  113:ifne            164
				throw new IllegalStateException((new StringBuilder()).append("Can't change tag of fragment ").append(((Object) (fragment))).append(": was ").append(fragment.mTag).append(" now ").append(s).toString());
	//   49  116:new             #124 <Class IllegalStateException>
	//   50  119:dup             
	//   51  120:new             #126 <Class StringBuilder>
	//   52  123:dup             
	//   53  124:invokespecial   #127 <Method void StringBuilder()>
	//   54  127:ldc1            #163 <String "Can't change tag of fragment ">
	//   55  129:invokevirtual   #133 <Method StringBuilder StringBuilder.append(String)>
	//   56  132:aload_2         
	//   57  133:invokevirtual   #166 <Method StringBuilder StringBuilder.append(Object)>
	//   58  136:ldc1            #168 <String ": was ">
	//   59  138:invokevirtual   #133 <Method StringBuilder StringBuilder.append(String)>
	//   60  141:aload_2         
	//   61  142:getfield        #155 <Field String Fragment.mTag>
	//   62  145:invokevirtual   #133 <Method StringBuilder StringBuilder.append(String)>
	//   63  148:ldc1            #170 <String " now ">
	//   64  150:invokevirtual   #133 <Method StringBuilder StringBuilder.append(String)>
	//   65  153:aload_3         
	//   66  154:invokevirtual   #133 <Method StringBuilder StringBuilder.append(String)>
	//   67  157:invokevirtual   #144 <Method String StringBuilder.toString()>
	//   68  160:invokespecial   #147 <Method void IllegalStateException(String)>
	//   69  163:athrow          
			fragment.mTag = s;
	//   70  164:aload_2         
	//   71  165:aload_3         
	//   72  166:putfield        #155 <Field String Fragment.mTag>
		}
		if(i != 0)
	//*  73  169:iload_1         
	//*  74  170:ifeq            292
		{
			if(i == -1)
	//*  75  173:iload_1         
	//*  76  174:iconst_m1       
	//*  77  175:icmpne          219
				throw new IllegalArgumentException((new StringBuilder()).append("Can't add fragment ").append(((Object) (fragment))).append(" with tag ").append(s).append(" to container view with no id").toString());
	//   78  178:new             #172 <Class IllegalArgumentException>
	//   79  181:dup             
	//   80  182:new             #126 <Class StringBuilder>
	//   81  185:dup             
	//   82  186:invokespecial   #127 <Method void StringBuilder()>
	//   83  189:ldc1            #174 <String "Can't add fragment ">
	//   84  191:invokevirtual   #133 <Method StringBuilder StringBuilder.append(String)>
	//   85  194:aload_2         
	//   86  195:invokevirtual   #166 <Method StringBuilder StringBuilder.append(Object)>
	//   87  198:ldc1            #176 <String " with tag ">
	//   88  200:invokevirtual   #133 <Method StringBuilder StringBuilder.append(String)>
	//   89  203:aload_3         
	//   90  204:invokevirtual   #133 <Method StringBuilder StringBuilder.append(String)>
	//   91  207:ldc1            #178 <String " to container view with no id">
	//   92  209:invokevirtual   #133 <Method StringBuilder StringBuilder.append(String)>
	//   93  212:invokevirtual   #144 <Method String StringBuilder.toString()>
	//   94  215:invokespecial   #179 <Method void IllegalArgumentException(String)>
	//   95  218:athrow          
			if(fragment.mFragmentId != 0 && fragment.mFragmentId != i)
	//*  96  219:aload_2         
	//*  97  220:getfield        #182 <Field int Fragment.mFragmentId>
	//*  98  223:ifeq            282
	//*  99  226:aload_2         
	//* 100  227:getfield        #182 <Field int Fragment.mFragmentId>
	//* 101  230:iload_1         
	//* 102  231:icmpeq          282
				throw new IllegalStateException((new StringBuilder()).append("Can't change container ID of fragment ").append(((Object) (fragment))).append(": was ").append(fragment.mFragmentId).append(" now ").append(i).toString());
	//  103  234:new             #124 <Class IllegalStateException>
	//  104  237:dup             
	//  105  238:new             #126 <Class StringBuilder>
	//  106  241:dup             
	//  107  242:invokespecial   #127 <Method void StringBuilder()>
	//  108  245:ldc1            #184 <String "Can't change container ID of fragment ">
	//  109  247:invokevirtual   #133 <Method StringBuilder StringBuilder.append(String)>
	//  110  250:aload_2         
	//  111  251:invokevirtual   #166 <Method StringBuilder StringBuilder.append(Object)>
	//  112  254:ldc1            #168 <String ": was ">
	//  113  256:invokevirtual   #133 <Method StringBuilder StringBuilder.append(String)>
	//  114  259:aload_2         
	//  115  260:getfield        #182 <Field int Fragment.mFragmentId>
	//  116  263:invokevirtual   #187 <Method StringBuilder StringBuilder.append(int)>
	//  117  266:ldc1            #170 <String " now ">
	//  118  268:invokevirtual   #133 <Method StringBuilder StringBuilder.append(String)>
	//  119  271:iload_1         
	//  120  272:invokevirtual   #187 <Method StringBuilder StringBuilder.append(int)>
	//  121  275:invokevirtual   #144 <Method String StringBuilder.toString()>
	//  122  278:invokespecial   #147 <Method void IllegalStateException(String)>
	//  123  281:athrow          
			fragment.mFragmentId = i;
	//  124  282:aload_2         
	//  125  283:iload_1         
	//  126  284:putfield        #182 <Field int Fragment.mFragmentId>
			fragment.mContainerId = i;
	//  127  287:aload_2         
	//  128  288:iload_1         
	//  129  289:putfield        #190 <Field int Fragment.mContainerId>
		}
		addOp(new Op(j, fragment));
	//  130  292:aload_0         
	//  131  293:new             #10  <Class BackStackRecord$Op>
	//  132  296:dup             
	//  133  297:iload           4
	//  134  299:aload_2         
	//  135  300:invokespecial   #193 <Method void BackStackRecord$Op(int, Fragment)>
	//  136  303:invokevirtual   #197 <Method void addOp(BackStackRecord$Op)>
	//  137  306:return          
	}

	private static boolean isFragmentPostponed(Op op)
	{
		op = ((Op) (op.fragment));
	//    0    0:aload_0         
	//    1    1:getfield        #203 <Field Fragment BackStackRecord$Op.fragment>
	//    2    4:astore_0        
		return op != null && ((Fragment) (op)).mAdded && ((Fragment) (op)).mView != null && !((Fragment) (op)).mDetached && !((Fragment) (op)).mHidden && ((Fragment) (op)).isPostponed();
	//    3    5:aload_0         
	//    4    6:ifnull          46
	//    5    9:aload_0         
	//    6   10:getfield        #206 <Field boolean Fragment.mAdded>
	//    7   13:ifeq            46
	//    8   16:aload_0         
	//    9   17:getfield        #210 <Field View Fragment.mView>
	//   10   20:ifnull          46
	//   11   23:aload_0         
	//   12   24:getfield        #213 <Field boolean Fragment.mDetached>
	//   13   27:ifne            46
	//   14   30:aload_0         
	//   15   31:getfield        #216 <Field boolean Fragment.mHidden>
	//   16   34:ifne            46
	//   17   37:aload_0         
	//   18   38:invokevirtual   #219 <Method boolean Fragment.isPostponed()>
	//   19   41:ifeq            46
	//   20   44:iconst_1        
	//   21   45:ireturn         
	//   22   46:iconst_0        
	//   23   47:ireturn         
	}

	public FragmentTransaction add(int i, Fragment fragment)
	{
		doAddOp(i, fragment, ((String) (null)), 1);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:aload_2         
	//    3    3:aconst_null     
	//    4    4:iconst_1        
	//    5    5:invokespecial   #223 <Method void doAddOp(int, Fragment, String, int)>
		return ((FragmentTransaction) (this));
	//    6    8:aload_0         
	//    7    9:areturn         
	}

	public FragmentTransaction add(int i, Fragment fragment, String s)
	{
		doAddOp(i, fragment, s, 1);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:iconst_1        
	//    5    5:invokespecial   #223 <Method void doAddOp(int, Fragment, String, int)>
		return ((FragmentTransaction) (this));
	//    6    8:aload_0         
	//    7    9:areturn         
	}

	public FragmentTransaction add(Fragment fragment, String s)
	{
		doAddOp(0, fragment, s, 1);
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:aload_1         
	//    3    3:aload_2         
	//    4    4:iconst_1        
	//    5    5:invokespecial   #223 <Method void doAddOp(int, Fragment, String, int)>
		return ((FragmentTransaction) (this));
	//    6    8:aload_0         
	//    7    9:areturn         
	}

	void addOp(Op op)
	{
		mOps.add(((Object) (op)));
	//    0    0:aload_0         
	//    1    1:getfield        #84  <Field ArrayList mOps>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #227 <Method boolean ArrayList.add(Object)>
	//    4    8:pop             
		op.enterAnim = mEnterAnim;
	//    5    9:aload_1         
	//    6   10:aload_0         
	//    7   11:getfield        #229 <Field int mEnterAnim>
	//    8   14:putfield        #232 <Field int BackStackRecord$Op.enterAnim>
		op.exitAnim = mExitAnim;
	//    9   17:aload_1         
	//   10   18:aload_0         
	//   11   19:getfield        #234 <Field int mExitAnim>
	//   12   22:putfield        #237 <Field int BackStackRecord$Op.exitAnim>
		op.popEnterAnim = mPopEnterAnim;
	//   13   25:aload_1         
	//   14   26:aload_0         
	//   15   27:getfield        #239 <Field int mPopEnterAnim>
	//   16   30:putfield        #242 <Field int BackStackRecord$Op.popEnterAnim>
		op.popExitAnim = mPopExitAnim;
	//   17   33:aload_1         
	//   18   34:aload_0         
	//   19   35:getfield        #244 <Field int mPopExitAnim>
	//   20   38:putfield        #247 <Field int BackStackRecord$Op.popExitAnim>
	//   21   41:return          
	}

	public FragmentTransaction addSharedElement(View view, String s)
	{
		if(SUPPORTS_TRANSITIONS)
	//*   0    0:getstatic       #74  <Field boolean SUPPORTS_TRANSITIONS>
	//*   1    3:ifeq            166
		{
			view = ((View) (ViewCompat.getTransitionName(view)));
	//    2    6:aload_1         
	//    3    7:invokestatic    #255 <Method String ViewCompat.getTransitionName(View)>
	//    4   10:astore_1        
			if(view == null)
	//*   5   11:aload_1         
	//*   6   12:ifnonnull       26
				throw new IllegalArgumentException("Unique transitionNames are required for all sharedElements");
	//    7   15:new             #172 <Class IllegalArgumentException>
	//    8   18:dup             
	//    9   19:ldc2            #257 <String "Unique transitionNames are required for all sharedElements">
	//   10   22:invokespecial   #179 <Method void IllegalArgumentException(String)>
	//   11   25:athrow          
			if(mSharedElementSourceNames == null)
	//*  12   26:aload_0         
	//*  13   27:getfield        #259 <Field ArrayList mSharedElementSourceNames>
	//*  14   30:ifnonnull       58
			{
				mSharedElementSourceNames = new ArrayList();
	//   15   33:aload_0         
	//   16   34:new             #81  <Class ArrayList>
	//   17   37:dup             
	//   18   38:invokespecial   #82  <Method void ArrayList()>
	//   19   41:putfield        #259 <Field ArrayList mSharedElementSourceNames>
				mSharedElementTargetNames = new ArrayList();
	//   20   44:aload_0         
	//   21   45:new             #81  <Class ArrayList>
	//   22   48:dup             
	//   23   49:invokespecial   #82  <Method void ArrayList()>
	//   24   52:putfield        #261 <Field ArrayList mSharedElementTargetNames>
			} else
	//*  25   55:goto            148
			{
				if(mSharedElementTargetNames.contains(((Object) (s))))
	//*  26   58:aload_0         
	//*  27   59:getfield        #261 <Field ArrayList mSharedElementTargetNames>
	//*  28   62:aload_2         
	//*  29   63:invokevirtual   #264 <Method boolean ArrayList.contains(Object)>
	//*  30   66:ifeq            103
					throw new IllegalArgumentException((new StringBuilder()).append("A shared element with the target name '").append(s).append("' has already been added to the transaction.").toString());
	//   31   69:new             #172 <Class IllegalArgumentException>
	//   32   72:dup             
	//   33   73:new             #126 <Class StringBuilder>
	//   34   76:dup             
	//   35   77:invokespecial   #127 <Method void StringBuilder()>
	//   36   80:ldc2            #266 <String "A shared element with the target name '">
	//   37   83:invokevirtual   #133 <Method StringBuilder StringBuilder.append(String)>
	//   38   86:aload_2         
	//   39   87:invokevirtual   #133 <Method StringBuilder StringBuilder.append(String)>
	//   40   90:ldc2            #268 <String "' has already been added to the transaction.">
	//   41   93:invokevirtual   #133 <Method StringBuilder StringBuilder.append(String)>
	//   42   96:invokevirtual   #144 <Method String StringBuilder.toString()>
	//   43   99:invokespecial   #179 <Method void IllegalArgumentException(String)>
	//   44  102:athrow          
				if(mSharedElementSourceNames.contains(((Object) (view))))
	//*  45  103:aload_0         
	//*  46  104:getfield        #259 <Field ArrayList mSharedElementSourceNames>
	//*  47  107:aload_1         
	//*  48  108:invokevirtual   #264 <Method boolean ArrayList.contains(Object)>
	//*  49  111:ifeq            148
					throw new IllegalArgumentException((new StringBuilder()).append("A shared element with the source name '").append(((String) (view))).append(" has already been added to the transaction.").toString());
	//   50  114:new             #172 <Class IllegalArgumentException>
	//   51  117:dup             
	//   52  118:new             #126 <Class StringBuilder>
	//   53  121:dup             
	//   54  122:invokespecial   #127 <Method void StringBuilder()>
	//   55  125:ldc2            #270 <String "A shared element with the source name '">
	//   56  128:invokevirtual   #133 <Method StringBuilder StringBuilder.append(String)>
	//   57  131:aload_1         
	//   58  132:invokevirtual   #133 <Method StringBuilder StringBuilder.append(String)>
	//   59  135:ldc2            #272 <String " has already been added to the transaction.">
	//   60  138:invokevirtual   #133 <Method StringBuilder StringBuilder.append(String)>
	//   61  141:invokevirtual   #144 <Method String StringBuilder.toString()>
	//   62  144:invokespecial   #179 <Method void IllegalArgumentException(String)>
	//   63  147:athrow          
			}
			mSharedElementSourceNames.add(((Object) (view)));
	//   64  148:aload_0         
	//   65  149:getfield        #259 <Field ArrayList mSharedElementSourceNames>
	//   66  152:aload_1         
	//   67  153:invokevirtual   #227 <Method boolean ArrayList.add(Object)>
	//   68  156:pop             
			mSharedElementTargetNames.add(((Object) (s)));
	//   69  157:aload_0         
	//   70  158:getfield        #261 <Field ArrayList mSharedElementTargetNames>
	//   71  161:aload_2         
	//   72  162:invokevirtual   #227 <Method boolean ArrayList.add(Object)>
	//   73  165:pop             
		}
		return ((FragmentTransaction) (this));
	//   74  166:aload_0         
	//   75  167:areturn         
	}

	public FragmentTransaction addToBackStack(String s)
	{
		if(!mAllowAddToBackStack)
	//*   0    0:aload_0         
	//*   1    1:getfield        #86  <Field boolean mAllowAddToBackStack>
	//*   2    4:ifne            18
		{
			throw new IllegalStateException("This FragmentTransaction is not allowed to be added to the back stack.");
	//    3    7:new             #124 <Class IllegalStateException>
	//    4   10:dup             
	//    5   11:ldc2            #276 <String "This FragmentTransaction is not allowed to be added to the back stack.">
	//    6   14:invokespecial   #147 <Method void IllegalStateException(String)>
	//    7   17:athrow          
		} else
		{
			mAddToBackStack = true;
	//    8   18:aload_0         
	//    9   19:iconst_1        
	//   10   20:putfield        #278 <Field boolean mAddToBackStack>
			mName = s;
	//   11   23:aload_0         
	//   12   24:aload_1         
	//   13   25:putfield        #280 <Field String mName>
			return ((FragmentTransaction) (this));
	//   14   28:aload_0         
	//   15   29:areturn         
		}
	}

	public FragmentTransaction attach(Fragment fragment)
	{
		addOp(new Op(7, fragment));
	//    0    0:aload_0         
	//    1    1:new             #10  <Class BackStackRecord$Op>
	//    2    4:dup             
	//    3    5:bipush          7
	//    4    7:aload_1         
	//    5    8:invokespecial   #193 <Method void BackStackRecord$Op(int, Fragment)>
	//    6   11:invokevirtual   #197 <Method void addOp(BackStackRecord$Op)>
		return ((FragmentTransaction) (this));
	//    7   14:aload_0         
	//    8   15:areturn         
	}

	void bumpBackStackNesting(int i)
	{
		if(!mAddToBackStack)
	//*   0    0:aload_0         
	//*   1    1:getfield        #278 <Field boolean mAddToBackStack>
	//*   2    4:ifne            8
			return;
	//    3    7:return          
		if(FragmentManagerImpl.DEBUG)
	//*   4    8:getstatic       #289 <Field boolean FragmentManagerImpl.DEBUG>
	//*   5   11:ifeq            50
			Log.v("FragmentManager", (new StringBuilder()).append("Bump nesting in ").append(((Object) (this))).append(" by ").append(i).toString());
	//    6   14:ldc1            #38  <String "FragmentManager">
	//    7   16:new             #126 <Class StringBuilder>
	//    8   19:dup             
	//    9   20:invokespecial   #127 <Method void StringBuilder()>
	//   10   23:ldc2            #291 <String "Bump nesting in ">
	//   11   26:invokevirtual   #133 <Method StringBuilder StringBuilder.append(String)>
	//   12   29:aload_0         
	//   13   30:invokevirtual   #166 <Method StringBuilder StringBuilder.append(Object)>
	//   14   33:ldc2            #293 <String " by ">
	//   15   36:invokevirtual   #133 <Method StringBuilder StringBuilder.append(String)>
	//   16   39:iload_1         
	//   17   40:invokevirtual   #187 <Method StringBuilder StringBuilder.append(int)>
	//   18   43:invokevirtual   #144 <Method String StringBuilder.toString()>
	//   19   46:invokestatic    #299 <Method int Log.v(String, String)>
	//   20   49:pop             
		int k = mOps.size();
	//   21   50:aload_0         
	//   22   51:getfield        #84  <Field ArrayList mOps>
	//   23   54:invokevirtual   #302 <Method int ArrayList.size()>
	//   24   57:istore_3        
		for(int j = 0; j < k; j++)
	//*  25   58:iconst_0        
	//*  26   59:istore_2        
	//*  27   60:iload_2         
	//*  28   61:iload_3         
	//*  29   62:icmpge          165
		{
			Op op = (Op)mOps.get(j);
	//   30   65:aload_0         
	//   31   66:getfield        #84  <Field ArrayList mOps>
	//   32   69:iload_2         
	//   33   70:invokevirtual   #306 <Method Object ArrayList.get(int)>
	//   34   73:checkcast       #10  <Class BackStackRecord$Op>
	//   35   76:astore          4
			if(op.fragment == null)
				continue;
	//   36   78:aload           4
	//   37   80:getfield        #203 <Field Fragment BackStackRecord$Op.fragment>
	//   38   83:ifnull          158
			Fragment fragment = op.fragment;
	//   39   86:aload           4
	//   40   88:getfield        #203 <Field Fragment BackStackRecord$Op.fragment>
	//   41   91:astore          5
			fragment.mBackStackNesting = fragment.mBackStackNesting + i;
	//   42   93:aload           5
	//   43   95:aload           5
	//   44   97:getfield        #309 <Field int Fragment.mBackStackNesting>
	//   45  100:iload_1         
	//   46  101:iadd            
	//   47  102:putfield        #309 <Field int Fragment.mBackStackNesting>
			if(FragmentManagerImpl.DEBUG)
	//*  48  105:getstatic       #289 <Field boolean FragmentManagerImpl.DEBUG>
	//*  49  108:ifeq            158
				Log.v("FragmentManager", (new StringBuilder()).append("Bump nesting of ").append(((Object) (op.fragment))).append(" to ").append(op.fragment.mBackStackNesting).toString());
	//   50  111:ldc1            #38  <String "FragmentManager">
	//   51  113:new             #126 <Class StringBuilder>
	//   52  116:dup             
	//   53  117:invokespecial   #127 <Method void StringBuilder()>
	//   54  120:ldc2            #311 <String "Bump nesting of ">
	//   55  123:invokevirtual   #133 <Method StringBuilder StringBuilder.append(String)>
	//   56  126:aload           4
	//   57  128:getfield        #203 <Field Fragment BackStackRecord$Op.fragment>
	//   58  131:invokevirtual   #166 <Method StringBuilder StringBuilder.append(Object)>
	//   59  134:ldc2            #313 <String " to ">
	//   60  137:invokevirtual   #133 <Method StringBuilder StringBuilder.append(String)>
	//   61  140:aload           4
	//   62  142:getfield        #203 <Field Fragment BackStackRecord$Op.fragment>
	//   63  145:getfield        #309 <Field int Fragment.mBackStackNesting>
	//   64  148:invokevirtual   #187 <Method StringBuilder StringBuilder.append(int)>
	//   65  151:invokevirtual   #144 <Method String StringBuilder.toString()>
	//   66  154:invokestatic    #299 <Method int Log.v(String, String)>
	//   67  157:pop             
		}

	//   68  158:iload_2         
	//   69  159:iconst_1        
	//   70  160:iadd            
	//   71  161:istore_2        
	//*  72  162:goto            60
	//   73  165:return          
	}

	public int commit()
	{
		return commitInternal(false);
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:invokevirtual   #318 <Method int commitInternal(boolean)>
	//    3    5:ireturn         
	}

	public int commitAllowingStateLoss()
	{
		return commitInternal(true);
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:invokevirtual   #318 <Method int commitInternal(boolean)>
	//    3    5:ireturn         
	}

	int commitInternal(boolean flag)
	{
		if(mCommitted)
	//*   0    0:aload_0         
	//*   1    1:getfield        #321 <Field boolean mCommitted>
	//*   2    4:ifeq            18
			throw new IllegalStateException("commit already called");
	//    3    7:new             #124 <Class IllegalStateException>
	//    4   10:dup             
	//    5   11:ldc2            #323 <String "commit already called">
	//    6   14:invokespecial   #147 <Method void IllegalStateException(String)>
	//    7   17:athrow          
		if(FragmentManagerImpl.DEBUG)
	//*   8   18:getstatic       #289 <Field boolean FragmentManagerImpl.DEBUG>
	//*   9   21:ifeq            81
		{
			Log.v("FragmentManager", (new StringBuilder()).append("Commit: ").append(((Object) (this))).toString());
	//   10   24:ldc1            #38  <String "FragmentManager">
	//   11   26:new             #126 <Class StringBuilder>
	//   12   29:dup             
	//   13   30:invokespecial   #127 <Method void StringBuilder()>
	//   14   33:ldc2            #325 <String "Commit: ">
	//   15   36:invokevirtual   #133 <Method StringBuilder StringBuilder.append(String)>
	//   16   39:aload_0         
	//   17   40:invokevirtual   #166 <Method StringBuilder StringBuilder.append(Object)>
	//   18   43:invokevirtual   #144 <Method String StringBuilder.toString()>
	//   19   46:invokestatic    #299 <Method int Log.v(String, String)>
	//   20   49:pop             
			PrintWriter printwriter = new PrintWriter(((java.io.Writer) (new LogWriter("FragmentManager"))));
	//   21   50:new             #327 <Class PrintWriter>
	//   22   53:dup             
	//   23   54:new             #329 <Class LogWriter>
	//   24   57:dup             
	//   25   58:ldc1            #38  <String "FragmentManager">
	//   26   60:invokespecial   #330 <Method void LogWriter(String)>
	//   27   63:invokespecial   #333 <Method void PrintWriter(java.io.Writer)>
	//   28   66:astore_2        
			dump("  ", ((FileDescriptor) (null)), printwriter, ((String []) (null)));
	//   29   67:aload_0         
	//   30   68:ldc2            #335 <String "  ">
	//   31   71:aconst_null     
	//   32   72:aload_2         
	//   33   73:aconst_null     
	//   34   74:invokevirtual   #339 <Method void dump(String, FileDescriptor, PrintWriter, String[])>
			printwriter.close();
	//   35   77:aload_2         
	//   36   78:invokevirtual   #342 <Method void PrintWriter.close()>
		}
		mCommitted = true;
	//   37   81:aload_0         
	//   38   82:iconst_1        
	//   39   83:putfield        #321 <Field boolean mCommitted>
		if(mAddToBackStack)
	//*  40   86:aload_0         
	//*  41   87:getfield        #278 <Field boolean mAddToBackStack>
	//*  42   90:ifeq            108
			mIndex = mManager.allocBackStackIndex(this);
	//   43   93:aload_0         
	//   44   94:aload_0         
	//   45   95:getfield        #92  <Field FragmentManagerImpl mManager>
	//   46   98:aload_0         
	//   47   99:invokevirtual   #346 <Method int FragmentManagerImpl.allocBackStackIndex(BackStackRecord)>
	//   48  102:putfield        #88  <Field int mIndex>
		else
	//*  49  105:goto            113
			mIndex = -1;
	//   50  108:aload_0         
	//   51  109:iconst_m1       
	//   52  110:putfield        #88  <Field int mIndex>
		mManager.enqueueAction(((FragmentManagerImpl.OpGenerator) (this)), flag);
	//   53  113:aload_0         
	//   54  114:getfield        #92  <Field FragmentManagerImpl mManager>
	//   55  117:aload_0         
	//   56  118:iload_1         
	//   57  119:invokevirtual   #350 <Method void FragmentManagerImpl.enqueueAction(FragmentManagerImpl$OpGenerator, boolean)>
		return mIndex;
	//   58  122:aload_0         
	//   59  123:getfield        #88  <Field int mIndex>
	//   60  126:ireturn         
	}

	public void commitNow()
	{
		disallowAddToBackStack();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #355 <Method FragmentTransaction disallowAddToBackStack()>
	//    2    4:pop             
		mManager.execSingleAction(((FragmentManagerImpl.OpGenerator) (this)), false);
	//    3    5:aload_0         
	//    4    6:getfield        #92  <Field FragmentManagerImpl mManager>
	//    5    9:aload_0         
	//    6   10:iconst_0        
	//    7   11:invokevirtual   #358 <Method void FragmentManagerImpl.execSingleAction(FragmentManagerImpl$OpGenerator, boolean)>
	//    8   14:return          
	}

	public void commitNowAllowingStateLoss()
	{
		disallowAddToBackStack();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #355 <Method FragmentTransaction disallowAddToBackStack()>
	//    2    4:pop             
		mManager.execSingleAction(((FragmentManagerImpl.OpGenerator) (this)), true);
	//    3    5:aload_0         
	//    4    6:getfield        #92  <Field FragmentManagerImpl mManager>
	//    5    9:aload_0         
	//    6   10:iconst_1        
	//    7   11:invokevirtual   #358 <Method void FragmentManagerImpl.execSingleAction(FragmentManagerImpl$OpGenerator, boolean)>
	//    8   14:return          
	}

	public FragmentTransaction detach(Fragment fragment)
	{
		addOp(new Op(6, fragment));
	//    0    0:aload_0         
	//    1    1:new             #10  <Class BackStackRecord$Op>
	//    2    4:dup             
	//    3    5:bipush          6
	//    4    7:aload_1         
	//    5    8:invokespecial   #193 <Method void BackStackRecord$Op(int, Fragment)>
	//    6   11:invokevirtual   #197 <Method void addOp(BackStackRecord$Op)>
		return ((FragmentTransaction) (this));
	//    7   14:aload_0         
	//    8   15:areturn         
	}

	public FragmentTransaction disallowAddToBackStack()
	{
		if(mAddToBackStack)
	//*   0    0:aload_0         
	//*   1    1:getfield        #278 <Field boolean mAddToBackStack>
	//*   2    4:ifeq            18
		{
			throw new IllegalStateException("This transaction is already being added to the back stack");
	//    3    7:new             #124 <Class IllegalStateException>
	//    4   10:dup             
	//    5   11:ldc2            #362 <String "This transaction is already being added to the back stack">
	//    6   14:invokespecial   #147 <Method void IllegalStateException(String)>
	//    7   17:athrow          
		} else
		{
			mAllowAddToBackStack = false;
	//    8   18:aload_0         
	//    9   19:iconst_0        
	//   10   20:putfield        #86  <Field boolean mAllowAddToBackStack>
			return ((FragmentTransaction) (this));
	//   11   23:aload_0         
	//   12   24:areturn         
		}
	}

	public void dump(String s, FileDescriptor filedescriptor, PrintWriter printwriter, String as[])
	{
		dump(s, printwriter, true);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_3         
	//    3    3:iconst_1        
	//    4    4:invokevirtual   #365 <Method void dump(String, PrintWriter, boolean)>
	//    5    7:return          
	}

	public void dump(String s, PrintWriter printwriter, boolean flag)
	{
		if(flag)
	//*   0    0:iload_3         
	//*   1    1:ifeq            316
		{
			printwriter.print(s);
	//    2    4:aload_2         
	//    3    5:aload_1         
	//    4    6:invokevirtual   #368 <Method void PrintWriter.print(String)>
			printwriter.print("mName=");
	//    5    9:aload_2         
	//    6   10:ldc2            #370 <String "mName=">
	//    7   13:invokevirtual   #368 <Method void PrintWriter.print(String)>
			printwriter.print(mName);
	//    8   16:aload_2         
	//    9   17:aload_0         
	//   10   18:getfield        #280 <Field String mName>
	//   11   21:invokevirtual   #368 <Method void PrintWriter.print(String)>
			printwriter.print(" mIndex=");
	//   12   24:aload_2         
	//   13   25:ldc2            #372 <String " mIndex=">
	//   14   28:invokevirtual   #368 <Method void PrintWriter.print(String)>
			printwriter.print(mIndex);
	//   15   31:aload_2         
	//   16   32:aload_0         
	//   17   33:getfield        #88  <Field int mIndex>
	//   18   36:invokevirtual   #374 <Method void PrintWriter.print(int)>
			printwriter.print(" mCommitted=");
	//   19   39:aload_2         
	//   20   40:ldc2            #376 <String " mCommitted=">
	//   21   43:invokevirtual   #368 <Method void PrintWriter.print(String)>
			printwriter.println(mCommitted);
	//   22   46:aload_2         
	//   23   47:aload_0         
	//   24   48:getfield        #321 <Field boolean mCommitted>
	//   25   51:invokevirtual   #380 <Method void PrintWriter.println(boolean)>
			if(mTransition != 0)
	//*  26   54:aload_0         
	//*  27   55:getfield        #382 <Field int mTransition>
	//*  28   58:ifeq            102
			{
				printwriter.print(s);
	//   29   61:aload_2         
	//   30   62:aload_1         
	//   31   63:invokevirtual   #368 <Method void PrintWriter.print(String)>
				printwriter.print("mTransition=#");
	//   32   66:aload_2         
	//   33   67:ldc2            #384 <String "mTransition=#">
	//   34   70:invokevirtual   #368 <Method void PrintWriter.print(String)>
				printwriter.print(Integer.toHexString(mTransition));
	//   35   73:aload_2         
	//   36   74:aload_0         
	//   37   75:getfield        #382 <Field int mTransition>
	//   38   78:invokestatic    #390 <Method String Integer.toHexString(int)>
	//   39   81:invokevirtual   #368 <Method void PrintWriter.print(String)>
				printwriter.print(" mTransitionStyle=#");
	//   40   84:aload_2         
	//   41   85:ldc2            #392 <String " mTransitionStyle=#">
	//   42   88:invokevirtual   #368 <Method void PrintWriter.print(String)>
				printwriter.println(Integer.toHexString(mTransitionStyle));
	//   43   91:aload_2         
	//   44   92:aload_0         
	//   45   93:getfield        #394 <Field int mTransitionStyle>
	//   46   96:invokestatic    #390 <Method String Integer.toHexString(int)>
	//   47   99:invokevirtual   #396 <Method void PrintWriter.println(String)>
			}
			if(mEnterAnim != 0 || mExitAnim != 0)
	//*  48  102:aload_0         
	//*  49  103:getfield        #229 <Field int mEnterAnim>
	//*  50  106:ifne            116
	//*  51  109:aload_0         
	//*  52  110:getfield        #234 <Field int mExitAnim>
	//*  53  113:ifeq            157
			{
				printwriter.print(s);
	//   54  116:aload_2         
	//   55  117:aload_1         
	//   56  118:invokevirtual   #368 <Method void PrintWriter.print(String)>
				printwriter.print("mEnterAnim=#");
	//   57  121:aload_2         
	//   58  122:ldc2            #398 <String "mEnterAnim=#">
	//   59  125:invokevirtual   #368 <Method void PrintWriter.print(String)>
				printwriter.print(Integer.toHexString(mEnterAnim));
	//   60  128:aload_2         
	//   61  129:aload_0         
	//   62  130:getfield        #229 <Field int mEnterAnim>
	//   63  133:invokestatic    #390 <Method String Integer.toHexString(int)>
	//   64  136:invokevirtual   #368 <Method void PrintWriter.print(String)>
				printwriter.print(" mExitAnim=#");
	//   65  139:aload_2         
	//   66  140:ldc2            #400 <String " mExitAnim=#">
	//   67  143:invokevirtual   #368 <Method void PrintWriter.print(String)>
				printwriter.println(Integer.toHexString(mExitAnim));
	//   68  146:aload_2         
	//   69  147:aload_0         
	//   70  148:getfield        #234 <Field int mExitAnim>
	//   71  151:invokestatic    #390 <Method String Integer.toHexString(int)>
	//   72  154:invokevirtual   #396 <Method void PrintWriter.println(String)>
			}
			if(mPopEnterAnim != 0 || mPopExitAnim != 0)
	//*  73  157:aload_0         
	//*  74  158:getfield        #239 <Field int mPopEnterAnim>
	//*  75  161:ifne            171
	//*  76  164:aload_0         
	//*  77  165:getfield        #244 <Field int mPopExitAnim>
	//*  78  168:ifeq            212
			{
				printwriter.print(s);
	//   79  171:aload_2         
	//   80  172:aload_1         
	//   81  173:invokevirtual   #368 <Method void PrintWriter.print(String)>
				printwriter.print("mPopEnterAnim=#");
	//   82  176:aload_2         
	//   83  177:ldc2            #402 <String "mPopEnterAnim=#">
	//   84  180:invokevirtual   #368 <Method void PrintWriter.print(String)>
				printwriter.print(Integer.toHexString(mPopEnterAnim));
	//   85  183:aload_2         
	//   86  184:aload_0         
	//   87  185:getfield        #239 <Field int mPopEnterAnim>
	//   88  188:invokestatic    #390 <Method String Integer.toHexString(int)>
	//   89  191:invokevirtual   #368 <Method void PrintWriter.print(String)>
				printwriter.print(" mPopExitAnim=#");
	//   90  194:aload_2         
	//   91  195:ldc2            #404 <String " mPopExitAnim=#">
	//   92  198:invokevirtual   #368 <Method void PrintWriter.print(String)>
				printwriter.println(Integer.toHexString(mPopExitAnim));
	//   93  201:aload_2         
	//   94  202:aload_0         
	//   95  203:getfield        #244 <Field int mPopExitAnim>
	//   96  206:invokestatic    #390 <Method String Integer.toHexString(int)>
	//   97  209:invokevirtual   #396 <Method void PrintWriter.println(String)>
			}
			if(mBreadCrumbTitleRes != 0 || mBreadCrumbTitleText != null)
	//*  98  212:aload_0         
	//*  99  213:getfield        #406 <Field int mBreadCrumbTitleRes>
	//* 100  216:ifne            226
	//* 101  219:aload_0         
	//* 102  220:getfield        #408 <Field CharSequence mBreadCrumbTitleText>
	//* 103  223:ifnull          264
			{
				printwriter.print(s);
	//  104  226:aload_2         
	//  105  227:aload_1         
	//  106  228:invokevirtual   #368 <Method void PrintWriter.print(String)>
				printwriter.print("mBreadCrumbTitleRes=#");
	//  107  231:aload_2         
	//  108  232:ldc2            #410 <String "mBreadCrumbTitleRes=#">
	//  109  235:invokevirtual   #368 <Method void PrintWriter.print(String)>
				printwriter.print(Integer.toHexString(mBreadCrumbTitleRes));
	//  110  238:aload_2         
	//  111  239:aload_0         
	//  112  240:getfield        #406 <Field int mBreadCrumbTitleRes>
	//  113  243:invokestatic    #390 <Method String Integer.toHexString(int)>
	//  114  246:invokevirtual   #368 <Method void PrintWriter.print(String)>
				printwriter.print(" mBreadCrumbTitleText=");
	//  115  249:aload_2         
	//  116  250:ldc2            #412 <String " mBreadCrumbTitleText=">
	//  117  253:invokevirtual   #368 <Method void PrintWriter.print(String)>
				printwriter.println(((Object) (mBreadCrumbTitleText)));
	//  118  256:aload_2         
	//  119  257:aload_0         
	//  120  258:getfield        #408 <Field CharSequence mBreadCrumbTitleText>
	//  121  261:invokevirtual   #415 <Method void PrintWriter.println(Object)>
			}
			if(mBreadCrumbShortTitleRes != 0 || mBreadCrumbShortTitleText != null)
	//* 122  264:aload_0         
	//* 123  265:getfield        #417 <Field int mBreadCrumbShortTitleRes>
	//* 124  268:ifne            278
	//* 125  271:aload_0         
	//* 126  272:getfield        #419 <Field CharSequence mBreadCrumbShortTitleText>
	//* 127  275:ifnull          316
			{
				printwriter.print(s);
	//  128  278:aload_2         
	//  129  279:aload_1         
	//  130  280:invokevirtual   #368 <Method void PrintWriter.print(String)>
				printwriter.print("mBreadCrumbShortTitleRes=#");
	//  131  283:aload_2         
	//  132  284:ldc2            #421 <String "mBreadCrumbShortTitleRes=#">
	//  133  287:invokevirtual   #368 <Method void PrintWriter.print(String)>
				printwriter.print(Integer.toHexString(mBreadCrumbShortTitleRes));
	//  134  290:aload_2         
	//  135  291:aload_0         
	//  136  292:getfield        #417 <Field int mBreadCrumbShortTitleRes>
	//  137  295:invokestatic    #390 <Method String Integer.toHexString(int)>
	//  138  298:invokevirtual   #368 <Method void PrintWriter.print(String)>
				printwriter.print(" mBreadCrumbShortTitleText=");
	//  139  301:aload_2         
	//  140  302:ldc2            #423 <String " mBreadCrumbShortTitleText=">
	//  141  305:invokevirtual   #368 <Method void PrintWriter.print(String)>
				printwriter.println(((Object) (mBreadCrumbShortTitleText)));
	//  142  308:aload_2         
	//  143  309:aload_0         
	//  144  310:getfield        #419 <Field CharSequence mBreadCrumbShortTitleText>
	//  145  313:invokevirtual   #415 <Method void PrintWriter.println(Object)>
			}
		}
		if(!mOps.isEmpty())
	//* 146  316:aload_0         
	//* 147  317:getfield        #84  <Field ArrayList mOps>
	//* 148  320:invokevirtual   #426 <Method boolean ArrayList.isEmpty()>
	//* 149  323:ifne            739
		{
			printwriter.print(s);
	//  150  326:aload_2         
	//  151  327:aload_1         
	//  152  328:invokevirtual   #368 <Method void PrintWriter.print(String)>
			printwriter.println("Operations:");
	//  153  331:aload_2         
	//  154  332:ldc2            #428 <String "Operations:">
	//  155  335:invokevirtual   #396 <Method void PrintWriter.println(String)>
			(new StringBuilder()).append(s).append("    ").toString();
	//  156  338:new             #126 <Class StringBuilder>
	//  157  341:dup             
	//  158  342:invokespecial   #127 <Method void StringBuilder()>
	//  159  345:aload_1         
	//  160  346:invokevirtual   #133 <Method StringBuilder StringBuilder.append(String)>
	//  161  349:ldc2            #430 <String "    ">
	//  162  352:invokevirtual   #133 <Method StringBuilder StringBuilder.append(String)>
	//  163  355:invokevirtual   #144 <Method String StringBuilder.toString()>
	//  164  358:pop             
			int j = mOps.size();
	//  165  359:aload_0         
	//  166  360:getfield        #84  <Field ArrayList mOps>
	//  167  363:invokevirtual   #302 <Method int ArrayList.size()>
	//  168  366:istore          5
			for(int i = 0; i < j; i++)
	//* 169  368:iconst_0        
	//* 170  369:istore          4
	//* 171  371:iload           4
	//* 172  373:iload           5
	//* 173  375:icmpge          739
			{
				Op op = (Op)mOps.get(i);
	//  174  378:aload_0         
	//  175  379:getfield        #84  <Field ArrayList mOps>
	//  176  382:iload           4
	//  177  384:invokevirtual   #306 <Method Object ArrayList.get(int)>
	//  178  387:checkcast       #10  <Class BackStackRecord$Op>
	//  179  390:astore          7
				String s1;
				switch(op.cmd)
	//* 180  392:aload           7
	//* 181  394:getfield        #433 <Field int BackStackRecord$Op.cmd>
				{
	//* 182  397:tableswitch     0 9: default 452
	//	               0 455
	//	               1 463
	//	               2 471
	//	               3 479
	//	               4 487
	//	               5 495
	//	               6 503
	//	               7 511
	//	               8 519
	//	               9 527
	//* 183  452:goto            535
				case 0: // '\0'
					s1 = "NULL";
	//  184  455:ldc2            #435 <String "NULL">
	//  185  458:astore          6
					break;

	//* 186  460:goto            561
				case 1: // '\001'
					s1 = "ADD";
	//  187  463:ldc2            #437 <String "ADD">
	//  188  466:astore          6
					break;

	//* 189  468:goto            561
				case 2: // '\002'
					s1 = "REPLACE";
	//  190  471:ldc2            #439 <String "REPLACE">
	//  191  474:astore          6
					break;

	//* 192  476:goto            561
				case 3: // '\003'
					s1 = "REMOVE";
	//  193  479:ldc2            #441 <String "REMOVE">
	//  194  482:astore          6
					break;

	//* 195  484:goto            561
				case 4: // '\004'
					s1 = "HIDE";
	//  196  487:ldc2            #443 <String "HIDE">
	//  197  490:astore          6
					break;

	//* 198  492:goto            561
				case 5: // '\005'
					s1 = "SHOW";
	//  199  495:ldc2            #445 <String "SHOW">
	//  200  498:astore          6
					break;

	//* 201  500:goto            561
				case 6: // '\006'
					s1 = "DETACH";
	//  202  503:ldc2            #447 <String "DETACH">
	//  203  506:astore          6
					break;

	//* 204  508:goto            561
				case 7: // '\007'
					s1 = "ATTACH";
	//  205  511:ldc2            #449 <String "ATTACH">
	//  206  514:astore          6
					break;

	//* 207  516:goto            561
				case 8: // '\b'
					s1 = "SET_PRIMARY_NAV";
	//  208  519:ldc2            #451 <String "SET_PRIMARY_NAV">
	//  209  522:astore          6
					break;

	//* 210  524:goto            561
				case 9: // '\t'
					s1 = "UNSET_PRIMARY_NAV";
	//  211  527:ldc2            #453 <String "UNSET_PRIMARY_NAV">
	//  212  530:astore          6
					break;

	//* 213  532:goto            561
				default:
					s1 = (new StringBuilder()).append("cmd=").append(op.cmd).toString();
	//  214  535:new             #126 <Class StringBuilder>
	//  215  538:dup             
	//  216  539:invokespecial   #127 <Method void StringBuilder()>
	//  217  542:ldc2            #455 <String "cmd=">
	//  218  545:invokevirtual   #133 <Method StringBuilder StringBuilder.append(String)>
	//  219  548:aload           7
	//  220  550:getfield        #433 <Field int BackStackRecord$Op.cmd>
	//  221  553:invokevirtual   #187 <Method StringBuilder StringBuilder.append(int)>
	//  222  556:invokevirtual   #144 <Method String StringBuilder.toString()>
	//  223  559:astore          6
					break;
				}
				printwriter.print(s);
	//  224  561:aload_2         
	//  225  562:aload_1         
	//  226  563:invokevirtual   #368 <Method void PrintWriter.print(String)>
				printwriter.print("  Op #");
	//  227  566:aload_2         
	//  228  567:ldc2            #457 <String "  Op #">
	//  229  570:invokevirtual   #368 <Method void PrintWriter.print(String)>
				printwriter.print(i);
	//  230  573:aload_2         
	//  231  574:iload           4
	//  232  576:invokevirtual   #374 <Method void PrintWriter.print(int)>
				printwriter.print(": ");
	//  233  579:aload_2         
	//  234  580:ldc2            #459 <String ": ">
	//  235  583:invokevirtual   #368 <Method void PrintWriter.print(String)>
				printwriter.print(s1);
	//  236  586:aload_2         
	//  237  587:aload           6
	//  238  589:invokevirtual   #368 <Method void PrintWriter.print(String)>
				printwriter.print(" ");
	//  239  592:aload_2         
	//  240  593:ldc2            #461 <String " ">
	//  241  596:invokevirtual   #368 <Method void PrintWriter.print(String)>
				printwriter.println(((Object) (op.fragment)));
	//  242  599:aload_2         
	//  243  600:aload           7
	//  244  602:getfield        #203 <Field Fragment BackStackRecord$Op.fragment>
	//  245  605:invokevirtual   #415 <Method void PrintWriter.println(Object)>
				if(!flag)
					continue;
	//  246  608:iload_3         
	//  247  609:ifeq            730
				if(op.enterAnim != 0 || op.exitAnim != 0)
	//* 248  612:aload           7
	//* 249  614:getfield        #232 <Field int BackStackRecord$Op.enterAnim>
	//* 250  617:ifne            628
	//* 251  620:aload           7
	//* 252  622:getfield        #237 <Field int BackStackRecord$Op.exitAnim>
	//* 253  625:ifeq            671
				{
					printwriter.print(s);
	//  254  628:aload_2         
	//  255  629:aload_1         
	//  256  630:invokevirtual   #368 <Method void PrintWriter.print(String)>
					printwriter.print("enterAnim=#");
	//  257  633:aload_2         
	//  258  634:ldc2            #463 <String "enterAnim=#">
	//  259  637:invokevirtual   #368 <Method void PrintWriter.print(String)>
					printwriter.print(Integer.toHexString(op.enterAnim));
	//  260  640:aload_2         
	//  261  641:aload           7
	//  262  643:getfield        #232 <Field int BackStackRecord$Op.enterAnim>
	//  263  646:invokestatic    #390 <Method String Integer.toHexString(int)>
	//  264  649:invokevirtual   #368 <Method void PrintWriter.print(String)>
					printwriter.print(" exitAnim=#");
	//  265  652:aload_2         
	//  266  653:ldc2            #465 <String " exitAnim=#">
	//  267  656:invokevirtual   #368 <Method void PrintWriter.print(String)>
					printwriter.println(Integer.toHexString(op.exitAnim));
	//  268  659:aload_2         
	//  269  660:aload           7
	//  270  662:getfield        #237 <Field int BackStackRecord$Op.exitAnim>
	//  271  665:invokestatic    #390 <Method String Integer.toHexString(int)>
	//  272  668:invokevirtual   #396 <Method void PrintWriter.println(String)>
				}
				if(op.popEnterAnim != 0 || op.popExitAnim != 0)
	//* 273  671:aload           7
	//* 274  673:getfield        #242 <Field int BackStackRecord$Op.popEnterAnim>
	//* 275  676:ifne            687
	//* 276  679:aload           7
	//* 277  681:getfield        #247 <Field int BackStackRecord$Op.popExitAnim>
	//* 278  684:ifeq            730
				{
					printwriter.print(s);
	//  279  687:aload_2         
	//  280  688:aload_1         
	//  281  689:invokevirtual   #368 <Method void PrintWriter.print(String)>
					printwriter.print("popEnterAnim=#");
	//  282  692:aload_2         
	//  283  693:ldc2            #467 <String "popEnterAnim=#">
	//  284  696:invokevirtual   #368 <Method void PrintWriter.print(String)>
					printwriter.print(Integer.toHexString(op.popEnterAnim));
	//  285  699:aload_2         
	//  286  700:aload           7
	//  287  702:getfield        #242 <Field int BackStackRecord$Op.popEnterAnim>
	//  288  705:invokestatic    #390 <Method String Integer.toHexString(int)>
	//  289  708:invokevirtual   #368 <Method void PrintWriter.print(String)>
					printwriter.print(" popExitAnim=#");
	//  290  711:aload_2         
	//  291  712:ldc2            #469 <String " popExitAnim=#">
	//  292  715:invokevirtual   #368 <Method void PrintWriter.print(String)>
					printwriter.println(Integer.toHexString(op.popExitAnim));
	//  293  718:aload_2         
	//  294  719:aload           7
	//  295  721:getfield        #247 <Field int BackStackRecord$Op.popExitAnim>
	//  296  724:invokestatic    #390 <Method String Integer.toHexString(int)>
	//  297  727:invokevirtual   #396 <Method void PrintWriter.println(String)>
				}
			}

	//  298  730:iload           4
	//  299  732:iconst_1        
	//  300  733:iadd            
	//  301  734:istore          4
		}
	//* 302  736:goto            371
	//  303  739:return          
	}

	void executeOps()
	{
		int j = mOps.size();
	//    0    0:aload_0         
	//    1    1:getfield        #84  <Field ArrayList mOps>
	//    2    4:invokevirtual   #302 <Method int ArrayList.size()>
	//    3    7:istore_2        
		for(int i = 0; i < j; i++)
	//*   4    8:iconst_0        
	//*   5    9:istore_1        
	//*   6   10:iload_1         
	//*   7   11:iload_2         
	//*   8   12:icmpge          324
		{
			Op op = (Op)mOps.get(i);
	//    9   15:aload_0         
	//   10   16:getfield        #84  <Field ArrayList mOps>
	//   11   19:iload_1         
	//   12   20:invokevirtual   #306 <Method Object ArrayList.get(int)>
	//   13   23:checkcast       #10  <Class BackStackRecord$Op>
	//   14   26:astore_3        
			Fragment fragment = op.fragment;
	//   15   27:aload_3         
	//   16   28:getfield        #203 <Field Fragment BackStackRecord$Op.fragment>
	//   17   31:astore          4
			if(fragment != null)
	//*  18   33:aload           4
	//*  19   35:ifnull          51
				fragment.setNextTransition(mTransition, mTransitionStyle);
	//   20   38:aload           4
	//   21   40:aload_0         
	//   22   41:getfield        #382 <Field int mTransition>
	//   23   44:aload_0         
	//   24   45:getfield        #394 <Field int mTransitionStyle>
	//   25   48:invokevirtual   #474 <Method void Fragment.setNextTransition(int, int)>
			switch(op.cmd)
	//*  26   51:aload_3         
	//*  27   52:getfield        #433 <Field int BackStackRecord$Op.cmd>
			{
	//*  28   55:tableswitch     1 9: default 104
	//	               1 107
	//	               2 257
	//	               3 129
	//	               4 150
	//	               5 171
	//	               6 192
	//	               7 213
	//	               8 234
	//	               9 246
	//*  29  104:goto            257
			case 1: // '\001'
				fragment.setNextAnim(op.enterAnim);
	//   30  107:aload           4
	//   31  109:aload_3         
	//   32  110:getfield        #232 <Field int BackStackRecord$Op.enterAnim>
	//   33  113:invokevirtual   #477 <Method void Fragment.setNextAnim(int)>
				mManager.addFragment(fragment, false);
	//   34  116:aload_0         
	//   35  117:getfield        #92  <Field FragmentManagerImpl mManager>
	//   36  120:aload           4
	//   37  122:iconst_0        
	//   38  123:invokevirtual   #481 <Method void FragmentManagerImpl.addFragment(Fragment, boolean)>
				break;

	//*  39  126:goto            288
			case 3: // '\003'
				fragment.setNextAnim(op.exitAnim);
	//   40  129:aload           4
	//   41  131:aload_3         
	//   42  132:getfield        #237 <Field int BackStackRecord$Op.exitAnim>
	//   43  135:invokevirtual   #477 <Method void Fragment.setNextAnim(int)>
				mManager.removeFragment(fragment);
	//   44  138:aload_0         
	//   45  139:getfield        #92  <Field FragmentManagerImpl mManager>
	//   46  142:aload           4
	//   47  144:invokevirtual   #485 <Method void FragmentManagerImpl.removeFragment(Fragment)>
				break;

	//*  48  147:goto            288
			case 4: // '\004'
				fragment.setNextAnim(op.exitAnim);
	//   49  150:aload           4
	//   50  152:aload_3         
	//   51  153:getfield        #237 <Field int BackStackRecord$Op.exitAnim>
	//   52  156:invokevirtual   #477 <Method void Fragment.setNextAnim(int)>
				mManager.hideFragment(fragment);
	//   53  159:aload_0         
	//   54  160:getfield        #92  <Field FragmentManagerImpl mManager>
	//   55  163:aload           4
	//   56  165:invokevirtual   #488 <Method void FragmentManagerImpl.hideFragment(Fragment)>
				break;

	//*  57  168:goto            288
			case 5: // '\005'
				fragment.setNextAnim(op.enterAnim);
	//   58  171:aload           4
	//   59  173:aload_3         
	//   60  174:getfield        #232 <Field int BackStackRecord$Op.enterAnim>
	//   61  177:invokevirtual   #477 <Method void Fragment.setNextAnim(int)>
				mManager.showFragment(fragment);
	//   62  180:aload_0         
	//   63  181:getfield        #92  <Field FragmentManagerImpl mManager>
	//   64  184:aload           4
	//   65  186:invokevirtual   #491 <Method void FragmentManagerImpl.showFragment(Fragment)>
				break;

	//*  66  189:goto            288
			case 6: // '\006'
				fragment.setNextAnim(op.exitAnim);
	//   67  192:aload           4
	//   68  194:aload_3         
	//   69  195:getfield        #237 <Field int BackStackRecord$Op.exitAnim>
	//   70  198:invokevirtual   #477 <Method void Fragment.setNextAnim(int)>
				mManager.detachFragment(fragment);
	//   71  201:aload_0         
	//   72  202:getfield        #92  <Field FragmentManagerImpl mManager>
	//   73  205:aload           4
	//   74  207:invokevirtual   #494 <Method void FragmentManagerImpl.detachFragment(Fragment)>
				break;

	//*  75  210:goto            288
			case 7: // '\007'
				fragment.setNextAnim(op.enterAnim);
	//   76  213:aload           4
	//   77  215:aload_3         
	//   78  216:getfield        #232 <Field int BackStackRecord$Op.enterAnim>
	//   79  219:invokevirtual   #477 <Method void Fragment.setNextAnim(int)>
				mManager.attachFragment(fragment);
	//   80  222:aload_0         
	//   81  223:getfield        #92  <Field FragmentManagerImpl mManager>
	//   82  226:aload           4
	//   83  228:invokevirtual   #497 <Method void FragmentManagerImpl.attachFragment(Fragment)>
				break;

	//*  84  231:goto            288
			case 8: // '\b'
				mManager.setPrimaryNavigationFragment(fragment);
	//   85  234:aload_0         
	//   86  235:getfield        #92  <Field FragmentManagerImpl mManager>
	//   87  238:aload           4
	//   88  240:invokevirtual   #500 <Method void FragmentManagerImpl.setPrimaryNavigationFragment(Fragment)>
				break;

	//*  89  243:goto            288
			case 9: // '\t'
				mManager.setPrimaryNavigationFragment(((Fragment) (null)));
	//   90  246:aload_0         
	//   91  247:getfield        #92  <Field FragmentManagerImpl mManager>
	//   92  250:aconst_null     
	//   93  251:invokevirtual   #500 <Method void FragmentManagerImpl.setPrimaryNavigationFragment(Fragment)>
				break;

	//*  94  254:goto            288
			case 2: // '\002'
			default:
				throw new IllegalArgumentException((new StringBuilder()).append("Unknown cmd: ").append(op.cmd).toString());
	//   95  257:new             #172 <Class IllegalArgumentException>
	//   96  260:dup             
	//   97  261:new             #126 <Class StringBuilder>
	//   98  264:dup             
	//   99  265:invokespecial   #127 <Method void StringBuilder()>
	//  100  268:ldc2            #502 <String "Unknown cmd: ">
	//  101  271:invokevirtual   #133 <Method StringBuilder StringBuilder.append(String)>
	//  102  274:aload_3         
	//  103  275:getfield        #433 <Field int BackStackRecord$Op.cmd>
	//  104  278:invokevirtual   #187 <Method StringBuilder StringBuilder.append(int)>
	//  105  281:invokevirtual   #144 <Method String StringBuilder.toString()>
	//  106  284:invokespecial   #179 <Method void IllegalArgumentException(String)>
	//  107  287:athrow          
			}
			if(!mAllowOptimization && op.cmd != 1 && fragment != null)
	//* 108  288:aload_0         
	//* 109  289:getfield        #90  <Field boolean mAllowOptimization>
	//* 110  292:ifne            317
	//* 111  295:aload_3         
	//* 112  296:getfield        #433 <Field int BackStackRecord$Op.cmd>
	//* 113  299:iconst_1        
	//* 114  300:icmpeq          317
	//* 115  303:aload           4
	//* 116  305:ifnull          317
				mManager.moveFragmentToExpectedState(fragment);
	//  117  308:aload_0         
	//  118  309:getfield        #92  <Field FragmentManagerImpl mManager>
	//  119  312:aload           4
	//  120  314:invokevirtual   #505 <Method void FragmentManagerImpl.moveFragmentToExpectedState(Fragment)>
		}

	//  121  317:iload_1         
	//  122  318:iconst_1        
	//  123  319:iadd            
	//  124  320:istore_1        
	//* 125  321:goto            10
		if(!mAllowOptimization)
	//* 126  324:aload_0         
	//* 127  325:getfield        #90  <Field boolean mAllowOptimization>
	//* 128  328:ifne            346
			mManager.moveToState(mManager.mCurState, true);
	//  129  331:aload_0         
	//  130  332:getfield        #92  <Field FragmentManagerImpl mManager>
	//  131  335:aload_0         
	//  132  336:getfield        #92  <Field FragmentManagerImpl mManager>
	//  133  339:getfield        #508 <Field int FragmentManagerImpl.mCurState>
	//  134  342:iconst_1        
	//  135  343:invokevirtual   #512 <Method void FragmentManagerImpl.moveToState(int, boolean)>
	//  136  346:return          
	}

	void executePopOps(boolean flag)
	{
		for(int i = mOps.size() - 1; i >= 0; i--)
	//*   0    0:aload_0         
	//*   1    1:getfield        #84  <Field ArrayList mOps>
	//*   2    4:invokevirtual   #302 <Method int ArrayList.size()>
	//*   3    7:iconst_1        
	//*   4    8:isub            
	//*   5    9:istore_2        
	//*   6   10:iload_2         
	//*   7   11:iflt            328
		{
			Op op = (Op)mOps.get(i);
	//    8   14:aload_0         
	//    9   15:getfield        #84  <Field ArrayList mOps>
	//   10   18:iload_2         
	//   11   19:invokevirtual   #306 <Method Object ArrayList.get(int)>
	//   12   22:checkcast       #10  <Class BackStackRecord$Op>
	//   13   25:astore_3        
			Fragment fragment = op.fragment;
	//   14   26:aload_3         
	//   15   27:getfield        #203 <Field Fragment BackStackRecord$Op.fragment>
	//   16   30:astore          4
			if(fragment != null)
	//*  17   32:aload           4
	//*  18   34:ifnull          53
				fragment.setNextTransition(FragmentManagerImpl.reverseTransit(mTransition), mTransitionStyle);
	//   19   37:aload           4
	//   20   39:aload_0         
	//   21   40:getfield        #382 <Field int mTransition>
	//   22   43:invokestatic    #517 <Method int FragmentManagerImpl.reverseTransit(int)>
	//   23   46:aload_0         
	//   24   47:getfield        #394 <Field int mTransitionStyle>
	//   25   50:invokevirtual   #474 <Method void Fragment.setNextTransition(int, int)>
			switch(op.cmd)
	//*  26   53:aload_3         
	//*  27   54:getfield        #433 <Field int BackStackRecord$Op.cmd>
			{
	//*  28   57:tableswitch     1 9: default 108
	//	               1 111
	//	               2 261
	//	               3 132
	//	               4 154
	//	               5 175
	//	               6 196
	//	               7 217
	//	               8 238
	//	               9 249
	//*  29  108:goto            261
			case 1: // '\001'
				fragment.setNextAnim(op.popExitAnim);
	//   30  111:aload           4
	//   31  113:aload_3         
	//   32  114:getfield        #247 <Field int BackStackRecord$Op.popExitAnim>
	//   33  117:invokevirtual   #477 <Method void Fragment.setNextAnim(int)>
				mManager.removeFragment(fragment);
	//   34  120:aload_0         
	//   35  121:getfield        #92  <Field FragmentManagerImpl mManager>
	//   36  124:aload           4
	//   37  126:invokevirtual   #485 <Method void FragmentManagerImpl.removeFragment(Fragment)>
				break;

	//*  38  129:goto            292
			case 3: // '\003'
				fragment.setNextAnim(op.popEnterAnim);
	//   39  132:aload           4
	//   40  134:aload_3         
	//   41  135:getfield        #242 <Field int BackStackRecord$Op.popEnterAnim>
	//   42  138:invokevirtual   #477 <Method void Fragment.setNextAnim(int)>
				mManager.addFragment(fragment, false);
	//   43  141:aload_0         
	//   44  142:getfield        #92  <Field FragmentManagerImpl mManager>
	//   45  145:aload           4
	//   46  147:iconst_0        
	//   47  148:invokevirtual   #481 <Method void FragmentManagerImpl.addFragment(Fragment, boolean)>
				break;

	//*  48  151:goto            292
			case 4: // '\004'
				fragment.setNextAnim(op.popEnterAnim);
	//   49  154:aload           4
	//   50  156:aload_3         
	//   51  157:getfield        #242 <Field int BackStackRecord$Op.popEnterAnim>
	//   52  160:invokevirtual   #477 <Method void Fragment.setNextAnim(int)>
				mManager.showFragment(fragment);
	//   53  163:aload_0         
	//   54  164:getfield        #92  <Field FragmentManagerImpl mManager>
	//   55  167:aload           4
	//   56  169:invokevirtual   #491 <Method void FragmentManagerImpl.showFragment(Fragment)>
				break;

	//*  57  172:goto            292
			case 5: // '\005'
				fragment.setNextAnim(op.popExitAnim);
	//   58  175:aload           4
	//   59  177:aload_3         
	//   60  178:getfield        #247 <Field int BackStackRecord$Op.popExitAnim>
	//   61  181:invokevirtual   #477 <Method void Fragment.setNextAnim(int)>
				mManager.hideFragment(fragment);
	//   62  184:aload_0         
	//   63  185:getfield        #92  <Field FragmentManagerImpl mManager>
	//   64  188:aload           4
	//   65  190:invokevirtual   #488 <Method void FragmentManagerImpl.hideFragment(Fragment)>
				break;

	//*  66  193:goto            292
			case 6: // '\006'
				fragment.setNextAnim(op.popEnterAnim);
	//   67  196:aload           4
	//   68  198:aload_3         
	//   69  199:getfield        #242 <Field int BackStackRecord$Op.popEnterAnim>
	//   70  202:invokevirtual   #477 <Method void Fragment.setNextAnim(int)>
				mManager.attachFragment(fragment);
	//   71  205:aload_0         
	//   72  206:getfield        #92  <Field FragmentManagerImpl mManager>
	//   73  209:aload           4
	//   74  211:invokevirtual   #497 <Method void FragmentManagerImpl.attachFragment(Fragment)>
				break;

	//*  75  214:goto            292
			case 7: // '\007'
				fragment.setNextAnim(op.popExitAnim);
	//   76  217:aload           4
	//   77  219:aload_3         
	//   78  220:getfield        #247 <Field int BackStackRecord$Op.popExitAnim>
	//   79  223:invokevirtual   #477 <Method void Fragment.setNextAnim(int)>
				mManager.detachFragment(fragment);
	//   80  226:aload_0         
	//   81  227:getfield        #92  <Field FragmentManagerImpl mManager>
	//   82  230:aload           4
	//   83  232:invokevirtual   #494 <Method void FragmentManagerImpl.detachFragment(Fragment)>
				break;

	//*  84  235:goto            292
			case 8: // '\b'
				mManager.setPrimaryNavigationFragment(((Fragment) (null)));
	//   85  238:aload_0         
	//   86  239:getfield        #92  <Field FragmentManagerImpl mManager>
	//   87  242:aconst_null     
	//   88  243:invokevirtual   #500 <Method void FragmentManagerImpl.setPrimaryNavigationFragment(Fragment)>
				break;

	//*  89  246:goto            292
			case 9: // '\t'
				mManager.setPrimaryNavigationFragment(fragment);
	//   90  249:aload_0         
	//   91  250:getfield        #92  <Field FragmentManagerImpl mManager>
	//   92  253:aload           4
	//   93  255:invokevirtual   #500 <Method void FragmentManagerImpl.setPrimaryNavigationFragment(Fragment)>
				break;

	//*  94  258:goto            292
			case 2: // '\002'
			default:
				throw new IllegalArgumentException((new StringBuilder()).append("Unknown cmd: ").append(op.cmd).toString());
	//   95  261:new             #172 <Class IllegalArgumentException>
	//   96  264:dup             
	//   97  265:new             #126 <Class StringBuilder>
	//   98  268:dup             
	//   99  269:invokespecial   #127 <Method void StringBuilder()>
	//  100  272:ldc2            #502 <String "Unknown cmd: ">
	//  101  275:invokevirtual   #133 <Method StringBuilder StringBuilder.append(String)>
	//  102  278:aload_3         
	//  103  279:getfield        #433 <Field int BackStackRecord$Op.cmd>
	//  104  282:invokevirtual   #187 <Method StringBuilder StringBuilder.append(int)>
	//  105  285:invokevirtual   #144 <Method String StringBuilder.toString()>
	//  106  288:invokespecial   #179 <Method void IllegalArgumentException(String)>
	//  107  291:athrow          
			}
			if(!mAllowOptimization && op.cmd != 3 && fragment != null)
	//* 108  292:aload_0         
	//* 109  293:getfield        #90  <Field boolean mAllowOptimization>
	//* 110  296:ifne            321
	//* 111  299:aload_3         
	//* 112  300:getfield        #433 <Field int BackStackRecord$Op.cmd>
	//* 113  303:iconst_3        
	//* 114  304:icmpeq          321
	//* 115  307:aload           4
	//* 116  309:ifnull          321
				mManager.moveFragmentToExpectedState(fragment);
	//  117  312:aload_0         
	//  118  313:getfield        #92  <Field FragmentManagerImpl mManager>
	//  119  316:aload           4
	//  120  318:invokevirtual   #505 <Method void FragmentManagerImpl.moveFragmentToExpectedState(Fragment)>
		}

	//  121  321:iload_2         
	//  122  322:iconst_1        
	//  123  323:isub            
	//  124  324:istore_2        
	//* 125  325:goto            10
		if(!mAllowOptimization && flag)
	//* 126  328:aload_0         
	//* 127  329:getfield        #90  <Field boolean mAllowOptimization>
	//* 128  332:ifne            354
	//* 129  335:iload_1         
	//* 130  336:ifeq            354
			mManager.moveToState(mManager.mCurState, true);
	//  131  339:aload_0         
	//  132  340:getfield        #92  <Field FragmentManagerImpl mManager>
	//  133  343:aload_0         
	//  134  344:getfield        #92  <Field FragmentManagerImpl mManager>
	//  135  347:getfield        #508 <Field int FragmentManagerImpl.mCurState>
	//  136  350:iconst_1        
	//  137  351:invokevirtual   #512 <Method void FragmentManagerImpl.moveToState(int, boolean)>
	//  138  354:return          
	}

	Fragment expandOps(ArrayList arraylist, Fragment fragment)
	{
		int i = 0;
	//    0    0:iconst_0        
	//    1    1:istore_3        
		Fragment fragment1;
		for(fragment1 = fragment; i < mOps.size(); fragment1 = fragment)
	//*   2    2:aload_2         
	//*   3    3:astore          9
	//*   4    5:iload_3         
	//*   5    6:aload_0         
	//*   6    7:getfield        #84  <Field ArrayList mOps>
	//*   7   10:invokevirtual   #302 <Method int ArrayList.size()>
	//*   8   13:icmpge          470
		{
			Op op = (Op)mOps.get(i);
	//    9   16:aload_0         
	//   10   17:getfield        #84  <Field ArrayList mOps>
	//   11   20:iload_3         
	//   12   21:invokevirtual   #306 <Method Object ArrayList.get(int)>
	//   13   24:checkcast       #10  <Class BackStackRecord$Op>
	//   14   27:astore          10
			int j = i;
	//   15   29:iload_3         
	//   16   30:istore          4
			fragment = fragment1;
	//   17   32:aload           9
	//   18   34:astore_2        
			switch(op.cmd)
	//*  19   35:aload           10
	//*  20   37:getfield        #433 <Field int BackStackRecord$Op.cmd>
			{
	//*  21   40:tableswitch     1 8: default 88
	//	               1 97
	//	               2 174
	//	               3 116
	//	               4 459
	//	               5 459
	//	               6 116
	//	               7 97
	//	               8 429
			default:
				j = i;
	//   22   88:iload_3         
	//   23   89:istore          4
				fragment = fragment1;
	//   24   91:aload           9
	//   25   93:astore_2        
				break;
	//   26   94:goto            459

			case 4: // '\004'
			case 5: // '\005'
				break;

			case 1: // '\001'
			case 7: // '\007'
				arraylist.add(((Object) (op.fragment)));
	//   27   97:aload_1         
	//   28   98:aload           10
	//   29  100:getfield        #203 <Field Fragment BackStackRecord$Op.fragment>
	//   30  103:invokevirtual   #227 <Method boolean ArrayList.add(Object)>
	//   31  106:pop             
				j = i;
	//   32  107:iload_3         
	//   33  108:istore          4
				fragment = fragment1;
	//   34  110:aload           9
	//   35  112:astore_2        
				break;
	//   36  113:goto            459

			case 3: // '\003'
			case 6: // '\006'
				arraylist.remove(((Object) (op.fragment)));
	//   37  116:aload_1         
	//   38  117:aload           10
	//   39  119:getfield        #203 <Field Fragment BackStackRecord$Op.fragment>
	//   40  122:invokevirtual   #522 <Method boolean ArrayList.remove(Object)>
	//   41  125:pop             
				j = i;
	//   42  126:iload_3         
	//   43  127:istore          4
				fragment = fragment1;
	//   44  129:aload           9
	//   45  131:astore_2        
				if(op.fragment == fragment1)
	//*  46  132:aload           10
	//*  47  134:getfield        #203 <Field Fragment BackStackRecord$Op.fragment>
	//*  48  137:aload           9
	//*  49  139:if_acmpne       459
				{
					mOps.add(i, ((Object) (new Op(9, op.fragment))));
	//   50  142:aload_0         
	//   51  143:getfield        #84  <Field ArrayList mOps>
	//   52  146:iload_3         
	//   53  147:new             #10  <Class BackStackRecord$Op>
	//   54  150:dup             
	//   55  151:bipush          9
	//   56  153:aload           10
	//   57  155:getfield        #203 <Field Fragment BackStackRecord$Op.fragment>
	//   58  158:invokespecial   #193 <Method void BackStackRecord$Op(int, Fragment)>
	//   59  161:invokevirtual   #525 <Method void ArrayList.add(int, Object)>
					j = i + 1;
	//   60  164:iload_3         
	//   61  165:iconst_1        
	//   62  166:iadd            
	//   63  167:istore          4
					fragment = null;
	//   64  169:aconst_null     
	//   65  170:astore_2        
				}
				break;
	//   66  171:goto            459

			case 2: // '\002'
				Fragment fragment2 = op.fragment;
	//   67  174:aload           10
	//   68  176:getfield        #203 <Field Fragment BackStackRecord$Op.fragment>
	//   69  179:astore          11
				int l = fragment2.mContainerId;
	//   70  181:aload           11
	//   71  183:getfield        #190 <Field int Fragment.mContainerId>
	//   72  186:istore          8
				boolean flag = false;
	//   73  188:iconst_0        
	//   74  189:istore          5
				j = arraylist.size() - 1;
	//   75  191:aload_1         
	//   76  192:invokevirtual   #302 <Method int ArrayList.size()>
	//   77  195:iconst_1        
	//   78  196:isub            
	//   79  197:istore          4
				for(fragment = fragment1; j >= 0; fragment = fragment1)
	//*  80  199:aload           9
	//*  81  201:astore_2        
	//*  82  202:iload           4
	//*  83  204:iflt            389
				{
					Fragment fragment3 = (Fragment)arraylist.get(j);
	//   84  207:aload_1         
	//   85  208:iload           4
	//   86  210:invokevirtual   #306 <Method Object ArrayList.get(int)>
	//   87  213:checkcast       #149 <Class Fragment>
	//   88  216:astore          12
					int k = i;
	//   89  218:iload_3         
	//   90  219:istore          6
					boolean flag1 = flag;
	//   91  221:iload           5
	//   92  223:istore          7
					fragment1 = fragment;
	//   93  225:aload_2         
	//   94  226:astore          9
					if(fragment3.mContainerId == l)
	//*  95  228:aload           12
	//*  96  230:getfield        #190 <Field int Fragment.mContainerId>
	//*  97  233:iload           8
	//*  98  235:icmpne          370
						if(fragment3 == fragment2)
	//*  99  238:aload           12
	//* 100  240:aload           11
	//* 101  242:if_acmpne       257
						{
							flag1 = true;
	//  102  245:iconst_1        
	//  103  246:istore          7
							k = i;
	//  104  248:iload_3         
	//  105  249:istore          6
							fragment1 = fragment;
	//  106  251:aload_2         
	//  107  252:astore          9
						} else
	//* 108  254:goto            370
						{
							k = i;
	//  109  257:iload_3         
	//  110  258:istore          6
							fragment1 = fragment;
	//  111  260:aload_2         
	//  112  261:astore          9
							if(fragment3 == fragment)
	//* 113  263:aload           12
	//* 114  265:aload_2         
	//* 115  266:if_acmpne       296
							{
								mOps.add(i, ((Object) (new Op(9, fragment3))));
	//  116  269:aload_0         
	//  117  270:getfield        #84  <Field ArrayList mOps>
	//  118  273:iload_3         
	//  119  274:new             #10  <Class BackStackRecord$Op>
	//  120  277:dup             
	//  121  278:bipush          9
	//  122  280:aload           12
	//  123  282:invokespecial   #193 <Method void BackStackRecord$Op(int, Fragment)>
	//  124  285:invokevirtual   #525 <Method void ArrayList.add(int, Object)>
								k = i + 1;
	//  125  288:iload_3         
	//  126  289:iconst_1        
	//  127  290:iadd            
	//  128  291:istore          6
								fragment1 = null;
	//  129  293:aconst_null     
	//  130  294:astore          9
							}
							fragment = ((Fragment) (new Op(3, fragment3)));
	//  131  296:new             #10  <Class BackStackRecord$Op>
	//  132  299:dup             
	//  133  300:iconst_3        
	//  134  301:aload           12
	//  135  303:invokespecial   #193 <Method void BackStackRecord$Op(int, Fragment)>
	//  136  306:astore_2        
							fragment.enterAnim = op.enterAnim;
	//  137  307:aload_2         
	//  138  308:aload           10
	//  139  310:getfield        #232 <Field int BackStackRecord$Op.enterAnim>
	//  140  313:putfield        #232 <Field int BackStackRecord$Op.enterAnim>
							fragment.popEnterAnim = op.popEnterAnim;
	//  141  316:aload_2         
	//  142  317:aload           10
	//  143  319:getfield        #242 <Field int BackStackRecord$Op.popEnterAnim>
	//  144  322:putfield        #242 <Field int BackStackRecord$Op.popEnterAnim>
							fragment.exitAnim = op.exitAnim;
	//  145  325:aload_2         
	//  146  326:aload           10
	//  147  328:getfield        #237 <Field int BackStackRecord$Op.exitAnim>
	//  148  331:putfield        #237 <Field int BackStackRecord$Op.exitAnim>
							fragment.popExitAnim = op.popExitAnim;
	//  149  334:aload_2         
	//  150  335:aload           10
	//  151  337:getfield        #247 <Field int BackStackRecord$Op.popExitAnim>
	//  152  340:putfield        #247 <Field int BackStackRecord$Op.popExitAnim>
							mOps.add(k, ((Object) (fragment)));
	//  153  343:aload_0         
	//  154  344:getfield        #84  <Field ArrayList mOps>
	//  155  347:iload           6
	//  156  349:aload_2         
	//  157  350:invokevirtual   #525 <Method void ArrayList.add(int, Object)>
							arraylist.remove(((Object) (fragment3)));
	//  158  353:aload_1         
	//  159  354:aload           12
	//  160  356:invokevirtual   #522 <Method boolean ArrayList.remove(Object)>
	//  161  359:pop             
							k++;
	//  162  360:iload           6
	//  163  362:iconst_1        
	//  164  363:iadd            
	//  165  364:istore          6
							flag1 = flag;
	//  166  366:iload           5
	//  167  368:istore          7
						}
					j--;
	//  168  370:iload           4
	//  169  372:iconst_1        
	//  170  373:isub            
	//  171  374:istore          4
					i = k;
	//  172  376:iload           6
	//  173  378:istore_3        
					flag = flag1;
	//  174  379:iload           7
	//  175  381:istore          5
				}

	//  176  383:aload           9
	//  177  385:astore_2        
	//* 178  386:goto            202
				if(flag)
	//* 179  389:iload           5
	//* 180  391:ifeq            410
				{
					mOps.remove(i);
	//  181  394:aload_0         
	//  182  395:getfield        #84  <Field ArrayList mOps>
	//  183  398:iload_3         
	//  184  399:invokevirtual   #527 <Method Object ArrayList.remove(int)>
	//  185  402:pop             
					i--;
	//  186  403:iload_3         
	//  187  404:iconst_1        
	//  188  405:isub            
	//  189  406:istore_3        
				} else
	//* 190  407:goto            423
				{
					op.cmd = 1;
	//  191  410:aload           10
	//  192  412:iconst_1        
	//  193  413:putfield        #433 <Field int BackStackRecord$Op.cmd>
					arraylist.add(((Object) (fragment2)));
	//  194  416:aload_1         
	//  195  417:aload           11
	//  196  419:invokevirtual   #227 <Method boolean ArrayList.add(Object)>
	//  197  422:pop             
				}
				j = i;
	//  198  423:iload_3         
	//  199  424:istore          4
				break;

	//* 200  426:goto            459
			case 8: // '\b'
				mOps.add(i, ((Object) (new Op(9, fragment1))));
	//  201  429:aload_0         
	//  202  430:getfield        #84  <Field ArrayList mOps>
	//  203  433:iload_3         
	//  204  434:new             #10  <Class BackStackRecord$Op>
	//  205  437:dup             
	//  206  438:bipush          9
	//  207  440:aload           9
	//  208  442:invokespecial   #193 <Method void BackStackRecord$Op(int, Fragment)>
	//  209  445:invokevirtual   #525 <Method void ArrayList.add(int, Object)>
				j = i + 1;
	//  210  448:iload_3         
	//  211  449:iconst_1        
	//  212  450:iadd            
	//  213  451:istore          4
				fragment = op.fragment;
	//  214  453:aload           10
	//  215  455:getfield        #203 <Field Fragment BackStackRecord$Op.fragment>
	//  216  458:astore_2        
				break;
			}
			i = j + 1;
	//  217  459:iload           4
	//  218  461:iconst_1        
	//  219  462:iadd            
	//  220  463:istore_3        
		}

	//  221  464:aload_2         
	//  222  465:astore          9
	//* 223  467:goto            5
		return fragment1;
	//  224  470:aload           9
	//  225  472:areturn         
	}

	public boolean generateOps(ArrayList arraylist, ArrayList arraylist1)
	{
		if(FragmentManagerImpl.DEBUG)
	//*   0    0:getstatic       #289 <Field boolean FragmentManagerImpl.DEBUG>
	//*   1    3:ifeq            32
			Log.v("FragmentManager", (new StringBuilder()).append("Run: ").append(((Object) (this))).toString());
	//    2    6:ldc1            #38  <String "FragmentManager">
	//    3    8:new             #126 <Class StringBuilder>
	//    4   11:dup             
	//    5   12:invokespecial   #127 <Method void StringBuilder()>
	//    6   15:ldc2            #533 <String "Run: ">
	//    7   18:invokevirtual   #133 <Method StringBuilder StringBuilder.append(String)>
	//    8   21:aload_0         
	//    9   22:invokevirtual   #166 <Method StringBuilder StringBuilder.append(Object)>
	//   10   25:invokevirtual   #144 <Method String StringBuilder.toString()>
	//   11   28:invokestatic    #299 <Method int Log.v(String, String)>
	//   12   31:pop             
		arraylist.add(((Object) (this)));
	//   13   32:aload_1         
	//   14   33:aload_0         
	//   15   34:invokevirtual   #227 <Method boolean ArrayList.add(Object)>
	//   16   37:pop             
		arraylist1.add(((Object) (Boolean.valueOf(false))));
	//   17   38:aload_2         
	//   18   39:iconst_0        
	//   19   40:invokestatic    #539 <Method Boolean Boolean.valueOf(boolean)>
	//   20   43:invokevirtual   #227 <Method boolean ArrayList.add(Object)>
	//   21   46:pop             
		if(mAddToBackStack)
	//*  22   47:aload_0         
	//*  23   48:getfield        #278 <Field boolean mAddToBackStack>
	//*  24   51:ifeq            62
			mManager.addBackStackState(this);
	//   25   54:aload_0         
	//   26   55:getfield        #92  <Field FragmentManagerImpl mManager>
	//   27   58:aload_0         
	//   28   59:invokevirtual   #543 <Method void FragmentManagerImpl.addBackStackState(BackStackRecord)>
		return true;
	//   29   62:iconst_1        
	//   30   63:ireturn         
	}

	public CharSequence getBreadCrumbShortTitle()
	{
		if(mBreadCrumbShortTitleRes != 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #417 <Field int mBreadCrumbShortTitleRes>
	//*   2    4:ifeq            25
			return mManager.mHost.getContext().getText(mBreadCrumbShortTitleRes);
	//    3    7:aload_0         
	//    4    8:getfield        #92  <Field FragmentManagerImpl mManager>
	//    5   11:getfield        #550 <Field FragmentHostCallback FragmentManagerImpl.mHost>
	//    6   14:invokevirtual   #556 <Method Context FragmentHostCallback.getContext()>
	//    7   17:aload_0         
	//    8   18:getfield        #417 <Field int mBreadCrumbShortTitleRes>
	//    9   21:invokevirtual   #562 <Method CharSequence Context.getText(int)>
	//   10   24:areturn         
		else
			return mBreadCrumbShortTitleText;
	//   11   25:aload_0         
	//   12   26:getfield        #419 <Field CharSequence mBreadCrumbShortTitleText>
	//   13   29:areturn         
	}

	public int getBreadCrumbShortTitleRes()
	{
		return mBreadCrumbShortTitleRes;
	//    0    0:aload_0         
	//    1    1:getfield        #417 <Field int mBreadCrumbShortTitleRes>
	//    2    4:ireturn         
	}

	public CharSequence getBreadCrumbTitle()
	{
		if(mBreadCrumbTitleRes != 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #406 <Field int mBreadCrumbTitleRes>
	//*   2    4:ifeq            25
			return mManager.mHost.getContext().getText(mBreadCrumbTitleRes);
	//    3    7:aload_0         
	//    4    8:getfield        #92  <Field FragmentManagerImpl mManager>
	//    5   11:getfield        #550 <Field FragmentHostCallback FragmentManagerImpl.mHost>
	//    6   14:invokevirtual   #556 <Method Context FragmentHostCallback.getContext()>
	//    7   17:aload_0         
	//    8   18:getfield        #406 <Field int mBreadCrumbTitleRes>
	//    9   21:invokevirtual   #562 <Method CharSequence Context.getText(int)>
	//   10   24:areturn         
		else
			return mBreadCrumbTitleText;
	//   11   25:aload_0         
	//   12   26:getfield        #408 <Field CharSequence mBreadCrumbTitleText>
	//   13   29:areturn         
	}

	public int getBreadCrumbTitleRes()
	{
		return mBreadCrumbTitleRes;
	//    0    0:aload_0         
	//    1    1:getfield        #406 <Field int mBreadCrumbTitleRes>
	//    2    4:ireturn         
	}

	public int getId()
	{
		return mIndex;
	//    0    0:aload_0         
	//    1    1:getfield        #88  <Field int mIndex>
	//    2    4:ireturn         
	}

	public String getName()
	{
		return mName;
	//    0    0:aload_0         
	//    1    1:getfield        #280 <Field String mName>
	//    2    4:areturn         
	}

	public int getTransition()
	{
		return mTransition;
	//    0    0:aload_0         
	//    1    1:getfield        #382 <Field int mTransition>
	//    2    4:ireturn         
	}

	public int getTransitionStyle()
	{
		return mTransitionStyle;
	//    0    0:aload_0         
	//    1    1:getfield        #394 <Field int mTransitionStyle>
	//    2    4:ireturn         
	}

	public FragmentTransaction hide(Fragment fragment)
	{
		addOp(new Op(4, fragment));
	//    0    0:aload_0         
	//    1    1:new             #10  <Class BackStackRecord$Op>
	//    2    4:dup             
	//    3    5:iconst_4        
	//    4    6:aload_1         
	//    5    7:invokespecial   #193 <Method void BackStackRecord$Op(int, Fragment)>
	//    6   10:invokevirtual   #197 <Method void addOp(BackStackRecord$Op)>
		return ((FragmentTransaction) (this));
	//    7   13:aload_0         
	//    8   14:areturn         
	}

	boolean interactsWith(int i)
	{
		int l = mOps.size();
	//    0    0:aload_0         
	//    1    1:getfield        #84  <Field ArrayList mOps>
	//    2    4:invokevirtual   #302 <Method int ArrayList.size()>
	//    3    7:istore          4
		for(int j = 0; j < l; j++)
	//*   4    9:iconst_0        
	//*   5   10:istore_2        
	//*   6   11:iload_2         
	//*   7   12:iload           4
	//*   8   14:icmpge          70
		{
			Op op = (Op)mOps.get(j);
	//    9   17:aload_0         
	//   10   18:getfield        #84  <Field ArrayList mOps>
	//   11   21:iload_2         
	//   12   22:invokevirtual   #306 <Method Object ArrayList.get(int)>
	//   13   25:checkcast       #10  <Class BackStackRecord$Op>
	//   14   28:astore          5
			int k;
			if(op.fragment != null)
	//*  15   30:aload           5
	//*  16   32:getfield        #203 <Field Fragment BackStackRecord$Op.fragment>
	//*  17   35:ifnull          50
				k = op.fragment.mContainerId;
	//   18   38:aload           5
	//   19   40:getfield        #203 <Field Fragment BackStackRecord$Op.fragment>
	//   20   43:getfield        #190 <Field int Fragment.mContainerId>
	//   21   46:istore_3        
			else
	//*  22   47:goto            52
				k = 0;
	//   23   50:iconst_0        
	//   24   51:istore_3        
			if(k != 0 && k == i)
	//*  25   52:iload_3         
	//*  26   53:ifeq            63
	//*  27   56:iload_3         
	//*  28   57:iload_1         
	//*  29   58:icmpne          63
				return true;
	//   30   61:iconst_1        
	//   31   62:ireturn         
		}

	//   32   63:iload_2         
	//   33   64:iconst_1        
	//   34   65:iadd            
	//   35   66:istore_2        
	//*  36   67:goto            11
		return false;
	//   37   70:iconst_0        
	//   38   71:ireturn         
	}

	boolean interactsWith(ArrayList arraylist, int i, int j)
	{
		if(j == i)
	//*   0    0:iload_3         
	//*   1    1:iload_2         
	//*   2    2:icmpne          7
			return false;
	//    3    5:iconst_0        
	//    4    6:ireturn         
		int i2 = mOps.size();
	//    5    7:aload_0         
	//    6    8:getfield        #84  <Field ArrayList mOps>
	//    7   11:invokevirtual   #302 <Method int ArrayList.size()>
	//    8   14:istore          10
		int i1 = -1;
	//    9   16:iconst_m1       
	//   10   17:istore          6
		for(int l = 0; l < i2;)
	//*  11   19:iconst_0        
	//*  12   20:istore          5
	//*  13   22:iload           5
	//*  14   24:iload           10
	//*  15   26:icmpge          214
		{
			Op op = (Op)mOps.get(l);
	//   16   29:aload_0         
	//   17   30:getfield        #84  <Field ArrayList mOps>
	//   18   33:iload           5
	//   19   35:invokevirtual   #306 <Method Object ArrayList.get(int)>
	//   20   38:checkcast       #10  <Class BackStackRecord$Op>
	//   21   41:astore          12
			int k;
			if(op.fragment != null)
	//*  22   43:aload           12
	//*  23   45:getfield        #203 <Field Fragment BackStackRecord$Op.fragment>
	//*  24   48:ifnull          64
				k = op.fragment.mContainerId;
	//   25   51:aload           12
	//   26   53:getfield        #203 <Field Fragment BackStackRecord$Op.fragment>
	//   27   56:getfield        #190 <Field int Fragment.mContainerId>
	//   28   59:istore          4
			else
	//*  29   61:goto            67
				k = 0;
	//   30   64:iconst_0        
	//   31   65:istore          4
			int k1 = i1;
	//   32   67:iload           6
	//   33   69:istore          8
			if(k != 0)
	//*  34   71:iload           4
	//*  35   73:ifeq            201
			{
				k1 = i1;
	//   36   76:iload           6
	//   37   78:istore          8
				if(k != i1)
	//*  38   80:iload           4
	//*  39   82:iload           6
	//*  40   84:icmpeq          201
				{
					i1 = k;
	//   41   87:iload           4
	//   42   89:istore          6
					int j1 = i;
	//   43   91:iload_2         
	//   44   92:istore          7
					do
					{
						k1 = i1;
	//   45   94:iload           6
	//   46   96:istore          8
						if(j1 >= j)
							break;
	//   47   98:iload           7
	//   48  100:iload_3         
	//   49  101:icmpge          201
						BackStackRecord backstackrecord = (BackStackRecord)arraylist.get(j1);
	//   50  104:aload_1         
	//   51  105:iload           7
	//   52  107:invokevirtual   #306 <Method Object ArrayList.get(int)>
	//   53  110:checkcast       #2   <Class BackStackRecord>
	//   54  113:astore          12
						int j2 = backstackrecord.mOps.size();
	//   55  115:aload           12
	//   56  117:getfield        #84  <Field ArrayList mOps>
	//   57  120:invokevirtual   #302 <Method int ArrayList.size()>
	//   58  123:istore          11
						for(k1 = 0; k1 < j2; k1++)
	//*  59  125:iconst_0        
	//*  60  126:istore          8
	//*  61  128:iload           8
	//*  62  130:iload           11
	//*  63  132:icmpge          192
						{
							Op op1 = (Op)backstackrecord.mOps.get(k1);
	//   64  135:aload           12
	//   65  137:getfield        #84  <Field ArrayList mOps>
	//   66  140:iload           8
	//   67  142:invokevirtual   #306 <Method Object ArrayList.get(int)>
	//   68  145:checkcast       #10  <Class BackStackRecord$Op>
	//   69  148:astore          13
							int l1;
							if(op1.fragment != null)
	//*  70  150:aload           13
	//*  71  152:getfield        #203 <Field Fragment BackStackRecord$Op.fragment>
	//*  72  155:ifnull          171
								l1 = op1.fragment.mContainerId;
	//   73  158:aload           13
	//   74  160:getfield        #203 <Field Fragment BackStackRecord$Op.fragment>
	//   75  163:getfield        #190 <Field int Fragment.mContainerId>
	//   76  166:istore          9
							else
	//*  77  168:goto            174
								l1 = 0;
	//   78  171:iconst_0        
	//   79  172:istore          9
							if(l1 == k)
	//*  80  174:iload           9
	//*  81  176:iload           4
	//*  82  178:icmpne          183
								return true;
	//   83  181:iconst_1        
	//   84  182:ireturn         
						}

	//   85  183:iload           8
	//   86  185:iconst_1        
	//   87  186:iadd            
	//   88  187:istore          8
	//*  89  189:goto            128
						j1++;
	//   90  192:iload           7
	//   91  194:iconst_1        
	//   92  195:iadd            
	//   93  196:istore          7
					} while(true);
	//   94  198:goto            94
				}
			}
			l++;
	//   95  201:iload           5
	//   96  203:iconst_1        
	//   97  204:iadd            
	//   98  205:istore          5
			i1 = k1;
	//   99  207:iload           8
	//  100  209:istore          6
		}

	//* 101  211:goto            22
		return false;
	//  102  214:iconst_0        
	//  103  215:ireturn         
	}

	public boolean isAddToBackStackAllowed()
	{
		return mAllowAddToBackStack;
	//    0    0:aload_0         
	//    1    1:getfield        #86  <Field boolean mAllowAddToBackStack>
	//    2    4:ireturn         
	}

	public boolean isEmpty()
	{
		return mOps.isEmpty();
	//    0    0:aload_0         
	//    1    1:getfield        #84  <Field ArrayList mOps>
	//    2    4:invokevirtual   #426 <Method boolean ArrayList.isEmpty()>
	//    3    7:ireturn         
	}

	boolean isPostponed()
	{
		for(int i = 0; i < mOps.size(); i++)
	//*   0    0:iconst_0        
	//*   1    1:istore_1        
	//*   2    2:iload_1         
	//*   3    3:aload_0         
	//*   4    4:getfield        #84  <Field ArrayList mOps>
	//*   5    7:invokevirtual   #302 <Method int ArrayList.size()>
	//*   6   10:icmpge          39
			if(isFragmentPostponed((Op)mOps.get(i)))
	//*   7   13:aload_0         
	//*   8   14:getfield        #84  <Field ArrayList mOps>
	//*   9   17:iload_1         
	//*  10   18:invokevirtual   #306 <Method Object ArrayList.get(int)>
	//*  11   21:checkcast       #10  <Class BackStackRecord$Op>
	//*  12   24:invokestatic    #576 <Method boolean isFragmentPostponed(BackStackRecord$Op)>
	//*  13   27:ifeq            32
				return true;
	//   14   30:iconst_1        
	//   15   31:ireturn         

	//   16   32:iload_1         
	//   17   33:iconst_1        
	//   18   34:iadd            
	//   19   35:istore_1        
	//*  20   36:goto            2
		return false;
	//   21   39:iconst_0        
	//   22   40:ireturn         
	}

	public FragmentTransaction postOnCommit(Runnable runnable)
	{
		if(runnable == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       15
			throw new IllegalArgumentException("runnable cannot be null");
	//    2    4:new             #172 <Class IllegalArgumentException>
	//    3    7:dup             
	//    4    8:ldc2            #580 <String "runnable cannot be null">
	//    5   11:invokespecial   #179 <Method void IllegalArgumentException(String)>
	//    6   14:athrow          
		disallowAddToBackStack();
	//    7   15:aload_0         
	//    8   16:invokevirtual   #355 <Method FragmentTransaction disallowAddToBackStack()>
	//    9   19:pop             
		if(mCommitRunnables == null)
	//*  10   20:aload_0         
	//*  11   21:getfield        #582 <Field ArrayList mCommitRunnables>
	//*  12   24:ifnonnull       38
			mCommitRunnables = new ArrayList();
	//   13   27:aload_0         
	//   14   28:new             #81  <Class ArrayList>
	//   15   31:dup             
	//   16   32:invokespecial   #82  <Method void ArrayList()>
	//   17   35:putfield        #582 <Field ArrayList mCommitRunnables>
		mCommitRunnables.add(((Object) (runnable)));
	//   18   38:aload_0         
	//   19   39:getfield        #582 <Field ArrayList mCommitRunnables>
	//   20   42:aload_1         
	//   21   43:invokevirtual   #227 <Method boolean ArrayList.add(Object)>
	//   22   46:pop             
		return ((FragmentTransaction) (this));
	//   23   47:aload_0         
	//   24   48:areturn         
	}

	public FragmentTransaction remove(Fragment fragment)
	{
		addOp(new Op(3, fragment));
	//    0    0:aload_0         
	//    1    1:new             #10  <Class BackStackRecord$Op>
	//    2    4:dup             
	//    3    5:iconst_3        
	//    4    6:aload_1         
	//    5    7:invokespecial   #193 <Method void BackStackRecord$Op(int, Fragment)>
	//    6   10:invokevirtual   #197 <Method void addOp(BackStackRecord$Op)>
		return ((FragmentTransaction) (this));
	//    7   13:aload_0         
	//    8   14:areturn         
	}

	public FragmentTransaction replace(int i, Fragment fragment)
	{
		return replace(i, fragment, ((String) (null)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:aload_2         
	//    3    3:aconst_null     
	//    4    4:invokevirtual   #585 <Method FragmentTransaction replace(int, Fragment, String)>
	//    5    7:areturn         
	}

	public FragmentTransaction replace(int i, Fragment fragment, String s)
	{
		if(i == 0)
	//*   0    0:iload_1         
	//*   1    1:ifne            15
		{
			throw new IllegalArgumentException("Must use non-zero containerViewId");
	//    2    4:new             #172 <Class IllegalArgumentException>
	//    3    7:dup             
	//    4    8:ldc2            #587 <String "Must use non-zero containerViewId">
	//    5   11:invokespecial   #179 <Method void IllegalArgumentException(String)>
	//    6   14:athrow          
		} else
		{
			doAddOp(i, fragment, s, 2);
	//    7   15:aload_0         
	//    8   16:iload_1         
	//    9   17:aload_2         
	//   10   18:aload_3         
	//   11   19:iconst_2        
	//   12   20:invokespecial   #223 <Method void doAddOp(int, Fragment, String, int)>
			return ((FragmentTransaction) (this));
	//   13   23:aload_0         
	//   14   24:areturn         
		}
	}

	public void runOnCommitRunnables()
	{
		if(mCommitRunnables != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #582 <Field ArrayList mCommitRunnables>
	//*   2    4:ifnull          50
		{
			int i = 0;
	//    3    7:iconst_0        
	//    4    8:istore_1        
			for(int j = mCommitRunnables.size(); i < j; i++)
	//*   5    9:aload_0         
	//*   6   10:getfield        #582 <Field ArrayList mCommitRunnables>
	//*   7   13:invokevirtual   #302 <Method int ArrayList.size()>
	//*   8   16:istore_2        
	//*   9   17:iload_1         
	//*  10   18:iload_2         
	//*  11   19:icmpge          45
				((Runnable)mCommitRunnables.get(i)).run();
	//   12   22:aload_0         
	//   13   23:getfield        #582 <Field ArrayList mCommitRunnables>
	//   14   26:iload_1         
	//   15   27:invokevirtual   #306 <Method Object ArrayList.get(int)>
	//   16   30:checkcast       #590 <Class Runnable>
	//   17   33:invokeinterface #593 <Method void Runnable.run()>

	//   18   38:iload_1         
	//   19   39:iconst_1        
	//   20   40:iadd            
	//   21   41:istore_1        
	//*  22   42:goto            17
			mCommitRunnables = null;
	//   23   45:aload_0         
	//   24   46:aconst_null     
	//   25   47:putfield        #582 <Field ArrayList mCommitRunnables>
		}
	//   26   50:return          
	}

	public FragmentTransaction setAllowOptimization(boolean flag)
	{
		mAllowOptimization = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #90  <Field boolean mAllowOptimization>
		return ((FragmentTransaction) (this));
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public FragmentTransaction setBreadCrumbShortTitle(int i)
	{
		mBreadCrumbShortTitleRes = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #417 <Field int mBreadCrumbShortTitleRes>
		mBreadCrumbShortTitleText = null;
	//    3    5:aload_0         
	//    4    6:aconst_null     
	//    5    7:putfield        #419 <Field CharSequence mBreadCrumbShortTitleText>
		return ((FragmentTransaction) (this));
	//    6   10:aload_0         
	//    7   11:areturn         
	}

	public FragmentTransaction setBreadCrumbShortTitle(CharSequence charsequence)
	{
		mBreadCrumbShortTitleRes = 0;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #417 <Field int mBreadCrumbShortTitleRes>
		mBreadCrumbShortTitleText = charsequence;
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:putfield        #419 <Field CharSequence mBreadCrumbShortTitleText>
		return ((FragmentTransaction) (this));
	//    6   10:aload_0         
	//    7   11:areturn         
	}

	public FragmentTransaction setBreadCrumbTitle(int i)
	{
		mBreadCrumbTitleRes = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #406 <Field int mBreadCrumbTitleRes>
		mBreadCrumbTitleText = null;
	//    3    5:aload_0         
	//    4    6:aconst_null     
	//    5    7:putfield        #408 <Field CharSequence mBreadCrumbTitleText>
		return ((FragmentTransaction) (this));
	//    6   10:aload_0         
	//    7   11:areturn         
	}

	public FragmentTransaction setBreadCrumbTitle(CharSequence charsequence)
	{
		mBreadCrumbTitleRes = 0;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #406 <Field int mBreadCrumbTitleRes>
		mBreadCrumbTitleText = charsequence;
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:putfield        #408 <Field CharSequence mBreadCrumbTitleText>
		return ((FragmentTransaction) (this));
	//    6   10:aload_0         
	//    7   11:areturn         
	}

	public FragmentTransaction setCustomAnimations(int i, int j)
	{
		return setCustomAnimations(i, j, 0, 0);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:iconst_0        
	//    4    4:iconst_0        
	//    5    5:invokevirtual   #604 <Method FragmentTransaction setCustomAnimations(int, int, int, int)>
	//    6    8:areturn         
	}

	public FragmentTransaction setCustomAnimations(int i, int j, int k, int l)
	{
		mEnterAnim = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #229 <Field int mEnterAnim>
		mExitAnim = j;
	//    3    5:aload_0         
	//    4    6:iload_2         
	//    5    7:putfield        #234 <Field int mExitAnim>
		mPopEnterAnim = k;
	//    6   10:aload_0         
	//    7   11:iload_3         
	//    8   12:putfield        #239 <Field int mPopEnterAnim>
		mPopExitAnim = l;
	//    9   15:aload_0         
	//   10   16:iload           4
	//   11   18:putfield        #244 <Field int mPopExitAnim>
		return ((FragmentTransaction) (this));
	//   12   21:aload_0         
	//   13   22:areturn         
	}

	void setOnStartPostponedListener(Fragment.OnStartEnterTransitionListener onstartentertransitionlistener)
	{
		for(int i = 0; i < mOps.size(); i++)
	//*   0    0:iconst_0        
	//*   1    1:istore_2        
	//*   2    2:iload_2         
	//*   3    3:aload_0         
	//*   4    4:getfield        #84  <Field ArrayList mOps>
	//*   5    7:invokevirtual   #302 <Method int ArrayList.size()>
	//*   6   10:icmpge          47
		{
			Op op = (Op)mOps.get(i);
	//    7   13:aload_0         
	//    8   14:getfield        #84  <Field ArrayList mOps>
	//    9   17:iload_2         
	//   10   18:invokevirtual   #306 <Method Object ArrayList.get(int)>
	//   11   21:checkcast       #10  <Class BackStackRecord$Op>
	//   12   24:astore_3        
			if(isFragmentPostponed(op))
	//*  13   25:aload_3         
	//*  14   26:invokestatic    #576 <Method boolean isFragmentPostponed(BackStackRecord$Op)>
	//*  15   29:ifeq            40
				op.fragment.setOnStartEnterTransitionListener(onstartentertransitionlistener);
	//   16   32:aload_3         
	//   17   33:getfield        #203 <Field Fragment BackStackRecord$Op.fragment>
	//   18   36:aload_1         
	//   19   37:invokevirtual   #609 <Method void Fragment.setOnStartEnterTransitionListener(Fragment$OnStartEnterTransitionListener)>
		}

	//   20   40:iload_2         
	//   21   41:iconst_1        
	//   22   42:iadd            
	//   23   43:istore_2        
	//*  24   44:goto            2
	//   25   47:return          
	}

	public FragmentTransaction setPrimaryNavigationFragment(Fragment fragment)
	{
		addOp(new Op(8, fragment));
	//    0    0:aload_0         
	//    1    1:new             #10  <Class BackStackRecord$Op>
	//    2    4:dup             
	//    3    5:bipush          8
	//    4    7:aload_1         
	//    5    8:invokespecial   #193 <Method void BackStackRecord$Op(int, Fragment)>
	//    6   11:invokevirtual   #197 <Method void addOp(BackStackRecord$Op)>
		return ((FragmentTransaction) (this));
	//    7   14:aload_0         
	//    8   15:areturn         
	}

	public FragmentTransaction setTransition(int i)
	{
		mTransition = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #382 <Field int mTransition>
		return ((FragmentTransaction) (this));
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public FragmentTransaction setTransitionStyle(int i)
	{
		mTransitionStyle = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #394 <Field int mTransitionStyle>
		return ((FragmentTransaction) (this));
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public FragmentTransaction show(Fragment fragment)
	{
		addOp(new Op(5, fragment));
	//    0    0:aload_0         
	//    1    1:new             #10  <Class BackStackRecord$Op>
	//    2    4:dup             
	//    3    5:iconst_5        
	//    4    6:aload_1         
	//    5    7:invokespecial   #193 <Method void BackStackRecord$Op(int, Fragment)>
	//    6   10:invokevirtual   #197 <Method void addOp(BackStackRecord$Op)>
		return ((FragmentTransaction) (this));
	//    7   13:aload_0         
	//    8   14:areturn         
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder(128);
	//    0    0:new             #126 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:sipush          128
	//    3    7:invokespecial   #614 <Method void StringBuilder(int)>
	//    4   10:astore_1        
		stringbuilder.append("BackStackEntry{");
	//    5   11:aload_1         
	//    6   12:ldc2            #616 <String "BackStackEntry{">
	//    7   15:invokevirtual   #133 <Method StringBuilder StringBuilder.append(String)>
	//    8   18:pop             
		stringbuilder.append(Integer.toHexString(System.identityHashCode(((Object) (this)))));
	//    9   19:aload_1         
	//   10   20:aload_0         
	//   11   21:invokestatic    #622 <Method int System.identityHashCode(Object)>
	//   12   24:invokestatic    #390 <Method String Integer.toHexString(int)>
	//   13   27:invokevirtual   #133 <Method StringBuilder StringBuilder.append(String)>
	//   14   30:pop             
		if(mIndex >= 0)
	//*  15   31:aload_0         
	//*  16   32:getfield        #88  <Field int mIndex>
	//*  17   35:iflt            55
		{
			stringbuilder.append(" #");
	//   18   38:aload_1         
	//   19   39:ldc2            #624 <String " #">
	//   20   42:invokevirtual   #133 <Method StringBuilder StringBuilder.append(String)>
	//   21   45:pop             
			stringbuilder.append(mIndex);
	//   22   46:aload_1         
	//   23   47:aload_0         
	//   24   48:getfield        #88  <Field int mIndex>
	//   25   51:invokevirtual   #187 <Method StringBuilder StringBuilder.append(int)>
	//   26   54:pop             
		}
		if(mName != null)
	//*  27   55:aload_0         
	//*  28   56:getfield        #280 <Field String mName>
	//*  29   59:ifnull          79
		{
			stringbuilder.append(" ");
	//   30   62:aload_1         
	//   31   63:ldc2            #461 <String " ">
	//   32   66:invokevirtual   #133 <Method StringBuilder StringBuilder.append(String)>
	//   33   69:pop             
			stringbuilder.append(mName);
	//   34   70:aload_1         
	//   35   71:aload_0         
	//   36   72:getfield        #280 <Field String mName>
	//   37   75:invokevirtual   #133 <Method StringBuilder StringBuilder.append(String)>
	//   38   78:pop             
		}
		stringbuilder.append("}");
	//   39   79:aload_1         
	//   40   80:ldc2            #626 <String "}">
	//   41   83:invokevirtual   #133 <Method StringBuilder StringBuilder.append(String)>
	//   42   86:pop             
		return stringbuilder.toString();
	//   43   87:aload_1         
	//   44   88:invokevirtual   #144 <Method String StringBuilder.toString()>
	//   45   91:areturn         
	}

	Fragment trackAddedFragmentsInPop(ArrayList arraylist, Fragment fragment)
	{
		int i = 0;
	//    0    0:iconst_0        
	//    1    1:istore_3        
		Fragment fragment1;
		for(fragment1 = fragment; i < mOps.size(); fragment1 = fragment)
	//*   2    2:aload_2         
	//*   3    3:astore          4
	//*   4    5:iload_3         
	//*   5    6:aload_0         
	//*   6    7:getfield        #84  <Field ArrayList mOps>
	//*   7   10:invokevirtual   #302 <Method int ArrayList.size()>
	//*   8   13:icmpge          147
		{
			Op op = (Op)mOps.get(i);
	//    9   16:aload_0         
	//   10   17:getfield        #84  <Field ArrayList mOps>
	//   11   20:iload_3         
	//   12   21:invokevirtual   #306 <Method Object ArrayList.get(int)>
	//   13   24:checkcast       #10  <Class BackStackRecord$Op>
	//   14   27:astore          5
			fragment = fragment1;
	//   15   29:aload           4
	//   16   31:astore_2        
			switch(op.cmd)
	//*  17   32:aload           5
	//*  18   34:getfield        #433 <Field int BackStackRecord$Op.cmd>
			{
	//*  19   37:tableswitch     1 9: default 88
	//	               1 94
	//	               2 137
	//	               3 110
	//	               4 137
	//	               5 137
	//	               6 110
	//	               7 94
	//	               8 135
	//	               9 126
			default:
				fragment = fragment1;
	//   20   88:aload           4
	//   21   90:astore_2        
				break;

	//*  22   91:goto            137
			case 1: // '\001'
			case 7: // '\007'
				arraylist.remove(((Object) (op.fragment)));
	//   23   94:aload_1         
	//   24   95:aload           5
	//   25   97:getfield        #203 <Field Fragment BackStackRecord$Op.fragment>
	//   26  100:invokevirtual   #522 <Method boolean ArrayList.remove(Object)>
	//   27  103:pop             
				fragment = fragment1;
	//   28  104:aload           4
	//   29  106:astore_2        
				break;

	//*  30  107:goto            137
			case 3: // '\003'
			case 6: // '\006'
				arraylist.add(((Object) (op.fragment)));
	//   31  110:aload_1         
	//   32  111:aload           5
	//   33  113:getfield        #203 <Field Fragment BackStackRecord$Op.fragment>
	//   34  116:invokevirtual   #227 <Method boolean ArrayList.add(Object)>
	//   35  119:pop             
				fragment = fragment1;
	//   36  120:aload           4
	//   37  122:astore_2        
				break;

	//*  38  123:goto            137
			case 9: // '\t'
				fragment = op.fragment;
	//   39  126:aload           5
	//   40  128:getfield        #203 <Field Fragment BackStackRecord$Op.fragment>
	//   41  131:astore_2        
				break;

	//*  42  132:goto            137
			case 8: // '\b'
				fragment = null;
	//   43  135:aconst_null     
	//   44  136:astore_2        
				break;

			case 2: // '\002'
			case 4: // '\004'
			case 5: // '\005'
				break;
			}
			i++;
	//   45  137:iload_3         
	//   46  138:iconst_1        
	//   47  139:iadd            
	//   48  140:istore_3        
		}

	//   49  141:aload_2         
	//   50  142:astore          4
	//*  51  144:goto            5
		return fragment1;
	//   52  147:aload           4
	//   53  149:areturn         
	}

	static final int OP_ADD = 1;
	static final int OP_ATTACH = 7;
	static final int OP_DETACH = 6;
	static final int OP_HIDE = 4;
	static final int OP_NULL = 0;
	static final int OP_REMOVE = 3;
	static final int OP_REPLACE = 2;
	static final int OP_SET_PRIMARY_NAV = 8;
	static final int OP_SHOW = 5;
	static final int OP_UNSET_PRIMARY_NAV = 9;
	static final boolean SUPPORTS_TRANSITIONS;
	static final String TAG = "FragmentManager";
	boolean mAddToBackStack;
	boolean mAllowAddToBackStack;
	boolean mAllowOptimization;
	int mBreadCrumbShortTitleRes;
	CharSequence mBreadCrumbShortTitleText;
	int mBreadCrumbTitleRes;
	CharSequence mBreadCrumbTitleText;
	ArrayList mCommitRunnables;
	boolean mCommitted;
	int mEnterAnim;
	int mExitAnim;
	int mIndex;
	final FragmentManagerImpl mManager;
	String mName;
	ArrayList mOps;
	int mPopEnterAnim;
	int mPopExitAnim;
	ArrayList mSharedElementSourceNames;
	ArrayList mSharedElementTargetNames;
	int mTransition;
	int mTransitionStyle;

	static 
	{
		boolean flag;
		if(android.os.Build.VERSION.SDK_INT >= 21)
	//*   0    0:getstatic       #72  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          21
	//*   2    5:icmplt          13
			flag = true;
	//    3    8:iconst_1        
	//    4    9:istore_0        
		else
	//*   5   10:goto            15
			flag = false;
	//    6   13:iconst_0        
	//    7   14:istore_0        
		SUPPORTS_TRANSITIONS = flag;
	//    8   15:iload_0         
	//    9   16:putstatic       #74  <Field boolean SUPPORTS_TRANSITIONS>
	//*  10   19:return          
	}
}

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
		mReorderingAllowed = false;
	//   13   25:aload_0         
	//   14   26:iconst_0        
	//   15   27:putfield        #90  <Field boolean mReorderingAllowed>
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
	//*   1    3:ifeq            73
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
	//*  14   30:ifnonnull       75
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
	//*  25   55:aload_0         
	//*  26   56:getfield        #259 <Field ArrayList mSharedElementSourceNames>
	//*  27   59:aload_1         
	//*  28   60:invokevirtual   #227 <Method boolean ArrayList.add(Object)>
	//*  29   63:pop             
	//*  30   64:aload_0         
	//*  31   65:getfield        #261 <Field ArrayList mSharedElementTargetNames>
	//*  32   68:aload_2         
	//*  33   69:invokevirtual   #227 <Method boolean ArrayList.add(Object)>
	//*  34   72:pop             
	//*  35   73:aload_0         
	//*  36   74:areturn         
			{
				if(mSharedElementTargetNames.contains(((Object) (s))))
	//*  37   75:aload_0         
	//*  38   76:getfield        #261 <Field ArrayList mSharedElementTargetNames>
	//*  39   79:aload_2         
	//*  40   80:invokevirtual   #264 <Method boolean ArrayList.contains(Object)>
	//*  41   83:ifeq            120
					throw new IllegalArgumentException((new StringBuilder()).append("A shared element with the target name '").append(s).append("' has already been added to the transaction.").toString());
	//   42   86:new             #172 <Class IllegalArgumentException>
	//   43   89:dup             
	//   44   90:new             #126 <Class StringBuilder>
	//   45   93:dup             
	//   46   94:invokespecial   #127 <Method void StringBuilder()>
	//   47   97:ldc2            #266 <String "A shared element with the target name '">
	//   48  100:invokevirtual   #133 <Method StringBuilder StringBuilder.append(String)>
	//   49  103:aload_2         
	//   50  104:invokevirtual   #133 <Method StringBuilder StringBuilder.append(String)>
	//   51  107:ldc2            #268 <String "' has already been added to the transaction.">
	//   52  110:invokevirtual   #133 <Method StringBuilder StringBuilder.append(String)>
	//   53  113:invokevirtual   #144 <Method String StringBuilder.toString()>
	//   54  116:invokespecial   #179 <Method void IllegalArgumentException(String)>
	//   55  119:athrow          
				if(mSharedElementSourceNames.contains(((Object) (view))))
	//*  56  120:aload_0         
	//*  57  121:getfield        #259 <Field ArrayList mSharedElementSourceNames>
	//*  58  124:aload_1         
	//*  59  125:invokevirtual   #264 <Method boolean ArrayList.contains(Object)>
	//*  60  128:ifeq            55
					throw new IllegalArgumentException((new StringBuilder()).append("A shared element with the source name '").append(((String) (view))).append(" has already been added to the transaction.").toString());
	//   61  131:new             #172 <Class IllegalArgumentException>
	//   62  134:dup             
	//   63  135:new             #126 <Class StringBuilder>
	//   64  138:dup             
	//   65  139:invokespecial   #127 <Method void StringBuilder()>
	//   66  142:ldc2            #270 <String "A shared element with the source name '">
	//   67  145:invokevirtual   #133 <Method StringBuilder StringBuilder.append(String)>
	//   68  148:aload_1         
	//   69  149:invokevirtual   #133 <Method StringBuilder StringBuilder.append(String)>
	//   70  152:ldc2            #272 <String " has already been added to the transaction.">
	//   71  155:invokevirtual   #133 <Method StringBuilder StringBuilder.append(String)>
	//   72  158:invokevirtual   #144 <Method String StringBuilder.toString()>
	//   73  161:invokespecial   #179 <Method void IllegalArgumentException(String)>
	//   74  164:athrow          
			}
			mSharedElementSourceNames.add(((Object) (view)));
			mSharedElementTargetNames.add(((Object) (s)));
		}
		return ((FragmentTransaction) (this));
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
		if(mAddToBackStack)
	//*   0    0:aload_0         
	//*   1    1:getfield        #278 <Field boolean mAddToBackStack>
	//*   2    4:ifne            8
	//*   3    7:return          
		{
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
			int j = 0;
	//   25   58:iconst_0        
	//   26   59:istore_2        
			while(j < k) 
	//*  27   60:iload_2         
	//*  28   61:iload_3         
	//*  29   62:icmpge          7
			{
				Op op = (Op)mOps.get(j);
	//   30   65:aload_0         
	//   31   66:getfield        #84  <Field ArrayList mOps>
	//   32   69:iload_2         
	//   33   70:invokevirtual   #306 <Method Object ArrayList.get(int)>
	//   34   73:checkcast       #10  <Class BackStackRecord$Op>
	//   35   76:astore          4
				if(op.fragment != null)
	//*  36   78:aload           4
	//*  37   80:getfield        #203 <Field Fragment BackStackRecord$Op.fragment>
	//*  38   83:ifnull          158
				{
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
				j++;
	//   68  158:iload_2         
	//   69  159:iconst_1        
	//   70  160:iadd            
	//   71  161:istore_2        
			}
		}
	//*  72  162:goto            60
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
	//*  42   90:ifeq            119
			mIndex = mManager.allocBackStackIndex(this);
	//   43   93:aload_0         
	//   44   94:aload_0         
	//   45   95:getfield        #92  <Field FragmentManagerImpl mManager>
	//   46   98:aload_0         
	//   47   99:invokevirtual   #346 <Method int FragmentManagerImpl.allocBackStackIndex(BackStackRecord)>
	//   48  102:putfield        #88  <Field int mIndex>
		else
	//*  49  105:aload_0         
	//*  50  106:getfield        #92  <Field FragmentManagerImpl mManager>
	//*  51  109:aload_0         
	//*  52  110:iload_1         
	//*  53  111:invokevirtual   #350 <Method void FragmentManagerImpl.enqueueAction(FragmentManagerImpl$OpGenerator, boolean)>
	//*  54  114:aload_0         
	//*  55  115:getfield        #88  <Field int mIndex>
	//*  56  118:ireturn         
			mIndex = -1;
	//   57  119:aload_0         
	//   58  120:iconst_m1       
	//   59  121:putfield        #88  <Field int mIndex>
		mManager.enqueueAction(((FragmentManagerImpl.OpGenerator) (this)), flag);
		return mIndex;
	//*  60  124:goto            105
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
		int i;
		int j;
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
		if(mOps.isEmpty())
			break MISSING_BLOCK_LABEL_736;
	//  146  316:aload_0         
	//  147  317:getfield        #84  <Field ArrayList mOps>
	//  148  320:invokevirtual   #426 <Method boolean ArrayList.isEmpty()>
	//  149  323:ifne            736
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
		j = mOps.size();
	//  165  359:aload_0         
	//  166  360:getfield        #84  <Field ArrayList mOps>
	//  167  363:invokevirtual   #302 <Method int ArrayList.size()>
	//  168  366:istore          5
		i = 0;
	//  169  368:iconst_0        
	//  170  369:istore          4
_L13:
		Op op;
		if(i >= j)
			break MISSING_BLOCK_LABEL_736;
	//  171  371:iload           4
	//  172  373:iload           5
	//  173  375:icmpge          736
		op = (Op)mOps.get(i);
	//  174  378:aload_0         
	//  175  379:getfield        #84  <Field ArrayList mOps>
	//  176  382:iload           4
	//  177  384:invokevirtual   #306 <Method Object ArrayList.get(int)>
	//  178  387:checkcast       #10  <Class BackStackRecord$Op>
	//  179  390:astore          7
		op.cmd;
	//  180  392:aload           7
	//  181  394:getfield        #433 <Field int BackStackRecord$Op.cmd>
		JVM INSTR tableswitch 0 9: default 452
	//	               0 656
	//	               1 664
	//	               2 672
	//	               3 680
	//	               4 688
	//	               5 696
	//	               6 704
	//	               7 712
	//	               8 720
	//	               9 728;
	//  182  397:tableswitch     0 9: default 452
	//	               0 656
	//	               1 664
	//	               2 672
	//	               3 680
	//	               4 688
	//	               5 696
	//	               6 704
	//	               7 712
	//	               8 720
	//	               9 728
		   goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11
_L11:
		break MISSING_BLOCK_LABEL_728;
_L2:
		break; /* Loop/switch isn't completed */
_L1:
		String s1 = (new StringBuilder()).append("cmd=").append(op.cmd).toString();
	//  183  452:new             #126 <Class StringBuilder>
	//  184  455:dup             
	//  185  456:invokespecial   #127 <Method void StringBuilder()>
	//  186  459:ldc2            #435 <String "cmd=">
	//  187  462:invokevirtual   #133 <Method StringBuilder StringBuilder.append(String)>
	//  188  465:aload           7
	//  189  467:getfield        #433 <Field int BackStackRecord$Op.cmd>
	//  190  470:invokevirtual   #187 <Method StringBuilder StringBuilder.append(int)>
	//  191  473:invokevirtual   #144 <Method String StringBuilder.toString()>
	//  192  476:astore          6
_L14:
		printwriter.print(s);
	//  193  478:aload_2         
	//  194  479:aload_1         
	//  195  480:invokevirtual   #368 <Method void PrintWriter.print(String)>
		printwriter.print("  Op #");
	//  196  483:aload_2         
	//  197  484:ldc2            #437 <String "  Op #">
	//  198  487:invokevirtual   #368 <Method void PrintWriter.print(String)>
		printwriter.print(i);
	//  199  490:aload_2         
	//  200  491:iload           4
	//  201  493:invokevirtual   #374 <Method void PrintWriter.print(int)>
		printwriter.print(": ");
	//  202  496:aload_2         
	//  203  497:ldc2            #439 <String ": ">
	//  204  500:invokevirtual   #368 <Method void PrintWriter.print(String)>
		printwriter.print(s1);
	//  205  503:aload_2         
	//  206  504:aload           6
	//  207  506:invokevirtual   #368 <Method void PrintWriter.print(String)>
		printwriter.print(" ");
	//  208  509:aload_2         
	//  209  510:ldc2            #441 <String " ">
	//  210  513:invokevirtual   #368 <Method void PrintWriter.print(String)>
		printwriter.println(((Object) (op.fragment)));
	//  211  516:aload_2         
	//  212  517:aload           7
	//  213  519:getfield        #203 <Field Fragment BackStackRecord$Op.fragment>
	//  214  522:invokevirtual   #415 <Method void PrintWriter.println(Object)>
		if(flag)
	//* 215  525:iload_3         
	//* 216  526:ifeq            647
		{
			if(op.enterAnim != 0 || op.exitAnim != 0)
	//* 217  529:aload           7
	//* 218  531:getfield        #232 <Field int BackStackRecord$Op.enterAnim>
	//* 219  534:ifne            545
	//* 220  537:aload           7
	//* 221  539:getfield        #237 <Field int BackStackRecord$Op.exitAnim>
	//* 222  542:ifeq            588
			{
				printwriter.print(s);
	//  223  545:aload_2         
	//  224  546:aload_1         
	//  225  547:invokevirtual   #368 <Method void PrintWriter.print(String)>
				printwriter.print("enterAnim=#");
	//  226  550:aload_2         
	//  227  551:ldc2            #443 <String "enterAnim=#">
	//  228  554:invokevirtual   #368 <Method void PrintWriter.print(String)>
				printwriter.print(Integer.toHexString(op.enterAnim));
	//  229  557:aload_2         
	//  230  558:aload           7
	//  231  560:getfield        #232 <Field int BackStackRecord$Op.enterAnim>
	//  232  563:invokestatic    #390 <Method String Integer.toHexString(int)>
	//  233  566:invokevirtual   #368 <Method void PrintWriter.print(String)>
				printwriter.print(" exitAnim=#");
	//  234  569:aload_2         
	//  235  570:ldc2            #445 <String " exitAnim=#">
	//  236  573:invokevirtual   #368 <Method void PrintWriter.print(String)>
				printwriter.println(Integer.toHexString(op.exitAnim));
	//  237  576:aload_2         
	//  238  577:aload           7
	//  239  579:getfield        #237 <Field int BackStackRecord$Op.exitAnim>
	//  240  582:invokestatic    #390 <Method String Integer.toHexString(int)>
	//  241  585:invokevirtual   #396 <Method void PrintWriter.println(String)>
			}
			if(op.popEnterAnim != 0 || op.popExitAnim != 0)
	//* 242  588:aload           7
	//* 243  590:getfield        #242 <Field int BackStackRecord$Op.popEnterAnim>
	//* 244  593:ifne            604
	//* 245  596:aload           7
	//* 246  598:getfield        #247 <Field int BackStackRecord$Op.popExitAnim>
	//* 247  601:ifeq            647
			{
				printwriter.print(s);
	//  248  604:aload_2         
	//  249  605:aload_1         
	//  250  606:invokevirtual   #368 <Method void PrintWriter.print(String)>
				printwriter.print("popEnterAnim=#");
	//  251  609:aload_2         
	//  252  610:ldc2            #447 <String "popEnterAnim=#">
	//  253  613:invokevirtual   #368 <Method void PrintWriter.print(String)>
				printwriter.print(Integer.toHexString(op.popEnterAnim));
	//  254  616:aload_2         
	//  255  617:aload           7
	//  256  619:getfield        #242 <Field int BackStackRecord$Op.popEnterAnim>
	//  257  622:invokestatic    #390 <Method String Integer.toHexString(int)>
	//  258  625:invokevirtual   #368 <Method void PrintWriter.print(String)>
				printwriter.print(" popExitAnim=#");
	//  259  628:aload_2         
	//  260  629:ldc2            #449 <String " popExitAnim=#">
	//  261  632:invokevirtual   #368 <Method void PrintWriter.print(String)>
				printwriter.println(Integer.toHexString(op.popExitAnim));
	//  262  635:aload_2         
	//  263  636:aload           7
	//  264  638:getfield        #247 <Field int BackStackRecord$Op.popExitAnim>
	//  265  641:invokestatic    #390 <Method String Integer.toHexString(int)>
	//  266  644:invokevirtual   #396 <Method void PrintWriter.println(String)>
			}
		}
		i++;
	//  267  647:iload           4
	//  268  649:iconst_1        
	//  269  650:iadd            
	//  270  651:istore          4
		if(true) goto _L13; else goto _L12
	//  271  653:goto            371
_L12:
		s1 = "NULL";
	//  272  656:ldc2            #451 <String "NULL">
	//  273  659:astore          6
		  goto _L14
	//* 274  661:goto            478
_L3:
		s1 = "ADD";
	//  275  664:ldc2            #453 <String "ADD">
	//  276  667:astore          6
		  goto _L14
	//* 277  669:goto            478
_L4:
		s1 = "REPLACE";
	//  278  672:ldc2            #455 <String "REPLACE">
	//  279  675:astore          6
		  goto _L14
	//* 280  677:goto            478
_L5:
		s1 = "REMOVE";
	//  281  680:ldc2            #457 <String "REMOVE">
	//  282  683:astore          6
		  goto _L14
	//* 283  685:goto            478
_L6:
		s1 = "HIDE";
	//  284  688:ldc2            #459 <String "HIDE">
	//  285  691:astore          6
		  goto _L14
	//* 286  693:goto            478
_L7:
		s1 = "SHOW";
	//  287  696:ldc2            #461 <String "SHOW">
	//  288  699:astore          6
		  goto _L14
	//* 289  701:goto            478
_L8:
		s1 = "DETACH";
	//  290  704:ldc2            #463 <String "DETACH">
	//  291  707:astore          6
		  goto _L14
	//* 292  709:goto            478
_L9:
		s1 = "ATTACH";
	//  293  712:ldc2            #465 <String "ATTACH">
	//  294  715:astore          6
		  goto _L14
	//* 295  717:goto            478
_L10:
		s1 = "SET_PRIMARY_NAV";
	//  296  720:ldc2            #467 <String "SET_PRIMARY_NAV">
	//  297  723:astore          6
		  goto _L14
	//* 298  725:goto            478
		s1 = "UNSET_PRIMARY_NAV";
	//  299  728:ldc2            #469 <String "UNSET_PRIMARY_NAV">
	//  300  731:astore          6
		  goto _L14
	//* 301  733:goto            478
	//  302  736:return          
	}

	void executeOps()
	{
		int i;
		int j;
		j = mOps.size();
	//    0    0:aload_0         
	//    1    1:getfield        #84  <Field ArrayList mOps>
	//    2    4:invokevirtual   #302 <Method int ArrayList.size()>
	//    3    7:istore_2        
		i = 0;
	//    4    8:iconst_0        
	//    5    9:istore_1        
_L11:
		Op op;
		Fragment fragment;
		if(i >= j)
			break MISSING_BLOCK_LABEL_318;
	//    6   10:iload_1         
	//    7   11:iload_2         
	//    8   12:icmpge          318
		op = (Op)mOps.get(i);
	//    9   15:aload_0         
	//   10   16:getfield        #84  <Field ArrayList mOps>
	//   11   19:iload_1         
	//   12   20:invokevirtual   #306 <Method Object ArrayList.get(int)>
	//   13   23:checkcast       #10  <Class BackStackRecord$Op>
	//   14   26:astore_3        
		fragment = op.fragment;
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
		op.cmd;
	//   26   51:aload_3         
	//   27   52:getfield        #433 <Field int BackStackRecord$Op.cmd>
		JVM INSTR tableswitch 1 9: default 104
	//	               1 135
	//	               2 104
	//	               3 190
	//	               4 211
	//	               5 232
	//	               6 253
	//	               7 274
	//	               8 295
	//	               9 307;
	//   28   55:tableswitch     1 9: default 104
	//	               1 135
	//	               2 104
	//	               3 190
	//	               4 211
	//	               5 232
	//	               6 253
	//	               7 274
	//	               8 295
	//	               9 307
		   goto _L1 _L2 _L1 _L3 _L4 _L5 _L6 _L7 _L8 _L9
_L9:
		break MISSING_BLOCK_LABEL_307;
_L3:
		break; /* Loop/switch isn't completed */
_L1:
		throw new IllegalArgumentException((new StringBuilder()).append("Unknown cmd: ").append(op.cmd).toString());
	//   29  104:new             #172 <Class IllegalArgumentException>
	//   30  107:dup             
	//   31  108:new             #126 <Class StringBuilder>
	//   32  111:dup             
	//   33  112:invokespecial   #127 <Method void StringBuilder()>
	//   34  115:ldc2            #476 <String "Unknown cmd: ">
	//   35  118:invokevirtual   #133 <Method StringBuilder StringBuilder.append(String)>
	//   36  121:aload_3         
	//   37  122:getfield        #433 <Field int BackStackRecord$Op.cmd>
	//   38  125:invokevirtual   #187 <Method StringBuilder StringBuilder.append(int)>
	//   39  128:invokevirtual   #144 <Method String StringBuilder.toString()>
	//   40  131:invokespecial   #179 <Method void IllegalArgumentException(String)>
	//   41  134:athrow          
_L2:
		fragment.setNextAnim(op.enterAnim);
	//   42  135:aload           4
	//   43  137:aload_3         
	//   44  138:getfield        #232 <Field int BackStackRecord$Op.enterAnim>
	//   45  141:invokevirtual   #479 <Method void Fragment.setNextAnim(int)>
		mManager.addFragment(fragment, false);
	//   46  144:aload_0         
	//   47  145:getfield        #92  <Field FragmentManagerImpl mManager>
	//   48  148:aload           4
	//   49  150:iconst_0        
	//   50  151:invokevirtual   #483 <Method void FragmentManagerImpl.addFragment(Fragment, boolean)>
_L12:
		if(!mReorderingAllowed && op.cmd != 1 && fragment != null)
	//*  51  154:aload_0         
	//*  52  155:getfield        #90  <Field boolean mReorderingAllowed>
	//*  53  158:ifne            183
	//*  54  161:aload_3         
	//*  55  162:getfield        #433 <Field int BackStackRecord$Op.cmd>
	//*  56  165:iconst_1        
	//*  57  166:icmpeq          183
	//*  58  169:aload           4
	//*  59  171:ifnull          183
			mManager.moveFragmentToExpectedState(fragment);
	//   60  174:aload_0         
	//   61  175:getfield        #92  <Field FragmentManagerImpl mManager>
	//   62  178:aload           4
	//   63  180:invokevirtual   #487 <Method void FragmentManagerImpl.moveFragmentToExpectedState(Fragment)>
		i++;
	//   64  183:iload_1         
	//   65  184:iconst_1        
	//   66  185:iadd            
	//   67  186:istore_1        
		if(true) goto _L11; else goto _L10
	//   68  187:goto            10
_L10:
		fragment.setNextAnim(op.exitAnim);
	//   69  190:aload           4
	//   70  192:aload_3         
	//   71  193:getfield        #237 <Field int BackStackRecord$Op.exitAnim>
	//   72  196:invokevirtual   #479 <Method void Fragment.setNextAnim(int)>
		mManager.removeFragment(fragment);
	//   73  199:aload_0         
	//   74  200:getfield        #92  <Field FragmentManagerImpl mManager>
	//   75  203:aload           4
	//   76  205:invokevirtual   #490 <Method void FragmentManagerImpl.removeFragment(Fragment)>
		  goto _L12
	//*  77  208:goto            154
_L4:
		fragment.setNextAnim(op.exitAnim);
	//   78  211:aload           4
	//   79  213:aload_3         
	//   80  214:getfield        #237 <Field int BackStackRecord$Op.exitAnim>
	//   81  217:invokevirtual   #479 <Method void Fragment.setNextAnim(int)>
		mManager.hideFragment(fragment);
	//   82  220:aload_0         
	//   83  221:getfield        #92  <Field FragmentManagerImpl mManager>
	//   84  224:aload           4
	//   85  226:invokevirtual   #493 <Method void FragmentManagerImpl.hideFragment(Fragment)>
		  goto _L12
	//*  86  229:goto            154
_L5:
		fragment.setNextAnim(op.enterAnim);
	//   87  232:aload           4
	//   88  234:aload_3         
	//   89  235:getfield        #232 <Field int BackStackRecord$Op.enterAnim>
	//   90  238:invokevirtual   #479 <Method void Fragment.setNextAnim(int)>
		mManager.showFragment(fragment);
	//   91  241:aload_0         
	//   92  242:getfield        #92  <Field FragmentManagerImpl mManager>
	//   93  245:aload           4
	//   94  247:invokevirtual   #496 <Method void FragmentManagerImpl.showFragment(Fragment)>
		  goto _L12
	//*  95  250:goto            154
_L6:
		fragment.setNextAnim(op.exitAnim);
	//   96  253:aload           4
	//   97  255:aload_3         
	//   98  256:getfield        #237 <Field int BackStackRecord$Op.exitAnim>
	//   99  259:invokevirtual   #479 <Method void Fragment.setNextAnim(int)>
		mManager.detachFragment(fragment);
	//  100  262:aload_0         
	//  101  263:getfield        #92  <Field FragmentManagerImpl mManager>
	//  102  266:aload           4
	//  103  268:invokevirtual   #499 <Method void FragmentManagerImpl.detachFragment(Fragment)>
		  goto _L12
	//* 104  271:goto            154
_L7:
		fragment.setNextAnim(op.enterAnim);
	//  105  274:aload           4
	//  106  276:aload_3         
	//  107  277:getfield        #232 <Field int BackStackRecord$Op.enterAnim>
	//  108  280:invokevirtual   #479 <Method void Fragment.setNextAnim(int)>
		mManager.attachFragment(fragment);
	//  109  283:aload_0         
	//  110  284:getfield        #92  <Field FragmentManagerImpl mManager>
	//  111  287:aload           4
	//  112  289:invokevirtual   #502 <Method void FragmentManagerImpl.attachFragment(Fragment)>
		  goto _L12
	//* 113  292:goto            154
_L8:
		mManager.setPrimaryNavigationFragment(fragment);
	//  114  295:aload_0         
	//  115  296:getfield        #92  <Field FragmentManagerImpl mManager>
	//  116  299:aload           4
	//  117  301:invokevirtual   #505 <Method void FragmentManagerImpl.setPrimaryNavigationFragment(Fragment)>
		  goto _L12
	//* 118  304:goto            154
		mManager.setPrimaryNavigationFragment(((Fragment) (null)));
	//  119  307:aload_0         
	//  120  308:getfield        #92  <Field FragmentManagerImpl mManager>
	//  121  311:aconst_null     
	//  122  312:invokevirtual   #505 <Method void FragmentManagerImpl.setPrimaryNavigationFragment(Fragment)>
		  goto _L12
	//* 123  315:goto            154
		if(!mReorderingAllowed)
	//* 124  318:aload_0         
	//* 125  319:getfield        #90  <Field boolean mReorderingAllowed>
	//* 126  322:ifne            340
			mManager.moveToState(mManager.mCurState, true);
	//  127  325:aload_0         
	//  128  326:getfield        #92  <Field FragmentManagerImpl mManager>
	//  129  329:aload_0         
	//  130  330:getfield        #92  <Field FragmentManagerImpl mManager>
	//  131  333:getfield        #508 <Field int FragmentManagerImpl.mCurState>
	//  132  336:iconst_1        
	//  133  337:invokevirtual   #512 <Method void FragmentManagerImpl.moveToState(int, boolean)>
		return;
	//  134  340:return          
	}

	void executePopOps(boolean flag)
	{
		int i = mOps.size() - 1;
	//    0    0:aload_0         
	//    1    1:getfield        #84  <Field ArrayList mOps>
	//    2    4:invokevirtual   #302 <Method int ArrayList.size()>
	//    3    7:iconst_1        
	//    4    8:isub            
	//    5    9:istore_2        
_L11:
		Op op;
		Fragment fragment;
		if(i < 0)
			break MISSING_BLOCK_LABEL_322;
	//    6   10:iload_2         
	//    7   11:iflt            322
		op = (Op)mOps.get(i);
	//    8   14:aload_0         
	//    9   15:getfield        #84  <Field ArrayList mOps>
	//   10   18:iload_2         
	//   11   19:invokevirtual   #306 <Method Object ArrayList.get(int)>
	//   12   22:checkcast       #10  <Class BackStackRecord$Op>
	//   13   25:astore_3        
		fragment = op.fragment;
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
		op.cmd;
	//   26   53:aload_3         
	//   27   54:getfield        #433 <Field int BackStackRecord$Op.cmd>
		JVM INSTR tableswitch 1 9: default 108
	//	               1 139
	//	               2 108
	//	               3 193
	//	               4 215
	//	               5 236
	//	               6 257
	//	               7 278
	//	               8 299
	//	               9 310;
	//   28   57:tableswitch     1 9: default 108
	//	               1 139
	//	               2 108
	//	               3 193
	//	               4 215
	//	               5 236
	//	               6 257
	//	               7 278
	//	               8 299
	//	               9 310
		   goto _L1 _L2 _L1 _L3 _L4 _L5 _L6 _L7 _L8 _L9
_L9:
		break MISSING_BLOCK_LABEL_310;
_L3:
		break; /* Loop/switch isn't completed */
_L1:
		throw new IllegalArgumentException((new StringBuilder()).append("Unknown cmd: ").append(op.cmd).toString());
	//   29  108:new             #172 <Class IllegalArgumentException>
	//   30  111:dup             
	//   31  112:new             #126 <Class StringBuilder>
	//   32  115:dup             
	//   33  116:invokespecial   #127 <Method void StringBuilder()>
	//   34  119:ldc2            #476 <String "Unknown cmd: ">
	//   35  122:invokevirtual   #133 <Method StringBuilder StringBuilder.append(String)>
	//   36  125:aload_3         
	//   37  126:getfield        #433 <Field int BackStackRecord$Op.cmd>
	//   38  129:invokevirtual   #187 <Method StringBuilder StringBuilder.append(int)>
	//   39  132:invokevirtual   #144 <Method String StringBuilder.toString()>
	//   40  135:invokespecial   #179 <Method void IllegalArgumentException(String)>
	//   41  138:athrow          
_L2:
		fragment.setNextAnim(op.popExitAnim);
	//   42  139:aload           4
	//   43  141:aload_3         
	//   44  142:getfield        #247 <Field int BackStackRecord$Op.popExitAnim>
	//   45  145:invokevirtual   #479 <Method void Fragment.setNextAnim(int)>
		mManager.removeFragment(fragment);
	//   46  148:aload_0         
	//   47  149:getfield        #92  <Field FragmentManagerImpl mManager>
	//   48  152:aload           4
	//   49  154:invokevirtual   #490 <Method void FragmentManagerImpl.removeFragment(Fragment)>
_L12:
		if(!mReorderingAllowed && op.cmd != 3 && fragment != null)
	//*  50  157:aload_0         
	//*  51  158:getfield        #90  <Field boolean mReorderingAllowed>
	//*  52  161:ifne            186
	//*  53  164:aload_3         
	//*  54  165:getfield        #433 <Field int BackStackRecord$Op.cmd>
	//*  55  168:iconst_3        
	//*  56  169:icmpeq          186
	//*  57  172:aload           4
	//*  58  174:ifnull          186
			mManager.moveFragmentToExpectedState(fragment);
	//   59  177:aload_0         
	//   60  178:getfield        #92  <Field FragmentManagerImpl mManager>
	//   61  181:aload           4
	//   62  183:invokevirtual   #487 <Method void FragmentManagerImpl.moveFragmentToExpectedState(Fragment)>
		i--;
	//   63  186:iload_2         
	//   64  187:iconst_1        
	//   65  188:isub            
	//   66  189:istore_2        
		if(true) goto _L11; else goto _L10
	//   67  190:goto            10
_L10:
		fragment.setNextAnim(op.popEnterAnim);
	//   68  193:aload           4
	//   69  195:aload_3         
	//   70  196:getfield        #242 <Field int BackStackRecord$Op.popEnterAnim>
	//   71  199:invokevirtual   #479 <Method void Fragment.setNextAnim(int)>
		mManager.addFragment(fragment, false);
	//   72  202:aload_0         
	//   73  203:getfield        #92  <Field FragmentManagerImpl mManager>
	//   74  206:aload           4
	//   75  208:iconst_0        
	//   76  209:invokevirtual   #483 <Method void FragmentManagerImpl.addFragment(Fragment, boolean)>
		  goto _L12
	//*  77  212:goto            157
_L4:
		fragment.setNextAnim(op.popEnterAnim);
	//   78  215:aload           4
	//   79  217:aload_3         
	//   80  218:getfield        #242 <Field int BackStackRecord$Op.popEnterAnim>
	//   81  221:invokevirtual   #479 <Method void Fragment.setNextAnim(int)>
		mManager.showFragment(fragment);
	//   82  224:aload_0         
	//   83  225:getfield        #92  <Field FragmentManagerImpl mManager>
	//   84  228:aload           4
	//   85  230:invokevirtual   #496 <Method void FragmentManagerImpl.showFragment(Fragment)>
		  goto _L12
	//*  86  233:goto            157
_L5:
		fragment.setNextAnim(op.popExitAnim);
	//   87  236:aload           4
	//   88  238:aload_3         
	//   89  239:getfield        #247 <Field int BackStackRecord$Op.popExitAnim>
	//   90  242:invokevirtual   #479 <Method void Fragment.setNextAnim(int)>
		mManager.hideFragment(fragment);
	//   91  245:aload_0         
	//   92  246:getfield        #92  <Field FragmentManagerImpl mManager>
	//   93  249:aload           4
	//   94  251:invokevirtual   #493 <Method void FragmentManagerImpl.hideFragment(Fragment)>
		  goto _L12
	//*  95  254:goto            157
_L6:
		fragment.setNextAnim(op.popEnterAnim);
	//   96  257:aload           4
	//   97  259:aload_3         
	//   98  260:getfield        #242 <Field int BackStackRecord$Op.popEnterAnim>
	//   99  263:invokevirtual   #479 <Method void Fragment.setNextAnim(int)>
		mManager.attachFragment(fragment);
	//  100  266:aload_0         
	//  101  267:getfield        #92  <Field FragmentManagerImpl mManager>
	//  102  270:aload           4
	//  103  272:invokevirtual   #502 <Method void FragmentManagerImpl.attachFragment(Fragment)>
		  goto _L12
	//* 104  275:goto            157
_L7:
		fragment.setNextAnim(op.popExitAnim);
	//  105  278:aload           4
	//  106  280:aload_3         
	//  107  281:getfield        #247 <Field int BackStackRecord$Op.popExitAnim>
	//  108  284:invokevirtual   #479 <Method void Fragment.setNextAnim(int)>
		mManager.detachFragment(fragment);
	//  109  287:aload_0         
	//  110  288:getfield        #92  <Field FragmentManagerImpl mManager>
	//  111  291:aload           4
	//  112  293:invokevirtual   #499 <Method void FragmentManagerImpl.detachFragment(Fragment)>
		  goto _L12
	//* 113  296:goto            157
_L8:
		mManager.setPrimaryNavigationFragment(((Fragment) (null)));
	//  114  299:aload_0         
	//  115  300:getfield        #92  <Field FragmentManagerImpl mManager>
	//  116  303:aconst_null     
	//  117  304:invokevirtual   #505 <Method void FragmentManagerImpl.setPrimaryNavigationFragment(Fragment)>
		  goto _L12
	//* 118  307:goto            157
		mManager.setPrimaryNavigationFragment(fragment);
	//  119  310:aload_0         
	//  120  311:getfield        #92  <Field FragmentManagerImpl mManager>
	//  121  314:aload           4
	//  122  316:invokevirtual   #505 <Method void FragmentManagerImpl.setPrimaryNavigationFragment(Fragment)>
		  goto _L12
	//* 123  319:goto            157
		if(!mReorderingAllowed && flag)
	//* 124  322:aload_0         
	//* 125  323:getfield        #90  <Field boolean mReorderingAllowed>
	//* 126  326:ifne            348
	//* 127  329:iload_1         
	//* 128  330:ifeq            348
			mManager.moveToState(mManager.mCurState, true);
	//  129  333:aload_0         
	//  130  334:getfield        #92  <Field FragmentManagerImpl mManager>
	//  131  337:aload_0         
	//  132  338:getfield        #92  <Field FragmentManagerImpl mManager>
	//  133  341:getfield        #508 <Field int FragmentManagerImpl.mCurState>
	//  134  344:iconst_1        
	//  135  345:invokevirtual   #512 <Method void FragmentManagerImpl.moveToState(int, boolean)>
		return;
	//  136  348:return          
	}

	Fragment expandOps(ArrayList arraylist, Fragment fragment)
	{
		int i;
		Fragment fragment1;
		i = 0;
	//    0    0:iconst_0        
	//    1    1:istore_3        
		fragment1 = fragment;
	//    2    2:aload_2         
	//    3    3:astore          8
_L8:
		int j;
		Op op;
		if(i >= mOps.size())
			break MISSING_BLOCK_LABEL_442;
	//    4    5:iload_3         
	//    5    6:aload_0         
	//    6    7:getfield        #84  <Field ArrayList mOps>
	//    7   10:invokevirtual   #302 <Method int ArrayList.size()>
	//    8   13:icmpge          442
		op = (Op)mOps.get(i);
	//    9   16:aload_0         
	//   10   17:getfield        #84  <Field ArrayList mOps>
	//   11   20:iload_3         
	//   12   21:invokevirtual   #306 <Method Object ArrayList.get(int)>
	//   13   24:checkcast       #10  <Class BackStackRecord$Op>
	//   14   27:astore          9
		j = i;
	//   15   29:iload_3         
	//   16   30:istore          4
		fragment = fragment1;
	//   17   32:aload           8
	//   18   34:astore_2        
		op.cmd;
	//   19   35:aload           9
	//   20   37:getfield        #433 <Field int BackStackRecord$Op.cmd>
		JVM INSTR tableswitch 1 8: default 88
	//	               1 105
	//	               2 182
	//	               3 124
	//	               4 94
	//	               5 94
	//	               6 124
	//	               7 105
	//	               8 409;
	//   21   40:tableswitch     1 8: default 88
	//	               1 105
	//	               2 182
	//	               3 124
	//	               4 94
	//	               5 94
	//	               6 124
	//	               7 105
	//	               8 409
		   goto _L1 _L2 _L3 _L4 _L5 _L5 _L4 _L2 _L6
_L6:
		break MISSING_BLOCK_LABEL_409;
_L2:
		break; /* Loop/switch isn't completed */
_L5:
		break; /* Loop/switch isn't completed */
_L1:
		fragment = fragment1;
	//   22   88:aload           8
	//   23   90:astore_2        
		j = i;
	//   24   91:iload_3         
	//   25   92:istore          4
_L9:
		i = j + 1;
	//   26   94:iload           4
	//   27   96:iconst_1        
	//   28   97:iadd            
	//   29   98:istore_3        
		fragment1 = fragment;
	//   30   99:aload_2         
	//   31  100:astore          8
		if(true) goto _L8; else goto _L7
	//   32  102:goto            5
_L7:
		arraylist.add(((Object) (op.fragment)));
	//   33  105:aload_1         
	//   34  106:aload           9
	//   35  108:getfield        #203 <Field Fragment BackStackRecord$Op.fragment>
	//   36  111:invokevirtual   #227 <Method boolean ArrayList.add(Object)>
	//   37  114:pop             
		j = i;
	//   38  115:iload_3         
	//   39  116:istore          4
		fragment = fragment1;
	//   40  118:aload           8
	//   41  120:astore_2        
		  goto _L9
	//*  42  121:goto            94
_L4:
		arraylist.remove(((Object) (op.fragment)));
	//   43  124:aload_1         
	//   44  125:aload           9
	//   45  127:getfield        #203 <Field Fragment BackStackRecord$Op.fragment>
	//   46  130:invokevirtual   #522 <Method boolean ArrayList.remove(Object)>
	//   47  133:pop             
		j = i;
	//   48  134:iload_3         
	//   49  135:istore          4
		fragment = fragment1;
	//   50  137:aload           8
	//   51  139:astore_2        
		if(op.fragment == fragment1)
	//*  52  140:aload           9
	//*  53  142:getfield        #203 <Field Fragment BackStackRecord$Op.fragment>
	//*  54  145:aload           8
	//*  55  147:if_acmpne       94
		{
			mOps.add(i, ((Object) (new Op(9, op.fragment))));
	//   56  150:aload_0         
	//   57  151:getfield        #84  <Field ArrayList mOps>
	//   58  154:iload_3         
	//   59  155:new             #10  <Class BackStackRecord$Op>
	//   60  158:dup             
	//   61  159:bipush          9
	//   62  161:aload           9
	//   63  163:getfield        #203 <Field Fragment BackStackRecord$Op.fragment>
	//   64  166:invokespecial   #193 <Method void BackStackRecord$Op(int, Fragment)>
	//   65  169:invokevirtual   #525 <Method void ArrayList.add(int, Object)>
			j = i + 1;
	//   66  172:iload_3         
	//   67  173:iconst_1        
	//   68  174:iadd            
	//   69  175:istore          4
			fragment = null;
	//   70  177:aconst_null     
	//   71  178:astore_2        
		}
		  goto _L9
	//*  72  179:goto            94
_L3:
		Fragment fragment2 = op.fragment;
	//   73  182:aload           9
	//   74  184:getfield        #203 <Field Fragment BackStackRecord$Op.fragment>
	//   75  187:astore          10
		int i1 = fragment2.mContainerId;
	//   76  189:aload           10
	//   77  191:getfield        #190 <Field int Fragment.mContainerId>
	//   78  194:istore          7
		j = 0;
	//   79  196:iconst_0        
	//   80  197:istore          4
		int k = arraylist.size() - 1;
	//   81  199:aload_1         
	//   82  200:invokevirtual   #302 <Method int ArrayList.size()>
	//   83  203:iconst_1        
	//   84  204:isub            
	//   85  205:istore          5
		fragment = fragment1;
	//   86  207:aload           8
	//   87  209:astore_2        
		while(k >= 0) 
	//*  88  210:iload           5
	//*  89  212:iflt            369
		{
			Fragment fragment3 = (Fragment)arraylist.get(k);
	//   90  215:aload_1         
	//   91  216:iload           5
	//   92  218:invokevirtual   #306 <Method Object ArrayList.get(int)>
	//   93  221:checkcast       #149 <Class Fragment>
	//   94  224:astore          11
			if(fragment3.mContainerId == i1)
	//*  95  226:aload           11
	//*  96  228:getfield        #190 <Field int Fragment.mContainerId>
	//*  97  231:iload           7
	//*  98  233:icmpne          445
				if(fragment3 == fragment2)
	//*  99  236:aload           11
	//* 100  238:aload           10
	//* 101  240:if_acmpne       255
				{
					j = 1;
	//  102  243:iconst_1        
	//  103  244:istore          4
				} else
	//* 104  246:iload           5
	//* 105  248:iconst_1        
	//* 106  249:isub            
	//* 107  250:istore          5
	//* 108  252:goto            210
				{
					int l = i;
	//  109  255:iload_3         
	//  110  256:istore          6
					fragment1 = fragment;
	//  111  258:aload_2         
	//  112  259:astore          8
					if(fragment3 == fragment)
	//* 113  261:aload           11
	//* 114  263:aload_2         
	//* 115  264:if_acmpne       294
					{
						mOps.add(i, ((Object) (new Op(9, fragment3))));
	//  116  267:aload_0         
	//  117  268:getfield        #84  <Field ArrayList mOps>
	//  118  271:iload_3         
	//  119  272:new             #10  <Class BackStackRecord$Op>
	//  120  275:dup             
	//  121  276:bipush          9
	//  122  278:aload           11
	//  123  280:invokespecial   #193 <Method void BackStackRecord$Op(int, Fragment)>
	//  124  283:invokevirtual   #525 <Method void ArrayList.add(int, Object)>
						l = i + 1;
	//  125  286:iload_3         
	//  126  287:iconst_1        
	//  127  288:iadd            
	//  128  289:istore          6
						fragment1 = null;
	//  129  291:aconst_null     
	//  130  292:astore          8
					}
					fragment = ((Fragment) (new Op(3, fragment3)));
	//  131  294:new             #10  <Class BackStackRecord$Op>
	//  132  297:dup             
	//  133  298:iconst_3        
	//  134  299:aload           11
	//  135  301:invokespecial   #193 <Method void BackStackRecord$Op(int, Fragment)>
	//  136  304:astore_2        
					fragment.enterAnim = op.enterAnim;
	//  137  305:aload_2         
	//  138  306:aload           9
	//  139  308:getfield        #232 <Field int BackStackRecord$Op.enterAnim>
	//  140  311:putfield        #232 <Field int BackStackRecord$Op.enterAnim>
					fragment.popEnterAnim = op.popEnterAnim;
	//  141  314:aload_2         
	//  142  315:aload           9
	//  143  317:getfield        #242 <Field int BackStackRecord$Op.popEnterAnim>
	//  144  320:putfield        #242 <Field int BackStackRecord$Op.popEnterAnim>
					fragment.exitAnim = op.exitAnim;
	//  145  323:aload_2         
	//  146  324:aload           9
	//  147  326:getfield        #237 <Field int BackStackRecord$Op.exitAnim>
	//  148  329:putfield        #237 <Field int BackStackRecord$Op.exitAnim>
					fragment.popExitAnim = op.popExitAnim;
	//  149  332:aload_2         
	//  150  333:aload           9
	//  151  335:getfield        #247 <Field int BackStackRecord$Op.popExitAnim>
	//  152  338:putfield        #247 <Field int BackStackRecord$Op.popExitAnim>
					mOps.add(l, ((Object) (fragment)));
	//  153  341:aload_0         
	//  154  342:getfield        #84  <Field ArrayList mOps>
	//  155  345:iload           6
	//  156  347:aload_2         
	//  157  348:invokevirtual   #525 <Method void ArrayList.add(int, Object)>
					arraylist.remove(((Object) (fragment3)));
	//  158  351:aload_1         
	//  159  352:aload           11
	//  160  354:invokevirtual   #522 <Method boolean ArrayList.remove(Object)>
	//  161  357:pop             
					i = l + 1;
	//  162  358:iload           6
	//  163  360:iconst_1        
	//  164  361:iadd            
	//  165  362:istore_3        
					fragment = fragment1;
	//  166  363:aload           8
	//  167  365:astore_2        
				}
			k--;
		}
	//* 168  366:goto            246
		if(j != 0)
	//* 169  369:iload           4
	//* 170  371:ifeq            393
		{
			mOps.remove(i);
	//  171  374:aload_0         
	//  172  375:getfield        #84  <Field ArrayList mOps>
	//  173  378:iload_3         
	//  174  379:invokevirtual   #527 <Method Object ArrayList.remove(int)>
	//  175  382:pop             
			i--;
	//  176  383:iload_3         
	//  177  384:iconst_1        
	//  178  385:isub            
	//  179  386:istore_3        
		} else
	//* 180  387:iload_3         
	//* 181  388:istore          4
	//* 182  390:goto            94
		{
			op.cmd = 1;
	//  183  393:aload           9
	//  184  395:iconst_1        
	//  185  396:putfield        #433 <Field int BackStackRecord$Op.cmd>
			arraylist.add(((Object) (fragment2)));
	//  186  399:aload_1         
	//  187  400:aload           10
	//  188  402:invokevirtual   #227 <Method boolean ArrayList.add(Object)>
	//  189  405:pop             
		}
		j = i;
		  goto _L9
	//* 190  406:goto            387
		mOps.add(i, ((Object) (new Op(9, fragment1))));
	//  191  409:aload_0         
	//  192  410:getfield        #84  <Field ArrayList mOps>
	//  193  413:iload_3         
	//  194  414:new             #10  <Class BackStackRecord$Op>
	//  195  417:dup             
	//  196  418:bipush          9
	//  197  420:aload           8
	//  198  422:invokespecial   #193 <Method void BackStackRecord$Op(int, Fragment)>
	//  199  425:invokevirtual   #525 <Method void ArrayList.add(int, Object)>
		j = i + 1;
	//  200  428:iload_3         
	//  201  429:iconst_1        
	//  202  430:iadd            
	//  203  431:istore          4
		fragment = op.fragment;
	//  204  433:aload           9
	//  205  435:getfield        #203 <Field Fragment BackStackRecord$Op.fragment>
	//  206  438:astore_2        
		  goto _L9
	//* 207  439:goto            94
		return fragment1;
	//  208  442:aload           8
	//  209  444:areturn         
	//* 210  445:goto            246
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
		int k;
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
			if(op.fragment != null)
	//*  15   30:aload           5
	//*  16   32:getfield        #203 <Field Fragment BackStackRecord$Op.fragment>
	//*  17   35:ifnull          58
				k = op.fragment.mContainerId;
	//   18   38:aload           5
	//   19   40:getfield        #203 <Field Fragment BackStackRecord$Op.fragment>
	//   20   43:getfield        #190 <Field int Fragment.mContainerId>
	//   21   46:istore_3        
			else
	//*  22   47:iload_3         
	//*  23   48:ifeq            63
	//*  24   51:iload_3         
	//*  25   52:iload_1         
	//*  26   53:icmpne          63
	//*  27   56:iconst_1        
	//*  28   57:ireturn         
				k = 0;
	//   29   58:iconst_0        
	//   30   59:istore_3        
			if(k != 0 && k == i)
				return true;
		}

	//   31   60:goto            47
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
		int l1 = mOps.size();
	//    5    7:aload_0         
	//    6    8:getfield        #84  <Field ArrayList mOps>
	//    7   11:invokevirtual   #302 <Method int ArrayList.size()>
	//    8   14:istore          9
		int l = -1;
	//    9   16:iconst_m1       
	//   10   17:istore          5
		int i1 = 0;
	//   11   19:iconst_0        
	//   12   20:istore          6
		while(i1 < l1) 
	//*  13   22:iload           6
	//*  14   24:iload           9
	//*  15   26:icmpge          198
		{
			Op op = (Op)mOps.get(i1);
	//   16   29:aload_0         
	//   17   30:getfield        #84  <Field ArrayList mOps>
	//   18   33:iload           6
	//   19   35:invokevirtual   #306 <Method Object ArrayList.get(int)>
	//   20   38:checkcast       #10  <Class BackStackRecord$Op>
	//   21   41:astore          11
			int k;
			if(op.fragment != null)
	//*  22   43:aload           11
	//*  23   45:getfield        #203 <Field Fragment BackStackRecord$Op.fragment>
	//*  24   48:ifnull          155
				k = op.fragment.mContainerId;
	//   25   51:aload           11
	//   26   53:getfield        #203 <Field Fragment BackStackRecord$Op.fragment>
	//   27   56:getfield        #190 <Field int Fragment.mContainerId>
	//   28   59:istore          4
			else
	//*  29   61:iload           4
	//*  30   63:ifeq            200
	//*  31   66:iload           4
	//*  32   68:iload           5
	//*  33   70:icmpeq          200
	//*  34   73:iload_2         
	//*  35   74:istore          5
	//*  36   76:iload           5
	//*  37   78:iload_3         
	//*  38   79:icmpge          185
	//*  39   82:aload_1         
	//*  40   83:iload           5
	//*  41   85:invokevirtual   #306 <Method Object ArrayList.get(int)>
	//*  42   88:checkcast       #2   <Class BackStackRecord>
	//*  43   91:astore          11
	//*  44   93:aload           11
	//*  45   95:getfield        #84  <Field ArrayList mOps>
	//*  46   98:invokevirtual   #302 <Method int ArrayList.size()>
	//*  47  101:istore          10
	//*  48  103:iconst_0        
	//*  49  104:istore          7
	//*  50  106:iload           7
	//*  51  108:iload           10
	//*  52  110:icmpge          176
	//*  53  113:aload           11
	//*  54  115:getfield        #84  <Field ArrayList mOps>
	//*  55  118:iload           7
	//*  56  120:invokevirtual   #306 <Method Object ArrayList.get(int)>
	//*  57  123:checkcast       #10  <Class BackStackRecord$Op>
	//*  58  126:astore          12
	//*  59  128:aload           12
	//*  60  130:getfield        #203 <Field Fragment BackStackRecord$Op.fragment>
	//*  61  133:ifnull          161
	//*  62  136:aload           12
	//*  63  138:getfield        #203 <Field Fragment BackStackRecord$Op.fragment>
	//*  64  141:getfield        #190 <Field int Fragment.mContainerId>
	//*  65  144:istore          8
	//*  66  146:iload           8
	//*  67  148:iload           4
	//*  68  150:icmpne          167
	//*  69  153:iconst_1        
	//*  70  154:ireturn         
				k = 0;
	//   71  155:iconst_0        
	//   72  156:istore          4
			if(k != 0 && k != l)
				for(l = i; l < j; l++)
				{
					BackStackRecord backstackrecord = (BackStackRecord)arraylist.get(l);
					int i2 = backstackrecord.mOps.size();
					int k1;
					for(int j1 = 0; j1 < i2; j1++)
					{
						Op op1 = (Op)backstackrecord.mOps.get(j1);
						if(op1.fragment != null)
							k1 = op1.fragment.mContainerId;
						else
	//*  73  158:goto            61
							k1 = 0;
	//   74  161:iconst_0        
	//   75  162:istore          8
						if(k1 == k)
							return true;
					}

	//   76  164:goto            146
	//   77  167:iload           7
	//   78  169:iconst_1        
	//   79  170:iadd            
	//   80  171:istore          7
				}

	//   81  173:goto            106
	//   82  176:iload           5
	//   83  178:iconst_1        
	//   84  179:iadd            
	//   85  180:istore          5
			else
	//*  86  182:goto            76
	//*  87  185:iload           6
	//*  88  187:iconst_1        
	//*  89  188:iadd            
	//*  90  189:istore          6
	//*  91  191:iload           4
	//*  92  193:istore          5
	//*  93  195:goto            22
	//*  94  198:iconst_0        
	//*  95  199:ireturn         
				k = l;
	//   96  200:iload           5
	//   97  202:istore          4
			i1++;
			l = k;
		}
		return false;
	//*  98  204:goto            185
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
		boolean flag1 = false;
	//    0    0:iconst_0        
	//    1    1:istore_3        
		int i = 0;
	//    2    2:iconst_0        
	//    3    3:istore_1        
		do
		{
label0:
			{
				boolean flag = flag1;
	//    4    4:iload_3         
	//    5    5:istore_2        
				if(i < mOps.size())
	//*   6    6:iload_1         
	//*   7    7:aload_0         
	//*   8    8:getfield        #84  <Field ArrayList mOps>
	//*   9   11:invokevirtual   #302 <Method int ArrayList.size()>
	//*  10   14:icmpge          36
				{
					if(!isFragmentPostponed((Op)mOps.get(i)))
						break label0;
	//   11   17:aload_0         
	//   12   18:getfield        #84  <Field ArrayList mOps>
	//   13   21:iload_1         
	//   14   22:invokevirtual   #306 <Method Object ArrayList.get(int)>
	//   15   25:checkcast       #10  <Class BackStackRecord$Op>
	//   16   28:invokestatic    #576 <Method boolean isFragmentPostponed(BackStackRecord$Op)>
	//   17   31:ifeq            38
					flag = true;
	//   18   34:iconst_1        
	//   19   35:istore_2        
				}
				return flag;
	//   20   36:iload_2         
	//   21   37:ireturn         
			}
			i++;
	//   22   38:iload_1         
	//   23   39:iconst_1        
	//   24   40:iadd            
	//   25   41:istore_1        
		} while(true);
	//   26   42:goto            4
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
	//    4    4:invokevirtual   #579 <Method FragmentTransaction replace(int, Fragment, String)>
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
	//    4    8:ldc2            #581 <String "Must use non-zero containerViewId">
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

	public FragmentTransaction runOnCommit(Runnable runnable)
	{
		if(runnable == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       15
			throw new IllegalArgumentException("runnable cannot be null");
	//    2    4:new             #172 <Class IllegalArgumentException>
	//    3    7:dup             
	//    4    8:ldc2            #585 <String "runnable cannot be null">
	//    5   11:invokespecial   #179 <Method void IllegalArgumentException(String)>
	//    6   14:athrow          
		disallowAddToBackStack();
	//    7   15:aload_0         
	//    8   16:invokevirtual   #355 <Method FragmentTransaction disallowAddToBackStack()>
	//    9   19:pop             
		if(mCommitRunnables == null)
	//*  10   20:aload_0         
	//*  11   21:getfield        #587 <Field ArrayList mCommitRunnables>
	//*  12   24:ifnonnull       38
			mCommitRunnables = new ArrayList();
	//   13   27:aload_0         
	//   14   28:new             #81  <Class ArrayList>
	//   15   31:dup             
	//   16   32:invokespecial   #82  <Method void ArrayList()>
	//   17   35:putfield        #587 <Field ArrayList mCommitRunnables>
		mCommitRunnables.add(((Object) (runnable)));
	//   18   38:aload_0         
	//   19   39:getfield        #587 <Field ArrayList mCommitRunnables>
	//   20   42:aload_1         
	//   21   43:invokevirtual   #227 <Method boolean ArrayList.add(Object)>
	//   22   46:pop             
		return ((FragmentTransaction) (this));
	//   23   47:aload_0         
	//   24   48:areturn         
	}

	public void runOnCommitRunnables()
	{
		if(mCommitRunnables != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #587 <Field ArrayList mCommitRunnables>
	//*   2    4:ifnull          50
		{
			int j = mCommitRunnables.size();
	//    3    7:aload_0         
	//    4    8:getfield        #587 <Field ArrayList mCommitRunnables>
	//    5   11:invokevirtual   #302 <Method int ArrayList.size()>
	//    6   14:istore_2        
			for(int i = 0; i < j; i++)
	//*   7   15:iconst_0        
	//*   8   16:istore_1        
	//*   9   17:iload_1         
	//*  10   18:iload_2         
	//*  11   19:icmpge          45
				((Runnable)mCommitRunnables.get(i)).run();
	//   12   22:aload_0         
	//   13   23:getfield        #587 <Field ArrayList mCommitRunnables>
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
	//   25   47:putfield        #587 <Field ArrayList mCommitRunnables>
		}
	//   26   50:return          
	}

	public FragmentTransaction setAllowOptimization(boolean flag)
	{
		return setReorderingAllowed(flag);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #598 <Method FragmentTransaction setReorderingAllowed(boolean)>
	//    3    5:areturn         
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
	//    5    5:invokevirtual   #607 <Method FragmentTransaction setCustomAnimations(int, int, int, int)>
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
	//   19   37:invokevirtual   #612 <Method void Fragment.setOnStartEnterTransitionListener(Fragment$OnStartEnterTransitionListener)>
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

	public FragmentTransaction setReorderingAllowed(boolean flag)
	{
		mReorderingAllowed = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #90  <Field boolean mReorderingAllowed>
		return ((FragmentTransaction) (this));
	//    3    5:aload_0         
	//    4    6:areturn         
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
	//    3    7:invokespecial   #617 <Method void StringBuilder(int)>
	//    4   10:astore_1        
		stringbuilder.append("BackStackEntry{");
	//    5   11:aload_1         
	//    6   12:ldc2            #619 <String "BackStackEntry{">
	//    7   15:invokevirtual   #133 <Method StringBuilder StringBuilder.append(String)>
	//    8   18:pop             
		stringbuilder.append(Integer.toHexString(System.identityHashCode(((Object) (this)))));
	//    9   19:aload_1         
	//   10   20:aload_0         
	//   11   21:invokestatic    #625 <Method int System.identityHashCode(Object)>
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
	//   19   39:ldc2            #627 <String " #">
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
	//   31   63:ldc2            #441 <String " ">
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
	//   40   80:ldc2            #629 <String "}">
	//   41   83:invokevirtual   #133 <Method StringBuilder StringBuilder.append(String)>
	//   42   86:pop             
		return stringbuilder.toString();
	//   43   87:aload_1         
	//   44   88:invokevirtual   #144 <Method String StringBuilder.toString()>
	//   45   91:areturn         
	}

	Fragment trackAddedFragmentsInPop(ArrayList arraylist, Fragment fragment)
	{
		int i;
		Fragment fragment1;
		i = 0;
	//    0    0:iconst_0        
	//    1    1:istore_3        
		fragment1 = fragment;
	//    2    2:aload_2         
	//    3    3:astore          4
_L8:
		Op op;
		if(i >= mOps.size())
			break MISSING_BLOCK_LABEL_147;
	//    4    5:iload_3         
	//    5    6:aload_0         
	//    6    7:getfield        #84  <Field ArrayList mOps>
	//    7   10:invokevirtual   #302 <Method int ArrayList.size()>
	//    8   13:icmpge          147
		op = (Op)mOps.get(i);
	//    9   16:aload_0         
	//   10   17:getfield        #84  <Field ArrayList mOps>
	//   11   20:iload_3         
	//   12   21:invokevirtual   #306 <Method Object ArrayList.get(int)>
	//   13   24:checkcast       #10  <Class BackStackRecord$Op>
	//   14   27:astore          5
		fragment = fragment1;
	//   15   29:aload           4
	//   16   31:astore_2        
		op.cmd;
	//   17   32:aload           5
	//   18   34:getfield        #433 <Field int BackStackRecord$Op.cmd>
		JVM INSTR tableswitch 1 9: default 88
	//	               1 101
	//	               2 91
	//	               3 117
	//	               4 91
	//	               5 91
	//	               6 117
	//	               7 101
	//	               8 142
	//	               9 133;
	//   19   37:tableswitch     1 9: default 88
	//	               1 101
	//	               2 91
	//	               3 117
	//	               4 91
	//	               5 91
	//	               6 117
	//	               7 101
	//	               8 142
	//	               9 133
		   goto _L1 _L2 _L3 _L4 _L3 _L3 _L4 _L2 _L5 _L6
_L5:
		break MISSING_BLOCK_LABEL_142;
_L2:
		break; /* Loop/switch isn't completed */
_L3:
		break; /* Loop/switch isn't completed */
_L1:
		fragment = fragment1;
	//   20   88:aload           4
	//   21   90:astore_2        
_L9:
		i++;
	//   22   91:iload_3         
	//   23   92:iconst_1        
	//   24   93:iadd            
	//   25   94:istore_3        
		fragment1 = fragment;
	//   26   95:aload_2         
	//   27   96:astore          4
		if(true) goto _L8; else goto _L7
	//   28   98:goto            5
_L7:
		arraylist.remove(((Object) (op.fragment)));
	//   29  101:aload_1         
	//   30  102:aload           5
	//   31  104:getfield        #203 <Field Fragment BackStackRecord$Op.fragment>
	//   32  107:invokevirtual   #522 <Method boolean ArrayList.remove(Object)>
	//   33  110:pop             
		fragment = fragment1;
	//   34  111:aload           4
	//   35  113:astore_2        
		  goto _L9
	//*  36  114:goto            91
_L4:
		arraylist.add(((Object) (op.fragment)));
	//   37  117:aload_1         
	//   38  118:aload           5
	//   39  120:getfield        #203 <Field Fragment BackStackRecord$Op.fragment>
	//   40  123:invokevirtual   #227 <Method boolean ArrayList.add(Object)>
	//   41  126:pop             
		fragment = fragment1;
	//   42  127:aload           4
	//   43  129:astore_2        
		  goto _L9
	//*  44  130:goto            91
_L6:
		fragment = op.fragment;
	//   45  133:aload           5
	//   46  135:getfield        #203 <Field Fragment BackStackRecord$Op.fragment>
	//   47  138:astore_2        
		  goto _L9
	//*  48  139:goto            91
		fragment = null;
	//   49  142:aconst_null     
	//   50  143:astore_2        
		  goto _L9
	//*  51  144:goto            91
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
	boolean mReorderingAllowed;
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
	//*   2    5:icmplt          15
			flag = true;
	//    3    8:iconst_1        
	//    4    9:istore_0        
		else
	//*   5   10:iload_0         
	//*   6   11:putstatic       #74  <Field boolean SUPPORTS_TRANSITIONS>
	//*   7   14:return          
			flag = false;
	//    8   15:iconst_0        
	//    9   16:istore_0        
		SUPPORTS_TRANSITIONS = flag;
	//*  10   17:goto            10
	}
}

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
//			FragmentTransaction, Fragment, FragmentTransition, FragmentManagerImpl, 
//			FragmentHostCallback

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
	//    1    1:invokespecial   #69  <Method void FragmentTransaction()>
		mOps = new ArrayList();
	//    2    4:aload_0         
	//    3    5:new             #71  <Class ArrayList>
	//    4    8:dup             
	//    5    9:invokespecial   #72  <Method void ArrayList()>
	//    6   12:putfield        #74  <Field ArrayList mOps>
		mAllowAddToBackStack = true;
	//    7   15:aload_0         
	//    8   16:iconst_1        
	//    9   17:putfield        #76  <Field boolean mAllowAddToBackStack>
		mIndex = -1;
	//   10   20:aload_0         
	//   11   21:iconst_m1       
	//   12   22:putfield        #78  <Field int mIndex>
		mReorderingAllowed = false;
	//   13   25:aload_0         
	//   14   26:iconst_0        
	//   15   27:putfield        #80  <Field boolean mReorderingAllowed>
		mManager = fragmentmanagerimpl;
	//   16   30:aload_0         
	//   17   31:aload_1         
	//   18   32:putfield        #82  <Field FragmentManagerImpl mManager>
	//   19   35:return          
	}

	private void doAddOp(int i, Fragment fragment, String s, int j)
	{
		Object obj = ((Object) (((Object) (fragment)).getClass()));
	//    0    0:aload_2         
	//    1    1:invokevirtual   #91  <Method Class Object.getClass()>
	//    2    4:astore          6
		int k = ((Class) (obj)).getModifiers();
	//    3    6:aload           6
	//    4    8:invokevirtual   #97  <Method int Class.getModifiers()>
	//    5   11:istore          5
		if(!((Class) (obj)).isAnonymousClass() && Modifier.isPublic(k) && (!((Class) (obj)).isMemberClass() || Modifier.isStatic(k)))
	//*   6   13:aload           6
	//*   7   15:invokevirtual   #101 <Method boolean Class.isAnonymousClass()>
	//*   8   18:ifne            324
	//*   9   21:iload           5
	//*  10   23:invokestatic    #107 <Method boolean Modifier.isPublic(int)>
	//*  11   26:ifeq            324
	//*  12   29:aload           6
	//*  13   31:invokevirtual   #110 <Method boolean Class.isMemberClass()>
	//*  14   34:ifeq            48
	//*  15   37:iload           5
	//*  16   39:invokestatic    #113 <Method boolean Modifier.isStatic(int)>
	//*  17   42:ifne            48
	//*  18   45:goto            324
		{
			fragment.mFragmentManager = mManager;
	//   19   48:aload_2         
	//   20   49:aload_0         
	//   21   50:getfield        #82  <Field FragmentManagerImpl mManager>
	//   22   53:putfield        #118 <Field FragmentManagerImpl Fragment.mFragmentManager>
			if(s != null)
	//*  23   56:aload_3         
	//*  24   57:ifnull          153
			{
				if(fragment.mTag != null && !s.equals(((Object) (fragment.mTag))))
	//*  25   60:aload_2         
	//*  26   61:getfield        #121 <Field String Fragment.mTag>
	//*  27   64:ifnull          148
	//*  28   67:aload_3         
	//*  29   68:aload_2         
	//*  30   69:getfield        #121 <Field String Fragment.mTag>
	//*  31   72:invokevirtual   #127 <Method boolean String.equals(Object)>
	//*  32   75:ifne            148
				{
					obj = ((Object) (new StringBuilder()));
	//   33   78:new             #129 <Class StringBuilder>
	//   34   81:dup             
	//   35   82:invokespecial   #130 <Method void StringBuilder()>
	//   36   85:astore          6
					((StringBuilder) (obj)).append("Can't change tag of fragment ");
	//   37   87:aload           6
	//   38   89:ldc1            #132 <String "Can't change tag of fragment ">
	//   39   91:invokevirtual   #136 <Method StringBuilder StringBuilder.append(String)>
	//   40   94:pop             
					((StringBuilder) (obj)).append(((Object) (fragment)));
	//   41   95:aload           6
	//   42   97:aload_2         
	//   43   98:invokevirtual   #139 <Method StringBuilder StringBuilder.append(Object)>
	//   44  101:pop             
					((StringBuilder) (obj)).append(": was ");
	//   45  102:aload           6
	//   46  104:ldc1            #141 <String ": was ">
	//   47  106:invokevirtual   #136 <Method StringBuilder StringBuilder.append(String)>
	//   48  109:pop             
					((StringBuilder) (obj)).append(fragment.mTag);
	//   49  110:aload           6
	//   50  112:aload_2         
	//   51  113:getfield        #121 <Field String Fragment.mTag>
	//   52  116:invokevirtual   #136 <Method StringBuilder StringBuilder.append(String)>
	//   53  119:pop             
					((StringBuilder) (obj)).append(" now ");
	//   54  120:aload           6
	//   55  122:ldc1            #143 <String " now ">
	//   56  124:invokevirtual   #136 <Method StringBuilder StringBuilder.append(String)>
	//   57  127:pop             
					((StringBuilder) (obj)).append(s);
	//   58  128:aload           6
	//   59  130:aload_3         
	//   60  131:invokevirtual   #136 <Method StringBuilder StringBuilder.append(String)>
	//   61  134:pop             
					throw new IllegalStateException(((StringBuilder) (obj)).toString());
	//   62  135:new             #145 <Class IllegalStateException>
	//   63  138:dup             
	//   64  139:aload           6
	//   65  141:invokevirtual   #149 <Method String StringBuilder.toString()>
	//   66  144:invokespecial   #152 <Method void IllegalStateException(String)>
	//   67  147:athrow          
				}
				fragment.mTag = s;
	//   68  148:aload_2         
	//   69  149:aload_3         
	//   70  150:putfield        #121 <Field String Fragment.mTag>
			}
			if(i != 0)
	//*  71  153:iload_1         
	//*  72  154:ifeq            309
			{
				if(i == -1)
	//*  73  157:iload_1         
	//*  74  158:iconst_m1       
	//*  75  159:icmpne          222
				{
					obj = ((Object) (new StringBuilder()));
	//   76  162:new             #129 <Class StringBuilder>
	//   77  165:dup             
	//   78  166:invokespecial   #130 <Method void StringBuilder()>
	//   79  169:astore          6
					((StringBuilder) (obj)).append("Can't add fragment ");
	//   80  171:aload           6
	//   81  173:ldc1            #154 <String "Can't add fragment ">
	//   82  175:invokevirtual   #136 <Method StringBuilder StringBuilder.append(String)>
	//   83  178:pop             
					((StringBuilder) (obj)).append(((Object) (fragment)));
	//   84  179:aload           6
	//   85  181:aload_2         
	//   86  182:invokevirtual   #139 <Method StringBuilder StringBuilder.append(Object)>
	//   87  185:pop             
					((StringBuilder) (obj)).append(" with tag ");
	//   88  186:aload           6
	//   89  188:ldc1            #156 <String " with tag ">
	//   90  190:invokevirtual   #136 <Method StringBuilder StringBuilder.append(String)>
	//   91  193:pop             
					((StringBuilder) (obj)).append(s);
	//   92  194:aload           6
	//   93  196:aload_3         
	//   94  197:invokevirtual   #136 <Method StringBuilder StringBuilder.append(String)>
	//   95  200:pop             
					((StringBuilder) (obj)).append(" to container view with no id");
	//   96  201:aload           6
	//   97  203:ldc1            #158 <String " to container view with no id">
	//   98  205:invokevirtual   #136 <Method StringBuilder StringBuilder.append(String)>
	//   99  208:pop             
					throw new IllegalArgumentException(((StringBuilder) (obj)).toString());
	//  100  209:new             #160 <Class IllegalArgumentException>
	//  101  212:dup             
	//  102  213:aload           6
	//  103  215:invokevirtual   #149 <Method String StringBuilder.toString()>
	//  104  218:invokespecial   #161 <Method void IllegalArgumentException(String)>
	//  105  221:athrow          
				}
				if(fragment.mFragmentId != 0 && fragment.mFragmentId != i)
	//* 106  222:aload_2         
	//* 107  223:getfield        #164 <Field int Fragment.mFragmentId>
	//* 108  226:ifeq            299
	//* 109  229:aload_2         
	//* 110  230:getfield        #164 <Field int Fragment.mFragmentId>
	//* 111  233:iload_1         
	//* 112  234:icmpeq          299
				{
					s = ((String) (new StringBuilder()));
	//  113  237:new             #129 <Class StringBuilder>
	//  114  240:dup             
	//  115  241:invokespecial   #130 <Method void StringBuilder()>
	//  116  244:astore_3        
					((StringBuilder) (s)).append("Can't change container ID of fragment ");
	//  117  245:aload_3         
	//  118  246:ldc1            #166 <String "Can't change container ID of fragment ">
	//  119  248:invokevirtual   #136 <Method StringBuilder StringBuilder.append(String)>
	//  120  251:pop             
					((StringBuilder) (s)).append(((Object) (fragment)));
	//  121  252:aload_3         
	//  122  253:aload_2         
	//  123  254:invokevirtual   #139 <Method StringBuilder StringBuilder.append(Object)>
	//  124  257:pop             
					((StringBuilder) (s)).append(": was ");
	//  125  258:aload_3         
	//  126  259:ldc1            #141 <String ": was ">
	//  127  261:invokevirtual   #136 <Method StringBuilder StringBuilder.append(String)>
	//  128  264:pop             
					((StringBuilder) (s)).append(fragment.mFragmentId);
	//  129  265:aload_3         
	//  130  266:aload_2         
	//  131  267:getfield        #164 <Field int Fragment.mFragmentId>
	//  132  270:invokevirtual   #169 <Method StringBuilder StringBuilder.append(int)>
	//  133  273:pop             
					((StringBuilder) (s)).append(" now ");
	//  134  274:aload_3         
	//  135  275:ldc1            #143 <String " now ">
	//  136  277:invokevirtual   #136 <Method StringBuilder StringBuilder.append(String)>
	//  137  280:pop             
					((StringBuilder) (s)).append(i);
	//  138  281:aload_3         
	//  139  282:iload_1         
	//  140  283:invokevirtual   #169 <Method StringBuilder StringBuilder.append(int)>
	//  141  286:pop             
					throw new IllegalStateException(((StringBuilder) (s)).toString());
	//  142  287:new             #145 <Class IllegalStateException>
	//  143  290:dup             
	//  144  291:aload_3         
	//  145  292:invokevirtual   #149 <Method String StringBuilder.toString()>
	//  146  295:invokespecial   #152 <Method void IllegalStateException(String)>
	//  147  298:athrow          
				}
				fragment.mFragmentId = i;
	//  148  299:aload_2         
	//  149  300:iload_1         
	//  150  301:putfield        #164 <Field int Fragment.mFragmentId>
				fragment.mContainerId = i;
	//  151  304:aload_2         
	//  152  305:iload_1         
	//  153  306:putfield        #172 <Field int Fragment.mContainerId>
			}
			addOp(new Op(j, fragment));
	//  154  309:aload_0         
	//  155  310:new             #10  <Class BackStackRecord$Op>
	//  156  313:dup             
	//  157  314:iload           4
	//  158  316:aload_2         
	//  159  317:invokespecial   #175 <Method void BackStackRecord$Op(int, Fragment)>
	//  160  320:invokevirtual   #179 <Method void addOp(BackStackRecord$Op)>
			return;
	//  161  323:return          
		} else
		{
			fragment = ((Fragment) (new StringBuilder()));
	//  162  324:new             #129 <Class StringBuilder>
	//  163  327:dup             
	//  164  328:invokespecial   #130 <Method void StringBuilder()>
	//  165  331:astore_2        
			((StringBuilder) (fragment)).append("Fragment ");
	//  166  332:aload_2         
	//  167  333:ldc1            #181 <String "Fragment ">
	//  168  335:invokevirtual   #136 <Method StringBuilder StringBuilder.append(String)>
	//  169  338:pop             
			((StringBuilder) (fragment)).append(((Class) (obj)).getCanonicalName());
	//  170  339:aload_2         
	//  171  340:aload           6
	//  172  342:invokevirtual   #184 <Method String Class.getCanonicalName()>
	//  173  345:invokevirtual   #136 <Method StringBuilder StringBuilder.append(String)>
	//  174  348:pop             
			((StringBuilder) (fragment)).append(" must be a public static class to be  properly recreated from");
	//  175  349:aload_2         
	//  176  350:ldc1            #186 <String " must be a public static class to be  properly recreated from">
	//  177  352:invokevirtual   #136 <Method StringBuilder StringBuilder.append(String)>
	//  178  355:pop             
			((StringBuilder) (fragment)).append(" instance state.");
	//  179  356:aload_2         
	//  180  357:ldc1            #188 <String " instance state.">
	//  181  359:invokevirtual   #136 <Method StringBuilder StringBuilder.append(String)>
	//  182  362:pop             
			throw new IllegalStateException(((StringBuilder) (fragment)).toString());
	//  183  363:new             #145 <Class IllegalStateException>
	//  184  366:dup             
	//  185  367:aload_2         
	//  186  368:invokevirtual   #149 <Method String StringBuilder.toString()>
	//  187  371:invokespecial   #152 <Method void IllegalStateException(String)>
	//  188  374:athrow          
		}
	}

	private static boolean isFragmentPostponed(Op op)
	{
		op = ((Op) (op.fragment));
	//    0    0:aload_0         
	//    1    1:getfield        #194 <Field Fragment BackStackRecord$Op.fragment>
	//    2    4:astore_0        
		return op != null && ((Fragment) (op)).mAdded && ((Fragment) (op)).mView != null && !((Fragment) (op)).mDetached && !((Fragment) (op)).mHidden && ((Fragment) (op)).isPostponed();
	//    3    5:aload_0         
	//    4    6:ifnull          46
	//    5    9:aload_0         
	//    6   10:getfield        #197 <Field boolean Fragment.mAdded>
	//    7   13:ifeq            46
	//    8   16:aload_0         
	//    9   17:getfield        #201 <Field View Fragment.mView>
	//   10   20:ifnull          46
	//   11   23:aload_0         
	//   12   24:getfield        #204 <Field boolean Fragment.mDetached>
	//   13   27:ifne            46
	//   14   30:aload_0         
	//   15   31:getfield        #207 <Field boolean Fragment.mHidden>
	//   16   34:ifne            46
	//   17   37:aload_0         
	//   18   38:invokevirtual   #210 <Method boolean Fragment.isPostponed()>
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
	//    5    5:invokespecial   #214 <Method void doAddOp(int, Fragment, String, int)>
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
	//    5    5:invokespecial   #214 <Method void doAddOp(int, Fragment, String, int)>
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
	//    5    5:invokespecial   #214 <Method void doAddOp(int, Fragment, String, int)>
		return ((FragmentTransaction) (this));
	//    6    8:aload_0         
	//    7    9:areturn         
	}

	void addOp(Op op)
	{
		mOps.add(((Object) (op)));
	//    0    0:aload_0         
	//    1    1:getfield        #74  <Field ArrayList mOps>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #218 <Method boolean ArrayList.add(Object)>
	//    4    8:pop             
		op.enterAnim = mEnterAnim;
	//    5    9:aload_1         
	//    6   10:aload_0         
	//    7   11:getfield        #220 <Field int mEnterAnim>
	//    8   14:putfield        #223 <Field int BackStackRecord$Op.enterAnim>
		op.exitAnim = mExitAnim;
	//    9   17:aload_1         
	//   10   18:aload_0         
	//   11   19:getfield        #225 <Field int mExitAnim>
	//   12   22:putfield        #228 <Field int BackStackRecord$Op.exitAnim>
		op.popEnterAnim = mPopEnterAnim;
	//   13   25:aload_1         
	//   14   26:aload_0         
	//   15   27:getfield        #230 <Field int mPopEnterAnim>
	//   16   30:putfield        #233 <Field int BackStackRecord$Op.popEnterAnim>
		op.popExitAnim = mPopExitAnim;
	//   17   33:aload_1         
	//   18   34:aload_0         
	//   19   35:getfield        #235 <Field int mPopExitAnim>
	//   20   38:putfield        #238 <Field int BackStackRecord$Op.popExitAnim>
	//   21   41:return          
	}

	public FragmentTransaction addSharedElement(View view, String s)
	{
		if(FragmentTransition.supportsTransition())
	//*   0    0:invokestatic    #245 <Method boolean FragmentTransition.supportsTransition()>
	//*   1    3:ifeq            181
		{
			view = ((View) (ViewCompat.getTransitionName(view)));
	//    2    6:aload_1         
	//    3    7:invokestatic    #251 <Method String ViewCompat.getTransitionName(View)>
	//    4   10:astore_1        
			if(view == null)
	//*   5   11:aload_1         
	//*   6   12:ifnonnull       25
				throw new IllegalArgumentException("Unique transitionNames are required for all sharedElements");
	//    7   15:new             #160 <Class IllegalArgumentException>
	//    8   18:dup             
	//    9   19:ldc1            #253 <String "Unique transitionNames are required for all sharedElements">
	//   10   21:invokespecial   #161 <Method void IllegalArgumentException(String)>
	//   11   24:athrow          
			if(mSharedElementSourceNames == null)
	//*  12   25:aload_0         
	//*  13   26:getfield        #255 <Field ArrayList mSharedElementSourceNames>
	//*  14   29:ifnonnull       57
			{
				mSharedElementSourceNames = new ArrayList();
	//   15   32:aload_0         
	//   16   33:new             #71  <Class ArrayList>
	//   17   36:dup             
	//   18   37:invokespecial   #72  <Method void ArrayList()>
	//   19   40:putfield        #255 <Field ArrayList mSharedElementSourceNames>
				mSharedElementTargetNames = new ArrayList();
	//   20   43:aload_0         
	//   21   44:new             #71  <Class ArrayList>
	//   22   47:dup             
	//   23   48:invokespecial   #72  <Method void ArrayList()>
	//   24   51:putfield        #257 <Field ArrayList mSharedElementTargetNames>
			} else
	//*  25   54:goto            163
			{
				if(mSharedElementTargetNames.contains(((Object) (s))))
	//*  26   57:aload_0         
	//*  27   58:getfield        #257 <Field ArrayList mSharedElementTargetNames>
	//*  28   61:aload_2         
	//*  29   62:invokevirtual   #260 <Method boolean ArrayList.contains(Object)>
	//*  30   65:ifeq            110
				{
					view = ((View) (new StringBuilder()));
	//   31   68:new             #129 <Class StringBuilder>
	//   32   71:dup             
	//   33   72:invokespecial   #130 <Method void StringBuilder()>
	//   34   75:astore_1        
					((StringBuilder) (view)).append("A shared element with the target name '");
	//   35   76:aload_1         
	//   36   77:ldc2            #262 <String "A shared element with the target name '">
	//   37   80:invokevirtual   #136 <Method StringBuilder StringBuilder.append(String)>
	//   38   83:pop             
					((StringBuilder) (view)).append(s);
	//   39   84:aload_1         
	//   40   85:aload_2         
	//   41   86:invokevirtual   #136 <Method StringBuilder StringBuilder.append(String)>
	//   42   89:pop             
					((StringBuilder) (view)).append("' has already been added to the transaction.");
	//   43   90:aload_1         
	//   44   91:ldc2            #264 <String "' has already been added to the transaction.">
	//   45   94:invokevirtual   #136 <Method StringBuilder StringBuilder.append(String)>
	//   46   97:pop             
					throw new IllegalArgumentException(((StringBuilder) (view)).toString());
	//   47   98:new             #160 <Class IllegalArgumentException>
	//   48  101:dup             
	//   49  102:aload_1         
	//   50  103:invokevirtual   #149 <Method String StringBuilder.toString()>
	//   51  106:invokespecial   #161 <Method void IllegalArgumentException(String)>
	//   52  109:athrow          
				}
				if(mSharedElementSourceNames.contains(((Object) (view))))
	//*  53  110:aload_0         
	//*  54  111:getfield        #255 <Field ArrayList mSharedElementSourceNames>
	//*  55  114:aload_1         
	//*  56  115:invokevirtual   #260 <Method boolean ArrayList.contains(Object)>
	//*  57  118:ifeq            163
				{
					s = ((String) (new StringBuilder()));
	//   58  121:new             #129 <Class StringBuilder>
	//   59  124:dup             
	//   60  125:invokespecial   #130 <Method void StringBuilder()>
	//   61  128:astore_2        
					((StringBuilder) (s)).append("A shared element with the source name '");
	//   62  129:aload_2         
	//   63  130:ldc2            #266 <String "A shared element with the source name '">
	//   64  133:invokevirtual   #136 <Method StringBuilder StringBuilder.append(String)>
	//   65  136:pop             
					((StringBuilder) (s)).append(((String) (view)));
	//   66  137:aload_2         
	//   67  138:aload_1         
	//   68  139:invokevirtual   #136 <Method StringBuilder StringBuilder.append(String)>
	//   69  142:pop             
					((StringBuilder) (s)).append(" has already been added to the transaction.");
	//   70  143:aload_2         
	//   71  144:ldc2            #268 <String " has already been added to the transaction.">
	//   72  147:invokevirtual   #136 <Method StringBuilder StringBuilder.append(String)>
	//   73  150:pop             
					throw new IllegalArgumentException(((StringBuilder) (s)).toString());
	//   74  151:new             #160 <Class IllegalArgumentException>
	//   75  154:dup             
	//   76  155:aload_2         
	//   77  156:invokevirtual   #149 <Method String StringBuilder.toString()>
	//   78  159:invokespecial   #161 <Method void IllegalArgumentException(String)>
	//   79  162:athrow          
				}
			}
			mSharedElementSourceNames.add(((Object) (view)));
	//   80  163:aload_0         
	//   81  164:getfield        #255 <Field ArrayList mSharedElementSourceNames>
	//   82  167:aload_1         
	//   83  168:invokevirtual   #218 <Method boolean ArrayList.add(Object)>
	//   84  171:pop             
			mSharedElementTargetNames.add(((Object) (s)));
	//   85  172:aload_0         
	//   86  173:getfield        #257 <Field ArrayList mSharedElementTargetNames>
	//   87  176:aload_2         
	//   88  177:invokevirtual   #218 <Method boolean ArrayList.add(Object)>
	//   89  180:pop             
		}
		return ((FragmentTransaction) (this));
	//   90  181:aload_0         
	//   91  182:areturn         
	}

	public FragmentTransaction addToBackStack(String s)
	{
		if(!mAllowAddToBackStack)
	//*   0    0:aload_0         
	//*   1    1:getfield        #76  <Field boolean mAllowAddToBackStack>
	//*   2    4:ifne            18
		{
			throw new IllegalStateException("This FragmentTransaction is not allowed to be added to the back stack.");
	//    3    7:new             #145 <Class IllegalStateException>
	//    4   10:dup             
	//    5   11:ldc2            #272 <String "This FragmentTransaction is not allowed to be added to the back stack.">
	//    6   14:invokespecial   #152 <Method void IllegalStateException(String)>
	//    7   17:athrow          
		} else
		{
			mAddToBackStack = true;
	//    8   18:aload_0         
	//    9   19:iconst_1        
	//   10   20:putfield        #274 <Field boolean mAddToBackStack>
			mName = s;
	//   11   23:aload_0         
	//   12   24:aload_1         
	//   13   25:putfield        #276 <Field String mName>
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
	//    5    8:invokespecial   #175 <Method void BackStackRecord$Op(int, Fragment)>
	//    6   11:invokevirtual   #179 <Method void addOp(BackStackRecord$Op)>
		return ((FragmentTransaction) (this));
	//    7   14:aload_0         
	//    8   15:areturn         
	}

	void bumpBackStackNesting(int i)
	{
		if(!mAddToBackStack)
	//*   0    0:aload_0         
	//*   1    1:getfield        #274 <Field boolean mAddToBackStack>
	//*   2    4:ifne            8
			return;
	//    3    7:return          
		if(FragmentManagerImpl.DEBUG)
	//*   4    8:getstatic       #285 <Field boolean FragmentManagerImpl.DEBUG>
	//*   5   11:ifeq            66
		{
			StringBuilder stringbuilder = new StringBuilder();
	//    6   14:new             #129 <Class StringBuilder>
	//    7   17:dup             
	//    8   18:invokespecial   #130 <Method void StringBuilder()>
	//    9   21:astore          4
			stringbuilder.append("Bump nesting in ");
	//   10   23:aload           4
	//   11   25:ldc2            #287 <String "Bump nesting in ">
	//   12   28:invokevirtual   #136 <Method StringBuilder StringBuilder.append(String)>
	//   13   31:pop             
			stringbuilder.append(((Object) (this)));
	//   14   32:aload           4
	//   15   34:aload_0         
	//   16   35:invokevirtual   #139 <Method StringBuilder StringBuilder.append(Object)>
	//   17   38:pop             
			stringbuilder.append(" by ");
	//   18   39:aload           4
	//   19   41:ldc2            #289 <String " by ">
	//   20   44:invokevirtual   #136 <Method StringBuilder StringBuilder.append(String)>
	//   21   47:pop             
			stringbuilder.append(i);
	//   22   48:aload           4
	//   23   50:iload_1         
	//   24   51:invokevirtual   #169 <Method StringBuilder StringBuilder.append(int)>
	//   25   54:pop             
			Log.v("FragmentManager", stringbuilder.toString());
	//   26   55:ldc1            #36  <String "FragmentManager">
	//   27   57:aload           4
	//   28   59:invokevirtual   #149 <Method String StringBuilder.toString()>
	//   29   62:invokestatic    #295 <Method int Log.v(String, String)>
	//   30   65:pop             
		}
		int k = mOps.size();
	//   31   66:aload_0         
	//   32   67:getfield        #74  <Field ArrayList mOps>
	//   33   70:invokevirtual   #298 <Method int ArrayList.size()>
	//   34   73:istore_3        
		for(int j = 0; j < k; j++)
	//*  35   74:iconst_0        
	//*  36   75:istore_2        
	//*  37   76:iload_2         
	//*  38   77:iload_3         
	//*  39   78:icmpge          197
		{
			Op op = (Op)mOps.get(j);
	//   40   81:aload_0         
	//   41   82:getfield        #74  <Field ArrayList mOps>
	//   42   85:iload_2         
	//   43   86:invokevirtual   #302 <Method Object ArrayList.get(int)>
	//   44   89:checkcast       #10  <Class BackStackRecord$Op>
	//   45   92:astore          4
			if(op.fragment == null)
				continue;
	//   46   94:aload           4
	//   47   96:getfield        #194 <Field Fragment BackStackRecord$Op.fragment>
	//   48   99:ifnull          190
			Fragment fragment = op.fragment;
	//   49  102:aload           4
	//   50  104:getfield        #194 <Field Fragment BackStackRecord$Op.fragment>
	//   51  107:astore          5
			fragment.mBackStackNesting = fragment.mBackStackNesting + i;
	//   52  109:aload           5
	//   53  111:aload           5
	//   54  113:getfield        #305 <Field int Fragment.mBackStackNesting>
	//   55  116:iload_1         
	//   56  117:iadd            
	//   57  118:putfield        #305 <Field int Fragment.mBackStackNesting>
			if(FragmentManagerImpl.DEBUG)
	//*  58  121:getstatic       #285 <Field boolean FragmentManagerImpl.DEBUG>
	//*  59  124:ifeq            190
			{
				StringBuilder stringbuilder1 = new StringBuilder();
	//   60  127:new             #129 <Class StringBuilder>
	//   61  130:dup             
	//   62  131:invokespecial   #130 <Method void StringBuilder()>
	//   63  134:astore          5
				stringbuilder1.append("Bump nesting of ");
	//   64  136:aload           5
	//   65  138:ldc2            #307 <String "Bump nesting of ">
	//   66  141:invokevirtual   #136 <Method StringBuilder StringBuilder.append(String)>
	//   67  144:pop             
				stringbuilder1.append(((Object) (op.fragment)));
	//   68  145:aload           5
	//   69  147:aload           4
	//   70  149:getfield        #194 <Field Fragment BackStackRecord$Op.fragment>
	//   71  152:invokevirtual   #139 <Method StringBuilder StringBuilder.append(Object)>
	//   72  155:pop             
				stringbuilder1.append(" to ");
	//   73  156:aload           5
	//   74  158:ldc2            #309 <String " to ">
	//   75  161:invokevirtual   #136 <Method StringBuilder StringBuilder.append(String)>
	//   76  164:pop             
				stringbuilder1.append(op.fragment.mBackStackNesting);
	//   77  165:aload           5
	//   78  167:aload           4
	//   79  169:getfield        #194 <Field Fragment BackStackRecord$Op.fragment>
	//   80  172:getfield        #305 <Field int Fragment.mBackStackNesting>
	//   81  175:invokevirtual   #169 <Method StringBuilder StringBuilder.append(int)>
	//   82  178:pop             
				Log.v("FragmentManager", stringbuilder1.toString());
	//   83  179:ldc1            #36  <String "FragmentManager">
	//   84  181:aload           5
	//   85  183:invokevirtual   #149 <Method String StringBuilder.toString()>
	//   86  186:invokestatic    #295 <Method int Log.v(String, String)>
	//   87  189:pop             
			}
		}

	//   88  190:iload_2         
	//   89  191:iconst_1        
	//   90  192:iadd            
	//   91  193:istore_2        
	//*  92  194:goto            76
	//   93  197:return          
	}

	public int commit()
	{
		return commitInternal(false);
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:invokevirtual   #314 <Method int commitInternal(boolean)>
	//    3    5:ireturn         
	}

	public int commitAllowingStateLoss()
	{
		return commitInternal(true);
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:invokevirtual   #314 <Method int commitInternal(boolean)>
	//    3    5:ireturn         
	}

	int commitInternal(boolean flag)
	{
		if(mCommitted)
	//*   0    0:aload_0         
	//*   1    1:getfield        #317 <Field boolean mCommitted>
	//*   2    4:ifeq            18
			throw new IllegalStateException("commit already called");
	//    3    7:new             #145 <Class IllegalStateException>
	//    4   10:dup             
	//    5   11:ldc2            #319 <String "commit already called">
	//    6   14:invokespecial   #152 <Method void IllegalStateException(String)>
	//    7   17:athrow          
		if(FragmentManagerImpl.DEBUG)
	//*   8   18:getstatic       #285 <Field boolean FragmentManagerImpl.DEBUG>
	//*   9   21:ifeq            87
		{
			Object obj = ((Object) (new StringBuilder()));
	//   10   24:new             #129 <Class StringBuilder>
	//   11   27:dup             
	//   12   28:invokespecial   #130 <Method void StringBuilder()>
	//   13   31:astore_2        
			((StringBuilder) (obj)).append("Commit: ");
	//   14   32:aload_2         
	//   15   33:ldc2            #321 <String "Commit: ">
	//   16   36:invokevirtual   #136 <Method StringBuilder StringBuilder.append(String)>
	//   17   39:pop             
			((StringBuilder) (obj)).append(((Object) (this)));
	//   18   40:aload_2         
	//   19   41:aload_0         
	//   20   42:invokevirtual   #139 <Method StringBuilder StringBuilder.append(Object)>
	//   21   45:pop             
			Log.v("FragmentManager", ((StringBuilder) (obj)).toString());
	//   22   46:ldc1            #36  <String "FragmentManager">
	//   23   48:aload_2         
	//   24   49:invokevirtual   #149 <Method String StringBuilder.toString()>
	//   25   52:invokestatic    #295 <Method int Log.v(String, String)>
	//   26   55:pop             
			obj = ((Object) (new PrintWriter(((java.io.Writer) (new LogWriter("FragmentManager"))))));
	//   27   56:new             #323 <Class PrintWriter>
	//   28   59:dup             
	//   29   60:new             #325 <Class LogWriter>
	//   30   63:dup             
	//   31   64:ldc1            #36  <String "FragmentManager">
	//   32   66:invokespecial   #326 <Method void LogWriter(String)>
	//   33   69:invokespecial   #329 <Method void PrintWriter(java.io.Writer)>
	//   34   72:astore_2        
			dump("  ", ((FileDescriptor) (null)), ((PrintWriter) (obj)), ((String []) (null)));
	//   35   73:aload_0         
	//   36   74:ldc2            #331 <String "  ">
	//   37   77:aconst_null     
	//   38   78:aload_2         
	//   39   79:aconst_null     
	//   40   80:invokevirtual   #335 <Method void dump(String, FileDescriptor, PrintWriter, String[])>
			((PrintWriter) (obj)).close();
	//   41   83:aload_2         
	//   42   84:invokevirtual   #338 <Method void PrintWriter.close()>
		}
		mCommitted = true;
	//   43   87:aload_0         
	//   44   88:iconst_1        
	//   45   89:putfield        #317 <Field boolean mCommitted>
		if(mAddToBackStack)
	//*  46   92:aload_0         
	//*  47   93:getfield        #274 <Field boolean mAddToBackStack>
	//*  48   96:ifeq            114
			mIndex = mManager.allocBackStackIndex(this);
	//   49   99:aload_0         
	//   50  100:aload_0         
	//   51  101:getfield        #82  <Field FragmentManagerImpl mManager>
	//   52  104:aload_0         
	//   53  105:invokevirtual   #342 <Method int FragmentManagerImpl.allocBackStackIndex(BackStackRecord)>
	//   54  108:putfield        #78  <Field int mIndex>
		else
	//*  55  111:goto            119
			mIndex = -1;
	//   56  114:aload_0         
	//   57  115:iconst_m1       
	//   58  116:putfield        #78  <Field int mIndex>
		mManager.enqueueAction(((FragmentManagerImpl.OpGenerator) (this)), flag);
	//   59  119:aload_0         
	//   60  120:getfield        #82  <Field FragmentManagerImpl mManager>
	//   61  123:aload_0         
	//   62  124:iload_1         
	//   63  125:invokevirtual   #346 <Method void FragmentManagerImpl.enqueueAction(FragmentManagerImpl$OpGenerator, boolean)>
		return mIndex;
	//   64  128:aload_0         
	//   65  129:getfield        #78  <Field int mIndex>
	//   66  132:ireturn         
	}

	public void commitNow()
	{
		disallowAddToBackStack();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #351 <Method FragmentTransaction disallowAddToBackStack()>
	//    2    4:pop             
		mManager.execSingleAction(((FragmentManagerImpl.OpGenerator) (this)), false);
	//    3    5:aload_0         
	//    4    6:getfield        #82  <Field FragmentManagerImpl mManager>
	//    5    9:aload_0         
	//    6   10:iconst_0        
	//    7   11:invokevirtual   #354 <Method void FragmentManagerImpl.execSingleAction(FragmentManagerImpl$OpGenerator, boolean)>
	//    8   14:return          
	}

	public void commitNowAllowingStateLoss()
	{
		disallowAddToBackStack();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #351 <Method FragmentTransaction disallowAddToBackStack()>
	//    2    4:pop             
		mManager.execSingleAction(((FragmentManagerImpl.OpGenerator) (this)), true);
	//    3    5:aload_0         
	//    4    6:getfield        #82  <Field FragmentManagerImpl mManager>
	//    5    9:aload_0         
	//    6   10:iconst_1        
	//    7   11:invokevirtual   #354 <Method void FragmentManagerImpl.execSingleAction(FragmentManagerImpl$OpGenerator, boolean)>
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
	//    5    8:invokespecial   #175 <Method void BackStackRecord$Op(int, Fragment)>
	//    6   11:invokevirtual   #179 <Method void addOp(BackStackRecord$Op)>
		return ((FragmentTransaction) (this));
	//    7   14:aload_0         
	//    8   15:areturn         
	}

	public FragmentTransaction disallowAddToBackStack()
	{
		if(mAddToBackStack)
	//*   0    0:aload_0         
	//*   1    1:getfield        #274 <Field boolean mAddToBackStack>
	//*   2    4:ifeq            18
		{
			throw new IllegalStateException("This transaction is already being added to the back stack");
	//    3    7:new             #145 <Class IllegalStateException>
	//    4   10:dup             
	//    5   11:ldc2            #358 <String "This transaction is already being added to the back stack">
	//    6   14:invokespecial   #152 <Method void IllegalStateException(String)>
	//    7   17:athrow          
		} else
		{
			mAllowAddToBackStack = false;
	//    8   18:aload_0         
	//    9   19:iconst_0        
	//   10   20:putfield        #76  <Field boolean mAllowAddToBackStack>
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
	//    4    4:invokevirtual   #361 <Method void dump(String, PrintWriter, boolean)>
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
	//    4    6:invokevirtual   #364 <Method void PrintWriter.print(String)>
			printwriter.print("mName=");
	//    5    9:aload_2         
	//    6   10:ldc2            #366 <String "mName=">
	//    7   13:invokevirtual   #364 <Method void PrintWriter.print(String)>
			printwriter.print(mName);
	//    8   16:aload_2         
	//    9   17:aload_0         
	//   10   18:getfield        #276 <Field String mName>
	//   11   21:invokevirtual   #364 <Method void PrintWriter.print(String)>
			printwriter.print(" mIndex=");
	//   12   24:aload_2         
	//   13   25:ldc2            #368 <String " mIndex=">
	//   14   28:invokevirtual   #364 <Method void PrintWriter.print(String)>
			printwriter.print(mIndex);
	//   15   31:aload_2         
	//   16   32:aload_0         
	//   17   33:getfield        #78  <Field int mIndex>
	//   18   36:invokevirtual   #370 <Method void PrintWriter.print(int)>
			printwriter.print(" mCommitted=");
	//   19   39:aload_2         
	//   20   40:ldc2            #372 <String " mCommitted=">
	//   21   43:invokevirtual   #364 <Method void PrintWriter.print(String)>
			printwriter.println(mCommitted);
	//   22   46:aload_2         
	//   23   47:aload_0         
	//   24   48:getfield        #317 <Field boolean mCommitted>
	//   25   51:invokevirtual   #376 <Method void PrintWriter.println(boolean)>
			if(mTransition != 0)
	//*  26   54:aload_0         
	//*  27   55:getfield        #378 <Field int mTransition>
	//*  28   58:ifeq            102
			{
				printwriter.print(s);
	//   29   61:aload_2         
	//   30   62:aload_1         
	//   31   63:invokevirtual   #364 <Method void PrintWriter.print(String)>
				printwriter.print("mTransition=#");
	//   32   66:aload_2         
	//   33   67:ldc2            #380 <String "mTransition=#">
	//   34   70:invokevirtual   #364 <Method void PrintWriter.print(String)>
				printwriter.print(Integer.toHexString(mTransition));
	//   35   73:aload_2         
	//   36   74:aload_0         
	//   37   75:getfield        #378 <Field int mTransition>
	//   38   78:invokestatic    #386 <Method String Integer.toHexString(int)>
	//   39   81:invokevirtual   #364 <Method void PrintWriter.print(String)>
				printwriter.print(" mTransitionStyle=#");
	//   40   84:aload_2         
	//   41   85:ldc2            #388 <String " mTransitionStyle=#">
	//   42   88:invokevirtual   #364 <Method void PrintWriter.print(String)>
				printwriter.println(Integer.toHexString(mTransitionStyle));
	//   43   91:aload_2         
	//   44   92:aload_0         
	//   45   93:getfield        #390 <Field int mTransitionStyle>
	//   46   96:invokestatic    #386 <Method String Integer.toHexString(int)>
	//   47   99:invokevirtual   #392 <Method void PrintWriter.println(String)>
			}
			if(mEnterAnim != 0 || mExitAnim != 0)
	//*  48  102:aload_0         
	//*  49  103:getfield        #220 <Field int mEnterAnim>
	//*  50  106:ifne            116
	//*  51  109:aload_0         
	//*  52  110:getfield        #225 <Field int mExitAnim>
	//*  53  113:ifeq            157
			{
				printwriter.print(s);
	//   54  116:aload_2         
	//   55  117:aload_1         
	//   56  118:invokevirtual   #364 <Method void PrintWriter.print(String)>
				printwriter.print("mEnterAnim=#");
	//   57  121:aload_2         
	//   58  122:ldc2            #394 <String "mEnterAnim=#">
	//   59  125:invokevirtual   #364 <Method void PrintWriter.print(String)>
				printwriter.print(Integer.toHexString(mEnterAnim));
	//   60  128:aload_2         
	//   61  129:aload_0         
	//   62  130:getfield        #220 <Field int mEnterAnim>
	//   63  133:invokestatic    #386 <Method String Integer.toHexString(int)>
	//   64  136:invokevirtual   #364 <Method void PrintWriter.print(String)>
				printwriter.print(" mExitAnim=#");
	//   65  139:aload_2         
	//   66  140:ldc2            #396 <String " mExitAnim=#">
	//   67  143:invokevirtual   #364 <Method void PrintWriter.print(String)>
				printwriter.println(Integer.toHexString(mExitAnim));
	//   68  146:aload_2         
	//   69  147:aload_0         
	//   70  148:getfield        #225 <Field int mExitAnim>
	//   71  151:invokestatic    #386 <Method String Integer.toHexString(int)>
	//   72  154:invokevirtual   #392 <Method void PrintWriter.println(String)>
			}
			if(mPopEnterAnim != 0 || mPopExitAnim != 0)
	//*  73  157:aload_0         
	//*  74  158:getfield        #230 <Field int mPopEnterAnim>
	//*  75  161:ifne            171
	//*  76  164:aload_0         
	//*  77  165:getfield        #235 <Field int mPopExitAnim>
	//*  78  168:ifeq            212
			{
				printwriter.print(s);
	//   79  171:aload_2         
	//   80  172:aload_1         
	//   81  173:invokevirtual   #364 <Method void PrintWriter.print(String)>
				printwriter.print("mPopEnterAnim=#");
	//   82  176:aload_2         
	//   83  177:ldc2            #398 <String "mPopEnterAnim=#">
	//   84  180:invokevirtual   #364 <Method void PrintWriter.print(String)>
				printwriter.print(Integer.toHexString(mPopEnterAnim));
	//   85  183:aload_2         
	//   86  184:aload_0         
	//   87  185:getfield        #230 <Field int mPopEnterAnim>
	//   88  188:invokestatic    #386 <Method String Integer.toHexString(int)>
	//   89  191:invokevirtual   #364 <Method void PrintWriter.print(String)>
				printwriter.print(" mPopExitAnim=#");
	//   90  194:aload_2         
	//   91  195:ldc2            #400 <String " mPopExitAnim=#">
	//   92  198:invokevirtual   #364 <Method void PrintWriter.print(String)>
				printwriter.println(Integer.toHexString(mPopExitAnim));
	//   93  201:aload_2         
	//   94  202:aload_0         
	//   95  203:getfield        #235 <Field int mPopExitAnim>
	//   96  206:invokestatic    #386 <Method String Integer.toHexString(int)>
	//   97  209:invokevirtual   #392 <Method void PrintWriter.println(String)>
			}
			if(mBreadCrumbTitleRes != 0 || mBreadCrumbTitleText != null)
	//*  98  212:aload_0         
	//*  99  213:getfield        #402 <Field int mBreadCrumbTitleRes>
	//* 100  216:ifne            226
	//* 101  219:aload_0         
	//* 102  220:getfield        #404 <Field CharSequence mBreadCrumbTitleText>
	//* 103  223:ifnull          264
			{
				printwriter.print(s);
	//  104  226:aload_2         
	//  105  227:aload_1         
	//  106  228:invokevirtual   #364 <Method void PrintWriter.print(String)>
				printwriter.print("mBreadCrumbTitleRes=#");
	//  107  231:aload_2         
	//  108  232:ldc2            #406 <String "mBreadCrumbTitleRes=#">
	//  109  235:invokevirtual   #364 <Method void PrintWriter.print(String)>
				printwriter.print(Integer.toHexString(mBreadCrumbTitleRes));
	//  110  238:aload_2         
	//  111  239:aload_0         
	//  112  240:getfield        #402 <Field int mBreadCrumbTitleRes>
	//  113  243:invokestatic    #386 <Method String Integer.toHexString(int)>
	//  114  246:invokevirtual   #364 <Method void PrintWriter.print(String)>
				printwriter.print(" mBreadCrumbTitleText=");
	//  115  249:aload_2         
	//  116  250:ldc2            #408 <String " mBreadCrumbTitleText=">
	//  117  253:invokevirtual   #364 <Method void PrintWriter.print(String)>
				printwriter.println(((Object) (mBreadCrumbTitleText)));
	//  118  256:aload_2         
	//  119  257:aload_0         
	//  120  258:getfield        #404 <Field CharSequence mBreadCrumbTitleText>
	//  121  261:invokevirtual   #411 <Method void PrintWriter.println(Object)>
			}
			if(mBreadCrumbShortTitleRes != 0 || mBreadCrumbShortTitleText != null)
	//* 122  264:aload_0         
	//* 123  265:getfield        #413 <Field int mBreadCrumbShortTitleRes>
	//* 124  268:ifne            278
	//* 125  271:aload_0         
	//* 126  272:getfield        #415 <Field CharSequence mBreadCrumbShortTitleText>
	//* 127  275:ifnull          316
			{
				printwriter.print(s);
	//  128  278:aload_2         
	//  129  279:aload_1         
	//  130  280:invokevirtual   #364 <Method void PrintWriter.print(String)>
				printwriter.print("mBreadCrumbShortTitleRes=#");
	//  131  283:aload_2         
	//  132  284:ldc2            #417 <String "mBreadCrumbShortTitleRes=#">
	//  133  287:invokevirtual   #364 <Method void PrintWriter.print(String)>
				printwriter.print(Integer.toHexString(mBreadCrumbShortTitleRes));
	//  134  290:aload_2         
	//  135  291:aload_0         
	//  136  292:getfield        #413 <Field int mBreadCrumbShortTitleRes>
	//  137  295:invokestatic    #386 <Method String Integer.toHexString(int)>
	//  138  298:invokevirtual   #364 <Method void PrintWriter.print(String)>
				printwriter.print(" mBreadCrumbShortTitleText=");
	//  139  301:aload_2         
	//  140  302:ldc2            #419 <String " mBreadCrumbShortTitleText=">
	//  141  305:invokevirtual   #364 <Method void PrintWriter.print(String)>
				printwriter.println(((Object) (mBreadCrumbShortTitleText)));
	//  142  308:aload_2         
	//  143  309:aload_0         
	//  144  310:getfield        #415 <Field CharSequence mBreadCrumbShortTitleText>
	//  145  313:invokevirtual   #411 <Method void PrintWriter.println(Object)>
			}
		}
		if(!mOps.isEmpty())
	//* 146  316:aload_0         
	//* 147  317:getfield        #74  <Field ArrayList mOps>
	//* 148  320:invokevirtual   #422 <Method boolean ArrayList.isEmpty()>
	//* 149  323:ifne            754
		{
			printwriter.print(s);
	//  150  326:aload_2         
	//  151  327:aload_1         
	//  152  328:invokevirtual   #364 <Method void PrintWriter.print(String)>
			printwriter.println("Operations:");
	//  153  331:aload_2         
	//  154  332:ldc2            #424 <String "Operations:">
	//  155  335:invokevirtual   #392 <Method void PrintWriter.println(String)>
			StringBuilder stringbuilder = new StringBuilder();
	//  156  338:new             #129 <Class StringBuilder>
	//  157  341:dup             
	//  158  342:invokespecial   #130 <Method void StringBuilder()>
	//  159  345:astore          6
			stringbuilder.append(s);
	//  160  347:aload           6
	//  161  349:aload_1         
	//  162  350:invokevirtual   #136 <Method StringBuilder StringBuilder.append(String)>
	//  163  353:pop             
			stringbuilder.append("    ");
	//  164  354:aload           6
	//  165  356:ldc2            #426 <String "    ">
	//  166  359:invokevirtual   #136 <Method StringBuilder StringBuilder.append(String)>
	//  167  362:pop             
			stringbuilder.toString();
	//  168  363:aload           6
	//  169  365:invokevirtual   #149 <Method String StringBuilder.toString()>
	//  170  368:pop             
			int j = mOps.size();
	//  171  369:aload_0         
	//  172  370:getfield        #74  <Field ArrayList mOps>
	//  173  373:invokevirtual   #298 <Method int ArrayList.size()>
	//  174  376:istore          5
			for(int i = 0; i < j; i++)
	//* 175  378:iconst_0        
	//* 176  379:istore          4
	//* 177  381:iload           4
	//* 178  383:iload           5
	//* 179  385:icmpge          754
			{
				Op op = (Op)mOps.get(i);
	//  180  388:aload_0         
	//  181  389:getfield        #74  <Field ArrayList mOps>
	//  182  392:iload           4
	//  183  394:invokevirtual   #302 <Method Object ArrayList.get(int)>
	//  184  397:checkcast       #10  <Class BackStackRecord$Op>
	//  185  400:astore          7
				Object obj;
				switch(op.cmd)
	//* 186  402:aload           7
	//* 187  404:getfield        #429 <Field int BackStackRecord$Op.cmd>
				{
	//* 188  407:tableswitch     0 9: default 460
	//	               0 571
	//	               1 563
	//	               2 555
	//	               3 547
	//	               4 539
	//	               5 531
	//	               6 523
	//	               7 515
	//	               8 507
	//	               9 499
				default:
					obj = ((Object) (new StringBuilder()));
	//  189  460:new             #129 <Class StringBuilder>
	//  190  463:dup             
	//  191  464:invokespecial   #130 <Method void StringBuilder()>
	//  192  467:astore          6
					((StringBuilder) (obj)).append("cmd=");
	//  193  469:aload           6
	//  194  471:ldc2            #431 <String "cmd=">
	//  195  474:invokevirtual   #136 <Method StringBuilder StringBuilder.append(String)>
	//  196  477:pop             
					((StringBuilder) (obj)).append(op.cmd);
	//  197  478:aload           6
	//  198  480:aload           7
	//  199  482:getfield        #429 <Field int BackStackRecord$Op.cmd>
	//  200  485:invokevirtual   #169 <Method StringBuilder StringBuilder.append(int)>
	//  201  488:pop             
					obj = ((Object) (((StringBuilder) (obj)).toString()));
	//  202  489:aload           6
	//  203  491:invokevirtual   #149 <Method String StringBuilder.toString()>
	//  204  494:astore          6
					break;

	//* 205  496:goto            576
				case 9: // '\t'
					obj = "UNSET_PRIMARY_NAV";
	//  206  499:ldc2            #433 <String "UNSET_PRIMARY_NAV">
	//  207  502:astore          6
					break;

	//* 208  504:goto            576
				case 8: // '\b'
					obj = "SET_PRIMARY_NAV";
	//  209  507:ldc2            #435 <String "SET_PRIMARY_NAV">
	//  210  510:astore          6
					break;

	//* 211  512:goto            576
				case 7: // '\007'
					obj = "ATTACH";
	//  212  515:ldc2            #437 <String "ATTACH">
	//  213  518:astore          6
					break;

	//* 214  520:goto            576
				case 6: // '\006'
					obj = "DETACH";
	//  215  523:ldc2            #439 <String "DETACH">
	//  216  526:astore          6
					break;

	//* 217  528:goto            576
				case 5: // '\005'
					obj = "SHOW";
	//  218  531:ldc2            #441 <String "SHOW">
	//  219  534:astore          6
					break;

	//* 220  536:goto            576
				case 4: // '\004'
					obj = "HIDE";
	//  221  539:ldc2            #443 <String "HIDE">
	//  222  542:astore          6
					break;

	//* 223  544:goto            576
				case 3: // '\003'
					obj = "REMOVE";
	//  224  547:ldc2            #445 <String "REMOVE">
	//  225  550:astore          6
					break;

	//* 226  552:goto            576
				case 2: // '\002'
					obj = "REPLACE";
	//  227  555:ldc2            #447 <String "REPLACE">
	//  228  558:astore          6
					break;

	//* 229  560:goto            576
				case 1: // '\001'
					obj = "ADD";
	//  230  563:ldc2            #449 <String "ADD">
	//  231  566:astore          6
					break;

	//* 232  568:goto            576
				case 0: // '\0'
					obj = "NULL";
	//  233  571:ldc2            #451 <String "NULL">
	//  234  574:astore          6
					break;
				}
				printwriter.print(s);
	//  235  576:aload_2         
	//  236  577:aload_1         
	//  237  578:invokevirtual   #364 <Method void PrintWriter.print(String)>
				printwriter.print("  Op #");
	//  238  581:aload_2         
	//  239  582:ldc2            #453 <String "  Op #">
	//  240  585:invokevirtual   #364 <Method void PrintWriter.print(String)>
				printwriter.print(i);
	//  241  588:aload_2         
	//  242  589:iload           4
	//  243  591:invokevirtual   #370 <Method void PrintWriter.print(int)>
				printwriter.print(": ");
	//  244  594:aload_2         
	//  245  595:ldc2            #455 <String ": ">
	//  246  598:invokevirtual   #364 <Method void PrintWriter.print(String)>
				printwriter.print(((String) (obj)));
	//  247  601:aload_2         
	//  248  602:aload           6
	//  249  604:invokevirtual   #364 <Method void PrintWriter.print(String)>
				printwriter.print(" ");
	//  250  607:aload_2         
	//  251  608:ldc2            #457 <String " ">
	//  252  611:invokevirtual   #364 <Method void PrintWriter.print(String)>
				printwriter.println(((Object) (op.fragment)));
	//  253  614:aload_2         
	//  254  615:aload           7
	//  255  617:getfield        #194 <Field Fragment BackStackRecord$Op.fragment>
	//  256  620:invokevirtual   #411 <Method void PrintWriter.println(Object)>
				if(!flag)
					continue;
	//  257  623:iload_3         
	//  258  624:ifeq            745
				if(op.enterAnim != 0 || op.exitAnim != 0)
	//* 259  627:aload           7
	//* 260  629:getfield        #223 <Field int BackStackRecord$Op.enterAnim>
	//* 261  632:ifne            643
	//* 262  635:aload           7
	//* 263  637:getfield        #228 <Field int BackStackRecord$Op.exitAnim>
	//* 264  640:ifeq            686
				{
					printwriter.print(s);
	//  265  643:aload_2         
	//  266  644:aload_1         
	//  267  645:invokevirtual   #364 <Method void PrintWriter.print(String)>
					printwriter.print("enterAnim=#");
	//  268  648:aload_2         
	//  269  649:ldc2            #459 <String "enterAnim=#">
	//  270  652:invokevirtual   #364 <Method void PrintWriter.print(String)>
					printwriter.print(Integer.toHexString(op.enterAnim));
	//  271  655:aload_2         
	//  272  656:aload           7
	//  273  658:getfield        #223 <Field int BackStackRecord$Op.enterAnim>
	//  274  661:invokestatic    #386 <Method String Integer.toHexString(int)>
	//  275  664:invokevirtual   #364 <Method void PrintWriter.print(String)>
					printwriter.print(" exitAnim=#");
	//  276  667:aload_2         
	//  277  668:ldc2            #461 <String " exitAnim=#">
	//  278  671:invokevirtual   #364 <Method void PrintWriter.print(String)>
					printwriter.println(Integer.toHexString(op.exitAnim));
	//  279  674:aload_2         
	//  280  675:aload           7
	//  281  677:getfield        #228 <Field int BackStackRecord$Op.exitAnim>
	//  282  680:invokestatic    #386 <Method String Integer.toHexString(int)>
	//  283  683:invokevirtual   #392 <Method void PrintWriter.println(String)>
				}
				if(op.popEnterAnim != 0 || op.popExitAnim != 0)
	//* 284  686:aload           7
	//* 285  688:getfield        #233 <Field int BackStackRecord$Op.popEnterAnim>
	//* 286  691:ifne            702
	//* 287  694:aload           7
	//* 288  696:getfield        #238 <Field int BackStackRecord$Op.popExitAnim>
	//* 289  699:ifeq            745
				{
					printwriter.print(s);
	//  290  702:aload_2         
	//  291  703:aload_1         
	//  292  704:invokevirtual   #364 <Method void PrintWriter.print(String)>
					printwriter.print("popEnterAnim=#");
	//  293  707:aload_2         
	//  294  708:ldc2            #463 <String "popEnterAnim=#">
	//  295  711:invokevirtual   #364 <Method void PrintWriter.print(String)>
					printwriter.print(Integer.toHexString(op.popEnterAnim));
	//  296  714:aload_2         
	//  297  715:aload           7
	//  298  717:getfield        #233 <Field int BackStackRecord$Op.popEnterAnim>
	//  299  720:invokestatic    #386 <Method String Integer.toHexString(int)>
	//  300  723:invokevirtual   #364 <Method void PrintWriter.print(String)>
					printwriter.print(" popExitAnim=#");
	//  301  726:aload_2         
	//  302  727:ldc2            #465 <String " popExitAnim=#">
	//  303  730:invokevirtual   #364 <Method void PrintWriter.print(String)>
					printwriter.println(Integer.toHexString(op.popExitAnim));
	//  304  733:aload_2         
	//  305  734:aload           7
	//  306  736:getfield        #238 <Field int BackStackRecord$Op.popExitAnim>
	//  307  739:invokestatic    #386 <Method String Integer.toHexString(int)>
	//  308  742:invokevirtual   #392 <Method void PrintWriter.println(String)>
				}
			}

	//  309  745:iload           4
	//  310  747:iconst_1        
	//  311  748:iadd            
	//  312  749:istore          4
		}
	//* 313  751:goto            381
	//  314  754:return          
	}

	void executeOps()
	{
		int j = mOps.size();
	//    0    0:aload_0         
	//    1    1:getfield        #74  <Field ArrayList mOps>
	//    2    4:invokevirtual   #298 <Method int ArrayList.size()>
	//    3    7:istore_2        
		for(int i = 0; i < j; i++)
	//*   4    8:iconst_0        
	//*   5    9:istore_1        
	//*   6   10:iload_1         
	//*   7   11:iload_2         
	//*   8   12:icmpge          340
		{
			Op op = (Op)mOps.get(i);
	//    9   15:aload_0         
	//   10   16:getfield        #74  <Field ArrayList mOps>
	//   11   19:iload_1         
	//   12   20:invokevirtual   #302 <Method Object ArrayList.get(int)>
	//   13   23:checkcast       #10  <Class BackStackRecord$Op>
	//   14   26:astore          4
			Object obj = ((Object) (op.fragment));
	//   15   28:aload           4
	//   16   30:getfield        #194 <Field Fragment BackStackRecord$Op.fragment>
	//   17   33:astore          5
			if(obj != null)
	//*  18   35:aload           5
	//*  19   37:ifnull          53
				((Fragment) (obj)).setNextTransition(mTransition, mTransitionStyle);
	//   20   40:aload           5
	//   21   42:aload_0         
	//   22   43:getfield        #378 <Field int mTransition>
	//   23   46:aload_0         
	//   24   47:getfield        #390 <Field int mTransitionStyle>
	//   25   50:invokevirtual   #470 <Method void Fragment.setNextTransition(int, int)>
			int k = op.cmd;
	//   26   53:aload           4
	//   27   55:getfield        #429 <Field int BackStackRecord$Op.cmd>
	//   28   58:istore_3        
			if(k != 1)
	//*  29   59:iload_3         
	//*  30   60:iconst_1        
	//*  31   61:icmpeq          283
			{
				switch(k)
	//*  32   64:iload_3         
				{
	//*  33   65:tableswitch     3 9: default 108
	//	               3 261
	//	               4 239
	//	               5 217
	//	               6 195
	//	               7 173
	//	               8 161
	//	               9 150
				default:
					obj = ((Object) (new StringBuilder()));
	//   34  108:new             #129 <Class StringBuilder>
	//   35  111:dup             
	//   36  112:invokespecial   #130 <Method void StringBuilder()>
	//   37  115:astore          5
					((StringBuilder) (obj)).append("Unknown cmd: ");
	//   38  117:aload           5
	//   39  119:ldc2            #472 <String "Unknown cmd: ">
	//   40  122:invokevirtual   #136 <Method StringBuilder StringBuilder.append(String)>
	//   41  125:pop             
					((StringBuilder) (obj)).append(op.cmd);
	//   42  126:aload           5
	//   43  128:aload           4
	//   44  130:getfield        #429 <Field int BackStackRecord$Op.cmd>
	//   45  133:invokevirtual   #169 <Method StringBuilder StringBuilder.append(int)>
	//   46  136:pop             
					throw new IllegalArgumentException(((StringBuilder) (obj)).toString());
	//   47  137:new             #160 <Class IllegalArgumentException>
	//   48  140:dup             
	//   49  141:aload           5
	//   50  143:invokevirtual   #149 <Method String StringBuilder.toString()>
	//   51  146:invokespecial   #161 <Method void IllegalArgumentException(String)>
	//   52  149:athrow          

				case 9: // '\t'
					mManager.setPrimaryNavigationFragment(((Fragment) (null)));
	//   53  150:aload_0         
	//   54  151:getfield        #82  <Field FragmentManagerImpl mManager>
	//   55  154:aconst_null     
	//   56  155:invokevirtual   #476 <Method void FragmentManagerImpl.setPrimaryNavigationFragment(Fragment)>
					break;

	//*  57  158:goto            303
				case 8: // '\b'
					mManager.setPrimaryNavigationFragment(((Fragment) (obj)));
	//   58  161:aload_0         
	//   59  162:getfield        #82  <Field FragmentManagerImpl mManager>
	//   60  165:aload           5
	//   61  167:invokevirtual   #476 <Method void FragmentManagerImpl.setPrimaryNavigationFragment(Fragment)>
					break;

	//*  62  170:goto            303
				case 7: // '\007'
					((Fragment) (obj)).setNextAnim(op.enterAnim);
	//   63  173:aload           5
	//   64  175:aload           4
	//   65  177:getfield        #223 <Field int BackStackRecord$Op.enterAnim>
	//   66  180:invokevirtual   #479 <Method void Fragment.setNextAnim(int)>
					mManager.attachFragment(((Fragment) (obj)));
	//   67  183:aload_0         
	//   68  184:getfield        #82  <Field FragmentManagerImpl mManager>
	//   69  187:aload           5
	//   70  189:invokevirtual   #482 <Method void FragmentManagerImpl.attachFragment(Fragment)>
					break;

	//*  71  192:goto            303
				case 6: // '\006'
					((Fragment) (obj)).setNextAnim(op.exitAnim);
	//   72  195:aload           5
	//   73  197:aload           4
	//   74  199:getfield        #228 <Field int BackStackRecord$Op.exitAnim>
	//   75  202:invokevirtual   #479 <Method void Fragment.setNextAnim(int)>
					mManager.detachFragment(((Fragment) (obj)));
	//   76  205:aload_0         
	//   77  206:getfield        #82  <Field FragmentManagerImpl mManager>
	//   78  209:aload           5
	//   79  211:invokevirtual   #485 <Method void FragmentManagerImpl.detachFragment(Fragment)>
					break;

	//*  80  214:goto            303
				case 5: // '\005'
					((Fragment) (obj)).setNextAnim(op.enterAnim);
	//   81  217:aload           5
	//   82  219:aload           4
	//   83  221:getfield        #223 <Field int BackStackRecord$Op.enterAnim>
	//   84  224:invokevirtual   #479 <Method void Fragment.setNextAnim(int)>
					mManager.showFragment(((Fragment) (obj)));
	//   85  227:aload_0         
	//   86  228:getfield        #82  <Field FragmentManagerImpl mManager>
	//   87  231:aload           5
	//   88  233:invokevirtual   #488 <Method void FragmentManagerImpl.showFragment(Fragment)>
					break;

	//*  89  236:goto            303
				case 4: // '\004'
					((Fragment) (obj)).setNextAnim(op.exitAnim);
	//   90  239:aload           5
	//   91  241:aload           4
	//   92  243:getfield        #228 <Field int BackStackRecord$Op.exitAnim>
	//   93  246:invokevirtual   #479 <Method void Fragment.setNextAnim(int)>
					mManager.hideFragment(((Fragment) (obj)));
	//   94  249:aload_0         
	//   95  250:getfield        #82  <Field FragmentManagerImpl mManager>
	//   96  253:aload           5
	//   97  255:invokevirtual   #491 <Method void FragmentManagerImpl.hideFragment(Fragment)>
					break;

	//*  98  258:goto            303
				case 3: // '\003'
					((Fragment) (obj)).setNextAnim(op.exitAnim);
	//   99  261:aload           5
	//  100  263:aload           4
	//  101  265:getfield        #228 <Field int BackStackRecord$Op.exitAnim>
	//  102  268:invokevirtual   #479 <Method void Fragment.setNextAnim(int)>
					mManager.removeFragment(((Fragment) (obj)));
	//  103  271:aload_0         
	//  104  272:getfield        #82  <Field FragmentManagerImpl mManager>
	//  105  275:aload           5
	//  106  277:invokevirtual   #494 <Method void FragmentManagerImpl.removeFragment(Fragment)>
					break;
				}
			} else
	//* 107  280:goto            303
			{
				((Fragment) (obj)).setNextAnim(op.enterAnim);
	//  108  283:aload           5
	//  109  285:aload           4
	//  110  287:getfield        #223 <Field int BackStackRecord$Op.enterAnim>
	//  111  290:invokevirtual   #479 <Method void Fragment.setNextAnim(int)>
				mManager.addFragment(((Fragment) (obj)), false);
	//  112  293:aload_0         
	//  113  294:getfield        #82  <Field FragmentManagerImpl mManager>
	//  114  297:aload           5
	//  115  299:iconst_0        
	//  116  300:invokevirtual   #498 <Method void FragmentManagerImpl.addFragment(Fragment, boolean)>
			}
			if(!mReorderingAllowed && op.cmd != 1 && obj != null)
	//* 117  303:aload_0         
	//* 118  304:getfield        #80  <Field boolean mReorderingAllowed>
	//* 119  307:ifne            333
	//* 120  310:aload           4
	//* 121  312:getfield        #429 <Field int BackStackRecord$Op.cmd>
	//* 122  315:iconst_1        
	//* 123  316:icmpeq          333
	//* 124  319:aload           5
	//* 125  321:ifnull          333
				mManager.moveFragmentToExpectedState(((Fragment) (obj)));
	//  126  324:aload_0         
	//  127  325:getfield        #82  <Field FragmentManagerImpl mManager>
	//  128  328:aload           5
	//  129  330:invokevirtual   #501 <Method void FragmentManagerImpl.moveFragmentToExpectedState(Fragment)>
		}

	//  130  333:iload_1         
	//  131  334:iconst_1        
	//  132  335:iadd            
	//  133  336:istore_1        
	//* 134  337:goto            10
		if(!mReorderingAllowed)
	//* 135  340:aload_0         
	//* 136  341:getfield        #80  <Field boolean mReorderingAllowed>
	//* 137  344:ifne            362
			mManager.moveToState(mManager.mCurState, true);
	//  138  347:aload_0         
	//  139  348:getfield        #82  <Field FragmentManagerImpl mManager>
	//  140  351:aload_0         
	//  141  352:getfield        #82  <Field FragmentManagerImpl mManager>
	//  142  355:getfield        #504 <Field int FragmentManagerImpl.mCurState>
	//  143  358:iconst_1        
	//  144  359:invokevirtual   #508 <Method void FragmentManagerImpl.moveToState(int, boolean)>
	//  145  362:return          
	}

	void executePopOps(boolean flag)
	{
		for(int i = mOps.size() - 1; i >= 0; i--)
	//*   0    0:aload_0         
	//*   1    1:getfield        #74  <Field ArrayList mOps>
	//*   2    4:invokevirtual   #298 <Method int ArrayList.size()>
	//*   3    7:iconst_1        
	//*   4    8:isub            
	//*   5    9:istore_2        
	//*   6   10:iload_2         
	//*   7   11:iflt            340
		{
			Op op = (Op)mOps.get(i);
	//    8   14:aload_0         
	//    9   15:getfield        #74  <Field ArrayList mOps>
	//   10   18:iload_2         
	//   11   19:invokevirtual   #302 <Method Object ArrayList.get(int)>
	//   12   22:checkcast       #10  <Class BackStackRecord$Op>
	//   13   25:astore          4
			Object obj = ((Object) (op.fragment));
	//   14   27:aload           4
	//   15   29:getfield        #194 <Field Fragment BackStackRecord$Op.fragment>
	//   16   32:astore          5
			if(obj != null)
	//*  17   34:aload           5
	//*  18   36:ifnull          55
				((Fragment) (obj)).setNextTransition(FragmentManagerImpl.reverseTransit(mTransition), mTransitionStyle);
	//   19   39:aload           5
	//   20   41:aload_0         
	//   21   42:getfield        #378 <Field int mTransition>
	//   22   45:invokestatic    #513 <Method int FragmentManagerImpl.reverseTransit(int)>
	//   23   48:aload_0         
	//   24   49:getfield        #390 <Field int mTransitionStyle>
	//   25   52:invokevirtual   #470 <Method void Fragment.setNextTransition(int, int)>
			int j = op.cmd;
	//   26   55:aload           4
	//   27   57:getfield        #429 <Field int BackStackRecord$Op.cmd>
	//   28   60:istore_3        
			if(j != 1)
	//*  29   61:iload_3         
	//*  30   62:iconst_1        
	//*  31   63:icmpeq          284
			{
				switch(j)
	//*  32   66:iload_3         
				{
	//*  33   67:tableswitch     3 9: default 108
	//	               3 261
	//	               4 239
	//	               5 217
	//	               6 195
	//	               7 173
	//	               8 162
	//	               9 150
				default:
					obj = ((Object) (new StringBuilder()));
	//   34  108:new             #129 <Class StringBuilder>
	//   35  111:dup             
	//   36  112:invokespecial   #130 <Method void StringBuilder()>
	//   37  115:astore          5
					((StringBuilder) (obj)).append("Unknown cmd: ");
	//   38  117:aload           5
	//   39  119:ldc2            #472 <String "Unknown cmd: ">
	//   40  122:invokevirtual   #136 <Method StringBuilder StringBuilder.append(String)>
	//   41  125:pop             
					((StringBuilder) (obj)).append(op.cmd);
	//   42  126:aload           5
	//   43  128:aload           4
	//   44  130:getfield        #429 <Field int BackStackRecord$Op.cmd>
	//   45  133:invokevirtual   #169 <Method StringBuilder StringBuilder.append(int)>
	//   46  136:pop             
					throw new IllegalArgumentException(((StringBuilder) (obj)).toString());
	//   47  137:new             #160 <Class IllegalArgumentException>
	//   48  140:dup             
	//   49  141:aload           5
	//   50  143:invokevirtual   #149 <Method String StringBuilder.toString()>
	//   51  146:invokespecial   #161 <Method void IllegalArgumentException(String)>
	//   52  149:athrow          

				case 9: // '\t'
					mManager.setPrimaryNavigationFragment(((Fragment) (obj)));
	//   53  150:aload_0         
	//   54  151:getfield        #82  <Field FragmentManagerImpl mManager>
	//   55  154:aload           5
	//   56  156:invokevirtual   #476 <Method void FragmentManagerImpl.setPrimaryNavigationFragment(Fragment)>
					break;

	//*  57  159:goto            303
				case 8: // '\b'
					mManager.setPrimaryNavigationFragment(((Fragment) (null)));
	//   58  162:aload_0         
	//   59  163:getfield        #82  <Field FragmentManagerImpl mManager>
	//   60  166:aconst_null     
	//   61  167:invokevirtual   #476 <Method void FragmentManagerImpl.setPrimaryNavigationFragment(Fragment)>
					break;

	//*  62  170:goto            303
				case 7: // '\007'
					((Fragment) (obj)).setNextAnim(op.popExitAnim);
	//   63  173:aload           5
	//   64  175:aload           4
	//   65  177:getfield        #238 <Field int BackStackRecord$Op.popExitAnim>
	//   66  180:invokevirtual   #479 <Method void Fragment.setNextAnim(int)>
					mManager.detachFragment(((Fragment) (obj)));
	//   67  183:aload_0         
	//   68  184:getfield        #82  <Field FragmentManagerImpl mManager>
	//   69  187:aload           5
	//   70  189:invokevirtual   #485 <Method void FragmentManagerImpl.detachFragment(Fragment)>
					break;

	//*  71  192:goto            303
				case 6: // '\006'
					((Fragment) (obj)).setNextAnim(op.popEnterAnim);
	//   72  195:aload           5
	//   73  197:aload           4
	//   74  199:getfield        #233 <Field int BackStackRecord$Op.popEnterAnim>
	//   75  202:invokevirtual   #479 <Method void Fragment.setNextAnim(int)>
					mManager.attachFragment(((Fragment) (obj)));
	//   76  205:aload_0         
	//   77  206:getfield        #82  <Field FragmentManagerImpl mManager>
	//   78  209:aload           5
	//   79  211:invokevirtual   #482 <Method void FragmentManagerImpl.attachFragment(Fragment)>
					break;

	//*  80  214:goto            303
				case 5: // '\005'
					((Fragment) (obj)).setNextAnim(op.popExitAnim);
	//   81  217:aload           5
	//   82  219:aload           4
	//   83  221:getfield        #238 <Field int BackStackRecord$Op.popExitAnim>
	//   84  224:invokevirtual   #479 <Method void Fragment.setNextAnim(int)>
					mManager.hideFragment(((Fragment) (obj)));
	//   85  227:aload_0         
	//   86  228:getfield        #82  <Field FragmentManagerImpl mManager>
	//   87  231:aload           5
	//   88  233:invokevirtual   #491 <Method void FragmentManagerImpl.hideFragment(Fragment)>
					break;

	//*  89  236:goto            303
				case 4: // '\004'
					((Fragment) (obj)).setNextAnim(op.popEnterAnim);
	//   90  239:aload           5
	//   91  241:aload           4
	//   92  243:getfield        #233 <Field int BackStackRecord$Op.popEnterAnim>
	//   93  246:invokevirtual   #479 <Method void Fragment.setNextAnim(int)>
					mManager.showFragment(((Fragment) (obj)));
	//   94  249:aload_0         
	//   95  250:getfield        #82  <Field FragmentManagerImpl mManager>
	//   96  253:aload           5
	//   97  255:invokevirtual   #488 <Method void FragmentManagerImpl.showFragment(Fragment)>
					break;

	//*  98  258:goto            303
				case 3: // '\003'
					((Fragment) (obj)).setNextAnim(op.popEnterAnim);
	//   99  261:aload           5
	//  100  263:aload           4
	//  101  265:getfield        #233 <Field int BackStackRecord$Op.popEnterAnim>
	//  102  268:invokevirtual   #479 <Method void Fragment.setNextAnim(int)>
					mManager.addFragment(((Fragment) (obj)), false);
	//  103  271:aload_0         
	//  104  272:getfield        #82  <Field FragmentManagerImpl mManager>
	//  105  275:aload           5
	//  106  277:iconst_0        
	//  107  278:invokevirtual   #498 <Method void FragmentManagerImpl.addFragment(Fragment, boolean)>
					break;
				}
			} else
	//* 108  281:goto            303
			{
				((Fragment) (obj)).setNextAnim(op.popExitAnim);
	//  109  284:aload           5
	//  110  286:aload           4
	//  111  288:getfield        #238 <Field int BackStackRecord$Op.popExitAnim>
	//  112  291:invokevirtual   #479 <Method void Fragment.setNextAnim(int)>
				mManager.removeFragment(((Fragment) (obj)));
	//  113  294:aload_0         
	//  114  295:getfield        #82  <Field FragmentManagerImpl mManager>
	//  115  298:aload           5
	//  116  300:invokevirtual   #494 <Method void FragmentManagerImpl.removeFragment(Fragment)>
			}
			if(!mReorderingAllowed && op.cmd != 3 && obj != null)
	//* 117  303:aload_0         
	//* 118  304:getfield        #80  <Field boolean mReorderingAllowed>
	//* 119  307:ifne            333
	//* 120  310:aload           4
	//* 121  312:getfield        #429 <Field int BackStackRecord$Op.cmd>
	//* 122  315:iconst_3        
	//* 123  316:icmpeq          333
	//* 124  319:aload           5
	//* 125  321:ifnull          333
				mManager.moveFragmentToExpectedState(((Fragment) (obj)));
	//  126  324:aload_0         
	//  127  325:getfield        #82  <Field FragmentManagerImpl mManager>
	//  128  328:aload           5
	//  129  330:invokevirtual   #501 <Method void FragmentManagerImpl.moveFragmentToExpectedState(Fragment)>
		}

	//  130  333:iload_2         
	//  131  334:iconst_1        
	//  132  335:isub            
	//  133  336:istore_2        
	//* 134  337:goto            10
		if(!mReorderingAllowed && flag)
	//* 135  340:aload_0         
	//* 136  341:getfield        #80  <Field boolean mReorderingAllowed>
	//* 137  344:ifne            366
	//* 138  347:iload_1         
	//* 139  348:ifeq            366
			mManager.moveToState(mManager.mCurState, true);
	//  140  351:aload_0         
	//  141  352:getfield        #82  <Field FragmentManagerImpl mManager>
	//  142  355:aload_0         
	//  143  356:getfield        #82  <Field FragmentManagerImpl mManager>
	//  144  359:getfield        #504 <Field int FragmentManagerImpl.mCurState>
	//  145  362:iconst_1        
	//  146  363:invokevirtual   #508 <Method void FragmentManagerImpl.moveToState(int, boolean)>
	//  147  366:return          
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
	//*   6    7:getfield        #74  <Field ArrayList mOps>
	//*   7   10:invokevirtual   #298 <Method int ArrayList.size()>
	//*   8   13:icmpge          465
		{
			Op op = (Op)mOps.get(i);
	//    9   16:aload_0         
	//   10   17:getfield        #74  <Field ArrayList mOps>
	//   11   20:iload_3         
	//   12   21:invokevirtual   #302 <Method Object ArrayList.get(int)>
	//   13   24:checkcast       #10  <Class BackStackRecord$Op>
	//   14   27:astore          10
			int j;
			switch(op.cmd)
	//*  15   29:aload           10
	//*  16   31:getfield        #429 <Field int BackStackRecord$Op.cmd>
			{
	//*  17   34:tableswitch     1 8: default 80
	//	               1 438
	//	               2 180
	//	               3 122
	//	               4 80
	//	               5 80
	//	               6 122
	//	               7 438
	//	               8 89
			case 4: // '\004'
			case 5: // '\005'
			default:
				fragment = fragment1;
	//   18   80:aload           9
	//   19   82:astore_2        
				j = i;
	//   20   83:iload_3         
	//   21   84:istore          4
				break;
	//   22   86:goto            454

			case 8: // '\b'
				mOps.add(i, ((Object) (new Op(9, fragment1))));
	//   23   89:aload_0         
	//   24   90:getfield        #74  <Field ArrayList mOps>
	//   25   93:iload_3         
	//   26   94:new             #10  <Class BackStackRecord$Op>
	//   27   97:dup             
	//   28   98:bipush          9
	//   29  100:aload           9
	//   30  102:invokespecial   #175 <Method void BackStackRecord$Op(int, Fragment)>
	//   31  105:invokevirtual   #518 <Method void ArrayList.add(int, Object)>
				j = i + 1;
	//   32  108:iload_3         
	//   33  109:iconst_1        
	//   34  110:iadd            
	//   35  111:istore          4
				fragment = op.fragment;
	//   36  113:aload           10
	//   37  115:getfield        #194 <Field Fragment BackStackRecord$Op.fragment>
	//   38  118:astore_2        
				break;
	//   39  119:goto            454

			case 3: // '\003'
			case 6: // '\006'
				arraylist.remove(((Object) (op.fragment)));
	//   40  122:aload_1         
	//   41  123:aload           10
	//   42  125:getfield        #194 <Field Fragment BackStackRecord$Op.fragment>
	//   43  128:invokevirtual   #521 <Method boolean ArrayList.remove(Object)>
	//   44  131:pop             
				fragment = fragment1;
	//   45  132:aload           9
	//   46  134:astore_2        
				j = i;
	//   47  135:iload_3         
	//   48  136:istore          4
				if(op.fragment == fragment1)
	//*  49  138:aload           10
	//*  50  140:getfield        #194 <Field Fragment BackStackRecord$Op.fragment>
	//*  51  143:aload           9
	//*  52  145:if_acmpne       454
				{
					mOps.add(i, ((Object) (new Op(9, op.fragment))));
	//   53  148:aload_0         
	//   54  149:getfield        #74  <Field ArrayList mOps>
	//   55  152:iload_3         
	//   56  153:new             #10  <Class BackStackRecord$Op>
	//   57  156:dup             
	//   58  157:bipush          9
	//   59  159:aload           10
	//   60  161:getfield        #194 <Field Fragment BackStackRecord$Op.fragment>
	//   61  164:invokespecial   #175 <Method void BackStackRecord$Op(int, Fragment)>
	//   62  167:invokevirtual   #518 <Method void ArrayList.add(int, Object)>
					j = i + 1;
	//   63  170:iload_3         
	//   64  171:iconst_1        
	//   65  172:iadd            
	//   66  173:istore          4
					fragment = null;
	//   67  175:aconst_null     
	//   68  176:astore_2        
				}
				break;
	//   69  177:goto            454

			case 2: // '\002'
				Fragment fragment2 = op.fragment;
	//   70  180:aload           10
	//   71  182:getfield        #194 <Field Fragment BackStackRecord$Op.fragment>
	//   72  185:astore          11
				int l = fragment2.mContainerId;
	//   73  187:aload           11
	//   74  189:getfield        #172 <Field int Fragment.mContainerId>
	//   75  192:istore          8
				j = arraylist.size() - 1;
	//   76  194:aload_1         
	//   77  195:invokevirtual   #298 <Method int ArrayList.size()>
	//   78  198:iconst_1        
	//   79  199:isub            
	//   80  200:istore          4
				fragment = fragment1;
	//   81  202:aload           9
	//   82  204:astore_2        
				boolean flag;
				boolean flag1;
				for(flag = false; j >= 0; flag = flag1)
	//*  83  205:iconst_0        
	//*  84  206:istore          5
	//*  85  208:iload           4
	//*  86  210:iflt            395
				{
					Fragment fragment3 = (Fragment)arraylist.get(j);
	//   87  213:aload_1         
	//   88  214:iload           4
	//   89  216:invokevirtual   #302 <Method Object ArrayList.get(int)>
	//   90  219:checkcast       #115 <Class Fragment>
	//   91  222:astore          12
					int k = i;
	//   92  224:iload_3         
	//   93  225:istore          6
					fragment1 = fragment;
	//   94  227:aload_2         
	//   95  228:astore          9
					flag1 = flag;
	//   96  230:iload           5
	//   97  232:istore          7
					if(fragment3.mContainerId == l)
	//*  98  234:aload           12
	//*  99  236:getfield        #172 <Field int Fragment.mContainerId>
	//* 100  239:iload           8
	//* 101  241:icmpne          376
						if(fragment3 == fragment2)
	//* 102  244:aload           12
	//* 103  246:aload           11
	//* 104  248:if_acmpne       263
						{
							flag1 = true;
	//  105  251:iconst_1        
	//  106  252:istore          7
							k = i;
	//  107  254:iload_3         
	//  108  255:istore          6
							fragment1 = fragment;
	//  109  257:aload_2         
	//  110  258:astore          9
						} else
	//* 111  260:goto            376
						{
							k = i;
	//  112  263:iload_3         
	//  113  264:istore          6
							fragment1 = fragment;
	//  114  266:aload_2         
	//  115  267:astore          9
							if(fragment3 == fragment)
	//* 116  269:aload           12
	//* 117  271:aload_2         
	//* 118  272:if_acmpne       302
							{
								mOps.add(i, ((Object) (new Op(9, fragment3))));
	//  119  275:aload_0         
	//  120  276:getfield        #74  <Field ArrayList mOps>
	//  121  279:iload_3         
	//  122  280:new             #10  <Class BackStackRecord$Op>
	//  123  283:dup             
	//  124  284:bipush          9
	//  125  286:aload           12
	//  126  288:invokespecial   #175 <Method void BackStackRecord$Op(int, Fragment)>
	//  127  291:invokevirtual   #518 <Method void ArrayList.add(int, Object)>
								k = i + 1;
	//  128  294:iload_3         
	//  129  295:iconst_1        
	//  130  296:iadd            
	//  131  297:istore          6
								fragment1 = null;
	//  132  299:aconst_null     
	//  133  300:astore          9
							}
							fragment = ((Fragment) (new Op(3, fragment3)));
	//  134  302:new             #10  <Class BackStackRecord$Op>
	//  135  305:dup             
	//  136  306:iconst_3        
	//  137  307:aload           12
	//  138  309:invokespecial   #175 <Method void BackStackRecord$Op(int, Fragment)>
	//  139  312:astore_2        
							fragment.enterAnim = op.enterAnim;
	//  140  313:aload_2         
	//  141  314:aload           10
	//  142  316:getfield        #223 <Field int BackStackRecord$Op.enterAnim>
	//  143  319:putfield        #223 <Field int BackStackRecord$Op.enterAnim>
							fragment.popEnterAnim = op.popEnterAnim;
	//  144  322:aload_2         
	//  145  323:aload           10
	//  146  325:getfield        #233 <Field int BackStackRecord$Op.popEnterAnim>
	//  147  328:putfield        #233 <Field int BackStackRecord$Op.popEnterAnim>
							fragment.exitAnim = op.exitAnim;
	//  148  331:aload_2         
	//  149  332:aload           10
	//  150  334:getfield        #228 <Field int BackStackRecord$Op.exitAnim>
	//  151  337:putfield        #228 <Field int BackStackRecord$Op.exitAnim>
							fragment.popExitAnim = op.popExitAnim;
	//  152  340:aload_2         
	//  153  341:aload           10
	//  154  343:getfield        #238 <Field int BackStackRecord$Op.popExitAnim>
	//  155  346:putfield        #238 <Field int BackStackRecord$Op.popExitAnim>
							mOps.add(k, ((Object) (fragment)));
	//  156  349:aload_0         
	//  157  350:getfield        #74  <Field ArrayList mOps>
	//  158  353:iload           6
	//  159  355:aload_2         
	//  160  356:invokevirtual   #518 <Method void ArrayList.add(int, Object)>
							arraylist.remove(((Object) (fragment3)));
	//  161  359:aload_1         
	//  162  360:aload           12
	//  163  362:invokevirtual   #521 <Method boolean ArrayList.remove(Object)>
	//  164  365:pop             
							k++;
	//  165  366:iload           6
	//  166  368:iconst_1        
	//  167  369:iadd            
	//  168  370:istore          6
							flag1 = flag;
	//  169  372:iload           5
	//  170  374:istore          7
						}
					j--;
	//  171  376:iload           4
	//  172  378:iconst_1        
	//  173  379:isub            
	//  174  380:istore          4
					i = k;
	//  175  382:iload           6
	//  176  384:istore_3        
					fragment = fragment1;
	//  177  385:aload           9
	//  178  387:astore_2        
				}

	//  179  388:iload           7
	//  180  390:istore          5
	//* 181  392:goto            208
				if(flag)
	//* 182  395:iload           5
	//* 183  397:ifeq            416
				{
					mOps.remove(i);
	//  184  400:aload_0         
	//  185  401:getfield        #74  <Field ArrayList mOps>
	//  186  404:iload_3         
	//  187  405:invokevirtual   #523 <Method Object ArrayList.remove(int)>
	//  188  408:pop             
					i--;
	//  189  409:iload_3         
	//  190  410:iconst_1        
	//  191  411:isub            
	//  192  412:istore_3        
				} else
	//* 193  413:goto            432
				{
					op.cmd = 1;
	//  194  416:aload           10
	//  195  418:iconst_1        
	//  196  419:putfield        #429 <Field int BackStackRecord$Op.cmd>
					arraylist.add(((Object) (fragment2)));
	//  197  422:aload_1         
	//  198  423:aload           11
	//  199  425:invokevirtual   #218 <Method boolean ArrayList.add(Object)>
	//  200  428:pop             
				}
	//* 201  429:goto            413
				j = i;
	//  202  432:iload_3         
	//  203  433:istore          4
				break;

	//* 204  435:goto            454
			case 1: // '\001'
			case 7: // '\007'
				arraylist.add(((Object) (op.fragment)));
	//  205  438:aload_1         
	//  206  439:aload           10
	//  207  441:getfield        #194 <Field Fragment BackStackRecord$Op.fragment>
	//  208  444:invokevirtual   #218 <Method boolean ArrayList.add(Object)>
	//  209  447:pop             
				j = i;
	//  210  448:iload_3         
	//  211  449:istore          4
				fragment = fragment1;
	//  212  451:aload           9
	//  213  453:astore_2        
				break;
			}
			i = j + 1;
	//  214  454:iload           4
	//  215  456:iconst_1        
	//  216  457:iadd            
	//  217  458:istore_3        
		}

	//  218  459:aload_2         
	//  219  460:astore          9
	//* 220  462:goto            5
		return fragment1;
	//  221  465:aload           9
	//  222  467:areturn         
	}

	public boolean generateOps(ArrayList arraylist, ArrayList arraylist1)
	{
		if(FragmentManagerImpl.DEBUG)
	//*   0    0:getstatic       #285 <Field boolean FragmentManagerImpl.DEBUG>
	//*   1    3:ifeq            38
		{
			StringBuilder stringbuilder = new StringBuilder();
	//    2    6:new             #129 <Class StringBuilder>
	//    3    9:dup             
	//    4   10:invokespecial   #130 <Method void StringBuilder()>
	//    5   13:astore_3        
			stringbuilder.append("Run: ");
	//    6   14:aload_3         
	//    7   15:ldc2            #529 <String "Run: ">
	//    8   18:invokevirtual   #136 <Method StringBuilder StringBuilder.append(String)>
	//    9   21:pop             
			stringbuilder.append(((Object) (this)));
	//   10   22:aload_3         
	//   11   23:aload_0         
	//   12   24:invokevirtual   #139 <Method StringBuilder StringBuilder.append(Object)>
	//   13   27:pop             
			Log.v("FragmentManager", stringbuilder.toString());
	//   14   28:ldc1            #36  <String "FragmentManager">
	//   15   30:aload_3         
	//   16   31:invokevirtual   #149 <Method String StringBuilder.toString()>
	//   17   34:invokestatic    #295 <Method int Log.v(String, String)>
	//   18   37:pop             
		}
		arraylist.add(((Object) (this)));
	//   19   38:aload_1         
	//   20   39:aload_0         
	//   21   40:invokevirtual   #218 <Method boolean ArrayList.add(Object)>
	//   22   43:pop             
		arraylist1.add(((Object) (Boolean.valueOf(false))));
	//   23   44:aload_2         
	//   24   45:iconst_0        
	//   25   46:invokestatic    #535 <Method Boolean Boolean.valueOf(boolean)>
	//   26   49:invokevirtual   #218 <Method boolean ArrayList.add(Object)>
	//   27   52:pop             
		if(mAddToBackStack)
	//*  28   53:aload_0         
	//*  29   54:getfield        #274 <Field boolean mAddToBackStack>
	//*  30   57:ifeq            68
			mManager.addBackStackState(this);
	//   31   60:aload_0         
	//   32   61:getfield        #82  <Field FragmentManagerImpl mManager>
	//   33   64:aload_0         
	//   34   65:invokevirtual   #539 <Method void FragmentManagerImpl.addBackStackState(BackStackRecord)>
		return true;
	//   35   68:iconst_1        
	//   36   69:ireturn         
	}

	public CharSequence getBreadCrumbShortTitle()
	{
		if(mBreadCrumbShortTitleRes != 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #413 <Field int mBreadCrumbShortTitleRes>
	//*   2    4:ifeq            25
			return mManager.mHost.getContext().getText(mBreadCrumbShortTitleRes);
	//    3    7:aload_0         
	//    4    8:getfield        #82  <Field FragmentManagerImpl mManager>
	//    5   11:getfield        #546 <Field FragmentHostCallback FragmentManagerImpl.mHost>
	//    6   14:invokevirtual   #552 <Method Context FragmentHostCallback.getContext()>
	//    7   17:aload_0         
	//    8   18:getfield        #413 <Field int mBreadCrumbShortTitleRes>
	//    9   21:invokevirtual   #558 <Method CharSequence Context.getText(int)>
	//   10   24:areturn         
		else
			return mBreadCrumbShortTitleText;
	//   11   25:aload_0         
	//   12   26:getfield        #415 <Field CharSequence mBreadCrumbShortTitleText>
	//   13   29:areturn         
	}

	public int getBreadCrumbShortTitleRes()
	{
		return mBreadCrumbShortTitleRes;
	//    0    0:aload_0         
	//    1    1:getfield        #413 <Field int mBreadCrumbShortTitleRes>
	//    2    4:ireturn         
	}

	public CharSequence getBreadCrumbTitle()
	{
		if(mBreadCrumbTitleRes != 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #402 <Field int mBreadCrumbTitleRes>
	//*   2    4:ifeq            25
			return mManager.mHost.getContext().getText(mBreadCrumbTitleRes);
	//    3    7:aload_0         
	//    4    8:getfield        #82  <Field FragmentManagerImpl mManager>
	//    5   11:getfield        #546 <Field FragmentHostCallback FragmentManagerImpl.mHost>
	//    6   14:invokevirtual   #552 <Method Context FragmentHostCallback.getContext()>
	//    7   17:aload_0         
	//    8   18:getfield        #402 <Field int mBreadCrumbTitleRes>
	//    9   21:invokevirtual   #558 <Method CharSequence Context.getText(int)>
	//   10   24:areturn         
		else
			return mBreadCrumbTitleText;
	//   11   25:aload_0         
	//   12   26:getfield        #404 <Field CharSequence mBreadCrumbTitleText>
	//   13   29:areturn         
	}

	public int getBreadCrumbTitleRes()
	{
		return mBreadCrumbTitleRes;
	//    0    0:aload_0         
	//    1    1:getfield        #402 <Field int mBreadCrumbTitleRes>
	//    2    4:ireturn         
	}

	public int getId()
	{
		return mIndex;
	//    0    0:aload_0         
	//    1    1:getfield        #78  <Field int mIndex>
	//    2    4:ireturn         
	}

	public String getName()
	{
		return mName;
	//    0    0:aload_0         
	//    1    1:getfield        #276 <Field String mName>
	//    2    4:areturn         
	}

	public int getTransition()
	{
		return mTransition;
	//    0    0:aload_0         
	//    1    1:getfield        #378 <Field int mTransition>
	//    2    4:ireturn         
	}

	public int getTransitionStyle()
	{
		return mTransitionStyle;
	//    0    0:aload_0         
	//    1    1:getfield        #390 <Field int mTransitionStyle>
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
	//    5    7:invokespecial   #175 <Method void BackStackRecord$Op(int, Fragment)>
	//    6   10:invokevirtual   #179 <Method void addOp(BackStackRecord$Op)>
		return ((FragmentTransaction) (this));
	//    7   13:aload_0         
	//    8   14:areturn         
	}

	boolean interactsWith(int i)
	{
		int l = mOps.size();
	//    0    0:aload_0         
	//    1    1:getfield        #74  <Field ArrayList mOps>
	//    2    4:invokevirtual   #298 <Method int ArrayList.size()>
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
	//   10   18:getfield        #74  <Field ArrayList mOps>
	//   11   21:iload_2         
	//   12   22:invokevirtual   #302 <Method Object ArrayList.get(int)>
	//   13   25:checkcast       #10  <Class BackStackRecord$Op>
	//   14   28:astore          5
			int k;
			if(op.fragment != null)
	//*  15   30:aload           5
	//*  16   32:getfield        #194 <Field Fragment BackStackRecord$Op.fragment>
	//*  17   35:ifnull          50
				k = op.fragment.mContainerId;
	//   18   38:aload           5
	//   19   40:getfield        #194 <Field Fragment BackStackRecord$Op.fragment>
	//   20   43:getfield        #172 <Field int Fragment.mContainerId>
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
		int l1 = mOps.size();
	//    5    7:aload_0         
	//    6    8:getfield        #74  <Field ArrayList mOps>
	//    7   11:invokevirtual   #298 <Method int ArrayList.size()>
	//    8   14:istore          9
		int i1 = -1;
	//    9   16:iconst_m1       
	//   10   17:istore          6
		for(int l = 0; l < l1;)
	//*  11   19:iconst_0        
	//*  12   20:istore          5
	//*  13   22:iload           5
	//*  14   24:iload           9
	//*  15   26:icmpge          210
		{
			Op op = (Op)mOps.get(l);
	//   16   29:aload_0         
	//   17   30:getfield        #74  <Field ArrayList mOps>
	//   18   33:iload           5
	//   19   35:invokevirtual   #302 <Method Object ArrayList.get(int)>
	//   20   38:checkcast       #10  <Class BackStackRecord$Op>
	//   21   41:astore          11
			int k;
			if(op.fragment != null)
	//*  22   43:aload           11
	//*  23   45:getfield        #194 <Field Fragment BackStackRecord$Op.fragment>
	//*  24   48:ifnull          64
				k = op.fragment.mContainerId;
	//   25   51:aload           11
	//   26   53:getfield        #194 <Field Fragment BackStackRecord$Op.fragment>
	//   27   56:getfield        #172 <Field int Fragment.mContainerId>
	//   28   59:istore          4
			else
	//*  29   61:goto            67
				k = 0;
	//   30   64:iconst_0        
	//   31   65:istore          4
			int j1 = i1;
	//   32   67:iload           6
	//   33   69:istore          7
			if(k != 0)
	//*  34   71:iload           4
	//*  35   73:ifeq            197
			{
				j1 = i1;
	//   36   76:iload           6
	//   37   78:istore          7
				if(k != i1)
	//*  38   80:iload           4
	//*  39   82:iload           6
	//*  40   84:icmpeq          197
				{
					for(i1 = i; i1 < j; i1++)
	//*  41   87:iload_2         
	//*  42   88:istore          6
	//*  43   90:iload           6
	//*  44   92:iload_3         
	//*  45   93:icmpge          193
					{
						BackStackRecord backstackrecord = (BackStackRecord)arraylist.get(i1);
	//   46   96:aload_1         
	//   47   97:iload           6
	//   48   99:invokevirtual   #302 <Method Object ArrayList.get(int)>
	//   49  102:checkcast       #2   <Class BackStackRecord>
	//   50  105:astore          11
						int i2 = backstackrecord.mOps.size();
	//   51  107:aload           11
	//   52  109:getfield        #74  <Field ArrayList mOps>
	//   53  112:invokevirtual   #298 <Method int ArrayList.size()>
	//   54  115:istore          10
						for(j1 = 0; j1 < i2; j1++)
	//*  55  117:iconst_0        
	//*  56  118:istore          7
	//*  57  120:iload           7
	//*  58  122:iload           10
	//*  59  124:icmpge          184
						{
							Op op1 = (Op)backstackrecord.mOps.get(j1);
	//   60  127:aload           11
	//   61  129:getfield        #74  <Field ArrayList mOps>
	//   62  132:iload           7
	//   63  134:invokevirtual   #302 <Method Object ArrayList.get(int)>
	//   64  137:checkcast       #10  <Class BackStackRecord$Op>
	//   65  140:astore          12
							int k1;
							if(op1.fragment != null)
	//*  66  142:aload           12
	//*  67  144:getfield        #194 <Field Fragment BackStackRecord$Op.fragment>
	//*  68  147:ifnull          163
								k1 = op1.fragment.mContainerId;
	//   69  150:aload           12
	//   70  152:getfield        #194 <Field Fragment BackStackRecord$Op.fragment>
	//   71  155:getfield        #172 <Field int Fragment.mContainerId>
	//   72  158:istore          8
							else
	//*  73  160:goto            166
								k1 = 0;
	//   74  163:iconst_0        
	//   75  164:istore          8
							if(k1 == k)
	//*  76  166:iload           8
	//*  77  168:iload           4
	//*  78  170:icmpne          175
								return true;
	//   79  173:iconst_1        
	//   80  174:ireturn         
						}

	//   81  175:iload           7
	//   82  177:iconst_1        
	//   83  178:iadd            
	//   84  179:istore          7
					}

	//   85  181:goto            120
	//   86  184:iload           6
	//   87  186:iconst_1        
	//   88  187:iadd            
	//   89  188:istore          6
	//*  90  190:goto            90
					j1 = k;
	//   91  193:iload           4
	//   92  195:istore          7
				}
			}
			l++;
	//   93  197:iload           5
	//   94  199:iconst_1        
	//   95  200:iadd            
	//   96  201:istore          5
			i1 = j1;
	//   97  203:iload           7
	//   98  205:istore          6
		}

	//*  99  207:goto            22
		return false;
	//  100  210:iconst_0        
	//  101  211:ireturn         
	}

	public boolean isAddToBackStackAllowed()
	{
		return mAllowAddToBackStack;
	//    0    0:aload_0         
	//    1    1:getfield        #76  <Field boolean mAllowAddToBackStack>
	//    2    4:ireturn         
	}

	public boolean isEmpty()
	{
		return mOps.isEmpty();
	//    0    0:aload_0         
	//    1    1:getfield        #74  <Field ArrayList mOps>
	//    2    4:invokevirtual   #422 <Method boolean ArrayList.isEmpty()>
	//    3    7:ireturn         
	}

	boolean isPostponed()
	{
		for(int i = 0; i < mOps.size(); i++)
	//*   0    0:iconst_0        
	//*   1    1:istore_1        
	//*   2    2:iload_1         
	//*   3    3:aload_0         
	//*   4    4:getfield        #74  <Field ArrayList mOps>
	//*   5    7:invokevirtual   #298 <Method int ArrayList.size()>
	//*   6   10:icmpge          39
			if(isFragmentPostponed((Op)mOps.get(i)))
	//*   7   13:aload_0         
	//*   8   14:getfield        #74  <Field ArrayList mOps>
	//*   9   17:iload_1         
	//*  10   18:invokevirtual   #302 <Method Object ArrayList.get(int)>
	//*  11   21:checkcast       #10  <Class BackStackRecord$Op>
	//*  12   24:invokestatic    #572 <Method boolean isFragmentPostponed(BackStackRecord$Op)>
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

	public FragmentTransaction remove(Fragment fragment)
	{
		addOp(new Op(3, fragment));
	//    0    0:aload_0         
	//    1    1:new             #10  <Class BackStackRecord$Op>
	//    2    4:dup             
	//    3    5:iconst_3        
	//    4    6:aload_1         
	//    5    7:invokespecial   #175 <Method void BackStackRecord$Op(int, Fragment)>
	//    6   10:invokevirtual   #179 <Method void addOp(BackStackRecord$Op)>
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
	//    4    4:invokevirtual   #575 <Method FragmentTransaction replace(int, Fragment, String)>
	//    5    7:areturn         
	}

	public FragmentTransaction replace(int i, Fragment fragment, String s)
	{
		if(i == 0)
	//*   0    0:iload_1         
	//*   1    1:ifne            15
		{
			throw new IllegalArgumentException("Must use non-zero containerViewId");
	//    2    4:new             #160 <Class IllegalArgumentException>
	//    3    7:dup             
	//    4    8:ldc2            #577 <String "Must use non-zero containerViewId">
	//    5   11:invokespecial   #161 <Method void IllegalArgumentException(String)>
	//    6   14:athrow          
		} else
		{
			doAddOp(i, fragment, s, 2);
	//    7   15:aload_0         
	//    8   16:iload_1         
	//    9   17:aload_2         
	//   10   18:aload_3         
	//   11   19:iconst_2        
	//   12   20:invokespecial   #214 <Method void doAddOp(int, Fragment, String, int)>
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
	//    2    4:new             #160 <Class IllegalArgumentException>
	//    3    7:dup             
	//    4    8:ldc2            #581 <String "runnable cannot be null">
	//    5   11:invokespecial   #161 <Method void IllegalArgumentException(String)>
	//    6   14:athrow          
		disallowAddToBackStack();
	//    7   15:aload_0         
	//    8   16:invokevirtual   #351 <Method FragmentTransaction disallowAddToBackStack()>
	//    9   19:pop             
		if(mCommitRunnables == null)
	//*  10   20:aload_0         
	//*  11   21:getfield        #583 <Field ArrayList mCommitRunnables>
	//*  12   24:ifnonnull       38
			mCommitRunnables = new ArrayList();
	//   13   27:aload_0         
	//   14   28:new             #71  <Class ArrayList>
	//   15   31:dup             
	//   16   32:invokespecial   #72  <Method void ArrayList()>
	//   17   35:putfield        #583 <Field ArrayList mCommitRunnables>
		mCommitRunnables.add(((Object) (runnable)));
	//   18   38:aload_0         
	//   19   39:getfield        #583 <Field ArrayList mCommitRunnables>
	//   20   42:aload_1         
	//   21   43:invokevirtual   #218 <Method boolean ArrayList.add(Object)>
	//   22   46:pop             
		return ((FragmentTransaction) (this));
	//   23   47:aload_0         
	//   24   48:areturn         
	}

	public void runOnCommitRunnables()
	{
		if(mCommitRunnables != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #583 <Field ArrayList mCommitRunnables>
	//*   2    4:ifnull          50
		{
			int i = 0;
	//    3    7:iconst_0        
	//    4    8:istore_1        
			for(int j = mCommitRunnables.size(); i < j; i++)
	//*   5    9:aload_0         
	//*   6   10:getfield        #583 <Field ArrayList mCommitRunnables>
	//*   7   13:invokevirtual   #298 <Method int ArrayList.size()>
	//*   8   16:istore_2        
	//*   9   17:iload_1         
	//*  10   18:iload_2         
	//*  11   19:icmpge          45
				((Runnable)mCommitRunnables.get(i)).run();
	//   12   22:aload_0         
	//   13   23:getfield        #583 <Field ArrayList mCommitRunnables>
	//   14   26:iload_1         
	//   15   27:invokevirtual   #302 <Method Object ArrayList.get(int)>
	//   16   30:checkcast       #586 <Class Runnable>
	//   17   33:invokeinterface #589 <Method void Runnable.run()>

	//   18   38:iload_1         
	//   19   39:iconst_1        
	//   20   40:iadd            
	//   21   41:istore_1        
	//*  22   42:goto            17
			mCommitRunnables = null;
	//   23   45:aload_0         
	//   24   46:aconst_null     
	//   25   47:putfield        #583 <Field ArrayList mCommitRunnables>
		}
	//   26   50:return          
	}

	public FragmentTransaction setAllowOptimization(boolean flag)
	{
		return setReorderingAllowed(flag);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #594 <Method FragmentTransaction setReorderingAllowed(boolean)>
	//    3    5:areturn         
	}

	public FragmentTransaction setBreadCrumbShortTitle(int i)
	{
		mBreadCrumbShortTitleRes = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #413 <Field int mBreadCrumbShortTitleRes>
		mBreadCrumbShortTitleText = null;
	//    3    5:aload_0         
	//    4    6:aconst_null     
	//    5    7:putfield        #415 <Field CharSequence mBreadCrumbShortTitleText>
		return ((FragmentTransaction) (this));
	//    6   10:aload_0         
	//    7   11:areturn         
	}

	public FragmentTransaction setBreadCrumbShortTitle(CharSequence charsequence)
	{
		mBreadCrumbShortTitleRes = 0;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #413 <Field int mBreadCrumbShortTitleRes>
		mBreadCrumbShortTitleText = charsequence;
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:putfield        #415 <Field CharSequence mBreadCrumbShortTitleText>
		return ((FragmentTransaction) (this));
	//    6   10:aload_0         
	//    7   11:areturn         
	}

	public FragmentTransaction setBreadCrumbTitle(int i)
	{
		mBreadCrumbTitleRes = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #402 <Field int mBreadCrumbTitleRes>
		mBreadCrumbTitleText = null;
	//    3    5:aload_0         
	//    4    6:aconst_null     
	//    5    7:putfield        #404 <Field CharSequence mBreadCrumbTitleText>
		return ((FragmentTransaction) (this));
	//    6   10:aload_0         
	//    7   11:areturn         
	}

	public FragmentTransaction setBreadCrumbTitle(CharSequence charsequence)
	{
		mBreadCrumbTitleRes = 0;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #402 <Field int mBreadCrumbTitleRes>
		mBreadCrumbTitleText = charsequence;
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:putfield        #404 <Field CharSequence mBreadCrumbTitleText>
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
	//    5    5:invokevirtual   #603 <Method FragmentTransaction setCustomAnimations(int, int, int, int)>
	//    6    8:areturn         
	}

	public FragmentTransaction setCustomAnimations(int i, int j, int k, int l)
	{
		mEnterAnim = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #220 <Field int mEnterAnim>
		mExitAnim = j;
	//    3    5:aload_0         
	//    4    6:iload_2         
	//    5    7:putfield        #225 <Field int mExitAnim>
		mPopEnterAnim = k;
	//    6   10:aload_0         
	//    7   11:iload_3         
	//    8   12:putfield        #230 <Field int mPopEnterAnim>
		mPopExitAnim = l;
	//    9   15:aload_0         
	//   10   16:iload           4
	//   11   18:putfield        #235 <Field int mPopExitAnim>
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
	//*   4    4:getfield        #74  <Field ArrayList mOps>
	//*   5    7:invokevirtual   #298 <Method int ArrayList.size()>
	//*   6   10:icmpge          47
		{
			Op op = (Op)mOps.get(i);
	//    7   13:aload_0         
	//    8   14:getfield        #74  <Field ArrayList mOps>
	//    9   17:iload_2         
	//   10   18:invokevirtual   #302 <Method Object ArrayList.get(int)>
	//   11   21:checkcast       #10  <Class BackStackRecord$Op>
	//   12   24:astore_3        
			if(isFragmentPostponed(op))
	//*  13   25:aload_3         
	//*  14   26:invokestatic    #572 <Method boolean isFragmentPostponed(BackStackRecord$Op)>
	//*  15   29:ifeq            40
				op.fragment.setOnStartEnterTransitionListener(onstartentertransitionlistener);
	//   16   32:aload_3         
	//   17   33:getfield        #194 <Field Fragment BackStackRecord$Op.fragment>
	//   18   36:aload_1         
	//   19   37:invokevirtual   #608 <Method void Fragment.setOnStartEnterTransitionListener(Fragment$OnStartEnterTransitionListener)>
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
	//    5    8:invokespecial   #175 <Method void BackStackRecord$Op(int, Fragment)>
	//    6   11:invokevirtual   #179 <Method void addOp(BackStackRecord$Op)>
		return ((FragmentTransaction) (this));
	//    7   14:aload_0         
	//    8   15:areturn         
	}

	public FragmentTransaction setReorderingAllowed(boolean flag)
	{
		mReorderingAllowed = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #80  <Field boolean mReorderingAllowed>
		return ((FragmentTransaction) (this));
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public FragmentTransaction setTransition(int i)
	{
		mTransition = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #378 <Field int mTransition>
		return ((FragmentTransaction) (this));
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public FragmentTransaction setTransitionStyle(int i)
	{
		mTransitionStyle = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #390 <Field int mTransitionStyle>
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
	//    5    7:invokespecial   #175 <Method void BackStackRecord$Op(int, Fragment)>
	//    6   10:invokevirtual   #179 <Method void addOp(BackStackRecord$Op)>
		return ((FragmentTransaction) (this));
	//    7   13:aload_0         
	//    8   14:areturn         
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder(128);
	//    0    0:new             #129 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:sipush          128
	//    3    7:invokespecial   #613 <Method void StringBuilder(int)>
	//    4   10:astore_1        
		stringbuilder.append("BackStackEntry{");
	//    5   11:aload_1         
	//    6   12:ldc2            #615 <String "BackStackEntry{">
	//    7   15:invokevirtual   #136 <Method StringBuilder StringBuilder.append(String)>
	//    8   18:pop             
		stringbuilder.append(Integer.toHexString(System.identityHashCode(((Object) (this)))));
	//    9   19:aload_1         
	//   10   20:aload_0         
	//   11   21:invokestatic    #621 <Method int System.identityHashCode(Object)>
	//   12   24:invokestatic    #386 <Method String Integer.toHexString(int)>
	//   13   27:invokevirtual   #136 <Method StringBuilder StringBuilder.append(String)>
	//   14   30:pop             
		if(mIndex >= 0)
	//*  15   31:aload_0         
	//*  16   32:getfield        #78  <Field int mIndex>
	//*  17   35:iflt            55
		{
			stringbuilder.append(" #");
	//   18   38:aload_1         
	//   19   39:ldc2            #623 <String " #">
	//   20   42:invokevirtual   #136 <Method StringBuilder StringBuilder.append(String)>
	//   21   45:pop             
			stringbuilder.append(mIndex);
	//   22   46:aload_1         
	//   23   47:aload_0         
	//   24   48:getfield        #78  <Field int mIndex>
	//   25   51:invokevirtual   #169 <Method StringBuilder StringBuilder.append(int)>
	//   26   54:pop             
		}
		if(mName != null)
	//*  27   55:aload_0         
	//*  28   56:getfield        #276 <Field String mName>
	//*  29   59:ifnull          79
		{
			stringbuilder.append(" ");
	//   30   62:aload_1         
	//   31   63:ldc2            #457 <String " ">
	//   32   66:invokevirtual   #136 <Method StringBuilder StringBuilder.append(String)>
	//   33   69:pop             
			stringbuilder.append(mName);
	//   34   70:aload_1         
	//   35   71:aload_0         
	//   36   72:getfield        #276 <Field String mName>
	//   37   75:invokevirtual   #136 <Method StringBuilder StringBuilder.append(String)>
	//   38   78:pop             
		}
		stringbuilder.append("}");
	//   39   79:aload_1         
	//   40   80:ldc2            #625 <String "}">
	//   41   83:invokevirtual   #136 <Method StringBuilder StringBuilder.append(String)>
	//   42   86:pop             
		return stringbuilder.toString();
	//   43   87:aload_1         
	//   44   88:invokevirtual   #149 <Method String StringBuilder.toString()>
	//   45   91:areturn         
	}

	Fragment trackAddedFragmentsInPop(ArrayList arraylist, Fragment fragment)
	{
		int i = 0;
	//    0    0:iconst_0        
	//    1    1:istore_3        
_L9:
		int j;
		Op op;
		if(i >= mOps.size())
			break; /* Loop/switch isn't completed */
	//    2    2:iload_3         
	//    3    3:aload_0         
	//    4    4:getfield        #74  <Field ArrayList mOps>
	//    5    7:invokevirtual   #298 <Method int ArrayList.size()>
	//    6   10:icmpge          123
		op = (Op)mOps.get(i);
	//    7   13:aload_0         
	//    8   14:getfield        #74  <Field ArrayList mOps>
	//    9   17:iload_3         
	//   10   18:invokevirtual   #302 <Method Object ArrayList.get(int)>
	//   11   21:checkcast       #10  <Class BackStackRecord$Op>
	//   12   24:astore          5
		j = op.cmd;
	//   13   26:aload           5
	//   14   28:getfield        #429 <Field int BackStackRecord$Op.cmd>
	//   15   31:istore          4
		if(j == 1) goto _L2; else goto _L1
	//   16   33:iload           4
	//   17   35:iconst_1        
	//   18   36:icmpeq          106
_L1:
		if(j == 3) goto _L4; else goto _L3
	//   19   39:iload           4
	//   20   41:iconst_3        
	//   21   42:icmpeq          93
_L3:
		j;
	//   22   45:iload           4
		JVM INSTR tableswitch 6 9: default 76
	//	               6 93
	//	               7 106
	//	               8 88
	//	               9 79;
	//   23   47:tableswitch     6 9: default 76
	//	               6 93
	//	               7 106
	//	               8 88
	//	               9 79
		   goto _L5 _L4 _L2 _L6 _L7
_L5:
		break; /* Loop/switch isn't completed */
	//   24   76:goto            116
_L7:
		fragment = op.fragment;
	//   25   79:aload           5
	//   26   81:getfield        #194 <Field Fragment BackStackRecord$Op.fragment>
	//   27   84:astore_2        
		break; /* Loop/switch isn't completed */
	//   28   85:goto            116
_L6:
		fragment = null;
	//   29   88:aconst_null     
	//   30   89:astore_2        
		break; /* Loop/switch isn't completed */
	//   31   90:goto            116
_L4:
		arraylist.add(((Object) (op.fragment)));
	//   32   93:aload_1         
	//   33   94:aload           5
	//   34   96:getfield        #194 <Field Fragment BackStackRecord$Op.fragment>
	//   35   99:invokevirtual   #218 <Method boolean ArrayList.add(Object)>
	//   36  102:pop             
		break; /* Loop/switch isn't completed */
	//   37  103:goto            116
_L2:
		arraylist.remove(((Object) (op.fragment)));
	//   38  106:aload_1         
	//   39  107:aload           5
	//   40  109:getfield        #194 <Field Fragment BackStackRecord$Op.fragment>
	//   41  112:invokevirtual   #521 <Method boolean ArrayList.remove(Object)>
	//   42  115:pop             
		i++;
	//   43  116:iload_3         
	//   44  117:iconst_1        
	//   45  118:iadd            
	//   46  119:istore_3        
		if(true) goto _L9; else goto _L8
	//   47  120:goto            2
_L8:
		return fragment;
	//   48  123:aload_2         
	//   49  124:areturn         
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
}

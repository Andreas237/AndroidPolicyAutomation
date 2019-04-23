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
	//    1    1:invokespecial   #70  <Method void FragmentTransaction()>
		mOps = new ArrayList();
	//    2    4:aload_0         
	//    3    5:new             #72  <Class ArrayList>
	//    4    8:dup             
	//    5    9:invokespecial   #73  <Method void ArrayList()>
	//    6   12:putfield        #75  <Field ArrayList mOps>
		mAllowAddToBackStack = true;
	//    7   15:aload_0         
	//    8   16:iconst_1        
	//    9   17:putfield        #77  <Field boolean mAllowAddToBackStack>
		mIndex = -1;
	//   10   20:aload_0         
	//   11   21:iconst_m1       
	//   12   22:putfield        #79  <Field int mIndex>
		mReorderingAllowed = false;
	//   13   25:aload_0         
	//   14   26:iconst_0        
	//   15   27:putfield        #81  <Field boolean mReorderingAllowed>
		mManager = fragmentmanagerimpl;
	//   16   30:aload_0         
	//   17   31:aload_1         
	//   18   32:putfield        #83  <Field FragmentManagerImpl mManager>
	//   19   35:return          
	}

	private void doAddOp(int i, Fragment fragment, String s, int j)
	{
		Object obj = ((Object) (((Object) (fragment)).getClass()));
	//    0    0:aload_2         
	//    1    1:invokevirtual   #92  <Method Class Object.getClass()>
	//    2    4:astore          6
		int k = ((Class) (obj)).getModifiers();
	//    3    6:aload           6
	//    4    8:invokevirtual   #98  <Method int Class.getModifiers()>
	//    5   11:istore          5
		if(!((Class) (obj)).isAnonymousClass() && Modifier.isPublic(k) && (!((Class) (obj)).isMemberClass() || Modifier.isStatic(k)))
	//*   6   13:aload           6
	//*   7   15:invokevirtual   #102 <Method boolean Class.isAnonymousClass()>
	//*   8   18:ifne            330
	//*   9   21:iload           5
	//*  10   23:invokestatic    #108 <Method boolean Modifier.isPublic(int)>
	//*  11   26:ifeq            330
	//*  12   29:aload           6
	//*  13   31:invokevirtual   #111 <Method boolean Class.isMemberClass()>
	//*  14   34:ifeq            45
	//*  15   37:iload           5
	//*  16   39:invokestatic    #114 <Method boolean Modifier.isStatic(int)>
	//*  17   42:ifeq            330
		{
			fragment.mFragmentManager = mManager;
	//   18   45:aload_2         
	//   19   46:aload_0         
	//   20   47:getfield        #83  <Field FragmentManagerImpl mManager>
	//   21   50:putfield        #119 <Field FragmentManagerImpl Fragment.mFragmentManager>
			if(s != null)
	//*  22   53:aload_3         
	//*  23   54:ifnull          153
			{
				if(fragment.mTag != null && !s.equals(((Object) (fragment.mTag))))
	//*  24   57:aload_2         
	//*  25   58:getfield        #122 <Field String Fragment.mTag>
	//*  26   61:ifnull          148
	//*  27   64:aload_3         
	//*  28   65:aload_2         
	//*  29   66:getfield        #122 <Field String Fragment.mTag>
	//*  30   69:invokevirtual   #128 <Method boolean String.equals(Object)>
	//*  31   72:ifeq            78
	//*  32   75:goto            148
				{
					obj = ((Object) (new StringBuilder()));
	//   33   78:new             #130 <Class StringBuilder>
	//   34   81:dup             
	//   35   82:invokespecial   #131 <Method void StringBuilder()>
	//   36   85:astore          6
					((StringBuilder) (obj)).append("Can't change tag of fragment ");
	//   37   87:aload           6
	//   38   89:ldc1            #133 <String "Can't change tag of fragment ">
	//   39   91:invokevirtual   #137 <Method StringBuilder StringBuilder.append(String)>
	//   40   94:pop             
					((StringBuilder) (obj)).append(((Object) (fragment)));
	//   41   95:aload           6
	//   42   97:aload_2         
	//   43   98:invokevirtual   #140 <Method StringBuilder StringBuilder.append(Object)>
	//   44  101:pop             
					((StringBuilder) (obj)).append(": was ");
	//   45  102:aload           6
	//   46  104:ldc1            #142 <String ": was ">
	//   47  106:invokevirtual   #137 <Method StringBuilder StringBuilder.append(String)>
	//   48  109:pop             
					((StringBuilder) (obj)).append(fragment.mTag);
	//   49  110:aload           6
	//   50  112:aload_2         
	//   51  113:getfield        #122 <Field String Fragment.mTag>
	//   52  116:invokevirtual   #137 <Method StringBuilder StringBuilder.append(String)>
	//   53  119:pop             
					((StringBuilder) (obj)).append(" now ");
	//   54  120:aload           6
	//   55  122:ldc1            #144 <String " now ">
	//   56  124:invokevirtual   #137 <Method StringBuilder StringBuilder.append(String)>
	//   57  127:pop             
					((StringBuilder) (obj)).append(s);
	//   58  128:aload           6
	//   59  130:aload_3         
	//   60  131:invokevirtual   #137 <Method StringBuilder StringBuilder.append(String)>
	//   61  134:pop             
					throw new IllegalStateException(((StringBuilder) (obj)).toString());
	//   62  135:new             #146 <Class IllegalStateException>
	//   63  138:dup             
	//   64  139:aload           6
	//   65  141:invokevirtual   #150 <Method String StringBuilder.toString()>
	//   66  144:invokespecial   #153 <Method void IllegalStateException(String)>
	//   67  147:athrow          
				}
				fragment.mTag = s;
	//   68  148:aload_2         
	//   69  149:aload_3         
	//   70  150:putfield        #122 <Field String Fragment.mTag>
			}
			if(i != 0)
	//*  71  153:iload_1         
	//*  72  154:ifeq            315
				if(i != -1)
	//*  73  157:iload_1         
	//*  74  158:iconst_m1       
	//*  75  159:icmpeq          255
				{
					if(fragment.mFragmentId != 0 && fragment.mFragmentId != i)
	//*  76  162:aload_2         
	//*  77  163:getfield        #156 <Field int Fragment.mFragmentId>
	//*  78  166:ifeq            242
	//*  79  169:aload_2         
	//*  80  170:getfield        #156 <Field int Fragment.mFragmentId>
	//*  81  173:iload_1         
	//*  82  174:icmpne          180
	//*  83  177:goto            242
					{
						s = ((String) (new StringBuilder()));
	//   84  180:new             #130 <Class StringBuilder>
	//   85  183:dup             
	//   86  184:invokespecial   #131 <Method void StringBuilder()>
	//   87  187:astore_3        
						((StringBuilder) (s)).append("Can't change container ID of fragment ");
	//   88  188:aload_3         
	//   89  189:ldc1            #158 <String "Can't change container ID of fragment ">
	//   90  191:invokevirtual   #137 <Method StringBuilder StringBuilder.append(String)>
	//   91  194:pop             
						((StringBuilder) (s)).append(((Object) (fragment)));
	//   92  195:aload_3         
	//   93  196:aload_2         
	//   94  197:invokevirtual   #140 <Method StringBuilder StringBuilder.append(Object)>
	//   95  200:pop             
						((StringBuilder) (s)).append(": was ");
	//   96  201:aload_3         
	//   97  202:ldc1            #142 <String ": was ">
	//   98  204:invokevirtual   #137 <Method StringBuilder StringBuilder.append(String)>
	//   99  207:pop             
						((StringBuilder) (s)).append(fragment.mFragmentId);
	//  100  208:aload_3         
	//  101  209:aload_2         
	//  102  210:getfield        #156 <Field int Fragment.mFragmentId>
	//  103  213:invokevirtual   #161 <Method StringBuilder StringBuilder.append(int)>
	//  104  216:pop             
						((StringBuilder) (s)).append(" now ");
	//  105  217:aload_3         
	//  106  218:ldc1            #144 <String " now ">
	//  107  220:invokevirtual   #137 <Method StringBuilder StringBuilder.append(String)>
	//  108  223:pop             
						((StringBuilder) (s)).append(i);
	//  109  224:aload_3         
	//  110  225:iload_1         
	//  111  226:invokevirtual   #161 <Method StringBuilder StringBuilder.append(int)>
	//  112  229:pop             
						throw new IllegalStateException(((StringBuilder) (s)).toString());
	//  113  230:new             #146 <Class IllegalStateException>
	//  114  233:dup             
	//  115  234:aload_3         
	//  116  235:invokevirtual   #150 <Method String StringBuilder.toString()>
	//  117  238:invokespecial   #153 <Method void IllegalStateException(String)>
	//  118  241:athrow          
					}
					fragment.mFragmentId = i;
	//  119  242:aload_2         
	//  120  243:iload_1         
	//  121  244:putfield        #156 <Field int Fragment.mFragmentId>
					fragment.mContainerId = i;
	//  122  247:aload_2         
	//  123  248:iload_1         
	//  124  249:putfield        #164 <Field int Fragment.mContainerId>
				} else
	//* 125  252:goto            315
				{
					obj = ((Object) (new StringBuilder()));
	//  126  255:new             #130 <Class StringBuilder>
	//  127  258:dup             
	//  128  259:invokespecial   #131 <Method void StringBuilder()>
	//  129  262:astore          6
					((StringBuilder) (obj)).append("Can't add fragment ");
	//  130  264:aload           6
	//  131  266:ldc1            #166 <String "Can't add fragment ">
	//  132  268:invokevirtual   #137 <Method StringBuilder StringBuilder.append(String)>
	//  133  271:pop             
					((StringBuilder) (obj)).append(((Object) (fragment)));
	//  134  272:aload           6
	//  135  274:aload_2         
	//  136  275:invokevirtual   #140 <Method StringBuilder StringBuilder.append(Object)>
	//  137  278:pop             
					((StringBuilder) (obj)).append(" with tag ");
	//  138  279:aload           6
	//  139  281:ldc1            #168 <String " with tag ">
	//  140  283:invokevirtual   #137 <Method StringBuilder StringBuilder.append(String)>
	//  141  286:pop             
					((StringBuilder) (obj)).append(s);
	//  142  287:aload           6
	//  143  289:aload_3         
	//  144  290:invokevirtual   #137 <Method StringBuilder StringBuilder.append(String)>
	//  145  293:pop             
					((StringBuilder) (obj)).append(" to container view with no id");
	//  146  294:aload           6
	//  147  296:ldc1            #170 <String " to container view with no id">
	//  148  298:invokevirtual   #137 <Method StringBuilder StringBuilder.append(String)>
	//  149  301:pop             
					throw new IllegalArgumentException(((StringBuilder) (obj)).toString());
	//  150  302:new             #172 <Class IllegalArgumentException>
	//  151  305:dup             
	//  152  306:aload           6
	//  153  308:invokevirtual   #150 <Method String StringBuilder.toString()>
	//  154  311:invokespecial   #173 <Method void IllegalArgumentException(String)>
	//  155  314:athrow          
				}
			addOp(new Op(j, fragment));
	//  156  315:aload_0         
	//  157  316:new             #10  <Class BackStackRecord$Op>
	//  158  319:dup             
	//  159  320:iload           4
	//  160  322:aload_2         
	//  161  323:invokespecial   #176 <Method void BackStackRecord$Op(int, Fragment)>
	//  162  326:invokevirtual   #180 <Method void addOp(BackStackRecord$Op)>
			return;
	//  163  329:return          
		} else
		{
			fragment = ((Fragment) (new StringBuilder()));
	//  164  330:new             #130 <Class StringBuilder>
	//  165  333:dup             
	//  166  334:invokespecial   #131 <Method void StringBuilder()>
	//  167  337:astore_2        
			((StringBuilder) (fragment)).append("Fragment ");
	//  168  338:aload_2         
	//  169  339:ldc1            #182 <String "Fragment ">
	//  170  341:invokevirtual   #137 <Method StringBuilder StringBuilder.append(String)>
	//  171  344:pop             
			((StringBuilder) (fragment)).append(((Class) (obj)).getCanonicalName());
	//  172  345:aload_2         
	//  173  346:aload           6
	//  174  348:invokevirtual   #185 <Method String Class.getCanonicalName()>
	//  175  351:invokevirtual   #137 <Method StringBuilder StringBuilder.append(String)>
	//  176  354:pop             
			((StringBuilder) (fragment)).append(" must be a public static class to be  properly recreated from");
	//  177  355:aload_2         
	//  178  356:ldc1            #187 <String " must be a public static class to be  properly recreated from">
	//  179  358:invokevirtual   #137 <Method StringBuilder StringBuilder.append(String)>
	//  180  361:pop             
			((StringBuilder) (fragment)).append(" instance state.");
	//  181  362:aload_2         
	//  182  363:ldc1            #189 <String " instance state.">
	//  183  365:invokevirtual   #137 <Method StringBuilder StringBuilder.append(String)>
	//  184  368:pop             
			throw new IllegalStateException(((StringBuilder) (fragment)).toString());
	//  185  369:new             #146 <Class IllegalStateException>
	//  186  372:dup             
	//  187  373:aload_2         
	//  188  374:invokevirtual   #150 <Method String StringBuilder.toString()>
	//  189  377:invokespecial   #153 <Method void IllegalStateException(String)>
	//  190  380:athrow          
		}
	}

	private static boolean isFragmentPostponed(Op op)
	{
		op = ((Op) (op.fragment));
	//    0    0:aload_0         
	//    1    1:getfield        #196 <Field Fragment BackStackRecord$Op.fragment>
	//    2    4:astore_0        
		return op != null && ((Fragment) (op)).mAdded && ((Fragment) (op)).mView != null && !((Fragment) (op)).mDetached && !((Fragment) (op)).mHidden && ((Fragment) (op)).isPostponed();
	//    3    5:aload_0         
	//    4    6:ifnull          46
	//    5    9:aload_0         
	//    6   10:getfield        #199 <Field boolean Fragment.mAdded>
	//    7   13:ifeq            46
	//    8   16:aload_0         
	//    9   17:getfield        #203 <Field View Fragment.mView>
	//   10   20:ifnull          46
	//   11   23:aload_0         
	//   12   24:getfield        #206 <Field boolean Fragment.mDetached>
	//   13   27:ifne            46
	//   14   30:aload_0         
	//   15   31:getfield        #209 <Field boolean Fragment.mHidden>
	//   16   34:ifne            46
	//   17   37:aload_0         
	//   18   38:invokevirtual   #212 <Method boolean Fragment.isPostponed()>
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
	//    5    5:invokespecial   #216 <Method void doAddOp(int, Fragment, String, int)>
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
	//    5    5:invokespecial   #216 <Method void doAddOp(int, Fragment, String, int)>
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
	//    5    5:invokespecial   #216 <Method void doAddOp(int, Fragment, String, int)>
		return ((FragmentTransaction) (this));
	//    6    8:aload_0         
	//    7    9:areturn         
	}

	void addOp(Op op)
	{
		mOps.add(((Object) (op)));
	//    0    0:aload_0         
	//    1    1:getfield        #75  <Field ArrayList mOps>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #220 <Method boolean ArrayList.add(Object)>
	//    4    8:pop             
		op.enterAnim = mEnterAnim;
	//    5    9:aload_1         
	//    6   10:aload_0         
	//    7   11:getfield        #222 <Field int mEnterAnim>
	//    8   14:putfield        #225 <Field int BackStackRecord$Op.enterAnim>
		op.exitAnim = mExitAnim;
	//    9   17:aload_1         
	//   10   18:aload_0         
	//   11   19:getfield        #227 <Field int mExitAnim>
	//   12   22:putfield        #230 <Field int BackStackRecord$Op.exitAnim>
		op.popEnterAnim = mPopEnterAnim;
	//   13   25:aload_1         
	//   14   26:aload_0         
	//   15   27:getfield        #232 <Field int mPopEnterAnim>
	//   16   30:putfield        #235 <Field int BackStackRecord$Op.popEnterAnim>
		op.popExitAnim = mPopExitAnim;
	//   17   33:aload_1         
	//   18   34:aload_0         
	//   19   35:getfield        #237 <Field int mPopExitAnim>
	//   20   38:putfield        #240 <Field int BackStackRecord$Op.popExitAnim>
	//   21   41:return          
	}

	public FragmentTransaction addSharedElement(View view, String s)
	{
label0:
		{
label1:
			{
label2:
				{
label3:
					{
						if(!FragmentTransition.supportsTransition())
							break label0;
	//    0    0:invokestatic    #247 <Method boolean FragmentTransition.supportsTransition()>
	//    1    3:ifeq            184
						view = ((View) (ViewCompat.getTransitionName(view)));
	//    2    6:aload_1         
	//    3    7:invokestatic    #253 <Method String ViewCompat.getTransitionName(View)>
	//    4   10:astore_1        
						if(view == null)
							break label1;
	//    5   11:aload_1         
	//    6   12:ifnull          173
						if(mSharedElementSourceNames == null)
	//*   7   15:aload_0         
	//*   8   16:getfield        #255 <Field ArrayList mSharedElementSourceNames>
	//*   9   19:ifnonnull       47
						{
							mSharedElementSourceNames = new ArrayList();
	//   10   22:aload_0         
	//   11   23:new             #72  <Class ArrayList>
	//   12   26:dup             
	//   13   27:invokespecial   #73  <Method void ArrayList()>
	//   14   30:putfield        #255 <Field ArrayList mSharedElementSourceNames>
							mSharedElementTargetNames = new ArrayList();
	//   15   33:aload_0         
	//   16   34:new             #72  <Class ArrayList>
	//   17   37:dup             
	//   18   38:invokespecial   #73  <Method void ArrayList()>
	//   19   41:putfield        #257 <Field ArrayList mSharedElementTargetNames>
						} else
	//*  20   44:goto            69
						{
							if(mSharedElementTargetNames.contains(((Object) (s))))
								break label2;
	//   21   47:aload_0         
	//   22   48:getfield        #257 <Field ArrayList mSharedElementTargetNames>
	//   23   51:aload_2         
	//   24   52:invokevirtual   #260 <Method boolean ArrayList.contains(Object)>
	//   25   55:ifne            131
							if(mSharedElementSourceNames.contains(((Object) (view))))
								break label3;
	//   26   58:aload_0         
	//   27   59:getfield        #255 <Field ArrayList mSharedElementSourceNames>
	//   28   62:aload_1         
	//   29   63:invokevirtual   #260 <Method boolean ArrayList.contains(Object)>
	//   30   66:ifne            89
						}
						mSharedElementSourceNames.add(((Object) (view)));
	//   31   69:aload_0         
	//   32   70:getfield        #255 <Field ArrayList mSharedElementSourceNames>
	//   33   73:aload_1         
	//   34   74:invokevirtual   #220 <Method boolean ArrayList.add(Object)>
	//   35   77:pop             
						mSharedElementTargetNames.add(((Object) (s)));
	//   36   78:aload_0         
	//   37   79:getfield        #257 <Field ArrayList mSharedElementTargetNames>
	//   38   82:aload_2         
	//   39   83:invokevirtual   #220 <Method boolean ArrayList.add(Object)>
	//   40   86:pop             
						return ((FragmentTransaction) (this));
	//   41   87:aload_0         
	//   42   88:areturn         
					}
					s = ((String) (new StringBuilder()));
	//   43   89:new             #130 <Class StringBuilder>
	//   44   92:dup             
	//   45   93:invokespecial   #131 <Method void StringBuilder()>
	//   46   96:astore_2        
					((StringBuilder) (s)).append("A shared element with the source name '");
	//   47   97:aload_2         
	//   48   98:ldc2            #262 <String "A shared element with the source name '">
	//   49  101:invokevirtual   #137 <Method StringBuilder StringBuilder.append(String)>
	//   50  104:pop             
					((StringBuilder) (s)).append(((String) (view)));
	//   51  105:aload_2         
	//   52  106:aload_1         
	//   53  107:invokevirtual   #137 <Method StringBuilder StringBuilder.append(String)>
	//   54  110:pop             
					((StringBuilder) (s)).append(" has already been added to the transaction.");
	//   55  111:aload_2         
	//   56  112:ldc2            #264 <String " has already been added to the transaction.">
	//   57  115:invokevirtual   #137 <Method StringBuilder StringBuilder.append(String)>
	//   58  118:pop             
					throw new IllegalArgumentException(((StringBuilder) (s)).toString());
	//   59  119:new             #172 <Class IllegalArgumentException>
	//   60  122:dup             
	//   61  123:aload_2         
	//   62  124:invokevirtual   #150 <Method String StringBuilder.toString()>
	//   63  127:invokespecial   #173 <Method void IllegalArgumentException(String)>
	//   64  130:athrow          
				}
				view = ((View) (new StringBuilder()));
	//   65  131:new             #130 <Class StringBuilder>
	//   66  134:dup             
	//   67  135:invokespecial   #131 <Method void StringBuilder()>
	//   68  138:astore_1        
				((StringBuilder) (view)).append("A shared element with the target name '");
	//   69  139:aload_1         
	//   70  140:ldc2            #266 <String "A shared element with the target name '">
	//   71  143:invokevirtual   #137 <Method StringBuilder StringBuilder.append(String)>
	//   72  146:pop             
				((StringBuilder) (view)).append(s);
	//   73  147:aload_1         
	//   74  148:aload_2         
	//   75  149:invokevirtual   #137 <Method StringBuilder StringBuilder.append(String)>
	//   76  152:pop             
				((StringBuilder) (view)).append("' has already been added to the transaction.");
	//   77  153:aload_1         
	//   78  154:ldc2            #268 <String "' has already been added to the transaction.">
	//   79  157:invokevirtual   #137 <Method StringBuilder StringBuilder.append(String)>
	//   80  160:pop             
				throw new IllegalArgumentException(((StringBuilder) (view)).toString());
	//   81  161:new             #172 <Class IllegalArgumentException>
	//   82  164:dup             
	//   83  165:aload_1         
	//   84  166:invokevirtual   #150 <Method String StringBuilder.toString()>
	//   85  169:invokespecial   #173 <Method void IllegalArgumentException(String)>
	//   86  172:athrow          
			}
			throw new IllegalArgumentException("Unique transitionNames are required for all sharedElements");
	//   87  173:new             #172 <Class IllegalArgumentException>
	//   88  176:dup             
	//   89  177:ldc2            #270 <String "Unique transitionNames are required for all sharedElements">
	//   90  180:invokespecial   #173 <Method void IllegalArgumentException(String)>
	//   91  183:athrow          
		}
		return ((FragmentTransaction) (this));
	//   92  184:aload_0         
	//   93  185:areturn         
	}

	public FragmentTransaction addToBackStack(String s)
	{
		if(mAllowAddToBackStack)
	//*   0    0:aload_0         
	//*   1    1:getfield        #77  <Field boolean mAllowAddToBackStack>
	//*   2    4:ifeq            19
		{
			mAddToBackStack = true;
	//    3    7:aload_0         
	//    4    8:iconst_1        
	//    5    9:putfield        #274 <Field boolean mAddToBackStack>
			mName = s;
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:putfield        #276 <Field String mName>
			return ((FragmentTransaction) (this));
	//    9   17:aload_0         
	//   10   18:areturn         
		} else
		{
			throw new IllegalStateException("This FragmentTransaction is not allowed to be added to the back stack.");
	//   11   19:new             #146 <Class IllegalStateException>
	//   12   22:dup             
	//   13   23:ldc2            #278 <String "This FragmentTransaction is not allowed to be added to the back stack.">
	//   14   26:invokespecial   #153 <Method void IllegalStateException(String)>
	//   15   29:athrow          
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
	//    5    8:invokespecial   #176 <Method void BackStackRecord$Op(int, Fragment)>
	//    6   11:invokevirtual   #180 <Method void addOp(BackStackRecord$Op)>
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
	//*   4    8:getstatic       #287 <Field boolean FragmentManagerImpl.DEBUG>
	//*   5   11:ifeq            66
		{
			StringBuilder stringbuilder = new StringBuilder();
	//    6   14:new             #130 <Class StringBuilder>
	//    7   17:dup             
	//    8   18:invokespecial   #131 <Method void StringBuilder()>
	//    9   21:astore          4
			stringbuilder.append("Bump nesting in ");
	//   10   23:aload           4
	//   11   25:ldc2            #289 <String "Bump nesting in ">
	//   12   28:invokevirtual   #137 <Method StringBuilder StringBuilder.append(String)>
	//   13   31:pop             
			stringbuilder.append(((Object) (this)));
	//   14   32:aload           4
	//   15   34:aload_0         
	//   16   35:invokevirtual   #140 <Method StringBuilder StringBuilder.append(Object)>
	//   17   38:pop             
			stringbuilder.append(" by ");
	//   18   39:aload           4
	//   19   41:ldc2            #291 <String " by ">
	//   20   44:invokevirtual   #137 <Method StringBuilder StringBuilder.append(String)>
	//   21   47:pop             
			stringbuilder.append(i);
	//   22   48:aload           4
	//   23   50:iload_1         
	//   24   51:invokevirtual   #161 <Method StringBuilder StringBuilder.append(int)>
	//   25   54:pop             
			Log.v("FragmentManager", stringbuilder.toString());
	//   26   55:ldc1            #36  <String "FragmentManager">
	//   27   57:aload           4
	//   28   59:invokevirtual   #150 <Method String StringBuilder.toString()>
	//   29   62:invokestatic    #297 <Method int Log.v(String, String)>
	//   30   65:pop             
		}
		int k = mOps.size();
	//   31   66:aload_0         
	//   32   67:getfield        #75  <Field ArrayList mOps>
	//   33   70:invokevirtual   #300 <Method int ArrayList.size()>
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
	//   41   82:getfield        #75  <Field ArrayList mOps>
	//   42   85:iload_2         
	//   43   86:invokevirtual   #304 <Method Object ArrayList.get(int)>
	//   44   89:checkcast       #10  <Class BackStackRecord$Op>
	//   45   92:astore          4
			if(op.fragment == null)
				continue;
	//   46   94:aload           4
	//   47   96:getfield        #196 <Field Fragment BackStackRecord$Op.fragment>
	//   48   99:ifnull          190
			Fragment fragment = op.fragment;
	//   49  102:aload           4
	//   50  104:getfield        #196 <Field Fragment BackStackRecord$Op.fragment>
	//   51  107:astore          5
			fragment.mBackStackNesting = fragment.mBackStackNesting + i;
	//   52  109:aload           5
	//   53  111:aload           5
	//   54  113:getfield        #307 <Field int Fragment.mBackStackNesting>
	//   55  116:iload_1         
	//   56  117:iadd            
	//   57  118:putfield        #307 <Field int Fragment.mBackStackNesting>
			if(FragmentManagerImpl.DEBUG)
	//*  58  121:getstatic       #287 <Field boolean FragmentManagerImpl.DEBUG>
	//*  59  124:ifeq            190
			{
				StringBuilder stringbuilder1 = new StringBuilder();
	//   60  127:new             #130 <Class StringBuilder>
	//   61  130:dup             
	//   62  131:invokespecial   #131 <Method void StringBuilder()>
	//   63  134:astore          5
				stringbuilder1.append("Bump nesting of ");
	//   64  136:aload           5
	//   65  138:ldc2            #309 <String "Bump nesting of ">
	//   66  141:invokevirtual   #137 <Method StringBuilder StringBuilder.append(String)>
	//   67  144:pop             
				stringbuilder1.append(((Object) (op.fragment)));
	//   68  145:aload           5
	//   69  147:aload           4
	//   70  149:getfield        #196 <Field Fragment BackStackRecord$Op.fragment>
	//   71  152:invokevirtual   #140 <Method StringBuilder StringBuilder.append(Object)>
	//   72  155:pop             
				stringbuilder1.append(" to ");
	//   73  156:aload           5
	//   74  158:ldc2            #311 <String " to ">
	//   75  161:invokevirtual   #137 <Method StringBuilder StringBuilder.append(String)>
	//   76  164:pop             
				stringbuilder1.append(op.fragment.mBackStackNesting);
	//   77  165:aload           5
	//   78  167:aload           4
	//   79  169:getfield        #196 <Field Fragment BackStackRecord$Op.fragment>
	//   80  172:getfield        #307 <Field int Fragment.mBackStackNesting>
	//   81  175:invokevirtual   #161 <Method StringBuilder StringBuilder.append(int)>
	//   82  178:pop             
				Log.v("FragmentManager", stringbuilder1.toString());
	//   83  179:ldc1            #36  <String "FragmentManager">
	//   84  181:aload           5
	//   85  183:invokevirtual   #150 <Method String StringBuilder.toString()>
	//   86  186:invokestatic    #297 <Method int Log.v(String, String)>
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
	//    2    2:invokevirtual   #316 <Method int commitInternal(boolean)>
	//    3    5:ireturn         
	}

	public int commitAllowingStateLoss()
	{
		return commitInternal(true);
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:invokevirtual   #316 <Method int commitInternal(boolean)>
	//    3    5:ireturn         
	}

	int commitInternal(boolean flag)
	{
		if(!mCommitted)
	//*   0    0:aload_0         
	//*   1    1:getfield        #319 <Field boolean mCommitted>
	//*   2    4:ifne            122
		{
			if(FragmentManagerImpl.DEBUG)
	//*   3    7:getstatic       #287 <Field boolean FragmentManagerImpl.DEBUG>
	//*   4   10:ifeq            76
			{
				Object obj = ((Object) (new StringBuilder()));
	//    5   13:new             #130 <Class StringBuilder>
	//    6   16:dup             
	//    7   17:invokespecial   #131 <Method void StringBuilder()>
	//    8   20:astore_2        
				((StringBuilder) (obj)).append("Commit: ");
	//    9   21:aload_2         
	//   10   22:ldc2            #321 <String "Commit: ">
	//   11   25:invokevirtual   #137 <Method StringBuilder StringBuilder.append(String)>
	//   12   28:pop             
				((StringBuilder) (obj)).append(((Object) (this)));
	//   13   29:aload_2         
	//   14   30:aload_0         
	//   15   31:invokevirtual   #140 <Method StringBuilder StringBuilder.append(Object)>
	//   16   34:pop             
				Log.v("FragmentManager", ((StringBuilder) (obj)).toString());
	//   17   35:ldc1            #36  <String "FragmentManager">
	//   18   37:aload_2         
	//   19   38:invokevirtual   #150 <Method String StringBuilder.toString()>
	//   20   41:invokestatic    #297 <Method int Log.v(String, String)>
	//   21   44:pop             
				obj = ((Object) (new PrintWriter(((java.io.Writer) (new LogWriter("FragmentManager"))))));
	//   22   45:new             #323 <Class PrintWriter>
	//   23   48:dup             
	//   24   49:new             #325 <Class LogWriter>
	//   25   52:dup             
	//   26   53:ldc1            #36  <String "FragmentManager">
	//   27   55:invokespecial   #326 <Method void LogWriter(String)>
	//   28   58:invokespecial   #329 <Method void PrintWriter(java.io.Writer)>
	//   29   61:astore_2        
				dump("  ", ((FileDescriptor) (null)), ((PrintWriter) (obj)), ((String []) (null)));
	//   30   62:aload_0         
	//   31   63:ldc2            #331 <String "  ">
	//   32   66:aconst_null     
	//   33   67:aload_2         
	//   34   68:aconst_null     
	//   35   69:invokevirtual   #335 <Method void dump(String, FileDescriptor, PrintWriter, String[])>
				((PrintWriter) (obj)).close();
	//   36   72:aload_2         
	//   37   73:invokevirtual   #338 <Method void PrintWriter.close()>
			}
			mCommitted = true;
	//   38   76:aload_0         
	//   39   77:iconst_1        
	//   40   78:putfield        #319 <Field boolean mCommitted>
			if(mAddToBackStack)
	//*  41   81:aload_0         
	//*  42   82:getfield        #274 <Field boolean mAddToBackStack>
	//*  43   85:ifeq            103
				mIndex = mManager.allocBackStackIndex(this);
	//   44   88:aload_0         
	//   45   89:aload_0         
	//   46   90:getfield        #83  <Field FragmentManagerImpl mManager>
	//   47   93:aload_0         
	//   48   94:invokevirtual   #342 <Method int FragmentManagerImpl.allocBackStackIndex(BackStackRecord)>
	//   49   97:putfield        #79  <Field int mIndex>
			else
	//*  50  100:goto            108
				mIndex = -1;
	//   51  103:aload_0         
	//   52  104:iconst_m1       
	//   53  105:putfield        #79  <Field int mIndex>
			mManager.enqueueAction(((FragmentManagerImpl.OpGenerator) (this)), flag);
	//   54  108:aload_0         
	//   55  109:getfield        #83  <Field FragmentManagerImpl mManager>
	//   56  112:aload_0         
	//   57  113:iload_1         
	//   58  114:invokevirtual   #346 <Method void FragmentManagerImpl.enqueueAction(FragmentManagerImpl$OpGenerator, boolean)>
			return mIndex;
	//   59  117:aload_0         
	//   60  118:getfield        #79  <Field int mIndex>
	//   61  121:ireturn         
		} else
		{
			throw new IllegalStateException("commit already called");
	//   62  122:new             #146 <Class IllegalStateException>
	//   63  125:dup             
	//   64  126:ldc2            #348 <String "commit already called">
	//   65  129:invokespecial   #153 <Method void IllegalStateException(String)>
	//   66  132:athrow          
		}
	}

	public void commitNow()
	{
		disallowAddToBackStack();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #353 <Method FragmentTransaction disallowAddToBackStack()>
	//    2    4:pop             
		mManager.execSingleAction(((FragmentManagerImpl.OpGenerator) (this)), false);
	//    3    5:aload_0         
	//    4    6:getfield        #83  <Field FragmentManagerImpl mManager>
	//    5    9:aload_0         
	//    6   10:iconst_0        
	//    7   11:invokevirtual   #356 <Method void FragmentManagerImpl.execSingleAction(FragmentManagerImpl$OpGenerator, boolean)>
	//    8   14:return          
	}

	public void commitNowAllowingStateLoss()
	{
		disallowAddToBackStack();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #353 <Method FragmentTransaction disallowAddToBackStack()>
	//    2    4:pop             
		mManager.execSingleAction(((FragmentManagerImpl.OpGenerator) (this)), true);
	//    3    5:aload_0         
	//    4    6:getfield        #83  <Field FragmentManagerImpl mManager>
	//    5    9:aload_0         
	//    6   10:iconst_1        
	//    7   11:invokevirtual   #356 <Method void FragmentManagerImpl.execSingleAction(FragmentManagerImpl$OpGenerator, boolean)>
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
	//    5    8:invokespecial   #176 <Method void BackStackRecord$Op(int, Fragment)>
	//    6   11:invokevirtual   #180 <Method void addOp(BackStackRecord$Op)>
		return ((FragmentTransaction) (this));
	//    7   14:aload_0         
	//    8   15:areturn         
	}

	public FragmentTransaction disallowAddToBackStack()
	{
		if(!mAddToBackStack)
	//*   0    0:aload_0         
	//*   1    1:getfield        #274 <Field boolean mAddToBackStack>
	//*   2    4:ifne            14
		{
			mAllowAddToBackStack = false;
	//    3    7:aload_0         
	//    4    8:iconst_0        
	//    5    9:putfield        #77  <Field boolean mAllowAddToBackStack>
			return ((FragmentTransaction) (this));
	//    6   12:aload_0         
	//    7   13:areturn         
		} else
		{
			throw new IllegalStateException("This transaction is already being added to the back stack");
	//    8   14:new             #146 <Class IllegalStateException>
	//    9   17:dup             
	//   10   18:ldc2            #360 <String "This transaction is already being added to the back stack">
	//   11   21:invokespecial   #153 <Method void IllegalStateException(String)>
	//   12   24:athrow          
		}
	}

	public void dump(String s, FileDescriptor filedescriptor, PrintWriter printwriter, String as[])
	{
		dump(s, printwriter, true);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_3         
	//    3    3:iconst_1        
	//    4    4:invokevirtual   #363 <Method void dump(String, PrintWriter, boolean)>
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
	//    4    6:invokevirtual   #366 <Method void PrintWriter.print(String)>
			printwriter.print("mName=");
	//    5    9:aload_2         
	//    6   10:ldc2            #368 <String "mName=">
	//    7   13:invokevirtual   #366 <Method void PrintWriter.print(String)>
			printwriter.print(mName);
	//    8   16:aload_2         
	//    9   17:aload_0         
	//   10   18:getfield        #276 <Field String mName>
	//   11   21:invokevirtual   #366 <Method void PrintWriter.print(String)>
			printwriter.print(" mIndex=");
	//   12   24:aload_2         
	//   13   25:ldc2            #370 <String " mIndex=">
	//   14   28:invokevirtual   #366 <Method void PrintWriter.print(String)>
			printwriter.print(mIndex);
	//   15   31:aload_2         
	//   16   32:aload_0         
	//   17   33:getfield        #79  <Field int mIndex>
	//   18   36:invokevirtual   #372 <Method void PrintWriter.print(int)>
			printwriter.print(" mCommitted=");
	//   19   39:aload_2         
	//   20   40:ldc2            #374 <String " mCommitted=">
	//   21   43:invokevirtual   #366 <Method void PrintWriter.print(String)>
			printwriter.println(mCommitted);
	//   22   46:aload_2         
	//   23   47:aload_0         
	//   24   48:getfield        #319 <Field boolean mCommitted>
	//   25   51:invokevirtual   #378 <Method void PrintWriter.println(boolean)>
			if(mTransition != 0)
	//*  26   54:aload_0         
	//*  27   55:getfield        #380 <Field int mTransition>
	//*  28   58:ifeq            102
			{
				printwriter.print(s);
	//   29   61:aload_2         
	//   30   62:aload_1         
	//   31   63:invokevirtual   #366 <Method void PrintWriter.print(String)>
				printwriter.print("mTransition=#");
	//   32   66:aload_2         
	//   33   67:ldc2            #382 <String "mTransition=#">
	//   34   70:invokevirtual   #366 <Method void PrintWriter.print(String)>
				printwriter.print(Integer.toHexString(mTransition));
	//   35   73:aload_2         
	//   36   74:aload_0         
	//   37   75:getfield        #380 <Field int mTransition>
	//   38   78:invokestatic    #388 <Method String Integer.toHexString(int)>
	//   39   81:invokevirtual   #366 <Method void PrintWriter.print(String)>
				printwriter.print(" mTransitionStyle=#");
	//   40   84:aload_2         
	//   41   85:ldc2            #390 <String " mTransitionStyle=#">
	//   42   88:invokevirtual   #366 <Method void PrintWriter.print(String)>
				printwriter.println(Integer.toHexString(mTransitionStyle));
	//   43   91:aload_2         
	//   44   92:aload_0         
	//   45   93:getfield        #392 <Field int mTransitionStyle>
	//   46   96:invokestatic    #388 <Method String Integer.toHexString(int)>
	//   47   99:invokevirtual   #394 <Method void PrintWriter.println(String)>
			}
			if(mEnterAnim != 0 || mExitAnim != 0)
	//*  48  102:aload_0         
	//*  49  103:getfield        #222 <Field int mEnterAnim>
	//*  50  106:ifne            116
	//*  51  109:aload_0         
	//*  52  110:getfield        #227 <Field int mExitAnim>
	//*  53  113:ifeq            157
			{
				printwriter.print(s);
	//   54  116:aload_2         
	//   55  117:aload_1         
	//   56  118:invokevirtual   #366 <Method void PrintWriter.print(String)>
				printwriter.print("mEnterAnim=#");
	//   57  121:aload_2         
	//   58  122:ldc2            #396 <String "mEnterAnim=#">
	//   59  125:invokevirtual   #366 <Method void PrintWriter.print(String)>
				printwriter.print(Integer.toHexString(mEnterAnim));
	//   60  128:aload_2         
	//   61  129:aload_0         
	//   62  130:getfield        #222 <Field int mEnterAnim>
	//   63  133:invokestatic    #388 <Method String Integer.toHexString(int)>
	//   64  136:invokevirtual   #366 <Method void PrintWriter.print(String)>
				printwriter.print(" mExitAnim=#");
	//   65  139:aload_2         
	//   66  140:ldc2            #398 <String " mExitAnim=#">
	//   67  143:invokevirtual   #366 <Method void PrintWriter.print(String)>
				printwriter.println(Integer.toHexString(mExitAnim));
	//   68  146:aload_2         
	//   69  147:aload_0         
	//   70  148:getfield        #227 <Field int mExitAnim>
	//   71  151:invokestatic    #388 <Method String Integer.toHexString(int)>
	//   72  154:invokevirtual   #394 <Method void PrintWriter.println(String)>
			}
			if(mPopEnterAnim != 0 || mPopExitAnim != 0)
	//*  73  157:aload_0         
	//*  74  158:getfield        #232 <Field int mPopEnterAnim>
	//*  75  161:ifne            171
	//*  76  164:aload_0         
	//*  77  165:getfield        #237 <Field int mPopExitAnim>
	//*  78  168:ifeq            212
			{
				printwriter.print(s);
	//   79  171:aload_2         
	//   80  172:aload_1         
	//   81  173:invokevirtual   #366 <Method void PrintWriter.print(String)>
				printwriter.print("mPopEnterAnim=#");
	//   82  176:aload_2         
	//   83  177:ldc2            #400 <String "mPopEnterAnim=#">
	//   84  180:invokevirtual   #366 <Method void PrintWriter.print(String)>
				printwriter.print(Integer.toHexString(mPopEnterAnim));
	//   85  183:aload_2         
	//   86  184:aload_0         
	//   87  185:getfield        #232 <Field int mPopEnterAnim>
	//   88  188:invokestatic    #388 <Method String Integer.toHexString(int)>
	//   89  191:invokevirtual   #366 <Method void PrintWriter.print(String)>
				printwriter.print(" mPopExitAnim=#");
	//   90  194:aload_2         
	//   91  195:ldc2            #402 <String " mPopExitAnim=#">
	//   92  198:invokevirtual   #366 <Method void PrintWriter.print(String)>
				printwriter.println(Integer.toHexString(mPopExitAnim));
	//   93  201:aload_2         
	//   94  202:aload_0         
	//   95  203:getfield        #237 <Field int mPopExitAnim>
	//   96  206:invokestatic    #388 <Method String Integer.toHexString(int)>
	//   97  209:invokevirtual   #394 <Method void PrintWriter.println(String)>
			}
			if(mBreadCrumbTitleRes != 0 || mBreadCrumbTitleText != null)
	//*  98  212:aload_0         
	//*  99  213:getfield        #404 <Field int mBreadCrumbTitleRes>
	//* 100  216:ifne            226
	//* 101  219:aload_0         
	//* 102  220:getfield        #406 <Field CharSequence mBreadCrumbTitleText>
	//* 103  223:ifnull          264
			{
				printwriter.print(s);
	//  104  226:aload_2         
	//  105  227:aload_1         
	//  106  228:invokevirtual   #366 <Method void PrintWriter.print(String)>
				printwriter.print("mBreadCrumbTitleRes=#");
	//  107  231:aload_2         
	//  108  232:ldc2            #408 <String "mBreadCrumbTitleRes=#">
	//  109  235:invokevirtual   #366 <Method void PrintWriter.print(String)>
				printwriter.print(Integer.toHexString(mBreadCrumbTitleRes));
	//  110  238:aload_2         
	//  111  239:aload_0         
	//  112  240:getfield        #404 <Field int mBreadCrumbTitleRes>
	//  113  243:invokestatic    #388 <Method String Integer.toHexString(int)>
	//  114  246:invokevirtual   #366 <Method void PrintWriter.print(String)>
				printwriter.print(" mBreadCrumbTitleText=");
	//  115  249:aload_2         
	//  116  250:ldc2            #410 <String " mBreadCrumbTitleText=">
	//  117  253:invokevirtual   #366 <Method void PrintWriter.print(String)>
				printwriter.println(((Object) (mBreadCrumbTitleText)));
	//  118  256:aload_2         
	//  119  257:aload_0         
	//  120  258:getfield        #406 <Field CharSequence mBreadCrumbTitleText>
	//  121  261:invokevirtual   #413 <Method void PrintWriter.println(Object)>
			}
			if(mBreadCrumbShortTitleRes != 0 || mBreadCrumbShortTitleText != null)
	//* 122  264:aload_0         
	//* 123  265:getfield        #415 <Field int mBreadCrumbShortTitleRes>
	//* 124  268:ifne            278
	//* 125  271:aload_0         
	//* 126  272:getfield        #417 <Field CharSequence mBreadCrumbShortTitleText>
	//* 127  275:ifnull          316
			{
				printwriter.print(s);
	//  128  278:aload_2         
	//  129  279:aload_1         
	//  130  280:invokevirtual   #366 <Method void PrintWriter.print(String)>
				printwriter.print("mBreadCrumbShortTitleRes=#");
	//  131  283:aload_2         
	//  132  284:ldc2            #419 <String "mBreadCrumbShortTitleRes=#">
	//  133  287:invokevirtual   #366 <Method void PrintWriter.print(String)>
				printwriter.print(Integer.toHexString(mBreadCrumbShortTitleRes));
	//  134  290:aload_2         
	//  135  291:aload_0         
	//  136  292:getfield        #415 <Field int mBreadCrumbShortTitleRes>
	//  137  295:invokestatic    #388 <Method String Integer.toHexString(int)>
	//  138  298:invokevirtual   #366 <Method void PrintWriter.print(String)>
				printwriter.print(" mBreadCrumbShortTitleText=");
	//  139  301:aload_2         
	//  140  302:ldc2            #421 <String " mBreadCrumbShortTitleText=">
	//  141  305:invokevirtual   #366 <Method void PrintWriter.print(String)>
				printwriter.println(((Object) (mBreadCrumbShortTitleText)));
	//  142  308:aload_2         
	//  143  309:aload_0         
	//  144  310:getfield        #417 <Field CharSequence mBreadCrumbShortTitleText>
	//  145  313:invokevirtual   #413 <Method void PrintWriter.println(Object)>
			}
		}
		if(!mOps.isEmpty())
	//* 146  316:aload_0         
	//* 147  317:getfield        #75  <Field ArrayList mOps>
	//* 148  320:invokevirtual   #424 <Method boolean ArrayList.isEmpty()>
	//* 149  323:ifne            754
		{
			printwriter.print(s);
	//  150  326:aload_2         
	//  151  327:aload_1         
	//  152  328:invokevirtual   #366 <Method void PrintWriter.print(String)>
			printwriter.println("Operations:");
	//  153  331:aload_2         
	//  154  332:ldc2            #426 <String "Operations:">
	//  155  335:invokevirtual   #394 <Method void PrintWriter.println(String)>
			StringBuilder stringbuilder = new StringBuilder();
	//  156  338:new             #130 <Class StringBuilder>
	//  157  341:dup             
	//  158  342:invokespecial   #131 <Method void StringBuilder()>
	//  159  345:astore          6
			stringbuilder.append(s);
	//  160  347:aload           6
	//  161  349:aload_1         
	//  162  350:invokevirtual   #137 <Method StringBuilder StringBuilder.append(String)>
	//  163  353:pop             
			stringbuilder.append("    ");
	//  164  354:aload           6
	//  165  356:ldc2            #428 <String "    ">
	//  166  359:invokevirtual   #137 <Method StringBuilder StringBuilder.append(String)>
	//  167  362:pop             
			stringbuilder.toString();
	//  168  363:aload           6
	//  169  365:invokevirtual   #150 <Method String StringBuilder.toString()>
	//  170  368:pop             
			int j = mOps.size();
	//  171  369:aload_0         
	//  172  370:getfield        #75  <Field ArrayList mOps>
	//  173  373:invokevirtual   #300 <Method int ArrayList.size()>
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
	//  181  389:getfield        #75  <Field ArrayList mOps>
	//  182  392:iload           4
	//  183  394:invokevirtual   #304 <Method Object ArrayList.get(int)>
	//  184  397:checkcast       #10  <Class BackStackRecord$Op>
	//  185  400:astore          7
				Object obj;
				switch(op.cmd)
	//* 186  402:aload           7
	//* 187  404:getfield        #431 <Field int BackStackRecord$Op.cmd>
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
	//  189  460:new             #130 <Class StringBuilder>
	//  190  463:dup             
	//  191  464:invokespecial   #131 <Method void StringBuilder()>
	//  192  467:astore          6
					((StringBuilder) (obj)).append("cmd=");
	//  193  469:aload           6
	//  194  471:ldc2            #433 <String "cmd=">
	//  195  474:invokevirtual   #137 <Method StringBuilder StringBuilder.append(String)>
	//  196  477:pop             
					((StringBuilder) (obj)).append(op.cmd);
	//  197  478:aload           6
	//  198  480:aload           7
	//  199  482:getfield        #431 <Field int BackStackRecord$Op.cmd>
	//  200  485:invokevirtual   #161 <Method StringBuilder StringBuilder.append(int)>
	//  201  488:pop             
					obj = ((Object) (((StringBuilder) (obj)).toString()));
	//  202  489:aload           6
	//  203  491:invokevirtual   #150 <Method String StringBuilder.toString()>
	//  204  494:astore          6
					break;

	//* 205  496:goto            576
				case 9: // '\t'
					obj = "UNSET_PRIMARY_NAV";
	//  206  499:ldc2            #435 <String "UNSET_PRIMARY_NAV">
	//  207  502:astore          6
					break;

	//* 208  504:goto            576
				case 8: // '\b'
					obj = "SET_PRIMARY_NAV";
	//  209  507:ldc2            #437 <String "SET_PRIMARY_NAV">
	//  210  510:astore          6
					break;

	//* 211  512:goto            576
				case 7: // '\007'
					obj = "ATTACH";
	//  212  515:ldc2            #439 <String "ATTACH">
	//  213  518:astore          6
					break;

	//* 214  520:goto            576
				case 6: // '\006'
					obj = "DETACH";
	//  215  523:ldc2            #441 <String "DETACH">
	//  216  526:astore          6
					break;

	//* 217  528:goto            576
				case 5: // '\005'
					obj = "SHOW";
	//  218  531:ldc2            #443 <String "SHOW">
	//  219  534:astore          6
					break;

	//* 220  536:goto            576
				case 4: // '\004'
					obj = "HIDE";
	//  221  539:ldc2            #445 <String "HIDE">
	//  222  542:astore          6
					break;

	//* 223  544:goto            576
				case 3: // '\003'
					obj = "REMOVE";
	//  224  547:ldc2            #447 <String "REMOVE">
	//  225  550:astore          6
					break;

	//* 226  552:goto            576
				case 2: // '\002'
					obj = "REPLACE";
	//  227  555:ldc2            #449 <String "REPLACE">
	//  228  558:astore          6
					break;

	//* 229  560:goto            576
				case 1: // '\001'
					obj = "ADD";
	//  230  563:ldc2            #451 <String "ADD">
	//  231  566:astore          6
					break;

	//* 232  568:goto            576
				case 0: // '\0'
					obj = "NULL";
	//  233  571:ldc2            #453 <String "NULL">
	//  234  574:astore          6
					break;
				}
				printwriter.print(s);
	//  235  576:aload_2         
	//  236  577:aload_1         
	//  237  578:invokevirtual   #366 <Method void PrintWriter.print(String)>
				printwriter.print("  Op #");
	//  238  581:aload_2         
	//  239  582:ldc2            #455 <String "  Op #">
	//  240  585:invokevirtual   #366 <Method void PrintWriter.print(String)>
				printwriter.print(i);
	//  241  588:aload_2         
	//  242  589:iload           4
	//  243  591:invokevirtual   #372 <Method void PrintWriter.print(int)>
				printwriter.print(": ");
	//  244  594:aload_2         
	//  245  595:ldc2            #457 <String ": ">
	//  246  598:invokevirtual   #366 <Method void PrintWriter.print(String)>
				printwriter.print(((String) (obj)));
	//  247  601:aload_2         
	//  248  602:aload           6
	//  249  604:invokevirtual   #366 <Method void PrintWriter.print(String)>
				printwriter.print(" ");
	//  250  607:aload_2         
	//  251  608:ldc2            #459 <String " ">
	//  252  611:invokevirtual   #366 <Method void PrintWriter.print(String)>
				printwriter.println(((Object) (op.fragment)));
	//  253  614:aload_2         
	//  254  615:aload           7
	//  255  617:getfield        #196 <Field Fragment BackStackRecord$Op.fragment>
	//  256  620:invokevirtual   #413 <Method void PrintWriter.println(Object)>
				if(!flag)
					continue;
	//  257  623:iload_3         
	//  258  624:ifeq            745
				if(op.enterAnim != 0 || op.exitAnim != 0)
	//* 259  627:aload           7
	//* 260  629:getfield        #225 <Field int BackStackRecord$Op.enterAnim>
	//* 261  632:ifne            643
	//* 262  635:aload           7
	//* 263  637:getfield        #230 <Field int BackStackRecord$Op.exitAnim>
	//* 264  640:ifeq            686
				{
					printwriter.print(s);
	//  265  643:aload_2         
	//  266  644:aload_1         
	//  267  645:invokevirtual   #366 <Method void PrintWriter.print(String)>
					printwriter.print("enterAnim=#");
	//  268  648:aload_2         
	//  269  649:ldc2            #461 <String "enterAnim=#">
	//  270  652:invokevirtual   #366 <Method void PrintWriter.print(String)>
					printwriter.print(Integer.toHexString(op.enterAnim));
	//  271  655:aload_2         
	//  272  656:aload           7
	//  273  658:getfield        #225 <Field int BackStackRecord$Op.enterAnim>
	//  274  661:invokestatic    #388 <Method String Integer.toHexString(int)>
	//  275  664:invokevirtual   #366 <Method void PrintWriter.print(String)>
					printwriter.print(" exitAnim=#");
	//  276  667:aload_2         
	//  277  668:ldc2            #463 <String " exitAnim=#">
	//  278  671:invokevirtual   #366 <Method void PrintWriter.print(String)>
					printwriter.println(Integer.toHexString(op.exitAnim));
	//  279  674:aload_2         
	//  280  675:aload           7
	//  281  677:getfield        #230 <Field int BackStackRecord$Op.exitAnim>
	//  282  680:invokestatic    #388 <Method String Integer.toHexString(int)>
	//  283  683:invokevirtual   #394 <Method void PrintWriter.println(String)>
				}
				if(op.popEnterAnim != 0 || op.popExitAnim != 0)
	//* 284  686:aload           7
	//* 285  688:getfield        #235 <Field int BackStackRecord$Op.popEnterAnim>
	//* 286  691:ifne            702
	//* 287  694:aload           7
	//* 288  696:getfield        #240 <Field int BackStackRecord$Op.popExitAnim>
	//* 289  699:ifeq            745
				{
					printwriter.print(s);
	//  290  702:aload_2         
	//  291  703:aload_1         
	//  292  704:invokevirtual   #366 <Method void PrintWriter.print(String)>
					printwriter.print("popEnterAnim=#");
	//  293  707:aload_2         
	//  294  708:ldc2            #465 <String "popEnterAnim=#">
	//  295  711:invokevirtual   #366 <Method void PrintWriter.print(String)>
					printwriter.print(Integer.toHexString(op.popEnterAnim));
	//  296  714:aload_2         
	//  297  715:aload           7
	//  298  717:getfield        #235 <Field int BackStackRecord$Op.popEnterAnim>
	//  299  720:invokestatic    #388 <Method String Integer.toHexString(int)>
	//  300  723:invokevirtual   #366 <Method void PrintWriter.print(String)>
					printwriter.print(" popExitAnim=#");
	//  301  726:aload_2         
	//  302  727:ldc2            #467 <String " popExitAnim=#">
	//  303  730:invokevirtual   #366 <Method void PrintWriter.print(String)>
					printwriter.println(Integer.toHexString(op.popExitAnim));
	//  304  733:aload_2         
	//  305  734:aload           7
	//  306  736:getfield        #240 <Field int BackStackRecord$Op.popExitAnim>
	//  307  739:invokestatic    #388 <Method String Integer.toHexString(int)>
	//  308  742:invokevirtual   #394 <Method void PrintWriter.println(String)>
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
	//    1    1:getfield        #75  <Field ArrayList mOps>
	//    2    4:invokevirtual   #300 <Method int ArrayList.size()>
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
	//   10   16:getfield        #75  <Field ArrayList mOps>
	//   11   19:iload_1         
	//   12   20:invokevirtual   #304 <Method Object ArrayList.get(int)>
	//   13   23:checkcast       #10  <Class BackStackRecord$Op>
	//   14   26:astore          4
			Object obj = ((Object) (op.fragment));
	//   15   28:aload           4
	//   16   30:getfield        #196 <Field Fragment BackStackRecord$Op.fragment>
	//   17   33:astore          5
			if(obj != null)
	//*  18   35:aload           5
	//*  19   37:ifnull          53
				((Fragment) (obj)).setNextTransition(mTransition, mTransitionStyle);
	//   20   40:aload           5
	//   21   42:aload_0         
	//   22   43:getfield        #380 <Field int mTransition>
	//   23   46:aload_0         
	//   24   47:getfield        #392 <Field int mTransitionStyle>
	//   25   50:invokevirtual   #472 <Method void Fragment.setNextTransition(int, int)>
			int k = op.cmd;
	//   26   53:aload           4
	//   27   55:getfield        #431 <Field int BackStackRecord$Op.cmd>
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
	//   34  108:new             #130 <Class StringBuilder>
	//   35  111:dup             
	//   36  112:invokespecial   #131 <Method void StringBuilder()>
	//   37  115:astore          5
					((StringBuilder) (obj)).append("Unknown cmd: ");
	//   38  117:aload           5
	//   39  119:ldc2            #474 <String "Unknown cmd: ">
	//   40  122:invokevirtual   #137 <Method StringBuilder StringBuilder.append(String)>
	//   41  125:pop             
					((StringBuilder) (obj)).append(op.cmd);
	//   42  126:aload           5
	//   43  128:aload           4
	//   44  130:getfield        #431 <Field int BackStackRecord$Op.cmd>
	//   45  133:invokevirtual   #161 <Method StringBuilder StringBuilder.append(int)>
	//   46  136:pop             
					throw new IllegalArgumentException(((StringBuilder) (obj)).toString());
	//   47  137:new             #172 <Class IllegalArgumentException>
	//   48  140:dup             
	//   49  141:aload           5
	//   50  143:invokevirtual   #150 <Method String StringBuilder.toString()>
	//   51  146:invokespecial   #173 <Method void IllegalArgumentException(String)>
	//   52  149:athrow          

				case 9: // '\t'
					mManager.setPrimaryNavigationFragment(((Fragment) (null)));
	//   53  150:aload_0         
	//   54  151:getfield        #83  <Field FragmentManagerImpl mManager>
	//   55  154:aconst_null     
	//   56  155:invokevirtual   #478 <Method void FragmentManagerImpl.setPrimaryNavigationFragment(Fragment)>
					break;

	//*  57  158:goto            303
				case 8: // '\b'
					mManager.setPrimaryNavigationFragment(((Fragment) (obj)));
	//   58  161:aload_0         
	//   59  162:getfield        #83  <Field FragmentManagerImpl mManager>
	//   60  165:aload           5
	//   61  167:invokevirtual   #478 <Method void FragmentManagerImpl.setPrimaryNavigationFragment(Fragment)>
					break;

	//*  62  170:goto            303
				case 7: // '\007'
					((Fragment) (obj)).setNextAnim(op.enterAnim);
	//   63  173:aload           5
	//   64  175:aload           4
	//   65  177:getfield        #225 <Field int BackStackRecord$Op.enterAnim>
	//   66  180:invokevirtual   #481 <Method void Fragment.setNextAnim(int)>
					mManager.attachFragment(((Fragment) (obj)));
	//   67  183:aload_0         
	//   68  184:getfield        #83  <Field FragmentManagerImpl mManager>
	//   69  187:aload           5
	//   70  189:invokevirtual   #484 <Method void FragmentManagerImpl.attachFragment(Fragment)>
					break;

	//*  71  192:goto            303
				case 6: // '\006'
					((Fragment) (obj)).setNextAnim(op.exitAnim);
	//   72  195:aload           5
	//   73  197:aload           4
	//   74  199:getfield        #230 <Field int BackStackRecord$Op.exitAnim>
	//   75  202:invokevirtual   #481 <Method void Fragment.setNextAnim(int)>
					mManager.detachFragment(((Fragment) (obj)));
	//   76  205:aload_0         
	//   77  206:getfield        #83  <Field FragmentManagerImpl mManager>
	//   78  209:aload           5
	//   79  211:invokevirtual   #487 <Method void FragmentManagerImpl.detachFragment(Fragment)>
					break;

	//*  80  214:goto            303
				case 5: // '\005'
					((Fragment) (obj)).setNextAnim(op.enterAnim);
	//   81  217:aload           5
	//   82  219:aload           4
	//   83  221:getfield        #225 <Field int BackStackRecord$Op.enterAnim>
	//   84  224:invokevirtual   #481 <Method void Fragment.setNextAnim(int)>
					mManager.showFragment(((Fragment) (obj)));
	//   85  227:aload_0         
	//   86  228:getfield        #83  <Field FragmentManagerImpl mManager>
	//   87  231:aload           5
	//   88  233:invokevirtual   #490 <Method void FragmentManagerImpl.showFragment(Fragment)>
					break;

	//*  89  236:goto            303
				case 4: // '\004'
					((Fragment) (obj)).setNextAnim(op.exitAnim);
	//   90  239:aload           5
	//   91  241:aload           4
	//   92  243:getfield        #230 <Field int BackStackRecord$Op.exitAnim>
	//   93  246:invokevirtual   #481 <Method void Fragment.setNextAnim(int)>
					mManager.hideFragment(((Fragment) (obj)));
	//   94  249:aload_0         
	//   95  250:getfield        #83  <Field FragmentManagerImpl mManager>
	//   96  253:aload           5
	//   97  255:invokevirtual   #493 <Method void FragmentManagerImpl.hideFragment(Fragment)>
					break;

	//*  98  258:goto            303
				case 3: // '\003'
					((Fragment) (obj)).setNextAnim(op.exitAnim);
	//   99  261:aload           5
	//  100  263:aload           4
	//  101  265:getfield        #230 <Field int BackStackRecord$Op.exitAnim>
	//  102  268:invokevirtual   #481 <Method void Fragment.setNextAnim(int)>
					mManager.removeFragment(((Fragment) (obj)));
	//  103  271:aload_0         
	//  104  272:getfield        #83  <Field FragmentManagerImpl mManager>
	//  105  275:aload           5
	//  106  277:invokevirtual   #496 <Method void FragmentManagerImpl.removeFragment(Fragment)>
					break;
				}
			} else
	//* 107  280:goto            303
			{
				((Fragment) (obj)).setNextAnim(op.enterAnim);
	//  108  283:aload           5
	//  109  285:aload           4
	//  110  287:getfield        #225 <Field int BackStackRecord$Op.enterAnim>
	//  111  290:invokevirtual   #481 <Method void Fragment.setNextAnim(int)>
				mManager.addFragment(((Fragment) (obj)), false);
	//  112  293:aload_0         
	//  113  294:getfield        #83  <Field FragmentManagerImpl mManager>
	//  114  297:aload           5
	//  115  299:iconst_0        
	//  116  300:invokevirtual   #500 <Method void FragmentManagerImpl.addFragment(Fragment, boolean)>
			}
			if(!mReorderingAllowed && op.cmd != 1 && obj != null)
	//* 117  303:aload_0         
	//* 118  304:getfield        #81  <Field boolean mReorderingAllowed>
	//* 119  307:ifne            333
	//* 120  310:aload           4
	//* 121  312:getfield        #431 <Field int BackStackRecord$Op.cmd>
	//* 122  315:iconst_1        
	//* 123  316:icmpeq          333
	//* 124  319:aload           5
	//* 125  321:ifnull          333
				mManager.moveFragmentToExpectedState(((Fragment) (obj)));
	//  126  324:aload_0         
	//  127  325:getfield        #83  <Field FragmentManagerImpl mManager>
	//  128  328:aload           5
	//  129  330:invokevirtual   #503 <Method void FragmentManagerImpl.moveFragmentToExpectedState(Fragment)>
		}

	//  130  333:iload_1         
	//  131  334:iconst_1        
	//  132  335:iadd            
	//  133  336:istore_1        
	//* 134  337:goto            10
		if(!mReorderingAllowed)
	//* 135  340:aload_0         
	//* 136  341:getfield        #81  <Field boolean mReorderingAllowed>
	//* 137  344:ifne            364
		{
			FragmentManagerImpl fragmentmanagerimpl = mManager;
	//  138  347:aload_0         
	//  139  348:getfield        #83  <Field FragmentManagerImpl mManager>
	//  140  351:astore          4
			fragmentmanagerimpl.moveToState(fragmentmanagerimpl.mCurState, true);
	//  141  353:aload           4
	//  142  355:aload           4
	//  143  357:getfield        #506 <Field int FragmentManagerImpl.mCurState>
	//  144  360:iconst_1        
	//  145  361:invokevirtual   #510 <Method void FragmentManagerImpl.moveToState(int, boolean)>
		}
	//  146  364:return          
	}

	void executePopOps(boolean flag)
	{
		for(int i = mOps.size() - 1; i >= 0; i--)
	//*   0    0:aload_0         
	//*   1    1:getfield        #75  <Field ArrayList mOps>
	//*   2    4:invokevirtual   #300 <Method int ArrayList.size()>
	//*   3    7:iconst_1        
	//*   4    8:isub            
	//*   5    9:istore_2        
	//*   6   10:iload_2         
	//*   7   11:iflt            340
		{
			Op op = (Op)mOps.get(i);
	//    8   14:aload_0         
	//    9   15:getfield        #75  <Field ArrayList mOps>
	//   10   18:iload_2         
	//   11   19:invokevirtual   #304 <Method Object ArrayList.get(int)>
	//   12   22:checkcast       #10  <Class BackStackRecord$Op>
	//   13   25:astore          4
			Object obj = ((Object) (op.fragment));
	//   14   27:aload           4
	//   15   29:getfield        #196 <Field Fragment BackStackRecord$Op.fragment>
	//   16   32:astore          5
			if(obj != null)
	//*  17   34:aload           5
	//*  18   36:ifnull          55
				((Fragment) (obj)).setNextTransition(FragmentManagerImpl.reverseTransit(mTransition), mTransitionStyle);
	//   19   39:aload           5
	//   20   41:aload_0         
	//   21   42:getfield        #380 <Field int mTransition>
	//   22   45:invokestatic    #515 <Method int FragmentManagerImpl.reverseTransit(int)>
	//   23   48:aload_0         
	//   24   49:getfield        #392 <Field int mTransitionStyle>
	//   25   52:invokevirtual   #472 <Method void Fragment.setNextTransition(int, int)>
			int j = op.cmd;
	//   26   55:aload           4
	//   27   57:getfield        #431 <Field int BackStackRecord$Op.cmd>
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
	//   34  108:new             #130 <Class StringBuilder>
	//   35  111:dup             
	//   36  112:invokespecial   #131 <Method void StringBuilder()>
	//   37  115:astore          5
					((StringBuilder) (obj)).append("Unknown cmd: ");
	//   38  117:aload           5
	//   39  119:ldc2            #474 <String "Unknown cmd: ">
	//   40  122:invokevirtual   #137 <Method StringBuilder StringBuilder.append(String)>
	//   41  125:pop             
					((StringBuilder) (obj)).append(op.cmd);
	//   42  126:aload           5
	//   43  128:aload           4
	//   44  130:getfield        #431 <Field int BackStackRecord$Op.cmd>
	//   45  133:invokevirtual   #161 <Method StringBuilder StringBuilder.append(int)>
	//   46  136:pop             
					throw new IllegalArgumentException(((StringBuilder) (obj)).toString());
	//   47  137:new             #172 <Class IllegalArgumentException>
	//   48  140:dup             
	//   49  141:aload           5
	//   50  143:invokevirtual   #150 <Method String StringBuilder.toString()>
	//   51  146:invokespecial   #173 <Method void IllegalArgumentException(String)>
	//   52  149:athrow          

				case 9: // '\t'
					mManager.setPrimaryNavigationFragment(((Fragment) (obj)));
	//   53  150:aload_0         
	//   54  151:getfield        #83  <Field FragmentManagerImpl mManager>
	//   55  154:aload           5
	//   56  156:invokevirtual   #478 <Method void FragmentManagerImpl.setPrimaryNavigationFragment(Fragment)>
					break;

	//*  57  159:goto            303
				case 8: // '\b'
					mManager.setPrimaryNavigationFragment(((Fragment) (null)));
	//   58  162:aload_0         
	//   59  163:getfield        #83  <Field FragmentManagerImpl mManager>
	//   60  166:aconst_null     
	//   61  167:invokevirtual   #478 <Method void FragmentManagerImpl.setPrimaryNavigationFragment(Fragment)>
					break;

	//*  62  170:goto            303
				case 7: // '\007'
					((Fragment) (obj)).setNextAnim(op.popExitAnim);
	//   63  173:aload           5
	//   64  175:aload           4
	//   65  177:getfield        #240 <Field int BackStackRecord$Op.popExitAnim>
	//   66  180:invokevirtual   #481 <Method void Fragment.setNextAnim(int)>
					mManager.detachFragment(((Fragment) (obj)));
	//   67  183:aload_0         
	//   68  184:getfield        #83  <Field FragmentManagerImpl mManager>
	//   69  187:aload           5
	//   70  189:invokevirtual   #487 <Method void FragmentManagerImpl.detachFragment(Fragment)>
					break;

	//*  71  192:goto            303
				case 6: // '\006'
					((Fragment) (obj)).setNextAnim(op.popEnterAnim);
	//   72  195:aload           5
	//   73  197:aload           4
	//   74  199:getfield        #235 <Field int BackStackRecord$Op.popEnterAnim>
	//   75  202:invokevirtual   #481 <Method void Fragment.setNextAnim(int)>
					mManager.attachFragment(((Fragment) (obj)));
	//   76  205:aload_0         
	//   77  206:getfield        #83  <Field FragmentManagerImpl mManager>
	//   78  209:aload           5
	//   79  211:invokevirtual   #484 <Method void FragmentManagerImpl.attachFragment(Fragment)>
					break;

	//*  80  214:goto            303
				case 5: // '\005'
					((Fragment) (obj)).setNextAnim(op.popExitAnim);
	//   81  217:aload           5
	//   82  219:aload           4
	//   83  221:getfield        #240 <Field int BackStackRecord$Op.popExitAnim>
	//   84  224:invokevirtual   #481 <Method void Fragment.setNextAnim(int)>
					mManager.hideFragment(((Fragment) (obj)));
	//   85  227:aload_0         
	//   86  228:getfield        #83  <Field FragmentManagerImpl mManager>
	//   87  231:aload           5
	//   88  233:invokevirtual   #493 <Method void FragmentManagerImpl.hideFragment(Fragment)>
					break;

	//*  89  236:goto            303
				case 4: // '\004'
					((Fragment) (obj)).setNextAnim(op.popEnterAnim);
	//   90  239:aload           5
	//   91  241:aload           4
	//   92  243:getfield        #235 <Field int BackStackRecord$Op.popEnterAnim>
	//   93  246:invokevirtual   #481 <Method void Fragment.setNextAnim(int)>
					mManager.showFragment(((Fragment) (obj)));
	//   94  249:aload_0         
	//   95  250:getfield        #83  <Field FragmentManagerImpl mManager>
	//   96  253:aload           5
	//   97  255:invokevirtual   #490 <Method void FragmentManagerImpl.showFragment(Fragment)>
					break;

	//*  98  258:goto            303
				case 3: // '\003'
					((Fragment) (obj)).setNextAnim(op.popEnterAnim);
	//   99  261:aload           5
	//  100  263:aload           4
	//  101  265:getfield        #235 <Field int BackStackRecord$Op.popEnterAnim>
	//  102  268:invokevirtual   #481 <Method void Fragment.setNextAnim(int)>
					mManager.addFragment(((Fragment) (obj)), false);
	//  103  271:aload_0         
	//  104  272:getfield        #83  <Field FragmentManagerImpl mManager>
	//  105  275:aload           5
	//  106  277:iconst_0        
	//  107  278:invokevirtual   #500 <Method void FragmentManagerImpl.addFragment(Fragment, boolean)>
					break;
				}
			} else
	//* 108  281:goto            303
			{
				((Fragment) (obj)).setNextAnim(op.popExitAnim);
	//  109  284:aload           5
	//  110  286:aload           4
	//  111  288:getfield        #240 <Field int BackStackRecord$Op.popExitAnim>
	//  112  291:invokevirtual   #481 <Method void Fragment.setNextAnim(int)>
				mManager.removeFragment(((Fragment) (obj)));
	//  113  294:aload_0         
	//  114  295:getfield        #83  <Field FragmentManagerImpl mManager>
	//  115  298:aload           5
	//  116  300:invokevirtual   #496 <Method void FragmentManagerImpl.removeFragment(Fragment)>
			}
			if(!mReorderingAllowed && op.cmd != 3 && obj != null)
	//* 117  303:aload_0         
	//* 118  304:getfield        #81  <Field boolean mReorderingAllowed>
	//* 119  307:ifne            333
	//* 120  310:aload           4
	//* 121  312:getfield        #431 <Field int BackStackRecord$Op.cmd>
	//* 122  315:iconst_3        
	//* 123  316:icmpeq          333
	//* 124  319:aload           5
	//* 125  321:ifnull          333
				mManager.moveFragmentToExpectedState(((Fragment) (obj)));
	//  126  324:aload_0         
	//  127  325:getfield        #83  <Field FragmentManagerImpl mManager>
	//  128  328:aload           5
	//  129  330:invokevirtual   #503 <Method void FragmentManagerImpl.moveFragmentToExpectedState(Fragment)>
		}

	//  130  333:iload_2         
	//  131  334:iconst_1        
	//  132  335:isub            
	//  133  336:istore_2        
	//* 134  337:goto            10
		if(!mReorderingAllowed && flag)
	//* 135  340:aload_0         
	//* 136  341:getfield        #81  <Field boolean mReorderingAllowed>
	//* 137  344:ifne            368
	//* 138  347:iload_1         
	//* 139  348:ifeq            368
		{
			FragmentManagerImpl fragmentmanagerimpl = mManager;
	//  140  351:aload_0         
	//  141  352:getfield        #83  <Field FragmentManagerImpl mManager>
	//  142  355:astore          4
			fragmentmanagerimpl.moveToState(fragmentmanagerimpl.mCurState, true);
	//  143  357:aload           4
	//  144  359:aload           4
	//  145  361:getfield        #506 <Field int FragmentManagerImpl.mCurState>
	//  146  364:iconst_1        
	//  147  365:invokevirtual   #510 <Method void FragmentManagerImpl.moveToState(int, boolean)>
		}
	//  148  368:return          
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
	//*   6    7:getfield        #75  <Field ArrayList mOps>
	//*   7   10:invokevirtual   #300 <Method int ArrayList.size()>
	//*   8   13:icmpge          463
		{
			Op op = (Op)mOps.get(i);
	//    9   16:aload_0         
	//   10   17:getfield        #75  <Field ArrayList mOps>
	//   11   20:iload_3         
	//   12   21:invokevirtual   #304 <Method Object ArrayList.get(int)>
	//   13   24:checkcast       #10  <Class BackStackRecord$Op>
	//   14   27:astore          10
			int j;
			switch(op.cmd)
	//*  15   29:aload           10
	//*  16   31:getfield        #431 <Field int BackStackRecord$Op.cmd>
			{
	//*  17   34:tableswitch     1 8: default 80
	//	               1 436
	//	               2 180
	//	               3 122
	//	               4 80
	//	               5 80
	//	               6 122
	//	               7 436
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
	//   22   86:goto            452

			case 8: // '\b'
				mOps.add(i, ((Object) (new Op(9, fragment1))));
	//   23   89:aload_0         
	//   24   90:getfield        #75  <Field ArrayList mOps>
	//   25   93:iload_3         
	//   26   94:new             #10  <Class BackStackRecord$Op>
	//   27   97:dup             
	//   28   98:bipush          9
	//   29  100:aload           9
	//   30  102:invokespecial   #176 <Method void BackStackRecord$Op(int, Fragment)>
	//   31  105:invokevirtual   #520 <Method void ArrayList.add(int, Object)>
				j = i + 1;
	//   32  108:iload_3         
	//   33  109:iconst_1        
	//   34  110:iadd            
	//   35  111:istore          4
				fragment = op.fragment;
	//   36  113:aload           10
	//   37  115:getfield        #196 <Field Fragment BackStackRecord$Op.fragment>
	//   38  118:astore_2        
				break;
	//   39  119:goto            452

			case 3: // '\003'
			case 6: // '\006'
				arraylist.remove(((Object) (op.fragment)));
	//   40  122:aload_1         
	//   41  123:aload           10
	//   42  125:getfield        #196 <Field Fragment BackStackRecord$Op.fragment>
	//   43  128:invokevirtual   #523 <Method boolean ArrayList.remove(Object)>
	//   44  131:pop             
				fragment = fragment1;
	//   45  132:aload           9
	//   46  134:astore_2        
				j = i;
	//   47  135:iload_3         
	//   48  136:istore          4
				if(op.fragment == fragment1)
	//*  49  138:aload           10
	//*  50  140:getfield        #196 <Field Fragment BackStackRecord$Op.fragment>
	//*  51  143:aload           9
	//*  52  145:if_acmpne       452
				{
					mOps.add(i, ((Object) (new Op(9, op.fragment))));
	//   53  148:aload_0         
	//   54  149:getfield        #75  <Field ArrayList mOps>
	//   55  152:iload_3         
	//   56  153:new             #10  <Class BackStackRecord$Op>
	//   57  156:dup             
	//   58  157:bipush          9
	//   59  159:aload           10
	//   60  161:getfield        #196 <Field Fragment BackStackRecord$Op.fragment>
	//   61  164:invokespecial   #176 <Method void BackStackRecord$Op(int, Fragment)>
	//   62  167:invokevirtual   #520 <Method void ArrayList.add(int, Object)>
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
	//   69  177:goto            452

			case 2: // '\002'
				Fragment fragment2 = op.fragment;
	//   70  180:aload           10
	//   71  182:getfield        #196 <Field Fragment BackStackRecord$Op.fragment>
	//   72  185:astore          11
				int l = fragment2.mContainerId;
	//   73  187:aload           11
	//   74  189:getfield        #164 <Field int Fragment.mContainerId>
	//   75  192:istore          8
				j = arraylist.size() - 1;
	//   76  194:aload_1         
	//   77  195:invokevirtual   #300 <Method int ArrayList.size()>
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
	//   89  216:invokevirtual   #304 <Method Object ArrayList.get(int)>
	//   90  219:checkcast       #116 <Class Fragment>
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
	//*  99  236:getfield        #164 <Field int Fragment.mContainerId>
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
	//  120  276:getfield        #75  <Field ArrayList mOps>
	//  121  279:iload_3         
	//  122  280:new             #10  <Class BackStackRecord$Op>
	//  123  283:dup             
	//  124  284:bipush          9
	//  125  286:aload           12
	//  126  288:invokespecial   #176 <Method void BackStackRecord$Op(int, Fragment)>
	//  127  291:invokevirtual   #520 <Method void ArrayList.add(int, Object)>
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
	//  138  309:invokespecial   #176 <Method void BackStackRecord$Op(int, Fragment)>
	//  139  312:astore_2        
							fragment.enterAnim = op.enterAnim;
	//  140  313:aload_2         
	//  141  314:aload           10
	//  142  316:getfield        #225 <Field int BackStackRecord$Op.enterAnim>
	//  143  319:putfield        #225 <Field int BackStackRecord$Op.enterAnim>
							fragment.popEnterAnim = op.popEnterAnim;
	//  144  322:aload_2         
	//  145  323:aload           10
	//  146  325:getfield        #235 <Field int BackStackRecord$Op.popEnterAnim>
	//  147  328:putfield        #235 <Field int BackStackRecord$Op.popEnterAnim>
							fragment.exitAnim = op.exitAnim;
	//  148  331:aload_2         
	//  149  332:aload           10
	//  150  334:getfield        #230 <Field int BackStackRecord$Op.exitAnim>
	//  151  337:putfield        #230 <Field int BackStackRecord$Op.exitAnim>
							fragment.popExitAnim = op.popExitAnim;
	//  152  340:aload_2         
	//  153  341:aload           10
	//  154  343:getfield        #240 <Field int BackStackRecord$Op.popExitAnim>
	//  155  346:putfield        #240 <Field int BackStackRecord$Op.popExitAnim>
							mOps.add(k, ((Object) (fragment)));
	//  156  349:aload_0         
	//  157  350:getfield        #75  <Field ArrayList mOps>
	//  158  353:iload           6
	//  159  355:aload_2         
	//  160  356:invokevirtual   #520 <Method void ArrayList.add(int, Object)>
							arraylist.remove(((Object) (fragment3)));
	//  161  359:aload_1         
	//  162  360:aload           12
	//  163  362:invokevirtual   #523 <Method boolean ArrayList.remove(Object)>
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
	//* 183  397:ifeq            417
				{
					mOps.remove(i);
	//  184  400:aload_0         
	//  185  401:getfield        #75  <Field ArrayList mOps>
	//  186  404:iload_3         
	//  187  405:invokevirtual   #525 <Method Object ArrayList.remove(int)>
	//  188  408:pop             
					j = i - 1;
	//  189  409:iload_3         
	//  190  410:iconst_1        
	//  191  411:isub            
	//  192  412:istore          4
				} else
	//* 193  414:goto            433
				{
					op.cmd = 1;
	//  194  417:aload           10
	//  195  419:iconst_1        
	//  196  420:putfield        #431 <Field int BackStackRecord$Op.cmd>
					arraylist.add(((Object) (fragment2)));
	//  197  423:aload_1         
	//  198  424:aload           11
	//  199  426:invokevirtual   #220 <Method boolean ArrayList.add(Object)>
	//  200  429:pop             
					j = i;
	//  201  430:iload_3         
	//  202  431:istore          4
				}
				break;

	//* 203  433:goto            452
			case 1: // '\001'
			case 7: // '\007'
				arraylist.add(((Object) (op.fragment)));
	//  204  436:aload_1         
	//  205  437:aload           10
	//  206  439:getfield        #196 <Field Fragment BackStackRecord$Op.fragment>
	//  207  442:invokevirtual   #220 <Method boolean ArrayList.add(Object)>
	//  208  445:pop             
				j = i;
	//  209  446:iload_3         
	//  210  447:istore          4
				fragment = fragment1;
	//  211  449:aload           9
	//  212  451:astore_2        
				break;
			}
			i = j + 1;
	//  213  452:iload           4
	//  214  454:iconst_1        
	//  215  455:iadd            
	//  216  456:istore_3        
		}

	//  217  457:aload_2         
	//  218  458:astore          9
	//* 219  460:goto            5
		return fragment1;
	//  220  463:aload           9
	//  221  465:areturn         
	}

	public boolean generateOps(ArrayList arraylist, ArrayList arraylist1)
	{
		if(FragmentManagerImpl.DEBUG)
	//*   0    0:getstatic       #287 <Field boolean FragmentManagerImpl.DEBUG>
	//*   1    3:ifeq            38
		{
			StringBuilder stringbuilder = new StringBuilder();
	//    2    6:new             #130 <Class StringBuilder>
	//    3    9:dup             
	//    4   10:invokespecial   #131 <Method void StringBuilder()>
	//    5   13:astore_3        
			stringbuilder.append("Run: ");
	//    6   14:aload_3         
	//    7   15:ldc2            #531 <String "Run: ">
	//    8   18:invokevirtual   #137 <Method StringBuilder StringBuilder.append(String)>
	//    9   21:pop             
			stringbuilder.append(((Object) (this)));
	//   10   22:aload_3         
	//   11   23:aload_0         
	//   12   24:invokevirtual   #140 <Method StringBuilder StringBuilder.append(Object)>
	//   13   27:pop             
			Log.v("FragmentManager", stringbuilder.toString());
	//   14   28:ldc1            #36  <String "FragmentManager">
	//   15   30:aload_3         
	//   16   31:invokevirtual   #150 <Method String StringBuilder.toString()>
	//   17   34:invokestatic    #297 <Method int Log.v(String, String)>
	//   18   37:pop             
		}
		arraylist.add(((Object) (this)));
	//   19   38:aload_1         
	//   20   39:aload_0         
	//   21   40:invokevirtual   #220 <Method boolean ArrayList.add(Object)>
	//   22   43:pop             
		arraylist1.add(((Object) (Boolean.valueOf(false))));
	//   23   44:aload_2         
	//   24   45:iconst_0        
	//   25   46:invokestatic    #537 <Method Boolean Boolean.valueOf(boolean)>
	//   26   49:invokevirtual   #220 <Method boolean ArrayList.add(Object)>
	//   27   52:pop             
		if(mAddToBackStack)
	//*  28   53:aload_0         
	//*  29   54:getfield        #274 <Field boolean mAddToBackStack>
	//*  30   57:ifeq            68
			mManager.addBackStackState(this);
	//   31   60:aload_0         
	//   32   61:getfield        #83  <Field FragmentManagerImpl mManager>
	//   33   64:aload_0         
	//   34   65:invokevirtual   #541 <Method void FragmentManagerImpl.addBackStackState(BackStackRecord)>
		return true;
	//   35   68:iconst_1        
	//   36   69:ireturn         
	}

	public CharSequence getBreadCrumbShortTitle()
	{
		if(mBreadCrumbShortTitleRes != 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #415 <Field int mBreadCrumbShortTitleRes>
	//*   2    4:ifeq            25
			return mManager.mHost.getContext().getText(mBreadCrumbShortTitleRes);
	//    3    7:aload_0         
	//    4    8:getfield        #83  <Field FragmentManagerImpl mManager>
	//    5   11:getfield        #548 <Field FragmentHostCallback FragmentManagerImpl.mHost>
	//    6   14:invokevirtual   #554 <Method Context FragmentHostCallback.getContext()>
	//    7   17:aload_0         
	//    8   18:getfield        #415 <Field int mBreadCrumbShortTitleRes>
	//    9   21:invokevirtual   #560 <Method CharSequence Context.getText(int)>
	//   10   24:areturn         
		else
			return mBreadCrumbShortTitleText;
	//   11   25:aload_0         
	//   12   26:getfield        #417 <Field CharSequence mBreadCrumbShortTitleText>
	//   13   29:areturn         
	}

	public int getBreadCrumbShortTitleRes()
	{
		return mBreadCrumbShortTitleRes;
	//    0    0:aload_0         
	//    1    1:getfield        #415 <Field int mBreadCrumbShortTitleRes>
	//    2    4:ireturn         
	}

	public CharSequence getBreadCrumbTitle()
	{
		if(mBreadCrumbTitleRes != 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #404 <Field int mBreadCrumbTitleRes>
	//*   2    4:ifeq            25
			return mManager.mHost.getContext().getText(mBreadCrumbTitleRes);
	//    3    7:aload_0         
	//    4    8:getfield        #83  <Field FragmentManagerImpl mManager>
	//    5   11:getfield        #548 <Field FragmentHostCallback FragmentManagerImpl.mHost>
	//    6   14:invokevirtual   #554 <Method Context FragmentHostCallback.getContext()>
	//    7   17:aload_0         
	//    8   18:getfield        #404 <Field int mBreadCrumbTitleRes>
	//    9   21:invokevirtual   #560 <Method CharSequence Context.getText(int)>
	//   10   24:areturn         
		else
			return mBreadCrumbTitleText;
	//   11   25:aload_0         
	//   12   26:getfield        #406 <Field CharSequence mBreadCrumbTitleText>
	//   13   29:areturn         
	}

	public int getBreadCrumbTitleRes()
	{
		return mBreadCrumbTitleRes;
	//    0    0:aload_0         
	//    1    1:getfield        #404 <Field int mBreadCrumbTitleRes>
	//    2    4:ireturn         
	}

	public int getId()
	{
		return mIndex;
	//    0    0:aload_0         
	//    1    1:getfield        #79  <Field int mIndex>
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
	//    1    1:getfield        #380 <Field int mTransition>
	//    2    4:ireturn         
	}

	public int getTransitionStyle()
	{
		return mTransitionStyle;
	//    0    0:aload_0         
	//    1    1:getfield        #392 <Field int mTransitionStyle>
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
	//    5    7:invokespecial   #176 <Method void BackStackRecord$Op(int, Fragment)>
	//    6   10:invokevirtual   #180 <Method void addOp(BackStackRecord$Op)>
		return ((FragmentTransaction) (this));
	//    7   13:aload_0         
	//    8   14:areturn         
	}

	boolean interactsWith(int i)
	{
		int l = mOps.size();
	//    0    0:aload_0         
	//    1    1:getfield        #75  <Field ArrayList mOps>
	//    2    4:invokevirtual   #300 <Method int ArrayList.size()>
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
	//   10   18:getfield        #75  <Field ArrayList mOps>
	//   11   21:iload_2         
	//   12   22:invokevirtual   #304 <Method Object ArrayList.get(int)>
	//   13   25:checkcast       #10  <Class BackStackRecord$Op>
	//   14   28:astore          5
			int k;
			if(op.fragment != null)
	//*  15   30:aload           5
	//*  16   32:getfield        #196 <Field Fragment BackStackRecord$Op.fragment>
	//*  17   35:ifnull          50
				k = op.fragment.mContainerId;
	//   18   38:aload           5
	//   19   40:getfield        #196 <Field Fragment BackStackRecord$Op.fragment>
	//   20   43:getfield        #164 <Field int Fragment.mContainerId>
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
	//    6    8:getfield        #75  <Field ArrayList mOps>
	//    7   11:invokevirtual   #300 <Method int ArrayList.size()>
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
	//   17   30:getfield        #75  <Field ArrayList mOps>
	//   18   33:iload           5
	//   19   35:invokevirtual   #304 <Method Object ArrayList.get(int)>
	//   20   38:checkcast       #10  <Class BackStackRecord$Op>
	//   21   41:astore          11
			int k;
			if(op.fragment != null)
	//*  22   43:aload           11
	//*  23   45:getfield        #196 <Field Fragment BackStackRecord$Op.fragment>
	//*  24   48:ifnull          64
				k = op.fragment.mContainerId;
	//   25   51:aload           11
	//   26   53:getfield        #196 <Field Fragment BackStackRecord$Op.fragment>
	//   27   56:getfield        #164 <Field int Fragment.mContainerId>
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
	//   48   99:invokevirtual   #304 <Method Object ArrayList.get(int)>
	//   49  102:checkcast       #2   <Class BackStackRecord>
	//   50  105:astore          11
						int i2 = backstackrecord.mOps.size();
	//   51  107:aload           11
	//   52  109:getfield        #75  <Field ArrayList mOps>
	//   53  112:invokevirtual   #300 <Method int ArrayList.size()>
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
	//   61  129:getfield        #75  <Field ArrayList mOps>
	//   62  132:iload           7
	//   63  134:invokevirtual   #304 <Method Object ArrayList.get(int)>
	//   64  137:checkcast       #10  <Class BackStackRecord$Op>
	//   65  140:astore          12
							int k1;
							if(op1.fragment != null)
	//*  66  142:aload           12
	//*  67  144:getfield        #196 <Field Fragment BackStackRecord$Op.fragment>
	//*  68  147:ifnull          163
								k1 = op1.fragment.mContainerId;
	//   69  150:aload           12
	//   70  152:getfield        #196 <Field Fragment BackStackRecord$Op.fragment>
	//   71  155:getfield        #164 <Field int Fragment.mContainerId>
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
	//    1    1:getfield        #77  <Field boolean mAllowAddToBackStack>
	//    2    4:ireturn         
	}

	public boolean isEmpty()
	{
		return mOps.isEmpty();
	//    0    0:aload_0         
	//    1    1:getfield        #75  <Field ArrayList mOps>
	//    2    4:invokevirtual   #424 <Method boolean ArrayList.isEmpty()>
	//    3    7:ireturn         
	}

	boolean isPostponed()
	{
		for(int i = 0; i < mOps.size(); i++)
	//*   0    0:iconst_0        
	//*   1    1:istore_1        
	//*   2    2:iload_1         
	//*   3    3:aload_0         
	//*   4    4:getfield        #75  <Field ArrayList mOps>
	//*   5    7:invokevirtual   #300 <Method int ArrayList.size()>
	//*   6   10:icmpge          39
			if(isFragmentPostponed((Op)mOps.get(i)))
	//*   7   13:aload_0         
	//*   8   14:getfield        #75  <Field ArrayList mOps>
	//*   9   17:iload_1         
	//*  10   18:invokevirtual   #304 <Method Object ArrayList.get(int)>
	//*  11   21:checkcast       #10  <Class BackStackRecord$Op>
	//*  12   24:invokestatic    #575 <Method boolean isFragmentPostponed(BackStackRecord$Op)>
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
	//    5    7:invokespecial   #176 <Method void BackStackRecord$Op(int, Fragment)>
	//    6   10:invokevirtual   #180 <Method void addOp(BackStackRecord$Op)>
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
	//    4    4:invokevirtual   #578 <Method FragmentTransaction replace(int, Fragment, String)>
	//    5    7:areturn         
	}

	public FragmentTransaction replace(int i, Fragment fragment, String s)
	{
		if(i != 0)
	//*   0    0:iload_1         
	//*   1    1:ifeq            14
		{
			doAddOp(i, fragment, s, 2);
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:aload_2         
	//    5    7:aload_3         
	//    6    8:iconst_2        
	//    7    9:invokespecial   #216 <Method void doAddOp(int, Fragment, String, int)>
			return ((FragmentTransaction) (this));
	//    8   12:aload_0         
	//    9   13:areturn         
		} else
		{
			throw new IllegalArgumentException("Must use non-zero containerViewId");
	//   10   14:new             #172 <Class IllegalArgumentException>
	//   11   17:dup             
	//   12   18:ldc2            #580 <String "Must use non-zero containerViewId">
	//   13   21:invokespecial   #173 <Method void IllegalArgumentException(String)>
	//   14   24:athrow          
		}
	}

	public FragmentTransaction runOnCommit(Runnable runnable)
	{
		if(runnable != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          38
		{
			disallowAddToBackStack();
	//    2    4:aload_0         
	//    3    5:invokevirtual   #353 <Method FragmentTransaction disallowAddToBackStack()>
	//    4    8:pop             
			if(mCommitRunnables == null)
	//*   5    9:aload_0         
	//*   6   10:getfield        #584 <Field ArrayList mCommitRunnables>
	//*   7   13:ifnonnull       27
				mCommitRunnables = new ArrayList();
	//    8   16:aload_0         
	//    9   17:new             #72  <Class ArrayList>
	//   10   20:dup             
	//   11   21:invokespecial   #73  <Method void ArrayList()>
	//   12   24:putfield        #584 <Field ArrayList mCommitRunnables>
			mCommitRunnables.add(((Object) (runnable)));
	//   13   27:aload_0         
	//   14   28:getfield        #584 <Field ArrayList mCommitRunnables>
	//   15   31:aload_1         
	//   16   32:invokevirtual   #220 <Method boolean ArrayList.add(Object)>
	//   17   35:pop             
			return ((FragmentTransaction) (this));
	//   18   36:aload_0         
	//   19   37:areturn         
		} else
		{
			throw new IllegalArgumentException("runnable cannot be null");
	//   20   38:new             #172 <Class IllegalArgumentException>
	//   21   41:dup             
	//   22   42:ldc2            #586 <String "runnable cannot be null">
	//   23   45:invokespecial   #173 <Method void IllegalArgumentException(String)>
	//   24   48:athrow          
		}
	}

	public void runOnCommitRunnables()
	{
		ArrayList arraylist = mCommitRunnables;
	//    0    0:aload_0         
	//    1    1:getfield        #584 <Field ArrayList mCommitRunnables>
	//    2    4:astore_3        
		if(arraylist != null)
	//*   3    5:aload_3         
	//*   4    6:ifnull          49
		{
			int i = 0;
	//    5    9:iconst_0        
	//    6   10:istore_1        
			for(int j = arraylist.size(); i < j; i++)
	//*   7   11:aload_3         
	//*   8   12:invokevirtual   #300 <Method int ArrayList.size()>
	//*   9   15:istore_2        
	//*  10   16:iload_1         
	//*  11   17:iload_2         
	//*  12   18:icmpge          44
				((Runnable)mCommitRunnables.get(i)).run();
	//   13   21:aload_0         
	//   14   22:getfield        #584 <Field ArrayList mCommitRunnables>
	//   15   25:iload_1         
	//   16   26:invokevirtual   #304 <Method Object ArrayList.get(int)>
	//   17   29:checkcast       #589 <Class Runnable>
	//   18   32:invokeinterface #592 <Method void Runnable.run()>

	//   19   37:iload_1         
	//   20   38:iconst_1        
	//   21   39:iadd            
	//   22   40:istore_1        
	//*  23   41:goto            16
			mCommitRunnables = null;
	//   24   44:aload_0         
	//   25   45:aconst_null     
	//   26   46:putfield        #584 <Field ArrayList mCommitRunnables>
		}
	//   27   49:return          
	}

	public FragmentTransaction setAllowOptimization(boolean flag)
	{
		return setReorderingAllowed(flag);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #597 <Method FragmentTransaction setReorderingAllowed(boolean)>
	//    3    5:areturn         
	}

	public FragmentTransaction setBreadCrumbShortTitle(int i)
	{
		mBreadCrumbShortTitleRes = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #415 <Field int mBreadCrumbShortTitleRes>
		mBreadCrumbShortTitleText = null;
	//    3    5:aload_0         
	//    4    6:aconst_null     
	//    5    7:putfield        #417 <Field CharSequence mBreadCrumbShortTitleText>
		return ((FragmentTransaction) (this));
	//    6   10:aload_0         
	//    7   11:areturn         
	}

	public FragmentTransaction setBreadCrumbShortTitle(CharSequence charsequence)
	{
		mBreadCrumbShortTitleRes = 0;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #415 <Field int mBreadCrumbShortTitleRes>
		mBreadCrumbShortTitleText = charsequence;
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:putfield        #417 <Field CharSequence mBreadCrumbShortTitleText>
		return ((FragmentTransaction) (this));
	//    6   10:aload_0         
	//    7   11:areturn         
	}

	public FragmentTransaction setBreadCrumbTitle(int i)
	{
		mBreadCrumbTitleRes = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #404 <Field int mBreadCrumbTitleRes>
		mBreadCrumbTitleText = null;
	//    3    5:aload_0         
	//    4    6:aconst_null     
	//    5    7:putfield        #406 <Field CharSequence mBreadCrumbTitleText>
		return ((FragmentTransaction) (this));
	//    6   10:aload_0         
	//    7   11:areturn         
	}

	public FragmentTransaction setBreadCrumbTitle(CharSequence charsequence)
	{
		mBreadCrumbTitleRes = 0;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #404 <Field int mBreadCrumbTitleRes>
		mBreadCrumbTitleText = charsequence;
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:putfield        #406 <Field CharSequence mBreadCrumbTitleText>
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
	//    5    5:invokevirtual   #606 <Method FragmentTransaction setCustomAnimations(int, int, int, int)>
	//    6    8:areturn         
	}

	public FragmentTransaction setCustomAnimations(int i, int j, int k, int l)
	{
		mEnterAnim = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #222 <Field int mEnterAnim>
		mExitAnim = j;
	//    3    5:aload_0         
	//    4    6:iload_2         
	//    5    7:putfield        #227 <Field int mExitAnim>
		mPopEnterAnim = k;
	//    6   10:aload_0         
	//    7   11:iload_3         
	//    8   12:putfield        #232 <Field int mPopEnterAnim>
		mPopExitAnim = l;
	//    9   15:aload_0         
	//   10   16:iload           4
	//   11   18:putfield        #237 <Field int mPopExitAnim>
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
	//*   4    4:getfield        #75  <Field ArrayList mOps>
	//*   5    7:invokevirtual   #300 <Method int ArrayList.size()>
	//*   6   10:icmpge          47
		{
			Op op = (Op)mOps.get(i);
	//    7   13:aload_0         
	//    8   14:getfield        #75  <Field ArrayList mOps>
	//    9   17:iload_2         
	//   10   18:invokevirtual   #304 <Method Object ArrayList.get(int)>
	//   11   21:checkcast       #10  <Class BackStackRecord$Op>
	//   12   24:astore_3        
			if(isFragmentPostponed(op))
	//*  13   25:aload_3         
	//*  14   26:invokestatic    #575 <Method boolean isFragmentPostponed(BackStackRecord$Op)>
	//*  15   29:ifeq            40
				op.fragment.setOnStartEnterTransitionListener(onstartentertransitionlistener);
	//   16   32:aload_3         
	//   17   33:getfield        #196 <Field Fragment BackStackRecord$Op.fragment>
	//   18   36:aload_1         
	//   19   37:invokevirtual   #611 <Method void Fragment.setOnStartEnterTransitionListener(Fragment$OnStartEnterTransitionListener)>
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
	//    5    8:invokespecial   #176 <Method void BackStackRecord$Op(int, Fragment)>
	//    6   11:invokevirtual   #180 <Method void addOp(BackStackRecord$Op)>
		return ((FragmentTransaction) (this));
	//    7   14:aload_0         
	//    8   15:areturn         
	}

	public FragmentTransaction setReorderingAllowed(boolean flag)
	{
		mReorderingAllowed = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #81  <Field boolean mReorderingAllowed>
		return ((FragmentTransaction) (this));
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public FragmentTransaction setTransition(int i)
	{
		mTransition = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #380 <Field int mTransition>
		return ((FragmentTransaction) (this));
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public FragmentTransaction setTransitionStyle(int i)
	{
		mTransitionStyle = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #392 <Field int mTransitionStyle>
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
	//    5    7:invokespecial   #176 <Method void BackStackRecord$Op(int, Fragment)>
	//    6   10:invokevirtual   #180 <Method void addOp(BackStackRecord$Op)>
		return ((FragmentTransaction) (this));
	//    7   13:aload_0         
	//    8   14:areturn         
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder(128);
	//    0    0:new             #130 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:sipush          128
	//    3    7:invokespecial   #616 <Method void StringBuilder(int)>
	//    4   10:astore_1        
		stringbuilder.append("BackStackEntry{");
	//    5   11:aload_1         
	//    6   12:ldc2            #618 <String "BackStackEntry{">
	//    7   15:invokevirtual   #137 <Method StringBuilder StringBuilder.append(String)>
	//    8   18:pop             
		stringbuilder.append(Integer.toHexString(System.identityHashCode(((Object) (this)))));
	//    9   19:aload_1         
	//   10   20:aload_0         
	//   11   21:invokestatic    #624 <Method int System.identityHashCode(Object)>
	//   12   24:invokestatic    #388 <Method String Integer.toHexString(int)>
	//   13   27:invokevirtual   #137 <Method StringBuilder StringBuilder.append(String)>
	//   14   30:pop             
		if(mIndex >= 0)
	//*  15   31:aload_0         
	//*  16   32:getfield        #79  <Field int mIndex>
	//*  17   35:iflt            55
		{
			stringbuilder.append(" #");
	//   18   38:aload_1         
	//   19   39:ldc2            #626 <String " #">
	//   20   42:invokevirtual   #137 <Method StringBuilder StringBuilder.append(String)>
	//   21   45:pop             
			stringbuilder.append(mIndex);
	//   22   46:aload_1         
	//   23   47:aload_0         
	//   24   48:getfield        #79  <Field int mIndex>
	//   25   51:invokevirtual   #161 <Method StringBuilder StringBuilder.append(int)>
	//   26   54:pop             
		}
		if(mName != null)
	//*  27   55:aload_0         
	//*  28   56:getfield        #276 <Field String mName>
	//*  29   59:ifnull          79
		{
			stringbuilder.append(" ");
	//   30   62:aload_1         
	//   31   63:ldc2            #459 <String " ">
	//   32   66:invokevirtual   #137 <Method StringBuilder StringBuilder.append(String)>
	//   33   69:pop             
			stringbuilder.append(mName);
	//   34   70:aload_1         
	//   35   71:aload_0         
	//   36   72:getfield        #276 <Field String mName>
	//   37   75:invokevirtual   #137 <Method StringBuilder StringBuilder.append(String)>
	//   38   78:pop             
		}
		stringbuilder.append("}");
	//   39   79:aload_1         
	//   40   80:ldc2            #628 <String "}">
	//   41   83:invokevirtual   #137 <Method StringBuilder StringBuilder.append(String)>
	//   42   86:pop             
		return stringbuilder.toString();
	//   43   87:aload_1         
	//   44   88:invokevirtual   #150 <Method String StringBuilder.toString()>
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
	//    4    4:getfield        #75  <Field ArrayList mOps>
	//    5    7:invokevirtual   #300 <Method int ArrayList.size()>
	//    6   10:icmpge          123
		op = (Op)mOps.get(i);
	//    7   13:aload_0         
	//    8   14:getfield        #75  <Field ArrayList mOps>
	//    9   17:iload_3         
	//   10   18:invokevirtual   #304 <Method Object ArrayList.get(int)>
	//   11   21:checkcast       #10  <Class BackStackRecord$Op>
	//   12   24:astore          5
		j = op.cmd;
	//   13   26:aload           5
	//   14   28:getfield        #431 <Field int BackStackRecord$Op.cmd>
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
	//   26   81:getfield        #196 <Field Fragment BackStackRecord$Op.fragment>
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
	//   34   96:getfield        #196 <Field Fragment BackStackRecord$Op.fragment>
	//   35   99:invokevirtual   #220 <Method boolean ArrayList.add(Object)>
	//   36  102:pop             
		break; /* Loop/switch isn't completed */
	//   37  103:goto            116
_L2:
		arraylist.remove(((Object) (op.fragment)));
	//   38  106:aload_1         
	//   39  107:aload           5
	//   40  109:getfield        #196 <Field Fragment BackStackRecord$Op.fragment>
	//   41  112:invokevirtual   #523 <Method boolean ArrayList.remove(Object)>
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

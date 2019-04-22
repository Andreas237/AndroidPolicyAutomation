// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.app;

import android.graphics.Rect;
import android.support.v4.util.ArrayMap;
import android.support.v4.view.ViewCompat;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import java.lang.reflect.Constructor;
import java.util.*;

// Referenced classes of package android.support.v4.app:
//			FragmentTransitionCompat21, Fragment, BackStackRecord, FragmentManagerImpl, 
//			FragmentContainer, SharedElementCallback, FragmentTransitionImpl, OneShotPreDrawListener, 
//			FragmentHostCallback

class FragmentTransition
{
	static class FragmentContainerTransition
	{

		public Fragment firstOut;
		public boolean firstOutIsPop;
		public BackStackRecord firstOutTransaction;
		public Fragment lastIn;
		public boolean lastInIsPop;
		public BackStackRecord lastInTransaction;

		FragmentContainerTransition()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #20  <Method void Object()>
		//    2    4:return          
		}
	}


	private static void addSharedElementsWithMatchingNames(ArrayList arraylist, ArrayMap arraymap, Collection collection)
	{
		for(int i = arraymap.size() - 1; i >= 0; i--)
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #52  <Method int ArrayMap.size()>
	//*   2    4:iconst_1        
	//*   3    5:isub            
	//*   4    6:istore_3        
	//*   5    7:iload_3         
	//*   6    8:iflt            49
		{
			View view = (View)arraymap.valueAt(i);
	//    7   11:aload_1         
	//    8   12:iload_3         
	//    9   13:invokevirtual   #56  <Method Object ArrayMap.valueAt(int)>
	//   10   16:checkcast       #58  <Class View>
	//   11   19:astore          4
			if(collection.contains(((Object) (ViewCompat.getTransitionName(view)))))
	//*  12   21:aload_2         
	//*  13   22:aload           4
	//*  14   24:invokestatic    #64  <Method String ViewCompat.getTransitionName(View)>
	//*  15   27:invokeinterface #70  <Method boolean Collection.contains(Object)>
	//*  16   32:ifeq            42
				arraylist.add(((Object) (view)));
	//   17   35:aload_0         
	//   18   36:aload           4
	//   19   38:invokevirtual   #75  <Method boolean ArrayList.add(Object)>
	//   20   41:pop             
		}

	//   21   42:iload_3         
	//   22   43:iconst_1        
	//   23   44:isub            
	//   24   45:istore_3        
	//*  25   46:goto            7
	//   26   49:return          
	}

	private static void addToFirstInLastOut(BackStackRecord backstackrecord, BackStackRecord.Op op, SparseArray sparsearray, boolean flag, boolean flag1)
	{
		int i;
		int j;
		boolean flag4;
		Fragment fragment;
		fragment = op.fragment;
	//    0    0:aload_1         
	//    1    1:getfield        #85  <Field Fragment BackStackRecord$Op.fragment>
	//    2    4:astore          11
		if(fragment == null)
	//*   3    6:aload           11
	//*   4    8:ifnonnull       12
			return;
	//    5   11:return          
		j = fragment.mContainerId;
	//    6   12:aload           11
	//    7   14:getfield        #90  <Field int Fragment.mContainerId>
	//    8   17:istore          8
		if(j == 0)
	//*   9   19:iload           8
	//*  10   21:ifne            25
			return;
	//   11   24:return          
		if(flag)
	//*  12   25:iload_3         
	//*  13   26:ifeq            42
			i = INVERSE_OPS[op.cmd];
	//   14   29:getstatic       #24  <Field int[] INVERSE_OPS>
	//   15   32:aload_1         
	//   16   33:getfield        #93  <Field int BackStackRecord$Op.cmd>
	//   17   36:iaload          
	//   18   37:istore          5
		else
	//*  19   39:goto            48
			i = op.cmd;
	//   20   42:aload_1         
	//   21   43:getfield        #93  <Field int BackStackRecord$Op.cmd>
	//   22   46:istore          5
		flag4 = false;
	//   23   48:iconst_0        
	//   24   49:istore          9
		if(i == 1) goto _L2; else goto _L1
	//   25   51:iload           5
	//   26   53:iconst_1        
	//   27   54:icmpeq          335
_L1:
		i;
	//   28   57:iload           5
		JVM INSTR tableswitch 3 7: default 92
	//	               3 243
	//	               4 164
	//	               5 104
	//	               6 243
	//	               7 335;
	//   29   59:tableswitch     3 7: default 92
	//	               3 243
	//	               4 164
	//	               5 104
	//	               6 243
	//	               7 335
		   goto _L3 _L4 _L5 _L6 _L4 _L2
_L3:
		boolean flag2;
		boolean flag3;
		i = 0;
	//   30   92:iconst_0        
	//   31   93:istore          5
		flag2 = false;
	//   32   95:iconst_0        
	//   33   96:istore          6
		flag3 = false;
	//   34   98:iconst_0        
	//   35   99:istore          7
		break; /* Loop/switch isn't completed */
	//   36  101:goto            384
_L6:
		if(flag1)
	//*  37  104:iload           4
	//*  38  106:ifeq            145
		{
			if(fragment.mHiddenChanged && !fragment.mHidden && fragment.mAdded)
	//*  39  109:aload           11
	//*  40  111:getfield        #97  <Field boolean Fragment.mHiddenChanged>
	//*  41  114:ifeq            139
	//*  42  117:aload           11
	//*  43  119:getfield        #100 <Field boolean Fragment.mHidden>
	//*  44  122:ifne            139
	//*  45  125:aload           11
	//*  46  127:getfield        #103 <Field boolean Fragment.mAdded>
	//*  47  130:ifeq            139
				flag4 = true;
	//   48  133:iconst_1        
	//   49  134:istore          9
			else
	//*  50  136:goto            152
				flag4 = false;
	//   51  139:iconst_0        
	//   52  140:istore          9
		} else
	//*  53  142:goto            152
		{
			flag4 = fragment.mHidden;
	//   54  145:aload           11
	//   55  147:getfield        #100 <Field boolean Fragment.mHidden>
	//   56  150:istore          9
		}
		i = 1;
	//   57  152:iconst_1        
	//   58  153:istore          5
		flag2 = false;
	//   59  155:iconst_0        
	//   60  156:istore          6
		flag3 = false;
	//   61  158:iconst_0        
	//   62  159:istore          7
		break; /* Loop/switch isn't completed */
	//   63  161:goto            384
_L5:
		if(flag1)
	//*  64  164:iload           4
	//*  65  166:ifeq            205
		{
			if(fragment.mHiddenChanged && fragment.mAdded && fragment.mHidden)
	//*  66  169:aload           11
	//*  67  171:getfield        #97  <Field boolean Fragment.mHiddenChanged>
	//*  68  174:ifeq            199
	//*  69  177:aload           11
	//*  70  179:getfield        #103 <Field boolean Fragment.mAdded>
	//*  71  182:ifeq            199
	//*  72  185:aload           11
	//*  73  187:getfield        #100 <Field boolean Fragment.mHidden>
	//*  74  190:ifeq            199
				i = 1;
	//   75  193:iconst_1        
	//   76  194:istore          5
			else
	//*  77  196:goto            230
				i = 0;
	//   78  199:iconst_0        
	//   79  200:istore          5
		} else
	//*  80  202:goto            230
		if(fragment.mAdded && !fragment.mHidden)
	//*  81  205:aload           11
	//*  82  207:getfield        #103 <Field boolean Fragment.mAdded>
	//*  83  210:ifeq            227
	//*  84  213:aload           11
	//*  85  215:getfield        #100 <Field boolean Fragment.mHidden>
	//*  86  218:ifne            227
			i = 1;
	//   87  221:iconst_1        
	//   88  222:istore          5
		else
	//*  89  224:goto            230
			i = 0;
	//   90  227:iconst_0        
	//   91  228:istore          5
		flag3 = ((boolean) (i));
	//   92  230:iload           5
	//   93  232:istore          7
		i = 0;
	//   94  234:iconst_0        
	//   95  235:istore          5
		flag2 = true;
	//   96  237:iconst_1        
	//   97  238:istore          6
		break; /* Loop/switch isn't completed */
	//   98  240:goto            384
_L4:
		if(flag1)
	//*  99  243:iload           4
	//* 100  245:ifeq            297
		{
			if(!fragment.mAdded && fragment.mView != null && fragment.mView.getVisibility() == 0 && fragment.mPostponedAlpha >= 0.0F)
	//* 101  248:aload           11
	//* 102  250:getfield        #103 <Field boolean Fragment.mAdded>
	//* 103  253:ifne            291
	//* 104  256:aload           11
	//* 105  258:getfield        #107 <Field View Fragment.mView>
	//* 106  261:ifnull          291
	//* 107  264:aload           11
	//* 108  266:getfield        #107 <Field View Fragment.mView>
	//* 109  269:invokevirtual   #110 <Method int View.getVisibility()>
	//* 110  272:ifne            291
	//* 111  275:aload           11
	//* 112  277:getfield        #114 <Field float Fragment.mPostponedAlpha>
	//* 113  280:fconst_0        
	//* 114  281:fcmpl           
	//* 115  282:iflt            291
				i = 1;
	//  116  285:iconst_1        
	//  117  286:istore          5
			else
	//* 118  288:goto            322
				i = 0;
	//  119  291:iconst_0        
	//  120  292:istore          5
		} else
	//* 121  294:goto            322
		if(fragment.mAdded && !fragment.mHidden)
	//* 122  297:aload           11
	//* 123  299:getfield        #103 <Field boolean Fragment.mAdded>
	//* 124  302:ifeq            319
	//* 125  305:aload           11
	//* 126  307:getfield        #100 <Field boolean Fragment.mHidden>
	//* 127  310:ifne            319
			i = 1;
	//  128  313:iconst_1        
	//  129  314:istore          5
		else
	//* 130  316:goto            322
			i = 0;
	//  131  319:iconst_0        
	//  132  320:istore          5
		flag3 = ((boolean) (i));
	//  133  322:iload           5
	//  134  324:istore          7
		i = 0;
	//  135  326:iconst_0        
	//  136  327:istore          5
		flag2 = true;
	//  137  329:iconst_1        
	//  138  330:istore          6
		break; /* Loop/switch isn't completed */
	//  139  332:goto            384
_L2:
		if(flag1)
	//* 140  335:iload           4
	//* 141  337:ifeq            350
			flag4 = fragment.mIsNewlyAdded;
	//  142  340:aload           11
	//  143  342:getfield        #117 <Field boolean Fragment.mIsNewlyAdded>
	//  144  345:istore          9
		else
	//* 145  347:goto            375
		if(!fragment.mAdded && !fragment.mHidden)
	//* 146  350:aload           11
	//* 147  352:getfield        #103 <Field boolean Fragment.mAdded>
	//* 148  355:ifne            372
	//* 149  358:aload           11
	//* 150  360:getfield        #100 <Field boolean Fragment.mHidden>
	//* 151  363:ifne            372
			flag4 = true;
	//  152  366:iconst_1        
	//  153  367:istore          9
		else
	//* 154  369:goto            375
			flag4 = false;
	//  155  372:iconst_0        
	//  156  373:istore          9
		i = 1;
	//  157  375:iconst_1        
	//  158  376:istore          5
		flag2 = false;
	//  159  378:iconst_0        
	//  160  379:istore          6
		flag3 = false;
	//  161  381:iconst_0        
	//  162  382:istore          7
		Object obj;
label0:
		{
			op = ((BackStackRecord.Op) ((FragmentContainerTransition)sparsearray.get(j)));
	//  163  384:aload_2         
	//  164  385:iload           8
	//  165  387:invokevirtual   #122 <Method Object SparseArray.get(int)>
	//  166  390:checkcast       #14  <Class FragmentTransition$FragmentContainerTransition>
	//  167  393:astore_1        
			if(flag4)
	//* 168  394:iload           9
	//* 169  396:ifeq            426
			{
				op = ((BackStackRecord.Op) (ensureContainer(((FragmentContainerTransition) (op)), sparsearray, j)));
	//  170  399:aload_1         
	//  171  400:aload_2         
	//  172  401:iload           8
	//  173  403:invokestatic    #126 <Method FragmentTransition$FragmentContainerTransition ensureContainer(FragmentTransition$FragmentContainerTransition, SparseArray, int)>
	//  174  406:astore_1        
				op.lastIn = fragment;
	//  175  407:aload_1         
	//  176  408:aload           11
	//  177  410:putfield        #129 <Field Fragment FragmentTransition$FragmentContainerTransition.lastIn>
				op.lastInIsPop = flag;
	//  178  413:aload_1         
	//  179  414:iload_3         
	//  180  415:putfield        #132 <Field boolean FragmentTransition$FragmentContainerTransition.lastInIsPop>
				op.lastInTransaction = backstackrecord;
	//  181  418:aload_1         
	//  182  419:aload_0         
	//  183  420:putfield        #136 <Field BackStackRecord FragmentTransition$FragmentContainerTransition.lastInTransaction>
			}
	//* 184  423:goto            426
			if(!flag1 && i)
	//* 185  426:iload           4
	//* 186  428:ifne            503
	//* 187  431:iload           5
	//* 188  433:ifeq            503
			{
				if(op != null && ((FragmentContainerTransition) (op)).firstOut == fragment)
	//* 189  436:aload_1         
	//* 190  437:ifnull          454
	//* 191  440:aload_1         
	//* 192  441:getfield        #139 <Field Fragment FragmentTransition$FragmentContainerTransition.firstOut>
	//* 193  444:aload           11
	//* 194  446:if_acmpne       454
					op.firstOut = null;
	//  195  449:aload_1         
	//  196  450:aconst_null     
	//  197  451:putfield        #139 <Field Fragment FragmentTransition$FragmentContainerTransition.firstOut>
				FragmentManagerImpl fragmentmanagerimpl = backstackrecord.mManager;
	//  198  454:aload_0         
	//  199  455:getfield        #145 <Field FragmentManagerImpl BackStackRecord.mManager>
	//  200  458:astore          10
				if(fragment.mState < 1 && fragmentmanagerimpl.mCurState >= 1 && !backstackrecord.mReorderingAllowed)
	//* 201  460:aload           11
	//* 202  462:getfield        #148 <Field int Fragment.mState>
	//* 203  465:iconst_1        
	//* 204  466:icmpge          503
	//* 205  469:aload           10
	//* 206  471:getfield        #153 <Field int FragmentManagerImpl.mCurState>
	//* 207  474:iconst_1        
	//* 208  475:icmplt          503
	//* 209  478:aload_0         
	//* 210  479:getfield        #156 <Field boolean BackStackRecord.mReorderingAllowed>
	//* 211  482:ifne            503
				{
					fragmentmanagerimpl.makeActive(fragment);
	//  212  485:aload           10
	//  213  487:aload           11
	//  214  489:invokevirtual   #160 <Method void FragmentManagerImpl.makeActive(Fragment)>
					fragmentmanagerimpl.moveToState(fragment, 1, 0, 0, false);
	//  215  492:aload           10
	//  216  494:aload           11
	//  217  496:iconst_1        
	//  218  497:iconst_0        
	//  219  498:iconst_0        
	//  220  499:iconst_0        
	//  221  500:invokevirtual   #164 <Method void FragmentManagerImpl.moveToState(Fragment, int, int, int, boolean)>
				}
			}
			obj = ((Object) (op));
	//  222  503:aload_1         
	//  223  504:astore          10
			if(!flag3)
				break label0;
	//  224  506:iload           7
	//  225  508:ifeq            553
			if(op != null)
	//* 226  511:aload_1         
	//* 227  512:ifnull          525
			{
				obj = ((Object) (op));
	//  228  515:aload_1         
	//  229  516:astore          10
				if(((FragmentContainerTransition) (op)).firstOut != null)
					break label0;
	//  230  518:aload_1         
	//  231  519:getfield        #139 <Field Fragment FragmentTransition$FragmentContainerTransition.firstOut>
	//  232  522:ifnonnull       553
			}
			obj = ((Object) (ensureContainer(((FragmentContainerTransition) (op)), sparsearray, j)));
	//  233  525:aload_1         
	//  234  526:aload_2         
	//  235  527:iload           8
	//  236  529:invokestatic    #126 <Method FragmentTransition$FragmentContainerTransition ensureContainer(FragmentTransition$FragmentContainerTransition, SparseArray, int)>
	//  237  532:astore          10
			obj.firstOut = fragment;
	//  238  534:aload           10
	//  239  536:aload           11
	//  240  538:putfield        #139 <Field Fragment FragmentTransition$FragmentContainerTransition.firstOut>
			obj.firstOutIsPop = flag;
	//  241  541:aload           10
	//  242  543:iload_3         
	//  243  544:putfield        #167 <Field boolean FragmentTransition$FragmentContainerTransition.firstOutIsPop>
			obj.firstOutTransaction = backstackrecord;
	//  244  547:aload           10
	//  245  549:aload_0         
	//  246  550:putfield        #170 <Field BackStackRecord FragmentTransition$FragmentContainerTransition.firstOutTransaction>
		}
		if(!flag1 && flag2 && obj != null && ((FragmentContainerTransition) (obj)).lastIn == fragment)
	//* 247  553:iload           4
	//* 248  555:ifne            584
	//* 249  558:iload           6
	//* 250  560:ifeq            584
	//* 251  563:aload           10
	//* 252  565:ifnull          584
	//* 253  568:aload           10
	//* 254  570:getfield        #129 <Field Fragment FragmentTransition$FragmentContainerTransition.lastIn>
	//* 255  573:aload           11
	//* 256  575:if_acmpne       584
			obj.lastIn = null;
	//  257  578:aload           10
	//  258  580:aconst_null     
	//  259  581:putfield        #129 <Field Fragment FragmentTransition$FragmentContainerTransition.lastIn>
		return;
	//  260  584:return          
	}

	public static void calculateFragments(BackStackRecord backstackrecord, SparseArray sparsearray, boolean flag)
	{
		int j = backstackrecord.mOps.size();
	//    0    0:aload_0         
	//    1    1:getfield        #177 <Field ArrayList BackStackRecord.mOps>
	//    2    4:invokevirtual   #178 <Method int ArrayList.size()>
	//    3    7:istore          4
		for(int i = 0; i < j; i++)
	//*   4    9:iconst_0        
	//*   5   10:istore_3        
	//*   6   11:iload_3         
	//*   7   12:iload           4
	//*   8   14:icmpge          42
			addToFirstInLastOut(backstackrecord, (BackStackRecord.Op)backstackrecord.mOps.get(i), sparsearray, false, flag);
	//    9   17:aload_0         
	//   10   18:aload_0         
	//   11   19:getfield        #177 <Field ArrayList BackStackRecord.mOps>
	//   12   22:iload_3         
	//   13   23:invokevirtual   #179 <Method Object ArrayList.get(int)>
	//   14   26:checkcast       #81  <Class BackStackRecord$Op>
	//   15   29:aload_1         
	//   16   30:iconst_0        
	//   17   31:iload_2         
	//   18   32:invokestatic    #181 <Method void addToFirstInLastOut(BackStackRecord, BackStackRecord$Op, SparseArray, boolean, boolean)>

	//   19   35:iload_3         
	//   20   36:iconst_1        
	//   21   37:iadd            
	//   22   38:istore_3        
	//*  23   39:goto            11
	//   24   42:return          
	}

	private static ArrayMap calculateNameOverrides(int i, ArrayList arraylist, ArrayList arraylist1, int j, int k)
	{
		ArrayMap arraymap = new ArrayMap();
	//    0    0:new             #48  <Class ArrayMap>
	//    1    3:dup             
	//    2    4:invokespecial   #185 <Method void ArrayMap()>
	//    3    7:astore          10
		for(k--; k >= j; k--)
	//*   4    9:iload           4
	//*   5   11:iconst_1        
	//*   6   12:isub            
	//*   7   13:istore          4
	//*   8   15:iload           4
	//*   9   17:iload_3         
	//*  10   18:icmplt          204
		{
			BackStackRecord backstackrecord = (BackStackRecord)arraylist.get(k);
	//   11   21:aload_1         
	//   12   22:iload           4
	//   13   24:invokevirtual   #179 <Method Object ArrayList.get(int)>
	//   14   27:checkcast       #141 <Class BackStackRecord>
	//   15   30:astore          11
			if(!backstackrecord.interactsWith(i))
	//*  16   32:aload           11
	//*  17   34:iload_0         
	//*  18   35:invokevirtual   #189 <Method boolean BackStackRecord.interactsWith(int)>
	//*  19   38:ifne            44
				continue;
	//   20   41:goto            195
			boolean flag = ((Boolean)arraylist1.get(k)).booleanValue();
	//   21   44:aload_2         
	//   22   45:iload           4
	//   23   47:invokevirtual   #179 <Method Object ArrayList.get(int)>
	//   24   50:checkcast       #191 <Class Boolean>
	//   25   53:invokevirtual   #195 <Method boolean Boolean.booleanValue()>
	//   26   56:istore          7
			if(backstackrecord.mSharedElementSourceNames == null)
				continue;
	//   27   58:aload           11
	//   28   60:getfield        #198 <Field ArrayList BackStackRecord.mSharedElementSourceNames>
	//   29   63:ifnull          195
			int i1 = backstackrecord.mSharedElementSourceNames.size();
	//   30   66:aload           11
	//   31   68:getfield        #198 <Field ArrayList BackStackRecord.mSharedElementSourceNames>
	//   32   71:invokevirtual   #178 <Method int ArrayList.size()>
	//   33   74:istore          6
			ArrayList arraylist2;
			ArrayList arraylist3;
			if(flag)
	//*  34   76:iload           7
	//*  35   78:ifeq            98
			{
				arraylist3 = backstackrecord.mSharedElementSourceNames;
	//   36   81:aload           11
	//   37   83:getfield        #198 <Field ArrayList BackStackRecord.mSharedElementSourceNames>
	//   38   86:astore          9
				arraylist2 = backstackrecord.mSharedElementTargetNames;
	//   39   88:aload           11
	//   40   90:getfield        #201 <Field ArrayList BackStackRecord.mSharedElementTargetNames>
	//   41   93:astore          8
			} else
	//*  42   95:goto            112
			{
				arraylist2 = backstackrecord.mSharedElementSourceNames;
	//   43   98:aload           11
	//   44  100:getfield        #198 <Field ArrayList BackStackRecord.mSharedElementSourceNames>
	//   45  103:astore          8
				arraylist3 = backstackrecord.mSharedElementTargetNames;
	//   46  105:aload           11
	//   47  107:getfield        #201 <Field ArrayList BackStackRecord.mSharedElementTargetNames>
	//   48  110:astore          9
			}
			for(int l = 0; l < i1; l++)
	//*  49  112:iconst_0        
	//*  50  113:istore          5
	//*  51  115:iload           5
	//*  52  117:iload           6
	//*  53  119:icmpge          195
			{
				String s = (String)arraylist2.get(l);
	//   54  122:aload           8
	//   55  124:iload           5
	//   56  126:invokevirtual   #179 <Method Object ArrayList.get(int)>
	//   57  129:checkcast       #203 <Class String>
	//   58  132:astore          11
				String s1 = (String)arraylist3.get(l);
	//   59  134:aload           9
	//   60  136:iload           5
	//   61  138:invokevirtual   #179 <Method Object ArrayList.get(int)>
	//   62  141:checkcast       #203 <Class String>
	//   63  144:astore          12
				String s2 = (String)arraymap.remove(((Object) (s1)));
	//   64  146:aload           10
	//   65  148:aload           12
	//   66  150:invokevirtual   #207 <Method Object ArrayMap.remove(Object)>
	//   67  153:checkcast       #203 <Class String>
	//   68  156:astore          13
				if(s2 != null)
	//*  69  158:aload           13
	//*  70  160:ifnull          176
					arraymap.put(((Object) (s)), ((Object) (s2)));
	//   71  163:aload           10
	//   72  165:aload           11
	//   73  167:aload           13
	//   74  169:invokevirtual   #211 <Method Object ArrayMap.put(Object, Object)>
	//   75  172:pop             
				else
	//*  76  173:goto            186
					arraymap.put(((Object) (s)), ((Object) (s1)));
	//   77  176:aload           10
	//   78  178:aload           11
	//   79  180:aload           12
	//   80  182:invokevirtual   #211 <Method Object ArrayMap.put(Object, Object)>
	//   81  185:pop             
			}

	//   82  186:iload           5
	//   83  188:iconst_1        
	//   84  189:iadd            
	//   85  190:istore          5
		}

	//   86  192:goto            115
	//   87  195:iload           4
	//   88  197:iconst_1        
	//   89  198:isub            
	//   90  199:istore          4
	//*  91  201:goto            15
		return arraymap;
	//   92  204:aload           10
	//   93  206:areturn         
	}

	public static void calculatePopFragments(BackStackRecord backstackrecord, SparseArray sparsearray, boolean flag)
	{
		if(!backstackrecord.mManager.mContainer.onHasView())
	//*   0    0:aload_0         
	//*   1    1:getfield        #145 <Field FragmentManagerImpl BackStackRecord.mManager>
	//*   2    4:getfield        #217 <Field FragmentContainer FragmentManagerImpl.mContainer>
	//*   3    7:invokevirtual   #222 <Method boolean FragmentContainer.onHasView()>
	//*   4   10:ifne            14
			return;
	//    5   13:return          
		for(int i = backstackrecord.mOps.size() - 1; i >= 0; i--)
	//*   6   14:aload_0         
	//*   7   15:getfield        #177 <Field ArrayList BackStackRecord.mOps>
	//*   8   18:invokevirtual   #178 <Method int ArrayList.size()>
	//*   9   21:iconst_1        
	//*  10   22:isub            
	//*  11   23:istore_3        
	//*  12   24:iload_3         
	//*  13   25:iflt            53
			addToFirstInLastOut(backstackrecord, (BackStackRecord.Op)backstackrecord.mOps.get(i), sparsearray, true, flag);
	//   14   28:aload_0         
	//   15   29:aload_0         
	//   16   30:getfield        #177 <Field ArrayList BackStackRecord.mOps>
	//   17   33:iload_3         
	//   18   34:invokevirtual   #179 <Method Object ArrayList.get(int)>
	//   19   37:checkcast       #81  <Class BackStackRecord$Op>
	//   20   40:aload_1         
	//   21   41:iconst_1        
	//   22   42:iload_2         
	//   23   43:invokestatic    #181 <Method void addToFirstInLastOut(BackStackRecord, BackStackRecord$Op, SparseArray, boolean, boolean)>

	//   24   46:iload_3         
	//   25   47:iconst_1        
	//   26   48:isub            
	//   27   49:istore_3        
	//*  28   50:goto            24
	//   29   53:return          
	}

	static void callSharedElementStartEnd(Fragment fragment, Fragment fragment1, boolean flag, ArrayMap arraymap, boolean flag1)
	{
		if(flag)
	//*   0    0:iload_2         
	//*   1    1:ifeq            12
			fragment = ((Fragment) (fragment1.getEnterTransitionCallback()));
	//    2    4:aload_1         
	//    3    5:invokevirtual   #228 <Method SharedElementCallback Fragment.getEnterTransitionCallback()>
	//    4    8:astore_0        
		else
	//*   5    9:goto            17
			fragment = ((Fragment) (fragment.getEnterTransitionCallback()));
	//    6   12:aload_0         
	//    7   13:invokevirtual   #228 <Method SharedElementCallback Fragment.getEnterTransitionCallback()>
	//    8   16:astore_0        
		if(fragment != null)
	//*   9   17:aload_0         
	//*  10   18:ifnull          118
		{
			fragment1 = ((Fragment) (new ArrayList()));
	//   11   21:new             #72  <Class ArrayList>
	//   12   24:dup             
	//   13   25:invokespecial   #229 <Method void ArrayList()>
	//   14   28:astore_1        
			ArrayList arraylist = new ArrayList();
	//   15   29:new             #72  <Class ArrayList>
	//   16   32:dup             
	//   17   33:invokespecial   #229 <Method void ArrayList()>
	//   18   36:astore          7
			int j = 0;
	//   19   38:iconst_0        
	//   20   39:istore          6
			int i;
			if(arraymap == null)
	//*  21   41:aload_3         
	//*  22   42:ifnonnull       51
				i = 0;
	//   23   45:iconst_0        
	//   24   46:istore          5
			else
	//*  25   48:goto            57
				i = arraymap.size();
	//   26   51:aload_3         
	//   27   52:invokevirtual   #52  <Method int ArrayMap.size()>
	//   28   55:istore          5
			for(; j < i; j++)
	//*  29   57:iload           6
	//*  30   59:iload           5
	//*  31   61:icmpge          96
			{
				arraylist.add(arraymap.keyAt(j));
	//   32   64:aload           7
	//   33   66:aload_3         
	//   34   67:iload           6
	//   35   69:invokevirtual   #232 <Method Object ArrayMap.keyAt(int)>
	//   36   72:invokevirtual   #75  <Method boolean ArrayList.add(Object)>
	//   37   75:pop             
				((ArrayList) (fragment1)).add(arraymap.valueAt(j));
	//   38   76:aload_1         
	//   39   77:aload_3         
	//   40   78:iload           6
	//   41   80:invokevirtual   #56  <Method Object ArrayMap.valueAt(int)>
	//   42   83:invokevirtual   #75  <Method boolean ArrayList.add(Object)>
	//   43   86:pop             
			}

	//   44   87:iload           6
	//   45   89:iconst_1        
	//   46   90:iadd            
	//   47   91:istore          6
	//*  48   93:goto            57
			if(flag1)
	//*  49   96:iload           4
	//*  50   98:ifeq            110
			{
				((SharedElementCallback) (fragment)).onSharedElementStart(((List) (arraylist)), ((List) (fragment1)), ((List) (null)));
	//   51  101:aload_0         
	//   52  102:aload           7
	//   53  104:aload_1         
	//   54  105:aconst_null     
	//   55  106:invokevirtual   #238 <Method void SharedElementCallback.onSharedElementStart(List, List, List)>
				return;
	//   56  109:return          
			}
			((SharedElementCallback) (fragment)).onSharedElementEnd(((List) (arraylist)), ((List) (fragment1)), ((List) (null)));
	//   57  110:aload_0         
	//   58  111:aload           7
	//   59  113:aload_1         
	//   60  114:aconst_null     
	//   61  115:invokevirtual   #241 <Method void SharedElementCallback.onSharedElementEnd(List, List, List)>
		}
	//   62  118:return          
	}

	private static boolean canHandleAll(FragmentTransitionImpl fragmenttransitionimpl, List list)
	{
		int j = list.size();
	//    0    0:aload_1         
	//    1    1:invokeinterface #247 <Method int List.size()>
	//    2    6:istore_3        
		for(int i = 0; i < j; i++)
	//*   3    7:iconst_0        
	//*   4    8:istore_2        
	//*   5    9:iload_2         
	//*   6   10:iload_3         
	//*   7   11:icmpge          37
			if(!fragmenttransitionimpl.canHandle(list.get(i)))
	//*   8   14:aload_0         
	//*   9   15:aload_1         
	//*  10   16:iload_2         
	//*  11   17:invokeinterface #248 <Method Object List.get(int)>
	//*  12   22:invokevirtual   #253 <Method boolean FragmentTransitionImpl.canHandle(Object)>
	//*  13   25:ifne            30
				return false;
	//   14   28:iconst_0        
	//   15   29:ireturn         

	//   16   30:iload_2         
	//   17   31:iconst_1        
	//   18   32:iadd            
	//   19   33:istore_2        
	//*  20   34:goto            9
		return true;
	//   21   37:iconst_1        
	//   22   38:ireturn         
	}

	static ArrayMap captureInSharedElements(FragmentTransitionImpl fragmenttransitionimpl, ArrayMap arraymap, Object obj, FragmentContainerTransition fragmentcontainertransition)
	{
		Fragment fragment = fragmentcontainertransition.lastIn;
	//    0    0:aload_3         
	//    1    1:getfield        #129 <Field Fragment FragmentTransition$FragmentContainerTransition.lastIn>
	//    2    4:astore          6
		View view = fragment.getView();
	//    3    6:aload           6
	//    4    8:invokevirtual   #260 <Method View Fragment.getView()>
	//    5   11:astore          7
		if(!arraymap.isEmpty() && obj != null && view != null)
	//*   6   13:aload_1         
	//*   7   14:invokevirtual   #263 <Method boolean ArrayMap.isEmpty()>
	//*   8   17:ifne            223
	//*   9   20:aload_2         
	//*  10   21:ifnull          223
	//*  11   24:aload           7
	//*  12   26:ifnonnull       32
	//*  13   29:goto            223
		{
			ArrayMap arraymap1 = new ArrayMap();
	//   14   32:new             #48  <Class ArrayMap>
	//   15   35:dup             
	//   16   36:invokespecial   #185 <Method void ArrayMap()>
	//   17   39:astore          5
			fragmenttransitionimpl.findNamedViews(((java.util.Map) (arraymap1)), view);
	//   18   41:aload_0         
	//   19   42:aload           5
	//   20   44:aload           7
	//   21   46:invokevirtual   #267 <Method void FragmentTransitionImpl.findNamedViews(java.util.Map, View)>
			fragmenttransitionimpl = ((FragmentTransitionImpl) (fragmentcontainertransition.lastInTransaction));
	//   22   49:aload_3         
	//   23   50:getfield        #136 <Field BackStackRecord FragmentTransition$FragmentContainerTransition.lastInTransaction>
	//   24   53:astore_0        
			if(fragmentcontainertransition.lastInIsPop)
	//*  25   54:aload_3         
	//*  26   55:getfield        #132 <Field boolean FragmentTransition$FragmentContainerTransition.lastInIsPop>
	//*  27   58:ifeq            75
			{
				obj = ((Object) (fragment.getExitTransitionCallback()));
	//   28   61:aload           6
	//   29   63:invokevirtual   #270 <Method SharedElementCallback Fragment.getExitTransitionCallback()>
	//   30   66:astore_2        
				fragmenttransitionimpl = ((FragmentTransitionImpl) (((BackStackRecord) (fragmenttransitionimpl)).mSharedElementSourceNames));
	//   31   67:aload_0         
	//   32   68:getfield        #198 <Field ArrayList BackStackRecord.mSharedElementSourceNames>
	//   33   71:astore_0        
			} else
	//*  34   72:goto            86
			{
				obj = ((Object) (fragment.getEnterTransitionCallback()));
	//   35   75:aload           6
	//   36   77:invokevirtual   #228 <Method SharedElementCallback Fragment.getEnterTransitionCallback()>
	//   37   80:astore_2        
				fragmenttransitionimpl = ((FragmentTransitionImpl) (((BackStackRecord) (fragmenttransitionimpl)).mSharedElementTargetNames));
	//   38   81:aload_0         
	//   39   82:getfield        #201 <Field ArrayList BackStackRecord.mSharedElementTargetNames>
	//   40   85:astore_0        
			}
			if(fragmenttransitionimpl != null)
	//*  41   86:aload_0         
	//*  42   87:ifnull          107
			{
				arraymap1.retainAll(((Collection) (fragmenttransitionimpl)));
	//   43   90:aload           5
	//   44   92:aload_0         
	//   45   93:invokevirtual   #274 <Method boolean ArrayMap.retainAll(Collection)>
	//   46   96:pop             
				arraymap1.retainAll(arraymap.values());
	//   47   97:aload           5
	//   48   99:aload_1         
	//   49  100:invokevirtual   #278 <Method Collection ArrayMap.values()>
	//   50  103:invokevirtual   #274 <Method boolean ArrayMap.retainAll(Collection)>
	//   51  106:pop             
			}
			if(obj != null)
	//*  52  107:aload_2         
	//*  53  108:ifnull          214
			{
				((SharedElementCallback) (obj)).onMapSharedElements(((List) (fragmenttransitionimpl)), ((java.util.Map) (arraymap1)));
	//   54  111:aload_2         
	//   55  112:aload_0         
	//   56  113:aload           5
	//   57  115:invokevirtual   #282 <Method void SharedElementCallback.onMapSharedElements(List, java.util.Map)>
				for(int i = ((ArrayList) (fragmenttransitionimpl)).size() - 1; i >= 0; i--)
	//*  58  118:aload_0         
	//*  59  119:invokevirtual   #178 <Method int ArrayList.size()>
	//*  60  122:iconst_1        
	//*  61  123:isub            
	//*  62  124:istore          4
	//*  63  126:iload           4
	//*  64  128:iflt            220
				{
					fragmentcontainertransition = ((FragmentContainerTransition) ((String)((ArrayList) (fragmenttransitionimpl)).get(i)));
	//   65  131:aload_0         
	//   66  132:iload           4
	//   67  134:invokevirtual   #179 <Method Object ArrayList.get(int)>
	//   68  137:checkcast       #203 <Class String>
	//   69  140:astore_3        
					obj = ((Object) ((View)arraymap1.get(((Object) (fragmentcontainertransition)))));
	//   70  141:aload           5
	//   71  143:aload_3         
	//   72  144:invokevirtual   #284 <Method Object ArrayMap.get(Object)>
	//   73  147:checkcast       #58  <Class View>
	//   74  150:astore_2        
					if(obj == null)
	//*  75  151:aload_2         
	//*  76  152:ifnonnull       174
					{
						obj = ((Object) (findKeyForValue(arraymap, ((String) (fragmentcontainertransition)))));
	//   77  155:aload_1         
	//   78  156:aload_3         
	//   79  157:invokestatic    #288 <Method String findKeyForValue(ArrayMap, String)>
	//   80  160:astore_2        
						if(obj != null)
	//*  81  161:aload_2         
	//*  82  162:ifnull          205
							arraymap.remove(obj);
	//   83  165:aload_1         
	//   84  166:aload_2         
	//   85  167:invokevirtual   #207 <Method Object ArrayMap.remove(Object)>
	//   86  170:pop             
					} else
	//*  87  171:goto            205
					if(!((String) (fragmentcontainertransition)).equals(((Object) (ViewCompat.getTransitionName(((View) (obj)))))))
	//*  88  174:aload_3         
	//*  89  175:aload_2         
	//*  90  176:invokestatic    #64  <Method String ViewCompat.getTransitionName(View)>
	//*  91  179:invokevirtual   #291 <Method boolean String.equals(Object)>
	//*  92  182:ifne            205
					{
						fragmentcontainertransition = ((FragmentContainerTransition) (findKeyForValue(arraymap, ((String) (fragmentcontainertransition)))));
	//   93  185:aload_1         
	//   94  186:aload_3         
	//   95  187:invokestatic    #288 <Method String findKeyForValue(ArrayMap, String)>
	//   96  190:astore_3        
						if(fragmentcontainertransition != null)
	//*  97  191:aload_3         
	//*  98  192:ifnull          205
							arraymap.put(((Object) (fragmentcontainertransition)), ((Object) (ViewCompat.getTransitionName(((View) (obj))))));
	//   99  195:aload_1         
	//  100  196:aload_3         
	//  101  197:aload_2         
	//  102  198:invokestatic    #64  <Method String ViewCompat.getTransitionName(View)>
	//  103  201:invokevirtual   #211 <Method Object ArrayMap.put(Object, Object)>
	//  104  204:pop             
					}
				}

	//  105  205:iload           4
	//  106  207:iconst_1        
	//  107  208:isub            
	//  108  209:istore          4
			} else
	//* 109  211:goto            126
			{
				retainValues(arraymap, arraymap1);
	//  110  214:aload_1         
	//  111  215:aload           5
	//  112  217:invokestatic    #295 <Method void retainValues(ArrayMap, ArrayMap)>
			}
			return arraymap1;
	//  113  220:aload           5
	//  114  222:areturn         
		} else
		{
			arraymap.clear();
	//  115  223:aload_1         
	//  116  224:invokevirtual   #298 <Method void ArrayMap.clear()>
			return null;
	//  117  227:aconst_null     
	//  118  228:areturn         
		}
	}

	private static ArrayMap captureOutSharedElements(FragmentTransitionImpl fragmenttransitionimpl, ArrayMap arraymap, Object obj, FragmentContainerTransition fragmentcontainertransition)
	{
		if(!arraymap.isEmpty() && obj != null)
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #263 <Method boolean ArrayMap.isEmpty()>
	//*   2    4:ifne            189
	//*   3    7:aload_2         
	//*   4    8:ifnonnull       14
	//*   5   11:goto            189
		{
			obj = ((Object) (fragmentcontainertransition.firstOut));
	//    6   14:aload_3         
	//    7   15:getfield        #139 <Field Fragment FragmentTransition$FragmentContainerTransition.firstOut>
	//    8   18:astore_2        
			ArrayMap arraymap1 = new ArrayMap();
	//    9   19:new             #48  <Class ArrayMap>
	//   10   22:dup             
	//   11   23:invokespecial   #185 <Method void ArrayMap()>
	//   12   26:astore          5
			fragmenttransitionimpl.findNamedViews(((java.util.Map) (arraymap1)), ((Fragment) (obj)).getView());
	//   13   28:aload_0         
	//   14   29:aload           5
	//   15   31:aload_2         
	//   16   32:invokevirtual   #260 <Method View Fragment.getView()>
	//   17   35:invokevirtual   #267 <Method void FragmentTransitionImpl.findNamedViews(java.util.Map, View)>
			fragmenttransitionimpl = ((FragmentTransitionImpl) (fragmentcontainertransition.firstOutTransaction));
	//   18   38:aload_3         
	//   19   39:getfield        #170 <Field BackStackRecord FragmentTransition$FragmentContainerTransition.firstOutTransaction>
	//   20   42:astore_0        
			if(fragmentcontainertransition.firstOutIsPop)
	//*  21   43:aload_3         
	//*  22   44:getfield        #167 <Field boolean FragmentTransition$FragmentContainerTransition.firstOutIsPop>
	//*  23   47:ifeq            63
			{
				obj = ((Object) (((Fragment) (obj)).getEnterTransitionCallback()));
	//   24   50:aload_2         
	//   25   51:invokevirtual   #228 <Method SharedElementCallback Fragment.getEnterTransitionCallback()>
	//   26   54:astore_2        
				fragmenttransitionimpl = ((FragmentTransitionImpl) (((BackStackRecord) (fragmenttransitionimpl)).mSharedElementTargetNames));
	//   27   55:aload_0         
	//   28   56:getfield        #201 <Field ArrayList BackStackRecord.mSharedElementTargetNames>
	//   29   59:astore_0        
			} else
	//*  30   60:goto            73
			{
				obj = ((Object) (((Fragment) (obj)).getExitTransitionCallback()));
	//   31   63:aload_2         
	//   32   64:invokevirtual   #270 <Method SharedElementCallback Fragment.getExitTransitionCallback()>
	//   33   67:astore_2        
				fragmenttransitionimpl = ((FragmentTransitionImpl) (((BackStackRecord) (fragmenttransitionimpl)).mSharedElementSourceNames));
	//   34   68:aload_0         
	//   35   69:getfield        #198 <Field ArrayList BackStackRecord.mSharedElementSourceNames>
	//   36   72:astore_0        
			}
			arraymap1.retainAll(((Collection) (fragmenttransitionimpl)));
	//   37   73:aload           5
	//   38   75:aload_0         
	//   39   76:invokevirtual   #274 <Method boolean ArrayMap.retainAll(Collection)>
	//   40   79:pop             
			if(obj != null)
	//*  41   80:aload_2         
	//*  42   81:ifnull          176
			{
				((SharedElementCallback) (obj)).onMapSharedElements(((List) (fragmenttransitionimpl)), ((java.util.Map) (arraymap1)));
	//   43   84:aload_2         
	//   44   85:aload_0         
	//   45   86:aload           5
	//   46   88:invokevirtual   #282 <Method void SharedElementCallback.onMapSharedElements(List, java.util.Map)>
				for(int i = ((ArrayList) (fragmenttransitionimpl)).size() - 1; i >= 0; i--)
	//*  47   91:aload_0         
	//*  48   92:invokevirtual   #178 <Method int ArrayList.size()>
	//*  49   95:iconst_1        
	//*  50   96:isub            
	//*  51   97:istore          4
	//*  52   99:iload           4
	//*  53  101:iflt            186
				{
					fragmentcontainertransition = ((FragmentContainerTransition) ((String)((ArrayList) (fragmenttransitionimpl)).get(i)));
	//   54  104:aload_0         
	//   55  105:iload           4
	//   56  107:invokevirtual   #179 <Method Object ArrayList.get(int)>
	//   57  110:checkcast       #203 <Class String>
	//   58  113:astore_3        
					obj = ((Object) ((View)arraymap1.get(((Object) (fragmentcontainertransition)))));
	//   59  114:aload           5
	//   60  116:aload_3         
	//   61  117:invokevirtual   #284 <Method Object ArrayMap.get(Object)>
	//   62  120:checkcast       #58  <Class View>
	//   63  123:astore_2        
					if(obj == null)
	//*  64  124:aload_2         
	//*  65  125:ifnonnull       137
						arraymap.remove(((Object) (fragmentcontainertransition)));
	//   66  128:aload_1         
	//   67  129:aload_3         
	//   68  130:invokevirtual   #207 <Method Object ArrayMap.remove(Object)>
	//   69  133:pop             
					else
	//*  70  134:goto            167
					if(!((String) (fragmentcontainertransition)).equals(((Object) (ViewCompat.getTransitionName(((View) (obj)))))))
	//*  71  137:aload_3         
	//*  72  138:aload_2         
	//*  73  139:invokestatic    #64  <Method String ViewCompat.getTransitionName(View)>
	//*  74  142:invokevirtual   #291 <Method boolean String.equals(Object)>
	//*  75  145:ifne            167
					{
						fragmentcontainertransition = ((FragmentContainerTransition) ((String)arraymap.remove(((Object) (fragmentcontainertransition)))));
	//   76  148:aload_1         
	//   77  149:aload_3         
	//   78  150:invokevirtual   #207 <Method Object ArrayMap.remove(Object)>
	//   79  153:checkcast       #203 <Class String>
	//   80  156:astore_3        
						arraymap.put(((Object) (ViewCompat.getTransitionName(((View) (obj))))), ((Object) (fragmentcontainertransition)));
	//   81  157:aload_1         
	//   82  158:aload_2         
	//   83  159:invokestatic    #64  <Method String ViewCompat.getTransitionName(View)>
	//   84  162:aload_3         
	//   85  163:invokevirtual   #211 <Method Object ArrayMap.put(Object, Object)>
	//   86  166:pop             
					}
				}

	//   87  167:iload           4
	//   88  169:iconst_1        
	//   89  170:isub            
	//   90  171:istore          4
			} else
	//*  91  173:goto            99
			{
				arraymap.retainAll(((Collection) (arraymap1.keySet())));
	//   92  176:aload_1         
	//   93  177:aload           5
	//   94  179:invokevirtual   #304 <Method java.util.Set ArrayMap.keySet()>
	//   95  182:invokevirtual   #274 <Method boolean ArrayMap.retainAll(Collection)>
	//   96  185:pop             
			}
			return arraymap1;
	//   97  186:aload           5
	//   98  188:areturn         
		} else
		{
			arraymap.clear();
	//   99  189:aload_1         
	//  100  190:invokevirtual   #298 <Method void ArrayMap.clear()>
			return null;
	//  101  193:aconst_null     
	//  102  194:areturn         
		}
	}

	private static FragmentTransitionImpl chooseImpl(Fragment fragment, Fragment fragment1)
	{
		ArrayList arraylist = new ArrayList();
	//    0    0:new             #72  <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #229 <Method void ArrayList()>
	//    3    7:astore_2        
		if(fragment != null)
	//*   4    8:aload_0         
	//*   5    9:ifnull          57
		{
			Object obj = fragment.getExitTransition();
	//    6   12:aload_0         
	//    7   13:invokevirtual   #310 <Method Object Fragment.getExitTransition()>
	//    8   16:astore_3        
			if(obj != null)
	//*   9   17:aload_3         
	//*  10   18:ifnull          27
				arraylist.add(obj);
	//   11   21:aload_2         
	//   12   22:aload_3         
	//   13   23:invokevirtual   #75  <Method boolean ArrayList.add(Object)>
	//   14   26:pop             
			obj = fragment.getReturnTransition();
	//   15   27:aload_0         
	//   16   28:invokevirtual   #313 <Method Object Fragment.getReturnTransition()>
	//   17   31:astore_3        
			if(obj != null)
	//*  18   32:aload_3         
	//*  19   33:ifnull          42
				arraylist.add(obj);
	//   20   36:aload_2         
	//   21   37:aload_3         
	//   22   38:invokevirtual   #75  <Method boolean ArrayList.add(Object)>
	//   23   41:pop             
			fragment = ((Fragment) (fragment.getSharedElementReturnTransition()));
	//   24   42:aload_0         
	//   25   43:invokevirtual   #316 <Method Object Fragment.getSharedElementReturnTransition()>
	//   26   46:astore_0        
			if(fragment != null)
	//*  27   47:aload_0         
	//*  28   48:ifnull          57
				arraylist.add(((Object) (fragment)));
	//   29   51:aload_2         
	//   30   52:aload_0         
	//   31   53:invokevirtual   #75  <Method boolean ArrayList.add(Object)>
	//   32   56:pop             
		}
		if(fragment1 != null)
	//*  33   57:aload_1         
	//*  34   58:ifnull          106
		{
			fragment = ((Fragment) (fragment1.getEnterTransition()));
	//   35   61:aload_1         
	//   36   62:invokevirtual   #319 <Method Object Fragment.getEnterTransition()>
	//   37   65:astore_0        
			if(fragment != null)
	//*  38   66:aload_0         
	//*  39   67:ifnull          76
				arraylist.add(((Object) (fragment)));
	//   40   70:aload_2         
	//   41   71:aload_0         
	//   42   72:invokevirtual   #75  <Method boolean ArrayList.add(Object)>
	//   43   75:pop             
			fragment = ((Fragment) (fragment1.getReenterTransition()));
	//   44   76:aload_1         
	//   45   77:invokevirtual   #322 <Method Object Fragment.getReenterTransition()>
	//   46   80:astore_0        
			if(fragment != null)
	//*  47   81:aload_0         
	//*  48   82:ifnull          91
				arraylist.add(((Object) (fragment)));
	//   49   85:aload_2         
	//   50   86:aload_0         
	//   51   87:invokevirtual   #75  <Method boolean ArrayList.add(Object)>
	//   52   90:pop             
			fragment = ((Fragment) (fragment1.getSharedElementEnterTransition()));
	//   53   91:aload_1         
	//   54   92:invokevirtual   #325 <Method Object Fragment.getSharedElementEnterTransition()>
	//   55   95:astore_0        
			if(fragment != null)
	//*  56   96:aload_0         
	//*  57   97:ifnull          106
				arraylist.add(((Object) (fragment)));
	//   58  100:aload_2         
	//   59  101:aload_0         
	//   60  102:invokevirtual   #75  <Method boolean ArrayList.add(Object)>
	//   61  105:pop             
		}
		if(arraylist.isEmpty())
	//*  62  106:aload_2         
	//*  63  107:invokevirtual   #326 <Method boolean ArrayList.isEmpty()>
	//*  64  110:ifeq            115
			return null;
	//   65  113:aconst_null     
	//   66  114:areturn         
		fragment = ((Fragment) (PLATFORM_IMPL));
	//   67  115:getstatic       #37  <Field FragmentTransitionImpl PLATFORM_IMPL>
	//   68  118:astore_0        
		if(fragment != null && canHandleAll(((FragmentTransitionImpl) (fragment)), ((List) (arraylist))))
	//*  69  119:aload_0         
	//*  70  120:ifnull          135
	//*  71  123:aload_0         
	//*  72  124:aload_2         
	//*  73  125:invokestatic    #328 <Method boolean canHandleAll(FragmentTransitionImpl, List)>
	//*  74  128:ifeq            135
			return PLATFORM_IMPL;
	//   75  131:getstatic       #37  <Field FragmentTransitionImpl PLATFORM_IMPL>
	//   76  134:areturn         
		fragment = ((Fragment) (SUPPORT_IMPL));
	//   77  135:getstatic       #43  <Field FragmentTransitionImpl SUPPORT_IMPL>
	//   78  138:astore_0        
		if(fragment != null && canHandleAll(((FragmentTransitionImpl) (fragment)), ((List) (arraylist))))
	//*  79  139:aload_0         
	//*  80  140:ifnull          155
	//*  81  143:aload_0         
	//*  82  144:aload_2         
	//*  83  145:invokestatic    #328 <Method boolean canHandleAll(FragmentTransitionImpl, List)>
	//*  84  148:ifeq            155
			return SUPPORT_IMPL;
	//   85  151:getstatic       #43  <Field FragmentTransitionImpl SUPPORT_IMPL>
	//   86  154:areturn         
		if(PLATFORM_IMPL == null && SUPPORT_IMPL == null)
	//*  87  155:getstatic       #37  <Field FragmentTransitionImpl PLATFORM_IMPL>
	//*  88  158:ifnonnull       169
	//*  89  161:getstatic       #43  <Field FragmentTransitionImpl SUPPORT_IMPL>
	//*  90  164:ifnonnull       169
			return null;
	//   91  167:aconst_null     
	//   92  168:areturn         
		else
			throw new IllegalArgumentException("Invalid Transition types");
	//   93  169:new             #330 <Class IllegalArgumentException>
	//   94  172:dup             
	//   95  173:ldc2            #332 <String "Invalid Transition types">
	//   96  176:invokespecial   #335 <Method void IllegalArgumentException(String)>
	//   97  179:athrow          
	}

	static ArrayList configureEnteringExitingViews(FragmentTransitionImpl fragmenttransitionimpl, Object obj, Fragment fragment, ArrayList arraylist, View view)
	{
		if(obj != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          69
		{
			ArrayList arraylist1 = new ArrayList();
	//    2    4:new             #72  <Class ArrayList>
	//    3    7:dup             
	//    4    8:invokespecial   #229 <Method void ArrayList()>
	//    5   11:astore          5
			fragment = ((Fragment) (fragment.getView()));
	//    6   13:aload_2         
	//    7   14:invokevirtual   #260 <Method View Fragment.getView()>
	//    8   17:astore_2        
			if(fragment != null)
	//*   9   18:aload_2         
	//*  10   19:ifnull          29
				fragmenttransitionimpl.captureTransitioningViews(arraylist1, ((View) (fragment)));
	//   11   22:aload_0         
	//   12   23:aload           5
	//   13   25:aload_2         
	//   14   26:invokevirtual   #341 <Method void FragmentTransitionImpl.captureTransitioningViews(ArrayList, View)>
			if(arraylist != null)
	//*  15   29:aload_3         
	//*  16   30:ifnull          40
				arraylist1.removeAll(((Collection) (arraylist)));
	//   17   33:aload           5
	//   18   35:aload_3         
	//   19   36:invokevirtual   #344 <Method boolean ArrayList.removeAll(Collection)>
	//   20   39:pop             
			fragment = ((Fragment) (arraylist1));
	//   21   40:aload           5
	//   22   42:astore_2        
			if(!arraylist1.isEmpty())
	//*  23   43:aload           5
	//*  24   45:invokevirtual   #326 <Method boolean ArrayList.isEmpty()>
	//*  25   48:ifne            71
			{
				arraylist1.add(((Object) (view)));
	//   26   51:aload           5
	//   27   53:aload           4
	//   28   55:invokevirtual   #75  <Method boolean ArrayList.add(Object)>
	//   29   58:pop             
				fragmenttransitionimpl.addTargets(obj, arraylist1);
	//   30   59:aload_0         
	//   31   60:aload_1         
	//   32   61:aload           5
	//   33   63:invokevirtual   #348 <Method void FragmentTransitionImpl.addTargets(Object, ArrayList)>
				return arraylist1;
	//   34   66:aload           5
	//   35   68:areturn         
			}
		} else
		{
			fragment = null;
	//   36   69:aconst_null     
	//   37   70:astore_2        
		}
		return ((ArrayList) (fragment));
	//   38   71:aload_2         
	//   39   72:areturn         
	}

	private static Object configureSharedElementsOrdered(FragmentTransitionImpl fragmenttransitionimpl, ViewGroup viewgroup, View view, ArrayMap arraymap, FragmentContainerTransition fragmentcontainertransition, ArrayList arraylist, ArrayList arraylist1, Object obj, 
			Object obj1)
	{
		Fragment fragment = fragmentcontainertransition.lastIn;
	//    0    0:aload           4
	//    1    2:getfield        #129 <Field Fragment FragmentTransition$FragmentContainerTransition.lastIn>
	//    2    5:astore          12
		Fragment fragment1 = fragmentcontainertransition.firstOut;
	//    3    7:aload           4
	//    4    9:getfield        #139 <Field Fragment FragmentTransition$FragmentContainerTransition.firstOut>
	//    5   12:astore          13
		if(fragment != null)
	//*   6   14:aload           12
	//*   7   16:ifnull          228
		{
			if(fragment1 == null)
	//*   8   19:aload           13
	//*   9   21:ifnonnull       26
				return ((Object) (null));
	//   10   24:aconst_null     
	//   11   25:areturn         
			boolean flag = fragmentcontainertransition.lastInIsPop;
	//   12   26:aload           4
	//   13   28:getfield        #132 <Field boolean FragmentTransition$FragmentContainerTransition.lastInIsPop>
	//   14   31:istore          9
			Object obj2;
			if(arraymap.isEmpty())
	//*  15   33:aload_3         
	//*  16   34:invokevirtual   #263 <Method boolean ArrayMap.isEmpty()>
	//*  17   37:ifeq            46
				obj2 = null;
	//   18   40:aconst_null     
	//   19   41:astore          10
			else
	//*  20   43:goto            58
				obj2 = getSharedElementTransition(fragmenttransitionimpl, fragment, fragment1, flag);
	//   21   46:aload_0         
	//   22   47:aload           12
	//   23   49:aload           13
	//   24   51:iload           9
	//   25   53:invokestatic    #355 <Method Object getSharedElementTransition(FragmentTransitionImpl, Fragment, Fragment, boolean)>
	//   26   56:astore          10
			ArrayMap arraymap1 = captureOutSharedElements(fragmenttransitionimpl, arraymap, obj2, fragmentcontainertransition);
	//   27   58:aload_0         
	//   28   59:aload_3         
	//   29   60:aload           10
	//   30   62:aload           4
	//   31   64:invokestatic    #357 <Method ArrayMap captureOutSharedElements(FragmentTransitionImpl, ArrayMap, Object, FragmentTransition$FragmentContainerTransition)>
	//   32   67:astore          14
			if(arraymap.isEmpty())
	//*  33   69:aload_3         
	//*  34   70:invokevirtual   #263 <Method boolean ArrayMap.isEmpty()>
	//*  35   73:ifeq            82
				obj2 = null;
	//   36   76:aconst_null     
	//   37   77:astore          10
			else
	//*  38   79:goto            93
				arraylist.addAll(arraymap1.values());
	//   39   82:aload           5
	//   40   84:aload           14
	//   41   86:invokevirtual   #278 <Method Collection ArrayMap.values()>
	//   42   89:invokevirtual   #360 <Method boolean ArrayList.addAll(Collection)>
	//   43   92:pop             
			if(obj == null && obj1 == null && obj2 == null)
	//*  44   93:aload           7
	//*  45   95:ifnonnull       110
	//*  46   98:aload           8
	//*  47  100:ifnonnull       110
	//*  48  103:aload           10
	//*  49  105:ifnonnull       110
				return ((Object) (null));
	//   50  108:aconst_null     
	//   51  109:areturn         
			callSharedElementStartEnd(fragment, fragment1, flag, arraymap1, true);
	//   52  110:aload           12
	//   53  112:aload           13
	//   54  114:iload           9
	//   55  116:aload           14
	//   56  118:iconst_1        
	//   57  119:invokestatic    #362 <Method void callSharedElementStartEnd(Fragment, Fragment, boolean, ArrayMap, boolean)>
			if(obj2 != null)
	//*  58  122:aload           10
	//*  59  124:ifnull          189
			{
				Rect rect = new Rect();
	//   60  127:new             #364 <Class Rect>
	//   61  130:dup             
	//   62  131:invokespecial   #365 <Method void Rect()>
	//   63  134:astore          11
				fragmenttransitionimpl.setSharedElementTargets(obj2, view, arraylist);
	//   64  136:aload_0         
	//   65  137:aload           10
	//   66  139:aload_2         
	//   67  140:aload           5
	//   68  142:invokevirtual   #369 <Method void FragmentTransitionImpl.setSharedElementTargets(Object, View, ArrayList)>
				setOutEpicenter(fragmenttransitionimpl, obj2, obj1, arraymap1, fragmentcontainertransition.firstOutIsPop, fragmentcontainertransition.firstOutTransaction);
	//   69  145:aload_0         
	//   70  146:aload           10
	//   71  148:aload           8
	//   72  150:aload           14
	//   73  152:aload           4
	//   74  154:getfield        #167 <Field boolean FragmentTransition$FragmentContainerTransition.firstOutIsPop>
	//   75  157:aload           4
	//   76  159:getfield        #170 <Field BackStackRecord FragmentTransition$FragmentContainerTransition.firstOutTransaction>
	//   77  162:invokestatic    #373 <Method void setOutEpicenter(FragmentTransitionImpl, Object, Object, ArrayMap, boolean, BackStackRecord)>
				obj1 = ((Object) (rect));
	//   78  165:aload           11
	//   79  167:astore          8
				if(obj != null)
	//*  80  169:aload           7
	//*  81  171:ifnull          192
				{
					fragmenttransitionimpl.setEpicenter(obj, rect);
	//   82  174:aload_0         
	//   83  175:aload           7
	//   84  177:aload           11
	//   85  179:invokevirtual   #377 <Method void FragmentTransitionImpl.setEpicenter(Object, Rect)>
					obj1 = ((Object) (rect));
	//   86  182:aload           11
	//   87  184:astore          8
				}
			} else
	//*  88  186:goto            192
			{
				obj1 = null;
	//   89  189:aconst_null     
	//   90  190:astore          8
			}
			OneShotPreDrawListener.add(((View) (viewgroup)), new Runnable(fragmenttransitionimpl, arraymap, obj2, fragmentcontainertransition, arraylist1, view, fragment, fragment1, flag, arraylist, obj, ((Rect) (obj1))) {

				public void run()
				{
					Object obj3 = ((Object) (FragmentTransition.captureInSharedElements(impl, nameOverrides, finalSharedElementTransition, fragments)));
				//    0    0:aload_0         
				//    1    1:getfield        #36  <Field FragmentTransitionImpl val$impl>
				//    2    4:aload_0         
				//    3    5:getfield        #38  <Field ArrayMap val$nameOverrides>
				//    4    8:aload_0         
				//    5    9:getfield        #40  <Field Object val$finalSharedElementTransition>
				//    6   12:aload_0         
				//    7   13:getfield        #42  <Field FragmentTransition$FragmentContainerTransition val$fragments>
				//    8   16:invokestatic    #67  <Method ArrayMap FragmentTransition.captureInSharedElements(FragmentTransitionImpl, ArrayMap, Object, FragmentTransition$FragmentContainerTransition)>
				//    9   19:astore_1        
					if(obj3 != null)
				//*  10   20:aload_1         
				//*  11   21:ifnull          48
					{
						sharedElementsIn.addAll(((ArrayMap) (obj3)).values());
				//   12   24:aload_0         
				//   13   25:getfield        #44  <Field ArrayList val$sharedElementsIn>
				//   14   28:aload_1         
				//   15   29:invokevirtual   #73  <Method Collection ArrayMap.values()>
				//   16   32:invokevirtual   #79  <Method boolean ArrayList.addAll(Collection)>
				//   17   35:pop             
						sharedElementsIn.add(((Object) (nonExistentView)));
				//   18   36:aload_0         
				//   19   37:getfield        #44  <Field ArrayList val$sharedElementsIn>
				//   20   40:aload_0         
				//   21   41:getfield        #46  <Field View val$nonExistentView>
				//   22   44:invokevirtual   #83  <Method boolean ArrayList.add(Object)>
				//   23   47:pop             
					}
					FragmentTransition.callSharedElementStartEnd(inFragment, outFragment, inIsPop, ((ArrayMap) (obj3)), false);
				//   24   48:aload_0         
				//   25   49:getfield        #48  <Field Fragment val$inFragment>
				//   26   52:aload_0         
				//   27   53:getfield        #50  <Field Fragment val$outFragment>
				//   28   56:aload_0         
				//   29   57:getfield        #52  <Field boolean val$inIsPop>
				//   30   60:aload_1         
				//   31   61:iconst_0        
				//   32   62:invokestatic    #87  <Method void FragmentTransition.callSharedElementStartEnd(Fragment, Fragment, boolean, ArrayMap, boolean)>
					Object obj4 = finalSharedElementTransition;
				//   33   65:aload_0         
				//   34   66:getfield        #40  <Field Object val$finalSharedElementTransition>
				//   35   69:astore_2        
					if(obj4 != null)
				//*  36   70:aload_2         
				//*  37   71:ifnull          123
					{
						impl.swapSharedElementTargets(obj4, sharedElementsOut, sharedElementsIn);
				//   38   74:aload_0         
				//   39   75:getfield        #36  <Field FragmentTransitionImpl val$impl>
				//   40   78:aload_2         
				//   41   79:aload_0         
				//   42   80:getfield        #54  <Field ArrayList val$sharedElementsOut>
				//   43   83:aload_0         
				//   44   84:getfield        #44  <Field ArrayList val$sharedElementsIn>
				//   45   87:invokevirtual   #93  <Method void FragmentTransitionImpl.swapSharedElementTargets(Object, ArrayList, ArrayList)>
						obj3 = ((Object) (FragmentTransition.getInEpicenterView(((ArrayMap) (obj3)), fragments, enterTransition, inIsPop)));
				//   46   90:aload_1         
				//   47   91:aload_0         
				//   48   92:getfield        #42  <Field FragmentTransition$FragmentContainerTransition val$fragments>
				//   49   95:aload_0         
				//   50   96:getfield        #56  <Field Object val$enterTransition>
				//   51   99:aload_0         
				//   52  100:getfield        #52  <Field boolean val$inIsPop>
				//   53  103:invokestatic    #97  <Method View FragmentTransition.getInEpicenterView(ArrayMap, FragmentTransition$FragmentContainerTransition, Object, boolean)>
				//   54  106:astore_1        
						if(obj3 != null)
				//*  55  107:aload_1         
				//*  56  108:ifnull          123
							impl.getBoundsOnScreen(((View) (obj3)), inEpicenter);
				//   57  111:aload_0         
				//   58  112:getfield        #36  <Field FragmentTransitionImpl val$impl>
				//   59  115:aload_1         
				//   60  116:aload_0         
				//   61  117:getfield        #58  <Field Rect val$inEpicenter>
				//   62  120:invokevirtual   #101 <Method void FragmentTransitionImpl.getBoundsOnScreen(View, Rect)>
					}
				//   63  123:return          
				}

				final Object val$enterTransition;
				final Object val$finalSharedElementTransition;
				final FragmentContainerTransition val$fragments;
				final FragmentTransitionImpl val$impl;
				final Rect val$inEpicenter;
				final Fragment val$inFragment;
				final boolean val$inIsPop;
				final ArrayMap val$nameOverrides;
				final View val$nonExistentView;
				final Fragment val$outFragment;
				final ArrayList val$sharedElementsIn;
				final ArrayList val$sharedElementsOut;

			
			{
				impl = fragmenttransitionimpl;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #36  <Field FragmentTransitionImpl val$impl>
				nameOverrides = arraymap;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #38  <Field ArrayMap val$nameOverrides>
				finalSharedElementTransition = obj;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #40  <Field Object val$finalSharedElementTransition>
				fragments = fragmentcontainertransition;
			//    9   15:aload_0         
			//   10   16:aload           4
			//   11   18:putfield        #42  <Field FragmentTransition$FragmentContainerTransition val$fragments>
				sharedElementsIn = arraylist;
			//   12   21:aload_0         
			//   13   22:aload           5
			//   14   24:putfield        #44  <Field ArrayList val$sharedElementsIn>
				nonExistentView = view;
			//   15   27:aload_0         
			//   16   28:aload           6
			//   17   30:putfield        #46  <Field View val$nonExistentView>
				inFragment = fragment;
			//   18   33:aload_0         
			//   19   34:aload           7
			//   20   36:putfield        #48  <Field Fragment val$inFragment>
				outFragment = fragment1;
			//   21   39:aload_0         
			//   22   40:aload           8
			//   23   42:putfield        #50  <Field Fragment val$outFragment>
				inIsPop = flag;
			//   24   45:aload_0         
			//   25   46:iload           9
			//   26   48:putfield        #52  <Field boolean val$inIsPop>
				sharedElementsOut = arraylist1;
			//   27   51:aload_0         
			//   28   52:aload           10
			//   29   54:putfield        #54  <Field ArrayList val$sharedElementsOut>
				enterTransition = obj1;
			//   30   57:aload_0         
			//   31   58:aload           11
			//   32   60:putfield        #56  <Field Object val$enterTransition>
				inEpicenter = rect;
			//   33   63:aload_0         
			//   34   64:aload           12
			//   35   66:putfield        #58  <Field Rect val$inEpicenter>
				super();
			//   36   69:aload_0         
			//   37   70:invokespecial   #61  <Method void Object()>
			//   38   73:return          
			}
			}
);
	//   91  192:aload_1         
	//   92  193:new             #12  <Class FragmentTransition$4>
	//   93  196:dup             
	//   94  197:aload_0         
	//   95  198:aload_3         
	//   96  199:aload           10
	//   97  201:aload           4
	//   98  203:aload           6
	//   99  205:aload_2         
	//  100  206:aload           12
	//  101  208:aload           13
	//  102  210:iload           9
	//  103  212:aload           5
	//  104  214:aload           7
	//  105  216:aload           8
	//  106  218:invokespecial   #380 <Method void FragmentTransition$4(FragmentTransitionImpl, ArrayMap, Object, FragmentTransition$FragmentContainerTransition, ArrayList, View, Fragment, Fragment, boolean, ArrayList, Object, Rect)>
	//  107  221:invokestatic    #385 <Method OneShotPreDrawListener OneShotPreDrawListener.add(View, Runnable)>
	//  108  224:pop             
			return obj2;
	//  109  225:aload           10
	//  110  227:areturn         
		} else
		{
			return ((Object) (null));
	//  111  228:aconst_null     
	//  112  229:areturn         
		}
	}

	private static Object configureSharedElementsReordered(FragmentTransitionImpl fragmenttransitionimpl, ViewGroup viewgroup, View view, ArrayMap arraymap, FragmentContainerTransition fragmentcontainertransition, ArrayList arraylist, ArrayList arraylist1, Object obj, 
			Object obj1)
	{
		Fragment fragment = fragmentcontainertransition.lastIn;
	//    0    0:aload           4
	//    1    2:getfield        #129 <Field Fragment FragmentTransition$FragmentContainerTransition.lastIn>
	//    2    5:astore          11
		Fragment fragment1 = fragmentcontainertransition.firstOut;
	//    3    7:aload           4
	//    4    9:getfield        #139 <Field Fragment FragmentTransition$FragmentContainerTransition.firstOut>
	//    5   12:astore          12
		if(fragment != null)
	//*   6   14:aload           11
	//*   7   16:ifnull          28
			fragment.getView().setVisibility(0);
	//    8   19:aload           11
	//    9   21:invokevirtual   #260 <Method View Fragment.getView()>
	//   10   24:iconst_0        
	//   11   25:invokevirtual   #391 <Method void View.setVisibility(int)>
		if(fragment != null)
	//*  12   28:aload           11
	//*  13   30:ifnull          291
		{
			if(fragment1 == null)
	//*  14   33:aload           12
	//*  15   35:ifnonnull       40
				return ((Object) (null));
	//   16   38:aconst_null     
	//   17   39:areturn         
			boolean flag = fragmentcontainertransition.lastInIsPop;
	//   18   40:aload           4
	//   19   42:getfield        #132 <Field boolean FragmentTransition$FragmentContainerTransition.lastInIsPop>
	//   20   45:istore          9
			Object obj2;
			if(arraymap.isEmpty())
	//*  21   47:aload_3         
	//*  22   48:invokevirtual   #263 <Method boolean ArrayMap.isEmpty()>
	//*  23   51:ifeq            60
				obj2 = null;
	//   24   54:aconst_null     
	//   25   55:astore          10
			else
	//*  26   57:goto            72
				obj2 = getSharedElementTransition(fragmenttransitionimpl, fragment, fragment1, flag);
	//   27   60:aload_0         
	//   28   61:aload           11
	//   29   63:aload           12
	//   30   65:iload           9
	//   31   67:invokestatic    #355 <Method Object getSharedElementTransition(FragmentTransitionImpl, Fragment, Fragment, boolean)>
	//   32   70:astore          10
			ArrayMap arraymap2 = captureOutSharedElements(fragmenttransitionimpl, arraymap, obj2, fragmentcontainertransition);
	//   33   72:aload_0         
	//   34   73:aload_3         
	//   35   74:aload           10
	//   36   76:aload           4
	//   37   78:invokestatic    #357 <Method ArrayMap captureOutSharedElements(FragmentTransitionImpl, ArrayMap, Object, FragmentTransition$FragmentContainerTransition)>
	//   38   81:astore          14
			ArrayMap arraymap1 = captureInSharedElements(fragmenttransitionimpl, arraymap, obj2, fragmentcontainertransition);
	//   39   83:aload_0         
	//   40   84:aload_3         
	//   41   85:aload           10
	//   42   87:aload           4
	//   43   89:invokestatic    #393 <Method ArrayMap captureInSharedElements(FragmentTransitionImpl, ArrayMap, Object, FragmentTransition$FragmentContainerTransition)>
	//   44   92:astore          13
			if(arraymap.isEmpty())
	//*  45   94:aload_3         
	//*  46   95:invokevirtual   #263 <Method boolean ArrayMap.isEmpty()>
	//*  47   98:ifeq            126
			{
				if(arraymap2 != null)
	//*  48  101:aload           14
	//*  49  103:ifnull          111
					arraymap2.clear();
	//   50  106:aload           14
	//   51  108:invokevirtual   #298 <Method void ArrayMap.clear()>
				if(arraymap1 != null)
	//*  52  111:aload           13
	//*  53  113:ifnull          121
					arraymap1.clear();
	//   54  116:aload           13
	//   55  118:invokevirtual   #298 <Method void ArrayMap.clear()>
				arraymap = null;
	//   56  121:aconst_null     
	//   57  122:astore_3        
			} else
	//*  58  123:goto            151
			{
				addSharedElementsWithMatchingNames(arraylist, arraymap2, ((Collection) (arraymap.keySet())));
	//   59  126:aload           5
	//   60  128:aload           14
	//   61  130:aload_3         
	//   62  131:invokevirtual   #304 <Method java.util.Set ArrayMap.keySet()>
	//   63  134:invokestatic    #395 <Method void addSharedElementsWithMatchingNames(ArrayList, ArrayMap, Collection)>
				addSharedElementsWithMatchingNames(arraylist1, arraymap1, arraymap.values());
	//   64  137:aload           6
	//   65  139:aload           13
	//   66  141:aload_3         
	//   67  142:invokevirtual   #278 <Method Collection ArrayMap.values()>
	//   68  145:invokestatic    #395 <Method void addSharedElementsWithMatchingNames(ArrayList, ArrayMap, Collection)>
				arraymap = ((ArrayMap) (obj2));
	//   69  148:aload           10
	//   70  150:astore_3        
			}
			if(obj == null && obj1 == null && arraymap == null)
	//*  71  151:aload           7
	//*  72  153:ifnonnull       167
	//*  73  156:aload           8
	//*  74  158:ifnonnull       167
	//*  75  161:aload_3         
	//*  76  162:ifnonnull       167
				return ((Object) (null));
	//   77  165:aconst_null     
	//   78  166:areturn         
			callSharedElementStartEnd(fragment, fragment1, flag, arraymap2, true);
	//   79  167:aload           11
	//   80  169:aload           12
	//   81  171:iload           9
	//   82  173:aload           14
	//   83  175:iconst_1        
	//   84  176:invokestatic    #362 <Method void callSharedElementStartEnd(Fragment, Fragment, boolean, ArrayMap, boolean)>
			if(arraymap != null)
	//*  85  179:aload_3         
	//*  86  180:ifnull          256
			{
				arraylist1.add(((Object) (view)));
	//   87  183:aload           6
	//   88  185:aload_2         
	//   89  186:invokevirtual   #75  <Method boolean ArrayList.add(Object)>
	//   90  189:pop             
				fragmenttransitionimpl.setSharedElementTargets(((Object) (arraymap)), view, arraylist);
	//   91  190:aload_0         
	//   92  191:aload_3         
	//   93  192:aload_2         
	//   94  193:aload           5
	//   95  195:invokevirtual   #369 <Method void FragmentTransitionImpl.setSharedElementTargets(Object, View, ArrayList)>
				setOutEpicenter(fragmenttransitionimpl, ((Object) (arraymap)), obj1, arraymap2, fragmentcontainertransition.firstOutIsPop, fragmentcontainertransition.firstOutTransaction);
	//   96  198:aload_0         
	//   97  199:aload_3         
	//   98  200:aload           8
	//   99  202:aload           14
	//  100  204:aload           4
	//  101  206:getfield        #167 <Field boolean FragmentTransition$FragmentContainerTransition.firstOutIsPop>
	//  102  209:aload           4
	//  103  211:getfield        #170 <Field BackStackRecord FragmentTransition$FragmentContainerTransition.firstOutTransaction>
	//  104  214:invokestatic    #373 <Method void setOutEpicenter(FragmentTransitionImpl, Object, Object, ArrayMap, boolean, BackStackRecord)>
				view = ((View) (new Rect()));
	//  105  217:new             #364 <Class Rect>
	//  106  220:dup             
	//  107  221:invokespecial   #365 <Method void Rect()>
	//  108  224:astore_2        
				fragmentcontainertransition = ((FragmentContainerTransition) (getInEpicenterView(arraymap1, fragmentcontainertransition, obj, flag)));
	//  109  225:aload           13
	//  110  227:aload           4
	//  111  229:aload           7
	//  112  231:iload           9
	//  113  233:invokestatic    #399 <Method View getInEpicenterView(ArrayMap, FragmentTransition$FragmentContainerTransition, Object, boolean)>
	//  114  236:astore          4
				if(fragmentcontainertransition != null)
	//* 115  238:aload           4
	//* 116  240:ifnull          250
					fragmenttransitionimpl.setEpicenter(obj, ((Rect) (view)));
	//  117  243:aload_0         
	//  118  244:aload           7
	//  119  246:aload_2         
	//  120  247:invokevirtual   #377 <Method void FragmentTransitionImpl.setEpicenter(Object, Rect)>
				arraylist = ((ArrayList) (view));
	//  121  250:aload_2         
	//  122  251:astore          5
			} else
	//* 123  253:goto            264
			{
				view = null;
	//  124  256:aconst_null     
	//  125  257:astore_2        
				arraylist = ((ArrayList) (view));
	//  126  258:aload_2         
	//  127  259:astore          5
				fragmentcontainertransition = ((FragmentContainerTransition) (view));
	//  128  261:aload_2         
	//  129  262:astore          4
			}
			OneShotPreDrawListener.add(((View) (viewgroup)), new Runnable(fragment, fragment1, flag, arraymap1, ((View) (fragmentcontainertransition)), fragmenttransitionimpl, ((Rect) (arraylist))) {

				public void run()
				{
					FragmentTransition.callSharedElementStartEnd(inFragment, outFragment, inIsPop, inSharedElements, false);
				//    0    0:aload_0         
				//    1    1:getfield        #28  <Field Fragment val$inFragment>
				//    2    4:aload_0         
				//    3    5:getfield        #30  <Field Fragment val$outFragment>
				//    4    8:aload_0         
				//    5    9:getfield        #32  <Field boolean val$inIsPop>
				//    6   12:aload_0         
				//    7   13:getfield        #34  <Field ArrayMap val$inSharedElements>
				//    8   16:iconst_0        
				//    9   17:invokestatic    #49  <Method void FragmentTransition.callSharedElementStartEnd(Fragment, Fragment, boolean, ArrayMap, boolean)>
					View view1 = epicenterView;
				//   10   20:aload_0         
				//   11   21:getfield        #36  <Field View val$epicenterView>
				//   12   24:astore_1        
					if(view1 != null)
				//*  13   25:aload_1         
				//*  14   26:ifnull          41
						impl.getBoundsOnScreen(view1, epicenter);
				//   15   29:aload_0         
				//   16   30:getfield        #38  <Field FragmentTransitionImpl val$impl>
				//   17   33:aload_1         
				//   18   34:aload_0         
				//   19   35:getfield        #40  <Field Rect val$epicenter>
				//   20   38:invokevirtual   #55  <Method void FragmentTransitionImpl.getBoundsOnScreen(View, Rect)>
				//   21   41:return          
				}

				final Rect val$epicenter;
				final View val$epicenterView;
				final FragmentTransitionImpl val$impl;
				final Fragment val$inFragment;
				final boolean val$inIsPop;
				final ArrayMap val$inSharedElements;
				final Fragment val$outFragment;

			
			{
				inFragment = fragment;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #28  <Field Fragment val$inFragment>
				outFragment = fragment1;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #30  <Field Fragment val$outFragment>
				inIsPop = flag;
			//    6   10:aload_0         
			//    7   11:iload_3         
			//    8   12:putfield        #32  <Field boolean val$inIsPop>
				inSharedElements = arraymap;
			//    9   15:aload_0         
			//   10   16:aload           4
			//   11   18:putfield        #34  <Field ArrayMap val$inSharedElements>
				epicenterView = view;
			//   12   21:aload_0         
			//   13   22:aload           5
			//   14   24:putfield        #36  <Field View val$epicenterView>
				impl = fragmenttransitionimpl;
			//   15   27:aload_0         
			//   16   28:aload           6
			//   17   30:putfield        #38  <Field FragmentTransitionImpl val$impl>
				epicenter = rect;
			//   18   33:aload_0         
			//   19   34:aload           7
			//   20   36:putfield        #40  <Field Rect val$epicenter>
				super();
			//   21   39:aload_0         
			//   22   40:invokespecial   #43  <Method void Object()>
			//   23   43:return          
			}
			}
);
	//  130  264:aload_1         
	//  131  265:new             #10  <Class FragmentTransition$3>
	//  132  268:dup             
	//  133  269:aload           11
	//  134  271:aload           12
	//  135  273:iload           9
	//  136  275:aload           13
	//  137  277:aload           4
	//  138  279:aload_0         
	//  139  280:aload           5
	//  140  282:invokespecial   #402 <Method void FragmentTransition$3(Fragment, Fragment, boolean, ArrayMap, View, FragmentTransitionImpl, Rect)>
	//  141  285:invokestatic    #385 <Method OneShotPreDrawListener OneShotPreDrawListener.add(View, Runnable)>
	//  142  288:pop             
			return ((Object) (arraymap));
	//  143  289:aload_3         
	//  144  290:areturn         
		} else
		{
			return ((Object) (null));
	//  145  291:aconst_null     
	//  146  292:areturn         
		}
	}

	private static void configureTransitionsOrdered(FragmentManagerImpl fragmentmanagerimpl, int i, FragmentContainerTransition fragmentcontainertransition, View view, ArrayMap arraymap)
	{
		if(fragmentmanagerimpl.mContainer.onHasView())
	//*   0    0:aload_0         
	//*   1    1:getfield        #217 <Field FragmentContainer FragmentManagerImpl.mContainer>
	//*   2    4:invokevirtual   #222 <Method boolean FragmentContainer.onHasView()>
	//*   3    7:ifeq            25
			fragmentmanagerimpl = ((FragmentManagerImpl) ((ViewGroup)fragmentmanagerimpl.mContainer.onFindViewById(i)));
	//    4   10:aload_0         
	//    5   11:getfield        #217 <Field FragmentContainer FragmentManagerImpl.mContainer>
	//    6   14:iload_1         
	//    7   15:invokevirtual   #408 <Method View FragmentContainer.onFindViewById(int)>
	//    8   18:checkcast       #410 <Class ViewGroup>
	//    9   21:astore_0        
		else
	//*  10   22:goto            27
			fragmentmanagerimpl = null;
	//   11   25:aconst_null     
	//   12   26:astore_0        
		if(fragmentmanagerimpl == null)
	//*  13   27:aload_0         
	//*  14   28:ifnonnull       32
			return;
	//   15   31:return          
		Fragment fragment = fragmentcontainertransition.lastIn;
	//   16   32:aload_2         
	//   17   33:getfield        #129 <Field Fragment FragmentTransition$FragmentContainerTransition.lastIn>
	//   18   36:astore          8
		Object obj3 = ((Object) (fragmentcontainertransition.firstOut));
	//   19   38:aload_2         
	//   20   39:getfield        #139 <Field Fragment FragmentTransition$FragmentContainerTransition.firstOut>
	//   21   42:astore          13
		FragmentTransitionImpl fragmenttransitionimpl = chooseImpl(((Fragment) (obj3)), fragment);
	//   22   44:aload           13
	//   23   46:aload           8
	//   24   48:invokestatic    #412 <Method FragmentTransitionImpl chooseImpl(Fragment, Fragment)>
	//   25   51:astore          9
		if(fragmenttransitionimpl == null)
	//*  26   53:aload           9
	//*  27   55:ifnonnull       59
			return;
	//   28   58:return          
		boolean flag = fragmentcontainertransition.lastInIsPop;
	//   29   59:aload_2         
	//   30   60:getfield        #132 <Field boolean FragmentTransition$FragmentContainerTransition.lastInIsPop>
	//   31   63:istore          5
		boolean flag1 = fragmentcontainertransition.firstOutIsPop;
	//   32   65:aload_2         
	//   33   66:getfield        #167 <Field boolean FragmentTransition$FragmentContainerTransition.firstOutIsPop>
	//   34   69:istore          6
		Object obj1 = getEnterTransition(fragmenttransitionimpl, fragment, flag);
	//   35   71:aload           9
	//   36   73:aload           8
	//   37   75:iload           5
	//   38   77:invokestatic    #415 <Method Object getEnterTransition(FragmentTransitionImpl, Fragment, boolean)>
	//   39   80:astore          10
		Object obj = getExitTransition(fragmenttransitionimpl, ((Fragment) (obj3)), flag1);
	//   40   82:aload           9
	//   41   84:aload           13
	//   42   86:iload           6
	//   43   88:invokestatic    #417 <Method Object getExitTransition(FragmentTransitionImpl, Fragment, boolean)>
	//   44   91:astore          7
		ArrayList arraylist1 = new ArrayList();
	//   45   93:new             #72  <Class ArrayList>
	//   46   96:dup             
	//   47   97:invokespecial   #229 <Method void ArrayList()>
	//   48  100:astore          14
		ArrayList arraylist = new ArrayList();
	//   49  102:new             #72  <Class ArrayList>
	//   50  105:dup             
	//   51  106:invokespecial   #229 <Method void ArrayList()>
	//   52  109:astore          11
		Object obj2 = configureSharedElementsOrdered(fragmenttransitionimpl, ((ViewGroup) (fragmentmanagerimpl)), view, arraymap, fragmentcontainertransition, arraylist1, arraylist, obj1, obj);
	//   53  111:aload           9
	//   54  113:aload_0         
	//   55  114:aload_3         
	//   56  115:aload           4
	//   57  117:aload_2         
	//   58  118:aload           14
	//   59  120:aload           11
	//   60  122:aload           10
	//   61  124:aload           7
	//   62  126:invokestatic    #419 <Method Object configureSharedElementsOrdered(FragmentTransitionImpl, ViewGroup, View, ArrayMap, FragmentTransition$FragmentContainerTransition, ArrayList, ArrayList, Object, Object)>
	//   63  129:astore          12
		if(obj1 == null && obj2 == null && obj == null)
	//*  64  131:aload           10
	//*  65  133:ifnonnull       147
	//*  66  136:aload           12
	//*  67  138:ifnonnull       147
	//*  68  141:aload           7
	//*  69  143:ifnonnull       147
			return;
	//   70  146:return          
		obj3 = ((Object) (configureEnteringExitingViews(fragmenttransitionimpl, obj, ((Fragment) (obj3)), arraylist1, view)));
	//   71  147:aload           9
	//   72  149:aload           7
	//   73  151:aload           13
	//   74  153:aload           14
	//   75  155:aload_3         
	//   76  156:invokestatic    #421 <Method ArrayList configureEnteringExitingViews(FragmentTransitionImpl, Object, Fragment, ArrayList, View)>
	//   77  159:astore          13
		if(obj3 == null || ((ArrayList) (obj3)).isEmpty())
	//*  78  161:aload           13
	//*  79  163:ifnull          180
	//*  80  166:aload           13
	//*  81  168:invokevirtual   #326 <Method boolean ArrayList.isEmpty()>
	//*  82  171:ifeq            177
	//*  83  174:goto            180
	//*  84  177:goto            183
			obj = null;
	//   85  180:aconst_null     
	//   86  181:astore          7
		fragmenttransitionimpl.addTarget(obj1, view);
	//   87  183:aload           9
	//   88  185:aload           10
	//   89  187:aload_3         
	//   90  188:invokevirtual   #425 <Method void FragmentTransitionImpl.addTarget(Object, View)>
		fragmentcontainertransition = ((FragmentContainerTransition) (mergeTransitions(fragmenttransitionimpl, obj1, obj, obj2, fragment, fragmentcontainertransition.lastInIsPop)));
	//   91  191:aload           9
	//   92  193:aload           10
	//   93  195:aload           7
	//   94  197:aload           12
	//   95  199:aload           8
	//   96  201:aload_2         
	//   97  202:getfield        #132 <Field boolean FragmentTransition$FragmentContainerTransition.lastInIsPop>
	//   98  205:invokestatic    #429 <Method Object mergeTransitions(FragmentTransitionImpl, Object, Object, Object, Fragment, boolean)>
	//   99  208:astore_2        
		if(fragmentcontainertransition != null)
	//* 100  209:aload_2         
	//* 101  210:ifnull          286
		{
			ArrayList arraylist2 = new ArrayList();
	//  102  213:new             #72  <Class ArrayList>
	//  103  216:dup             
	//  104  217:invokespecial   #229 <Method void ArrayList()>
	//  105  220:astore          14
			fragmenttransitionimpl.scheduleRemoveTargets(((Object) (fragmentcontainertransition)), obj1, arraylist2, obj, ((ArrayList) (obj3)), obj2, arraylist);
	//  106  222:aload           9
	//  107  224:aload_2         
	//  108  225:aload           10
	//  109  227:aload           14
	//  110  229:aload           7
	//  111  231:aload           13
	//  112  233:aload           12
	//  113  235:aload           11
	//  114  237:invokevirtual   #433 <Method void FragmentTransitionImpl.scheduleRemoveTargets(Object, Object, ArrayList, Object, ArrayList, Object, ArrayList)>
			scheduleTargetChange(fragmenttransitionimpl, ((ViewGroup) (fragmentmanagerimpl)), fragment, view, arraylist, obj1, arraylist2, obj, ((ArrayList) (obj3)));
	//  115  240:aload           9
	//  116  242:aload_0         
	//  117  243:aload           8
	//  118  245:aload_3         
	//  119  246:aload           11
	//  120  248:aload           10
	//  121  250:aload           14
	//  122  252:aload           7
	//  123  254:aload           13
	//  124  256:invokestatic    #437 <Method void scheduleTargetChange(FragmentTransitionImpl, ViewGroup, Fragment, View, ArrayList, Object, ArrayList, Object, ArrayList)>
			fragmenttransitionimpl.setNameOverridesOrdered(((View) (fragmentmanagerimpl)), arraylist, ((java.util.Map) (arraymap)));
	//  125  259:aload           9
	//  126  261:aload_0         
	//  127  262:aload           11
	//  128  264:aload           4
	//  129  266:invokevirtual   #441 <Method void FragmentTransitionImpl.setNameOverridesOrdered(View, ArrayList, java.util.Map)>
			fragmenttransitionimpl.beginDelayedTransition(((ViewGroup) (fragmentmanagerimpl)), ((Object) (fragmentcontainertransition)));
	//  130  269:aload           9
	//  131  271:aload_0         
	//  132  272:aload_2         
	//  133  273:invokevirtual   #445 <Method void FragmentTransitionImpl.beginDelayedTransition(ViewGroup, Object)>
			fragmenttransitionimpl.scheduleNameReset(((ViewGroup) (fragmentmanagerimpl)), arraylist, ((java.util.Map) (arraymap)));
	//  134  276:aload           9
	//  135  278:aload_0         
	//  136  279:aload           11
	//  137  281:aload           4
	//  138  283:invokevirtual   #449 <Method void FragmentTransitionImpl.scheduleNameReset(ViewGroup, ArrayList, java.util.Map)>
		}
	//  139  286:return          
	}

	private static void configureTransitionsReordered(FragmentManagerImpl fragmentmanagerimpl, int i, FragmentContainerTransition fragmentcontainertransition, View view, ArrayMap arraymap)
	{
		if(fragmentmanagerimpl.mContainer.onHasView())
	//*   0    0:aload_0         
	//*   1    1:getfield        #217 <Field FragmentContainer FragmentManagerImpl.mContainer>
	//*   2    4:invokevirtual   #222 <Method boolean FragmentContainer.onHasView()>
	//*   3    7:ifeq            25
			fragmentmanagerimpl = ((FragmentManagerImpl) ((ViewGroup)fragmentmanagerimpl.mContainer.onFindViewById(i)));
	//    4   10:aload_0         
	//    5   11:getfield        #217 <Field FragmentContainer FragmentManagerImpl.mContainer>
	//    6   14:iload_1         
	//    7   15:invokevirtual   #408 <Method View FragmentContainer.onFindViewById(int)>
	//    8   18:checkcast       #410 <Class ViewGroup>
	//    9   21:astore_0        
		else
	//*  10   22:goto            27
			fragmentmanagerimpl = null;
	//   11   25:aconst_null     
	//   12   26:astore_0        
		if(fragmentmanagerimpl == null)
	//*  13   27:aload_0         
	//*  14   28:ifnonnull       32
			return;
	//   15   31:return          
		Object obj4 = ((Object) (fragmentcontainertransition.lastIn));
	//   16   32:aload_2         
	//   17   33:getfield        #129 <Field Fragment FragmentTransition$FragmentContainerTransition.lastIn>
	//   18   36:astore          14
		Object obj2 = ((Object) (fragmentcontainertransition.firstOut));
	//   19   38:aload_2         
	//   20   39:getfield        #139 <Field Fragment FragmentTransition$FragmentContainerTransition.firstOut>
	//   21   42:astore          12
		FragmentTransitionImpl fragmenttransitionimpl = chooseImpl(((Fragment) (obj2)), ((Fragment) (obj4)));
	//   22   44:aload           12
	//   23   46:aload           14
	//   24   48:invokestatic    #412 <Method FragmentTransitionImpl chooseImpl(Fragment, Fragment)>
	//   25   51:astore          8
		if(fragmenttransitionimpl == null)
	//*  26   53:aload           8
	//*  27   55:ifnonnull       59
			return;
	//   28   58:return          
		boolean flag = fragmentcontainertransition.lastInIsPop;
	//   29   59:aload_2         
	//   30   60:getfield        #132 <Field boolean FragmentTransition$FragmentContainerTransition.lastInIsPop>
	//   31   63:istore          5
		boolean flag1 = fragmentcontainertransition.firstOutIsPop;
	//   32   65:aload_2         
	//   33   66:getfield        #167 <Field boolean FragmentTransition$FragmentContainerTransition.firstOutIsPop>
	//   34   69:istore          6
		ArrayList arraylist = new ArrayList();
	//   35   71:new             #72  <Class ArrayList>
	//   36   74:dup             
	//   37   75:invokespecial   #229 <Method void ArrayList()>
	//   38   78:astore          9
		ArrayList arraylist1 = new ArrayList();
	//   39   80:new             #72  <Class ArrayList>
	//   40   83:dup             
	//   41   84:invokespecial   #229 <Method void ArrayList()>
	//   42   87:astore          10
		Object obj1 = getEnterTransition(fragmenttransitionimpl, ((Fragment) (obj4)), flag);
	//   43   89:aload           8
	//   44   91:aload           14
	//   45   93:iload           5
	//   46   95:invokestatic    #415 <Method Object getEnterTransition(FragmentTransitionImpl, Fragment, boolean)>
	//   47   98:astore          11
		Object obj = getExitTransition(fragmenttransitionimpl, ((Fragment) (obj2)), flag1);
	//   48  100:aload           8
	//   49  102:aload           12
	//   50  104:iload           6
	//   51  106:invokestatic    #417 <Method Object getExitTransition(FragmentTransitionImpl, Fragment, boolean)>
	//   52  109:astore          7
		Object obj3 = configureSharedElementsReordered(fragmenttransitionimpl, ((ViewGroup) (fragmentmanagerimpl)), view, arraymap, fragmentcontainertransition, arraylist1, arraylist, obj1, obj);
	//   53  111:aload           8
	//   54  113:aload_0         
	//   55  114:aload_3         
	//   56  115:aload           4
	//   57  117:aload_2         
	//   58  118:aload           10
	//   59  120:aload           9
	//   60  122:aload           11
	//   61  124:aload           7
	//   62  126:invokestatic    #453 <Method Object configureSharedElementsReordered(FragmentTransitionImpl, ViewGroup, View, ArrayMap, FragmentTransition$FragmentContainerTransition, ArrayList, ArrayList, Object, Object)>
	//   63  129:astore          13
		if(obj1 == null && obj3 == null && obj == null)
	//*  64  131:aload           11
	//*  65  133:ifnonnull       147
	//*  66  136:aload           13
	//*  67  138:ifnonnull       147
	//*  68  141:aload           7
	//*  69  143:ifnonnull       147
			return;
	//   70  146:return          
		fragmentcontainertransition = ((FragmentContainerTransition) (obj));
	//   71  147:aload           7
	//   72  149:astore_2        
		obj = ((Object) (configureEnteringExitingViews(fragmenttransitionimpl, ((Object) (fragmentcontainertransition)), ((Fragment) (obj2)), arraylist1, view)));
	//   73  150:aload           8
	//   74  152:aload_2         
	//   75  153:aload           12
	//   76  155:aload           10
	//   77  157:aload_3         
	//   78  158:invokestatic    #421 <Method ArrayList configureEnteringExitingViews(FragmentTransitionImpl, Object, Fragment, ArrayList, View)>
	//   79  161:astore          7
		view = ((View) (configureEnteringExitingViews(fragmenttransitionimpl, obj1, ((Fragment) (obj4)), arraylist, view)));
	//   80  163:aload           8
	//   81  165:aload           11
	//   82  167:aload           14
	//   83  169:aload           9
	//   84  171:aload_3         
	//   85  172:invokestatic    #421 <Method ArrayList configureEnteringExitingViews(FragmentTransitionImpl, Object, Fragment, ArrayList, View)>
	//   86  175:astore_3        
		setViewVisibility(((ArrayList) (view)), 4);
	//   87  176:aload_3         
	//   88  177:iconst_4        
	//   89  178:invokestatic    #457 <Method void setViewVisibility(ArrayList, int)>
		obj4 = mergeTransitions(fragmenttransitionimpl, obj1, ((Object) (fragmentcontainertransition)), obj3, ((Fragment) (obj4)), flag);
	//   90  181:aload           8
	//   91  183:aload           11
	//   92  185:aload_2         
	//   93  186:aload           13
	//   94  188:aload           14
	//   95  190:iload           5
	//   96  192:invokestatic    #429 <Method Object mergeTransitions(FragmentTransitionImpl, Object, Object, Object, Fragment, boolean)>
	//   97  195:astore          14
		if(obj4 != null)
	//*  98  197:aload           14
	//*  99  199:ifnull          276
		{
			replaceHide(fragmenttransitionimpl, ((Object) (fragmentcontainertransition)), ((Fragment) (obj2)), ((ArrayList) (obj)));
	//  100  202:aload           8
	//  101  204:aload_2         
	//  102  205:aload           12
	//  103  207:aload           7
	//  104  209:invokestatic    #461 <Method void replaceHide(FragmentTransitionImpl, Object, Fragment, ArrayList)>
			obj2 = ((Object) (fragmenttransitionimpl.prepareSetNameOverridesReordered(arraylist)));
	//  105  212:aload           8
	//  106  214:aload           9
	//  107  216:invokevirtual   #465 <Method ArrayList FragmentTransitionImpl.prepareSetNameOverridesReordered(ArrayList)>
	//  108  219:astore          12
			fragmenttransitionimpl.scheduleRemoveTargets(obj4, obj1, ((ArrayList) (view)), ((Object) (fragmentcontainertransition)), ((ArrayList) (obj)), obj3, arraylist);
	//  109  221:aload           8
	//  110  223:aload           14
	//  111  225:aload           11
	//  112  227:aload_3         
	//  113  228:aload_2         
	//  114  229:aload           7
	//  115  231:aload           13
	//  116  233:aload           9
	//  117  235:invokevirtual   #433 <Method void FragmentTransitionImpl.scheduleRemoveTargets(Object, Object, ArrayList, Object, ArrayList, Object, ArrayList)>
			fragmenttransitionimpl.beginDelayedTransition(((ViewGroup) (fragmentmanagerimpl)), obj4);
	//  118  238:aload           8
	//  119  240:aload_0         
	//  120  241:aload           14
	//  121  243:invokevirtual   #445 <Method void FragmentTransitionImpl.beginDelayedTransition(ViewGroup, Object)>
			fragmenttransitionimpl.setNameOverridesReordered(((View) (fragmentmanagerimpl)), arraylist1, arraylist, ((ArrayList) (obj2)), ((java.util.Map) (arraymap)));
	//  122  246:aload           8
	//  123  248:aload_0         
	//  124  249:aload           10
	//  125  251:aload           9
	//  126  253:aload           12
	//  127  255:aload           4
	//  128  257:invokevirtual   #469 <Method void FragmentTransitionImpl.setNameOverridesReordered(View, ArrayList, ArrayList, ArrayList, java.util.Map)>
			setViewVisibility(((ArrayList) (view)), 0);
	//  129  260:aload_3         
	//  130  261:iconst_0        
	//  131  262:invokestatic    #457 <Method void setViewVisibility(ArrayList, int)>
			fragmenttransitionimpl.swapSharedElementTargets(obj3, arraylist1, arraylist);
	//  132  265:aload           8
	//  133  267:aload           13
	//  134  269:aload           10
	//  135  271:aload           9
	//  136  273:invokevirtual   #473 <Method void FragmentTransitionImpl.swapSharedElementTargets(Object, ArrayList, ArrayList)>
		}
	//  137  276:return          
	}

	private static FragmentContainerTransition ensureContainer(FragmentContainerTransition fragmentcontainertransition, SparseArray sparsearray, int i)
	{
		FragmentContainerTransition fragmentcontainertransition1 = fragmentcontainertransition;
	//    0    0:aload_0         
	//    1    1:astore_3        
		if(fragmentcontainertransition == null)
	//*   2    2:aload_0         
	//*   3    3:ifnonnull       20
		{
			fragmentcontainertransition1 = new FragmentContainerTransition();
	//    4    6:new             #14  <Class FragmentTransition$FragmentContainerTransition>
	//    5    9:dup             
	//    6   10:invokespecial   #474 <Method void FragmentTransition$FragmentContainerTransition()>
	//    7   13:astore_3        
			sparsearray.put(i, ((Object) (fragmentcontainertransition1)));
	//    8   14:aload_1         
	//    9   15:iload_2         
	//   10   16:aload_3         
	//   11   17:invokevirtual   #477 <Method void SparseArray.put(int, Object)>
		}
		return fragmentcontainertransition1;
	//   12   20:aload_3         
	//   13   21:areturn         
	}

	private static String findKeyForValue(ArrayMap arraymap, String s)
	{
		int j = arraymap.size();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #52  <Method int ArrayMap.size()>
	//    2    4:istore_3        
		for(int i = 0; i < j; i++)
	//*   3    5:iconst_0        
	//*   4    6:istore_2        
	//*   5    7:iload_2         
	//*   6    8:iload_3         
	//*   7    9:icmpge          40
			if(s.equals(arraymap.valueAt(i)))
	//*   8   12:aload_1         
	//*   9   13:aload_0         
	//*  10   14:iload_2         
	//*  11   15:invokevirtual   #56  <Method Object ArrayMap.valueAt(int)>
	//*  12   18:invokevirtual   #291 <Method boolean String.equals(Object)>
	//*  13   21:ifeq            33
				return (String)arraymap.keyAt(i);
	//   14   24:aload_0         
	//   15   25:iload_2         
	//   16   26:invokevirtual   #232 <Method Object ArrayMap.keyAt(int)>
	//   17   29:checkcast       #203 <Class String>
	//   18   32:areturn         

	//   19   33:iload_2         
	//   20   34:iconst_1        
	//   21   35:iadd            
	//   22   36:istore_2        
	//*  23   37:goto            7
		return null;
	//   24   40:aconst_null     
	//   25   41:areturn         
	}

	private static Object getEnterTransition(FragmentTransitionImpl fragmenttransitionimpl, Fragment fragment, boolean flag)
	{
		if(fragment == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       6
			return ((Object) (null));
	//    2    4:aconst_null     
	//    3    5:areturn         
		if(flag)
	//*   4    6:iload_2         
	//*   5    7:ifeq            18
			fragment = ((Fragment) (fragment.getReenterTransition()));
	//    6   10:aload_1         
	//    7   11:invokevirtual   #322 <Method Object Fragment.getReenterTransition()>
	//    8   14:astore_1        
		else
	//*   9   15:goto            23
			fragment = ((Fragment) (fragment.getEnterTransition()));
	//   10   18:aload_1         
	//   11   19:invokevirtual   #319 <Method Object Fragment.getEnterTransition()>
	//   12   22:astore_1        
		return fragmenttransitionimpl.cloneTransition(((Object) (fragment)));
	//   13   23:aload_0         
	//   14   24:aload_1         
	//   15   25:invokevirtual   #482 <Method Object FragmentTransitionImpl.cloneTransition(Object)>
	//   16   28:areturn         
	}

	private static Object getExitTransition(FragmentTransitionImpl fragmenttransitionimpl, Fragment fragment, boolean flag)
	{
		if(fragment == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       6
			return ((Object) (null));
	//    2    4:aconst_null     
	//    3    5:areturn         
		if(flag)
	//*   4    6:iload_2         
	//*   5    7:ifeq            18
			fragment = ((Fragment) (fragment.getReturnTransition()));
	//    6   10:aload_1         
	//    7   11:invokevirtual   #313 <Method Object Fragment.getReturnTransition()>
	//    8   14:astore_1        
		else
	//*   9   15:goto            23
			fragment = ((Fragment) (fragment.getExitTransition()));
	//   10   18:aload_1         
	//   11   19:invokevirtual   #310 <Method Object Fragment.getExitTransition()>
	//   12   22:astore_1        
		return fragmenttransitionimpl.cloneTransition(((Object) (fragment)));
	//   13   23:aload_0         
	//   14   24:aload_1         
	//   15   25:invokevirtual   #482 <Method Object FragmentTransitionImpl.cloneTransition(Object)>
	//   16   28:areturn         
	}

	static View getInEpicenterView(ArrayMap arraymap, FragmentContainerTransition fragmentcontainertransition, Object obj, boolean flag)
	{
		fragmentcontainertransition = ((FragmentContainerTransition) (fragmentcontainertransition.lastInTransaction));
	//    0    0:aload_1         
	//    1    1:getfield        #136 <Field BackStackRecord FragmentTransition$FragmentContainerTransition.lastInTransaction>
	//    2    4:astore_1        
		if(obj != null && arraymap != null && ((BackStackRecord) (fragmentcontainertransition)).mSharedElementSourceNames != null && !((BackStackRecord) (fragmentcontainertransition)).mSharedElementSourceNames.isEmpty())
	//*   3    5:aload_2         
	//*   4    6:ifnull          70
	//*   5    9:aload_0         
	//*   6   10:ifnull          70
	//*   7   13:aload_1         
	//*   8   14:getfield        #198 <Field ArrayList BackStackRecord.mSharedElementSourceNames>
	//*   9   17:ifnull          70
	//*  10   20:aload_1         
	//*  11   21:getfield        #198 <Field ArrayList BackStackRecord.mSharedElementSourceNames>
	//*  12   24:invokevirtual   #326 <Method boolean ArrayList.isEmpty()>
	//*  13   27:ifne            70
		{
			if(flag)
	//*  14   30:iload_3         
	//*  15   31:ifeq            49
				fragmentcontainertransition = ((FragmentContainerTransition) ((String)((BackStackRecord) (fragmentcontainertransition)).mSharedElementSourceNames.get(0)));
	//   16   34:aload_1         
	//   17   35:getfield        #198 <Field ArrayList BackStackRecord.mSharedElementSourceNames>
	//   18   38:iconst_0        
	//   19   39:invokevirtual   #179 <Method Object ArrayList.get(int)>
	//   20   42:checkcast       #203 <Class String>
	//   21   45:astore_1        
			else
	//*  22   46:goto            61
				fragmentcontainertransition = ((FragmentContainerTransition) ((String)((BackStackRecord) (fragmentcontainertransition)).mSharedElementTargetNames.get(0)));
	//   23   49:aload_1         
	//   24   50:getfield        #201 <Field ArrayList BackStackRecord.mSharedElementTargetNames>
	//   25   53:iconst_0        
	//   26   54:invokevirtual   #179 <Method Object ArrayList.get(int)>
	//   27   57:checkcast       #203 <Class String>
	//   28   60:astore_1        
			return (View)arraymap.get(((Object) (fragmentcontainertransition)));
	//   29   61:aload_0         
	//   30   62:aload_1         
	//   31   63:invokevirtual   #284 <Method Object ArrayMap.get(Object)>
	//   32   66:checkcast       #58  <Class View>
	//   33   69:areturn         
		} else
		{
			return null;
	//   34   70:aconst_null     
	//   35   71:areturn         
		}
	}

	private static Object getSharedElementTransition(FragmentTransitionImpl fragmenttransitionimpl, Fragment fragment, Fragment fragment1, boolean flag)
	{
		if(fragment != null && fragment1 != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          38
	//*   2    4:aload_2         
	//*   3    5:ifnonnull       11
	//*   4    8:goto            38
		{
			if(flag)
	//*   5   11:iload_3         
	//*   6   12:ifeq            23
				fragment = ((Fragment) (fragment1.getSharedElementReturnTransition()));
	//    7   15:aload_2         
	//    8   16:invokevirtual   #316 <Method Object Fragment.getSharedElementReturnTransition()>
	//    9   19:astore_1        
			else
	//*  10   20:goto            28
				fragment = ((Fragment) (fragment.getSharedElementEnterTransition()));
	//   11   23:aload_1         
	//   12   24:invokevirtual   #325 <Method Object Fragment.getSharedElementEnterTransition()>
	//   13   27:astore_1        
			return fragmenttransitionimpl.wrapTransitionInSet(fragmenttransitionimpl.cloneTransition(((Object) (fragment))));
	//   14   28:aload_0         
	//   15   29:aload_0         
	//   16   30:aload_1         
	//   17   31:invokevirtual   #482 <Method Object FragmentTransitionImpl.cloneTransition(Object)>
	//   18   34:invokevirtual   #486 <Method Object FragmentTransitionImpl.wrapTransitionInSet(Object)>
	//   19   37:areturn         
		} else
		{
			return ((Object) (null));
	//   20   38:aconst_null     
	//   21   39:areturn         
		}
	}

	private static Object mergeTransitions(FragmentTransitionImpl fragmenttransitionimpl, Object obj, Object obj1, Object obj2, Fragment fragment, boolean flag)
	{
		if(obj != null && obj1 != null && fragment != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          38
	//*   2    4:aload_2         
	//*   3    5:ifnull          38
	//*   4    8:aload           4
	//*   5   10:ifnull          38
		{
			if(flag)
	//*   6   13:iload           5
	//*   7   15:ifeq            28
				flag = fragment.getAllowReturnTransitionOverlap();
	//    8   18:aload           4
	//    9   20:invokevirtual   #489 <Method boolean Fragment.getAllowReturnTransitionOverlap()>
	//   10   23:istore          5
			else
	//*  11   25:goto            41
				flag = fragment.getAllowEnterTransitionOverlap();
	//   12   28:aload           4
	//   13   30:invokevirtual   #492 <Method boolean Fragment.getAllowEnterTransitionOverlap()>
	//   14   33:istore          5
		} else
	//*  15   35:goto            41
		{
			flag = true;
	//   16   38:iconst_1        
	//   17   39:istore          5
		}
		if(flag)
	//*  18   41:iload           5
	//*  19   43:ifeq            54
			return fragmenttransitionimpl.mergeTransitionsTogether(obj1, obj, obj2);
	//   20   46:aload_0         
	//   21   47:aload_2         
	//   22   48:aload_1         
	//   23   49:aload_3         
	//   24   50:invokevirtual   #496 <Method Object FragmentTransitionImpl.mergeTransitionsTogether(Object, Object, Object)>
	//   25   53:areturn         
		else
			return fragmenttransitionimpl.mergeTransitionsInSequence(obj1, obj, obj2);
	//   26   54:aload_0         
	//   27   55:aload_2         
	//   28   56:aload_1         
	//   29   57:aload_3         
	//   30   58:invokevirtual   #499 <Method Object FragmentTransitionImpl.mergeTransitionsInSequence(Object, Object, Object)>
	//   31   61:areturn         
	}

	private static void replaceHide(FragmentTransitionImpl fragmenttransitionimpl, Object obj, Fragment fragment, ArrayList arraylist)
	{
		if(fragment != null && obj != null && fragment.mAdded && fragment.mHidden && fragment.mHiddenChanged)
	//*   0    0:aload_2         
	//*   1    1:ifnull          60
	//*   2    4:aload_1         
	//*   3    5:ifnull          60
	//*   4    8:aload_2         
	//*   5    9:getfield        #103 <Field boolean Fragment.mAdded>
	//*   6   12:ifeq            60
	//*   7   15:aload_2         
	//*   8   16:getfield        #100 <Field boolean Fragment.mHidden>
	//*   9   19:ifeq            60
	//*  10   22:aload_2         
	//*  11   23:getfield        #97  <Field boolean Fragment.mHiddenChanged>
	//*  12   26:ifeq            60
		{
			fragment.setHideReplaced(true);
	//   13   29:aload_2         
	//   14   30:iconst_1        
	//   15   31:invokevirtual   #503 <Method void Fragment.setHideReplaced(boolean)>
			fragmenttransitionimpl.scheduleHideFragmentView(obj, fragment.getView(), arraylist);
	//   16   34:aload_0         
	//   17   35:aload_1         
	//   18   36:aload_2         
	//   19   37:invokevirtual   #260 <Method View Fragment.getView()>
	//   20   40:aload_3         
	//   21   41:invokevirtual   #506 <Method void FragmentTransitionImpl.scheduleHideFragmentView(Object, View, ArrayList)>
			OneShotPreDrawListener.add(((View) (fragment.mContainer)), new Runnable(arraylist) {

				public void run()
				{
					FragmentTransition.setViewVisibility(exitingViews, 4);
				//    0    0:aload_0         
				//    1    1:getfield        #17  <Field ArrayList val$exitingViews>
				//    2    4:iconst_4        
				//    3    5:invokestatic    #26  <Method void FragmentTransition.setViewVisibility(ArrayList, int)>
				//    4    8:return          
				}

				final ArrayList val$exitingViews;

			
			{
				exitingViews = arraylist;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field ArrayList val$exitingViews>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #20  <Method void Object()>
			//    5    9:return          
			}
			}
);
	//   22   44:aload_2         
	//   23   45:getfield        #509 <Field ViewGroup Fragment.mContainer>
	//   24   48:new             #6   <Class FragmentTransition$1>
	//   25   51:dup             
	//   26   52:aload_3         
	//   27   53:invokespecial   #512 <Method void FragmentTransition$1(ArrayList)>
	//   28   56:invokestatic    #385 <Method OneShotPreDrawListener OneShotPreDrawListener.add(View, Runnable)>
	//   29   59:pop             
		}
	//   30   60:return          
	}

	private static FragmentTransitionImpl resolveSupportImpl()
	{
		Exception exception;
		FragmentTransitionImpl fragmenttransitionimpl;
		try
		{
			fragmenttransitionimpl = (FragmentTransitionImpl)Class.forName("android.support.transition.FragmentTransitionSupport").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
	//    0    0:ldc2            #517 <String "android.support.transition.FragmentTransitionSupport">
	//    1    3:invokestatic    #523 <Method Class Class.forName(String)>
	//    2    6:iconst_0        
	//    3    7:anewarray       Class[]
	//    4   10:invokevirtual   #527 <Method Constructor Class.getDeclaredConstructor(Class[])>
	//    5   13:iconst_0        
	//    6   14:anewarray       Object[]
	//    7   17:invokevirtual   #533 <Method Object Constructor.newInstance(Object[])>
	//    8   20:checkcast       #250 <Class FragmentTransitionImpl>
	//    9   23:astore_0        
		}
	//*  10   24:aload_0         
	//*  11   25:areturn         
	//*  12   26:aconst_null     
	//*  13   27:areturn         
		// Misplaced declaration of an exception variable
		catch(Exception exception)
		{
			return null;
		}
		return fragmenttransitionimpl;
	//*  14   28:astore_0        
	//*  15   29:goto            26
	}

	private static void retainValues(ArrayMap arraymap, ArrayMap arraymap1)
	{
		for(int i = arraymap.size() - 1; i >= 0; i--)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #52  <Method int ArrayMap.size()>
	//*   2    4:iconst_1        
	//*   3    5:isub            
	//*   4    6:istore_2        
	//*   5    7:iload_2         
	//*   6    8:iflt            39
			if(!arraymap1.containsKey(((Object) ((String)arraymap.valueAt(i)))))
	//*   7   11:aload_1         
	//*   8   12:aload_0         
	//*   9   13:iload_2         
	//*  10   14:invokevirtual   #56  <Method Object ArrayMap.valueAt(int)>
	//*  11   17:checkcast       #203 <Class String>
	//*  12   20:invokevirtual   #536 <Method boolean ArrayMap.containsKey(Object)>
	//*  13   23:ifne            32
				arraymap.removeAt(i);
	//   14   26:aload_0         
	//   15   27:iload_2         
	//   16   28:invokevirtual   #539 <Method Object ArrayMap.removeAt(int)>
	//   17   31:pop             

	//   18   32:iload_2         
	//   19   33:iconst_1        
	//   20   34:isub            
	//   21   35:istore_2        
	//*  22   36:goto            7
	//   23   39:return          
	}

	private static void scheduleTargetChange(FragmentTransitionImpl fragmenttransitionimpl, ViewGroup viewgroup, Fragment fragment, View view, ArrayList arraylist, Object obj, ArrayList arraylist1, Object obj1, 
			ArrayList arraylist2)
	{
		OneShotPreDrawListener.add(((View) (viewgroup)), new Runnable(obj, fragmenttransitionimpl, view, fragment, arraylist, arraylist1, arraylist2, obj1) {

			public void run()
			{
				Object obj2 = enterTransition;
			//    0    0:aload_0         
			//    1    1:getfield        #28  <Field Object val$enterTransition>
			//    2    4:astore_1        
				if(obj2 != null)
			//*   3    5:aload_1         
			//*   4    6:ifnull          54
				{
					impl.removeTarget(obj2, nonExistentView);
			//    5    9:aload_0         
			//    6   10:getfield        #30  <Field FragmentTransitionImpl val$impl>
			//    7   13:aload_1         
			//    8   14:aload_0         
			//    9   15:getfield        #32  <Field View val$nonExistentView>
			//   10   18:invokevirtual   #53  <Method void FragmentTransitionImpl.removeTarget(Object, View)>
					obj2 = ((Object) (FragmentTransition.configureEnteringExitingViews(impl, enterTransition, inFragment, sharedElementsIn, nonExistentView)));
			//   11   21:aload_0         
			//   12   22:getfield        #30  <Field FragmentTransitionImpl val$impl>
			//   13   25:aload_0         
			//   14   26:getfield        #28  <Field Object val$enterTransition>
			//   15   29:aload_0         
			//   16   30:getfield        #34  <Field Fragment val$inFragment>
			//   17   33:aload_0         
			//   18   34:getfield        #36  <Field ArrayList val$sharedElementsIn>
			//   19   37:aload_0         
			//   20   38:getfield        #32  <Field View val$nonExistentView>
			//   21   41:invokestatic    #57  <Method ArrayList FragmentTransition.configureEnteringExitingViews(FragmentTransitionImpl, Object, Fragment, ArrayList, View)>
			//   22   44:astore_1        
					enteringViews.addAll(((Collection) (obj2)));
			//   23   45:aload_0         
			//   24   46:getfield        #38  <Field ArrayList val$enteringViews>
			//   25   49:aload_1         
			//   26   50:invokevirtual   #63  <Method boolean ArrayList.addAll(Collection)>
			//   27   53:pop             
				}
				if(exitingViews != null)
			//*  28   54:aload_0         
			//*  29   55:getfield        #40  <Field ArrayList val$exitingViews>
			//*  30   58:ifnull          120
				{
					if(exitTransition != null)
			//*  31   61:aload_0         
			//*  32   62:getfield        #42  <Field Object val$exitTransition>
			//*  33   65:ifnull          101
					{
						ArrayList arraylist3 = new ArrayList();
			//   34   68:new             #59  <Class ArrayList>
			//   35   71:dup             
			//   36   72:invokespecial   #64  <Method void ArrayList()>
			//   37   75:astore_1        
						arraylist3.add(((Object) (nonExistentView)));
			//   38   76:aload_1         
			//   39   77:aload_0         
			//   40   78:getfield        #32  <Field View val$nonExistentView>
			//   41   81:invokevirtual   #68  <Method boolean ArrayList.add(Object)>
			//   42   84:pop             
						impl.replaceTargets(exitTransition, exitingViews, arraylist3);
			//   43   85:aload_0         
			//   44   86:getfield        #30  <Field FragmentTransitionImpl val$impl>
			//   45   89:aload_0         
			//   46   90:getfield        #42  <Field Object val$exitTransition>
			//   47   93:aload_0         
			//   48   94:getfield        #40  <Field ArrayList val$exitingViews>
			//   49   97:aload_1         
			//   50   98:invokevirtual   #72  <Method void FragmentTransitionImpl.replaceTargets(Object, ArrayList, ArrayList)>
					}
					exitingViews.clear();
			//   51  101:aload_0         
			//   52  102:getfield        #40  <Field ArrayList val$exitingViews>
			//   53  105:invokevirtual   #75  <Method void ArrayList.clear()>
					exitingViews.add(((Object) (nonExistentView)));
			//   54  108:aload_0         
			//   55  109:getfield        #40  <Field ArrayList val$exitingViews>
			//   56  112:aload_0         
			//   57  113:getfield        #32  <Field View val$nonExistentView>
			//   58  116:invokevirtual   #68  <Method boolean ArrayList.add(Object)>
			//   59  119:pop             
				}
			//   60  120:return          
			}

			final Object val$enterTransition;
			final ArrayList val$enteringViews;
			final Object val$exitTransition;
			final ArrayList val$exitingViews;
			final FragmentTransitionImpl val$impl;
			final Fragment val$inFragment;
			final View val$nonExistentView;
			final ArrayList val$sharedElementsIn;

			
			{
				enterTransition = obj;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #28  <Field Object val$enterTransition>
				impl = fragmenttransitionimpl;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #30  <Field FragmentTransitionImpl val$impl>
				nonExistentView = view;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #32  <Field View val$nonExistentView>
				inFragment = fragment;
			//    9   15:aload_0         
			//   10   16:aload           4
			//   11   18:putfield        #34  <Field Fragment val$inFragment>
				sharedElementsIn = arraylist;
			//   12   21:aload_0         
			//   13   22:aload           5
			//   14   24:putfield        #36  <Field ArrayList val$sharedElementsIn>
				enteringViews = arraylist1;
			//   15   27:aload_0         
			//   16   28:aload           6
			//   17   30:putfield        #38  <Field ArrayList val$enteringViews>
				exitingViews = arraylist2;
			//   18   33:aload_0         
			//   19   34:aload           7
			//   20   36:putfield        #40  <Field ArrayList val$exitingViews>
				exitTransition = obj1;
			//   21   39:aload_0         
			//   22   40:aload           8
			//   23   42:putfield        #42  <Field Object val$exitTransition>
				super();
			//   24   45:aload_0         
			//   25   46:invokespecial   #45  <Method void Object()>
			//   26   49:return          
			}
		}
);
	//    0    0:aload_1         
	//    1    1:new             #8   <Class FragmentTransition$2>
	//    2    4:dup             
	//    3    5:aload           5
	//    4    7:aload_0         
	//    5    8:aload_3         
	//    6    9:aload_2         
	//    7   10:aload           4
	//    8   12:aload           6
	//    9   14:aload           8
	//   10   16:aload           7
	//   11   18:invokespecial   #543 <Method void FragmentTransition$2(Object, FragmentTransitionImpl, View, Fragment, ArrayList, ArrayList, ArrayList, Object)>
	//   12   21:invokestatic    #385 <Method OneShotPreDrawListener OneShotPreDrawListener.add(View, Runnable)>
	//   13   24:pop             
	//   14   25:return          
	}

	private static void setOutEpicenter(FragmentTransitionImpl fragmenttransitionimpl, Object obj, Object obj1, ArrayMap arraymap, boolean flag, BackStackRecord backstackrecord)
	{
		if(backstackrecord.mSharedElementSourceNames != null && !backstackrecord.mSharedElementSourceNames.isEmpty())
	//*   0    0:aload           5
	//*   1    2:getfield        #198 <Field ArrayList BackStackRecord.mSharedElementSourceNames>
	//*   2    5:ifnull          81
	//*   3    8:aload           5
	//*   4   10:getfield        #198 <Field ArrayList BackStackRecord.mSharedElementSourceNames>
	//*   5   13:invokevirtual   #326 <Method boolean ArrayList.isEmpty()>
	//*   6   16:ifne            81
		{
			if(flag)
	//*   7   19:iload           4
	//*   8   21:ifeq            41
				backstackrecord = ((BackStackRecord) ((String)backstackrecord.mSharedElementTargetNames.get(0)));
	//    9   24:aload           5
	//   10   26:getfield        #201 <Field ArrayList BackStackRecord.mSharedElementTargetNames>
	//   11   29:iconst_0        
	//   12   30:invokevirtual   #179 <Method Object ArrayList.get(int)>
	//   13   33:checkcast       #203 <Class String>
	//   14   36:astore          5
			else
	//*  15   38:goto            55
				backstackrecord = ((BackStackRecord) ((String)backstackrecord.mSharedElementSourceNames.get(0)));
	//   16   41:aload           5
	//   17   43:getfield        #198 <Field ArrayList BackStackRecord.mSharedElementSourceNames>
	//   18   46:iconst_0        
	//   19   47:invokevirtual   #179 <Method Object ArrayList.get(int)>
	//   20   50:checkcast       #203 <Class String>
	//   21   53:astore          5
			arraymap = ((ArrayMap) ((View)arraymap.get(((Object) (backstackrecord)))));
	//   22   55:aload_3         
	//   23   56:aload           5
	//   24   58:invokevirtual   #284 <Method Object ArrayMap.get(Object)>
	//   25   61:checkcast       #58  <Class View>
	//   26   64:astore_3        
			fragmenttransitionimpl.setEpicenter(obj, ((View) (arraymap)));
	//   27   65:aload_0         
	//   28   66:aload_1         
	//   29   67:aload_3         
	//   30   68:invokevirtual   #546 <Method void FragmentTransitionImpl.setEpicenter(Object, View)>
			if(obj1 != null)
	//*  31   71:aload_2         
	//*  32   72:ifnull          81
				fragmenttransitionimpl.setEpicenter(obj1, ((View) (arraymap)));
	//   33   75:aload_0         
	//   34   76:aload_2         
	//   35   77:aload_3         
	//   36   78:invokevirtual   #546 <Method void FragmentTransitionImpl.setEpicenter(Object, View)>
		}
	//   37   81:return          
	}

	static void setViewVisibility(ArrayList arraylist, int i)
	{
		if(arraylist == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       5
			return;
	//    2    4:return          
		for(int j = arraylist.size() - 1; j >= 0; j--)
	//*   3    5:aload_0         
	//*   4    6:invokevirtual   #178 <Method int ArrayList.size()>
	//*   5    9:iconst_1        
	//*   6   10:isub            
	//*   7   11:istore_2        
	//*   8   12:iload_2         
	//*   9   13:iflt            35
			((View)arraylist.get(j)).setVisibility(i);
	//   10   16:aload_0         
	//   11   17:iload_2         
	//   12   18:invokevirtual   #179 <Method Object ArrayList.get(int)>
	//   13   21:checkcast       #58  <Class View>
	//   14   24:iload_1         
	//   15   25:invokevirtual   #391 <Method void View.setVisibility(int)>

	//   16   28:iload_2         
	//   17   29:iconst_1        
	//   18   30:isub            
	//   19   31:istore_2        
	//*  20   32:goto            12
	//   21   35:return          
	}

	static void startTransitions(FragmentManagerImpl fragmentmanagerimpl, ArrayList arraylist, ArrayList arraylist1, int i, int j, boolean flag)
	{
		if(fragmentmanagerimpl.mCurState < 1)
	//*   0    0:aload_0         
	//*   1    1:getfield        #153 <Field int FragmentManagerImpl.mCurState>
	//*   2    4:iconst_1        
	//*   3    5:icmpge          9
			return;
	//    4    8:return          
		SparseArray sparsearray = new SparseArray();
	//    5    9:new             #119 <Class SparseArray>
	//    6   12:dup             
	//    7   13:invokespecial   #551 <Method void SparseArray()>
	//    8   16:astore          9
		for(int k = i; k < j; k++)
	//*   9   18:iload_3         
	//*  10   19:istore          6
	//*  11   21:iload           6
	//*  12   23:iload           4
	//*  13   25:icmpge          84
		{
			BackStackRecord backstackrecord = (BackStackRecord)arraylist.get(k);
	//   14   28:aload_1         
	//   15   29:iload           6
	//   16   31:invokevirtual   #179 <Method Object ArrayList.get(int)>
	//   17   34:checkcast       #141 <Class BackStackRecord>
	//   18   37:astore          10
			if(((Boolean)arraylist1.get(k)).booleanValue())
	//*  19   39:aload_2         
	//*  20   40:iload           6
	//*  21   42:invokevirtual   #179 <Method Object ArrayList.get(int)>
	//*  22   45:checkcast       #191 <Class Boolean>
	//*  23   48:invokevirtual   #195 <Method boolean Boolean.booleanValue()>
	//*  24   51:ifeq            66
				calculatePopFragments(backstackrecord, sparsearray, flag);
	//   25   54:aload           10
	//   26   56:aload           9
	//   27   58:iload           5
	//   28   60:invokestatic    #553 <Method void calculatePopFragments(BackStackRecord, SparseArray, boolean)>
			else
	//*  29   63:goto            75
				calculateFragments(backstackrecord, sparsearray, flag);
	//   30   66:aload           10
	//   31   68:aload           9
	//   32   70:iload           5
	//   33   72:invokestatic    #555 <Method void calculateFragments(BackStackRecord, SparseArray, boolean)>
		}

	//   34   75:iload           6
	//   35   77:iconst_1        
	//   36   78:iadd            
	//   37   79:istore          6
	//*  38   81:goto            21
		if(sparsearray.size() != 0)
	//*  39   84:aload           9
	//*  40   86:invokevirtual   #556 <Method int SparseArray.size()>
	//*  41   89:ifeq            199
		{
			View view = new View(fragmentmanagerimpl.mHost.getContext());
	//   42   92:new             #58  <Class View>
	//   43   95:dup             
	//   44   96:aload_0         
	//   45   97:getfield        #560 <Field FragmentHostCallback FragmentManagerImpl.mHost>
	//   46  100:invokevirtual   #566 <Method android.content.Context FragmentHostCallback.getContext()>
	//   47  103:invokespecial   #569 <Method void View(android.content.Context)>
	//   48  106:astore          10
			int i1 = sparsearray.size();
	//   49  108:aload           9
	//   50  110:invokevirtual   #556 <Method int SparseArray.size()>
	//   51  113:istore          7
			for(int l = 0; l < i1; l++)
	//*  52  115:iconst_0        
	//*  53  116:istore          6
	//*  54  118:iload           6
	//*  55  120:iload           7
	//*  56  122:icmpge          199
			{
				int j1 = sparsearray.keyAt(l);
	//   57  125:aload           9
	//   58  127:iload           6
	//   59  129:invokevirtual   #572 <Method int SparseArray.keyAt(int)>
	//   60  132:istore          8
				ArrayMap arraymap = calculateNameOverrides(j1, arraylist, arraylist1, i, j);
	//   61  134:iload           8
	//   62  136:aload_1         
	//   63  137:aload_2         
	//   64  138:iload_3         
	//   65  139:iload           4
	//   66  141:invokestatic    #574 <Method ArrayMap calculateNameOverrides(int, ArrayList, ArrayList, int, int)>
	//   67  144:astore          11
				FragmentContainerTransition fragmentcontainertransition = (FragmentContainerTransition)sparsearray.valueAt(l);
	//   68  146:aload           9
	//   69  148:iload           6
	//   70  150:invokevirtual   #575 <Method Object SparseArray.valueAt(int)>
	//   71  153:checkcast       #14  <Class FragmentTransition$FragmentContainerTransition>
	//   72  156:astore          12
				if(flag)
	//*  73  158:iload           5
	//*  74  160:ifeq            178
					configureTransitionsReordered(fragmentmanagerimpl, j1, fragmentcontainertransition, view, arraymap);
	//   75  163:aload_0         
	//   76  164:iload           8
	//   77  166:aload           12
	//   78  168:aload           10
	//   79  170:aload           11
	//   80  172:invokestatic    #577 <Method void configureTransitionsReordered(FragmentManagerImpl, int, FragmentTransition$FragmentContainerTransition, View, ArrayMap)>
				else
	//*  81  175:goto            190
					configureTransitionsOrdered(fragmentmanagerimpl, j1, fragmentcontainertransition, view, arraymap);
	//   82  178:aload_0         
	//   83  179:iload           8
	//   84  181:aload           12
	//   85  183:aload           10
	//   86  185:aload           11
	//   87  187:invokestatic    #579 <Method void configureTransitionsOrdered(FragmentManagerImpl, int, FragmentTransition$FragmentContainerTransition, View, ArrayMap)>
			}

	//   88  190:iload           6
	//   89  192:iconst_1        
	//   90  193:iadd            
	//   91  194:istore          6
		}
	//*  92  196:goto            118
	//   93  199:return          
	}

	private static final int INVERSE_OPS[] = {
		0, 3, 0, 1, 5, 4, 7, 6, 9, 8
	};
	private static final FragmentTransitionImpl PLATFORM_IMPL;
	private static final FragmentTransitionImpl SUPPORT_IMPL = resolveSupportImpl();

	static 
	{
	//    0    0:bipush          10
	//    1    2:newarray        int[]
	//    2    4:dup             
	//    3    5:iconst_0        
	//    4    6:iconst_0        
	//    5    7:iastore         
	//    6    8:dup             
	//    7    9:iconst_1        
	//    8   10:iconst_3        
	//    9   11:iastore         
	//   10   12:dup             
	//   11   13:iconst_2        
	//   12   14:iconst_0        
	//   13   15:iastore         
	//   14   16:dup             
	//   15   17:iconst_3        
	//   16   18:iconst_1        
	//   17   19:iastore         
	//   18   20:dup             
	//   19   21:iconst_4        
	//   20   22:iconst_5        
	//   21   23:iastore         
	//   22   24:dup             
	//   23   25:iconst_5        
	//   24   26:iconst_4        
	//   25   27:iastore         
	//   26   28:dup             
	//   27   29:bipush          6
	//   28   31:bipush          7
	//   29   33:iastore         
	//   30   34:dup             
	//   31   35:bipush          7
	//   32   37:bipush          6
	//   33   39:iastore         
	//   34   40:dup             
	//   35   41:bipush          8
	//   36   43:bipush          9
	//   37   45:iastore         
	//   38   46:dup             
	//   39   47:bipush          9
	//   40   49:bipush          8
	//   41   51:iastore         
	//   42   52:putstatic       #24  <Field int[] INVERSE_OPS>
		FragmentTransitionCompat21 fragmenttransitioncompat21;
		if(android.os.Build.VERSION.SDK_INT >= 21)
	//*  43   55:getstatic       #30  <Field int android.os.Build$VERSION.SDK_INT>
	//*  44   58:bipush          21
	//*  45   60:icmplt          74
			fragmenttransitioncompat21 = new FragmentTransitionCompat21();
	//   46   63:new             #32  <Class FragmentTransitionCompat21>
	//   47   66:dup             
	//   48   67:invokespecial   #35  <Method void FragmentTransitionCompat21()>
	//   49   70:astore_0        
		else
	//*  50   71:goto            76
			fragmenttransitioncompat21 = null;
	//   51   74:aconst_null     
	//   52   75:astore_0        
		PLATFORM_IMPL = ((FragmentTransitionImpl) (fragmenttransitioncompat21));
	//   53   76:aload_0         
	//   54   77:putstatic       #37  <Field FragmentTransitionImpl PLATFORM_IMPL>
	//   55   80:invokestatic    #41  <Method FragmentTransitionImpl resolveSupportImpl()>
	//   56   83:putstatic       #43  <Field FragmentTransitionImpl SUPPORT_IMPL>
	//*  57   86:return          
	}
}

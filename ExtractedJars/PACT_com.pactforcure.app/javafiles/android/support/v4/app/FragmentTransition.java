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
import java.util.ArrayList;
import java.util.Collection;

// Referenced classes of package android.support.v4.app:
//			Fragment, BackStackRecord, FragmentManagerImpl, FragmentContainer, 
//			SharedElementCallback, FragmentTransitionCompat21, OneShotPreDrawListener, FragmentHostCallback

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


	FragmentTransition()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #25  <Method void Object()>
	//    2    4:return          
	}

	private static void addSharedElementsWithMatchingNames(ArrayList arraylist, ArrayMap arraymap, Collection collection)
	{
		for(int i = arraymap.size() - 1; i >= 0; i--)
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #58  <Method int ArrayMap.size()>
	//*   2    4:iconst_1        
	//*   3    5:isub            
	//*   4    6:istore_3        
	//*   5    7:iload_3         
	//*   6    8:iflt            49
		{
			View view = (View)arraymap.valueAt(i);
	//    7   11:aload_1         
	//    8   12:iload_3         
	//    9   13:invokevirtual   #62  <Method Object ArrayMap.valueAt(int)>
	//   10   16:checkcast       #64  <Class View>
	//   11   19:astore          4
			if(collection.contains(((Object) (ViewCompat.getTransitionName(view)))))
	//*  12   21:aload_2         
	//*  13   22:aload           4
	//*  14   24:invokestatic    #70  <Method String ViewCompat.getTransitionName(View)>
	//*  15   27:invokeinterface #76  <Method boolean Collection.contains(Object)>
	//*  16   32:ifeq            42
				arraylist.add(((Object) (view)));
	//   17   35:aload_0         
	//   18   36:aload           4
	//   19   38:invokevirtual   #81  <Method boolean ArrayList.add(Object)>
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
		Fragment fragment = op.fragment;
	//    0    0:aload_1         
	//    1    1:getfield        #91  <Field Fragment BackStackRecord$Op.fragment>
	//    2    4:astore          16
		if(fragment != null) goto _L2; else goto _L1
	//    3    6:aload           16
	//    4    8:ifnonnull       12
_L1:
		int j;
		return;
	//    5   11:return          
	//*   6   12:aload           16
	//*   7   14:getfield        #97  <Field int Fragment.mContainerId>
	//*   8   17:istore          12
_L2:
		if((j = fragment.mContainerId) == 0) goto _L1; else goto _L3
	//    9   19:iload           12
	//   10   21:ifeq            11
_L3:
		boolean flag2;
		boolean flag3;
		boolean flag4;
		boolean flag5;
		boolean flag6;
		boolean flag7;
		boolean flag8;
		boolean flag9;
		int i;
		Object obj;
		if(flag)
	//*  11   24:iload_3         
	//*  12   25:ifeq            331
			i = INVERSE_OPS[op.cmd];
	//   13   28:getstatic       #21  <Field int[] INVERSE_OPS>
	//   14   31:aload_1         
	//   15   32:getfield        #100 <Field int BackStackRecord$Op.cmd>
	//   16   35:iaload          
	//   17   36:istore          8
		else
	//*  18   38:iconst_0        
	//*  19   39:istore          14
	//*  20   41:iconst_0        
	//*  21   42:istore          10
	//*  22   44:iconst_0        
	//*  23   45:istore          11
	//*  24   47:iconst_0        
	//*  25   48:istore          9
	//*  26   50:iload           11
	//*  27   52:istore          5
	//*  28   54:iload           14
	//*  29   56:istore          13
	//*  30   58:iload           9
	//*  31   60:istore          6
	//*  32   62:iload           10
	//*  33   64:istore          7
	//*  34   66:iload           8
	//*  35   68:tableswitch     1 7: default 112
	//	               1 402
	//	               2 128
	//	               3 536
	//	               4 456
	//	               5 340
	//	               6 536
	//	               7 402
	//*  36  112:iload           10
	//*  37  114:istore          7
	//*  38  116:iload           9
	//*  39  118:istore          6
	//*  40  120:iload           14
	//*  41  122:istore          13
	//*  42  124:iload           11
	//*  43  126:istore          5
	//*  44  128:aload_2         
	//*  45  129:iload           12
	//*  46  131:invokevirtual   #105 <Method Object SparseArray.get(int)>
	//*  47  134:checkcast       #14  <Class FragmentTransition$FragmentContainerTransition>
	//*  48  137:astore          15
	//*  49  139:aload           15
	//*  50  141:astore_1        
	//*  51  142:iload           13
	//*  52  144:ifeq            172
	//*  53  147:aload           15
	//*  54  149:aload_2         
	//*  55  150:iload           12
	//*  56  152:invokestatic    #109 <Method FragmentTransition$FragmentContainerTransition ensureContainer(FragmentTransition$FragmentContainerTransition, SparseArray, int)>
	//*  57  155:astore_1        
	//*  58  156:aload_1         
	//*  59  157:aload           16
	//*  60  159:putfield        #112 <Field Fragment FragmentTransition$FragmentContainerTransition.lastIn>
	//*  61  162:aload_1         
	//*  62  163:iload_3         
	//*  63  164:putfield        #116 <Field boolean FragmentTransition$FragmentContainerTransition.lastInIsPop>
	//*  64  167:aload_1         
	//*  65  168:aload_0         
	//*  66  169:putfield        #120 <Field BackStackRecord FragmentTransition$FragmentContainerTransition.lastInTransaction>
	//*  67  172:iload           4
	//*  68  174:ifne            249
	//*  69  177:iload           6
	//*  70  179:ifeq            249
	//*  71  182:aload_1         
	//*  72  183:ifnull          200
	//*  73  186:aload_1         
	//*  74  187:getfield        #123 <Field Fragment FragmentTransition$FragmentContainerTransition.firstOut>
	//*  75  190:aload           16
	//*  76  192:if_acmpne       200
	//*  77  195:aload_1         
	//*  78  196:aconst_null     
	//*  79  197:putfield        #123 <Field Fragment FragmentTransition$FragmentContainerTransition.firstOut>
	//*  80  200:aload_0         
	//*  81  201:getfield        #129 <Field FragmentManagerImpl BackStackRecord.mManager>
	//*  82  204:astore          15
	//*  83  206:aload           16
	//*  84  208:getfield        #132 <Field int Fragment.mState>
	//*  85  211:iconst_1        
	//*  86  212:icmpge          249
	//*  87  215:aload           15
	//*  88  217:getfield        #137 <Field int FragmentManagerImpl.mCurState>
	//*  89  220:iconst_1        
	//*  90  221:icmplt          249
	//*  91  224:aload_0         
	//*  92  225:getfield        #140 <Field boolean BackStackRecord.mReorderingAllowed>
	//*  93  228:ifne            249
	//*  94  231:aload           15
	//*  95  233:aload           16
	//*  96  235:invokevirtual   #144 <Method void FragmentManagerImpl.makeActive(Fragment)>
	//*  97  238:aload           15
	//*  98  240:aload           16
	//*  99  242:iconst_1        
	//* 100  243:iconst_0        
	//* 101  244:iconst_0        
	//* 102  245:iconst_0        
	//* 103  246:invokevirtual   #148 <Method void FragmentManagerImpl.moveToState(Fragment, int, int, int, boolean)>
	//* 104  249:aload_1         
	//* 105  250:astore          15
	//* 106  252:iload           5
	//* 107  254:ifeq            299
	//* 108  257:aload_1         
	//* 109  258:ifnull          271
	//* 110  261:aload_1         
	//* 111  262:astore          15
	//* 112  264:aload_1         
	//* 113  265:getfield        #123 <Field Fragment FragmentTransition$FragmentContainerTransition.firstOut>
	//* 114  268:ifnonnull       299
	//* 115  271:aload_1         
	//* 116  272:aload_2         
	//* 117  273:iload           12
	//* 118  275:invokestatic    #109 <Method FragmentTransition$FragmentContainerTransition ensureContainer(FragmentTransition$FragmentContainerTransition, SparseArray, int)>
	//* 119  278:astore          15
	//* 120  280:aload           15
	//* 121  282:aload           16
	//* 122  284:putfield        #123 <Field Fragment FragmentTransition$FragmentContainerTransition.firstOut>
	//* 123  287:aload           15
	//* 124  289:iload_3         
	//* 125  290:putfield        #151 <Field boolean FragmentTransition$FragmentContainerTransition.firstOutIsPop>
	//* 126  293:aload           15
	//* 127  295:aload_0         
	//* 128  296:putfield        #154 <Field BackStackRecord FragmentTransition$FragmentContainerTransition.firstOutTransaction>
	//* 129  299:iload           4
	//* 130  301:ifne            11
	//* 131  304:iload           7
	//* 132  306:ifeq            11
	//* 133  309:aload           15
	//* 134  311:ifnull          11
	//* 135  314:aload           15
	//* 136  316:getfield        #112 <Field Fragment FragmentTransition$FragmentContainerTransition.lastIn>
	//* 137  319:aload           16
	//* 138  321:if_acmpne       11
	//* 139  324:aload           15
	//* 140  326:aconst_null     
	//* 141  327:putfield        #112 <Field Fragment FragmentTransition$FragmentContainerTransition.lastIn>
	//* 142  330:return          
			i = op.cmd;
	//  143  331:aload_1         
	//  144  332:getfield        #100 <Field int BackStackRecord$Op.cmd>
	//  145  335:istore          8
		flag9 = false;
		flag6 = false;
		flag7 = false;
		flag5 = false;
		flag2 = flag7;
		flag8 = flag9;
		flag3 = flag5;
		flag4 = flag6;
		i;
		JVM INSTR tableswitch 1 7: default 112
	//	               1 402
	//	               2 128
	//	               3 536
	//	               4 456
	//	               5 340
	//	               6 536
	//	               7 402;
		   goto _L4 _L5 _L6 _L7 _L8 _L9 _L7 _L5
_L7:
		break MISSING_BLOCK_LABEL_536;
_L6:
		break; /* Loop/switch isn't completed */
_L4:
		flag4 = flag6;
		flag3 = flag5;
		flag8 = flag9;
		flag2 = flag7;
_L11:
		obj = ((Object) ((FragmentContainerTransition)sparsearray.get(j)));
		op = ((BackStackRecord.Op) (obj));
		if(flag8)
		{
			op = ((BackStackRecord.Op) (ensureContainer(((FragmentContainerTransition) (obj)), sparsearray, j)));
			op.lastIn = fragment;
			op.lastInIsPop = flag;
			op.lastInTransaction = backstackrecord;
		}
		if(!flag1 && flag3)
		{
			if(op != null && ((FragmentContainerTransition) (op)).firstOut == fragment)
				op.firstOut = null;
			obj = ((Object) (backstackrecord.mManager));
			if(fragment.mState < 1 && ((FragmentManagerImpl) (obj)).mCurState >= 1 && !backstackrecord.mReorderingAllowed)
			{
				((FragmentManagerImpl) (obj)).makeActive(fragment);
				((FragmentManagerImpl) (obj)).moveToState(fragment, 1, 0, 0, false);
			}
		}
		obj = ((Object) (op));
		if(!flag2)
			continue; /* Loop/switch isn't completed */
		if(op != null)
		{
			obj = ((Object) (op));
			if(((FragmentContainerTransition) (op)).firstOut != null)
				continue; /* Loop/switch isn't completed */
		}
		obj = ((Object) (ensureContainer(((FragmentContainerTransition) (op)), sparsearray, j)));
		obj.firstOut = fragment;
		obj.firstOutIsPop = flag;
		obj.firstOutTransaction = backstackrecord;
		if(flag1 || !flag4 || obj == null || ((FragmentContainerTransition) (obj)).lastIn != fragment) goto _L1; else goto _L10
_L10:
		obj.lastIn = null;
		return;
	//* 146  337:goto            38
_L9:
		if(flag1)
	//* 147  340:iload           4
	//* 148  342:ifeq            392
		{
			if(fragment.mHiddenChanged && !fragment.mHidden && fragment.mAdded)
	//* 149  345:aload           16
	//* 150  347:getfield        #157 <Field boolean Fragment.mHiddenChanged>
	//* 151  350:ifeq            386
	//* 152  353:aload           16
	//* 153  355:getfield        #160 <Field boolean Fragment.mHidden>
	//* 154  358:ifne            386
	//* 155  361:aload           16
	//* 156  363:getfield        #163 <Field boolean Fragment.mAdded>
	//* 157  366:ifeq            386
				flag8 = true;
	//  158  369:iconst_1        
	//  159  370:istore          13
			else
	//* 160  372:iconst_1        
	//* 161  373:istore          6
	//* 162  375:iload           11
	//* 163  377:istore          5
	//* 164  379:iload           10
	//* 165  381:istore          7
	//* 166  383:goto            128
				flag8 = false;
	//  167  386:iconst_0        
	//  168  387:istore          13
		} else
	//* 169  389:goto            372
		{
			flag8 = fragment.mHidden;
	//  170  392:aload           16
	//  171  394:getfield        #160 <Field boolean Fragment.mHidden>
	//  172  397:istore          13
		}
		flag3 = true;
		flag2 = flag7;
		flag4 = flag6;
		  goto _L11
	//* 173  399:goto            372
_L5:
		if(flag1)
	//* 174  402:iload           4
	//* 175  404:ifeq            428
			flag8 = fragment.mIsNewlyAdded;
	//  176  407:aload           16
	//  177  409:getfield        #166 <Field boolean Fragment.mIsNewlyAdded>
	//  178  412:istore          13
		else
	//* 179  414:iconst_1        
	//* 180  415:istore          6
	//* 181  417:iload           11
	//* 182  419:istore          5
	//* 183  421:iload           10
	//* 184  423:istore          7
	//* 185  425:goto            128
		if(!fragment.mAdded && !fragment.mHidden)
	//* 186  428:aload           16
	//* 187  430:getfield        #163 <Field boolean Fragment.mAdded>
	//* 188  433:ifne            450
	//* 189  436:aload           16
	//* 190  438:getfield        #160 <Field boolean Fragment.mHidden>
	//* 191  441:ifne            450
			flag8 = true;
	//  192  444:iconst_1        
	//  193  445:istore          13
		else
	//* 194  447:goto            414
			flag8 = false;
	//  195  450:iconst_0        
	//  196  451:istore          13
		flag3 = true;
		flag2 = flag7;
		flag4 = flag6;
		  goto _L11
	//* 197  453:goto            447
_L8:
		if(flag1)
	//* 198  456:iload           4
	//* 199  458:ifeq            508
		{
			if(fragment.mHiddenChanged && fragment.mAdded && fragment.mHidden)
	//* 200  461:aload           16
	//* 201  463:getfield        #157 <Field boolean Fragment.mHiddenChanged>
	//* 202  466:ifeq            502
	//* 203  469:aload           16
	//* 204  471:getfield        #163 <Field boolean Fragment.mAdded>
	//* 205  474:ifeq            502
	//* 206  477:aload           16
	//* 207  479:getfield        #160 <Field boolean Fragment.mHidden>
	//* 208  482:ifeq            502
				flag2 = true;
	//  209  485:iconst_1        
	//  210  486:istore          5
			else
	//* 211  488:iconst_1        
	//* 212  489:istore          7
	//* 213  491:iload           14
	//* 214  493:istore          13
	//* 215  495:iload           9
	//* 216  497:istore          6
	//* 217  499:goto            128
				flag2 = false;
	//  218  502:iconst_0        
	//  219  503:istore          5
		} else
	//* 220  505:goto            488
		if(fragment.mAdded && !fragment.mHidden)
	//* 221  508:aload           16
	//* 222  510:getfield        #163 <Field boolean Fragment.mAdded>
	//* 223  513:ifeq            530
	//* 224  516:aload           16
	//* 225  518:getfield        #160 <Field boolean Fragment.mHidden>
	//* 226  521:ifne            530
			flag2 = true;
	//  227  524:iconst_1        
	//  228  525:istore          5
		else
	//* 229  527:goto            488
			flag2 = false;
	//  230  530:iconst_0        
	//  231  531:istore          5
		flag4 = true;
		flag8 = flag9;
		flag3 = flag5;
		  goto _L11
	//* 232  533:goto            527
		if(flag1)
	//* 233  536:iload           4
	//* 234  538:ifeq            601
		{
			if(!fragment.mAdded && fragment.mView != null && fragment.mView.getVisibility() == 0 && fragment.mPostponedAlpha >= 0.0F)
	//* 235  541:aload           16
	//* 236  543:getfield        #163 <Field boolean Fragment.mAdded>
	//* 237  546:ifne            595
	//* 238  549:aload           16
	//* 239  551:getfield        #170 <Field View Fragment.mView>
	//* 240  554:ifnull          595
	//* 241  557:aload           16
	//* 242  559:getfield        #170 <Field View Fragment.mView>
	//* 243  562:invokevirtual   #173 <Method int View.getVisibility()>
	//* 244  565:ifne            595
	//* 245  568:aload           16
	//* 246  570:getfield        #177 <Field float Fragment.mPostponedAlpha>
	//* 247  573:fconst_0        
	//* 248  574:fcmpl           
	//* 249  575:iflt            595
				flag2 = true;
	//  250  578:iconst_1        
	//  251  579:istore          5
			else
	//* 252  581:iconst_1        
	//* 253  582:istore          7
	//* 254  584:iload           14
	//* 255  586:istore          13
	//* 256  588:iload           9
	//* 257  590:istore          6
	//* 258  592:goto            128
				flag2 = false;
	//  259  595:iconst_0        
	//  260  596:istore          5
		} else
	//* 261  598:goto            581
		if(fragment.mAdded && !fragment.mHidden)
	//* 262  601:aload           16
	//* 263  603:getfield        #163 <Field boolean Fragment.mAdded>
	//* 264  606:ifeq            623
	//* 265  609:aload           16
	//* 266  611:getfield        #160 <Field boolean Fragment.mHidden>
	//* 267  614:ifne            623
			flag2 = true;
	//  268  617:iconst_1        
	//  269  618:istore          5
		else
	//* 270  620:goto            581
			flag2 = false;
	//  271  623:iconst_0        
	//  272  624:istore          5
		flag4 = true;
		flag8 = flag9;
		flag3 = flag5;
		  goto _L11
	//* 273  626:goto            620
	}

	public static void calculateFragments(BackStackRecord backstackrecord, SparseArray sparsearray, boolean flag)
	{
		int j = backstackrecord.mOps.size();
	//    0    0:aload_0         
	//    1    1:getfield        #184 <Field ArrayList BackStackRecord.mOps>
	//    2    4:invokevirtual   #185 <Method int ArrayList.size()>
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
	//   11   19:getfield        #184 <Field ArrayList BackStackRecord.mOps>
	//   12   22:iload_3         
	//   13   23:invokevirtual   #186 <Method Object ArrayList.get(int)>
	//   14   26:checkcast       #87  <Class BackStackRecord$Op>
	//   15   29:aload_1         
	//   16   30:iconst_0        
	//   17   31:iload_2         
	//   18   32:invokestatic    #188 <Method void addToFirstInLastOut(BackStackRecord, BackStackRecord$Op, SparseArray, boolean, boolean)>

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
	//    0    0:new             #54  <Class ArrayMap>
	//    1    3:dup             
	//    2    4:invokespecial   #192 <Method void ArrayMap()>
	//    3    7:astore          10
		k--;
	//    4    9:iload           4
	//    5   11:iconst_1        
	//    6   12:isub            
	//    7   13:istore          4
		while(k >= j) 
	//*   8   15:iload           4
	//*   9   17:iload_3         
	//*  10   18:icmplt          201
		{
			Object obj = ((Object) ((BackStackRecord)arraylist.get(k)));
	//   11   21:aload_1         
	//   12   22:iload           4
	//   13   24:invokevirtual   #186 <Method Object ArrayList.get(int)>
	//   14   27:checkcast       #125 <Class BackStackRecord>
	//   15   30:astore          11
			if(((BackStackRecord) (obj)).interactsWith(i))
	//*  16   32:aload           11
	//*  17   34:iload_0         
	//*  18   35:invokevirtual   #196 <Method boolean BackStackRecord.interactsWith(int)>
	//*  19   38:ifne            50
	//*  20   41:iload           4
	//*  21   43:iconst_1        
	//*  22   44:isub            
	//*  23   45:istore          4
	//*  24   47:goto            15
			{
				boolean flag = ((Boolean)arraylist1.get(k)).booleanValue();
	//   25   50:aload_2         
	//   26   51:iload           4
	//   27   53:invokevirtual   #186 <Method Object ArrayList.get(int)>
	//   28   56:checkcast       #198 <Class Boolean>
	//   29   59:invokevirtual   #202 <Method boolean Boolean.booleanValue()>
	//   30   62:istore          7
				if(((BackStackRecord) (obj)).mSharedElementSourceNames != null)
	//*  31   64:aload           11
	//*  32   66:getfield        #205 <Field ArrayList BackStackRecord.mSharedElementSourceNames>
	//*  33   69:ifnull          41
				{
					int i1 = ((BackStackRecord) (obj)).mSharedElementSourceNames.size();
	//   34   72:aload           11
	//   35   74:getfield        #205 <Field ArrayList BackStackRecord.mSharedElementSourceNames>
	//   36   77:invokevirtual   #185 <Method int ArrayList.size()>
	//   37   80:istore          6
					int l;
					ArrayList arraylist2;
					ArrayList arraylist3;
					if(flag)
	//*  38   82:iload           7
	//*  39   84:ifeq            171
					{
						arraylist3 = ((BackStackRecord) (obj)).mSharedElementSourceNames;
	//   40   87:aload           11
	//   41   89:getfield        #205 <Field ArrayList BackStackRecord.mSharedElementSourceNames>
	//   42   92:astore          9
						arraylist2 = ((BackStackRecord) (obj)).mSharedElementTargetNames;
	//   43   94:aload           11
	//   44   96:getfield        #208 <Field ArrayList BackStackRecord.mSharedElementTargetNames>
	//   45   99:astore          8
					} else
	//*  46  101:iconst_0        
	//*  47  102:istore          5
	//*  48  104:iload           5
	//*  49  106:iload           6
	//*  50  108:icmpge          41
	//*  51  111:aload           8
	//*  52  113:iload           5
	//*  53  115:invokevirtual   #186 <Method Object ArrayList.get(int)>
	//*  54  118:checkcast       #210 <Class String>
	//*  55  121:astore          11
	//*  56  123:aload           9
	//*  57  125:iload           5
	//*  58  127:invokevirtual   #186 <Method Object ArrayList.get(int)>
	//*  59  130:checkcast       #210 <Class String>
	//*  60  133:astore          12
	//*  61  135:aload           10
	//*  62  137:aload           12
	//*  63  139:invokevirtual   #214 <Method Object ArrayMap.remove(Object)>
	//*  64  142:checkcast       #210 <Class String>
	//*  65  145:astore          13
	//*  66  147:aload           13
	//*  67  149:ifnull          188
	//*  68  152:aload           10
	//*  69  154:aload           11
	//*  70  156:aload           13
	//*  71  158:invokevirtual   #218 <Method Object ArrayMap.put(Object, Object)>
	//*  72  161:pop             
	//*  73  162:iload           5
	//*  74  164:iconst_1        
	//*  75  165:iadd            
	//*  76  166:istore          5
	//*  77  168:goto            104
					{
						arraylist2 = ((BackStackRecord) (obj)).mSharedElementSourceNames;
	//   78  171:aload           11
	//   79  173:getfield        #205 <Field ArrayList BackStackRecord.mSharedElementSourceNames>
	//   80  176:astore          8
						arraylist3 = ((BackStackRecord) (obj)).mSharedElementTargetNames;
	//   81  178:aload           11
	//   82  180:getfield        #208 <Field ArrayList BackStackRecord.mSharedElementTargetNames>
	//   83  183:astore          9
					}
					l = 0;
					while(l < i1) 
					{
						obj = ((Object) ((String)arraylist2.get(l)));
						String s = (String)arraylist3.get(l);
						String s1 = (String)arraymap.remove(((Object) (s)));
						if(s1 != null)
							arraymap.put(obj, ((Object) (s1)));
						else
	//*  84  185:goto            101
							arraymap.put(obj, ((Object) (s)));
	//   85  188:aload           10
	//   86  190:aload           11
	//   87  192:aload           12
	//   88  194:invokevirtual   #218 <Method Object ArrayMap.put(Object, Object)>
	//   89  197:pop             
						l++;
					}
				}
			}
			k--;
		}
	//*  90  198:goto            162
		return arraymap;
	//   91  201:aload           10
	//   92  203:areturn         
	}

	public static void calculatePopFragments(BackStackRecord backstackrecord, SparseArray sparsearray, boolean flag)
	{
		if(backstackrecord.mManager.mContainer.onHasView())
	//*   0    0:aload_0         
	//*   1    1:getfield        #129 <Field FragmentManagerImpl BackStackRecord.mManager>
	//*   2    4:getfield        #224 <Field FragmentContainer FragmentManagerImpl.mContainer>
	//*   3    7:invokevirtual   #229 <Method boolean FragmentContainer.onHasView()>
	//*   4   10:ifne            14
	//*   5   13:return          
		{
			int i = backstackrecord.mOps.size() - 1;
	//    6   14:aload_0         
	//    7   15:getfield        #184 <Field ArrayList BackStackRecord.mOps>
	//    8   18:invokevirtual   #185 <Method int ArrayList.size()>
	//    9   21:iconst_1        
	//   10   22:isub            
	//   11   23:istore_3        
			while(i >= 0) 
	//*  12   24:iload_3         
	//*  13   25:iflt            13
			{
				addToFirstInLastOut(backstackrecord, (BackStackRecord.Op)backstackrecord.mOps.get(i), sparsearray, true, flag);
	//   14   28:aload_0         
	//   15   29:aload_0         
	//   16   30:getfield        #184 <Field ArrayList BackStackRecord.mOps>
	//   17   33:iload_3         
	//   18   34:invokevirtual   #186 <Method Object ArrayList.get(int)>
	//   19   37:checkcast       #87  <Class BackStackRecord$Op>
	//   20   40:aload_1         
	//   21   41:iconst_1        
	//   22   42:iload_2         
	//   23   43:invokestatic    #188 <Method void addToFirstInLastOut(BackStackRecord, BackStackRecord$Op, SparseArray, boolean, boolean)>
				i--;
	//   24   46:iload_3         
	//   25   47:iconst_1        
	//   26   48:isub            
	//   27   49:istore_3        
			}
		}
	//*  28   50:goto            24
	}

	private static void callSharedElementStartEnd(Fragment fragment, Fragment fragment1, boolean flag, ArrayMap arraymap, boolean flag1)
	{
		ArrayList arraylist;
label0:
		{
			if(flag)
	//*   0    0:iload_2         
	//*   1    1:ifeq            79
				fragment = ((Fragment) (fragment1.getEnterTransitionCallback()));
	//    2    4:aload_1         
	//    3    5:invokevirtual   #233 <Method SharedElementCallback Fragment.getEnterTransitionCallback()>
	//    4    8:astore_0        
			else
	//*   5    9:aload_0         
	//*   6   10:ifnull          109
	//*   7   13:new             #78  <Class ArrayList>
	//*   8   16:dup             
	//*   9   17:invokespecial   #234 <Method void ArrayList()>
	//*  10   20:astore_1        
	//*  11   21:new             #78  <Class ArrayList>
	//*  12   24:dup             
	//*  13   25:invokespecial   #234 <Method void ArrayList()>
	//*  14   28:astore          7
	//*  15   30:aload_3         
	//*  16   31:ifnonnull       87
	//*  17   34:iconst_0        
	//*  18   35:istore          5
	//*  19   37:iconst_0        
	//*  20   38:istore          6
	//*  21   40:iload           6
	//*  22   42:iload           5
	//*  23   44:icmpge          96
	//*  24   47:aload           7
	//*  25   49:aload_3         
	//*  26   50:iload           6
	//*  27   52:invokevirtual   #237 <Method Object ArrayMap.keyAt(int)>
	//*  28   55:invokevirtual   #81  <Method boolean ArrayList.add(Object)>
	//*  29   58:pop             
	//*  30   59:aload_1         
	//*  31   60:aload_3         
	//*  32   61:iload           6
	//*  33   63:invokevirtual   #62  <Method Object ArrayMap.valueAt(int)>
	//*  34   66:invokevirtual   #81  <Method boolean ArrayList.add(Object)>
	//*  35   69:pop             
	//*  36   70:iload           6
	//*  37   72:iconst_1        
	//*  38   73:iadd            
	//*  39   74:istore          6
	//*  40   76:goto            40
				fragment = ((Fragment) (fragment.getEnterTransitionCallback()));
	//   41   79:aload_0         
	//   42   80:invokevirtual   #233 <Method SharedElementCallback Fragment.getEnterTransitionCallback()>
	//   43   83:astore_0        
			if(fragment != null)
			{
				fragment1 = ((Fragment) (new ArrayList()));
				arraylist = new ArrayList();
				int i;
				int j;
				if(arraymap == null)
					i = 0;
				else
	//*  44   84:goto            9
					i = arraymap.size();
	//   45   87:aload_3         
	//   46   88:invokevirtual   #58  <Method int ArrayMap.size()>
	//   47   91:istore          5
				for(j = 0; j < i; j++)
				{
					arraylist.add(arraymap.keyAt(j));
					((ArrayList) (fragment1)).add(arraymap.valueAt(j));
				}

	//*  48   93:goto            37
				if(!flag1)
					break label0;
	//   49   96:iload           4
	//   50   98:ifeq            110
				((SharedElementCallback) (fragment)).onSharedElementStart(((java.util.List) (arraylist)), ((java.util.List) (fragment1)), ((java.util.List) (null)));
	//   51  101:aload_0         
	//   52  102:aload           7
	//   53  104:aload_1         
	//   54  105:aconst_null     
	//   55  106:invokevirtual   #243 <Method void SharedElementCallback.onSharedElementStart(java.util.List, java.util.List, java.util.List)>
			}
			return;
	//   56  109:return          
		}
		((SharedElementCallback) (fragment)).onSharedElementEnd(((java.util.List) (arraylist)), ((java.util.List) (fragment1)), ((java.util.List) (null)));
	//   57  110:aload_0         
	//   58  111:aload           7
	//   59  113:aload_1         
	//   60  114:aconst_null     
	//   61  115:invokevirtual   #246 <Method void SharedElementCallback.onSharedElementEnd(java.util.List, java.util.List, java.util.List)>
	//   62  118:return          
	}

	private static ArrayMap captureInSharedElements(ArrayMap arraymap, Object obj, FragmentContainerTransition fragmentcontainertransition)
	{
		Object obj1;
		View view;
		obj1 = ((Object) (fragmentcontainertransition.lastIn));
	//    0    0:aload_2         
	//    1    1:getfield        #112 <Field Fragment FragmentTransition$FragmentContainerTransition.lastIn>
	//    2    4:astore          5
		view = ((Fragment) (obj1)).getView();
	//    3    6:aload           5
	//    4    8:invokevirtual   #254 <Method View Fragment.getView()>
	//    5   11:astore          6
		if(!arraymap.isEmpty() && obj != null && view != null) goto _L2; else goto _L1
	//    6   13:aload_0         
	//    7   14:invokevirtual   #257 <Method boolean ArrayMap.isEmpty()>
	//    8   17:ifne            29
	//    9   20:aload_1         
	//   10   21:ifnull          29
	//   11   24:aload           6
	//   12   26:ifnonnull       37
_L1:
		arraymap.clear();
	//   13   29:aload_0         
	//   14   30:invokevirtual   #260 <Method void ArrayMap.clear()>
		fragmentcontainertransition = null;
	//   15   33:aconst_null     
	//   16   34:astore_2        
_L4:
		return ((ArrayMap) (fragmentcontainertransition));
	//   17   35:aload_2         
	//   18   36:areturn         
_L2:
		ArrayMap arraymap1;
label0:
		{
			arraymap1 = new ArrayMap();
	//   19   37:new             #54  <Class ArrayMap>
	//   20   40:dup             
	//   21   41:invokespecial   #192 <Method void ArrayMap()>
	//   22   44:astore          4
			FragmentTransitionCompat21.findNamedViews(((java.util.Map) (arraymap1)), view);
	//   23   46:aload           4
	//   24   48:aload           6
	//   25   50:invokestatic    #266 <Method void FragmentTransitionCompat21.findNamedViews(java.util.Map, View)>
			obj = ((Object) (fragmentcontainertransition.lastInTransaction));
	//   26   53:aload_2         
	//   27   54:getfield        #120 <Field BackStackRecord FragmentTransition$FragmentContainerTransition.lastInTransaction>
	//   28   57:astore_1        
			int i;
			if(fragmentcontainertransition.lastInIsPop)
	//*  29   58:aload_2         
	//*  30   59:getfield        #116 <Field boolean FragmentTransition$FragmentContainerTransition.lastInIsPop>
	//*  31   62:ifeq            161
			{
				fragmentcontainertransition = ((FragmentContainerTransition) (((Fragment) (obj1)).getExitTransitionCallback()));
	//   32   65:aload           5
	//   33   67:invokevirtual   #269 <Method SharedElementCallback Fragment.getExitTransitionCallback()>
	//   34   70:astore_2        
				obj = ((Object) (((BackStackRecord) (obj)).mSharedElementSourceNames));
	//   35   71:aload_1         
	//   36   72:getfield        #205 <Field ArrayList BackStackRecord.mSharedElementSourceNames>
	//   37   75:astore_1        
			} else
	//*  38   76:aload_1         
	//*  39   77:ifnull          87
	//*  40   80:aload           4
	//*  41   82:aload_1         
	//*  42   83:invokevirtual   #273 <Method boolean ArrayMap.retainAll(Collection)>
	//*  43   86:pop             
	//*  44   87:aload_2         
	//*  45   88:ifnull          214
	//*  46   91:aload_2         
	//*  47   92:aload_1         
	//*  48   93:aload           4
	//*  49   95:invokevirtual   #277 <Method void SharedElementCallback.onMapSharedElements(java.util.List, java.util.Map)>
	//*  50   98:aload_1         
	//*  51   99:invokevirtual   #185 <Method int ArrayList.size()>
	//*  52  102:iconst_1        
	//*  53  103:isub            
	//*  54  104:istore_3        
	//*  55  105:aload           4
	//*  56  107:astore_2        
	//*  57  108:iload_3         
	//*  58  109:iflt            35
	//*  59  112:aload_1         
	//*  60  113:iload_3         
	//*  61  114:invokevirtual   #186 <Method Object ArrayList.get(int)>
	//*  62  117:checkcast       #210 <Class String>
	//*  63  120:astore          5
	//*  64  122:aload           4
	//*  65  124:aload           5
	//*  66  126:invokevirtual   #279 <Method Object ArrayMap.get(Object)>
	//*  67  129:checkcast       #64  <Class View>
	//*  68  132:astore_2        
	//*  69  133:aload_2         
	//*  70  134:ifnonnull       175
	//*  71  137:aload_0         
	//*  72  138:aload           5
	//*  73  140:invokestatic    #283 <Method String findKeyForValue(ArrayMap, String)>
	//*  74  143:astore_2        
	//*  75  144:aload_2         
	//*  76  145:ifnull          154
	//*  77  148:aload_0         
	//*  78  149:aload_2         
	//*  79  150:invokevirtual   #214 <Method Object ArrayMap.remove(Object)>
	//*  80  153:pop             
	//*  81  154:iload_3         
	//*  82  155:iconst_1        
	//*  83  156:isub            
	//*  84  157:istore_3        
	//*  85  158:goto            105
			{
				fragmentcontainertransition = ((FragmentContainerTransition) (((Fragment) (obj1)).getEnterTransitionCallback()));
	//   86  161:aload           5
	//   87  163:invokevirtual   #233 <Method SharedElementCallback Fragment.getEnterTransitionCallback()>
	//   88  166:astore_2        
				obj = ((Object) (((BackStackRecord) (obj)).mSharedElementTargetNames));
	//   89  167:aload_1         
	//   90  168:getfield        #208 <Field ArrayList BackStackRecord.mSharedElementTargetNames>
	//   91  171:astore_1        
			}
			if(obj != null)
				arraymap1.retainAll(((Collection) (obj)));
			if(fragmentcontainertransition == null)
				break label0;
			((SharedElementCallback) (fragmentcontainertransition)).onMapSharedElements(((java.util.List) (obj)), ((java.util.Map) (arraymap1)));
			i = ((ArrayList) (obj)).size() - 1;
			do
			{
				fragmentcontainertransition = ((FragmentContainerTransition) (arraymap1));
				if(i < 0)
					break;
				obj1 = ((Object) ((String)((ArrayList) (obj)).get(i)));
				fragmentcontainertransition = ((FragmentContainerTransition) ((View)arraymap1.get(obj1)));
				if(fragmentcontainertransition == null)
				{
					fragmentcontainertransition = ((FragmentContainerTransition) (findKeyForValue(arraymap, ((String) (obj1)))));
					if(fragmentcontainertransition != null)
						arraymap.remove(((Object) (fragmentcontainertransition)));
				} else
	//*  92  172:goto            76
				if(!((String) (obj1)).equals(((Object) (ViewCompat.getTransitionName(((View) (fragmentcontainertransition)))))))
	//*  93  175:aload           5
	//*  94  177:aload_2         
	//*  95  178:invokestatic    #70  <Method String ViewCompat.getTransitionName(View)>
	//*  96  181:invokevirtual   #286 <Method boolean String.equals(Object)>
	//*  97  184:ifne            154
				{
					obj1 = ((Object) (findKeyForValue(arraymap, ((String) (obj1)))));
	//   98  187:aload_0         
	//   99  188:aload           5
	//  100  190:invokestatic    #283 <Method String findKeyForValue(ArrayMap, String)>
	//  101  193:astore          5
					if(obj1 != null)
	//* 102  195:aload           5
	//* 103  197:ifnull          154
						arraymap.put(obj1, ((Object) (ViewCompat.getTransitionName(((View) (fragmentcontainertransition))))));
	//  104  200:aload_0         
	//  105  201:aload           5
	//  106  203:aload_2         
	//  107  204:invokestatic    #70  <Method String ViewCompat.getTransitionName(View)>
	//  108  207:invokevirtual   #218 <Method Object ArrayMap.put(Object, Object)>
	//  109  210:pop             
				}
				i--;
			} while(true);
	//  110  211:goto            154
		}
		if(true) goto _L4; else goto _L3
_L3:
		retainValues(arraymap, arraymap1);
	//  111  214:aload_0         
	//  112  215:aload           4
	//  113  217:invokestatic    #290 <Method void retainValues(ArrayMap, ArrayMap)>
		return arraymap1;
	//  114  220:aload           4
	//  115  222:areturn         
	}

	private static ArrayMap captureOutSharedElements(ArrayMap arraymap, Object obj, FragmentContainerTransition fragmentcontainertransition)
	{
		if(!arraymap.isEmpty() && obj != null) goto _L2; else goto _L1
	//    0    0:aload_0         
	//    1    1:invokevirtual   #257 <Method boolean ArrayMap.isEmpty()>
	//    2    4:ifne            11
	//    3    7:aload_1         
	//    4    8:ifnonnull       19
_L1:
		arraymap.clear();
	//    5   11:aload_0         
	//    6   12:invokevirtual   #260 <Method void ArrayMap.clear()>
		fragmentcontainertransition = null;
	//    7   15:aconst_null     
	//    8   16:astore_2        
_L4:
		return ((ArrayMap) (fragmentcontainertransition));
	//    9   17:aload_2         
	//   10   18:areturn         
_L2:
		ArrayMap arraymap1;
label0:
		{
			Object obj1 = ((Object) (fragmentcontainertransition.firstOut));
	//   11   19:aload_2         
	//   12   20:getfield        #123 <Field Fragment FragmentTransition$FragmentContainerTransition.firstOut>
	//   13   23:astore          5
			arraymap1 = new ArrayMap();
	//   14   25:new             #54  <Class ArrayMap>
	//   15   28:dup             
	//   16   29:invokespecial   #192 <Method void ArrayMap()>
	//   17   32:astore          4
			FragmentTransitionCompat21.findNamedViews(((java.util.Map) (arraymap1)), ((Fragment) (obj1)).getView());
	//   18   34:aload           4
	//   19   36:aload           5
	//   20   38:invokevirtual   #254 <Method View Fragment.getView()>
	//   21   41:invokestatic    #266 <Method void FragmentTransitionCompat21.findNamedViews(java.util.Map, View)>
			obj = ((Object) (fragmentcontainertransition.firstOutTransaction));
	//   22   44:aload_2         
	//   23   45:getfield        #154 <Field BackStackRecord FragmentTransition$FragmentContainerTransition.firstOutTransaction>
	//   24   48:astore_1        
			int i;
			if(fragmentcontainertransition.firstOutIsPop)
	//*  25   49:aload_2         
	//*  26   50:getfield        #151 <Field boolean FragmentTransition$FragmentContainerTransition.firstOutIsPop>
	//*  27   53:ifeq            138
			{
				fragmentcontainertransition = ((FragmentContainerTransition) (((Fragment) (obj1)).getEnterTransitionCallback()));
	//   28   56:aload           5
	//   29   58:invokevirtual   #233 <Method SharedElementCallback Fragment.getEnterTransitionCallback()>
	//   30   61:astore_2        
				obj = ((Object) (((BackStackRecord) (obj)).mSharedElementTargetNames));
	//   31   62:aload_1         
	//   32   63:getfield        #208 <Field ArrayList BackStackRecord.mSharedElementTargetNames>
	//   33   66:astore_1        
			} else
	//*  34   67:aload           4
	//*  35   69:aload_1         
	//*  36   70:invokevirtual   #273 <Method boolean ArrayMap.retainAll(Collection)>
	//*  37   73:pop             
	//*  38   74:aload_2         
	//*  39   75:ifnull          189
	//*  40   78:aload_2         
	//*  41   79:aload_1         
	//*  42   80:aload           4
	//*  43   82:invokevirtual   #277 <Method void SharedElementCallback.onMapSharedElements(java.util.List, java.util.Map)>
	//*  44   85:aload_1         
	//*  45   86:invokevirtual   #185 <Method int ArrayList.size()>
	//*  46   89:iconst_1        
	//*  47   90:isub            
	//*  48   91:istore_3        
	//*  49   92:aload           4
	//*  50   94:astore_2        
	//*  51   95:iload_3         
	//*  52   96:iflt            17
	//*  53   99:aload_1         
	//*  54  100:iload_3         
	//*  55  101:invokevirtual   #186 <Method Object ArrayList.get(int)>
	//*  56  104:checkcast       #210 <Class String>
	//*  57  107:astore          5
	//*  58  109:aload           4
	//*  59  111:aload           5
	//*  60  113:invokevirtual   #279 <Method Object ArrayMap.get(Object)>
	//*  61  116:checkcast       #64  <Class View>
	//*  62  119:astore_2        
	//*  63  120:aload_2         
	//*  64  121:ifnonnull       152
	//*  65  124:aload_0         
	//*  66  125:aload           5
	//*  67  127:invokevirtual   #214 <Method Object ArrayMap.remove(Object)>
	//*  68  130:pop             
	//*  69  131:iload_3         
	//*  70  132:iconst_1        
	//*  71  133:isub            
	//*  72  134:istore_3        
	//*  73  135:goto            92
			{
				fragmentcontainertransition = ((FragmentContainerTransition) (((Fragment) (obj1)).getExitTransitionCallback()));
	//   74  138:aload           5
	//   75  140:invokevirtual   #269 <Method SharedElementCallback Fragment.getExitTransitionCallback()>
	//   76  143:astore_2        
				obj = ((Object) (((BackStackRecord) (obj)).mSharedElementSourceNames));
	//   77  144:aload_1         
	//   78  145:getfield        #205 <Field ArrayList BackStackRecord.mSharedElementSourceNames>
	//   79  148:astore_1        
			}
			arraymap1.retainAll(((Collection) (obj)));
			if(fragmentcontainertransition == null)
				break label0;
			((SharedElementCallback) (fragmentcontainertransition)).onMapSharedElements(((java.util.List) (obj)), ((java.util.Map) (arraymap1)));
			i = ((ArrayList) (obj)).size() - 1;
			do
			{
				fragmentcontainertransition = ((FragmentContainerTransition) (arraymap1));
				if(i < 0)
					break;
				obj1 = ((Object) ((String)((ArrayList) (obj)).get(i)));
				fragmentcontainertransition = ((FragmentContainerTransition) ((View)arraymap1.get(obj1)));
				if(fragmentcontainertransition == null)
					arraymap.remove(obj1);
				else
	//*  80  149:goto            67
				if(!((String) (obj1)).equals(((Object) (ViewCompat.getTransitionName(((View) (fragmentcontainertransition)))))))
	//*  81  152:aload           5
	//*  82  154:aload_2         
	//*  83  155:invokestatic    #70  <Method String ViewCompat.getTransitionName(View)>
	//*  84  158:invokevirtual   #286 <Method boolean String.equals(Object)>
	//*  85  161:ifne            131
				{
					obj1 = ((Object) ((String)arraymap.remove(obj1)));
	//   86  164:aload_0         
	//   87  165:aload           5
	//   88  167:invokevirtual   #214 <Method Object ArrayMap.remove(Object)>
	//   89  170:checkcast       #210 <Class String>
	//   90  173:astore          5
					arraymap.put(((Object) (ViewCompat.getTransitionName(((View) (fragmentcontainertransition))))), obj1);
	//   91  175:aload_0         
	//   92  176:aload_2         
	//   93  177:invokestatic    #70  <Method String ViewCompat.getTransitionName(View)>
	//   94  180:aload           5
	//   95  182:invokevirtual   #218 <Method Object ArrayMap.put(Object, Object)>
	//   96  185:pop             
				}
				i--;
			} while(true);
	//   97  186:goto            131
		}
		if(true) goto _L4; else goto _L3
_L3:
		arraymap.retainAll(((Collection) (arraymap1.keySet())));
	//   98  189:aload_0         
	//   99  190:aload           4
	//  100  192:invokevirtual   #297 <Method java.util.Set ArrayMap.keySet()>
	//  101  195:invokevirtual   #273 <Method boolean ArrayMap.retainAll(Collection)>
	//  102  198:pop             
		return arraymap1;
	//  103  199:aload           4
	//  104  201:areturn         
	}

	private static ArrayList configureEnteringExitingViews(Object obj, Fragment fragment, ArrayList arraylist, View view)
	{
		ArrayList arraylist1 = null;
	//    0    0:aconst_null     
	//    1    1:astore          4
		if(obj != null)
	//*   2    3:aload_0         
	//*   3    4:ifnull          71
		{
			ArrayList arraylist2 = new ArrayList();
	//    4    7:new             #78  <Class ArrayList>
	//    5   10:dup             
	//    6   11:invokespecial   #234 <Method void ArrayList()>
	//    7   14:astore          5
			fragment = ((Fragment) (fragment.getView()));
	//    8   16:aload_1         
	//    9   17:invokevirtual   #254 <Method View Fragment.getView()>
	//   10   20:astore_1        
			if(fragment != null)
	//*  11   21:aload_1         
	//*  12   22:ifnull          31
				FragmentTransitionCompat21.captureTransitioningViews(arraylist2, ((View) (fragment)));
	//   13   25:aload           5
	//   14   27:aload_1         
	//   15   28:invokestatic    #301 <Method void FragmentTransitionCompat21.captureTransitioningViews(ArrayList, View)>
			if(arraylist != null)
	//*  16   31:aload_2         
	//*  17   32:ifnull          42
				arraylist2.removeAll(((Collection) (arraylist)));
	//   18   35:aload           5
	//   19   37:aload_2         
	//   20   38:invokevirtual   #304 <Method boolean ArrayList.removeAll(Collection)>
	//   21   41:pop             
			arraylist1 = arraylist2;
	//   22   42:aload           5
	//   23   44:astore          4
			if(!arraylist2.isEmpty())
	//*  24   46:aload           5
	//*  25   48:invokevirtual   #305 <Method boolean ArrayList.isEmpty()>
	//*  26   51:ifne            71
			{
				arraylist2.add(((Object) (view)));
	//   27   54:aload           5
	//   28   56:aload_3         
	//   29   57:invokevirtual   #81  <Method boolean ArrayList.add(Object)>
	//   30   60:pop             
				FragmentTransitionCompat21.addTargets(obj, arraylist2);
	//   31   61:aload_0         
	//   32   62:aload           5
	//   33   64:invokestatic    #309 <Method void FragmentTransitionCompat21.addTargets(Object, ArrayList)>
				arraylist1 = arraylist2;
	//   34   67:aload           5
	//   35   69:astore          4
			}
		}
		return arraylist1;
	//   36   71:aload           4
	//   37   73:areturn         
	}

	private static Object configureSharedElementsOrdered(ViewGroup viewgroup, View view, ArrayMap arraymap, FragmentContainerTransition fragmentcontainertransition, ArrayList arraylist, ArrayList arraylist1, Object obj, Object obj1)
	{
		Fragment fragment = fragmentcontainertransition.lastIn;
	//    0    0:aload_3         
	//    1    1:getfield        #112 <Field Fragment FragmentTransition$FragmentContainerTransition.lastIn>
	//    2    4:astore          11
		Fragment fragment1 = fragmentcontainertransition.firstOut;
	//    3    6:aload_3         
	//    4    7:getfield        #123 <Field Fragment FragmentTransition$FragmentContainerTransition.firstOut>
	//    5   10:astore          12
		if(fragment == null || fragment1 == null)
	//*   6   12:aload           11
	//*   7   14:ifnull          22
	//*   8   17:aload           12
	//*   9   19:ifnonnull       24
			return ((Object) (null));
	//   10   22:aconst_null     
	//   11   23:areturn         
		boolean flag = fragmentcontainertransition.lastInIsPop;
	//   12   24:aload_3         
	//   13   25:getfield        #116 <Field boolean FragmentTransition$FragmentContainerTransition.lastInIsPop>
	//   14   28:istore          8
		Object obj2;
		ArrayMap arraymap1;
		if(arraymap.isEmpty())
	//*  15   30:aload_2         
	//*  16   31:invokevirtual   #257 <Method boolean ArrayMap.isEmpty()>
	//*  17   34:ifeq            76
			obj2 = null;
	//   18   37:aconst_null     
	//   19   38:astore          9
		else
	//*  20   40:aload_2         
	//*  21   41:aload           9
	//*  22   43:aload_3         
	//*  23   44:invokestatic    #314 <Method ArrayMap captureOutSharedElements(ArrayMap, Object, FragmentTransition$FragmentContainerTransition)>
	//*  24   47:astore          13
	//*  25   49:aload_2         
	//*  26   50:invokevirtual   #257 <Method boolean ArrayMap.isEmpty()>
	//*  27   53:ifeq            90
	//*  28   56:aconst_null     
	//*  29   57:astore          9
	//*  30   59:aload           6
	//*  31   61:ifnonnull       104
	//*  32   64:aload           7
	//*  33   66:ifnonnull       104
	//*  34   69:aload           9
	//*  35   71:ifnonnull       104
	//*  36   74:aconst_null     
	//*  37   75:areturn         
			obj2 = getSharedElementTransition(fragment, fragment1, flag);
	//   38   76:aload           11
	//   39   78:aload           12
	//   40   80:iload           8
	//   41   82:invokestatic    #318 <Method Object getSharedElementTransition(Fragment, Fragment, boolean)>
	//   42   85:astore          9
		arraymap1 = captureOutSharedElements(arraymap, obj2, fragmentcontainertransition);
		if(arraymap.isEmpty())
			obj2 = null;
		else
	//*  43   87:goto            40
			arraylist.addAll(arraymap1.values());
	//   44   90:aload           4
	//   45   92:aload           13
	//   46   94:invokevirtual   #322 <Method Collection ArrayMap.values()>
	//   47   97:invokevirtual   #325 <Method boolean ArrayList.addAll(Collection)>
	//   48  100:pop             
		if(obj == null && obj1 == null && obj2 == null)
			return ((Object) (null));
	//*  49  101:goto            59
		callSharedElementStartEnd(fragment, fragment1, flag, arraymap1, true);
	//   50  104:aload           11
	//   51  106:aload           12
	//   52  108:iload           8
	//   53  110:aload           13
	//   54  112:iconst_1        
	//   55  113:invokestatic    #40  <Method void callSharedElementStartEnd(Fragment, Fragment, boolean, ArrayMap, boolean)>
		if(obj2 != null)
	//*  56  116:aload           9
	//*  57  118:ifnull          209
		{
			Rect rect = new Rect();
	//   58  121:new             #327 <Class Rect>
	//   59  124:dup             
	//   60  125:invokespecial   #328 <Method void Rect()>
	//   61  128:astore          10
			FragmentTransitionCompat21.setSharedElementTargets(obj2, view, arraylist);
	//   62  130:aload           9
	//   63  132:aload_1         
	//   64  133:aload           4
	//   65  135:invokestatic    #332 <Method void FragmentTransitionCompat21.setSharedElementTargets(Object, View, ArrayList)>
			setOutEpicenter(obj2, obj1, arraymap1, fragmentcontainertransition.firstOutIsPop, fragmentcontainertransition.firstOutTransaction);
	//   66  138:aload           9
	//   67  140:aload           7
	//   68  142:aload           13
	//   69  144:aload_3         
	//   70  145:getfield        #151 <Field boolean FragmentTransition$FragmentContainerTransition.firstOutIsPop>
	//   71  148:aload_3         
	//   72  149:getfield        #154 <Field BackStackRecord FragmentTransition$FragmentContainerTransition.firstOutTransaction>
	//   73  152:invokestatic    #336 <Method void setOutEpicenter(Object, Object, ArrayMap, boolean, BackStackRecord)>
			obj1 = ((Object) (rect));
	//   74  155:aload           10
	//   75  157:astore          7
			if(obj != null)
	//*  76  159:aload           6
	//*  77  161:ifnull          175
			{
				FragmentTransitionCompat21.setEpicenter(obj, rect);
	//   78  164:aload           6
	//   79  166:aload           10
	//   80  168:invokestatic    #340 <Method void FragmentTransitionCompat21.setEpicenter(Object, Rect)>
				obj1 = ((Object) (rect));
	//   81  171:aload           10
	//   82  173:astore          7
			}
		} else
	//*  83  175:aload_0         
	//*  84  176:new             #12  <Class FragmentTransition$4>
	//*  85  179:dup             
	//*  86  180:aload_2         
	//*  87  181:aload           9
	//*  88  183:aload_3         
	//*  89  184:aload           5
	//*  90  186:aload_1         
	//*  91  187:aload           11
	//*  92  189:aload           12
	//*  93  191:iload           8
	//*  94  193:aload           4
	//*  95  195:aload           6
	//*  96  197:aload           7
	//*  97  199:invokespecial   #343 <Method void FragmentTransition$4(ArrayMap, Object, FragmentTransition$FragmentContainerTransition, ArrayList, View, Fragment, Fragment, boolean, ArrayList, Object, Rect)>
	//*  98  202:invokestatic    #348 <Method OneShotPreDrawListener OneShotPreDrawListener.add(View, Runnable)>
	//*  99  205:pop             
	//* 100  206:aload           9
	//* 101  208:areturn         
		{
			obj1 = null;
	//  102  209:aconst_null     
	//  103  210:astore          7
		}
		OneShotPreDrawListener.add(((View) (viewgroup)), new Runnable(arraymap, obj2, fragmentcontainertransition, arraylist1, view, fragment, fragment1, flag, arraylist, obj, ((Rect) (obj1))) {

			public void run()
			{
				Object obj3 = ((Object) (FragmentTransition.captureInSharedElements(nameOverrides, finalSharedElementTransition, fragments)));
			//    0    0:aload_0         
			//    1    1:getfield        #34  <Field ArrayMap val$nameOverrides>
			//    2    4:aload_0         
			//    3    5:getfield        #36  <Field Object val$finalSharedElementTransition>
			//    4    8:aload_0         
			//    5    9:getfield        #38  <Field FragmentTransition$FragmentContainerTransition val$fragments>
			//    6   12:invokestatic    #63  <Method ArrayMap FragmentTransition.access$300(ArrayMap, Object, FragmentTransition$FragmentContainerTransition)>
			//    7   15:astore_1        
				if(obj3 != null)
			//*   8   16:aload_1         
			//*   9   17:ifnull          44
				{
					sharedElementsIn.addAll(((ArrayMap) (obj3)).values());
			//   10   20:aload_0         
			//   11   21:getfield        #40  <Field ArrayList val$sharedElementsIn>
			//   12   24:aload_1         
			//   13   25:invokevirtual   #69  <Method Collection ArrayMap.values()>
			//   14   28:invokevirtual   #75  <Method boolean ArrayList.addAll(Collection)>
			//   15   31:pop             
					sharedElementsIn.add(((Object) (nonExistentView)));
			//   16   32:aload_0         
			//   17   33:getfield        #40  <Field ArrayList val$sharedElementsIn>
			//   18   36:aload_0         
			//   19   37:getfield        #42  <Field View val$nonExistentView>
			//   20   40:invokevirtual   #79  <Method boolean ArrayList.add(Object)>
			//   21   43:pop             
				}
				FragmentTransition.callSharedElementStartEnd(inFragment, outFragment, inIsPop, ((ArrayMap) (obj3)), false);
			//   22   44:aload_0         
			//   23   45:getfield        #44  <Field Fragment val$inFragment>
			//   24   48:aload_0         
			//   25   49:getfield        #46  <Field Fragment val$outFragment>
			//   26   52:aload_0         
			//   27   53:getfield        #48  <Field boolean val$inIsPop>
			//   28   56:aload_1         
			//   29   57:iconst_0        
			//   30   58:invokestatic    #83  <Method void FragmentTransition.access$200(Fragment, Fragment, boolean, ArrayMap, boolean)>
				if(finalSharedElementTransition != null)
			//*  31   61:aload_0         
			//*  32   62:getfield        #36  <Field Object val$finalSharedElementTransition>
			//*  33   65:ifnull          112
				{
					FragmentTransitionCompat21.swapSharedElementTargets(finalSharedElementTransition, sharedElementsOut, sharedElementsIn);
			//   34   68:aload_0         
			//   35   69:getfield        #36  <Field Object val$finalSharedElementTransition>
			//   36   72:aload_0         
			//   37   73:getfield        #50  <Field ArrayList val$sharedElementsOut>
			//   38   76:aload_0         
			//   39   77:getfield        #40  <Field ArrayList val$sharedElementsIn>
			//   40   80:invokestatic    #89  <Method void FragmentTransitionCompat21.swapSharedElementTargets(Object, ArrayList, ArrayList)>
					obj3 = ((Object) (FragmentTransition.getInEpicenterView(((ArrayMap) (obj3)), fragments, enterTransition, inIsPop)));
			//   41   83:aload_1         
			//   42   84:aload_0         
			//   43   85:getfield        #38  <Field FragmentTransition$FragmentContainerTransition val$fragments>
			//   44   88:aload_0         
			//   45   89:getfield        #52  <Field Object val$enterTransition>
			//   46   92:aload_0         
			//   47   93:getfield        #48  <Field boolean val$inIsPop>
			//   48   96:invokestatic    #93  <Method View FragmentTransition.access$400(ArrayMap, FragmentTransition$FragmentContainerTransition, Object, boolean)>
			//   49   99:astore_1        
					if(obj3 != null)
			//*  50  100:aload_1         
			//*  51  101:ifnull          112
						FragmentTransitionCompat21.getBoundsOnScreen(((View) (obj3)), inEpicenter);
			//   52  104:aload_1         
			//   53  105:aload_0         
			//   54  106:getfield        #54  <Field Rect val$inEpicenter>
			//   55  109:invokestatic    #97  <Method void FragmentTransitionCompat21.getBoundsOnScreen(View, Rect)>
				}
			//   56  112:return          
			}

			final Object val$enterTransition;
			final Object val$finalSharedElementTransition;
			final FragmentContainerTransition val$fragments;
			final Rect val$inEpicenter;
			final Fragment val$inFragment;
			final boolean val$inIsPop;
			final ArrayMap val$nameOverrides;
			final View val$nonExistentView;
			final Fragment val$outFragment;
			final ArrayList val$sharedElementsIn;
			final ArrayList val$sharedElementsOut;

			
			{
				nameOverrides = arraymap;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #34  <Field ArrayMap val$nameOverrides>
				finalSharedElementTransition = obj;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #36  <Field Object val$finalSharedElementTransition>
				fragments = fragmentcontainertransition;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #38  <Field FragmentTransition$FragmentContainerTransition val$fragments>
				sharedElementsIn = arraylist;
			//    9   15:aload_0         
			//   10   16:aload           4
			//   11   18:putfield        #40  <Field ArrayList val$sharedElementsIn>
				nonExistentView = view;
			//   12   21:aload_0         
			//   13   22:aload           5
			//   14   24:putfield        #42  <Field View val$nonExistentView>
				inFragment = fragment;
			//   15   27:aload_0         
			//   16   28:aload           6
			//   17   30:putfield        #44  <Field Fragment val$inFragment>
				outFragment = fragment1;
			//   18   33:aload_0         
			//   19   34:aload           7
			//   20   36:putfield        #46  <Field Fragment val$outFragment>
				inIsPop = flag;
			//   21   39:aload_0         
			//   22   40:iload           8
			//   23   42:putfield        #48  <Field boolean val$inIsPop>
				sharedElementsOut = arraylist1;
			//   24   45:aload_0         
			//   25   46:aload           9
			//   26   48:putfield        #50  <Field ArrayList val$sharedElementsOut>
				enterTransition = obj1;
			//   27   51:aload_0         
			//   28   52:aload           10
			//   29   54:putfield        #52  <Field Object val$enterTransition>
				inEpicenter = rect;
			//   30   57:aload_0         
			//   31   58:aload           11
			//   32   60:putfield        #54  <Field Rect val$inEpicenter>
				super();
			//   33   63:aload_0         
			//   34   64:invokespecial   #57  <Method void Object()>
			//   35   67:return          
			}
		}
);
		return obj2;
	//* 104  212:goto            175
	}

	private static Object configureSharedElementsReordered(ViewGroup viewgroup, View view, ArrayMap arraymap, FragmentContainerTransition fragmentcontainertransition, ArrayList arraylist, ArrayList arraylist1, Object obj, Object obj1)
	{
		Fragment fragment = fragmentcontainertransition.lastIn;
	//    0    0:aload_3         
	//    1    1:getfield        #112 <Field Fragment FragmentTransition$FragmentContainerTransition.lastIn>
	//    2    4:astore          10
		Fragment fragment1 = fragmentcontainertransition.firstOut;
	//    3    6:aload_3         
	//    4    7:getfield        #123 <Field Fragment FragmentTransition$FragmentContainerTransition.firstOut>
	//    5   10:astore          11
		if(fragment != null)
	//*   6   12:aload           10
	//*   7   14:ifnull          26
			fragment.getView().setVisibility(0);
	//    8   17:aload           10
	//    9   19:invokevirtual   #254 <Method View Fragment.getView()>
	//   10   22:iconst_0        
	//   11   23:invokevirtual   #354 <Method void View.setVisibility(int)>
		if(fragment == null || fragment1 == null)
	//*  12   26:aload           10
	//*  13   28:ifnull          36
	//*  14   31:aload           11
	//*  15   33:ifnonnull       38
			return ((Object) (null));
	//   16   36:aconst_null     
	//   17   37:areturn         
		boolean flag = fragmentcontainertransition.lastInIsPop;
	//   18   38:aload_3         
	//   19   39:getfield        #116 <Field boolean FragmentTransition$FragmentContainerTransition.lastInIsPop>
	//   20   42:istore          8
		Object obj2;
		ArrayMap arraymap1;
		ArrayMap arraymap2;
		if(arraymap.isEmpty())
	//*  21   44:aload_2         
	//*  22   45:invokevirtual   #257 <Method boolean ArrayMap.isEmpty()>
	//*  23   48:ifeq            124
			obj2 = null;
	//   24   51:aconst_null     
	//   25   52:astore          9
		else
	//*  26   54:aload_2         
	//*  27   55:aload           9
	//*  28   57:aload_3         
	//*  29   58:invokestatic    #314 <Method ArrayMap captureOutSharedElements(ArrayMap, Object, FragmentTransition$FragmentContainerTransition)>
	//*  30   61:astore          13
	//*  31   63:aload_2         
	//*  32   64:aload           9
	//*  33   66:aload_3         
	//*  34   67:invokestatic    #45  <Method ArrayMap captureInSharedElements(ArrayMap, Object, FragmentTransition$FragmentContainerTransition)>
	//*  35   70:astore          12
	//*  36   72:aload_2         
	//*  37   73:invokevirtual   #257 <Method boolean ArrayMap.isEmpty()>
	//*  38   76:ifeq            138
	//*  39   79:aconst_null     
	//*  40   80:astore_2        
	//*  41   81:aload           13
	//*  42   83:ifnull          91
	//*  43   86:aload           13
	//*  44   88:invokevirtual   #260 <Method void ArrayMap.clear()>
	//*  45   91:aload_2         
	//*  46   92:astore          9
	//*  47   94:aload           12
	//*  48   96:ifnull          107
	//*  49   99:aload           12
	//*  50  101:invokevirtual   #260 <Method void ArrayMap.clear()>
	//*  51  104:aload_2         
	//*  52  105:astore          9
	//*  53  107:aload           6
	//*  54  109:ifnonnull       163
	//*  55  112:aload           7
	//*  56  114:ifnonnull       163
	//*  57  117:aload           9
	//*  58  119:ifnonnull       163
	//*  59  122:aconst_null     
	//*  60  123:areturn         
			obj2 = getSharedElementTransition(fragment, fragment1, flag);
	//   61  124:aload           10
	//   62  126:aload           11
	//   63  128:iload           8
	//   64  130:invokestatic    #318 <Method Object getSharedElementTransition(Fragment, Fragment, boolean)>
	//   65  133:astore          9
		arraymap2 = captureOutSharedElements(arraymap, obj2, fragmentcontainertransition);
		arraymap1 = captureInSharedElements(arraymap, obj2, fragmentcontainertransition);
		if(arraymap.isEmpty())
		{
			arraymap = null;
			if(arraymap2 != null)
				arraymap2.clear();
			obj2 = ((Object) (arraymap));
			if(arraymap1 != null)
			{
				arraymap1.clear();
				obj2 = ((Object) (arraymap));
			}
		} else
	//*  66  135:goto            54
		{
			addSharedElementsWithMatchingNames(arraylist, arraymap2, ((Collection) (arraymap.keySet())));
	//   67  138:aload           4
	//   68  140:aload           13
	//   69  142:aload_2         
	//   70  143:invokevirtual   #297 <Method java.util.Set ArrayMap.keySet()>
	//   71  146:invokestatic    #356 <Method void addSharedElementsWithMatchingNames(ArrayList, ArrayMap, Collection)>
			addSharedElementsWithMatchingNames(arraylist1, arraymap1, arraymap.values());
	//   72  149:aload           5
	//   73  151:aload           12
	//   74  153:aload_2         
	//   75  154:invokevirtual   #322 <Method Collection ArrayMap.values()>
	//   76  157:invokestatic    #356 <Method void addSharedElementsWithMatchingNames(ArrayList, ArrayMap, Collection)>
		}
		if(obj == null && obj1 == null && obj2 == null)
			return ((Object) (null));
	//*  77  160:goto            107
		callSharedElementStartEnd(fragment, fragment1, flag, arraymap2, true);
	//   78  163:aload           10
	//   79  165:aload           11
	//   80  167:iload           8
	//   81  169:aload           13
	//   82  171:iconst_1        
	//   83  172:invokestatic    #40  <Method void callSharedElementStartEnd(Fragment, Fragment, boolean, ArrayMap, boolean)>
		if(obj2 != null)
	//*  84  175:aload           9
	//*  85  177:ifnull          278
		{
			arraylist1.add(((Object) (view)));
	//   86  180:aload           5
	//   87  182:aload_1         
	//   88  183:invokevirtual   #81  <Method boolean ArrayList.add(Object)>
	//   89  186:pop             
			FragmentTransitionCompat21.setSharedElementTargets(obj2, view, arraylist);
	//   90  187:aload           9
	//   91  189:aload_1         
	//   92  190:aload           4
	//   93  192:invokestatic    #332 <Method void FragmentTransitionCompat21.setSharedElementTargets(Object, View, ArrayList)>
			setOutEpicenter(obj2, obj1, arraymap2, fragmentcontainertransition.firstOutIsPop, fragmentcontainertransition.firstOutTransaction);
	//   94  195:aload           9
	//   95  197:aload           7
	//   96  199:aload           13
	//   97  201:aload_3         
	//   98  202:getfield        #151 <Field boolean FragmentTransition$FragmentContainerTransition.firstOutIsPop>
	//   99  205:aload_3         
	//  100  206:getfield        #154 <Field BackStackRecord FragmentTransition$FragmentContainerTransition.firstOutTransaction>
	//  101  209:invokestatic    #336 <Method void setOutEpicenter(Object, Object, ArrayMap, boolean, BackStackRecord)>
			arraylist = ((ArrayList) (new Rect()));
	//  102  212:new             #327 <Class Rect>
	//  103  215:dup             
	//  104  216:invokespecial   #328 <Method void Rect()>
	//  105  219:astore          4
			fragmentcontainertransition = ((FragmentContainerTransition) (getInEpicenterView(arraymap1, fragmentcontainertransition, obj, flag)));
	//  106  221:aload           12
	//  107  223:aload_3         
	//  108  224:aload           6
	//  109  226:iload           8
	//  110  228:invokestatic    #50  <Method View getInEpicenterView(ArrayMap, FragmentTransition$FragmentContainerTransition, Object, boolean)>
	//  111  231:astore_3        
			view = ((View) (fragmentcontainertransition));
	//  112  232:aload_3         
	//  113  233:astore_1        
			arraymap = ((ArrayMap) (arraylist));
	//  114  234:aload           4
	//  115  236:astore_2        
			if(fragmentcontainertransition != null)
	//* 116  237:aload_3         
	//* 117  238:ifnull          253
			{
				FragmentTransitionCompat21.setEpicenter(obj, ((Rect) (arraylist)));
	//  118  241:aload           6
	//  119  243:aload           4
	//  120  245:invokestatic    #340 <Method void FragmentTransitionCompat21.setEpicenter(Object, Rect)>
				arraymap = ((ArrayMap) (arraylist));
	//  121  248:aload           4
	//  122  250:astore_2        
				view = ((View) (fragmentcontainertransition));
	//  123  251:aload_3         
	//  124  252:astore_1        
			}
		} else
	//* 125  253:aload_0         
	//* 126  254:new             #10  <Class FragmentTransition$3>
	//* 127  257:dup             
	//* 128  258:aload           10
	//* 129  260:aload           11
	//* 130  262:iload           8
	//* 131  264:aload           12
	//* 132  266:aload_1         
	//* 133  267:aload_2         
	//* 134  268:invokespecial   #359 <Method void FragmentTransition$3(Fragment, Fragment, boolean, ArrayMap, View, Rect)>
	//* 135  271:invokestatic    #348 <Method OneShotPreDrawListener OneShotPreDrawListener.add(View, Runnable)>
	//* 136  274:pop             
	//* 137  275:aload           9
	//* 138  277:areturn         
		{
			arraymap = null;
	//  139  278:aconst_null     
	//  140  279:astore_2        
			view = null;
	//  141  280:aconst_null     
	//  142  281:astore_1        
		}
		OneShotPreDrawListener.add(((View) (viewgroup)), new Runnable(fragment, fragment1, flag, arraymap1, view, ((Rect) (arraymap))) {

			public void run()
			{
				FragmentTransition.callSharedElementStartEnd(inFragment, outFragment, inIsPop, inSharedElements, false);
			//    0    0:aload_0         
			//    1    1:getfield        #26  <Field Fragment val$inFragment>
			//    2    4:aload_0         
			//    3    5:getfield        #28  <Field Fragment val$outFragment>
			//    4    8:aload_0         
			//    5    9:getfield        #30  <Field boolean val$inIsPop>
			//    6   12:aload_0         
			//    7   13:getfield        #32  <Field ArrayMap val$inSharedElements>
			//    8   16:iconst_0        
			//    9   17:invokestatic    #45  <Method void FragmentTransition.access$200(Fragment, Fragment, boolean, ArrayMap, boolean)>
				if(epicenterView != null)
			//*  10   20:aload_0         
			//*  11   21:getfield        #34  <Field View val$epicenterView>
			//*  12   24:ifnull          38
					FragmentTransitionCompat21.getBoundsOnScreen(epicenterView, epicenter);
			//   13   27:aload_0         
			//   14   28:getfield        #34  <Field View val$epicenterView>
			//   15   31:aload_0         
			//   16   32:getfield        #36  <Field Rect val$epicenter>
			//   17   35:invokestatic    #51  <Method void FragmentTransitionCompat21.getBoundsOnScreen(View, Rect)>
			//   18   38:return          
			}

			final Rect val$epicenter;
			final View val$epicenterView;
			final Fragment val$inFragment;
			final boolean val$inIsPop;
			final ArrayMap val$inSharedElements;
			final Fragment val$outFragment;

			
			{
				inFragment = fragment;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #26  <Field Fragment val$inFragment>
				outFragment = fragment1;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #28  <Field Fragment val$outFragment>
				inIsPop = flag;
			//    6   10:aload_0         
			//    7   11:iload_3         
			//    8   12:putfield        #30  <Field boolean val$inIsPop>
				inSharedElements = arraymap;
			//    9   15:aload_0         
			//   10   16:aload           4
			//   11   18:putfield        #32  <Field ArrayMap val$inSharedElements>
				epicenterView = view;
			//   12   21:aload_0         
			//   13   22:aload           5
			//   14   24:putfield        #34  <Field View val$epicenterView>
				epicenter = rect;
			//   15   27:aload_0         
			//   16   28:aload           6
			//   17   30:putfield        #36  <Field Rect val$epicenter>
				super();
			//   18   33:aload_0         
			//   19   34:invokespecial   #39  <Method void Object()>
			//   20   37:return          
			}
		}
);
		return obj2;
	//* 143  282:goto            253
	}

	private static void configureTransitionsOrdered(FragmentManagerImpl fragmentmanagerimpl, int i, FragmentContainerTransition fragmentcontainertransition, View view, ArrayMap arraymap)
	{
		ViewGroup viewgroup = null;
	//    0    0:aconst_null     
	//    1    1:astore          7
		if(fragmentmanagerimpl.mContainer.onHasView())
	//*   2    3:aload_0         
	//*   3    4:getfield        #224 <Field FragmentContainer FragmentManagerImpl.mContainer>
	//*   4    7:invokevirtual   #229 <Method boolean FragmentContainer.onHasView()>
	//*   5   10:ifeq            26
			viewgroup = (ViewGroup)fragmentmanagerimpl.mContainer.onFindViewById(i);
	//    6   13:aload_0         
	//    7   14:getfield        #224 <Field FragmentContainer FragmentManagerImpl.mContainer>
	//    8   17:iload_1         
	//    9   18:invokevirtual   #365 <Method View FragmentContainer.onFindViewById(int)>
	//   10   21:checkcast       #367 <Class ViewGroup>
	//   11   24:astore          7
		if(viewgroup != null)
	//*  12   26:aload           7
	//*  13   28:ifnonnull       32
	//*  14   31:return          
		{
			Fragment fragment = fragmentcontainertransition.lastIn;
	//   15   32:aload_2         
	//   16   33:getfield        #112 <Field Fragment FragmentTransition$FragmentContainerTransition.lastIn>
	//   17   36:astore          8
			Object obj2 = ((Object) (fragmentcontainertransition.firstOut));
	//   18   38:aload_2         
	//   19   39:getfield        #123 <Field Fragment FragmentTransition$FragmentContainerTransition.firstOut>
	//   20   42:astore          12
			boolean flag = fragmentcontainertransition.lastInIsPop;
	//   21   44:aload_2         
	//   22   45:getfield        #116 <Field boolean FragmentTransition$FragmentContainerTransition.lastInIsPop>
	//   23   48:istore          5
			boolean flag1 = fragmentcontainertransition.firstOutIsPop;
	//   24   50:aload_2         
	//   25   51:getfield        #151 <Field boolean FragmentTransition$FragmentContainerTransition.firstOutIsPop>
	//   26   54:istore          6
			Object obj = getEnterTransition(fragment, flag);
	//   27   56:aload           8
	//   28   58:iload           5
	//   29   60:invokestatic    #371 <Method Object getEnterTransition(Fragment, boolean)>
	//   30   63:astore          9
			fragmentmanagerimpl = ((FragmentManagerImpl) (getExitTransition(((Fragment) (obj2)), flag1)));
	//   31   65:aload           12
	//   32   67:iload           6
	//   33   69:invokestatic    #374 <Method Object getExitTransition(Fragment, boolean)>
	//   34   72:astore_0        
			ArrayList arraylist1 = new ArrayList();
	//   35   73:new             #78  <Class ArrayList>
	//   36   76:dup             
	//   37   77:invokespecial   #234 <Method void ArrayList()>
	//   38   80:astore          13
			ArrayList arraylist = new ArrayList();
	//   39   82:new             #78  <Class ArrayList>
	//   40   85:dup             
	//   41   86:invokespecial   #234 <Method void ArrayList()>
	//   42   89:astore          10
			Object obj1 = configureSharedElementsOrdered(viewgroup, view, arraymap, fragmentcontainertransition, arraylist1, arraylist, obj, ((Object) (fragmentmanagerimpl)));
	//   43   91:aload           7
	//   44   93:aload_3         
	//   45   94:aload           4
	//   46   96:aload_2         
	//   47   97:aload           13
	//   48   99:aload           10
	//   49  101:aload           9
	//   50  103:aload_0         
	//   51  104:invokestatic    #376 <Method Object configureSharedElementsOrdered(ViewGroup, View, ArrayMap, FragmentTransition$FragmentContainerTransition, ArrayList, ArrayList, Object, Object)>
	//   52  107:astore          11
			if(obj != null || obj1 != null || fragmentmanagerimpl != null)
	//*  53  109:aload           9
	//*  54  111:ifnonnull       123
	//*  55  114:aload           11
	//*  56  116:ifnonnull       123
	//*  57  119:aload_0         
	//*  58  120:ifnull          31
			{
				obj2 = ((Object) (configureEnteringExitingViews(((Object) (fragmentmanagerimpl)), ((Fragment) (obj2)), arraylist1, view)));
	//   59  123:aload_0         
	//   60  124:aload           12
	//   61  126:aload           13
	//   62  128:aload_3         
	//   63  129:invokestatic    #35  <Method ArrayList configureEnteringExitingViews(Object, Fragment, ArrayList, View)>
	//   64  132:astore          12
				if(obj2 == null || ((ArrayList) (obj2)).isEmpty())
	//*  65  134:aload           12
	//*  66  136:ifnull          147
	//*  67  139:aload           12
	//*  68  141:invokevirtual   #305 <Method boolean ArrayList.isEmpty()>
	//*  69  144:ifeq            149
					fragmentmanagerimpl = null;
	//   70  147:aconst_null     
	//   71  148:astore_0        
				FragmentTransitionCompat21.addTarget(obj, view);
	//   72  149:aload           9
	//   73  151:aload_3         
	//   74  152:invokestatic    #380 <Method void FragmentTransitionCompat21.addTarget(Object, View)>
				fragmentcontainertransition = ((FragmentContainerTransition) (mergeTransitions(obj, ((Object) (fragmentmanagerimpl)), obj1, fragment, fragmentcontainertransition.lastInIsPop)));
	//   75  155:aload           9
	//   76  157:aload_0         
	//   77  158:aload           11
	//   78  160:aload           8
	//   79  162:aload_2         
	//   80  163:getfield        #116 <Field boolean FragmentTransition$FragmentContainerTransition.lastInIsPop>
	//   81  166:invokestatic    #384 <Method Object mergeTransitions(Object, Object, Object, Fragment, boolean)>
	//   82  169:astore_2        
				if(fragmentcontainertransition != null)
	//*  83  170:aload_2         
	//*  84  171:ifnull          31
				{
					ArrayList arraylist2 = new ArrayList();
	//   85  174:new             #78  <Class ArrayList>
	//   86  177:dup             
	//   87  178:invokespecial   #234 <Method void ArrayList()>
	//   88  181:astore          13
					FragmentTransitionCompat21.scheduleRemoveTargets(((Object) (fragmentcontainertransition)), obj, arraylist2, ((Object) (fragmentmanagerimpl)), ((ArrayList) (obj2)), obj1, arraylist);
	//   89  183:aload_2         
	//   90  184:aload           9
	//   91  186:aload           13
	//   92  188:aload_0         
	//   93  189:aload           12
	//   94  191:aload           11
	//   95  193:aload           10
	//   96  195:invokestatic    #388 <Method void FragmentTransitionCompat21.scheduleRemoveTargets(Object, Object, ArrayList, Object, ArrayList, Object, ArrayList)>
					scheduleTargetChange(viewgroup, fragment, view, arraylist, obj, arraylist2, ((Object) (fragmentmanagerimpl)), ((ArrayList) (obj2)));
	//   97  198:aload           7
	//   98  200:aload           8
	//   99  202:aload_3         
	//  100  203:aload           10
	//  101  205:aload           9
	//  102  207:aload           13
	//  103  209:aload_0         
	//  104  210:aload           12
	//  105  212:invokestatic    #392 <Method void scheduleTargetChange(ViewGroup, Fragment, View, ArrayList, Object, ArrayList, Object, ArrayList)>
					FragmentTransitionCompat21.setNameOverridesOrdered(((View) (viewgroup)), arraylist, ((java.util.Map) (arraymap)));
	//  106  215:aload           7
	//  107  217:aload           10
	//  108  219:aload           4
	//  109  221:invokestatic    #396 <Method void FragmentTransitionCompat21.setNameOverridesOrdered(View, ArrayList, java.util.Map)>
					FragmentTransitionCompat21.beginDelayedTransition(viewgroup, ((Object) (fragmentcontainertransition)));
	//  110  224:aload           7
	//  111  226:aload_2         
	//  112  227:invokestatic    #400 <Method void FragmentTransitionCompat21.beginDelayedTransition(ViewGroup, Object)>
					FragmentTransitionCompat21.scheduleNameReset(viewgroup, arraylist, ((java.util.Map) (arraymap)));
	//  113  230:aload           7
	//  114  232:aload           10
	//  115  234:aload           4
	//  116  236:invokestatic    #404 <Method void FragmentTransitionCompat21.scheduleNameReset(ViewGroup, ArrayList, java.util.Map)>
					return;
	//  117  239:return          
				}
			}
		}
	}

	private static void configureTransitionsReordered(FragmentManagerImpl fragmentmanagerimpl, int i, FragmentContainerTransition fragmentcontainertransition, View view, ArrayMap arraymap)
	{
		ViewGroup viewgroup = null;
	//    0    0:aconst_null     
	//    1    1:astore          7
		if(fragmentmanagerimpl.mContainer.onHasView())
	//*   2    3:aload_0         
	//*   3    4:getfield        #224 <Field FragmentContainer FragmentManagerImpl.mContainer>
	//*   4    7:invokevirtual   #229 <Method boolean FragmentContainer.onHasView()>
	//*   5   10:ifeq            26
			viewgroup = (ViewGroup)fragmentmanagerimpl.mContainer.onFindViewById(i);
	//    6   13:aload_0         
	//    7   14:getfield        #224 <Field FragmentContainer FragmentManagerImpl.mContainer>
	//    8   17:iload_1         
	//    9   18:invokevirtual   #365 <Method View FragmentContainer.onFindViewById(int)>
	//   10   21:checkcast       #367 <Class ViewGroup>
	//   11   24:astore          7
		if(viewgroup != null)
	//*  12   26:aload           7
	//*  13   28:ifnonnull       32
	//*  14   31:return          
		{
			Object obj3 = ((Object) (fragmentcontainertransition.lastIn));
	//   15   32:aload_2         
	//   16   33:getfield        #112 <Field Fragment FragmentTransition$FragmentContainerTransition.lastIn>
	//   17   36:astore          13
			Object obj2 = ((Object) (fragmentcontainertransition.firstOut));
	//   18   38:aload_2         
	//   19   39:getfield        #123 <Field Fragment FragmentTransition$FragmentContainerTransition.firstOut>
	//   20   42:astore          11
			boolean flag = fragmentcontainertransition.lastInIsPop;
	//   21   44:aload_2         
	//   22   45:getfield        #116 <Field boolean FragmentTransition$FragmentContainerTransition.lastInIsPop>
	//   23   48:istore          5
			boolean flag1 = fragmentcontainertransition.firstOutIsPop;
	//   24   50:aload_2         
	//   25   51:getfield        #151 <Field boolean FragmentTransition$FragmentContainerTransition.firstOutIsPop>
	//   26   54:istore          6
			fragmentmanagerimpl = ((FragmentManagerImpl) (new ArrayList()));
	//   27   56:new             #78  <Class ArrayList>
	//   28   59:dup             
	//   29   60:invokespecial   #234 <Method void ArrayList()>
	//   30   63:astore_0        
			ArrayList arraylist = new ArrayList();
	//   31   64:new             #78  <Class ArrayList>
	//   32   67:dup             
	//   33   68:invokespecial   #234 <Method void ArrayList()>
	//   34   71:astore          8
			Object obj = getEnterTransition(((Fragment) (obj3)), flag);
	//   35   73:aload           13
	//   36   75:iload           5
	//   37   77:invokestatic    #371 <Method Object getEnterTransition(Fragment, boolean)>
	//   38   80:astore          9
			Object obj1 = getExitTransition(((Fragment) (obj2)), flag1);
	//   39   82:aload           11
	//   40   84:iload           6
	//   41   86:invokestatic    #374 <Method Object getExitTransition(Fragment, boolean)>
	//   42   89:astore          10
			fragmentcontainertransition = ((FragmentContainerTransition) (configureSharedElementsReordered(viewgroup, view, arraymap, fragmentcontainertransition, arraylist, ((ArrayList) (fragmentmanagerimpl)), obj, obj1)));
	//   43   91:aload           7
	//   44   93:aload_3         
	//   45   94:aload           4
	//   46   96:aload_2         
	//   47   97:aload           8
	//   48   99:aload_0         
	//   49  100:aload           9
	//   50  102:aload           10
	//   51  104:invokestatic    #408 <Method Object configureSharedElementsReordered(ViewGroup, View, ArrayMap, FragmentTransition$FragmentContainerTransition, ArrayList, ArrayList, Object, Object)>
	//   52  107:astore_2        
			if(obj != null || fragmentcontainertransition != null || obj1 != null)
	//*  53  108:aload           9
	//*  54  110:ifnonnull       122
	//*  55  113:aload_2         
	//*  56  114:ifnonnull       122
	//*  57  117:aload           10
	//*  58  119:ifnull          31
			{
				ArrayList arraylist1 = configureEnteringExitingViews(obj1, ((Fragment) (obj2)), arraylist, view);
	//   59  122:aload           10
	//   60  124:aload           11
	//   61  126:aload           8
	//   62  128:aload_3         
	//   63  129:invokestatic    #35  <Method ArrayList configureEnteringExitingViews(Object, Fragment, ArrayList, View)>
	//   64  132:astore          12
				view = ((View) (configureEnteringExitingViews(obj, ((Fragment) (obj3)), ((ArrayList) (fragmentmanagerimpl)), view)));
	//   65  134:aload           9
	//   66  136:aload           13
	//   67  138:aload_0         
	//   68  139:aload_3         
	//   69  140:invokestatic    #35  <Method ArrayList configureEnteringExitingViews(Object, Fragment, ArrayList, View)>
	//   70  143:astore_3        
				setViewVisibility(((ArrayList) (view)), 4);
	//   71  144:aload_3         
	//   72  145:iconst_4        
	//   73  146:invokestatic    #30  <Method void setViewVisibility(ArrayList, int)>
				obj3 = mergeTransitions(obj, obj1, ((Object) (fragmentcontainertransition)), ((Fragment) (obj3)), flag);
	//   74  149:aload           9
	//   75  151:aload           10
	//   76  153:aload_2         
	//   77  154:aload           13
	//   78  156:iload           5
	//   79  158:invokestatic    #384 <Method Object mergeTransitions(Object, Object, Object, Fragment, boolean)>
	//   80  161:astore          13
				if(obj3 != null)
	//*  81  163:aload           13
	//*  82  165:ifnull          31
				{
					replaceHide(obj1, ((Fragment) (obj2)), arraylist1);
	//   83  168:aload           10
	//   84  170:aload           11
	//   85  172:aload           12
	//   86  174:invokestatic    #412 <Method void replaceHide(Object, Fragment, ArrayList)>
					obj2 = ((Object) (FragmentTransitionCompat21.prepareSetNameOverridesReordered(((ArrayList) (fragmentmanagerimpl)))));
	//   87  177:aload_0         
	//   88  178:invokestatic    #416 <Method ArrayList FragmentTransitionCompat21.prepareSetNameOverridesReordered(ArrayList)>
	//   89  181:astore          11
					FragmentTransitionCompat21.scheduleRemoveTargets(obj3, obj, ((ArrayList) (view)), obj1, arraylist1, ((Object) (fragmentcontainertransition)), ((ArrayList) (fragmentmanagerimpl)));
	//   90  183:aload           13
	//   91  185:aload           9
	//   92  187:aload_3         
	//   93  188:aload           10
	//   94  190:aload           12
	//   95  192:aload_2         
	//   96  193:aload_0         
	//   97  194:invokestatic    #388 <Method void FragmentTransitionCompat21.scheduleRemoveTargets(Object, Object, ArrayList, Object, ArrayList, Object, ArrayList)>
					FragmentTransitionCompat21.beginDelayedTransition(viewgroup, obj3);
	//   98  197:aload           7
	//   99  199:aload           13
	//  100  201:invokestatic    #400 <Method void FragmentTransitionCompat21.beginDelayedTransition(ViewGroup, Object)>
					FragmentTransitionCompat21.setNameOverridesReordered(((View) (viewgroup)), arraylist, ((ArrayList) (fragmentmanagerimpl)), ((ArrayList) (obj2)), ((java.util.Map) (arraymap)));
	//  101  204:aload           7
	//  102  206:aload           8
	//  103  208:aload_0         
	//  104  209:aload           11
	//  105  211:aload           4
	//  106  213:invokestatic    #420 <Method void FragmentTransitionCompat21.setNameOverridesReordered(View, ArrayList, ArrayList, ArrayList, java.util.Map)>
					setViewVisibility(((ArrayList) (view)), 0);
	//  107  216:aload_3         
	//  108  217:iconst_0        
	//  109  218:invokestatic    #30  <Method void setViewVisibility(ArrayList, int)>
					FragmentTransitionCompat21.swapSharedElementTargets(((Object) (fragmentcontainertransition)), arraylist, ((ArrayList) (fragmentmanagerimpl)));
	//  110  221:aload_2         
	//  111  222:aload           8
	//  112  224:aload_0         
	//  113  225:invokestatic    #424 <Method void FragmentTransitionCompat21.swapSharedElementTargets(Object, ArrayList, ArrayList)>
					return;
	//  114  228:return          
				}
			}
		}
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
	//    6   10:invokespecial   #425 <Method void FragmentTransition$FragmentContainerTransition()>
	//    7   13:astore_3        
			sparsearray.put(i, ((Object) (fragmentcontainertransition1)));
	//    8   14:aload_1         
	//    9   15:iload_2         
	//   10   16:aload_3         
	//   11   17:invokevirtual   #428 <Method void SparseArray.put(int, Object)>
		}
		return fragmentcontainertransition1;
	//   12   20:aload_3         
	//   13   21:areturn         
	}

	private static String findKeyForValue(ArrayMap arraymap, String s)
	{
		int j = arraymap.size();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #58  <Method int ArrayMap.size()>
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
	//*  11   15:invokevirtual   #62  <Method Object ArrayMap.valueAt(int)>
	//*  12   18:invokevirtual   #286 <Method boolean String.equals(Object)>
	//*  13   21:ifeq            33
				return (String)arraymap.keyAt(i);
	//   14   24:aload_0         
	//   15   25:iload_2         
	//   16   26:invokevirtual   #237 <Method Object ArrayMap.keyAt(int)>
	//   17   29:checkcast       #210 <Class String>
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

	private static Object getEnterTransition(Fragment fragment, boolean flag)
	{
		if(fragment == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return ((Object) (null));
	//    2    4:aconst_null     
	//    3    5:areturn         
		if(flag)
	//*   4    6:iload_1         
	//*   5    7:ifeq            20
			fragment = ((Fragment) (fragment.getReenterTransition()));
	//    6   10:aload_0         
	//    7   11:invokevirtual   #434 <Method Object Fragment.getReenterTransition()>
	//    8   14:astore_0        
		else
	//*   9   15:aload_0         
	//*  10   16:invokestatic    #437 <Method Object FragmentTransitionCompat21.cloneTransition(Object)>
	//*  11   19:areturn         
			fragment = ((Fragment) (fragment.getEnterTransition()));
	//   12   20:aload_0         
	//   13   21:invokevirtual   #439 <Method Object Fragment.getEnterTransition()>
	//   14   24:astore_0        
		return FragmentTransitionCompat21.cloneTransition(((Object) (fragment)));
	//*  15   25:goto            15
	}

	private static Object getExitTransition(Fragment fragment, boolean flag)
	{
		if(fragment == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return ((Object) (null));
	//    2    4:aconst_null     
	//    3    5:areturn         
		if(flag)
	//*   4    6:iload_1         
	//*   5    7:ifeq            20
			fragment = ((Fragment) (fragment.getReturnTransition()));
	//    6   10:aload_0         
	//    7   11:invokevirtual   #442 <Method Object Fragment.getReturnTransition()>
	//    8   14:astore_0        
		else
	//*   9   15:aload_0         
	//*  10   16:invokestatic    #437 <Method Object FragmentTransitionCompat21.cloneTransition(Object)>
	//*  11   19:areturn         
			fragment = ((Fragment) (fragment.getExitTransition()));
	//   12   20:aload_0         
	//   13   21:invokevirtual   #444 <Method Object Fragment.getExitTransition()>
	//   14   24:astore_0        
		return FragmentTransitionCompat21.cloneTransition(((Object) (fragment)));
	//*  15   25:goto            15
	}

	private static View getInEpicenterView(ArrayMap arraymap, FragmentContainerTransition fragmentcontainertransition, Object obj, boolean flag)
	{
		fragmentcontainertransition = ((FragmentContainerTransition) (fragmentcontainertransition.lastInTransaction));
	//    0    0:aload_1         
	//    1    1:getfield        #120 <Field BackStackRecord FragmentTransition$FragmentContainerTransition.lastInTransaction>
	//    2    4:astore_1        
		if(obj != null && arraymap != null && ((BackStackRecord) (fragmentcontainertransition)).mSharedElementSourceNames != null && !((BackStackRecord) (fragmentcontainertransition)).mSharedElementSourceNames.isEmpty())
	//*   3    5:aload_2         
	//*   4    6:ifnull          70
	//*   5    9:aload_0         
	//*   6   10:ifnull          70
	//*   7   13:aload_1         
	//*   8   14:getfield        #205 <Field ArrayList BackStackRecord.mSharedElementSourceNames>
	//*   9   17:ifnull          70
	//*  10   20:aload_1         
	//*  11   21:getfield        #205 <Field ArrayList BackStackRecord.mSharedElementSourceNames>
	//*  12   24:invokevirtual   #305 <Method boolean ArrayList.isEmpty()>
	//*  13   27:ifne            70
		{
			if(flag)
	//*  14   30:iload_3         
	//*  15   31:ifeq            55
				fragmentcontainertransition = ((FragmentContainerTransition) ((String)((BackStackRecord) (fragmentcontainertransition)).mSharedElementSourceNames.get(0)));
	//   16   34:aload_1         
	//   17   35:getfield        #205 <Field ArrayList BackStackRecord.mSharedElementSourceNames>
	//   18   38:iconst_0        
	//   19   39:invokevirtual   #186 <Method Object ArrayList.get(int)>
	//   20   42:checkcast       #210 <Class String>
	//   21   45:astore_1        
			else
	//*  22   46:aload_0         
	//*  23   47:aload_1         
	//*  24   48:invokevirtual   #279 <Method Object ArrayMap.get(Object)>
	//*  25   51:checkcast       #64  <Class View>
	//*  26   54:areturn         
				fragmentcontainertransition = ((FragmentContainerTransition) ((String)((BackStackRecord) (fragmentcontainertransition)).mSharedElementTargetNames.get(0)));
	//   27   55:aload_1         
	//   28   56:getfield        #208 <Field ArrayList BackStackRecord.mSharedElementTargetNames>
	//   29   59:iconst_0        
	//   30   60:invokevirtual   #186 <Method Object ArrayList.get(int)>
	//   31   63:checkcast       #210 <Class String>
	//   32   66:astore_1        
			return (View)arraymap.get(((Object) (fragmentcontainertransition)));
		} else
	//*  33   67:goto            46
		{
			return null;
	//   34   70:aconst_null     
	//   35   71:areturn         
		}
	}

	private static Object getSharedElementTransition(Fragment fragment, Fragment fragment1, boolean flag)
	{
		if(fragment == null || fragment1 == null)
	//*   0    0:aload_0         
	//*   1    1:ifnull          8
	//*   2    4:aload_1         
	//*   3    5:ifnonnull       10
			return ((Object) (null));
	//    4    8:aconst_null     
	//    5    9:areturn         
		if(flag)
	//*   6   10:iload_2         
	//*   7   11:ifeq            27
			fragment = ((Fragment) (fragment1.getSharedElementReturnTransition()));
	//    8   14:aload_1         
	//    9   15:invokevirtual   #448 <Method Object Fragment.getSharedElementReturnTransition()>
	//   10   18:astore_0        
		else
	//*  11   19:aload_0         
	//*  12   20:invokestatic    #437 <Method Object FragmentTransitionCompat21.cloneTransition(Object)>
	//*  13   23:invokestatic    #451 <Method Object FragmentTransitionCompat21.wrapTransitionInSet(Object)>
	//*  14   26:areturn         
			fragment = ((Fragment) (fragment.getSharedElementEnterTransition()));
	//   15   27:aload_0         
	//   16   28:invokevirtual   #454 <Method Object Fragment.getSharedElementEnterTransition()>
	//   17   31:astore_0        
		return FragmentTransitionCompat21.wrapTransitionInSet(FragmentTransitionCompat21.cloneTransition(((Object) (fragment))));
	//*  18   32:goto            19
	}

	private static Object mergeTransitions(Object obj, Object obj1, Object obj2, Fragment fragment, boolean flag)
	{
		boolean flag2 = true;
	//    0    0:iconst_1        
	//    1    1:istore          6
		boolean flag1 = flag2;
	//    2    3:iload           6
	//    3    5:istore          5
		if(obj != null)
	//*   4    7:aload_0         
	//*   5    8:ifnull          38
		{
			flag1 = flag2;
	//    6   11:iload           6
	//    7   13:istore          5
			if(obj1 != null)
	//*   8   15:aload_1         
	//*   9   16:ifnull          38
			{
				flag1 = flag2;
	//   10   19:iload           6
	//   11   21:istore          5
				if(fragment != null)
	//*  12   23:aload_3         
	//*  13   24:ifnull          38
					if(flag)
	//*  14   27:iload           4
	//*  15   29:ifeq            50
						flag1 = fragment.getAllowReturnTransitionOverlap();
	//   16   32:aload_3         
	//   17   33:invokevirtual   #457 <Method boolean Fragment.getAllowReturnTransitionOverlap()>
	//   18   36:istore          5
					else
	//*  19   38:iload           5
	//*  20   40:ifeq            59
	//*  21   43:aload_1         
	//*  22   44:aload_0         
	//*  23   45:aload_2         
	//*  24   46:invokestatic    #461 <Method Object FragmentTransitionCompat21.mergeTransitionsTogether(Object, Object, Object)>
	//*  25   49:areturn         
						flag1 = fragment.getAllowEnterTransitionOverlap();
	//   26   50:aload_3         
	//   27   51:invokevirtual   #464 <Method boolean Fragment.getAllowEnterTransitionOverlap()>
	//   28   54:istore          5
			}
		}
		if(flag1)
			return FragmentTransitionCompat21.mergeTransitionsTogether(obj1, obj, obj2);
		else
	//*  29   56:goto            38
			return FragmentTransitionCompat21.mergeTransitionsInSequence(obj1, obj, obj2);
	//   30   59:aload_1         
	//   31   60:aload_0         
	//   32   61:aload_2         
	//   33   62:invokestatic    #467 <Method Object FragmentTransitionCompat21.mergeTransitionsInSequence(Object, Object, Object)>
	//   34   65:areturn         
	}

	private static void replaceHide(Object obj, Fragment fragment, ArrayList arraylist)
	{
		if(fragment != null && obj != null && fragment.mAdded && fragment.mHidden && fragment.mHiddenChanged)
	//*   0    0:aload_1         
	//*   1    1:ifnull          59
	//*   2    4:aload_0         
	//*   3    5:ifnull          59
	//*   4    8:aload_1         
	//*   5    9:getfield        #163 <Field boolean Fragment.mAdded>
	//*   6   12:ifeq            59
	//*   7   15:aload_1         
	//*   8   16:getfield        #160 <Field boolean Fragment.mHidden>
	//*   9   19:ifeq            59
	//*  10   22:aload_1         
	//*  11   23:getfield        #157 <Field boolean Fragment.mHiddenChanged>
	//*  12   26:ifeq            59
		{
			fragment.setHideReplaced(true);
	//   13   29:aload_1         
	//   14   30:iconst_1        
	//   15   31:invokevirtual   #471 <Method void Fragment.setHideReplaced(boolean)>
			FragmentTransitionCompat21.scheduleHideFragmentView(obj, fragment.getView(), arraylist);
	//   16   34:aload_0         
	//   17   35:aload_1         
	//   18   36:invokevirtual   #254 <Method View Fragment.getView()>
	//   19   39:aload_2         
	//   20   40:invokestatic    #474 <Method void FragmentTransitionCompat21.scheduleHideFragmentView(Object, View, ArrayList)>
			OneShotPreDrawListener.add(((View) (fragment.mContainer)), new Runnable(arraylist) {

				public void run()
				{
					FragmentTransition.setViewVisibility(exitingViews, 4);
				//    0    0:aload_0         
				//    1    1:getfield        #17  <Field ArrayList val$exitingViews>
				//    2    4:iconst_4        
				//    3    5:invokestatic    #26  <Method void FragmentTransition.access$000(ArrayList, int)>
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
	//   21   43:aload_1         
	//   22   44:getfield        #477 <Field ViewGroup Fragment.mContainer>
	//   23   47:new             #6   <Class FragmentTransition$1>
	//   24   50:dup             
	//   25   51:aload_2         
	//   26   52:invokespecial   #480 <Method void FragmentTransition$1(ArrayList)>
	//   27   55:invokestatic    #348 <Method OneShotPreDrawListener OneShotPreDrawListener.add(View, Runnable)>
	//   28   58:pop             
		}
	//   29   59:return          
	}

	private static void retainValues(ArrayMap arraymap, ArrayMap arraymap1)
	{
		for(int i = arraymap.size() - 1; i >= 0; i--)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #58  <Method int ArrayMap.size()>
	//*   2    4:iconst_1        
	//*   3    5:isub            
	//*   4    6:istore_2        
	//*   5    7:iload_2         
	//*   6    8:iflt            39
			if(!arraymap1.containsKey(((Object) ((String)arraymap.valueAt(i)))))
	//*   7   11:aload_1         
	//*   8   12:aload_0         
	//*   9   13:iload_2         
	//*  10   14:invokevirtual   #62  <Method Object ArrayMap.valueAt(int)>
	//*  11   17:checkcast       #210 <Class String>
	//*  12   20:invokevirtual   #484 <Method boolean ArrayMap.containsKey(Object)>
	//*  13   23:ifne            32
				arraymap.removeAt(i);
	//   14   26:aload_0         
	//   15   27:iload_2         
	//   16   28:invokevirtual   #487 <Method Object ArrayMap.removeAt(int)>
	//   17   31:pop             

	//   18   32:iload_2         
	//   19   33:iconst_1        
	//   20   34:isub            
	//   21   35:istore_2        
	//*  22   36:goto            7
	//   23   39:return          
	}

	private static void scheduleTargetChange(ViewGroup viewgroup, Fragment fragment, View view, ArrayList arraylist, Object obj, ArrayList arraylist1, Object obj1, ArrayList arraylist2)
	{
		OneShotPreDrawListener.add(((View) (viewgroup)), new Runnable(obj, view, fragment, arraylist, arraylist1, arraylist2, obj1) {

			public void run()
			{
				if(enterTransition != null)
			//*   0    0:aload_0         
			//*   1    1:getfield        #26  <Field Object val$enterTransition>
			//*   2    4:ifnull          47
				{
					FragmentTransitionCompat21.removeTarget(enterTransition, nonExistentView);
			//    3    7:aload_0         
			//    4    8:getfield        #26  <Field Object val$enterTransition>
			//    5   11:aload_0         
			//    6   12:getfield        #28  <Field View val$nonExistentView>
			//    7   15:invokestatic    #49  <Method void FragmentTransitionCompat21.removeTarget(Object, View)>
					ArrayList arraylist3 = FragmentTransition.configureEnteringExitingViews(enterTransition, inFragment, sharedElementsIn, nonExistentView);
			//    8   18:aload_0         
			//    9   19:getfield        #26  <Field Object val$enterTransition>
			//   10   22:aload_0         
			//   11   23:getfield        #30  <Field Fragment val$inFragment>
			//   12   26:aload_0         
			//   13   27:getfield        #32  <Field ArrayList val$sharedElementsIn>
			//   14   30:aload_0         
			//   15   31:getfield        #28  <Field View val$nonExistentView>
			//   16   34:invokestatic    #53  <Method ArrayList FragmentTransition.access$100(Object, Fragment, ArrayList, View)>
			//   17   37:astore_1        
					enteringViews.addAll(((Collection) (arraylist3)));
			//   18   38:aload_0         
			//   19   39:getfield        #34  <Field ArrayList val$enteringViews>
			//   20   42:aload_1         
			//   21   43:invokevirtual   #59  <Method boolean ArrayList.addAll(Collection)>
			//   22   46:pop             
				}
				if(exitingViews != null)
			//*  23   47:aload_0         
			//*  24   48:getfield        #36  <Field ArrayList val$exitingViews>
			//*  25   51:ifnull          109
				{
					if(exitTransition != null)
			//*  26   54:aload_0         
			//*  27   55:getfield        #38  <Field Object val$exitTransition>
			//*  28   58:ifnull          90
					{
						ArrayList arraylist4 = new ArrayList();
			//   29   61:new             #55  <Class ArrayList>
			//   30   64:dup             
			//   31   65:invokespecial   #60  <Method void ArrayList()>
			//   32   68:astore_1        
						arraylist4.add(((Object) (nonExistentView)));
			//   33   69:aload_1         
			//   34   70:aload_0         
			//   35   71:getfield        #28  <Field View val$nonExistentView>
			//   36   74:invokevirtual   #64  <Method boolean ArrayList.add(Object)>
			//   37   77:pop             
						FragmentTransitionCompat21.replaceTargets(exitTransition, exitingViews, arraylist4);
			//   38   78:aload_0         
			//   39   79:getfield        #38  <Field Object val$exitTransition>
			//   40   82:aload_0         
			//   41   83:getfield        #36  <Field ArrayList val$exitingViews>
			//   42   86:aload_1         
			//   43   87:invokestatic    #68  <Method void FragmentTransitionCompat21.replaceTargets(Object, ArrayList, ArrayList)>
					}
					exitingViews.clear();
			//   44   90:aload_0         
			//   45   91:getfield        #36  <Field ArrayList val$exitingViews>
			//   46   94:invokevirtual   #71  <Method void ArrayList.clear()>
					exitingViews.add(((Object) (nonExistentView)));
			//   47   97:aload_0         
			//   48   98:getfield        #36  <Field ArrayList val$exitingViews>
			//   49  101:aload_0         
			//   50  102:getfield        #28  <Field View val$nonExistentView>
			//   51  105:invokevirtual   #64  <Method boolean ArrayList.add(Object)>
			//   52  108:pop             
				}
			//   53  109:return          
			}

			final Object val$enterTransition;
			final ArrayList val$enteringViews;
			final Object val$exitTransition;
			final ArrayList val$exitingViews;
			final Fragment val$inFragment;
			final View val$nonExistentView;
			final ArrayList val$sharedElementsIn;

			
			{
				enterTransition = obj;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #26  <Field Object val$enterTransition>
				nonExistentView = view;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #28  <Field View val$nonExistentView>
				inFragment = fragment;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #30  <Field Fragment val$inFragment>
				sharedElementsIn = arraylist;
			//    9   15:aload_0         
			//   10   16:aload           4
			//   11   18:putfield        #32  <Field ArrayList val$sharedElementsIn>
				enteringViews = arraylist1;
			//   12   21:aload_0         
			//   13   22:aload           5
			//   14   24:putfield        #34  <Field ArrayList val$enteringViews>
				exitingViews = arraylist2;
			//   15   27:aload_0         
			//   16   28:aload           6
			//   17   30:putfield        #36  <Field ArrayList val$exitingViews>
				exitTransition = obj1;
			//   18   33:aload_0         
			//   19   34:aload           7
			//   20   36:putfield        #38  <Field Object val$exitTransition>
				super();
			//   21   39:aload_0         
			//   22   40:invokespecial   #41  <Method void Object()>
			//   23   43:return          
			}
		}
);
	//    0    0:aload_0         
	//    1    1:new             #8   <Class FragmentTransition$2>
	//    2    4:dup             
	//    3    5:aload           4
	//    4    7:aload_2         
	//    5    8:aload_1         
	//    6    9:aload_3         
	//    7   10:aload           5
	//    8   12:aload           7
	//    9   14:aload           6
	//   10   16:invokespecial   #491 <Method void FragmentTransition$2(Object, View, Fragment, ArrayList, ArrayList, ArrayList, Object)>
	//   11   19:invokestatic    #348 <Method OneShotPreDrawListener OneShotPreDrawListener.add(View, Runnable)>
	//   12   22:pop             
	//   13   23:return          
	}

	private static void setOutEpicenter(Object obj, Object obj1, ArrayMap arraymap, boolean flag, BackStackRecord backstackrecord)
	{
		if(backstackrecord.mSharedElementSourceNames != null && !backstackrecord.mSharedElementSourceNames.isEmpty())
	//*   0    0:aload           4
	//*   1    2:getfield        #205 <Field ArrayList BackStackRecord.mSharedElementSourceNames>
	//*   2    5:ifnull          61
	//*   3    8:aload           4
	//*   4   10:getfield        #205 <Field ArrayList BackStackRecord.mSharedElementSourceNames>
	//*   5   13:invokevirtual   #305 <Method boolean ArrayList.isEmpty()>
	//*   6   16:ifne            61
		{
			if(flag)
	//*   7   19:iload_3         
	//*   8   20:ifeq            62
				backstackrecord = ((BackStackRecord) ((String)backstackrecord.mSharedElementTargetNames.get(0)));
	//    9   23:aload           4
	//   10   25:getfield        #208 <Field ArrayList BackStackRecord.mSharedElementTargetNames>
	//   11   28:iconst_0        
	//   12   29:invokevirtual   #186 <Method Object ArrayList.get(int)>
	//   13   32:checkcast       #210 <Class String>
	//   14   35:astore          4
			else
	//*  15   37:aload_2         
	//*  16   38:aload           4
	//*  17   40:invokevirtual   #279 <Method Object ArrayMap.get(Object)>
	//*  18   43:checkcast       #64  <Class View>
	//*  19   46:astore_2        
	//*  20   47:aload_0         
	//*  21   48:aload_2         
	//*  22   49:invokestatic    #494 <Method void FragmentTransitionCompat21.setEpicenter(Object, View)>
	//*  23   52:aload_1         
	//*  24   53:ifnull          61
	//*  25   56:aload_1         
	//*  26   57:aload_2         
	//*  27   58:invokestatic    #494 <Method void FragmentTransitionCompat21.setEpicenter(Object, View)>
	//*  28   61:return          
				backstackrecord = ((BackStackRecord) ((String)backstackrecord.mSharedElementSourceNames.get(0)));
	//   29   62:aload           4
	//   30   64:getfield        #205 <Field ArrayList BackStackRecord.mSharedElementSourceNames>
	//   31   67:iconst_0        
	//   32   68:invokevirtual   #186 <Method Object ArrayList.get(int)>
	//   33   71:checkcast       #210 <Class String>
	//   34   74:astore          4
			arraymap = ((ArrayMap) ((View)arraymap.get(((Object) (backstackrecord)))));
			FragmentTransitionCompat21.setEpicenter(obj, ((View) (arraymap)));
			if(obj1 != null)
				FragmentTransitionCompat21.setEpicenter(obj1, ((View) (arraymap)));
		}
	//*  35   76:goto            37
	}

	private static void setViewVisibility(ArrayList arraylist, int i)
	{
		if(arraylist != null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       5
	//*   2    4:return          
		{
			int j = arraylist.size() - 1;
	//    3    5:aload_0         
	//    4    6:invokevirtual   #185 <Method int ArrayList.size()>
	//    5    9:iconst_1        
	//    6   10:isub            
	//    7   11:istore_2        
			while(j >= 0) 
	//*   8   12:iload_2         
	//*   9   13:iflt            4
			{
				((View)arraylist.get(j)).setVisibility(i);
	//   10   16:aload_0         
	//   11   17:iload_2         
	//   12   18:invokevirtual   #186 <Method Object ArrayList.get(int)>
	//   13   21:checkcast       #64  <Class View>
	//   14   24:iload_1         
	//   15   25:invokevirtual   #354 <Method void View.setVisibility(int)>
				j--;
	//   16   28:iload_2         
	//   17   29:iconst_1        
	//   18   30:isub            
	//   19   31:istore_2        
			}
		}
	//*  20   32:goto            12
	}

	static void startTransitions(FragmentManagerImpl fragmentmanagerimpl, ArrayList arraylist, ArrayList arraylist1, int i, int j, boolean flag)
	{
	//*   0    0:aload_0         
	//*   1    1:getfield        #137 <Field int FragmentManagerImpl.mCurState>
	//*   2    4:iconst_1        
	//*   3    5:icmpge          9
_L2:
		return;
	//    4    8:return          
		if(fragmentmanagerimpl.mCurState < 1 || android.os.Build.VERSION.SDK_INT < 21) goto _L2; else goto _L1
	//    5    9:getstatic       #503 <Field int android.os.Build$VERSION.SDK_INT>
	//    6   12:bipush          21
	//    7   14:icmplt          8
_L1:
		SparseArray sparsearray = new SparseArray();
	//    8   17:new             #102 <Class SparseArray>
	//    9   20:dup             
	//   10   21:invokespecial   #504 <Method void SparseArray()>
	//   11   24:astore          9
		int k = i;
	//   12   26:iload_3         
	//   13   27:istore          6
		while(k < j) 
	//*  14   29:iload           6
	//*  15   31:iload           4
	//*  16   33:icmpge          92
		{
			BackStackRecord backstackrecord = (BackStackRecord)arraylist.get(k);
	//   17   36:aload_1         
	//   18   37:iload           6
	//   19   39:invokevirtual   #186 <Method Object ArrayList.get(int)>
	//   20   42:checkcast       #125 <Class BackStackRecord>
	//   21   45:astore          10
			if(((Boolean)arraylist1.get(k)).booleanValue())
	//*  22   47:aload_2         
	//*  23   48:iload           6
	//*  24   50:invokevirtual   #186 <Method Object ArrayList.get(int)>
	//*  25   53:checkcast       #198 <Class Boolean>
	//*  26   56:invokevirtual   #202 <Method boolean Boolean.booleanValue()>
	//*  27   59:ifeq            80
				calculatePopFragments(backstackrecord, sparsearray, flag);
	//   28   62:aload           10
	//   29   64:aload           9
	//   30   66:iload           5
	//   31   68:invokestatic    #506 <Method void calculatePopFragments(BackStackRecord, SparseArray, boolean)>
			else
	//*  32   71:iload           6
	//*  33   73:iconst_1        
	//*  34   74:iadd            
	//*  35   75:istore          6
	//*  36   77:goto            29
				calculateFragments(backstackrecord, sparsearray, flag);
	//   37   80:aload           10
	//   38   82:aload           9
	//   39   84:iload           5
	//   40   86:invokestatic    #508 <Method void calculateFragments(BackStackRecord, SparseArray, boolean)>
			k++;
		}
	//*  41   89:goto            71
		if(sparsearray.size() != 0)
	//*  42   92:aload           9
	//*  43   94:invokevirtual   #509 <Method int SparseArray.size()>
	//*  44   97:ifeq            8
		{
			View view = new View(fragmentmanagerimpl.mHost.getContext());
	//   45  100:new             #64  <Class View>
	//   46  103:dup             
	//   47  104:aload_0         
	//   48  105:getfield        #513 <Field FragmentHostCallback FragmentManagerImpl.mHost>
	//   49  108:invokevirtual   #519 <Method android.content.Context FragmentHostCallback.getContext()>
	//   50  111:invokespecial   #522 <Method void View(android.content.Context)>
	//   51  114:astore          10
			int i1 = sparsearray.size();
	//   52  116:aload           9
	//   53  118:invokevirtual   #509 <Method int SparseArray.size()>
	//   54  121:istore          7
			int l = 0;
	//   55  123:iconst_0        
	//   56  124:istore          6
			while(l < i1) 
	//*  57  126:iload           6
	//*  58  128:iload           7
	//*  59  130:icmpge          8
			{
				int j1 = sparsearray.keyAt(l);
	//   60  133:aload           9
	//   61  135:iload           6
	//   62  137:invokevirtual   #525 <Method int SparseArray.keyAt(int)>
	//   63  140:istore          8
				ArrayMap arraymap = calculateNameOverrides(j1, arraylist, arraylist1, i, j);
	//   64  142:iload           8
	//   65  144:aload_1         
	//   66  145:aload_2         
	//   67  146:iload_3         
	//   68  147:iload           4
	//   69  149:invokestatic    #527 <Method ArrayMap calculateNameOverrides(int, ArrayList, ArrayList, int, int)>
	//   70  152:astore          11
				FragmentContainerTransition fragmentcontainertransition = (FragmentContainerTransition)sparsearray.valueAt(l);
	//   71  154:aload           9
	//   72  156:iload           6
	//   73  158:invokevirtual   #528 <Method Object SparseArray.valueAt(int)>
	//   74  161:checkcast       #14  <Class FragmentTransition$FragmentContainerTransition>
	//   75  164:astore          12
				if(flag)
	//*  76  166:iload           5
	//*  77  168:ifeq            192
					configureTransitionsReordered(fragmentmanagerimpl, j1, fragmentcontainertransition, view, arraymap);
	//   78  171:aload_0         
	//   79  172:iload           8
	//   80  174:aload           12
	//   81  176:aload           10
	//   82  178:aload           11
	//   83  180:invokestatic    #530 <Method void configureTransitionsReordered(FragmentManagerImpl, int, FragmentTransition$FragmentContainerTransition, View, ArrayMap)>
				else
	//*  84  183:iload           6
	//*  85  185:iconst_1        
	//*  86  186:iadd            
	//*  87  187:istore          6
	//*  88  189:goto            126
					configureTransitionsOrdered(fragmentmanagerimpl, j1, fragmentcontainertransition, view, arraymap);
	//   89  192:aload_0         
	//   90  193:iload           8
	//   91  195:aload           12
	//   92  197:aload           10
	//   93  199:aload           11
	//   94  201:invokestatic    #532 <Method void configureTransitionsOrdered(FragmentManagerImpl, int, FragmentTransition$FragmentContainerTransition, View, ArrayMap)>
				l++;
			}
		}
		if(true) goto _L2; else goto _L3
	//   95  204:goto            183
_L3:
	}

	private static final int INVERSE_OPS[] = {
		0, 3, 0, 1, 5, 4, 7, 6, 9, 8
	};

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
	//   42   52:putstatic       #21  <Field int[] INVERSE_OPS>
	//*  43   55:return          
	}


/*
	static void access$000(ArrayList arraylist, int i)
	{
		setViewVisibility(arraylist, i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokestatic    #30  <Method void setViewVisibility(ArrayList, int)>
		return;
	//    3    5:return          
	}

*/


/*
	static ArrayList access$100(Object obj, Fragment fragment, ArrayList arraylist, View view)
	{
		return configureEnteringExitingViews(obj, fragment, arraylist, view);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:invokestatic    #35  <Method ArrayList configureEnteringExitingViews(Object, Fragment, ArrayList, View)>
	//    5    7:areturn         
	}

*/


/*
	static void access$200(Fragment fragment, Fragment fragment1, boolean flag, ArrayMap arraymap, boolean flag1)
	{
		callSharedElementStartEnd(fragment, fragment1, flag, arraymap, flag1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:aload_3         
	//    4    4:iload           4
	//    5    6:invokestatic    #40  <Method void callSharedElementStartEnd(Fragment, Fragment, boolean, ArrayMap, boolean)>
		return;
	//    6    9:return          
	}

*/


/*
	static ArrayMap access$300(ArrayMap arraymap, Object obj, FragmentContainerTransition fragmentcontainertransition)
	{
		return captureInSharedElements(arraymap, obj, fragmentcontainertransition);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokestatic    #45  <Method ArrayMap captureInSharedElements(ArrayMap, Object, FragmentTransition$FragmentContainerTransition)>
	//    4    6:areturn         
	}

*/


/*
	static View access$400(ArrayMap arraymap, FragmentContainerTransition fragmentcontainertransition, Object obj, boolean flag)
	{
		return getInEpicenterView(arraymap, fragmentcontainertransition, obj, flag);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:invokestatic    #50  <Method View getInEpicenterView(ArrayMap, FragmentTransition$FragmentContainerTransition, Object, boolean)>
	//    5    7:areturn         
	}

*/
}

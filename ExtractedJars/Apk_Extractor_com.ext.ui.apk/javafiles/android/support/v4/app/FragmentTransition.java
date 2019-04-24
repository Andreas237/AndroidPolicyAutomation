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
	//    2    4:astore          11
		if(fragment != null) goto _L2; else goto _L1
	//    3    6:aload           11
	//    4    8:ifnonnull       12
_L1:
		int j;
		return;
	//    5   11:return          
	//*   6   12:aload           11
	//*   7   14:getfield        #97  <Field int Fragment.mContainerId>
	//*   8   17:istore          9
_L2:
		if((j = fragment.mContainerId) == 0) goto _L4; else goto _L3
	//    9   19:iload           9
	//   10   21:ifeq            11
_L3:
		int i;
		boolean flag2;
		boolean flag3;
		boolean flag5;
		if(flag)
	//*  11   24:iload_3         
	//*  12   25:ifeq            283
			i = INVERSE_OPS[op.cmd];
	//   13   28:getstatic       #21  <Field int[] INVERSE_OPS>
	//   14   31:aload_1         
	//   15   32:getfield        #100 <Field int BackStackRecord$Op.cmd>
	//   16   35:iaload          
	//   17   36:istore          5
		else
	//*  18   38:iload           5
	//*  19   40:tableswitch     1 7: default 84
	//	               1 352
	//	               2 84
	//	               3 490
	//	               4 404
	//	               5 292
	//	               6 490
	//	               7 352
	//*  20   84:iconst_0        
	//*  21   85:istore          5
	//*  22   87:iconst_0        
	//*  23   88:istore          6
	//*  24   90:iconst_0        
	//*  25   91:istore          7
	//*  26   93:iconst_0        
	//*  27   94:istore          10
	//*  28   96:aload_2         
	//*  29   97:iload           9
	//*  30   99:invokevirtual   #105 <Method Object SparseArray.get(int)>
	//*  31  102:checkcast       #14  <Class FragmentTransition$FragmentContainerTransition>
	//*  32  105:astore_1        
	//*  33  106:iload           10
	//*  34  108:ifeq            594
	//*  35  111:aload_1         
	//*  36  112:aload_2         
	//*  37  113:iload           9
	//*  38  115:invokestatic    #109 <Method FragmentTransition$FragmentContainerTransition ensureContainer(FragmentTransition$FragmentContainerTransition, SparseArray, int)>
	//*  39  118:astore_1        
	//*  40  119:aload_1         
	//*  41  120:aload           11
	//*  42  122:putfield        #112 <Field Fragment FragmentTransition$FragmentContainerTransition.lastIn>
	//*  43  125:aload_1         
	//*  44  126:iload_3         
	//*  45  127:putfield        #116 <Field boolean FragmentTransition$FragmentContainerTransition.lastInIsPop>
	//*  46  130:aload_1         
	//*  47  131:aload_0         
	//*  48  132:putfield        #120 <Field BackStackRecord FragmentTransition$FragmentContainerTransition.lastInTransaction>
	//*  49  135:iload           4
	//*  50  137:ifne            212
	//*  51  140:iload           5
	//*  52  142:ifeq            212
	//*  53  145:aload_1         
	//*  54  146:ifnull          163
	//*  55  149:aload_1         
	//*  56  150:getfield        #123 <Field Fragment FragmentTransition$FragmentContainerTransition.firstOut>
	//*  57  153:aload           11
	//*  58  155:if_acmpne       163
	//*  59  158:aload_1         
	//*  60  159:aconst_null     
	//*  61  160:putfield        #123 <Field Fragment FragmentTransition$FragmentContainerTransition.firstOut>
	//*  62  163:aload_0         
	//*  63  164:getfield        #129 <Field FragmentManagerImpl BackStackRecord.mManager>
	//*  64  167:astore          12
	//*  65  169:aload           11
	//*  66  171:getfield        #132 <Field int Fragment.mState>
	//*  67  174:iconst_1        
	//*  68  175:icmpge          212
	//*  69  178:aload           12
	//*  70  180:getfield        #137 <Field int FragmentManagerImpl.mCurState>
	//*  71  183:iconst_1        
	//*  72  184:icmplt          212
	//*  73  187:aload_0         
	//*  74  188:getfield        #140 <Field boolean BackStackRecord.mReorderingAllowed>
	//*  75  191:ifne            212
	//*  76  194:aload           12
	//*  77  196:aload           11
	//*  78  198:invokevirtual   #144 <Method void FragmentManagerImpl.makeActive(Fragment)>
	//*  79  201:aload           12
	//*  80  203:aload           11
	//*  81  205:iconst_1        
	//*  82  206:iconst_0        
	//*  83  207:iconst_0        
	//*  84  208:iconst_0        
	//*  85  209:invokevirtual   #148 <Method void FragmentManagerImpl.moveToState(Fragment, int, int, int, boolean)>
	//*  86  212:iload           6
	//*  87  214:ifeq            589
	//*  88  217:aload_1         
	//*  89  218:ifnull          228
	//*  90  221:aload_1         
	//*  91  222:getfield        #123 <Field Fragment FragmentTransition$FragmentContainerTransition.firstOut>
	//*  92  225:ifnonnull       589
	//*  93  228:aload_1         
	//*  94  229:aload_2         
	//*  95  230:iload           9
	//*  96  232:invokestatic    #109 <Method FragmentTransition$FragmentContainerTransition ensureContainer(FragmentTransition$FragmentContainerTransition, SparseArray, int)>
	//*  97  235:astore_1        
	//*  98  236:aload_1         
	//*  99  237:aload           11
	//* 100  239:putfield        #123 <Field Fragment FragmentTransition$FragmentContainerTransition.firstOut>
	//* 101  242:aload_1         
	//* 102  243:iload_3         
	//* 103  244:putfield        #151 <Field boolean FragmentTransition$FragmentContainerTransition.firstOutIsPop>
	//* 104  247:aload_1         
	//* 105  248:aload_0         
	//* 106  249:putfield        #154 <Field BackStackRecord FragmentTransition$FragmentContainerTransition.firstOutTransaction>
	//* 107  252:aload_1         
	//* 108  253:astore_0        
	//* 109  254:iload           4
	//* 110  256:ifne            11
	//* 111  259:iload           7
	//* 112  261:ifeq            11
	//* 113  264:aload_0         
	//* 114  265:ifnull          11
	//* 115  268:aload_0         
	//* 116  269:getfield        #112 <Field Fragment FragmentTransition$FragmentContainerTransition.lastIn>
	//* 117  272:aload           11
	//* 118  274:if_acmpne       11
	//* 119  277:aload_0         
	//* 120  278:aconst_null     
	//* 121  279:putfield        #112 <Field Fragment FragmentTransition$FragmentContainerTransition.lastIn>
	//* 122  282:return          
			i = op.cmd;
	//  123  283:aload_1         
	//  124  284:getfield        #100 <Field int BackStackRecord$Op.cmd>
	//  125  287:istore          5
		i;
		JVM INSTR tableswitch 1 7: default 84
	//	               1 352
	//	               2 84
	//	               3 490
	//	               4 404
	//	               5 292
	//	               6 490
	//	               7 352;
		   goto _L5 _L6 _L5 _L7 _L8 _L9 _L7 _L6
_L5:
		i = 0;
		flag2 = false;
		flag3 = false;
		flag5 = false;
_L10:
		op = ((BackStackRecord.Op) ((FragmentContainerTransition)sparsearray.get(j)));
		if(flag5)
		{
			op = ((BackStackRecord.Op) (ensureContainer(((FragmentContainerTransition) (op)), sparsearray, j)));
			op.lastIn = fragment;
			op.lastInIsPop = flag;
			op.lastInTransaction = backstackrecord;
		}
		if(!flag1 && i != 0)
		{
			if(op != null && ((FragmentContainerTransition) (op)).firstOut == fragment)
				op.firstOut = null;
			FragmentManagerImpl fragmentmanagerimpl = backstackrecord.mManager;
			if(fragment.mState < 1 && fragmentmanagerimpl.mCurState >= 1 && !backstackrecord.mReorderingAllowed)
			{
				fragmentmanagerimpl.makeActive(fragment);
				fragmentmanagerimpl.moveToState(fragment, 1, 0, 0, false);
			}
		}
		boolean flag4;
		if(flag2 && (op == null || ((FragmentContainerTransition) (op)).firstOut == null))
		{
			op = ((BackStackRecord.Op) (ensureContainer(((FragmentContainerTransition) (op)), sparsearray, j)));
			op.firstOut = fragment;
			op.firstOutIsPop = flag;
			op.firstOutTransaction = backstackrecord;
			backstackrecord = ((BackStackRecord) (op));
		} else
	//* 126  289:goto            38
	//* 127  292:iload           4
	//* 128  294:ifeq            342
	//* 129  297:aload           11
	//* 130  299:getfield        #157 <Field boolean Fragment.mHiddenChanged>
	//* 131  302:ifeq            336
	//* 132  305:aload           11
	//* 133  307:getfield        #160 <Field boolean Fragment.mHidden>
	//* 134  310:ifne            336
	//* 135  313:aload           11
	//* 136  315:getfield        #163 <Field boolean Fragment.mAdded>
	//* 137  318:ifeq            336
	//* 138  321:iconst_1        
	//* 139  322:istore          10
	//* 140  324:iconst_1        
	//* 141  325:istore          5
	//* 142  327:iconst_0        
	//* 143  328:istore          6
	//* 144  330:iconst_0        
	//* 145  331:istore          7
	//* 146  333:goto            96
	//* 147  336:iconst_0        
	//* 148  337:istore          10
	//* 149  339:goto            324
	//* 150  342:aload           11
	//* 151  344:getfield        #160 <Field boolean Fragment.mHidden>
	//* 152  347:istore          10
	//* 153  349:goto            324
	//* 154  352:iload           4
	//* 155  354:ifeq            376
	//* 156  357:aload           11
	//* 157  359:getfield        #166 <Field boolean Fragment.mIsNewlyAdded>
	//* 158  362:istore          10
	//* 159  364:iconst_1        
	//* 160  365:istore          5
	//* 161  367:iconst_0        
	//* 162  368:istore          6
	//* 163  370:iconst_0        
	//* 164  371:istore          7
	//* 165  373:goto            96
	//* 166  376:aload           11
	//* 167  378:getfield        #163 <Field boolean Fragment.mAdded>
	//* 168  381:ifne            398
	//* 169  384:aload           11
	//* 170  386:getfield        #160 <Field boolean Fragment.mHidden>
	//* 171  389:ifne            398
	//* 172  392:iconst_1        
	//* 173  393:istore          10
	//* 174  395:goto            364
	//* 175  398:iconst_0        
	//* 176  399:istore          10
	//* 177  401:goto            364
	//* 178  404:iload           4
	//* 179  406:ifeq            462
	//* 180  409:aload           11
	//* 181  411:getfield        #157 <Field boolean Fragment.mHiddenChanged>
	//* 182  414:ifeq            456
	//* 183  417:aload           11
	//* 184  419:getfield        #163 <Field boolean Fragment.mAdded>
	//* 185  422:ifeq            456
	//* 186  425:aload           11
	//* 187  427:getfield        #160 <Field boolean Fragment.mHidden>
	//* 188  430:ifeq            456
	//* 189  433:iconst_1        
	//* 190  434:istore          5
	//* 191  436:iconst_0        
	//* 192  437:istore          8
	//* 193  439:iload           5
	//* 194  441:istore          6
	//* 195  443:iconst_1        
	//* 196  444:istore          7
	//* 197  446:iconst_0        
	//* 198  447:istore          10
	//* 199  449:iload           8
	//* 200  451:istore          5
	//* 201  453:goto            96
	//* 202  456:iconst_0        
	//* 203  457:istore          5
	//* 204  459:goto            436
	//* 205  462:aload           11
	//* 206  464:getfield        #163 <Field boolean Fragment.mAdded>
	//* 207  467:ifeq            484
	//* 208  470:aload           11
	//* 209  472:getfield        #160 <Field boolean Fragment.mHidden>
	//* 210  475:ifne            484
	//* 211  478:iconst_1        
	//* 212  479:istore          5
	//* 213  481:goto            436
	//* 214  484:iconst_0        
	//* 215  485:istore          5
	//* 216  487:goto            436
	//* 217  490:iload           4
	//* 218  492:ifeq            561
	//* 219  495:aload           11
	//* 220  497:getfield        #163 <Field boolean Fragment.mAdded>
	//* 221  500:ifne            555
	//* 222  503:aload           11
	//* 223  505:getfield        #170 <Field View Fragment.mView>
	//* 224  508:ifnull          555
	//* 225  511:aload           11
	//* 226  513:getfield        #170 <Field View Fragment.mView>
	//* 227  516:invokevirtual   #173 <Method int View.getVisibility()>
	//* 228  519:ifne            555
	//* 229  522:aload           11
	//* 230  524:getfield        #177 <Field float Fragment.mPostponedAlpha>
	//* 231  527:fconst_0        
	//* 232  528:fcmpl           
	//* 233  529:iflt            555
	//* 234  532:iconst_1        
	//* 235  533:istore          5
	//* 236  535:iconst_0        
	//* 237  536:istore          8
	//* 238  538:iload           5
	//* 239  540:istore          6
	//* 240  542:iconst_1        
	//* 241  543:istore          7
	//* 242  545:iconst_0        
	//* 243  546:istore          10
	//* 244  548:iload           8
	//* 245  550:istore          5
	//* 246  552:goto            96
	//* 247  555:iconst_0        
	//* 248  556:istore          5
	//* 249  558:goto            535
	//* 250  561:aload           11
	//* 251  563:getfield        #163 <Field boolean Fragment.mAdded>
	//* 252  566:ifeq            583
	//* 253  569:aload           11
	//* 254  571:getfield        #160 <Field boolean Fragment.mHidden>
	//* 255  574:ifne            583
	//* 256  577:iconst_1        
	//* 257  578:istore          5
	//* 258  580:goto            535
	//* 259  583:iconst_0        
	//* 260  584:istore          5
	//* 261  586:goto            535
		{
			backstackrecord = ((BackStackRecord) (op));
	//  262  589:aload_1         
	//  263  590:astore_0        
		}
		if(!flag1 && flag3 && backstackrecord != null && ((FragmentContainerTransition) (backstackrecord)).lastIn == fragment)
		{
			backstackrecord.lastIn = null;
			return;
		}
_L4:
		if(true) goto _L1; else goto _L9
	//  264  591:goto            254
_L9:
		if(flag1)
		{
			if(fragment.mHiddenChanged && !fragment.mHidden && fragment.mAdded)
				flag5 = true;
			else
				flag5 = false;
		} else
		{
			flag5 = fragment.mHidden;
		}
		i = 1;
		flag2 = false;
		flag3 = false;
		  goto _L10
_L6:
		if(flag1)
			flag5 = fragment.mIsNewlyAdded;
		else
		if(!fragment.mAdded && !fragment.mHidden)
			flag5 = true;
		else
			flag5 = false;
		i = 1;
		flag2 = false;
		flag3 = false;
		  goto _L10
_L8:
		if(flag1)
		{
			if(fragment.mHiddenChanged && fragment.mAdded && fragment.mHidden)
				i = 1;
			else
				i = 0;
		} else
		if(fragment.mAdded && !fragment.mHidden)
			i = 1;
		else
			i = 0;
		flag4 = false;
		flag2 = ((boolean) (i));
		flag3 = true;
		flag5 = false;
		i = ((int) (flag4));
		  goto _L10
_L7:
		if(flag1)
		{
			if(!fragment.mAdded && fragment.mView != null && fragment.mView.getVisibility() == 0 && fragment.mPostponedAlpha >= 0.0F)
				i = 1;
			else
				i = 0;
		} else
		if(fragment.mAdded && !fragment.mHidden)
			i = 1;
		else
			i = 0;
		flag4 = false;
		flag2 = ((boolean) (i));
		flag3 = true;
		flag5 = false;
		i = ((int) (flag4));
		  goto _L10
	//* 265  594:goto            135
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
						arraylist2 = ((BackStackRecord) (obj)).mSharedElementSourceNames;
	//   40   87:aload           11
	//   41   89:getfield        #205 <Field ArrayList BackStackRecord.mSharedElementSourceNames>
	//   42   92:astore          8
						arraylist3 = ((BackStackRecord) (obj)).mSharedElementTargetNames;
	//   43   94:aload           11
	//   44   96:getfield        #208 <Field ArrayList BackStackRecord.mSharedElementTargetNames>
	//   45   99:astore          9
					} else
	//*  46  101:iconst_0        
	//*  47  102:istore          5
	//*  48  104:iload           5
	//*  49  106:iload           6
	//*  50  108:icmpge          41
	//*  51  111:aload           9
	//*  52  113:iload           5
	//*  53  115:invokevirtual   #186 <Method Object ArrayList.get(int)>
	//*  54  118:checkcast       #210 <Class String>
	//*  55  121:astore          11
	//*  56  123:aload           8
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
						arraylist3 = ((BackStackRecord) (obj)).mSharedElementSourceNames;
	//   78  171:aload           11
	//   79  173:getfield        #205 <Field ArrayList BackStackRecord.mSharedElementSourceNames>
	//   80  176:astore          9
						arraylist2 = ((BackStackRecord) (obj)).mSharedElementTargetNames;
	//   81  178:aload           11
	//   82  180:getfield        #208 <Field ArrayList BackStackRecord.mSharedElementTargetNames>
	//   83  183:astore          8
					}
					l = 0;
					while(l < i1) 
					{
						obj = ((Object) ((String)arraylist3.get(l)));
						String s = (String)arraylist2.get(l);
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
			int j = 0;
	//    0    0:iconst_0        
	//    1    1:istore          6
			if(flag)
	//*   2    3:iload_2         
	//*   3    4:ifeq            79
				fragment = ((Fragment) (fragment1.getEnterTransitionCallback()));
	//    4    7:aload_1         
	//    5    8:invokevirtual   #233 <Method SharedElementCallback Fragment.getEnterTransitionCallback()>
	//    6   11:astore_0        
			else
	//*   7   12:aload_0         
	//*   8   13:ifnull          109
	//*   9   16:new             #78  <Class ArrayList>
	//*  10   19:dup             
	//*  11   20:invokespecial   #234 <Method void ArrayList()>
	//*  12   23:astore_1        
	//*  13   24:new             #78  <Class ArrayList>
	//*  14   27:dup             
	//*  15   28:invokespecial   #234 <Method void ArrayList()>
	//*  16   31:astore          7
	//*  17   33:aload_3         
	//*  18   34:ifnonnull       87
	//*  19   37:iconst_0        
	//*  20   38:istore          5
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
				if(arraymap == null)
					i = 0;
				else
	//*  44   84:goto            12
					i = arraymap.size();
	//   45   87:aload_3         
	//   46   88:invokevirtual   #58  <Method int ArrayMap.size()>
	//   47   91:istore          5
				for(; j < i; j++)
				{
					arraylist.add(arraymap.keyAt(j));
					((ArrayList) (fragment1)).add(arraymap.valueAt(j));
				}

	//*  48   93:goto            40
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
		Object obj1 = ((Object) (fragmentcontainertransition.lastIn));
	//    0    0:aload_2         
	//    1    1:getfield        #112 <Field Fragment FragmentTransition$FragmentContainerTransition.lastIn>
	//    2    4:astore          5
		View view = ((Fragment) (obj1)).getView();
	//    3    6:aload           5
	//    4    8:invokevirtual   #254 <Method View Fragment.getView()>
	//    5   11:astore          6
		if(arraymap.isEmpty() || obj == null || view == null)
	//*   6   13:aload_0         
	//*   7   14:invokevirtual   #257 <Method boolean ArrayMap.isEmpty()>
	//*   8   17:ifne            29
	//*   9   20:aload_1         
	//*  10   21:ifnull          29
	//*  11   24:aload           6
	//*  12   26:ifnonnull       35
		{
			arraymap.clear();
	//   13   29:aload_0         
	//   14   30:invokevirtual   #260 <Method void ArrayMap.clear()>
			return null;
	//   15   33:aconst_null     
	//   16   34:areturn         
		}
		ArrayMap arraymap1 = new ArrayMap();
	//   17   35:new             #54  <Class ArrayMap>
	//   18   38:dup             
	//   19   39:invokespecial   #192 <Method void ArrayMap()>
	//   20   42:astore          4
		FragmentTransitionCompat21.findNamedViews(((java.util.Map) (arraymap1)), view);
	//   21   44:aload           4
	//   22   46:aload           6
	//   23   48:invokestatic    #266 <Method void FragmentTransitionCompat21.findNamedViews(java.util.Map, View)>
		obj = ((Object) (fragmentcontainertransition.lastInTransaction));
	//   24   51:aload_2         
	//   25   52:getfield        #120 <Field BackStackRecord FragmentTransition$FragmentContainerTransition.lastInTransaction>
	//   26   55:astore_1        
		if(fragmentcontainertransition.lastInIsPop)
	//*  27   56:aload_2         
	//*  28   57:getfield        #116 <Field boolean FragmentTransition$FragmentContainerTransition.lastInIsPop>
	//*  29   60:ifeq            156
		{
			fragmentcontainertransition = ((FragmentContainerTransition) (((Fragment) (obj1)).getExitTransitionCallback()));
	//   30   63:aload           5
	//   31   65:invokevirtual   #269 <Method SharedElementCallback Fragment.getExitTransitionCallback()>
	//   32   68:astore_2        
			obj = ((Object) (((BackStackRecord) (obj)).mSharedElementSourceNames));
	//   33   69:aload_1         
	//   34   70:getfield        #205 <Field ArrayList BackStackRecord.mSharedElementSourceNames>
	//   35   73:astore_1        
		} else
	//*  36   74:aload_1         
	//*  37   75:ifnull          85
	//*  38   78:aload           4
	//*  39   80:aload_1         
	//*  40   81:invokevirtual   #273 <Method boolean ArrayMap.retainAll(Collection)>
	//*  41   84:pop             
	//*  42   85:aload_2         
	//*  43   86:ifnull          209
	//*  44   89:aload_2         
	//*  45   90:aload_1         
	//*  46   91:aload           4
	//*  47   93:invokevirtual   #277 <Method void SharedElementCallback.onMapSharedElements(java.util.List, java.util.Map)>
	//*  48   96:aload_1         
	//*  49   97:invokevirtual   #185 <Method int ArrayList.size()>
	//*  50  100:iconst_1        
	//*  51  101:isub            
	//*  52  102:istore_3        
	//*  53  103:iload_3         
	//*  54  104:iflt            215
	//*  55  107:aload_1         
	//*  56  108:iload_3         
	//*  57  109:invokevirtual   #186 <Method Object ArrayList.get(int)>
	//*  58  112:checkcast       #210 <Class String>
	//*  59  115:astore          5
	//*  60  117:aload           4
	//*  61  119:aload           5
	//*  62  121:invokevirtual   #279 <Method Object ArrayMap.get(Object)>
	//*  63  124:checkcast       #64  <Class View>
	//*  64  127:astore_2        
	//*  65  128:aload_2         
	//*  66  129:ifnonnull       170
	//*  67  132:aload_0         
	//*  68  133:aload           5
	//*  69  135:invokestatic    #283 <Method String findKeyForValue(ArrayMap, String)>
	//*  70  138:astore_2        
	//*  71  139:aload_2         
	//*  72  140:ifnull          149
	//*  73  143:aload_0         
	//*  74  144:aload_2         
	//*  75  145:invokevirtual   #214 <Method Object ArrayMap.remove(Object)>
	//*  76  148:pop             
	//*  77  149:iload_3         
	//*  78  150:iconst_1        
	//*  79  151:isub            
	//*  80  152:istore_3        
	//*  81  153:goto            103
		{
			fragmentcontainertransition = ((FragmentContainerTransition) (((Fragment) (obj1)).getEnterTransitionCallback()));
	//   82  156:aload           5
	//   83  158:invokevirtual   #233 <Method SharedElementCallback Fragment.getEnterTransitionCallback()>
	//   84  161:astore_2        
			obj = ((Object) (((BackStackRecord) (obj)).mSharedElementTargetNames));
	//   85  162:aload_1         
	//   86  163:getfield        #208 <Field ArrayList BackStackRecord.mSharedElementTargetNames>
	//   87  166:astore_1        
		}
		if(obj != null)
			arraymap1.retainAll(((Collection) (obj)));
		if(fragmentcontainertransition != null)
		{
			((SharedElementCallback) (fragmentcontainertransition)).onMapSharedElements(((java.util.List) (obj)), ((java.util.Map) (arraymap1)));
			int i = ((ArrayList) (obj)).size() - 1;
			while(i >= 0) 
			{
				obj1 = ((Object) ((String)((ArrayList) (obj)).get(i)));
				fragmentcontainertransition = ((FragmentContainerTransition) ((View)arraymap1.get(obj1)));
				if(fragmentcontainertransition == null)
				{
					fragmentcontainertransition = ((FragmentContainerTransition) (findKeyForValue(arraymap, ((String) (obj1)))));
					if(fragmentcontainertransition != null)
						arraymap.remove(((Object) (fragmentcontainertransition)));
				} else
	//*  88  167:goto            74
				if(!((String) (obj1)).equals(((Object) (ViewCompat.getTransitionName(((View) (fragmentcontainertransition)))))))
	//*  89  170:aload           5
	//*  90  172:aload_2         
	//*  91  173:invokestatic    #70  <Method String ViewCompat.getTransitionName(View)>
	//*  92  176:invokevirtual   #286 <Method boolean String.equals(Object)>
	//*  93  179:ifne            149
				{
					obj1 = ((Object) (findKeyForValue(arraymap, ((String) (obj1)))));
	//   94  182:aload_0         
	//   95  183:aload           5
	//   96  185:invokestatic    #283 <Method String findKeyForValue(ArrayMap, String)>
	//   97  188:astore          5
					if(obj1 != null)
	//*  98  190:aload           5
	//*  99  192:ifnull          149
						arraymap.put(obj1, ((Object) (ViewCompat.getTransitionName(((View) (fragmentcontainertransition))))));
	//  100  195:aload_0         
	//  101  196:aload           5
	//  102  198:aload_2         
	//  103  199:invokestatic    #70  <Method String ViewCompat.getTransitionName(View)>
	//  104  202:invokevirtual   #218 <Method Object ArrayMap.put(Object, Object)>
	//  105  205:pop             
				}
				i--;
			}
		} else
	//* 106  206:goto            149
		{
			retainValues(arraymap, arraymap1);
	//  107  209:aload_0         
	//  108  210:aload           4
	//  109  212:invokestatic    #290 <Method void retainValues(ArrayMap, ArrayMap)>
		}
		return arraymap1;
	//  110  215:aload           4
	//  111  217:areturn         
	}

	private static ArrayMap captureOutSharedElements(ArrayMap arraymap, Object obj, FragmentContainerTransition fragmentcontainertransition)
	{
		if(arraymap.isEmpty() || obj == null)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #257 <Method boolean ArrayMap.isEmpty()>
	//*   2    4:ifne            11
	//*   3    7:aload_1         
	//*   4    8:ifnonnull       17
		{
			arraymap.clear();
	//    5   11:aload_0         
	//    6   12:invokevirtual   #260 <Method void ArrayMap.clear()>
			return null;
	//    7   15:aconst_null     
	//    8   16:areturn         
		}
		Object obj1 = ((Object) (fragmentcontainertransition.firstOut));
	//    9   17:aload_2         
	//   10   18:getfield        #123 <Field Fragment FragmentTransition$FragmentContainerTransition.firstOut>
	//   11   21:astore          5
		ArrayMap arraymap1 = new ArrayMap();
	//   12   23:new             #54  <Class ArrayMap>
	//   13   26:dup             
	//   14   27:invokespecial   #192 <Method void ArrayMap()>
	//   15   30:astore          4
		FragmentTransitionCompat21.findNamedViews(((java.util.Map) (arraymap1)), ((Fragment) (obj1)).getView());
	//   16   32:aload           4
	//   17   34:aload           5
	//   18   36:invokevirtual   #254 <Method View Fragment.getView()>
	//   19   39:invokestatic    #266 <Method void FragmentTransitionCompat21.findNamedViews(java.util.Map, View)>
		obj = ((Object) (fragmentcontainertransition.firstOutTransaction));
	//   20   42:aload_2         
	//   21   43:getfield        #154 <Field BackStackRecord FragmentTransition$FragmentContainerTransition.firstOutTransaction>
	//   22   46:astore_1        
		if(fragmentcontainertransition.firstOutIsPop)
	//*  23   47:aload_2         
	//*  24   48:getfield        #151 <Field boolean FragmentTransition$FragmentContainerTransition.firstOutIsPop>
	//*  25   51:ifeq            133
		{
			fragmentcontainertransition = ((FragmentContainerTransition) (((Fragment) (obj1)).getEnterTransitionCallback()));
	//   26   54:aload           5
	//   27   56:invokevirtual   #233 <Method SharedElementCallback Fragment.getEnterTransitionCallback()>
	//   28   59:astore_2        
			obj = ((Object) (((BackStackRecord) (obj)).mSharedElementTargetNames));
	//   29   60:aload_1         
	//   30   61:getfield        #208 <Field ArrayList BackStackRecord.mSharedElementTargetNames>
	//   31   64:astore_1        
		} else
	//*  32   65:aload           4
	//*  33   67:aload_1         
	//*  34   68:invokevirtual   #273 <Method boolean ArrayMap.retainAll(Collection)>
	//*  35   71:pop             
	//*  36   72:aload_2         
	//*  37   73:ifnull          184
	//*  38   76:aload_2         
	//*  39   77:aload_1         
	//*  40   78:aload           4
	//*  41   80:invokevirtual   #277 <Method void SharedElementCallback.onMapSharedElements(java.util.List, java.util.Map)>
	//*  42   83:aload_1         
	//*  43   84:invokevirtual   #185 <Method int ArrayList.size()>
	//*  44   87:iconst_1        
	//*  45   88:isub            
	//*  46   89:istore_3        
	//*  47   90:iload_3         
	//*  48   91:iflt            194
	//*  49   94:aload_1         
	//*  50   95:iload_3         
	//*  51   96:invokevirtual   #186 <Method Object ArrayList.get(int)>
	//*  52   99:checkcast       #210 <Class String>
	//*  53  102:astore          5
	//*  54  104:aload           4
	//*  55  106:aload           5
	//*  56  108:invokevirtual   #279 <Method Object ArrayMap.get(Object)>
	//*  57  111:checkcast       #64  <Class View>
	//*  58  114:astore_2        
	//*  59  115:aload_2         
	//*  60  116:ifnonnull       147
	//*  61  119:aload_0         
	//*  62  120:aload           5
	//*  63  122:invokevirtual   #214 <Method Object ArrayMap.remove(Object)>
	//*  64  125:pop             
	//*  65  126:iload_3         
	//*  66  127:iconst_1        
	//*  67  128:isub            
	//*  68  129:istore_3        
	//*  69  130:goto            90
		{
			fragmentcontainertransition = ((FragmentContainerTransition) (((Fragment) (obj1)).getExitTransitionCallback()));
	//   70  133:aload           5
	//   71  135:invokevirtual   #269 <Method SharedElementCallback Fragment.getExitTransitionCallback()>
	//   72  138:astore_2        
			obj = ((Object) (((BackStackRecord) (obj)).mSharedElementSourceNames));
	//   73  139:aload_1         
	//   74  140:getfield        #205 <Field ArrayList BackStackRecord.mSharedElementSourceNames>
	//   75  143:astore_1        
		}
		arraymap1.retainAll(((Collection) (obj)));
		if(fragmentcontainertransition != null)
		{
			((SharedElementCallback) (fragmentcontainertransition)).onMapSharedElements(((java.util.List) (obj)), ((java.util.Map) (arraymap1)));
			int i = ((ArrayList) (obj)).size() - 1;
			while(i >= 0) 
			{
				obj1 = ((Object) ((String)((ArrayList) (obj)).get(i)));
				fragmentcontainertransition = ((FragmentContainerTransition) ((View)arraymap1.get(obj1)));
				if(fragmentcontainertransition == null)
					arraymap.remove(obj1);
				else
	//*  76  144:goto            65
				if(!((String) (obj1)).equals(((Object) (ViewCompat.getTransitionName(((View) (fragmentcontainertransition)))))))
	//*  77  147:aload           5
	//*  78  149:aload_2         
	//*  79  150:invokestatic    #70  <Method String ViewCompat.getTransitionName(View)>
	//*  80  153:invokevirtual   #286 <Method boolean String.equals(Object)>
	//*  81  156:ifne            126
				{
					obj1 = ((Object) ((String)arraymap.remove(obj1)));
	//   82  159:aload_0         
	//   83  160:aload           5
	//   84  162:invokevirtual   #214 <Method Object ArrayMap.remove(Object)>
	//   85  165:checkcast       #210 <Class String>
	//   86  168:astore          5
					arraymap.put(((Object) (ViewCompat.getTransitionName(((View) (fragmentcontainertransition))))), obj1);
	//   87  170:aload_0         
	//   88  171:aload_2         
	//   89  172:invokestatic    #70  <Method String ViewCompat.getTransitionName(View)>
	//   90  175:aload           5
	//   91  177:invokevirtual   #218 <Method Object ArrayMap.put(Object, Object)>
	//   92  180:pop             
				}
				i--;
			}
		} else
	//*  93  181:goto            126
		{
			arraymap.retainAll(((Collection) (arraymap1.keySet())));
	//   94  184:aload_0         
	//   95  185:aload           4
	//   96  187:invokevirtual   #297 <Method java.util.Set ArrayMap.keySet()>
	//   97  190:invokevirtual   #273 <Method boolean ArrayMap.retainAll(Collection)>
	//   98  193:pop             
		}
		return arraymap1;
	//   99  194:aload           4
	//  100  196:areturn         
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
		Object obj3 = null;
	//    0    0:aconst_null     
	//    1    1:astore          10
		Fragment fragment = fragmentcontainertransition.lastIn;
	//    2    3:aload_3         
	//    3    4:getfield        #112 <Field Fragment FragmentTransition$FragmentContainerTransition.lastIn>
	//    4    7:astore          11
		Fragment fragment1 = fragmentcontainertransition.firstOut;
	//    5    9:aload_3         
	//    6   10:getfield        #123 <Field Fragment FragmentTransition$FragmentContainerTransition.firstOut>
	//    7   13:astore          12
		if(fragment != null)
	//*   8   15:aload           11
	//*   9   17:ifnull          29
			fragment.getView().setVisibility(0);
	//   10   20:aload           11
	//   11   22:invokevirtual   #254 <Method View Fragment.getView()>
	//   12   25:iconst_0        
	//   13   26:invokevirtual   #354 <Method void View.setVisibility(int)>
		if(fragment != null && fragment1 != null)
	//*  14   29:aload           11
	//*  15   31:ifnull          39
	//*  16   34:aload           12
	//*  17   36:ifnonnull       41
	//*  18   39:aconst_null     
	//*  19   40:areturn         
		{
			boolean flag = fragmentcontainertransition.lastInIsPop;
	//   20   41:aload_3         
	//   21   42:getfield        #116 <Field boolean FragmentTransition$FragmentContainerTransition.lastInIsPop>
	//   22   45:istore          8
			Object obj2;
			ArrayMap arraymap1;
			ArrayMap arraymap2;
			if(arraymap.isEmpty())
	//*  23   47:aload_2         
	//*  24   48:invokevirtual   #257 <Method boolean ArrayMap.isEmpty()>
	//*  25   51:ifeq            233
				obj2 = null;
	//   26   54:aconst_null     
	//   27   55:astore          9
			else
	//*  28   57:aload_2         
	//*  29   58:aload           9
	//*  30   60:aload_3         
	//*  31   61:invokestatic    #314 <Method ArrayMap captureOutSharedElements(ArrayMap, Object, FragmentTransition$FragmentContainerTransition)>
	//*  32   64:astore          14
	//*  33   66:aload_2         
	//*  34   67:aload           9
	//*  35   69:aload_3         
	//*  36   70:invokestatic    #45  <Method ArrayMap captureInSharedElements(ArrayMap, Object, FragmentTransition$FragmentContainerTransition)>
	//*  37   73:astore          13
	//*  38   75:aload_2         
	//*  39   76:invokevirtual   #257 <Method boolean ArrayMap.isEmpty()>
	//*  40   79:ifeq            247
	//*  41   82:aload           14
	//*  42   84:ifnull          92
	//*  43   87:aload           14
	//*  44   89:invokevirtual   #260 <Method void ArrayMap.clear()>
	//*  45   92:aload           13
	//*  46   94:ifnull          283
	//*  47   97:aload           13
	//*  48   99:invokevirtual   #260 <Method void ArrayMap.clear()>
	//*  49  102:aconst_null     
	//*  50  103:astore_2        
	//*  51  104:aload           6
	//*  52  106:ifnonnull       118
	//*  53  109:aload           7
	//*  54  111:ifnonnull       118
	//*  55  114:aload_2         
	//*  56  115:ifnull          39
	//*  57  118:aload           11
	//*  58  120:aload           12
	//*  59  122:iload           8
	//*  60  124:aload           14
	//*  61  126:iconst_1        
	//*  62  127:invokestatic    #40  <Method void callSharedElementStartEnd(Fragment, Fragment, boolean, ArrayMap, boolean)>
	//*  63  130:aload_2         
	//*  64  131:ifnull          275
	//*  65  134:aload           5
	//*  66  136:aload_1         
	//*  67  137:invokevirtual   #81  <Method boolean ArrayList.add(Object)>
	//*  68  140:pop             
	//*  69  141:aload_2         
	//*  70  142:aload_1         
	//*  71  143:aload           4
	//*  72  145:invokestatic    #332 <Method void FragmentTransitionCompat21.setSharedElementTargets(Object, View, ArrayList)>
	//*  73  148:aload_2         
	//*  74  149:aload           7
	//*  75  151:aload           14
	//*  76  153:aload_3         
	//*  77  154:getfield        #151 <Field boolean FragmentTransition$FragmentContainerTransition.firstOutIsPop>
	//*  78  157:aload_3         
	//*  79  158:getfield        #154 <Field BackStackRecord FragmentTransition$FragmentContainerTransition.firstOutTransaction>
	//*  80  161:invokestatic    #336 <Method void setOutEpicenter(Object, Object, ArrayMap, boolean, BackStackRecord)>
	//*  81  164:new             #327 <Class Rect>
	//*  82  167:dup             
	//*  83  168:invokespecial   #328 <Method void Rect()>
	//*  84  171:astore          4
	//*  85  173:aload           13
	//*  86  175:aload_3         
	//*  87  176:aload           6
	//*  88  178:iload           8
	//*  89  180:invokestatic    #50  <Method View getInEpicenterView(ArrayMap, FragmentTransition$FragmentContainerTransition, Object, boolean)>
	//*  90  183:astore          5
	//*  91  185:aload           5
	//*  92  187:astore_1        
	//*  93  188:aload           4
	//*  94  190:astore_3        
	//*  95  191:aload           5
	//*  96  193:ifnull          209
	//*  97  196:aload           6
	//*  98  198:aload           4
	//*  99  200:invokestatic    #340 <Method void FragmentTransitionCompat21.setEpicenter(Object, Rect)>
	//* 100  203:aload           4
	//* 101  205:astore_3        
	//* 102  206:aload           5
	//* 103  208:astore_1        
	//* 104  209:aload_0         
	//* 105  210:new             #10  <Class FragmentTransition$3>
	//* 106  213:dup             
	//* 107  214:aload           11
	//* 108  216:aload           12
	//* 109  218:iload           8
	//* 110  220:aload           13
	//* 111  222:aload_1         
	//* 112  223:aload_3         
	//* 113  224:invokespecial   #357 <Method void FragmentTransition$3(Fragment, Fragment, boolean, ArrayMap, View, Rect)>
	//* 114  227:invokestatic    #348 <Method OneShotPreDrawListener OneShotPreDrawListener.add(View, Runnable)>
	//* 115  230:pop             
	//* 116  231:aload_2         
	//* 117  232:areturn         
				obj2 = getSharedElementTransition(fragment, fragment1, flag);
	//  118  233:aload           11
	//  119  235:aload           12
	//  120  237:iload           8
	//  121  239:invokestatic    #318 <Method Object getSharedElementTransition(Fragment, Fragment, boolean)>
	//  122  242:astore          9
			arraymap2 = captureOutSharedElements(arraymap, obj2, fragmentcontainertransition);
			arraymap1 = captureInSharedElements(arraymap, obj2, fragmentcontainertransition);
			if(arraymap.isEmpty())
			{
				if(arraymap2 != null)
					arraymap2.clear();
				if(arraymap1 != null)
				{
					arraymap1.clear();
					arraymap = null;
				} else
	//* 123  244:goto            57
	//* 124  247:aload           4
	//* 125  249:aload           14
	//* 126  251:aload_2         
	//* 127  252:invokevirtual   #297 <Method java.util.Set ArrayMap.keySet()>
	//* 128  255:invokestatic    #359 <Method void addSharedElementsWithMatchingNames(ArrayList, ArrayMap, Collection)>
	//* 129  258:aload           5
	//* 130  260:aload           13
	//* 131  262:aload_2         
	//* 132  263:invokevirtual   #322 <Method Collection ArrayMap.values()>
	//* 133  266:invokestatic    #359 <Method void addSharedElementsWithMatchingNames(ArrayList, ArrayMap, Collection)>
	//* 134  269:aload           9
	//* 135  271:astore_2        
	//* 136  272:goto            104
	//* 137  275:aconst_null     
	//* 138  276:astore_3        
	//* 139  277:aload           10
	//* 140  279:astore_1        
	//* 141  280:goto            209
				{
					arraymap = null;
	//  142  283:aconst_null     
	//  143  284:astore_2        
				}
			} else
			{
				addSharedElementsWithMatchingNames(arraylist, arraymap2, ((Collection) (arraymap.keySet())));
				addSharedElementsWithMatchingNames(arraylist1, arraymap1, arraymap.values());
				arraymap = ((ArrayMap) (obj2));
			}
			if(obj != null || obj1 != null || arraymap != null)
			{
				callSharedElementStartEnd(fragment, fragment1, flag, arraymap2, true);
				if(arraymap != null)
				{
					arraylist1.add(((Object) (view)));
					FragmentTransitionCompat21.setSharedElementTargets(((Object) (arraymap)), view, arraylist);
					setOutEpicenter(((Object) (arraymap)), obj1, arraymap2, fragmentcontainertransition.firstOutIsPop, fragmentcontainertransition.firstOutTransaction);
					arraylist = ((ArrayList) (new Rect()));
					arraylist1 = ((ArrayList) (getInEpicenterView(arraymap1, fragmentcontainertransition, obj, flag)));
					view = ((View) (arraylist1));
					fragmentcontainertransition = ((FragmentContainerTransition) (arraylist));
					if(arraylist1 != null)
					{
						FragmentTransitionCompat21.setEpicenter(obj, ((Rect) (arraylist)));
						fragmentcontainertransition = ((FragmentContainerTransition) (arraylist));
						view = ((View) (arraylist1));
					}
				} else
				{
					fragmentcontainertransition = null;
					view = ((View) (obj3));
				}
				OneShotPreDrawListener.add(((View) (viewgroup)), new Runnable(fragment, fragment1, flag, arraymap1, view, ((Rect) (fragmentcontainertransition))) {

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
				return ((Object) (arraymap));
			}
		}
		return ((Object) (null));
	//* 144  285:goto            104
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
	//*  69  144:ifeq            240
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
	//* 118  240:goto            149
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

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
		boolean flag3;
		Object obj;
		Fragment fragment;
label0:
		{
			fragment = op.fragment;
	//    0    0:aload_1         
	//    1    1:getfield        #91  <Field Fragment BackStackRecord$Op.fragment>
	//    2    4:astore          16
			if(fragment == null)
	//*   3    6:aload           16
	//*   4    8:ifnonnull       12
				return;
	//    5   11:return          
			int j = fragment.mContainerId;
	//    6   12:aload           16
	//    7   14:getfield        #97  <Field int Fragment.mContainerId>
	//    8   17:istore          12
			if(j == 0)
	//*   9   19:iload           12
	//*  10   21:ifne            25
				return;
	//   11   24:return          
			int i;
			if(flag)
	//*  12   25:iload_3         
	//*  13   26:ifeq            42
				i = INVERSE_OPS[op.cmd];
	//   14   29:getstatic       #21  <Field int[] INVERSE_OPS>
	//   15   32:aload_1         
	//   16   33:getfield        #100 <Field int BackStackRecord$Op.cmd>
	//   17   36:iaload          
	//   18   37:istore          8
			else
	//*  19   39:goto            48
				i = op.cmd;
	//   20   42:aload_1         
	//   21   43:getfield        #100 <Field int BackStackRecord$Op.cmd>
	//   22   46:istore          8
			boolean flag9 = false;
	//   23   48:iconst_0        
	//   24   49:istore          14
			boolean flag6 = false;
	//   25   51:iconst_0        
	//   26   52:istore          10
			boolean flag7 = false;
	//   27   54:iconst_0        
	//   28   55:istore          11
			boolean flag5 = false;
	//   29   57:iconst_0        
	//   30   58:istore          9
			boolean flag8 = flag9;
	//   31   60:iload           14
	//   32   62:istore          13
			flag3 = flag6;
	//   33   64:iload           10
	//   34   66:istore          6
			boolean flag2 = flag7;
	//   35   68:iload           11
	//   36   70:istore          5
			boolean flag4 = flag5;
	//   37   72:iload           9
	//   38   74:istore          7
			switch(i)
	//*  39   76:iload           8
			{
	//*  40   78:tableswitch     1 7: default 120
	//	               1 201
	//	               2 425
	//	               3 335
	//	               4 255
	//	               5 139
	//	               6 335
	//	               7 201
			default:
				flag8 = flag9;
	//   41  120:iload           14
	//   42  122:istore          13
				flag3 = flag6;
	//   43  124:iload           10
	//   44  126:istore          6
				flag2 = flag7;
	//   45  128:iload           11
	//   46  130:istore          5
				flag4 = flag5;
	//   47  132:iload           9
	//   48  134:istore          7
				break;
	//   49  136:goto            425

			case 2: // '\002'
				break;

			case 5: // '\005'
				if(flag1)
	//*  50  139:iload           4
	//*  51  141:ifeq            180
				{
					if(fragment.mHiddenChanged && !fragment.mHidden && fragment.mAdded)
	//*  52  144:aload           16
	//*  53  146:getfield        #104 <Field boolean Fragment.mHiddenChanged>
	//*  54  149:ifeq            174
	//*  55  152:aload           16
	//*  56  154:getfield        #107 <Field boolean Fragment.mHidden>
	//*  57  157:ifne            174
	//*  58  160:aload           16
	//*  59  162:getfield        #110 <Field boolean Fragment.mAdded>
	//*  60  165:ifeq            174
						flag8 = true;
	//   61  168:iconst_1        
	//   62  169:istore          13
					else
	//*  63  171:goto            177
						flag8 = false;
	//   64  174:iconst_0        
	//   65  175:istore          13
				} else
	//*  66  177:goto            187
				{
					flag8 = fragment.mHidden;
	//   67  180:aload           16
	//   68  182:getfield        #107 <Field boolean Fragment.mHidden>
	//   69  185:istore          13
				}
				flag4 = true;
	//   70  187:iconst_1        
	//   71  188:istore          7
				flag3 = flag6;
	//   72  190:iload           10
	//   73  192:istore          6
				flag2 = flag7;
	//   74  194:iload           11
	//   75  196:istore          5
				break;
	//   76  198:goto            425

			case 1: // '\001'
			case 7: // '\007'
				if(flag1)
	//*  77  201:iload           4
	//*  78  203:ifeq            216
					flag8 = fragment.mIsNewlyAdded;
	//   79  206:aload           16
	//   80  208:getfield        #113 <Field boolean Fragment.mIsNewlyAdded>
	//   81  211:istore          13
				else
	//*  82  213:goto            241
				if(!fragment.mAdded && !fragment.mHidden)
	//*  83  216:aload           16
	//*  84  218:getfield        #110 <Field boolean Fragment.mAdded>
	//*  85  221:ifne            238
	//*  86  224:aload           16
	//*  87  226:getfield        #107 <Field boolean Fragment.mHidden>
	//*  88  229:ifne            238
					flag8 = true;
	//   89  232:iconst_1        
	//   90  233:istore          13
				else
	//*  91  235:goto            241
					flag8 = false;
	//   92  238:iconst_0        
	//   93  239:istore          13
				flag4 = true;
	//   94  241:iconst_1        
	//   95  242:istore          7
				flag3 = flag6;
	//   96  244:iload           10
	//   97  246:istore          6
				flag2 = flag7;
	//   98  248:iload           11
	//   99  250:istore          5
				break;
	//  100  252:goto            425

			case 4: // '\004'
				if(flag1)
	//* 101  255:iload           4
	//* 102  257:ifeq            296
				{
					if(fragment.mHiddenChanged && fragment.mAdded && fragment.mHidden)
	//* 103  260:aload           16
	//* 104  262:getfield        #104 <Field boolean Fragment.mHiddenChanged>
	//* 105  265:ifeq            290
	//* 106  268:aload           16
	//* 107  270:getfield        #110 <Field boolean Fragment.mAdded>
	//* 108  273:ifeq            290
	//* 109  276:aload           16
	//* 110  278:getfield        #107 <Field boolean Fragment.mHidden>
	//* 111  281:ifeq            290
						flag2 = true;
	//  112  284:iconst_1        
	//  113  285:istore          5
					else
	//* 114  287:goto            293
						flag2 = false;
	//  115  290:iconst_0        
	//  116  291:istore          5
				} else
	//* 117  293:goto            321
				if(fragment.mAdded && !fragment.mHidden)
	//* 118  296:aload           16
	//* 119  298:getfield        #110 <Field boolean Fragment.mAdded>
	//* 120  301:ifeq            318
	//* 121  304:aload           16
	//* 122  306:getfield        #107 <Field boolean Fragment.mHidden>
	//* 123  309:ifne            318
					flag2 = true;
	//  124  312:iconst_1        
	//  125  313:istore          5
				else
	//* 126  315:goto            321
					flag2 = false;
	//  127  318:iconst_0        
	//  128  319:istore          5
				flag3 = true;
	//  129  321:iconst_1        
	//  130  322:istore          6
				flag8 = flag9;
	//  131  324:iload           14
	//  132  326:istore          13
				flag4 = flag5;
	//  133  328:iload           9
	//  134  330:istore          7
				break;
	//  135  332:goto            425

			case 3: // '\003'
			case 6: // '\006'
				if(flag1)
	//* 136  335:iload           4
	//* 137  337:ifeq            389
				{
					if(!fragment.mAdded && fragment.mView != null && fragment.mView.getVisibility() == 0 && fragment.mPostponedAlpha >= 0.0F)
	//* 138  340:aload           16
	//* 139  342:getfield        #110 <Field boolean Fragment.mAdded>
	//* 140  345:ifne            383
	//* 141  348:aload           16
	//* 142  350:getfield        #117 <Field View Fragment.mView>
	//* 143  353:ifnull          383
	//* 144  356:aload           16
	//* 145  358:getfield        #117 <Field View Fragment.mView>
	//* 146  361:invokevirtual   #120 <Method int View.getVisibility()>
	//* 147  364:ifne            383
	//* 148  367:aload           16
	//* 149  369:getfield        #124 <Field float Fragment.mPostponedAlpha>
	//* 150  372:fconst_0        
	//* 151  373:fcmpl           
	//* 152  374:iflt            383
						flag2 = true;
	//  153  377:iconst_1        
	//  154  378:istore          5
					else
	//* 155  380:goto            386
						flag2 = false;
	//  156  383:iconst_0        
	//  157  384:istore          5
				} else
	//* 158  386:goto            414
				if(fragment.mAdded && !fragment.mHidden)
	//* 159  389:aload           16
	//* 160  391:getfield        #110 <Field boolean Fragment.mAdded>
	//* 161  394:ifeq            411
	//* 162  397:aload           16
	//* 163  399:getfield        #107 <Field boolean Fragment.mHidden>
	//* 164  402:ifne            411
					flag2 = true;
	//  165  405:iconst_1        
	//  166  406:istore          5
				else
	//* 167  408:goto            414
					flag2 = false;
	//  168  411:iconst_0        
	//  169  412:istore          5
				flag3 = true;
	//  170  414:iconst_1        
	//  171  415:istore          6
				flag4 = flag5;
	//  172  417:iload           9
	//  173  419:istore          7
				flag8 = flag9;
	//  174  421:iload           14
	//  175  423:istore          13
				break;
			}
			obj = ((Object) ((FragmentContainerTransition)sparsearray.get(j)));
	//  176  425:aload_2         
	//  177  426:iload           12
	//  178  428:invokevirtual   #129 <Method Object SparseArray.get(int)>
	//  179  431:checkcast       #14  <Class FragmentTransition$FragmentContainerTransition>
	//  180  434:astore          15
			op = ((BackStackRecord.Op) (obj));
	//  181  436:aload           15
	//  182  438:astore_1        
			if(flag8)
	//* 183  439:iload           13
	//* 184  441:ifeq            469
			{
				op = ((BackStackRecord.Op) (ensureContainer(((FragmentContainerTransition) (obj)), sparsearray, j)));
	//  185  444:aload           15
	//  186  446:aload_2         
	//  187  447:iload           12
	//  188  449:invokestatic    #133 <Method FragmentTransition$FragmentContainerTransition ensureContainer(FragmentTransition$FragmentContainerTransition, SparseArray, int)>
	//  189  452:astore_1        
				op.lastIn = fragment;
	//  190  453:aload_1         
	//  191  454:aload           16
	//  192  456:putfield        #136 <Field Fragment FragmentTransition$FragmentContainerTransition.lastIn>
				op.lastInIsPop = flag;
	//  193  459:aload_1         
	//  194  460:iload_3         
	//  195  461:putfield        #139 <Field boolean FragmentTransition$FragmentContainerTransition.lastInIsPop>
				op.lastInTransaction = backstackrecord;
	//  196  464:aload_1         
	//  197  465:aload_0         
	//  198  466:putfield        #143 <Field BackStackRecord FragmentTransition$FragmentContainerTransition.lastInTransaction>
			}
			if(!flag1 && flag4)
	//* 199  469:iload           4
	//* 200  471:ifne            546
	//* 201  474:iload           7
	//* 202  476:ifeq            546
			{
				if(op != null && ((FragmentContainerTransition) (op)).firstOut == fragment)
	//* 203  479:aload_1         
	//* 204  480:ifnull          497
	//* 205  483:aload_1         
	//* 206  484:getfield        #146 <Field Fragment FragmentTransition$FragmentContainerTransition.firstOut>
	//* 207  487:aload           16
	//* 208  489:if_acmpne       497
					op.firstOut = null;
	//  209  492:aload_1         
	//  210  493:aconst_null     
	//  211  494:putfield        #146 <Field Fragment FragmentTransition$FragmentContainerTransition.firstOut>
				obj = ((Object) (backstackrecord.mManager));
	//  212  497:aload_0         
	//  213  498:getfield        #152 <Field FragmentManagerImpl BackStackRecord.mManager>
	//  214  501:astore          15
				if(fragment.mState < 1 && ((FragmentManagerImpl) (obj)).mCurState >= 1 && !backstackrecord.mAllowOptimization)
	//* 215  503:aload           16
	//* 216  505:getfield        #155 <Field int Fragment.mState>
	//* 217  508:iconst_1        
	//* 218  509:icmpge          546
	//* 219  512:aload           15
	//* 220  514:getfield        #160 <Field int FragmentManagerImpl.mCurState>
	//* 221  517:iconst_1        
	//* 222  518:icmplt          546
	//* 223  521:aload_0         
	//* 224  522:getfield        #163 <Field boolean BackStackRecord.mAllowOptimization>
	//* 225  525:ifne            546
				{
					((FragmentManagerImpl) (obj)).makeActive(fragment);
	//  226  528:aload           15
	//  227  530:aload           16
	//  228  532:invokevirtual   #167 <Method void FragmentManagerImpl.makeActive(Fragment)>
					((FragmentManagerImpl) (obj)).moveToState(fragment, 1, 0, 0, false);
	//  229  535:aload           15
	//  230  537:aload           16
	//  231  539:iconst_1        
	//  232  540:iconst_0        
	//  233  541:iconst_0        
	//  234  542:iconst_0        
	//  235  543:invokevirtual   #171 <Method void FragmentManagerImpl.moveToState(Fragment, int, int, int, boolean)>
				}
			}
			obj = ((Object) (op));
	//  236  546:aload_1         
	//  237  547:astore          15
			if(!flag2)
				break label0;
	//  238  549:iload           5
	//  239  551:ifeq            596
			if(op != null)
	//* 240  554:aload_1         
	//* 241  555:ifnull          568
			{
				obj = ((Object) (op));
	//  242  558:aload_1         
	//  243  559:astore          15
				if(((FragmentContainerTransition) (op)).firstOut != null)
					break label0;
	//  244  561:aload_1         
	//  245  562:getfield        #146 <Field Fragment FragmentTransition$FragmentContainerTransition.firstOut>
	//  246  565:ifnonnull       596
			}
			obj = ((Object) (ensureContainer(((FragmentContainerTransition) (op)), sparsearray, j)));
	//  247  568:aload_1         
	//  248  569:aload_2         
	//  249  570:iload           12
	//  250  572:invokestatic    #133 <Method FragmentTransition$FragmentContainerTransition ensureContainer(FragmentTransition$FragmentContainerTransition, SparseArray, int)>
	//  251  575:astore          15
			obj.firstOut = fragment;
	//  252  577:aload           15
	//  253  579:aload           16
	//  254  581:putfield        #146 <Field Fragment FragmentTransition$FragmentContainerTransition.firstOut>
			obj.firstOutIsPop = flag;
	//  255  584:aload           15
	//  256  586:iload_3         
	//  257  587:putfield        #174 <Field boolean FragmentTransition$FragmentContainerTransition.firstOutIsPop>
			obj.firstOutTransaction = backstackrecord;
	//  258  590:aload           15
	//  259  592:aload_0         
	//  260  593:putfield        #177 <Field BackStackRecord FragmentTransition$FragmentContainerTransition.firstOutTransaction>
		}
		if(!flag1 && flag3 && obj != null && ((FragmentContainerTransition) (obj)).lastIn == fragment)
	//* 261  596:iload           4
	//* 262  598:ifne            627
	//* 263  601:iload           6
	//* 264  603:ifeq            627
	//* 265  606:aload           15
	//* 266  608:ifnull          627
	//* 267  611:aload           15
	//* 268  613:getfield        #136 <Field Fragment FragmentTransition$FragmentContainerTransition.lastIn>
	//* 269  616:aload           16
	//* 270  618:if_acmpne       627
			obj.lastIn = null;
	//  271  621:aload           15
	//  272  623:aconst_null     
	//  273  624:putfield        #136 <Field Fragment FragmentTransition$FragmentContainerTransition.lastIn>
	//  274  627:return          
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
	//   13   24:invokevirtual   #186 <Method Object ArrayList.get(int)>
	//   14   27:checkcast       #148 <Class BackStackRecord>
	//   15   30:astore          11
			if(!backstackrecord.interactsWith(i))
	//*  16   32:aload           11
	//*  17   34:iload_0         
	//*  18   35:invokevirtual   #196 <Method boolean BackStackRecord.interactsWith(int)>
	//*  19   38:ifne            44
				continue;
	//   20   41:goto            195
			boolean flag = ((Boolean)arraylist1.get(k)).booleanValue();
	//   21   44:aload_2         
	//   22   45:iload           4
	//   23   47:invokevirtual   #186 <Method Object ArrayList.get(int)>
	//   24   50:checkcast       #198 <Class Boolean>
	//   25   53:invokevirtual   #202 <Method boolean Boolean.booleanValue()>
	//   26   56:istore          7
			if(backstackrecord.mSharedElementSourceNames == null)
				continue;
	//   27   58:aload           11
	//   28   60:getfield        #205 <Field ArrayList BackStackRecord.mSharedElementSourceNames>
	//   29   63:ifnull          195
			int i1 = backstackrecord.mSharedElementSourceNames.size();
	//   30   66:aload           11
	//   31   68:getfield        #205 <Field ArrayList BackStackRecord.mSharedElementSourceNames>
	//   32   71:invokevirtual   #185 <Method int ArrayList.size()>
	//   33   74:istore          6
			ArrayList arraylist2;
			ArrayList arraylist3;
			if(flag)
	//*  34   76:iload           7
	//*  35   78:ifeq            98
			{
				arraylist3 = backstackrecord.mSharedElementSourceNames;
	//   36   81:aload           11
	//   37   83:getfield        #205 <Field ArrayList BackStackRecord.mSharedElementSourceNames>
	//   38   86:astore          9
				arraylist2 = backstackrecord.mSharedElementTargetNames;
	//   39   88:aload           11
	//   40   90:getfield        #208 <Field ArrayList BackStackRecord.mSharedElementTargetNames>
	//   41   93:astore          8
			} else
	//*  42   95:goto            112
			{
				arraylist2 = backstackrecord.mSharedElementSourceNames;
	//   43   98:aload           11
	//   44  100:getfield        #205 <Field ArrayList BackStackRecord.mSharedElementSourceNames>
	//   45  103:astore          8
				arraylist3 = backstackrecord.mSharedElementTargetNames;
	//   46  105:aload           11
	//   47  107:getfield        #208 <Field ArrayList BackStackRecord.mSharedElementTargetNames>
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
	//   56  126:invokevirtual   #186 <Method Object ArrayList.get(int)>
	//   57  129:checkcast       #210 <Class String>
	//   58  132:astore          11
				String s1 = (String)arraylist3.get(l);
	//   59  134:aload           9
	//   60  136:iload           5
	//   61  138:invokevirtual   #186 <Method Object ArrayList.get(int)>
	//   62  141:checkcast       #210 <Class String>
	//   63  144:astore          12
				String s2 = (String)arraymap.remove(((Object) (s1)));
	//   64  146:aload           10
	//   65  148:aload           12
	//   66  150:invokevirtual   #214 <Method Object ArrayMap.remove(Object)>
	//   67  153:checkcast       #210 <Class String>
	//   68  156:astore          13
				if(s2 != null)
	//*  69  158:aload           13
	//*  70  160:ifnull          176
					arraymap.put(((Object) (s)), ((Object) (s2)));
	//   71  163:aload           10
	//   72  165:aload           11
	//   73  167:aload           13
	//   74  169:invokevirtual   #218 <Method Object ArrayMap.put(Object, Object)>
	//   75  172:pop             
				else
	//*  76  173:goto            186
					arraymap.put(((Object) (s)), ((Object) (s1)));
	//   77  176:aload           10
	//   78  178:aload           11
	//   79  180:aload           12
	//   80  182:invokevirtual   #218 <Method Object ArrayMap.put(Object, Object)>
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
	//*   1    1:getfield        #152 <Field FragmentManagerImpl BackStackRecord.mManager>
	//*   2    4:getfield        #224 <Field FragmentContainer FragmentManagerImpl.mContainer>
	//*   3    7:invokevirtual   #229 <Method boolean FragmentContainer.onHasView()>
	//*   4   10:ifne            14
			return;
	//    5   13:return          
		for(int i = backstackrecord.mOps.size() - 1; i >= 0; i--)
	//*   6   14:aload_0         
	//*   7   15:getfield        #184 <Field ArrayList BackStackRecord.mOps>
	//*   8   18:invokevirtual   #185 <Method int ArrayList.size()>
	//*   9   21:iconst_1        
	//*  10   22:isub            
	//*  11   23:istore_3        
	//*  12   24:iload_3         
	//*  13   25:iflt            53
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

	//   24   46:iload_3         
	//   25   47:iconst_1        
	//   26   48:isub            
	//   27   49:istore_3        
	//*  28   50:goto            24
	//   29   53:return          
	}

	private static void callSharedElementStartEnd(Fragment fragment, Fragment fragment1, boolean flag, ArrayMap arraymap, boolean flag1)
	{
		if(flag)
	//*   0    0:iload_2         
	//*   1    1:ifeq            12
			fragment = ((Fragment) (fragment1.getEnterTransitionCallback()));
	//    2    4:aload_1         
	//    3    5:invokevirtual   #233 <Method SharedElementCallback Fragment.getEnterTransitionCallback()>
	//    4    8:astore_0        
		else
	//*   5    9:goto            17
			fragment = ((Fragment) (fragment.getEnterTransitionCallback()));
	//    6   12:aload_0         
	//    7   13:invokevirtual   #233 <Method SharedElementCallback Fragment.getEnterTransitionCallback()>
	//    8   16:astore_0        
		if(fragment != null)
	//*   9   17:aload_0         
	//*  10   18:ifnull          118
		{
			fragment1 = ((Fragment) (new ArrayList()));
	//   11   21:new             #78  <Class ArrayList>
	//   12   24:dup             
	//   13   25:invokespecial   #234 <Method void ArrayList()>
	//   14   28:astore_1        
			ArrayList arraylist = new ArrayList();
	//   15   29:new             #78  <Class ArrayList>
	//   16   32:dup             
	//   17   33:invokespecial   #234 <Method void ArrayList()>
	//   18   36:astore          7
			int i;
			if(arraymap == null)
	//*  19   38:aload_3         
	//*  20   39:ifnonnull       48
				i = 0;
	//   21   42:iconst_0        
	//   22   43:istore          5
			else
	//*  23   45:goto            54
				i = arraymap.size();
	//   24   48:aload_3         
	//   25   49:invokevirtual   #58  <Method int ArrayMap.size()>
	//   26   52:istore          5
			for(int j = 0; j < i; j++)
	//*  27   54:iconst_0        
	//*  28   55:istore          6
	//*  29   57:iload           6
	//*  30   59:iload           5
	//*  31   61:icmpge          96
			{
				arraylist.add(arraymap.keyAt(j));
	//   32   64:aload           7
	//   33   66:aload_3         
	//   34   67:iload           6
	//   35   69:invokevirtual   #237 <Method Object ArrayMap.keyAt(int)>
	//   36   72:invokevirtual   #81  <Method boolean ArrayList.add(Object)>
	//   37   75:pop             
				((ArrayList) (fragment1)).add(arraymap.valueAt(j));
	//   38   76:aload_1         
	//   39   77:aload_3         
	//   40   78:iload           6
	//   41   80:invokevirtual   #62  <Method Object ArrayMap.valueAt(int)>
	//   42   83:invokevirtual   #81  <Method boolean ArrayList.add(Object)>
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
				((SharedElementCallback) (fragment)).onSharedElementStart(((java.util.List) (arraylist)), ((java.util.List) (fragment1)), ((java.util.List) (null)));
	//   51  101:aload_0         
	//   52  102:aload           7
	//   53  104:aload_1         
	//   54  105:aconst_null     
	//   55  106:invokevirtual   #243 <Method void SharedElementCallback.onSharedElementStart(java.util.List, java.util.List, java.util.List)>
				return;
	//   56  109:return          
			}
			((SharedElementCallback) (fragment)).onSharedElementEnd(((java.util.List) (arraylist)), ((java.util.List) (fragment1)), ((java.util.List) (null)));
	//   57  110:aload_0         
	//   58  111:aload           7
	//   59  113:aload_1         
	//   60  114:aconst_null     
	//   61  115:invokevirtual   #246 <Method void SharedElementCallback.onSharedElementEnd(java.util.List, java.util.List, java.util.List)>
		}
	//   62  118:return          
	}

	private static ArrayMap captureInSharedElements(ArrayMap arraymap, Object obj, FragmentContainerTransition fragmentcontainertransition)
	{
		Fragment fragment = fragmentcontainertransition.lastIn;
	//    0    0:aload_2         
	//    1    1:getfield        #136 <Field Fragment FragmentTransition$FragmentContainerTransition.lastIn>
	//    2    4:astore          5
		View view = fragment.getView();
	//    3    6:aload           5
	//    4    8:invokevirtual   #251 <Method View Fragment.getView()>
	//    5   11:astore          6
		if(arraymap.isEmpty() || obj == null || view == null)
	//*   6   13:aload_0         
	//*   7   14:invokevirtual   #254 <Method boolean ArrayMap.isEmpty()>
	//*   8   17:ifne            29
	//*   9   20:aload_1         
	//*  10   21:ifnull          29
	//*  11   24:aload           6
	//*  12   26:ifnonnull       35
		{
			arraymap.clear();
	//   13   29:aload_0         
	//   14   30:invokevirtual   #257 <Method void ArrayMap.clear()>
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
	//   23   48:invokestatic    #263 <Method void FragmentTransitionCompat21.findNamedViews(java.util.Map, View)>
		obj = ((Object) (fragmentcontainertransition.lastInTransaction));
	//   24   51:aload_2         
	//   25   52:getfield        #143 <Field BackStackRecord FragmentTransition$FragmentContainerTransition.lastInTransaction>
	//   26   55:astore_1        
		if(fragmentcontainertransition.lastInIsPop)
	//*  27   56:aload_2         
	//*  28   57:getfield        #139 <Field boolean FragmentTransition$FragmentContainerTransition.lastInIsPop>
	//*  29   60:ifeq            77
		{
			fragmentcontainertransition = ((FragmentContainerTransition) (fragment.getExitTransitionCallback()));
	//   30   63:aload           5
	//   31   65:invokevirtual   #266 <Method SharedElementCallback Fragment.getExitTransitionCallback()>
	//   32   68:astore_2        
			obj = ((Object) (((BackStackRecord) (obj)).mSharedElementSourceNames));
	//   33   69:aload_1         
	//   34   70:getfield        #205 <Field ArrayList BackStackRecord.mSharedElementSourceNames>
	//   35   73:astore_1        
		} else
	//*  36   74:goto            88
		{
			fragmentcontainertransition = ((FragmentContainerTransition) (fragment.getEnterTransitionCallback()));
	//   37   77:aload           5
	//   38   79:invokevirtual   #233 <Method SharedElementCallback Fragment.getEnterTransitionCallback()>
	//   39   82:astore_2        
			obj = ((Object) (((BackStackRecord) (obj)).mSharedElementTargetNames));
	//   40   83:aload_1         
	//   41   84:getfield        #208 <Field ArrayList BackStackRecord.mSharedElementTargetNames>
	//   42   87:astore_1        
		}
		arraymap1.retainAll(((Collection) (obj)));
	//   43   88:aload           4
	//   44   90:aload_1         
	//   45   91:invokevirtual   #270 <Method boolean ArrayMap.retainAll(Collection)>
	//   46   94:pop             
		if(fragmentcontainertransition != null)
	//*  47   95:aload_2         
	//*  48   96:ifnull          208
		{
			((SharedElementCallback) (fragmentcontainertransition)).onMapSharedElements(((java.util.List) (obj)), ((java.util.Map) (arraymap1)));
	//   49   99:aload_2         
	//   50  100:aload_1         
	//   51  101:aload           4
	//   52  103:invokevirtual   #274 <Method void SharedElementCallback.onMapSharedElements(java.util.List, java.util.Map)>
			for(int i = ((ArrayList) (obj)).size() - 1; i >= 0; i--)
	//*  53  106:aload_1         
	//*  54  107:invokevirtual   #185 <Method int ArrayList.size()>
	//*  55  110:iconst_1        
	//*  56  111:isub            
	//*  57  112:istore_3        
	//*  58  113:iload_3         
	//*  59  114:iflt            205
			{
				String s = (String)((ArrayList) (obj)).get(i);
	//   60  117:aload_1         
	//   61  118:iload_3         
	//   62  119:invokevirtual   #186 <Method Object ArrayList.get(int)>
	//   63  122:checkcast       #210 <Class String>
	//   64  125:astore          5
				fragmentcontainertransition = ((FragmentContainerTransition) ((View)arraymap1.get(((Object) (s)))));
	//   65  127:aload           4
	//   66  129:aload           5
	//   67  131:invokevirtual   #276 <Method Object ArrayMap.get(Object)>
	//   68  134:checkcast       #64  <Class View>
	//   69  137:astore_2        
				if(fragmentcontainertransition == null)
	//*  70  138:aload_2         
	//*  71  139:ifnonnull       162
				{
					fragmentcontainertransition = ((FragmentContainerTransition) (findKeyForValue(arraymap, s)));
	//   72  142:aload_0         
	//   73  143:aload           5
	//   74  145:invokestatic    #280 <Method String findKeyForValue(ArrayMap, String)>
	//   75  148:astore_2        
					if(fragmentcontainertransition != null)
	//*  76  149:aload_2         
	//*  77  150:ifnull          159
						arraymap.remove(((Object) (fragmentcontainertransition)));
	//   78  153:aload_0         
	//   79  154:aload_2         
	//   80  155:invokevirtual   #214 <Method Object ArrayMap.remove(Object)>
	//   81  158:pop             
					continue;
	//   82  159:goto            198
				}
				if(s.equals(((Object) (ViewCompat.getTransitionName(((View) (fragmentcontainertransition)))))))
					continue;
	//   83  162:aload           5
	//   84  164:aload_2         
	//   85  165:invokestatic    #70  <Method String ViewCompat.getTransitionName(View)>
	//   86  168:invokevirtual   #283 <Method boolean String.equals(Object)>
	//   87  171:ifne            198
				s = findKeyForValue(arraymap, s);
	//   88  174:aload_0         
	//   89  175:aload           5
	//   90  177:invokestatic    #280 <Method String findKeyForValue(ArrayMap, String)>
	//   91  180:astore          5
				if(s != null)
	//*  92  182:aload           5
	//*  93  184:ifnull          198
					arraymap.put(((Object) (s)), ((Object) (ViewCompat.getTransitionName(((View) (fragmentcontainertransition))))));
	//   94  187:aload_0         
	//   95  188:aload           5
	//   96  190:aload_2         
	//   97  191:invokestatic    #70  <Method String ViewCompat.getTransitionName(View)>
	//   98  194:invokevirtual   #218 <Method Object ArrayMap.put(Object, Object)>
	//   99  197:pop             
			}

	//  100  198:iload_3         
	//  101  199:iconst_1        
	//  102  200:isub            
	//  103  201:istore_3        
	//* 104  202:goto            113
			return arraymap1;
	//  105  205:aload           4
	//  106  207:areturn         
		} else
		{
			retainValues(arraymap, arraymap1);
	//  107  208:aload_0         
	//  108  209:aload           4
	//  109  211:invokestatic    #287 <Method void retainValues(ArrayMap, ArrayMap)>
			return arraymap1;
	//  110  214:aload           4
	//  111  216:areturn         
		}
	}

	private static ArrayMap captureOutSharedElements(ArrayMap arraymap, Object obj, FragmentContainerTransition fragmentcontainertransition)
	{
		if(arraymap.isEmpty() || obj == null)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #254 <Method boolean ArrayMap.isEmpty()>
	//*   2    4:ifne            11
	//*   3    7:aload_1         
	//*   4    8:ifnonnull       17
		{
			arraymap.clear();
	//    5   11:aload_0         
	//    6   12:invokevirtual   #257 <Method void ArrayMap.clear()>
			return null;
	//    7   15:aconst_null     
	//    8   16:areturn         
		}
		Fragment fragment = fragmentcontainertransition.firstOut;
	//    9   17:aload_2         
	//   10   18:getfield        #146 <Field Fragment FragmentTransition$FragmentContainerTransition.firstOut>
	//   11   21:astore          5
		ArrayMap arraymap1 = new ArrayMap();
	//   12   23:new             #54  <Class ArrayMap>
	//   13   26:dup             
	//   14   27:invokespecial   #192 <Method void ArrayMap()>
	//   15   30:astore          4
		FragmentTransitionCompat21.findNamedViews(((java.util.Map) (arraymap1)), fragment.getView());
	//   16   32:aload           4
	//   17   34:aload           5
	//   18   36:invokevirtual   #251 <Method View Fragment.getView()>
	//   19   39:invokestatic    #263 <Method void FragmentTransitionCompat21.findNamedViews(java.util.Map, View)>
		obj = ((Object) (fragmentcontainertransition.firstOutTransaction));
	//   20   42:aload_2         
	//   21   43:getfield        #177 <Field BackStackRecord FragmentTransition$FragmentContainerTransition.firstOutTransaction>
	//   22   46:astore_1        
		if(fragmentcontainertransition.firstOutIsPop)
	//*  23   47:aload_2         
	//*  24   48:getfield        #174 <Field boolean FragmentTransition$FragmentContainerTransition.firstOutIsPop>
	//*  25   51:ifeq            68
		{
			fragmentcontainertransition = ((FragmentContainerTransition) (fragment.getEnterTransitionCallback()));
	//   26   54:aload           5
	//   27   56:invokevirtual   #233 <Method SharedElementCallback Fragment.getEnterTransitionCallback()>
	//   28   59:astore_2        
			obj = ((Object) (((BackStackRecord) (obj)).mSharedElementTargetNames));
	//   29   60:aload_1         
	//   30   61:getfield        #208 <Field ArrayList BackStackRecord.mSharedElementTargetNames>
	//   31   64:astore_1        
		} else
	//*  32   65:goto            79
		{
			fragmentcontainertransition = ((FragmentContainerTransition) (fragment.getExitTransitionCallback()));
	//   33   68:aload           5
	//   34   70:invokevirtual   #266 <Method SharedElementCallback Fragment.getExitTransitionCallback()>
	//   35   73:astore_2        
			obj = ((Object) (((BackStackRecord) (obj)).mSharedElementSourceNames));
	//   36   74:aload_1         
	//   37   75:getfield        #205 <Field ArrayList BackStackRecord.mSharedElementSourceNames>
	//   38   78:astore_1        
		}
		arraymap1.retainAll(((Collection) (obj)));
	//   39   79:aload           4
	//   40   81:aload_1         
	//   41   82:invokevirtual   #270 <Method boolean ArrayMap.retainAll(Collection)>
	//   42   85:pop             
		if(fragmentcontainertransition != null)
	//*  43   86:aload_2         
	//*  44   87:ifnull          187
		{
			((SharedElementCallback) (fragmentcontainertransition)).onMapSharedElements(((java.util.List) (obj)), ((java.util.Map) (arraymap1)));
	//   45   90:aload_2         
	//   46   91:aload_1         
	//   47   92:aload           4
	//   48   94:invokevirtual   #274 <Method void SharedElementCallback.onMapSharedElements(java.util.List, java.util.Map)>
			for(int i = ((ArrayList) (obj)).size() - 1; i >= 0; i--)
	//*  49   97:aload_1         
	//*  50   98:invokevirtual   #185 <Method int ArrayList.size()>
	//*  51  101:iconst_1        
	//*  52  102:isub            
	//*  53  103:istore_3        
	//*  54  104:iload_3         
	//*  55  105:iflt            184
			{
				String s = (String)((ArrayList) (obj)).get(i);
	//   56  108:aload_1         
	//   57  109:iload_3         
	//   58  110:invokevirtual   #186 <Method Object ArrayList.get(int)>
	//   59  113:checkcast       #210 <Class String>
	//   60  116:astore          5
				fragmentcontainertransition = ((FragmentContainerTransition) ((View)arraymap1.get(((Object) (s)))));
	//   61  118:aload           4
	//   62  120:aload           5
	//   63  122:invokevirtual   #276 <Method Object ArrayMap.get(Object)>
	//   64  125:checkcast       #64  <Class View>
	//   65  128:astore_2        
				if(fragmentcontainertransition == null)
	//*  66  129:aload_2         
	//*  67  130:ifnonnull       143
				{
					arraymap.remove(((Object) (s)));
	//   68  133:aload_0         
	//   69  134:aload           5
	//   70  136:invokevirtual   #214 <Method Object ArrayMap.remove(Object)>
	//   71  139:pop             
					continue;
	//   72  140:goto            177
				}
				if(!s.equals(((Object) (ViewCompat.getTransitionName(((View) (fragmentcontainertransition)))))))
	//*  73  143:aload           5
	//*  74  145:aload_2         
	//*  75  146:invokestatic    #70  <Method String ViewCompat.getTransitionName(View)>
	//*  76  149:invokevirtual   #283 <Method boolean String.equals(Object)>
	//*  77  152:ifne            177
				{
					s = (String)arraymap.remove(((Object) (s)));
	//   78  155:aload_0         
	//   79  156:aload           5
	//   80  158:invokevirtual   #214 <Method Object ArrayMap.remove(Object)>
	//   81  161:checkcast       #210 <Class String>
	//   82  164:astore          5
					arraymap.put(((Object) (ViewCompat.getTransitionName(((View) (fragmentcontainertransition))))), ((Object) (s)));
	//   83  166:aload_0         
	//   84  167:aload_2         
	//   85  168:invokestatic    #70  <Method String ViewCompat.getTransitionName(View)>
	//   86  171:aload           5
	//   87  173:invokevirtual   #218 <Method Object ArrayMap.put(Object, Object)>
	//   88  176:pop             
				}
			}

	//   89  177:iload_3         
	//   90  178:iconst_1        
	//   91  179:isub            
	//   92  180:istore_3        
	//*  93  181:goto            104
			return arraymap1;
	//   94  184:aload           4
	//   95  186:areturn         
		} else
		{
			arraymap.retainAll(((Collection) (arraymap1.keySet())));
	//   96  187:aload_0         
	//   97  188:aload           4
	//   98  190:invokevirtual   #293 <Method java.util.Set ArrayMap.keySet()>
	//   99  193:invokevirtual   #270 <Method boolean ArrayMap.retainAll(Collection)>
	//  100  196:pop             
			return arraymap1;
	//  101  197:aload           4
	//  102  199:areturn         
		}
	}

	private static ArrayList configureEnteringExitingViews(Object obj, Fragment fragment, ArrayList arraylist, View view)
	{
		ArrayList arraylist1 = null;
	//    0    0:aconst_null     
	//    1    1:astore          4
		if(obj != null)
	//*   2    3:aload_0         
	//*   3    4:ifnull          65
		{
			ArrayList arraylist2 = new ArrayList();
	//    4    7:new             #78  <Class ArrayList>
	//    5   10:dup             
	//    6   11:invokespecial   #234 <Method void ArrayList()>
	//    7   14:astore          5
			FragmentTransitionCompat21.captureTransitioningViews(arraylist2, fragment.getView());
	//    8   16:aload           5
	//    9   18:aload_1         
	//   10   19:invokevirtual   #251 <Method View Fragment.getView()>
	//   11   22:invokestatic    #297 <Method void FragmentTransitionCompat21.captureTransitioningViews(ArrayList, View)>
			if(arraylist != null)
	//*  12   25:aload_2         
	//*  13   26:ifnull          36
				arraylist2.removeAll(((Collection) (arraylist)));
	//   14   29:aload           5
	//   15   31:aload_2         
	//   16   32:invokevirtual   #300 <Method boolean ArrayList.removeAll(Collection)>
	//   17   35:pop             
			arraylist1 = arraylist2;
	//   18   36:aload           5
	//   19   38:astore          4
			if(!arraylist2.isEmpty())
	//*  20   40:aload           5
	//*  21   42:invokevirtual   #301 <Method boolean ArrayList.isEmpty()>
	//*  22   45:ifne            65
			{
				arraylist2.add(((Object) (view)));
	//   23   48:aload           5
	//   24   50:aload_3         
	//   25   51:invokevirtual   #81  <Method boolean ArrayList.add(Object)>
	//   26   54:pop             
				FragmentTransitionCompat21.addTargets(obj, arraylist2);
	//   27   55:aload_0         
	//   28   56:aload           5
	//   29   58:invokestatic    #305 <Method void FragmentTransitionCompat21.addTargets(Object, ArrayList)>
				arraylist1 = arraylist2;
	//   30   61:aload           5
	//   31   63:astore          4
			}
		}
		return arraylist1;
	//   32   65:aload           4
	//   33   67:areturn         
	}

	private static Object configureSharedElementsOptimized(ViewGroup viewgroup, View view, ArrayMap arraymap, FragmentContainerTransition fragmentcontainertransition, ArrayList arraylist, ArrayList arraylist1, Object obj, Object obj1)
	{
		Fragment fragment = fragmentcontainertransition.lastIn;
	//    0    0:aload_3         
	//    1    1:getfield        #136 <Field Fragment FragmentTransition$FragmentContainerTransition.lastIn>
	//    2    4:astore          10
		Fragment fragment1 = fragmentcontainertransition.firstOut;
	//    3    6:aload_3         
	//    4    7:getfield        #146 <Field Fragment FragmentTransition$FragmentContainerTransition.firstOut>
	//    5   10:astore          11
		if(fragment != null)
	//*   6   12:aload           10
	//*   7   14:ifnull          26
			fragment.getView().setVisibility(0);
	//    8   17:aload           10
	//    9   19:invokevirtual   #251 <Method View Fragment.getView()>
	//   10   22:iconst_0        
	//   11   23:invokevirtual   #312 <Method void View.setVisibility(int)>
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
	//   19   39:getfield        #139 <Field boolean FragmentTransition$FragmentContainerTransition.lastInIsPop>
	//   20   42:istore          8
		Object obj2;
		if(arraymap.isEmpty())
	//*  21   44:aload_2         
	//*  22   45:invokevirtual   #254 <Method boolean ArrayMap.isEmpty()>
	//*  23   48:ifeq            57
			obj2 = null;
	//   24   51:aconst_null     
	//   25   52:astore          9
		else
	//*  26   54:goto            68
			obj2 = getSharedElementTransition(fragment, fragment1, flag);
	//   27   57:aload           10
	//   28   59:aload           11
	//   29   61:iload           8
	//   30   63:invokestatic    #316 <Method Object getSharedElementTransition(Fragment, Fragment, boolean)>
	//   31   66:astore          9
		ArrayMap arraymap2 = captureOutSharedElements(arraymap, obj2, fragmentcontainertransition);
	//   32   68:aload_2         
	//   33   69:aload           9
	//   34   71:aload_3         
	//   35   72:invokestatic    #318 <Method ArrayMap captureOutSharedElements(ArrayMap, Object, FragmentTransition$FragmentContainerTransition)>
	//   36   75:astore          13
		ArrayMap arraymap1 = captureInSharedElements(arraymap, obj2, fragmentcontainertransition);
	//   37   77:aload_2         
	//   38   78:aload           9
	//   39   80:aload_3         
	//   40   81:invokestatic    #45  <Method ArrayMap captureInSharedElements(ArrayMap, Object, FragmentTransition$FragmentContainerTransition)>
	//   41   84:astore          12
		if(arraymap.isEmpty())
	//*  42   86:aload_2         
	//*  43   87:invokevirtual   #254 <Method boolean ArrayMap.isEmpty()>
	//*  44   90:ifeq            124
		{
			arraymap = null;
	//   45   93:aconst_null     
	//   46   94:astore_2        
			if(arraymap2 != null)
	//*  47   95:aload           13
	//*  48   97:ifnull          105
				arraymap2.clear();
	//   49  100:aload           13
	//   50  102:invokevirtual   #257 <Method void ArrayMap.clear()>
			obj2 = ((Object) (arraymap));
	//   51  105:aload_2         
	//   52  106:astore          9
			if(arraymap1 != null)
	//*  53  108:aload           12
	//*  54  110:ifnull          146
			{
				arraymap1.clear();
	//   55  113:aload           12
	//   56  115:invokevirtual   #257 <Method void ArrayMap.clear()>
				obj2 = ((Object) (arraymap));
	//   57  118:aload_2         
	//   58  119:astore          9
			}
		} else
	//*  59  121:goto            146
		{
			addSharedElementsWithMatchingNames(arraylist, arraymap2, ((Collection) (arraymap.keySet())));
	//   60  124:aload           4
	//   61  126:aload           13
	//   62  128:aload_2         
	//   63  129:invokevirtual   #293 <Method java.util.Set ArrayMap.keySet()>
	//   64  132:invokestatic    #320 <Method void addSharedElementsWithMatchingNames(ArrayList, ArrayMap, Collection)>
			addSharedElementsWithMatchingNames(arraylist1, arraymap1, arraymap.values());
	//   65  135:aload           5
	//   66  137:aload           12
	//   67  139:aload_2         
	//   68  140:invokevirtual   #324 <Method Collection ArrayMap.values()>
	//   69  143:invokestatic    #320 <Method void addSharedElementsWithMatchingNames(ArrayList, ArrayMap, Collection)>
		}
		if(obj == null && obj1 == null && obj2 == null)
	//*  70  146:aload           6
	//*  71  148:ifnonnull       163
	//*  72  151:aload           7
	//*  73  153:ifnonnull       163
	//*  74  156:aload           9
	//*  75  158:ifnonnull       163
			return ((Object) (null));
	//   76  161:aconst_null     
	//   77  162:areturn         
		callSharedElementStartEnd(fragment, fragment1, flag, arraymap2, true);
	//   78  163:aload           10
	//   79  165:aload           11
	//   80  167:iload           8
	//   81  169:aload           13
	//   82  171:iconst_1        
	//   83  172:invokestatic    #40  <Method void callSharedElementStartEnd(Fragment, Fragment, boolean, ArrayMap, boolean)>
		if(obj2 != null)
	//*  84  175:aload           9
	//*  85  177:ifnull          244
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
	//   93  192:invokestatic    #328 <Method void FragmentTransitionCompat21.setSharedElementTargets(Object, View, ArrayList)>
			setOutEpicenter(obj2, obj1, arraymap2, fragmentcontainertransition.firstOutIsPop, fragmentcontainertransition.firstOutTransaction);
	//   94  195:aload           9
	//   95  197:aload           7
	//   96  199:aload           13
	//   97  201:aload_3         
	//   98  202:getfield        #174 <Field boolean FragmentTransition$FragmentContainerTransition.firstOutIsPop>
	//   99  205:aload_3         
	//  100  206:getfield        #177 <Field BackStackRecord FragmentTransition$FragmentContainerTransition.firstOutTransaction>
	//  101  209:invokestatic    #332 <Method void setOutEpicenter(Object, Object, ArrayMap, boolean, BackStackRecord)>
			view = ((View) (new Rect()));
	//  102  212:new             #334 <Class Rect>
	//  103  215:dup             
	//  104  216:invokespecial   #335 <Method void Rect()>
	//  105  219:astore_1        
			arraymap = ((ArrayMap) (getInEpicenterView(arraymap1, fragmentcontainertransition, obj, flag)));
	//  106  220:aload           12
	//  107  222:aload_3         
	//  108  223:aload           6
	//  109  225:iload           8
	//  110  227:invokestatic    #50  <Method View getInEpicenterView(ArrayMap, FragmentTransition$FragmentContainerTransition, Object, boolean)>
	//  111  230:astore_2        
			if(arraymap != null)
	//* 112  231:aload_2         
	//* 113  232:ifnull          241
				FragmentTransitionCompat21.setEpicenter(obj, ((Rect) (view)));
	//  114  235:aload           6
	//  115  237:aload_1         
	//  116  238:invokestatic    #339 <Method void FragmentTransitionCompat21.setEpicenter(Object, Rect)>
		} else
	//* 117  241:goto            248
		{
			view = null;
	//  118  244:aconst_null     
	//  119  245:astore_1        
			arraymap = null;
	//  120  246:aconst_null     
	//  121  247:astore_2        
		}
		OneShotPreDrawListener.add(((View) (viewgroup)), new Runnable(fragment, fragment1, flag, arraymap1, ((View) (arraymap)), ((Rect) (view))) {

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
	//  122  248:aload_0         
	//  123  249:new             #10  <Class FragmentTransition$3>
	//  124  252:dup             
	//  125  253:aload           10
	//  126  255:aload           11
	//  127  257:iload           8
	//  128  259:aload           12
	//  129  261:aload_2         
	//  130  262:aload_1         
	//  131  263:invokespecial   #342 <Method void FragmentTransition$3(Fragment, Fragment, boolean, ArrayMap, View, Rect)>
	//  132  266:invokestatic    #347 <Method OneShotPreDrawListener OneShotPreDrawListener.add(View, Runnable)>
	//  133  269:pop             
		return obj2;
	//  134  270:aload           9
	//  135  272:areturn         
	}

	private static Object configureSharedElementsUnoptimized(ViewGroup viewgroup, View view, ArrayMap arraymap, FragmentContainerTransition fragmentcontainertransition, ArrayList arraylist, ArrayList arraylist1, Object obj, Object obj1)
	{
		Fragment fragment = fragmentcontainertransition.lastIn;
	//    0    0:aload_3         
	//    1    1:getfield        #136 <Field Fragment FragmentTransition$FragmentContainerTransition.lastIn>
	//    2    4:astore          11
		Fragment fragment1 = fragmentcontainertransition.firstOut;
	//    3    6:aload_3         
	//    4    7:getfield        #146 <Field Fragment FragmentTransition$FragmentContainerTransition.firstOut>
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
	//   13   25:getfield        #139 <Field boolean FragmentTransition$FragmentContainerTransition.lastInIsPop>
	//   14   28:istore          8
		Object obj2;
		if(arraymap.isEmpty())
	//*  15   30:aload_2         
	//*  16   31:invokevirtual   #254 <Method boolean ArrayMap.isEmpty()>
	//*  17   34:ifeq            43
			obj2 = null;
	//   18   37:aconst_null     
	//   19   38:astore          9
		else
	//*  20   40:goto            54
			obj2 = getSharedElementTransition(fragment, fragment1, flag);
	//   21   43:aload           11
	//   22   45:aload           12
	//   23   47:iload           8
	//   24   49:invokestatic    #316 <Method Object getSharedElementTransition(Fragment, Fragment, boolean)>
	//   25   52:astore          9
		ArrayMap arraymap1 = captureOutSharedElements(arraymap, obj2, fragmentcontainertransition);
	//   26   54:aload_2         
	//   27   55:aload           9
	//   28   57:aload_3         
	//   29   58:invokestatic    #318 <Method ArrayMap captureOutSharedElements(ArrayMap, Object, FragmentTransition$FragmentContainerTransition)>
	//   30   61:astore          13
		if(arraymap.isEmpty())
	//*  31   63:aload_2         
	//*  32   64:invokevirtual   #254 <Method boolean ArrayMap.isEmpty()>
	//*  33   67:ifeq            76
			obj2 = null;
	//   34   70:aconst_null     
	//   35   71:astore          9
		else
	//*  36   73:goto            87
			arraylist.addAll(arraymap1.values());
	//   37   76:aload           4
	//   38   78:aload           13
	//   39   80:invokevirtual   #324 <Method Collection ArrayMap.values()>
	//   40   83:invokevirtual   #352 <Method boolean ArrayList.addAll(Collection)>
	//   41   86:pop             
		if(obj == null && obj1 == null && obj2 == null)
	//*  42   87:aload           6
	//*  43   89:ifnonnull       104
	//*  44   92:aload           7
	//*  45   94:ifnonnull       104
	//*  46   97:aload           9
	//*  47   99:ifnonnull       104
			return ((Object) (null));
	//   48  102:aconst_null     
	//   49  103:areturn         
		callSharedElementStartEnd(fragment, fragment1, flag, arraymap1, true);
	//   50  104:aload           11
	//   51  106:aload           12
	//   52  108:iload           8
	//   53  110:aload           13
	//   54  112:iconst_1        
	//   55  113:invokestatic    #40  <Method void callSharedElementStartEnd(Fragment, Fragment, boolean, ArrayMap, boolean)>
		if(obj2 != null)
	//*  56  116:aload           9
	//*  57  118:ifnull          174
		{
			Rect rect = new Rect();
	//   58  121:new             #334 <Class Rect>
	//   59  124:dup             
	//   60  125:invokespecial   #335 <Method void Rect()>
	//   61  128:astore          10
			FragmentTransitionCompat21.setSharedElementTargets(obj2, view, arraylist);
	//   62  130:aload           9
	//   63  132:aload_1         
	//   64  133:aload           4
	//   65  135:invokestatic    #328 <Method void FragmentTransitionCompat21.setSharedElementTargets(Object, View, ArrayList)>
			setOutEpicenter(obj2, obj1, arraymap1, fragmentcontainertransition.firstOutIsPop, fragmentcontainertransition.firstOutTransaction);
	//   66  138:aload           9
	//   67  140:aload           7
	//   68  142:aload           13
	//   69  144:aload_3         
	//   70  145:getfield        #174 <Field boolean FragmentTransition$FragmentContainerTransition.firstOutIsPop>
	//   71  148:aload_3         
	//   72  149:getfield        #177 <Field BackStackRecord FragmentTransition$FragmentContainerTransition.firstOutTransaction>
	//   73  152:invokestatic    #332 <Method void setOutEpicenter(Object, Object, ArrayMap, boolean, BackStackRecord)>
			if(obj != null)
	//*  74  155:aload           6
	//*  75  157:ifnull          167
				FragmentTransitionCompat21.setEpicenter(obj, rect);
	//   76  160:aload           6
	//   77  162:aload           10
	//   78  164:invokestatic    #339 <Method void FragmentTransitionCompat21.setEpicenter(Object, Rect)>
			obj1 = ((Object) (rect));
	//   79  167:aload           10
	//   80  169:astore          7
		} else
	//*  81  171:goto            177
		{
			obj1 = null;
	//   82  174:aconst_null     
	//   83  175:astore          7
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
	//   84  177:aload_0         
	//   85  178:new             #12  <Class FragmentTransition$4>
	//   86  181:dup             
	//   87  182:aload_2         
	//   88  183:aload           9
	//   89  185:aload_3         
	//   90  186:aload           5
	//   91  188:aload_1         
	//   92  189:aload           11
	//   93  191:aload           12
	//   94  193:iload           8
	//   95  195:aload           4
	//   96  197:aload           6
	//   97  199:aload           7
	//   98  201:invokespecial   #355 <Method void FragmentTransition$4(ArrayMap, Object, FragmentTransition$FragmentContainerTransition, ArrayList, View, Fragment, Fragment, boolean, ArrayList, Object, Rect)>
	//   99  204:invokestatic    #347 <Method OneShotPreDrawListener OneShotPreDrawListener.add(View, Runnable)>
	//  100  207:pop             
		return obj2;
	//  101  208:aload           9
	//  102  210:areturn         
	}

	private static void configureTransitionsOptimized(FragmentManagerImpl fragmentmanagerimpl, int i, FragmentContainerTransition fragmentcontainertransition, View view, ArrayMap arraymap)
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
	//    9   18:invokevirtual   #361 <Method View FragmentContainer.onFindViewById(int)>
	//   10   21:checkcast       #363 <Class ViewGroup>
	//   11   24:astore          7
		if(viewgroup == null)
	//*  12   26:aload           7
	//*  13   28:ifnonnull       32
			return;
	//   14   31:return          
		Object obj3 = ((Object) (fragmentcontainertransition.lastIn));
	//   15   32:aload_2         
	//   16   33:getfield        #136 <Field Fragment FragmentTransition$FragmentContainerTransition.lastIn>
	//   17   36:astore          13
		Object obj2 = ((Object) (fragmentcontainertransition.firstOut));
	//   18   38:aload_2         
	//   19   39:getfield        #146 <Field Fragment FragmentTransition$FragmentContainerTransition.firstOut>
	//   20   42:astore          11
		boolean flag = fragmentcontainertransition.lastInIsPop;
	//   21   44:aload_2         
	//   22   45:getfield        #139 <Field boolean FragmentTransition$FragmentContainerTransition.lastInIsPop>
	//   23   48:istore          5
		boolean flag1 = fragmentcontainertransition.firstOutIsPop;
	//   24   50:aload_2         
	//   25   51:getfield        #174 <Field boolean FragmentTransition$FragmentContainerTransition.firstOutIsPop>
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
	//   37   77:invokestatic    #367 <Method Object getEnterTransition(Fragment, boolean)>
	//   38   80:astore          9
		Object obj1 = getExitTransition(((Fragment) (obj2)), flag1);
	//   39   82:aload           11
	//   40   84:iload           6
	//   41   86:invokestatic    #370 <Method Object getExitTransition(Fragment, boolean)>
	//   42   89:astore          10
		fragmentcontainertransition = ((FragmentContainerTransition) (configureSharedElementsOptimized(viewgroup, view, arraymap, fragmentcontainertransition, arraylist, ((ArrayList) (fragmentmanagerimpl)), obj, obj1)));
	//   43   91:aload           7
	//   44   93:aload_3         
	//   45   94:aload           4
	//   46   96:aload_2         
	//   47   97:aload           8
	//   48   99:aload_0         
	//   49  100:aload           9
	//   50  102:aload           10
	//   51  104:invokestatic    #372 <Method Object configureSharedElementsOptimized(ViewGroup, View, ArrayMap, FragmentTransition$FragmentContainerTransition, ArrayList, ArrayList, Object, Object)>
	//   52  107:astore_2        
		if(obj == null && fragmentcontainertransition == null && obj1 == null)
	//*  53  108:aload           9
	//*  54  110:ifnonnull       123
	//*  55  113:aload_2         
	//*  56  114:ifnonnull       123
	//*  57  117:aload           10
	//*  58  119:ifnonnull       123
			return;
	//   59  122:return          
		ArrayList arraylist1 = configureEnteringExitingViews(obj1, ((Fragment) (obj2)), arraylist, view);
	//   60  123:aload           10
	//   61  125:aload           11
	//   62  127:aload           8
	//   63  129:aload_3         
	//   64  130:invokestatic    #35  <Method ArrayList configureEnteringExitingViews(Object, Fragment, ArrayList, View)>
	//   65  133:astore          12
		view = ((View) (configureEnteringExitingViews(obj, ((Fragment) (obj3)), ((ArrayList) (fragmentmanagerimpl)), view)));
	//   66  135:aload           9
	//   67  137:aload           13
	//   68  139:aload_0         
	//   69  140:aload_3         
	//   70  141:invokestatic    #35  <Method ArrayList configureEnteringExitingViews(Object, Fragment, ArrayList, View)>
	//   71  144:astore_3        
		setViewVisibility(((ArrayList) (view)), 4);
	//   72  145:aload_3         
	//   73  146:iconst_4        
	//   74  147:invokestatic    #30  <Method void setViewVisibility(ArrayList, int)>
		obj3 = mergeTransitions(obj, obj1, ((Object) (fragmentcontainertransition)), ((Fragment) (obj3)), flag);
	//   75  150:aload           9
	//   76  152:aload           10
	//   77  154:aload_2         
	//   78  155:aload           13
	//   79  157:iload           5
	//   80  159:invokestatic    #376 <Method Object mergeTransitions(Object, Object, Object, Fragment, boolean)>
	//   81  162:astore          13
		if(obj3 != null)
	//*  82  164:aload           13
	//*  83  166:ifnull          229
		{
			replaceHide(obj1, ((Fragment) (obj2)), arraylist1);
	//   84  169:aload           10
	//   85  171:aload           11
	//   86  173:aload           12
	//   87  175:invokestatic    #380 <Method void replaceHide(Object, Fragment, ArrayList)>
			obj2 = ((Object) (FragmentTransitionCompat21.prepareSetNameOverridesOptimized(((ArrayList) (fragmentmanagerimpl)))));
	//   88  178:aload_0         
	//   89  179:invokestatic    #384 <Method ArrayList FragmentTransitionCompat21.prepareSetNameOverridesOptimized(ArrayList)>
	//   90  182:astore          11
			FragmentTransitionCompat21.scheduleRemoveTargets(obj3, obj, ((ArrayList) (view)), obj1, arraylist1, ((Object) (fragmentcontainertransition)), ((ArrayList) (fragmentmanagerimpl)));
	//   91  184:aload           13
	//   92  186:aload           9
	//   93  188:aload_3         
	//   94  189:aload           10
	//   95  191:aload           12
	//   96  193:aload_2         
	//   97  194:aload_0         
	//   98  195:invokestatic    #388 <Method void FragmentTransitionCompat21.scheduleRemoveTargets(Object, Object, ArrayList, Object, ArrayList, Object, ArrayList)>
			FragmentTransitionCompat21.beginDelayedTransition(viewgroup, obj3);
	//   99  198:aload           7
	//  100  200:aload           13
	//  101  202:invokestatic    #392 <Method void FragmentTransitionCompat21.beginDelayedTransition(ViewGroup, Object)>
			FragmentTransitionCompat21.setNameOverridesOptimized(((View) (viewgroup)), arraylist, ((ArrayList) (fragmentmanagerimpl)), ((ArrayList) (obj2)), ((java.util.Map) (arraymap)));
	//  102  205:aload           7
	//  103  207:aload           8
	//  104  209:aload_0         
	//  105  210:aload           11
	//  106  212:aload           4
	//  107  214:invokestatic    #396 <Method void FragmentTransitionCompat21.setNameOverridesOptimized(View, ArrayList, ArrayList, ArrayList, java.util.Map)>
			setViewVisibility(((ArrayList) (view)), 0);
	//  108  217:aload_3         
	//  109  218:iconst_0        
	//  110  219:invokestatic    #30  <Method void setViewVisibility(ArrayList, int)>
			FragmentTransitionCompat21.swapSharedElementTargets(((Object) (fragmentcontainertransition)), arraylist, ((ArrayList) (fragmentmanagerimpl)));
	//  111  222:aload_2         
	//  112  223:aload           8
	//  113  225:aload_0         
	//  114  226:invokestatic    #400 <Method void FragmentTransitionCompat21.swapSharedElementTargets(Object, ArrayList, ArrayList)>
		}
	//  115  229:return          
	}

	private static void configureTransitionsUnoptimized(FragmentManagerImpl fragmentmanagerimpl, int i, FragmentContainerTransition fragmentcontainertransition, View view, ArrayMap arraymap)
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
	//    9   18:invokevirtual   #361 <Method View FragmentContainer.onFindViewById(int)>
	//   10   21:checkcast       #363 <Class ViewGroup>
	//   11   24:astore          7
		if(viewgroup == null)
	//*  12   26:aload           7
	//*  13   28:ifnonnull       32
			return;
	//   14   31:return          
		Fragment fragment = fragmentcontainertransition.lastIn;
	//   15   32:aload_2         
	//   16   33:getfield        #136 <Field Fragment FragmentTransition$FragmentContainerTransition.lastIn>
	//   17   36:astore          8
		Object obj2 = ((Object) (fragmentcontainertransition.firstOut));
	//   18   38:aload_2         
	//   19   39:getfield        #146 <Field Fragment FragmentTransition$FragmentContainerTransition.firstOut>
	//   20   42:astore          12
		boolean flag = fragmentcontainertransition.lastInIsPop;
	//   21   44:aload_2         
	//   22   45:getfield        #139 <Field boolean FragmentTransition$FragmentContainerTransition.lastInIsPop>
	//   23   48:istore          5
		boolean flag1 = fragmentcontainertransition.firstOutIsPop;
	//   24   50:aload_2         
	//   25   51:getfield        #174 <Field boolean FragmentTransition$FragmentContainerTransition.firstOutIsPop>
	//   26   54:istore          6
		Object obj = getEnterTransition(fragment, flag);
	//   27   56:aload           8
	//   28   58:iload           5
	//   29   60:invokestatic    #367 <Method Object getEnterTransition(Fragment, boolean)>
	//   30   63:astore          9
		fragmentmanagerimpl = ((FragmentManagerImpl) (getExitTransition(((Fragment) (obj2)), flag1)));
	//   31   65:aload           12
	//   32   67:iload           6
	//   33   69:invokestatic    #370 <Method Object getExitTransition(Fragment, boolean)>
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
		Object obj1 = configureSharedElementsUnoptimized(viewgroup, view, arraymap, fragmentcontainertransition, arraylist1, arraylist, obj, ((Object) (fragmentmanagerimpl)));
	//   43   91:aload           7
	//   44   93:aload_3         
	//   45   94:aload           4
	//   46   96:aload_2         
	//   47   97:aload           13
	//   48   99:aload           10
	//   49  101:aload           9
	//   50  103:aload_0         
	//   51  104:invokestatic    #404 <Method Object configureSharedElementsUnoptimized(ViewGroup, View, ArrayMap, FragmentTransition$FragmentContainerTransition, ArrayList, ArrayList, Object, Object)>
	//   52  107:astore          11
		if(obj == null && obj1 == null && fragmentmanagerimpl == null)
	//*  53  109:aload           9
	//*  54  111:ifnonnull       124
	//*  55  114:aload           11
	//*  56  116:ifnonnull       124
	//*  57  119:aload_0         
	//*  58  120:ifnonnull       124
			return;
	//   59  123:return          
		obj2 = ((Object) (configureEnteringExitingViews(((Object) (fragmentmanagerimpl)), ((Fragment) (obj2)), arraylist1, view)));
	//   60  124:aload_0         
	//   61  125:aload           12
	//   62  127:aload           13
	//   63  129:aload_3         
	//   64  130:invokestatic    #35  <Method ArrayList configureEnteringExitingViews(Object, Fragment, ArrayList, View)>
	//   65  133:astore          12
		if(obj2 == null || ((ArrayList) (obj2)).isEmpty())
	//*  66  135:aload           12
	//*  67  137:ifnull          148
	//*  68  140:aload           12
	//*  69  142:invokevirtual   #301 <Method boolean ArrayList.isEmpty()>
	//*  70  145:ifeq            150
			fragmentmanagerimpl = null;
	//   71  148:aconst_null     
	//   72  149:astore_0        
		FragmentTransitionCompat21.addTarget(obj, view);
	//   73  150:aload           9
	//   74  152:aload_3         
	//   75  153:invokestatic    #408 <Method void FragmentTransitionCompat21.addTarget(Object, View)>
		fragmentcontainertransition = ((FragmentContainerTransition) (mergeTransitions(obj, ((Object) (fragmentmanagerimpl)), obj1, fragment, fragmentcontainertransition.lastInIsPop)));
	//   76  156:aload           9
	//   77  158:aload_0         
	//   78  159:aload           11
	//   79  161:aload           8
	//   80  163:aload_2         
	//   81  164:getfield        #139 <Field boolean FragmentTransition$FragmentContainerTransition.lastInIsPop>
	//   82  167:invokestatic    #376 <Method Object mergeTransitions(Object, Object, Object, Fragment, boolean)>
	//   83  170:astore_2        
		if(fragmentcontainertransition != null)
	//*  84  171:aload_2         
	//*  85  172:ifnull          240
		{
			ArrayList arraylist2 = new ArrayList();
	//   86  175:new             #78  <Class ArrayList>
	//   87  178:dup             
	//   88  179:invokespecial   #234 <Method void ArrayList()>
	//   89  182:astore          13
			FragmentTransitionCompat21.scheduleRemoveTargets(((Object) (fragmentcontainertransition)), obj, arraylist2, ((Object) (fragmentmanagerimpl)), ((ArrayList) (obj2)), obj1, arraylist);
	//   90  184:aload_2         
	//   91  185:aload           9
	//   92  187:aload           13
	//   93  189:aload_0         
	//   94  190:aload           12
	//   95  192:aload           11
	//   96  194:aload           10
	//   97  196:invokestatic    #388 <Method void FragmentTransitionCompat21.scheduleRemoveTargets(Object, Object, ArrayList, Object, ArrayList, Object, ArrayList)>
			scheduleTargetChange(viewgroup, fragment, view, arraylist, obj, arraylist2, ((Object) (fragmentmanagerimpl)), ((ArrayList) (obj2)));
	//   98  199:aload           7
	//   99  201:aload           8
	//  100  203:aload_3         
	//  101  204:aload           10
	//  102  206:aload           9
	//  103  208:aload           13
	//  104  210:aload_0         
	//  105  211:aload           12
	//  106  213:invokestatic    #412 <Method void scheduleTargetChange(ViewGroup, Fragment, View, ArrayList, Object, ArrayList, Object, ArrayList)>
			FragmentTransitionCompat21.setNameOverridesUnoptimized(((View) (viewgroup)), arraylist, ((java.util.Map) (arraymap)));
	//  107  216:aload           7
	//  108  218:aload           10
	//  109  220:aload           4
	//  110  222:invokestatic    #416 <Method void FragmentTransitionCompat21.setNameOverridesUnoptimized(View, ArrayList, java.util.Map)>
			FragmentTransitionCompat21.beginDelayedTransition(viewgroup, ((Object) (fragmentcontainertransition)));
	//  111  225:aload           7
	//  112  227:aload_2         
	//  113  228:invokestatic    #392 <Method void FragmentTransitionCompat21.beginDelayedTransition(ViewGroup, Object)>
			FragmentTransitionCompat21.scheduleNameReset(viewgroup, arraylist, ((java.util.Map) (arraymap)));
	//  114  231:aload           7
	//  115  233:aload           10
	//  116  235:aload           4
	//  117  237:invokestatic    #420 <Method void FragmentTransitionCompat21.scheduleNameReset(ViewGroup, ArrayList, java.util.Map)>
		}
	//  118  240:return          
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
	//    6   10:invokespecial   #421 <Method void FragmentTransition$FragmentContainerTransition()>
	//    7   13:astore_3        
			sparsearray.put(i, ((Object) (fragmentcontainertransition1)));
	//    8   14:aload_1         
	//    9   15:iload_2         
	//   10   16:aload_3         
	//   11   17:invokevirtual   #424 <Method void SparseArray.put(int, Object)>
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
	//*  12   18:invokevirtual   #283 <Method boolean String.equals(Object)>
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
	//*   5    7:ifeq            18
			fragment = ((Fragment) (fragment.getReenterTransition()));
	//    6   10:aload_0         
	//    7   11:invokevirtual   #430 <Method Object Fragment.getReenterTransition()>
	//    8   14:astore_0        
		else
	//*   9   15:goto            23
			fragment = ((Fragment) (fragment.getEnterTransition()));
	//   10   18:aload_0         
	//   11   19:invokevirtual   #432 <Method Object Fragment.getEnterTransition()>
	//   12   22:astore_0        
		return FragmentTransitionCompat21.cloneTransition(((Object) (fragment)));
	//   13   23:aload_0         
	//   14   24:invokestatic    #435 <Method Object FragmentTransitionCompat21.cloneTransition(Object)>
	//   15   27:areturn         
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
	//*   5    7:ifeq            18
			fragment = ((Fragment) (fragment.getReturnTransition()));
	//    6   10:aload_0         
	//    7   11:invokevirtual   #438 <Method Object Fragment.getReturnTransition()>
	//    8   14:astore_0        
		else
	//*   9   15:goto            23
			fragment = ((Fragment) (fragment.getExitTransition()));
	//   10   18:aload_0         
	//   11   19:invokevirtual   #440 <Method Object Fragment.getExitTransition()>
	//   12   22:astore_0        
		return FragmentTransitionCompat21.cloneTransition(((Object) (fragment)));
	//   13   23:aload_0         
	//   14   24:invokestatic    #435 <Method Object FragmentTransitionCompat21.cloneTransition(Object)>
	//   15   27:areturn         
	}

	private static View getInEpicenterView(ArrayMap arraymap, FragmentContainerTransition fragmentcontainertransition, Object obj, boolean flag)
	{
		fragmentcontainertransition = ((FragmentContainerTransition) (fragmentcontainertransition.lastInTransaction));
	//    0    0:aload_1         
	//    1    1:getfield        #143 <Field BackStackRecord FragmentTransition$FragmentContainerTransition.lastInTransaction>
	//    2    4:astore_1        
		if(obj != null && ((BackStackRecord) (fragmentcontainertransition)).mSharedElementSourceNames != null && !((BackStackRecord) (fragmentcontainertransition)).mSharedElementSourceNames.isEmpty())
	//*   3    5:aload_2         
	//*   4    6:ifnull          66
	//*   5    9:aload_1         
	//*   6   10:getfield        #205 <Field ArrayList BackStackRecord.mSharedElementSourceNames>
	//*   7   13:ifnull          66
	//*   8   16:aload_1         
	//*   9   17:getfield        #205 <Field ArrayList BackStackRecord.mSharedElementSourceNames>
	//*  10   20:invokevirtual   #301 <Method boolean ArrayList.isEmpty()>
	//*  11   23:ifne            66
		{
			if(flag)
	//*  12   26:iload_3         
	//*  13   27:ifeq            45
				fragmentcontainertransition = ((FragmentContainerTransition) ((String)((BackStackRecord) (fragmentcontainertransition)).mSharedElementSourceNames.get(0)));
	//   14   30:aload_1         
	//   15   31:getfield        #205 <Field ArrayList BackStackRecord.mSharedElementSourceNames>
	//   16   34:iconst_0        
	//   17   35:invokevirtual   #186 <Method Object ArrayList.get(int)>
	//   18   38:checkcast       #210 <Class String>
	//   19   41:astore_1        
			else
	//*  20   42:goto            57
				fragmentcontainertransition = ((FragmentContainerTransition) ((String)((BackStackRecord) (fragmentcontainertransition)).mSharedElementTargetNames.get(0)));
	//   21   45:aload_1         
	//   22   46:getfield        #208 <Field ArrayList BackStackRecord.mSharedElementTargetNames>
	//   23   49:iconst_0        
	//   24   50:invokevirtual   #186 <Method Object ArrayList.get(int)>
	//   25   53:checkcast       #210 <Class String>
	//   26   56:astore_1        
			return (View)arraymap.get(((Object) (fragmentcontainertransition)));
	//   27   57:aload_0         
	//   28   58:aload_1         
	//   29   59:invokevirtual   #276 <Method Object ArrayMap.get(Object)>
	//   30   62:checkcast       #64  <Class View>
	//   31   65:areturn         
		} else
		{
			return null;
	//   32   66:aconst_null     
	//   33   67:areturn         
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
	//*   7   11:ifeq            22
			fragment = ((Fragment) (fragment1.getSharedElementReturnTransition()));
	//    8   14:aload_1         
	//    9   15:invokevirtual   #444 <Method Object Fragment.getSharedElementReturnTransition()>
	//   10   18:astore_0        
		else
	//*  11   19:goto            27
			fragment = ((Fragment) (fragment.getSharedElementEnterTransition()));
	//   12   22:aload_0         
	//   13   23:invokevirtual   #447 <Method Object Fragment.getSharedElementEnterTransition()>
	//   14   26:astore_0        
		return FragmentTransitionCompat21.wrapTransitionInSet(FragmentTransitionCompat21.cloneTransition(((Object) (fragment))));
	//   15   27:aload_0         
	//   16   28:invokestatic    #435 <Method Object FragmentTransitionCompat21.cloneTransition(Object)>
	//   17   31:invokestatic    #450 <Method Object FragmentTransitionCompat21.wrapTransitionInSet(Object)>
	//   18   34:areturn         
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
	//*   5    8:ifnull          47
		{
			flag1 = flag2;
	//    6   11:iload           6
	//    7   13:istore          5
			if(obj1 != null)
	//*   8   15:aload_1         
	//*   9   16:ifnull          47
			{
				flag1 = flag2;
	//   10   19:iload           6
	//   11   21:istore          5
				if(fragment != null)
	//*  12   23:aload_3         
	//*  13   24:ifnull          47
					if(flag)
	//*  14   27:iload           4
	//*  15   29:ifeq            41
						flag1 = fragment.getAllowReturnTransitionOverlap();
	//   16   32:aload_3         
	//   17   33:invokevirtual   #453 <Method boolean Fragment.getAllowReturnTransitionOverlap()>
	//   18   36:istore          5
					else
	//*  19   38:goto            47
						flag1 = fragment.getAllowEnterTransitionOverlap();
	//   20   41:aload_3         
	//   21   42:invokevirtual   #456 <Method boolean Fragment.getAllowEnterTransitionOverlap()>
	//   22   45:istore          5
			}
		}
		if(flag1)
	//*  23   47:iload           5
	//*  24   49:ifeq            59
			return FragmentTransitionCompat21.mergeTransitionsTogether(obj1, obj, obj2);
	//   25   52:aload_1         
	//   26   53:aload_0         
	//   27   54:aload_2         
	//   28   55:invokestatic    #460 <Method Object FragmentTransitionCompat21.mergeTransitionsTogether(Object, Object, Object)>
	//   29   58:areturn         
		else
			return FragmentTransitionCompat21.mergeTransitionsInSequence(obj1, obj, obj2);
	//   30   59:aload_1         
	//   31   60:aload_0         
	//   32   61:aload_2         
	//   33   62:invokestatic    #463 <Method Object FragmentTransitionCompat21.mergeTransitionsInSequence(Object, Object, Object)>
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
	//*   5    9:getfield        #110 <Field boolean Fragment.mAdded>
	//*   6   12:ifeq            59
	//*   7   15:aload_1         
	//*   8   16:getfield        #107 <Field boolean Fragment.mHidden>
	//*   9   19:ifeq            59
	//*  10   22:aload_1         
	//*  11   23:getfield        #104 <Field boolean Fragment.mHiddenChanged>
	//*  12   26:ifeq            59
		{
			fragment.setHideReplaced(true);
	//   13   29:aload_1         
	//   14   30:iconst_1        
	//   15   31:invokevirtual   #467 <Method void Fragment.setHideReplaced(boolean)>
			FragmentTransitionCompat21.scheduleHideFragmentView(obj, fragment.getView(), arraylist);
	//   16   34:aload_0         
	//   17   35:aload_1         
	//   18   36:invokevirtual   #251 <Method View Fragment.getView()>
	//   19   39:aload_2         
	//   20   40:invokestatic    #470 <Method void FragmentTransitionCompat21.scheduleHideFragmentView(Object, View, ArrayList)>
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
	//   22   44:getfield        #473 <Field ViewGroup Fragment.mContainer>
	//   23   47:new             #6   <Class FragmentTransition$1>
	//   24   50:dup             
	//   25   51:aload_2         
	//   26   52:invokespecial   #476 <Method void FragmentTransition$1(ArrayList)>
	//   27   55:invokestatic    #347 <Method OneShotPreDrawListener OneShotPreDrawListener.add(View, Runnable)>
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
	//*  12   20:invokevirtual   #480 <Method boolean ArrayMap.containsKey(Object)>
	//*  13   23:ifne            32
				arraymap.removeAt(i);
	//   14   26:aload_0         
	//   15   27:iload_2         
	//   16   28:invokevirtual   #483 <Method Object ArrayMap.removeAt(int)>
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
	//   10   16:invokespecial   #487 <Method void FragmentTransition$2(Object, View, Fragment, ArrayList, ArrayList, ArrayList, Object)>
	//   11   19:invokestatic    #347 <Method OneShotPreDrawListener OneShotPreDrawListener.add(View, Runnable)>
	//   12   22:pop             
	//   13   23:return          
	}

	private static void setOutEpicenter(Object obj, Object obj1, ArrayMap arraymap, boolean flag, BackStackRecord backstackrecord)
	{
		if(backstackrecord.mSharedElementSourceNames != null && !backstackrecord.mSharedElementSourceNames.isEmpty())
	//*   0    0:aload           4
	//*   1    2:getfield        #205 <Field ArrayList BackStackRecord.mSharedElementSourceNames>
	//*   2    5:ifnull          78
	//*   3    8:aload           4
	//*   4   10:getfield        #205 <Field ArrayList BackStackRecord.mSharedElementSourceNames>
	//*   5   13:invokevirtual   #301 <Method boolean ArrayList.isEmpty()>
	//*   6   16:ifne            78
		{
			if(flag)
	//*   7   19:iload_3         
	//*   8   20:ifeq            40
				backstackrecord = ((BackStackRecord) ((String)backstackrecord.mSharedElementTargetNames.get(0)));
	//    9   23:aload           4
	//   10   25:getfield        #208 <Field ArrayList BackStackRecord.mSharedElementTargetNames>
	//   11   28:iconst_0        
	//   12   29:invokevirtual   #186 <Method Object ArrayList.get(int)>
	//   13   32:checkcast       #210 <Class String>
	//   14   35:astore          4
			else
	//*  15   37:goto            54
				backstackrecord = ((BackStackRecord) ((String)backstackrecord.mSharedElementSourceNames.get(0)));
	//   16   40:aload           4
	//   17   42:getfield        #205 <Field ArrayList BackStackRecord.mSharedElementSourceNames>
	//   18   45:iconst_0        
	//   19   46:invokevirtual   #186 <Method Object ArrayList.get(int)>
	//   20   49:checkcast       #210 <Class String>
	//   21   52:astore          4
			arraymap = ((ArrayMap) ((View)arraymap.get(((Object) (backstackrecord)))));
	//   22   54:aload_2         
	//   23   55:aload           4
	//   24   57:invokevirtual   #276 <Method Object ArrayMap.get(Object)>
	//   25   60:checkcast       #64  <Class View>
	//   26   63:astore_2        
			FragmentTransitionCompat21.setEpicenter(obj, ((View) (arraymap)));
	//   27   64:aload_0         
	//   28   65:aload_2         
	//   29   66:invokestatic    #490 <Method void FragmentTransitionCompat21.setEpicenter(Object, View)>
			if(obj1 != null)
	//*  30   69:aload_1         
	//*  31   70:ifnull          78
				FragmentTransitionCompat21.setEpicenter(obj1, ((View) (arraymap)));
	//   32   73:aload_1         
	//   33   74:aload_2         
	//   34   75:invokestatic    #490 <Method void FragmentTransitionCompat21.setEpicenter(Object, View)>
		}
	//   35   78:return          
	}

	private static void setViewVisibility(ArrayList arraylist, int i)
	{
		if(arraylist == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       5
			return;
	//    2    4:return          
		for(int j = arraylist.size() - 1; j >= 0; j--)
	//*   3    5:aload_0         
	//*   4    6:invokevirtual   #185 <Method int ArrayList.size()>
	//*   5    9:iconst_1        
	//*   6   10:isub            
	//*   7   11:istore_2        
	//*   8   12:iload_2         
	//*   9   13:iflt            35
			((View)arraylist.get(j)).setVisibility(i);
	//   10   16:aload_0         
	//   11   17:iload_2         
	//   12   18:invokevirtual   #186 <Method Object ArrayList.get(int)>
	//   13   21:checkcast       #64  <Class View>
	//   14   24:iload_1         
	//   15   25:invokevirtual   #312 <Method void View.setVisibility(int)>

	//   16   28:iload_2         
	//   17   29:iconst_1        
	//   18   30:isub            
	//   19   31:istore_2        
	//*  20   32:goto            12
	//   21   35:return          
	}

	static void startTransitions(FragmentManagerImpl fragmentmanagerimpl, ArrayList arraylist, ArrayList arraylist1, int i, int j, boolean flag)
	{
		if(fragmentmanagerimpl.mCurState < 1 || android.os.Build.VERSION.SDK_INT < 21)
	//*   0    0:aload_0         
	//*   1    1:getfield        #160 <Field int FragmentManagerImpl.mCurState>
	//*   2    4:iconst_1        
	//*   3    5:icmplt          16
	//*   4    8:getstatic       #499 <Field int android.os.Build$VERSION.SDK_INT>
	//*   5   11:bipush          21
	//*   6   13:icmpge          17
			return;
	//    7   16:return          
		SparseArray sparsearray = new SparseArray();
	//    8   17:new             #126 <Class SparseArray>
	//    9   20:dup             
	//   10   21:invokespecial   #500 <Method void SparseArray()>
	//   11   24:astore          9
		for(int k = i; k < j; k++)
	//*  12   26:iload_3         
	//*  13   27:istore          6
	//*  14   29:iload           6
	//*  15   31:iload           4
	//*  16   33:icmpge          92
		{
			BackStackRecord backstackrecord = (BackStackRecord)arraylist.get(k);
	//   17   36:aload_1         
	//   18   37:iload           6
	//   19   39:invokevirtual   #186 <Method Object ArrayList.get(int)>
	//   20   42:checkcast       #148 <Class BackStackRecord>
	//   21   45:astore          10
			if(((Boolean)arraylist1.get(k)).booleanValue())
	//*  22   47:aload_2         
	//*  23   48:iload           6
	//*  24   50:invokevirtual   #186 <Method Object ArrayList.get(int)>
	//*  25   53:checkcast       #198 <Class Boolean>
	//*  26   56:invokevirtual   #202 <Method boolean Boolean.booleanValue()>
	//*  27   59:ifeq            74
				calculatePopFragments(backstackrecord, sparsearray, flag);
	//   28   62:aload           10
	//   29   64:aload           9
	//   30   66:iload           5
	//   31   68:invokestatic    #502 <Method void calculatePopFragments(BackStackRecord, SparseArray, boolean)>
			else
	//*  32   71:goto            83
				calculateFragments(backstackrecord, sparsearray, flag);
	//   33   74:aload           10
	//   34   76:aload           9
	//   35   78:iload           5
	//   36   80:invokestatic    #504 <Method void calculateFragments(BackStackRecord, SparseArray, boolean)>
		}

	//   37   83:iload           6
	//   38   85:iconst_1        
	//   39   86:iadd            
	//   40   87:istore          6
	//*  41   89:goto            29
		if(sparsearray.size() != 0)
	//*  42   92:aload           9
	//*  43   94:invokevirtual   #505 <Method int SparseArray.size()>
	//*  44   97:ifeq            207
		{
			View view = new View(fragmentmanagerimpl.mHost.getContext());
	//   45  100:new             #64  <Class View>
	//   46  103:dup             
	//   47  104:aload_0         
	//   48  105:getfield        #509 <Field FragmentHostCallback FragmentManagerImpl.mHost>
	//   49  108:invokevirtual   #515 <Method android.content.Context FragmentHostCallback.getContext()>
	//   50  111:invokespecial   #518 <Method void View(android.content.Context)>
	//   51  114:astore          10
			int i1 = sparsearray.size();
	//   52  116:aload           9
	//   53  118:invokevirtual   #505 <Method int SparseArray.size()>
	//   54  121:istore          7
			for(int l = 0; l < i1; l++)
	//*  55  123:iconst_0        
	//*  56  124:istore          6
	//*  57  126:iload           6
	//*  58  128:iload           7
	//*  59  130:icmpge          207
			{
				int j1 = sparsearray.keyAt(l);
	//   60  133:aload           9
	//   61  135:iload           6
	//   62  137:invokevirtual   #521 <Method int SparseArray.keyAt(int)>
	//   63  140:istore          8
				ArrayMap arraymap = calculateNameOverrides(j1, arraylist, arraylist1, i, j);
	//   64  142:iload           8
	//   65  144:aload_1         
	//   66  145:aload_2         
	//   67  146:iload_3         
	//   68  147:iload           4
	//   69  149:invokestatic    #523 <Method ArrayMap calculateNameOverrides(int, ArrayList, ArrayList, int, int)>
	//   70  152:astore          11
				FragmentContainerTransition fragmentcontainertransition = (FragmentContainerTransition)sparsearray.valueAt(l);
	//   71  154:aload           9
	//   72  156:iload           6
	//   73  158:invokevirtual   #524 <Method Object SparseArray.valueAt(int)>
	//   74  161:checkcast       #14  <Class FragmentTransition$FragmentContainerTransition>
	//   75  164:astore          12
				if(flag)
	//*  76  166:iload           5
	//*  77  168:ifeq            186
					configureTransitionsOptimized(fragmentmanagerimpl, j1, fragmentcontainertransition, view, arraymap);
	//   78  171:aload_0         
	//   79  172:iload           8
	//   80  174:aload           12
	//   81  176:aload           10
	//   82  178:aload           11
	//   83  180:invokestatic    #526 <Method void configureTransitionsOptimized(FragmentManagerImpl, int, FragmentTransition$FragmentContainerTransition, View, ArrayMap)>
				else
	//*  84  183:goto            198
					configureTransitionsUnoptimized(fragmentmanagerimpl, j1, fragmentcontainertransition, view, arraymap);
	//   85  186:aload_0         
	//   86  187:iload           8
	//   87  189:aload           12
	//   88  191:aload           10
	//   89  193:aload           11
	//   90  195:invokestatic    #528 <Method void configureTransitionsUnoptimized(FragmentManagerImpl, int, FragmentTransition$FragmentContainerTransition, View, ArrayMap)>
			}

	//   91  198:iload           6
	//   92  200:iconst_1        
	//   93  201:iadd            
	//   94  202:istore          6
		}
	//*  95  204:goto            126
	//   96  207:return          
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

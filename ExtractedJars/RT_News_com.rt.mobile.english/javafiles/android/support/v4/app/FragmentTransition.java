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


	FragmentTransition()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #45  <Method void Object()>
	//    2    4:return          
	}

	private static void addSharedElementsWithMatchingNames(ArrayList arraylist, ArrayMap arraymap, Collection collection)
	{
		for(int i = arraymap.size() - 1; i >= 0; i--)
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #78  <Method int ArrayMap.size()>
	//*   2    4:iconst_1        
	//*   3    5:isub            
	//*   4    6:istore_3        
	//*   5    7:iload_3         
	//*   6    8:iflt            49
		{
			View view = (View)arraymap.valueAt(i);
	//    7   11:aload_1         
	//    8   12:iload_3         
	//    9   13:invokevirtual   #82  <Method Object ArrayMap.valueAt(int)>
	//   10   16:checkcast       #84  <Class View>
	//   11   19:astore          4
			if(collection.contains(((Object) (ViewCompat.getTransitionName(view)))))
	//*  12   21:aload_2         
	//*  13   22:aload           4
	//*  14   24:invokestatic    #90  <Method String ViewCompat.getTransitionName(View)>
	//*  15   27:invokeinterface #96  <Method boolean Collection.contains(Object)>
	//*  16   32:ifeq            42
				arraylist.add(((Object) (view)));
	//   17   35:aload_0         
	//   18   36:aload           4
	//   19   38:invokevirtual   #101 <Method boolean ArrayList.add(Object)>
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
	//    1    1:getfield        #111 <Field Fragment BackStackRecord$Op.fragment>
	//    2    4:astore          11
		if(fragment == null)
	//*   3    6:aload           11
	//*   4    8:ifnonnull       12
			return;
	//    5   11:return          
		j = fragment.mContainerId;
	//    6   12:aload           11
	//    7   14:getfield        #116 <Field int Fragment.mContainerId>
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
	//   16   33:getfield        #119 <Field int BackStackRecord$Op.cmd>
	//   17   36:iaload          
	//   18   37:istore          5
		else
	//*  19   39:goto            48
			i = op.cmd;
	//   20   42:aload_1         
	//   21   43:getfield        #119 <Field int BackStackRecord$Op.cmd>
	//   22   46:istore          5
		flag4 = false;
	//   23   48:iconst_0        
	//   24   49:istore          9
		if(i == 1) goto _L2; else goto _L1
	//   25   51:iload           5
	//   26   53:iconst_1        
	//   27   54:icmpeq          285
_L1:
		i;
	//   28   57:iload           5
		JVM INSTR tableswitch 3 7: default 92
	//	               3 199
	//	               4 148
	//	               5 106
	//	               6 199
	//	               7 285;
	//   29   59:tableswitch     3 7: default 92
	//	               3 199
	//	               4 148
	//	               5 106
	//	               6 199
	//	               7 285
		   goto _L3 _L4 _L5 _L6 _L4 _L2
_L3:
		boolean flag2;
		boolean flag3;
		i = 0;
	//   30   92:iconst_0        
	//   31   93:istore          5
		flag2 = ((boolean) (i));
	//   32   95:iload           5
	//   33   97:istore          6
		flag3 = flag2;
	//   34   99:iload           6
	//   35  101:istore          7
		break MISSING_BLOCK_LABEL_335;
	//   36  103:goto            335
_L6:
		if(!flag1) goto _L8; else goto _L7
	//   37  106:iload           4
	//   38  108:ifeq            138
_L7:
		if(!fragment.mHiddenChanged || fragment.mHidden || !fragment.mAdded) goto _L10; else goto _L9
	//   39  111:aload           11
	//   40  113:getfield        #123 <Field boolean Fragment.mHiddenChanged>
	//   41  116:ifeq            322
	//   42  119:aload           11
	//   43  121:getfield        #126 <Field boolean Fragment.mHidden>
	//   44  124:ifne            322
	//   45  127:aload           11
	//   46  129:getfield        #129 <Field boolean Fragment.mAdded>
	//   47  132:ifeq            322
	//*  48  135:goto            316
_L8:
		flag4 = fragment.mHidden;
	//   49  138:aload           11
	//   50  140:getfield        #126 <Field boolean Fragment.mHidden>
	//   51  143:istore          9
		break MISSING_BLOCK_LABEL_325;
	//   52  145:goto            325
_L5:
		if(flag1 ? !fragment.mHiddenChanged || !fragment.mAdded || !fragment.mHidden : !fragment.mAdded || fragment.mHidden) goto _L12; else goto _L11
	//   53  148:iload           4
	//   54  150:ifeq            180
	//   55  153:aload           11
	//   56  155:getfield        #123 <Field boolean Fragment.mHiddenChanged>
	//   57  158:ifeq            247
	//   58  161:aload           11
	//   59  163:getfield        #129 <Field boolean Fragment.mAdded>
	//   60  166:ifeq            247
	//   61  169:aload           11
	//   62  171:getfield        #126 <Field boolean Fragment.mHidden>
	//   63  174:ifeq            247
	//   64  177:goto            241
	//   65  180:aload           11
	//   66  182:getfield        #129 <Field boolean Fragment.mAdded>
	//   67  185:ifeq            247
	//   68  188:aload           11
	//   69  190:getfield        #126 <Field boolean Fragment.mHidden>
	//   70  193:ifne            247
	//*  71  196:goto            177
_L4:
		if(flag1 ? fragment.mAdded || fragment.mView == null || fragment.mView.getVisibility() != 0 || fragment.mPostponedAlpha < 0.0F : !fragment.mAdded || fragment.mHidden) goto _L12; else goto _L11
	//   72  199:iload           4
	//   73  201:ifeq            253
	//   74  204:aload           11
	//   75  206:getfield        #129 <Field boolean Fragment.mAdded>
	//   76  209:ifne            247
	//   77  212:aload           11
	//   78  214:getfield        #133 <Field View Fragment.mView>
	//   79  217:ifnull          247
	//   80  220:aload           11
	//   81  222:getfield        #133 <Field View Fragment.mView>
	//   82  225:invokevirtual   #136 <Method int View.getVisibility()>
	//   83  228:ifne            247
	//   84  231:aload           11
	//   85  233:getfield        #140 <Field float Fragment.mPostponedAlpha>
	//   86  236:fconst_0        
	//   87  237:fcmpl           
	//   88  238:iflt            247
	//   89  241:iconst_1        
	//   90  242:istore          5
	//   91  244:goto            272
	//   92  247:iconst_0        
	//   93  248:istore          5
	//   94  250:goto            272
	//   95  253:aload           11
	//   96  255:getfield        #129 <Field boolean Fragment.mAdded>
	//   97  258:ifeq            247
	//   98  261:aload           11
	//   99  263:getfield        #126 <Field boolean Fragment.mHidden>
	//  100  266:ifne            247
_L11:
		i = 1;
		  goto _L13
_L12:
		i = 0;
	//* 101  269:goto            241
_L13:
		flag3 = ((boolean) (i));
	//  102  272:iload           5
	//  103  274:istore          7
		i = 0;
	//  104  276:iconst_0        
	//  105  277:istore          5
		flag2 = true;
	//  106  279:iconst_1        
	//  107  280:istore          6
		break MISSING_BLOCK_LABEL_335;
	//  108  282:goto            335
_L2:
		if(flag1)
	//* 109  285:iload           4
	//* 110  287:ifeq            300
		{
			flag4 = fragment.mIsNewlyAdded;
	//  111  290:aload           11
	//  112  292:getfield        #143 <Field boolean Fragment.mIsNewlyAdded>
	//  113  295:istore          9
			break MISSING_BLOCK_LABEL_325;
	//  114  297:goto            325
		}
		if(fragment.mAdded || fragment.mHidden) goto _L10; else goto _L9
	//  115  300:aload           11
	//  116  302:getfield        #129 <Field boolean Fragment.mAdded>
	//  117  305:ifne            322
	//  118  308:aload           11
	//  119  310:getfield        #126 <Field boolean Fragment.mHidden>
	//  120  313:ifne            322
_L9:
		flag4 = true;
	//  121  316:iconst_1        
	//  122  317:istore          9
		break MISSING_BLOCK_LABEL_325;
	//  123  319:goto            325
_L10:
		flag4 = false;
	//  124  322:iconst_0        
	//  125  323:istore          9
		flag2 = false;
	//  126  325:iconst_0        
	//  127  326:istore          6
		flag3 = flag2;
	//  128  328:iload           6
	//  129  330:istore          7
		i = 1;
	//  130  332:iconst_1        
	//  131  333:istore          5
		Object obj;
label0:
		{
			obj = ((Object) ((FragmentContainerTransition)sparsearray.get(j)));
	//  132  335:aload_2         
	//  133  336:iload           8
	//  134  338:invokevirtual   #148 <Method Object SparseArray.get(int)>
	//  135  341:checkcast       #14  <Class FragmentTransition$FragmentContainerTransition>
	//  136  344:astore          10
			op = ((BackStackRecord.Op) (obj));
	//  137  346:aload           10
	//  138  348:astore_1        
			if(flag4)
	//* 139  349:iload           9
	//* 140  351:ifeq            379
			{
				op = ((BackStackRecord.Op) (ensureContainer(((FragmentContainerTransition) (obj)), sparsearray, j)));
	//  141  354:aload           10
	//  142  356:aload_2         
	//  143  357:iload           8
	//  144  359:invokestatic    #152 <Method FragmentTransition$FragmentContainerTransition ensureContainer(FragmentTransition$FragmentContainerTransition, SparseArray, int)>
	//  145  362:astore_1        
				op.lastIn = fragment;
	//  146  363:aload_1         
	//  147  364:aload           11
	//  148  366:putfield        #155 <Field Fragment FragmentTransition$FragmentContainerTransition.lastIn>
				op.lastInIsPop = flag;
	//  149  369:aload_1         
	//  150  370:iload_3         
	//  151  371:putfield        #158 <Field boolean FragmentTransition$FragmentContainerTransition.lastInIsPop>
				op.lastInTransaction = backstackrecord;
	//  152  374:aload_1         
	//  153  375:aload_0         
	//  154  376:putfield        #162 <Field BackStackRecord FragmentTransition$FragmentContainerTransition.lastInTransaction>
			}
			if(!flag1 && i)
	//* 155  379:iload           4
	//* 156  381:ifne            456
	//* 157  384:iload           5
	//* 158  386:ifeq            456
			{
				if(op != null && ((FragmentContainerTransition) (op)).firstOut == fragment)
	//* 159  389:aload_1         
	//* 160  390:ifnull          407
	//* 161  393:aload_1         
	//* 162  394:getfield        #165 <Field Fragment FragmentTransition$FragmentContainerTransition.firstOut>
	//* 163  397:aload           11
	//* 164  399:if_acmpne       407
					op.firstOut = null;
	//  165  402:aload_1         
	//  166  403:aconst_null     
	//  167  404:putfield        #165 <Field Fragment FragmentTransition$FragmentContainerTransition.firstOut>
				obj = ((Object) (backstackrecord.mManager));
	//  168  407:aload_0         
	//  169  408:getfield        #171 <Field FragmentManagerImpl BackStackRecord.mManager>
	//  170  411:astore          10
				if(fragment.mState < 1 && ((FragmentManagerImpl) (obj)).mCurState >= 1 && !backstackrecord.mReorderingAllowed)
	//* 171  413:aload           11
	//* 172  415:getfield        #174 <Field int Fragment.mState>
	//* 173  418:iconst_1        
	//* 174  419:icmpge          456
	//* 175  422:aload           10
	//* 176  424:getfield        #179 <Field int FragmentManagerImpl.mCurState>
	//* 177  427:iconst_1        
	//* 178  428:icmplt          456
	//* 179  431:aload_0         
	//* 180  432:getfield        #182 <Field boolean BackStackRecord.mReorderingAllowed>
	//* 181  435:ifne            456
				{
					((FragmentManagerImpl) (obj)).makeActive(fragment);
	//  182  438:aload           10
	//  183  440:aload           11
	//  184  442:invokevirtual   #186 <Method void FragmentManagerImpl.makeActive(Fragment)>
					((FragmentManagerImpl) (obj)).moveToState(fragment, 1, 0, 0, false);
	//  185  445:aload           10
	//  186  447:aload           11
	//  187  449:iconst_1        
	//  188  450:iconst_0        
	//  189  451:iconst_0        
	//  190  452:iconst_0        
	//  191  453:invokevirtual   #190 <Method void FragmentManagerImpl.moveToState(Fragment, int, int, int, boolean)>
				}
			}
			obj = ((Object) (op));
	//  192  456:aload_1         
	//  193  457:astore          10
			if(!flag3)
				break label0;
	//  194  459:iload           7
	//  195  461:ifeq            506
			if(op != null)
	//* 196  464:aload_1         
	//* 197  465:ifnull          478
			{
				obj = ((Object) (op));
	//  198  468:aload_1         
	//  199  469:astore          10
				if(((FragmentContainerTransition) (op)).firstOut != null)
					break label0;
	//  200  471:aload_1         
	//  201  472:getfield        #165 <Field Fragment FragmentTransition$FragmentContainerTransition.firstOut>
	//  202  475:ifnonnull       506
			}
			obj = ((Object) (ensureContainer(((FragmentContainerTransition) (op)), sparsearray, j)));
	//  203  478:aload_1         
	//  204  479:aload_2         
	//  205  480:iload           8
	//  206  482:invokestatic    #152 <Method FragmentTransition$FragmentContainerTransition ensureContainer(FragmentTransition$FragmentContainerTransition, SparseArray, int)>
	//  207  485:astore          10
			obj.firstOut = fragment;
	//  208  487:aload           10
	//  209  489:aload           11
	//  210  491:putfield        #165 <Field Fragment FragmentTransition$FragmentContainerTransition.firstOut>
			obj.firstOutIsPop = flag;
	//  211  494:aload           10
	//  212  496:iload_3         
	//  213  497:putfield        #193 <Field boolean FragmentTransition$FragmentContainerTransition.firstOutIsPop>
			obj.firstOutTransaction = backstackrecord;
	//  214  500:aload           10
	//  215  502:aload_0         
	//  216  503:putfield        #196 <Field BackStackRecord FragmentTransition$FragmentContainerTransition.firstOutTransaction>
		}
		if(!flag1 && flag2 && obj != null && ((FragmentContainerTransition) (obj)).lastIn == fragment)
	//* 217  506:iload           4
	//* 218  508:ifne            537
	//* 219  511:iload           6
	//* 220  513:ifeq            537
	//* 221  516:aload           10
	//* 222  518:ifnull          537
	//* 223  521:aload           10
	//* 224  523:getfield        #155 <Field Fragment FragmentTransition$FragmentContainerTransition.lastIn>
	//* 225  526:aload           11
	//* 226  528:if_acmpne       537
			obj.lastIn = null;
	//  227  531:aload           10
	//  228  533:aconst_null     
	//  229  534:putfield        #155 <Field Fragment FragmentTransition$FragmentContainerTransition.lastIn>
		return;
	//  230  537:return          
	}

	public static void calculateFragments(BackStackRecord backstackrecord, SparseArray sparsearray, boolean flag)
	{
		int j = backstackrecord.mOps.size();
	//    0    0:aload_0         
	//    1    1:getfield        #203 <Field ArrayList BackStackRecord.mOps>
	//    2    4:invokevirtual   #204 <Method int ArrayList.size()>
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
	//   11   19:getfield        #203 <Field ArrayList BackStackRecord.mOps>
	//   12   22:iload_3         
	//   13   23:invokevirtual   #205 <Method Object ArrayList.get(int)>
	//   14   26:checkcast       #107 <Class BackStackRecord$Op>
	//   15   29:aload_1         
	//   16   30:iconst_0        
	//   17   31:iload_2         
	//   18   32:invokestatic    #207 <Method void addToFirstInLastOut(BackStackRecord, BackStackRecord$Op, SparseArray, boolean, boolean)>

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
	//    0    0:new             #74  <Class ArrayMap>
	//    1    3:dup             
	//    2    4:invokespecial   #211 <Method void ArrayMap()>
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
	//   13   24:invokevirtual   #205 <Method Object ArrayList.get(int)>
	//   14   27:checkcast       #167 <Class BackStackRecord>
	//   15   30:astore          11
			if(!backstackrecord.interactsWith(i))
	//*  16   32:aload           11
	//*  17   34:iload_0         
	//*  18   35:invokevirtual   #215 <Method boolean BackStackRecord.interactsWith(int)>
	//*  19   38:ifne            44
				continue;
	//   20   41:goto            195
			boolean flag = ((Boolean)arraylist1.get(k)).booleanValue();
	//   21   44:aload_2         
	//   22   45:iload           4
	//   23   47:invokevirtual   #205 <Method Object ArrayList.get(int)>
	//   24   50:checkcast       #217 <Class Boolean>
	//   25   53:invokevirtual   #221 <Method boolean Boolean.booleanValue()>
	//   26   56:istore          7
			if(backstackrecord.mSharedElementSourceNames == null)
				continue;
	//   27   58:aload           11
	//   28   60:getfield        #224 <Field ArrayList BackStackRecord.mSharedElementSourceNames>
	//   29   63:ifnull          195
			int i1 = backstackrecord.mSharedElementSourceNames.size();
	//   30   66:aload           11
	//   31   68:getfield        #224 <Field ArrayList BackStackRecord.mSharedElementSourceNames>
	//   32   71:invokevirtual   #204 <Method int ArrayList.size()>
	//   33   74:istore          6
			ArrayList arraylist2;
			ArrayList arraylist3;
			if(flag)
	//*  34   76:iload           7
	//*  35   78:ifeq            98
			{
				arraylist3 = backstackrecord.mSharedElementSourceNames;
	//   36   81:aload           11
	//   37   83:getfield        #224 <Field ArrayList BackStackRecord.mSharedElementSourceNames>
	//   38   86:astore          9
				arraylist2 = backstackrecord.mSharedElementTargetNames;
	//   39   88:aload           11
	//   40   90:getfield        #227 <Field ArrayList BackStackRecord.mSharedElementTargetNames>
	//   41   93:astore          8
			} else
	//*  42   95:goto            112
			{
				arraylist2 = backstackrecord.mSharedElementSourceNames;
	//   43   98:aload           11
	//   44  100:getfield        #224 <Field ArrayList BackStackRecord.mSharedElementSourceNames>
	//   45  103:astore          8
				arraylist3 = backstackrecord.mSharedElementTargetNames;
	//   46  105:aload           11
	//   47  107:getfield        #227 <Field ArrayList BackStackRecord.mSharedElementTargetNames>
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
	//   56  126:invokevirtual   #205 <Method Object ArrayList.get(int)>
	//   57  129:checkcast       #229 <Class String>
	//   58  132:astore          11
				String s1 = (String)arraylist3.get(l);
	//   59  134:aload           9
	//   60  136:iload           5
	//   61  138:invokevirtual   #205 <Method Object ArrayList.get(int)>
	//   62  141:checkcast       #229 <Class String>
	//   63  144:astore          12
				String s2 = (String)arraymap.remove(((Object) (s1)));
	//   64  146:aload           10
	//   65  148:aload           12
	//   66  150:invokevirtual   #233 <Method Object ArrayMap.remove(Object)>
	//   67  153:checkcast       #229 <Class String>
	//   68  156:astore          13
				if(s2 != null)
	//*  69  158:aload           13
	//*  70  160:ifnull          176
					arraymap.put(((Object) (s)), ((Object) (s2)));
	//   71  163:aload           10
	//   72  165:aload           11
	//   73  167:aload           13
	//   74  169:invokevirtual   #237 <Method Object ArrayMap.put(Object, Object)>
	//   75  172:pop             
				else
	//*  76  173:goto            186
					arraymap.put(((Object) (s)), ((Object) (s1)));
	//   77  176:aload           10
	//   78  178:aload           11
	//   79  180:aload           12
	//   80  182:invokevirtual   #237 <Method Object ArrayMap.put(Object, Object)>
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
	//*   1    1:getfield        #171 <Field FragmentManagerImpl BackStackRecord.mManager>
	//*   2    4:getfield        #243 <Field FragmentContainer FragmentManagerImpl.mContainer>
	//*   3    7:invokevirtual   #248 <Method boolean FragmentContainer.onHasView()>
	//*   4   10:ifne            14
			return;
	//    5   13:return          
		for(int i = backstackrecord.mOps.size() - 1; i >= 0; i--)
	//*   6   14:aload_0         
	//*   7   15:getfield        #203 <Field ArrayList BackStackRecord.mOps>
	//*   8   18:invokevirtual   #204 <Method int ArrayList.size()>
	//*   9   21:iconst_1        
	//*  10   22:isub            
	//*  11   23:istore_3        
	//*  12   24:iload_3         
	//*  13   25:iflt            53
			addToFirstInLastOut(backstackrecord, (BackStackRecord.Op)backstackrecord.mOps.get(i), sparsearray, true, flag);
	//   14   28:aload_0         
	//   15   29:aload_0         
	//   16   30:getfield        #203 <Field ArrayList BackStackRecord.mOps>
	//   17   33:iload_3         
	//   18   34:invokevirtual   #205 <Method Object ArrayList.get(int)>
	//   19   37:checkcast       #107 <Class BackStackRecord$Op>
	//   20   40:aload_1         
	//   21   41:iconst_1        
	//   22   42:iload_2         
	//   23   43:invokestatic    #207 <Method void addToFirstInLastOut(BackStackRecord, BackStackRecord$Op, SparseArray, boolean, boolean)>

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
	//    3    5:invokevirtual   #252 <Method SharedElementCallback Fragment.getEnterTransitionCallback()>
	//    4    8:astore_0        
		else
	//*   5    9:goto            17
			fragment = ((Fragment) (fragment.getEnterTransitionCallback()));
	//    6   12:aload_0         
	//    7   13:invokevirtual   #252 <Method SharedElementCallback Fragment.getEnterTransitionCallback()>
	//    8   16:astore_0        
		if(fragment != null)
	//*   9   17:aload_0         
	//*  10   18:ifnull          118
		{
			fragment1 = ((Fragment) (new ArrayList()));
	//   11   21:new             #98  <Class ArrayList>
	//   12   24:dup             
	//   13   25:invokespecial   #253 <Method void ArrayList()>
	//   14   28:astore_1        
			ArrayList arraylist = new ArrayList();
	//   15   29:new             #98  <Class ArrayList>
	//   16   32:dup             
	//   17   33:invokespecial   #253 <Method void ArrayList()>
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
	//   27   52:invokevirtual   #78  <Method int ArrayMap.size()>
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
	//   35   69:invokevirtual   #256 <Method Object ArrayMap.keyAt(int)>
	//   36   72:invokevirtual   #101 <Method boolean ArrayList.add(Object)>
	//   37   75:pop             
				((ArrayList) (fragment1)).add(arraymap.valueAt(j));
	//   38   76:aload_1         
	//   39   77:aload_3         
	//   40   78:iload           6
	//   41   80:invokevirtual   #82  <Method Object ArrayMap.valueAt(int)>
	//   42   83:invokevirtual   #101 <Method boolean ArrayList.add(Object)>
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
	//   55  106:invokevirtual   #262 <Method void SharedElementCallback.onSharedElementStart(List, List, List)>
				return;
	//   56  109:return          
			}
			((SharedElementCallback) (fragment)).onSharedElementEnd(((List) (arraylist)), ((List) (fragment1)), ((List) (null)));
	//   57  110:aload_0         
	//   58  111:aload           7
	//   59  113:aload_1         
	//   60  114:aconst_null     
	//   61  115:invokevirtual   #265 <Method void SharedElementCallback.onSharedElementEnd(List, List, List)>
		}
	//   62  118:return          
	}

	private static boolean canHandleAll(FragmentTransitionImpl fragmenttransitionimpl, List list)
	{
		int j = list.size();
	//    0    0:aload_1         
	//    1    1:invokeinterface #271 <Method int List.size()>
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
	//*  11   17:invokeinterface #272 <Method Object List.get(int)>
	//*  12   22:invokevirtual   #277 <Method boolean FragmentTransitionImpl.canHandle(Object)>
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

	private static ArrayMap captureInSharedElements(FragmentTransitionImpl fragmenttransitionimpl, ArrayMap arraymap, Object obj, FragmentContainerTransition fragmentcontainertransition)
	{
		Fragment fragment = fragmentcontainertransition.lastIn;
	//    0    0:aload_3         
	//    1    1:getfield        #155 <Field Fragment FragmentTransition$FragmentContainerTransition.lastIn>
	//    2    4:astore          6
		View view = fragment.getView();
	//    3    6:aload           6
	//    4    8:invokevirtual   #282 <Method View Fragment.getView()>
	//    5   11:astore          7
		if(!arraymap.isEmpty() && obj != null && view != null)
	//*   6   13:aload_1         
	//*   7   14:invokevirtual   #285 <Method boolean ArrayMap.isEmpty()>
	//*   8   17:ifne            223
	//*   9   20:aload_2         
	//*  10   21:ifnull          223
	//*  11   24:aload           7
	//*  12   26:ifnonnull       32
	//*  13   29:goto            223
		{
			ArrayMap arraymap1 = new ArrayMap();
	//   14   32:new             #74  <Class ArrayMap>
	//   15   35:dup             
	//   16   36:invokespecial   #211 <Method void ArrayMap()>
	//   17   39:astore          5
			fragmenttransitionimpl.findNamedViews(((java.util.Map) (arraymap1)), view);
	//   18   41:aload_0         
	//   19   42:aload           5
	//   20   44:aload           7
	//   21   46:invokevirtual   #289 <Method void FragmentTransitionImpl.findNamedViews(java.util.Map, View)>
			fragmenttransitionimpl = ((FragmentTransitionImpl) (fragmentcontainertransition.lastInTransaction));
	//   22   49:aload_3         
	//   23   50:getfield        #162 <Field BackStackRecord FragmentTransition$FragmentContainerTransition.lastInTransaction>
	//   24   53:astore_0        
			if(fragmentcontainertransition.lastInIsPop)
	//*  25   54:aload_3         
	//*  26   55:getfield        #158 <Field boolean FragmentTransition$FragmentContainerTransition.lastInIsPop>
	//*  27   58:ifeq            75
			{
				obj = ((Object) (fragment.getExitTransitionCallback()));
	//   28   61:aload           6
	//   29   63:invokevirtual   #292 <Method SharedElementCallback Fragment.getExitTransitionCallback()>
	//   30   66:astore_2        
				fragmenttransitionimpl = ((FragmentTransitionImpl) (((BackStackRecord) (fragmenttransitionimpl)).mSharedElementSourceNames));
	//   31   67:aload_0         
	//   32   68:getfield        #224 <Field ArrayList BackStackRecord.mSharedElementSourceNames>
	//   33   71:astore_0        
			} else
	//*  34   72:goto            86
			{
				obj = ((Object) (fragment.getEnterTransitionCallback()));
	//   35   75:aload           6
	//   36   77:invokevirtual   #252 <Method SharedElementCallback Fragment.getEnterTransitionCallback()>
	//   37   80:astore_2        
				fragmenttransitionimpl = ((FragmentTransitionImpl) (((BackStackRecord) (fragmenttransitionimpl)).mSharedElementTargetNames));
	//   38   81:aload_0         
	//   39   82:getfield        #227 <Field ArrayList BackStackRecord.mSharedElementTargetNames>
	//   40   85:astore_0        
			}
			if(fragmenttransitionimpl != null)
	//*  41   86:aload_0         
	//*  42   87:ifnull          107
			{
				arraymap1.retainAll(((Collection) (fragmenttransitionimpl)));
	//   43   90:aload           5
	//   44   92:aload_0         
	//   45   93:invokevirtual   #296 <Method boolean ArrayMap.retainAll(Collection)>
	//   46   96:pop             
				arraymap1.retainAll(arraymap.values());
	//   47   97:aload           5
	//   48   99:aload_1         
	//   49  100:invokevirtual   #300 <Method Collection ArrayMap.values()>
	//   50  103:invokevirtual   #296 <Method boolean ArrayMap.retainAll(Collection)>
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
	//   57  115:invokevirtual   #304 <Method void SharedElementCallback.onMapSharedElements(List, java.util.Map)>
				for(int i = ((ArrayList) (fragmenttransitionimpl)).size() - 1; i >= 0; i--)
	//*  58  118:aload_0         
	//*  59  119:invokevirtual   #204 <Method int ArrayList.size()>
	//*  60  122:iconst_1        
	//*  61  123:isub            
	//*  62  124:istore          4
	//*  63  126:iload           4
	//*  64  128:iflt            220
				{
					fragmentcontainertransition = ((FragmentContainerTransition) ((String)((ArrayList) (fragmenttransitionimpl)).get(i)));
	//   65  131:aload_0         
	//   66  132:iload           4
	//   67  134:invokevirtual   #205 <Method Object ArrayList.get(int)>
	//   68  137:checkcast       #229 <Class String>
	//   69  140:astore_3        
					obj = ((Object) ((View)arraymap1.get(((Object) (fragmentcontainertransition)))));
	//   70  141:aload           5
	//   71  143:aload_3         
	//   72  144:invokevirtual   #306 <Method Object ArrayMap.get(Object)>
	//   73  147:checkcast       #84  <Class View>
	//   74  150:astore_2        
					if(obj == null)
	//*  75  151:aload_2         
	//*  76  152:ifnonnull       174
					{
						obj = ((Object) (findKeyForValue(arraymap, ((String) (fragmentcontainertransition)))));
	//   77  155:aload_1         
	//   78  156:aload_3         
	//   79  157:invokestatic    #310 <Method String findKeyForValue(ArrayMap, String)>
	//   80  160:astore_2        
						if(obj != null)
	//*  81  161:aload_2         
	//*  82  162:ifnull          205
							arraymap.remove(obj);
	//   83  165:aload_1         
	//   84  166:aload_2         
	//   85  167:invokevirtual   #233 <Method Object ArrayMap.remove(Object)>
	//   86  170:pop             
					} else
	//*  87  171:goto            205
					if(!((String) (fragmentcontainertransition)).equals(((Object) (ViewCompat.getTransitionName(((View) (obj)))))))
	//*  88  174:aload_3         
	//*  89  175:aload_2         
	//*  90  176:invokestatic    #90  <Method String ViewCompat.getTransitionName(View)>
	//*  91  179:invokevirtual   #313 <Method boolean String.equals(Object)>
	//*  92  182:ifne            205
					{
						fragmentcontainertransition = ((FragmentContainerTransition) (findKeyForValue(arraymap, ((String) (fragmentcontainertransition)))));
	//   93  185:aload_1         
	//   94  186:aload_3         
	//   95  187:invokestatic    #310 <Method String findKeyForValue(ArrayMap, String)>
	//   96  190:astore_3        
						if(fragmentcontainertransition != null)
	//*  97  191:aload_3         
	//*  98  192:ifnull          205
							arraymap.put(((Object) (fragmentcontainertransition)), ((Object) (ViewCompat.getTransitionName(((View) (obj))))));
	//   99  195:aload_1         
	//  100  196:aload_3         
	//  101  197:aload_2         
	//  102  198:invokestatic    #90  <Method String ViewCompat.getTransitionName(View)>
	//  103  201:invokevirtual   #237 <Method Object ArrayMap.put(Object, Object)>
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
	//  112  217:invokestatic    #317 <Method void retainValues(ArrayMap, ArrayMap)>
			}
			return arraymap1;
	//  113  220:aload           5
	//  114  222:areturn         
		} else
		{
			arraymap.clear();
	//  115  223:aload_1         
	//  116  224:invokevirtual   #320 <Method void ArrayMap.clear()>
			return null;
	//  117  227:aconst_null     
	//  118  228:areturn         
		}
	}

	private static ArrayMap captureOutSharedElements(FragmentTransitionImpl fragmenttransitionimpl, ArrayMap arraymap, Object obj, FragmentContainerTransition fragmentcontainertransition)
	{
		if(!arraymap.isEmpty() && obj != null)
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #285 <Method boolean ArrayMap.isEmpty()>
	//*   2    4:ifne            189
	//*   3    7:aload_2         
	//*   4    8:ifnonnull       14
	//*   5   11:goto            189
		{
			obj = ((Object) (fragmentcontainertransition.firstOut));
	//    6   14:aload_3         
	//    7   15:getfield        #165 <Field Fragment FragmentTransition$FragmentContainerTransition.firstOut>
	//    8   18:astore_2        
			ArrayMap arraymap1 = new ArrayMap();
	//    9   19:new             #74  <Class ArrayMap>
	//   10   22:dup             
	//   11   23:invokespecial   #211 <Method void ArrayMap()>
	//   12   26:astore          5
			fragmenttransitionimpl.findNamedViews(((java.util.Map) (arraymap1)), ((Fragment) (obj)).getView());
	//   13   28:aload_0         
	//   14   29:aload           5
	//   15   31:aload_2         
	//   16   32:invokevirtual   #282 <Method View Fragment.getView()>
	//   17   35:invokevirtual   #289 <Method void FragmentTransitionImpl.findNamedViews(java.util.Map, View)>
			fragmenttransitionimpl = ((FragmentTransitionImpl) (fragmentcontainertransition.firstOutTransaction));
	//   18   38:aload_3         
	//   19   39:getfield        #196 <Field BackStackRecord FragmentTransition$FragmentContainerTransition.firstOutTransaction>
	//   20   42:astore_0        
			if(fragmentcontainertransition.firstOutIsPop)
	//*  21   43:aload_3         
	//*  22   44:getfield        #193 <Field boolean FragmentTransition$FragmentContainerTransition.firstOutIsPop>
	//*  23   47:ifeq            63
			{
				obj = ((Object) (((Fragment) (obj)).getEnterTransitionCallback()));
	//   24   50:aload_2         
	//   25   51:invokevirtual   #252 <Method SharedElementCallback Fragment.getEnterTransitionCallback()>
	//   26   54:astore_2        
				fragmenttransitionimpl = ((FragmentTransitionImpl) (((BackStackRecord) (fragmenttransitionimpl)).mSharedElementTargetNames));
	//   27   55:aload_0         
	//   28   56:getfield        #227 <Field ArrayList BackStackRecord.mSharedElementTargetNames>
	//   29   59:astore_0        
			} else
	//*  30   60:goto            73
			{
				obj = ((Object) (((Fragment) (obj)).getExitTransitionCallback()));
	//   31   63:aload_2         
	//   32   64:invokevirtual   #292 <Method SharedElementCallback Fragment.getExitTransitionCallback()>
	//   33   67:astore_2        
				fragmenttransitionimpl = ((FragmentTransitionImpl) (((BackStackRecord) (fragmenttransitionimpl)).mSharedElementSourceNames));
	//   34   68:aload_0         
	//   35   69:getfield        #224 <Field ArrayList BackStackRecord.mSharedElementSourceNames>
	//   36   72:astore_0        
			}
			arraymap1.retainAll(((Collection) (fragmenttransitionimpl)));
	//   37   73:aload           5
	//   38   75:aload_0         
	//   39   76:invokevirtual   #296 <Method boolean ArrayMap.retainAll(Collection)>
	//   40   79:pop             
			if(obj != null)
	//*  41   80:aload_2         
	//*  42   81:ifnull          176
			{
				((SharedElementCallback) (obj)).onMapSharedElements(((List) (fragmenttransitionimpl)), ((java.util.Map) (arraymap1)));
	//   43   84:aload_2         
	//   44   85:aload_0         
	//   45   86:aload           5
	//   46   88:invokevirtual   #304 <Method void SharedElementCallback.onMapSharedElements(List, java.util.Map)>
				for(int i = ((ArrayList) (fragmenttransitionimpl)).size() - 1; i >= 0; i--)
	//*  47   91:aload_0         
	//*  48   92:invokevirtual   #204 <Method int ArrayList.size()>
	//*  49   95:iconst_1        
	//*  50   96:isub            
	//*  51   97:istore          4
	//*  52   99:iload           4
	//*  53  101:iflt            186
				{
					fragmentcontainertransition = ((FragmentContainerTransition) ((String)((ArrayList) (fragmenttransitionimpl)).get(i)));
	//   54  104:aload_0         
	//   55  105:iload           4
	//   56  107:invokevirtual   #205 <Method Object ArrayList.get(int)>
	//   57  110:checkcast       #229 <Class String>
	//   58  113:astore_3        
					obj = ((Object) ((View)arraymap1.get(((Object) (fragmentcontainertransition)))));
	//   59  114:aload           5
	//   60  116:aload_3         
	//   61  117:invokevirtual   #306 <Method Object ArrayMap.get(Object)>
	//   62  120:checkcast       #84  <Class View>
	//   63  123:astore_2        
					if(obj == null)
	//*  64  124:aload_2         
	//*  65  125:ifnonnull       137
						arraymap.remove(((Object) (fragmentcontainertransition)));
	//   66  128:aload_1         
	//   67  129:aload_3         
	//   68  130:invokevirtual   #233 <Method Object ArrayMap.remove(Object)>
	//   69  133:pop             
					else
	//*  70  134:goto            167
					if(!((String) (fragmentcontainertransition)).equals(((Object) (ViewCompat.getTransitionName(((View) (obj)))))))
	//*  71  137:aload_3         
	//*  72  138:aload_2         
	//*  73  139:invokestatic    #90  <Method String ViewCompat.getTransitionName(View)>
	//*  74  142:invokevirtual   #313 <Method boolean String.equals(Object)>
	//*  75  145:ifne            167
					{
						fragmentcontainertransition = ((FragmentContainerTransition) ((String)arraymap.remove(((Object) (fragmentcontainertransition)))));
	//   76  148:aload_1         
	//   77  149:aload_3         
	//   78  150:invokevirtual   #233 <Method Object ArrayMap.remove(Object)>
	//   79  153:checkcast       #229 <Class String>
	//   80  156:astore_3        
						arraymap.put(((Object) (ViewCompat.getTransitionName(((View) (obj))))), ((Object) (fragmentcontainertransition)));
	//   81  157:aload_1         
	//   82  158:aload_2         
	//   83  159:invokestatic    #90  <Method String ViewCompat.getTransitionName(View)>
	//   84  162:aload_3         
	//   85  163:invokevirtual   #237 <Method Object ArrayMap.put(Object, Object)>
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
	//   94  179:invokevirtual   #326 <Method java.util.Set ArrayMap.keySet()>
	//   95  182:invokevirtual   #296 <Method boolean ArrayMap.retainAll(Collection)>
	//   96  185:pop             
			}
			return arraymap1;
	//   97  186:aload           5
	//   98  188:areturn         
		} else
		{
			arraymap.clear();
	//   99  189:aload_1         
	//  100  190:invokevirtual   #320 <Method void ArrayMap.clear()>
			return null;
	//  101  193:aconst_null     
	//  102  194:areturn         
		}
	}

	private static FragmentTransitionImpl chooseImpl(Fragment fragment, Fragment fragment1)
	{
		ArrayList arraylist = new ArrayList();
	//    0    0:new             #98  <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #253 <Method void ArrayList()>
	//    3    7:astore_2        
		if(fragment != null)
	//*   4    8:aload_0         
	//*   5    9:ifnull          57
		{
			Object obj = fragment.getExitTransition();
	//    6   12:aload_0         
	//    7   13:invokevirtual   #332 <Method Object Fragment.getExitTransition()>
	//    8   16:astore_3        
			if(obj != null)
	//*   9   17:aload_3         
	//*  10   18:ifnull          27
				arraylist.add(obj);
	//   11   21:aload_2         
	//   12   22:aload_3         
	//   13   23:invokevirtual   #101 <Method boolean ArrayList.add(Object)>
	//   14   26:pop             
			obj = fragment.getReturnTransition();
	//   15   27:aload_0         
	//   16   28:invokevirtual   #335 <Method Object Fragment.getReturnTransition()>
	//   17   31:astore_3        
			if(obj != null)
	//*  18   32:aload_3         
	//*  19   33:ifnull          42
				arraylist.add(obj);
	//   20   36:aload_2         
	//   21   37:aload_3         
	//   22   38:invokevirtual   #101 <Method boolean ArrayList.add(Object)>
	//   23   41:pop             
			fragment = ((Fragment) (fragment.getSharedElementReturnTransition()));
	//   24   42:aload_0         
	//   25   43:invokevirtual   #338 <Method Object Fragment.getSharedElementReturnTransition()>
	//   26   46:astore_0        
			if(fragment != null)
	//*  27   47:aload_0         
	//*  28   48:ifnull          57
				arraylist.add(((Object) (fragment)));
	//   29   51:aload_2         
	//   30   52:aload_0         
	//   31   53:invokevirtual   #101 <Method boolean ArrayList.add(Object)>
	//   32   56:pop             
		}
		if(fragment1 != null)
	//*  33   57:aload_1         
	//*  34   58:ifnull          106
		{
			fragment = ((Fragment) (fragment1.getEnterTransition()));
	//   35   61:aload_1         
	//   36   62:invokevirtual   #341 <Method Object Fragment.getEnterTransition()>
	//   37   65:astore_0        
			if(fragment != null)
	//*  38   66:aload_0         
	//*  39   67:ifnull          76
				arraylist.add(((Object) (fragment)));
	//   40   70:aload_2         
	//   41   71:aload_0         
	//   42   72:invokevirtual   #101 <Method boolean ArrayList.add(Object)>
	//   43   75:pop             
			fragment = ((Fragment) (fragment1.getReenterTransition()));
	//   44   76:aload_1         
	//   45   77:invokevirtual   #344 <Method Object Fragment.getReenterTransition()>
	//   46   80:astore_0        
			if(fragment != null)
	//*  47   81:aload_0         
	//*  48   82:ifnull          91
				arraylist.add(((Object) (fragment)));
	//   49   85:aload_2         
	//   50   86:aload_0         
	//   51   87:invokevirtual   #101 <Method boolean ArrayList.add(Object)>
	//   52   90:pop             
			fragment = ((Fragment) (fragment1.getSharedElementEnterTransition()));
	//   53   91:aload_1         
	//   54   92:invokevirtual   #347 <Method Object Fragment.getSharedElementEnterTransition()>
	//   55   95:astore_0        
			if(fragment != null)
	//*  56   96:aload_0         
	//*  57   97:ifnull          106
				arraylist.add(((Object) (fragment)));
	//   58  100:aload_2         
	//   59  101:aload_0         
	//   60  102:invokevirtual   #101 <Method boolean ArrayList.add(Object)>
	//   61  105:pop             
		}
		if(arraylist.isEmpty())
	//*  62  106:aload_2         
	//*  63  107:invokevirtual   #348 <Method boolean ArrayList.isEmpty()>
	//*  64  110:ifeq            115
			return null;
	//   65  113:aconst_null     
	//   66  114:areturn         
		if(PLATFORM_IMPL != null && canHandleAll(PLATFORM_IMPL, ((List) (arraylist))))
	//*  67  115:getstatic       #37  <Field FragmentTransitionImpl PLATFORM_IMPL>
	//*  68  118:ifnull          135
	//*  69  121:getstatic       #37  <Field FragmentTransitionImpl PLATFORM_IMPL>
	//*  70  124:aload_2         
	//*  71  125:invokestatic    #350 <Method boolean canHandleAll(FragmentTransitionImpl, List)>
	//*  72  128:ifeq            135
			return PLATFORM_IMPL;
	//   73  131:getstatic       #37  <Field FragmentTransitionImpl PLATFORM_IMPL>
	//   74  134:areturn         
		if(SUPPORT_IMPL != null && canHandleAll(SUPPORT_IMPL, ((List) (arraylist))))
	//*  75  135:getstatic       #43  <Field FragmentTransitionImpl SUPPORT_IMPL>
	//*  76  138:ifnull          155
	//*  77  141:getstatic       #43  <Field FragmentTransitionImpl SUPPORT_IMPL>
	//*  78  144:aload_2         
	//*  79  145:invokestatic    #350 <Method boolean canHandleAll(FragmentTransitionImpl, List)>
	//*  80  148:ifeq            155
			return SUPPORT_IMPL;
	//   81  151:getstatic       #43  <Field FragmentTransitionImpl SUPPORT_IMPL>
	//   82  154:areturn         
		if(PLATFORM_IMPL == null && SUPPORT_IMPL == null)
	//*  83  155:getstatic       #37  <Field FragmentTransitionImpl PLATFORM_IMPL>
	//*  84  158:ifnonnull       172
	//*  85  161:getstatic       #43  <Field FragmentTransitionImpl SUPPORT_IMPL>
	//*  86  164:ifnull          170
	//*  87  167:goto            172
			return null;
	//   88  170:aconst_null     
	//   89  171:areturn         
		else
			throw new IllegalArgumentException("Invalid Transition types");
	//   90  172:new             #352 <Class IllegalArgumentException>
	//   91  175:dup             
	//   92  176:ldc2            #354 <String "Invalid Transition types">
	//   93  179:invokespecial   #357 <Method void IllegalArgumentException(String)>
	//   94  182:athrow          
	}

	private static ArrayList configureEnteringExitingViews(FragmentTransitionImpl fragmenttransitionimpl, Object obj, Fragment fragment, ArrayList arraylist, View view)
	{
		if(obj != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          69
		{
			ArrayList arraylist1 = new ArrayList();
	//    2    4:new             #98  <Class ArrayList>
	//    3    7:dup             
	//    4    8:invokespecial   #253 <Method void ArrayList()>
	//    5   11:astore          5
			fragment = ((Fragment) (fragment.getView()));
	//    6   13:aload_2         
	//    7   14:invokevirtual   #282 <Method View Fragment.getView()>
	//    8   17:astore_2        
			if(fragment != null)
	//*   9   18:aload_2         
	//*  10   19:ifnull          29
				fragmenttransitionimpl.captureTransitioningViews(arraylist1, ((View) (fragment)));
	//   11   22:aload_0         
	//   12   23:aload           5
	//   13   25:aload_2         
	//   14   26:invokevirtual   #361 <Method void FragmentTransitionImpl.captureTransitioningViews(ArrayList, View)>
			if(arraylist != null)
	//*  15   29:aload_3         
	//*  16   30:ifnull          40
				arraylist1.removeAll(((Collection) (arraylist)));
	//   17   33:aload           5
	//   18   35:aload_3         
	//   19   36:invokevirtual   #364 <Method boolean ArrayList.removeAll(Collection)>
	//   20   39:pop             
			fragment = ((Fragment) (arraylist1));
	//   21   40:aload           5
	//   22   42:astore_2        
			if(!arraylist1.isEmpty())
	//*  23   43:aload           5
	//*  24   45:invokevirtual   #348 <Method boolean ArrayList.isEmpty()>
	//*  25   48:ifne            71
			{
				arraylist1.add(((Object) (view)));
	//   26   51:aload           5
	//   27   53:aload           4
	//   28   55:invokevirtual   #101 <Method boolean ArrayList.add(Object)>
	//   29   58:pop             
				fragmenttransitionimpl.addTargets(obj, arraylist1);
	//   30   59:aload_0         
	//   31   60:aload_1         
	//   32   61:aload           5
	//   33   63:invokevirtual   #368 <Method void FragmentTransitionImpl.addTargets(Object, ArrayList)>
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
	//    1    2:getfield        #155 <Field Fragment FragmentTransition$FragmentContainerTransition.lastIn>
	//    2    5:astore          12
		Fragment fragment1 = fragmentcontainertransition.firstOut;
	//    3    7:aload           4
	//    4    9:getfield        #165 <Field Fragment FragmentTransition$FragmentContainerTransition.firstOut>
	//    5   12:astore          13
		if(fragment != null)
	//*   6   14:aload           12
	//*   7   16:ifnull          229
		{
			if(fragment1 == null)
	//*   8   19:aload           13
	//*   9   21:ifnonnull       26
				return ((Object) (null));
	//   10   24:aconst_null     
	//   11   25:areturn         
			boolean flag = fragmentcontainertransition.lastInIsPop;
	//   12   26:aload           4
	//   13   28:getfield        #158 <Field boolean FragmentTransition$FragmentContainerTransition.lastInIsPop>
	//   14   31:istore          9
			Object obj2;
			if(arraymap.isEmpty())
	//*  15   33:aload_3         
	//*  16   34:invokevirtual   #285 <Method boolean ArrayMap.isEmpty()>
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
	//   25   53:invokestatic    #375 <Method Object getSharedElementTransition(FragmentTransitionImpl, Fragment, Fragment, boolean)>
	//   26   56:astore          10
			ArrayMap arraymap1 = arraymap;
	//   27   58:aload_3         
	//   28   59:astore          11
			ArrayMap arraymap2 = captureOutSharedElements(fragmenttransitionimpl, arraymap1, obj2, fragmentcontainertransition);
	//   29   61:aload_0         
	//   30   62:aload           11
	//   31   64:aload           10
	//   32   66:aload           4
	//   33   68:invokestatic    #377 <Method ArrayMap captureOutSharedElements(FragmentTransitionImpl, ArrayMap, Object, FragmentTransition$FragmentContainerTransition)>
	//   34   71:astore          14
			if(arraymap.isEmpty())
	//*  35   73:aload_3         
	//*  36   74:invokevirtual   #285 <Method boolean ArrayMap.isEmpty()>
	//*  37   77:ifeq            85
			{
				arraymap = null;
	//   38   80:aconst_null     
	//   39   81:astore_3        
			} else
	//*  40   82:goto            99
			{
				arraylist.addAll(arraymap2.values());
	//   41   85:aload           5
	//   42   87:aload           14
	//   43   89:invokevirtual   #300 <Method Collection ArrayMap.values()>
	//   44   92:invokevirtual   #380 <Method boolean ArrayList.addAll(Collection)>
	//   45   95:pop             
				arraymap = ((ArrayMap) (obj2));
	//   46   96:aload           10
	//   47   98:astore_3        
			}
			if(obj == null && obj1 == null && arraymap == null)
	//*  48   99:aload           7
	//*  49  101:ifnonnull       115
	//*  50  104:aload           8
	//*  51  106:ifnonnull       115
	//*  52  109:aload_3         
	//*  53  110:ifnonnull       115
				return ((Object) (null));
	//   54  113:aconst_null     
	//   55  114:areturn         
			callSharedElementStartEnd(fragment, fragment1, flag, arraymap2, true);
	//   56  115:aload           12
	//   57  117:aload           13
	//   58  119:iload           9
	//   59  121:aload           14
	//   60  123:iconst_1        
	//   61  124:invokestatic    #60  <Method void callSharedElementStartEnd(Fragment, Fragment, boolean, ArrayMap, boolean)>
			if(arraymap != null)
	//*  62  127:aload_3         
	//*  63  128:ifnull          191
			{
				Rect rect = new Rect();
	//   64  131:new             #382 <Class Rect>
	//   65  134:dup             
	//   66  135:invokespecial   #383 <Method void Rect()>
	//   67  138:astore          10
				fragmenttransitionimpl.setSharedElementTargets(((Object) (arraymap)), view, arraylist);
	//   68  140:aload_0         
	//   69  141:aload_3         
	//   70  142:aload_2         
	//   71  143:aload           5
	//   72  145:invokevirtual   #387 <Method void FragmentTransitionImpl.setSharedElementTargets(Object, View, ArrayList)>
				setOutEpicenter(fragmenttransitionimpl, ((Object) (arraymap)), obj1, arraymap2, fragmentcontainertransition.firstOutIsPop, fragmentcontainertransition.firstOutTransaction);
	//   73  148:aload_0         
	//   74  149:aload_3         
	//   75  150:aload           8
	//   76  152:aload           14
	//   77  154:aload           4
	//   78  156:getfield        #193 <Field boolean FragmentTransition$FragmentContainerTransition.firstOutIsPop>
	//   79  159:aload           4
	//   80  161:getfield        #196 <Field BackStackRecord FragmentTransition$FragmentContainerTransition.firstOutTransaction>
	//   81  164:invokestatic    #391 <Method void setOutEpicenter(FragmentTransitionImpl, Object, Object, ArrayMap, boolean, BackStackRecord)>
				obj1 = ((Object) (rect));
	//   82  167:aload           10
	//   83  169:astore          8
				if(obj != null)
	//*  84  171:aload           7
	//*  85  173:ifnull          194
				{
					fragmenttransitionimpl.setEpicenter(obj, rect);
	//   86  176:aload_0         
	//   87  177:aload           7
	//   88  179:aload           10
	//   89  181:invokevirtual   #395 <Method void FragmentTransitionImpl.setEpicenter(Object, Rect)>
					obj1 = ((Object) (rect));
	//   90  184:aload           10
	//   91  186:astore          8
				}
			} else
	//*  92  188:goto            194
			{
				obj1 = null;
	//   93  191:aconst_null     
	//   94  192:astore          8
			}
			OneShotPreDrawListener.add(((View) (viewgroup)), new Runnable(fragmenttransitionimpl, arraymap1, ((Object) (arraymap)), fragmentcontainertransition, arraylist1, view, fragment, fragment1, flag, arraylist, obj, ((Rect) (obj1))) {

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
				//    8   16:invokestatic    #67  <Method ArrayMap FragmentTransition.access$300(FragmentTransitionImpl, ArrayMap, Object, FragmentTransition$FragmentContainerTransition)>
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
				//   32   62:invokestatic    #87  <Method void FragmentTransition.access$200(Fragment, Fragment, boolean, ArrayMap, boolean)>
					if(finalSharedElementTransition != null)
				//*  33   65:aload_0         
				//*  34   66:getfield        #40  <Field Object val$finalSharedElementTransition>
				//*  35   69:ifnull          124
					{
						impl.swapSharedElementTargets(finalSharedElementTransition, sharedElementsOut, sharedElementsIn);
				//   36   72:aload_0         
				//   37   73:getfield        #36  <Field FragmentTransitionImpl val$impl>
				//   38   76:aload_0         
				//   39   77:getfield        #40  <Field Object val$finalSharedElementTransition>
				//   40   80:aload_0         
				//   41   81:getfield        #54  <Field ArrayList val$sharedElementsOut>
				//   42   84:aload_0         
				//   43   85:getfield        #44  <Field ArrayList val$sharedElementsIn>
				//   44   88:invokevirtual   #93  <Method void FragmentTransitionImpl.swapSharedElementTargets(Object, ArrayList, ArrayList)>
						obj3 = ((Object) (FragmentTransition.getInEpicenterView(((ArrayMap) (obj3)), fragments, enterTransition, inIsPop)));
				//   45   91:aload_1         
				//   46   92:aload_0         
				//   47   93:getfield        #42  <Field FragmentTransition$FragmentContainerTransition val$fragments>
				//   48   96:aload_0         
				//   49   97:getfield        #56  <Field Object val$enterTransition>
				//   50  100:aload_0         
				//   51  101:getfield        #52  <Field boolean val$inIsPop>
				//   52  104:invokestatic    #97  <Method View FragmentTransition.access$400(ArrayMap, FragmentTransition$FragmentContainerTransition, Object, boolean)>
				//   53  107:astore_1        
						if(obj3 != null)
				//*  54  108:aload_1         
				//*  55  109:ifnull          124
							impl.getBoundsOnScreen(((View) (obj3)), inEpicenter);
				//   56  112:aload_0         
				//   57  113:getfield        #36  <Field FragmentTransitionImpl val$impl>
				//   58  116:aload_1         
				//   59  117:aload_0         
				//   60  118:getfield        #58  <Field Rect val$inEpicenter>
				//   61  121:invokevirtual   #101 <Method void FragmentTransitionImpl.getBoundsOnScreen(View, Rect)>
					}
				//   62  124:return          
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
	//   95  194:aload_1         
	//   96  195:new             #12  <Class FragmentTransition$4>
	//   97  198:dup             
	//   98  199:aload_0         
	//   99  200:aload           11
	//  100  202:aload_3         
	//  101  203:aload           4
	//  102  205:aload           6
	//  103  207:aload_2         
	//  104  208:aload           12
	//  105  210:aload           13
	//  106  212:iload           9
	//  107  214:aload           5
	//  108  216:aload           7
	//  109  218:aload           8
	//  110  220:invokespecial   #398 <Method void FragmentTransition$4(FragmentTransitionImpl, ArrayMap, Object, FragmentTransition$FragmentContainerTransition, ArrayList, View, Fragment, Fragment, boolean, ArrayList, Object, Rect)>
	//  111  223:invokestatic    #403 <Method OneShotPreDrawListener OneShotPreDrawListener.add(View, Runnable)>
	//  112  226:pop             
			return ((Object) (arraymap));
	//  113  227:aload_3         
	//  114  228:areturn         
		} else
		{
			return ((Object) (null));
	//  115  229:aconst_null     
	//  116  230:areturn         
		}
	}

	private static Object configureSharedElementsReordered(FragmentTransitionImpl fragmenttransitionimpl, ViewGroup viewgroup, View view, ArrayMap arraymap, FragmentContainerTransition fragmentcontainertransition, ArrayList arraylist, ArrayList arraylist1, Object obj, 
			Object obj1)
	{
		Fragment fragment = fragmentcontainertransition.lastIn;
	//    0    0:aload           4
	//    1    2:getfield        #155 <Field Fragment FragmentTransition$FragmentContainerTransition.lastIn>
	//    2    5:astore          11
		Fragment fragment1 = fragmentcontainertransition.firstOut;
	//    3    7:aload           4
	//    4    9:getfield        #165 <Field Fragment FragmentTransition$FragmentContainerTransition.firstOut>
	//    5   12:astore          12
		if(fragment != null)
	//*   6   14:aload           11
	//*   7   16:ifnull          28
			fragment.getView().setVisibility(0);
	//    8   19:aload           11
	//    9   21:invokevirtual   #282 <Method View Fragment.getView()>
	//   10   24:iconst_0        
	//   11   25:invokevirtual   #409 <Method void View.setVisibility(int)>
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
	//   19   42:getfield        #158 <Field boolean FragmentTransition$FragmentContainerTransition.lastInIsPop>
	//   20   45:istore          9
			Object obj2;
			if(arraymap.isEmpty())
	//*  21   47:aload_3         
	//*  22   48:invokevirtual   #285 <Method boolean ArrayMap.isEmpty()>
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
	//   31   67:invokestatic    #375 <Method Object getSharedElementTransition(FragmentTransitionImpl, Fragment, Fragment, boolean)>
	//   32   70:astore          10
			ArrayMap arraymap2 = captureOutSharedElements(fragmenttransitionimpl, arraymap, obj2, fragmentcontainertransition);
	//   33   72:aload_0         
	//   34   73:aload_3         
	//   35   74:aload           10
	//   36   76:aload           4
	//   37   78:invokestatic    #377 <Method ArrayMap captureOutSharedElements(FragmentTransitionImpl, ArrayMap, Object, FragmentTransition$FragmentContainerTransition)>
	//   38   81:astore          14
			ArrayMap arraymap1 = captureInSharedElements(fragmenttransitionimpl, arraymap, obj2, fragmentcontainertransition);
	//   39   83:aload_0         
	//   40   84:aload_3         
	//   41   85:aload           10
	//   42   87:aload           4
	//   43   89:invokestatic    #65  <Method ArrayMap captureInSharedElements(FragmentTransitionImpl, ArrayMap, Object, FragmentTransition$FragmentContainerTransition)>
	//   44   92:astore          13
			if(arraymap.isEmpty())
	//*  45   94:aload_3         
	//*  46   95:invokevirtual   #285 <Method boolean ArrayMap.isEmpty()>
	//*  47   98:ifeq            126
			{
				if(arraymap2 != null)
	//*  48  101:aload           14
	//*  49  103:ifnull          111
					arraymap2.clear();
	//   50  106:aload           14
	//   51  108:invokevirtual   #320 <Method void ArrayMap.clear()>
				if(arraymap1 != null)
	//*  52  111:aload           13
	//*  53  113:ifnull          121
					arraymap1.clear();
	//   54  116:aload           13
	//   55  118:invokevirtual   #320 <Method void ArrayMap.clear()>
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
	//   62  131:invokevirtual   #326 <Method java.util.Set ArrayMap.keySet()>
	//   63  134:invokestatic    #411 <Method void addSharedElementsWithMatchingNames(ArrayList, ArrayMap, Collection)>
				addSharedElementsWithMatchingNames(arraylist1, arraymap1, arraymap.values());
	//   64  137:aload           6
	//   65  139:aload           13
	//   66  141:aload_3         
	//   67  142:invokevirtual   #300 <Method Collection ArrayMap.values()>
	//   68  145:invokestatic    #411 <Method void addSharedElementsWithMatchingNames(ArrayList, ArrayMap, Collection)>
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
	//   84  176:invokestatic    #60  <Method void callSharedElementStartEnd(Fragment, Fragment, boolean, ArrayMap, boolean)>
			if(arraymap != null)
	//*  85  179:aload_3         
	//*  86  180:ifnull          256
			{
				arraylist1.add(((Object) (view)));
	//   87  183:aload           6
	//   88  185:aload_2         
	//   89  186:invokevirtual   #101 <Method boolean ArrayList.add(Object)>
	//   90  189:pop             
				fragmenttransitionimpl.setSharedElementTargets(((Object) (arraymap)), view, arraylist);
	//   91  190:aload_0         
	//   92  191:aload_3         
	//   93  192:aload_2         
	//   94  193:aload           5
	//   95  195:invokevirtual   #387 <Method void FragmentTransitionImpl.setSharedElementTargets(Object, View, ArrayList)>
				setOutEpicenter(fragmenttransitionimpl, ((Object) (arraymap)), obj1, arraymap2, fragmentcontainertransition.firstOutIsPop, fragmentcontainertransition.firstOutTransaction);
	//   96  198:aload_0         
	//   97  199:aload_3         
	//   98  200:aload           8
	//   99  202:aload           14
	//  100  204:aload           4
	//  101  206:getfield        #193 <Field boolean FragmentTransition$FragmentContainerTransition.firstOutIsPop>
	//  102  209:aload           4
	//  103  211:getfield        #196 <Field BackStackRecord FragmentTransition$FragmentContainerTransition.firstOutTransaction>
	//  104  214:invokestatic    #391 <Method void setOutEpicenter(FragmentTransitionImpl, Object, Object, ArrayMap, boolean, BackStackRecord)>
				view = ((View) (new Rect()));
	//  105  217:new             #382 <Class Rect>
	//  106  220:dup             
	//  107  221:invokespecial   #383 <Method void Rect()>
	//  108  224:astore_2        
				fragmentcontainertransition = ((FragmentContainerTransition) (getInEpicenterView(arraymap1, fragmentcontainertransition, obj, flag)));
	//  109  225:aload           13
	//  110  227:aload           4
	//  111  229:aload           7
	//  112  231:iload           9
	//  113  233:invokestatic    #70  <Method View getInEpicenterView(ArrayMap, FragmentTransition$FragmentContainerTransition, Object, boolean)>
	//  114  236:astore          4
				if(fragmentcontainertransition != null)
	//* 115  238:aload           4
	//* 116  240:ifnull          250
					fragmenttransitionimpl.setEpicenter(obj, ((Rect) (view)));
	//  117  243:aload_0         
	//  118  244:aload           7
	//  119  246:aload_2         
	//  120  247:invokevirtual   #395 <Method void FragmentTransitionImpl.setEpicenter(Object, Rect)>
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
				//    9   17:invokestatic    #49  <Method void FragmentTransition.access$200(Fragment, Fragment, boolean, ArrayMap, boolean)>
					if(epicenterView != null)
				//*  10   20:aload_0         
				//*  11   21:getfield        #36  <Field View val$epicenterView>
				//*  12   24:ifnull          42
						impl.getBoundsOnScreen(epicenterView, epicenter);
				//   13   27:aload_0         
				//   14   28:getfield        #38  <Field FragmentTransitionImpl val$impl>
				//   15   31:aload_0         
				//   16   32:getfield        #36  <Field View val$epicenterView>
				//   17   35:aload_0         
				//   18   36:getfield        #40  <Field Rect val$epicenter>
				//   19   39:invokevirtual   #55  <Method void FragmentTransitionImpl.getBoundsOnScreen(View, Rect)>
				//   20   42:return          
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
	//  140  282:invokespecial   #414 <Method void FragmentTransition$3(Fragment, Fragment, boolean, ArrayMap, View, FragmentTransitionImpl, Rect)>
	//  141  285:invokestatic    #403 <Method OneShotPreDrawListener OneShotPreDrawListener.add(View, Runnable)>
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
	//*   1    1:getfield        #243 <Field FragmentContainer FragmentManagerImpl.mContainer>
	//*   2    4:invokevirtual   #248 <Method boolean FragmentContainer.onHasView()>
	//*   3    7:ifeq            25
			fragmentmanagerimpl = ((FragmentManagerImpl) ((ViewGroup)fragmentmanagerimpl.mContainer.onFindViewById(i)));
	//    4   10:aload_0         
	//    5   11:getfield        #243 <Field FragmentContainer FragmentManagerImpl.mContainer>
	//    6   14:iload_1         
	//    7   15:invokevirtual   #420 <Method View FragmentContainer.onFindViewById(int)>
	//    8   18:checkcast       #422 <Class ViewGroup>
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
	//   17   33:getfield        #155 <Field Fragment FragmentTransition$FragmentContainerTransition.lastIn>
	//   18   36:astore          8
		Object obj3 = ((Object) (fragmentcontainertransition.firstOut));
	//   19   38:aload_2         
	//   20   39:getfield        #165 <Field Fragment FragmentTransition$FragmentContainerTransition.firstOut>
	//   21   42:astore          13
		FragmentTransitionImpl fragmenttransitionimpl = chooseImpl(((Fragment) (obj3)), fragment);
	//   22   44:aload           13
	//   23   46:aload           8
	//   24   48:invokestatic    #424 <Method FragmentTransitionImpl chooseImpl(Fragment, Fragment)>
	//   25   51:astore          9
		if(fragmenttransitionimpl == null)
	//*  26   53:aload           9
	//*  27   55:ifnonnull       59
			return;
	//   28   58:return          
		boolean flag = fragmentcontainertransition.lastInIsPop;
	//   29   59:aload_2         
	//   30   60:getfield        #158 <Field boolean FragmentTransition$FragmentContainerTransition.lastInIsPop>
	//   31   63:istore          5
		boolean flag1 = fragmentcontainertransition.firstOutIsPop;
	//   32   65:aload_2         
	//   33   66:getfield        #193 <Field boolean FragmentTransition$FragmentContainerTransition.firstOutIsPop>
	//   34   69:istore          6
		Object obj1 = getEnterTransition(fragmenttransitionimpl, fragment, flag);
	//   35   71:aload           9
	//   36   73:aload           8
	//   37   75:iload           5
	//   38   77:invokestatic    #427 <Method Object getEnterTransition(FragmentTransitionImpl, Fragment, boolean)>
	//   39   80:astore          10
		Object obj = getExitTransition(fragmenttransitionimpl, ((Fragment) (obj3)), flag1);
	//   40   82:aload           9
	//   41   84:aload           13
	//   42   86:iload           6
	//   43   88:invokestatic    #429 <Method Object getExitTransition(FragmentTransitionImpl, Fragment, boolean)>
	//   44   91:astore          7
		ArrayList arraylist1 = new ArrayList();
	//   45   93:new             #98  <Class ArrayList>
	//   46   96:dup             
	//   47   97:invokespecial   #253 <Method void ArrayList()>
	//   48  100:astore          14
		ArrayList arraylist = new ArrayList();
	//   49  102:new             #98  <Class ArrayList>
	//   50  105:dup             
	//   51  106:invokespecial   #253 <Method void ArrayList()>
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
	//   62  126:invokestatic    #431 <Method Object configureSharedElementsOrdered(FragmentTransitionImpl, ViewGroup, View, ArrayMap, FragmentTransition$FragmentContainerTransition, ArrayList, ArrayList, Object, Object)>
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
	//   76  156:invokestatic    #55  <Method ArrayList configureEnteringExitingViews(FragmentTransitionImpl, Object, Fragment, ArrayList, View)>
	//   77  159:astore          13
		if(obj3 == null || ((ArrayList) (obj3)).isEmpty())
	//*  78  161:aload           13
	//*  79  163:ifnull          180
	//*  80  166:aload           13
	//*  81  168:invokevirtual   #348 <Method boolean ArrayList.isEmpty()>
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
	//   90  188:invokevirtual   #435 <Method void FragmentTransitionImpl.addTarget(Object, View)>
		fragmentcontainertransition = ((FragmentContainerTransition) (mergeTransitions(fragmenttransitionimpl, obj1, obj, obj2, fragment, fragmentcontainertransition.lastInIsPop)));
	//   91  191:aload           9
	//   92  193:aload           10
	//   93  195:aload           7
	//   94  197:aload           12
	//   95  199:aload           8
	//   96  201:aload_2         
	//   97  202:getfield        #158 <Field boolean FragmentTransition$FragmentContainerTransition.lastInIsPop>
	//   98  205:invokestatic    #439 <Method Object mergeTransitions(FragmentTransitionImpl, Object, Object, Object, Fragment, boolean)>
	//   99  208:astore_2        
		if(fragmentcontainertransition != null)
	//* 100  209:aload_2         
	//* 101  210:ifnull          286
		{
			ArrayList arraylist2 = new ArrayList();
	//  102  213:new             #98  <Class ArrayList>
	//  103  216:dup             
	//  104  217:invokespecial   #253 <Method void ArrayList()>
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
	//  114  237:invokevirtual   #443 <Method void FragmentTransitionImpl.scheduleRemoveTargets(Object, Object, ArrayList, Object, ArrayList, Object, ArrayList)>
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
	//  124  256:invokestatic    #447 <Method void scheduleTargetChange(FragmentTransitionImpl, ViewGroup, Fragment, View, ArrayList, Object, ArrayList, Object, ArrayList)>
			fragmenttransitionimpl.setNameOverridesOrdered(((View) (fragmentmanagerimpl)), arraylist, ((java.util.Map) (arraymap)));
	//  125  259:aload           9
	//  126  261:aload_0         
	//  127  262:aload           11
	//  128  264:aload           4
	//  129  266:invokevirtual   #451 <Method void FragmentTransitionImpl.setNameOverridesOrdered(View, ArrayList, java.util.Map)>
			fragmenttransitionimpl.beginDelayedTransition(((ViewGroup) (fragmentmanagerimpl)), ((Object) (fragmentcontainertransition)));
	//  130  269:aload           9
	//  131  271:aload_0         
	//  132  272:aload_2         
	//  133  273:invokevirtual   #455 <Method void FragmentTransitionImpl.beginDelayedTransition(ViewGroup, Object)>
			fragmenttransitionimpl.scheduleNameReset(((ViewGroup) (fragmentmanagerimpl)), arraylist, ((java.util.Map) (arraymap)));
	//  134  276:aload           9
	//  135  278:aload_0         
	//  136  279:aload           11
	//  137  281:aload           4
	//  138  283:invokevirtual   #459 <Method void FragmentTransitionImpl.scheduleNameReset(ViewGroup, ArrayList, java.util.Map)>
		}
	//  139  286:return          
	}

	private static void configureTransitionsReordered(FragmentManagerImpl fragmentmanagerimpl, int i, FragmentContainerTransition fragmentcontainertransition, View view, ArrayMap arraymap)
	{
		if(fragmentmanagerimpl.mContainer.onHasView())
	//*   0    0:aload_0         
	//*   1    1:getfield        #243 <Field FragmentContainer FragmentManagerImpl.mContainer>
	//*   2    4:invokevirtual   #248 <Method boolean FragmentContainer.onHasView()>
	//*   3    7:ifeq            25
			fragmentmanagerimpl = ((FragmentManagerImpl) ((ViewGroup)fragmentmanagerimpl.mContainer.onFindViewById(i)));
	//    4   10:aload_0         
	//    5   11:getfield        #243 <Field FragmentContainer FragmentManagerImpl.mContainer>
	//    6   14:iload_1         
	//    7   15:invokevirtual   #420 <Method View FragmentContainer.onFindViewById(int)>
	//    8   18:checkcast       #422 <Class ViewGroup>
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
	//   17   33:getfield        #155 <Field Fragment FragmentTransition$FragmentContainerTransition.lastIn>
	//   18   36:astore          14
		Object obj2 = ((Object) (fragmentcontainertransition.firstOut));
	//   19   38:aload_2         
	//   20   39:getfield        #165 <Field Fragment FragmentTransition$FragmentContainerTransition.firstOut>
	//   21   42:astore          12
		FragmentTransitionImpl fragmenttransitionimpl = chooseImpl(((Fragment) (obj2)), ((Fragment) (obj4)));
	//   22   44:aload           12
	//   23   46:aload           14
	//   24   48:invokestatic    #424 <Method FragmentTransitionImpl chooseImpl(Fragment, Fragment)>
	//   25   51:astore          8
		if(fragmenttransitionimpl == null)
	//*  26   53:aload           8
	//*  27   55:ifnonnull       59
			return;
	//   28   58:return          
		boolean flag = fragmentcontainertransition.lastInIsPop;
	//   29   59:aload_2         
	//   30   60:getfield        #158 <Field boolean FragmentTransition$FragmentContainerTransition.lastInIsPop>
	//   31   63:istore          5
		boolean flag1 = fragmentcontainertransition.firstOutIsPop;
	//   32   65:aload_2         
	//   33   66:getfield        #193 <Field boolean FragmentTransition$FragmentContainerTransition.firstOutIsPop>
	//   34   69:istore          6
		ArrayList arraylist = new ArrayList();
	//   35   71:new             #98  <Class ArrayList>
	//   36   74:dup             
	//   37   75:invokespecial   #253 <Method void ArrayList()>
	//   38   78:astore          9
		ArrayList arraylist1 = new ArrayList();
	//   39   80:new             #98  <Class ArrayList>
	//   40   83:dup             
	//   41   84:invokespecial   #253 <Method void ArrayList()>
	//   42   87:astore          10
		Object obj1 = getEnterTransition(fragmenttransitionimpl, ((Fragment) (obj4)), flag);
	//   43   89:aload           8
	//   44   91:aload           14
	//   45   93:iload           5
	//   46   95:invokestatic    #427 <Method Object getEnterTransition(FragmentTransitionImpl, Fragment, boolean)>
	//   47   98:astore          11
		Object obj = getExitTransition(fragmenttransitionimpl, ((Fragment) (obj2)), flag1);
	//   48  100:aload           8
	//   49  102:aload           12
	//   50  104:iload           6
	//   51  106:invokestatic    #429 <Method Object getExitTransition(FragmentTransitionImpl, Fragment, boolean)>
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
	//   62  126:invokestatic    #463 <Method Object configureSharedElementsReordered(FragmentTransitionImpl, ViewGroup, View, ArrayMap, FragmentTransition$FragmentContainerTransition, ArrayList, ArrayList, Object, Object)>
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
	//   78  158:invokestatic    #55  <Method ArrayList configureEnteringExitingViews(FragmentTransitionImpl, Object, Fragment, ArrayList, View)>
	//   79  161:astore          7
		view = ((View) (configureEnteringExitingViews(fragmenttransitionimpl, obj1, ((Fragment) (obj4)), arraylist, view)));
	//   80  163:aload           8
	//   81  165:aload           11
	//   82  167:aload           14
	//   83  169:aload           9
	//   84  171:aload_3         
	//   85  172:invokestatic    #55  <Method ArrayList configureEnteringExitingViews(FragmentTransitionImpl, Object, Fragment, ArrayList, View)>
	//   86  175:astore_3        
		setViewVisibility(((ArrayList) (view)), 4);
	//   87  176:aload_3         
	//   88  177:iconst_4        
	//   89  178:invokestatic    #50  <Method void setViewVisibility(ArrayList, int)>
		obj4 = mergeTransitions(fragmenttransitionimpl, obj1, ((Object) (fragmentcontainertransition)), obj3, ((Fragment) (obj4)), flag);
	//   90  181:aload           8
	//   91  183:aload           11
	//   92  185:aload_2         
	//   93  186:aload           13
	//   94  188:aload           14
	//   95  190:iload           5
	//   96  192:invokestatic    #439 <Method Object mergeTransitions(FragmentTransitionImpl, Object, Object, Object, Fragment, boolean)>
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
	//  104  209:invokestatic    #467 <Method void replaceHide(FragmentTransitionImpl, Object, Fragment, ArrayList)>
			obj2 = ((Object) (fragmenttransitionimpl.prepareSetNameOverridesReordered(arraylist)));
	//  105  212:aload           8
	//  106  214:aload           9
	//  107  216:invokevirtual   #471 <Method ArrayList FragmentTransitionImpl.prepareSetNameOverridesReordered(ArrayList)>
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
	//  117  235:invokevirtual   #443 <Method void FragmentTransitionImpl.scheduleRemoveTargets(Object, Object, ArrayList, Object, ArrayList, Object, ArrayList)>
			fragmenttransitionimpl.beginDelayedTransition(((ViewGroup) (fragmentmanagerimpl)), obj4);
	//  118  238:aload           8
	//  119  240:aload_0         
	//  120  241:aload           14
	//  121  243:invokevirtual   #455 <Method void FragmentTransitionImpl.beginDelayedTransition(ViewGroup, Object)>
			fragmenttransitionimpl.setNameOverridesReordered(((View) (fragmentmanagerimpl)), arraylist1, arraylist, ((ArrayList) (obj2)), ((java.util.Map) (arraymap)));
	//  122  246:aload           8
	//  123  248:aload_0         
	//  124  249:aload           10
	//  125  251:aload           9
	//  126  253:aload           12
	//  127  255:aload           4
	//  128  257:invokevirtual   #475 <Method void FragmentTransitionImpl.setNameOverridesReordered(View, ArrayList, ArrayList, ArrayList, java.util.Map)>
			setViewVisibility(((ArrayList) (view)), 0);
	//  129  260:aload_3         
	//  130  261:iconst_0        
	//  131  262:invokestatic    #50  <Method void setViewVisibility(ArrayList, int)>
			fragmenttransitionimpl.swapSharedElementTargets(obj3, arraylist1, arraylist);
	//  132  265:aload           8
	//  133  267:aload           13
	//  134  269:aload           10
	//  135  271:aload           9
	//  136  273:invokevirtual   #479 <Method void FragmentTransitionImpl.swapSharedElementTargets(Object, ArrayList, ArrayList)>
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
	//    6   10:invokespecial   #480 <Method void FragmentTransition$FragmentContainerTransition()>
	//    7   13:astore_3        
			sparsearray.put(i, ((Object) (fragmentcontainertransition1)));
	//    8   14:aload_1         
	//    9   15:iload_2         
	//   10   16:aload_3         
	//   11   17:invokevirtual   #483 <Method void SparseArray.put(int, Object)>
		}
		return fragmentcontainertransition1;
	//   12   20:aload_3         
	//   13   21:areturn         
	}

	private static String findKeyForValue(ArrayMap arraymap, String s)
	{
		int j = arraymap.size();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #78  <Method int ArrayMap.size()>
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
	//*  11   15:invokevirtual   #82  <Method Object ArrayMap.valueAt(int)>
	//*  12   18:invokevirtual   #313 <Method boolean String.equals(Object)>
	//*  13   21:ifeq            33
				return (String)arraymap.keyAt(i);
	//   14   24:aload_0         
	//   15   25:iload_2         
	//   16   26:invokevirtual   #256 <Method Object ArrayMap.keyAt(int)>
	//   17   29:checkcast       #229 <Class String>
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
	//    7   11:invokevirtual   #344 <Method Object Fragment.getReenterTransition()>
	//    8   14:astore_1        
		else
	//*   9   15:goto            23
			fragment = ((Fragment) (fragment.getEnterTransition()));
	//   10   18:aload_1         
	//   11   19:invokevirtual   #341 <Method Object Fragment.getEnterTransition()>
	//   12   22:astore_1        
		return fragmenttransitionimpl.cloneTransition(((Object) (fragment)));
	//   13   23:aload_0         
	//   14   24:aload_1         
	//   15   25:invokevirtual   #488 <Method Object FragmentTransitionImpl.cloneTransition(Object)>
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
	//    7   11:invokevirtual   #335 <Method Object Fragment.getReturnTransition()>
	//    8   14:astore_1        
		else
	//*   9   15:goto            23
			fragment = ((Fragment) (fragment.getExitTransition()));
	//   10   18:aload_1         
	//   11   19:invokevirtual   #332 <Method Object Fragment.getExitTransition()>
	//   12   22:astore_1        
		return fragmenttransitionimpl.cloneTransition(((Object) (fragment)));
	//   13   23:aload_0         
	//   14   24:aload_1         
	//   15   25:invokevirtual   #488 <Method Object FragmentTransitionImpl.cloneTransition(Object)>
	//   16   28:areturn         
	}

	private static View getInEpicenterView(ArrayMap arraymap, FragmentContainerTransition fragmentcontainertransition, Object obj, boolean flag)
	{
		fragmentcontainertransition = ((FragmentContainerTransition) (fragmentcontainertransition.lastInTransaction));
	//    0    0:aload_1         
	//    1    1:getfield        #162 <Field BackStackRecord FragmentTransition$FragmentContainerTransition.lastInTransaction>
	//    2    4:astore_1        
		if(obj != null && arraymap != null && ((BackStackRecord) (fragmentcontainertransition)).mSharedElementSourceNames != null && !((BackStackRecord) (fragmentcontainertransition)).mSharedElementSourceNames.isEmpty())
	//*   3    5:aload_2         
	//*   4    6:ifnull          70
	//*   5    9:aload_0         
	//*   6   10:ifnull          70
	//*   7   13:aload_1         
	//*   8   14:getfield        #224 <Field ArrayList BackStackRecord.mSharedElementSourceNames>
	//*   9   17:ifnull          70
	//*  10   20:aload_1         
	//*  11   21:getfield        #224 <Field ArrayList BackStackRecord.mSharedElementSourceNames>
	//*  12   24:invokevirtual   #348 <Method boolean ArrayList.isEmpty()>
	//*  13   27:ifne            70
		{
			if(flag)
	//*  14   30:iload_3         
	//*  15   31:ifeq            49
				fragmentcontainertransition = ((FragmentContainerTransition) ((String)((BackStackRecord) (fragmentcontainertransition)).mSharedElementSourceNames.get(0)));
	//   16   34:aload_1         
	//   17   35:getfield        #224 <Field ArrayList BackStackRecord.mSharedElementSourceNames>
	//   18   38:iconst_0        
	//   19   39:invokevirtual   #205 <Method Object ArrayList.get(int)>
	//   20   42:checkcast       #229 <Class String>
	//   21   45:astore_1        
			else
	//*  22   46:goto            61
				fragmentcontainertransition = ((FragmentContainerTransition) ((String)((BackStackRecord) (fragmentcontainertransition)).mSharedElementTargetNames.get(0)));
	//   23   49:aload_1         
	//   24   50:getfield        #227 <Field ArrayList BackStackRecord.mSharedElementTargetNames>
	//   25   53:iconst_0        
	//   26   54:invokevirtual   #205 <Method Object ArrayList.get(int)>
	//   27   57:checkcast       #229 <Class String>
	//   28   60:astore_1        
			return (View)arraymap.get(((Object) (fragmentcontainertransition)));
	//   29   61:aload_0         
	//   30   62:aload_1         
	//   31   63:invokevirtual   #306 <Method Object ArrayMap.get(Object)>
	//   32   66:checkcast       #84  <Class View>
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
	//    8   16:invokevirtual   #338 <Method Object Fragment.getSharedElementReturnTransition()>
	//    9   19:astore_1        
			else
	//*  10   20:goto            28
				fragment = ((Fragment) (fragment.getSharedElementEnterTransition()));
	//   11   23:aload_1         
	//   12   24:invokevirtual   #347 <Method Object Fragment.getSharedElementEnterTransition()>
	//   13   27:astore_1        
			return fragmenttransitionimpl.wrapTransitionInSet(fragmenttransitionimpl.cloneTransition(((Object) (fragment))));
	//   14   28:aload_0         
	//   15   29:aload_0         
	//   16   30:aload_1         
	//   17   31:invokevirtual   #488 <Method Object FragmentTransitionImpl.cloneTransition(Object)>
	//   18   34:invokevirtual   #492 <Method Object FragmentTransitionImpl.wrapTransitionInSet(Object)>
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
	//    9   20:invokevirtual   #495 <Method boolean Fragment.getAllowReturnTransitionOverlap()>
	//   10   23:istore          5
			else
	//*  11   25:goto            41
				flag = fragment.getAllowEnterTransitionOverlap();
	//   12   28:aload           4
	//   13   30:invokevirtual   #498 <Method boolean Fragment.getAllowEnterTransitionOverlap()>
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
	//   24   50:invokevirtual   #502 <Method Object FragmentTransitionImpl.mergeTransitionsTogether(Object, Object, Object)>
	//   25   53:areturn         
		else
			return fragmenttransitionimpl.mergeTransitionsInSequence(obj1, obj, obj2);
	//   26   54:aload_0         
	//   27   55:aload_2         
	//   28   56:aload_1         
	//   29   57:aload_3         
	//   30   58:invokevirtual   #505 <Method Object FragmentTransitionImpl.mergeTransitionsInSequence(Object, Object, Object)>
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
	//*   5    9:getfield        #129 <Field boolean Fragment.mAdded>
	//*   6   12:ifeq            60
	//*   7   15:aload_2         
	//*   8   16:getfield        #126 <Field boolean Fragment.mHidden>
	//*   9   19:ifeq            60
	//*  10   22:aload_2         
	//*  11   23:getfield        #123 <Field boolean Fragment.mHiddenChanged>
	//*  12   26:ifeq            60
		{
			fragment.setHideReplaced(true);
	//   13   29:aload_2         
	//   14   30:iconst_1        
	//   15   31:invokevirtual   #509 <Method void Fragment.setHideReplaced(boolean)>
			fragmenttransitionimpl.scheduleHideFragmentView(obj, fragment.getView(), arraylist);
	//   16   34:aload_0         
	//   17   35:aload_1         
	//   18   36:aload_2         
	//   19   37:invokevirtual   #282 <Method View Fragment.getView()>
	//   20   40:aload_3         
	//   21   41:invokevirtual   #512 <Method void FragmentTransitionImpl.scheduleHideFragmentView(Object, View, ArrayList)>
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
	//   22   44:aload_2         
	//   23   45:getfield        #515 <Field ViewGroup Fragment.mContainer>
	//   24   48:new             #6   <Class FragmentTransition$1>
	//   25   51:dup             
	//   26   52:aload_3         
	//   27   53:invokespecial   #518 <Method void FragmentTransition$1(ArrayList)>
	//   28   56:invokestatic    #403 <Method OneShotPreDrawListener OneShotPreDrawListener.add(View, Runnable)>
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
	//    0    0:ldc2            #523 <String "android.support.transition.FragmentTransitionSupport">
	//    1    3:invokestatic    #529 <Method Class Class.forName(String)>
	//    2    6:iconst_0        
	//    3    7:anewarray       Class[]
	//    4   10:invokevirtual   #533 <Method Constructor Class.getDeclaredConstructor(Class[])>
	//    5   13:iconst_0        
	//    6   14:anewarray       Object[]
	//    7   17:invokevirtual   #539 <Method Object Constructor.newInstance(Object[])>
	//    8   20:checkcast       #274 <Class FragmentTransitionImpl>
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
	//*   1    1:invokevirtual   #78  <Method int ArrayMap.size()>
	//*   2    4:iconst_1        
	//*   3    5:isub            
	//*   4    6:istore_2        
	//*   5    7:iload_2         
	//*   6    8:iflt            39
			if(!arraymap1.containsKey(((Object) ((String)arraymap.valueAt(i)))))
	//*   7   11:aload_1         
	//*   8   12:aload_0         
	//*   9   13:iload_2         
	//*  10   14:invokevirtual   #82  <Method Object ArrayMap.valueAt(int)>
	//*  11   17:checkcast       #229 <Class String>
	//*  12   20:invokevirtual   #542 <Method boolean ArrayMap.containsKey(Object)>
	//*  13   23:ifne            32
				arraymap.removeAt(i);
	//   14   26:aload_0         
	//   15   27:iload_2         
	//   16   28:invokevirtual   #545 <Method Object ArrayMap.removeAt(int)>
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
				if(enterTransition != null)
			//*   0    0:aload_0         
			//*   1    1:getfield        #28  <Field Object val$enterTransition>
			//*   2    4:ifnull          55
				{
					impl.removeTarget(enterTransition, nonExistentView);
			//    3    7:aload_0         
			//    4    8:getfield        #30  <Field FragmentTransitionImpl val$impl>
			//    5   11:aload_0         
			//    6   12:getfield        #28  <Field Object val$enterTransition>
			//    7   15:aload_0         
			//    8   16:getfield        #32  <Field View val$nonExistentView>
			//    9   19:invokevirtual   #53  <Method void FragmentTransitionImpl.removeTarget(Object, View)>
					ArrayList arraylist3 = FragmentTransition.configureEnteringExitingViews(impl, enterTransition, inFragment, sharedElementsIn, nonExistentView);
			//   10   22:aload_0         
			//   11   23:getfield        #30  <Field FragmentTransitionImpl val$impl>
			//   12   26:aload_0         
			//   13   27:getfield        #28  <Field Object val$enterTransition>
			//   14   30:aload_0         
			//   15   31:getfield        #34  <Field Fragment val$inFragment>
			//   16   34:aload_0         
			//   17   35:getfield        #36  <Field ArrayList val$sharedElementsIn>
			//   18   38:aload_0         
			//   19   39:getfield        #32  <Field View val$nonExistentView>
			//   20   42:invokestatic    #57  <Method ArrayList FragmentTransition.access$100(FragmentTransitionImpl, Object, Fragment, ArrayList, View)>
			//   21   45:astore_1        
					enteringViews.addAll(((Collection) (arraylist3)));
			//   22   46:aload_0         
			//   23   47:getfield        #38  <Field ArrayList val$enteringViews>
			//   24   50:aload_1         
			//   25   51:invokevirtual   #63  <Method boolean ArrayList.addAll(Collection)>
			//   26   54:pop             
				}
				if(exitingViews != null)
			//*  27   55:aload_0         
			//*  28   56:getfield        #40  <Field ArrayList val$exitingViews>
			//*  29   59:ifnull          121
				{
					if(exitTransition != null)
			//*  30   62:aload_0         
			//*  31   63:getfield        #42  <Field Object val$exitTransition>
			//*  32   66:ifnull          102
					{
						ArrayList arraylist4 = new ArrayList();
			//   33   69:new             #59  <Class ArrayList>
			//   34   72:dup             
			//   35   73:invokespecial   #64  <Method void ArrayList()>
			//   36   76:astore_1        
						arraylist4.add(((Object) (nonExistentView)));
			//   37   77:aload_1         
			//   38   78:aload_0         
			//   39   79:getfield        #32  <Field View val$nonExistentView>
			//   40   82:invokevirtual   #68  <Method boolean ArrayList.add(Object)>
			//   41   85:pop             
						impl.replaceTargets(exitTransition, exitingViews, arraylist4);
			//   42   86:aload_0         
			//   43   87:getfield        #30  <Field FragmentTransitionImpl val$impl>
			//   44   90:aload_0         
			//   45   91:getfield        #42  <Field Object val$exitTransition>
			//   46   94:aload_0         
			//   47   95:getfield        #40  <Field ArrayList val$exitingViews>
			//   48   98:aload_1         
			//   49   99:invokevirtual   #72  <Method void FragmentTransitionImpl.replaceTargets(Object, ArrayList, ArrayList)>
					}
					exitingViews.clear();
			//   50  102:aload_0         
			//   51  103:getfield        #40  <Field ArrayList val$exitingViews>
			//   52  106:invokevirtual   #75  <Method void ArrayList.clear()>
					exitingViews.add(((Object) (nonExistentView)));
			//   53  109:aload_0         
			//   54  110:getfield        #40  <Field ArrayList val$exitingViews>
			//   55  113:aload_0         
			//   56  114:getfield        #32  <Field View val$nonExistentView>
			//   57  117:invokevirtual   #68  <Method boolean ArrayList.add(Object)>
			//   58  120:pop             
				}
			//   59  121:return          
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
	//   11   18:invokespecial   #549 <Method void FragmentTransition$2(Object, FragmentTransitionImpl, View, Fragment, ArrayList, ArrayList, ArrayList, Object)>
	//   12   21:invokestatic    #403 <Method OneShotPreDrawListener OneShotPreDrawListener.add(View, Runnable)>
	//   13   24:pop             
	//   14   25:return          
	}

	private static void setOutEpicenter(FragmentTransitionImpl fragmenttransitionimpl, Object obj, Object obj1, ArrayMap arraymap, boolean flag, BackStackRecord backstackrecord)
	{
		if(backstackrecord.mSharedElementSourceNames != null && !backstackrecord.mSharedElementSourceNames.isEmpty())
	//*   0    0:aload           5
	//*   1    2:getfield        #224 <Field ArrayList BackStackRecord.mSharedElementSourceNames>
	//*   2    5:ifnull          81
	//*   3    8:aload           5
	//*   4   10:getfield        #224 <Field ArrayList BackStackRecord.mSharedElementSourceNames>
	//*   5   13:invokevirtual   #348 <Method boolean ArrayList.isEmpty()>
	//*   6   16:ifne            81
		{
			if(flag)
	//*   7   19:iload           4
	//*   8   21:ifeq            41
				backstackrecord = ((BackStackRecord) ((String)backstackrecord.mSharedElementTargetNames.get(0)));
	//    9   24:aload           5
	//   10   26:getfield        #227 <Field ArrayList BackStackRecord.mSharedElementTargetNames>
	//   11   29:iconst_0        
	//   12   30:invokevirtual   #205 <Method Object ArrayList.get(int)>
	//   13   33:checkcast       #229 <Class String>
	//   14   36:astore          5
			else
	//*  15   38:goto            55
				backstackrecord = ((BackStackRecord) ((String)backstackrecord.mSharedElementSourceNames.get(0)));
	//   16   41:aload           5
	//   17   43:getfield        #224 <Field ArrayList BackStackRecord.mSharedElementSourceNames>
	//   18   46:iconst_0        
	//   19   47:invokevirtual   #205 <Method Object ArrayList.get(int)>
	//   20   50:checkcast       #229 <Class String>
	//   21   53:astore          5
			arraymap = ((ArrayMap) ((View)arraymap.get(((Object) (backstackrecord)))));
	//   22   55:aload_3         
	//   23   56:aload           5
	//   24   58:invokevirtual   #306 <Method Object ArrayMap.get(Object)>
	//   25   61:checkcast       #84  <Class View>
	//   26   64:astore_3        
			fragmenttransitionimpl.setEpicenter(obj, ((View) (arraymap)));
	//   27   65:aload_0         
	//   28   66:aload_1         
	//   29   67:aload_3         
	//   30   68:invokevirtual   #552 <Method void FragmentTransitionImpl.setEpicenter(Object, View)>
			if(obj1 != null)
	//*  31   71:aload_2         
	//*  32   72:ifnull          81
				fragmenttransitionimpl.setEpicenter(obj1, ((View) (arraymap)));
	//   33   75:aload_0         
	//   34   76:aload_2         
	//   35   77:aload_3         
	//   36   78:invokevirtual   #552 <Method void FragmentTransitionImpl.setEpicenter(Object, View)>
		}
	//   37   81:return          
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
	//*   4    6:invokevirtual   #204 <Method int ArrayList.size()>
	//*   5    9:iconst_1        
	//*   6   10:isub            
	//*   7   11:istore_2        
	//*   8   12:iload_2         
	//*   9   13:iflt            35
			((View)arraylist.get(j)).setVisibility(i);
	//   10   16:aload_0         
	//   11   17:iload_2         
	//   12   18:invokevirtual   #205 <Method Object ArrayList.get(int)>
	//   13   21:checkcast       #84  <Class View>
	//   14   24:iload_1         
	//   15   25:invokevirtual   #409 <Method void View.setVisibility(int)>

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
	//*   1    1:getfield        #179 <Field int FragmentManagerImpl.mCurState>
	//*   2    4:iconst_1        
	//*   3    5:icmpge          9
			return;
	//    4    8:return          
		SparseArray sparsearray = new SparseArray();
	//    5    9:new             #145 <Class SparseArray>
	//    6   12:dup             
	//    7   13:invokespecial   #557 <Method void SparseArray()>
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
	//   16   31:invokevirtual   #205 <Method Object ArrayList.get(int)>
	//   17   34:checkcast       #167 <Class BackStackRecord>
	//   18   37:astore          10
			if(((Boolean)arraylist1.get(k)).booleanValue())
	//*  19   39:aload_2         
	//*  20   40:iload           6
	//*  21   42:invokevirtual   #205 <Method Object ArrayList.get(int)>
	//*  22   45:checkcast       #217 <Class Boolean>
	//*  23   48:invokevirtual   #221 <Method boolean Boolean.booleanValue()>
	//*  24   51:ifeq            66
				calculatePopFragments(backstackrecord, sparsearray, flag);
	//   25   54:aload           10
	//   26   56:aload           9
	//   27   58:iload           5
	//   28   60:invokestatic    #559 <Method void calculatePopFragments(BackStackRecord, SparseArray, boolean)>
			else
	//*  29   63:goto            75
				calculateFragments(backstackrecord, sparsearray, flag);
	//   30   66:aload           10
	//   31   68:aload           9
	//   32   70:iload           5
	//   33   72:invokestatic    #561 <Method void calculateFragments(BackStackRecord, SparseArray, boolean)>
		}

	//   34   75:iload           6
	//   35   77:iconst_1        
	//   36   78:iadd            
	//   37   79:istore          6
	//*  38   81:goto            21
		if(sparsearray.size() != 0)
	//*  39   84:aload           9
	//*  40   86:invokevirtual   #562 <Method int SparseArray.size()>
	//*  41   89:ifeq            199
		{
			View view = new View(fragmentmanagerimpl.mHost.getContext());
	//   42   92:new             #84  <Class View>
	//   43   95:dup             
	//   44   96:aload_0         
	//   45   97:getfield        #566 <Field FragmentHostCallback FragmentManagerImpl.mHost>
	//   46  100:invokevirtual   #572 <Method android.content.Context FragmentHostCallback.getContext()>
	//   47  103:invokespecial   #575 <Method void View(android.content.Context)>
	//   48  106:astore          10
			int i1 = sparsearray.size();
	//   49  108:aload           9
	//   50  110:invokevirtual   #562 <Method int SparseArray.size()>
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
	//   59  129:invokevirtual   #578 <Method int SparseArray.keyAt(int)>
	//   60  132:istore          8
				ArrayMap arraymap = calculateNameOverrides(j1, arraylist, arraylist1, i, j);
	//   61  134:iload           8
	//   62  136:aload_1         
	//   63  137:aload_2         
	//   64  138:iload_3         
	//   65  139:iload           4
	//   66  141:invokestatic    #580 <Method ArrayMap calculateNameOverrides(int, ArrayList, ArrayList, int, int)>
	//   67  144:astore          11
				FragmentContainerTransition fragmentcontainertransition = (FragmentContainerTransition)sparsearray.valueAt(l);
	//   68  146:aload           9
	//   69  148:iload           6
	//   70  150:invokevirtual   #581 <Method Object SparseArray.valueAt(int)>
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
	//   80  172:invokestatic    #583 <Method void configureTransitionsReordered(FragmentManagerImpl, int, FragmentTransition$FragmentContainerTransition, View, ArrayMap)>
				else
	//*  81  175:goto            190
					configureTransitionsOrdered(fragmentmanagerimpl, j1, fragmentcontainertransition, view, arraymap);
	//   82  178:aload_0         
	//   83  179:iload           8
	//   84  181:aload           12
	//   85  183:aload           10
	//   86  185:aload           11
	//   87  187:invokestatic    #585 <Method void configureTransitionsOrdered(FragmentManagerImpl, int, FragmentTransition$FragmentContainerTransition, View, ArrayMap)>
			}

	//   88  190:iload           6
	//   89  192:iconst_1        
	//   90  193:iadd            
	//   91  194:istore          6
		}
	//*  92  196:goto            118
	//   93  199:return          
	}

	static boolean supportsTransition()
	{
		return PLATFORM_IMPL != null || SUPPORT_IMPL != null;
	//    0    0:getstatic       #37  <Field FragmentTransitionImpl PLATFORM_IMPL>
	//    1    3:ifnonnull       17
	//    2    6:getstatic       #43  <Field FragmentTransitionImpl SUPPORT_IMPL>
	//    3    9:ifnull          15
	//    4   12:goto            17
	//    5   15:iconst_0        
	//    6   16:ireturn         
	//    7   17:iconst_1        
	//    8   18:ireturn         
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


/*
	static void access$000(ArrayList arraylist, int i)
	{
		setViewVisibility(arraylist, i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokestatic    #50  <Method void setViewVisibility(ArrayList, int)>
		return;
	//    3    5:return          
	}

*/


/*
	static ArrayList access$100(FragmentTransitionImpl fragmenttransitionimpl, Object obj, Fragment fragment, ArrayList arraylist, View view)
	{
		return configureEnteringExitingViews(fragmenttransitionimpl, obj, fragment, arraylist, view);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:aload           4
	//    5    6:invokestatic    #55  <Method ArrayList configureEnteringExitingViews(FragmentTransitionImpl, Object, Fragment, ArrayList, View)>
	//    6    9:areturn         
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
	//    5    6:invokestatic    #60  <Method void callSharedElementStartEnd(Fragment, Fragment, boolean, ArrayMap, boolean)>
		return;
	//    6    9:return          
	}

*/


/*
	static ArrayMap access$300(FragmentTransitionImpl fragmenttransitionimpl, ArrayMap arraymap, Object obj, FragmentContainerTransition fragmentcontainertransition)
	{
		return captureInSharedElements(fragmenttransitionimpl, arraymap, obj, fragmentcontainertransition);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:invokestatic    #65  <Method ArrayMap captureInSharedElements(FragmentTransitionImpl, ArrayMap, Object, FragmentTransition$FragmentContainerTransition)>
	//    5    7:areturn         
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
	//    4    4:invokestatic    #70  <Method View getInEpicenterView(ArrayMap, FragmentTransition$FragmentContainerTransition, Object, boolean)>
	//    5    7:areturn         
	}

*/
}

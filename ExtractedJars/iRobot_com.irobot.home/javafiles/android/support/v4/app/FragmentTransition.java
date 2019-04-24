// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.app;

import android.graphics.Rect;
import android.support.v4.f.a;
import android.support.v4.view.s;
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

	private static void addSharedElementsWithMatchingNames(ArrayList arraylist, a a1, Collection collection)
	{
		for(int i = a1.size() - 1; i >= 0; i--)
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #58  <Method int a.size()>
	//*   2    4:iconst_1        
	//*   3    5:isub            
	//*   4    6:istore_3        
	//*   5    7:iload_3         
	//*   6    8:iflt            49
		{
			View view = (View)a1.c(i);
	//    7   11:aload_1         
	//    8   12:iload_3         
	//    9   13:invokevirtual   #62  <Method Object a.c(int)>
	//   10   16:checkcast       #64  <Class View>
	//   11   19:astore          4
			if(collection.contains(((Object) (s.n(view)))))
	//*  12   21:aload_2         
	//*  13   22:aload           4
	//*  14   24:invokestatic    #70  <Method String s.n(View)>
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
		int i;
		int j;
		boolean flag4;
		boolean flag5;
		Fragment fragment;
		fragment = op.fragment;
	//    0    0:aload_1         
	//    1    1:getfield        #91  <Field Fragment BackStackRecord$Op.fragment>
	//    2    4:astore          12
		if(fragment == null)
	//*   3    6:aload           12
	//*   4    8:ifnonnull       12
			return;
	//    5   11:return          
		j = fragment.mContainerId;
	//    6   12:aload           12
	//    7   14:getfield        #97  <Field int Fragment.mContainerId>
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
	//   14   29:getstatic       #21  <Field int[] INVERSE_OPS>
	//   15   32:aload_1         
	//   16   33:getfield        #100 <Field int BackStackRecord$Op.cmd>
	//   17   36:iaload          
	//   18   37:istore          5
		else
	//*  19   39:goto            48
			i = op.cmd;
	//   20   42:aload_1         
	//   21   43:getfield        #100 <Field int BackStackRecord$Op.cmd>
	//   22   46:istore          5
		flag5 = false;
	//   23   48:iconst_0        
	//   24   49:istore          10
		flag4 = false;
	//   25   51:iconst_0        
	//   26   52:istore          9
		if(i == 1) goto _L2; else goto _L1
	//   27   54:iload           5
	//   28   56:iconst_1        
	//   29   57:icmpeq          291
_L1:
		i;
	//   30   60:iload           5
		JVM INSTR tableswitch 3 7: default 96
	//	               3 201
	//	               4 150
	//	               5 108
	//	               6 201
	//	               7 291;
	//   31   62:tableswitch     3 7: default 96
	//	               3 201
	//	               4 150
	//	               5 108
	//	               6 201
	//	               7 291
		   goto _L3 _L4 _L5 _L6 _L4 _L2
_L3:
		i = 0;
	//   32   96:iconst_0        
	//   33   97:istore          5
_L18:
		boolean flag2;
		boolean flag3;
		flag3 = false;
	//   34   99:iconst_0        
	//   35  100:istore          7
		flag2 = false;
	//   36  102:iconst_0        
	//   37  103:istore          6
		break; /* Loop/switch isn't completed */
	//   38  105:goto            337
_L6:
		if(!flag1) goto _L8; else goto _L7
	//   39  108:iload           4
	//   40  110:ifeq            140
_L7:
		if(!fragment.mHiddenChanged || fragment.mHidden || !fragment.mAdded) goto _L10; else goto _L9
	//   41  113:aload           12
	//   42  115:getfield        #104 <Field boolean Fragment.mHiddenChanged>
	//   43  118:ifeq            328
	//   44  121:aload           12
	//   45  123:getfield        #107 <Field boolean Fragment.mHidden>
	//   46  126:ifne            328
	//   47  129:aload           12
	//   48  131:getfield        #110 <Field boolean Fragment.mAdded>
	//   49  134:ifeq            328
	//*  50  137:goto            322
_L8:
		flag4 = fragment.mHidden;
	//   51  140:aload           12
	//   52  142:getfield        #107 <Field boolean Fragment.mHidden>
	//   53  145:istore          9
		  goto _L11
	//*  54  147:goto            331
_L5:
		if(flag1 ? !fragment.mHiddenChanged || !fragment.mAdded || !fragment.mHidden : !fragment.mAdded || fragment.mHidden) goto _L13; else goto _L12
	//   55  150:iload           4
	//   56  152:ifeq            182
	//   57  155:aload           12
	//   58  157:getfield        #104 <Field boolean Fragment.mHiddenChanged>
	//   59  160:ifeq            249
	//   60  163:aload           12
	//   61  165:getfield        #110 <Field boolean Fragment.mAdded>
	//   62  168:ifeq            249
	//   63  171:aload           12
	//   64  173:getfield        #107 <Field boolean Fragment.mHidden>
	//   65  176:ifeq            249
	//   66  179:goto            243
	//   67  182:aload           12
	//   68  184:getfield        #110 <Field boolean Fragment.mAdded>
	//   69  187:ifeq            249
	//   70  190:aload           12
	//   71  192:getfield        #107 <Field boolean Fragment.mHidden>
	//   72  195:ifne            249
	//*  73  198:goto            179
_L4:
		if(flag1 ? fragment.mAdded || fragment.mView == null || fragment.mView.getVisibility() != 0 || fragment.mPostponedAlpha < 0.0F : !fragment.mAdded || fragment.mHidden) goto _L13; else goto _L12
	//   74  201:iload           4
	//   75  203:ifeq            255
	//   76  206:aload           12
	//   77  208:getfield        #110 <Field boolean Fragment.mAdded>
	//   78  211:ifne            249
	//   79  214:aload           12
	//   80  216:getfield        #114 <Field View Fragment.mView>
	//   81  219:ifnull          249
	//   82  222:aload           12
	//   83  224:getfield        #114 <Field View Fragment.mView>
	//   84  227:invokevirtual   #117 <Method int View.getVisibility()>
	//   85  230:ifne            249
	//   86  233:aload           12
	//   87  235:getfield        #121 <Field float Fragment.mPostponedAlpha>
	//   88  238:fconst_0        
	//   89  239:fcmpl           
	//   90  240:iflt            249
	//   91  243:iconst_1        
	//   92  244:istore          5
	//   93  246:goto            274
	//   94  249:iconst_0        
	//   95  250:istore          5
	//   96  252:goto            274
	//   97  255:aload           12
	//   98  257:getfield        #110 <Field boolean Fragment.mAdded>
	//   99  260:ifeq            249
	//  100  263:aload           12
	//  101  265:getfield        #107 <Field boolean Fragment.mHidden>
	//  102  268:ifne            249
_L12:
		i = 1;
		  goto _L14
_L13:
		i = 0;
	//* 103  271:goto            243
_L14:
		flag2 = ((boolean) (i));
	//  104  274:iload           5
	//  105  276:istore          6
		i = 0;
	//  106  278:iconst_0        
	//  107  279:istore          5
		flag3 = true;
	//  108  281:iconst_1        
	//  109  282:istore          7
		flag4 = flag5;
	//  110  284:iload           10
	//  111  286:istore          9
		break; /* Loop/switch isn't completed */
	//  112  288:goto            337
_L2:
		if(!flag1) goto _L16; else goto _L15
	//  113  291:iload           4
	//  114  293:ifeq            306
_L15:
		flag4 = fragment.mIsNewlyAdded;
	//  115  296:aload           12
	//  116  298:getfield        #124 <Field boolean Fragment.mIsNewlyAdded>
	//  117  301:istore          9
		  goto _L11
	//* 118  303:goto            331
_L16:
		if(fragment.mAdded || fragment.mHidden) goto _L10; else goto _L9
	//  119  306:aload           12
	//  120  308:getfield        #110 <Field boolean Fragment.mAdded>
	//  121  311:ifne            328
	//  122  314:aload           12
	//  123  316:getfield        #107 <Field boolean Fragment.mHidden>
	//  124  319:ifne            328
_L9:
		flag4 = true;
	//  125  322:iconst_1        
	//  126  323:istore          9
		  goto _L11
	//* 127  325:goto            331
_L10:
		flag4 = false;
	//  128  328:iconst_0        
	//  129  329:istore          9
_L11:
		i = 1;
	//  130  331:iconst_1        
	//  131  332:istore          5
		if(true) goto _L18; else goto _L17
	//  132  334:goto            99
_L17:
		Object obj;
label0:
		{
			obj = ((Object) ((FragmentContainerTransition)sparsearray.get(j)));
	//  133  337:aload_2         
	//  134  338:iload           8
	//  135  340:invokevirtual   #129 <Method Object SparseArray.get(int)>
	//  136  343:checkcast       #14  <Class FragmentTransition$FragmentContainerTransition>
	//  137  346:astore          11
			op = ((BackStackRecord.Op) (obj));
	//  138  348:aload           11
	//  139  350:astore_1        
			if(flag4)
	//* 140  351:iload           9
	//* 141  353:ifeq            381
			{
				op = ((BackStackRecord.Op) (ensureContainer(((FragmentContainerTransition) (obj)), sparsearray, j)));
	//  142  356:aload           11
	//  143  358:aload_2         
	//  144  359:iload           8
	//  145  361:invokestatic    #133 <Method FragmentTransition$FragmentContainerTransition ensureContainer(FragmentTransition$FragmentContainerTransition, SparseArray, int)>
	//  146  364:astore_1        
				op.lastIn = fragment;
	//  147  365:aload_1         
	//  148  366:aload           12
	//  149  368:putfield        #136 <Field Fragment FragmentTransition$FragmentContainerTransition.lastIn>
				op.lastInIsPop = flag;
	//  150  371:aload_1         
	//  151  372:iload_3         
	//  152  373:putfield        #139 <Field boolean FragmentTransition$FragmentContainerTransition.lastInIsPop>
				op.lastInTransaction = backstackrecord;
	//  153  376:aload_1         
	//  154  377:aload_0         
	//  155  378:putfield        #143 <Field BackStackRecord FragmentTransition$FragmentContainerTransition.lastInTransaction>
			}
			if(!flag1 && i)
	//* 156  381:iload           4
	//* 157  383:ifne            458
	//* 158  386:iload           5
	//* 159  388:ifeq            458
			{
				if(op != null && ((FragmentContainerTransition) (op)).firstOut == fragment)
	//* 160  391:aload_1         
	//* 161  392:ifnull          409
	//* 162  395:aload_1         
	//* 163  396:getfield        #146 <Field Fragment FragmentTransition$FragmentContainerTransition.firstOut>
	//* 164  399:aload           12
	//* 165  401:if_acmpne       409
					op.firstOut = null;
	//  166  404:aload_1         
	//  167  405:aconst_null     
	//  168  406:putfield        #146 <Field Fragment FragmentTransition$FragmentContainerTransition.firstOut>
				obj = ((Object) (backstackrecord.mManager));
	//  169  409:aload_0         
	//  170  410:getfield        #152 <Field FragmentManagerImpl BackStackRecord.mManager>
	//  171  413:astore          11
				if(fragment.mState < 1 && ((FragmentManagerImpl) (obj)).mCurState >= 1 && !backstackrecord.mReorderingAllowed)
	//* 172  415:aload           12
	//* 173  417:getfield        #155 <Field int Fragment.mState>
	//* 174  420:iconst_1        
	//* 175  421:icmpge          458
	//* 176  424:aload           11
	//* 177  426:getfield        #160 <Field int FragmentManagerImpl.mCurState>
	//* 178  429:iconst_1        
	//* 179  430:icmplt          458
	//* 180  433:aload_0         
	//* 181  434:getfield        #163 <Field boolean BackStackRecord.mReorderingAllowed>
	//* 182  437:ifne            458
				{
					((FragmentManagerImpl) (obj)).makeActive(fragment);
	//  183  440:aload           11
	//  184  442:aload           12
	//  185  444:invokevirtual   #167 <Method void FragmentManagerImpl.makeActive(Fragment)>
					((FragmentManagerImpl) (obj)).moveToState(fragment, 1, 0, 0, false);
	//  186  447:aload           11
	//  187  449:aload           12
	//  188  451:iconst_1        
	//  189  452:iconst_0        
	//  190  453:iconst_0        
	//  191  454:iconst_0        
	//  192  455:invokevirtual   #171 <Method void FragmentManagerImpl.moveToState(Fragment, int, int, int, boolean)>
				}
			}
			obj = ((Object) (op));
	//  193  458:aload_1         
	//  194  459:astore          11
			if(!flag2)
				break label0;
	//  195  461:iload           6
	//  196  463:ifeq            508
			if(op != null)
	//* 197  466:aload_1         
	//* 198  467:ifnull          480
			{
				obj = ((Object) (op));
	//  199  470:aload_1         
	//  200  471:astore          11
				if(((FragmentContainerTransition) (op)).firstOut != null)
					break label0;
	//  201  473:aload_1         
	//  202  474:getfield        #146 <Field Fragment FragmentTransition$FragmentContainerTransition.firstOut>
	//  203  477:ifnonnull       508
			}
			obj = ((Object) (ensureContainer(((FragmentContainerTransition) (op)), sparsearray, j)));
	//  204  480:aload_1         
	//  205  481:aload_2         
	//  206  482:iload           8
	//  207  484:invokestatic    #133 <Method FragmentTransition$FragmentContainerTransition ensureContainer(FragmentTransition$FragmentContainerTransition, SparseArray, int)>
	//  208  487:astore          11
			obj.firstOut = fragment;
	//  209  489:aload           11
	//  210  491:aload           12
	//  211  493:putfield        #146 <Field Fragment FragmentTransition$FragmentContainerTransition.firstOut>
			obj.firstOutIsPop = flag;
	//  212  496:aload           11
	//  213  498:iload_3         
	//  214  499:putfield        #174 <Field boolean FragmentTransition$FragmentContainerTransition.firstOutIsPop>
			obj.firstOutTransaction = backstackrecord;
	//  215  502:aload           11
	//  216  504:aload_0         
	//  217  505:putfield        #177 <Field BackStackRecord FragmentTransition$FragmentContainerTransition.firstOutTransaction>
		}
		if(!flag1 && flag3 && obj != null && ((FragmentContainerTransition) (obj)).lastIn == fragment)
	//* 218  508:iload           4
	//* 219  510:ifne            539
	//* 220  513:iload           7
	//* 221  515:ifeq            539
	//* 222  518:aload           11
	//* 223  520:ifnull          539
	//* 224  523:aload           11
	//* 225  525:getfield        #136 <Field Fragment FragmentTransition$FragmentContainerTransition.lastIn>
	//* 226  528:aload           12
	//* 227  530:if_acmpne       539
			obj.lastIn = null;
	//  228  533:aload           11
	//  229  535:aconst_null     
	//  230  536:putfield        #136 <Field Fragment FragmentTransition$FragmentContainerTransition.lastIn>
		return;
	//  231  539:return          
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

	private static a calculateNameOverrides(int i, ArrayList arraylist, ArrayList arraylist1, int j, int k)
	{
		a a1 = new a();
	//    0    0:new             #54  <Class a>
	//    1    3:dup             
	//    2    4:invokespecial   #192 <Method void a()>
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
				String s1 = (String)arraylist2.get(l);
	//   54  122:aload           8
	//   55  124:iload           5
	//   56  126:invokevirtual   #186 <Method Object ArrayList.get(int)>
	//   57  129:checkcast       #210 <Class String>
	//   58  132:astore          11
				String s2 = (String)arraylist3.get(l);
	//   59  134:aload           9
	//   60  136:iload           5
	//   61  138:invokevirtual   #186 <Method Object ArrayList.get(int)>
	//   62  141:checkcast       #210 <Class String>
	//   63  144:astore          12
				String s3 = (String)a1.remove(((Object) (s2)));
	//   64  146:aload           10
	//   65  148:aload           12
	//   66  150:invokevirtual   #214 <Method Object a.remove(Object)>
	//   67  153:checkcast       #210 <Class String>
	//   68  156:astore          13
				if(s3 != null)
	//*  69  158:aload           13
	//*  70  160:ifnull          176
					a1.put(((Object) (s1)), ((Object) (s3)));
	//   71  163:aload           10
	//   72  165:aload           11
	//   73  167:aload           13
	//   74  169:invokevirtual   #218 <Method Object a.put(Object, Object)>
	//   75  172:pop             
				else
	//*  76  173:goto            186
					a1.put(((Object) (s1)), ((Object) (s2)));
	//   77  176:aload           10
	//   78  178:aload           11
	//   79  180:aload           12
	//   80  182:invokevirtual   #218 <Method Object a.put(Object, Object)>
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
		return a1;
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

	private static void callSharedElementStartEnd(Fragment fragment, Fragment fragment1, boolean flag, a a1, boolean flag1)
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
			int j = 0;
	//   19   38:iconst_0        
	//   20   39:istore          6
			int i;
			if(a1 == null)
	//*  21   41:aload_3         
	//*  22   42:ifnonnull       51
				i = 0;
	//   23   45:iconst_0        
	//   24   46:istore          5
			else
	//*  25   48:goto            57
				i = a1.size();
	//   26   51:aload_3         
	//   27   52:invokevirtual   #58  <Method int a.size()>
	//   28   55:istore          5
			for(; j < i; j++)
	//*  29   57:iload           6
	//*  30   59:iload           5
	//*  31   61:icmpge          96
			{
				arraylist.add(a1.b(j));
	//   32   64:aload           7
	//   33   66:aload_3         
	//   34   67:iload           6
	//   35   69:invokevirtual   #237 <Method Object a.b(int)>
	//   36   72:invokevirtual   #81  <Method boolean ArrayList.add(Object)>
	//   37   75:pop             
				((ArrayList) (fragment1)).add(a1.c(j));
	//   38   76:aload_1         
	//   39   77:aload_3         
	//   40   78:iload           6
	//   41   80:invokevirtual   #62  <Method Object a.c(int)>
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

	private static a captureInSharedElements(a a1, Object obj, FragmentContainerTransition fragmentcontainertransition)
	{
		Fragment fragment = fragmentcontainertransition.lastIn;
	//    0    0:aload_2         
	//    1    1:getfield        #136 <Field Fragment FragmentTransition$FragmentContainerTransition.lastIn>
	//    2    4:astore          5
		View view = fragment.getView();
	//    3    6:aload           5
	//    4    8:invokevirtual   #251 <Method View Fragment.getView()>
	//    5   11:astore          6
		if(!a1.isEmpty() && obj != null && view != null)
	//*   6   13:aload_0         
	//*   7   14:invokevirtual   #254 <Method boolean a.isEmpty()>
	//*   8   17:ifne            215
	//*   9   20:aload_1         
	//*  10   21:ifnull          215
	//*  11   24:aload           6
	//*  12   26:ifnonnull       32
	//*  13   29:goto            215
		{
			a a2 = new a();
	//   14   32:new             #54  <Class a>
	//   15   35:dup             
	//   16   36:invokespecial   #192 <Method void a()>
	//   17   39:astore          4
			FragmentTransitionCompat21.findNamedViews(((java.util.Map) (a2)), view);
	//   18   41:aload           4
	//   19   43:aload           6
	//   20   45:invokestatic    #260 <Method void FragmentTransitionCompat21.findNamedViews(java.util.Map, View)>
			obj = ((Object) (fragmentcontainertransition.lastInTransaction));
	//   21   48:aload_2         
	//   22   49:getfield        #143 <Field BackStackRecord FragmentTransition$FragmentContainerTransition.lastInTransaction>
	//   23   52:astore_1        
			if(fragmentcontainertransition.lastInIsPop)
	//*  24   53:aload_2         
	//*  25   54:getfield        #139 <Field boolean FragmentTransition$FragmentContainerTransition.lastInIsPop>
	//*  26   57:ifeq            74
			{
				fragmentcontainertransition = ((FragmentContainerTransition) (fragment.getExitTransitionCallback()));
	//   27   60:aload           5
	//   28   62:invokevirtual   #263 <Method SharedElementCallback Fragment.getExitTransitionCallback()>
	//   29   65:astore_2        
				obj = ((Object) (((BackStackRecord) (obj)).mSharedElementSourceNames));
	//   30   66:aload_1         
	//   31   67:getfield        #205 <Field ArrayList BackStackRecord.mSharedElementSourceNames>
	//   32   70:astore_1        
			} else
	//*  33   71:goto            85
			{
				fragmentcontainertransition = ((FragmentContainerTransition) (fragment.getEnterTransitionCallback()));
	//   34   74:aload           5
	//   35   76:invokevirtual   #233 <Method SharedElementCallback Fragment.getEnterTransitionCallback()>
	//   36   79:astore_2        
				obj = ((Object) (((BackStackRecord) (obj)).mSharedElementTargetNames));
	//   37   80:aload_1         
	//   38   81:getfield        #208 <Field ArrayList BackStackRecord.mSharedElementTargetNames>
	//   39   84:astore_1        
			}
			if(obj != null)
	//*  40   85:aload_1         
	//*  41   86:ifnull          96
				a2.a(((Collection) (obj)));
	//   42   89:aload           4
	//   43   91:aload_1         
	//   44   92:invokevirtual   #267 <Method boolean a.a(Collection)>
	//   45   95:pop             
			if(fragmentcontainertransition != null)
	//*  46   96:aload_2         
	//*  47   97:ifnull          206
			{
				((SharedElementCallback) (fragmentcontainertransition)).onMapSharedElements(((java.util.List) (obj)), ((java.util.Map) (a2)));
	//   48  100:aload_2         
	//   49  101:aload_1         
	//   50  102:aload           4
	//   51  104:invokevirtual   #271 <Method void SharedElementCallback.onMapSharedElements(java.util.List, java.util.Map)>
				for(int i = ((ArrayList) (obj)).size() - 1; i >= 0; i--)
	//*  52  107:aload_1         
	//*  53  108:invokevirtual   #185 <Method int ArrayList.size()>
	//*  54  111:iconst_1        
	//*  55  112:isub            
	//*  56  113:istore_3        
	//*  57  114:iload_3         
	//*  58  115:iflt            212
				{
					String s1 = (String)((ArrayList) (obj)).get(i);
	//   59  118:aload_1         
	//   60  119:iload_3         
	//   61  120:invokevirtual   #186 <Method Object ArrayList.get(int)>
	//   62  123:checkcast       #210 <Class String>
	//   63  126:astore          5
					fragmentcontainertransition = ((FragmentContainerTransition) ((View)a2.get(((Object) (s1)))));
	//   64  128:aload           4
	//   65  130:aload           5
	//   66  132:invokevirtual   #273 <Method Object a.get(Object)>
	//   67  135:checkcast       #64  <Class View>
	//   68  138:astore_2        
					if(fragmentcontainertransition == null)
	//*  69  139:aload_2         
	//*  70  140:ifnonnull       163
					{
						fragmentcontainertransition = ((FragmentContainerTransition) (findKeyForValue(a1, s1)));
	//   71  143:aload_0         
	//   72  144:aload           5
	//   73  146:invokestatic    #277 <Method String findKeyForValue(a, String)>
	//   74  149:astore_2        
						if(fragmentcontainertransition != null)
	//*  75  150:aload_2         
	//*  76  151:ifnull          199
							a1.remove(((Object) (fragmentcontainertransition)));
	//   77  154:aload_0         
	//   78  155:aload_2         
	//   79  156:invokevirtual   #214 <Method Object a.remove(Object)>
	//   80  159:pop             
					} else
	//*  81  160:goto            199
					if(!s1.equals(((Object) (s.n(((View) (fragmentcontainertransition)))))))
	//*  82  163:aload           5
	//*  83  165:aload_2         
	//*  84  166:invokestatic    #70  <Method String s.n(View)>
	//*  85  169:invokevirtual   #280 <Method boolean String.equals(Object)>
	//*  86  172:ifne            199
					{
						s1 = findKeyForValue(a1, s1);
	//   87  175:aload_0         
	//   88  176:aload           5
	//   89  178:invokestatic    #277 <Method String findKeyForValue(a, String)>
	//   90  181:astore          5
						if(s1 != null)
	//*  91  183:aload           5
	//*  92  185:ifnull          199
							a1.put(((Object) (s1)), ((Object) (s.n(((View) (fragmentcontainertransition))))));
	//   93  188:aload_0         
	//   94  189:aload           5
	//   95  191:aload_2         
	//   96  192:invokestatic    #70  <Method String s.n(View)>
	//   97  195:invokevirtual   #218 <Method Object a.put(Object, Object)>
	//   98  198:pop             
					}
				}

	//   99  199:iload_3         
	//  100  200:iconst_1        
	//  101  201:isub            
	//  102  202:istore_3        
			} else
	//* 103  203:goto            114
			{
				retainValues(a1, a2);
	//  104  206:aload_0         
	//  105  207:aload           4
	//  106  209:invokestatic    #284 <Method void retainValues(a, a)>
			}
			return a2;
	//  107  212:aload           4
	//  108  214:areturn         
		} else
		{
			a1.clear();
	//  109  215:aload_0         
	//  110  216:invokevirtual   #287 <Method void a.clear()>
			return null;
	//  111  219:aconst_null     
	//  112  220:areturn         
		}
	}

	private static a captureOutSharedElements(a a1, Object obj, FragmentContainerTransition fragmentcontainertransition)
	{
		if(!a1.isEmpty() && obj != null)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #254 <Method boolean a.isEmpty()>
	//*   2    4:ifne            194
	//*   3    7:aload_1         
	//*   4    8:ifnonnull       14
	//*   5   11:goto            194
		{
			Fragment fragment = fragmentcontainertransition.firstOut;
	//    6   14:aload_2         
	//    7   15:getfield        #146 <Field Fragment FragmentTransition$FragmentContainerTransition.firstOut>
	//    8   18:astore          5
			a a2 = new a();
	//    9   20:new             #54  <Class a>
	//   10   23:dup             
	//   11   24:invokespecial   #192 <Method void a()>
	//   12   27:astore          4
			FragmentTransitionCompat21.findNamedViews(((java.util.Map) (a2)), fragment.getView());
	//   13   29:aload           4
	//   14   31:aload           5
	//   15   33:invokevirtual   #251 <Method View Fragment.getView()>
	//   16   36:invokestatic    #260 <Method void FragmentTransitionCompat21.findNamedViews(java.util.Map, View)>
			obj = ((Object) (fragmentcontainertransition.firstOutTransaction));
	//   17   39:aload_2         
	//   18   40:getfield        #177 <Field BackStackRecord FragmentTransition$FragmentContainerTransition.firstOutTransaction>
	//   19   43:astore_1        
			if(fragmentcontainertransition.firstOutIsPop)
	//*  20   44:aload_2         
	//*  21   45:getfield        #174 <Field boolean FragmentTransition$FragmentContainerTransition.firstOutIsPop>
	//*  22   48:ifeq            65
			{
				fragmentcontainertransition = ((FragmentContainerTransition) (fragment.getEnterTransitionCallback()));
	//   23   51:aload           5
	//   24   53:invokevirtual   #233 <Method SharedElementCallback Fragment.getEnterTransitionCallback()>
	//   25   56:astore_2        
				obj = ((Object) (((BackStackRecord) (obj)).mSharedElementTargetNames));
	//   26   57:aload_1         
	//   27   58:getfield        #208 <Field ArrayList BackStackRecord.mSharedElementTargetNames>
	//   28   61:astore_1        
			} else
	//*  29   62:goto            76
			{
				fragmentcontainertransition = ((FragmentContainerTransition) (fragment.getExitTransitionCallback()));
	//   30   65:aload           5
	//   31   67:invokevirtual   #263 <Method SharedElementCallback Fragment.getExitTransitionCallback()>
	//   32   70:astore_2        
				obj = ((Object) (((BackStackRecord) (obj)).mSharedElementSourceNames));
	//   33   71:aload_1         
	//   34   72:getfield        #205 <Field ArrayList BackStackRecord.mSharedElementSourceNames>
	//   35   75:astore_1        
			}
			a2.a(((Collection) (obj)));
	//   36   76:aload           4
	//   37   78:aload_1         
	//   38   79:invokevirtual   #267 <Method boolean a.a(Collection)>
	//   39   82:pop             
			if(fragmentcontainertransition != null)
	//*  40   83:aload_2         
	//*  41   84:ifnull          181
			{
				((SharedElementCallback) (fragmentcontainertransition)).onMapSharedElements(((java.util.List) (obj)), ((java.util.Map) (a2)));
	//   42   87:aload_2         
	//   43   88:aload_1         
	//   44   89:aload           4
	//   45   91:invokevirtual   #271 <Method void SharedElementCallback.onMapSharedElements(java.util.List, java.util.Map)>
				for(int i = ((ArrayList) (obj)).size() - 1; i >= 0; i--)
	//*  46   94:aload_1         
	//*  47   95:invokevirtual   #185 <Method int ArrayList.size()>
	//*  48   98:iconst_1        
	//*  49   99:isub            
	//*  50  100:istore_3        
	//*  51  101:iload_3         
	//*  52  102:iflt            191
				{
					String s1 = (String)((ArrayList) (obj)).get(i);
	//   53  105:aload_1         
	//   54  106:iload_3         
	//   55  107:invokevirtual   #186 <Method Object ArrayList.get(int)>
	//   56  110:checkcast       #210 <Class String>
	//   57  113:astore          5
					fragmentcontainertransition = ((FragmentContainerTransition) ((View)a2.get(((Object) (s1)))));
	//   58  115:aload           4
	//   59  117:aload           5
	//   60  119:invokevirtual   #273 <Method Object a.get(Object)>
	//   61  122:checkcast       #64  <Class View>
	//   62  125:astore_2        
					if(fragmentcontainertransition == null)
	//*  63  126:aload_2         
	//*  64  127:ifnonnull       140
						a1.remove(((Object) (s1)));
	//   65  130:aload_0         
	//   66  131:aload           5
	//   67  133:invokevirtual   #214 <Method Object a.remove(Object)>
	//   68  136:pop             
					else
	//*  69  137:goto            174
					if(!s1.equals(((Object) (s.n(((View) (fragmentcontainertransition)))))))
	//*  70  140:aload           5
	//*  71  142:aload_2         
	//*  72  143:invokestatic    #70  <Method String s.n(View)>
	//*  73  146:invokevirtual   #280 <Method boolean String.equals(Object)>
	//*  74  149:ifne            174
					{
						s1 = (String)a1.remove(((Object) (s1)));
	//   75  152:aload_0         
	//   76  153:aload           5
	//   77  155:invokevirtual   #214 <Method Object a.remove(Object)>
	//   78  158:checkcast       #210 <Class String>
	//   79  161:astore          5
						a1.put(((Object) (s.n(((View) (fragmentcontainertransition))))), ((Object) (s1)));
	//   80  163:aload_0         
	//   81  164:aload_2         
	//   82  165:invokestatic    #70  <Method String s.n(View)>
	//   83  168:aload           5
	//   84  170:invokevirtual   #218 <Method Object a.put(Object, Object)>
	//   85  173:pop             
					}
				}

	//   86  174:iload_3         
	//   87  175:iconst_1        
	//   88  176:isub            
	//   89  177:istore_3        
			} else
	//*  90  178:goto            101
			{
				a1.a(((Collection) (a2.keySet())));
	//   91  181:aload_0         
	//   92  182:aload           4
	//   93  184:invokevirtual   #293 <Method java.util.Set a.keySet()>
	//   94  187:invokevirtual   #267 <Method boolean a.a(Collection)>
	//   95  190:pop             
			}
			return a2;
	//   96  191:aload           4
	//   97  193:areturn         
		} else
		{
			a1.clear();
	//   98  194:aload_0         
	//   99  195:invokevirtual   #287 <Method void a.clear()>
			return null;
	//  100  198:aconst_null     
	//  101  199:areturn         
		}
	}

	private static ArrayList configureEnteringExitingViews(Object obj, Fragment fragment, ArrayList arraylist, View view)
	{
		if(obj != null)
	//*   0    0:aload_0         
	//*   1    1:ifnull          66
		{
			ArrayList arraylist1 = new ArrayList();
	//    2    4:new             #78  <Class ArrayList>
	//    3    7:dup             
	//    4    8:invokespecial   #234 <Method void ArrayList()>
	//    5   11:astore          4
			fragment = ((Fragment) (fragment.getView()));
	//    6   13:aload_1         
	//    7   14:invokevirtual   #251 <Method View Fragment.getView()>
	//    8   17:astore_1        
			if(fragment != null)
	//*   9   18:aload_1         
	//*  10   19:ifnull          28
				FragmentTransitionCompat21.captureTransitioningViews(arraylist1, ((View) (fragment)));
	//   11   22:aload           4
	//   12   24:aload_1         
	//   13   25:invokestatic    #297 <Method void FragmentTransitionCompat21.captureTransitioningViews(ArrayList, View)>
			if(arraylist != null)
	//*  14   28:aload_2         
	//*  15   29:ifnull          39
				arraylist1.removeAll(((Collection) (arraylist)));
	//   16   32:aload           4
	//   17   34:aload_2         
	//   18   35:invokevirtual   #300 <Method boolean ArrayList.removeAll(Collection)>
	//   19   38:pop             
			fragment = ((Fragment) (arraylist1));
	//   20   39:aload           4
	//   21   41:astore_1        
			if(!arraylist1.isEmpty())
	//*  22   42:aload           4
	//*  23   44:invokevirtual   #301 <Method boolean ArrayList.isEmpty()>
	//*  24   47:ifne            68
			{
				arraylist1.add(((Object) (view)));
	//   25   50:aload           4
	//   26   52:aload_3         
	//   27   53:invokevirtual   #81  <Method boolean ArrayList.add(Object)>
	//   28   56:pop             
				FragmentTransitionCompat21.addTargets(obj, arraylist1);
	//   29   57:aload_0         
	//   30   58:aload           4
	//   31   60:invokestatic    #305 <Method void FragmentTransitionCompat21.addTargets(Object, ArrayList)>
				return arraylist1;
	//   32   63:aload           4
	//   33   65:areturn         
			}
		} else
		{
			fragment = null;
	//   34   66:aconst_null     
	//   35   67:astore_1        
		}
		return ((ArrayList) (fragment));
	//   36   68:aload_1         
	//   37   69:areturn         
	}

	private static Object configureSharedElementsOrdered(ViewGroup viewgroup, View view, a a1, FragmentContainerTransition fragmentcontainertransition, ArrayList arraylist, ArrayList arraylist1, Object obj, Object obj1)
	{
		Fragment fragment = fragmentcontainertransition.lastIn;
	//    0    0:aload_3         
	//    1    1:getfield        #136 <Field Fragment FragmentTransition$FragmentContainerTransition.lastIn>
	//    2    4:astore          12
		Fragment fragment1 = fragmentcontainertransition.firstOut;
	//    3    6:aload_3         
	//    4    7:getfield        #146 <Field Fragment FragmentTransition$FragmentContainerTransition.firstOut>
	//    5   10:astore          13
		Object obj3 = null;
	//    6   12:aconst_null     
	//    7   13:astore          10
		if(fragment != null)
	//*   8   15:aload           12
	//*   9   17:ifnull          220
		{
			if(fragment1 == null)
	//*  10   20:aload           13
	//*  11   22:ifnonnull       27
				return ((Object) (null));
	//   12   25:aconst_null     
	//   13   26:areturn         
			boolean flag = fragmentcontainertransition.lastInIsPop;
	//   14   27:aload_3         
	//   15   28:getfield        #139 <Field boolean FragmentTransition$FragmentContainerTransition.lastInIsPop>
	//   16   31:istore          8
			Object obj2;
			if(a1.isEmpty())
	//*  17   33:aload_2         
	//*  18   34:invokevirtual   #254 <Method boolean a.isEmpty()>
	//*  19   37:ifeq            46
				obj2 = null;
	//   20   40:aconst_null     
	//   21   41:astore          9
			else
	//*  22   43:goto            57
				obj2 = getSharedElementTransition(fragment, fragment1, flag);
	//   23   46:aload           12
	//   24   48:aload           13
	//   25   50:iload           8
	//   26   52:invokestatic    #312 <Method Object getSharedElementTransition(Fragment, Fragment, boolean)>
	//   27   55:astore          9
			a a2 = a1;
	//   28   57:aload_2         
	//   29   58:astore          11
			a a3 = captureOutSharedElements(a2, obj2, fragmentcontainertransition);
	//   30   60:aload           11
	//   31   62:aload           9
	//   32   64:aload_3         
	//   33   65:invokestatic    #314 <Method a captureOutSharedElements(a, Object, FragmentTransition$FragmentContainerTransition)>
	//   34   68:astore          14
			if(a1.isEmpty())
	//*  35   70:aload_2         
	//*  36   71:invokevirtual   #254 <Method boolean a.isEmpty()>
	//*  37   74:ifeq            82
			{
				a1 = null;
	//   38   77:aconst_null     
	//   39   78:astore_2        
			} else
	//*  40   79:goto            96
			{
				arraylist.addAll(a3.values());
	//   41   82:aload           4
	//   42   84:aload           14
	//   43   86:invokevirtual   #318 <Method Collection a.values()>
	//   44   89:invokevirtual   #321 <Method boolean ArrayList.addAll(Collection)>
	//   45   92:pop             
				a1 = ((a) (obj2));
	//   46   93:aload           9
	//   47   95:astore_2        
			}
			if(obj == null && obj1 == null && a1 == null)
	//*  48   96:aload           6
	//*  49   98:ifnonnull       112
	//*  50  101:aload           7
	//*  51  103:ifnonnull       112
	//*  52  106:aload_2         
	//*  53  107:ifnonnull       112
				return ((Object) (null));
	//   54  110:aconst_null     
	//   55  111:areturn         
			callSharedElementStartEnd(fragment, fragment1, flag, a3, true);
	//   56  112:aload           12
	//   57  114:aload           13
	//   58  116:iload           8
	//   59  118:aload           14
	//   60  120:iconst_1        
	//   61  121:invokestatic    #40  <Method void callSharedElementStartEnd(Fragment, Fragment, boolean, a, boolean)>
			if(a1 != null)
	//*  62  124:aload_2         
	//*  63  125:ifnull          183
			{
				Rect rect = new Rect();
	//   64  128:new             #323 <Class Rect>
	//   65  131:dup             
	//   66  132:invokespecial   #324 <Method void Rect()>
	//   67  135:astore          9
				FragmentTransitionCompat21.setSharedElementTargets(((Object) (a1)), view, arraylist);
	//   68  137:aload_2         
	//   69  138:aload_1         
	//   70  139:aload           4
	//   71  141:invokestatic    #328 <Method void FragmentTransitionCompat21.setSharedElementTargets(Object, View, ArrayList)>
				setOutEpicenter(((Object) (a1)), obj1, a3, fragmentcontainertransition.firstOutIsPop, fragmentcontainertransition.firstOutTransaction);
	//   72  144:aload_2         
	//   73  145:aload           7
	//   74  147:aload           14
	//   75  149:aload_3         
	//   76  150:getfield        #174 <Field boolean FragmentTransition$FragmentContainerTransition.firstOutIsPop>
	//   77  153:aload_3         
	//   78  154:getfield        #177 <Field BackStackRecord FragmentTransition$FragmentContainerTransition.firstOutTransaction>
	//   79  157:invokestatic    #332 <Method void setOutEpicenter(Object, Object, a, boolean, BackStackRecord)>
				obj1 = ((Object) (rect));
	//   80  160:aload           9
	//   81  162:astore          7
				if(obj != null)
	//*  82  164:aload           6
	//*  83  166:ifnull          187
				{
					FragmentTransitionCompat21.setEpicenter(obj, rect);
	//   84  169:aload           6
	//   85  171:aload           9
	//   86  173:invokestatic    #336 <Method void FragmentTransitionCompat21.setEpicenter(Object, Rect)>
					obj1 = ((Object) (rect));
	//   87  176:aload           9
	//   88  178:astore          7
				}
			} else
	//*  89  180:goto            187
			{
				obj1 = ((Object) (obj3));
	//   90  183:aload           10
	//   91  185:astore          7
			}
			OneShotPreDrawListener.add(((View) (viewgroup)), new Runnable(a2, ((Object) (a1)), fragmentcontainertransition, arraylist1, view, fragment, fragment1, flag, arraylist, obj, ((Rect) (obj1))) {

				public void run()
				{
					Object obj4 = ((Object) (FragmentTransition.captureInSharedElements(nameOverrides, finalSharedElementTransition, fragments)));
				//    0    0:aload_0         
				//    1    1:getfield        #34  <Field a val$nameOverrides>
				//    2    4:aload_0         
				//    3    5:getfield        #36  <Field Object val$finalSharedElementTransition>
				//    4    8:aload_0         
				//    5    9:getfield        #38  <Field FragmentTransition$FragmentContainerTransition val$fragments>
				//    6   12:invokestatic    #63  <Method a FragmentTransition.access$300(a, Object, FragmentTransition$FragmentContainerTransition)>
				//    7   15:astore_1        
					if(obj4 != null)
				//*   8   16:aload_1         
				//*   9   17:ifnull          44
					{
						sharedElementsIn.addAll(((a) (obj4)).values());
				//   10   20:aload_0         
				//   11   21:getfield        #40  <Field ArrayList val$sharedElementsIn>
				//   12   24:aload_1         
				//   13   25:invokevirtual   #69  <Method Collection a.values()>
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
					FragmentTransition.callSharedElementStartEnd(inFragment, outFragment, inIsPop, ((a) (obj4)), false);
				//   22   44:aload_0         
				//   23   45:getfield        #44  <Field Fragment val$inFragment>
				//   24   48:aload_0         
				//   25   49:getfield        #46  <Field Fragment val$outFragment>
				//   26   52:aload_0         
				//   27   53:getfield        #48  <Field boolean val$inIsPop>
				//   28   56:aload_1         
				//   29   57:iconst_0        
				//   30   58:invokestatic    #83  <Method void FragmentTransition.access$200(Fragment, Fragment, boolean, a, boolean)>
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
						obj4 = ((Object) (FragmentTransition.getInEpicenterView(((a) (obj4)), fragments, enterTransition, inIsPop)));
				//   41   83:aload_1         
				//   42   84:aload_0         
				//   43   85:getfield        #38  <Field FragmentTransition$FragmentContainerTransition val$fragments>
				//   44   88:aload_0         
				//   45   89:getfield        #52  <Field Object val$enterTransition>
				//   46   92:aload_0         
				//   47   93:getfield        #48  <Field boolean val$inIsPop>
				//   48   96:invokestatic    #93  <Method View FragmentTransition.access$400(a, FragmentTransition$FragmentContainerTransition, Object, boolean)>
				//   49   99:astore_1        
						if(obj4 != null)
				//*  50  100:aload_1         
				//*  51  101:ifnull          112
							FragmentTransitionCompat21.getBoundsOnScreen(((View) (obj4)), inEpicenter);
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
				final a val$nameOverrides;
				final View val$nonExistentView;
				final Fragment val$outFragment;
				final ArrayList val$sharedElementsIn;
				final ArrayList val$sharedElementsOut;

			
			{
				nameOverrides = a1;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #34  <Field a val$nameOverrides>
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
	//   92  187:aload_0         
	//   93  188:new             #12  <Class FragmentTransition$4>
	//   94  191:dup             
	//   95  192:aload           11
	//   96  194:aload_2         
	//   97  195:aload_3         
	//   98  196:aload           5
	//   99  198:aload_1         
	//  100  199:aload           12
	//  101  201:aload           13
	//  102  203:iload           8
	//  103  205:aload           4
	//  104  207:aload           6
	//  105  209:aload           7
	//  106  211:invokespecial   #339 <Method void FragmentTransition$4(a, Object, FragmentTransition$FragmentContainerTransition, ArrayList, View, Fragment, Fragment, boolean, ArrayList, Object, Rect)>
	//  107  214:invokestatic    #344 <Method OneShotPreDrawListener OneShotPreDrawListener.add(View, Runnable)>
	//  108  217:pop             
			return ((Object) (a1));
	//  109  218:aload_2         
	//  110  219:areturn         
		} else
		{
			return ((Object) (null));
	//  111  220:aconst_null     
	//  112  221:areturn         
		}
	}

	private static Object configureSharedElementsReordered(ViewGroup viewgroup, View view, a a1, FragmentContainerTransition fragmentcontainertransition, ArrayList arraylist, ArrayList arraylist1, Object obj, Object obj1)
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
	//   11   23:invokevirtual   #350 <Method void View.setVisibility(int)>
		if(fragment != null)
	//*  12   26:aload           10
	//*  13   28:ifnull          272
		{
			if(fragment1 == null)
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
			if(a1.isEmpty())
	//*  21   44:aload_2         
	//*  22   45:invokevirtual   #254 <Method boolean a.isEmpty()>
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
	//   30   63:invokestatic    #312 <Method Object getSharedElementTransition(Fragment, Fragment, boolean)>
	//   31   66:astore          9
			a a3 = captureOutSharedElements(a1, obj2, fragmentcontainertransition);
	//   32   68:aload_2         
	//   33   69:aload           9
	//   34   71:aload_3         
	//   35   72:invokestatic    #314 <Method a captureOutSharedElements(a, Object, FragmentTransition$FragmentContainerTransition)>
	//   36   75:astore          13
			a a2 = captureInSharedElements(a1, obj2, fragmentcontainertransition);
	//   37   77:aload_2         
	//   38   78:aload           9
	//   39   80:aload_3         
	//   40   81:invokestatic    #45  <Method a captureInSharedElements(a, Object, FragmentTransition$FragmentContainerTransition)>
	//   41   84:astore          12
			if(a1.isEmpty())
	//*  42   86:aload_2         
	//*  43   87:invokevirtual   #254 <Method boolean a.isEmpty()>
	//*  44   90:ifeq            119
			{
				if(a3 != null)
	//*  45   93:aload           13
	//*  46   95:ifnull          103
					a3.clear();
	//   47   98:aload           13
	//   48  100:invokevirtual   #287 <Method void a.clear()>
				if(a2 != null)
	//*  49  103:aload           12
	//*  50  105:ifnull          113
					a2.clear();
	//   51  108:aload           12
	//   52  110:invokevirtual   #287 <Method void a.clear()>
				obj2 = null;
	//   53  113:aconst_null     
	//   54  114:astore          9
			} else
	//*  55  116:goto            141
			{
				addSharedElementsWithMatchingNames(arraylist, a3, ((Collection) (a1.keySet())));
	//   56  119:aload           4
	//   57  121:aload           13
	//   58  123:aload_2         
	//   59  124:invokevirtual   #293 <Method java.util.Set a.keySet()>
	//   60  127:invokestatic    #352 <Method void addSharedElementsWithMatchingNames(ArrayList, a, Collection)>
				addSharedElementsWithMatchingNames(arraylist1, a2, a1.values());
	//   61  130:aload           5
	//   62  132:aload           12
	//   63  134:aload_2         
	//   64  135:invokevirtual   #318 <Method Collection a.values()>
	//   65  138:invokestatic    #352 <Method void addSharedElementsWithMatchingNames(ArrayList, a, Collection)>
			}
			if(obj == null && obj1 == null && obj2 == null)
	//*  66  141:aload           6
	//*  67  143:ifnonnull       158
	//*  68  146:aload           7
	//*  69  148:ifnonnull       158
	//*  70  151:aload           9
	//*  71  153:ifnonnull       158
				return ((Object) (null));
	//   72  156:aconst_null     
	//   73  157:areturn         
			callSharedElementStartEnd(fragment, fragment1, flag, a3, true);
	//   74  158:aload           10
	//   75  160:aload           11
	//   76  162:iload           8
	//   77  164:aload           13
	//   78  166:iconst_1        
	//   79  167:invokestatic    #40  <Method void callSharedElementStartEnd(Fragment, Fragment, boolean, a, boolean)>
			if(obj2 != null)
	//*  80  170:aload           9
	//*  81  172:ifnull          241
			{
				arraylist1.add(((Object) (view)));
	//   82  175:aload           5
	//   83  177:aload_1         
	//   84  178:invokevirtual   #81  <Method boolean ArrayList.add(Object)>
	//   85  181:pop             
				FragmentTransitionCompat21.setSharedElementTargets(obj2, view, arraylist);
	//   86  182:aload           9
	//   87  184:aload_1         
	//   88  185:aload           4
	//   89  187:invokestatic    #328 <Method void FragmentTransitionCompat21.setSharedElementTargets(Object, View, ArrayList)>
				setOutEpicenter(obj2, obj1, a3, fragmentcontainertransition.firstOutIsPop, fragmentcontainertransition.firstOutTransaction);
	//   90  190:aload           9
	//   91  192:aload           7
	//   92  194:aload           13
	//   93  196:aload_3         
	//   94  197:getfield        #174 <Field boolean FragmentTransition$FragmentContainerTransition.firstOutIsPop>
	//   95  200:aload_3         
	//   96  201:getfield        #177 <Field BackStackRecord FragmentTransition$FragmentContainerTransition.firstOutTransaction>
	//   97  204:invokestatic    #332 <Method void setOutEpicenter(Object, Object, a, boolean, BackStackRecord)>
				view = ((View) (new Rect()));
	//   98  207:new             #323 <Class Rect>
	//   99  210:dup             
	//  100  211:invokespecial   #324 <Method void Rect()>
	//  101  214:astore_1        
				a1 = ((a) (getInEpicenterView(a2, fragmentcontainertransition, obj, flag)));
	//  102  215:aload           12
	//  103  217:aload_3         
	//  104  218:aload           6
	//  105  220:iload           8
	//  106  222:invokestatic    #50  <Method View getInEpicenterView(a, FragmentTransition$FragmentContainerTransition, Object, boolean)>
	//  107  225:astore_2        
				if(a1 != null)
	//* 108  226:aload_2         
	//* 109  227:ifnull          236
					FragmentTransitionCompat21.setEpicenter(obj, ((Rect) (view)));
	//  110  230:aload           6
	//  111  232:aload_1         
	//  112  233:invokestatic    #336 <Method void FragmentTransitionCompat21.setEpicenter(Object, Rect)>
				fragmentcontainertransition = ((FragmentContainerTransition) (view));
	//  113  236:aload_1         
	//  114  237:astore_3        
			} else
	//* 115  238:goto            247
			{
				view = null;
	//  116  241:aconst_null     
	//  117  242:astore_1        
				fragmentcontainertransition = ((FragmentContainerTransition) (view));
	//  118  243:aload_1         
	//  119  244:astore_3        
				a1 = ((a) (view));
	//  120  245:aload_1         
	//  121  246:astore_2        
			}
			OneShotPreDrawListener.add(((View) (viewgroup)), new Runnable(fragment, fragment1, flag, a2, ((View) (a1)), ((Rect) (fragmentcontainertransition))) {

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
				//    7   13:getfield        #32  <Field a val$inSharedElements>
				//    8   16:iconst_0        
				//    9   17:invokestatic    #45  <Method void FragmentTransition.access$200(Fragment, Fragment, boolean, a, boolean)>
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
				final a val$inSharedElements;
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
				inSharedElements = a1;
			//    9   15:aload_0         
			//   10   16:aload           4
			//   11   18:putfield        #32  <Field a val$inSharedElements>
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
	//  122  247:aload_0         
	//  123  248:new             #10  <Class FragmentTransition$3>
	//  124  251:dup             
	//  125  252:aload           10
	//  126  254:aload           11
	//  127  256:iload           8
	//  128  258:aload           12
	//  129  260:aload_2         
	//  130  261:aload_3         
	//  131  262:invokespecial   #355 <Method void FragmentTransition$3(Fragment, Fragment, boolean, a, View, Rect)>
	//  132  265:invokestatic    #344 <Method OneShotPreDrawListener OneShotPreDrawListener.add(View, Runnable)>
	//  133  268:pop             
			return obj2;
	//  134  269:aload           9
	//  135  271:areturn         
		} else
		{
			return ((Object) (null));
	//  136  272:aconst_null     
	//  137  273:areturn         
		}
	}

	private static void configureTransitionsOrdered(FragmentManagerImpl fragmentmanagerimpl, int i, FragmentContainerTransition fragmentcontainertransition, View view, a a1)
	{
		if(fragmentmanagerimpl.mContainer.onHasView())
	//*   0    0:aload_0         
	//*   1    1:getfield        #224 <Field FragmentContainer FragmentManagerImpl.mContainer>
	//*   2    4:invokevirtual   #229 <Method boolean FragmentContainer.onHasView()>
	//*   3    7:ifeq            25
			fragmentmanagerimpl = ((FragmentManagerImpl) ((ViewGroup)fragmentmanagerimpl.mContainer.onFindViewById(i)));
	//    4   10:aload_0         
	//    5   11:getfield        #224 <Field FragmentContainer FragmentManagerImpl.mContainer>
	//    6   14:iload_1         
	//    7   15:invokevirtual   #361 <Method View FragmentContainer.onFindViewById(int)>
	//    8   18:checkcast       #363 <Class ViewGroup>
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
	//   17   33:getfield        #136 <Field Fragment FragmentTransition$FragmentContainerTransition.lastIn>
	//   18   36:astore          8
		Object obj3 = ((Object) (fragmentcontainertransition.firstOut));
	//   19   38:aload_2         
	//   20   39:getfield        #146 <Field Fragment FragmentTransition$FragmentContainerTransition.firstOut>
	//   21   42:astore          12
		boolean flag = fragmentcontainertransition.lastInIsPop;
	//   22   44:aload_2         
	//   23   45:getfield        #139 <Field boolean FragmentTransition$FragmentContainerTransition.lastInIsPop>
	//   24   48:istore          5
		boolean flag1 = fragmentcontainertransition.firstOutIsPop;
	//   25   50:aload_2         
	//   26   51:getfield        #174 <Field boolean FragmentTransition$FragmentContainerTransition.firstOutIsPop>
	//   27   54:istore          6
		Object obj1 = getEnterTransition(fragment, flag);
	//   28   56:aload           8
	//   29   58:iload           5
	//   30   60:invokestatic    #367 <Method Object getEnterTransition(Fragment, boolean)>
	//   31   63:astore          9
		Object obj = getExitTransition(((Fragment) (obj3)), flag1);
	//   32   65:aload           12
	//   33   67:iload           6
	//   34   69:invokestatic    #370 <Method Object getExitTransition(Fragment, boolean)>
	//   35   72:astore          7
		ArrayList arraylist1 = new ArrayList();
	//   36   74:new             #78  <Class ArrayList>
	//   37   77:dup             
	//   38   78:invokespecial   #234 <Method void ArrayList()>
	//   39   81:astore          13
		ArrayList arraylist = new ArrayList();
	//   40   83:new             #78  <Class ArrayList>
	//   41   86:dup             
	//   42   87:invokespecial   #234 <Method void ArrayList()>
	//   43   90:astore          10
		Object obj2 = configureSharedElementsOrdered(((ViewGroup) (fragmentmanagerimpl)), view, a1, fragmentcontainertransition, arraylist1, arraylist, obj1, obj);
	//   44   92:aload_0         
	//   45   93:aload_3         
	//   46   94:aload           4
	//   47   96:aload_2         
	//   48   97:aload           13
	//   49   99:aload           10
	//   50  101:aload           9
	//   51  103:aload           7
	//   52  105:invokestatic    #372 <Method Object configureSharedElementsOrdered(ViewGroup, View, a, FragmentTransition$FragmentContainerTransition, ArrayList, ArrayList, Object, Object)>
	//   53  108:astore          11
		if(obj1 == null && obj2 == null && obj == null)
	//*  54  110:aload           9
	//*  55  112:ifnonnull       126
	//*  56  115:aload           11
	//*  57  117:ifnonnull       126
	//*  58  120:aload           7
	//*  59  122:ifnonnull       126
			return;
	//   60  125:return          
		obj3 = ((Object) (configureEnteringExitingViews(obj, ((Fragment) (obj3)), arraylist1, view)));
	//   61  126:aload           7
	//   62  128:aload           12
	//   63  130:aload           13
	//   64  132:aload_3         
	//   65  133:invokestatic    #35  <Method ArrayList configureEnteringExitingViews(Object, Fragment, ArrayList, View)>
	//   66  136:astore          12
		if(obj3 == null || ((ArrayList) (obj3)).isEmpty())
	//*  67  138:aload           12
	//*  68  140:ifnull          157
	//*  69  143:aload           12
	//*  70  145:invokevirtual   #301 <Method boolean ArrayList.isEmpty()>
	//*  71  148:ifeq            154
	//*  72  151:goto            157
	//*  73  154:goto            160
			obj = null;
	//   74  157:aconst_null     
	//   75  158:astore          7
		FragmentTransitionCompat21.addTarget(obj1, view);
	//   76  160:aload           9
	//   77  162:aload_3         
	//   78  163:invokestatic    #376 <Method void FragmentTransitionCompat21.addTarget(Object, View)>
		fragmentcontainertransition = ((FragmentContainerTransition) (mergeTransitions(obj1, obj, obj2, fragment, fragmentcontainertransition.lastInIsPop)));
	//   79  166:aload           9
	//   80  168:aload           7
	//   81  170:aload           11
	//   82  172:aload           8
	//   83  174:aload_2         
	//   84  175:getfield        #139 <Field boolean FragmentTransition$FragmentContainerTransition.lastInIsPop>
	//   85  178:invokestatic    #380 <Method Object mergeTransitions(Object, Object, Object, Fragment, boolean)>
	//   86  181:astore_2        
		if(fragmentcontainertransition != null)
	//*  87  182:aload_2         
	//*  88  183:ifnull          249
		{
			ArrayList arraylist2 = new ArrayList();
	//   89  186:new             #78  <Class ArrayList>
	//   90  189:dup             
	//   91  190:invokespecial   #234 <Method void ArrayList()>
	//   92  193:astore          13
			FragmentTransitionCompat21.scheduleRemoveTargets(((Object) (fragmentcontainertransition)), obj1, arraylist2, obj, ((ArrayList) (obj3)), obj2, arraylist);
	//   93  195:aload_2         
	//   94  196:aload           9
	//   95  198:aload           13
	//   96  200:aload           7
	//   97  202:aload           12
	//   98  204:aload           11
	//   99  206:aload           10
	//  100  208:invokestatic    #384 <Method void FragmentTransitionCompat21.scheduleRemoveTargets(Object, Object, ArrayList, Object, ArrayList, Object, ArrayList)>
			scheduleTargetChange(((ViewGroup) (fragmentmanagerimpl)), fragment, view, arraylist, obj1, arraylist2, obj, ((ArrayList) (obj3)));
	//  101  211:aload_0         
	//  102  212:aload           8
	//  103  214:aload_3         
	//  104  215:aload           10
	//  105  217:aload           9
	//  106  219:aload           13
	//  107  221:aload           7
	//  108  223:aload           12
	//  109  225:invokestatic    #388 <Method void scheduleTargetChange(ViewGroup, Fragment, View, ArrayList, Object, ArrayList, Object, ArrayList)>
			FragmentTransitionCompat21.setNameOverridesOrdered(((View) (fragmentmanagerimpl)), arraylist, ((java.util.Map) (a1)));
	//  110  228:aload_0         
	//  111  229:aload           10
	//  112  231:aload           4
	//  113  233:invokestatic    #392 <Method void FragmentTransitionCompat21.setNameOverridesOrdered(View, ArrayList, java.util.Map)>
			FragmentTransitionCompat21.beginDelayedTransition(((ViewGroup) (fragmentmanagerimpl)), ((Object) (fragmentcontainertransition)));
	//  114  236:aload_0         
	//  115  237:aload_2         
	//  116  238:invokestatic    #396 <Method void FragmentTransitionCompat21.beginDelayedTransition(ViewGroup, Object)>
			FragmentTransitionCompat21.scheduleNameReset(((ViewGroup) (fragmentmanagerimpl)), arraylist, ((java.util.Map) (a1)));
	//  117  241:aload_0         
	//  118  242:aload           10
	//  119  244:aload           4
	//  120  246:invokestatic    #400 <Method void FragmentTransitionCompat21.scheduleNameReset(ViewGroup, ArrayList, java.util.Map)>
		}
	//  121  249:return          
	}

	private static void configureTransitionsReordered(FragmentManagerImpl fragmentmanagerimpl, int i, FragmentContainerTransition fragmentcontainertransition, View view, a a1)
	{
		if(fragmentmanagerimpl.mContainer.onHasView())
	//*   0    0:aload_0         
	//*   1    1:getfield        #224 <Field FragmentContainer FragmentManagerImpl.mContainer>
	//*   2    4:invokevirtual   #229 <Method boolean FragmentContainer.onHasView()>
	//*   3    7:ifeq            25
			fragmentmanagerimpl = ((FragmentManagerImpl) ((ViewGroup)fragmentmanagerimpl.mContainer.onFindViewById(i)));
	//    4   10:aload_0         
	//    5   11:getfield        #224 <Field FragmentContainer FragmentManagerImpl.mContainer>
	//    6   14:iload_1         
	//    7   15:invokevirtual   #361 <Method View FragmentContainer.onFindViewById(int)>
	//    8   18:checkcast       #363 <Class ViewGroup>
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
	//   17   33:getfield        #136 <Field Fragment FragmentTransition$FragmentContainerTransition.lastIn>
	//   18   36:astore          13
		Object obj2 = ((Object) (fragmentcontainertransition.firstOut));
	//   19   38:aload_2         
	//   20   39:getfield        #146 <Field Fragment FragmentTransition$FragmentContainerTransition.firstOut>
	//   21   42:astore          11
		boolean flag = fragmentcontainertransition.lastInIsPop;
	//   22   44:aload_2         
	//   23   45:getfield        #139 <Field boolean FragmentTransition$FragmentContainerTransition.lastInIsPop>
	//   24   48:istore          5
		boolean flag1 = fragmentcontainertransition.firstOutIsPop;
	//   25   50:aload_2         
	//   26   51:getfield        #174 <Field boolean FragmentTransition$FragmentContainerTransition.firstOutIsPop>
	//   27   54:istore          6
		ArrayList arraylist = new ArrayList();
	//   28   56:new             #78  <Class ArrayList>
	//   29   59:dup             
	//   30   60:invokespecial   #234 <Method void ArrayList()>
	//   31   63:astore          8
		ArrayList arraylist1 = new ArrayList();
	//   32   65:new             #78  <Class ArrayList>
	//   33   68:dup             
	//   34   69:invokespecial   #234 <Method void ArrayList()>
	//   35   72:astore          9
		Object obj1 = getEnterTransition(((Fragment) (obj4)), flag);
	//   36   74:aload           13
	//   37   76:iload           5
	//   38   78:invokestatic    #367 <Method Object getEnterTransition(Fragment, boolean)>
	//   39   81:astore          10
		Object obj = getExitTransition(((Fragment) (obj2)), flag1);
	//   40   83:aload           11
	//   41   85:iload           6
	//   42   87:invokestatic    #370 <Method Object getExitTransition(Fragment, boolean)>
	//   43   90:astore          7
		Object obj3 = configureSharedElementsReordered(((ViewGroup) (fragmentmanagerimpl)), view, a1, fragmentcontainertransition, arraylist1, arraylist, obj1, obj);
	//   44   92:aload_0         
	//   45   93:aload_3         
	//   46   94:aload           4
	//   47   96:aload_2         
	//   48   97:aload           9
	//   49   99:aload           8
	//   50  101:aload           10
	//   51  103:aload           7
	//   52  105:invokestatic    #404 <Method Object configureSharedElementsReordered(ViewGroup, View, a, FragmentTransition$FragmentContainerTransition, ArrayList, ArrayList, Object, Object)>
	//   53  108:astore          12
		if(obj1 == null && obj3 == null && obj == null)
	//*  54  110:aload           10
	//*  55  112:ifnonnull       126
	//*  56  115:aload           12
	//*  57  117:ifnonnull       126
	//*  58  120:aload           7
	//*  59  122:ifnonnull       126
			return;
	//   60  125:return          
		fragmentcontainertransition = ((FragmentContainerTransition) (obj));
	//   61  126:aload           7
	//   62  128:astore_2        
		obj = ((Object) (configureEnteringExitingViews(((Object) (fragmentcontainertransition)), ((Fragment) (obj2)), arraylist1, view)));
	//   63  129:aload_2         
	//   64  130:aload           11
	//   65  132:aload           9
	//   66  134:aload_3         
	//   67  135:invokestatic    #35  <Method ArrayList configureEnteringExitingViews(Object, Fragment, ArrayList, View)>
	//   68  138:astore          7
		view = ((View) (configureEnteringExitingViews(obj1, ((Fragment) (obj4)), arraylist, view)));
	//   69  140:aload           10
	//   70  142:aload           13
	//   71  144:aload           8
	//   72  146:aload_3         
	//   73  147:invokestatic    #35  <Method ArrayList configureEnteringExitingViews(Object, Fragment, ArrayList, View)>
	//   74  150:astore_3        
		setViewVisibility(((ArrayList) (view)), 4);
	//   75  151:aload_3         
	//   76  152:iconst_4        
	//   77  153:invokestatic    #30  <Method void setViewVisibility(ArrayList, int)>
		obj4 = mergeTransitions(obj1, ((Object) (fragmentcontainertransition)), obj3, ((Fragment) (obj4)), flag);
	//   78  156:aload           10
	//   79  158:aload_2         
	//   80  159:aload           12
	//   81  161:aload           13
	//   82  163:iload           5
	//   83  165:invokestatic    #380 <Method Object mergeTransitions(Object, Object, Object, Fragment, boolean)>
	//   84  168:astore          13
		if(obj4 != null)
	//*  85  170:aload           13
	//*  86  172:ifnull          237
		{
			replaceHide(((Object) (fragmentcontainertransition)), ((Fragment) (obj2)), ((ArrayList) (obj)));
	//   87  175:aload_2         
	//   88  176:aload           11
	//   89  178:aload           7
	//   90  180:invokestatic    #408 <Method void replaceHide(Object, Fragment, ArrayList)>
			obj2 = ((Object) (FragmentTransitionCompat21.prepareSetNameOverridesReordered(arraylist)));
	//   91  183:aload           8
	//   92  185:invokestatic    #412 <Method ArrayList FragmentTransitionCompat21.prepareSetNameOverridesReordered(ArrayList)>
	//   93  188:astore          11
			FragmentTransitionCompat21.scheduleRemoveTargets(obj4, obj1, ((ArrayList) (view)), ((Object) (fragmentcontainertransition)), ((ArrayList) (obj)), obj3, arraylist);
	//   94  190:aload           13
	//   95  192:aload           10
	//   96  194:aload_3         
	//   97  195:aload_2         
	//   98  196:aload           7
	//   99  198:aload           12
	//  100  200:aload           8
	//  101  202:invokestatic    #384 <Method void FragmentTransitionCompat21.scheduleRemoveTargets(Object, Object, ArrayList, Object, ArrayList, Object, ArrayList)>
			FragmentTransitionCompat21.beginDelayedTransition(((ViewGroup) (fragmentmanagerimpl)), obj4);
	//  102  205:aload_0         
	//  103  206:aload           13
	//  104  208:invokestatic    #396 <Method void FragmentTransitionCompat21.beginDelayedTransition(ViewGroup, Object)>
			FragmentTransitionCompat21.setNameOverridesReordered(((View) (fragmentmanagerimpl)), arraylist1, arraylist, ((ArrayList) (obj2)), ((java.util.Map) (a1)));
	//  105  211:aload_0         
	//  106  212:aload           9
	//  107  214:aload           8
	//  108  216:aload           11
	//  109  218:aload           4
	//  110  220:invokestatic    #416 <Method void FragmentTransitionCompat21.setNameOverridesReordered(View, ArrayList, ArrayList, ArrayList, java.util.Map)>
			setViewVisibility(((ArrayList) (view)), 0);
	//  111  223:aload_3         
	//  112  224:iconst_0        
	//  113  225:invokestatic    #30  <Method void setViewVisibility(ArrayList, int)>
			FragmentTransitionCompat21.swapSharedElementTargets(obj3, arraylist1, arraylist);
	//  114  228:aload           12
	//  115  230:aload           9
	//  116  232:aload           8
	//  117  234:invokestatic    #420 <Method void FragmentTransitionCompat21.swapSharedElementTargets(Object, ArrayList, ArrayList)>
		}
	//  118  237:return          
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

	private static String findKeyForValue(a a1, String s1)
	{
		int j = a1.size();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #58  <Method int a.size()>
	//    2    4:istore_3        
		for(int i = 0; i < j; i++)
	//*   3    5:iconst_0        
	//*   4    6:istore_2        
	//*   5    7:iload_2         
	//*   6    8:iload_3         
	//*   7    9:icmpge          40
			if(s1.equals(a1.c(i)))
	//*   8   12:aload_1         
	//*   9   13:aload_0         
	//*  10   14:iload_2         
	//*  11   15:invokevirtual   #62  <Method Object a.c(int)>
	//*  12   18:invokevirtual   #280 <Method boolean String.equals(Object)>
	//*  13   21:ifeq            33
				return (String)a1.b(i);
	//   14   24:aload_0         
	//   15   25:iload_2         
	//   16   26:invokevirtual   #237 <Method Object a.b(int)>
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

	private static View getInEpicenterView(a a1, FragmentContainerTransition fragmentcontainertransition, Object obj, boolean flag)
	{
		fragmentcontainertransition = ((FragmentContainerTransition) (fragmentcontainertransition.lastInTransaction));
	//    0    0:aload_1         
	//    1    1:getfield        #143 <Field BackStackRecord FragmentTransition$FragmentContainerTransition.lastInTransaction>
	//    2    4:astore_1        
		if(obj != null && a1 != null && ((BackStackRecord) (fragmentcontainertransition)).mSharedElementSourceNames != null && !((BackStackRecord) (fragmentcontainertransition)).mSharedElementSourceNames.isEmpty())
	//*   3    5:aload_2         
	//*   4    6:ifnull          68
	//*   5    9:aload_0         
	//*   6   10:ifnull          68
	//*   7   13:aload_1         
	//*   8   14:getfield        #205 <Field ArrayList BackStackRecord.mSharedElementSourceNames>
	//*   9   17:ifnull          68
	//*  10   20:aload_1         
	//*  11   21:getfield        #205 <Field ArrayList BackStackRecord.mSharedElementSourceNames>
	//*  12   24:invokevirtual   #301 <Method boolean ArrayList.isEmpty()>
	//*  13   27:ifne            68
		{
			if(flag)
	//*  14   30:iload_3         
	//*  15   31:ifeq            51
				fragmentcontainertransition = ((FragmentContainerTransition) (((BackStackRecord) (fragmentcontainertransition)).mSharedElementSourceNames));
	//   16   34:aload_1         
	//   17   35:getfield        #205 <Field ArrayList BackStackRecord.mSharedElementSourceNames>
	//   18   38:astore_1        
			else
	//*  19   39:aload_1         
	//*  20   40:iconst_0        
	//*  21   41:invokevirtual   #186 <Method Object ArrayList.get(int)>
	//*  22   44:checkcast       #210 <Class String>
	//*  23   47:astore_1        
	//*  24   48:goto            59
				fragmentcontainertransition = ((FragmentContainerTransition) (((BackStackRecord) (fragmentcontainertransition)).mSharedElementTargetNames));
	//   25   51:aload_1         
	//   26   52:getfield        #208 <Field ArrayList BackStackRecord.mSharedElementTargetNames>
	//   27   55:astore_1        
			fragmentcontainertransition = ((FragmentContainerTransition) ((String)((ArrayList) (fragmentcontainertransition)).get(0)));
	//*  28   56:goto            39
			return (View)a1.get(((Object) (fragmentcontainertransition)));
	//   29   59:aload_0         
	//   30   60:aload_1         
	//   31   61:invokevirtual   #273 <Method Object a.get(Object)>
	//   32   64:checkcast       #64  <Class View>
	//   33   67:areturn         
		} else
		{
			return null;
	//   34   68:aconst_null     
	//   35   69:areturn         
		}
	}

	private static Object getSharedElementTransition(Fragment fragment, Fragment fragment1, boolean flag)
	{
		if(fragment != null && fragment1 != null)
	//*   0    0:aload_0         
	//*   1    1:ifnull          36
	//*   2    4:aload_1         
	//*   3    5:ifnonnull       11
	//*   4    8:goto            36
		{
			if(flag)
	//*   5   11:iload_2         
	//*   6   12:ifeq            23
				fragment = ((Fragment) (fragment1.getSharedElementReturnTransition()));
	//    7   15:aload_1         
	//    8   16:invokevirtual   #444 <Method Object Fragment.getSharedElementReturnTransition()>
	//    9   19:astore_0        
			else
	//*  10   20:goto            28
				fragment = ((Fragment) (fragment.getSharedElementEnterTransition()));
	//   11   23:aload_0         
	//   12   24:invokevirtual   #447 <Method Object Fragment.getSharedElementEnterTransition()>
	//   13   27:astore_0        
			return FragmentTransitionCompat21.wrapTransitionInSet(FragmentTransitionCompat21.cloneTransition(((Object) (fragment))));
	//   14   28:aload_0         
	//   15   29:invokestatic    #435 <Method Object FragmentTransitionCompat21.cloneTransition(Object)>
	//   16   32:invokestatic    #450 <Method Object FragmentTransitionCompat21.wrapTransitionInSet(Object)>
	//   17   35:areturn         
		} else
		{
			return ((Object) (null));
	//   18   36:aconst_null     
	//   19   37:areturn         
		}
	}

	private static Object mergeTransitions(Object obj, Object obj1, Object obj2, Fragment fragment, boolean flag)
	{
		if(obj != null && obj1 != null && fragment != null)
	//*   0    0:aload_0         
	//*   1    1:ifnull          35
	//*   2    4:aload_1         
	//*   3    5:ifnull          35
	//*   4    8:aload_3         
	//*   5    9:ifnull          35
		{
			if(flag)
	//*   6   12:iload           4
	//*   7   14:ifeq            26
				flag = fragment.getAllowReturnTransitionOverlap();
	//    8   17:aload_3         
	//    9   18:invokevirtual   #453 <Method boolean Fragment.getAllowReturnTransitionOverlap()>
	//   10   21:istore          4
			else
	//*  11   23:goto            38
				flag = fragment.getAllowEnterTransitionOverlap();
	//   12   26:aload_3         
	//   13   27:invokevirtual   #456 <Method boolean Fragment.getAllowEnterTransitionOverlap()>
	//   14   30:istore          4
		} else
	//*  15   32:goto            38
		{
			flag = true;
	//   16   35:iconst_1        
	//   17   36:istore          4
		}
		if(flag)
	//*  18   38:iload           4
	//*  19   40:ifeq            50
			return FragmentTransitionCompat21.mergeTransitionsTogether(obj1, obj, obj2);
	//   20   43:aload_1         
	//   21   44:aload_0         
	//   22   45:aload_2         
	//   23   46:invokestatic    #460 <Method Object FragmentTransitionCompat21.mergeTransitionsTogether(Object, Object, Object)>
	//   24   49:areturn         
		else
			return FragmentTransitionCompat21.mergeTransitionsInSequence(obj1, obj, obj2);
	//   25   50:aload_1         
	//   26   51:aload_0         
	//   27   52:aload_2         
	//   28   53:invokestatic    #463 <Method Object FragmentTransitionCompat21.mergeTransitionsInSequence(Object, Object, Object)>
	//   29   56:areturn         
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
	//   27   55:invokestatic    #344 <Method OneShotPreDrawListener OneShotPreDrawListener.add(View, Runnable)>
	//   28   58:pop             
		}
	//   29   59:return          
	}

	private static void retainValues(a a1, a a2)
	{
		for(int i = a1.size() - 1; i >= 0; i--)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #58  <Method int a.size()>
	//*   2    4:iconst_1        
	//*   3    5:isub            
	//*   4    6:istore_2        
	//*   5    7:iload_2         
	//*   6    8:iflt            39
			if(!a2.containsKey(((Object) ((String)a1.c(i)))))
	//*   7   11:aload_1         
	//*   8   12:aload_0         
	//*   9   13:iload_2         
	//*  10   14:invokevirtual   #62  <Method Object a.c(int)>
	//*  11   17:checkcast       #210 <Class String>
	//*  12   20:invokevirtual   #480 <Method boolean a.containsKey(Object)>
	//*  13   23:ifne            32
				a1.d(i);
	//   14   26:aload_0         
	//   15   27:iload_2         
	//   16   28:invokevirtual   #483 <Method Object a.d(int)>
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
	//   11   19:invokestatic    #344 <Method OneShotPreDrawListener OneShotPreDrawListener.add(View, Runnable)>
	//   12   22:pop             
	//   13   23:return          
	}

	private static void setOutEpicenter(Object obj, Object obj1, a a1, boolean flag, BackStackRecord backstackrecord)
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
	//*   8   20:ifeq            44
				backstackrecord = ((BackStackRecord) (backstackrecord.mSharedElementTargetNames));
	//    9   23:aload           4
	//   10   25:getfield        #208 <Field ArrayList BackStackRecord.mSharedElementTargetNames>
	//   11   28:astore          4
			else
	//*  12   30:aload           4
	//*  13   32:iconst_0        
	//*  14   33:invokevirtual   #186 <Method Object ArrayList.get(int)>
	//*  15   36:checkcast       #210 <Class String>
	//*  16   39:astore          4
	//*  17   41:goto            54
				backstackrecord = ((BackStackRecord) (backstackrecord.mSharedElementSourceNames));
	//   18   44:aload           4
	//   19   46:getfield        #205 <Field ArrayList BackStackRecord.mSharedElementSourceNames>
	//   20   49:astore          4
			backstackrecord = ((BackStackRecord) ((String)((ArrayList) (backstackrecord)).get(0)));
	//*  21   51:goto            30
			a1 = ((a) ((View)a1.get(((Object) (backstackrecord)))));
	//   22   54:aload_2         
	//   23   55:aload           4
	//   24   57:invokevirtual   #273 <Method Object a.get(Object)>
	//   25   60:checkcast       #64  <Class View>
	//   26   63:astore_2        
			FragmentTransitionCompat21.setEpicenter(obj, ((View) (a1)));
	//   27   64:aload_0         
	//   28   65:aload_2         
	//   29   66:invokestatic    #490 <Method void FragmentTransitionCompat21.setEpicenter(Object, View)>
			if(obj1 != null)
	//*  30   69:aload_1         
	//*  31   70:ifnull          78
				FragmentTransitionCompat21.setEpicenter(obj1, ((View) (a1)));
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
	//   15   25:invokevirtual   #350 <Method void View.setVisibility(int)>

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
	//*   1    1:getfield        #160 <Field int FragmentManagerImpl.mCurState>
	//*   2    4:iconst_1        
	//*   3    5:icmpge          9
			return;
	//    4    8:return          
		if(android.os.Build.VERSION.SDK_INT >= 21)
	//*   5    9:getstatic       #499 <Field int android.os.Build$VERSION.SDK_INT>
	//*   6   12:bipush          21
	//*   7   14:icmplt          207
		{
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
	//   62  137:invokevirtual   #522 <Method int SparseArray.keyAt(int)>
	//   63  140:istore          8
					a a1 = calculateNameOverrides(j1, arraylist, arraylist1, i, j);
	//   64  142:iload           8
	//   65  144:aload_1         
	//   66  145:aload_2         
	//   67  146:iload_3         
	//   68  147:iload           4
	//   69  149:invokestatic    #524 <Method a calculateNameOverrides(int, ArrayList, ArrayList, int, int)>
	//   70  152:astore          11
					FragmentContainerTransition fragmentcontainertransition = (FragmentContainerTransition)sparsearray.valueAt(l);
	//   71  154:aload           9
	//   72  156:iload           6
	//   73  158:invokevirtual   #527 <Method Object SparseArray.valueAt(int)>
	//   74  161:checkcast       #14  <Class FragmentTransition$FragmentContainerTransition>
	//   75  164:astore          12
					if(flag)
	//*  76  166:iload           5
	//*  77  168:ifeq            186
						configureTransitionsReordered(fragmentmanagerimpl, j1, fragmentcontainertransition, view, a1);
	//   78  171:aload_0         
	//   79  172:iload           8
	//   80  174:aload           12
	//   81  176:aload           10
	//   82  178:aload           11
	//   83  180:invokestatic    #529 <Method void configureTransitionsReordered(FragmentManagerImpl, int, FragmentTransition$FragmentContainerTransition, View, a)>
					else
	//*  84  183:goto            198
						configureTransitionsOrdered(fragmentmanagerimpl, j1, fragmentcontainertransition, view, a1);
	//   85  186:aload_0         
	//   86  187:iload           8
	//   87  189:aload           12
	//   88  191:aload           10
	//   89  193:aload           11
	//   90  195:invokestatic    #531 <Method void configureTransitionsOrdered(FragmentManagerImpl, int, FragmentTransition$FragmentContainerTransition, View, a)>
				}

	//   91  198:iload           6
	//   92  200:iconst_1        
	//   93  201:iadd            
	//   94  202:istore          6
			}
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
	static void access$200(Fragment fragment, Fragment fragment1, boolean flag, a a1, boolean flag1)
	{
		callSharedElementStartEnd(fragment, fragment1, flag, a1, flag1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:aload_3         
	//    4    4:iload           4
	//    5    6:invokestatic    #40  <Method void callSharedElementStartEnd(Fragment, Fragment, boolean, a, boolean)>
		return;
	//    6    9:return          
	}

*/


/*
	static a access$300(a a1, Object obj, FragmentContainerTransition fragmentcontainertransition)
	{
		return captureInSharedElements(a1, obj, fragmentcontainertransition);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokestatic    #45  <Method a captureInSharedElements(a, Object, FragmentTransition$FragmentContainerTransition)>
	//    4    6:areturn         
	}

*/


/*
	static View access$400(a a1, FragmentContainerTransition fragmentcontainertransition, Object obj, boolean flag)
	{
		return getInEpicenterView(a1, fragmentcontainertransition, obj, flag);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:invokestatic    #50  <Method View getInEpicenterView(a, FragmentTransition$FragmentContainerTransition, Object, boolean)>
	//    5    7:areturn         
	}

*/
}

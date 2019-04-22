// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.firebase.client.core;

import com.firebase.client.FirebaseError;
import com.firebase.client.core.persistence.PersistenceManager;
import com.firebase.client.core.utilities.ImmutableTree;
import com.firebase.client.core.view.QuerySpec;
import com.firebase.client.core.view.View;
import com.firebase.client.snapshot.ChildKey;
import com.firebase.client.utilities.Pair;
import java.util.*;
import java.util.concurrent.Callable;

// Referenced classes of package com.firebase.client.core:
//			SyncTree, SyncPoint, Path, EventRegistration

class SyncTree$12
	implements Callable
{

	public volatile Object call()
		throws Exception
	{
		return ((Object) (call()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #45  <Method List call()>
	//    2    4:areturn         
	}

	public List call()
	{
		Object obj;
label0:
		{
			Path path = val$query.getPath();
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field QuerySpec val$query>
	//    2    4:invokevirtual   #52  <Method Path QuerySpec.getPath()>
	//    3    7:astore          9
			SyncPoint syncpoint = (SyncPoint)SyncTree.access$700(SyncTree.this).get(path);
	//    4    9:aload_0         
	//    5   10:getfield        #30  <Field SyncTree this$0>
	//    6   13:invokestatic    #56  <Method ImmutableTree SyncTree.access$700(SyncTree)>
	//    7   16:aload           9
	//    8   18:invokevirtual   #62  <Method Object ImmutableTree.get(Path)>
	//    9   21:checkcast       #64  <Class SyncPoint>
	//   10   24:astore          7
			Object obj1 = ((Object) (new ArrayList()));
	//   11   26:new             #66  <Class ArrayList>
	//   12   29:dup             
	//   13   30:invokespecial   #67  <Method void ArrayList()>
	//   14   33:astore          6
			obj = obj1;
	//   15   35:aload           6
	//   16   37:astore          5
			if(syncpoint == null)
				break label0;
	//   17   39:aload           7
	//   18   41:ifnull          606
			if(!val$query.isDefault())
	//*  19   44:aload_0         
	//*  20   45:getfield        #32  <Field QuerySpec val$query>
	//*  21   48:invokevirtual   #71  <Method boolean QuerySpec.isDefault()>
	//*  22   51:ifne            70
			{
				obj = obj1;
	//   23   54:aload           6
	//   24   56:astore          5
				if(!syncpoint.viewExistsForQuery(val$query))
					break label0;
	//   25   58:aload           7
	//   26   60:aload_0         
	//   27   61:getfield        #32  <Field QuerySpec val$query>
	//   28   64:invokevirtual   #75  <Method boolean SyncPoint.viewExistsForQuery(QuerySpec)>
	//   29   67:ifeq            606
			}
			obj = ((Object) (syncpoint.removeEventRegistration(val$query, val$eventRegistration, val$cancelError)));
	//   30   70:aload           7
	//   31   72:aload_0         
	//   32   73:getfield        #32  <Field QuerySpec val$query>
	//   33   76:aload_0         
	//   34   77:getfield        #34  <Field EventRegistration val$eventRegistration>
	//   35   80:aload_0         
	//   36   81:getfield        #36  <Field FirebaseError val$cancelError>
	//   37   84:invokevirtual   #78  <Method Pair SyncPoint.removeEventRegistration(QuerySpec, EventRegistration, FirebaseError)>
	//   38   87:astore          5
			if(syncpoint.isEmpty())
	//*  39   89:aload           7
	//*  40   91:invokevirtual   #81  <Method boolean SyncPoint.isEmpty()>
	//*  41   94:ifeq            119
			{
				obj1 = ((Object) (SyncTree.this));
	//   42   97:aload_0         
	//   43   98:getfield        #30  <Field SyncTree this$0>
	//   44  101:astore          6
				SyncTree.access$702(((SyncTree) (obj1)), SyncTree.access$700(((SyncTree) (obj1))).remove(path));
	//   45  103:aload           6
	//   46  105:aload           6
	//   47  107:invokestatic    #56  <Method ImmutableTree SyncTree.access$700(SyncTree)>
	//   48  110:aload           9
	//   49  112:invokevirtual   #85  <Method ImmutableTree ImmutableTree.remove(Path)>
	//   50  115:invokestatic    #89  <Method ImmutableTree SyncTree.access$702(SyncTree, ImmutableTree)>
	//   51  118:pop             
			}
			List list = (List)((Pair) (obj)).getFirst();
	//   52  119:aload           5
	//   53  121:invokevirtual   #94  <Method Object Pair.getFirst()>
	//   54  124:checkcast       #96  <Class List>
	//   55  127:astore          8
			obj1 = ((Object) ((List)((Pair) (obj)).getSecond()));
	//   56  129:aload           5
	//   57  131:invokevirtual   #99  <Method Object Pair.getSecond()>
	//   58  134:checkcast       #96  <Class List>
	//   59  137:astore          6
			obj = ((Object) (list.iterator()));
	//   60  139:aload           8
	//   61  141:invokeinterface #103 <Method Iterator List.iterator()>
	//   62  146:astore          5
			boolean flag1 = false;
	//   63  148:iconst_0        
	//   64  149:istore_2        
			while(((Iterator) (obj)).hasNext()) 
	//*  65  150:aload           5
	//*  66  152:invokeinterface #108 <Method boolean Iterator.hasNext()>
	//*  67  157:ifeq            213
			{
				QuerySpec queryspec = (QuerySpec)((Iterator) (obj)).next();
	//   68  160:aload           5
	//   69  162:invokeinterface #111 <Method Object Iterator.next()>
	//   70  167:checkcast       #48  <Class QuerySpec>
	//   71  170:astore          7
				SyncTree.access$200(SyncTree.this).setQueryInactive(val$query);
	//   72  172:aload_0         
	//   73  173:getfield        #30  <Field SyncTree this$0>
	//   74  176:invokestatic    #115 <Method PersistenceManager SyncTree.access$200(SyncTree)>
	//   75  179:aload_0         
	//   76  180:getfield        #32  <Field QuerySpec val$query>
	//   77  183:invokeinterface #121 <Method void PersistenceManager.setQueryInactive(QuerySpec)>
				if(!flag1 && !queryspec.loadsAllData())
	//*  78  188:iload_2         
	//*  79  189:ifne            208
	//*  80  192:aload           7
	//*  81  194:invokevirtual   #124 <Method boolean QuerySpec.loadsAllData()>
	//*  82  197:ifeq            203
	//*  83  200:goto            208
					flag1 = false;
	//   84  203:iconst_0        
	//   85  204:istore_2        
				else
	//*  86  205:goto            150
					flag1 = true;
	//   87  208:iconst_1        
	//   88  209:istore_2        
			}
	//*  89  210:goto            150
			obj = ((Object) (SyncTree.access$700(SyncTree.this)));
	//   90  213:aload_0         
	//   91  214:getfield        #30  <Field SyncTree this$0>
	//   92  217:invokestatic    #56  <Method ImmutableTree SyncTree.access$700(SyncTree)>
	//   93  220:astore          5
			boolean flag2;
			if(((ImmutableTree) (obj)).getValue() != null && ((SyncPoint)((ImmutableTree) (obj)).getValue()).hasCompleteView())
	//*  94  222:aload           5
	//*  95  224:invokevirtual   #127 <Method Object ImmutableTree.getValue()>
	//*  96  227:ifnull          249
	//*  97  230:aload           5
	//*  98  232:invokevirtual   #127 <Method Object ImmutableTree.getValue()>
	//*  99  235:checkcast       #64  <Class SyncPoint>
	//* 100  238:invokevirtual   #130 <Method boolean SyncPoint.hasCompleteView()>
	//* 101  241:ifeq            249
				flag2 = true;
	//  102  244:iconst_1        
	//  103  245:istore_3        
			else
	//* 104  246:goto            251
				flag2 = false;
	//  105  249:iconst_0        
	//  106  250:istore_3        
			Iterator iterator = path.iterator();
	//  107  251:aload           9
	//  108  253:invokevirtual   #133 <Method Iterator Path.iterator()>
	//  109  256:astore          10
			boolean flag3;
			do
			{
				flag3 = flag2;
	//  110  258:iload_3         
	//  111  259:istore          4
				if(!iterator.hasNext())
					break;
	//  112  261:aload           10
	//  113  263:invokeinterface #108 <Method boolean Iterator.hasNext()>
	//  114  268:ifeq            348
				ImmutableTree immutabletree = ((ImmutableTree) (obj)).getChild((ChildKey)iterator.next());
	//  115  271:aload           5
	//  116  273:aload           10
	//  117  275:invokeinterface #111 <Method Object Iterator.next()>
	//  118  280:checkcast       #135 <Class ChildKey>
	//  119  283:invokevirtual   #139 <Method ImmutableTree ImmutableTree.getChild(ChildKey)>
	//  120  286:astore          7
				boolean flag;
				if(!flag2 && (immutabletree.getValue() == null || !((SyncPoint)immutabletree.getValue()).hasCompleteView()))
	//* 121  288:iload_3         
	//* 122  289:ifne            322
	//* 123  292:aload           7
	//* 124  294:invokevirtual   #127 <Method Object ImmutableTree.getValue()>
	//* 125  297:ifnull          317
	//* 126  300:aload           7
	//* 127  302:invokevirtual   #127 <Method Object ImmutableTree.getValue()>
	//* 128  305:checkcast       #64  <Class SyncPoint>
	//* 129  308:invokevirtual   #130 <Method boolean SyncPoint.hasCompleteView()>
	//* 130  311:ifeq            317
	//* 131  314:goto            322
					flag = false;
	//  132  317:iconst_0        
	//  133  318:istore_1        
				else
	//* 134  319:goto            324
					flag = true;
	//  135  322:iconst_1        
	//  136  323:istore_1        
				flag3 = flag;
	//  137  324:iload_1         
	//  138  325:istore          4
				if(flag)
					break;
	//  139  327:iload_1         
	//  140  328:ifne            348
				obj = ((Object) (immutabletree));
	//  141  331:aload           7
	//  142  333:astore          5
				flag2 = flag;
	//  143  335:iload_1         
	//  144  336:istore_3        
				if(!immutabletree.isEmpty())
					continue;
	//  145  337:aload           7
	//  146  339:invokevirtual   #140 <Method boolean ImmutableTree.isEmpty()>
	//  147  342:ifeq            258
				flag3 = flag;
	//  148  345:iload_1         
	//  149  346:istore          4
				break;
			} while(true);
			if(flag1 && !flag3)
	//* 150  348:iload_2         
	//* 151  349:ifeq            472
	//* 152  352:iload           4
	//* 153  354:ifne            472
			{
				obj = ((Object) (SyncTree.access$700(SyncTree.this).subtree(path)));
	//  154  357:aload_0         
	//  155  358:getfield        #30  <Field SyncTree this$0>
	//  156  361:invokestatic    #56  <Method ImmutableTree SyncTree.access$700(SyncTree)>
	//  157  364:aload           9
	//  158  366:invokevirtual   #143 <Method ImmutableTree ImmutableTree.subtree(Path)>
	//  159  369:astore          5
				if(!((ImmutableTree) (obj)).isEmpty())
	//* 160  371:aload           5
	//* 161  373:invokevirtual   #140 <Method boolean ImmutableTree.isEmpty()>
	//* 162  376:ifne            472
				{
					tenContainer tencontainer;
					Object obj2;
					for(obj = ((Object) (SyncTree.access$1200(SyncTree.this, ((ImmutableTree) (obj))).iterator())); ((Iterator) (obj)).hasNext(); SyncTree.access$1500(SyncTree.this).startListening(SyncTree.access$1300(SyncTree.this, ((QuerySpec) (obj2))), tenContainer.access._mth1400(tencontainer), ((cTreeHash) (tencontainer)), ((pletionListener) (tencontainer))))
	//* 163  379:aload_0         
	//* 164  380:getfield        #30  <Field SyncTree this$0>
	//* 165  383:aload           5
	//* 166  385:invokestatic    #147 <Method List SyncTree.access$1200(SyncTree, ImmutableTree)>
	//* 167  388:invokeinterface #103 <Method Iterator List.iterator()>
	//* 168  393:astore          5
	//* 169  395:aload           5
	//* 170  397:invokeinterface #108 <Method boolean Iterator.hasNext()>
	//* 171  402:ifeq            472
					{
						obj2 = ((Object) ((View)((Iterator) (obj)).next()));
	//  172  405:aload           5
	//  173  407:invokeinterface #111 <Method Object Iterator.next()>
	//  174  412:checkcast       #149 <Class View>
	//  175  415:astore          9
						tencontainer = new tenContainer(SyncTree.this, ((View) (obj2)));
	//  176  417:new             #151 <Class SyncTree$ListenContainer>
	//  177  420:dup             
	//  178  421:aload_0         
	//  179  422:getfield        #30  <Field SyncTree this$0>
	//  180  425:aload           9
	//  181  427:invokespecial   #154 <Method void SyncTree$ListenContainer(SyncTree, View)>
	//  182  430:astore          7
						obj2 = ((Object) (((View) (obj2)).getQuery()));
	//  183  432:aload           9
	//  184  434:invokevirtual   #158 <Method QuerySpec View.getQuery()>
	//  185  437:astore          9
					}

	//  186  439:aload_0         
	//  187  440:getfield        #30  <Field SyncTree this$0>
	//  188  443:invokestatic    #162 <Method SyncTree$ListenProvider SyncTree.access$1500(SyncTree)>
	//  189  446:aload_0         
	//  190  447:getfield        #30  <Field SyncTree this$0>
	//  191  450:aload           9
	//  192  452:invokestatic    #166 <Method QuerySpec SyncTree.access$1300(SyncTree, QuerySpec)>
	//  193  455:aload           7
	//  194  457:invokestatic    #170 <Method Tag SyncTree$ListenContainer.access$1400(SyncTree$ListenContainer)>
	//  195  460:aload           7
	//  196  462:aload           7
	//  197  464:invokeinterface #176 <Method void SyncTree$ListenProvider.startListening(QuerySpec, Tag, SyncTree$SyncTreeHash, SyncTree$CompletionListener)>
				}
			}
	//* 198  469:goto            395
			if(!flag3 && !list.isEmpty() && val$cancelError == null)
	//* 199  472:iload           4
	//* 200  474:ifne            593
	//* 201  477:aload           8
	//* 202  479:invokeinterface #177 <Method boolean List.isEmpty()>
	//* 203  484:ifne            593
	//* 204  487:aload_0         
	//* 205  488:getfield        #36  <Field FirebaseError val$cancelError>
	//* 206  491:ifnonnull       593
				if(flag1)
	//* 207  494:iload_2         
	//* 208  495:ifeq            525
				{
					SyncTree.access$1500(SyncTree.this).stopListening(SyncTree.access$1300(SyncTree.this, val$query), ((Tag) (null)));
	//  209  498:aload_0         
	//  210  499:getfield        #30  <Field SyncTree this$0>
	//  211  502:invokestatic    #162 <Method SyncTree$ListenProvider SyncTree.access$1500(SyncTree)>
	//  212  505:aload_0         
	//  213  506:getfield        #30  <Field SyncTree this$0>
	//  214  509:aload_0         
	//  215  510:getfield        #32  <Field QuerySpec val$query>
	//  216  513:invokestatic    #166 <Method QuerySpec SyncTree.access$1300(SyncTree, QuerySpec)>
	//  217  516:aconst_null     
	//  218  517:invokeinterface #181 <Method void SyncTree$ListenProvider.stopListening(QuerySpec, Tag)>
				} else
	//* 219  522:goto            593
				{
					QuerySpec queryspec1;
					Tag tag;
					for(obj = ((Object) (list.iterator())); ((Iterator) (obj)).hasNext(); SyncTree.access$1500(SyncTree.this).stopListening(SyncTree.access$1300(SyncTree.this, queryspec1), tag))
	//* 220  525:aload           8
	//* 221  527:invokeinterface #103 <Method Iterator List.iterator()>
	//* 222  532:astore          5
	//* 223  534:aload           5
	//* 224  536:invokeinterface #108 <Method boolean Iterator.hasNext()>
	//* 225  541:ifeq            593
					{
						queryspec1 = (QuerySpec)((Iterator) (obj)).next();
	//  226  544:aload           5
	//  227  546:invokeinterface #111 <Method Object Iterator.next()>
	//  228  551:checkcast       #48  <Class QuerySpec>
	//  229  554:astore          7
						tag = SyncTree.access$000(SyncTree.this, queryspec1);
	//  230  556:aload_0         
	//  231  557:getfield        #30  <Field SyncTree this$0>
	//  232  560:aload           7
	//  233  562:invokestatic    #185 <Method Tag SyncTree.access$000(SyncTree, QuerySpec)>
	//  234  565:astore          9
					}

	//  235  567:aload_0         
	//  236  568:getfield        #30  <Field SyncTree this$0>
	//  237  571:invokestatic    #162 <Method SyncTree$ListenProvider SyncTree.access$1500(SyncTree)>
	//  238  574:aload_0         
	//  239  575:getfield        #30  <Field SyncTree this$0>
	//  240  578:aload           7
	//  241  580:invokestatic    #166 <Method QuerySpec SyncTree.access$1300(SyncTree, QuerySpec)>
	//  242  583:aload           9
	//  243  585:invokeinterface #181 <Method void SyncTree$ListenProvider.stopListening(QuerySpec, Tag)>
				}
	//* 244  590:goto            534
			SyncTree.access$1600(SyncTree.this, list);
	//  245  593:aload_0         
	//  246  594:getfield        #30  <Field SyncTree this$0>
	//  247  597:aload           8
	//  248  599:invokestatic    #189 <Method void SyncTree.access$1600(SyncTree, List)>
			obj = obj1;
	//  249  602:aload           6
	//  250  604:astore          5
		}
		return ((List) (obj));
	//  251  606:aload           5
	//  252  608:areturn         
	}

	static final boolean $assertionsDisabled = false;
	final SyncTree this$0;
	final FirebaseError val$cancelError;
	final EventRegistration val$eventRegistration;
	final QuerySpec val$query;

	static 
	{
	//    0    0:return          
	}

	SyncTree$12()
	{
		this$0 = final_synctree;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #30  <Field SyncTree this$0>
		val$query = queryspec;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #32  <Field QuerySpec val$query>
		val$eventRegistration = eventregistration;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #34  <Field EventRegistration val$eventRegistration>
		val$cancelError = FirebaseError.this;
	//    9   15:aload_0         
	//   10   16:aload           4
	//   11   18:putfield        #36  <Field FirebaseError val$cancelError>
		super();
	//   12   21:aload_0         
	//   13   22:invokespecial   #38  <Method void Object()>
	//   14   25:return          
	}
}

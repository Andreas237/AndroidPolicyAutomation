// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package androidx.work.impl.utils;

import android.text.TextUtils;
import androidx.work.*;
import androidx.work.impl.*;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import androidx.work.impl.model.*;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import java.util.*;

// Referenced classes of package androidx.work.impl.utils:
//			CancelWorkRunnable, PackageManagerHelper

public class EnqueueRunnable
	implements Runnable
{

	public EnqueueRunnable(WorkContinuationImpl workcontinuationimpl)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #34  <Method void Object()>
		mWorkContinuation = workcontinuationimpl;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #36  <Field WorkContinuationImpl mWorkContinuation>
	//    5    9:aload_0         
	//    6   10:new             #38  <Class OperationImpl>
	//    7   13:dup             
	//    8   14:invokespecial   #39  <Method void OperationImpl()>
	//    9   17:putfield        #41  <Field OperationImpl mOperation>
	//   10   20:return          
	}

	private static boolean enqueueContinuation(WorkContinuationImpl workcontinuationimpl)
	{
		Set set = WorkContinuationImpl.prerequisitesFor(workcontinuationimpl);
	//    0    0:aload_0         
	//    1    1:invokestatic    #50  <Method Set WorkContinuationImpl.prerequisitesFor(WorkContinuationImpl)>
	//    2    4:astore_2        
		boolean flag = enqueueWorkWithPrerequisites(workcontinuationimpl.getWorkManagerImpl(), workcontinuationimpl.getWork(), (String[])set.toArray(((Object []) (new String[0]))), workcontinuationimpl.getName(), workcontinuationimpl.getExistingWorkPolicy());
	//    3    5:aload_0         
	//    4    6:invokevirtual   #54  <Method WorkManagerImpl WorkContinuationImpl.getWorkManagerImpl()>
	//    5    9:aload_0         
	//    6   10:invokevirtual   #58  <Method List WorkContinuationImpl.getWork()>
	//    7   13:aload_2         
	//    8   14:iconst_0        
	//    9   15:anewarray       String[]
	//   10   18:invokeinterface #66  <Method Object[] Set.toArray(Object[])>
	//   11   23:checkcast       #68  <Class String[]>
	//   12   26:aload_0         
	//   13   27:invokevirtual   #72  <Method String WorkContinuationImpl.getName()>
	//   14   30:aload_0         
	//   15   31:invokevirtual   #76  <Method ExistingWorkPolicy WorkContinuationImpl.getExistingWorkPolicy()>
	//   16   34:invokestatic    #80  <Method boolean enqueueWorkWithPrerequisites(WorkManagerImpl, List, String[], String, ExistingWorkPolicy)>
	//   17   37:istore_1        
		workcontinuationimpl.markEnqueued();
	//   18   38:aload_0         
	//   19   39:invokevirtual   #83  <Method void WorkContinuationImpl.markEnqueued()>
		return flag;
	//   20   42:iload_1         
	//   21   43:ireturn         
	}

	private static boolean enqueueWorkWithPrerequisites(WorkManagerImpl workmanagerimpl, List list, String as[], String s, ExistingWorkPolicy existingworkpolicy)
	{
		int i;
		int j;
		int k;
		int l;
		boolean flag1;
		long l3;
		boolean flag2;
		WorkDatabase workdatabase;
label0:
		{
label1:
			{
				Object obj1;
label2:
				{
					l3 = System.currentTimeMillis();
	//    0    0:invokestatic    #89  <Method long System.currentTimeMillis()>
	//    1    3:lstore          14
					workdatabase = workmanagerimpl.getWorkDatabase();
	//    2    5:aload_0         
	//    3    6:invokevirtual   #95  <Method WorkDatabase WorkManagerImpl.getWorkDatabase()>
	//    4    9:astore          17
					if(as != null && as.length > 0)
	//*   5   11:aload_2         
	//*   6   12:ifnull          26
	//*   7   15:aload_2         
	//*   8   16:arraylength     
	//*   9   17:ifle            26
						l = 1;
	//   10   20:iconst_1        
	//   11   21:istore          8
					else
	//*  12   23:goto            29
						l = 0;
	//   13   26:iconst_0        
	//   14   27:istore          8
					if(l != 0)
	//*  15   29:iload           8
	//*  16   31:ifeq            202
					{
						int i3 = as.length;
	//   17   34:aload_2         
	//   18   35:arraylength     
	//   19   36:istore          13
						int l2 = 0;
	//   20   38:iconst_0        
	//   21   39:istore          12
						int i1 = l2;
	//   22   41:iload           12
	//   23   43:istore          9
						int l1 = i1;
	//   24   45:iload           9
	//   25   47:istore          10
						int k2 = 1;
	//   26   49:iconst_1        
	//   27   50:istore          11
						do
						{
							k = k2;
	//   28   52:iload           11
	//   29   54:istore          7
							j = i1;
	//   30   56:iload           9
	//   31   58:istore          6
							i = l1;
	//   32   60:iload           10
	//   33   62:istore          5
							if(l2 >= i3)
								break;
	//   34   64:iload           12
	//   35   66:iload           13
	//   36   68:icmpge          212
							Object obj = ((Object) (as[l2]));
	//   37   71:aload_2         
	//   38   72:iload           12
	//   39   74:aaload          
	//   40   75:astore          18
							WorkSpec workspec = workdatabase.workSpecDao().getWorkSpec(((String) (obj)));
	//   41   77:aload           17
	//   42   79:invokevirtual   #101 <Method WorkSpecDao WorkDatabase.workSpecDao()>
	//   43   82:aload           18
	//   44   84:invokeinterface #107 <Method WorkSpec WorkSpecDao.getWorkSpec(String)>
	//   45   89:astore          19
							if(workspec == null)
	//*  46   91:aload           19
	//*  47   93:ifnonnull       125
							{
								Logger.get().error(TAG, String.format("Prerequisite %s doesn't exist; not enqueuing", new Object[] {
									obj
								}), new Throwable[0]);
	//   48   96:invokestatic    #111 <Method Logger Logger.get()>
	//   49   99:getstatic       #28  <Field String TAG>
	//   50  102:ldc1            #113 <String "Prerequisite %s doesn't exist; not enqueuing">
	//   51  104:iconst_1        
	//   52  105:anewarray       Object[]
	//   53  108:dup             
	//   54  109:iconst_0        
	//   55  110:aload           18
	//   56  112:aastore         
	//   57  113:invokestatic    #117 <Method String String.format(String, Object[])>
	//   58  116:iconst_0        
	//   59  117:anewarray       Throwable[]
	//   60  120:invokevirtual   #123 <Method void Logger.error(String, String, Throwable[])>
								return false;
	//   61  123:iconst_0        
	//   62  124:ireturn         
							}
							obj = ((Object) (workspec.state));
	//   63  125:aload           19
	//   64  127:getfield        #129 <Field androidx.work.WorkInfo$State WorkSpec.state>
	//   65  130:astore          18
							if(obj == androidx.work.WorkInfo.State.SUCCEEDED)
	//*  66  132:aload           18
	//*  67  134:getstatic       #134 <Field androidx.work.WorkInfo$State androidx.work.WorkInfo$State.SUCCEEDED>
	//*  68  137:if_acmpne       146
								i = 1;
	//   69  140:iconst_1        
	//   70  141:istore          5
							else
	//*  71  143:goto            149
								i = 0;
	//   72  146:iconst_0        
	//   73  147:istore          5
							k2 &= i;
	//   74  149:iload           11
	//   75  151:iload           5
	//   76  153:iand            
	//   77  154:istore          11
							if(obj == androidx.work.WorkInfo.State.FAILED)
	//*  78  156:aload           18
	//*  79  158:getstatic       #137 <Field androidx.work.WorkInfo$State androidx.work.WorkInfo$State.FAILED>
	//*  80  161:if_acmpne       170
							{
								i = 1;
	//   81  164:iconst_1        
	//   82  165:istore          5
							} else
	//*  83  167:goto            189
							{
								i = i1;
	//   84  170:iload           9
	//   85  172:istore          5
								if(obj == androidx.work.WorkInfo.State.CANCELLED)
	//*  86  174:aload           18
	//*  87  176:getstatic       #140 <Field androidx.work.WorkInfo$State androidx.work.WorkInfo$State.CANCELLED>
	//*  88  179:if_acmpne       189
								{
									l1 = 1;
	//   89  182:iconst_1        
	//   90  183:istore          10
									i = i1;
	//   91  185:iload           9
	//   92  187:istore          5
								}
							}
							l2++;
	//   93  189:iload           12
	//   94  191:iconst_1        
	//   95  192:iadd            
	//   96  193:istore          12
							i1 = i;
	//   97  195:iload           5
	//   98  197:istore          9
						} while(true);
	//   99  199:goto            52
					} else
					{
						j = 0;
	//  100  202:iconst_0        
	//  101  203:istore          6
						i = j;
	//  102  205:iload           6
	//  103  207:istore          5
						k = 1;
	//  104  209:iconst_1        
	//  105  210:istore          7
					}
					flag1 = TextUtils.isEmpty(((CharSequence) (s))) ^ true;
	//  106  212:aload_3         
	//  107  213:invokestatic    #146 <Method boolean TextUtils.isEmpty(CharSequence)>
	//  108  216:iconst_1        
	//  109  217:ixor            
	//  110  218:istore          11
					boolean flag;
					if(flag1 && l == 0)
	//* 111  220:iload           11
	//* 112  222:ifeq            236
	//* 113  225:iload           8
	//* 114  227:ifne            236
						flag = true;
	//  115  230:iconst_1        
	//  116  231:istore          9
					else
	//* 117  233:goto            239
						flag = false;
	//  118  236:iconst_0        
	//  119  237:istore          9
					if(!flag)
						break label1;
	//  120  239:iload           9
	//  121  241:ifeq            607
					obj1 = ((Object) (workdatabase.workSpecDao().getWorkSpecIdAndStatesForName(s)));
	//  122  244:aload           17
	//  123  246:invokevirtual   #101 <Method WorkSpecDao WorkDatabase.workSpecDao()>
	//  124  249:aload_3         
	//  125  250:invokeinterface #150 <Method List WorkSpecDao.getWorkSpecIdAndStatesForName(String)>
	//  126  255:astore          18
					if(((List) (obj1)).isEmpty())
						break label1;
	//  127  257:aload           18
	//  128  259:invokeinterface #155 <Method boolean List.isEmpty()>
	//  129  264:ifne            607
					if(existingworkpolicy == ExistingWorkPolicy.APPEND)
	//* 130  267:aload           4
	//* 131  269:getstatic       #161 <Field ExistingWorkPolicy ExistingWorkPolicy.APPEND>
	//* 132  272:if_acmpne       477
					{
						workmanagerimpl = ((WorkManagerImpl) (workdatabase.dependencyDao()));
	//  133  275:aload           17
	//  134  277:invokevirtual   #165 <Method DependencyDao WorkDatabase.dependencyDao()>
	//  135  280:astore_0        
						existingworkpolicy = ((ExistingWorkPolicy) (new ArrayList()));
	//  136  281:new             #167 <Class ArrayList>
	//  137  284:dup             
	//  138  285:invokespecial   #168 <Method void ArrayList()>
	//  139  288:astore          4
						for(obj1 = ((Object) (((List) (obj1)).iterator())); ((Iterator) (obj1)).hasNext();)
	//* 140  290:aload           18
	//* 141  292:invokeinterface #172 <Method Iterator List.iterator()>
	//* 142  297:astore          18
	//* 143  299:aload           18
	//* 144  301:invokeinterface #177 <Method boolean Iterator.hasNext()>
	//* 145  306:ifeq            445
						{
							androidx.work.impl.model.WorkSpec.IdAndState idandstate = (androidx.work.impl.model.WorkSpec.IdAndState)((Iterator) (obj1)).next();
	//  146  309:aload           18
	//  147  311:invokeinterface #181 <Method Object Iterator.next()>
	//  148  316:checkcast       #183 <Class androidx.work.impl.model.WorkSpec$IdAndState>
	//  149  319:astore          19
							int i2 = k;
	//  150  321:iload           7
	//  151  323:istore          10
							l = j;
	//  152  325:iload           6
	//  153  327:istore          8
							int j1 = i;
	//  154  329:iload           5
	//  155  331:istore          9
							if(!((DependencyDao) (workmanagerimpl)).hasDependents(idandstate.id))
	//* 156  333:aload_0         
	//* 157  334:aload           19
	//* 158  336:getfield        #186 <Field String androidx.work.impl.model.WorkSpec$IdAndState.id>
	//* 159  339:invokeinterface #192 <Method boolean DependencyDao.hasDependents(String)>
	//* 160  344:ifne            430
							{
								if(idandstate.state == androidx.work.WorkInfo.State.SUCCEEDED)
	//* 161  347:aload           19
	//* 162  349:getfield        #193 <Field androidx.work.WorkInfo$State androidx.work.impl.model.WorkSpec$IdAndState.state>
	//* 163  352:getstatic       #134 <Field androidx.work.WorkInfo$State androidx.work.WorkInfo$State.SUCCEEDED>
	//* 164  355:if_acmpne       364
									j1 = 1;
	//  165  358:iconst_1        
	//  166  359:istore          9
								else
	//* 167  361:goto            367
									j1 = 0;
	//  168  364:iconst_0        
	//  169  365:istore          9
								if(idandstate.state == androidx.work.WorkInfo.State.FAILED)
	//* 170  367:aload           19
	//* 171  369:getfield        #193 <Field androidx.work.WorkInfo$State androidx.work.impl.model.WorkSpec$IdAndState.state>
	//* 172  372:getstatic       #137 <Field androidx.work.WorkInfo$State androidx.work.WorkInfo$State.FAILED>
	//* 173  375:if_acmpne       384
								{
									l = 1;
	//  174  378:iconst_1        
	//  175  379:istore          8
								} else
	//* 176  381:goto            406
								{
									l = j;
	//  177  384:iload           6
	//  178  386:istore          8
									if(idandstate.state == androidx.work.WorkInfo.State.CANCELLED)
	//* 179  388:aload           19
	//* 180  390:getfield        #193 <Field androidx.work.WorkInfo$State androidx.work.impl.model.WorkSpec$IdAndState.state>
	//* 181  393:getstatic       #140 <Field androidx.work.WorkInfo$State androidx.work.WorkInfo$State.CANCELLED>
	//* 182  396:if_acmpne       406
									{
										i = 1;
	//  183  399:iconst_1        
	//  184  400:istore          5
										l = j;
	//  185  402:iload           6
	//  186  404:istore          8
									}
								}
								((List) (existingworkpolicy)).add(((Object) (idandstate.id)));
	//  187  406:aload           4
	//  188  408:aload           19
	//  189  410:getfield        #186 <Field String androidx.work.impl.model.WorkSpec$IdAndState.id>
	//  190  413:invokeinterface #197 <Method boolean List.add(Object)>
	//  191  418:pop             
								i2 = j1 & k;
	//  192  419:iload           9
	//  193  421:iload           7
	//  194  423:iand            
	//  195  424:istore          10
								j1 = i;
	//  196  426:iload           5
	//  197  428:istore          9
							}
							k = i2;
	//  198  430:iload           10
	//  199  432:istore          7
							j = l;
	//  200  434:iload           8
	//  201  436:istore          6
							i = j1;
	//  202  438:iload           9
	//  203  440:istore          5
						}

	//* 204  442:goto            299
						workmanagerimpl = ((WorkManagerImpl) ((String[])((List) (existingworkpolicy)).toArray(((Object []) (as)))));
	//  205  445:aload           4
	//  206  447:aload_2         
	//  207  448:invokeinterface #198 <Method Object[] List.toArray(Object[])>
	//  208  453:checkcast       #68  <Class String[]>
	//  209  456:astore_0        
						if(workmanagerimpl.length > 0)
	//* 210  457:aload_0         
	//* 211  458:arraylength     
	//* 212  459:ifle            468
							l = 1;
	//  213  462:iconst_1        
	//  214  463:istore          8
						else
	//* 215  465:goto            471
							l = 0;
	//  216  468:iconst_0        
	//  217  469:istore          8
						flag2 = false;
	//  218  471:iconst_0        
	//  219  472:istore          16
						break label0;
	//  220  474:goto            612
					}
					if(existingworkpolicy != ExistingWorkPolicy.KEEP)
						break label2;
	//  221  477:aload           4
	//  222  479:getstatic       #201 <Field ExistingWorkPolicy ExistingWorkPolicy.KEEP>
	//  223  482:if_acmpne       543
					existingworkpolicy = ((ExistingWorkPolicy) (((List) (obj1)).iterator()));
	//  224  485:aload           18
	//  225  487:invokeinterface #172 <Method Iterator List.iterator()>
	//  226  492:astore          4
					androidx.work.impl.model.WorkSpec.IdAndState idandstate1;
					do
					{
						if(!((Iterator) (existingworkpolicy)).hasNext())
							break label2;
	//  227  494:aload           4
	//  228  496:invokeinterface #177 <Method boolean Iterator.hasNext()>
	//  229  501:ifeq            540
						idandstate1 = (androidx.work.impl.model.WorkSpec.IdAndState)((Iterator) (existingworkpolicy)).next();
	//  230  504:aload           4
	//  231  506:invokeinterface #181 <Method Object Iterator.next()>
	//  232  511:checkcast       #183 <Class androidx.work.impl.model.WorkSpec$IdAndState>
	//  233  514:astore          19
					} while(idandstate1.state != androidx.work.WorkInfo.State.ENQUEUED && idandstate1.state != androidx.work.WorkInfo.State.RUNNING);
	//  234  516:aload           19
	//  235  518:getfield        #193 <Field androidx.work.WorkInfo$State androidx.work.impl.model.WorkSpec$IdAndState.state>
	//  236  521:getstatic       #204 <Field androidx.work.WorkInfo$State androidx.work.WorkInfo$State.ENQUEUED>
	//  237  524:if_acmpeq       538
	//  238  527:aload           19
	//  239  529:getfield        #193 <Field androidx.work.WorkInfo$State androidx.work.impl.model.WorkSpec$IdAndState.state>
	//  240  532:getstatic       #207 <Field androidx.work.WorkInfo$State androidx.work.WorkInfo$State.RUNNING>
	//  241  535:if_acmpne       494
					return false;
	//  242  538:iconst_0        
	//  243  539:ireturn         
				}
	//* 244  540:goto            543
				CancelWorkRunnable.forName(s, workmanagerimpl, false).run();
	//  245  543:aload_3         
	//  246  544:aload_0         
	//  247  545:iconst_0        
	//  248  546:invokestatic    #213 <Method CancelWorkRunnable CancelWorkRunnable.forName(String, WorkManagerImpl, boolean)>
	//  249  549:invokevirtual   #216 <Method void CancelWorkRunnable.run()>
				workmanagerimpl = ((WorkManagerImpl) (workdatabase.workSpecDao()));
	//  250  552:aload           17
	//  251  554:invokevirtual   #101 <Method WorkSpecDao WorkDatabase.workSpecDao()>
	//  252  557:astore_0        
				for(existingworkpolicy = ((ExistingWorkPolicy) (((List) (obj1)).iterator())); ((Iterator) (existingworkpolicy)).hasNext(); ((WorkSpecDao) (workmanagerimpl)).delete(((androidx.work.impl.model.WorkSpec.IdAndState)((Iterator) (existingworkpolicy)).next()).id));
	//  253  558:aload           18
	//  254  560:invokeinterface #172 <Method Iterator List.iterator()>
	//  255  565:astore          4
	//  256  567:aload           4
	//  257  569:invokeinterface #177 <Method boolean Iterator.hasNext()>
	//  258  574:ifeq            599
	//  259  577:aload_0         
	//  260  578:aload           4
	//  261  580:invokeinterface #181 <Method Object Iterator.next()>
	//  262  585:checkcast       #183 <Class androidx.work.impl.model.WorkSpec$IdAndState>
	//  263  588:getfield        #186 <Field String androidx.work.impl.model.WorkSpec$IdAndState.id>
	//  264  591:invokeinterface #220 <Method void WorkSpecDao.delete(String)>
	//* 265  596:goto            567
				flag2 = true;
	//  266  599:iconst_1        
	//  267  600:istore          16
				workmanagerimpl = ((WorkManagerImpl) (as));
	//  268  602:aload_2         
	//  269  603:astore_0        
				break label0;
	//  270  604:goto            612
			}
			flag2 = false;
	//  271  607:iconst_0        
	//  272  608:istore          16
			workmanagerimpl = ((WorkManagerImpl) (as));
	//  273  610:aload_2         
	//  274  611:astore_0        
		}
		list = ((List) (list.iterator()));
	//  275  612:aload_1         
	//  276  613:invokeinterface #172 <Method Iterator List.iterator()>
	//  277  618:astore_1        
		do
		{
			if(!((Iterator) (list)).hasNext())
				break;
	//  278  619:aload_1         
	//  279  620:invokeinterface #177 <Method boolean Iterator.hasNext()>
	//  280  625:ifeq            904
			as = ((String []) ((WorkRequest)((Iterator) (list)).next()));
	//  281  628:aload_1         
	//  282  629:invokeinterface #181 <Method Object Iterator.next()>
	//  283  634:checkcast       #222 <Class WorkRequest>
	//  284  637:astore_2        
			existingworkpolicy = ((ExistingWorkPolicy) (((WorkRequest) (as)).getWorkSpec()));
	//  285  638:aload_2         
	//  286  639:invokevirtual   #225 <Method WorkSpec WorkRequest.getWorkSpec()>
	//  287  642:astore          4
			if(l != 0 && k == 0)
	//* 288  644:iload           8
	//* 289  646:ifeq            697
	//* 290  649:iload           7
	//* 291  651:ifne            697
			{
				if(j != 0)
	//* 292  654:iload           6
	//* 293  656:ifeq            670
					existingworkpolicy.state = androidx.work.WorkInfo.State.FAILED;
	//  294  659:aload           4
	//  295  661:getstatic       #137 <Field androidx.work.WorkInfo$State androidx.work.WorkInfo$State.FAILED>
	//  296  664:putfield        #129 <Field androidx.work.WorkInfo$State WorkSpec.state>
				else
	//* 297  667:goto            704
				if(i != 0)
	//* 298  670:iload           5
	//* 299  672:ifeq            686
					existingworkpolicy.state = androidx.work.WorkInfo.State.CANCELLED;
	//  300  675:aload           4
	//  301  677:getstatic       #140 <Field androidx.work.WorkInfo$State androidx.work.WorkInfo$State.CANCELLED>
	//  302  680:putfield        #129 <Field androidx.work.WorkInfo$State WorkSpec.state>
				else
	//* 303  683:goto            704
					existingworkpolicy.state = androidx.work.WorkInfo.State.BLOCKED;
	//  304  686:aload           4
	//  305  688:getstatic       #228 <Field androidx.work.WorkInfo$State androidx.work.WorkInfo$State.BLOCKED>
	//  306  691:putfield        #129 <Field androidx.work.WorkInfo$State WorkSpec.state>
			} else
	//* 307  694:goto            704
			{
				existingworkpolicy.periodStartTime = l3;
	//  308  697:aload           4
	//  309  699:lload           14
	//  310  701:putfield        #232 <Field long WorkSpec.periodStartTime>
			}
			if(android.os.Build.VERSION.SDK_INT >= 23 && android.os.Build.VERSION.SDK_INT <= 25)
	//* 311  704:getstatic       #238 <Field int android.os.Build$VERSION.SDK_INT>
	//* 312  707:bipush          23
	//* 313  709:icmplt          725
	//* 314  712:getstatic       #238 <Field int android.os.Build$VERSION.SDK_INT>
	//* 315  715:bipush          25
	//* 316  717:icmpgt          725
				tryDelegateConstrainedWorkSpec(((WorkSpec) (existingworkpolicy)));
	//  317  720:aload           4
	//  318  722:invokestatic    #242 <Method void tryDelegateConstrainedWorkSpec(WorkSpec)>
			if(((WorkSpec) (existingworkpolicy)).state == androidx.work.WorkInfo.State.ENQUEUED)
	//* 319  725:aload           4
	//* 320  727:getfield        #129 <Field androidx.work.WorkInfo$State WorkSpec.state>
	//* 321  730:getstatic       #204 <Field androidx.work.WorkInfo$State androidx.work.WorkInfo$State.ENQUEUED>
	//* 322  733:if_acmpne       739
				flag2 = true;
	//  323  736:iconst_1        
	//  324  737:istore          16
			workdatabase.workSpecDao().insertWorkSpec(((WorkSpec) (existingworkpolicy)));
	//  325  739:aload           17
	//  326  741:invokevirtual   #101 <Method WorkSpecDao WorkDatabase.workSpecDao()>
	//  327  744:aload           4
	//  328  746:invokeinterface #245 <Method void WorkSpecDao.insertWorkSpec(WorkSpec)>
			if(l != 0)
	//* 329  751:iload           8
	//* 330  753:ifeq            815
			{
				int j2 = workmanagerimpl.length;
	//  331  756:aload_0         
	//  332  757:arraylength     
	//  333  758:istore          10
				for(int k1 = 0; k1 < j2; k1++)
	//* 334  760:iconst_0        
	//* 335  761:istore          9
	//* 336  763:iload           9
	//* 337  765:iload           10
	//* 338  767:icmpge          812
				{
					existingworkpolicy = ((ExistingWorkPolicy) (workmanagerimpl[k1]));
	//  339  770:aload_0         
	//  340  771:iload           9
	//  341  773:aaload          
	//  342  774:astore          4
					existingworkpolicy = ((ExistingWorkPolicy) (new Dependency(((WorkRequest) (as)).getStringId(), ((String) (existingworkpolicy)))));
	//  343  776:new             #247 <Class Dependency>
	//  344  779:dup             
	//  345  780:aload_2         
	//  346  781:invokevirtual   #250 <Method String WorkRequest.getStringId()>
	//  347  784:aload           4
	//  348  786:invokespecial   #253 <Method void Dependency(String, String)>
	//  349  789:astore          4
					workdatabase.dependencyDao().insertDependency(((Dependency) (existingworkpolicy)));
	//  350  791:aload           17
	//  351  793:invokevirtual   #165 <Method DependencyDao WorkDatabase.dependencyDao()>
	//  352  796:aload           4
	//  353  798:invokeinterface #257 <Method void DependencyDao.insertDependency(Dependency)>
				}

	//  354  803:iload           9
	//  355  805:iconst_1        
	//  356  806:iadd            
	//  357  807:istore          9
			}
	//* 358  809:goto            763
	//* 359  812:goto            815
			String s1;
			for(existingworkpolicy = ((ExistingWorkPolicy) (((WorkRequest) (as)).getTags().iterator())); ((Iterator) (existingworkpolicy)).hasNext(); workdatabase.workTagDao().insert(new WorkTag(s1, ((WorkRequest) (as)).getStringId())))
	//* 360  815:aload_2         
	//* 361  816:invokevirtual   #261 <Method Set WorkRequest.getTags()>
	//* 362  819:invokeinterface #262 <Method Iterator Set.iterator()>
	//* 363  824:astore          4
	//* 364  826:aload           4
	//* 365  828:invokeinterface #177 <Method boolean Iterator.hasNext()>
	//* 366  833:ifeq            874
				s1 = (String)((Iterator) (existingworkpolicy)).next();
	//  367  836:aload           4
	//  368  838:invokeinterface #181 <Method Object Iterator.next()>
	//  369  843:checkcast       #60  <Class String>
	//  370  846:astore          18

	//  371  848:aload           17
	//  372  850:invokevirtual   #266 <Method WorkTagDao WorkDatabase.workTagDao()>
	//  373  853:new             #268 <Class WorkTag>
	//  374  856:dup             
	//  375  857:aload           18
	//  376  859:aload_2         
	//  377  860:invokevirtual   #250 <Method String WorkRequest.getStringId()>
	//  378  863:invokespecial   #269 <Method void WorkTag(String, String)>
	//  379  866:invokeinterface #275 <Method void WorkTagDao.insert(WorkTag)>
	//* 380  871:goto            826
			if(flag1)
	//* 381  874:iload           11
	//* 382  876:ifeq            901
				workdatabase.workNameDao().insert(new WorkName(s, ((WorkRequest) (as)).getStringId()));
	//  383  879:aload           17
	//  384  881:invokevirtual   #279 <Method WorkNameDao WorkDatabase.workNameDao()>
	//  385  884:new             #281 <Class WorkName>
	//  386  887:dup             
	//  387  888:aload_3         
	//  388  889:aload_2         
	//  389  890:invokevirtual   #250 <Method String WorkRequest.getStringId()>
	//  390  893:invokespecial   #282 <Method void WorkName(String, String)>
	//  391  896:invokeinterface #287 <Method void WorkNameDao.insert(WorkName)>
		} while(true);
	//  392  901:goto            619
		return flag2;
	//  393  904:iload           16
	//  394  906:ireturn         
	}

	private static boolean processContinuation(WorkContinuationImpl workcontinuationimpl)
	{
		Object obj = ((Object) (workcontinuationimpl.getParents()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #293 <Method List WorkContinuationImpl.getParents()>
	//    2    4:astore_2        
		boolean flag = false;
	//    3    5:iconst_0        
	//    4    6:istore_1        
		if(obj != null)
	//*   5    7:aload_2         
	//*   6    8:ifnull          95
		{
			obj = ((Object) (((List) (obj)).iterator()));
	//    7   11:aload_2         
	//    8   12:invokeinterface #172 <Method Iterator List.iterator()>
	//    9   17:astore_2        
			flag = false;
	//   10   18:iconst_0        
	//   11   19:istore_1        
			while(((Iterator) (obj)).hasNext()) 
	//*  12   20:aload_2         
	//*  13   21:invokeinterface #177 <Method boolean Iterator.hasNext()>
	//*  14   26:ifeq            95
			{
				WorkContinuationImpl workcontinuationimpl1 = (WorkContinuationImpl)((Iterator) (obj)).next();
	//   15   29:aload_2         
	//   16   30:invokeinterface #181 <Method Object Iterator.next()>
	//   17   35:checkcast       #46  <Class WorkContinuationImpl>
	//   18   38:astore_3        
				if(!workcontinuationimpl1.isEnqueued())
	//*  19   39:aload_3         
	//*  20   40:invokevirtual   #296 <Method boolean WorkContinuationImpl.isEnqueued()>
	//*  21   43:ifne            56
					flag |= processContinuation(workcontinuationimpl1);
	//   22   46:iload_1         
	//   23   47:aload_3         
	//   24   48:invokestatic    #298 <Method boolean processContinuation(WorkContinuationImpl)>
	//   25   51:ior             
	//   26   52:istore_1        
				else
	//*  27   53:goto            20
					Logger.get().warning(TAG, String.format("Already enqueued work ids (%s).", new Object[] {
						TextUtils.join(", ", ((Iterable) (workcontinuationimpl1.getIds())))
					}), new Throwable[0]);
	//   28   56:invokestatic    #111 <Method Logger Logger.get()>
	//   29   59:getstatic       #28  <Field String TAG>
	//   30   62:ldc2            #300 <String "Already enqueued work ids (%s).">
	//   31   65:iconst_1        
	//   32   66:anewarray       Object[]
	//   33   69:dup             
	//   34   70:iconst_0        
	//   35   71:ldc2            #302 <String ", ">
	//   36   74:aload_3         
	//   37   75:invokevirtual   #305 <Method List WorkContinuationImpl.getIds()>
	//   38   78:invokestatic    #309 <Method String TextUtils.join(CharSequence, Iterable)>
	//   39   81:aastore         
	//   40   82:invokestatic    #117 <Method String String.format(String, Object[])>
	//   41   85:iconst_0        
	//   42   86:anewarray       Throwable[]
	//   43   89:invokevirtual   #312 <Method void Logger.warning(String, String, Throwable[])>
			}
		}
	//*  44   92:goto            20
		return enqueueContinuation(workcontinuationimpl) | flag;
	//   45   95:aload_0         
	//   46   96:invokestatic    #314 <Method boolean enqueueContinuation(WorkContinuationImpl)>
	//   47   99:iload_1         
	//   48  100:ior             
	//   49  101:ireturn         
	}

	private static void tryDelegateConstrainedWorkSpec(WorkSpec workspec)
	{
		Constraints constraints = workspec.constraints;
	//    0    0:aload_0         
	//    1    1:getfield        #318 <Field Constraints WorkSpec.constraints>
	//    2    4:astore_1        
		if(constraints.requiresBatteryNotLow() || constraints.requiresStorageNotLow())
	//*   3    5:aload_1         
	//*   4    6:invokevirtual   #323 <Method boolean Constraints.requiresBatteryNotLow()>
	//*   5    9:ifne            19
	//*   6   12:aload_1         
	//*   7   13:invokevirtual   #326 <Method boolean Constraints.requiresStorageNotLow()>
	//*   8   16:ifeq            66
		{
			String s = workspec.workerClassName;
	//    9   19:aload_0         
	//   10   20:getfield        #329 <Field String WorkSpec.workerClassName>
	//   11   23:astore_1        
			androidx.work.Data.Builder builder = new androidx.work.Data.Builder();
	//   12   24:new             #331 <Class androidx.work.Data$Builder>
	//   13   27:dup             
	//   14   28:invokespecial   #332 <Method void androidx.work.Data$Builder()>
	//   15   31:astore_2        
			builder.putAll(workspec.input).putString("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME", s);
	//   16   32:aload_2         
	//   17   33:aload_0         
	//   18   34:getfield        #336 <Field androidx.work.Data WorkSpec.input>
	//   19   37:invokevirtual   #340 <Method androidx.work.Data$Builder androidx.work.Data$Builder.putAll(androidx.work.Data)>
	//   20   40:ldc2            #342 <String "androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME">
	//   21   43:aload_1         
	//   22   44:invokevirtual   #346 <Method androidx.work.Data$Builder androidx.work.Data$Builder.putString(String, String)>
	//   23   47:pop             
			workspec.workerClassName = ((Class) (androidx/work/impl/workers/ConstraintTrackingWorker)).getName();
	//   24   48:aload_0         
	//   25   49:ldc2            #348 <Class ConstraintTrackingWorker>
	//   26   52:invokevirtual   #351 <Method String Class.getName()>
	//   27   55:putfield        #329 <Field String WorkSpec.workerClassName>
			workspec.input = builder.build();
	//   28   58:aload_0         
	//   29   59:aload_2         
	//   30   60:invokevirtual   #355 <Method androidx.work.Data androidx.work.Data$Builder.build()>
	//   31   63:putfield        #336 <Field androidx.work.Data WorkSpec.input>
		}
	//   32   66:return          
	}

	public boolean addToDatabase()
	{
		WorkDatabase workdatabase;
		workdatabase = mWorkContinuation.getWorkManagerImpl().getWorkDatabase();
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field WorkContinuationImpl mWorkContinuation>
	//    2    4:invokevirtual   #54  <Method WorkManagerImpl WorkContinuationImpl.getWorkManagerImpl()>
	//    3    7:invokevirtual   #95  <Method WorkDatabase WorkManagerImpl.getWorkDatabase()>
	//    4   10:astore_2        
		workdatabase.beginTransaction();
	//    5   11:aload_2         
	//    6   12:invokevirtual   #360 <Method void WorkDatabase.beginTransaction()>
		boolean flag;
		flag = processContinuation(mWorkContinuation);
	//    7   15:aload_0         
	//    8   16:getfield        #36  <Field WorkContinuationImpl mWorkContinuation>
	//    9   19:invokestatic    #298 <Method boolean processContinuation(WorkContinuationImpl)>
	//   10   22:istore_1        
		workdatabase.setTransactionSuccessful();
	//   11   23:aload_2         
	//   12   24:invokevirtual   #363 <Method void WorkDatabase.setTransactionSuccessful()>
		workdatabase.endTransaction();
	//   13   27:aload_2         
	//   14   28:invokevirtual   #366 <Method void WorkDatabase.endTransaction()>
		return flag;
	//   15   31:iload_1         
	//   16   32:ireturn         
		Exception exception;
		exception;
	//   17   33:astore_3        
		workdatabase.endTransaction();
	//   18   34:aload_2         
	//   19   35:invokevirtual   #366 <Method void WorkDatabase.endTransaction()>
		throw exception;
	//   20   38:aload_3         
	//   21   39:athrow          
	}

	public Operation getOperation()
	{
		return ((Operation) (mOperation));
	//    0    0:aload_0         
	//    1    1:getfield        #41  <Field OperationImpl mOperation>
	//    2    4:areturn         
	}

	public void run()
	{
		if(!mWorkContinuation.hasCycles())
	//*   0    0:aload_0         
	//*   1    1:getfield        #36  <Field WorkContinuationImpl mWorkContinuation>
	//*   2    4:invokevirtual   #372 <Method boolean WorkContinuationImpl.hasCycles()>
	//*   3    7:ifne            49
		{
			if(addToDatabase())
	//*   4   10:aload_0         
	//*   5   11:invokevirtual   #374 <Method boolean addToDatabase()>
	//*   6   14:ifeq            38
			{
				PackageManagerHelper.setComponentEnabled(mWorkContinuation.getWorkManagerImpl().getApplicationContext(), androidx/work/impl/background/systemalarm/RescheduleReceiver, true);
	//    7   17:aload_0         
	//    8   18:getfield        #36  <Field WorkContinuationImpl mWorkContinuation>
	//    9   21:invokevirtual   #54  <Method WorkManagerImpl WorkContinuationImpl.getWorkManagerImpl()>
	//   10   24:invokevirtual   #378 <Method android.content.Context WorkManagerImpl.getApplicationContext()>
	//   11   27:ldc2            #380 <Class RescheduleReceiver>
	//   12   30:iconst_1        
	//   13   31:invokestatic    #386 <Method void PackageManagerHelper.setComponentEnabled(android.content.Context, Class, boolean)>
				scheduleWorkInBackground();
	//   14   34:aload_0         
	//   15   35:invokevirtual   #389 <Method void scheduleWorkInBackground()>
			}
			mOperation.setState(((androidx.work.Operation.State) (Operation.SUCCESS)));
	//   16   38:aload_0         
	//   17   39:getfield        #41  <Field OperationImpl mOperation>
	//   18   42:getstatic       #395 <Field androidx.work.Operation$State$SUCCESS Operation.SUCCESS>
	//   19   45:invokevirtual   #399 <Method void OperationImpl.setState(androidx.work.Operation$State)>
			return;
	//   20   48:return          
		}
		try
		{
			throw new IllegalStateException(String.format("WorkContinuation has cycles (%s)", new Object[] {
				mWorkContinuation
			}));
	//   21   49:new             #401 <Class IllegalStateException>
	//   22   52:dup             
	//   23   53:ldc2            #403 <String "WorkContinuation has cycles (%s)">
	//   24   56:iconst_1        
	//   25   57:anewarray       Object[]
	//   26   60:dup             
	//   27   61:iconst_0        
	//   28   62:aload_0         
	//   29   63:getfield        #36  <Field WorkContinuationImpl mWorkContinuation>
	//   30   66:aastore         
	//   31   67:invokestatic    #117 <Method String String.format(String, Object[])>
	//   32   70:invokespecial   #405 <Method void IllegalStateException(String)>
	//   33   73:athrow          
		}
		catch(Throwable throwable)
	//*  34   74:astore_1        
		{
			mOperation.setState(((androidx.work.Operation.State) (new androidx.work.Operation.State.FAILURE(throwable))));
	//   35   75:aload_0         
	//   36   76:getfield        #41  <Field OperationImpl mOperation>
	//   37   79:new             #407 <Class androidx.work.Operation$State$FAILURE>
	//   38   82:dup             
	//   39   83:aload_1         
	//   40   84:invokespecial   #410 <Method void androidx.work.Operation$State$FAILURE(Throwable)>
	//   41   87:invokevirtual   #399 <Method void OperationImpl.setState(androidx.work.Operation$State)>
		}
		return;
	//   42   90:return          
	}

	public void scheduleWorkInBackground()
	{
		WorkManagerImpl workmanagerimpl = mWorkContinuation.getWorkManagerImpl();
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field WorkContinuationImpl mWorkContinuation>
	//    2    4:invokevirtual   #54  <Method WorkManagerImpl WorkContinuationImpl.getWorkManagerImpl()>
	//    3    7:astore_1        
		Schedulers.schedule(workmanagerimpl.getConfiguration(), workmanagerimpl.getWorkDatabase(), workmanagerimpl.getSchedulers());
	//    4    8:aload_1         
	//    5    9:invokevirtual   #414 <Method androidx.work.Configuration WorkManagerImpl.getConfiguration()>
	//    6   12:aload_1         
	//    7   13:invokevirtual   #95  <Method WorkDatabase WorkManagerImpl.getWorkDatabase()>
	//    8   16:aload_1         
	//    9   17:invokevirtual   #417 <Method List WorkManagerImpl.getSchedulers()>
	//   10   20:invokestatic    #423 <Method void Schedulers.schedule(androidx.work.Configuration, WorkDatabase, List)>
	//   11   23:return          
	}

	private static final String TAG = Logger.tagWithPrefix("EnqueueRunnable");
	private final OperationImpl mOperation = new OperationImpl();
	private final WorkContinuationImpl mWorkContinuation;

	static 
	{
	//    0    0:ldc1            #20  <String "EnqueueRunnable">
	//    1    2:invokestatic    #26  <Method String Logger.tagWithPrefix(String)>
	//    2    5:putstatic       #28  <Field String TAG>
	//*   3    8:return          
	}
}

// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package androidx.work.impl.utils;

import android.text.TextUtils;
import androidx.work.*;
import androidx.work.impl.*;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import androidx.work.impl.model.*;
import androidx.work.impl.utils.futures.SettableFuture;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.*;

// Referenced classes of package androidx.work.impl.utils:
//			CancelWorkRunnable, PackageManagerHelper

public class EnqueueRunnable
	implements Runnable
{

	public EnqueueRunnable(WorkContinuationImpl workcontinuationimpl)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #21  <Method void Object()>
		mWorkContinuation = workcontinuationimpl;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #23  <Field WorkContinuationImpl mWorkContinuation>
	//    5    9:aload_0         
	//    6   10:invokestatic    #29  <Method SettableFuture SettableFuture.create()>
	//    7   13:putfield        #31  <Field SettableFuture mFuture>
	//    8   16:return          
	}

	private static boolean enqueueContinuation(WorkContinuationImpl workcontinuationimpl)
	{
		Set set = WorkContinuationImpl.prerequisitesFor(workcontinuationimpl);
	//    0    0:aload_0         
	//    1    1:invokestatic    #41  <Method Set WorkContinuationImpl.prerequisitesFor(WorkContinuationImpl)>
	//    2    4:astore_2        
		boolean flag = enqueueWorkWithPrerequisites(workcontinuationimpl.getWorkManagerImpl(), workcontinuationimpl.getWork(), (String[])set.toArray(((Object []) (new String[0]))), workcontinuationimpl.getName(), workcontinuationimpl.getExistingWorkPolicy());
	//    3    5:aload_0         
	//    4    6:invokevirtual   #45  <Method WorkManagerImpl WorkContinuationImpl.getWorkManagerImpl()>
	//    5    9:aload_0         
	//    6   10:invokevirtual   #49  <Method List WorkContinuationImpl.getWork()>
	//    7   13:aload_2         
	//    8   14:iconst_0        
	//    9   15:anewarray       String[]
	//   10   18:invokeinterface #57  <Method Object[] Set.toArray(Object[])>
	//   11   23:checkcast       #59  <Class String[]>
	//   12   26:aload_0         
	//   13   27:invokevirtual   #63  <Method String WorkContinuationImpl.getName()>
	//   14   30:aload_0         
	//   15   31:invokevirtual   #67  <Method ExistingWorkPolicy WorkContinuationImpl.getExistingWorkPolicy()>
	//   16   34:invokestatic    #71  <Method boolean enqueueWorkWithPrerequisites(WorkManagerImpl, List, String[], String, ExistingWorkPolicy)>
	//   17   37:istore_1        
		workcontinuationimpl.markEnqueued();
	//   18   38:aload_0         
	//   19   39:invokevirtual   #74  <Method void WorkContinuationImpl.markEnqueued()>
		return flag;
	//   20   42:iload_1         
	//   21   43:ireturn         
	}

	private static boolean enqueueWorkWithPrerequisites(WorkManagerImpl workmanagerimpl, List list, String as[], String s, ExistingWorkPolicy existingworkpolicy)
	{
		boolean flag;
		boolean flag1;
		boolean flag2;
		boolean flag3;
		boolean flag10;
		long l1;
		boolean flag11;
		WorkDatabase workdatabase;
label0:
		{
label1:
			{
				Object obj1;
label2:
				{
					l1 = System.currentTimeMillis();
	//    0    0:invokestatic    #80  <Method long System.currentTimeMillis()>
	//    1    3:lstore          14
					workdatabase = workmanagerimpl.getWorkDatabase();
	//    2    5:aload_0         
	//    3    6:invokevirtual   #86  <Method WorkDatabase WorkManagerImpl.getWorkDatabase()>
	//    4    9:astore          17
					if(as != null && as.length > 0)
	//*   5   11:aload_2         
	//*   6   12:ifnull          26
	//*   7   15:aload_2         
	//*   8   16:arraylength     
	//*   9   17:ifle            26
						flag3 = true;
	//   10   20:iconst_1        
	//   11   21:istore          8
					else
	//*  12   23:goto            29
						flag3 = false;
	//   13   26:iconst_0        
	//   14   27:istore          8
					if(flag3)
	//*  15   29:iload           8
	//*  16   31:ifeq            196
					{
						int l = as.length;
	//   17   34:aload_2         
	//   18   35:arraylength     
	//   19   36:istore          13
						int k = 0;
	//   20   38:iconst_0        
	//   21   39:istore          12
						boolean flag9 = true;
	//   22   41:iconst_1        
	//   23   42:istore          11
						boolean flag4 = false;
	//   24   44:iconst_0        
	//   25   45:istore          9
						boolean flag7 = false;
	//   26   47:iconst_0        
	//   27   48:istore          10
						do
						{
							flag2 = flag9;
	//   28   50:iload           11
	//   29   52:istore          7
							flag1 = flag4;
	//   30   54:iload           9
	//   31   56:istore          6
							flag = flag7;
	//   32   58:iload           10
	//   33   60:istore          5
							if(k >= l)
								break;
	//   34   62:iload           12
	//   35   64:iload           13
	//   36   66:icmpge          205
							Object obj = ((Object) (as[k]));
	//   37   69:aload_2         
	//   38   70:iload           12
	//   39   72:aaload          
	//   40   73:astore          18
							WorkSpec workspec = workdatabase.workSpecDao().getWorkSpec(((String) (obj)));
	//   41   75:aload           17
	//   42   77:invokevirtual   #92  <Method WorkSpecDao WorkDatabase.workSpecDao()>
	//   43   80:aload           18
	//   44   82:invokeinterface #98  <Method WorkSpec WorkSpecDao.getWorkSpec(String)>
	//   45   87:astore          19
							if(workspec == null)
	//*  46   89:aload           19
	//*  47   91:ifnonnull       119
							{
								Logger.error("EnqueueRunnable", String.format("Prerequisite %s doesn't exist; not enqueuing", new Object[] {
									obj
								}), new Throwable[0]);
	//   48   94:ldc1            #100 <String "EnqueueRunnable">
	//   49   96:ldc1            #102 <String "Prerequisite %s doesn't exist; not enqueuing">
	//   50   98:iconst_1        
	//   51   99:anewarray       Object[]
	//   52  102:dup             
	//   53  103:iconst_0        
	//   54  104:aload           18
	//   55  106:aastore         
	//   56  107:invokestatic    #106 <Method String String.format(String, Object[])>
	//   57  110:iconst_0        
	//   58  111:anewarray       Throwable[]
	//   59  114:invokestatic    #114 <Method void Logger.error(String, String, Throwable[])>
								return false;
	//   60  117:iconst_0        
	//   61  118:ireturn         
							}
							obj = ((Object) (workspec.state));
	//   62  119:aload           19
	//   63  121:getfield        #120 <Field State WorkSpec.state>
	//   64  124:astore          18
							if(obj == State.SUCCEEDED)
	//*  65  126:aload           18
	//*  66  128:getstatic       #125 <Field State State.SUCCEEDED>
	//*  67  131:if_acmpne       140
								flag = true;
	//   68  134:iconst_1        
	//   69  135:istore          5
							else
	//*  70  137:goto            143
								flag = false;
	//   71  140:iconst_0        
	//   72  141:istore          5
							flag9 &= flag;
	//   73  143:iload           11
	//   74  145:iload           5
	//   75  147:iand            
	//   76  148:istore          11
							if(obj == State.FAILED)
	//*  77  150:aload           18
	//*  78  152:getstatic       #128 <Field State State.FAILED>
	//*  79  155:if_acmpne       164
							{
								flag = true;
	//   80  158:iconst_1        
	//   81  159:istore          5
							} else
	//*  82  161:goto            183
							{
								flag = flag4;
	//   83  164:iload           9
	//   84  166:istore          5
								if(obj == State.CANCELLED)
	//*  85  168:aload           18
	//*  86  170:getstatic       #131 <Field State State.CANCELLED>
	//*  87  173:if_acmpne       183
								{
									flag7 = true;
	//   88  176:iconst_1        
	//   89  177:istore          10
									flag = flag4;
	//   90  179:iload           9
	//   91  181:istore          5
								}
							}
							k++;
	//   92  183:iload           12
	//   93  185:iconst_1        
	//   94  186:iadd            
	//   95  187:istore          12
							flag4 = flag;
	//   96  189:iload           5
	//   97  191:istore          9
						} while(true);
	//   98  193:goto            50
					} else
					{
						flag2 = true;
	//   99  196:iconst_1        
	//  100  197:istore          7
						flag1 = false;
	//  101  199:iconst_0        
	//  102  200:istore          6
						flag = false;
	//  103  202:iconst_0        
	//  104  203:istore          5
					}
					flag10 = TextUtils.isEmpty(((CharSequence) (s))) ^ true;
	//  105  205:aload_3         
	//  106  206:invokestatic    #137 <Method boolean TextUtils.isEmpty(CharSequence)>
	//  107  209:iconst_1        
	//  108  210:ixor            
	//  109  211:istore          11
					boolean flag5;
					if(flag10 && !flag3)
	//* 110  213:iload           11
	//* 111  215:ifeq            229
	//* 112  218:iload           8
	//* 113  220:ifne            229
						flag5 = true;
	//  114  223:iconst_1        
	//  115  224:istore          9
					else
	//* 116  226:goto            232
						flag5 = false;
	//  117  229:iconst_0        
	//  118  230:istore          9
					if(!flag5)
						break label1;
	//  119  232:iload           9
	//  120  234:ifeq            600
					obj1 = ((Object) (workdatabase.workSpecDao().getWorkSpecIdAndStatesForName(s)));
	//  121  237:aload           17
	//  122  239:invokevirtual   #92  <Method WorkSpecDao WorkDatabase.workSpecDao()>
	//  123  242:aload_3         
	//  124  243:invokeinterface #141 <Method List WorkSpecDao.getWorkSpecIdAndStatesForName(String)>
	//  125  248:astore          18
					if(((List) (obj1)).isEmpty())
						break label1;
	//  126  250:aload           18
	//  127  252:invokeinterface #146 <Method boolean List.isEmpty()>
	//  128  257:ifne            600
					if(existingworkpolicy == ExistingWorkPolicy.APPEND)
	//* 129  260:aload           4
	//* 130  262:getstatic       #152 <Field ExistingWorkPolicy ExistingWorkPolicy.APPEND>
	//* 131  265:if_acmpne       470
					{
						workmanagerimpl = ((WorkManagerImpl) (workdatabase.dependencyDao()));
	//  132  268:aload           17
	//  133  270:invokevirtual   #156 <Method DependencyDao WorkDatabase.dependencyDao()>
	//  134  273:astore_0        
						existingworkpolicy = ((ExistingWorkPolicy) (new ArrayList()));
	//  135  274:new             #158 <Class ArrayList>
	//  136  277:dup             
	//  137  278:invokespecial   #159 <Method void ArrayList()>
	//  138  281:astore          4
						for(obj1 = ((Object) (((List) (obj1)).iterator())); ((Iterator) (obj1)).hasNext();)
	//* 139  283:aload           18
	//* 140  285:invokeinterface #163 <Method Iterator List.iterator()>
	//* 141  290:astore          18
	//* 142  292:aload           18
	//* 143  294:invokeinterface #168 <Method boolean Iterator.hasNext()>
	//* 144  299:ifeq            438
						{
							androidx.work.impl.model.WorkSpec.IdAndState idandstate = (androidx.work.impl.model.WorkSpec.IdAndState)((Iterator) (obj1)).next();
	//  145  302:aload           18
	//  146  304:invokeinterface #172 <Method Object Iterator.next()>
	//  147  309:checkcast       #174 <Class androidx.work.impl.model.WorkSpec$IdAndState>
	//  148  312:astore          19
							boolean flag8 = flag2;
	//  149  314:iload           7
	//  150  316:istore          10
							flag3 = flag1;
	//  151  318:iload           6
	//  152  320:istore          8
							boolean flag6 = flag;
	//  153  322:iload           5
	//  154  324:istore          9
							if(!((DependencyDao) (workmanagerimpl)).hasDependents(idandstate.id))
	//* 155  326:aload_0         
	//* 156  327:aload           19
	//* 157  329:getfield        #178 <Field String androidx.work.impl.model.WorkSpec$IdAndState.id>
	//* 158  332:invokeinterface #184 <Method boolean DependencyDao.hasDependents(String)>
	//* 159  337:ifne            423
							{
								if(idandstate.state == State.SUCCEEDED)
	//* 160  340:aload           19
	//* 161  342:getfield        #185 <Field State androidx.work.impl.model.WorkSpec$IdAndState.state>
	//* 162  345:getstatic       #125 <Field State State.SUCCEEDED>
	//* 163  348:if_acmpne       357
									flag6 = true;
	//  164  351:iconst_1        
	//  165  352:istore          9
								else
	//* 166  354:goto            360
									flag6 = false;
	//  167  357:iconst_0        
	//  168  358:istore          9
								if(idandstate.state == State.FAILED)
	//* 169  360:aload           19
	//* 170  362:getfield        #185 <Field State androidx.work.impl.model.WorkSpec$IdAndState.state>
	//* 171  365:getstatic       #128 <Field State State.FAILED>
	//* 172  368:if_acmpne       377
								{
									flag3 = true;
	//  173  371:iconst_1        
	//  174  372:istore          8
								} else
	//* 175  374:goto            399
								{
									flag3 = flag1;
	//  176  377:iload           6
	//  177  379:istore          8
									if(idandstate.state == State.CANCELLED)
	//* 178  381:aload           19
	//* 179  383:getfield        #185 <Field State androidx.work.impl.model.WorkSpec$IdAndState.state>
	//* 180  386:getstatic       #131 <Field State State.CANCELLED>
	//* 181  389:if_acmpne       399
									{
										flag = true;
	//  182  392:iconst_1        
	//  183  393:istore          5
										flag3 = flag1;
	//  184  395:iload           6
	//  185  397:istore          8
									}
								}
								((List) (existingworkpolicy)).add(((Object) (idandstate.id)));
	//  186  399:aload           4
	//  187  401:aload           19
	//  188  403:getfield        #178 <Field String androidx.work.impl.model.WorkSpec$IdAndState.id>
	//  189  406:invokeinterface #189 <Method boolean List.add(Object)>
	//  190  411:pop             
								flag8 = flag6 & flag2;
	//  191  412:iload           9
	//  192  414:iload           7
	//  193  416:iand            
	//  194  417:istore          10
								flag6 = flag;
	//  195  419:iload           5
	//  196  421:istore          9
							}
							flag2 = flag8;
	//  197  423:iload           10
	//  198  425:istore          7
							flag1 = flag3;
	//  199  427:iload           8
	//  200  429:istore          6
							flag = flag6;
	//  201  431:iload           9
	//  202  433:istore          5
						}

	//* 203  435:goto            292
						workmanagerimpl = ((WorkManagerImpl) ((String[])((List) (existingworkpolicy)).toArray(((Object []) (as)))));
	//  204  438:aload           4
	//  205  440:aload_2         
	//  206  441:invokeinterface #190 <Method Object[] List.toArray(Object[])>
	//  207  446:checkcast       #59  <Class String[]>
	//  208  449:astore_0        
						if(workmanagerimpl.length > 0)
	//* 209  450:aload_0         
	//* 210  451:arraylength     
	//* 211  452:ifle            461
							flag3 = true;
	//  212  455:iconst_1        
	//  213  456:istore          8
						else
	//* 214  458:goto            464
							flag3 = false;
	//  215  461:iconst_0        
	//  216  462:istore          8
						flag11 = false;
	//  217  464:iconst_0        
	//  218  465:istore          16
						break label0;
	//  219  467:goto            605
					}
					if(existingworkpolicy != ExistingWorkPolicy.KEEP)
						break label2;
	//  220  470:aload           4
	//  221  472:getstatic       #193 <Field ExistingWorkPolicy ExistingWorkPolicy.KEEP>
	//  222  475:if_acmpne       536
					existingworkpolicy = ((ExistingWorkPolicy) (((List) (obj1)).iterator()));
	//  223  478:aload           18
	//  224  480:invokeinterface #163 <Method Iterator List.iterator()>
	//  225  485:astore          4
					androidx.work.impl.model.WorkSpec.IdAndState idandstate1;
					do
					{
						if(!((Iterator) (existingworkpolicy)).hasNext())
							break label2;
	//  226  487:aload           4
	//  227  489:invokeinterface #168 <Method boolean Iterator.hasNext()>
	//  228  494:ifeq            533
						idandstate1 = (androidx.work.impl.model.WorkSpec.IdAndState)((Iterator) (existingworkpolicy)).next();
	//  229  497:aload           4
	//  230  499:invokeinterface #172 <Method Object Iterator.next()>
	//  231  504:checkcast       #174 <Class androidx.work.impl.model.WorkSpec$IdAndState>
	//  232  507:astore          19
					} while(idandstate1.state != State.ENQUEUED && idandstate1.state != State.RUNNING);
	//  233  509:aload           19
	//  234  511:getfield        #185 <Field State androidx.work.impl.model.WorkSpec$IdAndState.state>
	//  235  514:getstatic       #196 <Field State State.ENQUEUED>
	//  236  517:if_acmpeq       531
	//  237  520:aload           19
	//  238  522:getfield        #185 <Field State androidx.work.impl.model.WorkSpec$IdAndState.state>
	//  239  525:getstatic       #199 <Field State State.RUNNING>
	//  240  528:if_acmpne       487
					return false;
	//  241  531:iconst_0        
	//  242  532:ireturn         
				}
	//* 243  533:goto            536
				CancelWorkRunnable.forName(s, workmanagerimpl, false).run();
	//  244  536:aload_3         
	//  245  537:aload_0         
	//  246  538:iconst_0        
	//  247  539:invokestatic    #205 <Method CancelWorkRunnable CancelWorkRunnable.forName(String, WorkManagerImpl, boolean)>
	//  248  542:invokevirtual   #208 <Method void CancelWorkRunnable.run()>
				workmanagerimpl = ((WorkManagerImpl) (workdatabase.workSpecDao()));
	//  249  545:aload           17
	//  250  547:invokevirtual   #92  <Method WorkSpecDao WorkDatabase.workSpecDao()>
	//  251  550:astore_0        
				for(existingworkpolicy = ((ExistingWorkPolicy) (((List) (obj1)).iterator())); ((Iterator) (existingworkpolicy)).hasNext(); ((WorkSpecDao) (workmanagerimpl)).delete(((androidx.work.impl.model.WorkSpec.IdAndState)((Iterator) (existingworkpolicy)).next()).id));
	//  252  551:aload           18
	//  253  553:invokeinterface #163 <Method Iterator List.iterator()>
	//  254  558:astore          4
	//  255  560:aload           4
	//  256  562:invokeinterface #168 <Method boolean Iterator.hasNext()>
	//  257  567:ifeq            592
	//  258  570:aload_0         
	//  259  571:aload           4
	//  260  573:invokeinterface #172 <Method Object Iterator.next()>
	//  261  578:checkcast       #174 <Class androidx.work.impl.model.WorkSpec$IdAndState>
	//  262  581:getfield        #178 <Field String androidx.work.impl.model.WorkSpec$IdAndState.id>
	//  263  584:invokeinterface #212 <Method void WorkSpecDao.delete(String)>
	//* 264  589:goto            560
				flag11 = true;
	//  265  592:iconst_1        
	//  266  593:istore          16
				workmanagerimpl = ((WorkManagerImpl) (as));
	//  267  595:aload_2         
	//  268  596:astore_0        
				break label0;
	//  269  597:goto            605
			}
			flag11 = false;
	//  270  600:iconst_0        
	//  271  601:istore          16
			workmanagerimpl = ((WorkManagerImpl) (as));
	//  272  603:aload_2         
	//  273  604:astore_0        
		}
		list = ((List) (list.iterator()));
	//  274  605:aload_1         
	//  275  606:invokeinterface #163 <Method Iterator List.iterator()>
	//  276  611:astore_1        
		do
		{
			if(!((Iterator) (list)).hasNext())
				break;
	//  277  612:aload_1         
	//  278  613:invokeinterface #168 <Method boolean Iterator.hasNext()>
	//  279  618:ifeq            897
			as = ((String []) ((WorkRequest)((Iterator) (list)).next()));
	//  280  621:aload_1         
	//  281  622:invokeinterface #172 <Method Object Iterator.next()>
	//  282  627:checkcast       #214 <Class WorkRequest>
	//  283  630:astore_2        
			existingworkpolicy = ((ExistingWorkPolicy) (((WorkRequest) (as)).getWorkSpec()));
	//  284  631:aload_2         
	//  285  632:invokevirtual   #217 <Method WorkSpec WorkRequest.getWorkSpec()>
	//  286  635:astore          4
			if(flag3 && !flag2)
	//* 287  637:iload           8
	//* 288  639:ifeq            690
	//* 289  642:iload           7
	//* 290  644:ifne            690
			{
				if(flag1)
	//* 291  647:iload           6
	//* 292  649:ifeq            663
					existingworkpolicy.state = State.FAILED;
	//  293  652:aload           4
	//  294  654:getstatic       #128 <Field State State.FAILED>
	//  295  657:putfield        #120 <Field State WorkSpec.state>
				else
	//* 296  660:goto            697
				if(flag)
	//* 297  663:iload           5
	//* 298  665:ifeq            679
					existingworkpolicy.state = State.CANCELLED;
	//  299  668:aload           4
	//  300  670:getstatic       #131 <Field State State.CANCELLED>
	//  301  673:putfield        #120 <Field State WorkSpec.state>
				else
	//* 302  676:goto            697
					existingworkpolicy.state = State.BLOCKED;
	//  303  679:aload           4
	//  304  681:getstatic       #220 <Field State State.BLOCKED>
	//  305  684:putfield        #120 <Field State WorkSpec.state>
			} else
	//* 306  687:goto            697
			{
				existingworkpolicy.periodStartTime = l1;
	//  307  690:aload           4
	//  308  692:lload           14
	//  309  694:putfield        #224 <Field long WorkSpec.periodStartTime>
			}
			if(android.os.Build.VERSION.SDK_INT >= 23 && android.os.Build.VERSION.SDK_INT <= 25)
	//* 310  697:getstatic       #230 <Field int android.os.Build$VERSION.SDK_INT>
	//* 311  700:bipush          23
	//* 312  702:icmplt          718
	//* 313  705:getstatic       #230 <Field int android.os.Build$VERSION.SDK_INT>
	//* 314  708:bipush          25
	//* 315  710:icmpgt          718
				tryDelegateConstrainedWorkSpec(((WorkSpec) (existingworkpolicy)));
	//  316  713:aload           4
	//  317  715:invokestatic    #234 <Method void tryDelegateConstrainedWorkSpec(WorkSpec)>
			if(((WorkSpec) (existingworkpolicy)).state == State.ENQUEUED)
	//* 318  718:aload           4
	//* 319  720:getfield        #120 <Field State WorkSpec.state>
	//* 320  723:getstatic       #196 <Field State State.ENQUEUED>
	//* 321  726:if_acmpne       732
				flag11 = true;
	//  322  729:iconst_1        
	//  323  730:istore          16
			workdatabase.workSpecDao().insertWorkSpec(((WorkSpec) (existingworkpolicy)));
	//  324  732:aload           17
	//  325  734:invokevirtual   #92  <Method WorkSpecDao WorkDatabase.workSpecDao()>
	//  326  737:aload           4
	//  327  739:invokeinterface #237 <Method void WorkSpecDao.insertWorkSpec(WorkSpec)>
			if(flag3)
	//* 328  744:iload           8
	//* 329  746:ifeq            808
			{
				int j = workmanagerimpl.length;
	//  330  749:aload_0         
	//  331  750:arraylength     
	//  332  751:istore          10
				for(int i = 0; i < j; i++)
	//* 333  753:iconst_0        
	//* 334  754:istore          9
	//* 335  756:iload           9
	//* 336  758:iload           10
	//* 337  760:icmpge          805
				{
					existingworkpolicy = ((ExistingWorkPolicy) (workmanagerimpl[i]));
	//  338  763:aload_0         
	//  339  764:iload           9
	//  340  766:aaload          
	//  341  767:astore          4
					existingworkpolicy = ((ExistingWorkPolicy) (new Dependency(((WorkRequest) (as)).getStringId(), ((String) (existingworkpolicy)))));
	//  342  769:new             #239 <Class Dependency>
	//  343  772:dup             
	//  344  773:aload_2         
	//  345  774:invokevirtual   #242 <Method String WorkRequest.getStringId()>
	//  346  777:aload           4
	//  347  779:invokespecial   #245 <Method void Dependency(String, String)>
	//  348  782:astore          4
					workdatabase.dependencyDao().insertDependency(((Dependency) (existingworkpolicy)));
	//  349  784:aload           17
	//  350  786:invokevirtual   #156 <Method DependencyDao WorkDatabase.dependencyDao()>
	//  351  789:aload           4
	//  352  791:invokeinterface #249 <Method void DependencyDao.insertDependency(Dependency)>
				}

	//  353  796:iload           9
	//  354  798:iconst_1        
	//  355  799:iadd            
	//  356  800:istore          9
			}
	//* 357  802:goto            756
	//* 358  805:goto            808
			String s1;
			for(existingworkpolicy = ((ExistingWorkPolicy) (((WorkRequest) (as)).getTags().iterator())); ((Iterator) (existingworkpolicy)).hasNext(); workdatabase.workTagDao().insert(new WorkTag(s1, ((WorkRequest) (as)).getStringId())))
	//* 359  808:aload_2         
	//* 360  809:invokevirtual   #253 <Method Set WorkRequest.getTags()>
	//* 361  812:invokeinterface #254 <Method Iterator Set.iterator()>
	//* 362  817:astore          4
	//* 363  819:aload           4
	//* 364  821:invokeinterface #168 <Method boolean Iterator.hasNext()>
	//* 365  826:ifeq            867
				s1 = (String)((Iterator) (existingworkpolicy)).next();
	//  366  829:aload           4
	//  367  831:invokeinterface #172 <Method Object Iterator.next()>
	//  368  836:checkcast       #51  <Class String>
	//  369  839:astore          18

	//  370  841:aload           17
	//  371  843:invokevirtual   #258 <Method WorkTagDao WorkDatabase.workTagDao()>
	//  372  846:new             #260 <Class WorkTag>
	//  373  849:dup             
	//  374  850:aload           18
	//  375  852:aload_2         
	//  376  853:invokevirtual   #242 <Method String WorkRequest.getStringId()>
	//  377  856:invokespecial   #261 <Method void WorkTag(String, String)>
	//  378  859:invokeinterface #267 <Method void WorkTagDao.insert(WorkTag)>
	//* 379  864:goto            819
			if(flag10)
	//* 380  867:iload           11
	//* 381  869:ifeq            894
				workdatabase.workNameDao().insert(new WorkName(s, ((WorkRequest) (as)).getStringId()));
	//  382  872:aload           17
	//  383  874:invokevirtual   #271 <Method WorkNameDao WorkDatabase.workNameDao()>
	//  384  877:new             #273 <Class WorkName>
	//  385  880:dup             
	//  386  881:aload_3         
	//  387  882:aload_2         
	//  388  883:invokevirtual   #242 <Method String WorkRequest.getStringId()>
	//  389  886:invokespecial   #274 <Method void WorkName(String, String)>
	//  390  889:invokeinterface #279 <Method void WorkNameDao.insert(WorkName)>
		} while(true);
	//  391  894:goto            612
		return flag11;
	//  392  897:iload           16
	//  393  899:ireturn         
	}

	private static boolean processContinuation(WorkContinuationImpl workcontinuationimpl)
	{
		Object obj = ((Object) (workcontinuationimpl.getParents()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #285 <Method List WorkContinuationImpl.getParents()>
	//    2    4:astore_2        
		boolean flag = false;
	//    3    5:iconst_0        
	//    4    6:istore_1        
		if(obj != null)
	//*   5    7:aload_2         
	//*   6    8:ifnull          91
		{
			obj = ((Object) (((List) (obj)).iterator()));
	//    7   11:aload_2         
	//    8   12:invokeinterface #163 <Method Iterator List.iterator()>
	//    9   17:astore_2        
			flag = false;
	//   10   18:iconst_0        
	//   11   19:istore_1        
			while(((Iterator) (obj)).hasNext()) 
	//*  12   20:aload_2         
	//*  13   21:invokeinterface #168 <Method boolean Iterator.hasNext()>
	//*  14   26:ifeq            91
			{
				WorkContinuationImpl workcontinuationimpl1 = (WorkContinuationImpl)((Iterator) (obj)).next();
	//   15   29:aload_2         
	//   16   30:invokeinterface #172 <Method Object Iterator.next()>
	//   17   35:checkcast       #37  <Class WorkContinuationImpl>
	//   18   38:astore_3        
				if(!workcontinuationimpl1.isEnqueued())
	//*  19   39:aload_3         
	//*  20   40:invokevirtual   #288 <Method boolean WorkContinuationImpl.isEnqueued()>
	//*  21   43:ifne            56
					flag |= processContinuation(workcontinuationimpl1);
	//   22   46:iload_1         
	//   23   47:aload_3         
	//   24   48:invokestatic    #290 <Method boolean processContinuation(WorkContinuationImpl)>
	//   25   51:ior             
	//   26   52:istore_1        
				else
	//*  27   53:goto            20
					Logger.warning("EnqueueRunnable", String.format("Already enqueued work ids (%s).", new Object[] {
						TextUtils.join(", ", ((Iterable) (workcontinuationimpl1.getIds())))
					}), new Throwable[0]);
	//   28   56:ldc1            #100 <String "EnqueueRunnable">
	//   29   58:ldc2            #292 <String "Already enqueued work ids (%s).">
	//   30   61:iconst_1        
	//   31   62:anewarray       Object[]
	//   32   65:dup             
	//   33   66:iconst_0        
	//   34   67:ldc2            #294 <String ", ">
	//   35   70:aload_3         
	//   36   71:invokevirtual   #297 <Method List WorkContinuationImpl.getIds()>
	//   37   74:invokestatic    #301 <Method String TextUtils.join(CharSequence, Iterable)>
	//   38   77:aastore         
	//   39   78:invokestatic    #106 <Method String String.format(String, Object[])>
	//   40   81:iconst_0        
	//   41   82:anewarray       Throwable[]
	//   42   85:invokestatic    #304 <Method void Logger.warning(String, String, Throwable[])>
			}
		}
	//*  43   88:goto            20
		return enqueueContinuation(workcontinuationimpl) | flag;
	//   44   91:aload_0         
	//   45   92:invokestatic    #306 <Method boolean enqueueContinuation(WorkContinuationImpl)>
	//   46   95:iload_1         
	//   47   96:ior             
	//   48   97:ireturn         
	}

	private static void tryDelegateConstrainedWorkSpec(WorkSpec workspec)
	{
		Constraints constraints = workspec.constraints;
	//    0    0:aload_0         
	//    1    1:getfield        #310 <Field Constraints WorkSpec.constraints>
	//    2    4:astore_1        
		if(constraints.requiresBatteryNotLow() || constraints.requiresStorageNotLow())
	//*   3    5:aload_1         
	//*   4    6:invokevirtual   #315 <Method boolean Constraints.requiresBatteryNotLow()>
	//*   5    9:ifne            19
	//*   6   12:aload_1         
	//*   7   13:invokevirtual   #318 <Method boolean Constraints.requiresStorageNotLow()>
	//*   8   16:ifeq            66
		{
			String s = workspec.workerClassName;
	//    9   19:aload_0         
	//   10   20:getfield        #321 <Field String WorkSpec.workerClassName>
	//   11   23:astore_1        
			androidx.work.Data.Builder builder = new androidx.work.Data.Builder();
	//   12   24:new             #323 <Class androidx.work.Data$Builder>
	//   13   27:dup             
	//   14   28:invokespecial   #324 <Method void androidx.work.Data$Builder()>
	//   15   31:astore_2        
			builder.putAll(workspec.input).putString("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME", s);
	//   16   32:aload_2         
	//   17   33:aload_0         
	//   18   34:getfield        #328 <Field androidx.work.Data WorkSpec.input>
	//   19   37:invokevirtual   #332 <Method androidx.work.Data$Builder androidx.work.Data$Builder.putAll(androidx.work.Data)>
	//   20   40:ldc2            #334 <String "androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME">
	//   21   43:aload_1         
	//   22   44:invokevirtual   #338 <Method androidx.work.Data$Builder androidx.work.Data$Builder.putString(String, String)>
	//   23   47:pop             
			workspec.workerClassName = ((Class) (androidx/work/impl/workers/ConstraintTrackingWorker)).getName();
	//   24   48:aload_0         
	//   25   49:ldc2            #340 <Class ConstraintTrackingWorker>
	//   26   52:invokevirtual   #343 <Method String Class.getName()>
	//   27   55:putfield        #321 <Field String WorkSpec.workerClassName>
			workspec.input = builder.build();
	//   28   58:aload_0         
	//   29   59:aload_2         
	//   30   60:invokevirtual   #347 <Method androidx.work.Data androidx.work.Data$Builder.build()>
	//   31   63:putfield        #328 <Field androidx.work.Data WorkSpec.input>
		}
	//   32   66:return          
	}

	public boolean addToDatabase()
	{
		WorkDatabase workdatabase;
		workdatabase = mWorkContinuation.getWorkManagerImpl().getWorkDatabase();
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field WorkContinuationImpl mWorkContinuation>
	//    2    4:invokevirtual   #45  <Method WorkManagerImpl WorkContinuationImpl.getWorkManagerImpl()>
	//    3    7:invokevirtual   #86  <Method WorkDatabase WorkManagerImpl.getWorkDatabase()>
	//    4   10:astore_2        
		workdatabase.beginTransaction();
	//    5   11:aload_2         
	//    6   12:invokevirtual   #352 <Method void WorkDatabase.beginTransaction()>
		boolean flag;
		flag = processContinuation(mWorkContinuation);
	//    7   15:aload_0         
	//    8   16:getfield        #23  <Field WorkContinuationImpl mWorkContinuation>
	//    9   19:invokestatic    #290 <Method boolean processContinuation(WorkContinuationImpl)>
	//   10   22:istore_1        
		workdatabase.setTransactionSuccessful();
	//   11   23:aload_2         
	//   12   24:invokevirtual   #355 <Method void WorkDatabase.setTransactionSuccessful()>
		workdatabase.endTransaction();
	//   13   27:aload_2         
	//   14   28:invokevirtual   #358 <Method void WorkDatabase.endTransaction()>
		return flag;
	//   15   31:iload_1         
	//   16   32:ireturn         
		Exception exception;
		exception;
	//   17   33:astore_3        
		workdatabase.endTransaction();
	//   18   34:aload_2         
	//   19   35:invokevirtual   #358 <Method void WorkDatabase.endTransaction()>
		throw exception;
	//   20   38:aload_3         
	//   21   39:athrow          
	}

	public ListenableFuture getFuture()
	{
		return ((ListenableFuture) (mFuture));
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field SettableFuture mFuture>
	//    2    4:areturn         
	}

	public void run()
	{
		if(!mWorkContinuation.hasCycles())
	//*   0    0:aload_0         
	//*   1    1:getfield        #23  <Field WorkContinuationImpl mWorkContinuation>
	//*   2    4:invokevirtual   #365 <Method boolean WorkContinuationImpl.hasCycles()>
	//*   3    7:ifne            48
		{
			if(addToDatabase())
	//*   4   10:aload_0         
	//*   5   11:invokevirtual   #367 <Method boolean addToDatabase()>
	//*   6   14:ifeq            38
			{
				PackageManagerHelper.setComponentEnabled(mWorkContinuation.getWorkManagerImpl().getApplicationContext(), androidx/work/impl/background/systemalarm/RescheduleReceiver, true);
	//    7   17:aload_0         
	//    8   18:getfield        #23  <Field WorkContinuationImpl mWorkContinuation>
	//    9   21:invokevirtual   #45  <Method WorkManagerImpl WorkContinuationImpl.getWorkManagerImpl()>
	//   10   24:invokevirtual   #371 <Method android.content.Context WorkManagerImpl.getApplicationContext()>
	//   11   27:ldc2            #373 <Class RescheduleReceiver>
	//   12   30:iconst_1        
	//   13   31:invokestatic    #379 <Method void PackageManagerHelper.setComponentEnabled(android.content.Context, Class, boolean)>
				scheduleWorkInBackground();
	//   14   34:aload_0         
	//   15   35:invokevirtual   #382 <Method void scheduleWorkInBackground()>
			}
			mFuture.set(((Object) (null)));
	//   16   38:aload_0         
	//   17   39:getfield        #31  <Field SettableFuture mFuture>
	//   18   42:aconst_null     
	//   19   43:invokevirtual   #385 <Method boolean SettableFuture.set(Object)>
	//   20   46:pop             
			return;
	//   21   47:return          
		}
		try
		{
			throw new IllegalStateException(String.format("WorkContinuation has cycles (%s)", new Object[] {
				mWorkContinuation
			}));
	//   22   48:new             #387 <Class IllegalStateException>
	//   23   51:dup             
	//   24   52:ldc2            #389 <String "WorkContinuation has cycles (%s)">
	//   25   55:iconst_1        
	//   26   56:anewarray       Object[]
	//   27   59:dup             
	//   28   60:iconst_0        
	//   29   61:aload_0         
	//   30   62:getfield        #23  <Field WorkContinuationImpl mWorkContinuation>
	//   31   65:aastore         
	//   32   66:invokestatic    #106 <Method String String.format(String, Object[])>
	//   33   69:invokespecial   #391 <Method void IllegalStateException(String)>
	//   34   72:athrow          
		}
		catch(Throwable throwable)
	//*  35   73:astore_1        
		{
			mFuture.setException(throwable);
	//   36   74:aload_0         
	//   37   75:getfield        #31  <Field SettableFuture mFuture>
	//   38   78:aload_1         
	//   39   79:invokevirtual   #395 <Method boolean SettableFuture.setException(Throwable)>
	//   40   82:pop             
		}
		return;
	//   41   83:return          
	}

	public void scheduleWorkInBackground()
	{
		WorkManagerImpl workmanagerimpl = mWorkContinuation.getWorkManagerImpl();
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field WorkContinuationImpl mWorkContinuation>
	//    2    4:invokevirtual   #45  <Method WorkManagerImpl WorkContinuationImpl.getWorkManagerImpl()>
	//    3    7:astore_1        
		Schedulers.schedule(workmanagerimpl.getConfiguration(), workmanagerimpl.getWorkDatabase(), workmanagerimpl.getSchedulers());
	//    4    8:aload_1         
	//    5    9:invokevirtual   #399 <Method androidx.work.Configuration WorkManagerImpl.getConfiguration()>
	//    6   12:aload_1         
	//    7   13:invokevirtual   #86  <Method WorkDatabase WorkManagerImpl.getWorkDatabase()>
	//    8   16:aload_1         
	//    9   17:invokevirtual   #402 <Method List WorkManagerImpl.getSchedulers()>
	//   10   20:invokestatic    #408 <Method void Schedulers.schedule(androidx.work.Configuration, WorkDatabase, List)>
	//   11   23:return          
	}

	private final SettableFuture mFuture = SettableFuture.create();
	private final WorkContinuationImpl mWorkContinuation;
}

// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.firebase.client.core;

import com.firebase.client.*;
import com.firebase.client.core.utilities.Tree;
import com.firebase.client.core.view.QuerySpec;
import com.firebase.client.snapshot.IndexedNode;
import java.util.*;

// Referenced classes of package com.firebase.client.core:
//			Repo, SyncTree, ValueEventRegistration, Path

class Repo$15
	implements com.firebase.client..CompletionListener
{

	public void onComplete(FirebaseError firebaseerror, Firebase firebase)
	{
		Repo.access$500(Repo.this, "Transaction", val$path, firebaseerror);
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field Repo this$0>
	//    2    4:ldc1            #38  <String "Transaction">
	//    3    6:aload_0         
	//    4    7:getfield        #26  <Field Path val$path>
	//    5   10:aload_1         
	//    6   11:invokestatic    #42  <Method void Repo.access$500(Repo, String, Path, FirebaseError)>
		firebase = ((Firebase) (new ArrayList()));
	//    7   14:new             #44  <Class ArrayList>
	//    8   17:dup             
	//    9   18:invokespecial   #45  <Method void ArrayList()>
	//   10   21:astore_2        
		if(firebaseerror == null)
	//*  11   22:aload_1         
	//*  12   23:ifnonnull       269
		{
			firebaseerror = ((FirebaseError) (new ArrayList()));
	//   13   26:new             #44  <Class ArrayList>
	//   14   29:dup             
	//   15   30:invokespecial   #45  <Method void ArrayList()>
	//   16   33:astore_1        
			final nsactionData txn;
			Object obj;
			for(Iterator iterator = val$queue.iterator(); iterator.hasNext(); ((Repo) (obj)).removeEventCallback(((EventRegistration) (new ValueEventRegistration(((Repo) (obj)), nsactionData.access._mth2200(txn), QuerySpec.defaultQueryAtPath(nsactionData.access._mth1900(txn)))))))
	//*  17   34:aload_0         
	//*  18   35:getfield        #28  <Field List val$queue>
	//*  19   38:invokeinterface #51  <Method Iterator List.iterator()>
	//*  20   43:astore          4
	//*  21   45:aload           4
	//*  22   47:invokeinterface #57  <Method boolean Iterator.hasNext()>
	//*  23   52:ifeq            195
			{
				txn = (nsactionData)iterator.next();
	//   24   55:aload           4
	//   25   57:invokeinterface #61  <Method Object Iterator.next()>
	//   26   62:checkcast       #63  <Class Repo$TransactionData>
	//   27   65:astore          5
				nsactionData.access._mth1502(txn, nsactionStatus.COMPLETED);
	//   28   67:aload           5
	//   29   69:getstatic       #69  <Field Repo$TransactionStatus Repo$TransactionStatus.COMPLETED>
	//   30   72:invokestatic    #73  <Method Repo$TransactionStatus Repo$TransactionData.access$1502(Repo$TransactionData, Repo$TransactionStatus)>
	//   31   75:pop             
				((List) (firebase)).addAll(((java.util.Collection) (Repo.access$800(Repo.this).ackUserWrite(nsactionData.access._mth1600(txn), false, false, ((com.firebase.client.utilities.Clock) (Repo.access$2000(Repo.this)))))));
	//   32   76:aload_2         
	//   33   77:aload_0         
	//   34   78:getfield        #24  <Field Repo this$0>
	//   35   81:invokestatic    #77  <Method SyncTree Repo.access$800(Repo)>
	//   36   84:aload           5
	//   37   86:invokestatic    #81  <Method long Repo$TransactionData.access$1600(Repo$TransactionData)>
	//   38   89:iconst_0        
	//   39   90:iconst_0        
	//   40   91:aload_0         
	//   41   92:getfield        #24  <Field Repo this$0>
	//   42   95:invokestatic    #85  <Method com.firebase.client.utilities.OffsetClock Repo.access$2000(Repo)>
	//   43   98:invokevirtual   #91  <Method List SyncTree.ackUserWrite(long, boolean, boolean, com.firebase.client.utilities.Clock)>
	//   44  101:invokeinterface #95  <Method boolean List.addAll(java.util.Collection)>
	//   45  106:pop             
				obj = ((Object) (nsactionData.access._mth1400(txn)));
	//   46  107:aload           5
	//   47  109:invokestatic    #99  <Method com.firebase.client.snapshot.Node Repo$TransactionData.access$1400(Repo$TransactionData)>
	//   48  112:astore          6
				((List) (firebaseerror)).add(((Object) (new Runnable() {

					public void run()
					{
						Repo.TransactionData.access$2100(txn).onComplete(((FirebaseError) (null)), true, snap);
					//    0    0:aload_0         
					//    1    1:getfield        #23  <Field Repo$TransactionData val$txn>
					//    2    4:invokestatic    #36  <Method com.firebase.client.Transaction$Handler Repo$TransactionData.access$2100(Repo$TransactionData)>
					//    3    7:aconst_null     
					//    4    8:iconst_1        
					//    5    9:aload_0         
					//    6   10:getfield        #25  <Field DataSnapshot val$snap>
					//    7   13:invokeinterface #41  <Method void com.firebase.client.Transaction$Handler.onComplete(FirebaseError, boolean, DataSnapshot)>
					//    8   18:return          
					}

					final Repo._cls15 this$1;
					final DataSnapshot val$snap;
					final Repo.TransactionData val$txn;

			
			{
				this$1 = Repo._cls15.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #21  <Field Repo$15 this$1>
				txn = transactiondata;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #23  <Field Repo$TransactionData val$txn>
				snap = datasnapshot;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #25  <Field DataSnapshot val$snap>
				super();
			//    9   15:aload_0         
			//   10   16:invokespecial   #28  <Method void Object()>
			//   11   19:return          
			}
				}
)));
	//   49  114:aload_1         
	//   50  115:new             #13  <Class Repo$15$1>
	//   51  118:dup             
	//   52  119:aload_0         
	//   53  120:aload           5
	//   54  122:new             #101 <Class DataSnapshot>
	//   55  125:dup             
	//   56  126:new             #103 <Class Firebase>
	//   57  129:dup             
	//   58  130:aload_0         
	//   59  131:getfield        #30  <Field Repo val$repo>
	//   60  134:aload           5
	//   61  136:invokestatic    #107 <Method Path Repo$TransactionData.access$1900(Repo$TransactionData)>
	//   62  139:invokespecial   #110 <Method void Firebase(Repo, Path)>
	//   63  142:aload           6
	//   64  144:invokestatic    #116 <Method IndexedNode IndexedNode.from(com.firebase.client.snapshot.Node)>
	//   65  147:invokespecial   #119 <Method void DataSnapshot(Firebase, IndexedNode)>
	//   66  150:invokespecial   #122 <Method void Repo$15$1(Repo$15, Repo$TransactionData, DataSnapshot)>
	//   67  153:invokeinterface #126 <Method boolean List.add(Object)>
	//   68  158:pop             
				obj = ((Object) (Repo.this));
	//   69  159:aload_0         
	//   70  160:getfield        #24  <Field Repo this$0>
	//   71  163:astore          6
			}

	//   72  165:aload           6
	//   73  167:new             #128 <Class ValueEventRegistration>
	//   74  170:dup             
	//   75  171:aload           6
	//   76  173:aload           5
	//   77  175:invokestatic    #132 <Method com.firebase.client.ValueEventListener Repo$TransactionData.access$2200(Repo$TransactionData)>
	//   78  178:aload           5
	//   79  180:invokestatic    #107 <Method Path Repo$TransactionData.access$1900(Repo$TransactionData)>
	//   80  183:invokestatic    #138 <Method QuerySpec QuerySpec.defaultQueryAtPath(Path)>
	//   81  186:invokespecial   #141 <Method void ValueEventRegistration(Repo, com.firebase.client.ValueEventListener, QuerySpec)>
	//   82  189:invokevirtual   #145 <Method void Repo.removeEventCallback(EventRegistration)>
	//*  83  192:goto            45
			Repo repo1 = Repo.this;
	//   84  195:aload_0         
	//   85  196:getfield        #24  <Field Repo this$0>
	//   86  199:astore          4
			Repo.access$2400(repo1, Repo.access$2300(repo1).subTree(val$path));
	//   87  201:aload           4
	//   88  203:aload           4
	//   89  205:invokestatic    #149 <Method Tree Repo.access$2300(Repo)>
	//   90  208:aload_0         
	//   91  209:getfield        #26  <Field Path val$path>
	//   92  212:invokevirtual   #155 <Method Tree Tree.subTree(Path)>
	//   93  215:invokestatic    #159 <Method void Repo.access$2400(Repo, Tree)>
			Repo.access$2500(Repo.this);
	//   94  218:aload_0         
	//   95  219:getfield        #24  <Field Repo this$0>
	//   96  222:invokestatic    #163 <Method void Repo.access$2500(Repo)>
			Repo.access$300(val$repo, ((List) (firebase)));
	//   97  225:aload_0         
	//   98  226:getfield        #30  <Field Repo val$repo>
	//   99  229:aload_2         
	//  100  230:invokestatic    #167 <Method void Repo.access$300(Repo, List)>
			for(int i = 0; i < ((List) (firebaseerror)).size(); i++)
	//* 101  233:iconst_0        
	//* 102  234:istore_3        
	//* 103  235:iload_3         
	//* 104  236:aload_1         
	//* 105  237:invokeinterface #171 <Method int List.size()>
	//* 106  242:icmpge          399
				postEvent((Runnable)((List) (firebaseerror)).get(i));
	//  107  245:aload_0         
	//  108  246:getfield        #24  <Field Repo this$0>
	//  109  249:aload_1         
	//  110  250:iload_3         
	//  111  251:invokeinterface #175 <Method Object List.get(int)>
	//  112  256:checkcast       #177 <Class Runnable>
	//  113  259:invokevirtual   #181 <Method void Repo.postEvent(Runnable)>

	//  114  262:iload_3         
	//  115  263:iconst_1        
	//  116  264:iadd            
	//  117  265:istore_3        
		} else
	//* 118  266:goto            235
		{
			if(firebaseerror.getCode() == -1)
	//* 119  269:aload_1         
	//* 120  270:invokevirtual   #186 <Method int FirebaseError.getCode()>
	//* 121  273:iconst_m1       
	//* 122  274:icmpne          338
			{
				for(firebaseerror = ((FirebaseError) (val$queue.iterator())); ((Iterator) (firebaseerror)).hasNext();)
	//* 123  277:aload_0         
	//* 124  278:getfield        #28  <Field List val$queue>
	//* 125  281:invokeinterface #51  <Method Iterator List.iterator()>
	//* 126  286:astore_1        
	//* 127  287:aload_1         
	//* 128  288:invokeinterface #57  <Method boolean Iterator.hasNext()>
	//* 129  293:ifeq            387
				{
					firebase = ((Firebase) ((nsactionData)((Iterator) (firebaseerror)).next()));
	//  130  296:aload_1         
	//  131  297:invokeinterface #61  <Method Object Iterator.next()>
	//  132  302:checkcast       #63  <Class Repo$TransactionData>
	//  133  305:astore_2        
					if(nsactionData.access._mth1500(((nsactionData) (firebase))) == nsactionStatus.SENT_NEEDS_ABORT)
	//* 134  306:aload_2         
	//* 135  307:invokestatic    #190 <Method Repo$TransactionStatus Repo$TransactionData.access$1500(Repo$TransactionData)>
	//* 136  310:getstatic       #193 <Field Repo$TransactionStatus Repo$TransactionStatus.SENT_NEEDS_ABORT>
	//* 137  313:if_acmpne       327
						nsactionData.access._mth1502(((nsactionData) (firebase)), nsactionStatus.NEEDS_ABORT);
	//  138  316:aload_2         
	//  139  317:getstatic       #196 <Field Repo$TransactionStatus Repo$TransactionStatus.NEEDS_ABORT>
	//  140  320:invokestatic    #73  <Method Repo$TransactionStatus Repo$TransactionData.access$1502(Repo$TransactionData, Repo$TransactionStatus)>
	//  141  323:pop             
					else
	//* 142  324:goto            287
						nsactionData.access._mth1502(((nsactionData) (firebase)), nsactionStatus.RUN);
	//  143  327:aload_2         
	//  144  328:getstatic       #199 <Field Repo$TransactionStatus Repo$TransactionStatus.RUN>
	//  145  331:invokestatic    #73  <Method Repo$TransactionStatus Repo$TransactionData.access$1502(Repo$TransactionData, Repo$TransactionStatus)>
	//  146  334:pop             
				}

			} else
	//* 147  335:goto            287
			{
				nsactionData nsactiondata;
				for(firebase = ((Firebase) (val$queue.iterator())); ((Iterator) (firebase)).hasNext(); nsactionData.access._mth2602(nsactiondata, firebaseerror))
	//* 148  338:aload_0         
	//* 149  339:getfield        #28  <Field List val$queue>
	//* 150  342:invokeinterface #51  <Method Iterator List.iterator()>
	//* 151  347:astore_2        
	//* 152  348:aload_2         
	//* 153  349:invokeinterface #57  <Method boolean Iterator.hasNext()>
	//* 154  354:ifeq            387
				{
					nsactiondata = (nsactionData)((Iterator) (firebase)).next();
	//  155  357:aload_2         
	//  156  358:invokeinterface #61  <Method Object Iterator.next()>
	//  157  363:checkcast       #63  <Class Repo$TransactionData>
	//  158  366:astore          4
					nsactionData.access._mth1502(nsactiondata, nsactionStatus.NEEDS_ABORT);
	//  159  368:aload           4
	//  160  370:getstatic       #196 <Field Repo$TransactionStatus Repo$TransactionStatus.NEEDS_ABORT>
	//  161  373:invokestatic    #73  <Method Repo$TransactionStatus Repo$TransactionData.access$1502(Repo$TransactionData, Repo$TransactionStatus)>
	//  162  376:pop             
				}

	//  163  377:aload           4
	//  164  379:aload_1         
	//  165  380:invokestatic    #203 <Method FirebaseError Repo$TransactionData.access$2602(Repo$TransactionData, FirebaseError)>
	//  166  383:pop             
			}
	//* 167  384:goto            348
			Repo.access$1000(Repo.this, val$path);
	//  168  387:aload_0         
	//  169  388:getfield        #24  <Field Repo this$0>
	//  170  391:aload_0         
	//  171  392:getfield        #26  <Field Path val$path>
	//  172  395:invokestatic    #207 <Method Path Repo.access$1000(Repo, Path)>
	//  173  398:pop             
		}
	//  174  399:return          
	}

	final Repo this$0;
	final Path val$path;
	final List val$queue;
	final Repo val$repo;

	Repo$15()
	{
		this$0 = final_repo1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #24  <Field Repo this$0>
		val$path = path1;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #26  <Field Path val$path>
		val$queue = list;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #28  <Field List val$queue>
		val$repo = Repo.this;
	//    9   15:aload_0         
	//   10   16:aload           4
	//   11   18:putfield        #30  <Field Repo val$repo>
		super();
	//   12   21:aload_0         
	//   13   22:invokespecial   #33  <Method void Object()>
	//   14   25:return          
	}
}

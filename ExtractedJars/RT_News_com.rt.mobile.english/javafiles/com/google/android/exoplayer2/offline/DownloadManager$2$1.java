// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.offline;

import android.os.Handler;
import android.util.Log;
import java.util.*;
import java.util.concurrent.CopyOnWriteArraySet;

// Referenced classes of package com.google.android.exoplayer2.offline:
//			DownloadManager, DownloadAction, ActionFile

class DownloadManager$2$1
	implements Runnable
{

	public void run()
	{
		if(DownloadManager.access$1100(this$0))
	//*   0    0:aload_0         
	//*   1    1:getfield        #19  <Field DownloadManager$2 this$1>
	//*   2    4:getfield        #28  <Field DownloadManager DownloadManager$2.this$0>
	//*   3    7:invokestatic    #34  <Method boolean DownloadManager.access$1100(DownloadManager)>
	//*   4   10:ifeq            14
			return;
	//    5   13:return          
		ArrayList arraylist = new ArrayList(((java.util.Collection) (DownloadManager.access$1200(this$0))));
	//    6   14:new             #36  <Class ArrayList>
	//    7   17:dup             
	//    8   18:aload_0         
	//    9   19:getfield        #19  <Field DownloadManager$2 this$1>
	//   10   22:getfield        #28  <Field DownloadManager DownloadManager$2.this$0>
	//   11   25:invokestatic    #40  <Method ArrayList DownloadManager.access$1200(DownloadManager)>
	//   12   28:invokespecial   #43  <Method void ArrayList(java.util.Collection)>
	//   13   31:astore          4
		DownloadManager.access$1200(this$0).clear();
	//   14   33:aload_0         
	//   15   34:getfield        #19  <Field DownloadManager$2 this$1>
	//   16   37:getfield        #28  <Field DownloadManager DownloadManager$2.this$0>
	//   17   40:invokestatic    #40  <Method ArrayList DownloadManager.access$1200(DownloadManager)>
	//   18   43:invokevirtual   #46  <Method void ArrayList.clear()>
		DownloadAction adownloadaction[] = val$actions;
	//   19   46:aload_0         
	//   20   47:getfield        #21  <Field DownloadAction[] val$actions>
	//   21   50:astore          5
		boolean flag = false;
	//   22   52:iconst_0        
	//   23   53:istore_2        
		int k = adownloadaction.length;
	//   24   54:aload           5
	//   25   56:arraylength     
	//   26   57:istore_3        
		for(int i = 0; i < k; i++)
	//*  27   58:iconst_0        
	//*  28   59:istore_1        
	//*  29   60:iload_1         
	//*  30   61:iload_3         
	//*  31   62:icmpge          91
		{
			DownloadAction downloadaction = adownloadaction[i];
	//   32   65:aload           5
	//   33   67:iload_1         
	//   34   68:aaload          
	//   35   69:astore          6
			DownloadManager.access$1300(this$0, downloadaction);
	//   36   71:aload_0         
	//   37   72:getfield        #19  <Field DownloadManager$2 this$1>
	//   38   75:getfield        #28  <Field DownloadManager DownloadManager$2.this$0>
	//   39   78:aload           6
	//   40   80:invokestatic    #50  <Method DownloadManager$Task DownloadManager.access$1300(DownloadManager, DownloadAction)>
	//   41   83:pop             
		}

	//   42   84:iload_1         
	//   43   85:iconst_1        
	//   44   86:iadd            
	//   45   87:istore_1        
	//*  46   88:goto            60
		DownloadManager.access$1000("Tasks are created.");
	//   47   91:ldc1            #52  <String "Tasks are created.">
	//   48   93:invokestatic    #56  <Method void DownloadManager.access$1000(String)>
		DownloadManager.access$1402(this$0, true);
	//   49   96:aload_0         
	//   50   97:getfield        #19  <Field DownloadManager$2 this$1>
	//   51  100:getfield        #28  <Field DownloadManager DownloadManager$2.this$0>
	//   52  103:iconst_1        
	//   53  104:invokestatic    #60  <Method boolean DownloadManager.access$1402(DownloadManager, boolean)>
	//   54  107:pop             
		for(Iterator iterator = DownloadManager.access$1500(this$0).iterator(); iterator.hasNext(); ((ener)iterator.next()).onInitialized(this$0));
	//   55  108:aload_0         
	//   56  109:getfield        #19  <Field DownloadManager$2 this$1>
	//   57  112:getfield        #28  <Field DownloadManager DownloadManager$2.this$0>
	//   58  115:invokestatic    #64  <Method CopyOnWriteArraySet DownloadManager.access$1500(DownloadManager)>
	//   59  118:invokevirtual   #70  <Method Iterator CopyOnWriteArraySet.iterator()>
	//   60  121:astore          5
	//   61  123:aload           5
	//   62  125:invokeinterface #76  <Method boolean Iterator.hasNext()>
	//   63  130:ifeq            158
	//   64  133:aload           5
	//   65  135:invokeinterface #80  <Method Object Iterator.next()>
	//   66  140:checkcast       #82  <Class DownloadManager$Listener>
	//   67  143:aload_0         
	//   68  144:getfield        #19  <Field DownloadManager$2 this$1>
	//   69  147:getfield        #28  <Field DownloadManager DownloadManager$2.this$0>
	//   70  150:invokeinterface #86  <Method void DownloadManager$Listener.onInitialized(DownloadManager)>
	//*  71  155:goto            123
		if(!((List) (arraylist)).isEmpty())
	//*  72  158:aload           4
	//*  73  160:invokeinterface #91  <Method boolean List.isEmpty()>
	//*  74  165:ifne            194
		{
			DownloadManager.access$1200(this$0).addAll(((java.util.Collection) (arraylist)));
	//   75  168:aload_0         
	//   76  169:getfield        #19  <Field DownloadManager$2 this$1>
	//   77  172:getfield        #28  <Field DownloadManager DownloadManager$2.this$0>
	//   78  175:invokestatic    #40  <Method ArrayList DownloadManager.access$1200(DownloadManager)>
	//   79  178:aload           4
	//   80  180:invokevirtual   #95  <Method boolean ArrayList.addAll(java.util.Collection)>
	//   81  183:pop             
			DownloadManager.access$1600(this$0);
	//   82  184:aload_0         
	//   83  185:getfield        #19  <Field DownloadManager$2 this$1>
	//   84  188:getfield        #28  <Field DownloadManager DownloadManager$2.this$0>
	//   85  191:invokestatic    #98  <Method void DownloadManager.access$1600(DownloadManager)>
		}
		DownloadManager.access$1700(this$0);
	//   86  194:aload_0         
	//   87  195:getfield        #19  <Field DownloadManager$2 this$1>
	//   88  198:getfield        #28  <Field DownloadManager DownloadManager$2.this$0>
	//   89  201:invokestatic    #101 <Method void DownloadManager.access$1700(DownloadManager)>
		for(int j = ((int) (flag)); j < DownloadManager.access$1200(this$0).size(); j++)
	//*  90  204:iload_2         
	//*  91  205:istore_1        
	//*  92  206:iload_1         
	//*  93  207:aload_0         
	//*  94  208:getfield        #19  <Field DownloadManager$2 this$1>
	//*  95  211:getfield        #28  <Field DownloadManager DownloadManager$2.this$0>
	//*  96  214:invokestatic    #40  <Method ArrayList DownloadManager.access$1200(DownloadManager)>
	//*  97  217:invokevirtual   #105 <Method int ArrayList.size()>
	//*  98  220:icmpge          269
		{
			  = ()DownloadManager.access$1200(this$0).get(j);
	//   99  223:aload_0         
	//  100  224:getfield        #19  <Field DownloadManager$2 this$1>
	//  101  227:getfield        #28  <Field DownloadManager DownloadManager$2.this$0>
	//  102  230:invokestatic    #40  <Method ArrayList DownloadManager.access$1200(DownloadManager)>
	//  103  233:iload_1         
	//  104  234:invokevirtual   #109 <Method Object ArrayList.get(int)>
	//  105  237:checkcast       #111 <Class DownloadManager$Task>
	//  106  240:astore          4
			if(.access._mth100() == 0)
	//* 107  242:aload           4
	//* 108  244:invokestatic    #115 <Method int DownloadManager$Task.access$100(DownloadManager$Task)>
	//* 109  247:ifne            262
				DownloadManager.access$1800(this$0, );
	//  110  250:aload_0         
	//  111  251:getfield        #19  <Field DownloadManager$2 this$1>
	//  112  254:getfield        #28  <Field DownloadManager DownloadManager$2.this$0>
	//  113  257:aload           4
	//  114  259:invokestatic    #119 <Method void DownloadManager.access$1800(DownloadManager, DownloadManager$Task)>
		}

	//  115  262:iload_1         
	//  116  263:iconst_1        
	//  117  264:iadd            
	//  118  265:istore_1        
	//* 119  266:goto            206
	//  120  269:return          
	}

	final DownloadManager._cls2 this$1;
	final DownloadAction val$actions[];

	DownloadManager$2$1()
	{
		this$1 = final__pcls2;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field DownloadManager$2 this$1>
		val$actions = _5B_Lcom.google.android.exoplayer2.offline.DownloadAction_3B_.this;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #21  <Field DownloadAction[] val$actions>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #23  <Method void Object()>
	//    8   14:return          
	}

	// Unreferenced inner class com/google/android/exoplayer2/offline/DownloadManager$2

/* anonymous class */
	class DownloadManager._cls2
		implements Runnable
	{

		public void run()
		{
			Object obj;
			try
			{
				obj = ((Object) (DownloadManager.access$900(DownloadManager.this).load(DownloadManager.access$800(DownloadManager.this))));
		//    0    0:aload_0         
		//    1    1:getfield        #19  <Field DownloadManager this$0>
		//    2    4:invokestatic    #29  <Method ActionFile DownloadManager.access$900(DownloadManager)>
		//    3    7:aload_0         
		//    4    8:getfield        #19  <Field DownloadManager this$0>
		//    5   11:invokestatic    #33  <Method DownloadAction$Deserializer[] DownloadManager.access$800(DownloadManager)>
		//    6   14:invokevirtual   #39  <Method DownloadAction[] ActionFile.load(DownloadAction$Deserializer[])>
		//    7   17:astore_1        
				DownloadManager.access$1000("Action file is loaded.");
		//    8   18:ldc1            #41  <String "Action file is loaded.">
		//    9   20:invokestatic    #45  <Method void DownloadManager.access$1000(String)>
			}
		//*  10   23:goto            41
			// Misplaced declaration of an exception variable
			catch(Object obj)
		//*  11   26:astore_1        
			{
				Log.e("DownloadManager", "Action file loading failed.", ((Throwable) (obj)));
		//   12   27:ldc1            #47  <String "DownloadManager">
		//   13   29:ldc1            #49  <String "Action file loading failed.">
		//   14   31:aload_1         
		//   15   32:invokestatic    #55  <Method int Log.e(String, String, Throwable)>
		//   16   35:pop             
				obj = ((Object) (new DownloadAction[0]));
		//   17   36:iconst_0        
		//   18   37:anewarray       DownloadAction[]
		//   19   40:astore_1        
			}
			DownloadManager.access$1900(DownloadManager.this).post(((Runnable) (((DownloadManager._cls2._cls1) (obj)). new DownloadManager._cls2._cls1())));
		//   20   41:aload_0         
		//   21   42:getfield        #19  <Field DownloadManager this$0>
		//   22   45:invokestatic    #61  <Method Handler DownloadManager.access$1900(DownloadManager)>
		//   23   48:new             #13  <Class DownloadManager$2$1>
		//   24   51:dup             
		//   25   52:aload_0         
		//   26   53:aload_1         
		//   27   54:invokespecial   #64  <Method void DownloadManager$2$1(DownloadManager$2, DownloadAction[])>
		//   28   57:invokevirtual   #70  <Method boolean Handler.post(Runnable)>
		//   29   60:pop             
		//   30   61:return          
		}

		final DownloadManager this$0;

			
			{
				this$0 = DownloadManager.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field DownloadManager this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #21  <Method void Object()>
			//    5    9:return          
			}
	}

}

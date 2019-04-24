// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.raizlabs.android.dbflow.structure.database.transaction;

import android.os.Handler;
import com.raizlabs.android.dbflow.structure.database.DatabaseWrapper;
import java.util.*;

// Referenced classes of package com.raizlabs.android.dbflow.structure.database.transaction:
//			ITransaction, Transaction

public class ProcessModelTransaction
	implements ITransaction
{
	public static final class Builder
	{

		public Builder add(Object obj)
		{
			models.add(obj);
		//    0    0:aload_0         
		//    1    1:getfield        #30  <Field List models>
		//    2    4:aload_1         
		//    3    5:invokeinterface #54  <Method boolean List.add(Object)>
		//    4   10:pop             
			return this;
		//    5   11:aload_0         
		//    6   12:areturn         
		}

		public Builder addAll(Collection collection)
		{
			if(collection != null)
		//*   0    0:aload_1         
		//*   1    1:ifnull          15
				models.addAll(collection);
		//    2    4:aload_0         
		//    3    5:getfield        #30  <Field List models>
		//    4    8:aload_1         
		//    5    9:invokeinterface #60  <Method boolean List.addAll(Collection)>
		//    6   14:pop             
			return this;
		//    7   15:aload_0         
		//    8   16:areturn         
		}

		public final transient Builder addAll(Object aobj[])
		{
			models.addAll(((Collection) (Arrays.asList(aobj))));
		//    0    0:aload_0         
		//    1    1:getfield        #30  <Field List models>
		//    2    4:aload_1         
		//    3    5:invokestatic    #69  <Method List Arrays.asList(Object[])>
		//    4    8:invokeinterface #60  <Method boolean List.addAll(Collection)>
		//    5   13:pop             
			return this;
		//    6   14:aload_0         
		//    7   15:areturn         
		}

		public ProcessModelTransaction build()
		{
			return new ProcessModelTransaction(this);
		//    0    0:new             #7   <Class ProcessModelTransaction>
		//    1    3:dup             
		//    2    4:aload_0         
		//    3    5:invokespecial   #76  <Method void ProcessModelTransaction(ProcessModelTransaction$Builder)>
		//    4    8:areturn         
		}

		public Builder processListener(OnModelProcessListener onmodelprocesslistener)
		{
			processListener = onmodelprocesslistener;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #80  <Field ProcessModelTransaction$OnModelProcessListener processListener>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public Builder runProcessListenerOnSameThread(boolean flag)
		{
			runProcessListenerOnSameThread = flag;
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:putfield        #47  <Field boolean runProcessListenerOnSameThread>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		List models;
		OnModelProcessListener processListener;
		private final ProcessModel processModel;
		private boolean runProcessListenerOnSameThread;


/*
		static ProcessModel access$000(Builder builder)
		{
			return builder.processModel;
		//    0    0:aload_0         
		//    1    1:getfield        #32  <Field ProcessModelTransaction$ProcessModel processModel>
		//    2    4:areturn         
		}

*/


/*
		static boolean access$100(Builder builder)
		{
			return builder.runProcessListenerOnSameThread;
		//    0    0:aload_0         
		//    1    1:getfield        #47  <Field boolean runProcessListenerOnSameThread>
		//    2    4:ireturn         
		}

*/

		public Builder(ProcessModel processmodel)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #25  <Method void Object()>
			models = ((List) (new ArrayList()));
		//    2    4:aload_0         
		//    3    5:new             #27  <Class ArrayList>
		//    4    8:dup             
		//    5    9:invokespecial   #28  <Method void ArrayList()>
		//    6   12:putfield        #30  <Field List models>
			processModel = processmodel;
		//    7   15:aload_0         
		//    8   16:aload_1         
		//    9   17:putfield        #32  <Field ProcessModelTransaction$ProcessModel processModel>
		//   10   20:return          
		}

		public Builder(Collection collection, ProcessModel processmodel)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #25  <Method void Object()>
			models = ((List) (new ArrayList()));
		//    2    4:aload_0         
		//    3    5:new             #27  <Class ArrayList>
		//    4    8:dup             
		//    5    9:invokespecial   #28  <Method void ArrayList()>
		//    6   12:putfield        #30  <Field List models>
			processModel = processmodel;
		//    7   15:aload_0         
		//    8   16:aload_2         
		//    9   17:putfield        #32  <Field ProcessModelTransaction$ProcessModel processModel>
			models = ((List) (new ArrayList(collection)));
		//   10   20:aload_0         
		//   11   21:new             #27  <Class ArrayList>
		//   12   24:dup             
		//   13   25:aload_1         
		//   14   26:invokespecial   #40  <Method void ArrayList(Collection)>
		//   15   29:putfield        #30  <Field List models>
		//   16   32:return          
		}
	}

	public static interface OnModelProcessListener
	{

		public abstract void onModelProcessed(long l, long l1, Object obj);
	}

	public static interface ProcessModel
	{

		public abstract void processModel(Object obj);
	}


	ProcessModelTransaction(Builder builder)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #34  <Method void Object()>
		processListener = builder.processListener;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:getfield        #36  <Field ProcessModelTransaction$OnModelProcessListener ProcessModelTransaction$Builder.processListener>
	//    5    9:putfield        #37  <Field ProcessModelTransaction$OnModelProcessListener processListener>
		models = builder.models;
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:getfield        #39  <Field List ProcessModelTransaction$Builder.models>
	//    9   17:putfield        #40  <Field List models>
		processModel = builder.processModel;
	//   10   20:aload_0         
	//   11   21:aload_1         
	//   12   22:invokestatic    #44  <Method ProcessModelTransaction$ProcessModel ProcessModelTransaction$Builder.access$000(ProcessModelTransaction$Builder)>
	//   13   25:putfield        #46  <Field ProcessModelTransaction$ProcessModel processModel>
		runProcessListenerOnSameThread = builder.runProcessListenerOnSameThread;
	//   14   28:aload_0         
	//   15   29:aload_1         
	//   16   30:invokestatic    #50  <Method boolean ProcessModelTransaction$Builder.access$100(ProcessModelTransaction$Builder)>
	//   17   33:putfield        #52  <Field boolean runProcessListenerOnSameThread>
	//   18   36:return          
	}

	public void execute(final DatabaseWrapper model)
	{
		if(models != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #40  <Field List models>
	//*   2    4:ifnull          101
		{
			final int size = models.size();
	//    3    7:aload_0         
	//    4    8:getfield        #40  <Field List models>
	//    5   11:invokeinterface #63  <Method int List.size()>
	//    6   16:istore_3        
			final int finalI = 0;
	//    7   17:iconst_0        
	//    8   18:istore_2        
			while(finalI < size) 
	//*   9   19:iload_2         
	//*  10   20:iload_3         
	//*  11   21:icmpge          101
			{
				model = ((DatabaseWrapper) (models.get(finalI)));
	//   12   24:aload_0         
	//   13   25:getfield        #40  <Field List models>
	//   14   28:iload_2         
	//   15   29:invokeinterface #67  <Method Object List.get(int)>
	//   16   34:astore_1        
				processModel.processModel(((Object) (model)));
	//   17   35:aload_0         
	//   18   36:getfield        #46  <Field ProcessModelTransaction$ProcessModel processModel>
	//   19   39:aload_1         
	//   20   40:invokeinterface #70  <Method void ProcessModelTransaction$ProcessModel.processModel(Object)>
				if(processListener != null)
	//*  21   45:aload_0         
	//*  22   46:getfield        #37  <Field ProcessModelTransaction$OnModelProcessListener processListener>
	//*  23   49:ifnull          73
					if(runProcessListenerOnSameThread)
	//*  24   52:aload_0         
	//*  25   53:getfield        #52  <Field boolean runProcessListenerOnSameThread>
	//*  26   56:ifeq            80
						processListener.onModelProcessed(finalI, size, ((Object) (model)));
	//   27   59:aload_0         
	//   28   60:getfield        #37  <Field ProcessModelTransaction$OnModelProcessListener processListener>
	//   29   63:iload_2         
	//   30   64:i2l             
	//   31   65:iload_3         
	//   32   66:i2l             
	//   33   67:aload_1         
	//   34   68:invokeinterface #74  <Method void ProcessModelTransaction$OnModelProcessListener.onModelProcessed(long, long, Object)>
					else
	//*  35   73:iload_2         
	//*  36   74:iconst_1        
	//*  37   75:iadd            
	//*  38   76:istore_2        
	//*  39   77:goto            19
						Transaction.getTransactionHandler().post(new Runnable() {

							public void run()
							{
								processListener.onModelProcessed(finalI, size, model);
							//    0    0:aload_0         
							//    1    1:getfield        #22  <Field ProcessModelTransaction this$0>
							//    2    4:getfield        #37  <Field ProcessModelTransaction$OnModelProcessListener ProcessModelTransaction.processListener>
							//    3    7:aload_0         
							//    4    8:getfield        #24  <Field int val$finalI>
							//    5   11:i2l             
							//    6   12:aload_0         
							//    7   13:getfield        #26  <Field int val$size>
							//    8   16:i2l             
							//    9   17:aload_0         
							//   10   18:getfield        #28  <Field Object val$model>
							//   11   21:invokeinterface #43  <Method void ProcessModelTransaction$OnModelProcessListener.onModelProcessed(long, long, Object)>
							//   12   26:return          
							}

							final ProcessModelTransaction this$0;
							final int val$finalI;
							final Object val$model;
							final int val$size;

			
			{
				this$0 = ProcessModelTransaction.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #22  <Field ProcessModelTransaction this$0>
				finalI = i;
			//    3    5:aload_0         
			//    4    6:iload_2         
			//    5    7:putfield        #24  <Field int val$finalI>
				size = j;
			//    6   10:aload_0         
			//    7   11:iload_3         
			//    8   12:putfield        #26  <Field int val$size>
				model = obj;
			//    9   15:aload_0         
			//   10   16:aload           4
			//   11   18:putfield        #28  <Field Object val$model>
				super();
			//   12   21:aload_0         
			//   13   22:invokespecial   #31  <Method void Object()>
			//   14   25:return          
			}
						}
);
	//   40   80:invokestatic    #80  <Method Handler Transaction.getTransactionHandler()>
	//   41   83:new             #9   <Class ProcessModelTransaction$1>
	//   42   86:dup             
	//   43   87:aload_0         
	//   44   88:iload_2         
	//   45   89:iload_3         
	//   46   90:aload_1         
	//   47   91:invokespecial   #83  <Method void ProcessModelTransaction$1(ProcessModelTransaction, int, int, Object)>
	//   48   94:invokevirtual   #89  <Method boolean Handler.post(Runnable)>
	//   49   97:pop             
				finalI++;
			}
		}
	//*  50   98:goto            73
	//   51  101:return          
	}

	final List models;
	final OnModelProcessListener processListener;
	final ProcessModel processModel;
	final boolean runProcessListenerOnSameThread;
}

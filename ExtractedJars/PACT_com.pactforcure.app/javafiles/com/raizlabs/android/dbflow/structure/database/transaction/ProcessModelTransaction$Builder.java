// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.raizlabs.android.dbflow.structure.database.transaction;

import java.util.*;

// Referenced classes of package com.raizlabs.android.dbflow.structure.database.transaction:
//			ProcessModelTransaction

public static final class ProcessModelTransaction$Builder
{

	public ProcessModelTransaction$Builder add(Object obj)
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

	public ProcessModelTransaction$Builder addAll(Collection collection)
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

	public final transient ProcessModelTransaction$Builder addAll(Object aobj[])
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

	public ProcessModelTransaction$Builder processListener(rocessListener rocesslistener)
	{
		processListener = rocesslistener;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #80  <Field ProcessModelTransaction$OnModelProcessListener processListener>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public ProcessModelTransaction$Builder runProcessListenerOnSameThread(boolean flag)
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
	rocessListener processListener;
	private final odel processModel;
	private boolean runProcessListenerOnSameThread;


/*
	static odel access$000(ProcessModelTransaction$Builder processmodeltransaction$builder)
	{
		return processmodeltransaction$builder.processModel;
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field ProcessModelTransaction$ProcessModel processModel>
	//    2    4:areturn         
	}

*/


/*
	static boolean access$100(ProcessModelTransaction$Builder processmodeltransaction$builder)
	{
		return processmodeltransaction$builder.runProcessListenerOnSameThread;
	//    0    0:aload_0         
	//    1    1:getfield        #47  <Field boolean runProcessListenerOnSameThread>
	//    2    4:ireturn         
	}

*/

	public ProcessModelTransaction$Builder(odel odel)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #25  <Method void Object()>
		models = ((List) (new ArrayList()));
	//    2    4:aload_0         
	//    3    5:new             #27  <Class ArrayList>
	//    4    8:dup             
	//    5    9:invokespecial   #28  <Method void ArrayList()>
	//    6   12:putfield        #30  <Field List models>
		processModel = odel;
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:putfield        #32  <Field ProcessModelTransaction$ProcessModel processModel>
	//   10   20:return          
	}

	public ProcessModelTransaction$Builder(Collection collection, odel odel)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #25  <Method void Object()>
		models = ((List) (new ArrayList()));
	//    2    4:aload_0         
	//    3    5:new             #27  <Class ArrayList>
	//    4    8:dup             
	//    5    9:invokespecial   #28  <Method void ArrayList()>
	//    6   12:putfield        #30  <Field List models>
		processModel = odel;
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

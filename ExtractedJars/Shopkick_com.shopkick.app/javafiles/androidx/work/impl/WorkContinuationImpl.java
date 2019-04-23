// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package androidx.work.impl;

import android.arch.lifecycle.LiveData;
import android.text.TextUtils;
import androidx.work.*;
import androidx.work.impl.utils.EnqueueRunnable;
import androidx.work.impl.utils.StatusRunnable;
import androidx.work.impl.utils.taskexecutor.TaskExecutor;
import androidx.work.impl.workers.CombineContinuationsWorker;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.*;

// Referenced classes of package androidx.work.impl:
//			WorkManagerImpl

public class WorkContinuationImpl extends WorkContinuation
{

	WorkContinuationImpl(WorkManagerImpl workmanagerimpl, String s, ExistingWorkPolicy existingworkpolicy, List list)
	{
		this(workmanagerimpl, s, existingworkpolicy, list, ((List) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:aload           4
	//    5    6:aconst_null     
	//    6    7:invokespecial   #46  <Method void WorkContinuationImpl(WorkManagerImpl, String, ExistingWorkPolicy, List, List)>
	//    7   10:return          
	}

	WorkContinuationImpl(WorkManagerImpl workmanagerimpl, String s, ExistingWorkPolicy existingworkpolicy, List list, List list1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #52  <Method void WorkContinuation()>
		mWorkManagerImpl = workmanagerimpl;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #54  <Field WorkManagerImpl mWorkManagerImpl>
		mName = s;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #56  <Field String mName>
		mExistingWorkPolicy = existingworkpolicy;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #58  <Field ExistingWorkPolicy mExistingWorkPolicy>
		mWork = list;
	//   11   19:aload_0         
	//   12   20:aload           4
	//   13   22:putfield        #60  <Field List mWork>
		mParents = list1;
	//   14   25:aload_0         
	//   15   26:aload           5
	//   16   28:putfield        #62  <Field List mParents>
		mIds = ((List) (new ArrayList(mWork.size())));
	//   17   31:aload_0         
	//   18   32:new             #64  <Class ArrayList>
	//   19   35:dup             
	//   20   36:aload_0         
	//   21   37:getfield        #60  <Field List mWork>
	//   22   40:invokeinterface #70  <Method int List.size()>
	//   23   45:invokespecial   #73  <Method void ArrayList(int)>
	//   24   48:putfield        #75  <Field List mIds>
		mAllIds = ((List) (new ArrayList()));
	//   25   51:aload_0         
	//   26   52:new             #64  <Class ArrayList>
	//   27   55:dup             
	//   28   56:invokespecial   #76  <Method void ArrayList()>
	//   29   59:putfield        #78  <Field List mAllIds>
		if(list1 != null)
	//*  30   62:aload           5
	//*  31   64:ifnull          111
			for(workmanagerimpl = ((WorkManagerImpl) (list1.iterator())); ((Iterator) (workmanagerimpl)).hasNext(); mAllIds.addAll(((java.util.Collection) (((WorkContinuationImpl) (s)).mAllIds))))
	//*  32   67:aload           5
	//*  33   69:invokeinterface #82  <Method Iterator List.iterator()>
	//*  34   74:astore_1        
	//*  35   75:aload_1         
	//*  36   76:invokeinterface #88  <Method boolean Iterator.hasNext()>
	//*  37   81:ifeq            111
				s = ((String) ((WorkContinuationImpl)((Iterator) (workmanagerimpl)).next()));
	//   38   84:aload_1         
	//   39   85:invokeinterface #92  <Method Object Iterator.next()>
	//   40   90:checkcast       #2   <Class WorkContinuationImpl>
	//   41   93:astore_2        

	//   42   94:aload_0         
	//   43   95:getfield        #78  <Field List mAllIds>
	//   44   98:aload_2         
	//   45   99:getfield        #78  <Field List mAllIds>
	//   46  102:invokeinterface #96  <Method boolean List.addAll(java.util.Collection)>
	//   47  107:pop             
	//*  48  108:goto            75
		for(int i = 0; i < list.size(); i++)
	//*  49  111:iconst_0        
	//*  50  112:istore          6
	//*  51  114:iload           6
	//*  52  116:aload           4
	//*  53  118:invokeinterface #70  <Method int List.size()>
	//*  54  123:icmpge          173
		{
			workmanagerimpl = ((WorkManagerImpl) (((WorkRequest)list.get(i)).getStringId()));
	//   55  126:aload           4
	//   56  128:iload           6
	//   57  130:invokeinterface #100 <Method Object List.get(int)>
	//   58  135:checkcast       #102 <Class WorkRequest>
	//   59  138:invokevirtual   #106 <Method String WorkRequest.getStringId()>
	//   60  141:astore_1        
			mIds.add(((Object) (workmanagerimpl)));
	//   61  142:aload_0         
	//   62  143:getfield        #75  <Field List mIds>
	//   63  146:aload_1         
	//   64  147:invokeinterface #110 <Method boolean List.add(Object)>
	//   65  152:pop             
			mAllIds.add(((Object) (workmanagerimpl)));
	//   66  153:aload_0         
	//   67  154:getfield        #78  <Field List mAllIds>
	//   68  157:aload_1         
	//   69  158:invokeinterface #110 <Method boolean List.add(Object)>
	//   70  163:pop             
		}

	//   71  164:iload           6
	//   72  166:iconst_1        
	//   73  167:iadd            
	//   74  168:istore          6
	//*  75  170:goto            114
	//   76  173:return          
	}

	WorkContinuationImpl(WorkManagerImpl workmanagerimpl, List list)
	{
		this(workmanagerimpl, ((String) (null)), ExistingWorkPolicy.KEEP, list, ((List) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:getstatic       #117 <Field ExistingWorkPolicy ExistingWorkPolicy.KEEP>
	//    4    6:aload_2         
	//    5    7:aconst_null     
	//    6    8:invokespecial   #46  <Method void WorkContinuationImpl(WorkManagerImpl, String, ExistingWorkPolicy, List, List)>
	//    7   11:return          
	}

	private static boolean hasCycles(WorkContinuationImpl workcontinuationimpl, Set set)
	{
label0:
		{
			set.addAll(((java.util.Collection) (workcontinuationimpl.getIds())));
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #124 <Method List getIds()>
	//    3    5:invokeinterface #127 <Method boolean Set.addAll(java.util.Collection)>
	//    4   10:pop             
			Object obj = ((Object) (prerequisitesFor(workcontinuationimpl)));
	//    5   11:aload_0         
	//    6   12:invokestatic    #131 <Method Set prerequisitesFor(WorkContinuationImpl)>
	//    7   15:astore_2        
			for(Iterator iterator = set.iterator(); iterator.hasNext();)
	//*   8   16:aload_1         
	//*   9   17:invokeinterface #132 <Method Iterator Set.iterator()>
	//*  10   22:astore_3        
	//*  11   23:aload_3         
	//*  12   24:invokeinterface #88  <Method boolean Iterator.hasNext()>
	//*  13   29:ifeq            52
				if(((Set) (obj)).contains(((Object) ((String)iterator.next()))))
	//*  14   32:aload_2         
	//*  15   33:aload_3         
	//*  16   34:invokeinterface #92  <Method Object Iterator.next()>
	//*  17   39:checkcast       #134 <Class String>
	//*  18   42:invokeinterface #137 <Method boolean Set.contains(Object)>
	//*  19   47:ifeq            23
					return true;
	//   20   50:iconst_1        
	//   21   51:ireturn         

			obj = ((Object) (workcontinuationimpl.getParents()));
	//   22   52:aload_0         
	//   23   53:invokevirtual   #140 <Method List getParents()>
	//   24   56:astore_2        
			if(obj == null || ((List) (obj)).isEmpty())
				break label0;
	//   25   57:aload_2         
	//   26   58:ifnull          104
	//   27   61:aload_2         
	//   28   62:invokeinterface #143 <Method boolean List.isEmpty()>
	//   29   67:ifne            104
			obj = ((Object) (((List) (obj)).iterator()));
	//   30   70:aload_2         
	//   31   71:invokeinterface #82  <Method Iterator List.iterator()>
	//   32   76:astore_2        
			do
				if(!((Iterator) (obj)).hasNext())
					break label0;
	//   33   77:aload_2         
	//   34   78:invokeinterface #88  <Method boolean Iterator.hasNext()>
	//   35   83:ifeq            104
			while(!hasCycles((WorkContinuationImpl)((Iterator) (obj)).next(), set));
	//   36   86:aload_2         
	//   37   87:invokeinterface #92  <Method Object Iterator.next()>
	//   38   92:checkcast       #2   <Class WorkContinuationImpl>
	//   39   95:aload_1         
	//   40   96:invokestatic    #145 <Method boolean hasCycles(WorkContinuationImpl, Set)>
	//   41   99:ifeq            77
			return true;
	//   42  102:iconst_1        
	//   43  103:ireturn         
		}
		set.removeAll(((java.util.Collection) (workcontinuationimpl.getIds())));
	//   44  104:aload_1         
	//   45  105:aload_0         
	//   46  106:invokevirtual   #124 <Method List getIds()>
	//   47  109:invokeinterface #148 <Method boolean Set.removeAll(java.util.Collection)>
	//   48  114:pop             
		return false;
	//   49  115:iconst_0        
	//   50  116:ireturn         
	}

	public static Set prerequisitesFor(WorkContinuationImpl workcontinuationimpl)
	{
		HashSet hashset = new HashSet();
	//    0    0:new             #152 <Class HashSet>
	//    1    3:dup             
	//    2    4:invokespecial   #153 <Method void HashSet()>
	//    3    7:astore_1        
		workcontinuationimpl = ((WorkContinuationImpl) (workcontinuationimpl.getParents()));
	//    4    8:aload_0         
	//    5    9:invokevirtual   #140 <Method List getParents()>
	//    6   12:astore_0        
		if(workcontinuationimpl != null && !((List) (workcontinuationimpl)).isEmpty())
	//*   7   13:aload_0         
	//*   8   14:ifnull          64
	//*   9   17:aload_0         
	//*  10   18:invokeinterface #143 <Method boolean List.isEmpty()>
	//*  11   23:ifne            64
			for(workcontinuationimpl = ((WorkContinuationImpl) (((List) (workcontinuationimpl)).iterator())); ((Iterator) (workcontinuationimpl)).hasNext(); ((Set) (hashset)).addAll(((java.util.Collection) (((WorkContinuationImpl)((Iterator) (workcontinuationimpl)).next()).getIds()))));
	//   12   26:aload_0         
	//   13   27:invokeinterface #82  <Method Iterator List.iterator()>
	//   14   32:astore_0        
	//   15   33:aload_0         
	//   16   34:invokeinterface #88  <Method boolean Iterator.hasNext()>
	//   17   39:ifeq            64
	//   18   42:aload_1         
	//   19   43:aload_0         
	//   20   44:invokeinterface #92  <Method Object Iterator.next()>
	//   21   49:checkcast       #2   <Class WorkContinuationImpl>
	//   22   52:invokevirtual   #124 <Method List getIds()>
	//   23   55:invokeinterface #127 <Method boolean Set.addAll(java.util.Collection)>
	//   24   60:pop             
	//*  25   61:goto            33
		return ((Set) (hashset));
	//   26   64:aload_1         
	//   27   65:areturn         
	}

	protected WorkContinuation combineInternal(List list)
	{
		OneTimeWorkRequest onetimeworkrequest = (OneTimeWorkRequest)(new androidx.work.OneTimeWorkRequest.Builder(androidx/work/impl/workers/CombineContinuationsWorker)).setInputMerger(androidx/work/ArrayCreatingInputMerger).build();
	//    0    0:new             #158 <Class androidx.work.OneTimeWorkRequest$Builder>
	//    1    3:dup             
	//    2    4:ldc1            #160 <Class CombineContinuationsWorker>
	//    3    6:invokespecial   #163 <Method void androidx.work.OneTimeWorkRequest$Builder(Class)>
	//    4    9:ldc1            #165 <Class ArrayCreatingInputMerger>
	//    5   11:invokevirtual   #169 <Method androidx.work.OneTimeWorkRequest$Builder androidx.work.OneTimeWorkRequest$Builder.setInputMerger(Class)>
	//    6   14:invokevirtual   #173 <Method WorkRequest androidx.work.OneTimeWorkRequest$Builder.build()>
	//    7   17:checkcast       #175 <Class OneTimeWorkRequest>
	//    8   20:astore_2        
		ArrayList arraylist = new ArrayList(list.size());
	//    9   21:new             #64  <Class ArrayList>
	//   10   24:dup             
	//   11   25:aload_1         
	//   12   26:invokeinterface #70  <Method int List.size()>
	//   13   31:invokespecial   #73  <Method void ArrayList(int)>
	//   14   34:astore_3        
		for(list = ((List) (list.iterator())); ((Iterator) (list)).hasNext(); ((List) (arraylist)).add(((Object) ((WorkContinuationImpl)(WorkContinuation)((Iterator) (list)).next()))));
	//   15   35:aload_1         
	//   16   36:invokeinterface #82  <Method Iterator List.iterator()>
	//   17   41:astore_1        
	//   18   42:aload_1         
	//   19   43:invokeinterface #88  <Method boolean Iterator.hasNext()>
	//   20   48:ifeq            73
	//   21   51:aload_3         
	//   22   52:aload_1         
	//   23   53:invokeinterface #92  <Method Object Iterator.next()>
	//   24   58:checkcast       #4   <Class WorkContinuation>
	//   25   61:checkcast       #2   <Class WorkContinuationImpl>
	//   26   64:invokeinterface #110 <Method boolean List.add(Object)>
	//   27   69:pop             
	//*  28   70:goto            42
		return ((WorkContinuation) (new WorkContinuationImpl(mWorkManagerImpl, ((String) (null)), ExistingWorkPolicy.KEEP, Collections.singletonList(((Object) (onetimeworkrequest))), ((List) (arraylist)))));
	//   29   73:new             #2   <Class WorkContinuationImpl>
	//   30   76:dup             
	//   31   77:aload_0         
	//   32   78:getfield        #54  <Field WorkManagerImpl mWorkManagerImpl>
	//   33   81:aconst_null     
	//   34   82:getstatic       #117 <Field ExistingWorkPolicy ExistingWorkPolicy.KEEP>
	//   35   85:aload_2         
	//   36   86:invokestatic    #181 <Method List Collections.singletonList(Object)>
	//   37   89:aload_3         
	//   38   90:invokespecial   #46  <Method void WorkContinuationImpl(WorkManagerImpl, String, ExistingWorkPolicy, List, List)>
	//   39   93:areturn         
	}

	public Operation enqueue()
	{
		if(!mEnqueued)
	//*   0    0:aload_0         
	//*   1    1:getfield        #186 <Field boolean mEnqueued>
	//*   2    4:ifne            40
		{
			EnqueueRunnable enqueuerunnable = new EnqueueRunnable(this);
	//    3    7:new             #188 <Class EnqueueRunnable>
	//    4   10:dup             
	//    5   11:aload_0         
	//    6   12:invokespecial   #191 <Method void EnqueueRunnable(WorkContinuationImpl)>
	//    7   15:astore_1        
			mWorkManagerImpl.getWorkTaskExecutor().executeOnBackgroundThread(((Runnable) (enqueuerunnable)));
	//    8   16:aload_0         
	//    9   17:getfield        #54  <Field WorkManagerImpl mWorkManagerImpl>
	//   10   20:invokevirtual   #197 <Method TaskExecutor WorkManagerImpl.getWorkTaskExecutor()>
	//   11   23:aload_1         
	//   12   24:invokeinterface #203 <Method void TaskExecutor.executeOnBackgroundThread(Runnable)>
			mOperation = enqueuerunnable.getOperation();
	//   13   29:aload_0         
	//   14   30:aload_1         
	//   15   31:invokevirtual   #206 <Method Operation EnqueueRunnable.getOperation()>
	//   16   34:putfield        #208 <Field Operation mOperation>
		} else
	//*  17   37:goto            74
		{
			Logger.get().warning(TAG, String.format("Already enqueued work ids (%s)", new Object[] {
				TextUtils.join(", ", ((Iterable) (mIds)))
			}), new Throwable[0]);
	//   18   40:invokestatic    #211 <Method Logger Logger.get()>
	//   19   43:getstatic       #39  <Field String TAG>
	//   20   46:ldc1            #213 <String "Already enqueued work ids (%s)">
	//   21   48:iconst_1        
	//   22   49:anewarray       Object[]
	//   23   52:dup             
	//   24   53:iconst_0        
	//   25   54:ldc1            #217 <String ", ">
	//   26   56:aload_0         
	//   27   57:getfield        #75  <Field List mIds>
	//   28   60:invokestatic    #223 <Method String TextUtils.join(CharSequence, Iterable)>
	//   29   63:aastore         
	//   30   64:invokestatic    #227 <Method String String.format(String, Object[])>
	//   31   67:iconst_0        
	//   32   68:anewarray       Throwable[]
	//   33   71:invokevirtual   #233 <Method void Logger.warning(String, String, Throwable[])>
		}
		return mOperation;
	//   34   74:aload_0         
	//   35   75:getfield        #208 <Field Operation mOperation>
	//   36   78:areturn         
	}

	public List getAllIds()
	{
		return mAllIds;
	//    0    0:aload_0         
	//    1    1:getfield        #78  <Field List mAllIds>
	//    2    4:areturn         
	}

	public ExistingWorkPolicy getExistingWorkPolicy()
	{
		return mExistingWorkPolicy;
	//    0    0:aload_0         
	//    1    1:getfield        #58  <Field ExistingWorkPolicy mExistingWorkPolicy>
	//    2    4:areturn         
	}

	public List getIds()
	{
		return mIds;
	//    0    0:aload_0         
	//    1    1:getfield        #75  <Field List mIds>
	//    2    4:areturn         
	}

	public String getName()
	{
		return mName;
	//    0    0:aload_0         
	//    1    1:getfield        #56  <Field String mName>
	//    2    4:areturn         
	}

	public List getParents()
	{
		return mParents;
	//    0    0:aload_0         
	//    1    1:getfield        #62  <Field List mParents>
	//    2    4:areturn         
	}

	public List getWork()
	{
		return mWork;
	//    0    0:aload_0         
	//    1    1:getfield        #60  <Field List mWork>
	//    2    4:areturn         
	}

	public ListenableFuture getWorkInfos()
	{
		StatusRunnable statusrunnable = StatusRunnable.forStringIds(mWorkManagerImpl, mAllIds);
	//    0    0:aload_0         
	//    1    1:getfield        #54  <Field WorkManagerImpl mWorkManagerImpl>
	//    2    4:aload_0         
	//    3    5:getfield        #78  <Field List mAllIds>
	//    4    8:invokestatic    #249 <Method StatusRunnable StatusRunnable.forStringIds(WorkManagerImpl, List)>
	//    5   11:astore_1        
		mWorkManagerImpl.getWorkTaskExecutor().executeOnBackgroundThread(((Runnable) (statusrunnable)));
	//    6   12:aload_0         
	//    7   13:getfield        #54  <Field WorkManagerImpl mWorkManagerImpl>
	//    8   16:invokevirtual   #197 <Method TaskExecutor WorkManagerImpl.getWorkTaskExecutor()>
	//    9   19:aload_1         
	//   10   20:invokeinterface #203 <Method void TaskExecutor.executeOnBackgroundThread(Runnable)>
		return statusrunnable.getFuture();
	//   11   25:aload_1         
	//   12   26:invokevirtual   #252 <Method ListenableFuture StatusRunnable.getFuture()>
	//   13   29:areturn         
	}

	public LiveData getWorkInfosLiveData()
	{
		return mWorkManagerImpl.getWorkInfosById(mAllIds);
	//    0    0:aload_0         
	//    1    1:getfield        #54  <Field WorkManagerImpl mWorkManagerImpl>
	//    2    4:aload_0         
	//    3    5:getfield        #78  <Field List mAllIds>
	//    4    8:invokevirtual   #259 <Method LiveData WorkManagerImpl.getWorkInfosById(List)>
	//    5   11:areturn         
	}

	public WorkManagerImpl getWorkManagerImpl()
	{
		return mWorkManagerImpl;
	//    0    0:aload_0         
	//    1    1:getfield        #54  <Field WorkManagerImpl mWorkManagerImpl>
	//    2    4:areturn         
	}

	public boolean hasCycles()
	{
		return hasCycles(this, ((Set) (new HashSet())));
	//    0    0:aload_0         
	//    1    1:new             #152 <Class HashSet>
	//    2    4:dup             
	//    3    5:invokespecial   #153 <Method void HashSet()>
	//    4    8:invokestatic    #145 <Method boolean hasCycles(WorkContinuationImpl, Set)>
	//    5   11:ireturn         
	}

	public boolean isEnqueued()
	{
		return mEnqueued;
	//    0    0:aload_0         
	//    1    1:getfield        #186 <Field boolean mEnqueued>
	//    2    4:ireturn         
	}

	public void markEnqueued()
	{
		mEnqueued = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #186 <Field boolean mEnqueued>
	//    3    5:return          
	}

	public WorkContinuation then(List list)
	{
		return ((WorkContinuation) (new WorkContinuationImpl(mWorkManagerImpl, mName, ExistingWorkPolicy.KEEP, list, Collections.singletonList(((Object) (this))))));
	//    0    0:new             #2   <Class WorkContinuationImpl>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #54  <Field WorkManagerImpl mWorkManagerImpl>
	//    4    8:aload_0         
	//    5    9:getfield        #56  <Field String mName>
	//    6   12:getstatic       #117 <Field ExistingWorkPolicy ExistingWorkPolicy.KEEP>
	//    7   15:aload_1         
	//    8   16:aload_0         
	//    9   17:invokestatic    #181 <Method List Collections.singletonList(Object)>
	//   10   20:invokespecial   #46  <Method void WorkContinuationImpl(WorkManagerImpl, String, ExistingWorkPolicy, List, List)>
	//   11   23:areturn         
	}

	private static final String TAG = Logger.tagWithPrefix("WorkContinuationImpl");
	private final List mAllIds;
	private boolean mEnqueued;
	private final ExistingWorkPolicy mExistingWorkPolicy;
	private final List mIds;
	private final String mName;
	private Operation mOperation;
	private final List mParents;
	private final List mWork;
	private final WorkManagerImpl mWorkManagerImpl;

	static 
	{
	//    0    0:ldc1            #31  <String "WorkContinuationImpl">
	//    1    2:invokestatic    #37  <Method String Logger.tagWithPrefix(String)>
	//    2    5:putstatic       #39  <Field String TAG>
	//*   3    8:return          
	}
}

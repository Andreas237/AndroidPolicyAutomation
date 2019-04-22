// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.ibotta.android.mvp.base.loading.pagination;

import com.ibotta.android.service.api.ApiWorkSubmitter;
import com.ibotta.android.service.api.job.ApiJob;
import com.ibotta.android.service.api.job.ApiJobListener;
import java.util.HashSet;
import java.util.Set;
import timber.log.Timber;

// Referenced classes of package com.ibotta.android.mvp.base.loading.pagination:
//			PaginationLoader, PaginationLoaderListener

public abstract class AbstractPaginationLoader
	implements PaginationLoader, ApiJobListener
{

	public AbstractPaginationLoader(ApiWorkSubmitter apiworksubmitter)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #31  <Method void Object()>
		apiWorkSubmitter = apiworksubmitter;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #33  <Field ApiWorkSubmitter apiWorkSubmitter>
	//    5    9:return          
	}

	protected void clearAndReload()
	{
		loading = false;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #37  <Field boolean loading>
		allLoaded = false;
	//    3    5:aload_0         
	//    4    6:iconst_0        
	//    5    7:putfield        #39  <Field boolean allLoaded>
		lastLoad = null;
	//    6   10:aload_0         
	//    7   11:aconst_null     
	//    8   12:putfield        #41  <Field Long lastLoad>
	//    9   15:return          
	}

	protected abstract ApiJob createNextLoadJob();

	protected void finishedLoading()
	{
		Timber.d("Next batch loaded successfully.", new Object[0]);
	//    0    0:ldc1            #46  <String "Next batch loaded successfully.">
	//    1    2:iconst_0        
	//    2    3:anewarray       Object[]
	//    3    6:invokestatic    #52  <Method void Timber.d(String, Object[])>
		loading = false;
	//    4    9:aload_0         
	//    5   10:iconst_0        
	//    6   11:putfield        #37  <Field boolean loading>
		listener.onStoppedLoading(filters);
	//    7   14:aload_0         
	//    8   15:getfield        #54  <Field PaginationLoaderListener listener>
	//    9   18:aload_0         
	//   10   19:getfield        #56  <Field Set filters>
	//   11   22:invokeinterface #62  <Method void PaginationLoaderListener.onStoppedLoading(Set)>
	//   12   27:return          
	}

	protected boolean isAllLoaded(int i)
	{
		return i < 50;
	//    0    0:iload_1         
	//    1    1:bipush          50
	//    2    3:icmpge          8
	//    3    6:iconst_1        
	//    4    7:ireturn         
	//    5    8:iconst_0        
	//    6    9:ireturn         
	}

	public boolean isLoading()
	{
		return loading;
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field boolean loading>
	//    2    4:ireturn         
	}

	public void loadMore()
	{
		Timber.d("Load more", new Object[0]);
	//    0    0:ldc1            #69  <String "Load more">
	//    1    2:iconst_0        
	//    2    3:anewarray       Object[]
	//    3    6:invokestatic    #52  <Method void Timber.d(String, Object[])>
		loadNextBatch();
	//    4    9:aload_0         
	//    5   10:invokevirtual   #72  <Method void loadNextBatch()>
	//    6   13:return          
	}

	protected void loadNextBatch()
	{
		if(allLoaded)
	//*   0    0:aload_0         
	//*   1    1:getfield        #39  <Field boolean allLoaded>
	//*   2    4:ifeq            30
		{
			Timber.d("Everything is already loaded", new Object[0]);
	//    3    7:ldc1            #74  <String "Everything is already loaded">
	//    4    9:iconst_0        
	//    5   10:anewarray       Object[]
	//    6   13:invokestatic    #52  <Method void Timber.d(String, Object[])>
			listener.onStoppedLoading(filters);
	//    7   16:aload_0         
	//    8   17:getfield        #54  <Field PaginationLoaderListener listener>
	//    9   20:aload_0         
	//   10   21:getfield        #56  <Field Set filters>
	//   11   24:invokeinterface #62  <Method void PaginationLoaderListener.onStoppedLoading(Set)>
			return;
	//   12   29:return          
		}
		boolean flag;
		if(lastLoad == null)
	//*  13   30:aload_0         
	//*  14   31:getfield        #41  <Field Long lastLoad>
	//*  15   34:ifnonnull       42
			flag = true;
	//   16   37:iconst_1        
	//   17   38:istore_1        
		else
	//*  18   39:goto            44
			flag = false;
	//   19   42:iconst_0        
	//   20   43:istore_1        
		Timber.d("Loading next batch", new Object[0]);
	//   21   44:ldc1            #76  <String "Loading next batch">
	//   22   46:iconst_0        
	//   23   47:anewarray       Object[]
	//   24   50:invokestatic    #52  <Method void Timber.d(String, Object[])>
		listener.onLoading(filters, flag);
	//   25   53:aload_0         
	//   26   54:getfield        #54  <Field PaginationLoaderListener listener>
	//   27   57:aload_0         
	//   28   58:getfield        #56  <Field Set filters>
	//   29   61:iload_1         
	//   30   62:invokeinterface #80  <Method void PaginationLoaderListener.onLoading(Set, boolean)>
		if(loading && attached)
	//*  31   67:aload_0         
	//*  32   68:getfield        #37  <Field boolean loading>
	//*  33   71:ifeq            82
	//*  34   74:aload_0         
	//*  35   75:getfield        #82  <Field boolean attached>
	//*  36   78:ifeq            82
		{
			return;
	//   37   81:return          
		} else
		{
			loading = true;
	//   38   82:aload_0         
	//   39   83:iconst_1        
	//   40   84:putfield        #37  <Field boolean loading>
			apiWorkSubmitter.submit(createNextLoadJob());
	//   41   87:aload_0         
	//   42   88:getfield        #33  <Field ApiWorkSubmitter apiWorkSubmitter>
	//   43   91:aload_0         
	//   44   92:invokevirtual   #84  <Method ApiJob createNextLoadJob()>
	//   45   95:invokeinterface #90  <Method void ApiWorkSubmitter.submit(ApiJob)>
			return;
	//   46  100:return          
		}
	}

	public void onApiJobFinished(ApiJob apijob)
	{
		if(!apijob.isSuccessfullyLoaded())
	//*   0    0:aload_1         
	//*   1    1:invokeinterface #96  <Method boolean ApiJob.isSuccessfullyLoaded()>
	//*   2    6:ifne            32
		{
			Timber.e("Load failed", new Object[0]);
	//    3    9:ldc1            #98  <String "Load failed">
	//    4   11:iconst_0        
	//    5   12:anewarray       Object[]
	//    6   15:invokestatic    #101 <Method void Timber.e(String, Object[])>
			listener.onLoadFailed(filters);
	//    7   18:aload_0         
	//    8   19:getfield        #54  <Field PaginationLoaderListener listener>
	//    9   22:aload_0         
	//   10   23:getfield        #56  <Field Set filters>
	//   11   26:invokeinterface #104 <Method void PaginationLoaderListener.onLoadFailed(Set)>
			return;
	//   12   31:return          
		} else
		{
			return;
	//   13   32:return          
		}
	}

	public void onApiJobLongTask(ApiJob apijob)
	{
	//    0    0:return          
	}

	public void onDetach()
	{
		Timber.d("onDetach()", new Object[0]);
	//    0    0:ldc1            #108 <String "onDetach()">
	//    1    2:iconst_0        
	//    2    3:anewarray       Object[]
	//    3    6:invokestatic    #52  <Method void Timber.d(String, Object[])>
		attached = false;
	//    4    9:aload_0         
	//    5   10:iconst_0        
	//    6   11:putfield        #82  <Field boolean attached>
		loading = false;
	//    7   14:aload_0         
	//    8   15:iconst_0        
	//    9   16:putfield        #37  <Field boolean loading>
		allLoaded = false;
	//   10   19:aload_0         
	//   11   20:iconst_0        
	//   12   21:putfield        #39  <Field boolean allLoaded>
	//   13   24:return          
	}

	public void onStart()
	{
		Timber.d("onStart()", new Object[0]);
	//    0    0:ldc1            #111 <String "onStart()">
	//    1    2:iconst_0        
	//    2    3:anewarray       Object[]
	//    3    6:invokestatic    #52  <Method void Timber.d(String, Object[])>
		attached = true;
	//    4    9:aload_0         
	//    5   10:iconst_1        
	//    6   11:putfield        #82  <Field boolean attached>
	//    7   14:return          
	}

	public void onStop()
	{
		Timber.d("onStop()", new Object[0]);
	//    0    0:ldc1            #114 <String "onStop()">
	//    1    2:iconst_0        
	//    2    3:anewarray       Object[]
	//    3    6:invokestatic    #52  <Method void Timber.d(String, Object[])>
		attached = false;
	//    4    9:aload_0         
	//    5   10:iconst_0        
	//    6   11:putfield        #82  <Field boolean attached>
	//    7   14:return          
	}

	public void reload()
	{
		Timber.d("Reload", new Object[0]);
	//    0    0:ldc1            #117 <String "Reload">
	//    1    2:iconst_0        
	//    2    3:anewarray       Object[]
	//    3    6:invokestatic    #52  <Method void Timber.d(String, Object[])>
		clearAndReload();
	//    4    9:aload_0         
	//    5   10:invokevirtual   #119 <Method void clearAndReload()>
	//    6   13:return          
	}

	public void setFilters(Set set)
	{
		if(set == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       16
		{
			filters = ((Set) (new HashSet()));
	//    2    4:aload_0         
	//    3    5:new             #122 <Class HashSet>
	//    4    8:dup             
	//    5    9:invokespecial   #123 <Method void HashSet()>
	//    6   12:putfield        #56  <Field Set filters>
			return;
	//    7   15:return          
		} else
		{
			filters = set;
	//    8   16:aload_0         
	//    9   17:aload_1         
	//   10   18:putfield        #56  <Field Set filters>
			return;
	//   11   21:return          
		}
	}

	public void setListener(PaginationLoaderListener paginationloaderlistener)
	{
		listener = paginationloaderlistener;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #54  <Field PaginationLoaderListener listener>
	//    3    5:return          
	}

	protected static final int PAGE_LIMIT = 50;
	protected boolean allLoaded;
	protected final ApiWorkSubmitter apiWorkSubmitter;
	protected boolean attached;
	protected Set filters;
	protected Long lastLoad;
	protected PaginationLoaderListener listener;
	protected boolean loading;
}

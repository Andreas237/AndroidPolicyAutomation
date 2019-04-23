// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.request;


// Referenced classes of package com.bumptech.glide.request:
//			RequestCoordinator, Request

public final class ErrorRequestCoordinator
	implements RequestCoordinator, Request
{

	public ErrorRequestCoordinator(RequestCoordinator requestcoordinator)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void Object()>
		parent = requestcoordinator;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #21  <Field RequestCoordinator parent>
	//    5    9:return          
	}

	private boolean isValidRequest(Request request)
	{
		return ((Object) (request)).equals(((Object) (primary))) || primary.isFailed() && ((Object) (request)).equals(((Object) (error)));
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #27  <Field Request primary>
	//    3    5:invokevirtual   #31  <Method boolean Object.equals(Object)>
	//    4    8:ifne            39
	//    5   11:aload_0         
	//    6   12:getfield        #27  <Field Request primary>
	//    7   15:invokeinterface #35  <Method boolean Request.isFailed()>
	//    8   20:ifeq            37
	//    9   23:aload_1         
	//   10   24:aload_0         
	//   11   25:getfield        #37  <Field Request error>
	//   12   28:invokevirtual   #31  <Method boolean Object.equals(Object)>
	//   13   31:ifeq            37
	//   14   34:goto            39
	//   15   37:iconst_0        
	//   16   38:ireturn         
	//   17   39:iconst_1        
	//   18   40:ireturn         
	}

	private boolean parentCanNotifyCleared()
	{
		RequestCoordinator requestcoordinator = parent;
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field RequestCoordinator parent>
	//    2    4:astore_1        
		return requestcoordinator == null || requestcoordinator.canNotifyCleared(((Request) (this)));
	//    3    5:aload_1         
	//    4    6:ifnull          24
	//    5    9:aload_1         
	//    6   10:aload_0         
	//    7   11:invokeinterface #41  <Method boolean RequestCoordinator.canNotifyCleared(Request)>
	//    8   16:ifeq            22
	//    9   19:goto            24
	//   10   22:iconst_0        
	//   11   23:ireturn         
	//   12   24:iconst_1        
	//   13   25:ireturn         
	}

	private boolean parentCanNotifyStatusChanged()
	{
		RequestCoordinator requestcoordinator = parent;
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field RequestCoordinator parent>
	//    2    4:astore_1        
		return requestcoordinator == null || requestcoordinator.canNotifyStatusChanged(((Request) (this)));
	//    3    5:aload_1         
	//    4    6:ifnull          24
	//    5    9:aload_1         
	//    6   10:aload_0         
	//    7   11:invokeinterface #45  <Method boolean RequestCoordinator.canNotifyStatusChanged(Request)>
	//    8   16:ifeq            22
	//    9   19:goto            24
	//   10   22:iconst_0        
	//   11   23:ireturn         
	//   12   24:iconst_1        
	//   13   25:ireturn         
	}

	private boolean parentCanSetImage()
	{
		RequestCoordinator requestcoordinator = parent;
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field RequestCoordinator parent>
	//    2    4:astore_1        
		return requestcoordinator == null || requestcoordinator.canSetImage(((Request) (this)));
	//    3    5:aload_1         
	//    4    6:ifnull          24
	//    5    9:aload_1         
	//    6   10:aload_0         
	//    7   11:invokeinterface #49  <Method boolean RequestCoordinator.canSetImage(Request)>
	//    8   16:ifeq            22
	//    9   19:goto            24
	//   10   22:iconst_0        
	//   11   23:ireturn         
	//   12   24:iconst_1        
	//   13   25:ireturn         
	}

	private boolean parentIsAnyResourceSet()
	{
		RequestCoordinator requestcoordinator = parent;
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field RequestCoordinator parent>
	//    2    4:astore_1        
		return requestcoordinator != null && requestcoordinator.isAnyResourceSet();
	//    3    5:aload_1         
	//    4    6:ifnull          20
	//    5    9:aload_1         
	//    6   10:invokeinterface #53  <Method boolean RequestCoordinator.isAnyResourceSet()>
	//    7   15:ifeq            20
	//    8   18:iconst_1        
	//    9   19:ireturn         
	//   10   20:iconst_0        
	//   11   21:ireturn         
	}

	public void begin()
	{
		if(!primary.isRunning())
	//*   0    0:aload_0         
	//*   1    1:getfield        #27  <Field Request primary>
	//*   2    4:invokeinterface #57  <Method boolean Request.isRunning()>
	//*   3    9:ifne            21
			primary.begin();
	//    4   12:aload_0         
	//    5   13:getfield        #27  <Field Request primary>
	//    6   16:invokeinterface #59  <Method void Request.begin()>
	//    7   21:return          
	}

	public boolean canNotifyCleared(Request request)
	{
		return parentCanNotifyCleared() && isValidRequest(request);
	//    0    0:aload_0         
	//    1    1:invokespecial   #61  <Method boolean parentCanNotifyCleared()>
	//    2    4:ifeq            17
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:invokespecial   #63  <Method boolean isValidRequest(Request)>
	//    6   12:ifeq            17
	//    7   15:iconst_1        
	//    8   16:ireturn         
	//    9   17:iconst_0        
	//   10   18:ireturn         
	}

	public boolean canNotifyStatusChanged(Request request)
	{
		return parentCanNotifyStatusChanged() && isValidRequest(request);
	//    0    0:aload_0         
	//    1    1:invokespecial   #65  <Method boolean parentCanNotifyStatusChanged()>
	//    2    4:ifeq            17
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:invokespecial   #63  <Method boolean isValidRequest(Request)>
	//    6   12:ifeq            17
	//    7   15:iconst_1        
	//    8   16:ireturn         
	//    9   17:iconst_0        
	//   10   18:ireturn         
	}

	public boolean canSetImage(Request request)
	{
		return parentCanSetImage() && isValidRequest(request);
	//    0    0:aload_0         
	//    1    1:invokespecial   #67  <Method boolean parentCanSetImage()>
	//    2    4:ifeq            17
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:invokespecial   #63  <Method boolean isValidRequest(Request)>
	//    6   12:ifeq            17
	//    7   15:iconst_1        
	//    8   16:ireturn         
	//    9   17:iconst_0        
	//   10   18:ireturn         
	}

	public void clear()
	{
		primary.clear();
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field Request primary>
	//    2    4:invokeinterface #70  <Method void Request.clear()>
		if(error.isRunning())
	//*   3    9:aload_0         
	//*   4   10:getfield        #37  <Field Request error>
	//*   5   13:invokeinterface #57  <Method boolean Request.isRunning()>
	//*   6   18:ifeq            30
			error.clear();
	//    7   21:aload_0         
	//    8   22:getfield        #37  <Field Request error>
	//    9   25:invokeinterface #70  <Method void Request.clear()>
	//   10   30:return          
	}

	public boolean isAnyResourceSet()
	{
		return parentIsAnyResourceSet() || isResourceSet();
	//    0    0:aload_0         
	//    1    1:invokespecial   #72  <Method boolean parentIsAnyResourceSet()>
	//    2    4:ifne            19
	//    3    7:aload_0         
	//    4    8:invokevirtual   #75  <Method boolean isResourceSet()>
	//    5   11:ifeq            17
	//    6   14:goto            19
	//    7   17:iconst_0        
	//    8   18:ireturn         
	//    9   19:iconst_1        
	//   10   20:ireturn         
	}

	public boolean isCleared()
	{
		Request request;
		if(primary.isFailed())
	//*   0    0:aload_0         
	//*   1    1:getfield        #27  <Field Request primary>
	//*   2    4:invokeinterface #35  <Method boolean Request.isFailed()>
	//*   3    9:ifeq            20
			request = error;
	//    4   12:aload_0         
	//    5   13:getfield        #37  <Field Request error>
	//    6   16:astore_1        
		else
	//*   7   17:goto            25
			request = primary;
	//    8   20:aload_0         
	//    9   21:getfield        #27  <Field Request primary>
	//   10   24:astore_1        
		return request.isCleared();
	//   11   25:aload_1         
	//   12   26:invokeinterface #78  <Method boolean Request.isCleared()>
	//   13   31:ireturn         
	}

	public boolean isComplete()
	{
		Request request;
		if(primary.isFailed())
	//*   0    0:aload_0         
	//*   1    1:getfield        #27  <Field Request primary>
	//*   2    4:invokeinterface #35  <Method boolean Request.isFailed()>
	//*   3    9:ifeq            20
			request = error;
	//    4   12:aload_0         
	//    5   13:getfield        #37  <Field Request error>
	//    6   16:astore_1        
		else
	//*   7   17:goto            25
			request = primary;
	//    8   20:aload_0         
	//    9   21:getfield        #27  <Field Request primary>
	//   10   24:astore_1        
		return request.isComplete();
	//   11   25:aload_1         
	//   12   26:invokeinterface #81  <Method boolean Request.isComplete()>
	//   13   31:ireturn         
	}

	public boolean isEquivalentTo(Request request)
	{
		boolean flag = request instanceof ErrorRequestCoordinator;
	//    0    0:aload_1         
	//    1    1:instanceof      #2   <Class ErrorRequestCoordinator>
	//    2    4:istore_2        
		boolean flag2 = false;
	//    3    5:iconst_0        
	//    4    6:istore_3        
		if(flag)
	//*   5    7:iload_2         
	//*   6    8:ifeq            56
		{
			request = ((Request) ((ErrorRequestCoordinator)request));
	//    7   11:aload_1         
	//    8   12:checkcast       #2   <Class ErrorRequestCoordinator>
	//    9   15:astore_1        
			boolean flag1 = flag2;
	//   10   16:iload_3         
	//   11   17:istore_2        
			if(primary.isEquivalentTo(((ErrorRequestCoordinator) (request)).primary))
	//*  12   18:aload_0         
	//*  13   19:getfield        #27  <Field Request primary>
	//*  14   22:aload_1         
	//*  15   23:getfield        #27  <Field Request primary>
	//*  16   26:invokeinterface #84  <Method boolean Request.isEquivalentTo(Request)>
	//*  17   31:ifeq            54
			{
				flag1 = flag2;
	//   18   34:iload_3         
	//   19   35:istore_2        
				if(error.isEquivalentTo(((ErrorRequestCoordinator) (request)).error))
	//*  20   36:aload_0         
	//*  21   37:getfield        #37  <Field Request error>
	//*  22   40:aload_1         
	//*  23   41:getfield        #37  <Field Request error>
	//*  24   44:invokeinterface #84  <Method boolean Request.isEquivalentTo(Request)>
	//*  25   49:ifeq            54
					flag1 = true;
	//   26   52:iconst_1        
	//   27   53:istore_2        
			}
			return flag1;
	//   28   54:iload_2         
	//   29   55:ireturn         
		} else
		{
			return false;
	//   30   56:iconst_0        
	//   31   57:ireturn         
		}
	}

	public boolean isFailed()
	{
		return primary.isFailed() && error.isFailed();
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field Request primary>
	//    2    4:invokeinterface #35  <Method boolean Request.isFailed()>
	//    3    9:ifeq            26
	//    4   12:aload_0         
	//    5   13:getfield        #37  <Field Request error>
	//    6   16:invokeinterface #35  <Method boolean Request.isFailed()>
	//    7   21:ifeq            26
	//    8   24:iconst_1        
	//    9   25:ireturn         
	//   10   26:iconst_0        
	//   11   27:ireturn         
	}

	public boolean isResourceSet()
	{
		Request request;
		if(primary.isFailed())
	//*   0    0:aload_0         
	//*   1    1:getfield        #27  <Field Request primary>
	//*   2    4:invokeinterface #35  <Method boolean Request.isFailed()>
	//*   3    9:ifeq            20
			request = error;
	//    4   12:aload_0         
	//    5   13:getfield        #37  <Field Request error>
	//    6   16:astore_1        
		else
	//*   7   17:goto            25
			request = primary;
	//    8   20:aload_0         
	//    9   21:getfield        #27  <Field Request primary>
	//   10   24:astore_1        
		return request.isResourceSet();
	//   11   25:aload_1         
	//   12   26:invokeinterface #85  <Method boolean Request.isResourceSet()>
	//   13   31:ireturn         
	}

	public boolean isRunning()
	{
		Request request;
		if(primary.isFailed())
	//*   0    0:aload_0         
	//*   1    1:getfield        #27  <Field Request primary>
	//*   2    4:invokeinterface #35  <Method boolean Request.isFailed()>
	//*   3    9:ifeq            20
			request = error;
	//    4   12:aload_0         
	//    5   13:getfield        #37  <Field Request error>
	//    6   16:astore_1        
		else
	//*   7   17:goto            25
			request = primary;
	//    8   20:aload_0         
	//    9   21:getfield        #27  <Field Request primary>
	//   10   24:astore_1        
		return request.isRunning();
	//   11   25:aload_1         
	//   12   26:invokeinterface #57  <Method boolean Request.isRunning()>
	//   13   31:ireturn         
	}

	public void onRequestFailed(Request request)
	{
		if(!((Object) (request)).equals(((Object) (error))))
	//*   0    0:aload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #37  <Field Request error>
	//*   3    5:invokevirtual   #31  <Method boolean Object.equals(Object)>
	//*   4    8:ifne            33
		{
			if(!error.isRunning())
	//*   5   11:aload_0         
	//*   6   12:getfield        #37  <Field Request error>
	//*   7   15:invokeinterface #57  <Method boolean Request.isRunning()>
	//*   8   20:ifne            32
				error.begin();
	//    9   23:aload_0         
	//   10   24:getfield        #37  <Field Request error>
	//   11   27:invokeinterface #59  <Method void Request.begin()>
			return;
	//   12   32:return          
		}
		request = ((Request) (parent));
	//   13   33:aload_0         
	//   14   34:getfield        #21  <Field RequestCoordinator parent>
	//   15   37:astore_1        
		if(request != null)
	//*  16   38:aload_1         
	//*  17   39:ifnull          49
			((RequestCoordinator) (request)).onRequestFailed(((Request) (this)));
	//   18   42:aload_1         
	//   19   43:aload_0         
	//   20   44:invokeinterface #89  <Method void RequestCoordinator.onRequestFailed(Request)>
	//   21   49:return          
	}

	public void onRequestSuccess(Request request)
	{
		request = ((Request) (parent));
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field RequestCoordinator parent>
	//    2    4:astore_1        
		if(request != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          16
			((RequestCoordinator) (request)).onRequestSuccess(((Request) (this)));
	//    5    9:aload_1         
	//    6   10:aload_0         
	//    7   11:invokeinterface #92  <Method void RequestCoordinator.onRequestSuccess(Request)>
	//    8   16:return          
	}

	public void recycle()
	{
		primary.recycle();
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field Request primary>
	//    2    4:invokeinterface #95  <Method void Request.recycle()>
		error.recycle();
	//    3    9:aload_0         
	//    4   10:getfield        #37  <Field Request error>
	//    5   13:invokeinterface #95  <Method void Request.recycle()>
	//    6   18:return          
	}

	public void setRequests(Request request, Request request1)
	{
		primary = request;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #27  <Field Request primary>
		error = request1;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #37  <Field Request error>
	//    6   10:return          
	}

	private Request error;
	private final RequestCoordinator parent;
	private Request primary;
}

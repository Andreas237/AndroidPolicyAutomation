// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.request;


// Referenced classes of package com.bumptech.glide.request:
//			RequestCoordinator, Request

public class ThumbnailRequestCoordinator
	implements RequestCoordinator, Request
{

	public ThumbnailRequestCoordinator()
	{
		this(((RequestCoordinator) (null)));
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:invokespecial   #21  <Method void ThumbnailRequestCoordinator(RequestCoordinator)>
	//    3    5:return          
	}

	public ThumbnailRequestCoordinator(RequestCoordinator requestcoordinator)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #24  <Method void Object()>
		coordinator = requestcoordinator;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #26  <Field RequestCoordinator coordinator>
	//    5    9:return          
	}

	private boolean parentCanNotifyStatusChanged()
	{
		return coordinator == null || coordinator.canNotifyStatusChanged(((Request) (this)));
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field RequestCoordinator coordinator>
	//    2    4:ifnull          20
	//    3    7:aload_0         
	//    4    8:getfield        #26  <Field RequestCoordinator coordinator>
	//    5   11:aload_0         
	//    6   12:invokeinterface #32  <Method boolean RequestCoordinator.canNotifyStatusChanged(Request)>
	//    7   17:ifeq            22
	//    8   20:iconst_1        
	//    9   21:ireturn         
	//   10   22:iconst_0        
	//   11   23:ireturn         
	}

	private boolean parentCanSetImage()
	{
		return coordinator == null || coordinator.canSetImage(((Request) (this)));
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field RequestCoordinator coordinator>
	//    2    4:ifnull          20
	//    3    7:aload_0         
	//    4    8:getfield        #26  <Field RequestCoordinator coordinator>
	//    5   11:aload_0         
	//    6   12:invokeinterface #36  <Method boolean RequestCoordinator.canSetImage(Request)>
	//    7   17:ifeq            22
	//    8   20:iconst_1        
	//    9   21:ireturn         
	//   10   22:iconst_0        
	//   11   23:ireturn         
	}

	private boolean parentIsAnyResourceSet()
	{
		return coordinator != null && coordinator.isAnyResourceSet();
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field RequestCoordinator coordinator>
	//    2    4:ifnull          21
	//    3    7:aload_0         
	//    4    8:getfield        #26  <Field RequestCoordinator coordinator>
	//    5   11:invokeinterface #40  <Method boolean RequestCoordinator.isAnyResourceSet()>
	//    6   16:ifeq            21
	//    7   19:iconst_1        
	//    8   20:ireturn         
	//    9   21:iconst_0        
	//   10   22:ireturn         
	}

	public void begin()
	{
		isRunning = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #43  <Field boolean isRunning>
		if(!thumb.isRunning())
	//*   3    5:aload_0         
	//*   4    6:getfield        #45  <Field Request thumb>
	//*   5    9:invokeinterface #47  <Method boolean Request.isRunning()>
	//*   6   14:ifne            26
			thumb.begin();
	//    7   17:aload_0         
	//    8   18:getfield        #45  <Field Request thumb>
	//    9   21:invokeinterface #49  <Method void Request.begin()>
		if(isRunning && !full.isRunning())
	//*  10   26:aload_0         
	//*  11   27:getfield        #43  <Field boolean isRunning>
	//*  12   30:ifeq            54
	//*  13   33:aload_0         
	//*  14   34:getfield        #51  <Field Request full>
	//*  15   37:invokeinterface #47  <Method boolean Request.isRunning()>
	//*  16   42:ifne            54
			full.begin();
	//   17   45:aload_0         
	//   18   46:getfield        #51  <Field Request full>
	//   19   49:invokeinterface #49  <Method void Request.begin()>
	//   20   54:return          
	}

	public boolean canNotifyStatusChanged(Request request)
	{
		return parentCanNotifyStatusChanged() && ((Object) (request)).equals(((Object) (full))) && !isAnyResourceSet();
	//    0    0:aload_0         
	//    1    1:invokespecial   #53  <Method boolean parentCanNotifyStatusChanged()>
	//    2    4:ifeq            27
	//    3    7:aload_1         
	//    4    8:aload_0         
	//    5    9:getfield        #51  <Field Request full>
	//    6   12:invokevirtual   #57  <Method boolean Object.equals(Object)>
	//    7   15:ifeq            27
	//    8   18:aload_0         
	//    9   19:invokevirtual   #58  <Method boolean isAnyResourceSet()>
	//   10   22:ifne            27
	//   11   25:iconst_1        
	//   12   26:ireturn         
	//   13   27:iconst_0        
	//   14   28:ireturn         
	}

	public boolean canSetImage(Request request)
	{
		return parentCanSetImage() && (((Object) (request)).equals(((Object) (full))) || !full.isResourceSet());
	//    0    0:aload_0         
	//    1    1:invokespecial   #60  <Method boolean parentCanSetImage()>
	//    2    4:ifeq            32
	//    3    7:aload_1         
	//    4    8:aload_0         
	//    5    9:getfield        #51  <Field Request full>
	//    6   12:invokevirtual   #57  <Method boolean Object.equals(Object)>
	//    7   15:ifne            30
	//    8   18:aload_0         
	//    9   19:getfield        #51  <Field Request full>
	//   10   22:invokeinterface #63  <Method boolean Request.isResourceSet()>
	//   11   27:ifne            32
	//   12   30:iconst_1        
	//   13   31:ireturn         
	//   14   32:iconst_0        
	//   15   33:ireturn         
	}

	public void clear()
	{
		isRunning = false;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #43  <Field boolean isRunning>
		thumb.clear();
	//    3    5:aload_0         
	//    4    6:getfield        #45  <Field Request thumb>
	//    5    9:invokeinterface #66  <Method void Request.clear()>
		full.clear();
	//    6   14:aload_0         
	//    7   15:getfield        #51  <Field Request full>
	//    8   18:invokeinterface #66  <Method void Request.clear()>
	//    9   23:return          
	}

	public boolean isAnyResourceSet()
	{
		return parentIsAnyResourceSet() || isResourceSet();
	//    0    0:aload_0         
	//    1    1:invokespecial   #68  <Method boolean parentIsAnyResourceSet()>
	//    2    4:ifne            14
	//    3    7:aload_0         
	//    4    8:invokevirtual   #69  <Method boolean isResourceSet()>
	//    5   11:ifeq            16
	//    6   14:iconst_1        
	//    7   15:ireturn         
	//    8   16:iconst_0        
	//    9   17:ireturn         
	}

	public boolean isCancelled()
	{
		return full.isCancelled();
	//    0    0:aload_0         
	//    1    1:getfield        #51  <Field Request full>
	//    2    4:invokeinterface #72  <Method boolean Request.isCancelled()>
	//    3    9:ireturn         
	}

	public boolean isComplete()
	{
		return full.isComplete() || thumb.isComplete();
	//    0    0:aload_0         
	//    1    1:getfield        #51  <Field Request full>
	//    2    4:invokeinterface #75  <Method boolean Request.isComplete()>
	//    3    9:ifne            24
	//    4   12:aload_0         
	//    5   13:getfield        #45  <Field Request thumb>
	//    6   16:invokeinterface #75  <Method boolean Request.isComplete()>
	//    7   21:ifeq            26
	//    8   24:iconst_1        
	//    9   25:ireturn         
	//   10   26:iconst_0        
	//   11   27:ireturn         
	}

	public boolean isEquivalentTo(Request request)
	{
		if(request instanceof ThumbnailRequestCoordinator)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #2   <Class ThumbnailRequestCoordinator>
	//*   2    4:ifeq            82
		{
			request = ((Request) ((ThumbnailRequestCoordinator)request));
	//    3    7:aload_1         
	//    4    8:checkcast       #2   <Class ThumbnailRequestCoordinator>
	//    5   11:astore_1        
			return (full != null ? full.isEquivalentTo(((ThumbnailRequestCoordinator) (request)).full) : ((ThumbnailRequestCoordinator) (request)).full == null) && (thumb != null ? thumb.isEquivalentTo(((ThumbnailRequestCoordinator) (request)).thumb) : ((ThumbnailRequestCoordinator) (request)).thumb == null);
	//    6   12:aload_0         
	//    7   13:getfield        #51  <Field Request full>
	//    8   16:ifnonnull       29
	//    9   19:aload_1         
	//   10   20:getfield        #51  <Field Request full>
	//   11   23:ifnonnull       80
	//   12   26:goto            45
	//   13   29:aload_0         
	//   14   30:getfield        #51  <Field Request full>
	//   15   33:aload_1         
	//   16   34:getfield        #51  <Field Request full>
	//   17   37:invokeinterface #78  <Method boolean Request.isEquivalentTo(Request)>
	//   18   42:ifeq            80
	//   19   45:aload_0         
	//   20   46:getfield        #45  <Field Request thumb>
	//   21   49:ifnonnull       62
	//   22   52:aload_1         
	//   23   53:getfield        #45  <Field Request thumb>
	//   24   56:ifnonnull       80
	//   25   59:goto            78
	//   26   62:aload_0         
	//   27   63:getfield        #45  <Field Request thumb>
	//   28   66:aload_1         
	//   29   67:getfield        #45  <Field Request thumb>
	//   30   70:invokeinterface #78  <Method boolean Request.isEquivalentTo(Request)>
	//   31   75:ifeq            80
	//   32   78:iconst_1        
	//   33   79:ireturn         
	//   34   80:iconst_0        
	//   35   81:ireturn         
		} else
		{
			return false;
	//   36   82:iconst_0        
	//   37   83:ireturn         
		}
	}

	public boolean isFailed()
	{
		return full.isFailed();
	//    0    0:aload_0         
	//    1    1:getfield        #51  <Field Request full>
	//    2    4:invokeinterface #81  <Method boolean Request.isFailed()>
	//    3    9:ireturn         
	}

	public boolean isPaused()
	{
		return full.isPaused();
	//    0    0:aload_0         
	//    1    1:getfield        #51  <Field Request full>
	//    2    4:invokeinterface #84  <Method boolean Request.isPaused()>
	//    3    9:ireturn         
	}

	public boolean isResourceSet()
	{
		return full.isResourceSet() || thumb.isResourceSet();
	//    0    0:aload_0         
	//    1    1:getfield        #51  <Field Request full>
	//    2    4:invokeinterface #63  <Method boolean Request.isResourceSet()>
	//    3    9:ifne            24
	//    4   12:aload_0         
	//    5   13:getfield        #45  <Field Request thumb>
	//    6   16:invokeinterface #63  <Method boolean Request.isResourceSet()>
	//    7   21:ifeq            26
	//    8   24:iconst_1        
	//    9   25:ireturn         
	//   10   26:iconst_0        
	//   11   27:ireturn         
	}

	public boolean isRunning()
	{
		return full.isRunning();
	//    0    0:aload_0         
	//    1    1:getfield        #51  <Field Request full>
	//    2    4:invokeinterface #47  <Method boolean Request.isRunning()>
	//    3    9:ireturn         
	}

	public void onRequestSuccess(Request request)
	{
		if(((Object) (request)).equals(((Object) (thumb))))
	//*   0    0:aload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #45  <Field Request thumb>
	//*   3    5:invokevirtual   #57  <Method boolean Object.equals(Object)>
	//*   4    8:ifeq            12
			return;
	//    5   11:return          
		if(coordinator != null)
	//*   6   12:aload_0         
	//*   7   13:getfield        #26  <Field RequestCoordinator coordinator>
	//*   8   16:ifnull          29
			coordinator.onRequestSuccess(((Request) (this)));
	//    9   19:aload_0         
	//   10   20:getfield        #26  <Field RequestCoordinator coordinator>
	//   11   23:aload_0         
	//   12   24:invokeinterface #88  <Method void RequestCoordinator.onRequestSuccess(Request)>
		if(!thumb.isComplete())
	//*  13   29:aload_0         
	//*  14   30:getfield        #45  <Field Request thumb>
	//*  15   33:invokeinterface #75  <Method boolean Request.isComplete()>
	//*  16   38:ifne            50
			thumb.clear();
	//   17   41:aload_0         
	//   18   42:getfield        #45  <Field Request thumb>
	//   19   45:invokeinterface #66  <Method void Request.clear()>
	//   20   50:return          
	}

	public void pause()
	{
		isRunning = false;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #43  <Field boolean isRunning>
		full.pause();
	//    3    5:aload_0         
	//    4    6:getfield        #51  <Field Request full>
	//    5    9:invokeinterface #91  <Method void Request.pause()>
		thumb.pause();
	//    6   14:aload_0         
	//    7   15:getfield        #45  <Field Request thumb>
	//    8   18:invokeinterface #91  <Method void Request.pause()>
	//    9   23:return          
	}

	public void recycle()
	{
		full.recycle();
	//    0    0:aload_0         
	//    1    1:getfield        #51  <Field Request full>
	//    2    4:invokeinterface #94  <Method void Request.recycle()>
		thumb.recycle();
	//    3    9:aload_0         
	//    4   10:getfield        #45  <Field Request thumb>
	//    5   13:invokeinterface #94  <Method void Request.recycle()>
	//    6   18:return          
	}

	public void setRequests(Request request, Request request1)
	{
		full = request;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #51  <Field Request full>
		thumb = request1;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #45  <Field Request thumb>
	//    6   10:return          
	}

	private RequestCoordinator coordinator;
	private Request full;
	private boolean isRunning;
	private Request thumb;
}

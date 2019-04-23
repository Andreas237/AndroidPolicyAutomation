// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.request;


// Referenced classes of package com.bumptech.glide.request:
//			RequestCoordinator, Request

public class ThumbnailRequestCoordinator
	implements RequestCoordinator, Request
{

	ThumbnailRequestCoordinator()
	{
		this(((RequestCoordinator) (null)));
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:invokespecial   #22  <Method void ThumbnailRequestCoordinator(RequestCoordinator)>
	//    3    5:return          
	}

	public ThumbnailRequestCoordinator(RequestCoordinator requestcoordinator)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #26  <Method void Object()>
		parent = requestcoordinator;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #28  <Field RequestCoordinator parent>
	//    5    9:return          
	}

	private boolean parentCanNotifyCleared()
	{
		RequestCoordinator requestcoordinator = parent;
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field RequestCoordinator parent>
	//    2    4:astore_1        
		return requestcoordinator == null || requestcoordinator.canNotifyCleared(((Request) (this)));
	//    3    5:aload_1         
	//    4    6:ifnull          24
	//    5    9:aload_1         
	//    6   10:aload_0         
	//    7   11:invokeinterface #35  <Method boolean RequestCoordinator.canNotifyCleared(Request)>
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
	//    1    1:getfield        #28  <Field RequestCoordinator parent>
	//    2    4:astore_1        
		return requestcoordinator == null || requestcoordinator.canNotifyStatusChanged(((Request) (this)));
	//    3    5:aload_1         
	//    4    6:ifnull          24
	//    5    9:aload_1         
	//    6   10:aload_0         
	//    7   11:invokeinterface #39  <Method boolean RequestCoordinator.canNotifyStatusChanged(Request)>
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
	//    1    1:getfield        #28  <Field RequestCoordinator parent>
	//    2    4:astore_1        
		return requestcoordinator == null || requestcoordinator.canSetImage(((Request) (this)));
	//    3    5:aload_1         
	//    4    6:ifnull          24
	//    5    9:aload_1         
	//    6   10:aload_0         
	//    7   11:invokeinterface #43  <Method boolean RequestCoordinator.canSetImage(Request)>
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
	//    1    1:getfield        #28  <Field RequestCoordinator parent>
	//    2    4:astore_1        
		return requestcoordinator != null && requestcoordinator.isAnyResourceSet();
	//    3    5:aload_1         
	//    4    6:ifnull          20
	//    5    9:aload_1         
	//    6   10:invokeinterface #47  <Method boolean RequestCoordinator.isAnyResourceSet()>
	//    7   15:ifeq            20
	//    8   18:iconst_1        
	//    9   19:ireturn         
	//   10   20:iconst_0        
	//   11   21:ireturn         
	}

	public void begin()
	{
		isRunning = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #50  <Field boolean isRunning>
		if(!full.isComplete() && !thumb.isRunning())
	//*   3    5:aload_0         
	//*   4    6:getfield        #52  <Field Request full>
	//*   5    9:invokeinterface #55  <Method boolean Request.isComplete()>
	//*   6   14:ifne            38
	//*   7   17:aload_0         
	//*   8   18:getfield        #57  <Field Request thumb>
	//*   9   21:invokeinterface #59  <Method boolean Request.isRunning()>
	//*  10   26:ifne            38
			thumb.begin();
	//   11   29:aload_0         
	//   12   30:getfield        #57  <Field Request thumb>
	//   13   33:invokeinterface #61  <Method void Request.begin()>
		if(isRunning && !full.isRunning())
	//*  14   38:aload_0         
	//*  15   39:getfield        #50  <Field boolean isRunning>
	//*  16   42:ifeq            66
	//*  17   45:aload_0         
	//*  18   46:getfield        #52  <Field Request full>
	//*  19   49:invokeinterface #59  <Method boolean Request.isRunning()>
	//*  20   54:ifne            66
			full.begin();
	//   21   57:aload_0         
	//   22   58:getfield        #52  <Field Request full>
	//   23   61:invokeinterface #61  <Method void Request.begin()>
	//   24   66:return          
	}

	public boolean canNotifyCleared(Request request)
	{
		return parentCanNotifyCleared() && ((Object) (request)).equals(((Object) (full)));
	//    0    0:aload_0         
	//    1    1:invokespecial   #63  <Method boolean parentCanNotifyCleared()>
	//    2    4:ifeq            20
	//    3    7:aload_1         
	//    4    8:aload_0         
	//    5    9:getfield        #52  <Field Request full>
	//    6   12:invokevirtual   #67  <Method boolean Object.equals(Object)>
	//    7   15:ifeq            20
	//    8   18:iconst_1        
	//    9   19:ireturn         
	//   10   20:iconst_0        
	//   11   21:ireturn         
	}

	public boolean canNotifyStatusChanged(Request request)
	{
		return parentCanNotifyStatusChanged() && ((Object) (request)).equals(((Object) (full))) && !isAnyResourceSet();
	//    0    0:aload_0         
	//    1    1:invokespecial   #69  <Method boolean parentCanNotifyStatusChanged()>
	//    2    4:ifeq            27
	//    3    7:aload_1         
	//    4    8:aload_0         
	//    5    9:getfield        #52  <Field Request full>
	//    6   12:invokevirtual   #67  <Method boolean Object.equals(Object)>
	//    7   15:ifeq            27
	//    8   18:aload_0         
	//    9   19:invokevirtual   #70  <Method boolean isAnyResourceSet()>
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
	//    1    1:invokespecial   #72  <Method boolean parentCanSetImage()>
	//    2    4:ifeq            32
	//    3    7:aload_1         
	//    4    8:aload_0         
	//    5    9:getfield        #52  <Field Request full>
	//    6   12:invokevirtual   #67  <Method boolean Object.equals(Object)>
	//    7   15:ifne            30
	//    8   18:aload_0         
	//    9   19:getfield        #52  <Field Request full>
	//   10   22:invokeinterface #75  <Method boolean Request.isResourceSet()>
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
	//    2    2:putfield        #50  <Field boolean isRunning>
		thumb.clear();
	//    3    5:aload_0         
	//    4    6:getfield        #57  <Field Request thumb>
	//    5    9:invokeinterface #78  <Method void Request.clear()>
		full.clear();
	//    6   14:aload_0         
	//    7   15:getfield        #52  <Field Request full>
	//    8   18:invokeinterface #78  <Method void Request.clear()>
	//    9   23:return          
	}

	public boolean isAnyResourceSet()
	{
		return parentIsAnyResourceSet() || isResourceSet();
	//    0    0:aload_0         
	//    1    1:invokespecial   #80  <Method boolean parentIsAnyResourceSet()>
	//    2    4:ifne            19
	//    3    7:aload_0         
	//    4    8:invokevirtual   #81  <Method boolean isResourceSet()>
	//    5   11:ifeq            17
	//    6   14:goto            19
	//    7   17:iconst_0        
	//    8   18:ireturn         
	//    9   19:iconst_1        
	//   10   20:ireturn         
	}

	public boolean isCleared()
	{
		return full.isCleared();
	//    0    0:aload_0         
	//    1    1:getfield        #52  <Field Request full>
	//    2    4:invokeinterface #84  <Method boolean Request.isCleared()>
	//    3    9:ireturn         
	}

	public boolean isComplete()
	{
		return full.isComplete() || thumb.isComplete();
	//    0    0:aload_0         
	//    1    1:getfield        #52  <Field Request full>
	//    2    4:invokeinterface #55  <Method boolean Request.isComplete()>
	//    3    9:ifne            29
	//    4   12:aload_0         
	//    5   13:getfield        #57  <Field Request thumb>
	//    6   16:invokeinterface #55  <Method boolean Request.isComplete()>
	//    7   21:ifeq            27
	//    8   24:goto            29
	//    9   27:iconst_0        
	//   10   28:ireturn         
	//   11   29:iconst_1        
	//   12   30:ireturn         
	}

	public boolean isEquivalentTo(Request request)
	{
label0:
		{
			boolean flag;
label1:
			{
				flag = request instanceof ThumbnailRequestCoordinator;
	//    0    0:aload_1         
	//    1    1:instanceof      #2   <Class ThumbnailRequestCoordinator>
	//    2    4:istore_2        
				boolean flag1 = false;
	//    3    5:iconst_0        
	//    4    6:istore_3        
				if(!flag)
					break label0;
	//    5    7:iload_2         
	//    6    8:ifeq            98
				request = ((Request) ((ThumbnailRequestCoordinator)request));
	//    7   11:aload_1         
	//    8   12:checkcast       #2   <Class ThumbnailRequestCoordinator>
	//    9   15:astore_1        
				Request request1 = full;
	//   10   16:aload_0         
	//   11   17:getfield        #52  <Field Request full>
	//   12   20:astore          4
				if(request1 == null)
	//*  13   22:aload           4
	//*  14   24:ifnonnull       39
				{
					flag = flag1;
	//   15   27:iload_3         
	//   16   28:istore_2        
					if(((ThumbnailRequestCoordinator) (request)).full != null)
	//*  17   29:aload_1         
	//*  18   30:getfield        #52  <Field Request full>
	//*  19   33:ifnonnull       96
						break label1;
	//   20   36:goto            55
				} else
				{
					flag = flag1;
	//   21   39:iload_3         
	//   22   40:istore_2        
					if(!request1.isEquivalentTo(((ThumbnailRequestCoordinator) (request)).full))
						break label1;
	//   23   41:aload           4
	//   24   43:aload_1         
	//   25   44:getfield        #52  <Field Request full>
	//   26   47:invokeinterface #87  <Method boolean Request.isEquivalentTo(Request)>
	//   27   52:ifeq            96
				}
				request1 = thumb;
	//   28   55:aload_0         
	//   29   56:getfield        #57  <Field Request thumb>
	//   30   59:astore          4
				if(request1 == null)
	//*  31   61:aload           4
	//*  32   63:ifnonnull       78
				{
					flag = flag1;
	//   33   66:iload_3         
	//   34   67:istore_2        
					if(((ThumbnailRequestCoordinator) (request)).thumb != null)
	//*  35   68:aload_1         
	//*  36   69:getfield        #57  <Field Request thumb>
	//*  37   72:ifnonnull       96
						break label1;
	//   38   75:goto            94
				} else
				{
					flag = flag1;
	//   39   78:iload_3         
	//   40   79:istore_2        
					if(!request1.isEquivalentTo(((ThumbnailRequestCoordinator) (request)).thumb))
						break label1;
	//   41   80:aload           4
	//   42   82:aload_1         
	//   43   83:getfield        #57  <Field Request thumb>
	//   44   86:invokeinterface #87  <Method boolean Request.isEquivalentTo(Request)>
	//   45   91:ifeq            96
				}
				flag = true;
	//   46   94:iconst_1        
	//   47   95:istore_2        
			}
			return flag;
	//   48   96:iload_2         
	//   49   97:ireturn         
		}
		return false;
	//   50   98:iconst_0        
	//   51   99:ireturn         
	}

	public boolean isFailed()
	{
		return full.isFailed();
	//    0    0:aload_0         
	//    1    1:getfield        #52  <Field Request full>
	//    2    4:invokeinterface #90  <Method boolean Request.isFailed()>
	//    3    9:ireturn         
	}

	public boolean isResourceSet()
	{
		return full.isResourceSet() || thumb.isResourceSet();
	//    0    0:aload_0         
	//    1    1:getfield        #52  <Field Request full>
	//    2    4:invokeinterface #75  <Method boolean Request.isResourceSet()>
	//    3    9:ifne            29
	//    4   12:aload_0         
	//    5   13:getfield        #57  <Field Request thumb>
	//    6   16:invokeinterface #75  <Method boolean Request.isResourceSet()>
	//    7   21:ifeq            27
	//    8   24:goto            29
	//    9   27:iconst_0        
	//   10   28:ireturn         
	//   11   29:iconst_1        
	//   12   30:ireturn         
	}

	public boolean isRunning()
	{
		return full.isRunning();
	//    0    0:aload_0         
	//    1    1:getfield        #52  <Field Request full>
	//    2    4:invokeinterface #59  <Method boolean Request.isRunning()>
	//    3    9:ireturn         
	}

	public void onRequestFailed(Request request)
	{
		if(!((Object) (request)).equals(((Object) (full))))
	//*   0    0:aload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #52  <Field Request full>
	//*   3    5:invokevirtual   #67  <Method boolean Object.equals(Object)>
	//*   4    8:ifne            12
			return;
	//    5   11:return          
		request = ((Request) (parent));
	//    6   12:aload_0         
	//    7   13:getfield        #28  <Field RequestCoordinator parent>
	//    8   16:astore_1        
		if(request != null)
	//*   9   17:aload_1         
	//*  10   18:ifnull          28
			((RequestCoordinator) (request)).onRequestFailed(((Request) (this)));
	//   11   21:aload_1         
	//   12   22:aload_0         
	//   13   23:invokeinterface #94  <Method void RequestCoordinator.onRequestFailed(Request)>
	//   14   28:return          
	}

	public void onRequestSuccess(Request request)
	{
		if(((Object) (request)).equals(((Object) (thumb))))
	//*   0    0:aload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #57  <Field Request thumb>
	//*   3    5:invokevirtual   #67  <Method boolean Object.equals(Object)>
	//*   4    8:ifeq            12
			return;
	//    5   11:return          
		request = ((Request) (parent));
	//    6   12:aload_0         
	//    7   13:getfield        #28  <Field RequestCoordinator parent>
	//    8   16:astore_1        
		if(request != null)
	//*   9   17:aload_1         
	//*  10   18:ifnull          28
			((RequestCoordinator) (request)).onRequestSuccess(((Request) (this)));
	//   11   21:aload_1         
	//   12   22:aload_0         
	//   13   23:invokeinterface #97  <Method void RequestCoordinator.onRequestSuccess(Request)>
		if(!thumb.isComplete())
	//*  14   28:aload_0         
	//*  15   29:getfield        #57  <Field Request thumb>
	//*  16   32:invokeinterface #55  <Method boolean Request.isComplete()>
	//*  17   37:ifne            49
			thumb.clear();
	//   18   40:aload_0         
	//   19   41:getfield        #57  <Field Request thumb>
	//   20   44:invokeinterface #78  <Method void Request.clear()>
	//   21   49:return          
	}

	public void recycle()
	{
		full.recycle();
	//    0    0:aload_0         
	//    1    1:getfield        #52  <Field Request full>
	//    2    4:invokeinterface #100 <Method void Request.recycle()>
		thumb.recycle();
	//    3    9:aload_0         
	//    4   10:getfield        #57  <Field Request thumb>
	//    5   13:invokeinterface #100 <Method void Request.recycle()>
	//    6   18:return          
	}

	public void setRequests(Request request, Request request1)
	{
		full = request;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #52  <Field Request full>
		thumb = request1;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #57  <Field Request thumb>
	//    6   10:return          
	}

	private Request full;
	private boolean isRunning;
	private final RequestCoordinator parent;
	private Request thumb;
}

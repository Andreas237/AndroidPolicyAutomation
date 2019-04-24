// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.load.engine;

import android.os.Looper;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.util.Preconditions;

// Referenced classes of package com.bumptech.glide.load.engine:
//			Resource

class EngineResource
	implements Resource
{
	static interface ResourceListener
	{

		public abstract void onResourceReleased(Key key1, EngineResource engineresource);
	}


	EngineResource(Resource resource1, boolean flag)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #27  <Method void Object()>
		resource = (Resource)Preconditions.checkNotNull(((Object) (resource1)));
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokestatic    #33  <Method Object Preconditions.checkNotNull(Object)>
	//    5    9:checkcast       #7   <Class Resource>
	//    6   12:putfield        #35  <Field Resource resource>
		isCacheable = flag;
	//    7   15:aload_0         
	//    8   16:iload_2         
	//    9   17:putfield        #37  <Field boolean isCacheable>
	//   10   20:return          
	}

	void acquire()
	{
		if(isRecycled)
	//*   0    0:aload_0         
	//*   1    1:getfield        #43  <Field boolean isRecycled>
	//*   2    4:ifeq            17
			throw new IllegalStateException("Cannot acquire a recycled resource");
	//    3    7:new             #45  <Class IllegalStateException>
	//    4   10:dup             
	//    5   11:ldc1            #47  <String "Cannot acquire a recycled resource">
	//    6   13:invokespecial   #50  <Method void IllegalStateException(String)>
	//    7   16:athrow          
		if(!((Object) (Looper.getMainLooper())).equals(((Object) (Looper.myLooper()))))
	//*   8   17:invokestatic    #56  <Method Looper Looper.getMainLooper()>
	//*   9   20:invokestatic    #59  <Method Looper Looper.myLooper()>
	//*  10   23:invokevirtual   #63  <Method boolean Object.equals(Object)>
	//*  11   26:ifne            39
		{
			throw new IllegalThreadStateException("Must call acquire on the main thread");
	//   12   29:new             #65  <Class IllegalThreadStateException>
	//   13   32:dup             
	//   14   33:ldc1            #67  <String "Must call acquire on the main thread">
	//   15   35:invokespecial   #68  <Method void IllegalThreadStateException(String)>
	//   16   38:athrow          
		} else
		{
			acquired = acquired + 1;
	//   17   39:aload_0         
	//   18   40:aload_0         
	//   19   41:getfield        #70  <Field int acquired>
	//   20   44:iconst_1        
	//   21   45:iadd            
	//   22   46:putfield        #70  <Field int acquired>
			return;
	//   23   49:return          
		}
	}

	public Object get()
	{
		return resource.get();
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field Resource resource>
	//    2    4:invokeinterface #74  <Method Object Resource.get()>
	//    3    9:areturn         
	}

	public Class getResourceClass()
	{
		return resource.getResourceClass();
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field Resource resource>
	//    2    4:invokeinterface #79  <Method Class Resource.getResourceClass()>
	//    3    9:areturn         
	}

	public int getSize()
	{
		return resource.getSize();
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field Resource resource>
	//    2    4:invokeinterface #84  <Method int Resource.getSize()>
	//    3    9:ireturn         
	}

	boolean isCacheable()
	{
		return isCacheable;
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field boolean isCacheable>
	//    2    4:ireturn         
	}

	public void recycle()
	{
		if(acquired > 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #70  <Field int acquired>
	//*   2    4:ifle            17
			throw new IllegalStateException("Cannot recycle a resource while it is still acquired");
	//    3    7:new             #45  <Class IllegalStateException>
	//    4   10:dup             
	//    5   11:ldc1            #88  <String "Cannot recycle a resource while it is still acquired">
	//    6   13:invokespecial   #50  <Method void IllegalStateException(String)>
	//    7   16:athrow          
		if(isRecycled)
	//*   8   17:aload_0         
	//*   9   18:getfield        #43  <Field boolean isRecycled>
	//*  10   21:ifeq            34
		{
			throw new IllegalStateException("Cannot recycle a resource that has already been recycled");
	//   11   24:new             #45  <Class IllegalStateException>
	//   12   27:dup             
	//   13   28:ldc1            #90  <String "Cannot recycle a resource that has already been recycled">
	//   14   30:invokespecial   #50  <Method void IllegalStateException(String)>
	//   15   33:athrow          
		} else
		{
			isRecycled = true;
	//   16   34:aload_0         
	//   17   35:iconst_1        
	//   18   36:putfield        #43  <Field boolean isRecycled>
			resource.recycle();
	//   19   39:aload_0         
	//   20   40:getfield        #35  <Field Resource resource>
	//   21   43:invokeinterface #92  <Method void Resource.recycle()>
			return;
	//   22   48:return          
		}
	}

	void release()
	{
		if(acquired <= 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #70  <Field int acquired>
	//*   2    4:ifgt            17
			throw new IllegalStateException("Cannot release a recycled or not yet acquired resource");
	//    3    7:new             #45  <Class IllegalStateException>
	//    4   10:dup             
	//    5   11:ldc1            #95  <String "Cannot release a recycled or not yet acquired resource">
	//    6   13:invokespecial   #50  <Method void IllegalStateException(String)>
	//    7   16:athrow          
		if(!((Object) (Looper.getMainLooper())).equals(((Object) (Looper.myLooper()))))
	//*   8   17:invokestatic    #56  <Method Looper Looper.getMainLooper()>
	//*   9   20:invokestatic    #59  <Method Looper Looper.myLooper()>
	//*  10   23:invokevirtual   #63  <Method boolean Object.equals(Object)>
	//*  11   26:ifne            39
			throw new IllegalThreadStateException("Must call release on the main thread");
	//   12   29:new             #65  <Class IllegalThreadStateException>
	//   13   32:dup             
	//   14   33:ldc1            #97  <String "Must call release on the main thread">
	//   15   35:invokespecial   #68  <Method void IllegalThreadStateException(String)>
	//   16   38:athrow          
		int i = acquired - 1;
	//   17   39:aload_0         
	//   18   40:getfield        #70  <Field int acquired>
	//   19   43:iconst_1        
	//   20   44:isub            
	//   21   45:istore_1        
		acquired = i;
	//   22   46:aload_0         
	//   23   47:iload_1         
	//   24   48:putfield        #70  <Field int acquired>
		if(i == 0)
	//*  25   51:iload_1         
	//*  26   52:ifne            69
			listener.onResourceReleased(key, this);
	//   27   55:aload_0         
	//   28   56:getfield        #99  <Field EngineResource$ResourceListener listener>
	//   29   59:aload_0         
	//   30   60:getfield        #101 <Field Key key>
	//   31   63:aload_0         
	//   32   64:invokeinterface #105 <Method void EngineResource$ResourceListener.onResourceReleased(Key, EngineResource)>
	//   33   69:return          
	}

	void setResourceListener(Key key1, ResourceListener resourcelistener)
	{
		key = key1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #101 <Field Key key>
		listener = resourcelistener;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #99  <Field EngineResource$ResourceListener listener>
	//    6   10:return          
	}

	public String toString()
	{
		return (new StringBuilder()).append("EngineResource{isCacheable=").append(isCacheable).append(", listener=").append(((Object) (listener))).append(", key=").append(((Object) (key))).append(", acquired=").append(acquired).append(", isRecycled=").append(isRecycled).append(", resource=").append(((Object) (resource))).append('}').toString();
	//    0    0:new             #111 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #112 <Method void StringBuilder()>
	//    3    7:ldc1            #114 <String "EngineResource{isCacheable=">
	//    4    9:invokevirtual   #118 <Method StringBuilder StringBuilder.append(String)>
	//    5   12:aload_0         
	//    6   13:getfield        #37  <Field boolean isCacheable>
	//    7   16:invokevirtual   #121 <Method StringBuilder StringBuilder.append(boolean)>
	//    8   19:ldc1            #123 <String ", listener=">
	//    9   21:invokevirtual   #118 <Method StringBuilder StringBuilder.append(String)>
	//   10   24:aload_0         
	//   11   25:getfield        #99  <Field EngineResource$ResourceListener listener>
	//   12   28:invokevirtual   #126 <Method StringBuilder StringBuilder.append(Object)>
	//   13   31:ldc1            #128 <String ", key=">
	//   14   33:invokevirtual   #118 <Method StringBuilder StringBuilder.append(String)>
	//   15   36:aload_0         
	//   16   37:getfield        #101 <Field Key key>
	//   17   40:invokevirtual   #126 <Method StringBuilder StringBuilder.append(Object)>
	//   18   43:ldc1            #130 <String ", acquired=">
	//   19   45:invokevirtual   #118 <Method StringBuilder StringBuilder.append(String)>
	//   20   48:aload_0         
	//   21   49:getfield        #70  <Field int acquired>
	//   22   52:invokevirtual   #133 <Method StringBuilder StringBuilder.append(int)>
	//   23   55:ldc1            #135 <String ", isRecycled=">
	//   24   57:invokevirtual   #118 <Method StringBuilder StringBuilder.append(String)>
	//   25   60:aload_0         
	//   26   61:getfield        #43  <Field boolean isRecycled>
	//   27   64:invokevirtual   #121 <Method StringBuilder StringBuilder.append(boolean)>
	//   28   67:ldc1            #137 <String ", resource=">
	//   29   69:invokevirtual   #118 <Method StringBuilder StringBuilder.append(String)>
	//   30   72:aload_0         
	//   31   73:getfield        #35  <Field Resource resource>
	//   32   76:invokevirtual   #126 <Method StringBuilder StringBuilder.append(Object)>
	//   33   79:bipush          125
	//   34   81:invokevirtual   #140 <Method StringBuilder StringBuilder.append(char)>
	//   35   84:invokevirtual   #142 <Method String StringBuilder.toString()>
	//   36   87:areturn         
	}

	private int acquired;
	private final boolean isCacheable;
	private boolean isRecycled;
	private Key key;
	private ResourceListener listener;
	private final Resource resource;
}

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


	EngineResource(Resource resource1, boolean flag, boolean flag1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #28  <Method void Object()>
		resource = (Resource)Preconditions.checkNotNull(((Object) (resource1)));
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokestatic    #34  <Method Object Preconditions.checkNotNull(Object)>
	//    5    9:checkcast       #7   <Class Resource>
	//    6   12:putfield        #36  <Field Resource resource>
		isCacheable = flag;
	//    7   15:aload_0         
	//    8   16:iload_2         
	//    9   17:putfield        #38  <Field boolean isCacheable>
		isRecyclable = flag1;
	//   10   20:aload_0         
	//   11   21:iload_3         
	//   12   22:putfield        #40  <Field boolean isRecyclable>
	//   13   25:return          
	}

	void acquire()
	{
		if(!isRecycled)
	//*   0    0:aload_0         
	//*   1    1:getfield        #46  <Field boolean isRecycled>
	//*   2    4:ifne            40
		{
			if(((Object) (Looper.getMainLooper())).equals(((Object) (Looper.myLooper()))))
	//*   3    7:invokestatic    #52  <Method Looper Looper.getMainLooper()>
	//*   4   10:invokestatic    #55  <Method Looper Looper.myLooper()>
	//*   5   13:invokevirtual   #59  <Method boolean Object.equals(Object)>
	//*   6   16:ifeq            30
			{
				acquired = acquired + 1;
	//    7   19:aload_0         
	//    8   20:aload_0         
	//    9   21:getfield        #61  <Field int acquired>
	//   10   24:iconst_1        
	//   11   25:iadd            
	//   12   26:putfield        #61  <Field int acquired>
				return;
	//   13   29:return          
			} else
			{
				throw new IllegalThreadStateException("Must call acquire on the main thread");
	//   14   30:new             #63  <Class IllegalThreadStateException>
	//   15   33:dup             
	//   16   34:ldc1            #65  <String "Must call acquire on the main thread">
	//   17   36:invokespecial   #68  <Method void IllegalThreadStateException(String)>
	//   18   39:athrow          
			}
		} else
		{
			throw new IllegalStateException("Cannot acquire a recycled resource");
	//   19   40:new             #70  <Class IllegalStateException>
	//   20   43:dup             
	//   21   44:ldc1            #72  <String "Cannot acquire a recycled resource">
	//   22   46:invokespecial   #73  <Method void IllegalStateException(String)>
	//   23   49:athrow          
		}
	}

	public Object get()
	{
		return resource.get();
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field Resource resource>
	//    2    4:invokeinterface #78  <Method Object Resource.get()>
	//    3    9:areturn         
	}

	Resource getResource()
	{
		return resource;
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field Resource resource>
	//    2    4:areturn         
	}

	public Class getResourceClass()
	{
		return resource.getResourceClass();
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field Resource resource>
	//    2    4:invokeinterface #87  <Method Class Resource.getResourceClass()>
	//    3    9:areturn         
	}

	public int getSize()
	{
		return resource.getSize();
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field Resource resource>
	//    2    4:invokeinterface #92  <Method int Resource.getSize()>
	//    3    9:ireturn         
	}

	boolean isCacheable()
	{
		return isCacheable;
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field boolean isCacheable>
	//    2    4:ireturn         
	}

	public void recycle()
	{
		if(acquired <= 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #61  <Field int acquired>
	//*   2    4:ifgt            46
		{
			if(!isRecycled)
	//*   3    7:aload_0         
	//*   4    8:getfield        #46  <Field boolean isRecycled>
	//*   5   11:ifne            36
			{
				isRecycled = true;
	//    6   14:aload_0         
	//    7   15:iconst_1        
	//    8   16:putfield        #46  <Field boolean isRecycled>
				if(isRecyclable)
	//*   9   19:aload_0         
	//*  10   20:getfield        #40  <Field boolean isRecyclable>
	//*  11   23:ifeq            35
					resource.recycle();
	//   12   26:aload_0         
	//   13   27:getfield        #36  <Field Resource resource>
	//   14   30:invokeinterface #96  <Method void Resource.recycle()>
				return;
	//   15   35:return          
			} else
			{
				throw new IllegalStateException("Cannot recycle a resource that has already been recycled");
	//   16   36:new             #70  <Class IllegalStateException>
	//   17   39:dup             
	//   18   40:ldc1            #98  <String "Cannot recycle a resource that has already been recycled">
	//   19   42:invokespecial   #73  <Method void IllegalStateException(String)>
	//   20   45:athrow          
			}
		} else
		{
			throw new IllegalStateException("Cannot recycle a resource while it is still acquired");
	//   21   46:new             #70  <Class IllegalStateException>
	//   22   49:dup             
	//   23   50:ldc1            #100 <String "Cannot recycle a resource while it is still acquired">
	//   24   52:invokespecial   #73  <Method void IllegalStateException(String)>
	//   25   55:athrow          
		}
	}

	void release()
	{
		if(acquired > 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #61  <Field int acquired>
	//*   2    4:ifle            60
		{
			if(((Object) (Looper.getMainLooper())).equals(((Object) (Looper.myLooper()))))
	//*   3    7:invokestatic    #52  <Method Looper Looper.getMainLooper()>
	//*   4   10:invokestatic    #55  <Method Looper Looper.myLooper()>
	//*   5   13:invokevirtual   #59  <Method boolean Object.equals(Object)>
	//*   6   16:ifeq            50
			{
				int i = acquired - 1;
	//    7   19:aload_0         
	//    8   20:getfield        #61  <Field int acquired>
	//    9   23:iconst_1        
	//   10   24:isub            
	//   11   25:istore_1        
				acquired = i;
	//   12   26:aload_0         
	//   13   27:iload_1         
	//   14   28:putfield        #61  <Field int acquired>
				if(i == 0)
	//*  15   31:iload_1         
	//*  16   32:ifne            49
					listener.onResourceReleased(key, this);
	//   17   35:aload_0         
	//   18   36:getfield        #103 <Field EngineResource$ResourceListener listener>
	//   19   39:aload_0         
	//   20   40:getfield        #105 <Field Key key>
	//   21   43:aload_0         
	//   22   44:invokeinterface #109 <Method void EngineResource$ResourceListener.onResourceReleased(Key, EngineResource)>
				return;
	//   23   49:return          
			} else
			{
				throw new IllegalThreadStateException("Must call release on the main thread");
	//   24   50:new             #63  <Class IllegalThreadStateException>
	//   25   53:dup             
	//   26   54:ldc1            #111 <String "Must call release on the main thread">
	//   27   56:invokespecial   #68  <Method void IllegalThreadStateException(String)>
	//   28   59:athrow          
			}
		} else
		{
			throw new IllegalStateException("Cannot release a recycled or not yet acquired resource");
	//   29   60:new             #70  <Class IllegalStateException>
	//   30   63:dup             
	//   31   64:ldc1            #113 <String "Cannot release a recycled or not yet acquired resource">
	//   32   66:invokespecial   #73  <Method void IllegalStateException(String)>
	//   33   69:athrow          
		}
	}

	void setResourceListener(Key key1, ResourceListener resourcelistener)
	{
		key = key1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #105 <Field Key key>
		listener = resourcelistener;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #103 <Field EngineResource$ResourceListener listener>
	//    6   10:return          
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #119 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #120 <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append("EngineResource{isCacheable=");
	//    4    8:aload_1         
	//    5    9:ldc1            #122 <String "EngineResource{isCacheable=">
	//    6   11:invokevirtual   #126 <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		stringbuilder.append(isCacheable);
	//    8   15:aload_1         
	//    9   16:aload_0         
	//   10   17:getfield        #38  <Field boolean isCacheable>
	//   11   20:invokevirtual   #129 <Method StringBuilder StringBuilder.append(boolean)>
	//   12   23:pop             
		stringbuilder.append(", listener=");
	//   13   24:aload_1         
	//   14   25:ldc1            #131 <String ", listener=">
	//   15   27:invokevirtual   #126 <Method StringBuilder StringBuilder.append(String)>
	//   16   30:pop             
		stringbuilder.append(((Object) (listener)));
	//   17   31:aload_1         
	//   18   32:aload_0         
	//   19   33:getfield        #103 <Field EngineResource$ResourceListener listener>
	//   20   36:invokevirtual   #134 <Method StringBuilder StringBuilder.append(Object)>
	//   21   39:pop             
		stringbuilder.append(", key=");
	//   22   40:aload_1         
	//   23   41:ldc1            #136 <String ", key=">
	//   24   43:invokevirtual   #126 <Method StringBuilder StringBuilder.append(String)>
	//   25   46:pop             
		stringbuilder.append(((Object) (key)));
	//   26   47:aload_1         
	//   27   48:aload_0         
	//   28   49:getfield        #105 <Field Key key>
	//   29   52:invokevirtual   #134 <Method StringBuilder StringBuilder.append(Object)>
	//   30   55:pop             
		stringbuilder.append(", acquired=");
	//   31   56:aload_1         
	//   32   57:ldc1            #138 <String ", acquired=">
	//   33   59:invokevirtual   #126 <Method StringBuilder StringBuilder.append(String)>
	//   34   62:pop             
		stringbuilder.append(acquired);
	//   35   63:aload_1         
	//   36   64:aload_0         
	//   37   65:getfield        #61  <Field int acquired>
	//   38   68:invokevirtual   #141 <Method StringBuilder StringBuilder.append(int)>
	//   39   71:pop             
		stringbuilder.append(", isRecycled=");
	//   40   72:aload_1         
	//   41   73:ldc1            #143 <String ", isRecycled=">
	//   42   75:invokevirtual   #126 <Method StringBuilder StringBuilder.append(String)>
	//   43   78:pop             
		stringbuilder.append(isRecycled);
	//   44   79:aload_1         
	//   45   80:aload_0         
	//   46   81:getfield        #46  <Field boolean isRecycled>
	//   47   84:invokevirtual   #129 <Method StringBuilder StringBuilder.append(boolean)>
	//   48   87:pop             
		stringbuilder.append(", resource=");
	//   49   88:aload_1         
	//   50   89:ldc1            #145 <String ", resource=">
	//   51   91:invokevirtual   #126 <Method StringBuilder StringBuilder.append(String)>
	//   52   94:pop             
		stringbuilder.append(((Object) (resource)));
	//   53   95:aload_1         
	//   54   96:aload_0         
	//   55   97:getfield        #36  <Field Resource resource>
	//   56  100:invokevirtual   #134 <Method StringBuilder StringBuilder.append(Object)>
	//   57  103:pop             
		stringbuilder.append('}');
	//   58  104:aload_1         
	//   59  105:bipush          125
	//   60  107:invokevirtual   #148 <Method StringBuilder StringBuilder.append(char)>
	//   61  110:pop             
		return stringbuilder.toString();
	//   62  111:aload_1         
	//   63  112:invokevirtual   #150 <Method String StringBuilder.toString()>
	//   64  115:areturn         
	}

	private int acquired;
	private final boolean isCacheable;
	private final boolean isRecyclable;
	private boolean isRecycled;
	private Key key;
	private ResourceListener listener;
	private final Resource resource;
}

// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.load.engine;

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
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		if(isRecycled)
			break MISSING_BLOCK_LABEL_22;
	//    2    2:aload_0         
	//    3    3:getfield        #46  <Field boolean isRecycled>
	//    4    6:ifne            22
		acquired = acquired + 1;
	//    5    9:aload_0         
	//    6   10:aload_0         
	//    7   11:getfield        #48  <Field int acquired>
	//    8   14:iconst_1        
	//    9   15:iadd            
	//   10   16:putfield        #48  <Field int acquired>
		this;
	//   11   19:aload_0         
		JVM INSTR monitorexit ;
	//   12   20:monitorexit     
		return;
	//   13   21:return          
		throw new IllegalStateException("Cannot acquire a recycled resource");
	//   14   22:new             #50  <Class IllegalStateException>
	//   15   25:dup             
	//   16   26:ldc1            #52  <String "Cannot acquire a recycled resource">
	//   17   28:invokespecial   #55  <Method void IllegalStateException(String)>
	//   18   31:athrow          
		Exception exception;
		exception;
	//   19   32:astore_1        
		this;
	//   20   33:aload_0         
		JVM INSTR monitorexit ;
	//   21   34:monitorexit     
		throw exception;
	//   22   35:aload_1         
	//   23   36:athrow          
	}

	public Object get()
	{
		return resource.get();
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field Resource resource>
	//    2    4:invokeinterface #60  <Method Object Resource.get()>
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
	//    2    4:invokeinterface #69  <Method Class Resource.getResourceClass()>
	//    3    9:areturn         
	}

	public int getSize()
	{
		return resource.getSize();
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field Resource resource>
	//    2    4:invokeinterface #74  <Method int Resource.getSize()>
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
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		if(acquired > 0)
			break MISSING_BLOCK_LABEL_50;
	//    2    2:aload_0         
	//    3    3:getfield        #48  <Field int acquired>
	//    4    6:ifgt            50
		if(isRecycled)
			break MISSING_BLOCK_LABEL_40;
	//    5    9:aload_0         
	//    6   10:getfield        #46  <Field boolean isRecycled>
	//    7   13:ifne            40
		isRecycled = true;
	//    8   16:aload_0         
	//    9   17:iconst_1        
	//   10   18:putfield        #46  <Field boolean isRecycled>
		if(isRecyclable)
	//*  11   21:aload_0         
	//*  12   22:getfield        #40  <Field boolean isRecyclable>
	//*  13   25:ifeq            37
			resource.recycle();
	//   14   28:aload_0         
	//   15   29:getfield        #36  <Field Resource resource>
	//   16   32:invokeinterface #78  <Method void Resource.recycle()>
		this;
	//   17   37:aload_0         
		JVM INSTR monitorexit ;
	//   18   38:monitorexit     
		return;
	//   19   39:return          
		throw new IllegalStateException("Cannot recycle a resource that has already been recycled");
	//   20   40:new             #50  <Class IllegalStateException>
	//   21   43:dup             
	//   22   44:ldc1            #80  <String "Cannot recycle a resource that has already been recycled">
	//   23   46:invokespecial   #55  <Method void IllegalStateException(String)>
	//   24   49:athrow          
		throw new IllegalStateException("Cannot recycle a resource while it is still acquired");
	//   25   50:new             #50  <Class IllegalStateException>
	//   26   53:dup             
	//   27   54:ldc1            #82  <String "Cannot recycle a resource while it is still acquired">
	//   28   56:invokespecial   #55  <Method void IllegalStateException(String)>
	//   29   59:athrow          
		Exception exception;
		exception;
	//   30   60:astore_1        
		this;
	//   31   61:aload_0         
		JVM INSTR monitorexit ;
	//   32   62:monitorexit     
		throw exception;
	//   33   63:aload_1         
	//   34   64:athrow          
	}

	void release()
	{
		ResourceListener resourcelistener = listener;
	//    0    0:aload_0         
	//    1    1:getfield        #85  <Field EngineResource$ResourceListener listener>
	//    2    4:astore_2        
		resourcelistener;
	//    3    5:aload_2         
		JVM INSTR monitorenter ;
	//    4    6:monitorenter    
		this;
	//    5    7:aload_0         
		JVM INSTR monitorenter ;
	//    6    8:monitorenter    
		int i;
		if(acquired <= 0)
			break MISSING_BLOCK_LABEL_51;
	//    7    9:aload_0         
	//    8   10:getfield        #48  <Field int acquired>
	//    9   13:ifle            51
		i = acquired - 1;
	//   10   16:aload_0         
	//   11   17:getfield        #48  <Field int acquired>
	//   12   20:iconst_1        
	//   13   21:isub            
	//   14   22:istore_1        
		acquired = i;
	//   15   23:aload_0         
	//   16   24:iload_1         
	//   17   25:putfield        #48  <Field int acquired>
		if(i != 0)
			break MISSING_BLOCK_LABEL_46;
	//   18   28:iload_1         
	//   19   29:ifne            46
		listener.onResourceReleased(key, this);
	//   20   32:aload_0         
	//   21   33:getfield        #85  <Field EngineResource$ResourceListener listener>
	//   22   36:aload_0         
	//   23   37:getfield        #87  <Field Key key>
	//   24   40:aload_0         
	//   25   41:invokeinterface #91  <Method void EngineResource$ResourceListener.onResourceReleased(Key, EngineResource)>
		this;
	//   26   46:aload_0         
		JVM INSTR monitorexit ;
	//   27   47:monitorexit     
		resourcelistener;
	//   28   48:aload_2         
		JVM INSTR monitorexit ;
	//   29   49:monitorexit     
		return;
	//   30   50:return          
		throw new IllegalStateException("Cannot release a recycled or not yet acquired resource");
	//   31   51:new             #50  <Class IllegalStateException>
	//   32   54:dup             
	//   33   55:ldc1            #93  <String "Cannot release a recycled or not yet acquired resource">
	//   34   57:invokespecial   #55  <Method void IllegalStateException(String)>
	//   35   60:athrow          
		Exception exception;
		exception;
	//   36   61:astore_3        
		this;
	//   37   62:aload_0         
		JVM INSTR monitorexit ;
	//   38   63:monitorexit     
		throw exception;
	//   39   64:aload_3         
	//   40   65:athrow          
		exception;
	//   41   66:astore_3        
		resourcelistener;
	//   42   67:aload_2         
		JVM INSTR monitorexit ;
	//   43   68:monitorexit     
		throw exception;
	//   44   69:aload_3         
	//   45   70:athrow          
	}

	void setResourceListener(Key key1, ResourceListener resourcelistener)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		key = key1;
	//    2    2:aload_0         
	//    3    3:aload_1         
	//    4    4:putfield        #87  <Field Key key>
		listener = resourcelistener;
	//    5    7:aload_0         
	//    6    8:aload_2         
	//    7    9:putfield        #85  <Field EngineResource$ResourceListener listener>
		this;
	//    8   12:aload_0         
		JVM INSTR monitorexit ;
	//    9   13:monitorexit     
		return;
	//   10   14:return          
		key1;
	//   11   15:astore_1        
	//*  12   16:aload_0         
		throw key1;
	//   13   17:monitorexit     
	//   14   18:aload_1         
	//   15   19:athrow          
	}

	public String toString()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		Object obj;
		obj = ((Object) (new StringBuilder()));
	//    2    2:new             #99  <Class StringBuilder>
	//    3    5:dup             
	//    4    6:invokespecial   #100 <Method void StringBuilder()>
	//    5    9:astore_1        
		((StringBuilder) (obj)).append("EngineResource{isCacheable=");
	//    6   10:aload_1         
	//    7   11:ldc1            #102 <String "EngineResource{isCacheable=">
	//    8   13:invokevirtual   #106 <Method StringBuilder StringBuilder.append(String)>
	//    9   16:pop             
		((StringBuilder) (obj)).append(isCacheable);
	//   10   17:aload_1         
	//   11   18:aload_0         
	//   12   19:getfield        #38  <Field boolean isCacheable>
	//   13   22:invokevirtual   #109 <Method StringBuilder StringBuilder.append(boolean)>
	//   14   25:pop             
		((StringBuilder) (obj)).append(", listener=");
	//   15   26:aload_1         
	//   16   27:ldc1            #111 <String ", listener=">
	//   17   29:invokevirtual   #106 <Method StringBuilder StringBuilder.append(String)>
	//   18   32:pop             
		((StringBuilder) (obj)).append(((Object) (listener)));
	//   19   33:aload_1         
	//   20   34:aload_0         
	//   21   35:getfield        #85  <Field EngineResource$ResourceListener listener>
	//   22   38:invokevirtual   #114 <Method StringBuilder StringBuilder.append(Object)>
	//   23   41:pop             
		((StringBuilder) (obj)).append(", key=");
	//   24   42:aload_1         
	//   25   43:ldc1            #116 <String ", key=">
	//   26   45:invokevirtual   #106 <Method StringBuilder StringBuilder.append(String)>
	//   27   48:pop             
		((StringBuilder) (obj)).append(((Object) (key)));
	//   28   49:aload_1         
	//   29   50:aload_0         
	//   30   51:getfield        #87  <Field Key key>
	//   31   54:invokevirtual   #114 <Method StringBuilder StringBuilder.append(Object)>
	//   32   57:pop             
		((StringBuilder) (obj)).append(", acquired=");
	//   33   58:aload_1         
	//   34   59:ldc1            #118 <String ", acquired=">
	//   35   61:invokevirtual   #106 <Method StringBuilder StringBuilder.append(String)>
	//   36   64:pop             
		((StringBuilder) (obj)).append(acquired);
	//   37   65:aload_1         
	//   38   66:aload_0         
	//   39   67:getfield        #48  <Field int acquired>
	//   40   70:invokevirtual   #121 <Method StringBuilder StringBuilder.append(int)>
	//   41   73:pop             
		((StringBuilder) (obj)).append(", isRecycled=");
	//   42   74:aload_1         
	//   43   75:ldc1            #123 <String ", isRecycled=">
	//   44   77:invokevirtual   #106 <Method StringBuilder StringBuilder.append(String)>
	//   45   80:pop             
		((StringBuilder) (obj)).append(isRecycled);
	//   46   81:aload_1         
	//   47   82:aload_0         
	//   48   83:getfield        #46  <Field boolean isRecycled>
	//   49   86:invokevirtual   #109 <Method StringBuilder StringBuilder.append(boolean)>
	//   50   89:pop             
		((StringBuilder) (obj)).append(", resource=");
	//   51   90:aload_1         
	//   52   91:ldc1            #125 <String ", resource=">
	//   53   93:invokevirtual   #106 <Method StringBuilder StringBuilder.append(String)>
	//   54   96:pop             
		((StringBuilder) (obj)).append(((Object) (resource)));
	//   55   97:aload_1         
	//   56   98:aload_0         
	//   57   99:getfield        #36  <Field Resource resource>
	//   58  102:invokevirtual   #114 <Method StringBuilder StringBuilder.append(Object)>
	//   59  105:pop             
		((StringBuilder) (obj)).append('}');
	//   60  106:aload_1         
	//   61  107:bipush          125
	//   62  109:invokevirtual   #128 <Method StringBuilder StringBuilder.append(char)>
	//   63  112:pop             
		obj = ((Object) (((StringBuilder) (obj)).toString()));
	//   64  113:aload_1         
	//   65  114:invokevirtual   #130 <Method String StringBuilder.toString()>
	//   66  117:astore_1        
		this;
	//   67  118:aload_0         
		JVM INSTR monitorexit ;
	//   68  119:monitorexit     
		return ((String) (obj));
	//   69  120:aload_1         
	//   70  121:areturn         
		Exception exception;
		exception;
	//   71  122:astore_1        
	//*  72  123:aload_0         
		throw exception;
	//   73  124:monitorexit     
	//   74  125:aload_1         
	//   75  126:athrow          
	}

	private int acquired;
	private final boolean isCacheable;
	private final boolean isRecyclable;
	private boolean isRecycled;
	private Key key;
	private ResourceListener listener;
	private final Resource resource;
}

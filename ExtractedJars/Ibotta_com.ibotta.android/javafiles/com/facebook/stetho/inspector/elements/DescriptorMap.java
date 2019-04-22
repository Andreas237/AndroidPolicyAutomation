// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.stetho.inspector.elements;

import com.facebook.stetho.common.Util;
import java.util.*;

// Referenced classes of package com.facebook.stetho.inspector.elements:
//			Descriptor, ChainedDescriptor

public final class DescriptorMap
{

	public DescriptorMap()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #17  <Class IdentityHashMap>
	//    4    8:dup             
	//    5    9:invokespecial   #18  <Method void IdentityHashMap()>
	//    6   12:putfield        #20  <Field Map mMap>
	//    7   15:return          
	}

	private Descriptor getImpl(Class class1)
	{
		for(; class1 != null; class1 = class1.getSuperclass())
	//*   0    0:aload_1         
	//*   1    1:ifnull          32
		{
			Descriptor descriptor = (Descriptor)mMap.get(((Object) (class1)));
	//    2    4:aload_0         
	//    3    5:getfield        #20  <Field Map mMap>
	//    4    8:aload_1         
	//    5    9:invokeinterface #30  <Method Object Map.get(Object)>
	//    6   14:checkcast       #32  <Class Descriptor>
	//    7   17:astore_2        
			if(descriptor != null)
	//*   8   18:aload_2         
	//*   9   19:ifnull          24
				return descriptor;
	//   10   22:aload_2         
	//   11   23:areturn         
		}

	//   12   24:aload_1         
	//   13   25:invokevirtual   #38  <Method Class Class.getSuperclass()>
	//   14   28:astore_1        
	//*  15   29:goto            0
		return null;
	//   16   32:aconst_null     
	//   17   33:areturn         
	}

	public DescriptorMap beginInit()
	{
		Util.throwIf(mIsInitializing);
	//    0    0:aload_0         
	//    1    1:getfield        #45  <Field boolean mIsInitializing>
	//    2    4:invokestatic    #51  <Method void Util.throwIf(boolean)>
		mIsInitializing = true;
	//    3    7:aload_0         
	//    4    8:iconst_1        
	//    5    9:putfield        #45  <Field boolean mIsInitializing>
		return this;
	//    6   12:aload_0         
	//    7   13:areturn         
	}

	public DescriptorMap endInit()
	{
		Util.throwIfNot(mIsInitializing);
	//    0    0:aload_0         
	//    1    1:getfield        #45  <Field boolean mIsInitializing>
	//    2    4:invokestatic    #55  <Method void Util.throwIfNot(boolean)>
		Util.throwIfNull(((Object) (mHost)));
	//    3    7:aload_0         
	//    4    8:getfield        #57  <Field Descriptor$Host mHost>
	//    5   11:invokestatic    #60  <Method Object Util.throwIfNull(Object)>
	//    6   14:pop             
		mIsInitializing = false;
	//    7   15:aload_0         
	//    8   16:iconst_0        
	//    9   17:putfield        #45  <Field boolean mIsInitializing>
		Descriptor descriptor;
		for(Iterator iterator = mMap.keySet().iterator(); iterator.hasNext(); descriptor.initialize(mHost))
	//*  10   20:aload_0         
	//*  11   21:getfield        #20  <Field Map mMap>
	//*  12   24:invokeinterface #64  <Method Set Map.keySet()>
	//*  13   29:invokeinterface #70  <Method Iterator Set.iterator()>
	//*  14   34:astore_1        
	//*  15   35:aload_1         
	//*  16   36:invokeinterface #76  <Method boolean Iterator.hasNext()>
	//*  17   41:ifeq            103
		{
			Class class1 = (Class)iterator.next();
	//   18   44:aload_1         
	//   19   45:invokeinterface #80  <Method Object Iterator.next()>
	//   20   50:checkcast       #34  <Class Class>
	//   21   53:astore_2        
			descriptor = (Descriptor)mMap.get(((Object) (class1)));
	//   22   54:aload_0         
	//   23   55:getfield        #20  <Field Map mMap>
	//   24   58:aload_2         
	//   25   59:invokeinterface #30  <Method Object Map.get(Object)>
	//   26   64:checkcast       #32  <Class Descriptor>
	//   27   67:astore_3        
			if(descriptor instanceof ChainedDescriptor)
	//*  28   68:aload_3         
	//*  29   69:instanceof      #82  <Class ChainedDescriptor>
	//*  30   72:ifeq            92
				((ChainedDescriptor)descriptor).setSuper(getImpl(class1.getSuperclass()));
	//   31   75:aload_3         
	//   32   76:checkcast       #82  <Class ChainedDescriptor>
	//   33   79:aload_0         
	//   34   80:aload_2         
	//   35   81:invokevirtual   #38  <Method Class Class.getSuperclass()>
	//   36   84:invokespecial   #84  <Method Descriptor getImpl(Class)>
	//   37   87:invokeinterface #88  <Method void ChainedDescriptor.setSuper(Descriptor)>
		}

	//   38   92:aload_3         
	//   39   93:aload_0         
	//   40   94:getfield        #57  <Field Descriptor$Host mHost>
	//   41   97:invokevirtual   #92  <Method void Descriptor.initialize(Descriptor$Host)>
	//*  42  100:goto            35
		return this;
	//   43  103:aload_0         
	//   44  104:areturn         
	}

	public Descriptor get(Class class1)
	{
		Util.throwIfNull(((Object) (class1)));
	//    0    0:aload_1         
	//    1    1:invokestatic    #60  <Method Object Util.throwIfNull(Object)>
	//    2    4:pop             
		Util.throwIf(mIsInitializing);
	//    3    5:aload_0         
	//    4    6:getfield        #45  <Field boolean mIsInitializing>
	//    5    9:invokestatic    #51  <Method void Util.throwIf(boolean)>
		return getImpl(class1);
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:invokespecial   #84  <Method Descriptor getImpl(Class)>
	//    9   17:areturn         
	}

	public DescriptorMap register(Class class1, Descriptor descriptor)
	{
		Util.throwIfNull(((Object) (class1)));
	//    0    0:aload_1         
	//    1    1:invokestatic    #60  <Method Object Util.throwIfNull(Object)>
	//    2    4:pop             
		Util.throwIfNull(((Object) (descriptor)));
	//    3    5:aload_2         
	//    4    6:invokestatic    #60  <Method Object Util.throwIfNull(Object)>
	//    5    9:pop             
		Util.throwIf(descriptor.isInitialized());
	//    6   10:aload_2         
	//    7   11:invokevirtual   #97  <Method boolean Descriptor.isInitialized()>
	//    8   14:invokestatic    #51  <Method void Util.throwIf(boolean)>
		Util.throwIfNot(mIsInitializing);
	//    9   17:aload_0         
	//   10   18:getfield        #45  <Field boolean mIsInitializing>
	//   11   21:invokestatic    #55  <Method void Util.throwIfNot(boolean)>
		if(!mMap.containsKey(((Object) (class1))))
	//*  12   24:aload_0         
	//*  13   25:getfield        #20  <Field Map mMap>
	//*  14   28:aload_1         
	//*  15   29:invokeinterface #101 <Method boolean Map.containsKey(Object)>
	//*  16   34:ifne            72
		{
			if(!mMap.containsValue(((Object) (descriptor))))
	//*  17   37:aload_0         
	//*  18   38:getfield        #20  <Field Map mMap>
	//*  19   41:aload_2         
	//*  20   42:invokeinterface #104 <Method boolean Map.containsValue(Object)>
	//*  21   47:ifne            64
			{
				mMap.put(((Object) (class1)), ((Object) (descriptor)));
	//   22   50:aload_0         
	//   23   51:getfield        #20  <Field Map mMap>
	//   24   54:aload_1         
	//   25   55:aload_2         
	//   26   56:invokeinterface #108 <Method Object Map.put(Object, Object)>
	//   27   61:pop             
				return this;
	//   28   62:aload_0         
	//   29   63:areturn         
			} else
			{
				throw new UnsupportedOperationException();
	//   30   64:new             #110 <Class UnsupportedOperationException>
	//   31   67:dup             
	//   32   68:invokespecial   #111 <Method void UnsupportedOperationException()>
	//   33   71:athrow          
			}
		} else
		{
			throw new UnsupportedOperationException();
	//   34   72:new             #110 <Class UnsupportedOperationException>
	//   35   75:dup             
	//   36   76:invokespecial   #111 <Method void UnsupportedOperationException()>
	//   37   79:athrow          
		}
	}

	public DescriptorMap setHost(Descriptor.Host host)
	{
		Util.throwIfNull(((Object) (host)));
	//    0    0:aload_1         
	//    1    1:invokestatic    #60  <Method Object Util.throwIfNull(Object)>
	//    2    4:pop             
		Util.throwIfNot(mIsInitializing);
	//    3    5:aload_0         
	//    4    6:getfield        #45  <Field boolean mIsInitializing>
	//    5    9:invokestatic    #55  <Method void Util.throwIfNot(boolean)>
		Util.throwIfNotNull(((Object) (mHost)));
	//    6   12:aload_0         
	//    7   13:getfield        #57  <Field Descriptor$Host mHost>
	//    8   16:invokestatic    #118 <Method void Util.throwIfNotNull(Object)>
		mHost = host;
	//    9   19:aload_0         
	//   10   20:aload_1         
	//   11   21:putfield        #57  <Field Descriptor$Host mHost>
		return this;
	//   12   24:aload_0         
	//   13   25:areturn         
	}

	private Descriptor.Host mHost;
	private boolean mIsInitializing;
	private final Map mMap = new IdentityHashMap();
}

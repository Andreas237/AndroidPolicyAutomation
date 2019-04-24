// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.load;

import android.content.Context;
import com.bumptech.glide.load.engine.Resource;
import java.security.MessageDigest;
import java.util.*;

// Referenced classes of package com.bumptech.glide.load:
//			Transformation

public class MultiTransformation
	implements Transformation
{

	public MultiTransformation(Collection collection)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
		if(collection.isEmpty())
	//*   2    4:aload_1         
	//*   3    5:invokeinterface #21  <Method boolean Collection.isEmpty()>
	//*   4   10:ifeq            23
		{
			throw new IllegalArgumentException("MultiTransformation must contain at least one Transformation");
	//    5   13:new             #23  <Class IllegalArgumentException>
	//    6   16:dup             
	//    7   17:ldc1            #25  <String "MultiTransformation must contain at least one Transformation">
	//    8   19:invokespecial   #28  <Method void IllegalArgumentException(String)>
	//    9   22:athrow          
		} else
		{
			transformations = collection;
	//   10   23:aload_0         
	//   11   24:aload_1         
	//   12   25:putfield        #30  <Field Collection transformations>
			return;
	//   13   28:return          
		}
	}

	public transient MultiTransformation(Transformation atransformation[])
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
		if(atransformation.length < 1)
	//*   2    4:aload_1         
	//*   3    5:arraylength     
	//*   4    6:iconst_1        
	//*   5    7:icmpge          20
		{
			throw new IllegalArgumentException("MultiTransformation must contain at least one Transformation");
	//    6   10:new             #23  <Class IllegalArgumentException>
	//    7   13:dup             
	//    8   14:ldc1            #25  <String "MultiTransformation must contain at least one Transformation">
	//    9   16:invokespecial   #28  <Method void IllegalArgumentException(String)>
	//   10   19:athrow          
		} else
		{
			transformations = ((Collection) (Arrays.asList(((Object []) (atransformation)))));
	//   11   20:aload_0         
	//   12   21:aload_1         
	//   13   22:invokestatic    #41  <Method java.util.List Arrays.asList(Object[])>
	//   14   25:putfield        #30  <Field Collection transformations>
			return;
	//   15   28:return          
		}
	}

	public boolean equals(Object obj)
	{
		if(obj instanceof MultiTransformation)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #2   <Class MultiTransformation>
	//*   2    4:ifeq            26
		{
			obj = ((Object) ((MultiTransformation)obj));
	//    3    7:aload_1         
	//    4    8:checkcast       #2   <Class MultiTransformation>
	//    5   11:astore_1        
			return transformations.equals(((Object) (((MultiTransformation) (obj)).transformations)));
	//    6   12:aload_0         
	//    7   13:getfield        #30  <Field Collection transformations>
	//    8   16:aload_1         
	//    9   17:getfield        #30  <Field Collection transformations>
	//   10   20:invokeinterface #47  <Method boolean Collection.equals(Object)>
	//   11   25:ireturn         
		} else
		{
			return false;
	//   12   26:iconst_0        
	//   13   27:ireturn         
		}
	}

	public int hashCode()
	{
		return transformations.hashCode();
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field Collection transformations>
	//    2    4:invokeinterface #51  <Method int Collection.hashCode()>
	//    3    9:ireturn         
	}

	public Resource transform(Context context, Resource resource, int i, int j)
	{
		Resource resource1 = resource;
	//    0    0:aload_2         
	//    1    1:astore          5
		for(Iterator iterator = transformations.iterator(); iterator.hasNext();)
	//*   2    3:aload_0         
	//*   3    4:getfield        #30  <Field Collection transformations>
	//*   4    7:invokeinterface #57  <Method Iterator Collection.iterator()>
	//*   5   12:astore          7
	//*   6   14:aload           7
	//*   7   16:invokeinterface #62  <Method boolean Iterator.hasNext()>
	//*   8   21:ifeq            85
		{
			Resource resource2 = ((Transformation)iterator.next()).transform(context, resource1, i, j);
	//    9   24:aload           7
	//   10   26:invokeinterface #66  <Method Object Iterator.next()>
	//   11   31:checkcast       #7   <Class Transformation>
	//   12   34:aload_1         
	//   13   35:aload           5
	//   14   37:iload_3         
	//   15   38:iload           4
	//   16   40:invokeinterface #68  <Method Resource Transformation.transform(Context, Resource, int, int)>
	//   17   45:astore          6
			if(resource1 != null && !((Object) (resource1)).equals(((Object) (resource))) && !((Object) (resource1)).equals(((Object) (resource2))))
	//*  18   47:aload           5
	//*  19   49:ifnull          78
	//*  20   52:aload           5
	//*  21   54:aload_2         
	//*  22   55:invokevirtual   #69  <Method boolean Object.equals(Object)>
	//*  23   58:ifne            78
	//*  24   61:aload           5
	//*  25   63:aload           6
	//*  26   65:invokevirtual   #69  <Method boolean Object.equals(Object)>
	//*  27   68:ifne            78
				resource1.recycle();
	//   28   71:aload           5
	//   29   73:invokeinterface #74  <Method void Resource.recycle()>
			resource1 = resource2;
	//   30   78:aload           6
	//   31   80:astore          5
		}

	//*  32   82:goto            14
		return resource1;
	//   33   85:aload           5
	//   34   87:areturn         
	}

	public void updateDiskCacheKey(MessageDigest messagedigest)
	{
		for(Iterator iterator = transformations.iterator(); iterator.hasNext(); ((Transformation)iterator.next()).updateDiskCacheKey(messagedigest));
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field Collection transformations>
	//    2    4:invokeinterface #57  <Method Iterator Collection.iterator()>
	//    3    9:astore_2        
	//    4   10:aload_2         
	//    5   11:invokeinterface #62  <Method boolean Iterator.hasNext()>
	//    6   16:ifeq            37
	//    7   19:aload_2         
	//    8   20:invokeinterface #66  <Method Object Iterator.next()>
	//    9   25:checkcast       #7   <Class Transformation>
	//   10   28:aload_1         
	//   11   29:invokeinterface #79  <Method void Transformation.updateDiskCacheKey(MessageDigest)>
	//*  12   34:goto            10
	//   13   37:return          
	}

	private final Collection transformations;
}

// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.load;

import android.content.Context;
import com.bumptech.glide.load.engine.Resource;
import java.security.MessageDigest;
import java.util.Collection;
import java.util.Iterator;

// Referenced classes of package com.bumptech.glide.load:
//			Transformation

public class MultiTransformation
	implements Transformation
{

	public MultiTransformation(Collection collection)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
		if(!collection.isEmpty())
	//*   2    4:aload_1         
	//*   3    5:invokeinterface #22  <Method boolean Collection.isEmpty()>
	//*   4   10:ifne            19
		{
			transformations = collection;
	//    5   13:aload_0         
	//    6   14:aload_1         
	//    7   15:putfield        #24  <Field Collection transformations>
			return;
	//    8   18:return          
		} else
		{
			throw new IllegalArgumentException("MultiTransformation must contain at least one Transformation");
	//    9   19:new             #26  <Class IllegalArgumentException>
	//   10   22:dup             
	//   11   23:ldc1            #28  <String "MultiTransformation must contain at least one Transformation">
	//   12   25:invokespecial   #31  <Method void IllegalArgumentException(String)>
	//   13   28:athrow          
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
	//    7   13:getfield        #24  <Field Collection transformations>
	//    8   16:aload_1         
	//    9   17:getfield        #24  <Field Collection transformations>
	//   10   20:invokeinterface #39  <Method boolean Collection.equals(Object)>
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
	//    1    1:getfield        #24  <Field Collection transformations>
	//    2    4:invokeinterface #43  <Method int Collection.hashCode()>
	//    3    9:ireturn         
	}

	public Resource transform(Context context, Resource resource, int i, int j)
	{
		Iterator iterator = transformations.iterator();
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field Collection transformations>
	//    2    4:invokeinterface #49  <Method Iterator Collection.iterator()>
	//    3    9:astore          7
		Resource resource1;
		Resource resource2;
		for(resource1 = resource; iterator.hasNext(); resource1 = resource2)
	//*   4   11:aload_2         
	//*   5   12:astore          5
	//*   6   14:aload           7
	//*   7   16:invokeinterface #54  <Method boolean Iterator.hasNext()>
	//*   8   21:ifeq            85
		{
			resource2 = ((Transformation)iterator.next()).transform(context, resource1, i, j);
	//    9   24:aload           7
	//   10   26:invokeinterface #58  <Method Object Iterator.next()>
	//   11   31:checkcast       #7   <Class Transformation>
	//   12   34:aload_1         
	//   13   35:aload           5
	//   14   37:iload_3         
	//   15   38:iload           4
	//   16   40:invokeinterface #60  <Method Resource Transformation.transform(Context, Resource, int, int)>
	//   17   45:astore          6
			if(resource1 != null && !((Object) (resource1)).equals(((Object) (resource))) && !((Object) (resource1)).equals(((Object) (resource2))))
	//*  18   47:aload           5
	//*  19   49:ifnull          78
	//*  20   52:aload           5
	//*  21   54:aload_2         
	//*  22   55:invokevirtual   #61  <Method boolean Object.equals(Object)>
	//*  23   58:ifne            78
	//*  24   61:aload           5
	//*  25   63:aload           6
	//*  26   65:invokevirtual   #61  <Method boolean Object.equals(Object)>
	//*  27   68:ifne            78
				resource1.recycle();
	//   28   71:aload           5
	//   29   73:invokeinterface #66  <Method void Resource.recycle()>
		}

	//   30   78:aload           6
	//   31   80:astore          5
	//*  32   82:goto            14
		return resource1;
	//   33   85:aload           5
	//   34   87:areturn         
	}

	public void updateDiskCacheKey(MessageDigest messagedigest)
	{
		for(Iterator iterator = transformations.iterator(); iterator.hasNext(); ((Transformation)iterator.next()).updateDiskCacheKey(messagedigest));
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field Collection transformations>
	//    2    4:invokeinterface #49  <Method Iterator Collection.iterator()>
	//    3    9:astore_2        
	//    4   10:aload_2         
	//    5   11:invokeinterface #54  <Method boolean Iterator.hasNext()>
	//    6   16:ifeq            37
	//    7   19:aload_2         
	//    8   20:invokeinterface #58  <Method Object Iterator.next()>
	//    9   25:checkcast       #7   <Class Transformation>
	//   10   28:aload_1         
	//   11   29:invokeinterface #72  <Method void Transformation.updateDiskCacheKey(MessageDigest)>
	//*  12   34:goto            10
	//   13   37:return          
	}

	private final Collection transformations;
}

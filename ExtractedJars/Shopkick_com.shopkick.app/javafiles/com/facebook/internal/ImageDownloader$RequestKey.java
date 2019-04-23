// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.internal;

import android.net.Uri;

// Referenced classes of package com.facebook.internal:
//			ImageDownloader

private static class ImageDownloader$RequestKey
{

	public boolean equals(Object obj)
	{
		boolean flag1 = false;
	//    0    0:iconst_0        
	//    1    1:istore_3        
		boolean flag = flag1;
	//    2    2:iload_3         
	//    3    3:istore_2        
		if(obj != null)
	//*   4    4:aload_1         
	//*   5    5:ifnull          50
		{
			flag = flag1;
	//    6    8:iload_3         
	//    7    9:istore_2        
			if(obj instanceof ImageDownloader$RequestKey)
	//*   8   10:aload_1         
	//*   9   11:instanceof      #2   <Class ImageDownloader$RequestKey>
	//*  10   14:ifeq            50
			{
				obj = ((Object) ((ImageDownloader$RequestKey)obj));
	//   11   17:aload_1         
	//   12   18:checkcast       #2   <Class ImageDownloader$RequestKey>
	//   13   21:astore_1        
				flag = flag1;
	//   14   22:iload_3         
	//   15   23:istore_2        
				if(((ImageDownloader$RequestKey) (obj)).uri == uri)
	//*  16   24:aload_1         
	//*  17   25:getfield        #23  <Field Uri uri>
	//*  18   28:aload_0         
	//*  19   29:getfield        #23  <Field Uri uri>
	//*  20   32:if_acmpne       50
				{
					flag = flag1;
	//   21   35:iload_3         
	//   22   36:istore_2        
					if(((ImageDownloader$RequestKey) (obj)).tag == tag)
	//*  23   37:aload_1         
	//*  24   38:getfield        #25  <Field Object tag>
	//*  25   41:aload_0         
	//*  26   42:getfield        #25  <Field Object tag>
	//*  27   45:if_acmpne       50
						flag = true;
	//   28   48:iconst_1        
	//   29   49:istore_2        
				}
			}
		}
		return flag;
	//   30   50:iload_2         
	//   31   51:ireturn         
	}

	public int hashCode()
	{
		return (1073 + uri.hashCode()) * 37 + tag.hashCode();
	//    0    0:sipush          1073
	//    1    3:aload_0         
	//    2    4:getfield        #23  <Field Uri uri>
	//    3    7:invokevirtual   #34  <Method int Uri.hashCode()>
	//    4   10:iadd            
	//    5   11:bipush          37
	//    6   13:imul            
	//    7   14:aload_0         
	//    8   15:getfield        #25  <Field Object tag>
	//    9   18:invokevirtual   #35  <Method int Object.hashCode()>
	//   10   21:iadd            
	//   11   22:ireturn         
	}

	private static final int HASH_MULTIPLIER = 37;
	private static final int HASH_SEED = 29;
	Object tag;
	Uri uri;

	ImageDownloader$RequestKey(Uri uri1, Object obj)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #21  <Method void Object()>
		uri = uri1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #23  <Field Uri uri>
		tag = obj;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #25  <Field Object tag>
	//    8   14:return          
	}
}

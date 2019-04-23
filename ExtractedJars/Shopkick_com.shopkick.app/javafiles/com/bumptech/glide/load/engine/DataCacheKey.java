// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.load.engine;

import com.bumptech.glide.load.Key;
import java.security.MessageDigest;

final class DataCacheKey
	implements Key
{

	DataCacheKey(Key key, Key key1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
		sourceKey = key;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #16  <Field Key sourceKey>
		signature = key1;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #18  <Field Key signature>
	//    8   14:return          
	}

	public boolean equals(Object obj)
	{
		boolean flag = obj instanceof DataCacheKey;
	//    0    0:aload_1         
	//    1    1:instanceof      #2   <Class DataCacheKey>
	//    2    4:istore_2        
		boolean flag2 = false;
	//    3    5:iconst_0        
	//    4    6:istore_3        
		if(flag)
	//*   5    7:iload_2         
	//*   6    8:ifeq            56
		{
			obj = ((Object) ((DataCacheKey)obj));
	//    7   11:aload_1         
	//    8   12:checkcast       #2   <Class DataCacheKey>
	//    9   15:astore_1        
			boolean flag1 = flag2;
	//   10   16:iload_3         
	//   11   17:istore_2        
			if(sourceKey.equals(((Object) (((DataCacheKey) (obj)).sourceKey))))
	//*  12   18:aload_0         
	//*  13   19:getfield        #16  <Field Key sourceKey>
	//*  14   22:aload_1         
	//*  15   23:getfield        #16  <Field Key sourceKey>
	//*  16   26:invokeinterface #23  <Method boolean Key.equals(Object)>
	//*  17   31:ifeq            54
			{
				flag1 = flag2;
	//   18   34:iload_3         
	//   19   35:istore_2        
				if(signature.equals(((Object) (((DataCacheKey) (obj)).signature))))
	//*  20   36:aload_0         
	//*  21   37:getfield        #18  <Field Key signature>
	//*  22   40:aload_1         
	//*  23   41:getfield        #18  <Field Key signature>
	//*  24   44:invokeinterface #23  <Method boolean Key.equals(Object)>
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

	Key getSourceKey()
	{
		return sourceKey;
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field Key sourceKey>
	//    2    4:areturn         
	}

	public int hashCode()
	{
		return sourceKey.hashCode() * 31 + signature.hashCode();
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field Key sourceKey>
	//    2    4:invokeinterface #29  <Method int Key.hashCode()>
	//    3    9:bipush          31
	//    4   11:imul            
	//    5   12:aload_0         
	//    6   13:getfield        #18  <Field Key signature>
	//    7   16:invokeinterface #29  <Method int Key.hashCode()>
	//    8   21:iadd            
	//    9   22:ireturn         
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #33  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #34  <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append("DataCacheKey{sourceKey=");
	//    4    8:aload_1         
	//    5    9:ldc1            #36  <String "DataCacheKey{sourceKey=">
	//    6   11:invokevirtual   #40  <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		stringbuilder.append(((Object) (sourceKey)));
	//    8   15:aload_1         
	//    9   16:aload_0         
	//   10   17:getfield        #16  <Field Key sourceKey>
	//   11   20:invokevirtual   #43  <Method StringBuilder StringBuilder.append(Object)>
	//   12   23:pop             
		stringbuilder.append(", signature=");
	//   13   24:aload_1         
	//   14   25:ldc1            #45  <String ", signature=">
	//   15   27:invokevirtual   #40  <Method StringBuilder StringBuilder.append(String)>
	//   16   30:pop             
		stringbuilder.append(((Object) (signature)));
	//   17   31:aload_1         
	//   18   32:aload_0         
	//   19   33:getfield        #18  <Field Key signature>
	//   20   36:invokevirtual   #43  <Method StringBuilder StringBuilder.append(Object)>
	//   21   39:pop             
		stringbuilder.append('}');
	//   22   40:aload_1         
	//   23   41:bipush          125
	//   24   43:invokevirtual   #48  <Method StringBuilder StringBuilder.append(char)>
	//   25   46:pop             
		return stringbuilder.toString();
	//   26   47:aload_1         
	//   27   48:invokevirtual   #50  <Method String StringBuilder.toString()>
	//   28   51:areturn         
	}

	public void updateDiskCacheKey(MessageDigest messagedigest)
	{
		sourceKey.updateDiskCacheKey(messagedigest);
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field Key sourceKey>
	//    2    4:aload_1         
	//    3    5:invokeinterface #55  <Method void Key.updateDiskCacheKey(MessageDigest)>
		signature.updateDiskCacheKey(messagedigest);
	//    4   10:aload_0         
	//    5   11:getfield        #18  <Field Key signature>
	//    6   14:aload_1         
	//    7   15:invokeinterface #55  <Method void Key.updateDiskCacheKey(MessageDigest)>
	//    8   20:return          
	}

	private final Key signature;
	private final Key sourceKey;
}

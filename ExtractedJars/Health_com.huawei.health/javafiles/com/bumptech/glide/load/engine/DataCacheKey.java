// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.load.engine;

import com.bumptech.glide.load.Key;
import java.security.MessageDigest;

final class DataCacheKey
	implements Key
{

	public DataCacheKey(Key key, Key key1)
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
		if(obj instanceof DataCacheKey)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #2   <Class DataCacheKey>
	//*   2    4:ifeq            48
		{
			obj = ((Object) ((DataCacheKey)obj));
	//    3    7:aload_1         
	//    4    8:checkcast       #2   <Class DataCacheKey>
	//    5   11:astore_1        
			return sourceKey.equals(((Object) (((DataCacheKey) (obj)).sourceKey))) && signature.equals(((Object) (((DataCacheKey) (obj)).signature)));
	//    6   12:aload_0         
	//    7   13:getfield        #16  <Field Key sourceKey>
	//    8   16:aload_1         
	//    9   17:getfield        #16  <Field Key sourceKey>
	//   10   20:invokeinterface #23  <Method boolean Key.equals(Object)>
	//   11   25:ifeq            46
	//   12   28:aload_0         
	//   13   29:getfield        #18  <Field Key signature>
	//   14   32:aload_1         
	//   15   33:getfield        #18  <Field Key signature>
	//   16   36:invokeinterface #23  <Method boolean Key.equals(Object)>
	//   17   41:ifeq            46
	//   18   44:iconst_1        
	//   19   45:ireturn         
	//   20   46:iconst_0        
	//   21   47:ireturn         
		} else
		{
			return false;
	//   22   48:iconst_0        
	//   23   49:ireturn         
		}
	}

	public Key getSourceKey()
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
		return (new StringBuilder()).append("DataCacheKey{sourceKey=").append(((Object) (sourceKey))).append(", signature=").append(((Object) (signature))).append('}').toString();
	//    0    0:new             #33  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #34  <Method void StringBuilder()>
	//    3    7:ldc1            #36  <String "DataCacheKey{sourceKey=">
	//    4    9:invokevirtual   #40  <Method StringBuilder StringBuilder.append(String)>
	//    5   12:aload_0         
	//    6   13:getfield        #16  <Field Key sourceKey>
	//    7   16:invokevirtual   #43  <Method StringBuilder StringBuilder.append(Object)>
	//    8   19:ldc1            #45  <String ", signature=">
	//    9   21:invokevirtual   #40  <Method StringBuilder StringBuilder.append(String)>
	//   10   24:aload_0         
	//   11   25:getfield        #18  <Field Key signature>
	//   12   28:invokevirtual   #43  <Method StringBuilder StringBuilder.append(Object)>
	//   13   31:bipush          125
	//   14   33:invokevirtual   #48  <Method StringBuilder StringBuilder.append(char)>
	//   15   36:invokevirtual   #50  <Method String StringBuilder.toString()>
	//   16   39:areturn         
	}

	public void updateDiskCacheKey(MessageDigest messagedigest)
	{
		sourceKey.updateDiskCacheKey(messagedigest);
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field Key sourceKey>
	//    2    4:aload_1         
	//    3    5:invokeinterface #54  <Method void Key.updateDiskCacheKey(MessageDigest)>
		signature.updateDiskCacheKey(messagedigest);
	//    4   10:aload_0         
	//    5   11:getfield        #18  <Field Key signature>
	//    6   14:aload_1         
	//    7   15:invokeinterface #54  <Method void Key.updateDiskCacheKey(MessageDigest)>
	//    8   20:return          
	}

	private final Key signature;
	private final Key sourceKey;
}

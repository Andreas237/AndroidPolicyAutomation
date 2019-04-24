// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.signature;

import com.bumptech.glide.load.Key;
import com.bumptech.glide.util.Preconditions;
import java.security.MessageDigest;

public final class ObjectKey
	implements Key
{

	public ObjectKey(Object obj)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
		object = Preconditions.checkNotNull(obj);
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokestatic    #19  <Method Object Preconditions.checkNotNull(Object)>
	//    5    9:putfield        #21  <Field Object object>
	//    6   12:return          
	}

	public boolean equals(Object obj)
	{
		if(obj instanceof ObjectKey)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #2   <Class ObjectKey>
	//*   2    4:ifeq            24
		{
			obj = ((Object) ((ObjectKey)obj));
	//    3    7:aload_1         
	//    4    8:checkcast       #2   <Class ObjectKey>
	//    5   11:astore_1        
			return object.equals(((ObjectKey) (obj)).object);
	//    6   12:aload_0         
	//    7   13:getfield        #21  <Field Object object>
	//    8   16:aload_1         
	//    9   17:getfield        #21  <Field Object object>
	//   10   20:invokevirtual   #26  <Method boolean Object.equals(Object)>
	//   11   23:ireturn         
		} else
		{
			return false;
	//   12   24:iconst_0        
	//   13   25:ireturn         
		}
	}

	public int hashCode()
	{
		return object.hashCode();
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field Object object>
	//    2    4:invokevirtual   #30  <Method int Object.hashCode()>
	//    3    7:ireturn         
	}

	public String toString()
	{
		return (new StringBuilder()).append("ObjectKey{object=").append(object).append('}').toString();
	//    0    0:new             #34  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #35  <Method void StringBuilder()>
	//    3    7:ldc1            #37  <String "ObjectKey{object=">
	//    4    9:invokevirtual   #41  <Method StringBuilder StringBuilder.append(String)>
	//    5   12:aload_0         
	//    6   13:getfield        #21  <Field Object object>
	//    7   16:invokevirtual   #44  <Method StringBuilder StringBuilder.append(Object)>
	//    8   19:bipush          125
	//    9   21:invokevirtual   #47  <Method StringBuilder StringBuilder.append(char)>
	//   10   24:invokevirtual   #49  <Method String StringBuilder.toString()>
	//   11   27:areturn         
	}

	public void updateDiskCacheKey(MessageDigest messagedigest)
	{
		messagedigest.update(object.toString().getBytes(CHARSET));
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #21  <Field Object object>
	//    3    5:invokevirtual   #52  <Method String Object.toString()>
	//    4    8:getstatic       #56  <Field java.nio.charset.Charset CHARSET>
	//    5   11:invokevirtual   #62  <Method byte[] String.getBytes(java.nio.charset.Charset)>
	//    6   14:invokevirtual   #68  <Method void MessageDigest.update(byte[])>
	//    7   17:return          
	}

	private final Object object;
}

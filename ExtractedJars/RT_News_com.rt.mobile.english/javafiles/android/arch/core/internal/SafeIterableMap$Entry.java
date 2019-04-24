// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.arch.core.internal;


// Referenced classes of package android.arch.core.internal:
//			SafeIterableMap

static class SafeIterableMap$Entry
	implements java.util.Map.Entry
{

	public boolean equals(Object obj)
	{
		if(obj == this)
	//*   0    0:aload_1         
	//*   1    1:aload_0         
	//*   2    2:if_acmpne       7
			return true;
	//    3    5:iconst_1        
	//    4    6:ireturn         
		if(!(obj instanceof SafeIterableMap$Entry))
	//*   5    7:aload_1         
	//*   6    8:instanceof      #2   <Class SafeIterableMap$Entry>
	//*   7   11:ifne            16
			return false;
	//    8   14:iconst_0        
	//    9   15:ireturn         
		obj = ((Object) ((SafeIterableMap$Entry)obj));
	//   10   16:aload_1         
	//   11   17:checkcast       #2   <Class SafeIterableMap$Entry>
	//   12   20:astore_1        
		return mKey.equals(((SafeIterableMap$Entry) (obj)).mKey) && mValue.equals(((SafeIterableMap$Entry) (obj)).mValue);
	//   13   21:aload_0         
	//   14   22:getfield        #27  <Field Object mKey>
	//   15   25:aload_1         
	//   16   26:getfield        #27  <Field Object mKey>
	//   17   29:invokevirtual   #37  <Method boolean Object.equals(Object)>
	//   18   32:ifeq            51
	//   19   35:aload_0         
	//   20   36:getfield        #29  <Field Object mValue>
	//   21   39:aload_1         
	//   22   40:getfield        #29  <Field Object mValue>
	//   23   43:invokevirtual   #37  <Method boolean Object.equals(Object)>
	//   24   46:ifeq            51
	//   25   49:iconst_1        
	//   26   50:ireturn         
	//   27   51:iconst_0        
	//   28   52:ireturn         
	}

	public Object getKey()
	{
		return mKey;
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field Object mKey>
	//    2    4:areturn         
	}

	public Object getValue()
	{
		return mValue;
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field Object mValue>
	//    2    4:areturn         
	}

	public Object setValue(Object obj)
	{
		throw new UnsupportedOperationException("An entry modification is not supported");
	//    0    0:new             #47  <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:ldc1            #49  <String "An entry modification is not supported">
	//    3    6:invokespecial   #52  <Method void UnsupportedOperationException(String)>
	//    4    9:athrow          
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #57  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #58  <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append(mKey);
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:getfield        #27  <Field Object mKey>
	//    7   13:invokevirtual   #62  <Method StringBuilder StringBuilder.append(Object)>
	//    8   16:pop             
		stringbuilder.append("=");
	//    9   17:aload_1         
	//   10   18:ldc1            #64  <String "=">
	//   11   20:invokevirtual   #67  <Method StringBuilder StringBuilder.append(String)>
	//   12   23:pop             
		stringbuilder.append(mValue);
	//   13   24:aload_1         
	//   14   25:aload_0         
	//   15   26:getfield        #29  <Field Object mValue>
	//   16   29:invokevirtual   #62  <Method StringBuilder StringBuilder.append(Object)>
	//   17   32:pop             
		return stringbuilder.toString();
	//   18   33:aload_1         
	//   19   34:invokevirtual   #69  <Method String StringBuilder.toString()>
	//   20   37:areturn         
	}

	final Object mKey;
	SafeIterableMap$Entry mNext;
	SafeIterableMap$Entry mPrevious;
	final Object mValue;

	SafeIterableMap$Entry(Object obj, Object obj1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #25  <Method void Object()>
		mKey = obj;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #27  <Field Object mKey>
		mValue = obj1;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #29  <Field Object mValue>
	//    8   14:return          
	}
}

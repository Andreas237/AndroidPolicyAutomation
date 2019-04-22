// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.core.util;

import com.fasterxml.jackson.core.io.JsonStringEncoder;
import java.lang.ref.SoftReference;

// Referenced classes of package com.fasterxml.jackson.core.util:
//			BufferRecycler

public class BufferRecyclers
{

	public static byte[] encodeAsUTF8(String s)
	{
		return getJsonStringEncoder().encodeAsUTF8(s);
	//    0    0:invokestatic    #27  <Method JsonStringEncoder getJsonStringEncoder()>
	//    1    3:aload_0         
	//    2    4:invokevirtual   #31  <Method byte[] JsonStringEncoder.encodeAsUTF8(String)>
	//    3    7:areturn         
	}

	public static BufferRecycler getBufferRecycler()
	{
		Object obj = ((Object) ((SoftReference)_recyclerRef.get()));
	//    0    0:getstatic       #18  <Field ThreadLocal _recyclerRef>
	//    1    3:invokevirtual   #37  <Method Object ThreadLocal.get()>
	//    2    6:checkcast       #39  <Class SoftReference>
	//    3    9:astore_0        
		if(obj == null)
	//*   4   10:aload_0         
	//*   5   11:ifnonnull       19
			obj = null;
	//    6   14:aconst_null     
	//    7   15:astore_0        
		else
	//*   8   16:goto            27
			obj = ((Object) ((BufferRecycler)((SoftReference) (obj)).get()));
	//    9   19:aload_0         
	//   10   20:invokevirtual   #40  <Method Object SoftReference.get()>
	//   11   23:checkcast       #42  <Class BufferRecycler>
	//   12   26:astore_0        
		Object obj1 = obj;
	//   13   27:aload_0         
	//   14   28:astore_1        
		if(obj == null)
	//*  15   29:aload_0         
	//*  16   30:ifnonnull       55
		{
			obj1 = ((Object) (new BufferRecycler()));
	//   17   33:new             #42  <Class BufferRecycler>
	//   18   36:dup             
	//   19   37:invokespecial   #43  <Method void BufferRecycler()>
	//   20   40:astore_1        
			_recyclerRef.set(((Object) (new SoftReference(obj1))));
	//   21   41:getstatic       #18  <Field ThreadLocal _recyclerRef>
	//   22   44:new             #39  <Class SoftReference>
	//   23   47:dup             
	//   24   48:aload_1         
	//   25   49:invokespecial   #46  <Method void SoftReference(Object)>
	//   26   52:invokevirtual   #49  <Method void ThreadLocal.set(Object)>
		}
		return ((BufferRecycler) (obj1));
	//   27   55:aload_1         
	//   28   56:areturn         
	}

	public static JsonStringEncoder getJsonStringEncoder()
	{
		Object obj = ((Object) ((SoftReference)_encoderRef.get()));
	//    0    0:getstatic       #20  <Field ThreadLocal _encoderRef>
	//    1    3:invokevirtual   #37  <Method Object ThreadLocal.get()>
	//    2    6:checkcast       #39  <Class SoftReference>
	//    3    9:astore_0        
		if(obj == null)
	//*   4   10:aload_0         
	//*   5   11:ifnonnull       19
			obj = null;
	//    6   14:aconst_null     
	//    7   15:astore_0        
		else
	//*   8   16:goto            27
			obj = ((Object) ((JsonStringEncoder)((SoftReference) (obj)).get()));
	//    9   19:aload_0         
	//   10   20:invokevirtual   #40  <Method Object SoftReference.get()>
	//   11   23:checkcast       #29  <Class JsonStringEncoder>
	//   12   26:astore_0        
		Object obj1 = obj;
	//   13   27:aload_0         
	//   14   28:astore_1        
		if(obj == null)
	//*  15   29:aload_0         
	//*  16   30:ifnonnull       55
		{
			obj1 = ((Object) (new JsonStringEncoder()));
	//   17   33:new             #29  <Class JsonStringEncoder>
	//   18   36:dup             
	//   19   37:invokespecial   #50  <Method void JsonStringEncoder()>
	//   20   40:astore_1        
			_encoderRef.set(((Object) (new SoftReference(obj1))));
	//   21   41:getstatic       #20  <Field ThreadLocal _encoderRef>
	//   22   44:new             #39  <Class SoftReference>
	//   23   47:dup             
	//   24   48:aload_1         
	//   25   49:invokespecial   #46  <Method void SoftReference(Object)>
	//   26   52:invokevirtual   #49  <Method void ThreadLocal.set(Object)>
		}
		return ((JsonStringEncoder) (obj1));
	//   27   55:aload_1         
	//   28   56:areturn         
	}

	public static char[] quoteAsJsonText(String s)
	{
		return getJsonStringEncoder().quoteAsString(s);
	//    0    0:invokestatic    #27  <Method JsonStringEncoder getJsonStringEncoder()>
	//    1    3:aload_0         
	//    2    4:invokevirtual   #55  <Method char[] JsonStringEncoder.quoteAsString(String)>
	//    3    7:areturn         
	}

	public static byte[] quoteAsJsonUTF8(String s)
	{
		return getJsonStringEncoder().quoteAsUTF8(s);
	//    0    0:invokestatic    #27  <Method JsonStringEncoder getJsonStringEncoder()>
	//    1    3:aload_0         
	//    2    4:invokevirtual   #59  <Method byte[] JsonStringEncoder.quoteAsUTF8(String)>
	//    3    7:areturn         
	}

	protected static final ThreadLocal _encoderRef = new ThreadLocal();
	protected static final ThreadLocal _recyclerRef = new ThreadLocal();

	static 
	{
	//    0    0:new             #13  <Class ThreadLocal>
	//    1    3:dup             
	//    2    4:invokespecial   #16  <Method void ThreadLocal()>
	//    3    7:putstatic       #18  <Field ThreadLocal _recyclerRef>
	//    4   10:new             #13  <Class ThreadLocal>
	//    5   13:dup             
	//    6   14:invokespecial   #16  <Method void ThreadLocal()>
	//    7   17:putstatic       #20  <Field ThreadLocal _encoderRef>
	//*   8   20:return          
	}
}

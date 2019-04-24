// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.share;

import android.os.Bundle;
import com.facebook.FacebookException;
import com.facebook.internal.Utility;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.facebook.share:
//			ShareApi

class ShareApi$8
	implements com.facebook.internal.apper.Collection
{

	public volatile Object get(Object obj)
	{
		return get((String)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #30  <Class String>
	//    3    5:invokevirtual   #33  <Method Object get(String)>
	//    4    8:areturn         
	}

	public Object get(String s)
	{
		return val$parameters.get(s);
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field Bundle val$parameters>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #36  <Method Object Bundle.get(String)>
	//    4    8:areturn         
	}

	public Iterator keyIterator()
	{
		return val$parameters.keySet().iterator();
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field Bundle val$parameters>
	//    2    4:invokevirtual   #42  <Method Set Bundle.keySet()>
	//    3    7:invokeinterface #47  <Method Iterator Set.iterator()>
	//    4   12:areturn         
	}

	public volatile void set(Object obj, Object obj1, com.facebook.internal.apper.OnErrorListener onerrorlistener)
	{
		set((String)obj, obj1, onerrorlistener);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #30  <Class String>
	//    3    5:aload_2         
	//    4    6:aload_3         
	//    5    7:invokevirtual   #54  <Method void set(String, Object, com.facebook.internal.CollectionMapper$OnErrorListener)>
	//    6   10:return          
	}

	public void set(String s, Object obj, com.facebook.internal.apper.OnErrorListener onerrorlistener)
	{
		if(!Utility.putJSONValueInBundle(val$parameters, s, obj))
	//*   0    0:aload_0         
	//*   1    1:getfield        #22  <Field Bundle val$parameters>
	//*   2    4:aload_1         
	//*   3    5:aload_2         
	//*   4    6:invokestatic    #60  <Method boolean Utility.putJSONValueInBundle(Bundle, String, Object)>
	//*   5    9:ifne            53
		{
			s = ((String) (new StringBuilder()));
	//    6   12:new             #62  <Class StringBuilder>
	//    7   15:dup             
	//    8   16:invokespecial   #63  <Method void StringBuilder()>
	//    9   19:astore_1        
			((StringBuilder) (s)).append("Unexpected value: ");
	//   10   20:aload_1         
	//   11   21:ldc1            #65  <String "Unexpected value: ">
	//   12   23:invokevirtual   #69  <Method StringBuilder StringBuilder.append(String)>
	//   13   26:pop             
			((StringBuilder) (s)).append(obj.toString());
	//   14   27:aload_1         
	//   15   28:aload_2         
	//   16   29:invokevirtual   #73  <Method String Object.toString()>
	//   17   32:invokevirtual   #69  <Method StringBuilder StringBuilder.append(String)>
	//   18   35:pop             
			onerrorlistener.onError(new FacebookException(((StringBuilder) (s)).toString()));
	//   19   36:aload_3         
	//   20   37:new             #75  <Class FacebookException>
	//   21   40:dup             
	//   22   41:aload_1         
	//   23   42:invokevirtual   #76  <Method String StringBuilder.toString()>
	//   24   45:invokespecial   #79  <Method void FacebookException(String)>
	//   25   48:invokeinterface #85  <Method void com.facebook.internal.CollectionMapper$OnErrorListener.onError(FacebookException)>
		}
	//   26   53:return          
	}

	final ShareApi this$0;
	final Bundle val$parameters;

	ShareApi$8()
	{
		this$0 = final_shareapi;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #20  <Field ShareApi this$0>
		val$parameters = Bundle.this;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #22  <Field Bundle val$parameters>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #25  <Method void Object()>
	//    8   14:return          
	}
}

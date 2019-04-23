// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.share;

import com.facebook.FacebookException;
import com.facebook.share.model.ShareOpenGraphObject;
import java.util.Iterator;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.facebook.share:
//			ShareApi

class ShareApi$9
	implements com.facebook.internal.apper.Collection
{

	public volatile Object get(Object obj)
	{
		return get((String)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #34  <Class String>
	//    3    5:invokevirtual   #37  <Method Object get(String)>
	//    4    8:areturn         
	}

	public Object get(String s)
	{
		return val$object.get(s);
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field ShareOpenGraphObject val$object>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #40  <Method Object ShareOpenGraphObject.get(String)>
	//    4    8:areturn         
	}

	public Iterator keyIterator()
	{
		return val$object.keySet().iterator();
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field ShareOpenGraphObject val$object>
	//    2    4:invokevirtual   #46  <Method Set ShareOpenGraphObject.keySet()>
	//    3    7:invokeinterface #51  <Method Iterator Set.iterator()>
	//    4   12:areturn         
	}

	public volatile void set(Object obj, Object obj1, com.facebook.internal.apper.OnErrorListener onerrorlistener)
	{
		set((String)obj, obj1, onerrorlistener);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #34  <Class String>
	//    3    5:aload_2         
	//    4    6:aload_3         
	//    5    7:invokevirtual   #58  <Method void set(String, Object, com.facebook.internal.CollectionMapper$OnErrorListener)>
	//    6   10:return          
	}

	public void set(String s, Object obj, com.facebook.internal.apper.OnErrorListener onerrorlistener)
	{
		try
		{
			val$stagedObject.put(s, obj);
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field JSONObject val$stagedObject>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #66  <Method JSONObject JSONObject.put(String, Object)>
	//    5    9:pop             
			return;
	//    6   10:return          
		}
		// Misplaced declaration of an exception variable
		catch(String s)
	//*   7   11:astore_1        
		{
			obj = ((Object) (((JSONException) (s)).getLocalizedMessage()));
	//    8   12:aload_1         
	//    9   13:invokevirtual   #70  <Method String JSONException.getLocalizedMessage()>
	//   10   16:astore_2        
		}
		s = ((String) (obj));
	//   11   17:aload_2         
	//   12   18:astore_1        
		if(obj == null)
	//*  13   19:aload_2         
	//*  14   20:ifnonnull       26
			s = "Error staging object.";
	//   15   23:ldc1            #72  <String "Error staging object.">
	//   16   25:astore_1        
		onerrorlistener.onError(new FacebookException(s));
	//   17   26:aload_3         
	//   18   27:new             #74  <Class FacebookException>
	//   19   30:dup             
	//   20   31:aload_1         
	//   21   32:invokespecial   #77  <Method void FacebookException(String)>
	//   22   35:invokeinterface #83  <Method void com.facebook.internal.CollectionMapper$OnErrorListener.onError(FacebookException)>
	//   23   40:return          
	}

	final ShareApi this$0;
	final ShareOpenGraphObject val$object;
	final JSONObject val$stagedObject;

	ShareApi$9()
	{
		this$0 = final_shareapi;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #22  <Field ShareApi this$0>
		val$object = shareopengraphobject;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #24  <Field ShareOpenGraphObject val$object>
		val$stagedObject = JSONObject.this;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #26  <Field JSONObject val$stagedObject>
		super();
	//    9   15:aload_0         
	//   10   16:invokespecial   #29  <Method void Object()>
	//   11   19:return          
	}
}

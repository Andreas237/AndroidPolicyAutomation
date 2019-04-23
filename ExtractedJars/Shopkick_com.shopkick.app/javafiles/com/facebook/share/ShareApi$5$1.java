// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.share;

import com.facebook.FacebookException;
import com.facebook.internal.Mutable;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;

// Referenced classes of package com.facebook.share:
//			ShareApi

class ShareApi$5$1
	implements Iterator
{

	public boolean hasNext()
	{
		return ((Integer)val$current.value).intValue() < val$size;
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field Mutable val$current>
	//    2    4:getfield        #38  <Field Object Mutable.value>
	//    3    7:checkcast       #40  <Class Integer>
	//    4   10:invokevirtual   #44  <Method int Integer.intValue()>
	//    5   13:aload_0         
	//    6   14:getfield        #26  <Field int val$size>
	//    7   17:icmpge          22
	//    8   20:iconst_1        
	//    9   21:ireturn         
	//   10   22:iconst_0        
	//   11   23:ireturn         
	}

	public Integer next()
	{
		Integer integer = (Integer)val$current.value;
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field Mutable val$current>
	//    2    4:getfield        #38  <Field Object Mutable.value>
	//    3    7:checkcast       #40  <Class Integer>
	//    4   10:astore_1        
		Mutable mutable = val$current;
	//    5   11:aload_0         
	//    6   12:getfield        #24  <Field Mutable val$current>
	//    7   15:astore_2        
		mutable.value = ((Object) (Integer.valueOf(((Integer)mutable.value).intValue() + 1)));
	//    8   16:aload_2         
	//    9   17:aload_2         
	//   10   18:getfield        #38  <Field Object Mutable.value>
	//   11   21:checkcast       #40  <Class Integer>
	//   12   24:invokevirtual   #44  <Method int Integer.intValue()>
	//   13   27:iconst_1        
	//   14   28:iadd            
	//   15   29:invokestatic    #50  <Method Integer Integer.valueOf(int)>
	//   16   32:putfield        #38  <Field Object Mutable.value>
		return integer;
	//   17   35:aload_1         
	//   18   36:areturn         
	}

	public volatile Object next()
	{
		return ((Object) (next()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #53  <Method Integer next()>
	//    2    4:areturn         
	}

	public void remove()
	{
	//    0    0:return          
	}

	final ShareApi._cls5 this$1;
	final Mutable val$current;
	final int val$size;

	ShareApi$5$1()
	{
		this$1 = final__pcls5;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #22  <Field ShareApi$5 this$1>
		val$current = mutable;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #24  <Field Mutable val$current>
		val$size = I.this;
	//    6   10:aload_0         
	//    7   11:iload_3         
	//    8   12:putfield        #26  <Field int val$size>
		super();
	//    9   15:aload_0         
	//   10   16:invokespecial   #29  <Method void Object()>
	//   11   19:return          
	}

	// Unreferenced inner class com/facebook/share/ShareApi$5

/* anonymous class */
	class ShareApi._cls5
		implements com.facebook.internal.CollectionMapper.Collection
	{

		public Object get(Integer integer)
		{
			return arrayList.get(integer.intValue());
		//    0    0:aload_0         
		//    1    1:getfield        #26  <Field ArrayList val$arrayList>
		//    2    4:aload_1         
		//    3    5:invokevirtual   #40  <Method int Integer.intValue()>
		//    4    8:invokevirtual   #45  <Method Object ArrayList.get(int)>
		//    5   11:areturn         
		}

		public volatile Object get(Object obj)
		{
			return get((Integer)obj);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:checkcast       #36  <Class Integer>
		//    3    5:invokevirtual   #48  <Method Object get(Integer)>
		//    4    8:areturn         
		}

		public Iterator keyIterator()
		{
			int i = arrayList.size();
		//    0    0:aload_0         
		//    1    1:getfield        #26  <Field ArrayList val$arrayList>
		//    2    4:invokevirtual   #53  <Method int ArrayList.size()>
		//    3    7:istore_1        
			return ((Iterator) (((ShareApi._cls5._cls1) (i)). new ShareApi._cls5._cls1()));
		//    4    8:new             #14  <Class ShareApi$5$1>
		//    5   11:dup             
		//    6   12:aload_0         
		//    7   13:new             #55  <Class Mutable>
		//    8   16:dup             
		//    9   17:iconst_0        
		//   10   18:invokestatic    #59  <Method Integer Integer.valueOf(int)>
		//   11   21:invokespecial   #62  <Method void Mutable(Object)>
		//   12   24:iload_1         
		//   13   25:invokespecial   #65  <Method void ShareApi$5$1(ShareApi$5, Mutable, int)>
		//   14   28:areturn         
		}

		public void set(Integer integer, Object obj, com.facebook.internal.CollectionMapper.OnErrorListener onerrorlistener)
		{
			try
			{
				stagedObject.put(integer.intValue(), obj);
		//    0    0:aload_0         
		//    1    1:getfield        #28  <Field JSONArray val$stagedObject>
		//    2    4:aload_1         
		//    3    5:invokevirtual   #40  <Method int Integer.intValue()>
		//    4    8:aload_2         
		//    5    9:invokevirtual   #77  <Method JSONArray JSONArray.put(int, Object)>
		//    6   12:pop             
				return;
		//    7   13:return          
			}
			// Misplaced declaration of an exception variable
			catch(Integer integer)
		//*   8   14:astore_1        
			{
				obj = ((Object) (((JSONException) (integer)).getLocalizedMessage()));
		//    9   15:aload_1         
		//   10   16:invokevirtual   #81  <Method String JSONException.getLocalizedMessage()>
		//   11   19:astore_2        
			}
			integer = ((Integer) (obj));
		//   12   20:aload_2         
		//   13   21:astore_1        
			if(obj == null)
		//*  14   22:aload_2         
		//*  15   23:ifnonnull       29
				integer = "Error staging object.";
		//   16   26:ldc1            #83  <String "Error staging object.">
		//   17   28:astore_1        
			onerrorlistener.onError(new FacebookException(((String) (integer))));
		//   18   29:aload_3         
		//   19   30:new             #85  <Class FacebookException>
		//   20   33:dup             
		//   21   34:aload_1         
		//   22   35:invokespecial   #88  <Method void FacebookException(String)>
		//   23   38:invokeinterface #94  <Method void com.facebook.internal.CollectionMapper$OnErrorListener.onError(FacebookException)>
		//   24   43:return          
		}

		public volatile void set(Object obj, Object obj1, com.facebook.internal.CollectionMapper.OnErrorListener onerrorlistener)
		{
			set((Integer)obj, obj1, onerrorlistener);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:checkcast       #36  <Class Integer>
		//    3    5:aload_2         
		//    4    6:aload_3         
		//    5    7:invokevirtual   #97  <Method void set(Integer, Object, com.facebook.internal.CollectionMapper$OnErrorListener)>
		//    6   10:return          
		}

		final ShareApi this$0;
		final ArrayList val$arrayList;
		final JSONArray val$stagedObject;

			
			{
				this$0 = final_shareapi;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #24  <Field ShareApi this$0>
				arrayList = arraylist;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #26  <Field ArrayList val$arrayList>
				stagedObject = JSONArray.this;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #28  <Field JSONArray val$stagedObject>
				super();
			//    9   15:aload_0         
			//   10   16:invokespecial   #31  <Method void Object()>
			//   11   19:return          
			}
	}

}

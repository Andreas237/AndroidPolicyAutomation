// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.crashlytics.android.answers.shim;

import com.crashlytics.android.answers.CustomEvent;
import java.util.*;

public class KitEvent
{

	public KitEvent(String s)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #16  <Class HashMap>
	//    4    8:dup             
	//    5    9:invokespecial   #17  <Method void HashMap()>
	//    6   12:putfield        #19  <Field Map attributes>
		eventName = s;
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:putfield        #21  <Field String eventName>
	//   10   20:return          
	}

	public KitEvent putAttribute(String s, Number number)
	{
		attributes.put(((Object) (s)), ((Object) (number)));
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field Map attributes>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//    5   11:pop             
		return this;
	//    6   12:aload_0         
	//    7   13:areturn         
	}

	public KitEvent putAttribute(String s, String s1)
	{
		attributes.put(((Object) (s)), ((Object) (s1)));
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field Map attributes>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//    5   11:pop             
		return this;
	//    6   12:aload_0         
	//    7   13:areturn         
	}

	CustomEvent toCustomEvent()
	{
		CustomEvent customevent = new CustomEvent(eventName);
	//    0    0:new             #35  <Class CustomEvent>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #21  <Field String eventName>
	//    4    8:invokespecial   #37  <Method void CustomEvent(String)>
	//    5   11:astore_1        
		Iterator iterator = attributes.keySet().iterator();
	//    6   12:aload_0         
	//    7   13:getfield        #19  <Field Map attributes>
	//    8   16:invokeinterface #41  <Method Set Map.keySet()>
	//    9   21:invokeinterface #47  <Method Iterator Set.iterator()>
	//   10   26:astore_2        
		do
		{
			if(!iterator.hasNext())
				break;
	//   11   27:aload_2         
	//   12   28:invokeinterface #53  <Method boolean Iterator.hasNext()>
	//   13   33:ifeq            102
			String s = (String)iterator.next();
	//   14   36:aload_2         
	//   15   37:invokeinterface #57  <Method Object Iterator.next()>
	//   16   42:checkcast       #59  <Class String>
	//   17   45:astore_3        
			Object obj = attributes.get(((Object) (s)));
	//   18   46:aload_0         
	//   19   47:getfield        #19  <Field Map attributes>
	//   20   50:aload_3         
	//   21   51:invokeinterface #63  <Method Object Map.get(Object)>
	//   22   56:astore          4
			if(obj instanceof String)
	//*  23   58:aload           4
	//*  24   60:instanceof      #59  <Class String>
	//*  25   63:ifeq            80
				customevent.putCustomAttribute(s, (String)obj);
	//   26   66:aload_1         
	//   27   67:aload_3         
	//   28   68:aload           4
	//   29   70:checkcast       #59  <Class String>
	//   30   73:invokevirtual   #67  <Method com.crashlytics.android.answers.AnswersEvent CustomEvent.putCustomAttribute(String, String)>
	//   31   76:pop             
			else
	//*  32   77:goto            27
			if(obj instanceof Number)
	//*  33   80:aload           4
	//*  34   82:instanceof      #69  <Class Number>
	//*  35   85:ifeq            27
				customevent.putCustomAttribute(s, (Number)obj);
	//   36   88:aload_1         
	//   37   89:aload_3         
	//   38   90:aload           4
	//   39   92:checkcast       #69  <Class Number>
	//   40   95:invokevirtual   #72  <Method com.crashlytics.android.answers.AnswersEvent CustomEvent.putCustomAttribute(String, Number)>
	//   41   98:pop             
		} while(true);
	//   42   99:goto            27
		return customevent;
	//   43  102:aload_1         
	//   44  103:areturn         
	}

	private final Map attributes = new HashMap();
	private final String eventName;
}

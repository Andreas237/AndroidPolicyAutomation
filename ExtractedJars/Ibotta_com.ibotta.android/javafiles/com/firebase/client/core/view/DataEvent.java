// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.firebase.client.core.view;

import com.firebase.client.DataSnapshot;
import com.firebase.client.Firebase;
import com.firebase.client.core.EventRegistration;
import com.firebase.client.core.Path;

// Referenced classes of package com.firebase.client.core.view:
//			Event

public class DataEvent
	implements Event
{

	public DataEvent(Event.EventType eventtype, EventRegistration eventregistration, DataSnapshot datasnapshot, String s)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void Object()>
		eventType = eventtype;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #21  <Field Event$EventType eventType>
		eventRegistration = eventregistration;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #23  <Field EventRegistration eventRegistration>
		snapshot = datasnapshot;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #25  <Field DataSnapshot snapshot>
		prevName = s;
	//   11   19:aload_0         
	//   12   20:aload           4
	//   13   22:putfield        #27  <Field String prevName>
	//   14   25:return          
	}

	public void fire()
	{
		eventRegistration.fireEvent(this);
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field EventRegistration eventRegistration>
	//    2    4:aload_0         
	//    3    5:invokevirtual   #35  <Method void EventRegistration.fireEvent(DataEvent)>
	//    4    8:return          
	}

	public Event.EventType getEventType()
	{
		return eventType;
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field Event$EventType eventType>
	//    2    4:areturn         
	}

	public Path getPath()
	{
		Path path = snapshot.getRef().getPath();
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field DataSnapshot snapshot>
	//    2    4:invokevirtual   #45  <Method Firebase DataSnapshot.getRef()>
	//    3    7:invokevirtual   #49  <Method Path Firebase.getPath()>
	//    4   10:astore_1        
		if(eventType == Event.EventType.VALUE)
	//*   5   11:aload_0         
	//*   6   12:getfield        #21  <Field Event$EventType eventType>
	//*   7   15:getstatic       #54  <Field Event$EventType Event$EventType.VALUE>
	//*   8   18:if_acmpne       23
			return path;
	//    9   21:aload_1         
	//   10   22:areturn         
		else
			return path.getParent();
	//   11   23:aload_1         
	//   12   24:invokevirtual   #59  <Method Path Path.getParent()>
	//   13   27:areturn         
	}

	public String getPreviousName()
	{
		return prevName;
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field String prevName>
	//    2    4:areturn         
	}

	public DataSnapshot getSnapshot()
	{
		return snapshot;
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field DataSnapshot snapshot>
	//    2    4:areturn         
	}

	public String toString()
	{
		if(eventType == Event.EventType.VALUE)
	//*   0    0:aload_0         
	//*   1    1:getfield        #21  <Field Event$EventType eventType>
	//*   2    4:getstatic       #54  <Field Event$EventType Event$EventType.VALUE>
	//*   3    7:if_acmpne       68
		{
			StringBuilder stringbuilder = new StringBuilder();
	//    4   10:new             #66  <Class StringBuilder>
	//    5   13:dup             
	//    6   14:invokespecial   #67  <Method void StringBuilder()>
	//    7   17:astore_1        
			stringbuilder.append(((Object) (getPath())));
	//    8   18:aload_1         
	//    9   19:aload_0         
	//   10   20:invokevirtual   #68  <Method Path getPath()>
	//   11   23:invokevirtual   #72  <Method StringBuilder StringBuilder.append(Object)>
	//   12   26:pop             
			stringbuilder.append(": ");
	//   13   27:aload_1         
	//   14   28:ldc1            #74  <String ": ">
	//   15   30:invokevirtual   #77  <Method StringBuilder StringBuilder.append(String)>
	//   16   33:pop             
			stringbuilder.append(((Object) (eventType)));
	//   17   34:aload_1         
	//   18   35:aload_0         
	//   19   36:getfield        #21  <Field Event$EventType eventType>
	//   20   39:invokevirtual   #72  <Method StringBuilder StringBuilder.append(Object)>
	//   21   42:pop             
			stringbuilder.append(": ");
	//   22   43:aload_1         
	//   23   44:ldc1            #74  <String ": ">
	//   24   46:invokevirtual   #77  <Method StringBuilder StringBuilder.append(String)>
	//   25   49:pop             
			stringbuilder.append(snapshot.getValue(true));
	//   26   50:aload_1         
	//   27   51:aload_0         
	//   28   52:getfield        #25  <Field DataSnapshot snapshot>
	//   29   55:iconst_1        
	//   30   56:invokevirtual   #81  <Method Object DataSnapshot.getValue(boolean)>
	//   31   59:invokevirtual   #72  <Method StringBuilder StringBuilder.append(Object)>
	//   32   62:pop             
			return stringbuilder.toString();
	//   33   63:aload_1         
	//   34   64:invokevirtual   #83  <Method String StringBuilder.toString()>
	//   35   67:areturn         
		} else
		{
			StringBuilder stringbuilder1 = new StringBuilder();
	//   36   68:new             #66  <Class StringBuilder>
	//   37   71:dup             
	//   38   72:invokespecial   #67  <Method void StringBuilder()>
	//   39   75:astore_1        
			stringbuilder1.append(((Object) (getPath())));
	//   40   76:aload_1         
	//   41   77:aload_0         
	//   42   78:invokevirtual   #68  <Method Path getPath()>
	//   43   81:invokevirtual   #72  <Method StringBuilder StringBuilder.append(Object)>
	//   44   84:pop             
			stringbuilder1.append(": ");
	//   45   85:aload_1         
	//   46   86:ldc1            #74  <String ": ">
	//   47   88:invokevirtual   #77  <Method StringBuilder StringBuilder.append(String)>
	//   48   91:pop             
			stringbuilder1.append(((Object) (eventType)));
	//   49   92:aload_1         
	//   50   93:aload_0         
	//   51   94:getfield        #21  <Field Event$EventType eventType>
	//   52   97:invokevirtual   #72  <Method StringBuilder StringBuilder.append(Object)>
	//   53  100:pop             
			stringbuilder1.append(": { ");
	//   54  101:aload_1         
	//   55  102:ldc1            #85  <String ": { ">
	//   56  104:invokevirtual   #77  <Method StringBuilder StringBuilder.append(String)>
	//   57  107:pop             
			stringbuilder1.append(snapshot.getKey());
	//   58  108:aload_1         
	//   59  109:aload_0         
	//   60  110:getfield        #25  <Field DataSnapshot snapshot>
	//   61  113:invokevirtual   #88  <Method String DataSnapshot.getKey()>
	//   62  116:invokevirtual   #77  <Method StringBuilder StringBuilder.append(String)>
	//   63  119:pop             
			stringbuilder1.append(": ");
	//   64  120:aload_1         
	//   65  121:ldc1            #74  <String ": ">
	//   66  123:invokevirtual   #77  <Method StringBuilder StringBuilder.append(String)>
	//   67  126:pop             
			stringbuilder1.append(snapshot.getValue(true));
	//   68  127:aload_1         
	//   69  128:aload_0         
	//   70  129:getfield        #25  <Field DataSnapshot snapshot>
	//   71  132:iconst_1        
	//   72  133:invokevirtual   #81  <Method Object DataSnapshot.getValue(boolean)>
	//   73  136:invokevirtual   #72  <Method StringBuilder StringBuilder.append(Object)>
	//   74  139:pop             
			stringbuilder1.append(" }");
	//   75  140:aload_1         
	//   76  141:ldc1            #90  <String " }">
	//   77  143:invokevirtual   #77  <Method StringBuilder StringBuilder.append(String)>
	//   78  146:pop             
			return stringbuilder1.toString();
	//   79  147:aload_1         
	//   80  148:invokevirtual   #83  <Method String StringBuilder.toString()>
	//   81  151:areturn         
		}
	}

	private final EventRegistration eventRegistration;
	private final Event.EventType eventType;
	private final String prevName;
	private final DataSnapshot snapshot;
}

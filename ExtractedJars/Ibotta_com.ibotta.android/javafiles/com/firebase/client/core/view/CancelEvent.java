// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.firebase.client.core.view;

import com.firebase.client.FirebaseError;
import com.firebase.client.core.EventRegistration;
import com.firebase.client.core.Path;

// Referenced classes of package com.firebase.client.core.view:
//			Event

public class CancelEvent
	implements Event
{

	public CancelEvent(EventRegistration eventregistration, FirebaseError firebaseerror, Path path1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
		eventRegistration = eventregistration;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #19  <Field EventRegistration eventRegistration>
		path = path1;
	//    5    9:aload_0         
	//    6   10:aload_3         
	//    7   11:putfield        #21  <Field Path path>
		error = firebaseerror;
	//    8   14:aload_0         
	//    9   15:aload_2         
	//   10   16:putfield        #23  <Field FirebaseError error>
	//   11   19:return          
	}

	public void fire()
	{
		eventRegistration.fireCancelEvent(error);
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field EventRegistration eventRegistration>
	//    2    4:aload_0         
	//    3    5:getfield        #23  <Field FirebaseError error>
	//    4    8:invokevirtual   #31  <Method void EventRegistration.fireCancelEvent(FirebaseError)>
	//    5   11:return          
	}

	public Path getPath()
	{
		return path;
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field Path path>
	//    2    4:areturn         
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #37  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #38  <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append(((Object) (getPath())));
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:invokevirtual   #40  <Method Path getPath()>
	//    7   13:invokevirtual   #44  <Method StringBuilder StringBuilder.append(Object)>
	//    8   16:pop             
		stringbuilder.append(":");
	//    9   17:aload_1         
	//   10   18:ldc1            #46  <String ":">
	//   11   20:invokevirtual   #49  <Method StringBuilder StringBuilder.append(String)>
	//   12   23:pop             
		stringbuilder.append("CANCEL");
	//   13   24:aload_1         
	//   14   25:ldc1            #51  <String "CANCEL">
	//   15   27:invokevirtual   #49  <Method StringBuilder StringBuilder.append(String)>
	//   16   30:pop             
		return stringbuilder.toString();
	//   17   31:aload_1         
	//   18   32:invokevirtual   #53  <Method String StringBuilder.toString()>
	//   19   35:areturn         
	}

	private final FirebaseError error;
	private final EventRegistration eventRegistration;
	private final Path path;
}

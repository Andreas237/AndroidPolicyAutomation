// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.firebase.client.core;

import com.firebase.client.*;
import com.firebase.client.core.view.Change;
import com.firebase.client.core.view.DataEvent;
import com.firebase.client.core.view.QuerySpec;

// Referenced classes of package com.firebase.client.core:
//			EventRegistration, Repo

public class ValueEventRegistration extends EventRegistration
{

	public ValueEventRegistration(Repo repo1, ValueEventListener valueeventlistener, QuerySpec queryspec)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void EventRegistration()>
		repo = repo1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #18  <Field Repo repo>
		eventListener = valueeventlistener;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #20  <Field ValueEventListener eventListener>
		spec = queryspec;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #22  <Field QuerySpec spec>
	//   11   19:return          
	}

	public EventRegistration clone(QuerySpec queryspec)
	{
		return ((EventRegistration) (new ValueEventRegistration(repo, eventListener, queryspec)));
	//    0    0:new             #2   <Class ValueEventRegistration>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #18  <Field Repo repo>
	//    4    8:aload_0         
	//    5    9:getfield        #20  <Field ValueEventListener eventListener>
	//    6   12:aload_1         
	//    7   13:invokespecial   #28  <Method void ValueEventRegistration(Repo, ValueEventListener, QuerySpec)>
	//    8   16:areturn         
	}

	public DataEvent createEvent(Change change, QuerySpec queryspec)
	{
		change = ((Change) (new DataSnapshot(new Firebase(repo, queryspec.getPath()), change.getIndexedNode())));
	//    0    0:new             #32  <Class DataSnapshot>
	//    1    3:dup             
	//    2    4:new             #34  <Class Firebase>
	//    3    7:dup             
	//    4    8:aload_0         
	//    5    9:getfield        #18  <Field Repo repo>
	//    6   12:aload_2         
	//    7   13:invokevirtual   #40  <Method Path QuerySpec.getPath()>
	//    8   16:invokespecial   #43  <Method void Firebase(Repo, Path)>
	//    9   19:aload_1         
	//   10   20:invokevirtual   #49  <Method com.firebase.client.snapshot.IndexedNode Change.getIndexedNode()>
	//   11   23:invokespecial   #52  <Method void DataSnapshot(Firebase, com.firebase.client.snapshot.IndexedNode)>
	//   12   26:astore_1        
		return new DataEvent(com.firebase.client.core.view.Event.EventType.VALUE, ((EventRegistration) (this)), ((DataSnapshot) (change)), ((String) (null)));
	//   13   27:new             #54  <Class DataEvent>
	//   14   30:dup             
	//   15   31:getstatic       #60  <Field com.firebase.client.core.view.Event$EventType com.firebase.client.core.view.Event$EventType.VALUE>
	//   16   34:aload_0         
	//   17   35:aload_1         
	//   18   36:aconst_null     
	//   19   37:invokespecial   #63  <Method void DataEvent(com.firebase.client.core.view.Event$EventType, EventRegistration, DataSnapshot, String)>
	//   20   40:areturn         
	}

	public boolean equals(Object obj)
	{
		if(obj instanceof ValueEventRegistration)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #2   <Class ValueEventRegistration>
	//*   2    4:ifeq            56
		{
			obj = ((Object) ((ValueEventRegistration)obj));
	//    3    7:aload_1         
	//    4    8:checkcast       #2   <Class ValueEventRegistration>
	//    5   11:astore_1        
			if(((Object) (((ValueEventRegistration) (obj)).eventListener)).equals(((Object) (eventListener))) && ((Object) (((ValueEventRegistration) (obj)).repo)).equals(((Object) (repo))) && ((ValueEventRegistration) (obj)).spec.equals(((Object) (spec))))
	//*   6   12:aload_1         
	//*   7   13:getfield        #20  <Field ValueEventListener eventListener>
	//*   8   16:aload_0         
	//*   9   17:getfield        #20  <Field ValueEventListener eventListener>
	//*  10   20:invokevirtual   #69  <Method boolean Object.equals(Object)>
	//*  11   23:ifeq            56
	//*  12   26:aload_1         
	//*  13   27:getfield        #18  <Field Repo repo>
	//*  14   30:aload_0         
	//*  15   31:getfield        #18  <Field Repo repo>
	//*  16   34:invokevirtual   #69  <Method boolean Object.equals(Object)>
	//*  17   37:ifeq            56
	//*  18   40:aload_1         
	//*  19   41:getfield        #22  <Field QuerySpec spec>
	//*  20   44:aload_0         
	//*  21   45:getfield        #22  <Field QuerySpec spec>
	//*  22   48:invokevirtual   #70  <Method boolean QuerySpec.equals(Object)>
	//*  23   51:ifeq            56
				return true;
	//   24   54:iconst_1        
	//   25   55:ireturn         
		}
		return false;
	//   26   56:iconst_0        
	//   27   57:ireturn         
	}

	public void fireCancelEvent(FirebaseError firebaseerror)
	{
		eventListener.onCancelled(firebaseerror);
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field ValueEventListener eventListener>
	//    2    4:aload_1         
	//    3    5:invokeinterface #77  <Method void ValueEventListener.onCancelled(FirebaseError)>
	//    4   10:return          
	}

	public void fireEvent(DataEvent dataevent)
	{
		if(isZombied())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #83  <Method boolean isZombied()>
	//*   2    4:ifeq            8
		{
			return;
	//    3    7:return          
		} else
		{
			eventListener.onDataChange(dataevent.getSnapshot());
	//    4    8:aload_0         
	//    5    9:getfield        #20  <Field ValueEventListener eventListener>
	//    6   12:aload_1         
	//    7   13:invokevirtual   #87  <Method DataSnapshot DataEvent.getSnapshot()>
	//    8   16:invokeinterface #91  <Method void ValueEventListener.onDataChange(DataSnapshot)>
			return;
	//    9   21:return          
		}
	}

	public QuerySpec getQuerySpec()
	{
		return spec;
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field QuerySpec spec>
	//    2    4:areturn         
	}

	Repo getRepo()
	{
		return repo;
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field Repo repo>
	//    2    4:areturn         
	}

	public int hashCode()
	{
		return (((Object) (eventListener)).hashCode() * 31 + ((Object) (repo)).hashCode()) * 31 + spec.hashCode();
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field ValueEventListener eventListener>
	//    2    4:invokevirtual   #100 <Method int Object.hashCode()>
	//    3    7:bipush          31
	//    4    9:imul            
	//    5   10:aload_0         
	//    6   11:getfield        #18  <Field Repo repo>
	//    7   14:invokevirtual   #100 <Method int Object.hashCode()>
	//    8   17:iadd            
	//    9   18:bipush          31
	//   10   20:imul            
	//   11   21:aload_0         
	//   12   22:getfield        #22  <Field QuerySpec spec>
	//   13   25:invokevirtual   #101 <Method int QuerySpec.hashCode()>
	//   14   28:iadd            
	//   15   29:ireturn         
	}

	public boolean isSameListener(EventRegistration eventregistration)
	{
		return (eventregistration instanceof ValueEventRegistration) && ((Object) (((ValueEventRegistration)eventregistration).eventListener)).equals(((Object) (eventListener)));
	//    0    0:aload_1         
	//    1    1:instanceof      #2   <Class ValueEventRegistration>
	//    2    4:ifeq            26
	//    3    7:aload_1         
	//    4    8:checkcast       #2   <Class ValueEventRegistration>
	//    5   11:getfield        #20  <Field ValueEventListener eventListener>
	//    6   14:aload_0         
	//    7   15:getfield        #20  <Field ValueEventListener eventListener>
	//    8   18:invokevirtual   #69  <Method boolean Object.equals(Object)>
	//    9   21:ifeq            26
	//   10   24:iconst_1        
	//   11   25:ireturn         
	//   12   26:iconst_0        
	//   13   27:ireturn         
	}

	public boolean respondsTo(com.firebase.client.core.view.Event.EventType eventtype)
	{
		return eventtype == com.firebase.client.core.view.Event.EventType.VALUE;
	//    0    0:aload_1         
	//    1    1:getstatic       #60  <Field com.firebase.client.core.view.Event$EventType com.firebase.client.core.view.Event$EventType.VALUE>
	//    2    4:if_acmpne       9
	//    3    7:iconst_1        
	//    4    8:ireturn         
	//    5    9:iconst_0        
	//    6   10:ireturn         
	}

	public String toString()
	{
		return "ValueEventRegistration";
	//    0    0:ldc1            #109 <String "ValueEventRegistration">
	//    1    2:areturn         
	}

	private final ValueEventListener eventListener;
	private final Repo repo;
	private final QuerySpec spec;
}

// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.firebase.client.core;

import com.firebase.client.FirebaseError;
import com.firebase.client.core.view.Change;
import com.firebase.client.core.view.DataEvent;
import com.firebase.client.core.view.QuerySpec;
import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package com.firebase.client.core:
//			EventRegistrationZombieListener, Repo

public abstract class EventRegistration
{

	public EventRegistration()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void Object()>
		zombied = new AtomicBoolean(false);
	//    2    4:aload_0         
	//    3    5:new             #20  <Class AtomicBoolean>
	//    4    8:dup             
	//    5    9:iconst_0        
	//    6   10:invokespecial   #23  <Method void AtomicBoolean(boolean)>
	//    7   13:putfield        #25  <Field AtomicBoolean zombied>
		isUserInitiated = false;
	//    8   16:aload_0         
	//    9   17:iconst_0        
	//   10   18:putfield        #27  <Field boolean isUserInitiated>
	//   11   21:return          
	}

	public abstract EventRegistration clone(QuerySpec queryspec);

	public abstract DataEvent createEvent(Change change, QuerySpec queryspec);

	public abstract void fireCancelEvent(FirebaseError firebaseerror);

	public abstract void fireEvent(DataEvent dataevent);

	public abstract QuerySpec getQuerySpec();

	Repo getRepo()
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public abstract boolean isSameListener(EventRegistration eventregistration);

	public boolean isUserInitiated()
	{
		return isUserInitiated;
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field boolean isUserInitiated>
	//    2    4:ireturn         
	}

	public boolean isZombied()
	{
		return zombied.get();
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field AtomicBoolean zombied>
	//    2    4:invokevirtual   #47  <Method boolean AtomicBoolean.get()>
	//    3    7:ireturn         
	}

	public abstract boolean respondsTo(com.firebase.client.core.view.Event.EventType eventtype);

	public void setIsUserInitiated(boolean flag)
	{
		isUserInitiated = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #27  <Field boolean isUserInitiated>
	//    3    5:return          
	}

	public void setOnZombied(EventRegistrationZombieListener eventregistrationzombielistener)
	{
		listener = eventregistrationzombielistener;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #54  <Field EventRegistrationZombieListener listener>
	//    3    5:return          
	}

	public void zombify()
	{
		if(zombied.compareAndSet(false, true))
	//*   0    0:aload_0         
	//*   1    1:getfield        #25  <Field AtomicBoolean zombied>
	//*   2    4:iconst_0        
	//*   3    5:iconst_1        
	//*   4    6:invokevirtual   #59  <Method boolean AtomicBoolean.compareAndSet(boolean, boolean)>
	//*   5    9:ifeq            33
		{
			EventRegistrationZombieListener eventregistrationzombielistener = listener;
	//    6   12:aload_0         
	//    7   13:getfield        #54  <Field EventRegistrationZombieListener listener>
	//    8   16:astore_1        
			if(eventregistrationzombielistener != null)
	//*   9   17:aload_1         
	//*  10   18:ifnull          33
			{
				eventregistrationzombielistener.onZombied(this);
	//   11   21:aload_1         
	//   12   22:aload_0         
	//   13   23:invokeinterface #65  <Method void EventRegistrationZombieListener.onZombied(EventRegistration)>
				listener = null;
	//   14   28:aload_0         
	//   15   29:aconst_null     
	//   16   30:putfield        #54  <Field EventRegistrationZombieListener listener>
			}
		}
	//   17   33:return          
	}

	static final boolean $assertionsDisabled = false;
	private boolean isUserInitiated;
	private EventRegistrationZombieListener listener;
	private AtomicBoolean zombied;

	static 
	{
	//    0    0:return          
	}
}

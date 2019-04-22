// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.firebase.client.core;

import com.firebase.client.FirebaseError;
import com.firebase.client.core.view.Change;
import com.firebase.client.core.view.DataEvent;
import com.firebase.client.core.view.QuerySpec;

// Referenced classes of package com.firebase.client.core:
//			EventRegistration, SyncTree

private static class SyncTree$KeepSyncedEventRegistration extends EventRegistration
{

	public EventRegistration clone(QuerySpec queryspec)
	{
		return ((EventRegistration) (new SyncTree$KeepSyncedEventRegistration(queryspec)));
	//    0    0:new             #2   <Class SyncTree$KeepSyncedEventRegistration>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:invokespecial   #23  <Method void SyncTree$KeepSyncedEventRegistration(QuerySpec)>
	//    4    8:areturn         
	}

	public DataEvent createEvent(Change change, QuerySpec queryspec)
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public boolean equals(Object obj)
	{
		return (obj instanceof SyncTree$KeepSyncedEventRegistration) && ((SyncTree$KeepSyncedEventRegistration)obj).spec.equals(((Object) (spec)));
	//    0    0:aload_1         
	//    1    1:instanceof      #2   <Class SyncTree$KeepSyncedEventRegistration>
	//    2    4:ifeq            26
	//    3    7:aload_1         
	//    4    8:checkcast       #2   <Class SyncTree$KeepSyncedEventRegistration>
	//    5   11:getfield        #17  <Field QuerySpec spec>
	//    6   14:aload_0         
	//    7   15:getfield        #17  <Field QuerySpec spec>
	//    8   18:invokevirtual   #31  <Method boolean QuerySpec.equals(Object)>
	//    9   21:ifeq            26
	//   10   24:iconst_1        
	//   11   25:ireturn         
	//   12   26:iconst_0        
	//   13   27:ireturn         
	}

	public void fireCancelEvent(FirebaseError firebaseerror)
	{
	//    0    0:return          
	}

	public void fireEvent(DataEvent dataevent)
	{
	//    0    0:return          
	}

	public QuerySpec getQuerySpec()
	{
		return spec;
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field QuerySpec spec>
	//    2    4:areturn         
	}

	public int hashCode()
	{
		return spec.hashCode();
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field QuerySpec spec>
	//    2    4:invokevirtual   #42  <Method int QuerySpec.hashCode()>
	//    3    7:ireturn         
	}

	public boolean isSameListener(EventRegistration eventregistration)
	{
		return eventregistration instanceof SyncTree$KeepSyncedEventRegistration;
	//    0    0:aload_1         
	//    1    1:instanceof      #2   <Class SyncTree$KeepSyncedEventRegistration>
	//    2    4:ireturn         
	}

	public boolean respondsTo(com.firebase.client.core.view.Event.EventType eventtype)
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	private QuerySpec spec;

	public SyncTree$KeepSyncedEventRegistration(QuerySpec queryspec)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void EventRegistration()>
		spec = queryspec;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #17  <Field QuerySpec spec>
	//    5    9:return          
	}
}

// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.firebase.client.core;

import com.firebase.client.*;
import com.firebase.client.core.view.Change;
import com.firebase.client.core.view.DataEvent;
import com.firebase.client.core.view.QuerySpec;
import com.firebase.client.snapshot.ChildKey;

// Referenced classes of package com.firebase.client.core:
//			EventRegistration, Path, Repo

public class ChildEventRegistration extends EventRegistration
{

	public ChildEventRegistration(Repo repo1, ChildEventListener childeventlistener, QuerySpec queryspec)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void EventRegistration()>
		repo = repo1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #20  <Field Repo repo>
		eventListener = childeventlistener;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #22  <Field ChildEventListener eventListener>
		spec = queryspec;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #24  <Field QuerySpec spec>
	//   11   19:return          
	}

	public EventRegistration clone(QuerySpec queryspec)
	{
		return ((EventRegistration) (new ChildEventRegistration(repo, eventListener, queryspec)));
	//    0    0:new             #2   <Class ChildEventRegistration>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #20  <Field Repo repo>
	//    4    8:aload_0         
	//    5    9:getfield        #22  <Field ChildEventListener eventListener>
	//    6   12:aload_1         
	//    7   13:invokespecial   #30  <Method void ChildEventRegistration(Repo, ChildEventListener, QuerySpec)>
	//    8   16:areturn         
	}

	public DataEvent createEvent(Change change, QuerySpec queryspec)
	{
		DataSnapshot datasnapshot = new DataSnapshot(new Firebase(repo, queryspec.getPath().child(change.getChildKey())), change.getIndexedNode());
	//    0    0:new             #34  <Class DataSnapshot>
	//    1    3:dup             
	//    2    4:new             #36  <Class Firebase>
	//    3    7:dup             
	//    4    8:aload_0         
	//    5    9:getfield        #20  <Field Repo repo>
	//    6   12:aload_2         
	//    7   13:invokevirtual   #42  <Method Path QuerySpec.getPath()>
	//    8   16:aload_1         
	//    9   17:invokevirtual   #48  <Method ChildKey Change.getChildKey()>
	//   10   20:invokevirtual   #54  <Method Path Path.child(ChildKey)>
	//   11   23:invokespecial   #57  <Method void Firebase(Repo, Path)>
	//   12   26:aload_1         
	//   13   27:invokevirtual   #61  <Method com.firebase.client.snapshot.IndexedNode Change.getIndexedNode()>
	//   14   30:invokespecial   #64  <Method void DataSnapshot(Firebase, com.firebase.client.snapshot.IndexedNode)>
	//   15   33:astore_3        
		if(change.getPrevName() != null)
	//*  16   34:aload_1         
	//*  17   35:invokevirtual   #67  <Method ChildKey Change.getPrevName()>
	//*  18   38:ifnull          52
			queryspec = ((QuerySpec) (change.getPrevName().asString()));
	//   19   41:aload_1         
	//   20   42:invokevirtual   #67  <Method ChildKey Change.getPrevName()>
	//   21   45:invokevirtual   #73  <Method String ChildKey.asString()>
	//   22   48:astore_2        
		else
	//*  23   49:goto            54
			queryspec = null;
	//   24   52:aconst_null     
	//   25   53:astore_2        
		return new DataEvent(change.getEventType(), ((EventRegistration) (this)), datasnapshot, ((String) (queryspec)));
	//   26   54:new             #75  <Class DataEvent>
	//   27   57:dup             
	//   28   58:aload_1         
	//   29   59:invokevirtual   #79  <Method com.firebase.client.core.view.Event$EventType Change.getEventType()>
	//   30   62:aload_0         
	//   31   63:aload_3         
	//   32   64:aload_2         
	//   33   65:invokespecial   #82  <Method void DataEvent(com.firebase.client.core.view.Event$EventType, EventRegistration, DataSnapshot, String)>
	//   34   68:areturn         
	}

	public boolean equals(Object obj)
	{
		if(obj instanceof ChildEventRegistration)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #2   <Class ChildEventRegistration>
	//*   2    4:ifeq            56
		{
			obj = ((Object) ((ChildEventRegistration)obj));
	//    3    7:aload_1         
	//    4    8:checkcast       #2   <Class ChildEventRegistration>
	//    5   11:astore_1        
			if(((Object) (((ChildEventRegistration) (obj)).eventListener)).equals(((Object) (eventListener))) && ((Object) (((ChildEventRegistration) (obj)).repo)).equals(((Object) (repo))) && ((ChildEventRegistration) (obj)).spec.equals(((Object) (spec))))
	//*   6   12:aload_1         
	//*   7   13:getfield        #22  <Field ChildEventListener eventListener>
	//*   8   16:aload_0         
	//*   9   17:getfield        #22  <Field ChildEventListener eventListener>
	//*  10   20:invokevirtual   #88  <Method boolean Object.equals(Object)>
	//*  11   23:ifeq            56
	//*  12   26:aload_1         
	//*  13   27:getfield        #20  <Field Repo repo>
	//*  14   30:aload_0         
	//*  15   31:getfield        #20  <Field Repo repo>
	//*  16   34:invokevirtual   #88  <Method boolean Object.equals(Object)>
	//*  17   37:ifeq            56
	//*  18   40:aload_1         
	//*  19   41:getfield        #24  <Field QuerySpec spec>
	//*  20   44:aload_0         
	//*  21   45:getfield        #24  <Field QuerySpec spec>
	//*  22   48:invokevirtual   #89  <Method boolean QuerySpec.equals(Object)>
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
	//    1    1:getfield        #22  <Field ChildEventListener eventListener>
	//    2    4:aload_1         
	//    3    5:invokeinterface #96  <Method void ChildEventListener.onCancelled(FirebaseError)>
	//    4   10:return          
	}

	public void fireEvent(DataEvent dataevent)
	{
		if(isZombied())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #102 <Method boolean isZombied()>
	//*   2    4:ifeq            8
			return;
	//    3    7:return          
		static class _cls1
		{

			static final int $SwitchMap$com$firebase$client$core$view$Event$EventType[];

			static 
			{
				$SwitchMap$com$firebase$client$core$view$Event$EventType = new int[com.firebase.client.core.view.Event.EventType.values().length];
			//    0    0:invokestatic    #18  <Method com.firebase.client.core.view.Event$EventType[] com.firebase.client.core.view.Event$EventType.values()>
			//    1    3:arraylength     
			//    2    4:newarray        int[]
			//    3    6:putstatic       #20  <Field int[] $SwitchMap$com$firebase$client$core$view$Event$EventType>
				try
				{
					$SwitchMap$com$firebase$client$core$view$Event$EventType[com.firebase.client.core.view.Event.EventType.CHILD_ADDED.ordinal()] = 1;
			//    4    9:getstatic       #20  <Field int[] $SwitchMap$com$firebase$client$core$view$Event$EventType>
			//    5   12:getstatic       #24  <Field com.firebase.client.core.view.Event$EventType com.firebase.client.core.view.Event$EventType.CHILD_ADDED>
			//    6   15:invokevirtual   #28  <Method int com.firebase.client.core.view.Event$EventType.ordinal()>
			//    7   18:iconst_1        
			//    8   19:iastore         
				}
			//*   9   20:getstatic       #20  <Field int[] $SwitchMap$com$firebase$client$core$view$Event$EventType>
			//*  10   23:getstatic       #31  <Field com.firebase.client.core.view.Event$EventType com.firebase.client.core.view.Event$EventType.CHILD_CHANGED>
			//*  11   26:invokevirtual   #28  <Method int com.firebase.client.core.view.Event$EventType.ordinal()>
			//*  12   29:iconst_2        
			//*  13   30:iastore         
			//*  14   31:getstatic       #20  <Field int[] $SwitchMap$com$firebase$client$core$view$Event$EventType>
			//*  15   34:getstatic       #34  <Field com.firebase.client.core.view.Event$EventType com.firebase.client.core.view.Event$EventType.CHILD_MOVED>
			//*  16   37:invokevirtual   #28  <Method int com.firebase.client.core.view.Event$EventType.ordinal()>
			//*  17   40:iconst_3        
			//*  18   41:iastore         
			//*  19   42:getstatic       #20  <Field int[] $SwitchMap$com$firebase$client$core$view$Event$EventType>
			//*  20   45:getstatic       #37  <Field com.firebase.client.core.view.Event$EventType com.firebase.client.core.view.Event$EventType.CHILD_REMOVED>
			//*  21   48:invokevirtual   #28  <Method int com.firebase.client.core.view.Event$EventType.ordinal()>
			//*  22   51:iconst_4        
			//*  23   52:iastore         
			//*  24   53:return          
				catch(NoSuchFieldError nosuchfielderror) { }
			//   25   54:astore_0        
				try
				{
					$SwitchMap$com$firebase$client$core$view$Event$EventType[com.firebase.client.core.view.Event.EventType.CHILD_CHANGED.ordinal()] = 2;
				}
			//*  26   55:goto            20
				catch(NoSuchFieldError nosuchfielderror1) { }
			//   27   58:astore_0        
				try
				{
					$SwitchMap$com$firebase$client$core$view$Event$EventType[com.firebase.client.core.view.Event.EventType.CHILD_MOVED.ordinal()] = 3;
				}
			//*  28   59:goto            31
				catch(NoSuchFieldError nosuchfielderror2) { }
			//   29   62:astore_0        
				try
				{
					$SwitchMap$com$firebase$client$core$view$Event$EventType[com.firebase.client.core.view.Event.EventType.CHILD_REMOVED.ordinal()] = 4;
				}
			//*  30   63:goto            42
				catch(NoSuchFieldError nosuchfielderror3) { }
			//   31   66:astore_0        
			//*  32   67:return          
			}
		}

		switch(_cls1..SwitchMap.com.firebase.client.core.view.Event.EventType[dataevent.getEventType().ordinal()])
	//*   4    8:getstatic       #106 <Field int[] ChildEventRegistration$1.$SwitchMap$com$firebase$client$core$view$Event$EventType>
	//*   5   11:aload_1         
	//*   6   12:invokevirtual   #107 <Method com.firebase.client.core.view.Event$EventType DataEvent.getEventType()>
	//*   7   15:invokevirtual   #113 <Method int com.firebase.client.core.view.Event$EventType.ordinal()>
	//*   8   18:iaload          
		{
	//*   9   19:tableswitch     1 4: default 48
	//	               1 99
	//	               2 81
	//	               3 63
	//	               4 49
		default:
			return;
	//   10   48:return          

		case 4: // '\004'
			eventListener.onChildRemoved(dataevent.getSnapshot());
	//   11   49:aload_0         
	//   12   50:getfield        #22  <Field ChildEventListener eventListener>
	//   13   53:aload_1         
	//   14   54:invokevirtual   #117 <Method DataSnapshot DataEvent.getSnapshot()>
	//   15   57:invokeinterface #121 <Method void ChildEventListener.onChildRemoved(DataSnapshot)>
			return;
	//   16   62:return          

		case 3: // '\003'
			eventListener.onChildMoved(dataevent.getSnapshot(), dataevent.getPreviousName());
	//   17   63:aload_0         
	//   18   64:getfield        #22  <Field ChildEventListener eventListener>
	//   19   67:aload_1         
	//   20   68:invokevirtual   #117 <Method DataSnapshot DataEvent.getSnapshot()>
	//   21   71:aload_1         
	//   22   72:invokevirtual   #124 <Method String DataEvent.getPreviousName()>
	//   23   75:invokeinterface #128 <Method void ChildEventListener.onChildMoved(DataSnapshot, String)>
			return;
	//   24   80:return          

		case 2: // '\002'
			eventListener.onChildChanged(dataevent.getSnapshot(), dataevent.getPreviousName());
	//   25   81:aload_0         
	//   26   82:getfield        #22  <Field ChildEventListener eventListener>
	//   27   85:aload_1         
	//   28   86:invokevirtual   #117 <Method DataSnapshot DataEvent.getSnapshot()>
	//   29   89:aload_1         
	//   30   90:invokevirtual   #124 <Method String DataEvent.getPreviousName()>
	//   31   93:invokeinterface #131 <Method void ChildEventListener.onChildChanged(DataSnapshot, String)>
			return;
	//   32   98:return          

		case 1: // '\001'
			eventListener.onChildAdded(dataevent.getSnapshot(), dataevent.getPreviousName());
	//   33   99:aload_0         
	//   34  100:getfield        #22  <Field ChildEventListener eventListener>
	//   35  103:aload_1         
	//   36  104:invokevirtual   #117 <Method DataSnapshot DataEvent.getSnapshot()>
	//   37  107:aload_1         
	//   38  108:invokevirtual   #124 <Method String DataEvent.getPreviousName()>
	//   39  111:invokeinterface #134 <Method void ChildEventListener.onChildAdded(DataSnapshot, String)>
			return;
	//   40  116:return          
		}
	}

	public QuerySpec getQuerySpec()
	{
		return spec;
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field QuerySpec spec>
	//    2    4:areturn         
	}

	Repo getRepo()
	{
		return repo;
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field Repo repo>
	//    2    4:areturn         
	}

	public int hashCode()
	{
		return (((Object) (eventListener)).hashCode() * 31 + ((Object) (repo)).hashCode()) * 31 + spec.hashCode();
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field ChildEventListener eventListener>
	//    2    4:invokevirtual   #142 <Method int Object.hashCode()>
	//    3    7:bipush          31
	//    4    9:imul            
	//    5   10:aload_0         
	//    6   11:getfield        #20  <Field Repo repo>
	//    7   14:invokevirtual   #142 <Method int Object.hashCode()>
	//    8   17:iadd            
	//    9   18:bipush          31
	//   10   20:imul            
	//   11   21:aload_0         
	//   12   22:getfield        #24  <Field QuerySpec spec>
	//   13   25:invokevirtual   #143 <Method int QuerySpec.hashCode()>
	//   14   28:iadd            
	//   15   29:ireturn         
	}

	public boolean isSameListener(EventRegistration eventregistration)
	{
		return (eventregistration instanceof ChildEventRegistration) && ((Object) (((ChildEventRegistration)eventregistration).eventListener)).equals(((Object) (eventListener)));
	//    0    0:aload_1         
	//    1    1:instanceof      #2   <Class ChildEventRegistration>
	//    2    4:ifeq            26
	//    3    7:aload_1         
	//    4    8:checkcast       #2   <Class ChildEventRegistration>
	//    5   11:getfield        #22  <Field ChildEventListener eventListener>
	//    6   14:aload_0         
	//    7   15:getfield        #22  <Field ChildEventListener eventListener>
	//    8   18:invokevirtual   #88  <Method boolean Object.equals(Object)>
	//    9   21:ifeq            26
	//   10   24:iconst_1        
	//   11   25:ireturn         
	//   12   26:iconst_0        
	//   13   27:ireturn         
	}

	public boolean respondsTo(com.firebase.client.core.view.Event.EventType eventtype)
	{
		return eventtype != com.firebase.client.core.view.Event.EventType.VALUE;
	//    0    0:aload_1         
	//    1    1:getstatic       #151 <Field com.firebase.client.core.view.Event$EventType com.firebase.client.core.view.Event$EventType.VALUE>
	//    2    4:if_acmpeq       9
	//    3    7:iconst_1        
	//    4    8:ireturn         
	//    5    9:iconst_0        
	//    6   10:ireturn         
	}

	public String toString()
	{
		return "ChildEventRegistration";
	//    0    0:ldc1            #154 <String "ChildEventRegistration">
	//    1    2:areturn         
	}

	private final ChildEventListener eventListener;
	private final Repo repo;
	private final QuerySpec spec;
}

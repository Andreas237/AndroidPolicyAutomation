// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.firebase.client.core;


// Referenced classes of package com.firebase.client.core:
//			ChildEventRegistration

static class ChildEventRegistration$1
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

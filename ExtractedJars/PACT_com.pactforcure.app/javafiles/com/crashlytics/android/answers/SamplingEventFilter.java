// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.crashlytics.android.answers;

import java.util.HashSet;
import java.util.Set;

// Referenced classes of package com.crashlytics.android.answers:
//			EventFilter, SessionEvent, SessionEventMetadata

class SamplingEventFilter
	implements EventFilter
{

	public SamplingEventFilter(int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #23  <Method void Object()>
		samplingRate = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #25  <Field int samplingRate>
	//    5    9:return          
	}

	public boolean skipEvent(SessionEvent sessionevent)
	{
		boolean flag;
		boolean flag1;
		if(EVENTS_TYPE_TO_SAMPLE.contains(((Object) (sessionevent.type))) && sessionevent.sessionEventMetadata.betaDeviceToken == null)
	//*   0    0:getstatic       #20  <Field Set EVENTS_TYPE_TO_SAMPLE>
	//*   1    3:aload_1         
	//*   2    4:getfield        #33  <Field SessionEvent$Type SessionEvent.type>
	//*   3    7:invokeinterface #39  <Method boolean Set.contains(Object)>
	//*   4   12:ifeq            60
	//*   5   15:aload_1         
	//*   6   16:getfield        #43  <Field SessionEventMetadata SessionEvent.sessionEventMetadata>
	//*   7   19:getfield        #49  <Field String SessionEventMetadata.betaDeviceToken>
	//*   8   22:ifnonnull       60
			flag = true;
	//    9   25:iconst_1        
	//   10   26:istore_2        
		else
	//*  11   27:aload_1         
	//*  12   28:getfield        #43  <Field SessionEventMetadata SessionEvent.sessionEventMetadata>
	//*  13   31:getfield        #52  <Field String SessionEventMetadata.installationId>
	//*  14   34:invokevirtual   #58  <Method int String.hashCode()>
	//*  15   37:aload_0         
	//*  16   38:getfield        #25  <Field int samplingRate>
	//*  17   41:irem            
	//*  18   42:invokestatic    #64  <Method int Math.abs(int)>
	//*  19   45:ifeq            65
	//*  20   48:iconst_1        
	//*  21   49:istore_3        
	//*  22   50:iload_2         
	//*  23   51:ifeq            70
	//*  24   54:iload_3         
	//*  25   55:ifeq            70
	//*  26   58:iconst_1        
	//*  27   59:ireturn         
			flag = false;
	//   28   60:iconst_0        
	//   29   61:istore_2        
		if(Math.abs(sessionevent.sessionEventMetadata.installationId.hashCode() % samplingRate) != 0)
			flag1 = true;
		else
	//*  30   62:goto            27
			flag1 = false;
	//   31   65:iconst_0        
	//   32   66:istore_3        
		return flag && flag1;
	//   33   67:goto            50
	//   34   70:iconst_0        
	//   35   71:ireturn         
	}

	static final Set EVENTS_TYPE_TO_SAMPLE = new HashSet() {

			
			{
			//    0    0:aload_0         
			//    1    1:invokespecial   #11  <Method void HashSet()>
				add(((Object) (SessionEvent.Type.START)));
			//    2    4:aload_0         
			//    3    5:getstatic       #17  <Field SessionEvent$Type SessionEvent$Type.START>
			//    4    8:invokevirtual   #21  <Method boolean add(Object)>
			//    5   11:pop             
				add(((Object) (SessionEvent.Type.RESUME)));
			//    6   12:aload_0         
			//    7   13:getstatic       #24  <Field SessionEvent$Type SessionEvent$Type.RESUME>
			//    8   16:invokevirtual   #21  <Method boolean add(Object)>
			//    9   19:pop             
				add(((Object) (SessionEvent.Type.PAUSE)));
			//   10   20:aload_0         
			//   11   21:getstatic       #27  <Field SessionEvent$Type SessionEvent$Type.PAUSE>
			//   12   24:invokevirtual   #21  <Method boolean add(Object)>
			//   13   27:pop             
				add(((Object) (SessionEvent.Type.STOP)));
			//   14   28:aload_0         
			//   15   29:getstatic       #30  <Field SessionEvent$Type SessionEvent$Type.STOP>
			//   16   32:invokevirtual   #21  <Method boolean add(Object)>
			//   17   35:pop             
			//   18   36:return          
			}
	}
;
	final int samplingRate;

	static 
	{
	//    0    0:new             #8   <Class SamplingEventFilter$1>
	//    1    3:dup             
	//    2    4:invokespecial   #18  <Method void SamplingEventFilter$1()>
	//    3    7:putstatic       #20  <Field Set EVENTS_TYPE_TO_SAMPLE>
	//*   4   10:return          
	}
}

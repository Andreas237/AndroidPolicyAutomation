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
		if(EVENTS_TYPE_TO_SAMPLE.contains(((Object) (sessionevent.type))) && sessionevent.sessionEventMetadata.betaDeviceToken == null)
	//*   0    0:getstatic       #20  <Field Set EVENTS_TYPE_TO_SAMPLE>
	//*   1    3:aload_1         
	//*   2    4:getfield        #33  <Field SessionEvent$Type SessionEvent.type>
	//*   3    7:invokeinterface #39  <Method boolean Set.contains(Object)>
	//*   4   12:ifeq            30
	//*   5   15:aload_1         
	//*   6   16:getfield        #43  <Field SessionEventMetadata SessionEvent.sessionEventMetadata>
	//*   7   19:getfield        #49  <Field String SessionEventMetadata.betaDeviceToken>
	//*   8   22:ifnonnull       30
			flag = true;
	//    9   25:iconst_1        
	//   10   26:istore_2        
		else
	//*  11   27:goto            32
			flag = false;
	//   12   30:iconst_0        
	//   13   31:istore_2        
		boolean flag1;
		if(Math.abs(sessionevent.sessionEventMetadata.installationId.hashCode() % samplingRate) != 0)
	//*  14   32:aload_1         
	//*  15   33:getfield        #43  <Field SessionEventMetadata SessionEvent.sessionEventMetadata>
	//*  16   36:getfield        #52  <Field String SessionEventMetadata.installationId>
	//*  17   39:invokevirtual   #58  <Method int String.hashCode()>
	//*  18   42:aload_0         
	//*  19   43:getfield        #25  <Field int samplingRate>
	//*  20   46:irem            
	//*  21   47:invokestatic    #64  <Method int Math.abs(int)>
	//*  22   50:ifeq            58
			flag1 = true;
	//   23   53:iconst_1        
	//   24   54:istore_3        
		else
	//*  25   55:goto            60
			flag1 = false;
	//   26   58:iconst_0        
	//   27   59:istore_3        
		return flag && flag1;
	//   28   60:iload_2         
	//   29   61:ifeq            70
	//   30   64:iload_3         
	//   31   65:ifeq            70
	//   32   68:iconst_1        
	//   33   69:ireturn         
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

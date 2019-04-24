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
		boolean flag2 = EVENTS_TYPE_TO_SAMPLE.contains(((Object) (sessionevent.type)));
	//    0    0:getstatic       #20  <Field Set EVENTS_TYPE_TO_SAMPLE>
	//    1    3:aload_1         
	//    2    4:getfield        #33  <Field SessionEvent$Type SessionEvent.type>
	//    3    7:invokeinterface #39  <Method boolean Set.contains(Object)>
	//    4   12:istore          4
		boolean flag3 = false;
	//    5   14:iconst_0        
	//    6   15:istore          5
		boolean flag;
		if(flag2 && sessionevent.sessionEventMetadata.betaDeviceToken == null)
	//*   7   17:iload           4
	//*   8   19:ifeq            37
	//*   9   22:aload_1         
	//*  10   23:getfield        #43  <Field SessionEventMetadata SessionEvent.sessionEventMetadata>
	//*  11   26:getfield        #49  <Field String SessionEventMetadata.betaDeviceToken>
	//*  12   29:ifnonnull       37
			flag = true;
	//   13   32:iconst_1        
	//   14   33:istore_2        
		else
	//*  15   34:goto            39
			flag = false;
	//   16   37:iconst_0        
	//   17   38:istore_2        
		boolean flag1;
		if(Math.abs(sessionevent.sessionEventMetadata.installationId.hashCode() % samplingRate) != 0)
	//*  18   39:aload_1         
	//*  19   40:getfield        #43  <Field SessionEventMetadata SessionEvent.sessionEventMetadata>
	//*  20   43:getfield        #52  <Field String SessionEventMetadata.installationId>
	//*  21   46:invokevirtual   #58  <Method int String.hashCode()>
	//*  22   49:aload_0         
	//*  23   50:getfield        #25  <Field int samplingRate>
	//*  24   53:irem            
	//*  25   54:invokestatic    #64  <Method int Math.abs(int)>
	//*  26   57:ifeq            65
			flag1 = true;
	//   27   60:iconst_1        
	//   28   61:istore_3        
		else
	//*  29   62:goto            67
			flag1 = false;
	//   30   65:iconst_0        
	//   31   66:istore_3        
		flag2 = flag3;
	//   32   67:iload           5
	//   33   69:istore          4
		if(flag)
	//*  34   71:iload_2         
	//*  35   72:ifeq            86
		{
			flag2 = flag3;
	//   36   75:iload           5
	//   37   77:istore          4
			if(flag1)
	//*  38   79:iload_3         
	//*  39   80:ifeq            86
				flag2 = true;
	//   40   83:iconst_1        
	//   41   84:istore          4
		}
		return flag2;
	//   42   86:iload           4
	//   43   88:ireturn         
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

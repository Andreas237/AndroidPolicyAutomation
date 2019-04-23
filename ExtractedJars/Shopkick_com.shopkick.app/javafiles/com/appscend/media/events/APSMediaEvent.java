// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appscend.media.events;

import android.os.*;
import com.appscend.media.APSMediaPlayer;
import com.appscend.media.APSMediaTrackableObject;
import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package com.appscend.media.events:
//			APSMediaEventStateListener, APSMediaEventTimeoutListener

public abstract class APSMediaEvent extends APSMediaTrackableObject
	implements Parcelable
{
	public static final class APSMediaEventState extends Enum
	{

		public static APSMediaEventState valueOf(String s)
		{
			return (APSMediaEventState)Enum.valueOf(com/appscend/media/events/APSMediaEvent$APSMediaEventState, s);
		//    0    0:ldc1            #2   <Class APSMediaEvent$APSMediaEventState>
		//    1    2:aload_0         
		//    2    3:invokestatic    #51  <Method Enum Enum.valueOf(Class, String)>
		//    3    6:checkcast       #2   <Class APSMediaEvent$APSMediaEventState>
		//    4    9:areturn         
		}

		public static APSMediaEventState[] values()
		{
			return (APSMediaEventState[])((APSMediaEventState []) ($VALUES)).clone();
		//    0    0:getstatic       #43  <Field APSMediaEvent$APSMediaEventState[] $VALUES>
		//    1    3:invokevirtual   #58  <Method Object _5B_Lcom.appscend.media.events.APSMediaEvent$APSMediaEventState_3B_.clone()>
		//    2    6:checkcast       #54  <Class APSMediaEvent$APSMediaEventState[]>
		//    3    9:areturn         
		}

		private static final APSMediaEventState $VALUES[];
		public static final APSMediaEventState APSMediaEventStateFailed;
		public static final APSMediaEventState APSMediaEventStateFinished;
		public static final APSMediaEventState APSMediaEventStatePreloaded;
		public static final APSMediaEventState APSMediaEventStatePreloading;
		public static final APSMediaEventState APSMediaEventStateTriggered;
		public static final APSMediaEventState APSMediaEventStateUnloaded;

		static 
		{
			APSMediaEventStateUnloaded = new APSMediaEventState("APSMediaEventStateUnloaded", 0);
		//    0    0:new             #2   <Class APSMediaEvent$APSMediaEventState>
		//    1    3:dup             
		//    2    4:ldc1            #20  <String "APSMediaEventStateUnloaded">
		//    3    6:iconst_0        
		//    4    7:invokespecial   #24  <Method void APSMediaEvent$APSMediaEventState(String, int)>
		//    5   10:putstatic       #26  <Field APSMediaEvent$APSMediaEventState APSMediaEventStateUnloaded>
			APSMediaEventStatePreloading = new APSMediaEventState("APSMediaEventStatePreloading", 1);
		//    6   13:new             #2   <Class APSMediaEvent$APSMediaEventState>
		//    7   16:dup             
		//    8   17:ldc1            #27  <String "APSMediaEventStatePreloading">
		//    9   19:iconst_1        
		//   10   20:invokespecial   #24  <Method void APSMediaEvent$APSMediaEventState(String, int)>
		//   11   23:putstatic       #29  <Field APSMediaEvent$APSMediaEventState APSMediaEventStatePreloading>
			APSMediaEventStatePreloaded = new APSMediaEventState("APSMediaEventStatePreloaded", 2);
		//   12   26:new             #2   <Class APSMediaEvent$APSMediaEventState>
		//   13   29:dup             
		//   14   30:ldc1            #30  <String "APSMediaEventStatePreloaded">
		//   15   32:iconst_2        
		//   16   33:invokespecial   #24  <Method void APSMediaEvent$APSMediaEventState(String, int)>
		//   17   36:putstatic       #32  <Field APSMediaEvent$APSMediaEventState APSMediaEventStatePreloaded>
			APSMediaEventStateFailed = new APSMediaEventState("APSMediaEventStateFailed", 3);
		//   18   39:new             #2   <Class APSMediaEvent$APSMediaEventState>
		//   19   42:dup             
		//   20   43:ldc1            #33  <String "APSMediaEventStateFailed">
		//   21   45:iconst_3        
		//   22   46:invokespecial   #24  <Method void APSMediaEvent$APSMediaEventState(String, int)>
		//   23   49:putstatic       #35  <Field APSMediaEvent$APSMediaEventState APSMediaEventStateFailed>
			APSMediaEventStateTriggered = new APSMediaEventState("APSMediaEventStateTriggered", 4);
		//   24   52:new             #2   <Class APSMediaEvent$APSMediaEventState>
		//   25   55:dup             
		//   26   56:ldc1            #36  <String "APSMediaEventStateTriggered">
		//   27   58:iconst_4        
		//   28   59:invokespecial   #24  <Method void APSMediaEvent$APSMediaEventState(String, int)>
		//   29   62:putstatic       #38  <Field APSMediaEvent$APSMediaEventState APSMediaEventStateTriggered>
			APSMediaEventStateFinished = new APSMediaEventState("APSMediaEventStateFinished", 5);
		//   30   65:new             #2   <Class APSMediaEvent$APSMediaEventState>
		//   31   68:dup             
		//   32   69:ldc1            #39  <String "APSMediaEventStateFinished">
		//   33   71:iconst_5        
		//   34   72:invokespecial   #24  <Method void APSMediaEvent$APSMediaEventState(String, int)>
		//   35   75:putstatic       #41  <Field APSMediaEvent$APSMediaEventState APSMediaEventStateFinished>
			$VALUES = (new APSMediaEventState[] {
				APSMediaEventStateUnloaded, APSMediaEventStatePreloading, APSMediaEventStatePreloaded, APSMediaEventStateFailed, APSMediaEventStateTriggered, APSMediaEventStateFinished
			});
		//   36   78:bipush          6
		//   37   80:anewarray       APSMediaEventState[]
		//   38   83:dup             
		//   39   84:iconst_0        
		//   40   85:getstatic       #26  <Field APSMediaEvent$APSMediaEventState APSMediaEventStateUnloaded>
		//   41   88:aastore         
		//   42   89:dup             
		//   43   90:iconst_1        
		//   44   91:getstatic       #29  <Field APSMediaEvent$APSMediaEventState APSMediaEventStatePreloading>
		//   45   94:aastore         
		//   46   95:dup             
		//   47   96:iconst_2        
		//   48   97:getstatic       #32  <Field APSMediaEvent$APSMediaEventState APSMediaEventStatePreloaded>
		//   49  100:aastore         
		//   50  101:dup             
		//   51  102:iconst_3        
		//   52  103:getstatic       #35  <Field APSMediaEvent$APSMediaEventState APSMediaEventStateFailed>
		//   53  106:aastore         
		//   54  107:dup             
		//   55  108:iconst_4        
		//   56  109:getstatic       #38  <Field APSMediaEvent$APSMediaEventState APSMediaEventStateTriggered>
		//   57  112:aastore         
		//   58  113:dup             
		//   59  114:iconst_5        
		//   60  115:getstatic       #41  <Field APSMediaEvent$APSMediaEventState APSMediaEventStateFinished>
		//   61  118:aastore         
		//   62  119:putstatic       #43  <Field APSMediaEvent$APSMediaEventState[] $VALUES>
		//*  63  122:return          
		}

		private APSMediaEventState(String s, int i)
		{
			super(s, i);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #45  <Method void Enum(String, int)>
		//    4    6:return          
		}
	}


	public APSMediaEvent()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #40  <Method void APSMediaTrackableObject()>
		stateListeners = new ArrayList();
	//    2    4:aload_0         
	//    3    5:new             #42  <Class ArrayList>
	//    4    8:dup             
	//    5    9:invokespecial   #43  <Method void ArrayList()>
	//    6   12:putfield        #45  <Field ArrayList stateListeners>
		timeoutListeners = new ArrayList();
	//    7   15:aload_0         
	//    8   16:new             #42  <Class ArrayList>
	//    9   19:dup             
	//   10   20:invokespecial   #43  <Method void ArrayList()>
	//   11   23:putfield        #47  <Field ArrayList timeoutListeners>
		mHandler = new Handler(APSMediaPlayer.getInstance().handlerThread.getLooper());
	//   12   26:aload_0         
	//   13   27:new             #49  <Class Handler>
	//   14   30:dup             
	//   15   31:invokestatic    #55  <Method APSMediaPlayer APSMediaPlayer.getInstance()>
	//   16   34:getfield        #59  <Field HandlerThread APSMediaPlayer.handlerThread>
	//   17   37:invokevirtual   #65  <Method android.os.Looper HandlerThread.getLooper()>
	//   18   40:invokespecial   #68  <Method void Handler(android.os.Looper)>
	//   19   43:putfield        #70  <Field Handler mHandler>
		dynamicPosition = false;
	//   20   46:aload_0         
	//   21   47:iconst_0        
	//   22   48:putfield        #72  <Field boolean dynamicPosition>
	//   23   51:aload_0         
	//   24   52:new             #8   <Class APSMediaEvent$1>
	//   25   55:dup             
	//   26   56:aload_0         
	//   27   57:invokespecial   #75  <Method void APSMediaEvent$1(APSMediaEvent)>
	//   28   60:putfield        #77  <Field Runnable mTimeoutDetectionTask>
		timeout = 10L;
	//   29   63:aload_0         
	//   30   64:ldc2w           #78  <Long 10L>
	//   31   67:putfield        #81  <Field long timeout>
		_endPoint = -1;
	//   32   70:aload_0         
	//   33   71:iconst_m1       
	//   34   72:putfield        #83  <Field int _endPoint>
		preloadPoint = -1L;
	//   35   75:aload_0         
	//   36   76:ldc2w           #84  <Long -1L>
	//   37   79:putfield        #87  <Field long preloadPoint>
		repeatAfter = -1L;
	//   38   82:aload_0         
	//   39   83:ldc2w           #84  <Long -1L>
	//   40   86:putfield        #89  <Field long repeatAfter>
		state = APSMediaEventState.APSMediaEventStateUnloaded;
	//   41   89:aload_0         
	//   42   90:getstatic       #92  <Field APSMediaEvent$APSMediaEventState APSMediaEvent$APSMediaEventState.APSMediaEventStateUnloaded>
	//   43   93:putfield        #94  <Field APSMediaEvent$APSMediaEventState state>
	//   44   96:return          
	}

	protected APSMediaEvent(Parcel parcel)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #40  <Method void APSMediaTrackableObject()>
		stateListeners = new ArrayList();
	//    2    4:aload_0         
	//    3    5:new             #42  <Class ArrayList>
	//    4    8:dup             
	//    5    9:invokespecial   #43  <Method void ArrayList()>
	//    6   12:putfield        #45  <Field ArrayList stateListeners>
		timeoutListeners = new ArrayList();
	//    7   15:aload_0         
	//    8   16:new             #42  <Class ArrayList>
	//    9   19:dup             
	//   10   20:invokespecial   #43  <Method void ArrayList()>
	//   11   23:putfield        #47  <Field ArrayList timeoutListeners>
		mHandler = new Handler(APSMediaPlayer.getInstance().handlerThread.getLooper());
	//   12   26:aload_0         
	//   13   27:new             #49  <Class Handler>
	//   14   30:dup             
	//   15   31:invokestatic    #55  <Method APSMediaPlayer APSMediaPlayer.getInstance()>
	//   16   34:getfield        #59  <Field HandlerThread APSMediaPlayer.handlerThread>
	//   17   37:invokevirtual   #65  <Method android.os.Looper HandlerThread.getLooper()>
	//   18   40:invokespecial   #68  <Method void Handler(android.os.Looper)>
	//   19   43:putfield        #70  <Field Handler mHandler>
		boolean flag1 = false;
	//   20   46:iconst_0        
	//   21   47:istore          4
		dynamicPosition = false;
	//   22   49:aload_0         
	//   23   50:iconst_0        
	//   24   51:putfield        #72  <Field boolean dynamicPosition>
	//   25   54:aload_0         
	//   26   55:new             #8   <Class APSMediaEvent$1>
	//   27   58:dup             
	//   28   59:aload_0         
	//   29   60:invokespecial   #75  <Method void APSMediaEvent$1(APSMediaEvent)>
	//   30   63:putfield        #77  <Field Runnable mTimeoutDetectionTask>
		preloadInterval = parcel.readLong();
	//   31   66:aload_0         
	//   32   67:aload_1         
	//   33   68:invokevirtual   #102 <Method long Parcel.readLong()>
	//   34   71:putfield        #104 <Field long preloadInterval>
		preloadPoint = parcel.readLong();
	//   35   74:aload_0         
	//   36   75:aload_1         
	//   37   76:invokevirtual   #102 <Method long Parcel.readLong()>
	//   38   79:putfield        #87  <Field long preloadPoint>
		repeatAfter = parcel.readLong();
	//   39   82:aload_0         
	//   40   83:aload_1         
	//   41   84:invokevirtual   #102 <Method long Parcel.readLong()>
	//   42   87:putfield        #89  <Field long repeatAfter>
		int i = parcel.readInt();
	//   43   90:aload_1         
	//   44   91:invokevirtual   #108 <Method int Parcel.readInt()>
	//   45   94:istore_2        
		APSMediaEventState apsmediaeventstate;
		if(i == -1)
	//*  46   95:iload_2         
	//*  47   96:iconst_m1       
	//*  48   97:icmpne          106
			apsmediaeventstate = null;
	//   49  100:aconst_null     
	//   50  101:astore          5
		else
	//*  51  103:goto            113
			apsmediaeventstate = APSMediaEventState.values()[i];
	//   52  106:invokestatic    #112 <Method APSMediaEvent$APSMediaEventState[] APSMediaEvent$APSMediaEventState.values()>
	//   53  109:iload_2         
	//   54  110:aaload          
	//   55  111:astore          5
		state = apsmediaeventstate;
	//   56  113:aload_0         
	//   57  114:aload           5
	//   58  116:putfield        #94  <Field APSMediaEvent$APSMediaEventState state>
		stateListeners = new ArrayList();
	//   59  119:aload_0         
	//   60  120:new             #42  <Class ArrayList>
	//   61  123:dup             
	//   62  124:invokespecial   #43  <Method void ArrayList()>
	//   63  127:putfield        #45  <Field ArrayList stateListeners>
		parcel.readList(((java.util.List) (stateListeners)), ((Class) (com/appscend/media/events/APSMediaEventStateListener)).getClassLoader());
	//   64  130:aload_1         
	//   65  131:aload_0         
	//   66  132:getfield        #45  <Field ArrayList stateListeners>
	//   67  135:ldc1            #114 <Class APSMediaEventStateListener>
	//   68  137:invokevirtual   #120 <Method ClassLoader Class.getClassLoader()>
	//   69  140:invokevirtual   #124 <Method void Parcel.readList(java.util.List, ClassLoader)>
		timeoutListeners = new ArrayList();
	//   70  143:aload_0         
	//   71  144:new             #42  <Class ArrayList>
	//   72  147:dup             
	//   73  148:invokespecial   #43  <Method void ArrayList()>
	//   74  151:putfield        #47  <Field ArrayList timeoutListeners>
		parcel.readList(((java.util.List) (timeoutListeners)), ((Class) (com/appscend/media/events/APSMediaEventTimeoutListener)).getClassLoader());
	//   75  154:aload_1         
	//   76  155:aload_0         
	//   77  156:getfield        #47  <Field ArrayList timeoutListeners>
	//   78  159:ldc1            #126 <Class APSMediaEventTimeoutListener>
	//   79  161:invokevirtual   #120 <Method ClassLoader Class.getClassLoader()>
	//   80  164:invokevirtual   #124 <Method void Parcel.readList(java.util.List, ClassLoader)>
		timeout = parcel.readLong();
	//   81  167:aload_0         
	//   82  168:aload_1         
	//   83  169:invokevirtual   #102 <Method long Parcel.readLong()>
	//   84  172:putfield        #81  <Field long timeout>
		_startPoint = parcel.readInt();
	//   85  175:aload_0         
	//   86  176:aload_1         
	//   87  177:invokevirtual   #108 <Method int Parcel.readInt()>
	//   88  180:putfield        #128 <Field int _startPoint>
		_endPoint = parcel.readInt();
	//   89  183:aload_0         
	//   90  184:aload_1         
	//   91  185:invokevirtual   #108 <Method int Parcel.readInt()>
	//   92  188:putfield        #83  <Field int _endPoint>
		boolean flag;
		if(parcel.readByte() != 0)
	//*  93  191:aload_1         
	//*  94  192:invokevirtual   #132 <Method byte Parcel.readByte()>
	//*  95  195:ifeq            203
			flag = true;
	//   96  198:iconst_1        
	//   97  199:istore_3        
		else
	//*  98  200:goto            205
			flag = false;
	//   99  203:iconst_0        
	//  100  204:istore_3        
		_relativeStartPoint = flag;
	//  101  205:aload_0         
	//  102  206:iload_3         
	//  103  207:putfield        #134 <Field boolean _relativeStartPoint>
		if(parcel.readByte() != 0)
	//* 104  210:aload_1         
	//* 105  211:invokevirtual   #132 <Method byte Parcel.readByte()>
	//* 106  214:ifeq            222
			flag = true;
	//  107  217:iconst_1        
	//  108  218:istore_3        
		else
	//* 109  219:goto            224
			flag = false;
	//  110  222:iconst_0        
	//  111  223:istore_3        
		_relativeEndPoint = flag;
	//  112  224:aload_0         
	//  113  225:iload_3         
	//  114  226:putfield        #136 <Field boolean _relativeEndPoint>
		if(parcel.readByte() != 0)
	//* 115  229:aload_1         
	//* 116  230:invokevirtual   #132 <Method byte Parcel.readByte()>
	//* 117  233:ifeq            241
			flag = true;
	//  118  236:iconst_1        
	//  119  237:istore_3        
		else
	//* 120  238:goto            243
			flag = false;
	//  121  241:iconst_0        
	//  122  242:istore_3        
		_absoluteDuration = flag;
	//  123  243:aload_0         
	//  124  244:iload_3         
	//  125  245:putfield        #138 <Field boolean _absoluteDuration>
		if(parcel.readByte() != 0)
	//* 126  248:aload_1         
	//* 127  249:invokevirtual   #132 <Method byte Parcel.readByte()>
	//* 128  252:ifeq            260
			flag = true;
	//  129  255:iconst_1        
	//  130  256:istore_3        
		else
	//* 131  257:goto            262
			flag = false;
	//  132  260:iconst_0        
	//  133  261:istore_3        
		loaded = flag;
	//  134  262:aload_0         
	//  135  263:iload_3         
	//  136  264:putfield        #140 <Field boolean loaded>
		flag = flag1;
	//  137  267:iload           4
	//  138  269:istore_3        
		if(parcel.readByte() != 0)
	//* 139  270:aload_1         
	//* 140  271:invokevirtual   #132 <Method byte Parcel.readByte()>
	//* 141  274:ifeq            279
			flag = true;
	//  142  277:iconst_1        
	//  143  278:istore_3        
		dynamicPosition = flag;
	//  144  279:aload_0         
	//  145  280:iload_3         
	//  146  281:putfield        #72  <Field boolean dynamicPosition>
	//  147  284:return          
	}

	private void notifyEventStateChange()
	{
		for(Iterator iterator = stateListeners.iterator(); iterator.hasNext(); ((APSMediaEventStateListener)iterator.next()).onEventStateChanged(this, state));
	//    0    0:aload_0         
	//    1    1:getfield        #45  <Field ArrayList stateListeners>
	//    2    4:invokevirtual   #151 <Method Iterator ArrayList.iterator()>
	//    3    7:astore_1        
	//    4    8:aload_1         
	//    5    9:invokeinterface #157 <Method boolean Iterator.hasNext()>
	//    6   14:ifeq            39
	//    7   17:aload_1         
	//    8   18:invokeinterface #161 <Method Object Iterator.next()>
	//    9   23:checkcast       #114 <Class APSMediaEventStateListener>
	//   10   26:aload_0         
	//   11   27:aload_0         
	//   12   28:getfield        #94  <Field APSMediaEvent$APSMediaEventState state>
	//   13   31:invokeinterface #165 <Method void APSMediaEventStateListener.onEventStateChanged(APSMediaEvent, APSMediaEvent$APSMediaEventState)>
	//*  14   36:goto            8
	//   15   39:return          
	}

	private void notifyEventTimeout()
	{
		for(Iterator iterator = timeoutListeners.iterator(); iterator.hasNext(); ((APSMediaEventTimeoutListener)iterator.next()).onEventTimeout(this));
	//    0    0:aload_0         
	//    1    1:getfield        #47  <Field ArrayList timeoutListeners>
	//    2    4:invokevirtual   #151 <Method Iterator ArrayList.iterator()>
	//    3    7:astore_1        
	//    4    8:aload_1         
	//    5    9:invokeinterface #157 <Method boolean Iterator.hasNext()>
	//    6   14:ifeq            35
	//    7   17:aload_1         
	//    8   18:invokeinterface #161 <Method Object Iterator.next()>
	//    9   23:checkcast       #126 <Class APSMediaEventTimeoutListener>
	//   10   26:aload_0         
	//   11   27:invokeinterface #168 <Method void APSMediaEventTimeoutListener.onEventTimeout(APSMediaEvent)>
	//*  12   32:goto            8
	//   13   35:return          
	}

	public void adjustForAbsoluteDuration()
	{
		if(_absoluteDuration && !_relativeEndPoint && !_relativeStartPoint)
	//*   0    0:aload_0         
	//*   1    1:getfield        #138 <Field boolean _absoluteDuration>
	//*   2    4:ifeq            39
	//*   3    7:aload_0         
	//*   4    8:getfield        #136 <Field boolean _relativeEndPoint>
	//*   5   11:ifne            39
	//*   6   14:aload_0         
	//*   7   15:getfield        #134 <Field boolean _relativeStartPoint>
	//*   8   18:ifne            39
		{
			_absoluteDuration = false;
	//    9   21:aload_0         
	//   10   22:iconst_0        
	//   11   23:putfield        #138 <Field boolean _absoluteDuration>
			_endPoint = _endPoint + _startPoint;
	//   12   26:aload_0         
	//   13   27:aload_0         
	//   14   28:getfield        #83  <Field int _endPoint>
	//   15   31:aload_0         
	//   16   32:getfield        #128 <Field int _startPoint>
	//   17   35:iadd            
	//   18   36:putfield        #83  <Field int _endPoint>
		}
	//   19   39:return          
	}

	public void adjustRelativeToDuration(int i)
	{
		if(_relativeStartPoint)
	//*   0    0:aload_0         
	//*   1    1:getfield        #134 <Field boolean _relativeStartPoint>
	//*   2    4:ifeq            32
		{
			_relativeStartPoint = false;
	//    3    7:aload_0         
	//    4    8:iconst_0        
	//    5    9:putfield        #134 <Field boolean _relativeStartPoint>
			_startPoint = (int)Math.floor(((double)_startPoint * (double)i) / 100D);
	//    6   12:aload_0         
	//    7   13:aload_0         
	//    8   14:getfield        #128 <Field int _startPoint>
	//    9   17:i2d             
	//   10   18:iload_1         
	//   11   19:i2d             
	//   12   20:dmul            
	//   13   21:ldc2w           #172 <Double 100D>
	//   14   24:ddiv            
	//   15   25:invokestatic    #179 <Method double Math.floor(double)>
	//   16   28:d2i             
	//   17   29:putfield        #128 <Field int _startPoint>
		}
		if(_relativeEndPoint)
	//*  18   32:aload_0         
	//*  19   33:getfield        #136 <Field boolean _relativeEndPoint>
	//*  20   36:ifeq            64
		{
			_relativeEndPoint = false;
	//   21   39:aload_0         
	//   22   40:iconst_0        
	//   23   41:putfield        #136 <Field boolean _relativeEndPoint>
			_endPoint = (int)Math.floor(((double)_endPoint * (double)i) / 100D);
	//   24   44:aload_0         
	//   25   45:aload_0         
	//   26   46:getfield        #83  <Field int _endPoint>
	//   27   49:i2d             
	//   28   50:iload_1         
	//   29   51:i2d             
	//   30   52:dmul            
	//   31   53:ldc2w           #172 <Double 100D>
	//   32   56:ddiv            
	//   33   57:invokestatic    #179 <Method double Math.floor(double)>
	//   34   60:d2i             
	//   35   61:putfield        #83  <Field int _endPoint>
		}
		if(_absoluteDuration)
	//*  36   64:aload_0         
	//*  37   65:getfield        #138 <Field boolean _absoluteDuration>
	//*  38   68:ifeq            89
		{
			_absoluteDuration = false;
	//   39   71:aload_0         
	//   40   72:iconst_0        
	//   41   73:putfield        #138 <Field boolean _absoluteDuration>
			_endPoint = _endPoint + _startPoint;
	//   42   76:aload_0         
	//   43   77:aload_0         
	//   44   78:getfield        #83  <Field int _endPoint>
	//   45   81:aload_0         
	//   46   82:getfield        #128 <Field int _startPoint>
	//   47   85:iadd            
	//   48   86:putfield        #83  <Field int _endPoint>
		}
	//   49   89:return          
	}

	public int describeContents()
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public int endPoint()
	{
		return _endPoint;
	//    0    0:aload_0         
	//    1    1:getfield        #83  <Field int _endPoint>
	//    2    4:ireturn         
	}

	public APSMediaEventState getState()
	{
		return state;
	//    0    0:aload_0         
	//    1    1:getfield        #94  <Field APSMediaEvent$APSMediaEventState state>
	//    2    4:areturn         
	}

	public void incrementStartAndEndPointsWithInterval(float f)
	{
		_startPoint = (int)((float)_startPoint + f);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #128 <Field int _startPoint>
	//    3    5:i2f             
	//    4    6:fload_1         
	//    5    7:fadd            
	//    6    8:f2i             
	//    7    9:putfield        #128 <Field int _startPoint>
		_endPoint = (int)((float)_endPoint + f);
	//    8   12:aload_0         
	//    9   13:aload_0         
	//   10   14:getfield        #83  <Field int _endPoint>
	//   11   17:i2f             
	//   12   18:fload_1         
	//   13   19:fadd            
	//   14   20:f2i             
	//   15   21:putfield        #83  <Field int _endPoint>
	//   16   24:return          
	}

	public boolean needsToBeAdjustedRelativeToDuration()
	{
		return _relativeStartPoint || _relativeEndPoint || _absoluteDuration;
	//    0    0:aload_0         
	//    1    1:getfield        #134 <Field boolean _relativeStartPoint>
	//    2    4:ifne            26
	//    3    7:aload_0         
	//    4    8:getfield        #136 <Field boolean _relativeEndPoint>
	//    5   11:ifne            26
	//    6   14:aload_0         
	//    7   15:getfield        #138 <Field boolean _absoluteDuration>
	//    8   18:ifeq            24
	//    9   21:goto            26
	//   10   24:iconst_0        
	//   11   25:ireturn         
	//   12   26:iconst_1        
	//   13   27:ireturn         
	}

	public abstract void onPreload();

	public abstract void onTrigger();

	public abstract void onUnload();

	public abstract void onUpdate();

	public void preload()
	{
		state = APSMediaEventState.APSMediaEventStatePreloading;
	//    0    0:aload_0         
	//    1    1:getstatic       #194 <Field APSMediaEvent$APSMediaEventState APSMediaEvent$APSMediaEventState.APSMediaEventStatePreloading>
	//    2    4:putfield        #94  <Field APSMediaEvent$APSMediaEventState state>
		APSMediaPlayer apsmediaplayer = APSMediaPlayer.getInstance();
	//    3    7:invokestatic    #55  <Method APSMediaPlayer APSMediaPlayer.getInstance()>
	//    4   10:astore_1        
		StringBuilder stringbuilder = new StringBuilder();
	//    5   11:new             #196 <Class StringBuilder>
	//    6   14:dup             
	//    7   15:invokespecial   #197 <Method void StringBuilder()>
	//    8   18:astore_2        
		stringbuilder.append("VeePlay_EVENTS: preloading event scheduled for: ");
	//    9   19:aload_2         
	//   10   20:ldc1            #199 <String "VeePlay_EVENTS: preloading event scheduled for: ">
	//   11   22:invokevirtual   #203 <Method StringBuilder StringBuilder.append(String)>
	//   12   25:pop             
		stringbuilder.append(startPoint());
	//   13   26:aload_2         
	//   14   27:aload_0         
	//   15   28:invokevirtual   #206 <Method int startPoint()>
	//   16   31:invokevirtual   #209 <Method StringBuilder StringBuilder.append(int)>
	//   17   34:pop             
		stringbuilder.append(" with preload interval of ");
	//   18   35:aload_2         
	//   19   36:ldc1            #211 <String " with preload interval of ">
	//   20   38:invokevirtual   #203 <Method StringBuilder StringBuilder.append(String)>
	//   21   41:pop             
		stringbuilder.append(preloadInterval);
	//   22   42:aload_2         
	//   23   43:aload_0         
	//   24   44:getfield        #104 <Field long preloadInterval>
	//   25   47:invokevirtual   #214 <Method StringBuilder StringBuilder.append(long)>
	//   26   50:pop             
		apsmediaplayer.log(stringbuilder.toString());
	//   27   51:aload_1         
	//   28   52:aload_2         
	//   29   53:invokevirtual   #218 <Method String StringBuilder.toString()>
	//   30   56:invokevirtual   #222 <Method void APSMediaPlayer.log(String)>
		onPreload();
	//   31   59:aload_0         
	//   32   60:invokevirtual   #224 <Method void onPreload()>
		mHandler.postDelayed(mTimeoutDetectionTask, timeout * 1000L);
	//   33   63:aload_0         
	//   34   64:getfield        #70  <Field Handler mHandler>
	//   35   67:aload_0         
	//   36   68:getfield        #77  <Field Runnable mTimeoutDetectionTask>
	//   37   71:aload_0         
	//   38   72:getfield        #81  <Field long timeout>
	//   39   75:ldc2w           #225 <Long 1000L>
	//   40   78:lmul            
	//   41   79:invokevirtual   #230 <Method boolean Handler.postDelayed(Runnable, long)>
	//   42   82:pop             
	//   43   83:return          
	}

	public void registerEventStateListener(APSMediaEventStateListener apsmediaeventstatelistener)
	{
		if(apsmediaeventstatelistener != null && !stateListeners.contains(((Object) (apsmediaeventstatelistener))))
	//*   0    0:aload_1         
	//*   1    1:ifnull          24
	//*   2    4:aload_0         
	//*   3    5:getfield        #45  <Field ArrayList stateListeners>
	//*   4    8:aload_1         
	//*   5    9:invokevirtual   #236 <Method boolean ArrayList.contains(Object)>
	//*   6   12:ifne            24
			stateListeners.add(((Object) (apsmediaeventstatelistener)));
	//    7   15:aload_0         
	//    8   16:getfield        #45  <Field ArrayList stateListeners>
	//    9   19:aload_1         
	//   10   20:invokevirtual   #239 <Method boolean ArrayList.add(Object)>
	//   11   23:pop             
	//   12   24:return          
	}

	public void registerTimeoutListener(APSMediaEventTimeoutListener apsmediaeventtimeoutlistener)
	{
		if(apsmediaeventtimeoutlistener != null && !timeoutListeners.contains(((Object) (apsmediaeventtimeoutlistener))))
	//*   0    0:aload_1         
	//*   1    1:ifnull          24
	//*   2    4:aload_0         
	//*   3    5:getfield        #47  <Field ArrayList timeoutListeners>
	//*   4    8:aload_1         
	//*   5    9:invokevirtual   #236 <Method boolean ArrayList.contains(Object)>
	//*   6   12:ifne            24
			timeoutListeners.add(((Object) (apsmediaeventtimeoutlistener)));
	//    7   15:aload_0         
	//    8   16:getfield        #47  <Field ArrayList timeoutListeners>
	//    9   19:aload_1         
	//   10   20:invokevirtual   #239 <Method boolean ArrayList.add(Object)>
	//   11   23:pop             
	//   12   24:return          
	}

	public void setEndPoint(String s)
	{
		if(s.contains("%"))
	//*   0    0:aload_1         
	//*   1    1:ldc1            #244 <String "%">
	//*   2    3:invokevirtual   #249 <Method boolean String.contains(CharSequence)>
	//*   3    6:ifeq            35
		{
			_endPoint = Integer.parseInt(s.replace("%", ""));
	//    4    9:aload_0         
	//    5   10:aload_1         
	//    6   11:ldc1            #244 <String "%">
	//    7   13:ldc1            #251 <String "">
	//    8   15:invokevirtual   #255 <Method String String.replace(CharSequence, CharSequence)>
	//    9   18:invokestatic    #261 <Method int Integer.parseInt(String)>
	//   10   21:putfield        #83  <Field int _endPoint>
			_relativeEndPoint = true;
	//   11   24:aload_0         
	//   12   25:iconst_1        
	//   13   26:putfield        #136 <Field boolean _relativeEndPoint>
			_absoluteDuration = false;
	//   14   29:aload_0         
	//   15   30:iconst_0        
	//   16   31:putfield        #138 <Field boolean _absoluteDuration>
			return;
	//   17   34:return          
		}
		if(s.contains("+"))
	//*  18   35:aload_1         
	//*  19   36:ldc2            #263 <String "+">
	//*  20   39:invokevirtual   #249 <Method boolean String.contains(CharSequence)>
	//*  21   42:ifeq            72
		{
			_endPoint = Integer.parseInt(s.replace("+", ""));
	//   22   45:aload_0         
	//   23   46:aload_1         
	//   24   47:ldc2            #263 <String "+">
	//   25   50:ldc1            #251 <String "">
	//   26   52:invokevirtual   #255 <Method String String.replace(CharSequence, CharSequence)>
	//   27   55:invokestatic    #261 <Method int Integer.parseInt(String)>
	//   28   58:putfield        #83  <Field int _endPoint>
			_relativeEndPoint = false;
	//   29   61:aload_0         
	//   30   62:iconst_0        
	//   31   63:putfield        #136 <Field boolean _relativeEndPoint>
			_absoluteDuration = true;
	//   32   66:aload_0         
	//   33   67:iconst_1        
	//   34   68:putfield        #138 <Field boolean _absoluteDuration>
			return;
	//   35   71:return          
		} else
		{
			_endPoint = Integer.parseInt(s);
	//   36   72:aload_0         
	//   37   73:aload_1         
	//   38   74:invokestatic    #261 <Method int Integer.parseInt(String)>
	//   39   77:putfield        #83  <Field int _endPoint>
			_relativeEndPoint = false;
	//   40   80:aload_0         
	//   41   81:iconst_0        
	//   42   82:putfield        #136 <Field boolean _relativeEndPoint>
			_absoluteDuration = false;
	//   43   85:aload_0         
	//   44   86:iconst_0        
	//   45   87:putfield        #138 <Field boolean _absoluteDuration>
			return;
	//   46   90:return          
		}
	}

	public void setStartPoint(String s)
	{
		if(s.contains("%"))
	//*   0    0:aload_1         
	//*   1    1:ldc1            #244 <String "%">
	//*   2    3:invokevirtual   #249 <Method boolean String.contains(CharSequence)>
	//*   3    6:ifeq            30
		{
			_startPoint = Integer.parseInt(s.replace("%", ""));
	//    4    9:aload_0         
	//    5   10:aload_1         
	//    6   11:ldc1            #244 <String "%">
	//    7   13:ldc1            #251 <String "">
	//    8   15:invokevirtual   #255 <Method String String.replace(CharSequence, CharSequence)>
	//    9   18:invokestatic    #261 <Method int Integer.parseInt(String)>
	//   10   21:putfield        #128 <Field int _startPoint>
			_relativeStartPoint = true;
	//   11   24:aload_0         
	//   12   25:iconst_1        
	//   13   26:putfield        #134 <Field boolean _relativeStartPoint>
			return;
	//   14   29:return          
		} else
		{
			_startPoint = Integer.parseInt(s);
	//   15   30:aload_0         
	//   16   31:aload_1         
	//   17   32:invokestatic    #261 <Method int Integer.parseInt(String)>
	//   18   35:putfield        #128 <Field int _startPoint>
			_relativeStartPoint = false;
	//   19   38:aload_0         
	//   20   39:iconst_0        
	//   21   40:putfield        #134 <Field boolean _relativeStartPoint>
			return;
	//   22   43:return          
		}
	}

	public int startPoint()
	{
		return _startPoint;
	//    0    0:aload_0         
	//    1    1:getfield        #128 <Field int _startPoint>
	//    2    4:ireturn         
	}

	public void trigger()
	{
		state = APSMediaEventState.APSMediaEventStateTriggered;
	//    0    0:aload_0         
	//    1    1:getstatic       #268 <Field APSMediaEvent$APSMediaEventState APSMediaEvent$APSMediaEventState.APSMediaEventStateTriggered>
	//    2    4:putfield        #94  <Field APSMediaEvent$APSMediaEventState state>
		APSMediaPlayer apsmediaplayer = APSMediaPlayer.getInstance();
	//    3    7:invokestatic    #55  <Method APSMediaPlayer APSMediaPlayer.getInstance()>
	//    4   10:astore_1        
		StringBuilder stringbuilder = new StringBuilder();
	//    5   11:new             #196 <Class StringBuilder>
	//    6   14:dup             
	//    7   15:invokespecial   #197 <Method void StringBuilder()>
	//    8   18:astore_2        
		stringbuilder.append("VeePlay_EVENTS: triggering event scheduled for: ");
	//    9   19:aload_2         
	//   10   20:ldc2            #270 <String "VeePlay_EVENTS: triggering event scheduled for: ">
	//   11   23:invokevirtual   #203 <Method StringBuilder StringBuilder.append(String)>
	//   12   26:pop             
		stringbuilder.append(startPoint());
	//   13   27:aload_2         
	//   14   28:aload_0         
	//   15   29:invokevirtual   #206 <Method int startPoint()>
	//   16   32:invokevirtual   #209 <Method StringBuilder StringBuilder.append(int)>
	//   17   35:pop             
		stringbuilder.append(" with preload interval of ");
	//   18   36:aload_2         
	//   19   37:ldc1            #211 <String " with preload interval of ">
	//   20   39:invokevirtual   #203 <Method StringBuilder StringBuilder.append(String)>
	//   21   42:pop             
		stringbuilder.append(preloadInterval);
	//   22   43:aload_2         
	//   23   44:aload_0         
	//   24   45:getfield        #104 <Field long preloadInterval>
	//   25   48:invokevirtual   #214 <Method StringBuilder StringBuilder.append(long)>
	//   26   51:pop             
		apsmediaplayer.log(stringbuilder.toString());
	//   27   52:aload_1         
	//   28   53:aload_2         
	//   29   54:invokevirtual   #218 <Method String StringBuilder.toString()>
	//   30   57:invokevirtual   #222 <Method void APSMediaPlayer.log(String)>
		onTrigger();
	//   31   60:aload_0         
	//   32   61:invokevirtual   #272 <Method void onTrigger()>
	//   33   64:return          
	}

	public void unload()
	{
		updateState(APSMediaEventState.APSMediaEventStateUnloaded);
	//    0    0:aload_0         
	//    1    1:getstatic       #92  <Field APSMediaEvent$APSMediaEventState APSMediaEvent$APSMediaEventState.APSMediaEventStateUnloaded>
	//    2    4:invokevirtual   #277 <Method void updateState(APSMediaEvent$APSMediaEventState)>
		onUnload();
	//    3    7:aload_0         
	//    4    8:invokevirtual   #279 <Method void onUnload()>
	//    5   11:return          
	}

	public void unregisterEventStateListener(APSMediaEventStateListener apsmediaeventstatelistener)
	{
		stateListeners.remove(((Object) (apsmediaeventstatelistener)));
	//    0    0:aload_0         
	//    1    1:getfield        #45  <Field ArrayList stateListeners>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #283 <Method boolean ArrayList.remove(Object)>
	//    4    8:pop             
	//    5    9:return          
	}

	public void unregisterEventTimeoutListener(APSMediaEventTimeoutListener apsmediaeventtimeoutlistener)
	{
		timeoutListeners.remove(((Object) (apsmediaeventtimeoutlistener)));
	//    0    0:aload_0         
	//    1    1:getfield        #47  <Field ArrayList timeoutListeners>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #283 <Method boolean ArrayList.remove(Object)>
	//    4    8:pop             
	//    5    9:return          
	}

	public void updateState(APSMediaEventState apsmediaeventstate)
	{
		state = apsmediaeventstate;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #94  <Field APSMediaEvent$APSMediaEventState state>
		notifyEventStateChange();
	//    3    5:aload_0         
	//    4    6:invokespecial   #286 <Method void notifyEventStateChange()>
	//    5    9:return          
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e1expr(TypeTransformer.java:496)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:713)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:698)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
	//    0    0:new             #290 <Class RuntimeException>
	//    1    3:dup             
	//    2    4:ldc2            #292 <String "d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e1expr(TypeTransformer.java:496)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:713)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:698)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n">
	//    3    7:invokespecial   #296 <Method void Runtime(String)>
	//    4   10:athrow          
	}

	protected boolean _absoluteDuration;
	protected int _endPoint;
	protected boolean _relativeEndPoint;
	protected boolean _relativeStartPoint;
	protected int _startPoint;
	public boolean dynamicPosition;
	protected boolean loaded;
	private Handler mHandler;
	private Runnable mTimeoutDetectionTask = new Runnable() {

		public void run()
		{
			if(state == APSMediaEventState.APSMediaEventStatePreloading)
		//*   0    0:aload_0         
		//*   1    1:getfield        #14  <Field APSMediaEvent this$0>
		//*   2    4:invokestatic    #23  <Method APSMediaEvent$APSMediaEventState APSMediaEvent.access$000(APSMediaEvent)>
		//*   3    7:getstatic       #29  <Field APSMediaEvent$APSMediaEventState APSMediaEvent$APSMediaEventState.APSMediaEventStatePreloading>
		//*   4   10:if_acmpne       20
				notifyEventTimeout();
		//    5   13:aload_0         
		//    6   14:getfield        #14  <Field APSMediaEvent this$0>
		//    7   17:invokestatic    #32  <Method void APSMediaEvent.access$100(APSMediaEvent)>
		//    8   20:return          
		}

		final APSMediaEvent this$0;

			
			{
				this$0 = APSMediaEvent.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #14  <Field APSMediaEvent this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #17  <Method void Object()>
			//    5    9:return          
			}
	}
;
	public long preloadInterval;
	public long preloadPoint;
	public long repeatAfter;
	private APSMediaEventState state;
	private ArrayList stateListeners;
	public long timeout;
	private ArrayList timeoutListeners;


/*
	static APSMediaEventState access$000(APSMediaEvent apsmediaevent)
	{
		return apsmediaevent.state;
	//    0    0:aload_0         
	//    1    1:getfield        #94  <Field APSMediaEvent$APSMediaEventState state>
	//    2    4:areturn         
	}

*/


/*
	static void access$100(APSMediaEvent apsmediaevent)
	{
		apsmediaevent.notifyEventTimeout();
	//    0    0:aload_0         
	//    1    1:invokespecial   #146 <Method void notifyEventTimeout()>
		return;
	//    2    4:return          
	}

*/
}

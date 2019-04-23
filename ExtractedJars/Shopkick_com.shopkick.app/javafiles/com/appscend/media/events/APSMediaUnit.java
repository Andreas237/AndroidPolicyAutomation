// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appscend.media.events;

import android.os.Handler;
import android.os.Parcel;
import com.appscend.media.APSMediaPlayer;
import com.appscend.media.renderers.ExoPlayerRenderer;
import com.appscend.media.renderers.MediaPlayerRenderer;
import java.util.*;

// Referenced classes of package com.appscend.media.events:
//			APSMediaEvent, APSMediaOverlay, APSVastAdBreak

public class APSMediaUnit extends APSMediaEvent
{
	public static final class APSHandleSeekEvent extends Enum
	{

		public static APSHandleSeekEvent valueOf(String s)
		{
			return (APSHandleSeekEvent)Enum.valueOf(com/appscend/media/events/APSMediaUnit$APSHandleSeekEvent, s);
		//    0    0:ldc1            #2   <Class APSMediaUnit$APSHandleSeekEvent>
		//    1    2:aload_0         
		//    2    3:invokestatic    #39  <Method Enum Enum.valueOf(Class, String)>
		//    3    6:checkcast       #2   <Class APSMediaUnit$APSHandleSeekEvent>
		//    4    9:areturn         
		}

		public static APSHandleSeekEvent[] values()
		{
			return (APSHandleSeekEvent[])((APSHandleSeekEvent []) ($VALUES)).clone();
		//    0    0:getstatic       #31  <Field APSMediaUnit$APSHandleSeekEvent[] $VALUES>
		//    1    3:invokevirtual   #46  <Method Object _5B_Lcom.appscend.media.events.APSMediaUnit$APSHandleSeekEvent_3B_.clone()>
		//    2    6:checkcast       #42  <Class APSMediaUnit$APSHandleSeekEvent[]>
		//    3    9:areturn         
		}

		private static final APSHandleSeekEvent $VALUES[];
		public static final APSHandleSeekEvent APSHandleSeekEventPlayAllBreaks;
		public static final APSHandleSeekEvent APSHandleSeekEventPlayFirstBreak;
		public static final APSHandleSeekEvent APSHandleSeekEventPlayLastBreak;

		static 
		{
			APSHandleSeekEventPlayFirstBreak = new APSHandleSeekEvent("APSHandleSeekEventPlayFirstBreak", 0);
		//    0    0:new             #2   <Class APSMediaUnit$APSHandleSeekEvent>
		//    1    3:dup             
		//    2    4:ldc1            #17  <String "APSHandleSeekEventPlayFirstBreak">
		//    3    6:iconst_0        
		//    4    7:invokespecial   #21  <Method void APSMediaUnit$APSHandleSeekEvent(String, int)>
		//    5   10:putstatic       #23  <Field APSMediaUnit$APSHandleSeekEvent APSHandleSeekEventPlayFirstBreak>
			APSHandleSeekEventPlayLastBreak = new APSHandleSeekEvent("APSHandleSeekEventPlayLastBreak", 1);
		//    6   13:new             #2   <Class APSMediaUnit$APSHandleSeekEvent>
		//    7   16:dup             
		//    8   17:ldc1            #24  <String "APSHandleSeekEventPlayLastBreak">
		//    9   19:iconst_1        
		//   10   20:invokespecial   #21  <Method void APSMediaUnit$APSHandleSeekEvent(String, int)>
		//   11   23:putstatic       #26  <Field APSMediaUnit$APSHandleSeekEvent APSHandleSeekEventPlayLastBreak>
			APSHandleSeekEventPlayAllBreaks = new APSHandleSeekEvent("APSHandleSeekEventPlayAllBreaks", 2);
		//   12   26:new             #2   <Class APSMediaUnit$APSHandleSeekEvent>
		//   13   29:dup             
		//   14   30:ldc1            #27  <String "APSHandleSeekEventPlayAllBreaks">
		//   15   32:iconst_2        
		//   16   33:invokespecial   #21  <Method void APSMediaUnit$APSHandleSeekEvent(String, int)>
		//   17   36:putstatic       #29  <Field APSMediaUnit$APSHandleSeekEvent APSHandleSeekEventPlayAllBreaks>
			$VALUES = (new APSHandleSeekEvent[] {
				APSHandleSeekEventPlayFirstBreak, APSHandleSeekEventPlayLastBreak, APSHandleSeekEventPlayAllBreaks
			});
		//   18   39:iconst_3        
		//   19   40:anewarray       APSHandleSeekEvent[]
		//   20   43:dup             
		//   21   44:iconst_0        
		//   22   45:getstatic       #23  <Field APSMediaUnit$APSHandleSeekEvent APSHandleSeekEventPlayFirstBreak>
		//   23   48:aastore         
		//   24   49:dup             
		//   25   50:iconst_1        
		//   26   51:getstatic       #26  <Field APSMediaUnit$APSHandleSeekEvent APSHandleSeekEventPlayLastBreak>
		//   27   54:aastore         
		//   28   55:dup             
		//   29   56:iconst_2        
		//   30   57:getstatic       #29  <Field APSMediaUnit$APSHandleSeekEvent APSHandleSeekEventPlayAllBreaks>
		//   31   60:aastore         
		//   32   61:putstatic       #31  <Field APSMediaUnit$APSHandleSeekEvent[] $VALUES>
		//*  33   64:return          
		}

		private APSHandleSeekEvent(String s, int i)
		{
			super(s, i);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #33  <Method void Enum(String, int)>
		//    4    6:return          
		}
	}

	public static final class APSMediaControlsDisplay extends Enum
	{

		public static APSMediaControlsDisplay valueOf(String s)
		{
			return (APSMediaControlsDisplay)Enum.valueOf(com/appscend/media/events/APSMediaUnit$APSMediaControlsDisplay, s);
		//    0    0:ldc1            #2   <Class APSMediaUnit$APSMediaControlsDisplay>
		//    1    2:aload_0         
		//    2    3:invokestatic    #39  <Method Enum Enum.valueOf(Class, String)>
		//    3    6:checkcast       #2   <Class APSMediaUnit$APSMediaControlsDisplay>
		//    4    9:areturn         
		}

		public static APSMediaControlsDisplay[] values()
		{
			return (APSMediaControlsDisplay[])((APSMediaControlsDisplay []) ($VALUES)).clone();
		//    0    0:getstatic       #31  <Field APSMediaUnit$APSMediaControlsDisplay[] $VALUES>
		//    1    3:invokevirtual   #46  <Method Object _5B_Lcom.appscend.media.events.APSMediaUnit$APSMediaControlsDisplay_3B_.clone()>
		//    2    6:checkcast       #42  <Class APSMediaUnit$APSMediaControlsDisplay[]>
		//    3    9:areturn         
		}

		private static final APSMediaControlsDisplay $VALUES[];
		public static final APSMediaControlsDisplay APSMediaControlsDisplayBottom;
		public static final APSMediaControlsDisplay APSMediaControlsDisplayNone;
		public static final APSMediaControlsDisplay APSMediaControlsDisplayTop;

		static 
		{
			APSMediaControlsDisplayBottom = new APSMediaControlsDisplay("APSMediaControlsDisplayBottom", 0);
		//    0    0:new             #2   <Class APSMediaUnit$APSMediaControlsDisplay>
		//    1    3:dup             
		//    2    4:ldc1            #17  <String "APSMediaControlsDisplayBottom">
		//    3    6:iconst_0        
		//    4    7:invokespecial   #21  <Method void APSMediaUnit$APSMediaControlsDisplay(String, int)>
		//    5   10:putstatic       #23  <Field APSMediaUnit$APSMediaControlsDisplay APSMediaControlsDisplayBottom>
			APSMediaControlsDisplayTop = new APSMediaControlsDisplay("APSMediaControlsDisplayTop", 1);
		//    6   13:new             #2   <Class APSMediaUnit$APSMediaControlsDisplay>
		//    7   16:dup             
		//    8   17:ldc1            #24  <String "APSMediaControlsDisplayTop">
		//    9   19:iconst_1        
		//   10   20:invokespecial   #21  <Method void APSMediaUnit$APSMediaControlsDisplay(String, int)>
		//   11   23:putstatic       #26  <Field APSMediaUnit$APSMediaControlsDisplay APSMediaControlsDisplayTop>
			APSMediaControlsDisplayNone = new APSMediaControlsDisplay("APSMediaControlsDisplayNone", 2);
		//   12   26:new             #2   <Class APSMediaUnit$APSMediaControlsDisplay>
		//   13   29:dup             
		//   14   30:ldc1            #27  <String "APSMediaControlsDisplayNone">
		//   15   32:iconst_2        
		//   16   33:invokespecial   #21  <Method void APSMediaUnit$APSMediaControlsDisplay(String, int)>
		//   17   36:putstatic       #29  <Field APSMediaUnit$APSMediaControlsDisplay APSMediaControlsDisplayNone>
			$VALUES = (new APSMediaControlsDisplay[] {
				APSMediaControlsDisplayBottom, APSMediaControlsDisplayTop, APSMediaControlsDisplayNone
			});
		//   18   39:iconst_3        
		//   19   40:anewarray       APSMediaControlsDisplay[]
		//   20   43:dup             
		//   21   44:iconst_0        
		//   22   45:getstatic       #23  <Field APSMediaUnit$APSMediaControlsDisplay APSMediaControlsDisplayBottom>
		//   23   48:aastore         
		//   24   49:dup             
		//   25   50:iconst_1        
		//   26   51:getstatic       #26  <Field APSMediaUnit$APSMediaControlsDisplay APSMediaControlsDisplayTop>
		//   27   54:aastore         
		//   28   55:dup             
		//   29   56:iconst_2        
		//   30   57:getstatic       #29  <Field APSMediaUnit$APSMediaControlsDisplay APSMediaControlsDisplayNone>
		//   31   60:aastore         
		//   32   61:putstatic       #31  <Field APSMediaUnit$APSMediaControlsDisplay[] $VALUES>
		//*  33   64:return          
		}

		private APSMediaControlsDisplay(String s, int i)
		{
			super(s, i);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #33  <Method void Enum(String, int)>
		//    4    6:return          
		}
	}


	public APSMediaUnit()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #64  <Method void APSMediaEvent()>
		played = false;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #66  <Field boolean played>
		canReplay = false;
	//    5    9:aload_0         
	//    6   10:iconst_0        
	//    7   11:putfield        #68  <Field boolean canReplay>
		manager = null;
	//    8   14:aload_0         
	//    9   15:aconst_null     
	//   10   16:putfield        #70  <Field String manager>
		seekHandling = APSHandleSeekEvent.APSHandleSeekEventPlayLastBreak;
	//   11   19:aload_0         
	//   12   20:getstatic       #73  <Field APSMediaUnit$APSHandleSeekEvent APSMediaUnit$APSHandleSeekEvent.APSHandleSeekEventPlayLastBreak>
	//   13   23:putfield        #75  <Field APSMediaUnit$APSHandleSeekEvent seekHandling>
		midcontentAdMinimumInitialOffset = 300;
	//   14   26:aload_0         
	//   15   27:sipush          300
	//   16   30:putfield        #77  <Field int midcontentAdMinimumInitialOffset>
		midcontentAdMinimumFinalOffset = 300;
	//   17   33:aload_0         
	//   18   34:sipush          300
	//   19   37:putfield        #79  <Field int midcontentAdMinimumFinalOffset>
		midcontentAdMinimumSpacing = 300;
	//   20   40:aload_0         
	//   21   41:sipush          300
	//   22   44:putfield        #81  <Field int midcontentAdMinimumSpacing>
		_positionedDynamicEvents = false;
	//   23   47:aload_0         
	//   24   48:iconst_0        
	//   25   49:putfield        #83  <Field boolean _positionedDynamicEvents>
		mHandler = null;
	//   26   52:aload_0         
	//   27   53:aconst_null     
	//   28   54:putfield        #85  <Field Handler mHandler>
		castEnabled = false;
	//   29   57:aload_0         
	//   30   58:iconst_0        
	//   31   59:putfield        #87  <Field boolean castEnabled>
		controlsDisplay = APSMediaControlsDisplay.APSMediaControlsDisplayBottom;
	//   32   62:aload_0         
	//   33   63:getstatic       #90  <Field APSMediaUnit$APSMediaControlsDisplay APSMediaUnit$APSMediaControlsDisplay.APSMediaControlsDisplayBottom>
	//   34   66:putfield        #92  <Field APSMediaUnit$APSMediaControlsDisplay controlsDisplay>
		pinchToFullscreen = true;
	//   35   69:aload_0         
	//   36   70:iconst_1        
	//   37   71:putfield        #94  <Field boolean pinchToFullscreen>
		shouldAutoplay = true;
	//   38   74:aload_0         
	//   39   75:iconst_1        
	//   40   76:putfield        #96  <Field boolean shouldAutoplay>
		metadata = new HashMap();
	//   41   79:aload_0         
	//   42   80:new             #98  <Class HashMap>
	//   43   83:dup             
	//   44   84:invokespecial   #99  <Method void HashMap()>
	//   45   87:putfield        #101 <Field HashMap metadata>
		if(android.os.Build.VERSION.SDK_INT < 16)
	//*  46   90:getstatic       #106 <Field int android.os.Build$VERSION.SDK_INT>
	//*  47   93:bipush          16
	//*  48   95:icmpge          108
			renderer = MediaPlayerRenderer.rendererIdentifier;
	//   49   98:aload_0         
	//   50   99:getstatic       #111 <Field String MediaPlayerRenderer.rendererIdentifier>
	//   51  102:putfield        #113 <Field String renderer>
		else
	//*  52  105:goto            115
			renderer = ExoPlayerRenderer.rendererIdentifier;
	//   53  108:aload_0         
	//   54  109:getstatic       #116 <Field String ExoPlayerRenderer.rendererIdentifier>
	//   55  112:putfield        #113 <Field String renderer>
		if(APSMediaPlayer.getInstance().isGoogleCastEnabled())
	//*  56  115:invokestatic    #122 <Method APSMediaPlayer APSMediaPlayer.getInstance()>
	//*  57  118:invokevirtual   #126 <Method boolean APSMediaPlayer.isGoogleCastEnabled()>
	//*  58  121:ifeq            128
			addGoogleCastOverlay();
	//   59  124:aload_0         
	//   60  125:invokevirtual   #129 <Method void addGoogleCastOverlay()>
	//   61  128:return          
	}

	protected APSMediaUnit(Parcel parcel)
	{
		super(parcel);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #132 <Method void APSMediaEvent(Parcel)>
		boolean flag1 = false;
	//    3    5:iconst_0        
	//    4    6:istore          4
		played = false;
	//    5    8:aload_0         
	//    6    9:iconst_0        
	//    7   10:putfield        #66  <Field boolean played>
		canReplay = false;
	//    8   13:aload_0         
	//    9   14:iconst_0        
	//   10   15:putfield        #68  <Field boolean canReplay>
		Object obj1 = null;
	//   11   18:aconst_null     
	//   12   19:astore          6
		manager = null;
	//   13   21:aload_0         
	//   14   22:aconst_null     
	//   15   23:putfield        #70  <Field String manager>
		seekHandling = APSHandleSeekEvent.APSHandleSeekEventPlayLastBreak;
	//   16   26:aload_0         
	//   17   27:getstatic       #73  <Field APSMediaUnit$APSHandleSeekEvent APSMediaUnit$APSHandleSeekEvent.APSHandleSeekEventPlayLastBreak>
	//   18   30:putfield        #75  <Field APSMediaUnit$APSHandleSeekEvent seekHandling>
		midcontentAdMinimumInitialOffset = 300;
	//   19   33:aload_0         
	//   20   34:sipush          300
	//   21   37:putfield        #77  <Field int midcontentAdMinimumInitialOffset>
		midcontentAdMinimumFinalOffset = 300;
	//   22   40:aload_0         
	//   23   41:sipush          300
	//   24   44:putfield        #79  <Field int midcontentAdMinimumFinalOffset>
		midcontentAdMinimumSpacing = 300;
	//   25   47:aload_0         
	//   26   48:sipush          300
	//   27   51:putfield        #81  <Field int midcontentAdMinimumSpacing>
		_positionedDynamicEvents = false;
	//   28   54:aload_0         
	//   29   55:iconst_0        
	//   30   56:putfield        #83  <Field boolean _positionedDynamicEvents>
		mHandler = null;
	//   31   59:aload_0         
	//   32   60:aconst_null     
	//   33   61:putfield        #85  <Field Handler mHandler>
		castEnabled = false;
	//   34   64:aload_0         
	//   35   65:iconst_0        
	//   36   66:putfield        #87  <Field boolean castEnabled>
		_overlays = parcel.createTypedArrayList(APSMediaOverlay.CREATOR);
	//   37   69:aload_0         
	//   38   70:aload_1         
	//   39   71:getstatic       #135 <Field android.os.Parcelable$Creator APSMediaOverlay.CREATOR>
	//   40   74:invokevirtual   #141 <Method ArrayList Parcel.createTypedArrayList(android.os.Parcelable$Creator)>
	//   41   77:putfield        #143 <Field ArrayList _overlays>
		url = parcel.readString();
	//   42   80:aload_0         
	//   43   81:aload_1         
	//   44   82:invokevirtual   #147 <Method String Parcel.readString()>
	//   45   85:putfield        #149 <Field String url>
		subtitlesUrl = parcel.readString();
	//   46   88:aload_0         
	//   47   89:aload_1         
	//   48   90:invokevirtual   #147 <Method String Parcel.readString()>
	//   49   93:putfield        #151 <Field String subtitlesUrl>
		initialPlaybackTime = parcel.readInt();
	//   50   96:aload_0         
	//   51   97:aload_1         
	//   52   98:invokevirtual   #155 <Method int Parcel.readInt()>
	//   53  101:putfield        #157 <Field int initialPlaybackTime>
		int i = parcel.readInt();
	//   54  104:aload_1         
	//   55  105:invokevirtual   #155 <Method int Parcel.readInt()>
	//   56  108:istore_2        
		Object obj;
		if(i == -1)
	//*  57  109:iload_2         
	//*  58  110:iconst_m1       
	//*  59  111:icmpne          120
			obj = null;
	//   60  114:aconst_null     
	//   61  115:astore          5
		else
	//*  62  117:goto            127
			obj = ((Object) (com.appscend.media.APSMediaBuilder.MPMovieControlStyle.values()[i]));
	//   63  120:invokestatic    #163 <Method com.appscend.media.APSMediaBuilder$MPMovieControlStyle[] com.appscend.media.APSMediaBuilder$MPMovieControlStyle.values()>
	//   64  123:iload_2         
	//   65  124:aaload          
	//   66  125:astore          5
		controlStyle = ((com.appscend.media.APSMediaBuilder.MPMovieControlStyle) (obj));
	//   67  127:aload_0         
	//   68  128:aload           5
	//   69  130:putfield        #165 <Field com.appscend.media.APSMediaBuilder$MPMovieControlStyle controlStyle>
		i = parcel.readInt();
	//   70  133:aload_1         
	//   71  134:invokevirtual   #155 <Method int Parcel.readInt()>
	//   72  137:istore_2        
		if(i == -1)
	//*  73  138:iload_2         
	//*  74  139:iconst_m1       
	//*  75  140:icmpne          149
			obj = null;
	//   76  143:aconst_null     
	//   77  144:astore          5
		else
	//*  78  146:goto            156
			obj = ((Object) (APSMediaControlsDisplay.values()[i]));
	//   79  149:invokestatic    #168 <Method APSMediaUnit$APSMediaControlsDisplay[] APSMediaUnit$APSMediaControlsDisplay.values()>
	//   80  152:iload_2         
	//   81  153:aaload          
	//   82  154:astore          5
		controlsDisplay = ((APSMediaControlsDisplay) (obj));
	//   83  156:aload_0         
	//   84  157:aload           5
	//   85  159:putfield        #92  <Field APSMediaUnit$APSMediaControlsDisplay controlsDisplay>
		controlsParameters = (HashMap)parcel.readSerializable();
	//   86  162:aload_0         
	//   87  163:aload_1         
	//   88  164:invokevirtual   #172 <Method java.io.Serializable Parcel.readSerializable()>
	//   89  167:checkcast       #98  <Class HashMap>
	//   90  170:putfield        #174 <Field HashMap controlsParameters>
		buffet = parcel.createTypedArrayList(CREATOR);
	//   91  173:aload_0         
	//   92  174:aload_1         
	//   93  175:getstatic       #62  <Field android.os.Parcelable$Creator CREATOR>
	//   94  178:invokevirtual   #141 <Method ArrayList Parcel.createTypedArrayList(android.os.Parcelable$Creator)>
	//   95  181:putfield        #176 <Field ArrayList buffet>
		metadata = (HashMap)parcel.readSerializable();
	//   96  184:aload_0         
	//   97  185:aload_1         
	//   98  186:invokevirtual   #172 <Method java.io.Serializable Parcel.readSerializable()>
	//   99  189:checkcast       #98  <Class HashMap>
	//  100  192:putfield        #101 <Field HashMap metadata>
		boolean flag;
		if(parcel.readByte() != 0)
	//* 101  195:aload_1         
	//* 102  196:invokevirtual   #180 <Method byte Parcel.readByte()>
	//* 103  199:ifeq            207
			flag = true;
	//  104  202:iconst_1        
	//  105  203:istore_3        
		else
	//* 106  204:goto            209
			flag = false;
	//  107  207:iconst_0        
	//  108  208:istore_3        
		pinchToFullscreen = flag;
	//  109  209:aload_0         
	//  110  210:iload_3         
	//  111  211:putfield        #94  <Field boolean pinchToFullscreen>
		if(parcel.readByte() != 0)
	//* 112  214:aload_1         
	//* 113  215:invokevirtual   #180 <Method byte Parcel.readByte()>
	//* 114  218:ifeq            226
			flag = true;
	//  115  221:iconst_1        
	//  116  222:istore_3        
		else
	//* 117  223:goto            228
			flag = false;
	//  118  226:iconst_0        
	//  119  227:istore_3        
		debug = flag;
	//  120  228:aload_0         
	//  121  229:iload_3         
	//  122  230:putfield        #182 <Field boolean debug>
		if(parcel.readByte() != 0)
	//* 123  233:aload_1         
	//* 124  234:invokevirtual   #180 <Method byte Parcel.readByte()>
	//* 125  237:ifeq            245
			flag = true;
	//  126  240:iconst_1        
	//  127  241:istore_3        
		else
	//* 128  242:goto            247
			flag = false;
	//  129  245:iconst_0        
	//  130  246:istore_3        
		shouldAutoplay = flag;
	//  131  247:aload_0         
	//  132  248:iload_3         
	//  133  249:putfield        #96  <Field boolean shouldAutoplay>
		if(parcel.readByte() != 0)
	//* 134  252:aload_1         
	//* 135  253:invokevirtual   #180 <Method byte Parcel.readByte()>
	//* 136  256:ifeq            264
			flag = true;
	//  137  259:iconst_1        
	//  138  260:istore_3        
		else
	//* 139  261:goto            266
			flag = false;
	//  140  264:iconst_0        
	//  141  265:istore_3        
		played = flag;
	//  142  266:aload_0         
	//  143  267:iload_3         
	//  144  268:putfield        #66  <Field boolean played>
		if(parcel.readByte() != 0)
	//* 145  271:aload_1         
	//* 146  272:invokevirtual   #180 <Method byte Parcel.readByte()>
	//* 147  275:ifeq            283
			flag = true;
	//  148  278:iconst_1        
	//  149  279:istore_3        
		else
	//* 150  280:goto            285
			flag = false;
	//  151  283:iconst_0        
	//  152  284:istore_3        
		canReplay = flag;
	//  153  285:aload_0         
	//  154  286:iload_3         
	//  155  287:putfield        #68  <Field boolean canReplay>
		i = parcel.readInt();
	//  156  290:aload_1         
	//  157  291:invokevirtual   #155 <Method int Parcel.readInt()>
	//  158  294:istore_2        
		if(i == -1)
	//* 159  295:iload_2         
	//* 160  296:iconst_m1       
	//* 161  297:icmpne          307
			obj = ((Object) (obj1));
	//  162  300:aload           6
	//  163  302:astore          5
		else
	//* 164  304:goto            314
			obj = ((Object) (APSHandleSeekEvent.values()[i]));
	//  165  307:invokestatic    #185 <Method APSMediaUnit$APSHandleSeekEvent[] APSMediaUnit$APSHandleSeekEvent.values()>
	//  166  310:iload_2         
	//  167  311:aaload          
	//  168  312:astore          5
		seekHandling = ((APSHandleSeekEvent) (obj));
	//  169  314:aload_0         
	//  170  315:aload           5
	//  171  317:putfield        #75  <Field APSMediaUnit$APSHandleSeekEvent seekHandling>
		midcontentAdMinimumInitialOffset = parcel.readInt();
	//  172  320:aload_0         
	//  173  321:aload_1         
	//  174  322:invokevirtual   #155 <Method int Parcel.readInt()>
	//  175  325:putfield        #77  <Field int midcontentAdMinimumInitialOffset>
		midcontentAdMinimumFinalOffset = parcel.readInt();
	//  176  328:aload_0         
	//  177  329:aload_1         
	//  178  330:invokevirtual   #155 <Method int Parcel.readInt()>
	//  179  333:putfield        #79  <Field int midcontentAdMinimumFinalOffset>
		midcontentAdMinimumSpacing = parcel.readInt();
	//  180  336:aload_0         
	//  181  337:aload_1         
	//  182  338:invokevirtual   #155 <Method int Parcel.readInt()>
	//  183  341:putfield        #81  <Field int midcontentAdMinimumSpacing>
		if(parcel.readByte() != 0)
	//* 184  344:aload_1         
	//* 185  345:invokevirtual   #180 <Method byte Parcel.readByte()>
	//* 186  348:ifeq            356
			flag = true;
	//  187  351:iconst_1        
	//  188  352:istore_3        
		else
	//* 189  353:goto            358
			flag = false;
	//  190  356:iconst_0        
	//  191  357:istore_3        
		_positionedDynamicEvents = flag;
	//  192  358:aload_0         
	//  193  359:iload_3         
	//  194  360:putfield        #83  <Field boolean _positionedDynamicEvents>
		sourceAdBreak = (APSVastAdBreak)parcel.readParcelable(((Class) (com/appscend/media/events/APSVastAdBreak)).getClassLoader());
	//  195  363:aload_0         
	//  196  364:aload_1         
	//  197  365:ldc1            #187 <Class APSVastAdBreak>
	//  198  367:invokevirtual   #193 <Method ClassLoader Class.getClassLoader()>
	//  199  370:invokevirtual   #197 <Method android.os.Parcelable Parcel.readParcelable(ClassLoader)>
	//  200  373:checkcast       #187 <Class APSVastAdBreak>
	//  201  376:putfield        #199 <Field APSVastAdBreak sourceAdBreak>
		flag = flag1;
	//  202  379:iload           4
	//  203  381:istore_3        
		if(parcel.readByte() != 0)
	//* 204  382:aload_1         
	//* 205  383:invokevirtual   #180 <Method byte Parcel.readByte()>
	//* 206  386:ifeq            391
			flag = true;
	//  207  389:iconst_1        
	//  208  390:istore_3        
		castEnabled = flag;
	//  209  391:aload_0         
	//  210  392:iload_3         
	//  211  393:putfield        #87  <Field boolean castEnabled>
	//  212  396:return          
	}

	public void addEvent(APSMediaEvent apsmediaevent)
	{
		if(apsmediaevent.dynamicPosition)
	//*   0    0:aload_1         
	//*   1    1:getfield        #204 <Field boolean APSMediaEvent.dynamicPosition>
	//*   2    4:ifeq            35
		{
			if(_dynamicEvents == null)
	//*   3    7:aload_0         
	//*   4    8:getfield        #206 <Field ArrayList _dynamicEvents>
	//*   5   11:ifnonnull       25
				_dynamicEvents = new ArrayList();
	//    6   14:aload_0         
	//    7   15:new             #208 <Class ArrayList>
	//    8   18:dup             
	//    9   19:invokespecial   #209 <Method void ArrayList()>
	//   10   22:putfield        #206 <Field ArrayList _dynamicEvents>
			_dynamicEvents.add(((Object) (apsmediaevent)));
	//   11   25:aload_0         
	//   12   26:getfield        #206 <Field ArrayList _dynamicEvents>
	//   13   29:aload_1         
	//   14   30:invokevirtual   #213 <Method boolean ArrayList.add(Object)>
	//   15   33:pop             
			return;
	//   16   34:return          
		}
		if(_events == null)
	//*  17   35:aload_0         
	//*  18   36:getfield        #215 <Field ArrayList _events>
	//*  19   39:ifnonnull       53
			_events = new ArrayList();
	//   20   42:aload_0         
	//   21   43:new             #208 <Class ArrayList>
	//   22   46:dup             
	//   23   47:invokespecial   #209 <Method void ArrayList()>
	//   24   50:putfield        #215 <Field ArrayList _events>
		_events.add(((Object) (apsmediaevent)));
	//   25   53:aload_0         
	//   26   54:getfield        #215 <Field ArrayList _events>
	//   27   57:aload_1         
	//   28   58:invokevirtual   #213 <Method boolean ArrayList.add(Object)>
	//   29   61:pop             
	//   30   62:return          
	}

	public void addGoogleCastOverlay()
	{
		APSMediaOverlay apsmediaoverlay = new APSMediaOverlay();
	//    0    0:new             #134 <Class APSMediaOverlay>
	//    1    3:dup             
	//    2    4:invokespecial   #216 <Method void APSMediaOverlay()>
	//    3    7:astore_1        
		apsmediaoverlay.type = "media-route-button";
	//    4    8:aload_1         
	//    5    9:ldc1            #218 <String "media-route-button">
	//    6   11:putfield        #221 <Field String APSMediaOverlay.type>
		apsmediaoverlay.position = APSMediaOverlay.APSMediaOverlayPosition.kAPSMediaOverlayPositionTopRight;
	//    7   14:aload_1         
	//    8   15:getstatic       #227 <Field APSMediaOverlay$APSMediaOverlayPosition APSMediaOverlay$APSMediaOverlayPosition.kAPSMediaOverlayPositionTopRight>
	//    9   18:putfield        #230 <Field APSMediaOverlay$APSMediaOverlayPosition APSMediaOverlay.position>
		apsmediaoverlay.width = "50";
	//   10   21:aload_1         
	//   11   22:ldc1            #232 <String "50">
	//   12   24:putfield        #235 <Field String APSMediaOverlay.width>
		apsmediaoverlay.height = "50";
	//   13   27:aload_1         
	//   14   28:ldc1            #232 <String "50">
	//   15   30:putfield        #238 <Field String APSMediaOverlay.height>
		apsmediaoverlay.setStartPoint("0");
	//   16   33:aload_1         
	//   17   34:ldc1            #240 <String "0">
	//   18   36:invokevirtual   #244 <Method void APSMediaOverlay.setStartPoint(String)>
		apsmediaoverlay.setEndPoint(String.valueOf(0x7fffffff));
	//   19   39:aload_1         
	//   20   40:ldc1            #245 <Int 0x7fffffff>
	//   21   42:invokestatic    #251 <Method String String.valueOf(int)>
	//   22   45:invokevirtual   #254 <Method void APSMediaOverlay.setEndPoint(String)>
		apsmediaoverlay.zIndex = 0x7fffffff;
	//   23   48:aload_1         
	//   24   49:ldc1            #245 <Int 0x7fffffff>
	//   25   51:putfield        #257 <Field int APSMediaOverlay.zIndex>
		addOverlay(apsmediaoverlay);
	//   26   54:aload_0         
	//   27   55:aload_1         
	//   28   56:invokevirtual   #261 <Method void addOverlay(APSMediaOverlay)>
		castEnabled = true;
	//   29   59:aload_0         
	//   30   60:iconst_1        
	//   31   61:putfield        #87  <Field boolean castEnabled>
	//   32   64:return          
	}

	public void addOverlay(APSMediaOverlay apsmediaoverlay)
	{
		apsmediaoverlay.parentUnit = this;
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:putfield        #265 <Field APSMediaUnit APSMediaOverlay.parentUnit>
		ArrayList arraylist = _overlays;
	//    3    5:aload_0         
	//    4    6:getfield        #143 <Field ArrayList _overlays>
	//    5    9:astore_2        
		if(arraylist == null)
	//*   6   10:aload_2         
	//*   7   11:ifnonnull       30
		{
			_overlays = new ArrayList(((java.util.Collection) (Collections.singletonList(((Object) (apsmediaoverlay))))));
	//    8   14:aload_0         
	//    9   15:new             #208 <Class ArrayList>
	//   10   18:dup             
	//   11   19:aload_1         
	//   12   20:invokestatic    #271 <Method java.util.List Collections.singletonList(Object)>
	//   13   23:invokespecial   #274 <Method void ArrayList(java.util.Collection)>
	//   14   26:putfield        #143 <Field ArrayList _overlays>
			return;
	//   15   29:return          
		} else
		{
			arraylist.add(((Object) (apsmediaoverlay)));
	//   16   30:aload_2         
	//   17   31:aload_1         
	//   18   32:invokevirtual   #213 <Method boolean ArrayList.add(Object)>
	//   19   35:pop             
			return;
	//   20   36:return          
		}
	}

	public void clearOverlays()
	{
		ArrayList arraylist = _overlays;
	//    0    0:aload_0         
	//    1    1:getfield        #143 <Field ArrayList _overlays>
	//    2    4:astore_1        
		if(arraylist != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          13
			arraylist.clear();
	//    5    9:aload_1         
	//    6   10:invokevirtual   #278 <Method void ArrayList.clear()>
	//    7   13:return          
	}

	public APSMediaUnit copyWithZone()
	{
		APSMediaUnit apsmediaunit = new APSMediaUnit();
	//    0    0:new             #2   <Class APSMediaUnit>
	//    1    3:dup             
	//    2    4:invokespecial   #281 <Method void APSMediaUnit()>
	//    3    7:astore_1        
		apsmediaunit.url = url;
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:getfield        #149 <Field String url>
	//    7   13:putfield        #149 <Field String url>
		apsmediaunit.initialPlaybackTime = initialPlaybackTime;
	//    8   16:aload_1         
	//    9   17:aload_0         
	//   10   18:getfield        #157 <Field int initialPlaybackTime>
	//   11   21:putfield        #157 <Field int initialPlaybackTime>
		apsmediaunit.controlsDisplay = controlsDisplay;
	//   12   24:aload_1         
	//   13   25:aload_0         
	//   14   26:getfield        #92  <Field APSMediaUnit$APSMediaControlsDisplay controlsDisplay>
	//   15   29:putfield        #92  <Field APSMediaUnit$APSMediaControlsDisplay controlsDisplay>
		apsmediaunit._positionedDynamicEvents = _positionedDynamicEvents;
	//   16   32:aload_1         
	//   17   33:aload_0         
	//   18   34:getfield        #83  <Field boolean _positionedDynamicEvents>
	//   19   37:putfield        #83  <Field boolean _positionedDynamicEvents>
		Object obj = ((Object) (controlsParameters));
	//   20   40:aload_0         
	//   21   41:getfield        #174 <Field HashMap controlsParameters>
	//   22   44:astore_2        
		if(obj != null)
	//*  23   45:aload_2         
	//*  24   46:ifnull          61
			apsmediaunit.controlsParameters = new HashMap(((java.util.Map) (obj)));
	//   25   49:aload_1         
	//   26   50:new             #98  <Class HashMap>
	//   27   53:dup             
	//   28   54:aload_2         
	//   29   55:invokespecial   #284 <Method void HashMap(java.util.Map)>
	//   30   58:putfield        #174 <Field HashMap controlsParameters>
		if(trackingURLs != null)
	//*  31   61:aload_0         
	//*  32   62:getfield        #287 <Field HashMap trackingURLs>
	//*  33   65:ifnull          83
			apsmediaunit.trackingURLs = new HashMap(((java.util.Map) (trackingURLs)));
	//   34   68:aload_1         
	//   35   69:new             #98  <Class HashMap>
	//   36   72:dup             
	//   37   73:aload_0         
	//   38   74:getfield        #287 <Field HashMap trackingURLs>
	//   39   77:invokespecial   #284 <Method void HashMap(java.util.Map)>
	//   40   80:putfield        #287 <Field HashMap trackingURLs>
		obj = ((Object) (buffet));
	//   41   83:aload_0         
	//   42   84:getfield        #176 <Field ArrayList buffet>
	//   43   87:astore_2        
		if(obj != null)
	//*  44   88:aload_2         
	//*  45   89:ifnull          104
			apsmediaunit.buffet = new ArrayList(((java.util.Collection) (obj)));
	//   46   92:aload_1         
	//   47   93:new             #208 <Class ArrayList>
	//   48   96:dup             
	//   49   97:aload_2         
	//   50   98:invokespecial   #274 <Method void ArrayList(java.util.Collection)>
	//   51  101:putfield        #176 <Field ArrayList buffet>
		apsmediaunit.pinchToFullscreen = pinchToFullscreen;
	//   52  104:aload_1         
	//   53  105:aload_0         
	//   54  106:getfield        #94  <Field boolean pinchToFullscreen>
	//   55  109:putfield        #94  <Field boolean pinchToFullscreen>
		apsmediaunit.debug = debug;
	//   56  112:aload_1         
	//   57  113:aload_0         
	//   58  114:getfield        #182 <Field boolean debug>
	//   59  117:putfield        #182 <Field boolean debug>
		apsmediaunit.metadata = new HashMap(((java.util.Map) (metadata)));
	//   60  120:aload_1         
	//   61  121:new             #98  <Class HashMap>
	//   62  124:dup             
	//   63  125:aload_0         
	//   64  126:getfield        #101 <Field HashMap metadata>
	//   65  129:invokespecial   #284 <Method void HashMap(java.util.Map)>
	//   66  132:putfield        #101 <Field HashMap metadata>
		apsmediaunit.manager = manager;
	//   67  135:aload_1         
	//   68  136:aload_0         
	//   69  137:getfield        #70  <Field String manager>
	//   70  140:putfield        #70  <Field String manager>
		apsmediaunit.renderer = renderer;
	//   71  143:aload_1         
	//   72  144:aload_0         
	//   73  145:getfield        #113 <Field String renderer>
	//   74  148:putfield        #113 <Field String renderer>
		apsmediaunit.setOverlays(new ArrayList(((java.util.Collection) (overlays()))));
	//   75  151:aload_1         
	//   76  152:new             #208 <Class ArrayList>
	//   77  155:dup             
	//   78  156:aload_0         
	//   79  157:invokevirtual   #291 <Method ArrayList overlays()>
	//   80  160:invokespecial   #274 <Method void ArrayList(java.util.Collection)>
	//   81  163:invokevirtual   #295 <Method void setOverlays(ArrayList)>
		if(castEnabled)
	//*  82  166:aload_0         
	//*  83  167:getfield        #87  <Field boolean castEnabled>
	//*  84  170:ifeq            177
			apsmediaunit.addGoogleCastOverlay();
	//   85  173:aload_1         
	//   86  174:invokevirtual   #129 <Method void addGoogleCastOverlay()>
		return apsmediaunit;
	//   87  177:aload_1         
	//   88  178:areturn         
	}

	public int describeContents()
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public ArrayList dynamicEvents()
	{
		if(_dynamicEvents == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #206 <Field ArrayList _dynamicEvents>
	//*   2    4:ifnonnull       18
			_dynamicEvents = new ArrayList();
	//    3    7:aload_0         
	//    4    8:new             #208 <Class ArrayList>
	//    5   11:dup             
	//    6   12:invokespecial   #209 <Method void ArrayList()>
	//    7   15:putfield        #206 <Field ArrayList _dynamicEvents>
		return _dynamicEvents;
	//    8   18:aload_0         
	//    9   19:getfield        #206 <Field ArrayList _dynamicEvents>
	//   10   22:areturn         
	}

	public ArrayList events()
	{
		if(_events == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #215 <Field ArrayList _events>
	//*   2    4:ifnonnull       18
			_events = new ArrayList();
	//    3    7:aload_0         
	//    4    8:new             #208 <Class ArrayList>
	//    5   11:dup             
	//    6   12:invokespecial   #209 <Method void ArrayList()>
	//    7   15:putfield        #215 <Field ArrayList _events>
		return _events;
	//    8   18:aload_0         
	//    9   19:getfield        #215 <Field ArrayList _events>
	//   10   22:areturn         
	}

	public void initWithURL(String s)
	{
		url = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #149 <Field String url>
	//    3    5:return          
	}

	public void onPreload()
	{
	//    0    0:return          
	}

	public void onTrigger()
	{
	//    0    0:return          
	}

	public void onUnload()
	{
	//    0    0:return          
	}

	public void onUpdate()
	{
	//    0    0:return          
	}

	public ArrayList overlays()
	{
		if(_overlays == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #143 <Field ArrayList _overlays>
	//*   2    4:ifnonnull       18
			_overlays = new ArrayList();
	//    3    7:aload_0         
	//    4    8:new             #208 <Class ArrayList>
	//    5   11:dup             
	//    6   12:invokespecial   #209 <Method void ArrayList()>
	//    7   15:putfield        #143 <Field ArrayList _overlays>
		return _overlays;
	//    8   18:aload_0         
	//    9   19:getfield        #143 <Field ArrayList _overlays>
	//   10   22:areturn         
	}

	public void setEvents(ArrayList arraylist)
	{
		arraylist = ((ArrayList) (arraylist.iterator()));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #311 <Method Iterator ArrayList.iterator()>
	//    2    4:astore_1        
		do
		{
			if(!((Iterator) (arraylist)).hasNext())
				break;
	//    3    5:aload_1         
	//    4    6:invokeinterface #316 <Method boolean Iterator.hasNext()>
	//    5   11:ifeq            46
			Object obj = ((Iterator) (arraylist)).next();
	//    6   14:aload_1         
	//    7   15:invokeinterface #320 <Method Object Iterator.next()>
	//    8   20:astore_2        
			if((obj instanceof APSMediaEvent) && !(obj instanceof APSMediaOverlay))
	//*   9   21:aload_2         
	//*  10   22:instanceof      #4   <Class APSMediaEvent>
	//*  11   25:ifeq            5
	//*  12   28:aload_2         
	//*  13   29:instanceof      #134 <Class APSMediaOverlay>
	//*  14   32:ifne            5
				addEvent((APSMediaEvent)obj);
	//   15   35:aload_0         
	//   16   36:aload_2         
	//   17   37:checkcast       #4   <Class APSMediaEvent>
	//   18   40:invokevirtual   #322 <Method void addEvent(APSMediaEvent)>
		} while(true);
	//   19   43:goto            5
	//   20   46:return          
	}

	public void setOverlays(ArrayList arraylist)
	{
		arraylist = ((ArrayList) (arraylist.iterator()));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #311 <Method Iterator ArrayList.iterator()>
	//    2    4:astore_1        
		do
		{
			if(!((Iterator) (arraylist)).hasNext())
				break;
	//    3    5:aload_1         
	//    4    6:invokeinterface #316 <Method boolean Iterator.hasNext()>
	//    5   11:ifeq            39
			Object obj = ((Iterator) (arraylist)).next();
	//    6   14:aload_1         
	//    7   15:invokeinterface #320 <Method Object Iterator.next()>
	//    8   20:astore_2        
			if(obj instanceof APSMediaOverlay)
	//*   9   21:aload_2         
	//*  10   22:instanceof      #134 <Class APSMediaOverlay>
	//*  11   25:ifeq            5
				addOverlay((APSMediaOverlay)obj);
	//   12   28:aload_0         
	//   13   29:aload_2         
	//   14   30:checkcast       #134 <Class APSMediaOverlay>
	//   15   33:invokevirtual   #261 <Method void addOverlay(APSMediaOverlay)>
		} while(true);
	//   16   36:goto            5
	//   17   39:return          
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e1expr(TypeTransformer.java:496)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:713)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:698)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
	//    0    0:new             #327 <Class RuntimeException>
	//    1    3:dup             
	//    2    4:ldc2            #329 <String "d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e1expr(TypeTransformer.java:496)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:713)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:698)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n">
	//    3    7:invokespecial   #333 <Method void Runtime(String)>
	//    4   10:athrow          
	}

	public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

		public APSMediaUnit createFromParcel(Parcel parcel)
		{
			return new APSMediaUnit(parcel);
		//    0    0:new             #9   <Class APSMediaUnit>
		//    1    3:dup             
		//    2    4:aload_1         
		//    3    5:invokespecial   #19  <Method void APSMediaUnit(Parcel)>
		//    4    8:areturn         
		}

		public volatile Object createFromParcel(Parcel parcel)
		{
			return ((Object) (createFromParcel(parcel)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #22  <Method APSMediaUnit createFromParcel(Parcel)>
		//    3    5:areturn         
		}

		public APSMediaUnit[] newArray(int i)
		{
			return new APSMediaUnit[i];
		//    0    0:iload_1         
		//    1    1:anewarray       APSMediaUnit[]
		//    2    4:areturn         
		}

		public volatile Object[] newArray(int i)
		{
			return ((Object []) (newArray(i)));
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:invokevirtual   #27  <Method APSMediaUnit[] newArray(int)>
		//    3    5:areturn         
		}

	}
;
	protected ArrayList _dynamicEvents;
	protected ArrayList _events;
	protected ArrayList _overlays;
	public boolean _positionedDynamicEvents;
	public ArrayList buffet;
	public boolean canReplay;
	private boolean castEnabled;
	public com.appscend.media.APSMediaBuilder.MPMovieControlStyle controlStyle;
	public APSMediaControlsDisplay controlsDisplay;
	public HashMap controlsParameters;
	public boolean debug;
	public int initialPlaybackTime;
	private Handler mHandler;
	public String manager;
	public HashMap metadata;
	public int midcontentAdMinimumFinalOffset;
	public int midcontentAdMinimumInitialOffset;
	public int midcontentAdMinimumSpacing;
	public boolean pinchToFullscreen;
	public boolean played;
	public String renderer;
	public APSHandleSeekEvent seekHandling;
	public boolean shouldAutoplay;
	public APSVastAdBreak sourceAdBreak;
	public String subtitlesUrl;
	public String url;

	static 
	{
	//    0    0:new             #6   <Class APSMediaUnit$1>
	//    1    3:dup             
	//    2    4:invokespecial   #60  <Method void APSMediaUnit$1()>
	//    3    7:putstatic       #62  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}

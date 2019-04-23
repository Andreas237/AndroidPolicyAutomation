// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appscend.media;


// Referenced classes of package com.appscend.media:
//			APSMediaPlayer

static class APSMediaPlayer$20
{

	static final int $SwitchMap$com$appscend$media$APSMediaBuilder$APSWebviewDismissedAction[];
	static final int $SwitchMap$com$appscend$media$APSMediaPlayer$FullscreenOrientationBehaviour[];
	static final int $SwitchMap$com$appscend$media$APSMediaPlayer$MPMoviePlaybackState[];
	static final int $SwitchMap$com$appscend$media$events$APSMediaOverlay$APSMediaOverlayPosition[];
	static final int $SwitchMap$com$appscend$media$events$APSMediaUnit$APSHandleSeekEvent[];

	static 
	{
		$SwitchMap$com$appscend$media$events$APSMediaOverlay$APSMediaOverlayPosition = new int[com.appscend.media.events.SMediaOverlayPosition.values().length];
	//    0    0:invokestatic    #22  <Method com.appscend.media.events.APSMediaOverlay$APSMediaOverlayPosition[] com.appscend.media.events.APSMediaOverlay$APSMediaOverlayPosition.values()>
	//    1    3:arraylength     
	//    2    4:newarray        int[]
	//    3    6:putstatic       #24  <Field int[] $SwitchMap$com$appscend$media$events$APSMediaOverlay$APSMediaOverlayPosition>
		try
		{
			$SwitchMap$com$appscend$media$events$APSMediaOverlay$APSMediaOverlayPosition[com.appscend.media.events.SMediaOverlayPosition.kAPSMediaOverlayPositionBottomLeft.ordinal()] = 1;
	//    4    9:getstatic       #24  <Field int[] $SwitchMap$com$appscend$media$events$APSMediaOverlay$APSMediaOverlayPosition>
	//    5   12:getstatic       #28  <Field com.appscend.media.events.APSMediaOverlay$APSMediaOverlayPosition com.appscend.media.events.APSMediaOverlay$APSMediaOverlayPosition.kAPSMediaOverlayPositionBottomLeft>
	//    6   15:invokevirtual   #32  <Method int com.appscend.media.events.APSMediaOverlay$APSMediaOverlayPosition.ordinal()>
	//    7   18:iconst_1        
	//    8   19:iastore         
		}
	//*   9   20:getstatic       #24  <Field int[] $SwitchMap$com$appscend$media$events$APSMediaOverlay$APSMediaOverlayPosition>
	//*  10   23:getstatic       #35  <Field com.appscend.media.events.APSMediaOverlay$APSMediaOverlayPosition com.appscend.media.events.APSMediaOverlay$APSMediaOverlayPosition.kAPSMediaOverlayPositionBottomRight>
	//*  11   26:invokevirtual   #32  <Method int com.appscend.media.events.APSMediaOverlay$APSMediaOverlayPosition.ordinal()>
	//*  12   29:iconst_2        
	//*  13   30:iastore         
	//*  14   31:getstatic       #24  <Field int[] $SwitchMap$com$appscend$media$events$APSMediaOverlay$APSMediaOverlayPosition>
	//*  15   34:getstatic       #38  <Field com.appscend.media.events.APSMediaOverlay$APSMediaOverlayPosition com.appscend.media.events.APSMediaOverlay$APSMediaOverlayPosition.kAPSMediaOverlayPositionTopLeft>
	//*  16   37:invokevirtual   #32  <Method int com.appscend.media.events.APSMediaOverlay$APSMediaOverlayPosition.ordinal()>
	//*  17   40:iconst_3        
	//*  18   41:iastore         
	//*  19   42:getstatic       #24  <Field int[] $SwitchMap$com$appscend$media$events$APSMediaOverlay$APSMediaOverlayPosition>
	//*  20   45:getstatic       #41  <Field com.appscend.media.events.APSMediaOverlay$APSMediaOverlayPosition com.appscend.media.events.APSMediaOverlay$APSMediaOverlayPosition.kAPSMediaOverlayPositionTopRight>
	//*  21   48:invokevirtual   #32  <Method int com.appscend.media.events.APSMediaOverlay$APSMediaOverlayPosition.ordinal()>
	//*  22   51:iconst_4        
	//*  23   52:iastore         
	//*  24   53:getstatic       #24  <Field int[] $SwitchMap$com$appscend$media$events$APSMediaOverlay$APSMediaOverlayPosition>
	//*  25   56:getstatic       #44  <Field com.appscend.media.events.APSMediaOverlay$APSMediaOverlayPosition com.appscend.media.events.APSMediaOverlay$APSMediaOverlayPosition.kAPSMediaOverlayPositionTop>
	//*  26   59:invokevirtual   #32  <Method int com.appscend.media.events.APSMediaOverlay$APSMediaOverlayPosition.ordinal()>
	//*  27   62:iconst_5        
	//*  28   63:iastore         
	//*  29   64:getstatic       #24  <Field int[] $SwitchMap$com$appscend$media$events$APSMediaOverlay$APSMediaOverlayPosition>
	//*  30   67:getstatic       #47  <Field com.appscend.media.events.APSMediaOverlay$APSMediaOverlayPosition com.appscend.media.events.APSMediaOverlay$APSMediaOverlayPosition.kAPSMediaOverlayPositionBottom>
	//*  31   70:invokevirtual   #32  <Method int com.appscend.media.events.APSMediaOverlay$APSMediaOverlayPosition.ordinal()>
	//*  32   73:bipush          6
	//*  33   75:iastore         
	//*  34   76:getstatic       #24  <Field int[] $SwitchMap$com$appscend$media$events$APSMediaOverlay$APSMediaOverlayPosition>
	//*  35   79:getstatic       #50  <Field com.appscend.media.events.APSMediaOverlay$APSMediaOverlayPosition com.appscend.media.events.APSMediaOverlay$APSMediaOverlayPosition.kAPSMediaOverlayPositionFullscreen>
	//*  36   82:invokevirtual   #32  <Method int com.appscend.media.events.APSMediaOverlay$APSMediaOverlayPosition.ordinal()>
	//*  37   85:bipush          7
	//*  38   87:iastore         
	//*  39   88:invokestatic    #55  <Method com.appscend.media.events.APSMediaUnit$APSHandleSeekEvent[] com.appscend.media.events.APSMediaUnit$APSHandleSeekEvent.values()>
	//*  40   91:arraylength     
	//*  41   92:newarray        int[]
	//*  42   94:putstatic       #57  <Field int[] $SwitchMap$com$appscend$media$events$APSMediaUnit$APSHandleSeekEvent>
	//*  43   97:getstatic       #57  <Field int[] $SwitchMap$com$appscend$media$events$APSMediaUnit$APSHandleSeekEvent>
	//*  44  100:getstatic       #61  <Field com.appscend.media.events.APSMediaUnit$APSHandleSeekEvent com.appscend.media.events.APSMediaUnit$APSHandleSeekEvent.APSHandleSeekEventPlayAllBreaks>
	//*  45  103:invokevirtual   #62  <Method int com.appscend.media.events.APSMediaUnit$APSHandleSeekEvent.ordinal()>
	//*  46  106:iconst_1        
	//*  47  107:iastore         
	//*  48  108:getstatic       #57  <Field int[] $SwitchMap$com$appscend$media$events$APSMediaUnit$APSHandleSeekEvent>
	//*  49  111:getstatic       #65  <Field com.appscend.media.events.APSMediaUnit$APSHandleSeekEvent com.appscend.media.events.APSMediaUnit$APSHandleSeekEvent.APSHandleSeekEventPlayFirstBreak>
	//*  50  114:invokevirtual   #62  <Method int com.appscend.media.events.APSMediaUnit$APSHandleSeekEvent.ordinal()>
	//*  51  117:iconst_2        
	//*  52  118:iastore         
	//*  53  119:getstatic       #57  <Field int[] $SwitchMap$com$appscend$media$events$APSMediaUnit$APSHandleSeekEvent>
	//*  54  122:getstatic       #68  <Field com.appscend.media.events.APSMediaUnit$APSHandleSeekEvent com.appscend.media.events.APSMediaUnit$APSHandleSeekEvent.APSHandleSeekEventPlayLastBreak>
	//*  55  125:invokevirtual   #62  <Method int com.appscend.media.events.APSMediaUnit$APSHandleSeekEvent.ordinal()>
	//*  56  128:iconst_3        
	//*  57  129:iastore         
	//*  58  130:invokestatic    #73  <Method APSMediaPlayer$MPMoviePlaybackState[] APSMediaPlayer$MPMoviePlaybackState.values()>
	//*  59  133:arraylength     
	//*  60  134:newarray        int[]
	//*  61  136:putstatic       #75  <Field int[] $SwitchMap$com$appscend$media$APSMediaPlayer$MPMoviePlaybackState>
	//*  62  139:getstatic       #75  <Field int[] $SwitchMap$com$appscend$media$APSMediaPlayer$MPMoviePlaybackState>
	//*  63  142:getstatic       #79  <Field APSMediaPlayer$MPMoviePlaybackState APSMediaPlayer$MPMoviePlaybackState.MPMoviePlaybackStopped>
	//*  64  145:invokevirtual   #80  <Method int APSMediaPlayer$MPMoviePlaybackState.ordinal()>
	//*  65  148:iconst_1        
	//*  66  149:iastore         
	//*  67  150:getstatic       #75  <Field int[] $SwitchMap$com$appscend$media$APSMediaPlayer$MPMoviePlaybackState>
	//*  68  153:getstatic       #83  <Field APSMediaPlayer$MPMoviePlaybackState APSMediaPlayer$MPMoviePlaybackState.MPMoviePlaybackPlaying>
	//*  69  156:invokevirtual   #80  <Method int APSMediaPlayer$MPMoviePlaybackState.ordinal()>
	//*  70  159:iconst_2        
	//*  71  160:iastore         
	//*  72  161:getstatic       #75  <Field int[] $SwitchMap$com$appscend$media$APSMediaPlayer$MPMoviePlaybackState>
	//*  73  164:getstatic       #86  <Field APSMediaPlayer$MPMoviePlaybackState APSMediaPlayer$MPMoviePlaybackState.MPMoviePlaybackPaused>
	//*  74  167:invokevirtual   #80  <Method int APSMediaPlayer$MPMoviePlaybackState.ordinal()>
	//*  75  170:iconst_3        
	//*  76  171:iastore         
	//*  77  172:getstatic       #75  <Field int[] $SwitchMap$com$appscend$media$APSMediaPlayer$MPMoviePlaybackState>
	//*  78  175:getstatic       #89  <Field APSMediaPlayer$MPMoviePlaybackState APSMediaPlayer$MPMoviePlaybackState.MPMoviePlaybackSeekingBackward>
	//*  79  178:invokevirtual   #80  <Method int APSMediaPlayer$MPMoviePlaybackState.ordinal()>
	//*  80  181:iconst_4        
	//*  81  182:iastore         
	//*  82  183:getstatic       #75  <Field int[] $SwitchMap$com$appscend$media$APSMediaPlayer$MPMoviePlaybackState>
	//*  83  186:getstatic       #92  <Field APSMediaPlayer$MPMoviePlaybackState APSMediaPlayer$MPMoviePlaybackState.MPMoviePlaybackSeekingForward>
	//*  84  189:invokevirtual   #80  <Method int APSMediaPlayer$MPMoviePlaybackState.ordinal()>
	//*  85  192:iconst_5        
	//*  86  193:iastore         
	//*  87  194:invokestatic    #97  <Method APSMediaBuilder$APSWebviewDismissedAction[] APSMediaBuilder$APSWebviewDismissedAction.values()>
	//*  88  197:arraylength     
	//*  89  198:newarray        int[]
	//*  90  200:putstatic       #99  <Field int[] $SwitchMap$com$appscend$media$APSMediaBuilder$APSWebviewDismissedAction>
	//*  91  203:getstatic       #99  <Field int[] $SwitchMap$com$appscend$media$APSMediaBuilder$APSWebviewDismissedAction>
	//*  92  206:getstatic       #103 <Field APSMediaBuilder$APSWebviewDismissedAction APSMediaBuilder$APSWebviewDismissedAction.APSDoNothingOnWebviewDismiss>
	//*  93  209:invokevirtual   #104 <Method int APSMediaBuilder$APSWebviewDismissedAction.ordinal()>
	//*  94  212:iconst_1        
	//*  95  213:iastore         
	//*  96  214:getstatic       #99  <Field int[] $SwitchMap$com$appscend$media$APSMediaBuilder$APSWebviewDismissedAction>
	//*  97  217:getstatic       #107 <Field APSMediaBuilder$APSWebviewDismissedAction APSMediaBuilder$APSWebviewDismissedAction.APSHideOverlayOnWebviewDismiss>
	//*  98  220:invokevirtual   #104 <Method int APSMediaBuilder$APSWebviewDismissedAction.ordinal()>
	//*  99  223:iconst_2        
	//* 100  224:iastore         
	//* 101  225:getstatic       #99  <Field int[] $SwitchMap$com$appscend$media$APSMediaBuilder$APSWebviewDismissedAction>
	//* 102  228:getstatic       #110 <Field APSMediaBuilder$APSWebviewDismissedAction APSMediaBuilder$APSWebviewDismissedAction.APSSkipUnitOnWebviewDismiss>
	//* 103  231:invokevirtual   #104 <Method int APSMediaBuilder$APSWebviewDismissedAction.ordinal()>
	//* 104  234:iconst_3        
	//* 105  235:iastore         
	//* 106  236:invokestatic    #115 <Method APSMediaPlayer$FullscreenOrientationBehaviour[] APSMediaPlayer$FullscreenOrientationBehaviour.values()>
	//* 107  239:arraylength     
	//* 108  240:newarray        int[]
	//* 109  242:putstatic       #117 <Field int[] $SwitchMap$com$appscend$media$APSMediaPlayer$FullscreenOrientationBehaviour>
	//* 110  245:getstatic       #117 <Field int[] $SwitchMap$com$appscend$media$APSMediaPlayer$FullscreenOrientationBehaviour>
	//* 111  248:getstatic       #121 <Field APSMediaPlayer$FullscreenOrientationBehaviour APSMediaPlayer$FullscreenOrientationBehaviour.defaultBehaviour>
	//* 112  251:invokevirtual   #122 <Method int APSMediaPlayer$FullscreenOrientationBehaviour.ordinal()>
	//* 113  254:iconst_1        
	//* 114  255:iastore         
	//* 115  256:getstatic       #117 <Field int[] $SwitchMap$com$appscend$media$APSMediaPlayer$FullscreenOrientationBehaviour>
	//* 116  259:getstatic       #125 <Field APSMediaPlayer$FullscreenOrientationBehaviour APSMediaPlayer$FullscreenOrientationBehaviour.sensorLandscapeOrientation>
	//* 117  262:invokevirtual   #122 <Method int APSMediaPlayer$FullscreenOrientationBehaviour.ordinal()>
	//* 118  265:iconst_2        
	//* 119  266:iastore         
	//* 120  267:getstatic       #117 <Field int[] $SwitchMap$com$appscend$media$APSMediaPlayer$FullscreenOrientationBehaviour>
	//* 121  270:getstatic       #128 <Field APSMediaPlayer$FullscreenOrientationBehaviour APSMediaPlayer$FullscreenOrientationBehaviour.sensorPortraitOrientation>
	//* 122  273:invokevirtual   #122 <Method int APSMediaPlayer$FullscreenOrientationBehaviour.ordinal()>
	//* 123  276:iconst_3        
	//* 124  277:iastore         
	//* 125  278:return          
		catch(NoSuchFieldError nosuchfielderror) { }
	//  126  279:astore_0        
		try
		{
			$SwitchMap$com$appscend$media$events$APSMediaOverlay$APSMediaOverlayPosition[com.appscend.media.events.SMediaOverlayPosition.kAPSMediaOverlayPositionBottomRight.ordinal()] = 2;
		}
	//* 127  280:goto            20
		catch(NoSuchFieldError nosuchfielderror1) { }
	//  128  283:astore_0        
		try
		{
			$SwitchMap$com$appscend$media$events$APSMediaOverlay$APSMediaOverlayPosition[com.appscend.media.events.SMediaOverlayPosition.kAPSMediaOverlayPositionTopLeft.ordinal()] = 3;
		}
	//* 129  284:goto            31
		catch(NoSuchFieldError nosuchfielderror2) { }
	//  130  287:astore_0        
		try
		{
			$SwitchMap$com$appscend$media$events$APSMediaOverlay$APSMediaOverlayPosition[com.appscend.media.events.SMediaOverlayPosition.kAPSMediaOverlayPositionTopRight.ordinal()] = 4;
		}
	//* 131  288:goto            42
		catch(NoSuchFieldError nosuchfielderror3) { }
	//  132  291:astore_0        
		try
		{
			$SwitchMap$com$appscend$media$events$APSMediaOverlay$APSMediaOverlayPosition[com.appscend.media.events.SMediaOverlayPosition.kAPSMediaOverlayPositionTop.ordinal()] = 5;
		}
	//* 133  292:goto            53
		catch(NoSuchFieldError nosuchfielderror4) { }
	//  134  295:astore_0        
		try
		{
			$SwitchMap$com$appscend$media$events$APSMediaOverlay$APSMediaOverlayPosition[com.appscend.media.events.SMediaOverlayPosition.kAPSMediaOverlayPositionBottom.ordinal()] = 6;
		}
	//* 135  296:goto            64
		catch(NoSuchFieldError nosuchfielderror5) { }
	//  136  299:astore_0        
		try
		{
			$SwitchMap$com$appscend$media$events$APSMediaOverlay$APSMediaOverlayPosition[com.appscend.media.events.SMediaOverlayPosition.kAPSMediaOverlayPositionFullscreen.ordinal()] = 7;
		}
	//* 137  300:goto            76
		catch(NoSuchFieldError nosuchfielderror6) { }
	//  138  303:astore_0        
		$SwitchMap$com$appscend$media$events$APSMediaUnit$APSHandleSeekEvent = new int[com.appscend.media.events.ndleSeekEvent.values().length];
		try
		{
			$SwitchMap$com$appscend$media$events$APSMediaUnit$APSHandleSeekEvent[com.appscend.media.events.ndleSeekEvent.APSHandleSeekEventPlayAllBreaks.ordinal()] = 1;
		}
	//* 139  304:goto            88
		catch(NoSuchFieldError nosuchfielderror7) { }
	//  140  307:astore_0        
		try
		{
			$SwitchMap$com$appscend$media$events$APSMediaUnit$APSHandleSeekEvent[com.appscend.media.events.ndleSeekEvent.APSHandleSeekEventPlayFirstBreak.ordinal()] = 2;
		}
	//* 141  308:goto            108
		catch(NoSuchFieldError nosuchfielderror8) { }
	//  142  311:astore_0        
		try
		{
			$SwitchMap$com$appscend$media$events$APSMediaUnit$APSHandleSeekEvent[com.appscend.media.events.ndleSeekEvent.APSHandleSeekEventPlayLastBreak.ordinal()] = 3;
		}
	//* 143  312:goto            119
		catch(NoSuchFieldError nosuchfielderror9) { }
	//  144  315:astore_0        
		$SwitchMap$com$appscend$media$APSMediaPlayer$MPMoviePlaybackState = new int[oviePlaybackState.values().length];
		try
		{
			$SwitchMap$com$appscend$media$APSMediaPlayer$MPMoviePlaybackState[oviePlaybackState.MPMoviePlaybackStopped.ordinal()] = 1;
		}
	//* 145  316:goto            130
		catch(NoSuchFieldError nosuchfielderror10) { }
	//  146  319:astore_0        
		try
		{
			$SwitchMap$com$appscend$media$APSMediaPlayer$MPMoviePlaybackState[oviePlaybackState.MPMoviePlaybackPlaying.ordinal()] = 2;
		}
	//* 147  320:goto            150
		catch(NoSuchFieldError nosuchfielderror11) { }
	//  148  323:astore_0        
		try
		{
			$SwitchMap$com$appscend$media$APSMediaPlayer$MPMoviePlaybackState[oviePlaybackState.MPMoviePlaybackPaused.ordinal()] = 3;
		}
	//* 149  324:goto            161
		catch(NoSuchFieldError nosuchfielderror12) { }
	//  150  327:astore_0        
		try
		{
			$SwitchMap$com$appscend$media$APSMediaPlayer$MPMoviePlaybackState[oviePlaybackState.MPMoviePlaybackSeekingBackward.ordinal()] = 4;
		}
	//* 151  328:goto            172
		catch(NoSuchFieldError nosuchfielderror13) { }
	//  152  331:astore_0        
		try
		{
			$SwitchMap$com$appscend$media$APSMediaPlayer$MPMoviePlaybackState[oviePlaybackState.MPMoviePlaybackSeekingForward.ordinal()] = 5;
		}
	//* 153  332:goto            183
		catch(NoSuchFieldError nosuchfielderror14) { }
	//  154  335:astore_0        
		$SwitchMap$com$appscend$media$APSMediaBuilder$APSWebviewDismissedAction = new int[SWebviewDismissedAction.values().length];
		try
		{
			$SwitchMap$com$appscend$media$APSMediaBuilder$APSWebviewDismissedAction[SWebviewDismissedAction.APSDoNothingOnWebviewDismiss.ordinal()] = 1;
		}
	//* 155  336:goto            194
		catch(NoSuchFieldError nosuchfielderror15) { }
	//  156  339:astore_0        
		try
		{
			$SwitchMap$com$appscend$media$APSMediaBuilder$APSWebviewDismissedAction[SWebviewDismissedAction.APSHideOverlayOnWebviewDismiss.ordinal()] = 2;
		}
	//* 157  340:goto            214
		catch(NoSuchFieldError nosuchfielderror16) { }
	//  158  343:astore_0        
		try
		{
			$SwitchMap$com$appscend$media$APSMediaBuilder$APSWebviewDismissedAction[SWebviewDismissedAction.APSSkipUnitOnWebviewDismiss.ordinal()] = 3;
		}
	//* 159  344:goto            225
		catch(NoSuchFieldError nosuchfielderror17) { }
	//  160  347:astore_0        
		$SwitchMap$com$appscend$media$APSMediaPlayer$FullscreenOrientationBehaviour = new int[lscreenOrientationBehaviour.values().length];
		try
		{
			$SwitchMap$com$appscend$media$APSMediaPlayer$FullscreenOrientationBehaviour[lscreenOrientationBehaviour.defaultBehaviour.ordinal()] = 1;
		}
	//* 161  348:goto            236
		catch(NoSuchFieldError nosuchfielderror18) { }
	//  162  351:astore_0        
		try
		{
			$SwitchMap$com$appscend$media$APSMediaPlayer$FullscreenOrientationBehaviour[lscreenOrientationBehaviour.sensorLandscapeOrientation.ordinal()] = 2;
		}
	//* 163  352:goto            256
		catch(NoSuchFieldError nosuchfielderror19) { }
	//  164  355:astore_0        
		try
		{
			$SwitchMap$com$appscend$media$APSMediaPlayer$FullscreenOrientationBehaviour[lscreenOrientationBehaviour.sensorPortraitOrientation.ordinal()] = 3;
		}
	//* 165  356:goto            267
		catch(NoSuchFieldError nosuchfielderror20) { }
	//  166  359:astore_0        
	//* 167  360:return          
	}
}

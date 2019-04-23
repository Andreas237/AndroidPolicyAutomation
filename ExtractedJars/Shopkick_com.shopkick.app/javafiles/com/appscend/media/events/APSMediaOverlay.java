// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appscend.media.events;

import android.app.Activity;
import android.os.Handler;
import android.os.Parcel;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.RelativeLayout;
import com.appscend.media.APSMediaPlayer;
import com.appscend.overlaycontrollers.APSMediaPlayerOverlayController;
import com.appscend.utilities.APSUsageTracker;
import com.appscend.utilities.VPUtilities;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;

// Referenced classes of package com.appscend.media.events:
//			APSMediaEvent, APSMediaUnit

public class APSMediaOverlay extends APSMediaEvent
	implements Cloneable
{
	public static final class APSMediaOverlayPosition extends Enum
	{

		public static APSMediaOverlayPosition valueOf(String s)
		{
			return (APSMediaOverlayPosition)Enum.valueOf(com/appscend/media/events/APSMediaOverlay$APSMediaOverlayPosition, s);
		//    0    0:ldc1            #2   <Class APSMediaOverlay$APSMediaOverlayPosition>
		//    1    2:aload_0         
		//    2    3:invokestatic    #67  <Method Enum Enum.valueOf(Class, String)>
		//    3    6:checkcast       #2   <Class APSMediaOverlay$APSMediaOverlayPosition>
		//    4    9:areturn         
		}

		public static APSMediaOverlayPosition[] values()
		{
			return (APSMediaOverlayPosition[])((APSMediaOverlayPosition []) ($VALUES)).clone();
		//    0    0:getstatic       #59  <Field APSMediaOverlay$APSMediaOverlayPosition[] $VALUES>
		//    1    3:invokevirtual   #74  <Method Object _5B_Lcom.appscend.media.events.APSMediaOverlay$APSMediaOverlayPosition_3B_.clone()>
		//    2    6:checkcast       #70  <Class APSMediaOverlay$APSMediaOverlayPosition[]>
		//    3    9:areturn         
		}

		private static final APSMediaOverlayPosition $VALUES[];
		public static final APSMediaOverlayPosition kAPSMediaOverlayPositionBottom;
		public static final APSMediaOverlayPosition kAPSMediaOverlayPositionBottomLeft;
		public static final APSMediaOverlayPosition kAPSMediaOverlayPositionBottomRight;
		public static final APSMediaOverlayPosition kAPSMediaOverlayPositionFullscreen;
		public static final APSMediaOverlayPosition kAPSMediaOverlayPositionLeft;
		public static final APSMediaOverlayPosition kAPSMediaOverlayPositionRight;
		public static final APSMediaOverlayPosition kAPSMediaOverlayPositionTop;
		public static final APSMediaOverlayPosition kAPSMediaOverlayPositionTopLeft;
		public static final APSMediaOverlayPosition kAPSMediaOverlayPositionTopRight;
		public static final APSMediaOverlayPosition kAPSMediaOverlayPositionUnspecified;

		static 
		{
			kAPSMediaOverlayPositionFullscreen = new APSMediaOverlayPosition("kAPSMediaOverlayPositionFullscreen", 0);
		//    0    0:new             #2   <Class APSMediaOverlay$APSMediaOverlayPosition>
		//    1    3:dup             
		//    2    4:ldc1            #24  <String "kAPSMediaOverlayPositionFullscreen">
		//    3    6:iconst_0        
		//    4    7:invokespecial   #28  <Method void APSMediaOverlay$APSMediaOverlayPosition(String, int)>
		//    5   10:putstatic       #30  <Field APSMediaOverlay$APSMediaOverlayPosition kAPSMediaOverlayPositionFullscreen>
			kAPSMediaOverlayPositionBottomLeft = new APSMediaOverlayPosition("kAPSMediaOverlayPositionBottomLeft", 1);
		//    6   13:new             #2   <Class APSMediaOverlay$APSMediaOverlayPosition>
		//    7   16:dup             
		//    8   17:ldc1            #31  <String "kAPSMediaOverlayPositionBottomLeft">
		//    9   19:iconst_1        
		//   10   20:invokespecial   #28  <Method void APSMediaOverlay$APSMediaOverlayPosition(String, int)>
		//   11   23:putstatic       #33  <Field APSMediaOverlay$APSMediaOverlayPosition kAPSMediaOverlayPositionBottomLeft>
			kAPSMediaOverlayPositionBottomRight = new APSMediaOverlayPosition("kAPSMediaOverlayPositionBottomRight", 2);
		//   12   26:new             #2   <Class APSMediaOverlay$APSMediaOverlayPosition>
		//   13   29:dup             
		//   14   30:ldc1            #34  <String "kAPSMediaOverlayPositionBottomRight">
		//   15   32:iconst_2        
		//   16   33:invokespecial   #28  <Method void APSMediaOverlay$APSMediaOverlayPosition(String, int)>
		//   17   36:putstatic       #36  <Field APSMediaOverlay$APSMediaOverlayPosition kAPSMediaOverlayPositionBottomRight>
			kAPSMediaOverlayPositionTopLeft = new APSMediaOverlayPosition("kAPSMediaOverlayPositionTopLeft", 3);
		//   18   39:new             #2   <Class APSMediaOverlay$APSMediaOverlayPosition>
		//   19   42:dup             
		//   20   43:ldc1            #37  <String "kAPSMediaOverlayPositionTopLeft">
		//   21   45:iconst_3        
		//   22   46:invokespecial   #28  <Method void APSMediaOverlay$APSMediaOverlayPosition(String, int)>
		//   23   49:putstatic       #39  <Field APSMediaOverlay$APSMediaOverlayPosition kAPSMediaOverlayPositionTopLeft>
			kAPSMediaOverlayPositionTopRight = new APSMediaOverlayPosition("kAPSMediaOverlayPositionTopRight", 4);
		//   24   52:new             #2   <Class APSMediaOverlay$APSMediaOverlayPosition>
		//   25   55:dup             
		//   26   56:ldc1            #40  <String "kAPSMediaOverlayPositionTopRight">
		//   27   58:iconst_4        
		//   28   59:invokespecial   #28  <Method void APSMediaOverlay$APSMediaOverlayPosition(String, int)>
		//   29   62:putstatic       #42  <Field APSMediaOverlay$APSMediaOverlayPosition kAPSMediaOverlayPositionTopRight>
			kAPSMediaOverlayPositionTop = new APSMediaOverlayPosition("kAPSMediaOverlayPositionTop", 5);
		//   30   65:new             #2   <Class APSMediaOverlay$APSMediaOverlayPosition>
		//   31   68:dup             
		//   32   69:ldc1            #43  <String "kAPSMediaOverlayPositionTop">
		//   33   71:iconst_5        
		//   34   72:invokespecial   #28  <Method void APSMediaOverlay$APSMediaOverlayPosition(String, int)>
		//   35   75:putstatic       #45  <Field APSMediaOverlay$APSMediaOverlayPosition kAPSMediaOverlayPositionTop>
			kAPSMediaOverlayPositionBottom = new APSMediaOverlayPosition("kAPSMediaOverlayPositionBottom", 6);
		//   36   78:new             #2   <Class APSMediaOverlay$APSMediaOverlayPosition>
		//   37   81:dup             
		//   38   82:ldc1            #46  <String "kAPSMediaOverlayPositionBottom">
		//   39   84:bipush          6
		//   40   86:invokespecial   #28  <Method void APSMediaOverlay$APSMediaOverlayPosition(String, int)>
		//   41   89:putstatic       #48  <Field APSMediaOverlay$APSMediaOverlayPosition kAPSMediaOverlayPositionBottom>
			kAPSMediaOverlayPositionLeft = new APSMediaOverlayPosition("kAPSMediaOverlayPositionLeft", 7);
		//   42   92:new             #2   <Class APSMediaOverlay$APSMediaOverlayPosition>
		//   43   95:dup             
		//   44   96:ldc1            #49  <String "kAPSMediaOverlayPositionLeft">
		//   45   98:bipush          7
		//   46  100:invokespecial   #28  <Method void APSMediaOverlay$APSMediaOverlayPosition(String, int)>
		//   47  103:putstatic       #51  <Field APSMediaOverlay$APSMediaOverlayPosition kAPSMediaOverlayPositionLeft>
			kAPSMediaOverlayPositionRight = new APSMediaOverlayPosition("kAPSMediaOverlayPositionRight", 8);
		//   48  106:new             #2   <Class APSMediaOverlay$APSMediaOverlayPosition>
		//   49  109:dup             
		//   50  110:ldc1            #52  <String "kAPSMediaOverlayPositionRight">
		//   51  112:bipush          8
		//   52  114:invokespecial   #28  <Method void APSMediaOverlay$APSMediaOverlayPosition(String, int)>
		//   53  117:putstatic       #54  <Field APSMediaOverlay$APSMediaOverlayPosition kAPSMediaOverlayPositionRight>
			kAPSMediaOverlayPositionUnspecified = new APSMediaOverlayPosition("kAPSMediaOverlayPositionUnspecified", 9);
		//   54  120:new             #2   <Class APSMediaOverlay$APSMediaOverlayPosition>
		//   55  123:dup             
		//   56  124:ldc1            #55  <String "kAPSMediaOverlayPositionUnspecified">
		//   57  126:bipush          9
		//   58  128:invokespecial   #28  <Method void APSMediaOverlay$APSMediaOverlayPosition(String, int)>
		//   59  131:putstatic       #57  <Field APSMediaOverlay$APSMediaOverlayPosition kAPSMediaOverlayPositionUnspecified>
			$VALUES = (new APSMediaOverlayPosition[] {
				kAPSMediaOverlayPositionFullscreen, kAPSMediaOverlayPositionBottomLeft, kAPSMediaOverlayPositionBottomRight, kAPSMediaOverlayPositionTopLeft, kAPSMediaOverlayPositionTopRight, kAPSMediaOverlayPositionTop, kAPSMediaOverlayPositionBottom, kAPSMediaOverlayPositionLeft, kAPSMediaOverlayPositionRight, kAPSMediaOverlayPositionUnspecified
			});
		//   60  134:bipush          10
		//   61  136:anewarray       APSMediaOverlayPosition[]
		//   62  139:dup             
		//   63  140:iconst_0        
		//   64  141:getstatic       #30  <Field APSMediaOverlay$APSMediaOverlayPosition kAPSMediaOverlayPositionFullscreen>
		//   65  144:aastore         
		//   66  145:dup             
		//   67  146:iconst_1        
		//   68  147:getstatic       #33  <Field APSMediaOverlay$APSMediaOverlayPosition kAPSMediaOverlayPositionBottomLeft>
		//   69  150:aastore         
		//   70  151:dup             
		//   71  152:iconst_2        
		//   72  153:getstatic       #36  <Field APSMediaOverlay$APSMediaOverlayPosition kAPSMediaOverlayPositionBottomRight>
		//   73  156:aastore         
		//   74  157:dup             
		//   75  158:iconst_3        
		//   76  159:getstatic       #39  <Field APSMediaOverlay$APSMediaOverlayPosition kAPSMediaOverlayPositionTopLeft>
		//   77  162:aastore         
		//   78  163:dup             
		//   79  164:iconst_4        
		//   80  165:getstatic       #42  <Field APSMediaOverlay$APSMediaOverlayPosition kAPSMediaOverlayPositionTopRight>
		//   81  168:aastore         
		//   82  169:dup             
		//   83  170:iconst_5        
		//   84  171:getstatic       #45  <Field APSMediaOverlay$APSMediaOverlayPosition kAPSMediaOverlayPositionTop>
		//   85  174:aastore         
		//   86  175:dup             
		//   87  176:bipush          6
		//   88  178:getstatic       #48  <Field APSMediaOverlay$APSMediaOverlayPosition kAPSMediaOverlayPositionBottom>
		//   89  181:aastore         
		//   90  182:dup             
		//   91  183:bipush          7
		//   92  185:getstatic       #51  <Field APSMediaOverlay$APSMediaOverlayPosition kAPSMediaOverlayPositionLeft>
		//   93  188:aastore         
		//   94  189:dup             
		//   95  190:bipush          8
		//   96  192:getstatic       #54  <Field APSMediaOverlay$APSMediaOverlayPosition kAPSMediaOverlayPositionRight>
		//   97  195:aastore         
		//   98  196:dup             
		//   99  197:bipush          9
		//  100  199:getstatic       #57  <Field APSMediaOverlay$APSMediaOverlayPosition kAPSMediaOverlayPositionUnspecified>
		//  101  202:aastore         
		//  102  203:putstatic       #59  <Field APSMediaOverlay$APSMediaOverlayPosition[] $VALUES>
		//* 103  206:return          
		}

		private APSMediaOverlayPosition(String s, int i)
		{
			super(s, i);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #61  <Method void Enum(String, int)>
		//    4    6:return          
		}
	}


	public APSMediaOverlay()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #57  <Method void APSMediaEvent()>
		repeatAfter = -1F;
	//    2    4:aload_0         
	//    3    5:ldc1            #58  <Float -1F>
	//    4    7:putfield        #60  <Field float repeatAfter>
		_startPoint = 0;
	//    5   10:aload_0         
	//    6   11:iconst_0        
	//    7   12:putfield        #63  <Field int _startPoint>
		_endPoint = 100;
	//    8   15:aload_0         
	//    9   16:bipush          100
	//   10   18:putfield        #66  <Field int _endPoint>
		_relativeEndPoint = true;
	//   11   21:aload_0         
	//   12   22:iconst_1        
	//   13   23:putfield        #69  <Field boolean _relativeEndPoint>
		position = APSMediaOverlayPosition.kAPSMediaOverlayPositionBottom;
	//   14   26:aload_0         
	//   15   27:getstatic       #72  <Field APSMediaOverlay$APSMediaOverlayPosition APSMediaOverlay$APSMediaOverlayPosition.kAPSMediaOverlayPositionBottom>
	//   16   30:putfield        #74  <Field APSMediaOverlay$APSMediaOverlayPosition position>
		width = "100%";
	//   17   33:aload_0         
	//   18   34:ldc1            #76  <String "100%">
	//   19   36:putfield        #78  <Field String width>
		height = "20%";
	//   20   39:aload_0         
	//   21   40:ldc1            #80  <String "20%">
	//   22   42:putfield        #82  <Field String height>
		shouldBeRemoved = false;
	//   23   45:aload_0         
	//   24   46:iconst_0        
	//   25   47:putfield        #84  <Field boolean shouldBeRemoved>
		metadata = new HashMap();
	//   26   50:aload_0         
	//   27   51:new             #86  <Class HashMap>
	//   28   54:dup             
	//   29   55:invokespecial   #87  <Method void HashMap()>
	//   30   58:putfield        #89  <Field HashMap metadata>
	//   31   61:return          
	}

	protected APSMediaOverlay(Parcel parcel)
	{
		super(parcel);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #92  <Method void APSMediaEvent(Parcel)>
		type = parcel.readString();
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokevirtual   #98  <Method String Parcel.readString()>
	//    6   10:putfield        #100 <Field String type>
		parameters = (HashMap)parcel.readSerializable();
	//    7   13:aload_0         
	//    8   14:aload_1         
	//    9   15:invokevirtual   #104 <Method java.io.Serializable Parcel.readSerializable()>
	//   10   18:checkcast       #86  <Class HashMap>
	//   11   21:putfield        #106 <Field HashMap parameters>
		int i = parcel.readInt();
	//   12   24:aload_1         
	//   13   25:invokevirtual   #110 <Method int Parcel.readInt()>
	//   14   28:istore_2        
		APSMediaOverlayPosition apsmediaoverlayposition;
		if(i == -1)
	//*  15   29:iload_2         
	//*  16   30:iconst_m1       
	//*  17   31:icmpne          40
			apsmediaoverlayposition = null;
	//   18   34:aconst_null     
	//   19   35:astore          4
		else
	//*  20   37:goto            47
			apsmediaoverlayposition = APSMediaOverlayPosition.values()[i];
	//   21   40:invokestatic    #114 <Method APSMediaOverlay$APSMediaOverlayPosition[] APSMediaOverlay$APSMediaOverlayPosition.values()>
	//   22   43:iload_2         
	//   23   44:aaload          
	//   24   45:astore          4
		position = apsmediaoverlayposition;
	//   25   47:aload_0         
	//   26   48:aload           4
	//   27   50:putfield        #74  <Field APSMediaOverlay$APSMediaOverlayPosition position>
		controller = null;
	//   28   53:aload_0         
	//   29   54:aconst_null     
	//   30   55:putfield        #116 <Field APSMediaPlayerOverlayController controller>
		zIndex = parcel.readInt();
	//   31   58:aload_0         
	//   32   59:aload_1         
	//   33   60:invokevirtual   #110 <Method int Parcel.readInt()>
	//   34   63:putfield        #118 <Field int zIndex>
		width = parcel.readString();
	//   35   66:aload_0         
	//   36   67:aload_1         
	//   37   68:invokevirtual   #98  <Method String Parcel.readString()>
	//   38   71:putfield        #78  <Field String width>
		height = parcel.readString();
	//   39   74:aload_0         
	//   40   75:aload_1         
	//   41   76:invokevirtual   #98  <Method String Parcel.readString()>
	//   42   79:putfield        #82  <Field String height>
		absoluteOffsetX = parcel.readString();
	//   43   82:aload_0         
	//   44   83:aload_1         
	//   45   84:invokevirtual   #98  <Method String Parcel.readString()>
	//   46   87:putfield        #120 <Field String absoluteOffsetX>
		absoluteOffsetY = parcel.readString();
	//   47   90:aload_0         
	//   48   91:aload_1         
	//   49   92:invokevirtual   #98  <Method String Parcel.readString()>
	//   50   95:putfield        #122 <Field String absoluteOffsetY>
		fadeInDuration = parcel.readFloat();
	//   51   98:aload_0         
	//   52   99:aload_1         
	//   53  100:invokevirtual   #126 <Method float Parcel.readFloat()>
	//   54  103:putfield        #128 <Field float fadeInDuration>
		repeatAfter = parcel.readFloat();
	//   55  106:aload_0         
	//   56  107:aload_1         
	//   57  108:invokevirtual   #126 <Method float Parcel.readFloat()>
	//   58  111:putfield        #60  <Field float repeatAfter>
		boolean flag;
		if(parcel.readByte() != 0)
	//*  59  114:aload_1         
	//*  60  115:invokevirtual   #132 <Method byte Parcel.readByte()>
	//*  61  118:ifeq            126
			flag = true;
	//   62  121:iconst_1        
	//   63  122:istore_3        
		else
	//*  64  123:goto            128
			flag = false;
	//   65  126:iconst_0        
	//   66  127:istore_3        
		shouldBeRemoved = flag;
	//   67  128:aload_0         
	//   68  129:iload_3         
	//   69  130:putfield        #84  <Field boolean shouldBeRemoved>
		parentUnit = (APSMediaUnit)parcel.readParcelable(((Class) (com/appscend/media/events/APSMediaUnit)).getClassLoader());
	//   70  133:aload_0         
	//   71  134:aload_1         
	//   72  135:ldc1            #134 <Class APSMediaUnit>
	//   73  137:invokevirtual   #140 <Method ClassLoader Class.getClassLoader()>
	//   74  140:invokevirtual   #144 <Method android.os.Parcelable Parcel.readParcelable(ClassLoader)>
	//   75  143:checkcast       #134 <Class APSMediaUnit>
	//   76  146:putfield        #146 <Field APSMediaUnit parentUnit>
		metadata = (HashMap)parcel.readSerializable();
	//   77  149:aload_0         
	//   78  150:aload_1         
	//   79  151:invokevirtual   #104 <Method java.io.Serializable Parcel.readSerializable()>
	//   80  154:checkcast       #86  <Class HashMap>
	//   81  157:putfield        #89  <Field HashMap metadata>
	//   82  160:return          
	}

	public APSMediaOverlay cloneOverlay()
	{
		APSMediaOverlay apsmediaoverlay = new APSMediaOverlay();
	//    0    0:new             #2   <Class APSMediaOverlay>
	//    1    3:dup             
	//    2    4:invokespecial   #149 <Method void APSMediaOverlay()>
	//    3    7:astore_1        
		apsmediaoverlay.type = new String(type);
	//    4    8:aload_1         
	//    5    9:new             #151 <Class String>
	//    6   12:dup             
	//    7   13:aload_0         
	//    8   14:getfield        #100 <Field String type>
	//    9   17:invokespecial   #154 <Method void String(String)>
	//   10   20:putfield        #100 <Field String type>
		apsmediaoverlay.parameters = new HashMap(((java.util.Map) (parameters)));
	//   11   23:aload_1         
	//   12   24:new             #86  <Class HashMap>
	//   13   27:dup             
	//   14   28:aload_0         
	//   15   29:getfield        #106 <Field HashMap parameters>
	//   16   32:invokespecial   #157 <Method void HashMap(java.util.Map)>
	//   17   35:putfield        #106 <Field HashMap parameters>
		apsmediaoverlay.position = position;
	//   18   38:aload_1         
	//   19   39:aload_0         
	//   20   40:getfield        #74  <Field APSMediaOverlay$APSMediaOverlayPosition position>
	//   21   43:putfield        #74  <Field APSMediaOverlay$APSMediaOverlayPosition position>
		apsmediaoverlay.zIndex = zIndex;
	//   22   46:aload_1         
	//   23   47:aload_0         
	//   24   48:getfield        #118 <Field int zIndex>
	//   25   51:putfield        #118 <Field int zIndex>
		apsmediaoverlay.width = width;
	//   26   54:aload_1         
	//   27   55:aload_0         
	//   28   56:getfield        #78  <Field String width>
	//   29   59:putfield        #78  <Field String width>
		apsmediaoverlay.height = height;
	//   30   62:aload_1         
	//   31   63:aload_0         
	//   32   64:getfield        #82  <Field String height>
	//   33   67:putfield        #82  <Field String height>
		apsmediaoverlay.absoluteOffsetX = absoluteOffsetX;
	//   34   70:aload_1         
	//   35   71:aload_0         
	//   36   72:getfield        #120 <Field String absoluteOffsetX>
	//   37   75:putfield        #120 <Field String absoluteOffsetX>
		apsmediaoverlay.absoluteOffsetY = absoluteOffsetY;
	//   38   78:aload_1         
	//   39   79:aload_0         
	//   40   80:getfield        #122 <Field String absoluteOffsetY>
	//   41   83:putfield        #122 <Field String absoluteOffsetY>
		apsmediaoverlay.fadeInDuration = fadeInDuration;
	//   42   86:aload_1         
	//   43   87:aload_0         
	//   44   88:getfield        #128 <Field float fadeInDuration>
	//   45   91:putfield        #128 <Field float fadeInDuration>
		if(trackingURLs != null)
	//*  46   94:aload_0         
	//*  47   95:getfield        #160 <Field HashMap trackingURLs>
	//*  48   98:ifnull          116
			apsmediaoverlay.trackingURLs = new HashMap(((java.util.Map) (trackingURLs)));
	//   49  101:aload_1         
	//   50  102:new             #86  <Class HashMap>
	//   51  105:dup             
	//   52  106:aload_0         
	//   53  107:getfield        #160 <Field HashMap trackingURLs>
	//   54  110:invokespecial   #157 <Method void HashMap(java.util.Map)>
	//   55  113:putfield        #160 <Field HashMap trackingURLs>
		apsmediaoverlay.repeatAfter = repeatAfter;
	//   56  116:aload_1         
	//   57  117:aload_0         
	//   58  118:getfield        #60  <Field float repeatAfter>
	//   59  121:putfield        #60  <Field float repeatAfter>
		apsmediaoverlay.metadata = metadata;
	//   60  124:aload_1         
	//   61  125:aload_0         
	//   62  126:getfield        #89  <Field HashMap metadata>
	//   63  129:putfield        #89  <Field HashMap metadata>
		apsmediaoverlay.setStartPoint(Integer.toString(_startPoint));
	//   64  132:aload_1         
	//   65  133:aload_0         
	//   66  134:getfield        #63  <Field int _startPoint>
	//   67  137:invokestatic    #166 <Method String Integer.toString(int)>
	//   68  140:invokevirtual   #169 <Method void setStartPoint(String)>
		apsmediaoverlay.setEndPoint(Integer.toString(_endPoint));
	//   69  143:aload_1         
	//   70  144:aload_0         
	//   71  145:getfield        #66  <Field int _endPoint>
	//   72  148:invokestatic    #166 <Method String Integer.toString(int)>
	//   73  151:invokevirtual   #172 <Method void setEndPoint(String)>
		return apsmediaoverlay;
	//   74  154:aload_1         
	//   75  155:areturn         
	}

	public void computeDimensions()
	{
		boolean flag = width.contains("%");
	//    0    0:aload_0         
	//    1    1:getfield        #78  <Field String width>
	//    2    4:ldc1            #175 <String "%">
	//    3    6:invokevirtual   #179 <Method boolean String.contains(CharSequence)>
	//    4    9:istore          4
		float f = -1F;
	//    5   11:ldc1            #58  <Float -1F>
	//    6   13:fstore_1        
		int i;
		if(flag)
	//*   7   14:iload           4
	//*   8   16:ifeq            45
			i = ((int)Float.parseFloat(width.replace("%", "")) * VPUtilities.getWidth()) / 100;
	//    9   19:aload_0         
	//   10   20:getfield        #78  <Field String width>
	//   11   23:ldc1            #175 <String "%">
	//   12   25:ldc1            #181 <String "">
	//   13   27:invokevirtual   #185 <Method String String.replace(CharSequence, CharSequence)>
	//   14   30:invokestatic    #191 <Method float Float.parseFloat(String)>
	//   15   33:f2i             
	//   16   34:invokestatic    #196 <Method int VPUtilities.getWidth()>
	//   17   37:imul            
	//   18   38:bipush          100
	//   19   40:idiv            
	//   20   41:istore_2        
		else
	//*  21   42:goto            85
		if(width.contains("h"))
	//*  22   45:aload_0         
	//*  23   46:getfield        #78  <Field String width>
	//*  24   49:ldc1            #198 <String "h">
	//*  25   51:invokevirtual   #179 <Method boolean String.contains(CharSequence)>
	//*  26   54:ifeq            77
		{
			f = Float.parseFloat(width.replace("h", ""));
	//   27   57:aload_0         
	//   28   58:getfield        #78  <Field String width>
	//   29   61:ldc1            #198 <String "h">
	//   30   63:ldc1            #181 <String "">
	//   31   65:invokevirtual   #185 <Method String String.replace(CharSequence, CharSequence)>
	//   32   68:invokestatic    #191 <Method float Float.parseFloat(String)>
	//   33   71:fstore_1        
			i = 0;
	//   34   72:iconst_0        
	//   35   73:istore_2        
		} else
	//*  36   74:goto            85
		{
			i = Integer.parseInt(width);
	//   37   77:aload_0         
	//   38   78:getfield        #78  <Field String width>
	//   39   81:invokestatic    #202 <Method int Integer.parseInt(String)>
	//   40   84:istore_2        
		}
		int j;
		if(height.contains("%"))
	//*  41   85:aload_0         
	//*  42   86:getfield        #82  <Field String height>
	//*  43   89:ldc1            #175 <String "%">
	//*  44   91:invokevirtual   #179 <Method boolean String.contains(CharSequence)>
	//*  45   94:ifeq            123
			j = ((int)Float.parseFloat(height.replace("%", "")) * VPUtilities.getHeight()) / 100;
	//   46   97:aload_0         
	//   47   98:getfield        #82  <Field String height>
	//   48  101:ldc1            #175 <String "%">
	//   49  103:ldc1            #181 <String "">
	//   50  105:invokevirtual   #185 <Method String String.replace(CharSequence, CharSequence)>
	//   51  108:invokestatic    #191 <Method float Float.parseFloat(String)>
	//   52  111:f2i             
	//   53  112:invokestatic    #205 <Method int VPUtilities.getHeight()>
	//   54  115:imul            
	//   55  116:bipush          100
	//   56  118:idiv            
	//   57  119:istore_3        
		else
	//*  58  120:goto            169
		if(height.contains("w"))
	//*  59  123:aload_0         
	//*  60  124:getfield        #82  <Field String height>
	//*  61  127:ldc1            #207 <String "w">
	//*  62  129:invokevirtual   #179 <Method boolean String.contains(CharSequence)>
	//*  63  132:ifeq            161
			j = (int)Math.floor((float)i * Float.parseFloat(height.replace("w", "")));
	//   64  135:iload_2         
	//   65  136:i2f             
	//   66  137:aload_0         
	//   67  138:getfield        #82  <Field String height>
	//   68  141:ldc1            #207 <String "w">
	//   69  143:ldc1            #181 <String "">
	//   70  145:invokevirtual   #185 <Method String String.replace(CharSequence, CharSequence)>
	//   71  148:invokestatic    #191 <Method float Float.parseFloat(String)>
	//   72  151:fmul            
	//   73  152:f2d             
	//   74  153:invokestatic    #213 <Method double Math.floor(double)>
	//   75  156:d2i             
	//   76  157:istore_3        
		else
	//*  77  158:goto            169
			j = Integer.parseInt(height);
	//   78  161:aload_0         
	//   79  162:getfield        #82  <Field String height>
	//   80  165:invokestatic    #202 <Method int Integer.parseInt(String)>
	//   81  168:istore_3        
		if(f > 0.0F)
	//*  82  169:fload_1         
	//*  83  170:fconst_0        
	//*  84  171:fcmpl           
	//*  85  172:ifle            185
			i = (int)Math.floor(f * (float)j);
	//   86  175:fload_1         
	//   87  176:iload_3         
	//   88  177:i2f             
	//   89  178:fmul            
	//   90  179:f2d             
	//   91  180:invokestatic    #213 <Method double Math.floor(double)>
	//   92  183:d2i             
	//   93  184:istore_2        
		if(parameters == null)
	//*  94  185:aload_0         
	//*  95  186:getfield        #106 <Field HashMap parameters>
	//*  96  189:ifnonnull       203
			parameters = new HashMap();
	//   97  192:aload_0         
	//   98  193:new             #86  <Class HashMap>
	//   99  196:dup             
	//  100  197:invokespecial   #87  <Method void HashMap()>
	//  101  200:putfield        #106 <Field HashMap parameters>
		parameters.put("viewWidth", ((Object) (Integer.valueOf(i))));
	//  102  203:aload_0         
	//  103  204:getfield        #106 <Field HashMap parameters>
	//  104  207:ldc1            #215 <String "viewWidth">
	//  105  209:iload_2         
	//  106  210:invokestatic    #219 <Method Integer Integer.valueOf(int)>
	//  107  213:invokevirtual   #223 <Method Object HashMap.put(Object, Object)>
	//  108  216:pop             
		parameters.put("viewHeight", ((Object) (Integer.valueOf(j))));
	//  109  217:aload_0         
	//  110  218:getfield        #106 <Field HashMap parameters>
	//  111  221:ldc1            #225 <String "viewHeight">
	//  112  223:iload_3         
	//  113  224:invokestatic    #219 <Method Integer Integer.valueOf(int)>
	//  114  227:invokevirtual   #223 <Method Object HashMap.put(Object, Object)>
	//  115  230:pop             
	//  116  231:return          
	}

	public int describeContents()
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public void onPreload()
	{
		Exception exception;
		if(type != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #100 <Field String type>
	//*   2    4:ifnull          159
		{
			APSMediaPlayerOverlayController apsmediaplayeroverlaycontroller = (APSMediaPlayerOverlayController)APSMediaPlayer.getInstance().adapterForTypeInGroup(type, "com.appscend.mp.controllers.overlay");
	//    3    7:invokestatic    #235 <Method APSMediaPlayer APSMediaPlayer.getInstance()>
	//    4   10:aload_0         
	//    5   11:getfield        #100 <Field String type>
	//    6   14:ldc1            #237 <String "com.appscend.mp.controllers.overlay">
	//    7   16:invokevirtual   #241 <Method Object APSMediaPlayer.adapterForTypeInGroup(String, String)>
	//    8   19:checkcast       #243 <Class APSMediaPlayerOverlayController>
	//    9   22:astore_1        
			if(apsmediaplayeroverlaycontroller != null)
	//*  10   23:aload_1         
	//*  11   24:ifnull          159
			{
				try
				{
					((Object) (apsmediaplayeroverlaycontroller)).getClass().getMethod("setParentOverlay", new Class[] {
						com/appscend/media/events/APSMediaOverlay
					}).invoke(((Object) (apsmediaplayeroverlaycontroller)), new Object[] {
						this
					});
	//   12   27:aload_1         
	//   13   28:invokevirtual   #249 <Method Class Object.getClass()>
	//   14   31:ldc1            #251 <String "setParentOverlay">
	//   15   33:iconst_1        
	//   16   34:anewarray       Class[]
	//   17   37:dup             
	//   18   38:iconst_0        
	//   19   39:ldc1            #2   <Class APSMediaOverlay>
	//   20   41:aastore         
	//   21   42:invokevirtual   #255 <Method Method Class.getMethod(String, Class[])>
	//   22   45:aload_1         
	//   23   46:iconst_1        
	//   24   47:anewarray       Object[]
	//   25   50:dup             
	//   26   51:iconst_0        
	//   27   52:aload_0         
	//   28   53:aastore         
	//   29   54:invokevirtual   #261 <Method Object Method.invoke(Object, Object[])>
	//   30   57:pop             
				}
	//*  31   58:aload_0         
	//*  32   59:getfield        #89  <Field HashMap metadata>
	//*  33   62:ldc2            #263 <String "skip_tracking">
	//*  34   65:invokevirtual   #267 <Method Object HashMap.get(Object)>
	//*  35   68:ifnonnull       104
	//*  36   71:new             #269 <Class APSUsageTracker>
	//*  37   74:dup             
	//*  38   75:invokespecial   #270 <Method void APSUsageTracker()>
	//*  39   78:iconst_2        
	//*  40   79:anewarray       String[]
	//*  41   82:dup             
	//*  42   83:iconst_0        
	//*  43   84:ldc2            #272 <String "overlays.">
	//*  44   87:aastore         
	//*  45   88:dup             
	//*  46   89:iconst_1        
	//*  47   90:invokestatic    #235 <Method APSMediaPlayer APSMediaPlayer.getInstance()>
	//*  48   93:invokevirtual   #276 <Method Activity APSMediaPlayer.getActivity()>
	//*  49   96:invokevirtual   #281 <Method String Activity.getPackageName()>
	//*  50   99:aastore         
	//*  51  100:invokevirtual   #285 <Method android.os.AsyncTask APSUsageTracker.execute(Object[])>
	//*  52  103:pop             
	//*  53  104:aload_0         
	//*  54  105:invokevirtual   #287 <Method void computeDimensions()>
	//*  55  108:aload_0         
	//*  56  109:aload_1         
	//*  57  110:putfield        #116 <Field APSMediaPlayerOverlayController controller>
	//*  58  113:aload_0         
	//*  59  114:getfield        #116 <Field APSMediaPlayerOverlayController controller>
	//*  60  117:aload_0         
	//*  61  118:putfield        #291 <Field APSMediaOverlay APSMediaPlayerOverlayController.overlay>
	//*  62  121:aload_0         
	//*  63  122:getstatic       #297 <Field APSMediaEvent$APSMediaEventState APSMediaEvent$APSMediaEventState.APSMediaEventStatePreloading>
	//*  64  125:invokevirtual   #301 <Method void updateState(APSMediaEvent$APSMediaEventState)>
	//*  65  128:aload_1         
	//*  66  129:invokevirtual   #249 <Method Class Object.getClass()>
	//*  67  132:ldc2            #303 <String "preload">
	//*  68  135:iconst_0        
	//*  69  136:anewarray       Class[]
	//*  70  139:invokevirtual   #255 <Method Method Class.getMethod(String, Class[])>
	//*  71  142:aload_1         
	//*  72  143:iconst_0        
	//*  73  144:anewarray       Object[]
	//*  74  147:invokevirtual   #261 <Method Object Method.invoke(Object, Object[])>
	//*  75  150:pop             
	//*  76  151:return          
	//*  77  152:aload_0         
	//*  78  153:getstatic       #306 <Field APSMediaEvent$APSMediaEventState APSMediaEvent$APSMediaEventState.APSMediaEventStatePreloaded>
	//*  79  156:invokevirtual   #301 <Method void updateState(APSMediaEvent$APSMediaEventState)>
	//*  80  159:return          
				catch(Exception exception1) { }
	//   81  160:astore_2        
				if(metadata.get("skip_tracking") == null)
					(new APSUsageTracker()).execute(((Object []) (new String[] {
						"overlays.", APSMediaPlayer.getInstance().getActivity().getPackageName()
					})));
				computeDimensions();
				controller = apsmediaplayeroverlaycontroller;
				controller.overlay = this;
				try
				{
					updateState(APSMediaEvent.APSMediaEventState.APSMediaEventStatePreloading);
					((Object) (apsmediaplayeroverlaycontroller)).getClass().getMethod("preload", new Class[0]).invoke(((Object) (apsmediaplayeroverlaycontroller)), new Object[0]);
					return;
				}
	//*  82  161:goto            58
				// Misplaced declaration of an exception variable
				catch(Exception exception)
				{
					updateState(APSMediaEvent.APSMediaEventState.APSMediaEventStatePreloaded);
				}
			}
		}
	//*  83  164:astore_1        
	//*  84  165:goto            152
	}

	public void onTrigger()
	{
		if(type == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #100 <Field String type>
	//*   2    4:ifnonnull       60
		{
			APSMediaPlayer.getInstance().trackforEvent((ArrayList)trackingURLs.get("launch"), "empty break start", com.appscend.media.APSMediaTrackingEvents.MediaEventType.LAUNCH, ((APSMediaEvent) (this)));
	//    3    7:invokestatic    #235 <Method APSMediaPlayer APSMediaPlayer.getInstance()>
	//    4   10:aload_0         
	//    5   11:getfield        #160 <Field HashMap trackingURLs>
	//    6   14:ldc2            #309 <String "launch">
	//    7   17:invokevirtual   #267 <Method Object HashMap.get(Object)>
	//    8   20:checkcast       #311 <Class ArrayList>
	//    9   23:ldc2            #313 <String "empty break start">
	//   10   26:getstatic       #319 <Field com.appscend.media.APSMediaTrackingEvents$MediaEventType com.appscend.media.APSMediaTrackingEvents$MediaEventType.LAUNCH>
	//   11   29:aload_0         
	//   12   30:invokevirtual   #323 <Method void APSMediaPlayer.trackforEvent(ArrayList, String, com.appscend.media.APSMediaTrackingEvents$MediaEventType, APSMediaEvent)>
			APSMediaPlayer.getInstance().trackforEvent((ArrayList)trackingURLs.get("finish"), "empty break end", com.appscend.media.APSMediaTrackingEvents.MediaEventType.FINISH, ((APSMediaEvent) (this)));
	//   13   33:invokestatic    #235 <Method APSMediaPlayer APSMediaPlayer.getInstance()>
	//   14   36:aload_0         
	//   15   37:getfield        #160 <Field HashMap trackingURLs>
	//   16   40:ldc2            #325 <String "finish">
	//   17   43:invokevirtual   #267 <Method Object HashMap.get(Object)>
	//   18   46:checkcast       #311 <Class ArrayList>
	//   19   49:ldc2            #327 <String "empty break end">
	//   20   52:getstatic       #330 <Field com.appscend.media.APSMediaTrackingEvents$MediaEventType com.appscend.media.APSMediaTrackingEvents$MediaEventType.FINISH>
	//   21   55:aload_0         
	//   22   56:invokevirtual   #323 <Method void APSMediaPlayer.trackforEvent(ArrayList, String, com.appscend.media.APSMediaTrackingEvents$MediaEventType, APSMediaEvent)>
			return;
	//   23   59:return          
		}
		if(APSMediaPlayer.getInstance().getOverlayContainer() != null)
	//*  24   60:invokestatic    #235 <Method APSMediaPlayer APSMediaPlayer.getInstance()>
	//*  25   63:invokevirtual   #334 <Method RelativeLayout APSMediaPlayer.getOverlayContainer()>
	//*  26   66:ifnull          115
		{
			if(type.equals("controls"))
	//*  27   69:aload_0         
	//*  28   70:getfield        #100 <Field String type>
	//*  29   73:ldc2            #336 <String "controls">
	//*  30   76:invokevirtual   #340 <Method boolean String.equals(Object)>
	//*  31   79:ifeq            99
			{
				controller.load(APSMediaPlayer.getInstance().viewController().getContext());
	//   32   82:aload_0         
	//   33   83:getfield        #116 <Field APSMediaPlayerOverlayController controller>
	//   34   86:invokestatic    #235 <Method APSMediaPlayer APSMediaPlayer.getInstance()>
	//   35   89:invokevirtual   #344 <Method ViewGroup APSMediaPlayer.viewController()>
	//   36   92:invokevirtual   #350 <Method android.content.Context ViewGroup.getContext()>
	//   37   95:invokevirtual   #354 <Method void APSMediaPlayerOverlayController.load(android.content.Context)>
				return;
	//   38   98:return          
			}
			controller.load(APSMediaPlayer.getInstance().viewController().getContext());
	//   39   99:aload_0         
	//   40  100:getfield        #116 <Field APSMediaPlayerOverlayController controller>
	//   41  103:invokestatic    #235 <Method APSMediaPlayer APSMediaPlayer.getInstance()>
	//   42  106:invokevirtual   #344 <Method ViewGroup APSMediaPlayer.viewController()>
	//   43  109:invokevirtual   #350 <Method android.content.Context ViewGroup.getContext()>
	//   44  112:invokevirtual   #354 <Method void APSMediaPlayerOverlayController.load(android.content.Context)>
		}
	//   45  115:return          
	}

	public void onUnload()
	{
		try
		{
			((Object) (controller)).getClass().getMethod("overlayWillBeRemoved", new Class[0]).invoke(((Object) (controller)), new Object[0]);
	//    0    0:aload_0         
	//    1    1:getfield        #116 <Field APSMediaPlayerOverlayController controller>
	//    2    4:invokevirtual   #249 <Method Class Object.getClass()>
	//    3    7:ldc2            #357 <String "overlayWillBeRemoved">
	//    4   10:iconst_0        
	//    5   11:anewarray       Class[]
	//    6   14:invokevirtual   #255 <Method Method Class.getMethod(String, Class[])>
	//    7   17:aload_0         
	//    8   18:getfield        #116 <Field APSMediaPlayerOverlayController controller>
	//    9   21:iconst_0        
	//   10   22:anewarray       Object[]
	//   11   25:invokevirtual   #261 <Method Object Method.invoke(Object, Object[])>
	//   12   28:pop             
		}
	//*  13   29:aload_0         
	//*  14   30:aload_0         
	//*  15   31:invokevirtual   #361 <Method void removeOverlay(APSMediaOverlay)>
	//*  16   34:return          
		catch(Exception exception) { }
	//   17   35:astore_1        
		removeOverlay(this);
	//*  18   36:goto            29
	}

	public void onUpdate()
	{
		try
		{
			((Object) (controller)).getClass().getMethod("update", new Class[0]).invoke(((Object) (controller)), new Object[0]);
	//    0    0:aload_0         
	//    1    1:getfield        #116 <Field APSMediaPlayerOverlayController controller>
	//    2    4:invokevirtual   #249 <Method Class Object.getClass()>
	//    3    7:ldc2            #364 <String "update">
	//    4   10:iconst_0        
	//    5   11:anewarray       Class[]
	//    6   14:invokevirtual   #255 <Method Method Class.getMethod(String, Class[])>
	//    7   17:aload_0         
	//    8   18:getfield        #116 <Field APSMediaPlayerOverlayController controller>
	//    9   21:iconst_0        
	//   10   22:anewarray       Object[]
	//   11   25:invokevirtual   #261 <Method Object Method.invoke(Object, Object[])>
	//   12   28:pop             
			return;
	//   13   29:return          
		}
		catch(Exception exception)
	//*  14   30:astore_1        
		{
			return;
	//   15   31:return          
		}
	}

	public void removeOverlay(final APSMediaOverlay overlay)
	{
		try
		{
			final float overlayAlpha = ((Float)((Object) (overlay.controller)).getClass().getMethod("getAlpha", new Class[0]).invoke(((Object) (overlay.controller)), new Object[0])).floatValue();
	//    0    0:aload_1         
	//    1    1:getfield        #116 <Field APSMediaPlayerOverlayController controller>
	//    2    4:invokevirtual   #249 <Method Class Object.getClass()>
	//    3    7:ldc2            #366 <String "getAlpha">
	//    4   10:iconst_0        
	//    5   11:anewarray       Class[]
	//    6   14:invokevirtual   #255 <Method Method Class.getMethod(String, Class[])>
	//    7   17:aload_1         
	//    8   18:getfield        #116 <Field APSMediaPlayerOverlayController controller>
	//    9   21:iconst_0        
	//   10   22:anewarray       Object[]
	//   11   25:invokevirtual   #261 <Method Object Method.invoke(Object, Object[])>
	//   12   28:checkcast       #187 <Class Float>
	//   13   31:invokevirtual   #369 <Method float Float.floatValue()>
	//   14   34:fstore_2        
			final Handler handler = APSMediaPlayer.getInstance().getHandler();
	//   15   35:invokestatic    #235 <Method APSMediaPlayer APSMediaPlayer.getInstance()>
	//   16   38:invokevirtual   #373 <Method Handler APSMediaPlayer.getHandler()>
	//   17   41:astore_3        
			handler.post(new Runnable() {

				public void run()
				{
					try
					{
						View view = (View)((Object) (overlay.controller)).getClass().getMethod("getView", new Class[0]).invoke(((Object) (overlay.controller)), new Object[0]);
				//    0    0:aload_0         
				//    1    1:getfield        #30  <Field APSMediaOverlay val$overlay>
				//    2    4:getfield        #45  <Field APSMediaPlayerOverlayController APSMediaOverlay.controller>
				//    3    7:invokevirtual   #49  <Method Class Object.getClass()>
				//    4   10:ldc1            #51  <String "getView">
				//    5   12:iconst_0        
				//    6   13:anewarray       Class[]
				//    7   16:invokevirtual   #57  <Method Method Class.getMethod(String, Class[])>
				//    8   19:aload_0         
				//    9   20:getfield        #30  <Field APSMediaOverlay val$overlay>
				//   10   23:getfield        #45  <Field APSMediaPlayerOverlayController APSMediaOverlay.controller>
				//   11   26:iconst_0        
				//   12   27:anewarray       Object[]
				//   13   30:invokevirtual   #63  <Method Object Method.invoke(Object, Object[])>
				//   14   33:checkcast       #65  <Class View>
				//   15   36:astore_1        
						AlphaAnimation alphaanimation = new AlphaAnimation(overlayAlpha, 0.0F);
				//   16   37:new             #67  <Class AlphaAnimation>
				//   17   40:dup             
				//   18   41:aload_0         
				//   19   42:getfield        #32  <Field float val$overlayAlpha>
				//   20   45:fconst_0        
				//   21   46:invokespecial   #70  <Method void AlphaAnimation(float, float)>
				//   22   49:astore_2        
						alphaanimation.setDuration((int)overlay.fadeInDuration * 1000);
				//   23   50:aload_2         
				//   24   51:aload_0         
				//   25   52:getfield        #30  <Field APSMediaOverlay val$overlay>
				//   26   55:getfield        #73  <Field float APSMediaOverlay.fadeInDuration>
				//   27   58:f2i             
				//   28   59:sipush          1000
				//   29   62:imul            
				//   30   63:i2l             
				//   31   64:invokevirtual   #77  <Method void AlphaAnimation.setDuration(long)>
						alphaanimation.setFillAfter(true);
				//   32   67:aload_2         
				//   33   68:iconst_1        
				//   34   69:invokevirtual   #81  <Method void AlphaAnimation.setFillAfter(boolean)>
						alphaanimation.setAnimationListener(((_cls1) (view)). new android.view.animation.Animation.AnimationListener() {

							public void onAnimationEnd(Animation animation)
							{
								if(overlay.type.equals("controls"))
							//*   0    0:aload_0         
							//*   1    1:getfield        #23  <Field APSMediaOverlay$1 this$1>
							//*   2    4:getfield        #36  <Field APSMediaOverlay APSMediaOverlay$1.val$overlay>
							//*   3    7:getfield        #42  <Field String APSMediaOverlay.type>
							//*   4   10:ldc1            #44  <String "controls">
							//*   5   12:invokevirtual   #50  <Method boolean String.equals(Object)>
							//*   6   15:ifeq            40
									handler.post(new Runnable() {

										public void run()
										{
											APSMediaPlayer.getInstance().viewController().removeView(viewToRemove);
										//    0    0:invokestatic    #30  <Method APSMediaPlayer APSMediaPlayer.getInstance()>
										//    1    3:invokevirtual   #34  <Method ViewGroup APSMediaPlayer.viewController()>
										//    2    6:aload_0         
										//    3    7:getfield        #19  <Field APSMediaOverlay$1$1 this$2>
										//    4   10:getfield        #38  <Field View APSMediaOverlay$1$1.val$viewToRemove>
										//    5   13:invokevirtual   #44  <Method void ViewGroup.removeView(View)>
										//    6   16:return          
										}

										final _cls1 this$2;

			
			{
				this$2 = _cls1.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field APSMediaOverlay$1$1 this$2>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #22  <Method void Object()>
			//    5    9:return          
			}
									}
);
							//    7   18:aload_0         
							//    8   19:getfield        #23  <Field APSMediaOverlay$1 this$1>
							//    9   22:getfield        #54  <Field Handler APSMediaOverlay$1.val$handler>
							//   10   25:new             #13  <Class APSMediaOverlay$1$1$1>
							//   11   28:dup             
							//   12   29:aload_0         
							//   13   30:invokespecial   #57  <Method void APSMediaOverlay$1$1$1(APSMediaOverlay$1$1)>
							//   14   33:invokevirtual   #63  <Method boolean Handler.post(Runnable)>
							//   15   36:pop             
								else
							//*  16   37:goto            59
									handler.post(new Runnable() {

										public void run()
										{
											APSMediaPlayer.getInstance().getOverlayContainer().removeView(viewToRemove);
										//    0    0:invokestatic    #30  <Method APSMediaPlayer APSMediaPlayer.getInstance()>
										//    1    3:invokevirtual   #34  <Method RelativeLayout APSMediaPlayer.getOverlayContainer()>
										//    2    6:aload_0         
										//    3    7:getfield        #19  <Field APSMediaOverlay$1$1 this$2>
										//    4   10:getfield        #38  <Field View APSMediaOverlay$1$1.val$viewToRemove>
										//    5   13:invokevirtual   #44  <Method void RelativeLayout.removeView(View)>
										//    6   16:return          
										}

										final _cls1 this$2;

			
			{
				this$2 = _cls1.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field APSMediaOverlay$1$1 this$2>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #22  <Method void Object()>
			//    5    9:return          
			}
									}
);
							//   17   40:aload_0         
							//   18   41:getfield        #23  <Field APSMediaOverlay$1 this$1>
							//   19   44:getfield        #54  <Field Handler APSMediaOverlay$1.val$handler>
							//   20   47:new             #15  <Class APSMediaOverlay$1$1$2>
							//   21   50:dup             
							//   22   51:aload_0         
							//   23   52:invokespecial   #64  <Method void APSMediaOverlay$1$1$2(APSMediaOverlay$1$1)>
							//   24   55:invokevirtual   #63  <Method boolean Handler.post(Runnable)>
							//   25   58:pop             
								APSMediaPlayer.getInstance().trackforEvent((ArrayList)overlay.trackingURLs.get("finish"), "finish for non-linear", com.appscend.media.APSMediaTrackingEvents.MediaEventType.FINISH, ((APSMediaEvent) (_fld0)));
							//   26   59:invokestatic    #70  <Method APSMediaPlayer APSMediaPlayer.getInstance()>
							//   27   62:aload_0         
							//   28   63:getfield        #23  <Field APSMediaOverlay$1 this$1>
							//   29   66:getfield        #36  <Field APSMediaOverlay APSMediaOverlay$1.val$overlay>
							//   30   69:getfield        #74  <Field HashMap APSMediaOverlay.trackingURLs>
							//   31   72:ldc1            #76  <String "finish">
							//   32   74:invokevirtual   #82  <Method Object HashMap.get(Object)>
							//   33   77:checkcast       #84  <Class ArrayList>
							//   34   80:ldc1            #86  <String "finish for non-linear">
							//   35   82:getstatic       #92  <Field com.appscend.media.APSMediaTrackingEvents$MediaEventType com.appscend.media.APSMediaTrackingEvents$MediaEventType.FINISH>
							//   36   85:aload_0         
							//   37   86:getfield        #23  <Field APSMediaOverlay$1 this$1>
							//   38   89:getfield        #95  <Field APSMediaOverlay APSMediaOverlay$1.this$0>
							//   39   92:invokevirtual   #99  <Method void APSMediaPlayer.trackforEvent(ArrayList, String, com.appscend.media.APSMediaTrackingEvents$MediaEventType, APSMediaEvent)>
								try
								{
									((Object) (overlay.controller)).getClass().getMethod("onDestroy", new Class[0]).invoke(((Object) (overlay.controller)), new Object[0]);
							//   40   95:aload_0         
							//   41   96:getfield        #23  <Field APSMediaOverlay$1 this$1>
							//   42   99:getfield        #36  <Field APSMediaOverlay APSMediaOverlay$1.val$overlay>
							//   43  102:getfield        #103 <Field APSMediaPlayerOverlayController APSMediaOverlay.controller>
							//   44  105:invokevirtual   #107 <Method Class Object.getClass()>
							//   45  108:ldc1            #109 <String "onDestroy">
							//   46  110:iconst_0        
							//   47  111:anewarray       Class[]
							//   48  114:invokevirtual   #115 <Method Method Class.getMethod(String, Class[])>
							//   49  117:aload_0         
							//   50  118:getfield        #23  <Field APSMediaOverlay$1 this$1>
							//   51  121:getfield        #36  <Field APSMediaOverlay APSMediaOverlay$1.val$overlay>
							//   52  124:getfield        #103 <Field APSMediaPlayerOverlayController APSMediaOverlay.controller>
							//   53  127:iconst_0        
							//   54  128:anewarray       Object[]
							//   55  131:invokevirtual   #121 <Method Object Method.invoke(Object, Object[])>
							//   56  134:pop             
									return;
							//   57  135:return          
								}
								// Misplaced declaration of an exception variable
								catch(Animation animation)
							//*  58  136:astore_1        
								{
									return;
							//   59  137:return          
								}
							}

							public void onAnimationRepeat(Animation animation)
							{
							//    0    0:return          
							}

							public void onAnimationStart(Animation animation)
							{
							//    0    0:return          
							}

							final _cls1 this$1;
							final View val$viewToRemove;

			
			{
				this$1 = final__pcls1;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #23  <Field APSMediaOverlay$1 this$1>
				viewToRemove = View.this;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #25  <Field View val$viewToRemove>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #27  <Method void Object()>
			//    8   14:return          
			}
						}
);
				//   35   72:aload_2         
				//   36   73:new             #13  <Class APSMediaOverlay$1$1>
				//   37   76:dup             
				//   38   77:aload_0         
				//   39   78:aload_1         
				//   40   79:invokespecial   #84  <Method void APSMediaOverlay$1$1(APSMediaOverlay$1, View)>
				//   41   82:invokevirtual   #88  <Method void AlphaAnimation.setAnimationListener(android.view.animation.Animation$AnimationListener)>
						view.startAnimation(((Animation) (alphaanimation)));
				//   42   85:aload_1         
				//   43   86:aload_2         
				//   44   87:invokevirtual   #92  <Method void View.startAnimation(Animation)>
						return;
				//   45   90:return          
					}
					catch(Exception exception)
				//*  46   91:astore_1        
					{
						return;
				//   47   92:return          
					}
				}

				final APSMediaOverlay this$0;
				final Handler val$handler;
				final APSMediaOverlay val$overlay;
				final float val$overlayAlpha;

			
			{
				this$0 = APSMediaOverlay.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #28  <Field APSMediaOverlay this$0>
				overlay = apsmediaoverlay1;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #30  <Field APSMediaOverlay val$overlay>
				overlayAlpha = f;
			//    6   10:aload_0         
			//    7   11:fload_3         
			//    8   12:putfield        #32  <Field float val$overlayAlpha>
				handler = handler1;
			//    9   15:aload_0         
			//   10   16:aload           4
			//   11   18:putfield        #34  <Field Handler val$handler>
				super();
			//   12   21:aload_0         
			//   13   22:invokespecial   #37  <Method void Object()>
			//   14   25:return          
			}
			}
);
	//   18   42:aload_3         
	//   19   43:new             #8   <Class APSMediaOverlay$1>
	//   20   46:dup             
	//   21   47:aload_0         
	//   22   48:aload_1         
	//   23   49:fload_2         
	//   24   50:aload_3         
	//   25   51:invokespecial   #376 <Method void APSMediaOverlay$1(APSMediaOverlay, APSMediaOverlay, float, Handler)>
	//   26   54:invokevirtual   #382 <Method boolean Handler.post(Runnable)>
	//   27   57:pop             
			return;
	//   28   58:return          
		}
		// Misplaced declaration of an exception variable
		catch(final APSMediaOverlay overlay)
	//*  29   59:astore_1        
		{
			return;
	//   30   60:return          
		}
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e1expr(TypeTransformer.java:496)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:713)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:698)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
	//    0    0:new             #386 <Class RuntimeException>
	//    1    3:dup             
	//    2    4:ldc2            #388 <String "d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e1expr(TypeTransformer.java:496)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:713)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:698)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n">
	//    3    7:invokespecial   #391 <Method void Runtime(String)>
	//    4   10:athrow          
	}

	public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

		public APSMediaOverlay createFromParcel(Parcel parcel)
		{
			return new APSMediaOverlay(parcel);
		//    0    0:new             #9   <Class APSMediaOverlay>
		//    1    3:dup             
		//    2    4:aload_1         
		//    3    5:invokespecial   #19  <Method void APSMediaOverlay(Parcel)>
		//    4    8:areturn         
		}

		public volatile Object createFromParcel(Parcel parcel)
		{
			return ((Object) (createFromParcel(parcel)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #22  <Method APSMediaOverlay createFromParcel(Parcel)>
		//    3    5:areturn         
		}

		public APSMediaOverlay[] newArray(int i)
		{
			return new APSMediaOverlay[i];
		//    0    0:iload_1         
		//    1    1:anewarray       APSMediaOverlay[]
		//    2    4:areturn         
		}

		public volatile Object[] newArray(int i)
		{
			return ((Object []) (newArray(i)));
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:invokevirtual   #27  <Method APSMediaOverlay[] newArray(int)>
		//    3    5:areturn         
		}

	}
;
	public static final String kAPSMetadataType = "aps_meta_type";
	public String absoluteOffsetX;
	public String absoluteOffsetY;
	public APSMediaPlayerOverlayController controller;
	public float fadeInDuration;
	public String height;
	public HashMap metadata;
	public HashMap parameters;
	public APSMediaUnit parentUnit;
	public APSMediaOverlayPosition position;
	public float repeatAfter;
	public boolean shouldBeRemoved;
	public String type;
	public String width;
	public int zIndex;

	static 
	{
	//    0    0:new             #16  <Class APSMediaOverlay$2>
	//    1    3:dup             
	//    2    4:invokespecial   #53  <Method void APSMediaOverlay$2()>
	//    3    7:putstatic       #55  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}

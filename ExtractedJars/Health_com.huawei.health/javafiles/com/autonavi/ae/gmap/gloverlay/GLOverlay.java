// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.autonavi.ae.gmap.gloverlay;

import com.amap.api.mapcore.util.s;
import com.autonavi.ae.gmap.GLMapEngine;

// Referenced classes of package com.autonavi.ae.gmap.gloverlay:
//			GLOverlayBundle

public abstract class GLOverlay
{
	public static final class EAMapOverlayTpye extends Enum
	{

		public static EAMapOverlayTpye valueOf(String s1)
		{
			return (EAMapOverlayTpye)Enum.valueOf(com/autonavi/ae/gmap/gloverlay/GLOverlay$EAMapOverlayTpye, s1);
		//    0    0:ldc1            #2   <Class GLOverlay$EAMapOverlayTpye>
		//    1    2:aload_0         
		//    2    3:invokestatic    #79  <Method Enum Enum.valueOf(Class, String)>
		//    3    6:checkcast       #2   <Class GLOverlay$EAMapOverlayTpye>
		//    4    9:areturn         
		}

		public static EAMapOverlayTpye[] values()
		{
			return (EAMapOverlayTpye[])((EAMapOverlayTpye []) ($VALUES)).clone();
		//    0    0:getstatic       #71  <Field GLOverlay$EAMapOverlayTpye[] $VALUES>
		//    1    3:invokevirtual   #86  <Method Object _5B_Lcom.autonavi.ae.gmap.gloverlay.GLOverlay$EAMapOverlayTpye_3B_.clone()>
		//    2    6:checkcast       #82  <Class GLOverlay$EAMapOverlayTpye[]>
		//    3    9:areturn         
		}

		private static final EAMapOverlayTpye $VALUES[];
		public static final EAMapOverlayTpye AMAPOVERLAY_ARC;
		public static final EAMapOverlayTpye AMAPOVERLAY_ARROW;
		public static final EAMapOverlayTpye AMAPOVERLAY_GPS;
		public static final EAMapOverlayTpye AMAPOVERLAY_MODEL;
		public static final EAMapOverlayTpye AMAPOVERLAY_NAVI;
		public static final EAMapOverlayTpye AMAPOVERLAY_PLANE;
		public static final EAMapOverlayTpye AMAPOVERLAY_POINT;
		public static final EAMapOverlayTpye AMAPOVERLAY_POLYGON;
		public static final EAMapOverlayTpye AMAPOVERLAY_POLYLINE;
		public static final EAMapOverlayTpye AMAPOVERLAY_RCTROUTE;
		public static final EAMapOverlayTpye AMAPOVERLAY_ROUTE;
		public static final EAMapOverlayTpye AMAPOVERLAY_VECTOR;
		public static final EAMapOverlayTpye AMAPOVERLAY_WATERWAVE;

		static 
		{
			AMAPOVERLAY_POINT = new EAMapOverlayTpye("AMAPOVERLAY_POINT", 0);
		//    0    0:new             #2   <Class GLOverlay$EAMapOverlayTpye>
		//    1    3:dup             
		//    2    4:ldc1            #27  <String "AMAPOVERLAY_POINT">
		//    3    6:iconst_0        
		//    4    7:invokespecial   #31  <Method void GLOverlay$EAMapOverlayTpye(String, int)>
		//    5   10:putstatic       #33  <Field GLOverlay$EAMapOverlayTpye AMAPOVERLAY_POINT>
			AMAPOVERLAY_POLYLINE = new EAMapOverlayTpye("AMAPOVERLAY_POLYLINE", 1);
		//    6   13:new             #2   <Class GLOverlay$EAMapOverlayTpye>
		//    7   16:dup             
		//    8   17:ldc1            #34  <String "AMAPOVERLAY_POLYLINE">
		//    9   19:iconst_1        
		//   10   20:invokespecial   #31  <Method void GLOverlay$EAMapOverlayTpye(String, int)>
		//   11   23:putstatic       #36  <Field GLOverlay$EAMapOverlayTpye AMAPOVERLAY_POLYLINE>
			AMAPOVERLAY_POLYGON = new EAMapOverlayTpye("AMAPOVERLAY_POLYGON", 2);
		//   12   26:new             #2   <Class GLOverlay$EAMapOverlayTpye>
		//   13   29:dup             
		//   14   30:ldc1            #37  <String "AMAPOVERLAY_POLYGON">
		//   15   32:iconst_2        
		//   16   33:invokespecial   #31  <Method void GLOverlay$EAMapOverlayTpye(String, int)>
		//   17   36:putstatic       #39  <Field GLOverlay$EAMapOverlayTpye AMAPOVERLAY_POLYGON>
			AMAPOVERLAY_NAVI = new EAMapOverlayTpye("AMAPOVERLAY_NAVI", 3);
		//   18   39:new             #2   <Class GLOverlay$EAMapOverlayTpye>
		//   19   42:dup             
		//   20   43:ldc1            #40  <String "AMAPOVERLAY_NAVI">
		//   21   45:iconst_3        
		//   22   46:invokespecial   #31  <Method void GLOverlay$EAMapOverlayTpye(String, int)>
		//   23   49:putstatic       #42  <Field GLOverlay$EAMapOverlayTpye AMAPOVERLAY_NAVI>
			AMAPOVERLAY_GPS = new EAMapOverlayTpye("AMAPOVERLAY_GPS", 4);
		//   24   52:new             #2   <Class GLOverlay$EAMapOverlayTpye>
		//   25   55:dup             
		//   26   56:ldc1            #43  <String "AMAPOVERLAY_GPS">
		//   27   58:iconst_4        
		//   28   59:invokespecial   #31  <Method void GLOverlay$EAMapOverlayTpye(String, int)>
		//   29   62:putstatic       #45  <Field GLOverlay$EAMapOverlayTpye AMAPOVERLAY_GPS>
			AMAPOVERLAY_ARC = new EAMapOverlayTpye("AMAPOVERLAY_ARC", 5);
		//   30   65:new             #2   <Class GLOverlay$EAMapOverlayTpye>
		//   31   68:dup             
		//   32   69:ldc1            #46  <String "AMAPOVERLAY_ARC">
		//   33   71:iconst_5        
		//   34   72:invokespecial   #31  <Method void GLOverlay$EAMapOverlayTpye(String, int)>
		//   35   75:putstatic       #48  <Field GLOverlay$EAMapOverlayTpye AMAPOVERLAY_ARC>
			AMAPOVERLAY_ARROW = new EAMapOverlayTpye("AMAPOVERLAY_ARROW", 6);
		//   36   78:new             #2   <Class GLOverlay$EAMapOverlayTpye>
		//   37   81:dup             
		//   38   82:ldc1            #49  <String "AMAPOVERLAY_ARROW">
		//   39   84:bipush          6
		//   40   86:invokespecial   #31  <Method void GLOverlay$EAMapOverlayTpye(String, int)>
		//   41   89:putstatic       #51  <Field GLOverlay$EAMapOverlayTpye AMAPOVERLAY_ARROW>
			AMAPOVERLAY_VECTOR = new EAMapOverlayTpye("AMAPOVERLAY_VECTOR", 7);
		//   42   92:new             #2   <Class GLOverlay$EAMapOverlayTpye>
		//   43   95:dup             
		//   44   96:ldc1            #52  <String "AMAPOVERLAY_VECTOR">
		//   45   98:bipush          7
		//   46  100:invokespecial   #31  <Method void GLOverlay$EAMapOverlayTpye(String, int)>
		//   47  103:putstatic       #54  <Field GLOverlay$EAMapOverlayTpye AMAPOVERLAY_VECTOR>
			AMAPOVERLAY_MODEL = new EAMapOverlayTpye("AMAPOVERLAY_MODEL", 8);
		//   48  106:new             #2   <Class GLOverlay$EAMapOverlayTpye>
		//   49  109:dup             
		//   50  110:ldc1            #55  <String "AMAPOVERLAY_MODEL">
		//   51  112:bipush          8
		//   52  114:invokespecial   #31  <Method void GLOverlay$EAMapOverlayTpye(String, int)>
		//   53  117:putstatic       #57  <Field GLOverlay$EAMapOverlayTpye AMAPOVERLAY_MODEL>
			AMAPOVERLAY_RCTROUTE = new EAMapOverlayTpye("AMAPOVERLAY_RCTROUTE", 9);
		//   54  120:new             #2   <Class GLOverlay$EAMapOverlayTpye>
		//   55  123:dup             
		//   56  124:ldc1            #58  <String "AMAPOVERLAY_RCTROUTE">
		//   57  126:bipush          9
		//   58  128:invokespecial   #31  <Method void GLOverlay$EAMapOverlayTpye(String, int)>
		//   59  131:putstatic       #60  <Field GLOverlay$EAMapOverlayTpye AMAPOVERLAY_RCTROUTE>
			AMAPOVERLAY_ROUTE = new EAMapOverlayTpye("AMAPOVERLAY_ROUTE", 10);
		//   60  134:new             #2   <Class GLOverlay$EAMapOverlayTpye>
		//   61  137:dup             
		//   62  138:ldc1            #61  <String "AMAPOVERLAY_ROUTE">
		//   63  140:bipush          10
		//   64  142:invokespecial   #31  <Method void GLOverlay$EAMapOverlayTpye(String, int)>
		//   65  145:putstatic       #63  <Field GLOverlay$EAMapOverlayTpye AMAPOVERLAY_ROUTE>
			AMAPOVERLAY_WATERWAVE = new EAMapOverlayTpye("AMAPOVERLAY_WATERWAVE", 11);
		//   66  148:new             #2   <Class GLOverlay$EAMapOverlayTpye>
		//   67  151:dup             
		//   68  152:ldc1            #64  <String "AMAPOVERLAY_WATERWAVE">
		//   69  154:bipush          11
		//   70  156:invokespecial   #31  <Method void GLOverlay$EAMapOverlayTpye(String, int)>
		//   71  159:putstatic       #66  <Field GLOverlay$EAMapOverlayTpye AMAPOVERLAY_WATERWAVE>
			AMAPOVERLAY_PLANE = new EAMapOverlayTpye("AMAPOVERLAY_PLANE", 12);
		//   72  162:new             #2   <Class GLOverlay$EAMapOverlayTpye>
		//   73  165:dup             
		//   74  166:ldc1            #67  <String "AMAPOVERLAY_PLANE">
		//   75  168:bipush          12
		//   76  170:invokespecial   #31  <Method void GLOverlay$EAMapOverlayTpye(String, int)>
		//   77  173:putstatic       #69  <Field GLOverlay$EAMapOverlayTpye AMAPOVERLAY_PLANE>
			$VALUES = (new EAMapOverlayTpye[] {
				AMAPOVERLAY_POINT, AMAPOVERLAY_POLYLINE, AMAPOVERLAY_POLYGON, AMAPOVERLAY_NAVI, AMAPOVERLAY_GPS, AMAPOVERLAY_ARC, AMAPOVERLAY_ARROW, AMAPOVERLAY_VECTOR, AMAPOVERLAY_MODEL, AMAPOVERLAY_RCTROUTE, 
				AMAPOVERLAY_ROUTE, AMAPOVERLAY_WATERWAVE, AMAPOVERLAY_PLANE
			});
		//   78  176:bipush          13
		//   79  178:anewarray       EAMapOverlayTpye[]
		//   80  181:dup             
		//   81  182:iconst_0        
		//   82  183:getstatic       #33  <Field GLOverlay$EAMapOverlayTpye AMAPOVERLAY_POINT>
		//   83  186:aastore         
		//   84  187:dup             
		//   85  188:iconst_1        
		//   86  189:getstatic       #36  <Field GLOverlay$EAMapOverlayTpye AMAPOVERLAY_POLYLINE>
		//   87  192:aastore         
		//   88  193:dup             
		//   89  194:iconst_2        
		//   90  195:getstatic       #39  <Field GLOverlay$EAMapOverlayTpye AMAPOVERLAY_POLYGON>
		//   91  198:aastore         
		//   92  199:dup             
		//   93  200:iconst_3        
		//   94  201:getstatic       #42  <Field GLOverlay$EAMapOverlayTpye AMAPOVERLAY_NAVI>
		//   95  204:aastore         
		//   96  205:dup             
		//   97  206:iconst_4        
		//   98  207:getstatic       #45  <Field GLOverlay$EAMapOverlayTpye AMAPOVERLAY_GPS>
		//   99  210:aastore         
		//  100  211:dup             
		//  101  212:iconst_5        
		//  102  213:getstatic       #48  <Field GLOverlay$EAMapOverlayTpye AMAPOVERLAY_ARC>
		//  103  216:aastore         
		//  104  217:dup             
		//  105  218:bipush          6
		//  106  220:getstatic       #51  <Field GLOverlay$EAMapOverlayTpye AMAPOVERLAY_ARROW>
		//  107  223:aastore         
		//  108  224:dup             
		//  109  225:bipush          7
		//  110  227:getstatic       #54  <Field GLOverlay$EAMapOverlayTpye AMAPOVERLAY_VECTOR>
		//  111  230:aastore         
		//  112  231:dup             
		//  113  232:bipush          8
		//  114  234:getstatic       #57  <Field GLOverlay$EAMapOverlayTpye AMAPOVERLAY_MODEL>
		//  115  237:aastore         
		//  116  238:dup             
		//  117  239:bipush          9
		//  118  241:getstatic       #60  <Field GLOverlay$EAMapOverlayTpye AMAPOVERLAY_RCTROUTE>
		//  119  244:aastore         
		//  120  245:dup             
		//  121  246:bipush          10
		//  122  248:getstatic       #63  <Field GLOverlay$EAMapOverlayTpye AMAPOVERLAY_ROUTE>
		//  123  251:aastore         
		//  124  252:dup             
		//  125  253:bipush          11
		//  126  255:getstatic       #66  <Field GLOverlay$EAMapOverlayTpye AMAPOVERLAY_WATERWAVE>
		//  127  258:aastore         
		//  128  259:dup             
		//  129  260:bipush          12
		//  130  262:getstatic       #69  <Field GLOverlay$EAMapOverlayTpye AMAPOVERLAY_PLANE>
		//  131  265:aastore         
		//  132  266:putstatic       #71  <Field GLOverlay$EAMapOverlayTpye[] $VALUES>
		//* 133  269:return          
		}

		private EAMapOverlayTpye(String s1, int i)
		{
			super(s1, i);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #73  <Method void Enum(String, int)>
		//    4    6:return          
		}
	}


	public GLOverlay(int i, s s1, int j)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #23  <Method void Object()>
		isNightStyle = false;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #25  <Field boolean isNightStyle>
		mIsInBundle = false;
	//    5    9:aload_0         
	//    6   10:iconst_0        
	//    7   11:putfield        #27  <Field boolean mIsInBundle>
		mNativeInstance = 0L;
	//    8   14:aload_0         
	//    9   15:lconst_0        
	//   10   16:putfield        #29  <Field long mNativeInstance>
		mItemPriority = 0;
	//   11   19:aload_0         
	//   12   20:iconst_0        
	//   13   21:putfield        #31  <Field int mItemPriority>
		mEngineID = i;
	//   14   24:aload_0         
	//   15   25:iload_1         
	//   16   26:putfield        #33  <Field int mEngineID>
		mGLMapView = s1;
	//   17   29:aload_0         
	//   18   30:aload_2         
	//   19   31:putfield        #35  <Field s mGLMapView>
		mCode = j;
	//   20   34:aload_0         
	//   21   35:iload_3         
	//   22   36:putfield        #37  <Field int mCode>
		mNativeInstance = 0L;
	//   23   39:aload_0         
	//   24   40:lconst_0        
	//   25   41:putfield        #29  <Field long mNativeInstance>
		mItemPriority = 0;
	//   26   44:aload_0         
	//   27   45:iconst_0        
	//   28   46:putfield        #31  <Field int mItemPriority>
	//   29   49:return          
	}

	private static native int nativeGetCount(long l);

	private static native int nativeGetOverlayPriority(long l);

	private static native int nativeGetSubType(long l);

	private static native int nativeGetType(long l);

	private static native boolean nativeIsClickable(long l);

	private static native boolean nativeIsVisible(long l);

	private static native void nativeRemoveAll(long l);

	private static native void nativeRemoveItem(long l, int i);

	private static native void nativeSetClickable(long l, boolean flag);

	private static native void nativeSetMaxDisplayLevel(long l, float f);

	private static native void nativeSetMinDisplayLevel(long l, float f);

	private static native void nativeSetOverlayItemPriority(long l, int i);

	private static native void nativeSetOverlayOnTop(long l, boolean flag);

	private static native void nativeSetOverlayPriority(long l, int i);

	private static native void nativeSetShownMaxCount(long l, int i);

	protected static native void nativeSetVisible(long l, boolean flag);

	public void clearFocus()
	{
	//    0    0:return          
	}

	public int getCode()
	{
		return mCode;
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field int mCode>
	//    2    4:ireturn         
	}

	public boolean getIsInBundle()
	{
		return mIsInBundle;
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field boolean mIsInBundle>
	//    2    4:ireturn         
	}

	public long getNativeInstatnce()
	{
		return mNativeInstance;
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field long mNativeInstance>
	//    2    4:lreturn         
	}

	public int getOverlayPriority()
	{
		return nativeGetOverlayPriority(mNativeInstance);
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field long mNativeInstance>
	//    2    4:invokestatic    #70  <Method int nativeGetOverlayPriority(long)>
	//    3    7:ireturn         
	}

	public int getSize()
	{
		if(mNativeInstance == 0L)
	//*   0    0:aload_0         
	//*   1    1:getfield        #29  <Field long mNativeInstance>
	//*   2    4:lconst_0        
	//*   3    5:lcmp            
	//*   4    6:ifne            11
			return 0;
	//    5    9:iconst_0        
	//    6   10:ireturn         
		else
			return nativeGetCount(mNativeInstance);
	//    7   11:aload_0         
	//    8   12:getfield        #29  <Field long mNativeInstance>
	//    9   15:invokestatic    #73  <Method int nativeGetCount(long)>
	//   10   18:ireturn         
	}

	public int getSubType()
	{
		if(mNativeInstance == 0L)
	//*   0    0:aload_0         
	//*   1    1:getfield        #29  <Field long mNativeInstance>
	//*   2    4:lconst_0        
	//*   3    5:lcmp            
	//*   4    6:ifne            11
			return -1;
	//    5    9:iconst_m1       
	//    6   10:ireturn         
		else
			return nativeGetSubType(mNativeInstance);
	//    7   11:aload_0         
	//    8   12:getfield        #29  <Field long mNativeInstance>
	//    9   15:invokestatic    #76  <Method int nativeGetSubType(long)>
	//   10   18:ireturn         
	}

	public int getType()
	{
		if(mNativeInstance == 0L)
	//*   0    0:aload_0         
	//*   1    1:getfield        #29  <Field long mNativeInstance>
	//*   2    4:lconst_0        
	//*   3    5:lcmp            
	//*   4    6:ifne            11
			return -1;
	//    5    9:iconst_m1       
	//    6   10:ireturn         
		else
			return nativeGetType(mNativeInstance);
	//    7   11:aload_0         
	//    8   12:getfield        #29  <Field long mNativeInstance>
	//    9   15:invokestatic    #79  <Method int nativeGetType(long)>
	//   10   18:ireturn         
	}

	public boolean isClickable()
	{
		if(mNativeInstance == 0L)
	//*   0    0:aload_0         
	//*   1    1:getfield        #29  <Field long mNativeInstance>
	//*   2    4:lconst_0        
	//*   3    5:lcmp            
	//*   4    6:ifne            11
			return false;
	//    5    9:iconst_0        
	//    6   10:ireturn         
		else
			return nativeIsClickable(mNativeInstance);
	//    7   11:aload_0         
	//    8   12:getfield        #29  <Field long mNativeInstance>
	//    9   15:invokestatic    #82  <Method boolean nativeIsClickable(long)>
	//   10   18:ireturn         
	}

	public boolean isVisible()
	{
		if(mNativeInstance == 0L)
	//*   0    0:aload_0         
	//*   1    1:getfield        #29  <Field long mNativeInstance>
	//*   2    4:lconst_0        
	//*   3    5:lcmp            
	//*   4    6:ifne            11
			return false;
	//    5    9:iconst_0        
	//    6   10:ireturn         
		else
			return nativeIsVisible(mNativeInstance);
	//    7   11:aload_0         
	//    8   12:getfield        #29  <Field long mNativeInstance>
	//    9   15:invokestatic    #85  <Method boolean nativeIsVisible(long)>
	//   10   18:ireturn         
	}

	void releaseInstance()
	{
		if(mNativeInstance != 0L)
	//*   0    0:aload_0         
	//*   1    1:getfield        #29  <Field long mNativeInstance>
	//*   2    4:lconst_0        
	//*   3    5:lcmp            
	//*   4    6:ifeq            27
		{
			long l = mNativeInstance;
	//    5    9:aload_0         
	//    6   10:getfield        #29  <Field long mNativeInstance>
	//    7   13:lstore_1        
			mNativeInstance = 0L;
	//    8   14:aload_0         
	//    9   15:lconst_0        
	//   10   16:putfield        #29  <Field long mNativeInstance>
			GLMapEngine.destroyOverlay(mEngineID, l);
	//   11   19:aload_0         
	//   12   20:getfield        #33  <Field int mEngineID>
	//   13   23:lload_1         
	//   14   24:invokestatic    #92  <Method void GLMapEngine.destroyOverlay(int, long)>
		}
	//   15   27:return          
	}

	public void removeAll()
	{
		if(mNativeInstance == 0L)
	//*   0    0:aload_0         
	//*   1    1:getfield        #29  <Field long mNativeInstance>
	//*   2    4:lconst_0        
	//*   3    5:lcmp            
	//*   4    6:ifne            10
		{
			return;
	//    5    9:return          
		} else
		{
			nativeRemoveAll(mNativeInstance);
	//    6   10:aload_0         
	//    7   11:getfield        #29  <Field long mNativeInstance>
	//    8   14:invokestatic    #95  <Method void nativeRemoveAll(long)>
			s s1 = mGLMapView;
	//    9   17:aload_0         
	//   10   18:getfield        #35  <Field s mGLMapView>
	//   11   21:astore_1        
			return;
	//   12   22:return          
		}
	}

	public void removeItem(int i)
	{
		if(mNativeInstance == 0L)
	//*   0    0:aload_0         
	//*   1    1:getfield        #29  <Field long mNativeInstance>
	//*   2    4:lconst_0        
	//*   3    5:lcmp            
	//*   4    6:ifne            10
		{
			return;
	//    5    9:return          
		} else
		{
			nativeRemoveItem(mNativeInstance, i);
	//    6   10:aload_0         
	//    7   11:getfield        #29  <Field long mNativeInstance>
	//    8   14:iload_1         
	//    9   15:invokestatic    #99  <Method void nativeRemoveItem(long, int)>
			return;
	//   10   18:return          
		}
	}

	public void setClickable(boolean flag)
	{
		if(mNativeInstance == 0L)
	//*   0    0:aload_0         
	//*   1    1:getfield        #29  <Field long mNativeInstance>
	//*   2    4:lconst_0        
	//*   3    5:lcmp            
	//*   4    6:ifne            10
		{
			return;
	//    5    9:return          
		} else
		{
			nativeSetClickable(mNativeInstance, flag);
	//    6   10:aload_0         
	//    7   11:getfield        #29  <Field long mNativeInstance>
	//    8   14:iload_1         
	//    9   15:invokestatic    #103 <Method void nativeSetClickable(long, boolean)>
			return;
	//   10   18:return          
		}
	}

	public void setMaxCountShown(int i)
	{
		nativeSetShownMaxCount(mNativeInstance, i);
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field long mNativeInstance>
	//    2    4:iload_1         
	//    3    5:invokestatic    #106 <Method void nativeSetShownMaxCount(long, int)>
	//    4    8:return          
	}

	public void setMaxDisplayLevel(float f)
	{
		nativeSetMaxDisplayLevel(mNativeInstance, f);
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field long mNativeInstance>
	//    2    4:fload_1         
	//    3    5:invokestatic    #110 <Method void nativeSetMaxDisplayLevel(long, float)>
	//    4    8:return          
	}

	public void setMinDisplayLevel(float f)
	{
		nativeSetMinDisplayLevel(mNativeInstance, f);
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field long mNativeInstance>
	//    2    4:fload_1         
	//    3    5:invokestatic    #113 <Method void nativeSetMinDisplayLevel(long, float)>
	//    4    8:return          
	}

	public void setOverlayItemPriority(int i)
	{
		mItemPriority = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #31  <Field int mItemPriority>
	//    3    5:return          
	}

	public void setOverlayOnTop(boolean flag)
	{
		nativeSetOverlayOnTop(mNativeInstance, flag);
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field long mNativeInstance>
	//    2    4:iload_1         
	//    3    5:invokestatic    #117 <Method void nativeSetOverlayOnTop(long, boolean)>
	//    4    8:return          
	}

	public void setOverlayPriority(int i)
	{
		nativeSetOverlayPriority(mNativeInstance, i);
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field long mNativeInstance>
	//    2    4:iload_1         
	//    3    5:invokestatic    #120 <Method void nativeSetOverlayPriority(long, int)>
		if(mGLMapView != null && mGLMapView.a() != null)
	//*   4    8:aload_0         
	//*   5    9:getfield        #35  <Field s mGLMapView>
	//*   6   12:ifnull          52
	//*   7   15:aload_0         
	//*   8   16:getfield        #35  <Field s mGLMapView>
	//*   9   19:invokeinterface #126 <Method GLMapEngine s.a()>
	//*  10   24:ifnull          52
		{
			GLOverlayBundle gloverlaybundle = mGLMapView.a().getOverlayBundle(mEngineID);
	//   11   27:aload_0         
	//   12   28:getfield        #35  <Field s mGLMapView>
	//   13   31:invokeinterface #126 <Method GLMapEngine s.a()>
	//   14   36:aload_0         
	//   15   37:getfield        #33  <Field int mEngineID>
	//   16   40:invokevirtual   #130 <Method GLOverlayBundle GLMapEngine.getOverlayBundle(int)>
	//   17   43:astore_2        
			if(gloverlaybundle != null)
	//*  18   44:aload_2         
	//*  19   45:ifnull          52
				gloverlaybundle.sortOverlay();
	//   20   48:aload_2         
	//   21   49:invokevirtual   #135 <Method void GLOverlayBundle.sortOverlay()>
		}
	//   22   52:return          
	}

	public void setVisible(boolean flag)
	{
		if(mNativeInstance == 0L)
	//*   0    0:aload_0         
	//*   1    1:getfield        #29  <Field long mNativeInstance>
	//*   2    4:lconst_0        
	//*   3    5:lcmp            
	//*   4    6:ifne            10
		{
			return;
	//    5    9:return          
		} else
		{
			nativeSetVisible(mNativeInstance, flag);
	//    6   10:aload_0         
	//    7   11:getfield        #29  <Field long mNativeInstance>
	//    8   14:iload_1         
	//    9   15:invokestatic    #138 <Method void nativeSetVisible(long, boolean)>
			return;
	//   10   18:return          
		}
	}

	public void useNightStyle(boolean flag)
	{
		isNightStyle = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #25  <Field boolean isNightStyle>
	//    3    5:return          
	}

	protected boolean isNightStyle;
	protected int mCode;
	protected int mEngineID;
	protected s mGLMapView;
	boolean mIsInBundle;
	protected int mItemPriority;
	protected long mNativeInstance;
}

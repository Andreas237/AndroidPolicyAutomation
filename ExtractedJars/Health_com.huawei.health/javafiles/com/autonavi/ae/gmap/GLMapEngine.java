// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.autonavi.ae.gmap;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.os.Handler;
import android.text.TextUtils;
import com.amap.api.mapcore.util.*;
import com.autonavi.ae.gmap.gesture.EAMapPlatformGestureInfo;
import com.autonavi.ae.gmap.glanimation.AdglMapAnimFling;
import com.autonavi.ae.gmap.glanimation.AdglMapAnimGroup;
import com.autonavi.ae.gmap.glanimation.AdglMapAnimationMgr;
import com.autonavi.ae.gmap.gloverlay.GLOverlayBundle;
import com.autonavi.ae.gmap.gloverlay.GLTextureProperty;
import com.autonavi.ae.gmap.style.StyleItem;
import com.autonavi.amap.mapcore.*;
import com.autonavi.amap.mapcore.interfaces.IAMapListener;
import com.autonavi.amap.mapcore.maploader.AMapLoader;
import com.autonavi.amap.mapcore.maploader.NetworkState;
import com.autonavi.amap.mapcore.message.*;
import com.autonavi.amap.mapcore.tools.*;
import java.io.File;
import java.util.*;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

// Referenced classes of package com.autonavi.ae.gmap:
//			GLMapState

public class GLMapEngine
	implements IAMapEngineCallback, com.autonavi.amap.mapcore.maploader.NetworkState.NetworkChangeListener
{
	public static class InitParam
	{

		public String mConfigPath;
		public String mOfflineDataPath;
		public String mP3dCrossPath;
		public String mRootPath;

		public InitParam()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #16  <Method void Object()>
		//    2    4:return          
		}
	}

	public static class MapViewInitParam
	{

		public int engineId;
		public int height;
		public float mapZoomScale;
		public int screenHeight;
		public float screenScale;
		public int screenWidth;
		public float textScale;
		public int width;
		public int x;
		public int y;

		public MapViewInitParam()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #23  <Method void Object()>
		//    2    4:return          
		}
	}


	public GLMapEngine(Context context1, s s1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #70  <Method void Object()>
		mNativeMapengineInstance = 0L;
	//    2    4:aload_0         
	//    3    5:lconst_0        
	//    4    6:putfield        #72  <Field long mNativeMapengineInstance>
		mGlMapView = null;
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:putfield        #74  <Field s mGlMapView>
		mStateMessageList = ((List) (new Vector()));
	//    8   14:aload_0         
	//    9   15:new             #76  <Class Vector>
	//   10   18:dup             
	//   11   19:invokespecial   #77  <Method void Vector()>
	//   12   22:putfield        #79  <Field List mStateMessageList>
		mGestureMessageList = ((List) (new Vector()));
	//   13   25:aload_0         
	//   14   26:new             #76  <Class Vector>
	//   15   29:dup             
	//   16   30:invokespecial   #77  <Method void Vector()>
	//   17   33:putfield        #81  <Field List mGestureMessageList>
		mGestureEndMessageList = ((List) (new Vector()));
	//   18   36:aload_0         
	//   19   37:new             #76  <Class Vector>
	//   20   40:dup             
	//   21   41:invokespecial   #77  <Method void Vector()>
	//   22   44:putfield        #83  <Field List mGestureEndMessageList>
		mAnimateStateMessageList = ((List) (new Vector()));
	//   23   47:aload_0         
	//   24   48:new             #76  <Class Vector>
	//   25   51:dup             
	//   26   52:invokespecial   #77  <Method void Vector()>
	//   27   55:putfield        #85  <Field List mAnimateStateMessageList>
		isMoveCameraStep = false;
	//   28   58:aload_0         
	//   29   59:iconst_0        
	//   30   60:putfield        #87  <Field boolean isMoveCameraStep>
		isGestureStep = false;
	//   31   63:aload_0         
	//   32   64:iconst_0        
	//   33   65:putfield        #89  <Field boolean isGestureStep>
		mapGestureCount = 0;
	//   34   68:aload_0         
	//   35   69:iconst_0        
	//   36   70:putfield        #91  <Field int mapGestureCount>
		mapAnimationMgr = null;
	//   37   73:aload_0         
	//   38   74:aconst_null     
	//   39   75:putfield        #93  <Field AdglMapAnimationMgr mapAnimationMgr>
		copyGLMapState = null;
	//   40   78:aload_0         
	//   41   79:aconst_null     
	//   42   80:putfield        #95  <Field GLMapState copyGLMapState>
		mLock = ((Lock) (new ReentrantLock()));
	//   43   83:aload_0         
	//   44   84:new             #97  <Class ReentrantLock>
	//   45   87:dup             
	//   46   88:invokespecial   #98  <Method void ReentrantLock()>
	//   47   91:putfield        #100 <Field Lock mLock>
		mutLock = new Object();
	//   48   94:aload_0         
	//   49   95:new             #4   <Class Object>
	//   50   98:dup             
	//   51   99:invokespecial   #70  <Method void Object()>
	//   52  102:putfield        #102 <Field Object mutLock>
		mNetworkState = null;
	//   53  105:aload_0         
	//   54  106:aconst_null     
	//   55  107:putfield        #104 <Field NetworkState mNetworkState>
		bundle = null;
	//   56  110:aload_0         
	//   57  111:aconst_null     
	//   58  112:putfield        #106 <Field GLOverlayBundle bundle>
		isEngineRenderComplete = false;
	//   59  115:aload_0         
	//   60  116:iconst_0        
	//   61  117:putfield        #108 <Field boolean isEngineRenderComplete>
		aMapLoaderHashtable = new Hashtable();
	//   62  120:aload_0         
	//   63  121:new             #110 <Class Hashtable>
	//   64  124:dup             
	//   65  125:invokespecial   #111 <Method void Hashtable()>
	//   66  128:putfield        #113 <Field Hashtable aMapLoaderHashtable>
		mRequestDestroy = false;
	//   67  131:aload_0         
	//   68  132:iconst_0        
	//   69  133:putfield        #115 <Field boolean mRequestDestroy>
		mRequestDestroy = false;
	//   70  136:aload_0         
	//   71  137:iconst_0        
	//   72  138:putfield        #115 <Field boolean mRequestDestroy>
		if(context1 == null)
	//*  73  141:aload_1         
	//*  74  142:ifnonnull       146
		{
			return;
	//   75  145:return          
		} else
		{
			context = context1.getApplicationContext();
	//   76  146:aload_0         
	//   77  147:aload_1         
	//   78  148:invokevirtual   #121 <Method Context Context.getApplicationContext()>
	//   79  151:putfield        #123 <Field Context context>
			mGlMapView = s1;
	//   80  154:aload_0         
	//   81  155:aload_2         
	//   82  156:putfield        #74  <Field s mGlMapView>
			mTextTextureGenerator = new TextTextureGenerator();
	//   83  159:aload_0         
	//   84  160:new             #125 <Class TextTextureGenerator>
	//   85  163:dup             
	//   86  164:invokespecial   #126 <Method void TextTextureGenerator()>
	//   87  167:putfield        #128 <Field TextTextureGenerator mTextTextureGenerator>
			mapAnimationMgr = new AdglMapAnimationMgr();
	//   88  170:aload_0         
	//   89  171:new             #130 <Class AdglMapAnimationMgr>
	//   90  174:dup             
	//   91  175:invokespecial   #131 <Method void AdglMapAnimationMgr()>
	//   92  178:putfield        #93  <Field AdglMapAnimationMgr mapAnimationMgr>
			mapAnimationMgr.setMapAnimationListener(new com.autonavi.ae.gmap.glanimation.AdglMapAnimationMgr.MapAnimationListener() {

				public void onMapAnimationFinish(com.amap.api.maps.AMap.CancelableCallback cancelablecallback)
				{
					doMapAnimationFinishCallback(cancelablecallback);
				//    0    0:aload_0         
				//    1    1:getfield        #16  <Field GLMapEngine this$0>
				//    2    4:aload_1         
				//    3    5:invokestatic    #26  <Method void GLMapEngine.access$000(GLMapEngine, com.amap.api.maps.AMap$CancelableCallback)>
				//    4    8:return          
				}

				final GLMapEngine this$0;

			
			{
				this$0 = GLMapEngine.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field GLMapEngine this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
			}
);
	//   93  181:aload_0         
	//   94  182:getfield        #93  <Field AdglMapAnimationMgr mapAnimationMgr>
	//   95  185:new             #16  <Class GLMapEngine$4>
	//   96  188:dup             
	//   97  189:aload_0         
	//   98  190:invokespecial   #134 <Method void GLMapEngine$4(GLMapEngine)>
	//   99  193:invokevirtual   #138 <Method void AdglMapAnimationMgr.setMapAnimationListener(com.autonavi.ae.gmap.glanimation.AdglMapAnimationMgr$MapAnimationListener)>
			userAgent = (new StringBuilder()).append(System.getProperty("http.agent")).append(" amap/").append(GlMapUtil.getAppVersionName(context1)).toString();
	//  100  196:aload_0         
	//  101  197:new             #140 <Class StringBuilder>
	//  102  200:dup             
	//  103  201:invokespecial   #141 <Method void StringBuilder()>
	//  104  204:ldc1            #143 <String "http.agent">
	//  105  206:invokestatic    #149 <Method String System.getProperty(String)>
	//  106  209:invokevirtual   #153 <Method StringBuilder StringBuilder.append(String)>
	//  107  212:ldc1            #155 <String " amap/">
	//  108  214:invokevirtual   #153 <Method StringBuilder StringBuilder.append(String)>
	//  109  217:aload_1         
	//  110  218:invokestatic    #161 <Method String GlMapUtil.getAppVersionName(Context)>
	//  111  221:invokevirtual   #153 <Method StringBuilder StringBuilder.append(String)>
	//  112  224:invokevirtual   #165 <Method String StringBuilder.toString()>
	//  113  227:putfield        #167 <Field String userAgent>
			return;
	//  114  230:return          
		}
	}

	public static void destroyOverlay(int i, long l)
	{
		com/autonavi/ae/gmap/GLMapEngine;
	//    0    0:ldc1            #2   <Class GLMapEngine>
		JVM INSTR monitorenter ;
	//    1    2:monitorenter    
		nativeDestroyOverlay(i, l);
	//    2    3:iload_0         
	//    3    4:lload_1         
	//    4    5:invokestatic    #179 <Method void nativeDestroyOverlay(int, long)>
		com/autonavi/ae/gmap/GLMapEngine;
	//    5    8:ldc1            #2   <Class GLMapEngine>
		JVM INSTR monitorexit ;
	//    6   10:monitorexit     
		return;
	//    7   11:return          
		Exception exception;
		exception;
	//    8   12:astore_3        
	//*   9   13:ldc1            #2   <Class GLMapEngine>
		throw exception;
	//   10   15:monitorexit     
	//   11   16:aload_3         
	//   12   17:athrow          
	}

	private void doMapAnimationCancelCallback(final com.amap.api.maps.AMap.CancelableCallback cancelableCallback)
	{
		if(cancelableCallback == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       5
			return;
	//    2    4:return          
		if(mGlMapView != null)
	//*   3    5:aload_0         
	//*   4    6:getfield        #74  <Field s mGlMapView>
	//*   5    9:ifnull          34
			mGlMapView.getMainHandler().post(new Runnable() {

				public void run()
				{
					try
					{
						cancelableCallback.onCancel();
				//    0    0:aload_0         
				//    1    1:getfield        #21  <Field com.amap.api.maps.AMap$CancelableCallback val$cancelableCallback>
				//    2    4:invokeinterface #33  <Method void com.amap.api.maps.AMap$CancelableCallback.onCancel()>
						return;
				//    3    9:return          
					}
					catch(Throwable throwable)
				//*   4   10:astore_1        
					{
						throwable.printStackTrace();
				//    5   11:aload_1         
				//    6   12:invokevirtual   #36  <Method void Throwable.printStackTrace()>
					}
				//    7   15:return          
				}

				final GLMapEngine this$0;
				final com.amap.api.maps.AMap.CancelableCallback val$cancelableCallback;

			
			{
				this$0 = GLMapEngine.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field GLMapEngine this$0>
				cancelableCallback = cancelablecallback;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #21  <Field com.amap.api.maps.AMap$CancelableCallback val$cancelableCallback>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #24  <Method void Object()>
			//    8   14:return          
			}
			}
);
	//    6   12:aload_0         
	//    7   13:getfield        #74  <Field s mGlMapView>
	//    8   16:invokeinterface #186 <Method Handler s.getMainHandler()>
	//    9   21:new             #12  <Class GLMapEngine$2>
	//   10   24:dup             
	//   11   25:aload_0         
	//   12   26:aload_1         
	//   13   27:invokespecial   #188 <Method void GLMapEngine$2(GLMapEngine, com.amap.api.maps.AMap$CancelableCallback)>
	//   14   30:invokevirtual   #194 <Method boolean Handler.post(Runnable)>
	//   15   33:pop             
	//   16   34:return          
	}

	private void doMapAnimationFinishCallback(final com.amap.api.maps.AMap.CancelableCallback cancelableCallback)
	{
		if(mMapListener != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #196 <Field IAMapListener mMapListener>
	//*   2    4:ifnull          16
			mMapListener.afterAnimation();
	//    3    7:aload_0         
	//    4    8:getfield        #196 <Field IAMapListener mMapListener>
	//    5   11:invokeinterface #201 <Method void IAMapListener.afterAnimation()>
		if(cancelableCallback == null)
	//*   6   16:aload_1         
	//*   7   17:ifnonnull       21
			return;
	//    8   20:return          
		if(mGlMapView != null)
	//*   9   21:aload_0         
	//*  10   22:getfield        #74  <Field s mGlMapView>
	//*  11   25:ifnull          50
			mGlMapView.getMainHandler().post(new Runnable() {

				public void run()
				{
					try
					{
						cancelableCallback.onFinish();
				//    0    0:aload_0         
				//    1    1:getfield        #21  <Field com.amap.api.maps.AMap$CancelableCallback val$cancelableCallback>
				//    2    4:invokeinterface #33  <Method void com.amap.api.maps.AMap$CancelableCallback.onFinish()>
						return;
				//    3    9:return          
					}
					catch(Throwable throwable)
				//*   4   10:astore_1        
					{
						throwable.printStackTrace();
				//    5   11:aload_1         
				//    6   12:invokevirtual   #36  <Method void Throwable.printStackTrace()>
					}
				//    7   15:return          
				}

				final GLMapEngine this$0;
				final com.amap.api.maps.AMap.CancelableCallback val$cancelableCallback;

			
			{
				this$0 = GLMapEngine.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field GLMapEngine this$0>
				cancelableCallback = cancelablecallback;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #21  <Field com.amap.api.maps.AMap$CancelableCallback val$cancelableCallback>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #24  <Method void Object()>
			//    8   14:return          
			}
			}
);
	//   12   28:aload_0         
	//   13   29:getfield        #74  <Field s mGlMapView>
	//   14   32:invokeinterface #186 <Method Handler s.getMainHandler()>
	//   15   37:new             #14  <Class GLMapEngine$3>
	//   16   40:dup             
	//   17   41:aload_0         
	//   18   42:aload_1         
	//   19   43:invokespecial   #202 <Method void GLMapEngine$3(GLMapEngine, com.amap.api.maps.AMap$CancelableCallback)>
	//   20   46:invokevirtual   #194 <Method boolean Handler.post(Runnable)>
	//   21   49:pop             
	//   22   50:return          
	}

	private void gestureBegin()
	{
		mapGestureCount = mapGestureCount + 1;
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #91  <Field int mapGestureCount>
	//    3    5:iconst_1        
	//    4    6:iadd            
	//    5    7:putfield        #91  <Field int mapGestureCount>
	//    6   10:return          
	}

	private void gestureEnd()
	{
		mapGestureCount = mapGestureCount - 1;
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #91  <Field int mapGestureCount>
	//    3    5:iconst_1        
	//    4    6:isub            
	//    5    7:putfield        #91  <Field int mapGestureCount>
		if(mapGestureCount == 0)
	//*   6   10:aload_0         
	//*   7   11:getfield        #91  <Field int mapGestureCount>
	//*   8   14:ifne            21
			recycleMessage();
	//    9   17:aload_0         
	//   10   18:invokespecial   #207 <Method void recycleMessage()>
	//   11   21:return          
	}

	private void initAnimation()
	{
		if(mStateMessageList.size() > 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #79  <Field List mStateMessageList>
	//*   2    4:invokeinterface #214 <Method int List.size()>
	//*   3    9:ifle            13
			return;
	//    4   12:return          
		if(mAnimateStateMessageList.size() > 0)
	//*   5   13:aload_0         
	//*   6   14:getfield        #85  <Field List mAnimateStateMessageList>
	//*   7   17:invokeinterface #214 <Method int List.size()>
	//*   8   22:ifle            48
		{
			AbstractCameraUpdateMessage abstractcameraupdatemessage = (AbstractCameraUpdateMessage)mAnimateStateMessageList.remove(0);
	//    9   25:aload_0         
	//   10   26:getfield        #85  <Field List mAnimateStateMessageList>
	//   11   29:iconst_0        
	//   12   30:invokeinterface #218 <Method Object List.remove(int)>
	//   13   35:checkcast       #220 <Class AbstractCameraUpdateMessage>
	//   14   38:astore_1        
			if(abstractcameraupdatemessage != null)
	//*  15   39:aload_1         
	//*  16   40:ifnull          48
				abstractcameraupdatemessage.generateMapAnimation(this);
	//   17   43:aload_1         
	//   18   44:aload_0         
	//   19   45:invokevirtual   #223 <Method void AbstractCameraUpdateMessage.generateMapAnimation(GLMapEngine)>
		}
	//   20   48:return          
	}

	private void initNetworkState()
	{
		mNetworkState = new NetworkState();
	//    0    0:aload_0         
	//    1    1:new             #226 <Class NetworkState>
	//    2    4:dup             
	//    3    5:invokespecial   #227 <Method void NetworkState()>
	//    4    8:putfield        #104 <Field NetworkState mNetworkState>
		mNetworkState.setNetworkListener(((com.autonavi.amap.mapcore.maploader.NetworkState.NetworkChangeListener) (this)));
	//    5   11:aload_0         
	//    6   12:getfield        #104 <Field NetworkState mNetworkState>
	//    7   15:aload_0         
	//    8   16:invokevirtual   #231 <Method void NetworkState.setNetworkListener(com.autonavi.amap.mapcore.maploader.NetworkState$NetworkChangeListener)>
		mNetworkState.registerNetChangeReceiver(context.getApplicationContext(), true);
	//    9   19:aload_0         
	//   10   20:getfield        #104 <Field NetworkState mNetworkState>
	//   11   23:aload_0         
	//   12   24:getfield        #123 <Field Context context>
	//   13   27:invokevirtual   #121 <Method Context Context.getApplicationContext()>
	//   14   30:iconst_1        
	//   15   31:invokevirtual   #235 <Method void NetworkState.registerNetChangeReceiver(Context, boolean)>
		boolean flag = NetworkState.isNetworkConnected(context.getApplicationContext());
	//   16   34:aload_0         
	//   17   35:getfield        #123 <Field Context context>
	//   18   38:invokevirtual   #121 <Method Context Context.getApplicationContext()>
	//   19   41:invokestatic    #239 <Method boolean NetworkState.isNetworkConnected(Context)>
	//   20   44:istore_2        
		if(mNativeMapengineInstance != 0L)
	//*  21   45:aload_0         
	//*  22   46:getfield        #72  <Field long mNativeMapengineInstance>
	//*  23   49:lconst_0        
	//*  24   50:lcmp            
	//*  25   51:ifeq            75
		{
			long l = mNativeMapengineInstance;
	//   26   54:aload_0         
	//   27   55:getfield        #72  <Field long mNativeMapengineInstance>
	//   28   58:lstore_3        
			int i;
			if(flag)
	//*  29   59:iload_2         
	//*  30   60:ifeq            68
				i = 1;
	//   31   63:iconst_1        
	//   32   64:istore_1        
			else
	//*  33   65:goto            70
				i = 0;
	//   34   68:iconst_0        
	//   35   69:istore_1        
			nativeSetNetStatus(l, i);
	//   36   70:lload_3         
	//   37   71:iload_1         
	//   38   72:invokestatic    #243 <Method void nativeSetNetStatus(long, int)>
		}
	//   39   75:return          
	}

	private static native boolean nativeAddOverlayTexture(int i, long l, int j, int k, float f, float f1, Bitmap bitmap, 
			boolean flag, boolean flag1);

	private static native void nativeCreateAMapEngineWithFrame(long l, int i, int j, int k, int i1, int j1, int k1, 
			int l1, float f, float f1, float f2);

	private static native long nativeCreateAMapInstance(String s1, String s2, String s3);

	protected static native long nativeCreateOverlay(int i, long l, int j);

	private static native void nativeDestroy(long l);

	private static native void nativeDestroyCurrentState(long l, long l1);

	protected static native void nativeDestroyOverlay(int i, long l);

	private static native void nativeFinishDownLoad(int i, long l, long l1);

	private static native void nativeGetCurTileIDs(int i, long l, int ai[], int j);

	private static native long nativeGetCurrentMapState(int i, long l);

	private static native long nativeGetGlOverlayMgrPtr(int i, long l);

	public static native String nativeGetMapEngineVersion(int i);

	private static native int[] nativeGetMapModeState(int i, long l, boolean flag);

	private static native boolean nativeGetSrvViewStateBoolValue(int i, long l, int j);

	private static native void nativeInitAMapEngineCallback(long l, Object obj);

	private static native void nativeInitParam(String s1, String s2, String s3, String s4);

	private static native boolean nativeIsEngineCreated(long l, int i);

	private static native void nativePopRenderState(int i, long l);

	private static native void nativePostRenderAMap(long l, int i);

	private static native void nativePushRendererState(int i, long l);

	private static native void nativeReceiveNetData(int i, long l, byte abyte0[], long l1, int j);

	private static native void nativeRenderAMap(long l, int i);

	private static native void nativeSelectMapPois(int i, long l, int j, int k, int i1, byte abyte0[]);

	private static native void nativeSetBuildingEnable(int i, long l, boolean flag);

	private static native void nativeSetCustomStyleTexture(int i, long l, byte abyte0[]);

	private static native void nativeSetIndoorBuildingToBeActive(int i, long l, String s1, int j, String s2);

	private static native boolean nativeSetMapModeAndStyle(int i, long l, int ai[], boolean flag, boolean flag1, StyleItem astyleitem[]);

	private static native void nativeSetNetStatus(long l, int i);

	private static native void nativeSetParameter(int i, long l, int j, int k, int i1, int j1, int k1);

	private static native void nativeSetRenderListenerStatus(int i, long l);

	private static native void nativeSetServiceViewRect(int i, long l, int j, int k, int i1, int j1, int k1, 
			int l1);

	private static native void nativeSetSetBackgroundTexture(int i, long l, byte abyte0[]);

	private static native void nativeSetSimple3DEnable(int i, long l, boolean flag);

	private static native void nativeSetSkyTexture(int i, long l, byte abyte0[]);

	private static native void nativeSetSrvViewStateBoolValue(int i, long l, int j, boolean flag);

	private static native void nativeSetTrafficTexture(int i, long l, byte abyte0[], byte abyte1[], byte abyte2[], byte abyte3[]);

	private boolean processAnimations(GLMapState glmapstate)
	{
		if(mapAnimationMgr.getAnimationsCount() <= 0)
			break MISSING_BLOCK_LABEL_32;
	//    0    0:aload_0         
	//    1    1:getfield        #93  <Field AdglMapAnimationMgr mapAnimationMgr>
	//    2    4:invokevirtual   #309 <Method int AdglMapAnimationMgr.getAnimationsCount()>
	//    3    7:ifle            24
		glmapstate.recalculate();
	//    4   10:aload_1         
	//    5   11:invokevirtual   #314 <Method void GLMapState.recalculate()>
		mapAnimationMgr.doAnimations(glmapstate);
	//    6   14:aload_0         
	//    7   15:getfield        #93  <Field AdglMapAnimationMgr mapAnimationMgr>
	//    8   18:aload_1         
	//    9   19:invokevirtual   #318 <Method void AdglMapAnimationMgr.doAnimations(GLMapState)>
		return true;
	//   10   22:iconst_1        
	//   11   23:ireturn         
	//*  12   24:goto            32
		glmapstate;
	//   13   27:astore_1        
		((Throwable) (glmapstate)).printStackTrace();
	//   14   28:aload_1         
	//   15   29:invokevirtual   #321 <Method void Throwable.printStackTrace()>
		return false;
	//   16   32:iconst_0        
	//   17   33:ireturn         
	}

	private boolean processGestureMessage(GLMapState glmapstate)
	{
		if(mGestureMessageList.size() <= 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #81  <Field List mGestureMessageList>
	//*   2    4:invokeinterface #214 <Method int List.size()>
	//*   3    9:ifgt            26
		{
			if(isGestureStep)
	//*   4   12:aload_0         
	//*   5   13:getfield        #89  <Field boolean isGestureStep>
	//*   6   16:ifeq            24
				isGestureStep = false;
	//    7   19:aload_0         
	//    8   20:iconst_0        
	//    9   21:putfield        #89  <Field boolean isGestureStep>
			return false;
	//   10   24:iconst_0        
	//   11   25:ireturn         
		}
		isGestureStep = true;
	//   12   26:aload_0         
	//   13   27:iconst_1        
	//   14   28:putfield        #89  <Field boolean isGestureStep>
		if(glmapstate == null)
	//*  15   31:aload_1         
	//*  16   32:ifnonnull       37
			return false;
	//   17   35:iconst_0        
	//   18   36:ireturn         
		AbstractGestureMapMessage abstractgesturemapmessage;
		for(; mGestureMessageList.size() > 0; mGestureEndMessageList.add(((Object) (abstractgesturemapmessage))))
	//*  19   37:aload_0         
	//*  20   38:getfield        #81  <Field List mGestureMessageList>
	//*  21   41:invokeinterface #214 <Method int List.size()>
	//*  22   46:ifle            163
		{
			abstractgesturemapmessage = (AbstractGestureMapMessage)mGestureMessageList.remove(0);
	//   23   49:aload_0         
	//   24   50:getfield        #81  <Field List mGestureMessageList>
	//   25   53:iconst_0        
	//   26   54:invokeinterface #218 <Method Object List.remove(int)>
	//   27   59:checkcast       #324 <Class AbstractGestureMapMessage>
	//   28   62:astore_3        
			if(abstractgesturemapmessage == null)
				break;
	//   29   63:aload_3         
	//   30   64:ifnull          163
			if(abstractgesturemapmessage.width == 0)
	//*  31   67:aload_3         
	//*  32   68:getfield        #327 <Field int AbstractGestureMapMessage.width>
	//*  33   71:ifne            87
				abstractgesturemapmessage.width = mGlMapView.getMapWidth();
	//   34   74:aload_3         
	//   35   75:aload_0         
	//   36   76:getfield        #74  <Field s mGlMapView>
	//   37   79:invokeinterface #330 <Method int s.getMapWidth()>
	//   38   84:putfield        #327 <Field int AbstractGestureMapMessage.width>
			if(abstractgesturemapmessage.height == 0)
	//*  39   87:aload_3         
	//*  40   88:getfield        #333 <Field int AbstractGestureMapMessage.height>
	//*  41   91:ifne            107
				abstractgesturemapmessage.height = mGlMapView.getMapHeight();
	//   42   94:aload_3         
	//   43   95:aload_0         
	//   44   96:getfield        #74  <Field s mGlMapView>
	//   45   99:invokeinterface #336 <Method int s.getMapHeight()>
	//   46  104:putfield        #333 <Field int AbstractGestureMapMessage.height>
			int i = abstractgesturemapmessage.getMapGestureState();
	//   47  107:aload_3         
	//   48  108:invokevirtual   #339 <Method int AbstractGestureMapMessage.getMapGestureState()>
	//   49  111:istore_2        
			if(i == 100)
	//*  50  112:iload_2         
	//*  51  113:bipush          100
	//*  52  115:icmpne          125
			{
				gestureBegin();
	//   53  118:aload_0         
	//   54  119:invokespecial   #341 <Method void gestureBegin()>
				continue;
	//   55  122:goto            149
			}
			if(i == 101)
	//*  56  125:iload_2         
	//*  57  126:bipush          101
	//*  58  128:icmpne          139
			{
				abstractgesturemapmessage.runCameraUpdate(glmapstate);
	//   59  131:aload_3         
	//   60  132:aload_1         
	//   61  133:invokevirtual   #344 <Method void AbstractGestureMapMessage.runCameraUpdate(GLMapState)>
				continue;
	//   62  136:goto            149
			}
			if(i == 102)
	//*  63  139:iload_2         
	//*  64  140:bipush          102
	//*  65  142:icmpne          149
				gestureEnd();
	//   66  145:aload_0         
	//   67  146:invokespecial   #346 <Method void gestureEnd()>
		}

	//   68  149:aload_0         
	//   69  150:getfield        #83  <Field List mGestureEndMessageList>
	//   70  153:aload_3         
	//   71  154:invokeinterface #350 <Method boolean List.add(Object)>
	//   72  159:pop             
	//*  73  160:goto            37
		if(mGestureEndMessageList.size() == 1)
	//*  74  163:aload_0         
	//*  75  164:getfield        #83  <Field List mGestureEndMessageList>
	//*  76  167:invokeinterface #214 <Method int List.size()>
	//*  77  172:iconst_1        
	//*  78  173:icmpne          180
			recycleMessage();
	//   79  176:aload_0         
	//   80  177:invokespecial   #207 <Method void recycleMessage()>
		return true;
	//   81  180:iconst_1        
	//   82  181:ireturn         
	}

	private boolean processMessage()
	{
		boolean flag1;
		GLMapState glmapstate;
		glmapstate = getNewMapState(1);
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:invokevirtual   #358 <Method GLMapState getNewMapState(int)>
	//    3    5:astore_3        
		flag1 = processGestureMessage(glmapstate);
	//    4    6:aload_0         
	//    5    7:aload_3         
	//    6    8:invokespecial   #360 <Method boolean processGestureMessage(GLMapState)>
	//    7   11:istore_2        
		if(mGestureMessageList.size() > 0) goto _L2; else goto _L1
	//    8   12:aload_0         
	//    9   13:getfield        #81  <Field List mGestureMessageList>
	//   10   16:invokeinterface #214 <Method int List.size()>
	//   11   21:ifgt            39
_L1:
		if(flag1) goto _L4; else goto _L3
	//   12   24:iload_2         
	//   13   25:ifne            102
_L3:
		if(!processStateMapMessage(glmapstate)) goto _L5; else goto _L4
	//   14   28:aload_0         
	//   15   29:aload_3         
	//   16   30:invokespecial   #363 <Method boolean processStateMapMessage(GLMapState)>
	//   17   33:ifeq            107
	//*  18   36:goto            102
_L2:
		boolean flag = flag1;
	//   19   39:iload_2         
	//   20   40:istore_1        
		if(mStateMessageList.size() <= 0)
			break MISSING_BLOCK_LABEL_64;
	//   21   41:aload_0         
	//   22   42:getfield        #79  <Field List mStateMessageList>
	//   23   45:invokeinterface #214 <Method int List.size()>
	//   24   50:ifle            64
		mStateMessageList.clear();
	//   25   53:aload_0         
	//   26   54:getfield        #79  <Field List mStateMessageList>
	//   27   57:invokeinterface #366 <Method void List.clear()>
		flag = flag1;
	//   28   62:iload_2         
	//   29   63:istore_1        
_L7:
		if(!flag)
	//*  30   64:iload_1         
	//*  31   65:ifne            112
			try
			{
				if(!processAnimations(glmapstate))
	//*  32   68:aload_0         
	//*  33   69:aload_3         
	//*  34   70:invokespecial   #368 <Method boolean processAnimations(GLMapState)>
	//*  35   73:ifeq            117
					break MISSING_BLOCK_LABEL_117;
	//   36   76:goto            112
			}
	//*  37   79:iload_1         
	//*  38   80:ifeq            89
	//*  39   83:aload_0         
	//*  40   84:iconst_1        
	//*  41   85:aload_3         
	//*  42   86:invokevirtual   #372 <Method void setMapState(int, GLMapState)>
	//*  43   89:aload_3         
	//*  44   90:invokevirtual   #375 <Method void GLMapState.recycle()>
	//*  45   93:iload_1         
	//*  46   94:ireturn         
			catch(Exception exception)
	//*  47   95:astore_3        
			{
				exception.printStackTrace();
	//   48   96:aload_3         
	//   49   97:invokevirtual   #376 <Method void Exception.printStackTrace()>
				return false;
	//   50  100:iconst_0        
	//   51  101:ireturn         
			}
		break MISSING_BLOCK_LABEL_112;
	//*  52  102:iconst_1        
	//*  53  103:istore_1        
	//*  54  104:goto            109
	//*  55  107:iconst_0        
	//*  56  108:istore_1        
	//*  57  109:goto            64
		flag = true;
	//   58  112:iconst_1        
	//   59  113:istore_1        
		for(; !flag; flag = false)
			break MISSING_BLOCK_LABEL_89;

	//   60  114:goto            79
	//   61  117:iconst_0        
	//   62  118:istore_1        
		setMapState(1, glmapstate);
		glmapstate.recycle();
		return flag;
_L4:
		flag = true;
		continue; /* Loop/switch isn't completed */
_L5:
		flag = false;
		if(true) goto _L7; else goto _L6
_L6:
	//*  63  119:goto            79
	}

	private boolean processStateMapMessage(GLMapState glmapstate)
	{
		if(mStateMessageList.size() <= 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #79  <Field List mStateMessageList>
	//*   2    4:invokeinterface #214 <Method int List.size()>
	//*   3    9:ifgt            26
		{
			if(isMoveCameraStep)
	//*   4   12:aload_0         
	//*   5   13:getfield        #87  <Field boolean isMoveCameraStep>
	//*   6   16:ifeq            24
				isMoveCameraStep = false;
	//    7   19:aload_0         
	//    8   20:iconst_0        
	//    9   21:putfield        #87  <Field boolean isMoveCameraStep>
			return false;
	//   10   24:iconst_0        
	//   11   25:ireturn         
		}
		isMoveCameraStep = true;
	//   12   26:aload_0         
	//   13   27:iconst_1        
	//   14   28:putfield        #87  <Field boolean isMoveCameraStep>
		if(glmapstate == null)
	//*  15   31:aload_1         
	//*  16   32:ifnonnull       37
			return false;
	//   17   35:iconst_0        
	//   18   36:ireturn         
		AbstractCameraUpdateMessage abstractcameraupdatemessage;
		for(; mStateMessageList.size() > 0; abstractcameraupdatemessage.runCameraUpdate(glmapstate))
	//*  19   37:aload_0         
	//*  20   38:getfield        #79  <Field List mStateMessageList>
	//*  21   41:invokeinterface #214 <Method int List.size()>
	//*  22   46:ifle            119
		{
			abstractcameraupdatemessage = (AbstractCameraUpdateMessage)mStateMessageList.remove(0);
	//   23   49:aload_0         
	//   24   50:getfield        #79  <Field List mStateMessageList>
	//   25   53:iconst_0        
	//   26   54:invokeinterface #218 <Method Object List.remove(int)>
	//   27   59:checkcast       #220 <Class AbstractCameraUpdateMessage>
	//   28   62:astore_2        
			if(abstractcameraupdatemessage == null)
				break;
	//   29   63:aload_2         
	//   30   64:ifnull          119
			if(abstractcameraupdatemessage.width == 0)
	//*  31   67:aload_2         
	//*  32   68:getfield        #377 <Field int AbstractCameraUpdateMessage.width>
	//*  33   71:ifne            87
				abstractcameraupdatemessage.width = mGlMapView.getMapWidth();
	//   34   74:aload_2         
	//   35   75:aload_0         
	//   36   76:getfield        #74  <Field s mGlMapView>
	//   37   79:invokeinterface #330 <Method int s.getMapWidth()>
	//   38   84:putfield        #377 <Field int AbstractCameraUpdateMessage.width>
			if(abstractcameraupdatemessage.height == 0)
	//*  39   87:aload_2         
	//*  40   88:getfield        #378 <Field int AbstractCameraUpdateMessage.height>
	//*  41   91:ifne            107
				abstractcameraupdatemessage.height = mGlMapView.getMapHeight();
	//   42   94:aload_2         
	//   43   95:aload_0         
	//   44   96:getfield        #74  <Field s mGlMapView>
	//   45   99:invokeinterface #336 <Method int s.getMapHeight()>
	//   46  104:putfield        #378 <Field int AbstractCameraUpdateMessage.height>
			glmapstate.recalculate();
	//   47  107:aload_1         
	//   48  108:invokevirtual   #314 <Method void GLMapState.recalculate()>
		}

	//   49  111:aload_2         
	//   50  112:aload_1         
	//   51  113:invokevirtual   #379 <Method void AbstractCameraUpdateMessage.runCameraUpdate(GLMapState)>
	//*  52  116:goto            37
		return true;
	//   53  119:iconst_1        
	//   54  120:ireturn         
	}

	private void recycleMessage()
	{
		do
		{
			if(mGestureEndMessageList.size() <= 0)
				break;
	//    0    0:aload_0         
	//    1    1:getfield        #83  <Field List mGestureEndMessageList>
	//    2    4:invokeinterface #214 <Method int List.size()>
	//    3    9:ifle            98
			AbstractGestureMapMessage abstractgesturemapmessage = (AbstractGestureMapMessage)mGestureEndMessageList.remove(0);
	//    4   12:aload_0         
	//    5   13:getfield        #83  <Field List mGestureEndMessageList>
	//    6   16:iconst_0        
	//    7   17:invokeinterface #218 <Method Object List.remove(int)>
	//    8   22:checkcast       #324 <Class AbstractGestureMapMessage>
	//    9   25:astore_1        
			if(abstractgesturemapmessage == null)
				break;
	//   10   26:aload_1         
	//   11   27:ifnull          98
			if(abstractgesturemapmessage instanceof MoveGestureMapMessage)
	//*  12   30:aload_1         
	//*  13   31:instanceof      #381 <Class MoveGestureMapMessage>
	//*  14   34:ifeq            47
				((MoveGestureMapMessage)abstractgesturemapmessage).recycle();
	//   15   37:aload_1         
	//   16   38:checkcast       #381 <Class MoveGestureMapMessage>
	//   17   41:invokevirtual   #382 <Method void MoveGestureMapMessage.recycle()>
			else
	//*  18   44:goto            95
			if(abstractgesturemapmessage instanceof HoverGestureMapMessage)
	//*  19   47:aload_1         
	//*  20   48:instanceof      #384 <Class HoverGestureMapMessage>
	//*  21   51:ifeq            64
				((HoverGestureMapMessage)abstractgesturemapmessage).recycle();
	//   22   54:aload_1         
	//   23   55:checkcast       #384 <Class HoverGestureMapMessage>
	//   24   58:invokevirtual   #385 <Method void HoverGestureMapMessage.recycle()>
			else
	//*  25   61:goto            95
			if(abstractgesturemapmessage instanceof RotateGestureMapMessage)
	//*  26   64:aload_1         
	//*  27   65:instanceof      #387 <Class RotateGestureMapMessage>
	//*  28   68:ifeq            81
				((RotateGestureMapMessage)abstractgesturemapmessage).recycle();
	//   29   71:aload_1         
	//   30   72:checkcast       #387 <Class RotateGestureMapMessage>
	//   31   75:invokevirtual   #388 <Method void RotateGestureMapMessage.recycle()>
			else
	//*  32   78:goto            95
			if(abstractgesturemapmessage instanceof ScaleGestureMapMessage)
	//*  33   81:aload_1         
	//*  34   82:instanceof      #390 <Class ScaleGestureMapMessage>
	//*  35   85:ifeq            95
				((ScaleGestureMapMessage)abstractgesturemapmessage).recycle();
	//   36   88:aload_1         
	//   37   89:checkcast       #390 <Class ScaleGestureMapMessage>
	//   38   92:invokevirtual   #391 <Method void ScaleGestureMapMessage.recycle()>
		} while(true);
	//   39   95:goto            0
	//   40   98:return          
	}

	public void OnIndoorBuildingActivity(int i, byte abyte0[])
	{
		if(mGlMapView != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #74  <Field s mGlMapView>
	//*   2    4:ifnull          24
			try
			{
				mGlMapView.onIndoorBuildingActivity(i, abyte0);
	//    3    7:aload_0         
	//    4    8:getfield        #74  <Field s mGlMapView>
	//    5   11:iload_1         
	//    6   12:aload_2         
	//    7   13:invokeinterface #396 <Method void s.onIndoorBuildingActivity(int, byte[])>
				return;
	//    8   18:return          
			}
			// Misplaced declaration of an exception variable
			catch(byte abyte0[])
	//*   9   19:astore_2        
			{
				((Throwable) (abyte0)).printStackTrace();
	//   10   20:aload_2         
	//   11   21:invokevirtual   #321 <Method void Throwable.printStackTrace()>
			}
	//   12   24:return          
	}

	public void addGestureMessage(int i, AbstractGestureMapMessage abstractgesturemapmessage, boolean flag, int j, int k)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		if(abstractgesturemapmessage == null)
	//*   2    2:aload_2         
	//*   3    3:ifnonnull       9
	//*   4    6:aload_0         
			return;
	//    5    7:monitorexit     
	//    6    8:return          
		abstractgesturemapmessage.isGestureScaleByMapCenter = flag;
	//    7    9:aload_2         
	//    8   10:iload_3         
	//    9   11:putfield        #401 <Field boolean AbstractGestureMapMessage.isGestureScaleByMapCenter>
		mGestureMessageList.add(((Object) (abstractgesturemapmessage)));
	//   10   14:aload_0         
	//   11   15:getfield        #81  <Field List mGestureMessageList>
	//   12   18:aload_2         
	//   13   19:invokeinterface #350 <Method boolean List.add(Object)>
	//   14   24:pop             
		this;
	//   15   25:aload_0         
		JVM INSTR monitorexit ;
	//   16   26:monitorexit     
		return;
	//   17   27:return          
		abstractgesturemapmessage;
	//   18   28:astore_2        
	//*  19   29:aload_0         
		throw abstractgesturemapmessage;
	//   20   30:monitorexit     
	//   21   31:aload_2         
	//   22   32:athrow          
	}

	public void addGroupAnimation(int i, int j, float f, int k, int l, int i1, int j1, 
			com.amap.api.maps.AMap.CancelableCallback cancelablecallback)
	{
		AdglMapAnimGroup adglmapanimgroup = new AdglMapAnimGroup(j);
	//    0    0:new             #405 <Class AdglMapAnimGroup>
	//    1    3:dup             
	//    2    4:iload_2         
	//    3    5:invokespecial   #408 <Method void AdglMapAnimGroup(int)>
	//    4    8:astore          9
		adglmapanimgroup.setToCameraDegree(l, 0);
	//    5   10:aload           9
	//    6   12:iload           5
	//    7   14:i2f             
	//    8   15:iconst_0        
	//    9   16:invokevirtual   #412 <Method void AdglMapAnimGroup.setToCameraDegree(float, int)>
		adglmapanimgroup.setToMapAngle(k, 0);
	//   10   19:aload           9
	//   11   21:iload           4
	//   12   23:i2f             
	//   13   24:iconst_0        
	//   14   25:invokevirtual   #415 <Method void AdglMapAnimGroup.setToMapAngle(float, int)>
		adglmapanimgroup.setToMapLevel(f, 0);
	//   15   28:aload           9
	//   16   30:fload_3         
	//   17   31:iconst_0        
	//   18   32:invokevirtual   #418 <Method void AdglMapAnimGroup.setToMapLevel(float, int)>
		adglmapanimgroup.setToMapCenterGeo(i1, j1, 0);
	//   19   35:aload           9
	//   20   37:iload           6
	//   21   39:iload           7
	//   22   41:iconst_0        
	//   23   42:invokevirtual   #422 <Method void AdglMapAnimGroup.setToMapCenterGeo(int, int, int)>
		if(mapAnimationMgr != null && adglmapanimgroup != null && adglmapanimgroup.isValid())
	//*  24   45:aload_0         
	//*  25   46:getfield        #93  <Field AdglMapAnimationMgr mapAnimationMgr>
	//*  26   49:ifnull          76
	//*  27   52:aload           9
	//*  28   54:ifnull          76
	//*  29   57:aload           9
	//*  30   59:invokevirtual   #425 <Method boolean AdglMapAnimGroup.isValid()>
	//*  31   62:ifeq            76
			mapAnimationMgr.addAnimation(((com.autonavi.ae.gmap.glanimation.AbstractAdglAnimation) (adglmapanimgroup)), cancelablecallback);
	//   32   65:aload_0         
	//   33   66:getfield        #93  <Field AdglMapAnimationMgr mapAnimationMgr>
	//   34   69:aload           9
	//   35   71:aload           8
	//   36   73:invokevirtual   #429 <Method void AdglMapAnimationMgr.addAnimation(com.autonavi.ae.gmap.glanimation.AbstractAdglAnimation, com.amap.api.maps.AMap$CancelableCallback)>
	//   37   76:return          
	}

	public void addMessage(AbstractCameraUpdateMessage abstractcameraupdatemessage, boolean flag)
	{
		if(flag)
	//*   0    0:iload_2         
	//*   1    1:ifeq            32
		{
			if(mAnimateStateMessageList != null)
	//*   2    4:aload_0         
	//*   3    5:getfield        #85  <Field List mAnimateStateMessageList>
	//*   4    8:ifnull          50
			{
				mAnimateStateMessageList.clear();
	//    5   11:aload_0         
	//    6   12:getfield        #85  <Field List mAnimateStateMessageList>
	//    7   15:invokeinterface #366 <Method void List.clear()>
				mAnimateStateMessageList.add(((Object) (abstractcameraupdatemessage)));
	//    8   20:aload_0         
	//    9   21:getfield        #85  <Field List mAnimateStateMessageList>
	//   10   24:aload_1         
	//   11   25:invokeinterface #350 <Method boolean List.add(Object)>
	//   12   30:pop             
				return;
	//   13   31:return          
			}
		} else
		if(mStateMessageList != null)
	//*  14   32:aload_0         
	//*  15   33:getfield        #79  <Field List mStateMessageList>
	//*  16   36:ifnull          50
			mStateMessageList.add(((Object) (abstractcameraupdatemessage)));
	//   17   39:aload_0         
	//   18   40:getfield        #79  <Field List mStateMessageList>
	//   19   43:aload_1         
	//   20   44:invokeinterface #350 <Method boolean List.add(Object)>
	//   21   49:pop             
	//   22   50:return          
	}

	public void addOverlayTexture(int i, GLTextureProperty gltextureproperty)
	{
		if(mNativeMapengineInstance != 0L && gltextureproperty != null && gltextureproperty.mBitmap != null && !gltextureproperty.mBitmap.isRecycled())
	//*   0    0:aload_0         
	//*   1    1:getfield        #72  <Field long mNativeMapengineInstance>
	//*   2    4:lconst_0        
	//*   3    5:lcmp            
	//*   4    6:ifeq            67
	//*   5    9:aload_2         
	//*   6   10:ifnull          67
	//*   7   13:aload_2         
	//*   8   14:getfield        #439 <Field Bitmap GLTextureProperty.mBitmap>
	//*   9   17:ifnull          67
	//*  10   20:aload_2         
	//*  11   21:getfield        #439 <Field Bitmap GLTextureProperty.mBitmap>
	//*  12   24:invokevirtual   #444 <Method boolean Bitmap.isRecycled()>
	//*  13   27:ifne            67
			nativeAddOverlayTexture(i, mNativeMapengineInstance, gltextureproperty.mId, gltextureproperty.mAnchor, gltextureproperty.mXRatio, gltextureproperty.mYRatio, gltextureproperty.mBitmap, gltextureproperty.isGenMimps, gltextureproperty.isRepeat);
	//   14   30:iload_1         
	//   15   31:aload_0         
	//   16   32:getfield        #72  <Field long mNativeMapengineInstance>
	//   17   35:aload_2         
	//   18   36:getfield        #447 <Field int GLTextureProperty.mId>
	//   19   39:aload_2         
	//   20   40:getfield        #450 <Field int GLTextureProperty.mAnchor>
	//   21   43:aload_2         
	//   22   44:getfield        #454 <Field float GLTextureProperty.mXRatio>
	//   23   47:aload_2         
	//   24   48:getfield        #457 <Field float GLTextureProperty.mYRatio>
	//   25   51:aload_2         
	//   26   52:getfield        #439 <Field Bitmap GLTextureProperty.mBitmap>
	//   27   55:aload_2         
	//   28   56:getfield        #460 <Field boolean GLTextureProperty.isGenMimps>
	//   29   59:aload_2         
	//   30   60:getfield        #463 <Field boolean GLTextureProperty.isRepeat>
	//   31   63:invokestatic    #465 <Method boolean nativeAddOverlayTexture(int, long, int, int, float, float, Bitmap, boolean, boolean)>
	//   32   66:pop             
	//   33   67:return          
	}

	public boolean canStopMapRender(int i)
	{
		return isEngineRenderComplete;
	//    0    0:aload_0         
	//    1    1:getfield        #108 <Field boolean isEngineRenderComplete>
	//    2    4:ireturn         
	}

	public void cancelAllAMapDownload()
	{
		Hashtable hashtable = aMapLoaderHashtable;
	//    0    0:aload_0         
	//    1    1:getfield        #113 <Field Hashtable aMapLoaderHashtable>
	//    2    4:astore_1        
		hashtable;
	//    3    5:aload_1         
		JVM INSTR monitorenter ;
	//    4    6:monitorenter    
		Iterator iterator = aMapLoaderHashtable.entrySet().iterator();
	//    5    7:aload_0         
	//    6    8:getfield        #113 <Field Hashtable aMapLoaderHashtable>
	//    7   11:invokevirtual   #472 <Method Set Hashtable.entrySet()>
	//    8   14:invokeinterface #478 <Method Iterator Set.iterator()>
	//    9   19:astore_3        
_L1:
		AMapLoader amaploader;
		do
		{
			if(!iterator.hasNext())
				break MISSING_BLOCK_LABEL_86;
	//   10   20:aload_3         
	//   11   21:invokeinterface #483 <Method boolean Iterator.hasNext()>
	//   12   26:ifeq            86
			amaploader = (AMapLoader)((java.util.Map.Entry)iterator.next()).getValue();
	//   13   29:aload_3         
	//   14   30:invokeinterface #487 <Method Object Iterator.next()>
	//   15   35:checkcast       #489 <Class java.util.Map$Entry>
	//   16   38:invokeinterface #492 <Method Object java.util.Map$Entry.getValue()>
	//   17   43:checkcast       #494 <Class AMapLoader>
	//   18   46:astore_2        
			amaploader.doCancel();
	//   19   47:aload_2         
	//   20   48:invokevirtual   #497 <Method void AMapLoader.doCancel()>
		} while(amaploader.isFinish);
	//   21   51:aload_2         
	//   22   52:getfield        #500 <Field boolean AMapLoader.isFinish>
	//   23   55:ifne            110
		amaploader;
	//   24   58:aload_2         
		JVM INSTR monitorenter ;
	//   25   59:monitorenter    
		if(!amaploader.isFinish)
	//*  26   60:aload_2         
	//*  27   61:getfield        #500 <Field boolean AMapLoader.isFinish>
	//*  28   64:ifne            76
		{
			((Object) (amaploader)).notify();
	//   29   67:aload_2         
	//   30   68:invokevirtual   #503 <Method void Object.notify()>
			amaploader.isFinish = true;
	//   31   71:aload_2         
	//   32   72:iconst_1        
	//   33   73:putfield        #500 <Field boolean AMapLoader.isFinish>
		}
		amaploader;
	//   34   76:aload_2         
		JVM INSTR monitorexit ;
	//   35   77:monitorexit     
		  goto _L1
	//*  36   78:goto            110
		Exception exception1;
		exception1;
	//   37   81:astore_3        
	//*  38   82:aload_2         
		throw exception1;
	//   39   83:monitorexit     
	//   40   84:aload_3         
	//   41   85:athrow          
		aMapLoaderHashtable.clear();
	//   42   86:aload_0         
	//   43   87:getfield        #113 <Field Hashtable aMapLoaderHashtable>
	//   44   90:invokevirtual   #504 <Method void Hashtable.clear()>
		hashtable;
	//   45   93:aload_1         
		JVM INSTR monitorexit ;
	//   46   94:monitorexit     
		  goto _L2
	//*  47   95:goto            103
		Exception exception;
		exception;
	//   48   98:astore_2        
	//*  49   99:aload_1         
		throw exception;
	//   50  100:monitorexit     
	//   51  101:aload_2         
	//   52  102:athrow          
_L2:
		return;
	//   53  103:return          
		Throwable throwable;
		throwable;
	//   54  104:astore_1        
		throwable.printStackTrace();
	//   55  105:aload_1         
	//   56  106:invokevirtual   #321 <Method void Throwable.printStackTrace()>
		return;
	//   57  109:return          
	//*  58  110:goto            20
	}

	public void cancelRequireMapData(Object obj)
	{
		if(obj != null && (obj instanceof AMapLoader))
	//*   0    0:aload_1         
	//*   1    1:ifnull          18
	//*   2    4:aload_1         
	//*   3    5:instanceof      #494 <Class AMapLoader>
	//*   4    8:ifeq            18
			((AMapLoader)obj).doCancel();
	//    5   11:aload_1         
	//    6   12:checkcast       #494 <Class AMapLoader>
	//    7   15:invokevirtual   #497 <Method void AMapLoader.doCancel()>
	//    8   18:return          
	}

	public void changeSurface(int i, int j)
	{
	//    0    0:return          
	}

	public void clearAllMessages(int i)
	{
	//    0    0:return          
	}

	public void clearAnimations(int i, boolean flag)
	{
		mapAnimationMgr.clearAnimations();
	//    0    0:aload_0         
	//    1    1:getfield        #93  <Field AdglMapAnimationMgr mapAnimationMgr>
	//    2    4:invokevirtual   #513 <Method void AdglMapAnimationMgr.clearAnimations()>
	//    3    7:return          
	}

	public void clearAnimations(int i, boolean flag, int j)
	{
		mapAnimationMgr.clearAnimations();
	//    0    0:aload_0         
	//    1    1:getfield        #93  <Field AdglMapAnimationMgr mapAnimationMgr>
	//    2    4:invokevirtual   #513 <Method void AdglMapAnimationMgr.clearAnimations()>
	//    3    7:return          
	}

	public void createAMapEngineWithFrame(MapViewInitParam mapviewinitparam)
	{
		if(mNativeMapengineInstance != 0L)
	//*   0    0:aload_0         
	//*   1    1:getfield        #72  <Field long mNativeMapengineInstance>
	//*   2    4:lconst_0        
	//*   3    5:lcmp            
	//*   4    6:ifeq            56
			nativeCreateAMapEngineWithFrame(mNativeMapengineInstance, mapviewinitparam.engineId, mapviewinitparam.x, mapviewinitparam.y, mapviewinitparam.width, mapviewinitparam.height, mapviewinitparam.screenWidth, mapviewinitparam.screenHeight, mapviewinitparam.screenScale, mapviewinitparam.textScale, mapviewinitparam.mapZoomScale);
	//    5    9:aload_0         
	//    6   10:getfield        #72  <Field long mNativeMapengineInstance>
	//    7   13:aload_1         
	//    8   14:getfield        #519 <Field int GLMapEngine$MapViewInitParam.engineId>
	//    9   17:aload_1         
	//   10   18:getfield        #522 <Field int GLMapEngine$MapViewInitParam.x>
	//   11   21:aload_1         
	//   12   22:getfield        #525 <Field int GLMapEngine$MapViewInitParam.y>
	//   13   25:aload_1         
	//   14   26:getfield        #526 <Field int GLMapEngine$MapViewInitParam.width>
	//   15   29:aload_1         
	//   16   30:getfield        #527 <Field int GLMapEngine$MapViewInitParam.height>
	//   17   33:aload_1         
	//   18   34:getfield        #530 <Field int GLMapEngine$MapViewInitParam.screenWidth>
	//   19   37:aload_1         
	//   20   38:getfield        #533 <Field int GLMapEngine$MapViewInitParam.screenHeight>
	//   21   41:aload_1         
	//   22   42:getfield        #536 <Field float GLMapEngine$MapViewInitParam.screenScale>
	//   23   45:aload_1         
	//   24   46:getfield        #539 <Field float GLMapEngine$MapViewInitParam.textScale>
	//   25   49:aload_1         
	//   26   50:getfield        #542 <Field float GLMapEngine$MapViewInitParam.mapZoomScale>
	//   27   53:invokestatic    #544 <Method void nativeCreateAMapEngineWithFrame(long, int, int, int, int, int, int, int, float, float, float)>
	//   28   56:return          
	}

	public void createAMapInstance(InitParam initparam)
	{
		if(initparam == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       5
			return;
	//    2    4:return          
		com/autonavi/ae/gmap/GLMapEngine;
	//    3    5:ldc1            #2   <Class GLMapEngine>
		JVM INSTR monitorenter ;
	//    4    7:monitorenter    
		nativeInitParam(initparam.mRootPath, initparam.mConfigPath, initparam.mOfflineDataPath, initparam.mP3dCrossPath);
	//    5    8:aload_1         
	//    6    9:getfield        #549 <Field String GLMapEngine$InitParam.mRootPath>
	//    7   12:aload_1         
	//    8   13:getfield        #552 <Field String GLMapEngine$InitParam.mConfigPath>
	//    9   16:aload_1         
	//   10   17:getfield        #555 <Field String GLMapEngine$InitParam.mOfflineDataPath>
	//   11   20:aload_1         
	//   12   21:getfield        #558 <Field String GLMapEngine$InitParam.mP3dCrossPath>
	//   13   24:invokestatic    #560 <Method void nativeInitParam(String, String, String, String)>
		mNativeMapengineInstance = nativeCreateAMapInstance("", "http://mpsapi.amap.com/", "http://m5.amap.com/");
	//   14   27:aload_0         
	//   15   28:ldc2            #562 <String "">
	//   16   31:ldc2            #564 <String "http://mpsapi.amap.com/">
	//   17   34:ldc2            #566 <String "http://m5.amap.com/">
	//   18   37:invokestatic    #568 <Method long nativeCreateAMapInstance(String, String, String)>
	//   19   40:putfield        #72  <Field long mNativeMapengineInstance>
		nativeInitAMapEngineCallback(mNativeMapengineInstance, ((Object) (this)));
	//   20   43:aload_0         
	//   21   44:getfield        #72  <Field long mNativeMapengineInstance>
	//   22   47:aload_0         
	//   23   48:invokestatic    #570 <Method void nativeInitAMapEngineCallback(long, Object)>
		initNetworkState();
	//   24   51:aload_0         
	//   25   52:invokespecial   #572 <Method void initNetworkState()>
		com/autonavi/ae/gmap/GLMapEngine;
	//   26   55:ldc1            #2   <Class GLMapEngine>
		JVM INSTR monitorexit ;
	//   27   57:monitorexit     
		return;
	//   28   58:return          
		initparam;
	//   29   59:astore_1        
	//*  30   60:ldc1            #2   <Class GLMapEngine>
		throw initparam;
	//   31   62:monitorexit     
	//   32   63:aload_1         
	//   33   64:athrow          
	}

	public long createOverlay(int i, int j)
	{
		if(mNativeMapengineInstance != 0L)
	//*   0    0:aload_0         
	//*   1    1:getfield        #72  <Field long mNativeMapengineInstance>
	//*   2    4:lconst_0        
	//*   3    5:lcmp            
	//*   4    6:ifeq            19
			return nativeCreateOverlay(i, mNativeMapengineInstance, j);
	//    5    9:iload_1         
	//    6   10:aload_0         
	//    7   11:getfield        #72  <Field long mNativeMapengineInstance>
	//    8   14:iload_2         
	//    9   15:invokestatic    #576 <Method long nativeCreateOverlay(int, long, int)>
	//   10   18:lreturn         
		else
			return 0L;
	//   11   19:lconst_0        
	//   12   20:lreturn         
	}

	public void destroyAMapEngine()
	{
		mRequestDestroy = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #115 <Field boolean mRequestDestroy>
		cancelAllAMapDownload();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #579 <Method void cancelAllAMapDownload()>
		Object obj = mutLock;
	//    5    9:aload_0         
	//    6   10:getfield        #102 <Field Object mutLock>
	//    7   13:astore_1        
		obj;
	//    8   14:aload_1         
		JVM INSTR monitorenter ;
	//    9   15:monitorenter    
		if(mNativeMapengineInstance == 0L) goto _L2; else goto _L1
	//   10   16:aload_0         
	//   11   17:getfield        #72  <Field long mNativeMapengineInstance>
	//   12   20:lconst_0        
	//   13   21:lcmp            
	//   14   22:ifeq            72
_L1:
		this;
	//   15   25:aload_0         
		JVM INSTR monitorenter ;
	//   16   26:monitorenter    
		if(copyGLMapState != null)
	//*  17   27:aload_0         
	//*  18   28:getfield        #95  <Field GLMapState copyGLMapState>
	//*  19   31:ifnull          41
			copyGLMapState.recycle();
	//   20   34:aload_0         
	//   21   35:getfield        #95  <Field GLMapState copyGLMapState>
	//   22   38:invokevirtual   #375 <Method void GLMapState.recycle()>
		this;
	//   23   41:aload_0         
		JVM INSTR monitorexit ;
	//   24   42:monitorexit     
		  goto _L3
	//*  25   43:goto            51
		Exception exception;
		exception;
	//   26   46:astore_2        
	//*  27   47:aload_0         
		throw exception;
	//   28   48:monitorexit     
	//   29   49:aload_2         
	//   30   50:athrow          
_L3:
		nativeDestroyCurrentState(mNativeMapengineInstance, state.getNativeInstance());
	//   31   51:aload_0         
	//   32   52:getfield        #72  <Field long mNativeMapengineInstance>
	//   33   55:aload_0         
	//   34   56:getfield        #581 <Field GLMapState state>
	//   35   59:invokevirtual   #585 <Method long GLMapState.getNativeInstance()>
	//   36   62:invokestatic    #587 <Method void nativeDestroyCurrentState(long, long)>
		nativeDestroy(mNativeMapengineInstance);
	//   37   65:aload_0         
	//   38   66:getfield        #72  <Field long mNativeMapengineInstance>
	//   39   69:invokestatic    #589 <Method void nativeDestroy(long)>
_L2:
		mNativeMapengineInstance = 0L;
	//   40   72:aload_0         
	//   41   73:lconst_0        
	//   42   74:putfield        #72  <Field long mNativeMapengineInstance>
		obj;
	//   43   77:aload_1         
		JVM INSTR monitorexit ;
	//   44   78:monitorexit     
		  goto _L4
	//*  45   79:goto            87
		exception;
	//   46   82:astore_2        
	//*  47   83:aload_1         
		throw exception;
	//   48   84:monitorexit     
	//   49   85:aload_2         
	//   50   86:athrow          
_L4:
		mGlMapView = null;
	//   51   87:aload_0         
	//   52   88:aconst_null     
	//   53   89:putfield        #74  <Field s mGlMapView>
		mStateMessageList.clear();
	//   54   92:aload_0         
	//   55   93:getfield        #79  <Field List mStateMessageList>
	//   56   96:invokeinterface #366 <Method void List.clear()>
		mAnimateStateMessageList.clear();
	//   57  101:aload_0         
	//   58  102:getfield        #85  <Field List mAnimateStateMessageList>
	//   59  105:invokeinterface #366 <Method void List.clear()>
		mGestureEndMessageList.clear();
	//   60  110:aload_0         
	//   61  111:getfield        #83  <Field List mGestureEndMessageList>
	//   62  114:invokeinterface #366 <Method void List.clear()>
		mGestureMessageList.clear();
	//   63  119:aload_0         
	//   64  120:getfield        #81  <Field List mGestureMessageList>
	//   65  123:invokeinterface #366 <Method void List.clear()>
		mMapListener = null;
	//   66  128:aload_0         
	//   67  129:aconst_null     
	//   68  130:putfield        #196 <Field IAMapListener mMapListener>
		fc.b();
	//   69  133:invokestatic    #594 <Method void fc.b()>
		return;
	//   70  136:return          
		Throwable throwable;
		throwable;
	//   71  137:astore_1        
		throwable.printStackTrace();
	//   72  138:aload_1         
	//   73  139:invokevirtual   #321 <Method void Throwable.printStackTrace()>
		return;
	//   74  142:return          
	}

	public void finishDownLoad(int i, long l)
	{
		if(mNativeMapengineInstance != 0L)
	//*   0    0:aload_0         
	//*   1    1:getfield        #72  <Field long mNativeMapengineInstance>
	//*   2    4:lconst_0        
	//*   3    5:lcmp            
	//*   4    6:ifeq            18
			nativeFinishDownLoad(i, mNativeMapengineInstance, l);
	//    5    9:iload_1         
	//    6   10:aload_0         
	//    7   11:getfield        #72  <Field long mNativeMapengineInstance>
	//    8   14:lload_2         
	//    9   15:invokestatic    #597 <Method void nativeFinishDownLoad(int, long, long)>
		aMapLoaderHashtable.remove(((Object) (Long.valueOf(l))));
	//   10   18:aload_0         
	//   11   19:getfield        #113 <Field Hashtable aMapLoaderHashtable>
	//   12   22:lload_2         
	//   13   23:invokestatic    #603 <Method Long Long.valueOf(long)>
	//   14   26:invokevirtual   #606 <Method Object Hashtable.remove(Object)>
	//   15   29:pop             
	//   16   30:return          
	}

	public int getAnimateionsCount()
	{
		if(mNativeMapengineInstance != 0L)
	//*   0    0:aload_0         
	//*   1    1:getfield        #72  <Field long mNativeMapengineInstance>
	//*   2    4:lconst_0        
	//*   3    5:lcmp            
	//*   4    6:ifeq            17
			return mapAnimationMgr.getAnimationsCount();
	//    5    9:aload_0         
	//    6   10:getfield        #93  <Field AdglMapAnimationMgr mapAnimationMgr>
	//    7   13:invokevirtual   #309 <Method int AdglMapAnimationMgr.getAnimationsCount()>
	//    8   16:ireturn         
		else
			return 0;
	//    9   17:iconst_0        
	//   10   18:ireturn         
	}

	public GLMapState getCloneMapState()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		mLock.lock();
	//    2    2:aload_0         
	//    3    3:getfield        #100 <Field Lock mLock>
	//    4    6:invokeinterface #614 <Method void Lock.lock()>
		if(mNativeMapengineInstance != 0L)
	//*   5   11:aload_0         
	//*   6   12:getfield        #72  <Field long mNativeMapengineInstance>
	//*   7   15:lconst_0        
	//*   8   16:lcmp            
	//*   9   17:ifeq            131
		{
			if(copyGLMapState == null)
	//*  10   20:aload_0         
	//*  11   21:getfield        #95  <Field GLMapState copyGLMapState>
	//*  12   24:ifnonnull       43
				copyGLMapState = new GLMapState(1, mNativeMapengineInstance);
	//   13   27:aload_0         
	//   14   28:new             #311 <Class GLMapState>
	//   15   31:dup             
	//   16   32:iconst_1        
	//   17   33:aload_0         
	//   18   34:getfield        #72  <Field long mNativeMapengineInstance>
	//   19   37:invokespecial   #616 <Method void GLMapState(int, long)>
	//   20   40:putfield        #95  <Field GLMapState copyGLMapState>
			copyGLMapState.setMapZoomer(mGlMapView.getMapConfig().getSZ());
	//   21   43:aload_0         
	//   22   44:getfield        #95  <Field GLMapState copyGLMapState>
	//   23   47:aload_0         
	//   24   48:getfield        #74  <Field s mGlMapView>
	//   25   51:invokeinterface #620 <Method MapConfig s.getMapConfig()>
	//   26   56:invokevirtual   #626 <Method float MapConfig.getSZ()>
	//   27   59:invokevirtual   #630 <Method void GLMapState.setMapZoomer(float)>
			copyGLMapState.setCameraDegree(mGlMapView.getMapConfig().getSC());
	//   28   62:aload_0         
	//   29   63:getfield        #95  <Field GLMapState copyGLMapState>
	//   30   66:aload_0         
	//   31   67:getfield        #74  <Field s mGlMapView>
	//   32   70:invokeinterface #620 <Method MapConfig s.getMapConfig()>
	//   33   75:invokevirtual   #633 <Method float MapConfig.getSC()>
	//   34   78:invokevirtual   #636 <Method void GLMapState.setCameraDegree(float)>
			copyGLMapState.setMapAngle(mGlMapView.getMapConfig().getSR());
	//   35   81:aload_0         
	//   36   82:getfield        #95  <Field GLMapState copyGLMapState>
	//   37   85:aload_0         
	//   38   86:getfield        #74  <Field s mGlMapView>
	//   39   89:invokeinterface #620 <Method MapConfig s.getMapConfig()>
	//   40   94:invokevirtual   #639 <Method float MapConfig.getSR()>
	//   41   97:invokevirtual   #642 <Method void GLMapState.setMapAngle(float)>
			copyGLMapState.setMapGeoCenter(mGlMapView.getMapConfig().getSX(), mGlMapView.getMapConfig().getSY());
	//   42  100:aload_0         
	//   43  101:getfield        #95  <Field GLMapState copyGLMapState>
	//   44  104:aload_0         
	//   45  105:getfield        #74  <Field s mGlMapView>
	//   46  108:invokeinterface #620 <Method MapConfig s.getMapConfig()>
	//   47  113:invokevirtual   #645 <Method int MapConfig.getSX()>
	//   48  116:aload_0         
	//   49  117:getfield        #74  <Field s mGlMapView>
	//   50  120:invokeinterface #620 <Method MapConfig s.getMapConfig()>
	//   51  125:invokevirtual   #648 <Method int MapConfig.getSY()>
	//   52  128:invokevirtual   #651 <Method void GLMapState.setMapGeoCenter(int, int)>
		}
		mLock.unlock();
	//   53  131:aload_0         
	//   54  132:getfield        #100 <Field Lock mLock>
	//   55  135:invokeinterface #654 <Method void Lock.unlock()>
		break MISSING_BLOCK_LABEL_155;
	//   56  140:goto            155
		Exception exception;
		exception;
	//   57  143:astore_1        
		mLock.unlock();
	//   58  144:aload_0         
	//   59  145:getfield        #100 <Field Lock mLock>
	//   60  148:invokeinterface #654 <Method void Lock.unlock()>
		throw exception;
	//   61  153:aload_1         
	//   62  154:athrow          
		GLMapState glmapstate = copyGLMapState;
	//   63  155:aload_0         
	//   64  156:getfield        #95  <Field GLMapState copyGLMapState>
	//   65  159:astore_1        
		this;
	//   66  160:aload_0         
		JVM INSTR monitorexit ;
	//   67  161:monitorexit     
		return glmapstate;
	//   68  162:aload_1         
	//   69  163:areturn         
		glmapstate;
	//   70  164:astore_1        
	//*  71  165:aload_0         
		throw glmapstate;
	//   72  166:monitorexit     
	//   73  167:aload_1         
	//   74  168:athrow          
	}

	public Context getContext()
	{
		return context;
	//    0    0:aload_0         
	//    1    1:getfield        #123 <Field Context context>
	//    2    4:areturn         
	}

	public void getCurTileIDs(int i, int ai[])
	{
		if(ai != null)
	//*   0    0:aload_2         
	//*   1    1:ifnull          34
		{
			for(int j = 0; j < ai.length; j++)
	//*   2    4:iconst_0        
	//*   3    5:istore_3        
	//*   4    6:iload_3         
	//*   5    7:aload_2         
	//*   6    8:arraylength     
	//*   7    9:icmpge          23
				ai[j] = 0;
	//    8   12:aload_2         
	//    9   13:iload_3         
	//   10   14:iconst_0        
	//   11   15:iastore         

	//   12   16:iload_3         
	//   13   17:iconst_1        
	//   14   18:iadd            
	//   15   19:istore_3        
	//*  16   20:goto            6
			nativeGetCurTileIDs(i, mNativeMapengineInstance, ai, ai.length);
	//   17   23:iload_1         
	//   18   24:aload_0         
	//   19   25:getfield        #72  <Field long mNativeMapengineInstance>
	//   20   28:aload_2         
	//   21   29:aload_2         
	//   22   30:arraylength     
	//   23   31:invokestatic    #659 <Method void nativeGetCurTileIDs(int, long, int[], int)>
		}
	//   24   34:return          
	}

	public int getEngineIDWithGestureInfo(EAMapPlatformGestureInfo eamapplatformgestureinfo)
	{
		long l = mNativeMapengineInstance;
	//    0    0:aload_0         
	//    1    1:getfield        #72  <Field long mNativeMapengineInstance>
	//    2    4:lstore_2        
		return 1;
	//    3    5:iconst_1        
	//    4    6:ireturn         
	}

	public int getEngineIDWithType(int i)
	{
		return 1;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	public long getGlOverlayMgrPtr(int i)
	{
		if(mNativeMapengineInstance != 0L)
	//*   0    0:aload_0         
	//*   1    1:getfield        #72  <Field long mNativeMapengineInstance>
	//*   2    4:lconst_0        
	//*   3    5:lcmp            
	//*   4    6:ifeq            18
			return nativeGetGlOverlayMgrPtr(i, mNativeMapengineInstance);
	//    5    9:iload_1         
	//    6   10:aload_0         
	//    7   11:getfield        #72  <Field long mNativeMapengineInstance>
	//    8   14:invokestatic    #667 <Method long nativeGetGlOverlayMgrPtr(int, long)>
	//    9   17:lreturn         
		else
			return 0L;
	//   10   18:lconst_0        
	//   11   19:lreturn         
	}

	public boolean getIsProcessBuildingMark(int i)
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public byte[] getLabelBuffer(int i, int j, int k, int l)
	{
		mLock.lock();
	//    0    0:aload_0         
	//    1    1:getfield        #100 <Field Lock mLock>
	//    2    4:invokeinterface #614 <Method void Lock.lock()>
		byte abyte0[];
		abyte0 = new byte[3072];
	//    3    9:sipush          3072
	//    4   12:newarray        byte[]
	//    5   14:astore          5
		if(mNativeMapengineInstance != 0L)
	//*   6   16:aload_0         
	//*   7   17:getfield        #72  <Field long mNativeMapengineInstance>
	//*   8   20:lconst_0        
	//*   9   21:lcmp            
	//*  10   22:ifeq            39
			nativeSelectMapPois(i, mNativeMapengineInstance, j, k, l, abyte0);
	//   11   25:iload_1         
	//   12   26:aload_0         
	//   13   27:getfield        #72  <Field long mNativeMapengineInstance>
	//   14   30:iload_2         
	//   15   31:iload_3         
	//   16   32:iload           4
	//   17   34:aload           5
	//   18   36:invokestatic    #672 <Method void nativeSelectMapPois(int, long, int, int, int, byte[])>
		mLock.unlock();
	//   19   39:aload_0         
	//   20   40:getfield        #100 <Field Lock mLock>
	//   21   43:invokeinterface #654 <Method void Lock.unlock()>
		return abyte0;
	//   22   48:aload           5
	//   23   50:areturn         
		Exception exception;
		exception;
	//   24   51:astore          5
		mLock.unlock();
	//   25   53:aload_0         
	//   26   54:getfield        #100 <Field Lock mLock>
	//   27   57:invokeinterface #654 <Method void Lock.unlock()>
		throw exception;
	//   28   62:aload           5
	//   29   64:athrow          
	}

	public boolean getMapDataTaskIsCancel(int i, long l)
	{
		return !aMapLoaderHashtable.containsKey(((Object) (Long.valueOf(l))));
	//    0    0:aload_0         
	//    1    1:getfield        #113 <Field Hashtable aMapLoaderHashtable>
	//    2    4:lload_2         
	//    3    5:invokestatic    #603 <Method Long Long.valueOf(long)>
	//    4    8:invokevirtual   #677 <Method boolean Hashtable.containsKey(Object)>
	//    5   11:ifne            16
	//    6   14:iconst_1        
	//    7   15:ireturn         
	//    8   16:iconst_0        
	//    9   17:ireturn         
	}

	public int[] getMapModeState(int i, boolean flag)
	{
		if(mNativeMapengineInstance != 0L)
	//*   0    0:aload_0         
	//*   1    1:getfield        #72  <Field long mNativeMapengineInstance>
	//*   2    4:lconst_0        
	//*   3    5:lcmp            
	//*   4    6:ifeq            19
			nativeGetMapModeState(i, mNativeMapengineInstance, flag);
	//    5    9:iload_1         
	//    6   10:aload_0         
	//    7   11:getfield        #72  <Field long mNativeMapengineInstance>
	//    8   14:iload_2         
	//    9   15:invokestatic    #681 <Method int[] nativeGetMapModeState(int, long, boolean)>
	//   10   18:pop             
		return null;
	//   11   19:aconst_null     
	//   12   20:areturn         
	}

	public GLMapState getMapState(int i)
	{
		mLock.lock();
	//    0    0:aload_0         
	//    1    1:getfield        #100 <Field Lock mLock>
	//    2    4:invokeinterface #614 <Method void Lock.lock()>
		long l;
		if(mNativeMapengineInstance == 0L || state != null)
			break MISSING_BLOCK_LABEL_56;
	//    3    9:aload_0         
	//    4   10:getfield        #72  <Field long mNativeMapengineInstance>
	//    5   13:lconst_0        
	//    6   14:lcmp            
	//    7   15:ifeq            56
	//    8   18:aload_0         
	//    9   19:getfield        #581 <Field GLMapState state>
	//   10   22:ifnonnull       56
		l = nativeGetCurrentMapState(i, mNativeMapengineInstance);
	//   11   25:iload_1         
	//   12   26:aload_0         
	//   13   27:getfield        #72  <Field long mNativeMapengineInstance>
	//   14   30:invokestatic    #684 <Method long nativeGetCurrentMapState(int, long)>
	//   15   33:lstore_2        
		if(l == 0L)
			break MISSING_BLOCK_LABEL_56;
	//   16   34:lload_2         
	//   17   35:lconst_0        
	//   18   36:lcmp            
	//   19   37:ifeq            56
		state = new GLMapState(mNativeMapengineInstance, l);
	//   20   40:aload_0         
	//   21   41:new             #311 <Class GLMapState>
	//   22   44:dup             
	//   23   45:aload_0         
	//   24   46:getfield        #72  <Field long mNativeMapengineInstance>
	//   25   49:lload_2         
	//   26   50:invokespecial   #686 <Method void GLMapState(long, long)>
	//   27   53:putfield        #581 <Field GLMapState state>
		mLock.unlock();
	//   28   56:aload_0         
	//   29   57:getfield        #100 <Field Lock mLock>
	//   30   60:invokeinterface #654 <Method void Lock.unlock()>
		break MISSING_BLOCK_LABEL_82;
	//   31   65:goto            82
		Exception exception;
		exception;
	//   32   68:astore          4
		mLock.unlock();
	//   33   70:aload_0         
	//   34   71:getfield        #100 <Field Lock mLock>
	//   35   74:invokeinterface #654 <Method void Lock.unlock()>
		throw exception;
	//   36   79:aload           4
	//   37   81:athrow          
		return state;
	//   38   82:aload_0         
	//   39   83:getfield        #581 <Field GLMapState state>
	//   40   86:areturn         
	}

	public long getMapStateInstance(int i)
	{
		return 0L;
	//    0    0:lconst_0        
	//    1    1:lreturn         
	}

	public long getNativeInstance()
	{
		return mNativeMapengineInstance;
	//    0    0:aload_0         
	//    1    1:getfield        #72  <Field long mNativeMapengineInstance>
	//    2    4:lreturn         
	}

	public GLMapState getNewMapState(int i)
	{
		mLock.lock();
	//    0    0:aload_0         
	//    1    1:getfield        #100 <Field Lock mLock>
	//    2    4:invokeinterface #614 <Method void Lock.lock()>
		GLMapState glmapstate;
		if(mNativeMapengineInstance == 0L)
			break MISSING_BLOCK_LABEL_42;
	//    3    9:aload_0         
	//    4   10:getfield        #72  <Field long mNativeMapengineInstance>
	//    5   13:lconst_0        
	//    6   14:lcmp            
	//    7   15:ifeq            42
		glmapstate = new GLMapState(i, mNativeMapengineInstance);
	//    8   18:new             #311 <Class GLMapState>
	//    9   21:dup             
	//   10   22:iload_1         
	//   11   23:aload_0         
	//   12   24:getfield        #72  <Field long mNativeMapengineInstance>
	//   13   27:invokespecial   #616 <Method void GLMapState(int, long)>
	//   14   30:astore_2        
		mLock.unlock();
	//   15   31:aload_0         
	//   16   32:getfield        #100 <Field Lock mLock>
	//   17   35:invokeinterface #654 <Method void Lock.unlock()>
		return glmapstate;
	//   18   40:aload_2         
	//   19   41:areturn         
		mLock.unlock();
	//   20   42:aload_0         
	//   21   43:getfield        #100 <Field Lock mLock>
	//   22   46:invokeinterface #654 <Method void Lock.unlock()>
		break MISSING_BLOCK_LABEL_66;
	//   23   51:goto            66
		Exception exception;
		exception;
	//   24   54:astore_2        
		mLock.unlock();
	//   25   55:aload_0         
	//   26   56:getfield        #100 <Field Lock mLock>
	//   27   59:invokeinterface #654 <Method void Lock.unlock()>
		throw exception;
	//   28   64:aload_2         
	//   29   65:athrow          
		return null;
	//   30   66:aconst_null     
	//   31   67:areturn         
	}

	public GLOverlayBundle getOverlayBundle(int i)
	{
		return bundle;
	//    0    0:aload_0         
	//    1    1:getfield        #106 <Field GLOverlayBundle bundle>
	//    2    4:areturn         
	}

	public boolean getSrvViewStateBoolValue(int i, int j)
	{
		if(mNativeMapengineInstance != 0L)
	//*   0    0:aload_0         
	//*   1    1:getfield        #72  <Field long mNativeMapengineInstance>
	//*   2    4:lconst_0        
	//*   3    5:lcmp            
	//*   4    6:ifeq            19
			return nativeGetSrvViewStateBoolValue(i, mNativeMapengineInstance, j);
	//    5    9:iload_1         
	//    6   10:aload_0         
	//    7   11:getfield        #72  <Field long mNativeMapengineInstance>
	//    8   14:iload_2         
	//    9   15:invokestatic    #693 <Method boolean nativeGetSrvViewStateBoolValue(int, long, int)>
	//   10   18:ireturn         
		else
			return false;
	//   11   19:iconst_0        
	//   12   20:ireturn         
	}

	public AbstractCameraUpdateMessage getStateMessage()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		if(mStateMessageList != null && mStateMessageList.size() != 0)
			break MISSING_BLOCK_LABEL_25;
	//    2    2:aload_0         
	//    3    3:getfield        #79  <Field List mStateMessageList>
	//    4    6:ifnull          21
	//    5    9:aload_0         
	//    6   10:getfield        #79  <Field List mStateMessageList>
	//    7   13:invokeinterface #214 <Method int List.size()>
	//    8   18:ifne            25
		this;
	//    9   21:aload_0         
		JVM INSTR monitorexit ;
	//   10   22:monitorexit     
		return null;
	//   11   23:aconst_null     
	//   12   24:areturn         
		AbstractCameraUpdateMessage abstractcameraupdatemessage;
		abstractcameraupdatemessage = (AbstractCameraUpdateMessage)mStateMessageList.get(0);
	//   13   25:aload_0         
	//   14   26:getfield        #79  <Field List mStateMessageList>
	//   15   29:iconst_0        
	//   16   30:invokeinterface #698 <Method Object List.get(int)>
	//   17   35:checkcast       #220 <Class AbstractCameraUpdateMessage>
	//   18   38:astore_1        
		mStateMessageList.remove(((Object) (abstractcameraupdatemessage)));
	//   19   39:aload_0         
	//   20   40:getfield        #79  <Field List mStateMessageList>
	//   21   43:aload_1         
	//   22   44:invokeinterface #700 <Method boolean List.remove(Object)>
	//   23   49:pop             
		this;
	//   24   50:aload_0         
		JVM INSTR monitorexit ;
	//   25   51:monitorexit     
		return abstractcameraupdatemessage;
	//   26   52:aload_1         
	//   27   53:areturn         
		Exception exception;
		exception;
	//   28   54:astore_1        
	//*  29   55:aload_0         
		throw exception;
	//   30   56:monitorexit     
	//   31   57:aload_1         
	//   32   58:athrow          
	}

	public int getStateMessageCount()
	{
		return mStateMessageList.size();
	//    0    0:aload_0         
	//    1    1:getfield        #79  <Field List mStateMessageList>
	//    2    4:invokeinterface #214 <Method int List.size()>
	//    3    9:ireturn         
	}

	public String getUserAgent()
	{
		return userAgent;
	//    0    0:aload_0         
	//    1    1:getfield        #167 <Field String userAgent>
	//    2    4:areturn         
	}

	public void interruptAnimation()
	{
		if(isInMapAnimation(1))
	//*   0    0:aload_0         
	//*   1    1:iconst_1        
	//*   2    2:invokevirtual   #706 <Method boolean isInMapAnimation(int)>
	//*   3    5:ifeq            45
			try
			{
				doMapAnimationCancelCallback(mapAnimationMgr.getCancelCallback());
	//    4    8:aload_0         
	//    5    9:aload_0         
	//    6   10:getfield        #93  <Field AdglMapAnimationMgr mapAnimationMgr>
	//    7   13:invokevirtual   #710 <Method com.amap.api.maps.AMap$CancelableCallback AdglMapAnimationMgr.getCancelCallback()>
	//    8   16:invokespecial   #712 <Method void doMapAnimationCancelCallback(com.amap.api.maps.AMap$CancelableCallback)>
				clearAnimations(1, false);
	//    9   19:aload_0         
	//   10   20:iconst_1        
	//   11   21:iconst_0        
	//   12   22:invokevirtual   #714 <Method void clearAnimations(int, boolean)>
				return;
	//   13   25:return          
			}
			catch(Throwable throwable)
	//*  14   26:astore_1        
			{
				hm.c(throwable, ((Object)this).getClass().getName(), "CancelableCallback.onCancel");
	//   15   27:aload_1         
	//   16   28:aload_0         
	//   17   29:invokevirtual   #718 <Method Class Object.getClass()>
	//   18   32:invokevirtual   #723 <Method String Class.getName()>
	//   19   35:ldc2            #725 <String "CancelableCallback.onCancel">
	//   20   38:invokestatic    #731 <Method void hm.c(Throwable, String, String)>
				throwable.printStackTrace();
	//   21   41:aload_1         
	//   22   42:invokevirtual   #321 <Method void Throwable.printStackTrace()>
			}
	//   23   45:return          
	}

	public boolean isEngineCreated(int i)
	{
		if(mNativeMapengineInstance != 0L)
	//*   0    0:aload_0         
	//*   1    1:getfield        #72  <Field long mNativeMapengineInstance>
	//*   2    4:lconst_0        
	//*   3    5:lcmp            
	//*   4    6:ifeq            18
			return nativeIsEngineCreated(mNativeMapengineInstance, i);
	//    5    9:aload_0         
	//    6   10:getfield        #72  <Field long mNativeMapengineInstance>
	//    7   13:iload_1         
	//    8   14:invokestatic    #734 <Method boolean nativeIsEngineCreated(long, int)>
	//    9   17:ireturn         
		else
			return false;
	//   10   18:iconst_0        
	//   11   19:ireturn         
	}

	public boolean isInMapAction(int i)
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public boolean isInMapAnimation(int i)
	{
		return getAnimateionsCount() > 0;
	//    0    0:aload_0         
	//    1    1:invokevirtual   #737 <Method int getAnimateionsCount()>
	//    2    4:ifle            9
	//    3    7:iconst_1        
	//    4    8:ireturn         
	//    5    9:iconst_0        
	//    6   10:ireturn         
	}

	public void netError(int i, long l, int j)
	{
	//    0    0:return          
	}

	public void networkStateChanged(Context context1)
	{
		if(mNativeMapengineInstance != 0L)
	//*   0    0:aload_0         
	//*   1    1:getfield        #72  <Field long mNativeMapengineInstance>
	//*   2    4:lconst_0        
	//*   3    5:lcmp            
	//*   4    6:ifeq            37
		{
			boolean flag = NetworkState.isNetworkConnected(context1);
	//    5    9:aload_1         
	//    6   10:invokestatic    #239 <Method boolean NetworkState.isNetworkConnected(Context)>
	//    7   13:istore_3        
			long l = mNativeMapengineInstance;
	//    8   14:aload_0         
	//    9   15:getfield        #72  <Field long mNativeMapengineInstance>
	//   10   18:lstore          4
			int i;
			if(flag)
	//*  11   20:iload_3         
	//*  12   21:ifeq            29
				i = 1;
	//   13   24:iconst_1        
	//   14   25:istore_2        
			else
	//*  15   26:goto            31
				i = 0;
	//   16   29:iconst_0        
	//   17   30:istore_2        
			nativeSetNetStatus(l, i);
	//   18   31:lload           4
	//   19   33:iload_2         
	//   20   34:invokestatic    #243 <Method void nativeSetNetStatus(long, int)>
		}
	//   21   37:return          
	}

	public void onClearCache(int i)
	{
	//    0    0:return          
	}

	public void onMapRender(int i, int j)
	{
		j;
	//    0    0:iload_2         
		JVM INSTR lookupswitch 3: default 36
	//	               5: 39
	//	               6: 64
	//	               13: 89;
	//    1    1:lookupswitch    3: default 36
	//	               5: 39
	//	               6: 64
	//	               13: 89
		   goto _L1 _L2 _L3 _L4
_L1:
		break; /* Loop/switch isn't completed */
	//    2   36:goto            94
_L2:
		try
		{
			if(mMapListener != null)
	//*   3   39:aload_0         
	//*   4   40:getfield        #196 <Field IAMapListener mMapListener>
	//*   5   43:ifnull          94
				mMapListener.beforeDrawLabel(i, getMapState(i));
	//    6   46:aload_0         
	//    7   47:getfield        #196 <Field IAMapListener mMapListener>
	//    8   50:iload_1         
	//    9   51:aload_0         
	//   10   52:iload_1         
	//   11   53:invokevirtual   #745 <Method GLMapState getMapState(int)>
	//   12   56:invokeinterface #748 <Method void IAMapListener.beforeDrawLabel(int, GLMapState)>
		}
	//*  13   61:goto            94
	//*  14   64:aload_0         
	//*  15   65:getfield        #196 <Field IAMapListener mMapListener>
	//*  16   68:ifnull          94
	//*  17   71:aload_0         
	//*  18   72:getfield        #196 <Field IAMapListener mMapListener>
	//*  19   75:iload_1         
	//*  20   76:aload_0         
	//*  21   77:iload_1         
	//*  22   78:invokevirtual   #745 <Method GLMapState getMapState(int)>
	//*  23   81:invokeinterface #751 <Method void IAMapListener.afterDrawLabel(int, GLMapState)>
	//*  24   86:goto            94
	//*  25   89:aload_0         
	//*  26   90:iconst_1        
	//*  27   91:putfield        #108 <Field boolean isEngineRenderComplete>
	//*  28   94:return          
		catch(Throwable throwable)
	//*  29   95:astore_3        
		{
			return;
	//   30   96:return          
		}
		break; /* Loop/switch isn't completed */
_L3:
		if(mMapListener != null)
			mMapListener.afterDrawLabel(i, getMapState(i));
		break; /* Loop/switch isn't completed */
_L4:
		isEngineRenderComplete = true;
	}

	public void popRendererState()
	{
		if(mNativeMapengineInstance != 0L)
	//*   0    0:aload_0         
	//*   1    1:getfield        #72  <Field long mNativeMapengineInstance>
	//*   2    4:lconst_0        
	//*   3    5:lcmp            
	//*   4    6:ifeq            17
			nativePopRenderState(1, mNativeMapengineInstance);
	//    5    9:iconst_1        
	//    6   10:aload_0         
	//    7   11:getfield        #72  <Field long mNativeMapengineInstance>
	//    8   14:invokestatic    #754 <Method void nativePopRenderState(int, long)>
	//    9   17:return          
	}

	public void pushRendererState()
	{
		if(mNativeMapengineInstance != 0L)
	//*   0    0:aload_0         
	//*   1    1:getfield        #72  <Field long mNativeMapengineInstance>
	//*   2    4:lconst_0        
	//*   3    5:lcmp            
	//*   4    6:ifeq            17
			nativePushRendererState(1, mNativeMapengineInstance);
	//    5    9:iconst_1        
	//    6   10:aload_0         
	//    7   11:getfield        #72  <Field long mNativeMapengineInstance>
	//    8   14:invokestatic    #757 <Method void nativePushRendererState(int, long)>
	//    9   17:return          
	}

	public void putResourceData(int i, byte abyte0[])
	{
	//    0    0:return          
	}

	public void receiveNetData(int i, long l, byte abyte0[], int j)
	{
		if(mRequestDestroy)
	//*   0    0:aload_0         
	//*   1    1:getfield        #115 <Field boolean mRequestDestroy>
	//*   2    4:ifeq            8
			return;
	//    3    7:return          
		if(mNativeMapengineInstance != 0L)
	//*   4    8:aload_0         
	//*   5    9:getfield        #72  <Field long mNativeMapengineInstance>
	//*   6   12:lconst_0        
	//*   7   13:lcmp            
	//*   8   14:ifeq            30
			nativeReceiveNetData(i, mNativeMapengineInstance, abyte0, l, j);
	//    9   17:iload_1         
	//   10   18:aload_0         
	//   11   19:getfield        #72  <Field long mNativeMapengineInstance>
	//   12   22:aload           4
	//   13   24:lload_2         
	//   14   25:iload           5
	//   15   27:invokestatic    #762 <Method void nativeReceiveNetData(int, long, byte[], long, int)>
	//   16   30:return          
	}

	public void releaseNetworkState()
	{
		if(mNetworkState != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #104 <Field NetworkState mNetworkState>
	//*   2    4:ifnull          35
		{
			mNetworkState.registerNetChangeReceiver(context.getApplicationContext(), false);
	//    3    7:aload_0         
	//    4    8:getfield        #104 <Field NetworkState mNetworkState>
	//    5   11:aload_0         
	//    6   12:getfield        #123 <Field Context context>
	//    7   15:invokevirtual   #121 <Method Context Context.getApplicationContext()>
	//    8   18:iconst_0        
	//    9   19:invokevirtual   #235 <Method void NetworkState.registerNetChangeReceiver(Context, boolean)>
			mNetworkState.setNetworkListener(((com.autonavi.amap.mapcore.maploader.NetworkState.NetworkChangeListener) (null)));
	//   10   22:aload_0         
	//   11   23:getfield        #104 <Field NetworkState mNetworkState>
	//   12   26:aconst_null     
	//   13   27:invokevirtual   #231 <Method void NetworkState.setNetworkListener(com.autonavi.amap.mapcore.maploader.NetworkState$NetworkChangeListener)>
			mNetworkState = null;
	//   14   30:aload_0         
	//   15   31:aconst_null     
	//   16   32:putfield        #104 <Field NetworkState mNetworkState>
		}
	//   17   35:return          
	}

	public void reloadMapResource(int i, String s1, int j)
	{
	//    0    0:return          
	}

	public void renderAMap()
	{
		if(mNativeMapengineInstance == 0L)
			break MISSING_BLOCK_LABEL_72;
	//    0    0:aload_0         
	//    1    1:getfield        #72  <Field long mNativeMapengineInstance>
	//    2    4:lconst_0        
	//    3    5:lcmp            
	//    4    6:ifeq            72
		boolean flag = processMessage();
	//    5    9:aload_0         
	//    6   10:invokespecial   #768 <Method boolean processMessage()>
	//    7   13:istore_1        
		com/autonavi/ae/gmap/GLMapEngine;
	//    8   14:ldc1            #2   <Class GLMapEngine>
		JVM INSTR monitorenter ;
	//    9   16:monitorenter    
		nativeRenderAMap(mNativeMapengineInstance, 1);
	//   10   17:aload_0         
	//   11   18:getfield        #72  <Field long mNativeMapengineInstance>
	//   12   21:iconst_1        
	//   13   22:invokestatic    #770 <Method void nativeRenderAMap(long, int)>
		nativePostRenderAMap(mNativeMapengineInstance, 1);
	//   14   25:aload_0         
	//   15   26:getfield        #72  <Field long mNativeMapengineInstance>
	//   16   29:iconst_1        
	//   17   30:invokestatic    #772 <Method void nativePostRenderAMap(long, int)>
		com/autonavi/ae/gmap/GLMapEngine;
	//   18   33:ldc1            #2   <Class GLMapEngine>
		JVM INSTR monitorexit ;
	//   19   35:monitorexit     
		  goto _L1
	//*  20   36:goto            45
		Exception exception;
		exception;
	//   21   39:astore_2        
	//*  22   40:ldc1            #2   <Class GLMapEngine>
		throw exception;
	//   23   42:monitorexit     
	//   24   43:aload_2         
	//   25   44:athrow          
_L1:
		initAnimation();
	//   26   45:aload_0         
	//   27   46:invokespecial   #774 <Method void initAnimation()>
		if(flag)
	//*  28   49:iload_1         
	//*  29   50:ifeq            57
			startCheckEngineRenderComplete();
	//   30   53:aload_0         
	//   31   54:invokevirtual   #777 <Method void startCheckEngineRenderComplete()>
		if(!isEngineRenderComplete)
	//*  32   57:aload_0         
	//*  33   58:getfield        #108 <Field boolean isEngineRenderComplete>
	//*  34   61:ifne            72
			nativeSetRenderListenerStatus(1, mNativeMapengineInstance);
	//   35   64:iconst_1        
	//   36   65:aload_0         
	//   37   66:getfield        #72  <Field long mNativeMapengineInstance>
	//   38   69:invokestatic    #779 <Method void nativeSetRenderListenerStatus(int, long)>
	//   39   72:return          
	}

	public byte[] requireCharBitmap(int i, int j, int k)
	{
		return mTextTextureGenerator.getTextPixelBuffer(j, k);
	//    0    0:aload_0         
	//    1    1:getfield        #128 <Field TextTextureGenerator mTextTextureGenerator>
	//    2    4:iload_2         
	//    3    5:iload_3         
	//    4    6:invokevirtual   #785 <Method byte[] TextTextureGenerator.getTextPixelBuffer(int, int)>
	//    5    9:areturn         
	}

	public byte[] requireCharsWidths(int i, int ai[], int j, int k)
	{
		return mTextTextureGenerator.getCharsWidths(ai);
	//    0    0:aload_0         
	//    1    1:getfield        #128 <Field TextTextureGenerator mTextTextureGenerator>
	//    2    4:aload_2         
	//    3    5:invokevirtual   #791 <Method byte[] TextTextureGenerator.getCharsWidths(int[])>
	//    4    8:areturn         
	}

	public void requireMapData(int i, final byte mapLoader[])
	{
		if(mRequestDestroy)
	//*   0    0:aload_0         
	//*   1    1:getfield        #115 <Field boolean mRequestDestroy>
	//*   2    4:ifeq            8
			return;
	//    3    7:return          
		if(mapLoader == null)
			break MISSING_BLOCK_LABEL_232;
	//    4    8:aload_2         
	//    5    9:ifnull          232
		com.autonavi.amap.mapcore.maploader.AMapLoader.ADataRequestParam adatarequestparam = new com.autonavi.amap.mapcore.maploader.AMapLoader.ADataRequestParam();
	//    6   12:new             #794 <Class com.autonavi.amap.mapcore.maploader.AMapLoader$ADataRequestParam>
	//    7   15:dup             
	//    8   16:invokespecial   #795 <Method void com.autonavi.amap.mapcore.maploader.AMapLoader$ADataRequestParam()>
	//    9   19:astore          5
		int j = GLConvertUtil.getInt(mapLoader, 0);
	//   10   21:aload_2         
	//   11   22:iconst_0        
	//   12   23:invokestatic    #801 <Method int GLConvertUtil.getInt(byte[], int)>
	//   13   26:istore_3        
		adatarequestparam.requestBaseUrl = GLConvertUtil.getString(mapLoader, 0 + 4, j);
	//   14   27:aload           5
	//   15   29:aload_2         
	//   16   30:iconst_0        
	//   17   31:iconst_4        
	//   18   32:iadd            
	//   19   33:iload_3         
	//   20   34:invokestatic    #805 <Method String GLConvertUtil.getString(byte[], int, int)>
	//   21   37:putfield        #808 <Field String com.autonavi.amap.mapcore.maploader.AMapLoader$ADataRequestParam.requestBaseUrl>
		int k = j + 4;
	//   22   40:iload_3         
	//   23   41:iconst_4        
	//   24   42:iadd            
	//   25   43:istore          4
		j = GLConvertUtil.getInt(mapLoader, k);
	//   26   45:aload_2         
	//   27   46:iload           4
	//   28   48:invokestatic    #801 <Method int GLConvertUtil.getInt(byte[], int)>
	//   29   51:istore_3        
		k += 4;
	//   30   52:iload           4
	//   31   54:iconst_4        
	//   32   55:iadd            
	//   33   56:istore          4
		adatarequestparam.requestUrl = GLConvertUtil.getString(mapLoader, k, j);
	//   34   58:aload           5
	//   35   60:aload_2         
	//   36   61:iload           4
	//   37   63:iload_3         
	//   38   64:invokestatic    #805 <Method String GLConvertUtil.getString(byte[], int, int)>
	//   39   67:putfield        #811 <Field String com.autonavi.amap.mapcore.maploader.AMapLoader$ADataRequestParam.requestUrl>
		j = k + j;
	//   40   70:iload           4
	//   41   72:iload_3         
	//   42   73:iadd            
	//   43   74:istore_3        
		adatarequestparam.handler = GLConvertUtil.getLong(mapLoader, j);
	//   44   75:aload           5
	//   45   77:aload_2         
	//   46   78:iload_3         
	//   47   79:invokestatic    #815 <Method long GLConvertUtil.getLong(byte[], int)>
	//   48   82:putfield        #818 <Field long com.autonavi.amap.mapcore.maploader.AMapLoader$ADataRequestParam.handler>
		j += 8;
	//   49   85:iload_3         
	//   50   86:bipush          8
	//   51   88:iadd            
	//   52   89:istore_3        
		adatarequestparam.nRequestType = GLConvertUtil.getInt(mapLoader, j);
	//   53   90:aload           5
	//   54   92:aload_2         
	//   55   93:iload_3         
	//   56   94:invokestatic    #801 <Method int GLConvertUtil.getInt(byte[], int)>
	//   57   97:putfield        #821 <Field int com.autonavi.amap.mapcore.maploader.AMapLoader$ADataRequestParam.nRequestType>
		k = j + 4;
	//   58  100:iload_3         
	//   59  101:iconst_4        
	//   60  102:iadd            
	//   61  103:istore          4
		j = GLConvertUtil.getInt(mapLoader, k);
	//   62  105:aload_2         
	//   63  106:iload           4
	//   64  108:invokestatic    #801 <Method int GLConvertUtil.getInt(byte[], int)>
	//   65  111:istore_3        
		k += 4;
	//   66  112:iload           4
	//   67  114:iconst_4        
	//   68  115:iadd            
	//   69  116:istore          4
		adatarequestparam.enCodeString = GLConvertUtil.getSubBytes(mapLoader, k, j);
	//   70  118:aload           5
	//   71  120:aload_2         
	//   72  121:iload           4
	//   73  123:iload_3         
	//   74  124:invokestatic    #825 <Method byte[] GLConvertUtil.getSubBytes(byte[], int, int)>
	//   75  127:putfield        #829 <Field byte[] com.autonavi.amap.mapcore.maploader.AMapLoader$ADataRequestParam.enCodeString>
		adatarequestparam.nCompress = GLConvertUtil.getInt(mapLoader, k + j);
	//   76  130:aload           5
	//   77  132:aload_2         
	//   78  133:iload           4
	//   79  135:iload_3         
	//   80  136:iadd            
	//   81  137:invokestatic    #801 <Method int GLConvertUtil.getInt(byte[], int)>
	//   82  140:putfield        #832 <Field int com.autonavi.amap.mapcore.maploader.AMapLoader$ADataRequestParam.nCompress>
		mapLoader = ((byte []) (new AMapLoader(i, this, adatarequestparam)));
	//   83  143:new             #494 <Class AMapLoader>
	//   84  146:dup             
	//   85  147:iload_1         
	//   86  148:aload_0         
	//   87  149:aload           5
	//   88  151:invokespecial   #835 <Method void AMapLoader(int, GLMapEngine, com.autonavi.amap.mapcore.maploader.AMapLoader$ADataRequestParam)>
	//   89  154:astore_2        
		aMapLoaderHashtable.put(((Object) (Long.valueOf(adatarequestparam.handler))), ((Object) (mapLoader)));
	//   90  155:aload_0         
	//   91  156:getfield        #113 <Field Hashtable aMapLoaderHashtable>
	//   92  159:aload           5
	//   93  161:getfield        #818 <Field long com.autonavi.amap.mapcore.maploader.AMapLoader$ADataRequestParam.handler>
	//   94  164:invokestatic    #603 <Method Long Long.valueOf(long)>
	//   95  167:aload_2         
	//   96  168:invokevirtual   #839 <Method Object Hashtable.put(Object, Object)>
	//   97  171:pop             
		mapLoader.isFinish = false;
	//   98  172:aload_2         
	//   99  173:iconst_0        
	//  100  174:putfield        #500 <Field boolean AMapLoader.isFinish>
		fc.a().a(new Runnable() {

			public void run()
			{
				boolean flag = mRequestDestroy;
			//    0    0:aload_0         
			//    1    1:getfield        #19  <Field GLMapEngine this$0>
			//    2    4:getfield        #32  <Field boolean GLMapEngine.mRequestDestroy>
			//    3    7:istore_1        
				if(!flag)
					break MISSING_BLOCK_LABEL_70;
			//    4    8:iload_1         
			//    5    9:ifeq            70
				if(mapLoader == null || mapLoader.isFinish)
					break MISSING_BLOCK_LABEL_69;
			//    6   12:aload_0         
			//    7   13:getfield        #21  <Field AMapLoader val$mapLoader>
			//    8   16:ifnull          69
			//    9   19:aload_0         
			//   10   20:getfield        #21  <Field AMapLoader val$mapLoader>
			//   11   23:getfield        #37  <Field boolean AMapLoader.isFinish>
			//   12   26:ifne            69
				AMapLoader amaploader = mapLoader;
			//   13   29:aload_0         
			//   14   30:getfield        #21  <Field AMapLoader val$mapLoader>
			//   15   33:astore_2        
				amaploader;
			//   16   34:aload_2         
				JVM INSTR monitorenter ;
			//   17   35:monitorenter    
				if(!mapLoader.isFinish)
			//*  18   36:aload_0         
			//*  19   37:getfield        #21  <Field AMapLoader val$mapLoader>
			//*  20   40:getfield        #37  <Field boolean AMapLoader.isFinish>
			//*  21   43:ifne            61
				{
					((Object) (mapLoader)).notify();
			//   22   46:aload_0         
			//   23   47:getfield        #21  <Field AMapLoader val$mapLoader>
			//   24   50:invokevirtual   #40  <Method void Object.notify()>
					mapLoader.isFinish = true;
			//   25   53:aload_0         
			//   26   54:getfield        #21  <Field AMapLoader val$mapLoader>
			//   27   57:iconst_1        
			//   28   58:putfield        #37  <Field boolean AMapLoader.isFinish>
				}
				amaploader;
			//   29   61:aload_2         
				JVM INSTR monitorexit ;
			//   30   62:monitorexit     
				return;
			//   31   63:return          
				Exception exception1;
				exception1;
			//   32   64:astore_3        
			//*  33   65:aload_2         
				throw exception1;
			//   34   66:monitorexit     
			//   35   67:aload_3         
			//   36   68:athrow          
				return;
			//   37   69:return          
				amaploader = mapLoader;
			//   38   70:aload_0         
			//   39   71:getfield        #21  <Field AMapLoader val$mapLoader>
			//   40   74:astore_2        
				if(amaploader != null)
					break MISSING_BLOCK_LABEL_137;
			//   41   75:aload_2         
			//   42   76:ifnonnull       137
				if(mapLoader == null || mapLoader.isFinish)
					break MISSING_BLOCK_LABEL_136;
			//   43   79:aload_0         
			//   44   80:getfield        #21  <Field AMapLoader val$mapLoader>
			//   45   83:ifnull          136
			//   46   86:aload_0         
			//   47   87:getfield        #21  <Field AMapLoader val$mapLoader>
			//   48   90:getfield        #37  <Field boolean AMapLoader.isFinish>
			//   49   93:ifne            136
				amaploader = mapLoader;
			//   50   96:aload_0         
			//   51   97:getfield        #21  <Field AMapLoader val$mapLoader>
			//   52  100:astore_2        
				amaploader;
			//   53  101:aload_2         
				JVM INSTR monitorenter ;
			//   54  102:monitorenter    
				if(!mapLoader.isFinish)
			//*  55  103:aload_0         
			//*  56  104:getfield        #21  <Field AMapLoader val$mapLoader>
			//*  57  107:getfield        #37  <Field boolean AMapLoader.isFinish>
			//*  58  110:ifne            128
				{
					((Object) (mapLoader)).notify();
			//   59  113:aload_0         
			//   60  114:getfield        #21  <Field AMapLoader val$mapLoader>
			//   61  117:invokevirtual   #40  <Method void Object.notify()>
					mapLoader.isFinish = true;
			//   62  120:aload_0         
			//   63  121:getfield        #21  <Field AMapLoader val$mapLoader>
			//   64  124:iconst_1        
			//   65  125:putfield        #37  <Field boolean AMapLoader.isFinish>
				}
				amaploader;
			//   66  128:aload_2         
				JVM INSTR monitorexit ;
			//   67  129:monitorexit     
				return;
			//   68  130:return          
				exception1;
			//   69  131:astore_3        
			//*  70  132:aload_2         
				throw exception1;
			//   71  133:monitorexit     
			//   72  134:aload_3         
			//   73  135:athrow          
				return;
			//   74  136:return          
				mapLoader.doRequest();
			//   75  137:aload_0         
			//   76  138:getfield        #21  <Field AMapLoader val$mapLoader>
			//   77  141:invokevirtual   #43  <Method void AMapLoader.doRequest()>
				if(mapLoader == null || mapLoader.isFinish)
					break MISSING_BLOCK_LABEL_335;
			//   78  144:aload_0         
			//   79  145:getfield        #21  <Field AMapLoader val$mapLoader>
			//   80  148:ifnull          335
			//   81  151:aload_0         
			//   82  152:getfield        #21  <Field AMapLoader val$mapLoader>
			//   83  155:getfield        #37  <Field boolean AMapLoader.isFinish>
			//   84  158:ifne            335
				amaploader = mapLoader;
			//   85  161:aload_0         
			//   86  162:getfield        #21  <Field AMapLoader val$mapLoader>
			//   87  165:astore_2        
				amaploader;
			//   88  166:aload_2         
				JVM INSTR monitorenter ;
			//   89  167:monitorenter    
				if(!mapLoader.isFinish)
			//*  90  168:aload_0         
			//*  91  169:getfield        #21  <Field AMapLoader val$mapLoader>
			//*  92  172:getfield        #37  <Field boolean AMapLoader.isFinish>
			//*  93  175:ifne            193
				{
					((Object) (mapLoader)).notify();
			//   94  178:aload_0         
			//   95  179:getfield        #21  <Field AMapLoader val$mapLoader>
			//   96  182:invokevirtual   #40  <Method void Object.notify()>
					mapLoader.isFinish = true;
			//   97  185:aload_0         
			//   98  186:getfield        #21  <Field AMapLoader val$mapLoader>
			//   99  189:iconst_1        
			//  100  190:putfield        #37  <Field boolean AMapLoader.isFinish>
				}
				amaploader;
			//  101  193:aload_2         
				JVM INSTR monitorexit ;
			//  102  194:monitorexit     
				  goto _L1
			//* 103  195:goto            203
				exception1;
			//  104  198:astore_3        
			//* 105  199:aload_2         
				throw exception1;
			//  106  200:monitorexit     
			//  107  201:aload_3         
			//  108  202:athrow          
_L1:
				return;
			//  109  203:return          
				Throwable throwable;
				throwable;
			//  110  204:astore_2        
				hm.c(throwable, "download Thread", "AMapLoader doRequest");
			//  111  205:aload_2         
			//  112  206:ldc1            #45  <String "download Thread">
			//  113  208:ldc1            #47  <String "AMapLoader doRequest">
			//  114  210:invokestatic    #53  <Method void hm.c(Throwable, String, String)>
				if(mapLoader == null || mapLoader.isFinish)
					break MISSING_BLOCK_LABEL_335;
			//  115  213:aload_0         
			//  116  214:getfield        #21  <Field AMapLoader val$mapLoader>
			//  117  217:ifnull          335
			//  118  220:aload_0         
			//  119  221:getfield        #21  <Field AMapLoader val$mapLoader>
			//  120  224:getfield        #37  <Field boolean AMapLoader.isFinish>
			//  121  227:ifne            335
				throwable = ((Throwable) (mapLoader));
			//  122  230:aload_0         
			//  123  231:getfield        #21  <Field AMapLoader val$mapLoader>
			//  124  234:astore_2        
				throwable;
			//  125  235:aload_2         
				JVM INSTR monitorenter ;
			//  126  236:monitorenter    
				if(!mapLoader.isFinish)
			//* 127  237:aload_0         
			//* 128  238:getfield        #21  <Field AMapLoader val$mapLoader>
			//* 129  241:getfield        #37  <Field boolean AMapLoader.isFinish>
			//* 130  244:ifne            262
				{
					((Object) (mapLoader)).notify();
			//  131  247:aload_0         
			//  132  248:getfield        #21  <Field AMapLoader val$mapLoader>
			//  133  251:invokevirtual   #40  <Method void Object.notify()>
					mapLoader.isFinish = true;
			//  134  254:aload_0         
			//  135  255:getfield        #21  <Field AMapLoader val$mapLoader>
			//  136  258:iconst_1        
			//  137  259:putfield        #37  <Field boolean AMapLoader.isFinish>
				}
				throwable;
			//  138  262:aload_2         
				JVM INSTR monitorexit ;
			//  139  263:monitorexit     
				  goto _L2
			//* 140  264:goto            272
				exception1;
			//  141  267:astore_3        
			//* 142  268:aload_2         
				throw exception1;
			//  143  269:monitorexit     
			//  144  270:aload_3         
			//  145  271:athrow          
_L2:
				return;
			//  146  272:return          
				exception1;
			//  147  273:astore_3        
				if(mapLoader == null || mapLoader.isFinish)
					break MISSING_BLOCK_LABEL_333;
			//  148  274:aload_0         
			//  149  275:getfield        #21  <Field AMapLoader val$mapLoader>
			//  150  278:ifnull          333
			//  151  281:aload_0         
			//  152  282:getfield        #21  <Field AMapLoader val$mapLoader>
			//  153  285:getfield        #37  <Field boolean AMapLoader.isFinish>
			//  154  288:ifne            333
				throwable = ((Throwable) (mapLoader));
			//  155  291:aload_0         
			//  156  292:getfield        #21  <Field AMapLoader val$mapLoader>
			//  157  295:astore_2        
				throwable;
			//  158  296:aload_2         
				JVM INSTR monitorenter ;
			//  159  297:monitorenter    
				if(!mapLoader.isFinish)
			//* 160  298:aload_0         
			//* 161  299:getfield        #21  <Field AMapLoader val$mapLoader>
			//* 162  302:getfield        #37  <Field boolean AMapLoader.isFinish>
			//* 163  305:ifne            323
				{
					((Object) (mapLoader)).notify();
			//  164  308:aload_0         
			//  165  309:getfield        #21  <Field AMapLoader val$mapLoader>
			//  166  312:invokevirtual   #40  <Method void Object.notify()>
					mapLoader.isFinish = true;
			//  167  315:aload_0         
			//  168  316:getfield        #21  <Field AMapLoader val$mapLoader>
			//  169  319:iconst_1        
			//  170  320:putfield        #37  <Field boolean AMapLoader.isFinish>
				}
				throwable;
			//  171  323:aload_2         
				JVM INSTR monitorexit ;
			//  172  324:monitorexit     
				break MISSING_BLOCK_LABEL_333;
			//  173  325:goto            333
				exception1;
			//  174  328:astore_3        
			//* 175  329:aload_2         
				throw exception1;
			//  176  330:monitorexit     
			//  177  331:aload_3         
			//  178  332:athrow          
				throw exception1;
			//  179  333:aload_3         
			//  180  334:athrow          
			//  181  335:return          
			}

			final GLMapEngine this$0;
			final AMapLoader val$mapLoader;

			
			{
				this$0 = GLMapEngine.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field GLMapEngine this$0>
				mapLoader = amaploader;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #21  <Field AMapLoader val$mapLoader>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #24  <Method void Object()>
			//    8   14:return          
			}
		}
);
	//  101  177:invokestatic    #843 <Method fc fc.a()>
	//  102  180:new             #10  <Class GLMapEngine$1>
	//  103  183:dup             
	//  104  184:aload_0         
	//  105  185:aload_2         
	//  106  186:invokespecial   #846 <Method void GLMapEngine$1(GLMapEngine, AMapLoader)>
	//  107  189:invokevirtual   #849 <Method void fc.a(Runnable)>
		mapLoader;
	//  108  192:aload_2         
		JVM INSTR monitorenter ;
	//  109  193:monitorenter    
		while(!((AMapLoader) (mapLoader)).isFinish) 
	//* 110  194:aload_2         
	//* 111  195:getfield        #500 <Field boolean AMapLoader.isFinish>
	//* 112  198:ifne            208
			((Object) (mapLoader)).wait();
	//  113  201:aload_2         
	//  114  202:invokevirtual   #852 <Method void Object.wait()>
	//* 115  205:goto            194
		mapLoader;
	//  116  208:aload_2         
		JVM INSTR monitorexit ;
	//  117  209:monitorexit     
		  goto _L1
	//* 118  210:goto            220
		Exception exception;
		exception;
	//  119  213:astore          5
	//* 120  215:aload_2         
		throw exception;
	//  121  216:monitorexit     
	//  122  217:aload           5
	//  123  219:athrow          
_L1:
		return;
	//  124  220:return          
		mapLoader;
	//  125  221:astore_2        
		hm.c(((Throwable) (mapLoader)), "download Thread", "requireMapData");
	//  126  222:aload_2         
	//  127  223:ldc2            #854 <String "download Thread">
	//  128  226:ldc2            #855 <String "requireMapData">
	//  129  229:invokestatic    #731 <Method void hm.c(Throwable, String, String)>
	//  130  232:return          
	}

	public void requireMapRender(int i, int j, int k)
	{
	//    0    0:return          
	}

	public byte[] requireMapResource(int i, String s1)
	{
		byte abyte0[];
		String s2;
		if(s1 == null)
	//*   0    0:aload_2         
	//*   1    1:ifnonnull       6
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		abyte0 = null;
	//    4    6:aconst_null     
	//    5    7:astore_3        
		s2 = (new StringBuilder()).append("map_assets/").append(s1).toString();
	//    6    8:new             #140 <Class StringBuilder>
	//    7   11:dup             
	//    8   12:invokespecial   #141 <Method void StringBuilder()>
	//    9   15:ldc2            #860 <String "map_assets/">
	//   10   18:invokevirtual   #153 <Method StringBuilder StringBuilder.append(String)>
	//   11   21:aload_2         
	//   12   22:invokevirtual   #153 <Method StringBuilder StringBuilder.append(String)>
	//   13   25:invokevirtual   #165 <Method String StringBuilder.toString()>
	//   14   28:astore          4
		if(!mGlMapView.getMapConfig().isCustomStyleEnable())
			break MISSING_BLOCK_LABEL_125;
	//   15   30:aload_0         
	//   16   31:getfield        #74  <Field s mGlMapView>
	//   17   34:invokeinterface #620 <Method MapConfig s.getMapConfig()>
	//   18   39:invokevirtual   #863 <Method boolean MapConfig.isCustomStyleEnable()>
	//   19   42:ifeq            125
		if(s1.startsWith("icons_5"))
	//*  20   45:aload_2         
	//*  21   46:ldc2            #865 <String "icons_5">
	//*  22   49:invokevirtual   #871 <Method boolean String.startsWith(String)>
	//*  23   52:ifeq            74
		{
			abyte0 = FileUtil.readFileContents(mGlMapView.getMapConfig().getCustomTextureResourcePath());
	//   24   55:aload_0         
	//   25   56:getfield        #74  <Field s mGlMapView>
	//   26   59:invokeinterface #620 <Method MapConfig s.getMapConfig()>
	//   27   64:invokevirtual   #874 <Method String MapConfig.getCustomTextureResourcePath()>
	//   28   67:invokestatic    #880 <Method byte[] FileUtil.readFileContents(String)>
	//   29   70:astore_3        
			break MISSING_BLOCK_LABEL_119;
	//   30   71:goto            119
		}
		if(!s1.startsWith("bktile"))
			break MISSING_BLOCK_LABEL_119;
	//   31   74:aload_2         
	//   32   75:ldc2            #882 <String "bktile">
	//   33   78:invokevirtual   #871 <Method boolean String.startsWith(String)>
	//   34   81:ifeq            119
		s1 = ((String) (FileUtil.readFileContentsFromAssets(context, s2)));
	//   35   84:aload_0         
	//   36   85:getfield        #123 <Field Context context>
	//   37   88:aload           4
	//   38   90:invokestatic    #886 <Method byte[] FileUtil.readFileContentsFromAssets(Context, String)>
	//   39   93:astore_2        
		i = mGlMapView.getMapConfig().getCustomBackgroundColor();
	//   40   94:aload_0         
	//   41   95:getfield        #74  <Field s mGlMapView>
	//   42   98:invokeinterface #620 <Method MapConfig s.getMapConfig()>
	//   43  103:invokevirtual   #889 <Method int MapConfig.getCustomBackgroundColor()>
	//   44  106:istore_1        
		abyte0 = ((byte []) (s1));
	//   45  107:aload_2         
	//   46  108:astore_3        
		if(i != 0)
	//*  47  109:iload_1         
	//*  48  110:ifeq            119
			try
			{
				abyte0 = fd.b(((byte []) (s1)), i);
	//   49  113:aload_2         
	//   50  114:iload_1         
	//   51  115:invokestatic    #894 <Method byte[] fd.b(byte[], int)>
	//   52  118:astore_3        
			}
	//*  53  119:aload_3         
	//*  54  120:ifnull          125
	//*  55  123:aload_3         
	//*  56  124:areturn         
	//*  57  125:aload_0         
	//*  58  126:getfield        #123 <Field Context context>
	//*  59  129:aload           4
	//*  60  131:invokestatic    #886 <Method byte[] FileUtil.readFileContentsFromAssets(Context, String)>
	//*  61  134:astore_2        
	//*  62  135:aload_2         
	//*  63  136:areturn         
			// Misplaced declaration of an exception variable
			catch(String s1)
	//*  64  137:astore_2        
			{
				return null;
	//   65  138:aconst_null     
	//   66  139:areturn         
			}
		if(abyte0 != null)
			return abyte0;
		s1 = ((String) (FileUtil.readFileContentsFromAssets(context, s2)));
		return ((byte []) (s1));
	}

	public void setBackgroundTexture(int i, byte abyte0[])
	{
		if(abyte0 == null)
	//*   0    0:aload_2         
	//*   1    1:ifnonnull       5
			return;
	//    2    4:return          
		if(mNativeMapengineInstance != 0L)
	//*   3    5:aload_0         
	//*   4    6:getfield        #72  <Field long mNativeMapengineInstance>
	//*   5    9:lconst_0        
	//*   6   10:lcmp            
	//*   7   11:ifeq            23
			nativeSetSetBackgroundTexture(i, mNativeMapengineInstance, abyte0);
	//    8   14:iload_1         
	//    9   15:aload_0         
	//   10   16:getfield        #72  <Field long mNativeMapengineInstance>
	//   11   19:aload_2         
	//   12   20:invokestatic    #897 <Method void nativeSetSetBackgroundTexture(int, long, byte[])>
	//   13   23:return          
	}

	public void setBuildingEnable(int i, boolean flag)
	{
		if(mNativeMapengineInstance != 0L)
	//*   0    0:aload_0         
	//*   1    1:getfield        #72  <Field long mNativeMapengineInstance>
	//*   2    4:lconst_0        
	//*   3    5:lcmp            
	//*   4    6:ifeq            18
			nativeSetBuildingEnable(i, mNativeMapengineInstance, flag);
	//    5    9:iload_1         
	//    6   10:aload_0         
	//    7   11:getfield        #72  <Field long mNativeMapengineInstance>
	//    8   14:iload_2         
	//    9   15:invokestatic    #900 <Method void nativeSetBuildingEnable(int, long, boolean)>
	//   10   18:return          
	}

	public void setCustomStyleTexture(int i, byte abyte0[])
	{
		if(abyte0 == null)
	//*   0    0:aload_2         
	//*   1    1:ifnonnull       5
			return;
	//    2    4:return          
		if(mNativeMapengineInstance != 0L)
	//*   3    5:aload_0         
	//*   4    6:getfield        #72  <Field long mNativeMapengineInstance>
	//*   5    9:lconst_0        
	//*   6   10:lcmp            
	//*   7   11:ifeq            23
			nativeSetCustomStyleTexture(i, mNativeMapengineInstance, abyte0);
	//    8   14:iload_1         
	//    9   15:aload_0         
	//   10   16:getfield        #72  <Field long mNativeMapengineInstance>
	//   11   19:aload_2         
	//   12   20:invokestatic    #903 <Method void nativeSetCustomStyleTexture(int, long, byte[])>
	//   13   23:return          
	}

	public void setIndoorBuildingToBeActive(int i, String s1, int j, String s2)
	{
		if(TextUtils.isEmpty(((CharSequence) (s1))) || TextUtils.isEmpty(((CharSequence) (s2))))
	//*   0    0:aload_2         
	//*   1    1:invokestatic    #911 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*   2    4:ifne            15
	//*   3    7:aload           4
	//*   4    9:invokestatic    #911 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*   5   12:ifeq            16
			return;
	//    6   15:return          
		if(mNativeMapengineInstance != 0L)
	//*   7   16:aload_0         
	//*   8   17:getfield        #72  <Field long mNativeMapengineInstance>
	//*   9   20:lconst_0        
	//*  10   21:lcmp            
	//*  11   22:ifeq            37
			nativeSetIndoorBuildingToBeActive(i, mNativeMapengineInstance, s1, j, s2);
	//   12   25:iload_1         
	//   13   26:aload_0         
	//   14   27:getfield        #72  <Field long mNativeMapengineInstance>
	//   15   30:aload_2         
	//   16   31:iload_3         
	//   17   32:aload           4
	//   18   34:invokestatic    #913 <Method void nativeSetIndoorBuildingToBeActive(int, long, String, int, String)>
	//   19   37:return          
	}

	public void setInternaltexture(int i, byte abyte0[], int j)
	{
	//    0    0:return          
	}

	public void setMapListener(IAMapListener iamaplistener)
	{
		mMapListener = iamaplistener;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #196 <Field IAMapListener mMapListener>
	//    3    5:return          
	}

	public void setMapLoaderToTask(int i, long l, AMapLoader amaploader)
	{
	//    0    0:return          
	}

	public boolean setMapModeAndStyle(int i, int j, int k, int l, boolean flag, boolean flag1, StyleItem astyleitem[])
	{
		if(mNativeMapengineInstance == 0L)
	//*   0    0:aload_0         
	//*   1    1:getfield        #72  <Field long mNativeMapengineInstance>
	//*   2    4:lconst_0        
	//*   3    5:lcmp            
	//*   4    6:ifne            11
			return false;
	//    5    9:iconst_0        
	//    6   10:ireturn         
		flag = nativeSetMapModeAndStyle(i, mNativeMapengineInstance, new int[] {
			j, k, l, 0, 0
		}, flag, flag1, astyleitem);
	//    7   11:iload_1         
	//    8   12:aload_0         
	//    9   13:getfield        #72  <Field long mNativeMapengineInstance>
	//   10   16:iconst_5        
	//   11   17:newarray        int[]
	//   12   19:dup             
	//   13   20:iconst_0        
	//   14   21:iload_2         
	//   15   22:iastore         
	//   16   23:dup             
	//   17   24:iconst_1        
	//   18   25:iload_3         
	//   19   26:iastore         
	//   20   27:dup             
	//   21   28:iconst_2        
	//   22   29:iload           4
	//   23   31:iastore         
	//   24   32:dup             
	//   25   33:iconst_3        
	//   26   34:iconst_0        
	//   27   35:iastore         
	//   28   36:dup             
	//   29   37:iconst_4        
	//   30   38:iconst_0        
	//   31   39:iastore         
	//   32   40:iload           5
	//   33   42:iload           6
	//   34   44:aload           7
	//   35   46:invokestatic    #923 <Method boolean nativeSetMapModeAndStyle(int, long, int[], boolean, boolean, StyleItem[])>
	//   36   49:istore          5
		if(astyleitem != null && flag1)
	//*  37   51:aload           7
	//*  38   53:ifnull          185
	//*  39   56:iload           6
	//*  40   58:ifeq            185
		{
			j = mGlMapView.getMapConfig().getCustomBackgroundColor();
	//   41   61:aload_0         
	//   42   62:getfield        #74  <Field s mGlMapView>
	//   43   65:invokeinterface #620 <Method MapConfig s.getMapConfig()>
	//   44   70:invokevirtual   #889 <Method int MapConfig.getCustomBackgroundColor()>
	//   45   73:istore_2        
			if(j != 0)
	//*  46   74:iload_2         
	//*  47   75:ifeq            122
				setBackgroundTexture(i, fd.b(FileUtil.readFileContentsFromAssets(context, (new StringBuilder()).append("map_assets").append(File.separator).append("bktile.data").toString()), j));
	//   48   78:aload_0         
	//   49   79:iload_1         
	//   50   80:aload_0         
	//   51   81:getfield        #123 <Field Context context>
	//   52   84:new             #140 <Class StringBuilder>
	//   53   87:dup             
	//   54   88:invokespecial   #141 <Method void StringBuilder()>
	//   55   91:ldc2            #925 <String "map_assets">
	//   56   94:invokevirtual   #153 <Method StringBuilder StringBuilder.append(String)>
	//   57   97:getstatic       #930 <Field String File.separator>
	//   58  100:invokevirtual   #153 <Method StringBuilder StringBuilder.append(String)>
	//   59  103:ldc2            #932 <String "bktile.data">
	//   60  106:invokevirtual   #153 <Method StringBuilder StringBuilder.append(String)>
	//   61  109:invokevirtual   #165 <Method String StringBuilder.toString()>
	//   62  112:invokestatic    #886 <Method byte[] FileUtil.readFileContentsFromAssets(Context, String)>
	//   63  115:iload_2         
	//   64  116:invokestatic    #894 <Method byte[] fd.b(byte[], int)>
	//   65  119:invokevirtual   #934 <Method void setBackgroundTexture(int, byte[])>
			astyleitem = ((StyleItem []) (mGlMapView.getMapConfig().getCustomTextureResourcePath()));
	//   66  122:aload_0         
	//   67  123:getfield        #74  <Field s mGlMapView>
	//   68  126:invokeinterface #620 <Method MapConfig s.getMapConfig()>
	//   69  131:invokevirtual   #874 <Method String MapConfig.getCustomTextureResourcePath()>
	//   70  134:astore          7
			if(mGlMapView.getMapConfig().isProFunctionAuthEnable() && !TextUtils.isEmpty(((CharSequence) (astyleitem))))
	//*  71  136:aload_0         
	//*  72  137:getfield        #74  <Field s mGlMapView>
	//*  73  140:invokeinterface #620 <Method MapConfig s.getMapConfig()>
	//*  74  145:invokevirtual   #937 <Method boolean MapConfig.isProFunctionAuthEnable()>
	//*  75  148:ifeq            182
	//*  76  151:aload           7
	//*  77  153:invokestatic    #911 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  78  156:ifne            182
			{
				mGlMapView.getMapConfig().setUseProFunction(true);
	//   79  159:aload_0         
	//   80  160:getfield        #74  <Field s mGlMapView>
	//   81  163:invokeinterface #620 <Method MapConfig s.getMapConfig()>
	//   82  168:iconst_1        
	//   83  169:invokevirtual   #941 <Method void MapConfig.setUseProFunction(boolean)>
				setCustomStyleTexture(i, FileUtil.readFileContents(((String) (astyleitem))));
	//   84  172:aload_0         
	//   85  173:iload_1         
	//   86  174:aload           7
	//   87  176:invokestatic    #880 <Method byte[] FileUtil.readFileContents(String)>
	//   88  179:invokevirtual   #943 <Method void setCustomStyleTexture(int, byte[])>
			}
			return flag;
	//   89  182:iload           5
	//   90  184:ireturn         
		}
		if(j == 0 && k == 0 && l == 0)
	//*  91  185:iload_2         
	//*  92  186:ifne            278
	//*  93  189:iload_3         
	//*  94  190:ifne            278
	//*  95  193:iload           4
	//*  96  195:ifne            278
		{
			setBackgroundTexture(i, FileUtil.readFileContentsFromAssets(context, (new StringBuilder()).append("map_assets").append(File.separator).append("bktile.data").toString()));
	//   97  198:aload_0         
	//   98  199:iload_1         
	//   99  200:aload_0         
	//  100  201:getfield        #123 <Field Context context>
	//  101  204:new             #140 <Class StringBuilder>
	//  102  207:dup             
	//  103  208:invokespecial   #141 <Method void StringBuilder()>
	//  104  211:ldc2            #925 <String "map_assets">
	//  105  214:invokevirtual   #153 <Method StringBuilder StringBuilder.append(String)>
	//  106  217:getstatic       #930 <Field String File.separator>
	//  107  220:invokevirtual   #153 <Method StringBuilder StringBuilder.append(String)>
	//  108  223:ldc2            #932 <String "bktile.data">
	//  109  226:invokevirtual   #153 <Method StringBuilder StringBuilder.append(String)>
	//  110  229:invokevirtual   #165 <Method String StringBuilder.toString()>
	//  111  232:invokestatic    #886 <Method byte[] FileUtil.readFileContentsFromAssets(Context, String)>
	//  112  235:invokevirtual   #934 <Method void setBackgroundTexture(int, byte[])>
			setCustomStyleTexture(i, FileUtil.readFileContentsFromAssets(context, (new StringBuilder()).append("map_assets").append(File.separator).append("icons_5_14_1510054923.data").toString()));
	//  113  238:aload_0         
	//  114  239:iload_1         
	//  115  240:aload_0         
	//  116  241:getfield        #123 <Field Context context>
	//  117  244:new             #140 <Class StringBuilder>
	//  118  247:dup             
	//  119  248:invokespecial   #141 <Method void StringBuilder()>
	//  120  251:ldc2            #925 <String "map_assets">
	//  121  254:invokevirtual   #153 <Method StringBuilder StringBuilder.append(String)>
	//  122  257:getstatic       #930 <Field String File.separator>
	//  123  260:invokevirtual   #153 <Method StringBuilder StringBuilder.append(String)>
	//  124  263:ldc2            #945 <String "icons_5_14_1510054923.data">
	//  125  266:invokevirtual   #153 <Method StringBuilder StringBuilder.append(String)>
	//  126  269:invokevirtual   #165 <Method String StringBuilder.toString()>
	//  127  272:invokestatic    #886 <Method byte[] FileUtil.readFileContentsFromAssets(Context, String)>
	//  128  275:invokevirtual   #943 <Method void setCustomStyleTexture(int, byte[])>
		}
		return flag;
	//  129  278:iload           5
	//  130  280:ireturn         
	}

	public void setMapState(int i, GLMapState glmapstate)
	{
		setMapState(i, glmapstate, true);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:aload_2         
	//    3    3:iconst_1        
	//    4    4:invokevirtual   #948 <Method void setMapState(int, GLMapState, boolean)>
	//    5    7:return          
	}

	public void setMapState(int i, GLMapState glmapstate, boolean flag)
	{
		if(mNativeMapengineInstance == 0L)
			break MISSING_BLOCK_LABEL_82;
	//    0    0:aload_0         
	//    1    1:getfield        #72  <Field long mNativeMapengineInstance>
	//    2    4:lconst_0        
	//    3    5:lcmp            
	//    4    6:ifeq            82
		if(flag && mGlMapView != null && mGlMapView.getMapConfig() != null)
	//*   5    9:iload_3         
	//*   6   10:ifeq            42
	//*   7   13:aload_0         
	//*   8   14:getfield        #74  <Field s mGlMapView>
	//*   9   17:ifnull          42
	//*  10   20:aload_0         
	//*  11   21:getfield        #74  <Field s mGlMapView>
	//*  12   24:invokeinterface #620 <Method MapConfig s.getMapConfig()>
	//*  13   29:ifnull          42
			mGlMapView.checkMapState(glmapstate);
	//   14   32:aload_0         
	//   15   33:getfield        #74  <Field s mGlMapView>
	//   16   36:aload_2         
	//   17   37:invokeinterface #951 <Method void s.checkMapState(GLMapState)>
		mLock.lock();
	//   18   42:aload_0         
	//   19   43:getfield        #100 <Field Lock mLock>
	//   20   46:invokeinterface #614 <Method void Lock.lock()>
		glmapstate.setNativeMapengineState(i, mNativeMapengineInstance);
	//   21   51:aload_2         
	//   22   52:iload_1         
	//   23   53:aload_0         
	//   24   54:getfield        #72  <Field long mNativeMapengineInstance>
	//   25   57:invokevirtual   #954 <Method void GLMapState.setNativeMapengineState(int, long)>
		mLock.unlock();
	//   26   60:aload_0         
	//   27   61:getfield        #100 <Field Lock mLock>
	//   28   64:invokeinterface #654 <Method void Lock.unlock()>
		return;
	//   29   69:return          
		glmapstate;
	//   30   70:astore_2        
		mLock.unlock();
	//   31   71:aload_0         
	//   32   72:getfield        #100 <Field Lock mLock>
	//   33   75:invokeinterface #654 <Method void Lock.unlock()>
		throw glmapstate;
	//   34   80:aload_2         
	//   35   81:athrow          
	//   36   82:return          
	}

	public void setOvelayBundle(int i, GLOverlayBundle gloverlaybundle)
	{
		bundle = gloverlaybundle;
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:putfield        #106 <Field GLOverlayBundle bundle>
	//    3    5:return          
	}

	public void setParamater(int i, int j, int k, int l, int i1, int j1)
	{
		mLock.lock();
	//    0    0:aload_0         
	//    1    1:getfield        #100 <Field Lock mLock>
	//    2    4:invokeinterface #614 <Method void Lock.lock()>
		if(mNativeMapengineInstance != 0L)
	//*   3    9:aload_0         
	//*   4   10:getfield        #72  <Field long mNativeMapengineInstance>
	//*   5   13:lconst_0        
	//*   6   14:lcmp            
	//*   7   15:ifeq            34
			nativeSetParameter(i, mNativeMapengineInstance, j, k, l, i1, j1);
	//    8   18:iload_1         
	//    9   19:aload_0         
	//   10   20:getfield        #72  <Field long mNativeMapengineInstance>
	//   11   23:iload_2         
	//   12   24:iload_3         
	//   13   25:iload           4
	//   14   27:iload           5
	//   15   29:iload           6
	//   16   31:invokestatic    #962 <Method void nativeSetParameter(int, long, int, int, int, int, int)>
		mLock.unlock();
	//   17   34:aload_0         
	//   18   35:getfield        #100 <Field Lock mLock>
	//   19   38:invokeinterface #654 <Method void Lock.unlock()>
		return;
	//   20   43:return          
		Exception exception;
		exception;
	//   21   44:astore          7
		mLock.unlock();
	//   22   46:aload_0         
	//   23   47:getfield        #100 <Field Lock mLock>
	//   24   50:invokeinterface #654 <Method void Lock.unlock()>
		throw exception;
	//   25   55:aload           7
	//   26   57:athrow          
	}

	public void setServiceViewRect(int i, int j, int k, int l, int i1, int j1, int k1)
	{
		nativeSetServiceViewRect(i, mNativeMapengineInstance, j, k, l, i1, j1, k1);
	//    0    0:iload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #72  <Field long mNativeMapengineInstance>
	//    3    5:iload_2         
	//    4    6:iload_3         
	//    5    7:iload           4
	//    6    9:iload           5
	//    7   11:iload           6
	//    8   13:iload           7
	//    9   15:invokestatic    #966 <Method void nativeSetServiceViewRect(int, long, int, int, int, int, int, int)>
	//   10   18:return          
	}

	public void setSimple3DEnable(int i, boolean flag)
	{
		if(mNativeMapengineInstance != 0L)
	//*   0    0:aload_0         
	//*   1    1:getfield        #72  <Field long mNativeMapengineInstance>
	//*   2    4:lconst_0        
	//*   3    5:lcmp            
	//*   4    6:ifeq            18
			nativeSetSimple3DEnable(i, mNativeMapengineInstance, flag);
	//    5    9:iload_1         
	//    6   10:aload_0         
	//    7   11:getfield        #72  <Field long mNativeMapengineInstance>
	//    8   14:iload_2         
	//    9   15:invokestatic    #969 <Method void nativeSetSimple3DEnable(int, long, boolean)>
	//   10   18:return          
	}

	public void setSkyTexture(int i, byte abyte0[])
	{
		if(abyte0 == null)
	//*   0    0:aload_2         
	//*   1    1:ifnonnull       5
			return;
	//    2    4:return          
		if(mNativeMapengineInstance != 0L)
	//*   3    5:aload_0         
	//*   4    6:getfield        #72  <Field long mNativeMapengineInstance>
	//*   5    9:lconst_0        
	//*   6   10:lcmp            
	//*   7   11:ifeq            23
			nativeSetSkyTexture(i, mNativeMapengineInstance, abyte0);
	//    8   14:iload_1         
	//    9   15:aload_0         
	//   10   16:getfield        #72  <Field long mNativeMapengineInstance>
	//   11   19:aload_2         
	//   12   20:invokestatic    #972 <Method void nativeSetSkyTexture(int, long, byte[])>
	//   13   23:return          
	}

	public void setSrvViewStateBoolValue(int i, int j, boolean flag)
	{
		if(mNativeMapengineInstance != 0L)
	//*   0    0:aload_0         
	//*   1    1:getfield        #72  <Field long mNativeMapengineInstance>
	//*   2    4:lconst_0        
	//*   3    5:lcmp            
	//*   4    6:ifeq            19
			nativeSetSrvViewStateBoolValue(i, mNativeMapengineInstance, j, flag);
	//    5    9:iload_1         
	//    6   10:aload_0         
	//    7   11:getfield        #72  <Field long mNativeMapengineInstance>
	//    8   14:iload_2         
	//    9   15:iload_3         
	//   10   16:invokestatic    #976 <Method void nativeSetSrvViewStateBoolValue(int, long, int, boolean)>
	//   11   19:return          
	}

	public void setTrafficStyle(int i, int j, int k, int l, int i1)
	{
		if(mNativeMapengineInstance != 0L)
	//*   0    0:aload_0         
	//*   1    1:getfield        #72  <Field long mNativeMapengineInstance>
	//*   2    4:lconst_0        
	//*   3    5:lcmp            
	//*   4    6:ifeq            96
		{
			byte abyte3[] = FileUtil.readFileContentsFromAssets(context, (new StringBuilder()).append("map_assets").append(File.separator).append("trl.data").toString());
	//    5    9:aload_0         
	//    6   10:getfield        #123 <Field Context context>
	//    7   13:new             #140 <Class StringBuilder>
	//    8   16:dup             
	//    9   17:invokespecial   #141 <Method void StringBuilder()>
	//   10   20:ldc2            #925 <String "map_assets">
	//   11   23:invokevirtual   #153 <Method StringBuilder StringBuilder.append(String)>
	//   12   26:getstatic       #930 <Field String File.separator>
	//   13   29:invokevirtual   #153 <Method StringBuilder StringBuilder.append(String)>
	//   14   32:ldc2            #980 <String "trl.data">
	//   15   35:invokevirtual   #153 <Method StringBuilder StringBuilder.append(String)>
	//   16   38:invokevirtual   #165 <Method String StringBuilder.toString()>
	//   17   41:invokestatic    #886 <Method byte[] FileUtil.readFileContentsFromAssets(Context, String)>
	//   18   44:astore          9
			byte abyte0[] = fd.a(abyte3, j);
	//   19   46:aload           9
	//   20   48:iload_2         
	//   21   49:invokestatic    #982 <Method byte[] fd.a(byte[], int)>
	//   22   52:astore          6
			byte abyte1[] = fd.a(abyte3, k);
	//   23   54:aload           9
	//   24   56:iload_3         
	//   25   57:invokestatic    #982 <Method byte[] fd.a(byte[], int)>
	//   26   60:astore          7
			byte abyte2[] = fd.a(abyte3, l);
	//   27   62:aload           9
	//   28   64:iload           4
	//   29   66:invokestatic    #982 <Method byte[] fd.a(byte[], int)>
	//   30   69:astore          8
			abyte3 = fd.a(abyte3, i1);
	//   31   71:aload           9
	//   32   73:iload           5
	//   33   75:invokestatic    #982 <Method byte[] fd.a(byte[], int)>
	//   34   78:astore          9
			nativeSetTrafficTexture(i, mNativeMapengineInstance, abyte0, abyte1, abyte2, abyte3);
	//   35   80:iload_1         
	//   36   81:aload_0         
	//   37   82:getfield        #72  <Field long mNativeMapengineInstance>
	//   38   85:aload           6
	//   39   87:aload           7
	//   40   89:aload           8
	//   41   91:aload           9
	//   42   93:invokestatic    #984 <Method void nativeSetTrafficTexture(int, long, byte[], byte[], byte[], byte[])>
		}
	//   43   96:return          
	}

	public void startCheckEngineRenderComplete()
	{
		isEngineRenderComplete = false;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #108 <Field boolean isEngineRenderComplete>
	//    3    5:return          
	}

	public void startMapSlidAnim(int i, Point point, float f, float f1)
	{
		if(point == null)
	//*   0    0:aload_2         
	//*   1    1:ifnonnull       5
			return;
	//    2    4:return          
		clearAnimations(i, true);
	//    3    5:aload_0         
	//    4    6:iload_1         
	//    5    7:iconst_1        
	//    6    8:invokevirtual   #714 <Method void clearAnimations(int, boolean)>
		point = ((Point) (getCloneMapState()));
	//    7   11:aload_0         
	//    8   12:invokevirtual   #988 <Method GLMapState getCloneMapState()>
	//    9   15:astore_2        
		((GLMapState) (point)).reset();
	//   10   16:aload_2         
	//   11   17:invokevirtual   #991 <Method void GLMapState.reset()>
		((GLMapState) (point)).recalculate();
	//   12   20:aload_2         
	//   13   21:invokevirtual   #314 <Method void GLMapState.recalculate()>
		float f2;
		float f3;
		f3 = f;
	//   14   24:fload_3         
	//   15   25:fstore          6
		f2 = f1;
	//   16   27:fload           4
	//   17   29:fstore          5
		float f4;
		float f5;
		float f6;
		f5 = Math.abs(f3);
	//   18   31:fload           6
	//   19   33:invokestatic    #997 <Method float Math.abs(float)>
	//   20   36:fstore          8
		f6 = Math.abs(f2);
	//   21   38:fload           5
	//   22   40:invokestatic    #997 <Method float Math.abs(float)>
	//   23   43:fstore          9
		break MISSING_BLOCK_LABEL_45;
	//*  24   45:fload           8
	//*  25   47:fload           9
	//*  26   49:fcmpl           
	//*  27   50:ifle            209
	//*  28   53:fload           8
	//*  29   55:fstore          7
	//*  30   57:goto            213
_L6:
		f = f2 * (12000F / f5);
	//   31   60:fload           5
	//   32   62:ldc2            #998 <Float 12000F>
	//   33   65:fload           8
	//   34   67:fdiv            
	//   35   68:fmul            
	//   36   69:fstore_3        
		  goto _L1
	//*  37   70:goto            99
_L4:
		f1 = f3 * (12000F / f6);
	//   38   73:fload           6
	//   39   75:ldc2            #998 <Float 12000F>
	//   40   78:fload           9
	//   41   80:fdiv            
	//   42   81:fmul            
	//   43   82:fstore          4
		if(f2 > 0.0F)
	//*  44   84:fload           5
	//*  45   86:fconst_0        
	//*  46   87:fcmpl           
	//*  47   88:ifle            262
			f = 12000;
	//   48   91:sipush          12000
	//   49   94:i2f             
	//   50   95:fstore_3        
		else
	//*  51   96:goto            99
	//*  52   99:aload_0         
	//*  53  100:getfield        #74  <Field s mGlMapView>
	//*  54  103:invokeinterface #330 <Method int s.getMapWidth()>
	//*  55  108:iconst_1        
	//*  56  109:ishr            
	//*  57  110:istore_1        
	//*  58  111:aload_0         
	//*  59  112:getfield        #74  <Field s mGlMapView>
	//*  60  115:invokeinterface #336 <Method int s.getMapHeight()>
	//*  61  120:iconst_1        
	//*  62  121:ishr            
	//*  63  122:istore          10
	//*  64  124:aload_0         
	//*  65  125:getfield        #74  <Field s mGlMapView>
	//*  66  128:invokeinterface #1001 <Method boolean s.k()>
	//*  67  133:ifeq            163
	//*  68  136:aload_0         
	//*  69  137:getfield        #74  <Field s mGlMapView>
	//*  70  140:invokeinterface #620 <Method MapConfig s.getMapConfig()>
	//*  71  145:invokevirtual   #1004 <Method int MapConfig.getAnchorX()>
	//*  72  148:istore_1        
	//*  73  149:aload_0         
	//*  74  150:getfield        #74  <Field s mGlMapView>
	//*  75  153:invokeinterface #620 <Method MapConfig s.getMapConfig()>
	//*  76  158:invokevirtual   #1007 <Method int MapConfig.getAnchorY()>
	//*  77  161:istore          10
	//*  78  163:new             #1009 <Class AdglMapAnimFling>
	//*  79  166:dup             
	//*  80  167:sipush          500
	//*  81  170:iload_1         
	//*  82  171:iload           10
	//*  83  173:invokespecial   #1011 <Method void AdglMapAnimFling(int, int, int)>
	//*  84  176:astore          11
	//*  85  178:aload           11
	//*  86  180:fload           4
	//*  87  182:fload_3         
	//*  88  183:invokevirtual   #1015 <Method void AdglMapAnimFling.setPositionAndVelocity(float, float)>
	//*  89  186:aload           11
	//*  90  188:aload_2         
	//*  91  189:invokevirtual   #1018 <Method void AdglMapAnimFling.commitAnimation(Object)>
	//*  92  192:aload_0         
	//*  93  193:getfield        #93  <Field AdglMapAnimationMgr mapAnimationMgr>
	//*  94  196:aload           11
	//*  95  198:aconst_null     
	//*  96  199:invokevirtual   #429 <Method void AdglMapAnimationMgr.addAnimation(com.autonavi.ae.gmap.glanimation.AbstractAdglAnimation, com.amap.api.maps.AMap$CancelableCallback)>
	//*  97  202:return          
	//*  98  203:astore_2        
	//*  99  204:aload_2         
	//* 100  205:invokevirtual   #321 <Method void Throwable.printStackTrace()>
	//* 101  208:return          
	//* 102  209:fload           9
	//* 103  211:fstore          7
	//* 104  213:fload           6
	//* 105  215:fstore          4
	//* 106  217:fload           5
	//* 107  219:fstore_3        
	//* 108  220:fload           7
	//* 109  222:ldc2            #998 <Float 12000F>
	//* 110  225:fcmpl           
	//* 111  226:ifle            99
	//* 112  229:fload           8
	//* 113  231:fload           9
	//* 114  233:fcmpl           
	//* 115  234:ifle            73
	//* 116  237:fload           6
	//* 117  239:fconst_0        
	//* 118  240:fcmpl           
	//* 119  241:ifle            253
	//* 120  244:sipush          12000
	//* 121  247:i2f             
	//* 122  248:fstore          4
	//* 123  250:goto            60
	//* 124  253:sipush          -12000
	//* 125  256:i2f             
	//* 126  257:fstore          4
	//* 127  259:goto            60
			f = -12000;
	//  128  262:sipush          -12000
	//  129  265:i2f             
	//  130  266:fstore_3        
_L1:
		try
		{
			i = mGlMapView.getMapWidth() >> 1;
			int j = mGlMapView.getMapHeight() >> 1;
			if(mGlMapView.k())
			{
				i = mGlMapView.getMapConfig().getAnchorX();
				j = mGlMapView.getMapConfig().getAnchorY();
			}
			AdglMapAnimFling adglmapanimfling = new AdglMapAnimFling(500, i, j);
			adglmapanimfling.setPositionAndVelocity(f1, f);
			adglmapanimfling.commitAnimation(((Object) (point)));
			mapAnimationMgr.addAnimation(((com.autonavi.ae.gmap.glanimation.AbstractAdglAnimation) (adglmapanimfling)), ((com.amap.api.maps.AMap.CancelableCallback) (null)));
			return;
		}
		// Misplaced declaration of an exception variable
		catch(Point point)
		{
			((Throwable) (point)).printStackTrace();
		}
		return;
		if(f5 > f6)
			f4 = f5;
		else
			f4 = f6;
		f1 = f3;
		f = f2;
		if(f4 <= 12000F) goto _L1; else goto _L2
_L2:
		if(f5 <= f6) goto _L4; else goto _L3
_L3:
		if(f3 > 0.0F)
			f1 = 12000;
		else
			f1 = -12000;
		if(true) goto _L6; else goto _L5
_L5:
	//* 131  267:goto            99
	}

	public void startPivotZoomRotateAnim(int i, Point point, float f, int j, int k)
	{
		if(f == -9999F && j == -9999)
	//*   0    0:fload_3         
	//*   1    1:ldc2            #1021 <Float -9999F>
	//*   2    4:fcmpl           
	//*   3    5:ifne            17
	//*   4    8:iload           4
	//*   5   10:sipush          -9999
	//*   6   13:icmpne          17
			return;
	//    7   16:return          
		i = j;
	//    8   17:iload           4
	//    9   19:istore_1        
		if(j != -9999)
	//*  10   20:iload           4
	//*  11   22:sipush          -9999
	//*  12   25:icmpeq          43
		{
			i = j;
	//   13   28:iload           4
	//   14   30:istore_1        
			if(j < 0)
	//*  15   31:iload           4
	//*  16   33:ifge            43
				i = j + 360;
	//   17   36:iload           4
	//   18   38:sipush          360
	//   19   41:iadd            
	//   20   42:istore_1        
		}
	//   21   43:return          
	}

	Hashtable aMapLoaderHashtable;
	GLOverlayBundle bundle;
	private Context context;
	private GLMapState copyGLMapState;
	private boolean isEngineRenderComplete;
	boolean isGestureStep;
	boolean isMoveCameraStep;
	private List mAnimateStateMessageList;
	private List mGestureEndMessageList;
	private List mGestureMessageList;
	private s mGlMapView;
	private Lock mLock;
	private IAMapListener mMapListener;
	private long mNativeMapengineInstance;
	private NetworkState mNetworkState;
	boolean mRequestDestroy;
	private List mStateMessageList;
	private TextTextureGenerator mTextTextureGenerator;
	private AdglMapAnimationMgr mapAnimationMgr;
	private int mapGestureCount;
	private Object mutLock;
	GLMapState state;
	private String userAgent;


/*
	static void access$000(GLMapEngine glmapengine, com.amap.api.maps.AMap.CancelableCallback cancelablecallback)
	{
		glmapengine.doMapAnimationFinishCallback(cancelablecallback);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #174 <Method void doMapAnimationFinishCallback(com.amap.api.maps.AMap$CancelableCallback)>
		return;
	//    3    5:return          
	}

*/
}

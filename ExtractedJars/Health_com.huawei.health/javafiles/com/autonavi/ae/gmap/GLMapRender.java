// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.autonavi.ae.gmap;

import android.os.*;
import com.autonavi.amap.mapcore.interfaces.IAMap;
import java.util.concurrent.atomic.AtomicLong;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

public class GLMapRender
	implements android.opengl.GLSurfaceView.Renderer
{

	public GLMapRender(IAMap iamap)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #57  <Method void Object()>
		mTargetFrameDurationMillis = 66;
	//    2    4:aload_0         
	//    3    5:bipush          66
	//    4    7:putfield        #59  <Field int mTargetFrameDurationMillis>
		mTargetRenderFPS = 15F;
	//    5   10:aload_0         
	//    6   11:ldc1            #60  <Float 15F>
	//    7   13:putfield        #62  <Field float mTargetRenderFPS>
		mIsRendPause = false;
	//    8   16:aload_0         
	//    9   17:iconst_0        
	//   10   18:putfield        #64  <Field boolean mIsRendPause>
		mSurfacedestoryed = false;
	//   11   21:aload_0         
	//   12   22:iconst_0        
	//   13   23:putfield        #66  <Field boolean mSurfacedestoryed>
		mGLRenderThread = null;
	//   14   26:aload_0         
	//   15   27:aconst_null     
	//   16   28:putfield        #68  <Field HandlerThread mGLRenderThread>
		mGLRenderHandler = null;
	//   17   31:aload_0         
	//   18   32:aconst_null     
	//   19   33:putfield        #70  <Field Handler mGLRenderHandler>
		mLastFrameTime = System.currentTimeMillis();
	//   20   36:aload_0         
	//   21   37:invokestatic    #76  <Method long System.currentTimeMillis()>
	//   22   40:putfield        #78  <Field long mLastFrameTime>
		mIsTrafficMode = false;
	//   23   43:aload_0         
	//   24   44:iconst_0        
	//   25   45:putfield        #80  <Field boolean mIsTrafficMode>
		mDrawFrameTickCount = new AtomicLong(6L);
	//   26   48:aload_0         
	//   27   49:new             #82  <Class AtomicLong>
	//   28   52:dup             
	//   29   53:ldc2w           #83  <Long 6L>
	//   30   56:invokespecial   #87  <Method void AtomicLong(long)>
	//   31   59:putfield        #89  <Field AtomicLong mDrawFrameTickCount>
		mGLMapView = iamap;
	//   32   62:aload_0         
	//   33   63:aload_1         
	//   34   64:putfield        #91  <Field IAMap mGLMapView>
	//   35   67:return          
	}

	private void drawSingleFrame(GL10 gl10)
	{
		try
		{
			mGLMapView.drawFrame(gl10);
	//    0    0:aload_0         
	//    1    1:getfield        #91  <Field IAMap mGLMapView>
	//    2    4:aload_1         
	//    3    5:invokeinterface #103 <Method void IAMap.drawFrame(GL10)>
			return;
	//    4   10:return          
		}
		// Misplaced declaration of an exception variable
		catch(GL10 gl10)
	//*   5   11:astore_1        
		{
			((Throwable) (gl10)).printStackTrace();
	//    6   12:aload_1         
	//    7   13:invokevirtual   #106 <Method void Throwable.printStackTrace()>
		}
	//    8   16:return          
	}

	public boolean isRenderPause()
	{
		return mIsRendPause;
	//    0    0:aload_0         
	//    1    1:getfield        #64  <Field boolean mIsRendPause>
	//    2    4:ireturn         
	}

	public void onAttachedToWindow()
	{
		mGLRenderThread = new HandlerThread(" AMapGlRenderThread");
	//    0    0:aload_0         
	//    1    1:new             #111 <Class HandlerThread>
	//    2    4:dup             
	//    3    5:ldc1            #113 <String " AMapGlRenderThread">
	//    4    7:invokespecial   #116 <Method void HandlerThread(String)>
	//    5   10:putfield        #68  <Field HandlerThread mGLRenderThread>
		mGLRenderThread.start();
	//    6   13:aload_0         
	//    7   14:getfield        #68  <Field HandlerThread mGLRenderThread>
	//    8   17:invokevirtual   #119 <Method void HandlerThread.start()>
		mGLRenderHandler = ((Handler) (new Handler(mGLRenderThread.getLooper()) {

			public void handleMessage(Message message)
			{
				switch(message.what)
			//*   0    0:aload_1         
			//*   1    1:getfield        #27  <Field int Message.what>
				{
			//*   2    4:lookupswitch    2: default 32
			//			               10: 33
			//			               100: 81
				default:
					return;
			//    3   32:return          

				case 10: // '\n'
					if(!mIsRendPause && mGLMapView != null && mGLMapView.getRenderMode() == 0)
			//*   4   33:aload_0         
			//*   5   34:getfield        #15  <Field GLMapRender this$0>
			//*   6   37:invokestatic    #31  <Method boolean GLMapRender.access$000(GLMapRender)>
			//*   7   40:ifne            93
			//*   8   43:aload_0         
			//*   9   44:getfield        #15  <Field GLMapRender this$0>
			//*  10   47:getfield        #35  <Field IAMap GLMapRender.mGLMapView>
			//*  11   50:ifnull          93
			//*  12   53:aload_0         
			//*  13   54:getfield        #15  <Field GLMapRender this$0>
			//*  14   57:getfield        #35  <Field IAMap GLMapRender.mGLMapView>
			//*  15   60:invokeinterface #41  <Method int IAMap.getRenderMode()>
			//*  16   65:ifne            93
					{
						mGLMapView.requestRender();
			//   17   68:aload_0         
			//   18   69:getfield        #15  <Field GLMapRender this$0>
			//   19   72:getfield        #35  <Field IAMap GLMapRender.mGLMapView>
			//   20   75:invokeinterface #44  <Method void IAMap.requestRender()>
						return;
			//   21   80:return          
					}
					break;

				case 100: // 'd'
					((Runnable)message.obj).run();
			//   22   81:aload_1         
			//   23   82:getfield        #48  <Field Object Message.obj>
			//   24   85:checkcast       #50  <Class Runnable>
			//   25   88:invokeinterface #53  <Method void Runnable.run()>
					break;
				}
			//   26   93:return          
			}

			final GLMapRender this$0;

			
			{
				this$0 = GLMapRender.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #15  <Field GLMapRender this$0>
				super(looper);
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:invokespecial   #18  <Method void Handler(Looper)>
			//    6   10:return          
			}
		}
));
	//    9   20:aload_0         
	//   10   21:new             #8   <Class GLMapRender$1>
	//   11   24:dup             
	//   12   25:aload_0         
	//   13   26:aload_0         
	//   14   27:getfield        #68  <Field HandlerThread mGLRenderThread>
	//   15   30:invokevirtual   #123 <Method Looper HandlerThread.getLooper()>
	//   16   33:invokespecial   #126 <Method void GLMapRender$1(GLMapRender, Looper)>
	//   17   36:putfield        #70  <Field Handler mGLRenderHandler>
	//   18   39:return          
	}

	public void onDetachedFromWindow()
	{
		mGLRenderThread.quit();
	//    0    0:aload_0         
	//    1    1:getfield        #68  <Field HandlerThread mGLRenderThread>
	//    2    4:invokevirtual   #130 <Method boolean HandlerThread.quit()>
	//    3    7:pop             
		mGLRenderThread = null;
	//    4    8:aload_0         
	//    5    9:aconst_null     
	//    6   10:putfield        #68  <Field HandlerThread mGLRenderThread>
		mGLRenderHandler = null;
	//    7   13:aload_0         
	//    8   14:aconst_null     
	//    9   15:putfield        #70  <Field Handler mGLRenderHandler>
	//   10   18:return          
	}

	public void onDrawFrame(GL10 gl10)
	{
		mLastFrameTime = System.currentTimeMillis();
	//    0    0:aload_0         
	//    1    1:invokestatic    #76  <Method long System.currentTimeMillis()>
	//    2    4:putfield        #78  <Field long mLastFrameTime>
		drawSingleFrame(gl10);
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:invokespecial   #133 <Method void drawSingleFrame(GL10)>
		long l = System.currentTimeMillis();
	//    6   12:invokestatic    #76  <Method long System.currentTimeMillis()>
	//    7   15:lstore_2        
		long l1 = mLastFrameTime;
	//    8   16:aload_0         
	//    9   17:getfield        #78  <Field long mLastFrameTime>
	//   10   20:lstore          4
		mLastFrameTime = l;
	//   11   22:aload_0         
	//   12   23:lload_2         
	//   13   24:putfield        #78  <Field long mLastFrameTime>
		long l2 = mDrawFrameTickCount.get();
	//   14   27:aload_0         
	//   15   28:getfield        #89  <Field AtomicLong mDrawFrameTickCount>
	//   16   31:invokevirtual   #136 <Method long AtomicLong.get()>
	//   17   34:lstore          6
		if(mGLMapView.getRenderMode() == 0 && mGLRenderHandler != null && mGLRenderThread != null && mGLRenderThread.isAlive())
	//*  18   36:aload_0         
	//*  19   37:getfield        #91  <Field IAMap mGLMapView>
	//*  20   40:invokeinterface #140 <Method int IAMap.getRenderMode()>
	//*  21   45:ifne            218
	//*  22   48:aload_0         
	//*  23   49:getfield        #70  <Field Handler mGLRenderHandler>
	//*  24   52:ifnull          218
	//*  25   55:aload_0         
	//*  26   56:getfield        #68  <Field HandlerThread mGLRenderThread>
	//*  27   59:ifnull          218
	//*  28   62:aload_0         
	//*  29   63:getfield        #68  <Field HandlerThread mGLRenderThread>
	//*  30   66:invokevirtual   #143 <Method boolean HandlerThread.isAlive()>
	//*  31   69:ifeq            218
		{
			gl10 = ((GL10) (mDrawFrameTickCount));
	//   32   72:aload_0         
	//   33   73:getfield        #89  <Field AtomicLong mDrawFrameTickCount>
	//   34   76:astore_1        
			l2--;
	//   35   77:lload           6
	//   36   79:lconst_1        
	//   37   80:lsub            
	//   38   81:lstore          6
			((AtomicLong) (gl10)).set(l2);
	//   39   83:aload_1         
	//   40   84:lload           6
	//   41   86:invokevirtual   #146 <Method void AtomicLong.set(long)>
			if(l2 <= 0L)
	//*  42   89:lload           6
	//*  43   91:lconst_0        
	//*  44   92:lcmp            
	//*  45   93:ifgt            175
			{
				if(l2 > -5L)
	//*  46   96:lload           6
	//*  47   98:ldc2w           #147 <Long -5L>
	//*  48  101:lcmp            
	//*  49  102:ifle            112
					l = 60L;
	//   50  105:ldc2w           #149 <Long 60L>
	//   51  108:lstore_2        
				else
	//*  52  109:goto            172
				if(l2 > -7L)
	//*  53  112:lload           6
	//*  54  114:ldc2w           #151 <Long -7L>
	//*  55  117:lcmp            
	//*  56  118:ifle            128
					l = 100L;
	//   57  121:ldc2w           #153 <Long 100L>
	//   58  124:lstore_2        
				else
	//*  59  125:goto            172
				if(l2 > -9L)
	//*  60  128:lload           6
	//*  61  130:ldc2w           #155 <Long -9L>
	//*  62  133:lcmp            
	//*  63  134:ifle            144
				{
					l = 250L;
	//   64  137:ldc2w           #157 <Long 250L>
	//   65  140:lstore_2        
				} else
	//*  66  141:goto            172
				{
					if(mIsTrafficMode)
	//*  67  144:aload_0         
	//*  68  145:getfield        #80  <Field boolean mIsTrafficMode>
	//*  69  148:ifeq            158
						l = 10000L;
	//   70  151:ldc2w           #159 <Long 10000L>
	//   71  154:lstore_2        
					else
	//*  72  155:goto            162
						l = 500L;
	//   73  158:ldc2w           #161 <Long 500L>
	//   74  161:lstore_2        
					mDrawFrameTickCount.set(-9L);
	//   75  162:aload_0         
	//   76  163:getfield        #89  <Field AtomicLong mDrawFrameTickCount>
	//   77  166:ldc2w           #155 <Long -9L>
	//   78  169:invokevirtual   #146 <Method void AtomicLong.set(long)>
				}
			} else
	//*  79  172:goto            192
			{
				l = Math.max(16L, (long)mTargetFrameDurationMillis - (l - l1));
	//   80  175:ldc2w           #31  <Long 16L>
	//   81  178:aload_0         
	//   82  179:getfield        #59  <Field int mTargetFrameDurationMillis>
	//   83  182:i2l             
	//   84  183:lload_2         
	//   85  184:lload           4
	//   86  186:lsub            
	//   87  187:lsub            
	//   88  188:invokestatic    #168 <Method long Math.max(long, long)>
	//   89  191:lstore_2        
			}
			if(l > 0L)
	//*  90  192:lload_2         
	//*  91  193:lconst_0        
	//*  92  194:lcmp            
	//*  93  195:ifle            218
			{
				mGLRenderHandler.removeMessages(10);
	//   94  198:aload_0         
	//   95  199:getfield        #70  <Field Handler mGLRenderHandler>
	//   96  202:bipush          10
	//   97  204:invokevirtual   #174 <Method void Handler.removeMessages(int)>
				mGLRenderHandler.sendEmptyMessageDelayed(10, l);
	//   98  207:aload_0         
	//   99  208:getfield        #70  <Field Handler mGLRenderHandler>
	//  100  211:bipush          10
	//  101  213:lload_2         
	//  102  214:invokevirtual   #178 <Method boolean Handler.sendEmptyMessageDelayed(int, long)>
	//  103  217:pop             
			}
		}
	//  104  218:return          
	}

	public void onSurfaceChanged(GL10 gl10, int i, int j)
	{
		if(mSurfacedestoryed)
	//*   0    0:aload_0         
	//*   1    1:getfield        #66  <Field boolean mSurfacedestoryed>
	//*   2    4:ifeq            13
			onSurfaceCreated(gl10, ((EGLConfig) (null)));
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:aconst_null     
	//    6   10:invokevirtual   #184 <Method void onSurfaceCreated(GL10, EGLConfig)>
		mGLMapView.changeSurface(gl10, i, j);
	//    7   13:aload_0         
	//    8   14:getfield        #91  <Field IAMap mGLMapView>
	//    9   17:aload_1         
	//   10   18:iload_2         
	//   11   19:iload_3         
	//   12   20:invokeinterface #187 <Method void IAMap.changeSurface(GL10, int, int)>
		resetTickCount(30);
	//   13   25:aload_0         
	//   14   26:bipush          30
	//   15   28:invokevirtual   #190 <Method void resetTickCount(int)>
	//   16   31:return          
	}

	public void onSurfaceCreated(GL10 gl10, EGLConfig eglconfig)
	{
		mIsRendPause = false;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #64  <Field boolean mIsRendPause>
		mSurfacedestoryed = false;
	//    3    5:aload_0         
	//    4    6:iconst_0        
	//    5    7:putfield        #66  <Field boolean mSurfacedestoryed>
		mGLMapView.createSurface(gl10, eglconfig);
	//    6   10:aload_0         
	//    7   11:getfield        #91  <Field IAMap mGLMapView>
	//    8   14:aload_1         
	//    9   15:aload_2         
	//   10   16:invokeinterface #193 <Method void IAMap.createSurface(GL10, EGLConfig)>
	//   11   21:return          
	}

	public void onSurfaceDestory()
	{
		mIsRendPause = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #64  <Field boolean mIsRendPause>
		if(mGLRenderHandler != null && mGLRenderThread != null)
	//*   3    5:aload_0         
	//*   4    6:getfield        #70  <Field Handler mGLRenderHandler>
	//*   5    9:ifnull          27
	//*   6   12:aload_0         
	//*   7   13:getfield        #68  <Field HandlerThread mGLRenderThread>
	//*   8   16:ifnull          27
			mGLRenderHandler.removeCallbacksAndMessages(((Object) (null)));
	//    9   19:aload_0         
	//   10   20:getfield        #70  <Field Handler mGLRenderHandler>
	//   11   23:aconst_null     
	//   12   24:invokevirtual   #198 <Method void Handler.removeCallbacksAndMessages(Object)>
		mGLMapView.destroySurface(1);
	//   13   27:aload_0         
	//   14   28:getfield        #91  <Field IAMap mGLMapView>
	//   15   31:iconst_1        
	//   16   32:invokeinterface #201 <Method void IAMap.destroySurface(int)>
		mSurfacedestoryed = true;
	//   17   37:aload_0         
	//   18   38:iconst_1        
	//   19   39:putfield        #66  <Field boolean mSurfacedestoryed>
	//   20   42:return          
	}

	public void renderPause()
	{
		if(mGLRenderHandler != null && mGLRenderThread != null && mGLRenderThread.isAlive())
	//*   0    0:aload_0         
	//*   1    1:getfield        #70  <Field Handler mGLRenderHandler>
	//*   2    4:ifnull          33
	//*   3    7:aload_0         
	//*   4    8:getfield        #68  <Field HandlerThread mGLRenderThread>
	//*   5   11:ifnull          33
	//*   6   14:aload_0         
	//*   7   15:getfield        #68  <Field HandlerThread mGLRenderThread>
	//*   8   18:invokevirtual   #143 <Method boolean HandlerThread.isAlive()>
	//*   9   21:ifeq            33
			mGLRenderHandler.removeMessages(10);
	//   10   24:aload_0         
	//   11   25:getfield        #70  <Field Handler mGLRenderHandler>
	//   12   28:bipush          10
	//   13   30:invokevirtual   #174 <Method void Handler.removeMessages(int)>
		mIsRendPause = true;
	//   14   33:aload_0         
	//   15   34:iconst_1        
	//   16   35:putfield        #64  <Field boolean mIsRendPause>
	//   17   38:return          
	}

	public void renderResume()
	{
		if(mGLRenderHandler != null && mGLRenderThread != null && mGLRenderThread.isAlive())
	//*   0    0:aload_0         
	//*   1    1:getfield        #70  <Field Handler mGLRenderHandler>
	//*   2    4:ifnull          33
	//*   3    7:aload_0         
	//*   4    8:getfield        #68  <Field HandlerThread mGLRenderThread>
	//*   5   11:ifnull          33
	//*   6   14:aload_0         
	//*   7   15:getfield        #68  <Field HandlerThread mGLRenderThread>
	//*   8   18:invokevirtual   #143 <Method boolean HandlerThread.isAlive()>
	//*   9   21:ifeq            33
			mGLRenderHandler.removeMessages(10);
	//   10   24:aload_0         
	//   11   25:getfield        #70  <Field Handler mGLRenderHandler>
	//   12   28:bipush          10
	//   13   30:invokevirtual   #174 <Method void Handler.removeMessages(int)>
		mIsRendPause = false;
	//   14   33:aload_0         
	//   15   34:iconst_0        
	//   16   35:putfield        #64  <Field boolean mIsRendPause>
		mDrawFrameTickCount.set(-1L);
	//   17   38:aload_0         
	//   18   39:getfield        #89  <Field AtomicLong mDrawFrameTickCount>
	//   19   42:ldc2w           #204 <Long -1L>
	//   20   45:invokevirtual   #146 <Method void AtomicLong.set(long)>
		resetTickCount(30);
	//   21   48:aload_0         
	//   22   49:bipush          30
	//   23   51:invokevirtual   #190 <Method void resetTickCount(int)>
	//   24   54:return          
	}

	public void resetTickCount(int i)
	{
		long l = mDrawFrameTickCount.get();
	//    0    0:aload_0         
	//    1    1:getfield        #89  <Field AtomicLong mDrawFrameTickCount>
	//    2    4:invokevirtual   #136 <Method long AtomicLong.get()>
	//    3    7:lstore_2        
		if(!mIsRendPause && mGLRenderThread != null && mGLRenderHandler != null && mGLRenderThread.isAlive())
	//*   4    8:aload_0         
	//*   5    9:getfield        #64  <Field boolean mIsRendPause>
	//*   6   12:ifne            91
	//*   7   15:aload_0         
	//*   8   16:getfield        #68  <Field HandlerThread mGLRenderThread>
	//*   9   19:ifnull          91
	//*  10   22:aload_0         
	//*  11   23:getfield        #70  <Field Handler mGLRenderHandler>
	//*  12   26:ifnull          91
	//*  13   29:aload_0         
	//*  14   30:getfield        #68  <Field HandlerThread mGLRenderThread>
	//*  15   33:invokevirtual   #143 <Method boolean HandlerThread.isAlive()>
	//*  16   36:ifeq            91
		{
			if(l <= 0L)
	//*  17   39:lload_2         
	//*  18   40:lconst_0        
	//*  19   41:lcmp            
	//*  20   42:ifgt            74
			{
				mDrawFrameTickCount.set(i);
	//   21   45:aload_0         
	//   22   46:getfield        #89  <Field AtomicLong mDrawFrameTickCount>
	//   23   49:iload_1         
	//   24   50:i2l             
	//   25   51:invokevirtual   #146 <Method void AtomicLong.set(long)>
				mGLRenderHandler.removeMessages(10);
	//   26   54:aload_0         
	//   27   55:getfield        #70  <Field Handler mGLRenderHandler>
	//   28   58:bipush          10
	//   29   60:invokevirtual   #174 <Method void Handler.removeMessages(int)>
				mGLRenderHandler.sendEmptyMessage(10);
	//   30   63:aload_0         
	//   31   64:getfield        #70  <Field Handler mGLRenderHandler>
	//   32   67:bipush          10
	//   33   69:invokevirtual   #209 <Method boolean Handler.sendEmptyMessage(int)>
	//   34   72:pop             
				return;
	//   35   73:return          
			}
			if(l < (long)i)
	//*  36   74:lload_2         
	//*  37   75:iload_1         
	//*  38   76:i2l             
	//*  39   77:lcmp            
	//*  40   78:ifge            107
			{
				mDrawFrameTickCount.set(i);
	//   41   81:aload_0         
	//   42   82:getfield        #89  <Field AtomicLong mDrawFrameTickCount>
	//   43   85:iload_1         
	//   44   86:i2l             
	//   45   87:invokevirtual   #146 <Method void AtomicLong.set(long)>
				return;
	//   46   90:return          
			}
		} else
		if(l < (long)i)
	//*  47   91:lload_2         
	//*  48   92:iload_1         
	//*  49   93:i2l             
	//*  50   94:lcmp            
	//*  51   95:ifge            107
			mDrawFrameTickCount.set(i);
	//   52   98:aload_0         
	//   53   99:getfield        #89  <Field AtomicLong mDrawFrameTickCount>
	//   54  102:iload_1         
	//   55  103:i2l             
	//   56  104:invokevirtual   #146 <Method void AtomicLong.set(long)>
	//   57  107:return          
	}

	public void sendToRenderEvent(Runnable runnable)
	{
		if(mGLRenderHandler != null && mGLRenderThread != null && mGLRenderThread.isAlive())
	//*   0    0:aload_0         
	//*   1    1:getfield        #70  <Field Handler mGLRenderHandler>
	//*   2    4:ifnull          33
	//*   3    7:aload_0         
	//*   4    8:getfield        #68  <Field HandlerThread mGLRenderThread>
	//*   5   11:ifnull          33
	//*   6   14:aload_0         
	//*   7   15:getfield        #68  <Field HandlerThread mGLRenderThread>
	//*   8   18:invokevirtual   #143 <Method boolean HandlerThread.isAlive()>
	//*   9   21:ifeq            33
			mGLRenderHandler.post(runnable);
	//   10   24:aload_0         
	//   11   25:getfield        #70  <Field Handler mGLRenderHandler>
	//   12   28:aload_1         
	//   13   29:invokevirtual   #215 <Method boolean Handler.post(Runnable)>
	//   14   32:pop             
	//   15   33:return          
	}

	public void setRenderFps(float f)
	{
		if(mTargetRenderFPS != f && f > 0.0F)
	//*   0    0:aload_0         
	//*   1    1:getfield        #62  <Field float mTargetRenderFPS>
	//*   2    4:fload_1         
	//*   3    5:fcmpl           
	//*   4    6:ifeq            31
	//*   5    9:fload_1         
	//*   6   10:fconst_0        
	//*   7   11:fcmpl           
	//*   8   12:ifle            31
		{
			mTargetFrameDurationMillis = (int)((1.0F / f) * 1000F);
	//    9   15:aload_0         
	//   10   16:fconst_1        
	//   11   17:fload_1         
	//   12   18:fdiv            
	//   13   19:ldc1            #218 <Float 1000F>
	//   14   21:fmul            
	//   15   22:f2i             
	//   16   23:putfield        #59  <Field int mTargetFrameDurationMillis>
			mTargetRenderFPS = f;
	//   17   26:aload_0         
	//   18   27:fload_1         
	//   19   28:putfield        #62  <Field float mTargetRenderFPS>
		}
	//   20   31:return          
	}

	public void setTrafficMode(boolean flag)
	{
		mIsTrafficMode = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #80  <Field boolean mIsTrafficMode>
	//    3    5:return          
	}

	public static final int ANIMATION_TICK_COUNT = 10;
	public static final int LONG_LONG_TICK_COUNT = 30;
	public static final int LONG_TICK_COUNT = 6;
	private static final int MAP_RENDER_MSG_RUNNABLE_ONGLTHREAD = 100;
	private static final int MAP_RENDER_MSG_SURFACE_RENDER = 10;
	public static final int NORMAL_TICK_COUNT = 2;
	public static final int RENDER_FPS_ANIMATION = 30;
	public static final int RENDER_FPS_GESTURE_ACTION = 40;
	static final int RENDER_FPS_MAX = 60;
	public static final int RENDER_FPS_NAVI = 10;
	public static final int RENDER_FPS_NORMAL = 15;
	static final long RENDER_TIMMER_DIFF_MIN = 16L;
	static final String TAG = "render";
	private volatile AtomicLong mDrawFrameTickCount;
	public IAMap mGLMapView;
	private Handler mGLRenderHandler;
	private HandlerThread mGLRenderThread;
	private volatile boolean mIsRendPause;
	private boolean mIsTrafficMode;
	private long mLastFrameTime;
	public volatile boolean mSurfacedestoryed;
	private int mTargetFrameDurationMillis;
	private float mTargetRenderFPS;


/*
	static boolean access$000(GLMapRender glmaprender)
	{
		return glmaprender.mIsRendPause;
	//    0    0:aload_0         
	//    1    1:getfield        #64  <Field boolean mIsRendPause>
	//    2    4:ireturn         
	}

*/
}

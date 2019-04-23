// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.craftar;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;

// Referenced classes of package com.craftar:
//			CraftARCameraView, VideoCaptureConsumerHub, AppEventForwarder, Build, 
//			UtilsImage, CameraThread, CLog

public abstract class CraftARActivity extends Activity
{
	private class MyRGBAVideoCaptureConsumer
		implements VideoCaptureConsumerHub.RGBAVideoCaptureConsumer
	{

		public void onCameraOpenFailed()
		{
			mActivity.runOnUiThread(new Runnable() {

				public void run()
				{
					mActivity.onCameraOpenFailed();
				//    0    0:aload_0         
				//    1    1:getfield        #20  <Field CraftARActivity$MyRGBAVideoCaptureConsumer this$1>
				//    2    4:getfield        #28  <Field CraftARActivity CraftARActivity$MyRGBAVideoCaptureConsumer.mActivity>
				//    3    7:invokevirtual   #29  <Method void CraftARActivity.onCameraOpenFailed()>
				//    4   10:return          
				}

				final MyRGBAVideoCaptureConsumer this$1;

			
			{
				this$1 = MyRGBAVideoCaptureConsumer.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #20  <Field CraftARActivity$MyRGBAVideoCaptureConsumer this$1>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #22  <Method void Object()>
			//    5    9:return          
			}
			}
);
		//    0    0:aload_0         
		//    1    1:getfield        #25  <Field CraftARActivity mActivity>
		//    2    4:new             #13  <Class CraftARActivity$MyRGBAVideoCaptureConsumer$2>
		//    3    7:dup             
		//    4    8:aload_0         
		//    5    9:invokespecial   #30  <Method void CraftARActivity$MyRGBAVideoCaptureConsumer$2(CraftARActivity$MyRGBAVideoCaptureConsumer)>
		//    6   12:invokevirtual   #34  <Method void CraftARActivity.runOnUiThread(Runnable)>
		//    7   15:return          
		}

		public void onPreviewRGBAFrame(byte abyte0[])
		{
			mActivity.onPreviewFrame(abyte0);
		//    0    0:aload_0         
		//    1    1:getfield        #25  <Field CraftARActivity mActivity>
		//    2    4:aload_1         
		//    3    5:invokevirtual   #39  <Method void CraftARActivity.onPreviewFrame(byte[])>
		//    4    8:return          
		}

		public void onPreviewStarted(int i, final int width, int j)
		{
			mActivity.runOnUiThread(((_cls1) (j)). new Runnable() {

				public void run()
				{
					mActivity.onPreviewStarted(width, height);
				//    0    0:aload_0         
				//    1    1:getfield        #23  <Field CraftARActivity$MyRGBAVideoCaptureConsumer this$1>
				//    2    4:getfield        #36  <Field CraftARActivity CraftARActivity$MyRGBAVideoCaptureConsumer.mActivity>
				//    3    7:aload_0         
				//    4    8:getfield        #25  <Field int val$width>
				//    5   11:aload_0         
				//    6   12:getfield        #27  <Field int val$height>
				//    7   15:invokevirtual   #39  <Method void CraftARActivity.onPreviewStarted(int, int)>
				//    8   18:return          
				}

				final MyRGBAVideoCaptureConsumer this$1;
				final int val$height;
				final int val$width;

			
			{
				this$1 = final_myrgbavideocaptureconsumer;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #23  <Field CraftARActivity$MyRGBAVideoCaptureConsumer this$1>
				width = i;
			//    3    5:aload_0         
			//    4    6:iload_2         
			//    5    7:putfield        #25  <Field int val$width>
				height = I.this;
			//    6   10:aload_0         
			//    7   11:iload_3         
			//    8   12:putfield        #27  <Field int val$height>
				super();
			//    9   15:aload_0         
			//   10   16:invokespecial   #30  <Method void Object()>
			//   11   19:return          
			}
			}
);
		//    0    0:aload_0         
		//    1    1:getfield        #25  <Field CraftARActivity mActivity>
		//    2    4:new             #11  <Class CraftARActivity$MyRGBAVideoCaptureConsumer$1>
		//    3    7:dup             
		//    4    8:aload_0         
		//    5    9:iload_2         
		//    6   10:iload_3         
		//    7   11:invokespecial   #44  <Method void CraftARActivity$MyRGBAVideoCaptureConsumer$1(CraftARActivity$MyRGBAVideoCaptureConsumer, int, int)>
		//    8   14:invokevirtual   #34  <Method void CraftARActivity.runOnUiThread(Runnable)>
		//    9   17:return          
		}

		public void onProcessingDone()
		{
		//    0    0:return          
		}

		public void onReadyToSetPreviewDisplay(int i, int j)
		{
		//    0    0:return          
		}

		CraftARActivity mActivity;
		final CraftARActivity this$0;

		MyRGBAVideoCaptureConsumer(CraftARActivity craftaractivity1)
		{
			this$0 = CraftARActivity.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #20  <Field CraftARActivity this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #23  <Method void Object()>
			mActivity = craftaractivity1;
		//    5    9:aload_0         
		//    6   10:aload_2         
		//    7   11:putfield        #25  <Field CraftARActivity mActivity>
		//    8   14:return          
		}
	}


	public CraftARActivity()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #21  <Method void Activity()>
		isActivityAlive = false;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #23  <Field boolean isActivityAlive>
	//    5    9:return          
	}

	private int findCraftARCameraViewId(ViewGroup viewgroup)
	{
		int l = viewgroup.getChildCount();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #32  <Method int ViewGroup.getChildCount()>
	//    2    4:istore          5
		int j = -1;
	//    3    6:iconst_m1       
	//    4    7:istore_3        
		for(int i = 0; i < l; i++)
	//*   5    8:iconst_0        
	//*   6    9:istore_2        
	//*   7   10:iload_2         
	//*   8   11:iload           5
	//*   9   13:icmpge          74
		{
			View view = viewgroup.getChildAt(i);
	//   10   16:aload_1         
	//   11   17:iload_2         
	//   12   18:invokevirtual   #36  <Method View ViewGroup.getChildAt(int)>
	//   13   21:astore          6
			if(view instanceof CraftARCameraView)
	//*  14   23:aload           6
	//*  15   25:instanceof      #38  <Class CraftARCameraView>
	//*  16   28:ifeq            37
				return view.getId();
	//   17   31:aload           6
	//   18   33:invokevirtual   #43  <Method int View.getId()>
	//   19   36:ireturn         
			if(!(view instanceof ViewGroup))
				continue;
	//   20   37:aload           6
	//   21   39:instanceof      #28  <Class ViewGroup>
	//   22   42:ifeq            67
			int k = findCraftARCameraViewId((ViewGroup)view);
	//   23   45:aload_0         
	//   24   46:aload           6
	//   25   48:checkcast       #28  <Class ViewGroup>
	//   26   51:invokespecial   #45  <Method int findCraftARCameraViewId(ViewGroup)>
	//   27   54:istore          4
			j = k;
	//   28   56:iload           4
	//   29   58:istore_3        
			if(k > 0)
	//*  30   59:iload           4
	//*  31   61:ifle            67
				return k;
	//   32   64:iload           4
	//   33   66:ireturn         
		}

	//   34   67:iload_2         
	//   35   68:iconst_1        
	//   36   69:iadd            
	//   37   70:istore_2        
	//*  38   71:goto            10
		return j;
	//   39   74:iload_3         
	//   40   75:ireturn         
	}

	public void finish()
	{
		super.finish();
	//    0    0:aload_0         
	//    1    1:invokespecial   #48  <Method void Activity.finish()>
		VideoCaptureConsumerHub.Instance().requestRGBAFrames(mRGBAVideoCaptureConsumer, false);
	//    2    4:invokestatic    #54  <Method VideoCaptureConsumerHub VideoCaptureConsumerHub.Instance()>
	//    3    7:aload_0         
	//    4    8:getfield        #56  <Field VideoCaptureConsumerHub$RGBAVideoCaptureConsumer mRGBAVideoCaptureConsumer>
	//    5   11:iconst_0        
	//    6   12:invokevirtual   #60  <Method boolean VideoCaptureConsumerHub.requestRGBAFrames(VideoCaptureConsumerHub$RGBAVideoCaptureConsumer, boolean)>
	//    7   15:pop             
		mRGBAVideoCaptureConsumer = null;
	//    8   16:aload_0         
	//    9   17:aconst_null     
	//   10   18:putfield        #56  <Field VideoCaptureConsumerHub$RGBAVideoCaptureConsumer mRGBAVideoCaptureConsumer>
		AppEventForwarder.forwardFinish();
	//   11   21:invokestatic    #65  <Method void AppEventForwarder.forwardFinish()>
		isActivityAlive = false;
	//   12   24:aload_0         
	//   13   25:iconst_0        
	//   14   26:putfield        #23  <Field boolean isActivityAlive>
	//   15   29:return          
	}

	public void onBackPressed()
	{
		finish();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #67  <Method void finish()>
	//    2    4:return          
	}

	public abstract void onCameraOpenFailed();

	public void onCameraReleased()
	{
	//    0    0:return          
	}

	public void onCreate(Bundle bundle)
	{
		Build.setup();
	//    0    0:invokestatic    #76  <Method void Build.setup()>
		Object obj = ((Object) (getApplicationContext()));
	//    1    3:aload_0         
	//    2    4:invokevirtual   #80  <Method android.content.Context getApplicationContext()>
	//    3    7:astore_2        
		UtilsImage.Instance().setContext(((android.content.Context) (obj)));
	//    4    8:invokestatic    #85  <Method UtilsImage UtilsImage.Instance()>
	//    5   11:aload_2         
	//    6   12:invokevirtual   #89  <Method void UtilsImage.setContext(android.content.Context)>
		mRGBAVideoCaptureConsumer = ((VideoCaptureConsumerHub.RGBAVideoCaptureConsumer) (new MyRGBAVideoCaptureConsumer(this)));
	//    7   15:aload_0         
	//    8   16:new             #8   <Class CraftARActivity$MyRGBAVideoCaptureConsumer>
	//    9   19:dup             
	//   10   20:aload_0         
	//   11   21:aload_0         
	//   12   22:invokespecial   #92  <Method void CraftARActivity$MyRGBAVideoCaptureConsumer(CraftARActivity, CraftARActivity)>
	//   13   25:putfield        #56  <Field VideoCaptureConsumerHub$RGBAVideoCaptureConsumer mRGBAVideoCaptureConsumer>
		VideoCaptureConsumerHub.Instance().requestRGBAFrames(mRGBAVideoCaptureConsumer, true);
	//   14   28:invokestatic    #54  <Method VideoCaptureConsumerHub VideoCaptureConsumerHub.Instance()>
	//   15   31:aload_0         
	//   16   32:getfield        #56  <Field VideoCaptureConsumerHub$RGBAVideoCaptureConsumer mRGBAVideoCaptureConsumer>
	//   17   35:iconst_1        
	//   18   36:invokevirtual   #60  <Method boolean VideoCaptureConsumerHub.requestRGBAFrames(VideoCaptureConsumerHub$RGBAVideoCaptureConsumer, boolean)>
	//   19   39:pop             
		obj = ((Object) (CameraThread.Instance(((android.content.Context) (obj)))));
	//   20   40:aload_2         
	//   21   41:invokestatic    #97  <Method CameraThread CameraThread.Instance(android.content.Context)>
	//   22   44:astore_2        
		if(!((CameraThread) (obj)).isAlive())
	//*  23   45:aload_2         
	//*  24   46:invokevirtual   #101 <Method boolean CameraThread.isAlive()>
	//*  25   49:ifne            56
			((CameraThread) (obj)).start();
	//   26   52:aload_2         
	//   27   53:invokevirtual   #104 <Method void CameraThread.start()>
		VideoCaptureConsumerHub videocaptureconsumerhub = VideoCaptureConsumerHub.Instance();
	//   28   56:invokestatic    #54  <Method VideoCaptureConsumerHub VideoCaptureConsumerHub.Instance()>
	//   29   59:astore_3        
		if(!videocaptureconsumerhub.isAlive())
	//*  30   60:aload_3         
	//*  31   61:invokevirtual   #105 <Method boolean VideoCaptureConsumerHub.isAlive()>
	//*  32   64:ifne            71
			videocaptureconsumerhub.start();
	//   33   67:aload_3         
	//   34   68:invokevirtual   #106 <Method void VideoCaptureConsumerHub.start()>
		((CameraThread) (obj)).setVideoCaptureConsumer(videocaptureconsumerhub);
	//   35   71:aload_2         
	//   36   72:aload_3         
	//   37   73:invokevirtual   #110 <Method void CameraThread.setVideoCaptureConsumer(VideoCaptureConsumerHub)>
		((CameraThread) (obj)).setOnCameraClosedListener(new CameraThread.OnCameraClosedListener() {

			public void onCameraClosed()
			{
				onCameraReleased();
			//    0    0:aload_0         
			//    1    1:getfield        #17  <Field CraftARActivity this$0>
			//    2    4:invokevirtual   #25  <Method void CraftARActivity.onCameraReleased()>
			//    3    7:return          
			}

			final CraftARActivity this$0;

			
			{
				this$0 = CraftARActivity.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field CraftARActivity this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #20  <Method void Object()>
			//    5    9:return          
			}
		}
);
	//   38   76:aload_2         
	//   39   77:new             #6   <Class CraftARActivity$1>
	//   40   80:dup             
	//   41   81:aload_0         
	//   42   82:invokespecial   #113 <Method void CraftARActivity$1(CraftARActivity)>
	//   43   85:invokevirtual   #117 <Method void CameraThread.setOnCameraClosedListener(CameraThread$OnCameraClosedListener)>
		super.onCreate(bundle);
	//   44   88:aload_0         
	//   45   89:aload_1         
	//   46   90:invokespecial   #119 <Method void Activity.onCreate(Bundle)>
		isActivityAlive = true;
	//   47   93:aload_0         
	//   48   94:iconst_1        
	//   49   95:putfield        #23  <Field boolean isActivityAlive>
		onPostCreate();
	//   50   98:aload_0         
	//   51   99:invokevirtual   #122 <Method void onPostCreate()>
	//   52  102:return          
	}

	public void onPause()
	{
		super.onPause();
	//    0    0:aload_0         
	//    1    1:invokespecial   #125 <Method void Activity.onPause()>
		AppEventForwarder.forwardPause();
	//    2    4:invokestatic    #128 <Method void AppEventForwarder.forwardPause()>
	//    3    7:return          
	}

	public abstract void onPostCreate();

	public void onPreviewFrame(byte abyte0[])
	{
	//    0    0:return          
	}

	public abstract void onPreviewStarted(int i, int j);

	public void onResume()
	{
		super.onResume();
	//    0    0:aload_0         
	//    1    1:invokespecial   #135 <Method void Activity.onResume()>
		AppEventForwarder.forwardResume();
	//    2    4:invokestatic    #138 <Method void AppEventForwarder.forwardResume()>
	//    3    7:return          
	}

	public void setContentView(View view)
	{
		super.setContentView(view);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #142 <Method void Activity.setContentView(View)>
		if(view instanceof ViewGroup)
	//*   3    5:aload_1         
	//*   4    6:instanceof      #28  <Class ViewGroup>
	//*   5    9:ifeq            34
		{
			if(findCraftARCameraViewId((ViewGroup)view) >= 0)
	//*   6   12:aload_0         
	//*   7   13:aload_1         
	//*   8   14:checkcast       #28  <Class ViewGroup>
	//*   9   17:invokespecial   #45  <Method int findCraftARCameraViewId(ViewGroup)>
	//*  10   20:iflt            29
			{
				CLog.d("CraftARCameraView exists");
	//   11   23:ldc1            #144 <String "CraftARCameraView exists">
	//   12   25:invokestatic    #150 <Method void CLog.d(String)>
				return;
	//   13   28:return          
			}
			CLog.e("CraftARCameraView NOT found! Please, ensure you provided a CraftARCameraView in your layout.");
	//   14   29:ldc1            #152 <String "CraftARCameraView NOT found! Please, ensure you provided a CraftARCameraView in your layout.">
	//   15   31:invokestatic    #155 <Method void CLog.e(String)>
		}
	//   16   34:return          
	}

	boolean isActivityAlive;
	private VideoCaptureConsumerHub.RGBAVideoCaptureConsumer mRGBAVideoCaptureConsumer;
}

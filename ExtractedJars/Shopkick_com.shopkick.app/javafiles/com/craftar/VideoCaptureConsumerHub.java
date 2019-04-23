// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.craftar;

import android.os.Handler;
import android.os.Process;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package com.craftar:
//			MyHandlerThread, CLog, Build, UtilsImage, 
//			CameraThread, CraftARError

class VideoCaptureConsumerHub extends MyHandlerThread
	implements CameraThread.CameraThreadEventHandler
{
	private static interface AbstractVideoCaptureConsumer
	{

		public abstract void onCameraOpenFailed();

		public abstract void onPreviewStarted(int i, int j, int k);

		public abstract void onReadyToSetPreviewDisplay(int i, int j);
	}

	static interface GRAYVideoCaptureConsumer
		extends AbstractVideoCaptureConsumer
	{

		public abstract void onPreviewGRAYFrame(byte abyte0[]);
	}

	private class GetNewFrameRunnable
		implements Runnable
	{

		public void run()
		{
			byte abyte0[] = CameraThread.Instance(((android.content.Context) (null))).getLastFrame(((byte []) (null)));
		//    0    0:aconst_null     
		//    1    1:invokestatic    #29  <Method CameraThread CameraThread.Instance(android.content.Context)>
		//    2    4:aconst_null     
		//    3    5:invokevirtual   #33  <Method byte[] CameraThread.getLastFrame(byte[])>
		//    4    8:astore_1        
			if(abyte0 != null)
		//*   5    9:aload_1         
		//*   6   10:ifnull          46
			{
				mProcessNewFrameRunnable.set(abyte0, System.currentTimeMillis());
		//    7   13:aload_0         
		//    8   14:getfield        #15  <Field VideoCaptureConsumerHub this$0>
		//    9   17:invokestatic    #37  <Method VideoCaptureConsumerHub$ProcessNewFrameRunnable VideoCaptureConsumerHub.access$200(VideoCaptureConsumerHub)>
		//   10   20:aload_1         
		//   11   21:invokestatic    #43  <Method long System.currentTimeMillis()>
		//   12   24:invokevirtual   #49  <Method void VideoCaptureConsumerHub$ProcessNewFrameRunnable.set(byte[], long)>
				mHandler.post(((Runnable) (mProcessNewFrameRunnable)));
		//   13   27:aload_0         
		//   14   28:getfield        #15  <Field VideoCaptureConsumerHub this$0>
		//   15   31:getfield        #53  <Field Handler VideoCaptureConsumerHub.mHandler>
		//   16   34:aload_0         
		//   17   35:getfield        #15  <Field VideoCaptureConsumerHub this$0>
		//   18   38:invokestatic    #37  <Method VideoCaptureConsumerHub$ProcessNewFrameRunnable VideoCaptureConsumerHub.access$200(VideoCaptureConsumerHub)>
		//   19   41:invokevirtual   #59  <Method boolean Handler.post(Runnable)>
		//   20   44:pop             
				return;
		//   21   45:return          
			} else
			{
				mHandler.postDelayed(((Runnable) (this)), 10L);
		//   22   46:aload_0         
		//   23   47:getfield        #15  <Field VideoCaptureConsumerHub this$0>
		//   24   50:getfield        #53  <Field Handler VideoCaptureConsumerHub.mHandler>
		//   25   53:aload_0         
		//   26   54:ldc2w           #60  <Long 10L>
		//   27   57:invokevirtual   #65  <Method boolean Handler.postDelayed(Runnable, long)>
		//   28   60:pop             
				return;
		//   29   61:return          
			}
		}

		final VideoCaptureConsumerHub this$0;

		private GetNewFrameRunnable()
		{
			this$0 = VideoCaptureConsumerHub.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #15  <Field VideoCaptureConsumerHub this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #18  <Method void Object()>
		//    5    9:return          
		}

	}

	static interface NV21VideoCaptureConsumer
		extends AbstractVideoCaptureConsumer
	{

		public abstract void onPreviewNV21Frame(byte abyte0[]);
	}

	private class ProcessNewFrameRunnable
		implements Runnable
	{

		public void run()
		{
			Process.setThreadPriority(Process.myTid(), -8);
		//    0    0:invokestatic    #33  <Method int Process.myTid()>
		//    1    3:bipush          -8
		//    2    5:invokestatic    #37  <Method void Process.setThreadPriority(int, int)>
			onPreviewFrameInternal(mBuffer);
		//    3    8:aload_0         
		//    4    9:getfield        #19  <Field VideoCaptureConsumerHub this$0>
		//    5   12:aload_0         
		//    6   13:getfield        #39  <Field byte[] mBuffer>
		//    7   16:invokestatic    #43  <Method void VideoCaptureConsumerHub.access$100(VideoCaptureConsumerHub, byte[])>
		//    8   19:return          
		}

		void set(byte abyte0[], long l)
		{
			mPostTime = l;
		//    0    0:aload_0         
		//    1    1:lload_2         
		//    2    2:putfield        #47  <Field long mPostTime>
			mBuffer = abyte0;
		//    3    5:aload_0         
		//    4    6:aload_1         
		//    5    7:putfield        #39  <Field byte[] mBuffer>
		//    6   10:return          
		}

		byte mBuffer[];
		long mPostTime;
		final VideoCaptureConsumerHub this$0;

		private ProcessNewFrameRunnable()
		{
			this$0 = VideoCaptureConsumerHub.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #19  <Field VideoCaptureConsumerHub this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #22  <Method void Object()>
		//    5    9:return          
		}

	}

	static interface RGBAVideoCaptureConsumer
		extends AbstractVideoCaptureConsumer
	{

		public abstract void onPreviewRGBAFrame(byte abyte0[]);

		public abstract void onProcessingDone();
	}

	static interface TakePictureConsumer
		extends AbstractVideoCaptureConsumer
	{

		public abstract void onPictureTaken(byte abyte0[], int i, int j, int k);

		public abstract void takePictureFailed(CraftARError craftarerror);
	}


	private VideoCaptureConsumerHub()
	{
		super("FrameProcessingThread");
	//    0    0:aload_0         
	//    1    1:ldc1            #64  <String "FrameProcessingThread">
	//    2    3:invokespecial   #67  <Method void MyHandlerThread(String)>
		mIsStarted = false;
	//    3    6:aload_0         
	//    4    7:iconst_0        
	//    5    8:putfield        #69  <Field boolean mIsStarted>
		mBufferSize = -1;
	//    6   11:aload_0         
	//    7   12:iconst_m1       
	//    8   13:putfield        #71  <Field int mBufferSize>
		mFrameWidth = -1;
	//    9   16:aload_0         
	//   10   17:iconst_m1       
	//   11   18:putfield        #73  <Field int mFrameWidth>
		mFrameHeight = -1;
	//   12   21:aload_0         
	//   13   22:iconst_m1       
	//   14   23:putfield        #75  <Field int mFrameHeight>
		mFrameRGBA = null;
	//   15   26:aload_0         
	//   16   27:aconst_null     
	//   17   28:putfield        #77  <Field byte[] mFrameRGBA>
		takePictureConsumers = new ArrayList();
	//   18   31:aload_0         
	//   19   32:new             #79  <Class ArrayList>
	//   20   35:dup             
	//   21   36:invokespecial   #81  <Method void ArrayList()>
	//   22   39:putfield        #83  <Field ArrayList takePictureConsumers>
		grayConsumers = new ArrayList();
	//   23   42:aload_0         
	//   24   43:new             #79  <Class ArrayList>
	//   25   46:dup             
	//   26   47:invokespecial   #81  <Method void ArrayList()>
	//   27   50:putfield        #85  <Field ArrayList grayConsumers>
		rgbaConsumers = new ArrayList();
	//   28   53:aload_0         
	//   29   54:new             #79  <Class ArrayList>
	//   30   57:dup             
	//   31   58:invokespecial   #81  <Method void ArrayList()>
	//   32   61:putfield        #87  <Field ArrayList rgbaConsumers>
		nv21Consumers = new ArrayList();
	//   33   64:aload_0         
	//   34   65:new             #79  <Class ArrayList>
	//   35   68:dup             
	//   36   69:invokespecial   #81  <Method void ArrayList()>
	//   37   72:putfield        #89  <Field ArrayList nv21Consumers>
		mProcessNewFrameRunnable = new ProcessNewFrameRunnable();
	//   38   75:aload_0         
	//   39   76:new             #30  <Class VideoCaptureConsumerHub$ProcessNewFrameRunnable>
	//   40   79:dup             
	//   41   80:aload_0         
	//   42   81:aconst_null     
	//   43   82:invokespecial   #92  <Method void VideoCaptureConsumerHub$ProcessNewFrameRunnable(VideoCaptureConsumerHub, VideoCaptureConsumerHub$1)>
	//   44   85:putfield        #94  <Field VideoCaptureConsumerHub$ProcessNewFrameRunnable mProcessNewFrameRunnable>
		converterRGBAthread = new MyHandlerThread("ConvertYuv420SPtoRGBAThread");
	//   45   88:aload_0         
	//   46   89:new             #4   <Class MyHandlerThread>
	//   47   92:dup             
	//   48   93:ldc1            #96  <String "ConvertYuv420SPtoRGBAThread">
	//   49   95:invokespecial   #67  <Method void MyHandlerThread(String)>
	//   50   98:putfield        #98  <Field MyHandlerThread converterRGBAthread>
	//   51  101:return          
	}

	static VideoCaptureConsumerHub Instance()
	{
		if(self == null)
	//*   0    0:getstatic       #103 <Field VideoCaptureConsumerHub self>
	//*   1    3:ifnonnull       16
			self = new VideoCaptureConsumerHub();
	//    2    6:new             #2   <Class VideoCaptureConsumerHub>
	//    3    9:dup             
	//    4   10:invokespecial   #104 <Method void VideoCaptureConsumerHub()>
	//    5   13:putstatic       #103 <Field VideoCaptureConsumerHub self>
		return self;
	//    6   16:getstatic       #103 <Field VideoCaptureConsumerHub self>
	//    7   19:areturn         
	}

	private void onCameraOpenFailedInternal()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		for(Iterator iterator = rgbaConsumers.iterator(); iterator.hasNext(); ((RGBAVideoCaptureConsumer)(AbstractVideoCaptureConsumer)iterator.next()).onCameraOpenFailed());
	//    2    2:aload_0         
	//    3    3:getfield        #87  <Field ArrayList rgbaConsumers>
	//    4    6:invokevirtual   #139 <Method Iterator ArrayList.iterator()>
	//    5    9:astore_1        
	//    6   10:aload_1         
	//    7   11:invokeinterface #145 <Method boolean Iterator.hasNext()>
	//    8   16:ifeq            39
	//    9   19:aload_1         
	//   10   20:invokeinterface #149 <Method Object Iterator.next()>
	//   11   25:checkcast       #18  <Class VideoCaptureConsumerHub$AbstractVideoCaptureConsumer>
	//   12   28:checkcast       #33  <Class VideoCaptureConsumerHub$RGBAVideoCaptureConsumer>
	//   13   31:invokeinterface #152 <Method void VideoCaptureConsumerHub$RGBAVideoCaptureConsumer.onCameraOpenFailed()>
	//*  14   36:goto            10
		for(Iterator iterator1 = grayConsumers.iterator(); iterator1.hasNext(); ((GRAYVideoCaptureConsumer)(AbstractVideoCaptureConsumer)iterator1.next()).onCameraOpenFailed());
	//   15   39:aload_0         
	//   16   40:getfield        #85  <Field ArrayList grayConsumers>
	//   17   43:invokevirtual   #139 <Method Iterator ArrayList.iterator()>
	//   18   46:astore_1        
	//   19   47:aload_1         
	//   20   48:invokeinterface #145 <Method boolean Iterator.hasNext()>
	//   21   53:ifeq            76
	//   22   56:aload_1         
	//   23   57:invokeinterface #149 <Method Object Iterator.next()>
	//   24   62:checkcast       #18  <Class VideoCaptureConsumerHub$AbstractVideoCaptureConsumer>
	//   25   65:checkcast       #21  <Class VideoCaptureConsumerHub$GRAYVideoCaptureConsumer>
	//   26   68:invokeinterface #153 <Method void VideoCaptureConsumerHub$GRAYVideoCaptureConsumer.onCameraOpenFailed()>
	//*  27   73:goto            47
		for(Iterator iterator2 = nv21Consumers.iterator(); iterator2.hasNext(); ((NV21VideoCaptureConsumer)(AbstractVideoCaptureConsumer)iterator2.next()).onCameraOpenFailed());
	//   28   76:aload_0         
	//   29   77:getfield        #89  <Field ArrayList nv21Consumers>
	//   30   80:invokevirtual   #139 <Method Iterator ArrayList.iterator()>
	//   31   83:astore_1        
	//   32   84:aload_1         
	//   33   85:invokeinterface #145 <Method boolean Iterator.hasNext()>
	//   34   90:ifeq            113
	//   35   93:aload_1         
	//   36   94:invokeinterface #149 <Method Object Iterator.next()>
	//   37   99:checkcast       #18  <Class VideoCaptureConsumerHub$AbstractVideoCaptureConsumer>
	//   38  102:checkcast       #27  <Class VideoCaptureConsumerHub$NV21VideoCaptureConsumer>
	//   39  105:invokeinterface #154 <Method void VideoCaptureConsumerHub$NV21VideoCaptureConsumer.onCameraOpenFailed()>
	//*  40  110:goto            84
		this;
	//   41  113:aload_0         
		JVM INSTR monitorexit ;
	//   42  114:monitorexit     
		return;
	//   43  115:return          
		Exception exception;
		exception;
	//   44  116:astore_1        
		this;
	//   45  117:aload_0         
		JVM INSTR monitorexit ;
	//   46  118:monitorexit     
		throw exception;
	//   47  119:aload_1         
	//   48  120:athrow          
	}

	private void onPictureTakenInternal(byte abyte0[], int i, int j, int k)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		for(Iterator iterator = takePictureConsumers.iterator(); iterator.hasNext(); ((TakePictureConsumer)(AbstractVideoCaptureConsumer)iterator.next()).onPictureTaken(abyte0, i, j, k));
	//    2    2:aload_0         
	//    3    3:getfield        #83  <Field ArrayList takePictureConsumers>
	//    4    6:invokevirtual   #139 <Method Iterator ArrayList.iterator()>
	//    5    9:astore          5
	//    6   11:aload           5
	//    7   13:invokeinterface #145 <Method boolean Iterator.hasNext()>
	//    8   18:ifeq            47
	//    9   21:aload           5
	//   10   23:invokeinterface #149 <Method Object Iterator.next()>
	//   11   28:checkcast       #18  <Class VideoCaptureConsumerHub$AbstractVideoCaptureConsumer>
	//   12   31:checkcast       #36  <Class VideoCaptureConsumerHub$TakePictureConsumer>
	//   13   34:aload_1         
	//   14   35:iload_2         
	//   15   36:iload_3         
	//   16   37:iload           4
	//   17   39:invokeinterface #157 <Method void VideoCaptureConsumerHub$TakePictureConsumer.onPictureTaken(byte[], int, int, int)>
	//*  18   44:goto            11
		this;
	//   19   47:aload_0         
		JVM INSTR monitorexit ;
	//   20   48:monitorexit     
		return;
	//   21   49:return          
		abyte0;
	//   22   50:astore_1        
		this;
	//   23   51:aload_0         
		JVM INSTR monitorexit ;
	//   24   52:monitorexit     
		throw abyte0;
	//   25   53:aload_1         
	//   26   54:athrow          
	}

	private void onPreviewFrameInternal(byte abyte0[])
	{
		byte abyte1[];
		mCameraBuffer = abyte0;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #159 <Field byte[] mCameraBuffer>
		if(!grayConsumers.isEmpty())
	//*   3    5:aload_0         
	//*   4    6:getfield        #85  <Field ArrayList grayConsumers>
	//*   5    9:invokevirtual   #162 <Method boolean ArrayList.isEmpty()>
	//*   6   12:ifne            39
			abyte1 = ByteBuffer.wrap(mCameraBuffer, 0, mFrameWidth * mFrameHeight).array();
	//    7   15:aload_0         
	//    8   16:getfield        #159 <Field byte[] mCameraBuffer>
	//    9   19:iconst_0        
	//   10   20:aload_0         
	//   11   21:getfield        #73  <Field int mFrameWidth>
	//   12   24:aload_0         
	//   13   25:getfield        #75  <Field int mFrameHeight>
	//   14   28:imul            
	//   15   29:invokestatic    #168 <Method ByteBuffer ByteBuffer.wrap(byte[], int, int)>
	//   16   32:invokevirtual   #172 <Method byte[] ByteBuffer.array()>
	//   17   35:astore_3        
		else
	//*  18   36:goto            41
			abyte1 = null;
	//   19   39:aconst_null     
	//   20   40:astore_3        
		this;
	//   21   41:aload_0         
		JVM INSTR monitorenter ;
	//   22   42:monitorenter    
		Object obj1 = ((Object) ((ArrayList)grayConsumers.clone()));
	//   23   43:aload_0         
	//   24   44:getfield        #85  <Field ArrayList grayConsumers>
	//   25   47:invokevirtual   #175 <Method Object ArrayList.clone()>
	//   26   50:checkcast       #79  <Class ArrayList>
	//   27   53:astore          4
		this;
	//   28   55:aload_0         
		JVM INSTR monitorexit ;
	//   29   56:monitorexit     
		for(obj1 = ((Object) (((ArrayList) (obj1)).iterator())); ((Iterator) (obj1)).hasNext(); ((GRAYVideoCaptureConsumer)(AbstractVideoCaptureConsumer)((Iterator) (obj1)).next()).onPreviewGRAYFrame(abyte1));
	//   30   57:aload           4
	//   31   59:invokevirtual   #139 <Method Iterator ArrayList.iterator()>
	//   32   62:astore          4
	//   33   64:aload           4
	//   34   66:invokeinterface #145 <Method boolean Iterator.hasNext()>
	//   35   71:ifeq            96
	//   36   74:aload           4
	//   37   76:invokeinterface #149 <Method Object Iterator.next()>
	//   38   81:checkcast       #18  <Class VideoCaptureConsumerHub$AbstractVideoCaptureConsumer>
	//   39   84:checkcast       #21  <Class VideoCaptureConsumerHub$GRAYVideoCaptureConsumer>
	//   40   87:aload_3         
	//   41   88:invokeinterface #178 <Method void VideoCaptureConsumerHub$GRAYVideoCaptureConsumer.onPreviewGRAYFrame(byte[])>
	//*  42   93:goto            64
		this;
	//   43   96:aload_0         
		JVM INSTR monitorenter ;
	//   44   97:monitorenter    
		Object obj = ((Object) ((ArrayList)nv21Consumers.clone()));
	//   45   98:aload_0         
	//   46   99:getfield        #89  <Field ArrayList nv21Consumers>
	//   47  102:invokevirtual   #175 <Method Object ArrayList.clone()>
	//   48  105:checkcast       #79  <Class ArrayList>
	//   49  108:astore_3        
		this;
	//   50  109:aload_0         
		JVM INSTR monitorexit ;
	//   51  110:monitorexit     
		for(obj = ((Object) (((ArrayList) (obj)).iterator())); ((Iterator) (obj)).hasNext(); ((NV21VideoCaptureConsumer)(AbstractVideoCaptureConsumer)((Iterator) (obj)).next()).onPreviewNV21Frame(abyte0));
	//   52  111:aload_3         
	//   53  112:invokevirtual   #139 <Method Iterator ArrayList.iterator()>
	//   54  115:astore_3        
	//   55  116:aload_3         
	//   56  117:invokeinterface #145 <Method boolean Iterator.hasNext()>
	//   57  122:ifeq            146
	//   58  125:aload_3         
	//   59  126:invokeinterface #149 <Method Object Iterator.next()>
	//   60  131:checkcast       #18  <Class VideoCaptureConsumerHub$AbstractVideoCaptureConsumer>
	//   61  134:checkcast       #27  <Class VideoCaptureConsumerHub$NV21VideoCaptureConsumer>
	//   62  137:aload_1         
	//   63  138:invokeinterface #181 <Method void VideoCaptureConsumerHub$NV21VideoCaptureConsumer.onPreviewNV21Frame(byte[])>
	//*  64  143:goto            116
		if(rgbaConsumers.isEmpty())
			break MISSING_BLOCK_LABEL_319;
	//   65  146:aload_0         
	//   66  147:getfield        #87  <Field ArrayList rgbaConsumers>
	//   67  150:invokevirtual   #162 <Method boolean ArrayList.isEmpty()>
	//   68  153:ifne            319
		if(mFrameRGBA == null)
	//*  69  156:aload_0         
	//*  70  157:getfield        #77  <Field byte[] mFrameRGBA>
	//*  71  160:ifnonnull       210
		{
			int i = mFrameWidth * mFrameHeight * 4;
	//   72  163:aload_0         
	//   73  164:getfield        #73  <Field int mFrameWidth>
	//   74  167:aload_0         
	//   75  168:getfield        #75  <Field int mFrameHeight>
	//   76  171:imul            
	//   77  172:iconst_4        
	//   78  173:imul            
	//   79  174:istore_2        
			abyte0 = ((byte []) (new StringBuilder()));
	//   80  175:new             #183 <Class StringBuilder>
	//   81  178:dup             
	//   82  179:invokespecial   #184 <Method void StringBuilder()>
	//   83  182:astore_1        
			((StringBuilder) (abyte0)).append("Allocating RGBAframe in VideoCaptureConsumerHub with size ");
	//   84  183:aload_1         
	//   85  184:ldc1            #186 <String "Allocating RGBAframe in VideoCaptureConsumerHub with size ">
	//   86  186:invokevirtual   #190 <Method StringBuilder StringBuilder.append(String)>
	//   87  189:pop             
			((StringBuilder) (abyte0)).append(i);
	//   88  190:aload_1         
	//   89  191:iload_2         
	//   90  192:invokevirtual   #193 <Method StringBuilder StringBuilder.append(int)>
	//   91  195:pop             
			CLog.v(((StringBuilder) (abyte0)).toString());
	//   92  196:aload_1         
	//   93  197:invokevirtual   #197 <Method String StringBuilder.toString()>
	//   94  200:invokestatic    #202 <Method void CLog.v(String)>
			mFrameRGBA = new byte[i];
	//   95  203:aload_0         
	//   96  204:iload_2         
	//   97  205:newarray        byte[]
	//   98  207:putfield        #77  <Field byte[] mFrameRGBA>
		}
		if(Build.isUnity)
	//*  99  210:getstatic       #207 <Field boolean Build.isUnity>
	//* 100  213:ifeq            238
			UtilsImage.Instance().decodeYUV420SPtoRGBAUnity(mCameraBuffer, mFrameWidth, mFrameHeight);
	//  101  216:invokestatic    #212 <Method UtilsImage UtilsImage.Instance()>
	//  102  219:aload_0         
	//  103  220:getfield        #159 <Field byte[] mCameraBuffer>
	//  104  223:aload_0         
	//  105  224:getfield        #73  <Field int mFrameWidth>
	//  106  227:aload_0         
	//  107  228:getfield        #75  <Field int mFrameHeight>
	//  108  231:invokevirtual   #216 <Method boolean UtilsImage.decodeYUV420SPtoRGBAUnity(byte[], int, int)>
	//  109  234:pop             
		else
	//* 110  235:goto            261
			UtilsImage.Instance().decodeYUV420SPtoRGBA(mCameraBuffer, mFrameWidth, mFrameHeight, mFrameRGBA);
	//  111  238:invokestatic    #212 <Method UtilsImage UtilsImage.Instance()>
	//  112  241:aload_0         
	//  113  242:getfield        #159 <Field byte[] mCameraBuffer>
	//  114  245:aload_0         
	//  115  246:getfield        #73  <Field int mFrameWidth>
	//  116  249:aload_0         
	//  117  250:getfield        #75  <Field int mFrameHeight>
	//  118  253:aload_0         
	//  119  254:getfield        #77  <Field byte[] mFrameRGBA>
	//  120  257:invokevirtual   #220 <Method boolean UtilsImage.decodeYUV420SPtoRGBA(byte[], int, int, byte[])>
	//  121  260:pop             
		this;
	//  122  261:aload_0         
		JVM INSTR monitorenter ;
	//  123  262:monitorenter    
		abyte0 = ((byte []) ((ArrayList)rgbaConsumers.clone()));
	//  124  263:aload_0         
	//  125  264:getfield        #87  <Field ArrayList rgbaConsumers>
	//  126  267:invokevirtual   #175 <Method Object ArrayList.clone()>
	//  127  270:checkcast       #79  <Class ArrayList>
	//  128  273:astore_1        
		this;
	//  129  274:aload_0         
		JVM INSTR monitorexit ;
	//  130  275:monitorexit     
		for(abyte0 = ((byte []) (((ArrayList) (abyte0)).iterator())); ((Iterator) (abyte0)).hasNext(); ((RGBAVideoCaptureConsumer)(AbstractVideoCaptureConsumer)((Iterator) (abyte0)).next()).onPreviewRGBAFrame(mFrameRGBA));
	//  131  276:aload_1         
	//  132  277:invokevirtual   #139 <Method Iterator ArrayList.iterator()>
	//  133  280:astore_1        
	//  134  281:aload_1         
	//  135  282:invokeinterface #145 <Method boolean Iterator.hasNext()>
	//  136  287:ifeq            319
	//  137  290:aload_1         
	//  138  291:invokeinterface #149 <Method Object Iterator.next()>
	//  139  296:checkcast       #18  <Class VideoCaptureConsumerHub$AbstractVideoCaptureConsumer>
	//  140  299:checkcast       #33  <Class VideoCaptureConsumerHub$RGBAVideoCaptureConsumer>
	//  141  302:aload_0         
	//  142  303:getfield        #77  <Field byte[] mFrameRGBA>
	//  143  306:invokeinterface #223 <Method void VideoCaptureConsumerHub$RGBAVideoCaptureConsumer.onPreviewRGBAFrame(byte[])>
		break MISSING_BLOCK_LABEL_319;
	//  144  311:goto            281
		abyte0;
	//  145  314:astore_1        
		this;
	//  146  315:aload_0         
		JVM INSTR monitorexit ;
	//  147  316:monitorexit     
		throw abyte0;
	//  148  317:aload_1         
	//  149  318:athrow          
		this;
	//  150  319:aload_0         
		JVM INSTR monitorenter ;
	//  151  320:monitorenter    
		abyte0 = ((byte []) ((ArrayList)rgbaConsumers.clone()));
	//  152  321:aload_0         
	//  153  322:getfield        #87  <Field ArrayList rgbaConsumers>
	//  154  325:invokevirtual   #175 <Method Object ArrayList.clone()>
	//  155  328:checkcast       #79  <Class ArrayList>
	//  156  331:astore_1        
		this;
	//  157  332:aload_0         
		JVM INSTR monitorexit ;
	//  158  333:monitorexit     
		for(abyte0 = ((byte []) (((ArrayList) (abyte0)).iterator())); ((Iterator) (abyte0)).hasNext(); ((RGBAVideoCaptureConsumer)(AbstractVideoCaptureConsumer)((Iterator) (abyte0)).next()).onProcessingDone());
	//  159  334:aload_1         
	//  160  335:invokevirtual   #139 <Method Iterator ArrayList.iterator()>
	//  161  338:astore_1        
	//  162  339:aload_1         
	//  163  340:invokeinterface #145 <Method boolean Iterator.hasNext()>
	//  164  345:ifeq            368
	//  165  348:aload_1         
	//  166  349:invokeinterface #149 <Method Object Iterator.next()>
	//  167  354:checkcast       #18  <Class VideoCaptureConsumerHub$AbstractVideoCaptureConsumer>
	//  168  357:checkcast       #33  <Class VideoCaptureConsumerHub$RGBAVideoCaptureConsumer>
	//  169  360:invokeinterface #226 <Method void VideoCaptureConsumerHub$RGBAVideoCaptureConsumer.onProcessingDone()>
	//* 170  365:goto            339
		if(Build.autoReleaseCameraBuffer)
	//* 171  368:getstatic       #229 <Field boolean Build.autoReleaseCameraBuffer>
	//* 172  371:ifeq            378
			releaseCameraBuffer();
	//  173  374:aload_0         
	//  174  375:invokevirtual   #232 <Method void releaseCameraBuffer()>
		return;
	//  175  378:return          
		abyte0;
	//  176  379:astore_1        
		this;
	//  177  380:aload_0         
		JVM INSTR monitorexit ;
	//  178  381:monitorexit     
		throw abyte0;
	//  179  382:aload_1         
	//  180  383:athrow          
		abyte0;
	//  181  384:astore_1        
		this;
	//  182  385:aload_0         
		JVM INSTR monitorexit ;
	//  183  386:monitorexit     
		throw abyte0;
	//  184  387:aload_1         
	//  185  388:athrow          
		abyte0;
	//  186  389:astore_1        
		this;
	//  187  390:aload_0         
		JVM INSTR monitorexit ;
	//  188  391:monitorexit     
		throw abyte0;
	//  189  392:aload_1         
	//  190  393:athrow          
	}

	private void onPreviewStartedInternal(int i, int j, int k)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		for(Iterator iterator = grayConsumers.iterator(); iterator.hasNext(); ((GRAYVideoCaptureConsumer)(AbstractVideoCaptureConsumer)iterator.next()).onPreviewStarted(i, j, k));
	//    2    2:aload_0         
	//    3    3:getfield        #85  <Field ArrayList grayConsumers>
	//    4    6:invokevirtual   #139 <Method Iterator ArrayList.iterator()>
	//    5    9:astore          4
	//    6   11:aload           4
	//    7   13:invokeinterface #145 <Method boolean Iterator.hasNext()>
	//    8   18:ifeq            45
	//    9   21:aload           4
	//   10   23:invokeinterface #149 <Method Object Iterator.next()>
	//   11   28:checkcast       #18  <Class VideoCaptureConsumerHub$AbstractVideoCaptureConsumer>
	//   12   31:checkcast       #21  <Class VideoCaptureConsumerHub$GRAYVideoCaptureConsumer>
	//   13   34:iload_1         
	//   14   35:iload_2         
	//   15   36:iload_3         
	//   16   37:invokeinterface #235 <Method void VideoCaptureConsumerHub$GRAYVideoCaptureConsumer.onPreviewStarted(int, int, int)>
	//*  17   42:goto            11
		for(Iterator iterator1 = nv21Consumers.iterator(); iterator1.hasNext(); ((NV21VideoCaptureConsumer)(AbstractVideoCaptureConsumer)iterator1.next()).onPreviewStarted(i, j, k));
	//   18   45:aload_0         
	//   19   46:getfield        #89  <Field ArrayList nv21Consumers>
	//   20   49:invokevirtual   #139 <Method Iterator ArrayList.iterator()>
	//   21   52:astore          4
	//   22   54:aload           4
	//   23   56:invokeinterface #145 <Method boolean Iterator.hasNext()>
	//   24   61:ifeq            88
	//   25   64:aload           4
	//   26   66:invokeinterface #149 <Method Object Iterator.next()>
	//   27   71:checkcast       #18  <Class VideoCaptureConsumerHub$AbstractVideoCaptureConsumer>
	//   28   74:checkcast       #27  <Class VideoCaptureConsumerHub$NV21VideoCaptureConsumer>
	//   29   77:iload_1         
	//   30   78:iload_2         
	//   31   79:iload_3         
	//   32   80:invokeinterface #236 <Method void VideoCaptureConsumerHub$NV21VideoCaptureConsumer.onPreviewStarted(int, int, int)>
	//*  33   85:goto            54
		for(Iterator iterator2 = rgbaConsumers.iterator(); iterator2.hasNext(); ((RGBAVideoCaptureConsumer)(AbstractVideoCaptureConsumer)iterator2.next()).onPreviewStarted(i, j, k));
	//   34   88:aload_0         
	//   35   89:getfield        #87  <Field ArrayList rgbaConsumers>
	//   36   92:invokevirtual   #139 <Method Iterator ArrayList.iterator()>
	//   37   95:astore          4
	//   38   97:aload           4
	//   39   99:invokeinterface #145 <Method boolean Iterator.hasNext()>
	//   40  104:ifeq            131
	//   41  107:aload           4
	//   42  109:invokeinterface #149 <Method Object Iterator.next()>
	//   43  114:checkcast       #18  <Class VideoCaptureConsumerHub$AbstractVideoCaptureConsumer>
	//   44  117:checkcast       #33  <Class VideoCaptureConsumerHub$RGBAVideoCaptureConsumer>
	//   45  120:iload_1         
	//   46  121:iload_2         
	//   47  122:iload_3         
	//   48  123:invokeinterface #237 <Method void VideoCaptureConsumerHub$RGBAVideoCaptureConsumer.onPreviewStarted(int, int, int)>
	//*  49  128:goto            97
		this;
	//   50  131:aload_0         
		JVM INSTR monitorexit ;
	//   51  132:monitorexit     
		return;
	//   52  133:return          
		Exception exception;
		exception;
	//   53  134:astore          4
		this;
	//   54  136:aload_0         
		JVM INSTR monitorexit ;
	//   55  137:monitorexit     
		throw exception;
	//   56  138:aload           4
	//   57  140:athrow          
	}

	private boolean request(ArrayList arraylist, AbstractVideoCaptureConsumer abstractvideocaptureconsumer, boolean flag)
	{
		if(abstractvideocaptureconsumer == null)
	//*   0    0:aload_2         
	//*   1    1:ifnonnull       11
		{
			CLog.w("CraftAR Internal Inconsistency: Trying to register null consumer on VideoCaptureConsumerHub. Please report this to support@catchoom.com");
	//    2    4:ldc1            #241 <String "CraftAR Internal Inconsistency: Trying to register null consumer on VideoCaptureConsumerHub. Please report this to support@catchoom.com">
	//    3    6:invokestatic    #244 <Method void CLog.w(String)>
			return false;
	//    4    9:iconst_0        
	//    5   10:ireturn         
		}
		if(flag)
	//*   6   11:iload_3         
	//*   7   12:ifeq            61
			if(arraylist.contains(((Object) (abstractvideocaptureconsumer))))
	//*   8   15:aload_1         
	//*   9   16:aload_2         
	//*  10   17:invokevirtual   #248 <Method boolean ArrayList.contains(Object)>
	//*  11   20:ifeq            53
			{
				arraylist = ((ArrayList) (new StringBuilder()));
	//   12   23:new             #183 <Class StringBuilder>
	//   13   26:dup             
	//   14   27:invokespecial   #184 <Method void StringBuilder()>
	//   15   30:astore_1        
				((StringBuilder) (arraylist)).append(((Object) (abstractvideocaptureconsumer)));
	//   16   31:aload_1         
	//   17   32:aload_2         
	//   18   33:invokevirtual   #251 <Method StringBuilder StringBuilder.append(Object)>
	//   19   36:pop             
				((StringBuilder) (arraylist)).append(" was already in the the list");
	//   20   37:aload_1         
	//   21   38:ldc1            #253 <String " was already in the the list">
	//   22   40:invokevirtual   #190 <Method StringBuilder StringBuilder.append(String)>
	//   23   43:pop             
				CLog.v(((StringBuilder) (arraylist)).toString());
	//   24   44:aload_1         
	//   25   45:invokevirtual   #197 <Method String StringBuilder.toString()>
	//   26   48:invokestatic    #202 <Method void CLog.v(String)>
				return false;
	//   27   51:iconst_0        
	//   28   52:ireturn         
			} else
			{
				arraylist.add(((Object) (abstractvideocaptureconsumer)));
	//   29   53:aload_1         
	//   30   54:aload_2         
	//   31   55:invokevirtual   #256 <Method boolean ArrayList.add(Object)>
	//   32   58:pop             
				return true;
	//   33   59:iconst_1        
	//   34   60:ireturn         
			}
		if(!arraylist.contains(((Object) (abstractvideocaptureconsumer))))
	//*  35   61:aload_1         
	//*  36   62:aload_2         
	//*  37   63:invokevirtual   #248 <Method boolean ArrayList.contains(Object)>
	//*  38   66:ifne            100
		{
			arraylist = ((ArrayList) (new StringBuilder()));
	//   39   69:new             #183 <Class StringBuilder>
	//   40   72:dup             
	//   41   73:invokespecial   #184 <Method void StringBuilder()>
	//   42   76:astore_1        
			((StringBuilder) (arraylist)).append(((Object) (abstractvideocaptureconsumer)));
	//   43   77:aload_1         
	//   44   78:aload_2         
	//   45   79:invokevirtual   #251 <Method StringBuilder StringBuilder.append(Object)>
	//   46   82:pop             
			((StringBuilder) (arraylist)).append(" was not in the the list");
	//   47   83:aload_1         
	//   48   84:ldc2            #258 <String " was not in the the list">
	//   49   87:invokevirtual   #190 <Method StringBuilder StringBuilder.append(String)>
	//   50   90:pop             
			CLog.v(((StringBuilder) (arraylist)).toString());
	//   51   91:aload_1         
	//   52   92:invokevirtual   #197 <Method String StringBuilder.toString()>
	//   53   95:invokestatic    #202 <Method void CLog.v(String)>
			return false;
	//   54   98:iconst_0        
	//   55   99:ireturn         
		} else
		{
			arraylist.remove(((Object) (abstractvideocaptureconsumer)));
	//   56  100:aload_1         
	//   57  101:aload_2         
	//   58  102:invokevirtual   #261 <Method boolean ArrayList.remove(Object)>
	//   59  105:pop             
			return true;
	//   60  106:iconst_1        
	//   61  107:ireturn         
		}
	}

	private void takePictureFailedInternal(CraftARError craftarerror)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		for(Iterator iterator = takePictureConsumers.iterator(); iterator.hasNext(); ((TakePictureConsumer)(AbstractVideoCaptureConsumer)iterator.next()).takePictureFailed(craftarerror));
	//    2    2:aload_0         
	//    3    3:getfield        #83  <Field ArrayList takePictureConsumers>
	//    4    6:invokevirtual   #139 <Method Iterator ArrayList.iterator()>
	//    5    9:astore_2        
	//    6   10:aload_2         
	//    7   11:invokeinterface #145 <Method boolean Iterator.hasNext()>
	//    8   16:ifeq            40
	//    9   19:aload_2         
	//   10   20:invokeinterface #149 <Method Object Iterator.next()>
	//   11   25:checkcast       #18  <Class VideoCaptureConsumerHub$AbstractVideoCaptureConsumer>
	//   12   28:checkcast       #36  <Class VideoCaptureConsumerHub$TakePictureConsumer>
	//   13   31:aload_1         
	//   14   32:invokeinterface #266 <Method void VideoCaptureConsumerHub$TakePictureConsumer.takePictureFailed(CraftARError)>
	//*  15   37:goto            10
		this;
	//   16   40:aload_0         
		JVM INSTR monitorexit ;
	//   17   41:monitorexit     
		return;
	//   18   42:return          
		craftarerror;
	//   19   43:astore_1        
		this;
	//   20   44:aload_0         
		JVM INSTR monitorexit ;
	//   21   45:monitorexit     
		throw craftarerror;
	//   22   46:aload_1         
	//   23   47:athrow          
	}

	public boolean isStarted()
	{
		return mIsStarted;
	//    0    0:aload_0         
	//    1    1:getfield        #69  <Field boolean mIsStarted>
	//    2    4:ireturn         
	}

	public void onCameraOpenFailed()
	{
		if(mHandler == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #271 <Field Handler mHandler>
	//*   2    4:ifnonnull       14
		{
			CLog.e("mHandler is still null");
	//    3    7:ldc2            #273 <String "mHandler is still null">
	//    4   10:invokestatic    #276 <Method void CLog.e(String)>
			return;
	//    5   13:return          
		} else
		{
			mHandler.post(new Runnable() {

				public void run()
				{
					onCameraOpenFailedInternal();
				//    0    0:aload_0         
				//    1    1:getfield        #17  <Field VideoCaptureConsumerHub this$0>
				//    2    4:invokestatic    #24  <Method void VideoCaptureConsumerHub.access$500(VideoCaptureConsumerHub)>
				//    3    7:return          
				}

				final VideoCaptureConsumerHub this$0;

			
			{
				this$0 = VideoCaptureConsumerHub.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field VideoCaptureConsumerHub this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
			}
);
	//    6   14:aload_0         
	//    7   15:getfield        #271 <Field Handler mHandler>
	//    8   18:new             #10  <Class VideoCaptureConsumerHub$2>
	//    9   21:dup             
	//   10   22:aload_0         
	//   11   23:invokespecial   #278 <Method void VideoCaptureConsumerHub$2(VideoCaptureConsumerHub)>
	//   12   26:invokevirtual   #284 <Method boolean Handler.post(Runnable)>
	//   13   29:pop             
			return;
	//   14   30:return          
		}
	}

	public void onCameraOpenStuck()
	{
		if(mHandler == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #271 <Field Handler mHandler>
	//*   2    4:ifnonnull       14
		{
			CLog.e("mHandler is still null");
	//    3    7:ldc2            #273 <String "mHandler is still null">
	//    4   10:invokestatic    #276 <Method void CLog.e(String)>
			return;
	//    5   13:return          
		} else
		{
			mHandler.post(new Runnable() {

				public void run()
				{
					onCameraOpenStuckInternal();
				//    0    0:aload_0         
				//    1    1:getfield        #17  <Field VideoCaptureConsumerHub this$0>
				//    2    4:invokevirtual   #24  <Method void VideoCaptureConsumerHub.onCameraOpenStuckInternal()>
				//    3    7:return          
				}

				final VideoCaptureConsumerHub this$0;

			
			{
				this$0 = VideoCaptureConsumerHub.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field VideoCaptureConsumerHub this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
			}
);
	//    6   14:aload_0         
	//    7   15:getfield        #271 <Field Handler mHandler>
	//    8   18:new             #12  <Class VideoCaptureConsumerHub$3>
	//    9   21:dup             
	//   10   22:aload_0         
	//   11   23:invokespecial   #286 <Method void VideoCaptureConsumerHub$3(VideoCaptureConsumerHub)>
	//   12   26:invokevirtual   #284 <Method boolean Handler.post(Runnable)>
	//   13   29:pop             
			return;
	//   14   30:return          
		}
	}

	public void onCameraOpenStuckInternal()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		for(Iterator iterator = rgbaConsumers.iterator(); iterator.hasNext(); ((RGBAVideoCaptureConsumer)(AbstractVideoCaptureConsumer)iterator.next()).onCameraOpenFailed());
	//    2    2:aload_0         
	//    3    3:getfield        #87  <Field ArrayList rgbaConsumers>
	//    4    6:invokevirtual   #139 <Method Iterator ArrayList.iterator()>
	//    5    9:astore_1        
	//    6   10:aload_1         
	//    7   11:invokeinterface #145 <Method boolean Iterator.hasNext()>
	//    8   16:ifeq            39
	//    9   19:aload_1         
	//   10   20:invokeinterface #149 <Method Object Iterator.next()>
	//   11   25:checkcast       #18  <Class VideoCaptureConsumerHub$AbstractVideoCaptureConsumer>
	//   12   28:checkcast       #33  <Class VideoCaptureConsumerHub$RGBAVideoCaptureConsumer>
	//   13   31:invokeinterface #152 <Method void VideoCaptureConsumerHub$RGBAVideoCaptureConsumer.onCameraOpenFailed()>
	//*  14   36:goto            10
		for(Iterator iterator1 = grayConsumers.iterator(); iterator1.hasNext(); ((GRAYVideoCaptureConsumer)(AbstractVideoCaptureConsumer)iterator1.next()).onCameraOpenFailed());
	//   15   39:aload_0         
	//   16   40:getfield        #85  <Field ArrayList grayConsumers>
	//   17   43:invokevirtual   #139 <Method Iterator ArrayList.iterator()>
	//   18   46:astore_1        
	//   19   47:aload_1         
	//   20   48:invokeinterface #145 <Method boolean Iterator.hasNext()>
	//   21   53:ifeq            76
	//   22   56:aload_1         
	//   23   57:invokeinterface #149 <Method Object Iterator.next()>
	//   24   62:checkcast       #18  <Class VideoCaptureConsumerHub$AbstractVideoCaptureConsumer>
	//   25   65:checkcast       #21  <Class VideoCaptureConsumerHub$GRAYVideoCaptureConsumer>
	//   26   68:invokeinterface #153 <Method void VideoCaptureConsumerHub$GRAYVideoCaptureConsumer.onCameraOpenFailed()>
	//*  27   73:goto            47
		for(Iterator iterator2 = nv21Consumers.iterator(); iterator2.hasNext(); ((NV21VideoCaptureConsumer)(AbstractVideoCaptureConsumer)iterator2.next()).onCameraOpenFailed());
	//   28   76:aload_0         
	//   29   77:getfield        #89  <Field ArrayList nv21Consumers>
	//   30   80:invokevirtual   #139 <Method Iterator ArrayList.iterator()>
	//   31   83:astore_1        
	//   32   84:aload_1         
	//   33   85:invokeinterface #145 <Method boolean Iterator.hasNext()>
	//   34   90:ifeq            113
	//   35   93:aload_1         
	//   36   94:invokeinterface #149 <Method Object Iterator.next()>
	//   37   99:checkcast       #18  <Class VideoCaptureConsumerHub$AbstractVideoCaptureConsumer>
	//   38  102:checkcast       #27  <Class VideoCaptureConsumerHub$NV21VideoCaptureConsumer>
	//   39  105:invokeinterface #154 <Method void VideoCaptureConsumerHub$NV21VideoCaptureConsumer.onCameraOpenFailed()>
	//*  40  110:goto            84
		this;
	//   41  113:aload_0         
		JVM INSTR monitorexit ;
	//   42  114:monitorexit     
		return;
	//   43  115:return          
		Exception exception;
		exception;
	//   44  116:astore_1        
		this;
	//   45  117:aload_0         
		JVM INSTR monitorexit ;
	//   46  118:monitorexit     
		throw exception;
	//   47  119:aload_1         
	//   48  120:athrow          
	}

	public void onPictureTaken(final byte data[], final int width, final int height, final int pictureFormat)
	{
		mHandler.post(new Runnable() {

			public void run()
			{
				onPictureTakenInternal(data, width, height, pictureFormat);
			//    0    0:aload_0         
			//    1    1:getfield        #23  <Field VideoCaptureConsumerHub this$0>
			//    2    4:aload_0         
			//    3    5:getfield        #25  <Field byte[] val$data>
			//    4    8:aload_0         
			//    5    9:getfield        #27  <Field int val$width>
			//    6   12:aload_0         
			//    7   13:getfield        #29  <Field int val$height>
			//    8   16:aload_0         
			//    9   17:getfield        #31  <Field int val$pictureFormat>
			//   10   20:invokestatic    #39  <Method void VideoCaptureConsumerHub.access$700(VideoCaptureConsumerHub, byte[], int, int, int)>
			//   11   23:return          
			}

			final VideoCaptureConsumerHub this$0;
			final byte val$data[];
			final int val$height;
			final int val$pictureFormat;
			final int val$width;

			
			{
				this$0 = VideoCaptureConsumerHub.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #23  <Field VideoCaptureConsumerHub this$0>
				data = abyte0;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #25  <Field byte[] val$data>
				width = i;
			//    6   10:aload_0         
			//    7   11:iload_3         
			//    8   12:putfield        #27  <Field int val$width>
				height = j;
			//    9   15:aload_0         
			//   10   16:iload           4
			//   11   18:putfield        #29  <Field int val$height>
				pictureFormat = k;
			//   12   21:aload_0         
			//   13   22:iload           5
			//   14   24:putfield        #31  <Field int val$pictureFormat>
				super();
			//   15   27:aload_0         
			//   16   28:invokespecial   #34  <Method void Object()>
			//   17   31:return          
			}
		}
);
	//    0    0:aload_0         
	//    1    1:getfield        #271 <Field Handler mHandler>
	//    2    4:new             #16  <Class VideoCaptureConsumerHub$5>
	//    3    7:dup             
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:iload_2         
	//    7   11:iload_3         
	//    8   12:iload           4
	//    9   14:invokespecial   #289 <Method void VideoCaptureConsumerHub$5(VideoCaptureConsumerHub, byte[], int, int, int)>
	//   10   17:invokevirtual   #284 <Method boolean Handler.post(Runnable)>
	//   11   20:pop             
	//   12   21:return          
	}

	public void onPreviewStarted(final int bufferSize, final int width, final int height)
	{
		mFrameWidth = width;
	//    0    0:aload_0         
	//    1    1:iload_2         
	//    2    2:putfield        #73  <Field int mFrameWidth>
		mFrameHeight = height;
	//    3    5:aload_0         
	//    4    6:iload_3         
	//    5    7:putfield        #75  <Field int mFrameHeight>
		mBufferSize = bufferSize;
	//    6   10:aload_0         
	//    7   11:iload_1         
	//    8   12:putfield        #71  <Field int mBufferSize>
		if(mHandler == null)
	//*   9   15:aload_0         
	//*  10   16:getfield        #271 <Field Handler mHandler>
	//*  11   19:ifnonnull       29
		{
			CLog.e("mHandler is still null");
	//   12   22:ldc2            #273 <String "mHandler is still null">
	//   13   25:invokestatic    #276 <Method void CLog.e(String)>
			return;
	//   14   28:return          
		}
		mHandler.post(new Runnable() {

			public void run()
			{
				onPreviewStartedInternal(bufferSize, width, height);
			//    0    0:aload_0         
			//    1    1:getfield        #21  <Field VideoCaptureConsumerHub this$0>
			//    2    4:aload_0         
			//    3    5:getfield        #23  <Field int val$bufferSize>
			//    4    8:aload_0         
			//    5    9:getfield        #25  <Field int val$width>
			//    6   12:aload_0         
			//    7   13:getfield        #27  <Field int val$height>
			//    8   16:invokestatic    #35  <Method void VideoCaptureConsumerHub.access$300(VideoCaptureConsumerHub, int, int, int)>
			//    9   19:return          
			}

			final VideoCaptureConsumerHub this$0;
			final int val$bufferSize;
			final int val$height;
			final int val$width;

			
			{
				this$0 = VideoCaptureConsumerHub.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #21  <Field VideoCaptureConsumerHub this$0>
				bufferSize = i;
			//    3    5:aload_0         
			//    4    6:iload_2         
			//    5    7:putfield        #23  <Field int val$bufferSize>
				width = j;
			//    6   10:aload_0         
			//    7   11:iload_3         
			//    8   12:putfield        #25  <Field int val$width>
				height = k;
			//    9   15:aload_0         
			//   10   16:iload           4
			//   11   18:putfield        #27  <Field int val$height>
				super();
			//   12   21:aload_0         
			//   13   22:invokespecial   #30  <Method void Object()>
			//   14   25:return          
			}
		}
);
	//   15   29:aload_0         
	//   16   30:getfield        #271 <Field Handler mHandler>
	//   17   33:new             #8   <Class VideoCaptureConsumerHub$1>
	//   18   36:dup             
	//   19   37:aload_0         
	//   20   38:iload_1         
	//   21   39:iload_2         
	//   22   40:iload_3         
	//   23   41:invokespecial   #291 <Method void VideoCaptureConsumerHub$1(VideoCaptureConsumerHub, int, int, int)>
	//   24   44:invokevirtual   #284 <Method boolean Handler.post(Runnable)>
	//   25   47:pop             
		if(mGetNewFrameRunnable == null)
	//*  26   48:aload_0         
	//*  27   49:getfield        #293 <Field VideoCaptureConsumerHub$GetNewFrameRunnable mGetNewFrameRunnable>
	//*  28   52:ifnonnull       68
			mGetNewFrameRunnable = new GetNewFrameRunnable();
	//   29   55:aload_0         
	//   30   56:new             #24  <Class VideoCaptureConsumerHub$GetNewFrameRunnable>
	//   31   59:dup             
	//   32   60:aload_0         
	//   33   61:aconst_null     
	//   34   62:invokespecial   #294 <Method void VideoCaptureConsumerHub$GetNewFrameRunnable(VideoCaptureConsumerHub, VideoCaptureConsumerHub$1)>
	//   35   65:putfield        #293 <Field VideoCaptureConsumerHub$GetNewFrameRunnable mGetNewFrameRunnable>
		mHandler.post(((Runnable) (mGetNewFrameRunnable)));
	//   36   68:aload_0         
	//   37   69:getfield        #271 <Field Handler mHandler>
	//   38   72:aload_0         
	//   39   73:getfield        #293 <Field VideoCaptureConsumerHub$GetNewFrameRunnable mGetNewFrameRunnable>
	//   40   76:invokevirtual   #284 <Method boolean Handler.post(Runnable)>
	//   41   79:pop             
	//   42   80:return          
	}

	public void onReadyToSetPreviewDisplay(int i, int j)
	{
		CLog.d("Sending onReadyToSetPreviewDisplay events");
	//    0    0:ldc2            #298 <String "Sending onReadyToSetPreviewDisplay events">
	//    1    3:invokestatic    #301 <Method void CLog.d(String)>
		this;
	//    2    6:aload_0         
		JVM INSTR monitorenter ;
	//    3    7:monitorenter    
		AbstractVideoCaptureConsumer abstractvideocaptureconsumer;
		for(Iterator iterator = rgbaConsumers.iterator(); iterator.hasNext(); ((RGBAVideoCaptureConsumer)abstractvideocaptureconsumer).onReadyToSetPreviewDisplay(i, j))
	//*   4    8:aload_0         
	//*   5    9:getfield        #87  <Field ArrayList rgbaConsumers>
	//*   6   12:invokevirtual   #139 <Method Iterator ArrayList.iterator()>
	//*   7   15:astore_3        
	//*   8   16:aload_3         
	//*   9   17:invokeinterface #145 <Method boolean Iterator.hasNext()>
	//*  10   22:ifeq            85
		{
			abstractvideocaptureconsumer = (AbstractVideoCaptureConsumer)iterator.next();
	//   11   25:aload_3         
	//   12   26:invokeinterface #149 <Method Object Iterator.next()>
	//   13   31:checkcast       #18  <Class VideoCaptureConsumerHub$AbstractVideoCaptureConsumer>
	//   14   34:astore          4
			StringBuilder stringbuilder = new StringBuilder();
	//   15   36:new             #183 <Class StringBuilder>
	//   16   39:dup             
	//   17   40:invokespecial   #184 <Method void StringBuilder()>
	//   18   43:astore          5
			stringbuilder.append("Sending onReadyToSetPreviewDisplay to ");
	//   19   45:aload           5
	//   20   47:ldc2            #303 <String "Sending onReadyToSetPreviewDisplay to ">
	//   21   50:invokevirtual   #190 <Method StringBuilder StringBuilder.append(String)>
	//   22   53:pop             
			stringbuilder.append(((Object) (abstractvideocaptureconsumer)));
	//   23   54:aload           5
	//   24   56:aload           4
	//   25   58:invokevirtual   #251 <Method StringBuilder StringBuilder.append(Object)>
	//   26   61:pop             
			CLog.d(stringbuilder.toString());
	//   27   62:aload           5
	//   28   64:invokevirtual   #197 <Method String StringBuilder.toString()>
	//   29   67:invokestatic    #301 <Method void CLog.d(String)>
		}

	//   30   70:aload           4
	//   31   72:checkcast       #33  <Class VideoCaptureConsumerHub$RGBAVideoCaptureConsumer>
	//   32   75:iload_1         
	//   33   76:iload_2         
	//   34   77:invokeinterface #305 <Method void VideoCaptureConsumerHub$RGBAVideoCaptureConsumer.onReadyToSetPreviewDisplay(int, int)>
	//*  35   82:goto            16
		AbstractVideoCaptureConsumer abstractvideocaptureconsumer1;
		for(Iterator iterator1 = grayConsumers.iterator(); iterator1.hasNext(); ((GRAYVideoCaptureConsumer)abstractvideocaptureconsumer1).onReadyToSetPreviewDisplay(i, j))
	//*  36   85:aload_0         
	//*  37   86:getfield        #85  <Field ArrayList grayConsumers>
	//*  38   89:invokevirtual   #139 <Method Iterator ArrayList.iterator()>
	//*  39   92:astore_3        
	//*  40   93:aload_3         
	//*  41   94:invokeinterface #145 <Method boolean Iterator.hasNext()>
	//*  42   99:ifeq            162
		{
			abstractvideocaptureconsumer1 = (AbstractVideoCaptureConsumer)iterator1.next();
	//   43  102:aload_3         
	//   44  103:invokeinterface #149 <Method Object Iterator.next()>
	//   45  108:checkcast       #18  <Class VideoCaptureConsumerHub$AbstractVideoCaptureConsumer>
	//   46  111:astore          4
			StringBuilder stringbuilder1 = new StringBuilder();
	//   47  113:new             #183 <Class StringBuilder>
	//   48  116:dup             
	//   49  117:invokespecial   #184 <Method void StringBuilder()>
	//   50  120:astore          5
			stringbuilder1.append("Sending onReadyToSetPreviewDisplay to ");
	//   51  122:aload           5
	//   52  124:ldc2            #303 <String "Sending onReadyToSetPreviewDisplay to ">
	//   53  127:invokevirtual   #190 <Method StringBuilder StringBuilder.append(String)>
	//   54  130:pop             
			stringbuilder1.append(((Object) (abstractvideocaptureconsumer1)));
	//   55  131:aload           5
	//   56  133:aload           4
	//   57  135:invokevirtual   #251 <Method StringBuilder StringBuilder.append(Object)>
	//   58  138:pop             
			CLog.d(stringbuilder1.toString());
	//   59  139:aload           5
	//   60  141:invokevirtual   #197 <Method String StringBuilder.toString()>
	//   61  144:invokestatic    #301 <Method void CLog.d(String)>
		}

	//   62  147:aload           4
	//   63  149:checkcast       #21  <Class VideoCaptureConsumerHub$GRAYVideoCaptureConsumer>
	//   64  152:iload_1         
	//   65  153:iload_2         
	//   66  154:invokeinterface #306 <Method void VideoCaptureConsumerHub$GRAYVideoCaptureConsumer.onReadyToSetPreviewDisplay(int, int)>
	//*  67  159:goto            93
		AbstractVideoCaptureConsumer abstractvideocaptureconsumer2;
		for(Iterator iterator2 = nv21Consumers.iterator(); iterator2.hasNext(); ((NV21VideoCaptureConsumer)abstractvideocaptureconsumer2).onReadyToSetPreviewDisplay(i, j))
	//*  68  162:aload_0         
	//*  69  163:getfield        #89  <Field ArrayList nv21Consumers>
	//*  70  166:invokevirtual   #139 <Method Iterator ArrayList.iterator()>
	//*  71  169:astore_3        
	//*  72  170:aload_3         
	//*  73  171:invokeinterface #145 <Method boolean Iterator.hasNext()>
	//*  74  176:ifeq            239
		{
			abstractvideocaptureconsumer2 = (AbstractVideoCaptureConsumer)iterator2.next();
	//   75  179:aload_3         
	//   76  180:invokeinterface #149 <Method Object Iterator.next()>
	//   77  185:checkcast       #18  <Class VideoCaptureConsumerHub$AbstractVideoCaptureConsumer>
	//   78  188:astore          4
			StringBuilder stringbuilder2 = new StringBuilder();
	//   79  190:new             #183 <Class StringBuilder>
	//   80  193:dup             
	//   81  194:invokespecial   #184 <Method void StringBuilder()>
	//   82  197:astore          5
			stringbuilder2.append("Sending onReadyToSetPreviewDisplay to ");
	//   83  199:aload           5
	//   84  201:ldc2            #303 <String "Sending onReadyToSetPreviewDisplay to ">
	//   85  204:invokevirtual   #190 <Method StringBuilder StringBuilder.append(String)>
	//   86  207:pop             
			stringbuilder2.append(((Object) (abstractvideocaptureconsumer2)));
	//   87  208:aload           5
	//   88  210:aload           4
	//   89  212:invokevirtual   #251 <Method StringBuilder StringBuilder.append(Object)>
	//   90  215:pop             
			CLog.d(stringbuilder2.toString());
	//   91  216:aload           5
	//   92  218:invokevirtual   #197 <Method String StringBuilder.toString()>
	//   93  221:invokestatic    #301 <Method void CLog.d(String)>
		}

	//   94  224:aload           4
	//   95  226:checkcast       #27  <Class VideoCaptureConsumerHub$NV21VideoCaptureConsumer>
	//   96  229:iload_1         
	//   97  230:iload_2         
	//   98  231:invokeinterface #307 <Method void VideoCaptureConsumerHub$NV21VideoCaptureConsumer.onReadyToSetPreviewDisplay(int, int)>
	//*  99  236:goto            170
		this;
	//  100  239:aload_0         
		JVM INSTR monitorexit ;
	//  101  240:monitorexit     
		return;
	//  102  241:return          
		Exception exception;
		exception;
	//  103  242:astore_3        
		this;
	//  104  243:aload_0         
		JVM INSTR monitorexit ;
	//  105  244:monitorexit     
		throw exception;
	//  106  245:aload_3         
	//  107  246:athrow          
	}

	void releaseCameraBuffer()
	{
		byte abyte0[] = CameraThread.Instance(((android.content.Context) (null))).getLastFrame(mCameraBuffer);
	//    0    0:aconst_null     
	//    1    1:invokestatic    #312 <Method CameraThread CameraThread.Instance(android.content.Context)>
	//    2    4:aload_0         
	//    3    5:getfield        #159 <Field byte[] mCameraBuffer>
	//    4    8:invokevirtual   #316 <Method byte[] CameraThread.getLastFrame(byte[])>
	//    5   11:astore_1        
		if(abyte0 != null)
	//*   6   12:aload_1         
	//*   7   13:ifnull          40
		{
			mProcessNewFrameRunnable.set(abyte0, System.currentTimeMillis());
	//    8   16:aload_0         
	//    9   17:getfield        #94  <Field VideoCaptureConsumerHub$ProcessNewFrameRunnable mProcessNewFrameRunnable>
	//   10   20:aload_1         
	//   11   21:invokestatic    #322 <Method long System.currentTimeMillis()>
	//   12   24:invokevirtual   #326 <Method void VideoCaptureConsumerHub$ProcessNewFrameRunnable.set(byte[], long)>
			mHandler.post(((Runnable) (mProcessNewFrameRunnable)));
	//   13   27:aload_0         
	//   14   28:getfield        #271 <Field Handler mHandler>
	//   15   31:aload_0         
	//   16   32:getfield        #94  <Field VideoCaptureConsumerHub$ProcessNewFrameRunnable mProcessNewFrameRunnable>
	//   17   35:invokevirtual   #284 <Method boolean Handler.post(Runnable)>
	//   18   38:pop             
			return;
	//   19   39:return          
		} else
		{
			mHandler.post(((Runnable) (mGetNewFrameRunnable)));
	//   20   40:aload_0         
	//   21   41:getfield        #271 <Field Handler mHandler>
	//   22   44:aload_0         
	//   23   45:getfield        #293 <Field VideoCaptureConsumerHub$GetNewFrameRunnable mGetNewFrameRunnable>
	//   24   48:invokevirtual   #284 <Method boolean Handler.post(Runnable)>
	//   25   51:pop             
			return;
	//   26   52:return          
		}
	}

	boolean requestGRAYFrames(GRAYVideoCaptureConsumer grayvideocaptureconsumer, boolean flag)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		flag = request(grayConsumers, ((AbstractVideoCaptureConsumer) (grayvideocaptureconsumer)), flag);
	//    2    2:aload_0         
	//    3    3:aload_0         
	//    4    4:getfield        #85  <Field ArrayList grayConsumers>
	//    5    7:aload_1         
	//    6    8:iload_2         
	//    7    9:invokespecial   #330 <Method boolean request(ArrayList, VideoCaptureConsumerHub$AbstractVideoCaptureConsumer, boolean)>
	//    8   12:istore_2        
		this;
	//    9   13:aload_0         
		JVM INSTR monitorexit ;
	//   10   14:monitorexit     
		return flag;
	//   11   15:iload_2         
	//   12   16:ireturn         
		grayvideocaptureconsumer;
	//   13   17:astore_1        
		this;
	//   14   18:aload_0         
		JVM INSTR monitorexit ;
	//   15   19:monitorexit     
		throw grayvideocaptureconsumer;
	//   16   20:aload_1         
	//   17   21:athrow          
	}

	boolean requestNV21Frames(NV21VideoCaptureConsumer nv21videocaptureconsumer, boolean flag)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		flag = request(nv21Consumers, ((AbstractVideoCaptureConsumer) (nv21videocaptureconsumer)), flag);
	//    2    2:aload_0         
	//    3    3:aload_0         
	//    4    4:getfield        #89  <Field ArrayList nv21Consumers>
	//    5    7:aload_1         
	//    6    8:iload_2         
	//    7    9:invokespecial   #330 <Method boolean request(ArrayList, VideoCaptureConsumerHub$AbstractVideoCaptureConsumer, boolean)>
	//    8   12:istore_2        
		this;
	//    9   13:aload_0         
		JVM INSTR monitorexit ;
	//   10   14:monitorexit     
		return flag;
	//   11   15:iload_2         
	//   12   16:ireturn         
		nv21videocaptureconsumer;
	//   13   17:astore_1        
		this;
	//   14   18:aload_0         
		JVM INSTR monitorexit ;
	//   15   19:monitorexit     
		throw nv21videocaptureconsumer;
	//   16   20:aload_1         
	//   17   21:athrow          
	}

	boolean requestRGBAFrames(RGBAVideoCaptureConsumer rgbavideocaptureconsumer, boolean flag)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		flag = request(rgbaConsumers, ((AbstractVideoCaptureConsumer) (rgbavideocaptureconsumer)), flag);
	//    2    2:aload_0         
	//    3    3:aload_0         
	//    4    4:getfield        #87  <Field ArrayList rgbaConsumers>
	//    5    7:aload_1         
	//    6    8:iload_2         
	//    7    9:invokespecial   #330 <Method boolean request(ArrayList, VideoCaptureConsumerHub$AbstractVideoCaptureConsumer, boolean)>
	//    8   12:istore_2        
		this;
	//    9   13:aload_0         
		JVM INSTR monitorexit ;
	//   10   14:monitorexit     
		return flag;
	//   11   15:iload_2         
	//   12   16:ireturn         
		rgbavideocaptureconsumer;
	//   13   17:astore_1        
		this;
	//   14   18:aload_0         
		JVM INSTR monitorexit ;
	//   15   19:monitorexit     
		throw rgbavideocaptureconsumer;
	//   16   20:aload_1         
	//   17   21:athrow          
	}

	boolean requestTakePictureCallbacks(TakePictureConsumer takepictureconsumer, boolean flag)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		flag = request(takePictureConsumers, ((AbstractVideoCaptureConsumer) (takepictureconsumer)), flag);
	//    2    2:aload_0         
	//    3    3:aload_0         
	//    4    4:getfield        #83  <Field ArrayList takePictureConsumers>
	//    5    7:aload_1         
	//    6    8:iload_2         
	//    7    9:invokespecial   #330 <Method boolean request(ArrayList, VideoCaptureConsumerHub$AbstractVideoCaptureConsumer, boolean)>
	//    8   12:istore_2        
		this;
	//    9   13:aload_0         
		JVM INSTR monitorexit ;
	//   10   14:monitorexit     
		return flag;
	//   11   15:iload_2         
	//   12   16:ireturn         
		takepictureconsumer;
	//   13   17:astore_1        
		this;
	//   14   18:aload_0         
		JVM INSTR monitorexit ;
	//   15   19:monitorexit     
		throw takepictureconsumer;
	//   16   20:aload_1         
	//   17   21:athrow          
	}

	public void run()
	{
		CLog.d("VideoCaptureConsumer run()");
	//    0    0:ldc2            #339 <String "VideoCaptureConsumer run()">
	//    1    3:invokestatic    #301 <Method void CLog.d(String)>
		super.run();
	//    2    6:aload_0         
	//    3    7:invokespecial   #341 <Method void MyHandlerThread.run()>
	//    4   10:return          
	}

	public void start()
	{
		super.start();
	//    0    0:aload_0         
	//    1    1:invokespecial   #344 <Method void MyHandlerThread.start()>
		converterRGBAthread.start();
	//    2    4:aload_0         
	//    3    5:getfield        #98  <Field MyHandlerThread converterRGBAthread>
	//    4    8:invokevirtual   #344 <Method void MyHandlerThread.start()>
		CLog.d("VideoCaptureConsumer start()");
	//    5   11:ldc2            #346 <String "VideoCaptureConsumer start()">
	//    6   14:invokestatic    #301 <Method void CLog.d(String)>
	//    7   17:return          
	}

	public void takePictureFailed(final CraftARError error)
	{
		if(mHandler == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #271 <Field Handler mHandler>
	//*   2    4:ifnonnull       14
		{
			CLog.e("mHandler is still null");
	//    3    7:ldc2            #273 <String "mHandler is still null">
	//    4   10:invokestatic    #276 <Method void CLog.e(String)>
			return;
	//    5   13:return          
		} else
		{
			mHandler.post(new Runnable() {

				public void run()
				{
					takePictureFailedInternal(error);
				//    0    0:aload_0         
				//    1    1:getfield        #19  <Field VideoCaptureConsumerHub this$0>
				//    2    4:aload_0         
				//    3    5:getfield        #21  <Field CraftARError val$error>
				//    4    8:invokestatic    #29  <Method void VideoCaptureConsumerHub.access$600(VideoCaptureConsumerHub, CraftARError)>
				//    5   11:return          
				}

				final VideoCaptureConsumerHub this$0;
				final CraftARError val$error;

			
			{
				this$0 = VideoCaptureConsumerHub.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field VideoCaptureConsumerHub this$0>
				error = craftarerror;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #21  <Field CraftARError val$error>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #24  <Method void Object()>
			//    8   14:return          
			}
			}
);
	//    6   14:aload_0         
	//    7   15:getfield        #271 <Field Handler mHandler>
	//    8   18:new             #14  <Class VideoCaptureConsumerHub$4>
	//    9   21:dup             
	//   10   22:aload_0         
	//   11   23:aload_1         
	//   12   24:invokespecial   #348 <Method void VideoCaptureConsumerHub$4(VideoCaptureConsumerHub, CraftARError)>
	//   13   27:invokevirtual   #284 <Method boolean Handler.post(Runnable)>
	//   14   30:pop             
			return;
	//   15   31:return          
		}
	}

	static VideoCaptureConsumerHub self;
	MyHandlerThread converterRGBAthread;
	private ArrayList grayConsumers;
	int mBufferSize;
	byte mCameraBuffer[];
	int mFrameHeight;
	byte mFrameRGBA[];
	int mFrameWidth;
	private GetNewFrameRunnable mGetNewFrameRunnable;
	boolean mIsStarted;
	private ProcessNewFrameRunnable mProcessNewFrameRunnable;
	private ArrayList nv21Consumers;
	private ArrayList rgbaConsumers;
	private ArrayList takePictureConsumers;


/*
	static void access$100(VideoCaptureConsumerHub videocaptureconsumerhub, byte abyte0[])
	{
		videocaptureconsumerhub.onPreviewFrameInternal(abyte0);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #110 <Method void onPreviewFrameInternal(byte[])>
		return;
	//    3    5:return          
	}

*/


/*
	static ProcessNewFrameRunnable access$200(VideoCaptureConsumerHub videocaptureconsumerhub)
	{
		return videocaptureconsumerhub.mProcessNewFrameRunnable;
	//    0    0:aload_0         
	//    1    1:getfield        #94  <Field VideoCaptureConsumerHub$ProcessNewFrameRunnable mProcessNewFrameRunnable>
	//    2    4:areturn         
	}

*/


/*
	static void access$300(VideoCaptureConsumerHub videocaptureconsumerhub, int i, int j, int k)
	{
		videocaptureconsumerhub.onPreviewStartedInternal(i, j, k);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:iload_3         
	//    4    4:invokespecial   #118 <Method void onPreviewStartedInternal(int, int, int)>
		return;
	//    5    7:return          
	}

*/


/*
	static void access$500(VideoCaptureConsumerHub videocaptureconsumerhub)
	{
		videocaptureconsumerhub.onCameraOpenFailedInternal();
	//    0    0:aload_0         
	//    1    1:invokespecial   #123 <Method void onCameraOpenFailedInternal()>
		return;
	//    2    4:return          
	}

*/


/*
	static void access$600(VideoCaptureConsumerHub videocaptureconsumerhub, CraftARError craftarerror)
	{
		videocaptureconsumerhub.takePictureFailedInternal(craftarerror);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #129 <Method void takePictureFailedInternal(CraftARError)>
		return;
	//    3    5:return          
	}

*/


/*
	static void access$700(VideoCaptureConsumerHub videocaptureconsumerhub, byte abyte0[], int i, int j, int k)
	{
		videocaptureconsumerhub.onPictureTakenInternal(abyte0, i, j, k);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:iload_3         
	//    4    4:iload           4
	//    5    6:invokespecial   #135 <Method void onPictureTakenInternal(byte[], int, int, int)>
		return;
	//    6    9:return          
	}

*/
}

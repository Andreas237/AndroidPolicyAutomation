// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.offline;

import android.os.Handler;
import android.os.Looper;
import com.google.android.exoplayer2.source.TrackGroupArray;
import java.io.IOException;
import java.util.List;

// Referenced classes of package com.google.android.exoplayer2.offline:
//			DownloadAction

public abstract class DownloadHelper
{
	public static interface Callback
	{

		public abstract void onPrepareError(DownloadHelper downloadhelper, IOException ioexception);

		public abstract void onPrepared(DownloadHelper downloadhelper);
	}


	public DownloadHelper()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
	//    2    4:return          
	}

	public abstract DownloadAction getDownloadAction(byte abyte0[], List list);

	public abstract int getPeriodCount();

	public abstract DownloadAction getRemoveAction(byte abyte0[]);

	public abstract TrackGroupArray getTrackGroups(int i);

	public void prepare(Callback callback)
	{
		Looper looper;
		if(Looper.myLooper() != null)
	//*   0    0:invokestatic    #35  <Method Looper Looper.myLooper()>
	//*   1    3:ifnull          13
			looper = Looper.myLooper();
	//    2    6:invokestatic    #35  <Method Looper Looper.myLooper()>
	//    3    9:astore_2        
		else
	//*   4   10:goto            17
			looper = Looper.getMainLooper();
	//    5   13:invokestatic    #38  <Method Looper Looper.getMainLooper()>
	//    6   16:astore_2        
		((_cls1) (new Thread() {

			public void run()
			{
				try
				{
					prepareInternal();
			//    0    0:aload_0         
			//    1    1:getfield        #23  <Field DownloadHelper this$0>
			//    2    4:invokevirtual   #37  <Method void DownloadHelper.prepareInternal()>
					handler.post(new Runnable() {

						public void run()
						{
							callback.onPrepared(_fld0);
						//    0    0:aload_0         
						//    1    1:getfield        #17  <Field DownloadHelper$1 this$1>
						//    2    4:getfield        #24  <Field DownloadHelper$Callback DownloadHelper$1.val$callback>
						//    3    7:aload_0         
						//    4    8:getfield        #17  <Field DownloadHelper$1 this$1>
						//    5   11:getfield        #28  <Field DownloadHelper DownloadHelper$1.this$0>
						//    6   14:invokeinterface #34  <Method void DownloadHelper$Callback.onPrepared(DownloadHelper)>
						//    7   19:return          
						}

						final _cls1 this$1;

			
			{
				this$1 = _cls1.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field DownloadHelper$1 this$1>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
					}
);
			//    3    7:aload_0         
			//    4    8:getfield        #25  <Field Handler val$handler>
			//    5   11:new             #11  <Class DownloadHelper$1$1>
			//    6   14:dup             
			//    7   15:aload_0         
			//    8   16:invokespecial   #40  <Method void DownloadHelper$1$1(DownloadHelper$1)>
			//    9   19:invokevirtual   #46  <Method boolean Handler.post(Runnable)>
			//   10   22:pop             
					return;
			//   11   23:return          
				}
				catch(IOException ioexception)
			//*  12   24:astore_1        
				{
					handler.post(((_cls2) (ioexception)). new Runnable() {

						public void run()
						{
							callback.onPrepareError(_fld0, e);
						//    0    0:aload_0         
						//    1    1:getfield        #19  <Field DownloadHelper$1 this$1>
						//    2    4:getfield        #28  <Field DownloadHelper$Callback DownloadHelper$1.val$callback>
						//    3    7:aload_0         
						//    4    8:getfield        #19  <Field DownloadHelper$1 this$1>
						//    5   11:getfield        #32  <Field DownloadHelper DownloadHelper$1.this$0>
						//    6   14:aload_0         
						//    7   15:getfield        #21  <Field IOException val$e>
						//    8   18:invokeinterface #38  <Method void DownloadHelper$Callback.onPrepareError(DownloadHelper, IOException)>
						//    9   23:return          
						}

						final _cls1 this$1;
						final IOException val$e;

			
			{
				this$1 = final__pcls1;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field DownloadHelper$1 this$1>
				e = IOException.this;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #21  <Field IOException val$e>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #23  <Method void Object()>
			//    8   14:return          
			}
					}
);
			//   13   25:aload_0         
			//   14   26:getfield        #25  <Field Handler val$handler>
			//   15   29:new             #13  <Class DownloadHelper$1$2>
			//   16   32:dup             
			//   17   33:aload_0         
			//   18   34:aload_1         
			//   19   35:invokespecial   #49  <Method void DownloadHelper$1$2(DownloadHelper$1, IOException)>
			//   20   38:invokevirtual   #46  <Method boolean Handler.post(Runnable)>
			//   21   41:pop             
				}
			//   22   42:return          
			}

			final DownloadHelper this$0;
			final Callback val$callback;
			final Handler val$handler;

			
			{
				this$0 = DownloadHelper.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #23  <Field DownloadHelper this$0>
				handler = handler1;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #25  <Field Handler val$handler>
				callback = callback1;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #27  <Field DownloadHelper$Callback val$callback>
				super();
			//    9   15:aload_0         
			//   10   16:invokespecial   #30  <Method void Thread()>
			//   11   19:return          
			}
		}
)).start();
	//    7   17:new             #6   <Class DownloadHelper$1>
	//    8   20:dup             
	//    9   21:aload_0         
	//   10   22:new             #40  <Class Handler>
	//   11   25:dup             
	//   12   26:aload_2         
	//   13   27:invokespecial   #43  <Method void Handler(Looper)>
	//   14   30:aload_1         
	//   15   31:invokespecial   #46  <Method void DownloadHelper$1(DownloadHelper, Handler, DownloadHelper$Callback)>
	//   16   34:invokevirtual   #49  <Method void DownloadHelper$1.start()>
	//   17   37:return          
	}

	protected abstract void prepareInternal()
		throws IOException;
}

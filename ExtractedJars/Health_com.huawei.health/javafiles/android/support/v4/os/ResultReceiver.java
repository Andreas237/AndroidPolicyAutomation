// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.os;

import android.os.*;

// Referenced classes of package android.support.v4.os:
//			IResultReceiver

public class ResultReceiver
	implements Parcelable
{
	class MyResultReceiver extends IResultReceiver.Stub
	{

		public void send(int i, Bundle bundle)
		{
			if(mHandler != null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #13  <Field ResultReceiver this$0>
		//*   2    4:getfield        #23  <Field Handler ResultReceiver.mHandler>
		//*   3    7:ifnull          35
			{
				mHandler.post(((Runnable) (new MyRunnable(i, bundle))));
		//    4   10:aload_0         
		//    5   11:getfield        #13  <Field ResultReceiver this$0>
		//    6   14:getfield        #23  <Field Handler ResultReceiver.mHandler>
		//    7   17:new             #25  <Class ResultReceiver$MyRunnable>
		//    8   20:dup             
		//    9   21:aload_0         
		//   10   22:getfield        #13  <Field ResultReceiver this$0>
		//   11   25:iload_1         
		//   12   26:aload_2         
		//   13   27:invokespecial   #28  <Method void ResultReceiver$MyRunnable(ResultReceiver, int, Bundle)>
		//   14   30:invokevirtual   #34  <Method boolean Handler.post(Runnable)>
		//   15   33:pop             
				return;
		//   16   34:return          
			} else
			{
				onReceiveResult(i, bundle);
		//   17   35:aload_0         
		//   18   36:getfield        #13  <Field ResultReceiver this$0>
		//   19   39:iload_1         
		//   20   40:aload_2         
		//   21   41:invokevirtual   #37  <Method void ResultReceiver.onReceiveResult(int, Bundle)>
				return;
		//   22   44:return          
			}
		}

		final ResultReceiver this$0;

		MyResultReceiver()
		{
			this$0 = ResultReceiver.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #13  <Field ResultReceiver this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #16  <Method void IResultReceiver$Stub()>
		//    5    9:return          
		}
	}

	class MyRunnable
		implements Runnable
	{

		public void run()
		{
			onReceiveResult(mResultCode, mResultData);
		//    0    0:aload_0         
		//    1    1:getfield        #19  <Field ResultReceiver this$0>
		//    2    4:aload_0         
		//    3    5:getfield        #24  <Field int mResultCode>
		//    4    8:aload_0         
		//    5    9:getfield        #26  <Field Bundle mResultData>
		//    6   12:invokevirtual   #32  <Method void ResultReceiver.onReceiveResult(int, Bundle)>
		//    7   15:return          
		}

		final int mResultCode;
		final Bundle mResultData;
		final ResultReceiver this$0;

		MyRunnable(int i, Bundle bundle)
		{
			this$0 = ResultReceiver.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #19  <Field ResultReceiver this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #22  <Method void Object()>
			mResultCode = i;
		//    5    9:aload_0         
		//    6   10:iload_2         
		//    7   11:putfield        #24  <Field int mResultCode>
			mResultData = bundle;
		//    8   14:aload_0         
		//    9   15:aload_3         
		//   10   16:putfield        #26  <Field Bundle mResultData>
		//   11   19:return          
		}
	}


	public ResultReceiver(Handler handler)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #37  <Method void Object()>
		mLocal = true;
	//    2    4:aload_0         
	//    3    5:iconst_1        
	//    4    6:putfield        #39  <Field boolean mLocal>
		mHandler = handler;
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:putfield        #41  <Field Handler mHandler>
	//    8   14:return          
	}

	ResultReceiver(Parcel parcel)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #37  <Method void Object()>
		mLocal = false;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #39  <Field boolean mLocal>
		mHandler = null;
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:putfield        #41  <Field Handler mHandler>
		mReceiver = IResultReceiver.Stub.asInterface(parcel.readStrongBinder());
	//    8   14:aload_0         
	//    9   15:aload_1         
	//   10   16:invokevirtual   #48  <Method android.os.IBinder Parcel.readStrongBinder()>
	//   11   19:invokestatic    #54  <Method IResultReceiver IResultReceiver$Stub.asInterface(android.os.IBinder)>
	//   12   22:putfield        #56  <Field IResultReceiver mReceiver>
	//   13   25:return          
	}

	public int describeContents()
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	protected void onReceiveResult(int i, Bundle bundle)
	{
	//    0    0:return          
	}

	public void send(int i, Bundle bundle)
	{
		if(mLocal)
	//*   0    0:aload_0         
	//*   1    1:getfield        #39  <Field boolean mLocal>
	//*   2    4:ifeq            40
			if(mHandler != null)
	//*   3    7:aload_0         
	//*   4    8:getfield        #41  <Field Handler mHandler>
	//*   5   11:ifnull          33
			{
				mHandler.post(((Runnable) (new MyRunnable(i, bundle))));
	//    6   14:aload_0         
	//    7   15:getfield        #41  <Field Handler mHandler>
	//    8   18:new             #13  <Class ResultReceiver$MyRunnable>
	//    9   21:dup             
	//   10   22:aload_0         
	//   11   23:iload_1         
	//   12   24:aload_2         
	//   13   25:invokespecial   #66  <Method void ResultReceiver$MyRunnable(ResultReceiver, int, Bundle)>
	//   14   28:invokevirtual   #72  <Method boolean Handler.post(Runnable)>
	//   15   31:pop             
				return;
	//   16   32:return          
			} else
			{
				onReceiveResult(i, bundle);
	//   17   33:aload_0         
	//   18   34:iload_1         
	//   19   35:aload_2         
	//   20   36:invokevirtual   #74  <Method void onReceiveResult(int, Bundle)>
				return;
	//   21   39:return          
			}
		if(mReceiver != null)
	//*  22   40:aload_0         
	//*  23   41:getfield        #56  <Field IResultReceiver mReceiver>
	//*  24   44:ifnull          60
			try
			{
				mReceiver.send(i, bundle);
	//   25   47:aload_0         
	//   26   48:getfield        #56  <Field IResultReceiver mReceiver>
	//   27   51:iload_1         
	//   28   52:aload_2         
	//   29   53:invokeinterface #78  <Method void IResultReceiver.send(int, Bundle)>
				return;
	//   30   58:return          
			}
			// Misplaced declaration of an exception variable
			catch(Bundle bundle) { }
	//   31   59:astore_2        
	//   32   60:return          
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		if(mReceiver == null)
	//*   2    2:aload_0         
	//*   3    3:getfield        #56  <Field IResultReceiver mReceiver>
	//*   4    6:ifnonnull       21
			mReceiver = ((IResultReceiver) (new MyResultReceiver()));
	//    5    9:aload_0         
	//    6   10:new             #10  <Class ResultReceiver$MyResultReceiver>
	//    7   13:dup             
	//    8   14:aload_0         
	//    9   15:invokespecial   #83  <Method void ResultReceiver$MyResultReceiver(ResultReceiver)>
	//   10   18:putfield        #56  <Field IResultReceiver mReceiver>
		parcel.writeStrongBinder(mReceiver.asBinder());
	//   11   21:aload_1         
	//   12   22:aload_0         
	//   13   23:getfield        #56  <Field IResultReceiver mReceiver>
	//   14   26:invokeinterface #86  <Method android.os.IBinder IResultReceiver.asBinder()>
	//   15   31:invokevirtual   #90  <Method void Parcel.writeStrongBinder(android.os.IBinder)>
		this;
	//   16   34:aload_0         
		JVM INSTR monitorexit ;
	//   17   35:monitorexit     
		return;
	//   18   36:return          
		parcel;
	//   19   37:astore_1        
	//*  20   38:aload_0         
		throw parcel;
	//   21   39:monitorexit     
	//   22   40:aload_1         
	//   23   41:athrow          
	}

	public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

		public ResultReceiver createFromParcel(Parcel parcel)
		{
			return new ResultReceiver(parcel);
		//    0    0:new             #9   <Class ResultReceiver>
		//    1    3:dup             
		//    2    4:aload_1         
		//    3    5:invokespecial   #19  <Method void ResultReceiver(Parcel)>
		//    4    8:areturn         
		}

		public volatile Object createFromParcel(Parcel parcel)
		{
			return ((Object) (createFromParcel(parcel)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #22  <Method ResultReceiver createFromParcel(Parcel)>
		//    3    5:areturn         
		}

		public ResultReceiver[] newArray(int i)
		{
			return new ResultReceiver[i];
		//    0    0:iload_1         
		//    1    1:anewarray       ResultReceiver[]
		//    2    4:areturn         
		}

		public volatile Object[] newArray(int i)
		{
			return ((Object []) (newArray(i)));
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:invokevirtual   #27  <Method ResultReceiver[] newArray(int)>
		//    3    5:areturn         
		}

	}
;
	final Handler mHandler;
	final boolean mLocal;
	IResultReceiver mReceiver;

	static 
	{
	//    0    0:new             #8   <Class ResultReceiver$1>
	//    1    3:dup             
	//    2    4:invokespecial   #32  <Method void ResultReceiver$1()>
	//    3    7:putstatic       #34  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}

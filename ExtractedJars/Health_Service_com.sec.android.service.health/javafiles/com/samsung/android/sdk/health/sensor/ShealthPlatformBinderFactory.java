// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.samsung.android.sdk.health.sensor;

import android.content.*;
import android.os.*;
import android.util.Log;
import java.util.*;

// Referenced classes of package com.samsung.android.sdk.health.sensor:
//			_PlatformSensorService

public class ShealthPlatformBinderFactory
{
	class SensorObjectDetails
	{

		ShealthPlatformDeviceFinder.ServiceConnectionListener mListener;
		long mObjId;
		int mObjType;
		final ShealthPlatformBinderFactory this$0;

		public SensorObjectDetails(int i, long l, ShealthPlatformDeviceFinder.ServiceConnectionListener serviceconnectionlistener)
		{
			this$0 = ShealthPlatformBinderFactory.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #19  <Field ShealthPlatformBinderFactory this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #22  <Method void Object()>
			mObjType = i;
		//    5    9:aload_0         
		//    6   10:iload_2         
		//    7   11:putfield        #24  <Field int mObjType>
			mObjId = l;
		//    8   14:aload_0         
		//    9   15:lload_3         
		//   10   16:putfield        #26  <Field long mObjId>
			mListener = serviceconnectionlistener;
		//   11   19:aload_0         
		//   12   20:aload           5
		//   13   22:putfield        #28  <Field ShealthPlatformDeviceFinder$ServiceConnectionListener mListener>
		//   14   25:return          
		}
	}


	ShealthPlatformBinderFactory(Context context)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #60  <Method void Object()>
		mCallBackHandler = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #62  <Field Handler mCallBackHandler>
		mServiceConnectionState = SERVICE_CONNECTION_LOST;
	//    5    9:aload_0         
	//    6   10:getstatic       #51  <Field int SERVICE_CONNECTION_LOST>
	//    7   13:putfield        #64  <Field int mServiceConnectionState>
		mServiceConnection = new ServiceConnection() {

			public void onServiceConnected(ComponentName componentname, IBinder ibinder)
			{
				if(mServiceConnectionState == ShealthPlatformBinderFactory.SERVICE_CONNECTION_REQUESTED || mServiceConnectionState == ShealthPlatformBinderFactory.SERVICE_CONNECTION_LOST)
			//*   0    0:aload_0         
			//*   1    1:getfield        #14  <Field ShealthPlatformBinderFactory this$0>
			//*   2    4:invokestatic    #24  <Method int ShealthPlatformBinderFactory.access$200(ShealthPlatformBinderFactory)>
			//*   3    7:invokestatic    #28  <Method int ShealthPlatformBinderFactory.access$600()>
			//*   4   10:icmpeq          26
			//*   5   13:aload_0         
			//*   6   14:getfield        #14  <Field ShealthPlatformBinderFactory this$0>
			//*   7   17:invokestatic    #24  <Method int ShealthPlatformBinderFactory.access$200(ShealthPlatformBinderFactory)>
			//*   8   20:invokestatic    #31  <Method int ShealthPlatformBinderFactory.access$300()>
			//*   9   23:icmpne          69
				{
					Log.i(ShealthPlatformBinderFactory.TAG, "Service Connected");
			//   10   26:invokestatic    #35  <Method String ShealthPlatformBinderFactory.access$000()>
			//   11   29:ldc1            #37  <String "Service Connected">
			//   12   31:invokestatic    #43  <Method int Log.i(String, String)>
			//   13   34:pop             
					mService = _PlatformSensorService.Stub.asInterface(ibinder);
			//   14   35:aload_0         
			//   15   36:getfield        #14  <Field ShealthPlatformBinderFactory this$0>
			//   16   39:aload_2         
			//   17   40:invokestatic    #49  <Method _PlatformSensorService _PlatformSensorService$Stub.asInterface(IBinder)>
			//   18   43:invokestatic    #53  <Method _PlatformSensorService ShealthPlatformBinderFactory.access$502(ShealthPlatformBinderFactory, _PlatformSensorService)>
			//   19   46:pop             
					mServiceConnectionState = ShealthPlatformBinderFactory.SERVICE_CONNECTION_ESTABLISHED;
			//   20   47:aload_0         
			//   21   48:getfield        #14  <Field ShealthPlatformBinderFactory this$0>
			//   22   51:invokestatic    #56  <Method int ShealthPlatformBinderFactory.access$700()>
			//   23   54:invokestatic    #60  <Method int ShealthPlatformBinderFactory.access$202(ShealthPlatformBinderFactory, int)>
			//   24   57:pop             
					NotifyServiceConnectionStatus(true, 0);
			//   25   58:aload_0         
			//   26   59:getfield        #14  <Field ShealthPlatformBinderFactory this$0>
			//   27   62:iconst_1        
			//   28   63:iconst_0        
			//   29   64:invokestatic    #64  <Method boolean ShealthPlatformBinderFactory.access$100(ShealthPlatformBinderFactory, boolean, int)>
			//   30   67:pop             
					return;
			//   31   68:return          
				} else
				{
					Log.e(ShealthPlatformBinderFactory.TAG, (new StringBuilder()).append("Incorrect state found : ").append(mServiceConnectionState).toString());
			//   32   69:invokestatic    #35  <Method String ShealthPlatformBinderFactory.access$000()>
			//   33   72:new             #66  <Class StringBuilder>
			//   34   75:dup             
			//   35   76:invokespecial   #67  <Method void StringBuilder()>
			//   36   79:ldc1            #69  <String "Incorrect state found : ">
			//   37   81:invokevirtual   #73  <Method StringBuilder StringBuilder.append(String)>
			//   38   84:aload_0         
			//   39   85:getfield        #14  <Field ShealthPlatformBinderFactory this$0>
			//   40   88:invokestatic    #24  <Method int ShealthPlatformBinderFactory.access$200(ShealthPlatformBinderFactory)>
			//   41   91:invokevirtual   #76  <Method StringBuilder StringBuilder.append(int)>
			//   42   94:invokevirtual   #79  <Method String StringBuilder.toString()>
			//   43   97:invokestatic    #82  <Method int Log.e(String, String)>
			//   44  100:pop             
					return;
			//   45  101:return          
				}
			}

			public void onServiceDisconnected(ComponentName componentname)
			{
				Log.i(ShealthPlatformBinderFactory.TAG, (new StringBuilder()).append("Service disconnected").append(((Object) (componentname))).toString());
			//    0    0:invokestatic    #35  <Method String ShealthPlatformBinderFactory.access$000()>
			//    1    3:new             #66  <Class StringBuilder>
			//    2    6:dup             
			//    3    7:invokespecial   #67  <Method void StringBuilder()>
			//    4   10:ldc1            #86  <String "Service disconnected">
			//    5   12:invokevirtual   #73  <Method StringBuilder StringBuilder.append(String)>
			//    6   15:aload_1         
			//    7   16:invokevirtual   #89  <Method StringBuilder StringBuilder.append(Object)>
			//    8   19:invokevirtual   #79  <Method String StringBuilder.toString()>
			//    9   22:invokestatic    #43  <Method int Log.i(String, String)>
			//   10   25:pop             
				NotifyServiceConnectionStatus(false, 0);
			//   11   26:aload_0         
			//   12   27:getfield        #14  <Field ShealthPlatformBinderFactory this$0>
			//   13   30:iconst_0        
			//   14   31:iconst_0        
			//   15   32:invokestatic    #64  <Method boolean ShealthPlatformBinderFactory.access$100(ShealthPlatformBinderFactory, boolean, int)>
			//   16   35:pop             
				mServiceConnectionState = ShealthPlatformBinderFactory.SERVICE_CONNECTION_LOST;
			//   17   36:aload_0         
			//   18   37:getfield        #14  <Field ShealthPlatformBinderFactory this$0>
			//   19   40:invokestatic    #31  <Method int ShealthPlatformBinderFactory.access$300()>
			//   20   43:invokestatic    #60  <Method int ShealthPlatformBinderFactory.access$202(ShealthPlatformBinderFactory, int)>
			//   21   46:pop             
				ShealthPlatformBinderFactory.sSHealthServiceConnectionFactory.mService = null;
			//   22   47:invokestatic    #93  <Method ShealthPlatformBinderFactory ShealthPlatformBinderFactory.access$400()>
			//   23   50:aconst_null     
			//   24   51:invokestatic    #53  <Method _PlatformSensorService ShealthPlatformBinderFactory.access$502(ShealthPlatformBinderFactory, _PlatformSensorService)>
			//   25   54:pop             
			//   26   55:return          
			}

			final ShealthPlatformBinderFactory this$0;

			
			{
				this$0 = ShealthPlatformBinderFactory.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #14  <Field ShealthPlatformBinderFactory this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #17  <Method void Object()>
			//    5    9:return          
			}
		}
;
	//    8   16:aload_0         
	//    9   17:new             #6   <Class ShealthPlatformBinderFactory$1>
	//   10   20:dup             
	//   11   21:aload_0         
	//   12   22:invokespecial   #67  <Method void ShealthPlatformBinderFactory$1(ShealthPlatformBinderFactory)>
	//   13   25:putfield        #69  <Field ServiceConnection mServiceConnection>
		mContext = context;
	//   14   28:aload_0         
	//   15   29:aload_1         
	//   16   30:putfield        #71  <Field Context mContext>
		mObjDetailsList = Collections.synchronizedList(((List) (new ArrayList())));
	//   17   33:aload_0         
	//   18   34:new             #73  <Class ArrayList>
	//   19   37:dup             
	//   20   38:invokespecial   #74  <Method void ArrayList()>
	//   21   41:invokestatic    #80  <Method List Collections.synchronizedList(List)>
	//   22   44:putfield        #82  <Field List mObjDetailsList>
		initializeCallbackHandlerThread();
	//   23   47:aload_0         
	//   24   48:invokespecial   #86  <Method boolean initializeCallbackHandlerThread()>
	//   25   51:pop             
	//   26   52:return          
	}

	private boolean NotifyServiceConnectionStatus(final boolean btrueConneced, final int errorNumber)
	{
		boolean flag = false;
	//    0    0:iconst_0        
	//    1    1:istore_3        
		List list = mObjDetailsList;
	//    2    2:aload_0         
	//    3    3:getfield        #82  <Field List mObjDetailsList>
	//    4    6:astore          5
		list;
	//    5    8:aload           5
		JVM INSTR monitorenter ;
	//    6   10:monitorenter    
		Iterator iterator = mObjDetailsList.iterator();
	//    7   11:aload_0         
	//    8   12:getfield        #82  <Field List mObjDetailsList>
	//    9   15:invokeinterface #94  <Method Iterator List.iterator()>
	//   10   20:astore          6
_L2:
		final SensorObjectDetails u;
		do
		{
			if(!iterator.hasNext())
				break MISSING_BLOCK_LABEL_106;
	//   11   22:aload           6
	//   12   24:invokeinterface #99  <Method boolean Iterator.hasNext()>
	//   13   29:ifeq            106
			u = (SensorObjectDetails)iterator.next();
	//   14   32:aload           6
	//   15   34:invokeinterface #103 <Method Object Iterator.next()>
	//   16   39:checkcast       #12  <Class ShealthPlatformBinderFactory$SensorObjectDetails>
	//   17   42:astore          7
		} while(u.mListener == null);
	//   18   44:aload           7
	//   19   46:getfield        #107 <Field ShealthPlatformDeviceFinder$ServiceConnectionListener ShealthPlatformBinderFactory$SensorObjectDetails.mListener>
	//   20   49:ifnull          22
		u = ((SensorObjectDetails) (new Runnable() {

			public void run()
			{
				if(btrueConneced)
			//*   0    0:aload_0         
			//*   1    1:getfield        #25  <Field boolean val$btrueConneced>
			//*   2    4:ifeq            59
				{
					Log.d(ShealthPlatformBinderFactory.TAG, (new StringBuilder()).append(((Object) (u.mListener)).hashCode()).append("").toString());
			//    3    7:invokestatic    #38  <Method String ShealthPlatformBinderFactory.access$000()>
			//    4   10:new             #40  <Class StringBuilder>
			//    5   13:dup             
			//    6   14:invokespecial   #41  <Method void StringBuilder()>
			//    7   17:aload_0         
			//    8   18:getfield        #27  <Field ShealthPlatformBinderFactory$SensorObjectDetails val$u>
			//    9   21:getfield        #47  <Field ShealthPlatformDeviceFinder$ServiceConnectionListener ShealthPlatformBinderFactory$SensorObjectDetails.mListener>
			//   10   24:invokevirtual   #51  <Method int Object.hashCode()>
			//   11   27:invokevirtual   #55  <Method StringBuilder StringBuilder.append(int)>
			//   12   30:ldc1            #57  <String "">
			//   13   32:invokevirtual   #60  <Method StringBuilder StringBuilder.append(String)>
			//   14   35:invokevirtual   #63  <Method String StringBuilder.toString()>
			//   15   38:invokestatic    #69  <Method int Log.d(String, String)>
			//   16   41:pop             
					u.mListener.onServiceConnected(errorNumber);
			//   17   42:aload_0         
			//   18   43:getfield        #27  <Field ShealthPlatformBinderFactory$SensorObjectDetails val$u>
			//   19   46:getfield        #47  <Field ShealthPlatformDeviceFinder$ServiceConnectionListener ShealthPlatformBinderFactory$SensorObjectDetails.mListener>
			//   20   49:aload_0         
			//   21   50:getfield        #29  <Field int val$errorNumber>
			//   22   53:invokeinterface #75  <Method void ShealthPlatformDeviceFinder$ServiceConnectionListener.onServiceConnected(int)>
					return;
			//   23   58:return          
				} else
				{
					u.mListener.onServiceDisconnected(errorNumber);
			//   24   59:aload_0         
			//   25   60:getfield        #27  <Field ShealthPlatformBinderFactory$SensorObjectDetails val$u>
			//   26   63:getfield        #47  <Field ShealthPlatformDeviceFinder$ServiceConnectionListener ShealthPlatformBinderFactory$SensorObjectDetails.mListener>
			//   27   66:aload_0         
			//   28   67:getfield        #29  <Field int val$errorNumber>
			//   29   70:invokeinterface #78  <Method void ShealthPlatformDeviceFinder$ServiceConnectionListener.onServiceDisconnected(int)>
					return;
			//   30   75:return          
				}
			}

			final ShealthPlatformBinderFactory this$0;
			final boolean val$btrueConneced;
			final int val$errorNumber;
			final SensorObjectDetails val$u;

			
			{
				this$0 = ShealthPlatformBinderFactory.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #23  <Field ShealthPlatformBinderFactory this$0>
				btrueConneced = flag;
			//    3    5:aload_0         
			//    4    6:iload_2         
			//    5    7:putfield        #25  <Field boolean val$btrueConneced>
				u = sensorobjectdetails;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #27  <Field ShealthPlatformBinderFactory$SensorObjectDetails val$u>
				errorNumber = i;
			//    9   15:aload_0         
			//   10   16:iload           4
			//   11   18:putfield        #29  <Field int val$errorNumber>
				super();
			//   12   21:aload_0         
			//   13   22:invokespecial   #32  <Method void Object()>
			//   14   25:return          
			}
		}
));
	//   21   52:new             #10  <Class ShealthPlatformBinderFactory$3>
	//   22   55:dup             
	//   23   56:aload_0         
	//   24   57:iload_1         
	//   25   58:aload           7
	//   26   60:iload_2         
	//   27   61:invokespecial   #110 <Method void ShealthPlatformBinderFactory$3(ShealthPlatformBinderFactory, boolean, ShealthPlatformBinderFactory$SensorObjectDetails, int)>
	//   28   64:astore          7
		boolean flag1;
		flag1 = true;
	//   29   66:iconst_1        
	//   30   67:istore          4
		flag = flag1;
	//   31   69:iload           4
	//   32   71:istore_3        
		if(mCallBackHandler == null) goto _L2; else goto _L1
	//   33   72:aload_0         
	//   34   73:getfield        #62  <Field Handler mCallBackHandler>
	//   35   76:ifnull          22
_L1:
		mCallBackHandler.postDelayed(((Runnable) (u)), 50L);
	//   36   79:aload_0         
	//   37   80:getfield        #62  <Field Handler mCallBackHandler>
	//   38   83:aload           7
	//   39   85:ldc2w           #111 <Long 50L>
	//   40   88:invokevirtual   #118 <Method boolean Handler.postDelayed(Runnable, long)>
	//   41   91:pop             
		flag = flag1;
	//   42   92:iload           4
	//   43   94:istore_3        
		  goto _L2
	//*  44   95:goto            22
		Exception exception;
		exception;
	//   45   98:astore          6
		list;
	//   46  100:aload           5
		JVM INSTR monitorexit ;
	//   47  102:monitorexit     
		throw exception;
	//   48  103:aload           6
	//   49  105:athrow          
		list;
	//   50  106:aload           5
		JVM INSTR monitorexit ;
	//   51  108:monitorexit     
		if(flag)
	//*  52  109:iload_3         
	//*  53  110:iconst_1        
	//*  54  111:icmpne          116
		{
			return true;
	//   55  114:iconst_1        
	//   56  115:ireturn         
		} else
		{
			Log.e(TAG, (new StringBuilder()).append("No Listener was notified,only Device Objects? MUST not happen: bConnect:").append(btrueConneced).toString());
	//   57  116:getstatic       #47  <Field String TAG>
	//   58  119:new             #120 <Class StringBuilder>
	//   59  122:dup             
	//   60  123:invokespecial   #121 <Method void StringBuilder()>
	//   61  126:ldc1            #123 <String "No Listener was notified,only Device Objects? MUST not happen: bConnect:">
	//   62  128:invokevirtual   #127 <Method StringBuilder StringBuilder.append(String)>
	//   63  131:iload_1         
	//   64  132:invokevirtual   #130 <Method StringBuilder StringBuilder.append(boolean)>
	//   65  135:invokevirtual   #133 <Method String StringBuilder.toString()>
	//   66  138:invokestatic    #139 <Method int Log.e(String, String)>
	//   67  141:pop             
			return false;
	//   68  142:iconst_0        
	//   69  143:ireturn         
		}
	}

	private boolean NotifyServiceConnectionStatus(final boolean btrueConneced, final int errorNumber, ShealthPlatformDeviceFinder.ServiceConnectionListener serviceconnectionlistener)
	{
		boolean flag = false;
	//    0    0:iconst_0        
	//    1    1:istore          4
		List list = mObjDetailsList;
	//    2    3:aload_0         
	//    3    4:getfield        #82  <Field List mObjDetailsList>
	//    4    7:astore          6
		list;
	//    5    9:aload           6
		JVM INSTR monitorenter ;
	//    6   11:monitorenter    
		Iterator iterator = mObjDetailsList.iterator();
	//    7   12:aload_0         
	//    8   13:getfield        #82  <Field List mObjDetailsList>
	//    9   16:invokeinterface #94  <Method Iterator List.iterator()>
	//   10   21:astore          7
_L2:
		final SensorObjectDetails u;
		do
		{
			if(!iterator.hasNext())
				break MISSING_BLOCK_LABEL_116;
	//   11   23:aload           7
	//   12   25:invokeinterface #99  <Method boolean Iterator.hasNext()>
	//   13   30:ifeq            116
			u = (SensorObjectDetails)iterator.next();
	//   14   33:aload           7
	//   15   35:invokeinterface #103 <Method Object Iterator.next()>
	//   16   40:checkcast       #12  <Class ShealthPlatformBinderFactory$SensorObjectDetails>
	//   17   43:astore          8
		} while(u.mListener == null || u.mListener != serviceconnectionlistener);
	//   18   45:aload           8
	//   19   47:getfield        #107 <Field ShealthPlatformDeviceFinder$ServiceConnectionListener ShealthPlatformBinderFactory$SensorObjectDetails.mListener>
	//   20   50:ifnull          23
	//   21   53:aload           8
	//   22   55:getfield        #107 <Field ShealthPlatformDeviceFinder$ServiceConnectionListener ShealthPlatformBinderFactory$SensorObjectDetails.mListener>
	//   23   58:aload_3         
	//   24   59:if_acmpne       23
		u = ((SensorObjectDetails) (new Runnable() {

			public void run()
			{
				if(btrueConneced)
			//*   0    0:aload_0         
			//*   1    1:getfield        #25  <Field boolean val$btrueConneced>
			//*   2    4:ifeq            24
				{
					u.mListener.onServiceConnected(errorNumber);
			//    3    7:aload_0         
			//    4    8:getfield        #27  <Field ShealthPlatformBinderFactory$SensorObjectDetails val$u>
			//    5   11:getfield        #40  <Field ShealthPlatformDeviceFinder$ServiceConnectionListener ShealthPlatformBinderFactory$SensorObjectDetails.mListener>
			//    6   14:aload_0         
			//    7   15:getfield        #29  <Field int val$errorNumber>
			//    8   18:invokeinterface #46  <Method void ShealthPlatformDeviceFinder$ServiceConnectionListener.onServiceConnected(int)>
					return;
			//    9   23:return          
				} else
				{
					u.mListener.onServiceDisconnected(errorNumber);
			//   10   24:aload_0         
			//   11   25:getfield        #27  <Field ShealthPlatformBinderFactory$SensorObjectDetails val$u>
			//   12   28:getfield        #40  <Field ShealthPlatformDeviceFinder$ServiceConnectionListener ShealthPlatformBinderFactory$SensorObjectDetails.mListener>
			//   13   31:aload_0         
			//   14   32:getfield        #29  <Field int val$errorNumber>
			//   15   35:invokeinterface #49  <Method void ShealthPlatformDeviceFinder$ServiceConnectionListener.onServiceDisconnected(int)>
					return;
			//   16   40:return          
				}
			}

			final ShealthPlatformBinderFactory this$0;
			final boolean val$btrueConneced;
			final int val$errorNumber;
			final SensorObjectDetails val$u;

			
			{
				this$0 = ShealthPlatformBinderFactory.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #23  <Field ShealthPlatformBinderFactory this$0>
				btrueConneced = flag;
			//    3    5:aload_0         
			//    4    6:iload_2         
			//    5    7:putfield        #25  <Field boolean val$btrueConneced>
				u = sensorobjectdetails;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #27  <Field ShealthPlatformBinderFactory$SensorObjectDetails val$u>
				errorNumber = i;
			//    9   15:aload_0         
			//   10   16:iload           4
			//   11   18:putfield        #29  <Field int val$errorNumber>
				super();
			//   12   21:aload_0         
			//   13   22:invokespecial   #32  <Method void Object()>
			//   14   25:return          
			}
		}
));
	//   25   62:new             #8   <Class ShealthPlatformBinderFactory$2>
	//   26   65:dup             
	//   27   66:aload_0         
	//   28   67:iload_1         
	//   29   68:aload           8
	//   30   70:iload_2         
	//   31   71:invokespecial   #141 <Method void ShealthPlatformBinderFactory$2(ShealthPlatformBinderFactory, boolean, ShealthPlatformBinderFactory$SensorObjectDetails, int)>
	//   32   74:astore          8
		boolean flag1;
		flag1 = true;
	//   33   76:iconst_1        
	//   34   77:istore          5
		flag = flag1;
	//   35   79:iload           5
	//   36   81:istore          4
		if(mCallBackHandler == null) goto _L2; else goto _L1
	//   37   83:aload_0         
	//   38   84:getfield        #62  <Field Handler mCallBackHandler>
	//   39   87:ifnull          23
_L1:
		mCallBackHandler.postDelayed(((Runnable) (u)), 50L);
	//   40   90:aload_0         
	//   41   91:getfield        #62  <Field Handler mCallBackHandler>
	//   42   94:aload           8
	//   43   96:ldc2w           #111 <Long 50L>
	//   44   99:invokevirtual   #118 <Method boolean Handler.postDelayed(Runnable, long)>
	//   45  102:pop             
		flag = flag1;
	//   46  103:iload           5
	//   47  105:istore          4
		  goto _L2
	//*  48  107:goto            23
		serviceconnectionlistener;
	//   49  110:astore_3        
		list;
	//   50  111:aload           6
		JVM INSTR monitorexit ;
	//   51  113:monitorexit     
		throw serviceconnectionlistener;
	//   52  114:aload_3         
	//   53  115:athrow          
		list;
	//   54  116:aload           6
		JVM INSTR monitorexit ;
	//   55  118:monitorexit     
		if(flag)
	//*  56  119:iload           4
	//*  57  121:iconst_1        
	//*  58  122:icmpne          127
		{
			return true;
	//   59  125:iconst_1        
	//   60  126:ireturn         
		} else
		{
			Log.e(TAG, (new StringBuilder()).append("No Listener was notified,only Device Objects? MUST not happen: bConnect:").append(btrueConneced).toString());
	//   61  127:getstatic       #47  <Field String TAG>
	//   62  130:new             #120 <Class StringBuilder>
	//   63  133:dup             
	//   64  134:invokespecial   #121 <Method void StringBuilder()>
	//   65  137:ldc1            #123 <String "No Listener was notified,only Device Objects? MUST not happen: bConnect:">
	//   66  139:invokevirtual   #127 <Method StringBuilder StringBuilder.append(String)>
	//   67  142:iload_1         
	//   68  143:invokevirtual   #130 <Method StringBuilder StringBuilder.append(boolean)>
	//   69  146:invokevirtual   #133 <Method String StringBuilder.toString()>
	//   70  149:invokestatic    #139 <Method int Log.e(String, String)>
	//   71  152:pop             
			return false;
	//   72  153:iconst_0        
	//   73  154:ireturn         
		}
	}

	private boolean dropServiceConnection()
	{
		Log.i(TAG, "dropServiceConnection: Unbinding with Health Service");
	//    0    0:getstatic       #47  <Field String TAG>
	//    1    3:ldc1            #163 <String "dropServiceConnection: Unbinding with Health Service">
	//    2    5:invokestatic    #166 <Method int Log.i(String, String)>
	//    3    8:pop             
		mContext.unbindService(mServiceConnection);
	//    4    9:aload_0         
	//    5   10:getfield        #71  <Field Context mContext>
	//    6   13:aload_0         
	//    7   14:getfield        #69  <Field ServiceConnection mServiceConnection>
	//    8   17:invokevirtual   #172 <Method void Context.unbindService(ServiceConnection)>
		mService = null;
	//    9   20:aload_0         
	//   10   21:aconst_null     
	//   11   22:putfield        #158 <Field _PlatformSensorService mService>
		mServiceConnectionState = SERVICE_CONNECTION_LOST;
	//   12   25:aload_0         
	//   13   26:getstatic       #51  <Field int SERVICE_CONNECTION_LOST>
	//   14   29:putfield        #64  <Field int mServiceConnectionState>
		return false;
	//   15   32:iconst_0        
	//   16   33:ireturn         
	}

	public static _PlatformSensorService getDefaultBinder(Context context, int i, long l, ShealthPlatformDeviceFinder.ServiceConnectionListener serviceconnectionlistener)
	{
		com/samsung/android/sdk/health/sensor/ShealthPlatformBinderFactory;
	//    0    0:ldc1            #2   <Class ShealthPlatformBinderFactory>
		JVM INSTR monitorenter ;
	//    1    2:monitorenter    
		if(sSHealthServiceConnectionFactory == null)
	//*   2    3:getstatic       #49  <Field ShealthPlatformBinderFactory sSHealthServiceConnectionFactory>
	//*   3    6:ifnonnull       20
			sSHealthServiceConnectionFactory = new ShealthPlatformBinderFactory(context);
	//    4    9:new             #2   <Class ShealthPlatformBinderFactory>
	//    5   12:dup             
	//    6   13:aload_0         
	//    7   14:invokespecial   #176 <Method void ShealthPlatformBinderFactory(Context)>
	//    8   17:putstatic       #49  <Field ShealthPlatformBinderFactory sSHealthServiceConnectionFactory>
		if(sSHealthServiceConnectionFactory.mServiceConnectionState == SERVICE_CONNECTION_LOST && sSHealthServiceConnectionFactory.mObjDetailsList != null)
	//*   9   20:getstatic       #49  <Field ShealthPlatformBinderFactory sSHealthServiceConnectionFactory>
	//*  10   23:getfield        #64  <Field int mServiceConnectionState>
	//*  11   26:getstatic       #51  <Field int SERVICE_CONNECTION_LOST>
	//*  12   29:icmpne          52
	//*  13   32:getstatic       #49  <Field ShealthPlatformBinderFactory sSHealthServiceConnectionFactory>
	//*  14   35:getfield        #82  <Field List mObjDetailsList>
	//*  15   38:ifnull          52
			sSHealthServiceConnectionFactory.mObjDetailsList.clear();
	//   16   41:getstatic       #49  <Field ShealthPlatformBinderFactory sSHealthServiceConnectionFactory>
	//   17   44:getfield        #82  <Field List mObjDetailsList>
	//   18   47:invokeinterface #179 <Method void List.clear()>
		Object obj = ((Object) (sSHealthServiceConnectionFactory));
	//   19   52:getstatic       #49  <Field ShealthPlatformBinderFactory sSHealthServiceConnectionFactory>
	//   20   55:astore          5
		obj.getClass();
	//   21   57:aload           5
	//   22   59:invokevirtual   #183 <Method Class Object.getClass()>
	//   23   62:pop             
		obj = ((Object) (((SensorObjectDetails) (obj)). new SensorObjectDetails(i, l, serviceconnectionlistener)));
	//   24   63:new             #12  <Class ShealthPlatformBinderFactory$SensorObjectDetails>
	//   25   66:dup             
	//   26   67:aload           5
	//   27   69:iload_1         
	//   28   70:lload_2         
	//   29   71:aload           4
	//   30   73:invokespecial   #186 <Method void ShealthPlatformBinderFactory$SensorObjectDetails(ShealthPlatformBinderFactory, int, long, ShealthPlatformDeviceFinder$ServiceConnectionListener)>
	//   31   76:astore          5
		sSHealthServiceConnectionFactory.mObjDetailsList.add(obj);
	//   32   78:getstatic       #49  <Field ShealthPlatformBinderFactory sSHealthServiceConnectionFactory>
	//   33   81:getfield        #82  <Field List mObjDetailsList>
	//   34   84:aload           5
	//   35   86:invokeinterface #190 <Method boolean List.add(Object)>
	//   36   91:pop             
		if(sSHealthServiceConnectionFactory.mServiceConnectionState != SERVICE_CONNECTION_LOST) goto _L2; else goto _L1
	//   37   92:getstatic       #49  <Field ShealthPlatformBinderFactory sSHealthServiceConnectionFactory>
	//   38   95:getfield        #64  <Field int mServiceConnectionState>
	//   39   98:getstatic       #51  <Field int SERVICE_CONNECTION_LOST>
	//   40  101:icmpne          182
_L1:
		Intent intent;
		intent = new Intent();
	//   41  104:new             #192 <Class Intent>
	//   42  107:dup             
	//   43  108:invokespecial   #193 <Method void Intent()>
	//   44  111:astore          5
		intent.setAction("com.sec.android.service.health.sensor.PrivilegeSensorService");
	//   45  113:aload           5
	//   46  115:ldc1            #195 <String "com.sec.android.service.health.sensor.PrivilegeSensorService">
	//   47  117:invokevirtual   #199 <Method Intent Intent.setAction(String)>
	//   48  120:pop             
		sSHealthServiceConnectionFactory.mContext = context.getApplicationContext();
	//   49  121:getstatic       #49  <Field ShealthPlatformBinderFactory sSHealthServiceConnectionFactory>
	//   50  124:aload_0         
	//   51  125:invokevirtual   #203 <Method Context Context.getApplicationContext()>
	//   52  128:putfield        #71  <Field Context mContext>
		if(!sSHealthServiceConnectionFactory.mContext.bindService(intent, sSHealthServiceConnectionFactory.mServiceConnection, 1)) goto _L4; else goto _L3
	//   53  131:getstatic       #49  <Field ShealthPlatformBinderFactory sSHealthServiceConnectionFactory>
	//   54  134:getfield        #71  <Field Context mContext>
	//   55  137:aload           5
	//   56  139:getstatic       #49  <Field ShealthPlatformBinderFactory sSHealthServiceConnectionFactory>
	//   57  142:getfield        #69  <Field ServiceConnection mServiceConnection>
	//   58  145:iconst_1        
	//   59  146:invokevirtual   #207 <Method boolean Context.bindService(Intent, ServiceConnection, int)>
	//   60  149:ifeq            222
_L3:
		if(sSHealthServiceConnectionFactory.mServiceConnectionState == SERVICE_CONNECTION_LOST)
	//*  61  152:getstatic       #49  <Field ShealthPlatformBinderFactory sSHealthServiceConnectionFactory>
	//*  62  155:getfield        #64  <Field int mServiceConnectionState>
	//*  63  158:getstatic       #51  <Field int SERVICE_CONNECTION_LOST>
	//*  64  161:icmpne          173
			sSHealthServiceConnectionFactory.mServiceConnectionState = SERVICE_CONNECTION_REQUESTED;
	//   65  164:getstatic       #49  <Field ShealthPlatformBinderFactory sSHealthServiceConnectionFactory>
	//   66  167:getstatic       #53  <Field int SERVICE_CONNECTION_REQUESTED>
	//   67  170:putfield        #64  <Field int mServiceConnectionState>
		Log.i(TAG, "Requested Binding to Health Service");
	//   68  173:getstatic       #47  <Field String TAG>
	//   69  176:ldc1            #209 <String "Requested Binding to Health Service">
	//   70  178:invokestatic    #166 <Method int Log.i(String, String)>
	//   71  181:pop             
_L2:
		if(serviceconnectionlistener == null)
			break MISSING_BLOCK_LABEL_210;
	//   72  182:aload           4
	//   73  184:ifnull          210
		if(sSHealthServiceConnectionFactory.mServiceConnectionState == SERVICE_CONNECTION_ESTABLISHED)
	//*  74  187:getstatic       #49  <Field ShealthPlatformBinderFactory sSHealthServiceConnectionFactory>
	//*  75  190:getfield        #64  <Field int mServiceConnectionState>
	//*  76  193:getstatic       #55  <Field int SERVICE_CONNECTION_ESTABLISHED>
	//*  77  196:icmpne          210
			sSHealthServiceConnectionFactory.NotifyServiceConnectionStatus(true, 0, serviceconnectionlistener);
	//   78  199:getstatic       #49  <Field ShealthPlatformBinderFactory sSHealthServiceConnectionFactory>
	//   79  202:iconst_1        
	//   80  203:iconst_0        
	//   81  204:aload           4
	//   82  206:invokespecial   #211 <Method boolean NotifyServiceConnectionStatus(boolean, int, ShealthPlatformDeviceFinder$ServiceConnectionListener)>
	//   83  209:pop             
		context = ((Context) (sSHealthServiceConnectionFactory.mService));
	//   84  210:getstatic       #49  <Field ShealthPlatformBinderFactory sSHealthServiceConnectionFactory>
	//   85  213:getfield        #158 <Field _PlatformSensorService mService>
	//   86  216:astore_0        
_L6:
		com/samsung/android/sdk/health/sensor/ShealthPlatformBinderFactory;
	//   87  217:ldc1            #2   <Class ShealthPlatformBinderFactory>
		JVM INSTR monitorexit ;
	//   88  219:monitorexit     
		return ((_PlatformSensorService) (context));
	//   89  220:aload_0         
	//   90  221:areturn         
_L4:
		Log.e(TAG, "Binding to Shealth Service wont happen..");
	//   91  222:getstatic       #47  <Field String TAG>
	//   92  225:ldc1            #213 <String "Binding to Shealth Service wont happen..">
	//   93  227:invokestatic    #139 <Method int Log.e(String, String)>
	//   94  230:pop             
		sSHealthServiceConnectionFactory.mServiceConnectionState = SERVICE_CONNECTION_LOST;
	//   95  231:getstatic       #49  <Field ShealthPlatformBinderFactory sSHealthServiceConnectionFactory>
	//   96  234:getstatic       #51  <Field int SERVICE_CONNECTION_LOST>
	//   97  237:putfield        #64  <Field int mServiceConnectionState>
		context = null;
	//   98  240:aconst_null     
	//   99  241:astore_0        
		if(true) goto _L6; else goto _L5
	//  100  242:goto            217
_L5:
		context;
	//  101  245:astore_0        
	//* 102  246:ldc1            #2   <Class ShealthPlatformBinderFactory>
		throw context;
	//  103  248:monitorexit     
	//  104  249:aload_0         
	//  105  250:athrow          
	}

	public static _PlatformSensorService getMyBinder(int i, long l)
	{
		com/samsung/android/sdk/health/sensor/ShealthPlatformBinderFactory;
	//    0    0:ldc1            #2   <Class ShealthPlatformBinderFactory>
		JVM INSTR monitorenter ;
	//    1    2:monitorenter    
		Object obj = null;
	//    2    3:aconst_null     
	//    3    4:astore_3        
		List list = sSHealthServiceConnectionFactory.mObjDetailsList;
	//    4    5:getstatic       #49  <Field ShealthPlatformBinderFactory sSHealthServiceConnectionFactory>
	//    5    8:getfield        #82  <Field List mObjDetailsList>
	//    6   11:astore          5
		list;
	//    7   13:aload           5
		JVM INSTR monitorenter ;
	//    8   15:monitorenter    
		Iterator iterator = sSHealthServiceConnectionFactory.mObjDetailsList.iterator();
	//    9   16:getstatic       #49  <Field ShealthPlatformBinderFactory sSHealthServiceConnectionFactory>
	//   10   19:getfield        #82  <Field List mObjDetailsList>
	//   11   22:invokeinterface #94  <Method Iterator List.iterator()>
	//   12   27:astore          6
_L2:
		SensorObjectDetails sensorobjectdetails;
		if(!iterator.hasNext())
			break MISSING_BLOCK_LABEL_67;
	//   13   29:aload           6
	//   14   31:invokeinterface #99  <Method boolean Iterator.hasNext()>
	//   15   36:ifeq            67
		sensorobjectdetails = (SensorObjectDetails)iterator.next();
	//   16   39:aload           6
	//   17   41:invokeinterface #103 <Method Object Iterator.next()>
	//   18   46:checkcast       #12  <Class ShealthPlatformBinderFactory$SensorObjectDetails>
	//   19   49:astore          4
		obj = ((Object) (sensorobjectdetails));
	//   20   51:aload           4
	//   21   53:astore_3        
		if(sensorobjectdetails.mObjId != l) goto _L2; else goto _L1
	//   22   54:aload           4
	//   23   56:getfield        #219 <Field long ShealthPlatformBinderFactory$SensorObjectDetails.mObjId>
	//   24   59:lload_1         
	//   25   60:lcmp            
	//   26   61:ifne            29
_L1:
		obj = ((Object) (sensorobjectdetails));
	//   27   64:aload           4
	//   28   66:astore_3        
		list;
	//   29   67:aload           5
		JVM INSTR monitorexit ;
	//   30   69:monitorexit     
		if(obj != null)
			break MISSING_BLOCK_LABEL_102;
	//   31   70:aload_3         
	//   32   71:ifnonnull       102
		Log.e(TAG, "Look like getDefaultBinder was not called");
	//   33   74:getstatic       #47  <Field String TAG>
	//   34   77:ldc1            #221 <String "Look like getDefaultBinder was not called">
	//   35   79:invokestatic    #139 <Method int Log.e(String, String)>
	//   36   82:pop             
		obj = null;
	//   37   83:aconst_null     
	//   38   84:astore_3        
_L3:
		com/samsung/android/sdk/health/sensor/ShealthPlatformBinderFactory;
	//   39   85:ldc1            #2   <Class ShealthPlatformBinderFactory>
		JVM INSTR monitorexit ;
	//   40   87:monitorexit     
		return ((_PlatformSensorService) (obj));
	//   41   88:aload_3         
	//   42   89:areturn         
		obj;
	//   43   90:astore_3        
		list;
	//   44   91:aload           5
		JVM INSTR monitorexit ;
	//   45   93:monitorexit     
		throw obj;
	//   46   94:aload_3         
	//   47   95:athrow          
		obj;
	//   48   96:astore_3        
		com/samsung/android/sdk/health/sensor/ShealthPlatformBinderFactory;
	//   49   97:ldc1            #2   <Class ShealthPlatformBinderFactory>
		JVM INSTR monitorexit ;
	//   50   99:monitorexit     
		throw obj;
	//   51  100:aload_3         
	//   52  101:athrow          
		obj = ((Object) (sSHealthServiceConnectionFactory.mService));
	//   53  102:getstatic       #49  <Field ShealthPlatformBinderFactory sSHealthServiceConnectionFactory>
	//   54  105:getfield        #158 <Field _PlatformSensorService mService>
	//   55  108:astore_3        
		  goto _L3
	//*  56  109:goto            85
	}

	private boolean initializeCallbackHandlerThread()
	{
		HandlerThread handlerthread = new HandlerThread("ShealthPlatformBinderFactory-Callback");
	//    0    0:new             #223 <Class HandlerThread>
	//    1    3:dup             
	//    2    4:ldc1            #225 <String "ShealthPlatformBinderFactory-Callback">
	//    3    6:invokespecial   #228 <Method void HandlerThread(String)>
	//    4    9:astore_1        
		handlerthread.start();
	//    5   10:aload_1         
	//    6   11:invokevirtual   #231 <Method void HandlerThread.start()>
		mCallBackHandler = new Handler(handlerthread.getLooper());
	//    7   14:aload_0         
	//    8   15:new             #114 <Class Handler>
	//    9   18:dup             
	//   10   19:aload_1         
	//   11   20:invokevirtual   #235 <Method Looper HandlerThread.getLooper()>
	//   12   23:invokespecial   #238 <Method void Handler(Looper)>
	//   13   26:putfield        #62  <Field Handler mCallBackHandler>
		return true;
	//   14   29:iconst_1        
	//   15   30:ireturn         
	}

	public static boolean releaseReference(int i, int j)
	{
		com/samsung/android/sdk/health/sensor/ShealthPlatformBinderFactory;
	//    0    0:ldc1            #2   <Class ShealthPlatformBinderFactory>
		JVM INSTR monitorenter ;
	//    1    2:monitorenter    
		sSHealthServiceConnectionFactory.removeMatchingObject(i, j);
	//    2    3:getstatic       #49  <Field ShealthPlatformBinderFactory sSHealthServiceConnectionFactory>
	//    3    6:iload_0         
	//    4    7:iload_1         
	//    5    8:i2l             
	//    6    9:invokevirtual   #244 <Method boolean removeMatchingObject(int, long)>
	//    7   12:pop             
		com/samsung/android/sdk/health/sensor/ShealthPlatformBinderFactory;
	//    8   13:ldc1            #2   <Class ShealthPlatformBinderFactory>
		JVM INSTR monitorexit ;
	//    9   15:monitorexit     
		return false;
	//   10   16:iconst_0        
	//   11   17:ireturn         
		Exception exception;
		exception;
	//   12   18:astore_2        
	//*  13   19:ldc1            #2   <Class ShealthPlatformBinderFactory>
		throw exception;
	//   14   21:monitorexit     
	//   15   22:aload_2         
	//   16   23:athrow          
	}

	protected void finalize()
		throws Throwable
	{
		super.finalize();
	//    0    0:aload_0         
	//    1    1:invokespecial   #249 <Method void Object.finalize()>
		if(mCallBackHandler != null)
	//*   2    4:aload_0         
	//*   3    5:getfield        #62  <Field Handler mCallBackHandler>
	//*   4    8:ifnull          21
			mCallBackHandler.getLooper().quit();
	//    5   11:aload_0         
	//    6   12:getfield        #62  <Field Handler mCallBackHandler>
	//    7   15:invokevirtual   #250 <Method Looper Handler.getLooper()>
	//    8   18:invokevirtual   #255 <Method void Looper.quit()>
	//    9   21:return          
	}

	boolean removeMatchingObject(int i, long l)
	{
		Object obj = null;
	//    0    0:aconst_null     
	//    1    1:astore          4
		List list = mObjDetailsList;
	//    2    3:aload_0         
	//    3    4:getfield        #82  <Field List mObjDetailsList>
	//    4    7:astore          6
		list;
	//    5    9:aload           6
		JVM INSTR monitorenter ;
	//    6   11:monitorenter    
		Iterator iterator = mObjDetailsList.iterator();
	//    7   12:aload_0         
	//    8   13:getfield        #82  <Field List mObjDetailsList>
	//    9   16:invokeinterface #94  <Method Iterator List.iterator()>
	//   10   21:astore          7
_L2:
		SensorObjectDetails sensorobjectdetails;
		if(!iterator.hasNext())
			break MISSING_BLOCK_LABEL_63;
	//   11   23:aload           7
	//   12   25:invokeinterface #99  <Method boolean Iterator.hasNext()>
	//   13   30:ifeq            63
		sensorobjectdetails = (SensorObjectDetails)iterator.next();
	//   14   33:aload           7
	//   15   35:invokeinterface #103 <Method Object Iterator.next()>
	//   16   40:checkcast       #12  <Class ShealthPlatformBinderFactory$SensorObjectDetails>
	//   17   43:astore          5
		obj = ((Object) (sensorobjectdetails));
	//   18   45:aload           5
	//   19   47:astore          4
		if(sensorobjectdetails.mObjId != l) goto _L2; else goto _L1
	//   20   49:aload           5
	//   21   51:getfield        #219 <Field long ShealthPlatformBinderFactory$SensorObjectDetails.mObjId>
	//   22   54:lload_2         
	//   23   55:lcmp            
	//   24   56:ifne            23
_L1:
		obj = ((Object) (sensorobjectdetails));
	//   25   59:aload           5
	//   26   61:astore          4
		list;
	//   27   63:aload           6
		JVM INSTR monitorexit ;
	//   28   65:monitorexit     
		if(obj == null)
	//*  29   66:aload           4
	//*  30   68:ifnonnull       91
		{
			Log.e(TAG, "removeMatchingObject:Matching Object not found");
	//   31   71:getstatic       #47  <Field String TAG>
	//   32   74:ldc2            #258 <String "removeMatchingObject:Matching Object not found">
	//   33   77:invokestatic    #139 <Method int Log.e(String, String)>
	//   34   80:pop             
			return false;
	//   35   81:iconst_0        
	//   36   82:ireturn         
		}
		break MISSING_BLOCK_LABEL_91;
		obj;
	//   37   83:astore          4
		list;
	//   38   85:aload           6
		JVM INSTR monitorexit ;
	//   39   87:monitorexit     
		throw obj;
	//   40   88:aload           4
	//   41   90:athrow          
		mObjDetailsList.remove(obj);
	//   42   91:aload_0         
	//   43   92:getfield        #82  <Field List mObjDetailsList>
	//   44   95:aload           4
	//   45   97:invokeinterface #261 <Method boolean List.remove(Object)>
	//   46  102:pop             
		if(mObjDetailsList.isEmpty())
	//*  47  103:aload_0         
	//*  48  104:getfield        #82  <Field List mObjDetailsList>
	//*  49  107:invokeinterface #264 <Method boolean List.isEmpty()>
	//*  50  112:iconst_1        
	//*  51  113:icmpne          121
			dropServiceConnection();
	//   52  116:aload_0         
	//   53  117:invokespecial   #266 <Method boolean dropServiceConnection()>
	//   54  120:pop             
		return true;
	//   55  121:iconst_1        
	//   56  122:ireturn         
	}

	public static final int DEVICE_TYPE_PLATFORM_DEVICE = 106;
	public static final int DEVICE_TYPE_PLATFORM_FINDER = 105;
	private static int SERVICE_CONNECTION_ESTABLISHED = 2;
	private static int SERVICE_CONNECTION_LOST = 0;
	private static int SERVICE_CONNECTION_REQUESTED = 1;
	private static final String TAG = ((Class) (com/samsung/android/sdk/health/sensor/ShealthPlatformBinderFactory)).getSimpleName();
	private static ShealthPlatformBinderFactory sSHealthServiceConnectionFactory = null;
	private Handler mCallBackHandler;
	private Context mContext;
	private List mObjDetailsList;
	private _PlatformSensorService mService;
	private ServiceConnection mServiceConnection;
	private int mServiceConnectionState;

	static 
	{
	//    0    0:ldc1            #2   <Class ShealthPlatformBinderFactory>
	//    1    2:invokevirtual   #45  <Method String Class.getSimpleName()>
	//    2    5:putstatic       #47  <Field String TAG>
	//    3    8:aconst_null     
	//    4    9:putstatic       #49  <Field ShealthPlatformBinderFactory sSHealthServiceConnectionFactory>
	//    5   12:iconst_0        
	//    6   13:putstatic       #51  <Field int SERVICE_CONNECTION_LOST>
	//    7   16:iconst_1        
	//    8   17:putstatic       #53  <Field int SERVICE_CONNECTION_REQUESTED>
	//    9   20:iconst_2        
	//   10   21:putstatic       #55  <Field int SERVICE_CONNECTION_ESTABLISHED>
	//*  11   24:return          
	}


/*
	static String access$000()
	{
		return TAG;
	//    0    0:getstatic       #47  <Field String TAG>
	//    1    3:areturn         
	}

*/


/*
	static boolean access$100(ShealthPlatformBinderFactory shealthplatformbinderfactory, boolean flag, int i)
	{
		return shealthplatformbinderfactory.NotifyServiceConnectionStatus(flag, i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #146 <Method boolean NotifyServiceConnectionStatus(boolean, int)>
	//    4    6:ireturn         
	}

*/


/*
	static int access$200(ShealthPlatformBinderFactory shealthplatformbinderfactory)
	{
		return shealthplatformbinderfactory.mServiceConnectionState;
	//    0    0:aload_0         
	//    1    1:getfield        #64  <Field int mServiceConnectionState>
	//    2    4:ireturn         
	}

*/


/*
	static int access$202(ShealthPlatformBinderFactory shealthplatformbinderfactory, int i)
	{
		shealthplatformbinderfactory.mServiceConnectionState = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #64  <Field int mServiceConnectionState>
		return i;
	//    3    5:iload_1         
	//    4    6:ireturn         
	}

*/


/*
	static int access$300()
	{
		return SERVICE_CONNECTION_LOST;
	//    0    0:getstatic       #51  <Field int SERVICE_CONNECTION_LOST>
	//    1    3:ireturn         
	}

*/


/*
	static ShealthPlatformBinderFactory access$400()
	{
		return sSHealthServiceConnectionFactory;
	//    0    0:getstatic       #49  <Field ShealthPlatformBinderFactory sSHealthServiceConnectionFactory>
	//    1    3:areturn         
	}

*/


/*
	static _PlatformSensorService access$502(ShealthPlatformBinderFactory shealthplatformbinderfactory, _PlatformSensorService _pplatformsensorservice)
	{
		shealthplatformbinderfactory.mService = _pplatformsensorservice;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #158 <Field _PlatformSensorService mService>
		return _pplatformsensorservice;
	//    3    5:aload_1         
	//    4    6:areturn         
	}

*/


/*
	static int access$600()
	{
		return SERVICE_CONNECTION_REQUESTED;
	//    0    0:getstatic       #53  <Field int SERVICE_CONNECTION_REQUESTED>
	//    1    3:ireturn         
	}

*/


/*
	static int access$700()
	{
		return SERVICE_CONNECTION_ESTABLISHED;
	//    0    0:getstatic       #55  <Field int SERVICE_CONNECTION_ESTABLISHED>
	//    1    3:ireturn         
	}

*/
}

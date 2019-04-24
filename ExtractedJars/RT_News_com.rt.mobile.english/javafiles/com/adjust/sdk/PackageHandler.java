// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.adjust.sdk;

import android.content.Context;
import android.os.*;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

// Referenced classes of package com.adjust.sdk:
//			IPackageHandler, AdjustFactory, ActivityPackage, ActivityKind, 
//			ILogger, Util, IRequestHandler, IActivityHandler

public class PackageHandler extends HandlerThread
	implements IPackageHandler
{
	private static final class InternalHandler extends Handler
	{

		public void handleMessage(Message message)
		{
			super.handleMessage(message);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #36  <Method void Handler.handleMessage(Message)>
			PackageHandler packagehandler = (PackageHandler)packageHandlerReference.get();
		//    3    5:aload_0         
		//    4    6:getfield        #31  <Field WeakReference packageHandlerReference>
		//    5    9:invokevirtual   #40  <Method Object WeakReference.get()>
		//    6   12:checkcast       #6   <Class PackageHandler>
		//    7   15:astore_2        
			if(packagehandler == null)
		//*   8   16:aload_2         
		//*   9   17:ifnonnull       21
				return;
		//   10   20:return          
			switch(message.arg1)
		//*  11   21:aload_1         
		//*  12   22:getfield        #45  <Field int Message.arg1>
			{
		//*  13   25:tableswitch     1 4: default 56
		//		               1 79
		//		               2 67
		//		               3 62
		//		               4 57
			default:
				return;
		//   14   56:return          

			case 4: // '\004'
				packagehandler.sendFirstInternal();
		//   15   57:aload_2         
		//   16   58:invokestatic    #49  <Method void PackageHandler.access$200(PackageHandler)>
				return;
		//   17   61:return          

			case 3: // '\003'
				packagehandler.sendNextInternal();
		//   18   62:aload_2         
		//   19   63:invokestatic    #52  <Method void PackageHandler.access$300(PackageHandler)>
				return;
		//   20   66:return          

			case 2: // '\002'
				packagehandler.addInternal((ActivityPackage)message.obj);
		//   21   67:aload_2         
		//   22   68:aload_1         
		//   23   69:getfield        #56  <Field Object Message.obj>
		//   24   72:checkcast       #58  <Class ActivityPackage>
		//   25   75:invokestatic    #62  <Method void PackageHandler.access$100(PackageHandler, ActivityPackage)>
				return;
		//   26   78:return          

			case 1: // '\001'
				packagehandler.initInternal();
		//   27   79:aload_2         
		//   28   80:invokestatic    #65  <Method void PackageHandler.access$000(PackageHandler)>
				return;
		//   29   83:return          
			}
		}

		private static final int ADD = 2;
		private static final int INIT = 1;
		private static final int SEND_FIRST = 4;
		private static final int SEND_NEXT = 3;
		private final WeakReference packageHandlerReference;

		protected InternalHandler(Looper looper, PackageHandler packagehandler)
		{
			super(looper);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #24  <Method void Handler(Looper)>
			packageHandlerReference = new WeakReference(((Object) (packagehandler)));
		//    3    5:aload_0         
		//    4    6:new             #26  <Class WeakReference>
		//    5    9:dup             
		//    6   10:aload_2         
		//    7   11:invokespecial   #29  <Method void WeakReference(Object)>
		//    8   14:putfield        #31  <Field WeakReference packageHandlerReference>
		//    9   17:return          
		}
	}


	public PackageHandler(IActivityHandler iactivityhandler, Context context1, boolean flag)
	{
		super("Adjust", 1);
	//    0    0:aload_0         
	//    1    1:ldc1            #37  <String "Adjust">
	//    2    3:iconst_1        
	//    3    4:invokespecial   #40  <Method void HandlerThread(String, int)>
		setDaemon(true);
	//    4    7:aload_0         
	//    5    8:iconst_1        
	//    6    9:invokevirtual   #44  <Method void setDaemon(boolean)>
		start();
	//    7   12:aload_0         
	//    8   13:invokevirtual   #48  <Method void start()>
	//    9   16:aload_0         
	//   10   17:new             #8   <Class PackageHandler$InternalHandler>
	//   11   20:dup             
	//   12   21:aload_0         
	//   13   22:invokevirtual   #52  <Method Looper getLooper()>
	//   14   25:aload_0         
	//   15   26:invokespecial   #55  <Method void PackageHandler$InternalHandler(Looper, PackageHandler)>
	//   16   29:putfield        #57  <Field PackageHandler$InternalHandler internalHandler>
		logger = AdjustFactory.getLogger();
	//   17   32:aload_0         
	//   18   33:invokestatic    #63  <Method ILogger AdjustFactory.getLogger()>
	//   19   36:putfield        #65  <Field ILogger logger>
		init(iactivityhandler, context1, flag);
	//   20   39:aload_0         
	//   21   40:aload_1         
	//   22   41:aload_2         
	//   23   42:iload_3         
	//   24   43:invokevirtual   #68  <Method void init(IActivityHandler, Context, boolean)>
		iactivityhandler = ((IActivityHandler) (Message.obtain()));
	//   25   46:invokestatic    #74  <Method Message Message.obtain()>
	//   26   49:astore_1        
		iactivityhandler.arg1 = 1;
	//   27   50:aload_1         
	//   28   51:iconst_1        
	//   29   52:putfield        #78  <Field int Message.arg1>
		internalHandler.sendMessage(((Message) (iactivityhandler)));
	//   30   55:aload_0         
	//   31   56:getfield        #57  <Field PackageHandler$InternalHandler internalHandler>
	//   32   59:aload_1         
	//   33   60:invokevirtual   #82  <Method boolean PackageHandler$InternalHandler.sendMessage(Message)>
	//   34   63:pop             
	//   35   64:return          
	}

	private void addInternal(ActivityPackage activitypackage)
	{
		if(activitypackage.getActivityKind().equals(((Object) (ActivityKind.CLICK))) && !packageQueue.isEmpty())
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #108 <Method ActivityKind ActivityPackage.getActivityKind()>
	//*   2    4:getstatic       #114 <Field ActivityKind ActivityKind.CLICK>
	//*   3    7:invokevirtual   #118 <Method boolean ActivityKind.equals(Object)>
	//*   4   10:ifeq            39
	//*   5   13:aload_0         
	//*   6   14:getfield        #120 <Field List packageQueue>
	//*   7   17:invokeinterface #126 <Method boolean List.isEmpty()>
	//*   8   22:ifne            39
			packageQueue.add(1, ((Object) (activitypackage)));
	//    9   25:aload_0         
	//   10   26:getfield        #120 <Field List packageQueue>
	//   11   29:iconst_1        
	//   12   30:aload_1         
	//   13   31:invokeinterface #130 <Method void List.add(int, Object)>
		else
	//*  14   36:goto            50
			packageQueue.add(((Object) (activitypackage)));
	//   15   39:aload_0         
	//   16   40:getfield        #120 <Field List packageQueue>
	//   17   43:aload_1         
	//   18   44:invokeinterface #132 <Method boolean List.add(Object)>
	//   19   49:pop             
		logger.debug("Added package %d (%s)", new Object[] {
			Integer.valueOf(packageQueue.size()), activitypackage
		});
	//   20   50:aload_0         
	//   21   51:getfield        #65  <Field ILogger logger>
	//   22   54:ldc1            #134 <String "Added package %d (%s)">
	//   23   56:iconst_2        
	//   24   57:anewarray       Object[]
	//   25   60:dup             
	//   26   61:iconst_0        
	//   27   62:aload_0         
	//   28   63:getfield        #120 <Field List packageQueue>
	//   29   66:invokeinterface #140 <Method int List.size()>
	//   30   71:invokestatic    #146 <Method Integer Integer.valueOf(int)>
	//   31   74:aastore         
	//   32   75:dup             
	//   33   76:iconst_1        
	//   34   77:aload_1         
	//   35   78:aastore         
	//   36   79:invokeinterface #152 <Method void ILogger.debug(String, Object[])>
		logger.verbose("%s", new Object[] {
			activitypackage.getExtendedString()
		});
	//   37   84:aload_0         
	//   38   85:getfield        #65  <Field ILogger logger>
	//   39   88:ldc1            #154 <String "%s">
	//   40   90:iconst_1        
	//   41   91:anewarray       Object[]
	//   42   94:dup             
	//   43   95:iconst_0        
	//   44   96:aload_1         
	//   45   97:invokevirtual   #158 <Method String ActivityPackage.getExtendedString()>
	//   46  100:aastore         
	//   47  101:invokeinterface #161 <Method void ILogger.verbose(String, Object[])>
		writePackageQueue();
	//   48  106:aload_0         
	//   49  107:invokespecial   #164 <Method void writePackageQueue()>
	//   50  110:return          
	}

	public static Boolean deletePackageQueue(Context context1)
	{
		return Boolean.valueOf(context1.deleteFile("AdjustIoPackageQueue"));
	//    0    0:aload_0         
	//    1    1:ldc1            #13  <String "AdjustIoPackageQueue">
	//    2    3:invokevirtual   #172 <Method boolean Context.deleteFile(String)>
	//    3    6:invokestatic    #177 <Method Boolean Boolean.valueOf(boolean)>
	//    4    9:areturn         
	}

	private void initInternal()
	{
		requestHandler = AdjustFactory.getRequestHandler(((IPackageHandler) (this)));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokestatic    #181 <Method IRequestHandler AdjustFactory.getRequestHandler(IPackageHandler)>
	//    3    5:putfield        #183 <Field IRequestHandler requestHandler>
		isSending = new AtomicBoolean();
	//    4    8:aload_0         
	//    5    9:new             #185 <Class AtomicBoolean>
	//    6   12:dup             
	//    7   13:invokespecial   #187 <Method void AtomicBoolean()>
	//    8   16:putfield        #189 <Field AtomicBoolean isSending>
		readPackageQueue();
	//    9   19:aload_0         
	//   10   20:invokespecial   #192 <Method void readPackageQueue()>
	//   11   23:return          
	}

	private void readPackageQueue()
	{
		try
		{
			packageQueue = (List)Util.readObject(context, "AdjustIoPackageQueue", "Package queue", java/util/List);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #196 <Field Context context>
	//    3    5:ldc1            #13  <String "AdjustIoPackageQueue">
	//    4    7:ldc1            #16  <String "Package queue">
	//    5    9:ldc1            #122 <Class List>
	//    6   11:invokestatic    #202 <Method Object Util.readObject(Context, String, String, Class)>
	//    7   14:checkcast       #122 <Class List>
	//    8   17:putfield        #120 <Field List packageQueue>
		}
	//*   9   20:goto            56
		catch(Exception exception)
	//*  10   23:astore_1        
		{
			logger.error("Failed to read %s file (%s)", new Object[] {
				"Package queue", exception.getMessage()
			});
	//   11   24:aload_0         
	//   12   25:getfield        #65  <Field ILogger logger>
	//   13   28:ldc1            #204 <String "Failed to read %s file (%s)">
	//   14   30:iconst_2        
	//   15   31:anewarray       Object[]
	//   16   34:dup             
	//   17   35:iconst_0        
	//   18   36:ldc1            #16  <String "Package queue">
	//   19   38:aastore         
	//   20   39:dup             
	//   21   40:iconst_1        
	//   22   41:aload_1         
	//   23   42:invokevirtual   #207 <Method String Exception.getMessage()>
	//   24   45:aastore         
	//   25   46:invokeinterface #210 <Method void ILogger.error(String, Object[])>
			packageQueue = null;
	//   26   51:aload_0         
	//   27   52:aconst_null     
	//   28   53:putfield        #120 <Field List packageQueue>
		}
		if(packageQueue != null)
	//*  29   56:aload_0         
	//*  30   57:getfield        #120 <Field List packageQueue>
	//*  31   60:ifnull          94
		{
			logger.debug("Package handler read %d packages", new Object[] {
				Integer.valueOf(packageQueue.size())
			});
	//   32   63:aload_0         
	//   33   64:getfield        #65  <Field ILogger logger>
	//   34   67:ldc1            #212 <String "Package handler read %d packages">
	//   35   69:iconst_1        
	//   36   70:anewarray       Object[]
	//   37   73:dup             
	//   38   74:iconst_0        
	//   39   75:aload_0         
	//   40   76:getfield        #120 <Field List packageQueue>
	//   41   79:invokeinterface #140 <Method int List.size()>
	//   42   84:invokestatic    #146 <Method Integer Integer.valueOf(int)>
	//   43   87:aastore         
	//   44   88:invokeinterface #152 <Method void ILogger.debug(String, Object[])>
			return;
	//   45   93:return          
		} else
		{
			packageQueue = ((List) (new ArrayList()));
	//   46   94:aload_0         
	//   47   95:new             #214 <Class ArrayList>
	//   48   98:dup             
	//   49   99:invokespecial   #215 <Method void ArrayList()>
	//   50  102:putfield        #120 <Field List packageQueue>
			return;
	//   51  105:return          
		}
	}

	private void sendFirstInternal()
	{
		if(packageQueue.isEmpty())
	//*   0    0:aload_0         
	//*   1    1:getfield        #120 <Field List packageQueue>
	//*   2    4:invokeinterface #126 <Method boolean List.isEmpty()>
	//*   3    9:ifeq            13
			return;
	//    4   12:return          
		if(paused)
	//*   5   13:aload_0         
	//*   6   14:getfield        #217 <Field boolean paused>
	//*   7   17:ifeq            36
		{
			logger.debug("Package handler is paused", new Object[0]);
	//    8   20:aload_0         
	//    9   21:getfield        #65  <Field ILogger logger>
	//   10   24:ldc1            #219 <String "Package handler is paused">
	//   11   26:iconst_0        
	//   12   27:anewarray       Object[]
	//   13   30:invokeinterface #152 <Method void ILogger.debug(String, Object[])>
			return;
	//   14   35:return          
		}
		if(isSending.getAndSet(true))
	//*  15   36:aload_0         
	//*  16   37:getfield        #189 <Field AtomicBoolean isSending>
	//*  17   40:iconst_1        
	//*  18   41:invokevirtual   #223 <Method boolean AtomicBoolean.getAndSet(boolean)>
	//*  19   44:ifeq            63
		{
			logger.verbose("Package handler is already sending", new Object[0]);
	//   20   47:aload_0         
	//   21   48:getfield        #65  <Field ILogger logger>
	//   22   51:ldc1            #225 <String "Package handler is already sending">
	//   23   53:iconst_0        
	//   24   54:anewarray       Object[]
	//   25   57:invokeinterface #161 <Method void ILogger.verbose(String, Object[])>
			return;
	//   26   62:return          
		} else
		{
			ActivityPackage activitypackage = (ActivityPackage)packageQueue.get(0);
	//   27   63:aload_0         
	//   28   64:getfield        #120 <Field List packageQueue>
	//   29   67:iconst_0        
	//   30   68:invokeinterface #229 <Method Object List.get(int)>
	//   31   73:checkcast       #104 <Class ActivityPackage>
	//   32   76:astore_1        
			requestHandler.sendPackage(activitypackage);
	//   33   77:aload_0         
	//   34   78:getfield        #183 <Field IRequestHandler requestHandler>
	//   35   81:aload_1         
	//   36   82:invokeinterface #234 <Method void IRequestHandler.sendPackage(ActivityPackage)>
			return;
	//   37   87:return          
		}
	}

	private void sendNextInternal()
	{
		packageQueue.remove(0);
	//    0    0:aload_0         
	//    1    1:getfield        #120 <Field List packageQueue>
	//    2    4:iconst_0        
	//    3    5:invokeinterface #237 <Method Object List.remove(int)>
	//    4   10:pop             
		writePackageQueue();
	//    5   11:aload_0         
	//    6   12:invokespecial   #164 <Method void writePackageQueue()>
		isSending.set(false);
	//    7   15:aload_0         
	//    8   16:getfield        #189 <Field AtomicBoolean isSending>
	//    9   19:iconst_0        
	//   10   20:invokevirtual   #240 <Method void AtomicBoolean.set(boolean)>
		sendFirstInternal();
	//   11   23:aload_0         
	//   12   24:invokespecial   #98  <Method void sendFirstInternal()>
	//   13   27:return          
	}

	private void writePackageQueue()
	{
		Util.writeObject(((Object) (packageQueue)), context, "AdjustIoPackageQueue", "Package queue");
	//    0    0:aload_0         
	//    1    1:getfield        #120 <Field List packageQueue>
	//    2    4:aload_0         
	//    3    5:getfield        #196 <Field Context context>
	//    4    8:ldc1            #13  <String "AdjustIoPackageQueue">
	//    5   10:ldc1            #16  <String "Package queue">
	//    6   12:invokestatic    #244 <Method void Util.writeObject(Object, Context, String, String)>
		logger.debug("Package handler wrote %d packages", new Object[] {
			Integer.valueOf(packageQueue.size())
		});
	//    7   15:aload_0         
	//    8   16:getfield        #65  <Field ILogger logger>
	//    9   19:ldc1            #246 <String "Package handler wrote %d packages">
	//   10   21:iconst_1        
	//   11   22:anewarray       Object[]
	//   12   25:dup             
	//   13   26:iconst_0        
	//   14   27:aload_0         
	//   15   28:getfield        #120 <Field List packageQueue>
	//   16   31:invokeinterface #140 <Method int List.size()>
	//   17   36:invokestatic    #146 <Method Integer Integer.valueOf(int)>
	//   18   39:aastore         
	//   19   40:invokeinterface #152 <Method void ILogger.debug(String, Object[])>
	//   20   45:return          
	}

	public void addPackage(ActivityPackage activitypackage)
	{
		Message message = Message.obtain();
	//    0    0:invokestatic    #74  <Method Message Message.obtain()>
	//    1    3:astore_2        
		message.arg1 = 2;
	//    2    4:aload_2         
	//    3    5:iconst_2        
	//    4    6:putfield        #78  <Field int Message.arg1>
		message.obj = ((Object) (activitypackage));
	//    5    9:aload_2         
	//    6   10:aload_1         
	//    7   11:putfield        #251 <Field Object Message.obj>
		internalHandler.sendMessage(message);
	//    8   14:aload_0         
	//    9   15:getfield        #57  <Field PackageHandler$InternalHandler internalHandler>
	//   10   18:aload_2         
	//   11   19:invokevirtual   #82  <Method boolean PackageHandler$InternalHandler.sendMessage(Message)>
	//   12   22:pop             
	//   13   23:return          
	}

	public void closeFirstPackage()
	{
		isSending.set(false);
	//    0    0:aload_0         
	//    1    1:getfield        #189 <Field AtomicBoolean isSending>
	//    2    4:iconst_0        
	//    3    5:invokevirtual   #240 <Method void AtomicBoolean.set(boolean)>
	//    4    8:return          
	}

	public void finishedTrackingActivity(JSONObject jsonobject)
	{
		activityHandler.finishedTrackingActivity(jsonobject);
	//    0    0:aload_0         
	//    1    1:getfield        #256 <Field IActivityHandler activityHandler>
	//    2    4:aload_1         
	//    3    5:invokeinterface #260 <Method void IActivityHandler.finishedTrackingActivity(JSONObject)>
	//    4   10:return          
	}

	public void init(IActivityHandler iactivityhandler, Context context1, boolean flag)
	{
		activityHandler = iactivityhandler;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #256 <Field IActivityHandler activityHandler>
		context = context1;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #196 <Field Context context>
		paused = flag;
	//    6   10:aload_0         
	//    7   11:iload_3         
	//    8   12:putfield        #217 <Field boolean paused>
	//    9   15:return          
	}

	public void pauseSending()
	{
		paused = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #217 <Field boolean paused>
	//    3    5:return          
	}

	public void resumeSending()
	{
		paused = false;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #217 <Field boolean paused>
	//    3    5:return          
	}

	public void sendFirstPackage()
	{
		Message message = Message.obtain();
	//    0    0:invokestatic    #74  <Method Message Message.obtain()>
	//    1    3:astore_1        
		message.arg1 = 4;
	//    2    4:aload_1         
	//    3    5:iconst_4        
	//    4    6:putfield        #78  <Field int Message.arg1>
		internalHandler.sendMessage(message);
	//    5    9:aload_0         
	//    6   10:getfield        #57  <Field PackageHandler$InternalHandler internalHandler>
	//    7   13:aload_1         
	//    8   14:invokevirtual   #82  <Method boolean PackageHandler$InternalHandler.sendMessage(Message)>
	//    9   17:pop             
	//   10   18:return          
	}

	public void sendNextPackage()
	{
		Message message = Message.obtain();
	//    0    0:invokestatic    #74  <Method Message Message.obtain()>
	//    1    3:astore_1        
		message.arg1 = 3;
	//    2    4:aload_1         
	//    3    5:iconst_3        
	//    4    6:putfield        #78  <Field int Message.arg1>
		internalHandler.sendMessage(message);
	//    5    9:aload_0         
	//    6   10:getfield        #57  <Field PackageHandler$InternalHandler internalHandler>
	//    7   13:aload_1         
	//    8   14:invokevirtual   #82  <Method boolean PackageHandler$InternalHandler.sendMessage(Message)>
	//    9   17:pop             
	//   10   18:return          
	}

	private static final String PACKAGE_QUEUE_FILENAME = "AdjustIoPackageQueue";
	private static final String PACKAGE_QUEUE_NAME = "Package queue";
	private IActivityHandler activityHandler;
	private Context context;
	private final InternalHandler internalHandler = new InternalHandler(getLooper(), this);
	private AtomicBoolean isSending;
	private ILogger logger;
	private List packageQueue;
	private boolean paused;
	private IRequestHandler requestHandler;


/*
	static void access$000(PackageHandler packagehandler)
	{
		packagehandler.initInternal();
	//    0    0:aload_0         
	//    1    1:invokespecial   #88  <Method void initInternal()>
		return;
	//    2    4:return          
	}

*/


/*
	static void access$100(PackageHandler packagehandler, ActivityPackage activitypackage)
	{
		packagehandler.addInternal(activitypackage);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #94  <Method void addInternal(ActivityPackage)>
		return;
	//    3    5:return          
	}

*/


/*
	static void access$200(PackageHandler packagehandler)
	{
		packagehandler.sendFirstInternal();
	//    0    0:aload_0         
	//    1    1:invokespecial   #98  <Method void sendFirstInternal()>
		return;
	//    2    4:return          
	}

*/


/*
	static void access$300(PackageHandler packagehandler)
	{
		packagehandler.sendNextInternal();
	//    0    0:aload_0         
	//    1    1:invokespecial   #102 <Method void sendNextInternal()>
		return;
	//    2    4:return          
	}

*/
}

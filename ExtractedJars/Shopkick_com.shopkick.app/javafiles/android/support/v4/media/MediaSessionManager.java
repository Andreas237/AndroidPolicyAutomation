// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.media;

import android.content.Context;
import android.util.Log;

// Referenced classes of package android.support.v4.media:
//			MediaSessionManagerImplApi28, MediaSessionManagerImplApi21, MediaSessionManagerImplBase

public final class MediaSessionManager
{
	static interface MediaSessionManagerImpl
	{

		public abstract Context getContext();

		public abstract boolean isTrustedForMediaControl(RemoteUserInfoImpl remoteuserinfoimpl);
	}

	public static final class RemoteUserInfo
	{

		public boolean equals(Object obj)
		{
			if(this == obj)
		//*   0    0:aload_0         
		//*   1    1:aload_1         
		//*   2    2:if_acmpne       7
				return true;
		//    3    5:iconst_1        
		//    4    6:ireturn         
			if(!(obj instanceof RemoteUserInfo))
		//*   5    7:aload_1         
		//*   6    8:instanceof      #2   <Class MediaSessionManager$RemoteUserInfo>
		//*   7   11:ifne            16
				return false;
		//    8   14:iconst_0        
		//    9   15:ireturn         
			else
				return ((Object) (mImpl)).equals(((Object) (((RemoteUserInfo)obj).mImpl)));
		//   10   16:aload_0         
		//   11   17:getfield        #30  <Field MediaSessionManager$RemoteUserInfoImpl mImpl>
		//   12   20:aload_1         
		//   13   21:checkcast       #2   <Class MediaSessionManager$RemoteUserInfo>
		//   14   24:getfield        #30  <Field MediaSessionManager$RemoteUserInfoImpl mImpl>
		//   15   27:invokevirtual   #51  <Method boolean Object.equals(Object)>
		//   16   30:ireturn         
		}

		public String getPackageName()
		{
			return mImpl.getPackageName();
		//    0    0:aload_0         
		//    1    1:getfield        #30  <Field MediaSessionManager$RemoteUserInfoImpl mImpl>
		//    2    4:invokeinterface #57  <Method String MediaSessionManager$RemoteUserInfoImpl.getPackageName()>
		//    3    9:areturn         
		}

		public int getPid()
		{
			return mImpl.getPid();
		//    0    0:aload_0         
		//    1    1:getfield        #30  <Field MediaSessionManager$RemoteUserInfoImpl mImpl>
		//    2    4:invokeinterface #61  <Method int MediaSessionManager$RemoteUserInfoImpl.getPid()>
		//    3    9:ireturn         
		}

		public int getUid()
		{
			return mImpl.getUid();
		//    0    0:aload_0         
		//    1    1:getfield        #30  <Field MediaSessionManager$RemoteUserInfoImpl mImpl>
		//    2    4:invokeinterface #64  <Method int MediaSessionManager$RemoteUserInfoImpl.getUid()>
		//    3    9:ireturn         
		}

		public int hashCode()
		{
			return ((Object) (mImpl)).hashCode();
		//    0    0:aload_0         
		//    1    1:getfield        #30  <Field MediaSessionManager$RemoteUserInfoImpl mImpl>
		//    2    4:invokevirtual   #67  <Method int Object.hashCode()>
		//    3    7:ireturn         
		}

		public static final String LEGACY_CONTROLLER = "android.media.session.MediaController";
		RemoteUserInfoImpl mImpl;

		public RemoteUserInfo(android.media.session.RemoteUserInfo remoteuserinfo)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #24  <Method void Object()>
			mImpl = ((RemoteUserInfoImpl) (new MediaSessionManagerImplApi28.RemoteUserInfoImplApi28(remoteuserinfo)));
		//    2    4:aload_0         
		//    3    5:new             #26  <Class MediaSessionManagerImplApi28$RemoteUserInfoImplApi28>
		//    4    8:dup             
		//    5    9:aload_1         
		//    6   10:invokespecial   #28  <Method void MediaSessionManagerImplApi28$RemoteUserInfoImplApi28(android.media.session.MediaSessionManager$RemoteUserInfo)>
		//    7   13:putfield        #30  <Field MediaSessionManager$RemoteUserInfoImpl mImpl>
		//    8   16:return          
		}

		public RemoteUserInfo(String s, int i, int j)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #24  <Method void Object()>
			if(android.os.Build.VERSION.SDK_INT >= 28)
		//*   2    4:getstatic       #40  <Field int android.os.Build$VERSION.SDK_INT>
		//*   3    7:bipush          28
		//*   4    9:icmplt          27
			{
				mImpl = ((RemoteUserInfoImpl) (new MediaSessionManagerImplApi28.RemoteUserInfoImplApi28(s, i, j)));
		//    5   12:aload_0         
		//    6   13:new             #26  <Class MediaSessionManagerImplApi28$RemoteUserInfoImplApi28>
		//    7   16:dup             
		//    8   17:aload_1         
		//    9   18:iload_2         
		//   10   19:iload_3         
		//   11   20:invokespecial   #42  <Method void MediaSessionManagerImplApi28$RemoteUserInfoImplApi28(String, int, int)>
		//   12   23:putfield        #30  <Field MediaSessionManager$RemoteUserInfoImpl mImpl>
				return;
		//   13   26:return          
			} else
			{
				mImpl = ((RemoteUserInfoImpl) (new MediaSessionManagerImplBase.RemoteUserInfoImplBase(s, i, j)));
		//   14   27:aload_0         
		//   15   28:new             #44  <Class MediaSessionManagerImplBase$RemoteUserInfoImplBase>
		//   16   31:dup             
		//   17   32:aload_1         
		//   18   33:iload_2         
		//   19   34:iload_3         
		//   20   35:invokespecial   #45  <Method void MediaSessionManagerImplBase$RemoteUserInfoImplBase(String, int, int)>
		//   21   38:putfield        #30  <Field MediaSessionManager$RemoteUserInfoImpl mImpl>
				return;
		//   22   41:return          
			}
		}
	}

	static interface RemoteUserInfoImpl
	{

		public abstract String getPackageName();

		public abstract int getPid();

		public abstract int getUid();
	}


	private MediaSessionManager(Context context)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #38  <Method void Object()>
		if(android.os.Build.VERSION.SDK_INT >= 28)
	//*   2    4:getstatic       #48  <Field int android.os.Build$VERSION.SDK_INT>
	//*   3    7:bipush          28
	//*   4    9:icmplt          25
		{
			mImpl = ((MediaSessionManagerImpl) (new MediaSessionManagerImplApi28(context)));
	//    5   12:aload_0         
	//    6   13:new             #50  <Class MediaSessionManagerImplApi28>
	//    7   16:dup             
	//    8   17:aload_1         
	//    9   18:invokespecial   #52  <Method void MediaSessionManagerImplApi28(Context)>
	//   10   21:putfield        #54  <Field MediaSessionManager$MediaSessionManagerImpl mImpl>
			return;
	//   11   24:return          
		}
		if(android.os.Build.VERSION.SDK_INT >= 21)
	//*  12   25:getstatic       #48  <Field int android.os.Build$VERSION.SDK_INT>
	//*  13   28:bipush          21
	//*  14   30:icmplt          46
		{
			mImpl = ((MediaSessionManagerImpl) (new MediaSessionManagerImplApi21(context)));
	//   15   33:aload_0         
	//   16   34:new             #56  <Class MediaSessionManagerImplApi21>
	//   17   37:dup             
	//   18   38:aload_1         
	//   19   39:invokespecial   #57  <Method void MediaSessionManagerImplApi21(Context)>
	//   20   42:putfield        #54  <Field MediaSessionManager$MediaSessionManagerImpl mImpl>
			return;
	//   21   45:return          
		} else
		{
			mImpl = ((MediaSessionManagerImpl) (new MediaSessionManagerImplBase(context)));
	//   22   46:aload_0         
	//   23   47:new             #59  <Class MediaSessionManagerImplBase>
	//   24   50:dup             
	//   25   51:aload_1         
	//   26   52:invokespecial   #60  <Method void MediaSessionManagerImplBase(Context)>
	//   27   55:putfield        #54  <Field MediaSessionManager$MediaSessionManagerImpl mImpl>
			return;
	//   28   58:return          
		}
	}

	public static MediaSessionManager getSessionManager(Context context)
	{
		MediaSessionManager mediasessionmanager;
		mediasessionmanager = sSessionManager;
	//    0    0:getstatic       #65  <Field MediaSessionManager sSessionManager>
	//    1    3:astore_1        
		if(mediasessionmanager != null)
			break MISSING_BLOCK_LABEL_51;
	//    2    4:aload_1         
	//    3    5:ifnonnull       51
		Object obj = sLock;
	//    4    8:getstatic       #40  <Field Object sLock>
	//    5   11:astore_3        
		obj;
	//    6   12:aload_3         
		JVM INSTR monitorenter ;
	//    7   13:monitorenter    
		MediaSessionManager mediasessionmanager1 = sSessionManager;
	//    8   14:getstatic       #65  <Field MediaSessionManager sSessionManager>
	//    9   17:astore_2        
		mediasessionmanager = mediasessionmanager1;
	//   10   18:aload_2         
	//   11   19:astore_1        
		if(mediasessionmanager1 != null)
			break MISSING_BLOCK_LABEL_42;
	//   12   20:aload_2         
	//   13   21:ifnonnull       42
		sSessionManager = new MediaSessionManager(context.getApplicationContext());
	//   14   24:new             #2   <Class MediaSessionManager>
	//   15   27:dup             
	//   16   28:aload_0         
	//   17   29:invokevirtual   #71  <Method Context Context.getApplicationContext()>
	//   18   32:invokespecial   #72  <Method void MediaSessionManager(Context)>
	//   19   35:putstatic       #65  <Field MediaSessionManager sSessionManager>
		mediasessionmanager = sSessionManager;
	//   20   38:getstatic       #65  <Field MediaSessionManager sSessionManager>
	//   21   41:astore_1        
		obj;
	//   22   42:aload_3         
		JVM INSTR monitorexit ;
	//   23   43:monitorexit     
		return mediasessionmanager;
	//   24   44:aload_1         
	//   25   45:areturn         
		context;
	//   26   46:astore_0        
		obj;
	//   27   47:aload_3         
		JVM INSTR monitorexit ;
	//   28   48:monitorexit     
		throw context;
	//   29   49:aload_0         
	//   30   50:athrow          
		return mediasessionmanager;
	//   31   51:aload_1         
	//   32   52:areturn         
	}

	Context getContext()
	{
		return mImpl.getContext();
	//    0    0:aload_0         
	//    1    1:getfield        #54  <Field MediaSessionManager$MediaSessionManagerImpl mImpl>
	//    2    4:invokeinterface #77  <Method Context MediaSessionManager$MediaSessionManagerImpl.getContext()>
	//    3    9:areturn         
	}

	public boolean isTrustedForMediaControl(RemoteUserInfo remoteuserinfo)
	{
		if(remoteuserinfo != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          18
			return mImpl.isTrustedForMediaControl(remoteuserinfo.mImpl);
	//    2    4:aload_0         
	//    3    5:getfield        #54  <Field MediaSessionManager$MediaSessionManagerImpl mImpl>
	//    4    8:aload_1         
	//    5    9:getfield        #82  <Field MediaSessionManager$RemoteUserInfoImpl MediaSessionManager$RemoteUserInfo.mImpl>
	//    6   12:invokeinterface #85  <Method boolean MediaSessionManager$MediaSessionManagerImpl.isTrustedForMediaControl(MediaSessionManager$RemoteUserInfoImpl)>
	//    7   17:ireturn         
		else
			throw new IllegalArgumentException("userInfo should not be null");
	//    8   18:new             #87  <Class IllegalArgumentException>
	//    9   21:dup             
	//   10   22:ldc1            #89  <String "userInfo should not be null">
	//   11   24:invokespecial   #92  <Method void IllegalArgumentException(String)>
	//   12   27:athrow          
	}

	static final boolean DEBUG = Log.isLoggable("MediaSessionManager", 3);
	static final String TAG = "MediaSessionManager";
	private static final Object sLock = new Object();
	private static volatile MediaSessionManager sSessionManager;
	MediaSessionManagerImpl mImpl;

	static 
	{
	//    0    0:ldc1            #19  <String "MediaSessionManager">
	//    1    2:iconst_3        
	//    2    3:invokestatic    #33  <Method boolean Log.isLoggable(String, int)>
	//    3    6:putstatic       #35  <Field boolean DEBUG>
	//    4    9:new             #4   <Class Object>
	//    5   12:dup             
	//    6   13:invokespecial   #38  <Method void Object()>
	//    7   16:putstatic       #40  <Field Object sLock>
	//*   8   19:return          
	}
}

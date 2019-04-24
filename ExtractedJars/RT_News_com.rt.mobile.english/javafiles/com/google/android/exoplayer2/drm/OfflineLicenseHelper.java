// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.drm;

import android.os.*;
import android.util.Pair;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.util.Assertions;
import java.util.HashMap;
import java.util.UUID;

// Referenced classes of package com.google.android.exoplayer2.drm:
//			DefaultDrmSessionManager, DrmSession, UnsupportedDrmException, FrameworkMediaDrm, 
//			HttpMediaDrmCallback, WidevineUtil, KeysExpiredException, ExoMediaDrm, 
//			MediaDrmCallback, DrmInitData, DefaultDrmSessionEventListener

public final class OfflineLicenseHelper
{

	public OfflineLicenseHelper(UUID uuid, ExoMediaDrm exomediadrm, MediaDrmCallback mediadrmcallback, HashMap hashmap)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #21  <Class HandlerThread>
	//    4    8:dup             
	//    5    9:ldc1            #23  <String "OfflineLicenseHelper">
	//    6   11:invokespecial   #26  <Method void HandlerThread(String)>
	//    7   14:putfield        #28  <Field HandlerThread handlerThread>
		handlerThread.start();
	//    8   17:aload_0         
	//    9   18:getfield        #28  <Field HandlerThread handlerThread>
	//   10   21:invokevirtual   #31  <Method void HandlerThread.start()>
	//   11   24:aload_0         
	//   12   25:new             #33  <Class ConditionVariable>
	//   13   28:dup             
	//   14   29:invokespecial   #34  <Method void ConditionVariable()>
	//   15   32:putfield        #36  <Field ConditionVariable conditionVariable>
		DefaultDrmSessionEventListener defaultdrmsessioneventlistener = new DefaultDrmSessionEventListener() {

			public void onDrmKeysLoaded()
			{
				conditionVariable.open();
			//    0    0:aload_0         
			//    1    1:getfield        #16  <Field OfflineLicenseHelper this$0>
			//    2    4:invokestatic    #25  <Method ConditionVariable OfflineLicenseHelper.access$000(OfflineLicenseHelper)>
			//    3    7:invokevirtual   #30  <Method void ConditionVariable.open()>
			//    4   10:return          
			}

			public void onDrmKeysRemoved()
			{
				conditionVariable.open();
			//    0    0:aload_0         
			//    1    1:getfield        #16  <Field OfflineLicenseHelper this$0>
			//    2    4:invokestatic    #25  <Method ConditionVariable OfflineLicenseHelper.access$000(OfflineLicenseHelper)>
			//    3    7:invokevirtual   #30  <Method void ConditionVariable.open()>
			//    4   10:return          
			}

			public void onDrmKeysRestored()
			{
				conditionVariable.open();
			//    0    0:aload_0         
			//    1    1:getfield        #16  <Field OfflineLicenseHelper this$0>
			//    2    4:invokestatic    #25  <Method ConditionVariable OfflineLicenseHelper.access$000(OfflineLicenseHelper)>
			//    3    7:invokevirtual   #30  <Method void ConditionVariable.open()>
			//    4   10:return          
			}

			public void onDrmSessionManagerError(Exception exception)
			{
				conditionVariable.open();
			//    0    0:aload_0         
			//    1    1:getfield        #16  <Field OfflineLicenseHelper this$0>
			//    2    4:invokestatic    #25  <Method ConditionVariable OfflineLicenseHelper.access$000(OfflineLicenseHelper)>
			//    3    7:invokevirtual   #30  <Method void ConditionVariable.open()>
			//    4   10:return          
			}

			final OfflineLicenseHelper this$0;

			
			{
				this$0 = OfflineLicenseHelper.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field OfflineLicenseHelper this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
		}
;
	//   16   35:new             #7   <Class OfflineLicenseHelper$1>
	//   17   38:dup             
	//   18   39:aload_0         
	//   19   40:invokespecial   #39  <Method void OfflineLicenseHelper$1(OfflineLicenseHelper)>
	//   20   43:astore          5
		drmSessionManager = new DefaultDrmSessionManager(uuid, exomediadrm, mediadrmcallback, hashmap);
	//   21   45:aload_0         
	//   22   46:new             #41  <Class DefaultDrmSessionManager>
	//   23   49:dup             
	//   24   50:aload_1         
	//   25   51:aload_2         
	//   26   52:aload_3         
	//   27   53:aload           4
	//   28   55:invokespecial   #43  <Method void DefaultDrmSessionManager(UUID, ExoMediaDrm, MediaDrmCallback, HashMap)>
	//   29   58:putfield        #45  <Field DefaultDrmSessionManager drmSessionManager>
		drmSessionManager.addListener(new Handler(handlerThread.getLooper()), defaultdrmsessioneventlistener);
	//   30   61:aload_0         
	//   31   62:getfield        #45  <Field DefaultDrmSessionManager drmSessionManager>
	//   32   65:new             #47  <Class Handler>
	//   33   68:dup             
	//   34   69:aload_0         
	//   35   70:getfield        #28  <Field HandlerThread handlerThread>
	//   36   73:invokevirtual   #51  <Method android.os.Looper HandlerThread.getLooper()>
	//   37   76:invokespecial   #54  <Method void Handler(android.os.Looper)>
	//   38   79:aload           5
	//   39   81:invokevirtual   #58  <Method void DefaultDrmSessionManager.addListener(Handler, DefaultDrmSessionEventListener)>
	//   40   84:return          
	}

	private byte[] blockingKeyRequest(int i, byte abyte0[], DrmInitData drminitdata)
		throws DrmSession.DrmSessionException
	{
		abyte0 = ((byte []) (openBlockingKeyRequest(i, abyte0, drminitdata)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:invokespecial   #71  <Method DrmSession openBlockingKeyRequest(int, byte[], DrmInitData)>
	//    5    7:astore_2        
		drminitdata = ((DrmInitData) (((DrmSession) (abyte0)).getError()));
	//    6    8:aload_2         
	//    7    9:invokeinterface #77  <Method DrmSession$DrmSessionException DrmSession.getError()>
	//    8   14:astore_3        
		byte abyte1[] = ((DrmSession) (abyte0)).getOfflineLicenseKeySetId();
	//    9   15:aload_2         
	//   10   16:invokeinterface #81  <Method byte[] DrmSession.getOfflineLicenseKeySetId()>
	//   11   21:astore          4
		drmSessionManager.releaseSession(((DrmSession) (abyte0)));
	//   12   23:aload_0         
	//   13   24:getfield        #45  <Field DefaultDrmSessionManager drmSessionManager>
	//   14   27:aload_2         
	//   15   28:invokevirtual   #85  <Method void DefaultDrmSessionManager.releaseSession(DrmSession)>
		if(drminitdata != null)
	//*  16   31:aload_3         
	//*  17   32:ifnull          37
			throw drminitdata;
	//   18   35:aload_3         
	//   19   36:athrow          
		else
			return abyte1;
	//   20   37:aload           4
	//   21   39:areturn         
	}

	public static OfflineLicenseHelper newWidevineInstance(String s, com.google.android.exoplayer2.upstream.HttpDataSource.Factory factory)
		throws UnsupportedDrmException
	{
		return newWidevineInstance(s, false, factory, ((HashMap) (null)));
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:aload_1         
	//    3    3:aconst_null     
	//    4    4:invokestatic    #93  <Method OfflineLicenseHelper newWidevineInstance(String, boolean, com.google.android.exoplayer2.upstream.HttpDataSource$Factory, HashMap)>
	//    5    7:areturn         
	}

	public static OfflineLicenseHelper newWidevineInstance(String s, boolean flag, com.google.android.exoplayer2.upstream.HttpDataSource.Factory factory)
		throws UnsupportedDrmException
	{
		return newWidevineInstance(s, flag, factory, ((HashMap) (null)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:aload_2         
	//    3    3:aconst_null     
	//    4    4:invokestatic    #93  <Method OfflineLicenseHelper newWidevineInstance(String, boolean, com.google.android.exoplayer2.upstream.HttpDataSource$Factory, HashMap)>
	//    5    7:areturn         
	}

	public static OfflineLicenseHelper newWidevineInstance(String s, boolean flag, com.google.android.exoplayer2.upstream.HttpDataSource.Factory factory, HashMap hashmap)
		throws UnsupportedDrmException
	{
		return new OfflineLicenseHelper(C.WIDEVINE_UUID, ((ExoMediaDrm) (FrameworkMediaDrm.newInstance(C.WIDEVINE_UUID))), ((MediaDrmCallback) (new HttpMediaDrmCallback(s, flag, factory))), hashmap);
	//    0    0:new             #2   <Class OfflineLicenseHelper>
	//    1    3:dup             
	//    2    4:getstatic       #102 <Field UUID C.WIDEVINE_UUID>
	//    3    7:getstatic       #102 <Field UUID C.WIDEVINE_UUID>
	//    4   10:invokestatic    #108 <Method FrameworkMediaDrm FrameworkMediaDrm.newInstance(UUID)>
	//    5   13:new             #110 <Class HttpMediaDrmCallback>
	//    6   16:dup             
	//    7   17:aload_0         
	//    8   18:iload_1         
	//    9   19:aload_2         
	//   10   20:invokespecial   #113 <Method void HttpMediaDrmCallback(String, boolean, com.google.android.exoplayer2.upstream.HttpDataSource$Factory)>
	//   11   23:aload_3         
	//   12   24:invokespecial   #114 <Method void OfflineLicenseHelper(UUID, ExoMediaDrm, MediaDrmCallback, HashMap)>
	//   13   27:areturn         
	}

	private DrmSession openBlockingKeyRequest(int i, byte abyte0[], DrmInitData drminitdata)
	{
		drmSessionManager.setMode(i, abyte0);
	//    0    0:aload_0         
	//    1    1:getfield        #45  <Field DefaultDrmSessionManager drmSessionManager>
	//    2    4:iload_1         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #119 <Method void DefaultDrmSessionManager.setMode(int, byte[])>
		conditionVariable.close();
	//    5    9:aload_0         
	//    6   10:getfield        #36  <Field ConditionVariable conditionVariable>
	//    7   13:invokevirtual   #122 <Method void ConditionVariable.close()>
		abyte0 = ((byte []) (drmSessionManager.acquireSession(handlerThread.getLooper(), drminitdata)));
	//    8   16:aload_0         
	//    9   17:getfield        #45  <Field DefaultDrmSessionManager drmSessionManager>
	//   10   20:aload_0         
	//   11   21:getfield        #28  <Field HandlerThread handlerThread>
	//   12   24:invokevirtual   #51  <Method android.os.Looper HandlerThread.getLooper()>
	//   13   27:aload_3         
	//   14   28:invokevirtual   #126 <Method DrmSession DefaultDrmSessionManager.acquireSession(android.os.Looper, DrmInitData)>
	//   15   31:astore_2        
		conditionVariable.block();
	//   16   32:aload_0         
	//   17   33:getfield        #36  <Field ConditionVariable conditionVariable>
	//   18   36:invokevirtual   #129 <Method void ConditionVariable.block()>
		return ((DrmSession) (abyte0));
	//   19   39:aload_2         
	//   20   40:areturn         
	}

	public byte[] downloadLicense(DrmInitData drminitdata)
		throws DrmSession.DrmSessionException
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		boolean flag;
		if(drminitdata != null)
	//*   2    2:aload_1         
	//*   3    3:ifnull          11
			flag = true;
	//    4    6:iconst_1        
	//    5    7:istore_2        
		else
	//*   6    8:goto            13
			flag = false;
	//    7   11:iconst_0        
	//    8   12:istore_2        
		Assertions.checkArgument(flag);
	//    9   13:iload_2         
	//   10   14:invokestatic    #138 <Method void Assertions.checkArgument(boolean)>
		drminitdata = ((DrmInitData) (blockingKeyRequest(2, ((byte []) (null)), drminitdata)));
	//   11   17:aload_0         
	//   12   18:iconst_2        
	//   13   19:aconst_null     
	//   14   20:aload_1         
	//   15   21:invokespecial   #140 <Method byte[] blockingKeyRequest(int, byte[], DrmInitData)>
	//   16   24:astore_1        
		this;
	//   17   25:aload_0         
		JVM INSTR monitorexit ;
	//   18   26:monitorexit     
		return ((byte []) (drminitdata));
	//   19   27:aload_1         
	//   20   28:areturn         
		drminitdata;
	//   21   29:astore_1        
	//*  22   30:aload_0         
		throw drminitdata;
	//   23   31:monitorexit     
	//   24   32:aload_1         
	//   25   33:athrow          
	}

	public Pair getLicenseDurationRemainingSec(byte abyte0[])
		throws DrmSession.DrmSessionException
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		DrmSession.DrmSessionException drmsessionexception;
		Pair pair;
		Assertions.checkNotNull(((Object) (abyte0)));
	//    2    2:aload_1         
	//    3    3:invokestatic    #146 <Method Object Assertions.checkNotNull(Object)>
	//    4    6:pop             
		abyte0 = ((byte []) (openBlockingKeyRequest(1, abyte0, ((DrmInitData) (null)))));
	//    5    7:aload_0         
	//    6    8:iconst_1        
	//    7    9:aload_1         
	//    8   10:aconst_null     
	//    9   11:invokespecial   #71  <Method DrmSession openBlockingKeyRequest(int, byte[], DrmInitData)>
	//   10   14:astore_1        
		drmsessionexception = ((DrmSession) (abyte0)).getError();
	//   11   15:aload_1         
	//   12   16:invokeinterface #77  <Method DrmSession$DrmSessionException DrmSession.getError()>
	//   13   21:astore_2        
		pair = WidevineUtil.getLicenseDurationRemainingSec(((DrmSession) (abyte0)));
	//   14   22:aload_1         
	//   15   23:invokestatic    #151 <Method Pair WidevineUtil.getLicenseDurationRemainingSec(DrmSession)>
	//   16   26:astore_3        
		drmSessionManager.releaseSession(((DrmSession) (abyte0)));
	//   17   27:aload_0         
	//   18   28:getfield        #45  <Field DefaultDrmSessionManager drmSessionManager>
	//   19   31:aload_1         
	//   20   32:invokevirtual   #85  <Method void DefaultDrmSessionManager.releaseSession(DrmSession)>
		if(drmsessionexception == null)
			break MISSING_BLOCK_LABEL_67;
	//   21   35:aload_2         
	//   22   36:ifnull          67
		if(!(drmsessionexception.getCause() instanceof KeysExpiredException))
			break MISSING_BLOCK_LABEL_65;
	//   23   39:aload_2         
	//   24   40:invokevirtual   #155 <Method Throwable DrmSession$DrmSessionException.getCause()>
	//   25   43:instanceof      #157 <Class KeysExpiredException>
	//   26   46:ifeq            65
		abyte0 = ((byte []) (Pair.create(((Object) (Long.valueOf(0L))), ((Object) (Long.valueOf(0L))))));
	//   27   49:lconst_0        
	//   28   50:invokestatic    #163 <Method Long Long.valueOf(long)>
	//   29   53:lconst_0        
	//   30   54:invokestatic    #163 <Method Long Long.valueOf(long)>
	//   31   57:invokestatic    #169 <Method Pair Pair.create(Object, Object)>
	//   32   60:astore_1        
		this;
	//   33   61:aload_0         
		JVM INSTR monitorexit ;
	//   34   62:monitorexit     
		return ((Pair) (abyte0));
	//   35   63:aload_1         
	//   36   64:areturn         
		throw drmsessionexception;
	//   37   65:aload_2         
	//   38   66:athrow          
		this;
	//   39   67:aload_0         
		JVM INSTR monitorexit ;
	//   40   68:monitorexit     
		return pair;
	//   41   69:aload_3         
	//   42   70:areturn         
		abyte0;
	//   43   71:astore_1        
	//*  44   72:aload_0         
		throw abyte0;
	//   45   73:monitorexit     
	//   46   74:aload_1         
	//   47   75:athrow          
	}

	public byte[] getPropertyByteArray(String s)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		s = ((String) (drmSessionManager.getPropertyByteArray(s)));
	//    2    2:aload_0         
	//    3    3:getfield        #45  <Field DefaultDrmSessionManager drmSessionManager>
	//    4    6:aload_1         
	//    5    7:invokevirtual   #174 <Method byte[] DefaultDrmSessionManager.getPropertyByteArray(String)>
	//    6   10:astore_1        
		this;
	//    7   11:aload_0         
		JVM INSTR monitorexit ;
	//    8   12:monitorexit     
		return ((byte []) (s));
	//    9   13:aload_1         
	//   10   14:areturn         
		s;
	//   11   15:astore_1        
	//*  12   16:aload_0         
		throw s;
	//   13   17:monitorexit     
	//   14   18:aload_1         
	//   15   19:athrow          
	}

	public String getPropertyString(String s)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		s = drmSessionManager.getPropertyString(s);
	//    2    2:aload_0         
	//    3    3:getfield        #45  <Field DefaultDrmSessionManager drmSessionManager>
	//    4    6:aload_1         
	//    5    7:invokevirtual   #178 <Method String DefaultDrmSessionManager.getPropertyString(String)>
	//    6   10:astore_1        
		this;
	//    7   11:aload_0         
		JVM INSTR monitorexit ;
	//    8   12:monitorexit     
		return s;
	//    9   13:aload_1         
	//   10   14:areturn         
		s;
	//   11   15:astore_1        
	//*  12   16:aload_0         
		throw s;
	//   13   17:monitorexit     
	//   14   18:aload_1         
	//   15   19:athrow          
	}

	public void release()
	{
		handlerThread.quit();
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field HandlerThread handlerThread>
	//    2    4:invokevirtual   #183 <Method boolean HandlerThread.quit()>
	//    3    7:pop             
	//    4    8:return          
	}

	public void releaseLicense(byte abyte0[])
		throws DrmSession.DrmSessionException
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		Assertions.checkNotNull(((Object) (abyte0)));
	//    2    2:aload_1         
	//    3    3:invokestatic    #146 <Method Object Assertions.checkNotNull(Object)>
	//    4    6:pop             
		blockingKeyRequest(3, abyte0, ((DrmInitData) (null)));
	//    5    7:aload_0         
	//    6    8:iconst_3        
	//    7    9:aload_1         
	//    8   10:aconst_null     
	//    9   11:invokespecial   #140 <Method byte[] blockingKeyRequest(int, byte[], DrmInitData)>
	//   10   14:pop             
		this;
	//   11   15:aload_0         
		JVM INSTR monitorexit ;
	//   12   16:monitorexit     
		return;
	//   13   17:return          
		abyte0;
	//   14   18:astore_1        
	//*  15   19:aload_0         
		throw abyte0;
	//   16   20:monitorexit     
	//   17   21:aload_1         
	//   18   22:athrow          
	}

	public byte[] renewLicense(byte abyte0[])
		throws DrmSession.DrmSessionException
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		Assertions.checkNotNull(((Object) (abyte0)));
	//    2    2:aload_1         
	//    3    3:invokestatic    #146 <Method Object Assertions.checkNotNull(Object)>
	//    4    6:pop             
		abyte0 = blockingKeyRequest(2, abyte0, ((DrmInitData) (null)));
	//    5    7:aload_0         
	//    6    8:iconst_2        
	//    7    9:aload_1         
	//    8   10:aconst_null     
	//    9   11:invokespecial   #140 <Method byte[] blockingKeyRequest(int, byte[], DrmInitData)>
	//   10   14:astore_1        
		this;
	//   11   15:aload_0         
		JVM INSTR monitorexit ;
	//   12   16:monitorexit     
		return abyte0;
	//   13   17:aload_1         
	//   14   18:areturn         
		abyte0;
	//   15   19:astore_1        
	//*  16   20:aload_0         
		throw abyte0;
	//   17   21:monitorexit     
	//   18   22:aload_1         
	//   19   23:athrow          
	}

	public void setPropertyByteArray(String s, byte abyte0[])
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		drmSessionManager.setPropertyByteArray(s, abyte0);
	//    2    2:aload_0         
	//    3    3:getfield        #45  <Field DefaultDrmSessionManager drmSessionManager>
	//    4    6:aload_1         
	//    5    7:aload_2         
	//    6    8:invokevirtual   #191 <Method void DefaultDrmSessionManager.setPropertyByteArray(String, byte[])>
		this;
	//    7   11:aload_0         
		JVM INSTR monitorexit ;
	//    8   12:monitorexit     
		return;
	//    9   13:return          
		s;
	//   10   14:astore_1        
	//*  11   15:aload_0         
		throw s;
	//   12   16:monitorexit     
	//   13   17:aload_1         
	//   14   18:athrow          
	}

	public void setPropertyString(String s, String s1)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		drmSessionManager.setPropertyString(s, s1);
	//    2    2:aload_0         
	//    3    3:getfield        #45  <Field DefaultDrmSessionManager drmSessionManager>
	//    4    6:aload_1         
	//    5    7:aload_2         
	//    6    8:invokevirtual   #195 <Method void DefaultDrmSessionManager.setPropertyString(String, String)>
		this;
	//    7   11:aload_0         
		JVM INSTR monitorexit ;
	//    8   12:monitorexit     
		return;
	//    9   13:return          
		s;
	//   10   14:astore_1        
	//*  11   15:aload_0         
		throw s;
	//   12   16:monitorexit     
	//   13   17:aload_1         
	//   14   18:athrow          
	}

	private final ConditionVariable conditionVariable = new ConditionVariable();
	private final DefaultDrmSessionManager drmSessionManager;
	private final HandlerThread handlerThread = new HandlerThread("OfflineLicenseHelper");


/*
	static ConditionVariable access$000(OfflineLicenseHelper offlinelicensehelper)
	{
		return offlinelicensehelper.conditionVariable;
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field ConditionVariable conditionVariable>
	//    2    4:areturn         
	}

*/
}

// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.firebase.client;

import com.firebase.client.core.AuthExpirationBehavior;
import com.firebase.client.core.Context;
import java.util.List;

// Referenced classes of package com.firebase.client:
//			FirebaseException, CredentialStore, EventTarget, Logger, 
//			RunLoop

public class Config extends Context
{

	public Config()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void Context()>
	//    2    4:return          
	}

	private void setAuthExpirationBehavior(AuthExpirationBehavior authexpirationbehavior)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		assertUnfrozen();
	//    2    2:aload_0         
	//    3    3:invokevirtual   #14  <Method void assertUnfrozen()>
		authExpirationBehavior = authexpirationbehavior;
	//    4    6:aload_0         
	//    5    7:aload_1         
	//    6    8:putfield        #18  <Field AuthExpirationBehavior authExpirationBehavior>
		this;
	//    7   11:aload_0         
		JVM INSTR monitorexit ;
	//    8   12:monitorexit     
		return;
	//    9   13:return          
		authexpirationbehavior;
	//   10   14:astore_1        
	//*  11   15:aload_0         
		throw authexpirationbehavior;
	//   12   16:monitorexit     
	//   13   17:aload_1         
	//   14   18:athrow          
	}

	public void enablePersistence()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		assertUnfrozen();
	//    2    2:aload_0         
	//    3    3:invokevirtual   #14  <Method void assertUnfrozen()>
		setPersistenceEnabled(true);
	//    4    6:aload_0         
	//    5    7:iconst_1        
	//    6    8:invokevirtual   #23  <Method void setPersistenceEnabled(boolean)>
		this;
	//    7   11:aload_0         
		JVM INSTR monitorexit ;
	//    8   12:monitorexit     
		return;
	//    9   13:return          
		Exception exception;
		exception;
	//   10   14:astore_1        
	//*  11   15:aload_0         
		throw exception;
	//   12   16:monitorexit     
	//   13   17:aload_1         
	//   14   18:athrow          
	}

	public void setAuthenticationServer(String s)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		assertUnfrozen();
	//    2    2:aload_0         
	//    3    3:invokevirtual   #14  <Method void assertUnfrozen()>
		authenticationServer = s;
	//    4    6:aload_0         
	//    5    7:aload_1         
	//    6    8:putfield        #29  <Field String authenticationServer>
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

	void setCredentialStore(CredentialStore credentialstore)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		assertUnfrozen();
	//    2    2:aload_0         
	//    3    3:invokevirtual   #14  <Method void assertUnfrozen()>
		credentialStore = credentialstore;
	//    4    6:aload_0         
	//    5    7:aload_1         
	//    6    8:putfield        #35  <Field CredentialStore credentialStore>
		this;
	//    7   11:aload_0         
		JVM INSTR monitorexit ;
	//    8   12:monitorexit     
		return;
	//    9   13:return          
		credentialstore;
	//   10   14:astore_1        
	//*  11   15:aload_0         
		throw credentialstore;
	//   12   16:monitorexit     
	//   13   17:aload_1         
	//   14   18:athrow          
	}

	public void setDebugLogComponents(List list)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		assertUnfrozen();
	//    2    2:aload_0         
	//    3    3:invokevirtual   #14  <Method void assertUnfrozen()>
		setLogLevel(Logger.Level.DEBUG);
	//    4    6:aload_0         
	//    5    7:getstatic       #43  <Field Logger$Level Logger$Level.DEBUG>
	//    6   10:invokevirtual   #47  <Method void setLogLevel(Logger$Level)>
		loggedComponents = list;
	//    7   13:aload_0         
	//    8   14:aload_1         
	//    9   15:putfield        #51  <Field List loggedComponents>
		this;
	//   10   18:aload_0         
		JVM INSTR monitorexit ;
	//   11   19:monitorexit     
		return;
	//   12   20:return          
		list;
	//   13   21:astore_1        
	//*  14   22:aload_0         
		throw list;
	//   15   23:monitorexit     
	//   16   24:aload_1         
	//   17   25:athrow          
	}

	public void setEventTarget(EventTarget eventtarget)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		assertUnfrozen();
	//    2    2:aload_0         
	//    3    3:invokevirtual   #14  <Method void assertUnfrozen()>
		eventTarget = eventtarget;
	//    4    6:aload_0         
	//    5    7:aload_1         
	//    6    8:putfield        #59  <Field EventTarget eventTarget>
		this;
	//    7   11:aload_0         
		JVM INSTR monitorexit ;
	//    8   12:monitorexit     
		return;
	//    9   13:return          
		eventtarget;
	//   10   14:astore_1        
	//*  11   15:aload_0         
		throw eventtarget;
	//   12   16:monitorexit     
	//   13   17:aload_1         
	//   14   18:athrow          
	}

	public void setLogLevel(Logger.Level level)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		assertUnfrozen();
	//    2    2:aload_0         
	//    3    3:invokevirtual   #14  <Method void assertUnfrozen()>
		logLevel = level;
	//    4    6:aload_0         
	//    5    7:aload_1         
	//    6    8:putfield        #62  <Field Logger$Level logLevel>
		this;
	//    7   11:aload_0         
		JVM INSTR monitorexit ;
	//    8   12:monitorexit     
		return;
	//    9   13:return          
		level;
	//   10   14:astore_1        
	//*  11   15:aload_0         
		throw level;
	//   12   16:monitorexit     
	//   13   17:aload_1         
	//   14   18:athrow          
	}

	public void setLogger(Logger logger)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		assertUnfrozen();
	//    2    2:aload_0         
	//    3    3:invokevirtual   #14  <Method void assertUnfrozen()>
		this.logger = logger;
	//    4    6:aload_0         
	//    5    7:aload_1         
	//    6    8:putfield        #68  <Field Logger logger>
		this;
	//    7   11:aload_0         
		JVM INSTR monitorexit ;
	//    8   12:monitorexit     
		return;
	//    9   13:return          
		logger;
	//   10   14:astore_1        
	//*  11   15:aload_0         
		throw logger;
	//   12   16:monitorexit     
	//   13   17:aload_1         
	//   14   18:athrow          
	}

	public void setPersistenceCacheSizeBytes(long l)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		assertUnfrozen();
	//    2    2:aload_0         
	//    3    3:invokevirtual   #14  <Method void assertUnfrozen()>
		if(l < 0x100000L)
			break MISSING_BLOCK_LABEL_40;
	//    4    6:lload_1         
	//    5    7:ldc2w           #71  <Long 0x100000L>
	//    6   10:lcmp            
	//    7   11:iflt            40
		if(l > 0x6400000L)
			break MISSING_BLOCK_LABEL_30;
	//    8   14:lload_1         
	//    9   15:ldc2w           #73  <Long 0x6400000L>
	//   10   18:lcmp            
	//   11   19:ifgt            30
		cacheSize = l;
	//   12   22:aload_0         
	//   13   23:lload_1         
	//   14   24:putfield        #78  <Field long cacheSize>
		this;
	//   15   27:aload_0         
		JVM INSTR monitorexit ;
	//   16   28:monitorexit     
		return;
	//   17   29:return          
		throw new FirebaseException("Firebase currently doesn't support a cache size larger than 100MB");
	//   18   30:new             #80  <Class FirebaseException>
	//   19   33:dup             
	//   20   34:ldc1            #82  <String "Firebase currently doesn't support a cache size larger than 100MB">
	//   21   36:invokespecial   #84  <Method void FirebaseException(String)>
	//   22   39:athrow          
		throw new FirebaseException("The minimum cache size must be at least 1MB");
	//   23   40:new             #80  <Class FirebaseException>
	//   24   43:dup             
	//   25   44:ldc1            #86  <String "The minimum cache size must be at least 1MB">
	//   26   46:invokespecial   #84  <Method void FirebaseException(String)>
	//   27   49:athrow          
		Exception exception;
		exception;
	//   28   50:astore_3        
		this;
	//   29   51:aload_0         
		JVM INSTR monitorexit ;
	//   30   52:monitorexit     
		throw exception;
	//   31   53:aload_3         
	//   32   54:athrow          
	}

	public void setPersistenceEnabled(boolean flag)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		assertUnfrozen();
	//    2    2:aload_0         
	//    3    3:invokevirtual   #14  <Method void assertUnfrozen()>
		persistenceEnabled = flag;
	//    4    6:aload_0         
	//    5    7:iload_1         
	//    6    8:putfield        #90  <Field boolean persistenceEnabled>
		if(!flag)
			break MISSING_BLOCK_LABEL_25;
	//    7   11:iload_1         
	//    8   12:ifeq            25
		setAuthExpirationBehavior(AuthExpirationBehavior.PAUSE_WRITES_UNTIL_REAUTH);
	//    9   15:aload_0         
	//   10   16:getstatic       #95  <Field AuthExpirationBehavior AuthExpirationBehavior.PAUSE_WRITES_UNTIL_REAUTH>
	//   11   19:invokespecial   #97  <Method void setAuthExpirationBehavior(AuthExpirationBehavior)>
		break MISSING_BLOCK_LABEL_32;
	//   12   22:goto            32
		setAuthExpirationBehavior(AuthExpirationBehavior.DEFAULT);
	//   13   25:aload_0         
	//   14   26:getstatic       #100 <Field AuthExpirationBehavior AuthExpirationBehavior.DEFAULT>
	//   15   29:invokespecial   #97  <Method void setAuthExpirationBehavior(AuthExpirationBehavior)>
		this;
	//   16   32:aload_0         
		JVM INSTR monitorexit ;
	//   17   33:monitorexit     
		return;
	//   18   34:return          
		Exception exception;
		exception;
	//   19   35:astore_2        
	//*  20   36:aload_0         
		throw exception;
	//   21   37:monitorexit     
	//   22   38:aload_2         
	//   23   39:athrow          
	}

	void setRunLoop(RunLoop runloop)
	{
		runLoop = runloop;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #106 <Field RunLoop runLoop>
	//    3    5:return          
	}

	public void setSessionPersistenceKey(String s)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		assertUnfrozen();
	//    2    2:aload_0         
	//    3    3:invokevirtual   #14  <Method void assertUnfrozen()>
		if(s == null)
			break MISSING_BLOCK_LABEL_25;
	//    4    6:aload_1         
	//    5    7:ifnull          25
		if(s.isEmpty())
			break MISSING_BLOCK_LABEL_25;
	//    6   10:aload_1         
	//    7   11:invokevirtual   #113 <Method boolean String.isEmpty()>
	//    8   14:ifne            25
		persistenceKey = s;
	//    9   17:aload_0         
	//   10   18:aload_1         
	//   11   19:putfield        #116 <Field String persistenceKey>
		this;
	//   12   22:aload_0         
		JVM INSTR monitorexit ;
	//   13   23:monitorexit     
		return;
	//   14   24:return          
		throw new IllegalArgumentException("Session identifier is not allowed to be empty or null!");
	//   15   25:new             #118 <Class IllegalArgumentException>
	//   16   28:dup             
	//   17   29:ldc1            #120 <String "Session identifier is not allowed to be empty or null!">
	//   18   31:invokespecial   #121 <Method void IllegalArgumentException(String)>
	//   19   34:athrow          
		s;
	//   20   35:astore_1        
		this;
	//   21   36:aload_0         
		JVM INSTR monitorexit ;
	//   22   37:monitorexit     
		throw s;
	//   23   38:aload_1         
	//   24   39:athrow          
	}
}

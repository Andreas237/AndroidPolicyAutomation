// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.internal;

import android.content.Intent;
import java.util.UUID;

public class AppCall
{

	public AppCall(int i)
	{
		this(i, UUID.randomUUID());
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokestatic    #20  <Method UUID UUID.randomUUID()>
	//    3    5:invokespecial   #23  <Method void AppCall(int, UUID)>
	//    4    8:return          
	}

	public AppCall(int i, UUID uuid)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #27  <Method void Object()>
		callId = uuid;
	//    2    4:aload_0         
	//    3    5:aload_2         
	//    4    6:putfield        #29  <Field UUID callId>
		requestCode = i;
	//    5    9:aload_0         
	//    6   10:iload_1         
	//    7   11:putfield        #31  <Field int requestCode>
	//    8   14:return          
	}

	public static AppCall finishPendingCall(UUID uuid, int i)
	{
		com/facebook/internal/AppCall;
	//    0    0:ldc1            #2   <Class AppCall>
		JVM INSTR monitorenter ;
	//    1    2:monitorenter    
		AppCall appcall = getCurrentPendingCall();
	//    2    3:invokestatic    #37  <Method AppCall getCurrentPendingCall()>
	//    3    6:astore_2        
		if(appcall == null)
			break MISSING_BLOCK_LABEL_43;
	//    4    7:aload_2         
	//    5    8:ifnull          43
		if(!appcall.getCallId().equals(((Object) (uuid))) || appcall.getRequestCode() != i)
	//*   6   11:aload_2         
	//*   7   12:invokevirtual   #40  <Method UUID getCallId()>
	//*   8   15:aload_0         
	//*   9   16:invokevirtual   #44  <Method boolean UUID.equals(Object)>
	//*  10   19:ifeq            43
	//*  11   22:aload_2         
	//*  12   23:invokevirtual   #48  <Method int getRequestCode()>
	//*  13   26:iload_1         
	//*  14   27:icmpeq          33
			break MISSING_BLOCK_LABEL_43;
	//   15   30:goto            43
		setCurrentPendingCall(((AppCall) (null)));
	//   16   33:aconst_null     
	//   17   34:invokestatic    #52  <Method boolean setCurrentPendingCall(AppCall)>
	//   18   37:pop             
		com/facebook/internal/AppCall;
	//   19   38:ldc1            #2   <Class AppCall>
		JVM INSTR monitorexit ;
	//   20   40:monitorexit     
		return appcall;
	//   21   41:aload_2         
	//   22   42:areturn         
		com/facebook/internal/AppCall;
	//   23   43:ldc1            #2   <Class AppCall>
		JVM INSTR monitorexit ;
	//   24   45:monitorexit     
		return null;
	//   25   46:aconst_null     
	//   26   47:areturn         
		uuid;
	//   27   48:astore_0        
	//*  28   49:ldc1            #2   <Class AppCall>
		throw uuid;
	//   29   51:monitorexit     
	//   30   52:aload_0         
	//   31   53:athrow          
	}

	public static AppCall getCurrentPendingCall()
	{
		return currentPendingCall;
	//    0    0:getstatic       #54  <Field AppCall currentPendingCall>
	//    1    3:areturn         
	}

	private static boolean setCurrentPendingCall(AppCall appcall)
	{
		com/facebook/internal/AppCall;
	//    0    0:ldc1            #2   <Class AppCall>
		JVM INSTR monitorenter ;
	//    1    2:monitorenter    
		AppCall appcall1;
		appcall1 = getCurrentPendingCall();
	//    2    3:invokestatic    #37  <Method AppCall getCurrentPendingCall()>
	//    3    6:astore_2        
		currentPendingCall = appcall;
	//    4    7:aload_0         
	//    5    8:putstatic       #54  <Field AppCall currentPendingCall>
		boolean flag;
		if(appcall1 != null)
	//*   6   11:aload_2         
	//*   7   12:ifnull          20
			flag = true;
	//    8   15:iconst_1        
	//    9   16:istore_1        
		else
	//*  10   17:goto            22
			flag = false;
	//   11   20:iconst_0        
	//   12   21:istore_1        
		com/facebook/internal/AppCall;
	//   13   22:ldc1            #2   <Class AppCall>
		JVM INSTR monitorexit ;
	//   14   24:monitorexit     
		return flag;
	//   15   25:iload_1         
	//   16   26:ireturn         
		appcall;
	//   17   27:astore_0        
	//*  18   28:ldc1            #2   <Class AppCall>
		throw appcall;
	//   19   30:monitorexit     
	//   20   31:aload_0         
	//   21   32:athrow          
	}

	public UUID getCallId()
	{
		return callId;
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field UUID callId>
	//    2    4:areturn         
	}

	public int getRequestCode()
	{
		return requestCode;
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field int requestCode>
	//    2    4:ireturn         
	}

	public Intent getRequestIntent()
	{
		return requestIntent;
	//    0    0:aload_0         
	//    1    1:getfield        #58  <Field Intent requestIntent>
	//    2    4:areturn         
	}

	public boolean setPending()
	{
		return setCurrentPendingCall(this);
	//    0    0:aload_0         
	//    1    1:invokestatic    #52  <Method boolean setCurrentPendingCall(AppCall)>
	//    2    4:ireturn         
	}

	public void setRequestIntent(Intent intent)
	{
		requestIntent = intent;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #58  <Field Intent requestIntent>
	//    3    5:return          
	}

	private static AppCall currentPendingCall;
	private UUID callId;
	private int requestCode;
	private Intent requestIntent;
}

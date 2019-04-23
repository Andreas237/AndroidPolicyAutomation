// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.firebase.jobdispatcher;

import android.content.*;
import android.os.*;
import android.util.Log;
import java.util.*;

// Referenced classes of package com.firebase.jobdispatcher:
//			GooglePlayReceiver, JobCoder, IRemoteJobService, JobParameters, 
//			JobInvocation, IJobCallback

class JobServiceConnection
	implements ServiceConnection
{

	JobServiceConnection(IJobCallback ijobcallback, Context context1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #23  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #25  <Class HashMap>
	//    4    8:dup             
	//    5    9:invokespecial   #26  <Method void HashMap()>
	//    6   12:putfield        #28  <Field Map jobStatuses>
		wasUnbound = false;
	//    7   15:aload_0         
	//    8   16:iconst_0        
	//    9   17:putfield        #30  <Field boolean wasUnbound>
		callback = ijobcallback;
	//   10   20:aload_0         
	//   11   21:aload_1         
	//   12   22:putfield        #32  <Field IJobCallback callback>
		context = context1;
	//   13   25:aload_0         
	//   14   26:aload_2         
	//   15   27:putfield        #34  <Field Context context>
	//   16   30:return          
	}

	private static Bundle encodeJob(JobParameters jobparameters)
	{
		return GooglePlayReceiver.getJobCoder().encode(jobparameters, new Bundle());
	//    0    0:invokestatic    #43  <Method JobCoder GooglePlayReceiver.getJobCoder()>
	//    1    3:aload_0         
	//    2    4:new             #45  <Class Bundle>
	//    3    7:dup             
	//    4    8:invokespecial   #46  <Method void Bundle()>
	//    5   11:invokevirtual   #52  <Method Bundle JobCoder.encode(JobParameters, Bundle)>
	//    6   14:areturn         
	}

	private void stopJob(boolean flag, JobInvocation jobinvocation)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		try
		{
			binder.stop(encodeJob(((JobParameters) (jobinvocation))), flag);
	//    2    2:aload_0         
	//    3    3:getfield        #58  <Field IRemoteJobService binder>
	//    4    6:aload_2         
	//    5    7:invokestatic    #60  <Method Bundle encodeJob(JobParameters)>
	//    6   10:iload_1         
	//    7   11:invokeinterface #66  <Method void IRemoteJobService.stop(Bundle, boolean)>
			break MISSING_BLOCK_LABEL_37;
	//    8   16:goto            37
		}
	//*   9   19:astore_2        
	//*  10   20:goto            40
		// Misplaced declaration of an exception variable
		catch(JobInvocation jobinvocation) { }
	//   11   23:astore_2        
		break MISSING_BLOCK_LABEL_24;
		jobinvocation;
		break MISSING_BLOCK_LABEL_41;
		Log.e("FJD.ExternalReceiver", "Failed to stop a job", ((Throwable) (jobinvocation)));
	//   12   24:ldc1            #68  <String "FJD.ExternalReceiver">
	//   13   26:ldc1            #70  <String "Failed to stop a job">
	//   14   28:aload_2         
	//   15   29:invokestatic    #76  <Method int Log.e(String, String, Throwable)>
	//   16   32:pop             
		unbind();
	//   17   33:aload_0         
	//   18   34:invokevirtual   #79  <Method void unbind()>
		this;
	//   19   37:aload_0         
		JVM INSTR monitorexit ;
	//   20   38:monitorexit     
		return;
	//   21   39:return          
	//*  22   40:aload_0         
		throw jobinvocation;
	//   23   41:monitorexit     
	//   24   42:aload_2         
	//   25   43:athrow          
	}

	boolean hasJobInvocation(JobInvocation jobinvocation)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		boolean flag = jobStatuses.containsKey(((Object) (jobinvocation)));
	//    2    2:aload_0         
	//    3    3:getfield        #28  <Field Map jobStatuses>
	//    4    6:aload_1         
	//    5    7:invokeinterface #87  <Method boolean Map.containsKey(Object)>
	//    6   12:istore_2        
		this;
	//    7   13:aload_0         
		JVM INSTR monitorexit ;
	//    8   14:monitorexit     
		return flag;
	//    9   15:iload_2         
	//   10   16:ireturn         
		jobinvocation;
	//   11   17:astore_1        
	//*  12   18:aload_0         
		throw jobinvocation;
	//   13   19:monitorexit     
	//   14   20:aload_1         
	//   15   21:athrow          
	}

	boolean isConnected()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		IRemoteJobService iremotejobservice = binder;
	//    2    2:aload_0         
	//    3    3:getfield        #58  <Field IRemoteJobService binder>
	//    4    6:astore_2        
		boolean flag;
		if(iremotejobservice != null)
	//*   5    7:aload_2         
	//*   6    8:ifnull          16
			flag = true;
	//    7   11:iconst_1        
	//    8   12:istore_1        
		else
	//*   9   13:goto            18
			flag = false;
	//   10   16:iconst_0        
	//   11   17:istore_1        
		this;
	//   12   18:aload_0         
		JVM INSTR monitorexit ;
	//   13   19:monitorexit     
		return flag;
	//   14   20:iload_1         
	//   15   21:ireturn         
		Exception exception;
		exception;
	//   16   22:astore_2        
	//*  17   23:aload_0         
		throw exception;
	//   18   24:monitorexit     
	//   19   25:aload_2         
	//   20   26:athrow          
	}

	void onJobFinished(JobInvocation jobinvocation)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		jobStatuses.remove(((Object) (jobinvocation)));
	//    2    2:aload_0         
	//    3    3:getfield        #28  <Field Map jobStatuses>
	//    4    6:aload_1         
	//    5    7:invokeinterface #96  <Method Object Map.remove(Object)>
	//    6   12:pop             
		if(jobStatuses.isEmpty())
	//*   7   13:aload_0         
	//*   8   14:getfield        #28  <Field Map jobStatuses>
	//*   9   17:invokeinterface #99  <Method boolean Map.isEmpty()>
	//*  10   22:ifeq            29
			unbind();
	//   11   25:aload_0         
	//   12   26:invokevirtual   #79  <Method void unbind()>
		this;
	//   13   29:aload_0         
		JVM INSTR monitorexit ;
	//   14   30:monitorexit     
		return;
	//   15   31:return          
		jobinvocation;
	//   16   32:astore_1        
	//*  17   33:aload_0         
		throw jobinvocation;
	//   18   34:monitorexit     
	//   19   35:aload_1         
	//   20   36:athrow          
	}

	public void onServiceConnected(ComponentName componentname, IBinder ibinder)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		if(!wasUnbound())
			break MISSING_BLOCK_LABEL_20;
	//    2    2:aload_0         
	//    3    3:invokevirtual   #103 <Method boolean wasUnbound()>
	//    4    6:ifeq            20
		Log.w("FJD.ExternalReceiver", "Connection have been used already.");
	//    5    9:ldc1            #68  <String "FJD.ExternalReceiver">
	//    6   11:ldc1            #105 <String "Connection have been used already.">
	//    7   13:invokestatic    #109 <Method int Log.w(String, String)>
	//    8   16:pop             
		this;
	//    9   17:aload_0         
		JVM INSTR monitorexit ;
	//   10   18:monitorexit     
		return;
	//   11   19:return          
		Iterator iterator;
		binder = IRemoteJobService.Stub.asInterface(ibinder);
	//   12   20:aload_0         
	//   13   21:aload_2         
	//   14   22:invokestatic    #115 <Method IRemoteJobService IRemoteJobService$Stub.asInterface(IBinder)>
	//   15   25:putfield        #58  <Field IRemoteJobService binder>
		ibinder = ((IBinder) (new HashSet()));
	//   16   28:new             #117 <Class HashSet>
	//   17   31:dup             
	//   18   32:invokespecial   #118 <Method void HashSet()>
	//   19   35:astore_2        
		iterator = jobStatuses.entrySet().iterator();
	//   20   36:aload_0         
	//   21   37:getfield        #28  <Field Map jobStatuses>
	//   22   40:invokeinterface #122 <Method Set Map.entrySet()>
	//   23   45:invokeinterface #128 <Method Iterator Set.iterator()>
	//   24   50:astore          4
_L2:
		boolean flag;
		do
		{
			if(!iterator.hasNext())
				break MISSING_BLOCK_LABEL_180;
	//   25   52:aload           4
	//   26   54:invokeinterface #133 <Method boolean Iterator.hasNext()>
	//   27   59:ifeq            180
			componentname = ((ComponentName) ((java.util.Map.Entry)iterator.next()));
	//   28   62:aload           4
	//   29   64:invokeinterface #137 <Method Object Iterator.next()>
	//   30   69:checkcast       #139 <Class java.util.Map$Entry>
	//   31   72:astore_1        
			flag = Boolean.FALSE.equals(((java.util.Map.Entry) (componentname)).getValue());
	//   32   73:getstatic       #145 <Field Boolean Boolean.FALSE>
	//   33   76:aload_1         
	//   34   77:invokeinterface #148 <Method Object java.util.Map$Entry.getValue()>
	//   35   82:invokevirtual   #151 <Method boolean Boolean.equals(Object)>
	//   36   85:istore_3        
		} while(!flag);
	//   37   86:iload_3         
	//   38   87:ifeq            52
		binder.start(encodeJob((JobParameters)((java.util.Map.Entry) (componentname)).getKey()), callback);
	//   39   90:aload_0         
	//   40   91:getfield        #58  <Field IRemoteJobService binder>
	//   41   94:aload_1         
	//   42   95:invokeinterface #154 <Method Object java.util.Map$Entry.getKey()>
	//   43  100:checkcast       #156 <Class JobParameters>
	//   44  103:invokestatic    #60  <Method Bundle encodeJob(JobParameters)>
	//   45  106:aload_0         
	//   46  107:getfield        #32  <Field IJobCallback callback>
	//   47  110:invokeinterface #160 <Method void IRemoteJobService.start(Bundle, IJobCallback)>
		((Set) (ibinder)).add(((java.util.Map.Entry) (componentname)).getKey());
	//   48  115:aload_2         
	//   49  116:aload_1         
	//   50  117:invokeinterface #154 <Method Object java.util.Map$Entry.getKey()>
	//   51  122:invokeinterface #163 <Method boolean Set.add(Object)>
	//   52  127:pop             
		if(true) goto _L2; else goto _L1
	//   53  128:goto            52
_L1:
		ibinder;
	//   54  131:astore_2        
		StringBuilder stringbuilder = new StringBuilder();
	//   55  132:new             #165 <Class StringBuilder>
	//   56  135:dup             
	//   57  136:invokespecial   #166 <Method void StringBuilder()>
	//   58  139:astore          4
		stringbuilder.append("Failed to start job ");
	//   59  141:aload           4
	//   60  143:ldc1            #168 <String "Failed to start job ">
	//   61  145:invokevirtual   #172 <Method StringBuilder StringBuilder.append(String)>
	//   62  148:pop             
		stringbuilder.append(((java.util.Map.Entry) (componentname)).getKey());
	//   63  149:aload           4
	//   64  151:aload_1         
	//   65  152:invokeinterface #154 <Method Object java.util.Map$Entry.getKey()>
	//   66  157:invokevirtual   #175 <Method StringBuilder StringBuilder.append(Object)>
	//   67  160:pop             
		Log.e("FJD.ExternalReceiver", stringbuilder.toString(), ((Throwable) (ibinder)));
	//   68  161:ldc1            #68  <String "FJD.ExternalReceiver">
	//   69  163:aload           4
	//   70  165:invokevirtual   #179 <Method String StringBuilder.toString()>
	//   71  168:aload_2         
	//   72  169:invokestatic    #76  <Method int Log.e(String, String, Throwable)>
	//   73  172:pop             
		unbind();
	//   74  173:aload_0         
	//   75  174:invokevirtual   #79  <Method void unbind()>
		this;
	//   76  177:aload_0         
		JVM INSTR monitorexit ;
	//   77  178:monitorexit     
		return;
	//   78  179:return          
		for(componentname = ((ComponentName) (((Set) (ibinder)).iterator())); ((Iterator) (componentname)).hasNext(); jobStatuses.put(((Object) (ibinder)), ((Object) (Boolean.valueOf(true)))))
	//*  79  180:aload_2         
	//*  80  181:invokeinterface #128 <Method Iterator Set.iterator()>
	//*  81  186:astore_1        
	//*  82  187:aload_1         
	//*  83  188:invokeinterface #133 <Method boolean Iterator.hasNext()>
	//*  84  193:ifeq            224
			ibinder = ((IBinder) ((JobInvocation)((Iterator) (componentname)).next()));
	//   85  196:aload_1         
	//   86  197:invokeinterface #137 <Method Object Iterator.next()>
	//   87  202:checkcast       #181 <Class JobInvocation>
	//   88  205:astore_2        

	//   89  206:aload_0         
	//   90  207:getfield        #28  <Field Map jobStatuses>
	//   91  210:aload_2         
	//   92  211:iconst_1        
	//   93  212:invokestatic    #185 <Method Boolean Boolean.valueOf(boolean)>
	//   94  215:invokeinterface #189 <Method Object Map.put(Object, Object)>
	//   95  220:pop             
	//*  96  221:goto            187
		this;
	//   97  224:aload_0         
		JVM INSTR monitorexit ;
	//   98  225:monitorexit     
		return;
	//   99  226:return          
		componentname;
	//  100  227:astore_1        
	//* 101  228:aload_0         
		throw componentname;
	//  102  229:monitorexit     
	//  103  230:aload_1         
	//  104  231:athrow          
	}

	public void onServiceDisconnected(ComponentName componentname)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		unbind();
	//    2    2:aload_0         
	//    3    3:invokevirtual   #79  <Method void unbind()>
		this;
	//    4    6:aload_0         
		JVM INSTR monitorexit ;
	//    5    7:monitorexit     
		return;
	//    6    8:return          
		componentname;
	//    7    9:astore_1        
	//*   8   10:aload_0         
		throw componentname;
	//    9   11:monitorexit     
	//   10   12:aload_1         
	//   11   13:athrow          
	}

	void onStop(JobInvocation jobinvocation, boolean flag)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		if(wasUnbound())
			break MISSING_BLOCK_LABEL_64;
	//    2    2:aload_0         
	//    3    3:invokevirtual   #103 <Method boolean wasUnbound()>
	//    4    6:ifne            64
		if(Boolean.TRUE.equals(jobStatuses.remove(((Object) (jobinvocation)))) && isConnected())
	//*   5    9:getstatic       #196 <Field Boolean Boolean.TRUE>
	//*   6   12:aload_0         
	//*   7   13:getfield        #28  <Field Map jobStatuses>
	//*   8   16:aload_1         
	//*   9   17:invokeinterface #96  <Method Object Map.remove(Object)>
	//*  10   22:invokevirtual   #151 <Method boolean Boolean.equals(Object)>
	//*  11   25:ifeq            41
	//*  12   28:aload_0         
	//*  13   29:invokevirtual   #198 <Method boolean isConnected()>
	//*  14   32:ifeq            41
			stopJob(flag, jobinvocation);
	//   15   35:aload_0         
	//   16   36:iload_2         
	//   17   37:aload_1         
	//   18   38:invokespecial   #200 <Method void stopJob(boolean, JobInvocation)>
		if(flag)
			break MISSING_BLOCK_LABEL_72;
	//   19   41:iload_2         
	//   20   42:ifne            72
		if(jobStatuses.isEmpty())
	//*  21   45:aload_0         
	//*  22   46:getfield        #28  <Field Map jobStatuses>
	//*  23   49:invokeinterface #99  <Method boolean Map.isEmpty()>
	//*  24   54:ifeq            72
			unbind();
	//   25   57:aload_0         
	//   26   58:invokevirtual   #79  <Method void unbind()>
		break MISSING_BLOCK_LABEL_72;
	//   27   61:goto            72
		Log.w("FJD.ExternalReceiver", "Can't send stop request because service was unbound.");
	//   28   64:ldc1            #68  <String "FJD.ExternalReceiver">
	//   29   66:ldc1            #202 <String "Can't send stop request because service was unbound.">
	//   30   68:invokestatic    #109 <Method int Log.w(String, String)>
	//   31   71:pop             
		this;
	//   32   72:aload_0         
		JVM INSTR monitorexit ;
	//   33   73:monitorexit     
		return;
	//   34   74:return          
		jobinvocation;
	//   35   75:astore_1        
	//*  36   76:aload_0         
		throw jobinvocation;
	//   37   77:monitorexit     
	//   38   78:aload_1         
	//   39   79:athrow          
	}

	boolean startJob(JobInvocation jobinvocation)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		boolean flag = isConnected();
	//    2    2:aload_0         
	//    3    3:invokevirtual   #198 <Method boolean isConnected()>
	//    4    6:istore_2        
		if(!flag)
			break MISSING_BLOCK_LABEL_137;
	//    5    7:iload_2         
	//    6    8:ifeq            137
		Boolean boolean1 = (Boolean)jobStatuses.get(((Object) (jobinvocation)));
	//    7   11:aload_0         
	//    8   12:getfield        #28  <Field Map jobStatuses>
	//    9   15:aload_1         
	//   10   16:invokeinterface #206 <Method Object Map.get(Object)>
	//   11   21:checkcast       #141 <Class Boolean>
	//   12   24:astore_3        
		if(Boolean.TRUE.equals(((Object) (boolean1))))
	//*  13   25:getstatic       #196 <Field Boolean Boolean.TRUE>
	//*  14   28:aload_3         
	//*  15   29:invokevirtual   #151 <Method boolean Boolean.equals(Object)>
	//*  16   32:ifeq            72
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   17   35:new             #165 <Class StringBuilder>
	//   18   38:dup             
	//   19   39:invokespecial   #166 <Method void StringBuilder()>
	//   20   42:astore_3        
			stringbuilder.append("Received an execution request for already running job ");
	//   21   43:aload_3         
	//   22   44:ldc1            #208 <String "Received an execution request for already running job ">
	//   23   46:invokevirtual   #172 <Method StringBuilder StringBuilder.append(String)>
	//   24   49:pop             
			stringbuilder.append(((Object) (jobinvocation)));
	//   25   50:aload_3         
	//   26   51:aload_1         
	//   27   52:invokevirtual   #175 <Method StringBuilder StringBuilder.append(Object)>
	//   28   55:pop             
			Log.w("FJD.ExternalReceiver", stringbuilder.toString());
	//   29   56:ldc1            #68  <String "FJD.ExternalReceiver">
	//   30   58:aload_3         
	//   31   59:invokevirtual   #179 <Method String StringBuilder.toString()>
	//   32   62:invokestatic    #109 <Method int Log.w(String, String)>
	//   33   65:pop             
			stopJob(false, jobinvocation);
	//   34   66:aload_0         
	//   35   67:iconst_0        
	//   36   68:aload_1         
	//   37   69:invokespecial   #200 <Method void stopJob(boolean, JobInvocation)>
		}
		binder.start(encodeJob(((JobParameters) (jobinvocation))), callback);
	//   38   72:aload_0         
	//   39   73:getfield        #58  <Field IRemoteJobService binder>
	//   40   76:aload_1         
	//   41   77:invokestatic    #60  <Method Bundle encodeJob(JobParameters)>
	//   42   80:aload_0         
	//   43   81:getfield        #32  <Field IJobCallback callback>
	//   44   84:invokeinterface #160 <Method void IRemoteJobService.start(Bundle, IJobCallback)>
		break MISSING_BLOCK_LABEL_137;
	//   45   89:goto            137
		RemoteException remoteexception;
		remoteexception;
	//   46   92:astore_3        
		StringBuilder stringbuilder1 = new StringBuilder();
	//   47   93:new             #165 <Class StringBuilder>
	//   48   96:dup             
	//   49   97:invokespecial   #166 <Method void StringBuilder()>
	//   50  100:astore          4
		stringbuilder1.append("Failed to start the job ");
	//   51  102:aload           4
	//   52  104:ldc1            #210 <String "Failed to start the job ">
	//   53  106:invokevirtual   #172 <Method StringBuilder StringBuilder.append(String)>
	//   54  109:pop             
		stringbuilder1.append(((Object) (jobinvocation)));
	//   55  110:aload           4
	//   56  112:aload_1         
	//   57  113:invokevirtual   #175 <Method StringBuilder StringBuilder.append(Object)>
	//   58  116:pop             
		Log.e("FJD.ExternalReceiver", stringbuilder1.toString(), ((Throwable) (remoteexception)));
	//   59  117:ldc1            #68  <String "FJD.ExternalReceiver">
	//   60  119:aload           4
	//   61  121:invokevirtual   #179 <Method String StringBuilder.toString()>
	//   62  124:aload_3         
	//   63  125:invokestatic    #76  <Method int Log.e(String, String, Throwable)>
	//   64  128:pop             
		unbind();
	//   65  129:aload_0         
	//   66  130:invokevirtual   #79  <Method void unbind()>
		this;
	//   67  133:aload_0         
		JVM INSTR monitorexit ;
	//   68  134:monitorexit     
		return false;
	//   69  135:iconst_0        
	//   70  136:ireturn         
		jobStatuses.put(((Object) (jobinvocation)), ((Object) (Boolean.valueOf(flag))));
	//   71  137:aload_0         
	//   72  138:getfield        #28  <Field Map jobStatuses>
	//   73  141:aload_1         
	//   74  142:iload_2         
	//   75  143:invokestatic    #185 <Method Boolean Boolean.valueOf(boolean)>
	//   76  146:invokeinterface #189 <Method Object Map.put(Object, Object)>
	//   77  151:pop             
		this;
	//   78  152:aload_0         
		JVM INSTR monitorexit ;
	//   79  153:monitorexit     
		return flag;
	//   80  154:iload_2         
	//   81  155:ireturn         
		jobinvocation;
	//   82  156:astore_1        
	//*  83  157:aload_0         
		throw jobinvocation;
	//   84  158:monitorexit     
	//   85  159:aload_1         
	//   86  160:athrow          
	}

	void unbind()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		if(wasUnbound())
			break MISSING_BLOCK_LABEL_65;
	//    2    2:aload_0         
	//    3    3:invokevirtual   #103 <Method boolean wasUnbound()>
	//    4    6:ifne            65
		binder = null;
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:putfield        #58  <Field IRemoteJobService binder>
		wasUnbound = true;
	//    8   14:aload_0         
	//    9   15:iconst_1        
	//   10   16:putfield        #30  <Field boolean wasUnbound>
		context.unbindService(((ServiceConnection) (this)));
	//   11   19:aload_0         
	//   12   20:getfield        #34  <Field Context context>
	//   13   23:aload_0         
	//   14   24:invokevirtual   #218 <Method void Context.unbindService(ServiceConnection)>
		break MISSING_BLOCK_LABEL_65;
	//   15   27:goto            65
		Object obj;
		obj;
	//   16   30:astore_1        
		StringBuilder stringbuilder = new StringBuilder();
	//   17   31:new             #165 <Class StringBuilder>
	//   18   34:dup             
	//   19   35:invokespecial   #166 <Method void StringBuilder()>
	//   20   38:astore_2        
		stringbuilder.append("Error unbinding service: ");
	//   21   39:aload_2         
	//   22   40:ldc1            #220 <String "Error unbinding service: ">
	//   23   42:invokevirtual   #172 <Method StringBuilder StringBuilder.append(String)>
	//   24   45:pop             
		stringbuilder.append(((IllegalArgumentException) (obj)).getMessage());
	//   25   46:aload_2         
	//   26   47:aload_1         
	//   27   48:invokevirtual   #223 <Method String IllegalArgumentException.getMessage()>
	//   28   51:invokevirtual   #172 <Method StringBuilder StringBuilder.append(String)>
	//   29   54:pop             
		Log.w("FJD.ExternalReceiver", stringbuilder.toString());
	//   30   55:ldc1            #68  <String "FJD.ExternalReceiver">
	//   31   57:aload_2         
	//   32   58:invokevirtual   #179 <Method String StringBuilder.toString()>
	//   33   61:invokestatic    #109 <Method int Log.w(String, String)>
	//   34   64:pop             
		this;
	//   35   65:aload_0         
		JVM INSTR monitorexit ;
	//   36   66:monitorexit     
		return;
	//   37   67:return          
		obj;
	//   38   68:astore_1        
	//*  39   69:aload_0         
		throw obj;
	//   40   70:monitorexit     
	//   41   71:aload_1         
	//   42   72:athrow          
	}

	boolean wasUnbound()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		boolean flag = wasUnbound;
	//    2    2:aload_0         
	//    3    3:getfield        #30  <Field boolean wasUnbound>
	//    4    6:istore_1        
		this;
	//    5    7:aload_0         
		JVM INSTR monitorexit ;
	//    6    8:monitorexit     
		return flag;
	//    7    9:iload_1         
	//    8   10:ireturn         
		Exception exception;
		exception;
	//    9   11:astore_2        
	//*  10   12:aload_0         
		throw exception;
	//   11   13:monitorexit     
	//   12   14:aload_2         
	//   13   15:athrow          
	}

	private IRemoteJobService binder;
	private final IJobCallback callback;
	private final Context context;
	private final Map jobStatuses = new HashMap();
	private boolean wasUnbound;
}

// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import android.os.*;
import android.util.Log;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;

// Referenced classes of package com.google.android.gms.internal:
//			zzabx, zzabp

final class zzabx$zza extends Handler
{

	public void handleMessage(Message message)
	{
		message.what;
	//    0    0:aload_1         
	//    1    1:getfield        #25  <Field int Message.what>
		JVM INSTR lookupswitch 2: default 32
	//	               0: 35
	//	               1: 130;
	//    2    4:lookupswitch    2: default 32
	//	               0: 35
	//	               1: 130
		   goto _L1 _L2 _L3
	//*   3   32:goto            182
_L2:
		PendingResult pendingresult = (PendingResult)message.obj;
	//    4   35:aload_1         
	//    5   36:getfield        #29  <Field Object Message.obj>
	//    6   39:checkcast       #31  <Class PendingResult>
	//    7   42:astore_3        
		message = ((Message) (zzabx.zzf(zzaDt)));
	//    8   43:aload_0         
	//    9   44:getfield        #13  <Field zzabx zzaDt>
	//   10   47:invokestatic    #35  <Method Object zzabx.zzf(zzabx)>
	//   11   50:astore_1        
		message;
	//   12   51:aload_1         
		JVM INSTR monitorenter ;
	//   13   52:monitorenter    
		if(pendingresult != null) goto _L5; else goto _L4
	//   14   53:aload_3         
	//   15   54:ifnonnull       81
_L4:
		zzabx.zza(zzabx.zzg(zzaDt), new Status(13, "Transform returned null"));
	//   16   57:aload_0         
	//   17   58:getfield        #13  <Field zzabx zzaDt>
	//   18   61:invokestatic    #39  <Method zzabx zzabx.zzg(zzabx)>
	//   19   64:new             #41  <Class Status>
	//   20   67:dup             
	//   21   68:bipush          13
	//   22   70:ldc1            #43  <String "Transform returned null">
	//   23   72:invokespecial   #46  <Method void Status(int, String)>
	//   24   75:invokestatic    #49  <Method void zzabx.zza(zzabx, Status)>
		break MISSING_BLOCK_LABEL_119;
	//   25   78:goto            119
_L5:
		if(pendingresult instanceof zzabp)
	//*  26   81:aload_3         
	//*  27   82:instanceof      #51  <Class zzabp>
	//*  28   85:ifeq            108
		{
			zzabx.zza(zzabx.zzg(zzaDt), ((zzabp)pendingresult).getStatus());
	//   29   88:aload_0         
	//   30   89:getfield        #13  <Field zzabx zzaDt>
	//   31   92:invokestatic    #39  <Method zzabx zzabx.zzg(zzabx)>
	//   32   95:aload_3         
	//   33   96:checkcast       #51  <Class zzabp>
	//   34   99:invokevirtual   #55  <Method Status zzabp.getStatus()>
	//   35  102:invokestatic    #49  <Method void zzabx.zza(zzabx, Status)>
			break MISSING_BLOCK_LABEL_119;
	//   36  105:goto            119
		}
		zzabx.zzg(zzaDt).zza(pendingresult);
	//   37  108:aload_0         
	//   38  109:getfield        #13  <Field zzabx zzaDt>
	//   39  112:invokestatic    #39  <Method zzabx zzabx.zzg(zzabx)>
	//   40  115:aload_3         
	//   41  116:invokevirtual   #58  <Method void zzabx.zza(PendingResult)>
		message;
	//   42  119:aload_1         
		JVM INSTR monitorexit ;
	//   43  120:monitorexit     
		  goto _L6
	//*  44  121:goto            129
		Exception exception;
		exception;
	//   45  124:astore_3        
	//*  46  125:aload_1         
		throw exception;
	//   47  126:monitorexit     
	//   48  127:aload_3         
	//   49  128:athrow          
_L6:
		return;
	//   50  129:return          
_L3:
		RuntimeException runtimeexception = (RuntimeException)message.obj;
	//   51  130:aload_1         
	//   52  131:getfield        #29  <Field Object Message.obj>
	//   53  134:checkcast       #60  <Class RuntimeException>
	//   54  137:astore_3        
		message = ((Message) (String.valueOf(((Object) (runtimeexception.getMessage())))));
	//   55  138:aload_3         
	//   56  139:invokevirtual   #64  <Method String RuntimeException.getMessage()>
	//   57  142:invokestatic    #70  <Method String String.valueOf(Object)>
	//   58  145:astore_1        
		if(((String) (message)).length() != 0)
	//*  59  146:aload_1         
	//*  60  147:invokevirtual   #74  <Method int String.length()>
	//*  61  150:ifeq            163
			message = ((Message) ("Runtime exception on the transformation worker thread: ".concat(((String) (message)))));
	//   62  153:ldc1            #76  <String "Runtime exception on the transformation worker thread: ">
	//   63  155:aload_1         
	//   64  156:invokevirtual   #80  <Method String String.concat(String)>
	//   65  159:astore_1        
		else
	//*  66  160:goto            173
			message = ((Message) (new String("Runtime exception on the transformation worker thread: ")));
	//   67  163:new             #66  <Class String>
	//   68  166:dup             
	//   69  167:ldc1            #76  <String "Runtime exception on the transformation worker thread: ">
	//   70  169:invokespecial   #83  <Method void String(String)>
	//   71  172:astore_1        
		Log.e("TransformedResultImpl", ((String) (message)));
	//   72  173:ldc1            #85  <String "TransformedResultImpl">
	//   73  175:aload_1         
	//   74  176:invokestatic    #91  <Method int Log.e(String, String)>
	//   75  179:pop             
		throw runtimeexception;
	//   76  180:aload_3         
	//   77  181:athrow          
_L1:
		int i = message.what;
	//   78  182:aload_1         
	//   79  183:getfield        #25  <Field int Message.what>
	//   80  186:istore_2        
		Log.e("TransformedResultImpl", (new StringBuilder(70)).append("TransformationResultHandler received unknown message type: ").append(i).toString());
	//   81  187:ldc1            #85  <String "TransformedResultImpl">
	//   82  189:new             #93  <Class StringBuilder>
	//   83  192:dup             
	//   84  193:bipush          70
	//   85  195:invokespecial   #96  <Method void StringBuilder(int)>
	//   86  198:ldc1            #98  <String "TransformationResultHandler received unknown message type: ">
	//   87  200:invokevirtual   #102 <Method StringBuilder StringBuilder.append(String)>
	//   88  203:iload_2         
	//   89  204:invokevirtual   #105 <Method StringBuilder StringBuilder.append(int)>
	//   90  207:invokevirtual   #108 <Method String StringBuilder.toString()>
	//   91  210:invokestatic    #91  <Method int Log.e(String, String)>
	//   92  213:pop             
		return;
	//   93  214:return          
	}

	final zzabx zzaDt;

	public zzabx$zza(zzabx zzabx1, Looper looper)
	{
		zzaDt = zzabx1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #13  <Field zzabx zzaDt>
		super(looper);
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:invokespecial   #16  <Method void Handler(Looper)>
	//    6   10:return          
	}
}

// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import android.os.*;
import android.util.Log;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;

// Referenced classes of package com.google.android.gms.internal:
//			zzabp, zzabh

private final class zzabp$zza extends Handler
{

	public void handleMessage(Message message)
	{
		message.what;
	//    0    0:aload_1         
	//    1    1:getfield        #25  <Field int Message.what>
		JVM INSTR tableswitch 0 1: default 28
	//	               0 61
	//	               1 153;
	//    2    4:tableswitch     0 1: default 28
	//	               0 61
	//	               1 153
		   goto _L1 _L2 _L3
_L1:
		int i = message.what;
	//    3   28:aload_1         
	//    4   29:getfield        #25  <Field int Message.what>
	//    5   32:istore_2        
		Log.e("TransformedResultImpl", (new StringBuilder(70)).append("TransformationResultHandler received unknown message type: ").append(i).toString());
	//    6   33:ldc1            #27  <String "TransformedResultImpl">
	//    7   35:new             #29  <Class StringBuilder>
	//    8   38:dup             
	//    9   39:bipush          70
	//   10   41:invokespecial   #32  <Method void StringBuilder(int)>
	//   11   44:ldc1            #34  <String "TransformationResultHandler received unknown message type: ">
	//   12   46:invokevirtual   #38  <Method StringBuilder StringBuilder.append(String)>
	//   13   49:iload_2         
	//   14   50:invokevirtual   #41  <Method StringBuilder StringBuilder.append(int)>
	//   15   53:invokevirtual   #45  <Method String StringBuilder.toString()>
	//   16   56:invokestatic    #51  <Method int Log.e(String, String)>
	//   17   59:pop             
		return;
	//   18   60:return          
_L2:
		Object obj = ((Object) ((PendingResult)message.obj));
	//   19   61:aload_1         
	//   20   62:getfield        #55  <Field Object Message.obj>
	//   21   65:checkcast       #57  <Class PendingResult>
	//   22   68:astore_3        
		message = ((Message) (zzabp.zzf(zzaBU)));
	//   23   69:aload_0         
	//   24   70:getfield        #13  <Field zzabp zzaBU>
	//   25   73:invokestatic    #61  <Method Object zzabp.zzf(zzabp)>
	//   26   76:astore_1        
		message;
	//   27   77:aload_1         
		JVM INSTR monitorenter ;
	//   28   78:monitorenter    
		if(obj != null) goto _L5; else goto _L4
	//   29   79:aload_3         
	//   30   80:ifnonnull       112
_L4:
		zzabp.zza(zzabp.zzg(zzaBU), new Status(13, "Transform returned null"));
	//   31   83:aload_0         
	//   32   84:getfield        #13  <Field zzabp zzaBU>
	//   33   87:invokestatic    #65  <Method zzabp zzabp.zzg(zzabp)>
	//   34   90:new             #67  <Class Status>
	//   35   93:dup             
	//   36   94:bipush          13
	//   37   96:ldc1            #69  <String "Transform returned null">
	//   38   98:invokespecial   #72  <Method void Status(int, String)>
	//   39  101:invokestatic    #75  <Method void zzabp.zza(zzabp, Status)>
_L8:
		message;
	//   40  104:aload_1         
		JVM INSTR monitorexit ;
	//   41  105:monitorexit     
		return;
	//   42  106:return          
		obj;
	//   43  107:astore_3        
		message;
	//   44  108:aload_1         
		JVM INSTR monitorexit ;
	//   45  109:monitorexit     
		throw obj;
	//   46  110:aload_3         
	//   47  111:athrow          
_L5:
		if(!(obj instanceof zzabh)) goto _L7; else goto _L6
	//   48  112:aload_3         
	//   49  113:instanceof      #77  <Class zzabh>
	//   50  116:ifeq            139
_L6:
		zzabp.zza(zzabp.zzg(zzaBU), ((zzabh)obj).getStatus());
	//   51  119:aload_0         
	//   52  120:getfield        #13  <Field zzabp zzaBU>
	//   53  123:invokestatic    #65  <Method zzabp zzabp.zzg(zzabp)>
	//   54  126:aload_3         
	//   55  127:checkcast       #77  <Class zzabh>
	//   56  130:invokevirtual   #81  <Method Status zzabh.getStatus()>
	//   57  133:invokestatic    #75  <Method void zzabp.zza(zzabp, Status)>
		  goto _L8
	//*  58  136:goto            104
_L7:
		zzabp.zzg(zzaBU).zza(((PendingResult) (obj)));
	//   59  139:aload_0         
	//   60  140:getfield        #13  <Field zzabp zzaBU>
	//   61  143:invokestatic    #65  <Method zzabp zzabp.zzg(zzabp)>
	//   62  146:aload_3         
	//   63  147:invokevirtual   #84  <Method void zzabp.zza(PendingResult)>
		  goto _L8
	//*  64  150:goto            104
_L3:
		RuntimeException runtimeexception = (RuntimeException)message.obj;
	//   65  153:aload_1         
	//   66  154:getfield        #55  <Field Object Message.obj>
	//   67  157:checkcast       #86  <Class RuntimeException>
	//   68  160:astore_3        
		message = ((Message) (String.valueOf(((Object) (runtimeexception.getMessage())))));
	//   69  161:aload_3         
	//   70  162:invokevirtual   #89  <Method String RuntimeException.getMessage()>
	//   71  165:invokestatic    #95  <Method String String.valueOf(Object)>
	//   72  168:astore_1        
		if(((String) (message)).length() != 0)
	//*  73  169:aload_1         
	//*  74  170:invokevirtual   #99  <Method int String.length()>
	//*  75  173:ifeq            192
			message = ((Message) ("Runtime exception on the transformation worker thread: ".concat(((String) (message)))));
	//   76  176:ldc1            #101 <String "Runtime exception on the transformation worker thread: ">
	//   77  178:aload_1         
	//   78  179:invokevirtual   #105 <Method String String.concat(String)>
	//   79  182:astore_1        
		else
	//*  80  183:ldc1            #27  <String "TransformedResultImpl">
	//*  81  185:aload_1         
	//*  82  186:invokestatic    #51  <Method int Log.e(String, String)>
	//*  83  189:pop             
	//*  84  190:aload_3         
	//*  85  191:athrow          
			message = ((Message) (new String("Runtime exception on the transformation worker thread: ")));
	//   86  192:new             #91  <Class String>
	//   87  195:dup             
	//   88  196:ldc1            #101 <String "Runtime exception on the transformation worker thread: ">
	//   89  198:invokespecial   #108 <Method void String(String)>
	//   90  201:astore_1        
		Log.e("TransformedResultImpl", ((String) (message)));
		throw runtimeexception;
	//*  91  202:goto            183
	}

	final zzabp zzaBU;

	public zzabp$zza(zzabp zzabp1, Looper looper)
	{
		zzaBU = zzabp1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #13  <Field zzabp zzaBU>
		super(looper);
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:invokespecial   #16  <Method void Handler(Looper)>
	//    6   10:return          
	}
}

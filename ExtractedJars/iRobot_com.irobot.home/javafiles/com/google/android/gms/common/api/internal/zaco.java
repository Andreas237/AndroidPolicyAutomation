// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.base.zal;

// Referenced classes of package com.google.android.gms.common.api.internal:
//			zacm, zacd

final class zaco extends zal
{

	public zaco(zacm zacm1, Looper looper)
	{
		zakv = zacm1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #10  <Field zacm zakv>
		super(looper);
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:invokespecial   #13  <Method void zal(Looper)>
	//    6   10:return          
	}

	public final void handleMessage(Message message)
	{
		PendingResult pendingresult;
		switch(message.what)
	//*   0    0:aload_1         
	//*   1    1:getfield        #22  <Field int Message.what>
		{
	//*   2    4:tableswitch     0 1: default 28
	//	               0 119
	//	               1 67
		default:
			int i = message.what;
	//    3   28:aload_1         
	//    4   29:getfield        #22  <Field int Message.what>
	//    5   32:istore_2        
			message = ((Message) (new StringBuilder(70)));
	//    6   33:new             #24  <Class StringBuilder>
	//    7   36:dup             
	//    8   37:bipush          70
	//    9   39:invokespecial   #27  <Method void StringBuilder(int)>
	//   10   42:astore_1        
			((StringBuilder) (message)).append("TransformationResultHandler received unknown message type: ");
	//   11   43:aload_1         
	//   12   44:ldc1            #29  <String "TransformationResultHandler received unknown message type: ">
	//   13   46:invokevirtual   #33  <Method StringBuilder StringBuilder.append(String)>
	//   14   49:pop             
			((StringBuilder) (message)).append(i);
	//   15   50:aload_1         
	//   16   51:iload_2         
	//   17   52:invokevirtual   #36  <Method StringBuilder StringBuilder.append(int)>
	//   18   55:pop             
			Log.e("TransformedResultImpl", ((StringBuilder) (message)).toString());
	//   19   56:ldc1            #38  <String "TransformedResultImpl">
	//   20   58:aload_1         
	//   21   59:invokevirtual   #42  <Method String StringBuilder.toString()>
	//   22   62:invokestatic    #48  <Method int Log.e(String, String)>
	//   23   65:pop             
			return;
	//   24   66:return          

		case 1: // '\001'
			RuntimeException runtimeexception = (RuntimeException)message.obj;
	//   25   67:aload_1         
	//   26   68:getfield        #52  <Field Object Message.obj>
	//   27   71:checkcast       #54  <Class RuntimeException>
	//   28   74:astore_3        
			message = ((Message) (String.valueOf(((Object) (runtimeexception.getMessage())))));
	//   29   75:aload_3         
	//   30   76:invokevirtual   #57  <Method String RuntimeException.getMessage()>
	//   31   79:invokestatic    #63  <Method String String.valueOf(Object)>
	//   32   82:astore_1        
			if(((String) (message)).length() != 0)
	//*  33   83:aload_1         
	//*  34   84:invokevirtual   #67  <Method int String.length()>
	//*  35   87:ifeq            100
				message = ((Message) ("Runtime exception on the transformation worker thread: ".concat(((String) (message)))));
	//   36   90:ldc1            #69  <String "Runtime exception on the transformation worker thread: ">
	//   37   92:aload_1         
	//   38   93:invokevirtual   #73  <Method String String.concat(String)>
	//   39   96:astore_1        
			else
	//*  40   97:goto            110
				message = ((Message) (new String("Runtime exception on the transformation worker thread: ")));
	//   41  100:new             #59  <Class String>
	//   42  103:dup             
	//   43  104:ldc1            #69  <String "Runtime exception on the transformation worker thread: ">
	//   44  106:invokespecial   #76  <Method void String(String)>
	//   45  109:astore_1        
			Log.e("TransformedResultImpl", ((String) (message)));
	//   46  110:ldc1            #38  <String "TransformedResultImpl">
	//   47  112:aload_1         
	//   48  113:invokestatic    #48  <Method int Log.e(String, String)>
	//   49  116:pop             
			throw runtimeexception;
	//   50  117:aload_3         
	//   51  118:athrow          

		case 0: // '\0'
			pendingresult = (PendingResult)message.obj;
	//   52  119:aload_1         
	//   53  120:getfield        #52  <Field Object Message.obj>
	//   54  123:checkcast       #78  <Class PendingResult>
	//   55  126:astore_3        
			break;
		}
		message = ((Message) (zacm.zaf(zakv)));
	//   56  127:aload_0         
	//   57  128:getfield        #10  <Field zacm zakv>
	//   58  131:invokestatic    #84  <Method Object zacm.zaf(zacm)>
	//   59  134:astore_1        
		message;
	//   60  135:aload_1         
		JVM INSTR monitorenter ;
	//   61  136:monitorenter    
		if(pendingresult != null)
			break MISSING_BLOCK_LABEL_165;
	//   62  137:aload_3         
	//   63  138:ifnonnull       165
		zacm.zaa(zacm.zag(zakv), new Status(13, "Transform returned null"));
	//   64  141:aload_0         
	//   65  142:getfield        #10  <Field zacm zakv>
	//   66  145:invokestatic    #88  <Method zacm zacm.zag(zacm)>
	//   67  148:new             #90  <Class Status>
	//   68  151:dup             
	//   69  152:bipush          13
	//   70  154:ldc1            #92  <String "Transform returned null">
	//   71  156:invokespecial   #95  <Method void Status(int, String)>
	//   72  159:invokestatic    #99  <Method void zacm.zaa(zacm, Status)>
		break MISSING_BLOCK_LABEL_203;
	//   73  162:goto            203
		if(pendingresult instanceof zacd)
	//*  74  165:aload_3         
	//*  75  166:instanceof      #101 <Class zacd>
	//*  76  169:ifeq            192
		{
			zacm.zaa(zacm.zag(zakv), ((zacd)pendingresult).getStatus());
	//   77  172:aload_0         
	//   78  173:getfield        #10  <Field zacm zakv>
	//   79  176:invokestatic    #88  <Method zacm zacm.zag(zacm)>
	//   80  179:aload_3         
	//   81  180:checkcast       #101 <Class zacd>
	//   82  183:invokevirtual   #105 <Method Status zacd.getStatus()>
	//   83  186:invokestatic    #99  <Method void zacm.zaa(zacm, Status)>
			break MISSING_BLOCK_LABEL_203;
	//   84  189:goto            203
		}
		zacm.zag(zakv).zaa(pendingresult);
	//   85  192:aload_0         
	//   86  193:getfield        #10  <Field zacm zakv>
	//   87  196:invokestatic    #88  <Method zacm zacm.zag(zacm)>
	//   88  199:aload_3         
	//   89  200:invokevirtual   #108 <Method void zacm.zaa(PendingResult)>
		message;
	//   90  203:aload_1         
		JVM INSTR monitorexit ;
	//   91  204:monitorexit     
		return;
	//   92  205:return          
_L2:
		message;
	//   93  206:aload_1         
		JVM INSTR monitorexit ;
	//   94  207:monitorexit     
		Exception exception;
		throw exception;
	//   95  208:aload_3         
	//   96  209:athrow          
		exception;
	//   97  210:astore_3        
		if(true) goto _L2; else goto _L1
_L1:
	//*  98  211:goto            206
	}

	private final zacm zakv;
}

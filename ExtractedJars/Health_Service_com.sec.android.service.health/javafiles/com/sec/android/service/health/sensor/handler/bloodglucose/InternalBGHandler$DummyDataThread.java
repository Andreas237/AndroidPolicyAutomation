// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.sec.android.service.health.sensor.handler.bloodglucose;

import android.os.Bundle;
import com.samsung.android.sdk.health.sensor.handler.PrivilegeSensorProfileHandlerListener;
import com.sec.android.service.health.util.LOG;
import java.util.Random;

// Referenced classes of package com.sec.android.service.health.sensor.handler.bloodglucose:
//			InternalBGHandler

private class InternalBGHandler$DummyDataThread extends Thread
{

	public void run()
	{
		float f;
		InternalBGHandler.access$002(0);
	//    0    0:iconst_0        
	//    1    1:invokestatic    #27  <Method int InternalBGHandler.access$002(int)>
	//    2    4:pop             
		f = (new Random()).nextInt(500);
	//    3    5:new             #29  <Class Random>
	//    4    8:dup             
	//    5    9:invokespecial   #30  <Method void Random()>
	//    6   12:sipush          500
	//    7   15:invokevirtual   #33  <Method int Random.nextInt(int)>
	//    8   18:i2f             
	//    9   19:fstore_1        
_L6:
		if(InternalBGHandler.access$000() >= InternalBGHandler.access$100().length)
	//*  10   20:invokestatic    #37  <Method int InternalBGHandler.access$000()>
	//*  11   23:invokestatic    #41  <Method int[] InternalBGHandler.access$100()>
	//*  12   26:arraylength     
	//*  13   27:icmplt          36
		{
			InternalBGHandler.access$002(0);
	//   14   30:iconst_0        
	//   15   31:invokestatic    #27  <Method int InternalBGHandler.access$002(int)>
	//   16   34:pop             
			return;
	//   17   35:return          
		}
		if(InternalBGHandler.access$100()[InternalBGHandler.access$000()] != 10) goto _L2; else goto _L1
	//   18   36:invokestatic    #41  <Method int[] InternalBGHandler.access$100()>
	//   19   39:invokestatic    #37  <Method int InternalBGHandler.access$000()>
	//   20   42:iaload          
	//   21   43:bipush          10
	//   22   45:icmpne          244
_L1:
		Thread.sleep(5000L);
	//   23   48:ldc2w           #42  <Long 5000L>
	//   24   51:invokestatic    #47  <Method void Thread.sleep(long)>
_L4:
		if(mProfileHandlerListener != null)
	//*  25   54:aload_0         
	//*  26   55:getfield        #13  <Field InternalBGHandler this$0>
	//*  27   58:getfield        #51  <Field PrivilegeSensorProfileHandlerListener InternalBGHandler.mProfileHandlerListener>
	//*  28   61:ifnull          197
		{
			Bundle abundle[] = new Bundle[1];
	//   29   64:iconst_1        
	//   30   65:anewarray       Bundle[]
	//   31   68:astore_2        
			abundle[0] = new Bundle();
	//   32   69:aload_2         
	//   33   70:iconst_0        
	//   34   71:new             #53  <Class Bundle>
	//   35   74:dup             
	//   36   75:invokespecial   #54  <Method void Bundle()>
	//   37   78:aastore         
			abundle[0].putInt("glucose_sensor_state", InternalBGHandler.access$100()[InternalBGHandler.access$000()]);
	//   38   79:aload_2         
	//   39   80:iconst_0        
	//   40   81:aaload          
	//   41   82:ldc1            #56  <String "glucose_sensor_state">
	//   42   84:invokestatic    #41  <Method int[] InternalBGHandler.access$100()>
	//   43   87:invokestatic    #37  <Method int InternalBGHandler.access$000()>
	//   44   90:iaload          
	//   45   91:invokevirtual   #60  <Method void Bundle.putInt(String, int)>
			abundle[0].putInt("glucose_error_detail", 0);
	//   46   94:aload_2         
	//   47   95:iconst_0        
	//   48   96:aaload          
	//   49   97:ldc1            #62  <String "glucose_error_detail">
	//   50   99:iconst_0        
	//   51  100:invokevirtual   #60  <Method void Bundle.putInt(String, int)>
			abundle[0].putFloat("glucose", f);
	//   52  103:aload_2         
	//   53  104:iconst_0        
	//   54  105:aaload          
	//   55  106:ldc1            #64  <String "glucose">
	//   56  108:fload_1         
	//   57  109:invokevirtual   #68  <Method void Bundle.putFloat(String, float)>
			abundle[0].putLong("time_stamp", System.currentTimeMillis());
	//   58  112:aload_2         
	//   59  113:iconst_0        
	//   60  114:aaload          
	//   61  115:ldc1            #70  <String "time_stamp">
	//   62  117:invokestatic    #76  <Method long System.currentTimeMillis()>
	//   63  120:invokevirtual   #80  <Method void Bundle.putLong(String, long)>
			abundle[0].putInt("glucose_unit", 0x222e1);
	//   64  123:aload_2         
	//   65  124:iconst_0        
	//   66  125:aaload          
	//   67  126:ldc1            #82  <String "glucose_unit">
	//   68  128:ldc1            #83  <Int 0x222e1>
	//   69  130:invokevirtual   #60  <Method void Bundle.putInt(String, int)>
			abundle[0].putInt("sample_type", 0x15f91);
	//   70  133:aload_2         
	//   71  134:iconst_0        
	//   72  135:aaload          
	//   73  136:ldc1            #85  <String "sample_type">
	//   74  138:ldc1            #86  <Int 0x15f91>
	//   75  140:invokevirtual   #60  <Method void Bundle.putInt(String, int)>
			LOG.d(InternalBGHandler.access$200(), (new StringBuilder()).append("[TBG] State : ").append(InternalBGHandler.access$100()[InternalBGHandler.access$000()]).append(" BG value : ").append(f).toString());
	//   76  143:invokestatic    #90  <Method Class InternalBGHandler.access$200()>
	//   77  146:new             #92  <Class StringBuilder>
	//   78  149:dup             
	//   79  150:invokespecial   #93  <Method void StringBuilder()>
	//   80  153:ldc1            #95  <String "[TBG] State : ">
	//   81  155:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//   82  158:invokestatic    #41  <Method int[] InternalBGHandler.access$100()>
	//   83  161:invokestatic    #37  <Method int InternalBGHandler.access$000()>
	//   84  164:iaload          
	//   85  165:invokevirtual   #102 <Method StringBuilder StringBuilder.append(int)>
	//   86  168:ldc1            #104 <String " BG value : ">
	//   87  170:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//   88  173:fload_1         
	//   89  174:invokevirtual   #107 <Method StringBuilder StringBuilder.append(float)>
	//   90  177:invokevirtual   #111 <Method String StringBuilder.toString()>
	//   91  180:invokestatic    #117 <Method void LOG.d(Class, String)>
			mProfileHandlerListener.onDataReceived(3, abundle);
	//   92  183:aload_0         
	//   93  184:getfield        #13  <Field InternalBGHandler this$0>
	//   94  187:getfield        #51  <Field PrivilegeSensorProfileHandlerListener InternalBGHandler.mProfileHandlerListener>
	//   95  190:iconst_3        
	//   96  191:aload_2         
	//   97  192:invokeinterface #123 <Method void PrivilegeSensorProfileHandlerListener.onDataReceived(int, Bundle[])>
		}
		if(InternalBGHandler.access$300(InternalBGHandler.this) != null && InternalBGHandler.access$100()[InternalBGHandler.access$000()] == 10)
	//*  98  197:aload_0         
	//*  99  198:getfield        #13  <Field InternalBGHandler this$0>
	//* 100  201:invokestatic    #127 <Method InternalBGHandler$DummyDataThread InternalBGHandler.access$300(InternalBGHandler)>
	//* 101  204:ifnull          276
	//* 102  207:invokestatic    #41  <Method int[] InternalBGHandler.access$100()>
	//* 103  210:invokestatic    #37  <Method int InternalBGHandler.access$000()>
	//* 104  213:iaload          
	//* 105  214:bipush          10
	//* 106  216:icmpne          276
		{
			InternalBGHandler.access$300(InternalBGHandler.this).interrupt();
	//  107  219:aload_0         
	//  108  220:getfield        #13  <Field InternalBGHandler this$0>
	//  109  223:invokestatic    #127 <Method InternalBGHandler$DummyDataThread InternalBGHandler.access$300(InternalBGHandler)>
	//  110  226:invokevirtual   #130 <Method void interrupt()>
			InternalBGHandler.access$302(InternalBGHandler.this, ((InternalBGHandler$DummyDataThread) (null)));
	//  111  229:aload_0         
	//  112  230:getfield        #13  <Field InternalBGHandler this$0>
	//  113  233:aconst_null     
	//  114  234:invokestatic    #134 <Method InternalBGHandler$DummyDataThread InternalBGHandler.access$302(InternalBGHandler, InternalBGHandler$DummyDataThread)>
	//  115  237:pop             
			InternalBGHandler.access$002(0);
	//  116  238:iconst_0        
	//  117  239:invokestatic    #27  <Method int InternalBGHandler.access$002(int)>
	//  118  242:pop             
			return;
	//  119  243:return          
		}
		break; /* Loop/switch isn't completed */
_L2:
		Exception exception;
		if(InternalBGHandler.access$000() == 0)
	//* 120  244:invokestatic    #37  <Method int InternalBGHandler.access$000()>
	//* 121  247:ifne            267
		{
			Thread.sleep(3000L);
	//  122  250:ldc2w           #135 <Long 3000L>
	//  123  253:invokestatic    #47  <Method void Thread.sleep(long)>
			continue; /* Loop/switch isn't completed */
	//  124  256:goto            54
		}
	//* 125  259:astore_2        
	//* 126  260:aload_2         
	//* 127  261:invokevirtual   #139 <Method void Exception.printStackTrace()>
	//* 128  264:goto            54
		try
		{
			Thread.sleep(1000L);
	//  129  267:ldc2w           #140 <Long 1000L>
	//  130  270:invokestatic    #47  <Method void Thread.sleep(long)>
		}
		// Misplaced declaration of an exception variable
		catch(Exception exception)
		{
			exception.printStackTrace();
		}
		if(true) goto _L4; else goto _L3
	//  131  273:goto            54
_L3:
		InternalBGHandler.access$008();
	//  132  276:invokestatic    #144 <Method int InternalBGHandler.access$008()>
	//  133  279:pop             
		if(true) goto _L6; else goto _L5
	//  134  280:goto            20
_L5:
	}

	final InternalBGHandler this$0;

	private InternalBGHandler$DummyDataThread()
	{
		this$0 = InternalBGHandler.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #13  <Field InternalBGHandler this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #16  <Method void Thread()>
	//    5    9:return          
	}

	InternalBGHandler$DummyDataThread(InternalBGHandler._cls1 _pcls1)
	{
		this();
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #20  <Method void InternalBGHandler$DummyDataThread(InternalBGHandler)>
	//    3    5:return          
	}
}

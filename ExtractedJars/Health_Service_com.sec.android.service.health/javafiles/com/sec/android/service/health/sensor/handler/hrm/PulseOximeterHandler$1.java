// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.sec.android.service.health.sensor.handler.hrm;

import android.hardware.*;
import android.os.Bundle;
import com.samsung.android.sdk.health.sensor.handler.PrivilegeSensorProfileHandlerListener;
import com.sec.android.service.health.util.LOG;

// Referenced classes of package com.sec.android.service.health.sensor.handler.hrm:
//			PulseOximeterHandler

class PulseOximeterHandler$1
	implements SensorEventListener
{

	public void onAccuracyChanged(Sensor sensor, int i)
	{
	//    0    0:return          
	}

	public void onSensorChanged(SensorEvent sensorevent)
	{
		if(sensorevent != null && sensorevent.sensor != null && sensorevent.sensor.getType() == 0x1001a && PulseOximeterHandler.access$400(PulseOximeterHandler.this) < 1)
	//*   0    0:aload_1         
	//*   1    1:ifnull          11
	//*   2    4:aload_1         
	//*   3    5:getfield        #28  <Field Sensor SensorEvent.sensor>
	//*   4    8:ifnonnull       12
	//*   5   11:return          
	//*   6   12:aload_1         
	//*   7   13:getfield        #28  <Field Sensor SensorEvent.sensor>
	//*   8   16:invokevirtual   #34  <Method int Sensor.getType()>
	//*   9   19:ldc1            #35  <Int 0x1001a>
	//*  10   21:icmpne          11
	//*  11   24:aload_0         
	//*  12   25:getfield        #14  <Field PulseOximeterHandler this$0>
	//*  13   28:invokestatic    #39  <Method int PulseOximeterHandler.access$400(PulseOximeterHandler)>
	//*  14   31:iconst_1        
	//*  15   32:icmpge          11
		{
			PulseOximeterHandler.access$500(PulseOximeterHandler.this)[PulseOximeterHandler.access$400(PulseOximeterHandler.this)] = new Bundle();
	//   16   35:aload_0         
	//   17   36:getfield        #14  <Field PulseOximeterHandler this$0>
	//   18   39:invokestatic    #43  <Method Bundle[] PulseOximeterHandler.access$500(PulseOximeterHandler)>
	//   19   42:aload_0         
	//   20   43:getfield        #14  <Field PulseOximeterHandler this$0>
	//   21   46:invokestatic    #39  <Method int PulseOximeterHandler.access$400(PulseOximeterHandler)>
	//   22   49:new             #45  <Class Bundle>
	//   23   52:dup             
	//   24   53:invokespecial   #46  <Method void Bundle()>
	//   25   56:aastore         
			PulseOximeterHandler.access$102(PulseOximeterHandler.this, (int)sensorevent.values[0]);
	//   26   57:aload_0         
	//   27   58:getfield        #14  <Field PulseOximeterHandler this$0>
	//   28   61:aload_1         
	//   29   62:getfield        #50  <Field float[] SensorEvent.values>
	//   30   65:iconst_0        
	//   31   66:faload          
	//   32   67:f2i             
	//   33   68:invokestatic    #54  <Method int PulseOximeterHandler.access$102(PulseOximeterHandler, int)>
	//   34   71:pop             
			PulseOximeterHandler.access$202(PulseOximeterHandler.this, (long)sensorevent.values[1]);
	//   35   72:aload_0         
	//   36   73:getfield        #14  <Field PulseOximeterHandler this$0>
	//   37   76:aload_1         
	//   38   77:getfield        #50  <Field float[] SensorEvent.values>
	//   39   80:iconst_1        
	//   40   81:faload          
	//   41   82:f2l             
	//   42   83:invokestatic    #58  <Method long PulseOximeterHandler.access$202(PulseOximeterHandler, long)>
	//   43   86:pop2            
			PulseOximeterHandler.access$302(PulseOximeterHandler.this, sensorevent.values[2]);
	//   44   87:aload_0         
	//   45   88:getfield        #14  <Field PulseOximeterHandler this$0>
	//   46   91:aload_1         
	//   47   92:getfield        #50  <Field float[] SensorEvent.values>
	//   48   95:iconst_2        
	//   49   96:faload          
	//   50   97:invokestatic    #62  <Method float PulseOximeterHandler.access$302(PulseOximeterHandler, float)>
	//   51  100:pop             
			PulseOximeterHandler.access$602(PulseOximeterHandler.this, sensorevent.values[4]);
	//   52  101:aload_0         
	//   53  102:getfield        #14  <Field PulseOximeterHandler this$0>
	//   54  105:aload_1         
	//   55  106:getfield        #50  <Field float[] SensorEvent.values>
	//   56  109:iconst_4        
	//   57  110:faload          
	//   58  111:invokestatic    #65  <Method float PulseOximeterHandler.access$602(PulseOximeterHandler, float)>
	//   59  114:pop             
			PulseOximeterHandler.access$500(PulseOximeterHandler.this)[PulseOximeterHandler.access$400(PulseOximeterHandler.this)].putLong("time_stamp", System.currentTimeMillis());
	//   60  115:aload_0         
	//   61  116:getfield        #14  <Field PulseOximeterHandler this$0>
	//   62  119:invokestatic    #43  <Method Bundle[] PulseOximeterHandler.access$500(PulseOximeterHandler)>
	//   63  122:aload_0         
	//   64  123:getfield        #14  <Field PulseOximeterHandler this$0>
	//   65  126:invokestatic    #39  <Method int PulseOximeterHandler.access$400(PulseOximeterHandler)>
	//   66  129:aaload          
	//   67  130:ldc1            #67  <String "time_stamp">
	//   68  132:invokestatic    #73  <Method long System.currentTimeMillis()>
	//   69  135:invokevirtual   #77  <Method void Bundle.putLong(String, long)>
			PulseOximeterHandler.access$500(PulseOximeterHandler.this)[PulseOximeterHandler.access$400(PulseOximeterHandler.this)].putInt("heart_rate", PulseOximeterHandler.access$100(PulseOximeterHandler.this));
	//   70  138:aload_0         
	//   71  139:getfield        #14  <Field PulseOximeterHandler this$0>
	//   72  142:invokestatic    #43  <Method Bundle[] PulseOximeterHandler.access$500(PulseOximeterHandler)>
	//   73  145:aload_0         
	//   74  146:getfield        #14  <Field PulseOximeterHandler this$0>
	//   75  149:invokestatic    #39  <Method int PulseOximeterHandler.access$400(PulseOximeterHandler)>
	//   76  152:aaload          
	//   77  153:ldc1            #79  <String "heart_rate">
	//   78  155:aload_0         
	//   79  156:getfield        #14  <Field PulseOximeterHandler this$0>
	//   80  159:invokestatic    #82  <Method int PulseOximeterHandler.access$100(PulseOximeterHandler)>
	//   81  162:invokevirtual   #86  <Method void Bundle.putInt(String, int)>
			PulseOximeterHandler.access$500(PulseOximeterHandler.this)[PulseOximeterHandler.access$400(PulseOximeterHandler.this)].putLong("heart_rate_interval", PulseOximeterHandler.access$200(PulseOximeterHandler.this));
	//   82  165:aload_0         
	//   83  166:getfield        #14  <Field PulseOximeterHandler this$0>
	//   84  169:invokestatic    #43  <Method Bundle[] PulseOximeterHandler.access$500(PulseOximeterHandler)>
	//   85  172:aload_0         
	//   86  173:getfield        #14  <Field PulseOximeterHandler this$0>
	//   87  176:invokestatic    #39  <Method int PulseOximeterHandler.access$400(PulseOximeterHandler)>
	//   88  179:aaload          
	//   89  180:ldc1            #88  <String "heart_rate_interval">
	//   90  182:aload_0         
	//   91  183:getfield        #14  <Field PulseOximeterHandler this$0>
	//   92  186:invokestatic    #92  <Method long PulseOximeterHandler.access$200(PulseOximeterHandler)>
	//   93  189:invokevirtual   #77  <Method void Bundle.putLong(String, long)>
			PulseOximeterHandler.access$500(PulseOximeterHandler.this)[PulseOximeterHandler.access$400(PulseOximeterHandler.this)].putFloat("heart_rate_snr", PulseOximeterHandler.access$300(PulseOximeterHandler.this));
	//   94  192:aload_0         
	//   95  193:getfield        #14  <Field PulseOximeterHandler this$0>
	//   96  196:invokestatic    #43  <Method Bundle[] PulseOximeterHandler.access$500(PulseOximeterHandler)>
	//   97  199:aload_0         
	//   98  200:getfield        #14  <Field PulseOximeterHandler this$0>
	//   99  203:invokestatic    #39  <Method int PulseOximeterHandler.access$400(PulseOximeterHandler)>
	//  100  206:aaload          
	//  101  207:ldc1            #94  <String "heart_rate_snr">
	//  102  209:aload_0         
	//  103  210:getfield        #14  <Field PulseOximeterHandler this$0>
	//  104  213:invokestatic    #98  <Method float PulseOximeterHandler.access$300(PulseOximeterHandler)>
	//  105  216:invokevirtual   #102 <Method void Bundle.putFloat(String, float)>
			PulseOximeterHandler.access$500(PulseOximeterHandler.this)[PulseOximeterHandler.access$400(PulseOximeterHandler.this)].putInt("heart_rate_unit", PulseOximeterHandler.access$700(PulseOximeterHandler.this));
	//  106  219:aload_0         
	//  107  220:getfield        #14  <Field PulseOximeterHandler this$0>
	//  108  223:invokestatic    #43  <Method Bundle[] PulseOximeterHandler.access$500(PulseOximeterHandler)>
	//  109  226:aload_0         
	//  110  227:getfield        #14  <Field PulseOximeterHandler this$0>
	//  111  230:invokestatic    #39  <Method int PulseOximeterHandler.access$400(PulseOximeterHandler)>
	//  112  233:aaload          
	//  113  234:ldc1            #104 <String "heart_rate_unit">
	//  114  236:aload_0         
	//  115  237:getfield        #14  <Field PulseOximeterHandler this$0>
	//  116  240:invokestatic    #107 <Method int PulseOximeterHandler.access$700(PulseOximeterHandler)>
	//  117  243:invokevirtual   #86  <Method void Bundle.putInt(String, int)>
			PulseOximeterHandler.access$500(PulseOximeterHandler.this)[PulseOximeterHandler.access$400(PulseOximeterHandler.this)].putFloat("pulse_oximetry", PulseOximeterHandler.access$600(PulseOximeterHandler.this));
	//  118  246:aload_0         
	//  119  247:getfield        #14  <Field PulseOximeterHandler this$0>
	//  120  250:invokestatic    #43  <Method Bundle[] PulseOximeterHandler.access$500(PulseOximeterHandler)>
	//  121  253:aload_0         
	//  122  254:getfield        #14  <Field PulseOximeterHandler this$0>
	//  123  257:invokestatic    #39  <Method int PulseOximeterHandler.access$400(PulseOximeterHandler)>
	//  124  260:aaload          
	//  125  261:ldc1            #109 <String "pulse_oximetry">
	//  126  263:aload_0         
	//  127  264:getfield        #14  <Field PulseOximeterHandler this$0>
	//  128  267:invokestatic    #112 <Method float PulseOximeterHandler.access$600(PulseOximeterHandler)>
	//  129  270:invokevirtual   #102 <Method void Bundle.putFloat(String, float)>
			int _tmp = PulseOximeterHandler.access$408(PulseOximeterHandler.this);
	//  130  273:aload_0         
	//  131  274:getfield        #14  <Field PulseOximeterHandler this$0>
	//  132  277:invokestatic    #115 <Method int PulseOximeterHandler.access$408(PulseOximeterHandler)>
	//  133  280:pop             
			LOG.d(PulseOximeterHandler.access$000(), (new StringBuilder()).append("HRMListener => heartrate = ").append(PulseOximeterHandler.access$100(PulseOximeterHandler.this)).append(" interval = ").append(PulseOximeterHandler.access$200(PulseOximeterHandler.this)).append(" SNR = ").append(PulseOximeterHandler.access$300(PulseOximeterHandler.this)).toString());
	//  134  281:invokestatic    #119 <Method Class PulseOximeterHandler.access$000()>
	//  135  284:new             #121 <Class StringBuilder>
	//  136  287:dup             
	//  137  288:invokespecial   #122 <Method void StringBuilder()>
	//  138  291:ldc1            #124 <String "HRMListener => heartrate = ">
	//  139  293:invokevirtual   #128 <Method StringBuilder StringBuilder.append(String)>
	//  140  296:aload_0         
	//  141  297:getfield        #14  <Field PulseOximeterHandler this$0>
	//  142  300:invokestatic    #82  <Method int PulseOximeterHandler.access$100(PulseOximeterHandler)>
	//  143  303:invokevirtual   #131 <Method StringBuilder StringBuilder.append(int)>
	//  144  306:ldc1            #133 <String " interval = ">
	//  145  308:invokevirtual   #128 <Method StringBuilder StringBuilder.append(String)>
	//  146  311:aload_0         
	//  147  312:getfield        #14  <Field PulseOximeterHandler this$0>
	//  148  315:invokestatic    #92  <Method long PulseOximeterHandler.access$200(PulseOximeterHandler)>
	//  149  318:invokevirtual   #136 <Method StringBuilder StringBuilder.append(long)>
	//  150  321:ldc1            #138 <String " SNR = ">
	//  151  323:invokevirtual   #128 <Method StringBuilder StringBuilder.append(String)>
	//  152  326:aload_0         
	//  153  327:getfield        #14  <Field PulseOximeterHandler this$0>
	//  154  330:invokestatic    #98  <Method float PulseOximeterHandler.access$300(PulseOximeterHandler)>
	//  155  333:invokevirtual   #141 <Method StringBuilder StringBuilder.append(float)>
	//  156  336:invokevirtual   #145 <Method String StringBuilder.toString()>
	//  157  339:invokestatic    #151 <Method void LOG.d(Class, String)>
			if(mProfileHandlerListener != null && PulseOximeterHandler.access$400(PulseOximeterHandler.this) == 1)
	//* 158  342:aload_0         
	//* 159  343:getfield        #14  <Field PulseOximeterHandler this$0>
	//* 160  346:getfield        #155 <Field PrivilegeSensorProfileHandlerListener PulseOximeterHandler.mProfileHandlerListener>
	//* 161  349:ifnull          11
	//* 162  352:aload_0         
	//* 163  353:getfield        #14  <Field PulseOximeterHandler this$0>
	//* 164  356:invokestatic    #39  <Method int PulseOximeterHandler.access$400(PulseOximeterHandler)>
	//* 165  359:iconst_1        
	//* 166  360:icmpne          11
			{
				mProfileHandlerListener.onDataReceived(2, PulseOximeterHandler.access$500(PulseOximeterHandler.this));
	//  167  363:aload_0         
	//  168  364:getfield        #14  <Field PulseOximeterHandler this$0>
	//  169  367:getfield        #155 <Field PrivilegeSensorProfileHandlerListener PulseOximeterHandler.mProfileHandlerListener>
	//  170  370:iconst_2        
	//  171  371:aload_0         
	//  172  372:getfield        #14  <Field PulseOximeterHandler this$0>
	//  173  375:invokestatic    #43  <Method Bundle[] PulseOximeterHandler.access$500(PulseOximeterHandler)>
	//  174  378:invokeinterface #161 <Method void PrivilegeSensorProfileHandlerListener.onDataReceived(int, Bundle[])>
				PulseOximeterHandler.access$402(PulseOximeterHandler.this, 0);
	//  175  383:aload_0         
	//  176  384:getfield        #14  <Field PulseOximeterHandler this$0>
	//  177  387:iconst_0        
	//  178  388:invokestatic    #164 <Method int PulseOximeterHandler.access$402(PulseOximeterHandler, int)>
	//  179  391:pop             
				return;
	//  180  392:return          
			}
		}
	}

	final PulseOximeterHandler this$0;

	PulseOximeterHandler$1()
	{
		this$0 = PulseOximeterHandler.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #14  <Field PulseOximeterHandler this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #17  <Method void Object()>
	//    5    9:return          
	}
}

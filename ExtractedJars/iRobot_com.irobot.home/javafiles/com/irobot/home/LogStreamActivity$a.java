// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import android.widget.ArrayAdapter;
import com.irobot.core.*;
import com.irobot.home.util.o;
import java.util.*;

// Referenced classes of package com.irobot.home:
//			LogStreamActivity

private class LogStreamActivity$a extends LogStreamUIServiceDataCallback
{

	public void onLogStreamUIServiceDataChanged(MissionUIServiceData missionuiservicedata)
	{
		if(missionuiservicedata == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       12
		{
			o.e("LogStreamActivity", "null service data");
	//    2    4:ldc1            #23  <String "LogStreamActivity">
	//    3    6:ldc1            #25  <String "null service data">
	//    4    8:invokestatic    #31  <Method void o.e(String, String)>
			return;
	//    5   11:return          
		}
		Object obj = ((Object) (missionuiservicedata.getMissionDataStates()));
	//    6   12:aload_1         
	//    7   13:invokevirtual   #37  <Method ArrayList MissionUIServiceData.getMissionDataStates()>
	//    8   16:astore_3        
		StringBuilder stringbuilder = new StringBuilder();
	//    9   17:new             #39  <Class StringBuilder>
	//   10   20:dup             
	//   11   21:invokespecial   #40  <Method void StringBuilder()>
	//   12   24:astore          4
		stringbuilder.append("Change list: ");
	//   13   26:aload           4
	//   14   28:ldc1            #42  <String "Change list: ">
	//   15   30:invokevirtual   #46  <Method StringBuilder StringBuilder.append(String)>
	//   16   33:pop             
		stringbuilder.append(((ArrayList) (obj)).toString());
	//   17   34:aload           4
	//   18   36:aload_3         
	//   19   37:invokevirtual   #52  <Method String ArrayList.toString()>
	//   20   40:invokevirtual   #46  <Method StringBuilder StringBuilder.append(String)>
	//   21   43:pop             
		o.b("LogStreamActivity", stringbuilder.toString());
	//   22   44:ldc1            #23  <String "LogStreamActivity">
	//   23   46:aload           4
	//   24   48:invokevirtual   #53  <Method String StringBuilder.toString()>
	//   25   51:invokestatic    #56  <Method void o.b(String, String)>
		obj = ((Object) (((ArrayList) (obj)).iterator()));
	//   26   54:aload_3         
	//   27   55:invokevirtual   #60  <Method Iterator ArrayList.iterator()>
	//   28   58:astore_3        
		do
		{
			if(!((Iterator) (obj)).hasNext())
				break;
	//   29   59:aload_3         
	//   30   60:invokeinterface #66  <Method boolean Iterator.hasNext()>
	//   31   65:ifeq            197
			MissionDataState missiondatastate = (MissionDataState)((Iterator) (obj)).next();
	//   32   68:aload_3         
	//   33   69:invokeinterface #70  <Method Object Iterator.next()>
	//   34   74:checkcast       #72  <Class MissionDataState>
	//   35   77:astore          4
			switch(LogStreamActivity$1.a[missiondatastate.ordinal()])
	//*  36   79:getstatic       #77  <Field int[] LogStreamActivity$1.a>
	//*  37   82:aload           4
	//*  38   84:invokevirtual   #81  <Method int MissionDataState.ordinal()>
	//*  39   87:iaload          
			{
	//*  40   88:tableswitch     1 2: default 112
	//	               1 155
	//	               2 115
	//*  41  112:goto            59
			case 2: // '\002'
				a.a.add(((Object) (missionuiservicedata.getLogStreamData())));
	//   42  115:aload_0         
	//   43  116:getfield        #12  <Field LogStreamActivity a>
	//   44  119:getfield        #84  <Field List LogStreamActivity.a>
	//   45  122:aload_1         
	//   46  123:invokevirtual   #87  <Method String MissionUIServiceData.getLogStreamData()>
	//   47  126:invokeinterface #93  <Method boolean List.add(Object)>
	//   48  131:pop             
				a.b.notifyDataSetChanged();
	//   49  132:aload_0         
	//   50  133:getfield        #12  <Field LogStreamActivity a>
	//   51  136:getfield        #96  <Field ArrayAdapter LogStreamActivity.b>
	//   52  139:invokevirtual   #101 <Method void ArrayAdapter.notifyDataSetChanged()>
				a.b.notifyDataSetInvalidated();
	//   53  142:aload_0         
	//   54  143:getfield        #12  <Field LogStreamActivity a>
	//   55  146:getfield        #96  <Field ArrayAdapter LogStreamActivity.b>
	//   56  149:invokevirtual   #104 <Method void ArrayAdapter.notifyDataSetInvalidated()>
				break;

	//*  57  152:goto            59
			case 1: // '\001'
				boolean flag = missionuiservicedata.getIsLogStreamEnabled();
	//   58  155:aload_1         
	//   59  156:invokevirtual   #107 <Method boolean MissionUIServiceData.getIsLogStreamEnabled()>
	//   60  159:istore_2        
				a.a(flag);
	//   61  160:aload_0         
	//   62  161:getfield        #12  <Field LogStreamActivity a>
	//   63  164:iload_2         
	//   64  165:invokevirtual   #110 <Method void LogStreamActivity.a(boolean)>
				if(!flag)
	//*  65  168:iload_2         
	//*  66  169:ifne            59
				{
					a.a.clear();
	//   67  172:aload_0         
	//   68  173:getfield        #12  <Field LogStreamActivity a>
	//   69  176:getfield        #84  <Field List LogStreamActivity.a>
	//   70  179:invokeinterface #113 <Method void List.clear()>
					a.b.clear();
	//   71  184:aload_0         
	//   72  185:getfield        #12  <Field LogStreamActivity a>
	//   73  188:getfield        #96  <Field ArrayAdapter LogStreamActivity.b>
	//   74  191:invokevirtual   #114 <Method void ArrayAdapter.clear()>
				}
				break;
			}
		} while(true);
	//   75  194:goto            59
	//   76  197:return          
	}

	final LogStreamActivity a;

	private LogStreamActivity$a(LogStreamActivity logstreamactivity)
	{
		a = logstreamactivity;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #12  <Field LogStreamActivity a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #15  <Method void LogStreamUIServiceDataCallback()>
	//    5    9:return          
	}

	LogStreamActivity$a(LogStreamActivity logstreamactivity, LogStreamActivity$1 logstreamactivity$1)
	{
		this(logstreamactivity);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #19  <Method void LogStreamActivity$a(LogStreamActivity)>
	//    3    5:return          
	}
}

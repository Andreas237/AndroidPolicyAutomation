// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.model.rest;

import com.irobot.core.RobotMissionHistoryEvent;
import com.irobot.core.RobotMissionHistoryItem;
import com.irobot.home.b.s;
import com.irobot.home.util.o;
import java.text.ParseException;
import java.util.*;

// Referenced classes of package com.irobot.home.model.rest:
//			MissionHistoryItem

public class MissionHistory
{

	public MissionHistory()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
		mStatus = "";
	//    2    4:aload_0         
	//    3    5:ldc1            #19  <String "">
	//    4    7:putfield        #21  <Field String mStatus>
		mError = "";
	//    5   10:aload_0         
	//    6   11:ldc1            #19  <String "">
	//    7   13:putfield        #23  <Field String mError>
		mMissions = ((List) (new ArrayList()));
	//    8   16:aload_0         
	//    9   17:new             #25  <Class ArrayList>
	//   10   20:dup             
	//   11   21:invokespecial   #26  <Method void ArrayList()>
	//   12   24:putfield        #28  <Field List mMissions>
	//   13   27:return          
	}

	public String getError()
	{
		return mError;
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field String mError>
	//    2    4:areturn         
	}

	public MissionHistoryItem getMissionHistoryItem(int i)
	{
		for(Iterator iterator = mMissions.iterator(); iterator.hasNext();)
	//*   0    0:aload_0         
	//*   1    1:getfield        #28  <Field List mMissions>
	//*   2    4:invokeinterface #39  <Method Iterator List.iterator()>
	//*   3    9:astore_2        
	//*   4   10:aload_2         
	//*   5   11:invokeinterface #45  <Method boolean Iterator.hasNext()>
	//*   6   16:ifeq            39
		{
			MissionHistoryItem missionhistoryitem = (MissionHistoryItem)iterator.next();
	//    7   19:aload_2         
	//    8   20:invokeinterface #49  <Method Object Iterator.next()>
	//    9   25:checkcast       #51  <Class MissionHistoryItem>
	//   10   28:astore_3        
			if(missionhistoryitem.getMissonId() == i)
	//*  11   29:aload_3         
	//*  12   30:invokevirtual   #55  <Method int MissionHistoryItem.getMissonId()>
	//*  13   33:iload_1         
	//*  14   34:icmpne          10
				return missionhistoryitem;
	//   15   37:aload_3         
	//   16   38:areturn         
		}

		return null;
	//   17   39:aconst_null     
	//   18   40:areturn         
	}

	public MissionHistoryItem getMissionHistoryItem(s s1)
	{
		Object obj;
		obj = ((Object) (new ArrayList()));
	//    0    0:new             #25  <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #26  <Method void ArrayList()>
	//    3    7:astore_3        
		Iterator iterator = mMissions.iterator();
	//    4    8:aload_0         
	//    5    9:getfield        #28  <Field List mMissions>
	//    6   12:invokeinterface #39  <Method Iterator List.iterator()>
	//    7   17:astore          4
		do
		{
			if(!iterator.hasNext())
				break;
	//    8   19:aload           4
	//    9   21:invokeinterface #45  <Method boolean Iterator.hasNext()>
	//   10   26:ifeq            68
			MissionHistoryItem missionhistoryitem1 = (MissionHistoryItem)iterator.next();
	//   11   29:aload           4
	//   12   31:invokeinterface #49  <Method Object Iterator.next()>
	//   13   36:checkcast       #51  <Class MissionHistoryItem>
	//   14   39:astore          5
			if(missionhistoryitem1.getMissonId() == s1.b().intValue())
	//*  15   41:aload           5
	//*  16   43:invokevirtual   #55  <Method int MissionHistoryItem.getMissonId()>
	//*  17   46:aload_1         
	//*  18   47:invokevirtual   #64  <Method Integer s.b()>
	//*  19   50:invokevirtual   #69  <Method int Integer.intValue()>
	//*  20   53:icmpne          19
				((List) (obj)).add(((Object) (missionhistoryitem1)));
	//   21   56:aload_3         
	//   22   57:aload           5
	//   23   59:invokeinterface #73  <Method boolean List.add(Object)>
	//   24   64:pop             
		} while(true);
	//   25   65:goto            19
		if(((List) (obj)).size() <= 1) goto _L2; else goto _L1
	//   26   68:aload_3         
	//   27   69:invokeinterface #76  <Method int List.size()>
	//   28   74:iconst_1        
	//   29   75:icmple          135
_L1:
		obj = ((Object) (((List) (obj)).iterator()));
	//   30   78:aload_3         
	//   31   79:invokeinterface #39  <Method Iterator List.iterator()>
	//   32   84:astore_3        
_L4:
		MissionHistoryItem missionhistoryitem;
		if(!((Iterator) (obj)).hasNext())
			break; /* Loop/switch isn't completed */
	//   33   85:aload_3         
	//   34   86:invokeinterface #45  <Method boolean Iterator.hasNext()>
	//   35   91:ifeq            155
		missionhistoryitem = (MissionHistoryItem)((Iterator) (obj)).next();
	//   36   94:aload_3         
	//   37   95:invokeinterface #49  <Method Object Iterator.next()>
	//   38  100:checkcast       #51  <Class MissionHistoryItem>
	//   39  103:astore          4
		boolean flag = missionhistoryitem.getDate().equals(((Object) (s1.a())));
	//   40  105:aload           4
	//   41  107:invokevirtual   #80  <Method Date MissionHistoryItem.getDate()>
	//   42  110:aload_1         
	//   43  111:invokevirtual   #83  <Method Date s.a()>
	//   44  114:invokevirtual   #88  <Method boolean Date.equals(Object)>
	//   45  117:istore_2        
		if(flag)
	//*  46  118:iload_2         
	//*  47  119:ifeq            85
			return missionhistoryitem;
	//   48  122:aload           4
	//   49  124:areturn         
		continue; /* Loop/switch isn't completed */
_L5:
		o.e("MissionHistory", "Error parsing date while getting mission item");
	//   50  125:ldc1            #90  <String "MissionHistory">
	//   51  127:ldc1            #92  <String "Error parsing date while getting mission item">
	//   52  129:invokestatic    #98  <Method void o.e(String, String)>
		if(true) goto _L4; else goto _L3
	//   53  132:goto            85
_L2:
		if(((List) (obj)).size() > 0)
	//*  54  135:aload_3         
	//*  55  136:invokeinterface #76  <Method int List.size()>
	//*  56  141:ifle            155
			return (MissionHistoryItem)((List) (obj)).get(0);
	//   57  144:aload_3         
	//   58  145:iconst_0        
	//   59  146:invokeinterface #102 <Method Object List.get(int)>
	//   60  151:checkcast       #51  <Class MissionHistoryItem>
	//   61  154:areturn         
_L3:
		return new MissionHistoryItem();
	//   62  155:new             #51  <Class MissionHistoryItem>
	//   63  158:dup             
	//   64  159:invokespecial   #103 <Method void MissionHistoryItem()>
	//   65  162:areturn         
		ParseException parseexception;
		parseexception;
	//   66  163:astore          4
		  goto _L5
	//*  67  165:goto            125
	}

	public List getMissions()
	{
		return mMissions;
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field List mMissions>
	//    2    4:areturn         
	}

	public String getStatus()
	{
		return mStatus;
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field String mStatus>
	//    2    4:areturn         
	}

	public void updateFromEvent(RobotMissionHistoryEvent robotmissionhistoryevent)
	{
		updateFromMissionList(robotmissionhistoryevent.missions());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #116 <Method ArrayList RobotMissionHistoryEvent.missions()>
	//    3    5:invokevirtual   #120 <Method void updateFromMissionList(ArrayList)>
	//    4    8:return          
	}

	public void updateFromMissionList(ArrayList arraylist)
	{
		ArrayList arraylist1 = new ArrayList();
	//    0    0:new             #25  <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #26  <Method void ArrayList()>
	//    3    7:astore_2        
		for(arraylist = ((ArrayList) (arraylist.iterator())); ((Iterator) (arraylist)).hasNext(); ((List) (arraylist1)).add(((Object) (new MissionHistoryItem((RobotMissionHistoryItem)((Iterator) (arraylist)).next())))));
	//    4    8:aload_1         
	//    5    9:invokevirtual   #121 <Method Iterator ArrayList.iterator()>
	//    6   12:astore_1        
	//    7   13:aload_1         
	//    8   14:invokeinterface #45  <Method boolean Iterator.hasNext()>
	//    9   19:ifeq            48
	//   10   22:aload_2         
	//   11   23:new             #51  <Class MissionHistoryItem>
	//   12   26:dup             
	//   13   27:aload_1         
	//   14   28:invokeinterface #49  <Method Object Iterator.next()>
	//   15   33:checkcast       #123 <Class RobotMissionHistoryItem>
	//   16   36:invokespecial   #126 <Method void MissionHistoryItem(RobotMissionHistoryItem)>
	//   17   39:invokeinterface #73  <Method boolean List.add(Object)>
	//   18   44:pop             
	//*  19   45:goto            13
		mMissions = ((List) (arraylist1));
	//   20   48:aload_0         
	//   21   49:aload_2         
	//   22   50:putfield        #28  <Field List mMissions>
		mStatus = "OK";
	//   23   53:aload_0         
	//   24   54:ldc1            #8   <String "OK">
	//   25   56:putfield        #21  <Field String mStatus>
	//   26   59:return          
	}

	public static final transient String STATUS_OK = "OK";
	private String mError;
	private List mMissions;
	private String mStatus;
}

// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.comscore.applications;

import com.comscore.analytics.Core;
import com.comscore.measurement.Label;
import com.comscore.utils.*;
import java.util.*;

// Referenced classes of package com.comscore.applications:
//			ApplicationMeasurement, EventType

public class AppStartMeasurement extends ApplicationMeasurement
{

	protected AppStartMeasurement(Core core, EventType eventtype, String s, boolean flag)
	{
		super(core, eventtype, s, flag, true, true);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:iload           4
	//    5    6:iconst_1        
	//    6    7:iconst_1        
	//    7    8:invokespecial   #9   <Method void ApplicationMeasurement(Core, EventType, String, boolean, boolean, boolean)>
		setLabel(new Label("ns_ap_gs", String.valueOf(core.getFirstInstallId()), Boolean.valueOf(false)));
	//    8   11:aload_0         
	//    9   12:new             #11  <Class Label>
	//   10   15:dup             
	//   11   16:ldc1            #13  <String "ns_ap_gs">
	//   12   18:aload_1         
	//   13   19:invokevirtual   #19  <Method long Core.getFirstInstallId()>
	//   14   22:invokestatic    #25  <Method String String.valueOf(long)>
	//   15   25:iconst_0        
	//   16   26:invokestatic    #30  <Method Boolean Boolean.valueOf(boolean)>
	//   17   29:invokespecial   #33  <Method void Label(String, String, Boolean)>
	//   18   32:invokevirtual   #37  <Method void setLabel(Label)>
		setLabel(new Label("ns_ap_install", String.valueOf(core.getInstallId()), Boolean.valueOf(false)));
	//   19   35:aload_0         
	//   20   36:new             #11  <Class Label>
	//   21   39:dup             
	//   22   40:ldc1            #39  <String "ns_ap_install">
	//   23   42:aload_1         
	//   24   43:invokevirtual   #42  <Method long Core.getInstallId()>
	//   25   46:invokestatic    #25  <Method String String.valueOf(long)>
	//   26   49:iconst_0        
	//   27   50:invokestatic    #30  <Method Boolean Boolean.valueOf(boolean)>
	//   28   53:invokespecial   #33  <Method void Label(String, String, Boolean)>
	//   29   56:invokevirtual   #37  <Method void setLabel(Label)>
		setLabel(new Label("ns_ap_runs", String.valueOf(core.getRunsCount()), Boolean.valueOf(false)));
	//   30   59:aload_0         
	//   31   60:new             #11  <Class Label>
	//   32   63:dup             
	//   33   64:ldc1            #44  <String "ns_ap_runs">
	//   34   66:aload_1         
	//   35   67:invokevirtual   #48  <Method int Core.getRunsCount()>
	//   36   70:invokestatic    #51  <Method String String.valueOf(int)>
	//   37   73:iconst_0        
	//   38   74:invokestatic    #30  <Method Boolean Boolean.valueOf(boolean)>
	//   39   77:invokespecial   #33  <Method void Label(String, String, Boolean)>
	//   40   80:invokevirtual   #37  <Method void setLabel(Label)>
		if(flag)
	//*  41   83:iload           4
	//*  42   85:ifeq            107
			setLabel(new Label("ns_ap_csf", "1", Boolean.valueOf(false)));
	//   43   88:aload_0         
	//   44   89:new             #11  <Class Label>
	//   45   92:dup             
	//   46   93:ldc1            #53  <String "ns_ap_csf">
	//   47   95:ldc1            #55  <String "1">
	//   48   97:iconst_0        
	//   49   98:invokestatic    #30  <Method Boolean Boolean.valueOf(boolean)>
	//   50  101:invokespecial   #33  <Method void Label(String, String, Boolean)>
	//   51  104:invokevirtual   #37  <Method void setLabel(Label)>
		eventtype = "0";
	//   52  107:ldc1            #57  <String "0">
	//   53  109:astore_2        
		if(RootDetector.isDeviceRooted())
	//*  54  110:invokestatic    #63  <Method boolean RootDetector.isDeviceRooted()>
	//*  55  113:ifeq            119
			eventtype = "1";
	//   56  116:ldc1            #55  <String "1">
	//   57  118:astore_2        
		setLabel(new Label("ns_ap_jb", ((String) (eventtype)), Boolean.valueOf(false)));
	//   58  119:aload_0         
	//   59  120:new             #11  <Class Label>
	//   60  123:dup             
	//   61  124:ldc1            #65  <String "ns_ap_jb">
	//   62  126:aload_2         
	//   63  127:iconst_0        
	//   64  128:invokestatic    #30  <Method Boolean Boolean.valueOf(boolean)>
	//   65  131:invokespecial   #33  <Method void Label(String, String, Boolean)>
	//   66  134:invokevirtual   #37  <Method void setLabel(Label)>
		setLabel(new Label("ns_ap_lastrun", String.valueOf(core.getPreviousGenesis()), Boolean.valueOf(false)));
	//   67  137:aload_0         
	//   68  138:new             #11  <Class Label>
	//   69  141:dup             
	//   70  142:ldc1            #67  <String "ns_ap_lastrun">
	//   71  144:aload_1         
	//   72  145:invokevirtual   #70  <Method long Core.getPreviousGenesis()>
	//   73  148:invokestatic    #25  <Method String String.valueOf(long)>
	//   74  151:iconst_0        
	//   75  152:invokestatic    #30  <Method Boolean Boolean.valueOf(boolean)>
	//   76  155:invokespecial   #33  <Method void Label(String, String, Boolean)>
	//   77  158:invokevirtual   #37  <Method void setLabel(Label)>
		eventtype = ((EventType) (core.getPreviousVersion()));
	//   78  161:aload_1         
	//   79  162:invokevirtual   #74  <Method String Core.getPreviousVersion()>
	//   80  165:astore_2        
		if(eventtype != null && ((String) (eventtype)).length() > 0)
	//*  81  166:aload_2         
	//*  82  167:ifnull          195
	//*  83  170:aload_2         
	//*  84  171:invokevirtual   #77  <Method int String.length()>
	//*  85  174:ifle            195
			setLabel(new Label("ns_ap_updated", ((String) (eventtype)), Boolean.valueOf(false)));
	//   86  177:aload_0         
	//   87  178:new             #11  <Class Label>
	//   88  181:dup             
	//   89  182:ldc1            #79  <String "ns_ap_updated">
	//   90  184:aload_2         
	//   91  185:iconst_0        
	//   92  186:invokestatic    #30  <Method Boolean Boolean.valueOf(boolean)>
	//   93  189:invokespecial   #33  <Method void Label(String, String, Boolean)>
	//   94  192:invokevirtual   #37  <Method void setLabel(Label)>
		eventtype = ((EventType) (core.getStorage().get("exception_ocurrences")));
	//   95  195:aload_1         
	//   96  196:invokevirtual   #83  <Method Storage Core.getStorage()>
	//   97  199:ldc1            #85  <String "exception_ocurrences">
	//   98  201:invokevirtual   #91  <Method String Storage.get(String)>
	//   99  204:astore_2        
		if(eventtype != null && ((String) (eventtype)).length() > 0 && !((String) (eventtype)).equals("0"))
	//* 100  205:aload_2         
	//* 101  206:ifnull          252
	//* 102  209:aload_2         
	//* 103  210:invokevirtual   #77  <Method int String.length()>
	//* 104  213:ifle            252
	//* 105  216:aload_2         
	//* 106  217:ldc1            #57  <String "0">
	//* 107  219:invokevirtual   #95  <Method boolean String.equals(Object)>
	//* 108  222:ifne            252
		{
			setLabel(new Label("ns_ap_er", ((String) (eventtype)), Boolean.valueOf(false)));
	//  109  225:aload_0         
	//  110  226:new             #11  <Class Label>
	//  111  229:dup             
	//  112  230:ldc1            #97  <String "ns_ap_er">
	//  113  232:aload_2         
	//  114  233:iconst_0        
	//  115  234:invokestatic    #30  <Method Boolean Boolean.valueOf(boolean)>
	//  116  237:invokespecial   #33  <Method void Label(String, String, Boolean)>
	//  117  240:invokevirtual   #37  <Method void setLabel(Label)>
			core.getStorage().remove("exception_ocurrences");
	//  118  243:aload_1         
	//  119  244:invokevirtual   #83  <Method Storage Core.getStorage()>
	//  120  247:ldc1            #85  <String "exception_ocurrences">
	//  121  249:invokevirtual   #101 <Method void Storage.remove(String)>
		}
		if(flag)
	//* 122  252:iload           4
	//* 123  254:ifeq            314
		{
			core = ((Core) (InstallReferrerReceiver.retrieveReferrerLabels(core.getAppContext())));
	//  124  257:aload_1         
	//  125  258:invokevirtual   #105 <Method android.content.Context Core.getAppContext()>
	//  126  261:invokestatic    #111 <Method HashMap InstallReferrerReceiver.retrieveReferrerLabels(android.content.Context)>
	//  127  264:astore_1        
			if(core != null)
	//* 128  265:aload_1         
	//* 129  266:ifnull          314
				for(eventtype = ((EventType) (((HashMap) (core)).keySet().iterator())); ((Iterator) (eventtype)).hasNext(); setLabel(s, (String)((HashMap) (core)).get(((Object) (s)))))
	//* 130  269:aload_1         
	//* 131  270:invokevirtual   #117 <Method Set HashMap.keySet()>
	//* 132  273:invokeinterface #123 <Method Iterator Set.iterator()>
	//* 133  278:astore_2        
	//* 134  279:aload_2         
	//* 135  280:invokeinterface #128 <Method boolean Iterator.hasNext()>
	//* 136  285:ifeq            314
					s = (String)((Iterator) (eventtype)).next();
	//  137  288:aload_2         
	//  138  289:invokeinterface #132 <Method Object Iterator.next()>
	//  139  294:checkcast       #21  <Class String>
	//  140  297:astore_3        

	//  141  298:aload_0         
	//  142  299:aload_3         
	//  143  300:aload_1         
	//  144  301:aload_3         
	//  145  302:invokevirtual   #135 <Method Object HashMap.get(Object)>
	//  146  305:checkcast       #21  <Class String>
	//  147  308:invokevirtual   #138 <Method void setLabel(String, String)>
		}
	//* 148  311:goto            279
	//  149  314:return          
	}
}

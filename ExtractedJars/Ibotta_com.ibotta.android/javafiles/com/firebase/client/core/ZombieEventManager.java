// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.firebase.client.core;

import com.firebase.client.core.view.QuerySpec;
import java.util.*;

// Referenced classes of package com.firebase.client.core:
//			EventRegistrationZombieListener, EventRegistration

public class ZombieEventManager
	implements EventRegistrationZombieListener
{

	private ZombieEventManager()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #23  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #25  <Class HashMap>
	//    4    8:dup             
	//    5    9:invokespecial   #26  <Method void HashMap()>
	//    6   12:putfield        #28  <Field HashMap globalEventRegistrations>
	//    7   15:return          
	}

	public static ZombieEventManager getInstance()
	{
		return defaultInstance;
	//    0    0:getstatic       #21  <Field ZombieEventManager defaultInstance>
	//    1    3:areturn         
	}

	private void unRecordEventRegistration(EventRegistration eventregistration)
	{
		HashMap hashmap = globalEventRegistrations;
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field HashMap globalEventRegistrations>
	//    2    4:astore          4
		hashmap;
	//    3    6:aload           4
		JVM INSTR monitorenter ;
	//    4    8:monitorenter    
		Object obj = ((Object) ((List)globalEventRegistrations.get(((Object) (eventregistration)))));
	//    5    9:aload_0         
	//    6   10:getfield        #28  <Field HashMap globalEventRegistrations>
	//    7   13:aload_1         
	//    8   14:invokevirtual   #38  <Method Object HashMap.get(Object)>
	//    9   17:checkcast       #40  <Class List>
	//   10   20:astore          5
		boolean flag = false;
	//   11   22:iconst_0        
	//   12   23:istore_3        
		if(obj == null) goto _L2; else goto _L1
	//   13   24:aload           5
	//   14   26:ifnull          85
_L1:
		int i = 0;
	//   15   29:iconst_0        
	//   16   30:istore_2        
_L10:
		if(i >= ((List) (obj)).size()) goto _L4; else goto _L3
	//   17   31:iload_2         
	//   18   32:aload           5
	//   19   34:invokeinterface #44  <Method int List.size()>
	//   20   39:icmpge          66
_L3:
		if(((List) (obj)).get(i) != eventregistration) goto _L6; else goto _L5
	//   21   42:aload           5
	//   22   44:iload_2         
	//   23   45:invokeinterface #47  <Method Object List.get(int)>
	//   24   50:aload_1         
	//   25   51:if_acmpne       197
_L5:
		((List) (obj)).remove(i);
	//   26   54:aload           5
	//   27   56:iload_2         
	//   28   57:invokeinterface #50  <Method Object List.remove(int)>
	//   29   62:pop             
	//*  30   63:goto            66
_L4:
		if(((List) (obj)).isEmpty())
	//*  31   66:aload           5
	//*  32   68:invokeinterface #54  <Method boolean List.isEmpty()>
	//*  33   73:ifeq            85
			globalEventRegistrations.remove(((Object) (eventregistration)));
	//   34   76:aload_0         
	//   35   77:getfield        #28  <Field HashMap globalEventRegistrations>
	//   36   80:aload_1         
	//   37   81:invokevirtual   #56  <Method Object HashMap.remove(Object)>
	//   38   84:pop             
_L2:
		if(eventregistration.getQuerySpec().isDefault()) goto _L8; else goto _L7
	//   39   85:aload_1         
	//   40   86:invokevirtual   #62  <Method QuerySpec EventRegistration.getQuerySpec()>
	//   41   89:invokevirtual   #67  <Method boolean QuerySpec.isDefault()>
	//   42   92:ifne            187
_L7:
		List list;
		obj = ((Object) (eventregistration.clone(QuerySpec.defaultQueryAtPath(eventregistration.getQuerySpec().getPath()))));
	//   43   95:aload_1         
	//   44   96:aload_1         
	//   45   97:invokevirtual   #62  <Method QuerySpec EventRegistration.getQuerySpec()>
	//   46  100:invokevirtual   #71  <Method Path QuerySpec.getPath()>
	//   47  103:invokestatic    #75  <Method QuerySpec QuerySpec.defaultQueryAtPath(Path)>
	//   48  106:invokevirtual   #79  <Method EventRegistration EventRegistration.clone(QuerySpec)>
	//   49  109:astore          5
		list = (List)globalEventRegistrations.get(obj);
	//   50  111:aload_0         
	//   51  112:getfield        #28  <Field HashMap globalEventRegistrations>
	//   52  115:aload           5
	//   53  117:invokevirtual   #38  <Method Object HashMap.get(Object)>
	//   54  120:checkcast       #40  <Class List>
	//   55  123:astore          6
		if(list == null) goto _L8; else goto _L9
	//   56  125:aload           6
	//   57  127:ifnull          187
_L9:
		i = ((int) (flag));
	//   58  130:iload_3         
	//   59  131:istore_2        
_L11:
		if(i < list.size())
	//*  60  132:iload_2         
	//*  61  133:aload           6
	//*  62  135:invokeinterface #44  <Method int List.size()>
	//*  63  140:icmpge          167
		{
			if(list.get(i) != eventregistration)
				break MISSING_BLOCK_LABEL_204;
	//   64  143:aload           6
	//   65  145:iload_2         
	//   66  146:invokeinterface #47  <Method Object List.get(int)>
	//   67  151:aload_1         
	//   68  152:if_acmpne       204
			list.remove(i);
	//   69  155:aload           6
	//   70  157:iload_2         
	//   71  158:invokeinterface #50  <Method Object List.remove(int)>
	//   72  163:pop             
		}
	//*  73  164:goto            167
		if(list.isEmpty())
	//*  74  167:aload           6
	//*  75  169:invokeinterface #54  <Method boolean List.isEmpty()>
	//*  76  174:ifeq            187
			globalEventRegistrations.remove(obj);
	//   77  177:aload_0         
	//   78  178:getfield        #28  <Field HashMap globalEventRegistrations>
	//   79  181:aload           5
	//   80  183:invokevirtual   #56  <Method Object HashMap.remove(Object)>
	//   81  186:pop             
_L8:
		hashmap;
	//   82  187:aload           4
		JVM INSTR monitorexit ;
	//   83  189:monitorexit     
		return;
	//   84  190:return          
		eventregistration;
	//   85  191:astore_1        
		hashmap;
	//   86  192:aload           4
		JVM INSTR monitorexit ;
	//   87  194:monitorexit     
		throw eventregistration;
	//   88  195:aload_1         
	//   89  196:athrow          
_L6:
		i++;
	//   90  197:iload_2         
	//   91  198:iconst_1        
	//   92  199:iadd            
	//   93  200:istore_2        
		  goto _L10
	//*  94  201:goto            31
		i++;
	//   95  204:iload_2         
	//   96  205:iconst_1        
	//   97  206:iadd            
	//   98  207:istore_2        
		  goto _L11
	//*  99  208:goto            132
	}

	public void onZombied(EventRegistration eventregistration)
	{
		unRecordEventRegistration(eventregistration);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #82  <Method void unRecordEventRegistration(EventRegistration)>
	//    3    5:return          
	}

	public void recordEventRegistration(EventRegistration eventregistration)
	{
		HashMap hashmap = globalEventRegistrations;
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field HashMap globalEventRegistrations>
	//    2    4:astore          4
		hashmap;
	//    3    6:aload           4
		JVM INSTR monitorenter ;
	//    4    8:monitorenter    
		List list = (List)globalEventRegistrations.get(((Object) (eventregistration)));
	//    5    9:aload_0         
	//    6   10:getfield        #28  <Field HashMap globalEventRegistrations>
	//    7   13:aload_1         
	//    8   14:invokevirtual   #38  <Method Object HashMap.get(Object)>
	//    9   17:checkcast       #40  <Class List>
	//   10   20:astore_3        
		Object obj;
		obj = ((Object) (list));
	//   11   21:aload_3         
	//   12   22:astore_2        
		if(list != null)
			break MISSING_BLOCK_LABEL_45;
	//   13   23:aload_3         
	//   14   24:ifnonnull       45
		obj = ((Object) (new ArrayList()));
	//   15   27:new             #85  <Class ArrayList>
	//   16   30:dup             
	//   17   31:invokespecial   #86  <Method void ArrayList()>
	//   18   34:astore_2        
		globalEventRegistrations.put(((Object) (eventregistration)), obj);
	//   19   35:aload_0         
	//   20   36:getfield        #28  <Field HashMap globalEventRegistrations>
	//   21   39:aload_1         
	//   22   40:aload_2         
	//   23   41:invokevirtual   #90  <Method Object HashMap.put(Object, Object)>
	//   24   44:pop             
		EventRegistration eventregistration1;
		((List) (obj)).add(((Object) (eventregistration)));
	//   25   45:aload_2         
	//   26   46:aload_1         
	//   27   47:invokeinterface #94  <Method boolean List.add(Object)>
	//   28   52:pop             
		if(eventregistration.getQuerySpec().isDefault())
			break MISSING_BLOCK_LABEL_125;
	//   29   53:aload_1         
	//   30   54:invokevirtual   #62  <Method QuerySpec EventRegistration.getQuerySpec()>
	//   31   57:invokevirtual   #67  <Method boolean QuerySpec.isDefault()>
	//   32   60:ifne            125
		eventregistration1 = eventregistration.clone(QuerySpec.defaultQueryAtPath(eventregistration.getQuerySpec().getPath()));
	//   33   63:aload_1         
	//   34   64:aload_1         
	//   35   65:invokevirtual   #62  <Method QuerySpec EventRegistration.getQuerySpec()>
	//   36   68:invokevirtual   #71  <Method Path QuerySpec.getPath()>
	//   37   71:invokestatic    #75  <Method QuerySpec QuerySpec.defaultQueryAtPath(Path)>
	//   38   74:invokevirtual   #79  <Method EventRegistration EventRegistration.clone(QuerySpec)>
	//   39   77:astore          5
		list = (List)globalEventRegistrations.get(((Object) (eventregistration1)));
	//   40   79:aload_0         
	//   41   80:getfield        #28  <Field HashMap globalEventRegistrations>
	//   42   83:aload           5
	//   43   85:invokevirtual   #38  <Method Object HashMap.get(Object)>
	//   44   88:checkcast       #40  <Class List>
	//   45   91:astore_3        
		obj = ((Object) (list));
	//   46   92:aload_3         
	//   47   93:astore_2        
		if(list != null)
			break MISSING_BLOCK_LABEL_117;
	//   48   94:aload_3         
	//   49   95:ifnonnull       117
		obj = ((Object) (new ArrayList()));
	//   50   98:new             #85  <Class ArrayList>
	//   51  101:dup             
	//   52  102:invokespecial   #86  <Method void ArrayList()>
	//   53  105:astore_2        
		globalEventRegistrations.put(((Object) (eventregistration1)), obj);
	//   54  106:aload_0         
	//   55  107:getfield        #28  <Field HashMap globalEventRegistrations>
	//   56  110:aload           5
	//   57  112:aload_2         
	//   58  113:invokevirtual   #90  <Method Object HashMap.put(Object, Object)>
	//   59  116:pop             
		((List) (obj)).add(((Object) (eventregistration)));
	//   60  117:aload_2         
	//   61  118:aload_1         
	//   62  119:invokeinterface #94  <Method boolean List.add(Object)>
	//   63  124:pop             
		eventregistration.setIsUserInitiated(true);
	//   64  125:aload_1         
	//   65  126:iconst_1        
	//   66  127:invokevirtual   #98  <Method void EventRegistration.setIsUserInitiated(boolean)>
		eventregistration.setOnZombied(((EventRegistrationZombieListener) (this)));
	//   67  130:aload_1         
	//   68  131:aload_0         
	//   69  132:invokevirtual   #102 <Method void EventRegistration.setOnZombied(EventRegistrationZombieListener)>
		hashmap;
	//   70  135:aload           4
		JVM INSTR monitorexit ;
	//   71  137:monitorexit     
		return;
	//   72  138:return          
		eventregistration;
	//   73  139:astore_1        
		hashmap;
	//   74  140:aload           4
		JVM INSTR monitorexit ;
	//   75  142:monitorexit     
		throw eventregistration;
	//   76  143:aload_1         
	//   77  144:athrow          
	}

	public void zombifyForRemove(EventRegistration eventregistration)
	{
		HashMap hashmap = globalEventRegistrations;
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field HashMap globalEventRegistrations>
	//    2    4:astore_3        
		hashmap;
	//    3    5:aload_3         
		JVM INSTR monitorenter ;
	//    4    6:monitorenter    
		List list = (List)globalEventRegistrations.get(((Object) (eventregistration)));
	//    5    7:aload_0         
	//    6    8:getfield        #28  <Field HashMap globalEventRegistrations>
	//    7   11:aload_1         
	//    8   12:invokevirtual   #38  <Method Object HashMap.get(Object)>
	//    9   15:checkcast       #40  <Class List>
	//   10   18:astore          4
		if(list == null) goto _L2; else goto _L1
	//   11   20:aload           4
	//   12   22:ifnull          124
_L1:
		if(list.isEmpty()) goto _L2; else goto _L3
	//   13   25:aload           4
	//   14   27:invokeinterface #54  <Method boolean List.isEmpty()>
	//   15   32:ifne            124
_L3:
		if(!eventregistration.getQuerySpec().isDefault()) goto _L5; else goto _L4
	//   16   35:aload_1         
	//   17   36:invokevirtual   #62  <Method QuerySpec EventRegistration.getQuerySpec()>
	//   18   39:invokevirtual   #67  <Method boolean QuerySpec.isDefault()>
	//   19   42:ifeq            110
_L4:
		int i;
		eventregistration = ((EventRegistration) (new HashSet()));
	//   20   45:new             #105 <Class HashSet>
	//   21   48:dup             
	//   22   49:invokespecial   #106 <Method void HashSet()>
	//   23   52:astore_1        
		i = list.size() - 1;
	//   24   53:aload           4
	//   25   55:invokeinterface #44  <Method int List.size()>
	//   26   60:iconst_1        
	//   27   61:isub            
	//   28   62:istore_2        
_L9:
		if(i < 0) goto _L2; else goto _L6
	//   29   63:iload_2         
	//   30   64:iflt            124
_L6:
		EventRegistration eventregistration1 = (EventRegistration)list.get(i);
	//   31   67:aload           4
	//   32   69:iload_2         
	//   33   70:invokeinterface #47  <Method Object List.get(int)>
	//   34   75:checkcast       #58  <Class EventRegistration>
	//   35   78:astore          5
		if(!((HashSet) (eventregistration)).contains(((Object) (eventregistration1.getQuerySpec()))))
	//*  36   80:aload_1         
	//*  37   81:aload           5
	//*  38   83:invokevirtual   #62  <Method QuerySpec EventRegistration.getQuerySpec()>
	//*  39   86:invokevirtual   #109 <Method boolean HashSet.contains(Object)>
	//*  40   89:ifne            132
		{
			((HashSet) (eventregistration)).add(((Object) (eventregistration1.getQuerySpec())));
	//   41   92:aload_1         
	//   42   93:aload           5
	//   43   95:invokevirtual   #62  <Method QuerySpec EventRegistration.getQuerySpec()>
	//   44   98:invokevirtual   #110 <Method boolean HashSet.add(Object)>
	//   45  101:pop             
			eventregistration1.zombify();
	//   46  102:aload           5
	//   47  104:invokevirtual   #113 <Method void EventRegistration.zombify()>
		}
		  goto _L7
	//*  48  107:goto            132
_L5:
		((EventRegistration)list.get(0)).zombify();
	//   49  110:aload           4
	//   50  112:iconst_0        
	//   51  113:invokeinterface #47  <Method Object List.get(int)>
	//   52  118:checkcast       #58  <Class EventRegistration>
	//   53  121:invokevirtual   #113 <Method void EventRegistration.zombify()>
_L2:
		hashmap;
	//   54  124:aload_3         
		JVM INSTR monitorexit ;
	//   55  125:monitorexit     
		return;
	//   56  126:return          
		eventregistration;
	//   57  127:astore_1        
		hashmap;
	//   58  128:aload_3         
		JVM INSTR monitorexit ;
	//   59  129:monitorexit     
		throw eventregistration;
	//   60  130:aload_1         
	//   61  131:athrow          
_L7:
		i--;
	//   62  132:iload_2         
	//   63  133:iconst_1        
	//   64  134:isub            
	//   65  135:istore_2        
		if(true) goto _L9; else goto _L8
	//   66  136:goto            63
_L8:
	}

	static final boolean $assertionsDisabled = false;
	private static ZombieEventManager defaultInstance = new ZombieEventManager();
	final HashMap globalEventRegistrations = new HashMap();

	static 
	{
	//    0    0:new             #2   <Class ZombieEventManager>
	//    1    3:dup             
	//    2    4:invokespecial   #19  <Method void ZombieEventManager()>
	//    3    7:putstatic       #21  <Field ZombieEventManager defaultInstance>
	//*   4   10:return          
	}
}

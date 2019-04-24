// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.model;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.gson.Gson;
import com.irobot.core.AnalyticsSubsystem;
import com.irobot.core.Assembler;
import com.irobot.core.AssetCapabilityUtils;
import com.irobot.core.AssetCloudConfigEvent;
import com.irobot.core.AssetId;
import com.irobot.core.AssetInfo;
import com.irobot.core.AssetService;
import com.irobot.core.AssetSkuEvent;
import com.irobot.core.AssetSoftwareVersionEvent;
import com.irobot.core.EventType;
import com.irobot.core.NetworkAddress;
import com.irobot.core.NetworkAddressEvent;
import com.irobot.core.NetworkType;
import com.irobot.core.PMIApplicationService;
import com.irobot.core.RobotNameEvent;
import com.irobot.core.SoftwareVersion;
import com.irobot.home.IRobotApplication;
import com.irobot.home.aws.authentication.a;
import com.irobot.home.core.CoreEventReceiver;
import com.irobot.home.util.j;
import com.irobot.home.util.o;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.irobot.home.model:
//			a, w, Robot, NetworkSettings, 
//			CloudConfig, RobotSystem, RobotV1, RobotV2, 
//			RobotV3, d

public class IRobotModel
{
	private static final class a extends Enum
	{

		public static a valueOf(String s)
		{
			return (a)Enum.valueOf(com/irobot/home/model/IRobotModel$a, s);
		//    0    0:ldc1            #2   <Class IRobotModel$a>
		//    1    2:aload_0         
		//    2    3:invokestatic    #39  <Method Enum Enum.valueOf(Class, String)>
		//    3    6:checkcast       #2   <Class IRobotModel$a>
		//    4    9:areturn         
		}

		public static a[] values()
		{
			return (a[])((a []) ($VALUES)).clone();
		//    0    0:getstatic       #31  <Field IRobotModel$a[] $VALUES>
		//    1    3:invokevirtual   #46  <Method Object _5B_Lcom.irobot.home.model.IRobotModel$a_3B_.clone()>
		//    2    6:checkcast       #42  <Class IRobotModel$a[]>
		//    3    9:areturn         
		}

		private static final a $VALUES[];
		public static final a DELETED;
		public static final a DETECTED;
		public static final a REGISTERED;

		static 
		{
			REGISTERED = new a("REGISTERED", 0);
		//    0    0:new             #2   <Class IRobotModel$a>
		//    1    3:dup             
		//    2    4:ldc1            #17  <String "REGISTERED">
		//    3    6:iconst_0        
		//    4    7:invokespecial   #21  <Method void IRobotModel$a(String, int)>
		//    5   10:putstatic       #23  <Field IRobotModel$a REGISTERED>
			DETECTED = new a("DETECTED", 1);
		//    6   13:new             #2   <Class IRobotModel$a>
		//    7   16:dup             
		//    8   17:ldc1            #24  <String "DETECTED">
		//    9   19:iconst_1        
		//   10   20:invokespecial   #21  <Method void IRobotModel$a(String, int)>
		//   11   23:putstatic       #26  <Field IRobotModel$a DETECTED>
			DELETED = new a("DELETED", 2);
		//   12   26:new             #2   <Class IRobotModel$a>
		//   13   29:dup             
		//   14   30:ldc1            #27  <String "DELETED">
		//   15   32:iconst_2        
		//   16   33:invokespecial   #21  <Method void IRobotModel$a(String, int)>
		//   17   36:putstatic       #29  <Field IRobotModel$a DELETED>
			$VALUES = (new a[] {
				REGISTERED, DETECTED, DELETED
			});
		//   18   39:iconst_3        
		//   19   40:anewarray       a[]
		//   20   43:dup             
		//   21   44:iconst_0        
		//   22   45:getstatic       #23  <Field IRobotModel$a REGISTERED>
		//   23   48:aastore         
		//   24   49:dup             
		//   25   50:iconst_1        
		//   26   51:getstatic       #26  <Field IRobotModel$a DETECTED>
		//   27   54:aastore         
		//   28   55:dup             
		//   29   56:iconst_2        
		//   30   57:getstatic       #29  <Field IRobotModel$a DELETED>
		//   31   60:aastore         
		//   32   61:putstatic       #31  <Field IRobotModel$a[] $VALUES>
		//*  33   64:return          
		}

		private a(String s, int i1)
		{
			super(s, i1);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #33  <Method void Enum(String, int)>
		//    4    6:return          
		}
	}

	private class b
	{

		public a a()
		{
			return b;
		//    0    0:aload_0         
		//    1    1:getfield        #23  <Field IRobotModel$a b>
		//    2    4:areturn         
		}

		public void a(a a1)
		{
			b = a1;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #23  <Field IRobotModel$a b>
		//    3    5:return          
		}

		public void a(com.irobot.home.model.a a1)
		{
			c = a1;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #21  <Field com.irobot.home.model.a c>
		//    3    5:return          
		}

		public com.irobot.home.model.a b()
		{
			return c;
		//    0    0:aload_0         
		//    1    1:getfield        #21  <Field com.irobot.home.model.a c>
		//    2    4:areturn         
		}

		final IRobotModel a;
		private a b;
		private com.irobot.home.model.a c;

		public b(com.irobot.home.model.a a1, a a2)
		{
			a = IRobotModel.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #16  <Field IRobotModel a>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #19  <Method void Object()>
			c = a1;
		//    5    9:aload_0         
		//    6   10:aload_2         
		//    7   11:putfield        #21  <Field com.irobot.home.model.a c>
			b = a2;
		//    8   14:aload_0         
		//    9   15:aload_3         
		//   10   16:putfield        #23  <Field IRobotModel$a b>
		//   11   19:return          
		}
	}


	public IRobotModel(IRobotApplication irobotapplication)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #36  <Method void Object()>
		c = new Object();
	//    2    4:aload_0         
	//    3    5:new             #4   <Class Object>
	//    4    8:dup             
	//    5    9:invokespecial   #36  <Method void Object()>
	//    6   12:putfield        #38  <Field Object c>
		i = new Comparator() {

			public int a(com.irobot.home.model.a a1, com.irobot.home.model.a a2)
			{
				return a1.a().getName().toLowerCase().compareTo(a2.a().getName().toLowerCase());
			//    0    0:aload_1         
			//    1    1:invokevirtual   #25  <Method AssetInfo com.irobot.home.model.a.a()>
			//    2    4:invokevirtual   #31  <Method String AssetInfo.getName()>
			//    3    7:invokevirtual   #36  <Method String String.toLowerCase()>
			//    4   10:aload_2         
			//    5   11:invokevirtual   #25  <Method AssetInfo com.irobot.home.model.a.a()>
			//    6   14:invokevirtual   #31  <Method String AssetInfo.getName()>
			//    7   17:invokevirtual   #36  <Method String String.toLowerCase()>
			//    8   20:invokevirtual   #40  <Method int String.compareTo(String)>
			//    9   23:ireturn         
			}

			public int compare(Object obj1, Object obj2)
			{
				return a((com.irobot.home.model.a)obj1, (com.irobot.home.model.a)obj2);
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:checkcast       #22  <Class com.irobot.home.model.a>
			//    3    5:aload_2         
			//    4    6:checkcast       #22  <Class com.irobot.home.model.a>
			//    5    9:invokevirtual   #44  <Method int a(com.irobot.home.model.a, com.irobot.home.model.a)>
			//    6   12:ireturn         
			}

			final IRobotModel a;

			
			{
				a = IRobotModel.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #15  <Field IRobotModel a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #18  <Method void Object()>
			//    5    9:return          
			}
		}
;
	//    7   15:aload_0         
	//    8   16:new             #6   <Class IRobotModel$1>
	//    9   19:dup             
	//   10   20:aload_0         
	//   11   21:invokespecial   #41  <Method void IRobotModel$1(IRobotModel)>
	//   12   24:putfield        #43  <Field Comparator i>
		synchronized(c)
	//*  13   27:aload_0         
	//*  14   28:getfield        #38  <Field Object c>
	//*  15   31:astore_2        
	//*  16   32:aload_2         
	//*  17   33:monitorenter    
		{
			d = new WeakReference(((Object) (irobotapplication)));
	//   18   34:aload_0         
	//   19   35:new             #45  <Class WeakReference>
	//   20   38:dup             
	//   21   39:aload_1         
	//   22   40:invokespecial   #48  <Method void WeakReference(Object)>
	//   23   43:putfield        #50  <Field WeakReference d>
			a = "";
	//   24   46:aload_0         
	//   25   47:ldc1            #52  <String "">
	//   26   49:putfield        #54  <Field String a>
			f = ((Map) (new HashMap()));
	//   27   52:aload_0         
	//   28   53:new             #56  <Class HashMap>
	//   29   56:dup             
	//   30   57:invokespecial   #57  <Method void HashMap()>
	//   31   60:putfield        #59  <Field Map f>
			g = 0;
	//   32   63:aload_0         
	//   33   64:iconst_0        
	//   34   65:putfield        #61  <Field int g>
			h = 0;
	//   35   68:aload_0         
	//   36   69:iconst_0        
	//   37   70:putfield        #63  <Field int h>
			e = new CoreEventReceiver(irobotapplication, Assembler.getInstance().getDomainEventBus());
	//   38   73:new             #65  <Class CoreEventReceiver>
	//   39   76:dup             
	//   40   77:aload_1         
	//   41   78:invokestatic    #71  <Method Assembler Assembler.getInstance()>
	//   42   81:invokevirtual   #75  <Method com.irobot.core.EventBusHandler Assembler.getDomainEventBus()>
	//   43   84:invokespecial   #78  <Method void CoreEventReceiver(IRobotApplication, com.irobot.core.EventBusHandler)>
	//   44   87:putstatic       #80  <Field CoreEventReceiver e>
		}
	//   45   90:aload_2         
	//   46   91:monitorexit     
		return;
	//   47   92:return          
		irobotapplication;
	//   48   93:astore_1        
		obj;
	//   49   94:aload_2         
		JVM INSTR monitorexit ;
	//   50   95:monitorexit     
		throw irobotapplication;
	//   51   96:aload_1         
	//   52   97:athrow          
	}

	private String a(Map map)
	{
		JSONException jsonexception;
		JSONObject jsonobject = new JSONObject();
	//    0    0:new             #86  <Class JSONObject>
	//    1    3:dup             
	//    2    4:invokespecial   #87  <Method void JSONObject()>
	//    3    7:astore_2        
		for(map = ((Map) (map.entrySet().iterator())); ((Iterator) (map)).hasNext();)
	//*   4    8:aload_1         
	//*   5    9:invokeinterface #93  <Method Set Map.entrySet()>
	//*   6   14:invokeinterface #99  <Method Iterator Set.iterator()>
	//*   7   19:astore_1        
	//*   8   20:aload_1         
	//*   9   21:invokeinterface #105 <Method boolean Iterator.hasNext()>
	//*  10   26:ifeq            72
		{
			java.util.Map.Entry entry = (java.util.Map.Entry)((Iterator) (map)).next();
	//   11   29:aload_1         
	//   12   30:invokeinterface #109 <Method Object Iterator.next()>
	//   13   35:checkcast       #111 <Class java.util.Map$Entry>
	//   14   38:astore_3        
			try
			{
				jsonobject.put((String)entry.getKey(), entry.getValue());
	//   15   39:aload_2         
	//   16   40:aload_3         
	//   17   41:invokeinterface #114 <Method Object java.util.Map$Entry.getKey()>
	//   18   46:checkcast       #116 <Class String>
	//   19   49:aload_3         
	//   20   50:invokeinterface #119 <Method Object java.util.Map$Entry.getValue()>
	//   21   55:invokevirtual   #123 <Method JSONObject JSONObject.put(String, Object)>
	//   22   58:pop             
			}
	//*  23   59:goto            20
	//*  24   62:ldc1            #125 <String "Model">
	//*  25   64:ldc1            #127 <String "Exception while making map json object.">
	//*  26   66:invokestatic    #132 <Method void o.e(String, String)>
	//*  27   69:goto            20
	//*  28   72:aload_2         
	//*  29   73:invokevirtual   #136 <Method String JSONObject.toString()>
	//*  30   76:areturn         
			// Misplaced declaration of an exception variable
			catch(JSONException jsonexception)
			{
				o.e("Model", "Exception while making map json object.");
			}
		}

		return jsonobject.toString();
	//*  31   77:astore_3        
	//*  32   78:goto            62
	}

	private void e(com.irobot.home.model.a a1)
	{
label0:
		{
			if(a1 == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       5
				return;
	//    2    4:return          
			synchronized(c)
	//*   3    5:aload_0         
	//*   4    6:getfield        #38  <Field Object c>
	//*   5    9:astore_2        
	//*   6   10:aload_2         
	//*   7   11:monitorenter    
			{
				if((IRobotApplication)d.get() != null)
					break label0;
	//    8   12:aload_0         
	//    9   13:getfield        #50  <Field WeakReference d>
	//   10   16:invokevirtual   #142 <Method Object WeakReference.get()>
	//   11   19:checkcast       #144 <Class IRobotApplication>
	//   12   22:ifnonnull       28
			}
	//   13   25:aload_2         
	//   14   26:monitorexit     
			return;
	//   15   27:return          
		}
		HashMap hashmap;
		hashmap = new HashMap();
	//   16   28:new             #56  <Class HashMap>
	//   17   31:dup             
	//   18   32:invokespecial   #57  <Method void HashMap()>
	//   19   35:astore_3        
		if(AssetCapabilityUtils.isCloudCapable(a1.a()))
	//*  20   36:aload_1         
	//*  21   37:invokevirtual   #149 <Method AssetInfo com.irobot.home.model.a.a()>
	//*  22   40:invokestatic    #155 <Method boolean AssetCapabilityUtils.isCloudCapable(AssetInfo)>
	//*  23   43:ifeq            78
		{
			if(a1 instanceof w)
	//*  24   46:aload_1         
	//*  25   47:instanceof      #157 <Class w>
	//*  26   50:ifeq            85
				hashmap.put(((Object) (a1.b().getId())), ((Object) (((w)a1).c().q())));
	//   27   53:aload_3         
	//   28   54:aload_1         
	//   29   55:invokevirtual   #160 <Method AssetId a.b()>
	//   30   58:invokevirtual   #165 <Method String AssetId.getId()>
	//   31   61:aload_1         
	//   32   62:checkcast       #157 <Class w>
	//   33   65:invokevirtual   #168 <Method Robot w.c()>
	//   34   68:invokevirtual   #173 <Method String Robot.q()>
	//   35   71:invokevirtual   #176 <Method Object HashMap.put(Object, Object)>
	//   36   74:pop             
			break MISSING_BLOCK_LABEL_85;
	//   37   75:goto            85
		}
		o.e("Model", "Cannot persist association info for non-AWS asset types");
	//   38   78:ldc1            #125 <String "Model">
	//   39   80:ldc1            #178 <String "Cannot persist association info for non-AWS asset types">
	//   40   82:invokestatic    #132 <Method void o.e(String, String)>
		if(!hashmap.isEmpty())
			break MISSING_BLOCK_LABEL_95;
	//   41   85:aload_3         
	//   42   86:invokevirtual   #181 <Method boolean HashMap.isEmpty()>
	//   43   89:ifeq            95
		obj;
	//   44   92:aload_2         
		JVM INSTR monitorexit ;
	//   45   93:monitorexit     
		return;
	//   46   94:return          
		a1 = ((com.irobot.home.model.a) (com.irobot.home.aws.authentication.a.c()));
	//   47   95:invokestatic    #185 <Method String a.c()>
	//   48   98:astore_1        
		Object obj1 = ((Object) (com.irobot.home.aws.authentication.a.b()));
	//   49   99:invokestatic    #188 <Method SharedPreferences a.b()>
	//   50  102:astore          5
		android.content.SharedPreferences.Editor editor = ((SharedPreferences) (obj1)).edit();
	//   51  104:aload           5
	//   52  106:invokeinterface #194 <Method android.content.SharedPreferences$Editor SharedPreferences.edit()>
	//   53  111:astore          4
		obj1 = ((Object) (((SharedPreferences) (obj1)).getStringSet(((String) (a1)), ((Set) (new HashSet())))));
	//   54  113:aload           5
	//   55  115:aload_1         
	//   56  116:new             #196 <Class HashSet>
	//   57  119:dup             
	//   58  120:invokespecial   #197 <Method void HashSet()>
	//   59  123:invokeinterface #201 <Method Set SharedPreferences.getStringSet(String, Set)>
	//   60  128:astore          5
		((Set) (obj1)).add(((Object) (a(((Map) (hashmap))))));
	//   61  130:aload           5
	//   62  132:aload_0         
	//   63  133:aload_3         
	//   64  134:invokespecial   #203 <Method String a(Map)>
	//   65  137:invokeinterface #207 <Method boolean Set.add(Object)>
	//   66  142:pop             
		editor.putStringSet(((String) (a1)), ((Set) (obj1)));
	//   67  143:aload           4
	//   68  145:aload_1         
	//   69  146:aload           5
	//   70  148:invokeinterface #213 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putStringSet(String, Set)>
	//   71  153:pop             
		editor.apply();
	//   72  154:aload           4
	//   73  156:invokeinterface #216 <Method void android.content.SharedPreferences$Editor.apply()>
		obj;
	//   74  161:aload_2         
		JVM INSTR monitorexit ;
	//   75  162:monitorexit     
		return;
	//   76  163:return          
		a1;
	//   77  164:astore_1        
		obj;
	//   78  165:aload_2         
		JVM INSTR monitorexit ;
	//   79  166:monitorexit     
		throw a1;
	//   80  167:aload_1         
	//   81  168:athrow          
	}

	private void j()
	{
		com.irobot.home.i.a a1 = (com.irobot.home.i.a)Assembler.getInstance().getDomainEventBus();
	//    0    0:invokestatic    #71  <Method Assembler Assembler.getInstance()>
	//    1    3:invokevirtual   #75  <Method com.irobot.core.EventBusHandler Assembler.getDomainEventBus()>
	//    2    6:checkcast       #219 <Class com.irobot.home.i.a>
	//    3    9:astore_1        
		a1.a(((Object) (this)), EventType.NetworkAddressEvent);
	//    4   10:aload_1         
	//    5   11:aload_0         
	//    6   12:getstatic       #225 <Field EventType EventType.NetworkAddressEvent>
	//    7   15:invokevirtual   #228 <Method void com.irobot.home.i.a.a(Object, EventType)>
		a1.a(((Object) (this)), EventType.RobotNameEvent);
	//    8   18:aload_1         
	//    9   19:aload_0         
	//   10   20:getstatic       #231 <Field EventType EventType.RobotNameEvent>
	//   11   23:invokevirtual   #228 <Method void com.irobot.home.i.a.a(Object, EventType)>
		a1.a(((Object) (this)), EventType.AssetSkuEvent);
	//   12   26:aload_1         
	//   13   27:aload_0         
	//   14   28:getstatic       #234 <Field EventType EventType.AssetSkuEvent>
	//   15   31:invokevirtual   #228 <Method void com.irobot.home.i.a.a(Object, EventType)>
		a1.a(((Object) (this)), EventType.AssetSoftwareVersionEvent);
	//   16   34:aload_1         
	//   17   35:aload_0         
	//   18   36:getstatic       #237 <Field EventType EventType.AssetSoftwareVersionEvent>
	//   19   39:invokevirtual   #228 <Method void com.irobot.home.i.a.a(Object, EventType)>
		a1.a(((Object) (this)), EventType.AssetCloudConfigEvent);
	//   20   42:aload_1         
	//   21   43:aload_0         
	//   22   44:getstatic       #240 <Field EventType EventType.AssetCloudConfigEvent>
	//   23   47:invokevirtual   #228 <Method void com.irobot.home.i.a.a(Object, EventType)>
	//   24   50:return          
	}

	private void k()
	{
		Object obj1 = c;
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field Object c>
	//    2    4:astore_2        
		obj1;
	//    3    5:aload_2         
		JVM INSTR monitorenter ;
	//    4    6:monitorenter    
		Object obj = ((Object) ((IRobotApplication)d.get()));
	//    5    7:aload_0         
	//    6    8:getfield        #50  <Field WeakReference d>
	//    7   11:invokevirtual   #142 <Method Object WeakReference.get()>
	//    8   14:checkcast       #144 <Class IRobotApplication>
	//    9   17:astore_1        
		if(obj != null)
			break MISSING_BLOCK_LABEL_25;
	//   10   18:aload_1         
	//   11   19:ifnonnull       25
		obj1;
	//   12   22:aload_2         
		JVM INSTR monitorexit ;
	//   13   23:monitorexit     
		return;
	//   14   24:return          
		android.content.SharedPreferences.Editor editor;
		HashMap hashmap;
		HashMap hashmap1;
		HashMap hashmap2;
		HashMap hashmap3;
		HashSet hashset;
		Iterator iterator;
		editor = ((IRobotApplication) (obj)).getBaseContext().getSharedPreferences("ROBOTS", 0).edit();
	//   15   25:aload_1         
	//   16   26:invokevirtual   #245 <Method Context IRobotApplication.getBaseContext()>
	//   17   29:ldc1            #247 <String "ROBOTS">
	//   18   31:iconst_0        
	//   19   32:invokevirtual   #253 <Method SharedPreferences Context.getSharedPreferences(String, int)>
	//   20   35:invokeinterface #194 <Method android.content.SharedPreferences$Editor SharedPreferences.edit()>
	//   21   40:astore_3        
		hashmap = new HashMap();
	//   22   41:new             #56  <Class HashMap>
	//   23   44:dup             
	//   24   45:invokespecial   #57  <Method void HashMap()>
	//   25   48:astore          4
		hashmap1 = new HashMap();
	//   26   50:new             #56  <Class HashMap>
	//   27   53:dup             
	//   28   54:invokespecial   #57  <Method void HashMap()>
	//   29   57:astore          5
		hashmap2 = new HashMap();
	//   30   59:new             #56  <Class HashMap>
	//   31   62:dup             
	//   32   63:invokespecial   #57  <Method void HashMap()>
	//   33   66:astore          6
		hashmap3 = new HashMap();
	//   34   68:new             #56  <Class HashMap>
	//   35   71:dup             
	//   36   72:invokespecial   #57  <Method void HashMap()>
	//   37   75:astore          7
		hashset = new HashSet();
	//   38   77:new             #196 <Class HashSet>
	//   39   80:dup             
	//   40   81:invokespecial   #197 <Method void HashSet()>
	//   41   84:astore          8
		editor.clear();
	//   42   86:aload_3         
	//   43   87:invokeinterface #256 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.clear()>
	//   44   92:pop             
		editor.putInt("version", 4);
	//   45   93:aload_3         
	//   46   94:ldc2            #258 <String "version">
	//   47   97:iconst_4        
	//   48   98:invokeinterface #262 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putInt(String, int)>
	//   49  103:pop             
		if(e() != null)
	//*  50  104:aload_0         
	//*  51  105:invokevirtual   #265 <Method com.irobot.home.model.a e()>
	//*  52  108:ifnull          172
		{
			obj = ((Object) (new StringBuilder()));
	//   53  111:new             #267 <Class StringBuilder>
	//   54  114:dup             
	//   55  115:invokespecial   #268 <Method void StringBuilder()>
	//   56  118:astore_1        
			((StringBuilder) (obj)).append("Saving current model : ");
	//   57  119:aload_1         
	//   58  120:ldc2            #270 <String "Saving current model : ">
	//   59  123:invokevirtual   #274 <Method StringBuilder StringBuilder.append(String)>
	//   60  126:pop             
			((StringBuilder) (obj)).append(e().b().getId());
	//   61  127:aload_1         
	//   62  128:aload_0         
	//   63  129:invokevirtual   #265 <Method com.irobot.home.model.a e()>
	//   64  132:invokevirtual   #160 <Method AssetId a.b()>
	//   65  135:invokevirtual   #165 <Method String AssetId.getId()>
	//   66  138:invokevirtual   #274 <Method StringBuilder StringBuilder.append(String)>
	//   67  141:pop             
			o.b("App", ((StringBuilder) (obj)).toString());
	//   68  142:ldc2            #276 <String "App">
	//   69  145:aload_1         
	//   70  146:invokevirtual   #277 <Method String StringBuilder.toString()>
	//   71  149:invokestatic    #279 <Method void o.b(String, String)>
			editor.putString("current", e().b().getId());
	//   72  152:aload_3         
	//   73  153:ldc2            #281 <String "current">
	//   74  156:aload_0         
	//   75  157:invokevirtual   #265 <Method com.irobot.home.model.a e()>
	//   76  160:invokevirtual   #160 <Method AssetId a.b()>
	//   77  163:invokevirtual   #165 <Method String AssetId.getId()>
	//   78  166:invokeinterface #285 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putString(String, String)>
	//   79  171:pop             
		}
		iterator = f().iterator();
	//   80  172:aload_0         
	//   81  173:invokevirtual   #288 <Method List f()>
	//   82  176:invokeinterface #291 <Method Iterator List.iterator()>
	//   83  181:astore          9
_L15:
		if(!iterator.hasNext()) goto _L2; else goto _L1
	//   84  183:aload           9
	//   85  185:invokeinterface #105 <Method boolean Iterator.hasNext()>
	//   86  190:ifeq            526
_L1:
		com.irobot.home.model.a a1;
		a1 = (com.irobot.home.model.a)iterator.next();
	//   87  193:aload           9
	//   88  195:invokeinterface #109 <Method Object Iterator.next()>
	//   89  200:checkcast       #146 <Class com.irobot.home.model.a>
	//   90  203:astore          10
		obj = ((Object) (new StringBuilder()));
	//   91  205:new             #267 <Class StringBuilder>
	//   92  208:dup             
	//   93  209:invokespecial   #268 <Method void StringBuilder()>
	//   94  212:astore_1        
		((StringBuilder) (obj)).append("Persisting data for asset ");
	//   95  213:aload_1         
	//   96  214:ldc2            #293 <String "Persisting data for asset ">
	//   97  217:invokevirtual   #274 <Method StringBuilder StringBuilder.append(String)>
	//   98  220:pop             
		((StringBuilder) (obj)).append(a1.b().getId());
	//   99  221:aload_1         
	//  100  222:aload           10
	//  101  224:invokevirtual   #160 <Method AssetId a.b()>
	//  102  227:invokevirtual   #165 <Method String AssetId.getId()>
	//  103  230:invokevirtual   #274 <Method StringBuilder StringBuilder.append(String)>
	//  104  233:pop             
		o.b("Model", ((StringBuilder) (obj)).toString());
	//  105  234:ldc1            #125 <String "Model">
	//  106  236:aload_1         
	//  107  237:invokevirtual   #277 <Method String StringBuilder.toString()>
	//  108  240:invokestatic    #279 <Method void o.b(String, String)>
		if(!AssetCapabilityUtils.isCloudCapable(a1.a())) goto _L4; else goto _L3
	//  109  243:aload           10
	//  110  245:invokevirtual   #149 <Method AssetInfo com.irobot.home.model.a.a()>
	//  111  248:invokestatic    #155 <Method boolean AssetCapabilityUtils.isCloudCapable(AssetInfo)>
	//  112  251:ifeq            507
_L3:
		w w1;
		Object obj2;
		w1 = (w)a1;
	//  113  254:aload           10
	//  114  256:checkcast       #157 <Class w>
	//  115  259:astore          11
		obj2 = ((Object) (a1.b().getId()));
	//  116  261:aload           10
	//  117  263:invokevirtual   #160 <Method AssetId a.b()>
	//  118  266:invokevirtual   #165 <Method String AssetId.getId()>
	//  119  269:astore          12
		((Map) (hashmap)).put(obj2, ((Object) (w1.c().q())));
	//  120  271:aload           4
	//  121  273:aload           12
	//  122  275:aload           11
	//  123  277:invokevirtual   #168 <Method Robot w.c()>
	//  124  280:invokevirtual   #173 <Method String Robot.q()>
	//  125  283:invokeinterface #294 <Method Object Map.put(Object, Object)>
	//  126  288:pop             
		if(!com.irobot.home.util.j.i(w1.d())) goto _L6; else goto _L5
	//  127  289:aload           11
	//  128  291:invokevirtual   #296 <Method String w.d()>
	//  129  294:invokestatic    #301 <Method boolean j.i(String)>
	//  130  297:ifeq            309
_L5:
		obj = ((Object) (w1.d()));
	//  131  300:aload           11
	//  132  302:invokevirtual   #296 <Method String w.d()>
	//  133  305:astore_1        
		  goto _L7
	//* 134  306:goto            324
_L6:
		obj = ((Object) (w1.c().d().e().host()));
	//  135  309:aload           11
	//  136  311:invokevirtual   #168 <Method Robot w.c()>
	//  137  314:invokevirtual   #304 <Method NetworkSettings Robot.d()>
	//  138  317:invokevirtual   #309 <Method NetworkAddress NetworkSettings.e()>
	//  139  320:invokevirtual   #314 <Method String NetworkAddress.host()>
	//  140  323:astore_1        
_L7:
		((Map) (hashmap1)).put(obj2, obj);
	//  141  324:aload           5
	//  142  326:aload           12
	//  143  328:aload_1         
	//  144  329:invokeinterface #294 <Method Object Map.put(Object, Object)>
	//  145  334:pop             
		if(!com.irobot.home.util.j.i(w1.e())) goto _L9; else goto _L8
	//  146  335:aload           11
	//  147  337:invokevirtual   #316 <Method String w.e()>
	//  148  340:invokestatic    #301 <Method boolean j.i(String)>
	//  149  343:ifeq            355
_L8:
		obj = ((Object) (w1.e()));
	//  150  346:aload           11
	//  151  348:invokevirtual   #316 <Method String w.e()>
	//  152  351:astore_1        
		  goto _L10
	//* 153  352:goto            367
_L9:
		obj = ((Object) (w1.c().p().a()));
	//  154  355:aload           11
	//  155  357:invokevirtual   #168 <Method Robot w.c()>
	//  156  360:invokevirtual   #320 <Method CloudConfig Robot.p()>
	//  157  363:invokevirtual   #324 <Method String com.irobot.home.model.CloudConfig.a()>
	//  158  366:astore_1        
_L10:
		((Map) (hashmap2)).put(obj2, obj);
	//  159  367:aload           6
	//  160  369:aload           12
	//  161  371:aload_1         
	//  162  372:invokeinterface #294 <Method Object Map.put(Object, Object)>
	//  163  377:pop             
		if(!com.irobot.home.util.j.i(w1.f())) goto _L12; else goto _L11
	//  164  378:aload           11
	//  165  380:invokevirtual   #326 <Method String w.f()>
	//  166  383:invokestatic    #301 <Method boolean j.i(String)>
	//  167  386:ifeq            398
_L11:
		obj = ((Object) (w1.f()));
	//  168  389:aload           11
	//  169  391:invokevirtual   #326 <Method String w.f()>
	//  170  394:astore_1        
		  goto _L13
	//* 171  395:goto            410
_L12:
		obj = ((Object) (w1.c().d().p()));
	//  172  398:aload           11
	//  173  400:invokevirtual   #168 <Method Robot w.c()>
	//  174  403:invokevirtual   #304 <Method NetworkSettings Robot.d()>
	//  175  406:invokevirtual   #328 <Method String NetworkSettings.p()>
	//  176  409:astore_1        
_L13:
		((Map) (hashmap3)).put(obj2, obj);
	//  177  410:aload           7
	//  178  412:aload           12
	//  179  414:aload_1         
	//  180  415:invokeinterface #294 <Method Object Map.put(Object, Object)>
	//  181  420:pop             
		if(TextUtils.isEmpty(((CharSequence) (w1.a().getSku()))))
	//* 182  421:aload           11
	//* 183  423:invokevirtual   #329 <Method AssetInfo com.irobot.home.model.w.a()>
	//* 184  426:invokevirtual   #334 <Method String AssetInfo.getSku()>
	//* 185  429:invokestatic    #339 <Method boolean TextUtils.isEmpty(CharSequence)>
	//* 186  432:ifeq            451
			w1.a().setSku(w1.c().v());
	//  187  435:aload           11
	//  188  437:invokevirtual   #329 <Method AssetInfo com.irobot.home.model.w.a()>
	//  189  440:aload           11
	//  190  442:invokevirtual   #168 <Method Robot w.c()>
	//  191  445:invokevirtual   #342 <Method String Robot.v()>
	//  192  448:invokevirtual   #346 <Method void AssetInfo.setSku(String)>
		if(w1.a().getSoftwareVersion() != null) goto _L4; else goto _L14
	//  193  451:aload           11
	//  194  453:invokevirtual   #329 <Method AssetInfo com.irobot.home.model.w.a()>
	//  195  456:invokevirtual   #349 <Method String AssetInfo.getSoftwareVersion()>
	//  196  459:ifnonnull       507
_L14:
		obj2 = ((Object) (w1.a()));
	//  197  462:aload           11
	//  198  464:invokevirtual   #329 <Method AssetInfo com.irobot.home.model.w.a()>
	//  199  467:astore          12
		if(w1.c().a.c() == null)
			break MISSING_BLOCK_LABEL_666;
	//  200  469:aload           11
	//  201  471:invokevirtual   #168 <Method Robot w.c()>
	//  202  474:getfield        #352 <Field RobotSystem com.irobot.home.model.Robot.a>
	//  203  477:invokevirtual   #357 <Method SoftwareVersion RobotSystem.c()>
	//  204  480:ifnull          666
		obj = ((Object) (w1.c().a.c().toString()));
	//  205  483:aload           11
	//  206  485:invokevirtual   #168 <Method Robot w.c()>
	//  207  488:getfield        #352 <Field RobotSystem com.irobot.home.model.Robot.a>
	//  208  491:invokevirtual   #357 <Method SoftwareVersion RobotSystem.c()>
	//  209  494:invokevirtual   #360 <Method String SoftwareVersion.toString()>
	//  210  497:astore_1        
	//* 211  498:goto            501
_L16:
		((AssetInfo) (obj2)).setSoftwareVersion(((String) (obj)));
	//  212  501:aload           12
	//  213  503:aload_1         
	//  214  504:invokevirtual   #363 <Method void AssetInfo.setSoftwareVersion(String)>
_L4:
		((Set) (hashset)).add(((Object) (a1.a().asJson())));
	//  215  507:aload           8
	//  216  509:aload           10
	//  217  511:invokevirtual   #149 <Method AssetInfo com.irobot.home.model.a.a()>
	//  218  514:invokevirtual   #366 <Method String AssetInfo.asJson()>
	//  219  517:invokeinterface #207 <Method boolean Set.add(Object)>
	//  220  522:pop             
		  goto _L15
	//* 221  523:goto            183
_L2:
		if(((Map) (hashmap)).size() > 0 && ((Map) (hashmap1)).size() > 0 && ((Map) (hashmap2)).size() > 0 && ((Map) (hashmap3)).size() > 0)
	//* 222  526:aload           4
	//* 223  528:invokeinterface #370 <Method int Map.size()>
	//* 224  533:ifle            630
	//* 225  536:aload           5
	//* 226  538:invokeinterface #370 <Method int Map.size()>
	//* 227  543:ifle            630
	//* 228  546:aload           6
	//* 229  548:invokeinterface #370 <Method int Map.size()>
	//* 230  553:ifle            630
	//* 231  556:aload           7
	//* 232  558:invokeinterface #370 <Method int Map.size()>
	//* 233  563:ifle            630
		{
			editor.putString("passwords", a(((Map) (hashmap))));
	//  234  566:aload_3         
	//  235  567:ldc2            #372 <String "passwords">
	//  236  570:aload_0         
	//  237  571:aload           4
	//  238  573:invokespecial   #203 <Method String a(Map)>
	//  239  576:invokeinterface #285 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putString(String, String)>
	//  240  581:pop             
			editor.putString("remoteHost", a(((Map) (hashmap2))));
	//  241  582:aload_3         
	//  242  583:ldc2            #374 <String "remoteHost">
	//  243  586:aload_0         
	//  244  587:aload           6
	//  245  589:invokespecial   #203 <Method String a(Map)>
	//  246  592:invokeinterface #285 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putString(String, String)>
	//  247  597:pop             
			editor.putString("localNetworkAddress", a(((Map) (hashmap1))));
	//  248  598:aload_3         
	//  249  599:ldc2            #376 <String "localNetworkAddress">
	//  250  602:aload_0         
	//  251  603:aload           5
	//  252  605:invokespecial   #203 <Method String a(Map)>
	//  253  608:invokeinterface #285 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putString(String, String)>
	//  254  613:pop             
			editor.putString("macAddresses", a(((Map) (hashmap3))));
	//  255  614:aload_3         
	//  256  615:ldc2            #378 <String "macAddresses">
	//  257  618:aload_0         
	//  258  619:aload           7
	//  259  621:invokespecial   #203 <Method String a(Map)>
	//  260  624:invokeinterface #285 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putString(String, String)>
	//  261  629:pop             
		}
		if(((Set) (hashset)).size() > 0)
	//* 262  630:aload           8
	//* 263  632:invokeinterface #379 <Method int Set.size()>
	//* 264  637:ifle            652
			editor.putStringSet("assetInfo", ((Set) (hashset)));
	//  265  640:aload_3         
	//  266  641:ldc2            #381 <String "assetInfo">
	//  267  644:aload           8
	//  268  646:invokeinterface #213 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putStringSet(String, Set)>
	//  269  651:pop             
		editor.apply();
	//  270  652:aload_3         
	//  271  653:invokeinterface #216 <Method void android.content.SharedPreferences$Editor.apply()>
		obj1;
	//  272  658:aload_2         
		JVM INSTR monitorexit ;
	//  273  659:monitorexit     
		return;
	//  274  660:return          
		obj;
	//  275  661:astore_1        
		obj1;
	//  276  662:aload_2         
		JVM INSTR monitorexit ;
	//  277  663:monitorexit     
		throw obj;
	//  278  664:aload_1         
	//  279  665:athrow          
		obj = "";
	//  280  666:ldc1            #52  <String "">
	//  281  668:astore_1        
		  goto _L16
	//* 282  669:goto            501
	}

	private void l()
	{
		Object obj = c;
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field Object c>
	//    2    4:astore_1        
		obj;
	//    3    5:aload_1         
		JVM INSTR monitorenter ;
	//    4    6:monitorenter    
		ArrayList arraylist;
		arraylist = new ArrayList();
	//    5    7:new             #384 <Class ArrayList>
	//    6   10:dup             
	//    7   11:invokespecial   #385 <Method void ArrayList()>
	//    8   14:astore_2        
		for(Iterator iterator = f().iterator(); iterator.hasNext(); arraylist.add(((Object) (((com.irobot.home.model.a)iterator.next()).a()))));
	//    9   15:aload_0         
	//   10   16:invokevirtual   #288 <Method List f()>
	//   11   19:invokeinterface #291 <Method Iterator List.iterator()>
	//   12   24:astore_3        
	//   13   25:aload_3         
	//   14   26:invokeinterface #105 <Method boolean Iterator.hasNext()>
	//   15   31:ifeq            54
	//   16   34:aload_2         
	//   17   35:aload_3         
	//   18   36:invokeinterface #109 <Method Object Iterator.next()>
	//   19   41:checkcast       #146 <Class com.irobot.home.model.a>
	//   20   44:invokevirtual   #149 <Method AssetInfo com.irobot.home.model.a.a()>
	//   21   47:invokevirtual   #386 <Method boolean ArrayList.add(Object)>
	//   22   50:pop             
	//*  23   51:goto            25
		AnalyticsSubsystem.getInstance().trackRobotAssetsForUser(arraylist);
	//   24   54:invokestatic    #391 <Method AnalyticsSubsystem AnalyticsSubsystem.getInstance()>
	//   25   57:aload_2         
	//   26   58:invokevirtual   #395 <Method void AnalyticsSubsystem.trackRobotAssetsForUser(ArrayList)>
		obj;
	//   27   61:aload_1         
		JVM INSTR monitorexit ;
	//   28   62:monitorexit     
		return;
	//   29   63:return          
		Exception exception;
		exception;
	//   30   64:astore_2        
		obj;
	//   31   65:aload_1         
		JVM INSTR monitorexit ;
	//   32   66:monitorexit     
		throw exception;
	//   33   67:aload_2         
	//   34   68:athrow          
	}

	public HashMap a()
	{
		Object obj = c;
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field Object c>
	//    2    4:astore_1        
		obj;
	//    3    5:aload_1         
		JVM INSTR monitorenter ;
	//    4    6:monitorenter    
		HashMap hashmap;
		hashmap = new HashMap();
	//    5    7:new             #56  <Class HashMap>
	//    6   10:dup             
	//    7   11:invokespecial   #57  <Method void HashMap()>
	//    8   14:astore_2        
		Iterator iterator = f.values().iterator();
	//    9   15:aload_0         
	//   10   16:getfield        #59  <Field Map f>
	//   11   19:invokeinterface #400 <Method Collection Map.values()>
	//   12   24:invokeinterface #403 <Method Iterator Collection.iterator()>
	//   13   29:astore_3        
		do
		{
			if(!iterator.hasNext())
				break;
	//   14   30:aload_3         
	//   15   31:invokeinterface #105 <Method boolean Iterator.hasNext()>
	//   16   36:ifeq            89
			Object obj1 = ((Object) ((b)iterator.next()));
	//   17   39:aload_3         
	//   18   40:invokeinterface #109 <Method Object Iterator.next()>
	//   19   45:checkcast       #13  <Class IRobotModel$b>
	//   20   48:astore          4
			if(((b) (obj1)).a() == a.REGISTERED)
	//*  21   50:aload           4
	//*  22   52:invokevirtual   #406 <Method IRobotModel$a com.irobot.home.model.IRobotModel$b.a()>
	//*  23   55:getstatic       #410 <Field IRobotModel$a IRobotModel$a.REGISTERED>
	//*  24   58:if_acmpne       30
			{
				obj1 = ((Object) (((b) (obj1)).b()));
	//   25   61:aload           4
	//   26   63:invokevirtual   #412 <Method com.irobot.home.model.a IRobotModel$b.b()>
	//   27   66:astore          4
				hashmap.put(((Object) (((com.irobot.home.model.a) (obj1)).b().getId())), ((Object) (((com.irobot.home.model.a) (obj1)).a())));
	//   28   68:aload_2         
	//   29   69:aload           4
	//   30   71:invokevirtual   #160 <Method AssetId a.b()>
	//   31   74:invokevirtual   #165 <Method String AssetId.getId()>
	//   32   77:aload           4
	//   33   79:invokevirtual   #149 <Method AssetInfo com.irobot.home.model.a.a()>
	//   34   82:invokevirtual   #176 <Method Object HashMap.put(Object, Object)>
	//   35   85:pop             
			}
		} while(true);
	//   36   86:goto            30
		obj;
	//   37   89:aload_1         
		JVM INSTR monitorexit ;
	//   38   90:monitorexit     
		return hashmap;
	//   39   91:aload_2         
	//   40   92:areturn         
		Exception exception;
		exception;
	//   41   93:astore_2        
		obj;
	//   42   94:aload_1         
		JVM INSTR monitorexit ;
	//   43   95:monitorexit     
		throw exception;
	//   44   96:aload_2         
	//   45   97:athrow          
	}

	public void a(AssetInfo assetinfo)
	{
		b(com.irobot.home.util.j.a(assetinfo.getAssetId().getId()));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #417 <Method AssetId AssetInfo.getAssetId()>
	//    3    5:invokevirtual   #165 <Method String AssetId.getId()>
	//    4    8:invokestatic    #420 <Method com.irobot.home.model.a j.a(String)>
	//    5   11:invokevirtual   #422 <Method void b(com.irobot.home.model.a)>
	//    6   14:return          
	}

	public void a(com.irobot.home.model.a a1)
	{
		String s;
		a a2;
label0:
		{
			synchronized(c)
	//*   0    0:aload_0         
	//*   1    1:getfield        #38  <Field Object c>
	//*   2    4:astore_3        
	//*   3    5:aload_3         
	//*   4    6:monitorenter    
			{
				s = a1.b().getId();
	//    5    7:aload_1         
	//    6    8:invokevirtual   #160 <Method AssetId a.b()>
	//    7   11:invokevirtual   #165 <Method String AssetId.getId()>
	//    8   14:astore          4
				if(!f.containsKey(((Object) (s))))
					break MISSING_BLOCK_LABEL_145;
	//    9   16:aload_0         
	//   10   17:getfield        #59  <Field Map f>
	//   11   20:aload           4
	//   12   22:invokeinterface #425 <Method boolean Map.containsKey(Object)>
	//   13   27:ifeq            145
				a2 = ((b)f.get(((Object) (s)))).a();
	//   14   30:aload_0         
	//   15   31:getfield        #59  <Field Map f>
	//   16   34:aload           4
	//   17   36:invokeinterface #428 <Method Object Map.get(Object)>
	//   18   41:checkcast       #13  <Class IRobotModel$b>
	//   19   44:invokevirtual   #406 <Method IRobotModel$a com.irobot.home.model.IRobotModel$b.a()>
	//   20   47:astore          5
				if(a2 != a.REGISTERED)
					break label0;
	//   21   49:aload           5
	//   22   51:getstatic       #410 <Field IRobotModel$a IRobotModel$a.REGISTERED>
	//   23   54:if_acmpne       68
				o.b("Model", "Registered robot detected, skipping.");
	//   24   57:ldc1            #125 <String "Model">
	//   25   59:ldc2            #430 <String "Registered robot detected, skipping.">
	//   26   62:invokestatic    #279 <Method void o.b(String, String)>
			}
	//   27   65:aload_3         
	//   28   66:monitorexit     
			return;
	//   29   67:return          
		}
		int i1;
		if(a2 == a.DETECTED)
			break MISSING_BLOCK_LABEL_193;
	//   30   68:aload           5
	//   31   70:getstatic       #433 <Field IRobotModel$a IRobotModel$a.DETECTED>
	//   32   73:if_acmpeq       193
		((b)f.get(((Object) (s)))).a(a1);
	//   33   76:aload_0         
	//   34   77:getfield        #59  <Field Map f>
	//   35   80:aload           4
	//   36   82:invokeinterface #428 <Method Object Map.get(Object)>
	//   37   87:checkcast       #13  <Class IRobotModel$b>
	//   38   90:aload_1         
	//   39   91:invokevirtual   #435 <Method void com.irobot.home.model.IRobotModel$b.a(com.irobot.home.model.a)>
		((b)f.get(((Object) (s)))).a(a.DETECTED);
	//   40   94:aload_0         
	//   41   95:getfield        #59  <Field Map f>
	//   42   98:aload           4
	//   43  100:invokeinterface #428 <Method Object Map.get(Object)>
	//   44  105:checkcast       #13  <Class IRobotModel$b>
	//   45  108:getstatic       #433 <Field IRobotModel$a IRobotModel$a.DETECTED>
	//   46  111:invokevirtual   #438 <Method void com.irobot.home.model.IRobotModel$b.a(IRobotModel$a)>
		Assembler.getInstance().getPMIApplicationService().registerAsset(a1.a().convertToPMI());
	//   47  114:invokestatic    #71  <Method Assembler Assembler.getInstance()>
	//   48  117:invokevirtual   #442 <Method PMIApplicationService Assembler.getPMIApplicationService()>
	//   49  120:aload_1         
	//   50  121:invokevirtual   #149 <Method AssetInfo com.irobot.home.model.a.a()>
	//   51  124:invokevirtual   #446 <Method com.irobot.core.PMIAssetInfo AssetInfo.convertToPMI()>
	//   52  127:invokevirtual   #452 <Method void PMIApplicationService.registerAsset(com.irobot.core.PMIAssetInfo)>
		i1 = h;
	//   53  130:aload_0         
	//   54  131:getfield        #63  <Field int h>
	//   55  134:istore_2        
_L1:
		h = i1 + 1;
	//   56  135:aload_0         
	//   57  136:iload_2         
	//   58  137:iconst_1        
	//   59  138:iadd            
	//   60  139:putfield        #63  <Field int h>
		break MISSING_BLOCK_LABEL_193;
	//   61  142:goto            193
		f.put(((Object) (s)), ((Object) (new b(a1, a.DETECTED))));
	//   62  145:aload_0         
	//   63  146:getfield        #59  <Field Map f>
	//   64  149:aload           4
	//   65  151:new             #13  <Class IRobotModel$b>
	//   66  154:dup             
	//   67  155:aload_0         
	//   68  156:aload_1         
	//   69  157:getstatic       #433 <Field IRobotModel$a IRobotModel$a.DETECTED>
	//   70  160:invokespecial   #455 <Method void IRobotModel$b(IRobotModel, com.irobot.home.model.a, IRobotModel$a)>
	//   71  163:invokeinterface #294 <Method Object Map.put(Object, Object)>
	//   72  168:pop             
		Assembler.getInstance().getPMIApplicationService().registerAsset(a1.a().convertToPMI());
	//   73  169:invokestatic    #71  <Method Assembler Assembler.getInstance()>
	//   74  172:invokevirtual   #442 <Method PMIApplicationService Assembler.getPMIApplicationService()>
	//   75  175:aload_1         
	//   76  176:invokevirtual   #149 <Method AssetInfo com.irobot.home.model.a.a()>
	//   77  179:invokevirtual   #446 <Method com.irobot.core.PMIAssetInfo AssetInfo.convertToPMI()>
	//   78  182:invokevirtual   #452 <Method void PMIApplicationService.registerAsset(com.irobot.core.PMIAssetInfo)>
		i1 = h;
	//   79  185:aload_0         
	//   80  186:getfield        #63  <Field int h>
	//   81  189:istore_2        
		  goto _L1
	//*  82  190:goto            135
		obj;
	//   83  193:aload_3         
		JVM INSTR monitorexit ;
	//   84  194:monitorexit     
		return;
	//   85  195:return          
		a1;
	//   86  196:astore_1        
		obj;
	//   87  197:aload_3         
		JVM INSTR monitorexit ;
	//   88  198:monitorexit     
		throw a1;
	//   89  199:aload_1         
	//   90  200:athrow          
	}

	public void a(String s)
	{
label0:
		{
			synchronized(c)
	//*   0    0:aload_0         
	//*   1    1:getfield        #38  <Field Object c>
	//*   2    4:astore_3        
	//*   3    5:aload_3         
	//*   4    6:monitorenter    
			{
				if(!com.irobot.home.util.j.i(a))
					break MISSING_BLOCK_LABEL_63;
	//    5    7:aload_0         
	//    6    8:getfield        #54  <Field String a>
	//    7   11:invokestatic    #301 <Method boolean j.i(String)>
	//    8   14:ifeq            63
				if(!a.equals(((Object) (s))))
					break label0;
	//    9   17:aload_0         
	//   10   18:getfield        #54  <Field String a>
	//   11   21:aload_1         
	//   12   22:invokevirtual   #458 <Method boolean String.equals(Object)>
	//   13   25:ifeq            50
				o.b("Model", String.format("%s is already current, rejecting setCurrentAsset() request", new Object[] {
					s
				}));
	//   14   28:ldc1            #125 <String "Model">
	//   15   30:ldc2            #460 <String "%s is already current, rejecting setCurrentAsset() request">
	//   16   33:iconst_1        
	//   17   34:anewarray       Object[]
	//   18   37:dup             
	//   19   38:iconst_0        
	//   20   39:aload_1         
	//   21   40:aastore         
	//   22   41:invokestatic    #464 <Method String String.format(String, Object[])>
	//   23   44:invokestatic    #279 <Method void o.b(String, String)>
			}
	//   24   47:aload_3         
	//   25   48:monitorexit     
			return;
	//   26   49:return          
		}
		((com.irobot.home.i.a)Assembler.getInstance().getDomainEventBus()).a(((Object) (this)));
	//   27   50:invokestatic    #71  <Method Assembler Assembler.getInstance()>
	//   28   53:invokevirtual   #75  <Method com.irobot.core.EventBusHandler Assembler.getDomainEventBus()>
	//   29   56:checkcast       #219 <Class com.irobot.home.i.a>
	//   30   59:aload_0         
	//   31   60:invokevirtual   #466 <Method void com.irobot.home.i.a.a(Object)>
		if(com.irobot.home.util.j.i(s))
	//*  32   63:aload_1         
	//*  33   64:invokestatic    #301 <Method boolean j.i(String)>
	//*  34   67:ifeq            125
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   35   70:new             #267 <Class StringBuilder>
	//   36   73:dup             
	//   37   74:invokespecial   #268 <Method void StringBuilder()>
	//   38   77:astore_2        
			stringbuilder.append("Changing current robot from ");
	//   39   78:aload_2         
	//   40   79:ldc2            #468 <String "Changing current robot from ">
	//   41   82:invokevirtual   #274 <Method StringBuilder StringBuilder.append(String)>
	//   42   85:pop             
			stringbuilder.append(a);
	//   43   86:aload_2         
	//   44   87:aload_0         
	//   45   88:getfield        #54  <Field String a>
	//   46   91:invokevirtual   #274 <Method StringBuilder StringBuilder.append(String)>
	//   47   94:pop             
			stringbuilder.append(" to ");
	//   48   95:aload_2         
	//   49   96:ldc2            #470 <String " to ">
	//   50   99:invokevirtual   #274 <Method StringBuilder StringBuilder.append(String)>
	//   51  102:pop             
			stringbuilder.append(s);
	//   52  103:aload_2         
	//   53  104:aload_1         
	//   54  105:invokevirtual   #274 <Method StringBuilder StringBuilder.append(String)>
	//   55  108:pop             
			o.b("Model", stringbuilder.toString());
	//   56  109:ldc1            #125 <String "Model">
	//   57  111:aload_2         
	//   58  112:invokevirtual   #277 <Method String StringBuilder.toString()>
	//   59  115:invokestatic    #279 <Method void o.b(String, String)>
			j();
	//   60  118:aload_0         
	//   61  119:invokespecial   #472 <Method void j()>
			break MISSING_BLOCK_LABEL_133;
	//   62  122:goto            133
		}
		o.b("Model", "Invalid id passed into set current asset which is okay when removing an asset.");
	//   63  125:ldc1            #125 <String "Model">
	//   64  127:ldc2            #474 <String "Invalid id passed into set current asset which is okay when removing an asset.">
	//   65  130:invokestatic    #279 <Method void o.b(String, String)>
		a = s;
	//   66  133:aload_0         
	//   67  134:aload_1         
	//   68  135:putfield        #54  <Field String a>
		Object obj;
		obj = null;
	//   69  138:aconst_null     
	//   70  139:astore_2        
		s = ((String) (obj));
	//   71  140:aload_2         
	//   72  141:astore_1        
		if(a == null)
			break MISSING_BLOCK_LABEL_172;
	//   73  142:aload_0         
	//   74  143:getfield        #54  <Field String a>
	//   75  146:ifnull          172
		s = ((String) (obj));
	//   76  149:aload_2         
	//   77  150:astore_1        
		if(a.length() != 0)
	//*  78  151:aload_0         
	//*  79  152:getfield        #54  <Field String a>
	//*  80  155:invokevirtual   #477 <Method int String.length()>
	//*  81  158:ifeq            172
			s = ((String) (com.irobot.home.util.j.a(a).a()));
	//   82  161:aload_0         
	//   83  162:getfield        #54  <Field String a>
	//   84  165:invokestatic    #420 <Method com.irobot.home.model.a j.a(String)>
	//   85  168:invokevirtual   #149 <Method AssetInfo com.irobot.home.model.a.a()>
	//   86  171:astore_1        
		Assembler.getInstance().getAssetService().setCurrentAssetInfo(((AssetInfo) (s)));
	//   87  172:invokestatic    #71  <Method Assembler Assembler.getInstance()>
	//   88  175:invokevirtual   #481 <Method AssetService Assembler.getAssetService()>
	//   89  178:aload_1         
	//   90  179:invokevirtual   #486 <Method void AssetService.setCurrentAssetInfo(AssetInfo)>
		obj1;
	//   91  182:aload_3         
		JVM INSTR monitorexit ;
	//   92  183:monitorexit     
		return;
	//   93  184:return          
		s;
	//   94  185:astore_1        
		obj1;
	//   95  186:aload_3         
		JVM INSTR monitorexit ;
	//   96  187:monitorexit     
		throw s;
	//   97  188:aload_1         
	//   98  189:athrow          
	}

	public int b()
	{
		return g;
	//    0    0:aload_0         
	//    1    1:getfield        #61  <Field int g>
	//    2    4:ireturn         
	}

	public void b(com.irobot.home.model.a a1)
	{
		if(!Assembler.getInstance().isInitialized(a1.b()))
	//*   0    0:invokestatic    #71  <Method Assembler Assembler.getInstance()>
	//*   1    3:aload_1         
	//*   2    4:invokevirtual   #160 <Method AssetId a.b()>
	//*   3    7:invokevirtual   #490 <Method boolean Assembler.isInitialized(AssetId)>
	//*   4   10:ifne            33
		{
			IRobotApplication irobotapplication = (IRobotApplication)d.get();
	//    5   13:aload_0         
	//    6   14:getfield        #50  <Field WeakReference d>
	//    7   17:invokevirtual   #142 <Method Object WeakReference.get()>
	//    8   20:checkcast       #144 <Class IRobotApplication>
	//    9   23:astore_2        
			if(irobotapplication != null)
	//*  10   24:aload_2         
	//*  11   25:ifnull          33
				irobotapplication.a(a1);
	//   12   28:aload_2         
	//   13   29:aload_1         
	//   14   30:invokevirtual   #491 <Method void IRobotApplication.a(com.irobot.home.model.a)>
		}
		d(a1);
	//   15   33:aload_0         
	//   16   34:aload_1         
	//   17   35:invokevirtual   #493 <Method void d(com.irobot.home.model.a)>
		l();
	//   18   38:aload_0         
	//   19   39:invokespecial   #495 <Method void l()>
		AnalyticsSubsystem.getInstance().trackRobotAdded(a1.a());
	//   20   42:invokestatic    #391 <Method AnalyticsSubsystem AnalyticsSubsystem.getInstance()>
	//   21   45:aload_1         
	//   22   46:invokevirtual   #149 <Method AssetInfo com.irobot.home.model.a.a()>
	//   23   49:invokevirtual   #498 <Method void AnalyticsSubsystem.trackRobotAdded(AssetInfo)>
		synchronized(c)
	//*  24   52:aload_0         
	//*  25   53:getfield        #38  <Field Object c>
	//*  26   56:astore_2        
	//*  27   57:aload_2         
	//*  28   58:monitorenter    
		{
			a(a1.b().getId());
	//   29   59:aload_0         
	//   30   60:aload_1         
	//   31   61:invokevirtual   #160 <Method AssetId a.b()>
	//   32   64:invokevirtual   #165 <Method String AssetId.getId()>
	//   33   67:invokevirtual   #500 <Method void a(String)>
		}
	//   34   70:aload_2         
	//   35   71:monitorexit     
		k();
	//   36   72:aload_0         
	//   37   73:invokespecial   #502 <Method void k()>
		return;
	//   38   76:return          
		a1;
	//   39   77:astore_1        
		obj;
	//   40   78:aload_2         
		JVM INSTR monitorexit ;
	//   41   79:monitorexit     
		throw a1;
	//   42   80:aload_1         
	//   43   81:athrow          
	}

	public boolean b(String s)
	{
		Object obj = c;
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field Object c>
	//    2    4:astore_3        
		obj;
	//    3    5:aload_3         
		JVM INSTR monitorenter ;
	//    4    6:monitorenter    
		boolean flag;
		if(f.containsKey(((Object) (s))) && ((b)f.get(((Object) (s)))).a() == a.REGISTERED)
	//*   5    7:aload_0         
	//*   6    8:getfield        #59  <Field Map f>
	//*   7   11:aload_1         
	//*   8   12:invokeinterface #425 <Method boolean Map.containsKey(Object)>
	//*   9   17:ifeq            56
	//*  10   20:aload_0         
	//*  11   21:getfield        #59  <Field Map f>
	//*  12   24:aload_1         
	//*  13   25:invokeinterface #428 <Method Object Map.get(Object)>
	//*  14   30:checkcast       #13  <Class IRobotModel$b>
	//*  15   33:invokevirtual   #406 <Method IRobotModel$a com.irobot.home.model.IRobotModel$b.a()>
	//*  16   36:getstatic       #410 <Field IRobotModel$a IRobotModel$a.REGISTERED>
	//*  17   39:if_acmpne       56
			flag = true;
	//   18   42:iconst_1        
	//   19   43:istore_2        
		else
	//*  20   44:goto            47
	//*  21   47:aload_3         
	//*  22   48:monitorexit     
	//*  23   49:iload_2         
	//*  24   50:ireturn         
	//*  25   51:astore_1        
	//*  26   52:aload_3         
	//*  27   53:monitorexit     
	//*  28   54:aload_1         
	//*  29   55:athrow          
			flag = false;
	//   30   56:iconst_0        
	//   31   57:istore_2        
		obj;
		JVM INSTR monitorexit ;
		return flag;
		s;
		obj;
		JVM INSTR monitorexit ;
		throw s;
	//*  32   58:goto            47
	}

	public com.irobot.home.model.a c()
	{
		Object obj1 = c;
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field Object c>
	//    2    4:astore_2        
		obj1;
	//    3    5:aload_2         
		JVM INSTR monitorenter ;
	//    4    6:monitorenter    
		if(!f.containsKey(((Object) (b)))) goto _L2; else goto _L1
	//    5    7:aload_0         
	//    6    8:getfield        #59  <Field Map f>
	//    7   11:aload_0         
	//    8   12:getfield        #504 <Field String b>
	//    9   15:invokeinterface #425 <Method boolean Map.containsKey(Object)>
	//   10   20:ifeq            55
_L1:
		Object obj = ((Object) (((b)f.get(((Object) (b)))).b()));
	//   11   23:aload_0         
	//   12   24:getfield        #59  <Field Map f>
	//   13   27:aload_0         
	//   14   28:getfield        #504 <Field String b>
	//   15   31:invokeinterface #428 <Method Object Map.get(Object)>
	//   16   36:checkcast       #13  <Class IRobotModel$b>
	//   17   39:invokevirtual   #412 <Method com.irobot.home.model.a IRobotModel$b.b()>
	//   18   42:astore_1        
	//*  19   43:goto            46
_L4:
		obj1;
	//   20   46:aload_2         
		JVM INSTR monitorexit ;
	//   21   47:monitorexit     
		return ((com.irobot.home.model.a) (obj));
	//   22   48:aload_1         
	//   23   49:areturn         
		obj;
	//   24   50:astore_1        
		obj1;
	//   25   51:aload_2         
		JVM INSTR monitorexit ;
	//   26   52:monitorexit     
		throw obj;
	//   27   53:aload_1         
	//   28   54:athrow          
_L2:
		obj = null;
	//   29   55:aconst_null     
	//   30   56:astore_1        
		if(true) goto _L4; else goto _L3
	//   31   57:goto            46
_L3:
	}

	public void c(com.irobot.home.model.a a1)
	{
		if(a1 != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          72
		{
			synchronized(c)
	//*   2    4:aload_0         
	//*   3    5:getfield        #38  <Field Object c>
	//*   4    8:astore_2        
	//*   5    9:aload_2         
	//*   6   10:monitorenter    
			{
				String s = a1.b().getId();
	//    7   11:aload_1         
	//    8   12:invokevirtual   #160 <Method AssetId a.b()>
	//    9   15:invokevirtual   #165 <Method String AssetId.getId()>
	//   10   18:astore_3        
				if(!f.containsKey(((Object) (s))))
	//*  11   19:aload_0         
	//*  12   20:getfield        #59  <Field Map f>
	//*  13   23:aload_3         
	//*  14   24:invokeinterface #425 <Method boolean Map.containsKey(Object)>
	//*  15   29:ifne            55
					f.put(((Object) (s)), ((Object) (new b(a1, a.DETECTED))));
	//   16   32:aload_0         
	//   17   33:getfield        #59  <Field Map f>
	//   18   36:aload_3         
	//   19   37:new             #13  <Class IRobotModel$b>
	//   20   40:dup             
	//   21   41:aload_0         
	//   22   42:aload_1         
	//   23   43:getstatic       #433 <Field IRobotModel$a IRobotModel$a.DETECTED>
	//   24   46:invokespecial   #455 <Method void IRobotModel$b(IRobotModel, com.irobot.home.model.a, IRobotModel$a)>
	//   25   49:invokeinterface #294 <Method Object Map.put(Object, Object)>
	//   26   54:pop             
				b = s;
	//   27   55:aload_0         
	//   28   56:aload_3         
	//   29   57:putfield        #504 <Field String b>
				j();
	//   30   60:aload_0         
	//   31   61:invokespecial   #472 <Method void j()>
			}
	//   32   64:aload_2         
	//   33   65:monitorexit     
			return;
	//   34   66:return          
		} else
	//*  35   67:astore_1        
	//*  36   68:aload_2         
	//*  37   69:monitorexit     
	//*  38   70:aload_1         
	//*  39   71:athrow          
		{
			o.e("Model", "Called setSoftApConnectedRobot with null robot.");
	//   40   72:ldc1            #125 <String "Model">
	//   41   74:ldc2            #506 <String "Called setSoftApConnectedRobot with null robot.">
	//   42   77:invokestatic    #132 <Method void o.e(String, String)>
			return;
	//   43   80:return          
		}
		a1;
		obj;
		JVM INSTR monitorexit ;
		throw a1;
	}

	public boolean c(String s)
	{
		Object obj = c;
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field Object c>
	//    2    4:astore          5
		obj;
	//    3    6:aload           5
		JVM INSTR monitorenter ;
	//    4    8:monitorenter    
		boolean flag2 = b(s);
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:invokevirtual   #508 <Method boolean b(String)>
	//    8   14:istore          4
		boolean flag1;
		flag1 = false;
	//    9   16:iconst_0        
	//   10   17:istore_3        
		if(!flag2)
			break MISSING_BLOCK_LABEL_216;
	//   11   18:iload           4
	//   12   20:ifeq            216
		com.irobot.home.model.a a1 = ((b)f.get(((Object) (s)))).b();
	//   13   23:aload_0         
	//   14   24:getfield        #59  <Field Map f>
	//   15   27:aload_1         
	//   16   28:invokeinterface #428 <Method Object Map.get(Object)>
	//   17   33:checkcast       #13  <Class IRobotModel$b>
	//   18   36:invokevirtual   #412 <Method com.irobot.home.model.a IRobotModel$b.b()>
	//   19   39:astore          6
		if(AssetCapabilityUtils.isAwsEnabledAsset(a1.a()))
	//*  20   41:aload           6
	//*  21   43:invokevirtual   #149 <Method AssetInfo com.irobot.home.model.a.a()>
	//*  22   46:invokestatic    #511 <Method boolean AssetCapabilityUtils.isAwsEnabledAsset(AssetInfo)>
	//*  23   49:ifeq            58
			e(a1);
	//   24   52:aload_0         
	//   25   53:aload           6
	//   26   55:invokespecial   #513 <Method void e(com.irobot.home.model.a)>
		((b)f.get(((Object) (s)))).a(a.DELETED);
	//   27   58:aload_0         
	//   28   59:getfield        #59  <Field Map f>
	//   29   62:aload_1         
	//   30   63:invokeinterface #428 <Method Object Map.get(Object)>
	//   31   68:checkcast       #13  <Class IRobotModel$b>
	//   32   71:getstatic       #516 <Field IRobotModel$a IRobotModel$a.DELETED>
	//   33   74:invokevirtual   #438 <Method void com.irobot.home.model.IRobotModel$b.a(IRobotModel$a)>
		Assembler.getInstance().getPMIApplicationService().removeAsset(a1.a().getAssetId().getId());
	//   34   77:invokestatic    #71  <Method Assembler Assembler.getInstance()>
	//   35   80:invokevirtual   #442 <Method PMIApplicationService Assembler.getPMIApplicationService()>
	//   36   83:aload           6
	//   37   85:invokevirtual   #149 <Method AssetInfo com.irobot.home.model.a.a()>
	//   38   88:invokevirtual   #417 <Method AssetId AssetInfo.getAssetId()>
	//   39   91:invokevirtual   #165 <Method String AssetId.getId()>
	//   40   94:invokevirtual   #519 <Method void PMIApplicationService.removeAsset(String)>
		g = g - 1;
	//   41   97:aload_0         
	//   42   98:aload_0         
	//   43   99:getfield        #61  <Field int g>
	//   44  102:iconst_1        
	//   45  103:isub            
	//   46  104:putfield        #61  <Field int g>
		if(!a.equals(((Object) (s))))
			break MISSING_BLOCK_LABEL_204;
	//   47  107:aload_0         
	//   48  108:getfield        #54  <Field String a>
	//   49  111:aload_1         
	//   50  112:invokevirtual   #458 <Method boolean String.equals(Object)>
	//   51  115:ifeq            204
		s = ((String) (f.entrySet().iterator()));
	//   52  118:aload_0         
	//   53  119:getfield        #59  <Field Map f>
	//   54  122:invokeinterface #93  <Method Set Map.entrySet()>
	//   55  127:invokeinterface #99  <Method Iterator Set.iterator()>
	//   56  132:astore_1        
_L2:
		boolean flag = flag1;
	//   57  133:iload_3         
	//   58  134:istore_2        
		java.util.Map.Entry entry;
		if(!((Iterator) (s)).hasNext())
			break MISSING_BLOCK_LABEL_190;
	//   59  135:aload_1         
	//   60  136:invokeinterface #105 <Method boolean Iterator.hasNext()>
	//   61  141:ifeq            190
		entry = (java.util.Map.Entry)((Iterator) (s)).next();
	//   62  144:aload_1         
	//   63  145:invokeinterface #109 <Method Object Iterator.next()>
	//   64  150:checkcast       #111 <Class java.util.Map$Entry>
	//   65  153:astore          6
		if(((b)entry.getValue()).a() != a.REGISTERED) goto _L2; else goto _L1
	//   66  155:aload           6
	//   67  157:invokeinterface #119 <Method Object java.util.Map$Entry.getValue()>
	//   68  162:checkcast       #13  <Class IRobotModel$b>
	//   69  165:invokevirtual   #406 <Method IRobotModel$a com.irobot.home.model.IRobotModel$b.a()>
	//   70  168:getstatic       #410 <Field IRobotModel$a IRobotModel$a.REGISTERED>
	//   71  171:if_acmpne       133
_L1:
		a((String)entry.getKey());
	//   72  174:aload_0         
	//   73  175:aload           6
	//   74  177:invokeinterface #114 <Method Object java.util.Map$Entry.getKey()>
	//   75  182:checkcast       #116 <Class String>
	//   76  185:invokevirtual   #500 <Method void a(String)>
		flag = true;
	//   77  188:iconst_1        
	//   78  189:istore_2        
		if(flag)
			break MISSING_BLOCK_LABEL_204;
	//   79  190:iload_2         
	//   80  191:ifne            204
		a("");
	//   81  194:aload_0         
	//   82  195:ldc1            #52  <String "">
	//   83  197:invokevirtual   #500 <Method void a(String)>
		k();
	//   84  200:aload_0         
	//   85  201:invokespecial   #502 <Method void k()>
		l();
	//   86  204:aload_0         
	//   87  205:invokespecial   #495 <Method void l()>
		com.irobot.home.util.j.l();
	//   88  208:invokestatic    #520 <Method void j.l()>
		obj;
	//   89  211:aload           5
		JVM INSTR monitorexit ;
	//   90  213:monitorexit     
		return true;
	//   91  214:iconst_1        
	//   92  215:ireturn         
		obj;
	//   93  216:aload           5
		JVM INSTR monitorexit ;
	//   94  218:monitorexit     
		return false;
	//   95  219:iconst_0        
	//   96  220:ireturn         
		s;
	//   97  221:astore_1        
		obj;
	//   98  222:aload           5
		JVM INSTR monitorexit ;
	//   99  224:monitorexit     
		throw s;
	//  100  225:aload_1         
	//  101  226:athrow          
	}

	public com.irobot.home.model.a d(String s)
	{
label0:
		{
			synchronized(c)
	//*   0    0:aload_0         
	//*   1    1:getfield        #38  <Field Object c>
	//*   2    4:astore_2        
	//*   3    5:aload_2         
	//*   4    6:monitorenter    
			{
				if(!f.containsKey(((Object) (s))) || ((b)f.get(((Object) (s)))).a() == a.DELETED)
					break label0;
	//    5    7:aload_0         
	//    6    8:getfield        #59  <Field Map f>
	//    7   11:aload_1         
	//    8   12:invokeinterface #425 <Method boolean Map.containsKey(Object)>
	//    9   17:ifeq            63
	//   10   20:aload_0         
	//   11   21:getfield        #59  <Field Map f>
	//   12   24:aload_1         
	//   13   25:invokeinterface #428 <Method Object Map.get(Object)>
	//   14   30:checkcast       #13  <Class IRobotModel$b>
	//   15   33:invokevirtual   #406 <Method IRobotModel$a com.irobot.home.model.IRobotModel$b.a()>
	//   16   36:getstatic       #516 <Field IRobotModel$a IRobotModel$a.DELETED>
	//   17   39:if_acmpeq       63
				s = ((String) (((b)f.get(((Object) (s)))).b()));
	//   18   42:aload_0         
	//   19   43:getfield        #59  <Field Map f>
	//   20   46:aload_1         
	//   21   47:invokeinterface #428 <Method Object Map.get(Object)>
	//   22   52:checkcast       #13  <Class IRobotModel$b>
	//   23   55:invokevirtual   #412 <Method com.irobot.home.model.a IRobotModel$b.b()>
	//   24   58:astore_1        
			}
	//   25   59:aload_2         
	//   26   60:monitorexit     
			return ((com.irobot.home.model.a) (s));
	//   27   61:aload_1         
	//   28   62:areturn         
		}
		if(!f.containsKey(((Object) (s))))
			break MISSING_BLOCK_LABEL_97;
	//   29   63:aload_0         
	//   30   64:getfield        #59  <Field Map f>
	//   31   67:aload_1         
	//   32   68:invokeinterface #425 <Method boolean Map.containsKey(Object)>
	//   33   73:ifeq            97
		s = ((String) (((b)f.get(((Object) (s)))).b()));
	//   34   76:aload_0         
	//   35   77:getfield        #59  <Field Map f>
	//   36   80:aload_1         
	//   37   81:invokeinterface #428 <Method Object Map.get(Object)>
	//   38   86:checkcast       #13  <Class IRobotModel$b>
	//   39   89:invokevirtual   #412 <Method com.irobot.home.model.a IRobotModel$b.b()>
	//   40   92:astore_1        
	//*  41   93:aload_2         
	//*  42   94:monitorexit     
		return ((com.irobot.home.model.a) (s));
	//   43   95:aload_1         
	//   44   96:areturn         
		obj;
	//   45   97:aload_2         
		JVM INSTR monitorexit ;
	//   46   98:monitorexit     
		return null;
	//   47   99:aconst_null     
	//   48  100:areturn         
		s;
	//   49  101:astore_1        
		obj;
	//   50  102:aload_2         
		JVM INSTR monitorexit ;
	//   51  103:monitorexit     
		throw s;
	//   52  104:aload_1         
	//   53  105:athrow          
	}

	public void d()
	{
		Object obj = c;
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field Object c>
	//    2    4:astore_1        
		obj;
	//    3    5:aload_1         
		JVM INSTR monitorenter ;
	//    4    6:monitorenter    
		Iterator iterator = f.entrySet().iterator();
	//    5    7:aload_0         
	//    6    8:getfield        #59  <Field Map f>
	//    7   11:invokeinterface #93  <Method Set Map.entrySet()>
	//    8   16:invokeinterface #99  <Method Iterator Set.iterator()>
	//    9   21:astore_2        
		do
		{
			if(!iterator.hasNext())
				break;
	//   10   22:aload_2         
	//   11   23:invokeinterface #105 <Method boolean Iterator.hasNext()>
	//   12   28:ifeq            87
			java.util.Map.Entry entry = (java.util.Map.Entry)iterator.next();
	//   13   31:aload_2         
	//   14   32:invokeinterface #109 <Method Object Iterator.next()>
	//   15   37:checkcast       #111 <Class java.util.Map$Entry>
	//   16   40:astore_3        
			if(((b)entry.getValue()).a() == a.DETECTED)
	//*  17   41:aload_3         
	//*  18   42:invokeinterface #119 <Method Object java.util.Map$Entry.getValue()>
	//*  19   47:checkcast       #13  <Class IRobotModel$b>
	//*  20   50:invokevirtual   #406 <Method IRobotModel$a com.irobot.home.model.IRobotModel$b.a()>
	//*  21   53:getstatic       #433 <Field IRobotModel$a IRobotModel$a.DETECTED>
	//*  22   56:if_acmpne       22
			{
				((b)entry.getValue()).a(a.DELETED);
	//   23   59:aload_3         
	//   24   60:invokeinterface #119 <Method Object java.util.Map$Entry.getValue()>
	//   25   65:checkcast       #13  <Class IRobotModel$b>
	//   26   68:getstatic       #516 <Field IRobotModel$a IRobotModel$a.DELETED>
	//   27   71:invokevirtual   #438 <Method void com.irobot.home.model.IRobotModel$b.a(IRobotModel$a)>
				h = h - 1;
	//   28   74:aload_0         
	//   29   75:aload_0         
	//   30   76:getfield        #63  <Field int h>
	//   31   79:iconst_1        
	//   32   80:isub            
	//   33   81:putfield        #63  <Field int h>
			}
		} while(true);
	//   34   84:goto            22
		obj;
	//   35   87:aload_1         
		JVM INSTR monitorexit ;
	//   36   88:monitorexit     
		return;
	//   37   89:return          
		Exception exception;
		exception;
	//   38   90:astore_2        
		obj;
	//   39   91:aload_1         
		JVM INSTR monitorexit ;
	//   40   92:monitorexit     
		throw exception;
	//   41   93:aload_2         
	//   42   94:athrow          
	}

	public void d(com.irobot.home.model.a a1)
	{
		Object obj = c;
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field Object c>
	//    2    4:astore_3        
		obj;
	//    3    5:aload_3         
		JVM INSTR monitorenter ;
	//    4    6:monitorenter    
		int i1;
		String s;
		s = a1.b().getId();
	//    5    7:aload_1         
	//    6    8:invokevirtual   #160 <Method AssetId a.b()>
	//    7   11:invokevirtual   #165 <Method String AssetId.getId()>
	//    8   14:astore          4
		if(!f.containsKey(((Object) (s))))
			break MISSING_BLOCK_LABEL_144;
	//    9   16:aload_0         
	//   10   17:getfield        #59  <Field Map f>
	//   11   20:aload           4
	//   12   22:invokeinterface #425 <Method boolean Map.containsKey(Object)>
	//   13   27:ifeq            144
		a a2 = ((b)f.get(((Object) (s)))).a();
	//   14   30:aload_0         
	//   15   31:getfield        #59  <Field Map f>
	//   16   34:aload           4
	//   17   36:invokeinterface #428 <Method Object Map.get(Object)>
	//   18   41:checkcast       #13  <Class IRobotModel$b>
	//   19   44:invokevirtual   #406 <Method IRobotModel$a com.irobot.home.model.IRobotModel$b.a()>
	//   20   47:astore          5
		if(a2 == a.DETECTED)
	//*  21   49:aload           5
	//*  22   51:getstatic       #433 <Field IRobotModel$a IRobotModel$a.DETECTED>
	//*  23   54:if_acmpne       67
			h = h - 1;
	//   24   57:aload_0         
	//   25   58:aload_0         
	//   26   59:getfield        #63  <Field int h>
	//   27   62:iconst_1        
	//   28   63:isub            
	//   29   64:putfield        #63  <Field int h>
		if(a2 == a.REGISTERED)
			break MISSING_BLOCK_LABEL_192;
	//   30   67:aload           5
	//   31   69:getstatic       #410 <Field IRobotModel$a IRobotModel$a.REGISTERED>
	//   32   72:if_acmpeq       192
		((b)f.get(((Object) (s)))).a(a1);
	//   33   75:aload_0         
	//   34   76:getfield        #59  <Field Map f>
	//   35   79:aload           4
	//   36   81:invokeinterface #428 <Method Object Map.get(Object)>
	//   37   86:checkcast       #13  <Class IRobotModel$b>
	//   38   89:aload_1         
	//   39   90:invokevirtual   #435 <Method void com.irobot.home.model.IRobotModel$b.a(com.irobot.home.model.a)>
		((b)f.get(((Object) (s)))).a(a.REGISTERED);
	//   40   93:aload_0         
	//   41   94:getfield        #59  <Field Map f>
	//   42   97:aload           4
	//   43   99:invokeinterface #428 <Method Object Map.get(Object)>
	//   44  104:checkcast       #13  <Class IRobotModel$b>
	//   45  107:getstatic       #410 <Field IRobotModel$a IRobotModel$a.REGISTERED>
	//   46  110:invokevirtual   #438 <Method void com.irobot.home.model.IRobotModel$b.a(IRobotModel$a)>
		Assembler.getInstance().getPMIApplicationService().registerAsset(a1.a().convertToPMI());
	//   47  113:invokestatic    #71  <Method Assembler Assembler.getInstance()>
	//   48  116:invokevirtual   #442 <Method PMIApplicationService Assembler.getPMIApplicationService()>
	//   49  119:aload_1         
	//   50  120:invokevirtual   #149 <Method AssetInfo com.irobot.home.model.a.a()>
	//   51  123:invokevirtual   #446 <Method com.irobot.core.PMIAssetInfo AssetInfo.convertToPMI()>
	//   52  126:invokevirtual   #452 <Method void PMIApplicationService.registerAsset(com.irobot.core.PMIAssetInfo)>
		i1 = g;
	//   53  129:aload_0         
	//   54  130:getfield        #61  <Field int g>
	//   55  133:istore_2        
_L1:
		g = i1 + 1;
	//   56  134:aload_0         
	//   57  135:iload_2         
	//   58  136:iconst_1        
	//   59  137:iadd            
	//   60  138:putfield        #61  <Field int g>
		break MISSING_BLOCK_LABEL_192;
	//   61  141:goto            192
		f.put(((Object) (s)), ((Object) (new b(a1, a.REGISTERED))));
	//   62  144:aload_0         
	//   63  145:getfield        #59  <Field Map f>
	//   64  148:aload           4
	//   65  150:new             #13  <Class IRobotModel$b>
	//   66  153:dup             
	//   67  154:aload_0         
	//   68  155:aload_1         
	//   69  156:getstatic       #410 <Field IRobotModel$a IRobotModel$a.REGISTERED>
	//   70  159:invokespecial   #455 <Method void IRobotModel$b(IRobotModel, com.irobot.home.model.a, IRobotModel$a)>
	//   71  162:invokeinterface #294 <Method Object Map.put(Object, Object)>
	//   72  167:pop             
		Assembler.getInstance().getPMIApplicationService().registerAsset(a1.a().convertToPMI());
	//   73  168:invokestatic    #71  <Method Assembler Assembler.getInstance()>
	//   74  171:invokevirtual   #442 <Method PMIApplicationService Assembler.getPMIApplicationService()>
	//   75  174:aload_1         
	//   76  175:invokevirtual   #149 <Method AssetInfo com.irobot.home.model.a.a()>
	//   77  178:invokevirtual   #446 <Method com.irobot.core.PMIAssetInfo AssetInfo.convertToPMI()>
	//   78  181:invokevirtual   #452 <Method void PMIApplicationService.registerAsset(com.irobot.core.PMIAssetInfo)>
		i1 = g;
	//   79  184:aload_0         
	//   80  185:getfield        #61  <Field int g>
	//   81  188:istore_2        
		  goto _L1
	//*  82  189:goto            134
		if(b != null && b.equals(((Object) (s))))
	//*  83  192:aload_0         
	//*  84  193:getfield        #504 <Field String b>
	//*  85  196:ifnull          216
	//*  86  199:aload_0         
	//*  87  200:getfield        #504 <Field String b>
	//*  88  203:aload           4
	//*  89  205:invokevirtual   #458 <Method boolean String.equals(Object)>
	//*  90  208:ifeq            216
			b = null;
	//   91  211:aload_0         
	//   92  212:aconst_null     
	//   93  213:putfield        #504 <Field String b>
		com.irobot.home.util.j.l();
	//   94  216:invokestatic    #520 <Method void j.l()>
		obj;
	//   95  219:aload_3         
		JVM INSTR monitorexit ;
	//   96  220:monitorexit     
		return;
	//   97  221:return          
		a1;
	//   98  222:astore_1        
		obj;
	//   99  223:aload_3         
		JVM INSTR monitorexit ;
	//  100  224:monitorexit     
		throw a1;
	//  101  225:aload_1         
	//  102  226:athrow          
	}

	public com.irobot.home.model.a e()
	{
label0:
		{
			com.irobot.home.model.a a1;
			synchronized(c)
	//*   0    0:aload_0         
	//*   1    1:getfield        #38  <Field Object c>
	//*   2    4:astore_1        
	//*   3    5:aload_1         
	//*   4    6:monitorenter    
			{
				if(!b(a))
					break label0;
	//    5    7:aload_0         
	//    6    8:aload_0         
	//    7    9:getfield        #54  <Field String a>
	//    8   12:invokevirtual   #508 <Method boolean b(String)>
	//    9   15:ifeq            42
				a1 = ((b)f.get(((Object) (a)))).b();
	//   10   18:aload_0         
	//   11   19:getfield        #59  <Field Map f>
	//   12   22:aload_0         
	//   13   23:getfield        #54  <Field String a>
	//   14   26:invokeinterface #428 <Method Object Map.get(Object)>
	//   15   31:checkcast       #13  <Class IRobotModel$b>
	//   16   34:invokevirtual   #412 <Method com.irobot.home.model.a IRobotModel$b.b()>
	//   17   37:astore_2        
			}
	//   18   38:aload_1         
	//   19   39:monitorexit     
			return a1;
	//   20   40:aload_2         
	//   21   41:areturn         
		}
		StringBuffer stringbuffer;
		if(f.isEmpty() || !com.irobot.home.util.j.i(a))
			break MISSING_BLOCK_LABEL_208;
	//   22   42:aload_0         
	//   23   43:getfield        #59  <Field Map f>
	//   24   46:invokeinterface #521 <Method boolean Map.isEmpty()>
	//   25   51:ifne            208
	//   26   54:aload_0         
	//   27   55:getfield        #54  <Field String a>
	//   28   58:invokestatic    #301 <Method boolean j.i(String)>
	//   29   61:ifeq            208
		stringbuffer = new StringBuffer("mAssetMap[ ");
	//   30   64:new             #523 <Class StringBuffer>
	//   31   67:dup             
	//   32   68:ldc2            #525 <String "mAssetMap[ ">
	//   33   71:invokespecial   #527 <Method void StringBuffer(String)>
	//   34   74:astore_2        
		StringBuilder stringbuilder1;
		for(Iterator iterator = f.keySet().iterator(); iterator.hasNext(); stringbuffer.append(stringbuilder1.toString()))
	//*  35   75:aload_0         
	//*  36   76:getfield        #59  <Field Map f>
	//*  37   79:invokeinterface #530 <Method Set Map.keySet()>
	//*  38   84:invokeinterface #99  <Method Iterator Set.iterator()>
	//*  39   89:astore_3        
	//*  40   90:aload_3         
	//*  41   91:invokeinterface #105 <Method boolean Iterator.hasNext()>
	//*  42   96:ifeq            149
		{
			String s = (String)iterator.next();
	//   43   99:aload_3         
	//   44  100:invokeinterface #109 <Method Object Iterator.next()>
	//   45  105:checkcast       #116 <Class String>
	//   46  108:astore          4
			stringbuilder1 = new StringBuilder();
	//   47  110:new             #267 <Class StringBuilder>
	//   48  113:dup             
	//   49  114:invokespecial   #268 <Method void StringBuilder()>
	//   50  117:astore          5
			stringbuilder1.append(s);
	//   51  119:aload           5
	//   52  121:aload           4
	//   53  123:invokevirtual   #274 <Method StringBuilder StringBuilder.append(String)>
	//   54  126:pop             
			stringbuilder1.append(" ");
	//   55  127:aload           5
	//   56  129:ldc2            #532 <String " ">
	//   57  132:invokevirtual   #274 <Method StringBuilder StringBuilder.append(String)>
	//   58  135:pop             
		}

	//   59  136:aload_2         
	//   60  137:aload           5
	//   61  139:invokevirtual   #277 <Method String StringBuilder.toString()>
	//   62  142:invokevirtual   #535 <Method StringBuffer StringBuffer.append(String)>
	//   63  145:pop             
	//*  64  146:goto            90
		stringbuffer.append("]");
	//   65  149:aload_2         
	//   66  150:ldc2            #537 <String "]">
	//   67  153:invokevirtual   #535 <Method StringBuffer StringBuffer.append(String)>
	//   68  156:pop             
		StringBuilder stringbuilder = new StringBuilder();
	//   69  157:new             #267 <Class StringBuilder>
	//   70  160:dup             
	//   71  161:invokespecial   #268 <Method void StringBuilder()>
	//   72  164:astore_3        
		stringbuilder.append("AssetMap is not empty, but failed to find asset for: ");
	//   73  165:aload_3         
	//   74  166:ldc2            #539 <String "AssetMap is not empty, but failed to find asset for: ">
	//   75  169:invokevirtual   #274 <Method StringBuilder StringBuilder.append(String)>
	//   76  172:pop             
		stringbuilder.append(a);
	//   77  173:aload_3         
	//   78  174:aload_0         
	//   79  175:getfield        #54  <Field String a>
	//   80  178:invokevirtual   #274 <Method StringBuilder StringBuilder.append(String)>
	//   81  181:pop             
		o.b("Model", stringbuilder.toString());
	//   82  182:ldc1            #125 <String "Model">
	//   83  184:aload_3         
	//   84  185:invokevirtual   #277 <Method String StringBuilder.toString()>
	//   85  188:invokestatic    #279 <Method void o.b(String, String)>
		o.b("Model", stringbuffer.toString());
	//   86  191:ldc1            #125 <String "Model">
	//   87  193:aload_2         
	//   88  194:invokevirtual   #540 <Method String StringBuffer.toString()>
	//   89  197:invokestatic    #279 <Method void o.b(String, String)>
		com.irobot.home.util.j.a(6, "AssetMap is not empty, but failed to find asset");
	//   90  200:bipush          6
	//   91  202:ldc2            #542 <String "AssetMap is not empty, but failed to find asset">
	//   92  205:invokestatic    #545 <Method void j.a(int, String)>
		obj;
	//   93  208:aload_1         
		JVM INSTR monitorexit ;
	//   94  209:monitorexit     
		return null;
	//   95  210:aconst_null     
	//   96  211:areturn         
		exception;
	//   97  212:astore_2        
		obj;
	//   98  213:aload_1         
		JVM INSTR monitorexit ;
	//   99  214:monitorexit     
		throw exception;
	//  100  215:aload_2         
	//  101  216:athrow          
	}

	public List f()
	{
		Object obj = c;
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field Object c>
	//    2    4:astore_1        
		obj;
	//    3    5:aload_1         
		JVM INSTR monitorenter ;
	//    4    6:monitorenter    
		ArrayList arraylist;
		arraylist = new ArrayList();
	//    5    7:new             #384 <Class ArrayList>
	//    6   10:dup             
	//    7   11:invokespecial   #385 <Method void ArrayList()>
	//    8   14:astore_2        
		Iterator iterator = f.values().iterator();
	//    9   15:aload_0         
	//   10   16:getfield        #59  <Field Map f>
	//   11   19:invokeinterface #400 <Method Collection Map.values()>
	//   12   24:invokeinterface #403 <Method Iterator Collection.iterator()>
	//   13   29:astore_3        
		do
		{
			if(!iterator.hasNext())
				break;
	//   14   30:aload_3         
	//   15   31:invokeinterface #105 <Method boolean Iterator.hasNext()>
	//   16   36:ifeq            76
			b b1 = (b)iterator.next();
	//   17   39:aload_3         
	//   18   40:invokeinterface #109 <Method Object Iterator.next()>
	//   19   45:checkcast       #13  <Class IRobotModel$b>
	//   20   48:astore          4
			if(b1.a() == a.REGISTERED)
	//*  21   50:aload           4
	//*  22   52:invokevirtual   #406 <Method IRobotModel$a com.irobot.home.model.IRobotModel$b.a()>
	//*  23   55:getstatic       #410 <Field IRobotModel$a IRobotModel$a.REGISTERED>
	//*  24   58:if_acmpne       30
				((List) (arraylist)).add(((Object) (b1.b())));
	//   25   61:aload_2         
	//   26   62:aload           4
	//   27   64:invokevirtual   #412 <Method com.irobot.home.model.a IRobotModel$b.b()>
	//   28   67:invokeinterface #546 <Method boolean List.add(Object)>
	//   29   72:pop             
		} while(true);
	//   30   73:goto            30
		Collections.sort(((List) (arraylist)), i);
	//   31   76:aload_2         
	//   32   77:aload_0         
	//   33   78:getfield        #43  <Field Comparator i>
	//   34   81:invokestatic    #552 <Method void Collections.sort(List, Comparator)>
		obj;
	//   35   84:aload_1         
		JVM INSTR monitorexit ;
	//   36   85:monitorexit     
		return ((List) (arraylist));
	//   37   86:aload_2         
	//   38   87:areturn         
		Exception exception;
		exception;
	//   39   88:astore_2        
		obj;
	//   40   89:aload_1         
		JVM INSTR monitorexit ;
	//   41   90:monitorexit     
		throw exception;
	//   42   91:aload_2         
	//   43   92:athrow          
	}

	public void g()
	{
		Object obj = c;
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field Object c>
	//    2    4:astore_1        
		obj;
	//    3    5:aload_1         
		JVM INSTR monitorenter ;
	//    4    6:monitorenter    
		for(Iterator iterator = f.values().iterator(); iterator.hasNext(); ((b)iterator.next()).a(a.DELETED));
	//    5    7:aload_0         
	//    6    8:getfield        #59  <Field Map f>
	//    7   11:invokeinterface #400 <Method Collection Map.values()>
	//    8   16:invokeinterface #403 <Method Iterator Collection.iterator()>
	//    9   21:astore_2        
	//   10   22:aload_2         
	//   11   23:invokeinterface #105 <Method boolean Iterator.hasNext()>
	//   12   28:ifeq            49
	//   13   31:aload_2         
	//   14   32:invokeinterface #109 <Method Object Iterator.next()>
	//   15   37:checkcast       #13  <Class IRobotModel$b>
	//   16   40:getstatic       #516 <Field IRobotModel$a IRobotModel$a.DELETED>
	//   17   43:invokevirtual   #438 <Method void com.irobot.home.model.IRobotModel$b.a(IRobotModel$a)>
	//*  18   46:goto            22
		g = 0;
	//   19   49:aload_0         
	//   20   50:iconst_0        
	//   21   51:putfield        #61  <Field int g>
		h = 0;
	//   22   54:aload_0         
	//   23   55:iconst_0        
	//   24   56:putfield        #63  <Field int h>
		obj;
	//   25   59:aload_1         
		JVM INSTR monitorexit ;
	//   26   60:monitorexit     
		return;
	//   27   61:return          
		Exception exception;
		exception;
	//   28   62:astore_2        
		obj;
	//   29   63:aload_1         
		JVM INSTR monitorexit ;
	//   30   64:monitorexit     
		throw exception;
	//   31   65:aload_2         
	//   32   66:athrow          
	}

	public void h()
	{
		JSONException jsonexception;
		IRobotApplication irobotapplication = (IRobotApplication)d.get();
	//    0    0:aload_0         
	//    1    1:getfield        #50  <Field WeakReference d>
	//    2    4:invokevirtual   #142 <Method Object WeakReference.get()>
	//    3    7:checkcast       #144 <Class IRobotApplication>
	//    4   10:astore          4
		boolean flag;
		if(irobotapplication != null)
	//*   5   12:aload           4
	//*   6   14:ifnull          22
			flag = true;
	//    7   17:iconst_1        
	//    8   18:istore_2        
		else
	//*   9   19:goto            24
			flag = false;
	//   10   22:iconst_0        
	//   11   23:istore_2        
		junit.b.a.a("App must not be null", flag);
	//   12   24:ldc2            #555 <String "App must not be null">
	//   13   27:iload_2         
	//   14   28:invokestatic    #560 <Method void junit.b.a.a(String, boolean)>
		SharedPreferences sharedpreferences = irobotapplication.getBaseContext().getSharedPreferences("ROBOTS", 0);
	//   15   31:aload           4
	//   16   33:invokevirtual   #245 <Method Context IRobotApplication.getBaseContext()>
	//   17   36:ldc1            #247 <String "ROBOTS">
	//   18   38:iconst_0        
	//   19   39:invokevirtual   #253 <Method SharedPreferences Context.getSharedPreferences(String, int)>
	//   20   42:astore          6
		int i1 = sharedpreferences.getInt("version", -1);
	//   21   44:aload           6
	//   22   46:ldc2            #258 <String "version">
	//   23   49:iconst_m1       
	//   24   50:invokeinterface #564 <Method int SharedPreferences.getInt(String, int)>
	//   25   55:istore_1        
		String s = sharedpreferences.getString("current", "");
	//   26   56:aload           6
	//   27   58:ldc2            #281 <String "current">
	//   28   61:ldc1            #52  <String "">
	//   29   63:invokeinterface #568 <Method String SharedPreferences.getString(String, String)>
	//   30   68:astore          5
		if(!TextUtils.isEmpty(((CharSequence) (s))))
	//*  31   70:aload           5
	//*  32   72:invokestatic    #339 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  33   75:ifne            110
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   34   78:new             #267 <Class StringBuilder>
	//   35   81:dup             
	//   36   82:invokespecial   #268 <Method void StringBuilder()>
	//   37   85:astore_3        
			stringbuilder.append("Current assetId : ");
	//   38   86:aload_3         
	//   39   87:ldc2            #570 <String "Current assetId : ">
	//   40   90:invokevirtual   #274 <Method StringBuilder StringBuilder.append(String)>
	//   41   93:pop             
			stringbuilder.append(s);
	//   42   94:aload_3         
	//   43   95:aload           5
	//   44   97:invokevirtual   #274 <Method StringBuilder StringBuilder.append(String)>
	//   45  100:pop             
			o.b("Model", stringbuilder.toString());
	//   46  101:ldc1            #125 <String "Model">
	//   47  103:aload_3         
	//   48  104:invokevirtual   #277 <Method String StringBuilder.toString()>
	//   49  107:invokestatic    #279 <Method void o.b(String, String)>
		}
		Gson gson = com.irobot.home.util.j.c(i1);
	//   50  110:iload_1         
	//   51  111:invokestatic    #573 <Method Gson j.c(int)>
	//   52  114:astore          7
		if(i1 <= 3)
	//*  53  116:iload_1         
	//*  54  117:iconst_3        
	//*  55  118:icmpgt          445
		{
			Iterator iterator = sharedpreferences.getAll().keySet().iterator();
	//   56  121:aload           6
	//   57  123:invokeinterface #577 <Method Map SharedPreferences.getAll()>
	//   58  128:invokeinterface #530 <Method Set Map.keySet()>
	//   59  133:invokeinterface #99  <Method Iterator Set.iterator()>
	//   60  138:astore          8
			do
			{
				if(!iterator.hasNext())
					break;
	//   61  140:aload           8
	//   62  142:invokeinterface #105 <Method boolean Iterator.hasNext()>
	//   63  147:ifeq            1021
				Object obj = ((Object) ((String)iterator.next()));
	//   64  150:aload           8
	//   65  152:invokeinterface #109 <Method Object Iterator.next()>
	//   66  157:checkcast       #116 <Class String>
	//   67  160:astore_3        
				if(((String) (obj)).startsWith("robot-"))
	//*  68  161:aload_3         
	//*  69  162:ldc2            #579 <String "robot-">
	//*  70  165:invokevirtual   #582 <Method boolean String.startsWith(String)>
	//*  71  168:ifeq            140
				{
					String s1 = sharedpreferences.getString(((String) (obj)), "");
	//   72  171:aload           6
	//   73  173:aload_3         
	//   74  174:ldc1            #52  <String "">
	//   75  176:invokeinterface #568 <Method String SharedPreferences.getString(String, String)>
	//   76  181:astore          9
					obj = ((Object) (new StringBuilder()));
	//   77  183:new             #267 <Class StringBuilder>
	//   78  186:dup             
	//   79  187:invokespecial   #268 <Method void StringBuilder()>
	//   80  190:astore_3        
					((StringBuilder) (obj)).append("Json in preferences is ");
	//   81  191:aload_3         
	//   82  192:ldc2            #584 <String "Json in preferences is ">
	//   83  195:invokevirtual   #274 <Method StringBuilder StringBuilder.append(String)>
	//   84  198:pop             
					((StringBuilder) (obj)).append(s1);
	//   85  199:aload_3         
	//   86  200:aload           9
	//   87  202:invokevirtual   #274 <Method StringBuilder StringBuilder.append(String)>
	//   88  205:pop             
					o.b("Model", ((StringBuilder) (obj)).toString());
	//   89  206:ldc1            #125 <String "Model">
	//   90  208:aload_3         
	//   91  209:invokevirtual   #277 <Method String StringBuilder.toString()>
	//   92  212:invokestatic    #279 <Method void o.b(String, String)>
					obj = null;
	//   93  215:aconst_null     
	//   94  216:astore_3        
					if(i1 == 1)
	//*  95  217:iload_1         
	//*  96  218:iconst_1        
	//*  97  219:icmpne          242
						obj = ((Object) (com.irobot.home.model.Robot.a((RobotV1)gson.fromJson(s1, com/irobot/home/model/RobotV1))));
	//   98  222:aload           7
	//   99  224:aload           9
	//  100  226:ldc2            #586 <Class RobotV1>
	//  101  229:invokevirtual   #592 <Method Object Gson.fromJson(String, Class)>
	//  102  232:checkcast       #586 <Class RobotV1>
	//  103  235:invokestatic    #595 <Method Robot com.irobot.home.model.Robot.a(RobotV1)>
	//  104  238:astore_3        
					else
	//* 105  239:goto            289
					if(i1 == 2)
	//* 106  242:iload_1         
	//* 107  243:iconst_2        
	//* 108  244:icmpne          267
						obj = ((Object) (com.irobot.home.model.Robot.a((RobotV2)gson.fromJson(s1, com/irobot/home/model/RobotV2))));
	//  109  247:aload           7
	//  110  249:aload           9
	//  111  251:ldc2            #597 <Class RobotV2>
	//  112  254:invokevirtual   #592 <Method Object Gson.fromJson(String, Class)>
	//  113  257:checkcast       #597 <Class RobotV2>
	//  114  260:invokestatic    #600 <Method Robot com.irobot.home.model.Robot.a(RobotV2)>
	//  115  263:astore_3        
					else
	//* 116  264:goto            289
					if(i1 == 3)
	//* 117  267:iload_1         
	//* 118  268:iconst_3        
	//* 119  269:icmpne          289
						obj = ((Object) (com.irobot.home.model.Robot.a((RobotV3)gson.fromJson(s1, com/irobot/home/model/RobotV3))));
	//  120  272:aload           7
	//  121  274:aload           9
	//  122  276:ldc2            #602 <Class RobotV3>
	//  123  279:invokevirtual   #592 <Method Object Gson.fromJson(String, Class)>
	//  124  282:checkcast       #602 <Class RobotV3>
	//  125  285:invokestatic    #605 <Method Robot com.irobot.home.model.Robot.a(RobotV3)>
	//  126  288:astore_3        
					if(obj != null)
	//* 127  289:aload_3         
	//* 128  290:ifnull          140
					{
						w w1 = new w(AssetInfo.create(((Robot) (obj)).s(), ((Robot) (obj)).v(), ((Robot) (obj)).a.c().toString(), ((Robot) (obj)).i(), "", ""), ((Robot) (obj)));
	//  129  293:new             #157 <Class w>
	//  130  296:dup             
	//  131  297:aload_3         
	//  132  298:invokevirtual   #608 <Method AssetId Robot.s()>
	//  133  301:aload_3         
	//  134  302:invokevirtual   #342 <Method String Robot.v()>
	//  135  305:aload_3         
	//  136  306:getfield        #352 <Field RobotSystem com.irobot.home.model.Robot.a>
	//  137  309:invokevirtual   #357 <Method SoftwareVersion RobotSystem.c()>
	//  138  312:invokevirtual   #360 <Method String SoftwareVersion.toString()>
	//  139  315:aload_3         
	//  140  316:invokevirtual   #610 <Method String Robot.i()>
	//  141  319:ldc1            #52  <String "">
	//  142  321:ldc1            #52  <String "">
	//  143  323:invokestatic    #614 <Method AssetInfo AssetInfo.create(AssetId, String, String, String, String, String)>
	//  144  326:aload_3         
	//  145  327:invokespecial   #617 <Method void w(AssetInfo, Robot)>
	//  146  330:astore          9
						w1.a(((Robot) (obj)).d().e().host());
	//  147  332:aload           9
	//  148  334:aload_3         
	//  149  335:invokevirtual   #304 <Method NetworkSettings Robot.d()>
	//  150  338:invokevirtual   #309 <Method NetworkAddress NetworkSettings.e()>
	//  151  341:invokevirtual   #314 <Method String NetworkAddress.host()>
	//  152  344:invokevirtual   #618 <Method void com.irobot.home.model.w.a(String)>
						w1.b(((Robot) (obj)).p().a());
	//  153  347:aload           9
	//  154  349:aload_3         
	//  155  350:invokevirtual   #320 <Method CloudConfig Robot.p()>
	//  156  353:invokevirtual   #324 <Method String com.irobot.home.model.CloudConfig.a()>
	//  157  356:invokevirtual   #620 <Method void w.b(String)>
						w1.c(((Robot) (obj)).d().p());
	//  158  359:aload           9
	//  159  361:aload_3         
	//  160  362:invokevirtual   #304 <Method NetworkSettings Robot.d()>
	//  161  365:invokevirtual   #328 <Method String NetworkSettings.p()>
	//  162  368:invokevirtual   #622 <Method void w.c(String)>
						StringBuilder stringbuilder1 = new StringBuilder();
	//  163  371:new             #267 <Class StringBuilder>
	//  164  374:dup             
	//  165  375:invokespecial   #268 <Method void StringBuilder()>
	//  166  378:astore          10
						stringbuilder1.append("Loaded from prefs robot ");
	//  167  380:aload           10
	//  168  382:ldc2            #624 <String "Loaded from prefs robot ">
	//  169  385:invokevirtual   #274 <Method StringBuilder StringBuilder.append(String)>
	//  170  388:pop             
						stringbuilder1.append(((Robot) (obj)).r());
	//  171  389:aload           10
	//  172  391:aload_3         
	//  173  392:invokevirtual   #627 <Method String Robot.r()>
	//  174  395:invokevirtual   #274 <Method StringBuilder StringBuilder.append(String)>
	//  175  398:pop             
						o.b("Model", stringbuilder1.toString());
	//  176  399:ldc1            #125 <String "Model">
	//  177  401:aload           10
	//  178  403:invokevirtual   #277 <Method String StringBuilder.toString()>
	//  179  406:invokestatic    #279 <Method void o.b(String, String)>
						d(((com.irobot.home.model.a) (w1)));
	//  180  409:aload_0         
	//  181  410:aload           9
	//  182  412:invokevirtual   #493 <Method void d(com.irobot.home.model.a)>
						irobotapplication.a(((com.irobot.home.model.a) (w1)));
	//  183  415:aload           4
	//  184  417:aload           9
	//  185  419:invokevirtual   #491 <Method void IRobotApplication.a(com.irobot.home.model.a)>
						if(((Robot) (obj)).r().equals(((Object) (s))))
	//* 186  422:aload_3         
	//* 187  423:invokevirtual   #627 <Method String Robot.r()>
	//* 188  426:aload           5
	//* 189  428:invokevirtual   #458 <Method boolean String.equals(Object)>
	//* 190  431:ifeq            140
							a(((Robot) (obj)).r());
	//  191  434:aload_0         
	//  192  435:aload_3         
	//  193  436:invokevirtual   #627 <Method String Robot.r()>
	//  194  439:invokevirtual   #500 <Method void a(String)>
					}
				}
			} while(true);
	//  195  442:goto            140
		} else
		if(sharedpreferences.contains("assetInfo"))
	//* 196  445:aload           6
	//* 197  447:ldc2            #381 <String "assetInfo">
	//* 198  450:invokeinterface #630 <Method boolean SharedPreferences.contains(String)>
	//* 199  455:ifeq            1021
		{
			Object obj1 = ((Object) (sharedpreferences.getStringSet("assetInfo", ((Set) (new HashSet())))));
	//  200  458:aload           6
	//  201  460:ldc2            #381 <String "assetInfo">
	//  202  463:new             #196 <Class HashSet>
	//  203  466:dup             
	//  204  467:invokespecial   #197 <Method void HashSet()>
	//  205  470:invokeinterface #201 <Method Set SharedPreferences.getStringSet(String, Set)>
	//  206  475:astore_3        
			if(((Set) (obj1)).size() > 0)
	//* 207  476:aload_3         
	//* 208  477:invokeinterface #379 <Method int Set.size()>
	//* 209  482:ifle            1021
			{
				Object obj3 = ((Object) (new ArrayList()));
	//  210  485:new             #384 <Class ArrayList>
	//  211  488:dup             
	//  212  489:invokespecial   #385 <Method void ArrayList()>
	//  213  492:astore          7
				for(obj1 = ((Object) (((Set) (obj1)).iterator())); ((Iterator) (obj1)).hasNext(); ((List) (obj3)).add(((Object) (AssetInfo.createFromJson((String)((Iterator) (obj1)).next())))));
	//  214  494:aload_3         
	//  215  495:invokeinterface #99  <Method Iterator Set.iterator()>
	//  216  500:astore_3        
	//  217  501:aload_3         
	//  218  502:invokeinterface #105 <Method boolean Iterator.hasNext()>
	//  219  507:ifeq            533
	//  220  510:aload           7
	//  221  512:aload_3         
	//  222  513:invokeinterface #109 <Method Object Iterator.next()>
	//  223  518:checkcast       #116 <Class String>
	//  224  521:invokestatic    #634 <Method AssetInfo AssetInfo.createFromJson(String)>
	//  225  524:invokeinterface #546 <Method boolean List.add(Object)>
	//  226  529:pop             
	//* 227  530:goto            501
				obj1 = ((Object) (((List) (obj3)).iterator()));
	//  228  533:aload           7
	//  229  535:invokeinterface #291 <Method Iterator List.iterator()>
	//  230  540:astore_3        
				do
				{
					if(!((Iterator) (obj1)).hasNext())
						break;
	//  231  541:aload_3         
	//  232  542:invokeinterface #105 <Method boolean Iterator.hasNext()>
	//  233  547:ifeq            624
					AssetInfo assetinfo = (AssetInfo)((Iterator) (obj1)).next();
	//  234  550:aload_3         
	//  235  551:invokeinterface #109 <Method Object Iterator.next()>
	//  236  556:checkcast       #331 <Class AssetInfo>
	//  237  559:astore          8
					if(AssetCapabilityUtils.isNonCloudCapableMoppingRobot(assetinfo))
	//* 238  561:aload           8
	//* 239  563:invokestatic    #637 <Method boolean AssetCapabilityUtils.isNonCloudCapableMoppingRobot(AssetInfo)>
	//* 240  566:ifeq            541
					{
						d d1 = new d(assetinfo);
	//  241  569:new             #639 <Class d>
	//  242  572:dup             
	//  243  573:aload           8
	//  244  575:invokespecial   #641 <Method void d(AssetInfo)>
	//  245  578:astore          9
						d(((com.irobot.home.model.a) (d1)));
	//  246  580:aload_0         
	//  247  581:aload           9
	//  248  583:invokevirtual   #493 <Method void d(com.irobot.home.model.a)>
						irobotapplication.a(((com.irobot.home.model.a) (d1)));
	//  249  586:aload           4
	//  250  588:aload           9
	//  251  590:invokevirtual   #491 <Method void IRobotApplication.a(com.irobot.home.model.a)>
						if(assetinfo.getAssetId().getId().equals(((Object) (s))))
	//* 252  593:aload           8
	//* 253  595:invokevirtual   #417 <Method AssetId AssetInfo.getAssetId()>
	//* 254  598:invokevirtual   #165 <Method String AssetId.getId()>
	//* 255  601:aload           5
	//* 256  603:invokevirtual   #458 <Method boolean String.equals(Object)>
	//* 257  606:ifeq            541
							a(assetinfo.getAssetId().getId());
	//  258  609:aload_0         
	//  259  610:aload           8
	//  260  612:invokevirtual   #417 <Method AssetId AssetInfo.getAssetId()>
	//  261  615:invokevirtual   #165 <Method String AssetId.getId()>
	//  262  618:invokevirtual   #500 <Method void a(String)>
					}
				} while(true);
	//  263  621:goto            541
				if(sharedpreferences.contains("remoteHost") && sharedpreferences.contains("localNetworkAddress") && sharedpreferences.contains("passwords"))
	//* 264  624:aload           6
	//* 265  626:ldc2            #374 <String "remoteHost">
	//* 266  629:invokeinterface #630 <Method boolean SharedPreferences.contains(String)>
	//* 267  634:ifeq            1021
	//* 268  637:aload           6
	//* 269  639:ldc2            #376 <String "localNetworkAddress">
	//* 270  642:invokeinterface #630 <Method boolean SharedPreferences.contains(String)>
	//* 271  647:ifeq            1021
	//* 272  650:aload           6
	//* 273  652:ldc2            #372 <String "passwords">
	//* 274  655:invokeinterface #630 <Method boolean SharedPreferences.contains(String)>
	//* 275  660:ifeq            1021
				{
					Object obj2 = ((Object) (sharedpreferences.getString("passwords", "{}")));
	//  276  663:aload           6
	//  277  665:ldc2            #372 <String "passwords">
	//  278  668:ldc2            #643 <String "{}">
	//  279  671:invokeinterface #568 <Method String SharedPreferences.getString(String, String)>
	//  280  676:astore_3        
					String s2 = sharedpreferences.getString("localNetworkAddress", "{}");
	//  281  677:aload           6
	//  282  679:ldc2            #376 <String "localNetworkAddress">
	//  283  682:ldc2            #643 <String "{}">
	//  284  685:invokeinterface #568 <Method String SharedPreferences.getString(String, String)>
	//  285  690:astore          10
					Object obj4 = ((Object) (sharedpreferences.getString("remoteHost", "{}")));
	//  286  692:aload           6
	//  287  694:ldc2            #374 <String "remoteHost">
	//  288  697:ldc2            #643 <String "{}">
	//  289  700:invokeinterface #568 <Method String SharedPreferences.getString(String, String)>
	//  290  705:astore          8
					Object obj5 = ((Object) (sharedpreferences.getString("macAddresses", "{}")));
	//  291  707:aload           6
	//  292  709:ldc2            #378 <String "macAddresses">
	//  293  712:ldc2            #643 <String "{}">
	//  294  715:invokeinterface #568 <Method String SharedPreferences.getString(String, String)>
	//  295  720:astore          9
					try
					{
						obj2 = ((Object) (new JSONObject(((String) (obj2)))));
	//  296  722:new             #86  <Class JSONObject>
	//  297  725:dup             
	//  298  726:aload_3         
	//  299  727:invokespecial   #644 <Method void JSONObject(String)>
	//  300  730:astore_3        
						JSONObject jsonobject = new JSONObject(s2);
	//  301  731:new             #86  <Class JSONObject>
	//  302  734:dup             
	//  303  735:aload           10
	//  304  737:invokespecial   #644 <Method void JSONObject(String)>
	//  305  740:astore          6
						obj4 = ((Object) (new JSONObject(((String) (obj4)))));
	//  306  742:new             #86  <Class JSONObject>
	//  307  745:dup             
	//  308  746:aload           8
	//  309  748:invokespecial   #644 <Method void JSONObject(String)>
	//  310  751:astore          8
						obj5 = ((Object) (new JSONObject(((String) (obj5)))));
	//  311  753:new             #86  <Class JSONObject>
	//  312  756:dup             
	//  313  757:aload           9
	//  314  759:invokespecial   #644 <Method void JSONObject(String)>
	//  315  762:astore          9
						obj3 = ((Object) (((List) (obj3)).iterator()));
	//  316  764:aload           7
	//  317  766:invokeinterface #291 <Method Iterator List.iterator()>
	//  318  771:astore          7
						do
						{
							if(!((Iterator) (obj3)).hasNext())
								break;
	//  319  773:aload           7
	//  320  775:invokeinterface #105 <Method boolean Iterator.hasNext()>
	//  321  780:ifeq            1021
							AssetInfo assetinfo1 = (AssetInfo)((Iterator) (obj3)).next();
	//  322  783:aload           7
	//  323  785:invokeinterface #109 <Method Object Iterator.next()>
	//  324  790:checkcast       #331 <Class AssetInfo>
	//  325  793:astore          10
							if(AssetCapabilityUtils.isCloudCapable(assetinfo1))
	//* 326  795:aload           10
	//* 327  797:invokestatic    #155 <Method boolean AssetCapabilityUtils.isCloudCapable(AssetInfo)>
	//* 328  800:ifeq            773
							{
								Object obj6 = ((Object) (assetinfo1.getAssetId().getId()));
	//  329  803:aload           10
	//  330  805:invokevirtual   #417 <Method AssetId AssetInfo.getAssetId()>
	//  331  808:invokevirtual   #165 <Method String AssetId.getId()>
	//  332  811:astore          11
								String s3 = ((JSONObject) (obj2)).getString(((String) (obj6)));
	//  333  813:aload_3         
	//  334  814:aload           11
	//  335  816:invokevirtual   #647 <Method String JSONObject.getString(String)>
	//  336  819:astore          12
								String s4 = jsonobject.getString(((String) (obj6)));
	//  337  821:aload           6
	//  338  823:aload           11
	//  339  825:invokevirtual   #647 <Method String JSONObject.getString(String)>
	//  340  828:astore          13
								String s5 = ((JSONObject) (obj4)).getString(((String) (obj6)));
	//  341  830:aload           8
	//  342  832:aload           11
	//  343  834:invokevirtual   #647 <Method String JSONObject.getString(String)>
	//  344  837:astore          14
								String s6 = ((JSONObject) (obj5)).optString(((String) (obj6)), "");
	//  345  839:aload           9
	//  346  841:aload           11
	//  347  843:ldc1            #52  <String "">
	//  348  845:invokevirtual   #650 <Method String JSONObject.optString(String, String)>
	//  349  848:astore          15
								Robot robot = new Robot();
	//  350  850:new             #170 <Class Robot>
	//  351  853:dup             
	//  352  854:invokespecial   #651 <Method void Robot()>
	//  353  857:astore          16
								robot.e(((String) (obj6)));
	//  354  859:aload           16
	//  355  861:aload           11
	//  356  863:invokevirtual   #653 <Method void Robot.e(String)>
								robot.a(s3);
	//  357  866:aload           16
	//  358  868:aload           12
	//  359  870:invokevirtual   #654 <Method void com.irobot.home.model.Robot.a(String)>
								robot.d().a(NetworkAddress.httpsNetworkAddressForHost(s4));
	//  360  873:aload           16
	//  361  875:invokevirtual   #304 <Method NetworkSettings Robot.d()>
	//  362  878:aload           13
	//  363  880:invokestatic    #658 <Method NetworkAddress NetworkAddress.httpsNetworkAddressForHost(String)>
	//  364  883:invokevirtual   #661 <Method void com.irobot.home.model.NetworkSettings.a(NetworkAddress)>
								robot.p().a(s5);
	//  365  886:aload           16
	//  366  888:invokevirtual   #320 <Method CloudConfig Robot.p()>
	//  367  891:aload           14
	//  368  893:invokevirtual   #662 <Method void com.irobot.home.model.CloudConfig.a(String)>
								robot.d().c(s6);
	//  369  896:aload           16
	//  370  898:invokevirtual   #304 <Method NetworkSettings Robot.d()>
	//  371  901:aload           15
	//  372  903:invokevirtual   #663 <Method void NetworkSettings.c(String)>
								robot.b(assetinfo1.getName());
	//  373  906:aload           16
	//  374  908:aload           10
	//  375  910:invokevirtual   #666 <Method String AssetInfo.getName()>
	//  376  913:invokevirtual   #667 <Method void Robot.b(String)>
								robot.c(assetinfo1.getSku());
	//  377  916:aload           16
	//  378  918:aload           10
	//  379  920:invokevirtual   #334 <Method String AssetInfo.getSku()>
	//  380  923:invokevirtual   #668 <Method void Robot.c(String)>
								robot.a.a(SoftwareVersion.create(assetinfo1.getSoftwareVersion()));
	//  381  926:aload           16
	//  382  928:getfield        #352 <Field RobotSystem com.irobot.home.model.Robot.a>
	//  383  931:aload           10
	//  384  933:invokevirtual   #349 <Method String AssetInfo.getSoftwareVersion()>
	//  385  936:invokestatic    #671 <Method SoftwareVersion SoftwareVersion.create(String)>
	//  386  939:invokevirtual   #674 <Method void com.irobot.home.model.RobotSystem.a(SoftwareVersion)>
								assetinfo1.setSku(robot.v());
	//  387  942:aload           10
	//  388  944:aload           16
	//  389  946:invokevirtual   #342 <Method String Robot.v()>
	//  390  949:invokevirtual   #346 <Method void AssetInfo.setSku(String)>
								obj6 = ((Object) (new w(assetinfo1, robot, s4, s5)));
	//  391  952:new             #157 <Class w>
	//  392  955:dup             
	//  393  956:aload           10
	//  394  958:aload           16
	//  395  960:aload           13
	//  396  962:aload           14
	//  397  964:invokespecial   #677 <Method void w(AssetInfo, Robot, String, String)>
	//  398  967:astore          11
								d(((com.irobot.home.model.a) (obj6)));
	//  399  969:aload_0         
	//  400  970:aload           11
	//  401  972:invokevirtual   #493 <Method void d(com.irobot.home.model.a)>
								irobotapplication.a(((com.irobot.home.model.a) (obj6)));
	//  402  975:aload           4
	//  403  977:aload           11
	//  404  979:invokevirtual   #491 <Method void IRobotApplication.a(com.irobot.home.model.a)>
								if(assetinfo1.getAssetId().getId().equals(((Object) (s))))
	//* 405  982:aload           10
	//* 406  984:invokevirtual   #417 <Method AssetId AssetInfo.getAssetId()>
	//* 407  987:invokevirtual   #165 <Method String AssetId.getId()>
	//* 408  990:aload           5
	//* 409  992:invokevirtual   #458 <Method boolean String.equals(Object)>
	//* 410  995:ifeq            773
									a(assetinfo1.getAssetId().getId());
	//  411  998:aload_0         
	//  412  999:aload           10
	//  413 1001:invokevirtual   #417 <Method AssetId AssetInfo.getAssetId()>
	//  414 1004:invokevirtual   #165 <Method String AssetId.getId()>
	//  415 1007:invokevirtual   #500 <Method void a(String)>
							}
						} while(true);
	//  416 1010:goto            773
					}
	//* 417 1013:ldc1            #125 <String "Model">
	//* 418 1015:ldc2            #679 <String "Error while parsing shared prefs json data.">
	//* 419 1018:invokestatic    #132 <Method void o.e(String, String)>
	//* 420 1021:aload_0         
	//* 421 1022:invokespecial   #495 <Method void l()>
	//* 422 1025:aload_0         
	//* 423 1026:invokevirtual   #681 <Method int b()>
	//* 424 1029:ifne            1033
	//* 425 1032:return          
	//* 426 1033:aload_0         
	//* 427 1034:invokevirtual   #265 <Method com.irobot.home.model.a e()>
	//* 428 1037:ifnonnull       1071
	//* 429 1040:aload_0         
	//* 430 1041:invokevirtual   #288 <Method List f()>
	//* 431 1044:iconst_0        
	//* 432 1045:invokeinterface #684 <Method Object List.get(int)>
	//* 433 1050:checkcast       #146 <Class com.irobot.home.model.a>
	//* 434 1053:astore_3        
	//* 435 1054:aload_0         
	//* 436 1055:aload_3         
	//* 437 1056:invokevirtual   #160 <Method AssetId a.b()>
	//* 438 1059:invokevirtual   #165 <Method String AssetId.getId()>
	//* 439 1062:invokevirtual   #500 <Method void a(String)>
	//* 440 1065:aload           4
	//* 441 1067:aload_3         
	//* 442 1068:invokevirtual   #491 <Method void IRobotApplication.a(com.irobot.home.model.a)>
	//* 443 1071:return          
					// Misplaced declaration of an exception variable
					catch(JSONException jsonexception)
					{
						o.e("Model", "Error while parsing shared prefs json data.");
					}
				}
			}
		}
		l();
		if(b() == 0)
			return;
		if(e() == null)
		{
			com.irobot.home.model.a a1 = (com.irobot.home.model.a)f().get(0);
			a(a1.b().getId());
			irobotapplication.a(a1);
		}
	//* 444 1072:astore_3        
	//* 445 1073:goto            1013
	}

	public void i()
	{
		o.b("Model", "Writing out last data before closing app");
	//    0    0:ldc1            #125 <String "Model">
	//    1    2:ldc2            #686 <String "Writing out last data before closing app">
	//    2    5:invokestatic    #279 <Method void o.b(String, String)>
		k();
	//    3    8:aload_0         
	//    4    9:invokespecial   #502 <Method void k()>
	//    5   12:return          
	}

	public void onAssetCloudConfigEvent(AssetCloudConfigEvent assetcloudconfigevent)
	{
		Object obj = ((Object) (d(assetcloudconfigevent.assetId().getId())));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #694 <Method AssetId AssetCloudConfigEvent.assetId()>
	//    3    5:invokevirtual   #165 <Method String AssetId.getId()>
	//    4    8:invokevirtual   #696 <Method com.irobot.home.model.a d(String)>
	//    5   11:astore_2        
		if(obj == null)
	//*   6   12:aload_2         
	//*   7   13:ifnonnull       25
		{
			o.e("Model", "No model asset found when receiving cloud config update.");
	//    8   16:ldc1            #125 <String "Model">
	//    9   18:ldc2            #698 <String "No model asset found when receiving cloud config update.">
	//   10   21:invokestatic    #132 <Method void o.e(String, String)>
			return;
	//   11   24:return          
		}
		if(AssetCapabilityUtils.isCloudCapable(((com.irobot.home.model.a) (obj)).a()))
	//*  12   25:aload_2         
	//*  13   26:invokevirtual   #149 <Method AssetInfo com.irobot.home.model.a.a()>
	//*  14   29:invokestatic    #155 <Method boolean AssetCapabilityUtils.isCloudCapable(AssetInfo)>
	//*  15   32:ifeq            66
		{
			obj = ((Object) ((w)obj));
	//   16   35:aload_2         
	//   17   36:checkcast       #157 <Class w>
	//   18   39:astore_2        
			if(!((w) (obj)).e().equals(((Object) (assetcloudconfigevent.cloudConfigHost()))))
	//*  19   40:aload_2         
	//*  20   41:invokevirtual   #316 <Method String w.e()>
	//*  21   44:aload_1         
	//*  22   45:invokevirtual   #701 <Method String AssetCloudConfigEvent.cloudConfigHost()>
	//*  23   48:invokevirtual   #458 <Method boolean String.equals(Object)>
	//*  24   51:ifne            66
			{
				((w) (obj)).b(assetcloudconfigevent.cloudConfigHost());
	//   25   54:aload_2         
	//   26   55:aload_1         
	//   27   56:invokevirtual   #701 <Method String AssetCloudConfigEvent.cloudConfigHost()>
	//   28   59:invokevirtual   #620 <Method void w.b(String)>
				k();
	//   29   62:aload_0         
	//   30   63:invokespecial   #502 <Method void k()>
			}
		}
	//   31   66:return          
	}

	public void onAssetSkuEvent(AssetSkuEvent assetskuevent)
	{
		com.irobot.home.model.a a1 = d(assetskuevent.assetId().getId());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #707 <Method AssetId AssetSkuEvent.assetId()>
	//    3    5:invokevirtual   #165 <Method String AssetId.getId()>
	//    4    8:invokevirtual   #696 <Method com.irobot.home.model.a d(String)>
	//    5   11:astore_2        
		if(a1 == null)
	//*   6   12:aload_2         
	//*   7   13:ifnonnull       25
		{
			o.e("Model", "No model asset found when receiving asset sku update.");
	//    8   16:ldc1            #125 <String "Model">
	//    9   18:ldc2            #709 <String "No model asset found when receiving asset sku update.">
	//   10   21:invokestatic    #132 <Method void o.e(String, String)>
			return;
	//   11   24:return          
		}
		if(!a1.a().getSku().equals(((Object) (assetskuevent.sku()))) && !com.irobot.home.util.j.k(assetskuevent.sku()))
	//*  12   25:aload_2         
	//*  13   26:invokevirtual   #149 <Method AssetInfo com.irobot.home.model.a.a()>
	//*  14   29:invokevirtual   #334 <Method String AssetInfo.getSku()>
	//*  15   32:aload_1         
	//*  16   33:invokevirtual   #712 <Method String AssetSkuEvent.sku()>
	//*  17   36:invokevirtual   #458 <Method boolean String.equals(Object)>
	//*  18   39:ifne            67
	//*  19   42:aload_1         
	//*  20   43:invokevirtual   #712 <Method String AssetSkuEvent.sku()>
	//*  21   46:invokestatic    #714 <Method boolean j.k(String)>
	//*  22   49:ifne            67
		{
			a1.a().setSku(assetskuevent.sku());
	//   23   52:aload_2         
	//   24   53:invokevirtual   #149 <Method AssetInfo com.irobot.home.model.a.a()>
	//   25   56:aload_1         
	//   26   57:invokevirtual   #712 <Method String AssetSkuEvent.sku()>
	//   27   60:invokevirtual   #346 <Method void AssetInfo.setSku(String)>
			k();
	//   28   63:aload_0         
	//   29   64:invokespecial   #502 <Method void k()>
		}
	//   30   67:return          
	}

	public void onAssetSoftwareVersionEvent(AssetSoftwareVersionEvent assetsoftwareversionevent)
	{
		com.irobot.home.model.a a1 = d(assetsoftwareversionevent.assetId().getId());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #719 <Method AssetId AssetSoftwareVersionEvent.assetId()>
	//    3    5:invokevirtual   #165 <Method String AssetId.getId()>
	//    4    8:invokevirtual   #696 <Method com.irobot.home.model.a d(String)>
	//    5   11:astore_2        
		if(a1 == null)
	//*   6   12:aload_2         
	//*   7   13:ifnonnull       25
		{
			o.e("Model", "No model asset found when receiving software version update.");
	//    8   16:ldc1            #125 <String "Model">
	//    9   18:ldc2            #721 <String "No model asset found when receiving software version update.">
	//   10   21:invokestatic    #132 <Method void o.e(String, String)>
			return;
	//   11   24:return          
		}
		if(!a1.a().getSoftwareVersion().equals(((Object) (assetsoftwareversionevent.softwareVersion()))))
	//*  12   25:aload_2         
	//*  13   26:invokevirtual   #149 <Method AssetInfo com.irobot.home.model.a.a()>
	//*  14   29:invokevirtual   #349 <Method String AssetInfo.getSoftwareVersion()>
	//*  15   32:aload_1         
	//*  16   33:invokevirtual   #724 <Method String AssetSoftwareVersionEvent.softwareVersion()>
	//*  17   36:invokevirtual   #458 <Method boolean String.equals(Object)>
	//*  18   39:ifne            57
		{
			a1.a().setSoftwareVersion(assetsoftwareversionevent.softwareVersion());
	//   19   42:aload_2         
	//   20   43:invokevirtual   #149 <Method AssetInfo com.irobot.home.model.a.a()>
	//   21   46:aload_1         
	//   22   47:invokevirtual   #724 <Method String AssetSoftwareVersionEvent.softwareVersion()>
	//   23   50:invokevirtual   #363 <Method void AssetInfo.setSoftwareVersion(String)>
			k();
	//   24   53:aload_0         
	//   25   54:invokespecial   #502 <Method void k()>
		}
	//   26   57:return          
	}

	public void onNetworkAddressEvent(NetworkAddressEvent networkaddressevent)
	{
		Object obj = ((Object) (d(networkaddressevent.assetId().getId())));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #729 <Method AssetId NetworkAddressEvent.assetId()>
	//    3    5:invokevirtual   #165 <Method String AssetId.getId()>
	//    4    8:invokevirtual   #696 <Method com.irobot.home.model.a d(String)>
	//    5   11:astore          4
		if(obj == null)
	//*   6   13:aload           4
	//*   7   15:ifnonnull       27
		{
			o.e("Model", "No model asset found when receiving network address update.");
	//    8   18:ldc1            #125 <String "Model">
	//    9   20:ldc2            #731 <String "No model asset found when receiving network address update.">
	//   10   23:invokestatic    #132 <Method void o.e(String, String)>
			return;
	//   11   26:return          
		}
		if(AssetCapabilityUtils.isCloudCapable(((com.irobot.home.model.a) (obj)).a()))
	//*  12   27:aload           4
	//*  13   29:invokevirtual   #149 <Method AssetInfo com.irobot.home.model.a.a()>
	//*  14   32:invokestatic    #155 <Method boolean AssetCapabilityUtils.isCloudCapable(AssetInfo)>
	//*  15   35:ifeq            163
		{
			boolean flag;
label0:
			{
				obj = ((Object) ((w)obj));
	//   16   38:aload           4
	//   17   40:checkcast       #157 <Class w>
	//   18   43:astore          4
				static class _cls2
				{

					static final int a[];

					static 
					{
						a = new int[NetworkType.values().length];
					//    0    0:invokestatic    #18  <Method NetworkType[] NetworkType.values()>
					//    1    3:arraylength     
					//    2    4:newarray        int[]
					//    3    6:putstatic       #20  <Field int[] a>
						try
						{
							a[NetworkType.Local.ordinal()] = 1;
					//    4    9:getstatic       #20  <Field int[] a>
					//    5   12:getstatic       #24  <Field NetworkType NetworkType.Local>
					//    6   15:invokevirtual   #28  <Method int NetworkType.ordinal()>
					//    7   18:iconst_1        
					//    8   19:iastore         
						}
					//*   9   20:getstatic       #20  <Field int[] a>
					//*  10   23:getstatic       #31  <Field NetworkType NetworkType.Remote>
					//*  11   26:invokevirtual   #28  <Method int NetworkType.ordinal()>
					//*  12   29:iconst_2        
					//*  13   30:iastore         
					//*  14   31:return          
						catch(NoSuchFieldError nosuchfielderror) { }
					//   15   32:astore_0        
						try
						{
							a[NetworkType.Remote.ordinal()] = 2;
						}
					//*  16   33:goto            20
						catch(NoSuchFieldError nosuchfielderror1) { }
					//   17   36:astore_0        
					//*  18   37:return          
					}
				}

				int i1 = com.irobot.home.model._cls2.a[networkaddressevent.networkType().ordinal()];
	//   19   45:getstatic       #734 <Field int[] com.irobot.home.model.IRobotModel$2.a>
	//   20   48:aload_1         
	//   21   49:invokevirtual   #738 <Method NetworkType NetworkAddressEvent.networkType()>
	//   22   52:invokevirtual   #743 <Method int NetworkType.ordinal()>
	//   23   55:iaload          
	//   24   56:istore_3        
				flag = true;
	//   25   57:iconst_1        
	//   26   58:istore_2        
				switch(i1)
	//*  27   59:iload_3         
				{
				default:
					break;

	//*  28   60:tableswitch     1 2: default 84
	//	               1 120
	//	               2 87
	//*  29   84:goto            153
				case 2: // '\002'
					if(!((w) (obj)).e().equals(((Object) (networkaddressevent.networkAddress().host()))))
	//*  30   87:aload           4
	//*  31   89:invokevirtual   #316 <Method String w.e()>
	//*  32   92:aload_1         
	//*  33   93:invokevirtual   #746 <Method NetworkAddress NetworkAddressEvent.networkAddress()>
	//*  34   96:invokevirtual   #314 <Method String NetworkAddress.host()>
	//*  35   99:invokevirtual   #458 <Method boolean String.equals(Object)>
	//*  36  102:ifne            153
					{
						((w) (obj)).b(networkaddressevent.networkAddress().host());
	//   37  105:aload           4
	//   38  107:aload_1         
	//   39  108:invokevirtual   #746 <Method NetworkAddress NetworkAddressEvent.networkAddress()>
	//   40  111:invokevirtual   #314 <Method String NetworkAddress.host()>
	//   41  114:invokevirtual   #620 <Method void w.b(String)>
						break label0;
	//   42  117:goto            155
					}
					break;

				case 1: // '\001'
					if(((w) (obj)).d().equals(((Object) (networkaddressevent.networkAddress().host()))))
						break;
	//   43  120:aload           4
	//   44  122:invokevirtual   #296 <Method String w.d()>
	//   45  125:aload_1         
	//   46  126:invokevirtual   #746 <Method NetworkAddress NetworkAddressEvent.networkAddress()>
	//   47  129:invokevirtual   #314 <Method String NetworkAddress.host()>
	//   48  132:invokevirtual   #458 <Method boolean String.equals(Object)>
	//   49  135:ifne            153
					((w) (obj)).a(networkaddressevent.networkAddress().host());
	//   50  138:aload           4
	//   51  140:aload_1         
	//   52  141:invokevirtual   #746 <Method NetworkAddress NetworkAddressEvent.networkAddress()>
	//   53  144:invokevirtual   #314 <Method String NetworkAddress.host()>
	//   54  147:invokevirtual   #618 <Method void com.irobot.home.model.w.a(String)>
					break label0;
	//   55  150:goto            155
				}
				flag = false;
	//   56  153:iconst_0        
	//   57  154:istore_2        
			}
			if(flag)
	//*  58  155:iload_2         
	//*  59  156:ifeq            163
				k();
	//   60  159:aload_0         
	//   61  160:invokespecial   #502 <Method void k()>
		}
	//   62  163:return          
	}

	public void onRobotNameEvent(RobotNameEvent robotnameevent)
	{
		com.irobot.home.model.a a1 = d(robotnameevent.assetId().getId());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #751 <Method AssetId RobotNameEvent.assetId()>
	//    3    5:invokevirtual   #165 <Method String AssetId.getId()>
	//    4    8:invokevirtual   #696 <Method com.irobot.home.model.a d(String)>
	//    5   11:astore_2        
		if(a1 == null)
	//*   6   12:aload_2         
	//*   7   13:ifnonnull       25
		{
			o.e("Model", "No model asset found when receiving robot name update.");
	//    8   16:ldc1            #125 <String "Model">
	//    9   18:ldc2            #753 <String "No model asset found when receiving robot name update.">
	//   10   21:invokestatic    #132 <Method void o.e(String, String)>
			return;
	//   11   24:return          
		}
		if(!a1.a().getName().equals(((Object) (robotnameevent.robotName()))))
	//*  12   25:aload_2         
	//*  13   26:invokevirtual   #149 <Method AssetInfo com.irobot.home.model.a.a()>
	//*  14   29:invokevirtual   #666 <Method String AssetInfo.getName()>
	//*  15   32:aload_1         
	//*  16   33:invokevirtual   #756 <Method String RobotNameEvent.robotName()>
	//*  17   36:invokevirtual   #458 <Method boolean String.equals(Object)>
	//*  18   39:ifne            57
		{
			a1.a().setName(robotnameevent.robotName());
	//   19   42:aload_2         
	//   20   43:invokevirtual   #149 <Method AssetInfo com.irobot.home.model.a.a()>
	//   21   46:aload_1         
	//   22   47:invokevirtual   #756 <Method String RobotNameEvent.robotName()>
	//   23   50:invokevirtual   #759 <Method void AssetInfo.setName(String)>
			k();
	//   24   53:aload_0         
	//   25   54:invokespecial   #502 <Method void k()>
		}
	//   26   57:return          
	}

	private static CoreEventReceiver e;
	private String a;
	private String b;
	private final Object c;
	private final WeakReference d;
	private Map f;
	private int g;
	private int h;
	private Comparator i;
}

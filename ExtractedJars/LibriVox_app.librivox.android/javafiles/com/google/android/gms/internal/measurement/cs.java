// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.*;

// Referenced classes of package com.google.android.gms.internal.measurement:
//			ce, ct, by, cl, 
//			cd

public final class cs
	implements ce
{

	private cs(SharedPreferences sharedpreferences)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #29  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #31  <Class ct>
	//    4    8:dup             
	//    5    9:aload_0         
	//    6   10:invokespecial   #34  <Method void ct(cs)>
	//    7   13:putfield        #36  <Field android.content.SharedPreferences$OnSharedPreferenceChangeListener c>
	//    8   16:aload_0         
	//    9   17:new             #4   <Class Object>
	//   10   20:dup             
	//   11   21:invokespecial   #29  <Method void Object()>
	//   12   24:putfield        #38  <Field Object d>
	//   13   27:aload_0         
	//   14   28:new             #40  <Class ArrayList>
	//   15   31:dup             
	//   16   32:invokespecial   #41  <Method void ArrayList()>
	//   17   35:putfield        #43  <Field List f>
		b = sharedpreferences;
	//   18   38:aload_0         
	//   19   39:aload_1         
	//   20   40:putfield        #45  <Field SharedPreferences b>
		b.registerOnSharedPreferenceChangeListener(c);
	//   21   43:aload_0         
	//   22   44:getfield        #45  <Field SharedPreferences b>
	//   23   47:aload_0         
	//   24   48:getfield        #36  <Field android.content.SharedPreferences$OnSharedPreferenceChangeListener c>
	//   25   51:invokeinterface #51  <Method void SharedPreferences.registerOnSharedPreferenceChangeListener(android.content.SharedPreferences$OnSharedPreferenceChangeListener)>
	//   26   56:return          
	}

	static cs a(Context context, String s)
	{
		boolean flag;
		if(by.a() && !s.startsWith("direct_boot:"))
	//*   0    0:invokestatic    #57  <Method boolean by.a()>
	//*   1    3:ifeq            23
	//*   2    6:aload_1         
	//*   3    7:ldc1            #59  <String "direct_boot:">
	//*   4    9:invokevirtual   #65  <Method boolean String.startsWith(String)>
	//*   5   12:ifne            23
			flag = by.a(context);
	//    6   15:aload_0         
	//    7   16:invokestatic    #68  <Method boolean by.a(Context)>
	//    8   19:istore_2        
		else
	//*   9   20:goto            25
			flag = true;
	//   10   23:iconst_1        
	//   11   24:istore_2        
		if(!flag)
	//*  12   25:iload_2         
	//*  13   26:ifne            31
			return null;
	//   14   29:aconst_null     
	//   15   30:areturn         
		com/google/android/gms/internal/measurement/cs;
	//   16   31:ldc1            #2   <Class cs>
		JVM INSTR monitorenter ;
	//   17   33:monitorenter    
		cs cs1 = (cs)a.get(((Object) (s)));
	//   18   34:getstatic       #26  <Field Map a>
	//   19   37:aload_1         
	//   20   38:invokeinterface #74  <Method Object Map.get(Object)>
	//   21   43:checkcast       #2   <Class cs>
	//   22   46:astore          4
		Object obj;
		obj = ((Object) (cs1));
	//   23   48:aload           4
	//   24   50:astore_3        
		if(cs1 != null)
			break MISSING_BLOCK_LABEL_120;
	//   25   51:aload           4
	//   26   53:ifnonnull       120
		if(!s.startsWith("direct_boot:"))
			break MISSING_BLOCK_LABEL_93;
	//   27   56:aload_1         
	//   28   57:ldc1            #59  <String "direct_boot:">
	//   29   59:invokevirtual   #65  <Method boolean String.startsWith(String)>
	//   30   62:ifeq            93
		obj = ((Object) (context));
	//   31   65:aload_0         
	//   32   66:astore_3        
		if(by.a())
	//*  33   67:invokestatic    #57  <Method boolean by.a()>
	//*  34   70:ifeq            78
			obj = ((Object) (context.createDeviceProtectedStorageContext()));
	//   35   73:aload_0         
	//   36   74:invokevirtual   #80  <Method Context Context.createDeviceProtectedStorageContext()>
	//   37   77:astore_3        
		context = ((Context) (((Context) (obj)).getSharedPreferences(s.substring(12), 0)));
	//   38   78:aload_3         
	//   39   79:aload_1         
	//   40   80:bipush          12
	//   41   82:invokevirtual   #84  <Method String String.substring(int)>
	//   42   85:iconst_0        
	//   43   86:invokevirtual   #88  <Method SharedPreferences Context.getSharedPreferences(String, int)>
	//   44   89:astore_0        
		break MISSING_BLOCK_LABEL_100;
	//   45   90:goto            100
		context = ((Context) (context.getSharedPreferences(s, 0)));
	//   46   93:aload_0         
	//   47   94:aload_1         
	//   48   95:iconst_0        
	//   49   96:invokevirtual   #88  <Method SharedPreferences Context.getSharedPreferences(String, int)>
	//   50   99:astore_0        
		obj = ((Object) (new cs(((SharedPreferences) (context)))));
	//   51  100:new             #2   <Class cs>
	//   52  103:dup             
	//   53  104:aload_0         
	//   54  105:invokespecial   #90  <Method void cs(SharedPreferences)>
	//   55  108:astore_3        
		a.put(((Object) (s)), obj);
	//   56  109:getstatic       #26  <Field Map a>
	//   57  112:aload_1         
	//   58  113:aload_3         
	//   59  114:invokeinterface #94  <Method Object Map.put(Object, Object)>
	//   60  119:pop             
		com/google/android/gms/internal/measurement/cs;
	//   61  120:ldc1            #2   <Class cs>
		JVM INSTR monitorexit ;
	//   62  122:monitorexit     
		return ((cs) (obj));
	//   63  123:aload_3         
	//   64  124:areturn         
		context;
	//   65  125:astore_0        
		com/google/android/gms/internal/measurement/cs;
	//   66  126:ldc1            #2   <Class cs>
		JVM INSTR monitorexit ;
	//   67  128:monitorexit     
		throw context;
	//   68  129:aload_0         
	//   69  130:athrow          
	}

	public final Object a(String s)
	{
		Map map;
		Map map1 = e;
	//    0    0:aload_0         
	//    1    1:getfield        #97  <Field Map e>
	//    2    4:astore_3        
		map = map1;
	//    3    5:aload_3         
	//    4    6:astore_2        
		if(map1 != null)
			break MISSING_BLOCK_LABEL_58;
	//    5    7:aload_3         
	//    6    8:ifnonnull       58
		Object obj = d;
	//    7   11:aload_0         
	//    8   12:getfield        #38  <Field Object d>
	//    9   15:astore          4
		obj;
	//   10   17:aload           4
		JVM INSTR monitorenter ;
	//   11   19:monitorenter    
		Map map2 = e;
	//   12   20:aload_0         
	//   13   21:getfield        #97  <Field Map e>
	//   14   24:astore_3        
		map = map2;
	//   15   25:aload_3         
	//   16   26:astore_2        
		if(map2 != null)
			break MISSING_BLOCK_LABEL_46;
	//   17   27:aload_3         
	//   18   28:ifnonnull       46
		map = b.getAll();
	//   19   31:aload_0         
	//   20   32:getfield        #45  <Field SharedPreferences b>
	//   21   35:invokeinterface #101 <Method Map SharedPreferences.getAll()>
	//   22   40:astore_2        
		e = map;
	//   23   41:aload_0         
	//   24   42:aload_2         
	//   25   43:putfield        #97  <Field Map e>
		obj;
	//   26   46:aload           4
		JVM INSTR monitorexit ;
	//   27   48:monitorexit     
		break MISSING_BLOCK_LABEL_58;
	//   28   49:goto            58
		s;
	//   29   52:astore_1        
		obj;
	//   30   53:aload           4
		JVM INSTR monitorexit ;
	//   31   55:monitorexit     
		throw s;
	//   32   56:aload_1         
	//   33   57:athrow          
		if(map != null)
	//*  34   58:aload_2         
	//*  35   59:ifnull          70
			return map.get(((Object) (s)));
	//   36   62:aload_2         
	//   37   63:aload_1         
	//   38   64:invokeinterface #74  <Method Object Map.get(Object)>
	//   39   69:areturn         
		else
			return ((Object) (null));
	//   40   70:aconst_null     
	//   41   71:areturn         
	}

	final void a(SharedPreferences sharedpreferences, String s)
	{
		synchronized(d)
	//*   0    0:aload_0         
	//*   1    1:getfield        #38  <Field Object d>
	//*   2    4:astore_1        
	//*   3    5:aload_1         
	//*   4    6:monitorenter    
		{
			e = null;
	//    5    7:aload_0         
	//    6    8:aconst_null     
	//    7    9:putfield        #97  <Field Map e>
			cl.a();
	//    8   12:invokestatic    #106 <Method void cl.a()>
		}
	//    9   15:aload_1         
	//   10   16:monitorexit     
		this;
	//   11   17:aload_0         
		JVM INSTR monitorenter ;
	//   12   18:monitorenter    
		for(sharedpreferences = ((SharedPreferences) (f.iterator())); ((Iterator) (sharedpreferences)).hasNext(); ((cd)((Iterator) (sharedpreferences)).next()).a());
	//   13   19:aload_0         
	//   14   20:getfield        #43  <Field List f>
	//   15   23:invokeinterface #112 <Method Iterator List.iterator()>
	//   16   28:astore_1        
	//   17   29:aload_1         
	//   18   30:invokeinterface #117 <Method boolean Iterator.hasNext()>
	//   19   35:ifeq            55
	//   20   38:aload_1         
	//   21   39:invokeinterface #121 <Method Object Iterator.next()>
	//   22   44:checkcast       #123 <Class cd>
	//   23   47:invokeinterface #124 <Method void cd.a()>
	//*  24   52:goto            29
		this;
	//   25   55:aload_0         
		JVM INSTR monitorexit ;
	//   26   56:monitorexit     
		return;
	//   27   57:return          
		sharedpreferences;
	//   28   58:astore_1        
		this;
	//   29   59:aload_0         
		JVM INSTR monitorexit ;
	//   30   60:monitorexit     
		throw sharedpreferences;
	//   31   61:aload_1         
	//   32   62:athrow          
		s;
	//   33   63:astore_2        
		sharedpreferences;
	//   34   64:aload_1         
		JVM INSTR monitorexit ;
	//   35   65:monitorexit     
		throw s;
	//   36   66:aload_2         
	//   37   67:athrow          
	}

	static final Map a = new HashMap();
	private final SharedPreferences b;
	private final android.content.SharedPreferences.OnSharedPreferenceChangeListener c = new ct(this);
	private final Object d = new Object();
	private volatile Map e;
	private final List f = new ArrayList();

	static 
	{
	//    0    0:new             #21  <Class HashMap>
	//    1    3:dup             
	//    2    4:invokespecial   #24  <Method void HashMap()>
	//    3    7:putstatic       #26  <Field Map a>
	//*   4   10:return          
	}
}

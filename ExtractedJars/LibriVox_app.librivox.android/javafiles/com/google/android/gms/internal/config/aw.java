// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.config;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.common.api.*;
import com.google.android.gms.common.data.*;
import com.google.firebase.iid.FirebaseInstanceId;
import java.util.*;

// Referenced classes of package com.google.android.gms.internal.config:
//			az, bb, aq, zzz, 
//			au, zzab, g, av

final class aw extends az
{

	aw(av av, w w, aq aq1)
	{
		b = aq1;
	//    0    0:aload_0         
	//    1    1:aload_3         
	//    2    2:putfield        #10  <Field aq b>
		super(w);
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:invokespecial   #13  <Method void az(w)>
	//    6   10:return          
	}

	protected final ah a(Status status)
	{
		return ((ah) (new bb(status, ((Map) (new HashMap())))));
	//    0    0:new             #18  <Class bb>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:new             #20  <Class HashMap>
	//    4    8:dup             
	//    5    9:invokespecial   #23  <Method void HashMap()>
	//    6   12:invokespecial   #26  <Method void bb(Status, Map)>
	//    7   15:areturn         
	}

	protected final void a(Context context, g g1)
	{
		DataHolder dataholder;
		e e1 = d.c();
	//    0    0:invokestatic    #35  <Method e d.c()>
	//    1    3:astore_3        
		java.util.Map.Entry entry;
		for(Iterator iterator = b.b().entrySet().iterator(); iterator.hasNext(); d.a(e1, ((com.google.android.gms.common.internal.safeparcel.SafeParcelable) (new zzz((String)entry.getKey(), (String)entry.getValue())))))
	//*   2    4:aload_0         
	//*   3    5:getfield        #10  <Field aq b>
	//*   4    8:invokevirtual   #40  <Method Map aq.b()>
	//*   5   11:invokeinterface #46  <Method Set Map.entrySet()>
	//*   6   16:invokeinterface #52  <Method Iterator Set.iterator()>
	//*   7   21:astore          4
	//*   8   23:aload           4
	//*   9   25:invokeinterface #58  <Method boolean Iterator.hasNext()>
	//*  10   30:ifeq            79
			entry = (java.util.Map.Entry)iterator.next();
	//   11   33:aload           4
	//   12   35:invokeinterface #62  <Method Object Iterator.next()>
	//   13   40:checkcast       #64  <Class java.util.Map$Entry>
	//   14   43:astore          5

	//   15   45:aload_3         
	//   16   46:new             #66  <Class zzz>
	//   17   49:dup             
	//   18   50:aload           5
	//   19   52:invokeinterface #69  <Method Object java.util.Map$Entry.getKey()>
	//   20   57:checkcast       #71  <Class String>
	//   21   60:aload           5
	//   22   62:invokeinterface #74  <Method Object java.util.Map$Entry.getValue()>
	//   23   67:checkcast       #71  <Class String>
	//   24   70:invokespecial   #77  <Method void zzz(String, String)>
	//   25   73:invokestatic    #80  <Method void d.a(e, com.google.android.gms.common.internal.safeparcel.SafeParcelable)>
	//*  26   76:goto            23
		dataholder = e1.a(0);
	//   27   79:aload_3         
	//   28   80:iconst_0        
	//   29   81:invokevirtual   #85  <Method DataHolder e.a(int)>
	//   30   84:astore          5
		String s = FirebaseInstanceId.a().c();
	//   31   86:invokestatic    #90  <Method FirebaseInstanceId FirebaseInstanceId.a()>
	//   32   89:invokevirtual   #93  <Method String FirebaseInstanceId.c()>
	//   33   92:astore_3        
		Object obj;
		try
		{
			obj = ((Object) (FirebaseInstanceId.a().d()));
	//   34   93:invokestatic    #90  <Method FirebaseInstanceId FirebaseInstanceId.a()>
	//   35   96:invokevirtual   #96  <Method String FirebaseInstanceId.d()>
	//   36   99:astore          4
			break MISSING_BLOCK_LABEL_135;
	//   37  101:goto            135
		}
		// Misplaced declaration of an exception variable
		catch(Object obj) { }
	//   38  104:astore          4
		break MISSING_BLOCK_LABEL_113;
	//   39  106:goto            113
		obj;
	//   40  109:astore          4
		s = null;
	//   41  111:aconst_null     
	//   42  112:astore_3        
		if(Log.isLoggable("ConfigApiImpl", 3))
	//*  43  113:ldc1            #98  <String "ConfigApiImpl">
	//*  44  115:iconst_3        
	//*  45  116:invokestatic    #104 <Method boolean Log.isLoggable(String, int)>
	//*  46  119:ifeq            132
			Log.d("ConfigApiImpl", "Cannot retrieve instanceId or instanceIdToken.", ((Throwable) (obj)));
	//   47  122:ldc1            #98  <String "ConfigApiImpl">
	//   48  124:ldc1            #106 <String "Cannot retrieve instanceId or instanceIdToken.">
	//   49  126:aload           4
	//   50  128:invokestatic    #109 <Method int Log.d(String, String, Throwable)>
	//   51  131:pop             
		obj = null;
	//   52  132:aconst_null     
	//   53  133:astore          4
		java.util.List list = au.a(context);
	//   54  135:aload_1         
	//   55  136:invokestatic    #114 <Method java.util.List au.a(Context)>
	//   56  139:astore          6
		context = ((Context) (new zzab(context.getPackageName(), b.a(), dataholder, b.d(), s, ((String) (obj)), ((java.util.List) (null)), b.c(), list, b.e(), b.f())));
	//   57  141:new             #116 <Class zzab>
	//   58  144:dup             
	//   59  145:aload_1         
	//   60  146:invokevirtual   #121 <Method String Context.getPackageName()>
	//   61  149:aload_0         
	//   62  150:getfield        #10  <Field aq b>
	//   63  153:invokevirtual   #124 <Method long aq.a()>
	//   64  156:aload           5
	//   65  158:aload_0         
	//   66  159:getfield        #10  <Field aq b>
	//   67  162:invokevirtual   #125 <Method String com.google.android.gms.internal.config.aq.d()>
	//   68  165:aload_3         
	//   69  166:aload           4
	//   70  168:aconst_null     
	//   71  169:aload_0         
	//   72  170:getfield        #10  <Field aq b>
	//   73  173:invokevirtual   #128 <Method int aq.c()>
	//   74  176:aload           6
	//   75  178:aload_0         
	//   76  179:getfield        #10  <Field aq b>
	//   77  182:invokevirtual   #131 <Method int com.google.android.gms.internal.config.aq.e()>
	//   78  185:aload_0         
	//   79  186:getfield        #10  <Field aq b>
	//   80  189:invokevirtual   #134 <Method int aq.f()>
	//   81  192:invokespecial   #137 <Method void zzab(String, long, DataHolder, String, String, String, java.util.List, int, java.util.List, int, int)>
	//   82  195:astore_1        
		g1.a(a, ((zzab) (context)));
	//   83  196:aload_2         
	//   84  197:aload_0         
	//   85  198:getfield        #140 <Field com.google.android.gms.internal.config.e a>
	//   86  201:aload_1         
	//   87  202:invokeinterface #145 <Method void g.a(com.google.android.gms.internal.config.e, zzab)>
		dataholder.close();
	//   88  207:aload           5
	//   89  209:invokevirtual   #150 <Method void DataHolder.close()>
		return;
	//   90  212:return          
		context;
	//   91  213:astore_1        
		dataholder.close();
	//   92  214:aload           5
	//   93  216:invokevirtual   #150 <Method void DataHolder.close()>
		throw context;
	//   94  219:aload_1         
	//   95  220:athrow          
	}

	private final aq b;
}

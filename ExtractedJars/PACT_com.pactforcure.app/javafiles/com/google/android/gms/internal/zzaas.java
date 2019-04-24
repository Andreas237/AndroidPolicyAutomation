// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.*;

public final class zzaas
{

	zzaas(Context context)
	{
		boolean flag = true;
	//    0    0:iconst_1        
	//    1    1:istore_3        
		boolean flag1 = true;
	//    2    2:iconst_1        
	//    3    3:istore          4
		super();
	//    4    5:aload_0         
	//    5    6:invokespecial   #21  <Method void Object()>
		Object obj = ((Object) (context.getResources()));
	//    6    9:aload_1         
	//    7   10:invokevirtual   #31  <Method Resources Context.getResources()>
	//    8   13:astore          5
		int i = ((Resources) (obj)).getIdentifier("google_app_measurement_enable", "integer", ((Resources) (obj)).getResourcePackageName(com.google.android.gms.R.string.common_google_play_services_unknown_issue));
	//    9   15:aload           5
	//   10   17:ldc1            #33  <String "google_app_measurement_enable">
	//   11   19:ldc1            #35  <String "integer">
	//   12   21:aload           5
	//   13   23:getstatic       #41  <Field int com.google.android.gms.R$string.common_google_play_services_unknown_issue>
	//   14   26:invokevirtual   #47  <Method String Resources.getResourcePackageName(int)>
	//   15   29:invokevirtual   #51  <Method int Resources.getIdentifier(String, String, String)>
	//   16   32:istore_2        
		if(i != 0)
	//*  17   33:iload_2         
	//*  18   34:ifeq            133
		{
			String s;
			if(((Resources) (obj)).getInteger(i) != 0)
	//*  19   37:aload           5
	//*  20   39:iload_2         
	//*  21   40:invokevirtual   #55  <Method int Resources.getInteger(int)>
	//*  22   43:ifeq            122
				flag = true;
	//   23   46:iconst_1        
	//   24   47:istore_3        
			else
	//*  25   48:iload_3         
	//*  26   49:ifne            127
	//*  27   52:aload_0         
	//*  28   53:iload           4
	//*  29   55:putfield        #57  <Field boolean zzaBq>
	//*  30   58:aload_0         
	//*  31   59:iload_3         
	//*  32   60:putfield        #59  <Field boolean zzaBp>
	//*  33   63:aload_1         
	//*  34   64:invokestatic    #65  <Method String zzz.zzaD(Context)>
	//*  35   67:astore          6
	//*  36   69:aload           6
	//*  37   71:astore          5
	//*  38   73:aload           6
	//*  39   75:ifnonnull       93
	//*  40   78:new             #67  <Class zzam>
	//*  41   81:dup             
	//*  42   82:aload_1         
	//*  43   83:invokespecial   #69  <Method void zzam(Context)>
	//*  44   86:ldc1            #71  <String "google_app_id">
	//*  45   88:invokevirtual   #75  <Method String zzam.getString(String)>
	//*  46   91:astore          5
	//*  47   93:aload           5
	//*  48   95:invokestatic    #81  <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  49   98:ifeq            141
	//*  50  101:aload_0         
	//*  51  102:new             #83  <Class Status>
	//*  52  105:dup             
	//*  53  106:bipush          10
	//*  54  108:ldc1            #85  <String "Missing google app id value from from string resources with name google_app_id.">
	//*  55  110:invokespecial   #88  <Method void Status(int, String)>
	//*  56  113:putfield        #90  <Field Status zzaBo>
	//*  57  116:aload_0         
	//*  58  117:aconst_null     
	//*  59  118:putfield        #92  <Field String zzVQ>
	//*  60  121:return          
				flag = false;
	//   61  122:iconst_0        
	//   62  123:istore_3        
			if(flag)
	//*  63  124:goto            48
				flag1 = false;
	//   64  127:iconst_0        
	//   65  128:istore          4
			zzaBq = flag1;
		} else
	//*  66  130:goto            52
		{
			zzaBq = false;
	//   67  133:aload_0         
	//   68  134:iconst_0        
	//   69  135:putfield        #57  <Field boolean zzaBq>
		}
		zzaBp = flag;
		s = zzz.zzaD(context);
		obj = ((Object) (s));
		if(s == null)
			obj = ((Object) ((new zzam(context)).getString("google_app_id")));
		if(TextUtils.isEmpty(((CharSequence) (obj))))
		{
			zzaBo = new Status(10, "Missing google app id value from from string resources with name google_app_id.");
			zzVQ = null;
			return;
		} else
	//*  70  138:goto            58
		{
			zzVQ = ((String) (obj));
	//   71  141:aload_0         
	//   72  142:aload           5
	//   73  144:putfield        #92  <Field String zzVQ>
			zzaBo = Status.zzayh;
	//   74  147:aload_0         
	//   75  148:getstatic       #95  <Field Status Status.zzayh>
	//   76  151:putfield        #90  <Field Status zzaBo>
			return;
	//   77  154:return          
		}
	}

	public static Status zzay(Context context)
	{
		zzac.zzb(((Object) (context)), "Context must not be null.");
	//    0    0:aload_0         
	//    1    1:ldc1            #99  <String "Context must not be null.">
	//    2    3:invokestatic    #105 <Method Object zzac.zzb(Object, Object)>
	//    3    6:pop             
		synchronized(zztU)
	//*   4    7:getstatic       #23  <Field Object zztU>
	//*   5   10:astore_1        
	//*   6   11:aload_1         
	//*   7   12:monitorenter    
		{
			if(zzaBn == null)
	//*   8   13:getstatic       #107 <Field zzaas zzaBn>
	//*   9   16:ifnonnull       30
				zzaBn = new zzaas(context);
	//   10   19:new             #2   <Class zzaas>
	//   11   22:dup             
	//   12   23:aload_0         
	//   13   24:invokespecial   #108 <Method void zzaas(Context)>
	//   14   27:putstatic       #107 <Field zzaas zzaBn>
			context = ((Context) (zzaBn.zzaBo));
	//   15   30:getstatic       #107 <Field zzaas zzaBn>
	//   16   33:getfield        #90  <Field Status zzaBo>
	//   17   36:astore_0        
		}
	//   18   37:aload_1         
	//   19   38:monitorexit     
		return ((Status) (context));
	//   20   39:aload_0         
	//   21   40:areturn         
		context;
	//   22   41:astore_0        
		obj;
	//   23   42:aload_1         
		JVM INSTR monitorexit ;
	//   24   43:monitorexit     
		throw context;
	//   25   44:aload_0         
	//   26   45:athrow          
	}

	private static zzaas zzdc(String s)
	{
		Object obj = zztU;
	//    0    0:getstatic       #23  <Field Object zztU>
	//    1    3:astore_1        
		obj;
	//    2    4:aload_1         
		JVM INSTR monitorenter ;
	//    3    5:monitorenter    
		if(zzaBn == null)
	//*   4    6:getstatic       #107 <Field zzaas zzaBn>
	//*   5    9:ifnonnull       59
			throw new IllegalStateException((new StringBuilder(String.valueOf(((Object) (s))).length() + 34)).append("Initialize must be called before ").append(s).append(".").toString());
	//    6   12:new             #112 <Class IllegalStateException>
	//    7   15:dup             
	//    8   16:new             #114 <Class StringBuilder>
	//    9   19:dup             
	//   10   20:aload_0         
	//   11   21:invokestatic    #120 <Method String String.valueOf(Object)>
	//   12   24:invokevirtual   #124 <Method int String.length()>
	//   13   27:bipush          34
	//   14   29:iadd            
	//   15   30:invokespecial   #127 <Method void StringBuilder(int)>
	//   16   33:ldc1            #129 <String "Initialize must be called before ">
	//   17   35:invokevirtual   #133 <Method StringBuilder StringBuilder.append(String)>
	//   18   38:aload_0         
	//   19   39:invokevirtual   #133 <Method StringBuilder StringBuilder.append(String)>
	//   20   42:ldc1            #135 <String ".">
	//   21   44:invokevirtual   #133 <Method StringBuilder StringBuilder.append(String)>
	//   22   47:invokevirtual   #139 <Method String StringBuilder.toString()>
	//   23   50:invokespecial   #142 <Method void IllegalStateException(String)>
	//   24   53:athrow          
		break MISSING_BLOCK_LABEL_59;
		s;
	//   25   54:astore_0        
		obj;
	//   26   55:aload_1         
		JVM INSTR monitorexit ;
	//   27   56:monitorexit     
		throw s;
	//   28   57:aload_0         
	//   29   58:athrow          
		s = ((String) (zzaBn));
	//   30   59:getstatic       #107 <Field zzaas zzaBn>
	//   31   62:astore_0        
		obj;
	//   32   63:aload_1         
		JVM INSTR monitorexit ;
	//   33   64:monitorexit     
		return ((zzaas) (s));
	//   34   65:aload_0         
	//   35   66:areturn         
	}

	public static String zzwj()
	{
		return zzdc("getGoogleAppId").zzVQ;
	//    0    0:ldc1            #145 <String "getGoogleAppId">
	//    1    2:invokestatic    #147 <Method zzaas zzdc(String)>
	//    2    5:getfield        #92  <Field String zzVQ>
	//    3    8:areturn         
	}

	public static boolean zzwk()
	{
		return zzdc("isMeasurementExplicitlyDisabled").zzaBq;
	//    0    0:ldc1            #151 <String "isMeasurementExplicitlyDisabled">
	//    1    2:invokestatic    #147 <Method zzaas zzdc(String)>
	//    2    5:getfield        #57  <Field boolean zzaBq>
	//    3    8:ireturn         
	}

	private static zzaas zzaBn;
	private static final Object zztU = new Object();
	private final String zzVQ;
	private final Status zzaBo;
	private final boolean zzaBp;
	private final boolean zzaBq;

	static 
	{
	//    0    0:new             #4   <Class Object>
	//    1    3:dup             
	//    2    4:invokespecial   #21  <Method void Object()>
	//    3    7:putstatic       #23  <Field Object zztU>
	//*   4   10:return          
	}
}

// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.*;

public final class zzaba
{

	zzaba(Context context)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #21  <Method void Object()>
		Object obj = ((Object) (context.getResources()));
	//    2    4:aload_1         
	//    3    5:invokevirtual   #31  <Method Resources Context.getResources()>
	//    4    8:astore          5
		String s = ((Resources) (obj)).getResourcePackageName(com.google.android.gms.R.string.common_google_play_services_unknown_issue);
	//    5   10:aload           5
	//    6   12:getstatic       #37  <Field int com.google.android.gms.R$string.common_google_play_services_unknown_issue>
	//    7   15:invokevirtual   #43  <Method String Resources.getResourcePackageName(int)>
	//    8   18:astore          6
		boolean flag = true;
	//    9   20:iconst_1        
	//   10   21:istore_3        
		int i = ((Resources) (obj)).getIdentifier("google_app_measurement_enable", "integer", s);
	//   11   22:aload           5
	//   12   24:ldc1            #45  <String "google_app_measurement_enable">
	//   13   26:ldc1            #47  <String "integer">
	//   14   28:aload           6
	//   15   30:invokevirtual   #51  <Method int Resources.getIdentifier(String, String, String)>
	//   16   33:istore_2        
		if(i != 0)
	//*  17   34:iload_2         
	//*  18   35:ifeq            76
		{
			if(((Resources) (obj)).getInteger(i) != 0)
	//*  19   38:aload           5
	//*  20   40:iload_2         
	//*  21   41:invokevirtual   #55  <Method int Resources.getInteger(int)>
	//*  22   44:ifeq            52
				flag = true;
	//   23   47:iconst_1        
	//   24   48:istore_3        
			else
	//*  25   49:goto            54
				flag = false;
	//   26   52:iconst_0        
	//   27   53:istore_3        
			boolean flag1;
			if(!flag)
	//*  28   54:iload_3         
	//*  29   55:ifne            64
				flag1 = true;
	//   30   58:iconst_1        
	//   31   59:istore          4
			else
	//*  32   61:goto            67
				flag1 = false;
	//   33   64:iconst_0        
	//   34   65:istore          4
			zzaCP = flag1;
	//   35   67:aload_0         
	//   36   68:iload           4
	//   37   70:putfield        #57  <Field boolean zzaCP>
		} else
	//*  38   73:goto            81
		{
			zzaCP = false;
	//   39   76:aload_0         
	//   40   77:iconst_0        
	//   41   78:putfield        #57  <Field boolean zzaCP>
		}
		zzaCO = flag;
	//   42   81:aload_0         
	//   43   82:iload_3         
	//   44   83:putfield        #59  <Field boolean zzaCO>
		s = zzz.zzaV(context);
	//   45   86:aload_1         
	//   46   87:invokestatic    #65  <Method String zzz.zzaV(Context)>
	//   47   90:astore          6
		obj = ((Object) (s));
	//   48   92:aload           6
	//   49   94:astore          5
		if(s == null)
	//*  50   96:aload           6
	//*  51   98:ifnonnull       116
			obj = ((Object) ((new zzam(context)).getString("google_app_id")));
	//   52  101:new             #67  <Class zzam>
	//   53  104:dup             
	//   54  105:aload_1         
	//   55  106:invokespecial   #69  <Method void zzam(Context)>
	//   56  109:ldc1            #71  <String "google_app_id">
	//   57  111:invokevirtual   #75  <Method String zzam.getString(String)>
	//   58  114:astore          5
		if(TextUtils.isEmpty(((CharSequence) (obj))))
	//*  59  116:aload           5
	//*  60  118:invokestatic    #81  <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  61  121:ifeq            145
		{
			zzaCN = new Status(10, "Missing google app id value from from string resources with name google_app_id.");
	//   62  124:aload_0         
	//   63  125:new             #83  <Class Status>
	//   64  128:dup             
	//   65  129:bipush          10
	//   66  131:ldc1            #85  <String "Missing google app id value from from string resources with name google_app_id.">
	//   67  133:invokespecial   #88  <Method void Status(int, String)>
	//   68  136:putfield        #90  <Field Status zzaCN>
			mAppId = null;
	//   69  139:aload_0         
	//   70  140:aconst_null     
	//   71  141:putfield        #92  <Field String mAppId>
			return;
	//   72  144:return          
		} else
		{
			mAppId = ((String) (obj));
	//   73  145:aload_0         
	//   74  146:aload           5
	//   75  148:putfield        #92  <Field String mAppId>
			zzaCN = Status.zzazx;
	//   76  151:aload_0         
	//   77  152:getstatic       #95  <Field Status Status.zzazx>
	//   78  155:putfield        #90  <Field Status zzaCN>
			return;
	//   79  158:return          
		}
	}

	public static Status zzaQ(Context context)
	{
		zzac.zzb(((Object) (context)), "Context must not be null.");
	//    0    0:aload_0         
	//    1    1:ldc1            #99  <String "Context must not be null.">
	//    2    3:invokestatic    #105 <Method Object zzac.zzb(Object, Object)>
	//    3    6:pop             
		Object obj = zztX;
	//    4    7:getstatic       #23  <Field Object zztX>
	//    5   10:astore_1        
		obj;
	//    6   11:aload_1         
		JVM INSTR monitorenter ;
	//    7   12:monitorenter    
		if(zzaCM == null)
	//*   8   13:getstatic       #107 <Field zzaba zzaCM>
	//*   9   16:ifnonnull       30
			zzaCM = new zzaba(context);
	//   10   19:new             #2   <Class zzaba>
	//   11   22:dup             
	//   12   23:aload_0         
	//   13   24:invokespecial   #108 <Method void zzaba(Context)>
	//   14   27:putstatic       #107 <Field zzaba zzaCM>
		context = ((Context) (zzaCM.zzaCN));
	//   15   30:getstatic       #107 <Field zzaba zzaCM>
	//   16   33:getfield        #90  <Field Status zzaCN>
	//   17   36:astore_0        
		obj;
	//   18   37:aload_1         
		JVM INSTR monitorexit ;
	//   19   38:monitorexit     
		return ((Status) (context));
	//   20   39:aload_0         
	//   21   40:areturn         
		context;
	//   22   41:astore_0        
	//*  23   42:aload_1         
		throw context;
	//   24   43:monitorexit     
	//   25   44:aload_0         
	//   26   45:athrow          
	}

	private static zzaba zzde(String s)
	{
		Object obj = zztX;
	//    0    0:getstatic       #23  <Field Object zztX>
	//    1    3:astore_1        
		obj;
	//    2    4:aload_1         
		JVM INSTR monitorenter ;
	//    3    5:monitorenter    
		if(zzaCM == null)
	//*   4    6:getstatic       #107 <Field zzaba zzaCM>
	//*   5    9:ifnonnull       54
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
		s = ((String) (zzaCM));
	//   25   54:getstatic       #107 <Field zzaba zzaCM>
	//   26   57:astore_0        
		obj;
	//   27   58:aload_1         
		JVM INSTR monitorexit ;
	//   28   59:monitorexit     
		return ((zzaba) (s));
	//   29   60:aload_0         
	//   30   61:areturn         
		s;
	//   31   62:astore_0        
	//*  32   63:aload_1         
		throw s;
	//   33   64:monitorexit     
	//   34   65:aload_0         
	//   35   66:athrow          
	}

	public static String zzwQ()
	{
		return zzde("getGoogleAppId").mAppId;
	//    0    0:ldc1            #145 <String "getGoogleAppId">
	//    1    2:invokestatic    #147 <Method zzaba zzde(String)>
	//    2    5:getfield        #92  <Field String mAppId>
	//    3    8:areturn         
	}

	public static boolean zzwR()
	{
		return zzde("isMeasurementExplicitlyDisabled").zzaCP;
	//    0    0:ldc1            #151 <String "isMeasurementExplicitlyDisabled">
	//    1    2:invokestatic    #147 <Method zzaba zzde(String)>
	//    2    5:getfield        #57  <Field boolean zzaCP>
	//    3    8:ireturn         
	}

	private static zzaba zzaCM;
	private static final Object zztX = new Object();
	private final String mAppId;
	private final Status zzaCN;
	private final boolean zzaCO;
	private final boolean zzaCP;

	static 
	{
	//    0    0:new             #4   <Class Object>
	//    1    3:dup             
	//    2    4:invokespecial   #21  <Method void Object()>
	//    3    7:putstatic       #23  <Field Object zztX>
	//*   4   10:return          
	}
}

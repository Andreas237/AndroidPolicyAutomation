// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.*;

public final class GoogleServices
{

	GoogleServices(Context context)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #24  <Method void Object()>
		Object obj = ((Object) (context.getResources()));
	//    2    4:aload_1         
	//    3    5:invokevirtual   #35  <Method Resources Context.getResources()>
	//    4    8:astore          5
		int i = ((Resources) (obj)).getIdentifier("google_app_measurement_enable", "integer", ((Resources) (obj)).getResourcePackageName(com.google.android.gms.common.R.string.common_google_play_services_unknown_issue));
	//    5   10:aload           5
	//    6   12:ldc1            #37  <String "google_app_measurement_enable">
	//    7   14:ldc1            #39  <String "integer">
	//    8   16:aload           5
	//    9   18:getstatic       #45  <Field int com.google.android.gms.common.R$string.common_google_play_services_unknown_issue>
	//   10   21:invokevirtual   #51  <Method String Resources.getResourcePackageName(int)>
	//   11   24:invokevirtual   #55  <Method int Resources.getIdentifier(String, String, String)>
	//   12   27:istore_2        
		boolean flag1 = true;
	//   13   28:iconst_1        
	//   14   29:istore          4
		boolean flag = true;
	//   15   31:iconst_1        
	//   16   32:istore_3        
		if(i != 0)
	//*  17   33:iload_2         
	//*  18   34:ifeq            61
		{
			if(((Resources) (obj)).getInteger(i) == 0)
	//*  19   37:aload           5
	//*  20   39:iload_2         
	//*  21   40:invokevirtual   #59  <Method int Resources.getInteger(int)>
	//*  22   43:ifeq            49
	//*  23   46:goto            51
				flag = false;
	//   24   49:iconst_0        
	//   25   50:istore_3        
			zzbb = flag ^ true;
	//   26   51:aload_0         
	//   27   52:iload_3         
	//   28   53:iconst_1        
	//   29   54:ixor            
	//   30   55:putfield        #61  <Field boolean zzbb>
		} else
	//*  31   58:goto            69
		{
			zzbb = false;
	//   32   61:aload_0         
	//   33   62:iconst_0        
	//   34   63:putfield        #61  <Field boolean zzbb>
			flag = flag1;
	//   35   66:iload           4
	//   36   68:istore_3        
		}
		zzba = flag;
	//   37   69:aload_0         
	//   38   70:iload_3         
	//   39   71:putfield        #63  <Field boolean zzba>
		String s = zzp.zzc(context);
	//   40   74:aload_1         
	//   41   75:invokestatic    #69  <Method String zzp.zzc(Context)>
	//   42   78:astore          6
		obj = ((Object) (s));
	//   43   80:aload           6
	//   44   82:astore          5
		if(s == null)
	//*  45   84:aload           6
	//*  46   86:ifnonnull       104
			obj = ((Object) ((new StringResourceValueReader(context)).getString("google_app_id")));
	//   47   89:new             #71  <Class StringResourceValueReader>
	//   48   92:dup             
	//   49   93:aload_1         
	//   50   94:invokespecial   #73  <Method void StringResourceValueReader(Context)>
	//   51   97:ldc1            #75  <String "google_app_id">
	//   52   99:invokevirtual   #79  <Method String StringResourceValueReader.getString(String)>
	//   53  102:astore          5
		if(TextUtils.isEmpty(((CharSequence) (obj))))
	//*  54  104:aload           5
	//*  55  106:invokestatic    #85  <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  56  109:ifeq            133
		{
			zzaz = new Status(10, "Missing google app id value from from string resources with name google_app_id.");
	//   57  112:aload_0         
	//   58  113:new             #87  <Class Status>
	//   59  116:dup             
	//   60  117:bipush          10
	//   61  119:ldc1            #89  <String "Missing google app id value from from string resources with name google_app_id.">
	//   62  121:invokespecial   #92  <Method void Status(int, String)>
	//   63  124:putfield        #94  <Field Status zzaz>
			zzay = null;
	//   64  127:aload_0         
	//   65  128:aconst_null     
	//   66  129:putfield        #96  <Field String zzay>
			return;
	//   67  132:return          
		} else
		{
			zzay = ((String) (obj));
	//   68  133:aload_0         
	//   69  134:aload           5
	//   70  136:putfield        #96  <Field String zzay>
			zzaz = Status.RESULT_SUCCESS;
	//   71  139:aload_0         
	//   72  140:getstatic       #99  <Field Status Status.RESULT_SUCCESS>
	//   73  143:putfield        #94  <Field Status zzaz>
			return;
	//   74  146:return          
		}
	}

	GoogleServices(String s, boolean flag)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #24  <Method void Object()>
		zzay = s;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #96  <Field String zzay>
		zzaz = Status.RESULT_SUCCESS;
	//    5    9:aload_0         
	//    6   10:getstatic       #99  <Field Status Status.RESULT_SUCCESS>
	//    7   13:putfield        #94  <Field Status zzaz>
		zzba = flag;
	//    8   16:aload_0         
	//    9   17:iload_2         
	//   10   18:putfield        #63  <Field boolean zzba>
		zzbb = flag ^ true;
	//   11   21:aload_0         
	//   12   22:iload_2         
	//   13   23:iconst_1        
	//   14   24:ixor            
	//   15   25:putfield        #61  <Field boolean zzbb>
	//   16   28:return          
	}

	private static GoogleServices checkInitialized(String s)
	{
		synchronized(sLock)
	//*   0    0:getstatic       #26  <Field Object sLock>
	//*   1    3:astore_1        
	//*   2    4:aload_1         
	//*   3    5:monitorenter    
		{
			if(zzax == null)
	//*   4    6:getstatic       #105 <Field GoogleServices zzax>
	//*   5    9:ifnonnull       62
			{
				StringBuilder stringbuilder = new StringBuilder(String.valueOf(((Object) (s))).length() + 34);
	//    6   12:new             #107 <Class StringBuilder>
	//    7   15:dup             
	//    8   16:aload_0         
	//    9   17:invokestatic    #113 <Method String String.valueOf(Object)>
	//   10   20:invokevirtual   #117 <Method int String.length()>
	//   11   23:bipush          34
	//   12   25:iadd            
	//   13   26:invokespecial   #120 <Method void StringBuilder(int)>
	//   14   29:astore_2        
				stringbuilder.append("Initialize must be called before ");
	//   15   30:aload_2         
	//   16   31:ldc1            #122 <String "Initialize must be called before ">
	//   17   33:invokevirtual   #126 <Method StringBuilder StringBuilder.append(String)>
	//   18   36:pop             
				stringbuilder.append(s);
	//   19   37:aload_2         
	//   20   38:aload_0         
	//   21   39:invokevirtual   #126 <Method StringBuilder StringBuilder.append(String)>
	//   22   42:pop             
				stringbuilder.append(".");
	//   23   43:aload_2         
	//   24   44:ldc1            #128 <String ".">
	//   25   46:invokevirtual   #126 <Method StringBuilder StringBuilder.append(String)>
	//   26   49:pop             
				throw new IllegalStateException(stringbuilder.toString());
	//   27   50:new             #130 <Class IllegalStateException>
	//   28   53:dup             
	//   29   54:aload_2         
	//   30   55:invokevirtual   #134 <Method String StringBuilder.toString()>
	//   31   58:invokespecial   #137 <Method void IllegalStateException(String)>
	//   32   61:athrow          
			}
			s = ((String) (zzax));
	//   33   62:getstatic       #105 <Field GoogleServices zzax>
	//   34   65:astore_0        
		}
	//   35   66:aload_1         
	//   36   67:monitorexit     
		return ((GoogleServices) (s));
	//   37   68:aload_0         
	//   38   69:areturn         
		s;
	//   39   70:astore_0        
		obj;
	//   40   71:aload_1         
		JVM INSTR monitorexit ;
	//   41   72:monitorexit     
		throw s;
	//   42   73:aload_0         
	//   43   74:athrow          
	}

	static void clearInstanceForTest()
	{
		synchronized(sLock)
	//*   0    0:getstatic       #26  <Field Object sLock>
	//*   1    3:astore_0        
	//*   2    4:aload_0         
	//*   3    5:monitorenter    
		{
			zzax = null;
	//    4    6:aconst_null     
	//    5    7:putstatic       #105 <Field GoogleServices zzax>
		}
	//    6   10:aload_0         
	//    7   11:monitorexit     
		return;
	//    8   12:return          
		exception;
	//    9   13:astore_1        
		obj;
	//   10   14:aload_0         
		JVM INSTR monitorexit ;
	//   11   15:monitorexit     
		throw exception;
	//   12   16:aload_1         
	//   13   17:athrow          
	}

	public static String getGoogleAppId()
	{
		return checkInitialized("getGoogleAppId").zzay;
	//    0    0:ldc1            #140 <String "getGoogleAppId">
	//    1    2:invokestatic    #142 <Method GoogleServices checkInitialized(String)>
	//    2    5:getfield        #96  <Field String zzay>
	//    3    8:areturn         
	}

	public static Status initialize(Context context)
	{
		Preconditions.checkNotNull(((Object) (context)), "Context must not be null.");
	//    0    0:aload_0         
	//    1    1:ldc1            #146 <String "Context must not be null.">
	//    2    3:invokestatic    #152 <Method Object Preconditions.checkNotNull(Object, Object)>
	//    3    6:pop             
		synchronized(sLock)
	//*   4    7:getstatic       #26  <Field Object sLock>
	//*   5   10:astore_1        
	//*   6   11:aload_1         
	//*   7   12:monitorenter    
		{
			if(zzax == null)
	//*   8   13:getstatic       #105 <Field GoogleServices zzax>
	//*   9   16:ifnonnull       30
				zzax = new GoogleServices(context);
	//   10   19:new             #2   <Class GoogleServices>
	//   11   22:dup             
	//   12   23:aload_0         
	//   13   24:invokespecial   #153 <Method void GoogleServices(Context)>
	//   14   27:putstatic       #105 <Field GoogleServices zzax>
			context = ((Context) (zzax.zzaz));
	//   15   30:getstatic       #105 <Field GoogleServices zzax>
	//   16   33:getfield        #94  <Field Status zzaz>
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

	public static Status initialize(Context context, String s, boolean flag)
	{
label0:
		{
			Preconditions.checkNotNull(((Object) (context)), "Context must not be null.");
	//    0    0:aload_0         
	//    1    1:ldc1            #146 <String "Context must not be null.">
	//    2    3:invokestatic    #152 <Method Object Preconditions.checkNotNull(Object, Object)>
	//    3    6:pop             
			Preconditions.checkNotEmpty(s, "App ID must be nonempty.");
	//    4    7:aload_1         
	//    5    8:ldc1            #156 <String "App ID must be nonempty.">
	//    6   10:invokestatic    #160 <Method String Preconditions.checkNotEmpty(String, Object)>
	//    7   13:pop             
			synchronized(sLock)
	//*   8   14:getstatic       #26  <Field Object sLock>
	//*   9   17:astore_0        
	//*  10   18:aload_0         
	//*  11   19:monitorenter    
			{
				if(zzax == null)
					break label0;
	//   12   20:getstatic       #105 <Field GoogleServices zzax>
	//   13   23:ifnull          38
				s = ((String) (zzax.checkGoogleAppId(s)));
	//   14   26:getstatic       #105 <Field GoogleServices zzax>
	//   15   29:aload_1         
	//   16   30:invokevirtual   #164 <Method Status checkGoogleAppId(String)>
	//   17   33:astore_1        
			}
	//   18   34:aload_0         
	//   19   35:monitorexit     
			return ((Status) (s));
	//   20   36:aload_1         
	//   21   37:areturn         
		}
		s = ((String) (new GoogleServices(s, flag)));
	//   22   38:new             #2   <Class GoogleServices>
	//   23   41:dup             
	//   24   42:aload_1         
	//   25   43:iload_2         
	//   26   44:invokespecial   #166 <Method void GoogleServices(String, boolean)>
	//   27   47:astore_1        
		zzax = ((GoogleServices) (s));
	//   28   48:aload_1         
	//   29   49:putstatic       #105 <Field GoogleServices zzax>
		s = ((String) (((GoogleServices) (s)).zzaz));
	//   30   52:aload_1         
	//   31   53:getfield        #94  <Field Status zzaz>
	//   32   56:astore_1        
		context;
	//   33   57:aload_0         
		JVM INSTR monitorexit ;
	//   34   58:monitorexit     
		return ((Status) (s));
	//   35   59:aload_1         
	//   36   60:areturn         
		s;
	//   37   61:astore_1        
		context;
	//   38   62:aload_0         
		JVM INSTR monitorexit ;
	//   39   63:monitorexit     
		throw s;
	//   40   64:aload_1         
	//   41   65:athrow          
	}

	public static boolean isMeasurementEnabled()
	{
		GoogleServices googleservices = checkInitialized("isMeasurementEnabled");
	//    0    0:ldc1            #169 <String "isMeasurementEnabled">
	//    1    2:invokestatic    #142 <Method GoogleServices checkInitialized(String)>
	//    2    5:astore_0        
		return googleservices.zzaz.isSuccess() && googleservices.zzba;
	//    3    6:aload_0         
	//    4    7:getfield        #94  <Field Status zzaz>
	//    5   10:invokevirtual   #172 <Method boolean Status.isSuccess()>
	//    6   13:ifeq            25
	//    7   16:aload_0         
	//    8   17:getfield        #63  <Field boolean zzba>
	//    9   20:ifeq            25
	//   10   23:iconst_1        
	//   11   24:ireturn         
	//   12   25:iconst_0        
	//   13   26:ireturn         
	}

	public static boolean isMeasurementExplicitlyDisabled()
	{
		return checkInitialized("isMeasurementExplicitlyDisabled").zzbb;
	//    0    0:ldc1            #174 <String "isMeasurementExplicitlyDisabled">
	//    1    2:invokestatic    #142 <Method GoogleServices checkInitialized(String)>
	//    2    5:getfield        #61  <Field boolean zzbb>
	//    3    8:ireturn         
	}

	final Status checkGoogleAppId(String s)
	{
		if(zzay != null && !zzay.equals(((Object) (s))))
	//*   0    0:aload_0         
	//*   1    1:getfield        #96  <Field String zzay>
	//*   2    4:ifnull          75
	//*   3    7:aload_0         
	//*   4    8:getfield        #96  <Field String zzay>
	//*   5   11:aload_1         
	//*   6   12:invokevirtual   #178 <Method boolean String.equals(Object)>
	//*   7   15:ifne            75
		{
			s = zzay;
	//    8   18:aload_0         
	//    9   19:getfield        #96  <Field String zzay>
	//   10   22:astore_1        
			StringBuilder stringbuilder = new StringBuilder(String.valueOf(((Object) (s))).length() + 97);
	//   11   23:new             #107 <Class StringBuilder>
	//   12   26:dup             
	//   13   27:aload_1         
	//   14   28:invokestatic    #113 <Method String String.valueOf(Object)>
	//   15   31:invokevirtual   #117 <Method int String.length()>
	//   16   34:bipush          97
	//   17   36:iadd            
	//   18   37:invokespecial   #120 <Method void StringBuilder(int)>
	//   19   40:astore_2        
			stringbuilder.append("Initialize was called with two different Google App IDs.  Only the first app ID will be used: '");
	//   20   41:aload_2         
	//   21   42:ldc1            #180 <String "Initialize was called with two different Google App IDs.  Only the first app ID will be used: '">
	//   22   44:invokevirtual   #126 <Method StringBuilder StringBuilder.append(String)>
	//   23   47:pop             
			stringbuilder.append(s);
	//   24   48:aload_2         
	//   25   49:aload_1         
	//   26   50:invokevirtual   #126 <Method StringBuilder StringBuilder.append(String)>
	//   27   53:pop             
			stringbuilder.append("'.");
	//   28   54:aload_2         
	//   29   55:ldc1            #182 <String "'.">
	//   30   57:invokevirtual   #126 <Method StringBuilder StringBuilder.append(String)>
	//   31   60:pop             
			return new Status(10, stringbuilder.toString());
	//   32   61:new             #87  <Class Status>
	//   33   64:dup             
	//   34   65:bipush          10
	//   35   67:aload_2         
	//   36   68:invokevirtual   #134 <Method String StringBuilder.toString()>
	//   37   71:invokespecial   #92  <Method void Status(int, String)>
	//   38   74:areturn         
		} else
		{
			return Status.RESULT_SUCCESS;
	//   39   75:getstatic       #99  <Field Status Status.RESULT_SUCCESS>
	//   40   78:areturn         
		}
	}

	private static final Object sLock = new Object();
	private static GoogleServices zzax;
	private final String zzay;
	private final Status zzaz;
	private final boolean zzba;
	private final boolean zzbb;

	static 
	{
	//    0    0:new             #4   <Class Object>
	//    1    3:dup             
	//    2    4:invokespecial   #24  <Method void Object()>
	//    3    7:putstatic       #26  <Field Object sLock>
	//*   4   10:return          
	}
}

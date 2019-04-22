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
			zzky = flag ^ true;
	//   26   51:aload_0         
	//   27   52:iload_3         
	//   28   53:iconst_1        
	//   29   54:ixor            
	//   30   55:putfield        #61  <Field boolean zzky>
		} else
	//*  31   58:goto            69
		{
			zzky = false;
	//   32   61:aload_0         
	//   33   62:iconst_0        
	//   34   63:putfield        #61  <Field boolean zzky>
			flag = flag1;
	//   35   66:iload           4
	//   36   68:istore_3        
		}
		zzkx = flag;
	//   37   69:aload_0         
	//   38   70:iload_3         
	//   39   71:putfield        #63  <Field boolean zzkx>
		String s = MetadataValueReader.getGoogleAppId(context);
	//   40   74:aload_1         
	//   41   75:invokestatic    #69  <Method String MetadataValueReader.getGoogleAppId(Context)>
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
			zzkw = new Status(10, "Missing google app id value from from string resources with name google_app_id.");
	//   57  112:aload_0         
	//   58  113:new             #87  <Class Status>
	//   59  116:dup             
	//   60  117:bipush          10
	//   61  119:ldc1            #89  <String "Missing google app id value from from string resources with name google_app_id.">
	//   62  121:invokespecial   #92  <Method void Status(int, String)>
	//   63  124:putfield        #94  <Field Status zzkw>
			zzkv = null;
	//   64  127:aload_0         
	//   65  128:aconst_null     
	//   66  129:putfield        #96  <Field String zzkv>
			return;
	//   67  132:return          
		} else
		{
			zzkv = ((String) (obj));
	//   68  133:aload_0         
	//   69  134:aload           5
	//   70  136:putfield        #96  <Field String zzkv>
			zzkw = Status.RESULT_SUCCESS;
	//   71  139:aload_0         
	//   72  140:getstatic       #99  <Field Status Status.RESULT_SUCCESS>
	//   73  143:putfield        #94  <Field Status zzkw>
			return;
	//   74  146:return          
		}
	}

	GoogleServices(String s, boolean flag)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #24  <Method void Object()>
		zzkv = s;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #96  <Field String zzkv>
		zzkw = Status.RESULT_SUCCESS;
	//    5    9:aload_0         
	//    6   10:getstatic       #99  <Field Status Status.RESULT_SUCCESS>
	//    7   13:putfield        #94  <Field Status zzkw>
		zzkx = flag;
	//    8   16:aload_0         
	//    9   17:iload_2         
	//   10   18:putfield        #63  <Field boolean zzkx>
		zzky = flag ^ true;
	//   11   21:aload_0         
	//   12   22:iload_2         
	//   13   23:iconst_1        
	//   14   24:ixor            
	//   15   25:putfield        #61  <Field boolean zzky>
	//   16   28:return          
	}

	private static GoogleServices checkInitialized(String s)
	{
label0:
		{
			synchronized(sLock)
	//*   0    0:getstatic       #26  <Field Object sLock>
	//*   1    3:astore_1        
	//*   2    4:aload_1         
	//*   3    5:monitorenter    
			{
				if(zzku == null)
					break label0;
	//    4    6:getstatic       #105 <Field GoogleServices zzku>
	//    5    9:ifnull          20
				s = ((String) (zzku));
	//    6   12:getstatic       #105 <Field GoogleServices zzku>
	//    7   15:astore_0        
			}
	//    8   16:aload_1         
	//    9   17:monitorexit     
			return ((GoogleServices) (s));
	//   10   18:aload_0         
	//   11   19:areturn         
		}
		StringBuilder stringbuilder = new StringBuilder(String.valueOf(((Object) (s))).length() + 34);
	//   12   20:new             #107 <Class StringBuilder>
	//   13   23:dup             
	//   14   24:aload_0         
	//   15   25:invokestatic    #113 <Method String String.valueOf(Object)>
	//   16   28:invokevirtual   #117 <Method int String.length()>
	//   17   31:bipush          34
	//   18   33:iadd            
	//   19   34:invokespecial   #120 <Method void StringBuilder(int)>
	//   20   37:astore_2        
		stringbuilder.append("Initialize must be called before ");
	//   21   38:aload_2         
	//   22   39:ldc1            #122 <String "Initialize must be called before ">
	//   23   41:invokevirtual   #126 <Method StringBuilder StringBuilder.append(String)>
	//   24   44:pop             
		stringbuilder.append(s);
	//   25   45:aload_2         
	//   26   46:aload_0         
	//   27   47:invokevirtual   #126 <Method StringBuilder StringBuilder.append(String)>
	//   28   50:pop             
		stringbuilder.append(".");
	//   29   51:aload_2         
	//   30   52:ldc1            #128 <String ".">
	//   31   54:invokevirtual   #126 <Method StringBuilder StringBuilder.append(String)>
	//   32   57:pop             
		throw new IllegalStateException(stringbuilder.toString());
	//   33   58:new             #130 <Class IllegalStateException>
	//   34   61:dup             
	//   35   62:aload_2         
	//   36   63:invokevirtual   #134 <Method String StringBuilder.toString()>
	//   37   66:invokespecial   #137 <Method void IllegalStateException(String)>
	//   38   69:athrow          
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
			zzku = null;
	//    4    6:aconst_null     
	//    5    7:putstatic       #105 <Field GoogleServices zzku>
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
		return checkInitialized("getGoogleAppId").zzkv;
	//    0    0:ldc1            #139 <String "getGoogleAppId">
	//    1    2:invokestatic    #141 <Method GoogleServices checkInitialized(String)>
	//    2    5:getfield        #96  <Field String zzkv>
	//    3    8:areturn         
	}

	public static Status initialize(Context context)
	{
		Preconditions.checkNotNull(((Object) (context)), "Context must not be null.");
	//    0    0:aload_0         
	//    1    1:ldc1            #145 <String "Context must not be null.">
	//    2    3:invokestatic    #151 <Method Object Preconditions.checkNotNull(Object, Object)>
	//    3    6:pop             
		synchronized(sLock)
	//*   4    7:getstatic       #26  <Field Object sLock>
	//*   5   10:astore_1        
	//*   6   11:aload_1         
	//*   7   12:monitorenter    
		{
			if(zzku == null)
	//*   8   13:getstatic       #105 <Field GoogleServices zzku>
	//*   9   16:ifnonnull       30
				zzku = new GoogleServices(context);
	//   10   19:new             #2   <Class GoogleServices>
	//   11   22:dup             
	//   12   23:aload_0         
	//   13   24:invokespecial   #152 <Method void GoogleServices(Context)>
	//   14   27:putstatic       #105 <Field GoogleServices zzku>
			context = ((Context) (zzku.zzkw));
	//   15   30:getstatic       #105 <Field GoogleServices zzku>
	//   16   33:getfield        #94  <Field Status zzkw>
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
	//    1    1:ldc1            #145 <String "Context must not be null.">
	//    2    3:invokestatic    #151 <Method Object Preconditions.checkNotNull(Object, Object)>
	//    3    6:pop             
			Preconditions.checkNotEmpty(s, "App ID must be nonempty.");
	//    4    7:aload_1         
	//    5    8:ldc1            #155 <String "App ID must be nonempty.">
	//    6   10:invokestatic    #159 <Method String Preconditions.checkNotEmpty(String, Object)>
	//    7   13:pop             
			synchronized(sLock)
	//*   8   14:getstatic       #26  <Field Object sLock>
	//*   9   17:astore_0        
	//*  10   18:aload_0         
	//*  11   19:monitorenter    
			{
				if(zzku == null)
					break label0;
	//   12   20:getstatic       #105 <Field GoogleServices zzku>
	//   13   23:ifnull          38
				s = ((String) (zzku.checkGoogleAppId(s)));
	//   14   26:getstatic       #105 <Field GoogleServices zzku>
	//   15   29:aload_1         
	//   16   30:invokevirtual   #163 <Method Status checkGoogleAppId(String)>
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
	//   26   44:invokespecial   #165 <Method void GoogleServices(String, boolean)>
	//   27   47:astore_1        
		zzku = ((GoogleServices) (s));
	//   28   48:aload_1         
	//   29   49:putstatic       #105 <Field GoogleServices zzku>
		s = ((String) (((GoogleServices) (s)).zzkw));
	//   30   52:aload_1         
	//   31   53:getfield        #94  <Field Status zzkw>
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
	//    0    0:ldc1            #168 <String "isMeasurementEnabled">
	//    1    2:invokestatic    #141 <Method GoogleServices checkInitialized(String)>
	//    2    5:astore_0        
		return googleservices.zzkw.isSuccess() && googleservices.zzkx;
	//    3    6:aload_0         
	//    4    7:getfield        #94  <Field Status zzkw>
	//    5   10:invokevirtual   #171 <Method boolean Status.isSuccess()>
	//    6   13:ifeq            25
	//    7   16:aload_0         
	//    8   17:getfield        #63  <Field boolean zzkx>
	//    9   20:ifeq            25
	//   10   23:iconst_1        
	//   11   24:ireturn         
	//   12   25:iconst_0        
	//   13   26:ireturn         
	}

	public static boolean isMeasurementExplicitlyDisabled()
	{
		return checkInitialized("isMeasurementExplicitlyDisabled").zzky;
	//    0    0:ldc1            #173 <String "isMeasurementExplicitlyDisabled">
	//    1    2:invokestatic    #141 <Method GoogleServices checkInitialized(String)>
	//    2    5:getfield        #61  <Field boolean zzky>
	//    3    8:ireturn         
	}

	final Status checkGoogleAppId(String s)
	{
		String s1 = zzkv;
	//    0    0:aload_0         
	//    1    1:getfield        #96  <Field String zzkv>
	//    2    4:astore_2        
		if(s1 != null && !s1.equals(((Object) (s))))
	//*   3    5:aload_2         
	//*   4    6:ifnull          74
	//*   5    9:aload_2         
	//*   6   10:aload_1         
	//*   7   11:invokevirtual   #177 <Method boolean String.equals(Object)>
	//*   8   14:ifne            74
		{
			s = zzkv;
	//    9   17:aload_0         
	//   10   18:getfield        #96  <Field String zzkv>
	//   11   21:astore_1        
			StringBuilder stringbuilder = new StringBuilder(String.valueOf(((Object) (s))).length() + 97);
	//   12   22:new             #107 <Class StringBuilder>
	//   13   25:dup             
	//   14   26:aload_1         
	//   15   27:invokestatic    #113 <Method String String.valueOf(Object)>
	//   16   30:invokevirtual   #117 <Method int String.length()>
	//   17   33:bipush          97
	//   18   35:iadd            
	//   19   36:invokespecial   #120 <Method void StringBuilder(int)>
	//   20   39:astore_2        
			stringbuilder.append("Initialize was called with two different Google App IDs.  Only the first app ID will be used: '");
	//   21   40:aload_2         
	//   22   41:ldc1            #179 <String "Initialize was called with two different Google App IDs.  Only the first app ID will be used: '">
	//   23   43:invokevirtual   #126 <Method StringBuilder StringBuilder.append(String)>
	//   24   46:pop             
			stringbuilder.append(s);
	//   25   47:aload_2         
	//   26   48:aload_1         
	//   27   49:invokevirtual   #126 <Method StringBuilder StringBuilder.append(String)>
	//   28   52:pop             
			stringbuilder.append("'.");
	//   29   53:aload_2         
	//   30   54:ldc1            #181 <String "'.">
	//   31   56:invokevirtual   #126 <Method StringBuilder StringBuilder.append(String)>
	//   32   59:pop             
			return new Status(10, stringbuilder.toString());
	//   33   60:new             #87  <Class Status>
	//   34   63:dup             
	//   35   64:bipush          10
	//   36   66:aload_2         
	//   37   67:invokevirtual   #134 <Method String StringBuilder.toString()>
	//   38   70:invokespecial   #92  <Method void Status(int, String)>
	//   39   73:areturn         
		} else
		{
			return Status.RESULT_SUCCESS;
	//   40   74:getstatic       #99  <Field Status Status.RESULT_SUCCESS>
	//   41   77:areturn         
		}
	}

	private static final Object sLock = new Object();
	private static GoogleServices zzku;
	private final String zzkv;
	private final Status zzkw;
	private final boolean zzkx;
	private final boolean zzky;

	static 
	{
	//    0    0:new             #4   <Class Object>
	//    1    3:dup             
	//    2    4:invokespecial   #24  <Method void Object()>
	//    3    7:putstatic       #26  <Field Object sLock>
	//*   4   10:return          
	}
}

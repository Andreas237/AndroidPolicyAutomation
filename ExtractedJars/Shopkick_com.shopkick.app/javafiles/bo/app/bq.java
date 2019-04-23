// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package bo.app;

import android.content.Context;
import android.content.SharedPreferences;
import com.appboy.configuration.AppboyConfigurationProvider;
import com.appboy.support.AppboyLogger;

// Referenced classes of package bo.app:
//			bp, ba

public class bq
	implements bp
{

	public bq(Context context, AppboyConfigurationProvider appboyconfigurationprovider)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #28  <Method void Object()>
		c = appboyconfigurationprovider;
	//    2    4:aload_0         
	//    3    5:aload_2         
	//    4    6:putfield        #30  <Field AppboyConfigurationProvider c>
		a = context.getSharedPreferences("com.appboy.push_registration", 0);
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:ldc1            #32  <String "com.appboy.push_registration">
	//    8   13:iconst_0        
	//    9   14:invokevirtual   #38  <Method SharedPreferences Context.getSharedPreferences(String, int)>
	//   10   17:putfield        #40  <Field SharedPreferences a>
	//   11   20:return          
	}

	private boolean b()
	{
		return c.isGcmMessagingRegistrationEnabled() || c.isAdmMessagingRegistrationEnabled() || c.isFirebaseCloudMessagingRegistrationEnabled();
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field AppboyConfigurationProvider c>
	//    2    4:invokevirtual   #46  <Method boolean AppboyConfigurationProvider.isGcmMessagingRegistrationEnabled()>
	//    3    7:ifne            35
	//    4   10:aload_0         
	//    5   11:getfield        #30  <Field AppboyConfigurationProvider c>
	//    6   14:invokevirtual   #49  <Method boolean AppboyConfigurationProvider.isAdmMessagingRegistrationEnabled()>
	//    7   17:ifne            35
	//    8   20:aload_0         
	//    9   21:getfield        #30  <Field AppboyConfigurationProvider c>
	//   10   24:invokevirtual   #52  <Method boolean AppboyConfigurationProvider.isFirebaseCloudMessagingRegistrationEnabled()>
	//   11   27:ifeq            33
	//   12   30:goto            35
	//   13   33:iconst_0        
	//   14   34:ireturn         
	//   15   35:iconst_1        
	//   16   36:ireturn         
	}

	public String a()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		int i;
		int j;
		if(!b() || !a.contains("version_code"))
			break MISSING_BLOCK_LABEL_54;
	//    2    2:aload_0         
	//    3    3:invokespecial   #55  <Method boolean b()>
	//    4    6:ifeq            54
	//    5    9:aload_0         
	//    6   10:getfield        #40  <Field SharedPreferences a>
	//    7   13:ldc1            #57  <String "version_code">
	//    8   15:invokeinterface #63  <Method boolean SharedPreferences.contains(String)>
	//    9   20:ifeq            54
		i = c.getVersionCode();
	//   10   23:aload_0         
	//   11   24:getfield        #30  <Field AppboyConfigurationProvider c>
	//   12   27:invokevirtual   #67  <Method int AppboyConfigurationProvider.getVersionCode()>
	//   13   30:istore_1        
		j = a.getInt("version_code", 0x80000000);
	//   14   31:aload_0         
	//   15   32:getfield        #40  <Field SharedPreferences a>
	//   16   35:ldc1            #57  <String "version_code">
	//   17   37:ldc1            #68  <Int 0x80000000>
	//   18   39:invokeinterface #72  <Method int SharedPreferences.getInt(String, int)>
	//   19   44:istore_2        
		if(i == j)
			break MISSING_BLOCK_LABEL_54;
	//   20   45:iload_1         
	//   21   46:iload_2         
	//   22   47:icmpeq          54
		this;
	//   23   50:aload_0         
		JVM INSTR monitorexit ;
	//   24   51:monitorexit     
		return null;
	//   25   52:aconst_null     
	//   26   53:areturn         
		if(!a.contains("device_identifier"))
			break MISSING_BLOCK_LABEL_105;
	//   27   54:aload_0         
	//   28   55:getfield        #40  <Field SharedPreferences a>
	//   29   58:ldc1            #74  <String "device_identifier">
	//   30   60:invokeinterface #63  <Method boolean SharedPreferences.contains(String)>
	//   31   65:ifeq            105
		String s = a.getString("device_identifier", "");
	//   32   68:aload_0         
	//   33   69:getfield        #40  <Field SharedPreferences a>
	//   34   72:ldc1            #74  <String "device_identifier">
	//   35   74:ldc1            #76  <String "">
	//   36   76:invokeinterface #80  <Method String SharedPreferences.getString(String, String)>
	//   37   81:astore_3        
		if(ba.b().equals(((Object) (s))))
			break MISSING_BLOCK_LABEL_105;
	//   38   82:invokestatic    #84  <Method String ba.b()>
	//   39   85:aload_3         
	//   40   86:invokevirtual   #90  <Method boolean String.equals(Object)>
	//   41   89:ifne            105
		AppboyLogger.i(b, "Device identifier differs from saved device identifier. Returning null token.");
	//   42   92:getstatic       #23  <Field String b>
	//   43   95:ldc1            #92  <String "Device identifier differs from saved device identifier. Returning null token.">
	//   44   97:invokestatic    #96  <Method int AppboyLogger.i(String, String)>
	//   45  100:pop             
		this;
	//   46  101:aload_0         
		JVM INSTR monitorexit ;
	//   47  102:monitorexit     
		return null;
	//   48  103:aconst_null     
	//   49  104:areturn         
		String s1 = a.getString("registration_id", ((String) (null)));
	//   50  105:aload_0         
	//   51  106:getfield        #40  <Field SharedPreferences a>
	//   52  109:ldc1            #98  <String "registration_id">
	//   53  111:aconst_null     
	//   54  112:invokeinterface #80  <Method String SharedPreferences.getString(String, String)>
	//   55  117:astore_3        
		this;
	//   56  118:aload_0         
		JVM INSTR monitorexit ;
	//   57  119:monitorexit     
		return s1;
	//   58  120:aload_3         
	//   59  121:areturn         
		Exception exception;
		exception;
	//   60  122:astore_3        
	//*  61  123:aload_0         
		throw exception;
	//   62  124:monitorexit     
	//   63  125:aload_3         
	//   64  126:athrow          
	}

	public void a(String s)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		if(s == null)
			break MISSING_BLOCK_LABEL_67;
	//    2    2:aload_1         
	//    3    3:ifnull          67
		android.content.SharedPreferences.Editor editor = a.edit();
	//    4    6:aload_0         
	//    5    7:getfield        #40  <Field SharedPreferences a>
	//    6   10:invokeinterface #103 <Method android.content.SharedPreferences$Editor SharedPreferences.edit()>
	//    7   15:astore_2        
		editor.putString("registration_id", s);
	//    8   16:aload_2         
	//    9   17:ldc1            #98  <String "registration_id">
	//   10   19:aload_1         
	//   11   20:invokeinterface #109 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putString(String, String)>
	//   12   25:pop             
		editor.putInt("version_code", c.getVersionCode());
	//   13   26:aload_2         
	//   14   27:ldc1            #57  <String "version_code">
	//   15   29:aload_0         
	//   16   30:getfield        #30  <Field AppboyConfigurationProvider c>
	//   17   33:invokevirtual   #67  <Method int AppboyConfigurationProvider.getVersionCode()>
	//   18   36:invokeinterface #113 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putInt(String, int)>
	//   19   41:pop             
		editor.putString("device_identifier", ba.b());
	//   20   42:aload_2         
	//   21   43:ldc1            #74  <String "device_identifier">
	//   22   45:invokestatic    #84  <Method String ba.b()>
	//   23   48:invokeinterface #109 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putString(String, String)>
	//   24   53:pop             
		editor.apply();
	//   25   54:aload_2         
	//   26   55:invokeinterface #116 <Method void android.content.SharedPreferences$Editor.apply()>
		this;
	//   27   60:aload_0         
		JVM INSTR monitorexit ;
	//   28   61:monitorexit     
		return;
	//   29   62:return          
		s;
	//   30   63:astore_1        
		break MISSING_BLOCK_LABEL_76;
	//   31   64:goto            75
		throw new NullPointerException();
	//   32   67:new             #118 <Class NullPointerException>
	//   33   70:dup             
	//   34   71:invokespecial   #119 <Method void NullPointerException()>
	//   35   74:athrow          
	//*  36   75:aload_0         
		throw s;
	//   37   76:monitorexit     
	//   38   77:aload_1         
	//   39   78:athrow          
	}

	private static final String b = AppboyLogger.getAppboyLogTag(bo/app/bq);
	final SharedPreferences a;
	private final AppboyConfigurationProvider c;

	static 
	{
	//    0    0:ldc1            #2   <Class bq>
	//    1    2:invokestatic    #21  <Method String AppboyLogger.getAppboyLogTag(Class)>
	//    2    5:putstatic       #23  <Field String b>
	//*   3    8:return          
	}
}

// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.sec.android.service.health.cp;

import android.content.*;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.net.Uri;
import android.os.*;
import com.sec.android.securestorage.SecureStorage;
import com.sec.android.service.health.cp.accesscontrol.AccesscontrolUtil;
import com.sec.android.service.health.util.LOG;
import com.sec.android.service.sdk.health.cp.ThinCPConstants;
import java.io.File;
import java.io.FileNotFoundException;

// Referenced classes of package com.sec.android.service.health.cp:
//			TrustZoneSecurityProvider

public class MigrationCpProvider extends ContentProvider
{

	public MigrationCpProvider()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #22  <Method void ContentProvider()>
	//    2    4:return          
	}

	private boolean checkIfPlatformDbExists()
	{
		LOG.d(TAG, "[+] checkIfPlatformDbExists");
	//    0    0:getstatic       #18  <Field Class TAG>
	//    1    3:ldc1            #26  <String "[+] checkIfPlatformDbExists">
	//    2    5:invokestatic    #32  <Method void LOG.d(Class, String)>
		boolean flag = getContext().getDatabasePath("platform.db").exists();
	//    3    8:aload_0         
	//    4    9:invokevirtual   #36  <Method Context getContext()>
	//    5   12:ldc1            #8   <String "platform.db">
	//    6   14:invokevirtual   #42  <Method File Context.getDatabasePath(String)>
	//    7   17:invokevirtual   #47  <Method boolean File.exists()>
	//    8   20:istore_1        
		LOG.d(TAG, (new StringBuilder()).append("[-] checkIfPlatformDbExists : isExists").append(flag).toString());
	//    9   21:getstatic       #18  <Field Class TAG>
	//   10   24:new             #49  <Class StringBuilder>
	//   11   27:dup             
	//   12   28:invokespecial   #50  <Method void StringBuilder()>
	//   13   31:ldc1            #52  <String "[-] checkIfPlatformDbExists : isExists">
	//   14   33:invokevirtual   #56  <Method StringBuilder StringBuilder.append(String)>
	//   15   36:iload_1         
	//   16   37:invokevirtual   #59  <Method StringBuilder StringBuilder.append(boolean)>
	//   17   40:invokevirtual   #63  <Method String StringBuilder.toString()>
	//   18   43:invokestatic    #32  <Method void LOG.d(Class, String)>
		return flag;
	//   19   46:iload_1         
	//   20   47:ireturn         
	}

	private String getCallerPackage()
	{
		int i = Binder.getCallingUid();
	//    0    0:invokestatic    #70  <Method int Binder.getCallingUid()>
	//    1    3:istore_1        
		if(i == 0)
	//*   2    4:iload_1         
	//*   3    5:ifne            10
			return null;
	//    4    8:aconst_null     
	//    5    9:areturn         
		else
			return getContext().getPackageManager().getPackagesForUid(i)[0];
	//    6   10:aload_0         
	//    7   11:invokevirtual   #36  <Method Context getContext()>
	//    8   14:invokevirtual   #74  <Method PackageManager Context.getPackageManager()>
	//    9   17:iload_1         
	//   10   18:invokevirtual   #80  <Method String[] PackageManager.getPackagesForUid(int)>
	//   11   21:iconst_0        
	//   12   22:aaload          
	//   13   23:areturn         
	}

	private byte[] getOldHealthServiceDBPassword()
	{
		byte abyte0[];
		try
		{
			abyte0 = TrustZoneSecurityProvider.getKeyFromTrustZone(getContext());
	//    0    0:aload_0         
	//    1    1:invokevirtual   #36  <Method Context getContext()>
	//    2    4:invokestatic    #90  <Method byte[] TrustZoneSecurityProvider.getKeyFromTrustZone(Context)>
	//    3    7:astore_1        
		}
	//*   4    8:aload_1         
	//*   5    9:areturn         
		catch(Exception exception)
	//*   6   10:astore_1        
		{
			exception.printStackTrace();
	//    7   11:aload_1         
	//    8   12:invokevirtual   #93  <Method void Exception.printStackTrace()>
			LOG.e(TAG, "Error Meesage while retrieving the old TrustZone passward from HealthService..\n Trying with AES now...");
	//    9   15:getstatic       #18  <Field Class TAG>
	//   10   18:ldc1            #95  <String "Error Meesage while retrieving the old TrustZone passward from HealthService..\n Trying with AES now...">
	//   11   20:invokestatic    #98  <Method void LOG.e(Class, String)>
			return TrustZoneSecurityProvider.getKeyFromAES();
	//   12   23:invokestatic    #101 <Method byte[] TrustZoneSecurityProvider.getKeyFromAES()>
	//   13   26:areturn         
		}
		return abyte0;
	}

	private boolean matchSharedPrefUri(Uri uri)
	{
		if(ThinCPConstants.MIGRATION_SHARED_PREFS_URI.equals(((Object) (uri))))
	//*   0    0:getstatic       #109 <Field Uri ThinCPConstants.MIGRATION_SHARED_PREFS_URI>
	//*   1    3:aload_1         
	//*   2    4:invokevirtual   #115 <Method boolean Uri.equals(Object)>
	//*   3    7:ifeq            12
		{
			return true;
	//    4   10:iconst_1        
	//    5   11:ireturn         
		} else
		{
			LOG.e(TAG, (new StringBuilder()).append("Returning false from the matchSharedPrefUri method").append(((Object) (uri))).toString());
	//    6   12:getstatic       #18  <Field Class TAG>
	//    7   15:new             #49  <Class StringBuilder>
	//    8   18:dup             
	//    9   19:invokespecial   #50  <Method void StringBuilder()>
	//   10   22:ldc1            #117 <String "Returning false from the matchSharedPrefUri method">
	//   11   24:invokevirtual   #56  <Method StringBuilder StringBuilder.append(String)>
	//   12   27:aload_1         
	//   13   28:invokevirtual   #120 <Method StringBuilder StringBuilder.append(Object)>
	//   14   31:invokevirtual   #63  <Method String StringBuilder.toString()>
	//   15   34:invokestatic    #98  <Method void LOG.e(Class, String)>
			return false;
	//   16   37:iconst_0        
	//   17   38:ireturn         
		}
	}

	private boolean matchUri(Uri uri)
	{
		if(ThinCPConstants.MIGRATION_AUTHORITY_URI.equals(((Object) (uri))))
	//*   0    0:getstatic       #124 <Field Uri ThinCPConstants.MIGRATION_AUTHORITY_URI>
	//*   1    3:aload_1         
	//*   2    4:invokevirtual   #115 <Method boolean Uri.equals(Object)>
	//*   3    7:ifeq            12
		{
			return true;
	//    4   10:iconst_1        
	//    5   11:ireturn         
		} else
		{
			LOG.e(TAG, (new StringBuilder()).append("Returning false from the MatchUri method").append(((Object) (uri))).toString());
	//    6   12:getstatic       #18  <Field Class TAG>
	//    7   15:new             #49  <Class StringBuilder>
	//    8   18:dup             
	//    9   19:invokespecial   #50  <Method void StringBuilder()>
	//   10   22:ldc1            #126 <String "Returning false from the MatchUri method">
	//   11   24:invokevirtual   #56  <Method StringBuilder StringBuilder.append(String)>
	//   12   27:aload_1         
	//   13   28:invokevirtual   #120 <Method StringBuilder StringBuilder.append(Object)>
	//   14   31:invokevirtual   #63  <Method String StringBuilder.toString()>
	//   15   34:invokestatic    #98  <Method void LOG.e(Class, String)>
			return false;
	//   16   37:iconst_0        
	//   17   38:ireturn         
		}
	}

	private boolean matchUserProfilePrefUri(Uri uri)
	{
		if(ThinCPConstants.MIGRATION_USER_PROFILE_PREFS_URI.equals(((Object) (uri))))
	//*   0    0:getstatic       #130 <Field Uri ThinCPConstants.MIGRATION_USER_PROFILE_PREFS_URI>
	//*   1    3:aload_1         
	//*   2    4:invokevirtual   #115 <Method boolean Uri.equals(Object)>
	//*   3    7:ifeq            12
		{
			return true;
	//    4   10:iconst_1        
	//    5   11:ireturn         
		} else
		{
			LOG.e(TAG, (new StringBuilder()).append("Returning false from the matchSharedPrefUri method").append(((Object) (uri))).toString());
	//    6   12:getstatic       #18  <Field Class TAG>
	//    7   15:new             #49  <Class StringBuilder>
	//    8   18:dup             
	//    9   19:invokespecial   #50  <Method void StringBuilder()>
	//   10   22:ldc1            #117 <String "Returning false from the matchSharedPrefUri method">
	//   11   24:invokevirtual   #56  <Method StringBuilder StringBuilder.append(String)>
	//   12   27:aload_1         
	//   13   28:invokevirtual   #120 <Method StringBuilder StringBuilder.append(Object)>
	//   14   31:invokevirtual   #63  <Method String StringBuilder.toString()>
	//   15   34:invokestatic    #98  <Method void LOG.e(Class, String)>
			return false;
	//   16   37:iconst_0        
	//   17   38:ireturn         
		}
	}

	private boolean renamePlatformDb()
	{
		LOG.d(TAG, "[+] renamePlatformDb");
	//    0    0:getstatic       #18  <Field Class TAG>
	//    1    3:ldc1            #133 <String "[+] renamePlatformDb">
	//    2    5:invokestatic    #32  <Method void LOG.d(Class, String)>
		boolean flag = false;
	//    3    8:iconst_0        
	//    4    9:istore_1        
		File file = getContext().getDatabasePath("platform.db");
	//    5   10:aload_0         
	//    6   11:invokevirtual   #36  <Method Context getContext()>
	//    7   14:ldc1            #8   <String "platform.db">
	//    8   16:invokevirtual   #42  <Method File Context.getDatabasePath(String)>
	//    9   19:astore_2        
		File file1 = getContext().getDatabasePath("platform_db.old");
	//   10   20:aload_0         
	//   11   21:invokevirtual   #36  <Method Context getContext()>
	//   12   24:ldc1            #11  <String "platform_db.old">
	//   13   26:invokevirtual   #42  <Method File Context.getDatabasePath(String)>
	//   14   29:astore_3        
		if(file.exists())
	//*  15   30:aload_2         
	//*  16   31:invokevirtual   #47  <Method boolean File.exists()>
	//*  17   34:ifeq            43
			flag = file.renameTo(file1);
	//   18   37:aload_2         
	//   19   38:aload_3         
	//   20   39:invokevirtual   #137 <Method boolean File.renameTo(File)>
	//   21   42:istore_1        
		LOG.d(TAG, "[-] renamePlatformDb");
	//   22   43:getstatic       #18  <Field Class TAG>
	//   23   46:ldc1            #139 <String "[-] renamePlatformDb">
	//   24   48:invokestatic    #32  <Method void LOG.d(Class, String)>
		return flag;
	//   25   51:iload_1         
	//   26   52:ireturn         
	}

	public Bundle call(String s, String s1, Bundle bundle)
	{
		LOG.d(TAG, (new StringBuilder()).append("MigrationCp Call : ").append(s).toString());
	//    0    0:getstatic       #18  <Field Class TAG>
	//    1    3:new             #49  <Class StringBuilder>
	//    2    6:dup             
	//    3    7:invokespecial   #50  <Method void StringBuilder()>
	//    4   10:ldc1            #143 <String "MigrationCp Call : ">
	//    5   12:invokevirtual   #56  <Method StringBuilder StringBuilder.append(String)>
	//    6   15:aload_1         
	//    7   16:invokevirtual   #56  <Method StringBuilder StringBuilder.append(String)>
	//    8   19:invokevirtual   #63  <Method String StringBuilder.toString()>
	//    9   22:invokestatic    #32  <Method void LOG.d(Class, String)>
		s1 = ((String) (new Bundle()));
	//   10   25:new             #145 <Class Bundle>
	//   11   28:dup             
	//   12   29:invokespecial   #146 <Method void Bundle()>
	//   13   32:astore_2        
		if(!AccesscontrolUtil.checkSignature(getContext(), getCallerPackage())) goto _L2; else goto _L1
	//   14   33:aload_0         
	//   15   34:invokevirtual   #36  <Method Context getContext()>
	//   16   37:aload_0         
	//   17   38:invokespecial   #148 <Method String getCallerPackage()>
	//   18   41:invokestatic    #154 <Method boolean AccesscontrolUtil.checkSignature(Context, String)>
	//   19   44:ifeq            151
_L1:
		if(!s.equals("get_secure_password")) goto _L4; else goto _L3
	//   20   47:aload_1         
	//   21   48:ldc1            #156 <String "get_secure_password">
	//   22   50:invokevirtual   #159 <Method boolean String.equals(Object)>
	//   23   53:ifeq            93
_L3:
		((Bundle) (s1)).putByteArray("value_of_password", getOldHealthServiceDBPassword());
	//   24   56:aload_2         
	//   25   57:ldc1            #161 <String "value_of_password">
	//   26   59:aload_0         
	//   27   60:invokespecial   #163 <Method byte[] getOldHealthServiceDBPassword()>
	//   28   63:invokevirtual   #167 <Method void Bundle.putByteArray(String, byte[])>
_L5:
		LOG.d(TAG, (new StringBuilder()).append("[-] MigrationCp Call : ").append(s).toString());
	//   29   66:getstatic       #18  <Field Class TAG>
	//   30   69:new             #49  <Class StringBuilder>
	//   31   72:dup             
	//   32   73:invokespecial   #50  <Method void StringBuilder()>
	//   33   76:ldc1            #169 <String "[-] MigrationCp Call : ">
	//   34   78:invokevirtual   #56  <Method StringBuilder StringBuilder.append(String)>
	//   35   81:aload_1         
	//   36   82:invokevirtual   #56  <Method StringBuilder StringBuilder.append(String)>
	//   37   85:invokevirtual   #63  <Method String StringBuilder.toString()>
	//   38   88:invokestatic    #32  <Method void LOG.d(Class, String)>
		return ((Bundle) (s1));
	//   39   91:aload_2         
	//   40   92:areturn         
_L4:
		if(s.equals("check_platform_db_exists"))
	//*  41   93:aload_1         
	//*  42   94:ldc1            #171 <String "check_platform_db_exists">
	//*  43   96:invokevirtual   #159 <Method boolean String.equals(Object)>
	//*  44   99:ifeq            115
			((Bundle) (s1)).putBoolean("value_of_check_if_platform_db_exists", checkIfPlatformDbExists());
	//   45  102:aload_2         
	//   46  103:ldc1            #173 <String "value_of_check_if_platform_db_exists">
	//   47  105:aload_0         
	//   48  106:invokespecial   #175 <Method boolean checkIfPlatformDbExists()>
	//   49  109:invokevirtual   #179 <Method void Bundle.putBoolean(String, boolean)>
		else
	//*  50  112:goto            66
		if(s.equals("rename_platform_db_if_exists"))
	//*  51  115:aload_1         
	//*  52  116:ldc1            #181 <String "rename_platform_db_if_exists">
	//*  53  118:invokevirtual   #159 <Method boolean String.equals(Object)>
	//*  54  121:ifeq            66
		{
			boolean flag = false;
	//   55  124:iconst_0        
	//   56  125:istore          4
			if(checkIfPlatformDbExists())
	//*  57  127:aload_0         
	//*  58  128:invokespecial   #175 <Method boolean checkIfPlatformDbExists()>
	//*  59  131:ifeq            140
				flag = renamePlatformDb();
	//   60  134:aload_0         
	//   61  135:invokespecial   #183 <Method boolean renamePlatformDb()>
	//   62  138:istore          4
			((Bundle) (s1)).putBoolean("value_of_rename_platform_db_if_exists", flag);
	//   63  140:aload_2         
	//   64  141:ldc1            #185 <String "value_of_rename_platform_db_if_exists">
	//   65  143:iload           4
	//   66  145:invokevirtual   #179 <Method void Bundle.putBoolean(String, boolean)>
		}
		if(true) goto _L5; else goto _L2
	//   67  148:goto            66
_L2:
		LOG.e(TAG, (new StringBuilder()).append("OpenFile API not Availiable for the caller's signature, caller package : ").append(getCallerPackage()).toString());
	//   68  151:getstatic       #18  <Field Class TAG>
	//   69  154:new             #49  <Class StringBuilder>
	//   70  157:dup             
	//   71  158:invokespecial   #50  <Method void StringBuilder()>
	//   72  161:ldc1            #187 <String "OpenFile API not Availiable for the caller's signature, caller package : ">
	//   73  163:invokevirtual   #56  <Method StringBuilder StringBuilder.append(String)>
	//   74  166:aload_0         
	//   75  167:invokespecial   #148 <Method String getCallerPackage()>
	//   76  170:invokevirtual   #56  <Method StringBuilder StringBuilder.append(String)>
	//   77  173:invokevirtual   #63  <Method String StringBuilder.toString()>
	//   78  176:invokestatic    #98  <Method void LOG.e(Class, String)>
		throw new SecurityException("OpenFile  API is not Availiable for your app");
	//   79  179:new             #189 <Class SecurityException>
	//   80  182:dup             
	//   81  183:ldc1            #191 <String "OpenFile  API is not Availiable for your app">
	//   82  185:invokespecial   #194 <Method void SecurityException(String)>
	//   83  188:athrow          
	}

	public int delete(Uri uri, String s, String as[])
	{
		LOG.d(TAG, "In Delete");
	//    0    0:getstatic       #18  <Field Class TAG>
	//    1    3:ldc1            #198 <String "In Delete">
	//    2    5:invokestatic    #32  <Method void LOG.d(Class, String)>
		return 0;
	//    3    8:iconst_0        
	//    4    9:ireturn         
	}

	public String getType(Uri uri)
	{
		LOG.d(TAG, "In getType");
	//    0    0:getstatic       #18  <Field Class TAG>
	//    1    3:ldc1            #202 <String "In getType">
	//    2    5:invokestatic    #32  <Method void LOG.d(Class, String)>
		return null;
	//    3    8:aconst_null     
	//    4    9:areturn         
	}

	public Uri insert(Uri uri, ContentValues contentvalues)
	{
		LOG.d(TAG, "In Insert module");
	//    0    0:getstatic       #18  <Field Class TAG>
	//    1    3:ldc1            #206 <String "In Insert module">
	//    2    5:invokestatic    #32  <Method void LOG.d(Class, String)>
		return null;
	//    3    8:aconst_null     
	//    4    9:areturn         
	}

	public boolean onCreate()
	{
		LOG.d(TAG, "In Create module");
	//    0    0:getstatic       #18  <Field Class TAG>
	//    1    3:ldc1            #209 <String "In Create module">
	//    2    5:invokestatic    #32  <Method void LOG.d(Class, String)>
		return false;
	//    3    8:iconst_0        
	//    4    9:ireturn         
	}

	public ParcelFileDescriptor openFile(Uri uri, String s)
		throws FileNotFoundException
	{
		int i;
		if(AccesscontrolUtil.checkSignature(getContext(), getCallerPackage()) && matchUri(uri))
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #36  <Method Context getContext()>
	//*   2    4:aload_0         
	//*   3    5:invokespecial   #148 <Method String getCallerPackage()>
	//*   4    8:invokestatic    #154 <Method boolean AccesscontrolUtil.checkSignature(Context, String)>
	//*   5   11:ifeq            341
	//*   6   14:aload_0         
	//*   7   15:aload_1         
	//*   8   16:invokespecial   #219 <Method boolean matchUri(Uri)>
	//*   9   19:ifeq            341
		{
			i = 0;
	//   10   22:iconst_0        
	//   11   23:istore_3        
		} else
	//*  12   24:iload_3         
	//*  13   25:iconst_3        
	//*  14   26:icmpge          93
	//*  15   29:new             #221 <Class SecureStorage>
	//*  16   32:dup             
	//*  17   33:invokespecial   #222 <Method void SecureStorage()>
	//*  18   36:astore_1        
	//*  19   37:getstatic       #18  <Field Class TAG>
	//*  20   40:new             #49  <Class StringBuilder>
	//*  21   43:dup             
	//*  22   44:invokespecial   #50  <Method void StringBuilder()>
	//*  23   47:ldc1            #224 <String "Try to get K old SS key, count : ">
	//*  24   49:invokevirtual   #56  <Method StringBuilder StringBuilder.append(String)>
	//*  25   52:iload_3         
	//*  26   53:invokevirtual   #227 <Method StringBuilder StringBuilder.append(int)>
	//*  27   56:invokevirtual   #63  <Method String StringBuilder.toString()>
	//*  28   59:invokestatic    #32  <Method void LOG.d(Class, String)>
	//*  29   62:aload_1         
	//*  30   63:ldc1            #229 <String "com.sec.android.service.health">
	//*  31   65:invokevirtual   #233 <Method byte[] SecureStorage.getByteArray(String)>
	//*  32   68:astore_2        
	//*  33   69:getstatic       #18  <Field Class TAG>
	//*  34   72:ldc1            #235 <String "Success to get old SS key">
	//*  35   74:invokestatic    #32  <Method void LOG.d(Class, String)>
	//*  36   77:aload_1         
	//*  37   78:ldc1            #237 <String "com.sec.android.app.shealth">
	//*  38   80:aload_2         
	//*  39   81:invokevirtual   #241 <Method boolean SecureStorage.put(String, byte[])>
	//*  40   84:pop             
	//*  41   85:getstatic       #18  <Field Class TAG>
	//*  42   88:ldc1            #243 <String "Success to put old SS key to new storage">
	//*  43   90:invokestatic    #32  <Method void LOG.d(Class, String)>
	//*  44   93:new             #44  <Class File>
	//*  45   96:dup             
	//*  46   97:new             #49  <Class StringBuilder>
	//*  47  100:dup             
	//*  48  101:invokespecial   #50  <Method void StringBuilder()>
	//*  49  104:aload_0         
	//*  50  105:invokevirtual   #36  <Method Context getContext()>
	//*  51  108:invokevirtual   #247 <Method ApplicationInfo Context.getApplicationInfo()>
	//*  52  111:getfield        #252 <Field String ApplicationInfo.dataDir>
	//*  53  114:invokevirtual   #56  <Method StringBuilder StringBuilder.append(String)>
	//*  54  117:getstatic       #255 <Field String File.separator>
	//*  55  120:invokevirtual   #56  <Method StringBuilder StringBuilder.append(String)>
	//*  56  123:ldc2            #257 <String "databases">
	//*  57  126:invokevirtual   #56  <Method StringBuilder StringBuilder.append(String)>
	//*  58  129:getstatic       #255 <Field String File.separator>
	//*  59  132:invokevirtual   #56  <Method StringBuilder StringBuilder.append(String)>
	//*  60  135:ldc1            #8   <String "platform.db">
	//*  61  137:invokevirtual   #56  <Method StringBuilder StringBuilder.append(String)>
	//*  62  140:invokevirtual   #63  <Method String StringBuilder.toString()>
	//*  63  143:invokespecial   #258 <Method void File(String)>
	//*  64  146:astore_1        
	//*  65  147:aload_1         
	//*  66  148:invokevirtual   #47  <Method boolean File.exists()>
	//*  67  151:ifne            333
	//*  68  154:new             #213 <Class FileNotFoundException>
	//*  69  157:dup             
	//*  70  158:invokespecial   #259 <Method void FileNotFoundException()>
	//*  71  161:athrow          
	//*  72  162:astore_1        
	//*  73  163:aload_0         
	//*  74  164:invokevirtual   #36  <Method Context getContext()>
	//*  75  167:astore_2        
	//*  76  168:aload_2         
	//*  77  169:monitorenter    
	//*  78  170:aload_0         
	//*  79  171:invokevirtual   #36  <Method Context getContext()>
	//*  80  174:ldc2w           #260 <Long 200L>
	//*  81  177:invokevirtual   #267 <Method void Object.wait(long)>
	//*  82  180:aload_2         
	//*  83  181:monitorexit     
	//*  84  182:iload_3         
	//*  85  183:iconst_1        
	//*  86  184:iadd            
	//*  87  185:istore_3        
	//*  88  186:goto            24
	//*  89  189:astore_1        
	//*  90  190:getstatic       #18  <Field Class TAG>
	//*  91  193:astore          4
	//*  92  195:aload_1         
	//*  93  196:invokevirtual   #270 <Method String InterruptedException.getMessage()>
	//*  94  199:ifnull          221
	//*  95  202:aload_1         
	//*  96  203:invokevirtual   #270 <Method String InterruptedException.getMessage()>
	//*  97  206:astore_1        
	//*  98  207:aload           4
	//*  99  209:aload_1         
	//* 100  210:invokestatic    #32  <Method void LOG.d(Class, String)>
	//* 101  213:goto            180
	//* 102  216:astore_1        
	//* 103  217:aload_2         
	//* 104  218:monitorexit     
	//* 105  219:aload_1         
	//* 106  220:athrow          
	//* 107  221:ldc2            #272 <String " ">
	//* 108  224:astore_1        
	//* 109  225:goto            207
	//* 110  228:astore_2        
	//* 111  229:getstatic       #18  <Field Class TAG>
	//* 112  232:astore          4
	//* 113  234:new             #49  <Class StringBuilder>
	//* 114  237:dup             
	//* 115  238:invokespecial   #50  <Method void StringBuilder()>
	//* 116  241:ldc2            #274 <String "Failed to put old key : ">
	//* 117  244:invokevirtual   #56  <Method StringBuilder StringBuilder.append(String)>
	//* 118  247:astore          5
	//* 119  249:aload_2         
	//* 120  250:invokevirtual   #275 <Method String com.sec.android.securestorage.SecureStorage$SecureStorageException.getMessage()>
	//* 121  253:ifnonnull       317
	//* 122  256:ldc2            #277 <String "">
	//* 123  259:astore_1        
	//* 124  260:aload           4
	//* 125  262:aload           5
	//* 126  264:aload_1         
	//* 127  265:invokevirtual   #56  <Method StringBuilder StringBuilder.append(String)>
	//* 128  268:invokevirtual   #63  <Method String StringBuilder.toString()>
	//* 129  271:invokestatic    #32  <Method void LOG.d(Class, String)>
	//* 130  274:new             #49  <Class StringBuilder>
	//* 131  277:dup             
	//* 132  278:invokespecial   #50  <Method void StringBuilder()>
	//* 133  281:ldc2            #279 <String "SecureStorage Save error : ">
	//* 134  284:invokevirtual   #56  <Method StringBuilder StringBuilder.append(String)>
	//* 135  287:astore          4
	//* 136  289:aload_2         
	//* 137  290:invokevirtual   #275 <Method String com.sec.android.securestorage.SecureStorage$SecureStorageException.getMessage()>
	//* 138  293:ifnonnull       325
	//* 139  296:ldc2            #277 <String "">
	//* 140  299:astore_1        
	//* 141  300:new             #281 <Class IllegalStateException>
	//* 142  303:dup             
	//* 143  304:aload           4
	//* 144  306:aload_1         
	//* 145  307:invokevirtual   #56  <Method StringBuilder StringBuilder.append(String)>
	//* 146  310:invokevirtual   #63  <Method String StringBuilder.toString()>
	//* 147  313:invokespecial   #282 <Method void IllegalStateException(String)>
	//* 148  316:athrow          
	//* 149  317:aload_2         
	//* 150  318:invokevirtual   #275 <Method String com.sec.android.securestorage.SecureStorage$SecureStorageException.getMessage()>
	//* 151  321:astore_1        
	//* 152  322:goto            260
	//* 153  325:aload_2         
	//* 154  326:invokevirtual   #275 <Method String com.sec.android.securestorage.SecureStorage$SecureStorageException.getMessage()>
	//* 155  329:astore_1        
	//* 156  330:goto            300
	//* 157  333:aload_1         
	//* 158  334:ldc2            #283 <Int 0x10000000>
	//* 159  337:invokestatic    #289 <Method ParcelFileDescriptor ParcelFileDescriptor.open(File, int)>
	//* 160  340:areturn         
		{
			if(AccesscontrolUtil.checkSignature(getContext(), getCallerPackage()) && matchSharedPrefUri(uri))
	//* 161  341:aload_0         
	//* 162  342:invokevirtual   #36  <Method Context getContext()>
	//* 163  345:aload_0         
	//* 164  346:invokespecial   #148 <Method String getCallerPackage()>
	//* 165  349:invokestatic    #154 <Method boolean AccesscontrolUtil.checkSignature(Context, String)>
	//* 166  352:ifeq            441
	//* 167  355:aload_0         
	//* 168  356:aload_1         
	//* 169  357:invokespecial   #291 <Method boolean matchSharedPrefUri(Uri)>
	//* 170  360:ifeq            441
			{
				uri = ((Uri) (new File((new StringBuilder()).append(getContext().getApplicationInfo().dataDir).append(File.separator).append("shared_prefs").append(File.separator).append("com.sec.android.service.health_preferences.xml").toString())));
	//  171  363:new             #44  <Class File>
	//  172  366:dup             
	//  173  367:new             #49  <Class StringBuilder>
	//  174  370:dup             
	//  175  371:invokespecial   #50  <Method void StringBuilder()>
	//  176  374:aload_0         
	//  177  375:invokevirtual   #36  <Method Context getContext()>
	//  178  378:invokevirtual   #247 <Method ApplicationInfo Context.getApplicationInfo()>
	//  179  381:getfield        #252 <Field String ApplicationInfo.dataDir>
	//  180  384:invokevirtual   #56  <Method StringBuilder StringBuilder.append(String)>
	//  181  387:getstatic       #255 <Field String File.separator>
	//  182  390:invokevirtual   #56  <Method StringBuilder StringBuilder.append(String)>
	//  183  393:ldc2            #293 <String "shared_prefs">
	//  184  396:invokevirtual   #56  <Method StringBuilder StringBuilder.append(String)>
	//  185  399:getstatic       #255 <Field String File.separator>
	//  186  402:invokevirtual   #56  <Method StringBuilder StringBuilder.append(String)>
	//  187  405:ldc2            #295 <String "com.sec.android.service.health_preferences.xml">
	//  188  408:invokevirtual   #56  <Method StringBuilder StringBuilder.append(String)>
	//  189  411:invokevirtual   #63  <Method String StringBuilder.toString()>
	//  190  414:invokespecial   #258 <Method void File(String)>
	//  191  417:astore_1        
				if(!((File) (uri)).exists())
	//* 192  418:aload_1         
	//* 193  419:invokevirtual   #47  <Method boolean File.exists()>
	//* 194  422:ifne            433
					throw new FileNotFoundException();
	//  195  425:new             #213 <Class FileNotFoundException>
	//  196  428:dup             
	//  197  429:invokespecial   #259 <Method void FileNotFoundException()>
	//  198  432:athrow          
				else
					return ParcelFileDescriptor.open(((File) (uri)), 0x10000000);
	//  199  433:aload_1         
	//  200  434:ldc2            #283 <Int 0x10000000>
	//  201  437:invokestatic    #289 <Method ParcelFileDescriptor ParcelFileDescriptor.open(File, int)>
	//  202  440:areturn         
			}
			if(AccesscontrolUtil.checkSignature(getContext(), getCallerPackage()) && matchUserProfilePrefUri(uri))
	//* 203  441:aload_0         
	//* 204  442:invokevirtual   #36  <Method Context getContext()>
	//* 205  445:aload_0         
	//* 206  446:invokespecial   #148 <Method String getCallerPackage()>
	//* 207  449:invokestatic    #154 <Method boolean AccesscontrolUtil.checkSignature(Context, String)>
	//* 208  452:ifeq            541
	//* 209  455:aload_0         
	//* 210  456:aload_1         
	//* 211  457:invokespecial   #297 <Method boolean matchUserProfilePrefUri(Uri)>
	//* 212  460:ifeq            541
			{
				uri = ((Uri) (new File((new StringBuilder()).append(getContext().getApplicationInfo().dataDir).append(File.separator).append("shared_prefs").append(File.separator).append("user_profile_prefs.xml").toString())));
	//  213  463:new             #44  <Class File>
	//  214  466:dup             
	//  215  467:new             #49  <Class StringBuilder>
	//  216  470:dup             
	//  217  471:invokespecial   #50  <Method void StringBuilder()>
	//  218  474:aload_0         
	//  219  475:invokevirtual   #36  <Method Context getContext()>
	//  220  478:invokevirtual   #247 <Method ApplicationInfo Context.getApplicationInfo()>
	//  221  481:getfield        #252 <Field String ApplicationInfo.dataDir>
	//  222  484:invokevirtual   #56  <Method StringBuilder StringBuilder.append(String)>
	//  223  487:getstatic       #255 <Field String File.separator>
	//  224  490:invokevirtual   #56  <Method StringBuilder StringBuilder.append(String)>
	//  225  493:ldc2            #293 <String "shared_prefs">
	//  226  496:invokevirtual   #56  <Method StringBuilder StringBuilder.append(String)>
	//  227  499:getstatic       #255 <Field String File.separator>
	//  228  502:invokevirtual   #56  <Method StringBuilder StringBuilder.append(String)>
	//  229  505:ldc2            #299 <String "user_profile_prefs.xml">
	//  230  508:invokevirtual   #56  <Method StringBuilder StringBuilder.append(String)>
	//  231  511:invokevirtual   #63  <Method String StringBuilder.toString()>
	//  232  514:invokespecial   #258 <Method void File(String)>
	//  233  517:astore_1        
				if(!((File) (uri)).exists())
	//* 234  518:aload_1         
	//* 235  519:invokevirtual   #47  <Method boolean File.exists()>
	//* 236  522:ifne            533
					throw new FileNotFoundException();
	//  237  525:new             #213 <Class FileNotFoundException>
	//  238  528:dup             
	//  239  529:invokespecial   #259 <Method void FileNotFoundException()>
	//  240  532:athrow          
				else
					return ParcelFileDescriptor.open(((File) (uri)), 0x10000000);
	//  241  533:aload_1         
	//  242  534:ldc2            #283 <Int 0x10000000>
	//  243  537:invokestatic    #289 <Method ParcelFileDescriptor ParcelFileDescriptor.open(File, int)>
	//  244  540:areturn         
			}
			LOG.e(TAG, (new StringBuilder()).append("OpenFile API not Availiable for the caller's signature, caller package : ").append(getCallerPackage()).toString());
	//  245  541:getstatic       #18  <Field Class TAG>
	//  246  544:new             #49  <Class StringBuilder>
	//  247  547:dup             
	//  248  548:invokespecial   #50  <Method void StringBuilder()>
	//  249  551:ldc1            #187 <String "OpenFile API not Availiable for the caller's signature, caller package : ">
	//  250  553:invokevirtual   #56  <Method StringBuilder StringBuilder.append(String)>
	//  251  556:aload_0         
	//  252  557:invokespecial   #148 <Method String getCallerPackage()>
	//  253  560:invokevirtual   #56  <Method StringBuilder StringBuilder.append(String)>
	//  254  563:invokevirtual   #63  <Method String StringBuilder.toString()>
	//  255  566:invokestatic    #98  <Method void LOG.e(Class, String)>
			throw new SecurityException("OpenFile  API is not Availiable for your app");
	//  256  569:new             #189 <Class SecurityException>
	//  257  572:dup             
	//  258  573:ldc1            #191 <String "OpenFile  API is not Availiable for your app">
	//  259  575:invokespecial   #194 <Method void SecurityException(String)>
	//  260  578:athrow          
		}
		if(i >= 3)
			break MISSING_BLOCK_LABEL_93;
		uri = ((Uri) (new SecureStorage()));
		LOG.d(TAG, (new StringBuilder()).append("Try to get K old SS key, count : ").append(i).toString());
		s = ((String) (((SecureStorage) (uri)).getByteArray("com.sec.android.service.health")));
		LOG.d(TAG, "Success to get old SS key");
		Class class1;
		try
		{
			((SecureStorage) (uri)).put("com.sec.android.app.shealth", ((byte []) (s)));
			LOG.d(TAG, "Success to put old SS key to new storage");
		}
		// Misplaced declaration of an exception variable
		catch(String s)
		{
			Object obj = ((Object) (TAG));
			StringBuilder stringbuilder = (new StringBuilder()).append("Failed to put old key : ");
			if(((com.sec.android.securestorage.SecureStorage.SecureStorageException) (s)).getMessage() == null)
				uri = "";
			else
				uri = ((Uri) (((com.sec.android.securestorage.SecureStorage.SecureStorageException) (s)).getMessage()));
			LOG.d(((Class) (obj)), stringbuilder.append(((String) (uri))).toString());
			obj = ((Object) ((new StringBuilder()).append("SecureStorage Save error : ")));
			if(((com.sec.android.securestorage.SecureStorage.SecureStorageException) (s)).getMessage() == null)
				uri = "";
			else
				uri = ((Uri) (((com.sec.android.securestorage.SecureStorage.SecureStorageException) (s)).getMessage()));
			throw new IllegalStateException(((StringBuilder) (obj)).append(((String) (uri))).toString());
		}
		uri = ((Uri) (new File((new StringBuilder()).append(getContext().getApplicationInfo().dataDir).append(File.separator).append("databases").append(File.separator).append("platform.db").toString())));
		if(!((File) (uri)).exists())
			throw new FileNotFoundException();
		else
			return ParcelFileDescriptor.open(((File) (uri)), 0x10000000);
		uri;
		s = ((String) (getContext()));
		s;
		JVM INSTR monitorenter ;
		((Object) (getContext())).wait(200L);
_L2:
		i++;
		break MISSING_BLOCK_LABEL_24;
		uri;
		class1 = TAG;
		if(((InterruptedException) (uri)).getMessage() == null)
			break MISSING_BLOCK_LABEL_221;
		uri = ((Uri) (((InterruptedException) (uri)).getMessage()));
_L3:
		LOG.d(class1, ((String) (uri)));
		if(true) goto _L2; else goto _L1
_L1:
		uri;
		s;
		JVM INSTR monitorexit ;
		throw uri;
		uri = " ";
		  goto _L3
	}

	public Cursor query(Uri uri, String as[], String s, String as1[], String s1)
	{
		LOG.d(TAG, "In Query module");
	//    0    0:getstatic       #18  <Field Class TAG>
	//    1    3:ldc2            #304 <String "In Query module">
	//    2    6:invokestatic    #32  <Method void LOG.d(Class, String)>
		return null;
	//    3    9:aconst_null     
	//    4   10:areturn         
	}

	public int update(Uri uri, ContentValues contentvalues, String s, String as[])
	{
		LOG.d(TAG, "In Update API");
	//    0    0:getstatic       #18  <Field Class TAG>
	//    1    3:ldc2            #308 <String "In Update API">
	//    2    6:invokestatic    #32  <Method void LOG.d(Class, String)>
		return 0;
	//    3    9:iconst_0        
	//    4   10:ireturn         
	}

	private static final String PLATFORM_DB_FILE_NAME = "platform.db";
	private static final String PLATFORM_DB_FILE_NAME_COPY = "platform_db.old";
	private static final Class TAG = com/sec/android/service/health/cp/MigrationCpProvider;

	static 
	{
	//    0    0:ldc1            #2   <Class MigrationCpProvider>
	//    1    2:putstatic       #18  <Field Class TAG>
	//*   2    5:return          
	}
}

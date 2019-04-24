// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.ext.ui;

import android.app.IntentService;
import android.content.Intent;
import android.content.pm.*;
import android.os.Bundle;
import android.support.v7.*;

public class AutoBackupService extends IntentService
{

	public AutoBackupService()
	{
		super("AutoBackupService");
	//    0    0:aload_0         
	//    1    1:ldc1            #8   <String "AutoBackupService">
	//    2    3:invokespecial   #11  <Method void IntentService(String)>
	//    3    6:return          
	}

	private void a(String as[])
	{
		int i;
		int j;
		j = as.length;
	//    0    0:aload_1         
	//    1    1:arraylength     
	//    2    2:istore_3        
		i = 0;
	//    3    3:iconst_0        
	//    4    4:istore_2        
_L2:
		Object obj;
		if(i >= j)
			break; /* Loop/switch isn't completed */
	//    5    5:iload_2         
	//    6    6:iload_3         
	//    7    7:icmpge          164
		obj = ((Object) (as[i]));
	//    8   10:aload_1         
	//    9   11:iload_2         
	//   10   12:aaload          
	//   11   13:astore          6
		PackageManager packagemanager;
		packagemanager = getPackageManager();
	//   12   15:aload_0         
	//   13   16:invokevirtual   #20  <Method PackageManager getPackageManager()>
	//   14   19:astore          5
		obj = ((Object) (packagemanager.getPackageInfo(((String) (obj)), 0)));
	//   15   21:aload           5
	//   16   23:aload           6
	//   17   25:iconst_0        
	//   18   26:invokevirtual   #26  <Method PackageInfo PackageManager.getPackageInfo(String, int)>
	//   19   29:astore          6
		if(obj == null)
	//*  20   31:aload           6
	//*  21   33:ifnonnull       37
			return;
	//   22   36:return          
		ck ck1;
		ck1 = new ck();
	//   23   37:new             #28  <Class ck>
	//   24   40:dup             
	//   25   41:invokespecial   #30  <Method void ck()>
	//   26   44:astore          7
		ck1.a(((PackageInfo) (obj)).applicationInfo.loadLabel(packagemanager).toString());
	//   27   46:aload           7
	//   28   48:aload           6
	//   29   50:getfield        #36  <Field ApplicationInfo PackageInfo.applicationInfo>
	//   30   53:aload           5
	//   31   55:invokevirtual   #42  <Method CharSequence ApplicationInfo.loadLabel(PackageManager)>
	//   32   58:invokeinterface #48  <Method String CharSequence.toString()>
	//   33   63:invokevirtual   #50  <Method void ck.a(String)>
		ck1.b(((PackageInfo) (obj)).packageName);
	//   34   66:aload           7
	//   35   68:aload           6
	//   36   70:getfield        #54  <Field String PackageInfo.packageName>
	//   37   73:invokevirtual   #57  <Method void ck.b(String)>
		ck1.c(((PackageInfo) (obj)).versionName);
	//   38   76:aload           7
	//   39   78:aload           6
	//   40   80:getfield        #60  <Field String PackageInfo.versionName>
	//   41   83:invokevirtual   #63  <Method void ck.c(String)>
		ck1.a(((PackageInfo) (obj)).versionCode);
	//   42   86:aload           7
	//   43   88:aload           6
	//   44   90:getfield        #67  <Field int PackageInfo.versionCode>
	//   45   93:invokevirtual   #70  <Method void ck.a(int)>
		ck1.d(((PackageInfo) (obj)).applicationInfo.sourceDir);
	//   46   96:aload           7
	//   47   98:aload           6
	//   48  100:getfield        #36  <Field ApplicationInfo PackageInfo.applicationInfo>
	//   49  103:getfield        #73  <Field String ApplicationInfo.sourceDir>
	//   50  106:invokevirtual   #76  <Method void ck.d(String)>
		boolean flag;
		if((((PackageInfo) (obj)).applicationInfo.flags & 1) != 0)
	//*  51  109:aload           6
	//*  52  111:getfield        #36  <Field ApplicationInfo PackageInfo.applicationInfo>
	//*  53  114:getfield        #79  <Field int ApplicationInfo.flags>
	//*  54  117:iconst_1        
	//*  55  118:iand            
	//*  56  119:ifeq            148
			flag = true;
	//   57  122:iconst_1        
	//   58  123:istore          4
		else
	//*  59  125:aload           7
	//*  60  127:iload           4
	//*  61  129:invokevirtual   #82  <Method void ck.a(boolean)>
	//*  62  132:invokestatic    #87  <Method cn cn.a()>
	//*  63  135:aload           7
	//*  64  137:invokevirtual   #90  <Method String cn.a(Object)>
	//*  65  140:pop             
	//*  66  141:iload_2         
	//*  67  142:iconst_1        
	//*  68  143:iadd            
	//*  69  144:istore_2        
	//*  70  145:goto            5
			flag = false;
	//   71  148:iconst_0        
	//   72  149:istore          4
		try
		{
			ck1.a(flag);
			cn.a().a(((Object) (ck1)));
		}
	//*  73  151:goto            125
		catch(android.content.pm.PackageManager.NameNotFoundException namenotfoundexception)
	//*  74  154:astore          5
		{
			namenotfoundexception.printStackTrace();
	//   75  156:aload           5
	//   76  158:invokevirtual   #93  <Method void android.content.pm.PackageManager$NameNotFoundException.printStackTrace()>
		}
		i++;
		if(true) goto _L2; else goto _L1
	//   77  161:goto            141
_L1:
	//   78  164:return          
	}

	protected void onHandleIntent(Intent intent)
	{
		int i = intent.getExtras().getInt("android.intent.extra.UID");
	//    0    0:aload_1         
	//    1    1:invokevirtual   #101 <Method Bundle Intent.getExtras()>
	//    2    4:ldc1            #103 <String "android.intent.extra.UID">
	//    3    6:invokevirtual   #109 <Method int Bundle.getInt(String)>
	//    4    9:istore_2        
		intent = ((Intent) (getPackageManager().getPackagesForUid(i)));
	//    5   10:aload_0         
	//    6   11:invokevirtual   #20  <Method PackageManager getPackageManager()>
	//    7   14:iload_2         
	//    8   15:invokevirtual   #113 <Method String[] PackageManager.getPackagesForUid(int)>
	//    9   18:astore_1        
		if(intent == null)
	//*  10   19:aload_1         
	//*  11   20:ifnonnull       48
		{
			ci.a("123456", (new StringBuilder()).append(" No packages found for the UID : ").append(i).toString());
	//   12   23:ldc1            #115 <String "123456">
	//   13   25:new             #117 <Class StringBuilder>
	//   14   28:dup             
	//   15   29:invokespecial   #118 <Method void StringBuilder()>
	//   16   32:ldc1            #120 <String " No packages found for the UID : ">
	//   17   34:invokevirtual   #124 <Method StringBuilder StringBuilder.append(String)>
	//   18   37:iload_2         
	//   19   38:invokevirtual   #127 <Method StringBuilder StringBuilder.append(int)>
	//   20   41:invokevirtual   #128 <Method String StringBuilder.toString()>
	//   21   44:invokestatic    #133 <Method void ci.a(String, String)>
			return;
	//   22   47:return          
		}
		int k = intent.length;
	//   23   48:aload_1         
	//   24   49:arraylength     
	//   25   50:istore_3        
		for(int j = 0; j < k; j++)
	//*  26   51:iconst_0        
	//*  27   52:istore_2        
	//*  28   53:iload_2         
	//*  29   54:iload_3         
	//*  30   55:icmpge          95
		{
			String s = ((String) (intent[j]));
	//   31   58:aload_1         
	//   32   59:iload_2         
	//   33   60:aaload          
	//   34   61:astore          4
			ci.a("123456", (new StringBuilder()).append(" package name : ").append(s).toString());
	//   35   63:ldc1            #115 <String "123456">
	//   36   65:new             #117 <Class StringBuilder>
	//   37   68:dup             
	//   38   69:invokespecial   #118 <Method void StringBuilder()>
	//   39   72:ldc1            #135 <String " package name : ">
	//   40   74:invokevirtual   #124 <Method StringBuilder StringBuilder.append(String)>
	//   41   77:aload           4
	//   42   79:invokevirtual   #124 <Method StringBuilder StringBuilder.append(String)>
	//   43   82:invokevirtual   #128 <Method String StringBuilder.toString()>
	//   44   85:invokestatic    #133 <Method void ci.a(String, String)>
		}

	//   45   88:iload_2         
	//   46   89:iconst_1        
	//   47   90:iadd            
	//   48   91:istore_2        
	//*  49   92:goto            53
		a(((String []) (intent)));
	//   50   95:aload_0         
	//   51   96:aload_1         
	//   52   97:invokespecial   #137 <Method void a(String[])>
	//   53  100:return          
	}
}

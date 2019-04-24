// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.http.AndroidHttpClient;
import java.io.File;

// Referenced classes of package com.google.android.gms.internal:
//			zzz, zzt, zzl, zzv, 
//			zzw, zzy

public class zzac
{

	public static zzl zza(Context context)
	{
		return zza(context, ((zzy) (null)));
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:invokestatic    #9   <Method zzl zza(Context, zzy)>
	//    3    5:areturn         
	}

	public static zzl zza(Context context, zzy zzy)
	{
		Object obj;
		File file;
		file = new File(context.getCacheDir(), "volley");
	//    0    0:new             #14  <Class File>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokevirtual   #20  <Method File Context.getCacheDir()>
	//    4    8:ldc1            #22  <String "volley">
	//    5   10:invokespecial   #26  <Method void File(File, String)>
	//    6   13:astore          4
		obj = "volley/0";
	//    7   15:ldc1            #28  <String "volley/0">
	//    8   17:astore_3        
		String s = context.getPackageName();
	//    9   18:aload_0         
	//   10   19:invokevirtual   #32  <Method String Context.getPackageName()>
	//   11   22:astore          5
		int i = context.getPackageManager().getPackageInfo(s, 0).versionCode;
	//   12   24:aload_0         
	//   13   25:invokevirtual   #36  <Method PackageManager Context.getPackageManager()>
	//   14   28:aload           5
	//   15   30:iconst_0        
	//   16   31:invokevirtual   #42  <Method PackageInfo PackageManager.getPackageInfo(String, int)>
	//   17   34:getfield        #48  <Field int PackageInfo.versionCode>
	//   18   37:istore_2        
		context = ((Context) ((new StringBuilder(String.valueOf(((Object) (s))).length() + 12)).append(s).append("/").append(i).toString()));
	//   19   38:new             #50  <Class StringBuilder>
	//   20   41:dup             
	//   21   42:aload           5
	//   22   44:invokestatic    #56  <Method String String.valueOf(Object)>
	//   23   47:invokevirtual   #60  <Method int String.length()>
	//   24   50:bipush          12
	//   25   52:iadd            
	//   26   53:invokespecial   #63  <Method void StringBuilder(int)>
	//   27   56:aload           5
	//   28   58:invokevirtual   #67  <Method StringBuilder StringBuilder.append(String)>
	//   29   61:ldc1            #69  <String "/">
	//   30   63:invokevirtual   #67  <Method StringBuilder StringBuilder.append(String)>
	//   31   66:iload_2         
	//   32   67:invokevirtual   #72  <Method StringBuilder StringBuilder.append(int)>
	//   33   70:invokevirtual   #75  <Method String StringBuilder.toString()>
	//   34   73:astore_0        
		obj = ((Object) (context));
	//   35   74:aload_0         
	//   36   75:astore_3        
_L2:
		context = ((Context) (zzy));
	//   37   76:aload_1         
	//   38   77:astore_0        
		if(zzy == null)
	//*  39   78:aload_1         
	//*  40   79:ifnonnull       98
			if(android.os.Build.VERSION.SDK_INT >= 9)
	//*  41   82:getstatic       #80  <Field int android.os.Build$VERSION.SDK_INT>
	//*  42   85:bipush          9
	//*  43   87:icmplt          131
				context = ((Context) (new zzz()));
	//   44   90:new             #82  <Class zzz>
	//   45   93:dup             
	//   46   94:invokespecial   #85  <Method void zzz()>
	//   47   97:astore_0        
			else
	//*  48   98:new             #87  <Class zzt>
	//*  49  101:dup             
	//*  50  102:aload_0         
	//*  51  103:invokespecial   #90  <Method void zzt(zzy)>
	//*  52  106:astore_0        
	//*  53  107:new             #92  <Class zzl>
	//*  54  110:dup             
	//*  55  111:new             #94  <Class zzv>
	//*  56  114:dup             
	//*  57  115:aload           4
	//*  58  117:invokespecial   #97  <Method void zzv(File)>
	//*  59  120:aload_0         
	//*  60  121:invokespecial   #100 <Method void zzl(zzb, zzf)>
	//*  61  124:astore_0        
	//*  62  125:aload_0         
	//*  63  126:invokevirtual   #103 <Method void zzl.start()>
	//*  64  129:aload_0         
	//*  65  130:areturn         
				context = ((Context) (new zzw(((org.apache.http.client.HttpClient) (AndroidHttpClient.newInstance(((String) (obj))))))));
	//   66  131:new             #105 <Class zzw>
	//   67  134:dup             
	//   68  135:aload_3         
	//   69  136:invokestatic    #111 <Method AndroidHttpClient AndroidHttpClient.newInstance(String)>
	//   70  139:invokespecial   #114 <Method void zzw(org.apache.http.client.HttpClient)>
	//   71  142:astore_0        
		context = ((Context) (new zzt(((zzy) (context)))));
		context = ((Context) (new zzl(((zzb) (new zzv(file))), ((zzf) (context)))));
		((zzl) (context)).start();
		return ((zzl) (context));
	//*  72  143:goto            98
		context;
	//   73  146:astore_0        
		if(true) goto _L2; else goto _L1
_L1:
	//*  74  147:goto            76
	}
}

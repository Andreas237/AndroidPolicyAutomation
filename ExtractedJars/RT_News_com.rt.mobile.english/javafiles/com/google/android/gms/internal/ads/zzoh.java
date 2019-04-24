// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.*;
import android.net.Uri;
import android.os.Bundle;
import android.support.customtabs.*;
import java.util.List;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzbfy, zzbfw, zzoi, zzbfx

public final class zzoh
	implements zzbfy
{

	public zzoh()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #21  <Method void Object()>
	//    2    4:return          
	}

	public static boolean zzh(Context context)
	{
		Object obj = ((Object) (context.getPackageManager()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #30  <Method PackageManager Context.getPackageManager()>
	//    2    4:astore_3        
		if(obj == null)
	//*   3    5:aload_3         
	//*   4    6:ifnonnull       11
			return false;
	//    5    9:iconst_0        
	//    6   10:ireturn         
		Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.example.com"));
	//    7   11:new             #32  <Class Intent>
	//    8   14:dup             
	//    9   15:ldc1            #34  <String "android.intent.action.VIEW">
	//   10   17:ldc1            #36  <String "http://www.example.com">
	//   11   19:invokestatic    #42  <Method Uri Uri.parse(String)>
	//   12   22:invokespecial   #45  <Method void Intent(String, Uri)>
	//   13   25:astore          4
		ResolveInfo resolveinfo = ((PackageManager) (obj)).resolveActivity(intent, 0);
	//   14   27:aload_3         
	//   15   28:aload           4
	//   16   30:iconst_0        
	//   17   31:invokevirtual   #51  <Method ResolveInfo PackageManager.resolveActivity(Intent, int)>
	//   18   34:astore_2        
		obj = ((Object) (((PackageManager) (obj)).queryIntentActivities(intent, 0x10000)));
	//   19   35:aload_3         
	//   20   36:aload           4
	//   21   38:ldc1            #52  <Int 0x10000>
	//   22   40:invokevirtual   #56  <Method List PackageManager.queryIntentActivities(Intent, int)>
	//   23   43:astore_3        
		if(obj != null && resolveinfo != null)
	//*  24   44:aload_3         
	//*  25   45:ifnull          119
	//*  26   48:aload_2         
	//*  27   49:ifnull          119
		{
			for(int i = 0; i < ((List) (obj)).size(); i++)
	//*  28   52:iconst_0        
	//*  29   53:istore_1        
	//*  30   54:iload_1         
	//*  31   55:aload_3         
	//*  32   56:invokeinterface #62  <Method int List.size()>
	//*  33   61:icmpge          119
			{
				ResolveInfo resolveinfo1 = (ResolveInfo)((List) (obj)).get(i);
	//   34   64:aload_3         
	//   35   65:iload_1         
	//   36   66:invokeinterface #66  <Method Object List.get(int)>
	//   37   71:checkcast       #68  <Class ResolveInfo>
	//   38   74:astore          4
				if(resolveinfo.activityInfo.name.equals(((Object) (resolveinfo1.activityInfo.name))))
	//*  39   76:aload_2         
	//*  40   77:getfield        #72  <Field ActivityInfo ResolveInfo.activityInfo>
	//*  41   80:getfield        #78  <Field String ActivityInfo.name>
	//*  42   83:aload           4
	//*  43   85:getfield        #72  <Field ActivityInfo ResolveInfo.activityInfo>
	//*  44   88:getfield        #78  <Field String ActivityInfo.name>
	//*  45   91:invokevirtual   #84  <Method boolean String.equals(Object)>
	//*  46   94:ifeq            112
					return resolveinfo.activityInfo.packageName.equals(((Object) (zzbfw.zzbn(context))));
	//   47   97:aload_2         
	//   48   98:getfield        #72  <Field ActivityInfo ResolveInfo.activityInfo>
	//   49  101:getfield        #87  <Field String ActivityInfo.packageName>
	//   50  104:aload_0         
	//   51  105:invokestatic    #93  <Method String zzbfw.zzbn(Context)>
	//   52  108:invokevirtual   #84  <Method boolean String.equals(Object)>
	//   53  111:ireturn         
			}

	//   54  112:iload_1         
	//   55  113:iconst_1        
	//   56  114:iadd            
	//   57  115:istore_1        
		}
	//*  58  116:goto            54
		return false;
	//   59  119:iconst_0        
	//   60  120:ireturn         
	}

	public final boolean mayLaunchUrl(Uri uri, Bundle bundle, List list)
	{
		if(zzbgx == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #97  <Field CustomTabsClient zzbgx>
	//*   2    4:ifnonnull       9
			return false;
	//    3    7:iconst_0        
	//    4    8:ireturn         
		if(zzbgx == null)
	//*   5    9:aload_0         
	//*   6   10:getfield        #97  <Field CustomTabsClient zzbgx>
	//*   7   13:ifnonnull       24
			zzbgw = null;
	//    8   16:aload_0         
	//    9   17:aconst_null     
	//   10   18:putfield        #99  <Field CustomTabsSession zzbgw>
		else
	//*  11   21:goto            43
		if(zzbgw == null)
	//*  12   24:aload_0         
	//*  13   25:getfield        #99  <Field CustomTabsSession zzbgw>
	//*  14   28:ifnonnull       43
			zzbgw = zzbgx.newSession(((android.support.customtabs.CustomTabsCallback) (null)));
	//   15   31:aload_0         
	//   16   32:aload_0         
	//   17   33:getfield        #97  <Field CustomTabsClient zzbgx>
	//   18   36:aconst_null     
	//   19   37:invokevirtual   #105 <Method CustomTabsSession CustomTabsClient.newSession(android.support.customtabs.CustomTabsCallback)>
	//   20   40:putfield        #99  <Field CustomTabsSession zzbgw>
		bundle = ((Bundle) (zzbgw));
	//   21   43:aload_0         
	//   22   44:getfield        #99  <Field CustomTabsSession zzbgw>
	//   23   47:astore_2        
		if(bundle == null)
	//*  24   48:aload_2         
	//*  25   49:ifnonnull       54
			return false;
	//   26   52:iconst_0        
	//   27   53:ireturn         
		else
			return ((CustomTabsSession) (bundle)).mayLaunchUrl(uri, ((Bundle) (null)), ((List) (null)));
	//   28   54:aload_2         
	//   29   55:aload_1         
	//   30   56:aconst_null     
	//   31   57:aconst_null     
	//   32   58:invokevirtual   #109 <Method boolean CustomTabsSession.mayLaunchUrl(Uri, Bundle, List)>
	//   33   61:ireturn         
	}

	public final void zza(CustomTabsClient customtabsclient)
	{
		zzbgx = customtabsclient;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #97  <Field CustomTabsClient zzbgx>
		zzbgx.warmup(0L);
	//    3    5:aload_0         
	//    4    6:getfield        #97  <Field CustomTabsClient zzbgx>
	//    5    9:lconst_0        
	//    6   10:invokevirtual   #117 <Method boolean CustomTabsClient.warmup(long)>
	//    7   13:pop             
		if(zzbgz != null)
	//*   8   14:aload_0         
	//*   9   15:getfield        #119 <Field zzoi zzbgz>
	//*  10   18:ifnull          30
			zzbgz.zzjp();
	//   11   21:aload_0         
	//   12   22:getfield        #119 <Field zzoi zzbgz>
	//   13   25:invokeinterface #124 <Method void zzoi.zzjp()>
	//   14   30:return          
	}

	public final void zza(zzoi zzoi1)
	{
		zzbgz = zzoi1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #119 <Field zzoi zzbgz>
	//    3    5:return          
	}

	public final void zzc(Activity activity)
	{
		if(zzbgy == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #129 <Field CustomTabsServiceConnection zzbgy>
	//*   2    4:ifnonnull       8
		{
			return;
	//    3    7:return          
		} else
		{
			activity.unbindService(((android.content.ServiceConnection) (zzbgy)));
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:getfield        #129 <Field CustomTabsServiceConnection zzbgy>
	//    7   13:invokevirtual   #135 <Method void Activity.unbindService(android.content.ServiceConnection)>
			zzbgx = null;
	//    8   16:aload_0         
	//    9   17:aconst_null     
	//   10   18:putfield        #97  <Field CustomTabsClient zzbgx>
			zzbgw = null;
	//   11   21:aload_0         
	//   12   22:aconst_null     
	//   13   23:putfield        #99  <Field CustomTabsSession zzbgw>
			zzbgy = null;
	//   14   26:aload_0         
	//   15   27:aconst_null     
	//   16   28:putfield        #129 <Field CustomTabsServiceConnection zzbgy>
			return;
	//   17   31:return          
		}
	}

	public final void zzd(Activity activity)
	{
		if(zzbgx != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #97  <Field CustomTabsClient zzbgx>
	//*   2    4:ifnull          8
			return;
	//    3    7:return          
		String s = zzbfw.zzbn(((Context) (activity)));
	//    4    8:aload_1         
	//    5    9:invokestatic    #93  <Method String zzbfw.zzbn(Context)>
	//    6   12:astore_2        
		if(s == null)
	//*   7   13:aload_2         
	//*   8   14:ifnonnull       18
		{
			return;
	//    9   17:return          
		} else
		{
			zzbgy = ((CustomTabsServiceConnection) (new zzbfx(((zzbfy) (this)))));
	//   10   18:aload_0         
	//   11   19:new             #138 <Class zzbfx>
	//   12   22:dup             
	//   13   23:aload_0         
	//   14   24:invokespecial   #141 <Method void zzbfx(zzbfy)>
	//   15   27:putfield        #129 <Field CustomTabsServiceConnection zzbgy>
			CustomTabsClient.bindCustomTabsService(((Context) (activity)), s, zzbgy);
	//   16   30:aload_1         
	//   17   31:aload_2         
	//   18   32:aload_0         
	//   19   33:getfield        #129 <Field CustomTabsServiceConnection zzbgy>
	//   20   36:invokestatic    #145 <Method boolean CustomTabsClient.bindCustomTabsService(Context, String, CustomTabsServiceConnection)>
	//   21   39:pop             
			return;
	//   22   40:return          
		}
	}

	public final void zzjo()
	{
		zzbgx = null;
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:putfield        #97  <Field CustomTabsClient zzbgx>
		zzbgw = null;
	//    3    5:aload_0         
	//    4    6:aconst_null     
	//    5    7:putfield        #99  <Field CustomTabsSession zzbgw>
		if(zzbgz != null)
	//*   6   10:aload_0         
	//*   7   11:getfield        #119 <Field zzoi zzbgz>
	//*   8   14:ifnull          26
			zzbgz.zzjq();
	//    9   17:aload_0         
	//   10   18:getfield        #119 <Field zzoi zzbgz>
	//   11   21:invokeinterface #149 <Method void zzoi.zzjq()>
	//   12   26:return          
	}

	private CustomTabsSession zzbgw;
	private CustomTabsClient zzbgx;
	private CustomTabsServiceConnection zzbgy;
	private zzoi zzbgz;
}

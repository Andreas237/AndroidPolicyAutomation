// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import com.google.android.gms.common.util.PlatformVersion;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzaph, zzaov, zzapw, zzasi, 
//			zzapx, zznx, zzapv, zzapg

public final class zzapo extends zzaph
{

	public zzapo()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #9   <Method void zzaph()>
	//    2    4:return          
	}

	public final zzapg zza(Context context, zzapw zzapw1, int i, boolean flag, zznx zznx, zzapv zzapv)
	{
		ApplicationInfo applicationinfo = context.getApplicationInfo();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #19  <Method ApplicationInfo Context.getApplicationInfo()>
	//    2    4:astore          7
		if(PlatformVersion.isAtLeastIceCreamSandwich() && (applicationinfo == null || applicationinfo.targetSdkVersion >= 11))
	//*   3    6:invokestatic    #25  <Method boolean PlatformVersion.isAtLeastIceCreamSandwich()>
	//*   4    9:ifeq            32
	//*   5   12:aload           7
	//*   6   14:ifnull          27
	//*   7   17:aload           7
	//*   8   19:getfield        #31  <Field int ApplicationInfo.targetSdkVersion>
	//*   9   22:bipush          11
	//*  10   24:icmplt          32
			i = 1;
	//   11   27:iconst_1        
	//   12   28:istore_3        
		else
	//*  13   29:goto            34
			i = 0;
	//   14   32:iconst_0        
	//   15   33:istore_3        
		if(i == 0)
	//*  16   34:iload_3         
	//*  17   35:ifne            40
			return null;
	//   18   38:aconst_null     
	//   19   39:areturn         
		else
			return ((zzapg) (new zzaov(context, flag, zzapw1.zzud().zzvs(), zzapv, new zzapx(context, zzapw1.zztq(), zzapw1.zzol(), zznx, zzapw1.zztn()))));
	//   20   40:new             #33  <Class zzaov>
	//   21   43:dup             
	//   22   44:aload_1         
	//   23   45:iload           4
	//   24   47:aload_2         
	//   25   48:invokeinterface #39  <Method zzasi zzapw.zzud()>
	//   26   53:invokevirtual   #44  <Method boolean zzasi.zzvs()>
	//   27   56:aload           6
	//   28   58:new             #46  <Class zzapx>
	//   29   61:dup             
	//   30   62:aload_1         
	//   31   63:aload_2         
	//   32   64:invokeinterface #50  <Method zzang zzapw.zztq()>
	//   33   69:aload_2         
	//   34   70:invokeinterface #54  <Method String zzapw.zzol()>
	//   35   75:aload           5
	//   36   77:aload_2         
	//   37   78:invokeinterface #58  <Method zznv zzapw.zztn()>
	//   38   83:invokespecial   #61  <Method void zzapx(Context, zzang, String, zznx, zznv)>
	//   39   86:invokespecial   #64  <Method void zzaov(Context, boolean, boolean, zzapv, zzapx)>
	//   40   89:areturn         
	}
}

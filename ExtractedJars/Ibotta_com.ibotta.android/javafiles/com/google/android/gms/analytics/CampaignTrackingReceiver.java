// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.analytics;

import android.content.*;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.*;

// Referenced classes of package com.google.android.gms.analytics:
//			zzc

public class CampaignTrackingReceiver extends BroadcastReceiver
{

	public CampaignTrackingReceiver()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void BroadcastReceiver()>
	//    2    4:return          
	}

	public static boolean zza(Context context)
	{
		Preconditions.checkNotNull(((Object) (context)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #20  <Method Object Preconditions.checkNotNull(Object)>
	//    2    4:pop             
		Boolean boolean1 = zzqt;
	//    3    5:getstatic       #22  <Field Boolean zzqt>
	//    4    8:astore_2        
		if(boolean1 != null)
	//*   5    9:aload_2         
	//*   6   10:ifnull          18
		{
			return boolean1.booleanValue();
	//    7   13:aload_2         
	//    8   14:invokevirtual   #28  <Method boolean Boolean.booleanValue()>
	//    9   17:ireturn         
		} else
		{
			boolean flag = zzdd.zza(context, "com.google.android.gms.analytics.CampaignTrackingReceiver", true);
	//   10   18:aload_0         
	//   11   19:ldc1            #30  <String "com.google.android.gms.analytics.CampaignTrackingReceiver">
	//   12   21:iconst_1        
	//   13   22:invokestatic    #35  <Method boolean zzdd.zza(Context, String, boolean)>
	//   14   25:istore_1        
			zzqt = Boolean.valueOf(flag);
	//   15   26:iload_1         
	//   16   27:invokestatic    #39  <Method Boolean Boolean.valueOf(boolean)>
	//   17   30:putstatic       #22  <Field Boolean zzqt>
			return flag;
	//   18   33:iload_1         
	//   19   34:ireturn         
		}
	}

	public void onReceive(Context context, Intent intent)
	{
		zzat zzat1 = zzat.zzc(context);
	//    0    0:aload_1         
	//    1    1:invokestatic    #51  <Method zzat zzat.zzc(Context)>
	//    2    4:astore          5
		com.google.android.gms.internal.measurement.zzcm zzcm = zzat1.zzbu();
	//    3    6:aload           5
	//    4    8:invokevirtual   #55  <Method com.google.android.gms.internal.measurement.zzcm zzat.zzbu()>
	//    5   11:astore          6
		if(intent == null)
	//*   6   13:aload_2         
	//*   7   14:ifnonnull       25
		{
			((zzaq) (zzcm)).zzt("CampaignTrackingReceiver received null intent");
	//    8   17:aload           6
	//    9   19:ldc1            #57  <String "CampaignTrackingReceiver received null intent">
	//   10   21:invokevirtual   #63  <Method void zzaq.zzt(String)>
			return;
	//   11   24:return          
		}
		String s = intent.getStringExtra("referrer");
	//   12   25:aload_2         
	//   13   26:ldc1            #65  <String "referrer">
	//   14   28:invokevirtual   #71  <Method String Intent.getStringExtra(String)>
	//   15   31:astore          4
		intent = ((Intent) (intent.getAction()));
	//   16   33:aload_2         
	//   17   34:invokevirtual   #75  <Method String Intent.getAction()>
	//   18   37:astore_2        
		((zzaq) (zzcm)).zza("CampaignTrackingReceiver received", ((Object) (intent)));
	//   19   38:aload           6
	//   20   40:ldc1            #77  <String "CampaignTrackingReceiver received">
	//   21   42:aload_2         
	//   22   43:invokevirtual   #80  <Method void zzaq.zza(String, Object)>
		if("com.android.vending.INSTALL_REFERRER".equals(((Object) (intent))) && !TextUtils.isEmpty(((CharSequence) (s))))
	//*  23   46:ldc1            #82  <String "com.android.vending.INSTALL_REFERRER">
	//*  24   48:aload_2         
	//*  25   49:invokevirtual   #88  <Method boolean String.equals(Object)>
	//*  26   52:ifeq            143
	//*  27   55:aload           4
	//*  28   57:invokestatic    #94  <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  29   60:ifeq            66
	//*  30   63:goto            143
		{
			zza(context, s);
	//   31   66:aload_0         
	//   32   67:aload_1         
	//   33   68:aload           4
	//   34   70:invokevirtual   #97  <Method void zza(Context, String)>
			int i = zzbu.zzdu();
	//   35   73:invokestatic    #103 <Method int zzbu.zzdu()>
	//   36   76:istore_3        
			if(s.length() <= i)
	//*  37   77:aload           4
	//*  38   79:invokevirtual   #106 <Method int String.length()>
	//*  39   82:iload_3         
	//*  40   83:icmpgt          92
			{
				context = ((Context) (s));
	//   41   86:aload           4
	//   42   88:astore_1        
			} else
	//*  43   89:goto            119
			{
				((zzaq) (zzcm)).zzc("Campaign data exceed the maximum supported size and will be clipped. size, limit", ((Object) (Integer.valueOf(s.length()))), ((Object) (Integer.valueOf(i))));
	//   44   92:aload           6
	//   45   94:ldc1            #108 <String "Campaign data exceed the maximum supported size and will be clipped. size, limit">
	//   46   96:aload           4
	//   47   98:invokevirtual   #106 <Method int String.length()>
	//   48  101:invokestatic    #113 <Method Integer Integer.valueOf(int)>
	//   49  104:iload_3         
	//   50  105:invokestatic    #113 <Method Integer Integer.valueOf(int)>
	//   51  108:invokevirtual   #116 <Method void zzaq.zzc(String, Object, Object)>
				context = ((Context) (s.substring(0, i)));
	//   52  111:aload           4
	//   53  113:iconst_0        
	//   54  114:iload_3         
	//   55  115:invokevirtual   #120 <Method String String.substring(int, int)>
	//   56  118:astore_1        
			}
			intent = ((Intent) (goAsync()));
	//   57  119:aload_0         
	//   58  120:invokevirtual   #124 <Method android.content.BroadcastReceiver$PendingResult goAsync()>
	//   59  123:astore_2        
			zzat1.zzby().zza(((String) (context)), ((Runnable) (new zzc(this, ((android.content.BroadcastReceiver.PendingResult) (intent))))));
	//   60  124:aload           5
	//   61  126:invokevirtual   #128 <Method zzai zzat.zzby()>
	//   62  129:aload_1         
	//   63  130:new             #130 <Class zzc>
	//   64  133:dup             
	//   65  134:aload_0         
	//   66  135:aload_2         
	//   67  136:invokespecial   #133 <Method void zzc(CampaignTrackingReceiver, android.content.BroadcastReceiver$PendingResult)>
	//   68  139:invokevirtual   #138 <Method void zzai.zza(String, Runnable)>
			return;
	//   69  142:return          
		} else
		{
			((zzaq) (zzcm)).zzt("CampaignTrackingReceiver received unexpected intent without referrer extra");
	//   70  143:aload           6
	//   71  145:ldc1            #140 <String "CampaignTrackingReceiver received unexpected intent without referrer extra">
	//   72  147:invokevirtual   #63  <Method void zzaq.zzt(String)>
			return;
	//   73  150:return          
		}
	}

	protected void zza(Context context, String s)
	{
	//    0    0:return          
	}

	private static Boolean zzqt;
}

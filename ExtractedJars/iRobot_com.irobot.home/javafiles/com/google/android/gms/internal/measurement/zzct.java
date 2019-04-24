// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.gms.analytics.zzk;
import com.google.android.gms.common.util.Clock;

// Referenced classes of package com.google.android.gms.internal.measurement:
//			zzau, zzcv, zzcf, zzcg, 
//			zzat, zzdc, zzaw

public final class zzct extends zzau
{

	protected zzct(zzaw zzaw)
	{
		super(zzaw);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #15  <Method void zzau(zzaw)>
		zzabt = -1L;
	//    3    5:aload_0         
	//    4    6:ldc2w           #16  <Long -1L>
	//    5    9:putfield        #19  <Field long zzabt>
		zzabu = new zzcv(this, "monitoring", ((Long)zzcf.zzaak.get()).longValue(), ((zzcu) (null)));
	//    6   12:aload_0         
	//    7   13:new             #21  <Class zzcv>
	//    8   16:dup             
	//    9   17:aload_0         
	//   10   18:ldc1            #23  <String "monitoring">
	//   11   20:getstatic       #29  <Field zzcg zzcf.zzaak>
	//   12   23:invokevirtual   #35  <Method Object zzcg.get()>
	//   13   26:checkcast       #37  <Class Long>
	//   14   29:invokevirtual   #41  <Method long Long.longValue()>
	//   15   32:aconst_null     
	//   16   33:invokespecial   #44  <Method void zzcv(zzct, String, long, zzcu)>
	//   17   36:putfield        #46  <Field zzcv zzabu>
	//   18   39:return          
	}

	static SharedPreferences zza(zzct zzct1)
	{
		return zzct1.zzabr;
	//    0    0:aload_0         
	//    1    1:getfield        #51  <Field SharedPreferences zzabr>
	//    2    4:areturn         
	}

	public final void zzac(String s)
	{
		zzk.zzaf();
	//    0    0:invokestatic    #59  <Method void zzk.zzaf()>
		((zzau)this).zzcl();
	//    1    3:aload_0         
	//    2    4:invokevirtual   #62  <Method void zzau.zzcl()>
		android.content.SharedPreferences.Editor editor = zzabr.edit();
	//    3    7:aload_0         
	//    4    8:getfield        #51  <Field SharedPreferences zzabr>
	//    5   11:invokeinterface #68  <Method android.content.SharedPreferences$Editor SharedPreferences.edit()>
	//    6   16:astore_2        
		if(TextUtils.isEmpty(((CharSequence) (s))))
	//*   7   17:aload_1         
	//*   8   18:invokestatic    #74  <Method boolean TextUtils.isEmpty(CharSequence)>
	//*   9   21:ifeq            36
			editor.remove("installation_campaign");
	//   10   24:aload_2         
	//   11   25:ldc1            #76  <String "installation_campaign">
	//   12   27:invokeinterface #82  <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.remove(String)>
	//   13   32:pop             
		else
	//*  14   33:goto            46
			editor.putString("installation_campaign", s);
	//   15   36:aload_2         
	//   16   37:ldc1            #76  <String "installation_campaign">
	//   17   39:aload_1         
	//   18   40:invokeinterface #86  <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putString(String, String)>
	//   19   45:pop             
		if(!editor.commit())
	//*  20   46:aload_2         
	//*  21   47:invokeinterface #90  <Method boolean android.content.SharedPreferences$Editor.commit()>
	//*  22   52:ifne            61
			((zzat)this).zzt("Failed to commit campaign data");
	//   23   55:aload_0         
	//   24   56:ldc1            #92  <String "Failed to commit campaign data">
	//   25   58:invokevirtual   #97  <Method void zzat.zzt(String)>
	//   26   61:return          
	}

	protected final void zzag()
	{
		zzabr = ((zzat)this).getContext().getSharedPreferences("com.google.android.gms.analytics.prefs", 0);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #102 <Method Context zzat.getContext()>
	//    3    5:ldc1            #104 <String "com.google.android.gms.analytics.prefs">
	//    4    7:iconst_0        
	//    5    8:invokevirtual   #110 <Method SharedPreferences Context.getSharedPreferences(String, int)>
	//    6   11:putfield        #51  <Field SharedPreferences zzabr>
	//    7   14:return          
	}

	public final long zzff()
	{
		zzk.zzaf();
	//    0    0:invokestatic    #59  <Method void zzk.zzaf()>
		((zzau)this).zzcl();
	//    1    3:aload_0         
	//    2    4:invokevirtual   #62  <Method void zzau.zzcl()>
		if(zzabs != 0L) goto _L2; else goto _L1
	//    3    7:aload_0         
	//    4    8:getfield        #113 <Field long zzabs>
	//    5   11:lconst_0        
	//    6   12:lcmp            
	//    7   13:ifne            98
_L1:
		long l = zzabr.getLong("first_run", 0L);
	//    8   16:aload_0         
	//    9   17:getfield        #51  <Field SharedPreferences zzabr>
	//   10   20:ldc1            #115 <String "first_run">
	//   11   22:lconst_0        
	//   12   23:invokeinterface #119 <Method long SharedPreferences.getLong(String, long)>
	//   13   28:lstore_1        
		if(l == 0L) goto _L4; else goto _L3
	//   14   29:lload_1         
	//   15   30:lconst_0        
	//   16   31:lcmp            
	//   17   32:ifeq            43
_L3:
		zzabs = l;
	//   18   35:aload_0         
	//   19   36:lload_1         
	//   20   37:putfield        #113 <Field long zzabs>
		break; /* Loop/switch isn't completed */
	//   21   40:goto            98
_L4:
		long l1 = ((zzat)this).zzbx().currentTimeMillis();
	//   22   43:aload_0         
	//   23   44:invokevirtual   #123 <Method Clock zzat.zzbx()>
	//   24   47:invokeinterface #128 <Method long Clock.currentTimeMillis()>
	//   25   52:lstore_3        
		android.content.SharedPreferences.Editor editor = zzabr.edit();
	//   26   53:aload_0         
	//   27   54:getfield        #51  <Field SharedPreferences zzabr>
	//   28   57:invokeinterface #68  <Method android.content.SharedPreferences$Editor SharedPreferences.edit()>
	//   29   62:astore          5
		editor.putLong("first_run", l1);
	//   30   64:aload           5
	//   31   66:ldc1            #115 <String "first_run">
	//   32   68:lload_3         
	//   33   69:invokeinterface #132 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putLong(String, long)>
	//   34   74:pop             
		l = l1;
	//   35   75:lload_3         
	//   36   76:lstore_1        
		if(!editor.commit())
	//*  37   77:aload           5
	//*  38   79:invokeinterface #90  <Method boolean android.content.SharedPreferences$Editor.commit()>
	//*  39   84:ifne            35
		{
			((zzat)this).zzt("Failed to commit first run time");
	//   40   87:aload_0         
	//   41   88:ldc1            #134 <String "Failed to commit first run time">
	//   42   90:invokevirtual   #97  <Method void zzat.zzt(String)>
			l = l1;
	//   43   93:lload_3         
	//   44   94:lstore_1        
		}
		if(true) goto _L3; else goto _L2
	//   45   95:goto            35
_L2:
		return zzabs;
	//   46   98:aload_0         
	//   47   99:getfield        #113 <Field long zzabs>
	//   48  102:lreturn         
	}

	public final zzdc zzfg()
	{
		return new zzdc(((zzat)this).zzbx(), zzff());
	//    0    0:new             #138 <Class zzdc>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokevirtual   #123 <Method Clock zzat.zzbx()>
	//    4    8:aload_0         
	//    5    9:invokevirtual   #140 <Method long zzff()>
	//    6   12:invokespecial   #143 <Method void zzdc(Clock, long)>
	//    7   15:areturn         
	}

	public final long zzfh()
	{
		zzk.zzaf();
	//    0    0:invokestatic    #59  <Method void zzk.zzaf()>
		((zzau)this).zzcl();
	//    1    3:aload_0         
	//    2    4:invokevirtual   #62  <Method void zzau.zzcl()>
		if(zzabt == -1L)
	//*   3    7:aload_0         
	//*   4    8:getfield        #19  <Field long zzabt>
	//*   5   11:ldc2w           #16  <Long -1L>
	//*   6   14:lcmp            
	//*   7   15:ifne            34
			zzabt = zzabr.getLong("last_dispatch", 0L);
	//    8   18:aload_0         
	//    9   19:aload_0         
	//   10   20:getfield        #51  <Field SharedPreferences zzabr>
	//   11   23:ldc1            #146 <String "last_dispatch">
	//   12   25:lconst_0        
	//   13   26:invokeinterface #119 <Method long SharedPreferences.getLong(String, long)>
	//   14   31:putfield        #19  <Field long zzabt>
		return zzabt;
	//   15   34:aload_0         
	//   16   35:getfield        #19  <Field long zzabt>
	//   17   38:lreturn         
	}

	public final void zzfi()
	{
		zzk.zzaf();
	//    0    0:invokestatic    #59  <Method void zzk.zzaf()>
		((zzau)this).zzcl();
	//    1    3:aload_0         
	//    2    4:invokevirtual   #62  <Method void zzau.zzcl()>
		long l = ((zzat)this).zzbx().currentTimeMillis();
	//    3    7:aload_0         
	//    4    8:invokevirtual   #123 <Method Clock zzat.zzbx()>
	//    5   11:invokeinterface #128 <Method long Clock.currentTimeMillis()>
	//    6   16:lstore_1        
		android.content.SharedPreferences.Editor editor = zzabr.edit();
	//    7   17:aload_0         
	//    8   18:getfield        #51  <Field SharedPreferences zzabr>
	//    9   21:invokeinterface #68  <Method android.content.SharedPreferences$Editor SharedPreferences.edit()>
	//   10   26:astore_3        
		editor.putLong("last_dispatch", l);
	//   11   27:aload_3         
	//   12   28:ldc1            #146 <String "last_dispatch">
	//   13   30:lload_1         
	//   14   31:invokeinterface #132 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putLong(String, long)>
	//   15   36:pop             
		editor.apply();
	//   16   37:aload_3         
	//   17   38:invokeinterface #150 <Method void android.content.SharedPreferences$Editor.apply()>
		zzabt = l;
	//   18   43:aload_0         
	//   19   44:lload_1         
	//   20   45:putfield        #19  <Field long zzabt>
	//   21   48:return          
	}

	public final String zzfj()
	{
		zzk.zzaf();
	//    0    0:invokestatic    #59  <Method void zzk.zzaf()>
		((zzau)this).zzcl();
	//    1    3:aload_0         
	//    2    4:invokevirtual   #62  <Method void zzau.zzcl()>
		String s = zzabr.getString("installation_campaign", ((String) (null)));
	//    3    7:aload_0         
	//    4    8:getfield        #51  <Field SharedPreferences zzabr>
	//    5   11:ldc1            #76  <String "installation_campaign">
	//    6   13:aconst_null     
	//    7   14:invokeinterface #156 <Method String SharedPreferences.getString(String, String)>
	//    8   19:astore_1        
		if(TextUtils.isEmpty(((CharSequence) (s))))
	//*   9   20:aload_1         
	//*  10   21:invokestatic    #74  <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  11   24:ifeq            29
			return null;
	//   12   27:aconst_null     
	//   13   28:areturn         
		else
			return s;
	//   14   29:aload_1         
	//   15   30:areturn         
	}

	public final zzcv zzfk()
	{
		return zzabu;
	//    0    0:aload_0         
	//    1    1:getfield        #46  <Field zzcv zzabu>
	//    2    4:areturn         
	}

	private SharedPreferences zzabr;
	private long zzabs;
	private long zzabt;
	private final zzcv zzabu;
}

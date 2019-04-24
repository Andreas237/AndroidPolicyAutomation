// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.zzbv;
import java.util.Map;
import java.util.concurrent.Executor;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzus, zzuo, zzuu, zzarg, 
//			zzasv, zzash, zzug, zzass, 
//			zzuh, zzun, zzang, zzakk, 
//			zzuk, zzup, zzaoe, zzui, 
//			zzuj, zzul, zzwd, zzuv, 
//			zzwc

public final class zzuf extends zzus
	implements zzuo, zzuu
{

	public zzuf(Context context, zzang zzang1)
		throws zzarg
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #22  <Method void zzus()>
		try
		{
			zzbpj = new zzasv(new zzash(context));
	//    2    4:aload_0         
	//    3    5:new             #24  <Class zzasv>
	//    4    8:dup             
	//    5    9:new             #26  <Class zzash>
	//    6   12:dup             
	//    7   13:aload_1         
	//    8   14:invokespecial   #29  <Method void zzash(Context)>
	//    9   17:invokespecial   #32  <Method void zzasv(zzash)>
	//   10   20:putfield        #34  <Field zzasv zzbpj>
			zzbpj.setWillNotDraw(true);
	//   11   23:aload_0         
	//   12   24:getfield        #34  <Field zzasv zzbpj>
	//   13   27:iconst_1        
	//   14   28:invokevirtual   #38  <Method void zzasv.setWillNotDraw(boolean)>
			((zzass) (zzbpj)).zza(((zzasx) (new zzug(this))));
	//   15   31:aload_0         
	//   16   32:getfield        #34  <Field zzasv zzbpj>
	//   17   35:new             #40  <Class zzug>
	//   18   38:dup             
	//   19   39:aload_0         
	//   20   40:invokespecial   #43  <Method void zzug(zzuf)>
	//   21   43:invokevirtual   #49  <Method void zzass.zza(zzasx)>
			((zzass) (zzbpj)).zza(((zzasz) (new zzuh(this))));
	//   22   46:aload_0         
	//   23   47:getfield        #34  <Field zzasv zzbpj>
	//   24   50:new             #51  <Class zzuh>
	//   25   53:dup             
	//   26   54:aload_0         
	//   27   55:invokespecial   #52  <Method void zzuh(zzuf)>
	//   28   58:invokevirtual   #55  <Method void zzass.zza(zzasz)>
			((zzass) (zzbpj)).addJavascriptInterface(((Object) (new zzun(((zzur) (this)), ((zzum) (null))))), "GoogleJsInterface");
	//   29   61:aload_0         
	//   30   62:getfield        #34  <Field zzasv zzbpj>
	//   31   65:new             #57  <Class zzun>
	//   32   68:dup             
	//   33   69:aload_0         
	//   34   70:aconst_null     
	//   35   71:invokespecial   #60  <Method void zzun(zzur, zzum)>
	//   36   74:ldc1            #62  <String "GoogleJsInterface">
	//   37   76:invokevirtual   #66  <Method void zzass.addJavascriptInterface(Object, String)>
			zzbv.zzek().zza(context, zzang1.zzcw, zzbpj.getSettings());
	//   38   79:invokestatic    #72  <Method zzakk zzbv.zzek()>
	//   39   82:aload_1         
	//   40   83:aload_2         
	//   41   84:getfield        #78  <Field String zzang.zzcw>
	//   42   87:aload_0         
	//   43   88:getfield        #34  <Field zzasv zzbpj>
	//   44   91:invokevirtual   #82  <Method android.webkit.WebSettings zzasv.getSettings()>
	//   45   94:invokevirtual   #87  <Method void zzakk.zza(Context, String, android.webkit.WebSettings)>
			return;
	//   46   97:return          
		}
		// Misplaced declaration of an exception variable
		catch(Context context)
	//*  47   98:astore_1        
		{
			throw new zzarg("Init failed.", ((Throwable) (context)));
	//   48   99:new             #17  <Class zzarg>
	//   49  102:dup             
	//   50  103:ldc1            #89  <String "Init failed.">
	//   51  105:aload_1         
	//   52  106:invokespecial   #92  <Method void zzarg(String, Throwable)>
	//   53  109:athrow          
		}
	}

	public final void destroy()
	{
		zzbpj.destroy();
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field zzasv zzbpj>
	//    2    4:invokevirtual   #97  <Method void zzasv.destroy()>
	//    3    7:return          
	}

	public final volatile Object getReference()
	{
		if(this == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			throw null;
	//    2    4:aconst_null     
	//    3    5:athrow          
		else
			return ((Object) (this));
	//    4    6:aload_0         
	//    5    7:areturn         
	}

	public final void zza(zzuv zzuv)
	{
		((zzass) (zzbpj)).zza(((zzata) (new zzuk(zzuv))));
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field zzasv zzbpj>
	//    2    4:new             #102 <Class zzuk>
	//    3    7:dup             
	//    4    8:aload_1         
	//    5    9:invokespecial   #104 <Method void zzuk(zzuv)>
	//    6   12:invokevirtual   #107 <Method void zzass.zza(zzata)>
	//    7   15:return          
	}

	public final void zza(String s, Map map)
	{
		zzup.zza(((zzuo) (this)), s, map);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokestatic    #113 <Method void zzup.zza(zzuo, String, Map)>
	//    4    6:return          
	}

	public final void zza(String s, JSONObject jsonobject)
	{
		zzup.zzb(((zzuo) (this)), s, jsonobject);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokestatic    #118 <Method void zzup.zzb(zzuo, String, JSONObject)>
	//    4    6:return          
	}

	public final void zzb(String s, JSONObject jsonobject)
	{
		zzup.zza(((zzuo) (this)), s, jsonobject);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokestatic    #120 <Method void zzup.zza(zzuo, String, JSONObject)>
	//    4    6:return          
	}

	public final void zzbb(String s)
	{
		zzbc(String.format("<!DOCTYPE html><html><head><script src=\"%s\"></script></head></html>", new Object[] {
			s
		}));
	//    0    0:aload_0         
	//    1    1:ldc1            #124 <String "<!DOCTYPE html><html><head><script src=\"%s\"></script></head></html>">
	//    2    3:iconst_1        
	//    3    4:anewarray       Object[]
	//    4    7:dup             
	//    5    8:iconst_0        
	//    6    9:aload_1         
	//    7   10:aastore         
	//    8   11:invokestatic    #132 <Method String String.format(String, Object[])>
	//    9   14:invokevirtual   #135 <Method void zzbc(String)>
	//   10   17:return          
	}

	public final void zzbc(String s)
	{
		zzaoe.zzcvy.execute(((Runnable) (new zzui(this, s))));
	//    0    0:getstatic       #141 <Field Executor zzaoe.zzcvy>
	//    1    3:new             #143 <Class zzui>
	//    2    6:dup             
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:invokespecial   #146 <Method void zzui(zzuf, String)>
	//    6   12:invokeinterface #152 <Method void Executor.execute(Runnable)>
	//    7   17:return          
	}

	public final void zzbd(String s)
	{
		zzaoe.zzcvy.execute(((Runnable) (new zzuj(this, s))));
	//    0    0:getstatic       #141 <Field Executor zzaoe.zzcvy>
	//    1    3:new             #155 <Class zzuj>
	//    2    6:dup             
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:invokespecial   #156 <Method void zzuj(zzuf, String)>
	//    6   12:invokeinterface #152 <Method void Executor.execute(Runnable)>
	//    7   17:return          
	}

	public final void zzbe(String s)
	{
		zzaoe.zzcvy.execute(((Runnable) (new zzul(this, s))));
	//    0    0:getstatic       #141 <Field Executor zzaoe.zzcvy>
	//    1    3:new             #159 <Class zzul>
	//    2    6:dup             
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:invokespecial   #160 <Method void zzul(zzuf, String)>
	//    6   12:invokeinterface #152 <Method void Executor.execute(Runnable)>
	//    7   17:return          
	}

	final void zzbf(String s)
	{
		((zzass) (zzbpj)).zzbe(s);
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field zzasv zzbpj>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #163 <Method void zzass.zzbe(String)>
	//    4    8:return          
	}

	final void zzbg(String s)
	{
		((zzass) (zzbpj)).loadUrl(s);
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field zzasv zzbpj>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #167 <Method void zzass.loadUrl(String)>
	//    4    8:return          
	}

	final void zzbh(String s)
	{
		zzbpj.loadData(s, "text/html", "UTF-8");
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field zzasv zzbpj>
	//    2    4:aload_1         
	//    3    5:ldc1            #170 <String "text/html">
	//    4    7:ldc1            #172 <String "UTF-8">
	//    5    9:invokevirtual   #176 <Method void zzasv.loadData(String, String, String)>
	//    6   12:return          
	}

	public final void zzf(String s, String s1)
	{
		zzup.zza(((zzuo) (this)), s, s1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokestatic    #181 <Method void zzup.zza(zzuo, String, String)>
	//    4    6:return          
	}

	public final zzwc zzlw()
	{
		return ((zzwc) (new zzwd(((zzwb) (this)))));
	//    0    0:new             #185 <Class zzwd>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #188 <Method void zzwd(zzwb)>
	//    4    8:areturn         
	}

	private final zzasv zzbpj;
}

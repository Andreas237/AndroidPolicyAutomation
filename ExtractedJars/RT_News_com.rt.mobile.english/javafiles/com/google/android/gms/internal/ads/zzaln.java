// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.content.Context;
import java.io.File;
import java.util.regex.Pattern;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzaj, zzas, zzv, zzam, 
//			zzae, zzr, zznk, zzkb, 
//			zzni, zzamu, zzsm, zzakb, 
//			zzar, zzp

public final class zzaln extends zzaj
{

	private zzaln(Context context, zzar zzar)
	{
		super(zzar);
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:invokespecial   #12  <Method void zzaj(zzar)>
		mContext = context;
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:putfield        #14  <Field Context mContext>
	//    6   10:return          
	}

	public static zzv zzba(Context context)
	{
		zzaln zzaln1 = new zzaln(context, ((zzar) (new zzas())));
	//    0    0:new             #2   <Class zzaln>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:new             #19  <Class zzas>
	//    4    8:dup             
	//    5    9:invokespecial   #22  <Method void zzas()>
	//    6   12:invokespecial   #24  <Method void zzaln(Context, zzar)>
	//    7   15:astore_1        
		context = ((Context) (new zzv(((zzb) (new zzam(new File(context.getCacheDir(), "admob_volley")))), ((zzm) (zzaln1)))));
	//    8   16:new             #26  <Class zzv>
	//    9   19:dup             
	//   10   20:new             #28  <Class zzam>
	//   11   23:dup             
	//   12   24:new             #30  <Class File>
	//   13   27:dup             
	//   14   28:aload_0         
	//   15   29:invokevirtual   #36  <Method File Context.getCacheDir()>
	//   16   32:ldc1            #38  <String "admob_volley">
	//   17   34:invokespecial   #41  <Method void File(File, String)>
	//   18   37:invokespecial   #44  <Method void zzam(File)>
	//   19   40:aload_1         
	//   20   41:invokespecial   #47  <Method void zzv(zzb, zzm)>
	//   21   44:astore_0        
		((zzv) (context)).start();
	//   22   45:aload_0         
	//   23   46:invokevirtual   #50  <Method void zzv.start()>
		return ((zzv) (context));
	//   24   49:aload_0         
	//   25   50:areturn         
	}

	public final zzp zzc(zzr zzr1)
		throws zzae
	{
		if(zzr1.zzh() && zzr1.getMethod() == 0)
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #60  <Method boolean zzr.zzh()>
	//*   2    4:ifeq            154
	//*   3    7:aload_1         
	//*   4    8:invokevirtual   #64  <Method int zzr.getMethod()>
	//*   5   11:ifne            154
		{
			String s = zzr1.getUrl();
	//    6   14:aload_1         
	//    7   15:invokevirtual   #68  <Method String zzr.getUrl()>
	//    8   18:astore_2        
			zzna zzna = zznk.zzbdw;
	//    9   19:getstatic       #74  <Field zzna zznk.zzbdw>
	//   10   22:astore_3        
			if(Pattern.matches((String)zzkb.zzik().zzd(zzna), ((CharSequence) (s))))
	//*  11   23:invokestatic    #80  <Method zzni zzkb.zzik()>
	//*  12   26:aload_3         
	//*  13   27:invokevirtual   #86  <Method Object zzni.zzd(zzna)>
	//*  14   30:checkcast       #88  <Class String>
	//*  15   33:aload_2         
	//*  16   34:invokestatic    #94  <Method boolean Pattern.matches(String, CharSequence)>
	//*  17   37:ifeq            154
			{
				zzkb.zzif();
	//   18   40:invokestatic    #98  <Method zzamu zzkb.zzif()>
	//   19   43:pop             
				if(zzamu.zzbe(mContext))
	//*  20   44:aload_0         
	//*  21   45:getfield        #14  <Field Context mContext>
	//*  22   48:invokestatic    #104 <Method boolean zzamu.zzbe(Context)>
	//*  23   51:ifeq            154
				{
					Object obj = ((Object) ((new zzsm(mContext)).zzc(zzr1)));
	//   24   54:new             #106 <Class zzsm>
	//   25   57:dup             
	//   26   58:aload_0         
	//   27   59:getfield        #14  <Field Context mContext>
	//   28   62:invokespecial   #109 <Method void zzsm(Context)>
	//   29   65:aload_1         
	//   30   66:invokevirtual   #111 <Method zzp zzsm.zzc(zzr)>
	//   31   69:astore_2        
					if(obj != null)
	//*  32   70:aload_2         
	//*  33   71:ifnull          115
					{
						zzr1 = ((zzr) (String.valueOf(((Object) (zzr1.getUrl())))));
	//   34   74:aload_1         
	//   35   75:invokevirtual   #68  <Method String zzr.getUrl()>
	//   36   78:invokestatic    #115 <Method String String.valueOf(Object)>
	//   37   81:astore_1        
						if(((String) (zzr1)).length() != 0)
	//*  38   82:aload_1         
	//*  39   83:invokevirtual   #118 <Method int String.length()>
	//*  40   86:ifeq            99
							zzr1 = ((zzr) ("Got gmscore asset response: ".concat(((String) (zzr1)))));
	//   41   89:ldc1            #120 <String "Got gmscore asset response: ">
	//   42   91:aload_1         
	//   43   92:invokevirtual   #124 <Method String String.concat(String)>
	//   44   95:astore_1        
						else
	//*  45   96:goto            109
							zzr1 = ((zzr) (new String("Got gmscore asset response: ")));
	//   46   99:new             #88  <Class String>
	//   47  102:dup             
	//   48  103:ldc1            #120 <String "Got gmscore asset response: ">
	//   49  105:invokespecial   #127 <Method void String(String)>
	//   50  108:astore_1        
						zzakb.v(((String) (zzr1)));
	//   51  109:aload_1         
	//   52  110:invokestatic    #132 <Method void zzakb.v(String)>
						return ((zzp) (obj));
	//   53  113:aload_2         
	//   54  114:areturn         
					}
					obj = ((Object) (String.valueOf(((Object) (zzr1.getUrl())))));
	//   55  115:aload_1         
	//   56  116:invokevirtual   #68  <Method String zzr.getUrl()>
	//   57  119:invokestatic    #115 <Method String String.valueOf(Object)>
	//   58  122:astore_2        
					if(((String) (obj)).length() != 0)
	//*  59  123:aload_2         
	//*  60  124:invokevirtual   #118 <Method int String.length()>
	//*  61  127:ifeq            140
						obj = ((Object) ("Failed to get gmscore asset response: ".concat(((String) (obj)))));
	//   62  130:ldc1            #134 <String "Failed to get gmscore asset response: ">
	//   63  132:aload_2         
	//   64  133:invokevirtual   #124 <Method String String.concat(String)>
	//   65  136:astore_2        
					else
	//*  66  137:goto            150
						obj = ((Object) (new String("Failed to get gmscore asset response: ")));
	//   67  140:new             #88  <Class String>
	//   68  143:dup             
	//   69  144:ldc1            #134 <String "Failed to get gmscore asset response: ">
	//   70  146:invokespecial   #127 <Method void String(String)>
	//   71  149:astore_2        
					zzakb.v(((String) (obj)));
	//   72  150:aload_2         
	//   73  151:invokestatic    #132 <Method void zzakb.v(String)>
				}
			}
		}
		return super.zzc(zzr1);
	//   74  154:aload_0         
	//   75  155:aload_1         
	//   76  156:invokespecial   #135 <Method zzp zzaj.zzc(zzr)>
	//   77  159:areturn         
	}

	private final Context mContext;
}

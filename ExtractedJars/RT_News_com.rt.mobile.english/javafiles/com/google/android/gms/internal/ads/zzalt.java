// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.content.Context;
import java.io.File;
import java.util.Map;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzalu, zznk, zzkb, zzni, 
//			zzaln, zzaj, zzas, zzv, 
//			zzam, zza, zzama, zzalx, 
//			zzamy, zzaly, zzr, zzakb, 
//			zzaoj, zzamb, zzalw, zzaki, 
//			zzano, zzalv, zzaoe, zzalz, 
//			zzanz

public final class zzalt
{

	public zzalt(Context context)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void Object()>
		if(context.getApplicationContext() != null)
	//*   2    4:aload_1         
	//*   3    5:invokevirtual   #34  <Method Context Context.getApplicationContext()>
	//*   4    8:ifnonnull       14
	//*   5   11:goto            19
			context = context.getApplicationContext();
	//    6   14:aload_1         
	//    7   15:invokevirtual   #34  <Method Context Context.getApplicationContext()>
	//    8   18:astore_1        
		zzbb(context);
	//    9   19:aload_1         
	//   10   20:invokestatic    #38  <Method zzv zzbb(Context)>
	//   11   23:pop             
	//   12   24:return          
	}

	private static zzv zzbb(Context context)
	{
		Object obj = zzctg;
	//    0    0:getstatic       #21  <Field Object zzctg>
	//    1    3:astore_1        
		obj;
	//    2    4:aload_1         
		JVM INSTR monitorenter ;
	//    3    5:monitorenter    
		if(zzctf != null)
			break MISSING_BLOCK_LABEL_96;
	//    4    6:getstatic       #41  <Field zzv zzctf>
	//    5    9:ifnonnull       96
		zznk.initialize(context);
	//    6   12:aload_0         
	//    7   13:invokestatic    #46  <Method void zznk.initialize(Context)>
		zzna zzna = zznk.zzbdv;
	//    8   16:getstatic       #50  <Field zzna zznk.zzbdv>
	//    9   19:astore_2        
		if(((Boolean)zzkb.zzik().zzd(zzna)).booleanValue())
	//*  10   20:invokestatic    #56  <Method zzni zzkb.zzik()>
	//*  11   23:aload_2         
	//*  12   24:invokevirtual   #62  <Method Object zzni.zzd(zzna)>
	//*  13   27:checkcast       #64  <Class Boolean>
	//*  14   30:invokevirtual   #68  <Method boolean Boolean.booleanValue()>
	//*  15   33:ifeq            44
		{
			context = ((Context) (zzaln.zzba(context)));
	//   16   36:aload_0         
	//   17   37:invokestatic    #73  <Method zzv zzaln.zzba(Context)>
	//   18   40:astore_0        
			break MISSING_BLOCK_LABEL_92;
	//   19   41:goto            92
		}
		zzaj zzaj1 = new zzaj(((zzai) (new zzas())));
	//   20   44:new             #75  <Class zzaj>
	//   21   47:dup             
	//   22   48:new             #77  <Class zzas>
	//   23   51:dup             
	//   24   52:invokespecial   #78  <Method void zzas()>
	//   25   55:invokespecial   #81  <Method void zzaj(zzai)>
	//   26   58:astore_2        
		context = ((Context) (new zzv(((zzb) (new zzam(new File(context.getCacheDir(), "volley")))), ((zzm) (zzaj1)))));
	//   27   59:new             #83  <Class zzv>
	//   28   62:dup             
	//   29   63:new             #85  <Class zzam>
	//   30   66:dup             
	//   31   67:new             #87  <Class File>
	//   32   70:dup             
	//   33   71:aload_0         
	//   34   72:invokevirtual   #91  <Method File Context.getCacheDir()>
	//   35   75:ldc1            #93  <String "volley">
	//   36   77:invokespecial   #96  <Method void File(File, String)>
	//   37   80:invokespecial   #99  <Method void zzam(File)>
	//   38   83:aload_2         
	//   39   84:invokespecial   #102 <Method void zzv(zzb, zzm)>
	//   40   87:astore_0        
		((zzv) (context)).start();
	//   41   88:aload_0         
	//   42   89:invokevirtual   #105 <Method void zzv.start()>
		zzctf = ((zzv) (context));
	//   43   92:aload_0         
	//   44   93:putstatic       #41  <Field zzv zzctf>
		context = ((Context) (zzctf));
	//   45   96:getstatic       #41  <Field zzv zzctf>
	//   46   99:astore_0        
		obj;
	//   47  100:aload_1         
		JVM INSTR monitorexit ;
	//   48  101:monitorexit     
		return ((zzv) (context));
	//   49  102:aload_0         
	//   50  103:areturn         
		context;
	//   51  104:astore_0        
		obj;
	//   52  105:aload_1         
		JVM INSTR monitorexit ;
	//   53  106:monitorexit     
		throw context;
	//   54  107:aload_0         
	//   55  108:athrow          
	}

	public final zzanz zza(int i, String s, Map map, byte abyte0[])
	{
		zzama zzama1 = new zzama(((zzalu) (null)));
	//    0    0:new             #113 <Class zzama>
	//    1    3:dup             
	//    2    4:aconst_null     
	//    3    5:invokespecial   #116 <Method void zzama(zzalu)>
	//    4    8:astore          5
		zzalx zzalx1 = new zzalx(this, s, zzama1);
	//    5   10:new             #118 <Class zzalx>
	//    6   13:dup             
	//    7   14:aload_0         
	//    8   15:aload_2         
	//    9   16:aload           5
	//   10   18:invokespecial   #121 <Method void zzalx(zzalt, String, zzama)>
	//   11   21:astore          7
		zzamy zzamy1 = new zzamy(((String) (null)));
	//   12   23:new             #123 <Class zzamy>
	//   13   26:dup             
	//   14   27:aconst_null     
	//   15   28:invokespecial   #126 <Method void zzamy(String)>
	//   16   31:astore          6
		map = ((Map) (new zzaly(this, i, s, ((zzz) (zzama1)), ((zzy) (zzalx1)), abyte0, map, zzamy1)));
	//   17   33:new             #128 <Class zzaly>
	//   18   36:dup             
	//   19   37:aload_0         
	//   20   38:iload_1         
	//   21   39:aload_2         
	//   22   40:aload           5
	//   23   42:aload           7
	//   24   44:aload           4
	//   25   46:aload_3         
	//   26   47:aload           6
	//   27   49:invokespecial   #131 <Method void zzaly(zzalt, int, String, zzz, zzy, byte[], Map, zzamy)>
	//   28   52:astore_3        
		if(zzamy.isEnabled())
	//*  29   53:invokestatic    #134 <Method boolean zzamy.isEnabled()>
	//*  30   56:ifeq            86
			try
			{
				zzamy1.zza(s, "GET", ((zzr) (map)).getHeaders(), ((zzr) (map)).zzg());
	//   31   59:aload           6
	//   32   61:aload_2         
	//   33   62:ldc1            #136 <String "GET">
	//   34   64:aload_3         
	//   35   65:invokevirtual   #142 <Method Map zzr.getHeaders()>
	//   36   68:aload_3         
	//   37   69:invokevirtual   #146 <Method byte[] zzr.zzg()>
	//   38   72:invokevirtual   #149 <Method void zzamy.zza(String, String, Map, byte[])>
			}
	//*  39   75:goto            86
			// Misplaced declaration of an exception variable
			catch(String s)
	//*  40   78:astore_2        
			{
				zzakb.zzdk(((Throwable) (s)).getMessage());
	//   41   79:aload_2         
	//   42   80:invokevirtual   #155 <Method String Throwable.getMessage()>
	//   43   83:invokestatic    #160 <Method void zzakb.zzdk(String)>
			}
		zzctf.zze(((zzr) (map)));
	//   44   86:getstatic       #41  <Field zzv zzctf>
	//   45   89:aload_3         
	//   46   90:invokevirtual   #164 <Method zzr zzv.zze(zzr)>
	//   47   93:pop             
		return ((zzanz) (zzama1));
	//   48   94:aload           5
	//   49   96:areturn         
	}

	public final zzanz zza(String s, zzalz zzalz)
	{
		zzaoj zzaoj1 = new zzaoj();
	//    0    0:new             #170 <Class zzaoj>
	//    1    3:dup             
	//    2    4:invokespecial   #171 <Method void zzaoj()>
	//    3    7:astore_3        
		zzctf.zze(((zzr) (new zzamb(s, zzaoj1))));
	//    4    8:getstatic       #41  <Field zzv zzctf>
	//    5   11:new             #173 <Class zzamb>
	//    6   14:dup             
	//    7   15:aload_1         
	//    8   16:aload_3         
	//    9   17:invokespecial   #176 <Method void zzamb(String, zzaoj)>
	//   10   20:invokevirtual   #164 <Method zzr zzv.zze(zzr)>
	//   11   23:pop             
		return zzano.zza(zzano.zza(((zzanz) (zzaoj1)), ((zzank) (new zzalw(this, zzalz))), ((java.util.concurrent.Executor) (zzaki.zzcrj))), java/lang/Throwable, ((zzanj) (new zzalv(this, zzalz))), zzaoe.zzcvz);
	//   12   24:aload_3         
	//   13   25:new             #178 <Class zzalw>
	//   14   28:dup             
	//   15   29:aload_0         
	//   16   30:aload_2         
	//   17   31:invokespecial   #181 <Method void zzalw(zzalt, zzalz)>
	//   18   34:getstatic       #187 <Field zzaod zzaki.zzcrj>
	//   19   37:invokestatic    #192 <Method zzanz zzano.zza(zzanz, zzank, java.util.concurrent.Executor)>
	//   20   40:ldc1            #151 <Class Throwable>
	//   21   42:new             #194 <Class zzalv>
	//   22   45:dup             
	//   23   46:aload_0         
	//   24   47:aload_2         
	//   25   48:invokespecial   #195 <Method void zzalv(zzalt, zzalz)>
	//   26   51:getstatic       #201 <Field java.util.concurrent.Executor zzaoe.zzcvz>
	//   27   54:invokestatic    #204 <Method zzanz zzano.zza(zzanz, Class, zzanj, java.util.concurrent.Executor)>
	//   28   57:areturn         
	}

	public final zzanz zzc(String s, Map map)
	{
		return zza(0, s, map, ((byte []) (null)));
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:aload_1         
	//    3    3:aload_2         
	//    4    4:aconst_null     
	//    5    5:invokevirtual   #210 <Method zzanz zza(int, String, Map, byte[])>
	//    6    8:areturn         
	}

	private static zzv zzctf;
	private static final Object zzctg = new Object();
	private static final zzalz zzcth = new zzalu();

	static 
	{
	//    0    0:new             #4   <Class Object>
	//    1    3:dup             
	//    2    4:invokespecial   #19  <Method void Object()>
	//    3    7:putstatic       #21  <Field Object zzctg>
	//    4   10:new             #23  <Class zzalu>
	//    5   13:dup             
	//    6   14:invokespecial   #24  <Method void zzalu()>
	//    7   17:putstatic       #26  <Field zzalz zzcth>
	//*   8   20:return          
	}
}

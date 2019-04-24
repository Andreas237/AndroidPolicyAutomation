// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.measurement;


// Referenced classes of package com.google.android.gms.internal.measurement:
//			zzbw, zzcj, zzaw, zzat, 
//			zzbu

final class zzci
	implements zzbw
{

	public zzci(zzaw zzaw1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
		zzvy = zzaw1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #18  <Field zzaw zzvy>
	//    5    9:aload_0         
	//    6   10:new             #20  <Class zzcj>
	//    7   13:dup             
	//    8   14:invokespecial   #21  <Method void zzcj()>
	//    9   17:putfield        #23  <Field zzcj zzaap>
	//   10   20:return          
	}

	public final void zza(String s, boolean flag)
	{
		throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.copyTypes(TypeTransformer.java:311)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.fixTypes(TypeTransformer.java:226)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:207)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
	//    0    0:new             #28  <Class RuntimeException>
	//    1    3:dup             
	//    2    4:ldc1            #30  <String "d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.copyTypes(TypeTransformer.java:311)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.fixTypes(TypeTransformer.java:226)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:207)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n">
	//    3    6:invokespecial   #35  <Method void Runtime(String)>
	//    4    9:athrow          
	}

	public final void zzb(String s, int i)
	{
		if("ga_dispatchPeriod".equals(((Object) (s))))
	//*   0    0:ldc1            #39  <String "ga_dispatchPeriod">
	//*   1    2:aload_1         
	//*   2    3:invokevirtual   #45  <Method boolean String.equals(Object)>
	//*   3    6:ifeq            18
		{
			zzaap.zzaat = i;
	//    4    9:aload_0         
	//    5   10:getfield        #23  <Field zzcj zzaap>
	//    6   13:iload_2         
	//    7   14:putfield        #49  <Field int zzcj.zzaat>
			return;
	//    8   17:return          
		} else
		{
			((zzat) (zzvy.zzby())).zzd("Int xml configuration name not recognized", ((Object) (s)));
	//    9   18:aload_0         
	//   10   19:getfield        #18  <Field zzaw zzvy>
	//   11   22:invokevirtual   #55  <Method zzcp zzaw.zzby()>
	//   12   25:ldc1            #57  <String "Int xml configuration name not recognized">
	//   13   27:aload_1         
	//   14   28:invokevirtual   #63  <Method void zzat.zzd(String, Object)>
			return;
	//   15   31:return          
		}
	}

	public final void zzb(String s, String s1)
	{
	//    0    0:return          
	}

	public final void zzc(String s, String s1)
	{
		if("ga_appName".equals(((Object) (s))))
	//*   0    0:ldc1            #67  <String "ga_appName">
	//*   1    2:aload_1         
	//*   2    3:invokevirtual   #45  <Method boolean String.equals(Object)>
	//*   3    6:ifeq            18
		{
			zzaap.zzaaq = s1;
	//    4    9:aload_0         
	//    5   10:getfield        #23  <Field zzcj zzaap>
	//    6   13:aload_2         
	//    7   14:putfield        #71  <Field String zzcj.zzaaq>
			return;
	//    8   17:return          
		}
		if("ga_appVersion".equals(((Object) (s))))
	//*   9   18:ldc1            #73  <String "ga_appVersion">
	//*  10   20:aload_1         
	//*  11   21:invokevirtual   #45  <Method boolean String.equals(Object)>
	//*  12   24:ifeq            36
		{
			zzaap.zzaar = s1;
	//   13   27:aload_0         
	//   14   28:getfield        #23  <Field zzcj zzaap>
	//   15   31:aload_2         
	//   16   32:putfield        #76  <Field String zzcj.zzaar>
			return;
	//   17   35:return          
		}
		if("ga_logLevel".equals(((Object) (s))))
	//*  18   36:ldc1            #78  <String "ga_logLevel">
	//*  19   38:aload_1         
	//*  20   39:invokevirtual   #45  <Method boolean String.equals(Object)>
	//*  21   42:ifeq            54
		{
			zzaap.zzaas = s1;
	//   22   45:aload_0         
	//   23   46:getfield        #23  <Field zzcj zzaap>
	//   24   49:aload_2         
	//   25   50:putfield        #81  <Field String zzcj.zzaas>
			return;
	//   26   53:return          
		} else
		{
			((zzat) (zzvy.zzby())).zzd("String xml configuration name not recognized", ((Object) (s)));
	//   27   54:aload_0         
	//   28   55:getfield        #18  <Field zzaw zzvy>
	//   29   58:invokevirtual   #55  <Method zzcp zzaw.zzby()>
	//   30   61:ldc1            #83  <String "String xml configuration name not recognized">
	//   31   63:aload_1         
	//   32   64:invokevirtual   #63  <Method void zzat.zzd(String, Object)>
			return;
	//   33   67:return          
		}
	}

	public final zzbu zzdv()
	{
		return ((zzbu) (zzaap));
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field zzcj zzaap>
	//    2    4:areturn         
	}

	private final zzcj zzaap = new zzcj();
	private final zzaw zzvy;
}

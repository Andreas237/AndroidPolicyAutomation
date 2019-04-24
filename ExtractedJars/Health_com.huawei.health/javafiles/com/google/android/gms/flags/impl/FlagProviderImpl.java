// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.flags.impl;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.zzd;

// Referenced classes of package com.google.android.gms.flags.impl:
//			zzb

public class FlagProviderImpl extends com.google.android.gms.internal.zzaqd.zza
{

	public FlagProviderImpl()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void com.google.android.gms.internal.zzaqd$zza()>
		zztZ = false;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #15  <Field boolean zztZ>
	//    5    9:return          
	}

	public boolean getBooleanFlagValue(String s, boolean flag, int i)
	{
		if(!zztZ)
	//*   0    0:aload_0         
	//*   1    1:getfield        #15  <Field boolean zztZ>
	//*   2    4:ifne            9
			return flag;
	//    3    7:iload_2         
	//    4    8:ireturn         
		else
			return zza.zza.zza(zzBd, s, Boolean.valueOf(flag)).booleanValue();
	//    5    9:aload_0         
	//    6   10:getfield        #20  <Field SharedPreferences zzBd>
	//    7   13:aload_1         
	//    8   14:iload_2         
	//    9   15:invokestatic    #26  <Method Boolean Boolean.valueOf(boolean)>
	//   10   18:invokestatic    #32  <Method Boolean zza$zza.zza(SharedPreferences, String, Boolean)>
	//   11   21:invokevirtual   #36  <Method boolean Boolean.booleanValue()>
	//   12   24:ireturn         
	}

	public int getIntFlagValue(String s, int i, int j)
	{
		if(!zztZ)
	//*   0    0:aload_0         
	//*   1    1:getfield        #15  <Field boolean zztZ>
	//*   2    4:ifne            9
			return i;
	//    3    7:iload_2         
	//    4    8:ireturn         
		else
			return zza.zzb.zza(zzBd, s, Integer.valueOf(i)).intValue();
	//    5    9:aload_0         
	//    6   10:getfield        #20  <Field SharedPreferences zzBd>
	//    7   13:aload_1         
	//    8   14:iload_2         
	//    9   15:invokestatic    #43  <Method Integer Integer.valueOf(int)>
	//   10   18:invokestatic    #48  <Method Integer zza$zzb.zza(SharedPreferences, String, Integer)>
	//   11   21:invokevirtual   #52  <Method int Integer.intValue()>
	//   12   24:ireturn         
	}

	public long getLongFlagValue(String s, long l, int i)
	{
		if(!zztZ)
	//*   0    0:aload_0         
	//*   1    1:getfield        #15  <Field boolean zztZ>
	//*   2    4:ifne            9
			return l;
	//    3    7:lload_2         
	//    4    8:lreturn         
		else
			return zza.zzc.zza(zzBd, s, Long.valueOf(l)).longValue();
	//    5    9:aload_0         
	//    6   10:getfield        #20  <Field SharedPreferences zzBd>
	//    7   13:aload_1         
	//    8   14:lload_2         
	//    9   15:invokestatic    #59  <Method Long Long.valueOf(long)>
	//   10   18:invokestatic    #64  <Method Long zza$zzc.zza(SharedPreferences, String, Long)>
	//   11   21:invokevirtual   #68  <Method long Long.longValue()>
	//   12   24:lreturn         
	}

	public String getStringFlagValue(String s, String s1, int i)
	{
		if(!zztZ)
	//*   0    0:aload_0         
	//*   1    1:getfield        #15  <Field boolean zztZ>
	//*   2    4:ifne            9
			return s1;
	//    3    7:aload_2         
	//    4    8:areturn         
		else
			return zza.zzd.zza(zzBd, s, s1);
	//    5    9:aload_0         
	//    6   10:getfield        #20  <Field SharedPreferences zzBd>
	//    7   13:aload_1         
	//    8   14:aload_2         
	//    9   15:invokestatic    #75  <Method String zza$zzd.zza(SharedPreferences, String, String)>
	//   10   18:areturn         
	}

	public void init(IObjectWrapper iobjectwrapper)
	{
		iobjectwrapper = ((IObjectWrapper) ((Context)zzd.zzF(iobjectwrapper)));
	//    0    0:aload_1         
	//    1    1:invokestatic    #85  <Method Object zzd.zzF(IObjectWrapper)>
	//    2    4:checkcast       #87  <Class Context>
	//    3    7:astore_1        
		if(zztZ)
	//*   4    8:aload_0         
	//*   5    9:getfield        #15  <Field boolean zztZ>
	//*   6   12:ifeq            16
			return;
	//    7   15:return          
		try
		{
			zzBd = zzb.zzn(((Context) (iobjectwrapper)).createPackageContext("com.google.android.gms", 0));
	//    8   16:aload_0         
	//    9   17:aload_1         
	//   10   18:ldc1            #89  <String "com.google.android.gms">
	//   11   20:iconst_0        
	//   12   21:invokevirtual   #93  <Method Context Context.createPackageContext(String, int)>
	//   13   24:invokestatic    #99  <Method SharedPreferences zzb.zzn(Context)>
	//   14   27:putfield        #20  <Field SharedPreferences zzBd>
			zztZ = true;
	//   15   30:aload_0         
	//   16   31:iconst_1        
	//   17   32:putfield        #15  <Field boolean zztZ>
			return;
	//   18   35:return          
		}
		// Misplaced declaration of an exception variable
		catch(IObjectWrapper iobjectwrapper)
	//*  19   36:astore_1        
		{
			return;
	//   20   37:return          
		}
	}

	private SharedPreferences zzBd;
	private boolean zztZ;
}

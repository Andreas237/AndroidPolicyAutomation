// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.config;

import android.content.ContentResolver;
import com.google.android.gms.internal.stable.zzg;
import com.google.android.gms.internal.stable.zzi;

// Referenced classes of package com.google.android.gms.common.config:
//			GservicesValue

private static final class GservicesValue$zzd
	implements GservicesValue$zza
{

	public final Long getLong(String s, Long long1)
	{
		return Long.valueOf(zzi.getLong(mContentResolver, s, long1.longValue()));
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field ContentResolver mContentResolver>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #27  <Method long Long.longValue()>
	//    5    9:invokestatic    #32  <Method long zzi.getLong(ContentResolver, String, long)>
	//    6   12:invokestatic    #36  <Method Long Long.valueOf(long)>
	//    7   15:areturn         
	}

	public final String getString(String s, String s1)
	{
		return zzi.zza(mContentResolver, s, s1);
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field ContentResolver mContentResolver>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokestatic    #42  <Method String zzi.zza(ContentResolver, String, String)>
	//    5    9:areturn         
	}

	public final Boolean zza(String s, Boolean boolean1)
	{
		return Boolean.valueOf(zzi.zza(mContentResolver, s, boolean1.booleanValue()));
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field ContentResolver mContentResolver>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #49  <Method boolean Boolean.booleanValue()>
	//    5    9:invokestatic    #52  <Method boolean zzi.zza(ContentResolver, String, boolean)>
	//    6   12:invokestatic    #55  <Method Boolean Boolean.valueOf(boolean)>
	//    7   15:areturn         
	}

	public final Double zza(String s, Double double1)
	{
		s = zzi.zza(mContentResolver, s, ((String) (null)));
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field ContentResolver mContentResolver>
	//    2    4:aload_1         
	//    3    5:aconst_null     
	//    4    6:invokestatic    #42  <Method String zzi.zza(ContentResolver, String, String)>
	//    5    9:astore_1        
		if(s != null)
	//*   6   10:aload_1         
	//*   7   11:ifnull          24
		{
			double d;
			try
			{
				d = Double.parseDouble(s);
	//    8   14:aload_1         
	//    9   15:invokestatic    #64  <Method double Double.parseDouble(String)>
	//   10   18:dstore_3        
			}
	//*  11   19:dload_3         
	//*  12   20:invokestatic    #67  <Method Double Double.valueOf(double)>
	//*  13   23:areturn         
	//*  14   24:aload_2         
	//*  15   25:areturn         
			// Misplaced declaration of an exception variable
			catch(String s)
	//*  16   26:astore_1        
			{
				return double1;
	//   17   27:aload_2         
	//   18   28:areturn         
			}
			return Double.valueOf(d);
		} else
		{
			return double1;
		}
	}

	public final Float zza(String s, Float float1)
	{
		s = zzi.zza(mContentResolver, s, ((String) (null)));
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field ContentResolver mContentResolver>
	//    2    4:aload_1         
	//    3    5:aconst_null     
	//    4    6:invokestatic    #42  <Method String zzi.zza(ContentResolver, String, String)>
	//    5    9:astore_1        
		if(s != null)
	//*   6   10:aload_1         
	//*   7   11:ifnull          24
		{
			float f;
			try
			{
				f = Float.parseFloat(s);
	//    8   14:aload_1         
	//    9   15:invokestatic    #74  <Method float Float.parseFloat(String)>
	//   10   18:fstore_3        
			}
	//*  11   19:fload_3         
	//*  12   20:invokestatic    #77  <Method Float Float.valueOf(float)>
	//*  13   23:areturn         
	//*  14   24:aload_2         
	//*  15   25:areturn         
			// Misplaced declaration of an exception variable
			catch(String s)
	//*  16   26:astore_1        
			{
				return float1;
	//   17   27:aload_2         
	//   18   28:areturn         
			}
			return Float.valueOf(f);
		} else
		{
			return float1;
		}
	}

	public final Integer zza(String s, Integer integer)
	{
		return Integer.valueOf(zzi.getInt(mContentResolver, s, integer.intValue()));
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field ContentResolver mContentResolver>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #84  <Method int Integer.intValue()>
	//    5    9:invokestatic    #88  <Method int zzi.getInt(ContentResolver, String, int)>
	//    6   12:invokestatic    #91  <Method Integer Integer.valueOf(int)>
	//    7   15:areturn         
	}

	public final String zzb(String s, String s1)
	{
		return zzg.zza(mContentResolver, s, s1);
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field ContentResolver mContentResolver>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokestatic    #95  <Method String zzg.zza(ContentResolver, String, String)>
	//    5    9:areturn         
	}

	private final ContentResolver mContentResolver;

	public GservicesValue$zzd(ContentResolver contentresolver)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
		mContentResolver = contentresolver;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #18  <Field ContentResolver mContentResolver>
	//    5    9:return          
	}
}

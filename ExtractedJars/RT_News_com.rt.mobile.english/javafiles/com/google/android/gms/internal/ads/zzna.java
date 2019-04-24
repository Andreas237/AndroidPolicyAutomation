// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzkb, zzng, zzne, zznc, 
//			zznd, zznb, zznf

public abstract class zzna
{

	private zzna(int i, String s, Object obj)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void Object()>
		zzatr = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #20  <Field int zzatr>
		mKey = s;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #22  <Field String mKey>
		mDefaultValue = obj;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #24  <Field Object mDefaultValue>
		zzkb.zzij().zza(this);
	//   11   19:invokestatic    #30  <Method zzng zzkb.zzij()>
	//   12   22:aload_0         
	//   13   23:invokevirtual   #36  <Method void zzng.zza(zzna)>
	//   14   26:return          
	}

	zzna(int i, String s, Object obj, zznb zznb1)
	{
		this(i, s, obj);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:invokespecial   #42  <Method void zzna(int, String, Object)>
	//    5    7:return          
	}

	public static zzna zza(int i, String s)
	{
		s = ((String) (zza(i, s, ((String) (null)))));
	//    0    0:iload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:invokestatic    #46  <Method zzna zza(int, String, String)>
	//    4    6:astore_1        
		zzkb.zzij().zzb(((zzna) (s)));
	//    5    7:invokestatic    #30  <Method zzng zzkb.zzij()>
	//    6   10:aload_1         
	//    7   11:invokevirtual   #49  <Method void zzng.zzb(zzna)>
		return ((zzna) (s));
	//    8   14:aload_1         
	//    9   15:areturn         
	}

	public static zzna zza(int i, String s, float f)
	{
		return ((zzna) (new zzne(i, s, Float.valueOf(f))));
	//    0    0:new             #53  <Class zzne>
	//    1    3:dup             
	//    2    4:iload_0         
	//    3    5:aload_1         
	//    4    6:fload_2         
	//    5    7:invokestatic    #59  <Method Float Float.valueOf(float)>
	//    6   10:invokespecial   #62  <Method void zzne(int, String, Float)>
	//    7   13:areturn         
	}

	public static zzna zza(int i, String s, int j)
	{
		return ((zzna) (new zznc(i, s, Integer.valueOf(j))));
	//    0    0:new             #66  <Class zznc>
	//    1    3:dup             
	//    2    4:iload_0         
	//    3    5:aload_1         
	//    4    6:iload_2         
	//    5    7:invokestatic    #71  <Method Integer Integer.valueOf(int)>
	//    6   10:invokespecial   #74  <Method void zznc(int, String, Integer)>
	//    7   13:areturn         
	}

	public static zzna zza(int i, String s, long l)
	{
		return ((zzna) (new zznd(i, s, Long.valueOf(l))));
	//    0    0:new             #78  <Class zznd>
	//    1    3:dup             
	//    2    4:iload_0         
	//    3    5:aload_1         
	//    4    6:lload_2         
	//    5    7:invokestatic    #83  <Method Long Long.valueOf(long)>
	//    6   10:invokespecial   #86  <Method void zznd(int, String, Long)>
	//    7   13:areturn         
	}

	public static zzna zza(int i, String s, Boolean boolean1)
	{
		return ((zzna) (new zznb(i, s, boolean1)));
	//    0    0:new             #90  <Class zznb>
	//    1    3:dup             
	//    2    4:iload_0         
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:invokespecial   #93  <Method void zznb(int, String, Boolean)>
	//    6   10:areturn         
	}

	public static zzna zza(int i, String s, String s1)
	{
		return ((zzna) (new zznf(i, s, s1)));
	//    0    0:new             #96  <Class zznf>
	//    1    3:dup             
	//    2    4:iload_0         
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:invokespecial   #99  <Method void zznf(int, String, String)>
	//    6   10:areturn         
	}

	public static zzna zzb(int i, String s)
	{
		s = ((String) (zza(i, s, ((String) (null)))));
	//    0    0:iload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:invokestatic    #46  <Method zzna zza(int, String, String)>
	//    4    6:astore_1        
		zzkb.zzij().zzc(((zzna) (s)));
	//    5    7:invokestatic    #30  <Method zzng zzkb.zzij()>
	//    6   10:aload_1         
	//    7   11:invokevirtual   #103 <Method void zzng.zzc(zzna)>
		return ((zzna) (s));
	//    8   14:aload_1         
	//    9   15:areturn         
	}

	public final String getKey()
	{
		return mKey;
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field String mKey>
	//    2    4:areturn         
	}

	public final int getSource()
	{
		return zzatr;
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field int zzatr>
	//    2    4:ireturn         
	}

	protected abstract Object zza(SharedPreferences sharedpreferences);

	public abstract void zza(android.content.SharedPreferences.Editor editor, Object obj);

	protected abstract Object zzb(JSONObject jsonobject);

	public final Object zzja()
	{
		return mDefaultValue;
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field Object mDefaultValue>
	//    2    4:areturn         
	}

	private final Object mDefaultValue;
	private final String mKey;
	private final int zzatr;
}

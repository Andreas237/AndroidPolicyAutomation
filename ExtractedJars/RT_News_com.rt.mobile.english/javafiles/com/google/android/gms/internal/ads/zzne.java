// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzna

final class zzne extends zzna
{

	zzne(int i, String s, Float float1)
	{
		super(i, s, ((Object) (float1)), ((zznb) (null)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:aconst_null     
	//    5    5:invokespecial   #10  <Method void zzna(int, String, Object, zznb)>
	//    6    8:return          
	}

	public final Object zza(SharedPreferences sharedpreferences)
	{
		return ((Object) (Float.valueOf(sharedpreferences.getFloat(((zzna)this).getKey(), ((Float)((zzna)this).zzja()).floatValue()))));
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #17  <Method String zzna.getKey()>
	//    3    5:aload_0         
	//    4    6:invokevirtual   #21  <Method Object zzna.zzja()>
	//    5    9:checkcast       #23  <Class Float>
	//    6   12:invokevirtual   #27  <Method float Float.floatValue()>
	//    7   15:invokeinterface #33  <Method float SharedPreferences.getFloat(String, float)>
	//    8   20:invokestatic    #37  <Method Float Float.valueOf(float)>
	//    9   23:areturn         
	}

	public final void zza(android.content.SharedPreferences.Editor editor, Object obj)
	{
		obj = ((Object) ((Float)obj));
	//    0    0:aload_2         
	//    1    1:checkcast       #23  <Class Float>
	//    2    4:astore_2        
		editor.putFloat(((zzna)this).getKey(), ((Float) (obj)).floatValue());
	//    3    5:aload_1         
	//    4    6:aload_0         
	//    5    7:invokevirtual   #17  <Method String zzna.getKey()>
	//    6   10:aload_2         
	//    7   11:invokevirtual   #27  <Method float Float.floatValue()>
	//    8   14:invokeinterface #44  <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putFloat(String, float)>
	//    9   19:pop             
	//   10   20:return          
	}

	public final Object zzb(JSONObject jsonobject)
	{
		return ((Object) (Float.valueOf((float)jsonobject.optDouble(((zzna)this).getKey(), ((Float)((zzna)this).zzja()).floatValue()))));
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #17  <Method String zzna.getKey()>
	//    3    5:aload_0         
	//    4    6:invokevirtual   #21  <Method Object zzna.zzja()>
	//    5    9:checkcast       #23  <Class Float>
	//    6   12:invokevirtual   #27  <Method float Float.floatValue()>
	//    7   15:f2d             
	//    8   16:invokevirtual   #52  <Method double JSONObject.optDouble(String, double)>
	//    9   19:d2f             
	//   10   20:invokestatic    #37  <Method Float Float.valueOf(float)>
	//   11   23:areturn         
	}
}

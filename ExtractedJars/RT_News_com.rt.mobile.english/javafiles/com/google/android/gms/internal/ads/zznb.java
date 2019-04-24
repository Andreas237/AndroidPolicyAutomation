// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzna

final class zznb extends zzna
{

	zznb(int i, String s, Boolean boolean1)
	{
		super(i, s, ((Object) (boolean1)), ((zznb) (null)));
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
		return ((Object) (Boolean.valueOf(sharedpreferences.getBoolean(((zzna)this).getKey(), ((Boolean)((zzna)this).zzja()).booleanValue()))));
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #17  <Method String zzna.getKey()>
	//    3    5:aload_0         
	//    4    6:invokevirtual   #21  <Method Object zzna.zzja()>
	//    5    9:checkcast       #23  <Class Boolean>
	//    6   12:invokevirtual   #27  <Method boolean Boolean.booleanValue()>
	//    7   15:invokeinterface #33  <Method boolean SharedPreferences.getBoolean(String, boolean)>
	//    8   20:invokestatic    #37  <Method Boolean Boolean.valueOf(boolean)>
	//    9   23:areturn         
	}

	public final void zza(android.content.SharedPreferences.Editor editor, Object obj)
	{
		obj = ((Object) ((Boolean)obj));
	//    0    0:aload_2         
	//    1    1:checkcast       #23  <Class Boolean>
	//    2    4:astore_2        
		editor.putBoolean(((zzna)this).getKey(), ((Boolean) (obj)).booleanValue());
	//    3    5:aload_1         
	//    4    6:aload_0         
	//    5    7:invokevirtual   #17  <Method String zzna.getKey()>
	//    6   10:aload_2         
	//    7   11:invokevirtual   #27  <Method boolean Boolean.booleanValue()>
	//    8   14:invokeinterface #44  <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putBoolean(String, boolean)>
	//    9   19:pop             
	//   10   20:return          
	}

	public final Object zzb(JSONObject jsonobject)
	{
		return ((Object) (Boolean.valueOf(jsonobject.optBoolean(((zzna)this).getKey(), ((Boolean)((zzna)this).zzja()).booleanValue()))));
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #17  <Method String zzna.getKey()>
	//    3    5:aload_0         
	//    4    6:invokevirtual   #21  <Method Object zzna.zzja()>
	//    5    9:checkcast       #23  <Class Boolean>
	//    6   12:invokevirtual   #27  <Method boolean Boolean.booleanValue()>
	//    7   15:invokevirtual   #51  <Method boolean JSONObject.optBoolean(String, boolean)>
	//    8   18:invokestatic    #37  <Method Boolean Boolean.valueOf(boolean)>
	//    9   21:areturn         
	}
}

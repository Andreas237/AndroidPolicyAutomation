// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzna

final class zznf extends zzna
{

	zznf(int i, String s, String s1)
	{
		super(i, s, ((Object) (s1)), ((zznb) (null)));
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
		return ((Object) (sharedpreferences.getString(((zzna)this).getKey(), (String)((zzna)this).zzja())));
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #17  <Method String zzna.getKey()>
	//    3    5:aload_0         
	//    4    6:invokevirtual   #21  <Method Object zzna.zzja()>
	//    5    9:checkcast       #23  <Class String>
	//    6   12:invokeinterface #29  <Method String SharedPreferences.getString(String, String)>
	//    7   17:areturn         
	}

	public final void zza(android.content.SharedPreferences.Editor editor, Object obj)
	{
		obj = ((Object) ((String)obj));
	//    0    0:aload_2         
	//    1    1:checkcast       #23  <Class String>
	//    2    4:astore_2        
		editor.putString(((zzna)this).getKey(), ((String) (obj)));
	//    3    5:aload_1         
	//    4    6:aload_0         
	//    5    7:invokevirtual   #17  <Method String zzna.getKey()>
	//    6   10:aload_2         
	//    7   11:invokeinterface #36  <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putString(String, String)>
	//    8   16:pop             
	//    9   17:return          
	}

	public final Object zzb(JSONObject jsonobject)
	{
		return ((Object) (jsonobject.optString(((zzna)this).getKey(), (String)((zzna)this).zzja())));
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #17  <Method String zzna.getKey()>
	//    3    5:aload_0         
	//    4    6:invokevirtual   #21  <Method Object zzna.zzja()>
	//    5    9:checkcast       #23  <Class String>
	//    6   12:invokevirtual   #43  <Method String JSONObject.optString(String, String)>
	//    7   15:areturn         
	}
}

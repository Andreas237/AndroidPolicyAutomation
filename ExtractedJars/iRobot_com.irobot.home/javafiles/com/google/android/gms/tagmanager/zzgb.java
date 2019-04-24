// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.tagmanager;

import android.content.Context;
import android.os.Looper;

// Referenced classes of package com.google.android.gms.tagmanager:
//			zzy, TagManager, zzal

final class zzgb
	implements TagManager.zza
{

	zzgb()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #10  <Method void Object()>
	//    2    4:return          
	}

	public final zzy zza(Context context, TagManager tagmanager, Looper looper, String s, int i, zzal zzal)
	{
		return new zzy(context, tagmanager, looper, s, i, zzal);
	//    0    0:new             #15  <Class zzy>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:aload_3         
	//    5    7:aload           4
	//    6    9:iload           5
	//    7   11:aload           6
	//    8   13:invokespecial   #18  <Method void zzy(Context, TagManager, Looper, String, int, zzal)>
	//    9   16:areturn         
	}
}

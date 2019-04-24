// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.text.TextUtils;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zznm, zznn

public final class zznp
{

	public zznp()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #10  <Method void Object()>
	//    2    4:return          
	}

	public static void zza(zznn zznn1, zznm zznm1)
	{
		if(zznm1.getContext() == null)
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #20  <Method android.content.Context zznm.getContext()>
	//*   2    4:ifnonnull       17
			throw new IllegalArgumentException("Context can't be null. Please set up context in CsiConfiguration.");
	//    3    7:new             #22  <Class IllegalArgumentException>
	//    4   10:dup             
	//    5   11:ldc1            #24  <String "Context can't be null. Please set up context in CsiConfiguration.">
	//    6   13:invokespecial   #27  <Method void IllegalArgumentException(String)>
	//    7   16:athrow          
		if(TextUtils.isEmpty(((CharSequence) (zznm1.zzfw()))))
	//*   8   17:aload_1         
	//*   9   18:invokevirtual   #31  <Method String zznm.zzfw()>
	//*  10   21:invokestatic    #37  <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  11   24:ifeq            37
		{
			throw new IllegalArgumentException("AfmaVersion can't be null or empty. Please set up afmaVersion in CsiConfiguration.");
	//   12   27:new             #22  <Class IllegalArgumentException>
	//   13   30:dup             
	//   14   31:ldc1            #39  <String "AfmaVersion can't be null or empty. Please set up afmaVersion in CsiConfiguration.">
	//   15   33:invokespecial   #27  <Method void IllegalArgumentException(String)>
	//   16   36:athrow          
		} else
		{
			zznn1.zza(zznm1.getContext(), zznm1.zzfw(), zznm1.zzjd(), zznm1.zzje());
	//   17   37:aload_0         
	//   18   38:aload_1         
	//   19   39:invokevirtual   #20  <Method android.content.Context zznm.getContext()>
	//   20   42:aload_1         
	//   21   43:invokevirtual   #31  <Method String zznm.zzfw()>
	//   22   46:aload_1         
	//   23   47:invokevirtual   #42  <Method String zznm.zzjd()>
	//   24   50:aload_1         
	//   25   51:invokevirtual   #46  <Method java.util.Map zznm.zzje()>
	//   26   54:invokevirtual   #51  <Method void zznn.zza(android.content.Context, String, String, java.util.Map)>
			return;
	//   27   57:return          
		}
	}
}

// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzcg, zzcz, zzds, zzba, 
//			zzax

public final class zzch extends zzcg
{

	private zzch(Context context, String s, boolean flag)
	{
		super(context, s, flag);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:invokespecial   #8   <Method void zzcg(Context, String, boolean)>
	//    5    7:return          
	}

	public static zzch zza(String s, Context context, boolean flag)
	{
		zza(context, flag);
	//    0    0:aload_1         
	//    1    1:iload_2         
	//    2    2:invokestatic    #14  <Method void zza(Context, boolean)>
		return new zzch(context, s, flag);
	//    3    5:new             #2   <Class zzch>
	//    4    8:dup             
	//    5    9:aload_1         
	//    6   10:aload_0         
	//    7   11:iload_2         
	//    8   12:invokespecial   #15  <Method void zzch(Context, String, boolean)>
	//    9   15:areturn         
	}

	protected final List zza(zzcz zzcz1, zzba zzba, zzax zzax)
	{
		if(zzcz1.zzab() != null && zzqt)
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #22  <Method java.util.concurrent.ExecutorService zzcz.zzab()>
	//*   2    4:ifnull          75
	//*   3    7:aload_0         
	//*   4    8:getfield        #26  <Field boolean zzqt>
	//*   5   11:ifne            17
	//*   6   14:goto            75
		{
			int i = zzcz1.zzx();
	//    7   17:aload_1         
	//    8   18:invokevirtual   #30  <Method int zzcz.zzx()>
	//    9   21:istore          4
			ArrayList arraylist = new ArrayList();
	//   10   23:new             #32  <Class ArrayList>
	//   11   26:dup             
	//   12   27:invokespecial   #35  <Method void ArrayList()>
	//   13   30:astore          5
			((List) (arraylist)).addAll(((java.util.Collection) (super.zza(zzcz1, zzba, zzax))));
	//   14   32:aload           5
	//   15   34:aload_0         
	//   16   35:aload_1         
	//   17   36:aload_2         
	//   18   37:aload_3         
	//   19   38:invokespecial   #37  <Method List zzcg.zza(zzcz, zzba, zzax)>
	//   20   41:invokeinterface #43  <Method boolean List.addAll(java.util.Collection)>
	//   21   46:pop             
			((List) (arraylist)).add(((Object) (new zzds(zzcz1, "1QeH3Cf7T53ayw17Ebbo9YTdhU+IFx0X5nCtC5gZQym4uicOVPXxYWmMK9k58i8n", "bHJRpFJ+2R5LAbYQUBDMyfYpLd1oiGixlpIqMJOBQPY=", zzba, i, 24))));
	//   22   47:aload           5
	//   23   49:new             #45  <Class zzds>
	//   24   52:dup             
	//   25   53:aload_1         
	//   26   54:ldc1            #47  <String "1QeH3Cf7T53ayw17Ebbo9YTdhU+IFx0X5nCtC5gZQym4uicOVPXxYWmMK9k58i8n">
	//   27   56:ldc1            #49  <String "bHJRpFJ+2R5LAbYQUBDMyfYpLd1oiGixlpIqMJOBQPY=">
	//   28   58:aload_2         
	//   29   59:iload           4
	//   30   61:bipush          24
	//   31   63:invokespecial   #52  <Method void zzds(zzcz, String, String, zzba, int, int)>
	//   32   66:invokeinterface #56  <Method boolean List.add(Object)>
	//   33   71:pop             
			return ((List) (arraylist));
	//   34   72:aload           5
	//   35   74:areturn         
		} else
		{
			return super.zza(zzcz1, zzba, zzax);
	//   36   75:aload_0         
	//   37   76:aload_1         
	//   38   77:aload_2         
	//   39   78:aload_3         
	//   40   79:invokespecial   #37  <Method List zzcg.zza(zzcz, zzba, zzax)>
	//   41   82:areturn         
		}
	}
}

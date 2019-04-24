// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.tagmanager;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import com.google.android.gms.internal.measurement.zza;
import com.google.android.gms.internal.measurement.zzp;
import java.util.Map;

// Referenced classes of package com.google.android.gms.tagmanager:
//			zzbq, zzgj

final class zzem extends zzbq
{

	public zzem(Context context)
	{
		super(ID, new String[0]);
	//    0    0:aload_0         
	//    1    1:getstatic       #22  <Field String ID>
	//    2    4:iconst_0        
	//    3    5:anewarray       String[]
	//    4    8:invokespecial   #30  <Method void zzbq(String, String[])>
		zzri = context;
	//    5   11:aload_0         
	//    6   12:aload_1         
	//    7   13:putfield        #32  <Field Context zzri>
	//    8   16:return          
	}

	public final zzp zzc(Map map)
	{
		map = ((Map) (new DisplayMetrics()));
	//    0    0:new             #36  <Class DisplayMetrics>
	//    1    3:dup             
	//    2    4:invokespecial   #38  <Method void DisplayMetrics()>
	//    3    7:astore_1        
		((WindowManager)zzri.getSystemService("window")).getDefaultDisplay().getMetrics(((DisplayMetrics) (map)));
	//    4    8:aload_0         
	//    5    9:getfield        #32  <Field Context zzri>
	//    6   12:ldc1            #40  <String "window">
	//    7   14:invokevirtual   #46  <Method Object Context.getSystemService(String)>
	//    8   17:checkcast       #48  <Class WindowManager>
	//    9   20:invokeinterface #52  <Method Display WindowManager.getDefaultDisplay()>
	//   10   25:aload_1         
	//   11   26:invokevirtual   #58  <Method void Display.getMetrics(DisplayMetrics)>
		int i = ((DisplayMetrics) (map)).widthPixels;
	//   12   29:aload_1         
	//   13   30:getfield        #62  <Field int DisplayMetrics.widthPixels>
	//   14   33:istore_2        
		int j = ((DisplayMetrics) (map)).heightPixels;
	//   15   34:aload_1         
	//   16   35:getfield        #65  <Field int DisplayMetrics.heightPixels>
	//   17   38:istore_3        
		map = ((Map) (new StringBuilder(23)));
	//   18   39:new             #67  <Class StringBuilder>
	//   19   42:dup             
	//   20   43:bipush          23
	//   21   45:invokespecial   #70  <Method void StringBuilder(int)>
	//   22   48:astore_1        
		((StringBuilder) (map)).append(i);
	//   23   49:aload_1         
	//   24   50:iload_2         
	//   25   51:invokevirtual   #74  <Method StringBuilder StringBuilder.append(int)>
	//   26   54:pop             
		((StringBuilder) (map)).append("x");
	//   27   55:aload_1         
	//   28   56:ldc1            #76  <String "x">
	//   29   58:invokevirtual   #79  <Method StringBuilder StringBuilder.append(String)>
	//   30   61:pop             
		((StringBuilder) (map)).append(j);
	//   31   62:aload_1         
	//   32   63:iload_3         
	//   33   64:invokevirtual   #74  <Method StringBuilder StringBuilder.append(int)>
	//   34   67:pop             
		return zzgj.zzj(((Object) (((StringBuilder) (map)).toString())));
	//   35   68:aload_1         
	//   36   69:invokevirtual   #80  <Method String StringBuilder.toString()>
	//   37   72:invokestatic    #86  <Method zzp zzgj.zzj(Object)>
	//   38   75:areturn         
	}

	public final boolean zznk()
	{
		return true;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	private static final String ID;
	private final Context zzri;

	static 
	{
		ID = zza.zzab.toString();
	//    0    0:getstatic       #16  <Field zza zza.zzab>
	//    1    3:invokevirtual   #20  <Method String zza.toString()>
	//    2    6:putstatic       #22  <Field String ID>
	//*   3    9:return          
	}
}

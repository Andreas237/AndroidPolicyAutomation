// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.tagmanager;

import android.os.Build;
import com.google.android.gms.internal.measurement.zza;
import com.google.android.gms.internal.measurement.zzp;
import java.util.Map;

// Referenced classes of package com.google.android.gms.tagmanager:
//			zzbq, zzgj

final class zzbd extends zzbq
{

	public zzbd()
	{
		super(ID, new String[0]);
	//    0    0:aload_0         
	//    1    1:getstatic       #20  <Field String ID>
	//    2    4:iconst_0        
	//    3    5:anewarray       String[]
	//    4    8:invokespecial   #27  <Method void zzbq(String, String[])>
	//    5   11:return          
	}

	public final zzp zzc(Map map)
	{
		String s1 = Build.MANUFACTURER;
	//    0    0:getstatic       #34  <Field String Build.MANUFACTURER>
	//    1    3:astore_3        
		String s = Build.MODEL;
	//    2    4:getstatic       #37  <Field String Build.MODEL>
	//    3    7:astore_2        
		map = ((Map) (s));
	//    4    8:aload_2         
	//    5    9:astore_1        
		if(!s.startsWith(s1))
	//*   6   10:aload_2         
	//*   7   11:aload_3         
	//*   8   12:invokevirtual   #41  <Method boolean String.startsWith(String)>
	//*   9   15:ifne            78
		{
			map = ((Map) (s));
	//   10   18:aload_2         
	//   11   19:astore_1        
			if(!s1.equals("unknown"))
	//*  12   20:aload_3         
	//*  13   21:ldc1            #43  <String "unknown">
	//*  14   23:invokevirtual   #47  <Method boolean String.equals(Object)>
	//*  15   26:ifne            78
			{
				map = ((Map) (new StringBuilder(String.valueOf(((Object) (s1))).length() + 1 + String.valueOf(((Object) (s))).length())));
	//   16   29:new             #49  <Class StringBuilder>
	//   17   32:dup             
	//   18   33:aload_3         
	//   19   34:invokestatic    #53  <Method String String.valueOf(Object)>
	//   20   37:invokevirtual   #57  <Method int String.length()>
	//   21   40:iconst_1        
	//   22   41:iadd            
	//   23   42:aload_2         
	//   24   43:invokestatic    #53  <Method String String.valueOf(Object)>
	//   25   46:invokevirtual   #57  <Method int String.length()>
	//   26   49:iadd            
	//   27   50:invokespecial   #60  <Method void StringBuilder(int)>
	//   28   53:astore_1        
				((StringBuilder) (map)).append(s1);
	//   29   54:aload_1         
	//   30   55:aload_3         
	//   31   56:invokevirtual   #64  <Method StringBuilder StringBuilder.append(String)>
	//   32   59:pop             
				((StringBuilder) (map)).append(" ");
	//   33   60:aload_1         
	//   34   61:ldc1            #66  <String " ">
	//   35   63:invokevirtual   #64  <Method StringBuilder StringBuilder.append(String)>
	//   36   66:pop             
				((StringBuilder) (map)).append(s);
	//   37   67:aload_1         
	//   38   68:aload_2         
	//   39   69:invokevirtual   #64  <Method StringBuilder StringBuilder.append(String)>
	//   40   72:pop             
				map = ((Map) (((StringBuilder) (map)).toString()));
	//   41   73:aload_1         
	//   42   74:invokevirtual   #67  <Method String StringBuilder.toString()>
	//   43   77:astore_1        
			}
		}
		return zzgj.zzj(((Object) (map)));
	//   44   78:aload_1         
	//   45   79:invokestatic    #73  <Method zzp zzgj.zzj(Object)>
	//   46   82:areturn         
	}

	public final boolean zznk()
	{
		return true;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	private static final String ID;

	static 
	{
		ID = zza.zzl.toString();
	//    0    0:getstatic       #14  <Field zza zza.zzl>
	//    1    3:invokevirtual   #18  <Method String zza.toString()>
	//    2    6:putstatic       #20  <Field String ID>
	//*   3    9:return          
	}
}

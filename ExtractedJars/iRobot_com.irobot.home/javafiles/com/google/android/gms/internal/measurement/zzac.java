// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.measurement;

import android.text.TextUtils;
import com.google.android.gms.analytics.zzi;
import java.util.HashMap;
import java.util.Map;

public final class zzac extends zzi
{

	public zzac()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void zzi()>
	//    2    4:return          
	}

	public final String getLanguage()
	{
		return zzuf;
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field String zzuf>
	//    2    4:areturn         
	}

	public final void setLanguage(String s)
	{
		zzuf = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #24  <Field String zzuf>
	//    3    5:return          
	}

	public final String toString()
	{
		HashMap hashmap = new HashMap();
	//    0    0:new             #29  <Class HashMap>
	//    1    3:dup             
	//    2    4:invokespecial   #30  <Method void HashMap()>
	//    3    7:astore_1        
		((Map) (hashmap)).put("language", ((Object) (zzuf)));
	//    4    8:aload_1         
	//    5    9:ldc1            #32  <String "language">
	//    6   11:aload_0         
	//    7   12:getfield        #24  <Field String zzuf>
	//    8   15:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//    9   20:pop             
		((Map) (hashmap)).put("screenColors", ((Object) (Integer.valueOf(zzug))));
	//   10   21:aload_1         
	//   11   22:ldc1            #40  <String "screenColors">
	//   12   24:aload_0         
	//   13   25:getfield        #42  <Field int zzug>
	//   14   28:invokestatic    #48  <Method Integer Integer.valueOf(int)>
	//   15   31:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//   16   36:pop             
		((Map) (hashmap)).put("screenWidth", ((Object) (Integer.valueOf(zzuh))));
	//   17   37:aload_1         
	//   18   38:ldc1            #50  <String "screenWidth">
	//   19   40:aload_0         
	//   20   41:getfield        #52  <Field int zzuh>
	//   21   44:invokestatic    #48  <Method Integer Integer.valueOf(int)>
	//   22   47:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//   23   52:pop             
		((Map) (hashmap)).put("screenHeight", ((Object) (Integer.valueOf(zzui))));
	//   24   53:aload_1         
	//   25   54:ldc1            #54  <String "screenHeight">
	//   26   56:aload_0         
	//   27   57:getfield        #56  <Field int zzui>
	//   28   60:invokestatic    #48  <Method Integer Integer.valueOf(int)>
	//   29   63:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//   30   68:pop             
		((Map) (hashmap)).put("viewportWidth", ((Object) (Integer.valueOf(zzuj))));
	//   31   69:aload_1         
	//   32   70:ldc1            #58  <String "viewportWidth">
	//   33   72:aload_0         
	//   34   73:getfield        #60  <Field int zzuj>
	//   35   76:invokestatic    #48  <Method Integer Integer.valueOf(int)>
	//   36   79:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//   37   84:pop             
		((Map) (hashmap)).put("viewportHeight", ((Object) (Integer.valueOf(zzuk))));
	//   38   85:aload_1         
	//   39   86:ldc1            #62  <String "viewportHeight">
	//   40   88:aload_0         
	//   41   89:getfield        #64  <Field int zzuk>
	//   42   92:invokestatic    #48  <Method Integer Integer.valueOf(int)>
	//   43   95:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//   44  100:pop             
		return zza(((Object) (hashmap)));
	//   45  101:aload_1         
	//   46  102:invokestatic    #68  <Method String zza(Object)>
	//   47  105:areturn         
	}

	public final void zzb(zzi zzi1)
	{
		zzi1 = ((zzi) ((zzac)zzi1));
	//    0    0:aload_1         
	//    1    1:checkcast       #2   <Class zzac>
	//    2    4:astore_1        
		if(zzug != 0)
	//*   3    5:aload_0         
	//*   4    6:getfield        #42  <Field int zzug>
	//*   5    9:ifeq            20
			zzi1.zzug = zzug;
	//    6   12:aload_1         
	//    7   13:aload_0         
	//    8   14:getfield        #42  <Field int zzug>
	//    9   17:putfield        #42  <Field int zzug>
		if(zzuh != 0)
	//*  10   20:aload_0         
	//*  11   21:getfield        #52  <Field int zzuh>
	//*  12   24:ifeq            35
			zzi1.zzuh = zzuh;
	//   13   27:aload_1         
	//   14   28:aload_0         
	//   15   29:getfield        #52  <Field int zzuh>
	//   16   32:putfield        #52  <Field int zzuh>
		if(zzui != 0)
	//*  17   35:aload_0         
	//*  18   36:getfield        #56  <Field int zzui>
	//*  19   39:ifeq            50
			zzi1.zzui = zzui;
	//   20   42:aload_1         
	//   21   43:aload_0         
	//   22   44:getfield        #56  <Field int zzui>
	//   23   47:putfield        #56  <Field int zzui>
		if(zzuj != 0)
	//*  24   50:aload_0         
	//*  25   51:getfield        #60  <Field int zzuj>
	//*  26   54:ifeq            65
			zzi1.zzuj = zzuj;
	//   27   57:aload_1         
	//   28   58:aload_0         
	//   29   59:getfield        #60  <Field int zzuj>
	//   30   62:putfield        #60  <Field int zzuj>
		if(zzuk != 0)
	//*  31   65:aload_0         
	//*  32   66:getfield        #64  <Field int zzuk>
	//*  33   69:ifeq            80
			zzi1.zzuk = zzuk;
	//   34   72:aload_1         
	//   35   73:aload_0         
	//   36   74:getfield        #64  <Field int zzuk>
	//   37   77:putfield        #64  <Field int zzuk>
		if(!TextUtils.isEmpty(((CharSequence) (zzuf))))
	//*  38   80:aload_0         
	//*  39   81:getfield        #24  <Field String zzuf>
	//*  40   84:invokestatic    #76  <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  41   87:ifne            98
			zzi1.zzuf = zzuf;
	//   42   90:aload_1         
	//   43   91:aload_0         
	//   44   92:getfield        #24  <Field String zzuf>
	//   45   95:putfield        #24  <Field String zzuf>
	//   46   98:return          
	}

	private String zzuf;
	public int zzug;
	public int zzuh;
	public int zzui;
	public int zzuj;
	public int zzuk;
}

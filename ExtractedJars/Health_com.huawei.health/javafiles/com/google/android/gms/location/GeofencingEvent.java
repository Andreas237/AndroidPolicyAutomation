// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.location;

import android.content.Intent;
import android.location.Location;
import com.google.android.gms.internal.zzasm;
import java.util.*;

public class GeofencingEvent
{

	private GeofencingEvent(int i, int j, List list, Location location)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
		zzPY = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #19  <Field int zzPY>
		zzbjL = j;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #21  <Field int zzbjL>
		zzbjM = list;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #23  <Field List zzbjM>
		zzbjN = location;
	//   11   19:aload_0         
	//   12   20:aload           4
	//   13   22:putfield        #25  <Field Location zzbjN>
	//   14   25:return          
	}

	public static GeofencingEvent fromIntent(Intent intent)
	{
		if(intent == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		else
			return new GeofencingEvent(intent.getIntExtra("gms_error_code", -1), zzx(intent), zzy(intent), (Location)intent.getParcelableExtra("com.google.android.location.intent.extra.triggering_location"));
	//    4    6:new             #2   <Class GeofencingEvent>
	//    5    9:dup             
	//    6   10:aload_0         
	//    7   11:ldc1            #32  <String "gms_error_code">
	//    8   13:iconst_m1       
	//    9   14:invokevirtual   #38  <Method int Intent.getIntExtra(String, int)>
	//   10   17:aload_0         
	//   11   18:invokestatic    #42  <Method int zzx(Intent)>
	//   12   21:aload_0         
	//   13   22:invokestatic    #46  <Method List zzy(Intent)>
	//   14   25:aload_0         
	//   15   26:ldc1            #48  <String "com.google.android.location.intent.extra.triggering_location">
	//   16   28:invokevirtual   #52  <Method android.os.Parcelable Intent.getParcelableExtra(String)>
	//   17   31:checkcast       #54  <Class Location>
	//   18   34:invokespecial   #56  <Method void GeofencingEvent(int, int, List, Location)>
	//   19   37:areturn         
	}

	private static int zzx(Intent intent)
	{
		int i = intent.getIntExtra("com.google.android.location.intent.extra.transition", -1);
	//    0    0:aload_0         
	//    1    1:ldc1            #58  <String "com.google.android.location.intent.extra.transition">
	//    2    3:iconst_m1       
	//    3    4:invokevirtual   #38  <Method int Intent.getIntExtra(String, int)>
	//    4    7:istore_1        
		if(i == -1)
	//*   5    8:iload_1         
	//*   6    9:iconst_m1       
	//*   7   10:icmpne          15
			return -1;
	//    8   13:iconst_m1       
	//    9   14:ireturn         
		if(i == 1 || i == 2 || i == 4)
	//*  10   15:iload_1         
	//*  11   16:iconst_1        
	//*  12   17:icmpeq          30
	//*  13   20:iload_1         
	//*  14   21:iconst_2        
	//*  15   22:icmpeq          30
	//*  16   25:iload_1         
	//*  17   26:iconst_4        
	//*  18   27:icmpne          32
			return i;
	//   19   30:iload_1         
	//   20   31:ireturn         
		else
			return -1;
	//   21   32:iconst_m1       
	//   22   33:ireturn         
	}

	private static List zzy(Intent intent)
	{
		Object obj = ((Object) ((ArrayList)intent.getSerializableExtra("com.google.android.location.intent.extra.geofence_list")));
	//    0    0:aload_0         
	//    1    1:ldc1            #60  <String "com.google.android.location.intent.extra.geofence_list">
	//    2    3:invokevirtual   #64  <Method java.io.Serializable Intent.getSerializableExtra(String)>
	//    3    6:checkcast       #66  <Class ArrayList>
	//    4    9:astore_1        
		if(obj == null)
	//*   5   10:aload_1         
	//*   6   11:ifnonnull       16
			return null;
	//    7   14:aconst_null     
	//    8   15:areturn         
		intent = ((Intent) (new ArrayList(((ArrayList) (obj)).size())));
	//    9   16:new             #66  <Class ArrayList>
	//   10   19:dup             
	//   11   20:aload_1         
	//   12   21:invokevirtual   #70  <Method int ArrayList.size()>
	//   13   24:invokespecial   #73  <Method void ArrayList(int)>
	//   14   27:astore_0        
		for(obj = ((Object) (((ArrayList) (obj)).iterator())); ((Iterator) (obj)).hasNext(); ((ArrayList) (intent)).add(((Object) (zzasm.zzw((byte[])((Iterator) (obj)).next())))));
	//   15   28:aload_1         
	//   16   29:invokevirtual   #77  <Method Iterator ArrayList.iterator()>
	//   17   32:astore_1        
	//   18   33:aload_1         
	//   19   34:invokeinterface #83  <Method boolean Iterator.hasNext()>
	//   20   39:ifeq            62
	//   21   42:aload_0         
	//   22   43:aload_1         
	//   23   44:invokeinterface #87  <Method Object Iterator.next()>
	//   24   49:checkcast       #89  <Class byte[]>
	//   25   52:invokestatic    #95  <Method zzasm zzasm.zzw(byte[])>
	//   26   55:invokevirtual   #99  <Method boolean ArrayList.add(Object)>
	//   27   58:pop             
	//*  28   59:goto            33
		return ((List) (intent));
	//   29   62:aload_0         
	//   30   63:areturn         
	}

	public int getErrorCode()
	{
		return zzPY;
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field int zzPY>
	//    2    4:ireturn         
	}

	public int getGeofenceTransition()
	{
		return zzbjL;
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field int zzbjL>
	//    2    4:ireturn         
	}

	public List getTriggeringGeofences()
	{
		return zzbjM;
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field List zzbjM>
	//    2    4:areturn         
	}

	public Location getTriggeringLocation()
	{
		return zzbjN;
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field Location zzbjN>
	//    2    4:areturn         
	}

	public boolean hasError()
	{
		return zzPY != -1;
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field int zzPY>
	//    2    4:iconst_m1       
	//    3    5:icmpeq          10
	//    4    8:iconst_1        
	//    5    9:ireturn         
	//    6   10:iconst_0        
	//    7   11:ireturn         
	}

	private final int zzPY;
	private final int zzbjL;
	private final List zzbjM;
	private final Location zzbjN;
}

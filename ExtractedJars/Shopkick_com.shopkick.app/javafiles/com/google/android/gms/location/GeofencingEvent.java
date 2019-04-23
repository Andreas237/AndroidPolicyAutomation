// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.location;

import android.content.Intent;
import android.location.Location;
import com.google.android.gms.internal.location.zzbh;
import java.util.ArrayList;
import java.util.List;

public class GeofencingEvent
{

	private GeofencingEvent(int i, int j, List list, Location location)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
		errorCode = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #19  <Field int errorCode>
		zzam = j;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #21  <Field int zzam>
		zzan = list;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #23  <Field List zzan>
		zzao = location;
	//   11   19:aload_0         
	//   12   20:aload           4
	//   13   22:putfield        #25  <Field Location zzao>
	//   14   25:return          
	}

	public static GeofencingEvent fromIntent(Intent intent)
	{
		int i;
		int i1;
		Object obj;
label0:
		{
			obj = null;
	//    0    0:aconst_null     
	//    1    1:astore          5
			if(intent == null)
	//*   2    3:aload_0         
	//*   3    4:ifnonnull       9
				return null;
	//    4    7:aconst_null     
	//    5    8:areturn         
			byte byte0 = -1;
	//    6    9:iconst_m1       
	//    7   10:istore_2        
			i1 = intent.getIntExtra("gms_error_code", -1);
	//    8   11:aload_0         
	//    9   12:ldc1            #32  <String "gms_error_code">
	//   10   14:iconst_m1       
	//   11   15:invokevirtual   #38  <Method int Intent.getIntExtra(String, int)>
	//   12   18:istore          4
			int k = intent.getIntExtra("com.google.android.location.intent.extra.transition", -1);
	//   13   20:aload_0         
	//   14   21:ldc1            #40  <String "com.google.android.location.intent.extra.transition">
	//   15   23:iconst_m1       
	//   16   24:invokevirtual   #38  <Method int Intent.getIntExtra(String, int)>
	//   17   27:istore_3        
			i = ((int) (byte0));
	//   18   28:iload_2         
	//   19   29:istore_1        
			if(k == -1)
				break label0;
	//   20   30:iload_3         
	//   21   31:iconst_m1       
	//   22   32:icmpeq          54
			if(k != 1 && k != 2)
	//*  23   35:iload_3         
	//*  24   36:iconst_1        
	//*  25   37:icmpeq          52
	//*  26   40:iload_3         
	//*  27   41:iconst_2        
	//*  28   42:icmpeq          52
			{
				i = ((int) (byte0));
	//   29   45:iload_2         
	//   30   46:istore_1        
				if(k != 4)
					break label0;
	//   31   47:iload_3         
	//   32   48:iconst_4        
	//   33   49:icmpne          54
			}
			i = k;
	//   34   52:iload_3         
	//   35   53:istore_1        
		}
		ArrayList arraylist1 = (ArrayList)intent.getSerializableExtra("com.google.android.location.intent.extra.geofence_list");
	//   36   54:aload_0         
	//   37   55:ldc1            #42  <String "com.google.android.location.intent.extra.geofence_list">
	//   38   57:invokevirtual   #46  <Method java.io.Serializable Intent.getSerializableExtra(String)>
	//   39   60:checkcast       #48  <Class ArrayList>
	//   40   63:astore          7
		if(arraylist1 != null)
	//*  41   65:aload           7
	//*  42   67:ifnonnull       73
	//*  43   70:goto            140
		{
			ArrayList arraylist = new ArrayList(arraylist1.size());
	//   44   73:new             #48  <Class ArrayList>
	//   45   76:dup             
	//   46   77:aload           7
	//   47   79:invokevirtual   #52  <Method int ArrayList.size()>
	//   48   82:invokespecial   #55  <Method void ArrayList(int)>
	//   49   85:astore          6
			arraylist1 = (ArrayList)arraylist1;
	//   50   87:aload           7
	//   51   89:checkcast       #48  <Class ArrayList>
	//   52   92:astore          7
			int l = arraylist1.size();
	//   53   94:aload           7
	//   54   96:invokevirtual   #52  <Method int ArrayList.size()>
	//   55   99:istore_3        
			int j = 0;
	//   56  100:iconst_0        
	//   57  101:istore_2        
			do
			{
				obj = ((Object) (arraylist));
	//   58  102:aload           6
	//   59  104:astore          5
				if(j >= l)
					break;
	//   60  106:iload_2         
	//   61  107:iload_3         
	//   62  108:icmpge          140
				obj = arraylist1.get(j);
	//   63  111:aload           7
	//   64  113:iload_2         
	//   65  114:invokevirtual   #59  <Method Object ArrayList.get(int)>
	//   66  117:astore          5
				j++;
	//   67  119:iload_2         
	//   68  120:iconst_1        
	//   69  121:iadd            
	//   70  122:istore_2        
				arraylist.add(((Object) (zzbh.zza((byte[])obj))));
	//   71  123:aload           6
	//   72  125:aload           5
	//   73  127:checkcast       #61  <Class byte[]>
	//   74  130:invokestatic    #67  <Method zzbh zzbh.zza(byte[])>
	//   75  133:invokevirtual   #71  <Method boolean ArrayList.add(Object)>
	//   76  136:pop             
			} while(true);
	//   77  137:goto            102
		}
		return new GeofencingEvent(i1, i, ((List) (obj)), (Location)intent.getParcelableExtra("com.google.android.location.intent.extra.triggering_location"));
	//   78  140:new             #2   <Class GeofencingEvent>
	//   79  143:dup             
	//   80  144:iload           4
	//   81  146:iload_1         
	//   82  147:aload           5
	//   83  149:aload_0         
	//   84  150:ldc1            #73  <String "com.google.android.location.intent.extra.triggering_location">
	//   85  152:invokevirtual   #77  <Method android.os.Parcelable Intent.getParcelableExtra(String)>
	//   86  155:checkcast       #79  <Class Location>
	//   87  158:invokespecial   #81  <Method void GeofencingEvent(int, int, List, Location)>
	//   88  161:areturn         
	}

	public int getErrorCode()
	{
		return errorCode;
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field int errorCode>
	//    2    4:ireturn         
	}

	public int getGeofenceTransition()
	{
		return zzam;
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field int zzam>
	//    2    4:ireturn         
	}

	public List getTriggeringGeofences()
	{
		return zzan;
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field List zzan>
	//    2    4:areturn         
	}

	public Location getTriggeringLocation()
	{
		return zzao;
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field Location zzao>
	//    2    4:areturn         
	}

	public boolean hasError()
	{
		return errorCode != -1;
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field int errorCode>
	//    2    4:iconst_m1       
	//    3    5:icmpeq          10
	//    4    8:iconst_1        
	//    5    9:ireturn         
	//    6   10:iconst_0        
	//    7   11:ireturn         
	}

	private final int errorCode;
	private final int zzam;
	private final List zzan;
	private final Location zzao;
}

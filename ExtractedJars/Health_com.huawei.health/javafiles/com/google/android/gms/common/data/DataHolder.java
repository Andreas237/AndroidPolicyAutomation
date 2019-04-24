// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.data;

import android.content.ContentValues;
import android.database.*;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.util.Log;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.zzac;
import com.google.android.gms.common.internal.zzc;
import java.io.Closeable;
import java.util.*;

// Referenced classes of package com.google.android.gms.common.data:
//			zze

public final class DataHolder extends com.google.android.gms.common.internal.safeparcel.zza
	implements Closeable
{
	public static class zza
	{

		static String[] zza(zza zza1)
		{
			return zza1.zzaDP;
		//    0    0:aload_0         
		//    1    1:getfield        #34  <Field String[] zzaDP>
		//    2    4:areturn         
		}

		private int zzb(HashMap hashmap)
		{
			if(zzaDY == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #41  <Field String zzaDY>
		//*   2    4:ifnonnull       9
				return -1;
		//    3    7:iconst_m1       
		//    4    8:ireturn         
			hashmap = ((HashMap) (hashmap.get(((Object) (zzaDY)))));
		//    5    9:aload_1         
		//    6   10:aload_0         
		//    7   11:getfield        #41  <Field String zzaDY>
		//    8   14:invokevirtual   #60  <Method Object HashMap.get(Object)>
		//    9   17:astore_1        
			if(hashmap == null)
		//*  10   18:aload_1         
		//*  11   19:ifnonnull       24
				return -1;
		//   12   22:iconst_m1       
		//   13   23:ireturn         
			Integer integer = (Integer)zzaDZ.get(((Object) (hashmap)));
		//   14   24:aload_0         
		//   15   25:getfield        #46  <Field HashMap zzaDZ>
		//   16   28:aload_1         
		//   17   29:invokevirtual   #60  <Method Object HashMap.get(Object)>
		//   18   32:checkcast       #62  <Class Integer>
		//   19   35:astore_2        
			if(integer == null)
		//*  20   36:aload_2         
		//*  21   37:ifnonnull       61
			{
				zzaDZ.put(((Object) (hashmap)), ((Object) (Integer.valueOf(zzaDX.size()))));
		//   22   40:aload_0         
		//   23   41:getfield        #46  <Field HashMap zzaDZ>
		//   24   44:aload_1         
		//   25   45:aload_0         
		//   26   46:getfield        #39  <Field ArrayList zzaDX>
		//   27   49:invokevirtual   #66  <Method int ArrayList.size()>
		//   28   52:invokestatic    #70  <Method Integer Integer.valueOf(int)>
		//   29   55:invokevirtual   #74  <Method Object HashMap.put(Object, Object)>
		//   30   58:pop             
				return -1;
		//   31   59:iconst_m1       
		//   32   60:ireturn         
			} else
			{
				return integer.intValue();
		//   33   61:aload_2         
		//   34   62:invokevirtual   #77  <Method int Integer.intValue()>
		//   35   65:ireturn         
			}
		}

		static ArrayList zzb(zza zza1)
		{
			return zza1.zzaDX;
		//    0    0:aload_0         
		//    1    1:getfield        #39  <Field ArrayList zzaDX>
		//    2    4:areturn         
		}

		public zza zza(ContentValues contentvalues)
		{
			com.google.android.gms.common.internal.zzc.zzt(((Object) (contentvalues)));
		//    0    0:aload_1         
		//    1    1:invokestatic    #87  <Method void zzc.zzt(Object)>
			HashMap hashmap = new HashMap(contentvalues.size());
		//    2    4:new             #43  <Class HashMap>
		//    3    7:dup             
		//    4    8:aload_1         
		//    5    9:invokevirtual   #90  <Method int ContentValues.size()>
		//    6   12:invokespecial   #93  <Method void HashMap(int)>
		//    7   15:astore_2        
			java.util.Map.Entry entry;
			for(contentvalues = ((ContentValues) (contentvalues.valueSet().iterator())); ((Iterator) (contentvalues)).hasNext(); hashmap.put(((Object) ((String)entry.getKey())), entry.getValue()))
		//*   8   16:aload_1         
		//*   9   17:invokevirtual   #97  <Method Set ContentValues.valueSet()>
		//*  10   20:invokeinterface #103 <Method Iterator Set.iterator()>
		//*  11   25:astore_1        
		//*  12   26:aload_1         
		//*  13   27:invokeinterface #109 <Method boolean Iterator.hasNext()>
		//*  14   32:ifeq            68
				entry = (java.util.Map.Entry)((Iterator) (contentvalues)).next();
		//   15   35:aload_1         
		//   16   36:invokeinterface #113 <Method Object Iterator.next()>
		//   17   41:checkcast       #115 <Class java.util.Map$Entry>
		//   18   44:astore_3        

		//   19   45:aload_2         
		//   20   46:aload_3         
		//   21   47:invokeinterface #118 <Method Object java.util.Map$Entry.getKey()>
		//   22   52:checkcast       #120 <Class String>
		//   23   55:aload_3         
		//   24   56:invokeinterface #123 <Method Object java.util.Map$Entry.getValue()>
		//   25   61:invokevirtual   #74  <Method Object HashMap.put(Object, Object)>
		//   26   64:pop             
		//*  27   65:goto            26
			return zza(hashmap);
		//   28   68:aload_0         
		//   29   69:aload_2         
		//   30   70:invokevirtual   #126 <Method DataHolder$zza zza(HashMap)>
		//   31   73:areturn         
		}

		public zza zza(HashMap hashmap)
		{
			com.google.android.gms.common.internal.zzc.zzt(((Object) (hashmap)));
		//    0    0:aload_1         
		//    1    1:invokestatic    #87  <Method void zzc.zzt(Object)>
			int i = zzb(hashmap);
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:invokespecial   #128 <Method int zzb(HashMap)>
		//    5    9:istore_2        
			if(i == -1)
		//*   6   10:iload_2         
		//*   7   11:iconst_m1       
		//*   8   12:icmpne          27
			{
				zzaDX.add(((Object) (hashmap)));
		//    9   15:aload_0         
		//   10   16:getfield        #39  <Field ArrayList zzaDX>
		//   11   19:aload_1         
		//   12   20:invokevirtual   #132 <Method boolean ArrayList.add(Object)>
		//   13   23:pop             
			} else
		//*  14   24:goto            45
			{
				zzaDX.remove(i);
		//   15   27:aload_0         
		//   16   28:getfield        #39  <Field ArrayList zzaDX>
		//   17   31:iload_2         
		//   18   32:invokevirtual   #136 <Method Object ArrayList.remove(int)>
		//   19   35:pop             
				zzaDX.add(i, ((Object) (hashmap)));
		//   20   36:aload_0         
		//   21   37:getfield        #39  <Field ArrayList zzaDX>
		//   22   40:iload_2         
		//   23   41:aload_1         
		//   24   42:invokevirtual   #139 <Method void ArrayList.add(int, Object)>
			}
			zzaEa = false;
		//   25   45:aload_0         
		//   26   46:iconst_0        
		//   27   47:putfield        #48  <Field boolean zzaEa>
			return this;
		//   28   50:aload_0         
		//   29   51:areturn         
		}

		public DataHolder zzcK(int i)
		{
			return new DataHolder(this, i, ((Bundle) (null)));
		//    0    0:new             #6   <Class DataHolder>
		//    1    3:dup             
		//    2    4:aload_0         
		//    3    5:iload_1         
		//    4    6:aconst_null     
		//    5    7:aconst_null     
		//    6    8:invokespecial   #145 <Method void DataHolder(DataHolder$zza, int, Bundle, DataHolder$1)>
		//    7   11:areturn         
		}

		private final String zzaDP[];
		private final ArrayList zzaDX;
		private final String zzaDY;
		private final HashMap zzaDZ;
		private boolean zzaEa;
		private String zzaEb;

		private zza(String as[], String s)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #25  <Method void Object()>
			zzaDP = (String[])zzac.zzw(((Object) (as)));
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:invokestatic    #31  <Method Object zzac.zzw(Object)>
		//    5    9:checkcast       #32  <Class String[]>
		//    6   12:putfield        #34  <Field String[] zzaDP>
			zzaDX = new ArrayList();
		//    7   15:aload_0         
		//    8   16:new             #36  <Class ArrayList>
		//    9   19:dup             
		//   10   20:invokespecial   #37  <Method void ArrayList()>
		//   11   23:putfield        #39  <Field ArrayList zzaDX>
			zzaDY = s;
		//   12   26:aload_0         
		//   13   27:aload_2         
		//   14   28:putfield        #41  <Field String zzaDY>
			zzaDZ = new HashMap();
		//   15   31:aload_0         
		//   16   32:new             #43  <Class HashMap>
		//   17   35:dup             
		//   18   36:invokespecial   #44  <Method void HashMap()>
		//   19   39:putfield        #46  <Field HashMap zzaDZ>
			zzaEa = false;
		//   20   42:aload_0         
		//   21   43:iconst_0        
		//   22   44:putfield        #48  <Field boolean zzaEa>
			zzaEb = null;
		//   23   47:aload_0         
		//   24   48:aconst_null     
		//   25   49:putfield        #50  <Field String zzaEb>
		//   26   52:return          
		}

	}

	public static class zzb extends RuntimeException
	{

		public zzb(String s)
		{
			super(s);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #11  <Method void RuntimeException(String)>
		//    3    5:return          
		}
	}


	DataHolder(int i, String as[], CursorWindow acursorwindow[], int j, Bundle bundle)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #55  <Method void zza()>
		mClosed = false;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #57  <Field boolean mClosed>
		zzaDV = true;
	//    5    9:aload_0         
	//    6   10:iconst_1        
	//    7   11:putfield        #59  <Field boolean zzaDV>
		zzaiI = i;
	//    8   14:aload_0         
	//    9   15:iload_1         
	//   10   16:putfield        #61  <Field int zzaiI>
		zzaDP = as;
	//   11   19:aload_0         
	//   12   20:aload_2         
	//   13   21:putfield        #63  <Field String[] zzaDP>
		zzaDR = acursorwindow;
	//   14   24:aload_0         
	//   15   25:aload_3         
	//   16   26:putfield        #65  <Field CursorWindow[] zzaDR>
		zzavD = j;
	//   17   29:aload_0         
	//   18   30:iload           4
	//   19   32:putfield        #67  <Field int zzavD>
		zzaDS = bundle;
	//   20   35:aload_0         
	//   21   36:aload           5
	//   22   38:putfield        #69  <Field Bundle zzaDS>
	//   23   41:return          
	}

	private DataHolder(zza zza1, int i, Bundle bundle)
	{
		this(com.google.android.gms.common.data.zza.zza(zza1), zza(zza1, -1), i, bundle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #73  <Method String[] com.google.android.gms.common.data.DataHolder$zza.zza(DataHolder$zza)>
	//    3    5:aload_1         
	//    4    6:iconst_m1       
	//    5    7:invokestatic    #76  <Method CursorWindow[] zza(DataHolder$zza, int)>
	//    6   10:iload_2         
	//    7   11:aload_3         
	//    8   12:invokespecial   #79  <Method void DataHolder(String[], CursorWindow[], int, Bundle)>
	//    9   15:return          
	}


	public DataHolder(String as[], CursorWindow acursorwindow[], int i, Bundle bundle)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #55  <Method void zza()>
		mClosed = false;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #57  <Field boolean mClosed>
		zzaDV = true;
	//    5    9:aload_0         
	//    6   10:iconst_1        
	//    7   11:putfield        #59  <Field boolean zzaDV>
		zzaiI = 1;
	//    8   14:aload_0         
	//    9   15:iconst_1        
	//   10   16:putfield        #61  <Field int zzaiI>
		zzaDP = (String[])zzac.zzw(((Object) (as)));
	//   11   19:aload_0         
	//   12   20:aload_1         
	//   13   21:invokestatic    #88  <Method Object zzac.zzw(Object)>
	//   14   24:checkcast       #89  <Class String[]>
	//   15   27:putfield        #63  <Field String[] zzaDP>
		zzaDR = (CursorWindow[])zzac.zzw(((Object) (acursorwindow)));
	//   16   30:aload_0         
	//   17   31:aload_2         
	//   18   32:invokestatic    #88  <Method Object zzac.zzw(Object)>
	//   19   35:checkcast       #90  <Class CursorWindow[]>
	//   20   38:putfield        #65  <Field CursorWindow[] zzaDR>
		zzavD = i;
	//   21   41:aload_0         
	//   22   42:iload_3         
	//   23   43:putfield        #67  <Field int zzavD>
		zzaDS = bundle;
	//   24   46:aload_0         
	//   25   47:aload           4
	//   26   49:putfield        #69  <Field Bundle zzaDS>
		zzxk();
	//   27   52:aload_0         
	//   28   53:invokevirtual   #93  <Method void zzxk()>
	//   29   56:return          
	}

	public static DataHolder zza(int i, Bundle bundle)
	{
		return new DataHolder(zzaDW, i, bundle);
	//    0    0:new             #2   <Class DataHolder>
	//    1    3:dup             
	//    2    4:getstatic       #52  <Field DataHolder$zza zzaDW>
	//    3    7:iload_0         
	//    4    8:aload_1         
	//    5    9:invokespecial   #82  <Method void DataHolder(DataHolder$zza, int, Bundle)>
	//    6   12:areturn         
	}

	private static CursorWindow[] zza(zza zza1, int i)
	{
		int j;
		int l;
		Object obj;
		Object obj1;
		ArrayList arraylist;
		if(com.google.android.gms.common.data.zza.zza(zza1).length == 0)
	//*   0    0:aload_0         
	//*   1    1:invokestatic    #73  <Method String[] com.google.android.gms.common.data.DataHolder$zza.zza(DataHolder$zza)>
	//*   2    4:arraylength     
	//*   3    5:ifne            13
			return new CursorWindow[0];
	//    4    8:iconst_0        
	//    5    9:anewarray       CursorWindow[]
	//    6   12:areturn         
		if(i < 0 || i >= zza.zzb(zza1).size())
	//*   7   13:iload_1         
	//*   8   14:iflt            28
	//*   9   17:iload_1         
	//*  10   18:aload_0         
	//*  11   19:invokestatic    #101 <Method ArrayList DataHolder$zza.zzb(DataHolder$zza)>
	//*  12   22:invokevirtual   #107 <Method int ArrayList.size()>
	//*  13   25:icmplt          37
			obj1 = ((Object) (zza.zzb(zza1)));
	//   14   28:aload_0         
	//   15   29:invokestatic    #101 <Method ArrayList DataHolder$zza.zzb(DataHolder$zza)>
	//   16   32:astore          10
		else
	//*  17   34:goto            48
			obj1 = ((Object) (zza.zzb(zza1).subList(0, i)));
	//   18   37:aload_0         
	//   19   38:invokestatic    #101 <Method ArrayList DataHolder$zza.zzb(DataHolder$zza)>
	//   20   41:iconst_0        
	//   21   42:iload_1         
	//   22   43:invokevirtual   #111 <Method List ArrayList.subList(int, int)>
	//   23   46:astore          10
		l = ((List) (obj1)).size();
	//   24   48:aload           10
	//   25   50:invokeinterface #114 <Method int List.size()>
	//   26   55:istore          4
		obj = ((Object) (new CursorWindow(false)));
	//   27   57:new             #98  <Class CursorWindow>
	//   28   60:dup             
	//   29   61:iconst_0        
	//   30   62:invokespecial   #117 <Method void CursorWindow(boolean)>
	//   31   65:astore          9
		arraylist = new ArrayList();
	//   32   67:new             #103 <Class ArrayList>
	//   33   70:dup             
	//   34   71:invokespecial   #118 <Method void ArrayList()>
	//   35   74:astore          11
		arraylist.add(obj);
	//   36   76:aload           11
	//   37   78:aload           9
	//   38   80:invokevirtual   #122 <Method boolean ArrayList.add(Object)>
	//   39   83:pop             
		((CursorWindow) (obj)).setNumColumns(com.google.android.gms.common.data.zza.zza(zza1).length);
	//   40   84:aload           9
	//   41   86:aload_0         
	//   42   87:invokestatic    #73  <Method String[] com.google.android.gms.common.data.DataHolder$zza.zza(DataHolder$zza)>
	//   43   90:arraylength     
	//   44   91:invokevirtual   #126 <Method boolean CursorWindow.setNumColumns(int)>
	//   45   94:pop             
		j = 0;
	//   46   95:iconst_0        
	//   47   96:istore_2        
		i = 0;
	//   48   97:iconst_0        
	//   49   98:istore_1        
_L2:
		CursorWindow cursorwindow;
		if(i >= l)
			break; /* Loop/switch isn't completed */
	//   50   99:iload_1         
	//   51  100:iload           4
	//   52  102:icmpge          687
		cursorwindow = ((CursorWindow) (obj));
	//   53  105:aload           9
	//   54  107:astore          8
		if(((CursorWindow) (obj)).allocRow())
			break MISSING_BLOCK_LABEL_231;
	//   55  109:aload           9
	//   56  111:invokevirtual   #130 <Method boolean CursorWindow.allocRow()>
	//   57  114:ifne            231
		Log.d("DataHolder", (new StringBuilder(72)).append("Allocating additional cursor window for large data set (row ").append(i).append(")").toString());
	//   58  117:ldc1            #132 <String "DataHolder">
	//   59  119:new             #134 <Class StringBuilder>
	//   60  122:dup             
	//   61  123:bipush          72
	//   62  125:invokespecial   #137 <Method void StringBuilder(int)>
	//   63  128:ldc1            #139 <String "Allocating additional cursor window for large data set (row ">
	//   64  130:invokevirtual   #143 <Method StringBuilder StringBuilder.append(String)>
	//   65  133:iload_1         
	//   66  134:invokevirtual   #146 <Method StringBuilder StringBuilder.append(int)>
	//   67  137:ldc1            #148 <String ")">
	//   68  139:invokevirtual   #143 <Method StringBuilder StringBuilder.append(String)>
	//   69  142:invokevirtual   #152 <Method String StringBuilder.toString()>
	//   70  145:invokestatic    #158 <Method int Log.d(String, String)>
	//   71  148:pop             
		obj = ((Object) (new CursorWindow(false)));
	//   72  149:new             #98  <Class CursorWindow>
	//   73  152:dup             
	//   74  153:iconst_0        
	//   75  154:invokespecial   #117 <Method void CursorWindow(boolean)>
	//   76  157:astore          9
		((CursorWindow) (obj)).setStartPosition(i);
	//   77  159:aload           9
	//   78  161:iload_1         
	//   79  162:invokevirtual   #161 <Method void CursorWindow.setStartPosition(int)>
		((CursorWindow) (obj)).setNumColumns(com.google.android.gms.common.data.zza.zza(zza1).length);
	//   80  165:aload           9
	//   81  167:aload_0         
	//   82  168:invokestatic    #73  <Method String[] com.google.android.gms.common.data.DataHolder$zza.zza(DataHolder$zza)>
	//   83  171:arraylength     
	//   84  172:invokevirtual   #126 <Method boolean CursorWindow.setNumColumns(int)>
	//   85  175:pop             
		arraylist.add(obj);
	//   86  176:aload           11
	//   87  178:aload           9
	//   88  180:invokevirtual   #122 <Method boolean ArrayList.add(Object)>
	//   89  183:pop             
		cursorwindow = ((CursorWindow) (obj));
	//   90  184:aload           9
	//   91  186:astore          8
		if(((CursorWindow) (obj)).allocRow())
			break MISSING_BLOCK_LABEL_231;
	//   92  188:aload           9
	//   93  190:invokevirtual   #130 <Method boolean CursorWindow.allocRow()>
	//   94  193:ifne            231
		Log.e("DataHolder", "Unable to allocate row to hold data.");
	//   95  196:ldc1            #132 <String "DataHolder">
	//   96  198:ldc1            #163 <String "Unable to allocate row to hold data.">
	//   97  200:invokestatic    #166 <Method int Log.e(String, String)>
	//   98  203:pop             
		arraylist.remove(obj);
	//   99  204:aload           11
	//  100  206:aload           9
	//  101  208:invokevirtual   #169 <Method boolean ArrayList.remove(Object)>
	//  102  211:pop             
		zza1 = ((zza) ((CursorWindow[])arraylist.toArray(((Object []) (new CursorWindow[arraylist.size()])))));
	//  103  212:aload           11
	//  104  214:aload           11
	//  105  216:invokevirtual   #107 <Method int ArrayList.size()>
	//  106  219:anewarray       CursorWindow[]
	//  107  222:invokevirtual   #173 <Method Object[] ArrayList.toArray(Object[])>
	//  108  225:checkcast       #90  <Class CursorWindow[]>
	//  109  228:astore_0        
		return ((CursorWindow []) (zza1));
	//  110  229:aload_0         
	//  111  230:areturn         
		Map map = (Map)((List) (obj1)).get(i);
	//  112  231:aload           10
	//  113  233:iload_1         
	//  114  234:invokeinterface #177 <Method Object List.get(int)>
	//  115  239:checkcast       #179 <Class Map>
	//  116  242:astore          12
		boolean flag;
		flag = true;
	//  117  244:iconst_1        
	//  118  245:istore          5
		long l1;
		Object obj2;
		for(int k = 0; k >= com.google.android.gms.common.data.zza.zza(zza1).length || !flag; k++)
			break MISSING_BLOCK_LABEL_566;

	//  119  247:iconst_0        
	//  120  248:istore_3        
	//  121  249:iload_3         
	//  122  250:aload_0         
	//  123  251:invokestatic    #73  <Method String[] com.google.android.gms.common.data.DataHolder$zza.zza(DataHolder$zza)>
	//  124  254:arraylength     
	//  125  255:icmpge          566
	//  126  258:iload           5
	//  127  260:ifeq            566
	//  128  263:aload_0         
	//  129  264:invokestatic    #73  <Method String[] com.google.android.gms.common.data.DataHolder$zza.zza(DataHolder$zza)>
	//  130  267:iload_3         
	//  131  268:aaload          
	//  132  269:astore          9
	//  133  271:aload           12
	//  134  273:aload           9
	//  135  275:invokeinterface #181 <Method Object Map.get(Object)>
	//  136  280:astore          13
	//  137  282:aload           13
	//  138  284:ifnonnull       299
	//  139  287:aload           8
	//  140  289:iload_1         
	//  141  290:iload_3         
	//  142  291:invokevirtual   #185 <Method boolean CursorWindow.putNull(int, int)>
	//  143  294:istore          5
	//  144  296:goto            748
	//  145  299:aload           13
	//  146  301:instanceof      #47  <Class String>
	//  147  304:ifeq            324
	//  148  307:aload           8
	//  149  309:aload           13
	//  150  311:checkcast       #47  <Class String>
	//  151  314:iload_1         
	//  152  315:iload_3         
	//  153  316:invokevirtual   #189 <Method boolean CursorWindow.putString(String, int, int)>
	//  154  319:istore          5
	//  155  321:goto            748
	//  156  324:aload           13
	//  157  326:instanceof      #191 <Class Long>
	//  158  329:ifeq            352
	//  159  332:aload           8
	//  160  334:aload           13
	//  161  336:checkcast       #191 <Class Long>
	//  162  339:invokevirtual   #195 <Method long Long.longValue()>
	//  163  342:iload_1         
	//  164  343:iload_3         
	//  165  344:invokevirtual   #199 <Method boolean CursorWindow.putLong(long, int, int)>
	//  166  347:istore          5
	//  167  349:goto            748
	//  168  352:aload           13
	//  169  354:instanceof      #201 <Class Integer>
	//  170  357:ifeq            381
	//  171  360:aload           8
	//  172  362:aload           13
	//  173  364:checkcast       #201 <Class Integer>
	//  174  367:invokevirtual   #204 <Method int Integer.intValue()>
	//  175  370:i2l             
	//  176  371:iload_1         
	//  177  372:iload_3         
	//  178  373:invokevirtual   #199 <Method boolean CursorWindow.putLong(long, int, int)>
	//  179  376:istore          5
	//  180  378:goto            748
	//  181  381:aload           13
	//  182  383:instanceof      #206 <Class Boolean>
	//  183  386:ifeq            420
	//  184  389:aload           13
	//  185  391:checkcast       #206 <Class Boolean>
	//  186  394:invokevirtual   #209 <Method boolean Boolean.booleanValue()>
	//  187  397:ifeq            742
	//  188  400:lconst_1        
	//  189  401:lstore          6
	//  190  403:goto            406
	//  191  406:aload           8
	//  192  408:lload           6
	//  193  410:iload_1         
	//  194  411:iload_3         
	//  195  412:invokevirtual   #199 <Method boolean CursorWindow.putLong(long, int, int)>
	//  196  415:istore          5
	//  197  417:goto            748
	//  198  420:aload           13
	//  199  422:instanceof      #211 <Class byte[]>
	//  200  425:ifeq            445
	//  201  428:aload           8
	//  202  430:aload           13
	//  203  432:checkcast       #211 <Class byte[]>
	//  204  435:iload_1         
	//  205  436:iload_3         
	//  206  437:invokevirtual   #215 <Method boolean CursorWindow.putBlob(byte[], int, int)>
	//  207  440:istore          5
	//  208  442:goto            748
	//  209  445:aload           13
	//  210  447:instanceof      #217 <Class Double>
	//  211  450:ifeq            473
	//  212  453:aload           8
	//  213  455:aload           13
	//  214  457:checkcast       #217 <Class Double>
	//  215  460:invokevirtual   #221 <Method double Double.doubleValue()>
	//  216  463:iload_1         
	//  217  464:iload_3         
	//  218  465:invokevirtual   #225 <Method boolean CursorWindow.putDouble(double, int, int)>
	//  219  468:istore          5
	//  220  470:goto            748
	//  221  473:aload           13
	//  222  475:instanceof      #227 <Class Float>
	//  223  478:ifeq            502
	//  224  481:aload           8
	//  225  483:aload           13
	//  226  485:checkcast       #227 <Class Float>
	//  227  488:invokevirtual   #231 <Method float Float.floatValue()>
	//  228  491:f2d             
	//  229  492:iload_1         
	//  230  493:iload_3         
	//  231  494:invokevirtual   #225 <Method boolean CursorWindow.putDouble(double, int, int)>
	//  232  497:istore          5
	//  233  499:goto            748
	//  234  502:aload           13
	//  235  504:invokestatic    #235 <Method String String.valueOf(Object)>
	//  236  507:astore_0        
	//  237  508:aload           9
	//  238  510:invokestatic    #235 <Method String String.valueOf(Object)>
	//  239  513:invokevirtual   #238 <Method int String.length()>
	//  240  516:istore_1        
	//  241  517:new             #240 <Class IllegalArgumentException>
	//  242  520:dup             
	//  243  521:new             #134 <Class StringBuilder>
	//  244  524:dup             
	//  245  525:aload_0         
	//  246  526:invokestatic    #235 <Method String String.valueOf(Object)>
	//  247  529:invokevirtual   #238 <Method int String.length()>
	//  248  532:iload_1         
	//  249  533:bipush          32
	//  250  535:iadd            
	//  251  536:iadd            
	//  252  537:invokespecial   #137 <Method void StringBuilder(int)>
	//  253  540:ldc1            #242 <String "Unsupported object for column ">
	//  254  542:invokevirtual   #143 <Method StringBuilder StringBuilder.append(String)>
	//  255  545:aload           9
	//  256  547:invokevirtual   #143 <Method StringBuilder StringBuilder.append(String)>
	//  257  550:ldc1            #244 <String ": ">
	//  258  552:invokevirtual   #143 <Method StringBuilder StringBuilder.append(String)>
	//  259  555:aload_0         
	//  260  556:invokevirtual   #143 <Method StringBuilder StringBuilder.append(String)>
	//  261  559:invokevirtual   #152 <Method String StringBuilder.toString()>
	//  262  562:invokespecial   #247 <Method void IllegalArgumentException(String)>
	//  263  565:athrow          
	//  264  566:iload           5
	//  265  568:ifne            666
	//  266  571:iload_2         
	//  267  572:ifeq            585
	//  268  575:new             #13  <Class DataHolder$zzb>
	//  269  578:dup             
	//  270  579:ldc1            #249 <String "Could not add the value to a new CursorWindow. The size of value may be larger than what a CursorWindow can handle.">
	//  271  581:invokespecial   #250 <Method void DataHolder$zzb(String)>
	//  272  584:athrow          
	//  273  585:ldc1            #132 <String "DataHolder">
	//  274  587:new             #134 <Class StringBuilder>
	//  275  590:dup             
	//  276  591:bipush          74
	//  277  593:invokespecial   #137 <Method void StringBuilder(int)>
	//  278  596:ldc1            #252 <String "Couldn't populate window data for row ">
	//  279  598:invokevirtual   #143 <Method StringBuilder StringBuilder.append(String)>
	//  280  601:iload_1         
	//  281  602:invokevirtual   #146 <Method StringBuilder StringBuilder.append(int)>
	//  282  605:ldc1            #254 <String " - allocating new window.">
	//  283  607:invokevirtual   #143 <Method StringBuilder StringBuilder.append(String)>
	//  284  610:invokevirtual   #152 <Method String StringBuilder.toString()>
	//  285  613:invokestatic    #158 <Method int Log.d(String, String)>
	//  286  616:pop             
	//  287  617:aload           8
	//  288  619:invokevirtual   #257 <Method void CursorWindow.freeLastRow()>
	//  289  622:new             #98  <Class CursorWindow>
	//  290  625:dup             
	//  291  626:iconst_0        
	//  292  627:invokespecial   #117 <Method void CursorWindow(boolean)>
	//  293  630:astore          8
	//  294  632:aload           8
	//  295  634:iload_1         
	//  296  635:invokevirtual   #161 <Method void CursorWindow.setStartPosition(int)>
	//  297  638:aload           8
	//  298  640:aload_0         
	//  299  641:invokestatic    #73  <Method String[] com.google.android.gms.common.data.DataHolder$zza.zza(DataHolder$zza)>
	//  300  644:arraylength     
	//  301  645:invokevirtual   #126 <Method boolean CursorWindow.setNumColumns(int)>
	//  302  648:pop             
	//  303  649:aload           11
	//  304  651:aload           8
	//  305  653:invokevirtual   #122 <Method boolean ArrayList.add(Object)>
	//  306  656:pop             
	//  307  657:iload_1         
	//  308  658:iconst_1        
	//  309  659:isub            
	//  310  660:istore_2        
	//  311  661:iconst_1        
	//  312  662:istore_1        
	//  313  663:goto            672
	//  314  666:iconst_0        
	//  315  667:istore_3        
	//  316  668:iload_1         
	//  317  669:istore_2        
	//  318  670:iload_3         
	//  319  671:istore_1        
	//  320  672:iload_2         
	//  321  673:iconst_1        
	//  322  674:iadd            
	//  323  675:istore_3        
	//  324  676:aload           8
	//  325  678:astore          9
	//  326  680:iload_1         
	//  327  681:istore_2        
	//  328  682:iload_3         
	//  329  683:istore_1        
	//  330  684:goto            99
	//  331  687:goto            725
	//  332  690:astore_0        
	//  333  691:iconst_0        
	//  334  692:istore_1        
	//  335  693:aload           11
	//  336  695:invokevirtual   #107 <Method int ArrayList.size()>
	//  337  698:istore_2        
	//  338  699:iload_1         
	//  339  700:iload_2         
	//  340  701:icmpge          723
	//  341  704:aload           11
	//  342  706:iload_1         
	//  343  707:invokevirtual   #258 <Method Object ArrayList.get(int)>
	//  344  710:checkcast       #98  <Class CursorWindow>
	//  345  713:invokevirtual   #261 <Method void CursorWindow.close()>
	//  346  716:iload_1         
	//  347  717:iconst_1        
	//  348  718:iadd            
	//  349  719:istore_1        
	//  350  720:goto            699
	//  351  723:aload_0         
	//  352  724:athrow          
	//  353  725:aload           11
	//  354  727:aload           11
	//  355  729:invokevirtual   #107 <Method int ArrayList.size()>
	//  356  732:anewarray       CursorWindow[]
	//  357  735:invokevirtual   #173 <Method Object[] ArrayList.toArray(Object[])>
	//  358  738:checkcast       #90  <Class CursorWindow[]>
	//  359  741:areturn         
	//  360  742:lconst_0        
	//  361  743:lstore          6
	//  362  745:goto            406
	//  363  748:iload_3         
	//  364  749:iconst_1        
	//  365  750:iadd            
	//  366  751:istore_3        
		obj = ((Object) (com.google.android.gms.common.data.zza.zza(zza1)[k]));
		obj2 = map.get(obj);
		if(obj2 != null)
			break MISSING_BLOCK_LABEL_299;
		flag = cursorwindow.putNull(i, k);
		break MISSING_BLOCK_LABEL_748;
		if(obj2 instanceof String)
		{
			flag = cursorwindow.putString((String)obj2, i, k);
			break MISSING_BLOCK_LABEL_748;
		}
		if(obj2 instanceof Long)
		{
			flag = cursorwindow.putLong(((Long)obj2).longValue(), i, k);
			break MISSING_BLOCK_LABEL_748;
		}
		if(obj2 instanceof Integer)
		{
			flag = cursorwindow.putLong(((Integer)obj2).intValue(), i, k);
			break MISSING_BLOCK_LABEL_748;
		}
		if(!(obj2 instanceof Boolean))
			break MISSING_BLOCK_LABEL_420;
		if(((Boolean)obj2).booleanValue())
			l1 = 1L;
		else
			l1 = 0L;
		flag = cursorwindow.putLong(l1, i, k);
		break MISSING_BLOCK_LABEL_748;
		if(obj2 instanceof byte[])
		{
			flag = cursorwindow.putBlob((byte[])obj2, i, k);
			break MISSING_BLOCK_LABEL_748;
		}
		if(obj2 instanceof Double)
		{
			flag = cursorwindow.putDouble(((Double)obj2).doubleValue(), i, k);
			break MISSING_BLOCK_LABEL_748;
		}
		if(obj2 instanceof Float)
		{
			flag = cursorwindow.putDouble(((Float)obj2).floatValue(), i, k);
			break MISSING_BLOCK_LABEL_748;
		}
		try
		{
			zza1 = ((zza) (String.valueOf(obj2)));
			i = String.valueOf(obj).length();
			throw new IllegalArgumentException((new StringBuilder(String.valueOf(((Object) (zza1))).length() + (i + 32))).append("Unsupported object for column ").append(((String) (obj))).append(": ").append(((String) (zza1))).toString());
		}
		// Misplaced declaration of an exception variable
		catch(zza zza1)
		{
			i = 0;
		}
		break MISSING_BLOCK_LABEL_693;
		if(flag)
			break MISSING_BLOCK_LABEL_666;
		if(j == 0)
			break MISSING_BLOCK_LABEL_585;
		throw new zzb("Could not add the value to a new CursorWindow. The size of value may be larger than what a CursorWindow can handle.");
		Log.d("DataHolder", (new StringBuilder(74)).append("Couldn't populate window data for row ").append(i).append(" - allocating new window.").toString());
		cursorwindow.freeLastRow();
		cursorwindow = new CursorWindow(false);
		cursorwindow.setStartPosition(i);
		cursorwindow.setNumColumns(com.google.android.gms.common.data.zza.zza(zza1).length);
		arraylist.add(((Object) (cursorwindow)));
		j = i - 1;
		i = 1;
		break MISSING_BLOCK_LABEL_672;
		k = 0;
		j = i;
		i = k;
		k = j + 1;
		obj = ((Object) (cursorwindow));
		j = i;
		i = k;
		if(true) goto _L2; else goto _L1
		for(j = arraylist.size(); i < j; i++)
			((CursorWindow)arraylist.get(i)).close();

		throw zza1;
_L1:
		return (CursorWindow[])arraylist.toArray(((Object []) (new CursorWindow[arraylist.size()])));
	//* 367  752:goto            249
	}

	public static zza zzc(String as[])
	{
		return new zza(as, ((String) (null)));
	//    0    0:new             #10  <Class DataHolder$zza>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:aconst_null     
	//    5    7:invokespecial   #266 <Method void DataHolder$zza(String[], String, DataHolder$1)>
	//    6   10:areturn         
	}

	public static DataHolder zzcJ(int i)
	{
		return zza(i, ((Bundle) (null)));
	//    0    0:iload_0         
	//    1    1:aconst_null     
	//    2    2:invokestatic    #270 <Method DataHolder zza(int, Bundle)>
	//    3    5:areturn         
	}

	private void zzi(String s, int i)
	{
		if(zzaDQ == null || !zzaDQ.containsKey(s))
	//*   0    0:aload_0         
	//*   1    1:getfield        #274 <Field Bundle zzaDQ>
	//*   2    4:ifnull          18
	//*   3    7:aload_0         
	//*   4    8:getfield        #274 <Field Bundle zzaDQ>
	//*   5   11:aload_1         
	//*   6   12:invokevirtual   #280 <Method boolean Bundle.containsKey(String)>
	//*   7   15:ifne            61
		{
			s = String.valueOf(((Object) (s)));
	//    8   18:aload_1         
	//    9   19:invokestatic    #235 <Method String String.valueOf(Object)>
	//   10   22:astore_1        
			if(s.length() != 0)
	//*  11   23:aload_1         
	//*  12   24:invokevirtual   #238 <Method int String.length()>
	//*  13   27:ifeq            41
				s = "No such column: ".concat(s);
	//   14   30:ldc2            #282 <String "No such column: ">
	//   15   33:aload_1         
	//   16   34:invokevirtual   #286 <Method String String.concat(String)>
	//   17   37:astore_1        
			else
	//*  18   38:goto            52
				s = new String("No such column: ");
	//   19   41:new             #47  <Class String>
	//   20   44:dup             
	//   21   45:ldc2            #282 <String "No such column: ">
	//   22   48:invokespecial   #287 <Method void String(String)>
	//   23   51:astore_1        
			throw new IllegalArgumentException(s);
	//   24   52:new             #240 <Class IllegalArgumentException>
	//   25   55:dup             
	//   26   56:aload_1         
	//   27   57:invokespecial   #247 <Method void IllegalArgumentException(String)>
	//   28   60:athrow          
		}
		if(isClosed())
	//*  29   61:aload_0         
	//*  30   62:invokevirtual   #290 <Method boolean isClosed()>
	//*  31   65:ifeq            79
			throw new IllegalArgumentException("Buffer is closed.");
	//   32   68:new             #240 <Class IllegalArgumentException>
	//   33   71:dup             
	//   34   72:ldc2            #292 <String "Buffer is closed.">
	//   35   75:invokespecial   #247 <Method void IllegalArgumentException(String)>
	//   36   78:athrow          
		if(i < 0 || i >= zzaDU)
	//*  37   79:iload_2         
	//*  38   80:iflt            91
	//*  39   83:iload_2         
	//*  40   84:aload_0         
	//*  41   85:getfield        #294 <Field int zzaDU>
	//*  42   88:icmplt          104
			throw new CursorIndexOutOfBoundsException(i, zzaDU);
	//   43   91:new             #296 <Class CursorIndexOutOfBoundsException>
	//   44   94:dup             
	//   45   95:iload_2         
	//   46   96:aload_0         
	//   47   97:getfield        #294 <Field int zzaDU>
	//   48  100:invokespecial   #299 <Method void CursorIndexOutOfBoundsException(int, int)>
	//   49  103:athrow          
		else
			return;
	//   50  104:return          
	}

	public void close()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		if(mClosed) goto _L2; else goto _L1
	//    2    2:aload_0         
	//    3    3:getfield        #57  <Field boolean mClosed>
	//    4    6:ifne            41
_L1:
		mClosed = true;
	//    5    9:aload_0         
	//    6   10:iconst_1        
	//    7   11:putfield        #57  <Field boolean mClosed>
		int i = 0;
	//    8   14:iconst_0        
	//    9   15:istore_1        
_L3:
		if(i >= zzaDR.length)
			break; /* Loop/switch isn't completed */
	//   10   16:iload_1         
	//   11   17:aload_0         
	//   12   18:getfield        #65  <Field CursorWindow[] zzaDR>
	//   13   21:arraylength     
	//   14   22:icmpge          41
		zzaDR[i].close();
	//   15   25:aload_0         
	//   16   26:getfield        #65  <Field CursorWindow[] zzaDR>
	//   17   29:iload_1         
	//   18   30:aaload          
	//   19   31:invokevirtual   #261 <Method void CursorWindow.close()>
		i++;
	//   20   34:iload_1         
	//   21   35:iconst_1        
	//   22   36:iadd            
	//   23   37:istore_1        
		if(true) goto _L3; else goto _L2
	//   24   38:goto            16
_L2:
		this;
	//   25   41:aload_0         
		JVM INSTR monitorexit ;
	//   26   42:monitorexit     
		return;
	//   27   43:return          
		Exception exception;
		exception;
	//   28   44:astore_2        
	//*  29   45:aload_0         
		throw exception;
	//   30   46:monitorexit     
	//   31   47:aload_2         
	//   32   48:athrow          
	}

	protected void finalize()
		throws Throwable
	{
		if(zzaDV && zzaDR.length > 0 && !isClosed())
	//*   0    0:aload_0         
	//*   1    1:getfield        #59  <Field boolean zzaDV>
	//*   2    4:ifeq            77
	//*   3    7:aload_0         
	//*   4    8:getfield        #65  <Field CursorWindow[] zzaDR>
	//*   5   11:arraylength     
	//*   6   12:ifle            77
	//*   7   15:aload_0         
	//*   8   16:invokevirtual   #290 <Method boolean isClosed()>
	//*   9   19:ifne            77
		{
			close();
	//   10   22:aload_0         
	//   11   23:invokevirtual   #303 <Method void close()>
			String s = String.valueOf(((Object) (((Object)this).toString())));
	//   12   26:aload_0         
	//   13   27:invokevirtual   #306 <Method String Object.toString()>
	//   14   30:invokestatic    #235 <Method String String.valueOf(Object)>
	//   15   33:astore_1        
			Log.e("DataBuffer", (new StringBuilder(String.valueOf(((Object) (s))).length() + 178)).append("Internal data leak within a DataBuffer object detected!  Be sure to explicitly call release() on all DataBuffer extending objects when you are done with them. (internal object: ").append(s).append(")").toString());
	//   16   34:ldc2            #308 <String "DataBuffer">
	//   17   37:new             #134 <Class StringBuilder>
	//   18   40:dup             
	//   19   41:aload_1         
	//   20   42:invokestatic    #235 <Method String String.valueOf(Object)>
	//   21   45:invokevirtual   #238 <Method int String.length()>
	//   22   48:sipush          178
	//   23   51:iadd            
	//   24   52:invokespecial   #137 <Method void StringBuilder(int)>
	//   25   55:ldc2            #310 <String "Internal data leak within a DataBuffer object detected!  Be sure to explicitly call release() on all DataBuffer extending objects when you are done with them. (internal object: ">
	//   26   58:invokevirtual   #143 <Method StringBuilder StringBuilder.append(String)>
	//   27   61:aload_1         
	//   28   62:invokevirtual   #143 <Method StringBuilder StringBuilder.append(String)>
	//   29   65:ldc1            #148 <String ")">
	//   30   67:invokevirtual   #143 <Method StringBuilder StringBuilder.append(String)>
	//   31   70:invokevirtual   #152 <Method String StringBuilder.toString()>
	//   32   73:invokestatic    #166 <Method int Log.e(String, String)>
	//   33   76:pop             
		}
		((Object)this).finalize();
	//   34   77:aload_0         
	//   35   78:invokespecial   #312 <Method void Object.finalize()>
		return;
	//   36   81:return          
		Exception exception;
		exception;
	//   37   82:astore_1        
		((Object)this).finalize();
	//   38   83:aload_0         
	//   39   84:invokespecial   #312 <Method void Object.finalize()>
		throw exception;
	//   40   87:aload_1         
	//   41   88:athrow          
	}

	public int getCount()
	{
		return zzaDU;
	//    0    0:aload_0         
	//    1    1:getfield        #294 <Field int zzaDU>
	//    2    4:ireturn         
	}

	public int getStatusCode()
	{
		return zzavD;
	//    0    0:aload_0         
	//    1    1:getfield        #67  <Field int zzavD>
	//    2    4:ireturn         
	}

	public boolean isClosed()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		boolean flag = mClosed;
	//    2    2:aload_0         
	//    3    3:getfield        #57  <Field boolean mClosed>
	//    4    6:istore_1        
		this;
	//    5    7:aload_0         
		JVM INSTR monitorexit ;
	//    6    8:monitorexit     
		return flag;
	//    7    9:iload_1         
	//    8   10:ireturn         
		Exception exception;
		exception;
	//    9   11:astore_2        
	//*  10   12:aload_0         
		throw exception;
	//   11   13:monitorexit     
	//   12   14:aload_2         
	//   13   15:athrow          
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		com.google.android.gms.common.data.zze.zza(this, parcel, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokestatic    #320 <Method void com.google.android.gms.common.data.zze.zza(DataHolder, Parcel, int)>
	//    4    6:return          
	}

	public void zza(String s, int i, int j, CharArrayBuffer chararraybuffer)
	{
		zzi(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #323 <Method void zzi(String, int)>
		zzaDR[j].copyStringToBuffer(i, zzaDQ.getInt(s), chararraybuffer);
	//    4    6:aload_0         
	//    5    7:getfield        #65  <Field CursorWindow[] zzaDR>
	//    6   10:iload_3         
	//    7   11:aaload          
	//    8   12:iload_2         
	//    9   13:aload_0         
	//   10   14:getfield        #274 <Field Bundle zzaDQ>
	//   11   17:aload_1         
	//   12   18:invokevirtual   #327 <Method int Bundle.getInt(String)>
	//   13   21:aload           4
	//   14   23:invokevirtual   #331 <Method void CursorWindow.copyStringToBuffer(int, int, CharArrayBuffer)>
	//   15   26:return          
	}

	public long zzb(String s, int i, int j)
	{
		zzi(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #323 <Method void zzi(String, int)>
		return zzaDR[j].getLong(i, zzaDQ.getInt(s));
	//    4    6:aload_0         
	//    5    7:getfield        #65  <Field CursorWindow[] zzaDR>
	//    6   10:iload_3         
	//    7   11:aaload          
	//    8   12:iload_2         
	//    9   13:aload_0         
	//   10   14:getfield        #274 <Field Bundle zzaDQ>
	//   11   17:aload_1         
	//   12   18:invokevirtual   #327 <Method int Bundle.getInt(String)>
	//   13   21:invokevirtual   #336 <Method long CursorWindow.getLong(int, int)>
	//   14   24:lreturn         
	}

	public int zzc(String s, int i, int j)
	{
		zzi(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #323 <Method void zzi(String, int)>
		return zzaDR[j].getInt(i, zzaDQ.getInt(s));
	//    4    6:aload_0         
	//    5    7:getfield        #65  <Field CursorWindow[] zzaDR>
	//    6   10:iload_3         
	//    7   11:aaload          
	//    8   12:iload_2         
	//    9   13:aload_0         
	//   10   14:getfield        #274 <Field Bundle zzaDQ>
	//   11   17:aload_1         
	//   12   18:invokevirtual   #327 <Method int Bundle.getInt(String)>
	//   13   21:invokevirtual   #340 <Method int CursorWindow.getInt(int, int)>
	//   14   24:ireturn         
	}

	public int zzcI(int i)
	{
		boolean flag;
		if(i >= 0 && i < zzaDU)
	//*   0    0:iload_1         
	//*   1    1:iflt            18
	//*   2    4:iload_1         
	//*   3    5:aload_0         
	//*   4    6:getfield        #294 <Field int zzaDU>
	//*   5    9:icmpge          18
			flag = true;
	//    6   12:iconst_1        
	//    7   13:istore          4
		else
	//*   8   15:goto            21
			flag = false;
	//    9   18:iconst_0        
	//   10   19:istore          4
		zzac.zzaw(flag);
	//   11   21:iload           4
	//   12   23:invokestatic    #345 <Method void zzac.zzaw(boolean)>
		int k = 0;
	//   13   26:iconst_0        
	//   14   27:istore_3        
		int j;
		do
		{
			j = k;
	//   15   28:iload_3         
	//   16   29:istore_2        
			if(k >= zzaDT.length)
				break;
	//   17   30:iload_3         
	//   18   31:aload_0         
	//   19   32:getfield        #347 <Field int[] zzaDT>
	//   20   35:arraylength     
	//   21   36:icmpge          63
			if(i < zzaDT[k])
	//*  22   39:iload_1         
	//*  23   40:aload_0         
	//*  24   41:getfield        #347 <Field int[] zzaDT>
	//*  25   44:iload_3         
	//*  26   45:iaload          
	//*  27   46:icmpge          56
			{
				j = k - 1;
	//   28   49:iload_3         
	//   29   50:iconst_1        
	//   30   51:isub            
	//   31   52:istore_2        
				break;
	//   32   53:goto            63
			}
			k++;
	//   33   56:iload_3         
	//   34   57:iconst_1        
	//   35   58:iadd            
	//   36   59:istore_3        
		} while(true);
	//   37   60:goto            28
		i = j;
	//   38   63:iload_2         
	//   39   64:istore_1        
		if(j == zzaDT.length)
	//*  40   65:iload_2         
	//*  41   66:aload_0         
	//*  42   67:getfield        #347 <Field int[] zzaDT>
	//*  43   70:arraylength     
	//*  44   71:icmpne          78
			i = j - 1;
	//   45   74:iload_2         
	//   46   75:iconst_1        
	//   47   76:isub            
	//   48   77:istore_1        
		return i;
	//   49   78:iload_1         
	//   50   79:ireturn         
	}

	public String zzd(String s, int i, int j)
	{
		zzi(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #323 <Method void zzi(String, int)>
		return zzaDR[j].getString(i, zzaDQ.getInt(s));
	//    4    6:aload_0         
	//    5    7:getfield        #65  <Field CursorWindow[] zzaDR>
	//    6   10:iload_3         
	//    7   11:aaload          
	//    8   12:iload_2         
	//    9   13:aload_0         
	//   10   14:getfield        #274 <Field Bundle zzaDQ>
	//   11   17:aload_1         
	//   12   18:invokevirtual   #327 <Method int Bundle.getInt(String)>
	//   13   21:invokevirtual   #353 <Method String CursorWindow.getString(int, int)>
	//   14   24:areturn         
	}

	public boolean zzdf(String s)
	{
		return zzaDQ.containsKey(s);
	//    0    0:aload_0         
	//    1    1:getfield        #274 <Field Bundle zzaDQ>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #280 <Method boolean Bundle.containsKey(String)>
	//    4    8:ireturn         
	}

	public boolean zze(String s, int i, int j)
	{
		zzi(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #323 <Method void zzi(String, int)>
		return Long.valueOf(zzaDR[j].getLong(i, zzaDQ.getInt(s))).longValue() == 1L;
	//    4    6:aload_0         
	//    5    7:getfield        #65  <Field CursorWindow[] zzaDR>
	//    6   10:iload_3         
	//    7   11:aaload          
	//    8   12:iload_2         
	//    9   13:aload_0         
	//   10   14:getfield        #274 <Field Bundle zzaDQ>
	//   11   17:aload_1         
	//   12   18:invokevirtual   #327 <Method int Bundle.getInt(String)>
	//   13   21:invokevirtual   #336 <Method long CursorWindow.getLong(int, int)>
	//   14   24:invokestatic    #358 <Method Long Long.valueOf(long)>
	//   15   27:invokevirtual   #195 <Method long Long.longValue()>
	//   16   30:lconst_1        
	//   17   31:lcmp            
	//   18   32:ifne            37
	//   19   35:iconst_1        
	//   20   36:ireturn         
	//   21   37:iconst_0        
	//   22   38:ireturn         
	}

	public float zzf(String s, int i, int j)
	{
		zzi(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #323 <Method void zzi(String, int)>
		return zzaDR[j].getFloat(i, zzaDQ.getInt(s));
	//    4    6:aload_0         
	//    5    7:getfield        #65  <Field CursorWindow[] zzaDR>
	//    6   10:iload_3         
	//    7   11:aaload          
	//    8   12:iload_2         
	//    9   13:aload_0         
	//   10   14:getfield        #274 <Field Bundle zzaDQ>
	//   11   17:aload_1         
	//   12   18:invokevirtual   #327 <Method int Bundle.getInt(String)>
	//   13   21:invokevirtual   #364 <Method float CursorWindow.getFloat(int, int)>
	//   14   24:freturn         
	}

	public byte[] zzg(String s, int i, int j)
	{
		zzi(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #323 <Method void zzi(String, int)>
		return zzaDR[j].getBlob(i, zzaDQ.getInt(s));
	//    4    6:aload_0         
	//    5    7:getfield        #65  <Field CursorWindow[] zzaDR>
	//    6   10:iload_3         
	//    7   11:aaload          
	//    8   12:iload_2         
	//    9   13:aload_0         
	//   10   14:getfield        #274 <Field Bundle zzaDQ>
	//   11   17:aload_1         
	//   12   18:invokevirtual   #327 <Method int Bundle.getInt(String)>
	//   13   21:invokevirtual   #370 <Method byte[] CursorWindow.getBlob(int, int)>
	//   14   24:areturn         
	}

	public Uri zzh(String s, int i, int j)
	{
		s = zzd(s, i, j);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:iload_3         
	//    4    4:invokevirtual   #374 <Method String zzd(String, int, int)>
	//    5    7:astore_1        
		if(s == null)
	//*   6    8:aload_1         
	//*   7    9:ifnonnull       14
			return null;
	//    8   12:aconst_null     
	//    9   13:areturn         
		else
			return Uri.parse(s);
	//   10   14:aload_1         
	//   11   15:invokestatic    #380 <Method Uri Uri.parse(String)>
	//   12   18:areturn         
	}

	public boolean zzi(String s, int i, int j)
	{
		zzi(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #323 <Method void zzi(String, int)>
		return zzaDR[j].isNull(i, zzaDQ.getInt(s));
	//    4    6:aload_0         
	//    5    7:getfield        #65  <Field CursorWindow[] zzaDR>
	//    6   10:iload_3         
	//    7   11:aaload          
	//    8   12:iload_2         
	//    9   13:aload_0         
	//   10   14:getfield        #274 <Field Bundle zzaDQ>
	//   11   17:aload_1         
	//   12   18:invokevirtual   #327 <Method int Bundle.getInt(String)>
	//   13   21:invokevirtual   #383 <Method boolean CursorWindow.isNull(int, int)>
	//   14   24:ireturn         
	}

	public Bundle zzxf()
	{
		return zzaDS;
	//    0    0:aload_0         
	//    1    1:getfield        #69  <Field Bundle zzaDS>
	//    2    4:areturn         
	}

	public void zzxk()
	{
		zzaDQ = new Bundle();
	//    0    0:aload_0         
	//    1    1:new             #276 <Class Bundle>
	//    2    4:dup             
	//    3    5:invokespecial   #386 <Method void Bundle()>
	//    4    8:putfield        #274 <Field Bundle zzaDQ>
		for(int i = 0; i < zzaDP.length; i++)
	//*   5   11:iconst_0        
	//*   6   12:istore_1        
	//*   7   13:iload_1         
	//*   8   14:aload_0         
	//*   9   15:getfield        #63  <Field String[] zzaDP>
	//*  10   18:arraylength     
	//*  11   19:icmpge          43
			zzaDQ.putInt(zzaDP[i], i);
	//   12   22:aload_0         
	//   13   23:getfield        #274 <Field Bundle zzaDQ>
	//   14   26:aload_0         
	//   15   27:getfield        #63  <Field String[] zzaDP>
	//   16   30:iload_1         
	//   17   31:aaload          
	//   18   32:iload_1         
	//   19   33:invokevirtual   #389 <Method void Bundle.putInt(String, int)>

	//   20   36:iload_1         
	//   21   37:iconst_1        
	//   22   38:iadd            
	//   23   39:istore_1        
	//*  24   40:goto            13
		zzaDT = new int[zzaDR.length];
	//   25   43:aload_0         
	//   26   44:aload_0         
	//   27   45:getfield        #65  <Field CursorWindow[] zzaDR>
	//   28   48:arraylength     
	//   29   49:newarray        int[]
	//   30   51:putfield        #347 <Field int[] zzaDT>
		int k = 0;
	//   31   54:iconst_0        
	//   32   55:istore_2        
		for(int j = 0; j < zzaDR.length; j++)
	//*  33   56:iconst_0        
	//*  34   57:istore_1        
	//*  35   58:iload_1         
	//*  36   59:aload_0         
	//*  37   60:getfield        #65  <Field CursorWindow[] zzaDR>
	//*  38   63:arraylength     
	//*  39   64:icmpge          107
		{
			zzaDT[j] = k;
	//   40   67:aload_0         
	//   41   68:getfield        #347 <Field int[] zzaDT>
	//   42   71:iload_1         
	//   43   72:iload_2         
	//   44   73:iastore         
			int l = zzaDR[j].getStartPosition();
	//   45   74:aload_0         
	//   46   75:getfield        #65  <Field CursorWindow[] zzaDR>
	//   47   78:iload_1         
	//   48   79:aaload          
	//   49   80:invokevirtual   #392 <Method int CursorWindow.getStartPosition()>
	//   50   83:istore_3        
			k += zzaDR[j].getNumRows() - (k - l);
	//   51   84:iload_2         
	//   52   85:aload_0         
	//   53   86:getfield        #65  <Field CursorWindow[] zzaDR>
	//   54   89:iload_1         
	//   55   90:aaload          
	//   56   91:invokevirtual   #395 <Method int CursorWindow.getNumRows()>
	//   57   94:iload_2         
	//   58   95:iload_3         
	//   59   96:isub            
	//   60   97:isub            
	//   61   98:iadd            
	//   62   99:istore_2        
		}

	//   63  100:iload_1         
	//   64  101:iconst_1        
	//   65  102:iadd            
	//   66  103:istore_1        
	//*  67  104:goto            58
		zzaDU = k;
	//   68  107:aload_0         
	//   69  108:iload_2         
	//   70  109:putfield        #294 <Field int zzaDU>
	//   71  112:return          
	}

	String[] zzxl()
	{
		return zzaDP;
	//    0    0:aload_0         
	//    1    1:getfield        #63  <Field String[] zzaDP>
	//    2    4:areturn         
	}

	CursorWindow[] zzxm()
	{
		return zzaDR;
	//    0    0:aload_0         
	//    1    1:getfield        #65  <Field CursorWindow[] zzaDR>
	//    2    4:areturn         
	}

	public static final android.os.Parcelable.Creator CREATOR = new zze();
	private static final zza zzaDW = new zza(new String[0], ((String) (null))) {

		public zza zza(ContentValues contentvalues)
		{
			throw new UnsupportedOperationException("Cannot add data to empty builder");
		//    0    0:new             #16  <Class UnsupportedOperationException>
		//    1    3:dup             
		//    2    4:ldc1            #18  <String "Cannot add data to empty builder">
		//    3    6:invokespecial   #21  <Method void UnsupportedOperationException(String)>
		//    4    9:athrow          
		}

		public zza zza(HashMap hashmap)
		{
			throw new UnsupportedOperationException("Cannot add data to empty builder");
		//    0    0:new             #16  <Class UnsupportedOperationException>
		//    1    3:dup             
		//    2    4:ldc1            #18  <String "Cannot add data to empty builder">
		//    3    6:invokespecial   #21  <Method void UnsupportedOperationException(String)>
		//    4    9:athrow          
		}

			
			{
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:aload_2         
			//    3    3:aconst_null     
			//    4    4:invokespecial   #11  <Method void DataHolder$zza(String[], String, DataHolder$1)>
			//    5    7:return          
			}
	}
;
	boolean mClosed;
	private final String zzaDP[];
	Bundle zzaDQ;
	private final CursorWindow zzaDR[];
	private final Bundle zzaDS;
	int zzaDT[];
	int zzaDU;
	private boolean zzaDV;
	final int zzaiI;
	private final int zzavD;

	static 
	{
	//    0    0:new             #40  <Class zze>
	//    1    3:dup             
	//    2    4:invokespecial   #43  <Method void zze()>
	//    3    7:putstatic       #45  <Field android.os.Parcelable$Creator CREATOR>
	//    4   10:new             #8   <Class DataHolder$1>
	//    5   13:dup             
	//    6   14:iconst_0        
	//    7   15:anewarray       String[]
	//    8   18:aconst_null     
	//    9   19:invokespecial   #50  <Method void DataHolder$1(String[], String)>
	//   10   22:putstatic       #52  <Field DataHolder$zza zzaDW>
	//*  11   25:return          
	}
}

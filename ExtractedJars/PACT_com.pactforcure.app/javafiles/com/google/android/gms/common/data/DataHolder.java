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
			return zza1.zzaCq;
		//    0    0:aload_0         
		//    1    1:getfield        #34  <Field String[] zzaCq>
		//    2    4:areturn         
		}

		static ArrayList zzb(zza zza1)
		{
			return zza1.zzaCy;
		//    0    0:aload_0         
		//    1    1:getfield        #39  <Field ArrayList zzaCy>
		//    2    4:areturn         
		}

		private int zzc(HashMap hashmap)
		{
			if(zzaCz == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #41  <Field String zzaCz>
		//*   2    4:ifnonnull       9
				return -1;
		//    3    7:iconst_m1       
		//    4    8:ireturn         
			hashmap = ((HashMap) (hashmap.get(((Object) (zzaCz)))));
		//    5    9:aload_1         
		//    6   10:aload_0         
		//    7   11:getfield        #41  <Field String zzaCz>
		//    8   14:invokevirtual   #62  <Method Object HashMap.get(Object)>
		//    9   17:astore_1        
			if(hashmap == null)
		//*  10   18:aload_1         
		//*  11   19:ifnonnull       24
				return -1;
		//   12   22:iconst_m1       
		//   13   23:ireturn         
			Integer integer = (Integer)zzaCA.get(((Object) (hashmap)));
		//   14   24:aload_0         
		//   15   25:getfield        #46  <Field HashMap zzaCA>
		//   16   28:aload_1         
		//   17   29:invokevirtual   #62  <Method Object HashMap.get(Object)>
		//   18   32:checkcast       #64  <Class Integer>
		//   19   35:astore_2        
			if(integer == null)
		//*  20   36:aload_2         
		//*  21   37:ifnonnull       61
			{
				zzaCA.put(((Object) (hashmap)), ((Object) (Integer.valueOf(zzaCy.size()))));
		//   22   40:aload_0         
		//   23   41:getfield        #46  <Field HashMap zzaCA>
		//   24   44:aload_1         
		//   25   45:aload_0         
		//   26   46:getfield        #39  <Field ArrayList zzaCy>
		//   27   49:invokevirtual   #68  <Method int ArrayList.size()>
		//   28   52:invokestatic    #72  <Method Integer Integer.valueOf(int)>
		//   29   55:invokevirtual   #76  <Method Object HashMap.put(Object, Object)>
		//   30   58:pop             
				return -1;
		//   31   59:iconst_m1       
		//   32   60:ireturn         
			} else
			{
				return integer.intValue();
		//   33   61:aload_2         
		//   34   62:invokevirtual   #79  <Method int Integer.intValue()>
		//   35   65:ireturn         
			}
		}

		public zza zza(ContentValues contentvalues)
		{
			com.google.android.gms.common.internal.zzc.zzt(((Object) (contentvalues)));
		//    0    0:aload_1         
		//    1    1:invokestatic    #88  <Method void zzc.zzt(Object)>
			HashMap hashmap = new HashMap(contentvalues.size());
		//    2    4:new             #43  <Class HashMap>
		//    3    7:dup             
		//    4    8:aload_1         
		//    5    9:invokevirtual   #91  <Method int ContentValues.size()>
		//    6   12:invokespecial   #94  <Method void HashMap(int)>
		//    7   15:astore_2        
			java.util.Map.Entry entry;
			for(contentvalues = ((ContentValues) (contentvalues.valueSet().iterator())); ((Iterator) (contentvalues)).hasNext(); hashmap.put(((Object) ((String)entry.getKey())), entry.getValue()))
		//*   8   16:aload_1         
		//*   9   17:invokevirtual   #98  <Method Set ContentValues.valueSet()>
		//*  10   20:invokeinterface #104 <Method Iterator Set.iterator()>
		//*  11   25:astore_1        
		//*  12   26:aload_1         
		//*  13   27:invokeinterface #110 <Method boolean Iterator.hasNext()>
		//*  14   32:ifeq            68
				entry = (java.util.Map.Entry)((Iterator) (contentvalues)).next();
		//   15   35:aload_1         
		//   16   36:invokeinterface #114 <Method Object Iterator.next()>
		//   17   41:checkcast       #116 <Class java.util.Map$Entry>
		//   18   44:astore_3        

		//   19   45:aload_2         
		//   20   46:aload_3         
		//   21   47:invokeinterface #119 <Method Object java.util.Map$Entry.getKey()>
		//   22   52:checkcast       #121 <Class String>
		//   23   55:aload_3         
		//   24   56:invokeinterface #124 <Method Object java.util.Map$Entry.getValue()>
		//   25   61:invokevirtual   #76  <Method Object HashMap.put(Object, Object)>
		//   26   64:pop             
		//*  27   65:goto            26
			return zzb(hashmap);
		//   28   68:aload_0         
		//   29   69:aload_2         
		//   30   70:invokevirtual   #127 <Method DataHolder$zza zzb(HashMap)>
		//   31   73:areturn         
		}

		public zza zzb(HashMap hashmap)
		{
			com.google.android.gms.common.internal.zzc.zzt(((Object) (hashmap)));
		//    0    0:aload_1         
		//    1    1:invokestatic    #88  <Method void zzc.zzt(Object)>
			int i = zzc(hashmap);
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:invokespecial   #129 <Method int zzc(HashMap)>
		//    5    9:istore_2        
			if(i == -1)
		//*   6   10:iload_2         
		//*   7   11:iconst_m1       
		//*   8   12:icmpne          31
			{
				zzaCy.add(((Object) (hashmap)));
		//    9   15:aload_0         
		//   10   16:getfield        #39  <Field ArrayList zzaCy>
		//   11   19:aload_1         
		//   12   20:invokevirtual   #133 <Method boolean ArrayList.add(Object)>
		//   13   23:pop             
			} else
		//*  14   24:aload_0         
		//*  15   25:iconst_0        
		//*  16   26:putfield        #48  <Field boolean zzaCB>
		//*  17   29:aload_0         
		//*  18   30:areturn         
			{
				zzaCy.remove(i);
		//   19   31:aload_0         
		//   20   32:getfield        #39  <Field ArrayList zzaCy>
		//   21   35:iload_2         
		//   22   36:invokevirtual   #137 <Method Object ArrayList.remove(int)>
		//   23   39:pop             
				zzaCy.add(i, ((Object) (hashmap)));
		//   24   40:aload_0         
		//   25   41:getfield        #39  <Field ArrayList zzaCy>
		//   26   44:iload_2         
		//   27   45:aload_1         
		//   28   46:invokevirtual   #140 <Method void ArrayList.add(int, Object)>
			}
			zzaCB = false;
			return this;
		//*  29   49:goto            24
		}

		public DataHolder zzcE(int i)
		{
			return new DataHolder(this, i, ((Bundle) (null)));
		//    0    0:new             #6   <Class DataHolder>
		//    1    3:dup             
		//    2    4:aload_0         
		//    3    5:iload_1         
		//    4    6:aconst_null     
		//    5    7:aconst_null     
		//    6    8:invokespecial   #146 <Method void DataHolder(DataHolder$zza, int, Bundle, DataHolder$1)>
		//    7   11:areturn         
		}

		private final HashMap zzaCA;
		private boolean zzaCB;
		private String zzaCC;
		private final String zzaCq[];
		private final ArrayList zzaCy;
		private final String zzaCz;

		private zza(String as[], String s)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #25  <Method void Object()>
			zzaCq = (String[])zzac.zzw(((Object) (as)));
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:invokestatic    #31  <Method Object zzac.zzw(Object)>
		//    5    9:checkcast       #32  <Class String[]>
		//    6   12:putfield        #34  <Field String[] zzaCq>
			zzaCy = new ArrayList();
		//    7   15:aload_0         
		//    8   16:new             #36  <Class ArrayList>
		//    9   19:dup             
		//   10   20:invokespecial   #37  <Method void ArrayList()>
		//   11   23:putfield        #39  <Field ArrayList zzaCy>
			zzaCz = s;
		//   12   26:aload_0         
		//   13   27:aload_2         
		//   14   28:putfield        #41  <Field String zzaCz>
			zzaCA = new HashMap();
		//   15   31:aload_0         
		//   16   32:new             #43  <Class HashMap>
		//   17   35:dup             
		//   18   36:invokespecial   #44  <Method void HashMap()>
		//   19   39:putfield        #46  <Field HashMap zzaCA>
			zzaCB = false;
		//   20   42:aload_0         
		//   21   43:iconst_0        
		//   22   44:putfield        #48  <Field boolean zzaCB>
			zzaCC = null;
		//   23   47:aload_0         
		//   24   48:aconst_null     
		//   25   49:putfield        #50  <Field String zzaCC>
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
		zzaCw = true;
	//    5    9:aload_0         
	//    6   10:iconst_1        
	//    7   11:putfield        #59  <Field boolean zzaCw>
		mVersionCode = i;
	//    8   14:aload_0         
	//    9   15:iload_1         
	//   10   16:putfield        #61  <Field int mVersionCode>
		zzaCq = as;
	//   11   19:aload_0         
	//   12   20:aload_2         
	//   13   21:putfield        #63  <Field String[] zzaCq>
		zzaCs = acursorwindow;
	//   14   24:aload_0         
	//   15   25:aload_3         
	//   16   26:putfield        #65  <Field CursorWindow[] zzaCs>
		zzauz = j;
	//   17   29:aload_0         
	//   18   30:iload           4
	//   19   32:putfield        #67  <Field int zzauz>
		zzaCt = bundle;
	//   20   35:aload_0         
	//   21   36:aload           5
	//   22   38:putfield        #69  <Field Bundle zzaCt>
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
		zzaCw = true;
	//    5    9:aload_0         
	//    6   10:iconst_1        
	//    7   11:putfield        #59  <Field boolean zzaCw>
		mVersionCode = 1;
	//    8   14:aload_0         
	//    9   15:iconst_1        
	//   10   16:putfield        #61  <Field int mVersionCode>
		zzaCq = (String[])zzac.zzw(((Object) (as)));
	//   11   19:aload_0         
	//   12   20:aload_1         
	//   13   21:invokestatic    #88  <Method Object zzac.zzw(Object)>
	//   14   24:checkcast       #89  <Class String[]>
	//   15   27:putfield        #63  <Field String[] zzaCq>
		zzaCs = (CursorWindow[])zzac.zzw(((Object) (acursorwindow)));
	//   16   30:aload_0         
	//   17   31:aload_2         
	//   18   32:invokestatic    #88  <Method Object zzac.zzw(Object)>
	//   19   35:checkcast       #90  <Class CursorWindow[]>
	//   20   38:putfield        #65  <Field CursorWindow[] zzaCs>
		zzauz = i;
	//   21   41:aload_0         
	//   22   42:iload_3         
	//   23   43:putfield        #67  <Field int zzauz>
		zzaCt = bundle;
	//   24   46:aload_0         
	//   25   47:aload           4
	//   26   49:putfield        #69  <Field Bundle zzaCt>
		zzwD();
	//   27   52:aload_0         
	//   28   53:invokevirtual   #93  <Method void zzwD()>
	//   29   56:return          
	}

	public static DataHolder zza(int i, Bundle bundle)
	{
		return new DataHolder(zzaCx, i, bundle);
	//    0    0:new             #2   <Class DataHolder>
	//    1    3:dup             
	//    2    4:getstatic       #52  <Field DataHolder$zza zzaCx>
	//    3    7:iload_0         
	//    4    8:aload_1         
	//    5    9:invokespecial   #82  <Method void DataHolder(DataHolder$zza, int, Bundle)>
	//    6   12:areturn         
	}

	private static CursorWindow[] zza(zza zza1, int i)
	{
		int j;
		boolean flag;
		CursorWindow cursorwindow;
		Object obj;
		Object obj1;
		ArrayList arraylist;
		flag = false;
	//    0    0:iconst_0        
	//    1    1:istore          4
		if(com.google.android.gms.common.data.zza.zza(zza1).length == 0)
	//*   2    3:aload_0         
	//*   3    4:invokestatic    #73  <Method String[] com.google.android.gms.common.data.DataHolder$zza.zza(DataHolder$zza)>
	//*   4    7:arraylength     
	//*   5    8:ifne            16
			return new CursorWindow[0];
	//    6   11:iconst_0        
	//    7   12:anewarray       CursorWindow[]
	//    8   15:areturn         
		int l;
		if(i < 0 || i >= zza.zzb(zza1).size())
	//*   9   16:iload_1         
	//*  10   17:iflt            31
	//*  11   20:iload_1         
	//*  12   21:aload_0         
	//*  13   22:invokestatic    #101 <Method ArrayList DataHolder$zza.zzb(DataHolder$zza)>
	//*  14   25:invokevirtual   #107 <Method int ArrayList.size()>
	//*  15   28:icmplt          220
			obj1 = ((Object) (zza.zzb(zza1)));
	//   16   31:aload_0         
	//   17   32:invokestatic    #101 <Method ArrayList DataHolder$zza.zzb(DataHolder$zza)>
	//   18   35:astore          11
		else
	//*  19   37:aload           11
	//*  20   39:invokeinterface #110 <Method int List.size()>
	//*  21   44:istore          5
	//*  22   46:new             #98  <Class CursorWindow>
	//*  23   49:dup             
	//*  24   50:iconst_0        
	//*  25   51:invokespecial   #113 <Method void CursorWindow(boolean)>
	//*  26   54:astore          10
	//*  27   56:new             #103 <Class ArrayList>
	//*  28   59:dup             
	//*  29   60:invokespecial   #114 <Method void ArrayList()>
	//*  30   63:astore          12
	//*  31   65:aload           12
	//*  32   67:aload           10
	//*  33   69:invokevirtual   #118 <Method boolean ArrayList.add(Object)>
	//*  34   72:pop             
	//*  35   73:aload           10
	//*  36   75:aload_0         
	//*  37   76:invokestatic    #73  <Method String[] com.google.android.gms.common.data.DataHolder$zza.zza(DataHolder$zza)>
	//*  38   79:arraylength     
	//*  39   80:invokevirtual   #122 <Method boolean CursorWindow.setNumColumns(int)>
	//*  40   83:pop             
	//*  41   84:iconst_0        
	//*  42   85:istore_1        
	//*  43   86:iconst_0        
	//*  44   87:istore_2        
	//*  45   88:iload_1         
	//*  46   89:iload           5
	//*  47   91:icmpge          723
	//*  48   94:aload           10
	//*  49   96:astore          9
	//*  50   98:aload           10
	//*  51  100:invokevirtual   #126 <Method boolean CursorWindow.allocRow()>
	//*  52  103:ifne            234
	//*  53  106:ldc1            #128 <String "DataHolder">
	//*  54  108:new             #130 <Class StringBuilder>
	//*  55  111:dup             
	//*  56  112:bipush          72
	//*  57  114:invokespecial   #133 <Method void StringBuilder(int)>
	//*  58  117:ldc1            #135 <String "Allocating additional cursor window for large data set (row ">
	//*  59  119:invokevirtual   #139 <Method StringBuilder StringBuilder.append(String)>
	//*  60  122:iload_1         
	//*  61  123:invokevirtual   #142 <Method StringBuilder StringBuilder.append(int)>
	//*  62  126:ldc1            #144 <String ")">
	//*  63  128:invokevirtual   #139 <Method StringBuilder StringBuilder.append(String)>
	//*  64  131:invokevirtual   #148 <Method String StringBuilder.toString()>
	//*  65  134:invokestatic    #154 <Method int Log.d(String, String)>
	//*  66  137:pop             
	//*  67  138:new             #98  <Class CursorWindow>
	//*  68  141:dup             
	//*  69  142:iconst_0        
	//*  70  143:invokespecial   #113 <Method void CursorWindow(boolean)>
	//*  71  146:astore          10
	//*  72  148:aload           10
	//*  73  150:iload_1         
	//*  74  151:invokevirtual   #157 <Method void CursorWindow.setStartPosition(int)>
	//*  75  154:aload           10
	//*  76  156:aload_0         
	//*  77  157:invokestatic    #73  <Method String[] com.google.android.gms.common.data.DataHolder$zza.zza(DataHolder$zza)>
	//*  78  160:arraylength     
	//*  79  161:invokevirtual   #122 <Method boolean CursorWindow.setNumColumns(int)>
	//*  80  164:pop             
	//*  81  165:aload           12
	//*  82  167:aload           10
	//*  83  169:invokevirtual   #118 <Method boolean ArrayList.add(Object)>
	//*  84  172:pop             
	//*  85  173:aload           10
	//*  86  175:astore          9
	//*  87  177:aload           10
	//*  88  179:invokevirtual   #126 <Method boolean CursorWindow.allocRow()>
	//*  89  182:ifne            234
	//*  90  185:ldc1            #128 <String "DataHolder">
	//*  91  187:ldc1            #159 <String "Unable to allocate row to hold data.">
	//*  92  189:invokestatic    #162 <Method int Log.e(String, String)>
	//*  93  192:pop             
	//*  94  193:aload           12
	//*  95  195:aload           10
	//*  96  197:invokevirtual   #165 <Method boolean ArrayList.remove(Object)>
	//*  97  200:pop             
	//*  98  201:aload           12
	//*  99  203:aload           12
	//* 100  205:invokevirtual   #107 <Method int ArrayList.size()>
	//* 101  208:anewarray       CursorWindow[]
	//* 102  211:invokevirtual   #169 <Method Object[] ArrayList.toArray(Object[])>
	//* 103  214:checkcast       #90  <Class CursorWindow[]>
	//* 104  217:astore_0        
	//* 105  218:aload_0         
	//* 106  219:areturn         
			obj1 = ((Object) (zza.zzb(zza1).subList(0, i)));
	//  107  220:aload_0         
	//  108  221:invokestatic    #101 <Method ArrayList DataHolder$zza.zzb(DataHolder$zza)>
	//  109  224:iconst_0        
	//  110  225:iload_1         
	//  111  226:invokevirtual   #173 <Method List ArrayList.subList(int, int)>
	//  112  229:astore          11
		l = ((List) (obj1)).size();
		obj = ((Object) (new CursorWindow(false)));
		arraylist = new ArrayList();
		arraylist.add(obj);
		((CursorWindow) (obj)).setNumColumns(com.google.android.gms.common.data.zza.zza(zza1).length);
		i = 0;
		j = 0;
_L4:
		if(i >= l)
			break; /* Loop/switch isn't completed */
		cursorwindow = ((CursorWindow) (obj));
		if(((CursorWindow) (obj)).allocRow())
			break MISSING_BLOCK_LABEL_234;
		Log.d("DataHolder", (new StringBuilder(72)).append("Allocating additional cursor window for large data set (row ").append(i).append(")").toString());
		obj = ((Object) (new CursorWindow(false)));
		((CursorWindow) (obj)).setStartPosition(i);
		((CursorWindow) (obj)).setNumColumns(com.google.android.gms.common.data.zza.zza(zza1).length);
		arraylist.add(obj);
		cursorwindow = ((CursorWindow) (obj));
		if(((CursorWindow) (obj)).allocRow())
			break MISSING_BLOCK_LABEL_234;
		Log.e("DataHolder", "Unable to allocate row to hold data.");
		arraylist.remove(obj);
		zza1 = ((zza) ((CursorWindow[])arraylist.toArray(((Object []) (new CursorWindow[arraylist.size()])))));
		return ((CursorWindow []) (zza1));
	//* 113  231:goto            37
		Map map = (Map)((List) (obj1)).get(i);
	//  114  234:aload           11
	//  115  236:iload_1         
	//  116  237:invokeinterface #177 <Method Object List.get(int)>
	//  117  242:checkcast       #179 <Class Map>
	//  118  245:astore          13
		int k;
		k = 0;
	//  119  247:iconst_0        
	//  120  248:istore_3        
		long l1;
		Object obj2;
		for(boolean flag1 = true; k >= com.google.android.gms.common.data.zza.zza(zza1).length || !flag1; k++)
			break MISSING_BLOCK_LABEL_598;

	//  121  249:iconst_1        
	//  122  250:istore          6
	//  123  252:iload_3         
	//  124  253:aload_0         
	//  125  254:invokestatic    #73  <Method String[] com.google.android.gms.common.data.DataHolder$zza.zza(DataHolder$zza)>
	//  126  257:arraylength     
	//  127  258:icmpge          598
	//  128  261:iload           6
	//  129  263:ifeq            598
	//  130  266:aload_0         
	//  131  267:invokestatic    #73  <Method String[] com.google.android.gms.common.data.DataHolder$zza.zza(DataHolder$zza)>
	//  132  270:iload_3         
	//  133  271:aaload          
	//  134  272:astore          10
	//  135  274:aload           13
	//  136  276:aload           10
	//  137  278:invokeinterface #181 <Method Object Map.get(Object)>
	//  138  283:astore          14
	//  139  285:aload           14
	//  140  287:ifnonnull       302
	//  141  290:aload           9
	//  142  292:iload_1         
	//  143  293:iload_3         
	//  144  294:invokevirtual   #185 <Method boolean CursorWindow.putNull(int, int)>
	//  145  297:istore          6
	//  146  299:goto            740
	//  147  302:aload           14
	//  148  304:instanceof      #47  <Class String>
	//  149  307:ifeq            327
	//  150  310:aload           9
	//  151  312:aload           14
	//  152  314:checkcast       #47  <Class String>
	//  153  317:iload_1         
	//  154  318:iload_3         
	//  155  319:invokevirtual   #189 <Method boolean CursorWindow.putString(String, int, int)>
	//  156  322:istore          6
	//  157  324:goto            740
	//  158  327:aload           14
	//  159  329:instanceof      #191 <Class Long>
	//  160  332:ifeq            355
	//  161  335:aload           9
	//  162  337:aload           14
	//  163  339:checkcast       #191 <Class Long>
	//  164  342:invokevirtual   #195 <Method long Long.longValue()>
	//  165  345:iload_1         
	//  166  346:iload_3         
	//  167  347:invokevirtual   #199 <Method boolean CursorWindow.putLong(long, int, int)>
	//  168  350:istore          6
	//  169  352:goto            740
	//  170  355:aload           14
	//  171  357:instanceof      #201 <Class Integer>
	//  172  360:ifeq            384
	//  173  363:aload           9
	//  174  365:aload           14
	//  175  367:checkcast       #201 <Class Integer>
	//  176  370:invokevirtual   #204 <Method int Integer.intValue()>
	//  177  373:i2l             
	//  178  374:iload_1         
	//  179  375:iload_3         
	//  180  376:invokevirtual   #199 <Method boolean CursorWindow.putLong(long, int, int)>
	//  181  379:istore          6
	//  182  381:goto            740
	//  183  384:aload           14
	//  184  386:instanceof      #206 <Class Boolean>
	//  185  389:ifeq            420
	//  186  392:aload           14
	//  187  394:checkcast       #206 <Class Boolean>
	//  188  397:invokevirtual   #209 <Method boolean Boolean.booleanValue()>
	//  189  400:ifeq            747
	//  190  403:lconst_1        
	//  191  404:lstore          7
	//  192  406:aload           9
	//  193  408:lload           7
	//  194  410:iload_1         
	//  195  411:iload_3         
	//  196  412:invokevirtual   #199 <Method boolean CursorWindow.putLong(long, int, int)>
	//  197  415:istore          6
	//  198  417:goto            740
	//  199  420:aload           14
	//  200  422:instanceof      #211 <Class byte[]>
	//  201  425:ifeq            445
	//  202  428:aload           9
	//  203  430:aload           14
	//  204  432:checkcast       #211 <Class byte[]>
	//  205  435:iload_1         
	//  206  436:iload_3         
	//  207  437:invokevirtual   #215 <Method boolean CursorWindow.putBlob(byte[], int, int)>
	//  208  440:istore          6
	//  209  442:goto            740
	//  210  445:aload           14
	//  211  447:instanceof      #217 <Class Double>
	//  212  450:ifeq            473
	//  213  453:aload           9
	//  214  455:aload           14
	//  215  457:checkcast       #217 <Class Double>
	//  216  460:invokevirtual   #221 <Method double Double.doubleValue()>
	//  217  463:iload_1         
	//  218  464:iload_3         
	//  219  465:invokevirtual   #225 <Method boolean CursorWindow.putDouble(double, int, int)>
	//  220  468:istore          6
	//  221  470:goto            740
	//  222  473:aload           14
	//  223  475:instanceof      #227 <Class Float>
	//  224  478:ifeq            502
	//  225  481:aload           9
	//  226  483:aload           14
	//  227  485:checkcast       #227 <Class Float>
	//  228  488:invokevirtual   #231 <Method float Float.floatValue()>
	//  229  491:f2d             
	//  230  492:iload_1         
	//  231  493:iload_3         
	//  232  494:invokevirtual   #225 <Method boolean CursorWindow.putDouble(double, int, int)>
	//  233  497:istore          6
	//  234  499:goto            740
	//  235  502:aload           14
	//  236  504:invokestatic    #235 <Method String String.valueOf(Object)>
	//  237  507:astore_0        
	//  238  508:new             #237 <Class IllegalArgumentException>
	//  239  511:dup             
	//  240  512:new             #130 <Class StringBuilder>
	//  241  515:dup             
	//  242  516:aload           10
	//  243  518:invokestatic    #235 <Method String String.valueOf(Object)>
	//  244  521:invokevirtual   #240 <Method int String.length()>
	//  245  524:bipush          32
	//  246  526:iadd            
	//  247  527:aload_0         
	//  248  528:invokestatic    #235 <Method String String.valueOf(Object)>
	//  249  531:invokevirtual   #240 <Method int String.length()>
	//  250  534:iadd            
	//  251  535:invokespecial   #133 <Method void StringBuilder(int)>
	//  252  538:ldc1            #242 <String "Unsupported object for column ">
	//  253  540:invokevirtual   #139 <Method StringBuilder StringBuilder.append(String)>
	//  254  543:aload           10
	//  255  545:invokevirtual   #139 <Method StringBuilder StringBuilder.append(String)>
	//  256  548:ldc1            #244 <String ": ">
	//  257  550:invokevirtual   #139 <Method StringBuilder StringBuilder.append(String)>
	//  258  553:aload_0         
	//  259  554:invokevirtual   #139 <Method StringBuilder StringBuilder.append(String)>
	//  260  557:invokevirtual   #148 <Method String StringBuilder.toString()>
	//  261  560:invokespecial   #247 <Method void IllegalArgumentException(String)>
	//  262  563:athrow          
	//  263  564:astore_0        
	//  264  565:aload           12
	//  265  567:invokevirtual   #107 <Method int ArrayList.size()>
	//  266  570:istore_2        
	//  267  571:iload           4
	//  268  573:istore_1        
	//  269  574:iload_1         
	//  270  575:iload_2         
	//  271  576:icmpge          721
	//  272  579:aload           12
	//  273  581:iload_1         
	//  274  582:invokevirtual   #248 <Method Object ArrayList.get(int)>
	//  275  585:checkcast       #98  <Class CursorWindow>
	//  276  588:invokevirtual   #251 <Method void CursorWindow.close()>
	//  277  591:iload_1         
	//  278  592:iconst_1        
	//  279  593:iadd            
	//  280  594:istore_1        
	//  281  595:goto            574
	//  282  598:iload           6
	//  283  600:ifne            712
	//  284  603:iload_2         
	//  285  604:ifeq            617
	//  286  607:new             #13  <Class DataHolder$zzb>
	//  287  610:dup             
	//  288  611:ldc1            #253 <String "Could not add the value to a new CursorWindow. The size of value may be larger than what a CursorWindow can handle.">
	//  289  613:invokespecial   #254 <Method void DataHolder$zzb(String)>
	//  290  616:athrow          
	//  291  617:ldc1            #128 <String "DataHolder">
	//  292  619:new             #130 <Class StringBuilder>
	//  293  622:dup             
	//  294  623:bipush          74
	//  295  625:invokespecial   #133 <Method void StringBuilder(int)>
	//  296  628:ldc2            #256 <String "Couldn't populate window data for row ">
	//  297  631:invokevirtual   #139 <Method StringBuilder StringBuilder.append(String)>
	//  298  634:iload_1         
	//  299  635:invokevirtual   #142 <Method StringBuilder StringBuilder.append(int)>
	//  300  638:ldc2            #258 <String " - allocating new window.">
	//  301  641:invokevirtual   #139 <Method StringBuilder StringBuilder.append(String)>
	//  302  644:invokevirtual   #148 <Method String StringBuilder.toString()>
	//  303  647:invokestatic    #154 <Method int Log.d(String, String)>
	//  304  650:pop             
	//  305  651:aload           9
	//  306  653:invokevirtual   #261 <Method void CursorWindow.freeLastRow()>
	//  307  656:new             #98  <Class CursorWindow>
	//  308  659:dup             
	//  309  660:iconst_0        
	//  310  661:invokespecial   #113 <Method void CursorWindow(boolean)>
	//  311  664:astore          9
	//  312  666:aload           9
	//  313  668:iload_1         
	//  314  669:invokevirtual   #157 <Method void CursorWindow.setStartPosition(int)>
	//  315  672:aload           9
	//  316  674:aload_0         
	//  317  675:invokestatic    #73  <Method String[] com.google.android.gms.common.data.DataHolder$zza.zza(DataHolder$zza)>
	//  318  678:arraylength     
	//  319  679:invokevirtual   #122 <Method boolean CursorWindow.setNumColumns(int)>
	//  320  682:pop             
	//  321  683:aload           12
	//  322  685:aload           9
	//  323  687:invokevirtual   #118 <Method boolean ArrayList.add(Object)>
	//  324  690:pop             
	//  325  691:iload_1         
	//  326  692:iconst_1        
	//  327  693:isub            
	//  328  694:istore_2        
	//  329  695:iconst_1        
	//  330  696:istore_1        
	//  331  697:iload_1         
	//  332  698:istore_3        
	//  333  699:iload_2         
	//  334  700:iconst_1        
	//  335  701:iadd            
	//  336  702:istore_1        
	//  337  703:aload           9
	//  338  705:astore          10
	//  339  707:iload_3         
	//  340  708:istore_2        
	//  341  709:goto            88
	//  342  712:iconst_0        
	//  343  713:istore_3        
	//  344  714:iload_1         
	//  345  715:istore_2        
	//  346  716:iload_3         
	//  347  717:istore_1        
	//  348  718:goto            697
	//  349  721:aload_0         
	//  350  722:athrow          
	//  351  723:aload           12
	//  352  725:aload           12
	//  353  727:invokevirtual   #107 <Method int ArrayList.size()>
	//  354  730:anewarray       CursorWindow[]
	//  355  733:invokevirtual   #169 <Method Object[] ArrayList.toArray(Object[])>
	//  356  736:checkcast       #90  <Class CursorWindow[]>
	//  357  739:areturn         
	//  358  740:iload_3         
	//  359  741:iconst_1        
	//  360  742:iadd            
	//  361  743:istore_3        
		obj = ((Object) (com.google.android.gms.common.data.zza.zza(zza1)[k]));
		obj2 = map.get(obj);
		if(obj2 != null)
			break MISSING_BLOCK_LABEL_302;
		flag1 = cursorwindow.putNull(i, k);
		break MISSING_BLOCK_LABEL_740;
		if(obj2 instanceof String)
		{
			flag1 = cursorwindow.putString((String)obj2, i, k);
			break MISSING_BLOCK_LABEL_740;
		}
		if(obj2 instanceof Long)
		{
			flag1 = cursorwindow.putLong(((Long)obj2).longValue(), i, k);
			break MISSING_BLOCK_LABEL_740;
		}
		if(obj2 instanceof Integer)
		{
			flag1 = cursorwindow.putLong(((Integer)obj2).intValue(), i, k);
			break MISSING_BLOCK_LABEL_740;
		}
		if(!(obj2 instanceof Boolean))
			break MISSING_BLOCK_LABEL_420;
		if(((Boolean)obj2).booleanValue())
			l1 = 1L;
		else
	//* 362  744:goto            252
			l1 = 0L;
	//  363  747:lconst_0        
	//  364  748:lstore          7
		flag1 = cursorwindow.putLong(l1, i, k);
		break MISSING_BLOCK_LABEL_740;
		if(obj2 instanceof byte[])
		{
			flag1 = cursorwindow.putBlob((byte[])obj2, i, k);
			break MISSING_BLOCK_LABEL_740;
		}
		if(obj2 instanceof Double)
		{
			flag1 = cursorwindow.putDouble(((Double)obj2).doubleValue(), i, k);
			break MISSING_BLOCK_LABEL_740;
		}
		if(obj2 instanceof Float)
		{
			flag1 = cursorwindow.putDouble(((Float)obj2).floatValue(), i, k);
			break MISSING_BLOCK_LABEL_740;
		}
		try
		{
			zza1 = ((zza) (String.valueOf(obj2)));
			throw new IllegalArgumentException((new StringBuilder(String.valueOf(obj).length() + 32 + String.valueOf(((Object) (zza1))).length())).append("Unsupported object for column ").append(((String) (obj))).append(": ").append(((String) (zza1))).toString());
		}
		// Misplaced declaration of an exception variable
		catch(zza zza1)
		{
			j = arraylist.size();
		}
		for(i = ((int) (flag)); i < j; i++)
			((CursorWindow)arraylist.get(i)).close();

		break MISSING_BLOCK_LABEL_721;
		if(flag1)
			break MISSING_BLOCK_LABEL_712;
		if(j == 0)
			break MISSING_BLOCK_LABEL_617;
		throw new zzb("Could not add the value to a new CursorWindow. The size of value may be larger than what a CursorWindow can handle.");
		Log.d("DataHolder", (new StringBuilder(74)).append("Couldn't populate window data for row ").append(i).append(" - allocating new window.").toString());
		cursorwindow.freeLastRow();
		cursorwindow = new CursorWindow(false);
		cursorwindow.setStartPosition(i);
		cursorwindow.setNumColumns(com.google.android.gms.common.data.zza.zza(zza1).length);
		arraylist.add(((Object) (cursorwindow)));
		j = i - 1;
		i = 1;
_L2:
		k = i;
		i = j + 1;
		obj = ((Object) (cursorwindow));
		j = k;
		continue; /* Loop/switch isn't completed */
		k = 0;
		j = i;
		i = k;
		if(true) goto _L2; else goto _L1
_L1:
		throw zza1;
		if(true) goto _L4; else goto _L3
_L3:
		return (CursorWindow[])arraylist.toArray(((Object []) (new CursorWindow[arraylist.size()])));
	//* 365  750:goto            406
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

	public static DataHolder zzcD(int i)
	{
		return zza(i, ((Bundle) (null)));
	//    0    0:iload_0         
	//    1    1:aconst_null     
	//    2    2:invokestatic    #270 <Method DataHolder zza(int, Bundle)>
	//    3    5:areturn         
	}

	private void zzi(String s, int i)
	{
		if(zzaCr == null || !zzaCr.containsKey(s))
	//*   0    0:aload_0         
	//*   1    1:getfield        #274 <Field Bundle zzaCr>
	//*   2    4:ifnull          18
	//*   3    7:aload_0         
	//*   4    8:getfield        #274 <Field Bundle zzaCr>
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
	//*  12   24:invokevirtual   #240 <Method int String.length()>
	//*  13   27:ifeq            47
				s = "No such column: ".concat(s);
	//   14   30:ldc2            #282 <String "No such column: ">
	//   15   33:aload_1         
	//   16   34:invokevirtual   #286 <Method String String.concat(String)>
	//   17   37:astore_1        
			else
	//*  18   38:new             #237 <Class IllegalArgumentException>
	//*  19   41:dup             
	//*  20   42:aload_1         
	//*  21   43:invokespecial   #247 <Method void IllegalArgumentException(String)>
	//*  22   46:athrow          
				s = new String("No such column: ");
	//   23   47:new             #47  <Class String>
	//   24   50:dup             
	//   25   51:ldc2            #282 <String "No such column: ">
	//   26   54:invokespecial   #287 <Method void String(String)>
	//   27   57:astore_1        
			throw new IllegalArgumentException(s);
		}
	//*  28   58:goto            38
		if(isClosed())
	//*  29   61:aload_0         
	//*  30   62:invokevirtual   #290 <Method boolean isClosed()>
	//*  31   65:ifeq            79
			throw new IllegalArgumentException("Buffer is closed.");
	//   32   68:new             #237 <Class IllegalArgumentException>
	//   33   71:dup             
	//   34   72:ldc2            #292 <String "Buffer is closed.">
	//   35   75:invokespecial   #247 <Method void IllegalArgumentException(String)>
	//   36   78:athrow          
		if(i < 0 || i >= zzaCv)
	//*  37   79:iload_2         
	//*  38   80:iflt            91
	//*  39   83:iload_2         
	//*  40   84:aload_0         
	//*  41   85:getfield        #294 <Field int zzaCv>
	//*  42   88:icmplt          104
			throw new CursorIndexOutOfBoundsException(i, zzaCv);
	//   43   91:new             #296 <Class CursorIndexOutOfBoundsException>
	//   44   94:dup             
	//   45   95:iload_2         
	//   46   96:aload_0         
	//   47   97:getfield        #294 <Field int zzaCv>
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
		if(i >= zzaCs.length)
			break; /* Loop/switch isn't completed */
	//   10   16:iload_1         
	//   11   17:aload_0         
	//   12   18:getfield        #65  <Field CursorWindow[] zzaCs>
	//   13   21:arraylength     
	//   14   22:icmpge          41
		zzaCs[i].close();
	//   15   25:aload_0         
	//   16   26:getfield        #65  <Field CursorWindow[] zzaCs>
	//   17   29:iload_1         
	//   18   30:aaload          
	//   19   31:invokevirtual   #251 <Method void CursorWindow.close()>
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
		this;
	//   29   45:aload_0         
		JVM INSTR monitorexit ;
	//   30   46:monitorexit     
		throw exception;
	//   31   47:aload_2         
	//   32   48:athrow          
	}

	protected void finalize()
		throws Throwable
	{
		if(zzaCw && zzaCs.length > 0 && !isClosed())
	//*   0    0:aload_0         
	//*   1    1:getfield        #59  <Field boolean zzaCw>
	//*   2    4:ifeq            77
	//*   3    7:aload_0         
	//*   4    8:getfield        #65  <Field CursorWindow[] zzaCs>
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
	//   17   37:new             #130 <Class StringBuilder>
	//   18   40:dup             
	//   19   41:aload_1         
	//   20   42:invokestatic    #235 <Method String String.valueOf(Object)>
	//   21   45:invokevirtual   #240 <Method int String.length()>
	//   22   48:sipush          178
	//   23   51:iadd            
	//   24   52:invokespecial   #133 <Method void StringBuilder(int)>
	//   25   55:ldc2            #310 <String "Internal data leak within a DataBuffer object detected!  Be sure to explicitly call release() on all DataBuffer extending objects when you are done with them. (internal object: ">
	//   26   58:invokevirtual   #139 <Method StringBuilder StringBuilder.append(String)>
	//   27   61:aload_1         
	//   28   62:invokevirtual   #139 <Method StringBuilder StringBuilder.append(String)>
	//   29   65:ldc1            #144 <String ")">
	//   30   67:invokevirtual   #139 <Method StringBuilder StringBuilder.append(String)>
	//   31   70:invokevirtual   #148 <Method String StringBuilder.toString()>
	//   32   73:invokestatic    #162 <Method int Log.e(String, String)>
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
		return zzaCv;
	//    0    0:aload_0         
	//    1    1:getfield        #294 <Field int zzaCv>
	//    2    4:ireturn         
	}

	public int getStatusCode()
	{
		return zzauz;
	//    0    0:aload_0         
	//    1    1:getfield        #67  <Field int zzauz>
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
		this;
	//   10   12:aload_0         
		JVM INSTR monitorexit ;
	//   11   13:monitorexit     
		throw exception;
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
		zzaCs[j].copyStringToBuffer(i, zzaCr.getInt(s), chararraybuffer);
	//    4    6:aload_0         
	//    5    7:getfield        #65  <Field CursorWindow[] zzaCs>
	//    6   10:iload_3         
	//    7   11:aaload          
	//    8   12:iload_2         
	//    9   13:aload_0         
	//   10   14:getfield        #274 <Field Bundle zzaCr>
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
		return zzaCs[j].getLong(i, zzaCr.getInt(s));
	//    4    6:aload_0         
	//    5    7:getfield        #65  <Field CursorWindow[] zzaCs>
	//    6   10:iload_3         
	//    7   11:aaload          
	//    8   12:iload_2         
	//    9   13:aload_0         
	//   10   14:getfield        #274 <Field Bundle zzaCr>
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
		return zzaCs[j].getInt(i, zzaCr.getInt(s));
	//    4    6:aload_0         
	//    5    7:getfield        #65  <Field CursorWindow[] zzaCs>
	//    6   10:iload_3         
	//    7   11:aaload          
	//    8   12:iload_2         
	//    9   13:aload_0         
	//   10   14:getfield        #274 <Field Bundle zzaCr>
	//   11   17:aload_1         
	//   12   18:invokevirtual   #327 <Method int Bundle.getInt(String)>
	//   13   21:invokevirtual   #340 <Method int CursorWindow.getInt(int, int)>
	//   14   24:ireturn         
	}

	public int zzcC(int i)
	{
		int k = 0;
	//    0    0:iconst_0        
	//    1    1:istore_3        
		boolean flag;
		if(i >= 0 && i < zzaCv)
	//*   2    2:iload_1         
	//*   3    3:iflt            64
	//*   4    6:iload_1         
	//*   5    7:aload_0         
	//*   6    8:getfield        #294 <Field int zzaCv>
	//*   7   11:icmpge          64
			flag = true;
	//    8   14:iconst_1        
	//    9   15:istore          4
		else
	//*  10   17:iload           4
	//*  11   19:invokestatic    #345 <Method void zzac.zzar(boolean)>
	//*  12   22:iload_3         
	//*  13   23:istore_2        
	//*  14   24:iload_3         
	//*  15   25:aload_0         
	//*  16   26:getfield        #347 <Field int[] zzaCu>
	//*  17   29:arraylength     
	//*  18   30:icmpge          47
	//*  19   33:iload_1         
	//*  20   34:aload_0         
	//*  21   35:getfield        #347 <Field int[] zzaCu>
	//*  22   38:iload_3         
	//*  23   39:iaload          
	//*  24   40:icmpge          70
	//*  25   43:iload_3         
	//*  26   44:iconst_1        
	//*  27   45:isub            
	//*  28   46:istore_2        
	//*  29   47:iload_2         
	//*  30   48:istore_1        
	//*  31   49:iload_2         
	//*  32   50:aload_0         
	//*  33   51:getfield        #347 <Field int[] zzaCu>
	//*  34   54:arraylength     
	//*  35   55:icmpne          62
	//*  36   58:iload_2         
	//*  37   59:iconst_1        
	//*  38   60:isub            
	//*  39   61:istore_1        
	//*  40   62:iload_1         
	//*  41   63:ireturn         
			flag = false;
	//   42   64:iconst_0        
	//   43   65:istore          4
		zzac.zzar(flag);
		do
		{
label0:
			{
				int j = k;
				if(k < zzaCu.length)
				{
					if(i >= zzaCu[k])
						break label0;
					j = k - 1;
				}
				i = j;
				if(j == zzaCu.length)
					i = j - 1;
				return i;
			}
	//*  44   67:goto            17
			k++;
	//   45   70:iload_3         
	//   46   71:iconst_1        
	//   47   72:iadd            
	//   48   73:istore_3        
		} while(true);
	//   49   74:goto            22
	}

	public String zzd(String s, int i, int j)
	{
		zzi(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #323 <Method void zzi(String, int)>
		return zzaCs[j].getString(i, zzaCr.getInt(s));
	//    4    6:aload_0         
	//    5    7:getfield        #65  <Field CursorWindow[] zzaCs>
	//    6   10:iload_3         
	//    7   11:aaload          
	//    8   12:iload_2         
	//    9   13:aload_0         
	//   10   14:getfield        #274 <Field Bundle zzaCr>
	//   11   17:aload_1         
	//   12   18:invokevirtual   #327 <Method int Bundle.getInt(String)>
	//   13   21:invokevirtual   #353 <Method String CursorWindow.getString(int, int)>
	//   14   24:areturn         
	}

	public boolean zzdj(String s)
	{
		return zzaCr.containsKey(s);
	//    0    0:aload_0         
	//    1    1:getfield        #274 <Field Bundle zzaCr>
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
		return Long.valueOf(zzaCs[j].getLong(i, zzaCr.getInt(s))).longValue() == 1L;
	//    4    6:aload_0         
	//    5    7:getfield        #65  <Field CursorWindow[] zzaCs>
	//    6   10:iload_3         
	//    7   11:aaload          
	//    8   12:iload_2         
	//    9   13:aload_0         
	//   10   14:getfield        #274 <Field Bundle zzaCr>
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
		return zzaCs[j].getFloat(i, zzaCr.getInt(s));
	//    4    6:aload_0         
	//    5    7:getfield        #65  <Field CursorWindow[] zzaCs>
	//    6   10:iload_3         
	//    7   11:aaload          
	//    8   12:iload_2         
	//    9   13:aload_0         
	//   10   14:getfield        #274 <Field Bundle zzaCr>
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
		return zzaCs[j].getBlob(i, zzaCr.getInt(s));
	//    4    6:aload_0         
	//    5    7:getfield        #65  <Field CursorWindow[] zzaCs>
	//    6   10:iload_3         
	//    7   11:aaload          
	//    8   12:iload_2         
	//    9   13:aload_0         
	//   10   14:getfield        #274 <Field Bundle zzaCr>
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
		return zzaCs[j].isNull(i, zzaCr.getInt(s));
	//    4    6:aload_0         
	//    5    7:getfield        #65  <Field CursorWindow[] zzaCs>
	//    6   10:iload_3         
	//    7   11:aaload          
	//    8   12:iload_2         
	//    9   13:aload_0         
	//   10   14:getfield        #274 <Field Bundle zzaCr>
	//   11   17:aload_1         
	//   12   18:invokevirtual   #327 <Method int Bundle.getInt(String)>
	//   13   21:invokevirtual   #383 <Method boolean CursorWindow.isNull(int, int)>
	//   14   24:ireturn         
	}

	public void zzwD()
	{
		int k = 0;
	//    0    0:iconst_0        
	//    1    1:istore_2        
		zzaCr = new Bundle();
	//    2    2:aload_0         
	//    3    3:new             #276 <Class Bundle>
	//    4    6:dup             
	//    5    7:invokespecial   #384 <Method void Bundle()>
	//    6   10:putfield        #274 <Field Bundle zzaCr>
		for(int i = 0; i < zzaCq.length; i++)
	//*   7   13:iconst_0        
	//*   8   14:istore_1        
	//*   9   15:iload_1         
	//*  10   16:aload_0         
	//*  11   17:getfield        #63  <Field String[] zzaCq>
	//*  12   20:arraylength     
	//*  13   21:icmpge          45
			zzaCr.putInt(zzaCq[i], i);
	//   14   24:aload_0         
	//   15   25:getfield        #274 <Field Bundle zzaCr>
	//   16   28:aload_0         
	//   17   29:getfield        #63  <Field String[] zzaCq>
	//   18   32:iload_1         
	//   19   33:aaload          
	//   20   34:iload_1         
	//   21   35:invokevirtual   #387 <Method void Bundle.putInt(String, int)>

	//   22   38:iload_1         
	//   23   39:iconst_1        
	//   24   40:iadd            
	//   25   41:istore_1        
	//*  26   42:goto            15
		zzaCu = new int[zzaCs.length];
	//   27   45:aload_0         
	//   28   46:aload_0         
	//   29   47:getfield        #65  <Field CursorWindow[] zzaCs>
	//   30   50:arraylength     
	//   31   51:newarray        int[]
	//   32   53:putfield        #347 <Field int[] zzaCu>
		boolean flag = false;
	//   33   56:iconst_0        
	//   34   57:istore_3        
		int j = k;
	//   35   58:iload_2         
	//   36   59:istore_1        
		k = ((int) (flag));
	//   37   60:iload_3         
	//   38   61:istore_2        
		for(; j < zzaCs.length; j++)
	//*  39   62:iload_1         
	//*  40   63:aload_0         
	//*  41   64:getfield        #65  <Field CursorWindow[] zzaCs>
	//*  42   67:arraylength     
	//*  43   68:icmpge          111
		{
			zzaCu[j] = k;
	//   44   71:aload_0         
	//   45   72:getfield        #347 <Field int[] zzaCu>
	//   46   75:iload_1         
	//   47   76:iload_2         
	//   48   77:iastore         
			int l = zzaCs[j].getStartPosition();
	//   49   78:aload_0         
	//   50   79:getfield        #65  <Field CursorWindow[] zzaCs>
	//   51   82:iload_1         
	//   52   83:aaload          
	//   53   84:invokevirtual   #390 <Method int CursorWindow.getStartPosition()>
	//   54   87:istore_3        
			k += zzaCs[j].getNumRows() - (k - l);
	//   55   88:iload_2         
	//   56   89:aload_0         
	//   57   90:getfield        #65  <Field CursorWindow[] zzaCs>
	//   58   93:iload_1         
	//   59   94:aaload          
	//   60   95:invokevirtual   #393 <Method int CursorWindow.getNumRows()>
	//   61   98:iload_2         
	//   62   99:iload_3         
	//   63  100:isub            
	//   64  101:isub            
	//   65  102:iadd            
	//   66  103:istore_2        
		}

	//   67  104:iload_1         
	//   68  105:iconst_1        
	//   69  106:iadd            
	//   70  107:istore_1        
	//*  71  108:goto            62
		zzaCv = k;
	//   72  111:aload_0         
	//   73  112:iload_2         
	//   74  113:putfield        #294 <Field int zzaCv>
	//   75  116:return          
	}

	String[] zzwE()
	{
		return zzaCq;
	//    0    0:aload_0         
	//    1    1:getfield        #63  <Field String[] zzaCq>
	//    2    4:areturn         
	}

	CursorWindow[] zzwF()
	{
		return zzaCs;
	//    0    0:aload_0         
	//    1    1:getfield        #65  <Field CursorWindow[] zzaCs>
	//    2    4:areturn         
	}

	public Bundle zzwy()
	{
		return zzaCt;
	//    0    0:aload_0         
	//    1    1:getfield        #69  <Field Bundle zzaCt>
	//    2    4:areturn         
	}

	public static final android.os.Parcelable.Creator CREATOR = new zze();
	private static final zza zzaCx = new zza(new String[0], ((String) (null))) {

		public zza zza(ContentValues contentvalues)
		{
			throw new UnsupportedOperationException("Cannot add data to empty builder");
		//    0    0:new             #16  <Class UnsupportedOperationException>
		//    1    3:dup             
		//    2    4:ldc1            #18  <String "Cannot add data to empty builder">
		//    3    6:invokespecial   #21  <Method void UnsupportedOperationException(String)>
		//    4    9:athrow          
		}

		public zza zzb(HashMap hashmap)
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
	final int mVersionCode;
	private final String zzaCq[];
	Bundle zzaCr;
	private final CursorWindow zzaCs[];
	private final Bundle zzaCt;
	int zzaCu[];
	int zzaCv;
	private boolean zzaCw;
	private final int zzauz;

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
	//   10   22:putstatic       #52  <Field DataHolder$zza zzaCx>
	//*  11   25:return          
	}
}

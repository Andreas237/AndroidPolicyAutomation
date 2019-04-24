// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.server.converter;

import android.os.Parcel;
import android.util.SparseArray;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.*;

// Referenced classes of package com.google.android.gms.common.server.converter:
//			zac, zad

public final class StringToIntConverter extends AbstractSafeParcelable
	implements com.google.android.gms.common.server.response.FastJsonResponse.FieldConverter
{
	public static final class zaa extends AbstractSafeParcelable
	{

		public final void writeToParcel(Parcel parcel, int i)
		{
			i = SafeParcelWriter.beginObjectHeader(parcel);
		//    0    0:aload_1         
		//    1    1:invokestatic    #55  <Method int SafeParcelWriter.beginObjectHeader(Parcel)>
		//    2    4:istore_2        
			SafeParcelWriter.writeInt(parcel, 1, versionCode);
		//    3    5:aload_1         
		//    4    6:iconst_1        
		//    5    7:aload_0         
		//    6    8:getfield        #40  <Field int versionCode>
		//    7   11:invokestatic    #59  <Method void SafeParcelWriter.writeInt(Parcel, int, int)>
			SafeParcelWriter.writeString(parcel, 2, zapo, false);
		//    8   14:aload_1         
		//    9   15:iconst_2        
		//   10   16:aload_0         
		//   11   17:getfield        #42  <Field String zapo>
		//   12   20:iconst_0        
		//   13   21:invokestatic    #63  <Method void SafeParcelWriter.writeString(Parcel, int, String, boolean)>
			SafeParcelWriter.writeInt(parcel, 3, zapp);
		//   14   24:aload_1         
		//   15   25:iconst_3        
		//   16   26:aload_0         
		//   17   27:getfield        #44  <Field int zapp>
		//   18   30:invokestatic    #59  <Method void SafeParcelWriter.writeInt(Parcel, int, int)>
			SafeParcelWriter.finishObjectHeader(parcel, i);
		//   19   33:aload_1         
		//   20   34:iload_2         
		//   21   35:invokestatic    #66  <Method void SafeParcelWriter.finishObjectHeader(Parcel, int)>
		//   22   38:return          
		}

		public static final android.os.Parcelable.Creator CREATOR = new zad();
		private final int versionCode;
		final String zapo;
		final int zapp;

		static 
		{
		//    0    0:new             #28  <Class zad>
		//    1    3:dup             
		//    2    4:invokespecial   #31  <Method void zad()>
		//    3    7:putstatic       #33  <Field android.os.Parcelable$Creator CREATOR>
		//*   4   10:return          
		}

		zaa(int i, String s, int j)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #38  <Method void AbstractSafeParcelable()>
			versionCode = i;
		//    2    4:aload_0         
		//    3    5:iload_1         
		//    4    6:putfield        #40  <Field int versionCode>
			zapo = s;
		//    5    9:aload_0         
		//    6   10:aload_2         
		//    7   11:putfield        #42  <Field String zapo>
			zapp = j;
		//    8   14:aload_0         
		//    9   15:iload_3         
		//   10   16:putfield        #44  <Field int zapp>
		//   11   19:return          
		}

		zaa(String s, int i)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #38  <Method void AbstractSafeParcelable()>
			versionCode = 1;
		//    2    4:aload_0         
		//    3    5:iconst_1        
		//    4    6:putfield        #40  <Field int versionCode>
			zapo = s;
		//    5    9:aload_0         
		//    6   10:aload_1         
		//    7   11:putfield        #42  <Field String zapo>
			zapp = i;
		//    8   14:aload_0         
		//    9   15:iload_2         
		//   10   16:putfield        #44  <Field int zapp>
		//   11   19:return          
		}
	}


	public StringToIntConverter()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #46  <Method void AbstractSafeParcelable()>
		zale = 1;
	//    2    4:aload_0         
	//    3    5:iconst_1        
	//    4    6:putfield        #48  <Field int zale>
		zapl = new HashMap();
	//    5    9:aload_0         
	//    6   10:new             #50  <Class HashMap>
	//    7   13:dup             
	//    8   14:invokespecial   #51  <Method void HashMap()>
	//    9   17:putfield        #53  <Field HashMap zapl>
		zapm = new SparseArray();
	//   10   20:aload_0         
	//   11   21:new             #55  <Class SparseArray>
	//   12   24:dup             
	//   13   25:invokespecial   #56  <Method void SparseArray()>
	//   14   28:putfield        #58  <Field SparseArray zapm>
		zapn = null;
	//   15   31:aload_0         
	//   16   32:aconst_null     
	//   17   33:putfield        #60  <Field ArrayList zapn>
	//   18   36:return          
	}

	StringToIntConverter(int i, ArrayList arraylist)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #46  <Method void AbstractSafeParcelable()>
		zale = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #48  <Field int zale>
		zapl = new HashMap();
	//    5    9:aload_0         
	//    6   10:new             #50  <Class HashMap>
	//    7   13:dup             
	//    8   14:invokespecial   #51  <Method void HashMap()>
	//    9   17:putfield        #53  <Field HashMap zapl>
		zapm = new SparseArray();
	//   10   20:aload_0         
	//   11   21:new             #55  <Class SparseArray>
	//   12   24:dup             
	//   13   25:invokespecial   #56  <Method void SparseArray()>
	//   14   28:putfield        #58  <Field SparseArray zapm>
		zapn = null;
	//   15   31:aload_0         
	//   16   32:aconst_null     
	//   17   33:putfield        #60  <Field ArrayList zapn>
		arraylist = (ArrayList)arraylist;
	//   18   36:aload_2         
	//   19   37:checkcast       #66  <Class ArrayList>
	//   20   40:astore_2        
		int j = arraylist.size();
	//   21   41:aload_2         
	//   22   42:invokevirtual   #70  <Method int ArrayList.size()>
	//   23   45:istore_3        
		for(i = 0; i < j;)
	//*  24   46:iconst_0        
	//*  25   47:istore_1        
	//*  26   48:iload_1         
	//*  27   49:iload_3         
	//*  28   50:icmpge          89
		{
			Object obj = arraylist.get(i);
	//   29   53:aload_2         
	//   30   54:iload_1         
	//   31   55:invokevirtual   #74  <Method Object ArrayList.get(int)>
	//   32   58:astore          4
			i++;
	//   33   60:iload_1         
	//   34   61:iconst_1        
	//   35   62:iadd            
	//   36   63:istore_1        
			obj = ((Object) ((zaa)obj));
	//   37   64:aload           4
	//   38   66:checkcast       #9   <Class StringToIntConverter$zaa>
	//   39   69:astore          4
			add(((zaa) (obj)).zapo, ((zaa) (obj)).zapp);
	//   40   71:aload_0         
	//   41   72:aload           4
	//   42   74:getfield        #78  <Field String StringToIntConverter$zaa.zapo>
	//   43   77:aload           4
	//   44   79:getfield        #81  <Field int StringToIntConverter$zaa.zapp>
	//   45   82:invokevirtual   #85  <Method StringToIntConverter add(String, int)>
	//   46   85:pop             
		}

	//*  47   86:goto            48
	//   48   89:return          
	}

	public final StringToIntConverter add(String s, int i)
	{
		zapl.put(((Object) (s)), ((Object) (Integer.valueOf(i))));
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field HashMap zapl>
	//    2    4:aload_1         
	//    3    5:iload_2         
	//    4    6:invokestatic    #94  <Method Integer Integer.valueOf(int)>
	//    5    9:invokevirtual   #98  <Method Object HashMap.put(Object, Object)>
	//    6   12:pop             
		zapm.put(i, ((Object) (s)));
	//    7   13:aload_0         
	//    8   14:getfield        #58  <Field SparseArray zapm>
	//    9   17:iload_2         
	//   10   18:aload_1         
	//   11   19:invokevirtual   #101 <Method void SparseArray.put(int, Object)>
		return this;
	//   12   22:aload_0         
	//   13   23:areturn         
	}

	public final Object convert(Object obj)
	{
		obj = ((Object) ((String)obj));
	//    0    0:aload_1         
	//    1    1:checkcast       #105 <Class String>
	//    2    4:astore_1        
		Integer integer = (Integer)zapl.get(obj);
	//    3    5:aload_0         
	//    4    6:getfield        #53  <Field HashMap zapl>
	//    5    9:aload_1         
	//    6   10:invokevirtual   #107 <Method Object HashMap.get(Object)>
	//    7   13:checkcast       #90  <Class Integer>
	//    8   16:astore_2        
		obj = ((Object) (integer));
	//    9   17:aload_2         
	//   10   18:astore_1        
		if(integer == null)
	//*  11   19:aload_2         
	//*  12   20:ifnonnull       36
			obj = ((Object) ((Integer)zapl.get("gms_unknown")));
	//   13   23:aload_0         
	//   14   24:getfield        #53  <Field HashMap zapl>
	//   15   27:ldc1            #109 <String "gms_unknown">
	//   16   29:invokevirtual   #107 <Method Object HashMap.get(Object)>
	//   17   32:checkcast       #90  <Class Integer>
	//   18   35:astore_1        
		return obj;
	//   19   36:aload_1         
	//   20   37:areturn         
	}

	public final Object convertBack(Object obj)
	{
		obj = ((Object) ((Integer)obj));
	//    0    0:aload_1         
	//    1    1:checkcast       #90  <Class Integer>
	//    2    4:astore_1        
		String s = (String)zapm.get(((Integer) (obj)).intValue());
	//    3    5:aload_0         
	//    4    6:getfield        #58  <Field SparseArray zapm>
	//    5    9:aload_1         
	//    6   10:invokevirtual   #113 <Method int Integer.intValue()>
	//    7   13:invokevirtual   #114 <Method Object SparseArray.get(int)>
	//    8   16:checkcast       #105 <Class String>
	//    9   19:astore_2        
		obj = ((Object) (s));
	//   10   20:aload_2         
	//   11   21:astore_1        
		if(s == null)
	//*  12   22:aload_2         
	//*  13   23:ifnonnull       43
		{
			obj = ((Object) (s));
	//   14   26:aload_2         
	//   15   27:astore_1        
			if(zapl.containsKey("gms_unknown"))
	//*  16   28:aload_0         
	//*  17   29:getfield        #53  <Field HashMap zapl>
	//*  18   32:ldc1            #109 <String "gms_unknown">
	//*  19   34:invokevirtual   #118 <Method boolean HashMap.containsKey(Object)>
	//*  20   37:ifeq            43
				obj = "gms_unknown";
	//   21   40:ldc1            #109 <String "gms_unknown">
	//   22   42:astore_1        
		}
		return obj;
	//   23   43:aload_1         
	//   24   44:areturn         
	}

	public final void writeToParcel(Parcel parcel, int i)
	{
		i = SafeParcelWriter.beginObjectHeader(parcel);
	//    0    0:aload_1         
	//    1    1:invokestatic    #126 <Method int SafeParcelWriter.beginObjectHeader(Parcel)>
	//    2    4:istore_2        
		SafeParcelWriter.writeInt(parcel, 1, zale);
	//    3    5:aload_1         
	//    4    6:iconst_1        
	//    5    7:aload_0         
	//    6    8:getfield        #48  <Field int zale>
	//    7   11:invokestatic    #130 <Method void SafeParcelWriter.writeInt(Parcel, int, int)>
		ArrayList arraylist = new ArrayList();
	//    8   14:new             #66  <Class ArrayList>
	//    9   17:dup             
	//   10   18:invokespecial   #131 <Method void ArrayList()>
	//   11   21:astore_3        
		String s;
		for(Iterator iterator = zapl.keySet().iterator(); iterator.hasNext(); arraylist.add(((Object) (new zaa(s, ((Integer)zapl.get(((Object) (s)))).intValue())))))
	//*  12   22:aload_0         
	//*  13   23:getfield        #53  <Field HashMap zapl>
	//*  14   26:invokevirtual   #135 <Method Set HashMap.keySet()>
	//*  15   29:invokeinterface #141 <Method Iterator Set.iterator()>
	//*  16   34:astore          4
	//*  17   36:aload           4
	//*  18   38:invokeinterface #147 <Method boolean Iterator.hasNext()>
	//*  19   43:ifeq            90
			s = (String)iterator.next();
	//   20   46:aload           4
	//   21   48:invokeinterface #151 <Method Object Iterator.next()>
	//   22   53:checkcast       #105 <Class String>
	//   23   56:astore          5

	//   24   58:aload_3         
	//   25   59:new             #9   <Class StringToIntConverter$zaa>
	//   26   62:dup             
	//   27   63:aload           5
	//   28   65:aload_0         
	//   29   66:getfield        #53  <Field HashMap zapl>
	//   30   69:aload           5
	//   31   71:invokevirtual   #107 <Method Object HashMap.get(Object)>
	//   32   74:checkcast       #90  <Class Integer>
	//   33   77:invokevirtual   #113 <Method int Integer.intValue()>
	//   34   80:invokespecial   #154 <Method void StringToIntConverter$zaa(String, int)>
	//   35   83:invokevirtual   #156 <Method boolean ArrayList.add(Object)>
	//   36   86:pop             
	//*  37   87:goto            36
		SafeParcelWriter.writeTypedList(parcel, 2, ((java.util.List) (arraylist)), false);
	//   38   90:aload_1         
	//   39   91:iconst_2        
	//   40   92:aload_3         
	//   41   93:iconst_0        
	//   42   94:invokestatic    #160 <Method void SafeParcelWriter.writeTypedList(Parcel, int, java.util.List, boolean)>
		SafeParcelWriter.finishObjectHeader(parcel, i);
	//   43   97:aload_1         
	//   44   98:iload_2         
	//   45   99:invokestatic    #163 <Method void SafeParcelWriter.finishObjectHeader(Parcel, int)>
	//   46  102:return          
	}

	public final int zacj()
	{
		return 7;
	//    0    0:bipush          7
	//    1    2:ireturn         
	}

	public final int zack()
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public static final android.os.Parcelable.Creator CREATOR = new zac();
	private final int zale;
	private final HashMap zapl;
	private final SparseArray zapm;
	private final ArrayList zapn;

	static 
	{
	//    0    0:new             #39  <Class zac>
	//    1    3:dup             
	//    2    4:invokespecial   #42  <Method void zac()>
	//    3    7:putstatic       #44  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}

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
//			StringToIntConverterCreator, StringToIntConverterEntryCreator

public final class StringToIntConverter extends AbstractSafeParcelable
	implements com.google.android.gms.common.server.response.FastJsonResponse.FieldConverter
{
	public static final class Entry extends AbstractSafeParcelable
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
			SafeParcelWriter.writeString(parcel, 2, zzwh, false);
		//    8   14:aload_1         
		//    9   15:iconst_2        
		//   10   16:aload_0         
		//   11   17:getfield        #42  <Field String zzwh>
		//   12   20:iconst_0        
		//   13   21:invokestatic    #63  <Method void SafeParcelWriter.writeString(Parcel, int, String, boolean)>
			SafeParcelWriter.writeInt(parcel, 3, zzwi);
		//   14   24:aload_1         
		//   15   25:iconst_3        
		//   16   26:aload_0         
		//   17   27:getfield        #44  <Field int zzwi>
		//   18   30:invokestatic    #59  <Method void SafeParcelWriter.writeInt(Parcel, int, int)>
			SafeParcelWriter.finishObjectHeader(parcel, i);
		//   19   33:aload_1         
		//   20   34:iload_2         
		//   21   35:invokestatic    #66  <Method void SafeParcelWriter.finishObjectHeader(Parcel, int)>
		//   22   38:return          
		}

		public static final android.os.Parcelable.Creator CREATOR = new StringToIntConverterEntryCreator();
		private final int versionCode;
		final String zzwh;
		final int zzwi;

		static 
		{
		//    0    0:new             #28  <Class StringToIntConverterEntryCreator>
		//    1    3:dup             
		//    2    4:invokespecial   #31  <Method void StringToIntConverterEntryCreator()>
		//    3    7:putstatic       #33  <Field android.os.Parcelable$Creator CREATOR>
		//*   4   10:return          
		}

		Entry(int i, String s, int j)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #38  <Method void AbstractSafeParcelable()>
			versionCode = i;
		//    2    4:aload_0         
		//    3    5:iload_1         
		//    4    6:putfield        #40  <Field int versionCode>
			zzwh = s;
		//    5    9:aload_0         
		//    6   10:aload_2         
		//    7   11:putfield        #42  <Field String zzwh>
			zzwi = j;
		//    8   14:aload_0         
		//    9   15:iload_3         
		//   10   16:putfield        #44  <Field int zzwi>
		//   11   19:return          
		}

		Entry(String s, int i)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #38  <Method void AbstractSafeParcelable()>
			versionCode = 1;
		//    2    4:aload_0         
		//    3    5:iconst_1        
		//    4    6:putfield        #40  <Field int versionCode>
			zzwh = s;
		//    5    9:aload_0         
		//    6   10:aload_1         
		//    7   11:putfield        #42  <Field String zzwh>
			zzwi = i;
		//    8   14:aload_0         
		//    9   15:iload_2         
		//   10   16:putfield        #44  <Field int zzwi>
		//   11   19:return          
		}
	}


	public StringToIntConverter()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #45  <Method void AbstractSafeParcelable()>
		zzal = 1;
	//    2    4:aload_0         
	//    3    5:iconst_1        
	//    4    6:putfield        #47  <Field int zzal>
		zzwe = new HashMap();
	//    5    9:aload_0         
	//    6   10:new             #49  <Class HashMap>
	//    7   13:dup             
	//    8   14:invokespecial   #50  <Method void HashMap()>
	//    9   17:putfield        #52  <Field HashMap zzwe>
		zzwf = new SparseArray();
	//   10   20:aload_0         
	//   11   21:new             #54  <Class SparseArray>
	//   12   24:dup             
	//   13   25:invokespecial   #55  <Method void SparseArray()>
	//   14   28:putfield        #57  <Field SparseArray zzwf>
		zzwg = null;
	//   15   31:aload_0         
	//   16   32:aconst_null     
	//   17   33:putfield        #59  <Field ArrayList zzwg>
	//   18   36:return          
	}

	StringToIntConverter(int i, ArrayList arraylist)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #45  <Method void AbstractSafeParcelable()>
		zzal = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #47  <Field int zzal>
		zzwe = new HashMap();
	//    5    9:aload_0         
	//    6   10:new             #49  <Class HashMap>
	//    7   13:dup             
	//    8   14:invokespecial   #50  <Method void HashMap()>
	//    9   17:putfield        #52  <Field HashMap zzwe>
		zzwf = new SparseArray();
	//   10   20:aload_0         
	//   11   21:new             #54  <Class SparseArray>
	//   12   24:dup             
	//   13   25:invokespecial   #55  <Method void SparseArray()>
	//   14   28:putfield        #57  <Field SparseArray zzwf>
		zzwg = null;
	//   15   31:aload_0         
	//   16   32:aconst_null     
	//   17   33:putfield        #59  <Field ArrayList zzwg>
		arraylist = (ArrayList)arraylist;
	//   18   36:aload_2         
	//   19   37:checkcast       #64  <Class ArrayList>
	//   20   40:astore_2        
		int j = arraylist.size();
	//   21   41:aload_2         
	//   22   42:invokevirtual   #68  <Method int ArrayList.size()>
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
	//   31   55:invokevirtual   #72  <Method Object ArrayList.get(int)>
	//   32   58:astore          4
			i++;
	//   33   60:iload_1         
	//   34   61:iconst_1        
	//   35   62:iadd            
	//   36   63:istore_1        
			obj = ((Object) ((Entry)obj));
	//   37   64:aload           4
	//   38   66:checkcast       #9   <Class StringToIntConverter$Entry>
	//   39   69:astore          4
			add(((Entry) (obj)).zzwh, ((Entry) (obj)).zzwi);
	//   40   71:aload_0         
	//   41   72:aload           4
	//   42   74:getfield        #76  <Field String StringToIntConverter$Entry.zzwh>
	//   43   77:aload           4
	//   44   79:getfield        #79  <Field int StringToIntConverter$Entry.zzwi>
	//   45   82:invokevirtual   #83  <Method StringToIntConverter add(String, int)>
	//   46   85:pop             
		}

	//*  47   86:goto            48
	//   48   89:return          
	}

	public final StringToIntConverter add(String s, int i)
	{
		zzwe.put(((Object) (s)), ((Object) (Integer.valueOf(i))));
	//    0    0:aload_0         
	//    1    1:getfield        #52  <Field HashMap zzwe>
	//    2    4:aload_1         
	//    3    5:iload_2         
	//    4    6:invokestatic    #93  <Method Integer Integer.valueOf(int)>
	//    5    9:invokevirtual   #97  <Method Object HashMap.put(Object, Object)>
	//    6   12:pop             
		zzwf.put(i, ((Object) (s)));
	//    7   13:aload_0         
	//    8   14:getfield        #57  <Field SparseArray zzwf>
	//    9   17:iload_2         
	//   10   18:aload_1         
	//   11   19:invokevirtual   #100 <Method void SparseArray.put(int, Object)>
		return this;
	//   12   22:aload_0         
	//   13   23:areturn         
	}

	public final Integer convert(String s)
	{
		Integer integer = (Integer)zzwe.get(((Object) (s)));
	//    0    0:aload_0         
	//    1    1:getfield        #52  <Field HashMap zzwe>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #105 <Method Object HashMap.get(Object)>
	//    4    8:checkcast       #89  <Class Integer>
	//    5   11:astore_2        
		s = ((String) (integer));
	//    6   12:aload_2         
	//    7   13:astore_1        
		if(integer == null)
	//*   8   14:aload_2         
	//*   9   15:ifnonnull       31
			s = ((String) ((Integer)zzwe.get("gms_unknown")));
	//   10   18:aload_0         
	//   11   19:getfield        #52  <Field HashMap zzwe>
	//   12   22:ldc1            #107 <String "gms_unknown">
	//   13   24:invokevirtual   #105 <Method Object HashMap.get(Object)>
	//   14   27:checkcast       #89  <Class Integer>
	//   15   30:astore_1        
		return ((Integer) (s));
	//   16   31:aload_1         
	//   17   32:areturn         
	}

	public final volatile Object convert(Object obj)
	{
		return ((Object) (convert((String)obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #109 <Class String>
	//    3    5:invokevirtual   #111 <Method Integer convert(String)>
	//    4    8:areturn         
	}

	public final volatile Object convertBack(Object obj)
	{
		return ((Object) (convertBack((Integer)obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #89  <Class Integer>
	//    3    5:invokevirtual   #115 <Method String convertBack(Integer)>
	//    4    8:areturn         
	}

	public final String convertBack(Integer integer)
	{
		String s = (String)zzwf.get(integer.intValue());
	//    0    0:aload_0         
	//    1    1:getfield        #57  <Field SparseArray zzwf>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #118 <Method int Integer.intValue()>
	//    4    8:invokevirtual   #119 <Method Object SparseArray.get(int)>
	//    5   11:checkcast       #109 <Class String>
	//    6   14:astore_2        
		integer = ((Integer) (s));
	//    7   15:aload_2         
	//    8   16:astore_1        
		if(s == null)
	//*   9   17:aload_2         
	//*  10   18:ifnonnull       38
		{
			integer = ((Integer) (s));
	//   11   21:aload_2         
	//   12   22:astore_1        
			if(zzwe.containsKey("gms_unknown"))
	//*  13   23:aload_0         
	//*  14   24:getfield        #52  <Field HashMap zzwe>
	//*  15   27:ldc1            #107 <String "gms_unknown">
	//*  16   29:invokevirtual   #123 <Method boolean HashMap.containsKey(Object)>
	//*  17   32:ifeq            38
				integer = "gms_unknown";
	//   18   35:ldc1            #107 <String "gms_unknown">
	//   19   37:astore_1        
		}
		return ((String) (integer));
	//   20   38:aload_1         
	//   21   39:areturn         
	}

	public final int getTypeIn()
	{
		return 7;
	//    0    0:bipush          7
	//    1    2:ireturn         
	}

	public final int getTypeOut()
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public final void writeToParcel(Parcel parcel, int i)
	{
		i = SafeParcelWriter.beginObjectHeader(parcel);
	//    0    0:aload_1         
	//    1    1:invokestatic    #133 <Method int SafeParcelWriter.beginObjectHeader(Parcel)>
	//    2    4:istore_2        
		SafeParcelWriter.writeInt(parcel, 1, zzal);
	//    3    5:aload_1         
	//    4    6:iconst_1        
	//    5    7:aload_0         
	//    6    8:getfield        #47  <Field int zzal>
	//    7   11:invokestatic    #137 <Method void SafeParcelWriter.writeInt(Parcel, int, int)>
		ArrayList arraylist = new ArrayList();
	//    8   14:new             #64  <Class ArrayList>
	//    9   17:dup             
	//   10   18:invokespecial   #138 <Method void ArrayList()>
	//   11   21:astore_3        
		String s;
		for(Iterator iterator = zzwe.keySet().iterator(); iterator.hasNext(); arraylist.add(((Object) (new Entry(s, ((Integer)zzwe.get(((Object) (s)))).intValue())))))
	//*  12   22:aload_0         
	//*  13   23:getfield        #52  <Field HashMap zzwe>
	//*  14   26:invokevirtual   #142 <Method Set HashMap.keySet()>
	//*  15   29:invokeinterface #148 <Method Iterator Set.iterator()>
	//*  16   34:astore          4
	//*  17   36:aload           4
	//*  18   38:invokeinterface #154 <Method boolean Iterator.hasNext()>
	//*  19   43:ifeq            90
			s = (String)iterator.next();
	//   20   46:aload           4
	//   21   48:invokeinterface #158 <Method Object Iterator.next()>
	//   22   53:checkcast       #109 <Class String>
	//   23   56:astore          5

	//   24   58:aload_3         
	//   25   59:new             #9   <Class StringToIntConverter$Entry>
	//   26   62:dup             
	//   27   63:aload           5
	//   28   65:aload_0         
	//   29   66:getfield        #52  <Field HashMap zzwe>
	//   30   69:aload           5
	//   31   71:invokevirtual   #105 <Method Object HashMap.get(Object)>
	//   32   74:checkcast       #89  <Class Integer>
	//   33   77:invokevirtual   #118 <Method int Integer.intValue()>
	//   34   80:invokespecial   #161 <Method void StringToIntConverter$Entry(String, int)>
	//   35   83:invokevirtual   #163 <Method boolean ArrayList.add(Object)>
	//   36   86:pop             
	//*  37   87:goto            36
		SafeParcelWriter.writeTypedList(parcel, 2, ((java.util.List) (arraylist)), false);
	//   38   90:aload_1         
	//   39   91:iconst_2        
	//   40   92:aload_3         
	//   41   93:iconst_0        
	//   42   94:invokestatic    #167 <Method void SafeParcelWriter.writeTypedList(Parcel, int, java.util.List, boolean)>
		SafeParcelWriter.finishObjectHeader(parcel, i);
	//   43   97:aload_1         
	//   44   98:iload_2         
	//   45   99:invokestatic    #170 <Method void SafeParcelWriter.finishObjectHeader(Parcel, int)>
	//   46  102:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new StringToIntConverterCreator();
	private final int zzal;
	private final HashMap zzwe;
	private final SparseArray zzwf;
	private final ArrayList zzwg;

	static 
	{
	//    0    0:new             #38  <Class StringToIntConverterCreator>
	//    1    3:dup             
	//    2    4:invokespecial   #41  <Method void StringToIntConverterCreator()>
	//    3    7:putstatic       #43  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}

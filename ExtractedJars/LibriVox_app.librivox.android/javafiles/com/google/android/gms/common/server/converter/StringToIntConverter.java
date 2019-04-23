// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.server.converter;

import android.os.Parcel;
import android.util.SparseArray;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.c;
import com.google.android.gms.common.server.response.a;
import java.util.*;

// Referenced classes of package com.google.android.gms.common.server.converter:
//			b

public final class StringToIntConverter extends AbstractSafeParcelable
	implements a
{

	public StringToIntConverter()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #27  <Method void AbstractSafeParcelable()>
		a = 1;
	//    2    4:aload_0         
	//    3    5:iconst_1        
	//    4    6:putfield        #29  <Field int a>
		b = new HashMap();
	//    5    9:aload_0         
	//    6   10:new             #31  <Class HashMap>
	//    7   13:dup             
	//    8   14:invokespecial   #32  <Method void HashMap()>
	//    9   17:putfield        #34  <Field HashMap b>
		c = new SparseArray();
	//   10   20:aload_0         
	//   11   21:new             #36  <Class SparseArray>
	//   12   24:dup             
	//   13   25:invokespecial   #37  <Method void SparseArray()>
	//   14   28:putfield        #39  <Field SparseArray c>
		d = null;
	//   15   31:aload_0         
	//   16   32:aconst_null     
	//   17   33:putfield        #41  <Field ArrayList d>
	//   18   36:return          
	}

	StringToIntConverter(int i, ArrayList arraylist)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #27  <Method void AbstractSafeParcelable()>
		a = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #29  <Field int a>
		b = new HashMap();
	//    5    9:aload_0         
	//    6   10:new             #31  <Class HashMap>
	//    7   13:dup             
	//    8   14:invokespecial   #32  <Method void HashMap()>
	//    9   17:putfield        #34  <Field HashMap b>
		c = new SparseArray();
	//   10   20:aload_0         
	//   11   21:new             #36  <Class SparseArray>
	//   12   24:dup             
	//   13   25:invokespecial   #37  <Method void SparseArray()>
	//   14   28:putfield        #39  <Field SparseArray c>
		d = null;
	//   15   31:aload_0         
	//   16   32:aconst_null     
	//   17   33:putfield        #41  <Field ArrayList d>
		arraylist = (ArrayList)arraylist;
	//   18   36:aload_2         
	//   19   37:checkcast       #44  <Class ArrayList>
	//   20   40:astore_2        
		int j = arraylist.size();
	//   21   41:aload_2         
	//   22   42:invokevirtual   #48  <Method int ArrayList.size()>
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
	//   31   55:invokevirtual   #52  <Method Object ArrayList.get(int)>
	//   32   58:astore          4
			i++;
	//   33   60:iload_1         
	//   34   61:iconst_1        
	//   35   62:iadd            
	//   36   63:istore_1        
			obj = ((Object) ((zaa)obj));
	//   37   64:aload           4
	//   38   66:checkcast       #54  <Class StringToIntConverter$zaa>
	//   39   69:astore          4
			a(((zaa) (obj)).a, ((zaa) (obj)).b);
	//   40   71:aload_0         
	//   41   72:aload           4
	//   42   74:getfield        #57  <Field String com.google.android.gms.common.server.converter.StringToIntConverter$zaa.a>
	//   43   77:aload           4
	//   44   79:getfield        #59  <Field int StringToIntConverter$zaa.b>
	//   45   82:invokevirtual   #62  <Method StringToIntConverter a(String, int)>
	//   46   85:pop             
		}

	//*  47   86:goto            48
	//   48   89:return          
	}

	public final StringToIntConverter a(String s, int i)
	{
		b.put(((Object) (s)), ((Object) (Integer.valueOf(i))));
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field HashMap b>
	//    2    4:aload_1         
	//    3    5:iload_2         
	//    4    6:invokestatic    #68  <Method Integer Integer.valueOf(int)>
	//    5    9:invokevirtual   #72  <Method Object HashMap.put(Object, Object)>
	//    6   12:pop             
		c.put(i, ((Object) (s)));
	//    7   13:aload_0         
	//    8   14:getfield        #39  <Field SparseArray c>
	//    9   17:iload_2         
	//   10   18:aload_1         
	//   11   19:invokevirtual   #75  <Method void SparseArray.put(int, Object)>
		return this;
	//   12   22:aload_0         
	//   13   23:areturn         
	}

	public final Object a(Object obj)
	{
		obj = ((Object) ((Integer)obj));
	//    0    0:aload_1         
	//    1    1:checkcast       #64  <Class Integer>
	//    2    4:astore_1        
		obj = ((Object) ((String)c.get(((Integer) (obj)).intValue())));
	//    3    5:aload_0         
	//    4    6:getfield        #39  <Field SparseArray c>
	//    5    9:aload_1         
	//    6   10:invokevirtual   #79  <Method int Integer.intValue()>
	//    7   13:invokevirtual   #80  <Method Object SparseArray.get(int)>
	//    8   16:checkcast       #82  <Class String>
	//    9   19:astore_1        
		if(obj == null && b.containsKey("gms_unknown"))
	//*  10   20:aload_1         
	//*  11   21:ifnonnull       39
	//*  12   24:aload_0         
	//*  13   25:getfield        #34  <Field HashMap b>
	//*  14   28:ldc1            #84  <String "gms_unknown">
	//*  15   30:invokevirtual   #88  <Method boolean HashMap.containsKey(Object)>
	//*  16   33:ifeq            39
			return ((Object) ("gms_unknown"));
	//   17   36:ldc1            #84  <String "gms_unknown">
	//   18   38:areturn         
		else
			return obj;
	//   19   39:aload_1         
	//   20   40:areturn         
	}

	public final void writeToParcel(Parcel parcel, int i)
	{
		i = com.google.android.gms.common.internal.safeparcel.c.a(parcel);
	//    0    0:aload_1         
	//    1    1:invokestatic    #95  <Method int c.a(Parcel)>
	//    2    4:istore_2        
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 1, a);
	//    3    5:aload_1         
	//    4    6:iconst_1        
	//    5    7:aload_0         
	//    6    8:getfield        #29  <Field int a>
	//    7   11:invokestatic    #98  <Method void c.a(Parcel, int, int)>
		ArrayList arraylist = new ArrayList();
	//    8   14:new             #44  <Class ArrayList>
	//    9   17:dup             
	//   10   18:invokespecial   #99  <Method void ArrayList()>
	//   11   21:astore_3        
		String s;
		for(Iterator iterator = b.keySet().iterator(); iterator.hasNext(); arraylist.add(((Object) (new zaa(s, ((Integer)b.get(((Object) (s)))).intValue())))))
	//*  12   22:aload_0         
	//*  13   23:getfield        #34  <Field HashMap b>
	//*  14   26:invokevirtual   #103 <Method Set HashMap.keySet()>
	//*  15   29:invokeinterface #109 <Method Iterator Set.iterator()>
	//*  16   34:astore          4
	//*  17   36:aload           4
	//*  18   38:invokeinterface #115 <Method boolean Iterator.hasNext()>
	//*  19   43:ifeq            90
			s = (String)iterator.next();
	//   20   46:aload           4
	//   21   48:invokeinterface #119 <Method Object Iterator.next()>
	//   22   53:checkcast       #82  <Class String>
	//   23   56:astore          5

	//   24   58:aload_3         
	//   25   59:new             #54  <Class StringToIntConverter$zaa>
	//   26   62:dup             
	//   27   63:aload           5
	//   28   65:aload_0         
	//   29   66:getfield        #34  <Field HashMap b>
	//   30   69:aload           5
	//   31   71:invokevirtual   #121 <Method Object HashMap.get(Object)>
	//   32   74:checkcast       #64  <Class Integer>
	//   33   77:invokevirtual   #79  <Method int Integer.intValue()>
	//   34   80:invokespecial   #124 <Method void StringToIntConverter$zaa(String, int)>
	//   35   83:invokevirtual   #127 <Method boolean ArrayList.add(Object)>
	//   36   86:pop             
	//*  37   87:goto            36
		com.google.android.gms.common.internal.safeparcel.c.c(parcel, 2, ((java.util.List) (arraylist)), false);
	//   38   90:aload_1         
	//   39   91:iconst_2        
	//   40   92:aload_3         
	//   41   93:iconst_0        
	//   42   94:invokestatic    #130 <Method void c.c(Parcel, int, java.util.List, boolean)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, i);
	//   43   97:aload_1         
	//   44   98:iload_2         
	//   45   99:invokestatic    #132 <Method void c.a(Parcel, int)>
	//   46  102:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new b();
	private final int a;
	private final HashMap b;
	private final SparseArray c;
	private final ArrayList d;

	static 
	{
	//    0    0:new             #20  <Class b>
	//    1    3:dup             
	//    2    4:invokespecial   #23  <Method void b()>
	//    3    7:putstatic       #25  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}

	private class zaa extends AbstractSafeParcelable
	{

		public final void writeToParcel(Parcel parcel, int i)
		{
			i = com.google.android.gms.common.internal.safeparcel.c.a(parcel);
		//    0    0:aload_1         
		//    1    1:invokestatic    #37  <Method int c.a(Parcel)>
		//    2    4:istore_2        
			com.google.android.gms.common.internal.safeparcel.c.a(parcel, 1, c);
		//    3    5:aload_1         
		//    4    6:iconst_1        
		//    5    7:aload_0         
		//    6    8:getfield        #25  <Field int c>
		//    7   11:invokestatic    #40  <Method void c.a(Parcel, int, int)>
			com.google.android.gms.common.internal.safeparcel.c.a(parcel, 2, a, false);
		//    8   14:aload_1         
		//    9   15:iconst_2        
		//   10   16:aload_0         
		//   11   17:getfield        #27  <Field String a>
		//   12   20:iconst_0        
		//   13   21:invokestatic    #43  <Method void c.a(Parcel, int, String, boolean)>
			com.google.android.gms.common.internal.safeparcel.c.a(parcel, 3, b);
		//   14   24:aload_1         
		//   15   25:iconst_3        
		//   16   26:aload_0         
		//   17   27:getfield        #29  <Field int b>
		//   18   30:invokestatic    #40  <Method void c.a(Parcel, int, int)>
			com.google.android.gms.common.internal.safeparcel.c.a(parcel, i);
		//   19   33:aload_1         
		//   20   34:iload_2         
		//   21   35:invokestatic    #45  <Method void c.a(Parcel, int)>
		//   22   38:return          
		}

		public static final android.os.Parcelable.Creator CREATOR = new com.google.android.gms.common.server.converter.c();
		final String a;
		final int b;
		private final int c;

		static 
		{
		//    0    0:new             #15  <Class com.google.android.gms.common.server.converter.c>
		//    1    3:dup             
		//    2    4:invokespecial   #18  <Method void com.google.android.gms.common.server.converter.c()>
		//    3    7:putstatic       #20  <Field android.os.Parcelable$Creator CREATOR>
		//*   4   10:return          
		}

		zaa(int i, String s, int j)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #23  <Method void AbstractSafeParcelable()>
			c = i;
		//    2    4:aload_0         
		//    3    5:iload_1         
		//    4    6:putfield        #25  <Field int c>
			a = s;
		//    5    9:aload_0         
		//    6   10:aload_2         
		//    7   11:putfield        #27  <Field String a>
			b = j;
		//    8   14:aload_0         
		//    9   15:iload_3         
		//   10   16:putfield        #29  <Field int b>
		//   11   19:return          
		}

		zaa(String s, int i)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #23  <Method void AbstractSafeParcelable()>
			c = 1;
		//    2    4:aload_0         
		//    3    5:iconst_1        
		//    4    6:putfield        #25  <Field int c>
			a = s;
		//    5    9:aload_0         
		//    6   10:aload_1         
		//    7   11:putfield        #27  <Field String a>
			b = i;
		//    8   14:aload_0         
		//    9   15:iload_2         
		//   10   16:putfield        #29  <Field int b>
		//   11   19:return          
		}
	}

}

// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.server.response;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.c;
import java.util.*;

// Referenced classes of package com.google.android.gms.common.server.response:
//			e, zam

public final class zal extends AbstractSafeParcelable
{

	zal(int i, String s, ArrayList arraylist)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #24  <Method void AbstractSafeParcelable()>
		c = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #26  <Field int c>
		a = s;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #28  <Field String a>
		b = arraylist;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #30  <Field ArrayList b>
	//   11   19:return          
	}

	zal(String s, Map map)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #24  <Method void AbstractSafeParcelable()>
		c = 1;
	//    2    4:aload_0         
	//    3    5:iconst_1        
	//    4    6:putfield        #26  <Field int c>
		a = s;
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:putfield        #28  <Field String a>
		if(map == null)
	//*   8   14:aload_2         
	//*   9   15:ifnonnull       23
		{
			s = null;
	//   10   18:aconst_null     
	//   11   19:astore_1        
		} else
	//*  12   20:goto            93
		{
			ArrayList arraylist = new ArrayList();
	//   13   23:new             #33  <Class ArrayList>
	//   14   26:dup             
	//   15   27:invokespecial   #34  <Method void ArrayList()>
	//   16   30:astore_3        
			Iterator iterator = map.keySet().iterator();
	//   17   31:aload_2         
	//   18   32:invokeinterface #40  <Method Set Map.keySet()>
	//   19   37:invokeinterface #46  <Method Iterator Set.iterator()>
	//   20   42:astore          4
			do
			{
				s = ((String) (arraylist));
	//   21   44:aload_3         
	//   22   45:astore_1        
				if(!iterator.hasNext())
					break;
	//   23   46:aload           4
	//   24   48:invokeinterface #52  <Method boolean Iterator.hasNext()>
	//   25   53:ifeq            93
				s = (String)iterator.next();
	//   26   56:aload           4
	//   27   58:invokeinterface #56  <Method Object Iterator.next()>
	//   28   63:checkcast       #58  <Class String>
	//   29   66:astore_1        
				arraylist.add(((Object) (new zam(s, (FastJsonResponse.Field)map.get(((Object) (s)))))));
	//   30   67:aload_3         
	//   31   68:new             #60  <Class zam>
	//   32   71:dup             
	//   33   72:aload_1         
	//   34   73:aload_2         
	//   35   74:aload_1         
	//   36   75:invokeinterface #64  <Method Object Map.get(Object)>
	//   37   80:checkcast       #66  <Class FastJsonResponse$Field>
	//   38   83:invokespecial   #69  <Method void zam(String, FastJsonResponse$Field)>
	//   39   86:invokevirtual   #73  <Method boolean ArrayList.add(Object)>
	//   40   89:pop             
			} while(true);
	//   41   90:goto            44
		}
		b = ((ArrayList) (s));
	//   42   93:aload_0         
	//   43   94:aload_1         
	//   44   95:putfield        #30  <Field ArrayList b>
	//   45   98:return          
	}

	public final void writeToParcel(Parcel parcel, int i)
	{
		i = com.google.android.gms.common.internal.safeparcel.c.a(parcel);
	//    0    0:aload_1         
	//    1    1:invokestatic    #80  <Method int c.a(Parcel)>
	//    2    4:istore_2        
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 1, c);
	//    3    5:aload_1         
	//    4    6:iconst_1        
	//    5    7:aload_0         
	//    6    8:getfield        #26  <Field int c>
	//    7   11:invokestatic    #83  <Method void c.a(Parcel, int, int)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 2, a, false);
	//    8   14:aload_1         
	//    9   15:iconst_2        
	//   10   16:aload_0         
	//   11   17:getfield        #28  <Field String a>
	//   12   20:iconst_0        
	//   13   21:invokestatic    #86  <Method void c.a(Parcel, int, String, boolean)>
		com.google.android.gms.common.internal.safeparcel.c.c(parcel, 3, ((java.util.List) (b)), false);
	//   14   24:aload_1         
	//   15   25:iconst_3        
	//   16   26:aload_0         
	//   17   27:getfield        #30  <Field ArrayList b>
	//   18   30:iconst_0        
	//   19   31:invokestatic    #89  <Method void c.c(Parcel, int, java.util.List, boolean)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, i);
	//   20   34:aload_1         
	//   21   35:iload_2         
	//   22   36:invokestatic    #91  <Method void c.a(Parcel, int)>
	//   23   39:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new e();
	final String a;
	final ArrayList b;
	private final int c;

	static 
	{
	//    0    0:new             #16  <Class e>
	//    1    3:dup             
	//    2    4:invokespecial   #19  <Method void e()>
	//    3    7:putstatic       #21  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}

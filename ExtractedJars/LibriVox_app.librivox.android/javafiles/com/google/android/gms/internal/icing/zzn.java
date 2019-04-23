// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.icing;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.internal.ak;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.c;
import java.util.*;

// Referenced classes of package com.google.android.gms.internal.icing:
//			fj

public final class zzn extends AbstractSafeParcelable
{

	zzn(int i, Bundle bundle)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #22  <Method void AbstractSafeParcelable()>
		a = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #24  <Field int a>
		b = bundle;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #26  <Field Bundle b>
	//    8   14:return          
	}

	public final boolean equals(Object obj)
	{
		if(this == obj)
	//*   0    0:aload_0         
	//*   1    1:aload_1         
	//*   2    2:if_acmpne       7
			return true;
	//    3    5:iconst_1        
	//    4    6:ireturn         
		if(!(obj instanceof zzn))
	//*   5    7:aload_1         
	//*   6    8:instanceof      #2   <Class zzn>
	//*   7   11:ifne            16
			return false;
	//    8   14:iconst_0        
	//    9   15:ireturn         
		obj = ((Object) ((zzn)obj));
	//   10   16:aload_1         
	//   11   17:checkcast       #2   <Class zzn>
	//   12   20:astore_1        
		if(a != ((zzn) (obj)).a)
	//*  13   21:aload_0         
	//*  14   22:getfield        #24  <Field int a>
	//*  15   25:aload_1         
	//*  16   26:getfield        #24  <Field int a>
	//*  17   29:icmpeq          34
			return false;
	//   18   32:iconst_0        
	//   19   33:ireturn         
		Bundle bundle = b;
	//   20   34:aload_0         
	//   21   35:getfield        #26  <Field Bundle b>
	//   22   38:astore_2        
		if(bundle == null)
	//*  23   39:aload_2         
	//*  24   40:ifnonnull       54
			return ((zzn) (obj)).b == null;
	//   25   43:aload_1         
	//   26   44:getfield        #26  <Field Bundle b>
	//   27   47:ifnonnull       52
	//   28   50:iconst_1        
	//   29   51:ireturn         
	//   30   52:iconst_0        
	//   31   53:ireturn         
		if(((zzn) (obj)).b == null)
	//*  32   54:aload_1         
	//*  33   55:getfield        #26  <Field Bundle b>
	//*  34   58:ifnonnull       63
			return false;
	//   35   61:iconst_0        
	//   36   62:ireturn         
		if(bundle.size() != ((zzn) (obj)).b.size())
	//*  37   63:aload_2         
	//*  38   64:invokevirtual   #34  <Method int Bundle.size()>
	//*  39   67:aload_1         
	//*  40   68:getfield        #26  <Field Bundle b>
	//*  41   71:invokevirtual   #34  <Method int Bundle.size()>
	//*  42   74:icmpeq          79
			return false;
	//   43   77:iconst_0        
	//   44   78:ireturn         
		for(Iterator iterator = b.keySet().iterator(); iterator.hasNext();)
	//*  45   79:aload_0         
	//*  46   80:getfield        #26  <Field Bundle b>
	//*  47   83:invokevirtual   #38  <Method Set Bundle.keySet()>
	//*  48   86:invokeinterface #44  <Method Iterator Set.iterator()>
	//*  49   91:astore_2        
	//*  50   92:aload_2         
	//*  51   93:invokeinterface #50  <Method boolean Iterator.hasNext()>
	//*  52   98:ifeq            146
		{
			String s = (String)iterator.next();
	//   53  101:aload_2         
	//   54  102:invokeinterface #54  <Method Object Iterator.next()>
	//   55  107:checkcast       #56  <Class String>
	//   56  110:astore_3        
			if(!((zzn) (obj)).b.containsKey(s) || !ak.a(((Object) (b.getString(s))), ((Object) (((zzn) (obj)).b.getString(s)))))
	//*  57  111:aload_1         
	//*  58  112:getfield        #26  <Field Bundle b>
	//*  59  115:aload_3         
	//*  60  116:invokevirtual   #60  <Method boolean Bundle.containsKey(String)>
	//*  61  119:ifeq            144
	//*  62  122:aload_0         
	//*  63  123:getfield        #26  <Field Bundle b>
	//*  64  126:aload_3         
	//*  65  127:invokevirtual   #64  <Method String Bundle.getString(String)>
	//*  66  130:aload_1         
	//*  67  131:getfield        #26  <Field Bundle b>
	//*  68  134:aload_3         
	//*  69  135:invokevirtual   #64  <Method String Bundle.getString(String)>
	//*  70  138:invokestatic    #69  <Method boolean ak.a(Object, Object)>
	//*  71  141:ifne            92
				return false;
	//   72  144:iconst_0        
	//   73  145:ireturn         
		}

		return true;
	//   74  146:iconst_1        
	//   75  147:ireturn         
	}

	public final int hashCode()
	{
		ArrayList arraylist = new ArrayList();
	//    0    0:new             #72  <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #73  <Method void ArrayList()>
	//    3    7:astore_1        
		((List) (arraylist)).add(((Object) (Integer.valueOf(a))));
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:getfield        #24  <Field int a>
	//    7   13:invokestatic    #79  <Method Integer Integer.valueOf(int)>
	//    8   16:invokeinterface #84  <Method boolean List.add(Object)>
	//    9   21:pop             
		Object obj = ((Object) (b));
	//   10   22:aload_0         
	//   11   23:getfield        #26  <Field Bundle b>
	//   12   26:astore_2        
		if(obj != null)
	//*  13   27:aload_2         
	//*  14   28:ifnull          86
		{
			String s;
			for(obj = ((Object) (((Bundle) (obj)).keySet().iterator())); ((Iterator) (obj)).hasNext(); ((List) (arraylist)).add(((Object) (b.getString(s)))))
	//*  15   31:aload_2         
	//*  16   32:invokevirtual   #38  <Method Set Bundle.keySet()>
	//*  17   35:invokeinterface #44  <Method Iterator Set.iterator()>
	//*  18   40:astore_2        
	//*  19   41:aload_2         
	//*  20   42:invokeinterface #50  <Method boolean Iterator.hasNext()>
	//*  21   47:ifeq            86
			{
				s = (String)((Iterator) (obj)).next();
	//   22   50:aload_2         
	//   23   51:invokeinterface #54  <Method Object Iterator.next()>
	//   24   56:checkcast       #56  <Class String>
	//   25   59:astore_3        
				((List) (arraylist)).add(((Object) (s)));
	//   26   60:aload_1         
	//   27   61:aload_3         
	//   28   62:invokeinterface #84  <Method boolean List.add(Object)>
	//   29   67:pop             
			}

	//   30   68:aload_1         
	//   31   69:aload_0         
	//   32   70:getfield        #26  <Field Bundle b>
	//   33   73:aload_3         
	//   34   74:invokevirtual   #64  <Method String Bundle.getString(String)>
	//   35   77:invokeinterface #84  <Method boolean List.add(Object)>
	//   36   82:pop             
		}
	//*  37   83:goto            41
		return ak.a(((List) (arraylist)).toArray(new Object[0]));
	//   38   86:aload_1         
	//   39   87:iconst_0        
	//   40   88:anewarray       Object[]
	//   41   91:invokeinterface #90  <Method Object[] List.toArray(Object[])>
	//   42   96:invokestatic    #93  <Method int ak.a(Object[])>
	//   43   99:ireturn         
	}

	public final void writeToParcel(Parcel parcel, int i)
	{
		i = c.a(parcel);
	//    0    0:aload_1         
	//    1    1:invokestatic    #100 <Method int c.a(Parcel)>
	//    2    4:istore_2        
		c.a(parcel, 1, a);
	//    3    5:aload_1         
	//    4    6:iconst_1        
	//    5    7:aload_0         
	//    6    8:getfield        #24  <Field int a>
	//    7   11:invokestatic    #103 <Method void c.a(Parcel, int, int)>
		c.a(parcel, 2, b, false);
	//    8   14:aload_1         
	//    9   15:iconst_2        
	//   10   16:aload_0         
	//   11   17:getfield        #26  <Field Bundle b>
	//   12   20:iconst_0        
	//   13   21:invokestatic    #106 <Method void c.a(Parcel, int, Bundle, boolean)>
		c.a(parcel, i);
	//   14   24:aload_1         
	//   15   25:iload_2         
	//   16   26:invokestatic    #108 <Method void c.a(Parcel, int)>
	//   17   29:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new fj();
	private final int a;
	private final Bundle b;

	static 
	{
	//    0    0:new             #14  <Class fj>
	//    1    3:dup             
	//    2    4:invokespecial   #17  <Method void fj()>
	//    3    7:putstatic       #19  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}

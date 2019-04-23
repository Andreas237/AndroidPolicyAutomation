// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.paypal.android.sdk.payments;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.paypal.android.sdk.l;
import java.util.*;

// Referenced classes of package com.paypal.android.sdk.payments:
//			ar

public final class PayPalOAuthScopes
	implements Parcelable
{

	public PayPalOAuthScopes()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #63  <Method void Object()>
		h = ((List) (new ArrayList()));
	//    2    4:aload_0         
	//    3    5:new             #65  <Class ArrayList>
	//    4    8:dup             
	//    5    9:invokespecial   #66  <Method void ArrayList()>
	//    6   12:putfield        #68  <Field List h>
	//    7   15:return          
	}

	private PayPalOAuthScopes(Parcel parcel)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #63  <Method void Object()>
		h = ((List) (new ArrayList()));
	//    2    4:aload_0         
	//    3    5:new             #65  <Class ArrayList>
	//    4    8:dup             
	//    5    9:invokespecial   #66  <Method void ArrayList()>
	//    6   12:putfield        #68  <Field List h>
		int j = parcel.readInt();
	//    7   15:aload_1         
	//    8   16:invokevirtual   #75  <Method int Parcel.readInt()>
	//    9   19:istore_3        
		for(int i = 0; i < j; i++)
	//*  10   20:iconst_0        
	//*  11   21:istore_2        
	//*  12   22:iload_2         
	//*  13   23:iload_3         
	//*  14   24:icmpge          48
			h.add(((Object) (parcel.readString())));
	//   15   27:aload_0         
	//   16   28:getfield        #68  <Field List h>
	//   17   31:aload_1         
	//   18   32:invokevirtual   #78  <Method String Parcel.readString()>
	//   19   35:invokeinterface #84  <Method boolean List.add(Object)>
	//   20   40:pop             

	//   21   41:iload_2         
	//   22   42:iconst_1        
	//   23   43:iadd            
	//   24   44:istore_2        
	//*  25   45:goto            22
	//   26   48:return          
	}

	PayPalOAuthScopes(Parcel parcel, byte byte0)
	{
		this(parcel);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #87  <Method void PayPalOAuthScopes(Parcel)>
	//    3    5:return          
	}

	public PayPalOAuthScopes(Set set)
	{
		this();
	//    0    0:aload_0         
	//    1    1:invokespecial   #89  <Method void PayPalOAuthScopes()>
		String s;
		for(set = ((Set) (set.iterator())); ((Iterator) (set)).hasNext(); h.add(((Object) (s))))
	//*   2    4:aload_1         
	//*   3    5:invokeinterface #95  <Method Iterator Set.iterator()>
	//*   4   10:astore_1        
	//*   5   11:aload_1         
	//*   6   12:invokeinterface #101 <Method boolean Iterator.hasNext()>
	//*   7   17:ifeq            44
			s = (String)((Iterator) (set)).next();
	//    8   20:aload_1         
	//    9   21:invokeinterface #105 <Method Object Iterator.next()>
	//   10   26:checkcast       #107 <Class String>
	//   11   29:astore_2        

	//   12   30:aload_0         
	//   13   31:getfield        #68  <Field List h>
	//   14   34:aload_2         
	//   15   35:invokeinterface #84  <Method boolean List.add(Object)>
	//   16   40:pop             
	//*  17   41:goto            11
	//   18   44:return          
	}

	final List a()
	{
		return h;
	//    0    0:aload_0         
	//    1    1:getfield        #68  <Field List h>
	//    2    4:areturn         
	}

	final String b()
	{
		return TextUtils.join(" ", ((Iterable) (h)));
	//    0    0:ldc1            #110 <String " ">
	//    1    2:aload_0         
	//    2    3:getfield        #68  <Field List h>
	//    3    6:invokestatic    #116 <Method String TextUtils.join(CharSequence, Iterable)>
	//    4    9:areturn         
	}

	public final int describeContents()
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public final String toString()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #120 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #121 <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append(((Class) (com/paypal/android/sdk/payments/PayPalOAuthScopes)).getSimpleName());
	//    4    8:aload_1         
	//    5    9:ldc1            #2   <Class PayPalOAuthScopes>
	//    6   11:invokevirtual   #126 <Method String Class.getSimpleName()>
	//    7   14:invokevirtual   #130 <Method StringBuilder StringBuilder.append(String)>
	//    8   17:pop             
		stringbuilder.append(": {%s}");
	//    9   18:aload_1         
	//   10   19:ldc1            #132 <String ": {%s}">
	//   11   21:invokevirtual   #130 <Method StringBuilder StringBuilder.append(String)>
	//   12   24:pop             
		return String.format(stringbuilder.toString(), new Object[] {
			h
		});
	//   13   25:aload_1         
	//   14   26:invokevirtual   #134 <Method String StringBuilder.toString()>
	//   15   29:iconst_1        
	//   16   30:anewarray       Object[]
	//   17   33:dup             
	//   18   34:iconst_0        
	//   19   35:aload_0         
	//   20   36:getfield        #68  <Field List h>
	//   21   39:aastore         
	//   22   40:invokestatic    #138 <Method String String.format(String, Object[])>
	//   23   43:areturn         
	}

	public final void writeToParcel(Parcel parcel, int i)
	{
		parcel.writeInt(h.size());
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #68  <Field List h>
	//    3    5:invokeinterface #143 <Method int List.size()>
	//    4   10:invokevirtual   #147 <Method void Parcel.writeInt(int)>
		for(i = 0; i < h.size(); i++)
	//*   5   13:iconst_0        
	//*   6   14:istore_2        
	//*   7   15:iload_2         
	//*   8   16:aload_0         
	//*   9   17:getfield        #68  <Field List h>
	//*  10   20:invokeinterface #143 <Method int List.size()>
	//*  11   25:icmpge          52
			parcel.writeString((String)h.get(i));
	//   12   28:aload_1         
	//   13   29:aload_0         
	//   14   30:getfield        #68  <Field List h>
	//   15   33:iload_2         
	//   16   34:invokeinterface #151 <Method Object List.get(int)>
	//   17   39:checkcast       #107 <Class String>
	//   18   42:invokevirtual   #155 <Method void Parcel.writeString(String)>

	//   19   45:iload_2         
	//   20   46:iconst_1        
	//   21   47:iadd            
	//   22   48:istore_2        
	//*  23   49:goto            15
	//   24   52:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new ar();
	public static final String a;
	public static final String b;
	public static final String c;
	public static final String d;
	public static final String e;
	public static final String f;
	public static final String g;
	private final List h;

	static 
	{
		a = l.a.a();
	//    0    0:getstatic       #25  <Field l l.a>
	//    1    3:invokevirtual   #28  <Method String l.a()>
	//    2    6:putstatic       #30  <Field String a>
		b = l.b.a();
	//    3    9:getstatic       #32  <Field l l.b>
	//    4   12:invokevirtual   #28  <Method String l.a()>
	//    5   15:putstatic       #34  <Field String b>
		c = l.c.a();
	//    6   18:getstatic       #36  <Field l l.c>
	//    7   21:invokevirtual   #28  <Method String l.a()>
	//    8   24:putstatic       #38  <Field String c>
		d = l.e.a();
	//    9   27:getstatic       #40  <Field l l.e>
	//   10   30:invokevirtual   #28  <Method String l.a()>
	//   11   33:putstatic       #42  <Field String d>
		e = l.f.a();
	//   12   36:getstatic       #44  <Field l l.f>
	//   13   39:invokevirtual   #28  <Method String l.a()>
	//   14   42:putstatic       #46  <Field String e>
		f = l.g.a();
	//   15   45:getstatic       #48  <Field l l.g>
	//   16   48:invokevirtual   #28  <Method String l.a()>
	//   17   51:putstatic       #50  <Field String f>
		g = l.d.a();
	//   18   54:getstatic       #52  <Field l l.d>
	//   19   57:invokevirtual   #28  <Method String l.a()>
	//   20   60:putstatic       #54  <Field String g>
	//   21   63:new             #56  <Class ar>
	//   22   66:dup             
	//   23   67:invokespecial   #59  <Method void ar()>
	//   24   70:putstatic       #61  <Field android.os.Parcelable$Creator CREATOR>
	//*  25   73:return          
	}
}

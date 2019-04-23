// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.paypal.android.sdk.payments;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.paypal.android.sdk.cd;
import com.paypal.android.sdk.dj;
import java.math.BigDecimal;

// Referenced classes of package com.paypal.android.sdk.payments:
//			aq

public final class PayPalItem
	implements Parcelable
{

	private PayPalItem(Parcel parcel)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #33  <Method void Object()>
		b = parcel.readString();
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokevirtual   #39  <Method String Parcel.readString()>
	//    5    9:putfield        #41  <Field String b>
		c = Integer.valueOf(parcel.readInt());
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:invokevirtual   #45  <Method int Parcel.readInt()>
	//    9   17:invokestatic    #51  <Method Integer Integer.valueOf(int)>
	//   10   20:putfield        #53  <Field Integer c>
		try
		{
			d = new BigDecimal(parcel.readString());
	//   11   23:aload_0         
	//   12   24:new             #55  <Class BigDecimal>
	//   13   27:dup             
	//   14   28:aload_1         
	//   15   29:invokevirtual   #39  <Method String Parcel.readString()>
	//   16   32:invokespecial   #58  <Method void BigDecimal(String)>
	//   17   35:putfield        #60  <Field BigDecimal d>
		}
	//*  18   38:aload_0         
	//*  19   39:aload_1         
	//*  20   40:invokevirtual   #39  <Method String Parcel.readString()>
	//*  21   43:putfield        #62  <Field String e>
	//*  22   46:aload_0         
	//*  23   47:aload_1         
	//*  24   48:invokevirtual   #39  <Method String Parcel.readString()>
	//*  25   51:putfield        #64  <Field String f>
	//*  26   54:return          
		// Misplaced declaration of an exception variable
		catch(Parcel parcel)
	//*  27   55:astore_1        
		{
			Log.e(a, "bad price", ((Throwable) (parcel)));
	//   28   56:getstatic       #66  <Field String a>
	//   29   59:ldc1            #68  <String "bad price">
	//   30   61:aload_1         
	//   31   62:invokestatic    #73  <Method int Log.e(String, String, Throwable)>
	//   32   65:pop             
			throw new RuntimeException(((Throwable) (parcel)));
	//   33   66:new             #75  <Class RuntimeException>
	//   34   69:dup             
	//   35   70:aload_1         
	//   36   71:invokespecial   #78  <Method void RuntimeException(Throwable)>
	//   37   74:athrow          
		}
		e = parcel.readString();
		f = parcel.readString();
	}

	PayPalItem(Parcel parcel, byte byte0)
	{
		this(parcel);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #81  <Method void PayPalItem(Parcel)>
	//    3    5:return          
	}

	public final boolean a()
	{
		String s;
		if(c.intValue() <= 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #53  <Field Integer c>
	//*   2    4:invokevirtual   #85  <Method int Integer.intValue()>
	//*   3    7:ifgt            22
			s = "item.quantity must be a positive integer.";
	//    4   10:ldc1            #87  <String "item.quantity must be a positive integer.">
	//    5   12:astore_1        
		else
	//*   6   13:ldc1            #89  <String "paypal.sdk">
	//*   7   15:aload_1         
	//*   8   16:invokestatic    #92  <Method int Log.e(String, String)>
	//*   9   19:pop             
	//*  10   20:iconst_0        
	//*  11   21:ireturn         
		if(!dj.a(e))
	//*  12   22:aload_0         
	//*  13   23:getfield        #62  <Field String e>
	//*  14   26:invokestatic    #97  <Method boolean dj.a(String)>
	//*  15   29:ifne            38
			s = "item.currency field is required, and must be a supported currency.";
	//   16   32:ldc1            #99  <String "item.currency field is required, and must be a supported currency.">
	//   17   34:astore_1        
		else
	//*  18   35:goto            13
		if(cd.a(((CharSequence) (b))))
	//*  19   38:aload_0         
	//*  20   39:getfield        #41  <Field String b>
	//*  21   42:invokestatic    #104 <Method boolean cd.a(CharSequence)>
	//*  22   45:ifeq            54
			s = "item.name field is required.";
	//   23   48:ldc1            #106 <String "item.name field is required.">
	//   24   50:astore_1        
		else
	//*  25   51:goto            13
		if(!dj.a(d, e, false))
	//*  26   54:aload_0         
	//*  27   55:getfield        #60  <Field BigDecimal d>
	//*  28   58:aload_0         
	//*  29   59:getfield        #62  <Field String e>
	//*  30   62:iconst_0        
	//*  31   63:invokestatic    #109 <Method boolean dj.a(BigDecimal, String, boolean)>
	//*  32   66:ifne            75
			s = "item.price field is required.";
	//   33   69:ldc1            #111 <String "item.price field is required.">
	//   34   71:astore_1        
		else
	//*  35   72:goto            13
			return true;
	//   36   75:iconst_1        
	//   37   76:ireturn         
		Log.e("paypal.sdk", s);
		return false;
	}

	public final String b()
	{
		return b;
	//    0    0:aload_0         
	//    1    1:getfield        #41  <Field String b>
	//    2    4:areturn         
	}

	public final Integer c()
	{
		return c;
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field Integer c>
	//    2    4:areturn         
	}

	public final BigDecimal d()
	{
		return d;
	//    0    0:aload_0         
	//    1    1:getfield        #60  <Field BigDecimal d>
	//    2    4:areturn         
	}

	public final int describeContents()
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public final String e()
	{
		return e;
	//    0    0:aload_0         
	//    1    1:getfield        #62  <Field String e>
	//    2    4:areturn         
	}

	public final boolean equals(Object obj)
	{
		if(obj == this)
	//*   0    0:aload_1         
	//*   1    1:aload_0         
	//*   2    2:if_acmpne       7
			return true;
	//    3    5:iconst_1        
	//    4    6:ireturn         
		if(!(obj instanceof PayPalItem))
	//*   5    7:aload_1         
	//*   6    8:instanceof      #2   <Class PayPalItem>
	//*   7   11:ifne            16
			return false;
	//    8   14:iconst_0        
	//    9   15:ireturn         
		obj = ((Object) ((PayPalItem)obj));
	//   10   16:aload_1         
	//   11   17:checkcast       #2   <Class PayPalItem>
	//   12   20:astore_1        
		Object obj1 = ((Object) (b()));
	//   13   21:aload_0         
	//   14   22:invokevirtual   #118 <Method String b()>
	//   15   25:astore_2        
		Object obj2 = ((Object) (((PayPalItem) (obj)).b()));
	//   16   26:aload_1         
	//   17   27:invokevirtual   #118 <Method String b()>
	//   18   30:astore_3        
		if(obj1 == null)
	//*  19   31:aload_2         
	//*  20   32:ifnonnull       41
		{
			if(obj2 != null)
	//*  21   35:aload_3         
	//*  22   36:ifnull          51
				return false;
	//   23   39:iconst_0        
	//   24   40:ireturn         
		} else
		if(!obj1.equals(obj2))
	//*  25   41:aload_2         
	//*  26   42:aload_3         
	//*  27   43:invokevirtual   #120 <Method boolean Object.equals(Object)>
	//*  28   46:ifne            51
			return false;
	//   29   49:iconst_0        
	//   30   50:ireturn         
		obj1 = ((Object) (c()));
	//   31   51:aload_0         
	//   32   52:invokevirtual   #122 <Method Integer c()>
	//   33   55:astore_2        
		obj2 = ((Object) (((PayPalItem) (obj)).c()));
	//   34   56:aload_1         
	//   35   57:invokevirtual   #122 <Method Integer c()>
	//   36   60:astore_3        
		if(obj1 == null)
	//*  37   61:aload_2         
	//*  38   62:ifnonnull       71
		{
			if(obj2 != null)
	//*  39   65:aload_3         
	//*  40   66:ifnull          81
				return false;
	//   41   69:iconst_0        
	//   42   70:ireturn         
		} else
		if(!obj1.equals(obj2))
	//*  43   71:aload_2         
	//*  44   72:aload_3         
	//*  45   73:invokevirtual   #120 <Method boolean Object.equals(Object)>
	//*  46   76:ifne            81
			return false;
	//   47   79:iconst_0        
	//   48   80:ireturn         
		obj1 = ((Object) (d()));
	//   49   81:aload_0         
	//   50   82:invokevirtual   #124 <Method BigDecimal d()>
	//   51   85:astore_2        
		obj2 = ((Object) (((PayPalItem) (obj)).d()));
	//   52   86:aload_1         
	//   53   87:invokevirtual   #124 <Method BigDecimal d()>
	//   54   90:astore_3        
		if(obj1 == null)
	//*  55   91:aload_2         
	//*  56   92:ifnonnull       101
		{
			if(obj2 != null)
	//*  57   95:aload_3         
	//*  58   96:ifnull          111
				return false;
	//   59   99:iconst_0        
	//   60  100:ireturn         
		} else
		if(!obj1.equals(obj2))
	//*  61  101:aload_2         
	//*  62  102:aload_3         
	//*  63  103:invokevirtual   #120 <Method boolean Object.equals(Object)>
	//*  64  106:ifne            111
			return false;
	//   65  109:iconst_0        
	//   66  110:ireturn         
		obj1 = ((Object) (e()));
	//   67  111:aload_0         
	//   68  112:invokevirtual   #126 <Method String e()>
	//   69  115:astore_2        
		obj2 = ((Object) (((PayPalItem) (obj)).e()));
	//   70  116:aload_1         
	//   71  117:invokevirtual   #126 <Method String e()>
	//   72  120:astore_3        
		if(obj1 == null)
	//*  73  121:aload_2         
	//*  74  122:ifnonnull       131
		{
			if(obj2 != null)
	//*  75  125:aload_3         
	//*  76  126:ifnull          141
				return false;
	//   77  129:iconst_0        
	//   78  130:ireturn         
		} else
		if(!obj1.equals(obj2))
	//*  79  131:aload_2         
	//*  80  132:aload_3         
	//*  81  133:invokevirtual   #120 <Method boolean Object.equals(Object)>
	//*  82  136:ifne            141
			return false;
	//   83  139:iconst_0        
	//   84  140:ireturn         
		obj1 = ((Object) (f()));
	//   85  141:aload_0         
	//   86  142:invokevirtual   #128 <Method String f()>
	//   87  145:astore_2        
		obj = ((Object) (((PayPalItem) (obj)).f()));
	//   88  146:aload_1         
	//   89  147:invokevirtual   #128 <Method String f()>
	//   90  150:astore_1        
		if(obj1 == null)
	//*  91  151:aload_2         
	//*  92  152:ifnonnull       161
		{
			if(obj != null)
	//*  93  155:aload_1         
	//*  94  156:ifnull          171
				return false;
	//   95  159:iconst_0        
	//   96  160:ireturn         
		} else
		if(!obj1.equals(obj))
	//*  97  161:aload_2         
	//*  98  162:aload_1         
	//*  99  163:invokevirtual   #120 <Method boolean Object.equals(Object)>
	//* 100  166:ifne            171
			return false;
	//  101  169:iconst_0        
	//  102  170:ireturn         
		return true;
	//  103  171:iconst_1        
	//  104  172:ireturn         
	}

	public final String f()
	{
		return f;
	//    0    0:aload_0         
	//    1    1:getfield        #64  <Field String f>
	//    2    4:areturn         
	}

	public final int hashCode()
	{
		Object obj = ((Object) (b()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #118 <Method String b()>
	//    2    4:astore          6
		int i1 = 43;
	//    3    6:bipush          43
	//    4    8:istore          5
		int i;
		if(obj == null)
	//*   5   10:aload           6
	//*   6   12:ifnonnull       21
			i = 43;
	//    7   15:bipush          43
	//    8   17:istore_1        
		else
	//*   9   18:goto            27
			i = obj.hashCode();
	//   10   21:aload           6
	//   11   23:invokevirtual   #131 <Method int Object.hashCode()>
	//   12   26:istore_1        
		obj = ((Object) (c()));
	//   13   27:aload_0         
	//   14   28:invokevirtual   #122 <Method Integer c()>
	//   15   31:astore          6
		int j;
		if(obj == null)
	//*  16   33:aload           6
	//*  17   35:ifnonnull       44
			j = 43;
	//   18   38:bipush          43
	//   19   40:istore_2        
		else
	//*  20   41:goto            50
			j = obj.hashCode();
	//   21   44:aload           6
	//   22   46:invokevirtual   #131 <Method int Object.hashCode()>
	//   23   49:istore_2        
		obj = ((Object) (d()));
	//   24   50:aload_0         
	//   25   51:invokevirtual   #124 <Method BigDecimal d()>
	//   26   54:astore          6
		int k;
		if(obj == null)
	//*  27   56:aload           6
	//*  28   58:ifnonnull       67
			k = 43;
	//   29   61:bipush          43
	//   30   63:istore_3        
		else
	//*  31   64:goto            73
			k = obj.hashCode();
	//   32   67:aload           6
	//   33   69:invokevirtual   #131 <Method int Object.hashCode()>
	//   34   72:istore_3        
		obj = ((Object) (e()));
	//   35   73:aload_0         
	//   36   74:invokevirtual   #126 <Method String e()>
	//   37   77:astore          6
		int l;
		if(obj == null)
	//*  38   79:aload           6
	//*  39   81:ifnonnull       91
			l = 43;
	//   40   84:bipush          43
	//   41   86:istore          4
		else
	//*  42   88:goto            98
			l = obj.hashCode();
	//   43   91:aload           6
	//   44   93:invokevirtual   #131 <Method int Object.hashCode()>
	//   45   96:istore          4
		obj = ((Object) (f()));
	//   46   98:aload_0         
	//   47   99:invokevirtual   #128 <Method String f()>
	//   48  102:astore          6
		if(obj != null)
	//*  49  104:aload           6
	//*  50  106:ifnonnull       112
	//*  51  109:goto            119
			i1 = obj.hashCode();
	//   52  112:aload           6
	//   53  114:invokevirtual   #131 <Method int Object.hashCode()>
	//   54  117:istore          5
		return ((((i + 59) * 59 + j) * 59 + k) * 59 + l) * 59 + i1;
	//   55  119:iload_1         
	//   56  120:bipush          59
	//   57  122:iadd            
	//   58  123:bipush          59
	//   59  125:imul            
	//   60  126:iload_2         
	//   61  127:iadd            
	//   62  128:bipush          59
	//   63  130:imul            
	//   64  131:iload_3         
	//   65  132:iadd            
	//   66  133:bipush          59
	//   67  135:imul            
	//   68  136:iload           4
	//   69  138:iadd            
	//   70  139:bipush          59
	//   71  141:imul            
	//   72  142:iload           5
	//   73  144:iadd            
	//   74  145:ireturn         
	}

	public final String toString()
	{
		StringBuilder stringbuilder = new StringBuilder("PayPalItem(name=");
	//    0    0:new             #134 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:ldc1            #136 <String "PayPalItem(name=">
	//    3    6:invokespecial   #137 <Method void StringBuilder(String)>
	//    4    9:astore_1        
		stringbuilder.append(b());
	//    5   10:aload_1         
	//    6   11:aload_0         
	//    7   12:invokevirtual   #118 <Method String b()>
	//    8   15:invokevirtual   #141 <Method StringBuilder StringBuilder.append(String)>
	//    9   18:pop             
		stringbuilder.append(", quantity=");
	//   10   19:aload_1         
	//   11   20:ldc1            #143 <String ", quantity=">
	//   12   22:invokevirtual   #141 <Method StringBuilder StringBuilder.append(String)>
	//   13   25:pop             
		stringbuilder.append(((Object) (c())));
	//   14   26:aload_1         
	//   15   27:aload_0         
	//   16   28:invokevirtual   #122 <Method Integer c()>
	//   17   31:invokevirtual   #146 <Method StringBuilder StringBuilder.append(Object)>
	//   18   34:pop             
		stringbuilder.append(", price=");
	//   19   35:aload_1         
	//   20   36:ldc1            #148 <String ", price=">
	//   21   38:invokevirtual   #141 <Method StringBuilder StringBuilder.append(String)>
	//   22   41:pop             
		stringbuilder.append(((Object) (d())));
	//   23   42:aload_1         
	//   24   43:aload_0         
	//   25   44:invokevirtual   #124 <Method BigDecimal d()>
	//   26   47:invokevirtual   #146 <Method StringBuilder StringBuilder.append(Object)>
	//   27   50:pop             
		stringbuilder.append(", currency=");
	//   28   51:aload_1         
	//   29   52:ldc1            #150 <String ", currency=">
	//   30   54:invokevirtual   #141 <Method StringBuilder StringBuilder.append(String)>
	//   31   57:pop             
		stringbuilder.append(e());
	//   32   58:aload_1         
	//   33   59:aload_0         
	//   34   60:invokevirtual   #126 <Method String e()>
	//   35   63:invokevirtual   #141 <Method StringBuilder StringBuilder.append(String)>
	//   36   66:pop             
		stringbuilder.append(", sku=");
	//   37   67:aload_1         
	//   38   68:ldc1            #152 <String ", sku=">
	//   39   70:invokevirtual   #141 <Method StringBuilder StringBuilder.append(String)>
	//   40   73:pop             
		stringbuilder.append(f());
	//   41   74:aload_1         
	//   42   75:aload_0         
	//   43   76:invokevirtual   #128 <Method String f()>
	//   44   79:invokevirtual   #141 <Method StringBuilder StringBuilder.append(String)>
	//   45   82:pop             
		stringbuilder.append(")");
	//   46   83:aload_1         
	//   47   84:ldc1            #154 <String ")">
	//   48   86:invokevirtual   #141 <Method StringBuilder StringBuilder.append(String)>
	//   49   89:pop             
		return stringbuilder.toString();
	//   50   90:aload_1         
	//   51   91:invokevirtual   #156 <Method String StringBuilder.toString()>
	//   52   94:areturn         
	}

	public final void writeToParcel(Parcel parcel, int i)
	{
		parcel.writeString(b);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #41  <Field String b>
	//    3    5:invokevirtual   #161 <Method void Parcel.writeString(String)>
		parcel.writeInt(c.intValue());
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:getfield        #53  <Field Integer c>
	//    7   13:invokevirtual   #85  <Method int Integer.intValue()>
	//    8   16:invokevirtual   #165 <Method void Parcel.writeInt(int)>
		parcel.writeString(d.toString());
	//    9   19:aload_1         
	//   10   20:aload_0         
	//   11   21:getfield        #60  <Field BigDecimal d>
	//   12   24:invokevirtual   #166 <Method String BigDecimal.toString()>
	//   13   27:invokevirtual   #161 <Method void Parcel.writeString(String)>
		parcel.writeString(e);
	//   14   30:aload_1         
	//   15   31:aload_0         
	//   16   32:getfield        #62  <Field String e>
	//   17   35:invokevirtual   #161 <Method void Parcel.writeString(String)>
		parcel.writeString(f);
	//   18   38:aload_1         
	//   19   39:aload_0         
	//   20   40:getfield        #64  <Field String f>
	//   21   43:invokevirtual   #161 <Method void Parcel.writeString(String)>
	//   22   46:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new aq();
	private static final String a = "PayPalItem";
	private final String b;
	private final Integer c;
	private final BigDecimal d;
	private final String e;
	private final String f;

	static 
	{
	//    0    0:new             #23  <Class aq>
	//    1    3:dup             
	//    2    4:invokespecial   #26  <Method void aq()>
	//    3    7:putstatic       #28  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}

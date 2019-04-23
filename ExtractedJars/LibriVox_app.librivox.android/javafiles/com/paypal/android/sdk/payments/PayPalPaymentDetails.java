// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.paypal.android.sdk.payments;

import android.os.Parcel;
import android.os.Parcelable;
import java.math.BigDecimal;

// Referenced classes of package com.paypal.android.sdk.payments:
//			at

public final class PayPalPaymentDetails
	implements Parcelable
{

	private PayPalPaymentDetails(Parcel parcel)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #30  <Method void Object()>
		Object obj;
		Object obj1;
		try
		{
			obj = ((Object) (parcel.readString()));
	//    2    4:aload_1         
	//    3    5:invokevirtual   #36  <Method String Parcel.readString()>
	//    4    8:astore_2        
		}
	//*   5    9:aconst_null     
	//*   6   10:astore_3        
	//*   7   11:aload_2         
	//*   8   12:ifnonnull       20
	//*   9   15:aconst_null     
	//*  10   16:astore_2        
	//*  11   17:goto            29
	//*  12   20:new             #38  <Class BigDecimal>
	//*  13   23:dup             
	//*  14   24:aload_2         
	//*  15   25:invokespecial   #41  <Method void BigDecimal(String)>
	//*  16   28:astore_2        
	//*  17   29:aload_0         
	//*  18   30:aload_2         
	//*  19   31:putfield        #43  <Field BigDecimal c>
	//*  20   34:aload_1         
	//*  21   35:invokevirtual   #36  <Method String Parcel.readString()>
	//*  22   38:astore_2        
	//*  23   39:aload_2         
	//*  24   40:ifnonnull       48
	//*  25   43:aconst_null     
	//*  26   44:astore_2        
	//*  27   45:goto            57
	//*  28   48:new             #38  <Class BigDecimal>
	//*  29   51:dup             
	//*  30   52:aload_2         
	//*  31   53:invokespecial   #41  <Method void BigDecimal(String)>
	//*  32   56:astore_2        
	//*  33   57:aload_0         
	//*  34   58:aload_2         
	//*  35   59:putfield        #45  <Field BigDecimal b>
	//*  36   62:aload_1         
	//*  37   63:invokevirtual   #36  <Method String Parcel.readString()>
	//*  38   66:astore_1        
	//*  39   67:aload_1         
	//*  40   68:ifnonnull       76
	//*  41   71:aload_3         
	//*  42   72:astore_1        
	//*  43   73:goto            85
	//*  44   76:new             #38  <Class BigDecimal>
	//*  45   79:dup             
	//*  46   80:aload_1         
	//*  47   81:invokespecial   #41  <Method void BigDecimal(String)>
	//*  48   84:astore_1        
	//*  49   85:aload_0         
	//*  50   86:aload_1         
	//*  51   87:putfield        #47  <Field BigDecimal d>
	//*  52   90:return          
	//*  53   91:new             #49  <Class RuntimeException>
	//*  54   94:dup             
	//*  55   95:ldc1            #51  <String "error unparceling PayPalPaymentDetails">
	//*  56   97:invokespecial   #52  <Method void RuntimeException(String)>
	//*  57  100:athrow          
		// Misplaced declaration of an exception variable
		catch(Parcel parcel)
		{
			throw new RuntimeException("error unparceling PayPalPaymentDetails");
		}
		obj1 = null;
		if(obj == null)
		{
			obj = null;
			break MISSING_BLOCK_LABEL_29;
		}
		obj = ((Object) (new BigDecimal(((String) (obj)))));
		c = ((BigDecimal) (obj));
		obj = ((Object) (parcel.readString()));
		if(obj == null)
		{
			obj = null;
			break MISSING_BLOCK_LABEL_57;
		}
		obj = ((Object) (new BigDecimal(((String) (obj)))));
		b = ((BigDecimal) (obj));
		parcel = ((Parcel) (parcel.readString()));
		if(parcel == null)
		{
			parcel = ((Parcel) (obj1));
			break MISSING_BLOCK_LABEL_85;
		}
		parcel = ((Parcel) (new BigDecimal(((String) (parcel)))));
		d = ((BigDecimal) (parcel));
		return;
	//*  58  101:astore_1        
	//*  59  102:goto            91
	}

	PayPalPaymentDetails(Parcel parcel, byte byte0)
	{
		this(parcel);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #55  <Method void PayPalPaymentDetails(Parcel)>
	//    3    5:return          
	}

	public final boolean a()
	{
		return b != null;
	//    0    0:aload_0         
	//    1    1:getfield        #45  <Field BigDecimal b>
	//    2    4:ifnull          9
	//    3    7:iconst_1        
	//    4    8:ireturn         
	//    5    9:iconst_0        
	//    6   10:ireturn         
	}

	public final BigDecimal b()
	{
		return b;
	//    0    0:aload_0         
	//    1    1:getfield        #45  <Field BigDecimal b>
	//    2    4:areturn         
	}

	public final BigDecimal c()
	{
		return c;
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field BigDecimal c>
	//    2    4:areturn         
	}

	public final BigDecimal d()
	{
		return d;
	//    0    0:aload_0         
	//    1    1:getfield        #47  <Field BigDecimal d>
	//    2    4:areturn         
	}

	public final int describeContents()
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public final void writeToParcel(Parcel parcel, int i)
	{
		Object obj = ((Object) (c));
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field BigDecimal c>
	//    2    4:astore_3        
		Object obj1 = null;
	//    3    5:aconst_null     
	//    4    6:astore          4
		if(obj == null)
	//*   5    8:aload_3         
	//*   6    9:ifnonnull       17
			obj = null;
	//    7   12:aconst_null     
	//    8   13:astore_3        
		else
	//*   9   14:goto            22
			obj = ((Object) (((BigDecimal) (obj)).toString()));
	//   10   17:aload_3         
	//   11   18:invokevirtual   #64  <Method String BigDecimal.toString()>
	//   12   21:astore_3        
		parcel.writeString(((String) (obj)));
	//   13   22:aload_1         
	//   14   23:aload_3         
	//   15   24:invokevirtual   #67  <Method void Parcel.writeString(String)>
		obj = ((Object) (b));
	//   16   27:aload_0         
	//   17   28:getfield        #45  <Field BigDecimal b>
	//   18   31:astore_3        
		if(obj == null)
	//*  19   32:aload_3         
	//*  20   33:ifnonnull       41
			obj = null;
	//   21   36:aconst_null     
	//   22   37:astore_3        
		else
	//*  23   38:goto            46
			obj = ((Object) (((BigDecimal) (obj)).toString()));
	//   24   41:aload_3         
	//   25   42:invokevirtual   #64  <Method String BigDecimal.toString()>
	//   26   45:astore_3        
		parcel.writeString(((String) (obj)));
	//   27   46:aload_1         
	//   28   47:aload_3         
	//   29   48:invokevirtual   #67  <Method void Parcel.writeString(String)>
		obj = ((Object) (d));
	//   30   51:aload_0         
	//   31   52:getfield        #47  <Field BigDecimal d>
	//   32   55:astore_3        
		if(obj == null)
	//*  33   56:aload_3         
	//*  34   57:ifnonnull       66
			obj = ((Object) (obj1));
	//   35   60:aload           4
	//   36   62:astore_3        
		else
	//*  37   63:goto            71
			obj = ((Object) (((BigDecimal) (obj)).toString()));
	//   38   66:aload_3         
	//   39   67:invokevirtual   #64  <Method String BigDecimal.toString()>
	//   40   70:astore_3        
		parcel.writeString(((String) (obj)));
	//   41   71:aload_1         
	//   42   72:aload_3         
	//   43   73:invokevirtual   #67  <Method void Parcel.writeString(String)>
	//   44   76:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new at();
	private static final String a = "PayPalPaymentDetails";
	private BigDecimal b;
	private BigDecimal c;
	private BigDecimal d;

	static 
	{
	//    0    0:new             #20  <Class at>
	//    1    3:dup             
	//    2    4:invokespecial   #23  <Method void at()>
	//    3    7:putstatic       #25  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
